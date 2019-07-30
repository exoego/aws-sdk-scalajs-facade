//import sbt._
//import Keys._
//import org.scalajs.sbtplugin.ScalaJSPlugin._
//import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
//import sbtrelease.ReleasePlugin.autoImport._
import sbtrelease.ReleaseStateTransformations._
//
//// see https://github.com/scala-js/scala-js/issues/1331
//import autoImport._

licenses in ThisBuild := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
scmInfo in ThisBuild := Some(
  ScmInfo(
    url("https://github.com/exoego/aws-sdk-scalajs-facade"),
    "scm:git:git@github.com:exoego/aws-sdk-scalajs-facade.git"
  )
)
homepage in ThisBuild := scmInfo.value.map(_.browseUrl)
developers in ThisBuild := List(
  Developer(
    id = "exoego",
    name = "TATSUNO Yasuhiro",
    email = "ytatsuno.jp@gmail.com",
    url = url("https://exoego.net")
  )
)
publishMavenStyle in ThisBuild := true
publishArtifact in Test in ThisBuild := false
publishArtifact in (Compile, packageDoc) in ThisBuild := true
publishArtifact in (Compile, packageSrc) in ThisBuild := true
pomIncludeRepository := { _ =>
  false
}
publishTo in ThisBuild := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)
publishConfiguration in ThisBuild := publishConfiguration.value.withOverwrite(true)
publishLocalConfiguration in ThisBuild := publishLocalConfiguration.value.withOverwrite(true)
publishArtifact in packageDoc in ThisBuild := false
sources in (Compile, doc) in ThisBuild := Seq.empty
releaseProcess in ThisBuild := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  releaseStepCommandAndRemaining("+publishSigned"),
  setNextVersion,
  commitNextVersion,
  releaseStepCommand("sonatypeReleaseAll")
)
skip in packageJSDependencies in ThisBuild := false
