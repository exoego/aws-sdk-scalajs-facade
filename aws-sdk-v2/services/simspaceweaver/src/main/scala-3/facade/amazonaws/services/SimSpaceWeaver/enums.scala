package facade.amazonaws.services.simspaceweaver

import scalajs.js

type ClockStatus = "UNKNOWN" | "STARTING" | "STARTED" | "STOPPING" | "STOPPED"
object ClockStatus {
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val STARTING: "STARTING" = "STARTING"
  inline val STARTED: "STARTED" = "STARTED"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[ClockStatus] = js.Array(UNKNOWN, STARTING, STARTED, STOPPING, STOPPED)
}

type ClockTargetStatus = "UNKNOWN" | "STARTED" | "STOPPED"
object ClockTargetStatus {
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val STARTED: "STARTED" = "STARTED"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[ClockTargetStatus] = js.Array(UNKNOWN, STARTED, STOPPED)
}

type LifecycleManagementStrategy = "Unknown" | "PerWorker" | "BySpatialSubdivision" | "ByRequest"
object LifecycleManagementStrategy {
  inline val Unknown: "Unknown" = "Unknown"
  inline val PerWorker: "PerWorker" = "PerWorker"
  inline val BySpatialSubdivision: "BySpatialSubdivision" = "BySpatialSubdivision"
  inline val ByRequest: "ByRequest" = "ByRequest"

  inline def values: js.Array[LifecycleManagementStrategy] = js.Array(Unknown, PerWorker, BySpatialSubdivision, ByRequest)
}

type SimulationAppStatus = "STARTING" | "STARTED" | "STOPPING" | "STOPPED" | "ERROR" | "UNKNOWN"
object SimulationAppStatus {
  inline val STARTING: "STARTING" = "STARTING"
  inline val STARTED: "STARTED" = "STARTED"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val ERROR: "ERROR" = "ERROR"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[SimulationAppStatus] = js.Array(STARTING, STARTED, STOPPING, STOPPED, ERROR, UNKNOWN)
}

type SimulationAppTargetStatus = "UNKNOWN" | "STARTED" | "STOPPED"
object SimulationAppTargetStatus {
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val STARTED: "STARTED" = "STARTED"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[SimulationAppTargetStatus] = js.Array(UNKNOWN, STARTED, STOPPED)
}

type SimulationStatus = "UNKNOWN" | "STARTING" | "STARTED" | "STOPPING" | "STOPPED" | "FAILED" | "DELETING" | "DELETED"
object SimulationStatus {
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val STARTING: "STARTING" = "STARTING"
  inline val STARTED: "STARTED" = "STARTED"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[SimulationStatus] = js.Array(UNKNOWN, STARTING, STARTED, STOPPING, STOPPED, FAILED, DELETING, DELETED)
}

type SimulationTargetStatus = "UNKNOWN" | "STARTED" | "STOPPED" | "DELETED"
object SimulationTargetStatus {
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val STARTED: "STARTED" = "STARTED"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[SimulationTargetStatus] = js.Array(UNKNOWN, STARTED, STOPPED, DELETED)
}
