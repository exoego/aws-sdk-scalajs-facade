package facade.amazonaws.services.snowdevicemanagement

import scalajs.js

@js.native
sealed trait AttachmentStatus extends js.Any
object AttachmentStatus {
  val ATTACHING = "ATTACHING".asInstanceOf[AttachmentStatus]
  val ATTACHED = "ATTACHED".asInstanceOf[AttachmentStatus]
  val DETACHING = "DETACHING".asInstanceOf[AttachmentStatus]
  val DETACHED = "DETACHED".asInstanceOf[AttachmentStatus]

  @inline def values: js.Array[AttachmentStatus] = js.Array(ATTACHING, ATTACHED, DETACHING, DETACHED)
}

@js.native
sealed trait ExecutionState extends js.Any
object ExecutionState {
  val QUEUED = "QUEUED".asInstanceOf[ExecutionState]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ExecutionState]
  val CANCELED = "CANCELED".asInstanceOf[ExecutionState]
  val FAILED = "FAILED".asInstanceOf[ExecutionState]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ExecutionState]
  val REJECTED = "REJECTED".asInstanceOf[ExecutionState]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[ExecutionState]

  @inline def values: js.Array[ExecutionState] = js.Array(QUEUED, IN_PROGRESS, CANCELED, FAILED, SUCCEEDED, REJECTED, TIMED_OUT)
}

@js.native
sealed trait InstanceStateName extends js.Any
object InstanceStateName {
  val PENDING = "PENDING".asInstanceOf[InstanceStateName]
  val RUNNING = "RUNNING".asInstanceOf[InstanceStateName]
  val SHUTTING_DOWN = "SHUTTING_DOWN".asInstanceOf[InstanceStateName]
  val TERMINATED = "TERMINATED".asInstanceOf[InstanceStateName]
  val STOPPING = "STOPPING".asInstanceOf[InstanceStateName]
  val STOPPED = "STOPPED".asInstanceOf[InstanceStateName]

  @inline def values: js.Array[InstanceStateName] = js.Array(PENDING, RUNNING, SHUTTING_DOWN, TERMINATED, STOPPING, STOPPED)
}

@js.native
sealed trait IpAddressAssignment extends js.Any
object IpAddressAssignment {
  val DHCP = "DHCP".asInstanceOf[IpAddressAssignment]
  val STATIC = "STATIC".asInstanceOf[IpAddressAssignment]

  @inline def values: js.Array[IpAddressAssignment] = js.Array(DHCP, STATIC)
}

@js.native
sealed trait PhysicalConnectorType extends js.Any
object PhysicalConnectorType {
  val RJ45 = "RJ45".asInstanceOf[PhysicalConnectorType]
  val SFP_PLUS = "SFP_PLUS".asInstanceOf[PhysicalConnectorType]
  val QSFP = "QSFP".asInstanceOf[PhysicalConnectorType]
  val RJ45_2 = "RJ45_2".asInstanceOf[PhysicalConnectorType]
  val WIFI = "WIFI".asInstanceOf[PhysicalConnectorType]

  @inline def values: js.Array[PhysicalConnectorType] = js.Array(RJ45, SFP_PLUS, QSFP, RJ45_2, WIFI)
}

@js.native
sealed trait TaskState extends js.Any
object TaskState {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[TaskState]
  val CANCELED = "CANCELED".asInstanceOf[TaskState]
  val COMPLETED = "COMPLETED".asInstanceOf[TaskState]

  @inline def values: js.Array[TaskState] = js.Array(IN_PROGRESS, CANCELED, COMPLETED)
}

@js.native
sealed trait UnlockState extends js.Any
object UnlockState {
  val UNLOCKED = "UNLOCKED".asInstanceOf[UnlockState]
  val LOCKED = "LOCKED".asInstanceOf[UnlockState]
  val UNLOCKING = "UNLOCKING".asInstanceOf[UnlockState]

  @inline def values: js.Array[UnlockState] = js.Array(UNLOCKED, LOCKED, UNLOCKING)
}
