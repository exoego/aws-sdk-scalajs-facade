package facade.amazonaws.services.s3

import scalajs._

type AnalyticsS3ExportFileFormat = "CSV"
object AnalyticsS3ExportFileFormat {
  inline val CSV: "CSV" = "CSV"

  inline def values: js.Array[AnalyticsS3ExportFileFormat] = js.Array(CSV)
}

type ArchiveStatus = "ARCHIVE_ACCESS" | "DEEP_ARCHIVE_ACCESS"
object ArchiveStatus {
  inline val ARCHIVE_ACCESS: "ARCHIVE_ACCESS" = "ARCHIVE_ACCESS"
  inline val DEEP_ARCHIVE_ACCESS: "DEEP_ARCHIVE_ACCESS" = "DEEP_ARCHIVE_ACCESS"

  inline def values: js.Array[ArchiveStatus] = js.Array(ARCHIVE_ACCESS, DEEP_ARCHIVE_ACCESS)
}

type BucketAccelerateStatus = "Enabled" | "Suspended"
object BucketAccelerateStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Suspended: "Suspended" = "Suspended"

  inline def values: js.Array[BucketAccelerateStatus] = js.Array(Enabled, Suspended)
}

type BucketCannedACL = "private" | "public-read" | "public-read-write" | "authenticated-read"
object BucketCannedACL {
  inline val `private`: "private" = "private"
  inline val `public-read`: "public-read" = "public-read"
  inline val `public-read-write`: "public-read-write" = "public-read-write"
  inline val `authenticated-read`: "authenticated-read" = "authenticated-read"

  inline def values: js.Array[BucketCannedACL] = js.Array(`private`, `public-read`, `public-read-write`, `authenticated-read`)
}

type BucketLocationConstraint = "af-south-1" | "ap-east-1" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ca-central-1" | "cn-north-1" | "cn-northwest-1" | "EU" | "eu-central-1" | "eu-north-1" | "eu-south-1" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "me-south-1" | "sa-east-1" | "us-east-2" | "us-gov-east-1" | "us-gov-west-1" | "us-west-1" | "us-west-2"
object BucketLocationConstraint {
  inline val `af-south-1`: "af-south-1" = "af-south-1"
  inline val `ap-east-1`: "ap-east-1" = "ap-east-1"
  inline val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  inline val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  inline val `ap-northeast-3`: "ap-northeast-3" = "ap-northeast-3"
  inline val `ap-south-1`: "ap-south-1" = "ap-south-1"
  inline val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  inline val `ca-central-1`: "ca-central-1" = "ca-central-1"
  inline val `cn-north-1`: "cn-north-1" = "cn-north-1"
  inline val `cn-northwest-1`: "cn-northwest-1" = "cn-northwest-1"
  inline val EU: "EU" = "EU"
  inline val `eu-central-1`: "eu-central-1" = "eu-central-1"
  inline val `eu-north-1`: "eu-north-1" = "eu-north-1"
  inline val `eu-south-1`: "eu-south-1" = "eu-south-1"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val `eu-west-2`: "eu-west-2" = "eu-west-2"
  inline val `eu-west-3`: "eu-west-3" = "eu-west-3"
  inline val `me-south-1`: "me-south-1" = "me-south-1"
  inline val `sa-east-1`: "sa-east-1" = "sa-east-1"
  inline val `us-east-2`: "us-east-2" = "us-east-2"
  inline val `us-gov-east-1`: "us-gov-east-1" = "us-gov-east-1"
  inline val `us-gov-west-1`: "us-gov-west-1" = "us-gov-west-1"
  inline val `us-west-1`: "us-west-1" = "us-west-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"

  inline def values: js.Array[BucketLocationConstraint] = js.Array(
    `af-south-1`,
    `ap-east-1`,
    `ap-northeast-1`,
    `ap-northeast-2`,
    `ap-northeast-3`,
    `ap-south-1`,
    `ap-southeast-1`,
    `ap-southeast-2`,
    `ca-central-1`,
    `cn-north-1`,
    `cn-northwest-1`,
    EU,
    `eu-central-1`,
    `eu-north-1`,
    `eu-south-1`,
    `eu-west-1`,
    `eu-west-2`,
    `eu-west-3`,
    `me-south-1`,
    `sa-east-1`,
    `us-east-2`,
    `us-gov-east-1`,
    `us-gov-west-1`,
    `us-west-1`,
    `us-west-2`
  )
}

type BucketLogsPermission = "FULL_CONTROL" | "READ" | "WRITE"
object BucketLogsPermission {
  inline val FULL_CONTROL: "FULL_CONTROL" = "FULL_CONTROL"
  inline val READ: "READ" = "READ"
  inline val WRITE: "WRITE" = "WRITE"

  inline def values: js.Array[BucketLogsPermission] = js.Array(FULL_CONTROL, READ, WRITE)
}

type BucketVersioningStatus = "Enabled" | "Suspended"
object BucketVersioningStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Suspended: "Suspended" = "Suspended"

  inline def values: js.Array[BucketVersioningStatus] = js.Array(Enabled, Suspended)
}

type CompressionType = "NONE" | "GZIP" | "BZIP2"
object CompressionType {
  inline val NONE: "NONE" = "NONE"
  inline val GZIP: "GZIP" = "GZIP"
  inline val BZIP2: "BZIP2" = "BZIP2"

  inline def values: js.Array[CompressionType] = js.Array(NONE, GZIP, BZIP2)
}

type DeleteMarkerReplicationStatus = "Enabled" | "Disabled"
object DeleteMarkerReplicationStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[DeleteMarkerReplicationStatus] = js.Array(Enabled, Disabled)
}

/** Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.
  */
type EncodingType = "url"
object EncodingType {
  inline val url: "url" = "url"

  inline def values: js.Array[EncodingType] = js.Array(url)
}

/** The bucket event for which to send notifications.
  */
type Event = "s3:ReducedRedundancyLostObject" | "s3:ObjectCreated:*" | "s3:ObjectCreated:Put" | "s3:ObjectCreated:Post" | "s3:ObjectCreated:Copy" | "s3:ObjectCreated:CompleteMultipartUpload" | "s3:ObjectRemoved:*" | "s3:ObjectRemoved:Delete" | "s3:ObjectRemoved:DeleteMarkerCreated" | "s3:ObjectRestore:*" | "s3:ObjectRestore:Post" | "s3:ObjectRestore:Completed" | "s3:Replication:*" | "s3:Replication:OperationFailedReplication" | "s3:Replication:OperationNotTracked" | "s3:Replication:OperationMissedThreshold" | "s3:Replication:OperationReplicatedAfterThreshold"
object Event {
  inline val `s3:ReducedRedundancyLostObject`: "s3:ReducedRedundancyLostObject" = "s3:ReducedRedundancyLostObject"
  inline val `s3:ObjectCreated:*` : "s3:ObjectCreated:*" = "s3:ObjectCreated:*"
  inline val `s3:ObjectCreated:Put`: "s3:ObjectCreated:Put" = "s3:ObjectCreated:Put"
  inline val `s3:ObjectCreated:Post`: "s3:ObjectCreated:Post" = "s3:ObjectCreated:Post"
  inline val `s3:ObjectCreated:Copy`: "s3:ObjectCreated:Copy" = "s3:ObjectCreated:Copy"
  inline val `s3:ObjectCreated:CompleteMultipartUpload`: "s3:ObjectCreated:CompleteMultipartUpload" = "s3:ObjectCreated:CompleteMultipartUpload"
  inline val `s3:ObjectRemoved:*` : "s3:ObjectRemoved:*" = "s3:ObjectRemoved:*"
  inline val `s3:ObjectRemoved:Delete`: "s3:ObjectRemoved:Delete" = "s3:ObjectRemoved:Delete"
  inline val `s3:ObjectRemoved:DeleteMarkerCreated`: "s3:ObjectRemoved:DeleteMarkerCreated" = "s3:ObjectRemoved:DeleteMarkerCreated"
  inline val `s3:ObjectRestore:*` : "s3:ObjectRestore:*" = "s3:ObjectRestore:*"
  inline val `s3:ObjectRestore:Post`: "s3:ObjectRestore:Post" = "s3:ObjectRestore:Post"
  inline val `s3:ObjectRestore:Completed`: "s3:ObjectRestore:Completed" = "s3:ObjectRestore:Completed"
  inline val `s3:Replication:*` : "s3:Replication:*" = "s3:Replication:*"
  inline val `s3:Replication:OperationFailedReplication`: "s3:Replication:OperationFailedReplication" = "s3:Replication:OperationFailedReplication"
  inline val `s3:Replication:OperationNotTracked`: "s3:Replication:OperationNotTracked" = "s3:Replication:OperationNotTracked"
  inline val `s3:Replication:OperationMissedThreshold`: "s3:Replication:OperationMissedThreshold" = "s3:Replication:OperationMissedThreshold"
  inline val `s3:Replication:OperationReplicatedAfterThreshold`: "s3:Replication:OperationReplicatedAfterThreshold" = "s3:Replication:OperationReplicatedAfterThreshold"

  inline def values: js.Array[Event] = js.Array(
    `s3:ReducedRedundancyLostObject`,
    `s3:ObjectCreated:*`,
    `s3:ObjectCreated:Put`,
    `s3:ObjectCreated:Post`,
    `s3:ObjectCreated:Copy`,
    `s3:ObjectCreated:CompleteMultipartUpload`,
    `s3:ObjectRemoved:*`,
    `s3:ObjectRemoved:Delete`,
    `s3:ObjectRemoved:DeleteMarkerCreated`,
    `s3:ObjectRestore:*`,
    `s3:ObjectRestore:Post`,
    `s3:ObjectRestore:Completed`,
    `s3:Replication:*`,
    `s3:Replication:OperationFailedReplication`,
    `s3:Replication:OperationNotTracked`,
    `s3:Replication:OperationMissedThreshold`,
    `s3:Replication:OperationReplicatedAfterThreshold`
  )
}

type ExistingObjectReplicationStatus = "Enabled" | "Disabled"
object ExistingObjectReplicationStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ExistingObjectReplicationStatus] = js.Array(Enabled, Disabled)
}

type ExpirationStatus = "Enabled" | "Disabled"
object ExpirationStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ExpirationStatus] = js.Array(Enabled, Disabled)
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

type FilterRuleName = "prefix" | "suffix"
object FilterRuleName {
  inline val prefix: "prefix" = "prefix"
  inline val suffix: "suffix" = "suffix"

  inline def values: js.Array[FilterRuleName] = js.Array(prefix, suffix)
}

type IntelligentTieringAccessTier = "ARCHIVE_ACCESS" | "DEEP_ARCHIVE_ACCESS"
object IntelligentTieringAccessTier {
  inline val ARCHIVE_ACCESS: "ARCHIVE_ACCESS" = "ARCHIVE_ACCESS"
  inline val DEEP_ARCHIVE_ACCESS: "DEEP_ARCHIVE_ACCESS" = "DEEP_ARCHIVE_ACCESS"

  inline def values: js.Array[IntelligentTieringAccessTier] = js.Array(ARCHIVE_ACCESS, DEEP_ARCHIVE_ACCESS)
}

type IntelligentTieringStatus = "Enabled" | "Disabled"
object IntelligentTieringStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[IntelligentTieringStatus] = js.Array(Enabled, Disabled)
}

type InventoryFormat = "CSV" | "ORC" | "Parquet"
object InventoryFormat {
  inline val CSV: "CSV" = "CSV"
  inline val ORC: "ORC" = "ORC"
  inline val Parquet: "Parquet" = "Parquet"

  inline def values: js.Array[InventoryFormat] = js.Array(CSV, ORC, Parquet)
}

type InventoryFrequency = "Daily" | "Weekly"
object InventoryFrequency {
  inline val Daily: "Daily" = "Daily"
  inline val Weekly: "Weekly" = "Weekly"

  inline def values: js.Array[InventoryFrequency] = js.Array(Daily, Weekly)
}

type InventoryIncludedObjectVersions = "All" | "Current"
object InventoryIncludedObjectVersions {
  inline val All: "All" = "All"
  inline val Current: "Current" = "Current"

  inline def values: js.Array[InventoryIncludedObjectVersions] = js.Array(All, Current)
}

type InventoryOptionalField = "Size" | "LastModifiedDate" | "StorageClass" | "ETag" | "IsMultipartUploaded" | "ReplicationStatus" | "EncryptionStatus" | "ObjectLockRetainUntilDate" | "ObjectLockMode" | "ObjectLockLegalHoldStatus" | "IntelligentTieringAccessTier"
object InventoryOptionalField {
  inline val Size: "Size" = "Size"
  inline val LastModifiedDate: "LastModifiedDate" = "LastModifiedDate"
  inline val StorageClass: "StorageClass" = "StorageClass"
  inline val ETag: "ETag" = "ETag"
  inline val IsMultipartUploaded: "IsMultipartUploaded" = "IsMultipartUploaded"
  inline val ReplicationStatus: "ReplicationStatus" = "ReplicationStatus"
  inline val EncryptionStatus: "EncryptionStatus" = "EncryptionStatus"
  inline val ObjectLockRetainUntilDate: "ObjectLockRetainUntilDate" = "ObjectLockRetainUntilDate"
  inline val ObjectLockMode: "ObjectLockMode" = "ObjectLockMode"
  inline val ObjectLockLegalHoldStatus: "ObjectLockLegalHoldStatus" = "ObjectLockLegalHoldStatus"
  inline val IntelligentTieringAccessTier: "IntelligentTieringAccessTier" = "IntelligentTieringAccessTier"

  inline def values: js.Array[InventoryOptionalField] = js.Array(
    Size,
    LastModifiedDate,
    StorageClass,
    ETag,
    IsMultipartUploaded,
    ReplicationStatus,
    EncryptionStatus,
    ObjectLockRetainUntilDate,
    ObjectLockMode,
    ObjectLockLegalHoldStatus,
    IntelligentTieringAccessTier
  )
}

type JSONType = "DOCUMENT" | "LINES"
object JSONType {
  inline val DOCUMENT: "DOCUMENT" = "DOCUMENT"
  inline val LINES: "LINES" = "LINES"

  inline def values: js.Array[JSONType] = js.Array(DOCUMENT, LINES)
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

type MetadataDirective = "COPY" | "REPLACE"
object MetadataDirective {
  inline val COPY: "COPY" = "COPY"
  inline val REPLACE: "REPLACE" = "REPLACE"

  inline def values: js.Array[MetadataDirective] = js.Array(COPY, REPLACE)
}

type MetricsStatus = "Enabled" | "Disabled"
object MetricsStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[MetricsStatus] = js.Array(Enabled, Disabled)
}

type ObjectCannedACL = "private" | "public-read" | "public-read-write" | "authenticated-read" | "aws-exec-read" | "bucket-owner-read" | "bucket-owner-full-control"
object ObjectCannedACL {
  inline val `private`: "private" = "private"
  inline val `public-read`: "public-read" = "public-read"
  inline val `public-read-write`: "public-read-write" = "public-read-write"
  inline val `authenticated-read`: "authenticated-read" = "authenticated-read"
  inline val `aws-exec-read`: "aws-exec-read" = "aws-exec-read"
  inline val `bucket-owner-read`: "bucket-owner-read" = "bucket-owner-read"
  inline val `bucket-owner-full-control`: "bucket-owner-full-control" = "bucket-owner-full-control"

  inline def values: js.Array[ObjectCannedACL] = js.Array(`private`, `public-read`, `public-read-write`, `authenticated-read`, `aws-exec-read`, `bucket-owner-read`, `bucket-owner-full-control`)
}

type ObjectLockEnabled = "Enabled"
object ObjectLockEnabled {
  inline val Enabled: "Enabled" = "Enabled"

  inline def values: js.Array[ObjectLockEnabled] = js.Array(Enabled)
}

type ObjectLockLegalHoldStatus = "ON" | "OFF"
object ObjectLockLegalHoldStatus {
  inline val ON: "ON" = "ON"
  inline val OFF: "OFF" = "OFF"

  inline def values: js.Array[ObjectLockLegalHoldStatus] = js.Array(ON, OFF)
}

type ObjectLockMode = "GOVERNANCE" | "COMPLIANCE"
object ObjectLockMode {
  inline val GOVERNANCE: "GOVERNANCE" = "GOVERNANCE"
  inline val COMPLIANCE: "COMPLIANCE" = "COMPLIANCE"

  inline def values: js.Array[ObjectLockMode] = js.Array(GOVERNANCE, COMPLIANCE)
}

type ObjectLockRetentionMode = "GOVERNANCE" | "COMPLIANCE"
object ObjectLockRetentionMode {
  inline val GOVERNANCE: "GOVERNANCE" = "GOVERNANCE"
  inline val COMPLIANCE: "COMPLIANCE" = "COMPLIANCE"

  inline def values: js.Array[ObjectLockRetentionMode] = js.Array(GOVERNANCE, COMPLIANCE)
}

/** The container element for object ownership for a bucket's ownership controls. BucketOwnerPreferred - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the <code>bucket-owner-full-control</code> canned ACL. ObjectWriter - The uploading account will own the object if the object is uploaded with the <code>bucket-owner-full-control</code> canned ACL.
  */
type ObjectOwnership = "BucketOwnerPreferred" | "ObjectWriter"
object ObjectOwnership {
  inline val BucketOwnerPreferred: "BucketOwnerPreferred" = "BucketOwnerPreferred"
  inline val ObjectWriter: "ObjectWriter" = "ObjectWriter"

  inline def values: js.Array[ObjectOwnership] = js.Array(BucketOwnerPreferred, ObjectWriter)
}

type ObjectStorageClass = "STANDARD" | "REDUCED_REDUNDANCY" | "GLACIER" | "STANDARD_IA" | "ONEZONE_IA" | "INTELLIGENT_TIERING" | "DEEP_ARCHIVE" | "OUTPOSTS"
object ObjectStorageClass {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val REDUCED_REDUNDANCY: "REDUCED_REDUNDANCY" = "REDUCED_REDUNDANCY"
  inline val GLACIER: "GLACIER" = "GLACIER"
  inline val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  inline val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  inline val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  inline val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"
  inline val OUTPOSTS: "OUTPOSTS" = "OUTPOSTS"

  inline def values: js.Array[ObjectStorageClass] = js.Array(STANDARD, REDUCED_REDUNDANCY, GLACIER, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE, OUTPOSTS)
}

type ObjectVersionStorageClass = "STANDARD"
object ObjectVersionStorageClass {
  inline val STANDARD: "STANDARD" = "STANDARD"

  inline def values: js.Array[ObjectVersionStorageClass] = js.Array(STANDARD)
}

type OwnerOverride = "Destination"
object OwnerOverride {
  inline val Destination: "Destination" = "Destination"

  inline def values: js.Array[OwnerOverride] = js.Array(Destination)
}

type Payer = "Requester" | "BucketOwner"
object Payer {
  inline val Requester: "Requester" = "Requester"
  inline val BucketOwner: "BucketOwner" = "BucketOwner"

  inline def values: js.Array[Payer] = js.Array(Requester, BucketOwner)
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

type Protocol = "http" | "https"
object Protocol {
  inline val http: "http" = "http"
  inline val https: "https" = "https"

  inline def values: js.Array[Protocol] = js.Array(http, https)
}

type QuoteFields = "ALWAYS" | "ASNEEDED"
object QuoteFields {
  inline val ALWAYS: "ALWAYS" = "ALWAYS"
  inline val ASNEEDED: "ASNEEDED" = "ASNEEDED"

  inline def values: js.Array[QuoteFields] = js.Array(ALWAYS, ASNEEDED)
}

type ReplicaModificationsStatus = "Enabled" | "Disabled"
object ReplicaModificationsStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ReplicaModificationsStatus] = js.Array(Enabled, Disabled)
}

type ReplicationRuleStatus = "Enabled" | "Disabled"
object ReplicationRuleStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ReplicationRuleStatus] = js.Array(Enabled, Disabled)
}

type ReplicationStatus = "COMPLETE" | "PENDING" | "FAILED" | "REPLICA"
object ReplicationStatus {
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val PENDING: "PENDING" = "PENDING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val REPLICA: "REPLICA" = "REPLICA"

  inline def values: js.Array[ReplicationStatus] = js.Array(COMPLETE, PENDING, FAILED, REPLICA)
}

type ReplicationTimeStatus = "Enabled" | "Disabled"
object ReplicationTimeStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ReplicationTimeStatus] = js.Array(Enabled, Disabled)
}

/** If present, indicates that the requester was successfully charged for the request.
  */
type RequestCharged = "requester"
object RequestCharged {
  inline val requester: "requester" = "requester"

  inline def values: js.Array[RequestCharged] = js.Array(requester)
}

/** Confirms that the requester knows that they will be charged for the request. Bucket owners need not specify this parameter in their requests. For information about downloading objects from requester pays buckets, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html|Downloading Objects in Requestor Pays Buckets]] in the <i>Amazon S3 Developer Guide</i>.
  */
type RequestPayer = "requester"
object RequestPayer {
  inline val requester: "requester" = "requester"

  inline def values: js.Array[RequestPayer] = js.Array(requester)
}

type RestoreRequestType = "SELECT"
object RestoreRequestType {
  inline val SELECT: "SELECT" = "SELECT"

  inline def values: js.Array[RestoreRequestType] = js.Array(SELECT)
}

type ServerSideEncryption = "AES256" | "aws:kms"
object ServerSideEncryption {
  inline val AES256: "AES256" = "AES256"
  inline val `aws:kms`: "aws:kms" = "aws:kms"

  inline def values: js.Array[ServerSideEncryption] = js.Array(AES256, `aws:kms`)
}

type SseKmsEncryptedObjectsStatus = "Enabled" | "Disabled"
object SseKmsEncryptedObjectsStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[SseKmsEncryptedObjectsStatus] = js.Array(Enabled, Disabled)
}

type StorageClass = "STANDARD" | "REDUCED_REDUNDANCY" | "STANDARD_IA" | "ONEZONE_IA" | "INTELLIGENT_TIERING" | "GLACIER" | "DEEP_ARCHIVE" | "OUTPOSTS"
object StorageClass {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val REDUCED_REDUNDANCY: "REDUCED_REDUNDANCY" = "REDUCED_REDUNDANCY"
  inline val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  inline val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  inline val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  inline val GLACIER: "GLACIER" = "GLACIER"
  inline val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"
  inline val OUTPOSTS: "OUTPOSTS" = "OUTPOSTS"

  inline def values: js.Array[StorageClass] = js.Array(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE, OUTPOSTS)
}

type StorageClassAnalysisSchemaVersion = "V_1"
object StorageClassAnalysisSchemaVersion {
  inline val V_1: "V_1" = "V_1"

  inline def values: js.Array[StorageClassAnalysisSchemaVersion] = js.Array(V_1)
}

type TaggingDirective = "COPY" | "REPLACE"
object TaggingDirective {
  inline val COPY: "COPY" = "COPY"
  inline val REPLACE: "REPLACE" = "REPLACE"

  inline def values: js.Array[TaggingDirective] = js.Array(COPY, REPLACE)
}

type Tier = "Standard" | "Bulk" | "Expedited"
object Tier {
  inline val Standard: "Standard" = "Standard"
  inline val Bulk: "Bulk" = "Bulk"
  inline val Expedited: "Expedited" = "Expedited"

  inline def values: js.Array[Tier] = js.Array(Standard, Bulk, Expedited)
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

type Type = "CanonicalUser" | "AmazonCustomerByEmail" | "Group"
object Type {
  inline val CanonicalUser: "CanonicalUser" = "CanonicalUser"
  inline val AmazonCustomerByEmail: "AmazonCustomerByEmail" = "AmazonCustomerByEmail"
  inline val Group: "Group" = "Group"

  inline def values: js.Array[Type] = js.Array(CanonicalUser, AmazonCustomerByEmail, Group)
}
