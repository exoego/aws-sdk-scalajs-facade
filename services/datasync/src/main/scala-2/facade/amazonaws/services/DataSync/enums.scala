package facade.amazonaws.services.datasync

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AgentStatus extends js.Any
object AgentStatus {
  val ONLINE = "ONLINE".asInstanceOf[AgentStatus]
  val OFFLINE = "OFFLINE".asInstanceOf[AgentStatus]

  @inline def values = js.Array(ONLINE, OFFLINE)
}

@js.native
sealed trait Atime extends js.Any
object Atime {
  val NONE = "NONE".asInstanceOf[Atime]
  val BEST_EFFORT = "BEST_EFFORT".asInstanceOf[Atime]

  @inline def values = js.Array(NONE, BEST_EFFORT)
}

@js.native
sealed trait EndpointType extends js.Any
object EndpointType {
  val PUBLIC = "PUBLIC".asInstanceOf[EndpointType]
  val PRIVATE_LINK = "PRIVATE_LINK".asInstanceOf[EndpointType]
  val FIPS = "FIPS".asInstanceOf[EndpointType]

  @inline def values = js.Array(PUBLIC, PRIVATE_LINK, FIPS)
}

@js.native
sealed trait FilterType extends js.Any
object FilterType {
  val SIMPLE_PATTERN = "SIMPLE_PATTERN".asInstanceOf[FilterType]

  @inline def values = js.Array(SIMPLE_PATTERN)
}

@js.native
sealed trait Gid extends js.Any
object Gid {
  val NONE = "NONE".asInstanceOf[Gid]
  val INT_VALUE = "INT_VALUE".asInstanceOf[Gid]
  val NAME = "NAME".asInstanceOf[Gid]
  val BOTH = "BOTH".asInstanceOf[Gid]

  @inline def values = js.Array(NONE, INT_VALUE, NAME, BOTH)
}

@js.native
sealed trait LocationFilterName extends js.Any
object LocationFilterName {
  val LocationUri = "LocationUri".asInstanceOf[LocationFilterName]
  val LocationType = "LocationType".asInstanceOf[LocationFilterName]
  val CreationTime = "CreationTime".asInstanceOf[LocationFilterName]

  @inline def values = js.Array(LocationUri, LocationType, CreationTime)
}

@js.native
sealed trait LogLevel extends js.Any
object LogLevel {
  val OFF = "OFF".asInstanceOf[LogLevel]
  val BASIC = "BASIC".asInstanceOf[LogLevel]
  val TRANSFER = "TRANSFER".asInstanceOf[LogLevel]

  @inline def values = js.Array(OFF, BASIC, TRANSFER)
}

@js.native
sealed trait Mtime extends js.Any
object Mtime {
  val NONE = "NONE".asInstanceOf[Mtime]
  val PRESERVE = "PRESERVE".asInstanceOf[Mtime]

  @inline def values = js.Array(NONE, PRESERVE)
}

@js.native
sealed trait NfsVersion extends js.Any
object NfsVersion {
  val AUTOMATIC = "AUTOMATIC".asInstanceOf[NfsVersion]
  val NFS3 = "NFS3".asInstanceOf[NfsVersion]
  val NFS4_0 = "NFS4_0".asInstanceOf[NfsVersion]
  val NFS4_1 = "NFS4_1".asInstanceOf[NfsVersion]

  @inline def values = js.Array(AUTOMATIC, NFS3, NFS4_0, NFS4_1)
}

@js.native
sealed trait ObjectStorageServerProtocol extends js.Any
object ObjectStorageServerProtocol {
  val HTTPS = "HTTPS".asInstanceOf[ObjectStorageServerProtocol]
  val HTTP = "HTTP".asInstanceOf[ObjectStorageServerProtocol]

  @inline def values = js.Array(HTTPS, HTTP)
}

@js.native
sealed trait Operator extends js.Any
object Operator {
  val Equals = "Equals".asInstanceOf[Operator]
  val NotEquals = "NotEquals".asInstanceOf[Operator]
  val In = "In".asInstanceOf[Operator]
  val LessThanOrEqual = "LessThanOrEqual".asInstanceOf[Operator]
  val LessThan = "LessThan".asInstanceOf[Operator]
  val GreaterThanOrEqual = "GreaterThanOrEqual".asInstanceOf[Operator]
  val GreaterThan = "GreaterThan".asInstanceOf[Operator]
  val Contains = "Contains".asInstanceOf[Operator]
  val NotContains = "NotContains".asInstanceOf[Operator]
  val BeginsWith = "BeginsWith".asInstanceOf[Operator]

  @inline def values = js.Array(Equals, NotEquals, In, LessThanOrEqual, LessThan, GreaterThanOrEqual, GreaterThan, Contains, NotContains, BeginsWith)
}

@js.native
sealed trait OverwriteMode extends js.Any
object OverwriteMode {
  val ALWAYS = "ALWAYS".asInstanceOf[OverwriteMode]
  val NEVER = "NEVER".asInstanceOf[OverwriteMode]

  @inline def values = js.Array(ALWAYS, NEVER)
}

@js.native
sealed trait PhaseStatus extends js.Any
object PhaseStatus {
  val PENDING = "PENDING".asInstanceOf[PhaseStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[PhaseStatus]
  val ERROR = "ERROR".asInstanceOf[PhaseStatus]

  @inline def values = js.Array(PENDING, SUCCESS, ERROR)
}

@js.native
sealed trait PosixPermissions extends js.Any
object PosixPermissions {
  val NONE = "NONE".asInstanceOf[PosixPermissions]
  val PRESERVE = "PRESERVE".asInstanceOf[PosixPermissions]

  @inline def values = js.Array(NONE, PRESERVE)
}

@js.native
sealed trait PreserveDeletedFiles extends js.Any
object PreserveDeletedFiles {
  val PRESERVE = "PRESERVE".asInstanceOf[PreserveDeletedFiles]
  val REMOVE = "REMOVE".asInstanceOf[PreserveDeletedFiles]

  @inline def values = js.Array(PRESERVE, REMOVE)
}

@js.native
sealed trait PreserveDevices extends js.Any
object PreserveDevices {
  val NONE = "NONE".asInstanceOf[PreserveDevices]
  val PRESERVE = "PRESERVE".asInstanceOf[PreserveDevices]

  @inline def values = js.Array(NONE, PRESERVE)
}

@js.native
sealed trait S3StorageClass extends js.Any
object S3StorageClass {
  val STANDARD = "STANDARD".asInstanceOf[S3StorageClass]
  val STANDARD_IA = "STANDARD_IA".asInstanceOf[S3StorageClass]
  val ONEZONE_IA = "ONEZONE_IA".asInstanceOf[S3StorageClass]
  val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[S3StorageClass]
  val GLACIER = "GLACIER".asInstanceOf[S3StorageClass]
  val DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[S3StorageClass]
  val OUTPOSTS = "OUTPOSTS".asInstanceOf[S3StorageClass]

  @inline def values = js.Array(STANDARD, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE, OUTPOSTS)
}

@js.native
sealed trait SmbVersion extends js.Any
object SmbVersion {
  val AUTOMATIC = "AUTOMATIC".asInstanceOf[SmbVersion]
  val SMB2 = "SMB2".asInstanceOf[SmbVersion]
  val SMB3 = "SMB3".asInstanceOf[SmbVersion]

  @inline def values = js.Array(AUTOMATIC, SMB2, SMB3)
}

@js.native
sealed trait TaskExecutionStatus extends js.Any
object TaskExecutionStatus {
  val QUEUED = "QUEUED".asInstanceOf[TaskExecutionStatus]
  val LAUNCHING = "LAUNCHING".asInstanceOf[TaskExecutionStatus]
  val PREPARING = "PREPARING".asInstanceOf[TaskExecutionStatus]
  val TRANSFERRING = "TRANSFERRING".asInstanceOf[TaskExecutionStatus]
  val VERIFYING = "VERIFYING".asInstanceOf[TaskExecutionStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[TaskExecutionStatus]
  val ERROR = "ERROR".asInstanceOf[TaskExecutionStatus]

  @inline def values = js.Array(QUEUED, LAUNCHING, PREPARING, TRANSFERRING, VERIFYING, SUCCESS, ERROR)
}

@js.native
sealed trait TaskFilterName extends js.Any
object TaskFilterName {
  val LocationId = "LocationId".asInstanceOf[TaskFilterName]
  val CreationTime = "CreationTime".asInstanceOf[TaskFilterName]

  @inline def values = js.Array(LocationId, CreationTime)
}

@js.native
sealed trait TaskQueueing extends js.Any
object TaskQueueing {
  val ENABLED = "ENABLED".asInstanceOf[TaskQueueing]
  val DISABLED = "DISABLED".asInstanceOf[TaskQueueing]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait TaskStatus extends js.Any
object TaskStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[TaskStatus]
  val CREATING = "CREATING".asInstanceOf[TaskStatus]
  val QUEUED = "QUEUED".asInstanceOf[TaskStatus]
  val RUNNING = "RUNNING".asInstanceOf[TaskStatus]
  val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[TaskStatus]

  @inline def values = js.Array(AVAILABLE, CREATING, QUEUED, RUNNING, UNAVAILABLE)
}

@js.native
sealed trait TransferMode extends js.Any
object TransferMode {
  val CHANGED = "CHANGED".asInstanceOf[TransferMode]
  val ALL = "ALL".asInstanceOf[TransferMode]

  @inline def values = js.Array(CHANGED, ALL)
}

@js.native
sealed trait Uid extends js.Any
object Uid {
  val NONE = "NONE".asInstanceOf[Uid]
  val INT_VALUE = "INT_VALUE".asInstanceOf[Uid]
  val NAME = "NAME".asInstanceOf[Uid]
  val BOTH = "BOTH".asInstanceOf[Uid]

  @inline def values = js.Array(NONE, INT_VALUE, NAME, BOTH)
}

@js.native
sealed trait VerifyMode extends js.Any
object VerifyMode {
  val POINT_IN_TIME_CONSISTENT = "POINT_IN_TIME_CONSISTENT".asInstanceOf[VerifyMode]
  val ONLY_FILES_TRANSFERRED = "ONLY_FILES_TRANSFERRED".asInstanceOf[VerifyMode]
  val NONE = "NONE".asInstanceOf[VerifyMode]

  @inline def values = js.Array(POINT_IN_TIME_CONSISTENT, ONLY_FILES_TRANSFERRED, NONE)
}

