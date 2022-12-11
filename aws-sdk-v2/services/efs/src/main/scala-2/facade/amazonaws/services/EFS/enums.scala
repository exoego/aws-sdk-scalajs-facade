package facade.amazonaws.services.efs

import scalajs.js

@js.native
sealed trait LifeCycleState extends js.Any
object LifeCycleState {
  val creating = "creating".asInstanceOf[LifeCycleState]
  val available = "available".asInstanceOf[LifeCycleState]
  val updating = "updating".asInstanceOf[LifeCycleState]
  val deleting = "deleting".asInstanceOf[LifeCycleState]
  val deleted = "deleted".asInstanceOf[LifeCycleState]
  val error = "error".asInstanceOf[LifeCycleState]

  @inline def values: js.Array[LifeCycleState] = js.Array(creating, available, updating, deleting, deleted, error)
}

@js.native
sealed trait PerformanceMode extends js.Any
object PerformanceMode {
  val generalPurpose = "generalPurpose".asInstanceOf[PerformanceMode]
  val maxIO = "maxIO".asInstanceOf[PerformanceMode]

  @inline def values: js.Array[PerformanceMode] = js.Array(generalPurpose, maxIO)
}

@js.native
sealed trait ReplicationStatus extends js.Any
object ReplicationStatus {
  val ENABLED = "ENABLED".asInstanceOf[ReplicationStatus]
  val ENABLING = "ENABLING".asInstanceOf[ReplicationStatus]
  val DELETING = "DELETING".asInstanceOf[ReplicationStatus]
  val ERROR = "ERROR".asInstanceOf[ReplicationStatus]

  @inline def values: js.Array[ReplicationStatus] = js.Array(ENABLED, ENABLING, DELETING, ERROR)
}

/** An EFS resource, for example a file system or a mount target.
  */
@js.native
sealed trait Resource extends js.Any
object Resource {
  val FILE_SYSTEM = "FILE_SYSTEM".asInstanceOf[Resource]
  val MOUNT_TARGET = "MOUNT_TARGET".asInstanceOf[Resource]

  @inline def values: js.Array[Resource] = js.Array(FILE_SYSTEM, MOUNT_TARGET)
}

/** A preference indicating a choice to use 63bit/32bit IDs for all applicable resources.
  */
@js.native
sealed trait ResourceIdType extends js.Any
object ResourceIdType {
  val LONG_ID = "LONG_ID".asInstanceOf[ResourceIdType]
  val SHORT_ID = "SHORT_ID".asInstanceOf[ResourceIdType]

  @inline def values: js.Array[ResourceIdType] = js.Array(LONG_ID, SHORT_ID)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val ENABLED = "ENABLED".asInstanceOf[Status]
  val ENABLING = "ENABLING".asInstanceOf[Status]
  val DISABLED = "DISABLED".asInstanceOf[Status]
  val DISABLING = "DISABLING".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(ENABLED, ENABLING, DISABLED, DISABLING)
}

@js.native
sealed trait ThroughputMode extends js.Any
object ThroughputMode {
  val bursting = "bursting".asInstanceOf[ThroughputMode]
  val provisioned = "provisioned".asInstanceOf[ThroughputMode]
  val elastic = "elastic".asInstanceOf[ThroughputMode]

  @inline def values: js.Array[ThroughputMode] = js.Array(bursting, provisioned, elastic)
}

@js.native
sealed trait TransitionToIARules extends js.Any
object TransitionToIARules {
  val AFTER_7_DAYS = "AFTER_7_DAYS".asInstanceOf[TransitionToIARules]
  val AFTER_14_DAYS = "AFTER_14_DAYS".asInstanceOf[TransitionToIARules]
  val AFTER_30_DAYS = "AFTER_30_DAYS".asInstanceOf[TransitionToIARules]
  val AFTER_60_DAYS = "AFTER_60_DAYS".asInstanceOf[TransitionToIARules]
  val AFTER_90_DAYS = "AFTER_90_DAYS".asInstanceOf[TransitionToIARules]
  val AFTER_1_DAY = "AFTER_1_DAY".asInstanceOf[TransitionToIARules]

  @inline def values: js.Array[TransitionToIARules] = js.Array(AFTER_7_DAYS, AFTER_14_DAYS, AFTER_30_DAYS, AFTER_60_DAYS, AFTER_90_DAYS, AFTER_1_DAY)
}

@js.native
sealed trait TransitionToPrimaryStorageClassRules extends js.Any
object TransitionToPrimaryStorageClassRules {
  val AFTER_1_ACCESS = "AFTER_1_ACCESS".asInstanceOf[TransitionToPrimaryStorageClassRules]

  @inline def values: js.Array[TransitionToPrimaryStorageClassRules] = js.Array(AFTER_1_ACCESS)
}
