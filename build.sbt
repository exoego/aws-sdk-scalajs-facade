import ReleaseTransformations._
enablePlugins(ScalaJSPlugin)

lazy val scala212 = "2.12.8"
lazy val scala213 = "2.13.0"
lazy val supportedScalaVersions = List(scala212, scala213)

val Organization = "net.exoego"

lazy val root = (project in file(".")).
  settings(
    organization := Organization,
    name := "aws-sdk-scalajs-facade",
    crossScalaVersions := supportedScalaVersions,
    scalacOptions ++= Seq("-P:scalajs:sjsDefinedByDefault"),
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
        id    = "exoego",
        name  = "TATSUNO Yasuhiro",
        email = "ytatsuno.jp@gmail.com",
        url   = url("https://exoego.net")
      )
    ),
    publishMavenStyle := true,
    publishArtifact in Test := false,
    publishArtifact in (Compile, packageDoc) := true,
    publishArtifact in (Compile, packageSrc) := true,
    pomIncludeRepository := { _ => false },
    publishTo := Some(
      if (isSnapshot.value)
        Opts.resolver.sonatypeSnapshots
      else
        Opts.resolver.sonatypeStaging
    ),
    publishConfiguration := publishConfiguration.value.withOverwrite(true),
    publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),
    publishArtifact in packageDoc := false,
    sources in (Compile,doc) := Seq.empty,
    releaseProcess := Seq[ReleaseStep](
      checkSnapshotDependencies,
      inquireVersions,
      runClean,
      runTest,
      setReleaseVersion,
      commitReleaseVersion,
      tagRelease,
      ReleaseStep(action = Command.process("publishSigned", _)),
      setNextVersion,
      commitNextVersion,
      ReleaseStep(action = Command.process("sonatypeRelease", _))
    ),
    skip in packageJSDependencies := false,
    scalaJSModuleKind := ModuleKind.CommonJSModule,
    libraryDependencies ++= Seq(
      "io.scalajs" %%% "nodejs" % "0.4.2"
    )
  )
