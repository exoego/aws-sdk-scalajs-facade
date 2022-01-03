package facade.amazonaws.services.pi

import scalajs.js

type DetailStatus = "AVAILABLE" | "PROCESSING" | "UNAVAILABLE"
object DetailStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"

  inline def values: js.Array[DetailStatus] = js.Array(AVAILABLE, PROCESSING, UNAVAILABLE)
}

type ServiceType = "RDS"
object ServiceType {
  inline val RDS: "RDS" = "RDS"

  inline def values: js.Array[ServiceType] = js.Array(RDS)
}
