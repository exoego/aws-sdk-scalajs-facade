package facade.amazonaws.services.glacier

import scalajs._

type ActionCode = "ArchiveRetrieval" | "InventoryRetrieval" | "Select"
object ActionCode {
  inline val ArchiveRetrieval: "ArchiveRetrieval" = "ArchiveRetrieval"
  inline val InventoryRetrieval: "InventoryRetrieval" = "InventoryRetrieval"
  inline val Select: "Select" = "Select"

  inline def values: js.Array[ActionCode] = js.Array(ArchiveRetrieval, InventoryRetrieval, Select)
}

type CannedACL = "private" | "public-read" | "public-read-write" | "aws-exec-read" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control"
object CannedACL {
  inline val `private`: "private" = "private"
  inline val `public-read`: "public-read" = "public-read"
  inline val `public-read-write`: "public-read-write" = "public-read-write"
  inline val `aws-exec-read`: "aws-exec-read" = "aws-exec-read"
  inline val `authenticated-read`: "authenticated-read" = "authenticated-read"
  inline val `bucket-owner-read`: "bucket-owner-read" = "bucket-owner-read"
  inline val `bucket-owner-full-control`: "bucket-owner-full-control" = "bucket-owner-full-control"

  inline def values: js.Array[CannedACL] = js.Array(`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`)
}

type EncryptionType = "aws:kms" | "AES256"
object EncryptionType {
  inline val `aws:kms`: "aws:kms" = "aws:kms"
  inline val AES256: "AES256" = "AES256"

  inline def values: js.Array[EncryptionType] = js.Array(`aws:kms`, AES256)
}

type ExpressionType = "SQL"
object ExpressionType {
  inline val SQL: "SQL" = "SQL"

  inline def values: js.Array[ExpressionType] = js.Array(SQL)
}

type FileHeaderInfo = "USE" | "IGNORE" | "NONE"
object FileHeaderInfo {
  inline val USE: "USE" = "USE"
  inline val IGNORE: "IGNORE" = "IGNORE"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[FileHeaderInfo] = js.Array(USE, IGNORE, NONE)
}

type Permission = "FULL_CONTROL" | "WRITE" | "WRITE_ACP" | "READ" | "READ_ACP"
object Permission {
  inline val FULL_CONTROL: "FULL_CONTROL" = "FULL_CONTROL"
  inline val WRITE: "WRITE" = "WRITE"
  inline val WRITE_ACP: "WRITE_ACP" = "WRITE_ACP"
  inline val READ: "READ" = "READ"
  inline val READ_ACP: "READ_ACP" = "READ_ACP"

  inline def values: js.Array[Permission] = js.Array(FULL_CONTROL, WRITE, WRITE_ACP, READ, READ_ACP)
}

type QuoteFields = "ALWAYS" | "ASNEEDED"
object QuoteFields {
  inline val ALWAYS: "ALWAYS" = "ALWAYS"
  inline val ASNEEDED: "ASNEEDED" = "ASNEEDED"

  inline def values: js.Array[QuoteFields] = js.Array(ALWAYS, ASNEEDED)
}

type StatusCode = "InProgress" | "Succeeded" | "Failed"
object StatusCode {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[StatusCode] = js.Array(InProgress, Succeeded, Failed)
}

type StorageClass = "STANDARD" | "REDUCED_REDUNDANCY" | "STANDARD_IA"
object StorageClass {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val REDUCED_REDUNDANCY: "REDUCED_REDUNDANCY" = "REDUCED_REDUNDANCY"
  inline val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"

  inline def values: js.Array[StorageClass] = js.Array(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA)
}

type Type = "AmazonCustomerByEmail" | "CanonicalUser" | "Group"
object Type {
  inline val AmazonCustomerByEmail: "AmazonCustomerByEmail" = "AmazonCustomerByEmail"
  inline val CanonicalUser: "CanonicalUser" = "CanonicalUser"
  inline val Group: "Group" = "Group"

  inline def values: js.Array[Type] = js.Array(AmazonCustomerByEmail, CanonicalUser, Group)
}
