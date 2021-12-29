package facade.amazonaws.services.storagegateway

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ActiveDirectoryStatus extends js.Any
object ActiveDirectoryStatus {
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[ActiveDirectoryStatus]
  val DETACHED = "DETACHED".asInstanceOf[ActiveDirectoryStatus]
  val JOINED = "JOINED".asInstanceOf[ActiveDirectoryStatus]
  val JOINING = "JOINING".asInstanceOf[ActiveDirectoryStatus]
  val NETWORK_ERROR = "NETWORK_ERROR".asInstanceOf[ActiveDirectoryStatus]
  val TIMEOUT = "TIMEOUT".asInstanceOf[ActiveDirectoryStatus]
  val UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[ActiveDirectoryStatus]

  @inline def values = js.Array(ACCESS_DENIED, DETACHED, JOINED, JOINING, NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR)
}

@js.native
sealed trait AvailabilityMonitorTestStatus extends js.Any
object AvailabilityMonitorTestStatus {
  val COMPLETE = "COMPLETE".asInstanceOf[AvailabilityMonitorTestStatus]
  val FAILED = "FAILED".asInstanceOf[AvailabilityMonitorTestStatus]
  val PENDING = "PENDING".asInstanceOf[AvailabilityMonitorTestStatus]

  @inline def values = js.Array(COMPLETE, FAILED, PENDING)
}

@js.native
sealed trait CaseSensitivity extends js.Any
object CaseSensitivity {
  val ClientSpecified = "ClientSpecified".asInstanceOf[CaseSensitivity]
  val CaseSensitive = "CaseSensitive".asInstanceOf[CaseSensitivity]

  @inline def values = js.Array(ClientSpecified, CaseSensitive)
}

/** The type of the file share.
  */
@js.native
sealed trait FileShareType extends js.Any
object FileShareType {
  val NFS = "NFS".asInstanceOf[FileShareType]
  val SMB = "SMB".asInstanceOf[FileShareType]

  @inline def values = js.Array(NFS, SMB)
}

@js.native
sealed trait HostEnvironment extends js.Any
object HostEnvironment {
  val VMWARE = "VMWARE".asInstanceOf[HostEnvironment]
  val `HYPER-V` = "HYPER-V".asInstanceOf[HostEnvironment]
  val EC2 = "EC2".asInstanceOf[HostEnvironment]
  val KVM = "KVM".asInstanceOf[HostEnvironment]
  val OTHER = "OTHER".asInstanceOf[HostEnvironment]

  @inline def values = js.Array(VMWARE, `HYPER-V`, EC2, KVM, OTHER)
}

/** A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file gateway puts objects into. The default value is <code>private</code>.
  */
@js.native
sealed trait ObjectACL extends js.Any
object ObjectACL {
  val `private` = "private".asInstanceOf[ObjectACL]
  val `public-read` = "public-read".asInstanceOf[ObjectACL]
  val `public-read-write` = "public-read-write".asInstanceOf[ObjectACL]
  val `authenticated-read` = "authenticated-read".asInstanceOf[ObjectACL]
  val `bucket-owner-read` = "bucket-owner-read".asInstanceOf[ObjectACL]
  val `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[ObjectACL]
  val `aws-exec-read` = "aws-exec-read".asInstanceOf[ObjectACL]

  @inline def values = js.Array(`private`, `public-read`, `public-read-write`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`, `aws-exec-read`)
}

@js.native
sealed trait PoolStatus extends js.Any
object PoolStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[PoolStatus]
  val DELETED = "DELETED".asInstanceOf[PoolStatus]

  @inline def values = js.Array(ACTIVE, DELETED)
}

@js.native
sealed trait RetentionLockType extends js.Any
object RetentionLockType {
  val COMPLIANCE = "COMPLIANCE".asInstanceOf[RetentionLockType]
  val GOVERNANCE = "GOVERNANCE".asInstanceOf[RetentionLockType]
  val NONE = "NONE".asInstanceOf[RetentionLockType]

  @inline def values = js.Array(COMPLIANCE, GOVERNANCE, NONE)
}

@js.native
sealed trait SMBSecurityStrategy extends js.Any
object SMBSecurityStrategy {
  val ClientSpecified = "ClientSpecified".asInstanceOf[SMBSecurityStrategy]
  val MandatorySigning = "MandatorySigning".asInstanceOf[SMBSecurityStrategy]
  val MandatoryEncryption = "MandatoryEncryption".asInstanceOf[SMBSecurityStrategy]

  @inline def values = js.Array(ClientSpecified, MandatorySigning, MandatoryEncryption)
}

@js.native
sealed trait TapeStorageClass extends js.Any
object TapeStorageClass {
  val DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[TapeStorageClass]
  val GLACIER = "GLACIER".asInstanceOf[TapeStorageClass]

  @inline def values = js.Array(DEEP_ARCHIVE, GLACIER)
}

