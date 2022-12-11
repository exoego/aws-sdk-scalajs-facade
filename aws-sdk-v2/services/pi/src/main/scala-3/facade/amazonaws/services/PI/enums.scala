package facade.amazonaws.services.pi

import scalajs.js

type DetailStatus = "AVAILABLE" | "PROCESSING" | "UNAVAILABLE"
object DetailStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"

  inline def values: js.Array[DetailStatus] = js.Array(AVAILABLE, PROCESSING, UNAVAILABLE)
}

type FeatureStatus = "ENABLED" | "DISABLED" | "UNSUPPORTED" | "ENABLED_PENDING_REBOOT" | "DISABLED_PENDING_REBOOT" | "UNKNOWN"
object FeatureStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val UNSUPPORTED: "UNSUPPORTED" = "UNSUPPORTED"
  inline val ENABLED_PENDING_REBOOT: "ENABLED_PENDING_REBOOT" = "ENABLED_PENDING_REBOOT"
  inline val DISABLED_PENDING_REBOOT: "DISABLED_PENDING_REBOOT" = "DISABLED_PENDING_REBOOT"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[FeatureStatus] = js.Array(ENABLED, DISABLED, UNSUPPORTED, ENABLED_PENDING_REBOOT, DISABLED_PENDING_REBOOT, UNKNOWN)
}

type ServiceType = "RDS" | "DOCDB"
object ServiceType {
  inline val RDS: "RDS" = "RDS"
  inline val DOCDB: "DOCDB" = "DOCDB"

  inline def values: js.Array[ServiceType] = js.Array(RDS, DOCDB)
}
