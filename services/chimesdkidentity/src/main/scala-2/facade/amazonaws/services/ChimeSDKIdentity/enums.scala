package facade.amazonaws.services.chimesdkidentity

import scalajs.js

@js.native
sealed trait AllowMessages extends js.Any
object AllowMessages {
  val ALL = "ALL".asInstanceOf[AllowMessages]
  val NONE = "NONE".asInstanceOf[AllowMessages]

  @inline def values: js.Array[AllowMessages] = js.Array(ALL, NONE)
}

@js.native
sealed trait AppInstanceUserEndpointType extends js.Any
object AppInstanceUserEndpointType {
  val APNS = "APNS".asInstanceOf[AppInstanceUserEndpointType]
  val APNS_SANDBOX = "APNS_SANDBOX".asInstanceOf[AppInstanceUserEndpointType]
  val GCM = "GCM".asInstanceOf[AppInstanceUserEndpointType]

  @inline def values: js.Array[AppInstanceUserEndpointType] = js.Array(APNS, APNS_SANDBOX, GCM)
}

@js.native
sealed trait EndpointStatus extends js.Any
object EndpointStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[EndpointStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[EndpointStatus]

  @inline def values: js.Array[EndpointStatus] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait EndpointStatusReason extends js.Any
object EndpointStatusReason {
  val INVALID_DEVICE_TOKEN = "INVALID_DEVICE_TOKEN".asInstanceOf[EndpointStatusReason]
  val INVALID_PINPOINT_ARN = "INVALID_PINPOINT_ARN".asInstanceOf[EndpointStatusReason]

  @inline def values: js.Array[EndpointStatusReason] = js.Array(INVALID_DEVICE_TOKEN, INVALID_PINPOINT_ARN)
}
