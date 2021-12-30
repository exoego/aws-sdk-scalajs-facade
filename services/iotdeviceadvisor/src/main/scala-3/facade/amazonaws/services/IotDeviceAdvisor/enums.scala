package facade.amazonaws.services.iotdeviceadvisor

import scalajs.js

type Status = "PASS" | "FAIL" | "CANCELED" | "PENDING" | "RUNNING" | "PASS_WITH_WARNINGS" | "ERROR"
object Status {
  inline val PASS: "PASS" = "PASS"
  inline val FAIL: "FAIL" = "FAIL"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val PASS_WITH_WARNINGS: "PASS_WITH_WARNINGS" = "PASS_WITH_WARNINGS"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[Status] = js.Array(PASS, FAIL, CANCELED, PENDING, RUNNING, PASS_WITH_WARNINGS, ERROR)
}

type SuiteRunStatus = "PASS" | "FAIL" | "CANCELED" | "PENDING" | "RUNNING" | "PASS_WITH_WARNINGS" | "ERROR"
object SuiteRunStatus {
  inline val PASS: "PASS" = "PASS"
  inline val FAIL: "FAIL" = "FAIL"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val PASS_WITH_WARNINGS: "PASS_WITH_WARNINGS" = "PASS_WITH_WARNINGS"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[SuiteRunStatus] = js.Array(PASS, FAIL, CANCELED, PENDING, RUNNING, PASS_WITH_WARNINGS, ERROR)
}
