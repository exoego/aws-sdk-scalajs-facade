package facade.amazonaws.services.datasync

import scalajs._

type AgentStatus = "ONLINE" | "OFFLINE"
object AgentStatus {
  val ONLINE: "ONLINE" = "ONLINE"
  val OFFLINE: "OFFLINE" = "OFFLINE"

  @inline def values = js.Array[AgentStatus](ONLINE, OFFLINE)
}

type Atime = "NONE" | "BEST_EFFORT"
object Atime {
  val NONE: "NONE" = "NONE"
  val BEST_EFFORT: "BEST_EFFORT" = "BEST_EFFORT"

  @inline def values = js.Array[Atime](NONE, BEST_EFFORT)
}

type EndpointType = "PUBLIC" | "PRIVATE_LINK" | "FIPS"
object EndpointType {
  val PUBLIC: "PUBLIC" = "PUBLIC"
  val PRIVATE_LINK: "PRIVATE_LINK" = "PRIVATE_LINK"
  val FIPS: "FIPS" = "FIPS"

  @inline def values = js.Array[EndpointType](PUBLIC, PRIVATE_LINK, FIPS)
}

type FilterType = "SIMPLE_PATTERN"
object FilterType {
  val SIMPLE_PATTERN: "SIMPLE_PATTERN" = "SIMPLE_PATTERN"

  @inline def values = js.Array[FilterType](SIMPLE_PATTERN)
}

type Gid = "NONE" | "INT_VALUE" | "NAME" | "BOTH"
object Gid {
  val NONE: "NONE" = "NONE"
  val INT_VALUE: "INT_VALUE" = "INT_VALUE"
  val NAME: "NAME" = "NAME"
  val BOTH: "BOTH" = "BOTH"

  @inline def values = js.Array[Gid](NONE, INT_VALUE, NAME, BOTH)
}

type LocationFilterName = "LocationUri" | "LocationType" | "CreationTime"
object LocationFilterName {
  val LocationUri: "LocationUri" = "LocationUri"
  val LocationType: "LocationType" = "LocationType"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[LocationFilterName](LocationUri, LocationType, CreationTime)
}

type LogLevel = "OFF" | "BASIC" | "TRANSFER"
object LogLevel {
  val OFF: "OFF" = "OFF"
  val BASIC: "BASIC" = "BASIC"
  val TRANSFER: "TRANSFER" = "TRANSFER"

  @inline def values = js.Array[LogLevel](OFF, BASIC, TRANSFER)
}

type Mtime = "NONE" | "PRESERVE"
object Mtime {
  val NONE: "NONE" = "NONE"
  val PRESERVE: "PRESERVE" = "PRESERVE"

  @inline def values = js.Array[Mtime](NONE, PRESERVE)
}

type NfsVersion = "AUTOMATIC" | "NFS3" | "NFS4_0" | "NFS4_1"
object NfsVersion {
  val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  val NFS3: "NFS3" = "NFS3"
  val NFS4_0: "NFS4_0" = "NFS4_0"
  val NFS4_1: "NFS4_1" = "NFS4_1"

  @inline def values = js.Array[NfsVersion](AUTOMATIC, NFS3, NFS4_0, NFS4_1)
}

type ObjectStorageServerProtocol = "HTTPS" | "HTTP"
object ObjectStorageServerProtocol {
  val HTTPS: "HTTPS" = "HTTPS"
  val HTTP: "HTTP" = "HTTP"

  @inline def values = js.Array[ObjectStorageServerProtocol](HTTPS, HTTP)
}

type Operator = "Equals" | "NotEquals" | "In" | "LessThanOrEqual" | "LessThan" | "GreaterThanOrEqual" | "GreaterThan" | "Contains" | "NotContains" | "BeginsWith"
object Operator {
  val Equals: "Equals" = "Equals"
  val NotEquals: "NotEquals" = "NotEquals"
  val In: "In" = "In"
  val LessThanOrEqual: "LessThanOrEqual" = "LessThanOrEqual"
  val LessThan: "LessThan" = "LessThan"
  val GreaterThanOrEqual: "GreaterThanOrEqual" = "GreaterThanOrEqual"
  val GreaterThan: "GreaterThan" = "GreaterThan"
  val Contains: "Contains" = "Contains"
  val NotContains: "NotContains" = "NotContains"
  val BeginsWith: "BeginsWith" = "BeginsWith"

  @inline def values = js.Array[Operator](Equals, NotEquals, In, LessThanOrEqual, LessThan, GreaterThanOrEqual, GreaterThan, Contains, NotContains, BeginsWith)
}

type OverwriteMode = "ALWAYS" | "NEVER"
object OverwriteMode {
  val ALWAYS: "ALWAYS" = "ALWAYS"
  val NEVER: "NEVER" = "NEVER"

  @inline def values = js.Array[OverwriteMode](ALWAYS, NEVER)
}

type PhaseStatus = "PENDING" | "SUCCESS" | "ERROR"
object PhaseStatus {
  val PENDING: "PENDING" = "PENDING"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[PhaseStatus](PENDING, SUCCESS, ERROR)
}

type PosixPermissions = "NONE" | "PRESERVE"
object PosixPermissions {
  val NONE: "NONE" = "NONE"
  val PRESERVE: "PRESERVE" = "PRESERVE"

  @inline def values = js.Array[PosixPermissions](NONE, PRESERVE)
}

type PreserveDeletedFiles = "PRESERVE" | "REMOVE"
object PreserveDeletedFiles {
  val PRESERVE: "PRESERVE" = "PRESERVE"
  val REMOVE: "REMOVE" = "REMOVE"

  @inline def values = js.Array[PreserveDeletedFiles](PRESERVE, REMOVE)
}

type PreserveDevices = "NONE" | "PRESERVE"
object PreserveDevices {
  val NONE: "NONE" = "NONE"
  val PRESERVE: "PRESERVE" = "PRESERVE"

  @inline def values = js.Array[PreserveDevices](NONE, PRESERVE)
}

type S3StorageClass = "STANDARD" | "STANDARD_IA" | "ONEZONE_IA" | "INTELLIGENT_TIERING" | "GLACIER" | "DEEP_ARCHIVE" | "OUTPOSTS"
object S3StorageClass {
  val STANDARD: "STANDARD" = "STANDARD"
  val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  val GLACIER: "GLACIER" = "GLACIER"
  val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"
  val OUTPOSTS: "OUTPOSTS" = "OUTPOSTS"

  @inline def values = js.Array[S3StorageClass](STANDARD, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE, OUTPOSTS)
}

type SmbVersion = "AUTOMATIC" | "SMB2" | "SMB3"
object SmbVersion {
  val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  val SMB2: "SMB2" = "SMB2"
  val SMB3: "SMB3" = "SMB3"

  @inline def values = js.Array[SmbVersion](AUTOMATIC, SMB2, SMB3)
}

type TaskExecutionStatus = "QUEUED" | "LAUNCHING" | "PREPARING" | "TRANSFERRING" | "VERIFYING" | "SUCCESS" | "ERROR"
object TaskExecutionStatus {
  val QUEUED: "QUEUED" = "QUEUED"
  val LAUNCHING: "LAUNCHING" = "LAUNCHING"
  val PREPARING: "PREPARING" = "PREPARING"
  val TRANSFERRING: "TRANSFERRING" = "TRANSFERRING"
  val VERIFYING: "VERIFYING" = "VERIFYING"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[TaskExecutionStatus](QUEUED, LAUNCHING, PREPARING, TRANSFERRING, VERIFYING, SUCCESS, ERROR)
}

type TaskFilterName = "LocationId" | "CreationTime"
object TaskFilterName {
  val LocationId: "LocationId" = "LocationId"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[TaskFilterName](LocationId, CreationTime)
}

type TaskQueueing = "ENABLED" | "DISABLED"
object TaskQueueing {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[TaskQueueing](ENABLED, DISABLED)
}

type TaskStatus = "AVAILABLE" | "CREATING" | "QUEUED" | "RUNNING" | "UNAVAILABLE"
object TaskStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val CREATING: "CREATING" = "CREATING"
  val QUEUED: "QUEUED" = "QUEUED"
  val RUNNING: "RUNNING" = "RUNNING"
  val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"

  @inline def values = js.Array[TaskStatus](AVAILABLE, CREATING, QUEUED, RUNNING, UNAVAILABLE)
}

type TransferMode = "CHANGED" | "ALL"
object TransferMode {
  val CHANGED: "CHANGED" = "CHANGED"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[TransferMode](CHANGED, ALL)
}

type Uid = "NONE" | "INT_VALUE" | "NAME" | "BOTH"
object Uid {
  val NONE: "NONE" = "NONE"
  val INT_VALUE: "INT_VALUE" = "INT_VALUE"
  val NAME: "NAME" = "NAME"
  val BOTH: "BOTH" = "BOTH"

  @inline def values = js.Array[Uid](NONE, INT_VALUE, NAME, BOTH)
}

type VerifyMode = "POINT_IN_TIME_CONSISTENT" | "ONLY_FILES_TRANSFERRED" | "NONE"
object VerifyMode {
  val POINT_IN_TIME_CONSISTENT: "POINT_IN_TIME_CONSISTENT" = "POINT_IN_TIME_CONSISTENT"
  val ONLY_FILES_TRANSFERRED: "ONLY_FILES_TRANSFERRED" = "ONLY_FILES_TRANSFERRED"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[VerifyMode](POINT_IN_TIME_CONSISTENT, ONLY_FILES_TRANSFERRED, NONE)
}
