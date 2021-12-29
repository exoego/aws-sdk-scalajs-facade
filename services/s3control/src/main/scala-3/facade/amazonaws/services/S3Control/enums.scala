package facade.amazonaws.services.s3control

import scalajs._

type BucketCannedACL = "private" | "public-read" | "public-read-write" | "authenticated-read"
object BucketCannedACL {
  val `private`: "private" = "private"
  val `public-read`: "public-read" = "public-read"
  val `public-read-write`: "public-read-write" = "public-read-write"
  val `authenticated-read`: "authenticated-read" = "authenticated-read"

  @inline def values = js.Array[BucketCannedACL](`private`, `public-read`, `public-read-write`, `authenticated-read`)
}

type BucketLocationConstraint = "EU" | "eu-west-1" | "us-west-1" | "us-west-2" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "sa-east-1" | "cn-north-1" | "eu-central-1"
object BucketLocationConstraint {
  val EU: "EU" = "EU"
  val `eu-west-1`: "eu-west-1" = "eu-west-1"
  val `us-west-1`: "us-west-1" = "us-west-1"
  val `us-west-2`: "us-west-2" = "us-west-2"
  val `ap-south-1`: "ap-south-1" = "ap-south-1"
  val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  val `sa-east-1`: "sa-east-1" = "sa-east-1"
  val `cn-north-1`: "cn-north-1" = "cn-north-1"
  val `eu-central-1`: "eu-central-1" = "eu-central-1"

  @inline def values = js.Array[BucketLocationConstraint](EU, `eu-west-1`, `us-west-1`, `us-west-2`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `sa-east-1`, `cn-north-1`, `eu-central-1`)
}

type ExpirationStatus = "Enabled" | "Disabled"
object ExpirationStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[ExpirationStatus](Enabled, Disabled)
}

type Format = "CSV" | "Parquet"
object Format {
  val CSV: "CSV" = "CSV"
  val Parquet: "Parquet" = "Parquet"

  @inline def values = js.Array[Format](CSV, Parquet)
}

type JobManifestFieldName = "Ignore" | "Bucket" | "Key" | "VersionId"
object JobManifestFieldName {
  val Ignore: "Ignore" = "Ignore"
  val Bucket: "Bucket" = "Bucket"
  val Key: "Key" = "Key"
  val VersionId: "VersionId" = "VersionId"

  @inline def values = js.Array[JobManifestFieldName](Ignore, Bucket, Key, VersionId)
}

type JobManifestFormat = "S3BatchOperations_CSV_20180820" | "S3InventoryReport_CSV_20161130"
object JobManifestFormat {
  val S3BatchOperations_CSV_20180820: "S3BatchOperations_CSV_20180820" = "S3BatchOperations_CSV_20180820"
  val S3InventoryReport_CSV_20161130: "S3InventoryReport_CSV_20161130" = "S3InventoryReport_CSV_20161130"

  @inline def values = js.Array[JobManifestFormat](S3BatchOperations_CSV_20180820, S3InventoryReport_CSV_20161130)
}

type JobReportFormat = "Report_CSV_20180820"
object JobReportFormat {
  val Report_CSV_20180820: "Report_CSV_20180820" = "Report_CSV_20180820"

  @inline def values = js.Array[JobReportFormat](Report_CSV_20180820)
}

type JobReportScope = "AllTasks" | "FailedTasksOnly"
object JobReportScope {
  val AllTasks: "AllTasks" = "AllTasks"
  val FailedTasksOnly: "FailedTasksOnly" = "FailedTasksOnly"

  @inline def values = js.Array[JobReportScope](AllTasks, FailedTasksOnly)
}

type JobStatus = "Active" | "Cancelled" | "Cancelling" | "Complete" | "Completing" | "Failed" | "Failing" | "New" | "Paused" | "Pausing" | "Preparing" | "Ready" | "Suspended"
object JobStatus {
  val Active: "Active" = "Active"
  val Cancelled: "Cancelled" = "Cancelled"
  val Cancelling: "Cancelling" = "Cancelling"
  val Complete: "Complete" = "Complete"
  val Completing: "Completing" = "Completing"
  val Failed: "Failed" = "Failed"
  val Failing: "Failing" = "Failing"
  val New: "New" = "New"
  val Paused: "Paused" = "Paused"
  val Pausing: "Pausing" = "Pausing"
  val Preparing: "Preparing" = "Preparing"
  val Ready: "Ready" = "Ready"
  val Suspended: "Suspended" = "Suspended"

  @inline def values = js.Array[JobStatus](Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended)
}

type NetworkOrigin = "Internet" | "VPC"
object NetworkOrigin {
  val Internet: "Internet" = "Internet"
  val VPC: "VPC" = "VPC"

  @inline def values = js.Array[NetworkOrigin](Internet, VPC)
}

type ObjectLambdaAllowedFeature = "GetObject-Range" | "GetObject-PartNumber"
object ObjectLambdaAllowedFeature {
  val `GetObject-Range`: "GetObject-Range" = "GetObject-Range"
  val `GetObject-PartNumber`: "GetObject-PartNumber" = "GetObject-PartNumber"

  @inline def values = js.Array[ObjectLambdaAllowedFeature](`GetObject-Range`, `GetObject-PartNumber`)
}

type ObjectLambdaTransformationConfigurationAction = "GetObject"
object ObjectLambdaTransformationConfigurationAction {
  val GetObject: "GetObject" = "GetObject"

  @inline def values = js.Array[ObjectLambdaTransformationConfigurationAction](GetObject)
}

type OperationName = "LambdaInvoke" | "S3PutObjectCopy" | "S3PutObjectAcl" | "S3PutObjectTagging" | "S3DeleteObjectTagging" | "S3InitiateRestoreObject" | "S3PutObjectLegalHold" | "S3PutObjectRetention"
object OperationName {
  val LambdaInvoke: "LambdaInvoke" = "LambdaInvoke"
  val S3PutObjectCopy: "S3PutObjectCopy" = "S3PutObjectCopy"
  val S3PutObjectAcl: "S3PutObjectAcl" = "S3PutObjectAcl"
  val S3PutObjectTagging: "S3PutObjectTagging" = "S3PutObjectTagging"
  val S3DeleteObjectTagging: "S3DeleteObjectTagging" = "S3DeleteObjectTagging"
  val S3InitiateRestoreObject: "S3InitiateRestoreObject" = "S3InitiateRestoreObject"
  val S3PutObjectLegalHold: "S3PutObjectLegalHold" = "S3PutObjectLegalHold"
  val S3PutObjectRetention: "S3PutObjectRetention" = "S3PutObjectRetention"

  @inline def values = js.Array[OperationName](
    LambdaInvoke,
    S3PutObjectCopy,
    S3PutObjectAcl,
    S3PutObjectTagging,
    S3DeleteObjectTagging,
    S3InitiateRestoreObject,
    S3PutObjectLegalHold,
    S3PutObjectRetention
  )
}

type OutputSchemaVersion = "V_1"
object OutputSchemaVersion {
  val V_1: "V_1" = "V_1"

  @inline def values = js.Array[OutputSchemaVersion](V_1)
}

type RequestedJobStatus = "Cancelled" | "Ready"
object RequestedJobStatus {
  val Cancelled: "Cancelled" = "Cancelled"
  val Ready: "Ready" = "Ready"

  @inline def values = js.Array[RequestedJobStatus](Cancelled, Ready)
}

type S3CannedAccessControlList = "private" | "public-read" | "public-read-write" | "aws-exec-read" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control"
object S3CannedAccessControlList {
  val `private`: "private" = "private"
  val `public-read`: "public-read" = "public-read"
  val `public-read-write`: "public-read-write" = "public-read-write"
  val `aws-exec-read`: "aws-exec-read" = "aws-exec-read"
  val `authenticated-read`: "authenticated-read" = "authenticated-read"
  val `bucket-owner-read`: "bucket-owner-read" = "bucket-owner-read"
  val `bucket-owner-full-control`: "bucket-owner-full-control" = "bucket-owner-full-control"

  @inline def values = js.Array[S3CannedAccessControlList](`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`)
}

type S3GlacierJobTier = "BULK" | "STANDARD"
object S3GlacierJobTier {
  val BULK: "BULK" = "BULK"
  val STANDARD: "STANDARD" = "STANDARD"

  @inline def values = js.Array[S3GlacierJobTier](BULK, STANDARD)
}

type S3GranteeTypeIdentifier = "id" | "emailAddress" | "uri"
object S3GranteeTypeIdentifier {
  val id: "id" = "id"
  val emailAddress: "emailAddress" = "emailAddress"
  val uri: "uri" = "uri"

  @inline def values = js.Array[S3GranteeTypeIdentifier](id, emailAddress, uri)
}

type S3MetadataDirective = "COPY" | "REPLACE"
object S3MetadataDirective {
  val COPY: "COPY" = "COPY"
  val REPLACE: "REPLACE" = "REPLACE"

  @inline def values = js.Array[S3MetadataDirective](COPY, REPLACE)
}

type S3ObjectLockLegalHoldStatus = "OFF" | "ON"
object S3ObjectLockLegalHoldStatus {
  val OFF: "OFF" = "OFF"
  val ON: "ON" = "ON"

  @inline def values = js.Array[S3ObjectLockLegalHoldStatus](OFF, ON)
}

type S3ObjectLockMode = "COMPLIANCE" | "GOVERNANCE"
object S3ObjectLockMode {
  val COMPLIANCE: "COMPLIANCE" = "COMPLIANCE"
  val GOVERNANCE: "GOVERNANCE" = "GOVERNANCE"

  @inline def values = js.Array[S3ObjectLockMode](COMPLIANCE, GOVERNANCE)
}

type S3ObjectLockRetentionMode = "COMPLIANCE" | "GOVERNANCE"
object S3ObjectLockRetentionMode {
  val COMPLIANCE: "COMPLIANCE" = "COMPLIANCE"
  val GOVERNANCE: "GOVERNANCE" = "GOVERNANCE"

  @inline def values = js.Array[S3ObjectLockRetentionMode](COMPLIANCE, GOVERNANCE)
}

type S3Permission = "FULL_CONTROL" | "READ" | "WRITE" | "READ_ACP" | "WRITE_ACP"
object S3Permission {
  val FULL_CONTROL: "FULL_CONTROL" = "FULL_CONTROL"
  val READ: "READ" = "READ"
  val WRITE: "WRITE" = "WRITE"
  val READ_ACP: "READ_ACP" = "READ_ACP"
  val WRITE_ACP: "WRITE_ACP" = "WRITE_ACP"

  @inline def values = js.Array[S3Permission](FULL_CONTROL, READ, WRITE, READ_ACP, WRITE_ACP)
}

type S3SSEAlgorithm = "AES256" | "KMS"
object S3SSEAlgorithm {
  val AES256: "AES256" = "AES256"
  val KMS: "KMS" = "KMS"

  @inline def values = js.Array[S3SSEAlgorithm](AES256, KMS)
}

type S3StorageClass = "STANDARD" | "STANDARD_IA" | "ONEZONE_IA" | "GLACIER" | "INTELLIGENT_TIERING" | "DEEP_ARCHIVE"
object S3StorageClass {
  val STANDARD: "STANDARD" = "STANDARD"
  val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  val GLACIER: "GLACIER" = "GLACIER"
  val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"

  @inline def values = js.Array[S3StorageClass](STANDARD, STANDARD_IA, ONEZONE_IA, GLACIER, INTELLIGENT_TIERING, DEEP_ARCHIVE)
}

type TransitionStorageClass = "GLACIER" | "STANDARD_IA" | "ONEZONE_IA" | "INTELLIGENT_TIERING" | "DEEP_ARCHIVE"
object TransitionStorageClass {
  val GLACIER: "GLACIER" = "GLACIER"
  val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"

  @inline def values = js.Array[TransitionStorageClass](GLACIER, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE)
}
