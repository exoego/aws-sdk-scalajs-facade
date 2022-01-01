package facade.amazonaws.services.iotevents

import scalajs.js

@js.native
sealed trait AlarmModelVersionStatus extends js.Any
object AlarmModelVersionStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AlarmModelVersionStatus]
  val ACTIVATING = "ACTIVATING".asInstanceOf[AlarmModelVersionStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[AlarmModelVersionStatus]
  val FAILED = "FAILED".asInstanceOf[AlarmModelVersionStatus]

  @inline def values: js.Array[AlarmModelVersionStatus] = js.Array(ACTIVE, ACTIVATING, INACTIVE, FAILED)
}

@js.native
sealed trait AnalysisResultLevel extends js.Any
object AnalysisResultLevel {
  val INFO = "INFO".asInstanceOf[AnalysisResultLevel]
  val WARNING = "WARNING".asInstanceOf[AnalysisResultLevel]
  val ERROR = "ERROR".asInstanceOf[AnalysisResultLevel]

  @inline def values: js.Array[AnalysisResultLevel] = js.Array(INFO, WARNING, ERROR)
}

@js.native
sealed trait AnalysisStatus extends js.Any
object AnalysisStatus {
  val RUNNING = "RUNNING".asInstanceOf[AnalysisStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[AnalysisStatus]
  val FAILED = "FAILED".asInstanceOf[AnalysisStatus]

  @inline def values: js.Array[AnalysisStatus] = js.Array(RUNNING, COMPLETE, FAILED)
}

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val GREATER = "GREATER".asInstanceOf[ComparisonOperator]
  val GREATER_OR_EQUAL = "GREATER_OR_EQUAL".asInstanceOf[ComparisonOperator]
  val LESS = "LESS".asInstanceOf[ComparisonOperator]
  val LESS_OR_EQUAL = "LESS_OR_EQUAL".asInstanceOf[ComparisonOperator]
  val EQUAL = "EQUAL".asInstanceOf[ComparisonOperator]
  val NOT_EQUAL = "NOT_EQUAL".asInstanceOf[ComparisonOperator]

  @inline def values: js.Array[ComparisonOperator] = js.Array(GREATER, GREATER_OR_EQUAL, LESS, LESS_OR_EQUAL, EQUAL, NOT_EQUAL)
}

@js.native
sealed trait DetectorModelVersionStatus extends js.Any
object DetectorModelVersionStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[DetectorModelVersionStatus]
  val ACTIVATING = "ACTIVATING".asInstanceOf[DetectorModelVersionStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[DetectorModelVersionStatus]
  val DEPRECATED = "DEPRECATED".asInstanceOf[DetectorModelVersionStatus]
  val DRAFT = "DRAFT".asInstanceOf[DetectorModelVersionStatus]
  val PAUSED = "PAUSED".asInstanceOf[DetectorModelVersionStatus]
  val FAILED = "FAILED".asInstanceOf[DetectorModelVersionStatus]

  @inline def values: js.Array[DetectorModelVersionStatus] = js.Array(ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT, PAUSED, FAILED)
}

@js.native
sealed trait EvaluationMethod extends js.Any
object EvaluationMethod {
  val BATCH = "BATCH".asInstanceOf[EvaluationMethod]
  val SERIAL = "SERIAL".asInstanceOf[EvaluationMethod]

  @inline def values: js.Array[EvaluationMethod] = js.Array(BATCH, SERIAL)
}

@js.native
sealed trait InputStatus extends js.Any
object InputStatus {
  val CREATING = "CREATING".asInstanceOf[InputStatus]
  val UPDATING = "UPDATING".asInstanceOf[InputStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[InputStatus]
  val DELETING = "DELETING".asInstanceOf[InputStatus]

  @inline def values: js.Array[InputStatus] = js.Array(CREATING, UPDATING, ACTIVE, DELETING)
}

@js.native
sealed trait LoggingLevel extends js.Any
object LoggingLevel {
  val ERROR = "ERROR".asInstanceOf[LoggingLevel]
  val INFO = "INFO".asInstanceOf[LoggingLevel]
  val DEBUG = "DEBUG".asInstanceOf[LoggingLevel]

  @inline def values: js.Array[LoggingLevel] = js.Array(ERROR, INFO, DEBUG)
}

@js.native
sealed trait PayloadType extends js.Any
object PayloadType {
  val STRING = "STRING".asInstanceOf[PayloadType]
  val JSON = "JSON".asInstanceOf[PayloadType]

  @inline def values: js.Array[PayloadType] = js.Array(STRING, JSON)
}
