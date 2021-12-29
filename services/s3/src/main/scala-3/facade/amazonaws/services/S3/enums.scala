package facade.amazonaws.services.s3

import scalajs._

type AnalyticsS3ExportFileFormat = "CSV"
object AnalyticsS3ExportFileFormat {
  val CSV: "CSV" = "CSV"

  @inline def values = js.Array[AnalyticsS3ExportFileFormat](CSV)
}

type ArchiveStatus = "ARCHIVE_ACCESS" | "DEEP_ARCHIVE_ACCESS"
object ArchiveStatus {
  val ARCHIVE_ACCESS: "ARCHIVE_ACCESS" = "ARCHIVE_ACCESS"
  val DEEP_ARCHIVE_ACCESS: "DEEP_ARCHIVE_ACCESS" = "DEEP_ARCHIVE_ACCESS"

  @inline def values = js.Array[ArchiveStatus](ARCHIVE_ACCESS, DEEP_ARCHIVE_ACCESS)
}

type BucketAccelerateStatus = "Enabled" | "Suspended"
object BucketAccelerateStatus {
  val Enabled: "Enabled" = "Enabled"
  val Suspended: "Suspended" = "Suspended"

  @inline def values = js.Array[BucketAccelerateStatus](Enabled, Suspended)
}

type BucketCannedACL = "private" | "public-read" | "public-read-write" | "authenticated-read"
object BucketCannedACL {
  val `private`: "private" = "private"
  val `public-read`: "public-read" = "public-read"
  val `public-read-write`: "public-read-write" = "public-read-write"
  val `authenticated-read`: "authenticated-read" = "authenticated-read"

  @inline def values = js.Array[BucketCannedACL](`private`, `public-read`, `public-read-write`, `authenticated-read`)
}

type BucketLocationConstraint = "af-south-1" | "ap-east-1" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ca-central-1" | "cn-north-1" | "cn-northwest-1" | "EU" | "eu-central-1" | "eu-north-1" | "eu-south-1" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "me-south-1" | "sa-east-1" | "us-east-2" | "us-gov-east-1" | "us-gov-west-1" | "us-west-1" | "us-west-2"
object BucketLocationConstraint {
  val `af-south-1`: "af-south-1" = "af-south-1"
  val `ap-east-1`: "ap-east-1" = "ap-east-1"
  val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  val `ap-northeast-3`: "ap-northeast-3" = "ap-northeast-3"
  val `ap-south-1`: "ap-south-1" = "ap-south-1"
  val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  val `ca-central-1`: "ca-central-1" = "ca-central-1"
  val `cn-north-1`: "cn-north-1" = "cn-north-1"
  val `cn-northwest-1`: "cn-northwest-1" = "cn-northwest-1"
  val EU: "EU" = "EU"
  val `eu-central-1`: "eu-central-1" = "eu-central-1"
  val `eu-north-1`: "eu-north-1" = "eu-north-1"
  val `eu-south-1`: "eu-south-1" = "eu-south-1"
  val `eu-west-1`: "eu-west-1" = "eu-west-1"
  val `eu-west-2`: "eu-west-2" = "eu-west-2"
  val `eu-west-3`: "eu-west-3" = "eu-west-3"
  val `me-south-1`: "me-south-1" = "me-south-1"
  val `sa-east-1`: "sa-east-1" = "sa-east-1"
  val `us-east-2`: "us-east-2" = "us-east-2"
  val `us-gov-east-1`: "us-gov-east-1" = "us-gov-east-1"
  val `us-gov-west-1`: "us-gov-west-1" = "us-gov-west-1"
  val `us-west-1`: "us-west-1" = "us-west-1"
  val `us-west-2`: "us-west-2" = "us-west-2"

  @inline def values = js.Array[BucketLocationConstraint](
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
  val FULL_CONTROL: "FULL_CONTROL" = "FULL_CONTROL"
  val READ: "READ" = "READ"
  val WRITE: "WRITE" = "WRITE"

  @inline def values = js.Array[BucketLogsPermission](FULL_CONTROL, READ, WRITE)
}

type BucketVersioningStatus = "Enabled" | "Suspended"
object BucketVersioningStatus {
  val Enabled: "Enabled" = "Enabled"
  val Suspended: "Suspended" = "Suspended"

  @inline def values = js.Array[BucketVersioningStatus](Enabled, Suspended)
}

type CompressionType = "NONE" | "GZIP" | "BZIP2"
object CompressionType {
  val NONE: "NONE" = "NONE"
  val GZIP: "GZIP" = "GZIP"
  val BZIP2: "BZIP2" = "BZIP2"

  @inline def values = js.Array[CompressionType](NONE, GZIP, BZIP2)
}

type DeleteMarkerReplicationStatus = "Enabled" | "Disabled"
object DeleteMarkerReplicationStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[DeleteMarkerReplicationStatus](Enabled, Disabled)
}

/** Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.
  */
type EncodingType = "url"
object EncodingType {
  val url: "url" = "url"

  @inline def values = js.Array[EncodingType](url)
}

/** The bucket event for which to send notifications.
  */
type Event = "s3:ReducedRedundancyLostObject" | "s3:ObjectCreated:*" | "s3:ObjectCreated:Put" | "s3:ObjectCreated:Post" | "s3:ObjectCreated:Copy" | "s3:ObjectCreated:CompleteMultipartUpload" | "s3:ObjectRemoved:*" | "s3:ObjectRemoved:Delete" | "s3:ObjectRemoved:DeleteMarkerCreated" | "s3:ObjectRestore:*" | "s3:ObjectRestore:Post" | "s3:ObjectRestore:Completed" | "s3:Replication:*" | "s3:Replication:OperationFailedReplication" | "s3:Replication:OperationNotTracked" | "s3:Replication:OperationMissedThreshold" | "s3:Replication:OperationReplicatedAfterThreshold"
object Event {
  val `s3:ReducedRedundancyLostObject`: "s3:ReducedRedundancyLostObject" = "s3:ReducedRedundancyLostObject"
  val `s3:ObjectCreated:*` : "s3:ObjectCreated:*" = "s3:ObjectCreated:*"
  val `s3:ObjectCreated:Put`: "s3:ObjectCreated:Put" = "s3:ObjectCreated:Put"
  val `s3:ObjectCreated:Post`: "s3:ObjectCreated:Post" = "s3:ObjectCreated:Post"
  val `s3:ObjectCreated:Copy`: "s3:ObjectCreated:Copy" = "s3:ObjectCreated:Copy"
  val `s3:ObjectCreated:CompleteMultipartUpload`: "s3:ObjectCreated:CompleteMultipartUpload" = "s3:ObjectCreated:CompleteMultipartUpload"
  val `s3:ObjectRemoved:*` : "s3:ObjectRemoved:*" = "s3:ObjectRemoved:*"
  val `s3:ObjectRemoved:Delete`: "s3:ObjectRemoved:Delete" = "s3:ObjectRemoved:Delete"
  val `s3:ObjectRemoved:DeleteMarkerCreated`: "s3:ObjectRemoved:DeleteMarkerCreated" = "s3:ObjectRemoved:DeleteMarkerCreated"
  val `s3:ObjectRestore:*` : "s3:ObjectRestore:*" = "s3:ObjectRestore:*"
  val `s3:ObjectRestore:Post`: "s3:ObjectRestore:Post" = "s3:ObjectRestore:Post"
  val `s3:ObjectRestore:Completed`: "s3:ObjectRestore:Completed" = "s3:ObjectRestore:Completed"
  val `s3:Replication:*` : "s3:Replication:*" = "s3:Replication:*"
  val `s3:Replication:OperationFailedReplication`: "s3:Replication:OperationFailedReplication" = "s3:Replication:OperationFailedReplication"
  val `s3:Replication:OperationNotTracked`: "s3:Replication:OperationNotTracked" = "s3:Replication:OperationNotTracked"
  val `s3:Replication:OperationMissedThreshold`: "s3:Replication:OperationMissedThreshold" = "s3:Replication:OperationMissedThreshold"
  val `s3:Replication:OperationReplicatedAfterThreshold`: "s3:Replication:OperationReplicatedAfterThreshold" = "s3:Replication:OperationReplicatedAfterThreshold"

  @inline def values = js.Array[Event](
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
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[ExistingObjectReplicationStatus](Enabled, Disabled)
}

type ExpirationStatus = "Enabled" | "Disabled"
object ExpirationStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[ExpirationStatus](Enabled, Disabled)
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

type FilterRuleName = "prefix" | "suffix"
object FilterRuleName {
  val prefix: "prefix" = "prefix"
  val suffix: "suffix" = "suffix"

  @inline def values = js.Array[FilterRuleName](prefix, suffix)
}

type IntelligentTieringAccessTier = "ARCHIVE_ACCESS" | "DEEP_ARCHIVE_ACCESS"
object IntelligentTieringAccessTier {
  val ARCHIVE_ACCESS: "ARCHIVE_ACCESS" = "ARCHIVE_ACCESS"
  val DEEP_ARCHIVE_ACCESS: "DEEP_ARCHIVE_ACCESS" = "DEEP_ARCHIVE_ACCESS"

  @inline def values = js.Array[IntelligentTieringAccessTier](ARCHIVE_ACCESS, DEEP_ARCHIVE_ACCESS)
}

type IntelligentTieringStatus = "Enabled" | "Disabled"
object IntelligentTieringStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[IntelligentTieringStatus](Enabled, Disabled)
}

type InventoryFormat = "CSV" | "ORC" | "Parquet"
object InventoryFormat {
  val CSV: "CSV" = "CSV"
  val ORC: "ORC" = "ORC"
  val Parquet: "Parquet" = "Parquet"

  @inline def values = js.Array[InventoryFormat](CSV, ORC, Parquet)
}

type InventoryFrequency = "Daily" | "Weekly"
object InventoryFrequency {
  val Daily: "Daily" = "Daily"
  val Weekly: "Weekly" = "Weekly"

  @inline def values = js.Array[InventoryFrequency](Daily, Weekly)
}

type InventoryIncludedObjectVersions = "All" | "Current"
object InventoryIncludedObjectVersions {
  val All: "All" = "All"
  val Current: "Current" = "Current"

  @inline def values = js.Array[InventoryIncludedObjectVersions](All, Current)
}

type InventoryOptionalField = "Size" | "LastModifiedDate" | "StorageClass" | "ETag" | "IsMultipartUploaded" | "ReplicationStatus" | "EncryptionStatus" | "ObjectLockRetainUntilDate" | "ObjectLockMode" | "ObjectLockLegalHoldStatus" | "IntelligentTieringAccessTier"
object InventoryOptionalField {
  val Size: "Size" = "Size"
  val LastModifiedDate: "LastModifiedDate" = "LastModifiedDate"
  val StorageClass: "StorageClass" = "StorageClass"
  val ETag: "ETag" = "ETag"
  val IsMultipartUploaded: "IsMultipartUploaded" = "IsMultipartUploaded"
  val ReplicationStatus: "ReplicationStatus" = "ReplicationStatus"
  val EncryptionStatus: "EncryptionStatus" = "EncryptionStatus"
  val ObjectLockRetainUntilDate: "ObjectLockRetainUntilDate" = "ObjectLockRetainUntilDate"
  val ObjectLockMode: "ObjectLockMode" = "ObjectLockMode"
  val ObjectLockLegalHoldStatus: "ObjectLockLegalHoldStatus" = "ObjectLockLegalHoldStatus"
  val IntelligentTieringAccessTier: "IntelligentTieringAccessTier" = "IntelligentTieringAccessTier"

  @inline def values = js.Array[InventoryOptionalField](
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
  val DOCUMENT: "DOCUMENT" = "DOCUMENT"
  val LINES: "LINES" = "LINES"

  @inline def values = js.Array[JSONType](DOCUMENT, LINES)
}

type MFADelete = "Enabled" | "Disabled"
object MFADelete {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[MFADelete](Enabled, Disabled)
}

type MFADeleteStatus = "Enabled" | "Disabled"
object MFADeleteStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[MFADeleteStatus](Enabled, Disabled)
}

type MetadataDirective = "COPY" | "REPLACE"
object MetadataDirective {
  val COPY: "COPY" = "COPY"
  val REPLACE: "REPLACE" = "REPLACE"

  @inline def values = js.Array[MetadataDirective](COPY, REPLACE)
}

type MetricsStatus = "Enabled" | "Disabled"
object MetricsStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[MetricsStatus](Enabled, Disabled)
}

type ObjectCannedACL = "private" | "public-read" | "public-read-write" | "authenticated-read" | "aws-exec-read" | "bucket-owner-read" | "bucket-owner-full-control"
object ObjectCannedACL {
  val `private`: "private" = "private"
  val `public-read`: "public-read" = "public-read"
  val `public-read-write`: "public-read-write" = "public-read-write"
  val `authenticated-read`: "authenticated-read" = "authenticated-read"
  val `aws-exec-read`: "aws-exec-read" = "aws-exec-read"
  val `bucket-owner-read`: "bucket-owner-read" = "bucket-owner-read"
  val `bucket-owner-full-control`: "bucket-owner-full-control" = "bucket-owner-full-control"

  @inline def values = js.Array[ObjectCannedACL](`private`, `public-read`, `public-read-write`, `authenticated-read`, `aws-exec-read`, `bucket-owner-read`, `bucket-owner-full-control`)
}

type ObjectLockEnabled = "Enabled"
object ObjectLockEnabled {
  val Enabled: "Enabled" = "Enabled"

  @inline def values = js.Array[ObjectLockEnabled](Enabled)
}

type ObjectLockLegalHoldStatus = "ON" | "OFF"
object ObjectLockLegalHoldStatus {
  val ON: "ON" = "ON"
  val OFF: "OFF" = "OFF"

  @inline def values = js.Array[ObjectLockLegalHoldStatus](ON, OFF)
}

type ObjectLockMode = "GOVERNANCE" | "COMPLIANCE"
object ObjectLockMode {
  val GOVERNANCE: "GOVERNANCE" = "GOVERNANCE"
  val COMPLIANCE: "COMPLIANCE" = "COMPLIANCE"

  @inline def values = js.Array[ObjectLockMode](GOVERNANCE, COMPLIANCE)
}

type ObjectLockRetentionMode = "GOVERNANCE" | "COMPLIANCE"
object ObjectLockRetentionMode {
  val GOVERNANCE: "GOVERNANCE" = "GOVERNANCE"
  val COMPLIANCE: "COMPLIANCE" = "COMPLIANCE"

  @inline def values = js.Array[ObjectLockRetentionMode](GOVERNANCE, COMPLIANCE)
}

/** The container element for object ownership for a bucket's ownership controls. BucketOwnerPreferred - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the <code>bucket-owner-full-control</code> canned ACL. ObjectWriter - The uploading account will own the object if the object is uploaded with the <code>bucket-owner-full-control</code> canned ACL.
  */
type ObjectOwnership = "BucketOwnerPreferred" | "ObjectWriter"
object ObjectOwnership {
  val BucketOwnerPreferred: "BucketOwnerPreferred" = "BucketOwnerPreferred"
  val ObjectWriter: "ObjectWriter" = "ObjectWriter"

  @inline def values = js.Array[ObjectOwnership](BucketOwnerPreferred, ObjectWriter)
}

type ObjectStorageClass = "STANDARD" | "REDUCED_REDUNDANCY" | "GLACIER" | "STANDARD_IA" | "ONEZONE_IA" | "INTELLIGENT_TIERING" | "DEEP_ARCHIVE" | "OUTPOSTS"
object ObjectStorageClass {
  val STANDARD: "STANDARD" = "STANDARD"
  val REDUCED_REDUNDANCY: "REDUCED_REDUNDANCY" = "REDUCED_REDUNDANCY"
  val GLACIER: "GLACIER" = "GLACIER"
  val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"
  val OUTPOSTS: "OUTPOSTS" = "OUTPOSTS"

  @inline def values = js.Array[ObjectStorageClass](STANDARD, REDUCED_REDUNDANCY, GLACIER, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE, OUTPOSTS)
}

type ObjectVersionStorageClass = "STANDARD"
object ObjectVersionStorageClass {
  val STANDARD: "STANDARD" = "STANDARD"

  @inline def values = js.Array[ObjectVersionStorageClass](STANDARD)
}

type OwnerOverride = "Destination"
object OwnerOverride {
  val Destination: "Destination" = "Destination"

  @inline def values = js.Array[OwnerOverride](Destination)
}

type Payer = "Requester" | "BucketOwner"
object Payer {
  val Requester: "Requester" = "Requester"
  val BucketOwner: "BucketOwner" = "BucketOwner"

  @inline def values = js.Array[Payer](Requester, BucketOwner)
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

type Protocol = "http" | "https"
object Protocol {
  val http: "http" = "http"
  val https: "https" = "https"

  @inline def values = js.Array[Protocol](http, https)
}

type QuoteFields = "ALWAYS" | "ASNEEDED"
object QuoteFields {
  val ALWAYS: "ALWAYS" = "ALWAYS"
  val ASNEEDED: "ASNEEDED" = "ASNEEDED"

  @inline def values = js.Array[QuoteFields](ALWAYS, ASNEEDED)
}

type ReplicaModificationsStatus = "Enabled" | "Disabled"
object ReplicaModificationsStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[ReplicaModificationsStatus](Enabled, Disabled)
}

type ReplicationRuleStatus = "Enabled" | "Disabled"
object ReplicationRuleStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[ReplicationRuleStatus](Enabled, Disabled)
}

type ReplicationStatus = "COMPLETE" | "PENDING" | "FAILED" | "REPLICA"
object ReplicationStatus {
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val PENDING: "PENDING" = "PENDING"
  val FAILED: "FAILED" = "FAILED"
  val REPLICA: "REPLICA" = "REPLICA"

  @inline def values = js.Array[ReplicationStatus](COMPLETE, PENDING, FAILED, REPLICA)
}

type ReplicationTimeStatus = "Enabled" | "Disabled"
object ReplicationTimeStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[ReplicationTimeStatus](Enabled, Disabled)
}

/** If present, indicates that the requester was successfully charged for the request.
  */
type RequestCharged = "requester"
object RequestCharged {
  val requester: "requester" = "requester"

  @inline def values = js.Array[RequestCharged](requester)
}

/** Confirms that the requester knows that they will be charged for the request. Bucket owners need not specify this parameter in their requests. For information about downloading objects from requester pays buckets, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html|Downloading Objects in Requestor Pays Buckets]] in the <i>Amazon S3 Developer Guide</i>.
  */
type RequestPayer = "requester"
object RequestPayer {
  val requester: "requester" = "requester"

  @inline def values = js.Array[RequestPayer](requester)
}

type RestoreRequestType = "SELECT"
object RestoreRequestType {
  val SELECT: "SELECT" = "SELECT"

  @inline def values = js.Array[RestoreRequestType](SELECT)
}

type ServerSideEncryption = "AES256" | "aws:kms"
object ServerSideEncryption {
  val AES256: "AES256" = "AES256"
  val `aws:kms`: "aws:kms" = "aws:kms"

  @inline def values = js.Array[ServerSideEncryption](AES256, `aws:kms`)
}

type SseKmsEncryptedObjectsStatus = "Enabled" | "Disabled"
object SseKmsEncryptedObjectsStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[SseKmsEncryptedObjectsStatus](Enabled, Disabled)
}

type StorageClass = "STANDARD" | "REDUCED_REDUNDANCY" | "STANDARD_IA" | "ONEZONE_IA" | "INTELLIGENT_TIERING" | "GLACIER" | "DEEP_ARCHIVE" | "OUTPOSTS"
object StorageClass {
  val STANDARD: "STANDARD" = "STANDARD"
  val REDUCED_REDUNDANCY: "REDUCED_REDUNDANCY" = "REDUCED_REDUNDANCY"
  val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  val GLACIER: "GLACIER" = "GLACIER"
  val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"
  val OUTPOSTS: "OUTPOSTS" = "OUTPOSTS"

  @inline def values = js.Array[StorageClass](STANDARD, REDUCED_REDUNDANCY, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE, OUTPOSTS)
}

type StorageClassAnalysisSchemaVersion = "V_1"
object StorageClassAnalysisSchemaVersion {
  val V_1: "V_1" = "V_1"

  @inline def values = js.Array[StorageClassAnalysisSchemaVersion](V_1)
}

type TaggingDirective = "COPY" | "REPLACE"
object TaggingDirective {
  val COPY: "COPY" = "COPY"
  val REPLACE: "REPLACE" = "REPLACE"

  @inline def values = js.Array[TaggingDirective](COPY, REPLACE)
}

type Tier = "Standard" | "Bulk" | "Expedited"
object Tier {
  val Standard: "Standard" = "Standard"
  val Bulk: "Bulk" = "Bulk"
  val Expedited: "Expedited" = "Expedited"

  @inline def values = js.Array[Tier](Standard, Bulk, Expedited)
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

type Type = "CanonicalUser" | "AmazonCustomerByEmail" | "Group"
object Type {
  val CanonicalUser: "CanonicalUser" = "CanonicalUser"
  val AmazonCustomerByEmail: "AmazonCustomerByEmail" = "AmazonCustomerByEmail"
  val Group: "Group" = "Group"

  @inline def values = js.Array[Type](CanonicalUser, AmazonCustomerByEmail, Group)
}
