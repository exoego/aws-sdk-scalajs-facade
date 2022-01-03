package facade.amazonaws.services.snowdevicemanagement

import scalajs.js

type AttachmentStatus = "ATTACHING" | "ATTACHED" | "DETACHING" | "DETACHED"
object AttachmentStatus {
  inline val ATTACHING: "ATTACHING" = "ATTACHING"
  inline val ATTACHED: "ATTACHED" = "ATTACHED"
  inline val DETACHING: "DETACHING" = "DETACHING"
  inline val DETACHED: "DETACHED" = "DETACHED"

  inline def values: js.Array[AttachmentStatus] = js.Array(ATTACHING, ATTACHED, DETACHING, DETACHED)
}

type ExecutionState = "QUEUED" | "IN_PROGRESS" | "CANCELED" | "FAILED" | "SUCCEEDED" | "REJECTED" | "TIMED_OUT"
object ExecutionState {
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"

  inline def values: js.Array[ExecutionState] = js.Array(QUEUED, IN_PROGRESS, CANCELED, FAILED, SUCCEEDED, REJECTED, TIMED_OUT)
}

type InstanceStateName = "PENDING" | "RUNNING" | "SHUTTING_DOWN" | "TERMINATED" | "STOPPING" | "STOPPED"
object InstanceStateName {
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SHUTTING_DOWN: "SHUTTING_DOWN" = "SHUTTING_DOWN"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[InstanceStateName] = js.Array(PENDING, RUNNING, SHUTTING_DOWN, TERMINATED, STOPPING, STOPPED)
}

type IpAddressAssignment = "DHCP" | "STATIC"
object IpAddressAssignment {
  inline val DHCP: "DHCP" = "DHCP"
  inline val STATIC: "STATIC" = "STATIC"

  inline def values: js.Array[IpAddressAssignment] = js.Array(DHCP, STATIC)
}

type PhysicalConnectorType = "RJ45" | "SFP_PLUS" | "QSFP" | "RJ45_2" | "WIFI"
object PhysicalConnectorType {
  inline val RJ45: "RJ45" = "RJ45"
  inline val SFP_PLUS: "SFP_PLUS" = "SFP_PLUS"
  inline val QSFP: "QSFP" = "QSFP"
  inline val RJ45_2: "RJ45_2" = "RJ45_2"
  inline val WIFI: "WIFI" = "WIFI"

  inline def values: js.Array[PhysicalConnectorType] = js.Array(RJ45, SFP_PLUS, QSFP, RJ45_2, WIFI)
}

type TaskState = "IN_PROGRESS" | "CANCELED" | "COMPLETED"
object TaskState {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[TaskState] = js.Array(IN_PROGRESS, CANCELED, COMPLETED)
}

type UnlockState = "UNLOCKED" | "LOCKED" | "UNLOCKING"
object UnlockState {
  inline val UNLOCKED: "UNLOCKED" = "UNLOCKED"
  inline val LOCKED: "LOCKED" = "LOCKED"
  inline val UNLOCKING: "UNLOCKING" = "UNLOCKING"

  inline def values: js.Array[UnlockState] = js.Array(UNLOCKED, LOCKED, UNLOCKING)
}
