package facade.amazonaws.services.simspaceweaver

import scalajs.js

@js.native
sealed trait ClockStatus extends js.Any
object ClockStatus {
  val UNKNOWN = "UNKNOWN".asInstanceOf[ClockStatus]
  val STARTING = "STARTING".asInstanceOf[ClockStatus]
  val STARTED = "STARTED".asInstanceOf[ClockStatus]
  val STOPPING = "STOPPING".asInstanceOf[ClockStatus]
  val STOPPED = "STOPPED".asInstanceOf[ClockStatus]

  @inline def values: js.Array[ClockStatus] = js.Array(UNKNOWN, STARTING, STARTED, STOPPING, STOPPED)
}

@js.native
sealed trait ClockTargetStatus extends js.Any
object ClockTargetStatus {
  val UNKNOWN = "UNKNOWN".asInstanceOf[ClockTargetStatus]
  val STARTED = "STARTED".asInstanceOf[ClockTargetStatus]
  val STOPPED = "STOPPED".asInstanceOf[ClockTargetStatus]

  @inline def values: js.Array[ClockTargetStatus] = js.Array(UNKNOWN, STARTED, STOPPED)
}

@js.native
sealed trait LifecycleManagementStrategy extends js.Any
object LifecycleManagementStrategy {
  val Unknown = "Unknown".asInstanceOf[LifecycleManagementStrategy]
  val PerWorker = "PerWorker".asInstanceOf[LifecycleManagementStrategy]
  val BySpatialSubdivision = "BySpatialSubdivision".asInstanceOf[LifecycleManagementStrategy]
  val ByRequest = "ByRequest".asInstanceOf[LifecycleManagementStrategy]

  @inline def values: js.Array[LifecycleManagementStrategy] = js.Array(Unknown, PerWorker, BySpatialSubdivision, ByRequest)
}

@js.native
sealed trait SimulationAppStatus extends js.Any
object SimulationAppStatus {
  val STARTING = "STARTING".asInstanceOf[SimulationAppStatus]
  val STARTED = "STARTED".asInstanceOf[SimulationAppStatus]
  val STOPPING = "STOPPING".asInstanceOf[SimulationAppStatus]
  val STOPPED = "STOPPED".asInstanceOf[SimulationAppStatus]
  val ERROR = "ERROR".asInstanceOf[SimulationAppStatus]
  val UNKNOWN = "UNKNOWN".asInstanceOf[SimulationAppStatus]

  @inline def values: js.Array[SimulationAppStatus] = js.Array(STARTING, STARTED, STOPPING, STOPPED, ERROR, UNKNOWN)
}

@js.native
sealed trait SimulationAppTargetStatus extends js.Any
object SimulationAppTargetStatus {
  val UNKNOWN = "UNKNOWN".asInstanceOf[SimulationAppTargetStatus]
  val STARTED = "STARTED".asInstanceOf[SimulationAppTargetStatus]
  val STOPPED = "STOPPED".asInstanceOf[SimulationAppTargetStatus]

  @inline def values: js.Array[SimulationAppTargetStatus] = js.Array(UNKNOWN, STARTED, STOPPED)
}

@js.native
sealed trait SimulationStatus extends js.Any
object SimulationStatus {
  val UNKNOWN = "UNKNOWN".asInstanceOf[SimulationStatus]
  val STARTING = "STARTING".asInstanceOf[SimulationStatus]
  val STARTED = "STARTED".asInstanceOf[SimulationStatus]
  val STOPPING = "STOPPING".asInstanceOf[SimulationStatus]
  val STOPPED = "STOPPED".asInstanceOf[SimulationStatus]
  val FAILED = "FAILED".asInstanceOf[SimulationStatus]
  val DELETING = "DELETING".asInstanceOf[SimulationStatus]
  val DELETED = "DELETED".asInstanceOf[SimulationStatus]

  @inline def values: js.Array[SimulationStatus] = js.Array(UNKNOWN, STARTING, STARTED, STOPPING, STOPPED, FAILED, DELETING, DELETED)
}

@js.native
sealed trait SimulationTargetStatus extends js.Any
object SimulationTargetStatus {
  val UNKNOWN = "UNKNOWN".asInstanceOf[SimulationTargetStatus]
  val STARTED = "STARTED".asInstanceOf[SimulationTargetStatus]
  val STOPPED = "STOPPED".asInstanceOf[SimulationTargetStatus]
  val DELETED = "DELETED".asInstanceOf[SimulationTargetStatus]

  @inline def values: js.Array[SimulationTargetStatus] = js.Array(UNKNOWN, STARTED, STOPPED, DELETED)
}
