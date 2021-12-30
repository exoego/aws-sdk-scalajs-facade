package facade.amazonaws.services.datasync

import scalajs.js

type AgentStatus = "ONLINE" | "OFFLINE"
object AgentStatus {
  inline val ONLINE: "ONLINE" = "ONLINE"
  inline val OFFLINE: "OFFLINE" = "OFFLINE"

  inline def values: js.Array[AgentStatus] = js.Array(ONLINE, OFFLINE)
}

type Atime = "NONE" | "BEST_EFFORT"
object Atime {
  inline val NONE: "NONE" = "NONE"
  inline val BEST_EFFORT: "BEST_EFFORT" = "BEST_EFFORT"

  inline def values: js.Array[Atime] = js.Array(NONE, BEST_EFFORT)
}

type EndpointType = "PUBLIC" | "PRIVATE_LINK" | "FIPS"
object EndpointType {
  inline val PUBLIC: "PUBLIC" = "PUBLIC"
  inline val PRIVATE_LINK: "PRIVATE_LINK" = "PRIVATE_LINK"
  inline val FIPS: "FIPS" = "FIPS"

  inline def values: js.Array[EndpointType] = js.Array(PUBLIC, PRIVATE_LINK, FIPS)
}

type FilterType = "SIMPLE_PATTERN"
object FilterType {
  inline val SIMPLE_PATTERN: "SIMPLE_PATTERN" = "SIMPLE_PATTERN"

  inline def values: js.Array[FilterType] = js.Array(SIMPLE_PATTERN)
}

type Gid = "NONE" | "INT_VALUE" | "NAME" | "BOTH"
object Gid {
  inline val NONE: "NONE" = "NONE"
  inline val INT_VALUE: "INT_VALUE" = "INT_VALUE"
  inline val NAME: "NAME" = "NAME"
  inline val BOTH: "BOTH" = "BOTH"

  inline def values: js.Array[Gid] = js.Array(NONE, INT_VALUE, NAME, BOTH)
}

type LocationFilterName = "LocationUri" | "LocationType" | "CreationTime"
object LocationFilterName {
  inline val LocationUri: "LocationUri" = "LocationUri"
  inline val LocationType: "LocationType" = "LocationType"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[LocationFilterName] = js.Array(LocationUri, LocationType, CreationTime)
}

type LogLevel = "OFF" | "BASIC" | "TRANSFER"
object LogLevel {
  inline val OFF: "OFF" = "OFF"
  inline val BASIC: "BASIC" = "BASIC"
  inline val TRANSFER: "TRANSFER" = "TRANSFER"

  inline def values: js.Array[LogLevel] = js.Array(OFF, BASIC, TRANSFER)
}

type Mtime = "NONE" | "PRESERVE"
object Mtime {
  inline val NONE: "NONE" = "NONE"
  inline val PRESERVE: "PRESERVE" = "PRESERVE"

  inline def values: js.Array[Mtime] = js.Array(NONE, PRESERVE)
}

type NfsVersion = "AUTOMATIC" | "NFS3" | "NFS4_0" | "NFS4_1"
object NfsVersion {
  inline val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  inline val NFS3: "NFS3" = "NFS3"
  inline val NFS4_0: "NFS4_0" = "NFS4_0"
  inline val NFS4_1: "NFS4_1" = "NFS4_1"

  inline def values: js.Array[NfsVersion] = js.Array(AUTOMATIC, NFS3, NFS4_0, NFS4_1)
}

type ObjectStorageServerProtocol = "HTTPS" | "HTTP"
object ObjectStorageServerProtocol {
  inline val HTTPS: "HTTPS" = "HTTPS"
  inline val HTTP: "HTTP" = "HTTP"

  inline def values: js.Array[ObjectStorageServerProtocol] = js.Array(HTTPS, HTTP)
}

type Operator = "Equals" | "NotEquals" | "In" | "LessThanOrEqual" | "LessThan" | "GreaterThanOrEqual" | "GreaterThan" | "Contains" | "NotContains" | "BeginsWith"
object Operator {
  inline val Equals: "Equals" = "Equals"
  inline val NotEquals: "NotEquals" = "NotEquals"
  inline val In: "In" = "In"
  inline val LessThanOrEqual: "LessThanOrEqual" = "LessThanOrEqual"
  inline val LessThan: "LessThan" = "LessThan"
  inline val GreaterThanOrEqual: "GreaterThanOrEqual" = "GreaterThanOrEqual"
  inline val GreaterThan: "GreaterThan" = "GreaterThan"
  inline val Contains: "Contains" = "Contains"
  inline val NotContains: "NotContains" = "NotContains"
  inline val BeginsWith: "BeginsWith" = "BeginsWith"

  inline def values: js.Array[Operator] = js.Array(Equals, NotEquals, In, LessThanOrEqual, LessThan, GreaterThanOrEqual, GreaterThan, Contains, NotContains, BeginsWith)
}

type OverwriteMode = "ALWAYS" | "NEVER"
object OverwriteMode {
  inline val ALWAYS: "ALWAYS" = "ALWAYS"
  inline val NEVER: "NEVER" = "NEVER"

  inline def values: js.Array[OverwriteMode] = js.Array(ALWAYS, NEVER)
}

type PhaseStatus = "PENDING" | "SUCCESS" | "ERROR"
object PhaseStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[PhaseStatus] = js.Array(PENDING, SUCCESS, ERROR)
}

type PosixPermissions = "NONE" | "PRESERVE"
object PosixPermissions {
  inline val NONE: "NONE" = "NONE"
  inline val PRESERVE: "PRESERVE" = "PRESERVE"

  inline def values: js.Array[PosixPermissions] = js.Array(NONE, PRESERVE)
}

type PreserveDeletedFiles = "PRESERVE" | "REMOVE"
object PreserveDeletedFiles {
  inline val PRESERVE: "PRESERVE" = "PRESERVE"
  inline val REMOVE: "REMOVE" = "REMOVE"

  inline def values: js.Array[PreserveDeletedFiles] = js.Array(PRESERVE, REMOVE)
}

type PreserveDevices = "NONE" | "PRESERVE"
object PreserveDevices {
  inline val NONE: "NONE" = "NONE"
  inline val PRESERVE: "PRESERVE" = "PRESERVE"

  inline def values: js.Array[PreserveDevices] = js.Array(NONE, PRESERVE)
}

type S3StorageClass = "STANDARD" | "STANDARD_IA" | "ONEZONE_IA" | "INTELLIGENT_TIERING" | "GLACIER" | "DEEP_ARCHIVE" | "OUTPOSTS"
object S3StorageClass {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  inline val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  inline val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  inline val GLACIER: "GLACIER" = "GLACIER"
  inline val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"
  inline val OUTPOSTS: "OUTPOSTS" = "OUTPOSTS"

  inline def values: js.Array[S3StorageClass] = js.Array(STANDARD, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE, OUTPOSTS)
}

type SmbVersion = "AUTOMATIC" | "SMB2" | "SMB3"
object SmbVersion {
  inline val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  inline val SMB2: "SMB2" = "SMB2"
  inline val SMB3: "SMB3" = "SMB3"

  inline def values: js.Array[SmbVersion] = js.Array(AUTOMATIC, SMB2, SMB3)
}

type TaskExecutionStatus = "QUEUED" | "LAUNCHING" | "PREPARING" | "TRANSFERRING" | "VERIFYING" | "SUCCESS" | "ERROR"
object TaskExecutionStatus {
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val LAUNCHING: "LAUNCHING" = "LAUNCHING"
  inline val PREPARING: "PREPARING" = "PREPARING"
  inline val TRANSFERRING: "TRANSFERRING" = "TRANSFERRING"
  inline val VERIFYING: "VERIFYING" = "VERIFYING"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[TaskExecutionStatus] = js.Array(QUEUED, LAUNCHING, PREPARING, TRANSFERRING, VERIFYING, SUCCESS, ERROR)
}

type TaskFilterName = "LocationId" | "CreationTime"
object TaskFilterName {
  inline val LocationId: "LocationId" = "LocationId"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[TaskFilterName] = js.Array(LocationId, CreationTime)
}

type TaskQueueing = "ENABLED" | "DISABLED"
object TaskQueueing {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[TaskQueueing] = js.Array(ENABLED, DISABLED)
}

type TaskStatus = "AVAILABLE" | "CREATING" | "QUEUED" | "RUNNING" | "UNAVAILABLE"
object TaskStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"

  inline def values: js.Array[TaskStatus] = js.Array(AVAILABLE, CREATING, QUEUED, RUNNING, UNAVAILABLE)
}

type TransferMode = "CHANGED" | "ALL"
object TransferMode {
  inline val CHANGED: "CHANGED" = "CHANGED"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[TransferMode] = js.Array(CHANGED, ALL)
}

type Uid = "NONE" | "INT_VALUE" | "NAME" | "BOTH"
object Uid {
  inline val NONE: "NONE" = "NONE"
  inline val INT_VALUE: "INT_VALUE" = "INT_VALUE"
  inline val NAME: "NAME" = "NAME"
  inline val BOTH: "BOTH" = "BOTH"

  inline def values: js.Array[Uid] = js.Array(NONE, INT_VALUE, NAME, BOTH)
}

type VerifyMode = "POINT_IN_TIME_CONSISTENT" | "ONLY_FILES_TRANSFERRED" | "NONE"
object VerifyMode {
  inline val POINT_IN_TIME_CONSISTENT: "POINT_IN_TIME_CONSISTENT" = "POINT_IN_TIME_CONSISTENT"
  inline val ONLY_FILES_TRANSFERRED: "ONLY_FILES_TRANSFERRED" = "ONLY_FILES_TRANSFERRED"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[VerifyMode] = js.Array(POINT_IN_TIME_CONSISTENT, ONLY_FILES_TRANSFERRED, NONE)
}
