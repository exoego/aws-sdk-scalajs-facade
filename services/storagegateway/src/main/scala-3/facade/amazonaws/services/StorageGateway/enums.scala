package facade.amazonaws.services.storagegateway

import scalajs._

type ActiveDirectoryStatus = "ACCESS_DENIED" | "DETACHED" | "JOINED" | "JOINING" | "NETWORK_ERROR" | "TIMEOUT" | "UNKNOWN_ERROR"
object ActiveDirectoryStatus {
  val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  val DETACHED: "DETACHED" = "DETACHED"
  val JOINED: "JOINED" = "JOINED"
  val JOINING: "JOINING" = "JOINING"
  val NETWORK_ERROR: "NETWORK_ERROR" = "NETWORK_ERROR"
  val TIMEOUT: "TIMEOUT" = "TIMEOUT"
  val UNKNOWN_ERROR: "UNKNOWN_ERROR" = "UNKNOWN_ERROR"

  @inline def values = js.Array[ActiveDirectoryStatus](ACCESS_DENIED, DETACHED, JOINED, JOINING, NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR)
}

type AvailabilityMonitorTestStatus = "COMPLETE" | "FAILED" | "PENDING"
object AvailabilityMonitorTestStatus {
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val FAILED: "FAILED" = "FAILED"
  val PENDING: "PENDING" = "PENDING"

  @inline def values = js.Array[AvailabilityMonitorTestStatus](COMPLETE, FAILED, PENDING)
}

type CaseSensitivity = "ClientSpecified" | "CaseSensitive"
object CaseSensitivity {
  val ClientSpecified: "ClientSpecified" = "ClientSpecified"
  val CaseSensitive: "CaseSensitive" = "CaseSensitive"

  @inline def values = js.Array[CaseSensitivity](ClientSpecified, CaseSensitive)
}

/** The type of the file share.
  */
type FileShareType = "NFS" | "SMB"
object FileShareType {
  val NFS: "NFS" = "NFS"
  val SMB: "SMB" = "SMB"

  @inline def values = js.Array[FileShareType](NFS, SMB)
}

type HostEnvironment = "VMWARE" | "HYPER-V" | "EC2" | "KVM" | "OTHER"
object HostEnvironment {
  val VMWARE: "VMWARE" = "VMWARE"
  val `HYPER-V`: "HYPER-V" = "HYPER-V"
  val EC2: "EC2" = "EC2"
  val KVM: "KVM" = "KVM"
  val OTHER: "OTHER" = "OTHER"

  @inline def values = js.Array[HostEnvironment](VMWARE, `HYPER-V`, EC2, KVM, OTHER)
}

/** A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file gateway puts objects into. The default value is <code>private</code>.
  */
type ObjectACL = "private" | "public-read" | "public-read-write" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | "aws-exec-read"
object ObjectACL {
  val `private`: "private" = "private"
  val `public-read`: "public-read" = "public-read"
  val `public-read-write`: "public-read-write" = "public-read-write"
  val `authenticated-read`: "authenticated-read" = "authenticated-read"
  val `bucket-owner-read`: "bucket-owner-read" = "bucket-owner-read"
  val `bucket-owner-full-control`: "bucket-owner-full-control" = "bucket-owner-full-control"
  val `aws-exec-read`: "aws-exec-read" = "aws-exec-read"

  @inline def values = js.Array[ObjectACL](`private`, `public-read`, `public-read-write`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`, `aws-exec-read`)
}

type PoolStatus = "ACTIVE" | "DELETED"
object PoolStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[PoolStatus](ACTIVE, DELETED)
}

type RetentionLockType = "COMPLIANCE" | "GOVERNANCE" | "NONE"
object RetentionLockType {
  val COMPLIANCE: "COMPLIANCE" = "COMPLIANCE"
  val GOVERNANCE: "GOVERNANCE" = "GOVERNANCE"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[RetentionLockType](COMPLIANCE, GOVERNANCE, NONE)
}

type SMBSecurityStrategy = "ClientSpecified" | "MandatorySigning" | "MandatoryEncryption"
object SMBSecurityStrategy {
  val ClientSpecified: "ClientSpecified" = "ClientSpecified"
  val MandatorySigning: "MandatorySigning" = "MandatorySigning"
  val MandatoryEncryption: "MandatoryEncryption" = "MandatoryEncryption"

  @inline def values = js.Array[SMBSecurityStrategy](ClientSpecified, MandatorySigning, MandatoryEncryption)
}

type TapeStorageClass = "DEEP_ARCHIVE" | "GLACIER"
object TapeStorageClass {
  val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"
  val GLACIER: "GLACIER" = "GLACIER"

  @inline def values = js.Array[TapeStorageClass](DEEP_ARCHIVE, GLACIER)
}
