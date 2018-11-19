package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object s3 {
  type AbortDate = js.Date
  type AbortRuleId = String
  type AcceptRanges = String
  type AccountId = String
  type AllowQuotedRecordDelimiter = Boolean
  type AllowedHeader = String
  type AllowedHeaders = js.Array[AllowedHeader]
  type AllowedMethod = String
  type AllowedMethods = js.Array[AllowedMethod]
  type AllowedOrigin = String
  type AllowedOrigins = js.Array[AllowedOrigin]
  type AnalyticsConfigurationList = js.Array[AnalyticsConfiguration]
  type AnalyticsId = String
  type AnalyticsS3ExportFileFormat = String
  type Body = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BucketAccelerateStatus = String
  type BucketCannedACL = String
  type BucketLocationConstraint = String
  type BucketLogsPermission = String
  type BucketName = String
  type BucketVersioningStatus = String
  type Buckets = js.Array[Bucket]
  type BytesProcessed = Double
  type BytesReturned = Double
  type BytesScanned = Double
  type CORSRules = js.Array[CORSRule]
  type CacheControl = String
  type CloudFunction = String
  type CloudFunctionInvocationRole = String
  type Code = String
  type Comments = String
  type CommonPrefixList = js.Array[CommonPrefix]
  type CompletedPartList = js.Array[CompletedPart]
  type CompressionType = String
  type ConfirmRemoveSelfBucketAccess = Boolean
  type ContentDisposition = String
  type ContentEncoding = String
  type ContentLanguage = String
  type ContentLength = Double
  type ContentMD5 = String
  type ContentRange = String
  type ContentType = String
  type CopySource = String
  type CopySourceIfMatch = String
  type CopySourceIfModifiedSince = js.Date
  type CopySourceIfNoneMatch = String
  type CopySourceIfUnmodifiedSince = js.Date
  type CopySourceRange = String
  type CopySourceSSECustomerAlgorithm = String
  type CopySourceSSECustomerKey = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CopySourceSSECustomerKeyMD5 = String
  type CopySourceVersionId = String
  type CreationDate = js.Date
  type Date = js.Date
  type Days = Int
  type DaysAfterInitiation = Int
  type DeleteMarker = Boolean
  type DeleteMarkerReplicationStatus = String
  type DeleteMarkerVersionId = String
  type DeleteMarkers = js.Array[DeleteMarkerEntry]
  type DeletedObjects = js.Array[DeletedObject]
  type Delimiter = String
  type Description = String
  type DisplayName = String
  type ETag = String
  type EmailAddress = String
  type EnableRequestProgress = Boolean
  type EncodingType = String
  type Errors = js.Array[Error]
  type Event = String
  type EventList = js.Array[Event]
  type Expiration = String
  type ExpirationStatus = String
  type ExpiredObjectDeleteMarker = Boolean
  type Expires = js.Date
  type ExposeHeader = String
  type ExposeHeaders = js.Array[ExposeHeader]
  type Expression = String
  type ExpressionType = String
  type FetchOwner = Boolean
  type FieldDelimiter = String
  type FileHeaderInfo = String
  type FilterRuleList = js.Array[FilterRule]
  type FilterRuleName = String
  type FilterRuleValue = String
  type GrantFullControl = String
  type GrantRead = String
  type GrantReadACP = String
  type GrantWrite = String
  type GrantWriteACP = String
  type Grants = js.Array[Grant]
  type HostName = String
  type HttpErrorCodeReturnedEquals = String
  type HttpRedirectCode = String
  type ID = String
  type IfMatch = String
  type IfModifiedSince = js.Date
  type IfNoneMatch = String
  type IfUnmodifiedSince = js.Date
  type Initiated = js.Date
  type InventoryConfigurationList = js.Array[InventoryConfiguration]
  type InventoryFormat = String
  type InventoryFrequency = String
  type InventoryId = String
  type InventoryIncludedObjectVersions = String
  type InventoryOptionalField = String
  type InventoryOptionalFields = js.Array[InventoryOptionalField]
  type IsEnabled = Boolean
  type IsLatest = Boolean
  type IsPublic = Boolean
  type IsTruncated = Boolean
  type JSONType = String
  type KMSContext = String
  type KeyCount = Int
  type KeyMarker = String
  type KeyPrefixEquals = String
  type LambdaFunctionArn = String
  type LambdaFunctionConfigurationList = js.Array[LambdaFunctionConfiguration]
  type LastModified = js.Date
  type LifecycleRules = js.Array[LifecycleRule]
  type Location = String
  type LocationPrefix = String
  type MFA = String
  type MFADelete = String
  type MFADeleteStatus = String
  type Marker = String
  type MaxAgeSeconds = Int
  type MaxKeys = Int
  type MaxParts = Int
  type MaxUploads = Int
  type Message = String
  type Metadata = js.Dictionary[MetadataValue]
  type MetadataDirective = String
  type MetadataKey = String
  type MetadataValue = String
  type MetricsConfigurationList = js.Array[MetricsConfiguration]
  type MetricsId = String
  type MissingMeta = Int
  type MultipartUploadId = String
  type MultipartUploadList = js.Array[MultipartUpload]
  type NextKeyMarker = String
  type NextMarker = String
  type NextPartNumberMarker = Int
  type NextToken = String
  type NextUploadIdMarker = String
  type NextVersionIdMarker = String
  type NoncurrentVersionTransitionList = js.Array[NoncurrentVersionTransition]
  type NotificationId = String
  type ObjectCannedACL = String
  type ObjectIdentifierList = js.Array[ObjectIdentifier]
  type ObjectKey = String
  type ObjectList = js.Array[Object]
  type ObjectStorageClass = String
  type ObjectVersionId = String
  type ObjectVersionList = js.Array[ObjectVersion]
  type ObjectVersionStorageClass = String
  type OwnerOverride = String
  type PartNumber = Int
  type PartNumberMarker = Int
  type Parts = js.Array[Part]
  type PartsCount = Int
  type Payer = String
  type Permission = String
  type Policy = String
  type Prefix = String
  type Priority = Int
  type Protocol = String
  type QueueArn = String
  type QueueConfigurationList = js.Array[QueueConfiguration]
  type Quiet = Boolean
  type QuoteCharacter = String
  type QuoteEscapeCharacter = String
  type QuoteFields = String
  type Range = String
  type RecordDelimiter = String
  type ReplaceKeyPrefixWith = String
  type ReplaceKeyWith = String
  type ReplicaKmsKeyID = String
  type ReplicationRuleStatus = String
  type ReplicationRules = js.Array[ReplicationRule]
  type ReplicationStatus = String
  type RequestCharged = String
  type RequestPayer = String
  type ResponseCacheControl = String
  type ResponseContentDisposition = String
  type ResponseContentEncoding = String
  type ResponseContentLanguage = String
  type ResponseContentType = String
  type ResponseExpires = js.Date
  type Restore = String
  type RestoreOutputPath = String
  type RestoreRequestType = String
  type Role = String
  type RoutingRules = js.Array[RoutingRule]
  type Rules = js.Array[Rule]
  type SSECustomerAlgorithm = String
  type SSECustomerKey = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SSECustomerKeyMD5 = String
  type SSEKMSKeyId = String
  type ServerSideEncryption = String
  type ServerSideEncryptionRules = js.Array[ServerSideEncryptionRule]
  type Setting = Boolean
  type Size = Int
  type SseKmsEncryptedObjectsStatus = String
  type StartAfter = String
  type StorageClass = String
  type StorageClassAnalysisSchemaVersion = String
  type Suffix = String
  type TagCount = Int
  type TagSet = js.Array[Tag]
  type TaggingDirective = String
  type TaggingHeader = String
  type TargetBucket = String
  type TargetGrants = js.Array[TargetGrant]
  type TargetPrefix = String
  type Tier = String
  type Token = String
  type TopicArn = String
  type TopicConfigurationList = js.Array[TopicConfiguration]
  type TransitionList = js.Array[Transition]
  type TransitionStorageClass = String
  type Type = String
  type URI = String
  type UploadIdMarker = String
  type UserMetadata = js.Array[MetadataEntry]
  type Value = String
  type VersionIdMarker = String
  type WebsiteRedirectLocation = String
}

package s3 {
  @js.native
  @JSImport("aws-sdk", "S3")
  class S3(config: AWSConfig) extends js.Object {
    def abortMultipartUpload(params: AbortMultipartUploadRequest): Request[AbortMultipartUploadOutput] = js.native
    def completeMultipartUpload(params: CompleteMultipartUploadRequest): Request[CompleteMultipartUploadOutput] = js.native
    def copyObject(params: CopyObjectRequest): Request[CopyObjectOutput] = js.native
    def createBucket(params: CreateBucketRequest): Request[CreateBucketOutput] = js.native
    def createMultipartUpload(params: CreateMultipartUploadRequest): Request[CreateMultipartUploadOutput] = js.native
    def deleteBucket(params: DeleteBucketRequest): Request[js.Object] = js.native
    def deleteBucketAnalyticsConfiguration(params: DeleteBucketAnalyticsConfigurationRequest): Request[js.Object] = js.native
    def deleteBucketCors(params: DeleteBucketCorsRequest): Request[js.Object] = js.native
    def deleteBucketEncryption(params: DeleteBucketEncryptionRequest): Request[js.Object] = js.native
    def deleteBucketInventoryConfiguration(params: DeleteBucketInventoryConfigurationRequest): Request[js.Object] = js.native
    def deleteBucketLifecycle(params: DeleteBucketLifecycleRequest): Request[js.Object] = js.native
    def deleteBucketMetricsConfiguration(params: DeleteBucketMetricsConfigurationRequest): Request[js.Object] = js.native
    def deleteBucketPolicy(params: DeleteBucketPolicyRequest): Request[js.Object] = js.native
    def deleteBucketReplication(params: DeleteBucketReplicationRequest): Request[js.Object] = js.native
    def deleteBucketTagging(params: DeleteBucketTaggingRequest): Request[js.Object] = js.native
    def deleteBucketWebsite(params: DeleteBucketWebsiteRequest): Request[js.Object] = js.native
    def deleteObject(params: DeleteObjectRequest): Request[DeleteObjectOutput] = js.native
    def deleteObjectTagging(params: DeleteObjectTaggingRequest): Request[DeleteObjectTaggingOutput] = js.native
    def deleteObjects(params: DeleteObjectsRequest): Request[DeleteObjectsOutput] = js.native
    def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): Request[js.Object] = js.native
    def getBucketAccelerateConfiguration(params: GetBucketAccelerateConfigurationRequest): Request[GetBucketAccelerateConfigurationOutput] = js.native
    def getBucketAcl(params: GetBucketAclRequest): Request[GetBucketAclOutput] = js.native
    def getBucketAnalyticsConfiguration(params: GetBucketAnalyticsConfigurationRequest): Request[GetBucketAnalyticsConfigurationOutput] = js.native
    def getBucketCors(params: GetBucketCorsRequest): Request[GetBucketCorsOutput] = js.native
    def getBucketEncryption(params: GetBucketEncryptionRequest): Request[GetBucketEncryptionOutput] = js.native
    def getBucketInventoryConfiguration(params: GetBucketInventoryConfigurationRequest): Request[GetBucketInventoryConfigurationOutput] = js.native
    def getBucketLifecycle(params: GetBucketLifecycleRequest): Request[GetBucketLifecycleOutput] = js.native
    def getBucketLifecycleConfiguration(params: GetBucketLifecycleConfigurationRequest): Request[GetBucketLifecycleConfigurationOutput] = js.native
    def getBucketLocation(params: GetBucketLocationRequest): Request[GetBucketLocationOutput] = js.native
    def getBucketLogging(params: GetBucketLoggingRequest): Request[GetBucketLoggingOutput] = js.native
    def getBucketMetricsConfiguration(params: GetBucketMetricsConfigurationRequest): Request[GetBucketMetricsConfigurationOutput] = js.native
    def getBucketNotification(params: GetBucketNotificationConfigurationRequest): Request[NotificationConfigurationDeprecated] = js.native
    def getBucketNotificationConfiguration(params: GetBucketNotificationConfigurationRequest): Request[NotificationConfiguration] = js.native
    def getBucketPolicy(params: GetBucketPolicyRequest): Request[GetBucketPolicyOutput] = js.native
    def getBucketPolicyStatus(params: GetBucketPolicyStatusRequest): Request[GetBucketPolicyStatusOutput] = js.native
    def getBucketReplication(params: GetBucketReplicationRequest): Request[GetBucketReplicationOutput] = js.native
    def getBucketRequestPayment(params: GetBucketRequestPaymentRequest): Request[GetBucketRequestPaymentOutput] = js.native
    def getBucketTagging(params: GetBucketTaggingRequest): Request[GetBucketTaggingOutput] = js.native
    def getBucketVersioning(params: GetBucketVersioningRequest): Request[GetBucketVersioningOutput] = js.native
    def getBucketWebsite(params: GetBucketWebsiteRequest): Request[GetBucketWebsiteOutput] = js.native
    def getObject(params: GetObjectRequest): Request[GetObjectOutput] = js.native
    def getObjectAcl(params: GetObjectAclRequest): Request[GetObjectAclOutput] = js.native
    def getObjectTagging(params: GetObjectTaggingRequest): Request[GetObjectTaggingOutput] = js.native
    def getObjectTorrent(params: GetObjectTorrentRequest): Request[GetObjectTorrentOutput] = js.native
    def getPublicAccessBlock(params: GetPublicAccessBlockRequest): Request[GetPublicAccessBlockOutput] = js.native
    def headBucket(params: HeadBucketRequest): Request[js.Object] = js.native
    def headObject(params: HeadObjectRequest): Request[HeadObjectOutput] = js.native
    def listBucketAnalyticsConfigurations(params: ListBucketAnalyticsConfigurationsRequest): Request[ListBucketAnalyticsConfigurationsOutput] = js.native
    def listBucketInventoryConfigurations(params: ListBucketInventoryConfigurationsRequest): Request[ListBucketInventoryConfigurationsOutput] = js.native
    def listBucketMetricsConfigurations(params: ListBucketMetricsConfigurationsRequest): Request[ListBucketMetricsConfigurationsOutput] = js.native
    def listBuckets(): Request[ListBucketsOutput] = js.native
    def listMultipartUploads(params: ListMultipartUploadsRequest): Request[ListMultipartUploadsOutput] = js.native
    def listObjectVersions(params: ListObjectVersionsRequest): Request[ListObjectVersionsOutput] = js.native
    def listObjects(params: ListObjectsRequest): Request[ListObjectsOutput] = js.native
    def listObjectsV2(params: ListObjectsV2Request): Request[ListObjectsV2Output] = js.native
    def listParts(params: ListPartsRequest): Request[ListPartsOutput] = js.native
    def putBucketAccelerateConfiguration(params: PutBucketAccelerateConfigurationRequest): Request[js.Object] = js.native
    def putBucketAcl(params: PutBucketAclRequest): Request[js.Object] = js.native
    def putBucketAnalyticsConfiguration(params: PutBucketAnalyticsConfigurationRequest): Request[js.Object] = js.native
    def putBucketCors(params: PutBucketCorsRequest): Request[js.Object] = js.native
    def putBucketEncryption(params: PutBucketEncryptionRequest): Request[js.Object] = js.native
    def putBucketInventoryConfiguration(params: PutBucketInventoryConfigurationRequest): Request[js.Object] = js.native
    def putBucketLifecycle(params: PutBucketLifecycleRequest): Request[js.Object] = js.native
    def putBucketLifecycleConfiguration(params: PutBucketLifecycleConfigurationRequest): Request[js.Object] = js.native
    def putBucketLogging(params: PutBucketLoggingRequest): Request[js.Object] = js.native
    def putBucketMetricsConfiguration(params: PutBucketMetricsConfigurationRequest): Request[js.Object] = js.native
    def putBucketNotification(params: PutBucketNotificationRequest): Request[js.Object] = js.native
    def putBucketNotificationConfiguration(params: PutBucketNotificationConfigurationRequest): Request[js.Object] = js.native
    def putBucketPolicy(params: PutBucketPolicyRequest): Request[js.Object] = js.native
    def putBucketReplication(params: PutBucketReplicationRequest): Request[js.Object] = js.native
    def putBucketRequestPayment(params: PutBucketRequestPaymentRequest): Request[js.Object] = js.native
    def putBucketTagging(params: PutBucketTaggingRequest): Request[js.Object] = js.native
    def putBucketVersioning(params: PutBucketVersioningRequest): Request[js.Object] = js.native
    def putBucketWebsite(params: PutBucketWebsiteRequest): Request[js.Object] = js.native
    def putObject(params: PutObjectRequest): Request[PutObjectOutput] = js.native
    def putObjectAcl(params: PutObjectAclRequest): Request[PutObjectAclOutput] = js.native
    def putObjectTagging(params: PutObjectTaggingRequest): Request[PutObjectTaggingOutput] = js.native
    def putPublicAccessBlock(params: PutPublicAccessBlockRequest): Request[js.Object] = js.native
    def restoreObject(params: RestoreObjectRequest): Request[RestoreObjectOutput] = js.native
    def selectObjectContent(params: SelectObjectContentRequest): Request[SelectObjectContentOutput] = js.native
    def uploadPart(params: UploadPartRequest): Request[UploadPartOutput] = js.native
    def uploadPartCopy(params: UploadPartCopyRequest): Request[UploadPartCopyOutput] = js.native
  }

  /**
   * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
   */
  @js.native
  trait AbortIncompleteMultipartUpload extends js.Object {
    var DaysAfterInitiation: js.UndefOr[DaysAfterInitiation]
  }

  object AbortIncompleteMultipartUpload {
    def apply(
      DaysAfterInitiation: js.UndefOr[DaysAfterInitiation] = js.undefined): AbortIncompleteMultipartUpload = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DaysAfterInitiation" -> DaysAfterInitiation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortIncompleteMultipartUpload]
    }
  }

  @js.native
  trait AbortMultipartUploadOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object AbortMultipartUploadOutput {
    def apply(
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined): AbortMultipartUploadOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortMultipartUploadOutput]
    }
  }

  @js.native
  trait AbortMultipartUploadRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Key: js.UndefOr[ObjectKey]
    var UploadId: js.UndefOr[MultipartUploadId]
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  object AbortMultipartUploadRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined): AbortMultipartUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "UploadId" -> UploadId.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortMultipartUploadRequest]
    }
  }

  @js.native
  trait AccelerateConfiguration extends js.Object {
    var Status: js.UndefOr[BucketAccelerateStatus]
  }

  object AccelerateConfiguration {
    def apply(
      Status: js.UndefOr[BucketAccelerateStatus] = js.undefined): AccelerateConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccelerateConfiguration]
    }
  }

  @js.native
  trait AccessControlPolicy extends js.Object {
    var Grants: js.UndefOr[Grants]
    var Owner: js.UndefOr[Owner]
  }

  object AccessControlPolicy {
    def apply(
      Grants: js.UndefOr[Grants] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined): AccessControlPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Grants" -> Grants.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessControlPolicy]
    }
  }

  /**
   * <p>A container for information about access control for replicas.</p>
   */
  @js.native
  trait AccessControlTranslation extends js.Object {
    var Owner: js.UndefOr[OwnerOverride]
  }

  object AccessControlTranslation {
    def apply(
      Owner: js.UndefOr[OwnerOverride] = js.undefined): AccessControlTranslation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessControlTranslation]
    }
  }

  @js.native
  trait AnalyticsAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[TagSet]
  }

  object AnalyticsAndOperator {
    def apply(
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Tags: js.UndefOr[TagSet] = js.undefined): AnalyticsAndOperator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnalyticsAndOperator]
    }
  }

  @js.native
  trait AnalyticsConfiguration extends js.Object {
    var Id: js.UndefOr[AnalyticsId]
    var Filter: js.UndefOr[AnalyticsFilter]
    var StorageClassAnalysis: js.UndefOr[StorageClassAnalysis]
  }

  object AnalyticsConfiguration {
    def apply(
      Id: js.UndefOr[AnalyticsId] = js.undefined,
      Filter: js.UndefOr[AnalyticsFilter] = js.undefined,
      StorageClassAnalysis: js.UndefOr[StorageClassAnalysis] = js.undefined): AnalyticsConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "StorageClassAnalysis" -> StorageClassAnalysis.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnalyticsConfiguration]
    }
  }

  @js.native
  trait AnalyticsExportDestination extends js.Object {
    var S3BucketDestination: js.UndefOr[AnalyticsS3BucketDestination]
  }

  object AnalyticsExportDestination {
    def apply(
      S3BucketDestination: js.UndefOr[AnalyticsS3BucketDestination] = js.undefined): AnalyticsExportDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3BucketDestination" -> S3BucketDestination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnalyticsExportDestination]
    }
  }

  @js.native
  trait AnalyticsFilter extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[Tag]
    var And: js.UndefOr[AnalyticsAndOperator]
  }

  object AnalyticsFilter {
    def apply(
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Tag: js.UndefOr[Tag] = js.undefined,
      And: js.UndefOr[AnalyticsAndOperator] = js.undefined): AnalyticsFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Tag" -> Tag.map { x => x.asInstanceOf[js.Any] },
        "And" -> And.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnalyticsFilter]
    }
  }

  @js.native
  trait AnalyticsS3BucketDestination extends js.Object {
    var Format: js.UndefOr[AnalyticsS3ExportFileFormat]
    var BucketAccountId: js.UndefOr[AccountId]
    var Bucket: js.UndefOr[BucketName]
    var Prefix: js.UndefOr[Prefix]
  }

  object AnalyticsS3BucketDestination {
    def apply(
      Format: js.UndefOr[AnalyticsS3ExportFileFormat] = js.undefined,
      BucketAccountId: js.UndefOr[AccountId] = js.undefined,
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined): AnalyticsS3BucketDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "BucketAccountId" -> BucketAccountId.map { x => x.asInstanceOf[js.Any] },
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnalyticsS3BucketDestination]
    }
  }

  object AnalyticsS3ExportFileFormatEnum {
    val CSV = "CSV"

    val values = IndexedSeq(CSV)
  }

  @js.native
  trait Bucket extends js.Object {
    var Name: js.UndefOr[BucketName]
    var CreationDate: js.UndefOr[CreationDate]
  }

  object Bucket {
    def apply(
      Name: js.UndefOr[BucketName] = js.undefined,
      CreationDate: js.UndefOr[CreationDate] = js.undefined): Bucket = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Bucket]
    }
  }

  object BucketAccelerateStatusEnum {
    val Enabled = "Enabled"
    val Suspended = "Suspended"

    val values = IndexedSeq(Enabled, Suspended)
  }

  object BucketCannedACLEnum {
    val `private` = "private"
    val `public-read` = "public-read"
    val `public-read-write` = "public-read-write"
    val `authenticated-read` = "authenticated-read"

    val values = IndexedSeq(`private`, `public-read`, `public-read-write`, `authenticated-read`)
  }

  @js.native
  trait BucketLifecycleConfiguration extends js.Object {
    var Rules: js.UndefOr[LifecycleRules]
  }

  object BucketLifecycleConfiguration {
    def apply(
      Rules: js.UndefOr[LifecycleRules] = js.undefined): BucketLifecycleConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BucketLifecycleConfiguration]
    }
  }

  object BucketLocationConstraintEnum {
    val EU = "EU"
    val `eu-west-1` = "eu-west-1"
    val `us-west-1` = "us-west-1"
    val `us-west-2` = "us-west-2"
    val `ap-south-1` = "ap-south-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `sa-east-1` = "sa-east-1"
    val `cn-north-1` = "cn-north-1"
    val `eu-central-1` = "eu-central-1"

    val values = IndexedSeq(EU, `eu-west-1`, `us-west-1`, `us-west-2`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `sa-east-1`, `cn-north-1`, `eu-central-1`)
  }

  @js.native
  trait BucketLoggingStatus extends js.Object {
    var LoggingEnabled: js.UndefOr[LoggingEnabled]
  }

  object BucketLoggingStatus {
    def apply(
      LoggingEnabled: js.UndefOr[LoggingEnabled] = js.undefined): BucketLoggingStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoggingEnabled" -> LoggingEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BucketLoggingStatus]
    }
  }

  object BucketLogsPermissionEnum {
    val FULL_CONTROL = "FULL_CONTROL"
    val READ = "READ"
    val WRITE = "WRITE"

    val values = IndexedSeq(FULL_CONTROL, READ, WRITE)
  }

  object BucketVersioningStatusEnum {
    val Enabled = "Enabled"
    val Suspended = "Suspended"

    val values = IndexedSeq(Enabled, Suspended)
  }

  @js.native
  trait CORSConfiguration extends js.Object {
    var CORSRules: js.UndefOr[CORSRules]
  }

  object CORSConfiguration {
    def apply(
      CORSRules: js.UndefOr[CORSRules] = js.undefined): CORSConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CORSRules" -> CORSRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CORSConfiguration]
    }
  }

  @js.native
  trait CORSRule extends js.Object {
    var ExposeHeaders: js.UndefOr[ExposeHeaders]
    var AllowedHeaders: js.UndefOr[AllowedHeaders]
    var MaxAgeSeconds: js.UndefOr[MaxAgeSeconds]
    var AllowedMethods: js.UndefOr[AllowedMethods]
    var AllowedOrigins: js.UndefOr[AllowedOrigins]
  }

  object CORSRule {
    def apply(
      ExposeHeaders: js.UndefOr[ExposeHeaders] = js.undefined,
      AllowedHeaders: js.UndefOr[AllowedHeaders] = js.undefined,
      MaxAgeSeconds: js.UndefOr[MaxAgeSeconds] = js.undefined,
      AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
      AllowedOrigins: js.UndefOr[AllowedOrigins] = js.undefined): CORSRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExposeHeaders" -> ExposeHeaders.map { x => x.asInstanceOf[js.Any] },
        "AllowedHeaders" -> AllowedHeaders.map { x => x.asInstanceOf[js.Any] },
        "MaxAgeSeconds" -> MaxAgeSeconds.map { x => x.asInstanceOf[js.Any] },
        "AllowedMethods" -> AllowedMethods.map { x => x.asInstanceOf[js.Any] },
        "AllowedOrigins" -> AllowedOrigins.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CORSRule]
    }
  }

  /**
   * <p>Describes how a CSV-formatted input object is formatted.</p>
   */
  @js.native
  trait CSVInput extends js.Object {
    var Comments: js.UndefOr[Comments]
    var FileHeaderInfo: js.UndefOr[FileHeaderInfo]
    var QuoteCharacter: js.UndefOr[QuoteCharacter]
    var QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter]
    var AllowQuotedRecordDelimiter: js.UndefOr[AllowQuotedRecordDelimiter]
    var FieldDelimiter: js.UndefOr[FieldDelimiter]
    var RecordDelimiter: js.UndefOr[RecordDelimiter]
  }

  object CSVInput {
    def apply(
      Comments: js.UndefOr[Comments] = js.undefined,
      FileHeaderInfo: js.UndefOr[FileHeaderInfo] = js.undefined,
      QuoteCharacter: js.UndefOr[QuoteCharacter] = js.undefined,
      QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter] = js.undefined,
      AllowQuotedRecordDelimiter: js.UndefOr[AllowQuotedRecordDelimiter] = js.undefined,
      FieldDelimiter: js.UndefOr[FieldDelimiter] = js.undefined,
      RecordDelimiter: js.UndefOr[RecordDelimiter] = js.undefined): CSVInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comments" -> Comments.map { x => x.asInstanceOf[js.Any] },
        "FileHeaderInfo" -> FileHeaderInfo.map { x => x.asInstanceOf[js.Any] },
        "QuoteCharacter" -> QuoteCharacter.map { x => x.asInstanceOf[js.Any] },
        "QuoteEscapeCharacter" -> QuoteEscapeCharacter.map { x => x.asInstanceOf[js.Any] },
        "AllowQuotedRecordDelimiter" -> AllowQuotedRecordDelimiter.map { x => x.asInstanceOf[js.Any] },
        "FieldDelimiter" -> FieldDelimiter.map { x => x.asInstanceOf[js.Any] },
        "RecordDelimiter" -> RecordDelimiter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CSVInput]
    }
  }

  /**
   * <p>Describes how CSV-formatted results are formatted.</p>
   */
  @js.native
  trait CSVOutput extends js.Object {
    var QuoteFields: js.UndefOr[QuoteFields]
    var QuoteCharacter: js.UndefOr[QuoteCharacter]
    var QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter]
    var FieldDelimiter: js.UndefOr[FieldDelimiter]
    var RecordDelimiter: js.UndefOr[RecordDelimiter]
  }

  object CSVOutput {
    def apply(
      QuoteFields: js.UndefOr[QuoteFields] = js.undefined,
      QuoteCharacter: js.UndefOr[QuoteCharacter] = js.undefined,
      QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter] = js.undefined,
      FieldDelimiter: js.UndefOr[FieldDelimiter] = js.undefined,
      RecordDelimiter: js.UndefOr[RecordDelimiter] = js.undefined): CSVOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QuoteFields" -> QuoteFields.map { x => x.asInstanceOf[js.Any] },
        "QuoteCharacter" -> QuoteCharacter.map { x => x.asInstanceOf[js.Any] },
        "QuoteEscapeCharacter" -> QuoteEscapeCharacter.map { x => x.asInstanceOf[js.Any] },
        "FieldDelimiter" -> FieldDelimiter.map { x => x.asInstanceOf[js.Any] },
        "RecordDelimiter" -> RecordDelimiter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CSVOutput]
    }
  }

  @js.native
  trait CloudFunctionConfiguration extends js.Object {
    var Id: js.UndefOr[NotificationId]
    var Event: js.UndefOr[Event]
    var InvocationRole: js.UndefOr[CloudFunctionInvocationRole]
    var Events: js.UndefOr[EventList]
    var CloudFunction: js.UndefOr[CloudFunction]
  }

  object CloudFunctionConfiguration {
    def apply(
      Id: js.UndefOr[NotificationId] = js.undefined,
      Event: js.UndefOr[Event] = js.undefined,
      InvocationRole: js.UndefOr[CloudFunctionInvocationRole] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined,
      CloudFunction: js.UndefOr[CloudFunction] = js.undefined): CloudFunctionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Event" -> Event.map { x => x.asInstanceOf[js.Any] },
        "InvocationRole" -> InvocationRole.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "CloudFunction" -> CloudFunction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudFunctionConfiguration]
    }
  }

  @js.native
  trait CommonPrefix extends js.Object {
    var Prefix: js.UndefOr[Prefix]
  }

  object CommonPrefix {
    def apply(
      Prefix: js.UndefOr[Prefix] = js.undefined): CommonPrefix = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CommonPrefix]
    }
  }

  @js.native
  trait CompleteMultipartUploadOutput extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Location: js.UndefOr[Location]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var VersionId: js.UndefOr[ObjectVersionId]
    var Expiration: js.UndefOr[Expiration]
    var ETag: js.UndefOr[ETag]
    var RequestCharged: js.UndefOr[RequestCharged]
    var Key: js.UndefOr[ObjectKey]
  }

  object CompleteMultipartUploadOutput {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Location: js.UndefOr[Location] = js.undefined,
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      Expiration: js.UndefOr[Expiration] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): CompleteMultipartUploadOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] },
        "SSEKMSKeyId" -> SSEKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "ServerSideEncryption" -> ServerSideEncryption.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "Expiration" -> Expiration.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteMultipartUploadOutput]
    }
  }

  @js.native
  trait CompleteMultipartUploadRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var MultipartUpload: js.UndefOr[CompletedMultipartUpload]
    var RequestPayer: js.UndefOr[RequestPayer]
    var UploadId: js.UndefOr[MultipartUploadId]
    var Key: js.UndefOr[ObjectKey]
  }

  object CompleteMultipartUploadRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      MultipartUpload: js.UndefOr[CompletedMultipartUpload] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): CompleteMultipartUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "MultipartUpload" -> MultipartUpload.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "UploadId" -> UploadId.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteMultipartUploadRequest]
    }
  }

  @js.native
  trait CompletedMultipartUpload extends js.Object {
    var Parts: js.UndefOr[CompletedPartList]
  }

  object CompletedMultipartUpload {
    def apply(
      Parts: js.UndefOr[CompletedPartList] = js.undefined): CompletedMultipartUpload = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parts" -> Parts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompletedMultipartUpload]
    }
  }

  @js.native
  trait CompletedPart extends js.Object {
    var ETag: js.UndefOr[ETag]
    var PartNumber: js.UndefOr[PartNumber]
  }

  object CompletedPart {
    def apply(
      ETag: js.UndefOr[ETag] = js.undefined,
      PartNumber: js.UndefOr[PartNumber] = js.undefined): CompletedPart = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "PartNumber" -> PartNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompletedPart]
    }
  }

  object CompressionTypeEnum {
    val NONE = "NONE"
    val GZIP = "GZIP"
    val BZIP2 = "BZIP2"

    val values = IndexedSeq(NONE, GZIP, BZIP2)
  }

  @js.native
  trait Condition extends js.Object {
    var HttpErrorCodeReturnedEquals: js.UndefOr[HttpErrorCodeReturnedEquals]
    var KeyPrefixEquals: js.UndefOr[KeyPrefixEquals]
  }

  object Condition {
    def apply(
      HttpErrorCodeReturnedEquals: js.UndefOr[HttpErrorCodeReturnedEquals] = js.undefined,
      KeyPrefixEquals: js.UndefOr[KeyPrefixEquals] = js.undefined): Condition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HttpErrorCodeReturnedEquals" -> HttpErrorCodeReturnedEquals.map { x => x.asInstanceOf[js.Any] },
        "KeyPrefixEquals" -> KeyPrefixEquals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Condition]
    }
  }

  @js.native
  trait ContinuationEvent extends js.Object {

  }

  object ContinuationEvent {
    def apply(): ContinuationEvent = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinuationEvent]
    }
  }

  @js.native
  trait CopyObjectOutput extends js.Object {
    var CopySourceVersionId: js.UndefOr[CopySourceVersionId]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var CopyObjectResult: js.UndefOr[CopyObjectResult]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var VersionId: js.UndefOr[ObjectVersionId]
    var Expiration: js.UndefOr[Expiration]
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object CopyObjectOutput {
    def apply(
      CopySourceVersionId: js.UndefOr[CopySourceVersionId] = js.undefined,
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      CopyObjectResult: js.UndefOr[CopyObjectResult] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      Expiration: js.UndefOr[Expiration] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined): CopyObjectOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CopySourceVersionId" -> CopySourceVersionId.map { x => x.asInstanceOf[js.Any] },
        "SSEKMSKeyId" -> SSEKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "ServerSideEncryption" -> ServerSideEncryption.map { x => x.asInstanceOf[js.Any] },
        "CopyObjectResult" -> CopyObjectResult.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "Expiration" -> Expiration.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyObjectOutput]
    }
  }

  @js.native
  trait CopyObjectRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Metadata: js.UndefOr[Metadata]
    var TaggingDirective: js.UndefOr[TaggingDirective]
    var CopySource: js.UndefOr[CopySource]
    var CopySourceIfModifiedSince: js.UndefOr[CopySourceIfModifiedSince]
    var CopySourceIfNoneMatch: js.UndefOr[CopySourceIfNoneMatch]
    var CopySourceSSECustomerKey: js.UndefOr[CopySourceSSECustomerKey]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var GrantFullControl: js.UndefOr[GrantFullControl]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var GrantWriteACP: js.UndefOr[GrantWriteACP]
    var ContentEncoding: js.UndefOr[ContentEncoding]
    var ACL: js.UndefOr[ObjectCannedACL]
    var Expires: js.UndefOr[Expires]
    var Tagging: js.UndefOr[TaggingHeader]
    var CopySourceIfMatch: js.UndefOr[CopySourceIfMatch]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var RequestPayer: js.UndefOr[RequestPayer]
    var CopySourceIfUnmodifiedSince: js.UndefOr[CopySourceIfUnmodifiedSince]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var MetadataDirective: js.UndefOr[MetadataDirective]
    var GrantReadACP: js.UndefOr[GrantReadACP]
    var ContentLanguage: js.UndefOr[ContentLanguage]
    var ContentDisposition: js.UndefOr[ContentDisposition]
    var GrantRead: js.UndefOr[GrantRead]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
    var CacheControl: js.UndefOr[CacheControl]
    var ContentType: js.UndefOr[ContentType]
    var CopySourceSSECustomerAlgorithm: js.UndefOr[CopySourceSSECustomerAlgorithm]
    var CopySourceSSECustomerKeyMD5: js.UndefOr[CopySourceSSECustomerKeyMD5]
    var StorageClass: js.UndefOr[StorageClass]
    var Key: js.UndefOr[ObjectKey]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
  }

  object CopyObjectRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Metadata: js.UndefOr[Metadata] = js.undefined,
      TaggingDirective: js.UndefOr[TaggingDirective] = js.undefined,
      CopySource: js.UndefOr[CopySource] = js.undefined,
      CopySourceIfModifiedSince: js.UndefOr[CopySourceIfModifiedSince] = js.undefined,
      CopySourceIfNoneMatch: js.UndefOr[CopySourceIfNoneMatch] = js.undefined,
      CopySourceSSECustomerKey: js.UndefOr[CopySourceSSECustomerKey] = js.undefined,
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined,
      ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined,
      ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
      Expires: js.UndefOr[Expires] = js.undefined,
      Tagging: js.UndefOr[TaggingHeader] = js.undefined,
      CopySourceIfMatch: js.UndefOr[CopySourceIfMatch] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      CopySourceIfUnmodifiedSince: js.UndefOr[CopySourceIfUnmodifiedSince] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      MetadataDirective: js.UndefOr[MetadataDirective] = js.undefined,
      GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
      ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined,
      ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined,
      GrantRead: js.UndefOr[GrantRead] = js.undefined,
      WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined,
      CacheControl: js.UndefOr[CacheControl] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      CopySourceSSECustomerAlgorithm: js.UndefOr[CopySourceSSECustomerAlgorithm] = js.undefined,
      CopySourceSSECustomerKeyMD5: js.UndefOr[CopySourceSSECustomerKeyMD5] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined): CopyObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] },
        "TaggingDirective" -> TaggingDirective.map { x => x.asInstanceOf[js.Any] },
        "CopySource" -> CopySource.map { x => x.asInstanceOf[js.Any] },
        "CopySourceIfModifiedSince" -> CopySourceIfModifiedSince.map { x => x.asInstanceOf[js.Any] },
        "CopySourceIfNoneMatch" -> CopySourceIfNoneMatch.map { x => x.asInstanceOf[js.Any] },
        "CopySourceSSECustomerKey" -> CopySourceSSECustomerKey.map { x => x.asInstanceOf[js.Any] },
        "SSEKMSKeyId" -> SSEKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "GrantFullControl" -> GrantFullControl.map { x => x.asInstanceOf[js.Any] },
        "ServerSideEncryption" -> ServerSideEncryption.map { x => x.asInstanceOf[js.Any] },
        "GrantWriteACP" -> GrantWriteACP.map { x => x.asInstanceOf[js.Any] },
        "ContentEncoding" -> ContentEncoding.map { x => x.asInstanceOf[js.Any] },
        "ACL" -> ACL.map { x => x.asInstanceOf[js.Any] },
        "Expires" -> Expires.map { x => x.asInstanceOf[js.Any] },
        "Tagging" -> Tagging.map { x => x.asInstanceOf[js.Any] },
        "CopySourceIfMatch" -> CopySourceIfMatch.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "CopySourceIfUnmodifiedSince" -> CopySourceIfUnmodifiedSince.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "MetadataDirective" -> MetadataDirective.map { x => x.asInstanceOf[js.Any] },
        "GrantReadACP" -> GrantReadACP.map { x => x.asInstanceOf[js.Any] },
        "ContentLanguage" -> ContentLanguage.map { x => x.asInstanceOf[js.Any] },
        "ContentDisposition" -> ContentDisposition.map { x => x.asInstanceOf[js.Any] },
        "GrantRead" -> GrantRead.map { x => x.asInstanceOf[js.Any] },
        "WebsiteRedirectLocation" -> WebsiteRedirectLocation.map { x => x.asInstanceOf[js.Any] },
        "CacheControl" -> CacheControl.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "CopySourceSSECustomerAlgorithm" -> CopySourceSSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "CopySourceSSECustomerKeyMD5" -> CopySourceSSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKey" -> SSECustomerKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyObjectRequest]
    }
  }

  @js.native
  trait CopyObjectResult extends js.Object {
    var ETag: js.UndefOr[ETag]
    var LastModified: js.UndefOr[LastModified]
  }

  object CopyObjectResult {
    def apply(
      ETag: js.UndefOr[ETag] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined): CopyObjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyObjectResult]
    }
  }

  @js.native
  trait CopyPartResult extends js.Object {
    var ETag: js.UndefOr[ETag]
    var LastModified: js.UndefOr[LastModified]
  }

  object CopyPartResult {
    def apply(
      ETag: js.UndefOr[ETag] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined): CopyPartResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyPartResult]
    }
  }

  @js.native
  trait CreateBucketConfiguration extends js.Object {
    var LocationConstraint: js.UndefOr[BucketLocationConstraint]
  }

  object CreateBucketConfiguration {
    def apply(
      LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined): CreateBucketConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationConstraint" -> LocationConstraint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBucketConfiguration]
    }
  }

  @js.native
  trait CreateBucketOutput extends js.Object {
    var Location: js.UndefOr[Location]
  }

  object CreateBucketOutput {
    def apply(
      Location: js.UndefOr[Location] = js.undefined): CreateBucketOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBucketOutput]
    }
  }

  @js.native
  trait CreateBucketRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var GrantWrite: js.UndefOr[GrantWrite]
    var CreateBucketConfiguration: js.UndefOr[CreateBucketConfiguration]
    var GrantFullControl: js.UndefOr[GrantFullControl]
    var GrantWriteACP: js.UndefOr[GrantWriteACP]
    var ACL: js.UndefOr[BucketCannedACL]
    var GrantReadACP: js.UndefOr[GrantReadACP]
    var GrantRead: js.UndefOr[GrantRead]
  }

  object CreateBucketRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      GrantWrite: js.UndefOr[GrantWrite] = js.undefined,
      CreateBucketConfiguration: js.UndefOr[CreateBucketConfiguration] = js.undefined,
      GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
      GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined,
      ACL: js.UndefOr[BucketCannedACL] = js.undefined,
      GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
      GrantRead: js.UndefOr[GrantRead] = js.undefined): CreateBucketRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "GrantWrite" -> GrantWrite.map { x => x.asInstanceOf[js.Any] },
        "CreateBucketConfiguration" -> CreateBucketConfiguration.map { x => x.asInstanceOf[js.Any] },
        "GrantFullControl" -> GrantFullControl.map { x => x.asInstanceOf[js.Any] },
        "GrantWriteACP" -> GrantWriteACP.map { x => x.asInstanceOf[js.Any] },
        "ACL" -> ACL.map { x => x.asInstanceOf[js.Any] },
        "GrantReadACP" -> GrantReadACP.map { x => x.asInstanceOf[js.Any] },
        "GrantRead" -> GrantRead.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBucketRequest]
    }
  }

  @js.native
  trait CreateMultipartUploadOutput extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var AbortDate: js.UndefOr[AbortDate]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var AbortRuleId: js.UndefOr[AbortRuleId]
    var RequestCharged: js.UndefOr[RequestCharged]
    var UploadId: js.UndefOr[MultipartUploadId]
    var Key: js.UndefOr[ObjectKey]
  }

  object CreateMultipartUploadOutput {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      AbortDate: js.UndefOr[AbortDate] = js.undefined,
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      AbortRuleId: js.UndefOr[AbortRuleId] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): CreateMultipartUploadOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "AbortDate" -> AbortDate.map { x => x.asInstanceOf[js.Any] },
        "SSEKMSKeyId" -> SSEKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "ServerSideEncryption" -> ServerSideEncryption.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "AbortRuleId" -> AbortRuleId.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] },
        "UploadId" -> UploadId.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMultipartUploadOutput]
    }
  }

  @js.native
  trait CreateMultipartUploadRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Metadata: js.UndefOr[Metadata]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var GrantFullControl: js.UndefOr[GrantFullControl]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var GrantWriteACP: js.UndefOr[GrantWriteACP]
    var ContentEncoding: js.UndefOr[ContentEncoding]
    var ACL: js.UndefOr[ObjectCannedACL]
    var Expires: js.UndefOr[Expires]
    var Tagging: js.UndefOr[TaggingHeader]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var RequestPayer: js.UndefOr[RequestPayer]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var GrantReadACP: js.UndefOr[GrantReadACP]
    var ContentLanguage: js.UndefOr[ContentLanguage]
    var ContentDisposition: js.UndefOr[ContentDisposition]
    var GrantRead: js.UndefOr[GrantRead]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
    var CacheControl: js.UndefOr[CacheControl]
    var ContentType: js.UndefOr[ContentType]
    var StorageClass: js.UndefOr[StorageClass]
    var Key: js.UndefOr[ObjectKey]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
  }

  object CreateMultipartUploadRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Metadata: js.UndefOr[Metadata] = js.undefined,
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined,
      ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined,
      ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
      Expires: js.UndefOr[Expires] = js.undefined,
      Tagging: js.UndefOr[TaggingHeader] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
      ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined,
      ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined,
      GrantRead: js.UndefOr[GrantRead] = js.undefined,
      WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined,
      CacheControl: js.UndefOr[CacheControl] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined): CreateMultipartUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] },
        "SSEKMSKeyId" -> SSEKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "GrantFullControl" -> GrantFullControl.map { x => x.asInstanceOf[js.Any] },
        "ServerSideEncryption" -> ServerSideEncryption.map { x => x.asInstanceOf[js.Any] },
        "GrantWriteACP" -> GrantWriteACP.map { x => x.asInstanceOf[js.Any] },
        "ContentEncoding" -> ContentEncoding.map { x => x.asInstanceOf[js.Any] },
        "ACL" -> ACL.map { x => x.asInstanceOf[js.Any] },
        "Expires" -> Expires.map { x => x.asInstanceOf[js.Any] },
        "Tagging" -> Tagging.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "GrantReadACP" -> GrantReadACP.map { x => x.asInstanceOf[js.Any] },
        "ContentLanguage" -> ContentLanguage.map { x => x.asInstanceOf[js.Any] },
        "ContentDisposition" -> ContentDisposition.map { x => x.asInstanceOf[js.Any] },
        "GrantRead" -> GrantRead.map { x => x.asInstanceOf[js.Any] },
        "WebsiteRedirectLocation" -> WebsiteRedirectLocation.map { x => x.asInstanceOf[js.Any] },
        "CacheControl" -> CacheControl.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKey" -> SSECustomerKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMultipartUploadRequest]
    }
  }

  @js.native
  trait Delete extends js.Object {
    var Objects: js.UndefOr[ObjectIdentifierList]
    var Quiet: js.UndefOr[Quiet]
  }

  object Delete {
    def apply(
      Objects: js.UndefOr[ObjectIdentifierList] = js.undefined,
      Quiet: js.UndefOr[Quiet] = js.undefined): Delete = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Objects" -> Objects.map { x => x.asInstanceOf[js.Any] },
        "Quiet" -> Quiet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Delete]
    }
  }

  @js.native
  trait DeleteBucketAnalyticsConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Id: js.UndefOr[AnalyticsId]
  }

  object DeleteBucketAnalyticsConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Id: js.UndefOr[AnalyticsId] = js.undefined): DeleteBucketAnalyticsConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketAnalyticsConfigurationRequest]
    }
  }

  @js.native
  trait DeleteBucketCorsRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object DeleteBucketCorsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): DeleteBucketCorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketCorsRequest]
    }
  }

  @js.native
  trait DeleteBucketEncryptionRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object DeleteBucketEncryptionRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): DeleteBucketEncryptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketEncryptionRequest]
    }
  }

  @js.native
  trait DeleteBucketInventoryConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Id: js.UndefOr[InventoryId]
  }

  object DeleteBucketInventoryConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Id: js.UndefOr[InventoryId] = js.undefined): DeleteBucketInventoryConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketInventoryConfigurationRequest]
    }
  }

  @js.native
  trait DeleteBucketLifecycleRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object DeleteBucketLifecycleRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): DeleteBucketLifecycleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketLifecycleRequest]
    }
  }

  @js.native
  trait DeleteBucketMetricsConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Id: js.UndefOr[MetricsId]
  }

  object DeleteBucketMetricsConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Id: js.UndefOr[MetricsId] = js.undefined): DeleteBucketMetricsConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketMetricsConfigurationRequest]
    }
  }

  @js.native
  trait DeleteBucketPolicyRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object DeleteBucketPolicyRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): DeleteBucketPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketPolicyRequest]
    }
  }

  @js.native
  trait DeleteBucketReplicationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object DeleteBucketReplicationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): DeleteBucketReplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketReplicationRequest]
    }
  }

  @js.native
  trait DeleteBucketRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object DeleteBucketRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): DeleteBucketRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketRequest]
    }
  }

  @js.native
  trait DeleteBucketTaggingRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object DeleteBucketTaggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): DeleteBucketTaggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketTaggingRequest]
    }
  }

  @js.native
  trait DeleteBucketWebsiteRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object DeleteBucketWebsiteRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): DeleteBucketWebsiteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketWebsiteRequest]
    }
  }

  @js.native
  trait DeleteMarkerEntry extends js.Object {
    var LastModified: js.UndefOr[LastModified]
    var IsLatest: js.UndefOr[IsLatest]
    var VersionId: js.UndefOr[ObjectVersionId]
    var Owner: js.UndefOr[Owner]
    var Key: js.UndefOr[ObjectKey]
  }

  object DeleteMarkerEntry {
    def apply(
      LastModified: js.UndefOr[LastModified] = js.undefined,
      IsLatest: js.UndefOr[IsLatest] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): DeleteMarkerEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "IsLatest" -> IsLatest.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMarkerEntry]
    }
  }

  /**
   * <p>Specifies whether Amazon S3 should replicate delete makers.</p>
   */
  @js.native
  trait DeleteMarkerReplication extends js.Object {
    var Status: js.UndefOr[DeleteMarkerReplicationStatus]
  }

  object DeleteMarkerReplication {
    def apply(
      Status: js.UndefOr[DeleteMarkerReplicationStatus] = js.undefined): DeleteMarkerReplication = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMarkerReplication]
    }
  }

  object DeleteMarkerReplicationStatusEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  @js.native
  trait DeleteObjectOutput extends js.Object {
    var DeleteMarker: js.UndefOr[DeleteMarker]
    var VersionId: js.UndefOr[ObjectVersionId]
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object DeleteObjectOutput {
    def apply(
      DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined): DeleteObjectOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeleteMarker" -> DeleteMarker.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectOutput]
    }
  }

  @js.native
  trait DeleteObjectRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
    var MFA: js.UndefOr[MFA]
    var Key: js.UndefOr[ObjectKey]
  }

  object DeleteObjectRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      MFA: js.UndefOr[MFA] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): DeleteObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "MFA" -> MFA.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectRequest]
    }
  }

  @js.native
  trait DeleteObjectTaggingOutput extends js.Object {
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object DeleteObjectTaggingOutput {
    def apply(
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined): DeleteObjectTaggingOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectTaggingOutput]
    }
  }

  @js.native
  trait DeleteObjectTaggingRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Key: js.UndefOr[ObjectKey]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object DeleteObjectTaggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined): DeleteObjectTaggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectTaggingRequest]
    }
  }

  @js.native
  trait DeleteObjectsOutput extends js.Object {
    var Deleted: js.UndefOr[DeletedObjects]
    var RequestCharged: js.UndefOr[RequestCharged]
    var Errors: js.UndefOr[Errors]
  }

  object DeleteObjectsOutput {
    def apply(
      Deleted: js.UndefOr[DeletedObjects] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
      Errors: js.UndefOr[Errors] = js.undefined): DeleteObjectsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Deleted" -> Deleted.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] },
        "Errors" -> Errors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectsOutput]
    }
  }

  @js.native
  trait DeleteObjectsRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Delete: js.UndefOr[Delete]
    var MFA: js.UndefOr[MFA]
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  object DeleteObjectsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Delete: js.UndefOr[Delete] = js.undefined,
      MFA: js.UndefOr[MFA] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined): DeleteObjectsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Delete" -> Delete.map { x => x.asInstanceOf[js.Any] },
        "MFA" -> MFA.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectsRequest]
    }
  }

  @js.native
  trait DeletePublicAccessBlockRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object DeletePublicAccessBlockRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): DeletePublicAccessBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePublicAccessBlockRequest]
    }
  }

  @js.native
  trait DeletedObject extends js.Object {
    var Key: js.UndefOr[ObjectKey]
    var VersionId: js.UndefOr[ObjectVersionId]
    var DeleteMarker: js.UndefOr[DeleteMarker]
    var DeleteMarkerVersionId: js.UndefOr[DeleteMarkerVersionId]
  }

  object DeletedObject {
    def apply(
      Key: js.UndefOr[ObjectKey] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined,
      DeleteMarkerVersionId: js.UndefOr[DeleteMarkerVersionId] = js.undefined): DeletedObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "DeleteMarker" -> DeleteMarker.map { x => x.asInstanceOf[js.Any] },
        "DeleteMarkerVersionId" -> DeleteMarkerVersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletedObject]
    }
  }

  /**
   * <p>A container for information about the replication destination.</p>
   */
  @js.native
  trait Destination extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var AccessControlTranslation: js.UndefOr[AccessControlTranslation]
    var StorageClass: js.UndefOr[StorageClass]
    var Account: js.UndefOr[AccountId]
  }

  object Destination {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
      AccessControlTranslation: js.UndefOr[AccessControlTranslation] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      Account: js.UndefOr[AccountId] = js.undefined): Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "AccessControlTranslation" -> AccessControlTranslation.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] },
        "Account" -> Account.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }

  /**
   * <p>Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.</p>
   */
  object EncodingTypeEnum {
    val url = "url"

    val values = IndexedSeq(url)
  }

  /**
   * <p>Describes the server-side encryption that will be applied to the restore results.</p>
   */
  @js.native
  trait Encryption extends js.Object {
    var EncryptionType: js.UndefOr[ServerSideEncryption]
    var KMSKeyId: js.UndefOr[SSEKMSKeyId]
    var KMSContext: js.UndefOr[KMSContext]
  }

  object Encryption {
    def apply(
      EncryptionType: js.UndefOr[ServerSideEncryption] = js.undefined,
      KMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      KMSContext: js.UndefOr[KMSContext] = js.undefined): Encryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] },
        "KMSKeyId" -> KMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "KMSContext" -> KMSContext.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Encryption]
    }
  }

  /**
   * <p>A container for information about the encryption-based configuration for replicas.</p>
   */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var ReplicaKmsKeyID: js.UndefOr[ReplicaKmsKeyID]
  }

  object EncryptionConfiguration {
    def apply(
      ReplicaKmsKeyID: js.UndefOr[ReplicaKmsKeyID] = js.undefined): EncryptionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicaKmsKeyID" -> ReplicaKmsKeyID.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionConfiguration]
    }
  }

  @js.native
  trait EndEvent extends js.Object {

  }

  object EndEvent {
    def apply(): EndEvent = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndEvent]
    }
  }

  @js.native
  trait Error extends js.Object {
    var Key: js.UndefOr[ObjectKey]
    var VersionId: js.UndefOr[ObjectVersionId]
    var Code: js.UndefOr[Code]
    var Message: js.UndefOr[Message]
  }

  object Error {
    def apply(
      Key: js.UndefOr[ObjectKey] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      Code: js.UndefOr[Code] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined): Error = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Error]
    }
  }

  @js.native
  trait ErrorDocument extends js.Object {
    var Key: js.UndefOr[ObjectKey]
  }

  object ErrorDocument {
    def apply(
      Key: js.UndefOr[ObjectKey] = js.undefined): ErrorDocument = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorDocument]
    }
  }

  /**
   * <p>The bucket event for which to send notifications.</p>
   */
  object EventEnum {
    val `s3:ReducedRedundancyLostObject` = "s3:ReducedRedundancyLostObject"
    val `s3:ObjectCreated:*` = "s3:ObjectCreated:*"
    val `s3:ObjectCreated:Put` = "s3:ObjectCreated:Put"
    val `s3:ObjectCreated:Post` = "s3:ObjectCreated:Post"
    val `s3:ObjectCreated:Copy` = "s3:ObjectCreated:Copy"
    val `s3:ObjectCreated:CompleteMultipartUpload` = "s3:ObjectCreated:CompleteMultipartUpload"
    val `s3:ObjectRemoved:*` = "s3:ObjectRemoved:*"
    val `s3:ObjectRemoved:Delete` = "s3:ObjectRemoved:Delete"
    val `s3:ObjectRemoved:DeleteMarkerCreated` = "s3:ObjectRemoved:DeleteMarkerCreated"

    val values = IndexedSeq(`s3:ReducedRedundancyLostObject`, `s3:ObjectCreated:*`, `s3:ObjectCreated:Put`, `s3:ObjectCreated:Post`, `s3:ObjectCreated:Copy`, `s3:ObjectCreated:CompleteMultipartUpload`, `s3:ObjectRemoved:*`, `s3:ObjectRemoved:Delete`, `s3:ObjectRemoved:DeleteMarkerCreated`)
  }

  object ExpirationStatusEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  object ExpressionTypeEnum {
    val SQL = "SQL"

    val values = IndexedSeq(SQL)
  }

  object FileHeaderInfoEnum {
    val USE = "USE"
    val IGNORE = "IGNORE"
    val NONE = "NONE"

    val values = IndexedSeq(USE, IGNORE, NONE)
  }

  /**
   * <p>A container for a key value pair that defines the criteria for the filter rule.</p>
   */
  @js.native
  trait FilterRule extends js.Object {
    var Name: js.UndefOr[FilterRuleName]
    var Value: js.UndefOr[FilterRuleValue]
  }

  object FilterRule {
    def apply(
      Name: js.UndefOr[FilterRuleName] = js.undefined,
      Value: js.UndefOr[FilterRuleValue] = js.undefined): FilterRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FilterRule]
    }
  }

  object FilterRuleNameEnum {
    val prefix = "prefix"
    val suffix = "suffix"

    val values = IndexedSeq(prefix, suffix)
  }

  @js.native
  trait GetBucketAccelerateConfigurationOutput extends js.Object {
    var Status: js.UndefOr[BucketAccelerateStatus]
  }

  object GetBucketAccelerateConfigurationOutput {
    def apply(
      Status: js.UndefOr[BucketAccelerateStatus] = js.undefined): GetBucketAccelerateConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketAccelerateConfigurationOutput]
    }
  }

  @js.native
  trait GetBucketAccelerateConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketAccelerateConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketAccelerateConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketAccelerateConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketAclOutput extends js.Object {
    var Owner: js.UndefOr[Owner]
    var Grants: js.UndefOr[Grants]
  }

  object GetBucketAclOutput {
    def apply(
      Owner: js.UndefOr[Owner] = js.undefined,
      Grants: js.UndefOr[Grants] = js.undefined): GetBucketAclOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "Grants" -> Grants.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketAclOutput]
    }
  }

  @js.native
  trait GetBucketAclRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketAclRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketAclRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketAclRequest]
    }
  }

  @js.native
  trait GetBucketAnalyticsConfigurationOutput extends js.Object {
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfiguration]
  }

  object GetBucketAnalyticsConfigurationOutput {
    def apply(
      AnalyticsConfiguration: js.UndefOr[AnalyticsConfiguration] = js.undefined): GetBucketAnalyticsConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AnalyticsConfiguration" -> AnalyticsConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketAnalyticsConfigurationOutput]
    }
  }

  @js.native
  trait GetBucketAnalyticsConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Id: js.UndefOr[AnalyticsId]
  }

  object GetBucketAnalyticsConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Id: js.UndefOr[AnalyticsId] = js.undefined): GetBucketAnalyticsConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketAnalyticsConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketCorsOutput extends js.Object {
    var CORSRules: js.UndefOr[CORSRules]
  }

  object GetBucketCorsOutput {
    def apply(
      CORSRules: js.UndefOr[CORSRules] = js.undefined): GetBucketCorsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CORSRules" -> CORSRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketCorsOutput]
    }
  }

  @js.native
  trait GetBucketCorsRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketCorsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketCorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketCorsRequest]
    }
  }

  @js.native
  trait GetBucketEncryptionOutput extends js.Object {
    var ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
  }

  object GetBucketEncryptionOutput {
    def apply(
      ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined): GetBucketEncryptionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerSideEncryptionConfiguration" -> ServerSideEncryptionConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketEncryptionOutput]
    }
  }

  @js.native
  trait GetBucketEncryptionRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketEncryptionRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketEncryptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketEncryptionRequest]
    }
  }

  @js.native
  trait GetBucketInventoryConfigurationOutput extends js.Object {
    var InventoryConfiguration: js.UndefOr[InventoryConfiguration]
  }

  object GetBucketInventoryConfigurationOutput {
    def apply(
      InventoryConfiguration: js.UndefOr[InventoryConfiguration] = js.undefined): GetBucketInventoryConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InventoryConfiguration" -> InventoryConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketInventoryConfigurationOutput]
    }
  }

  @js.native
  trait GetBucketInventoryConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Id: js.UndefOr[InventoryId]
  }

  object GetBucketInventoryConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Id: js.UndefOr[InventoryId] = js.undefined): GetBucketInventoryConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketInventoryConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketLifecycleConfigurationOutput extends js.Object {
    var Rules: js.UndefOr[LifecycleRules]
  }

  object GetBucketLifecycleConfigurationOutput {
    def apply(
      Rules: js.UndefOr[LifecycleRules] = js.undefined): GetBucketLifecycleConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLifecycleConfigurationOutput]
    }
  }

  @js.native
  trait GetBucketLifecycleConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketLifecycleConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketLifecycleConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLifecycleConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketLifecycleOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  object GetBucketLifecycleOutput {
    def apply(
      Rules: js.UndefOr[Rules] = js.undefined): GetBucketLifecycleOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLifecycleOutput]
    }
  }

  @js.native
  trait GetBucketLifecycleRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketLifecycleRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketLifecycleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLifecycleRequest]
    }
  }

  @js.native
  trait GetBucketLocationOutput extends js.Object {
    var LocationConstraint: js.UndefOr[BucketLocationConstraint]
  }

  object GetBucketLocationOutput {
    def apply(
      LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined): GetBucketLocationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocationConstraint" -> LocationConstraint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLocationOutput]
    }
  }

  @js.native
  trait GetBucketLocationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketLocationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketLocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLocationRequest]
    }
  }

  @js.native
  trait GetBucketLoggingOutput extends js.Object {
    var LoggingEnabled: js.UndefOr[LoggingEnabled]
  }

  object GetBucketLoggingOutput {
    def apply(
      LoggingEnabled: js.UndefOr[LoggingEnabled] = js.undefined): GetBucketLoggingOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoggingEnabled" -> LoggingEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLoggingOutput]
    }
  }

  @js.native
  trait GetBucketLoggingRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketLoggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketLoggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLoggingRequest]
    }
  }

  @js.native
  trait GetBucketMetricsConfigurationOutput extends js.Object {
    var MetricsConfiguration: js.UndefOr[MetricsConfiguration]
  }

  object GetBucketMetricsConfigurationOutput {
    def apply(
      MetricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined): GetBucketMetricsConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricsConfiguration" -> MetricsConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketMetricsConfigurationOutput]
    }
  }

  @js.native
  trait GetBucketMetricsConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Id: js.UndefOr[MetricsId]
  }

  object GetBucketMetricsConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Id: js.UndefOr[MetricsId] = js.undefined): GetBucketMetricsConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketMetricsConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketNotificationConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketNotificationConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketNotificationConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketNotificationConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketPolicyOutput extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object GetBucketPolicyOutput {
    def apply(
      Policy: js.UndefOr[Policy] = js.undefined): GetBucketPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketPolicyOutput]
    }
  }

  @js.native
  trait GetBucketPolicyRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketPolicyRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketPolicyRequest]
    }
  }

  @js.native
  trait GetBucketPolicyStatusOutput extends js.Object {
    var PolicyStatus: js.UndefOr[PolicyStatus]
  }

  object GetBucketPolicyStatusOutput {
    def apply(
      PolicyStatus: js.UndefOr[PolicyStatus] = js.undefined): GetBucketPolicyStatusOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyStatus" -> PolicyStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketPolicyStatusOutput]
    }
  }

  @js.native
  trait GetBucketPolicyStatusRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketPolicyStatusRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketPolicyStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketPolicyStatusRequest]
    }
  }

  @js.native
  trait GetBucketReplicationOutput extends js.Object {
    var ReplicationConfiguration: js.UndefOr[ReplicationConfiguration]
  }

  object GetBucketReplicationOutput {
    def apply(
      ReplicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.undefined): GetBucketReplicationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationConfiguration" -> ReplicationConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketReplicationOutput]
    }
  }

  @js.native
  trait GetBucketReplicationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketReplicationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketReplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketReplicationRequest]
    }
  }

  @js.native
  trait GetBucketRequestPaymentOutput extends js.Object {
    var Payer: js.UndefOr[Payer]
  }

  object GetBucketRequestPaymentOutput {
    def apply(
      Payer: js.UndefOr[Payer] = js.undefined): GetBucketRequestPaymentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Payer" -> Payer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketRequestPaymentOutput]
    }
  }

  @js.native
  trait GetBucketRequestPaymentRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketRequestPaymentRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketRequestPaymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketRequestPaymentRequest]
    }
  }

  @js.native
  trait GetBucketTaggingOutput extends js.Object {
    var TagSet: js.UndefOr[TagSet]
  }

  object GetBucketTaggingOutput {
    def apply(
      TagSet: js.UndefOr[TagSet] = js.undefined): GetBucketTaggingOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagSet" -> TagSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketTaggingOutput]
    }
  }

  @js.native
  trait GetBucketTaggingRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketTaggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketTaggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketTaggingRequest]
    }
  }

  @js.native
  trait GetBucketVersioningOutput extends js.Object {
    var Status: js.UndefOr[BucketVersioningStatus]
    var MFADelete: js.UndefOr[MFADeleteStatus]
  }

  object GetBucketVersioningOutput {
    def apply(
      Status: js.UndefOr[BucketVersioningStatus] = js.undefined,
      MFADelete: js.UndefOr[MFADeleteStatus] = js.undefined): GetBucketVersioningOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "MFADelete" -> MFADelete.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketVersioningOutput]
    }
  }

  @js.native
  trait GetBucketVersioningRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketVersioningRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketVersioningRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketVersioningRequest]
    }
  }

  @js.native
  trait GetBucketWebsiteOutput extends js.Object {
    var RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo]
    var IndexDocument: js.UndefOr[IndexDocument]
    var ErrorDocument: js.UndefOr[ErrorDocument]
    var RoutingRules: js.UndefOr[RoutingRules]
  }

  object GetBucketWebsiteOutput {
    def apply(
      RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo] = js.undefined,
      IndexDocument: js.UndefOr[IndexDocument] = js.undefined,
      ErrorDocument: js.UndefOr[ErrorDocument] = js.undefined,
      RoutingRules: js.UndefOr[RoutingRules] = js.undefined): GetBucketWebsiteOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RedirectAllRequestsTo" -> RedirectAllRequestsTo.map { x => x.asInstanceOf[js.Any] },
        "IndexDocument" -> IndexDocument.map { x => x.asInstanceOf[js.Any] },
        "ErrorDocument" -> ErrorDocument.map { x => x.asInstanceOf[js.Any] },
        "RoutingRules" -> RoutingRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketWebsiteOutput]
    }
  }

  @js.native
  trait GetBucketWebsiteRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetBucketWebsiteRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetBucketWebsiteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketWebsiteRequest]
    }
  }

  @js.native
  trait GetObjectAclOutput extends js.Object {
    var Owner: js.UndefOr[Owner]
    var Grants: js.UndefOr[Grants]
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object GetObjectAclOutput {
    def apply(
      Owner: js.UndefOr[Owner] = js.undefined,
      Grants: js.UndefOr[Grants] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined): GetObjectAclOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "Grants" -> Grants.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectAclOutput]
    }
  }

  @js.native
  trait GetObjectAclRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Key: js.UndefOr[ObjectKey]
    var VersionId: js.UndefOr[ObjectVersionId]
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  object GetObjectAclRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined): GetObjectAclRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectAclRequest]
    }
  }

  @js.native
  trait GetObjectOutput extends js.Object {
    var ContentRange: js.UndefOr[ContentRange]
    var Metadata: js.UndefOr[Metadata]
    var Restore: js.UndefOr[Restore]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ReplicationStatus: js.UndefOr[ReplicationStatus]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var MissingMeta: js.UndefOr[MissingMeta]
    var ContentEncoding: js.UndefOr[ContentEncoding]
    var Expires: js.UndefOr[Expires]
    var LastModified: js.UndefOr[LastModified]
    var DeleteMarker: js.UndefOr[DeleteMarker]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var Body: js.UndefOr[Body]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var PartsCount: js.UndefOr[PartsCount]
    var VersionId: js.UndefOr[ObjectVersionId]
    var ContentLength: js.UndefOr[ContentLength]
    var Expiration: js.UndefOr[Expiration]
    var ContentLanguage: js.UndefOr[ContentLanguage]
    var ContentDisposition: js.UndefOr[ContentDisposition]
    var AcceptRanges: js.UndefOr[AcceptRanges]
    var TagCount: js.UndefOr[TagCount]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
    var CacheControl: js.UndefOr[CacheControl]
    var ETag: js.UndefOr[ETag]
    var RequestCharged: js.UndefOr[RequestCharged]
    var ContentType: js.UndefOr[ContentType]
    var StorageClass: js.UndefOr[StorageClass]
  }

  object GetObjectOutput {
    def apply(
      ContentRange: js.UndefOr[ContentRange] = js.undefined,
      Metadata: js.UndefOr[Metadata] = js.undefined,
      Restore: js.UndefOr[Restore] = js.undefined,
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      ReplicationStatus: js.UndefOr[ReplicationStatus] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      MissingMeta: js.UndefOr[MissingMeta] = js.undefined,
      ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined,
      Expires: js.UndefOr[Expires] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined,
      DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      Body: js.UndefOr[Body] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      PartsCount: js.UndefOr[PartsCount] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      ContentLength: js.UndefOr[ContentLength] = js.undefined,
      Expiration: js.UndefOr[Expiration] = js.undefined,
      ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined,
      ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined,
      AcceptRanges: js.UndefOr[AcceptRanges] = js.undefined,
      TagCount: js.UndefOr[TagCount] = js.undefined,
      WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined,
      CacheControl: js.UndefOr[CacheControl] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined): GetObjectOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContentRange" -> ContentRange.map { x => x.asInstanceOf[js.Any] },
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] },
        "Restore" -> Restore.map { x => x.asInstanceOf[js.Any] },
        "SSEKMSKeyId" -> SSEKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "ReplicationStatus" -> ReplicationStatus.map { x => x.asInstanceOf[js.Any] },
        "ServerSideEncryption" -> ServerSideEncryption.map { x => x.asInstanceOf[js.Any] },
        "MissingMeta" -> MissingMeta.map { x => x.asInstanceOf[js.Any] },
        "ContentEncoding" -> ContentEncoding.map { x => x.asInstanceOf[js.Any] },
        "Expires" -> Expires.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "DeleteMarker" -> DeleteMarker.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "Body" -> Body.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "PartsCount" -> PartsCount.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "ContentLength" -> ContentLength.map { x => x.asInstanceOf[js.Any] },
        "Expiration" -> Expiration.map { x => x.asInstanceOf[js.Any] },
        "ContentLanguage" -> ContentLanguage.map { x => x.asInstanceOf[js.Any] },
        "ContentDisposition" -> ContentDisposition.map { x => x.asInstanceOf[js.Any] },
        "AcceptRanges" -> AcceptRanges.map { x => x.asInstanceOf[js.Any] },
        "TagCount" -> TagCount.map { x => x.asInstanceOf[js.Any] },
        "WebsiteRedirectLocation" -> WebsiteRedirectLocation.map { x => x.asInstanceOf[js.Any] },
        "CacheControl" -> CacheControl.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectOutput]
    }
  }

  @js.native
  trait GetObjectRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var PartNumber: js.UndefOr[PartNumber]
    var ResponseCacheControl: js.UndefOr[ResponseCacheControl]
    var ResponseContentDisposition: js.UndefOr[ResponseContentDisposition]
    var IfUnmodifiedSince: js.UndefOr[IfUnmodifiedSince]
    var ResponseContentEncoding: js.UndefOr[ResponseContentEncoding]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var RequestPayer: js.UndefOr[RequestPayer]
    var IfMatch: js.UndefOr[IfMatch]
    var IfNoneMatch: js.UndefOr[IfNoneMatch]
    var IfModifiedSince: js.UndefOr[IfModifiedSince]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var ResponseContentType: js.UndefOr[ResponseContentType]
    var ResponseExpires: js.UndefOr[ResponseExpires]
    var VersionId: js.UndefOr[ObjectVersionId]
    var ResponseContentLanguage: js.UndefOr[ResponseContentLanguage]
    var Range: js.UndefOr[Range]
    var Key: js.UndefOr[ObjectKey]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
  }

  object GetObjectRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      PartNumber: js.UndefOr[PartNumber] = js.undefined,
      ResponseCacheControl: js.UndefOr[ResponseCacheControl] = js.undefined,
      ResponseContentDisposition: js.UndefOr[ResponseContentDisposition] = js.undefined,
      IfUnmodifiedSince: js.UndefOr[IfUnmodifiedSince] = js.undefined,
      ResponseContentEncoding: js.UndefOr[ResponseContentEncoding] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      IfMatch: js.UndefOr[IfMatch] = js.undefined,
      IfNoneMatch: js.UndefOr[IfNoneMatch] = js.undefined,
      IfModifiedSince: js.UndefOr[IfModifiedSince] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      ResponseContentType: js.UndefOr[ResponseContentType] = js.undefined,
      ResponseExpires: js.UndefOr[ResponseExpires] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      ResponseContentLanguage: js.UndefOr[ResponseContentLanguage] = js.undefined,
      Range: js.UndefOr[Range] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined): GetObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "PartNumber" -> PartNumber.map { x => x.asInstanceOf[js.Any] },
        "ResponseCacheControl" -> ResponseCacheControl.map { x => x.asInstanceOf[js.Any] },
        "ResponseContentDisposition" -> ResponseContentDisposition.map { x => x.asInstanceOf[js.Any] },
        "IfUnmodifiedSince" -> IfUnmodifiedSince.map { x => x.asInstanceOf[js.Any] },
        "ResponseContentEncoding" -> ResponseContentEncoding.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] },
        "IfNoneMatch" -> IfNoneMatch.map { x => x.asInstanceOf[js.Any] },
        "IfModifiedSince" -> IfModifiedSince.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "ResponseContentType" -> ResponseContentType.map { x => x.asInstanceOf[js.Any] },
        "ResponseExpires" -> ResponseExpires.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "ResponseContentLanguage" -> ResponseContentLanguage.map { x => x.asInstanceOf[js.Any] },
        "Range" -> Range.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKey" -> SSECustomerKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectRequest]
    }
  }

  @js.native
  trait GetObjectTaggingOutput extends js.Object {
    var VersionId: js.UndefOr[ObjectVersionId]
    var TagSet: js.UndefOr[TagSet]
  }

  object GetObjectTaggingOutput {
    def apply(
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      TagSet: js.UndefOr[TagSet] = js.undefined): GetObjectTaggingOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "TagSet" -> TagSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectTaggingOutput]
    }
  }

  @js.native
  trait GetObjectTaggingRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Key: js.UndefOr[ObjectKey]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object GetObjectTaggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined): GetObjectTaggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectTaggingRequest]
    }
  }

  @js.native
  trait GetObjectTorrentOutput extends js.Object {
    var Body: js.UndefOr[Body]
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object GetObjectTorrentOutput {
    def apply(
      Body: js.UndefOr[Body] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined): GetObjectTorrentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Body" -> Body.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectTorrentOutput]
    }
  }

  @js.native
  trait GetObjectTorrentRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Key: js.UndefOr[ObjectKey]
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  object GetObjectTorrentRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined): GetObjectTorrentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectTorrentRequest]
    }
  }

  @js.native
  trait GetPublicAccessBlockOutput extends js.Object {
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration]
  }

  object GetPublicAccessBlockOutput {
    def apply(
      PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined): GetPublicAccessBlockOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublicAccessBlockConfiguration" -> PublicAccessBlockConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPublicAccessBlockOutput]
    }
  }

  @js.native
  trait GetPublicAccessBlockRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object GetPublicAccessBlockRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): GetPublicAccessBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPublicAccessBlockRequest]
    }
  }

  @js.native
  trait GlacierJobParameters extends js.Object {
    var Tier: js.UndefOr[Tier]
  }

  object GlacierJobParameters {
    def apply(
      Tier: js.UndefOr[Tier] = js.undefined): GlacierJobParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tier" -> Tier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlacierJobParameters]
    }
  }

  @js.native
  trait Grant extends js.Object {
    var Grantee: js.UndefOr[Grantee]
    var Permission: js.UndefOr[Permission]
  }

  object Grant {
    def apply(
      Grantee: js.UndefOr[Grantee] = js.undefined,
      Permission: js.UndefOr[Permission] = js.undefined): Grant = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Grantee" -> Grantee.map { x => x.asInstanceOf[js.Any] },
        "Permission" -> Permission.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Grant]
    }
  }

  @js.native
  trait Grantee extends js.Object {
    var ID: js.UndefOr[ID]
    var URI: js.UndefOr[URI]
    var EmailAddress: js.UndefOr[EmailAddress]
    var DisplayName: js.UndefOr[DisplayName]
    var Type: js.UndefOr[Type]
  }

  object Grantee {
    def apply(
      ID: js.UndefOr[ID] = js.undefined,
      URI: js.UndefOr[URI] = js.undefined,
      EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
      DisplayName: js.UndefOr[DisplayName] = js.undefined,
      Type: js.UndefOr[Type] = js.undefined): Grantee = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ID" -> ID.map { x => x.asInstanceOf[js.Any] },
        "URI" -> URI.map { x => x.asInstanceOf[js.Any] },
        "EmailAddress" -> EmailAddress.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Grantee]
    }
  }

  @js.native
  trait HeadBucketRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
  }

  object HeadBucketRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined): HeadBucketRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HeadBucketRequest]
    }
  }

  @js.native
  trait HeadObjectOutput extends js.Object {
    var Metadata: js.UndefOr[Metadata]
    var Restore: js.UndefOr[Restore]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ReplicationStatus: js.UndefOr[ReplicationStatus]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var MissingMeta: js.UndefOr[MissingMeta]
    var ContentEncoding: js.UndefOr[ContentEncoding]
    var Expires: js.UndefOr[Expires]
    var LastModified: js.UndefOr[LastModified]
    var DeleteMarker: js.UndefOr[DeleteMarker]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var PartsCount: js.UndefOr[PartsCount]
    var VersionId: js.UndefOr[ObjectVersionId]
    var ContentLength: js.UndefOr[ContentLength]
    var Expiration: js.UndefOr[Expiration]
    var ContentLanguage: js.UndefOr[ContentLanguage]
    var ContentDisposition: js.UndefOr[ContentDisposition]
    var AcceptRanges: js.UndefOr[AcceptRanges]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
    var CacheControl: js.UndefOr[CacheControl]
    var ETag: js.UndefOr[ETag]
    var RequestCharged: js.UndefOr[RequestCharged]
    var ContentType: js.UndefOr[ContentType]
    var StorageClass: js.UndefOr[StorageClass]
  }

  object HeadObjectOutput {
    def apply(
      Metadata: js.UndefOr[Metadata] = js.undefined,
      Restore: js.UndefOr[Restore] = js.undefined,
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      ReplicationStatus: js.UndefOr[ReplicationStatus] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      MissingMeta: js.UndefOr[MissingMeta] = js.undefined,
      ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined,
      Expires: js.UndefOr[Expires] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined,
      DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      PartsCount: js.UndefOr[PartsCount] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      ContentLength: js.UndefOr[ContentLength] = js.undefined,
      Expiration: js.UndefOr[Expiration] = js.undefined,
      ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined,
      ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined,
      AcceptRanges: js.UndefOr[AcceptRanges] = js.undefined,
      WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined,
      CacheControl: js.UndefOr[CacheControl] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined): HeadObjectOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] },
        "Restore" -> Restore.map { x => x.asInstanceOf[js.Any] },
        "SSEKMSKeyId" -> SSEKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "ReplicationStatus" -> ReplicationStatus.map { x => x.asInstanceOf[js.Any] },
        "ServerSideEncryption" -> ServerSideEncryption.map { x => x.asInstanceOf[js.Any] },
        "MissingMeta" -> MissingMeta.map { x => x.asInstanceOf[js.Any] },
        "ContentEncoding" -> ContentEncoding.map { x => x.asInstanceOf[js.Any] },
        "Expires" -> Expires.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "DeleteMarker" -> DeleteMarker.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "PartsCount" -> PartsCount.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "ContentLength" -> ContentLength.map { x => x.asInstanceOf[js.Any] },
        "Expiration" -> Expiration.map { x => x.asInstanceOf[js.Any] },
        "ContentLanguage" -> ContentLanguage.map { x => x.asInstanceOf[js.Any] },
        "ContentDisposition" -> ContentDisposition.map { x => x.asInstanceOf[js.Any] },
        "AcceptRanges" -> AcceptRanges.map { x => x.asInstanceOf[js.Any] },
        "WebsiteRedirectLocation" -> WebsiteRedirectLocation.map { x => x.asInstanceOf[js.Any] },
        "CacheControl" -> CacheControl.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HeadObjectOutput]
    }
  }

  @js.native
  trait HeadObjectRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var PartNumber: js.UndefOr[PartNumber]
    var IfUnmodifiedSince: js.UndefOr[IfUnmodifiedSince]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var RequestPayer: js.UndefOr[RequestPayer]
    var IfMatch: js.UndefOr[IfMatch]
    var IfNoneMatch: js.UndefOr[IfNoneMatch]
    var IfModifiedSince: js.UndefOr[IfModifiedSince]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var VersionId: js.UndefOr[ObjectVersionId]
    var Range: js.UndefOr[Range]
    var Key: js.UndefOr[ObjectKey]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
  }

  object HeadObjectRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      PartNumber: js.UndefOr[PartNumber] = js.undefined,
      IfUnmodifiedSince: js.UndefOr[IfUnmodifiedSince] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      IfMatch: js.UndefOr[IfMatch] = js.undefined,
      IfNoneMatch: js.UndefOr[IfNoneMatch] = js.undefined,
      IfModifiedSince: js.UndefOr[IfModifiedSince] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      Range: js.UndefOr[Range] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined): HeadObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "PartNumber" -> PartNumber.map { x => x.asInstanceOf[js.Any] },
        "IfUnmodifiedSince" -> IfUnmodifiedSince.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] },
        "IfNoneMatch" -> IfNoneMatch.map { x => x.asInstanceOf[js.Any] },
        "IfModifiedSince" -> IfModifiedSince.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "Range" -> Range.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKey" -> SSECustomerKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HeadObjectRequest]
    }
  }

  @js.native
  trait IndexDocument extends js.Object {
    var Suffix: js.UndefOr[Suffix]
  }

  object IndexDocument {
    def apply(
      Suffix: js.UndefOr[Suffix] = js.undefined): IndexDocument = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Suffix" -> Suffix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IndexDocument]
    }
  }

  @js.native
  trait Initiator extends js.Object {
    var ID: js.UndefOr[ID]
    var DisplayName: js.UndefOr[DisplayName]
  }

  object Initiator {
    def apply(
      ID: js.UndefOr[ID] = js.undefined,
      DisplayName: js.UndefOr[DisplayName] = js.undefined): Initiator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ID" -> ID.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Initiator]
    }
  }

  /**
   * <p>Describes the serialization format of the object.</p>
   */
  @js.native
  trait InputSerialization extends js.Object {
    var CSV: js.UndefOr[CSVInput]
    var CompressionType: js.UndefOr[CompressionType]
    var JSON: js.UndefOr[JSONInput]
    var Parquet: js.UndefOr[ParquetInput]
  }

  object InputSerialization {
    def apply(
      CSV: js.UndefOr[CSVInput] = js.undefined,
      CompressionType: js.UndefOr[CompressionType] = js.undefined,
      JSON: js.UndefOr[JSONInput] = js.undefined,
      Parquet: js.UndefOr[ParquetInput] = js.undefined): InputSerialization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CSV" -> CSV.map { x => x.asInstanceOf[js.Any] },
        "CompressionType" -> CompressionType.map { x => x.asInstanceOf[js.Any] },
        "JSON" -> JSON.map { x => x.asInstanceOf[js.Any] },
        "Parquet" -> Parquet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputSerialization]
    }
  }

  @js.native
  trait InventoryConfiguration extends js.Object {
    var Id: js.UndefOr[InventoryId]
    var OptionalFields: js.UndefOr[InventoryOptionalFields]
    var IsEnabled: js.UndefOr[IsEnabled]
    var Schedule: js.UndefOr[InventorySchedule]
    var Destination: js.UndefOr[InventoryDestination]
    var Filter: js.UndefOr[InventoryFilter]
    var IncludedObjectVersions: js.UndefOr[InventoryIncludedObjectVersions]
  }

  object InventoryConfiguration {
    def apply(
      Id: js.UndefOr[InventoryId] = js.undefined,
      OptionalFields: js.UndefOr[InventoryOptionalFields] = js.undefined,
      IsEnabled: js.UndefOr[IsEnabled] = js.undefined,
      Schedule: js.UndefOr[InventorySchedule] = js.undefined,
      Destination: js.UndefOr[InventoryDestination] = js.undefined,
      Filter: js.UndefOr[InventoryFilter] = js.undefined,
      IncludedObjectVersions: js.UndefOr[InventoryIncludedObjectVersions] = js.undefined): InventoryConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "OptionalFields" -> OptionalFields.map { x => x.asInstanceOf[js.Any] },
        "IsEnabled" -> IsEnabled.map { x => x.asInstanceOf[js.Any] },
        "Schedule" -> Schedule.map { x => x.asInstanceOf[js.Any] },
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "IncludedObjectVersions" -> IncludedObjectVersions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryConfiguration]
    }
  }

  @js.native
  trait InventoryDestination extends js.Object {
    var S3BucketDestination: js.UndefOr[InventoryS3BucketDestination]
  }

  object InventoryDestination {
    def apply(
      S3BucketDestination: js.UndefOr[InventoryS3BucketDestination] = js.undefined): InventoryDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3BucketDestination" -> S3BucketDestination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryDestination]
    }
  }

  /**
   * <p>Contains the type of server-side encryption used to encrypt the inventory results.</p>
   */
  @js.native
  trait InventoryEncryption extends js.Object {
    var SSES3: js.UndefOr[SSES3]
    var SSEKMS: js.UndefOr[SSEKMS]
  }

  object InventoryEncryption {
    def apply(
      SSES3: js.UndefOr[SSES3] = js.undefined,
      SSEKMS: js.UndefOr[SSEKMS] = js.undefined): InventoryEncryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SSES3" -> SSES3.map { x => x.asInstanceOf[js.Any] },
        "SSEKMS" -> SSEKMS.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryEncryption]
    }
  }

  @js.native
  trait InventoryFilter extends js.Object {
    var Prefix: js.UndefOr[Prefix]
  }

  object InventoryFilter {
    def apply(
      Prefix: js.UndefOr[Prefix] = js.undefined): InventoryFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryFilter]
    }
  }

  object InventoryFormatEnum {
    val CSV = "CSV"
    val ORC = "ORC"

    val values = IndexedSeq(CSV, ORC)
  }

  object InventoryFrequencyEnum {
    val Daily = "Daily"
    val Weekly = "Weekly"

    val values = IndexedSeq(Daily, Weekly)
  }

  object InventoryIncludedObjectVersionsEnum {
    val All = "All"
    val Current = "Current"

    val values = IndexedSeq(All, Current)
  }

  object InventoryOptionalFieldEnum {
    val Size = "Size"
    val LastModifiedDate = "LastModifiedDate"
    val StorageClass = "StorageClass"
    val ETag = "ETag"
    val IsMultipartUploaded = "IsMultipartUploaded"
    val ReplicationStatus = "ReplicationStatus"
    val EncryptionStatus = "EncryptionStatus"

    val values = IndexedSeq(Size, LastModifiedDate, StorageClass, ETag, IsMultipartUploaded, ReplicationStatus, EncryptionStatus)
  }

  @js.native
  trait InventoryS3BucketDestination extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Format: js.UndefOr[InventoryFormat]
    var AccountId: js.UndefOr[AccountId]
    var Prefix: js.UndefOr[Prefix]
    var Encryption: js.UndefOr[InventoryEncryption]
  }

  object InventoryS3BucketDestination {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Format: js.UndefOr[InventoryFormat] = js.undefined,
      AccountId: js.UndefOr[AccountId] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Encryption: js.UndefOr[InventoryEncryption] = js.undefined): InventoryS3BucketDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryS3BucketDestination]
    }
  }

  @js.native
  trait InventorySchedule extends js.Object {
    var Frequency: js.UndefOr[InventoryFrequency]
  }

  object InventorySchedule {
    def apply(
      Frequency: js.UndefOr[InventoryFrequency] = js.undefined): InventorySchedule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Frequency" -> Frequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventorySchedule]
    }
  }

  @js.native
  trait JSONInput extends js.Object {
    var Type: js.UndefOr[JSONType]
  }

  object JSONInput {
    def apply(
      Type: js.UndefOr[JSONType] = js.undefined): JSONInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JSONInput]
    }
  }

  @js.native
  trait JSONOutput extends js.Object {
    var RecordDelimiter: js.UndefOr[RecordDelimiter]
  }

  object JSONOutput {
    def apply(
      RecordDelimiter: js.UndefOr[RecordDelimiter] = js.undefined): JSONOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordDelimiter" -> RecordDelimiter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JSONOutput]
    }
  }

  object JSONTypeEnum {
    val DOCUMENT = "DOCUMENT"
    val LINES = "LINES"

    val values = IndexedSeq(DOCUMENT, LINES)
  }

  /**
   * <p>A container for specifying the configuration for AWS Lambda notifications.</p>
   */
  @js.native
  trait LambdaFunctionConfiguration extends js.Object {
    var Id: js.UndefOr[NotificationId]
    var LambdaFunctionArn: js.UndefOr[LambdaFunctionArn]
    var Events: js.UndefOr[EventList]
    var Filter: js.UndefOr[NotificationConfigurationFilter]
  }

  object LambdaFunctionConfiguration {
    def apply(
      Id: js.UndefOr[NotificationId] = js.undefined,
      LambdaFunctionArn: js.UndefOr[LambdaFunctionArn] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined,
      Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined): LambdaFunctionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "LambdaFunctionArn" -> LambdaFunctionArn.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionConfiguration]
    }
  }

  @js.native
  trait LifecycleConfiguration extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  object LifecycleConfiguration {
    def apply(
      Rules: js.UndefOr[Rules] = js.undefined): LifecycleConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleConfiguration]
    }
  }

  @js.native
  trait LifecycleExpiration extends js.Object {
    var Date: js.UndefOr[Date]
    var Days: js.UndefOr[Days]
    var ExpiredObjectDeleteMarker: js.UndefOr[ExpiredObjectDeleteMarker]
  }

  object LifecycleExpiration {
    def apply(
      Date: js.UndefOr[Date] = js.undefined,
      Days: js.UndefOr[Days] = js.undefined,
      ExpiredObjectDeleteMarker: js.UndefOr[ExpiredObjectDeleteMarker] = js.undefined): LifecycleExpiration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Date" -> Date.map { x => x.asInstanceOf[js.Any] },
        "Days" -> Days.map { x => x.asInstanceOf[js.Any] },
        "ExpiredObjectDeleteMarker" -> ExpiredObjectDeleteMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleExpiration]
    }
  }

  @js.native
  trait LifecycleRule extends js.Object {
    var Transitions: js.UndefOr[TransitionList]
    var ID: js.UndefOr[ID]
    var NoncurrentVersionTransitions: js.UndefOr[NoncurrentVersionTransitionList]
    var NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration]
    var AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload]
    var Prefix: js.UndefOr[Prefix]
    var Expiration: js.UndefOr[LifecycleExpiration]
    var Filter: js.UndefOr[LifecycleRuleFilter]
    var Status: js.UndefOr[ExpirationStatus]
  }

  object LifecycleRule {
    def apply(
      Transitions: js.UndefOr[TransitionList] = js.undefined,
      ID: js.UndefOr[ID] = js.undefined,
      NoncurrentVersionTransitions: js.UndefOr[NoncurrentVersionTransitionList] = js.undefined,
      NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration] = js.undefined,
      AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Expiration: js.UndefOr[LifecycleExpiration] = js.undefined,
      Filter: js.UndefOr[LifecycleRuleFilter] = js.undefined,
      Status: js.UndefOr[ExpirationStatus] = js.undefined): LifecycleRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Transitions" -> Transitions.map { x => x.asInstanceOf[js.Any] },
        "ID" -> ID.map { x => x.asInstanceOf[js.Any] },
        "NoncurrentVersionTransitions" -> NoncurrentVersionTransitions.map { x => x.asInstanceOf[js.Any] },
        "NoncurrentVersionExpiration" -> NoncurrentVersionExpiration.map { x => x.asInstanceOf[js.Any] },
        "AbortIncompleteMultipartUpload" -> AbortIncompleteMultipartUpload.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Expiration" -> Expiration.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleRule]
    }
  }

  /**
   * <p>This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.</p>
   */
  @js.native
  trait LifecycleRuleAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[TagSet]
  }

  object LifecycleRuleAndOperator {
    def apply(
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Tags: js.UndefOr[TagSet] = js.undefined): LifecycleRuleAndOperator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleRuleAndOperator]
    }
  }

  /**
   * <p>The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.</p>
   */
  @js.native
  trait LifecycleRuleFilter extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[Tag]
    var And: js.UndefOr[LifecycleRuleAndOperator]
  }

  object LifecycleRuleFilter {
    def apply(
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Tag: js.UndefOr[Tag] = js.undefined,
      And: js.UndefOr[LifecycleRuleAndOperator] = js.undefined): LifecycleRuleFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Tag" -> Tag.map { x => x.asInstanceOf[js.Any] },
        "And" -> And.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleRuleFilter]
    }
  }

  @js.native
  trait ListBucketAnalyticsConfigurationsOutput extends js.Object {
    var IsTruncated: js.UndefOr[IsTruncated]
    var ContinuationToken: js.UndefOr[Token]
    var NextContinuationToken: js.UndefOr[NextToken]
    var AnalyticsConfigurationList: js.UndefOr[AnalyticsConfigurationList]
  }

  object ListBucketAnalyticsConfigurationsOutput {
    def apply(
      IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
      ContinuationToken: js.UndefOr[Token] = js.undefined,
      NextContinuationToken: js.UndefOr[NextToken] = js.undefined,
      AnalyticsConfigurationList: js.UndefOr[AnalyticsConfigurationList] = js.undefined): ListBucketAnalyticsConfigurationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "ContinuationToken" -> ContinuationToken.map { x => x.asInstanceOf[js.Any] },
        "NextContinuationToken" -> NextContinuationToken.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsConfigurationList" -> AnalyticsConfigurationList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
    }
  }

  @js.native
  trait ListBucketAnalyticsConfigurationsRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContinuationToken: js.UndefOr[Token]
  }

  object ListBucketAnalyticsConfigurationsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContinuationToken: js.UndefOr[Token] = js.undefined): ListBucketAnalyticsConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContinuationToken" -> ContinuationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBucketAnalyticsConfigurationsRequest]
    }
  }

  @js.native
  trait ListBucketInventoryConfigurationsOutput extends js.Object {
    var ContinuationToken: js.UndefOr[Token]
    var InventoryConfigurationList: js.UndefOr[InventoryConfigurationList]
    var IsTruncated: js.UndefOr[IsTruncated]
    var NextContinuationToken: js.UndefOr[NextToken]
  }

  object ListBucketInventoryConfigurationsOutput {
    def apply(
      ContinuationToken: js.UndefOr[Token] = js.undefined,
      InventoryConfigurationList: js.UndefOr[InventoryConfigurationList] = js.undefined,
      IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
      NextContinuationToken: js.UndefOr[NextToken] = js.undefined): ListBucketInventoryConfigurationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContinuationToken" -> ContinuationToken.map { x => x.asInstanceOf[js.Any] },
        "InventoryConfigurationList" -> InventoryConfigurationList.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "NextContinuationToken" -> NextContinuationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBucketInventoryConfigurationsOutput]
    }
  }

  @js.native
  trait ListBucketInventoryConfigurationsRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContinuationToken: js.UndefOr[Token]
  }

  object ListBucketInventoryConfigurationsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContinuationToken: js.UndefOr[Token] = js.undefined): ListBucketInventoryConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContinuationToken" -> ContinuationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBucketInventoryConfigurationsRequest]
    }
  }

  @js.native
  trait ListBucketMetricsConfigurationsOutput extends js.Object {
    var IsTruncated: js.UndefOr[IsTruncated]
    var ContinuationToken: js.UndefOr[Token]
    var NextContinuationToken: js.UndefOr[NextToken]
    var MetricsConfigurationList: js.UndefOr[MetricsConfigurationList]
  }

  object ListBucketMetricsConfigurationsOutput {
    def apply(
      IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
      ContinuationToken: js.UndefOr[Token] = js.undefined,
      NextContinuationToken: js.UndefOr[NextToken] = js.undefined,
      MetricsConfigurationList: js.UndefOr[MetricsConfigurationList] = js.undefined): ListBucketMetricsConfigurationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "ContinuationToken" -> ContinuationToken.map { x => x.asInstanceOf[js.Any] },
        "NextContinuationToken" -> NextContinuationToken.map { x => x.asInstanceOf[js.Any] },
        "MetricsConfigurationList" -> MetricsConfigurationList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBucketMetricsConfigurationsOutput]
    }
  }

  @js.native
  trait ListBucketMetricsConfigurationsRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContinuationToken: js.UndefOr[Token]
  }

  object ListBucketMetricsConfigurationsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContinuationToken: js.UndefOr[Token] = js.undefined): ListBucketMetricsConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContinuationToken" -> ContinuationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBucketMetricsConfigurationsRequest]
    }
  }

  @js.native
  trait ListBucketsOutput extends js.Object {
    var Buckets: js.UndefOr[Buckets]
    var Owner: js.UndefOr[Owner]
  }

  object ListBucketsOutput {
    def apply(
      Buckets: js.UndefOr[Buckets] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined): ListBucketsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Buckets" -> Buckets.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBucketsOutput]
    }
  }

  @js.native
  trait ListMultipartUploadsOutput extends js.Object {
    var UploadIdMarker: js.UndefOr[UploadIdMarker]
    var Bucket: js.UndefOr[BucketName]
    var NextUploadIdMarker: js.UndefOr[NextUploadIdMarker]
    var NextKeyMarker: js.UndefOr[NextKeyMarker]
    var IsTruncated: js.UndefOr[IsTruncated]
    var CommonPrefixes: js.UndefOr[CommonPrefixList]
    var KeyMarker: js.UndefOr[KeyMarker]
    var Uploads: js.UndefOr[MultipartUploadList]
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var MaxUploads: js.UndefOr[MaxUploads]
    var Prefix: js.UndefOr[Prefix]
  }

  object ListMultipartUploadsOutput {
    def apply(
      UploadIdMarker: js.UndefOr[UploadIdMarker] = js.undefined,
      Bucket: js.UndefOr[BucketName] = js.undefined,
      NextUploadIdMarker: js.UndefOr[NextUploadIdMarker] = js.undefined,
      NextKeyMarker: js.UndefOr[NextKeyMarker] = js.undefined,
      IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
      CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined,
      KeyMarker: js.UndefOr[KeyMarker] = js.undefined,
      Uploads: js.UndefOr[MultipartUploadList] = js.undefined,
      Delimiter: js.UndefOr[Delimiter] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      MaxUploads: js.UndefOr[MaxUploads] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined): ListMultipartUploadsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UploadIdMarker" -> UploadIdMarker.map { x => x.asInstanceOf[js.Any] },
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "NextUploadIdMarker" -> NextUploadIdMarker.map { x => x.asInstanceOf[js.Any] },
        "NextKeyMarker" -> NextKeyMarker.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "CommonPrefixes" -> CommonPrefixes.map { x => x.asInstanceOf[js.Any] },
        "KeyMarker" -> KeyMarker.map { x => x.asInstanceOf[js.Any] },
        "Uploads" -> Uploads.map { x => x.asInstanceOf[js.Any] },
        "Delimiter" -> Delimiter.map { x => x.asInstanceOf[js.Any] },
        "EncodingType" -> EncodingType.map { x => x.asInstanceOf[js.Any] },
        "MaxUploads" -> MaxUploads.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMultipartUploadsOutput]
    }
  }

  @js.native
  trait ListMultipartUploadsRequest extends js.Object {
    var UploadIdMarker: js.UndefOr[UploadIdMarker]
    var Bucket: js.UndefOr[BucketName]
    var KeyMarker: js.UndefOr[KeyMarker]
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var MaxUploads: js.UndefOr[MaxUploads]
    var Prefix: js.UndefOr[Prefix]
  }

  object ListMultipartUploadsRequest {
    def apply(
      UploadIdMarker: js.UndefOr[UploadIdMarker] = js.undefined,
      Bucket: js.UndefOr[BucketName] = js.undefined,
      KeyMarker: js.UndefOr[KeyMarker] = js.undefined,
      Delimiter: js.UndefOr[Delimiter] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      MaxUploads: js.UndefOr[MaxUploads] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined): ListMultipartUploadsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UploadIdMarker" -> UploadIdMarker.map { x => x.asInstanceOf[js.Any] },
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "KeyMarker" -> KeyMarker.map { x => x.asInstanceOf[js.Any] },
        "Delimiter" -> Delimiter.map { x => x.asInstanceOf[js.Any] },
        "EncodingType" -> EncodingType.map { x => x.asInstanceOf[js.Any] },
        "MaxUploads" -> MaxUploads.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMultipartUploadsRequest]
    }
  }

  @js.native
  trait ListObjectVersionsOutput extends js.Object {
    var NextKeyMarker: js.UndefOr[NextKeyMarker]
    var IsTruncated: js.UndefOr[IsTruncated]
    var CommonPrefixes: js.UndefOr[CommonPrefixList]
    var Name: js.UndefOr[BucketName]
    var KeyMarker: js.UndefOr[KeyMarker]
    var Versions: js.UndefOr[ObjectVersionList]
    var Delimiter: js.UndefOr[Delimiter]
    var VersionIdMarker: js.UndefOr[VersionIdMarker]
    var EncodingType: js.UndefOr[EncodingType]
    var DeleteMarkers: js.UndefOr[DeleteMarkers]
    var Prefix: js.UndefOr[Prefix]
    var NextVersionIdMarker: js.UndefOr[NextVersionIdMarker]
    var MaxKeys: js.UndefOr[MaxKeys]
  }

  object ListObjectVersionsOutput {
    def apply(
      NextKeyMarker: js.UndefOr[NextKeyMarker] = js.undefined,
      IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
      CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined,
      Name: js.UndefOr[BucketName] = js.undefined,
      KeyMarker: js.UndefOr[KeyMarker] = js.undefined,
      Versions: js.UndefOr[ObjectVersionList] = js.undefined,
      Delimiter: js.UndefOr[Delimiter] = js.undefined,
      VersionIdMarker: js.UndefOr[VersionIdMarker] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      DeleteMarkers: js.UndefOr[DeleteMarkers] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      NextVersionIdMarker: js.UndefOr[NextVersionIdMarker] = js.undefined,
      MaxKeys: js.UndefOr[MaxKeys] = js.undefined): ListObjectVersionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextKeyMarker" -> NextKeyMarker.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "CommonPrefixes" -> CommonPrefixes.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "KeyMarker" -> KeyMarker.map { x => x.asInstanceOf[js.Any] },
        "Versions" -> Versions.map { x => x.asInstanceOf[js.Any] },
        "Delimiter" -> Delimiter.map { x => x.asInstanceOf[js.Any] },
        "VersionIdMarker" -> VersionIdMarker.map { x => x.asInstanceOf[js.Any] },
        "EncodingType" -> EncodingType.map { x => x.asInstanceOf[js.Any] },
        "DeleteMarkers" -> DeleteMarkers.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "NextVersionIdMarker" -> NextVersionIdMarker.map { x => x.asInstanceOf[js.Any] },
        "MaxKeys" -> MaxKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectVersionsOutput]
    }
  }

  @js.native
  trait ListObjectVersionsRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var KeyMarker: js.UndefOr[KeyMarker]
    var Delimiter: js.UndefOr[Delimiter]
    var VersionIdMarker: js.UndefOr[VersionIdMarker]
    var EncodingType: js.UndefOr[EncodingType]
    var Prefix: js.UndefOr[Prefix]
    var MaxKeys: js.UndefOr[MaxKeys]
  }

  object ListObjectVersionsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      KeyMarker: js.UndefOr[KeyMarker] = js.undefined,
      Delimiter: js.UndefOr[Delimiter] = js.undefined,
      VersionIdMarker: js.UndefOr[VersionIdMarker] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      MaxKeys: js.UndefOr[MaxKeys] = js.undefined): ListObjectVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "KeyMarker" -> KeyMarker.map { x => x.asInstanceOf[js.Any] },
        "Delimiter" -> Delimiter.map { x => x.asInstanceOf[js.Any] },
        "VersionIdMarker" -> VersionIdMarker.map { x => x.asInstanceOf[js.Any] },
        "EncodingType" -> EncodingType.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "MaxKeys" -> MaxKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectVersionsRequest]
    }
  }

  @js.native
  trait ListObjectsOutput extends js.Object {
    var IsTruncated: js.UndefOr[IsTruncated]
    var CommonPrefixes: js.UndefOr[CommonPrefixList]
    var Name: js.UndefOr[BucketName]
    var Delimiter: js.UndefOr[Delimiter]
    var NextMarker: js.UndefOr[NextMarker]
    var EncodingType: js.UndefOr[EncodingType]
    var Contents: js.UndefOr[ObjectList]
    var Prefix: js.UndefOr[Prefix]
    var MaxKeys: js.UndefOr[MaxKeys]
    var Marker: js.UndefOr[Marker]
  }

  object ListObjectsOutput {
    def apply(
      IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
      CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined,
      Name: js.UndefOr[BucketName] = js.undefined,
      Delimiter: js.UndefOr[Delimiter] = js.undefined,
      NextMarker: js.UndefOr[NextMarker] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      Contents: js.UndefOr[ObjectList] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): ListObjectsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "CommonPrefixes" -> CommonPrefixes.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Delimiter" -> Delimiter.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "EncodingType" -> EncodingType.map { x => x.asInstanceOf[js.Any] },
        "Contents" -> Contents.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "MaxKeys" -> MaxKeys.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectsOutput]
    }
  }

  @js.native
  trait ListObjectsRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var RequestPayer: js.UndefOr[RequestPayer]
    var Prefix: js.UndefOr[Prefix]
    var MaxKeys: js.UndefOr[MaxKeys]
    var Marker: js.UndefOr[Marker]
  }

  object ListObjectsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Delimiter: js.UndefOr[Delimiter] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): ListObjectsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Delimiter" -> Delimiter.map { x => x.asInstanceOf[js.Any] },
        "EncodingType" -> EncodingType.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "MaxKeys" -> MaxKeys.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectsRequest]
    }
  }

  @js.native
  trait ListObjectsV2Output extends js.Object {
    var KeyCount: js.UndefOr[KeyCount]
    var IsTruncated: js.UndefOr[IsTruncated]
    var CommonPrefixes: js.UndefOr[CommonPrefixList]
    var Name: js.UndefOr[BucketName]
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var StartAfter: js.UndefOr[StartAfter]
    var Contents: js.UndefOr[ObjectList]
    var NextContinuationToken: js.UndefOr[NextToken]
    var ContinuationToken: js.UndefOr[Token]
    var Prefix: js.UndefOr[Prefix]
    var MaxKeys: js.UndefOr[MaxKeys]
  }

  object ListObjectsV2Output {
    def apply(
      KeyCount: js.UndefOr[KeyCount] = js.undefined,
      IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
      CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined,
      Name: js.UndefOr[BucketName] = js.undefined,
      Delimiter: js.UndefOr[Delimiter] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      StartAfter: js.UndefOr[StartAfter] = js.undefined,
      Contents: js.UndefOr[ObjectList] = js.undefined,
      NextContinuationToken: js.UndefOr[NextToken] = js.undefined,
      ContinuationToken: js.UndefOr[Token] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      MaxKeys: js.UndefOr[MaxKeys] = js.undefined): ListObjectsV2Output = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyCount" -> KeyCount.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "CommonPrefixes" -> CommonPrefixes.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Delimiter" -> Delimiter.map { x => x.asInstanceOf[js.Any] },
        "EncodingType" -> EncodingType.map { x => x.asInstanceOf[js.Any] },
        "StartAfter" -> StartAfter.map { x => x.asInstanceOf[js.Any] },
        "Contents" -> Contents.map { x => x.asInstanceOf[js.Any] },
        "NextContinuationToken" -> NextContinuationToken.map { x => x.asInstanceOf[js.Any] },
        "ContinuationToken" -> ContinuationToken.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "MaxKeys" -> MaxKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectsV2Output]
    }
  }

  @js.native
  trait ListObjectsV2Request extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var RequestPayer: js.UndefOr[RequestPayer]
    var StartAfter: js.UndefOr[StartAfter]
    var ContinuationToken: js.UndefOr[Token]
    var FetchOwner: js.UndefOr[FetchOwner]
    var Prefix: js.UndefOr[Prefix]
    var MaxKeys: js.UndefOr[MaxKeys]
  }

  object ListObjectsV2Request {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Delimiter: js.UndefOr[Delimiter] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      StartAfter: js.UndefOr[StartAfter] = js.undefined,
      ContinuationToken: js.UndefOr[Token] = js.undefined,
      FetchOwner: js.UndefOr[FetchOwner] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      MaxKeys: js.UndefOr[MaxKeys] = js.undefined): ListObjectsV2Request = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Delimiter" -> Delimiter.map { x => x.asInstanceOf[js.Any] },
        "EncodingType" -> EncodingType.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "StartAfter" -> StartAfter.map { x => x.asInstanceOf[js.Any] },
        "ContinuationToken" -> ContinuationToken.map { x => x.asInstanceOf[js.Any] },
        "FetchOwner" -> FetchOwner.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "MaxKeys" -> MaxKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectsV2Request]
    }
  }

  @js.native
  trait ListPartsOutput extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var IsTruncated: js.UndefOr[IsTruncated]
    var PartNumberMarker: js.UndefOr[PartNumberMarker]
    var Initiator: js.UndefOr[Initiator]
    var AbortDate: js.UndefOr[AbortDate]
    var Parts: js.UndefOr[Parts]
    var NextPartNumberMarker: js.UndefOr[NextPartNumberMarker]
    var AbortRuleId: js.UndefOr[AbortRuleId]
    var RequestCharged: js.UndefOr[RequestCharged]
    var Owner: js.UndefOr[Owner]
    var MaxParts: js.UndefOr[MaxParts]
    var StorageClass: js.UndefOr[StorageClass]
    var UploadId: js.UndefOr[MultipartUploadId]
    var Key: js.UndefOr[ObjectKey]
  }

  object ListPartsOutput {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
      PartNumberMarker: js.UndefOr[PartNumberMarker] = js.undefined,
      Initiator: js.UndefOr[Initiator] = js.undefined,
      AbortDate: js.UndefOr[AbortDate] = js.undefined,
      Parts: js.UndefOr[Parts] = js.undefined,
      NextPartNumberMarker: js.UndefOr[NextPartNumberMarker] = js.undefined,
      AbortRuleId: js.UndefOr[AbortRuleId] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined,
      MaxParts: js.UndefOr[MaxParts] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): ListPartsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "PartNumberMarker" -> PartNumberMarker.map { x => x.asInstanceOf[js.Any] },
        "Initiator" -> Initiator.map { x => x.asInstanceOf[js.Any] },
        "AbortDate" -> AbortDate.map { x => x.asInstanceOf[js.Any] },
        "Parts" -> Parts.map { x => x.asInstanceOf[js.Any] },
        "NextPartNumberMarker" -> NextPartNumberMarker.map { x => x.asInstanceOf[js.Any] },
        "AbortRuleId" -> AbortRuleId.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "MaxParts" -> MaxParts.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] },
        "UploadId" -> UploadId.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPartsOutput]
    }
  }

  @js.native
  trait ListPartsRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var PartNumberMarker: js.UndefOr[PartNumberMarker]
    var RequestPayer: js.UndefOr[RequestPayer]
    var MaxParts: js.UndefOr[MaxParts]
    var UploadId: js.UndefOr[MultipartUploadId]
    var Key: js.UndefOr[ObjectKey]
  }

  object ListPartsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      PartNumberMarker: js.UndefOr[PartNumberMarker] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      MaxParts: js.UndefOr[MaxParts] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): ListPartsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "PartNumberMarker" -> PartNumberMarker.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "MaxParts" -> MaxParts.map { x => x.asInstanceOf[js.Any] },
        "UploadId" -> UploadId.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPartsRequest]
    }
  }

  /**
   * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
   */
  @js.native
  trait LoggingEnabled extends js.Object {
    var TargetBucket: js.UndefOr[TargetBucket]
    var TargetGrants: js.UndefOr[TargetGrants]
    var TargetPrefix: js.UndefOr[TargetPrefix]
  }

  object LoggingEnabled {
    def apply(
      TargetBucket: js.UndefOr[TargetBucket] = js.undefined,
      TargetGrants: js.UndefOr[TargetGrants] = js.undefined,
      TargetPrefix: js.UndefOr[TargetPrefix] = js.undefined): LoggingEnabled = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetBucket" -> TargetBucket.map { x => x.asInstanceOf[js.Any] },
        "TargetGrants" -> TargetGrants.map { x => x.asInstanceOf[js.Any] },
        "TargetPrefix" -> TargetPrefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggingEnabled]
    }
  }

  object MFADeleteEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  object MFADeleteStatusEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  object MetadataDirectiveEnum {
    val COPY = "COPY"
    val REPLACE = "REPLACE"

    val values = IndexedSeq(COPY, REPLACE)
  }

  /**
   * <p>A metadata key-value pair to store with an object.</p>
   */
  @js.native
  trait MetadataEntry extends js.Object {
    var Name: js.UndefOr[MetadataKey]
    var Value: js.UndefOr[MetadataValue]
  }

  object MetadataEntry {
    def apply(
      Name: js.UndefOr[MetadataKey] = js.undefined,
      Value: js.UndefOr[MetadataValue] = js.undefined): MetadataEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetadataEntry]
    }
  }

  @js.native
  trait MetricsAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[TagSet]
  }

  object MetricsAndOperator {
    def apply(
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Tags: js.UndefOr[TagSet] = js.undefined): MetricsAndOperator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricsAndOperator]
    }
  }

  @js.native
  trait MetricsConfiguration extends js.Object {
    var Id: js.UndefOr[MetricsId]
    var Filter: js.UndefOr[MetricsFilter]
  }

  object MetricsConfiguration {
    def apply(
      Id: js.UndefOr[MetricsId] = js.undefined,
      Filter: js.UndefOr[MetricsFilter] = js.undefined): MetricsConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricsConfiguration]
    }
  }

  @js.native
  trait MetricsFilter extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[Tag]
    var And: js.UndefOr[MetricsAndOperator]
  }

  object MetricsFilter {
    def apply(
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Tag: js.UndefOr[Tag] = js.undefined,
      And: js.UndefOr[MetricsAndOperator] = js.undefined): MetricsFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Tag" -> Tag.map { x => x.asInstanceOf[js.Any] },
        "And" -> And.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricsFilter]
    }
  }

  @js.native
  trait MultipartUpload extends js.Object {
    var Initiator: js.UndefOr[Initiator]
    var Initiated: js.UndefOr[Initiated]
    var Owner: js.UndefOr[Owner]
    var StorageClass: js.UndefOr[StorageClass]
    var UploadId: js.UndefOr[MultipartUploadId]
    var Key: js.UndefOr[ObjectKey]
  }

  object MultipartUpload {
    def apply(
      Initiator: js.UndefOr[Initiator] = js.undefined,
      Initiated: js.UndefOr[Initiated] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): MultipartUpload = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Initiator" -> Initiator.map { x => x.asInstanceOf[js.Any] },
        "Initiated" -> Initiated.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] },
        "UploadId" -> UploadId.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MultipartUpload]
    }
  }

  /**
   * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
   */
  @js.native
  trait NoncurrentVersionExpiration extends js.Object {
    var NoncurrentDays: js.UndefOr[Days]
  }

  object NoncurrentVersionExpiration {
    def apply(
      NoncurrentDays: js.UndefOr[Days] = js.undefined): NoncurrentVersionExpiration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NoncurrentDays" -> NoncurrentDays.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NoncurrentVersionExpiration]
    }
  }

  /**
   * <p>Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA, or GLACIER storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA, or GLACIER storage class at a specific period in the object's lifetime.</p>
   */
  @js.native
  trait NoncurrentVersionTransition extends js.Object {
    var NoncurrentDays: js.UndefOr[Days]
    var StorageClass: js.UndefOr[TransitionStorageClass]
  }

  object NoncurrentVersionTransition {
    def apply(
      NoncurrentDays: js.UndefOr[Days] = js.undefined,
      StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined): NoncurrentVersionTransition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NoncurrentDays" -> NoncurrentDays.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NoncurrentVersionTransition]
    }
  }

  /**
   * <p>A container for specifying the notification configuration of the bucket. If this element is empty, notifications are turned off for the bucket.</p>
   */
  @js.native
  trait NotificationConfiguration extends js.Object {
    var TopicConfigurations: js.UndefOr[TopicConfigurationList]
    var QueueConfigurations: js.UndefOr[QueueConfigurationList]
    var LambdaFunctionConfigurations: js.UndefOr[LambdaFunctionConfigurationList]
  }

  object NotificationConfiguration {
    def apply(
      TopicConfigurations: js.UndefOr[TopicConfigurationList] = js.undefined,
      QueueConfigurations: js.UndefOr[QueueConfigurationList] = js.undefined,
      LambdaFunctionConfigurations: js.UndefOr[LambdaFunctionConfigurationList] = js.undefined): NotificationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicConfigurations" -> TopicConfigurations.map { x => x.asInstanceOf[js.Any] },
        "QueueConfigurations" -> QueueConfigurations.map { x => x.asInstanceOf[js.Any] },
        "LambdaFunctionConfigurations" -> LambdaFunctionConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationConfiguration]
    }
  }

  @js.native
  trait NotificationConfigurationDeprecated extends js.Object {
    var TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated]
    var QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated]
    var CloudFunctionConfiguration: js.UndefOr[CloudFunctionConfiguration]
  }

  object NotificationConfigurationDeprecated {
    def apply(
      TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated] = js.undefined,
      QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated] = js.undefined,
      CloudFunctionConfiguration: js.UndefOr[CloudFunctionConfiguration] = js.undefined): NotificationConfigurationDeprecated = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicConfiguration" -> TopicConfiguration.map { x => x.asInstanceOf[js.Any] },
        "QueueConfiguration" -> QueueConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CloudFunctionConfiguration" -> CloudFunctionConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationConfigurationDeprecated]
    }
  }

  /**
   * <p>A container for object key name filtering rules. For information about key name filtering, see <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
   */
  @js.native
  trait NotificationConfigurationFilter extends js.Object {
    var Key: js.UndefOr[S3KeyFilter]
  }

  object NotificationConfigurationFilter {
    def apply(
      Key: js.UndefOr[S3KeyFilter] = js.undefined): NotificationConfigurationFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationConfigurationFilter]
    }
  }

  @js.native
  trait Object extends js.Object {
    var Size: js.UndefOr[Size]
    var LastModified: js.UndefOr[LastModified]
    var ETag: js.UndefOr[ETag]
    var Owner: js.UndefOr[Owner]
    var StorageClass: js.UndefOr[ObjectStorageClass]
    var Key: js.UndefOr[ObjectKey]
  }

  object Object {
    def apply(
      Size: js.UndefOr[Size] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined,
      StorageClass: js.UndefOr[ObjectStorageClass] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): Object = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Object]
    }
  }

  object ObjectCannedACLEnum {
    val `private` = "private"
    val `public-read` = "public-read"
    val `public-read-write` = "public-read-write"
    val `authenticated-read` = "authenticated-read"
    val `aws-exec-read` = "aws-exec-read"
    val `bucket-owner-read` = "bucket-owner-read"
    val `bucket-owner-full-control` = "bucket-owner-full-control"

    val values = IndexedSeq(`private`, `public-read`, `public-read-write`, `authenticated-read`, `aws-exec-read`, `bucket-owner-read`, `bucket-owner-full-control`)
  }

  @js.native
  trait ObjectIdentifier extends js.Object {
    var Key: js.UndefOr[ObjectKey]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object ObjectIdentifier {
    def apply(
      Key: js.UndefOr[ObjectKey] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined): ObjectIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectIdentifier]
    }
  }

  object ObjectStorageClassEnum {
    val STANDARD = "STANDARD"
    val REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY"
    val GLACIER = "GLACIER"
    val STANDARD_IA = "STANDARD_IA"
    val ONEZONE_IA = "ONEZONE_IA"

    val values = IndexedSeq(STANDARD, REDUCED_REDUNDANCY, GLACIER, STANDARD_IA, ONEZONE_IA)
  }

  @js.native
  trait ObjectVersion extends js.Object {
    var Size: js.UndefOr[Size]
    var LastModified: js.UndefOr[LastModified]
    var IsLatest: js.UndefOr[IsLatest]
    var VersionId: js.UndefOr[ObjectVersionId]
    var ETag: js.UndefOr[ETag]
    var Owner: js.UndefOr[Owner]
    var StorageClass: js.UndefOr[ObjectVersionStorageClass]
    var Key: js.UndefOr[ObjectKey]
  }

  object ObjectVersion {
    def apply(
      Size: js.UndefOr[Size] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined,
      IsLatest: js.UndefOr[IsLatest] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined,
      StorageClass: js.UndefOr[ObjectVersionStorageClass] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): ObjectVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "IsLatest" -> IsLatest.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectVersion]
    }
  }

  object ObjectVersionStorageClassEnum {
    val STANDARD = "STANDARD"

    val values = IndexedSeq(STANDARD)
  }

  /**
   * <p>Describes the location where the restore job's output is stored.</p>
   */
  @js.native
  trait OutputLocation extends js.Object {
    var S3: js.UndefOr[S3Location]
  }

  object OutputLocation {
    def apply(
      S3: js.UndefOr[S3Location] = js.undefined): OutputLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3" -> S3.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputLocation]
    }
  }

  /**
   * <p>Describes how results of the Select job are serialized.</p>
   */
  @js.native
  trait OutputSerialization extends js.Object {
    var CSV: js.UndefOr[CSVOutput]
    var JSON: js.UndefOr[JSONOutput]
  }

  object OutputSerialization {
    def apply(
      CSV: js.UndefOr[CSVOutput] = js.undefined,
      JSON: js.UndefOr[JSONOutput] = js.undefined): OutputSerialization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CSV" -> CSV.map { x => x.asInstanceOf[js.Any] },
        "JSON" -> JSON.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputSerialization]
    }
  }

  @js.native
  trait Owner extends js.Object {
    var DisplayName: js.UndefOr[DisplayName]
    var ID: js.UndefOr[ID]
  }

  object Owner {
    def apply(
      DisplayName: js.UndefOr[DisplayName] = js.undefined,
      ID: js.UndefOr[ID] = js.undefined): Owner = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "ID" -> ID.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Owner]
    }
  }

  object OwnerOverrideEnum {
    val Destination = "Destination"

    val values = IndexedSeq(Destination)
  }

  @js.native
  trait ParquetInput extends js.Object {

  }

  object ParquetInput {
    def apply(): ParquetInput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParquetInput]
    }
  }

  @js.native
  trait Part extends js.Object {
    var PartNumber: js.UndefOr[PartNumber]
    var LastModified: js.UndefOr[LastModified]
    var ETag: js.UndefOr[ETag]
    var Size: js.UndefOr[Size]
  }

  object Part {
    def apply(
      PartNumber: js.UndefOr[PartNumber] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      Size: js.UndefOr[Size] = js.undefined): Part = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PartNumber" -> PartNumber.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Part]
    }
  }

  object PayerEnum {
    val Requester = "Requester"
    val BucketOwner = "BucketOwner"

    val values = IndexedSeq(Requester, BucketOwner)
  }

  object PermissionEnum {
    val FULL_CONTROL = "FULL_CONTROL"
    val WRITE = "WRITE"
    val WRITE_ACP = "WRITE_ACP"
    val READ = "READ"
    val READ_ACP = "READ_ACP"

    val values = IndexedSeq(FULL_CONTROL, WRITE, WRITE_ACP, READ, READ_ACP)
  }

  /**
   * <p>The container element for this bucket's public-policy status.</p>
   */
  @js.native
  trait PolicyStatus extends js.Object {
    var IsPublic: js.UndefOr[IsPublic]
  }

  object PolicyStatus {
    def apply(
      IsPublic: js.UndefOr[IsPublic] = js.undefined): PolicyStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsPublic" -> IsPublic.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyStatus]
    }
  }

  @js.native
  trait Progress extends js.Object {
    var BytesScanned: js.UndefOr[BytesScanned]
    var BytesProcessed: js.UndefOr[BytesProcessed]
    var BytesReturned: js.UndefOr[BytesReturned]
  }

  object Progress {
    def apply(
      BytesScanned: js.UndefOr[BytesScanned] = js.undefined,
      BytesProcessed: js.UndefOr[BytesProcessed] = js.undefined,
      BytesReturned: js.UndefOr[BytesReturned] = js.undefined): Progress = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BytesScanned" -> BytesScanned.map { x => x.asInstanceOf[js.Any] },
        "BytesProcessed" -> BytesProcessed.map { x => x.asInstanceOf[js.Any] },
        "BytesReturned" -> BytesReturned.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Progress]
    }
  }

  @js.native
  trait ProgressEvent extends js.Object {
    var Details: js.UndefOr[Progress]
  }

  object ProgressEvent {
    def apply(
      Details: js.UndefOr[Progress] = js.undefined): ProgressEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProgressEvent]
    }
  }

  object ProtocolEnum {
    val http = "http"
    val https = "https"

    val values = IndexedSeq(http, https)
  }

  /**
   * <p>The container element for all Public Access Block configuration options. You can enable the configuration options in any combination.</p> <p>Amazon S3 considers a bucket policy public unless at least one of the following conditions is true:</p> <ol> <li> <p>The policy limits access to a set of CIDRs using <code>aws:SourceIp</code>. For more information on CIDR, see <a href="http://www.rfc-editor.org/rfc/rfc4632.txt">http://www.rfc-editor.org/rfc/rfc4632.txt</a> </p> </li> <li> <p>The policy grants permissions, not including any "bad actions," to one of the following:</p> <ul> <li> <p>A fixed AWS principal, user, role, or service principal</p> </li> <li> <p>A fixed <code>aws:SourceArn</code> </p> </li> <li> <p>A fixed <code>aws:SourceVpc</code> </p> </li> <li> <p>A fixed <code>aws:SourceVpce</code> </p> </li> <li> <p>A fixed <code>aws:SourceOwner</code> </p> </li> <li> <p>A fixed <code>aws:SourceAccount</code> </p> </li> <li> <p>A fixed value of <code>s3:x-amz-server-side-encryption-aws-kms-key-id</code> </p> </li> <li> <p>A fixed value of <code>aws:userid</code> outside the pattern "<code>AROLEID:*</code>"</p> </li> </ul> </li> </ol> <p>"Bad actions" are those that could expose the data inside a bucket to reads or writes by the public. These actions are <code>s3:Get*</code>, <code>s3:List*</code>, <code>s3:AbortMultipartUpload</code>, <code>s3:Delete*</code>, <code>s3:Put*</code>, and <code>s3:RestoreObject</code>.</p> <p>The star notation for bad actions indicates that all matching operations are considered bad actions. For example, because <code>s3:Get*</code> is a bad action, <code>s3:GetObject</code>, <code>s3:GetObjectVersion</code>, and <code>s3:GetObjectAcl</code> are all bad actions.</p>
   */
  @js.native
  trait PublicAccessBlockConfiguration extends js.Object {
    var BlockPublicAcls: js.UndefOr[Setting]
    var IgnorePublicAcls: js.UndefOr[Setting]
    var BlockPublicPolicy: js.UndefOr[Setting]
    var RestrictPublicBuckets: js.UndefOr[Setting]
  }

  object PublicAccessBlockConfiguration {
    def apply(
      BlockPublicAcls: js.UndefOr[Setting] = js.undefined,
      IgnorePublicAcls: js.UndefOr[Setting] = js.undefined,
      BlockPublicPolicy: js.UndefOr[Setting] = js.undefined,
      RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined): PublicAccessBlockConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BlockPublicAcls" -> BlockPublicAcls.map { x => x.asInstanceOf[js.Any] },
        "IgnorePublicAcls" -> IgnorePublicAcls.map { x => x.asInstanceOf[js.Any] },
        "BlockPublicPolicy" -> BlockPublicPolicy.map { x => x.asInstanceOf[js.Any] },
        "RestrictPublicBuckets" -> RestrictPublicBuckets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicAccessBlockConfiguration]
    }
  }

  @js.native
  trait PutBucketAccelerateConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var AccelerateConfiguration: js.UndefOr[AccelerateConfiguration]
  }

  object PutBucketAccelerateConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      AccelerateConfiguration: js.UndefOr[AccelerateConfiguration] = js.undefined): PutBucketAccelerateConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "AccelerateConfiguration" -> AccelerateConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketAccelerateConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketAclRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var GrantWrite: js.UndefOr[GrantWrite]
    var GrantFullControl: js.UndefOr[GrantFullControl]
    var AccessControlPolicy: js.UndefOr[AccessControlPolicy]
    var GrantWriteACP: js.UndefOr[GrantWriteACP]
    var ACL: js.UndefOr[BucketCannedACL]
    var GrantReadACP: js.UndefOr[GrantReadACP]
    var GrantRead: js.UndefOr[GrantRead]
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutBucketAclRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      GrantWrite: js.UndefOr[GrantWrite] = js.undefined,
      GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
      AccessControlPolicy: js.UndefOr[AccessControlPolicy] = js.undefined,
      GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined,
      ACL: js.UndefOr[BucketCannedACL] = js.undefined,
      GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
      GrantRead: js.UndefOr[GrantRead] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined): PutBucketAclRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "GrantWrite" -> GrantWrite.map { x => x.asInstanceOf[js.Any] },
        "GrantFullControl" -> GrantFullControl.map { x => x.asInstanceOf[js.Any] },
        "AccessControlPolicy" -> AccessControlPolicy.map { x => x.asInstanceOf[js.Any] },
        "GrantWriteACP" -> GrantWriteACP.map { x => x.asInstanceOf[js.Any] },
        "ACL" -> ACL.map { x => x.asInstanceOf[js.Any] },
        "GrantReadACP" -> GrantReadACP.map { x => x.asInstanceOf[js.Any] },
        "GrantRead" -> GrantRead.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketAclRequest]
    }
  }

  @js.native
  trait PutBucketAnalyticsConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Id: js.UndefOr[AnalyticsId]
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfiguration]
  }

  object PutBucketAnalyticsConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Id: js.UndefOr[AnalyticsId] = js.undefined,
      AnalyticsConfiguration: js.UndefOr[AnalyticsConfiguration] = js.undefined): PutBucketAnalyticsConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "AnalyticsConfiguration" -> AnalyticsConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketAnalyticsConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketCorsRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var CORSConfiguration: js.UndefOr[CORSConfiguration]
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutBucketCorsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      CORSConfiguration: js.UndefOr[CORSConfiguration] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined): PutBucketCorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "CORSConfiguration" -> CORSConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketCorsRequest]
    }
  }

  @js.native
  trait PutBucketEncryptionRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContentMD5: js.UndefOr[ContentMD5]
    var ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
  }

  object PutBucketEncryptionRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined): PutBucketEncryptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "ServerSideEncryptionConfiguration" -> ServerSideEncryptionConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketEncryptionRequest]
    }
  }

  @js.native
  trait PutBucketInventoryConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Id: js.UndefOr[InventoryId]
    var InventoryConfiguration: js.UndefOr[InventoryConfiguration]
  }

  object PutBucketInventoryConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Id: js.UndefOr[InventoryId] = js.undefined,
      InventoryConfiguration: js.UndefOr[InventoryConfiguration] = js.undefined): PutBucketInventoryConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "InventoryConfiguration" -> InventoryConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketInventoryConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketLifecycleConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var LifecycleConfiguration: js.UndefOr[BucketLifecycleConfiguration]
  }

  object PutBucketLifecycleConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      LifecycleConfiguration: js.UndefOr[BucketLifecycleConfiguration] = js.undefined): PutBucketLifecycleConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "LifecycleConfiguration" -> LifecycleConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketLifecycleConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketLifecycleRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContentMD5: js.UndefOr[ContentMD5]
    var LifecycleConfiguration: js.UndefOr[LifecycleConfiguration]
  }

  object PutBucketLifecycleRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      LifecycleConfiguration: js.UndefOr[LifecycleConfiguration] = js.undefined): PutBucketLifecycleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "LifecycleConfiguration" -> LifecycleConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketLifecycleRequest]
    }
  }

  @js.native
  trait PutBucketLoggingRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var BucketLoggingStatus: js.UndefOr[BucketLoggingStatus]
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutBucketLoggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      BucketLoggingStatus: js.UndefOr[BucketLoggingStatus] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined): PutBucketLoggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "BucketLoggingStatus" -> BucketLoggingStatus.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketLoggingRequest]
    }
  }

  @js.native
  trait PutBucketMetricsConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Id: js.UndefOr[MetricsId]
    var MetricsConfiguration: js.UndefOr[MetricsConfiguration]
  }

  object PutBucketMetricsConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Id: js.UndefOr[MetricsId] = js.undefined,
      MetricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined): PutBucketMetricsConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "MetricsConfiguration" -> MetricsConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketMetricsConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketNotificationConfigurationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var NotificationConfiguration: js.UndefOr[NotificationConfiguration]
  }

  object PutBucketNotificationConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined): PutBucketNotificationConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfiguration" -> NotificationConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketNotificationConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketNotificationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContentMD5: js.UndefOr[ContentMD5]
    var NotificationConfiguration: js.UndefOr[NotificationConfigurationDeprecated]
  }

  object PutBucketNotificationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      NotificationConfiguration: js.UndefOr[NotificationConfigurationDeprecated] = js.undefined): PutBucketNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "NotificationConfiguration" -> NotificationConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketNotificationRequest]
    }
  }

  @js.native
  trait PutBucketPolicyRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContentMD5: js.UndefOr[ContentMD5]
    var ConfirmRemoveSelfBucketAccess: js.UndefOr[ConfirmRemoveSelfBucketAccess]
    var Policy: js.UndefOr[Policy]
  }

  object PutBucketPolicyRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      ConfirmRemoveSelfBucketAccess: js.UndefOr[ConfirmRemoveSelfBucketAccess] = js.undefined,
      Policy: js.UndefOr[Policy] = js.undefined): PutBucketPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "ConfirmRemoveSelfBucketAccess" -> ConfirmRemoveSelfBucketAccess.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketPolicyRequest]
    }
  }

  @js.native
  trait PutBucketReplicationRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContentMD5: js.UndefOr[ContentMD5]
    var ReplicationConfiguration: js.UndefOr[ReplicationConfiguration]
  }

  object PutBucketReplicationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      ReplicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.undefined): PutBucketReplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "ReplicationConfiguration" -> ReplicationConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketReplicationRequest]
    }
  }

  @js.native
  trait PutBucketRequestPaymentRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContentMD5: js.UndefOr[ContentMD5]
    var RequestPaymentConfiguration: js.UndefOr[RequestPaymentConfiguration]
  }

  object PutBucketRequestPaymentRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      RequestPaymentConfiguration: js.UndefOr[RequestPaymentConfiguration] = js.undefined): PutBucketRequestPaymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "RequestPaymentConfiguration" -> RequestPaymentConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketRequestPaymentRequest]
    }
  }

  @js.native
  trait PutBucketTaggingRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContentMD5: js.UndefOr[ContentMD5]
    var Tagging: js.UndefOr[Tagging]
  }

  object PutBucketTaggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      Tagging: js.UndefOr[Tagging] = js.undefined): PutBucketTaggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "Tagging" -> Tagging.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketTaggingRequest]
    }
  }

  @js.native
  trait PutBucketVersioningRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContentMD5: js.UndefOr[ContentMD5]
    var MFA: js.UndefOr[MFA]
    var VersioningConfiguration: js.UndefOr[VersioningConfiguration]
  }

  object PutBucketVersioningRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      MFA: js.UndefOr[MFA] = js.undefined,
      VersioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined): PutBucketVersioningRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "MFA" -> MFA.map { x => x.asInstanceOf[js.Any] },
        "VersioningConfiguration" -> VersioningConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketVersioningRequest]
    }
  }

  @js.native
  trait PutBucketWebsiteRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContentMD5: js.UndefOr[ContentMD5]
    var WebsiteConfiguration: js.UndefOr[WebsiteConfiguration]
  }

  object PutBucketWebsiteRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      WebsiteConfiguration: js.UndefOr[WebsiteConfiguration] = js.undefined): PutBucketWebsiteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "WebsiteConfiguration" -> WebsiteConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketWebsiteRequest]
    }
  }

  @js.native
  trait PutObjectAclOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object PutObjectAclOutput {
    def apply(
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined): PutObjectAclOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutObjectAclOutput]
    }
  }

  @js.native
  trait PutObjectAclRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var GrantWrite: js.UndefOr[GrantWrite]
    var GrantFullControl: js.UndefOr[GrantFullControl]
    var AccessControlPolicy: js.UndefOr[AccessControlPolicy]
    var GrantWriteACP: js.UndefOr[GrantWriteACP]
    var ACL: js.UndefOr[ObjectCannedACL]
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
    var GrantReadACP: js.UndefOr[GrantReadACP]
    var GrantRead: js.UndefOr[GrantRead]
    var ContentMD5: js.UndefOr[ContentMD5]
    var Key: js.UndefOr[ObjectKey]
  }

  object PutObjectAclRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      GrantWrite: js.UndefOr[GrantWrite] = js.undefined,
      GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
      AccessControlPolicy: js.UndefOr[AccessControlPolicy] = js.undefined,
      GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined,
      ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
      GrantRead: js.UndefOr[GrantRead] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): PutObjectAclRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "GrantWrite" -> GrantWrite.map { x => x.asInstanceOf[js.Any] },
        "GrantFullControl" -> GrantFullControl.map { x => x.asInstanceOf[js.Any] },
        "AccessControlPolicy" -> AccessControlPolicy.map { x => x.asInstanceOf[js.Any] },
        "GrantWriteACP" -> GrantWriteACP.map { x => x.asInstanceOf[js.Any] },
        "ACL" -> ACL.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "GrantReadACP" -> GrantReadACP.map { x => x.asInstanceOf[js.Any] },
        "GrantRead" -> GrantRead.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutObjectAclRequest]
    }
  }

  @js.native
  trait PutObjectOutput extends js.Object {
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var VersionId: js.UndefOr[ObjectVersionId]
    var Expiration: js.UndefOr[Expiration]
    var ETag: js.UndefOr[ETag]
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object PutObjectOutput {
    def apply(
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      Expiration: js.UndefOr[Expiration] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined): PutObjectOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SSEKMSKeyId" -> SSEKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "ServerSideEncryption" -> ServerSideEncryption.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "Expiration" -> Expiration.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutObjectOutput]
    }
  }

  @js.native
  trait PutObjectRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Metadata: js.UndefOr[Metadata]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var GrantFullControl: js.UndefOr[GrantFullControl]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var GrantWriteACP: js.UndefOr[GrantWriteACP]
    var ContentEncoding: js.UndefOr[ContentEncoding]
    var ACL: js.UndefOr[ObjectCannedACL]
    var Expires: js.UndefOr[Expires]
    var Tagging: js.UndefOr[TaggingHeader]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var RequestPayer: js.UndefOr[RequestPayer]
    var Body: js.UndefOr[Body]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var ContentLength: js.UndefOr[ContentLength]
    var GrantReadACP: js.UndefOr[GrantReadACP]
    var ContentLanguage: js.UndefOr[ContentLanguage]
    var ContentDisposition: js.UndefOr[ContentDisposition]
    var GrantRead: js.UndefOr[GrantRead]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
    var ContentMD5: js.UndefOr[ContentMD5]
    var CacheControl: js.UndefOr[CacheControl]
    var ContentType: js.UndefOr[ContentType]
    var StorageClass: js.UndefOr[StorageClass]
    var Key: js.UndefOr[ObjectKey]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
  }

  object PutObjectRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Metadata: js.UndefOr[Metadata] = js.undefined,
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined,
      ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined,
      ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
      Expires: js.UndefOr[Expires] = js.undefined,
      Tagging: js.UndefOr[TaggingHeader] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      Body: js.UndefOr[Body] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      ContentLength: js.UndefOr[ContentLength] = js.undefined,
      GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
      ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined,
      ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined,
      GrantRead: js.UndefOr[GrantRead] = js.undefined,
      WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      CacheControl: js.UndefOr[CacheControl] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined): PutObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] },
        "SSEKMSKeyId" -> SSEKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "GrantFullControl" -> GrantFullControl.map { x => x.asInstanceOf[js.Any] },
        "ServerSideEncryption" -> ServerSideEncryption.map { x => x.asInstanceOf[js.Any] },
        "GrantWriteACP" -> GrantWriteACP.map { x => x.asInstanceOf[js.Any] },
        "ContentEncoding" -> ContentEncoding.map { x => x.asInstanceOf[js.Any] },
        "ACL" -> ACL.map { x => x.asInstanceOf[js.Any] },
        "Expires" -> Expires.map { x => x.asInstanceOf[js.Any] },
        "Tagging" -> Tagging.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "Body" -> Body.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "ContentLength" -> ContentLength.map { x => x.asInstanceOf[js.Any] },
        "GrantReadACP" -> GrantReadACP.map { x => x.asInstanceOf[js.Any] },
        "ContentLanguage" -> ContentLanguage.map { x => x.asInstanceOf[js.Any] },
        "ContentDisposition" -> ContentDisposition.map { x => x.asInstanceOf[js.Any] },
        "GrantRead" -> GrantRead.map { x => x.asInstanceOf[js.Any] },
        "WebsiteRedirectLocation" -> WebsiteRedirectLocation.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "CacheControl" -> CacheControl.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKey" -> SSECustomerKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutObjectRequest]
    }
  }

  @js.native
  trait PutObjectTaggingOutput extends js.Object {
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object PutObjectTaggingOutput {
    def apply(
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined): PutObjectTaggingOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutObjectTaggingOutput]
    }
  }

  @js.native
  trait PutObjectTaggingRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var Tagging: js.UndefOr[Tagging]
    var VersionId: js.UndefOr[ObjectVersionId]
    var ContentMD5: js.UndefOr[ContentMD5]
    var Key: js.UndefOr[ObjectKey]
  }

  object PutObjectTaggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Tagging: js.UndefOr[Tagging] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): PutObjectTaggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "Tagging" -> Tagging.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutObjectTaggingRequest]
    }
  }

  @js.native
  trait PutPublicAccessBlockRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ContentMD5: js.UndefOr[ContentMD5]
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration]
  }

  object PutPublicAccessBlockRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined): PutPublicAccessBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "PublicAccessBlockConfiguration" -> PublicAccessBlockConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutPublicAccessBlockRequest]
    }
  }

  /**
   * <p>A container for specifying the configuration for publication of messages to an Amazon Simple Queue Service (Amazon SQS) queue.when Amazon S3 detects specified events.</p>
   */
  @js.native
  trait QueueConfiguration extends js.Object {
    var Id: js.UndefOr[NotificationId]
    var QueueArn: js.UndefOr[QueueArn]
    var Events: js.UndefOr[EventList]
    var Filter: js.UndefOr[NotificationConfigurationFilter]
  }

  object QueueConfiguration {
    def apply(
      Id: js.UndefOr[NotificationId] = js.undefined,
      QueueArn: js.UndefOr[QueueArn] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined,
      Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined): QueueConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "QueueArn" -> QueueArn.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueueConfiguration]
    }
  }

  @js.native
  trait QueueConfigurationDeprecated extends js.Object {
    var Id: js.UndefOr[NotificationId]
    var Event: js.UndefOr[Event]
    var Events: js.UndefOr[EventList]
    var Queue: js.UndefOr[QueueArn]
  }

  object QueueConfigurationDeprecated {
    def apply(
      Id: js.UndefOr[NotificationId] = js.undefined,
      Event: js.UndefOr[Event] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined,
      Queue: js.UndefOr[QueueArn] = js.undefined): QueueConfigurationDeprecated = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Event" -> Event.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "Queue" -> Queue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueueConfigurationDeprecated]
    }
  }

  object QuoteFieldsEnum {
    val ALWAYS = "ALWAYS"
    val ASNEEDED = "ASNEEDED"

    val values = IndexedSeq(ALWAYS, ASNEEDED)
  }

  @js.native
  trait RecordsEvent extends js.Object {
    var Payload: js.UndefOr[Body]
  }

  object RecordsEvent {
    def apply(
      Payload: js.UndefOr[Body] = js.undefined): RecordsEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Payload" -> Payload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordsEvent]
    }
  }

  @js.native
  trait Redirect extends js.Object {
    var ReplaceKeyWith: js.UndefOr[ReplaceKeyWith]
    var HttpRedirectCode: js.UndefOr[HttpRedirectCode]
    var HostName: js.UndefOr[HostName]
    var ReplaceKeyPrefixWith: js.UndefOr[ReplaceKeyPrefixWith]
    var Protocol: js.UndefOr[Protocol]
  }

  object Redirect {
    def apply(
      ReplaceKeyWith: js.UndefOr[ReplaceKeyWith] = js.undefined,
      HttpRedirectCode: js.UndefOr[HttpRedirectCode] = js.undefined,
      HostName: js.UndefOr[HostName] = js.undefined,
      ReplaceKeyPrefixWith: js.UndefOr[ReplaceKeyPrefixWith] = js.undefined,
      Protocol: js.UndefOr[Protocol] = js.undefined): Redirect = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplaceKeyWith" -> ReplaceKeyWith.map { x => x.asInstanceOf[js.Any] },
        "HttpRedirectCode" -> HttpRedirectCode.map { x => x.asInstanceOf[js.Any] },
        "HostName" -> HostName.map { x => x.asInstanceOf[js.Any] },
        "ReplaceKeyPrefixWith" -> ReplaceKeyPrefixWith.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Redirect]
    }
  }

  @js.native
  trait RedirectAllRequestsTo extends js.Object {
    var HostName: js.UndefOr[HostName]
    var Protocol: js.UndefOr[Protocol]
  }

  object RedirectAllRequestsTo {
    def apply(
      HostName: js.UndefOr[HostName] = js.undefined,
      Protocol: js.UndefOr[Protocol] = js.undefined): RedirectAllRequestsTo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostName" -> HostName.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedirectAllRequestsTo]
    }
  }

  /**
   * <p>A container for replication rules. You can add up to 1,000 rules. The maximum size of a replication configuration is 2 MB.</p>
   */
  @js.native
  trait ReplicationConfiguration extends js.Object {
    var Role: js.UndefOr[Role]
    var Rules: js.UndefOr[ReplicationRules]
  }

  object ReplicationConfiguration {
    def apply(
      Role: js.UndefOr[Role] = js.undefined,
      Rules: js.UndefOr[ReplicationRules] = js.undefined): ReplicationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationConfiguration]
    }
  }

  /**
   * <p>A container for information about a specific replication rule.</p>
   */
  @js.native
  trait ReplicationRule extends js.Object {
    var SourceSelectionCriteria: js.UndefOr[SourceSelectionCriteria]
    var ID: js.UndefOr[ID]
    var Priority: js.UndefOr[Priority]
    var Prefix: js.UndefOr[Prefix]
    var Destination: js.UndefOr[Destination]
    var Filter: js.UndefOr[ReplicationRuleFilter]
    var DeleteMarkerReplication: js.UndefOr[DeleteMarkerReplication]
    var Status: js.UndefOr[ReplicationRuleStatus]
  }

  object ReplicationRule {
    def apply(
      SourceSelectionCriteria: js.UndefOr[SourceSelectionCriteria] = js.undefined,
      ID: js.UndefOr[ID] = js.undefined,
      Priority: js.UndefOr[Priority] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Destination: js.UndefOr[Destination] = js.undefined,
      Filter: js.UndefOr[ReplicationRuleFilter] = js.undefined,
      DeleteMarkerReplication: js.UndefOr[DeleteMarkerReplication] = js.undefined,
      Status: js.UndefOr[ReplicationRuleStatus] = js.undefined): ReplicationRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceSelectionCriteria" -> SourceSelectionCriteria.map { x => x.asInstanceOf[js.Any] },
        "ID" -> ID.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "DeleteMarkerReplication" -> DeleteMarkerReplication.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationRule]
    }
  }

  @js.native
  trait ReplicationRuleAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[TagSet]
  }

  object ReplicationRuleAndOperator {
    def apply(
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Tags: js.UndefOr[TagSet] = js.undefined): ReplicationRuleAndOperator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationRuleAndOperator]
    }
  }

  /**
   * <p>A filter that identifies the subset of objects to which the replication rule applies. A <code>Filter</code> must specify exactly one <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child element.</p>
   */
  @js.native
  trait ReplicationRuleFilter extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[Tag]
    var And: js.UndefOr[ReplicationRuleAndOperator]
  }

  object ReplicationRuleFilter {
    def apply(
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Tag: js.UndefOr[Tag] = js.undefined,
      And: js.UndefOr[ReplicationRuleAndOperator] = js.undefined): ReplicationRuleFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Tag" -> Tag.map { x => x.asInstanceOf[js.Any] },
        "And" -> And.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationRuleFilter]
    }
  }

  object ReplicationRuleStatusEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  object ReplicationStatusEnum {
    val COMPLETE = "COMPLETE"
    val PENDING = "PENDING"
    val FAILED = "FAILED"
    val REPLICA = "REPLICA"

    val values = IndexedSeq(COMPLETE, PENDING, FAILED, REPLICA)
  }

  /**
   * <p>If present, indicates that the requester was successfully charged for the request.</p>
   */
  object RequestChargedEnum {
    val requester = "requester"

    val values = IndexedSeq(requester)
  }

  /**
   * <p>Confirms that the requester knows that she or he will be charged for the request. Bucket owners need not specify this parameter in their requests. Documentation on downloading objects from requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html</p>
   */
  object RequestPayerEnum {
    val requester = "requester"

    val values = IndexedSeq(requester)
  }

  @js.native
  trait RequestPaymentConfiguration extends js.Object {
    var Payer: js.UndefOr[Payer]
  }

  object RequestPaymentConfiguration {
    def apply(
      Payer: js.UndefOr[Payer] = js.undefined): RequestPaymentConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Payer" -> Payer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestPaymentConfiguration]
    }
  }

  @js.native
  trait RequestProgress extends js.Object {
    var Enabled: js.UndefOr[EnableRequestProgress]
  }

  object RequestProgress {
    def apply(
      Enabled: js.UndefOr[EnableRequestProgress] = js.undefined): RequestProgress = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestProgress]
    }
  }

  @js.native
  trait RestoreObjectOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
    var RestoreOutputPath: js.UndefOr[RestoreOutputPath]
  }

  object RestoreObjectOutput {
    def apply(
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
      RestoreOutputPath: js.UndefOr[RestoreOutputPath] = js.undefined): RestoreObjectOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] },
        "RestoreOutputPath" -> RestoreOutputPath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreObjectOutput]
    }
  }

  @js.native
  trait RestoreObjectRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var RequestPayer: js.UndefOr[RequestPayer]
    var RestoreRequest: js.UndefOr[RestoreRequest]
    var VersionId: js.UndefOr[ObjectVersionId]
    var Key: js.UndefOr[ObjectKey]
  }

  object RestoreObjectRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      RestoreRequest: js.UndefOr[RestoreRequest] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined): RestoreObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "RestoreRequest" -> RestoreRequest.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreObjectRequest]
    }
  }

  /**
   * <p>Container for restore job parameters.</p>
   */
  @js.native
  trait RestoreRequest extends js.Object {
    var GlacierJobParameters: js.UndefOr[GlacierJobParameters]
    var Description: js.UndefOr[Description]
    var Tier: js.UndefOr[Tier]
    var Days: js.UndefOr[Days]
    var SelectParameters: js.UndefOr[SelectParameters]
    var Type: js.UndefOr[RestoreRequestType]
    var OutputLocation: js.UndefOr[OutputLocation]
  }

  object RestoreRequest {
    def apply(
      GlacierJobParameters: js.UndefOr[GlacierJobParameters] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      Tier: js.UndefOr[Tier] = js.undefined,
      Days: js.UndefOr[Days] = js.undefined,
      SelectParameters: js.UndefOr[SelectParameters] = js.undefined,
      Type: js.UndefOr[RestoreRequestType] = js.undefined,
      OutputLocation: js.UndefOr[OutputLocation] = js.undefined): RestoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlacierJobParameters" -> GlacierJobParameters.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Tier" -> Tier.map { x => x.asInstanceOf[js.Any] },
        "Days" -> Days.map { x => x.asInstanceOf[js.Any] },
        "SelectParameters" -> SelectParameters.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreRequest]
    }
  }

  object RestoreRequestTypeEnum {
    val SELECT = "SELECT"

    val values = IndexedSeq(SELECT)
  }

  @js.native
  trait RoutingRule extends js.Object {
    var Condition: js.UndefOr[Condition]
    var Redirect: js.UndefOr[Redirect]
  }

  object RoutingRule {
    def apply(
      Condition: js.UndefOr[Condition] = js.undefined,
      Redirect: js.UndefOr[Redirect] = js.undefined): RoutingRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Condition" -> Condition.map { x => x.asInstanceOf[js.Any] },
        "Redirect" -> Redirect.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoutingRule]
    }
  }

  @js.native
  trait Rule extends js.Object {
    var Transition: js.UndefOr[Transition]
    var ID: js.UndefOr[ID]
    var NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration]
    var AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload]
    var NoncurrentVersionTransition: js.UndefOr[NoncurrentVersionTransition]
    var Prefix: js.UndefOr[Prefix]
    var Expiration: js.UndefOr[LifecycleExpiration]
    var Status: js.UndefOr[ExpirationStatus]
  }

  object Rule {
    def apply(
      Transition: js.UndefOr[Transition] = js.undefined,
      ID: js.UndefOr[ID] = js.undefined,
      NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration] = js.undefined,
      AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload] = js.undefined,
      NoncurrentVersionTransition: js.UndefOr[NoncurrentVersionTransition] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Expiration: js.UndefOr[LifecycleExpiration] = js.undefined,
      Status: js.UndefOr[ExpirationStatus] = js.undefined): Rule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Transition" -> Transition.map { x => x.asInstanceOf[js.Any] },
        "ID" -> ID.map { x => x.asInstanceOf[js.Any] },
        "NoncurrentVersionExpiration" -> NoncurrentVersionExpiration.map { x => x.asInstanceOf[js.Any] },
        "AbortIncompleteMultipartUpload" -> AbortIncompleteMultipartUpload.map { x => x.asInstanceOf[js.Any] },
        "NoncurrentVersionTransition" -> NoncurrentVersionTransition.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Expiration" -> Expiration.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Rule]
    }
  }

  /**
   * <p>A container for object key name prefix and suffix filtering rules.</p>
   */
  @js.native
  trait S3KeyFilter extends js.Object {
    var FilterRules: js.UndefOr[FilterRuleList]
  }

  object S3KeyFilter {
    def apply(
      FilterRules: js.UndefOr[FilterRuleList] = js.undefined): S3KeyFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FilterRules" -> FilterRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3KeyFilter]
    }
  }

  /**
   * <p>Describes an S3 location that will receive the results of the restore request.</p>
   */
  @js.native
  trait S3Location extends js.Object {
    var AccessControlList: js.UndefOr[Grants]
    var UserMetadata: js.UndefOr[UserMetadata]
    var BucketName: js.UndefOr[BucketName]
    var Tagging: js.UndefOr[Tagging]
    var CannedACL: js.UndefOr[ObjectCannedACL]
    var Prefix: js.UndefOr[LocationPrefix]
    var Encryption: js.UndefOr[Encryption]
    var StorageClass: js.UndefOr[StorageClass]
  }

  object S3Location {
    def apply(
      AccessControlList: js.UndefOr[Grants] = js.undefined,
      UserMetadata: js.UndefOr[UserMetadata] = js.undefined,
      BucketName: js.UndefOr[BucketName] = js.undefined,
      Tagging: js.UndefOr[Tagging] = js.undefined,
      CannedACL: js.UndefOr[ObjectCannedACL] = js.undefined,
      Prefix: js.UndefOr[LocationPrefix] = js.undefined,
      Encryption: js.UndefOr[Encryption] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessControlList" -> AccessControlList.map { x => x.asInstanceOf[js.Any] },
        "UserMetadata" -> UserMetadata.map { x => x.asInstanceOf[js.Any] },
        "BucketName" -> BucketName.map { x => x.asInstanceOf[js.Any] },
        "Tagging" -> Tagging.map { x => x.asInstanceOf[js.Any] },
        "CannedACL" -> CannedACL.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
    }
  }

  /**
   * <p>Specifies the use of SSE-KMS to encrypt delivered Inventory reports.</p>
   */
  @js.native
  trait SSEKMS extends js.Object {
    var KeyId: js.UndefOr[SSEKMSKeyId]
  }

  object SSEKMS {
    def apply(
      KeyId: js.UndefOr[SSEKMSKeyId] = js.undefined): SSEKMS = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSEKMS]
    }
  }

  /**
   * <p>Specifies the use of SSE-S3 to encrypt delivered Inventory reports.</p>
   */
  @js.native
  trait SSES3 extends js.Object {

  }

  object SSES3 {
    def apply(): SSES3 = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSES3]
    }
  }

  @js.native
  trait SelectObjectContentEventStream extends js.Object {
    var Records: js.UndefOr[RecordsEvent]
    var Cont: js.UndefOr[ContinuationEvent]
    var End: js.UndefOr[EndEvent]
    var Progress: js.UndefOr[ProgressEvent]
    var Stats: js.UndefOr[StatsEvent]
  }

  object SelectObjectContentEventStream {
    def apply(
      Records: js.UndefOr[RecordsEvent] = js.undefined,
      Cont: js.UndefOr[ContinuationEvent] = js.undefined,
      End: js.UndefOr[EndEvent] = js.undefined,
      Progress: js.UndefOr[ProgressEvent] = js.undefined,
      Stats: js.UndefOr[StatsEvent] = js.undefined): SelectObjectContentEventStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Records" -> Records.map { x => x.asInstanceOf[js.Any] },
        "Cont" -> Cont.map { x => x.asInstanceOf[js.Any] },
        "End" -> End.map { x => x.asInstanceOf[js.Any] },
        "Progress" -> Progress.map { x => x.asInstanceOf[js.Any] },
        "Stats" -> Stats.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelectObjectContentEventStream]
    }
  }

  @js.native
  trait SelectObjectContentOutput extends js.Object {
    var Payload: js.UndefOr[SelectObjectContentEventStream]
  }

  object SelectObjectContentOutput {
    def apply(
      Payload: js.UndefOr[SelectObjectContentEventStream] = js.undefined): SelectObjectContentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Payload" -> Payload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelectObjectContentOutput]
    }
  }

  /**
   * <p>Request to filter the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In the request, along with the SQL expression, you must specify a data serialization format (JSON or CSV) of the object. Amazon S3 uses this to parse object data into records. It returns only records that match the specified SQL expression. You must also specify the data serialization format for the response. For more information, see <a href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectSELECTContent.html">S3Select API Documentation</a>.</p>
   */
  @js.native
  trait SelectObjectContentRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var RequestProgress: js.UndefOr[RequestProgress]
    var OutputSerialization: js.UndefOr[OutputSerialization]
    var Expression: js.UndefOr[Expression]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var InputSerialization: js.UndefOr[InputSerialization]
    var ExpressionType: js.UndefOr[ExpressionType]
    var Key: js.UndefOr[ObjectKey]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
  }

  object SelectObjectContentRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      RequestProgress: js.UndefOr[RequestProgress] = js.undefined,
      OutputSerialization: js.UndefOr[OutputSerialization] = js.undefined,
      Expression: js.UndefOr[Expression] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      InputSerialization: js.UndefOr[InputSerialization] = js.undefined,
      ExpressionType: js.UndefOr[ExpressionType] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined): SelectObjectContentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "RequestProgress" -> RequestProgress.map { x => x.asInstanceOf[js.Any] },
        "OutputSerialization" -> OutputSerialization.map { x => x.asInstanceOf[js.Any] },
        "Expression" -> Expression.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "InputSerialization" -> InputSerialization.map { x => x.asInstanceOf[js.Any] },
        "ExpressionType" -> ExpressionType.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKey" -> SSECustomerKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelectObjectContentRequest]
    }
  }

  /**
   * <p>Describes the parameters for Select job types.</p>
   */
  @js.native
  trait SelectParameters extends js.Object {
    var InputSerialization: js.UndefOr[InputSerialization]
    var ExpressionType: js.UndefOr[ExpressionType]
    var Expression: js.UndefOr[Expression]
    var OutputSerialization: js.UndefOr[OutputSerialization]
  }

  object SelectParameters {
    def apply(
      InputSerialization: js.UndefOr[InputSerialization] = js.undefined,
      ExpressionType: js.UndefOr[ExpressionType] = js.undefined,
      Expression: js.UndefOr[Expression] = js.undefined,
      OutputSerialization: js.UndefOr[OutputSerialization] = js.undefined): SelectParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputSerialization" -> InputSerialization.map { x => x.asInstanceOf[js.Any] },
        "ExpressionType" -> ExpressionType.map { x => x.asInstanceOf[js.Any] },
        "Expression" -> Expression.map { x => x.asInstanceOf[js.Any] },
        "OutputSerialization" -> OutputSerialization.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelectParameters]
    }
  }

  object ServerSideEncryptionEnum {
    val AES256 = "AES256"
    val `aws:kms` = "aws:kms"

    val values = IndexedSeq(AES256, `aws:kms`)
  }

  /**
   * <p>Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.</p>
   */
  @js.native
  trait ServerSideEncryptionByDefault extends js.Object {
    var SSEAlgorithm: js.UndefOr[ServerSideEncryption]
    var KMSMasterKeyID: js.UndefOr[SSEKMSKeyId]
  }

  object ServerSideEncryptionByDefault {
    def apply(
      SSEAlgorithm: js.UndefOr[ServerSideEncryption] = js.undefined,
      KMSMasterKeyID: js.UndefOr[SSEKMSKeyId] = js.undefined): ServerSideEncryptionByDefault = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SSEAlgorithm" -> SSEAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "KMSMasterKeyID" -> KMSMasterKeyID.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerSideEncryptionByDefault]
    }
  }

  /**
   * <p>Container for server-side encryption configuration rules. Currently S3 supports one rule only.</p>
   */
  @js.native
  trait ServerSideEncryptionConfiguration extends js.Object {
    var Rules: js.UndefOr[ServerSideEncryptionRules]
  }

  object ServerSideEncryptionConfiguration {
    def apply(
      Rules: js.UndefOr[ServerSideEncryptionRules] = js.undefined): ServerSideEncryptionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerSideEncryptionConfiguration]
    }
  }

  /**
   * <p>Container for information about a particular server-side encryption configuration rule.</p>
   */
  @js.native
  trait ServerSideEncryptionRule extends js.Object {
    var ApplyServerSideEncryptionByDefault: js.UndefOr[ServerSideEncryptionByDefault]
  }

  object ServerSideEncryptionRule {
    def apply(
      ApplyServerSideEncryptionByDefault: js.UndefOr[ServerSideEncryptionByDefault] = js.undefined): ServerSideEncryptionRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplyServerSideEncryptionByDefault" -> ApplyServerSideEncryptionByDefault.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerSideEncryptionRule]
    }
  }

  /**
   * <p>A container for filters that define which source objects should be replicated.</p>
   */
  @js.native
  trait SourceSelectionCriteria extends js.Object {
    var SseKmsEncryptedObjects: js.UndefOr[SseKmsEncryptedObjects]
  }

  object SourceSelectionCriteria {
    def apply(
      SseKmsEncryptedObjects: js.UndefOr[SseKmsEncryptedObjects] = js.undefined): SourceSelectionCriteria = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SseKmsEncryptedObjects" -> SseKmsEncryptedObjects.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceSelectionCriteria]
    }
  }

  /**
   * <p>A container for filter information for the selection of S3 objects encrypted with AWS KMS.</p>
   */
  @js.native
  trait SseKmsEncryptedObjects extends js.Object {
    var Status: js.UndefOr[SseKmsEncryptedObjectsStatus]
  }

  object SseKmsEncryptedObjects {
    def apply(
      Status: js.UndefOr[SseKmsEncryptedObjectsStatus] = js.undefined): SseKmsEncryptedObjects = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SseKmsEncryptedObjects]
    }
  }

  object SseKmsEncryptedObjectsStatusEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  @js.native
  trait Stats extends js.Object {
    var BytesScanned: js.UndefOr[BytesScanned]
    var BytesProcessed: js.UndefOr[BytesProcessed]
    var BytesReturned: js.UndefOr[BytesReturned]
  }

  object Stats {
    def apply(
      BytesScanned: js.UndefOr[BytesScanned] = js.undefined,
      BytesProcessed: js.UndefOr[BytesProcessed] = js.undefined,
      BytesReturned: js.UndefOr[BytesReturned] = js.undefined): Stats = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BytesScanned" -> BytesScanned.map { x => x.asInstanceOf[js.Any] },
        "BytesProcessed" -> BytesProcessed.map { x => x.asInstanceOf[js.Any] },
        "BytesReturned" -> BytesReturned.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Stats]
    }
  }

  @js.native
  trait StatsEvent extends js.Object {
    var Details: js.UndefOr[Stats]
  }

  object StatsEvent {
    def apply(
      Details: js.UndefOr[Stats] = js.undefined): StatsEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StatsEvent]
    }
  }

  object StorageClassEnum {
    val STANDARD = "STANDARD"
    val REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY"
    val STANDARD_IA = "STANDARD_IA"
    val ONEZONE_IA = "ONEZONE_IA"

    val values = IndexedSeq(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA, ONEZONE_IA)
  }

  @js.native
  trait StorageClassAnalysis extends js.Object {
    var DataExport: js.UndefOr[StorageClassAnalysisDataExport]
  }

  object StorageClassAnalysis {
    def apply(
      DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.undefined): StorageClassAnalysis = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataExport" -> DataExport.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorageClassAnalysis]
    }
  }

  @js.native
  trait StorageClassAnalysisDataExport extends js.Object {
    var OutputSchemaVersion: js.UndefOr[StorageClassAnalysisSchemaVersion]
    var Destination: js.UndefOr[AnalyticsExportDestination]
  }

  object StorageClassAnalysisDataExport {
    def apply(
      OutputSchemaVersion: js.UndefOr[StorageClassAnalysisSchemaVersion] = js.undefined,
      Destination: js.UndefOr[AnalyticsExportDestination] = js.undefined): StorageClassAnalysisDataExport = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputSchemaVersion" -> OutputSchemaVersion.map { x => x.asInstanceOf[js.Any] },
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorageClassAnalysisDataExport]
    }
  }

  object StorageClassAnalysisSchemaVersionEnum {
    val V_1 = "V_1"

    val values = IndexedSeq(V_1)
  }

  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[ObjectKey]
    var Value: js.UndefOr[Value]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[ObjectKey] = js.undefined,
      Value: js.UndefOr[Value] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait Tagging extends js.Object {
    var TagSet: js.UndefOr[TagSet]
  }

  object Tagging {
    def apply(
      TagSet: js.UndefOr[TagSet] = js.undefined): Tagging = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagSet" -> TagSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tagging]
    }
  }

  object TaggingDirectiveEnum {
    val COPY = "COPY"
    val REPLACE = "REPLACE"

    val values = IndexedSeq(COPY, REPLACE)
  }

  @js.native
  trait TargetGrant extends js.Object {
    var Grantee: js.UndefOr[Grantee]
    var Permission: js.UndefOr[BucketLogsPermission]
  }

  object TargetGrant {
    def apply(
      Grantee: js.UndefOr[Grantee] = js.undefined,
      Permission: js.UndefOr[BucketLogsPermission] = js.undefined): TargetGrant = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Grantee" -> Grantee.map { x => x.asInstanceOf[js.Any] },
        "Permission" -> Permission.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetGrant]
    }
  }

  object TierEnum {
    val Standard = "Standard"
    val Bulk = "Bulk"
    val Expedited = "Expedited"

    val values = IndexedSeq(Standard, Bulk, Expedited)
  }

  /**
   * <p>A container for specifying the configuration for publication of messages to an Amazon Simple Notification Service (Amazon SNS) topic.when Amazon S3 detects specified events.</p>
   */
  @js.native
  trait TopicConfiguration extends js.Object {
    var Id: js.UndefOr[NotificationId]
    var TopicArn: js.UndefOr[TopicArn]
    var Events: js.UndefOr[EventList]
    var Filter: js.UndefOr[NotificationConfigurationFilter]
  }

  object TopicConfiguration {
    def apply(
      Id: js.UndefOr[NotificationId] = js.undefined,
      TopicArn: js.UndefOr[TopicArn] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined,
      Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined): TopicConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "TopicArn" -> TopicArn.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TopicConfiguration]
    }
  }

  @js.native
  trait TopicConfigurationDeprecated extends js.Object {
    var Id: js.UndefOr[NotificationId]
    var Events: js.UndefOr[EventList]
    var Event: js.UndefOr[Event]
    var Topic: js.UndefOr[TopicArn]
  }

  object TopicConfigurationDeprecated {
    def apply(
      Id: js.UndefOr[NotificationId] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined,
      Event: js.UndefOr[Event] = js.undefined,
      Topic: js.UndefOr[TopicArn] = js.undefined): TopicConfigurationDeprecated = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "Event" -> Event.map { x => x.asInstanceOf[js.Any] },
        "Topic" -> Topic.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TopicConfigurationDeprecated]
    }
  }

  @js.native
  trait Transition extends js.Object {
    var Date: js.UndefOr[Date]
    var Days: js.UndefOr[Days]
    var StorageClass: js.UndefOr[TransitionStorageClass]
  }

  object Transition {
    def apply(
      Date: js.UndefOr[Date] = js.undefined,
      Days: js.UndefOr[Days] = js.undefined,
      StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined): Transition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Date" -> Date.map { x => x.asInstanceOf[js.Any] },
        "Days" -> Days.map { x => x.asInstanceOf[js.Any] },
        "StorageClass" -> StorageClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Transition]
    }
  }

  object TransitionStorageClassEnum {
    val GLACIER = "GLACIER"
    val STANDARD_IA = "STANDARD_IA"
    val ONEZONE_IA = "ONEZONE_IA"

    val values = IndexedSeq(GLACIER, STANDARD_IA, ONEZONE_IA)
  }

  object TypeEnum {
    val CanonicalUser = "CanonicalUser"
    val AmazonCustomerByEmail = "AmazonCustomerByEmail"
    val Group = "Group"

    val values = IndexedSeq(CanonicalUser, AmazonCustomerByEmail, Group)
  }

  @js.native
  trait UploadPartCopyOutput extends js.Object {
    var CopySourceVersionId: js.UndefOr[CopySourceVersionId]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var CopyPartResult: js.UndefOr[CopyPartResult]
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object UploadPartCopyOutput {
    def apply(
      CopySourceVersionId: js.UndefOr[CopySourceVersionId] = js.undefined,
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      CopyPartResult: js.UndefOr[CopyPartResult] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined): UploadPartCopyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CopySourceVersionId" -> CopySourceVersionId.map { x => x.asInstanceOf[js.Any] },
        "SSEKMSKeyId" -> SSEKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "ServerSideEncryption" -> ServerSideEncryption.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "CopyPartResult" -> CopyPartResult.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadPartCopyOutput]
    }
  }

  @js.native
  trait UploadPartCopyRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var CopySource: js.UndefOr[CopySource]
    var PartNumber: js.UndefOr[PartNumber]
    var CopySourceIfModifiedSince: js.UndefOr[CopySourceIfModifiedSince]
    var CopySourceIfNoneMatch: js.UndefOr[CopySourceIfNoneMatch]
    var CopySourceSSECustomerKey: js.UndefOr[CopySourceSSECustomerKey]
    var CopySourceIfMatch: js.UndefOr[CopySourceIfMatch]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var RequestPayer: js.UndefOr[RequestPayer]
    var CopySourceIfUnmodifiedSince: js.UndefOr[CopySourceIfUnmodifiedSince]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var CopySourceRange: js.UndefOr[CopySourceRange]
    var CopySourceSSECustomerAlgorithm: js.UndefOr[CopySourceSSECustomerAlgorithm]
    var CopySourceSSECustomerKeyMD5: js.UndefOr[CopySourceSSECustomerKeyMD5]
    var UploadId: js.UndefOr[MultipartUploadId]
    var Key: js.UndefOr[ObjectKey]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
  }

  object UploadPartCopyRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      CopySource: js.UndefOr[CopySource] = js.undefined,
      PartNumber: js.UndefOr[PartNumber] = js.undefined,
      CopySourceIfModifiedSince: js.UndefOr[CopySourceIfModifiedSince] = js.undefined,
      CopySourceIfNoneMatch: js.UndefOr[CopySourceIfNoneMatch] = js.undefined,
      CopySourceSSECustomerKey: js.UndefOr[CopySourceSSECustomerKey] = js.undefined,
      CopySourceIfMatch: js.UndefOr[CopySourceIfMatch] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      CopySourceIfUnmodifiedSince: js.UndefOr[CopySourceIfUnmodifiedSince] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      CopySourceRange: js.UndefOr[CopySourceRange] = js.undefined,
      CopySourceSSECustomerAlgorithm: js.UndefOr[CopySourceSSECustomerAlgorithm] = js.undefined,
      CopySourceSSECustomerKeyMD5: js.UndefOr[CopySourceSSECustomerKeyMD5] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined): UploadPartCopyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "CopySource" -> CopySource.map { x => x.asInstanceOf[js.Any] },
        "PartNumber" -> PartNumber.map { x => x.asInstanceOf[js.Any] },
        "CopySourceIfModifiedSince" -> CopySourceIfModifiedSince.map { x => x.asInstanceOf[js.Any] },
        "CopySourceIfNoneMatch" -> CopySourceIfNoneMatch.map { x => x.asInstanceOf[js.Any] },
        "CopySourceSSECustomerKey" -> CopySourceSSECustomerKey.map { x => x.asInstanceOf[js.Any] },
        "CopySourceIfMatch" -> CopySourceIfMatch.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "CopySourceIfUnmodifiedSince" -> CopySourceIfUnmodifiedSince.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "CopySourceRange" -> CopySourceRange.map { x => x.asInstanceOf[js.Any] },
        "CopySourceSSECustomerAlgorithm" -> CopySourceSSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "CopySourceSSECustomerKeyMD5" -> CopySourceSSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "UploadId" -> UploadId.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKey" -> SSECustomerKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadPartCopyRequest]
    }
  }

  @js.native
  trait UploadPartOutput extends js.Object {
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var ETag: js.UndefOr[ETag]
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object UploadPartOutput {
    def apply(
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined): UploadPartOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SSEKMSKeyId" -> SSEKMSKeyId.map { x => x.asInstanceOf[js.Any] },
        "ServerSideEncryption" -> ServerSideEncryption.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "RequestCharged" -> RequestCharged.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadPartOutput]
    }
  }

  @js.native
  trait UploadPartRequest extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var PartNumber: js.UndefOr[PartNumber]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var RequestPayer: js.UndefOr[RequestPayer]
    var Body: js.UndefOr[Body]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var ContentLength: js.UndefOr[ContentLength]
    var ContentMD5: js.UndefOr[ContentMD5]
    var UploadId: js.UndefOr[MultipartUploadId]
    var Key: js.UndefOr[ObjectKey]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
  }

  object UploadPartRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      PartNumber: js.UndefOr[PartNumber] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      Body: js.UndefOr[Body] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      ContentLength: js.UndefOr[ContentLength] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined): UploadPartRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x => x.asInstanceOf[js.Any] },
        "PartNumber" -> PartNumber.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x.asInstanceOf[js.Any] },
        "RequestPayer" -> RequestPayer.map { x => x.asInstanceOf[js.Any] },
        "Body" -> Body.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "ContentLength" -> ContentLength.map { x => x.asInstanceOf[js.Any] },
        "ContentMD5" -> ContentMD5.map { x => x.asInstanceOf[js.Any] },
        "UploadId" -> UploadId.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "SSECustomerKey" -> SSECustomerKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadPartRequest]
    }
  }

  @js.native
  trait VersioningConfiguration extends js.Object {
    var MFADelete: js.UndefOr[MFADelete]
    var Status: js.UndefOr[BucketVersioningStatus]
  }

  object VersioningConfiguration {
    def apply(
      MFADelete: js.UndefOr[MFADelete] = js.undefined,
      Status: js.UndefOr[BucketVersioningStatus] = js.undefined): VersioningConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MFADelete" -> MFADelete.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VersioningConfiguration]
    }
  }

  @js.native
  trait WebsiteConfiguration extends js.Object {
    var ErrorDocument: js.UndefOr[ErrorDocument]
    var IndexDocument: js.UndefOr[IndexDocument]
    var RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo]
    var RoutingRules: js.UndefOr[RoutingRules]
  }

  object WebsiteConfiguration {
    def apply(
      ErrorDocument: js.UndefOr[ErrorDocument] = js.undefined,
      IndexDocument: js.UndefOr[IndexDocument] = js.undefined,
      RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo] = js.undefined,
      RoutingRules: js.UndefOr[RoutingRules] = js.undefined): WebsiteConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorDocument" -> ErrorDocument.map { x => x.asInstanceOf[js.Any] },
        "IndexDocument" -> IndexDocument.map { x => x.asInstanceOf[js.Any] },
        "RedirectAllRequestsTo" -> RedirectAllRequestsTo.map { x => x.asInstanceOf[js.Any] },
        "RoutingRules" -> RoutingRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WebsiteConfiguration]
    }
  }
}
