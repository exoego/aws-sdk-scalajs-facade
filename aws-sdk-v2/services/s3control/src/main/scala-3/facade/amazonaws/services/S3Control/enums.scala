package facade.amazonaws.services.s3control

import scalajs.js

type AsyncOperationName = "CreateMultiRegionAccessPoint" | "DeleteMultiRegionAccessPoint" | "PutMultiRegionAccessPointPolicy"
object AsyncOperationName {
  inline val CreateMultiRegionAccessPoint: "CreateMultiRegionAccessPoint" = "CreateMultiRegionAccessPoint"
  inline val DeleteMultiRegionAccessPoint: "DeleteMultiRegionAccessPoint" = "DeleteMultiRegionAccessPoint"
  inline val PutMultiRegionAccessPointPolicy: "PutMultiRegionAccessPointPolicy" = "PutMultiRegionAccessPointPolicy"

  inline def values: js.Array[AsyncOperationName] = js.Array(CreateMultiRegionAccessPoint, DeleteMultiRegionAccessPoint, PutMultiRegionAccessPointPolicy)
}

type BucketCannedACL = "private" | "public-read" | "public-read-write" | "authenticated-read"
object BucketCannedACL {
  inline val `private`: "private" = "private"
  inline val `public-read`: "public-read" = "public-read"
  inline val `public-read-write`: "public-read-write" = "public-read-write"
  inline val `authenticated-read`: "authenticated-read" = "authenticated-read"

  inline def values: js.Array[BucketCannedACL] = js.Array(`private`, `public-read`, `public-read-write`, `authenticated-read`)
}

type BucketLocationConstraint = "EU" | "eu-west-1" | "us-west-1" | "us-west-2" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "sa-east-1" | "cn-north-1" | "eu-central-1"
object BucketLocationConstraint {
  inline val EU: "EU" = "EU"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val `us-west-1`: "us-west-1" = "us-west-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `ap-south-1`: "ap-south-1" = "ap-south-1"
  inline val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  inline val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  inline val `sa-east-1`: "sa-east-1" = "sa-east-1"
  inline val `cn-north-1`: "cn-north-1" = "cn-north-1"
  inline val `eu-central-1`: "eu-central-1" = "eu-central-1"

  inline def values: js.Array[BucketLocationConstraint] = js.Array(EU, `eu-west-1`, `us-west-1`, `us-west-2`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `sa-east-1`, `cn-north-1`, `eu-central-1`)
}

type BucketVersioningStatus = "Enabled" | "Suspended"
object BucketVersioningStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Suspended: "Suspended" = "Suspended"

  inline def values: js.Array[BucketVersioningStatus] = js.Array(Enabled, Suspended)
}

type ExpirationStatus = "Enabled" | "Disabled"
object ExpirationStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ExpirationStatus] = js.Array(Enabled, Disabled)
}

type Format = "CSV" | "Parquet"
object Format {
  inline val CSV: "CSV" = "CSV"
  inline val Parquet: "Parquet" = "Parquet"

  inline def values: js.Array[Format] = js.Array(CSV, Parquet)
}

type GeneratedManifestFormat = "S3InventoryReport_CSV_20211130"
object GeneratedManifestFormat {
  inline val S3InventoryReport_CSV_20211130: "S3InventoryReport_CSV_20211130" = "S3InventoryReport_CSV_20211130"

  inline def values: js.Array[GeneratedManifestFormat] = js.Array(S3InventoryReport_CSV_20211130)
}

type JobManifestFieldName = "Ignore" | "Bucket" | "Key" | "VersionId"
object JobManifestFieldName {
  inline val Ignore: "Ignore" = "Ignore"
  inline val Bucket: "Bucket" = "Bucket"
  inline val Key: "Key" = "Key"
  inline val VersionId: "VersionId" = "VersionId"

  inline def values: js.Array[JobManifestFieldName] = js.Array(Ignore, Bucket, Key, VersionId)
}

type JobManifestFormat = "S3BatchOperations_CSV_20180820" | "S3InventoryReport_CSV_20161130"
object JobManifestFormat {
  inline val S3BatchOperations_CSV_20180820: "S3BatchOperations_CSV_20180820" = "S3BatchOperations_CSV_20180820"
  inline val S3InventoryReport_CSV_20161130: "S3InventoryReport_CSV_20161130" = "S3InventoryReport_CSV_20161130"

  inline def values: js.Array[JobManifestFormat] = js.Array(S3BatchOperations_CSV_20180820, S3InventoryReport_CSV_20161130)
}

type JobReportFormat = "Report_CSV_20180820"
object JobReportFormat {
  inline val Report_CSV_20180820: "Report_CSV_20180820" = "Report_CSV_20180820"

  inline def values: js.Array[JobReportFormat] = js.Array(Report_CSV_20180820)
}

type JobReportScope = "AllTasks" | "FailedTasksOnly"
object JobReportScope {
  inline val AllTasks: "AllTasks" = "AllTasks"
  inline val FailedTasksOnly: "FailedTasksOnly" = "FailedTasksOnly"

  inline def values: js.Array[JobReportScope] = js.Array(AllTasks, FailedTasksOnly)
}

type JobStatus = "Active" | "Cancelled" | "Cancelling" | "Complete" | "Completing" | "Failed" | "Failing" | "New" | "Paused" | "Pausing" | "Preparing" | "Ready" | "Suspended"
object JobStatus {
  inline val Active: "Active" = "Active"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Cancelling: "Cancelling" = "Cancelling"
  inline val Complete: "Complete" = "Complete"
  inline val Completing: "Completing" = "Completing"
  inline val Failed: "Failed" = "Failed"
  inline val Failing: "Failing" = "Failing"
  inline val New: "New" = "New"
  inline val Paused: "Paused" = "Paused"
  inline val Pausing: "Pausing" = "Pausing"
  inline val Preparing: "Preparing" = "Preparing"
  inline val Ready: "Ready" = "Ready"
  inline val Suspended: "Suspended" = "Suspended"

  inline def values: js.Array[JobStatus] = js.Array(Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended)
}

type MFADelete = "Enabled" | "Disabled"
object MFADelete {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[MFADelete] = js.Array(Enabled, Disabled)
}

type MFADeleteStatus = "Enabled" | "Disabled"
object MFADeleteStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[MFADeleteStatus] = js.Array(Enabled, Disabled)
}

type MultiRegionAccessPointStatus = "READY" | "INCONSISTENT_ACROSS_REGIONS" | "CREATING" | "PARTIALLY_CREATED" | "PARTIALLY_DELETED" | "DELETING"
object MultiRegionAccessPointStatus {
  inline val READY: "READY" = "READY"
  inline val INCONSISTENT_ACROSS_REGIONS: "INCONSISTENT_ACROSS_REGIONS" = "INCONSISTENT_ACROSS_REGIONS"
  inline val CREATING: "CREATING" = "CREATING"
  inline val PARTIALLY_CREATED: "PARTIALLY_CREATED" = "PARTIALLY_CREATED"
  inline val PARTIALLY_DELETED: "PARTIALLY_DELETED" = "PARTIALLY_DELETED"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[MultiRegionAccessPointStatus] = js.Array(READY, INCONSISTENT_ACROSS_REGIONS, CREATING, PARTIALLY_CREATED, PARTIALLY_DELETED, DELETING)
}

type NetworkOrigin = "Internet" | "VPC"
object NetworkOrigin {
  inline val Internet: "Internet" = "Internet"
  inline val VPC: "VPC" = "VPC"

  inline def values: js.Array[NetworkOrigin] = js.Array(Internet, VPC)
}

type ObjectLambdaAllowedFeature = "GetObject-Range" | "GetObject-PartNumber" | "HeadObject-Range" | "HeadObject-PartNumber"
object ObjectLambdaAllowedFeature {
  inline val `GetObject-Range`: "GetObject-Range" = "GetObject-Range"
  inline val `GetObject-PartNumber`: "GetObject-PartNumber" = "GetObject-PartNumber"
  inline val `HeadObject-Range`: "HeadObject-Range" = "HeadObject-Range"
  inline val `HeadObject-PartNumber`: "HeadObject-PartNumber" = "HeadObject-PartNumber"

  inline def values: js.Array[ObjectLambdaAllowedFeature] = js.Array(`GetObject-Range`, `GetObject-PartNumber`, `HeadObject-Range`, `HeadObject-PartNumber`)
}

type ObjectLambdaTransformationConfigurationAction = "GetObject" | "HeadObject" | "ListObjects" | "ListObjectsV2"
object ObjectLambdaTransformationConfigurationAction {
  inline val GetObject: "GetObject" = "GetObject"
  inline val HeadObject: "HeadObject" = "HeadObject"
  inline val ListObjects: "ListObjects" = "ListObjects"
  inline val ListObjectsV2: "ListObjectsV2" = "ListObjectsV2"

  inline def values: js.Array[ObjectLambdaTransformationConfigurationAction] = js.Array(GetObject, HeadObject, ListObjects, ListObjectsV2)
}

type OperationName = "LambdaInvoke" | "S3PutObjectCopy" | "S3PutObjectAcl" | "S3PutObjectTagging" | "S3DeleteObjectTagging" | "S3InitiateRestoreObject" | "S3PutObjectLegalHold" | "S3PutObjectRetention" | "S3ReplicateObject"
object OperationName {
  inline val LambdaInvoke: "LambdaInvoke" = "LambdaInvoke"
  inline val S3PutObjectCopy: "S3PutObjectCopy" = "S3PutObjectCopy"
  inline val S3PutObjectAcl: "S3PutObjectAcl" = "S3PutObjectAcl"
  inline val S3PutObjectTagging: "S3PutObjectTagging" = "S3PutObjectTagging"
  inline val S3DeleteObjectTagging: "S3DeleteObjectTagging" = "S3DeleteObjectTagging"
  inline val S3InitiateRestoreObject: "S3InitiateRestoreObject" = "S3InitiateRestoreObject"
  inline val S3PutObjectLegalHold: "S3PutObjectLegalHold" = "S3PutObjectLegalHold"
  inline val S3PutObjectRetention: "S3PutObjectRetention" = "S3PutObjectRetention"
  inline val S3ReplicateObject: "S3ReplicateObject" = "S3ReplicateObject"

  inline def values: js.Array[OperationName] = js.Array(
    LambdaInvoke,
    S3PutObjectCopy,
    S3PutObjectAcl,
    S3PutObjectTagging,
    S3DeleteObjectTagging,
    S3InitiateRestoreObject,
    S3PutObjectLegalHold,
    S3PutObjectRetention,
    S3ReplicateObject
  )
}

type OutputSchemaVersion = "V_1"
object OutputSchemaVersion {
  inline val V_1: "V_1" = "V_1"

  inline def values: js.Array[OutputSchemaVersion] = js.Array(V_1)
}

type ReplicationStatus = "COMPLETED" | "FAILED" | "REPLICA" | "NONE"
object ReplicationStatus {
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val REPLICA: "REPLICA" = "REPLICA"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ReplicationStatus] = js.Array(COMPLETED, FAILED, REPLICA, NONE)
}

type RequestedJobStatus = "Cancelled" | "Ready"
object RequestedJobStatus {
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Ready: "Ready" = "Ready"

  inline def values: js.Array[RequestedJobStatus] = js.Array(Cancelled, Ready)
}

type S3CannedAccessControlList = "private" | "public-read" | "public-read-write" | "aws-exec-read" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control"
object S3CannedAccessControlList {
  inline val `private`: "private" = "private"
  inline val `public-read`: "public-read" = "public-read"
  inline val `public-read-write`: "public-read-write" = "public-read-write"
  inline val `aws-exec-read`: "aws-exec-read" = "aws-exec-read"
  inline val `authenticated-read`: "authenticated-read" = "authenticated-read"
  inline val `bucket-owner-read`: "bucket-owner-read" = "bucket-owner-read"
  inline val `bucket-owner-full-control`: "bucket-owner-full-control" = "bucket-owner-full-control"

  inline def values: js.Array[S3CannedAccessControlList] = js.Array(`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`)
}

type S3ChecksumAlgorithm = "CRC32" | "CRC32C" | "SHA1" | "SHA256"
object S3ChecksumAlgorithm {
  inline val CRC32: "CRC32" = "CRC32"
  inline val CRC32C: "CRC32C" = "CRC32C"
  inline val SHA1: "SHA1" = "SHA1"
  inline val SHA256: "SHA256" = "SHA256"

  inline def values: js.Array[S3ChecksumAlgorithm] = js.Array(CRC32, CRC32C, SHA1, SHA256)
}

type S3GlacierJobTier = "BULK" | "STANDARD"
object S3GlacierJobTier {
  inline val BULK: "BULK" = "BULK"
  inline val STANDARD: "STANDARD" = "STANDARD"

  inline def values: js.Array[S3GlacierJobTier] = js.Array(BULK, STANDARD)
}

type S3GranteeTypeIdentifier = "id" | "emailAddress" | "uri"
object S3GranteeTypeIdentifier {
  inline val id: "id" = "id"
  inline val emailAddress: "emailAddress" = "emailAddress"
  inline val uri: "uri" = "uri"

  inline def values: js.Array[S3GranteeTypeIdentifier] = js.Array(id, emailAddress, uri)
}

type S3MetadataDirective = "COPY" | "REPLACE"
object S3MetadataDirective {
  inline val COPY: "COPY" = "COPY"
  inline val REPLACE: "REPLACE" = "REPLACE"

  inline def values: js.Array[S3MetadataDirective] = js.Array(COPY, REPLACE)
}

type S3ObjectLockLegalHoldStatus = "OFF" | "ON"
object S3ObjectLockLegalHoldStatus {
  inline val OFF: "OFF" = "OFF"
  inline val ON: "ON" = "ON"

  inline def values: js.Array[S3ObjectLockLegalHoldStatus] = js.Array(OFF, ON)
}

type S3ObjectLockMode = "COMPLIANCE" | "GOVERNANCE"
object S3ObjectLockMode {
  inline val COMPLIANCE: "COMPLIANCE" = "COMPLIANCE"
  inline val GOVERNANCE: "GOVERNANCE" = "GOVERNANCE"

  inline def values: js.Array[S3ObjectLockMode] = js.Array(COMPLIANCE, GOVERNANCE)
}

type S3ObjectLockRetentionMode = "COMPLIANCE" | "GOVERNANCE"
object S3ObjectLockRetentionMode {
  inline val COMPLIANCE: "COMPLIANCE" = "COMPLIANCE"
  inline val GOVERNANCE: "GOVERNANCE" = "GOVERNANCE"

  inline def values: js.Array[S3ObjectLockRetentionMode] = js.Array(COMPLIANCE, GOVERNANCE)
}

type S3Permission = "FULL_CONTROL" | "READ" | "WRITE" | "READ_ACP" | "WRITE_ACP"
object S3Permission {
  inline val FULL_CONTROL: "FULL_CONTROL" = "FULL_CONTROL"
  inline val READ: "READ" = "READ"
  inline val WRITE: "WRITE" = "WRITE"
  inline val READ_ACP: "READ_ACP" = "READ_ACP"
  inline val WRITE_ACP: "WRITE_ACP" = "WRITE_ACP"

  inline def values: js.Array[S3Permission] = js.Array(FULL_CONTROL, READ, WRITE, READ_ACP, WRITE_ACP)
}

type S3SSEAlgorithm = "AES256" | "KMS"
object S3SSEAlgorithm {
  inline val AES256: "AES256" = "AES256"
  inline val KMS: "KMS" = "KMS"

  inline def values: js.Array[S3SSEAlgorithm] = js.Array(AES256, KMS)
}

type S3StorageClass = "STANDARD" | "STANDARD_IA" | "ONEZONE_IA" | "GLACIER" | "INTELLIGENT_TIERING" | "DEEP_ARCHIVE" | "GLACIER_IR"
object S3StorageClass {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  inline val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  inline val GLACIER: "GLACIER" = "GLACIER"
  inline val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  inline val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"
  inline val GLACIER_IR: "GLACIER_IR" = "GLACIER_IR"

  inline def values: js.Array[S3StorageClass] = js.Array(STANDARD, STANDARD_IA, ONEZONE_IA, GLACIER, INTELLIGENT_TIERING, DEEP_ARCHIVE, GLACIER_IR)
}

type TransitionStorageClass = "GLACIER" | "STANDARD_IA" | "ONEZONE_IA" | "INTELLIGENT_TIERING" | "DEEP_ARCHIVE"
object TransitionStorageClass {
  inline val GLACIER: "GLACIER" = "GLACIER"
  inline val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  inline val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  inline val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  inline val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"

  inline def values: js.Array[TransitionStorageClass] = js.Array(GLACIER, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE)
}
