enablePlugins(ScalaJSPlugin)

val Version = "0.18.0"
val Organization = "net.exoego"

lazy val root = (project in file(".")).
  settings(
    organization := Organization,
    name := "aws-sdk-scalajs-facade",
    version := Version,
    scalaVersion := "2.12.7"
  )
  
skip in packageJSDependencies := false

scalaJSModuleKind := ModuleKind.CommonJSModule

libraryDependencies ++= Seq(
  "io.scalajs" %%% "nodejs" % "0.4.2"
)
