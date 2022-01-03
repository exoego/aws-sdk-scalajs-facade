package facade.amazonaws.services.panorama

import scalajs.js

@js.native
sealed trait ApplicationInstanceHealthStatus extends js.Any
object ApplicationInstanceHealthStatus {
  val RUNNING = "RUNNING".asInstanceOf[ApplicationInstanceHealthStatus]
  val ERROR = "ERROR".asInstanceOf[ApplicationInstanceHealthStatus]
  val NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[ApplicationInstanceHealthStatus]

  @inline def values: js.Array[ApplicationInstanceHealthStatus] = js.Array(RUNNING, ERROR, NOT_AVAILABLE)
}

@js.native
sealed trait ApplicationInstanceStatus extends js.Any
object ApplicationInstanceStatus {
  val DEPLOYMENT_PENDING = "DEPLOYMENT_PENDING".asInstanceOf[ApplicationInstanceStatus]
  val DEPLOYMENT_REQUESTED = "DEPLOYMENT_REQUESTED".asInstanceOf[ApplicationInstanceStatus]
  val DEPLOYMENT_IN_PROGRESS = "DEPLOYMENT_IN_PROGRESS".asInstanceOf[ApplicationInstanceStatus]
  val DEPLOYMENT_ERROR = "DEPLOYMENT_ERROR".asInstanceOf[ApplicationInstanceStatus]
  val DEPLOYMENT_SUCCEEDED = "DEPLOYMENT_SUCCEEDED".asInstanceOf[ApplicationInstanceStatus]
  val REMOVAL_PENDING = "REMOVAL_PENDING".asInstanceOf[ApplicationInstanceStatus]
  val REMOVAL_REQUESTED = "REMOVAL_REQUESTED".asInstanceOf[ApplicationInstanceStatus]
  val REMOVAL_IN_PROGRESS = "REMOVAL_IN_PROGRESS".asInstanceOf[ApplicationInstanceStatus]
  val REMOVAL_FAILED = "REMOVAL_FAILED".asInstanceOf[ApplicationInstanceStatus]
  val REMOVAL_SUCCEEDED = "REMOVAL_SUCCEEDED".asInstanceOf[ApplicationInstanceStatus]

  @inline def values: js.Array[ApplicationInstanceStatus] = js.Array(
    DEPLOYMENT_PENDING,
    DEPLOYMENT_REQUESTED,
    DEPLOYMENT_IN_PROGRESS,
    DEPLOYMENT_ERROR,
    DEPLOYMENT_SUCCEEDED,
    REMOVAL_PENDING,
    REMOVAL_REQUESTED,
    REMOVAL_IN_PROGRESS,
    REMOVAL_FAILED,
    REMOVAL_SUCCEEDED
  )
}

@js.native
sealed trait ConnectionType extends js.Any
object ConnectionType {
  val STATIC_IP = "STATIC_IP".asInstanceOf[ConnectionType]
  val DHCP = "DHCP".asInstanceOf[ConnectionType]

  @inline def values: js.Array[ConnectionType] = js.Array(STATIC_IP, DHCP)
}

@js.native
sealed trait DeviceConnectionStatus extends js.Any
object DeviceConnectionStatus {
  val ONLINE = "ONLINE".asInstanceOf[DeviceConnectionStatus]
  val OFFLINE = "OFFLINE".asInstanceOf[DeviceConnectionStatus]
  val AWAITING_CREDENTIALS = "AWAITING_CREDENTIALS".asInstanceOf[DeviceConnectionStatus]
  val NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[DeviceConnectionStatus]
  val ERROR = "ERROR".asInstanceOf[DeviceConnectionStatus]

  @inline def values: js.Array[DeviceConnectionStatus] = js.Array(ONLINE, OFFLINE, AWAITING_CREDENTIALS, NOT_AVAILABLE, ERROR)
}

@js.native
sealed trait DeviceStatus extends js.Any
object DeviceStatus {
  val AWAITING_PROVISIONING = "AWAITING_PROVISIONING".asInstanceOf[DeviceStatus]
  val PENDING = "PENDING".asInstanceOf[DeviceStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[DeviceStatus]
  val FAILED = "FAILED".asInstanceOf[DeviceStatus]
  val ERROR = "ERROR".asInstanceOf[DeviceStatus]
  val DELETING = "DELETING".asInstanceOf[DeviceStatus]

  @inline def values: js.Array[DeviceStatus] = js.Array(AWAITING_PROVISIONING, PENDING, SUCCEEDED, FAILED, ERROR, DELETING)
}

@js.native
sealed trait DeviceType extends js.Any
object DeviceType {
  val PANORAMA_APPLIANCE_DEVELOPER_KIT = "PANORAMA_APPLIANCE_DEVELOPER_KIT".asInstanceOf[DeviceType]
  val PANORAMA_APPLIANCE = "PANORAMA_APPLIANCE".asInstanceOf[DeviceType]

  @inline def values: js.Array[DeviceType] = js.Array(PANORAMA_APPLIANCE_DEVELOPER_KIT, PANORAMA_APPLIANCE)
}

@js.native
sealed trait JobResourceType extends js.Any
object JobResourceType {
  val PACKAGE = "PACKAGE".asInstanceOf[JobResourceType]

  @inline def values: js.Array[JobResourceType] = js.Array(PACKAGE)
}

@js.native
sealed trait JobType extends js.Any
object JobType {
  val OTA = "OTA".asInstanceOf[JobType]

  @inline def values: js.Array[JobType] = js.Array(OTA)
}

@js.native
sealed trait NetworkConnectionStatus extends js.Any
object NetworkConnectionStatus {
  val CONNECTED = "CONNECTED".asInstanceOf[NetworkConnectionStatus]
  val NOT_CONNECTED = "NOT_CONNECTED".asInstanceOf[NetworkConnectionStatus]

  @inline def values: js.Array[NetworkConnectionStatus] = js.Array(CONNECTED, NOT_CONNECTED)
}

@js.native
sealed trait NodeCategory extends js.Any
object NodeCategory {
  val BUSINESS_LOGIC = "BUSINESS_LOGIC".asInstanceOf[NodeCategory]
  val ML_MODEL = "ML_MODEL".asInstanceOf[NodeCategory]
  val MEDIA_SOURCE = "MEDIA_SOURCE".asInstanceOf[NodeCategory]
  val MEDIA_SINK = "MEDIA_SINK".asInstanceOf[NodeCategory]

  @inline def values: js.Array[NodeCategory] = js.Array(BUSINESS_LOGIC, ML_MODEL, MEDIA_SOURCE, MEDIA_SINK)
}

@js.native
sealed trait NodeFromTemplateJobStatus extends js.Any
object NodeFromTemplateJobStatus {
  val PENDING = "PENDING".asInstanceOf[NodeFromTemplateJobStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[NodeFromTemplateJobStatus]
  val FAILED = "FAILED".asInstanceOf[NodeFromTemplateJobStatus]

  @inline def values: js.Array[NodeFromTemplateJobStatus] = js.Array(PENDING, SUCCEEDED, FAILED)
}

@js.native
sealed trait NodeInstanceStatus extends js.Any
object NodeInstanceStatus {
  val RUNNING = "RUNNING".asInstanceOf[NodeInstanceStatus]
  val ERROR = "ERROR".asInstanceOf[NodeInstanceStatus]
  val NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[NodeInstanceStatus]

  @inline def values: js.Array[NodeInstanceStatus] = js.Array(RUNNING, ERROR, NOT_AVAILABLE)
}

@js.native
sealed trait PackageImportJobStatus extends js.Any
object PackageImportJobStatus {
  val PENDING = "PENDING".asInstanceOf[PackageImportJobStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[PackageImportJobStatus]
  val FAILED = "FAILED".asInstanceOf[PackageImportJobStatus]

  @inline def values: js.Array[PackageImportJobStatus] = js.Array(PENDING, SUCCEEDED, FAILED)
}

@js.native
sealed trait PackageImportJobType extends js.Any
object PackageImportJobType {
  val NODE_PACKAGE_VERSION = "NODE_PACKAGE_VERSION".asInstanceOf[PackageImportJobType]

  @inline def values: js.Array[PackageImportJobType] = js.Array(NODE_PACKAGE_VERSION)
}

@js.native
sealed trait PackageVersionStatus extends js.Any
object PackageVersionStatus {
  val REGISTER_PENDING = "REGISTER_PENDING".asInstanceOf[PackageVersionStatus]
  val REGISTER_COMPLETED = "REGISTER_COMPLETED".asInstanceOf[PackageVersionStatus]
  val FAILED = "FAILED".asInstanceOf[PackageVersionStatus]
  val DELETING = "DELETING".asInstanceOf[PackageVersionStatus]

  @inline def values: js.Array[PackageVersionStatus] = js.Array(REGISTER_PENDING, REGISTER_COMPLETED, FAILED, DELETING)
}

@js.native
sealed trait PortType extends js.Any
object PortType {
  val BOOLEAN = "BOOLEAN".asInstanceOf[PortType]
  val STRING = "STRING".asInstanceOf[PortType]
  val INT32 = "INT32".asInstanceOf[PortType]
  val FLOAT32 = "FLOAT32".asInstanceOf[PortType]
  val MEDIA = "MEDIA".asInstanceOf[PortType]

  @inline def values: js.Array[PortType] = js.Array(BOOLEAN, STRING, INT32, FLOAT32, MEDIA)
}

@js.native
sealed trait StatusFilter extends js.Any
object StatusFilter {
  val DEPLOYMENT_SUCCEEDED = "DEPLOYMENT_SUCCEEDED".asInstanceOf[StatusFilter]
  val DEPLOYMENT_ERROR = "DEPLOYMENT_ERROR".asInstanceOf[StatusFilter]
  val REMOVAL_SUCCEEDED = "REMOVAL_SUCCEEDED".asInstanceOf[StatusFilter]
  val REMOVAL_FAILED = "REMOVAL_FAILED".asInstanceOf[StatusFilter]
  val PROCESSING_DEPLOYMENT = "PROCESSING_DEPLOYMENT".asInstanceOf[StatusFilter]
  val PROCESSING_REMOVAL = "PROCESSING_REMOVAL".asInstanceOf[StatusFilter]

  @inline def values: js.Array[StatusFilter] = js.Array(DEPLOYMENT_SUCCEEDED, DEPLOYMENT_ERROR, REMOVAL_SUCCEEDED, REMOVAL_FAILED, PROCESSING_DEPLOYMENT, PROCESSING_REMOVAL)
}

@js.native
sealed trait TemplateType extends js.Any
object TemplateType {
  val RTSP_CAMERA_STREAM = "RTSP_CAMERA_STREAM".asInstanceOf[TemplateType]

  @inline def values: js.Array[TemplateType] = js.Array(RTSP_CAMERA_STREAM)
}

@js.native
sealed trait UpdateProgress extends js.Any
object UpdateProgress {
  val PENDING = "PENDING".asInstanceOf[UpdateProgress]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[UpdateProgress]
  val VERIFYING = "VERIFYING".asInstanceOf[UpdateProgress]
  val REBOOTING = "REBOOTING".asInstanceOf[UpdateProgress]
  val DOWNLOADING = "DOWNLOADING".asInstanceOf[UpdateProgress]
  val COMPLETED = "COMPLETED".asInstanceOf[UpdateProgress]
  val FAILED = "FAILED".asInstanceOf[UpdateProgress]

  @inline def values: js.Array[UpdateProgress] = js.Array(PENDING, IN_PROGRESS, VERIFYING, REBOOTING, DOWNLOADING, COMPLETED, FAILED)
}
