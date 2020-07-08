package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object signer {
  type BucketName            = String
  type CertificateArn        = String
  type ClientRequestToken    = String
  type CompletedAt           = js.Date
  type CreatedAt             = js.Date
  type DisplayName           = String
  type EncryptionAlgorithms  = js.Array[EncryptionAlgorithm]
  type HashAlgorithms        = js.Array[HashAlgorithm]
  type ImageFormats          = js.Array[ImageFormat]
  type JobId                 = String
  type Key                   = String
  type MaxResults            = Int
  type MaxSizeInMB           = Int
  type NextToken             = String
  type PlatformId            = String
  type Prefix                = String
  type ProfileName           = String
  type RequestedBy           = String
  type SigningJobs           = js.Array[SigningJob]
  type SigningParameterKey   = String
  type SigningParameterValue = String
  type SigningParameters     = js.Dictionary[SigningParameterValue]
  type SigningPlatforms      = js.Array[SigningPlatform]
  type SigningProfiles       = js.Array[SigningProfile]
  type StatusReason          = String
  type TagKey                = String
  type TagKeyList            = js.Array[TagKey]
  type TagMap                = js.Dictionary[TagValue]
  type TagValue              = String
  type Version               = String
  type key                   = String

  implicit final class SignerOps(private val service: Signer) extends AnyVal {

    @inline def cancelSigningProfileFuture(params: CancelSigningProfileRequest): Future[js.Object] =
      service.cancelSigningProfile(params).promise().toFuture
    @inline def describeSigningJobFuture(params: DescribeSigningJobRequest): Future[DescribeSigningJobResponse] =
      service.describeSigningJob(params).promise().toFuture
    @inline def getSigningPlatformFuture(params: GetSigningPlatformRequest): Future[GetSigningPlatformResponse] =
      service.getSigningPlatform(params).promise().toFuture
    @inline def getSigningProfileFuture(params: GetSigningProfileRequest): Future[GetSigningProfileResponse] =
      service.getSigningProfile(params).promise().toFuture
    @inline def listSigningJobsFuture(params: ListSigningJobsRequest): Future[ListSigningJobsResponse] =
      service.listSigningJobs(params).promise().toFuture
    @inline def listSigningPlatformsFuture(params: ListSigningPlatformsRequest): Future[ListSigningPlatformsResponse] =
      service.listSigningPlatforms(params).promise().toFuture
    @inline def listSigningProfilesFuture(params: ListSigningProfilesRequest): Future[ListSigningProfilesResponse] =
      service.listSigningProfiles(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putSigningProfileFuture(params: PutSigningProfileRequest): Future[PutSigningProfileResponse] =
      service.putSigningProfile(params).promise().toFuture
    @inline def startSigningJobFuture(params: StartSigningJobRequest): Future[StartSigningJobResponse] =
      service.startSigningJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
  }
}

package signer {
  @js.native
  @JSImport("aws-sdk", "Signer")
  class Signer() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelSigningProfile(params: CancelSigningProfileRequest): Request[js.Object]                    = js.native
    def describeSigningJob(params: DescribeSigningJobRequest): Request[DescribeSigningJobResponse]       = js.native
    def getSigningPlatform(params: GetSigningPlatformRequest): Request[GetSigningPlatformResponse]       = js.native
    def getSigningProfile(params: GetSigningProfileRequest): Request[GetSigningProfileResponse]          = js.native
    def listSigningJobs(params: ListSigningJobsRequest): Request[ListSigningJobsResponse]                = js.native
    def listSigningPlatforms(params: ListSigningPlatformsRequest): Request[ListSigningPlatformsResponse] = js.native
    def listSigningProfiles(params: ListSigningProfilesRequest): Request[ListSigningProfilesResponse]    = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def putSigningProfile(params: PutSigningProfileRequest): Request[PutSigningProfileResponse]          = js.native
    def startSigningJob(params: StartSigningJobRequest): Request[StartSigningJobResponse]                = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                            = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                      = js.native
  }

  @js.native
  trait CancelSigningProfileRequest extends js.Object {
    var profileName: ProfileName
  }

  object CancelSigningProfileRequest {
    @inline
    def apply(
        profileName: ProfileName
    ): CancelSigningProfileRequest = {
      val __obj = js.Dynamic.literal(
        "profileName" -> profileName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelSigningProfileRequest]
    }
  }

  @js.native
  sealed trait Category extends js.Any
  object Category extends js.Object {
    val AWSIoT = "AWSIoT".asInstanceOf[Category]

    val values = js.Object.freeze(js.Array(AWSIoT))
  }

  @js.native
  trait DescribeSigningJobRequest extends js.Object {
    var jobId: JobId
  }

  object DescribeSigningJobRequest {
    @inline
    def apply(
        jobId: JobId
    ): DescribeSigningJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSigningJobRequest]
    }
  }

  @js.native
  trait DescribeSigningJobResponse extends js.Object {
    var completedAt: js.UndefOr[CompletedAt]
    var createdAt: js.UndefOr[CreatedAt]
    var jobId: js.UndefOr[JobId]
    var overrides: js.UndefOr[SigningPlatformOverrides]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var requestedBy: js.UndefOr[RequestedBy]
    var signedObject: js.UndefOr[SignedObject]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var signingParameters: js.UndefOr[SigningParameters]
    var source: js.UndefOr[Source]
    var status: js.UndefOr[SigningStatus]
    var statusReason: js.UndefOr[StatusReason]
  }

  object DescribeSigningJobResponse {
    @inline
    def apply(
        completedAt: js.UndefOr[CompletedAt] = js.undefined,
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined,
        overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined,
        platformId: js.UndefOr[PlatformId] = js.undefined,
        profileName: js.UndefOr[ProfileName] = js.undefined,
        requestedBy: js.UndefOr[RequestedBy] = js.undefined,
        signedObject: js.UndefOr[SignedObject] = js.undefined,
        signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
        signingParameters: js.UndefOr[SigningParameters] = js.undefined,
        source: js.UndefOr[Source] = js.undefined,
        status: js.UndefOr[SigningStatus] = js.undefined,
        statusReason: js.UndefOr[StatusReason] = js.undefined
    ): DescribeSigningJobResponse = {
      val __obj = js.Dynamic.literal()
      completedAt.foreach(__v => __obj.updateDynamic("completedAt")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      overrides.foreach(__v => __obj.updateDynamic("overrides")(__v.asInstanceOf[js.Any]))
      platformId.foreach(__v => __obj.updateDynamic("platformId")(__v.asInstanceOf[js.Any]))
      profileName.foreach(__v => __obj.updateDynamic("profileName")(__v.asInstanceOf[js.Any]))
      requestedBy.foreach(__v => __obj.updateDynamic("requestedBy")(__v.asInstanceOf[js.Any]))
      signedObject.foreach(__v => __obj.updateDynamic("signedObject")(__v.asInstanceOf[js.Any]))
      signingMaterial.foreach(__v => __obj.updateDynamic("signingMaterial")(__v.asInstanceOf[js.Any]))
      signingParameters.foreach(__v => __obj.updateDynamic("signingParameters")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSigningJobResponse]
    }
  }

  /**
    * Points to an <code>S3Destination</code> object that contains information about your S3 bucket.
    */
  @js.native
  trait Destination extends js.Object {
    var s3: js.UndefOr[S3Destination]
  }

  object Destination {
    @inline
    def apply(
        s3: js.UndefOr[S3Destination] = js.undefined
    ): Destination = {
      val __obj = js.Dynamic.literal()
      s3.foreach(__v => __obj.updateDynamic("s3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Destination]
    }
  }

  @js.native
  sealed trait EncryptionAlgorithm extends js.Any
  object EncryptionAlgorithm extends js.Object {
    val RSA   = "RSA".asInstanceOf[EncryptionAlgorithm]
    val ECDSA = "ECDSA".asInstanceOf[EncryptionAlgorithm]

    val values = js.Object.freeze(js.Array(RSA, ECDSA))
  }

  /**
    * The encryption algorithm options that are available to a code signing job.
    */
  @js.native
  trait EncryptionAlgorithmOptions extends js.Object {
    var allowedValues: EncryptionAlgorithms
    var defaultValue: EncryptionAlgorithm
  }

  object EncryptionAlgorithmOptions {
    @inline
    def apply(
        allowedValues: EncryptionAlgorithms,
        defaultValue: EncryptionAlgorithm
    ): EncryptionAlgorithmOptions = {
      val __obj = js.Dynamic.literal(
        "allowedValues" -> allowedValues.asInstanceOf[js.Any],
        "defaultValue"  -> defaultValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EncryptionAlgorithmOptions]
    }
  }

  @js.native
  trait GetSigningPlatformRequest extends js.Object {
    var platformId: PlatformId
  }

  object GetSigningPlatformRequest {
    @inline
    def apply(
        platformId: PlatformId
    ): GetSigningPlatformRequest = {
      val __obj = js.Dynamic.literal(
        "platformId" -> platformId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSigningPlatformRequest]
    }
  }

  @js.native
  trait GetSigningPlatformResponse extends js.Object {
    var category: js.UndefOr[Category]
    var displayName: js.UndefOr[DisplayName]
    var maxSizeInMB: js.UndefOr[MaxSizeInMB]
    var partner: js.UndefOr[String]
    var platformId: js.UndefOr[PlatformId]
    var signingConfiguration: js.UndefOr[SigningConfiguration]
    var signingImageFormat: js.UndefOr[SigningImageFormat]
    var target: js.UndefOr[String]
  }

  object GetSigningPlatformResponse {
    @inline
    def apply(
        category: js.UndefOr[Category] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined,
        partner: js.UndefOr[String] = js.undefined,
        platformId: js.UndefOr[PlatformId] = js.undefined,
        signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined,
        signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined,
        target: js.UndefOr[String] = js.undefined
    ): GetSigningPlatformResponse = {
      val __obj = js.Dynamic.literal()
      category.foreach(__v => __obj.updateDynamic("category")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      maxSizeInMB.foreach(__v => __obj.updateDynamic("maxSizeInMB")(__v.asInstanceOf[js.Any]))
      partner.foreach(__v => __obj.updateDynamic("partner")(__v.asInstanceOf[js.Any]))
      platformId.foreach(__v => __obj.updateDynamic("platformId")(__v.asInstanceOf[js.Any]))
      signingConfiguration.foreach(__v => __obj.updateDynamic("signingConfiguration")(__v.asInstanceOf[js.Any]))
      signingImageFormat.foreach(__v => __obj.updateDynamic("signingImageFormat")(__v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSigningPlatformResponse]
    }
  }

  @js.native
  trait GetSigningProfileRequest extends js.Object {
    var profileName: ProfileName
  }

  object GetSigningProfileRequest {
    @inline
    def apply(
        profileName: ProfileName
    ): GetSigningProfileRequest = {
      val __obj = js.Dynamic.literal(
        "profileName" -> profileName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSigningProfileRequest]
    }
  }

  @js.native
  trait GetSigningProfileResponse extends js.Object {
    var arn: js.UndefOr[String]
    var overrides: js.UndefOr[SigningPlatformOverrides]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var signingParameters: js.UndefOr[SigningParameters]
    var status: js.UndefOr[SigningProfileStatus]
    var tags: js.UndefOr[TagMap]
  }

  object GetSigningProfileResponse {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined,
        platformId: js.UndefOr[PlatformId] = js.undefined,
        profileName: js.UndefOr[ProfileName] = js.undefined,
        signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
        signingParameters: js.UndefOr[SigningParameters] = js.undefined,
        status: js.UndefOr[SigningProfileStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetSigningProfileResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      overrides.foreach(__v => __obj.updateDynamic("overrides")(__v.asInstanceOf[js.Any]))
      platformId.foreach(__v => __obj.updateDynamic("platformId")(__v.asInstanceOf[js.Any]))
      profileName.foreach(__v => __obj.updateDynamic("profileName")(__v.asInstanceOf[js.Any]))
      signingMaterial.foreach(__v => __obj.updateDynamic("signingMaterial")(__v.asInstanceOf[js.Any]))
      signingParameters.foreach(__v => __obj.updateDynamic("signingParameters")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSigningProfileResponse]
    }
  }

  @js.native
  sealed trait HashAlgorithm extends js.Any
  object HashAlgorithm extends js.Object {
    val SHA1   = "SHA1".asInstanceOf[HashAlgorithm]
    val SHA256 = "SHA256".asInstanceOf[HashAlgorithm]

    val values = js.Object.freeze(js.Array(SHA1, SHA256))
  }

  /**
    * The hash algorithms that are available to a code signing job.
    */
  @js.native
  trait HashAlgorithmOptions extends js.Object {
    var allowedValues: HashAlgorithms
    var defaultValue: HashAlgorithm
  }

  object HashAlgorithmOptions {
    @inline
    def apply(
        allowedValues: HashAlgorithms,
        defaultValue: HashAlgorithm
    ): HashAlgorithmOptions = {
      val __obj = js.Dynamic.literal(
        "allowedValues" -> allowedValues.asInstanceOf[js.Any],
        "defaultValue"  -> defaultValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HashAlgorithmOptions]
    }
  }

  @js.native
  sealed trait ImageFormat extends js.Any
  object ImageFormat extends js.Object {
    val JSON         = "JSON".asInstanceOf[ImageFormat]
    val JSONEmbedded = "JSONEmbedded".asInstanceOf[ImageFormat]
    val JSONDetached = "JSONDetached".asInstanceOf[ImageFormat]

    val values = js.Object.freeze(js.Array(JSON, JSONEmbedded, JSONDetached))
  }

  @js.native
  trait ListSigningJobsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var platformId: js.UndefOr[PlatformId]
    var requestedBy: js.UndefOr[RequestedBy]
    var status: js.UndefOr[SigningStatus]
  }

  object ListSigningJobsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        platformId: js.UndefOr[PlatformId] = js.undefined,
        requestedBy: js.UndefOr[RequestedBy] = js.undefined,
        status: js.UndefOr[SigningStatus] = js.undefined
    ): ListSigningJobsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      platformId.foreach(__v => __obj.updateDynamic("platformId")(__v.asInstanceOf[js.Any]))
      requestedBy.foreach(__v => __obj.updateDynamic("requestedBy")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSigningJobsRequest]
    }
  }

  @js.native
  trait ListSigningJobsResponse extends js.Object {
    var jobs: js.UndefOr[SigningJobs]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSigningJobsResponse {
    @inline
    def apply(
        jobs: js.UndefOr[SigningJobs] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSigningJobsResponse = {
      val __obj = js.Dynamic.literal()
      jobs.foreach(__v => __obj.updateDynamic("jobs")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSigningJobsResponse]
    }
  }

  @js.native
  trait ListSigningPlatformsRequest extends js.Object {
    var category: js.UndefOr[String]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var partner: js.UndefOr[String]
    var target: js.UndefOr[String]
  }

  object ListSigningPlatformsRequest {
    @inline
    def apply(
        category: js.UndefOr[String] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        partner: js.UndefOr[String] = js.undefined,
        target: js.UndefOr[String] = js.undefined
    ): ListSigningPlatformsRequest = {
      val __obj = js.Dynamic.literal()
      category.foreach(__v => __obj.updateDynamic("category")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      partner.foreach(__v => __obj.updateDynamic("partner")(__v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSigningPlatformsRequest]
    }
  }

  @js.native
  trait ListSigningPlatformsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var platforms: js.UndefOr[SigningPlatforms]
  }

  object ListSigningPlatformsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        platforms: js.UndefOr[SigningPlatforms] = js.undefined
    ): ListSigningPlatformsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      platforms.foreach(__v => __obj.updateDynamic("platforms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSigningPlatformsResponse]
    }
  }

  @js.native
  trait ListSigningProfilesRequest extends js.Object {
    var includeCanceled: js.UndefOr[Boolean]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSigningProfilesRequest {
    @inline
    def apply(
        includeCanceled: js.UndefOr[Boolean] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSigningProfilesRequest = {
      val __obj = js.Dynamic.literal()
      includeCanceled.foreach(__v => __obj.updateDynamic("includeCanceled")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSigningProfilesRequest]
    }
  }

  @js.native
  trait ListSigningProfilesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var profiles: js.UndefOr[SigningProfiles]
  }

  object ListSigningProfilesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        profiles: js.UndefOr[SigningProfiles] = js.undefined
    ): ListSigningProfilesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      profiles.foreach(__v => __obj.updateDynamic("profiles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSigningProfilesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait PutSigningProfileRequest extends js.Object {
    var platformId: PlatformId
    var profileName: ProfileName
    var signingMaterial: SigningMaterial
    var overrides: js.UndefOr[SigningPlatformOverrides]
    var signingParameters: js.UndefOr[SigningParameters]
    var tags: js.UndefOr[TagMap]
  }

  object PutSigningProfileRequest {
    @inline
    def apply(
        platformId: PlatformId,
        profileName: ProfileName,
        signingMaterial: SigningMaterial,
        overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined,
        signingParameters: js.UndefOr[SigningParameters] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): PutSigningProfileRequest = {
      val __obj = js.Dynamic.literal(
        "platformId"      -> platformId.asInstanceOf[js.Any],
        "profileName"     -> profileName.asInstanceOf[js.Any],
        "signingMaterial" -> signingMaterial.asInstanceOf[js.Any]
      )

      overrides.foreach(__v => __obj.updateDynamic("overrides")(__v.asInstanceOf[js.Any]))
      signingParameters.foreach(__v => __obj.updateDynamic("signingParameters")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSigningProfileRequest]
    }
  }

  @js.native
  trait PutSigningProfileResponse extends js.Object {
    var arn: js.UndefOr[String]
  }

  object PutSigningProfileResponse {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined
    ): PutSigningProfileResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSigningProfileResponse]
    }
  }

  /**
    * The name and prefix of the S3 bucket where code signing saves your signed objects.
    */
  @js.native
  trait S3Destination extends js.Object {
    var bucketName: js.UndefOr[BucketName]
    var prefix: js.UndefOr[Prefix]
  }

  object S3Destination {
    @inline
    def apply(
        bucketName: js.UndefOr[BucketName] = js.undefined,
        prefix: js.UndefOr[Prefix] = js.undefined
    ): S3Destination = {
      val __obj = js.Dynamic.literal()
      bucketName.foreach(__v => __obj.updateDynamic("bucketName")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Destination]
    }
  }

  /**
    * The S3 bucket name and key where code signing saved your signed code image.
    */
  @js.native
  trait S3SignedObject extends js.Object {
    var bucketName: js.UndefOr[BucketName]
    var key: js.UndefOr[key]
  }

  object S3SignedObject {
    @inline
    def apply(
        bucketName: js.UndefOr[BucketName] = js.undefined,
        key: js.UndefOr[key] = js.undefined
    ): S3SignedObject = {
      val __obj = js.Dynamic.literal()
      bucketName.foreach(__v => __obj.updateDynamic("bucketName")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3SignedObject]
    }
  }

  /**
    * Information about the S3 bucket where you saved your unsigned code.
    */
  @js.native
  trait S3Source extends js.Object {
    var bucketName: BucketName
    var key: Key
    var version: Version
  }

  object S3Source {
    @inline
    def apply(
        bucketName: BucketName,
        key: Key,
        version: Version
    ): S3Source = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "key"        -> key.asInstanceOf[js.Any],
        "version"    -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[S3Source]
    }
  }

  /**
    * Points to an <code>S3SignedObject</code> object that contains information about your signed code image.
    */
  @js.native
  trait SignedObject extends js.Object {
    var s3: js.UndefOr[S3SignedObject]
  }

  object SignedObject {
    @inline
    def apply(
        s3: js.UndefOr[S3SignedObject] = js.undefined
    ): SignedObject = {
      val __obj = js.Dynamic.literal()
      s3.foreach(__v => __obj.updateDynamic("s3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SignedObject]
    }
  }

  /**
    * The configuration of a code signing operation.
    */
  @js.native
  trait SigningConfiguration extends js.Object {
    var encryptionAlgorithmOptions: EncryptionAlgorithmOptions
    var hashAlgorithmOptions: HashAlgorithmOptions
  }

  object SigningConfiguration {
    @inline
    def apply(
        encryptionAlgorithmOptions: EncryptionAlgorithmOptions,
        hashAlgorithmOptions: HashAlgorithmOptions
    ): SigningConfiguration = {
      val __obj = js.Dynamic.literal(
        "encryptionAlgorithmOptions" -> encryptionAlgorithmOptions.asInstanceOf[js.Any],
        "hashAlgorithmOptions"       -> hashAlgorithmOptions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SigningConfiguration]
    }
  }

  /**
    * A signing configuration that overrides the default encryption or hash algorithm of a signing job.
    */
  @js.native
  trait SigningConfigurationOverrides extends js.Object {
    var encryptionAlgorithm: js.UndefOr[EncryptionAlgorithm]
    var hashAlgorithm: js.UndefOr[HashAlgorithm]
  }

  object SigningConfigurationOverrides {
    @inline
    def apply(
        encryptionAlgorithm: js.UndefOr[EncryptionAlgorithm] = js.undefined,
        hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined
    ): SigningConfigurationOverrides = {
      val __obj = js.Dynamic.literal()
      encryptionAlgorithm.foreach(__v => __obj.updateDynamic("encryptionAlgorithm")(__v.asInstanceOf[js.Any]))
      hashAlgorithm.foreach(__v => __obj.updateDynamic("hashAlgorithm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigningConfigurationOverrides]
    }
  }

  /**
    * The image format of a code signing platform or profile.
    */
  @js.native
  trait SigningImageFormat extends js.Object {
    var defaultFormat: ImageFormat
    var supportedFormats: ImageFormats
  }

  object SigningImageFormat {
    @inline
    def apply(
        defaultFormat: ImageFormat,
        supportedFormats: ImageFormats
    ): SigningImageFormat = {
      val __obj = js.Dynamic.literal(
        "defaultFormat"    -> defaultFormat.asInstanceOf[js.Any],
        "supportedFormats" -> supportedFormats.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SigningImageFormat]
    }
  }

  /**
    * Contains information about a signing job.
    */
  @js.native
  trait SigningJob extends js.Object {
    var createdAt: js.UndefOr[CreatedAt]
    var jobId: js.UndefOr[JobId]
    var signedObject: js.UndefOr[SignedObject]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var source: js.UndefOr[Source]
    var status: js.UndefOr[SigningStatus]
  }

  object SigningJob {
    @inline
    def apply(
        createdAt: js.UndefOr[CreatedAt] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined,
        signedObject: js.UndefOr[SignedObject] = js.undefined,
        signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
        source: js.UndefOr[Source] = js.undefined,
        status: js.UndefOr[SigningStatus] = js.undefined
    ): SigningJob = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      signedObject.foreach(__v => __obj.updateDynamic("signedObject")(__v.asInstanceOf[js.Any]))
      signingMaterial.foreach(__v => __obj.updateDynamic("signingMaterial")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigningJob]
    }
  }

  /**
    * The ACM certificate that is used to sign your code.
    */
  @js.native
  trait SigningMaterial extends js.Object {
    var certificateArn: CertificateArn
  }

  object SigningMaterial {
    @inline
    def apply(
        certificateArn: CertificateArn
    ): SigningMaterial = {
      val __obj = js.Dynamic.literal(
        "certificateArn" -> certificateArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SigningMaterial]
    }
  }

  /**
    * Contains information about the signing configurations and parameters that are used to perform a code signing job.
    */
  @js.native
  trait SigningPlatform extends js.Object {
    var category: js.UndefOr[Category]
    var displayName: js.UndefOr[String]
    var maxSizeInMB: js.UndefOr[MaxSizeInMB]
    var partner: js.UndefOr[String]
    var platformId: js.UndefOr[String]
    var signingConfiguration: js.UndefOr[SigningConfiguration]
    var signingImageFormat: js.UndefOr[SigningImageFormat]
    var target: js.UndefOr[String]
  }

  object SigningPlatform {
    @inline
    def apply(
        category: js.UndefOr[Category] = js.undefined,
        displayName: js.UndefOr[String] = js.undefined,
        maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined,
        partner: js.UndefOr[String] = js.undefined,
        platformId: js.UndefOr[String] = js.undefined,
        signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined,
        signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined,
        target: js.UndefOr[String] = js.undefined
    ): SigningPlatform = {
      val __obj = js.Dynamic.literal()
      category.foreach(__v => __obj.updateDynamic("category")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      maxSizeInMB.foreach(__v => __obj.updateDynamic("maxSizeInMB")(__v.asInstanceOf[js.Any]))
      partner.foreach(__v => __obj.updateDynamic("partner")(__v.asInstanceOf[js.Any]))
      platformId.foreach(__v => __obj.updateDynamic("platformId")(__v.asInstanceOf[js.Any]))
      signingConfiguration.foreach(__v => __obj.updateDynamic("signingConfiguration")(__v.asInstanceOf[js.Any]))
      signingImageFormat.foreach(__v => __obj.updateDynamic("signingImageFormat")(__v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigningPlatform]
    }
  }

  /**
    * Any overrides that are applied to the signing configuration of a code signing platform.
    */
  @js.native
  trait SigningPlatformOverrides extends js.Object {
    var signingConfiguration: js.UndefOr[SigningConfigurationOverrides]
    var signingImageFormat: js.UndefOr[ImageFormat]
  }

  object SigningPlatformOverrides {
    @inline
    def apply(
        signingConfiguration: js.UndefOr[SigningConfigurationOverrides] = js.undefined,
        signingImageFormat: js.UndefOr[ImageFormat] = js.undefined
    ): SigningPlatformOverrides = {
      val __obj = js.Dynamic.literal()
      signingConfiguration.foreach(__v => __obj.updateDynamic("signingConfiguration")(__v.asInstanceOf[js.Any]))
      signingImageFormat.foreach(__v => __obj.updateDynamic("signingImageFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigningPlatformOverrides]
    }
  }

  /**
    * Contains information about the ACM certificates and code signing configuration parameters that can be used by a given code signing user.
    */
  @js.native
  trait SigningProfile extends js.Object {
    var arn: js.UndefOr[String]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var signingParameters: js.UndefOr[SigningParameters]
    var status: js.UndefOr[SigningProfileStatus]
    var tags: js.UndefOr[TagMap]
  }

  object SigningProfile {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        platformId: js.UndefOr[PlatformId] = js.undefined,
        profileName: js.UndefOr[ProfileName] = js.undefined,
        signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
        signingParameters: js.UndefOr[SigningParameters] = js.undefined,
        status: js.UndefOr[SigningProfileStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): SigningProfile = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      platformId.foreach(__v => __obj.updateDynamic("platformId")(__v.asInstanceOf[js.Any]))
      profileName.foreach(__v => __obj.updateDynamic("profileName")(__v.asInstanceOf[js.Any]))
      signingMaterial.foreach(__v => __obj.updateDynamic("signingMaterial")(__v.asInstanceOf[js.Any]))
      signingParameters.foreach(__v => __obj.updateDynamic("signingParameters")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigningProfile]
    }
  }

  @js.native
  sealed trait SigningProfileStatus extends js.Any
  object SigningProfileStatus extends js.Object {
    val Active   = "Active".asInstanceOf[SigningProfileStatus]
    val Canceled = "Canceled".asInstanceOf[SigningProfileStatus]

    val values = js.Object.freeze(js.Array(Active, Canceled))
  }

  @js.native
  sealed trait SigningStatus extends js.Any
  object SigningStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[SigningStatus]
    val Failed     = "Failed".asInstanceOf[SigningStatus]
    val Succeeded  = "Succeeded".asInstanceOf[SigningStatus]

    val values = js.Object.freeze(js.Array(InProgress, Failed, Succeeded))
  }

  /**
    * An <code>S3Source</code> object that contains information about the S3 bucket where you saved your unsigned code.
    */
  @js.native
  trait Source extends js.Object {
    var s3: js.UndefOr[S3Source]
  }

  object Source {
    @inline
    def apply(
        s3: js.UndefOr[S3Source] = js.undefined
    ): Source = {
      val __obj = js.Dynamic.literal()
      s3.foreach(__v => __obj.updateDynamic("s3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Source]
    }
  }

  @js.native
  trait StartSigningJobRequest extends js.Object {
    var clientRequestToken: ClientRequestToken
    var destination: Destination
    var source: Source
    var profileName: js.UndefOr[ProfileName]
  }

  object StartSigningJobRequest {
    @inline
    def apply(
        clientRequestToken: ClientRequestToken,
        destination: Destination,
        source: Source,
        profileName: js.UndefOr[ProfileName] = js.undefined
    ): StartSigningJobRequest = {
      val __obj = js.Dynamic.literal(
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "destination"        -> destination.asInstanceOf[js.Any],
        "source"             -> source.asInstanceOf[js.Any]
      )

      profileName.foreach(__v => __obj.updateDynamic("profileName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSigningJobRequest]
    }
  }

  @js.native
  trait StartSigningJobResponse extends js.Object {
    var jobId: js.UndefOr[JobId]
  }

  object StartSigningJobResponse {
    @inline
    def apply(
        jobId: js.UndefOr[JobId] = js.undefined
    ): StartSigningJobResponse = {
      val __obj = js.Dynamic.literal()
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSigningJobResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }
}
