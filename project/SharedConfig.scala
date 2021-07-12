import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import com.jsuereth.sbtpgp.SbtPgp.autoImport._
import sbtrelease.ReleasePlugin.autoImport._
import sbtrelease.ReleaseStateTransformations._
import xerial.sbt.Sonatype.SonatypeKeys._

object SharedConfig {
  val libraryName = "aws-sdk-scalajs-facade"

  val scala213Version = "2.13.6"
  val scala212Version = "2.12.14"

  val settings = Seq(
    scalacOptions ++= Seq("-deprecation"),
    scalaJSLinkerConfig ~= {
      val isCI = Option(System.getenv("CI")).exists(_.contains("true"))
      _.withBatchMode(isCI)
        .withSourceMap(false)
        .withModuleKind(ModuleKind.CommonJSModule)
    },
    licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt")),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/exoego/aws-sdk-scalajs-facade"),
        "scm:git:git@github.com:exoego/aws-sdk-scalajs-facade.git"
      )
    ),
    libraryDependencies ++= Seq(
      Dependencies.shared.scalatest.value,
      Dependencies.shared.scalatestHelper.value
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
    publishTo in ThisBuild := sonatypePublishToBundle.value,
    publishMavenStyle := true,
    publishArtifact in Test := false,
    publishArtifact in (Compile, packageDoc) := true,
    publishArtifact in (Compile, packageSrc) := true,
    pomIncludeRepository := { _ =>
      false
    },
    sonatypeTimeoutMillis := 3 * 60 * 60 * 1000,
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
      runClean,
      releaseStepCommandAndRemaining("+publishSigned"),
      releaseStepCommand("sonatypeBundleRelease"),
      setNextVersion,
      commitNextVersion
    )
  )

  val noPublishingSettings = Seq(
    publish := {},
    publishLocal := {},
    publishArtifact := false,
    publishArtifact in (Compile, packageDoc) := false,
    publishArtifact in (Compile, packageSrc) := false
  )
}
