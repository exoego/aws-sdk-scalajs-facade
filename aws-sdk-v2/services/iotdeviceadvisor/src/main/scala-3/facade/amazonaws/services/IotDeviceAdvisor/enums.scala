package facade.amazonaws.services.iotdeviceadvisor

import scalajs.js

type Protocol = "MqttV3_1_1" | "MqttV5"
object Protocol {
  inline val MqttV3_1_1: "MqttV3_1_1" = "MqttV3_1_1"
  inline val MqttV5: "MqttV5" = "MqttV5"

  inline def values: js.Array[Protocol] = js.Array(MqttV3_1_1, MqttV5)
}

type Status = "PASS" | "FAIL" | "CANCELED" | "PENDING" | "RUNNING" | "STOPPING" | "STOPPED" | "PASS_WITH_WARNINGS" | "ERROR"
object Status {
  inline val PASS: "PASS" = "PASS"
  inline val FAIL: "FAIL" = "FAIL"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val PASS_WITH_WARNINGS: "PASS_WITH_WARNINGS" = "PASS_WITH_WARNINGS"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[Status] = js.Array(PASS, FAIL, CANCELED, PENDING, RUNNING, STOPPING, STOPPED, PASS_WITH_WARNINGS, ERROR)
}

type SuiteRunStatus = "PASS" | "FAIL" | "CANCELED" | "PENDING" | "RUNNING" | "STOPPING" | "STOPPED" | "PASS_WITH_WARNINGS" | "ERROR"
object SuiteRunStatus {
  inline val PASS: "PASS" = "PASS"
  inline val FAIL: "FAIL" = "FAIL"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val PASS_WITH_WARNINGS: "PASS_WITH_WARNINGS" = "PASS_WITH_WARNINGS"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[SuiteRunStatus] = js.Array(PASS, FAIL, CANCELED, PENDING, RUNNING, STOPPING, STOPPED, PASS_WITH_WARNINGS, ERROR)
}

type TestCaseScenarioStatus = "PASS" | "FAIL" | "CANCELED" | "PENDING" | "RUNNING" | "STOPPING" | "STOPPED" | "PASS_WITH_WARNINGS" | "ERROR"
object TestCaseScenarioStatus {
  inline val PASS: "PASS" = "PASS"
  inline val FAIL: "FAIL" = "FAIL"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val PASS_WITH_WARNINGS: "PASS_WITH_WARNINGS" = "PASS_WITH_WARNINGS"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[TestCaseScenarioStatus] = js.Array(PASS, FAIL, CANCELED, PENDING, RUNNING, STOPPING, STOPPED, PASS_WITH_WARNINGS, ERROR)
}

type TestCaseScenarioType = "Advanced" | "Basic"
object TestCaseScenarioType {
  inline val Advanced: "Advanced" = "Advanced"
  inline val Basic: "Basic" = "Basic"

  inline def values: js.Array[TestCaseScenarioType] = js.Array(Advanced, Basic)
}
