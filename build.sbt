enablePlugins(ScalaJSPlugin)
scalaJSUseRhino in Global := false

lazy val root = (project in file(".")).
  settings(
    organization := "com.leeriggins",
    name := "aws-sdk-scalajs-facade",
    version := "0.0.1",
    scalaVersion := "2.11.8"
  )
  
skip in packageJSDependencies := false

jsDependencies ++= Seq(
  "org.webjars.bower" % "aws-sdk-js" % "2.1.23" / "aws-sdk.js" minified "aws-sdk.min.js" commonJSName "AWS"
)
