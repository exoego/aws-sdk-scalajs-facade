package facade.amazonaws.services.privatenetworks

import scalajs.js

@js.native
sealed trait AcknowledgmentStatus extends js.Any
object AcknowledgmentStatus {
  val ACKNOWLEDGING = "ACKNOWLEDGING".asInstanceOf[AcknowledgmentStatus]
  val ACKNOWLEDGED = "ACKNOWLEDGED".asInstanceOf[AcknowledgmentStatus]
  val UNACKNOWLEDGED = "UNACKNOWLEDGED".asInstanceOf[AcknowledgmentStatus]

  @inline def values: js.Array[AcknowledgmentStatus] = js.Array(ACKNOWLEDGING, ACKNOWLEDGED, UNACKNOWLEDGED)
}

@js.native
sealed trait DeviceIdentifierFilterKeys extends js.Any
object DeviceIdentifierFilterKeys {
  val STATUS = "STATUS".asInstanceOf[DeviceIdentifierFilterKeys]
  val ORDER = "ORDER".asInstanceOf[DeviceIdentifierFilterKeys]
  val TRAFFIC_GROUP = "TRAFFIC_GROUP".asInstanceOf[DeviceIdentifierFilterKeys]

  @inline def values: js.Array[DeviceIdentifierFilterKeys] = js.Array(STATUS, ORDER, TRAFFIC_GROUP)
}

@js.native
sealed trait DeviceIdentifierStatus extends js.Any
object DeviceIdentifierStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[DeviceIdentifierStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[DeviceIdentifierStatus]

  @inline def values: js.Array[DeviceIdentifierStatus] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait ElevationReference extends js.Any
object ElevationReference {
  val AGL = "AGL".asInstanceOf[ElevationReference]
  val AMSL = "AMSL".asInstanceOf[ElevationReference]

  @inline def values: js.Array[ElevationReference] = js.Array(AGL, AMSL)
}

@js.native
sealed trait ElevationUnit extends js.Any
object ElevationUnit {
  val FEET = "FEET".asInstanceOf[ElevationUnit]

  @inline def values: js.Array[ElevationUnit] = js.Array(FEET)
}

@js.native
sealed trait HealthStatus extends js.Any
object HealthStatus {
  val INITIAL = "INITIAL".asInstanceOf[HealthStatus]
  val HEALTHY = "HEALTHY".asInstanceOf[HealthStatus]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[HealthStatus]

  @inline def values: js.Array[HealthStatus] = js.Array(INITIAL, HEALTHY, UNHEALTHY)
}

@js.native
sealed trait NetworkFilterKeys extends js.Any
object NetworkFilterKeys {
  val STATUS = "STATUS".asInstanceOf[NetworkFilterKeys]

  @inline def values: js.Array[NetworkFilterKeys] = js.Array(STATUS)
}

@js.native
sealed trait NetworkResourceDefinitionType extends js.Any
object NetworkResourceDefinitionType {
  val RADIO_UNIT = "RADIO_UNIT".asInstanceOf[NetworkResourceDefinitionType]
  val DEVICE_IDENTIFIER = "DEVICE_IDENTIFIER".asInstanceOf[NetworkResourceDefinitionType]

  @inline def values: js.Array[NetworkResourceDefinitionType] = js.Array(RADIO_UNIT, DEVICE_IDENTIFIER)
}

@js.native
sealed trait NetworkResourceFilterKeys extends js.Any
object NetworkResourceFilterKeys {
  val ORDER = "ORDER".asInstanceOf[NetworkResourceFilterKeys]
  val STATUS = "STATUS".asInstanceOf[NetworkResourceFilterKeys]

  @inline def values: js.Array[NetworkResourceFilterKeys] = js.Array(ORDER, STATUS)
}

@js.native
sealed trait NetworkResourceStatus extends js.Any
object NetworkResourceStatus {
  val PENDING = "PENDING".asInstanceOf[NetworkResourceStatus]
  val SHIPPED = "SHIPPED".asInstanceOf[NetworkResourceStatus]
  val PROVISIONING = "PROVISIONING".asInstanceOf[NetworkResourceStatus]
  val PROVISIONED = "PROVISIONED".asInstanceOf[NetworkResourceStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[NetworkResourceStatus]
  val DELETING = "DELETING".asInstanceOf[NetworkResourceStatus]
  val PENDING_RETURN = "PENDING_RETURN".asInstanceOf[NetworkResourceStatus]
  val DELETED = "DELETED".asInstanceOf[NetworkResourceStatus]

  @inline def values: js.Array[NetworkResourceStatus] = js.Array(PENDING, SHIPPED, PROVISIONING, PROVISIONED, AVAILABLE, DELETING, PENDING_RETURN, DELETED)
}

@js.native
sealed trait NetworkResourceType extends js.Any
object NetworkResourceType {
  val RADIO_UNIT = "RADIO_UNIT".asInstanceOf[NetworkResourceType]

  @inline def values: js.Array[NetworkResourceType] = js.Array(RADIO_UNIT)
}

@js.native
sealed trait NetworkSiteFilterKeys extends js.Any
object NetworkSiteFilterKeys {
  val STATUS = "STATUS".asInstanceOf[NetworkSiteFilterKeys]

  @inline def values: js.Array[NetworkSiteFilterKeys] = js.Array(STATUS)
}

@js.native
sealed trait NetworkSiteStatus extends js.Any
object NetworkSiteStatus {
  val CREATED = "CREATED".asInstanceOf[NetworkSiteStatus]
  val PROVISIONING = "PROVISIONING".asInstanceOf[NetworkSiteStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[NetworkSiteStatus]
  val DEPROVISIONING = "DEPROVISIONING".asInstanceOf[NetworkSiteStatus]
  val DELETED = "DELETED".asInstanceOf[NetworkSiteStatus]

  @inline def values: js.Array[NetworkSiteStatus] = js.Array(CREATED, PROVISIONING, AVAILABLE, DEPROVISIONING, DELETED)
}

@js.native
sealed trait NetworkStatus extends js.Any
object NetworkStatus {
  val CREATED = "CREATED".asInstanceOf[NetworkStatus]
  val PROVISIONING = "PROVISIONING".asInstanceOf[NetworkStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[NetworkStatus]
  val DEPROVISIONING = "DEPROVISIONING".asInstanceOf[NetworkStatus]
  val DELETED = "DELETED".asInstanceOf[NetworkStatus]

  @inline def values: js.Array[NetworkStatus] = js.Array(CREATED, PROVISIONING, AVAILABLE, DEPROVISIONING, DELETED)
}

@js.native
sealed trait OrderFilterKeys extends js.Any
object OrderFilterKeys {
  val STATUS = "STATUS".asInstanceOf[OrderFilterKeys]
  val NETWORK_SITE = "NETWORK_SITE".asInstanceOf[OrderFilterKeys]

  @inline def values: js.Array[OrderFilterKeys] = js.Array(STATUS, NETWORK_SITE)
}
