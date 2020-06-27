package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object s3 {
  type AbortDate                       = js.Date
  type AbortRuleId                     = String
  type AcceptRanges                    = String
  type AccountId                       = String
  type AllowQuotedRecordDelimiter      = Boolean
  type AllowedHeader                   = String
  type AllowedHeaders                  = js.Array[AllowedHeader]
  type AllowedMethod                   = String
  type AllowedMethods                  = js.Array[AllowedMethod]
  type AllowedOrigin                   = String
  type AllowedOrigins                  = js.Array[AllowedOrigin]
  type AnalyticsConfigurationList      = js.Array[AnalyticsConfiguration]
  type AnalyticsId                     = String
  type Body                            = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BucketName                      = String
  type Buckets                         = js.Array[Bucket]
  type BypassGovernanceRetention       = Boolean
  type BytesProcessed                  = Double
  type BytesReturned                   = Double
  type BytesScanned                    = Double
  type CORSRules                       = js.Array[CORSRule]
  type CacheControl                    = String
  type CloudFunction                   = String
  type CloudFunctionInvocationRole     = String
  type Code                            = String
  type Comments                        = String
  type CommonPrefixList                = js.Array[CommonPrefix]
  type CompletedPartList               = js.Array[CompletedPart]
  type ConfirmRemoveSelfBucketAccess   = Boolean
  type ContentDisposition              = String
  type ContentEncoding                 = String
  type ContentLanguage                 = String
  type ContentLength                   = Double
  type ContentMD5                      = String
  type ContentRange                    = String
  type ContentType                     = String
  type CopySource                      = String
  type CopySourceIfMatch               = String
  type CopySourceIfModifiedSince       = js.Date
  type CopySourceIfNoneMatch           = String
  type CopySourceIfUnmodifiedSince     = js.Date
  type CopySourceRange                 = String
  type CopySourceSSECustomerAlgorithm  = String
  type CopySourceSSECustomerKey        = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CopySourceSSECustomerKeyMD5     = String
  type CopySourceVersionId             = String
  type CreationDate                    = js.Date
  type Date                            = js.Date
  type Days                            = Int
  type DaysAfterInitiation             = Int
  type DeleteMarker                    = Boolean
  type DeleteMarkerVersionId           = String
  type DeleteMarkers                   = js.Array[DeleteMarkerEntry]
  type DeletedObjects                  = js.Array[DeletedObject]
  type Delimiter                       = String
  type Description                     = String
  type DisplayName                     = String
  type ETag                            = String
  type EmailAddress                    = String
  type EnableRequestProgress           = Boolean
  type End                             = Double
  type Errors                          = js.Array[Error]
  type EventList                       = js.Array[Event]
  type Expiration                      = String
  type ExpiredObjectDeleteMarker       = Boolean
  type Expires                         = js.Date
  type ExposeHeader                    = String
  type ExposeHeaders                   = js.Array[ExposeHeader]
  type Expression                      = String
  type FetchOwner                      = Boolean
  type FieldDelimiter                  = String
  type FilterRuleList                  = js.Array[FilterRule]
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
  type InventoryId                     = String
  type InventoryOptionalFields         = js.Array[InventoryOptionalField]
  type IsEnabled                       = Boolean
  type IsLatest                        = Boolean
  type IsPublic                        = Boolean
  type IsTruncated                     = Boolean
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
  type Marker                          = String
  type MaxAgeSeconds                   = Int
  type MaxKeys                         = Int
  type MaxParts                        = Int
  type MaxUploads                      = Int
  type Message                         = String
  type Metadata                        = js.Dictionary[MetadataValue]
  type MetadataKey                     = String
  type MetadataValue                   = String
  type MetricsConfigurationList        = js.Array[MetricsConfiguration]
  type MetricsId                       = String
  type Minutes                         = Int
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
  type ObjectIdentifierList            = js.Array[ObjectIdentifier]
  type ObjectKey                       = String
  type ObjectList                      = js.Array[Object]
  type ObjectLockEnabledForBucket      = Boolean
  type ObjectLockRetainUntilDate       = js.Date
  type ObjectLockToken                 = String
  type ObjectVersionId                 = String
  type ObjectVersionList               = js.Array[ObjectVersion]
  type PartNumber                      = Int
  type PartNumberMarker                = Int
  type Parts                           = js.Array[Part]
  type PartsCount                      = Int
  type Policy                          = String
  type Prefix                          = String
  type Priority                        = Int
  type QueueArn                        = String
  type QueueConfigurationList          = js.Array[QueueConfiguration]
  type Quiet                           = Boolean
  type QuoteCharacter                  = String
  type QuoteEscapeCharacter            = String
  type Range                           = String
  type RecordDelimiter                 = String
  type ReplaceKeyPrefixWith            = String
  type ReplaceKeyWith                  = String
  type ReplicaKmsKeyID                 = String
  type ReplicationRules                = js.Array[ReplicationRule]
  type ResponseCacheControl            = String
  type ResponseContentDisposition      = String
  type ResponseContentEncoding         = String
  type ResponseContentLanguage         = String
  type ResponseContentType             = String
  type ResponseExpires                 = js.Date
  type Restore                         = String
  type RestoreOutputPath               = String
  type Role                            = String
  type RoutingRules                    = js.Array[RoutingRule]
  type Rules                           = js.Array[Rule]
  type SSECustomerAlgorithm            = String
  type SSECustomerKey                  = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SSECustomerKeyMD5               = String
  type SSEKMSEncryptionContext         = String
  type SSEKMSKeyId                     = String
  type ServerSideEncryptionRules       = js.Array[ServerSideEncryptionRule]
  type Setting                         = Boolean
  type Size                            = Int
  type Start                           = Double
  type StartAfter                      = String
  type Suffix                          = String
  type TagCount                        = Int
  type TagSet                          = js.Array[Tag]
  type TaggingHeader                   = String
  type TargetBucket                    = String
  type TargetGrants                    = js.Array[TargetGrant]
  type TargetPrefix                    = String
  type Token                           = String
  type TopicArn                        = String
  type TopicConfigurationList          = js.Array[TopicConfiguration]
  type TransitionList                  = js.Array[Transition]
  type URI                             = String
  type UploadIdMarker                  = String
  type UserMetadata                    = js.Array[MetadataEntry]
  type Value                           = String
  type VersionIdMarker                 = String
  type WebsiteRedirectLocation         = String
  type Years                           = Int

  implicit final class S3Ops(private val service: S3) extends AnyVal {

    @inline def abortMultipartUploadFuture(params: AbortMultipartUploadRequest): Future[AbortMultipartUploadOutput] =
      service.abortMultipartUpload(params).promise().toFuture
    @inline def completeMultipartUploadFuture(
        params: CompleteMultipartUploadRequest
    ): Future[CompleteMultipartUploadOutput] = service.completeMultipartUpload(params).promise().toFuture
    @inline def copyObjectFuture(params: CopyObjectRequest): Future[CopyObjectOutput] =
      service.copyObject(params).promise().toFuture
    @inline def createBucketFuture(params: CreateBucketRequest): Future[CreateBucketOutput] =
      service.createBucket(params).promise().toFuture
    @inline def createMultipartUploadFuture(params: CreateMultipartUploadRequest): Future[CreateMultipartUploadOutput] =
      service.createMultipartUpload(params).promise().toFuture
    @inline def deleteBucketAnalyticsConfigurationFuture(
        params: DeleteBucketAnalyticsConfigurationRequest
    ): Future[js.Object] = service.deleteBucketAnalyticsConfiguration(params).promise().toFuture
    @inline def deleteBucketCorsFuture(params: DeleteBucketCorsRequest): Future[js.Object] =
      service.deleteBucketCors(params).promise().toFuture
    @inline def deleteBucketEncryptionFuture(params: DeleteBucketEncryptionRequest): Future[js.Object] =
      service.deleteBucketEncryption(params).promise().toFuture
    @inline def deleteBucketFuture(params: DeleteBucketRequest): Future[js.Object] =
      service.deleteBucket(params).promise().toFuture
    @inline def deleteBucketInventoryConfigurationFuture(
        params: DeleteBucketInventoryConfigurationRequest
    ): Future[js.Object] = service.deleteBucketInventoryConfiguration(params).promise().toFuture
    @inline def deleteBucketLifecycleFuture(params: DeleteBucketLifecycleRequest): Future[js.Object] =
      service.deleteBucketLifecycle(params).promise().toFuture
    @inline def deleteBucketMetricsConfigurationFuture(
        params: DeleteBucketMetricsConfigurationRequest
    ): Future[js.Object] = service.deleteBucketMetricsConfiguration(params).promise().toFuture
    @inline def deleteBucketPolicyFuture(params: DeleteBucketPolicyRequest): Future[js.Object] =
      service.deleteBucketPolicy(params).promise().toFuture
    @inline def deleteBucketReplicationFuture(params: DeleteBucketReplicationRequest): Future[js.Object] =
      service.deleteBucketReplication(params).promise().toFuture
    @inline def deleteBucketTaggingFuture(params: DeleteBucketTaggingRequest): Future[js.Object] =
      service.deleteBucketTagging(params).promise().toFuture
    @inline def deleteBucketWebsiteFuture(params: DeleteBucketWebsiteRequest): Future[js.Object] =
      service.deleteBucketWebsite(params).promise().toFuture
    @inline def deleteObjectFuture(params: DeleteObjectRequest): Future[DeleteObjectOutput] =
      service.deleteObject(params).promise().toFuture
    @inline def deleteObjectTaggingFuture(params: DeleteObjectTaggingRequest): Future[DeleteObjectTaggingOutput] =
      service.deleteObjectTagging(params).promise().toFuture
    @inline def deleteObjectsFuture(params: DeleteObjectsRequest): Future[DeleteObjectsOutput] =
      service.deleteObjects(params).promise().toFuture
    @inline def deletePublicAccessBlockFuture(params: DeletePublicAccessBlockRequest): Future[js.Object] =
      service.deletePublicAccessBlock(params).promise().toFuture
    @inline def getBucketAccelerateConfigurationFuture(
        params: GetBucketAccelerateConfigurationRequest
    ): Future[GetBucketAccelerateConfigurationOutput] =
      service.getBucketAccelerateConfiguration(params).promise().toFuture
    @inline def getBucketAclFuture(params: GetBucketAclRequest): Future[GetBucketAclOutput] =
      service.getBucketAcl(params).promise().toFuture
    @inline def getBucketAnalyticsConfigurationFuture(
        params: GetBucketAnalyticsConfigurationRequest
    ): Future[GetBucketAnalyticsConfigurationOutput] =
      service.getBucketAnalyticsConfiguration(params).promise().toFuture
    @inline def getBucketCorsFuture(params: GetBucketCorsRequest): Future[GetBucketCorsOutput] =
      service.getBucketCors(params).promise().toFuture
    @inline def getBucketEncryptionFuture(params: GetBucketEncryptionRequest): Future[GetBucketEncryptionOutput] =
      service.getBucketEncryption(params).promise().toFuture
    @inline def getBucketInventoryConfigurationFuture(
        params: GetBucketInventoryConfigurationRequest
    ): Future[GetBucketInventoryConfigurationOutput] =
      service.getBucketInventoryConfiguration(params).promise().toFuture
    @inline def getBucketLifecycleConfigurationFuture(
        params: GetBucketLifecycleConfigurationRequest
    ): Future[GetBucketLifecycleConfigurationOutput] =
      service.getBucketLifecycleConfiguration(params).promise().toFuture
    @inline def getBucketLocationFuture(params: GetBucketLocationRequest): Future[GetBucketLocationOutput] =
      service.getBucketLocation(params).promise().toFuture
    @inline def getBucketLoggingFuture(params: GetBucketLoggingRequest): Future[GetBucketLoggingOutput] =
      service.getBucketLogging(params).promise().toFuture
    @inline def getBucketMetricsConfigurationFuture(
        params: GetBucketMetricsConfigurationRequest
    ): Future[GetBucketMetricsConfigurationOutput] = service.getBucketMetricsConfiguration(params).promise().toFuture
    @inline def getBucketNotificationConfigurationFuture(
        params: GetBucketNotificationConfigurationRequest
    ): Future[NotificationConfiguration] = service.getBucketNotificationConfiguration(params).promise().toFuture
    @inline def getBucketPolicyFuture(params: GetBucketPolicyRequest): Future[GetBucketPolicyOutput] =
      service.getBucketPolicy(params).promise().toFuture
    @inline def getBucketPolicyStatusFuture(params: GetBucketPolicyStatusRequest): Future[GetBucketPolicyStatusOutput] =
      service.getBucketPolicyStatus(params).promise().toFuture
    @inline def getBucketReplicationFuture(params: GetBucketReplicationRequest): Future[GetBucketReplicationOutput] =
      service.getBucketReplication(params).promise().toFuture
    @inline def getBucketRequestPaymentFuture(
        params: GetBucketRequestPaymentRequest
    ): Future[GetBucketRequestPaymentOutput] = service.getBucketRequestPayment(params).promise().toFuture
    @inline def getBucketTaggingFuture(params: GetBucketTaggingRequest): Future[GetBucketTaggingOutput] =
      service.getBucketTagging(params).promise().toFuture
    @inline def getBucketVersioningFuture(params: GetBucketVersioningRequest): Future[GetBucketVersioningOutput] =
      service.getBucketVersioning(params).promise().toFuture
    @inline def getBucketWebsiteFuture(params: GetBucketWebsiteRequest): Future[GetBucketWebsiteOutput] =
      service.getBucketWebsite(params).promise().toFuture
    @inline def getObjectAclFuture(params: GetObjectAclRequest): Future[GetObjectAclOutput] =
      service.getObjectAcl(params).promise().toFuture
    @inline def getObjectFuture(params: GetObjectRequest): Future[GetObjectOutput] =
      service.getObject(params).promise().toFuture
    @inline def getObjectLegalHoldFuture(params: GetObjectLegalHoldRequest): Future[GetObjectLegalHoldOutput] =
      service.getObjectLegalHold(params).promise().toFuture
    @inline def getObjectLockConfigurationFuture(
        params: GetObjectLockConfigurationRequest
    ): Future[GetObjectLockConfigurationOutput] = service.getObjectLockConfiguration(params).promise().toFuture
    @inline def getObjectRetentionFuture(params: GetObjectRetentionRequest): Future[GetObjectRetentionOutput] =
      service.getObjectRetention(params).promise().toFuture
    @inline def getObjectTaggingFuture(params: GetObjectTaggingRequest): Future[GetObjectTaggingOutput] =
      service.getObjectTagging(params).promise().toFuture
    @inline def getObjectTorrentFuture(params: GetObjectTorrentRequest): Future[GetObjectTorrentOutput] =
      service.getObjectTorrent(params).promise().toFuture
    @inline def getPublicAccessBlockFuture(params: GetPublicAccessBlockRequest): Future[GetPublicAccessBlockOutput] =
      service.getPublicAccessBlock(params).promise().toFuture
    @inline def headBucketFuture(params: HeadBucketRequest): Future[js.Object] =
      service.headBucket(params).promise().toFuture
    @inline def headObjectFuture(params: HeadObjectRequest): Future[HeadObjectOutput] =
      service.headObject(params).promise().toFuture
    @inline def listBucketAnalyticsConfigurationsFuture(
        params: ListBucketAnalyticsConfigurationsRequest
    ): Future[ListBucketAnalyticsConfigurationsOutput] =
      service.listBucketAnalyticsConfigurations(params).promise().toFuture
    @inline def listBucketInventoryConfigurationsFuture(
        params: ListBucketInventoryConfigurationsRequest
    ): Future[ListBucketInventoryConfigurationsOutput] =
      service.listBucketInventoryConfigurations(params).promise().toFuture
    @inline def listBucketMetricsConfigurationsFuture(
        params: ListBucketMetricsConfigurationsRequest
    ): Future[ListBucketMetricsConfigurationsOutput] =
      service.listBucketMetricsConfigurations(params).promise().toFuture
    @inline def listBucketsFuture(): Future[ListBucketsOutput] = service.listBuckets().promise().toFuture
    @inline def listMultipartUploadsFuture(params: ListMultipartUploadsRequest): Future[ListMultipartUploadsOutput] =
      service.listMultipartUploads(params).promise().toFuture
    @inline def listObjectVersionsFuture(params: ListObjectVersionsRequest): Future[ListObjectVersionsOutput] =
      service.listObjectVersions(params).promise().toFuture
    @inline def listObjectsFuture(params: ListObjectsRequest): Future[ListObjectsOutput] =
      service.listObjects(params).promise().toFuture
    @inline def listObjectsV2Future(params: ListObjectsV2Request): Future[ListObjectsV2Output] =
      service.listObjectsV2(params).promise().toFuture
    @inline def listPartsFuture(params: ListPartsRequest): Future[ListPartsOutput] =
      service.listParts(params).promise().toFuture
    @inline def putBucketAccelerateConfigurationFuture(
        params: PutBucketAccelerateConfigurationRequest
    ): Future[js.Object] = service.putBucketAccelerateConfiguration(params).promise().toFuture
    @inline def putBucketAclFuture(params: PutBucketAclRequest): Future[js.Object] =
      service.putBucketAcl(params).promise().toFuture
    @inline def putBucketAnalyticsConfigurationFuture(
        params: PutBucketAnalyticsConfigurationRequest
    ): Future[js.Object] = service.putBucketAnalyticsConfiguration(params).promise().toFuture
    @inline def putBucketCorsFuture(params: PutBucketCorsRequest): Future[js.Object] =
      service.putBucketCors(params).promise().toFuture
    @inline def putBucketEncryptionFuture(params: PutBucketEncryptionRequest): Future[js.Object] =
      service.putBucketEncryption(params).promise().toFuture
    @inline def putBucketInventoryConfigurationFuture(
        params: PutBucketInventoryConfigurationRequest
    ): Future[js.Object] = service.putBucketInventoryConfiguration(params).promise().toFuture
    @inline def putBucketLifecycleConfigurationFuture(
        params: PutBucketLifecycleConfigurationRequest
    ): Future[js.Object] = service.putBucketLifecycleConfiguration(params).promise().toFuture
    @inline def putBucketLoggingFuture(params: PutBucketLoggingRequest): Future[js.Object] =
      service.putBucketLogging(params).promise().toFuture
    @inline def putBucketMetricsConfigurationFuture(params: PutBucketMetricsConfigurationRequest): Future[js.Object] =
      service.putBucketMetricsConfiguration(params).promise().toFuture
    @inline def putBucketNotificationConfigurationFuture(
        params: PutBucketNotificationConfigurationRequest
    ): Future[js.Object] = service.putBucketNotificationConfiguration(params).promise().toFuture
    @inline def putBucketPolicyFuture(params: PutBucketPolicyRequest): Future[js.Object] =
      service.putBucketPolicy(params).promise().toFuture
    @inline def putBucketReplicationFuture(params: PutBucketReplicationRequest): Future[js.Object] =
      service.putBucketReplication(params).promise().toFuture
    @inline def putBucketRequestPaymentFuture(params: PutBucketRequestPaymentRequest): Future[js.Object] =
      service.putBucketRequestPayment(params).promise().toFuture
    @inline def putBucketTaggingFuture(params: PutBucketTaggingRequest): Future[js.Object] =
      service.putBucketTagging(params).promise().toFuture
    @inline def putBucketVersioningFuture(params: PutBucketVersioningRequest): Future[js.Object] =
      service.putBucketVersioning(params).promise().toFuture
    @inline def putBucketWebsiteFuture(params: PutBucketWebsiteRequest): Future[js.Object] =
      service.putBucketWebsite(params).promise().toFuture
    @inline def putObjectAclFuture(params: PutObjectAclRequest): Future[PutObjectAclOutput] =
      service.putObjectAcl(params).promise().toFuture
    @inline def putObjectFuture(params: PutObjectRequest): Future[PutObjectOutput] =
      service.putObject(params).promise().toFuture
    @inline def putObjectLegalHoldFuture(params: PutObjectLegalHoldRequest): Future[PutObjectLegalHoldOutput] =
      service.putObjectLegalHold(params).promise().toFuture
    @inline def putObjectLockConfigurationFuture(
        params: PutObjectLockConfigurationRequest
    ): Future[PutObjectLockConfigurationOutput] = service.putObjectLockConfiguration(params).promise().toFuture
    @inline def putObjectRetentionFuture(params: PutObjectRetentionRequest): Future[PutObjectRetentionOutput] =
      service.putObjectRetention(params).promise().toFuture
    @inline def putObjectTaggingFuture(params: PutObjectTaggingRequest): Future[PutObjectTaggingOutput] =
      service.putObjectTagging(params).promise().toFuture
    @inline def putPublicAccessBlockFuture(params: PutPublicAccessBlockRequest): Future[js.Object] =
      service.putPublicAccessBlock(params).promise().toFuture
    @inline def restoreObjectFuture(params: RestoreObjectRequest): Future[RestoreObjectOutput] =
      service.restoreObject(params).promise().toFuture
    @inline def selectObjectContentFuture(params: SelectObjectContentRequest): Future[SelectObjectContentOutput] =
      service.selectObjectContent(params).promise().toFuture
    @inline def uploadPartCopyFuture(params: UploadPartCopyRequest): Future[UploadPartCopyOutput] =
      service.uploadPartCopy(params).promise().toFuture
    @inline def uploadPartFuture(params: UploadPartRequest): Future[UploadPartOutput] =
      service.uploadPart(params).promise().toFuture

    /**
      * Get a pre-signed URL for a given operation name.
      *
      * @see http://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/S3.html#getSignedUrl-property
      * @param operation the name of the operation to call. E.g. `getObject`
      * @param params    Parameters to pass to the operation. See the given operation for the expected operation parameters. In addition, you can also pass the "Expires" parameter to inform S3 how long the URL should work for.
      * @param expires   The number of seconds to expire the pre-signed URL operation in. Defaults to 900 seconds (15 minutes).
      * @return Future of the signed URL
      */
    def getSignedUrlFuture(operation: Operation, params: js.Object, expires: Int = 900): Future[String] = {
      val paramsWithExpires = if (params.hasOwnProperty("Expires") || expires == 900) {
        params
      } else {
        val deepCloned = js.JSON.parse(js.JSON.stringify(params))
        deepCloned.Expires = expires
        deepCloned.asInstanceOf[js.Object]
      }
      service
        .asInstanceOf[js.Dynamic]
        .getSignedUrlPromise(operation, paramsWithExpires)
        .asInstanceOf[js.Promise[String]]
        .toFuture
    }
  }
  @js.native
  sealed trait Operation extends js.Any
  object Operation extends js.Object {
    val abortMultipartUpload               = "abortMultipartUpload".asInstanceOf[Operation]
    val completeMultipartUpload            = "completeMultipartUpload".asInstanceOf[Operation]
    val copyObject                         = "copyObject".asInstanceOf[Operation]
    val createBucket                       = "createBucket".asInstanceOf[Operation]
    val createMultipartUpload              = "createMultipartUpload".asInstanceOf[Operation]
    val deleteBucketAnalyticsConfiguration = "deleteBucketAnalyticsConfiguration".asInstanceOf[Operation]
    val deleteBucketCors                   = "deleteBucketCors".asInstanceOf[Operation]
    val deleteBucketEncryption             = "deleteBucketEncryption".asInstanceOf[Operation]
    val deleteBucket                       = "deleteBucket".asInstanceOf[Operation]
    val deleteBucketInventoryConfiguration = "deleteBucketInventoryConfiguration".asInstanceOf[Operation]
    val deleteBucketLifecycle              = "deleteBucketLifecycle".asInstanceOf[Operation]
    val deleteBucketMetricsConfiguration   = "deleteBucketMetricsConfiguration".asInstanceOf[Operation]
    val deleteBucketPolicy                 = "deleteBucketPolicy".asInstanceOf[Operation]
    val deleteBucketReplication            = "deleteBucketReplication".asInstanceOf[Operation]
    val deleteBucketTagging                = "deleteBucketTagging".asInstanceOf[Operation]
    val deleteBucketWebsite                = "deleteBucketWebsite".asInstanceOf[Operation]
    val deleteObject                       = "deleteObject".asInstanceOf[Operation]
    val deleteObjectTagging                = "deleteObjectTagging".asInstanceOf[Operation]
    val deleteObjects                      = "deleteObjects".asInstanceOf[Operation]
    val deletePublicAccessBlock            = "deletePublicAccessBlock".asInstanceOf[Operation]
    val getBucketAccelerateConfiguration   = "getBucketAccelerateConfiguration".asInstanceOf[Operation]
    val getBucketAcl                       = "getBucketAcl".asInstanceOf[Operation]
    val getBucketAnalyticsConfiguration    = "getBucketAnalyticsConfiguration".asInstanceOf[Operation]
    val getBucketCors                      = "getBucketCors".asInstanceOf[Operation]
    val getBucketEncryption                = "getBucketEncryption".asInstanceOf[Operation]
    val getBucketInventoryConfiguration    = "getBucketInventoryConfiguration".asInstanceOf[Operation]
    val getBucketLifecycleConfiguration    = "getBucketLifecycleConfiguration".asInstanceOf[Operation]
    val getBucketLocation                  = "getBucketLocation".asInstanceOf[Operation]
    val getBucketLogging                   = "getBucketLogging".asInstanceOf[Operation]
    val getBucketMetricsConfiguration      = "getBucketMetricsConfiguration".asInstanceOf[Operation]
    val getBucketNotificationConfiguration = "getBucketNotificationConfiguration".asInstanceOf[Operation]
    val getBucketPolicy                    = "getBucketPolicy".asInstanceOf[Operation]
    val getBucketPolicyStatus              = "getBucketPolicyStatus".asInstanceOf[Operation]
    val getBucketReplication               = "getBucketReplication".asInstanceOf[Operation]
    val getBucketRequestPayment            = "getBucketRequestPayment".asInstanceOf[Operation]
    val getBucketTagging                   = "getBucketTagging".asInstanceOf[Operation]
    val getBucketVersioning                = "getBucketVersioning".asInstanceOf[Operation]
    val getBucketWebsite                   = "getBucketWebsite".asInstanceOf[Operation]
    val getObjectAcl                       = "getObjectAcl".asInstanceOf[Operation]
    val getObject                          = "getObject".asInstanceOf[Operation]
    val getObjectLegalHold                 = "getObjectLegalHold".asInstanceOf[Operation]
    val getObjectLockConfiguration         = "getObjectLockConfiguration".asInstanceOf[Operation]
    val getObjectRetention                 = "getObjectRetention".asInstanceOf[Operation]
    val getObjectTagging                   = "getObjectTagging".asInstanceOf[Operation]
    val getObjectTorrent                   = "getObjectTorrent".asInstanceOf[Operation]
    val getPublicAccessBlock               = "getPublicAccessBlock".asInstanceOf[Operation]
    val headBucket                         = "headBucket".asInstanceOf[Operation]
    val headObject                         = "headObject".asInstanceOf[Operation]
    val listBucketAnalyticsConfigurations  = "listBucketAnalyticsConfigurations".asInstanceOf[Operation]
    val listBucketInventoryConfigurations  = "listBucketInventoryConfigurations".asInstanceOf[Operation]
    val listBucketMetricsConfigurations    = "listBucketMetricsConfigurations".asInstanceOf[Operation]
    val listBuckets                        = "listBuckets".asInstanceOf[Operation]
    val listMultipartUploads               = "listMultipartUploads".asInstanceOf[Operation]
    val listObjectVersions                 = "listObjectVersions".asInstanceOf[Operation]
    val listObjects                        = "listObjects".asInstanceOf[Operation]
    val listObjectsV2                      = "listObjectsV2".asInstanceOf[Operation]
    val listParts                          = "listParts".asInstanceOf[Operation]
    val putBucketAccelerateConfiguration   = "putBucketAccelerateConfiguration".asInstanceOf[Operation]
    val putBucketAcl                       = "putBucketAcl".asInstanceOf[Operation]
    val putBucketAnalyticsConfiguration    = "putBucketAnalyticsConfiguration".asInstanceOf[Operation]
    val putBucketCors                      = "putBucketCors".asInstanceOf[Operation]
    val putBucketEncryption                = "putBucketEncryption".asInstanceOf[Operation]
    val putBucketInventoryConfiguration    = "putBucketInventoryConfiguration".asInstanceOf[Operation]
    val putBucketLifecycleConfiguration    = "putBucketLifecycleConfiguration".asInstanceOf[Operation]
    val putBucketLogging                   = "putBucketLogging".asInstanceOf[Operation]
    val putBucketMetricsConfiguration      = "putBucketMetricsConfiguration".asInstanceOf[Operation]
    val putBucketNotificationConfiguration = "putBucketNotificationConfiguration".asInstanceOf[Operation]
    val putBucketPolicy                    = "putBucketPolicy".asInstanceOf[Operation]
    val putBucketReplication               = "putBucketReplication".asInstanceOf[Operation]
    val putBucketRequestPayment            = "putBucketRequestPayment".asInstanceOf[Operation]
    val putBucketTagging                   = "putBucketTagging".asInstanceOf[Operation]
    val putBucketVersioning                = "putBucketVersioning".asInstanceOf[Operation]
    val putBucketWebsite                   = "putBucketWebsite".asInstanceOf[Operation]
    val putObjectAcl                       = "putObjectAcl".asInstanceOf[Operation]
    val putObject                          = "putObject".asInstanceOf[Operation]
    val putObjectLegalHold                 = "putObjectLegalHold".asInstanceOf[Operation]
    val putObjectLockConfiguration         = "putObjectLockConfiguration".asInstanceOf[Operation]
    val putObjectRetention                 = "putObjectRetention".asInstanceOf[Operation]
    val putObjectTagging                   = "putObjectTagging".asInstanceOf[Operation]
    val putPublicAccessBlock               = "putPublicAccessBlock".asInstanceOf[Operation]
    val restoreObject                      = "restoreObject".asInstanceOf[Operation]
    val selectObjectContent                = "selectObjectContent".asInstanceOf[Operation]
    val uploadPartCopy                     = "uploadPartCopy".asInstanceOf[Operation]
    val uploadPart                         = "uploadPart".asInstanceOf[Operation]
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
    * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of the upload. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config| Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait AbortIncompleteMultipartUpload extends js.Object {
    var DaysAfterInitiation: js.UndefOr[DaysAfterInitiation]
  }

  @js.native
  @Factory
  trait AbortMultipartUploadOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  @js.native
  @Factory
  trait AbortMultipartUploadRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var UploadId: MultipartUploadId
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  /**
    * Configures the transfer acceleration state for an Amazon S3 bucket. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html|Amazon S3 Transfer Acceleration]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait AccelerateConfiguration extends js.Object {
    var Status: js.UndefOr[BucketAccelerateStatus]
  }

  /**
    * Contains the elements that set the ACL permissions for an object per grantee.
    */
  @js.native
  @Factory
  trait AccessControlPolicy extends js.Object {
    var Grants: js.UndefOr[Grants]
    var Owner: js.UndefOr[Owner]
  }

  /**
    * A container for information about access control for replicas.
    */
  @js.native
  @Factory
  trait AccessControlTranslation extends js.Object {
    var Owner: OwnerOverride
  }

  /**
    * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates in any combination, and an object must match all of the predicates for the filter to apply.
    */
  @js.native
  @Factory
  trait AnalyticsAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[TagSet]
  }

  /**
    * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
    */
  @js.native
  @Factory
  trait AnalyticsConfiguration extends js.Object {
    var Id: AnalyticsId
    var StorageClassAnalysis: StorageClassAnalysis
    var Filter: js.UndefOr[AnalyticsFilter]
  }

  /**
    * Where to publish the analytics results.
    */
  @js.native
  @Factory
  trait AnalyticsExportDestination extends js.Object {
    var S3BucketDestination: AnalyticsS3BucketDestination
  }

  /**
    * The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.
    */
  @js.native
  @Factory
  trait AnalyticsFilter extends js.Object {
    var And: js.UndefOr[AnalyticsAndOperator]
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[Tag]
  }

  /**
    * Contains information about where to publish the analytics results.
    */
  @js.native
  @Factory
  trait AnalyticsS3BucketDestination extends js.Object {
    var Bucket: BucketName
    var Format: AnalyticsS3ExportFileFormat
    var BucketAccountId: js.UndefOr[AccountId]
    var Prefix: js.UndefOr[Prefix]
  }

  @js.native
  sealed trait AnalyticsS3ExportFileFormat extends js.Any
  object AnalyticsS3ExportFileFormat extends js.Object {
    val CSV = "CSV".asInstanceOf[AnalyticsS3ExportFileFormat]

    val values = js.Object.freeze(js.Array(CSV))
  }

  /**
    * In terms of implementation, a Bucket is a resource. An Amazon S3 bucket name is globally unique, and the namespace is shared by all AWS accounts.
    */
  @js.native
  @Factory
  trait Bucket extends js.Object {
    var CreationDate: js.UndefOr[CreationDate]
    var Name: js.UndefOr[BucketName]
  }

  @js.native
  sealed trait BucketAccelerateStatus extends js.Any
  object BucketAccelerateStatus extends js.Object {
    val Enabled   = "Enabled".asInstanceOf[BucketAccelerateStatus]
    val Suspended = "Suspended".asInstanceOf[BucketAccelerateStatus]

    val values = js.Object.freeze(js.Array(Enabled, Suspended))
  }

  @js.native
  sealed trait BucketCannedACL extends js.Any
  object BucketCannedACL extends js.Object {
    val `private`            = "private".asInstanceOf[BucketCannedACL]
    val `public-read`        = "public-read".asInstanceOf[BucketCannedACL]
    val `public-read-write`  = "public-read-write".asInstanceOf[BucketCannedACL]
    val `authenticated-read` = "authenticated-read".asInstanceOf[BucketCannedACL]

    val values = js.Object.freeze(js.Array(`private`, `public-read`, `public-read-write`, `authenticated-read`))
  }

  /**
    * Specifies the lifecycle configuration for objects in an Amazon S3 bucket. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html|Object Lifecycle Management]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait BucketLifecycleConfiguration extends js.Object {
    var Rules: LifecycleRules
  }

  @js.native
  sealed trait BucketLocationConstraint extends js.Any
  object BucketLocationConstraint extends js.Object {
    val EU               = "EU".asInstanceOf[BucketLocationConstraint]
    val `eu-west-1`      = "eu-west-1".asInstanceOf[BucketLocationConstraint]
    val `us-west-1`      = "us-west-1".asInstanceOf[BucketLocationConstraint]
    val `us-west-2`      = "us-west-2".asInstanceOf[BucketLocationConstraint]
    val `ap-south-1`     = "ap-south-1".asInstanceOf[BucketLocationConstraint]
    val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[BucketLocationConstraint]
    val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[BucketLocationConstraint]
    val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[BucketLocationConstraint]
    val `sa-east-1`      = "sa-east-1".asInstanceOf[BucketLocationConstraint]
    val `cn-north-1`     = "cn-north-1".asInstanceOf[BucketLocationConstraint]
    val `eu-central-1`   = "eu-central-1".asInstanceOf[BucketLocationConstraint]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * Container for logging status information.
    */
  @js.native
  @Factory
  trait BucketLoggingStatus extends js.Object {
    var LoggingEnabled: js.UndefOr[LoggingEnabled]
  }

  @js.native
  sealed trait BucketLogsPermission extends js.Any
  object BucketLogsPermission extends js.Object {
    val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[BucketLogsPermission]
    val READ         = "READ".asInstanceOf[BucketLogsPermission]
    val WRITE        = "WRITE".asInstanceOf[BucketLogsPermission]

    val values = js.Object.freeze(js.Array(FULL_CONTROL, READ, WRITE))
  }

  @js.native
  sealed trait BucketVersioningStatus extends js.Any
  object BucketVersioningStatus extends js.Object {
    val Enabled   = "Enabled".asInstanceOf[BucketVersioningStatus]
    val Suspended = "Suspended".asInstanceOf[BucketVersioningStatus]

    val values = js.Object.freeze(js.Array(Enabled, Suspended))
  }

  /**
    * Describes the cross-origin access configuration for objects in an Amazon S3 bucket. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html|Enabling Cross-Origin Resource Sharing]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait CORSConfiguration extends js.Object {
    var CORSRules: CORSRules
  }

  /**
    * Specifies a cross-origin access rule for an Amazon S3 bucket.
    */
  @js.native
  @Factory
  trait CORSRule extends js.Object {
    var AllowedMethods: AllowedMethods
    var AllowedOrigins: AllowedOrigins
    var AllowedHeaders: js.UndefOr[AllowedHeaders]
    var ExposeHeaders: js.UndefOr[ExposeHeaders]
    var MaxAgeSeconds: js.UndefOr[MaxAgeSeconds]
  }

  /**
    * Describes how an uncompressed comma-separated values (CSV)-formatted input object is formatted.
    */
  @js.native
  @Factory
  trait CSVInput extends js.Object {
    var AllowQuotedRecordDelimiter: js.UndefOr[AllowQuotedRecordDelimiter]
    var Comments: js.UndefOr[Comments]
    var FieldDelimiter: js.UndefOr[FieldDelimiter]
    var FileHeaderInfo: js.UndefOr[FileHeaderInfo]
    var QuoteCharacter: js.UndefOr[QuoteCharacter]
    var QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter]
    var RecordDelimiter: js.UndefOr[RecordDelimiter]
  }

  /**
    * Describes how uncompressed comma-separated values (CSV)-formatted results are formatted.
    */
  @js.native
  @Factory
  trait CSVOutput extends js.Object {
    var FieldDelimiter: js.UndefOr[FieldDelimiter]
    var QuoteCharacter: js.UndefOr[QuoteCharacter]
    var QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter]
    var QuoteFields: js.UndefOr[QuoteFields]
    var RecordDelimiter: js.UndefOr[RecordDelimiter]
  }

  /**
    * Container for specifying the AWS Lambda notification configuration.
    */
  @js.native
  @Factory
  trait CloudFunctionConfiguration extends js.Object {
    var CloudFunction: js.UndefOr[CloudFunction]
    var Event: js.UndefOr[Event]
    var Events: js.UndefOr[EventList]
    var Id: js.UndefOr[NotificationId]
    var InvocationRole: js.UndefOr[CloudFunctionInvocationRole]
  }

  /**
    * Container for all (if there are any) keys between Prefix and the next occurrence of the string specified by a delimiter. CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix. For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common prefix is notes/summer/.
    */
  @js.native
  @Factory
  trait CommonPrefix extends js.Object {
    var Prefix: js.UndefOr[Prefix]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CompleteMultipartUploadRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var UploadId: MultipartUploadId
    var MultipartUpload: js.UndefOr[CompletedMultipartUpload]
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  /**
    * The container for the completed multipart upload details.
    */
  @js.native
  @Factory
  trait CompletedMultipartUpload extends js.Object {
    var Parts: js.UndefOr[CompletedPartList]
  }

  /**
    * Details of the parts that were uploaded.
    */
  @js.native
  @Factory
  trait CompletedPart extends js.Object {
    var ETag: js.UndefOr[ETag]
    var PartNumber: js.UndefOr[PartNumber]
  }

  @js.native
  sealed trait CompressionType extends js.Any
  object CompressionType extends js.Object {
    val NONE  = "NONE".asInstanceOf[CompressionType]
    val GZIP  = "GZIP".asInstanceOf[CompressionType]
    val BZIP2 = "BZIP2".asInstanceOf[CompressionType]

    val values = js.Object.freeze(js.Array(NONE, GZIP, BZIP2))
  }

  /**
    * A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If request is for pages in the <code>/docs</code> folder, redirect to the <code>/documents</code> folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.
    */
  @js.native
  @Factory
  trait Condition extends js.Object {
    var HttpErrorCodeReturnedEquals: js.UndefOr[HttpErrorCodeReturnedEquals]
    var KeyPrefixEquals: js.UndefOr[KeyPrefixEquals]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ContinuationEvent extends js.Object {}

  @js.native
  @Factory
  trait CopyObjectOutput extends js.Object {
    var CopyObjectResult: js.UndefOr[CopyObjectResult]
    var CopySourceVersionId: js.UndefOr[CopySourceVersionId]
    var Expiration: js.UndefOr[Expiration]
    var RequestCharged: js.UndefOr[RequestCharged]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSEncryptionContext: js.UndefOr[SSEKMSEncryptionContext]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
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
    var SSEKMSEncryptionContext: js.UndefOr[SSEKMSEncryptionContext]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var StorageClass: js.UndefOr[StorageClass]
    var Tagging: js.UndefOr[TaggingHeader]
    var TaggingDirective: js.UndefOr[TaggingDirective]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
  }

  /**
    * Container for all response elements.
    */
  @js.native
  @Factory
  trait CopyObjectResult extends js.Object {
    var ETag: js.UndefOr[ETag]
    var LastModified: js.UndefOr[LastModified]
  }

  /**
    * Container for all response elements.
    */
  @js.native
  @Factory
  trait CopyPartResult extends js.Object {
    var ETag: js.UndefOr[ETag]
    var LastModified: js.UndefOr[LastModified]
  }

  /**
    * The configuration information for the bucket.
    */
  @js.native
  @Factory
  trait CreateBucketConfiguration extends js.Object {
    var LocationConstraint: js.UndefOr[BucketLocationConstraint]
  }

  @js.native
  @Factory
  trait CreateBucketOutput extends js.Object {
    var Location: js.UndefOr[Location]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateMultipartUploadOutput extends js.Object {
    var AbortDate: js.UndefOr[AbortDate]
    var AbortRuleId: js.UndefOr[AbortRuleId]
    var Bucket: js.UndefOr[BucketName]
    var Key: js.UndefOr[ObjectKey]
    var RequestCharged: js.UndefOr[RequestCharged]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSEncryptionContext: js.UndefOr[SSEKMSEncryptionContext]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var UploadId: js.UndefOr[MultipartUploadId]
  }

  @js.native
  @Factory
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
    var SSEKMSEncryptionContext: js.UndefOr[SSEKMSEncryptionContext]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var StorageClass: js.UndefOr[StorageClass]
    var Tagging: js.UndefOr[TaggingHeader]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
  }

  /**
    * The container element for specifying the default Object Lock retention settings for new objects placed in the specified bucket.
    */
  @js.native
  @Factory
  trait DefaultRetention extends js.Object {
    var Days: js.UndefOr[Days]
    var Mode: js.UndefOr[ObjectLockRetentionMode]
    var Years: js.UndefOr[Years]
  }

  /**
    * Container for the objects to delete.
    */
  @js.native
  @Factory
  trait Delete extends js.Object {
    var Objects: ObjectIdentifierList
    var Quiet: js.UndefOr[Quiet]
  }

  @js.native
  @Factory
  trait DeleteBucketAnalyticsConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: AnalyticsId
  }

  @js.native
  @Factory
  trait DeleteBucketCorsRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait DeleteBucketEncryptionRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait DeleteBucketInventoryConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: InventoryId
  }

  @js.native
  @Factory
  trait DeleteBucketLifecycleRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait DeleteBucketMetricsConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: MetricsId
  }

  @js.native
  @Factory
  trait DeleteBucketPolicyRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait DeleteBucketReplicationRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait DeleteBucketRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait DeleteBucketTaggingRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait DeleteBucketWebsiteRequest extends js.Object {
    var Bucket: BucketName
  }

  /**
    * Information about the delete marker.
    */
  @js.native
  @Factory
  trait DeleteMarkerEntry extends js.Object {
    var IsLatest: js.UndefOr[IsLatest]
    var Key: js.UndefOr[ObjectKey]
    var LastModified: js.UndefOr[LastModified]
    var Owner: js.UndefOr[Owner]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  /**
    * Specifies whether Amazon S3 replicates the delete markers. If you specify a <code>Filter</code>, you must specify this element. However, in the latest version of replication configuration (when <code>Filter</code> is specified), Amazon S3 doesn't replicate delete markers. Therefore, the <code>DeleteMarkerReplication</code> element can contain only &lt;Status&gt;Disabled&lt;/Status&gt;. For an example configuration, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config|Basic Rule Configuration]].
    *
    * '''Note:'''If you don't specify the <code>Filter</code> element, Amazon S3 assumes that the replication configuration is the earlier version, V1. In the earlier version, Amazon S3 handled replication of delete markers differently. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations|Backward Compatibility]].
    */
  @js.native
  @Factory
  trait DeleteMarkerReplication extends js.Object {
    var Status: js.UndefOr[DeleteMarkerReplicationStatus]
  }

  @js.native
  sealed trait DeleteMarkerReplicationStatus extends js.Any
  object DeleteMarkerReplicationStatus extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[DeleteMarkerReplicationStatus]
    val Disabled = "Disabled".asInstanceOf[DeleteMarkerReplicationStatus]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  @js.native
  @Factory
  trait DeleteObjectOutput extends js.Object {
    var DeleteMarker: js.UndefOr[DeleteMarker]
    var RequestCharged: js.UndefOr[RequestCharged]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait DeleteObjectRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention]
    var MFA: js.UndefOr[MFA]
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait DeleteObjectTaggingOutput extends js.Object {
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait DeleteObjectTaggingRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait DeleteObjectsOutput extends js.Object {
    var Deleted: js.UndefOr[DeletedObjects]
    var Errors: js.UndefOr[Errors]
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  @js.native
  @Factory
  trait DeleteObjectsRequest extends js.Object {
    var Bucket: BucketName
    var Delete: Delete
    var BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention]
    var MFA: js.UndefOr[MFA]
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  @js.native
  @Factory
  trait DeletePublicAccessBlockRequest extends js.Object {
    var Bucket: BucketName
  }

  /**
    * Information about the deleted object.
    */
  @js.native
  @Factory
  trait DeletedObject extends js.Object {
    var DeleteMarker: js.UndefOr[DeleteMarker]
    var DeleteMarkerVersionId: js.UndefOr[DeleteMarkerVersionId]
    var Key: js.UndefOr[ObjectKey]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  /**
    * Specifies information about where to publish analysis or configuration results for an Amazon S3 bucket and S3 Replication Time Control (S3 RTC).
    */
  @js.native
  @Factory
  trait Destination extends js.Object {
    var Bucket: BucketName
    var AccessControlTranslation: js.UndefOr[AccessControlTranslation]
    var Account: js.UndefOr[AccountId]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var Metrics: js.UndefOr[Metrics]
    var ReplicationTime: js.UndefOr[ReplicationTime]
    var StorageClass: js.UndefOr[StorageClass]
  }

  /**
    * Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.
    */
  @js.native
  sealed trait EncodingType extends js.Any
  object EncodingType extends js.Object {
    val url = "url".asInstanceOf[EncodingType]

    val values = js.Object.freeze(js.Array(url))
  }

  /**
    * Contains the type of server-side encryption used.
    */
  @js.native
  @Factory
  trait Encryption extends js.Object {
    var EncryptionType: ServerSideEncryption
    var KMSContext: js.UndefOr[KMSContext]
    var KMSKeyId: js.UndefOr[SSEKMSKeyId]
  }

  /**
    * Specifies encryption-related information for an Amazon S3 bucket that is a destination for replicated objects.
    */
  @js.native
  @Factory
  trait EncryptionConfiguration extends js.Object {
    var ReplicaKmsKeyID: js.UndefOr[ReplicaKmsKeyID]
  }

  /**
    * A message that indicates the request is complete and no more messages will be sent. You should not assume that the request is complete until the client receives an <code>EndEvent</code>.
    */
  @js.native
  @Factory
  trait EndEvent extends js.Object {}

  /**
    * Container for all error elements.
    */
  @js.native
  @Factory
  trait Error extends js.Object {
    var Code: js.UndefOr[Code]
    var Key: js.UndefOr[ObjectKey]
    var Message: js.UndefOr[Message]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  /**
    * The error information.
    */
  @js.native
  @Factory
  trait ErrorDocument extends js.Object {
    var Key: ObjectKey
  }

  /**
    * The bucket event for which to send notifications.
    */
  @js.native
  sealed trait Event extends js.Any
  object Event extends js.Object {
    val `s3:ReducedRedundancyLostObject`            = "s3:ReducedRedundancyLostObject".asInstanceOf[Event]
    val `s3:ObjectCreated:*`                        = "s3:ObjectCreated:*".asInstanceOf[Event]
    val `s3:ObjectCreated:Put`                      = "s3:ObjectCreated:Put".asInstanceOf[Event]
    val `s3:ObjectCreated:Post`                     = "s3:ObjectCreated:Post".asInstanceOf[Event]
    val `s3:ObjectCreated:Copy`                     = "s3:ObjectCreated:Copy".asInstanceOf[Event]
    val `s3:ObjectCreated:CompleteMultipartUpload`  = "s3:ObjectCreated:CompleteMultipartUpload".asInstanceOf[Event]
    val `s3:ObjectRemoved:*`                        = "s3:ObjectRemoved:*".asInstanceOf[Event]
    val `s3:ObjectRemoved:Delete`                   = "s3:ObjectRemoved:Delete".asInstanceOf[Event]
    val `s3:ObjectRemoved:DeleteMarkerCreated`      = "s3:ObjectRemoved:DeleteMarkerCreated".asInstanceOf[Event]
    val `s3:ObjectRestore:*`                        = "s3:ObjectRestore:*".asInstanceOf[Event]
    val `s3:ObjectRestore:Post`                     = "s3:ObjectRestore:Post".asInstanceOf[Event]
    val `s3:ObjectRestore:Completed`                = "s3:ObjectRestore:Completed".asInstanceOf[Event]
    val `s3:Replication:*`                          = "s3:Replication:*".asInstanceOf[Event]
    val `s3:Replication:OperationFailedReplication` = "s3:Replication:OperationFailedReplication".asInstanceOf[Event]
    val `s3:Replication:OperationNotTracked`        = "s3:Replication:OperationNotTracked".asInstanceOf[Event]
    val `s3:Replication:OperationMissedThreshold`   = "s3:Replication:OperationMissedThreshold".asInstanceOf[Event]
    val `s3:Replication:OperationReplicatedAfterThreshold` =
      "s3:Replication:OperationReplicatedAfterThreshold".asInstanceOf[Event]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * Optional configuration to replicate existing source bucket objects. For more information, see [[ https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-what-is-isnot-replicated.html#existing-object-replication|Replicating Existing Objects]] in the <i>Amazon S3 Developer Guide</i>.
    */
  @js.native
  @Factory
  trait ExistingObjectReplication extends js.Object {
    var Status: ExistingObjectReplicationStatus
  }

  @js.native
  sealed trait ExistingObjectReplicationStatus extends js.Any
  object ExistingObjectReplicationStatus extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[ExistingObjectReplicationStatus]
    val Disabled = "Disabled".asInstanceOf[ExistingObjectReplicationStatus]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  @js.native
  sealed trait ExpirationStatus extends js.Any
  object ExpirationStatus extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[ExpirationStatus]
    val Disabled = "Disabled".asInstanceOf[ExpirationStatus]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  @js.native
  sealed trait ExpressionType extends js.Any
  object ExpressionType extends js.Object {
    val SQL = "SQL".asInstanceOf[ExpressionType]

    val values = js.Object.freeze(js.Array(SQL))
  }

  @js.native
  sealed trait FileHeaderInfo extends js.Any
  object FileHeaderInfo extends js.Object {
    val USE    = "USE".asInstanceOf[FileHeaderInfo]
    val IGNORE = "IGNORE".asInstanceOf[FileHeaderInfo]
    val NONE   = "NONE".asInstanceOf[FileHeaderInfo]

    val values = js.Object.freeze(js.Array(USE, IGNORE, NONE))
  }

  /**
    * Specifies the Amazon S3 object key name to filter on and whether to filter on the suffix or prefix of the key name.
    */
  @js.native
  @Factory
  trait FilterRule extends js.Object {
    var Name: js.UndefOr[FilterRuleName]
    var Value: js.UndefOr[FilterRuleValue]
  }

  @js.native
  sealed trait FilterRuleName extends js.Any
  object FilterRuleName extends js.Object {
    val prefix = "prefix".asInstanceOf[FilterRuleName]
    val suffix = "suffix".asInstanceOf[FilterRuleName]

    val values = js.Object.freeze(js.Array(prefix, suffix))
  }

  @js.native
  @Factory
  trait GetBucketAccelerateConfigurationOutput extends js.Object {
    var Status: js.UndefOr[BucketAccelerateStatus]
  }

  @js.native
  @Factory
  trait GetBucketAccelerateConfigurationRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketAclOutput extends js.Object {
    var Grants: js.UndefOr[Grants]
    var Owner: js.UndefOr[Owner]
  }

  @js.native
  @Factory
  trait GetBucketAclRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketAnalyticsConfigurationOutput extends js.Object {
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfiguration]
  }

  @js.native
  @Factory
  trait GetBucketAnalyticsConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: AnalyticsId
  }

  @js.native
  @Factory
  trait GetBucketCorsOutput extends js.Object {
    var CORSRules: js.UndefOr[CORSRules]
  }

  @js.native
  @Factory
  trait GetBucketCorsRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketEncryptionOutput extends js.Object {
    var ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
  }

  @js.native
  @Factory
  trait GetBucketEncryptionRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketInventoryConfigurationOutput extends js.Object {
    var InventoryConfiguration: js.UndefOr[InventoryConfiguration]
  }

  @js.native
  @Factory
  trait GetBucketInventoryConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: InventoryId
  }

  @js.native
  @Factory
  trait GetBucketLifecycleConfigurationOutput extends js.Object {
    var Rules: js.UndefOr[LifecycleRules]
  }

  @js.native
  @Factory
  trait GetBucketLifecycleConfigurationRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketLifecycleOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  @js.native
  @Factory
  trait GetBucketLifecycleRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketLocationOutput extends js.Object {
    var LocationConstraint: js.UndefOr[BucketLocationConstraint]
  }

  @js.native
  @Factory
  trait GetBucketLocationRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketLoggingOutput extends js.Object {
    var LoggingEnabled: js.UndefOr[LoggingEnabled]
  }

  @js.native
  @Factory
  trait GetBucketLoggingRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketMetricsConfigurationOutput extends js.Object {
    var MetricsConfiguration: js.UndefOr[MetricsConfiguration]
  }

  @js.native
  @Factory
  trait GetBucketMetricsConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: MetricsId
  }

  @js.native
  @Factory
  trait GetBucketNotificationConfigurationRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketPolicyOutput extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  @js.native
  @Factory
  trait GetBucketPolicyRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketPolicyStatusOutput extends js.Object {
    var PolicyStatus: js.UndefOr[PolicyStatus]
  }

  @js.native
  @Factory
  trait GetBucketPolicyStatusRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketReplicationOutput extends js.Object {
    var ReplicationConfiguration: js.UndefOr[ReplicationConfiguration]
  }

  @js.native
  @Factory
  trait GetBucketReplicationRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketRequestPaymentOutput extends js.Object {
    var Payer: js.UndefOr[Payer]
  }

  @js.native
  @Factory
  trait GetBucketRequestPaymentRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketTaggingOutput extends js.Object {
    var TagSet: TagSet
  }

  @js.native
  @Factory
  trait GetBucketTaggingRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketVersioningOutput extends js.Object {
    var MFADelete: js.UndefOr[MFADeleteStatus]
    var Status: js.UndefOr[BucketVersioningStatus]
  }

  @js.native
  @Factory
  trait GetBucketVersioningRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetBucketWebsiteOutput extends js.Object {
    var ErrorDocument: js.UndefOr[ErrorDocument]
    var IndexDocument: js.UndefOr[IndexDocument]
    var RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo]
    var RoutingRules: js.UndefOr[RoutingRules]
  }

  @js.native
  @Factory
  trait GetBucketWebsiteRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
  trait GetObjectAclOutput extends js.Object {
    var Grants: js.UndefOr[Grants]
    var Owner: js.UndefOr[Owner]
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  @js.native
  @Factory
  trait GetObjectAclRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait GetObjectLegalHoldOutput extends js.Object {
    var LegalHold: js.UndefOr[ObjectLockLegalHold]
  }

  @js.native
  @Factory
  trait GetObjectLegalHoldRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait GetObjectLockConfigurationOutput extends js.Object {
    var ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration]
  }

  @js.native
  @Factory
  trait GetObjectLockConfigurationRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetObjectRetentionOutput extends js.Object {
    var Retention: js.UndefOr[ObjectLockRetention]
  }

  @js.native
  @Factory
  trait GetObjectRetentionRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait GetObjectTaggingOutput extends js.Object {
    var TagSet: TagSet
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait GetObjectTaggingRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait GetObjectTorrentOutput extends js.Object {
    var Body: js.UndefOr[Body]
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  @js.native
  @Factory
  trait GetObjectTorrentRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  @js.native
  @Factory
  trait GetPublicAccessBlockOutput extends js.Object {
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration]
  }

  @js.native
  @Factory
  trait GetPublicAccessBlockRequest extends js.Object {
    var Bucket: BucketName
  }

  /**
    * Container for Glacier job parameters.
    */
  @js.native
  @Factory
  trait GlacierJobParameters extends js.Object {
    var Tier: Tier
  }

  /**
    * Container for grant information.
    */
  @js.native
  @Factory
  trait Grant extends js.Object {
    var Grantee: js.UndefOr[Grantee]
    var Permission: js.UndefOr[Permission]
  }

  /**
    * Container for the person being granted permissions.
    */
  @js.native
  @Factory
  trait Grantee extends js.Object {
    var Type: Type
    var DisplayName: js.UndefOr[DisplayName]
    var EmailAddress: js.UndefOr[EmailAddress]
    var ID: js.UndefOr[ID]
    var URI: js.UndefOr[URI]
  }

  @js.native
  @Factory
  trait HeadBucketRequest extends js.Object {
    var Bucket: BucketName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
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

  /**
    * Container for the <code>Suffix</code> element.
    */
  @js.native
  @Factory
  trait IndexDocument extends js.Object {
    var Suffix: Suffix
  }

  /**
    * Container element that identifies who initiated the multipart upload.
    */
  @js.native
  @Factory
  trait Initiator extends js.Object {
    var DisplayName: js.UndefOr[DisplayName]
    var ID: js.UndefOr[ID]
  }

  /**
    * Describes the serialization format of the object.
    */
  @js.native
  @Factory
  trait InputSerialization extends js.Object {
    var CSV: js.UndefOr[CSVInput]
    var CompressionType: js.UndefOr[CompressionType]
    var JSON: js.UndefOr[JSONInput]
    var Parquet: js.UndefOr[ParquetInput]
  }

  /**
    * Specifies the inventory configuration for an Amazon S3 bucket. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html|GET Bucket inventory]] in the <i>Amazon Simple Storage Service API Reference</i>.
    */
  @js.native
  @Factory
  trait InventoryConfiguration extends js.Object {
    var Destination: InventoryDestination
    var Id: InventoryId
    var IncludedObjectVersions: InventoryIncludedObjectVersions
    var IsEnabled: IsEnabled
    var Schedule: InventorySchedule
    var Filter: js.UndefOr[InventoryFilter]
    var OptionalFields: js.UndefOr[InventoryOptionalFields]
  }

  /**
    * Specifies the inventory configuration for an Amazon S3 bucket.
    */
  @js.native
  @Factory
  trait InventoryDestination extends js.Object {
    var S3BucketDestination: InventoryS3BucketDestination
  }

  /**
    * Contains the type of server-side encryption used to encrypt the inventory results.
    */
  @js.native
  @Factory
  trait InventoryEncryption extends js.Object {
    var SSEKMS: js.UndefOr[SSEKMS]
    var SSES3: js.UndefOr[SSES3]
  }

  /**
    * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.
    */
  @js.native
  @Factory
  trait InventoryFilter extends js.Object {
    var Prefix: Prefix
  }

  @js.native
  sealed trait InventoryFormat extends js.Any
  object InventoryFormat extends js.Object {
    val CSV     = "CSV".asInstanceOf[InventoryFormat]
    val ORC     = "ORC".asInstanceOf[InventoryFormat]
    val Parquet = "Parquet".asInstanceOf[InventoryFormat]

    val values = js.Object.freeze(js.Array(CSV, ORC, Parquet))
  }

  @js.native
  sealed trait InventoryFrequency extends js.Any
  object InventoryFrequency extends js.Object {
    val Daily  = "Daily".asInstanceOf[InventoryFrequency]
    val Weekly = "Weekly".asInstanceOf[InventoryFrequency]

    val values = js.Object.freeze(js.Array(Daily, Weekly))
  }

  @js.native
  sealed trait InventoryIncludedObjectVersions extends js.Any
  object InventoryIncludedObjectVersions extends js.Object {
    val All     = "All".asInstanceOf[InventoryIncludedObjectVersions]
    val Current = "Current".asInstanceOf[InventoryIncludedObjectVersions]

    val values = js.Object.freeze(js.Array(All, Current))
  }

  @js.native
  sealed trait InventoryOptionalField extends js.Any
  object InventoryOptionalField extends js.Object {
    val Size                         = "Size".asInstanceOf[InventoryOptionalField]
    val LastModifiedDate             = "LastModifiedDate".asInstanceOf[InventoryOptionalField]
    val StorageClass                 = "StorageClass".asInstanceOf[InventoryOptionalField]
    val ETag                         = "ETag".asInstanceOf[InventoryOptionalField]
    val IsMultipartUploaded          = "IsMultipartUploaded".asInstanceOf[InventoryOptionalField]
    val ReplicationStatus            = "ReplicationStatus".asInstanceOf[InventoryOptionalField]
    val EncryptionStatus             = "EncryptionStatus".asInstanceOf[InventoryOptionalField]
    val ObjectLockRetainUntilDate    = "ObjectLockRetainUntilDate".asInstanceOf[InventoryOptionalField]
    val ObjectLockMode               = "ObjectLockMode".asInstanceOf[InventoryOptionalField]
    val ObjectLockLegalHoldStatus    = "ObjectLockLegalHoldStatus".asInstanceOf[InventoryOptionalField]
    val IntelligentTieringAccessTier = "IntelligentTieringAccessTier".asInstanceOf[InventoryOptionalField]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.
    */
  @js.native
  @Factory
  trait InventoryS3BucketDestination extends js.Object {
    var Bucket: BucketName
    var Format: InventoryFormat
    var AccountId: js.UndefOr[AccountId]
    var Encryption: js.UndefOr[InventoryEncryption]
    var Prefix: js.UndefOr[Prefix]
  }

  /**
    * Specifies the schedule for generating inventory results.
    */
  @js.native
  @Factory
  trait InventorySchedule extends js.Object {
    var Frequency: InventoryFrequency
  }

  /**
    * Specifies JSON as object's input serialization format.
    */
  @js.native
  @Factory
  trait JSONInput extends js.Object {
    var Type: js.UndefOr[JSONType]
  }

  /**
    * Specifies JSON as request's output serialization format.
    */
  @js.native
  @Factory
  trait JSONOutput extends js.Object {
    var RecordDelimiter: js.UndefOr[RecordDelimiter]
  }

  @js.native
  sealed trait JSONType extends js.Any
  object JSONType extends js.Object {
    val DOCUMENT = "DOCUMENT".asInstanceOf[JSONType]
    val LINES    = "LINES".asInstanceOf[JSONType]

    val values = js.Object.freeze(js.Array(DOCUMENT, LINES))
  }

  /**
    * A container for specifying the configuration for AWS Lambda notifications.
    */
  @js.native
  @Factory
  trait LambdaFunctionConfiguration extends js.Object {
    var Events: EventList
    var LambdaFunctionArn: LambdaFunctionArn
    var Filter: js.UndefOr[NotificationConfigurationFilter]
    var Id: js.UndefOr[NotificationId]
  }

  /**
    * Container for lifecycle rules. You can add as many as 1000 rules.
    */
  @js.native
  @Factory
  trait LifecycleConfiguration extends js.Object {
    var Rules: Rules
  }

  /**
    * Container for the expiration for the lifecycle of the object.
    */
  @js.native
  @Factory
  trait LifecycleExpiration extends js.Object {
    var Date: js.UndefOr[Date]
    var Days: js.UndefOr[Days]
    var ExpiredObjectDeleteMarker: js.UndefOr[ExpiredObjectDeleteMarker]
  }

  /**
    * A lifecycle rule for individual objects in an Amazon S3 bucket.
    */
  @js.native
  @Factory
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

  /**
    * This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.
    */
  @js.native
  @Factory
  trait LifecycleRuleAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[TagSet]
  }

  /**
    * The <code>Filter</code> is used to identify objects that a Lifecycle Rule applies to. A <code>Filter</code> must have exactly one of <code>Prefix</code>, <code>Tag</code>, or <code>And</code> specified.
    */
  @js.native
  @Factory
  trait LifecycleRuleFilter extends js.Object {
    var And: js.UndefOr[LifecycleRuleAndOperator]
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[Tag]
  }

  @js.native
  @Factory
  trait ListBucketAnalyticsConfigurationsOutput extends js.Object {
    var AnalyticsConfigurationList: js.UndefOr[AnalyticsConfigurationList]
    var ContinuationToken: js.UndefOr[Token]
    var IsTruncated: js.UndefOr[IsTruncated]
    var NextContinuationToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListBucketAnalyticsConfigurationsRequest extends js.Object {
    var Bucket: BucketName
    var ContinuationToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListBucketInventoryConfigurationsOutput extends js.Object {
    var ContinuationToken: js.UndefOr[Token]
    var InventoryConfigurationList: js.UndefOr[InventoryConfigurationList]
    var IsTruncated: js.UndefOr[IsTruncated]
    var NextContinuationToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListBucketInventoryConfigurationsRequest extends js.Object {
    var Bucket: BucketName
    var ContinuationToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListBucketMetricsConfigurationsOutput extends js.Object {
    var ContinuationToken: js.UndefOr[Token]
    var IsTruncated: js.UndefOr[IsTruncated]
    var MetricsConfigurationList: js.UndefOr[MetricsConfigurationList]
    var NextContinuationToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListBucketMetricsConfigurationsRequest extends js.Object {
    var Bucket: BucketName
    var ContinuationToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListBucketsOutput extends js.Object {
    var Buckets: js.UndefOr[Buckets]
    var Owner: js.UndefOr[Owner]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListMultipartUploadsRequest extends js.Object {
    var Bucket: BucketName
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var KeyMarker: js.UndefOr[KeyMarker]
    var MaxUploads: js.UndefOr[MaxUploads]
    var Prefix: js.UndefOr[Prefix]
    var UploadIdMarker: js.UndefOr[UploadIdMarker]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListObjectVersionsRequest extends js.Object {
    var Bucket: BucketName
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var KeyMarker: js.UndefOr[KeyMarker]
    var MaxKeys: js.UndefOr[MaxKeys]
    var Prefix: js.UndefOr[Prefix]
    var VersionIdMarker: js.UndefOr[VersionIdMarker]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListObjectsRequest extends js.Object {
    var Bucket: BucketName
    var Delimiter: js.UndefOr[Delimiter]
    var EncodingType: js.UndefOr[EncodingType]
    var Marker: js.UndefOr[Marker]
    var MaxKeys: js.UndefOr[MaxKeys]
    var Prefix: js.UndefOr[Prefix]
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
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

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListPartsRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var UploadId: MultipartUploadId
    var MaxParts: js.UndefOr[MaxParts]
    var PartNumberMarker: js.UndefOr[PartNumberMarker]
    var RequestPayer: js.UndefOr[RequestPayer]
  }

  /**
    * Describes where logs are stored and the prefix that Amazon S3 assigns to all log object keys for a bucket. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html|PUT Bucket logging]] in the <i>Amazon Simple Storage Service API Reference</i>.
    */
  @js.native
  @Factory
  trait LoggingEnabled extends js.Object {
    var TargetBucket: TargetBucket
    var TargetPrefix: TargetPrefix
    var TargetGrants: js.UndefOr[TargetGrants]
  }

  @js.native
  sealed trait MFADelete extends js.Any
  object MFADelete extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[MFADelete]
    val Disabled = "Disabled".asInstanceOf[MFADelete]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  @js.native
  sealed trait MFADeleteStatus extends js.Any
  object MFADeleteStatus extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[MFADeleteStatus]
    val Disabled = "Disabled".asInstanceOf[MFADeleteStatus]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  @js.native
  sealed trait MetadataDirective extends js.Any
  object MetadataDirective extends js.Object {
    val COPY    = "COPY".asInstanceOf[MetadataDirective]
    val REPLACE = "REPLACE".asInstanceOf[MetadataDirective]

    val values = js.Object.freeze(js.Array(COPY, REPLACE))
  }

  /**
    * A metadata key-value pair to store with an object.
    */
  @js.native
  @Factory
  trait MetadataEntry extends js.Object {
    var Name: js.UndefOr[MetadataKey]
    var Value: js.UndefOr[MetadataValue]
  }

  /**
    * A container specifying replication metrics-related settings enabling metrics and Amazon S3 events for S3 Replication Time Control (S3 RTC). Must be specified together with a <code>ReplicationTime</code> block.
    */
  @js.native
  @Factory
  trait Metrics extends js.Object {
    var EventThreshold: ReplicationTimeValue
    var Status: MetricsStatus
  }

  /**
    * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.
    */
  @js.native
  @Factory
  trait MetricsAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[TagSet]
  }

  /**
    * Specifies a metrics configuration for the CloudWatch request metrics (specified by the metrics configuration ID) from an Amazon S3 bucket. If you're updating an existing metrics configuration, note that this is a full replacement of the existing metrics configuration. If you don't include the elements you want to keep, they are erased. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html| PUT Bucket metrics]] in the <i>Amazon Simple Storage Service API Reference</i>.
    */
  @js.native
  @Factory
  trait MetricsConfiguration extends js.Object {
    var Id: MetricsId
    var Filter: js.UndefOr[MetricsFilter]
  }

  /**
    * Specifies a metrics configuration filter. The metrics configuration only includes objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).
    */
  @js.native
  @Factory
  trait MetricsFilter extends js.Object {
    var And: js.UndefOr[MetricsAndOperator]
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[Tag]
  }

  @js.native
  sealed trait MetricsStatus extends js.Any
  object MetricsStatus extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[MetricsStatus]
    val Disabled = "Disabled".asInstanceOf[MetricsStatus]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  /**
    * Container for the <code>MultipartUpload</code> for the Amazon S3 object.
    */
  @js.native
  @Factory
  trait MultipartUpload extends js.Object {
    var Initiated: js.UndefOr[Initiated]
    var Initiator: js.UndefOr[Initiator]
    var Key: js.UndefOr[ObjectKey]
    var Owner: js.UndefOr[Owner]
    var StorageClass: js.UndefOr[StorageClass]
    var UploadId: js.UndefOr[MultipartUploadId]
  }

  /**
    * Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.
    */
  @js.native
  @Factory
  trait NoncurrentVersionExpiration extends js.Object {
    var NoncurrentDays: js.UndefOr[Days]
  }

  /**
    * Container for the transition rule that describes when noncurrent objects transition to the <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>, <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or <code>DEEP_ARCHIVE</code> storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>, <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or <code>DEEP_ARCHIVE</code> storage class at a specific period in the object's lifetime.
    */
  @js.native
  @Factory
  trait NoncurrentVersionTransition extends js.Object {
    var NoncurrentDays: js.UndefOr[Days]
    var StorageClass: js.UndefOr[TransitionStorageClass]
  }

  /**
    * A container for specifying the notification configuration of the bucket. If this element is empty, notifications are turned off for the bucket.
    */
  @js.native
  @Factory
  trait NotificationConfiguration extends js.Object {
    var LambdaFunctionConfigurations: js.UndefOr[LambdaFunctionConfigurationList]
    var QueueConfigurations: js.UndefOr[QueueConfigurationList]
    var TopicConfigurations: js.UndefOr[TopicConfigurationList]
  }

  @js.native
  @Factory
  trait NotificationConfigurationDeprecated extends js.Object {
    var CloudFunctionConfiguration: js.UndefOr[CloudFunctionConfiguration]
    var QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated]
    var TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated]
  }

  /**
    * Specifies object key name filtering rules. For information about key name filtering, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html|Configuring Event Notifications]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait NotificationConfigurationFilter extends js.Object {
    var Key: js.UndefOr[S3KeyFilter]
  }

  /**
    * An object consists of data and its descriptive metadata.
    */
  @js.native
  @Factory
  trait Object extends js.Object {
    var ETag: js.UndefOr[ETag]
    var Key: js.UndefOr[ObjectKey]
    var LastModified: js.UndefOr[LastModified]
    var Owner: js.UndefOr[Owner]
    var Size: js.UndefOr[Size]
    var StorageClass: js.UndefOr[ObjectStorageClass]
  }

  @js.native
  sealed trait ObjectCannedACL extends js.Any
  object ObjectCannedACL extends js.Object {
    val `private`                   = "private".asInstanceOf[ObjectCannedACL]
    val `public-read`               = "public-read".asInstanceOf[ObjectCannedACL]
    val `public-read-write`         = "public-read-write".asInstanceOf[ObjectCannedACL]
    val `authenticated-read`        = "authenticated-read".asInstanceOf[ObjectCannedACL]
    val `aws-exec-read`             = "aws-exec-read".asInstanceOf[ObjectCannedACL]
    val `bucket-owner-read`         = "bucket-owner-read".asInstanceOf[ObjectCannedACL]
    val `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[ObjectCannedACL]

    val values = js.Object.freeze(
      js.Array(
        `private`,
        `public-read`,
        `public-read-write`,
        `authenticated-read`,
        `aws-exec-read`,
        `bucket-owner-read`,
        `bucket-owner-full-control`
      )
    )
  }

  /**
    * Object Identifier is unique value to identify objects.
    */
  @js.native
  @Factory
  trait ObjectIdentifier extends js.Object {
    var Key: ObjectKey
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  /**
    * The container element for Object Lock configuration parameters.
    */
  @js.native
  @Factory
  trait ObjectLockConfiguration extends js.Object {
    var ObjectLockEnabled: js.UndefOr[ObjectLockEnabled]
    var Rule: js.UndefOr[ObjectLockRule]
  }

  @js.native
  sealed trait ObjectLockEnabled extends js.Any
  object ObjectLockEnabled extends js.Object {
    val Enabled = "Enabled".asInstanceOf[ObjectLockEnabled]

    val values = js.Object.freeze(js.Array(Enabled))
  }

  /**
    * A Legal Hold configuration for an object.
    */
  @js.native
  @Factory
  trait ObjectLockLegalHold extends js.Object {
    var Status: js.UndefOr[ObjectLockLegalHoldStatus]
  }

  @js.native
  sealed trait ObjectLockLegalHoldStatus extends js.Any
  object ObjectLockLegalHoldStatus extends js.Object {
    val ON  = "ON".asInstanceOf[ObjectLockLegalHoldStatus]
    val OFF = "OFF".asInstanceOf[ObjectLockLegalHoldStatus]

    val values = js.Object.freeze(js.Array(ON, OFF))
  }

  @js.native
  sealed trait ObjectLockMode extends js.Any
  object ObjectLockMode extends js.Object {
    val GOVERNANCE = "GOVERNANCE".asInstanceOf[ObjectLockMode]
    val COMPLIANCE = "COMPLIANCE".asInstanceOf[ObjectLockMode]

    val values = js.Object.freeze(js.Array(GOVERNANCE, COMPLIANCE))
  }

  /**
    * A Retention configuration for an object.
    */
  @js.native
  @Factory
  trait ObjectLockRetention extends js.Object {
    var Mode: js.UndefOr[ObjectLockRetentionMode]
    var RetainUntilDate: js.UndefOr[Date]
  }

  @js.native
  sealed trait ObjectLockRetentionMode extends js.Any
  object ObjectLockRetentionMode extends js.Object {
    val GOVERNANCE = "GOVERNANCE".asInstanceOf[ObjectLockRetentionMode]
    val COMPLIANCE = "COMPLIANCE".asInstanceOf[ObjectLockRetentionMode]

    val values = js.Object.freeze(js.Array(GOVERNANCE, COMPLIANCE))
  }

  /**
    * The container element for an Object Lock rule.
    */
  @js.native
  @Factory
  trait ObjectLockRule extends js.Object {
    var DefaultRetention: js.UndefOr[DefaultRetention]
  }

  @js.native
  sealed trait ObjectStorageClass extends js.Any
  object ObjectStorageClass extends js.Object {
    val STANDARD            = "STANDARD".asInstanceOf[ObjectStorageClass]
    val REDUCED_REDUNDANCY  = "REDUCED_REDUNDANCY".asInstanceOf[ObjectStorageClass]
    val GLACIER             = "GLACIER".asInstanceOf[ObjectStorageClass]
    val STANDARD_IA         = "STANDARD_IA".asInstanceOf[ObjectStorageClass]
    val ONEZONE_IA          = "ONEZONE_IA".asInstanceOf[ObjectStorageClass]
    val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[ObjectStorageClass]
    val DEEP_ARCHIVE        = "DEEP_ARCHIVE".asInstanceOf[ObjectStorageClass]

    val values = js.Object.freeze(
      js.Array(STANDARD, REDUCED_REDUNDANCY, GLACIER, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE)
    )
  }

  /**
    * The version of an object.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ObjectVersionStorageClass extends js.Any
  object ObjectVersionStorageClass extends js.Object {
    val STANDARD = "STANDARD".asInstanceOf[ObjectVersionStorageClass]

    val values = js.Object.freeze(js.Array(STANDARD))
  }

  /**
    * Describes the location where the restore job's output is stored.
    */
  @js.native
  @Factory
  trait OutputLocation extends js.Object {
    var S3: js.UndefOr[S3Location]
  }

  /**
    * Describes how results of the Select job are serialized.
    */
  @js.native
  @Factory
  trait OutputSerialization extends js.Object {
    var CSV: js.UndefOr[CSVOutput]
    var JSON: js.UndefOr[JSONOutput]
  }

  /**
    * Container for the owner's display name and ID.
    */
  @js.native
  @Factory
  trait Owner extends js.Object {
    var DisplayName: js.UndefOr[DisplayName]
    var ID: js.UndefOr[ID]
  }

  @js.native
  sealed trait OwnerOverride extends js.Any
  object OwnerOverride extends js.Object {
    val Destination = "Destination".asInstanceOf[OwnerOverride]

    val values = js.Object.freeze(js.Array(Destination))
  }

  /**
    * Container for Parquet.
    */
  @js.native
  @Factory
  trait ParquetInput extends js.Object {}

  /**
    * Container for elements related to a part.
    */
  @js.native
  @Factory
  trait Part extends js.Object {
    var ETag: js.UndefOr[ETag]
    var LastModified: js.UndefOr[LastModified]
    var PartNumber: js.UndefOr[PartNumber]
    var Size: js.UndefOr[Size]
  }

  @js.native
  sealed trait Payer extends js.Any
  object Payer extends js.Object {
    val Requester   = "Requester".asInstanceOf[Payer]
    val BucketOwner = "BucketOwner".asInstanceOf[Payer]

    val values = js.Object.freeze(js.Array(Requester, BucketOwner))
  }

  @js.native
  sealed trait Permission extends js.Any
  object Permission extends js.Object {
    val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[Permission]
    val WRITE        = "WRITE".asInstanceOf[Permission]
    val WRITE_ACP    = "WRITE_ACP".asInstanceOf[Permission]
    val READ         = "READ".asInstanceOf[Permission]
    val READ_ACP     = "READ_ACP".asInstanceOf[Permission]

    val values = js.Object.freeze(js.Array(FULL_CONTROL, WRITE, WRITE_ACP, READ, READ_ACP))
  }

  /**
    * The container element for a bucket's policy status.
    */
  @js.native
  @Factory
  trait PolicyStatus extends js.Object {
    var IsPublic: js.UndefOr[IsPublic]
  }

  /**
    * This data type contains information about progress of an operation.
    */
  @js.native
  @Factory
  trait Progress extends js.Object {
    var BytesProcessed: js.UndefOr[BytesProcessed]
    var BytesReturned: js.UndefOr[BytesReturned]
    var BytesScanned: js.UndefOr[BytesScanned]
  }

  /**
    * This data type contains information about the progress event of an operation.
    */
  @js.native
  @Factory
  trait ProgressEvent extends js.Object {
    var Details: js.UndefOr[Progress]
  }

  @js.native
  sealed trait Protocol extends js.Any
  object Protocol extends js.Object {
    val http  = "http".asInstanceOf[Protocol]
    val https = "https".asInstanceOf[Protocol]

    val values = js.Object.freeze(js.Array(http, https))
  }

  /**
    * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status|The Meaning of "Public"]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  @Factory
  trait PublicAccessBlockConfiguration extends js.Object {
    var BlockPublicAcls: js.UndefOr[Setting]
    var BlockPublicPolicy: js.UndefOr[Setting]
    var IgnorePublicAcls: js.UndefOr[Setting]
    var RestrictPublicBuckets: js.UndefOr[Setting]
  }

  @js.native
  @Factory
  trait PutBucketAccelerateConfigurationRequest extends js.Object {
    var AccelerateConfiguration: AccelerateConfiguration
    var Bucket: BucketName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait PutBucketAnalyticsConfigurationRequest extends js.Object {
    var AnalyticsConfiguration: AnalyticsConfiguration
    var Bucket: BucketName
    var Id: AnalyticsId
  }

  @js.native
  @Factory
  trait PutBucketCorsRequest extends js.Object {
    var Bucket: BucketName
    var CORSConfiguration: CORSConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  @js.native
  @Factory
  trait PutBucketEncryptionRequest extends js.Object {
    var Bucket: BucketName
    var ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  @js.native
  @Factory
  trait PutBucketInventoryConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: InventoryId
    var InventoryConfiguration: InventoryConfiguration
  }

  @js.native
  @Factory
  trait PutBucketLifecycleConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var LifecycleConfiguration: js.UndefOr[BucketLifecycleConfiguration]
  }

  @js.native
  @Factory
  trait PutBucketLifecycleRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5]
    var LifecycleConfiguration: js.UndefOr[LifecycleConfiguration]
  }

  @js.native
  @Factory
  trait PutBucketLoggingRequest extends js.Object {
    var Bucket: BucketName
    var BucketLoggingStatus: BucketLoggingStatus
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  @js.native
  @Factory
  trait PutBucketMetricsConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var Id: MetricsId
    var MetricsConfiguration: MetricsConfiguration
  }

  @js.native
  @Factory
  trait PutBucketNotificationConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var NotificationConfiguration: NotificationConfiguration
  }

  @js.native
  @Factory
  trait PutBucketNotificationRequest extends js.Object {
    var Bucket: BucketName
    var NotificationConfiguration: NotificationConfigurationDeprecated
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  @js.native
  @Factory
  trait PutBucketPolicyRequest extends js.Object {
    var Bucket: BucketName
    var Policy: Policy
    var ConfirmRemoveSelfBucketAccess: js.UndefOr[ConfirmRemoveSelfBucketAccess]
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  @js.native
  @Factory
  trait PutBucketReplicationRequest extends js.Object {
    var Bucket: BucketName
    var ReplicationConfiguration: ReplicationConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
    var Token: js.UndefOr[ObjectLockToken]
  }

  @js.native
  @Factory
  trait PutBucketRequestPaymentRequest extends js.Object {
    var Bucket: BucketName
    var RequestPaymentConfiguration: RequestPaymentConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  @js.native
  @Factory
  trait PutBucketTaggingRequest extends js.Object {
    var Bucket: BucketName
    var Tagging: Tagging
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  @js.native
  @Factory
  trait PutBucketVersioningRequest extends js.Object {
    var Bucket: BucketName
    var VersioningConfiguration: VersioningConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
    var MFA: js.UndefOr[MFA]
  }

  @js.native
  @Factory
  trait PutBucketWebsiteRequest extends js.Object {
    var Bucket: BucketName
    var WebsiteConfiguration: WebsiteConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  @js.native
  @Factory
  trait PutObjectAclOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait PutObjectLegalHoldOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  @js.native
  @Factory
  trait PutObjectLegalHoldRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var ContentMD5: js.UndefOr[ContentMD5]
    var LegalHold: js.UndefOr[ObjectLockLegalHold]
    var RequestPayer: js.UndefOr[RequestPayer]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait PutObjectLockConfigurationOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  @js.native
  @Factory
  trait PutObjectLockConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5]
    var ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration]
    var RequestPayer: js.UndefOr[RequestPayer]
    var Token: js.UndefOr[ObjectLockToken]
  }

  @js.native
  @Factory
  trait PutObjectOutput extends js.Object {
    var ETag: js.UndefOr[ETag]
    var Expiration: js.UndefOr[Expiration]
    var RequestCharged: js.UndefOr[RequestCharged]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSEncryptionContext: js.UndefOr[SSEKMSEncryptionContext]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
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
    var SSEKMSEncryptionContext: js.UndefOr[SSEKMSEncryptionContext]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var StorageClass: js.UndefOr[StorageClass]
    var Tagging: js.UndefOr[TaggingHeader]
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation]
  }

  @js.native
  @Factory
  trait PutObjectRetentionOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
  }

  @js.native
  @Factory
  trait PutObjectRetentionRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention]
    var ContentMD5: js.UndefOr[ContentMD5]
    var RequestPayer: js.UndefOr[RequestPayer]
    var Retention: js.UndefOr[ObjectLockRetention]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait PutObjectTaggingOutput extends js.Object {
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait PutObjectTaggingRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var Tagging: Tagging
    var ContentMD5: js.UndefOr[ContentMD5]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  @js.native
  @Factory
  trait PutPublicAccessBlockRequest extends js.Object {
    var Bucket: BucketName
    var PublicAccessBlockConfiguration: PublicAccessBlockConfiguration
    var ContentMD5: js.UndefOr[ContentMD5]
  }

  /**
    * Specifies the configuration for publishing messages to an Amazon Simple Queue Service (Amazon SQS) queue when Amazon S3 detects specified events.
    */
  @js.native
  @Factory
  trait QueueConfiguration extends js.Object {
    var Events: EventList
    var QueueArn: QueueArn
    var Filter: js.UndefOr[NotificationConfigurationFilter]
    var Id: js.UndefOr[NotificationId]
  }

  /**
    * This data type is deprecated. Use <a>QueueConfiguration</a> for the same purposes. This data type specifies the configuration for publishing messages to an Amazon Simple Queue Service (Amazon SQS) queue when Amazon S3 detects specified events.
    */
  @js.native
  @Factory
  trait QueueConfigurationDeprecated extends js.Object {
    var Event: js.UndefOr[Event]
    var Events: js.UndefOr[EventList]
    var Id: js.UndefOr[NotificationId]
    var Queue: js.UndefOr[QueueArn]
  }

  @js.native
  sealed trait QuoteFields extends js.Any
  object QuoteFields extends js.Object {
    val ALWAYS   = "ALWAYS".asInstanceOf[QuoteFields]
    val ASNEEDED = "ASNEEDED".asInstanceOf[QuoteFields]

    val values = js.Object.freeze(js.Array(ALWAYS, ASNEEDED))
  }

  /**
    * The container for the records event.
    */
  @js.native
  @Factory
  trait RecordsEvent extends js.Object {
    var Payload: js.UndefOr[Body]
  }

  /**
    * Specifies how requests are redirected. In the event of an error, you can specify a different error code to return.
    */
  @js.native
  @Factory
  trait Redirect extends js.Object {
    var HostName: js.UndefOr[HostName]
    var HttpRedirectCode: js.UndefOr[HttpRedirectCode]
    var Protocol: js.UndefOr[Protocol]
    var ReplaceKeyPrefixWith: js.UndefOr[ReplaceKeyPrefixWith]
    var ReplaceKeyWith: js.UndefOr[ReplaceKeyWith]
  }

  /**
    * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
    */
  @js.native
  @Factory
  trait RedirectAllRequestsTo extends js.Object {
    var HostName: HostName
    var Protocol: js.UndefOr[Protocol]
  }

  /**
    * A container for replication rules. You can add up to 1,000 rules. The maximum size of a replication configuration is 2 MB.
    */
  @js.native
  @Factory
  trait ReplicationConfiguration extends js.Object {
    var Role: Role
    var Rules: ReplicationRules
  }

  /**
    * Specifies which Amazon S3 objects to replicate and where to store the replicas.
    */
  @js.native
  @Factory
  trait ReplicationRule extends js.Object {
    var Destination: Destination
    var Status: ReplicationRuleStatus
    var DeleteMarkerReplication: js.UndefOr[DeleteMarkerReplication]
    var ExistingObjectReplication: js.UndefOr[ExistingObjectReplication]
    var Filter: js.UndefOr[ReplicationRuleFilter]
    var ID: js.UndefOr[ID]
    var Prefix: js.UndefOr[Prefix]
    var Priority: js.UndefOr[Priority]
    var SourceSelectionCriteria: js.UndefOr[SourceSelectionCriteria]
  }

  /**
    * A container for specifying rule filters. The filters determine the subset of objects to which the rule applies. This element is required only if you specify more than one filter.
    *  For example:
    * * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an <code>And</code> tag.
    *  * If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code> tag
    */
  @js.native
  @Factory
  trait ReplicationRuleAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[TagSet]
  }

  /**
    * A filter that identifies the subset of objects to which the replication rule applies. A <code>Filter</code> must specify exactly one <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child element.
    */
  @js.native
  @Factory
  trait ReplicationRuleFilter extends js.Object {
    var And: js.UndefOr[ReplicationRuleAndOperator]
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[Tag]
  }

  @js.native
  sealed trait ReplicationRuleStatus extends js.Any
  object ReplicationRuleStatus extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[ReplicationRuleStatus]
    val Disabled = "Disabled".asInstanceOf[ReplicationRuleStatus]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  @js.native
  sealed trait ReplicationStatus extends js.Any
  object ReplicationStatus extends js.Object {
    val COMPLETE = "COMPLETE".asInstanceOf[ReplicationStatus]
    val PENDING  = "PENDING".asInstanceOf[ReplicationStatus]
    val FAILED   = "FAILED".asInstanceOf[ReplicationStatus]
    val REPLICA  = "REPLICA".asInstanceOf[ReplicationStatus]

    val values = js.Object.freeze(js.Array(COMPLETE, PENDING, FAILED, REPLICA))
  }

  /**
    * A container specifying S3 Replication Time Control (S3 RTC) related information, including whether S3 RTC is enabled and the time when all objects and operations on objects must be replicated. Must be specified together with a <code>Metrics</code> block.
    */
  @js.native
  @Factory
  trait ReplicationTime extends js.Object {
    var Status: ReplicationTimeStatus
    var Time: ReplicationTimeValue
  }

  @js.native
  sealed trait ReplicationTimeStatus extends js.Any
  object ReplicationTimeStatus extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[ReplicationTimeStatus]
    val Disabled = "Disabled".asInstanceOf[ReplicationTimeStatus]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  /**
    * A container specifying the time value for S3 Replication Time Control (S3 RTC) and replication metrics <code>EventThreshold</code>.
    */
  @js.native
  @Factory
  trait ReplicationTimeValue extends js.Object {
    var Minutes: js.UndefOr[Minutes]
  }

  /**
    * If present, indicates that the requester was successfully charged for the request.
    */
  @js.native
  sealed trait RequestCharged extends js.Any
  object RequestCharged extends js.Object {
    val requester = "requester".asInstanceOf[RequestCharged]

    val values = js.Object.freeze(js.Array(requester))
  }

  /**
    * Confirms that the requester knows that they will be charged for the request. Bucket owners need not specify this parameter in their requests. For information about downloading objects from requester pays buckets, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html|Downloading Objects in Requestor Pays Buckets]] in the <i>Amazon S3 Developer Guide</i>.
    */
  @js.native
  sealed trait RequestPayer extends js.Any
  object RequestPayer extends js.Object {
    val requester = "requester".asInstanceOf[RequestPayer]

    val values = js.Object.freeze(js.Array(requester))
  }

  /**
    * Container for Payer.
    */
  @js.native
  @Factory
  trait RequestPaymentConfiguration extends js.Object {
    var Payer: Payer
  }

  /**
    * Container for specifying if periodic <code>QueryProgress</code> messages should be sent.
    */
  @js.native
  @Factory
  trait RequestProgress extends js.Object {
    var Enabled: js.UndefOr[EnableRequestProgress]
  }

  @js.native
  @Factory
  trait RestoreObjectOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged]
    var RestoreOutputPath: js.UndefOr[RestoreOutputPath]
  }

  @js.native
  @Factory
  trait RestoreObjectRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer]
    var RestoreRequest: js.UndefOr[RestoreRequest]
    var VersionId: js.UndefOr[ObjectVersionId]
  }

  /**
    * Container for restore job parameters.
    */
  @js.native
  @Factory
  trait RestoreRequest extends js.Object {
    var Days: js.UndefOr[Days]
    var Description: js.UndefOr[Description]
    var GlacierJobParameters: js.UndefOr[GlacierJobParameters]
    var OutputLocation: js.UndefOr[OutputLocation]
    var SelectParameters: js.UndefOr[SelectParameters]
    var Tier: js.UndefOr[Tier]
    var Type: js.UndefOr[RestoreRequestType]
  }

  @js.native
  sealed trait RestoreRequestType extends js.Any
  object RestoreRequestType extends js.Object {
    val SELECT = "SELECT".asInstanceOf[RestoreRequestType]

    val values = js.Object.freeze(js.Array(SELECT))
  }

  /**
    * Specifies the redirect behavior and when a redirect is applied.
    */
  @js.native
  @Factory
  trait RoutingRule extends js.Object {
    var Redirect: Redirect
    var Condition: js.UndefOr[Condition]
  }

  /**
    * Specifies lifecycle rules for an Amazon S3 bucket. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlifecycle.html|PUT Bucket lifecycle]] in the <i>Amazon Simple Storage Service API Reference</i>.
    */
  @js.native
  @Factory
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

  /**
    * A container for object key name prefix and suffix filtering rules.
    */
  @js.native
  @Factory
  trait S3KeyFilter extends js.Object {
    var FilterRules: js.UndefOr[FilterRuleList]
  }

  /**
    * Describes an Amazon S3 location that will receive the results of the restore request.
    */
  @js.native
  @Factory
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

  /**
    * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
    */
  @js.native
  @Factory
  trait SSEKMS extends js.Object {
    var KeyId: SSEKMSKeyId
  }

  /**
    * Specifies the use of SSE-S3 to encrypt delivered inventory reports.
    */
  @js.native
  @Factory
  trait SSES3 extends js.Object {}

  /**
    * Specifies the byte range of the object to get the records from. A record is processed when its first byte is contained by the range. This parameter is optional, but when specified, it must not be empty. See RFC 2616, Section 14.35.1 about how to specify the start and end of the range.
    */
  @js.native
  @Factory
  trait ScanRange extends js.Object {
    var End: js.UndefOr[End]
    var Start: js.UndefOr[Start]
  }

  /**
    * The container for selecting objects from a content event stream.
    */
  @js.native
  @Factory
  trait SelectObjectContentEventStream extends js.Object {
    var Cont: js.UndefOr[ContinuationEvent]
    var End: js.UndefOr[EndEvent]
    var Progress: js.UndefOr[ProgressEvent]
    var Records: js.UndefOr[RecordsEvent]
    var Stats: js.UndefOr[StatsEvent]
  }

  @js.native
  @Factory
  trait SelectObjectContentOutput extends js.Object {
    var Payload: js.UndefOr[SelectObjectContentEventStream]
  }

  /**
    * Request to filter the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In the request, along with the SQL expression, you must specify a data serialization format (JSON or CSV) of the object. Amazon S3 uses this to parse object data into records. It returns only records that match the specified SQL expression. You must also specify the data serialization format for the response. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectSELECTContent.html|S3Select API Documentation]].
    */
  @js.native
  @Factory
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
    var ScanRange: js.UndefOr[ScanRange]
  }

  /**
    * Describes the parameters for Select job types.
    */
  @js.native
  @Factory
  trait SelectParameters extends js.Object {
    var Expression: Expression
    var ExpressionType: ExpressionType
    var InputSerialization: InputSerialization
    var OutputSerialization: OutputSerialization
  }

  @js.native
  sealed trait ServerSideEncryption extends js.Any
  object ServerSideEncryption extends js.Object {
    val AES256    = "AES256".asInstanceOf[ServerSideEncryption]
    val `aws:kms` = "aws:kms".asInstanceOf[ServerSideEncryption]

    val values = js.Object.freeze(js.Array(AES256, `aws:kms`))
  }

  /**
    * Describes the default server-side encryption to apply to new objects in the bucket. If a PUT Object request doesn't specify any server-side encryption, this default encryption will be applied. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTencryption.html|PUT Bucket encryption]] in the <i>Amazon Simple Storage Service API Reference</i>.
    */
  @js.native
  @Factory
  trait ServerSideEncryptionByDefault extends js.Object {
    var SSEAlgorithm: ServerSideEncryption
    var KMSMasterKeyID: js.UndefOr[SSEKMSKeyId]
  }

  /**
    * Specifies the default server-side-encryption configuration.
    */
  @js.native
  @Factory
  trait ServerSideEncryptionConfiguration extends js.Object {
    var Rules: ServerSideEncryptionRules
  }

  /**
    * Specifies the default server-side encryption configuration.
    */
  @js.native
  @Factory
  trait ServerSideEncryptionRule extends js.Object {
    var ApplyServerSideEncryptionByDefault: js.UndefOr[ServerSideEncryptionByDefault]
  }

  /**
    * A container that describes additional filters for identifying the source objects that you want to replicate. You can choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using a customer master key (CMK) stored in AWS Key Management Service (SSE-KMS).
    */
  @js.native
  @Factory
  trait SourceSelectionCriteria extends js.Object {
    var SseKmsEncryptedObjects: js.UndefOr[SseKmsEncryptedObjects]
  }

  /**
    * A container for filter information for the selection of S3 objects encrypted with AWS KMS.
    */
  @js.native
  @Factory
  trait SseKmsEncryptedObjects extends js.Object {
    var Status: SseKmsEncryptedObjectsStatus
  }

  @js.native
  sealed trait SseKmsEncryptedObjectsStatus extends js.Any
  object SseKmsEncryptedObjectsStatus extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[SseKmsEncryptedObjectsStatus]
    val Disabled = "Disabled".asInstanceOf[SseKmsEncryptedObjectsStatus]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  /**
    * Container for the stats details.
    */
  @js.native
  @Factory
  trait Stats extends js.Object {
    var BytesProcessed: js.UndefOr[BytesProcessed]
    var BytesReturned: js.UndefOr[BytesReturned]
    var BytesScanned: js.UndefOr[BytesScanned]
  }

  /**
    * Container for the Stats Event.
    */
  @js.native
  @Factory
  trait StatsEvent extends js.Object {
    var Details: js.UndefOr[Stats]
  }

  @js.native
  sealed trait StorageClass extends js.Any
  object StorageClass extends js.Object {
    val STANDARD            = "STANDARD".asInstanceOf[StorageClass]
    val REDUCED_REDUNDANCY  = "REDUCED_REDUNDANCY".asInstanceOf[StorageClass]
    val STANDARD_IA         = "STANDARD_IA".asInstanceOf[StorageClass]
    val ONEZONE_IA          = "ONEZONE_IA".asInstanceOf[StorageClass]
    val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[StorageClass]
    val GLACIER             = "GLACIER".asInstanceOf[StorageClass]
    val DEEP_ARCHIVE        = "DEEP_ARCHIVE".asInstanceOf[StorageClass]

    val values = js.Object.freeze(
      js.Array(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE)
    )
  }

  /**
    * Specifies data related to access patterns to be collected and made available to analyze the tradeoffs between different storage classes for an Amazon S3 bucket.
    */
  @js.native
  @Factory
  trait StorageClassAnalysis extends js.Object {
    var DataExport: js.UndefOr[StorageClassAnalysisDataExport]
  }

  /**
    * Container for data related to the storage class analysis for an Amazon S3 bucket for export.
    */
  @js.native
  @Factory
  trait StorageClassAnalysisDataExport extends js.Object {
    var Destination: AnalyticsExportDestination
    var OutputSchemaVersion: StorageClassAnalysisSchemaVersion
  }

  @js.native
  sealed trait StorageClassAnalysisSchemaVersion extends js.Any
  object StorageClassAnalysisSchemaVersion extends js.Object {
    val V_1 = "V_1".asInstanceOf[StorageClassAnalysisSchemaVersion]

    val values = js.Object.freeze(js.Array(V_1))
  }

  /**
    * A container of a key value name pair.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: ObjectKey
    var Value: Value
  }

  /**
    * Container for <code>TagSet</code> elements.
    */
  @js.native
  @Factory
  trait Tagging extends js.Object {
    var TagSet: TagSet
  }

  @js.native
  sealed trait TaggingDirective extends js.Any
  object TaggingDirective extends js.Object {
    val COPY    = "COPY".asInstanceOf[TaggingDirective]
    val REPLACE = "REPLACE".asInstanceOf[TaggingDirective]

    val values = js.Object.freeze(js.Array(COPY, REPLACE))
  }

  /**
    * Container for granting information.
    */
  @js.native
  @Factory
  trait TargetGrant extends js.Object {
    var Grantee: js.UndefOr[Grantee]
    var Permission: js.UndefOr[BucketLogsPermission]
  }

  @js.native
  sealed trait Tier extends js.Any
  object Tier extends js.Object {
    val Standard  = "Standard".asInstanceOf[Tier]
    val Bulk      = "Bulk".asInstanceOf[Tier]
    val Expedited = "Expedited".asInstanceOf[Tier]

    val values = js.Object.freeze(js.Array(Standard, Bulk, Expedited))
  }

  /**
    * A container for specifying the configuration for publication of messages to an Amazon Simple Notification Service (Amazon SNS) topic when Amazon S3 detects specified events.
    */
  @js.native
  @Factory
  trait TopicConfiguration extends js.Object {
    var Events: EventList
    var TopicArn: TopicArn
    var Filter: js.UndefOr[NotificationConfigurationFilter]
    var Id: js.UndefOr[NotificationId]
  }

  /**
    * A container for specifying the configuration for publication of messages to an Amazon Simple Notification Service (Amazon SNS) topic when Amazon S3 detects specified events. This data type is deprecated. Use <a>TopicConfiguration</a> instead.
    */
  @js.native
  @Factory
  trait TopicConfigurationDeprecated extends js.Object {
    var Event: js.UndefOr[Event]
    var Events: js.UndefOr[EventList]
    var Id: js.UndefOr[NotificationId]
    var Topic: js.UndefOr[TopicArn]
  }

  /**
    * Specifies when an object transitions to a specified storage class.
    */
  @js.native
  @Factory
  trait Transition extends js.Object {
    var Date: js.UndefOr[Date]
    var Days: js.UndefOr[Days]
    var StorageClass: js.UndefOr[TransitionStorageClass]
  }

  @js.native
  sealed trait TransitionStorageClass extends js.Any
  object TransitionStorageClass extends js.Object {
    val GLACIER             = "GLACIER".asInstanceOf[TransitionStorageClass]
    val STANDARD_IA         = "STANDARD_IA".asInstanceOf[TransitionStorageClass]
    val ONEZONE_IA          = "ONEZONE_IA".asInstanceOf[TransitionStorageClass]
    val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[TransitionStorageClass]
    val DEEP_ARCHIVE        = "DEEP_ARCHIVE".asInstanceOf[TransitionStorageClass]

    val values = js.Object.freeze(js.Array(GLACIER, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE))
  }

  @js.native
  sealed trait Type extends js.Any
  object Type extends js.Object {
    val CanonicalUser         = "CanonicalUser".asInstanceOf[Type]
    val AmazonCustomerByEmail = "AmazonCustomerByEmail".asInstanceOf[Type]
    val Group                 = "Group".asInstanceOf[Type]

    val values = js.Object.freeze(js.Array(CanonicalUser, AmazonCustomerByEmail, Group))
  }

  @js.native
  @Factory
  trait UploadPartCopyOutput extends js.Object {
    var CopyPartResult: js.UndefOr[CopyPartResult]
    var CopySourceVersionId: js.UndefOr[CopySourceVersionId]
    var RequestCharged: js.UndefOr[RequestCharged]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UploadPartOutput extends js.Object {
    var ETag: js.UndefOr[ETag]
    var RequestCharged: js.UndefOr[RequestCharged]
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm]
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5]
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId]
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption]
  }

  @js.native
  @Factory
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

  /**
    * Describes the versioning state of an Amazon S3 bucket. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTVersioningStatus.html|PUT Bucket versioning]] in the <i>Amazon Simple Storage Service API Reference</i>.
    */
  @js.native
  @Factory
  trait VersioningConfiguration extends js.Object {
    var MFADelete: js.UndefOr[MFADelete]
    var Status: js.UndefOr[BucketVersioningStatus]
  }

  /**
    * Specifies website configuration parameters for an Amazon S3 bucket.
    */
  @js.native
  @Factory
  trait WebsiteConfiguration extends js.Object {
    var ErrorDocument: js.UndefOr[ErrorDocument]
    var IndexDocument: js.UndefOr[IndexDocument]
    var RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo]
    var RoutingRules: js.UndefOr[RoutingRules]
  }
}
