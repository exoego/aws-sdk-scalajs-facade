package facade.amazonaws.services.rum

import scalajs.js

@js.native
sealed trait CustomEventsStatus extends js.Any
object CustomEventsStatus {
  val ENABLED = "ENABLED".asInstanceOf[CustomEventsStatus]
  val DISABLED = "DISABLED".asInstanceOf[CustomEventsStatus]

  @inline def values: js.Array[CustomEventsStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait MetricDestination extends js.Any
object MetricDestination {
  val CloudWatch = "CloudWatch".asInstanceOf[MetricDestination]
  val Evidently = "Evidently".asInstanceOf[MetricDestination]

  @inline def values: js.Array[MetricDestination] = js.Array(CloudWatch, Evidently)
}

@js.native
sealed trait StateEnum extends js.Any
object StateEnum {
  val CREATED = "CREATED".asInstanceOf[StateEnum]
  val DELETING = "DELETING".asInstanceOf[StateEnum]
  val ACTIVE = "ACTIVE".asInstanceOf[StateEnum]

  @inline def values: js.Array[StateEnum] = js.Array(CREATED, DELETING, ACTIVE)
}

@js.native
sealed trait Telemetry extends js.Any
object Telemetry {
  val errors = "errors".asInstanceOf[Telemetry]
  val performance = "performance".asInstanceOf[Telemetry]
  val http = "http".asInstanceOf[Telemetry]

  @inline def values: js.Array[Telemetry] = js.Array(errors, performance, http)
}
