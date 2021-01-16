package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object s3control {
  type AccessPointList = js.Array[AccessPoint]
  type AccessPointName = String
  type AccountId = String
  type AwsOrgArn = String
  type BucketName = String
  type Buckets = js.Array[S3BucketArnString]
  type ConfigId = String
  type ConfirmRemoveSelfBucketAccess = Boolean
  type ConfirmationRequired = Boolean
  type ContinuationToken = String
  type CreationDate = js.Date
  type Date = js.Date
  type Days = Int
  type DaysAfterInitiation = Int
  type ExpiredObjectDeleteMarker = Boolean
  type FunctionArnString = String
  type GrantFullControl = String
  type GrantRead = String
  type GrantReadACP = String
  type GrantWrite = String
  type GrantWriteACP = String
  type IAMRoleArn = String
  type ID = String
  type IsEnabled = Boolean
  type IsPublic = Boolean
  type JobArn = String
  type JobCreationTime = js.Date
  type JobFailureCode = String
  type JobFailureList = js.Array[JobFailure]
  type JobFailureReason = String
  type JobId = String
  type JobListDescriptorList = js.Array[JobListDescriptor]
  type JobManifestFieldList = js.Array[JobManifestFieldName]
  type JobNumberOfTasksFailed = Double
  type JobNumberOfTasksSucceeded = Double
  type JobPriority = Int
  type JobStatusList = js.Array[JobStatus]
  type JobStatusUpdateReason = String
  type JobTerminationDate = js.Date
  type JobTotalNumberOfTasks = Double
  type KmsKeyArnString = String
  type LifecycleRules = js.Array[LifecycleRule]
  type Location = String
  type MaxLength1024String = String
  type MaxResults = Int
  type MinStorageBytesPercentage = Double
  type NonEmptyMaxLength1024String = String
  type NonEmptyMaxLength2048String = String
  type NonEmptyMaxLength256String = String
  type NonEmptyMaxLength64String = String
  type NoncurrentVersionTransitionList = js.Array[NoncurrentVersionTransition]
  type ObjectLockEnabledForBucket = Boolean
  type Policy = String
  type Prefix = String
  type PublicAccessBlockEnabled = Boolean
  type RegionalBucketList = js.Array[RegionalBucket]
  type Regions = js.Array[S3AWSRegion]
  type ReportPrefixString = String
  type S3AWSRegion = String
  type S3AccessPointArn = String
  type S3BucketArnString = String
  type S3ContentLength = Double
  type S3ExpirationInDays = Int
  type S3GrantList = js.Array[S3Grant]
  type S3KeyArnString = String
  type S3ObjectVersionId = String
  type S3RegionalBucketArn = String
  type S3TagSet = js.Array[S3Tag]
  type S3UserMetadata = js.Dictionary[MaxLength1024String]
  type SSEKMSKeyId = String
  type Setting = Boolean
  type StorageLensArn = String
  type StorageLensConfigurationList = js.Array[ListStorageLensConfigurationEntry]
  type StorageLensPrefixLevelDelimiter = String
  type StorageLensPrefixLevelMaxDepth = Int
  type StorageLensTags = js.Array[StorageLensTag]
  type StringForNextToken = String
  type SuspendedCause = String
  type SuspendedDate = js.Date
  type TagKeyString = String
  type TagValueString = String
  type TimeStamp = js.Date
  type TransitionList = js.Array[Transition]
  type VpcId = String

  implicit final class S3ControlOps(private val service: S3Control) extends AnyVal {

    @inline def createAccessPointFuture(params: CreateAccessPointRequest): Future[CreateAccessPointResult] = service.createAccessPoint(params).promise().toFuture
    @inline def createBucketFuture(params: CreateBucketRequest): Future[CreateBucketResult] = service.createBucket(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResult] = service.createJob(params).promise().toFuture
    @inline def deleteAccessPointFuture(params: DeleteAccessPointRequest): Future[js.Object] = service.deleteAccessPoint(params).promise().toFuture
    @inline def deleteAccessPointPolicyFuture(params: DeleteAccessPointPolicyRequest): Future[js.Object] = service.deleteAccessPointPolicy(params).promise().toFuture
    @inline def deleteBucketFuture(params: DeleteBucketRequest): Future[js.Object] = service.deleteBucket(params).promise().toFuture
    @inline def deleteBucketLifecycleConfigurationFuture(params: DeleteBucketLifecycleConfigurationRequest): Future[js.Object] = service.deleteBucketLifecycleConfiguration(params).promise().toFuture
    @inline def deleteBucketPolicyFuture(params: DeleteBucketPolicyRequest): Future[js.Object] = service.deleteBucketPolicy(params).promise().toFuture
    @inline def deleteBucketTaggingFuture(params: DeleteBucketTaggingRequest): Future[js.Object] = service.deleteBucketTagging(params).promise().toFuture
    @inline def deleteJobTaggingFuture(params: DeleteJobTaggingRequest): Future[DeleteJobTaggingResult] = service.deleteJobTagging(params).promise().toFuture
    @inline def deletePublicAccessBlockFuture(params: DeletePublicAccessBlockRequest): Future[js.Object] = service.deletePublicAccessBlock(params).promise().toFuture
    @inline def deleteStorageLensConfigurationFuture(params: DeleteStorageLensConfigurationRequest): Future[js.Object] = service.deleteStorageLensConfiguration(params).promise().toFuture
    @inline def deleteStorageLensConfigurationTaggingFuture(params: DeleteStorageLensConfigurationTaggingRequest): Future[DeleteStorageLensConfigurationTaggingResult] = service.deleteStorageLensConfigurationTagging(params).promise().toFuture
    @inline def describeJobFuture(params: DescribeJobRequest): Future[DescribeJobResult] = service.describeJob(params).promise().toFuture
    @inline def getAccessPointFuture(params: GetAccessPointRequest): Future[GetAccessPointResult] = service.getAccessPoint(params).promise().toFuture
    @inline def getAccessPointPolicyFuture(params: GetAccessPointPolicyRequest): Future[GetAccessPointPolicyResult] = service.getAccessPointPolicy(params).promise().toFuture
    @inline def getAccessPointPolicyStatusFuture(params: GetAccessPointPolicyStatusRequest): Future[GetAccessPointPolicyStatusResult] = service.getAccessPointPolicyStatus(params).promise().toFuture
    @inline def getBucketFuture(params: GetBucketRequest): Future[GetBucketResult] = service.getBucket(params).promise().toFuture
    @inline def getBucketLifecycleConfigurationFuture(params: GetBucketLifecycleConfigurationRequest): Future[GetBucketLifecycleConfigurationResult] = service.getBucketLifecycleConfiguration(params).promise().toFuture
    @inline def getBucketPolicyFuture(params: GetBucketPolicyRequest): Future[GetBucketPolicyResult] = service.getBucketPolicy(params).promise().toFuture
    @inline def getBucketTaggingFuture(params: GetBucketTaggingRequest): Future[GetBucketTaggingResult] = service.getBucketTagging(params).promise().toFuture
    @inline def getJobTaggingFuture(params: GetJobTaggingRequest): Future[GetJobTaggingResult] = service.getJobTagging(params).promise().toFuture
    @inline def getPublicAccessBlockFuture(params: GetPublicAccessBlockRequest): Future[GetPublicAccessBlockOutput] = service.getPublicAccessBlock(params).promise().toFuture
    @inline def getStorageLensConfigurationFuture(params: GetStorageLensConfigurationRequest): Future[GetStorageLensConfigurationResult] = service.getStorageLensConfiguration(params).promise().toFuture
    @inline def getStorageLensConfigurationTaggingFuture(params: GetStorageLensConfigurationTaggingRequest): Future[GetStorageLensConfigurationTaggingResult] = service.getStorageLensConfigurationTagging(params).promise().toFuture
    @inline def listAccessPointsFuture(params: ListAccessPointsRequest): Future[ListAccessPointsResult] = service.listAccessPoints(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResult] = service.listJobs(params).promise().toFuture
    @inline def listRegionalBucketsFuture(params: ListRegionalBucketsRequest): Future[ListRegionalBucketsResult] = service.listRegionalBuckets(params).promise().toFuture
    @inline def listStorageLensConfigurationsFuture(params: ListStorageLensConfigurationsRequest): Future[ListStorageLensConfigurationsResult] = service.listStorageLensConfigurations(params).promise().toFuture
    @inline def putAccessPointPolicyFuture(params: PutAccessPointPolicyRequest): Future[js.Object] = service.putAccessPointPolicy(params).promise().toFuture
    @inline def putBucketLifecycleConfigurationFuture(params: PutBucketLifecycleConfigurationRequest): Future[js.Object] = service.putBucketLifecycleConfiguration(params).promise().toFuture
    @inline def putBucketPolicyFuture(params: PutBucketPolicyRequest): Future[js.Object] = service.putBucketPolicy(params).promise().toFuture
    @inline def putBucketTaggingFuture(params: PutBucketTaggingRequest): Future[js.Object] = service.putBucketTagging(params).promise().toFuture
    @inline def putJobTaggingFuture(params: PutJobTaggingRequest): Future[PutJobTaggingResult] = service.putJobTagging(params).promise().toFuture
    @inline def putPublicAccessBlockFuture(params: PutPublicAccessBlockRequest): Future[js.Object] = service.putPublicAccessBlock(params).promise().toFuture
    @inline def putStorageLensConfigurationFuture(params: PutStorageLensConfigurationRequest): Future[js.Object] = service.putStorageLensConfiguration(params).promise().toFuture
    @inline def putStorageLensConfigurationTaggingFuture(params: PutStorageLensConfigurationTaggingRequest): Future[PutStorageLensConfigurationTaggingResult] = service.putStorageLensConfigurationTagging(params).promise().toFuture
    @inline def updateJobPriorityFuture(params: UpdateJobPriorityRequest): Future[UpdateJobPriorityResult] = service.updateJobPriority(params).promise().toFuture
    @inline def updateJobStatusFuture(params: UpdateJobStatusRequest): Future[UpdateJobStatusResult] = service.updateJobStatus(params).promise().toFuture

  }
}

package s3control {
  @js.native
  @JSImport("aws-sdk/clients/s3control", JSImport.Namespace, "AWS.S3Control")
  class S3Control() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAccessPoint(params: CreateAccessPointRequest): Request[CreateAccessPointResult] = js.native
    def createBucket(params: CreateBucketRequest): Request[CreateBucketResult] = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResult] = js.native
    def deleteAccessPoint(params: DeleteAccessPointRequest): Request[js.Object] = js.native
    def deleteAccessPointPolicy(params: DeleteAccessPointPolicyRequest): Request[js.Object] = js.native
    def deleteBucket(params: DeleteBucketRequest): Request[js.Object] = js.native
    def deleteBucketLifecycleConfiguration(params: DeleteBucketLifecycleConfigurationRequest): Request[js.Object] = js.native
    def deleteBucketPolicy(params: DeleteBucketPolicyRequest): Request[js.Object] = js.native
    def deleteBucketTagging(params: DeleteBucketTaggingRequest): Request[js.Object] = js.native
    def deleteJobTagging(params: DeleteJobTaggingRequest): Request[DeleteJobTaggingResult] = js.native
    def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): Request[js.Object] = js.native
    def deleteStorageLensConfiguration(params: DeleteStorageLensConfigurationRequest): Request[js.Object] = js.native
    def deleteStorageLensConfigurationTagging(params: DeleteStorageLensConfigurationTaggingRequest): Request[DeleteStorageLensConfigurationTaggingResult] = js.native
    def describeJob(params: DescribeJobRequest): Request[DescribeJobResult] = js.native
    def getAccessPoint(params: GetAccessPointRequest): Request[GetAccessPointResult] = js.native
    def getAccessPointPolicy(params: GetAccessPointPolicyRequest): Request[GetAccessPointPolicyResult] = js.native
    def getAccessPointPolicyStatus(params: GetAccessPointPolicyStatusRequest): Request[GetAccessPointPolicyStatusResult] = js.native
    def getBucket(params: GetBucketRequest): Request[GetBucketResult] = js.native
    def getBucketLifecycleConfiguration(params: GetBucketLifecycleConfigurationRequest): Request[GetBucketLifecycleConfigurationResult] = js.native
    def getBucketPolicy(params: GetBucketPolicyRequest): Request[GetBucketPolicyResult] = js.native
    def getBucketTagging(params: GetBucketTaggingRequest): Request[GetBucketTaggingResult] = js.native
    def getJobTagging(params: GetJobTaggingRequest): Request[GetJobTaggingResult] = js.native
    def getPublicAccessBlock(params: GetPublicAccessBlockRequest): Request[GetPublicAccessBlockOutput] = js.native
    def getStorageLensConfiguration(params: GetStorageLensConfigurationRequest): Request[GetStorageLensConfigurationResult] = js.native
    def getStorageLensConfigurationTagging(params: GetStorageLensConfigurationTaggingRequest): Request[GetStorageLensConfigurationTaggingResult] = js.native
    def listAccessPoints(params: ListAccessPointsRequest): Request[ListAccessPointsResult] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult] = js.native
    def listRegionalBuckets(params: ListRegionalBucketsRequest): Request[ListRegionalBucketsResult] = js.native
    def listStorageLensConfigurations(params: ListStorageLensConfigurationsRequest): Request[ListStorageLensConfigurationsResult] = js.native
    def putAccessPointPolicy(params: PutAccessPointPolicyRequest): Request[js.Object] = js.native
    def putBucketLifecycleConfiguration(params: PutBucketLifecycleConfigurationRequest): Request[js.Object] = js.native
    def putBucketPolicy(params: PutBucketPolicyRequest): Request[js.Object] = js.native
    def putBucketTagging(params: PutBucketTaggingRequest): Request[js.Object] = js.native
    def putJobTagging(params: PutJobTaggingRequest): Request[PutJobTaggingResult] = js.native
    def putPublicAccessBlock(params: PutPublicAccessBlockRequest): Request[js.Object] = js.native
    def putStorageLensConfiguration(params: PutStorageLensConfigurationRequest): Request[js.Object] = js.native
    def putStorageLensConfigurationTagging(params: PutStorageLensConfigurationTaggingRequest): Request[PutStorageLensConfigurationTaggingResult] = js.native
    def updateJobPriority(params: UpdateJobPriorityRequest): Request[UpdateJobPriorityResult] = js.native
    def updateJobStatus(params: UpdateJobStatusRequest): Request[UpdateJobStatusResult] = js.native
  }

  /** The container for abort incomplete multipart upload
    */
  @js.native
  trait AbortIncompleteMultipartUpload extends js.Object {
    var DaysAfterInitiation: js.UndefOr[DaysAfterInitiation]
  }

  object AbortIncompleteMultipartUpload {
    @inline
    def apply(
        DaysAfterInitiation: js.UndefOr[DaysAfterInitiation] = js.undefined
    ): AbortIncompleteMultipartUpload = {
      val __obj = js.Dynamic.literal()
      DaysAfterInitiation.foreach(__v => __obj.updateDynamic("DaysAfterInitiation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AbortIncompleteMultipartUpload]
    }
  }

  /** An access point used to access a bucket.
    */
  @js.native
  trait AccessPoint extends js.Object {
    var Bucket: BucketName
    var Name: AccessPointName
    var NetworkOrigin: NetworkOrigin
    var AccessPointArn: js.UndefOr[S3AccessPointArn]
    var VpcConfiguration: js.UndefOr[VpcConfiguration]
  }

  object AccessPoint {
    @inline
    def apply(
        Bucket: BucketName,
        Name: AccessPointName,
        NetworkOrigin: NetworkOrigin,
        AccessPointArn: js.UndefOr[S3AccessPointArn] = js.undefined,
        VpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined
    ): AccessPoint = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "NetworkOrigin" -> NetworkOrigin.asInstanceOf[js.Any]
      )

      AccessPointArn.foreach(__v => __obj.updateDynamic("AccessPointArn")(__v.asInstanceOf[js.Any]))
      VpcConfiguration.foreach(__v => __obj.updateDynamic("VpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessPoint]
    }
  }

  /** A container for the account level Amazon S3 Storage Lens configuration.
    */
  @js.native
  trait AccountLevel extends js.Object {
    var BucketLevel: BucketLevel
    var ActivityMetrics: js.UndefOr[ActivityMetrics]
  }

  object AccountLevel {
    @inline
    def apply(
        BucketLevel: BucketLevel,
        ActivityMetrics: js.UndefOr[ActivityMetrics] = js.undefined
    ): AccountLevel = {
      val __obj = js.Dynamic.literal(
        "BucketLevel" -> BucketLevel.asInstanceOf[js.Any]
      )

      ActivityMetrics.foreach(__v => __obj.updateDynamic("ActivityMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountLevel]
    }
  }

  /** A container for the activity metrics.
    */
  @js.native
  trait ActivityMetrics extends js.Object {
    var IsEnabled: js.UndefOr[IsEnabled]
  }

  object ActivityMetrics {
    @inline
    def apply(
        IsEnabled: js.UndefOr[IsEnabled] = js.undefined
    ): ActivityMetrics = {
      val __obj = js.Dynamic.literal()
      IsEnabled.foreach(__v => __obj.updateDynamic("IsEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityMetrics]
    }
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

  /** A container for the bucket-level configuration.
    */
  @js.native
  trait BucketLevel extends js.Object {
    var ActivityMetrics: js.UndefOr[ActivityMetrics]
    var PrefixLevel: js.UndefOr[PrefixLevel]
  }

  object BucketLevel {
    @inline
    def apply(
        ActivityMetrics: js.UndefOr[ActivityMetrics] = js.undefined,
        PrefixLevel: js.UndefOr[PrefixLevel] = js.undefined
    ): BucketLevel = {
      val __obj = js.Dynamic.literal()
      ActivityMetrics.foreach(__v => __obj.updateDynamic("ActivityMetrics")(__v.asInstanceOf[js.Any]))
      PrefixLevel.foreach(__v => __obj.updateDynamic("PrefixLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketLevel]
    }
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

    @inline def values = js.Array(EU, `eu-west-1`, `us-west-1`, `us-west-2`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `sa-east-1`, `cn-north-1`, `eu-central-1`)
  }

  @js.native
  trait CreateAccessPointRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
    var Name: AccessPointName
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration]
    var VpcConfiguration: js.UndefOr[VpcConfiguration]
  }

  object CreateAccessPointRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: BucketName,
        Name: AccessPointName,
        PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined,
        VpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined
    ): CreateAccessPointRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      PublicAccessBlockConfiguration.foreach(__v => __obj.updateDynamic("PublicAccessBlockConfiguration")(__v.asInstanceOf[js.Any]))
      VpcConfiguration.foreach(__v => __obj.updateDynamic("VpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessPointRequest]
    }
  }

  @js.native
  trait CreateAccessPointResult extends js.Object {
    var AccessPointArn: js.UndefOr[S3AccessPointArn]
  }

  object CreateAccessPointResult {
    @inline
    def apply(
        AccessPointArn: js.UndefOr[S3AccessPointArn] = js.undefined
    ): CreateAccessPointResult = {
      val __obj = js.Dynamic.literal()
      AccessPointArn.foreach(__v => __obj.updateDynamic("AccessPointArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessPointResult]
    }
  }

  /** The container for the bucket configuration.
    *
    * '''Note:'''This is not supported by Amazon S3 on Outposts buckets.
    */
  @js.native
  trait CreateBucketConfiguration extends js.Object {
    var LocationConstraint: js.UndefOr[BucketLocationConstraint]
  }

  object CreateBucketConfiguration {
    @inline
    def apply(
        LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined
    ): CreateBucketConfiguration = {
      val __obj = js.Dynamic.literal()
      LocationConstraint.foreach(__v => __obj.updateDynamic("LocationConstraint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBucketConfiguration]
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
    var OutpostId: js.UndefOr[NonEmptyMaxLength64String]
  }

  object CreateBucketRequest {
    @inline
    def apply(
        Bucket: BucketName,
        ACL: js.UndefOr[BucketCannedACL] = js.undefined,
        CreateBucketConfiguration: js.UndefOr[CreateBucketConfiguration] = js.undefined,
        GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined,
        GrantRead: js.UndefOr[GrantRead] = js.undefined,
        GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined,
        GrantWrite: js.UndefOr[GrantWrite] = js.undefined,
        GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined,
        ObjectLockEnabledForBucket: js.UndefOr[ObjectLockEnabledForBucket] = js.undefined,
        OutpostId: js.UndefOr[NonEmptyMaxLength64String] = js.undefined
    ): CreateBucketRequest = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      ACL.foreach(__v => __obj.updateDynamic("ACL")(__v.asInstanceOf[js.Any]))
      CreateBucketConfiguration.foreach(__v => __obj.updateDynamic("CreateBucketConfiguration")(__v.asInstanceOf[js.Any]))
      GrantFullControl.foreach(__v => __obj.updateDynamic("GrantFullControl")(__v.asInstanceOf[js.Any]))
      GrantRead.foreach(__v => __obj.updateDynamic("GrantRead")(__v.asInstanceOf[js.Any]))
      GrantReadACP.foreach(__v => __obj.updateDynamic("GrantReadACP")(__v.asInstanceOf[js.Any]))
      GrantWrite.foreach(__v => __obj.updateDynamic("GrantWrite")(__v.asInstanceOf[js.Any]))
      GrantWriteACP.foreach(__v => __obj.updateDynamic("GrantWriteACP")(__v.asInstanceOf[js.Any]))
      ObjectLockEnabledForBucket.foreach(__v => __obj.updateDynamic("ObjectLockEnabledForBucket")(__v.asInstanceOf[js.Any]))
      OutpostId.foreach(__v => __obj.updateDynamic("OutpostId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBucketRequest]
    }
  }

  @js.native
  trait CreateBucketResult extends js.Object {
    var BucketArn: js.UndefOr[S3RegionalBucketArn]
    var Location: js.UndefOr[Location]
  }

  object CreateBucketResult {
    @inline
    def apply(
        BucketArn: js.UndefOr[S3RegionalBucketArn] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined
    ): CreateBucketResult = {
      val __obj = js.Dynamic.literal()
      BucketArn.foreach(__v => __obj.updateDynamic("BucketArn")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBucketResult]
    }
  }

  @js.native
  trait CreateJobRequest extends js.Object {
    var AccountId: AccountId
    var ClientRequestToken: NonEmptyMaxLength64String
    var Manifest: JobManifest
    var Operation: JobOperation
    var Priority: JobPriority
    var Report: JobReport
    var RoleArn: IAMRoleArn
    var ConfirmationRequired: js.UndefOr[ConfirmationRequired]
    var Description: js.UndefOr[NonEmptyMaxLength256String]
    var Tags: js.UndefOr[S3TagSet]
  }

  object CreateJobRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ClientRequestToken: NonEmptyMaxLength64String,
        Manifest: JobManifest,
        Operation: JobOperation,
        Priority: JobPriority,
        Report: JobReport,
        RoleArn: IAMRoleArn,
        ConfirmationRequired: js.UndefOr[ConfirmationRequired] = js.undefined,
        Description: js.UndefOr[NonEmptyMaxLength256String] = js.undefined,
        Tags: js.UndefOr[S3TagSet] = js.undefined
    ): CreateJobRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Manifest" -> Manifest.asInstanceOf[js.Any],
        "Operation" -> Operation.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any],
        "Report" -> Report.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ConfirmationRequired.foreach(__v => __obj.updateDynamic("ConfirmationRequired")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResult extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object CreateJobResult {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): CreateJobResult = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobResult]
    }
  }

  @js.native
  trait DeleteAccessPointPolicyRequest extends js.Object {
    var AccountId: AccountId
    var Name: AccessPointName
  }

  object DeleteAccessPointPolicyRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Name: AccessPointName
    ): DeleteAccessPointPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAccessPointPolicyRequest]
    }
  }

  @js.native
  trait DeleteAccessPointRequest extends js.Object {
    var AccountId: AccountId
    var Name: AccessPointName
  }

  object DeleteAccessPointRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Name: AccessPointName
    ): DeleteAccessPointRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAccessPointRequest]
    }
  }

  @js.native
  trait DeleteBucketLifecycleConfigurationRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
  }

  object DeleteBucketLifecycleConfigurationRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: BucketName
    ): DeleteBucketLifecycleConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBucketLifecycleConfigurationRequest]
    }
  }

  @js.native
  trait DeleteBucketPolicyRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
  }

  object DeleteBucketPolicyRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: BucketName
    ): DeleteBucketPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBucketPolicyRequest]
    }
  }

  @js.native
  trait DeleteBucketRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
  }

  object DeleteBucketRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: BucketName
    ): DeleteBucketRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBucketRequest]
    }
  }

  @js.native
  trait DeleteBucketTaggingRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
  }

  object DeleteBucketTaggingRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: BucketName
    ): DeleteBucketTaggingRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBucketTaggingRequest]
    }
  }

  @js.native
  trait DeleteJobTaggingRequest extends js.Object {
    var AccountId: AccountId
    var JobId: JobId
  }

  object DeleteJobTaggingRequest {
    @inline
    def apply(
        AccountId: AccountId,
        JobId: JobId
    ): DeleteJobTaggingRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteJobTaggingRequest]
    }
  }

  @js.native
  trait DeleteJobTaggingResult extends js.Object

  object DeleteJobTaggingResult {
    @inline
    def apply(): DeleteJobTaggingResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteJobTaggingResult]
    }
  }

  @js.native
  trait DeletePublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
  }

  object DeletePublicAccessBlockRequest {
    @inline
    def apply(
        AccountId: AccountId
    ): DeletePublicAccessBlockRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePublicAccessBlockRequest]
    }
  }

  @js.native
  trait DeleteStorageLensConfigurationRequest extends js.Object {
    var AccountId: AccountId
    var ConfigId: ConfigId
  }

  object DeleteStorageLensConfigurationRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ConfigId: ConfigId
    ): DeleteStorageLensConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ConfigId" -> ConfigId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteStorageLensConfigurationRequest]
    }
  }

  @js.native
  trait DeleteStorageLensConfigurationTaggingRequest extends js.Object {
    var AccountId: AccountId
    var ConfigId: ConfigId
  }

  object DeleteStorageLensConfigurationTaggingRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ConfigId: ConfigId
    ): DeleteStorageLensConfigurationTaggingRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ConfigId" -> ConfigId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteStorageLensConfigurationTaggingRequest]
    }
  }

  @js.native
  trait DeleteStorageLensConfigurationTaggingResult extends js.Object

  object DeleteStorageLensConfigurationTaggingResult {
    @inline
    def apply(): DeleteStorageLensConfigurationTaggingResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteStorageLensConfigurationTaggingResult]
    }
  }

  @js.native
  trait DescribeJobRequest extends js.Object {
    var AccountId: AccountId
    var JobId: JobId
  }

  object DescribeJobRequest {
    @inline
    def apply(
        AccountId: AccountId,
        JobId: JobId
    ): DescribeJobRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeJobRequest]
    }
  }

  @js.native
  trait DescribeJobResult extends js.Object {
    var Job: js.UndefOr[JobDescriptor]
  }

  object DescribeJobResult {
    @inline
    def apply(
        Job: js.UndefOr[JobDescriptor] = js.undefined
    ): DescribeJobResult = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobResult]
    }
  }

  /** A container for what Amazon S3 Storage Lens will exclude.
    */
  @js.native
  trait Exclude extends js.Object {
    var Buckets: js.UndefOr[Buckets]
    var Regions: js.UndefOr[Regions]
  }

  object Exclude {
    @inline
    def apply(
        Buckets: js.UndefOr[Buckets] = js.undefined,
        Regions: js.UndefOr[Regions] = js.undefined
    ): Exclude = {
      val __obj = js.Dynamic.literal()
      Buckets.foreach(__v => __obj.updateDynamic("Buckets")(__v.asInstanceOf[js.Any]))
      Regions.foreach(__v => __obj.updateDynamic("Regions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Exclude]
    }
  }

  @js.native
  sealed trait ExpirationStatus extends js.Any
  object ExpirationStatus {
    val Enabled = "Enabled".asInstanceOf[ExpirationStatus]
    val Disabled = "Disabled".asInstanceOf[ExpirationStatus]

    @inline def values = js.Array(Enabled, Disabled)
  }

  @js.native
  sealed trait Format extends js.Any
  object Format {
    val CSV = "CSV".asInstanceOf[Format]
    val Parquet = "Parquet".asInstanceOf[Format]

    @inline def values = js.Array(CSV, Parquet)
  }

  @js.native
  trait GetAccessPointPolicyRequest extends js.Object {
    var AccountId: AccountId
    var Name: AccessPointName
  }

  object GetAccessPointPolicyRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Name: AccessPointName
    ): GetAccessPointPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAccessPointPolicyRequest]
    }
  }

  @js.native
  trait GetAccessPointPolicyResult extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object GetAccessPointPolicyResult {
    @inline
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): GetAccessPointPolicyResult = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccessPointPolicyResult]
    }
  }

  @js.native
  trait GetAccessPointPolicyStatusRequest extends js.Object {
    var AccountId: AccountId
    var Name: AccessPointName
  }

  object GetAccessPointPolicyStatusRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Name: AccessPointName
    ): GetAccessPointPolicyStatusRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAccessPointPolicyStatusRequest]
    }
  }

  @js.native
  trait GetAccessPointPolicyStatusResult extends js.Object {
    var PolicyStatus: js.UndefOr[PolicyStatus]
  }

  object GetAccessPointPolicyStatusResult {
    @inline
    def apply(
        PolicyStatus: js.UndefOr[PolicyStatus] = js.undefined
    ): GetAccessPointPolicyStatusResult = {
      val __obj = js.Dynamic.literal()
      PolicyStatus.foreach(__v => __obj.updateDynamic("PolicyStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccessPointPolicyStatusResult]
    }
  }

  @js.native
  trait GetAccessPointRequest extends js.Object {
    var AccountId: AccountId
    var Name: AccessPointName
  }

  object GetAccessPointRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Name: AccessPointName
    ): GetAccessPointRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAccessPointRequest]
    }
  }

  @js.native
  trait GetAccessPointResult extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var CreationDate: js.UndefOr[CreationDate]
    var Name: js.UndefOr[AccessPointName]
    var NetworkOrigin: js.UndefOr[NetworkOrigin]
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration]
    var VpcConfiguration: js.UndefOr[VpcConfiguration]
  }

  object GetAccessPointResult {
    @inline
    def apply(
        Bucket: js.UndefOr[BucketName] = js.undefined,
        CreationDate: js.UndefOr[CreationDate] = js.undefined,
        Name: js.UndefOr[AccessPointName] = js.undefined,
        NetworkOrigin: js.UndefOr[NetworkOrigin] = js.undefined,
        PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined,
        VpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined
    ): GetAccessPointResult = {
      val __obj = js.Dynamic.literal()
      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NetworkOrigin.foreach(__v => __obj.updateDynamic("NetworkOrigin")(__v.asInstanceOf[js.Any]))
      PublicAccessBlockConfiguration.foreach(__v => __obj.updateDynamic("PublicAccessBlockConfiguration")(__v.asInstanceOf[js.Any]))
      VpcConfiguration.foreach(__v => __obj.updateDynamic("VpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccessPointResult]
    }
  }

  @js.native
  trait GetBucketLifecycleConfigurationRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
  }

  object GetBucketLifecycleConfigurationRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: BucketName
    ): GetBucketLifecycleConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBucketLifecycleConfigurationRequest]
    }
  }

  @js.native
  trait GetBucketLifecycleConfigurationResult extends js.Object {
    var Rules: js.UndefOr[LifecycleRules]
  }

  object GetBucketLifecycleConfigurationResult {
    @inline
    def apply(
        Rules: js.UndefOr[LifecycleRules] = js.undefined
    ): GetBucketLifecycleConfigurationResult = {
      val __obj = js.Dynamic.literal()
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketLifecycleConfigurationResult]
    }
  }

  @js.native
  trait GetBucketPolicyRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
  }

  object GetBucketPolicyRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: BucketName
    ): GetBucketPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBucketPolicyRequest]
    }
  }

  @js.native
  trait GetBucketPolicyResult extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object GetBucketPolicyResult {
    @inline
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): GetBucketPolicyResult = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketPolicyResult]
    }
  }

  @js.native
  trait GetBucketRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
  }

  object GetBucketRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: BucketName
    ): GetBucketRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBucketRequest]
    }
  }

  @js.native
  trait GetBucketResult extends js.Object {
    var Bucket: js.UndefOr[BucketName]
    var CreationDate: js.UndefOr[CreationDate]
    var PublicAccessBlockEnabled: js.UndefOr[PublicAccessBlockEnabled]
  }

  object GetBucketResult {
    @inline
    def apply(
        Bucket: js.UndefOr[BucketName] = js.undefined,
        CreationDate: js.UndefOr[CreationDate] = js.undefined,
        PublicAccessBlockEnabled: js.UndefOr[PublicAccessBlockEnabled] = js.undefined
    ): GetBucketResult = {
      val __obj = js.Dynamic.literal()
      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      PublicAccessBlockEnabled.foreach(__v => __obj.updateDynamic("PublicAccessBlockEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketResult]
    }
  }

  @js.native
  trait GetBucketTaggingRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
  }

  object GetBucketTaggingRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: BucketName
    ): GetBucketTaggingRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBucketTaggingRequest]
    }
  }

  @js.native
  trait GetBucketTaggingResult extends js.Object {
    var TagSet: S3TagSet
  }

  object GetBucketTaggingResult {
    @inline
    def apply(
        TagSet: S3TagSet
    ): GetBucketTaggingResult = {
      val __obj = js.Dynamic.literal(
        "TagSet" -> TagSet.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBucketTaggingResult]
    }
  }

  @js.native
  trait GetJobTaggingRequest extends js.Object {
    var AccountId: AccountId
    var JobId: JobId
  }

  object GetJobTaggingRequest {
    @inline
    def apply(
        AccountId: AccountId,
        JobId: JobId
    ): GetJobTaggingRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJobTaggingRequest]
    }
  }

  @js.native
  trait GetJobTaggingResult extends js.Object {
    var Tags: js.UndefOr[S3TagSet]
  }

  object GetJobTaggingResult {
    @inline
    def apply(
        Tags: js.UndefOr[S3TagSet] = js.undefined
    ): GetJobTaggingResult = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobTaggingResult]
    }
  }

  @js.native
  trait GetPublicAccessBlockOutput extends js.Object {
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration]
  }

  object GetPublicAccessBlockOutput {
    @inline
    def apply(
        PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined
    ): GetPublicAccessBlockOutput = {
      val __obj = js.Dynamic.literal()
      PublicAccessBlockConfiguration.foreach(__v => __obj.updateDynamic("PublicAccessBlockConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPublicAccessBlockOutput]
    }
  }

  @js.native
  trait GetPublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
  }

  object GetPublicAccessBlockRequest {
    @inline
    def apply(
        AccountId: AccountId
    ): GetPublicAccessBlockRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPublicAccessBlockRequest]
    }
  }

  @js.native
  trait GetStorageLensConfigurationRequest extends js.Object {
    var AccountId: AccountId
    var ConfigId: ConfigId
  }

  object GetStorageLensConfigurationRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ConfigId: ConfigId
    ): GetStorageLensConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ConfigId" -> ConfigId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetStorageLensConfigurationRequest]
    }
  }

  @js.native
  trait GetStorageLensConfigurationResult extends js.Object {
    var StorageLensConfiguration: js.UndefOr[StorageLensConfiguration]
  }

  object GetStorageLensConfigurationResult {
    @inline
    def apply(
        StorageLensConfiguration: js.UndefOr[StorageLensConfiguration] = js.undefined
    ): GetStorageLensConfigurationResult = {
      val __obj = js.Dynamic.literal()
      StorageLensConfiguration.foreach(__v => __obj.updateDynamic("StorageLensConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStorageLensConfigurationResult]
    }
  }

  @js.native
  trait GetStorageLensConfigurationTaggingRequest extends js.Object {
    var AccountId: AccountId
    var ConfigId: ConfigId
  }

  object GetStorageLensConfigurationTaggingRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ConfigId: ConfigId
    ): GetStorageLensConfigurationTaggingRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ConfigId" -> ConfigId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetStorageLensConfigurationTaggingRequest]
    }
  }

  @js.native
  trait GetStorageLensConfigurationTaggingResult extends js.Object {
    var Tags: js.UndefOr[StorageLensTags]
  }

  object GetStorageLensConfigurationTaggingResult {
    @inline
    def apply(
        Tags: js.UndefOr[StorageLensTags] = js.undefined
    ): GetStorageLensConfigurationTaggingResult = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStorageLensConfigurationTaggingResult]
    }
  }

  /** A container for what Amazon S3 Storage Lens configuration includes.
    */
  @js.native
  trait Include extends js.Object {
    var Buckets: js.UndefOr[Buckets]
    var Regions: js.UndefOr[Regions]
  }

  object Include {
    @inline
    def apply(
        Buckets: js.UndefOr[Buckets] = js.undefined,
        Regions: js.UndefOr[Regions] = js.undefined
    ): Include = {
      val __obj = js.Dynamic.literal()
      Buckets.foreach(__v => __obj.updateDynamic("Buckets")(__v.asInstanceOf[js.Any]))
      Regions.foreach(__v => __obj.updateDynamic("Regions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Include]
    }
  }

  /** A container element for the job configuration and status information returned by a <code>Describe Job</code> request.
    */
  @js.native
  trait JobDescriptor extends js.Object {
    var ConfirmationRequired: js.UndefOr[ConfirmationRequired]
    var CreationTime: js.UndefOr[JobCreationTime]
    var Description: js.UndefOr[NonEmptyMaxLength256String]
    var FailureReasons: js.UndefOr[JobFailureList]
    var JobArn: js.UndefOr[JobArn]
    var JobId: js.UndefOr[JobId]
    var Manifest: js.UndefOr[JobManifest]
    var Operation: js.UndefOr[JobOperation]
    var Priority: js.UndefOr[JobPriority]
    var ProgressSummary: js.UndefOr[JobProgressSummary]
    var Report: js.UndefOr[JobReport]
    var RoleArn: js.UndefOr[IAMRoleArn]
    var Status: js.UndefOr[JobStatus]
    var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason]
    var SuspendedCause: js.UndefOr[SuspendedCause]
    var SuspendedDate: js.UndefOr[SuspendedDate]
    var TerminationDate: js.UndefOr[JobTerminationDate]
  }

  object JobDescriptor {
    @inline
    def apply(
        ConfirmationRequired: js.UndefOr[ConfirmationRequired] = js.undefined,
        CreationTime: js.UndefOr[JobCreationTime] = js.undefined,
        Description: js.UndefOr[NonEmptyMaxLength256String] = js.undefined,
        FailureReasons: js.UndefOr[JobFailureList] = js.undefined,
        JobArn: js.UndefOr[JobArn] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        Manifest: js.UndefOr[JobManifest] = js.undefined,
        Operation: js.UndefOr[JobOperation] = js.undefined,
        Priority: js.UndefOr[JobPriority] = js.undefined,
        ProgressSummary: js.UndefOr[JobProgressSummary] = js.undefined,
        Report: js.UndefOr[JobReport] = js.undefined,
        RoleArn: js.UndefOr[IAMRoleArn] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined,
        StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.undefined,
        SuspendedCause: js.UndefOr[SuspendedCause] = js.undefined,
        SuspendedDate: js.UndefOr[SuspendedDate] = js.undefined,
        TerminationDate: js.UndefOr[JobTerminationDate] = js.undefined
    ): JobDescriptor = {
      val __obj = js.Dynamic.literal()
      ConfirmationRequired.foreach(__v => __obj.updateDynamic("ConfirmationRequired")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FailureReasons.foreach(__v => __obj.updateDynamic("FailureReasons")(__v.asInstanceOf[js.Any]))
      JobArn.foreach(__v => __obj.updateDynamic("JobArn")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Manifest.foreach(__v => __obj.updateDynamic("Manifest")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      ProgressSummary.foreach(__v => __obj.updateDynamic("ProgressSummary")(__v.asInstanceOf[js.Any]))
      Report.foreach(__v => __obj.updateDynamic("Report")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusUpdateReason.foreach(__v => __obj.updateDynamic("StatusUpdateReason")(__v.asInstanceOf[js.Any]))
      SuspendedCause.foreach(__v => __obj.updateDynamic("SuspendedCause")(__v.asInstanceOf[js.Any]))
      SuspendedDate.foreach(__v => __obj.updateDynamic("SuspendedDate")(__v.asInstanceOf[js.Any]))
      TerminationDate.foreach(__v => __obj.updateDynamic("TerminationDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDescriptor]
    }
  }

  /** If this job failed, this element indicates why the job failed.
    */
  @js.native
  trait JobFailure extends js.Object {
    var FailureCode: js.UndefOr[JobFailureCode]
    var FailureReason: js.UndefOr[JobFailureReason]
  }

  object JobFailure {
    @inline
    def apply(
        FailureCode: js.UndefOr[JobFailureCode] = js.undefined,
        FailureReason: js.UndefOr[JobFailureReason] = js.undefined
    ): JobFailure = {
      val __obj = js.Dynamic.literal()
      FailureCode.foreach(__v => __obj.updateDynamic("FailureCode")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobFailure]
    }
  }

  /** Contains the configuration and status information for a single job retrieved as part of a job list.
    */
  @js.native
  trait JobListDescriptor extends js.Object {
    var CreationTime: js.UndefOr[JobCreationTime]
    var Description: js.UndefOr[NonEmptyMaxLength256String]
    var JobId: js.UndefOr[JobId]
    var Operation: js.UndefOr[OperationName]
    var Priority: js.UndefOr[JobPriority]
    var ProgressSummary: js.UndefOr[JobProgressSummary]
    var Status: js.UndefOr[JobStatus]
    var TerminationDate: js.UndefOr[JobTerminationDate]
  }

  object JobListDescriptor {
    @inline
    def apply(
        CreationTime: js.UndefOr[JobCreationTime] = js.undefined,
        Description: js.UndefOr[NonEmptyMaxLength256String] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        Operation: js.UndefOr[OperationName] = js.undefined,
        Priority: js.UndefOr[JobPriority] = js.undefined,
        ProgressSummary: js.UndefOr[JobProgressSummary] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined,
        TerminationDate: js.UndefOr[JobTerminationDate] = js.undefined
    ): JobListDescriptor = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      ProgressSummary.foreach(__v => __obj.updateDynamic("ProgressSummary")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TerminationDate.foreach(__v => __obj.updateDynamic("TerminationDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobListDescriptor]
    }
  }

  /** Contains the configuration information for a job's manifest.
    */
  @js.native
  trait JobManifest extends js.Object {
    var Location: JobManifestLocation
    var Spec: JobManifestSpec
  }

  object JobManifest {
    @inline
    def apply(
        Location: JobManifestLocation,
        Spec: JobManifestSpec
    ): JobManifest = {
      val __obj = js.Dynamic.literal(
        "Location" -> Location.asInstanceOf[js.Any],
        "Spec" -> Spec.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[JobManifest]
    }
  }

  @js.native
  sealed trait JobManifestFieldName extends js.Any
  object JobManifestFieldName {
    val Ignore = "Ignore".asInstanceOf[JobManifestFieldName]
    val Bucket = "Bucket".asInstanceOf[JobManifestFieldName]
    val Key = "Key".asInstanceOf[JobManifestFieldName]
    val VersionId = "VersionId".asInstanceOf[JobManifestFieldName]

    @inline def values = js.Array(Ignore, Bucket, Key, VersionId)
  }

  @js.native
  sealed trait JobManifestFormat extends js.Any
  object JobManifestFormat {
    val S3BatchOperations_CSV_20180820 = "S3BatchOperations_CSV_20180820".asInstanceOf[JobManifestFormat]
    val S3InventoryReport_CSV_20161130 = "S3InventoryReport_CSV_20161130".asInstanceOf[JobManifestFormat]

    @inline def values = js.Array(S3BatchOperations_CSV_20180820, S3InventoryReport_CSV_20161130)
  }

  /** Contains the information required to locate a manifest object.
    */
  @js.native
  trait JobManifestLocation extends js.Object {
    var ETag: NonEmptyMaxLength1024String
    var ObjectArn: S3KeyArnString
    var ObjectVersionId: js.UndefOr[S3ObjectVersionId]
  }

  object JobManifestLocation {
    @inline
    def apply(
        ETag: NonEmptyMaxLength1024String,
        ObjectArn: S3KeyArnString,
        ObjectVersionId: js.UndefOr[S3ObjectVersionId] = js.undefined
    ): JobManifestLocation = {
      val __obj = js.Dynamic.literal(
        "ETag" -> ETag.asInstanceOf[js.Any],
        "ObjectArn" -> ObjectArn.asInstanceOf[js.Any]
      )

      ObjectVersionId.foreach(__v => __obj.updateDynamic("ObjectVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobManifestLocation]
    }
  }

  /** Describes the format of a manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.
    */
  @js.native
  trait JobManifestSpec extends js.Object {
    var Format: JobManifestFormat
    var Fields: js.UndefOr[JobManifestFieldList]
  }

  object JobManifestSpec {
    @inline
    def apply(
        Format: JobManifestFormat,
        Fields: js.UndefOr[JobManifestFieldList] = js.undefined
    ): JobManifestSpec = {
      val __obj = js.Dynamic.literal(
        "Format" -> Format.asInstanceOf[js.Any]
      )

      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobManifestSpec]
    }
  }

  /** The operation that you want this job to perform on every object listed in the manifest. For more information about the available operations, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html|Operations]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  trait JobOperation extends js.Object {
    var LambdaInvoke: js.UndefOr[LambdaInvokeOperation]
    var S3InitiateRestoreObject: js.UndefOr[S3InitiateRestoreObjectOperation]
    var S3PutObjectAcl: js.UndefOr[S3SetObjectAclOperation]
    var S3PutObjectCopy: js.UndefOr[S3CopyObjectOperation]
    var S3PutObjectLegalHold: js.UndefOr[S3SetObjectLegalHoldOperation]
    var S3PutObjectRetention: js.UndefOr[S3SetObjectRetentionOperation]
    var S3PutObjectTagging: js.UndefOr[S3SetObjectTaggingOperation]
  }

  object JobOperation {
    @inline
    def apply(
        LambdaInvoke: js.UndefOr[LambdaInvokeOperation] = js.undefined,
        S3InitiateRestoreObject: js.UndefOr[S3InitiateRestoreObjectOperation] = js.undefined,
        S3PutObjectAcl: js.UndefOr[S3SetObjectAclOperation] = js.undefined,
        S3PutObjectCopy: js.UndefOr[S3CopyObjectOperation] = js.undefined,
        S3PutObjectLegalHold: js.UndefOr[S3SetObjectLegalHoldOperation] = js.undefined,
        S3PutObjectRetention: js.UndefOr[S3SetObjectRetentionOperation] = js.undefined,
        S3PutObjectTagging: js.UndefOr[S3SetObjectTaggingOperation] = js.undefined
    ): JobOperation = {
      val __obj = js.Dynamic.literal()
      LambdaInvoke.foreach(__v => __obj.updateDynamic("LambdaInvoke")(__v.asInstanceOf[js.Any]))
      S3InitiateRestoreObject.foreach(__v => __obj.updateDynamic("S3InitiateRestoreObject")(__v.asInstanceOf[js.Any]))
      S3PutObjectAcl.foreach(__v => __obj.updateDynamic("S3PutObjectAcl")(__v.asInstanceOf[js.Any]))
      S3PutObjectCopy.foreach(__v => __obj.updateDynamic("S3PutObjectCopy")(__v.asInstanceOf[js.Any]))
      S3PutObjectLegalHold.foreach(__v => __obj.updateDynamic("S3PutObjectLegalHold")(__v.asInstanceOf[js.Any]))
      S3PutObjectRetention.foreach(__v => __obj.updateDynamic("S3PutObjectRetention")(__v.asInstanceOf[js.Any]))
      S3PutObjectTagging.foreach(__v => __obj.updateDynamic("S3PutObjectTagging")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobOperation]
    }
  }

  /** Describes the total number of tasks that the specified job has started, the number of tasks that succeeded, and the number of tasks that failed.
    */
  @js.native
  trait JobProgressSummary extends js.Object {
    var NumberOfTasksFailed: js.UndefOr[JobNumberOfTasksFailed]
    var NumberOfTasksSucceeded: js.UndefOr[JobNumberOfTasksSucceeded]
    var TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks]
  }

  object JobProgressSummary {
    @inline
    def apply(
        NumberOfTasksFailed: js.UndefOr[JobNumberOfTasksFailed] = js.undefined,
        NumberOfTasksSucceeded: js.UndefOr[JobNumberOfTasksSucceeded] = js.undefined,
        TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks] = js.undefined
    ): JobProgressSummary = {
      val __obj = js.Dynamic.literal()
      NumberOfTasksFailed.foreach(__v => __obj.updateDynamic("NumberOfTasksFailed")(__v.asInstanceOf[js.Any]))
      NumberOfTasksSucceeded.foreach(__v => __obj.updateDynamic("NumberOfTasksSucceeded")(__v.asInstanceOf[js.Any]))
      TotalNumberOfTasks.foreach(__v => __obj.updateDynamic("TotalNumberOfTasks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobProgressSummary]
    }
  }

  /** Contains the configuration parameters for a job-completion report.
    */
  @js.native
  trait JobReport extends js.Object {
    var Enabled: Boolean
    var Bucket: js.UndefOr[S3BucketArnString]
    var Format: js.UndefOr[JobReportFormat]
    var Prefix: js.UndefOr[ReportPrefixString]
    var ReportScope: js.UndefOr[JobReportScope]
  }

  object JobReport {
    @inline
    def apply(
        Enabled: Boolean,
        Bucket: js.UndefOr[S3BucketArnString] = js.undefined,
        Format: js.UndefOr[JobReportFormat] = js.undefined,
        Prefix: js.UndefOr[ReportPrefixString] = js.undefined,
        ReportScope: js.UndefOr[JobReportScope] = js.undefined
    ): JobReport = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      ReportScope.foreach(__v => __obj.updateDynamic("ReportScope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobReport]
    }
  }

  @js.native
  sealed trait JobReportFormat extends js.Any
  object JobReportFormat {
    val Report_CSV_20180820 = "Report_CSV_20180820".asInstanceOf[JobReportFormat]

    @inline def values = js.Array(Report_CSV_20180820)
  }

  @js.native
  sealed trait JobReportScope extends js.Any
  object JobReportScope {
    val AllTasks = "AllTasks".asInstanceOf[JobReportScope]
    val FailedTasksOnly = "FailedTasksOnly".asInstanceOf[JobReportScope]

    @inline def values = js.Array(AllTasks, FailedTasksOnly)
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

    @inline def values = js.Array(Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended)
  }

  /** Contains the configuration parameters for a <code>Lambda Invoke</code> operation.
    */
  @js.native
  trait LambdaInvokeOperation extends js.Object {
    var FunctionArn: js.UndefOr[FunctionArnString]
  }

  object LambdaInvokeOperation {
    @inline
    def apply(
        FunctionArn: js.UndefOr[FunctionArnString] = js.undefined
    ): LambdaInvokeOperation = {
      val __obj = js.Dynamic.literal()
      FunctionArn.foreach(__v => __obj.updateDynamic("FunctionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaInvokeOperation]
    }
  }

  /** The container for the Outposts bucket lifecycle configuration.
    */
  @js.native
  trait LifecycleConfiguration extends js.Object {
    var Rules: js.UndefOr[LifecycleRules]
  }

  object LifecycleConfiguration {
    @inline
    def apply(
        Rules: js.UndefOr[LifecycleRules] = js.undefined
    ): LifecycleConfiguration = {
      val __obj = js.Dynamic.literal()
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleConfiguration]
    }
  }

  /** The container of the Outposts bucket lifecycle expiration.
    */
  @js.native
  trait LifecycleExpiration extends js.Object {
    var Date: js.UndefOr[Date]
    var Days: js.UndefOr[Days]
    var ExpiredObjectDeleteMarker: js.UndefOr[ExpiredObjectDeleteMarker]
  }

  object LifecycleExpiration {
    @inline
    def apply(
        Date: js.UndefOr[Date] = js.undefined,
        Days: js.UndefOr[Days] = js.undefined,
        ExpiredObjectDeleteMarker: js.UndefOr[ExpiredObjectDeleteMarker] = js.undefined
    ): LifecycleExpiration = {
      val __obj = js.Dynamic.literal()
      Date.foreach(__v => __obj.updateDynamic("Date")(__v.asInstanceOf[js.Any]))
      Days.foreach(__v => __obj.updateDynamic("Days")(__v.asInstanceOf[js.Any]))
      ExpiredObjectDeleteMarker.foreach(__v => __obj.updateDynamic("ExpiredObjectDeleteMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleExpiration]
    }
  }

  /** The container for the Outposts bucket lifecycle rule.
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
    var Transitions: js.UndefOr[TransitionList]
  }

  object LifecycleRule {
    @inline
    def apply(
        Status: ExpirationStatus,
        AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload] = js.undefined,
        Expiration: js.UndefOr[LifecycleExpiration] = js.undefined,
        Filter: js.UndefOr[LifecycleRuleFilter] = js.undefined,
        ID: js.UndefOr[ID] = js.undefined,
        NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration] = js.undefined,
        NoncurrentVersionTransitions: js.UndefOr[NoncurrentVersionTransitionList] = js.undefined,
        Transitions: js.UndefOr[TransitionList] = js.undefined
    ): LifecycleRule = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      AbortIncompleteMultipartUpload.foreach(__v => __obj.updateDynamic("AbortIncompleteMultipartUpload")(__v.asInstanceOf[js.Any]))
      Expiration.foreach(__v => __obj.updateDynamic("Expiration")(__v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      ID.foreach(__v => __obj.updateDynamic("ID")(__v.asInstanceOf[js.Any]))
      NoncurrentVersionExpiration.foreach(__v => __obj.updateDynamic("NoncurrentVersionExpiration")(__v.asInstanceOf[js.Any]))
      NoncurrentVersionTransitions.foreach(__v => __obj.updateDynamic("NoncurrentVersionTransitions")(__v.asInstanceOf[js.Any]))
      Transitions.foreach(__v => __obj.updateDynamic("Transitions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleRule]
    }
  }

  /** The container for the Outposts bucket lifecycle rule and operator.
    */
  @js.native
  trait LifecycleRuleAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix]
    var Tags: js.UndefOr[S3TagSet]
  }

  object LifecycleRuleAndOperator {
    @inline
    def apply(
        Prefix: js.UndefOr[Prefix] = js.undefined,
        Tags: js.UndefOr[S3TagSet] = js.undefined
    ): LifecycleRuleAndOperator = {
      val __obj = js.Dynamic.literal()
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleRuleAndOperator]
    }
  }

  /** The container for the filter of the lifecycle rule.
    */
  @js.native
  trait LifecycleRuleFilter extends js.Object {
    var And: js.UndefOr[LifecycleRuleAndOperator]
    var Prefix: js.UndefOr[Prefix]
    var Tag: js.UndefOr[S3Tag]
  }

  object LifecycleRuleFilter {
    @inline
    def apply(
        And: js.UndefOr[LifecycleRuleAndOperator] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        Tag: js.UndefOr[S3Tag] = js.undefined
    ): LifecycleRuleFilter = {
      val __obj = js.Dynamic.literal()
      And.foreach(__v => __obj.updateDynamic("And")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      Tag.foreach(__v => __obj.updateDynamic("Tag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleRuleFilter]
    }
  }

  @js.native
  trait ListAccessPointsRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: js.UndefOr[BucketName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NonEmptyMaxLength1024String]
  }

  object ListAccessPointsRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: js.UndefOr[BucketName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
    ): ListAccessPointsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessPointsRequest]
    }
  }

  @js.native
  trait ListAccessPointsResult extends js.Object {
    var AccessPointList: js.UndefOr[AccessPointList]
    var NextToken: js.UndefOr[NonEmptyMaxLength1024String]
  }

  object ListAccessPointsResult {
    @inline
    def apply(
        AccessPointList: js.UndefOr[AccessPointList] = js.undefined,
        NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
    ): ListAccessPointsResult = {
      val __obj = js.Dynamic.literal()
      AccessPointList.foreach(__v => __obj.updateDynamic("AccessPointList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessPointsResult]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var AccountId: AccountId
    var JobStatuses: js.UndefOr[JobStatusList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[StringForNextToken]
  }

  object ListJobsRequest {
    @inline
    def apply(
        AccountId: AccountId,
        JobStatuses: js.UndefOr[JobStatusList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[StringForNextToken] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      JobStatuses.foreach(__v => __obj.updateDynamic("JobStatuses")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResult extends js.Object {
    var Jobs: js.UndefOr[JobListDescriptorList]
    var NextToken: js.UndefOr[StringForNextToken]
  }

  object ListJobsResult {
    @inline
    def apply(
        Jobs: js.UndefOr[JobListDescriptorList] = js.undefined,
        NextToken: js.UndefOr[StringForNextToken] = js.undefined
    ): ListJobsResult = {
      val __obj = js.Dynamic.literal()
      Jobs.foreach(__v => __obj.updateDynamic("Jobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResult]
    }
  }

  @js.native
  trait ListRegionalBucketsRequest extends js.Object {
    var AccountId: AccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NonEmptyMaxLength1024String]
    var OutpostId: js.UndefOr[NonEmptyMaxLength64String]
  }

  object ListRegionalBucketsRequest {
    @inline
    def apply(
        AccountId: AccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        OutpostId: js.UndefOr[NonEmptyMaxLength64String] = js.undefined
    ): ListRegionalBucketsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OutpostId.foreach(__v => __obj.updateDynamic("OutpostId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRegionalBucketsRequest]
    }
  }

  @js.native
  trait ListRegionalBucketsResult extends js.Object {
    var NextToken: js.UndefOr[NonEmptyMaxLength1024String]
    var RegionalBucketList: js.UndefOr[RegionalBucketList]
  }

  object ListRegionalBucketsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        RegionalBucketList: js.UndefOr[RegionalBucketList] = js.undefined
    ): ListRegionalBucketsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RegionalBucketList.foreach(__v => __obj.updateDynamic("RegionalBucketList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRegionalBucketsResult]
    }
  }

  /** Part of <code>ListStorageLensConfigurationResult</code>. Each entry includes the description of the S3 Storage Lens configuration, its home Region, whether it is enabled, its Amazon Resource Name (ARN), and config ID.
    */
  @js.native
  trait ListStorageLensConfigurationEntry extends js.Object {
    var HomeRegion: S3AWSRegion
    var Id: ConfigId
    var StorageLensArn: StorageLensArn
    var IsEnabled: js.UndefOr[IsEnabled]
  }

  object ListStorageLensConfigurationEntry {
    @inline
    def apply(
        HomeRegion: S3AWSRegion,
        Id: ConfigId,
        StorageLensArn: StorageLensArn,
        IsEnabled: js.UndefOr[IsEnabled] = js.undefined
    ): ListStorageLensConfigurationEntry = {
      val __obj = js.Dynamic.literal(
        "HomeRegion" -> HomeRegion.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "StorageLensArn" -> StorageLensArn.asInstanceOf[js.Any]
      )

      IsEnabled.foreach(__v => __obj.updateDynamic("IsEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStorageLensConfigurationEntry]
    }
  }

  @js.native
  trait ListStorageLensConfigurationsRequest extends js.Object {
    var AccountId: AccountId
    var NextToken: js.UndefOr[ContinuationToken]
  }

  object ListStorageLensConfigurationsRequest {
    @inline
    def apply(
        AccountId: AccountId,
        NextToken: js.UndefOr[ContinuationToken] = js.undefined
    ): ListStorageLensConfigurationsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStorageLensConfigurationsRequest]
    }
  }

  @js.native
  trait ListStorageLensConfigurationsResult extends js.Object {
    var NextToken: js.UndefOr[ContinuationToken]
    var StorageLensConfigurationList: js.UndefOr[StorageLensConfigurationList]
  }

  object ListStorageLensConfigurationsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[ContinuationToken] = js.undefined,
        StorageLensConfigurationList: js.UndefOr[StorageLensConfigurationList] = js.undefined
    ): ListStorageLensConfigurationsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StorageLensConfigurationList.foreach(__v => __obj.updateDynamic("StorageLensConfigurationList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStorageLensConfigurationsResult]
    }
  }

  @js.native
  sealed trait NetworkOrigin extends js.Any
  object NetworkOrigin {
    val Internet = "Internet".asInstanceOf[NetworkOrigin]
    val VPC = "VPC".asInstanceOf[NetworkOrigin]

    @inline def values = js.Array(Internet, VPC)
  }

  /** The container of the noncurrent version expiration.
    */
  @js.native
  trait NoncurrentVersionExpiration extends js.Object {
    var NoncurrentDays: js.UndefOr[Days]
  }

  object NoncurrentVersionExpiration {
    @inline
    def apply(
        NoncurrentDays: js.UndefOr[Days] = js.undefined
    ): NoncurrentVersionExpiration = {
      val __obj = js.Dynamic.literal()
      NoncurrentDays.foreach(__v => __obj.updateDynamic("NoncurrentDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoncurrentVersionExpiration]
    }
  }

  /** The container for the noncurrent version transition.
    */
  @js.native
  trait NoncurrentVersionTransition extends js.Object {
    var NoncurrentDays: js.UndefOr[Days]
    var StorageClass: js.UndefOr[TransitionStorageClass]
  }

  object NoncurrentVersionTransition {
    @inline
    def apply(
        NoncurrentDays: js.UndefOr[Days] = js.undefined,
        StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
    ): NoncurrentVersionTransition = {
      val __obj = js.Dynamic.literal()
      NoncurrentDays.foreach(__v => __obj.updateDynamic("NoncurrentDays")(__v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.updateDynamic("StorageClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoncurrentVersionTransition]
    }
  }

  @js.native
  sealed trait OperationName extends js.Any
  object OperationName {
    val LambdaInvoke = "LambdaInvoke".asInstanceOf[OperationName]
    val S3PutObjectCopy = "S3PutObjectCopy".asInstanceOf[OperationName]
    val S3PutObjectAcl = "S3PutObjectAcl".asInstanceOf[OperationName]
    val S3PutObjectTagging = "S3PutObjectTagging".asInstanceOf[OperationName]
    val S3InitiateRestoreObject = "S3InitiateRestoreObject".asInstanceOf[OperationName]
    val S3PutObjectLegalHold = "S3PutObjectLegalHold".asInstanceOf[OperationName]
    val S3PutObjectRetention = "S3PutObjectRetention".asInstanceOf[OperationName]

    @inline def values = js.Array(LambdaInvoke, S3PutObjectCopy, S3PutObjectAcl, S3PutObjectTagging, S3InitiateRestoreObject, S3PutObjectLegalHold, S3PutObjectRetention)
  }

  @js.native
  sealed trait OutputSchemaVersion extends js.Any
  object OutputSchemaVersion {
    val V_1 = "V_1".asInstanceOf[OutputSchemaVersion]

    @inline def values = js.Array(V_1)
  }

  /** Indicates whether this access point policy is public. For more information about how Amazon S3 evaluates policies to determine whether they are public, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status|The Meaning of "Public"]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  trait PolicyStatus extends js.Object {
    var IsPublic: js.UndefOr[IsPublic]
  }

  object PolicyStatus {
    @inline
    def apply(
        IsPublic: js.UndefOr[IsPublic] = js.undefined
    ): PolicyStatus = {
      val __obj = js.Dynamic.literal()
      IsPublic.foreach(__v => __obj.updateDynamic("IsPublic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyStatus]
    }
  }

  /** A container for the prefix-level configuration.
    */
  @js.native
  trait PrefixLevel extends js.Object {
    var StorageMetrics: PrefixLevelStorageMetrics
  }

  object PrefixLevel {
    @inline
    def apply(
        StorageMetrics: PrefixLevelStorageMetrics
    ): PrefixLevel = {
      val __obj = js.Dynamic.literal(
        "StorageMetrics" -> StorageMetrics.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PrefixLevel]
    }
  }

  /** A container for the prefix-level storage metrics for S3 Storage Lens.
    */
  @js.native
  trait PrefixLevelStorageMetrics extends js.Object {
    var IsEnabled: js.UndefOr[IsEnabled]
    var SelectionCriteria: js.UndefOr[SelectionCriteria]
  }

  object PrefixLevelStorageMetrics {
    @inline
    def apply(
        IsEnabled: js.UndefOr[IsEnabled] = js.undefined,
        SelectionCriteria: js.UndefOr[SelectionCriteria] = js.undefined
    ): PrefixLevelStorageMetrics = {
      val __obj = js.Dynamic.literal()
      IsEnabled.foreach(__v => __obj.updateDynamic("IsEnabled")(__v.asInstanceOf[js.Any]))
      SelectionCriteria.foreach(__v => __obj.updateDynamic("SelectionCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrefixLevelStorageMetrics]
    }
  }

  /** The <code>PublicAccessBlock</code> configuration that you want to apply to this Amazon S3 account. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status|The Meaning of "Public"]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    * This is not supported for Amazon S3 on Outposts.
    */
  @js.native
  trait PublicAccessBlockConfiguration extends js.Object {
    var BlockPublicAcls: js.UndefOr[Setting]
    var BlockPublicPolicy: js.UndefOr[Setting]
    var IgnorePublicAcls: js.UndefOr[Setting]
    var RestrictPublicBuckets: js.UndefOr[Setting]
  }

  object PublicAccessBlockConfiguration {
    @inline
    def apply(
        BlockPublicAcls: js.UndefOr[Setting] = js.undefined,
        BlockPublicPolicy: js.UndefOr[Setting] = js.undefined,
        IgnorePublicAcls: js.UndefOr[Setting] = js.undefined,
        RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined
    ): PublicAccessBlockConfiguration = {
      val __obj = js.Dynamic.literal()
      BlockPublicAcls.foreach(__v => __obj.updateDynamic("BlockPublicAcls")(__v.asInstanceOf[js.Any]))
      BlockPublicPolicy.foreach(__v => __obj.updateDynamic("BlockPublicPolicy")(__v.asInstanceOf[js.Any]))
      IgnorePublicAcls.foreach(__v => __obj.updateDynamic("IgnorePublicAcls")(__v.asInstanceOf[js.Any]))
      RestrictPublicBuckets.foreach(__v => __obj.updateDynamic("RestrictPublicBuckets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicAccessBlockConfiguration]
    }
  }

  @js.native
  trait PutAccessPointPolicyRequest extends js.Object {
    var AccountId: AccountId
    var Name: AccessPointName
    var Policy: Policy
  }

  object PutAccessPointPolicyRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Name: AccessPointName,
        Policy: Policy
    ): PutAccessPointPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Policy" -> Policy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutAccessPointPolicyRequest]
    }
  }

  @js.native
  trait PutBucketLifecycleConfigurationRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
    var LifecycleConfiguration: js.UndefOr[LifecycleConfiguration]
  }

  object PutBucketLifecycleConfigurationRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: BucketName,
        LifecycleConfiguration: js.UndefOr[LifecycleConfiguration] = js.undefined
    ): PutBucketLifecycleConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any]
      )

      LifecycleConfiguration.foreach(__v => __obj.updateDynamic("LifecycleConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketLifecycleConfigurationRequest]
    }
  }

  @js.native
  trait PutBucketPolicyRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
    var Policy: Policy
    var ConfirmRemoveSelfBucketAccess: js.UndefOr[ConfirmRemoveSelfBucketAccess]
  }

  object PutBucketPolicyRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: BucketName,
        Policy: Policy,
        ConfirmRemoveSelfBucketAccess: js.UndefOr[ConfirmRemoveSelfBucketAccess] = js.undefined
    ): PutBucketPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Policy" -> Policy.asInstanceOf[js.Any]
      )

      ConfirmRemoveSelfBucketAccess.foreach(__v => __obj.updateDynamic("ConfirmRemoveSelfBucketAccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBucketPolicyRequest]
    }
  }

  @js.native
  trait PutBucketTaggingRequest extends js.Object {
    var AccountId: AccountId
    var Bucket: BucketName
    var Tagging: Tagging
  }

  object PutBucketTaggingRequest {
    @inline
    def apply(
        AccountId: AccountId,
        Bucket: BucketName,
        Tagging: Tagging
    ): PutBucketTaggingRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Tagging" -> Tagging.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutBucketTaggingRequest]
    }
  }

  @js.native
  trait PutJobTaggingRequest extends js.Object {
    var AccountId: AccountId
    var JobId: JobId
    var Tags: S3TagSet
  }

  object PutJobTaggingRequest {
    @inline
    def apply(
        AccountId: AccountId,
        JobId: JobId,
        Tags: S3TagSet
    ): PutJobTaggingRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutJobTaggingRequest]
    }
  }

  @js.native
  trait PutJobTaggingResult extends js.Object

  object PutJobTaggingResult {
    @inline
    def apply(): PutJobTaggingResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutJobTaggingResult]
    }
  }

  @js.native
  trait PutPublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
    var PublicAccessBlockConfiguration: PublicAccessBlockConfiguration
  }

  object PutPublicAccessBlockRequest {
    @inline
    def apply(
        AccountId: AccountId,
        PublicAccessBlockConfiguration: PublicAccessBlockConfiguration
    ): PutPublicAccessBlockRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "PublicAccessBlockConfiguration" -> PublicAccessBlockConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutPublicAccessBlockRequest]
    }
  }

  @js.native
  trait PutStorageLensConfigurationRequest extends js.Object {
    var AccountId: AccountId
    var ConfigId: ConfigId
    var StorageLensConfiguration: StorageLensConfiguration
    var Tags: js.UndefOr[StorageLensTags]
  }

  object PutStorageLensConfigurationRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ConfigId: ConfigId,
        StorageLensConfiguration: StorageLensConfiguration,
        Tags: js.UndefOr[StorageLensTags] = js.undefined
    ): PutStorageLensConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ConfigId" -> ConfigId.asInstanceOf[js.Any],
        "StorageLensConfiguration" -> StorageLensConfiguration.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutStorageLensConfigurationRequest]
    }
  }

  @js.native
  trait PutStorageLensConfigurationTaggingRequest extends js.Object {
    var AccountId: AccountId
    var ConfigId: ConfigId
    var Tags: StorageLensTags
  }

  object PutStorageLensConfigurationTaggingRequest {
    @inline
    def apply(
        AccountId: AccountId,
        ConfigId: ConfigId,
        Tags: StorageLensTags
    ): PutStorageLensConfigurationTaggingRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ConfigId" -> ConfigId.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutStorageLensConfigurationTaggingRequest]
    }
  }

  @js.native
  trait PutStorageLensConfigurationTaggingResult extends js.Object

  object PutStorageLensConfigurationTaggingResult {
    @inline
    def apply(): PutStorageLensConfigurationTaggingResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutStorageLensConfigurationTaggingResult]
    }
  }

  /** The container for the regional bucket.
    */
  @js.native
  trait RegionalBucket extends js.Object {
    var Bucket: BucketName
    var CreationDate: CreationDate
    var PublicAccessBlockEnabled: PublicAccessBlockEnabled
    var BucketArn: js.UndefOr[S3RegionalBucketArn]
    var OutpostId: js.UndefOr[NonEmptyMaxLength64String]
  }

  object RegionalBucket {
    @inline
    def apply(
        Bucket: BucketName,
        CreationDate: CreationDate,
        PublicAccessBlockEnabled: PublicAccessBlockEnabled,
        BucketArn: js.UndefOr[S3RegionalBucketArn] = js.undefined,
        OutpostId: js.UndefOr[NonEmptyMaxLength64String] = js.undefined
    ): RegionalBucket = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "PublicAccessBlockEnabled" -> PublicAccessBlockEnabled.asInstanceOf[js.Any]
      )

      BucketArn.foreach(__v => __obj.updateDynamic("BucketArn")(__v.asInstanceOf[js.Any]))
      OutpostId.foreach(__v => __obj.updateDynamic("OutpostId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegionalBucket]
    }
  }

  @js.native
  sealed trait RequestedJobStatus extends js.Any
  object RequestedJobStatus {
    val Cancelled = "Cancelled".asInstanceOf[RequestedJobStatus]
    val Ready = "Ready".asInstanceOf[RequestedJobStatus]

    @inline def values = js.Array(Cancelled, Ready)
  }

  /** <p/>
    */
  @js.native
  trait S3AccessControlList extends js.Object {
    var Owner: S3ObjectOwner
    var Grants: js.UndefOr[S3GrantList]
  }

  object S3AccessControlList {
    @inline
    def apply(
        Owner: S3ObjectOwner,
        Grants: js.UndefOr[S3GrantList] = js.undefined
    ): S3AccessControlList = {
      val __obj = js.Dynamic.literal(
        "Owner" -> Owner.asInstanceOf[js.Any]
      )

      Grants.foreach(__v => __obj.updateDynamic("Grants")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3AccessControlList]
    }
  }

  /** <p/>
    */
  @js.native
  trait S3AccessControlPolicy extends js.Object {
    var AccessControlList: js.UndefOr[S3AccessControlList]
    var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList]
  }

  object S3AccessControlPolicy {
    @inline
    def apply(
        AccessControlList: js.UndefOr[S3AccessControlList] = js.undefined,
        CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.undefined
    ): S3AccessControlPolicy = {
      val __obj = js.Dynamic.literal()
      AccessControlList.foreach(__v => __obj.updateDynamic("AccessControlList")(__v.asInstanceOf[js.Any]))
      CannedAccessControlList.foreach(__v => __obj.updateDynamic("CannedAccessControlList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3AccessControlPolicy]
    }
  }

  /** A container for the bucket where the Amazon S3 Storage Lens metrics export files are located.
    */
  @js.native
  trait S3BucketDestination extends js.Object {
    var AccountId: AccountId
    var Arn: S3BucketArnString
    var Format: Format
    var OutputSchemaVersion: OutputSchemaVersion
    var Encryption: js.UndefOr[StorageLensDataExportEncryption]
    var Prefix: js.UndefOr[Prefix]
  }

  object S3BucketDestination {
    @inline
    def apply(
        AccountId: AccountId,
        Arn: S3BucketArnString,
        Format: Format,
        OutputSchemaVersion: OutputSchemaVersion,
        Encryption: js.UndefOr[StorageLensDataExportEncryption] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined
    ): S3BucketDestination = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any],
        "OutputSchemaVersion" -> OutputSchemaVersion.asInstanceOf[js.Any]
      )

      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3BucketDestination]
    }
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

    @inline def values = js.Array(`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`)
  }

  /** Contains the configuration parameters for a PUT Copy object operation. S3 Batch Operations passes every object to the underlying PUT Copy object API. For more information about the parameters for this operation, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectCOPY.html|PUT Object - Copy]].
    */
  @js.native
  trait S3CopyObjectOperation extends js.Object {
    var AccessControlGrants: js.UndefOr[S3GrantList]
    var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList]
    var MetadataDirective: js.UndefOr[S3MetadataDirective]
    var ModifiedSinceConstraint: js.UndefOr[TimeStamp]
    var NewObjectMetadata: js.UndefOr[S3ObjectMetadata]
    var NewObjectTagging: js.UndefOr[S3TagSet]
    var ObjectLockLegalHoldStatus: js.UndefOr[S3ObjectLockLegalHoldStatus]
    var ObjectLockMode: js.UndefOr[S3ObjectLockMode]
    var ObjectLockRetainUntilDate: js.UndefOr[TimeStamp]
    var RedirectLocation: js.UndefOr[NonEmptyMaxLength2048String]
    var RequesterPays: js.UndefOr[Boolean]
    var SSEAwsKmsKeyId: js.UndefOr[KmsKeyArnString]
    var StorageClass: js.UndefOr[S3StorageClass]
    var TargetKeyPrefix: js.UndefOr[NonEmptyMaxLength1024String]
    var TargetResource: js.UndefOr[S3BucketArnString]
    var UnModifiedSinceConstraint: js.UndefOr[TimeStamp]
  }

  object S3CopyObjectOperation {
    @inline
    def apply(
        AccessControlGrants: js.UndefOr[S3GrantList] = js.undefined,
        CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.undefined,
        MetadataDirective: js.UndefOr[S3MetadataDirective] = js.undefined,
        ModifiedSinceConstraint: js.UndefOr[TimeStamp] = js.undefined,
        NewObjectMetadata: js.UndefOr[S3ObjectMetadata] = js.undefined,
        NewObjectTagging: js.UndefOr[S3TagSet] = js.undefined,
        ObjectLockLegalHoldStatus: js.UndefOr[S3ObjectLockLegalHoldStatus] = js.undefined,
        ObjectLockMode: js.UndefOr[S3ObjectLockMode] = js.undefined,
        ObjectLockRetainUntilDate: js.UndefOr[TimeStamp] = js.undefined,
        RedirectLocation: js.UndefOr[NonEmptyMaxLength2048String] = js.undefined,
        RequesterPays: js.UndefOr[Boolean] = js.undefined,
        SSEAwsKmsKeyId: js.UndefOr[KmsKeyArnString] = js.undefined,
        StorageClass: js.UndefOr[S3StorageClass] = js.undefined,
        TargetKeyPrefix: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        TargetResource: js.UndefOr[S3BucketArnString] = js.undefined,
        UnModifiedSinceConstraint: js.UndefOr[TimeStamp] = js.undefined
    ): S3CopyObjectOperation = {
      val __obj = js.Dynamic.literal()
      AccessControlGrants.foreach(__v => __obj.updateDynamic("AccessControlGrants")(__v.asInstanceOf[js.Any]))
      CannedAccessControlList.foreach(__v => __obj.updateDynamic("CannedAccessControlList")(__v.asInstanceOf[js.Any]))
      MetadataDirective.foreach(__v => __obj.updateDynamic("MetadataDirective")(__v.asInstanceOf[js.Any]))
      ModifiedSinceConstraint.foreach(__v => __obj.updateDynamic("ModifiedSinceConstraint")(__v.asInstanceOf[js.Any]))
      NewObjectMetadata.foreach(__v => __obj.updateDynamic("NewObjectMetadata")(__v.asInstanceOf[js.Any]))
      NewObjectTagging.foreach(__v => __obj.updateDynamic("NewObjectTagging")(__v.asInstanceOf[js.Any]))
      ObjectLockLegalHoldStatus.foreach(__v => __obj.updateDynamic("ObjectLockLegalHoldStatus")(__v.asInstanceOf[js.Any]))
      ObjectLockMode.foreach(__v => __obj.updateDynamic("ObjectLockMode")(__v.asInstanceOf[js.Any]))
      ObjectLockRetainUntilDate.foreach(__v => __obj.updateDynamic("ObjectLockRetainUntilDate")(__v.asInstanceOf[js.Any]))
      RedirectLocation.foreach(__v => __obj.updateDynamic("RedirectLocation")(__v.asInstanceOf[js.Any]))
      RequesterPays.foreach(__v => __obj.updateDynamic("RequesterPays")(__v.asInstanceOf[js.Any]))
      SSEAwsKmsKeyId.foreach(__v => __obj.updateDynamic("SSEAwsKmsKeyId")(__v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.updateDynamic("StorageClass")(__v.asInstanceOf[js.Any]))
      TargetKeyPrefix.foreach(__v => __obj.updateDynamic("TargetKeyPrefix")(__v.asInstanceOf[js.Any]))
      TargetResource.foreach(__v => __obj.updateDynamic("TargetResource")(__v.asInstanceOf[js.Any]))
      UnModifiedSinceConstraint.foreach(__v => __obj.updateDynamic("UnModifiedSinceConstraint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3CopyObjectOperation]
    }
  }

  @js.native
  sealed trait S3GlacierJobTier extends js.Any
  object S3GlacierJobTier {
    val BULK = "BULK".asInstanceOf[S3GlacierJobTier]
    val STANDARD = "STANDARD".asInstanceOf[S3GlacierJobTier]

    @inline def values = js.Array(BULK, STANDARD)
  }

  /** <p/>
    */
  @js.native
  trait S3Grant extends js.Object {
    var Grantee: js.UndefOr[S3Grantee]
    var Permission: js.UndefOr[S3Permission]
  }

  object S3Grant {
    @inline
    def apply(
        Grantee: js.UndefOr[S3Grantee] = js.undefined,
        Permission: js.UndefOr[S3Permission] = js.undefined
    ): S3Grant = {
      val __obj = js.Dynamic.literal()
      Grantee.foreach(__v => __obj.updateDynamic("Grantee")(__v.asInstanceOf[js.Any]))
      Permission.foreach(__v => __obj.updateDynamic("Permission")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Grant]
    }
  }

  /** <p/>
    */
  @js.native
  trait S3Grantee extends js.Object {
    var DisplayName: js.UndefOr[NonEmptyMaxLength1024String]
    var Identifier: js.UndefOr[NonEmptyMaxLength1024String]
    var TypeIdentifier: js.UndefOr[S3GranteeTypeIdentifier]
  }

  object S3Grantee {
    @inline
    def apply(
        DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        Identifier: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        TypeIdentifier: js.UndefOr[S3GranteeTypeIdentifier] = js.undefined
    ): S3Grantee = {
      val __obj = js.Dynamic.literal()
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      TypeIdentifier.foreach(__v => __obj.updateDynamic("TypeIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Grantee]
    }
  }

  @js.native
  sealed trait S3GranteeTypeIdentifier extends js.Any
  object S3GranteeTypeIdentifier {
    val id = "id".asInstanceOf[S3GranteeTypeIdentifier]
    val emailAddress = "emailAddress".asInstanceOf[S3GranteeTypeIdentifier]
    val uri = "uri".asInstanceOf[S3GranteeTypeIdentifier]

    @inline def values = js.Array(id, emailAddress, uri)
  }

  /** Contains the configuration parameters for an S3 Initiate Restore Object job. S3 Batch Operations passes every object to the underlying POST Object restore API. For more information about the parameters for this operation, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPOSTrestore.html#RESTObjectPOSTrestore-restore-request|RestoreObject]].
    */
  @js.native
  trait S3InitiateRestoreObjectOperation extends js.Object {
    var ExpirationInDays: js.UndefOr[S3ExpirationInDays]
    var GlacierJobTier: js.UndefOr[S3GlacierJobTier]
  }

  object S3InitiateRestoreObjectOperation {
    @inline
    def apply(
        ExpirationInDays: js.UndefOr[S3ExpirationInDays] = js.undefined,
        GlacierJobTier: js.UndefOr[S3GlacierJobTier] = js.undefined
    ): S3InitiateRestoreObjectOperation = {
      val __obj = js.Dynamic.literal()
      ExpirationInDays.foreach(__v => __obj.updateDynamic("ExpirationInDays")(__v.asInstanceOf[js.Any]))
      GlacierJobTier.foreach(__v => __obj.updateDynamic("GlacierJobTier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3InitiateRestoreObjectOperation]
    }
  }

  @js.native
  sealed trait S3MetadataDirective extends js.Any
  object S3MetadataDirective {
    val COPY = "COPY".asInstanceOf[S3MetadataDirective]
    val REPLACE = "REPLACE".asInstanceOf[S3MetadataDirective]

    @inline def values = js.Array(COPY, REPLACE)
  }

  /** Whether S3 Object Lock legal hold will be applied to objects in an S3 Batch Operations job.
    */
  @js.native
  trait S3ObjectLockLegalHold extends js.Object {
    var Status: S3ObjectLockLegalHoldStatus
  }

  object S3ObjectLockLegalHold {
    @inline
    def apply(
        Status: S3ObjectLockLegalHoldStatus
    ): S3ObjectLockLegalHold = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3ObjectLockLegalHold]
    }
  }

  @js.native
  sealed trait S3ObjectLockLegalHoldStatus extends js.Any
  object S3ObjectLockLegalHoldStatus {
    val OFF = "OFF".asInstanceOf[S3ObjectLockLegalHoldStatus]
    val ON = "ON".asInstanceOf[S3ObjectLockLegalHoldStatus]

    @inline def values = js.Array(OFF, ON)
  }

  @js.native
  sealed trait S3ObjectLockMode extends js.Any
  object S3ObjectLockMode {
    val COMPLIANCE = "COMPLIANCE".asInstanceOf[S3ObjectLockMode]
    val GOVERNANCE = "GOVERNANCE".asInstanceOf[S3ObjectLockMode]

    @inline def values = js.Array(COMPLIANCE, GOVERNANCE)
  }

  @js.native
  sealed trait S3ObjectLockRetentionMode extends js.Any
  object S3ObjectLockRetentionMode {
    val COMPLIANCE = "COMPLIANCE".asInstanceOf[S3ObjectLockRetentionMode]
    val GOVERNANCE = "GOVERNANCE".asInstanceOf[S3ObjectLockRetentionMode]

    @inline def values = js.Array(COMPLIANCE, GOVERNANCE)
  }

  /** <p/>
    */
  @js.native
  trait S3ObjectMetadata extends js.Object {
    var CacheControl: js.UndefOr[NonEmptyMaxLength1024String]
    var ContentDisposition: js.UndefOr[NonEmptyMaxLength1024String]
    var ContentEncoding: js.UndefOr[NonEmptyMaxLength1024String]
    var ContentLanguage: js.UndefOr[NonEmptyMaxLength1024String]
    var ContentLength: js.UndefOr[S3ContentLength]
    var ContentMD5: js.UndefOr[NonEmptyMaxLength1024String]
    var ContentType: js.UndefOr[NonEmptyMaxLength1024String]
    var HttpExpiresDate: js.UndefOr[TimeStamp]
    var RequesterCharged: js.UndefOr[Boolean]
    var SSEAlgorithm: js.UndefOr[S3SSEAlgorithm]
    var UserMetadata: js.UndefOr[S3UserMetadata]
  }

  object S3ObjectMetadata {
    @inline
    def apply(
        CacheControl: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        ContentDisposition: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        ContentEncoding: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        ContentLanguage: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        ContentLength: js.UndefOr[S3ContentLength] = js.undefined,
        ContentMD5: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        ContentType: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        HttpExpiresDate: js.UndefOr[TimeStamp] = js.undefined,
        RequesterCharged: js.UndefOr[Boolean] = js.undefined,
        SSEAlgorithm: js.UndefOr[S3SSEAlgorithm] = js.undefined,
        UserMetadata: js.UndefOr[S3UserMetadata] = js.undefined
    ): S3ObjectMetadata = {
      val __obj = js.Dynamic.literal()
      CacheControl.foreach(__v => __obj.updateDynamic("CacheControl")(__v.asInstanceOf[js.Any]))
      ContentDisposition.foreach(__v => __obj.updateDynamic("ContentDisposition")(__v.asInstanceOf[js.Any]))
      ContentEncoding.foreach(__v => __obj.updateDynamic("ContentEncoding")(__v.asInstanceOf[js.Any]))
      ContentLanguage.foreach(__v => __obj.updateDynamic("ContentLanguage")(__v.asInstanceOf[js.Any]))
      ContentLength.foreach(__v => __obj.updateDynamic("ContentLength")(__v.asInstanceOf[js.Any]))
      ContentMD5.foreach(__v => __obj.updateDynamic("ContentMD5")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      HttpExpiresDate.foreach(__v => __obj.updateDynamic("HttpExpiresDate")(__v.asInstanceOf[js.Any]))
      RequesterCharged.foreach(__v => __obj.updateDynamic("RequesterCharged")(__v.asInstanceOf[js.Any]))
      SSEAlgorithm.foreach(__v => __obj.updateDynamic("SSEAlgorithm")(__v.asInstanceOf[js.Any]))
      UserMetadata.foreach(__v => __obj.updateDynamic("UserMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ObjectMetadata]
    }
  }

  /** <p/>
    */
  @js.native
  trait S3ObjectOwner extends js.Object {
    var DisplayName: js.UndefOr[NonEmptyMaxLength1024String]
    var ID: js.UndefOr[NonEmptyMaxLength1024String]
  }

  object S3ObjectOwner {
    @inline
    def apply(
        DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined,
        ID: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
    ): S3ObjectOwner = {
      val __obj = js.Dynamic.literal()
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      ID.foreach(__v => __obj.updateDynamic("ID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ObjectOwner]
    }
  }

  @js.native
  sealed trait S3Permission extends js.Any
  object S3Permission {
    val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[S3Permission]
    val READ = "READ".asInstanceOf[S3Permission]
    val WRITE = "WRITE".asInstanceOf[S3Permission]
    val READ_ACP = "READ_ACP".asInstanceOf[S3Permission]
    val WRITE_ACP = "WRITE_ACP".asInstanceOf[S3Permission]

    @inline def values = js.Array(FULL_CONTROL, READ, WRITE, READ_ACP, WRITE_ACP)
  }

  /** Contains the S3 Object Lock retention mode to be applied to all objects in the S3 Batch Operations job. If you don't provide <code>Mode</code> and <code>RetainUntilDate</code> data types in your operation, you will remove the retention from your objects. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-retention-date.html|Using S3 Object Lock retention with S3 Batch Operations]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  trait S3Retention extends js.Object {
    var Mode: js.UndefOr[S3ObjectLockRetentionMode]
    var RetainUntilDate: js.UndefOr[TimeStamp]
  }

  object S3Retention {
    @inline
    def apply(
        Mode: js.UndefOr[S3ObjectLockRetentionMode] = js.undefined,
        RetainUntilDate: js.UndefOr[TimeStamp] = js.undefined
    ): S3Retention = {
      val __obj = js.Dynamic.literal()
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      RetainUntilDate.foreach(__v => __obj.updateDynamic("RetainUntilDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Retention]
    }
  }

  @js.native
  sealed trait S3SSEAlgorithm extends js.Any
  object S3SSEAlgorithm {
    val AES256 = "AES256".asInstanceOf[S3SSEAlgorithm]
    val KMS = "KMS".asInstanceOf[S3SSEAlgorithm]

    @inline def values = js.Array(AES256, KMS)
  }

  /** Contains the configuration parameters for a Set Object ACL operation. S3 Batch Operations passes every object to the underlying PUT Object acl API. For more information about the parameters for this operation, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTacl.html|PUT Object acl]].
    */
  @js.native
  trait S3SetObjectAclOperation extends js.Object {
    var AccessControlPolicy: js.UndefOr[S3AccessControlPolicy]
  }

  object S3SetObjectAclOperation {
    @inline
    def apply(
        AccessControlPolicy: js.UndefOr[S3AccessControlPolicy] = js.undefined
    ): S3SetObjectAclOperation = {
      val __obj = js.Dynamic.literal()
      AccessControlPolicy.foreach(__v => __obj.updateDynamic("AccessControlPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3SetObjectAclOperation]
    }
  }

  /** Contains the configuration for an S3 Object Lock legal hold operation that an S3 Batch Operations job passes every object to the underlying <code>PutObjectLegalHold</code> API. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-legal-hold.html|Using S3 Object Lock legal hold with S3 Batch Operations]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  trait S3SetObjectLegalHoldOperation extends js.Object {
    var LegalHold: S3ObjectLockLegalHold
  }

  object S3SetObjectLegalHoldOperation {
    @inline
    def apply(
        LegalHold: S3ObjectLockLegalHold
    ): S3SetObjectLegalHoldOperation = {
      val __obj = js.Dynamic.literal(
        "LegalHold" -> LegalHold.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3SetObjectLegalHoldOperation]
    }
  }

  /** Contains the configuration parameters for the Object Lock retention action for an S3 Batch Operations job. Batch Operations passes every object to the underlying <code>PutObjectRetention</code> API. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-retention-date.html|Using S3 Object Lock retention with S3 Batch Operations]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  trait S3SetObjectRetentionOperation extends js.Object {
    var Retention: S3Retention
    var BypassGovernanceRetention: js.UndefOr[Boolean]
  }

  object S3SetObjectRetentionOperation {
    @inline
    def apply(
        Retention: S3Retention,
        BypassGovernanceRetention: js.UndefOr[Boolean] = js.undefined
    ): S3SetObjectRetentionOperation = {
      val __obj = js.Dynamic.literal(
        "Retention" -> Retention.asInstanceOf[js.Any]
      )

      BypassGovernanceRetention.foreach(__v => __obj.updateDynamic("BypassGovernanceRetention")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3SetObjectRetentionOperation]
    }
  }

  /** Contains the configuration parameters for a Set Object Tagging operation. S3 Batch Operations passes every object to the underlying PUT Object tagging API. For more information about the parameters for this operation, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUTtagging.html|PUT Object tagging]].
    */
  @js.native
  trait S3SetObjectTaggingOperation extends js.Object {
    var TagSet: js.UndefOr[S3TagSet]
  }

  object S3SetObjectTaggingOperation {
    @inline
    def apply(
        TagSet: js.UndefOr[S3TagSet] = js.undefined
    ): S3SetObjectTaggingOperation = {
      val __obj = js.Dynamic.literal()
      TagSet.foreach(__v => __obj.updateDynamic("TagSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3SetObjectTaggingOperation]
    }
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

    @inline def values = js.Array(STANDARD, STANDARD_IA, ONEZONE_IA, GLACIER, INTELLIGENT_TIERING, DEEP_ARCHIVE)
  }

  /** <p/>
    */
  @js.native
  trait S3Tag extends js.Object {
    var Key: TagKeyString
    var Value: TagValueString
  }

  object S3Tag {
    @inline
    def apply(
        Key: TagKeyString,
        Value: TagValueString
    ): S3Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Tag]
    }
  }

  /** <p/>
    */
  @js.native
  trait SSEKMS extends js.Object {
    var KeyId: SSEKMSKeyId
  }

  object SSEKMS {
    @inline
    def apply(
        KeyId: SSEKMSKeyId
    ): SSEKMS = {
      val __obj = js.Dynamic.literal(
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SSEKMS]
    }
  }

  /** <p/>
    */
  @js.native
  trait SSES3 extends js.Object

  object SSES3 {
    @inline
    def apply(): SSES3 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SSES3]
    }
  }

  /** <p/>
    */
  @js.native
  trait SelectionCriteria extends js.Object {
    var Delimiter: js.UndefOr[StorageLensPrefixLevelDelimiter]
    var MaxDepth: js.UndefOr[StorageLensPrefixLevelMaxDepth]
    var MinStorageBytesPercentage: js.UndefOr[MinStorageBytesPercentage]
  }

  object SelectionCriteria {
    @inline
    def apply(
        Delimiter: js.UndefOr[StorageLensPrefixLevelDelimiter] = js.undefined,
        MaxDepth: js.UndefOr[StorageLensPrefixLevelMaxDepth] = js.undefined,
        MinStorageBytesPercentage: js.UndefOr[MinStorageBytesPercentage] = js.undefined
    ): SelectionCriteria = {
      val __obj = js.Dynamic.literal()
      Delimiter.foreach(__v => __obj.updateDynamic("Delimiter")(__v.asInstanceOf[js.Any]))
      MaxDepth.foreach(__v => __obj.updateDynamic("MaxDepth")(__v.asInstanceOf[js.Any]))
      MinStorageBytesPercentage.foreach(__v => __obj.updateDynamic("MinStorageBytesPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectionCriteria]
    }
  }

  /** The AWS organization for your S3 Storage Lens.
    */
  @js.native
  trait StorageLensAwsOrg extends js.Object {
    var Arn: AwsOrgArn
  }

  object StorageLensAwsOrg {
    @inline
    def apply(
        Arn: AwsOrgArn
    ): StorageLensAwsOrg = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StorageLensAwsOrg]
    }
  }

  /** A container for the Amazon S3 Storage Lens configuration.
    */
  @js.native
  trait StorageLensConfiguration extends js.Object {
    var AccountLevel: AccountLevel
    var Id: ConfigId
    var IsEnabled: IsEnabled
    var AwsOrg: js.UndefOr[StorageLensAwsOrg]
    var DataExport: js.UndefOr[StorageLensDataExport]
    var Exclude: js.UndefOr[Exclude]
    var Include: js.UndefOr[Include]
    var StorageLensArn: js.UndefOr[StorageLensArn]
  }

  object StorageLensConfiguration {
    @inline
    def apply(
        AccountLevel: AccountLevel,
        Id: ConfigId,
        IsEnabled: IsEnabled,
        AwsOrg: js.UndefOr[StorageLensAwsOrg] = js.undefined,
        DataExport: js.UndefOr[StorageLensDataExport] = js.undefined,
        Exclude: js.UndefOr[Exclude] = js.undefined,
        Include: js.UndefOr[Include] = js.undefined,
        StorageLensArn: js.UndefOr[StorageLensArn] = js.undefined
    ): StorageLensConfiguration = {
      val __obj = js.Dynamic.literal(
        "AccountLevel" -> AccountLevel.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "IsEnabled" -> IsEnabled.asInstanceOf[js.Any]
      )

      AwsOrg.foreach(__v => __obj.updateDynamic("AwsOrg")(__v.asInstanceOf[js.Any]))
      DataExport.foreach(__v => __obj.updateDynamic("DataExport")(__v.asInstanceOf[js.Any]))
      Exclude.foreach(__v => __obj.updateDynamic("Exclude")(__v.asInstanceOf[js.Any]))
      Include.foreach(__v => __obj.updateDynamic("Include")(__v.asInstanceOf[js.Any]))
      StorageLensArn.foreach(__v => __obj.updateDynamic("StorageLensArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageLensConfiguration]
    }
  }

  /** A container to specify the properties of your S3 Storage Lens metrics export, including the destination, schema, and format.
    */
  @js.native
  trait StorageLensDataExport extends js.Object {
    var S3BucketDestination: S3BucketDestination
  }

  object StorageLensDataExport {
    @inline
    def apply(
        S3BucketDestination: S3BucketDestination
    ): StorageLensDataExport = {
      val __obj = js.Dynamic.literal(
        "S3BucketDestination" -> S3BucketDestination.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StorageLensDataExport]
    }
  }

  /** A container for the encryption of the S3 Storage Lens metrics exports.
    */
  @js.native
  trait StorageLensDataExportEncryption extends js.Object {
    var SSEKMS: js.UndefOr[SSEKMS]
    var SSES3: js.UndefOr[SSES3]
  }

  object StorageLensDataExportEncryption {
    @inline
    def apply(
        SSEKMS: js.UndefOr[SSEKMS] = js.undefined,
        SSES3: js.UndefOr[SSES3] = js.undefined
    ): StorageLensDataExportEncryption = {
      val __obj = js.Dynamic.literal()
      SSEKMS.foreach(__v => __obj.updateDynamic("SSEKMS")(__v.asInstanceOf[js.Any]))
      SSES3.foreach(__v => __obj.updateDynamic("SSES3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageLensDataExportEncryption]
    }
  }

  /** <p/>
    */
  @js.native
  trait StorageLensTag extends js.Object {
    var Key: TagKeyString
    var Value: TagValueString
  }

  object StorageLensTag {
    @inline
    def apply(
        Key: TagKeyString,
        Value: TagValueString
    ): StorageLensTag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StorageLensTag]
    }
  }

  /** <p/>
    */
  @js.native
  trait Tagging extends js.Object {
    var TagSet: S3TagSet
  }

  object Tagging {
    @inline
    def apply(
        TagSet: S3TagSet
    ): Tagging = {
      val __obj = js.Dynamic.literal(
        "TagSet" -> TagSet.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tagging]
    }
  }

  /** Specifies when an object transitions to a specified storage class. For more information about Amazon S3 Lifecycle configuration rules, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html| Transitioning objects using Amazon S3 Lifecycle]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
    */
  @js.native
  trait Transition extends js.Object {
    var Date: js.UndefOr[Date]
    var Days: js.UndefOr[Days]
    var StorageClass: js.UndefOr[TransitionStorageClass]
  }

  object Transition {
    @inline
    def apply(
        Date: js.UndefOr[Date] = js.undefined,
        Days: js.UndefOr[Days] = js.undefined,
        StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
    ): Transition = {
      val __obj = js.Dynamic.literal()
      Date.foreach(__v => __obj.updateDynamic("Date")(__v.asInstanceOf[js.Any]))
      Days.foreach(__v => __obj.updateDynamic("Days")(__v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.updateDynamic("StorageClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Transition]
    }
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
  trait UpdateJobPriorityRequest extends js.Object {
    var AccountId: AccountId
    var JobId: JobId
    var Priority: JobPriority
  }

  object UpdateJobPriorityRequest {
    @inline
    def apply(
        AccountId: AccountId,
        JobId: JobId,
        Priority: JobPriority
    ): UpdateJobPriorityRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateJobPriorityRequest]
    }
  }

  @js.native
  trait UpdateJobPriorityResult extends js.Object {
    var JobId: JobId
    var Priority: JobPriority
  }

  object UpdateJobPriorityResult {
    @inline
    def apply(
        JobId: JobId,
        Priority: JobPriority
    ): UpdateJobPriorityResult = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateJobPriorityResult]
    }
  }

  @js.native
  trait UpdateJobStatusRequest extends js.Object {
    var AccountId: AccountId
    var JobId: JobId
    var RequestedJobStatus: RequestedJobStatus
    var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason]
  }

  object UpdateJobStatusRequest {
    @inline
    def apply(
        AccountId: AccountId,
        JobId: JobId,
        RequestedJobStatus: RequestedJobStatus,
        StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.undefined
    ): UpdateJobStatusRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any],
        "RequestedJobStatus" -> RequestedJobStatus.asInstanceOf[js.Any]
      )

      StatusUpdateReason.foreach(__v => __obj.updateDynamic("StatusUpdateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobStatusRequest]
    }
  }

  @js.native
  trait UpdateJobStatusResult extends js.Object {
    var JobId: js.UndefOr[JobId]
    var Status: js.UndefOr[JobStatus]
    var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason]
  }

  object UpdateJobStatusResult {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined,
        StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.undefined
    ): UpdateJobStatusResult = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusUpdateReason.foreach(__v => __obj.updateDynamic("StatusUpdateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobStatusResult]
    }
  }

  /** The virtual private cloud (VPC) configuration for an access point.
    */
  @js.native
  trait VpcConfiguration extends js.Object {
    var VpcId: VpcId
  }

  object VpcConfiguration {
    @inline
    def apply(
        VpcId: VpcId
    ): VpcConfiguration = {
      val __obj = js.Dynamic.literal(
        "VpcId" -> VpcId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VpcConfiguration]
    }
  }
}
