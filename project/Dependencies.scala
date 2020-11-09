import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

// see https://github.com/scala-js/scala-js/issues/1331
import autoImport._

object Dependencies {
  object shared {
    val scalatest = Def.setting("org.scalatest" %%% "scalatest" % "3.2.3" % Test)
    val scalatestHelper = Def.setting("net.exoego" %%% "scalajs-test-helper-scalatest" % "0.2.0" % Test)
    val compat = Def.setting("org.scala-lang.modules" %%% "scala-collection-compat" % "2.2.0")
  }
  object scalajs {}
}
