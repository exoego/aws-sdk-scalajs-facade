package facade.amazonaws.services.s3

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AnalyticsS3ExportFileFormat extends js.Any
object AnalyticsS3ExportFileFormat {
  val CSV = "CSV".asInstanceOf[AnalyticsS3ExportFileFormat]

  @inline def values = js.Array(CSV)
}

@js.native
sealed trait ArchiveStatus extends js.Any
object ArchiveStatus {
  val ARCHIVE_ACCESS = "ARCHIVE_ACCESS".asInstanceOf[ArchiveStatus]
  val DEEP_ARCHIVE_ACCESS = "DEEP_ARCHIVE_ACCESS".asInstanceOf[ArchiveStatus]

  @inline def values = js.Array(ARCHIVE_ACCESS, DEEP_ARCHIVE_ACCESS)
}

@js.native
sealed trait BucketAccelerateStatus extends js.Any
object BucketAccelerateStatus {
  val Enabled = "Enabled".asInstanceOf[BucketAccelerateStatus]
  val Suspended = "Suspended".asInstanceOf[BucketAccelerateStatus]

  @inline def values = js.Array(Enabled, Suspended)
}

@js.native
sealed trait BucketCannedACL extends js.Any
object BucketCannedACL {
  val `private` = "private".asInstanceOf[BucketCannedACL]
  val `public-read` = "public-read".asInstanceOf[BucketCannedACL]
  val `public-read-write` = "public-read-write".asInstanceOf[BucketCannedACL]
  val `authenticated-read` = "authenticated-read".asInstanceOf[BucketCannedACL]

  @inline def values = js.Array(`private`, `public-read`, `public-read-write`, `authenticated-read`)
}

@js.native
sealed trait BucketLocationConstraint extends js.Any
object BucketLocationConstraint {
  val `af-south-1` = "af-south-1".asInstanceOf[BucketLocationConstraint]
  val `ap-east-1` = "ap-east-1".asInstanceOf[BucketLocationConstraint]
  val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[BucketLocationConstraint]
  val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[BucketLocationConstraint]
  val `ap-northeast-3` = "ap-northeast-3".asInstanceOf[BucketLocationConstraint]
  val `ap-south-1` = "ap-south-1".asInstanceOf[BucketLocationConstraint]
  val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[BucketLocationConstraint]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[BucketLocationConstraint]
  val `ca-central-1` = "ca-central-1".asInstanceOf[BucketLocationConstraint]
  val `cn-north-1` = "cn-north-1".asInstanceOf[BucketLocationConstraint]
  val `cn-northwest-1` = "cn-northwest-1".asInstanceOf[BucketLocationConstraint]
  val EU = "EU".asInstanceOf[BucketLocationConstraint]
  val `eu-central-1` = "eu-central-1".asInstanceOf[BucketLocationConstraint]
  val `eu-north-1` = "eu-north-1".asInstanceOf[BucketLocationConstraint]
  val `eu-south-1` = "eu-south-1".asInstanceOf[BucketLocationConstraint]
  val `eu-west-1` = "eu-west-1".asInstanceOf[BucketLocationConstraint]
  val `eu-west-2` = "eu-west-2".asInstanceOf[BucketLocationConstraint]
  val `eu-west-3` = "eu-west-3".asInstanceOf[BucketLocationConstraint]
  val `me-south-1` = "me-south-1".asInstanceOf[BucketLocationConstraint]
  val `sa-east-1` = "sa-east-1".asInstanceOf[BucketLocationConstraint]
  val `us-east-2` = "us-east-2".asInstanceOf[BucketLocationConstraint]
  val `us-gov-east-1` = "us-gov-east-1".asInstanceOf[BucketLocationConstraint]
  val `us-gov-west-1` = "us-gov-west-1".asInstanceOf[BucketLocationConstraint]
  val `us-west-1` = "us-west-1".asInstanceOf[BucketLocationConstraint]
  val `us-west-2` = "us-west-2".asInstanceOf[BucketLocationConstraint]

  @inline def values = js.Array(`af-south-1`, `ap-east-1`, `ap-northeast-1`, `ap-northeast-2`, `ap-northeast-3`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ca-central-1`, `cn-north-1`, `cn-northwest-1`, EU, `eu-central-1`, `eu-north-1`, `eu-south-1`, `eu-west-1`, `eu-west-2`, `eu-west-3`, `me-south-1`, `sa-east-1`, `us-east-2`, `us-gov-east-1`, `us-gov-west-1`, `us-west-1`, `us-west-2`)
}

@js.native
sealed trait BucketLogsPermission extends js.Any
object BucketLogsPermission {
  val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[BucketLogsPermission]
  val READ = "READ".asInstanceOf[BucketLogsPermission]
  val WRITE = "WRITE".asInstanceOf[BucketLogsPermission]

  @inline def values = js.Array(FULL_CONTROL, READ, WRITE)
}

@js.native
sealed trait BucketVersioningStatus extends js.Any
object BucketVersioningStatus {
  val Enabled = "Enabled".asInstanceOf[BucketVersioningStatus]
  val Suspended = "Suspended".asInstanceOf[BucketVersioningStatus]

  @inline def values = js.Array(Enabled, Suspended)
}

@js.native
sealed trait CompressionType extends js.Any
object CompressionType {
  val NONE = "NONE".asInstanceOf[CompressionType]
  val GZIP = "GZIP".asInstanceOf[CompressionType]
  val BZIP2 = "BZIP2".asInstanceOf[CompressionType]

  @inline def values = js.Array(NONE, GZIP, BZIP2)
}

@js.native
sealed trait DeleteMarkerReplicationStatus extends js.Any
object DeleteMarkerReplicationStatus {
  val Enabled = "Enabled".asInstanceOf[DeleteMarkerReplicationStatus]
  val Disabled = "Disabled".asInstanceOf[DeleteMarkerReplicationStatus]

  @inline def values = js.Array(Enabled, Disabled)
}

/** Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.
  */
@js.native
sealed trait EncodingType extends js.Any
object EncodingType {
  val url = "url".asInstanceOf[EncodingType]

  @inline def values = js.Array(url)
}

/** The bucket event for which to send notifications.
  */
@js.native
sealed trait Event extends js.Any
object Event {
  val `s3:ReducedRedundancyLostObject` = "s3:ReducedRedundancyLostObject".asInstanceOf[Event]
  val `s3:ObjectCreated:*` = "s3:ObjectCreated:*".asInstanceOf[Event]
  val `s3:ObjectCreated:Put` = "s3:ObjectCreated:Put".asInstanceOf[Event]
  val `s3:ObjectCreated:Post` = "s3:ObjectCreated:Post".asInstanceOf[Event]
  val `s3:ObjectCreated:Copy` = "s3:ObjectCreated:Copy".asInstanceOf[Event]
  val `s3:ObjectCreated:CompleteMultipartUpload` = "s3:ObjectCreated:CompleteMultipartUpload".asInstanceOf[Event]
  val `s3:ObjectRemoved:*` = "s3:ObjectRemoved:*".asInstanceOf[Event]
  val `s3:ObjectRemoved:Delete` = "s3:ObjectRemoved:Delete".asInstanceOf[Event]
  val `s3:ObjectRemoved:DeleteMarkerCreated` = "s3:ObjectRemoved:DeleteMarkerCreated".asInstanceOf[Event]
  val `s3:ObjectRestore:*` = "s3:ObjectRestore:*".asInstanceOf[Event]
  val `s3:ObjectRestore:Post` = "s3:ObjectRestore:Post".asInstanceOf[Event]
  val `s3:ObjectRestore:Completed` = "s3:ObjectRestore:Completed".asInstanceOf[Event]
  val `s3:Replication:*` = "s3:Replication:*".asInstanceOf[Event]
  val `s3:Replication:OperationFailedReplication` = "s3:Replication:OperationFailedReplication".asInstanceOf[Event]
  val `s3:Replication:OperationNotTracked` = "s3:Replication:OperationNotTracked".asInstanceOf[Event]
  val `s3:Replication:OperationMissedThreshold` = "s3:Replication:OperationMissedThreshold".asInstanceOf[Event]
  val `s3:Replication:OperationReplicatedAfterThreshold` = "s3:Replication:OperationReplicatedAfterThreshold".asInstanceOf[Event]

  @inline def values = js.Array(`s3:ReducedRedundancyLostObject`, `s3:ObjectCreated:*`, `s3:ObjectCreated:Put`, `s3:ObjectCreated:Post`, `s3:ObjectCreated:Copy`, `s3:ObjectCreated:CompleteMultipartUpload`, `s3:ObjectRemoved:*`, `s3:ObjectRemoved:Delete`, `s3:ObjectRemoved:DeleteMarkerCreated`, `s3:ObjectRestore:*`, `s3:ObjectRestore:Post`, `s3:ObjectRestore:Completed`, `s3:Replication:*`, `s3:Replication:OperationFailedReplication`, `s3:Replication:OperationNotTracked`, `s3:Replication:OperationMissedThreshold`, `s3:Replication:OperationReplicatedAfterThreshold`)
}

@js.native
sealed trait ExistingObjectReplicationStatus extends js.Any
object ExistingObjectReplicationStatus {
  val Enabled = "Enabled".asInstanceOf[ExistingObjectReplicationStatus]
  val Disabled = "Disabled".asInstanceOf[ExistingObjectReplicationStatus]

  @inline def values = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ExpirationStatus extends js.Any
object ExpirationStatus {
  val Enabled = "Enabled".asInstanceOf[ExpirationStatus]
  val Disabled = "Disabled".asInstanceOf[ExpirationStatus]

  @inline def values = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ExpressionType extends js.Any
object ExpressionType {
  val SQL = "SQL".asInstanceOf[ExpressionType]

  @inline def values = js.Array(SQL)
}

@js.native
sealed trait FileHeaderInfo extends js.Any
object FileHeaderInfo {
  val USE = "USE".asInstanceOf[FileHeaderInfo]
  val IGNORE = "IGNORE".asInstanceOf[FileHeaderInfo]
  val NONE = "NONE".asInstanceOf[FileHeaderInfo]

  @inline def values = js.Array(USE, IGNORE, NONE)
}

@js.native
sealed trait FilterRuleName extends js.Any
object FilterRuleName {
  val prefix = "prefix".asInstanceOf[FilterRuleName]
  val suffix = "suffix".asInstanceOf[FilterRuleName]

  @inline def values = js.Array(prefix, suffix)
}

@js.native
sealed trait IntelligentTieringAccessTier extends js.Any
object IntelligentTieringAccessTier {
  val ARCHIVE_ACCESS = "ARCHIVE_ACCESS".asInstanceOf[IntelligentTieringAccessTier]
  val DEEP_ARCHIVE_ACCESS = "DEEP_ARCHIVE_ACCESS".asInstanceOf[IntelligentTieringAccessTier]

  @inline def values = js.Array(ARCHIVE_ACCESS, DEEP_ARCHIVE_ACCESS)
}

@js.native
sealed trait IntelligentTieringStatus extends js.Any
object IntelligentTieringStatus {
  val Enabled = "Enabled".asInstanceOf[IntelligentTieringStatus]
  val Disabled = "Disabled".asInstanceOf[IntelligentTieringStatus]

  @inline def values = js.Array(Enabled, Disabled)
}

@js.native
sealed trait InventoryFormat extends js.Any
object InventoryFormat {
  val CSV = "CSV".asInstanceOf[InventoryFormat]
  val ORC = "ORC".asInstanceOf[InventoryFormat]
  val Parquet = "Parquet".asInstanceOf[InventoryFormat]

  @inline def values = js.Array(CSV, ORC, Parquet)
}

@js.native
sealed trait InventoryFrequency extends js.Any
object InventoryFrequency {
  val Daily = "Daily".asInstanceOf[InventoryFrequency]
  val Weekly = "Weekly".asInstanceOf[InventoryFrequency]

  @inline def values = js.Array(Daily, Weekly)
}

@js.native
sealed trait InventoryIncludedObjectVersions extends js.Any
object InventoryIncludedObjectVersions {
  val All = "All".asInstanceOf[InventoryIncludedObjectVersions]
  val Current = "Current".asInstanceOf[InventoryIncludedObjectVersions]

  @inline def values = js.Array(All, Current)
}

@js.native
sealed trait InventoryOptionalField extends js.Any
object InventoryOptionalField {
  val Size = "Size".asInstanceOf[InventoryOptionalField]
  val LastModifiedDate = "LastModifiedDate".asInstanceOf[InventoryOptionalField]
  val StorageClass = "StorageClass".asInstanceOf[InventoryOptionalField]
  val ETag = "ETag".asInstanceOf[InventoryOptionalField]
  val IsMultipartUploaded = "IsMultipartUploaded".asInstanceOf[InventoryOptionalField]
  val ReplicationStatus = "ReplicationStatus".asInstanceOf[InventoryOptionalField]
  val EncryptionStatus = "EncryptionStatus".asInstanceOf[InventoryOptionalField]
  val ObjectLockRetainUntilDate = "ObjectLockRetainUntilDate".asInstanceOf[InventoryOptionalField]
  val ObjectLockMode = "ObjectLockMode".asInstanceOf[InventoryOptionalField]
  val ObjectLockLegalHoldStatus = "ObjectLockLegalHoldStatus".asInstanceOf[InventoryOptionalField]
  val IntelligentTieringAccessTier = "IntelligentTieringAccessTier".asInstanceOf[InventoryOptionalField]

  @inline def values = js.Array(Size, LastModifiedDate, StorageClass, ETag, IsMultipartUploaded, ReplicationStatus, EncryptionStatus, ObjectLockRetainUntilDate, ObjectLockMode, ObjectLockLegalHoldStatus, IntelligentTieringAccessTier)
}

@js.native
sealed trait JSONType extends js.Any
object JSONType {
  val DOCUMENT = "DOCUMENT".asInstanceOf[JSONType]
  val LINES = "LINES".asInstanceOf[JSONType]

  @inline def values = js.Array(DOCUMENT, LINES)
}

@js.native
sealed trait MFADelete extends js.Any
object MFADelete {
  val Enabled = "Enabled".asInstanceOf[MFADelete]
  val Disabled = "Disabled".asInstanceOf[MFADelete]

  @inline def values = js.Array(Enabled, Disabled)
}

@js.native
sealed trait MFADeleteStatus extends js.Any
object MFADeleteStatus {
  val Enabled = "Enabled".asInstanceOf[MFADeleteStatus]
  val Disabled = "Disabled".asInstanceOf[MFADeleteStatus]

  @inline def values = js.Array(Enabled, Disabled)
}

@js.native
sealed trait MetadataDirective extends js.Any
object MetadataDirective {
  val COPY = "COPY".asInstanceOf[MetadataDirective]
  val REPLACE = "REPLACE".asInstanceOf[MetadataDirective]

  @inline def values = js.Array(COPY, REPLACE)
}

@js.native
sealed trait MetricsStatus extends js.Any
object MetricsStatus {
  val Enabled = "Enabled".asInstanceOf[MetricsStatus]
  val Disabled = "Disabled".asInstanceOf[MetricsStatus]

  @inline def values = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ObjectCannedACL extends js.Any
object ObjectCannedACL {
  val `private` = "private".asInstanceOf[ObjectCannedACL]
  val `public-read` = "public-read".asInstanceOf[ObjectCannedACL]
  val `public-read-write` = "public-read-write".asInstanceOf[ObjectCannedACL]
  val `authenticated-read` = "authenticated-read".asInstanceOf[ObjectCannedACL]
  val `aws-exec-read` = "aws-exec-read".asInstanceOf[ObjectCannedACL]
  val `bucket-owner-read` = "bucket-owner-read".asInstanceOf[ObjectCannedACL]
  val `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[ObjectCannedACL]

  @inline def values = js.Array(`private`, `public-read`, `public-read-write`, `authenticated-read`, `aws-exec-read`, `bucket-owner-read`, `bucket-owner-full-control`)
}

@js.native
sealed trait ObjectLockEnabled extends js.Any
object ObjectLockEnabled {
  val Enabled = "Enabled".asInstanceOf[ObjectLockEnabled]

  @inline def values = js.Array(Enabled)
}

@js.native
sealed trait ObjectLockLegalHoldStatus extends js.Any
object ObjectLockLegalHoldStatus {
  val ON = "ON".asInstanceOf[ObjectLockLegalHoldStatus]
  val OFF = "OFF".asInstanceOf[ObjectLockLegalHoldStatus]

  @inline def values = js.Array(ON, OFF)
}

@js.native
sealed trait ObjectLockMode extends js.Any
object ObjectLockMode {
  val GOVERNANCE = "GOVERNANCE".asInstanceOf[ObjectLockMode]
  val COMPLIANCE = "COMPLIANCE".asInstanceOf[ObjectLockMode]

  @inline def values = js.Array(GOVERNANCE, COMPLIANCE)
}

@js.native
sealed trait ObjectLockRetentionMode extends js.Any
object ObjectLockRetentionMode {
  val GOVERNANCE = "GOVERNANCE".asInstanceOf[ObjectLockRetentionMode]
  val COMPLIANCE = "COMPLIANCE".asInstanceOf[ObjectLockRetentionMode]

  @inline def values = js.Array(GOVERNANCE, COMPLIANCE)
}

/** The container element for object ownership for a bucket's ownership controls.
  * BucketOwnerPreferred - Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the <code>bucket-owner-full-control</code> canned ACL.
  * ObjectWriter - The uploading account will own the object if the object is uploaded with the <code>bucket-owner-full-control</code> canned ACL.
  */
@js.native
sealed trait ObjectOwnership extends js.Any
object ObjectOwnership {
  val BucketOwnerPreferred = "BucketOwnerPreferred".asInstanceOf[ObjectOwnership]
  val ObjectWriter = "ObjectWriter".asInstanceOf[ObjectOwnership]

  @inline def values = js.Array(BucketOwnerPreferred, ObjectWriter)
}

@js.native
sealed trait ObjectStorageClass extends js.Any
object ObjectStorageClass {
  val STANDARD = "STANDARD".asInstanceOf[ObjectStorageClass]
  val REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY".asInstanceOf[ObjectStorageClass]
  val GLACIER = "GLACIER".asInstanceOf[ObjectStorageClass]
  val STANDARD_IA = "STANDARD_IA".asInstanceOf[ObjectStorageClass]
  val ONEZONE_IA = "ONEZONE_IA".asInstanceOf[ObjectStorageClass]
  val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[ObjectStorageClass]
  val DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[ObjectStorageClass]
  val OUTPOSTS = "OUTPOSTS".asInstanceOf[ObjectStorageClass]

  @inline def values = js.Array(STANDARD, REDUCED_REDUNDANCY, GLACIER, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE, OUTPOSTS)
}

@js.native
sealed trait ObjectVersionStorageClass extends js.Any
object ObjectVersionStorageClass {
  val STANDARD = "STANDARD".asInstanceOf[ObjectVersionStorageClass]

  @inline def values = js.Array(STANDARD)
}

@js.native
sealed trait OwnerOverride extends js.Any
object OwnerOverride {
  val Destination = "Destination".asInstanceOf[OwnerOverride]

  @inline def values = js.Array(Destination)
}

@js.native
sealed trait Payer extends js.Any
object Payer {
  val Requester = "Requester".asInstanceOf[Payer]
  val BucketOwner = "BucketOwner".asInstanceOf[Payer]

  @inline def values = js.Array(Requester, BucketOwner)
}

@js.native
sealed trait Permission extends js.Any
object Permission {
  val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[Permission]
  val WRITE = "WRITE".asInstanceOf[Permission]
  val WRITE_ACP = "WRITE_ACP".asInstanceOf[Permission]
  val READ = "READ".asInstanceOf[Permission]
  val READ_ACP = "READ_ACP".asInstanceOf[Permission]

  @inline def values = js.Array(FULL_CONTROL, WRITE, WRITE_ACP, READ, READ_ACP)
}

@js.native
sealed trait Protocol extends js.Any
object Protocol {
  val http = "http".asInstanceOf[Protocol]
  val https = "https".asInstanceOf[Protocol]

  @inline def values = js.Array(http, https)
}

@js.native
sealed trait QuoteFields extends js.Any
object QuoteFields {
  val ALWAYS = "ALWAYS".asInstanceOf[QuoteFields]
  val ASNEEDED = "ASNEEDED".asInstanceOf[QuoteFields]

  @inline def values = js.Array(ALWAYS, ASNEEDED)
}

@js.native
sealed trait ReplicaModificationsStatus extends js.Any
object ReplicaModificationsStatus {
  val Enabled = "Enabled".asInstanceOf[ReplicaModificationsStatus]
  val Disabled = "Disabled".asInstanceOf[ReplicaModificationsStatus]

  @inline def values = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ReplicationRuleStatus extends js.Any
object ReplicationRuleStatus {
  val Enabled = "Enabled".asInstanceOf[ReplicationRuleStatus]
  val Disabled = "Disabled".asInstanceOf[ReplicationRuleStatus]

  @inline def values = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ReplicationStatus extends js.Any
object ReplicationStatus {
  val COMPLETE = "COMPLETE".asInstanceOf[ReplicationStatus]
  val PENDING = "PENDING".asInstanceOf[ReplicationStatus]
  val FAILED = "FAILED".asInstanceOf[ReplicationStatus]
  val REPLICA = "REPLICA".asInstanceOf[ReplicationStatus]

  @inline def values = js.Array(COMPLETE, PENDING, FAILED, REPLICA)
}

@js.native
sealed trait ReplicationTimeStatus extends js.Any
object ReplicationTimeStatus {
  val Enabled = "Enabled".asInstanceOf[ReplicationTimeStatus]
  val Disabled = "Disabled".asInstanceOf[ReplicationTimeStatus]

  @inline def values = js.Array(Enabled, Disabled)
}

/** If present, indicates that the requester was successfully charged for the request.
  */
@js.native
sealed trait RequestCharged extends js.Any
object RequestCharged {
  val requester = "requester".asInstanceOf[RequestCharged]

  @inline def values = js.Array(requester)
}

/** Confirms that the requester knows that they will be charged for the request. Bucket owners need not specify this parameter in their requests. For information about downloading objects from requester pays buckets, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html|Downloading Objects in Requestor Pays Buckets]] in the <i>Amazon S3 Developer Guide</i>.
  */
@js.native
sealed trait RequestPayer extends js.Any
object RequestPayer {
  val requester = "requester".asInstanceOf[RequestPayer]

  @inline def values = js.Array(requester)
}

@js.native
sealed trait RestoreRequestType extends js.Any
object RestoreRequestType {
  val SELECT = "SELECT".asInstanceOf[RestoreRequestType]

  @inline def values = js.Array(SELECT)
}

@js.native
sealed trait ServerSideEncryption extends js.Any
object ServerSideEncryption {
  val AES256 = "AES256".asInstanceOf[ServerSideEncryption]
  val `aws:kms` = "aws:kms".asInstanceOf[ServerSideEncryption]

  @inline def values = js.Array(AES256, `aws:kms`)
}

@js.native
sealed trait SseKmsEncryptedObjectsStatus extends js.Any
object SseKmsEncryptedObjectsStatus {
  val Enabled = "Enabled".asInstanceOf[SseKmsEncryptedObjectsStatus]
  val Disabled = "Disabled".asInstanceOf[SseKmsEncryptedObjectsStatus]

  @inline def values = js.Array(Enabled, Disabled)
}

@js.native
sealed trait StorageClass extends js.Any
object StorageClass {
  val STANDARD = "STANDARD".asInstanceOf[StorageClass]
  val REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY".asInstanceOf[StorageClass]
  val STANDARD_IA = "STANDARD_IA".asInstanceOf[StorageClass]
  val ONEZONE_IA = "ONEZONE_IA".asInstanceOf[StorageClass]
  val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[StorageClass]
  val GLACIER = "GLACIER".asInstanceOf[StorageClass]
  val DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[StorageClass]
  val OUTPOSTS = "OUTPOSTS".asInstanceOf[StorageClass]

  @inline def values = js.Array(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE, OUTPOSTS)
}

@js.native
sealed trait StorageClassAnalysisSchemaVersion extends js.Any
object StorageClassAnalysisSchemaVersion {
  val V_1 = "V_1".asInstanceOf[StorageClassAnalysisSchemaVersion]

  @inline def values = js.Array(V_1)
}

@js.native
sealed trait TaggingDirective extends js.Any
object TaggingDirective {
  val COPY = "COPY".asInstanceOf[TaggingDirective]
  val REPLACE = "REPLACE".asInstanceOf[TaggingDirective]

  @inline def values = js.Array(COPY, REPLACE)
}

@js.native
sealed trait Tier extends js.Any
object Tier {
  val Standard = "Standard".asInstanceOf[Tier]
  val Bulk = "Bulk".asInstanceOf[Tier]
  val Expedited = "Expedited".asInstanceOf[Tier]

  @inline def values = js.Array(Standard, Bulk, Expedited)
}

@js.native
sealed trait TransitionStorageClass extends js.Any
object TransitionStorageClass {
  val GLACIER = "GLACIER".asInstanceOf[TransitionStorageClass]
  val STANDARD_IA = "STANDARD_IA".asInstanceOf[TransitionStorageClass]
  val ONEZONE_IA = "ONEZONE_IA".asInstanceOf[TransitionStorageClass]
  val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[TransitionStorageClass]
  val DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[TransitionStorageClass]

  @inline def values = js.Array(GLACIER, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val CanonicalUser = "CanonicalUser".asInstanceOf[Type]
  val AmazonCustomerByEmail = "AmazonCustomerByEmail".asInstanceOf[Type]
  val Group = "Group".asInstanceOf[Type]

  @inline def values = js.Array(CanonicalUser, AmazonCustomerByEmail, Group)
}

