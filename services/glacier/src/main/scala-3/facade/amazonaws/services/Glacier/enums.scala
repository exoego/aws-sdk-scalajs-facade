package facade.amazonaws.services.glacier

import scalajs._

type ActionCode = "ArchiveRetrieval" | "InventoryRetrieval" | "Select"
object ActionCode {
  val ArchiveRetrieval: "ArchiveRetrieval" = "ArchiveRetrieval"
  val InventoryRetrieval: "InventoryRetrieval" = "InventoryRetrieval"
  val Select: "Select" = "Select"

  @inline def values = js.Array[ActionCode](ArchiveRetrieval, InventoryRetrieval, Select)
}

type CannedACL = "private" | "public-read" | "public-read-write" | "aws-exec-read" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control"
object CannedACL {
  val `private`: "private" = "private"
  val `public-read`: "public-read" = "public-read"
  val `public-read-write`: "public-read-write" = "public-read-write"
  val `aws-exec-read`: "aws-exec-read" = "aws-exec-read"
  val `authenticated-read`: "authenticated-read" = "authenticated-read"
  val `bucket-owner-read`: "bucket-owner-read" = "bucket-owner-read"
  val `bucket-owner-full-control`: "bucket-owner-full-control" = "bucket-owner-full-control"

  @inline def values = js.Array[CannedACL](`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`)
}

type EncryptionType = "aws:kms" | "AES256"
object EncryptionType {
  val `aws:kms`: "aws:kms" = "aws:kms"
  val AES256: "AES256" = "AES256"

  @inline def values = js.Array[EncryptionType](`aws:kms`, AES256)
}

type ExpressionType = "SQL"
object ExpressionType {
  val SQL: "SQL" = "SQL"

  @inline def values = js.Array[ExpressionType](SQL)
}

type FileHeaderInfo = "USE" | "IGNORE" | "NONE"
object FileHeaderInfo {
  val USE: "USE" = "USE"
  val IGNORE: "IGNORE" = "IGNORE"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[FileHeaderInfo](USE, IGNORE, NONE)
}

type Permission = "FULL_CONTROL" | "WRITE" | "WRITE_ACP" | "READ" | "READ_ACP"
object Permission {
  val FULL_CONTROL: "FULL_CONTROL" = "FULL_CONTROL"
  val WRITE: "WRITE" = "WRITE"
  val WRITE_ACP: "WRITE_ACP" = "WRITE_ACP"
  val READ: "READ" = "READ"
  val READ_ACP: "READ_ACP" = "READ_ACP"

  @inline def values = js.Array[Permission](FULL_CONTROL, WRITE, WRITE_ACP, READ, READ_ACP)
}

type QuoteFields = "ALWAYS" | "ASNEEDED"
object QuoteFields {
  val ALWAYS: "ALWAYS" = "ALWAYS"
  val ASNEEDED: "ASNEEDED" = "ASNEEDED"

  @inline def values = js.Array[QuoteFields](ALWAYS, ASNEEDED)
}

type StatusCode = "InProgress" | "Succeeded" | "Failed"
object StatusCode {
  val InProgress: "InProgress" = "InProgress"
  val Succeeded: "Succeeded" = "Succeeded"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[StatusCode](InProgress, Succeeded, Failed)
}

type StorageClass = "STANDARD" | "REDUCED_REDUNDANCY" | "STANDARD_IA"
object StorageClass {
  val STANDARD: "STANDARD" = "STANDARD"
  val REDUCED_REDUNDANCY: "REDUCED_REDUNDANCY" = "REDUCED_REDUNDANCY"
  val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"

  @inline def values = js.Array[StorageClass](STANDARD, REDUCED_REDUNDANCY, STANDARD_IA)
}

type Type = "AmazonCustomerByEmail" | "CanonicalUser" | "Group"
object Type {
  val AmazonCustomerByEmail: "AmazonCustomerByEmail" = "AmazonCustomerByEmail"
  val CanonicalUser: "CanonicalUser" = "CanonicalUser"
  val Group: "Group" = "Group"

  @inline def values = js.Array[Type](AmazonCustomerByEmail, CanonicalUser, Group)
}
