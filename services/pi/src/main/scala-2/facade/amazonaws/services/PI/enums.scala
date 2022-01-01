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
sealed trait ServiceType extends js.Any
object ServiceType {
  val RDS = "RDS".asInstanceOf[ServiceType]

  @inline def values: js.Array[ServiceType] = js.Array(RDS)
}
