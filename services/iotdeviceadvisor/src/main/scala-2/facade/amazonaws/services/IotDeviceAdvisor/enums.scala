package facade.amazonaws.services.iotdeviceadvisor

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait Status extends js.Any
object Status {
  val PASS = "PASS".asInstanceOf[Status]
  val FAIL = "FAIL".asInstanceOf[Status]
  val CANCELED = "CANCELED".asInstanceOf[Status]
  val PENDING = "PENDING".asInstanceOf[Status]
  val RUNNING = "RUNNING".asInstanceOf[Status]
  val PASS_WITH_WARNINGS = "PASS_WITH_WARNINGS".asInstanceOf[Status]
  val ERROR = "ERROR".asInstanceOf[Status]

  @inline def values = js.Array(PASS, FAIL, CANCELED, PENDING, RUNNING, PASS_WITH_WARNINGS, ERROR)
}

@js.native
sealed trait SuiteRunStatus extends js.Any
object SuiteRunStatus {
  val PASS = "PASS".asInstanceOf[SuiteRunStatus]
  val FAIL = "FAIL".asInstanceOf[SuiteRunStatus]
  val CANCELED = "CANCELED".asInstanceOf[SuiteRunStatus]
  val PENDING = "PENDING".asInstanceOf[SuiteRunStatus]
  val RUNNING = "RUNNING".asInstanceOf[SuiteRunStatus]
  val PASS_WITH_WARNINGS = "PASS_WITH_WARNINGS".asInstanceOf[SuiteRunStatus]
  val ERROR = "ERROR".asInstanceOf[SuiteRunStatus]

  @inline def values = js.Array(PASS, FAIL, CANCELED, PENDING, RUNNING, PASS_WITH_WARNINGS, ERROR)
}

