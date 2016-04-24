package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object s3 {
  type AcceptRanges = String
  type AllowedHeader = String
  type AllowedHeaders = js.Array[AllowedHeader]
  type AllowedMethod = String
  type AllowedMethods = js.Array[AllowedMethod]
  type AllowedOrigin = String
  type AllowedOrigins = js.Array[AllowedOrigin]
  type Body = js.Array[Byte]
  type BucketCannedACL = String
  type BucketLocationConstraint = String
  type BucketLogsPermission = String
  type BucketName = String
  type BucketVersioningStatus = String
  type Buckets = js.Array[Bucket]
  type CORSRules = js.Array[CORSRule]
  type CacheControl = String
  type CloudFunction = String
  type CloudFunctionInvocationRole = String
  type Code = String
  type CommonPrefixList = js.Array[CommonPrefix]
  type CompletedPartList = js.Array[CompletedPart]
  type ContentDisposition = String
  type ContentEncoding = String
  type ContentLanguage = String
  type ContentLength = Integer
  type ContentMD5 = String
  type ContentType = String
  type CopySource = String
  type CopySourceIfMatch = String
  type CopySourceIfModifiedSince = js.Date
  type CopySourceIfNoneMatch = String
  type CopySourceIfUnmodifiedSince = js.Date
  type CopySourceRange = String
  type CopySourceSSECustomerAlgorithm = String
  type CopySourceSSECustomerKey = String
  type CopySourceSSECustomerKeyMD5 = String
  type CopySourceVersionId = String
  type CreationDate = js.Date
  type Date = js.Date
  type Days = Integer
  type DeleteMarker = Boolean
  type DeleteMarkerVersionId = String
  type DeleteMarkers = js.Array[DeleteMarkerEntry]
  type DeletedObjects = js.Array[DeletedObject]
  type Delimiter = String
  type DisplayName = String
  type ETag = String
  type EmailAddress = String
  type EncodingType = String
  type Errors = js.Array[Error]
  type Event = String
  type EventList = js.Array[Event]
  type Expiration = String
  type ExpirationStatus = String
  type Expires = js.Date
  type ExposeHeader = String
  type ExposeHeaders = js.Array[ExposeHeader]
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
  type IsLatest = Boolean
  type IsTruncated = Boolean
  type KeyMarker = String
  type KeyPrefixEquals = String
  type LambdaFunctionArn = String
  type LambdaFunctionConfigurationList = js.Array[LambdaFunctionConfiguration]
  type LastModified = js.Date
  type Location = String
  type MFA = String
  type MFADelete = String
  type MFADeleteStatus = String
  type Marker = String
  type MaxAgeSeconds = Integer
  type MaxKeys = Integer
  type MaxParts = Integer
  type MaxUploads = Integer
  type Message = String
  type Metadata = js.Dictionary[MetadataValue]
  type MetadataDirective = String
  type MetadataKey = String
  type MetadataValue = String
  type MissingMeta = Integer
  type MultipartUploadId = String
  type MultipartUploadList = js.Array[MultipartUpload]
  type NextKeyMarker = String
  type NextMarker = String
  type NextPartNumberMarker = Integer
  type NextUploadIdMarker = String
  type NextVersionIdMarker = String
  type NotificationId = String
  type ObjectCannedACL = String
  type ObjectIdentifierList = js.Array[ObjectIdentifier]
  type ObjectKey = String
  type ObjectList = js.Array[Object]
  type ObjectStorageClass = String
  type ObjectVersionId = String
  type ObjectVersionList = js.Array[ObjectVersion]
  type ObjectVersionStorageClass = String
  type PartNumber = Integer
  type PartNumberMarker = Integer
  type Parts = js.Array[Part]
  type Payer = String
  type Permission = String
  type Policy = String
  type Prefix = String
  type Protocol = String
  type QueueArn = String
  type QueueConfigurationList = js.Array[QueueConfiguration]
  type Quiet = Boolean
  type Range = String
  type ReplaceKeyPrefixWith = String
  type ReplaceKeyWith = String
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
  type Role = String
  type RoutingRules = js.Array[RoutingRule]
  type Rules = js.Array[Rule]
  type SSECustomerAlgorithm = String
  type SSECustomerKey = String
  type SSECustomerKeyMD5 = String
  type SSEKMSKeyId = String
  type ServerSideEncryption = String
  type Size = Integer
  type StorageClass = String
  type Suffix = String
  type TagSet = js.Array[Tag]
  type TargetBucket = String
  type TargetGrants = js.Array[TargetGrant]
  type TargetPrefix = String
  type TopicArn = String
  type TopicConfigurationList = js.Array[TopicConfiguration]
  type TransitionStorageClass = String
  type Type = String
  type URI = String
  type UploadIdMarker = String
  type Value = String
  type VersionIdMarker = String
  type WebsiteRedirectLocation = String
}

package s3 {
  @js.native
  trait S3 extends js.Object {
    def abortMultipartUpload(params: AbortMultipartUploadRequest, callback: Callback[AbortMultipartUploadOutput]): Unit = js.native
    def abortMultipartUpload(params: AbortMultipartUploadRequest): Request[AbortMultipartUploadOutput] = js.native
    def completeMultipartUpload(params: CompleteMultipartUploadRequest, callback: Callback[CompleteMultipartUploadOutput]): Unit = js.native
    def completeMultipartUpload(params: CompleteMultipartUploadRequest): Request[CompleteMultipartUploadOutput] = js.native
    def copyObject(params: CopyObjectRequest, callback: Callback[CopyObjectOutput]): Unit = js.native
    def copyObject(params: CopyObjectRequest): Request[CopyObjectOutput] = js.native
    def createBucket(params: CreateBucketRequest, callback: Callback[CreateBucketOutput]): Unit = js.native
    def createBucket(params: CreateBucketRequest): Request[CreateBucketOutput] = js.native
    def createMultipartUpload(params: CreateMultipartUploadRequest, callback: Callback[CreateMultipartUploadOutput]): Unit = js.native
    def createMultipartUpload(params: CreateMultipartUploadRequest): Request[CreateMultipartUploadOutput] = js.native
    def deleteBucket(params: DeleteBucketRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteBucket(params: DeleteBucketRequest): Request[js.Object] = js.native
    def deleteBucketCors(params: DeleteBucketCorsRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteBucketCors(params: DeleteBucketCorsRequest): Request[js.Object] = js.native
    def deleteBucketLifecycle(params: DeleteBucketLifecycleRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteBucketLifecycle(params: DeleteBucketLifecycleRequest): Request[js.Object] = js.native
    def deleteBucketPolicy(params: DeleteBucketPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteBucketPolicy(params: DeleteBucketPolicyRequest): Request[js.Object] = js.native
    def deleteBucketReplication(params: DeleteBucketReplicationRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteBucketReplication(params: DeleteBucketReplicationRequest): Request[js.Object] = js.native
    def deleteBucketTagging(params: DeleteBucketTaggingRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteBucketTagging(params: DeleteBucketTaggingRequest): Request[js.Object] = js.native
    def deleteBucketWebsite(params: DeleteBucketWebsiteRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteBucketWebsite(params: DeleteBucketWebsiteRequest): Request[js.Object] = js.native
    def deleteObject(params: DeleteObjectRequest, callback: Callback[DeleteObjectOutput]): Unit = js.native
    def deleteObject(params: DeleteObjectRequest): Request[DeleteObjectOutput] = js.native
    def deleteObjects(params: DeleteObjectsRequest, callback: Callback[DeleteObjectsOutput]): Unit = js.native
    def deleteObjects(params: DeleteObjectsRequest): Request[DeleteObjectsOutput] = js.native
    def getBucketAcl(params: GetBucketAclRequest, callback: Callback[GetBucketAclOutput]): Unit = js.native
    def getBucketAcl(params: GetBucketAclRequest): Request[GetBucketAclOutput] = js.native
    def getBucketCors(params: GetBucketCorsRequest, callback: Callback[GetBucketCorsOutput]): Unit = js.native
    def getBucketCors(params: GetBucketCorsRequest): Request[GetBucketCorsOutput] = js.native
    def getBucketLifecycle(params: GetBucketLifecycleRequest, callback: Callback[GetBucketLifecycleOutput]): Unit = js.native
    def getBucketLifecycle(params: GetBucketLifecycleRequest): Request[GetBucketLifecycleOutput] = js.native
    def getBucketLocation(params: GetBucketLocationRequest, callback: Callback[GetBucketLocationOutput]): Unit = js.native
    def getBucketLocation(params: GetBucketLocationRequest): Request[GetBucketLocationOutput] = js.native
    def getBucketLogging(params: GetBucketLoggingRequest, callback: Callback[GetBucketLoggingOutput]): Unit = js.native
    def getBucketLogging(params: GetBucketLoggingRequest): Request[GetBucketLoggingOutput] = js.native
    def getBucketNotification(params: GetBucketNotificationConfigurationRequest, callback: Callback[NotificationConfigurationDeprecated]): Unit = js.native
    def getBucketNotification(params: GetBucketNotificationConfigurationRequest): Request[NotificationConfigurationDeprecated] = js.native
    def getBucketNotificationConfiguration(params: GetBucketNotificationConfigurationRequest, callback: Callback[NotificationConfiguration]): Unit = js.native
    def getBucketNotificationConfiguration(params: GetBucketNotificationConfigurationRequest): Request[NotificationConfiguration] = js.native
    def getBucketPolicy(params: GetBucketPolicyRequest, callback: Callback[GetBucketPolicyOutput]): Unit = js.native
    def getBucketPolicy(params: GetBucketPolicyRequest): Request[GetBucketPolicyOutput] = js.native
    def getBucketReplication(params: GetBucketReplicationRequest, callback: Callback[GetBucketReplicationOutput]): Unit = js.native
    def getBucketReplication(params: GetBucketReplicationRequest): Request[GetBucketReplicationOutput] = js.native
    def getBucketRequestPayment(params: GetBucketRequestPaymentRequest, callback: Callback[GetBucketRequestPaymentOutput]): Unit = js.native
    def getBucketRequestPayment(params: GetBucketRequestPaymentRequest): Request[GetBucketRequestPaymentOutput] = js.native
    def getBucketTagging(params: GetBucketTaggingRequest, callback: Callback[GetBucketTaggingOutput]): Unit = js.native
    def getBucketTagging(params: GetBucketTaggingRequest): Request[GetBucketTaggingOutput] = js.native
    def getBucketVersioning(params: GetBucketVersioningRequest, callback: Callback[GetBucketVersioningOutput]): Unit = js.native
    def getBucketVersioning(params: GetBucketVersioningRequest): Request[GetBucketVersioningOutput] = js.native
    def getBucketWebsite(params: GetBucketWebsiteRequest, callback: Callback[GetBucketWebsiteOutput]): Unit = js.native
    def getBucketWebsite(params: GetBucketWebsiteRequest): Request[GetBucketWebsiteOutput] = js.native
    def getObject(params: GetObjectRequest, callback: Callback[GetObjectOutput]): Unit = js.native
    def getObject(params: GetObjectRequest): Request[GetObjectOutput] = js.native
    def getObjectAcl(params: GetObjectAclRequest, callback: Callback[GetObjectAclOutput]): Unit = js.native
    def getObjectAcl(params: GetObjectAclRequest): Request[GetObjectAclOutput] = js.native
    def getObjectTorrent(params: GetObjectTorrentRequest, callback: Callback[GetObjectTorrentOutput]): Unit = js.native
    def getObjectTorrent(params: GetObjectTorrentRequest): Request[GetObjectTorrentOutput] = js.native
    def headBucket(params: HeadBucketRequest, callback: Callback[js.Object]): Unit = js.native
    def headBucket(params: HeadBucketRequest): Request[js.Object] = js.native
    def headObject(params: HeadObjectRequest, callback: Callback[HeadObjectOutput]): Unit = js.native
    def headObject(params: HeadObjectRequest): Request[HeadObjectOutput] = js.native
    def listBuckets(callback: Callback[ListBucketsOutput]): Unit = js.native
    def listBuckets(): Request[ListBucketsOutput] = js.native
    def listMultipartUploads(params: ListMultipartUploadsRequest, callback: Callback[ListMultipartUploadsOutput]): Unit = js.native
    def listMultipartUploads(params: ListMultipartUploadsRequest): Request[ListMultipartUploadsOutput] = js.native
    def listObjectVersions(params: ListObjectVersionsRequest, callback: Callback[ListObjectVersionsOutput]): Unit = js.native
    def listObjectVersions(params: ListObjectVersionsRequest): Request[ListObjectVersionsOutput] = js.native
    def listObjects(params: ListObjectsRequest, callback: Callback[ListObjectsOutput]): Unit = js.native
    def listObjects(params: ListObjectsRequest): Request[ListObjectsOutput] = js.native
    def listParts(params: ListPartsRequest, callback: Callback[ListPartsOutput]): Unit = js.native
    def listParts(params: ListPartsRequest): Request[ListPartsOutput] = js.native
    def putBucketAcl(params: PutBucketAclRequest, callback: Callback[js.Object]): Unit = js.native
    def putBucketAcl(params: PutBucketAclRequest): Request[js.Object] = js.native
    def putBucketCors(params: PutBucketCorsRequest, callback: Callback[js.Object]): Unit = js.native
    def putBucketCors(params: PutBucketCorsRequest): Request[js.Object] = js.native
    def putBucketLifecycle(params: PutBucketLifecycleRequest, callback: Callback[js.Object]): Unit = js.native
    def putBucketLifecycle(params: PutBucketLifecycleRequest): Request[js.Object] = js.native
    def putBucketLogging(params: PutBucketLoggingRequest, callback: Callback[js.Object]): Unit = js.native
    def putBucketLogging(params: PutBucketLoggingRequest): Request[js.Object] = js.native
    def putBucketNotification(params: PutBucketNotificationRequest, callback: Callback[js.Object]): Unit = js.native
    def putBucketNotification(params: PutBucketNotificationRequest): Request[js.Object] = js.native
    def putBucketNotificationConfiguration(params: PutBucketNotificationConfigurationRequest, callback: Callback[js.Object]): Unit = js.native
    def putBucketNotificationConfiguration(params: PutBucketNotificationConfigurationRequest): Request[js.Object] = js.native
    def putBucketPolicy(params: PutBucketPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def putBucketPolicy(params: PutBucketPolicyRequest): Request[js.Object] = js.native
    def putBucketReplication(params: PutBucketReplicationRequest, callback: Callback[js.Object]): Unit = js.native
    def putBucketReplication(params: PutBucketReplicationRequest): Request[js.Object] = js.native
    def putBucketRequestPayment(params: PutBucketRequestPaymentRequest, callback: Callback[js.Object]): Unit = js.native
    def putBucketRequestPayment(params: PutBucketRequestPaymentRequest): Request[js.Object] = js.native
    def putBucketTagging(params: PutBucketTaggingRequest, callback: Callback[js.Object]): Unit = js.native
    def putBucketTagging(params: PutBucketTaggingRequest): Request[js.Object] = js.native
    def putBucketVersioning(params: PutBucketVersioningRequest, callback: Callback[js.Object]): Unit = js.native
    def putBucketVersioning(params: PutBucketVersioningRequest): Request[js.Object] = js.native
    def putBucketWebsite(params: PutBucketWebsiteRequest, callback: Callback[js.Object]): Unit = js.native
    def putBucketWebsite(params: PutBucketWebsiteRequest): Request[js.Object] = js.native
    def putObject(params: PutObjectRequest, callback: Callback[PutObjectOutput]): Unit = js.native
    def putObject(params: PutObjectRequest): Request[PutObjectOutput] = js.native
    def putObjectAcl(params: PutObjectAclRequest, callback: Callback[PutObjectAclOutput]): Unit = js.native
    def putObjectAcl(params: PutObjectAclRequest): Request[PutObjectAclOutput] = js.native
    def restoreObject(params: RestoreObjectRequest, callback: Callback[RestoreObjectOutput]): Unit = js.native
    def restoreObject(params: RestoreObjectRequest): Request[RestoreObjectOutput] = js.native
    def uploadPart(params: UploadPartRequest, callback: Callback[UploadPartOutput]): Unit = js.native
    def uploadPart(params: UploadPartRequest): Request[UploadPartOutput] = js.native
    def uploadPartCopy(params: UploadPartCopyRequest, callback: Callback[UploadPartCopyOutput]): Unit = js.native
    def uploadPartCopy(params: UploadPartCopyRequest): Request[UploadPartCopyOutput] = js.native
  }

  @js.native
  trait AbortMultipartUploadOutput extends js.Object {
    var RequestCharged: RequestCharged
  }

  object AbortMultipartUploadOutput {
    def apply(
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): AbortMultipartUploadOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortMultipartUploadOutput]
    }
  }

  @js.native
  trait AbortMultipartUploadRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var UploadId: MultipartUploadId
    var RequestPayer: RequestPayer
  }

  object AbortMultipartUploadRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    ): AbortMultipartUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any }),
        ("UploadId" -> UploadId.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortMultipartUploadRequest]
    }
  }

  @js.native
  trait AccessControlPolicy extends js.Object {
    var Grants: Grants
    var Owner: Owner
  }

  object AccessControlPolicy {
    def apply(
      Grants: js.UndefOr[Grants] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined
    ): AccessControlPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Grants" -> Grants.map { x => x: js.Any }),
        ("Owner" -> Owner.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessControlPolicy]
    }
  }

  @js.native
  trait Bucket extends js.Object {
    var Name: BucketName
    var CreationDate: CreationDate
  }

  object Bucket {
    def apply(
      Name: js.UndefOr[BucketName] = js.undefined,
      CreationDate: js.UndefOr[CreationDate] = js.undefined
    ): Bucket = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("CreationDate" -> CreationDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Bucket]
    }
  }

  /**
   * The requested bucket name is not available. The bucket namespace is shared by all users of the system. Please select a different name and try again.
   */
  @js.native
  trait BucketAlreadyExistsException extends js.Object {

  }


  object BucketCannedACLEnum {
    val `private` = "private"
    val `public-read` = "public-read"
    val `public-read-write` = "public-read-write"
    val `authenticated-read` = "authenticated-read"

    val values = IndexedSeq(`private`, `public-read`, `public-read-write`, `authenticated-read`)
  }


  object BucketLocationConstraintEnum {
    val EU = "EU"
    val `eu-west-1` = "eu-west-1"
    val `us-west-1` = "us-west-1"
    val `us-west-2` = "us-west-2"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `sa-east-1` = "sa-east-1"
    val `cn-north-1` = "cn-north-1"
    val `eu-central-1` = "eu-central-1"

    val values = IndexedSeq(EU, `eu-west-1`, `us-west-1`, `us-west-2`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `sa-east-1`, `cn-north-1`, `eu-central-1`)
  }

  @js.native
  trait BucketLoggingStatus extends js.Object {
    var LoggingEnabled: LoggingEnabled
  }

  object BucketLoggingStatus {
    def apply(
      LoggingEnabled: js.UndefOr[LoggingEnabled] = js.undefined
    ): BucketLoggingStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoggingEnabled" -> LoggingEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BucketLoggingStatus]
    }
  }


  object BucketLogsPermissionEnum {
    val `FULL_CONTROL` = "FULL_CONTROL"
    val READ = "READ"
    val WRITE = "WRITE"

    val values = IndexedSeq(`FULL_CONTROL`, READ, WRITE)
  }


  object BucketVersioningStatusEnum {
    val Enabled = "Enabled"
    val Suspended = "Suspended"

    val values = IndexedSeq(Enabled, Suspended)
  }

  @js.native
  trait CORSConfiguration extends js.Object {
    var CORSRules: CORSRules
  }

  object CORSConfiguration {
    def apply(
      CORSRules: js.UndefOr[CORSRules] = js.undefined
    ): CORSConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CORSRules" -> CORSRules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CORSConfiguration]
    }
  }

  @js.native
  trait CORSRule extends js.Object {
    var ExposeHeaders: ExposeHeaders
    var AllowedHeaders: AllowedHeaders
    var MaxAgeSeconds: MaxAgeSeconds
    var AllowedMethods: AllowedMethods
    var AllowedOrigins: AllowedOrigins
  }

  object CORSRule {
    def apply(
      ExposeHeaders: js.UndefOr[ExposeHeaders] = js.undefined,
      AllowedHeaders: js.UndefOr[AllowedHeaders] = js.undefined,
      MaxAgeSeconds: js.UndefOr[MaxAgeSeconds] = js.undefined,
      AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
      AllowedOrigins: js.UndefOr[AllowedOrigins] = js.undefined
    ): CORSRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExposeHeaders" -> ExposeHeaders.map { x => x: js.Any }),
        ("AllowedHeaders" -> AllowedHeaders.map { x => x: js.Any }),
        ("MaxAgeSeconds" -> MaxAgeSeconds.map { x => x: js.Any }),
        ("AllowedMethods" -> AllowedMethods.map { x => x: js.Any }),
        ("AllowedOrigins" -> AllowedOrigins.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CORSRule]
    }
  }

  @js.native
  trait CloudFunctionConfiguration extends js.Object {
    var Id: NotificationId
    var Event: Event
    var InvocationRole: CloudFunctionInvocationRole
    var Events: EventList
    var CloudFunction: CloudFunction
  }

  object CloudFunctionConfiguration {
    def apply(
      Id: js.UndefOr[NotificationId] = js.undefined,
      Event: js.UndefOr[Event] = js.undefined,
      InvocationRole: js.UndefOr[CloudFunctionInvocationRole] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined,
      CloudFunction: js.UndefOr[CloudFunction] = js.undefined
    ): CloudFunctionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Event" -> Event.map { x => x: js.Any }),
        ("InvocationRole" -> InvocationRole.map { x => x: js.Any }),
        ("Events" -> Events.map { x => x: js.Any }),
        ("CloudFunction" -> CloudFunction.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudFunctionConfiguration]
    }
  }

  @js.native
  trait CommonPrefix extends js.Object {
    var Prefix: Prefix
  }

  object CommonPrefix {
    def apply(
      Prefix: js.UndefOr[Prefix] = js.undefined
    ): CommonPrefix = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Prefix" -> Prefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CommonPrefix]
    }
  }

  @js.native
  trait CompleteMultipartUploadOutput extends js.Object {
    var Bucket: BucketName
    var Location: Location
    var SSEKMSKeyId: SSEKMSKeyId
    var ServerSideEncryption: ServerSideEncryption
    var VersionId: ObjectVersionId
    var Expiration: Expiration
    var ETag: ETag
    var RequestCharged: RequestCharged
    var Key: ObjectKey
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
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): CompleteMultipartUploadOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Location" -> Location.map { x => x: js.Any }),
        ("SSEKMSKeyId" -> SSEKMSKeyId.map { x => x: js.Any }),
        ("ServerSideEncryption" -> ServerSideEncryption.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("Expiration" -> Expiration.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteMultipartUploadOutput]
    }
  }

  @js.native
  trait CompleteMultipartUploadRequest extends js.Object {
    var Bucket: BucketName
    var MultipartUpload: CompletedMultipartUpload
    var RequestPayer: RequestPayer
    var UploadId: MultipartUploadId
    var Key: ObjectKey
  }

  object CompleteMultipartUploadRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      MultipartUpload: js.UndefOr[CompletedMultipartUpload] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): CompleteMultipartUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("MultipartUpload" -> MultipartUpload.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any }),
        ("UploadId" -> UploadId.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteMultipartUploadRequest]
    }
  }

  @js.native
  trait CompletedMultipartUpload extends js.Object {
    var Parts: CompletedPartList
  }

  object CompletedMultipartUpload {
    def apply(
      Parts: js.UndefOr[CompletedPartList] = js.undefined
    ): CompletedMultipartUpload = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Parts" -> Parts.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompletedMultipartUpload]
    }
  }

  @js.native
  trait CompletedPart extends js.Object {
    var ETag: ETag
    var PartNumber: PartNumber
  }

  object CompletedPart {
    def apply(
      ETag: js.UndefOr[ETag] = js.undefined,
      PartNumber: js.UndefOr[PartNumber] = js.undefined
    ): CompletedPart = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ETag" -> ETag.map { x => x: js.Any }),
        ("PartNumber" -> PartNumber.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompletedPart]
    }
  }

  @js.native
  trait Condition extends js.Object {
    var HttpErrorCodeReturnedEquals: HttpErrorCodeReturnedEquals
    var KeyPrefixEquals: KeyPrefixEquals
  }

  object Condition {
    def apply(
      HttpErrorCodeReturnedEquals: js.UndefOr[HttpErrorCodeReturnedEquals] = js.undefined,
      KeyPrefixEquals: js.UndefOr[KeyPrefixEquals] = js.undefined
    ): Condition = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HttpErrorCodeReturnedEquals" -> HttpErrorCodeReturnedEquals.map { x => x: js.Any }),
        ("KeyPrefixEquals" -> KeyPrefixEquals.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Condition]
    }
  }

  @js.native
  trait CopyObjectOutput extends js.Object {
    var CopySourceVersionId: CopySourceVersionId
    var SSEKMSKeyId: SSEKMSKeyId
    var ServerSideEncryption: ServerSideEncryption
    var CopyObjectResult: CopyObjectResult
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var Expiration: Expiration
    var RequestCharged: RequestCharged
  }

  object CopyObjectOutput {
    def apply(
      CopySourceVersionId: js.UndefOr[CopySourceVersionId] = js.undefined,
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      CopyObjectResult: js.UndefOr[CopyObjectResult] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      Expiration: js.UndefOr[Expiration] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): CopyObjectOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CopySourceVersionId" -> CopySourceVersionId.map { x => x: js.Any }),
        ("SSEKMSKeyId" -> SSEKMSKeyId.map { x => x: js.Any }),
        ("ServerSideEncryption" -> ServerSideEncryption.map { x => x: js.Any }),
        ("CopyObjectResult" -> CopyObjectResult.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("Expiration" -> Expiration.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyObjectOutput]
    }
  }

  @js.native
  trait CopyObjectRequest extends js.Object {
    var Bucket: BucketName
    var Metadata: Metadata
    var CopySource: CopySource
    var CopySourceIfModifiedSince: CopySourceIfModifiedSince
    var CopySourceIfNoneMatch: CopySourceIfNoneMatch
    var CopySourceSSECustomerKey: CopySourceSSECustomerKey
    var SSEKMSKeyId: SSEKMSKeyId
    var GrantFullControl: GrantFullControl
    var ServerSideEncryption: ServerSideEncryption
    var GrantWriteACP: GrantWriteACP
    var ContentEncoding: ContentEncoding
    var ACL: ObjectCannedACL
    var Expires: Expires
    var CopySourceIfMatch: CopySourceIfMatch
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var RequestPayer: RequestPayer
    var CopySourceIfUnmodifiedSince: CopySourceIfUnmodifiedSince
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var MetadataDirective: MetadataDirective
    var GrantReadACP: GrantReadACP
    var ContentLanguage: ContentLanguage
    var ContentDisposition: ContentDisposition
    var GrantRead: GrantRead
    var WebsiteRedirectLocation: WebsiteRedirectLocation
    var CacheControl: CacheControl
    var ContentType: ContentType
    var CopySourceSSECustomerAlgorithm: CopySourceSSECustomerAlgorithm
    var CopySourceSSECustomerKeyMD5: CopySourceSSECustomerKeyMD5
    var StorageClass: StorageClass
    var Key: ObjectKey
    var SSECustomerKey: SSECustomerKey
  }

  object CopyObjectRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Metadata: js.UndefOr[Metadata] = js.undefined,
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
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    ): CopyObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Metadata" -> Metadata.map { x => x: js.Any }),
        ("CopySource" -> CopySource.map { x => x: js.Any }),
        ("CopySourceIfModifiedSince" -> CopySourceIfModifiedSince.map { x => x: js.Any }),
        ("CopySourceIfNoneMatch" -> CopySourceIfNoneMatch.map { x => x: js.Any }),
        ("CopySourceSSECustomerKey" -> CopySourceSSECustomerKey.map { x => x: js.Any }),
        ("SSEKMSKeyId" -> SSEKMSKeyId.map { x => x: js.Any }),
        ("GrantFullControl" -> GrantFullControl.map { x => x: js.Any }),
        ("ServerSideEncryption" -> ServerSideEncryption.map { x => x: js.Any }),
        ("GrantWriteACP" -> GrantWriteACP.map { x => x: js.Any }),
        ("ContentEncoding" -> ContentEncoding.map { x => x: js.Any }),
        ("ACL" -> ACL.map { x => x: js.Any }),
        ("Expires" -> Expires.map { x => x: js.Any }),
        ("CopySourceIfMatch" -> CopySourceIfMatch.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any }),
        ("CopySourceIfUnmodifiedSince" -> CopySourceIfUnmodifiedSince.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("MetadataDirective" -> MetadataDirective.map { x => x: js.Any }),
        ("GrantReadACP" -> GrantReadACP.map { x => x: js.Any }),
        ("ContentLanguage" -> ContentLanguage.map { x => x: js.Any }),
        ("ContentDisposition" -> ContentDisposition.map { x => x: js.Any }),
        ("GrantRead" -> GrantRead.map { x => x: js.Any }),
        ("WebsiteRedirectLocation" -> WebsiteRedirectLocation.map { x => x: js.Any }),
        ("CacheControl" -> CacheControl.map { x => x: js.Any }),
        ("ContentType" -> ContentType.map { x => x: js.Any }),
        ("CopySourceSSECustomerAlgorithm" -> CopySourceSSECustomerAlgorithm.map { x => x: js.Any }),
        ("CopySourceSSECustomerKeyMD5" -> CopySourceSSECustomerKeyMD5.map { x => x: js.Any }),
        ("StorageClass" -> StorageClass.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any }),
        ("SSECustomerKey" -> SSECustomerKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyObjectRequest]
    }
  }

  @js.native
  trait CopyObjectResult extends js.Object {
    var ETag: ETag
    var LastModified: LastModified
  }

  object CopyObjectResult {
    def apply(
      ETag: js.UndefOr[ETag] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined
    ): CopyObjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ETag" -> ETag.map { x => x: js.Any }),
        ("LastModified" -> LastModified.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyObjectResult]
    }
  }

  @js.native
  trait CopyPartResult extends js.Object {
    var ETag: ETag
    var LastModified: LastModified
  }

  object CopyPartResult {
    def apply(
      ETag: js.UndefOr[ETag] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined
    ): CopyPartResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ETag" -> ETag.map { x => x: js.Any }),
        ("LastModified" -> LastModified.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyPartResult]
    }
  }

  @js.native
  trait CreateBucketConfiguration extends js.Object {
    var LocationConstraint: BucketLocationConstraint
  }

  object CreateBucketConfiguration {
    def apply(
      LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined
    ): CreateBucketConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LocationConstraint" -> LocationConstraint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBucketConfiguration]
    }
  }

  @js.native
  trait CreateBucketOutput extends js.Object {
    var Location: Location
  }

  object CreateBucketOutput {
    def apply(
      Location: js.UndefOr[Location] = js.undefined
    ): CreateBucketOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Location" -> Location.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBucketOutput]
    }
  }

  @js.native
  trait CreateBucketRequest extends js.Object {
    var Bucket: BucketName
    var GrantWrite: GrantWrite
    var CreateBucketConfiguration: CreateBucketConfiguration
    var GrantFullControl: GrantFullControl
    var GrantWriteACP: GrantWriteACP
    var ACL: BucketCannedACL
    var GrantReadACP: GrantReadACP
    var GrantRead: GrantRead
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
      GrantRead: js.UndefOr[GrantRead] = js.undefined
    ): CreateBucketRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("GrantWrite" -> GrantWrite.map { x => x: js.Any }),
        ("CreateBucketConfiguration" -> CreateBucketConfiguration.map { x => x: js.Any }),
        ("GrantFullControl" -> GrantFullControl.map { x => x: js.Any }),
        ("GrantWriteACP" -> GrantWriteACP.map { x => x: js.Any }),
        ("ACL" -> ACL.map { x => x: js.Any }),
        ("GrantReadACP" -> GrantReadACP.map { x => x: js.Any }),
        ("GrantRead" -> GrantRead.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBucketRequest]
    }
  }

  @js.native
  trait CreateMultipartUploadOutput extends js.Object {
    var Bucket: BucketName
    var SSEKMSKeyId: SSEKMSKeyId
    var ServerSideEncryption: ServerSideEncryption
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var RequestCharged: RequestCharged
    var UploadId: MultipartUploadId
    var Key: ObjectKey
  }

  object CreateMultipartUploadOutput {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): CreateMultipartUploadOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("SSEKMSKeyId" -> SSEKMSKeyId.map { x => x: js.Any }),
        ("ServerSideEncryption" -> ServerSideEncryption.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any }),
        ("UploadId" -> UploadId.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMultipartUploadOutput]
    }
  }

  @js.native
  trait CreateMultipartUploadRequest extends js.Object {
    var Bucket: BucketName
    var Metadata: Metadata
    var SSEKMSKeyId: SSEKMSKeyId
    var GrantFullControl: GrantFullControl
    var ServerSideEncryption: ServerSideEncryption
    var GrantWriteACP: GrantWriteACP
    var ContentEncoding: ContentEncoding
    var ACL: ObjectCannedACL
    var Expires: Expires
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var RequestPayer: RequestPayer
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var GrantReadACP: GrantReadACP
    var ContentLanguage: ContentLanguage
    var ContentDisposition: ContentDisposition
    var GrantRead: GrantRead
    var WebsiteRedirectLocation: WebsiteRedirectLocation
    var CacheControl: CacheControl
    var ContentType: ContentType
    var StorageClass: StorageClass
    var Key: ObjectKey
    var SSECustomerKey: SSECustomerKey
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
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    ): CreateMultipartUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Metadata" -> Metadata.map { x => x: js.Any }),
        ("SSEKMSKeyId" -> SSEKMSKeyId.map { x => x: js.Any }),
        ("GrantFullControl" -> GrantFullControl.map { x => x: js.Any }),
        ("ServerSideEncryption" -> ServerSideEncryption.map { x => x: js.Any }),
        ("GrantWriteACP" -> GrantWriteACP.map { x => x: js.Any }),
        ("ContentEncoding" -> ContentEncoding.map { x => x: js.Any }),
        ("ACL" -> ACL.map { x => x: js.Any }),
        ("Expires" -> Expires.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("GrantReadACP" -> GrantReadACP.map { x => x: js.Any }),
        ("ContentLanguage" -> ContentLanguage.map { x => x: js.Any }),
        ("ContentDisposition" -> ContentDisposition.map { x => x: js.Any }),
        ("GrantRead" -> GrantRead.map { x => x: js.Any }),
        ("WebsiteRedirectLocation" -> WebsiteRedirectLocation.map { x => x: js.Any }),
        ("CacheControl" -> CacheControl.map { x => x: js.Any }),
        ("ContentType" -> ContentType.map { x => x: js.Any }),
        ("StorageClass" -> StorageClass.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any }),
        ("SSECustomerKey" -> SSECustomerKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMultipartUploadRequest]
    }
  }

  @js.native
  trait Delete extends js.Object {
    var Objects: ObjectIdentifierList
    var Quiet: Quiet
  }

  object Delete {
    def apply(
      Objects: js.UndefOr[ObjectIdentifierList] = js.undefined,
      Quiet: js.UndefOr[Quiet] = js.undefined
    ): Delete = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Objects" -> Objects.map { x => x: js.Any }),
        ("Quiet" -> Quiet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Delete]
    }
  }

  @js.native
  trait DeleteBucketCorsRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketCorsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): DeleteBucketCorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketCorsRequest]
    }
  }

  @js.native
  trait DeleteBucketLifecycleRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketLifecycleRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): DeleteBucketLifecycleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketLifecycleRequest]
    }
  }

  @js.native
  trait DeleteBucketPolicyRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketPolicyRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): DeleteBucketPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketPolicyRequest]
    }
  }

  @js.native
  trait DeleteBucketReplicationRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketReplicationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): DeleteBucketReplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketReplicationRequest]
    }
  }

  @js.native
  trait DeleteBucketRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): DeleteBucketRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketRequest]
    }
  }

  @js.native
  trait DeleteBucketTaggingRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketTaggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): DeleteBucketTaggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketTaggingRequest]
    }
  }

  @js.native
  trait DeleteBucketWebsiteRequest extends js.Object {
    var Bucket: BucketName
  }

  object DeleteBucketWebsiteRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): DeleteBucketWebsiteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBucketWebsiteRequest]
    }
  }

  @js.native
  trait DeleteMarkerEntry extends js.Object {
    var LastModified: LastModified
    var IsLatest: IsLatest
    var VersionId: ObjectVersionId
    var Owner: Owner
    var Key: ObjectKey
  }

  object DeleteMarkerEntry {
    def apply(
      LastModified: js.UndefOr[LastModified] = js.undefined,
      IsLatest: js.UndefOr[IsLatest] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): DeleteMarkerEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastModified" -> LastModified.map { x => x: js.Any }),
        ("IsLatest" -> IsLatest.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("Owner" -> Owner.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMarkerEntry]
    }
  }

  @js.native
  trait DeleteObjectOutput extends js.Object {
    var DeleteMarker: DeleteMarker
    var VersionId: ObjectVersionId
    var RequestCharged: RequestCharged
  }

  object DeleteObjectOutput {
    def apply(
      DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): DeleteObjectOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeleteMarker" -> DeleteMarker.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectOutput]
    }
  }

  @js.native
  trait DeleteObjectRequest extends js.Object {
    var Bucket: BucketName
    var RequestPayer: RequestPayer
    var VersionId: ObjectVersionId
    var MFA: MFA
    var Key: ObjectKey
  }

  object DeleteObjectRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      MFA: js.UndefOr[MFA] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): DeleteObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("MFA" -> MFA.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectRequest]
    }
  }

  @js.native
  trait DeleteObjectsOutput extends js.Object {
    var Deleted: DeletedObjects
    var RequestCharged: RequestCharged
    var Errors: Errors
  }

  object DeleteObjectsOutput {
    def apply(
      Deleted: js.UndefOr[DeletedObjects] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
      Errors: js.UndefOr[Errors] = js.undefined
    ): DeleteObjectsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Deleted" -> Deleted.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any }),
        ("Errors" -> Errors.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectsOutput]
    }
  }

  @js.native
  trait DeleteObjectsRequest extends js.Object {
    var Bucket: BucketName
    var Delete: Delete
    var MFA: MFA
    var RequestPayer: RequestPayer
  }

  object DeleteObjectsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Delete: js.UndefOr[Delete] = js.undefined,
      MFA: js.UndefOr[MFA] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    ): DeleteObjectsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Delete" -> Delete.map { x => x: js.Any }),
        ("MFA" -> MFA.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectsRequest]
    }
  }

  @js.native
  trait DeletedObject extends js.Object {
    var Key: ObjectKey
    var VersionId: ObjectVersionId
    var DeleteMarker: DeleteMarker
    var DeleteMarkerVersionId: DeleteMarkerVersionId
  }

  object DeletedObject {
    def apply(
      Key: js.UndefOr[ObjectKey] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined,
      DeleteMarkerVersionId: js.UndefOr[DeleteMarkerVersionId] = js.undefined
    ): DeletedObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("DeleteMarker" -> DeleteMarker.map { x => x: js.Any }),
        ("DeleteMarkerVersionId" -> DeleteMarkerVersionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletedObject]
    }
  }

  @js.native
  trait Destination extends js.Object {
    var Bucket: BucketName
  }

  object Destination {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }

  /**
   * Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request that Amazon S3 encode the keys in the response.
   */
  object EncodingTypeEnum {
    val url = "url"

    val values = IndexedSeq(url)
  }

  @js.native
  trait Error extends js.Object {
    var Key: ObjectKey
    var VersionId: ObjectVersionId
    var Code: Code
    var Message: Message
  }

  object Error {
    def apply(
      Key: js.UndefOr[ObjectKey] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      Code: js.UndefOr[Code] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined
    ): Error = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Error]
    }
  }

  @js.native
  trait ErrorDocument extends js.Object {
    var Key: ObjectKey
  }

  object ErrorDocument {
    def apply(
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): ErrorDocument = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorDocument]
    }
  }

  /**
   * Bucket event for which to send notifications.
   */
  object EventEnum {
    val `s3:ReducedRedundancyLostObject` = "s3:ReducedRedundancyLostObject"
    val `s3:ObjectCreated:Put` = "s3:ObjectCreated:Put"
    val `s3:ObjectCreated:Post` = "s3:ObjectCreated:Post"
    val `s3:ObjectCreated:Copy` = "s3:ObjectCreated:Copy"
    val `s3:ObjectCreated:CompleteMultipartUpload` = "s3:ObjectCreated:CompleteMultipartUpload"

    val values = IndexedSeq(`s3:ReducedRedundancyLostObject`, `s3:ObjectCreated:Put`, `s3:ObjectCreated:Post`, `s3:ObjectCreated:Copy`, `s3:ObjectCreated:CompleteMultipartUpload`)
  }


  object ExpirationStatusEnum {
    val Enabled = "Enabled"
    val Disabled = "Disabled"

    val values = IndexedSeq(Enabled, Disabled)
  }

  @js.native
  trait GetBucketAclOutput extends js.Object {
    var Owner: Owner
    var Grants: Grants
  }

  object GetBucketAclOutput {
    def apply(
      Owner: js.UndefOr[Owner] = js.undefined,
      Grants: js.UndefOr[Grants] = js.undefined
    ): GetBucketAclOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Owner" -> Owner.map { x => x: js.Any }),
        ("Grants" -> Grants.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketAclOutput]
    }
  }

  @js.native
  trait GetBucketAclRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketAclRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): GetBucketAclRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketAclRequest]
    }
  }

  @js.native
  trait GetBucketCorsOutput extends js.Object {
    var CORSRules: CORSRules
  }

  object GetBucketCorsOutput {
    def apply(
      CORSRules: js.UndefOr[CORSRules] = js.undefined
    ): GetBucketCorsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CORSRules" -> CORSRules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketCorsOutput]
    }
  }

  @js.native
  trait GetBucketCorsRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketCorsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): GetBucketCorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketCorsRequest]
    }
  }

  @js.native
  trait GetBucketLifecycleOutput extends js.Object {
    var Rules: Rules
  }

  object GetBucketLifecycleOutput {
    def apply(
      Rules: js.UndefOr[Rules] = js.undefined
    ): GetBucketLifecycleOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Rules" -> Rules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLifecycleOutput]
    }
  }

  @js.native
  trait GetBucketLifecycleRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketLifecycleRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): GetBucketLifecycleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLifecycleRequest]
    }
  }

  @js.native
  trait GetBucketLocationOutput extends js.Object {
    var LocationConstraint: BucketLocationConstraint
  }

  object GetBucketLocationOutput {
    def apply(
      LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined
    ): GetBucketLocationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LocationConstraint" -> LocationConstraint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLocationOutput]
    }
  }

  @js.native
  trait GetBucketLocationRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketLocationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): GetBucketLocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLocationRequest]
    }
  }

  @js.native
  trait GetBucketLoggingOutput extends js.Object {
    var LoggingEnabled: LoggingEnabled
  }

  object GetBucketLoggingOutput {
    def apply(
      LoggingEnabled: js.UndefOr[LoggingEnabled] = js.undefined
    ): GetBucketLoggingOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoggingEnabled" -> LoggingEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLoggingOutput]
    }
  }

  @js.native
  trait GetBucketLoggingRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketLoggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): GetBucketLoggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketLoggingRequest]
    }
  }

  @js.native
  trait GetBucketNotificationConfigurationRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketNotificationConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): GetBucketNotificationConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketNotificationConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketPolicyOutput extends js.Object {
    var Policy: Policy
  }

  object GetBucketPolicyOutput {
    def apply(
      Policy: js.UndefOr[Policy] = js.undefined
    ): GetBucketPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Policy" -> Policy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketPolicyOutput]
    }
  }

  @js.native
  trait GetBucketPolicyRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketPolicyRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): GetBucketPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketPolicyRequest]
    }
  }

  @js.native
  trait GetBucketReplicationOutput extends js.Object {
    var ReplicationConfiguration: ReplicationConfiguration
  }

  object GetBucketReplicationOutput {
    def apply(
      ReplicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.undefined
    ): GetBucketReplicationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReplicationConfiguration" -> ReplicationConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketReplicationOutput]
    }
  }

  @js.native
  trait GetBucketReplicationRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketReplicationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): GetBucketReplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketReplicationRequest]
    }
  }

  @js.native
  trait GetBucketRequestPaymentOutput extends js.Object {
    var Payer: Payer
  }

  object GetBucketRequestPaymentOutput {
    def apply(
      Payer: js.UndefOr[Payer] = js.undefined
    ): GetBucketRequestPaymentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Payer" -> Payer.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketRequestPaymentOutput]
    }
  }

  @js.native
  trait GetBucketRequestPaymentRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketRequestPaymentRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): GetBucketRequestPaymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketRequestPaymentRequest]
    }
  }

  @js.native
  trait GetBucketTaggingOutput extends js.Object {
    var TagSet: TagSet
  }

  object GetBucketTaggingOutput {
    def apply(
      TagSet: js.UndefOr[TagSet] = js.undefined
    ): GetBucketTaggingOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TagSet" -> TagSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketTaggingOutput]
    }
  }

  @js.native
  trait GetBucketTaggingRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketTaggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): GetBucketTaggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketTaggingRequest]
    }
  }

  @js.native
  trait GetBucketVersioningOutput extends js.Object {
    var Status: BucketVersioningStatus
    var MFADelete: MFADeleteStatus
  }

  object GetBucketVersioningOutput {
    def apply(
      Status: js.UndefOr[BucketVersioningStatus] = js.undefined,
      MFADelete: js.UndefOr[MFADeleteStatus] = js.undefined
    ): GetBucketVersioningOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any }),
        ("MFADelete" -> MFADelete.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketVersioningOutput]
    }
  }

  @js.native
  trait GetBucketVersioningRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketVersioningRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): GetBucketVersioningRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketVersioningRequest]
    }
  }

  @js.native
  trait GetBucketWebsiteOutput extends js.Object {
    var RedirectAllRequestsTo: RedirectAllRequestsTo
    var IndexDocument: IndexDocument
    var ErrorDocument: ErrorDocument
    var RoutingRules: RoutingRules
  }

  object GetBucketWebsiteOutput {
    def apply(
      RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo] = js.undefined,
      IndexDocument: js.UndefOr[IndexDocument] = js.undefined,
      ErrorDocument: js.UndefOr[ErrorDocument] = js.undefined,
      RoutingRules: js.UndefOr[RoutingRules] = js.undefined
    ): GetBucketWebsiteOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RedirectAllRequestsTo" -> RedirectAllRequestsTo.map { x => x: js.Any }),
        ("IndexDocument" -> IndexDocument.map { x => x: js.Any }),
        ("ErrorDocument" -> ErrorDocument.map { x => x: js.Any }),
        ("RoutingRules" -> RoutingRules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketWebsiteOutput]
    }
  }

  @js.native
  trait GetBucketWebsiteRequest extends js.Object {
    var Bucket: BucketName
  }

  object GetBucketWebsiteRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): GetBucketWebsiteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBucketWebsiteRequest]
    }
  }

  @js.native
  trait GetObjectAclOutput extends js.Object {
    var Owner: Owner
    var Grants: Grants
    var RequestCharged: RequestCharged
  }

  object GetObjectAclOutput {
    def apply(
      Owner: js.UndefOr[Owner] = js.undefined,
      Grants: js.UndefOr[Grants] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): GetObjectAclOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Owner" -> Owner.map { x => x: js.Any }),
        ("Grants" -> Grants.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectAclOutput]
    }
  }

  @js.native
  trait GetObjectAclRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var VersionId: ObjectVersionId
    var RequestPayer: RequestPayer
  }

  object GetObjectAclRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    ): GetObjectAclRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectAclRequest]
    }
  }

  @js.native
  trait GetObjectOutput extends js.Object {
    var Metadata: Metadata
    var Restore: Restore
    var SSEKMSKeyId: SSEKMSKeyId
    var ReplicationStatus: ReplicationStatus
    var ServerSideEncryption: ServerSideEncryption
    var MissingMeta: MissingMeta
    var ContentEncoding: ContentEncoding
    var Expires: Expires
    var LastModified: LastModified
    var DeleteMarker: DeleteMarker
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var Body: Body
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var VersionId: ObjectVersionId
    var ContentLength: ContentLength
    var Expiration: Expiration
    var ContentLanguage: ContentLanguage
    var ContentDisposition: ContentDisposition
    var AcceptRanges: AcceptRanges
    var WebsiteRedirectLocation: WebsiteRedirectLocation
    var CacheControl: CacheControl
    var ETag: ETag
    var RequestCharged: RequestCharged
    var ContentType: ContentType
  }

  object GetObjectOutput {
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
      Body: js.UndefOr[Body] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
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
      ContentType: js.UndefOr[ContentType] = js.undefined
    ): GetObjectOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Metadata" -> Metadata.map { x => x: js.Any }),
        ("Restore" -> Restore.map { x => x: js.Any }),
        ("SSEKMSKeyId" -> SSEKMSKeyId.map { x => x: js.Any }),
        ("ReplicationStatus" -> ReplicationStatus.map { x => x: js.Any }),
        ("ServerSideEncryption" -> ServerSideEncryption.map { x => x: js.Any }),
        ("MissingMeta" -> MissingMeta.map { x => x: js.Any }),
        ("ContentEncoding" -> ContentEncoding.map { x => x: js.Any }),
        ("Expires" -> Expires.map { x => x: js.Any }),
        ("LastModified" -> LastModified.map { x => x: js.Any }),
        ("DeleteMarker" -> DeleteMarker.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("Body" -> Body.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("ContentLength" -> ContentLength.map { x => x: js.Any }),
        ("Expiration" -> Expiration.map { x => x: js.Any }),
        ("ContentLanguage" -> ContentLanguage.map { x => x: js.Any }),
        ("ContentDisposition" -> ContentDisposition.map { x => x: js.Any }),
        ("AcceptRanges" -> AcceptRanges.map { x => x: js.Any }),
        ("WebsiteRedirectLocation" -> WebsiteRedirectLocation.map { x => x: js.Any }),
        ("CacheControl" -> CacheControl.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any }),
        ("ContentType" -> ContentType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectOutput]
    }
  }

  @js.native
  trait GetObjectRequest extends js.Object {
    var Bucket: BucketName
    var ResponseCacheControl: ResponseCacheControl
    var ResponseContentDisposition: ResponseContentDisposition
    var IfUnmodifiedSince: IfUnmodifiedSince
    var ResponseContentEncoding: ResponseContentEncoding
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var RequestPayer: RequestPayer
    var IfMatch: IfMatch
    var IfNoneMatch: IfNoneMatch
    var IfModifiedSince: IfModifiedSince
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var ResponseContentType: ResponseContentType
    var ResponseExpires: ResponseExpires
    var VersionId: ObjectVersionId
    var ResponseContentLanguage: ResponseContentLanguage
    var Range: Range
    var Key: ObjectKey
    var SSECustomerKey: SSECustomerKey
  }

  object GetObjectRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
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
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    ): GetObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("ResponseCacheControl" -> ResponseCacheControl.map { x => x: js.Any }),
        ("ResponseContentDisposition" -> ResponseContentDisposition.map { x => x: js.Any }),
        ("IfUnmodifiedSince" -> IfUnmodifiedSince.map { x => x: js.Any }),
        ("ResponseContentEncoding" -> ResponseContentEncoding.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any }),
        ("IfMatch" -> IfMatch.map { x => x: js.Any }),
        ("IfNoneMatch" -> IfNoneMatch.map { x => x: js.Any }),
        ("IfModifiedSince" -> IfModifiedSince.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("ResponseContentType" -> ResponseContentType.map { x => x: js.Any }),
        ("ResponseExpires" -> ResponseExpires.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("ResponseContentLanguage" -> ResponseContentLanguage.map { x => x: js.Any }),
        ("Range" -> Range.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any }),
        ("SSECustomerKey" -> SSECustomerKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectRequest]
    }
  }

  @js.native
  trait GetObjectTorrentOutput extends js.Object {
    var Body: Body
    var RequestCharged: RequestCharged
  }

  object GetObjectTorrentOutput {
    def apply(
      Body: js.UndefOr[Body] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): GetObjectTorrentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Body" -> Body.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectTorrentOutput]
    }
  }

  @js.native
  trait GetObjectTorrentRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: RequestPayer
  }

  object GetObjectTorrentRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    ): GetObjectTorrentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectTorrentRequest]
    }
  }

  @js.native
  trait Grant extends js.Object {
    var Grantee: Grantee
    var Permission: Permission
  }

  object Grant {
    def apply(
      Grantee: js.UndefOr[Grantee] = js.undefined,
      Permission: js.UndefOr[Permission] = js.undefined
    ): Grant = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Grantee" -> Grantee.map { x => x: js.Any }),
        ("Permission" -> Permission.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Grant]
    }
  }

  @js.native
  trait Grantee extends js.Object {
    var ID: ID
    var URI: URI
    var EmailAddress: EmailAddress
    var DisplayName: DisplayName
    var Type: Type
  }

  object Grantee {
    def apply(
      ID: js.UndefOr[ID] = js.undefined,
      URI: js.UndefOr[URI] = js.undefined,
      EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
      DisplayName: js.UndefOr[DisplayName] = js.undefined,
      Type: js.UndefOr[Type] = js.undefined
    ): Grantee = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ID" -> ID.map { x => x: js.Any }),
        ("URI" -> URI.map { x => x: js.Any }),
        ("EmailAddress" -> EmailAddress.map { x => x: js.Any }),
        ("DisplayName" -> DisplayName.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Grantee]
    }
  }

  @js.native
  trait HeadBucketRequest extends js.Object {
    var Bucket: BucketName
  }

  object HeadBucketRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined
    ): HeadBucketRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HeadBucketRequest]
    }
  }

  @js.native
  trait HeadObjectOutput extends js.Object {
    var Metadata: Metadata
    var Restore: Restore
    var SSEKMSKeyId: SSEKMSKeyId
    var ReplicationStatus: ReplicationStatus
    var ServerSideEncryption: ServerSideEncryption
    var MissingMeta: MissingMeta
    var ContentEncoding: ContentEncoding
    var Expires: Expires
    var LastModified: LastModified
    var DeleteMarker: DeleteMarker
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var VersionId: ObjectVersionId
    var ContentLength: ContentLength
    var Expiration: Expiration
    var ContentLanguage: ContentLanguage
    var ContentDisposition: ContentDisposition
    var AcceptRanges: AcceptRanges
    var WebsiteRedirectLocation: WebsiteRedirectLocation
    var CacheControl: CacheControl
    var ETag: ETag
    var RequestCharged: RequestCharged
    var ContentType: ContentType
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
      ContentType: js.UndefOr[ContentType] = js.undefined
    ): HeadObjectOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Metadata" -> Metadata.map { x => x: js.Any }),
        ("Restore" -> Restore.map { x => x: js.Any }),
        ("SSEKMSKeyId" -> SSEKMSKeyId.map { x => x: js.Any }),
        ("ReplicationStatus" -> ReplicationStatus.map { x => x: js.Any }),
        ("ServerSideEncryption" -> ServerSideEncryption.map { x => x: js.Any }),
        ("MissingMeta" -> MissingMeta.map { x => x: js.Any }),
        ("ContentEncoding" -> ContentEncoding.map { x => x: js.Any }),
        ("Expires" -> Expires.map { x => x: js.Any }),
        ("LastModified" -> LastModified.map { x => x: js.Any }),
        ("DeleteMarker" -> DeleteMarker.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("ContentLength" -> ContentLength.map { x => x: js.Any }),
        ("Expiration" -> Expiration.map { x => x: js.Any }),
        ("ContentLanguage" -> ContentLanguage.map { x => x: js.Any }),
        ("ContentDisposition" -> ContentDisposition.map { x => x: js.Any }),
        ("AcceptRanges" -> AcceptRanges.map { x => x: js.Any }),
        ("WebsiteRedirectLocation" -> WebsiteRedirectLocation.map { x => x: js.Any }),
        ("CacheControl" -> CacheControl.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any }),
        ("ContentType" -> ContentType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HeadObjectOutput]
    }
  }

  @js.native
  trait HeadObjectRequest extends js.Object {
    var Bucket: BucketName
    var IfUnmodifiedSince: IfUnmodifiedSince
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var RequestPayer: RequestPayer
    var IfMatch: IfMatch
    var IfNoneMatch: IfNoneMatch
    var IfModifiedSince: IfModifiedSince
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var VersionId: ObjectVersionId
    var Range: Range
    var Key: ObjectKey
    var SSECustomerKey: SSECustomerKey
  }

  object HeadObjectRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
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
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    ): HeadObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("IfUnmodifiedSince" -> IfUnmodifiedSince.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any }),
        ("IfMatch" -> IfMatch.map { x => x: js.Any }),
        ("IfNoneMatch" -> IfNoneMatch.map { x => x: js.Any }),
        ("IfModifiedSince" -> IfModifiedSince.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("Range" -> Range.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any }),
        ("SSECustomerKey" -> SSECustomerKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HeadObjectRequest]
    }
  }

  @js.native
  trait IndexDocument extends js.Object {
    var Suffix: Suffix
  }

  object IndexDocument {
    def apply(
      Suffix: js.UndefOr[Suffix] = js.undefined
    ): IndexDocument = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Suffix" -> Suffix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IndexDocument]
    }
  }

  @js.native
  trait Initiator extends js.Object {
    var ID: ID
    var DisplayName: DisplayName
  }

  object Initiator {
    def apply(
      ID: js.UndefOr[ID] = js.undefined,
      DisplayName: js.UndefOr[DisplayName] = js.undefined
    ): Initiator = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ID" -> ID.map { x => x: js.Any }),
        ("DisplayName" -> DisplayName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Initiator]
    }
  }

  /**
   * Container for specifying the AWS Lambda notification configuration.
   */
  @js.native
  trait LambdaFunctionConfiguration extends js.Object {
    var Id: NotificationId
    var LambdaFunctionArn: LambdaFunctionArn
    var Events: EventList
  }

  object LambdaFunctionConfiguration {
    def apply(
      Id: js.UndefOr[NotificationId] = js.undefined,
      LambdaFunctionArn: js.UndefOr[LambdaFunctionArn] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined
    ): LambdaFunctionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("LambdaFunctionArn" -> LambdaFunctionArn.map { x => x: js.Any }),
        ("Events" -> Events.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionConfiguration]
    }
  }

  @js.native
  trait LifecycleConfiguration extends js.Object {
    var Rules: Rules
  }

  object LifecycleConfiguration {
    def apply(
      Rules: js.UndefOr[Rules] = js.undefined
    ): LifecycleConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Rules" -> Rules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleConfiguration]
    }
  }

  @js.native
  trait LifecycleExpiration extends js.Object {
    var Date: Date
    var Days: Days
  }

  object LifecycleExpiration {
    def apply(
      Date: js.UndefOr[Date] = js.undefined,
      Days: js.UndefOr[Days] = js.undefined
    ): LifecycleExpiration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Date" -> Date.map { x => x: js.Any }),
        ("Days" -> Days.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleExpiration]
    }
  }

  @js.native
  trait ListBucketsOutput extends js.Object {
    var Buckets: Buckets
    var Owner: Owner
  }

  object ListBucketsOutput {
    def apply(
      Buckets: js.UndefOr[Buckets] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined
    ): ListBucketsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Buckets" -> Buckets.map { x => x: js.Any }),
        ("Owner" -> Owner.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBucketsOutput]
    }
  }

  @js.native
  trait ListMultipartUploadsOutput extends js.Object {
    var UploadIdMarker: UploadIdMarker
    var Bucket: BucketName
    var NextUploadIdMarker: NextUploadIdMarker
    var NextKeyMarker: NextKeyMarker
    var IsTruncated: IsTruncated
    var CommonPrefixes: CommonPrefixList
    var KeyMarker: KeyMarker
    var Uploads: MultipartUploadList
    var Delimiter: Delimiter
    var EncodingType: EncodingType
    var MaxUploads: MaxUploads
    var Prefix: Prefix
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
      Prefix: js.UndefOr[Prefix] = js.undefined
    ): ListMultipartUploadsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UploadIdMarker" -> UploadIdMarker.map { x => x: js.Any }),
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("NextUploadIdMarker" -> NextUploadIdMarker.map { x => x: js.Any }),
        ("NextKeyMarker" -> NextKeyMarker.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("CommonPrefixes" -> CommonPrefixes.map { x => x: js.Any }),
        ("KeyMarker" -> KeyMarker.map { x => x: js.Any }),
        ("Uploads" -> Uploads.map { x => x: js.Any }),
        ("Delimiter" -> Delimiter.map { x => x: js.Any }),
        ("EncodingType" -> EncodingType.map { x => x: js.Any }),
        ("MaxUploads" -> MaxUploads.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMultipartUploadsOutput]
    }
  }

  @js.native
  trait ListMultipartUploadsRequest extends js.Object {
    var UploadIdMarker: UploadIdMarker
    var Bucket: BucketName
    var KeyMarker: KeyMarker
    var Delimiter: Delimiter
    var EncodingType: EncodingType
    var MaxUploads: MaxUploads
    var Prefix: Prefix
  }

  object ListMultipartUploadsRequest {
    def apply(
      UploadIdMarker: js.UndefOr[UploadIdMarker] = js.undefined,
      Bucket: js.UndefOr[BucketName] = js.undefined,
      KeyMarker: js.UndefOr[KeyMarker] = js.undefined,
      Delimiter: js.UndefOr[Delimiter] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      MaxUploads: js.UndefOr[MaxUploads] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined
    ): ListMultipartUploadsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UploadIdMarker" -> UploadIdMarker.map { x => x: js.Any }),
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("KeyMarker" -> KeyMarker.map { x => x: js.Any }),
        ("Delimiter" -> Delimiter.map { x => x: js.Any }),
        ("EncodingType" -> EncodingType.map { x => x: js.Any }),
        ("MaxUploads" -> MaxUploads.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMultipartUploadsRequest]
    }
  }

  @js.native
  trait ListObjectVersionsOutput extends js.Object {
    var NextKeyMarker: NextKeyMarker
    var IsTruncated: IsTruncated
    var CommonPrefixes: CommonPrefixList
    var Name: BucketName
    var KeyMarker: KeyMarker
    var Versions: ObjectVersionList
    var Delimiter: Delimiter
    var VersionIdMarker: VersionIdMarker
    var EncodingType: EncodingType
    var DeleteMarkers: DeleteMarkers
    var Prefix: Prefix
    var NextVersionIdMarker: NextVersionIdMarker
    var MaxKeys: MaxKeys
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
      MaxKeys: js.UndefOr[MaxKeys] = js.undefined
    ): ListObjectVersionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextKeyMarker" -> NextKeyMarker.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("CommonPrefixes" -> CommonPrefixes.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("KeyMarker" -> KeyMarker.map { x => x: js.Any }),
        ("Versions" -> Versions.map { x => x: js.Any }),
        ("Delimiter" -> Delimiter.map { x => x: js.Any }),
        ("VersionIdMarker" -> VersionIdMarker.map { x => x: js.Any }),
        ("EncodingType" -> EncodingType.map { x => x: js.Any }),
        ("DeleteMarkers" -> DeleteMarkers.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any }),
        ("NextVersionIdMarker" -> NextVersionIdMarker.map { x => x: js.Any }),
        ("MaxKeys" -> MaxKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectVersionsOutput]
    }
  }

  @js.native
  trait ListObjectVersionsRequest extends js.Object {
    var Bucket: BucketName
    var KeyMarker: KeyMarker
    var Delimiter: Delimiter
    var VersionIdMarker: VersionIdMarker
    var EncodingType: EncodingType
    var Prefix: Prefix
    var MaxKeys: MaxKeys
  }

  object ListObjectVersionsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      KeyMarker: js.UndefOr[KeyMarker] = js.undefined,
      Delimiter: js.UndefOr[Delimiter] = js.undefined,
      VersionIdMarker: js.UndefOr[VersionIdMarker] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      MaxKeys: js.UndefOr[MaxKeys] = js.undefined
    ): ListObjectVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("KeyMarker" -> KeyMarker.map { x => x: js.Any }),
        ("Delimiter" -> Delimiter.map { x => x: js.Any }),
        ("VersionIdMarker" -> VersionIdMarker.map { x => x: js.Any }),
        ("EncodingType" -> EncodingType.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any }),
        ("MaxKeys" -> MaxKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectVersionsRequest]
    }
  }

  @js.native
  trait ListObjectsOutput extends js.Object {
    var IsTruncated: IsTruncated
    var CommonPrefixes: CommonPrefixList
    var Name: BucketName
    var Delimiter: Delimiter
    var NextMarker: NextMarker
    var EncodingType: EncodingType
    var Contents: ObjectList
    var Prefix: Prefix
    var MaxKeys: MaxKeys
    var Marker: Marker
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
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListObjectsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("CommonPrefixes" -> CommonPrefixes.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Delimiter" -> Delimiter.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("EncodingType" -> EncodingType.map { x => x: js.Any }),
        ("Contents" -> Contents.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any }),
        ("MaxKeys" -> MaxKeys.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectsOutput]
    }
  }

  @js.native
  trait ListObjectsRequest extends js.Object {
    var Bucket: BucketName
    var Delimiter: Delimiter
    var EncodingType: EncodingType
    var Prefix: Prefix
    var MaxKeys: MaxKeys
    var Marker: Marker
  }

  object ListObjectsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      Delimiter: js.UndefOr[Delimiter] = js.undefined,
      EncodingType: js.UndefOr[EncodingType] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListObjectsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Delimiter" -> Delimiter.map { x => x: js.Any }),
        ("EncodingType" -> EncodingType.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any }),
        ("MaxKeys" -> MaxKeys.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectsRequest]
    }
  }

  @js.native
  trait ListPartsOutput extends js.Object {
    var Bucket: BucketName
    var IsTruncated: IsTruncated
    var PartNumberMarker: PartNumberMarker
    var Initiator: Initiator
    var Parts: Parts
    var NextPartNumberMarker: NextPartNumberMarker
    var RequestCharged: RequestCharged
    var Owner: Owner
    var MaxParts: MaxParts
    var StorageClass: StorageClass
    var UploadId: MultipartUploadId
    var Key: ObjectKey
  }

  object ListPartsOutput {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
      PartNumberMarker: js.UndefOr[PartNumberMarker] = js.undefined,
      Initiator: js.UndefOr[Initiator] = js.undefined,
      Parts: js.UndefOr[Parts] = js.undefined,
      NextPartNumberMarker: js.UndefOr[NextPartNumberMarker] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined,
      MaxParts: js.UndefOr[MaxParts] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): ListPartsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("PartNumberMarker" -> PartNumberMarker.map { x => x: js.Any }),
        ("Initiator" -> Initiator.map { x => x: js.Any }),
        ("Parts" -> Parts.map { x => x: js.Any }),
        ("NextPartNumberMarker" -> NextPartNumberMarker.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any }),
        ("Owner" -> Owner.map { x => x: js.Any }),
        ("MaxParts" -> MaxParts.map { x => x: js.Any }),
        ("StorageClass" -> StorageClass.map { x => x: js.Any }),
        ("UploadId" -> UploadId.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPartsOutput]
    }
  }

  @js.native
  trait ListPartsRequest extends js.Object {
    var Bucket: BucketName
    var PartNumberMarker: PartNumberMarker
    var RequestPayer: RequestPayer
    var MaxParts: MaxParts
    var UploadId: MultipartUploadId
    var Key: ObjectKey
  }

  object ListPartsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      PartNumberMarker: js.UndefOr[PartNumberMarker] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      MaxParts: js.UndefOr[MaxParts] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): ListPartsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("PartNumberMarker" -> PartNumberMarker.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any }),
        ("MaxParts" -> MaxParts.map { x => x: js.Any }),
        ("UploadId" -> UploadId.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPartsRequest]
    }
  }

  @js.native
  trait LoggingEnabled extends js.Object {
    var TargetBucket: TargetBucket
    var TargetGrants: TargetGrants
    var TargetPrefix: TargetPrefix
  }

  object LoggingEnabled {
    def apply(
      TargetBucket: js.UndefOr[TargetBucket] = js.undefined,
      TargetGrants: js.UndefOr[TargetGrants] = js.undefined,
      TargetPrefix: js.UndefOr[TargetPrefix] = js.undefined
    ): LoggingEnabled = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetBucket" -> TargetBucket.map { x => x: js.Any }),
        ("TargetGrants" -> TargetGrants.map { x => x: js.Any }),
        ("TargetPrefix" -> TargetPrefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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

  @js.native
  trait MultipartUpload extends js.Object {
    var Initiator: Initiator
    var Initiated: Initiated
    var Owner: Owner
    var StorageClass: StorageClass
    var UploadId: MultipartUploadId
    var Key: ObjectKey
  }

  object MultipartUpload {
    def apply(
      Initiator: js.UndefOr[Initiator] = js.undefined,
      Initiated: js.UndefOr[Initiated] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined,
      StorageClass: js.UndefOr[StorageClass] = js.undefined,
      UploadId: js.UndefOr[MultipartUploadId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): MultipartUpload = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Initiator" -> Initiator.map { x => x: js.Any }),
        ("Initiated" -> Initiated.map { x => x: js.Any }),
        ("Owner" -> Owner.map { x => x: js.Any }),
        ("StorageClass" -> StorageClass.map { x => x: js.Any }),
        ("UploadId" -> UploadId.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MultipartUpload]
    }
  }

  /**
   * The specified bucket does not exist.
   */
  @js.native
  trait NoSuchBucketException extends js.Object {

  }

  /**
   * The specified key does not exist.
   */
  @js.native
  trait NoSuchKeyException extends js.Object {

  }

  /**
   * The specified multipart upload does not exist.
   */
  @js.native
  trait NoSuchUploadException extends js.Object {

  }

  /**
   * Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.
   */
  @js.native
  trait NoncurrentVersionExpiration extends js.Object {
    var NoncurrentDays: Days
  }

  object NoncurrentVersionExpiration {
    def apply(
      NoncurrentDays: js.UndefOr[Days] = js.undefined
    ): NoncurrentVersionExpiration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NoncurrentDays" -> NoncurrentDays.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NoncurrentVersionExpiration]
    }
  }

  /**
   * Container for the transition rule that describes when noncurrent objects transition to the GLACIER storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the GLACIER storage class at a specific period in the object's lifetime.
   */
  @js.native
  trait NoncurrentVersionTransition extends js.Object {
    var NoncurrentDays: Days
    var StorageClass: TransitionStorageClass
  }

  object NoncurrentVersionTransition {
    def apply(
      NoncurrentDays: js.UndefOr[Days] = js.undefined,
      StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
    ): NoncurrentVersionTransition = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NoncurrentDays" -> NoncurrentDays.map { x => x: js.Any }),
        ("StorageClass" -> StorageClass.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NoncurrentVersionTransition]
    }
  }

  /**
   * Container for specifying the notification configuration of the bucket. If this element is empty, notifications are turned off on the bucket.
   */
  @js.native
  trait NotificationConfiguration extends js.Object {
    var TopicConfigurations: TopicConfigurationList
    var QueueConfigurations: QueueConfigurationList
    var LambdaFunctionConfigurations: LambdaFunctionConfigurationList
  }

  object NotificationConfiguration {
    def apply(
      TopicConfigurations: js.UndefOr[TopicConfigurationList] = js.undefined,
      QueueConfigurations: js.UndefOr[QueueConfigurationList] = js.undefined,
      LambdaFunctionConfigurations: js.UndefOr[LambdaFunctionConfigurationList] = js.undefined
    ): NotificationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicConfigurations" -> TopicConfigurations.map { x => x: js.Any }),
        ("QueueConfigurations" -> QueueConfigurations.map { x => x: js.Any }),
        ("LambdaFunctionConfigurations" -> LambdaFunctionConfigurations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationConfiguration]
    }
  }

  @js.native
  trait NotificationConfigurationDeprecated extends js.Object {
    var TopicConfiguration: TopicConfigurationDeprecated
    var QueueConfiguration: QueueConfigurationDeprecated
    var CloudFunctionConfiguration: CloudFunctionConfiguration
  }

  object NotificationConfigurationDeprecated {
    def apply(
      TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated] = js.undefined,
      QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated] = js.undefined,
      CloudFunctionConfiguration: js.UndefOr[CloudFunctionConfiguration] = js.undefined
    ): NotificationConfigurationDeprecated = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicConfiguration" -> TopicConfiguration.map { x => x: js.Any }),
        ("QueueConfiguration" -> QueueConfiguration.map { x => x: js.Any }),
        ("CloudFunctionConfiguration" -> CloudFunctionConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationConfigurationDeprecated]
    }
  }

  @js.native
  trait Object extends js.Object {
    var Size: Size
    var LastModified: LastModified
    var ETag: ETag
    var Owner: Owner
    var StorageClass: ObjectStorageClass
    var Key: ObjectKey
  }

  object Object {
    def apply(
      Size: js.UndefOr[Size] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      Owner: js.UndefOr[Owner] = js.undefined,
      StorageClass: js.UndefOr[ObjectStorageClass] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): Object = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Size" -> Size.map { x => x: js.Any }),
        ("LastModified" -> LastModified.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any }),
        ("Owner" -> Owner.map { x => x: js.Any }),
        ("StorageClass" -> StorageClass.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Object]
    }
  }

  /**
   * This operation is not allowed against this storage tier
   */
  @js.native
  trait ObjectAlreadyInActiveTierErrorException extends js.Object {

  }


  object ObjectCannedACLEnum {
    val `private` = "private"
    val `public-read` = "public-read"
    val `public-read-write` = "public-read-write"
    val `authenticated-read` = "authenticated-read"
    val `bucket-owner-read` = "bucket-owner-read"
    val `bucket-owner-full-control` = "bucket-owner-full-control"

    val values = IndexedSeq(`private`, `public-read`, `public-read-write`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`)
  }

  @js.native
  trait ObjectIdentifier extends js.Object {
    var Key: ObjectKey
    var VersionId: ObjectVersionId
  }

  object ObjectIdentifier {
    def apply(
      Key: js.UndefOr[ObjectKey] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    ): ObjectIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectIdentifier]
    }
  }

  /**
   * The source object of the COPY operation is not in the active tier and is only stored in Amazon Glacier.
   */
  @js.native
  trait ObjectNotInActiveTierErrorException extends js.Object {

  }


  object ObjectStorageClassEnum {
    val STANDARD = "STANDARD"
    val `REDUCED_REDUNDANCY` = "REDUCED_REDUNDANCY"
    val GLACIER = "GLACIER"

    val values = IndexedSeq(STANDARD, `REDUCED_REDUNDANCY`, GLACIER)
  }

  @js.native
  trait ObjectVersion extends js.Object {
    var Size: Size
    var LastModified: LastModified
    var IsLatest: IsLatest
    var VersionId: ObjectVersionId
    var ETag: ETag
    var Owner: Owner
    var StorageClass: ObjectVersionStorageClass
    var Key: ObjectKey
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
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): ObjectVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Size" -> Size.map { x => x: js.Any }),
        ("LastModified" -> LastModified.map { x => x: js.Any }),
        ("IsLatest" -> IsLatest.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any }),
        ("Owner" -> Owner.map { x => x: js.Any }),
        ("StorageClass" -> StorageClass.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectVersion]
    }
  }


  object ObjectVersionStorageClassEnum {
    val STANDARD = "STANDARD"

    val values = IndexedSeq(STANDARD)
  }

  @js.native
  trait Owner extends js.Object {
    var DisplayName: DisplayName
    var ID: ID
  }

  object Owner {
    def apply(
      DisplayName: js.UndefOr[DisplayName] = js.undefined,
      ID: js.UndefOr[ID] = js.undefined
    ): Owner = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DisplayName" -> DisplayName.map { x => x: js.Any }),
        ("ID" -> ID.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Owner]
    }
  }

  @js.native
  trait Part extends js.Object {
    var PartNumber: PartNumber
    var LastModified: LastModified
    var ETag: ETag
    var Size: Size
  }

  object Part {
    def apply(
      PartNumber: js.UndefOr[PartNumber] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      Size: js.UndefOr[Size] = js.undefined
    ): Part = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PartNumber" -> PartNumber.map { x => x: js.Any }),
        ("LastModified" -> LastModified.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any }),
        ("Size" -> Size.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Part]
    }
  }


  object PayerEnum {
    val Requester = "Requester"
    val BucketOwner = "BucketOwner"

    val values = IndexedSeq(Requester, BucketOwner)
  }


  object PermissionEnum {
    val `FULL_CONTROL` = "FULL_CONTROL"
    val WRITE = "WRITE"
    val `WRITE_ACP` = "WRITE_ACP"
    val READ = "READ"
    val `READ_ACP` = "READ_ACP"

    val values = IndexedSeq(`FULL_CONTROL`, WRITE, `WRITE_ACP`, READ, `READ_ACP`)
  }


  object ProtocolEnum {
    val http = "http"
    val https = "https"

    val values = IndexedSeq(http, https)
  }

  @js.native
  trait PutBucketAclRequest extends js.Object {
    var Bucket: BucketName
    var GrantWrite: GrantWrite
    var GrantFullControl: GrantFullControl
    var AccessControlPolicy: AccessControlPolicy
    var GrantWriteACP: GrantWriteACP
    var ACL: BucketCannedACL
    var GrantReadACP: GrantReadACP
    var GrantRead: GrantRead
    var ContentMD5: ContentMD5
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
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutBucketAclRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("GrantWrite" -> GrantWrite.map { x => x: js.Any }),
        ("GrantFullControl" -> GrantFullControl.map { x => x: js.Any }),
        ("AccessControlPolicy" -> AccessControlPolicy.map { x => x: js.Any }),
        ("GrantWriteACP" -> GrantWriteACP.map { x => x: js.Any }),
        ("ACL" -> ACL.map { x => x: js.Any }),
        ("GrantReadACP" -> GrantReadACP.map { x => x: js.Any }),
        ("GrantRead" -> GrantRead.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketAclRequest]
    }
  }

  @js.native
  trait PutBucketCorsRequest extends js.Object {
    var Bucket: BucketName
    var CORSConfiguration: CORSConfiguration
    var ContentMD5: ContentMD5
  }

  object PutBucketCorsRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      CORSConfiguration: js.UndefOr[CORSConfiguration] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutBucketCorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("CORSConfiguration" -> CORSConfiguration.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketCorsRequest]
    }
  }

  @js.native
  trait PutBucketLifecycleRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: ContentMD5
    var LifecycleConfiguration: LifecycleConfiguration
  }

  object PutBucketLifecycleRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      LifecycleConfiguration: js.UndefOr[LifecycleConfiguration] = js.undefined
    ): PutBucketLifecycleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any }),
        ("LifecycleConfiguration" -> LifecycleConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketLifecycleRequest]
    }
  }

  @js.native
  trait PutBucketLoggingRequest extends js.Object {
    var Bucket: BucketName
    var BucketLoggingStatus: BucketLoggingStatus
    var ContentMD5: ContentMD5
  }

  object PutBucketLoggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      BucketLoggingStatus: js.UndefOr[BucketLoggingStatus] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    ): PutBucketLoggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("BucketLoggingStatus" -> BucketLoggingStatus.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketLoggingRequest]
    }
  }

  @js.native
  trait PutBucketNotificationConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var NotificationConfiguration: NotificationConfiguration
  }

  object PutBucketNotificationConfigurationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      NotificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined
    ): PutBucketNotificationConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("NotificationConfiguration" -> NotificationConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketNotificationConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketNotificationRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: ContentMD5
    var NotificationConfiguration: NotificationConfigurationDeprecated
  }

  object PutBucketNotificationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      NotificationConfiguration: js.UndefOr[NotificationConfigurationDeprecated] = js.undefined
    ): PutBucketNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any }),
        ("NotificationConfiguration" -> NotificationConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketNotificationRequest]
    }
  }

  @js.native
  trait PutBucketPolicyRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: ContentMD5
    var Policy: Policy
  }

  object PutBucketPolicyRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      Policy: js.UndefOr[Policy] = js.undefined
    ): PutBucketPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any }),
        ("Policy" -> Policy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketPolicyRequest]
    }
  }

  @js.native
  trait PutBucketReplicationRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: ContentMD5
    var ReplicationConfiguration: ReplicationConfiguration
  }

  object PutBucketReplicationRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      ReplicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.undefined
    ): PutBucketReplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any }),
        ("ReplicationConfiguration" -> ReplicationConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketReplicationRequest]
    }
  }

  @js.native
  trait PutBucketRequestPaymentRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: ContentMD5
    var RequestPaymentConfiguration: RequestPaymentConfiguration
  }

  object PutBucketRequestPaymentRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      RequestPaymentConfiguration: js.UndefOr[RequestPaymentConfiguration] = js.undefined
    ): PutBucketRequestPaymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any }),
        ("RequestPaymentConfiguration" -> RequestPaymentConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketRequestPaymentRequest]
    }
  }

  @js.native
  trait PutBucketTaggingRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: ContentMD5
    var Tagging: Tagging
  }

  object PutBucketTaggingRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      Tagging: js.UndefOr[Tagging] = js.undefined
    ): PutBucketTaggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any }),
        ("Tagging" -> Tagging.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketTaggingRequest]
    }
  }

  @js.native
  trait PutBucketVersioningRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: ContentMD5
    var MFA: MFA
    var VersioningConfiguration: VersioningConfiguration
  }

  object PutBucketVersioningRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      MFA: js.UndefOr[MFA] = js.undefined,
      VersioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
    ): PutBucketVersioningRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any }),
        ("MFA" -> MFA.map { x => x: js.Any }),
        ("VersioningConfiguration" -> VersioningConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketVersioningRequest]
    }
  }

  @js.native
  trait PutBucketWebsiteRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: ContentMD5
    var WebsiteConfiguration: WebsiteConfiguration
  }

  object PutBucketWebsiteRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      WebsiteConfiguration: js.UndefOr[WebsiteConfiguration] = js.undefined
    ): PutBucketWebsiteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any }),
        ("WebsiteConfiguration" -> WebsiteConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBucketWebsiteRequest]
    }
  }

  @js.native
  trait PutObjectAclOutput extends js.Object {
    var RequestCharged: RequestCharged
  }

  object PutObjectAclOutput {
    def apply(
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): PutObjectAclOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutObjectAclOutput]
    }
  }

  @js.native
  trait PutObjectAclRequest extends js.Object {
    var Bucket: BucketName
    var GrantWrite: GrantWrite
    var GrantFullControl: GrantFullControl
    var AccessControlPolicy: AccessControlPolicy
    var GrantWriteACP: GrantWriteACP
    var ACL: ObjectCannedACL
    var RequestPayer: RequestPayer
    var GrantReadACP: GrantReadACP
    var GrantRead: GrantRead
    var ContentMD5: ContentMD5
    var Key: ObjectKey
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
      GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
      GrantRead: js.UndefOr[GrantRead] = js.undefined,
      ContentMD5: js.UndefOr[ContentMD5] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): PutObjectAclRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("GrantWrite" -> GrantWrite.map { x => x: js.Any }),
        ("GrantFullControl" -> GrantFullControl.map { x => x: js.Any }),
        ("AccessControlPolicy" -> AccessControlPolicy.map { x => x: js.Any }),
        ("GrantWriteACP" -> GrantWriteACP.map { x => x: js.Any }),
        ("ACL" -> ACL.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any }),
        ("GrantReadACP" -> GrantReadACP.map { x => x: js.Any }),
        ("GrantRead" -> GrantRead.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutObjectAclRequest]
    }
  }

  @js.native
  trait PutObjectOutput extends js.Object {
    var SSEKMSKeyId: SSEKMSKeyId
    var ServerSideEncryption: ServerSideEncryption
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var VersionId: ObjectVersionId
    var Expiration: Expiration
    var ETag: ETag
    var RequestCharged: RequestCharged
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
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): PutObjectOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SSEKMSKeyId" -> SSEKMSKeyId.map { x => x: js.Any }),
        ("ServerSideEncryption" -> ServerSideEncryption.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("Expiration" -> Expiration.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutObjectOutput]
    }
  }

  @js.native
  trait PutObjectRequest extends js.Object {
    var Bucket: BucketName
    var Metadata: Metadata
    var SSEKMSKeyId: SSEKMSKeyId
    var GrantFullControl: GrantFullControl
    var ServerSideEncryption: ServerSideEncryption
    var GrantWriteACP: GrantWriteACP
    var ContentEncoding: ContentEncoding
    var ACL: ObjectCannedACL
    var Expires: Expires
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var RequestPayer: RequestPayer
    var Body: Body
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var ContentLength: ContentLength
    var GrantReadACP: GrantReadACP
    var ContentLanguage: ContentLanguage
    var ContentDisposition: ContentDisposition
    var GrantRead: GrantRead
    var WebsiteRedirectLocation: WebsiteRedirectLocation
    var ContentMD5: ContentMD5
    var CacheControl: CacheControl
    var ContentType: ContentType
    var StorageClass: StorageClass
    var Key: ObjectKey
    var SSECustomerKey: SSECustomerKey
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
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    ): PutObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Metadata" -> Metadata.map { x => x: js.Any }),
        ("SSEKMSKeyId" -> SSEKMSKeyId.map { x => x: js.Any }),
        ("GrantFullControl" -> GrantFullControl.map { x => x: js.Any }),
        ("ServerSideEncryption" -> ServerSideEncryption.map { x => x: js.Any }),
        ("GrantWriteACP" -> GrantWriteACP.map { x => x: js.Any }),
        ("ContentEncoding" -> ContentEncoding.map { x => x: js.Any }),
        ("ACL" -> ACL.map { x => x: js.Any }),
        ("Expires" -> Expires.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any }),
        ("Body" -> Body.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("ContentLength" -> ContentLength.map { x => x: js.Any }),
        ("GrantReadACP" -> GrantReadACP.map { x => x: js.Any }),
        ("ContentLanguage" -> ContentLanguage.map { x => x: js.Any }),
        ("ContentDisposition" -> ContentDisposition.map { x => x: js.Any }),
        ("GrantRead" -> GrantRead.map { x => x: js.Any }),
        ("WebsiteRedirectLocation" -> WebsiteRedirectLocation.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any }),
        ("CacheControl" -> CacheControl.map { x => x: js.Any }),
        ("ContentType" -> ContentType.map { x => x: js.Any }),
        ("StorageClass" -> StorageClass.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any }),
        ("SSECustomerKey" -> SSECustomerKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutObjectRequest]
    }
  }

  /**
   * Container for specifying an configuration when you want Amazon S3 to publish events to an Amazon Simple Queue Service (Amazon SQS) queue.
   */
  @js.native
  trait QueueConfiguration extends js.Object {
    var Id: NotificationId
    var QueueArn: QueueArn
    var Events: EventList
  }

  object QueueConfiguration {
    def apply(
      Id: js.UndefOr[NotificationId] = js.undefined,
      QueueArn: js.UndefOr[QueueArn] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined
    ): QueueConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("QueueArn" -> QueueArn.map { x => x: js.Any }),
        ("Events" -> Events.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueueConfiguration]
    }
  }

  @js.native
  trait QueueConfigurationDeprecated extends js.Object {
    var Id: NotificationId
    var Event: Event
    var Events: EventList
    var Queue: QueueArn
  }

  object QueueConfigurationDeprecated {
    def apply(
      Id: js.UndefOr[NotificationId] = js.undefined,
      Event: js.UndefOr[Event] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined,
      Queue: js.UndefOr[QueueArn] = js.undefined
    ): QueueConfigurationDeprecated = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Event" -> Event.map { x => x: js.Any }),
        ("Events" -> Events.map { x => x: js.Any }),
        ("Queue" -> Queue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueueConfigurationDeprecated]
    }
  }

  @js.native
  trait Redirect extends js.Object {
    var ReplaceKeyWith: ReplaceKeyWith
    var HttpRedirectCode: HttpRedirectCode
    var HostName: HostName
    var ReplaceKeyPrefixWith: ReplaceKeyPrefixWith
    var Protocol: Protocol
  }

  object Redirect {
    def apply(
      ReplaceKeyWith: js.UndefOr[ReplaceKeyWith] = js.undefined,
      HttpRedirectCode: js.UndefOr[HttpRedirectCode] = js.undefined,
      HostName: js.UndefOr[HostName] = js.undefined,
      ReplaceKeyPrefixWith: js.UndefOr[ReplaceKeyPrefixWith] = js.undefined,
      Protocol: js.UndefOr[Protocol] = js.undefined
    ): Redirect = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReplaceKeyWith" -> ReplaceKeyWith.map { x => x: js.Any }),
        ("HttpRedirectCode" -> HttpRedirectCode.map { x => x: js.Any }),
        ("HostName" -> HostName.map { x => x: js.Any }),
        ("ReplaceKeyPrefixWith" -> ReplaceKeyPrefixWith.map { x => x: js.Any }),
        ("Protocol" -> Protocol.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Redirect]
    }
  }

  @js.native
  trait RedirectAllRequestsTo extends js.Object {
    var HostName: HostName
    var Protocol: Protocol
  }

  object RedirectAllRequestsTo {
    def apply(
      HostName: js.UndefOr[HostName] = js.undefined,
      Protocol: js.UndefOr[Protocol] = js.undefined
    ): RedirectAllRequestsTo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostName" -> HostName.map { x => x: js.Any }),
        ("Protocol" -> Protocol.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedirectAllRequestsTo]
    }
  }

  /**
   * Container for replication rules. You can add as many as 1,000 rules. Total replication configuration size can be up to 2 MB.
   */
  @js.native
  trait ReplicationConfiguration extends js.Object {
    var Role: Role
    var Rules: ReplicationRules
  }

  object ReplicationConfiguration {
    def apply(
      Role: js.UndefOr[Role] = js.undefined,
      Rules: js.UndefOr[ReplicationRules] = js.undefined
    ): ReplicationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Role" -> Role.map { x => x: js.Any }),
        ("Rules" -> Rules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationConfiguration]
    }
  }

  @js.native
  trait ReplicationRule extends js.Object {
    var ID: ID
    var Prefix: Prefix
    var Status: ReplicationRuleStatus
    var Destination: Destination
  }

  object ReplicationRule {
    def apply(
      ID: js.UndefOr[ID] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Status: js.UndefOr[ReplicationRuleStatus] = js.undefined,
      Destination: js.UndefOr[Destination] = js.undefined
    ): ReplicationRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ID" -> ID.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("Destination" -> Destination.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationRule]
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

  @js.native
  trait RequestPaymentConfiguration extends js.Object {
    var Payer: Payer
  }

  object RequestPaymentConfiguration {
    def apply(
      Payer: js.UndefOr[Payer] = js.undefined
    ): RequestPaymentConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Payer" -> Payer.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestPaymentConfiguration]
    }
  }

  @js.native
  trait RestoreObjectOutput extends js.Object {
    var RequestCharged: RequestCharged
  }

  object RestoreObjectOutput {
    def apply(
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): RestoreObjectOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreObjectOutput]
    }
  }

  @js.native
  trait RestoreObjectRequest extends js.Object {
    var Bucket: BucketName
    var RequestPayer: RequestPayer
    var RestoreRequest: RestoreRequest
    var VersionId: ObjectVersionId
    var Key: ObjectKey
  }

  object RestoreObjectRequest {
    def apply(
      Bucket: js.UndefOr[BucketName] = js.undefined,
      RequestPayer: js.UndefOr[RequestPayer] = js.undefined,
      RestoreRequest: js.UndefOr[RestoreRequest] = js.undefined,
      VersionId: js.UndefOr[ObjectVersionId] = js.undefined,
      Key: js.UndefOr[ObjectKey] = js.undefined
    ): RestoreObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any }),
        ("RestoreRequest" -> RestoreRequest.map { x => x: js.Any }),
        ("VersionId" -> VersionId.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreObjectRequest]
    }
  }

  @js.native
  trait RestoreRequest extends js.Object {
    var Days: Days
  }

  object RestoreRequest {
    def apply(
      Days: js.UndefOr[Days] = js.undefined
    ): RestoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Days" -> Days.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreRequest]
    }
  }

  @js.native
  trait RoutingRule extends js.Object {
    var Condition: Condition
    var Redirect: Redirect
  }

  object RoutingRule {
    def apply(
      Condition: js.UndefOr[Condition] = js.undefined,
      Redirect: js.UndefOr[Redirect] = js.undefined
    ): RoutingRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Condition" -> Condition.map { x => x: js.Any }),
        ("Redirect" -> Redirect.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoutingRule]
    }
  }

  @js.native
  trait Rule extends js.Object {
    var Transition: Transition
    var ID: ID
    var NoncurrentVersionExpiration: NoncurrentVersionExpiration
    var NoncurrentVersionTransition: NoncurrentVersionTransition
    var Prefix: Prefix
    var Expiration: LifecycleExpiration
    var Status: ExpirationStatus
  }

  object Rule {
    def apply(
      Transition: js.UndefOr[Transition] = js.undefined,
      ID: js.UndefOr[ID] = js.undefined,
      NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration] = js.undefined,
      NoncurrentVersionTransition: js.UndefOr[NoncurrentVersionTransition] = js.undefined,
      Prefix: js.UndefOr[Prefix] = js.undefined,
      Expiration: js.UndefOr[LifecycleExpiration] = js.undefined,
      Status: js.UndefOr[ExpirationStatus] = js.undefined
    ): Rule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Transition" -> Transition.map { x => x: js.Any }),
        ("ID" -> ID.map { x => x: js.Any }),
        ("NoncurrentVersionExpiration" -> NoncurrentVersionExpiration.map { x => x: js.Any }),
        ("NoncurrentVersionTransition" -> NoncurrentVersionTransition.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any }),
        ("Expiration" -> Expiration.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Rule]
    }
  }


  object ServerSideEncryptionEnum {
    val AES256 = "AES256"

    val values = IndexedSeq(AES256)
  }


  object StorageClassEnum {
    val STANDARD = "STANDARD"
    val `REDUCED_REDUNDANCY` = "REDUCED_REDUNDANCY"

    val values = IndexedSeq(STANDARD, `REDUCED_REDUNDANCY`)
  }

  @js.native
  trait Tag extends js.Object {
    var Key: ObjectKey
    var Value: Value
  }

  object Tag {
    def apply(
      Key: js.UndefOr[ObjectKey] = js.undefined,
      Value: js.UndefOr[Value] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait Tagging extends js.Object {
    var TagSet: TagSet
  }

  object Tagging {
    def apply(
      TagSet: js.UndefOr[TagSet] = js.undefined
    ): Tagging = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TagSet" -> TagSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tagging]
    }
  }

  @js.native
  trait TargetGrant extends js.Object {
    var Grantee: Grantee
    var Permission: BucketLogsPermission
  }

  object TargetGrant {
    def apply(
      Grantee: js.UndefOr[Grantee] = js.undefined,
      Permission: js.UndefOr[BucketLogsPermission] = js.undefined
    ): TargetGrant = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Grantee" -> Grantee.map { x => x: js.Any }),
        ("Permission" -> Permission.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetGrant]
    }
  }

  /**
   * Container for specifying the configuration when you want Amazon S3 to publish events to an Amazon Simple Notification Service (Amazon SNS) topic.
   */
  @js.native
  trait TopicConfiguration extends js.Object {
    var Id: NotificationId
    var TopicArn: TopicArn
    var Events: EventList
  }

  object TopicConfiguration {
    def apply(
      Id: js.UndefOr[NotificationId] = js.undefined,
      TopicArn: js.UndefOr[TopicArn] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined
    ): TopicConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("Events" -> Events.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TopicConfiguration]
    }
  }

  @js.native
  trait TopicConfigurationDeprecated extends js.Object {
    var Id: NotificationId
    var Events: EventList
    var Event: Event
    var Topic: TopicArn
  }

  object TopicConfigurationDeprecated {
    def apply(
      Id: js.UndefOr[NotificationId] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined,
      Event: js.UndefOr[Event] = js.undefined,
      Topic: js.UndefOr[TopicArn] = js.undefined
    ): TopicConfigurationDeprecated = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Events" -> Events.map { x => x: js.Any }),
        ("Event" -> Event.map { x => x: js.Any }),
        ("Topic" -> Topic.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TopicConfigurationDeprecated]
    }
  }

  @js.native
  trait Transition extends js.Object {
    var Date: Date
    var Days: Days
    var StorageClass: TransitionStorageClass
  }

  object Transition {
    def apply(
      Date: js.UndefOr[Date] = js.undefined,
      Days: js.UndefOr[Days] = js.undefined,
      StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
    ): Transition = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Date" -> Date.map { x => x: js.Any }),
        ("Days" -> Days.map { x => x: js.Any }),
        ("StorageClass" -> StorageClass.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Transition]
    }
  }


  object TransitionStorageClassEnum {
    val GLACIER = "GLACIER"

    val values = IndexedSeq(GLACIER)
  }


  object TypeEnum {
    val CanonicalUser = "CanonicalUser"
    val AmazonCustomerByEmail = "AmazonCustomerByEmail"
    val Group = "Group"

    val values = IndexedSeq(CanonicalUser, AmazonCustomerByEmail, Group)
  }

  @js.native
  trait UploadPartCopyOutput extends js.Object {
    var CopySourceVersionId: CopySourceVersionId
    var SSEKMSKeyId: SSEKMSKeyId
    var ServerSideEncryption: ServerSideEncryption
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var CopyPartResult: CopyPartResult
    var RequestCharged: RequestCharged
  }

  object UploadPartCopyOutput {
    def apply(
      CopySourceVersionId: js.UndefOr[CopySourceVersionId] = js.undefined,
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      CopyPartResult: js.UndefOr[CopyPartResult] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): UploadPartCopyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CopySourceVersionId" -> CopySourceVersionId.map { x => x: js.Any }),
        ("SSEKMSKeyId" -> SSEKMSKeyId.map { x => x: js.Any }),
        ("ServerSideEncryption" -> ServerSideEncryption.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("CopyPartResult" -> CopyPartResult.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadPartCopyOutput]
    }
  }

  @js.native
  trait UploadPartCopyRequest extends js.Object {
    var Bucket: BucketName
    var CopySource: CopySource
    var PartNumber: PartNumber
    var CopySourceIfModifiedSince: CopySourceIfModifiedSince
    var CopySourceIfNoneMatch: CopySourceIfNoneMatch
    var CopySourceSSECustomerKey: CopySourceSSECustomerKey
    var CopySourceIfMatch: CopySourceIfMatch
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var RequestPayer: RequestPayer
    var CopySourceIfUnmodifiedSince: CopySourceIfUnmodifiedSince
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var CopySourceRange: CopySourceRange
    var CopySourceSSECustomerAlgorithm: CopySourceSSECustomerAlgorithm
    var CopySourceSSECustomerKeyMD5: CopySourceSSECustomerKeyMD5
    var UploadId: MultipartUploadId
    var Key: ObjectKey
    var SSECustomerKey: SSECustomerKey
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
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    ): UploadPartCopyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("CopySource" -> CopySource.map { x => x: js.Any }),
        ("PartNumber" -> PartNumber.map { x => x: js.Any }),
        ("CopySourceIfModifiedSince" -> CopySourceIfModifiedSince.map { x => x: js.Any }),
        ("CopySourceIfNoneMatch" -> CopySourceIfNoneMatch.map { x => x: js.Any }),
        ("CopySourceSSECustomerKey" -> CopySourceSSECustomerKey.map { x => x: js.Any }),
        ("CopySourceIfMatch" -> CopySourceIfMatch.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any }),
        ("CopySourceIfUnmodifiedSince" -> CopySourceIfUnmodifiedSince.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("CopySourceRange" -> CopySourceRange.map { x => x: js.Any }),
        ("CopySourceSSECustomerAlgorithm" -> CopySourceSSECustomerAlgorithm.map { x => x: js.Any }),
        ("CopySourceSSECustomerKeyMD5" -> CopySourceSSECustomerKeyMD5.map { x => x: js.Any }),
        ("UploadId" -> UploadId.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any }),
        ("SSECustomerKey" -> SSECustomerKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadPartCopyRequest]
    }
  }

  @js.native
  trait UploadPartOutput extends js.Object {
    var SSEKMSKeyId: SSEKMSKeyId
    var ServerSideEncryption: ServerSideEncryption
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var ETag: ETag
    var RequestCharged: RequestCharged
  }

  object UploadPartOutput {
    def apply(
      SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined,
      ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
      SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined,
      SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined,
      ETag: js.UndefOr[ETag] = js.undefined,
      RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    ): UploadPartOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SSEKMSKeyId" -> SSEKMSKeyId.map { x => x: js.Any }),
        ("ServerSideEncryption" -> ServerSideEncryption.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any }),
        ("RequestCharged" -> RequestCharged.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadPartOutput]
    }
  }

  @js.native
  trait UploadPartRequest extends js.Object {
    var Bucket: BucketName
    var PartNumber: PartNumber
    var SSECustomerKeyMD5: SSECustomerKeyMD5
    var RequestPayer: RequestPayer
    var Body: Body
    var SSECustomerAlgorithm: SSECustomerAlgorithm
    var ContentLength: ContentLength
    var ContentMD5: ContentMD5
    var UploadId: MultipartUploadId
    var Key: ObjectKey
    var SSECustomerKey: SSECustomerKey
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
      SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    ): UploadPartRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("PartNumber" -> PartNumber.map { x => x: js.Any }),
        ("SSECustomerKeyMD5" -> SSECustomerKeyMD5.map { x => x: js.Any }),
        ("RequestPayer" -> RequestPayer.map { x => x: js.Any }),
        ("Body" -> Body.map { x => x: js.Any }),
        ("SSECustomerAlgorithm" -> SSECustomerAlgorithm.map { x => x: js.Any }),
        ("ContentLength" -> ContentLength.map { x => x: js.Any }),
        ("ContentMD5" -> ContentMD5.map { x => x: js.Any }),
        ("UploadId" -> UploadId.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any }),
        ("SSECustomerKey" -> SSECustomerKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadPartRequest]
    }
  }

  @js.native
  trait VersioningConfiguration extends js.Object {
    var MFADelete: MFADelete
    var Status: BucketVersioningStatus
  }

  object VersioningConfiguration {
    def apply(
      MFADelete: js.UndefOr[MFADelete] = js.undefined,
      Status: js.UndefOr[BucketVersioningStatus] = js.undefined
    ): VersioningConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MFADelete" -> MFADelete.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VersioningConfiguration]
    }
  }

  @js.native
  trait WebsiteConfiguration extends js.Object {
    var ErrorDocument: ErrorDocument
    var IndexDocument: IndexDocument
    var RedirectAllRequestsTo: RedirectAllRequestsTo
    var RoutingRules: RoutingRules
  }

  object WebsiteConfiguration {
    def apply(
      ErrorDocument: js.UndefOr[ErrorDocument] = js.undefined,
      IndexDocument: js.UndefOr[IndexDocument] = js.undefined,
      RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo] = js.undefined,
      RoutingRules: js.UndefOr[RoutingRules] = js.undefined
    ): WebsiteConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ErrorDocument" -> ErrorDocument.map { x => x: js.Any }),
        ("IndexDocument" -> IndexDocument.map { x => x: js.Any }),
        ("RedirectAllRequestsTo" -> RedirectAllRequestsTo.map { x => x: js.Any }),
        ("RoutingRules" -> RoutingRules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WebsiteConfiguration]
    }
  }
}
