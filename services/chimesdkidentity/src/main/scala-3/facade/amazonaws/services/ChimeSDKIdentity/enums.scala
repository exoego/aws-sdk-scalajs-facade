package facade.amazonaws.services.chimesdkidentity

import scalajs.js

type AllowMessages = "ALL" | "NONE"
object AllowMessages {
  inline val ALL: "ALL" = "ALL"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[AllowMessages] = js.Array(ALL, NONE)
}

type AppInstanceUserEndpointType = "APNS" | "APNS_SANDBOX" | "GCM"
object AppInstanceUserEndpointType {
  inline val APNS: "APNS" = "APNS"
  inline val APNS_SANDBOX: "APNS_SANDBOX" = "APNS_SANDBOX"
  inline val GCM: "GCM" = "GCM"

  inline def values: js.Array[AppInstanceUserEndpointType] = js.Array(APNS, APNS_SANDBOX, GCM)
}

type EndpointStatus = "ACTIVE" | "INACTIVE"
object EndpointStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[EndpointStatus] = js.Array(ACTIVE, INACTIVE)
}

type EndpointStatusReason = "INVALID_DEVICE_TOKEN" | "INVALID_PINPOINT_ARN"
object EndpointStatusReason {
  inline val INVALID_DEVICE_TOKEN: "INVALID_DEVICE_TOKEN" = "INVALID_DEVICE_TOKEN"
  inline val INVALID_PINPOINT_ARN: "INVALID_PINPOINT_ARN" = "INVALID_PINPOINT_ARN"

  inline def values: js.Array[EndpointStatusReason] = js.Array(INVALID_DEVICE_TOKEN, INVALID_PINPOINT_ARN)
}
