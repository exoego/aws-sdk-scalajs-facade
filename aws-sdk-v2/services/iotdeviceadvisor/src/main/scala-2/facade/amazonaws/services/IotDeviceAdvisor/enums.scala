package facade.amazonaws.services.iotdeviceadvisor

import scalajs.js

@js.native
sealed trait Protocol extends js.Any
object Protocol {
  val MqttV3_1_1 = "MqttV3_1_1".asInstanceOf[Protocol]
  val MqttV5 = "MqttV5".asInstanceOf[Protocol]

  @inline def values: js.Array[Protocol] = js.Array(MqttV3_1_1, MqttV5)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val PASS = "PASS".asInstanceOf[Status]
  val FAIL = "FAIL".asInstanceOf[Status]
  val CANCELED = "CANCELED".asInstanceOf[Status]
  val PENDING = "PENDING".asInstanceOf[Status]
  val RUNNING = "RUNNING".asInstanceOf[Status]
  val STOPPING = "STOPPING".asInstanceOf[Status]
  val STOPPED = "STOPPED".asInstanceOf[Status]
  val PASS_WITH_WARNINGS = "PASS_WITH_WARNINGS".asInstanceOf[Status]
  val ERROR = "ERROR".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(PASS, FAIL, CANCELED, PENDING, RUNNING, STOPPING, STOPPED, PASS_WITH_WARNINGS, ERROR)
}

@js.native
sealed trait SuiteRunStatus extends js.Any
object SuiteRunStatus {
  val PASS = "PASS".asInstanceOf[SuiteRunStatus]
  val FAIL = "FAIL".asInstanceOf[SuiteRunStatus]
  val CANCELED = "CANCELED".asInstanceOf[SuiteRunStatus]
  val PENDING = "PENDING".asInstanceOf[SuiteRunStatus]
  val RUNNING = "RUNNING".asInstanceOf[SuiteRunStatus]
  val STOPPING = "STOPPING".asInstanceOf[SuiteRunStatus]
  val STOPPED = "STOPPED".asInstanceOf[SuiteRunStatus]
  val PASS_WITH_WARNINGS = "PASS_WITH_WARNINGS".asInstanceOf[SuiteRunStatus]
  val ERROR = "ERROR".asInstanceOf[SuiteRunStatus]

  @inline def values: js.Array[SuiteRunStatus] = js.Array(PASS, FAIL, CANCELED, PENDING, RUNNING, STOPPING, STOPPED, PASS_WITH_WARNINGS, ERROR)
}

@js.native
sealed trait TestCaseScenarioStatus extends js.Any
object TestCaseScenarioStatus {
  val PASS = "PASS".asInstanceOf[TestCaseScenarioStatus]
  val FAIL = "FAIL".asInstanceOf[TestCaseScenarioStatus]
  val CANCELED = "CANCELED".asInstanceOf[TestCaseScenarioStatus]
  val PENDING = "PENDING".asInstanceOf[TestCaseScenarioStatus]
  val RUNNING = "RUNNING".asInstanceOf[TestCaseScenarioStatus]
  val STOPPING = "STOPPING".asInstanceOf[TestCaseScenarioStatus]
  val STOPPED = "STOPPED".asInstanceOf[TestCaseScenarioStatus]
  val PASS_WITH_WARNINGS = "PASS_WITH_WARNINGS".asInstanceOf[TestCaseScenarioStatus]
  val ERROR = "ERROR".asInstanceOf[TestCaseScenarioStatus]

  @inline def values: js.Array[TestCaseScenarioStatus] = js.Array(PASS, FAIL, CANCELED, PENDING, RUNNING, STOPPING, STOPPED, PASS_WITH_WARNINGS, ERROR)
}

@js.native
sealed trait TestCaseScenarioType extends js.Any
object TestCaseScenarioType {
  val Advanced = "Advanced".asInstanceOf[TestCaseScenarioType]
  val Basic = "Basic".asInstanceOf[TestCaseScenarioType]

  @inline def values: js.Array[TestCaseScenarioType] = js.Array(Advanced, Basic)
}
