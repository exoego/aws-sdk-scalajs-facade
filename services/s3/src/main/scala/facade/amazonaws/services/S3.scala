package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object s3 {
  type AbortDate                      = js.Date
  type AbortRuleId                    = String
  type AcceptRanges                   = String
  type AccountId                      = String
  type AllowQuotedRecordDelimiter     = Boolean
  type AllowedHeader                  = String
  type AllowedHeaders                 = js.Array[AllowedHeader]
  type AllowedMethod                  = String
  type AllowedMethods                 = js.Array[AllowedMethod]
  type AllowedOrigin                  = String
  type AllowedOrigins                 = js.Array[AllowedOrigin]
  type AnalyticsConfigurationList     = js.Array[AnalyticsConfiguration]
  type AnalyticsId                    = String
  type AnalyticsS3ExportFileFormat    = String
  type Body                           = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BucketAccelerateStatus         = String
  type BucketCannedACL                = String
  type BucketLocationConstraint       = String
  type BucketLogsPermission           = String
  type BucketName                     = String
  type BucketVersioningStatus         = String
  type Buckets                        = js.Array[Bucket]
  type BypassGovernanceRetention      = Boolean
  type BytesProcessed                 = Double
  type BytesReturned                  = Double
  type BytesScanned                   = Double
  type CORSRules                      = js.Array[CORSRule]
  type CacheControl                   = String
  type CloudFunction                  = String
  type CloudFunctionInvocationRole    = String
  type Code                           = String
  type Comments                       = String
  type CommonPrefixList               = js.Array[CommonPrefix]
  type CompletedPartList              = js.Array[CompletedPart]
  type CompressionType                = String
  type ConfirmRemoveSelfBucketAccess  = Boolean
  type ContentDisposition             = String
  type ContentEncoding                = String
  type ContentLanguage                = String
  type ContentLength                  = Double
  type ContentMD5                     = String
  type ContentRange                   = String
  type ContentType                    = String
  type CopySource                     = String
  type CopySourceIfMatch              = String
  type CopySourceIfModifiedSince      = js.Date
  type CopySourceIfNoneMatch          = String
  type CopySourceIfUnmodifiedSince    = js.Date
  type CopySourceRange                = String
  type CopySourceSSECustomerAlgorithm = String
  type CopySourceSSECustomerKey =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CopySourceSSECustomerKeyMD5     = String
  type CopySourceVersionId             = String
  type CreationDate                    = js.Date
  type Date                            = js.Date
  type Days                            = Int
  type DaysAfterInitiation             = Int
  type DeleteMarker                    = Boolean
  type DeleteMarkerReplicationStatus   = String
  type DeleteMarkerVersionId           = String
  type DeleteMarkers                   = js.Array[DeleteMarkerEntry]
  type DeletedObjects                  = js.Array[DeletedObject]
  type Delimiter                       = String
  type Description                     = String
  type DisplayName                     = String
  type ETag                            = String
  type EmailAddress                    = String
  type EnableRequestProgress           = Boolean
  type EncodingType                    = String
  type Errors                          = js.Array[Error]
  type Event                           = String
  type EventList                       = js.Array[Event]
  type Expiration                      = String
  type ExpirationStatus                = String
  type ExpiredObjectDeleteMarker       = Boolean
  type Expires                         = js.Date
  type ExposeHeader                    = String
  type ExposeHeaders                   = js.Array[ExposeHeader]
  type Expression                      = String
  type ExpressionType                  = String
  type FetchOwner                      = Boolean
  type FieldDelimiter                  = String
  type FileHeaderInfo                  = String
  type FilterRuleList                  = js.Array[FilterRule]
  type FilterRuleName                  = String
  type FilterRuleValue                 = String
  type GrantFullControl                = String
  type GrantRead                       = String
  type GrantReadACP                    = String
  type GrantWrite                      = String
  type GrantWriteACP                   = String
  type Grants                          = js.Array[Grant]
  type HostName                        = String
  type HttpErrorCodeReturnedEquals     = String
  type HttpRedirectCode                = String
  type ID                              = String
  type IfMatch                         = String
  type IfModifiedSince                 = js.Date
  type IfNoneMatch                     = String
  type IfUnmodifiedSince               = js.Date
  type Initiated                       = js.Date
  type InventoryConfigurationList      = js.Array[InventoryConfiguration]
  type InventoryFormat                 = String
  type InventoryFrequency              = String
  type InventoryId                     = String
  type InventoryIncludedObjectVersions = String
  type InventoryOptionalField          = String
  type InventoryOptionalFields         = js.Array[InventoryOptionalField]
  type IsEnabled                       = Boolean
  type IsLatest                        = Boolean
  type IsPublic                        = Boolean
  type IsTruncated                     = Boolean
  type JSONType                        = String
  type KMSContext                      = String
  type KeyCount                        = Int
  type KeyMarker                       = String
  type KeyPrefixEquals                 = String
  type LambdaFunctionArn               = String
  type LambdaFunctionConfigurationList = js.Array[LambdaFunctionConfiguration]
  type LastModified                    = js.Date
  type LifecycleRules                  = js.Array[LifecycleRule]
  type Location                        = String
  type LocationPrefix                  = String
  type MFA                             = String
  type MFADelete                       = String
  type MFADeleteStatus                 = String
  type Marker                          = String
  type MaxAgeSeconds                   = Int
  type MaxKeys                         = Int
  type MaxParts                        = Int
  type MaxUploads                      = Int
  type Message                         = String
  type Metadata                        = js.Dictionary[MetadataValue]
  type MetadataDirective               = String
  type MetadataKey                     = String
  type MetadataValue                   = String
  type MetricsConfigurationList        = js.Array[MetricsConfiguration]
  type MetricsId                       = String
  type MissingMeta                     = Int
  type MultipartUploadId               = String
  type MultipartUploadList             = js.Array[MultipartUpload]
  type NextKeyMarker                   = String
  type NextMarker                      = String
  type NextPartNumberMarker            = Int
  type NextToken                       = String
  type NextUploadIdMarker              = String
  type NextVersionIdMarker             = String
  type NoncurrentVersionTransitionList = js.Array[NoncurrentVersionTransition]
  type NotificationId                  = String
  type ObjectCannedACL                 = String
  type ObjectIdentifierList            = js.Array[ObjectIdentifier]
  type ObjectKey                       = String
  type ObjectList                      = js.Array[Object]
  type ObjectLockEnabled               = String
  type ObjectLockEnabledForBucket      = Boolean
  type ObjectLockLegalHoldStatus       = String
  type ObjectLockMode                  = String
  type ObjectLockRetainUntilDate       = js.Date
  type ObjectLockRetentionMode         = String
  type ObjectLockToken                 = String
  type ObjectStorageClass              = String
  type ObjectVersionId                 = String
  type ObjectVersionList               = js.Array[ObjectVersion]
  type ObjectVersionStorageClass       = String
  type OwnerOverride                   = String
  type PartNumber                      = Int
  type PartNumberMarker                = Int
  type Parts                           = js.Array[Part]
  type PartsCount                      = Int
  type Payer                           = String
  type Permission                      = String
  type Policy                          = String
  type Prefix                          = String
  type Priority                        = Int
  type Protocol                        = String
  type QueueArn                        = String
  type QueueConfigurationList          = js.Array[QueueConfiguration]
  type Quiet                           = Boolean
  type QuoteCharacter                  = String
  type QuoteEscapeCharacter            = String
  type QuoteFields                     = String
  type Range                           = String
  type RecordDelimiter                 = String
  type ReplaceKeyPrefixWith            = String
  type ReplaceKeyWith                  = String
  type ReplicaKmsKeyID                 = String
  type ReplicationRuleStatus           = String
  type ReplicationRules                = js.Array[ReplicationRule]
  type ReplicationStatus               = String
  type RequestCharged                  = String
  type RequestPayer                    = String
  type ResponseCacheControl            = String
  type ResponseContentDisposition      = String
  type ResponseContentEncoding         = String
  type ResponseContentLanguage         = String
  type ResponseContentType             = String
  type ResponseExpires                 = js.Date
  type Restore                         = String
  type RestoreOutputPath               = String
  type RestoreRequestType              = String
  type Role                            = String
  type RoutingRules                    = js.Array[RoutingRule]
  type Rules                           = js.Array[Rule]
  type SSECustomerAlgorithm            = String
  type SSECustomerKey =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SSECustomerKeyMD5                 = String
  type SSEKMSKeyId                       = String
  type ServerSideEncryption              = String
  type ServerSideEncryptionRules         = js.Array[ServerSideEncryptionRule]
  type Setting                           = Boolean
  type Size                              = Int
  type SseKmsEncryptedObjectsStatus      = String
  type StartAfter                        = String
  type StorageClass                      = String
  type StorageClassAnalysisSchemaVersion = String
  type Suffix                            = String
  type TagCount                          = Int
  type TagSet                            = js.Array[Tag]
  type TaggingDirective                  = String
  type TaggingHeader                     = String
  type TargetBucket                      = String
  type TargetGrants                      = js.Array[TargetGrant]
  type TargetPrefix                      = String
  type Tier                              = String
  type Token                             = String
  type TopicArn                          = String
  type TopicConfigurationList            = js.Array[TopicConfiguration]
  type TransitionList                    = js.Array[Transition]
  type TransitionStorageClass            = String
  type Type                              = String
  type URI                               = String
  type UploadIdMarker                    = String
  type UserMetadata                      = js.Array[MetadataEntry]
  type Value                             = String
  type VersionIdMarker                   = String
  type WebsiteRedirectLocation           = String
  type Years                             = Int

  implicit final class S3Ops(val service: S3) extends AnyVal {

    def abortMultipartUploadFuture(params: AbortMultipartUploadRequest): Future[AbortMultipartUploadOutput] =
      service.abortMultipartUpload(params).promise.toFuture
    def completeMultipartUploadFuture(params: CompleteMultipartUploadRequest): Future[CompleteMultipartUploadOutput] =
      service.completeMultipartUpload(params).promise.toFuture
    def copyObjectFuture(params: CopyObjectRequest): Future[CopyObjectOutput] =
      service.copyObject(params).promise.toFuture
    def createBucketFuture(params: CreateBucketRequest): Future[CreateBucketOutput] =
      service.createBucket(params).promise.toFuture
    def createMultipartUploadFuture(params: CreateMultipartUploadRequest): Future[CreateMultipartUploadOutput] =
      service.createMultipartUpload(params).promise.toFuture
    def deleteBucketAnalyticsConfigurationFuture(params: DeleteBucketAnalyticsConfigurationRequest): Future[js.Object] =
      service.deleteBucketAnalyticsConfiguration(params).promise.toFuture
    def deleteBucketCorsFuture(params: DeleteBucketCorsRequest): Future[js.Object] =
      service.deleteBucketCors(params).promise.toFuture
    def deleteBucketEncryptionFuture(params: DeleteBucketEncryptionRequest): Future[js.Object] =
      service.deleteBucketEncryption(params).promise.toFuture
    def deleteBucketFuture(params: DeleteBucketRequest): Future[js.Object] =
      service.deleteBucket(params).promise.toFuture
    def deleteBucketInventoryConfigurationFuture(params: DeleteBucketInventoryConfigurationRequest): Future[js.Object] =
      service.deleteBucketInventoryConfiguration(params).promise.toFuture
    def deleteBucketLifecycleFuture(params: DeleteBucketLifecycleRequest): Future[js.Object] =
      service.deleteBucketLifecycle(params).promise.toFuture
    def deleteBucketMetricsConfigurationFuture(params: DeleteBucketMetricsConfigurationRequest): Future[js.Object] =
      service.deleteBucketMetricsConfiguration(params).promise.toFuture
    def deleteBucketPolicyFuture(params: DeleteBucketPolicyRequest): Future[js.Object] =
      service.deleteBucketPolicy(params).promise.toFuture
    def deleteBucketReplicationFuture(params: DeleteBucketReplicationRequest): Future[js.Object] =
      service.deleteBucketReplication(params).promise.toFuture
    def deleteBucketTaggingFuture(params: DeleteBucketTaggingRequest): Future[js.Object] =
      service.deleteBucketTagging(params).promise.toFuture
    def deleteBucketWebsiteFuture(params: DeleteBucketWebsiteRequest): Future[js.Object] =
      service.deleteBucketWebsite(params).promise.toFuture
    def deleteObjectFuture(params: DeleteObjectRequest): Future[DeleteObjectOutput] =
      service.deleteObject(params).promise.toFuture
    def deleteObjectTaggingFuture(params: DeleteObjectTaggingRequest): Future[DeleteObjectTaggingOutput] =
      service.deleteObjectTagging(params).promise.toFuture
    def deleteObjectsFuture(params: DeleteObjectsRequest): Future[DeleteObjectsOutput] =
      service.deleteObjects(params).promise.toFuture
    def deletePublicAccessBlockFuture(params: DeletePublicAccessBlockRequest): Future[js.Object] =
      service.deletePublicAccessBlock(params).promise.toFuture
    def getBucketAccelerateConfigurationFuture(
        params: GetBucketAccelerateConfigurationRequest
    ): Future[GetBucketAccelerateConfigurationOutput] =
      service.getBucketAccelerateConfiguration(params).promise.toFuture
    def getBucketAclFuture(params: GetBucketAclRequest): Future[GetBucketAclOutput] =
      service.getBucketAcl(params).promise.toFuture
    def getBucketAnalyticsConfigurationFuture(
        params: GetBucketAnalyticsConfigurationRequest
    ): Future[GetBucketAnalyticsConfigurationOutput] = service.getBucketAnalyticsConfiguration(params).promise.toFuture
    def getBucketCorsFuture(params: GetBucketCorsRequest): Future[GetBucketCorsOutput] =
      service.getBucketCors(params).promise.toFuture
    def getBucketEncryptionFuture(params: GetBucketEncryptionRequest): Future[GetBucketEncryptionOutput] =
      service.getBucketEncryption(params).promise.toFuture
    def getBucketInventoryConfigurationFuture(
        params: GetBucketInventoryConfigurationRequest
    ): Future[GetBucketInventoryConfigurationOutput] = service.getBucketInventoryConfiguration(params).promise.toFuture
    def getBucketLifecycleConfigurationFuture(
        params: GetBucketLifecycleConfigurationRequest
    ): Future[GetBucketLifecycleConfigurationOutput] = service.getBucketLifecycleConfiguration(params).promise.toFuture
    def getBucketLocationFuture(params: GetBucketLocationRequest): Future[GetBucketLocationOutput] =
      service.getBucketLocation(params).promise.toFuture
    def getBucketLoggingFuture(params: GetBucketLoggingRequest): Future[GetBucketLoggingOutput] =
      service.getBucketLogging(params).promise.toFuture
    def getBucketMetricsConfigurationFuture(
        params: GetBucketMetricsConfigurationRequest
    ): Future[GetBucketMetricsConfigurationOutput] = service.getBucketMetricsConfiguration(params).promise.toFuture
    def getBucketNotificationConfigurationFuture(
        params: GetBucketNotificationConfigurationRequest
    ): Future[NotificationConfiguration] = service.getBucketNotificationConfiguration(params).promise.toFuture
    def getBucketPolicyFuture(params: GetBucketPolicyRequest): Future[GetBucketPolicyOutput] =
      service.getBucketPolicy(params).promise.toFuture
    def getBucketPolicyStatusFuture(params: GetBucketPolicyStatusRequest): Future[GetBucketPolicyStatusOutput] =
      service.getBucketPolicyStatus(params).promise.toFuture
    def getBucketReplicationFuture(params: GetBucketReplicationRequest): Future[GetBucketReplicationOutput] =
      service.getBucketReplication(params).promise.toFuture
    def getBucketRequestPaymentFuture(params: GetBucketRequestPaymentRequest): Future[GetBucketRequestPaymentOutput] =
      service.getBucketRequestPayment(params).promise.toFuture
    def getBucketTaggingFuture(params: GetBucketTaggingRequest): Future[GetBucketTaggingOutput] =
      service.getBucketTagging(params).promise.toFuture
    def getBucketVersioningFuture(params: GetBucketVersioningRequest): Future[GetBucketVersioningOutput] =
      service.getBucketVersioning(params).promise.toFuture
    def getBucketWebsiteFuture(params: GetBucketWebsiteRequest): Future[GetBucketWebsiteOutput] =
      service.getBucketWebsite(params).promise.toFuture
    def getObjectAclFuture(params: GetObjectAclRequest): Future[GetObjectAclOutput] =
      service.getObjectAcl(params).promise.toFuture
    def getObjectFuture(params: GetObjectRequest): Future[GetObjectOutput] = service.getObject(params).promise.toFuture
    def getObjectLegalHoldFuture(params: GetObjectLegalHoldRequest): Future[GetObjectLegalHoldOutput] =
      service.getObjectLegalHold(params).promise.toFuture
    def getObjectLockConfigurationFuture(
        params: GetObjectLockConfigurationRequest
    ): Future[GetObjectLockConfigurationOutput] = service.getObjectLockConfiguration(params).promise.toFuture
    def getObjectRetentionFuture(params: GetObjectRetentionRequest): Future[GetObjectRetentionOutput] =
      service.getObjectRetention(params).promise.toFuture
    def getObjectTaggingFuture(params: GetObjectTaggingRequest): Future[GetObjectTaggingOutput] =
      service.getObjectTagging(params).promise.toFuture
    def getObjectTorrentFuture(params: GetObjectTorrentRequest): Future[GetObjectTorrentOutput] =
      service.getObjectTorrent(params).promise.toFuture
    def getPublicAccessBlockFuture(params: GetPublicAccessBlockRequest): Future[GetPublicAccessBlockOutput] =
      service.getPublicAccessBlock(params).promise.toFuture
    def headBucketFuture(params: HeadBucketRequest): Future[js.Object] = service.headBucket(params).promise.toFuture
    def headObjectFuture(params: HeadObjectRequest): Future[HeadObjectOutput] =
      service.headObject(params).promise.toFuture
    def listBucketAnalyticsConfigurationsFuture(
        params: ListBucketAnalyticsConfigurationsRequest
    ): Future[ListBucketAnalyticsConfigurationsOutput] =
      service.listBucketAnalyticsConfigurations(params).promise.toFuture
    def listBucketInventoryConfigurationsFuture(
        params: ListBucketInventoryConfigurationsRequest
    ): Future[ListBucketInventoryConfigurationsOutput] =
      service.listBucketInventoryConfigurations(params).promise.toFuture
    def listBucketMetricsConfigurationsFuture(
        params: ListBucketMetricsConfigurationsRequest
    ): Future[ListBucketMetricsConfigurationsOutput]   = service.listBucketMetricsConfigurations(params).promise.toFuture
    def listBucketsFuture(): Future[ListBucketsOutput] = service.listBuckets().promise.toFuture
    def listMultipartUploadsFuture(params: ListMultipartUploadsRequest): Future[ListMultipartUploadsOutput] =
      service.listMultipartUploads(params).promise.toFuture
    def listObjectVersionsFuture(params: ListObjectVersionsRequest): Future[ListObjectVersionsOutput] =
      service.listObjectVersions(params).promise.toFuture
    def listObjectsFuture(params: ListObjectsRequest): Future[ListObjectsOutput] =
      service.listObjects(params).promise.toFuture
    def listObjectsV2Future(params: ListObjectsV2Request): Future[ListObjectsV2Output] =
      service.listObjectsV2(params).promise.toFuture
    def listPartsFuture(params: ListPartsRequest): Future[ListPartsOutput] = service.listParts(params).promise.toFuture
    def putBucketAccelerateConfigurationFuture(params: PutBucketAccelerateConfigurationRequest): Future[js.Object] =
      service.putBucketAccelerateConfiguration(params).promise.toFuture
    def putBucketAclFuture(params: PutBucketAclRequest): Future[js.Object] =
      service.putBucketAcl(params).promise.toFuture
    def putBucketAnalyticsConfigurationFuture(params: PutBucketAnalyticsConfigurationRequest): Future[js.Object] =
      service.putBucketAnalyticsConfiguration(params).promise.toFuture
    def putBucketCorsFuture(params: PutBucketCorsRequest): Future[js.Object] =
      service.putBucketCors(params).promise.toFuture
    def putBucketEncryptionFuture(params: PutBucketEncryptionRequest): Future[js.Object] =
      service.putBucketEncryption(params).promise.toFuture
    def putBucketInventoryConfigurationFuture(params: PutBucketInventoryConfigurationRequest): Future[js.Object] =
      service.putBucketInventoryConfiguration(params).promise.toFuture
    def putBucketLifecycleConfigurationFuture(params: PutBucketLifecycleConfigurationRequest): Future[js.Object] =
      service.putBucketLifecycleConfiguration(params).promise.toFuture
    def putBucketLoggingFuture(params: PutBucketLoggingRequest): Future[js.Object] =
      service.putBucketLogging(params).promise.toFuture
    def putBucketMetricsConfigurationFuture(params: PutBucketMetricsConfigurationRequest): Future[js.Object] =
      service.putBucketMetricsConfiguration(params).promise.toFuture
    def putBucketNotificationConfigurationFuture(params: PutBucketNotificationConfigurationRequest): Future[js.Object] =
      service.putBucketNotificationConfiguration(params).promise.toFuture
    def putBucketPolicyFuture(params: PutBucketPolicyRequest): Future[js.Object] =
      service.putBucketPolicy(params).promise.toFuture
    def putBucketReplicationFuture(params: PutBucketReplicationRequest): Future[js.Object] =
      service.putBucketReplication(params).promise.toFuture
    def putBucketRequestPaymentFuture(params: PutBucketRequestPaymentRequest): Future[js.Object] =
      service.putBucketRequestPayment(params).promise.toFuture
    def putBucketTaggingFuture(params: PutBucketTaggingRequest): Future[js.Object] =
      service.putBucketTagging(params).promise.toFuture
    def putBucketVersioningFuture(params: PutBucketVersioningRequest): Future[js.Object] =
      service.putBucketVersioning(params).promise.toFuture
    def putBucketWebsiteFuture(params: PutBucketWebsiteRequest): Future[js.Object] =
      service.putBucketWebsite(params).promise.toFuture
    def putObjectAclFuture(params: PutObjectAclRequest): Future[PutObjectAclOutput] =
      service.putObjectAcl(params).promise.toFuture
    def putObjectFuture(params: PutObjectRequest): Future[PutObjectOutput] = service.putObject(params).promise.toFuture
    def putObjectLegalHoldFuture(params: PutObjectLegalHoldRequest): Future[PutObjectLegalHoldOutput] =
      service.putObjectLegalHold(params).promise.toFuture
    def putObjectLockConfigurationFuture(
        params: PutObjectLockConfigurationRequest
    ): Future[PutObjectLockConfigurationOutput] = service.putObjectLockConfiguration(params).promise.toFuture
    def putObjectRetentionFuture(params: PutObjectRetentionRequest): Future[PutObjectRetentionOutput] =
      service.putObjectRetention(params).promise.toFuture
    def putObjectTaggingFuture(params: PutObjectTaggingRequest): Future[PutObjectTaggingOutput] =
      service.putObjectTagging(params).promise.toFuture
    def putPublicAccessBlockFuture(params: PutPublicAccessBlockRequest): Future[js.Object] =
      service.putPublicAccessBlock(params).promise.toFuture
    def restoreObjectFuture(params: RestoreObjectRequest): Future[RestoreObjectOutput] =
      service.restoreObject(params).promise.toFuture
    def selectObjectContentFuture(params: SelectObjectContentRequest): Future[SelectObjectContentOutput] =
      service.selectObjectContent(params).promise.toFuture
    def uploadPartCopyFuture(params: UploadPartCopyRequest): Future[UploadPartCopyOutput] =
      service.uploadPartCopy(params).promise.toFuture
    def uploadPartFuture(params: UploadPartRequest): Future[UploadPartOutput] =
      service.uploadPart(params).promise.toFuture
  }
}

package s3 {
  @js.native
  @JSImport("aws-sdk", "S3")
  class S3() extends js.Object {
    def this(config: AWSConfig) = this()

    def abortMultipartUpload(params: AbortMultipartUploadRequest): Request[AbortMultipartUploadOutput] = js.native
    def completeMultipartUpload(params: CompleteMultipartUploadRequest): Request[CompleteMultipartUploadOutput] =
      js.native
    def copyObject(params: CopyObjectRequest): Request[CopyObjectOutput]                                  = js.native
    def createBucket(params: CreateBucketRequest): Request[CreateBucketOutput]                            = js.native
    def createMultipartUpload(params: CreateMultipartUploadRequest): Request[CreateMultipartUploadOutput] = js.native
    def deleteBucket(params: DeleteBucketRequest): Request[js.Object]                                     = js.native
    def deleteBucketAnalyticsConfiguration(params: DeleteBucketAnalyticsConfigurationRequest): Request[js.Object] =
      js.native
    def deleteBucketCors(params: DeleteBucketCorsRequest): Request[js.Object]             = js.native
    def deleteBucketEncryption(params: DeleteBucketEncryptionRequest): Request[js.Object] = js.native
    def deleteBucketInventoryConfiguration(params: DeleteBucketInventoryConfigurationRequest): Request[js.Object] =
      js.native
    def deleteBucketLifecycle(params: DeleteBucketLifecycleRequest): Request[js.Object] = js.native
    def deleteBucketMetricsConfiguration(params: DeleteBucketMetricsConfigurationRequest): Request[js.Object] =
      js.native
    def deleteBucketPolicy(params: DeleteBucketPolicyRequest): Request[js.Object]                   = js.native
    def deleteBucketReplication(params: DeleteBucketReplicationRequest): Request[js.Object]         = js.native
    def deleteBucketTagging(params: DeleteBucketTaggingRequest): Request[js.Object]                 = js.native
    def deleteBucketWebsite(params: DeleteBucketWebsiteRequest): Request[js.Object]                 = js.native
    def deleteObject(params: DeleteObjectRequest): Request[DeleteObjectOutput]                      = js.native
    def deleteObjectTagging(params: DeleteObjectTaggingRequest): Request[DeleteObjectTaggingOutput] = js.native
    def deleteObjects(params: DeleteObjectsRequest): Request[DeleteObjectsOutput]                   = js.native
    def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): Request[js.Object]         = js.native
    def getBucketAccelerateConfiguration(
        params: GetBucketAccelerateConfigurationRequest
    ): Request[GetBucketAccelerateConfigurationOutput]                         = js.native
    def getBucketAcl(params: GetBucketAclRequest): Request[GetBucketAclOutput] = js.native
    def getBucketAnalyticsConfiguration(
        params: GetBucketAnalyticsConfigurationRequest
    ): Request[GetBucketAnalyticsConfigurationOutput]                                               = js.native
    def getBucketCors(params: GetBucketCorsRequest): Request[GetBucketCorsOutput]                   = js.native
    def getBucketEncryption(params: GetBucketEncryptionRequest): Request[GetBucketEncryptionOutput] = js.native
    def getBucketInventoryConfiguration(
        params: GetBucketInventoryConfigurationRequest
    ): Request[GetBucketInventoryConfigurationOutput] = js.native
    def getBucketLifecycleConfiguration(
        params: GetBucketLifecycleConfigurationRequest
    ): Request[GetBucketLifecycleConfigurationOutput]                                         = js.native
    def getBucketLocation(params: GetBucketLocationRequest): Request[GetBucketLocationOutput] = js.native
    def getBucketLogging(params: GetBucketLoggingRequest): Request[GetBucketLoggingOutput]    = js.native
    def getBucketMetricsConfiguration(
        params: GetBucketMetricsConfigurationRequest
    ): Request[GetBucketMetricsConfigurationOutput] = js.native
    def getBucketNotificationConfiguration(
        params: GetBucketNotificationConfigurationRequest
    ): Request[NotificationConfiguration]                                                                 = js.native
    def getBucketPolicy(params: GetBucketPolicyRequest): Request[GetBucketPolicyOutput]                   = js.native
    def getBucketPolicyStatus(params: GetBucketPolicyStatusRequest): Request[GetBucketPolicyStatusOutput] = js.native
    def getBucketReplication(params: GetBucketReplicationRequest): Request[GetBucketReplicationOutput]    = js.native
    def getBucketRequestPayment(params: GetBucketRequestPaymentRequest): Request[GetBucketRequestPaymentOutput] =
      js.native
    def getBucketTagging(params: GetBucketTaggingRequest): Request[GetBucketTaggingOutput]          = js.native
    def getBucketVersioning(params: GetBucketVersioningRequest): Request[GetBucketVersioningOutput] = js.native
    def getBucketWebsite(params: GetBucketWebsiteRequest): Request[GetBucketWebsiteOutput]          = js.native
    def getObject(params: GetObjectRequest): Request[GetObjectOutput]                               = js.native
    def getObjectAcl(params: GetObjectAclRequest): Request[GetObjectAclOutput]                      = js.native
    def getObjectLegalHold(params: GetObjectLegalHoldRequest): Request[GetObjectLegalHoldOutput]    = js.native
    def getObjectLockConfiguration(
        params: GetObjectLockConfigurationRequest
    ): Request[GetObjectLockConfigurationOutput]                                                       = js.native
    def getObjectRetention(params: GetObjectRetentionRequest): Request[GetObjectRetentionOutput]       = js.native
    def getObjectTagging(params: GetObjectTaggingRequest): Request[GetObjectTaggingOutput]             = js.native
    def getObjectTorrent(params: GetObjectTorrentRequest): Request[GetObjectTorrentOutput]             = js.native
    def getPublicAccessBlock(params: GetPublicAccessBlockRequest): Request[GetPublicAccessBlockOutput] = js.native
    def headBucket(params: HeadBucketRequest): Request[js.Object]                                      = js.native
    def headObject(params: HeadObjectRequest): Request[HeadObjectOutput]                               = js.native
    def listBucketAnalyticsConfigurations(
        params: ListBucketAnalyticsConfigurationsRequest
    ): Request[ListBucketAnalyticsConfigurationsOutput] = js.native
    def listBucketInventoryConfigurations(
        params: ListBucketInventoryConfigurationsRequest
    ): Request[ListBucketInventoryConfigurationsOutput] = js.native
    def listBucketMetricsConfigurations(
        params: ListBucketMetricsConfigurationsRequest
    ): Request[ListBucketMetricsConfigurationsOutput]                                                  = js.native
    def listBuckets(): Request[ListBucketsOutput]                                                      = js.native
    def listMultipartUploads(params: ListMultipartUploadsRequest): Request[ListMultipartUploadsOutput] = js.native
    def listObjectVersions(params: ListObjectVersionsRequest): Request[ListObjectVersionsOutput]       = js.native
    def listObjects(params: ListObjectsRequest): Request[ListObjectsOutput]                            = js.native
    def listObjectsV2(params: ListObjectsV2Request): Request[ListObjectsV2Output]                      = js.native
    def listParts(params: ListPartsRequest): Request[ListPartsOutput]                                  = js.native
    def putBucketAccelerateConfiguration(params: PutBucketAccelerateConfigurationRequest): Request[js.Object] =
      js.native
    def putBucketAcl(params: PutBucketAclRequest): Request[js.Object]                                       = js.native
    def putBucketAnalyticsConfiguration(params: PutBucketAnalyticsConfigurationRequest): Request[js.Object] = js.native
    def putBucketCors(params: PutBucketCorsRequest): Request[js.Object]                                     = js.native
    def putBucketEncryption(params: PutBucketEncryptionRequest): Request[js.Object]                         = js.native
    def putBucketInventoryConfiguration(params: PutBucketInventoryConfigurationRequest): Request[js.Object] = js.native
    def putBucketLifecycleConfiguration(params: PutBucketLifecycleConfigurationRequest): Request[js.Object] = js.native
    def putBucketLogging(params: PutBucketLoggingRequest): Request[js.Object]                               = js.native
    def putBucketMetricsConfiguration(params: PutBucketMetricsConfigurationRequest): Request[js.Object]     = js.native
    def putBucketNotificationConfiguration(params: PutBucketNotificationConfigurationRequest): Request[js.Object] =
      js.native
    def putBucketPolicy(params: PutBucketPolicyRequest): Request[js.Object]                      = js.native
    def putBucketReplication(params: PutBucketReplicationRequest): Request[js.Object]            = js.native
    def putBucketRequestPayment(params: PutBucketRequestPaymentRequest): Request[js.Object]      = js.native
    def putBucketTagging(params: PutBucketTaggingRequest): Request[js.Object]                    = js.native
    def putBucketVersioning(params: PutBucketVersioningRequest): Request[js.Object]              = js.native
    def putBucketWebsite(params: PutBucketWebsiteRequest): Request[js.Object]                    = js.native
    def putObject(params: PutObjectRequest): Request[PutObjectOutput]                            = js.native
    def putObjectAcl(params: PutObjectAclRequest): Request[PutObjectAclOutput]                   = js.native
    def putObjectLegalHold(params: PutObjectLegalHoldRequest): Request[PutObjectLegalHoldOutput] = js.native
    def putObjectLockConfiguration(
        params: PutObjectLockConfigurationRequest
    ): Request[PutObjectLockConfigurationOutput]                                                    = js.native
    def putObjectRetention(params: PutObjectRetentionRequest): Request[PutObjectRetentionOutput]    = js.native
    def putObjectTagging(params: PutObjectTaggingRequest): Request[PutObjectTaggingOutput]          = js.native
    def putPublicAccessBlock(params: PutPublicAccessBlockRequest): Request[js.Object]               = js.native
    def restoreObject(params: RestoreObjectRequest): Request[RestoreObjectOutput]                   = js.native
    def selectObjectContent(params: SelectObjectContentRequest): Request[SelectObjectContentOutput] = js.native
    def uploadPart(params: UploadPartRequest): Request[UploadPartOutput]                            = js.native
    def uploadPartCopy(params: UploadPartCopyRequest): Request[UploadPartCopyOutput]                = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def getBucketLifecycle(
        params: GetBucketLifecycleRequest
    ): Request[GetBucketLifecycleOutput] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def getBucketNotification(
        params: GetBucketNotificationConfigurationRequest
    ): Request[NotificationConfigurationDeprecated] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def putBucketLifecycle(
        params: PutBucketLifecycleRequest
    ): Request[js.Object] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def putBucketNotification(
        params: PutBucketNotificationRequest
    ): Request[js.Object] = js.native
  }

  /**
    * Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.
    */
  @js.native
  trait AbortIncompleteMultipartUpload extends js.Object {
    var DaysAfterInitiation: js.UndefOr[DaysAfterInitiation]
  }

  object AbortIncompleteMultipartUpload {
    def apply(
        DaysAfterInitiation: js.UndefOr[DaysAfterInitiation] = js.undefined
    ): AbortIncompleteMultipartUpload = {
      val __obj = js.Dictionary.empty[js.Any]
      DaysAfterInitiation.foreach(__v => __obj.update("DaysAfterInitiation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AbortIncompleteMultipartUpload]
    }
  }

  @js.native
  trait AbortMultipartUploadOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object AbortMultipartUploadOutput {
    def apply(
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): AbortMultipartUploadOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AbortMultipartUploadOutput]
    }
  }

  @js.native
  trait AbortMultipartUploadRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var UploadId: MultipartUploadId
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  object AbortMultipartUploadRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        UploadId: MultipartUploadId,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    ): AbortMultipartUploadRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"   -> Bucket.asInstanceOf[js.Any],
        "Key"      -> Key.asInstanceOf[js.Any],
        "UploadId" -> UploadId.asInstanceOf[js.Any]
      )

      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AbortMultipartUploadRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait AccelerateConfiguration extends js.Object {
    var Status: js.UndefOr[BucketAccelerateStatus]
  }

  object AccelerateConfiguration {
    def apply(
        Status: js.UndefOr[BucketAccelerateStatus] = js.undefined
    ): AccelerateConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccelerateConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait AccessControlPolicy extends js.Object {
    var Grants: js.UndefOr[Grants]
    var Owner: js.UndefOr[Owner]
  }

  object AccessControlPolicy {
    def apply(
        Grants: js.UndefOr[Grants] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined
    ): AccessControlPolicy = {
      val __obj = js.Dictionary.empty[js.Any]
      Grants.foreach(__v => __obj.update("Grants", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessControlPolicy]
    }
  }

  /**
    * A container for information about access control for replicas.
    */
  @js.native
  trait AccessControlTranslation extends js.Object {
    var Owner: OwnerOverride
  }

  object AccessControlTranslation {
    def apply(
        Owner: OwnerOverride
    ): AccessControlTranslation = {
      val __obj = js.Dictionary[js.Any](
        "Owner" -> Owner.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AccessControlTranslation]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait AnalyticsAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[TagSet]
  }

  object AnalyticsAndOperator {
    def apply(
        Prefix: js.UndefOr[Prefix] = js.undefined,
        Tags: js.UndefOr[TagSet] = js.undefined
    ): AnalyticsAndOperator = {
      val __obj = js.Dictionary.empty[js.Any]
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalyticsAndOperator]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait AnalyticsConfiguration extends js.Object {
    var Id: AnalyticsId
    var StorageClassAnalysis: StorageClassAnalysis
    var Filter: js.UndefOr[AnalyticsFilter]
  }

  object AnalyticsConfiguration {
    def apply(
        Id: AnalyticsId,
        StorageClassAnalysis: StorageClassAnalysis,
        Filter: js.UndefOr[AnalyticsFilter] = js.undefined
    ): AnalyticsConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Id"                   -> Id.asInstanceOf[js.Any],
        "StorageClassAnalysis" -> StorageClassAnalysis.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalyticsConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait AnalyticsExportDestination extends js.Object {
    var S3BucketDestination: AnalyticsS3BucketDestination
  }

  object AnalyticsExportDestination {
    def apply(
        S3BucketDestination: AnalyticsS3BucketDestination
    ): AnalyticsExportDestination = {
      val __obj = js.Dictionary[js.Any](
        "S3BucketDestination" -> S3BucketDestination.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AnalyticsExportDestination]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait AnalyticsFilter extends js.Object {
    var And: js.UndefOr[AnalyticsAndOperator]
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[Tag]
  }

  object AnalyticsFilter {
    def apply(
        And: js.UndefOr[AnalyticsAndOperator] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        Tag: js.UndefOr[Tag] = js.undefined
    ): AnalyticsFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      And.foreach(__v => __obj.update("And", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      Tag.foreach(__v => __obj.update("Tag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalyticsFilter]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait AnalyticsS3BucketDestination extends js.Object {
    var Bucket: BucketName
    var Format: AnalyticsS3ExportFileFormat
    var BucketAccountId: js.UndefOr[AccountId]
    var Prefix: js.UndefOr[Prefix]
  }

  object AnalyticsS3BucketDestination {
    def apply(
        Bucket: BucketName,
        Format: AnalyticsS3ExportFileFormat,
        BucketAccountId: js.UndefOr[AccountId] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined
    ): AnalyticsS3BucketDestination = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any]
      )

      BucketAccountId.foreach(__v => __obj.update("BucketAccountId", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalyticsS3BucketDestination]
    }
  }

  object AnalyticsS3ExportFileFormatEnum {
    val CSV = "CSV"

    val values = IndexedSeq(CSV)
  }

  /**
    * <p/>
    */
  @js.native
  trait Bucket extends js.Object {
    var CreationDate: js.UndefOr[CreationDate]
    var Name: js.UndefOr[BucketName]
  }

  object Bucket {
    def apply(
        CreationDate: js.UndefOr[CreationDate] = js.undefined,
        Name: js.UndefOr[BucketName] = js.undefined
    ): Bucket = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Bucket]
    }
  }

  object BucketAccelerateStatusEnum {
    val Enabled   = "Enabled"
    val Suspended = "Suspended"

    val values = IndexedSeq(Enabled, Suspended)
  }

  object BucketCannedACLEnum {
    val `private`            = "private"
    val `public-read`        = "public-read"
    val `public-read-write`  = "public-read-write"
    val `authenticated-read` = "authenticated-read"

    val values = IndexedSeq(`private`, `public-read`, `public-read-write`, `authenticated-read`)
  }

  /**
    * <p/>
    */
  @js.native
  trait BucketLifecycleConfiguration extends js.Object {
    var Rules: LifecycleRules
  }

  object BucketLifecycleConfiguration {
    def apply(
        Rules: LifecycleRules
    ): BucketLifecycleConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Rules" -> Rules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BucketLifecycleConfiguration]
    }
  }

  object BucketLocationConstraintEnum {
    val EU               = "EU"
    val `eu-west-1`      = "eu-west-1"
    val `us-west-1`      = "us-west-1"
    val `us-west-2`      = "us-west-2"
    val `ap-south-1`     = "ap-south-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `sa-east-1`      = "sa-east-1"
    val `cn-north-1`     = "cn-north-1"
    val `eu-central-1`   = "eu-central-1"

    val values = IndexedSeq(
      EU,
      `eu-west-1`,
      `us-west-1`,
      `us-west-2`,
      `ap-south-1`,
      `ap-southeast-1`,
      `ap-southeast-2`,
      `ap-northeast-1`,
      `sa-east-1`,
      `cn-north-1`,
      `eu-central-1`
    )
  }

  /**
    * <p/>
    */
  @js.native
  trait BucketLoggingStatus extends js.Object {
    var LoggingEnabled: js.UndefOr[LoggingEnabled]
  }

  object BucketLoggingStatus {
    def apply(
        LoggingEnabled: js.UndefOr[LoggingEnabled] = js.undefined
    ): BucketLoggingStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      LoggingEnabled.foreach(__v => __obj.update("LoggingEnabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketLoggingStatus]
    }
  }

  object BucketLogsPermissionEnum {
    val FULL_CONTROL = "FULL_CONTROL"
    val READ         = "READ"
    val WRITE        = "WRITE"

    val values = IndexedSeq(FULL_CONTROL, READ, WRITE)
  }

  object BucketVersioningStatusEnum {
    val Enabled   = "Enabled"
    val Suspended = "Suspended"

    val values = IndexedSeq(Enabled, Suspended)
  }

  /**
    * <p/>
    */
  @js.native
  trait CORSConfiguration extends js.Object {
    var CORSRules: CORSRules
  }

  object CORSConfiguration {
    def apply(
        CORSRules: CORSRules
    ): CORSConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "CORSRules" -> CORSRules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CORSConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CORSRule extends js.Object {
    var AllowedMethods: AllowedMethods
    var AllowedOrigins: AllowedOrigins
    var AllowedHeaders: js.UndefOr[AllowedHeaders]
    var ExposeHeaders: js.UndefOr[ExposeHeaders]
    var MaxAgeSeconds: js.UndefOr[MaxAgeSeconds]
  }

  object CORSRule {
    def apply(
        AllowedMethods: AllowedMethods,
        AllowedOrigins: AllowedOrigins,
        AllowedHeaders: js.UndefOr[AllowedHeaders] = js.undefined,
        ExposeHeaders: js.UndefOr[ExposeHeaders] = js.undefined,
        MaxAgeSeconds: js.UndefOr[MaxAgeSeconds] = js.undefined
    ): CORSRule = {
      val __obj = js.Dictionary[js.Any](
        "AllowedMethods" -> AllowedMethods.asInstanceOf[js.Any],
        "AllowedOrigins" -> AllowedOrigins.asInstanceOf[js.Any]
      )

      AllowedHeaders.foreach(__v => __obj.update("AllowedHeaders", __v.asInstanceOf[js.Any]))
      ExposeHeaders.foreach(__v => __obj.update("ExposeHeaders", __v.asInstanceOf[js.Any]))
      MaxAgeSeconds.foreach(__v => __obj.update("MaxAgeSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CORSRule]
    }
  }

  /**
    * Describes how a CSV-formatted input object is formatted.
    */
  @js.native
  trait CSVInput extends js.Object {
    var AllowQuotedRecordDelimiter: js.UndefOr[AllowQuotedRecordDelimiter]
    var Comments: js.UndefOr[Comments]
    var FieldDelimiter: js.UndefOr[FieldDelimiter]
    var FileHeaderInfo: js.UndefOr[FileHeaderInfo]
    var QuoteCharacter: js.UndefOr[QuoteCharacter]
    var QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter]
    var RecordDelimiter: js.UndefOr[RecordDelimiter]
  }

  object CSVInput {
    def apply(
        AllowQuotedRecordDelimiter: js.UndefOr[AllowQuotedRecordDelimiter] = js.undefined,
        Comments: js.UndefOr[Comments] = js.undefined,
        FieldDelimiter: js.UndefOr[FieldDelimiter] = js.undefined,
        FileHeaderInfo: js.UndefOr[FileHeaderInfo] = js.undefined,
        QuoteCharacter: js.UndefOr[QuoteCharacter] = js.undefined,
        QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter] = js.undefined,
        RecordDelimiter: js.UndefOr[RecordDelimiter] = js.undefined
    ): CSVInput = {
      val __obj = js.Dictionary.empty[js.Any]
      AllowQuotedRecordDelimiter.foreach(__v => __obj.update("AllowQuotedRecordDelimiter", __v.asInstanceOf[js.Any]))
      Comments.foreach(__v => __obj.update("Comments", __v.asInstanceOf[js.Any]))
      FieldDelimiter.foreach(__v => __obj.update("FieldDelimiter", __v.asInstanceOf[js.Any]))
      FileHeaderInfo.foreach(__v => __obj.update("FileHeaderInfo", __v.asInstanceOf[js.Any]))
      QuoteCharacter.foreach(__v => __obj.update("QuoteCharacter", __v.asInstanceOf[js.Any]))
      QuoteEscapeCharacter.foreach(__v => __obj.update("QuoteEscapeCharacter", __v.asInstanceOf[js.Any]))
      RecordDelimiter.foreach(__v => __obj.update("RecordDelimiter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CSVInput]
    }
  }

  /**
    * Describes how CSV-formatted results are formatted.
    */
  @js.native
  trait CSVOutput extends js.Object {
    var FieldDelimiter: js.UndefOr[FieldDelimiter]
    var QuoteCharacter: js.UndefOr[QuoteCharacter]
    var QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter]
    var QuoteFields: js.UndefOr[QuoteFields]
    var RecordDelimiter: js.UndefOr[RecordDelimiter]
  }

  object CSVOutput {
    def apply(
        FieldDelimiter: js.UndefOr[FieldDelimiter] = js.undefined,
        QuoteCharacter: js.UndefOr[QuoteCharacter] = js.undefined,
        QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter] = js.undefined,
        QuoteFields: js.UndefOr[QuoteFields] = js.undefined,
        RecordDelimiter: js.UndefOr[RecordDelimiter] = js.undefined
    ): CSVOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FieldDelimiter.foreach(__v => __obj.update("FieldDelimiter", __v.asInstanceOf[js.Any]))
      QuoteCharacter.foreach(__v => __obj.update("QuoteCharacter", __v.asInstanceOf[js.Any]))
      QuoteEscapeCharacter.foreach(__v => __obj.update("QuoteEscapeCharacter", __v.asInstanceOf[js.Any]))
      QuoteFields.foreach(__v => __obj.update("QuoteFields", __v.asInstanceOf[js.Any]))
      RecordDelimiter.foreach(__v => __obj.update("RecordDelimiter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CSVOutput]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CloudFunctionConfiguration extends js.Object {
    var CloudFunction: js.UndefOr[CloudFunction]
    var Event: js.UndefOr[Event]
    var Events: js.UndefOr[EventList]
    var Id: js.UndefOr[NotificationId]
    var InvocationRole: js.UndefOr[CloudFunctionInvocationRole]
  }

  object CloudFunctionConfiguration {
    def apply(
        CloudFunction: js.UndefOr[CloudFunction] = js.undefined,
        Event: js.UndefOr[Event] = js.undefined,
        Events: js.UndefOr[EventList] = js.undefined,
        Id: js.UndefOr[NotificationId] = js.undefined,
        InvocationRole: js.UndefOr[CloudFunctionInvocationRole] = js.undefined
    ): CloudFunctionConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudFunction.foreach(__v => __obj.update("CloudFunction", __v.asInstanceOf[js.Any]))
      Event.foreach(__v => __obj.update("Event", __v.asInstanceOf[js.Any]))
      Events.foreach(__v => __obj.update("Events", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      InvocationRole.foreach(__v => __obj.update("InvocationRole", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudFunctionConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CommonPrefix extends js.Object {
    var Prefix: js.UndefOr[Prefix]
  }

  object CommonPrefix {
    def apply(
        Prefix: js.UndefOr[Prefix] = js.undefined
    ): CommonPrefix = {
      val __obj = js.Dictionary.empty[js.Any]
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommonPrefix]
    }
  }

  @js.native
  trait CompleteMultipartUploadOutput extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var ETag: js.UndefOr[ETag]
    var Expiration: js.UndefOr[Expiration]
    var Key: js.UndefOr[ObjectKey]
    var Location: js.UndefOr[Location]
    var RequestCharged: js.UndefOr[RequestCharged]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object CompleteMultipartUploadOutput {
    def apply(
        Bucket: js.UndefOr[BucketName] = js.undefined,
        ETag: js.UndefOr[ETag] = js.undefined,
        Expiration: js.UndefOr[Expiration] = js.undefined,
        Key: js.UndefOr[ObjectKey] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
        SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
        ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): CompleteMultipartUploadOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Bucket.foreach(__v => __obj.update("Bucket", __v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      Expiration.foreach(__v => __obj.update("Expiration", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      SSEKMSKeyId.foreach(__v => __obj.update("SSEKMSKeyId", __v.asInstanceOf[js.Any]))
      ServerSideEncryption.foreach(__v => __obj.update("ServerSideEncryption", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteMultipartUploadOutput]
    }
  }

  @js.native
  trait CompleteMultipartUploadRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var UploadId: MultipartUploadId
    var MultipartUpload: js.UndefOr[CompletedMultipartUpload]
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  object CompleteMultipartUploadRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        UploadId: MultipartUploadId,
        MultipartUpload: js.UndefOr[CompletedMultipartUpload] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    ): CompleteMultipartUploadRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"   -> Bucket.asInstanceOf[js.Any],
        "Key"      -> Key.asInstanceOf[js.Any],
        "UploadId" -> UploadId.asInstanceOf[js.Any]
      )

      MultipartUpload.foreach(__v => __obj.update("MultipartUpload", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteMultipartUploadRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CompletedMultipartUpload extends js.Object {
    var Parts: js.UndefOr[CompletedPartList]
  }

  object CompletedMultipartUpload {
    def apply(
        Parts: js.UndefOr[CompletedPartList] = js.undefined
    ): CompletedMultipartUpload = {
      val __obj = js.Dictionary.empty[js.Any]
      Parts.foreach(__v => __obj.update("Parts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompletedMultipartUpload]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CompletedPart extends js.Object {
    var ETag: js.UndefOr[ETag]
    var PartNumber: js.UndefOr[PartNumber]
  }

  object CompletedPart {
    def apply(
        ETag: js.UndefOr[ETag] = js.undefined,
        PartNumber: js.UndefOr[PartNumber] = js.undefined
    ): CompletedPart = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      PartNumber.foreach(__v => __obj.update("PartNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompletedPart]
    }
  }

  object CompressionTypeEnum {
    val NONE  = "NONE"
    val GZIP  = "GZIP"
    val BZIP2 = "BZIP2"

    val values = IndexedSeq(NONE, GZIP, BZIP2)
  }

  /**
    * <p/>
    */
  @js.native
  trait Condition extends js.Object {
    var HttpErrorCodeReturnedEquals: js.UndefOr[HttpErrorCodeReturnedEquals]
    var KeyPrefixEquals: js.UndefOr[KeyPrefixEquals]
  }

  object Condition {
    def apply(
        HttpErrorCodeReturnedEquals: js.UndefOr[HttpErrorCodeReturnedEquals] = js.undefined,
        KeyPrefixEquals: js.UndefOr[KeyPrefixEquals] = js.undefined
    ): Condition = {
      val __obj = js.Dictionary.empty[js.Any]
      HttpErrorCodeReturnedEquals.foreach(__v => __obj.update("HttpErrorCodeReturnedEquals", __v.asInstanceOf[js.Any]))
      KeyPrefixEquals.foreach(__v => __obj.update("KeyPrefixEquals", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Condition]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ContinuationEvent extends js.Object {}

  object ContinuationEvent {
    def apply(
        ): ContinuationEvent = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ContinuationEvent]
    }
  }

  @js.native
  trait CopyObjectOutput extends js.Object {
    var CopyObjectResult: js.UndefOr[CopyObjectResult]
    var CopySourceVersionId: js.UndefOr[CopySourceVersionId]
    var Expiration: js.UndefOr[Expiration]
    var RequestCharged: js.UndefOr[RequestCharged]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object CopyObjectOutput {
    def apply(
        CopyObjectResult: js.UndefOr[CopyObjectResult] = js.undefined,
        CopySourceVersionId: js.UndefOr[CopySourceVersionId] = js.undefined,
        Expiration: js.UndefOr[Expiration] = js.undefined,
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
        SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
        ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): CopyObjectOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      CopyObjectResult.foreach(__v => __obj.update("CopyObjectResult", __v.asInstanceOf[js.Any]))
      CopySourceVersionId.foreach(__v => __obj.update("CopySourceVersionId", __v.asInstanceOf[js.Any]))
      Expiration.foreach(__v => __obj.update("Expiration", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      SSEKMSKeyId.foreach(__v => __obj.update("SSEKMSKeyId", __v.asInstanceOf[js.Any]))
      ServerSideEncryption.foreach(__v => __obj.update("ServerSideEncryption", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyObjectOutput]
    }
  }

  @js.native
  trait CopyObjectRequest extends js.Object {
    var Bucket: BucketName
    var CopySource: CopySource
    var Key: ObjectKey
    var ACL: js.UndefOr[ObjectCannedACL]
    var CacheControl: js.UndefOr[CacheControl]
    var ContentDisposition: js.UndefOr[ContentDisposition]
    var ContentEncoding: js.UndefOr[ContentEncoding]
    var ContentLanguage: js.UndefOr[ContentLanguage]
    var ContentType: js.UndefOr[ContentType]
    var CopySourceIfMatch: js.UndefOr[CopySourceIfMatch]
    var CopySourceIfModifiedSince: js.UndefOr[CopySourceIfModifiedSince]
    var CopySourceIfNoneMatch: js.UndefOr[CopySourceIfNoneMatch]
    var CopySourceIfUnmodifiedSince: js.UndefOr[CopySourceIfUnmodifiedSince]
    var CopySourceSSECustomerAlgorithm: js.UndefOr[CopySourceSSECustomerAlgorithm]
    var CopySourceSSECustomerKey: js.UndefOr[CopySourceSSECustomerKey]
    var CopySourceSSECustomerKeyMD5: js.UndefOr[CopySourceSSECustomerKeyMD5]
    var Expires: js.UndefOr[Expires]
    var GrantFullControl: js.UndefOr[GrantFullControl]
    var GrantRead: js.UndefOr[GrantRead]
    var GrantReadACP: js.UndefOr[GrantReadACP]
    var GrantWriteACP: js.UndefOr[GrantWriteACP]
    var Metadata: js.UndefOr[Metadata]
    var MetadataDirective: js.UndefOr[MetadataDirective]
    var ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus]
    var ObjectLockMode: js.UndefOr[ObjectLockMode]
    var ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate]
    var RequestPayer: js.UndefOr[RequestPayer]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var StorageClass: js.UndefOr[StorageClass]
    var Tagging: js.UndefOr[TaggingHeader]
    var TaggingDirective: js.UndefOr[TaggingDirective]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
  }

  object CopyObjectRequest {
    def apply(
        Bucket: BucketName,
        CopySource: CopySource,
        Key: ObjectKey,
        ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
        CacheControl: js.UndefOr[CacheControl] = js.undefined,
        ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined,
        ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined,
        ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        CopySourceIfMatch: js.UndefOr[CopySourceIfMatch] = js.undefined,
        CopySourceIfModifiedSince: js.UndefOr[CopySourceIfModifiedSince] = js.undefined,
        CopySourceIfNoneMatch: js.UndefOr[CopySourceIfNoneMatch] = js.undefined,
        CopySourceIfUnmodifiedSince: js.UndefOr[CopySourceIfUnmodifiedSince] = js.undefined,
        CopySourceSSECustomerAlgorithm: js.UndefOr[CopySourceSSECustomerAlgorithm] = js.undefined,
        CopySourceSSECustomerKey: js.UndefOr[CopySourceSSECustomerKey] = js.undefined,
        CopySourceSSECustomerKeyMD5: js.UndefOr[CopySourceSSECustomerKeyMD5] = js.undefined,
        Expires: js.UndefOr[Expires] = js.undefined,
        GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
        GrantRead: js.UndefOr[GrantRead] = js.undefined,
        GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
        GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        MetadataDirective: js.UndefOr[MetadataDirective] = js.undefined,
        ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined,
        ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined,
        ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
        SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
        ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined,
        Tagging: js.UndefOr[TaggingHeader] = js.undefined,
        TaggingDirective: js.UndefOr[TaggingDirective] = js.undefined,
        WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined
    ): CopyObjectRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"     -> Bucket.asInstanceOf[js.Any],
        "CopySource" -> CopySource.asInstanceOf[js.Any],
        "Key"        -> Key.asInstanceOf[js.Any]
      )

      ACL.foreach(__v => __obj.update("ACL", __v.asInstanceOf[js.Any]))
      CacheControl.foreach(__v => __obj.update("CacheControl", __v.asInstanceOf[js.Any]))
      ContentDisposition.foreach(__v => __obj.update("ContentDisposition", __v.asInstanceOf[js.Any]))
      ContentEncoding.foreach(__v => __obj.update("ContentEncoding", __v.asInstanceOf[js.Any]))
      ContentLanguage.foreach(__v => __obj.update("ContentLanguage", __v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.update("ContentType", __v.asInstanceOf[js.Any]))
      CopySourceIfMatch.foreach(__v => __obj.update("CopySourceIfMatch", __v.asInstanceOf[js.Any]))
      CopySourceIfModifiedSince.foreach(__v => __obj.update("CopySourceIfModifiedSince", __v.asInstanceOf[js.Any]))
      CopySourceIfNoneMatch.foreach(__v => __obj.update("CopySourceIfNoneMatch", __v.asInstanceOf[js.Any]))
      CopySourceIfUnmodifiedSince.foreach(__v => __obj.update("CopySourceIfUnmodifiedSince", __v.asInstanceOf[js.Any]))
      CopySourceSSECustomerAlgorithm.foreach(
        __v => __obj.update("CopySourceSSECustomerAlgorithm", __v.asInstanceOf[js.Any])
      )
      CopySourceSSECustomerKey.foreach(__v => __obj.update("CopySourceSSECustomerKey", __v.asInstanceOf[js.Any]))
      CopySourceSSECustomerKeyMD5.foreach(__v => __obj.update("CopySourceSSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      Expires.foreach(__v => __obj.update("Expires", __v.asInstanceOf[js.Any]))
      GrantFullControl.foreach(__v => __obj.update("GrantFullControl", __v.asInstanceOf[js.Any]))
      GrantRead.foreach(__v => __obj.update("GrantRead", __v.asInstanceOf[js.Any]))
      GrantReadACP.foreach(__v => __obj.update("GrantReadACP", __v.asInstanceOf[js.Any]))
      GrantWriteACP.foreach(__v => __obj.update("GrantWriteACP", __v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.update("Metadata", __v.asInstanceOf[js.Any]))
      MetadataDirective.foreach(__v => __obj.update("MetadataDirective", __v.asInstanceOf[js.Any]))
      ObjectLockLegalHoldStatus.foreach(__v => __obj.update("ObjectLockLegalHoldStatus", __v.asInstanceOf[js.Any]))
      ObjectLockMode.foreach(__v => __obj.update("ObjectLockMode", __v.asInstanceOf[js.Any]))
      ObjectLockRetainUntilDate.foreach(__v => __obj.update("ObjectLockRetainUntilDate", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKey.foreach(__v => __obj.update("SSECustomerKey", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      SSEKMSKeyId.foreach(__v => __obj.update("SSEKMSKeyId", __v.asInstanceOf[js.Any]))
      ServerSideEncryption.foreach(__v => __obj.update("ServerSideEncryption", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      Tagging.foreach(__v => __obj.update("Tagging", __v.asInstanceOf[js.Any]))
      TaggingDirective.foreach(__v => __obj.update("TaggingDirective", __v.asInstanceOf[js.Any]))
      WebsiteRedirectLocation.foreach(__v => __obj.update("WebsiteRedirectLocation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyObjectRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CopyObjectResult extends js.Object {
    var ETag: js.UndefOr[ETag]
    var LastModified: js.UndefOr[LastModified]
  }

  object CopyObjectResult {
    def apply(
        ETag: js.UndefOr[ETag] = js.undefined,
        LastModified: js.UndefOr[LastModified] = js.undefined
    ): CopyObjectResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.update("LastModified", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyObjectResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CopyPartResult extends js.Object {
    var ETag: js.UndefOr[ETag]
    var LastModified: js.UndefOr[LastModified]
  }

  object CopyPartResult {
    def apply(
        ETag: js.UndefOr[ETag] = js.undefined,
        LastModified: js.UndefOr[LastModified] = js.undefined
    ): CopyPartResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.update("LastModified", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyPartResult]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateBucketConfiguration extends js.Object {
    var LocationConstraint: js.UndefOr[BucketLocationConstraint]
  }

  object CreateBucketConfiguration {
    def apply(
        LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined
    ): CreateBucketConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      LocationConstraint.foreach(__v => __obj.update("LocationConstraint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBucketConfiguration]
    }
  }

  @js.native
  trait CreateBucketOutput extends js.Object {
    var Location: js.UndefOr[Location]
  }

  object CreateBucketOutput {
    def apply(
        Location: js.UndefOr[Location] = js.undefined
    ): CreateBucketOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBucketOutput]
    }
  }

  @js.native
  trait CreateBucketRequest extends js.Object {
    var Bucket: BucketName
    var ACL: js.UndefOr[BucketCannedACL]
    var CreateBucketConfiguration: js.UndefOr[CreateBucketConfiguration]
    var GrantFullControl: js.UndefOr[GrantFullControl]
    var GrantRead: js.UndefOr[GrantRead]
    var GrantReadACP: js.UndefOr[GrantReadACP]
    var GrantWrite: js.UndefOr[GrantWrite]
    var GrantWriteACP: js.UndefOr[GrantWriteACP]
    var ObjectLockEnabledForBucket: js.UndefOr[ObjectLockEnabledForBucket]
  }

  object CreateBucketRequest {
    def apply(
        Bucket: BucketName,
        ACL: js.UndefOr[BucketCannedACL] = js.undefined,
        CreateBucketConfiguration: js.UndefOr[CreateBucketConfiguration] = js.undefined,
        GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
        GrantRead: js.UndefOr[GrantRead] = js.undefined,
        GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
        GrantWrite: js.UndefOr[GrantWrite] = js.undefined,
        GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined,
        ObjectLockEnabledForBucket: js.UndefOr[ObjectLockEnabledForBucket] = js.undefined
    ): CreateBucketRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      ACL.foreach(__v => __obj.update("ACL", __v.asInstanceOf[js.Any]))
      CreateBucketConfiguration.foreach(__v => __obj.update("CreateBucketConfiguration", __v.asInstanceOf[js.Any]))
      GrantFullControl.foreach(__v => __obj.update("GrantFullControl", __v.asInstanceOf[js.Any]))
      GrantRead.foreach(__v => __obj.update("GrantRead", __v.asInstanceOf[js.Any]))
      GrantReadACP.foreach(__v => __obj.update("GrantReadACP", __v.asInstanceOf[js.Any]))
      GrantWrite.foreach(__v => __obj.update("GrantWrite", __v.asInstanceOf[js.Any]))
      GrantWriteACP.foreach(__v => __obj.update("GrantWriteACP", __v.asInstanceOf[js.Any]))
      ObjectLockEnabledForBucket.foreach(__v => __obj.update("ObjectLockEnabledForBucket", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBucketRequest]
    }
  }

  @js.native
  trait CreateMultipartUploadOutput extends js.Object {
    var AbortDate: js.UndefOr[AbortDate]
    var AbortRuleId: js.UndefOr[AbortRuleId]
    var Bucket: js.UndefOr[BucketName]
    var Key: js.UndefOr[ObjectKey]
    var RequestCharged: js.UndefOr[RequestCharged]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var UploadId: js.UndefOr[MultipartUploadId]
  }

  object CreateMultipartUploadOutput {
    def apply(
        AbortDate: js.UndefOr[AbortDate] = js.undefined,
        AbortRuleId: js.UndefOr[AbortRuleId] = js.undefined,
        Bucket: js.UndefOr[BucketName] = js.undefined,
        Key: js.UndefOr[ObjectKey] = js.undefined,
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
        SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
        ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
        UploadId: js.UndefOr[MultipartUploadId] = js.undefined
    ): CreateMultipartUploadOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      AbortDate.foreach(__v => __obj.update("AbortDate", __v.asInstanceOf[js.Any]))
      AbortRuleId.foreach(__v => __obj.update("AbortRuleId", __v.asInstanceOf[js.Any]))
      Bucket.foreach(__v => __obj.update("Bucket", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      SSEKMSKeyId.foreach(__v => __obj.update("SSEKMSKeyId", __v.asInstanceOf[js.Any]))
      ServerSideEncryption.foreach(__v => __obj.update("ServerSideEncryption", __v.asInstanceOf[js.Any]))
      UploadId.foreach(__v => __obj.update("UploadId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMultipartUploadOutput]
    }
  }

  @js.native
  trait CreateMultipartUploadRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var ACL: js.UndefOr[ObjectCannedACL]
    var CacheControl: js.UndefOr[CacheControl]
    var ContentDisposition: js.UndefOr[ContentDisposition]
    var ContentEncoding: js.UndefOr[ContentEncoding]
    var ContentLanguage: js.UndefOr[ContentLanguage]
    var ContentType: js.UndefOr[ContentType]
    var Expires: js.UndefOr[Expires]
    var GrantFullControl: js.UndefOr[GrantFullControl]
    var GrantRead: js.UndefOr[GrantRead]
    var GrantReadACP: js.UndefOr[GrantReadACP]
    var GrantWriteACP: js.UndefOr[GrantWriteACP]
    var Metadata: js.UndefOr[Metadata]
    var ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus]
    var ObjectLockMode: js.UndefOr[ObjectLockMode]
    var ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate]
    var RequestPayer: js.UndefOr[RequestPayer]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var StorageClass: js.UndefOr[StorageClass]
    var Tagging: js.UndefOr[TaggingHeader]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
  }

  object CreateMultipartUploadRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
        CacheControl: js.UndefOr[CacheControl] = js.undefined,
        ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined,
        ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined,
        ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        Expires: js.UndefOr[Expires] = js.undefined,
        GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
        GrantRead: js.UndefOr[GrantRead] = js.undefined,
        GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
        GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined,
        ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined,
        ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
        SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
        ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined,
        Tagging: js.UndefOr[TaggingHeader] = js.undefined,
        WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined
    ): CreateMultipartUploadRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      ACL.foreach(__v => __obj.update("ACL", __v.asInstanceOf[js.Any]))
      CacheControl.foreach(__v => __obj.update("CacheControl", __v.asInstanceOf[js.Any]))
      ContentDisposition.foreach(__v => __obj.update("ContentDisposition", __v.asInstanceOf[js.Any]))
      ContentEncoding.foreach(__v => __obj.update("ContentEncoding", __v.asInstanceOf[js.Any]))
      ContentLanguage.foreach(__v => __obj.update("ContentLanguage", __v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.update("ContentType", __v.asInstanceOf[js.Any]))
      Expires.foreach(__v => __obj.update("Expires", __v.asInstanceOf[js.Any]))
      GrantFullControl.foreach(__v => __obj.update("GrantFullControl", __v.asInstanceOf[js.Any]))
      GrantRead.foreach(__v => __obj.update("GrantRead", __v.asInstanceOf[js.Any]))
      GrantReadACP.foreach(__v => __obj.update("GrantReadACP", __v.asInstanceOf[js.Any]))
      GrantWriteACP.foreach(__v => __obj.update("GrantWriteACP", __v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.update("Metadata", __v.asInstanceOf[js.Any]))
      ObjectLockLegalHoldStatus.foreach(__v => __obj.update("ObjectLockLegalHoldStatus", __v.asInstanceOf[js.Any]))
      ObjectLockMode.foreach(__v => __obj.update("ObjectLockMode", __v.asInstanceOf[js.Any]))
      ObjectLockRetainUntilDate.foreach(__v => __obj.update("ObjectLockRetainUntilDate", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKey.foreach(__v => __obj.update("SSECustomerKey", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      SSEKMSKeyId.foreach(__v => __obj.update("SSEKMSKeyId", __v.asInstanceOf[js.Any]))
      ServerSideEncryption.foreach(__v => __obj.update("ServerSideEncryption", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      Tagging.foreach(__v => __obj.update("Tagging", __v.asInstanceOf[js.Any]))
      WebsiteRedirectLocation.foreach(__v => __obj.update("WebsiteRedirectLocation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMultipartUploadRequest]
    }
  }

  /**
    * The container element for specifying the default Object Lock retention settings for new objects placed in the specified bucket.
    */
  @js.native
  trait DefaultRetention extends js.Object {
    var Days: js.UndefOr[Days]
    var Mode: js.UndefOr[ObjectLockRetentionMode]
    var Years: js.UndefOr[Years]
  }

  object DefaultRetention {
    def apply(
        Days: js.UndefOr[Days] = js.undefined,
        Mode: js.UndefOr[ObjectLockRetentionMode] = js.undefined,
        Years: js.UndefOr[Years] = js.undefined
    ): DefaultRetention = {
      val __obj = js.Dictionary.empty[js.Any]
      Days.foreach(__v => __obj.update("Days", __v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.update("Mode", __v.asInstanceOf[js.Any]))
      Years.foreach(__v => __obj.update("Years", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultRetention]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Delete extends js.Object {
    var Objects: ObjectIdentifierList
    var Quiet: js.UndefOr[Quiet]
  }

  object Delete {
    def apply(
        Objects: ObjectIdentifierList,
        Quiet: js.UndefOr[Quiet] = js.undefined
    ): Delete = {
      val __obj = js.Dictionary[js.Any](
        "Objects" -> Objects.asInstanceOf[js.Any]
      )

      Quiet.foreach(__v => __obj.update("Quiet", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Delete]
    }
  }

  @js.native
  trait DeleteBucketAnalyticsConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: AnalyticsId
  }

  object DeleteBucketAnalyticsConfigurationRequest {
    def apply(
        Bucket: BucketName,
        Id: AnalyticsId
    ): DeleteBucketAnalyticsConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Id"     -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBucketAnalyticsConfigurationRequest]
    }
  }

  @js.native
  trait DeleteBucketCorsRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketCorsRequest {
    def apply(
        Bucket: BucketName
    ): DeleteBucketCorsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBucketCorsRequest]
    }
  }

  @js.native
  trait DeleteBucketEncryptionRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketEncryptionRequest {
    def apply(
        Bucket: BucketName
    ): DeleteBucketEncryptionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBucketEncryptionRequest]
    }
  }

  @js.native
  trait DeleteBucketInventoryConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: InventoryId
  }

  object DeleteBucketInventoryConfigurationRequest {
    def apply(
        Bucket: BucketName,
        Id: InventoryId
    ): DeleteBucketInventoryConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Id"     -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBucketInventoryConfigurationRequest]
    }
  }

  @js.native
  trait DeleteBucketLifecycleRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketLifecycleRequest {
    def apply(
        Bucket: BucketName
    ): DeleteBucketLifecycleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBucketLifecycleRequest]
    }
  }

  @js.native
  trait DeleteBucketMetricsConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: MetricsId
  }

  object DeleteBucketMetricsConfigurationRequest {
    def apply(
        Bucket: BucketName,
        Id: MetricsId
    ): DeleteBucketMetricsConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Id"     -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBucketMetricsConfigurationRequest]
    }
  }

  @js.native
  trait DeleteBucketPolicyRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketPolicyRequest {
    def apply(
        Bucket: BucketName
    ): DeleteBucketPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBucketPolicyRequest]
    }
  }

  @js.native
  trait DeleteBucketReplicationRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketReplicationRequest {
    def apply(
        Bucket: BucketName
    ): DeleteBucketReplicationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBucketReplicationRequest]
    }
  }

  @js.native
  trait DeleteBucketRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketRequest {
    def apply(
        Bucket: BucketName
    ): DeleteBucketRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBucketRequest]
    }
  }

  @js.native
  trait DeleteBucketTaggingRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketTaggingRequest {
    def apply(
        Bucket: BucketName
    ): DeleteBucketTaggingRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBucketTaggingRequest]
    }
  }

  @js.native
  trait DeleteBucketWebsiteRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketWebsiteRequest {
    def apply(
        Bucket: BucketName
    ): DeleteBucketWebsiteRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBucketWebsiteRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteMarkerEntry extends js.Object {
    var IsLatest: js.UndefOr[IsLatest]
    var Key: js.UndefOr[ObjectKey]
    var LastModified: js.UndefOr[LastModified]
    var Owner: js.UndefOr[Owner]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object DeleteMarkerEntry {
    def apply(
        IsLatest: js.UndefOr[IsLatest] = js.undefined,
        Key: js.UndefOr[ObjectKey] = js.undefined,
        LastModified: js.UndefOr[LastModified] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): DeleteMarkerEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      IsLatest.foreach(__v => __obj.update("IsLatest", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.update("LastModified", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMarkerEntry]
    }
  }

  /**
    * Specifies whether Amazon S3 should replicate delete makers.
    */
  @js.native
  trait DeleteMarkerReplication extends js.Object {
    var Status: js.UndefOr[DeleteMarkerReplicationStatus]
  }

  object DeleteMarkerReplication {
    def apply(
        Status: js.UndefOr[DeleteMarkerReplicationStatus] = js.undefined
    ): DeleteMarkerReplication = {
      val __obj = js.Dictionary.empty[js.Any]
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMarkerReplication]
    }
  }

  object DeleteMarkerReplicationStatusEnum {
    val Enabled  = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  @js.native
  trait DeleteObjectOutput extends js.Object {
    var DeleteMarker: js.UndefOr[DeleteMarker]
    var RequestCharged: js.UndefOr[RequestCharged]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object DeleteObjectOutput {
    def apply(
        DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined,
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): DeleteObjectOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      DeleteMarker.foreach(__v => __obj.update("DeleteMarker", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteObjectOutput]
    }
  }

  @js.native
  trait DeleteObjectRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention]
    var MFA: js.UndefOr[MFA]
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object DeleteObjectRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention] = js.undefined,
        MFA: js.UndefOr[MFA] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): DeleteObjectRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      BypassGovernanceRetention.foreach(__v => __obj.update("BypassGovernanceRetention", __v.asInstanceOf[js.Any]))
      MFA.foreach(__v => __obj.update("MFA", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteObjectRequest]
    }
  }

  @js.native
  trait DeleteObjectTaggingOutput extends js.Object {
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object DeleteObjectTaggingOutput {
    def apply(
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): DeleteObjectTaggingOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteObjectTaggingOutput]
    }
  }

  @js.native
  trait DeleteObjectTaggingRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object DeleteObjectTaggingRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): DeleteObjectTaggingRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteObjectTaggingRequest]
    }
  }

  @js.native
  trait DeleteObjectsOutput extends js.Object {
    var Deleted: js.UndefOr[DeletedObjects]
    var Errors: js.UndefOr[Errors]
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object DeleteObjectsOutput {
    def apply(
        Deleted: js.UndefOr[DeletedObjects] = js.undefined,
        Errors: js.UndefOr[Errors] = js.undefined,
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): DeleteObjectsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Deleted.foreach(__v => __obj.update("Deleted", __v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.update("Errors", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteObjectsOutput]
    }
  }

  @js.native
  trait DeleteObjectsRequest extends js.Object {
    var Bucket: BucketName
    var Delete: Delete
    var BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention]
    var MFA: js.UndefOr[MFA]
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  object DeleteObjectsRequest {
    def apply(
        Bucket: BucketName,
        Delete: Delete,
        BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention] = js.undefined,
        MFA: js.UndefOr[MFA] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    ): DeleteObjectsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Delete" -> Delete.asInstanceOf[js.Any]
      )

      BypassGovernanceRetention.foreach(__v => __obj.update("BypassGovernanceRetention", __v.asInstanceOf[js.Any]))
      MFA.foreach(__v => __obj.update("MFA", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteObjectsRequest]
    }
  }

  @js.native
  trait DeletePublicAccessBlockRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeletePublicAccessBlockRequest {
    def apply(
        Bucket: BucketName
    ): DeletePublicAccessBlockRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePublicAccessBlockRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeletedObject extends js.Object {
    var DeleteMarker: js.UndefOr[DeleteMarker]
    var DeleteMarkerVersionId: js.UndefOr[DeleteMarkerVersionId]
    var Key: js.UndefOr[ObjectKey]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object DeletedObject {
    def apply(
        DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined,
        DeleteMarkerVersionId: js.UndefOr[DeleteMarkerVersionId] = js.undefined,
        Key: js.UndefOr[ObjectKey] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): DeletedObject = {
      val __obj = js.Dictionary.empty[js.Any]
      DeleteMarker.foreach(__v => __obj.update("DeleteMarker", __v.asInstanceOf[js.Any]))
      DeleteMarkerVersionId.foreach(__v => __obj.update("DeleteMarkerVersionId", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletedObject]
    }
  }

  /**
    * A container for information about the replication destination.
    */
  @js.native
  trait Destination extends js.Object {
    var Bucket: BucketName
    var AccessControlTranslation: js.UndefOr[AccessControlTranslation]
    var Account: js.UndefOr[AccountId]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var StorageClass: js.UndefOr[StorageClass]
  }

  object Destination {
    def apply(
        Bucket: BucketName,
        AccessControlTranslation: js.UndefOr[AccessControlTranslation] = js.undefined,
        Account: js.UndefOr[AccountId] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined
    ): Destination = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      AccessControlTranslation.foreach(__v => __obj.update("AccessControlTranslation", __v.asInstanceOf[js.Any]))
      Account.foreach(__v => __obj.update("Account", __v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.update("EncryptionConfiguration", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Destination]
    }
  }

  /**
    * Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.
    */
  object EncodingTypeEnum {
    val url = "url"

    val values = IndexedSeq(url)
  }

  /**
    * Describes the server-side encryption that will be applied to the restore results.
    */
  @js.native
  trait Encryption extends js.Object {
    var EncryptionType: ServerSideEncryption
    var KMSContext: js.UndefOr[KMSContext]
    var KMSKeyId: js.UndefOr[SSEKMSKeyId]
  }

  object Encryption {
    def apply(
        EncryptionType: ServerSideEncryption,
        KMSContext: js.UndefOr[KMSContext] = js.undefined,
        KMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
    ): Encryption = {
      val __obj = js.Dictionary[js.Any](
        "EncryptionType" -> EncryptionType.asInstanceOf[js.Any]
      )

      KMSContext.foreach(__v => __obj.update("KMSContext", __v.asInstanceOf[js.Any]))
      KMSKeyId.foreach(__v => __obj.update("KMSKeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Encryption]
    }
  }

  /**
    * A container for information about the encryption-based configuration for replicas.
    */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var ReplicaKmsKeyID: js.UndefOr[ReplicaKmsKeyID]
  }

  object EncryptionConfiguration {
    def apply(
        ReplicaKmsKeyID: js.UndefOr[ReplicaKmsKeyID] = js.undefined
    ): EncryptionConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicaKmsKeyID.foreach(__v => __obj.update("ReplicaKmsKeyID", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait EndEvent extends js.Object {}

  object EndEvent {
    def apply(
        ): EndEvent = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[EndEvent]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Error extends js.Object {
    var Code: js.UndefOr[Code]
    var Key: js.UndefOr[ObjectKey]
    var Message: js.UndefOr[Message]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object Error {
    def apply(
        Code: js.UndefOr[Code] = js.undefined,
        Key: js.UndefOr[ObjectKey] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): Error = {
      val __obj = js.Dictionary.empty[js.Any]
      Code.foreach(__v => __obj.update("Code", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Error]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ErrorDocument extends js.Object {
    var Key: ObjectKey
  }

  object ErrorDocument {
    def apply(
        Key: ObjectKey
    ): ErrorDocument = {
      val __obj = js.Dictionary[js.Any](
        "Key" -> Key.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ErrorDocument]
    }
  }

  /**
    * The bucket event for which to send notifications.
    */
  object EventEnum {
    val `s3:ReducedRedundancyLostObject`           = "s3:ReducedRedundancyLostObject"
    val `s3:ObjectCreated:*`                       = "s3:ObjectCreated:*"
    val `s3:ObjectCreated:Put`                     = "s3:ObjectCreated:Put"
    val `s3:ObjectCreated:Post`                    = "s3:ObjectCreated:Post"
    val `s3:ObjectCreated:Copy`                    = "s3:ObjectCreated:Copy"
    val `s3:ObjectCreated:CompleteMultipartUpload` = "s3:ObjectCreated:CompleteMultipartUpload"
    val `s3:ObjectRemoved:*`                       = "s3:ObjectRemoved:*"
    val `s3:ObjectRemoved:Delete`                  = "s3:ObjectRemoved:Delete"
    val `s3:ObjectRemoved:DeleteMarkerCreated`     = "s3:ObjectRemoved:DeleteMarkerCreated"
    val `s3:ObjectRestore:Post`                    = "s3:ObjectRestore:Post"
    val `s3:ObjectRestore:Completed`               = "s3:ObjectRestore:Completed"

    val values = IndexedSeq(
      `s3:ReducedRedundancyLostObject`,
      `s3:ObjectCreated:*`,
      `s3:ObjectCreated:Put`,
      `s3:ObjectCreated:Post`,
      `s3:ObjectCreated:Copy`,
      `s3:ObjectCreated:CompleteMultipartUpload`,
      `s3:ObjectRemoved:*`,
      `s3:ObjectRemoved:Delete`,
      `s3:ObjectRemoved:DeleteMarkerCreated`,
      `s3:ObjectRestore:Post`,
      `s3:ObjectRestore:Completed`
    )
  }

  object ExpirationStatusEnum {
    val Enabled  = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  object ExpressionTypeEnum {
    val SQL = "SQL"

    val values = IndexedSeq(SQL)
  }

  object FileHeaderInfoEnum {
    val USE    = "USE"
    val IGNORE = "IGNORE"
    val NONE   = "NONE"

    val values = IndexedSeq(USE, IGNORE, NONE)
  }

  /**
    * A container for a key value pair that defines the criteria for the filter rule.
    */
  @js.native
  trait FilterRule extends js.Object {
    var Name: js.UndefOr[FilterRuleName]
    var Value: js.UndefOr[FilterRuleValue]
  }

  object FilterRule {
    def apply(
        Name: js.UndefOr[FilterRuleName] = js.undefined,
        Value: js.UndefOr[FilterRuleValue] = js.undefined
    ): FilterRule = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterRule]
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
        Status: js.UndefOr[BucketAccelerateStatus] = js.undefined
    ): GetBucketAccelerateConfigurationOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketAccelerateConfigurationOutput]
    }
  }

  @js.native
  trait GetBucketAccelerateConfigurationRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketAccelerateConfigurationRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketAccelerateConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketAccelerateConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketAclOutput extends js.Object {
    var Grants: js.UndefOr[Grants]
    var Owner: js.UndefOr[Owner]
  }

  object GetBucketAclOutput {
    def apply(
        Grants: js.UndefOr[Grants] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined
    ): GetBucketAclOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Grants.foreach(__v => __obj.update("Grants", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketAclOutput]
    }
  }

  @js.native
  trait GetBucketAclRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketAclRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketAclRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketAclRequest]
    }
  }

  @js.native
  trait GetBucketAnalyticsConfigurationOutput extends js.Object {
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfiguration]
  }

  object GetBucketAnalyticsConfigurationOutput {
    def apply(
        AnalyticsConfiguration: js.UndefOr[AnalyticsConfiguration] = js.undefined
    ): GetBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      AnalyticsConfiguration.foreach(__v => __obj.update("AnalyticsConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketAnalyticsConfigurationOutput]
    }
  }

  @js.native
  trait GetBucketAnalyticsConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: AnalyticsId
  }

  object GetBucketAnalyticsConfigurationRequest {
    def apply(
        Bucket: BucketName,
        Id: AnalyticsId
    ): GetBucketAnalyticsConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Id"     -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketAnalyticsConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketCorsOutput extends js.Object {
    var CORSRules: js.UndefOr[CORSRules]
  }

  object GetBucketCorsOutput {
    def apply(
        CORSRules: js.UndefOr[CORSRules] = js.undefined
    ): GetBucketCorsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      CORSRules.foreach(__v => __obj.update("CORSRules", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketCorsOutput]
    }
  }

  @js.native
  trait GetBucketCorsRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketCorsRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketCorsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketCorsRequest]
    }
  }

  @js.native
  trait GetBucketEncryptionOutput extends js.Object {
    var ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
  }

  object GetBucketEncryptionOutput {
    def apply(
        ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined
    ): GetBucketEncryptionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ServerSideEncryptionConfiguration.foreach(
        __v => __obj.update("ServerSideEncryptionConfiguration", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetBucketEncryptionOutput]
    }
  }

  @js.native
  trait GetBucketEncryptionRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketEncryptionRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketEncryptionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketEncryptionRequest]
    }
  }

  @js.native
  trait GetBucketInventoryConfigurationOutput extends js.Object {
    var InventoryConfiguration: js.UndefOr[InventoryConfiguration]
  }

  object GetBucketInventoryConfigurationOutput {
    def apply(
        InventoryConfiguration: js.UndefOr[InventoryConfiguration] = js.undefined
    ): GetBucketInventoryConfigurationOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      InventoryConfiguration.foreach(__v => __obj.update("InventoryConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
    }
  }

  @js.native
  trait GetBucketInventoryConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: InventoryId
  }

  object GetBucketInventoryConfigurationRequest {
    def apply(
        Bucket: BucketName,
        Id: InventoryId
    ): GetBucketInventoryConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Id"     -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketInventoryConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketLifecycleConfigurationOutput extends js.Object {
    var Rules: js.UndefOr[LifecycleRules]
  }

  object GetBucketLifecycleConfigurationOutput {
    def apply(
        Rules: js.UndefOr[LifecycleRules] = js.undefined
    ): GetBucketLifecycleConfigurationOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Rules.foreach(__v => __obj.update("Rules", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketLifecycleConfigurationOutput]
    }
  }

  @js.native
  trait GetBucketLifecycleConfigurationRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketLifecycleConfigurationRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketLifecycleConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketLifecycleConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketLifecycleOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  object GetBucketLifecycleOutput {
    def apply(
        Rules: js.UndefOr[Rules] = js.undefined
    ): GetBucketLifecycleOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Rules.foreach(__v => __obj.update("Rules", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketLifecycleOutput]
    }
  }

  @js.native
  trait GetBucketLifecycleRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketLifecycleRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketLifecycleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketLifecycleRequest]
    }
  }

  @js.native
  trait GetBucketLocationOutput extends js.Object {
    var LocationConstraint: js.UndefOr[BucketLocationConstraint]
  }

  object GetBucketLocationOutput {
    def apply(
        LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined
    ): GetBucketLocationOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      LocationConstraint.foreach(__v => __obj.update("LocationConstraint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketLocationOutput]
    }
  }

  @js.native
  trait GetBucketLocationRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketLocationRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketLocationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketLocationRequest]
    }
  }

  @js.native
  trait GetBucketLoggingOutput extends js.Object {
    var LoggingEnabled: js.UndefOr[LoggingEnabled]
  }

  object GetBucketLoggingOutput {
    def apply(
        LoggingEnabled: js.UndefOr[LoggingEnabled] = js.undefined
    ): GetBucketLoggingOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      LoggingEnabled.foreach(__v => __obj.update("LoggingEnabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketLoggingOutput]
    }
  }

  @js.native
  trait GetBucketLoggingRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketLoggingRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketLoggingRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketLoggingRequest]
    }
  }

  @js.native
  trait GetBucketMetricsConfigurationOutput extends js.Object {
    var MetricsConfiguration: js.UndefOr[MetricsConfiguration]
  }

  object GetBucketMetricsConfigurationOutput {
    def apply(
        MetricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined
    ): GetBucketMetricsConfigurationOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      MetricsConfiguration.foreach(__v => __obj.update("MetricsConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketMetricsConfigurationOutput]
    }
  }

  @js.native
  trait GetBucketMetricsConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: MetricsId
  }

  object GetBucketMetricsConfigurationRequest {
    def apply(
        Bucket: BucketName,
        Id: MetricsId
    ): GetBucketMetricsConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Id"     -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketMetricsConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketNotificationConfigurationRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketNotificationConfigurationRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketNotificationConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketNotificationConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketPolicyOutput extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object GetBucketPolicyOutput {
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): GetBucketPolicyOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketPolicyOutput]
    }
  }

  @js.native
  trait GetBucketPolicyRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketPolicyRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketPolicyRequest]
    }
  }

  @js.native
  trait GetBucketPolicyStatusOutput extends js.Object {
    var PolicyStatus: js.UndefOr[PolicyStatus]
  }

  object GetBucketPolicyStatusOutput {
    def apply(
        PolicyStatus: js.UndefOr[PolicyStatus] = js.undefined
    ): GetBucketPolicyStatusOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PolicyStatus.foreach(__v => __obj.update("PolicyStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketPolicyStatusOutput]
    }
  }

  @js.native
  trait GetBucketPolicyStatusRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketPolicyStatusRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketPolicyStatusRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketPolicyStatusRequest]
    }
  }

  @js.native
  trait GetBucketReplicationOutput extends js.Object {
    var ReplicationConfiguration: js.UndefOr[ReplicationConfiguration]
  }

  object GetBucketReplicationOutput {
    def apply(
        ReplicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.undefined
    ): GetBucketReplicationOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ReplicationConfiguration.foreach(__v => __obj.update("ReplicationConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketReplicationOutput]
    }
  }

  @js.native
  trait GetBucketReplicationRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketReplicationRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketReplicationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketReplicationRequest]
    }
  }

  @js.native
  trait GetBucketRequestPaymentOutput extends js.Object {
    var Payer: js.UndefOr[Payer]
  }

  object GetBucketRequestPaymentOutput {
    def apply(
        Payer: js.UndefOr[Payer] = js.undefined
    ): GetBucketRequestPaymentOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Payer.foreach(__v => __obj.update("Payer", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketRequestPaymentOutput]
    }
  }

  @js.native
  trait GetBucketRequestPaymentRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketRequestPaymentRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketRequestPaymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketRequestPaymentRequest]
    }
  }

  @js.native
  trait GetBucketTaggingOutput extends js.Object {
    var TagSet: TagSet
  }

  object GetBucketTaggingOutput {
    def apply(
        TagSet: TagSet
    ): GetBucketTaggingOutput = {
      val __obj = js.Dictionary[js.Any](
        "TagSet" -> TagSet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketTaggingOutput]
    }
  }

  @js.native
  trait GetBucketTaggingRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketTaggingRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketTaggingRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketTaggingRequest]
    }
  }

  @js.native
  trait GetBucketVersioningOutput extends js.Object {
    var MFADelete: js.UndefOr[MFADeleteStatus]
    var Status: js.UndefOr[BucketVersioningStatus]
  }

  object GetBucketVersioningOutput {
    def apply(
        MFADelete: js.UndefOr[MFADeleteStatus] = js.undefined,
        Status: js.UndefOr[BucketVersioningStatus] = js.undefined
    ): GetBucketVersioningOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      MFADelete.foreach(__v => __obj.update("MFADelete", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketVersioningOutput]
    }
  }

  @js.native
  trait GetBucketVersioningRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketVersioningRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketVersioningRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketVersioningRequest]
    }
  }

  @js.native
  trait GetBucketWebsiteOutput extends js.Object {
    var ErrorDocument: js.UndefOr[ErrorDocument]
    var IndexDocument: js.UndefOr[IndexDocument]
    var RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo]
    var RoutingRules: js.UndefOr[RoutingRules]
  }

  object GetBucketWebsiteOutput {
    def apply(
        ErrorDocument: js.UndefOr[ErrorDocument] = js.undefined,
        IndexDocument: js.UndefOr[IndexDocument] = js.undefined,
        RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo] = js.undefined,
        RoutingRules: js.UndefOr[RoutingRules] = js.undefined
    ): GetBucketWebsiteOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorDocument.foreach(__v => __obj.update("ErrorDocument", __v.asInstanceOf[js.Any]))
      IndexDocument.foreach(__v => __obj.update("IndexDocument", __v.asInstanceOf[js.Any]))
      RedirectAllRequestsTo.foreach(__v => __obj.update("RedirectAllRequestsTo", __v.asInstanceOf[js.Any]))
      RoutingRules.foreach(__v => __obj.update("RoutingRules", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketWebsiteOutput]
    }
  }

  @js.native
  trait GetBucketWebsiteRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketWebsiteRequest {
    def apply(
        Bucket: BucketName
    ): GetBucketWebsiteRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBucketWebsiteRequest]
    }
  }

  @js.native
  trait GetObjectAclOutput extends js.Object {
    var Grants: js.UndefOr[Grants]
    var Owner: js.UndefOr[Owner]
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object GetObjectAclOutput {
    def apply(
        Grants: js.UndefOr[Grants] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): GetObjectAclOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Grants.foreach(__v => __obj.update("Grants", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectAclOutput]
    }
  }

  @js.native
  trait GetObjectAclRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object GetObjectAclRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): GetObjectAclRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectAclRequest]
    }
  }

  @js.native
  trait GetObjectLegalHoldOutput extends js.Object {
    var LegalHold: js.UndefOr[ObjectLockLegalHold]
  }

  object GetObjectLegalHoldOutput {
    def apply(
        LegalHold: js.UndefOr[ObjectLockLegalHold] = js.undefined
    ): GetObjectLegalHoldOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      LegalHold.foreach(__v => __obj.update("LegalHold", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectLegalHoldOutput]
    }
  }

  @js.native
  trait GetObjectLegalHoldRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object GetObjectLegalHoldRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): GetObjectLegalHoldRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectLegalHoldRequest]
    }
  }

  @js.native
  trait GetObjectLockConfigurationOutput extends js.Object {
    var ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration]
  }

  object GetObjectLockConfigurationOutput {
    def apply(
        ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration] = js.undefined
    ): GetObjectLockConfigurationOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ObjectLockConfiguration.foreach(__v => __obj.update("ObjectLockConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectLockConfigurationOutput]
    }
  }

  @js.native
  trait GetObjectLockConfigurationRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetObjectLockConfigurationRequest {
    def apply(
        Bucket: BucketName
    ): GetObjectLockConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetObjectLockConfigurationRequest]
    }
  }

  @js.native
  trait GetObjectOutput extends js.Object {
    var AcceptRanges: js.UndefOr[AcceptRanges]
    var Body: js.UndefOr[Body]
    var CacheControl: js.UndefOr[CacheControl]
    var ContentDisposition: js.UndefOr[ContentDisposition]
    var ContentEncoding: js.UndefOr[ContentEncoding]
    var ContentLanguage: js.UndefOr[ContentLanguage]
    var ContentLength: js.UndefOr[ContentLength]
    var ContentRange: js.UndefOr[ContentRange]
    var ContentType: js.UndefOr[ContentType]
    var DeleteMarker: js.UndefOr[DeleteMarker]
    var ETag: js.UndefOr[ETag]
    var Expiration: js.UndefOr[Expiration]
    var Expires: js.UndefOr[Expires]
    var LastModified: js.UndefOr[LastModified]
    var Metadata: js.UndefOr[Metadata]
    var MissingMeta: js.UndefOr[MissingMeta]
    var ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus]
    var ObjectLockMode: js.UndefOr[ObjectLockMode]
    var ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate]
    var PartsCount: js.UndefOr[PartsCount]
    var ReplicationStatus: js.UndefOr[ReplicationStatus]
    var RequestCharged: js.UndefOr[RequestCharged]
    var Restore: js.UndefOr[Restore]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var StorageClass: js.UndefOr[StorageClass]
    var TagCount: js.UndefOr[TagCount]
    var VersionId: js.UndefOr[ObjectVersionId]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
  }

  object GetObjectOutput {
    def apply(
        AcceptRanges: js.UndefOr[AcceptRanges] = js.undefined,
        Body: js.UndefOr[Body] = js.undefined,
        CacheControl: js.UndefOr[CacheControl] = js.undefined,
        ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined,
        ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined,
        ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined,
        ContentLength: js.UndefOr[ContentLength] = js.undefined,
        ContentRange: js.UndefOr[ContentRange] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined,
        ETag: js.UndefOr[ETag] = js.undefined,
        Expiration: js.UndefOr[Expiration] = js.undefined,
        Expires: js.UndefOr[Expires] = js.undefined,
        LastModified: js.UndefOr[LastModified] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        MissingMeta: js.UndefOr[MissingMeta] = js.undefined,
        ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined,
        ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined,
        ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate] = js.undefined,
        PartsCount: js.UndefOr[PartsCount] = js.undefined,
        ReplicationStatus: js.UndefOr[ReplicationStatus] = js.undefined,
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
        Restore: js.UndefOr[Restore] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
        SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
        ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined,
        TagCount: js.UndefOr[TagCount] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
        WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined
    ): GetObjectOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceptRanges.foreach(__v => __obj.update("AcceptRanges", __v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      CacheControl.foreach(__v => __obj.update("CacheControl", __v.asInstanceOf[js.Any]))
      ContentDisposition.foreach(__v => __obj.update("ContentDisposition", __v.asInstanceOf[js.Any]))
      ContentEncoding.foreach(__v => __obj.update("ContentEncoding", __v.asInstanceOf[js.Any]))
      ContentLanguage.foreach(__v => __obj.update("ContentLanguage", __v.asInstanceOf[js.Any]))
      ContentLength.foreach(__v => __obj.update("ContentLength", __v.asInstanceOf[js.Any]))
      ContentRange.foreach(__v => __obj.update("ContentRange", __v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.update("ContentType", __v.asInstanceOf[js.Any]))
      DeleteMarker.foreach(__v => __obj.update("DeleteMarker", __v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      Expiration.foreach(__v => __obj.update("Expiration", __v.asInstanceOf[js.Any]))
      Expires.foreach(__v => __obj.update("Expires", __v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.update("LastModified", __v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.update("Metadata", __v.asInstanceOf[js.Any]))
      MissingMeta.foreach(__v => __obj.update("MissingMeta", __v.asInstanceOf[js.Any]))
      ObjectLockLegalHoldStatus.foreach(__v => __obj.update("ObjectLockLegalHoldStatus", __v.asInstanceOf[js.Any]))
      ObjectLockMode.foreach(__v => __obj.update("ObjectLockMode", __v.asInstanceOf[js.Any]))
      ObjectLockRetainUntilDate.foreach(__v => __obj.update("ObjectLockRetainUntilDate", __v.asInstanceOf[js.Any]))
      PartsCount.foreach(__v => __obj.update("PartsCount", __v.asInstanceOf[js.Any]))
      ReplicationStatus.foreach(__v => __obj.update("ReplicationStatus", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      Restore.foreach(__v => __obj.update("Restore", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      SSEKMSKeyId.foreach(__v => __obj.update("SSEKMSKeyId", __v.asInstanceOf[js.Any]))
      ServerSideEncryption.foreach(__v => __obj.update("ServerSideEncryption", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      TagCount.foreach(__v => __obj.update("TagCount", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      WebsiteRedirectLocation.foreach(__v => __obj.update("WebsiteRedirectLocation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectOutput]
    }
  }

  @js.native
  trait GetObjectRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var IfMatch: js.UndefOr[IfMatch]
    var IfModifiedSince: js.UndefOr[IfModifiedSince]
    var IfNoneMatch: js.UndefOr[IfNoneMatch]
    var IfUnmodifiedSince: js.UndefOr[IfUnmodifiedSince]
    var PartNumber: js.UndefOr[PartNumber]
    var Range: js.UndefOr[Range]
    var RequestPayer: js.UndefOr[RequestPayer]
    var ResponseCacheControl: js.UndefOr[ResponseCacheControl]
    var ResponseContentDisposition: js.UndefOr[ResponseContentDisposition]
    var ResponseContentEncoding: js.UndefOr[ResponseContentEncoding]
    var ResponseContentLanguage: js.UndefOr[ResponseContentLanguage]
    var ResponseContentType: js.UndefOr[ResponseContentType]
    var ResponseExpires: js.UndefOr[ResponseExpires]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object GetObjectRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        IfMatch: js.UndefOr[IfMatch] = js.undefined,
        IfModifiedSince: js.UndefOr[IfModifiedSince] = js.undefined,
        IfNoneMatch: js.UndefOr[IfNoneMatch] = js.undefined,
        IfUnmodifiedSince: js.UndefOr[IfUnmodifiedSince] = js.undefined,
        PartNumber: js.UndefOr[PartNumber] = js.undefined,
        Range: js.UndefOr[Range] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        ResponseCacheControl: js.UndefOr[ResponseCacheControl] = js.undefined,
        ResponseContentDisposition: js.UndefOr[ResponseContentDisposition] = js.undefined,
        ResponseContentEncoding: js.UndefOr[ResponseContentEncoding] = js.undefined,
        ResponseContentLanguage: js.UndefOr[ResponseContentLanguage] = js.undefined,
        ResponseContentType: js.UndefOr[ResponseContentType] = js.undefined,
        ResponseExpires: js.UndefOr[ResponseExpires] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): GetObjectRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      IfModifiedSince.foreach(__v => __obj.update("IfModifiedSince", __v.asInstanceOf[js.Any]))
      IfNoneMatch.foreach(__v => __obj.update("IfNoneMatch", __v.asInstanceOf[js.Any]))
      IfUnmodifiedSince.foreach(__v => __obj.update("IfUnmodifiedSince", __v.asInstanceOf[js.Any]))
      PartNumber.foreach(__v => __obj.update("PartNumber", __v.asInstanceOf[js.Any]))
      Range.foreach(__v => __obj.update("Range", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      ResponseCacheControl.foreach(__v => __obj.update("ResponseCacheControl", __v.asInstanceOf[js.Any]))
      ResponseContentDisposition.foreach(__v => __obj.update("ResponseContentDisposition", __v.asInstanceOf[js.Any]))
      ResponseContentEncoding.foreach(__v => __obj.update("ResponseContentEncoding", __v.asInstanceOf[js.Any]))
      ResponseContentLanguage.foreach(__v => __obj.update("ResponseContentLanguage", __v.asInstanceOf[js.Any]))
      ResponseContentType.foreach(__v => __obj.update("ResponseContentType", __v.asInstanceOf[js.Any]))
      ResponseExpires.foreach(__v => __obj.update("ResponseExpires", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKey.foreach(__v => __obj.update("SSECustomerKey", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectRequest]
    }
  }

  @js.native
  trait GetObjectRetentionOutput extends js.Object {
    var Retention: js.UndefOr[ObjectLockRetention]
  }

  object GetObjectRetentionOutput {
    def apply(
        Retention: js.UndefOr[ObjectLockRetention] = js.undefined
    ): GetObjectRetentionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Retention.foreach(__v => __obj.update("Retention", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectRetentionOutput]
    }
  }

  @js.native
  trait GetObjectRetentionRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object GetObjectRetentionRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): GetObjectRetentionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectRetentionRequest]
    }
  }

  @js.native
  trait GetObjectTaggingOutput extends js.Object {
    var TagSet: TagSet
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object GetObjectTaggingOutput {
    def apply(
        TagSet: TagSet,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): GetObjectTaggingOutput = {
      val __obj = js.Dictionary[js.Any](
        "TagSet" -> TagSet.asInstanceOf[js.Any]
      )

      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectTaggingOutput]
    }
  }

  @js.native
  trait GetObjectTaggingRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object GetObjectTaggingRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): GetObjectTaggingRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectTaggingRequest]
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
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): GetObjectTorrentOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectTorrentOutput]
    }
  }

  @js.native
  trait GetObjectTorrentRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  object GetObjectTorrentRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    ): GetObjectTorrentRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectTorrentRequest]
    }
  }

  @js.native
  trait GetPublicAccessBlockOutput extends js.Object {
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration]
  }

  object GetPublicAccessBlockOutput {
    def apply(
        PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined
    ): GetPublicAccessBlockOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      PublicAccessBlockConfiguration.foreach(
        __v => __obj.update("PublicAccessBlockConfiguration", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetPublicAccessBlockOutput]
    }
  }

  @js.native
  trait GetPublicAccessBlockRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetPublicAccessBlockRequest {
    def apply(
        Bucket: BucketName
    ): GetPublicAccessBlockRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPublicAccessBlockRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait GlacierJobParameters extends js.Object {
    var Tier: Tier
  }

  object GlacierJobParameters {
    def apply(
        Tier: Tier
    ): GlacierJobParameters = {
      val __obj = js.Dictionary[js.Any](
        "Tier" -> Tier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GlacierJobParameters]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Grant extends js.Object {
    var Grantee: js.UndefOr[Grantee]
    var Permission: js.UndefOr[Permission]
  }

  object Grant {
    def apply(
        Grantee: js.UndefOr[Grantee] = js.undefined,
        Permission: js.UndefOr[Permission] = js.undefined
    ): Grant = {
      val __obj = js.Dictionary.empty[js.Any]
      Grantee.foreach(__v => __obj.update("Grantee", __v.asInstanceOf[js.Any]))
      Permission.foreach(__v => __obj.update("Permission", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Grant]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Grantee extends js.Object {
    var Type: Type
    var DisplayName: js.UndefOr[DisplayName]
    var EmailAddress: js.UndefOr[EmailAddress]
    var ID: js.UndefOr[ID]
    var URI: js.UndefOr[URI]
  }

  object Grantee {
    def apply(
        Type: Type,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        ID: js.UndefOr[ID] = js.undefined,
        URI: js.UndefOr[URI] = js.undefined
    ): Grantee = {
      val __obj = js.Dictionary[js.Any](
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.update("DisplayName", __v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.update("EmailAddress", __v.asInstanceOf[js.Any]))
      ID.foreach(__v => __obj.update("ID", __v.asInstanceOf[js.Any]))
      URI.foreach(__v => __obj.update("URI", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Grantee]
    }
  }

  @js.native
  trait HeadBucketRequest extends js.Object {
    var Bucket: BucketName
  }

  object HeadBucketRequest {
    def apply(
        Bucket: BucketName
    ): HeadBucketRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HeadBucketRequest]
    }
  }

  @js.native
  trait HeadObjectOutput extends js.Object {
    var AcceptRanges: js.UndefOr[AcceptRanges]
    var CacheControl: js.UndefOr[CacheControl]
    var ContentDisposition: js.UndefOr[ContentDisposition]
    var ContentEncoding: js.UndefOr[ContentEncoding]
    var ContentLanguage: js.UndefOr[ContentLanguage]
    var ContentLength: js.UndefOr[ContentLength]
    var ContentType: js.UndefOr[ContentType]
    var DeleteMarker: js.UndefOr[DeleteMarker]
    var ETag: js.UndefOr[ETag]
    var Expiration: js.UndefOr[Expiration]
    var Expires: js.UndefOr[Expires]
    var LastModified: js.UndefOr[LastModified]
    var Metadata: js.UndefOr[Metadata]
    var MissingMeta: js.UndefOr[MissingMeta]
    var ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus]
    var ObjectLockMode: js.UndefOr[ObjectLockMode]
    var ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate]
    var PartsCount: js.UndefOr[PartsCount]
    var ReplicationStatus: js.UndefOr[ReplicationStatus]
    var RequestCharged: js.UndefOr[RequestCharged]
    var Restore: js.UndefOr[Restore]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var StorageClass: js.UndefOr[StorageClass]
    var VersionId: js.UndefOr[ObjectVersionId]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
  }

  object HeadObjectOutput {
    def apply(
        AcceptRanges: js.UndefOr[AcceptRanges] = js.undefined,
        CacheControl: js.UndefOr[CacheControl] = js.undefined,
        ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined,
        ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined,
        ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined,
        ContentLength: js.UndefOr[ContentLength] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined,
        ETag: js.UndefOr[ETag] = js.undefined,
        Expiration: js.UndefOr[Expiration] = js.undefined,
        Expires: js.UndefOr[Expires] = js.undefined,
        LastModified: js.UndefOr[LastModified] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        MissingMeta: js.UndefOr[MissingMeta] = js.undefined,
        ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined,
        ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined,
        ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate] = js.undefined,
        PartsCount: js.UndefOr[PartsCount] = js.undefined,
        ReplicationStatus: js.UndefOr[ReplicationStatus] = js.undefined,
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
        Restore: js.UndefOr[Restore] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
        SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
        ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
        WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined
    ): HeadObjectOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      AcceptRanges.foreach(__v => __obj.update("AcceptRanges", __v.asInstanceOf[js.Any]))
      CacheControl.foreach(__v => __obj.update("CacheControl", __v.asInstanceOf[js.Any]))
      ContentDisposition.foreach(__v => __obj.update("ContentDisposition", __v.asInstanceOf[js.Any]))
      ContentEncoding.foreach(__v => __obj.update("ContentEncoding", __v.asInstanceOf[js.Any]))
      ContentLanguage.foreach(__v => __obj.update("ContentLanguage", __v.asInstanceOf[js.Any]))
      ContentLength.foreach(__v => __obj.update("ContentLength", __v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.update("ContentType", __v.asInstanceOf[js.Any]))
      DeleteMarker.foreach(__v => __obj.update("DeleteMarker", __v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      Expiration.foreach(__v => __obj.update("Expiration", __v.asInstanceOf[js.Any]))
      Expires.foreach(__v => __obj.update("Expires", __v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.update("LastModified", __v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.update("Metadata", __v.asInstanceOf[js.Any]))
      MissingMeta.foreach(__v => __obj.update("MissingMeta", __v.asInstanceOf[js.Any]))
      ObjectLockLegalHoldStatus.foreach(__v => __obj.update("ObjectLockLegalHoldStatus", __v.asInstanceOf[js.Any]))
      ObjectLockMode.foreach(__v => __obj.update("ObjectLockMode", __v.asInstanceOf[js.Any]))
      ObjectLockRetainUntilDate.foreach(__v => __obj.update("ObjectLockRetainUntilDate", __v.asInstanceOf[js.Any]))
      PartsCount.foreach(__v => __obj.update("PartsCount", __v.asInstanceOf[js.Any]))
      ReplicationStatus.foreach(__v => __obj.update("ReplicationStatus", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      Restore.foreach(__v => __obj.update("Restore", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      SSEKMSKeyId.foreach(__v => __obj.update("SSEKMSKeyId", __v.asInstanceOf[js.Any]))
      ServerSideEncryption.foreach(__v => __obj.update("ServerSideEncryption", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      WebsiteRedirectLocation.foreach(__v => __obj.update("WebsiteRedirectLocation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HeadObjectOutput]
    }
  }

  @js.native
  trait HeadObjectRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var IfMatch: js.UndefOr[IfMatch]
    var IfModifiedSince: js.UndefOr[IfModifiedSince]
    var IfNoneMatch: js.UndefOr[IfNoneMatch]
    var IfUnmodifiedSince: js.UndefOr[IfUnmodifiedSince]
    var PartNumber: js.UndefOr[PartNumber]
    var Range: js.UndefOr[Range]
    var RequestPayer: js.UndefOr[RequestPayer]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object HeadObjectRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        IfMatch: js.UndefOr[IfMatch] = js.undefined,
        IfModifiedSince: js.UndefOr[IfModifiedSince] = js.undefined,
        IfNoneMatch: js.UndefOr[IfNoneMatch] = js.undefined,
        IfUnmodifiedSince: js.UndefOr[IfUnmodifiedSince] = js.undefined,
        PartNumber: js.UndefOr[PartNumber] = js.undefined,
        Range: js.UndefOr[Range] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): HeadObjectRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      IfModifiedSince.foreach(__v => __obj.update("IfModifiedSince", __v.asInstanceOf[js.Any]))
      IfNoneMatch.foreach(__v => __obj.update("IfNoneMatch", __v.asInstanceOf[js.Any]))
      IfUnmodifiedSince.foreach(__v => __obj.update("IfUnmodifiedSince", __v.asInstanceOf[js.Any]))
      PartNumber.foreach(__v => __obj.update("PartNumber", __v.asInstanceOf[js.Any]))
      Range.foreach(__v => __obj.update("Range", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKey.foreach(__v => __obj.update("SSECustomerKey", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HeadObjectRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait IndexDocument extends js.Object {
    var Suffix: Suffix
  }

  object IndexDocument {
    def apply(
        Suffix: Suffix
    ): IndexDocument = {
      val __obj = js.Dictionary[js.Any](
        "Suffix" -> Suffix.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[IndexDocument]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Initiator extends js.Object {
    var DisplayName: js.UndefOr[DisplayName]
    var ID: js.UndefOr[ID]
  }

  object Initiator {
    def apply(
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        ID: js.UndefOr[ID] = js.undefined
    ): Initiator = {
      val __obj = js.Dictionary.empty[js.Any]
      DisplayName.foreach(__v => __obj.update("DisplayName", __v.asInstanceOf[js.Any]))
      ID.foreach(__v => __obj.update("ID", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Initiator]
    }
  }

  /**
    * Describes the serialization format of the object.
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
        Parquet: js.UndefOr[ParquetInput] = js.undefined
    ): InputSerialization = {
      val __obj = js.Dictionary.empty[js.Any]
      CSV.foreach(__v => __obj.update("CSV", __v.asInstanceOf[js.Any]))
      CompressionType.foreach(__v => __obj.update("CompressionType", __v.asInstanceOf[js.Any]))
      JSON.foreach(__v => __obj.update("JSON", __v.asInstanceOf[js.Any]))
      Parquet.foreach(__v => __obj.update("Parquet", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputSerialization]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait InventoryConfiguration extends js.Object {
    var Destination: InventoryDestination
    var Id: InventoryId
    var IncludedObjectVersions: InventoryIncludedObjectVersions
    var IsEnabled: IsEnabled
    var Schedule: InventorySchedule
    var Filter: js.UndefOr[InventoryFilter]
    var OptionalFields: js.UndefOr[InventoryOptionalFields]
  }

  object InventoryConfiguration {
    def apply(
        Destination: InventoryDestination,
        Id: InventoryId,
        IncludedObjectVersions: InventoryIncludedObjectVersions,
        IsEnabled: IsEnabled,
        Schedule: InventorySchedule,
        Filter: js.UndefOr[InventoryFilter] = js.undefined,
        OptionalFields: js.UndefOr[InventoryOptionalFields] = js.undefined
    ): InventoryConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Destination"            -> Destination.asInstanceOf[js.Any],
        "Id"                     -> Id.asInstanceOf[js.Any],
        "IncludedObjectVersions" -> IncludedObjectVersions.asInstanceOf[js.Any],
        "IsEnabled"              -> IsEnabled.asInstanceOf[js.Any],
        "Schedule"               -> Schedule.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      OptionalFields.foreach(__v => __obj.update("OptionalFields", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait InventoryDestination extends js.Object {
    var S3BucketDestination: InventoryS3BucketDestination
  }

  object InventoryDestination {
    def apply(
        S3BucketDestination: InventoryS3BucketDestination
    ): InventoryDestination = {
      val __obj = js.Dictionary[js.Any](
        "S3BucketDestination" -> S3BucketDestination.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InventoryDestination]
    }
  }

  /**
    * Contains the type of server-side encryption used to encrypt the inventory results.
    */
  @js.native
  trait InventoryEncryption extends js.Object {
    var SSEKMS: js.UndefOr[SSEKMS]
    var SSES3: js.UndefOr[SSES3]
  }

  object InventoryEncryption {
    def apply(
        SSEKMS: js.UndefOr[SSEKMS] = js.undefined,
        SSES3: js.UndefOr[SSES3] = js.undefined
    ): InventoryEncryption = {
      val __obj = js.Dictionary.empty[js.Any]
      SSEKMS.foreach(__v => __obj.update("SSEKMS", __v.asInstanceOf[js.Any]))
      SSES3.foreach(__v => __obj.update("SSES3", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryEncryption]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait InventoryFilter extends js.Object {
    var Prefix: Prefix
  }

  object InventoryFilter {
    def apply(
        Prefix: Prefix
    ): InventoryFilter = {
      val __obj = js.Dictionary[js.Any](
        "Prefix" -> Prefix.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InventoryFilter]
    }
  }

  object InventoryFormatEnum {
    val CSV     = "CSV"
    val ORC     = "ORC"
    val Parquet = "Parquet"

    val values = IndexedSeq(CSV, ORC, Parquet)
  }

  object InventoryFrequencyEnum {
    val Daily  = "Daily"
    val Weekly = "Weekly"

    val values = IndexedSeq(Daily, Weekly)
  }

  object InventoryIncludedObjectVersionsEnum {
    val All     = "All"
    val Current = "Current"

    val values = IndexedSeq(All, Current)
  }

  object InventoryOptionalFieldEnum {
    val Size                      = "Size"
    val LastModifiedDate          = "LastModifiedDate"
    val StorageClass              = "StorageClass"
    val ETag                      = "ETag"
    val IsMultipartUploaded       = "IsMultipartUploaded"
    val ReplicationStatus         = "ReplicationStatus"
    val EncryptionStatus          = "EncryptionStatus"
    val ObjectLockRetainUntilDate = "ObjectLockRetainUntilDate"
    val ObjectLockMode            = "ObjectLockMode"
    val ObjectLockLegalHoldStatus = "ObjectLockLegalHoldStatus"

    val values = IndexedSeq(
      Size,
      LastModifiedDate,
      StorageClass,
      ETag,
      IsMultipartUploaded,
      ReplicationStatus,
      EncryptionStatus,
      ObjectLockRetainUntilDate,
      ObjectLockMode,
      ObjectLockLegalHoldStatus
    )
  }

  /**
    * <p/>
    */
  @js.native
  trait InventoryS3BucketDestination extends js.Object {
    var Bucket: BucketName
    var Format: InventoryFormat
    var AccountId: js.UndefOr[AccountId]
    var Encryption: js.UndefOr[InventoryEncryption]
    var Prefix: js.UndefOr[Prefix]
  }

  object InventoryS3BucketDestination {
    def apply(
        Bucket: BucketName,
        Format: InventoryFormat,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Encryption: js.UndefOr[InventoryEncryption] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined
    ): InventoryS3BucketDestination = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.update("Encryption", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryS3BucketDestination]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait InventorySchedule extends js.Object {
    var Frequency: InventoryFrequency
  }

  object InventorySchedule {
    def apply(
        Frequency: InventoryFrequency
    ): InventorySchedule = {
      val __obj = js.Dictionary[js.Any](
        "Frequency" -> Frequency.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InventorySchedule]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait JSONInput extends js.Object {
    var Type: js.UndefOr[JSONType]
  }

  object JSONInput {
    def apply(
        Type: js.UndefOr[JSONType] = js.undefined
    ): JSONInput = {
      val __obj = js.Dictionary.empty[js.Any]
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JSONInput]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait JSONOutput extends js.Object {
    var RecordDelimiter: js.UndefOr[RecordDelimiter]
  }

  object JSONOutput {
    def apply(
        RecordDelimiter: js.UndefOr[RecordDelimiter] = js.undefined
    ): JSONOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RecordDelimiter.foreach(__v => __obj.update("RecordDelimiter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JSONOutput]
    }
  }

  object JSONTypeEnum {
    val DOCUMENT = "DOCUMENT"
    val LINES    = "LINES"

    val values = IndexedSeq(DOCUMENT, LINES)
  }

  /**
    * A container for specifying the configuration for AWS Lambda notifications.
    */
  @js.native
  trait LambdaFunctionConfiguration extends js.Object {
    var Events: EventList
    var LambdaFunctionArn: LambdaFunctionArn
    var Filter: js.UndefOr[NotificationConfigurationFilter]
    var Id: js.UndefOr[NotificationId]
  }

  object LambdaFunctionConfiguration {
    def apply(
        Events: EventList,
        LambdaFunctionArn: LambdaFunctionArn,
        Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined,
        Id: js.UndefOr[NotificationId] = js.undefined
    ): LambdaFunctionConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Events"            -> Events.asInstanceOf[js.Any],
        "LambdaFunctionArn" -> LambdaFunctionArn.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait LifecycleConfiguration extends js.Object {
    var Rules: Rules
  }

  object LifecycleConfiguration {
    def apply(
        Rules: Rules
    ): LifecycleConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Rules" -> Rules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LifecycleConfiguration]
    }
  }

  /**
    * <p/>
    */
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
        ExpiredObjectDeleteMarker: js.UndefOr[ExpiredObjectDeleteMarker] = js.undefined
    ): LifecycleExpiration = {
      val __obj = js.Dictionary.empty[js.Any]
      Date.foreach(__v => __obj.update("Date", __v.asInstanceOf[js.Any]))
      Days.foreach(__v => __obj.update("Days", __v.asInstanceOf[js.Any]))
      ExpiredObjectDeleteMarker.foreach(__v => __obj.update("ExpiredObjectDeleteMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleExpiration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait LifecycleRule extends js.Object {
    var Status: ExpirationStatus
    var AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload]
    var Expiration: js.UndefOr[LifecycleExpiration]
    var Filter: js.UndefOr[LifecycleRuleFilter]
    var ID: js.UndefOr[ID]
    var NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration]
    var NoncurrentVersionTransitions: js.UndefOr[NoncurrentVersionTransitionList]
    var Prefix: js.UndefOr[Prefix]
    var Transitions: js.UndefOr[TransitionList]
  }

  object LifecycleRule {
    def apply(
        Status: ExpirationStatus,
        AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload] = js.undefined,
        Expiration: js.UndefOr[LifecycleExpiration] = js.undefined,
        Filter: js.UndefOr[LifecycleRuleFilter] = js.undefined,
        ID: js.UndefOr[ID] = js.undefined,
        NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration] = js.undefined,
        NoncurrentVersionTransitions: js.UndefOr[NoncurrentVersionTransitionList] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        Transitions: js.UndefOr[TransitionList] = js.undefined
    ): LifecycleRule = {
      val __obj = js.Dictionary[js.Any](
        "Status" -> Status.asInstanceOf[js.Any]
      )

      AbortIncompleteMultipartUpload.foreach(
        __v => __obj.update("AbortIncompleteMultipartUpload", __v.asInstanceOf[js.Any])
      )
      Expiration.foreach(__v => __obj.update("Expiration", __v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      ID.foreach(__v => __obj.update("ID", __v.asInstanceOf[js.Any]))
      NoncurrentVersionExpiration.foreach(__v => __obj.update("NoncurrentVersionExpiration", __v.asInstanceOf[js.Any]))
      NoncurrentVersionTransitions.foreach(
        __v => __obj.update("NoncurrentVersionTransitions", __v.asInstanceOf[js.Any])
      )
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      Transitions.foreach(__v => __obj.update("Transitions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleRule]
    }
  }

  /**
    * This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.
    */
  @js.native
  trait LifecycleRuleAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[TagSet]
  }

  object LifecycleRuleAndOperator {
    def apply(
        Prefix: js.UndefOr[Prefix] = js.undefined,
        Tags: js.UndefOr[TagSet] = js.undefined
    ): LifecycleRuleAndOperator = {
      val __obj = js.Dictionary.empty[js.Any]
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleRuleAndOperator]
    }
  }

  /**
    * The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.
    */
  @js.native
  trait LifecycleRuleFilter extends js.Object {
    var And: js.UndefOr[LifecycleRuleAndOperator]
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[Tag]
  }

  object LifecycleRuleFilter {
    def apply(
        And: js.UndefOr[LifecycleRuleAndOperator] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        Tag: js.UndefOr[Tag] = js.undefined
    ): LifecycleRuleFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      And.foreach(__v => __obj.update("And", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      Tag.foreach(__v => __obj.update("Tag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleRuleFilter]
    }
  }

  @js.native
  trait ListBucketAnalyticsConfigurationsOutput extends js.Object {
    var AnalyticsConfigurationList: js.UndefOr[AnalyticsConfigurationList]
    var ContinuationToken: js.UndefOr[Token]
    var IsTruncated: js.UndefOr[IsTruncated]
    var NextContinuationToken: js.UndefOr[NextToken]
  }

  object ListBucketAnalyticsConfigurationsOutput {
    def apply(
        AnalyticsConfigurationList: js.UndefOr[AnalyticsConfigurationList] = js.undefined,
        ContinuationToken: js.UndefOr[Token] = js.undefined,
        IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
        NextContinuationToken: js.UndefOr[NextToken] = js.undefined
    ): ListBucketAnalyticsConfigurationsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      AnalyticsConfigurationList.foreach(__v => __obj.update("AnalyticsConfigurationList", __v.asInstanceOf[js.Any]))
      ContinuationToken.foreach(__v => __obj.update("ContinuationToken", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      NextContinuationToken.foreach(__v => __obj.update("NextContinuationToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
    }
  }

  @js.native
  trait ListBucketAnalyticsConfigurationsRequest extends js.Object {
    var Bucket: BucketName
    var ContinuationToken: js.UndefOr[Token]
  }

  object ListBucketAnalyticsConfigurationsRequest {
    def apply(
        Bucket: BucketName,
        ContinuationToken: js.UndefOr[Token] = js.undefined
    ): ListBucketAnalyticsConfigurationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      ContinuationToken.foreach(__v => __obj.update("ContinuationToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBucketAnalyticsConfigurationsRequest]
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
        NextContinuationToken: js.UndefOr[NextToken] = js.undefined
    ): ListBucketInventoryConfigurationsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ContinuationToken.foreach(__v => __obj.update("ContinuationToken", __v.asInstanceOf[js.Any]))
      InventoryConfigurationList.foreach(__v => __obj.update("InventoryConfigurationList", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      NextContinuationToken.foreach(__v => __obj.update("NextContinuationToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBucketInventoryConfigurationsOutput]
    }
  }

  @js.native
  trait ListBucketInventoryConfigurationsRequest extends js.Object {
    var Bucket: BucketName
    var ContinuationToken: js.UndefOr[Token]
  }

  object ListBucketInventoryConfigurationsRequest {
    def apply(
        Bucket: BucketName,
        ContinuationToken: js.UndefOr[Token] = js.undefined
    ): ListBucketInventoryConfigurationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      ContinuationToken.foreach(__v => __obj.update("ContinuationToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBucketInventoryConfigurationsRequest]
    }
  }

  @js.native
  trait ListBucketMetricsConfigurationsOutput extends js.Object {
    var ContinuationToken: js.UndefOr[Token]
    var IsTruncated: js.UndefOr[IsTruncated]
    var MetricsConfigurationList: js.UndefOr[MetricsConfigurationList]
    var NextContinuationToken: js.UndefOr[NextToken]
  }

  object ListBucketMetricsConfigurationsOutput {
    def apply(
        ContinuationToken: js.UndefOr[Token] = js.undefined,
        IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
        MetricsConfigurationList: js.UndefOr[MetricsConfigurationList] = js.undefined,
        NextContinuationToken: js.UndefOr[NextToken] = js.undefined
    ): ListBucketMetricsConfigurationsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ContinuationToken.foreach(__v => __obj.update("ContinuationToken", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      MetricsConfigurationList.foreach(__v => __obj.update("MetricsConfigurationList", __v.asInstanceOf[js.Any]))
      NextContinuationToken.foreach(__v => __obj.update("NextContinuationToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBucketMetricsConfigurationsOutput]
    }
  }

  @js.native
  trait ListBucketMetricsConfigurationsRequest extends js.Object {
    var Bucket: BucketName
    var ContinuationToken: js.UndefOr[Token]
  }

  object ListBucketMetricsConfigurationsRequest {
    def apply(
        Bucket: BucketName,
        ContinuationToken: js.UndefOr[Token] = js.undefined
    ): ListBucketMetricsConfigurationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      ContinuationToken.foreach(__v => __obj.update("ContinuationToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBucketMetricsConfigurationsRequest]
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
        Owner: js.UndefOr[Owner] = js.undefined
    ): ListBucketsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Buckets.foreach(__v => __obj.update("Buckets", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBucketsOutput]
    }
  }

  @js.native
  trait ListMultipartUploadsOutput extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var CommonPrefixes: js.UndefOr[CommonPrefixList]
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var IsTruncated: js.UndefOr[IsTruncated]
    var KeyMarker: js.UndefOr[KeyMarker]
    var MaxUploads: js.UndefOr[MaxUploads]
    var NextKeyMarker: js.UndefOr[NextKeyMarker]
    var NextUploadIdMarker: js.UndefOr[NextUploadIdMarker]
    var Prefix: js.UndefOr[Prefix]
    var UploadIdMarker: js.UndefOr[UploadIdMarker]
    var Uploads: js.UndefOr[MultipartUploadList]
  }

  object ListMultipartUploadsOutput {
    def apply(
        Bucket: js.UndefOr[BucketName] = js.undefined,
        CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined,
        Delimiter: js.UndefOr[Delimiter] = js.undefined,
        EncodingType: js.UndefOr[EncodingType] = js.undefined,
        IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
        KeyMarker: js.UndefOr[KeyMarker] = js.undefined,
        MaxUploads: js.UndefOr[MaxUploads] = js.undefined,
        NextKeyMarker: js.UndefOr[NextKeyMarker] = js.undefined,
        NextUploadIdMarker: js.UndefOr[NextUploadIdMarker] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        UploadIdMarker: js.UndefOr[UploadIdMarker] = js.undefined,
        Uploads: js.UndefOr[MultipartUploadList] = js.undefined
    ): ListMultipartUploadsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Bucket.foreach(__v => __obj.update("Bucket", __v.asInstanceOf[js.Any]))
      CommonPrefixes.foreach(__v => __obj.update("CommonPrefixes", __v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.update("Delimiter", __v.asInstanceOf[js.Any]))
      EncodingType.foreach(__v => __obj.update("EncodingType", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      KeyMarker.foreach(__v => __obj.update("KeyMarker", __v.asInstanceOf[js.Any]))
      MaxUploads.foreach(__v => __obj.update("MaxUploads", __v.asInstanceOf[js.Any]))
      NextKeyMarker.foreach(__v => __obj.update("NextKeyMarker", __v.asInstanceOf[js.Any]))
      NextUploadIdMarker.foreach(__v => __obj.update("NextUploadIdMarker", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      UploadIdMarker.foreach(__v => __obj.update("UploadIdMarker", __v.asInstanceOf[js.Any]))
      Uploads.foreach(__v => __obj.update("Uploads", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMultipartUploadsOutput]
    }
  }

  @js.native
  trait ListMultipartUploadsRequest extends js.Object {
    var Bucket: BucketName
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var KeyMarker: js.UndefOr[KeyMarker]
    var MaxUploads: js.UndefOr[MaxUploads]
    var Prefix: js.UndefOr[Prefix]
    var UploadIdMarker: js.UndefOr[UploadIdMarker]
  }

  object ListMultipartUploadsRequest {
    def apply(
        Bucket: BucketName,
        Delimiter: js.UndefOr[Delimiter] = js.undefined,
        EncodingType: js.UndefOr[EncodingType] = js.undefined,
        KeyMarker: js.UndefOr[KeyMarker] = js.undefined,
        MaxUploads: js.UndefOr[MaxUploads] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        UploadIdMarker: js.UndefOr[UploadIdMarker] = js.undefined
    ): ListMultipartUploadsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      Delimiter.foreach(__v => __obj.update("Delimiter", __v.asInstanceOf[js.Any]))
      EncodingType.foreach(__v => __obj.update("EncodingType", __v.asInstanceOf[js.Any]))
      KeyMarker.foreach(__v => __obj.update("KeyMarker", __v.asInstanceOf[js.Any]))
      MaxUploads.foreach(__v => __obj.update("MaxUploads", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      UploadIdMarker.foreach(__v => __obj.update("UploadIdMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMultipartUploadsRequest]
    }
  }

  @js.native
  trait ListObjectVersionsOutput extends js.Object {
    var CommonPrefixes: js.UndefOr[CommonPrefixList]
    var DeleteMarkers: js.UndefOr[DeleteMarkers]
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var IsTruncated: js.UndefOr[IsTruncated]
    var KeyMarker: js.UndefOr[KeyMarker]
    var MaxKeys: js.UndefOr[MaxKeys]
    var Name: js.UndefOr[BucketName]
    var NextKeyMarker: js.UndefOr[NextKeyMarker]
    var NextVersionIdMarker: js.UndefOr[NextVersionIdMarker]
    var Prefix: js.UndefOr[Prefix]
    var VersionIdMarker: js.UndefOr[VersionIdMarker]
    var Versions: js.UndefOr[ObjectVersionList]
  }

  object ListObjectVersionsOutput {
    def apply(
        CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined,
        DeleteMarkers: js.UndefOr[DeleteMarkers] = js.undefined,
        Delimiter: js.UndefOr[Delimiter] = js.undefined,
        EncodingType: js.UndefOr[EncodingType] = js.undefined,
        IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
        KeyMarker: js.UndefOr[KeyMarker] = js.undefined,
        MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
        Name: js.UndefOr[BucketName] = js.undefined,
        NextKeyMarker: js.UndefOr[NextKeyMarker] = js.undefined,
        NextVersionIdMarker: js.UndefOr[NextVersionIdMarker] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        VersionIdMarker: js.UndefOr[VersionIdMarker] = js.undefined,
        Versions: js.UndefOr[ObjectVersionList] = js.undefined
    ): ListObjectVersionsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      CommonPrefixes.foreach(__v => __obj.update("CommonPrefixes", __v.asInstanceOf[js.Any]))
      DeleteMarkers.foreach(__v => __obj.update("DeleteMarkers", __v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.update("Delimiter", __v.asInstanceOf[js.Any]))
      EncodingType.foreach(__v => __obj.update("EncodingType", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      KeyMarker.foreach(__v => __obj.update("KeyMarker", __v.asInstanceOf[js.Any]))
      MaxKeys.foreach(__v => __obj.update("MaxKeys", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      NextKeyMarker.foreach(__v => __obj.update("NextKeyMarker", __v.asInstanceOf[js.Any]))
      NextVersionIdMarker.foreach(__v => __obj.update("NextVersionIdMarker", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      VersionIdMarker.foreach(__v => __obj.update("VersionIdMarker", __v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.update("Versions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectVersionsOutput]
    }
  }

  @js.native
  trait ListObjectVersionsRequest extends js.Object {
    var Bucket: BucketName
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var KeyMarker: js.UndefOr[KeyMarker]
    var MaxKeys: js.UndefOr[MaxKeys]
    var Prefix: js.UndefOr[Prefix]
    var VersionIdMarker: js.UndefOr[VersionIdMarker]
  }

  object ListObjectVersionsRequest {
    def apply(
        Bucket: BucketName,
        Delimiter: js.UndefOr[Delimiter] = js.undefined,
        EncodingType: js.UndefOr[EncodingType] = js.undefined,
        KeyMarker: js.UndefOr[KeyMarker] = js.undefined,
        MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        VersionIdMarker: js.UndefOr[VersionIdMarker] = js.undefined
    ): ListObjectVersionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      Delimiter.foreach(__v => __obj.update("Delimiter", __v.asInstanceOf[js.Any]))
      EncodingType.foreach(__v => __obj.update("EncodingType", __v.asInstanceOf[js.Any]))
      KeyMarker.foreach(__v => __obj.update("KeyMarker", __v.asInstanceOf[js.Any]))
      MaxKeys.foreach(__v => __obj.update("MaxKeys", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      VersionIdMarker.foreach(__v => __obj.update("VersionIdMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectVersionsRequest]
    }
  }

  @js.native
  trait ListObjectsOutput extends js.Object {
    var CommonPrefixes: js.UndefOr[CommonPrefixList]
    var Contents: js.UndefOr[ObjectList]
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var IsTruncated: js.UndefOr[IsTruncated]
    var Marker: js.UndefOr[Marker]
    var MaxKeys: js.UndefOr[MaxKeys]
    var Name: js.UndefOr[BucketName]
    var NextMarker: js.UndefOr[NextMarker]
    var Prefix: js.UndefOr[Prefix]
  }

  object ListObjectsOutput {
    def apply(
        CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined,
        Contents: js.UndefOr[ObjectList] = js.undefined,
        Delimiter: js.UndefOr[Delimiter] = js.undefined,
        EncodingType: js.UndefOr[EncodingType] = js.undefined,
        IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
        Name: js.UndefOr[BucketName] = js.undefined,
        NextMarker: js.UndefOr[NextMarker] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined
    ): ListObjectsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      CommonPrefixes.foreach(__v => __obj.update("CommonPrefixes", __v.asInstanceOf[js.Any]))
      Contents.foreach(__v => __obj.update("Contents", __v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.update("Delimiter", __v.asInstanceOf[js.Any]))
      EncodingType.foreach(__v => __obj.update("EncodingType", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxKeys.foreach(__v => __obj.update("MaxKeys", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectsOutput]
    }
  }

  @js.native
  trait ListObjectsRequest extends js.Object {
    var Bucket: BucketName
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var Marker: js.UndefOr[Marker]
    var MaxKeys: js.UndefOr[MaxKeys]
    var Prefix: js.UndefOr[Prefix]
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  object ListObjectsRequest {
    def apply(
        Bucket: BucketName,
        Delimiter: js.UndefOr[Delimiter] = js.undefined,
        EncodingType: js.UndefOr[EncodingType] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    ): ListObjectsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      Delimiter.foreach(__v => __obj.update("Delimiter", __v.asInstanceOf[js.Any]))
      EncodingType.foreach(__v => __obj.update("EncodingType", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxKeys.foreach(__v => __obj.update("MaxKeys", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectsRequest]
    }
  }

  @js.native
  trait ListObjectsV2Output extends js.Object {
    var CommonPrefixes: js.UndefOr[CommonPrefixList]
    var Contents: js.UndefOr[ObjectList]
    var ContinuationToken: js.UndefOr[Token]
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var IsTruncated: js.UndefOr[IsTruncated]
    var KeyCount: js.UndefOr[KeyCount]
    var MaxKeys: js.UndefOr[MaxKeys]
    var Name: js.UndefOr[BucketName]
    var NextContinuationToken: js.UndefOr[NextToken]
    var Prefix: js.UndefOr[Prefix]
    var StartAfter: js.UndefOr[StartAfter]
  }

  object ListObjectsV2Output {
    def apply(
        CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined,
        Contents: js.UndefOr[ObjectList] = js.undefined,
        ContinuationToken: js.UndefOr[Token] = js.undefined,
        Delimiter: js.UndefOr[Delimiter] = js.undefined,
        EncodingType: js.UndefOr[EncodingType] = js.undefined,
        IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
        KeyCount: js.UndefOr[KeyCount] = js.undefined,
        MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
        Name: js.UndefOr[BucketName] = js.undefined,
        NextContinuationToken: js.UndefOr[NextToken] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        StartAfter: js.UndefOr[StartAfter] = js.undefined
    ): ListObjectsV2Output = {
      val __obj = js.Dictionary.empty[js.Any]
      CommonPrefixes.foreach(__v => __obj.update("CommonPrefixes", __v.asInstanceOf[js.Any]))
      Contents.foreach(__v => __obj.update("Contents", __v.asInstanceOf[js.Any]))
      ContinuationToken.foreach(__v => __obj.update("ContinuationToken", __v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.update("Delimiter", __v.asInstanceOf[js.Any]))
      EncodingType.foreach(__v => __obj.update("EncodingType", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      KeyCount.foreach(__v => __obj.update("KeyCount", __v.asInstanceOf[js.Any]))
      MaxKeys.foreach(__v => __obj.update("MaxKeys", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      NextContinuationToken.foreach(__v => __obj.update("NextContinuationToken", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      StartAfter.foreach(__v => __obj.update("StartAfter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectsV2Output]
    }
  }

  @js.native
  trait ListObjectsV2Request extends js.Object {
    var Bucket: BucketName
    var ContinuationToken: js.UndefOr[Token]
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var FetchOwner: js.UndefOr[FetchOwner]
    var MaxKeys: js.UndefOr[MaxKeys]
    var Prefix: js.UndefOr[Prefix]
    var RequestPayer: js.UndefOr[RequestPayer]
    var StartAfter: js.UndefOr[StartAfter]
  }

  object ListObjectsV2Request {
    def apply(
        Bucket: BucketName,
        ContinuationToken: js.UndefOr[Token] = js.undefined,
        Delimiter: js.UndefOr[Delimiter] = js.undefined,
        EncodingType: js.UndefOr[EncodingType] = js.undefined,
        FetchOwner: js.UndefOr[FetchOwner] = js.undefined,
        MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        StartAfter: js.UndefOr[StartAfter] = js.undefined
    ): ListObjectsV2Request = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      ContinuationToken.foreach(__v => __obj.update("ContinuationToken", __v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.update("Delimiter", __v.asInstanceOf[js.Any]))
      EncodingType.foreach(__v => __obj.update("EncodingType", __v.asInstanceOf[js.Any]))
      FetchOwner.foreach(__v => __obj.update("FetchOwner", __v.asInstanceOf[js.Any]))
      MaxKeys.foreach(__v => __obj.update("MaxKeys", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      StartAfter.foreach(__v => __obj.update("StartAfter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectsV2Request]
    }
  }

  @js.native
  trait ListPartsOutput extends js.Object {
    var AbortDate: js.UndefOr[AbortDate]
    var AbortRuleId: js.UndefOr[AbortRuleId]
    var Bucket: js.UndefOr[BucketName]
    var Initiator: js.UndefOr[Initiator]
    var IsTruncated: js.UndefOr[IsTruncated]
    var Key: js.UndefOr[ObjectKey]
    var MaxParts: js.UndefOr[MaxParts]
    var NextPartNumberMarker: js.UndefOr[NextPartNumberMarker]
    var Owner: js.UndefOr[Owner]
    var PartNumberMarker: js.UndefOr[PartNumberMarker]
    var Parts: js.UndefOr[Parts]
    var RequestCharged: js.UndefOr[RequestCharged]
    var StorageClass: js.UndefOr[StorageClass]
    var UploadId: js.UndefOr[MultipartUploadId]
  }

  object ListPartsOutput {
    def apply(
        AbortDate: js.UndefOr[AbortDate] = js.undefined,
        AbortRuleId: js.UndefOr[AbortRuleId] = js.undefined,
        Bucket: js.UndefOr[BucketName] = js.undefined,
        Initiator: js.UndefOr[Initiator] = js.undefined,
        IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
        Key: js.UndefOr[ObjectKey] = js.undefined,
        MaxParts: js.UndefOr[MaxParts] = js.undefined,
        NextPartNumberMarker: js.UndefOr[NextPartNumberMarker] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        PartNumberMarker: js.UndefOr[PartNumberMarker] = js.undefined,
        Parts: js.UndefOr[Parts] = js.undefined,
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined,
        UploadId: js.UndefOr[MultipartUploadId] = js.undefined
    ): ListPartsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      AbortDate.foreach(__v => __obj.update("AbortDate", __v.asInstanceOf[js.Any]))
      AbortRuleId.foreach(__v => __obj.update("AbortRuleId", __v.asInstanceOf[js.Any]))
      Bucket.foreach(__v => __obj.update("Bucket", __v.asInstanceOf[js.Any]))
      Initiator.foreach(__v => __obj.update("Initiator", __v.asInstanceOf[js.Any]))
      IsTruncated.foreach(__v => __obj.update("IsTruncated", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      MaxParts.foreach(__v => __obj.update("MaxParts", __v.asInstanceOf[js.Any]))
      NextPartNumberMarker.foreach(__v => __obj.update("NextPartNumberMarker", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      PartNumberMarker.foreach(__v => __obj.update("PartNumberMarker", __v.asInstanceOf[js.Any]))
      Parts.foreach(__v => __obj.update("Parts", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      UploadId.foreach(__v => __obj.update("UploadId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartsOutput]
    }
  }

  @js.native
  trait ListPartsRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var UploadId: MultipartUploadId
    var MaxParts: js.UndefOr[MaxParts]
    var PartNumberMarker: js.UndefOr[PartNumberMarker]
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  object ListPartsRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        UploadId: MultipartUploadId,
        MaxParts: js.UndefOr[MaxParts] = js.undefined,
        PartNumberMarker: js.UndefOr[PartNumberMarker] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    ): ListPartsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"   -> Bucket.asInstanceOf[js.Any],
        "Key"      -> Key.asInstanceOf[js.Any],
        "UploadId" -> UploadId.asInstanceOf[js.Any]
      )

      MaxParts.foreach(__v => __obj.update("MaxParts", __v.asInstanceOf[js.Any]))
      PartNumberMarker.foreach(__v => __obj.update("PartNumberMarker", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartsRequest]
    }
  }

  /**
    * Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.
    */
  @js.native
  trait LoggingEnabled extends js.Object {
    var TargetBucket: TargetBucket
    var TargetPrefix: TargetPrefix
    var TargetGrants: js.UndefOr[TargetGrants]
  }

  object LoggingEnabled {
    def apply(
        TargetBucket: TargetBucket,
        TargetPrefix: TargetPrefix,
        TargetGrants: js.UndefOr[TargetGrants] = js.undefined
    ): LoggingEnabled = {
      val __obj = js.Dictionary[js.Any](
        "TargetBucket" -> TargetBucket.asInstanceOf[js.Any],
        "TargetPrefix" -> TargetPrefix.asInstanceOf[js.Any]
      )

      TargetGrants.foreach(__v => __obj.update("TargetGrants", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingEnabled]
    }
  }

  object MFADeleteEnum {
    val Enabled  = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  object MFADeleteStatusEnum {
    val Enabled  = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  object MetadataDirectiveEnum {
    val COPY    = "COPY"
    val REPLACE = "REPLACE"

    val values = IndexedSeq(COPY, REPLACE)
  }

  /**
    * A metadata key-value pair to store with an object.
    */
  @js.native
  trait MetadataEntry extends js.Object {
    var Name: js.UndefOr[MetadataKey]
    var Value: js.UndefOr[MetadataValue]
  }

  object MetadataEntry {
    def apply(
        Name: js.UndefOr[MetadataKey] = js.undefined,
        Value: js.UndefOr[MetadataValue] = js.undefined
    ): MetadataEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetadataEntry]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait MetricsAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[TagSet]
  }

  object MetricsAndOperator {
    def apply(
        Prefix: js.UndefOr[Prefix] = js.undefined,
        Tags: js.UndefOr[TagSet] = js.undefined
    ): MetricsAndOperator = {
      val __obj = js.Dictionary.empty[js.Any]
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricsAndOperator]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait MetricsConfiguration extends js.Object {
    var Id: MetricsId
    var Filter: js.UndefOr[MetricsFilter]
  }

  object MetricsConfiguration {
    def apply(
        Id: MetricsId,
        Filter: js.UndefOr[MetricsFilter] = js.undefined
    ): MetricsConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricsConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait MetricsFilter extends js.Object {
    var And: js.UndefOr[MetricsAndOperator]
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[Tag]
  }

  object MetricsFilter {
    def apply(
        And: js.UndefOr[MetricsAndOperator] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        Tag: js.UndefOr[Tag] = js.undefined
    ): MetricsFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      And.foreach(__v => __obj.update("And", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      Tag.foreach(__v => __obj.update("Tag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricsFilter]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait MultipartUpload extends js.Object {
    var Initiated: js.UndefOr[Initiated]
    var Initiator: js.UndefOr[Initiator]
    var Key: js.UndefOr[ObjectKey]
    var Owner: js.UndefOr[Owner]
    var StorageClass: js.UndefOr[StorageClass]
    var UploadId: js.UndefOr[MultipartUploadId]
  }

  object MultipartUpload {
    def apply(
        Initiated: js.UndefOr[Initiated] = js.undefined,
        Initiator: js.UndefOr[Initiator] = js.undefined,
        Key: js.UndefOr[ObjectKey] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined,
        UploadId: js.UndefOr[MultipartUploadId] = js.undefined
    ): MultipartUpload = {
      val __obj = js.Dictionary.empty[js.Any]
      Initiated.foreach(__v => __obj.update("Initiated", __v.asInstanceOf[js.Any]))
      Initiator.foreach(__v => __obj.update("Initiator", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      UploadId.foreach(__v => __obj.update("UploadId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultipartUpload]
    }
  }

  /**
    * Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.
    */
  @js.native
  trait NoncurrentVersionExpiration extends js.Object {
    var NoncurrentDays: js.UndefOr[Days]
  }

  object NoncurrentVersionExpiration {
    def apply(
        NoncurrentDays: js.UndefOr[Days] = js.undefined
    ): NoncurrentVersionExpiration = {
      val __obj = js.Dictionary.empty[js.Any]
      NoncurrentDays.foreach(__v => __obj.update("NoncurrentDays", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoncurrentVersionExpiration]
    }
  }

  /**
    * Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER or DEEP_ARCHIVE storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER or DEEP_ARCHIVE storage class at a specific period in the object's lifetime.
    */
  @js.native
  trait NoncurrentVersionTransition extends js.Object {
    var NoncurrentDays: js.UndefOr[Days]
    var StorageClass: js.UndefOr[TransitionStorageClass]
  }

  object NoncurrentVersionTransition {
    def apply(
        NoncurrentDays: js.UndefOr[Days] = js.undefined,
        StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
    ): NoncurrentVersionTransition = {
      val __obj = js.Dictionary.empty[js.Any]
      NoncurrentDays.foreach(__v => __obj.update("NoncurrentDays", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoncurrentVersionTransition]
    }
  }

  /**
    * A container for specifying the notification configuration of the bucket. If this element is empty, notifications are turned off for the bucket.
    */
  @js.native
  trait NotificationConfiguration extends js.Object {
    var LambdaFunctionConfigurations: js.UndefOr[LambdaFunctionConfigurationList]
    var QueueConfigurations: js.UndefOr[QueueConfigurationList]
    var TopicConfigurations: js.UndefOr[TopicConfigurationList]
  }

  object NotificationConfiguration {
    def apply(
        LambdaFunctionConfigurations: js.UndefOr[LambdaFunctionConfigurationList] = js.undefined,
        QueueConfigurations: js.UndefOr[QueueConfigurationList] = js.undefined,
        TopicConfigurations: js.UndefOr[TopicConfigurationList] = js.undefined
    ): NotificationConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      LambdaFunctionConfigurations.foreach(
        __v => __obj.update("LambdaFunctionConfigurations", __v.asInstanceOf[js.Any])
      )
      QueueConfigurations.foreach(__v => __obj.update("QueueConfigurations", __v.asInstanceOf[js.Any]))
      TopicConfigurations.foreach(__v => __obj.update("TopicConfigurations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationConfiguration]
    }
  }

  @js.native
  trait NotificationConfigurationDeprecated extends js.Object {
    var CloudFunctionConfiguration: js.UndefOr[CloudFunctionConfiguration]
    var QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated]
    var TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated]
  }

  object NotificationConfigurationDeprecated {
    def apply(
        CloudFunctionConfiguration: js.UndefOr[CloudFunctionConfiguration] = js.undefined,
        QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated] = js.undefined,
        TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated] = js.undefined
    ): NotificationConfigurationDeprecated = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudFunctionConfiguration.foreach(__v => __obj.update("CloudFunctionConfiguration", __v.asInstanceOf[js.Any]))
      QueueConfiguration.foreach(__v => __obj.update("QueueConfiguration", __v.asInstanceOf[js.Any]))
      TopicConfiguration.foreach(__v => __obj.update("TopicConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationConfigurationDeprecated]
    }
  }

  /**
    * A container for object key name filtering rules. For information about key name filtering, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html|Configuring Event Notifications]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  trait NotificationConfigurationFilter extends js.Object {
    var Key: js.UndefOr[S3KeyFilter]
  }

  object NotificationConfigurationFilter {
    def apply(
        Key: js.UndefOr[S3KeyFilter] = js.undefined
    ): NotificationConfigurationFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationConfigurationFilter]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Object extends js.Object {
    var ETag: js.UndefOr[ETag]
    var Key: js.UndefOr[ObjectKey]
    var LastModified: js.UndefOr[LastModified]
    var Owner: js.UndefOr[Owner]
    var Size: js.UndefOr[Size]
    var StorageClass: js.UndefOr[ObjectStorageClass]
  }

  object Object {
    def apply(
        ETag: js.UndefOr[ETag] = js.undefined,
        Key: js.UndefOr[ObjectKey] = js.undefined,
        LastModified: js.UndefOr[LastModified] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        Size: js.UndefOr[Size] = js.undefined,
        StorageClass: js.UndefOr[ObjectStorageClass] = js.undefined
    ): Object = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.update("LastModified", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.update("Size", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Object]
    }
  }

  object ObjectCannedACLEnum {
    val `private`                   = "private"
    val `public-read`               = "public-read"
    val `public-read-write`         = "public-read-write"
    val `authenticated-read`        = "authenticated-read"
    val `aws-exec-read`             = "aws-exec-read"
    val `bucket-owner-read`         = "bucket-owner-read"
    val `bucket-owner-full-control` = "bucket-owner-full-control"

    val values = IndexedSeq(
      `private`,
      `public-read`,
      `public-read-write`,
      `authenticated-read`,
      `aws-exec-read`,
      `bucket-owner-read`,
      `bucket-owner-full-control`
    )
  }

  /**
    * <p/>
    */
  @js.native
  trait ObjectIdentifier extends js.Object {
    var Key: ObjectKey
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object ObjectIdentifier {
    def apply(
        Key: ObjectKey,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): ObjectIdentifier = {
      val __obj = js.Dictionary[js.Any](
        "Key" -> Key.asInstanceOf[js.Any]
      )

      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectIdentifier]
    }
  }

  /**
    * The container element for Object Lock configuration parameters.
    */
  @js.native
  trait ObjectLockConfiguration extends js.Object {
    var ObjectLockEnabled: js.UndefOr[ObjectLockEnabled]
    var Rule: js.UndefOr[ObjectLockRule]
  }

  object ObjectLockConfiguration {
    def apply(
        ObjectLockEnabled: js.UndefOr[ObjectLockEnabled] = js.undefined,
        Rule: js.UndefOr[ObjectLockRule] = js.undefined
    ): ObjectLockConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      ObjectLockEnabled.foreach(__v => __obj.update("ObjectLockEnabled", __v.asInstanceOf[js.Any]))
      Rule.foreach(__v => __obj.update("Rule", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectLockConfiguration]
    }
  }

  object ObjectLockEnabledEnum {
    val Enabled = "Enabled"

    val values = IndexedSeq(Enabled)
  }

  /**
    * A Legal Hold configuration for an object.
    */
  @js.native
  trait ObjectLockLegalHold extends js.Object {
    var Status: js.UndefOr[ObjectLockLegalHoldStatus]
  }

  object ObjectLockLegalHold {
    def apply(
        Status: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined
    ): ObjectLockLegalHold = {
      val __obj = js.Dictionary.empty[js.Any]
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectLockLegalHold]
    }
  }

  object ObjectLockLegalHoldStatusEnum {
    val ON  = "ON"
    val OFF = "OFF"

    val values = IndexedSeq(ON, OFF)
  }

  object ObjectLockModeEnum {
    val GOVERNANCE = "GOVERNANCE"
    val COMPLIANCE = "COMPLIANCE"

    val values = IndexedSeq(GOVERNANCE, COMPLIANCE)
  }

  /**
    * A Retention configuration for an object.
    */
  @js.native
  trait ObjectLockRetention extends js.Object {
    var Mode: js.UndefOr[ObjectLockRetentionMode]
    var RetainUntilDate: js.UndefOr[Date]
  }

  object ObjectLockRetention {
    def apply(
        Mode: js.UndefOr[ObjectLockRetentionMode] = js.undefined,
        RetainUntilDate: js.UndefOr[Date] = js.undefined
    ): ObjectLockRetention = {
      val __obj = js.Dictionary.empty[js.Any]
      Mode.foreach(__v => __obj.update("Mode", __v.asInstanceOf[js.Any]))
      RetainUntilDate.foreach(__v => __obj.update("RetainUntilDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectLockRetention]
    }
  }

  object ObjectLockRetentionModeEnum {
    val GOVERNANCE = "GOVERNANCE"
    val COMPLIANCE = "COMPLIANCE"

    val values = IndexedSeq(GOVERNANCE, COMPLIANCE)
  }

  /**
    * The container element for an Object Lock rule.
    */
  @js.native
  trait ObjectLockRule extends js.Object {
    var DefaultRetention: js.UndefOr[DefaultRetention]
  }

  object ObjectLockRule {
    def apply(
        DefaultRetention: js.UndefOr[DefaultRetention] = js.undefined
    ): ObjectLockRule = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultRetention.foreach(__v => __obj.update("DefaultRetention", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectLockRule]
    }
  }

  object ObjectStorageClassEnum {
    val STANDARD            = "STANDARD"
    val REDUCED_REDUNDANCY  = "REDUCED_REDUNDANCY"
    val GLACIER             = "GLACIER"
    val STANDARD_IA         = "STANDARD_IA"
    val ONEZONE_IA          = "ONEZONE_IA"
    val INTELLIGENT_TIERING = "INTELLIGENT_TIERING"
    val DEEP_ARCHIVE        = "DEEP_ARCHIVE"

    val values =
      IndexedSeq(STANDARD, REDUCED_REDUNDANCY, GLACIER, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE)
  }

  /**
    * <p/>
    */
  @js.native
  trait ObjectVersion extends js.Object {
    var ETag: js.UndefOr[ETag]
    var IsLatest: js.UndefOr[IsLatest]
    var Key: js.UndefOr[ObjectKey]
    var LastModified: js.UndefOr[LastModified]
    var Owner: js.UndefOr[Owner]
    var Size: js.UndefOr[Size]
    var StorageClass: js.UndefOr[ObjectVersionStorageClass]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object ObjectVersion {
    def apply(
        ETag: js.UndefOr[ETag] = js.undefined,
        IsLatest: js.UndefOr[IsLatest] = js.undefined,
        Key: js.UndefOr[ObjectKey] = js.undefined,
        LastModified: js.UndefOr[LastModified] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        Size: js.UndefOr[Size] = js.undefined,
        StorageClass: js.UndefOr[ObjectVersionStorageClass] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): ObjectVersion = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      IsLatest.foreach(__v => __obj.update("IsLatest", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.update("LastModified", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.update("Size", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectVersion]
    }
  }

  object ObjectVersionStorageClassEnum {
    val STANDARD = "STANDARD"

    val values = IndexedSeq(STANDARD)
  }

  /**
    * Describes the location where the restore job's output is stored.
    */
  @js.native
  trait OutputLocation extends js.Object {
    var S3: js.UndefOr[S3Location]
  }

  object OutputLocation {
    def apply(
        S3: js.UndefOr[S3Location] = js.undefined
    ): OutputLocation = {
      val __obj = js.Dictionary.empty[js.Any]
      S3.foreach(__v => __obj.update("S3", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputLocation]
    }
  }

  /**
    * Describes how results of the Select job are serialized.
    */
  @js.native
  trait OutputSerialization extends js.Object {
    var CSV: js.UndefOr[CSVOutput]
    var JSON: js.UndefOr[JSONOutput]
  }

  object OutputSerialization {
    def apply(
        CSV: js.UndefOr[CSVOutput] = js.undefined,
        JSON: js.UndefOr[JSONOutput] = js.undefined
    ): OutputSerialization = {
      val __obj = js.Dictionary.empty[js.Any]
      CSV.foreach(__v => __obj.update("CSV", __v.asInstanceOf[js.Any]))
      JSON.foreach(__v => __obj.update("JSON", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputSerialization]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Owner extends js.Object {
    var DisplayName: js.UndefOr[DisplayName]
    var ID: js.UndefOr[ID]
  }

  object Owner {
    def apply(
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        ID: js.UndefOr[ID] = js.undefined
    ): Owner = {
      val __obj = js.Dictionary.empty[js.Any]
      DisplayName.foreach(__v => __obj.update("DisplayName", __v.asInstanceOf[js.Any]))
      ID.foreach(__v => __obj.update("ID", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Owner]
    }
  }

  object OwnerOverrideEnum {
    val Destination = "Destination"

    val values = IndexedSeq(Destination)
  }

  /**
    * <p/>
    */
  @js.native
  trait ParquetInput extends js.Object {}

  object ParquetInput {
    def apply(
        ): ParquetInput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ParquetInput]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Part extends js.Object {
    var ETag: js.UndefOr[ETag]
    var LastModified: js.UndefOr[LastModified]
    var PartNumber: js.UndefOr[PartNumber]
    var Size: js.UndefOr[Size]
  }

  object Part {
    def apply(
        ETag: js.UndefOr[ETag] = js.undefined,
        LastModified: js.UndefOr[LastModified] = js.undefined,
        PartNumber: js.UndefOr[PartNumber] = js.undefined,
        Size: js.UndefOr[Size] = js.undefined
    ): Part = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.update("LastModified", __v.asInstanceOf[js.Any]))
      PartNumber.foreach(__v => __obj.update("PartNumber", __v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.update("Size", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Part]
    }
  }

  object PayerEnum {
    val Requester   = "Requester"
    val BucketOwner = "BucketOwner"

    val values = IndexedSeq(Requester, BucketOwner)
  }

  object PermissionEnum {
    val FULL_CONTROL = "FULL_CONTROL"
    val WRITE        = "WRITE"
    val WRITE_ACP    = "WRITE_ACP"
    val READ         = "READ"
    val READ_ACP     = "READ_ACP"

    val values = IndexedSeq(FULL_CONTROL, WRITE, WRITE_ACP, READ, READ_ACP)
  }

  /**
    * The container element for a bucket's policy status.
    */
  @js.native
  trait PolicyStatus extends js.Object {
    var IsPublic: js.UndefOr[IsPublic]
  }

  object PolicyStatus {
    def apply(
        IsPublic: js.UndefOr[IsPublic] = js.undefined
    ): PolicyStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      IsPublic.foreach(__v => __obj.update("IsPublic", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyStatus]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Progress extends js.Object {
    var BytesProcessed: js.UndefOr[BytesProcessed]
    var BytesReturned: js.UndefOr[BytesReturned]
    var BytesScanned: js.UndefOr[BytesScanned]
  }

  object Progress {
    def apply(
        BytesProcessed: js.UndefOr[BytesProcessed] = js.undefined,
        BytesReturned: js.UndefOr[BytesReturned] = js.undefined,
        BytesScanned: js.UndefOr[BytesScanned] = js.undefined
    ): Progress = {
      val __obj = js.Dictionary.empty[js.Any]
      BytesProcessed.foreach(__v => __obj.update("BytesProcessed", __v.asInstanceOf[js.Any]))
      BytesReturned.foreach(__v => __obj.update("BytesReturned", __v.asInstanceOf[js.Any]))
      BytesScanned.foreach(__v => __obj.update("BytesScanned", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Progress]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ProgressEvent extends js.Object {
    var Details: js.UndefOr[Progress]
  }

  object ProgressEvent {
    def apply(
        Details: js.UndefOr[Progress] = js.undefined
    ): ProgressEvent = {
      val __obj = js.Dictionary.empty[js.Any]
      Details.foreach(__v => __obj.update("Details", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProgressEvent]
    }
  }

  object ProtocolEnum {
    val http  = "http"
    val https = "https"

    val values = IndexedSeq(http, https)
  }

  /**
    * <p/>
    */
  @js.native
  trait PublicAccessBlockConfiguration extends js.Object {
    var BlockPublicAcls: js.UndefOr[Setting]
    var BlockPublicPolicy: js.UndefOr[Setting]
    var IgnorePublicAcls: js.UndefOr[Setting]
    var RestrictPublicBuckets: js.UndefOr[Setting]
  }

  object PublicAccessBlockConfiguration {
    def apply(
        BlockPublicAcls: js.UndefOr[Setting] = js.undefined,
        BlockPublicPolicy: js.UndefOr[Setting] = js.undefined,
        IgnorePublicAcls: js.UndefOr[Setting] = js.undefined,
        RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined
    ): PublicAccessBlockConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      BlockPublicAcls.foreach(__v => __obj.update("BlockPublicAcls", __v.asInstanceOf[js.Any]))
      BlockPublicPolicy.foreach(__v => __obj.update("BlockPublicPolicy", __v.asInstanceOf[js.Any]))
      IgnorePublicAcls.foreach(__v => __obj.update("IgnorePublicAcls", __v.asInstanceOf[js.Any]))
      RestrictPublicBuckets.foreach(__v => __obj.update("RestrictPublicBuckets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicAccessBlockConfiguration]
    }
  }

  @js.native
  trait PutBucketAccelerateConfigurationRequest extends js.Object {
    var AccelerateConfiguration: AccelerateConfiguration
    var Bucket: BucketName
  }

  object PutBucketAccelerateConfigurationRequest {
    def apply(
        AccelerateConfiguration: AccelerateConfiguration,
        Bucket: BucketName
    ): PutBucketAccelerateConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccelerateConfiguration" -> AccelerateConfiguration.asInstanceOf[js.Any],
        "Bucket"                  -> Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutBucketAccelerateConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketAclRequest extends js.Object {
    var Bucket: BucketName
    var ACL: js.UndefOr[BucketCannedACL]
    var AccessControlPolicy: js.UndefOr[AccessControlPolicy]
    var ContentMD5: js.UndefOr[ContentMD5]
    var GrantFullControl: js.UndefOr[GrantFullControl]
    var GrantRead: js.UndefOr[GrantRead]
    var GrantReadACP: js.UndefOr[GrantReadACP]
    var GrantWrite: js.UndefOr[GrantWrite]
    var GrantWriteACP: js.UndefOr[GrantWriteACP]
  }

  object PutBucketAclRequest {
    def apply(
        Bucket: BucketName,
        ACL: js.UndefOr[BucketCannedACL] = js.undefined,
        AccessControlPolicy: js.UndefOr[AccessControlPolicy] = js.undefined,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
        GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
        GrantRead: js.UndefOr[GrantRead] = js.undefined,
        GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
        GrantWrite: js.UndefOr[GrantWrite] = js.undefined,
        GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined
    ): PutBucketAclRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      ACL.foreach(__v => __obj.update("ACL", __v.asInstanceOf[js.Any]))
      AccessControlPolicy.foreach(__v => __obj.update("AccessControlPolicy", __v.asInstanceOf[js.Any]))
      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      GrantFullControl.foreach(__v => __obj.update("GrantFullControl", __v.asInstanceOf[js.Any]))
      GrantRead.foreach(__v => __obj.update("GrantRead", __v.asInstanceOf[js.Any]))
      GrantReadACP.foreach(__v => __obj.update("GrantReadACP", __v.asInstanceOf[js.Any]))
      GrantWrite.foreach(__v => __obj.update("GrantWrite", __v.asInstanceOf[js.Any]))
      GrantWriteACP.foreach(__v => __obj.update("GrantWriteACP", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketAclRequest]
    }
  }

  @js.native
  trait PutBucketAnalyticsConfigurationRequest extends js.Object {
    var AnalyticsConfiguration: AnalyticsConfiguration
    var Bucket: BucketName
    var Id: AnalyticsId
  }

  object PutBucketAnalyticsConfigurationRequest {
    def apply(
        AnalyticsConfiguration: AnalyticsConfiguration,
        Bucket: BucketName,
        Id: AnalyticsId
    ): PutBucketAnalyticsConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "AnalyticsConfiguration" -> AnalyticsConfiguration.asInstanceOf[js.Any],
        "Bucket"                 -> Bucket.asInstanceOf[js.Any],
        "Id"                     -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutBucketAnalyticsConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketCorsRequest extends js.Object {
    var Bucket: BucketName
    var CORSConfiguration: CORSConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutBucketCorsRequest {
    def apply(
        Bucket: BucketName,
        CORSConfiguration: CORSConfiguration,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutBucketCorsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"            -> Bucket.asInstanceOf[js.Any],
        "CORSConfiguration" -> CORSConfiguration.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketCorsRequest]
    }
  }

  @js.native
  trait PutBucketEncryptionRequest extends js.Object {
    var Bucket: BucketName
    var ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutBucketEncryptionRequest {
    def apply(
        Bucket: BucketName,
        ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutBucketEncryptionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"                            -> Bucket.asInstanceOf[js.Any],
        "ServerSideEncryptionConfiguration" -> ServerSideEncryptionConfiguration.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketEncryptionRequest]
    }
  }

  @js.native
  trait PutBucketInventoryConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: InventoryId
    var InventoryConfiguration: InventoryConfiguration
  }

  object PutBucketInventoryConfigurationRequest {
    def apply(
        Bucket: BucketName,
        Id: InventoryId,
        InventoryConfiguration: InventoryConfiguration
    ): PutBucketInventoryConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"                 -> Bucket.asInstanceOf[js.Any],
        "Id"                     -> Id.asInstanceOf[js.Any],
        "InventoryConfiguration" -> InventoryConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutBucketInventoryConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketLifecycleConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var LifecycleConfiguration: js.UndefOr[BucketLifecycleConfiguration]
  }

  object PutBucketLifecycleConfigurationRequest {
    def apply(
        Bucket: BucketName,
        LifecycleConfiguration: js.UndefOr[BucketLifecycleConfiguration] = js.undefined
    ): PutBucketLifecycleConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      LifecycleConfiguration.foreach(__v => __obj.update("LifecycleConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketLifecycleConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketLifecycleRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5]
    var LifecycleConfiguration: js.UndefOr[LifecycleConfiguration]
  }

  object PutBucketLifecycleRequest {
    def apply(
        Bucket: BucketName,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
        LifecycleConfiguration: js.UndefOr[LifecycleConfiguration] = js.undefined
    ): PutBucketLifecycleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      LifecycleConfiguration.foreach(__v => __obj.update("LifecycleConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketLifecycleRequest]
    }
  }

  @js.native
  trait PutBucketLoggingRequest extends js.Object {
    var Bucket: BucketName
    var BucketLoggingStatus: BucketLoggingStatus
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutBucketLoggingRequest {
    def apply(
        Bucket: BucketName,
        BucketLoggingStatus: BucketLoggingStatus,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutBucketLoggingRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"              -> Bucket.asInstanceOf[js.Any],
        "BucketLoggingStatus" -> BucketLoggingStatus.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketLoggingRequest]
    }
  }

  @js.native
  trait PutBucketMetricsConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: MetricsId
    var MetricsConfiguration: MetricsConfiguration
  }

  object PutBucketMetricsConfigurationRequest {
    def apply(
        Bucket: BucketName,
        Id: MetricsId,
        MetricsConfiguration: MetricsConfiguration
    ): PutBucketMetricsConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"               -> Bucket.asInstanceOf[js.Any],
        "Id"                   -> Id.asInstanceOf[js.Any],
        "MetricsConfiguration" -> MetricsConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutBucketMetricsConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketNotificationConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var NotificationConfiguration: NotificationConfiguration
  }

  object PutBucketNotificationConfigurationRequest {
    def apply(
        Bucket: BucketName,
        NotificationConfiguration: NotificationConfiguration
    ): PutBucketNotificationConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"                    -> Bucket.asInstanceOf[js.Any],
        "NotificationConfiguration" -> NotificationConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutBucketNotificationConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketNotificationRequest extends js.Object {
    var Bucket: BucketName
    var NotificationConfiguration: NotificationConfigurationDeprecated
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutBucketNotificationRequest {
    def apply(
        Bucket: BucketName,
        NotificationConfiguration: NotificationConfigurationDeprecated,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutBucketNotificationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"                    -> Bucket.asInstanceOf[js.Any],
        "NotificationConfiguration" -> NotificationConfiguration.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketNotificationRequest]
    }
  }

  @js.native
  trait PutBucketPolicyRequest extends js.Object {
    var Bucket: BucketName
    var Policy: Policy
    var ConfirmRemoveSelfBucketAccess: js.UndefOr[ConfirmRemoveSelfBucketAccess]
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutBucketPolicyRequest {
    def apply(
        Bucket: BucketName,
        Policy: Policy,
        ConfirmRemoveSelfBucketAccess: js.UndefOr[ConfirmRemoveSelfBucketAccess] = js.undefined,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutBucketPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Policy" -> Policy.asInstanceOf[js.Any]
      )

      ConfirmRemoveSelfBucketAccess.foreach(
        __v => __obj.update("ConfirmRemoveSelfBucketAccess", __v.asInstanceOf[js.Any])
      )
      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketPolicyRequest]
    }
  }

  @js.native
  trait PutBucketReplicationRequest extends js.Object {
    var Bucket: BucketName
    var ReplicationConfiguration: ReplicationConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutBucketReplicationRequest {
    def apply(
        Bucket: BucketName,
        ReplicationConfiguration: ReplicationConfiguration,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutBucketReplicationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"                   -> Bucket.asInstanceOf[js.Any],
        "ReplicationConfiguration" -> ReplicationConfiguration.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketReplicationRequest]
    }
  }

  @js.native
  trait PutBucketRequestPaymentRequest extends js.Object {
    var Bucket: BucketName
    var RequestPaymentConfiguration: RequestPaymentConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutBucketRequestPaymentRequest {
    def apply(
        Bucket: BucketName,
        RequestPaymentConfiguration: RequestPaymentConfiguration,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutBucketRequestPaymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"                      -> Bucket.asInstanceOf[js.Any],
        "RequestPaymentConfiguration" -> RequestPaymentConfiguration.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketRequestPaymentRequest]
    }
  }

  @js.native
  trait PutBucketTaggingRequest extends js.Object {
    var Bucket: BucketName
    var Tagging: Tagging
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutBucketTaggingRequest {
    def apply(
        Bucket: BucketName,
        Tagging: Tagging,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutBucketTaggingRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"  -> Bucket.asInstanceOf[js.Any],
        "Tagging" -> Tagging.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketTaggingRequest]
    }
  }

  @js.native
  trait PutBucketVersioningRequest extends js.Object {
    var Bucket: BucketName
    var VersioningConfiguration: VersioningConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
    var MFA: js.UndefOr[MFA]
  }

  object PutBucketVersioningRequest {
    def apply(
        Bucket: BucketName,
        VersioningConfiguration: VersioningConfiguration,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
        MFA: js.UndefOr[MFA] = js.undefined
    ): PutBucketVersioningRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"                  -> Bucket.asInstanceOf[js.Any],
        "VersioningConfiguration" -> VersioningConfiguration.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      MFA.foreach(__v => __obj.update("MFA", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketVersioningRequest]
    }
  }

  @js.native
  trait PutBucketWebsiteRequest extends js.Object {
    var Bucket: BucketName
    var WebsiteConfiguration: WebsiteConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutBucketWebsiteRequest {
    def apply(
        Bucket: BucketName,
        WebsiteConfiguration: WebsiteConfiguration,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutBucketWebsiteRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"               -> Bucket.asInstanceOf[js.Any],
        "WebsiteConfiguration" -> WebsiteConfiguration.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketWebsiteRequest]
    }
  }

  @js.native
  trait PutObjectAclOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object PutObjectAclOutput {
    def apply(
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): PutObjectAclOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectAclOutput]
    }
  }

  @js.native
  trait PutObjectAclRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var ACL: js.UndefOr[ObjectCannedACL]
    var AccessControlPolicy: js.UndefOr[AccessControlPolicy]
    var ContentMD5: js.UndefOr[ContentMD5]
    var GrantFullControl: js.UndefOr[GrantFullControl]
    var GrantRead: js.UndefOr[GrantRead]
    var GrantReadACP: js.UndefOr[GrantReadACP]
    var GrantWrite: js.UndefOr[GrantWrite]
    var GrantWriteACP: js.UndefOr[GrantWriteACP]
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object PutObjectAclRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
        AccessControlPolicy: js.UndefOr[AccessControlPolicy] = js.undefined,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
        GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
        GrantRead: js.UndefOr[GrantRead] = js.undefined,
        GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
        GrantWrite: js.UndefOr[GrantWrite] = js.undefined,
        GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): PutObjectAclRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      ACL.foreach(__v => __obj.update("ACL", __v.asInstanceOf[js.Any]))
      AccessControlPolicy.foreach(__v => __obj.update("AccessControlPolicy", __v.asInstanceOf[js.Any]))
      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      GrantFullControl.foreach(__v => __obj.update("GrantFullControl", __v.asInstanceOf[js.Any]))
      GrantRead.foreach(__v => __obj.update("GrantRead", __v.asInstanceOf[js.Any]))
      GrantReadACP.foreach(__v => __obj.update("GrantReadACP", __v.asInstanceOf[js.Any]))
      GrantWrite.foreach(__v => __obj.update("GrantWrite", __v.asInstanceOf[js.Any]))
      GrantWriteACP.foreach(__v => __obj.update("GrantWriteACP", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectAclRequest]
    }
  }

  @js.native
  trait PutObjectLegalHoldOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object PutObjectLegalHoldOutput {
    def apply(
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): PutObjectLegalHoldOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectLegalHoldOutput]
    }
  }

  @js.native
  trait PutObjectLegalHoldRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var ContentMD5: js.UndefOr[ContentMD5]
    var LegalHold: js.UndefOr[ObjectLockLegalHold]
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object PutObjectLegalHoldRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
        LegalHold: js.UndefOr[ObjectLockLegalHold] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): PutObjectLegalHoldRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      LegalHold.foreach(__v => __obj.update("LegalHold", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectLegalHoldRequest]
    }
  }

  @js.native
  trait PutObjectLockConfigurationOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object PutObjectLockConfigurationOutput {
    def apply(
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): PutObjectLockConfigurationOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectLockConfigurationOutput]
    }
  }

  @js.native
  trait PutObjectLockConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5]
    var ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration]
    var RequestPayer: js.UndefOr[RequestPayer]
    var Token: js.UndefOr[ObjectLockToken]
  }

  object PutObjectLockConfigurationRequest {
    def apply(
        Bucket: BucketName,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
        ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        Token: js.UndefOr[ObjectLockToken] = js.undefined
    ): PutObjectLockConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      ObjectLockConfiguration.foreach(__v => __obj.update("ObjectLockConfiguration", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectLockConfigurationRequest]
    }
  }

  @js.native
  trait PutObjectOutput extends js.Object {
    var ETag: js.UndefOr[ETag]
    var Expiration: js.UndefOr[Expiration]
    var RequestCharged: js.UndefOr[RequestCharged]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object PutObjectOutput {
    def apply(
        ETag: js.UndefOr[ETag] = js.undefined,
        Expiration: js.UndefOr[Expiration] = js.undefined,
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
        SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
        ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): PutObjectOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      Expiration.foreach(__v => __obj.update("Expiration", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      SSEKMSKeyId.foreach(__v => __obj.update("SSEKMSKeyId", __v.asInstanceOf[js.Any]))
      ServerSideEncryption.foreach(__v => __obj.update("ServerSideEncryption", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectOutput]
    }
  }

  @js.native
  trait PutObjectRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var ACL: js.UndefOr[ObjectCannedACL]
    var Body: js.UndefOr[Body]
    var CacheControl: js.UndefOr[CacheControl]
    var ContentDisposition: js.UndefOr[ContentDisposition]
    var ContentEncoding: js.UndefOr[ContentEncoding]
    var ContentLanguage: js.UndefOr[ContentLanguage]
    var ContentLength: js.UndefOr[ContentLength]
    var ContentMD5: js.UndefOr[ContentMD5]
    var ContentType: js.UndefOr[ContentType]
    var Expires: js.UndefOr[Expires]
    var GrantFullControl: js.UndefOr[GrantFullControl]
    var GrantRead: js.UndefOr[GrantRead]
    var GrantReadACP: js.UndefOr[GrantReadACP]
    var GrantWriteACP: js.UndefOr[GrantWriteACP]
    var Metadata: js.UndefOr[Metadata]
    var ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus]
    var ObjectLockMode: js.UndefOr[ObjectLockMode]
    var ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate]
    var RequestPayer: js.UndefOr[RequestPayer]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var StorageClass: js.UndefOr[StorageClass]
    var Tagging: js.UndefOr[TaggingHeader]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
  }

  object PutObjectRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        ACL: js.UndefOr[ObjectCannedACL] = js.undefined,
        Body: js.UndefOr[Body] = js.undefined,
        CacheControl: js.UndefOr[CacheControl] = js.undefined,
        ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined,
        ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined,
        ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined,
        ContentLength: js.UndefOr[ContentLength] = js.undefined,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        Expires: js.UndefOr[Expires] = js.undefined,
        GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
        GrantRead: js.UndefOr[GrantRead] = js.undefined,
        GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
        GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined,
        ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined,
        ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
        SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
        ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined,
        Tagging: js.UndefOr[TaggingHeader] = js.undefined,
        WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined
    ): PutObjectRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      ACL.foreach(__v => __obj.update("ACL", __v.asInstanceOf[js.Any]))
      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      CacheControl.foreach(__v => __obj.update("CacheControl", __v.asInstanceOf[js.Any]))
      ContentDisposition.foreach(__v => __obj.update("ContentDisposition", __v.asInstanceOf[js.Any]))
      ContentEncoding.foreach(__v => __obj.update("ContentEncoding", __v.asInstanceOf[js.Any]))
      ContentLanguage.foreach(__v => __obj.update("ContentLanguage", __v.asInstanceOf[js.Any]))
      ContentLength.foreach(__v => __obj.update("ContentLength", __v.asInstanceOf[js.Any]))
      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.update("ContentType", __v.asInstanceOf[js.Any]))
      Expires.foreach(__v => __obj.update("Expires", __v.asInstanceOf[js.Any]))
      GrantFullControl.foreach(__v => __obj.update("GrantFullControl", __v.asInstanceOf[js.Any]))
      GrantRead.foreach(__v => __obj.update("GrantRead", __v.asInstanceOf[js.Any]))
      GrantReadACP.foreach(__v => __obj.update("GrantReadACP", __v.asInstanceOf[js.Any]))
      GrantWriteACP.foreach(__v => __obj.update("GrantWriteACP", __v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.update("Metadata", __v.asInstanceOf[js.Any]))
      ObjectLockLegalHoldStatus.foreach(__v => __obj.update("ObjectLockLegalHoldStatus", __v.asInstanceOf[js.Any]))
      ObjectLockMode.foreach(__v => __obj.update("ObjectLockMode", __v.asInstanceOf[js.Any]))
      ObjectLockRetainUntilDate.foreach(__v => __obj.update("ObjectLockRetainUntilDate", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKey.foreach(__v => __obj.update("SSECustomerKey", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      SSEKMSKeyId.foreach(__v => __obj.update("SSEKMSKeyId", __v.asInstanceOf[js.Any]))
      ServerSideEncryption.foreach(__v => __obj.update("ServerSideEncryption", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      Tagging.foreach(__v => __obj.update("Tagging", __v.asInstanceOf[js.Any]))
      WebsiteRedirectLocation.foreach(__v => __obj.update("WebsiteRedirectLocation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectRequest]
    }
  }

  @js.native
  trait PutObjectRetentionOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  object PutObjectRetentionOutput {
    def apply(
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): PutObjectRetentionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectRetentionOutput]
    }
  }

  @js.native
  trait PutObjectRetentionRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention]
    var ContentMD5: js.UndefOr[ContentMD5]
    var RequestPayer: js.UndefOr[RequestPayer]
    var Retention: js.UndefOr[ObjectLockRetention]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object PutObjectRetentionRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention] = js.undefined,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        Retention: js.UndefOr[ObjectLockRetention] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): PutObjectRetentionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      BypassGovernanceRetention.foreach(__v => __obj.update("BypassGovernanceRetention", __v.asInstanceOf[js.Any]))
      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      Retention.foreach(__v => __obj.update("Retention", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectRetentionRequest]
    }
  }

  @js.native
  trait PutObjectTaggingOutput extends js.Object {
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object PutObjectTaggingOutput {
    def apply(
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): PutObjectTaggingOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectTaggingOutput]
    }
  }

  @js.native
  trait PutObjectTaggingRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var Tagging: Tagging
    var ContentMD5: js.UndefOr[ContentMD5]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object PutObjectTaggingRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        Tagging: Tagging,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): PutObjectTaggingRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"  -> Bucket.asInstanceOf[js.Any],
        "Key"     -> Key.asInstanceOf[js.Any],
        "Tagging" -> Tagging.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutObjectTaggingRequest]
    }
  }

  @js.native
  trait PutPublicAccessBlockRequest extends js.Object {
    var Bucket: BucketName
    var PublicAccessBlockConfiguration: PublicAccessBlockConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  object PutPublicAccessBlockRequest {
    def apply(
        Bucket: BucketName,
        PublicAccessBlockConfiguration: PublicAccessBlockConfiguration,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutPublicAccessBlockRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"                         -> Bucket.asInstanceOf[js.Any],
        "PublicAccessBlockConfiguration" -> PublicAccessBlockConfiguration.asInstanceOf[js.Any]
      )

      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPublicAccessBlockRequest]
    }
  }

  /**
    * A container for specifying the configuration for publication of messages to an Amazon Simple Queue Service (Amazon SQS) queue.when Amazon S3 detects specified events.
    */
  @js.native
  trait QueueConfiguration extends js.Object {
    var Events: EventList
    var QueueArn: QueueArn
    var Filter: js.UndefOr[NotificationConfigurationFilter]
    var Id: js.UndefOr[NotificationId]
  }

  object QueueConfiguration {
    def apply(
        Events: EventList,
        QueueArn: QueueArn,
        Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined,
        Id: js.UndefOr[NotificationId] = js.undefined
    ): QueueConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Events"   -> Events.asInstanceOf[js.Any],
        "QueueArn" -> QueueArn.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueueConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait QueueConfigurationDeprecated extends js.Object {
    var Event: js.UndefOr[Event]
    var Events: js.UndefOr[EventList]
    var Id: js.UndefOr[NotificationId]
    var Queue: js.UndefOr[QueueArn]
  }

  object QueueConfigurationDeprecated {
    def apply(
        Event: js.UndefOr[Event] = js.undefined,
        Events: js.UndefOr[EventList] = js.undefined,
        Id: js.UndefOr[NotificationId] = js.undefined,
        Queue: js.UndefOr[QueueArn] = js.undefined
    ): QueueConfigurationDeprecated = {
      val __obj = js.Dictionary.empty[js.Any]
      Event.foreach(__v => __obj.update("Event", __v.asInstanceOf[js.Any]))
      Events.foreach(__v => __obj.update("Events", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.update("Queue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueueConfigurationDeprecated]
    }
  }

  object QuoteFieldsEnum {
    val ALWAYS   = "ALWAYS"
    val ASNEEDED = "ASNEEDED"

    val values = IndexedSeq(ALWAYS, ASNEEDED)
  }

  /**
    * <p/>
    */
  @js.native
  trait RecordsEvent extends js.Object {
    var Payload: js.UndefOr[Body]
  }

  object RecordsEvent {
    def apply(
        Payload: js.UndefOr[Body] = js.undefined
    ): RecordsEvent = {
      val __obj = js.Dictionary.empty[js.Any]
      Payload.foreach(__v => __obj.update("Payload", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordsEvent]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Redirect extends js.Object {
    var HostName: js.UndefOr[HostName]
    var HttpRedirectCode: js.UndefOr[HttpRedirectCode]
    var Protocol: js.UndefOr[Protocol]
    var ReplaceKeyPrefixWith: js.UndefOr[ReplaceKeyPrefixWith]
    var ReplaceKeyWith: js.UndefOr[ReplaceKeyWith]
  }

  object Redirect {
    def apply(
        HostName: js.UndefOr[HostName] = js.undefined,
        HttpRedirectCode: js.UndefOr[HttpRedirectCode] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined,
        ReplaceKeyPrefixWith: js.UndefOr[ReplaceKeyPrefixWith] = js.undefined,
        ReplaceKeyWith: js.UndefOr[ReplaceKeyWith] = js.undefined
    ): Redirect = {
      val __obj = js.Dictionary.empty[js.Any]
      HostName.foreach(__v => __obj.update("HostName", __v.asInstanceOf[js.Any]))
      HttpRedirectCode.foreach(__v => __obj.update("HttpRedirectCode", __v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.update("Protocol", __v.asInstanceOf[js.Any]))
      ReplaceKeyPrefixWith.foreach(__v => __obj.update("ReplaceKeyPrefixWith", __v.asInstanceOf[js.Any]))
      ReplaceKeyWith.foreach(__v => __obj.update("ReplaceKeyWith", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Redirect]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RedirectAllRequestsTo extends js.Object {
    var HostName: HostName
    var Protocol: js.UndefOr[Protocol]
  }

  object RedirectAllRequestsTo {
    def apply(
        HostName: HostName,
        Protocol: js.UndefOr[Protocol] = js.undefined
    ): RedirectAllRequestsTo = {
      val __obj = js.Dictionary[js.Any](
        "HostName" -> HostName.asInstanceOf[js.Any]
      )

      Protocol.foreach(__v => __obj.update("Protocol", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedirectAllRequestsTo]
    }
  }

  /**
    * A container for replication rules. You can add up to 1,000 rules. The maximum size of a replication configuration is 2 MB.
    */
  @js.native
  trait ReplicationConfiguration extends js.Object {
    var Role: Role
    var Rules: ReplicationRules
  }

  object ReplicationConfiguration {
    def apply(
        Role: Role,
        Rules: ReplicationRules
    ): ReplicationConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Role"  -> Role.asInstanceOf[js.Any],
        "Rules" -> Rules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReplicationConfiguration]
    }
  }

  /**
    * A container for information about a specific replication rule.
    */
  @js.native
  trait ReplicationRule extends js.Object {
    var Destination: Destination
    var Status: ReplicationRuleStatus
    var DeleteMarkerReplication: js.UndefOr[DeleteMarkerReplication]
    var Filter: js.UndefOr[ReplicationRuleFilter]
    var ID: js.UndefOr[ID]
    var Prefix: js.UndefOr[Prefix]
    var Priority: js.UndefOr[Priority]
    var SourceSelectionCriteria: js.UndefOr[SourceSelectionCriteria]
  }

  object ReplicationRule {
    def apply(
        Destination: Destination,
        Status: ReplicationRuleStatus,
        DeleteMarkerReplication: js.UndefOr[DeleteMarkerReplication] = js.undefined,
        Filter: js.UndefOr[ReplicationRuleFilter] = js.undefined,
        ID: js.UndefOr[ID] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        Priority: js.UndefOr[Priority] = js.undefined,
        SourceSelectionCriteria: js.UndefOr[SourceSelectionCriteria] = js.undefined
    ): ReplicationRule = {
      val __obj = js.Dictionary[js.Any](
        "Destination" -> Destination.asInstanceOf[js.Any],
        "Status"      -> Status.asInstanceOf[js.Any]
      )

      DeleteMarkerReplication.foreach(__v => __obj.update("DeleteMarkerReplication", __v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      ID.foreach(__v => __obj.update("ID", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      SourceSelectionCriteria.foreach(__v => __obj.update("SourceSelectionCriteria", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationRule]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ReplicationRuleAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[TagSet]
  }

  object ReplicationRuleAndOperator {
    def apply(
        Prefix: js.UndefOr[Prefix] = js.undefined,
        Tags: js.UndefOr[TagSet] = js.undefined
    ): ReplicationRuleAndOperator = {
      val __obj = js.Dictionary.empty[js.Any]
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationRuleAndOperator]
    }
  }

  /**
    * A filter that identifies the subset of objects to which the replication rule applies. A <code>Filter</code> must specify exactly one <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child element.
    */
  @js.native
  trait ReplicationRuleFilter extends js.Object {
    var And: js.UndefOr[ReplicationRuleAndOperator]
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[Tag]
  }

  object ReplicationRuleFilter {
    def apply(
        And: js.UndefOr[ReplicationRuleAndOperator] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        Tag: js.UndefOr[Tag] = js.undefined
    ): ReplicationRuleFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      And.foreach(__v => __obj.update("And", __v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.update("Prefix", __v.asInstanceOf[js.Any]))
      Tag.foreach(__v => __obj.update("Tag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationRuleFilter]
    }
  }

  object ReplicationRuleStatusEnum {
    val Enabled  = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  object ReplicationStatusEnum {
    val COMPLETE = "COMPLETE"
    val PENDING  = "PENDING"
    val FAILED   = "FAILED"
    val REPLICA  = "REPLICA"

    val values = IndexedSeq(COMPLETE, PENDING, FAILED, REPLICA)
  }

  /**
    * If present, indicates that the requester was successfully charged for the request.
    */
  object RequestChargedEnum {
    val requester = "requester"

    val values = IndexedSeq(requester)
  }

  /**
    * Confirms that the requester knows that she or he will be charged for the request. Bucket owners need not specify this parameter in their requests. Documentation on downloading objects from requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html
    */
  object RequestPayerEnum {
    val requester = "requester"

    val values = IndexedSeq(requester)
  }

  /**
    * <p/>
    */
  @js.native
  trait RequestPaymentConfiguration extends js.Object {
    var Payer: Payer
  }

  object RequestPaymentConfiguration {
    def apply(
        Payer: Payer
    ): RequestPaymentConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Payer" -> Payer.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RequestPaymentConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RequestProgress extends js.Object {
    var Enabled: js.UndefOr[EnableRequestProgress]
  }

  object RequestProgress {
    def apply(
        Enabled: js.UndefOr[EnableRequestProgress] = js.undefined
    ): RequestProgress = {
      val __obj = js.Dictionary.empty[js.Any]
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestProgress]
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
        RestoreOutputPath: js.UndefOr[RestoreOutputPath] = js.undefined
    ): RestoreObjectOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      RestoreOutputPath.foreach(__v => __obj.update("RestoreOutputPath", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreObjectOutput]
    }
  }

  @js.native
  trait RestoreObjectRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer]
    var RestoreRequest: js.UndefOr[RestoreRequest]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  object RestoreObjectRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        RestoreRequest: js.UndefOr[RestoreRequest] = js.undefined,
        VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): RestoreObjectRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key"    -> Key.asInstanceOf[js.Any]
      )

      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      RestoreRequest.foreach(__v => __obj.update("RestoreRequest", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreObjectRequest]
    }
  }

  /**
    * Container for restore job parameters.
    */
  @js.native
  trait RestoreRequest extends js.Object {
    var Days: js.UndefOr[Days]
    var Description: js.UndefOr[Description]
    var GlacierJobParameters: js.UndefOr[GlacierJobParameters]
    var OutputLocation: js.UndefOr[OutputLocation]
    var SelectParameters: js.UndefOr[SelectParameters]
    var Tier: js.UndefOr[Tier]
    var Type: js.UndefOr[RestoreRequestType]
  }

  object RestoreRequest {
    def apply(
        Days: js.UndefOr[Days] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        GlacierJobParameters: js.UndefOr[GlacierJobParameters] = js.undefined,
        OutputLocation: js.UndefOr[OutputLocation] = js.undefined,
        SelectParameters: js.UndefOr[SelectParameters] = js.undefined,
        Tier: js.UndefOr[Tier] = js.undefined,
        Type: js.UndefOr[RestoreRequestType] = js.undefined
    ): RestoreRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Days.foreach(__v => __obj.update("Days", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      GlacierJobParameters.foreach(__v => __obj.update("GlacierJobParameters", __v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.update("OutputLocation", __v.asInstanceOf[js.Any]))
      SelectParameters.foreach(__v => __obj.update("SelectParameters", __v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.update("Tier", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreRequest]
    }
  }

  object RestoreRequestTypeEnum {
    val SELECT = "SELECT"

    val values = IndexedSeq(SELECT)
  }

  /**
    * <p/>
    */
  @js.native
  trait RoutingRule extends js.Object {
    var Redirect: Redirect
    var Condition: js.UndefOr[Condition]
  }

  object RoutingRule {
    def apply(
        Redirect: Redirect,
        Condition: js.UndefOr[Condition] = js.undefined
    ): RoutingRule = {
      val __obj = js.Dictionary[js.Any](
        "Redirect" -> Redirect.asInstanceOf[js.Any]
      )

      Condition.foreach(__v => __obj.update("Condition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoutingRule]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Rule extends js.Object {
    var Prefix: Prefix
    var Status: ExpirationStatus
    var AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload]
    var Expiration: js.UndefOr[LifecycleExpiration]
    var ID: js.UndefOr[ID]
    var NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration]
    var NoncurrentVersionTransition: js.UndefOr[NoncurrentVersionTransition]
    var Transition: js.UndefOr[Transition]
  }

  object Rule {
    def apply(
        Prefix: Prefix,
        Status: ExpirationStatus,
        AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload] = js.undefined,
        Expiration: js.UndefOr[LifecycleExpiration] = js.undefined,
        ID: js.UndefOr[ID] = js.undefined,
        NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration] = js.undefined,
        NoncurrentVersionTransition: js.UndefOr[NoncurrentVersionTransition] = js.undefined,
        Transition: js.UndefOr[Transition] = js.undefined
    ): Rule = {
      val __obj = js.Dictionary[js.Any](
        "Prefix" -> Prefix.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      AbortIncompleteMultipartUpload.foreach(
        __v => __obj.update("AbortIncompleteMultipartUpload", __v.asInstanceOf[js.Any])
      )
      Expiration.foreach(__v => __obj.update("Expiration", __v.asInstanceOf[js.Any]))
      ID.foreach(__v => __obj.update("ID", __v.asInstanceOf[js.Any]))
      NoncurrentVersionExpiration.foreach(__v => __obj.update("NoncurrentVersionExpiration", __v.asInstanceOf[js.Any]))
      NoncurrentVersionTransition.foreach(__v => __obj.update("NoncurrentVersionTransition", __v.asInstanceOf[js.Any]))
      Transition.foreach(__v => __obj.update("Transition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rule]
    }
  }

  /**
    * A container for object key name prefix and suffix filtering rules.
    */
  @js.native
  trait S3KeyFilter extends js.Object {
    var FilterRules: js.UndefOr[FilterRuleList]
  }

  object S3KeyFilter {
    def apply(
        FilterRules: js.UndefOr[FilterRuleList] = js.undefined
    ): S3KeyFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      FilterRules.foreach(__v => __obj.update("FilterRules", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3KeyFilter]
    }
  }

  /**
    * Describes an S3 location that will receive the results of the restore request.
    */
  @js.native
  trait S3Location extends js.Object {
    var BucketName: BucketName
    var Prefix: LocationPrefix
    var AccessControlList: js.UndefOr[Grants]
    var CannedACL: js.UndefOr[ObjectCannedACL]
    var Encryption: js.UndefOr[Encryption]
    var StorageClass: js.UndefOr[StorageClass]
    var Tagging: js.UndefOr[Tagging]
    var UserMetadata: js.UndefOr[UserMetadata]
  }

  object S3Location {
    def apply(
        BucketName: BucketName,
        Prefix: LocationPrefix,
        AccessControlList: js.UndefOr[Grants] = js.undefined,
        CannedACL: js.UndefOr[ObjectCannedACL] = js.undefined,
        Encryption: js.UndefOr[Encryption] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined,
        Tagging: js.UndefOr[Tagging] = js.undefined,
        UserMetadata: js.UndefOr[UserMetadata] = js.undefined
    ): S3Location = {
      val __obj = js.Dictionary[js.Any](
        "BucketName" -> BucketName.asInstanceOf[js.Any],
        "Prefix"     -> Prefix.asInstanceOf[js.Any]
      )

      AccessControlList.foreach(__v => __obj.update("AccessControlList", __v.asInstanceOf[js.Any]))
      CannedACL.foreach(__v => __obj.update("CannedACL", __v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.update("Encryption", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      Tagging.foreach(__v => __obj.update("Tagging", __v.asInstanceOf[js.Any]))
      UserMetadata.foreach(__v => __obj.update("UserMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /**
    * Specifies the use of SSE-KMS to encrypt delivered Inventory reports.
    */
  @js.native
  trait SSEKMS extends js.Object {
    var KeyId: SSEKMSKeyId
  }

  object SSEKMS {
    def apply(
        KeyId: SSEKMSKeyId
    ): SSEKMS = {
      val __obj = js.Dictionary[js.Any](
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SSEKMS]
    }
  }

  /**
    * Specifies the use of SSE-S3 to encrypt delivered Inventory reports.
    */
  @js.native
  trait SSES3 extends js.Object {}

  object SSES3 {
    def apply(
        ): SSES3 = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[SSES3]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait SelectObjectContentEventStream extends js.Object {
    var Cont: js.UndefOr[ContinuationEvent]
    var End: js.UndefOr[EndEvent]
    var Progress: js.UndefOr[ProgressEvent]
    var Records: js.UndefOr[RecordsEvent]
    var Stats: js.UndefOr[StatsEvent]
  }

  object SelectObjectContentEventStream {
    def apply(
        Cont: js.UndefOr[ContinuationEvent] = js.undefined,
        End: js.UndefOr[EndEvent] = js.undefined,
        Progress: js.UndefOr[ProgressEvent] = js.undefined,
        Records: js.UndefOr[RecordsEvent] = js.undefined,
        Stats: js.UndefOr[StatsEvent] = js.undefined
    ): SelectObjectContentEventStream = {
      val __obj = js.Dictionary.empty[js.Any]
      Cont.foreach(__v => __obj.update("Cont", __v.asInstanceOf[js.Any]))
      End.foreach(__v => __obj.update("End", __v.asInstanceOf[js.Any]))
      Progress.foreach(__v => __obj.update("Progress", __v.asInstanceOf[js.Any]))
      Records.foreach(__v => __obj.update("Records", __v.asInstanceOf[js.Any]))
      Stats.foreach(__v => __obj.update("Stats", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectObjectContentEventStream]
    }
  }

  @js.native
  trait SelectObjectContentOutput extends js.Object {
    var Payload: js.UndefOr[SelectObjectContentEventStream]
  }

  object SelectObjectContentOutput {
    def apply(
        Payload: js.UndefOr[SelectObjectContentEventStream] = js.undefined
    ): SelectObjectContentOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Payload.foreach(__v => __obj.update("Payload", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectObjectContentOutput]
    }
  }

  /**
    * Request to filter the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In the request, along with the SQL expression, you must specify a data serialization format (JSON or CSV) of the object. Amazon S3 uses this to parse object data into records. It returns only records that match the specified SQL expression. You must also specify the data serialization format for the response. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectSELECTContent.html|S3Select API Documentation]].
    */
  @js.native
  trait SelectObjectContentRequest extends js.Object {
    var Bucket: BucketName
    var Expression: Expression
    var ExpressionType: ExpressionType
    var InputSerialization: InputSerialization
    var Key: ObjectKey
    var OutputSerialization: OutputSerialization
    var RequestProgress: js.UndefOr[RequestProgress]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
  }

  object SelectObjectContentRequest {
    def apply(
        Bucket: BucketName,
        Expression: Expression,
        ExpressionType: ExpressionType,
        InputSerialization: InputSerialization,
        Key: ObjectKey,
        OutputSerialization: OutputSerialization,
        RequestProgress: js.UndefOr[RequestProgress] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    ): SelectObjectContentRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"              -> Bucket.asInstanceOf[js.Any],
        "Expression"          -> Expression.asInstanceOf[js.Any],
        "ExpressionType"      -> ExpressionType.asInstanceOf[js.Any],
        "InputSerialization"  -> InputSerialization.asInstanceOf[js.Any],
        "Key"                 -> Key.asInstanceOf[js.Any],
        "OutputSerialization" -> OutputSerialization.asInstanceOf[js.Any]
      )

      RequestProgress.foreach(__v => __obj.update("RequestProgress", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKey.foreach(__v => __obj.update("SSECustomerKey", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectObjectContentRequest]
    }
  }

  /**
    * Describes the parameters for Select job types.
    */
  @js.native
  trait SelectParameters extends js.Object {
    var Expression: Expression
    var ExpressionType: ExpressionType
    var InputSerialization: InputSerialization
    var OutputSerialization: OutputSerialization
  }

  object SelectParameters {
    def apply(
        Expression: Expression,
        ExpressionType: ExpressionType,
        InputSerialization: InputSerialization,
        OutputSerialization: OutputSerialization
    ): SelectParameters = {
      val __obj = js.Dictionary[js.Any](
        "Expression"          -> Expression.asInstanceOf[js.Any],
        "ExpressionType"      -> ExpressionType.asInstanceOf[js.Any],
        "InputSerialization"  -> InputSerialization.asInstanceOf[js.Any],
        "OutputSerialization" -> OutputSerialization.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SelectParameters]
    }
  }

  object ServerSideEncryptionEnum {
    val AES256    = "AES256"
    val `aws:kms` = "aws:kms"

    val values = IndexedSeq(AES256, `aws:kms`)
  }

  /**
    * Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.
    */
  @js.native
  trait ServerSideEncryptionByDefault extends js.Object {
    var SSEAlgorithm: ServerSideEncryption
    var KMSMasterKeyID: js.UndefOr[SSEKMSKeyId]
  }

  object ServerSideEncryptionByDefault {
    def apply(
        SSEAlgorithm: ServerSideEncryption,
        KMSMasterKeyID: js.UndefOr[SSEKMSKeyId] = js.undefined
    ): ServerSideEncryptionByDefault = {
      val __obj = js.Dictionary[js.Any](
        "SSEAlgorithm" -> SSEAlgorithm.asInstanceOf[js.Any]
      )

      KMSMasterKeyID.foreach(__v => __obj.update("KMSMasterKeyID", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerSideEncryptionByDefault]
    }
  }

  /**
    * Container for server-side encryption configuration rules. Currently S3 supports one rule only.
    */
  @js.native
  trait ServerSideEncryptionConfiguration extends js.Object {
    var Rules: ServerSideEncryptionRules
  }

  object ServerSideEncryptionConfiguration {
    def apply(
        Rules: ServerSideEncryptionRules
    ): ServerSideEncryptionConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Rules" -> Rules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ServerSideEncryptionConfiguration]
    }
  }

  /**
    * Container for information about a particular server-side encryption configuration rule.
    */
  @js.native
  trait ServerSideEncryptionRule extends js.Object {
    var ApplyServerSideEncryptionByDefault: js.UndefOr[ServerSideEncryptionByDefault]
  }

  object ServerSideEncryptionRule {
    def apply(
        ApplyServerSideEncryptionByDefault: js.UndefOr[ServerSideEncryptionByDefault] = js.undefined
    ): ServerSideEncryptionRule = {
      val __obj = js.Dictionary.empty[js.Any]
      ApplyServerSideEncryptionByDefault.foreach(
        __v => __obj.update("ApplyServerSideEncryptionByDefault", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ServerSideEncryptionRule]
    }
  }

  /**
    * A container for filters that define which source objects should be replicated.
    */
  @js.native
  trait SourceSelectionCriteria extends js.Object {
    var SseKmsEncryptedObjects: js.UndefOr[SseKmsEncryptedObjects]
  }

  object SourceSelectionCriteria {
    def apply(
        SseKmsEncryptedObjects: js.UndefOr[SseKmsEncryptedObjects] = js.undefined
    ): SourceSelectionCriteria = {
      val __obj = js.Dictionary.empty[js.Any]
      SseKmsEncryptedObjects.foreach(__v => __obj.update("SseKmsEncryptedObjects", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceSelectionCriteria]
    }
  }

  /**
    * A container for filter information for the selection of S3 objects encrypted with AWS KMS.
    */
  @js.native
  trait SseKmsEncryptedObjects extends js.Object {
    var Status: SseKmsEncryptedObjectsStatus
  }

  object SseKmsEncryptedObjects {
    def apply(
        Status: SseKmsEncryptedObjectsStatus
    ): SseKmsEncryptedObjects = {
      val __obj = js.Dictionary[js.Any](
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SseKmsEncryptedObjects]
    }
  }

  object SseKmsEncryptedObjectsStatusEnum {
    val Enabled  = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  /**
    * <p/>
    */
  @js.native
  trait Stats extends js.Object {
    var BytesProcessed: js.UndefOr[BytesProcessed]
    var BytesReturned: js.UndefOr[BytesReturned]
    var BytesScanned: js.UndefOr[BytesScanned]
  }

  object Stats {
    def apply(
        BytesProcessed: js.UndefOr[BytesProcessed] = js.undefined,
        BytesReturned: js.UndefOr[BytesReturned] = js.undefined,
        BytesScanned: js.UndefOr[BytesScanned] = js.undefined
    ): Stats = {
      val __obj = js.Dictionary.empty[js.Any]
      BytesProcessed.foreach(__v => __obj.update("BytesProcessed", __v.asInstanceOf[js.Any]))
      BytesReturned.foreach(__v => __obj.update("BytesReturned", __v.asInstanceOf[js.Any]))
      BytesScanned.foreach(__v => __obj.update("BytesScanned", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Stats]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait StatsEvent extends js.Object {
    var Details: js.UndefOr[Stats]
  }

  object StatsEvent {
    def apply(
        Details: js.UndefOr[Stats] = js.undefined
    ): StatsEvent = {
      val __obj = js.Dictionary.empty[js.Any]
      Details.foreach(__v => __obj.update("Details", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatsEvent]
    }
  }

  object StorageClassEnum {
    val STANDARD            = "STANDARD"
    val REDUCED_REDUNDANCY  = "REDUCED_REDUNDANCY"
    val STANDARD_IA         = "STANDARD_IA"
    val ONEZONE_IA          = "ONEZONE_IA"
    val INTELLIGENT_TIERING = "INTELLIGENT_TIERING"
    val GLACIER             = "GLACIER"
    val DEEP_ARCHIVE        = "DEEP_ARCHIVE"

    val values =
      IndexedSeq(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE)
  }

  /**
    * <p/>
    */
  @js.native
  trait StorageClassAnalysis extends js.Object {
    var DataExport: js.UndefOr[StorageClassAnalysisDataExport]
  }

  object StorageClassAnalysis {
    def apply(
        DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.undefined
    ): StorageClassAnalysis = {
      val __obj = js.Dictionary.empty[js.Any]
      DataExport.foreach(__v => __obj.update("DataExport", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageClassAnalysis]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait StorageClassAnalysisDataExport extends js.Object {
    var Destination: AnalyticsExportDestination
    var OutputSchemaVersion: StorageClassAnalysisSchemaVersion
  }

  object StorageClassAnalysisDataExport {
    def apply(
        Destination: AnalyticsExportDestination,
        OutputSchemaVersion: StorageClassAnalysisSchemaVersion
    ): StorageClassAnalysisDataExport = {
      val __obj = js.Dictionary[js.Any](
        "Destination"         -> Destination.asInstanceOf[js.Any],
        "OutputSchemaVersion" -> OutputSchemaVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StorageClassAnalysisDataExport]
    }
  }

  object StorageClassAnalysisSchemaVersionEnum {
    val V_1 = "V_1"

    val values = IndexedSeq(V_1)
  }

  /**
    * <p/>
    */
  @js.native
  trait Tag extends js.Object {
    var Key: ObjectKey
    var Value: Value
  }

  object Tag {
    def apply(
        Key: ObjectKey,
        Value: Value
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait Tagging extends js.Object {
    var TagSet: TagSet
  }

  object Tagging {
    def apply(
        TagSet: TagSet
    ): Tagging = {
      val __obj = js.Dictionary[js.Any](
        "TagSet" -> TagSet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tagging]
    }
  }

  object TaggingDirectiveEnum {
    val COPY    = "COPY"
    val REPLACE = "REPLACE"

    val values = IndexedSeq(COPY, REPLACE)
  }

  /**
    * <p/>
    */
  @js.native
  trait TargetGrant extends js.Object {
    var Grantee: js.UndefOr[Grantee]
    var Permission: js.UndefOr[BucketLogsPermission]
  }

  object TargetGrant {
    def apply(
        Grantee: js.UndefOr[Grantee] = js.undefined,
        Permission: js.UndefOr[BucketLogsPermission] = js.undefined
    ): TargetGrant = {
      val __obj = js.Dictionary.empty[js.Any]
      Grantee.foreach(__v => __obj.update("Grantee", __v.asInstanceOf[js.Any]))
      Permission.foreach(__v => __obj.update("Permission", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetGrant]
    }
  }

  object TierEnum {
    val Standard  = "Standard"
    val Bulk      = "Bulk"
    val Expedited = "Expedited"

    val values = IndexedSeq(Standard, Bulk, Expedited)
  }

  /**
    * A container for specifying the configuration for publication of messages to an Amazon Simple Notification Service (Amazon SNS) topic.when Amazon S3 detects specified events.
    */
  @js.native
  trait TopicConfiguration extends js.Object {
    var Events: EventList
    var TopicArn: TopicArn
    var Filter: js.UndefOr[NotificationConfigurationFilter]
    var Id: js.UndefOr[NotificationId]
  }

  object TopicConfiguration {
    def apply(
        Events: EventList,
        TopicArn: TopicArn,
        Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined,
        Id: js.UndefOr[NotificationId] = js.undefined
    ): TopicConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Events"   -> Events.asInstanceOf[js.Any],
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicConfiguration]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait TopicConfigurationDeprecated extends js.Object {
    var Event: js.UndefOr[Event]
    var Events: js.UndefOr[EventList]
    var Id: js.UndefOr[NotificationId]
    var Topic: js.UndefOr[TopicArn]
  }

  object TopicConfigurationDeprecated {
    def apply(
        Event: js.UndefOr[Event] = js.undefined,
        Events: js.UndefOr[EventList] = js.undefined,
        Id: js.UndefOr[NotificationId] = js.undefined,
        Topic: js.UndefOr[TopicArn] = js.undefined
    ): TopicConfigurationDeprecated = {
      val __obj = js.Dictionary.empty[js.Any]
      Event.foreach(__v => __obj.update("Event", __v.asInstanceOf[js.Any]))
      Events.foreach(__v => __obj.update("Events", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Topic.foreach(__v => __obj.update("Topic", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicConfigurationDeprecated]
    }
  }

  /**
    * <p/>
    */
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
        StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
    ): Transition = {
      val __obj = js.Dictionary.empty[js.Any]
      Date.foreach(__v => __obj.update("Date", __v.asInstanceOf[js.Any]))
      Days.foreach(__v => __obj.update("Days", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Transition]
    }
  }

  object TransitionStorageClassEnum {
    val GLACIER             = "GLACIER"
    val STANDARD_IA         = "STANDARD_IA"
    val ONEZONE_IA          = "ONEZONE_IA"
    val INTELLIGENT_TIERING = "INTELLIGENT_TIERING"
    val DEEP_ARCHIVE        = "DEEP_ARCHIVE"

    val values = IndexedSeq(GLACIER, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE)
  }

  object TypeEnum {
    val CanonicalUser         = "CanonicalUser"
    val AmazonCustomerByEmail = "AmazonCustomerByEmail"
    val Group                 = "Group"

    val values = IndexedSeq(CanonicalUser, AmazonCustomerByEmail, Group)
  }

  @js.native
  trait UploadPartCopyOutput extends js.Object {
    var CopyPartResult: js.UndefOr[CopyPartResult]
    var CopySourceVersionId: js.UndefOr[CopySourceVersionId]
    var RequestCharged: js.UndefOr[RequestCharged]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
  }

  object UploadPartCopyOutput {
    def apply(
        CopyPartResult: js.UndefOr[CopyPartResult] = js.undefined,
        CopySourceVersionId: js.UndefOr[CopySourceVersionId] = js.undefined,
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
        SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
        ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
    ): UploadPartCopyOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      CopyPartResult.foreach(__v => __obj.update("CopyPartResult", __v.asInstanceOf[js.Any]))
      CopySourceVersionId.foreach(__v => __obj.update("CopySourceVersionId", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      SSEKMSKeyId.foreach(__v => __obj.update("SSEKMSKeyId", __v.asInstanceOf[js.Any]))
      ServerSideEncryption.foreach(__v => __obj.update("ServerSideEncryption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadPartCopyOutput]
    }
  }

  @js.native
  trait UploadPartCopyRequest extends js.Object {
    var Bucket: BucketName
    var CopySource: CopySource
    var Key: ObjectKey
    var PartNumber: PartNumber
    var UploadId: MultipartUploadId
    var CopySourceIfMatch: js.UndefOr[CopySourceIfMatch]
    var CopySourceIfModifiedSince: js.UndefOr[CopySourceIfModifiedSince]
    var CopySourceIfNoneMatch: js.UndefOr[CopySourceIfNoneMatch]
    var CopySourceIfUnmodifiedSince: js.UndefOr[CopySourceIfUnmodifiedSince]
    var CopySourceRange: js.UndefOr[CopySourceRange]
    var CopySourceSSECustomerAlgorithm: js.UndefOr[CopySourceSSECustomerAlgorithm]
    var CopySourceSSECustomerKey: js.UndefOr[CopySourceSSECustomerKey]
    var CopySourceSSECustomerKeyMD5: js.UndefOr[CopySourceSSECustomerKeyMD5]
    var RequestPayer: js.UndefOr[RequestPayer]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
  }

  object UploadPartCopyRequest {
    def apply(
        Bucket: BucketName,
        CopySource: CopySource,
        Key: ObjectKey,
        PartNumber: PartNumber,
        UploadId: MultipartUploadId,
        CopySourceIfMatch: js.UndefOr[CopySourceIfMatch] = js.undefined,
        CopySourceIfModifiedSince: js.UndefOr[CopySourceIfModifiedSince] = js.undefined,
        CopySourceIfNoneMatch: js.UndefOr[CopySourceIfNoneMatch] = js.undefined,
        CopySourceIfUnmodifiedSince: js.UndefOr[CopySourceIfUnmodifiedSince] = js.undefined,
        CopySourceRange: js.UndefOr[CopySourceRange] = js.undefined,
        CopySourceSSECustomerAlgorithm: js.UndefOr[CopySourceSSECustomerAlgorithm] = js.undefined,
        CopySourceSSECustomerKey: js.UndefOr[CopySourceSSECustomerKey] = js.undefined,
        CopySourceSSECustomerKeyMD5: js.UndefOr[CopySourceSSECustomerKeyMD5] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    ): UploadPartCopyRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"     -> Bucket.asInstanceOf[js.Any],
        "CopySource" -> CopySource.asInstanceOf[js.Any],
        "Key"        -> Key.asInstanceOf[js.Any],
        "PartNumber" -> PartNumber.asInstanceOf[js.Any],
        "UploadId"   -> UploadId.asInstanceOf[js.Any]
      )

      CopySourceIfMatch.foreach(__v => __obj.update("CopySourceIfMatch", __v.asInstanceOf[js.Any]))
      CopySourceIfModifiedSince.foreach(__v => __obj.update("CopySourceIfModifiedSince", __v.asInstanceOf[js.Any]))
      CopySourceIfNoneMatch.foreach(__v => __obj.update("CopySourceIfNoneMatch", __v.asInstanceOf[js.Any]))
      CopySourceIfUnmodifiedSince.foreach(__v => __obj.update("CopySourceIfUnmodifiedSince", __v.asInstanceOf[js.Any]))
      CopySourceRange.foreach(__v => __obj.update("CopySourceRange", __v.asInstanceOf[js.Any]))
      CopySourceSSECustomerAlgorithm.foreach(
        __v => __obj.update("CopySourceSSECustomerAlgorithm", __v.asInstanceOf[js.Any])
      )
      CopySourceSSECustomerKey.foreach(__v => __obj.update("CopySourceSSECustomerKey", __v.asInstanceOf[js.Any]))
      CopySourceSSECustomerKeyMD5.foreach(__v => __obj.update("CopySourceSSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKey.foreach(__v => __obj.update("SSECustomerKey", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadPartCopyRequest]
    }
  }

  @js.native
  trait UploadPartOutput extends js.Object {
    var ETag: js.UndefOr[ETag]
    var RequestCharged: js.UndefOr[RequestCharged]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
  }

  object UploadPartOutput {
    def apply(
        ETag: js.UndefOr[ETag] = js.undefined,
        RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
        SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
        ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
    ): UploadPartOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      RequestCharged.foreach(__v => __obj.update("RequestCharged", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      SSEKMSKeyId.foreach(__v => __obj.update("SSEKMSKeyId", __v.asInstanceOf[js.Any]))
      ServerSideEncryption.foreach(__v => __obj.update("ServerSideEncryption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadPartOutput]
    }
  }

  @js.native
  trait UploadPartRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var PartNumber: PartNumber
    var UploadId: MultipartUploadId
    var Body: js.UndefOr[Body]
    var ContentLength: js.UndefOr[ContentLength]
    var ContentMD5: js.UndefOr[ContentMD5]
    var RequestPayer: js.UndefOr[RequestPayer]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKey: js.UndefOr[SSECustomerKey]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
  }

  object UploadPartRequest {
    def apply(
        Bucket: BucketName,
        Key: ObjectKey,
        PartNumber: PartNumber,
        UploadId: MultipartUploadId,
        Body: js.UndefOr[Body] = js.undefined,
        ContentLength: js.UndefOr[ContentLength] = js.undefined,
        ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
        RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
        SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
        SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined,
        SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    ): UploadPartRequest = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"     -> Bucket.asInstanceOf[js.Any],
        "Key"        -> Key.asInstanceOf[js.Any],
        "PartNumber" -> PartNumber.asInstanceOf[js.Any],
        "UploadId"   -> UploadId.asInstanceOf[js.Any]
      )

      Body.foreach(__v => __obj.update("Body", __v.asInstanceOf[js.Any]))
      ContentLength.foreach(__v => __obj.update("ContentLength", __v.asInstanceOf[js.Any]))
      ContentMD5.foreach(__v => __obj.update("ContentMD5", __v.asInstanceOf[js.Any]))
      RequestPayer.foreach(__v => __obj.update("RequestPayer", __v.asInstanceOf[js.Any]))
      SSECustomerAlgorithm.foreach(__v => __obj.update("SSECustomerAlgorithm", __v.asInstanceOf[js.Any]))
      SSECustomerKey.foreach(__v => __obj.update("SSECustomerKey", __v.asInstanceOf[js.Any]))
      SSECustomerKeyMD5.foreach(__v => __obj.update("SSECustomerKeyMD5", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadPartRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait VersioningConfiguration extends js.Object {
    var MFADelete: js.UndefOr[MFADelete]
    var Status: js.UndefOr[BucketVersioningStatus]
  }

  object VersioningConfiguration {
    def apply(
        MFADelete: js.UndefOr[MFADelete] = js.undefined,
        Status: js.UndefOr[BucketVersioningStatus] = js.undefined
    ): VersioningConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      MFADelete.foreach(__v => __obj.update("MFADelete", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VersioningConfiguration]
    }
  }

  /**
    * <p/>
    */
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
        RoutingRules: js.UndefOr[RoutingRules] = js.undefined
    ): WebsiteConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorDocument.foreach(__v => __obj.update("ErrorDocument", __v.asInstanceOf[js.Any]))
      IndexDocument.foreach(__v => __obj.update("IndexDocument", __v.asInstanceOf[js.Any]))
      RedirectAllRequestsTo.foreach(__v => __obj.update("RedirectAllRequestsTo", __v.asInstanceOf[js.Any]))
      RoutingRules.foreach(__v => __obj.update("RoutingRules", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebsiteConfiguration]
    }
  }
}
