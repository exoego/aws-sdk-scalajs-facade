import ReleaseTransformations._
enablePlugins(ScalaJSPlugin)

val Version = "0.20.0"
val Organization = "net.exoego"

lazy val root = (project in file(".")).
  settings(
    organization := Organization,
    name := "aws-sdk-scalajs-facade",
    version := Version,
    scalaVersion := "2.12.7",
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
