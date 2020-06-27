package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  @Factory
  trait CancelSigningProfileRequest extends js.Object {
    var profileName: ProfileName
  }

  @js.native
  sealed trait Category extends js.Any
  object Category extends js.Object {
    val AWSIoT = "AWSIoT".asInstanceOf[Category]

    val values = js.Object.freeze(js.Array(AWSIoT))
  }

  @js.native
  @Factory
  trait DescribeSigningJobRequest extends js.Object {
    var jobId: JobId
  }

  @js.native
  @Factory
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

  /**
    * Points to an <code>S3Destination</code> object that contains information about your S3 bucket.
    */
  @js.native
  @Factory
  trait Destination extends js.Object {
    var s3: js.UndefOr[S3Destination]
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
  @Factory
  trait EncryptionAlgorithmOptions extends js.Object {
    var allowedValues: EncryptionAlgorithms
    var defaultValue: EncryptionAlgorithm
  }

  @js.native
  @Factory
  trait GetSigningPlatformRequest extends js.Object {
    var platformId: PlatformId
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetSigningProfileRequest extends js.Object {
    var profileName: ProfileName
  }

  @js.native
  @Factory
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
  @Factory
  trait HashAlgorithmOptions extends js.Object {
    var allowedValues: HashAlgorithms
    var defaultValue: HashAlgorithm
  }

  @js.native
  sealed trait ImageFormat extends js.Any
  object ImageFormat extends js.Object {
    val JSON = "JSON".asInstanceOf[ImageFormat]

    val values = js.Object.freeze(js.Array(JSON))
  }

  @js.native
  @Factory
  trait ListSigningJobsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var platformId: js.UndefOr[PlatformId]
    var requestedBy: js.UndefOr[RequestedBy]
    var status: js.UndefOr[SigningStatus]
  }

  @js.native
  @Factory
  trait ListSigningJobsResponse extends js.Object {
    var jobs: js.UndefOr[SigningJobs]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSigningPlatformsRequest extends js.Object {
    var category: js.UndefOr[String]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var partner: js.UndefOr[String]
    var target: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListSigningPlatformsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var platforms: js.UndefOr[SigningPlatforms]
  }

  @js.native
  @Factory
  trait ListSigningProfilesRequest extends js.Object {
    var includeCanceled: js.UndefOr[Boolean]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSigningProfilesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var profiles: js.UndefOr[SigningProfiles]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait PutSigningProfileRequest extends js.Object {
    var platformId: PlatformId
    var profileName: ProfileName
    var signingMaterial: SigningMaterial
    var overrides: js.UndefOr[SigningPlatformOverrides]
    var signingParameters: js.UndefOr[SigningParameters]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait PutSigningProfileResponse extends js.Object {
    var arn: js.UndefOr[String]
  }

  /**
    * The name and prefix of the S3 bucket where code signing saves your signed objects.
    */
  @js.native
  @Factory
  trait S3Destination extends js.Object {
    var bucketName: js.UndefOr[BucketName]
    var prefix: js.UndefOr[Prefix]
  }

  /**
    * The S3 bucket name and key where code signing saved your signed code image.
    */
  @js.native
  @Factory
  trait S3SignedObject extends js.Object {
    var bucketName: js.UndefOr[BucketName]
    var key: js.UndefOr[key]
  }

  /**
    * Information about the S3 bucket where you saved your unsigned code.
    */
  @js.native
  @Factory
  trait S3Source extends js.Object {
    var bucketName: BucketName
    var key: Key
    var version: Version
  }

  /**
    * Points to an <code>S3SignedObject</code> object that contains information about your signed code image.
    */
  @js.native
  @Factory
  trait SignedObject extends js.Object {
    var s3: js.UndefOr[S3SignedObject]
  }

  /**
    * The configuration of a code signing operation.
    */
  @js.native
  @Factory
  trait SigningConfiguration extends js.Object {
    var encryptionAlgorithmOptions: EncryptionAlgorithmOptions
    var hashAlgorithmOptions: HashAlgorithmOptions
  }

  /**
    * A signing configuration that overrides the default encryption or hash algorithm of a signing job.
    */
  @js.native
  @Factory
  trait SigningConfigurationOverrides extends js.Object {
    var encryptionAlgorithm: js.UndefOr[EncryptionAlgorithm]
    var hashAlgorithm: js.UndefOr[HashAlgorithm]
  }

  /**
    * The image format of a code signing platform or profile.
    */
  @js.native
  @Factory
  trait SigningImageFormat extends js.Object {
    var defaultFormat: ImageFormat
    var supportedFormats: ImageFormats
  }

  /**
    * Contains information about a signing job.
    */
  @js.native
  @Factory
  trait SigningJob extends js.Object {
    var createdAt: js.UndefOr[CreatedAt]
    var jobId: js.UndefOr[JobId]
    var signedObject: js.UndefOr[SignedObject]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var source: js.UndefOr[Source]
    var status: js.UndefOr[SigningStatus]
  }

  /**
    * The ACM certificate that is used to sign your code.
    */
  @js.native
  @Factory
  trait SigningMaterial extends js.Object {
    var certificateArn: CertificateArn
  }

  /**
    * Contains information about the signing configurations and parameters that is used to perform a code signing job.
    */
  @js.native
  @Factory
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

  /**
    * Any overrides that are applied to the signing configuration of a code signing platform.
    */
  @js.native
  @Factory
  trait SigningPlatformOverrides extends js.Object {
    var signingConfiguration: js.UndefOr[SigningConfigurationOverrides]
  }

  /**
    * Contains information about the ACM certificates and code signing configuration parameters that can be used by a given code signing user.
    */
  @js.native
  @Factory
  trait SigningProfile extends js.Object {
    var arn: js.UndefOr[String]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var signingParameters: js.UndefOr[SigningParameters]
    var status: js.UndefOr[SigningProfileStatus]
    var tags: js.UndefOr[TagMap]
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
  @Factory
  trait Source extends js.Object {
    var s3: js.UndefOr[S3Source]
  }

  @js.native
  @Factory
  trait StartSigningJobRequest extends js.Object {
    var clientRequestToken: ClientRequestToken
    var destination: Destination
    var source: Source
    var profileName: js.UndefOr[ProfileName]
  }

  @js.native
  @Factory
  trait StartSigningJobResponse extends js.Object {
    var jobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagMap
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}
}
