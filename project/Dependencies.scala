import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

// see https://github.com/scala-js/scala-js/issues/1331
import autoImport._

object Dependencies {
  object shared {
    val scalatest = Def.setting("org.scalatest" %%% "scalatest" % "3.2.12" % Test)
    val scalatestHelper = Def.setting(("net.exoego" %%% "scalajs-test-helper-scalatest" % "0.2.0" cross CrossVersion.for3Use2_13) % Test
      excludeAll (ExclusionRule("org.scalatest")))
    val dynamodbShared = Def.setting("net.exoego" %%% "scalajs-dynamodb-shared" % "0.0.1")
  }
  object scalajs {}
}
