package facade.amazonaws.services.pi

import scalajs.js

@js.native
sealed trait DetailStatus extends js.Any
object DetailStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[DetailStatus]
  val PROCESSING = "PROCESSING".asInstanceOf[DetailStatus]
  val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[DetailStatus]

  @inline def values: js.Array[DetailStatus] = js.Array(AVAILABLE, PROCESSING, UNAVAILABLE)
}

@js.native
sealed trait FeatureStatus extends js.Any
object FeatureStatus {
  val ENABLED = "ENABLED".asInstanceOf[FeatureStatus]
  val DISABLED = "DISABLED".asInstanceOf[FeatureStatus]
  val UNSUPPORTED = "UNSUPPORTED".asInstanceOf[FeatureStatus]
  val ENABLED_PENDING_REBOOT = "ENABLED_PENDING_REBOOT".asInstanceOf[FeatureStatus]
  val DISABLED_PENDING_REBOOT = "DISABLED_PENDING_REBOOT".asInstanceOf[FeatureStatus]
  val UNKNOWN = "UNKNOWN".asInstanceOf[FeatureStatus]

  @inline def values: js.Array[FeatureStatus] = js.Array(ENABLED, DISABLED, UNSUPPORTED, ENABLED_PENDING_REBOOT, DISABLED_PENDING_REBOOT, UNKNOWN)
}

@js.native
sealed trait ServiceType extends js.Any
object ServiceType {
  val RDS = "RDS".asInstanceOf[ServiceType]
  val DOCDB = "DOCDB".asInstanceOf[ServiceType]

  @inline def values: js.Array[ServiceType] = js.Array(RDS, DOCDB)
}
