import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

// see https://github.com/scala-js/scala-js/issues/1331
import autoImport._

object Dependencies {
  object shared {
    val scalatest = Def.setting("org.scalatest"          %%% "scalatest"               % "3.1.0" % Test)
    val compat    = Def.setting("org.scala-lang.modules" %%% "scala-collection-compat" % "2.1.3")
  }
  object scalajs {
    val nodejs = Def.setting("net.exoego" %%% "scala-js-nodejs-v12" % "0.9.1")
  }
}
