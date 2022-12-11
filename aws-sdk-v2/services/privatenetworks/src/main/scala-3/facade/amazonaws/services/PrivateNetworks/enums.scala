package facade.amazonaws.services.privatenetworks

import scalajs.js

type AcknowledgmentStatus = "ACKNOWLEDGING" | "ACKNOWLEDGED" | "UNACKNOWLEDGED"
object AcknowledgmentStatus {
  inline val ACKNOWLEDGING: "ACKNOWLEDGING" = "ACKNOWLEDGING"
  inline val ACKNOWLEDGED: "ACKNOWLEDGED" = "ACKNOWLEDGED"
  inline val UNACKNOWLEDGED: "UNACKNOWLEDGED" = "UNACKNOWLEDGED"

  inline def values: js.Array[AcknowledgmentStatus] = js.Array(ACKNOWLEDGING, ACKNOWLEDGED, UNACKNOWLEDGED)
}

type DeviceIdentifierFilterKeys = "STATUS" | "ORDER" | "TRAFFIC_GROUP"
object DeviceIdentifierFilterKeys {
  inline val STATUS: "STATUS" = "STATUS"
  inline val ORDER: "ORDER" = "ORDER"
  inline val TRAFFIC_GROUP: "TRAFFIC_GROUP" = "TRAFFIC_GROUP"

  inline def values: js.Array[DeviceIdentifierFilterKeys] = js.Array(STATUS, ORDER, TRAFFIC_GROUP)
}

type DeviceIdentifierStatus = "ACTIVE" | "INACTIVE"
object DeviceIdentifierStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[DeviceIdentifierStatus] = js.Array(ACTIVE, INACTIVE)
}

type ElevationReference = "AGL" | "AMSL"
object ElevationReference {
  inline val AGL: "AGL" = "AGL"
  inline val AMSL: "AMSL" = "AMSL"

  inline def values: js.Array[ElevationReference] = js.Array(AGL, AMSL)
}

type ElevationUnit = "FEET"
object ElevationUnit {
  inline val FEET: "FEET" = "FEET"

  inline def values: js.Array[ElevationUnit] = js.Array(FEET)
}

type HealthStatus = "INITIAL" | "HEALTHY" | "UNHEALTHY"
object HealthStatus {
  inline val INITIAL: "INITIAL" = "INITIAL"
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"

  inline def values: js.Array[HealthStatus] = js.Array(INITIAL, HEALTHY, UNHEALTHY)
}

type NetworkFilterKeys = "STATUS"
object NetworkFilterKeys {
  inline val STATUS: "STATUS" = "STATUS"

  inline def values: js.Array[NetworkFilterKeys] = js.Array(STATUS)
}

type NetworkResourceDefinitionType = "RADIO_UNIT" | "DEVICE_IDENTIFIER"
object NetworkResourceDefinitionType {
  inline val RADIO_UNIT: "RADIO_UNIT" = "RADIO_UNIT"
  inline val DEVICE_IDENTIFIER: "DEVICE_IDENTIFIER" = "DEVICE_IDENTIFIER"

  inline def values: js.Array[NetworkResourceDefinitionType] = js.Array(RADIO_UNIT, DEVICE_IDENTIFIER)
}

type NetworkResourceFilterKeys = "ORDER" | "STATUS"
object NetworkResourceFilterKeys {
  inline val ORDER: "ORDER" = "ORDER"
  inline val STATUS: "STATUS" = "STATUS"

  inline def values: js.Array[NetworkResourceFilterKeys] = js.Array(ORDER, STATUS)
}

type NetworkResourceStatus = "PENDING" | "SHIPPED" | "PROVISIONING" | "PROVISIONED" | "AVAILABLE" | "DELETING" | "PENDING_RETURN" | "DELETED"
object NetworkResourceStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val SHIPPED: "SHIPPED" = "SHIPPED"
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val PROVISIONED: "PROVISIONED" = "PROVISIONED"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val PENDING_RETURN: "PENDING_RETURN" = "PENDING_RETURN"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[NetworkResourceStatus] = js.Array(PENDING, SHIPPED, PROVISIONING, PROVISIONED, AVAILABLE, DELETING, PENDING_RETURN, DELETED)
}

type NetworkResourceType = "RADIO_UNIT"
object NetworkResourceType {
  inline val RADIO_UNIT: "RADIO_UNIT" = "RADIO_UNIT"

  inline def values: js.Array[NetworkResourceType] = js.Array(RADIO_UNIT)
}

type NetworkSiteFilterKeys = "STATUS"
object NetworkSiteFilterKeys {
  inline val STATUS: "STATUS" = "STATUS"

  inline def values: js.Array[NetworkSiteFilterKeys] = js.Array(STATUS)
}

type NetworkSiteStatus = "CREATED" | "PROVISIONING" | "AVAILABLE" | "DEPROVISIONING" | "DELETED"
object NetworkSiteStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DEPROVISIONING: "DEPROVISIONING" = "DEPROVISIONING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[NetworkSiteStatus] = js.Array(CREATED, PROVISIONING, AVAILABLE, DEPROVISIONING, DELETED)
}

type NetworkStatus = "CREATED" | "PROVISIONING" | "AVAILABLE" | "DEPROVISIONING" | "DELETED"
object NetworkStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DEPROVISIONING: "DEPROVISIONING" = "DEPROVISIONING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[NetworkStatus] = js.Array(CREATED, PROVISIONING, AVAILABLE, DEPROVISIONING, DELETED)
}

type OrderFilterKeys = "STATUS" | "NETWORK_SITE"
object OrderFilterKeys {
  inline val STATUS: "STATUS" = "STATUS"
  inline val NETWORK_SITE: "NETWORK_SITE" = "NETWORK_SITE"

  inline def values: js.Array[OrderFilterKeys] = js.Array(STATUS, NETWORK_SITE)
}
