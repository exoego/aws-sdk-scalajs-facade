package facade.amazonaws.services.panorama

import scalajs.js

type ApplicationInstanceHealthStatus = "RUNNING" | "ERROR" | "NOT_AVAILABLE"
object ApplicationInstanceHealthStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val ERROR: "ERROR" = "ERROR"
  inline val NOT_AVAILABLE: "NOT_AVAILABLE" = "NOT_AVAILABLE"

  inline def values: js.Array[ApplicationInstanceHealthStatus] = js.Array(RUNNING, ERROR, NOT_AVAILABLE)
}

type ApplicationInstanceStatus = "DEPLOYMENT_PENDING" | "DEPLOYMENT_REQUESTED" | "DEPLOYMENT_IN_PROGRESS" | "DEPLOYMENT_ERROR" | "DEPLOYMENT_SUCCEEDED" | "REMOVAL_PENDING" | "REMOVAL_REQUESTED" | "REMOVAL_IN_PROGRESS" | "REMOVAL_FAILED" | "REMOVAL_SUCCEEDED"
object ApplicationInstanceStatus {
  inline val DEPLOYMENT_PENDING: "DEPLOYMENT_PENDING" = "DEPLOYMENT_PENDING"
  inline val DEPLOYMENT_REQUESTED: "DEPLOYMENT_REQUESTED" = "DEPLOYMENT_REQUESTED"
  inline val DEPLOYMENT_IN_PROGRESS: "DEPLOYMENT_IN_PROGRESS" = "DEPLOYMENT_IN_PROGRESS"
  inline val DEPLOYMENT_ERROR: "DEPLOYMENT_ERROR" = "DEPLOYMENT_ERROR"
  inline val DEPLOYMENT_SUCCEEDED: "DEPLOYMENT_SUCCEEDED" = "DEPLOYMENT_SUCCEEDED"
  inline val REMOVAL_PENDING: "REMOVAL_PENDING" = "REMOVAL_PENDING"
  inline val REMOVAL_REQUESTED: "REMOVAL_REQUESTED" = "REMOVAL_REQUESTED"
  inline val REMOVAL_IN_PROGRESS: "REMOVAL_IN_PROGRESS" = "REMOVAL_IN_PROGRESS"
  inline val REMOVAL_FAILED: "REMOVAL_FAILED" = "REMOVAL_FAILED"
  inline val REMOVAL_SUCCEEDED: "REMOVAL_SUCCEEDED" = "REMOVAL_SUCCEEDED"

  inline def values: js.Array[ApplicationInstanceStatus] = js.Array(
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

type ConnectionType = "STATIC_IP" | "DHCP"
object ConnectionType {
  inline val STATIC_IP: "STATIC_IP" = "STATIC_IP"
  inline val DHCP: "DHCP" = "DHCP"

  inline def values: js.Array[ConnectionType] = js.Array(STATIC_IP, DHCP)
}

type DeviceConnectionStatus = "ONLINE" | "OFFLINE" | "AWAITING_CREDENTIALS" | "NOT_AVAILABLE" | "ERROR"
object DeviceConnectionStatus {
  inline val ONLINE: "ONLINE" = "ONLINE"
  inline val OFFLINE: "OFFLINE" = "OFFLINE"
  inline val AWAITING_CREDENTIALS: "AWAITING_CREDENTIALS" = "AWAITING_CREDENTIALS"
  inline val NOT_AVAILABLE: "NOT_AVAILABLE" = "NOT_AVAILABLE"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[DeviceConnectionStatus] = js.Array(ONLINE, OFFLINE, AWAITING_CREDENTIALS, NOT_AVAILABLE, ERROR)
}

type DeviceStatus = "AWAITING_PROVISIONING" | "PENDING" | "SUCCEEDED" | "FAILED" | "ERROR" | "DELETING"
object DeviceStatus {
  inline val AWAITING_PROVISIONING: "AWAITING_PROVISIONING" = "AWAITING_PROVISIONING"
  inline val PENDING: "PENDING" = "PENDING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val ERROR: "ERROR" = "ERROR"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[DeviceStatus] = js.Array(AWAITING_PROVISIONING, PENDING, SUCCEEDED, FAILED, ERROR, DELETING)
}

type DeviceType = "PANORAMA_APPLIANCE_DEVELOPER_KIT" | "PANORAMA_APPLIANCE"
object DeviceType {
  inline val PANORAMA_APPLIANCE_DEVELOPER_KIT: "PANORAMA_APPLIANCE_DEVELOPER_KIT" = "PANORAMA_APPLIANCE_DEVELOPER_KIT"
  inline val PANORAMA_APPLIANCE: "PANORAMA_APPLIANCE" = "PANORAMA_APPLIANCE"

  inline def values: js.Array[DeviceType] = js.Array(PANORAMA_APPLIANCE_DEVELOPER_KIT, PANORAMA_APPLIANCE)
}

type JobResourceType = "PACKAGE"
object JobResourceType {
  inline val PACKAGE: "PACKAGE" = "PACKAGE"

  inline def values: js.Array[JobResourceType] = js.Array(PACKAGE)
}

type JobType = "OTA"
object JobType {
  inline val OTA: "OTA" = "OTA"

  inline def values: js.Array[JobType] = js.Array(OTA)
}

type NetworkConnectionStatus = "CONNECTED" | "NOT_CONNECTED"
object NetworkConnectionStatus {
  inline val CONNECTED: "CONNECTED" = "CONNECTED"
  inline val NOT_CONNECTED: "NOT_CONNECTED" = "NOT_CONNECTED"

  inline def values: js.Array[NetworkConnectionStatus] = js.Array(CONNECTED, NOT_CONNECTED)
}

type NodeCategory = "BUSINESS_LOGIC" | "ML_MODEL" | "MEDIA_SOURCE" | "MEDIA_SINK"
object NodeCategory {
  inline val BUSINESS_LOGIC: "BUSINESS_LOGIC" = "BUSINESS_LOGIC"
  inline val ML_MODEL: "ML_MODEL" = "ML_MODEL"
  inline val MEDIA_SOURCE: "MEDIA_SOURCE" = "MEDIA_SOURCE"
  inline val MEDIA_SINK: "MEDIA_SINK" = "MEDIA_SINK"

  inline def values: js.Array[NodeCategory] = js.Array(BUSINESS_LOGIC, ML_MODEL, MEDIA_SOURCE, MEDIA_SINK)
}

type NodeFromTemplateJobStatus = "PENDING" | "SUCCEEDED" | "FAILED"
object NodeFromTemplateJobStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[NodeFromTemplateJobStatus] = js.Array(PENDING, SUCCEEDED, FAILED)
}

type NodeInstanceStatus = "RUNNING" | "ERROR" | "NOT_AVAILABLE"
object NodeInstanceStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val ERROR: "ERROR" = "ERROR"
  inline val NOT_AVAILABLE: "NOT_AVAILABLE" = "NOT_AVAILABLE"

  inline def values: js.Array[NodeInstanceStatus] = js.Array(RUNNING, ERROR, NOT_AVAILABLE)
}

type PackageImportJobStatus = "PENDING" | "SUCCEEDED" | "FAILED"
object PackageImportJobStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[PackageImportJobStatus] = js.Array(PENDING, SUCCEEDED, FAILED)
}

type PackageImportJobType = "NODE_PACKAGE_VERSION"
object PackageImportJobType {
  inline val NODE_PACKAGE_VERSION: "NODE_PACKAGE_VERSION" = "NODE_PACKAGE_VERSION"

  inline def values: js.Array[PackageImportJobType] = js.Array(NODE_PACKAGE_VERSION)
}

type PackageVersionStatus = "REGISTER_PENDING" | "REGISTER_COMPLETED" | "FAILED" | "DELETING"
object PackageVersionStatus {
  inline val REGISTER_PENDING: "REGISTER_PENDING" = "REGISTER_PENDING"
  inline val REGISTER_COMPLETED: "REGISTER_COMPLETED" = "REGISTER_COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[PackageVersionStatus] = js.Array(REGISTER_PENDING, REGISTER_COMPLETED, FAILED, DELETING)
}

type PortType = "BOOLEAN" | "STRING" | "INT32" | "FLOAT32" | "MEDIA"
object PortType {
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  inline val STRING: "STRING" = "STRING"
  inline val INT32: "INT32" = "INT32"
  inline val FLOAT32: "FLOAT32" = "FLOAT32"
  inline val MEDIA: "MEDIA" = "MEDIA"

  inline def values: js.Array[PortType] = js.Array(BOOLEAN, STRING, INT32, FLOAT32, MEDIA)
}

type StatusFilter = "DEPLOYMENT_SUCCEEDED" | "DEPLOYMENT_ERROR" | "REMOVAL_SUCCEEDED" | "REMOVAL_FAILED" | "PROCESSING_DEPLOYMENT" | "PROCESSING_REMOVAL"
object StatusFilter {
  inline val DEPLOYMENT_SUCCEEDED: "DEPLOYMENT_SUCCEEDED" = "DEPLOYMENT_SUCCEEDED"
  inline val DEPLOYMENT_ERROR: "DEPLOYMENT_ERROR" = "DEPLOYMENT_ERROR"
  inline val REMOVAL_SUCCEEDED: "REMOVAL_SUCCEEDED" = "REMOVAL_SUCCEEDED"
  inline val REMOVAL_FAILED: "REMOVAL_FAILED" = "REMOVAL_FAILED"
  inline val PROCESSING_DEPLOYMENT: "PROCESSING_DEPLOYMENT" = "PROCESSING_DEPLOYMENT"
  inline val PROCESSING_REMOVAL: "PROCESSING_REMOVAL" = "PROCESSING_REMOVAL"

  inline def values: js.Array[StatusFilter] = js.Array(DEPLOYMENT_SUCCEEDED, DEPLOYMENT_ERROR, REMOVAL_SUCCEEDED, REMOVAL_FAILED, PROCESSING_DEPLOYMENT, PROCESSING_REMOVAL)
}

type TemplateType = "RTSP_CAMERA_STREAM"
object TemplateType {
  inline val RTSP_CAMERA_STREAM: "RTSP_CAMERA_STREAM" = "RTSP_CAMERA_STREAM"

  inline def values: js.Array[TemplateType] = js.Array(RTSP_CAMERA_STREAM)
}

type UpdateProgress = "PENDING" | "IN_PROGRESS" | "VERIFYING" | "REBOOTING" | "DOWNLOADING" | "COMPLETED" | "FAILED"
object UpdateProgress {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val VERIFYING: "VERIFYING" = "VERIFYING"
  inline val REBOOTING: "REBOOTING" = "REBOOTING"
  inline val DOWNLOADING: "DOWNLOADING" = "DOWNLOADING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[UpdateProgress] = js.Array(PENDING, IN_PROGRESS, VERIFYING, REBOOTING, DOWNLOADING, COMPLETED, FAILED)
}
