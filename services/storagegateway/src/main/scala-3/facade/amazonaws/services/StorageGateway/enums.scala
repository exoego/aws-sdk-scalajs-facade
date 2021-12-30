package facade.amazonaws.services.storagegateway

import scalajs.js

type ActiveDirectoryStatus = "ACCESS_DENIED" | "DETACHED" | "JOINED" | "JOINING" | "NETWORK_ERROR" | "TIMEOUT" | "UNKNOWN_ERROR"
object ActiveDirectoryStatus {
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  inline val DETACHED: "DETACHED" = "DETACHED"
  inline val JOINED: "JOINED" = "JOINED"
  inline val JOINING: "JOINING" = "JOINING"
  inline val NETWORK_ERROR: "NETWORK_ERROR" = "NETWORK_ERROR"
  inline val TIMEOUT: "TIMEOUT" = "TIMEOUT"
  inline val UNKNOWN_ERROR: "UNKNOWN_ERROR" = "UNKNOWN_ERROR"

  inline def values: js.Array[ActiveDirectoryStatus] = js.Array(ACCESS_DENIED, DETACHED, JOINED, JOINING, NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR)
}

type AvailabilityMonitorTestStatus = "COMPLETE" | "FAILED" | "PENDING"
object AvailabilityMonitorTestStatus {
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val FAILED: "FAILED" = "FAILED"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[AvailabilityMonitorTestStatus] = js.Array(COMPLETE, FAILED, PENDING)
}

type CaseSensitivity = "ClientSpecified" | "CaseSensitive"
object CaseSensitivity {
  inline val ClientSpecified: "ClientSpecified" = "ClientSpecified"
  inline val CaseSensitive: "CaseSensitive" = "CaseSensitive"

  inline def values: js.Array[CaseSensitivity] = js.Array(ClientSpecified, CaseSensitive)
}

/** The type of the file share.
  */
type FileShareType = "NFS" | "SMB"
object FileShareType {
  inline val NFS: "NFS" = "NFS"
  inline val SMB: "SMB" = "SMB"

  inline def values: js.Array[FileShareType] = js.Array(NFS, SMB)
}

type HostEnvironment = "VMWARE" | "HYPER-V" | "EC2" | "KVM" | "OTHER"
object HostEnvironment {
  inline val VMWARE: "VMWARE" = "VMWARE"
  inline val `HYPER-V`: "HYPER-V" = "HYPER-V"
  inline val EC2: "EC2" = "EC2"
  inline val KVM: "KVM" = "KVM"
  inline val OTHER: "OTHER" = "OTHER"

  inline def values: js.Array[HostEnvironment] = js.Array(VMWARE, `HYPER-V`, EC2, KVM, OTHER)
}

/** A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file gateway puts objects into. The default value is <code>private</code>.
  */
type ObjectACL = "private" | "public-read" | "public-read-write" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | "aws-exec-read"
object ObjectACL {
  inline val `private`: "private" = "private"
  inline val `public-read`: "public-read" = "public-read"
  inline val `public-read-write`: "public-read-write" = "public-read-write"
  inline val `authenticated-read`: "authenticated-read" = "authenticated-read"
  inline val `bucket-owner-read`: "bucket-owner-read" = "bucket-owner-read"
  inline val `bucket-owner-full-control`: "bucket-owner-full-control" = "bucket-owner-full-control"
  inline val `aws-exec-read`: "aws-exec-read" = "aws-exec-read"

  inline def values: js.Array[ObjectACL] = js.Array(`private`, `public-read`, `public-read-write`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`, `aws-exec-read`)
}

type PoolStatus = "ACTIVE" | "DELETED"
object PoolStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[PoolStatus] = js.Array(ACTIVE, DELETED)
}

type RetentionLockType = "COMPLIANCE" | "GOVERNANCE" | "NONE"
object RetentionLockType {
  inline val COMPLIANCE: "COMPLIANCE" = "COMPLIANCE"
  inline val GOVERNANCE: "GOVERNANCE" = "GOVERNANCE"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[RetentionLockType] = js.Array(COMPLIANCE, GOVERNANCE, NONE)
}

type SMBSecurityStrategy = "ClientSpecified" | "MandatorySigning" | "MandatoryEncryption"
object SMBSecurityStrategy {
  inline val ClientSpecified: "ClientSpecified" = "ClientSpecified"
  inline val MandatorySigning: "MandatorySigning" = "MandatorySigning"
  inline val MandatoryEncryption: "MandatoryEncryption" = "MandatoryEncryption"

  inline def values: js.Array[SMBSecurityStrategy] = js.Array(ClientSpecified, MandatorySigning, MandatoryEncryption)
}

type TapeStorageClass = "DEEP_ARCHIVE" | "GLACIER"
object TapeStorageClass {
  inline val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"
  inline val GLACIER: "GLACIER" = "GLACIER"

  inline def values: js.Array[TapeStorageClass] = js.Array(DEEP_ARCHIVE, GLACIER)
}
