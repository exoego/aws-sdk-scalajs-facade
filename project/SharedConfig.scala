import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin._
import sbtrelease.ReleasePlugin.autoImport._
import sbtrelease.ReleaseStateTransformations._
import autoImport._
import com.typesafe.sbt.pgp.PgpKeys
import xerial.sbt.Sonatype.SonatypeKeys

object SharedConfig {
  val libraryName = "aws-sdk-scalajs-facade"

  val settings = Seq(
    scalacOptions ++= Seq("-P:scalajs:sjsDefinedByDefault", "-deprecation"),
    scalaJSModuleKind := ModuleKind.CommonJSModule,
    scalaJSLinkerConfig ~= {
      val isCI = Option(System.getenv("CI")).exists(_.contains("true"))
      _.withBatchMode(isCI).withSourceMap(false)
    },
    licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt")),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/exoego/aws-sdk-scalajs-facade"),
        "scm:git:git@github.com:exoego/aws-sdk-scalajs-facade.git"
      )
    ),
    homepage := scmInfo.value.map(_.browseUrl),
    developers := List(
      Developer(
        id = "exoego",
        name = "TATSUNO Yasuhiro",
        email = "ytatsuno.jp@gmail.com",
        url = url("https://www.exoego.net")
      )
    )
  )

  val publishSetting = Seq(
    publishTo in ThisBuild := SonatypeKeys.sonatypePublishToBundle.value,
    publishMavenStyle := true,
    publishArtifact in Test := false,
    publishArtifact in (Compile, packageDoc) := true,
    publishArtifact in (Compile, packageSrc) := true,
    pomIncludeRepository := { _ =>
      false
    },
    publishConfiguration := publishConfiguration.value.withOverwrite(true),
    publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),
    publishArtifact in packageDoc := false,
    sources in (Compile, doc) := Seq.empty,
    releasePublishArtifactsAction := PgpKeys.publishSigned.value,
    releaseProcess := Seq[ReleaseStep](
      checkSnapshotDependencies,
      inquireVersions,
      //  runTest,
      setReleaseVersion,
      commitReleaseVersion,
      tagRelease,
      runClean,
      releaseStepCommandAndRemaining("+publishSigned"),
      releaseStepCommand("sonatypeBundleRelease"),
      setNextVersion,
      commitNextVersion
    ),
    skip in packageJSDependencies := false
  )

  val noPublishingSettings = Seq(
    publish := {},
    publishLocal := {},
    publishArtifact := false,
    publishArtifact in (Compile, packageDoc) := false,
    publishArtifact in (Compile, packageSrc) := false
  )
}
