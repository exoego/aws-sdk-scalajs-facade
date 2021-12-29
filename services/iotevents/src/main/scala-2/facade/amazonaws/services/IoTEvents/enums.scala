package facade.amazonaws.services.iotevents

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AnalysisResultLevel extends js.Any
object AnalysisResultLevel {
  val INFO = "INFO".asInstanceOf[AnalysisResultLevel]
  val WARNING = "WARNING".asInstanceOf[AnalysisResultLevel]
  val ERROR = "ERROR".asInstanceOf[AnalysisResultLevel]

  @inline def values = js.Array(INFO, WARNING, ERROR)
}

@js.native
sealed trait AnalysisStatus extends js.Any
object AnalysisStatus {
  val RUNNING = "RUNNING".asInstanceOf[AnalysisStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[AnalysisStatus]
  val FAILED = "FAILED".asInstanceOf[AnalysisStatus]

  @inline def values = js.Array(RUNNING, COMPLETE, FAILED)
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

  @inline def values = js.Array(ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT, PAUSED, FAILED)
}

@js.native
sealed trait EvaluationMethod extends js.Any
object EvaluationMethod {
  val BATCH = "BATCH".asInstanceOf[EvaluationMethod]
  val SERIAL = "SERIAL".asInstanceOf[EvaluationMethod]

  @inline def values = js.Array(BATCH, SERIAL)
}

@js.native
sealed trait InputStatus extends js.Any
object InputStatus {
  val CREATING = "CREATING".asInstanceOf[InputStatus]
  val UPDATING = "UPDATING".asInstanceOf[InputStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[InputStatus]
  val DELETING = "DELETING".asInstanceOf[InputStatus]

  @inline def values = js.Array(CREATING, UPDATING, ACTIVE, DELETING)
}

@js.native
sealed trait LoggingLevel extends js.Any
object LoggingLevel {
  val ERROR = "ERROR".asInstanceOf[LoggingLevel]
  val INFO = "INFO".asInstanceOf[LoggingLevel]
  val DEBUG = "DEBUG".asInstanceOf[LoggingLevel]

  @inline def values = js.Array(ERROR, INFO, DEBUG)
}

@js.native
sealed trait PayloadType extends js.Any
object PayloadType {
  val STRING = "STRING".asInstanceOf[PayloadType]
  val JSON = "JSON".asInstanceOf[PayloadType]

  @inline def values = js.Array(STRING, JSON)
}
