package facade.amazonaws.services.iotdeviceadvisor

import scalajs._

type Status = "PASS" | "FAIL" | "CANCELED" | "PENDING" | "RUNNING" | "PASS_WITH_WARNINGS" | "ERROR"
object Status {
  val PASS: "PASS" = "PASS"
  val FAIL: "FAIL" = "FAIL"
  val CANCELED: "CANCELED" = "CANCELED"
  val PENDING: "PENDING" = "PENDING"
  val RUNNING: "RUNNING" = "RUNNING"
  val PASS_WITH_WARNINGS: "PASS_WITH_WARNINGS" = "PASS_WITH_WARNINGS"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[Status](PASS, FAIL, CANCELED, PENDING, RUNNING, PASS_WITH_WARNINGS, ERROR)
}

type SuiteRunStatus = "PASS" | "FAIL" | "CANCELED" | "PENDING" | "RUNNING" | "PASS_WITH_WARNINGS" | "ERROR"
object SuiteRunStatus {
  val PASS: "PASS" = "PASS"
  val FAIL: "FAIL" = "FAIL"
  val CANCELED: "CANCELED" = "CANCELED"
  val PENDING: "PENDING" = "PENDING"
  val RUNNING: "RUNNING" = "RUNNING"
  val PASS_WITH_WARNINGS: "PASS_WITH_WARNINGS" = "PASS_WITH_WARNINGS"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[SuiteRunStatus](PASS, FAIL, CANCELED, PENDING, RUNNING, PASS_WITH_WARNINGS, ERROR)
}
