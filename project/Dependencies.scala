import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

// see https://github.com/scala-js/scala-js/issues/1331
import autoImport._

object Dependencies {
  object shared {
    val scalatest = Def.setting("org.scalatest"          %%% "scalatest"               % "3.0.8" % Test)
    val compat    = Def.setting("org.scala-lang.modules" %%% "scala-collection-compat" % "2.1.2")
  }
  object scalajs {
    val nodejs = Def.setting("net.exoego" %%% "scala-js-nodejs-v8" % "0.9.0")
  }
}
