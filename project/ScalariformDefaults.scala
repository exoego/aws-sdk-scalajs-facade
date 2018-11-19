import com.typesafe.sbt.SbtScalariform.ScalariformKeys

import scala.sys.process._
import sbt._

import scalariform.formatter.preferences._

object ScalariformDefaults {
  /**
   * @see https://github.com/scala-ide/scalariform
   */
  lazy val defaultSettings = Seq(
    ScalariformKeys.preferences := ScalariformKeys.preferences.value
      .setPreference(AlignSingleLineCaseStatements, true)
      .setPreference(AlignSingleLineCaseStatements.MaxArrowIndent, 60) 
      .setPreference(DanglingCloseParenthesis, Force) 
      .setPreference(SpacesAroundMultiImports, false)
  )

  /**
   * File: run-ci
   * ./sbt-batch clean compile:scalariformFormat test:scalariformFormat checkScalariform test
   */
  lazy val checkScalariformTaskSettings = Seq(
    TaskKey[Unit]("checkScalariform") := {
      val diff = "git diff" !!

      if (diff.nonEmpty) {
        sys.error("Working directory is dirty!\n" + diff)
      }
    }
  )
}
