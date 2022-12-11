package facade.amazonaws.services.emrserverless

import scalajs.js

type ApplicationState = "CREATING" | "CREATED" | "STARTING" | "STARTED" | "STOPPING" | "STOPPED" | "TERMINATED"
object ApplicationState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val STARTING: "STARTING" = "STARTING"
  inline val STARTED: "STARTED" = "STARTED"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"

  inline def values: js.Array[ApplicationState] = js.Array(CREATING, CREATED, STARTING, STARTED, STOPPING, STOPPED, TERMINATED)
}

type Architecture = "ARM64" | "X86_64"
object Architecture {
  inline val ARM64: "ARM64" = "ARM64"
  inline val X86_64: "X86_64" = "X86_64"

  inline def values: js.Array[Architecture] = js.Array(ARM64, X86_64)
}

type JobRunState = "SUBMITTED" | "PENDING" | "SCHEDULED" | "RUNNING" | "SUCCESS" | "FAILED" | "CANCELLING" | "CANCELLED"
object JobRunState {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val SCHEDULED: "SCHEDULED" = "SCHEDULED"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[JobRunState] = js.Array(SUBMITTED, PENDING, SCHEDULED, RUNNING, SUCCESS, FAILED, CANCELLING, CANCELLED)
}
