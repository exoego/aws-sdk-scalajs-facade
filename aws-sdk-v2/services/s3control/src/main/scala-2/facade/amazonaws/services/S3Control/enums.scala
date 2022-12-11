package facade.amazonaws.services.s3control

import scalajs.js

@js.native
sealed trait AsyncOperationName extends js.Any
object AsyncOperationName {
  val CreateMultiRegionAccessPoint = "CreateMultiRegionAccessPoint".asInstanceOf[AsyncOperationName]
  val DeleteMultiRegionAccessPoint = "DeleteMultiRegionAccessPoint".asInstanceOf[AsyncOperationName]
  val PutMultiRegionAccessPointPolicy = "PutMultiRegionAccessPointPolicy".asInstanceOf[AsyncOperationName]

  @inline def values: js.Array[AsyncOperationName] = js.Array(CreateMultiRegionAccessPoint, DeleteMultiRegionAccessPoint, PutMultiRegionAccessPointPolicy)
}

@js.native
sealed trait BucketCannedACL extends js.Any
object BucketCannedACL {
  val `private` = "private".asInstanceOf[BucketCannedACL]
  val `public-read` = "public-read".asInstanceOf[BucketCannedACL]
  val `public-read-write` = "public-read-write".asInstanceOf[BucketCannedACL]
  val `authenticated-read` = "authenticated-read".asInstanceOf[BucketCannedACL]

  @inline def values: js.Array[BucketCannedACL] = js.Array(`private`, `public-read`, `public-read-write`, `authenticated-read`)
}

@js.native
sealed trait BucketLocationConstraint extends js.Any
object BucketLocationConstraint {
  val EU = "EU".asInstanceOf[BucketLocationConstraint]
  val `eu-west-1` = "eu-west-1".asInstanceOf[BucketLocationConstraint]
  val `us-west-1` = "us-west-1".asInstanceOf[BucketLocationConstraint]
  val `us-west-2` = "us-west-2".asInstanceOf[BucketLocationConstraint]
  val `ap-south-1` = "ap-south-1".asInstanceOf[BucketLocationConstraint]
  val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[BucketLocationConstraint]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[BucketLocationConstraint]
  val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[BucketLocationConstraint]
  val `sa-east-1` = "sa-east-1".asInstanceOf[BucketLocationConstraint]
  val `cn-north-1` = "cn-north-1".asInstanceOf[BucketLocationConstraint]
  val `eu-central-1` = "eu-central-1".asInstanceOf[BucketLocationConstraint]

  @inline def values: js.Array[BucketLocationConstraint] = js.Array(EU, `eu-west-1`, `us-west-1`, `us-west-2`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `sa-east-1`, `cn-north-1`, `eu-central-1`)
}

@js.native
sealed trait BucketVersioningStatus extends js.Any
object BucketVersioningStatus {
  val Enabled = "Enabled".asInstanceOf[BucketVersioningStatus]
  val Suspended = "Suspended".asInstanceOf[BucketVersioningStatus]

  @inline def values: js.Array[BucketVersioningStatus] = js.Array(Enabled, Suspended)
}

@js.native
sealed trait ExpirationStatus extends js.Any
object ExpirationStatus {
  val Enabled = "Enabled".asInstanceOf[ExpirationStatus]
  val Disabled = "Disabled".asInstanceOf[ExpirationStatus]

  @inline def values: js.Array[ExpirationStatus] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait Format extends js.Any
object Format {
  val CSV = "CSV".asInstanceOf[Format]
  val Parquet = "Parquet".asInstanceOf[Format]

  @inline def values: js.Array[Format] = js.Array(CSV, Parquet)
}

@js.native
sealed trait GeneratedManifestFormat extends js.Any
object GeneratedManifestFormat {
  val S3InventoryReport_CSV_20211130 = "S3InventoryReport_CSV_20211130".asInstanceOf[GeneratedManifestFormat]

  @inline def values: js.Array[GeneratedManifestFormat] = js.Array(S3InventoryReport_CSV_20211130)
}

@js.native
sealed trait JobManifestFieldName extends js.Any
object JobManifestFieldName {
  val Ignore = "Ignore".asInstanceOf[JobManifestFieldName]
  val Bucket = "Bucket".asInstanceOf[JobManifestFieldName]
  val Key = "Key".asInstanceOf[JobManifestFieldName]
  val VersionId = "VersionId".asInstanceOf[JobManifestFieldName]

  @inline def values: js.Array[JobManifestFieldName] = js.Array(Ignore, Bucket, Key, VersionId)
}

@js.native
sealed trait JobManifestFormat extends js.Any
object JobManifestFormat {
  val S3BatchOperations_CSV_20180820 = "S3BatchOperations_CSV_20180820".asInstanceOf[JobManifestFormat]
  val S3InventoryReport_CSV_20161130 = "S3InventoryReport_CSV_20161130".asInstanceOf[JobManifestFormat]

  @inline def values: js.Array[JobManifestFormat] = js.Array(S3BatchOperations_CSV_20180820, S3InventoryReport_CSV_20161130)
}

@js.native
sealed trait JobReportFormat extends js.Any
object JobReportFormat {
  val Report_CSV_20180820 = "Report_CSV_20180820".asInstanceOf[JobReportFormat]

  @inline def values: js.Array[JobReportFormat] = js.Array(Report_CSV_20180820)
}

@js.native
sealed trait JobReportScope extends js.Any
object JobReportScope {
  val AllTasks = "AllTasks".asInstanceOf[JobReportScope]
  val FailedTasksOnly = "FailedTasksOnly".asInstanceOf[JobReportScope]

  @inline def values: js.Array[JobReportScope] = js.Array(AllTasks, FailedTasksOnly)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val Active = "Active".asInstanceOf[JobStatus]
  val Cancelled = "Cancelled".asInstanceOf[JobStatus]
  val Cancelling = "Cancelling".asInstanceOf[JobStatus]
  val Complete = "Complete".asInstanceOf[JobStatus]
  val Completing = "Completing".asInstanceOf[JobStatus]
  val Failed = "Failed".asInstanceOf[JobStatus]
  val Failing = "Failing".asInstanceOf[JobStatus]
  val New = "New".asInstanceOf[JobStatus]
  val Paused = "Paused".asInstanceOf[JobStatus]
  val Pausing = "Pausing".asInstanceOf[JobStatus]
  val Preparing = "Preparing".asInstanceOf[JobStatus]
  val Ready = "Ready".asInstanceOf[JobStatus]
  val Suspended = "Suspended".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended)
}

@js.native
sealed trait MFADelete extends js.Any
object MFADelete {
  val Enabled = "Enabled".asInstanceOf[MFADelete]
  val Disabled = "Disabled".asInstanceOf[MFADelete]

  @inline def values: js.Array[MFADelete] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait MFADeleteStatus extends js.Any
object MFADeleteStatus {
  val Enabled = "Enabled".asInstanceOf[MFADeleteStatus]
  val Disabled = "Disabled".asInstanceOf[MFADeleteStatus]

  @inline def values: js.Array[MFADeleteStatus] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait MultiRegionAccessPointStatus extends js.Any
object MultiRegionAccessPointStatus {
  val READY = "READY".asInstanceOf[MultiRegionAccessPointStatus]
  val INCONSISTENT_ACROSS_REGIONS = "INCONSISTENT_ACROSS_REGIONS".asInstanceOf[MultiRegionAccessPointStatus]
  val CREATING = "CREATING".asInstanceOf[MultiRegionAccessPointStatus]
  val PARTIALLY_CREATED = "PARTIALLY_CREATED".asInstanceOf[MultiRegionAccessPointStatus]
  val PARTIALLY_DELETED = "PARTIALLY_DELETED".asInstanceOf[MultiRegionAccessPointStatus]
  val DELETING = "DELETING".asInstanceOf[MultiRegionAccessPointStatus]

  @inline def values: js.Array[MultiRegionAccessPointStatus] = js.Array(READY, INCONSISTENT_ACROSS_REGIONS, CREATING, PARTIALLY_CREATED, PARTIALLY_DELETED, DELETING)
}

@js.native
sealed trait NetworkOrigin extends js.Any
object NetworkOrigin {
  val Internet = "Internet".asInstanceOf[NetworkOrigin]
  val VPC = "VPC".asInstanceOf[NetworkOrigin]

  @inline def values: js.Array[NetworkOrigin] = js.Array(Internet, VPC)
}

@js.native
sealed trait ObjectLambdaAllowedFeature extends js.Any
object ObjectLambdaAllowedFeature {
  val `GetObject-Range` = "GetObject-Range".asInstanceOf[ObjectLambdaAllowedFeature]
  val `GetObject-PartNumber` = "GetObject-PartNumber".asInstanceOf[ObjectLambdaAllowedFeature]
  val `HeadObject-Range` = "HeadObject-Range".asInstanceOf[ObjectLambdaAllowedFeature]
  val `HeadObject-PartNumber` = "HeadObject-PartNumber".asInstanceOf[ObjectLambdaAllowedFeature]

  @inline def values: js.Array[ObjectLambdaAllowedFeature] = js.Array(`GetObject-Range`, `GetObject-PartNumber`, `HeadObject-Range`, `HeadObject-PartNumber`)
}

@js.native
sealed trait ObjectLambdaTransformationConfigurationAction extends js.Any
object ObjectLambdaTransformationConfigurationAction {
  val GetObject = "GetObject".asInstanceOf[ObjectLambdaTransformationConfigurationAction]
  val HeadObject = "HeadObject".asInstanceOf[ObjectLambdaTransformationConfigurationAction]
  val ListObjects = "ListObjects".asInstanceOf[ObjectLambdaTransformationConfigurationAction]
  val ListObjectsV2 = "ListObjectsV2".asInstanceOf[ObjectLambdaTransformationConfigurationAction]

  @inline def values: js.Array[ObjectLambdaTransformationConfigurationAction] = js.Array(GetObject, HeadObject, ListObjects, ListObjectsV2)
}

@js.native
sealed trait OperationName extends js.Any
object OperationName {
  val LambdaInvoke = "LambdaInvoke".asInstanceOf[OperationName]
  val S3PutObjectCopy = "S3PutObjectCopy".asInstanceOf[OperationName]
  val S3PutObjectAcl = "S3PutObjectAcl".asInstanceOf[OperationName]
  val S3PutObjectTagging = "S3PutObjectTagging".asInstanceOf[OperationName]
  val S3DeleteObjectTagging = "S3DeleteObjectTagging".asInstanceOf[OperationName]
  val S3InitiateRestoreObject = "S3InitiateRestoreObject".asInstanceOf[OperationName]
  val S3PutObjectLegalHold = "S3PutObjectLegalHold".asInstanceOf[OperationName]
  val S3PutObjectRetention = "S3PutObjectRetention".asInstanceOf[OperationName]
  val S3ReplicateObject = "S3ReplicateObject".asInstanceOf[OperationName]

  @inline def values: js.Array[OperationName] = js.Array(
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

@js.native
sealed trait OutputSchemaVersion extends js.Any
object OutputSchemaVersion {
  val V_1 = "V_1".asInstanceOf[OutputSchemaVersion]

  @inline def values: js.Array[OutputSchemaVersion] = js.Array(V_1)
}

@js.native
sealed trait ReplicationStatus extends js.Any
object ReplicationStatus {
  val COMPLETED = "COMPLETED".asInstanceOf[ReplicationStatus]
  val FAILED = "FAILED".asInstanceOf[ReplicationStatus]
  val REPLICA = "REPLICA".asInstanceOf[ReplicationStatus]
  val NONE = "NONE".asInstanceOf[ReplicationStatus]

  @inline def values: js.Array[ReplicationStatus] = js.Array(COMPLETED, FAILED, REPLICA, NONE)
}

@js.native
sealed trait RequestedJobStatus extends js.Any
object RequestedJobStatus {
  val Cancelled = "Cancelled".asInstanceOf[RequestedJobStatus]
  val Ready = "Ready".asInstanceOf[RequestedJobStatus]

  @inline def values: js.Array[RequestedJobStatus] = js.Array(Cancelled, Ready)
}

@js.native
sealed trait S3CannedAccessControlList extends js.Any
object S3CannedAccessControlList {
  val `private` = "private".asInstanceOf[S3CannedAccessControlList]
  val `public-read` = "public-read".asInstanceOf[S3CannedAccessControlList]
  val `public-read-write` = "public-read-write".asInstanceOf[S3CannedAccessControlList]
  val `aws-exec-read` = "aws-exec-read".asInstanceOf[S3CannedAccessControlList]
  val `authenticated-read` = "authenticated-read".asInstanceOf[S3CannedAccessControlList]
  val `bucket-owner-read` = "bucket-owner-read".asInstanceOf[S3CannedAccessControlList]
  val `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[S3CannedAccessControlList]

  @inline def values: js.Array[S3CannedAccessControlList] = js.Array(`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`)
}

@js.native
sealed trait S3ChecksumAlgorithm extends js.Any
object S3ChecksumAlgorithm {
  val CRC32 = "CRC32".asInstanceOf[S3ChecksumAlgorithm]
  val CRC32C = "CRC32C".asInstanceOf[S3ChecksumAlgorithm]
  val SHA1 = "SHA1".asInstanceOf[S3ChecksumAlgorithm]
  val SHA256 = "SHA256".asInstanceOf[S3ChecksumAlgorithm]

  @inline def values: js.Array[S3ChecksumAlgorithm] = js.Array(CRC32, CRC32C, SHA1, SHA256)
}

@js.native
sealed trait S3GlacierJobTier extends js.Any
object S3GlacierJobTier {
  val BULK = "BULK".asInstanceOf[S3GlacierJobTier]
  val STANDARD = "STANDARD".asInstanceOf[S3GlacierJobTier]

  @inline def values: js.Array[S3GlacierJobTier] = js.Array(BULK, STANDARD)
}

@js.native
sealed trait S3GranteeTypeIdentifier extends js.Any
object S3GranteeTypeIdentifier {
  val id = "id".asInstanceOf[S3GranteeTypeIdentifier]
  val emailAddress = "emailAddress".asInstanceOf[S3GranteeTypeIdentifier]
  val uri = "uri".asInstanceOf[S3GranteeTypeIdentifier]

  @inline def values: js.Array[S3GranteeTypeIdentifier] = js.Array(id, emailAddress, uri)
}

@js.native
sealed trait S3MetadataDirective extends js.Any
object S3MetadataDirective {
  val COPY = "COPY".asInstanceOf[S3MetadataDirective]
  val REPLACE = "REPLACE".asInstanceOf[S3MetadataDirective]

  @inline def values: js.Array[S3MetadataDirective] = js.Array(COPY, REPLACE)
}

@js.native
sealed trait S3ObjectLockLegalHoldStatus extends js.Any
object S3ObjectLockLegalHoldStatus {
  val OFF = "OFF".asInstanceOf[S3ObjectLockLegalHoldStatus]
  val ON = "ON".asInstanceOf[S3ObjectLockLegalHoldStatus]

  @inline def values: js.Array[S3ObjectLockLegalHoldStatus] = js.Array(OFF, ON)
}

@js.native
sealed trait S3ObjectLockMode extends js.Any
object S3ObjectLockMode {
  val COMPLIANCE = "COMPLIANCE".asInstanceOf[S3ObjectLockMode]
  val GOVERNANCE = "GOVERNANCE".asInstanceOf[S3ObjectLockMode]

  @inline def values: js.Array[S3ObjectLockMode] = js.Array(COMPLIANCE, GOVERNANCE)
}

@js.native
sealed trait S3ObjectLockRetentionMode extends js.Any
object S3ObjectLockRetentionMode {
  val COMPLIANCE = "COMPLIANCE".asInstanceOf[S3ObjectLockRetentionMode]
  val GOVERNANCE = "GOVERNANCE".asInstanceOf[S3ObjectLockRetentionMode]

  @inline def values: js.Array[S3ObjectLockRetentionMode] = js.Array(COMPLIANCE, GOVERNANCE)
}

@js.native
sealed trait S3Permission extends js.Any
object S3Permission {
  val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[S3Permission]
  val READ = "READ".asInstanceOf[S3Permission]
  val WRITE = "WRITE".asInstanceOf[S3Permission]
  val READ_ACP = "READ_ACP".asInstanceOf[S3Permission]
  val WRITE_ACP = "WRITE_ACP".asInstanceOf[S3Permission]

  @inline def values: js.Array[S3Permission] = js.Array(FULL_CONTROL, READ, WRITE, READ_ACP, WRITE_ACP)
}

@js.native
sealed trait S3SSEAlgorithm extends js.Any
object S3SSEAlgorithm {
  val AES256 = "AES256".asInstanceOf[S3SSEAlgorithm]
  val KMS = "KMS".asInstanceOf[S3SSEAlgorithm]

  @inline def values: js.Array[S3SSEAlgorithm] = js.Array(AES256, KMS)
}

@js.native
sealed trait S3StorageClass extends js.Any
object S3StorageClass {
  val STANDARD = "STANDARD".asInstanceOf[S3StorageClass]
  val STANDARD_IA = "STANDARD_IA".asInstanceOf[S3StorageClass]
  val ONEZONE_IA = "ONEZONE_IA".asInstanceOf[S3StorageClass]
  val GLACIER = "GLACIER".asInstanceOf[S3StorageClass]
  val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[S3StorageClass]
  val DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[S3StorageClass]
  val GLACIER_IR = "GLACIER_IR".asInstanceOf[S3StorageClass]

  @inline def values: js.Array[S3StorageClass] = js.Array(STANDARD, STANDARD_IA, ONEZONE_IA, GLACIER, INTELLIGENT_TIERING, DEEP_ARCHIVE, GLACIER_IR)
}

@js.native
sealed trait TransitionStorageClass extends js.Any
object TransitionStorageClass {
  val GLACIER = "GLACIER".asInstanceOf[TransitionStorageClass]
  val STANDARD_IA = "STANDARD_IA".asInstanceOf[TransitionStorageClass]
  val ONEZONE_IA = "ONEZONE_IA".asInstanceOf[TransitionStorageClass]
  val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[TransitionStorageClass]
  val DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[TransitionStorageClass]

  @inline def values: js.Array[TransitionStorageClass] = js.Array(GLACIER, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE)
}
