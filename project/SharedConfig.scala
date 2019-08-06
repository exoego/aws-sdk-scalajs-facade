import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

// see https://github.com/scala-js/scala-js/issues/1331
import autoImport._

object SharedConfig {
  val SupportedScalaVersions = List("2.12.9", "2.13.0")
  val Organization           = "net.exoego"
  val libraryName            = "aws-sdk-scalajs-facade"

  val settings = Seq(
    organization := Organization,
    crossScalaVersions := SupportedScalaVersions,
    scalacOptions ++= Seq("-P:scalajs:sjsDefinedByDefault", "-deprecation"),
    scalaJSModuleKind := ModuleKind.CommonJSModule,
    scalaJSLinkerConfig ~= {
      val isCI = Option(System.getenv("CI")).exists(_.contains("true"))
      _.withBatchMode(isCI).withSourceMap(false)
    }
  )
}
