package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object signer {
  type BucketName = String
  type Category = String
  type CertificateArn = String
  type ClientRequestToken = String
  type CompletedAt = js.Date
  type CreatedAt = js.Date
  type DisplayName = String
  type EncryptionAlgorithm = String
  type EncryptionAlgorithms = js.Array[EncryptionAlgorithm]
  type HashAlgorithm = String
  type HashAlgorithms = js.Array[HashAlgorithm]
  type ImageFormat = String
  type ImageFormats = js.Array[ImageFormat]
  type JobId = String
  type Key = String
  type MaxResults = Int
  type MaxSizeInMB = Int
  type NextToken = String
  type PlatformId = String
  type Prefix = String
  type ProfileName = String
  type RequestedBy = String
  type SigningJobs = js.Array[SigningJob]
  type SigningParameterKey = String
  type SigningParameterValue = String
  type SigningParameters = js.Dictionary[SigningParameterValue]
  type SigningPlatforms = js.Array[SigningPlatform]
  type SigningProfileStatus = String
  type SigningProfiles = js.Array[SigningProfile]
  type SigningStatus = String
  type StatusReason = String
  type Version = String
  type bool = Boolean
  type key = String
  type string = String
}

package signer {
  @js.native
  @JSImport("aws-sdk", "Signer")
  class Signer(config: AWSConfig) extends js.Object {
    def cancelSigningProfile(params: CancelSigningProfileRequest): Request[js.Object] = js.native
    def describeSigningJob(params: DescribeSigningJobRequest): Request[DescribeSigningJobResponse] = js.native
    def getSigningPlatform(params: GetSigningPlatformRequest): Request[GetSigningPlatformResponse] = js.native
    def getSigningProfile(params: GetSigningProfileRequest): Request[GetSigningProfileResponse] = js.native
    def listSigningJobs(params: ListSigningJobsRequest): Request[ListSigningJobsResponse] = js.native
    def listSigningPlatforms(params: ListSigningPlatformsRequest): Request[ListSigningPlatformsResponse] = js.native
    def listSigningProfiles(params: ListSigningProfilesRequest): Request[ListSigningProfilesResponse] = js.native
    def putSigningProfile(params: PutSigningProfileRequest): Request[PutSigningProfileResponse] = js.native
    def startSigningJob(params: StartSigningJobRequest): Request[StartSigningJobResponse] = js.native
  }

  @js.native
  trait CancelSigningProfileRequest extends js.Object {
    var profileName: js.UndefOr[ProfileName]
  }

  object CancelSigningProfileRequest {
    def apply(
      profileName: js.UndefOr[ProfileName] = js.undefined): CancelSigningProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "profileName" -> profileName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSigningProfileRequest]
    }
  }

  object CategoryEnum {
    val AWSIoT = "AWSIoT"

    val values = IndexedSeq(AWSIoT)
  }

  @js.native
  trait DescribeSigningJobRequest extends js.Object {
    var jobId: js.UndefOr[JobId]
  }

  object DescribeSigningJobRequest {
    def apply(
      jobId: js.UndefOr[JobId] = js.undefined): DescribeSigningJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSigningJobRequest]
    }
  }

  @js.native
  trait DescribeSigningJobResponse extends js.Object {
    var signingParameters: js.UndefOr[SigningParameters]
    var statusReason: js.UndefOr[StatusReason]
    var source: js.UndefOr[Source]
    var completedAt: js.UndefOr[CompletedAt]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var requestedBy: js.UndefOr[RequestedBy]
    var overrides: js.UndefOr[SigningPlatformOverrides]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var status: js.UndefOr[SigningStatus]
    var jobId: js.UndefOr[JobId]
    var createdAt: js.UndefOr[CreatedAt]
    var signedObject: js.UndefOr[SignedObject]
  }

  object DescribeSigningJobResponse {
    def apply(
      signingParameters: js.UndefOr[SigningParameters] = js.undefined,
      statusReason: js.UndefOr[StatusReason] = js.undefined,
      source: js.UndefOr[Source] = js.undefined,
      completedAt: js.UndefOr[CompletedAt] = js.undefined,
      platformId: js.UndefOr[PlatformId] = js.undefined,
      profileName: js.UndefOr[ProfileName] = js.undefined,
      requestedBy: js.UndefOr[RequestedBy] = js.undefined,
      overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined,
      signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
      status: js.UndefOr[SigningStatus] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      createdAt: js.UndefOr[CreatedAt] = js.undefined,
      signedObject: js.UndefOr[SignedObject] = js.undefined): DescribeSigningJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signingParameters" -> signingParameters.map { x => x.asInstanceOf[js.Any] },
        "statusReason" -> statusReason.map { x => x.asInstanceOf[js.Any] },
        "source" -> source.map { x => x.asInstanceOf[js.Any] },
        "completedAt" -> completedAt.map { x => x.asInstanceOf[js.Any] },
        "platformId" -> platformId.map { x => x.asInstanceOf[js.Any] },
        "profileName" -> profileName.map { x => x.asInstanceOf[js.Any] },
        "requestedBy" -> requestedBy.map { x => x.asInstanceOf[js.Any] },
        "overrides" -> overrides.map { x => x.asInstanceOf[js.Any] },
        "signingMaterial" -> signingMaterial.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "signedObject" -> signedObject.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSigningJobResponse]
    }
  }

  /**
   * <p>Points to an <code>S3Destination</code> object that contains information about your S3 bucket.</p>
   */
  @js.native
  trait Destination extends js.Object {
    var s3: js.UndefOr[S3Destination]
  }

  object Destination {
    def apply(
      s3: js.UndefOr[S3Destination] = js.undefined): Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3" -> s3.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }

  object EncryptionAlgorithmEnum {
    val RSA = "RSA"
    val ECDSA = "ECDSA"

    val values = IndexedSeq(RSA, ECDSA)
  }

  /**
   * <p>The encryption algorithm options that are available to an AWS Signer job.</p>
   */
  @js.native
  trait EncryptionAlgorithmOptions extends js.Object {
    var allowedValues: js.UndefOr[EncryptionAlgorithms]
    var defaultValue: js.UndefOr[EncryptionAlgorithm]
  }

  object EncryptionAlgorithmOptions {
    def apply(
      allowedValues: js.UndefOr[EncryptionAlgorithms] = js.undefined,
      defaultValue: js.UndefOr[EncryptionAlgorithm] = js.undefined): EncryptionAlgorithmOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "allowedValues" -> allowedValues.map { x => x.asInstanceOf[js.Any] },
        "defaultValue" -> defaultValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionAlgorithmOptions]
    }
  }

  @js.native
  trait GetSigningPlatformRequest extends js.Object {
    var platformId: js.UndefOr[PlatformId]
  }

  object GetSigningPlatformRequest {
    def apply(
      platformId: js.UndefOr[PlatformId] = js.undefined): GetSigningPlatformRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "platformId" -> platformId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSigningPlatformRequest]
    }
  }

  @js.native
  trait GetSigningPlatformResponse extends js.Object {
    var displayName: js.UndefOr[DisplayName]
    var maxSizeInMB: js.UndefOr[MaxSizeInMB]
    var signingConfiguration: js.UndefOr[SigningConfiguration]
    var platformId: js.UndefOr[PlatformId]
    var partner: js.UndefOr[String]
    var category: js.UndefOr[Category]
    var target: js.UndefOr[String]
    var signingImageFormat: js.UndefOr[SigningImageFormat]
  }

  object GetSigningPlatformResponse {
    def apply(
      displayName: js.UndefOr[DisplayName] = js.undefined,
      maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined,
      signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined,
      platformId: js.UndefOr[PlatformId] = js.undefined,
      partner: js.UndefOr[String] = js.undefined,
      category: js.UndefOr[Category] = js.undefined,
      target: js.UndefOr[String] = js.undefined,
      signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined): GetSigningPlatformResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "displayName" -> displayName.map { x => x.asInstanceOf[js.Any] },
        "maxSizeInMB" -> maxSizeInMB.map { x => x.asInstanceOf[js.Any] },
        "signingConfiguration" -> signingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "platformId" -> platformId.map { x => x.asInstanceOf[js.Any] },
        "partner" -> partner.map { x => x.asInstanceOf[js.Any] },
        "category" -> category.map { x => x.asInstanceOf[js.Any] },
        "target" -> target.map { x => x.asInstanceOf[js.Any] },
        "signingImageFormat" -> signingImageFormat.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSigningPlatformResponse]
    }
  }

  @js.native
  trait GetSigningProfileRequest extends js.Object {
    var profileName: js.UndefOr[ProfileName]
  }

  object GetSigningProfileRequest {
    def apply(
      profileName: js.UndefOr[ProfileName] = js.undefined): GetSigningProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "profileName" -> profileName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSigningProfileRequest]
    }
  }

  @js.native
  trait GetSigningProfileResponse extends js.Object {
    var signingParameters: js.UndefOr[SigningParameters]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var overrides: js.UndefOr[SigningPlatformOverrides]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var status: js.UndefOr[SigningProfileStatus]
  }

  object GetSigningProfileResponse {
    def apply(
      signingParameters: js.UndefOr[SigningParameters] = js.undefined,
      platformId: js.UndefOr[PlatformId] = js.undefined,
      profileName: js.UndefOr[ProfileName] = js.undefined,
      overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined,
      signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
      status: js.UndefOr[SigningProfileStatus] = js.undefined): GetSigningProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signingParameters" -> signingParameters.map { x => x.asInstanceOf[js.Any] },
        "platformId" -> platformId.map { x => x.asInstanceOf[js.Any] },
        "profileName" -> profileName.map { x => x.asInstanceOf[js.Any] },
        "overrides" -> overrides.map { x => x.asInstanceOf[js.Any] },
        "signingMaterial" -> signingMaterial.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSigningProfileResponse]
    }
  }

  object HashAlgorithmEnum {
    val SHA1 = "SHA1"
    val SHA256 = "SHA256"

    val values = IndexedSeq(SHA1, SHA256)
  }

  /**
   * <p>The hash algorithms that are available to an AWS Signer job.</p>
   */
  @js.native
  trait HashAlgorithmOptions extends js.Object {
    var allowedValues: js.UndefOr[HashAlgorithms]
    var defaultValue: js.UndefOr[HashAlgorithm]
  }

  object HashAlgorithmOptions {
    def apply(
      allowedValues: js.UndefOr[HashAlgorithms] = js.undefined,
      defaultValue: js.UndefOr[HashAlgorithm] = js.undefined): HashAlgorithmOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "allowedValues" -> allowedValues.map { x => x.asInstanceOf[js.Any] },
        "defaultValue" -> defaultValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HashAlgorithmOptions]
    }
  }

  object ImageFormatEnum {
    val JSON = "JSON"

    val values = IndexedSeq(JSON)
  }

  @js.native
  trait ListSigningJobsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var platformId: js.UndefOr[PlatformId]
    var nextToken: js.UndefOr[NextToken]
    var requestedBy: js.UndefOr[RequestedBy]
    var status: js.UndefOr[SigningStatus]
  }

  object ListSigningJobsRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      platformId: js.UndefOr[PlatformId] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      requestedBy: js.UndefOr[RequestedBy] = js.undefined,
      status: js.UndefOr[SigningStatus] = js.undefined): ListSigningJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "platformId" -> platformId.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "requestedBy" -> requestedBy.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningJobsRequest]
    }
  }

  @js.native
  trait ListSigningJobsResponse extends js.Object {
    var jobs: js.UndefOr[SigningJobs]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSigningJobsResponse {
    def apply(
      jobs: js.UndefOr[SigningJobs] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListSigningJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobs" -> jobs.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningJobsResponse]
    }
  }

  @js.native
  trait ListSigningPlatformsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var partner: js.UndefOr[String]
    var category: js.UndefOr[String]
    var target: js.UndefOr[String]
  }

  object ListSigningPlatformsRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      partner: js.UndefOr[String] = js.undefined,
      category: js.UndefOr[String] = js.undefined,
      target: js.UndefOr[String] = js.undefined): ListSigningPlatformsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "partner" -> partner.map { x => x.asInstanceOf[js.Any] },
        "category" -> category.map { x => x.asInstanceOf[js.Any] },
        "target" -> target.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningPlatformsRequest]
    }
  }

  @js.native
  trait ListSigningPlatformsResponse extends js.Object {
    var platforms: js.UndefOr[SigningPlatforms]
    var nextToken: js.UndefOr[String]
  }

  object ListSigningPlatformsResponse {
    def apply(
      platforms: js.UndefOr[SigningPlatforms] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListSigningPlatformsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "platforms" -> platforms.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningPlatformsResponse]
    }
  }

  @js.native
  trait ListSigningProfilesRequest extends js.Object {
    var includeCanceled: js.UndefOr[bool]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSigningProfilesRequest {
    def apply(
      includeCanceled: js.UndefOr[bool] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListSigningProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "includeCanceled" -> includeCanceled.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningProfilesRequest]
    }
  }

  @js.native
  trait ListSigningProfilesResponse extends js.Object {
    var profiles: js.UndefOr[SigningProfiles]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSigningProfilesResponse {
    def apply(
      profiles: js.UndefOr[SigningProfiles] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListSigningProfilesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "profiles" -> profiles.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningProfilesResponse]
    }
  }

  @js.native
  trait PutSigningProfileRequest extends js.Object {
    var signingParameters: js.UndefOr[SigningParameters]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var overrides: js.UndefOr[SigningPlatformOverrides]
    var signingMaterial: js.UndefOr[SigningMaterial]
  }

  object PutSigningProfileRequest {
    def apply(
      signingParameters: js.UndefOr[SigningParameters] = js.undefined,
      platformId: js.UndefOr[PlatformId] = js.undefined,
      profileName: js.UndefOr[ProfileName] = js.undefined,
      overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined,
      signingMaterial: js.UndefOr[SigningMaterial] = js.undefined): PutSigningProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signingParameters" -> signingParameters.map { x => x.asInstanceOf[js.Any] },
        "platformId" -> platformId.map { x => x.asInstanceOf[js.Any] },
        "profileName" -> profileName.map { x => x.asInstanceOf[js.Any] },
        "overrides" -> overrides.map { x => x.asInstanceOf[js.Any] },
        "signingMaterial" -> signingMaterial.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSigningProfileRequest]
    }
  }

  @js.native
  trait PutSigningProfileResponse extends js.Object {
    var arn: js.UndefOr[string]
  }

  object PutSigningProfileResponse {
    def apply(
      arn: js.UndefOr[string] = js.undefined): PutSigningProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSigningProfileResponse]
    }
  }

  /**
   * <p>The name and prefix of the S3 bucket where AWS Signer saves your signed objects.</p>
   */
  @js.native
  trait S3Destination extends js.Object {
    var bucketName: js.UndefOr[BucketName]
    var prefix: js.UndefOr[Prefix]
  }

  object S3Destination {
    def apply(
      bucketName: js.UndefOr[BucketName] = js.undefined,
      prefix: js.UndefOr[Prefix] = js.undefined): S3Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bucketName" -> bucketName.map { x => x.asInstanceOf[js.Any] },
        "prefix" -> prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Destination]
    }
  }

  /**
   * <p>The S3 bucket name and key where AWS Signer saved your signed code image.</p>
   */
  @js.native
  trait S3SignedObject extends js.Object {
    var bucketName: js.UndefOr[BucketName]
    var key: js.UndefOr[key]
  }

  object S3SignedObject {
    def apply(
      bucketName: js.UndefOr[BucketName] = js.undefined,
      key: js.UndefOr[key] = js.undefined): S3SignedObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bucketName" -> bucketName.map { x => x.asInstanceOf[js.Any] },
        "key" -> key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3SignedObject]
    }
  }

  /**
   * <p>Information about the S3 bucket where you saved your unsigned code.</p>
   */
  @js.native
  trait S3Source extends js.Object {
    var bucketName: js.UndefOr[BucketName]
    var key: js.UndefOr[Key]
    var version: js.UndefOr[Version]
  }

  object S3Source {
    def apply(
      bucketName: js.UndefOr[BucketName] = js.undefined,
      key: js.UndefOr[Key] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): S3Source = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bucketName" -> bucketName.map { x => x.asInstanceOf[js.Any] },
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Source]
    }
  }

  /**
   * <p>Points to an <code>S3SignedObject</code> object that contains information about your signed code image.</p>
   */
  @js.native
  trait SignedObject extends js.Object {
    var s3: js.UndefOr[S3SignedObject]
  }

  object SignedObject {
    def apply(
      s3: js.UndefOr[S3SignedObject] = js.undefined): SignedObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3" -> s3.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignedObject]
    }
  }

  /**
   * <p>The configuration of an AWS Signer operation.</p>
   */
  @js.native
  trait SigningConfiguration extends js.Object {
    var encryptionAlgorithmOptions: js.UndefOr[EncryptionAlgorithmOptions]
    var hashAlgorithmOptions: js.UndefOr[HashAlgorithmOptions]
  }

  object SigningConfiguration {
    def apply(
      encryptionAlgorithmOptions: js.UndefOr[EncryptionAlgorithmOptions] = js.undefined,
      hashAlgorithmOptions: js.UndefOr[HashAlgorithmOptions] = js.undefined): SigningConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "encryptionAlgorithmOptions" -> encryptionAlgorithmOptions.map { x => x.asInstanceOf[js.Any] },
        "hashAlgorithmOptions" -> hashAlgorithmOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningConfiguration]
    }
  }

  /**
   * <p>A signing configuration that overrides the default encryption or hash algorithm of a signing job.</p>
   */
  @js.native
  trait SigningConfigurationOverrides extends js.Object {
    var encryptionAlgorithm: js.UndefOr[EncryptionAlgorithm]
    var hashAlgorithm: js.UndefOr[HashAlgorithm]
  }

  object SigningConfigurationOverrides {
    def apply(
      encryptionAlgorithm: js.UndefOr[EncryptionAlgorithm] = js.undefined,
      hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined): SigningConfigurationOverrides = {
      val _fields = IndexedSeq[(String, js.Any)](
        "encryptionAlgorithm" -> encryptionAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "hashAlgorithm" -> hashAlgorithm.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningConfigurationOverrides]
    }
  }

  /**
   * <p>The image format of an AWS Signer platform or profile.</p>
   */
  @js.native
  trait SigningImageFormat extends js.Object {
    var supportedFormats: js.UndefOr[ImageFormats]
    var defaultFormat: js.UndefOr[ImageFormat]
  }

  object SigningImageFormat {
    def apply(
      supportedFormats: js.UndefOr[ImageFormats] = js.undefined,
      defaultFormat: js.UndefOr[ImageFormat] = js.undefined): SigningImageFormat = {
      val _fields = IndexedSeq[(String, js.Any)](
        "supportedFormats" -> supportedFormats.map { x => x.asInstanceOf[js.Any] },
        "defaultFormat" -> defaultFormat.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningImageFormat]
    }
  }

  /**
   * <p>Contains information about a signing job.</p>
   */
  @js.native
  trait SigningJob extends js.Object {
    var source: js.UndefOr[Source]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var status: js.UndefOr[SigningStatus]
    var jobId: js.UndefOr[JobId]
    var createdAt: js.UndefOr[CreatedAt]
    var signedObject: js.UndefOr[SignedObject]
  }

  object SigningJob {
    def apply(
      source: js.UndefOr[Source] = js.undefined,
      signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
      status: js.UndefOr[SigningStatus] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      createdAt: js.UndefOr[CreatedAt] = js.undefined,
      signedObject: js.UndefOr[SignedObject] = js.undefined): SigningJob = {
      val _fields = IndexedSeq[(String, js.Any)](
        "source" -> source.map { x => x.asInstanceOf[js.Any] },
        "signingMaterial" -> signingMaterial.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "signedObject" -> signedObject.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningJob]
    }
  }

  /**
   * <p>The ACM certificate that is used to sign your code.</p>
   */
  @js.native
  trait SigningMaterial extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
  }

  object SigningMaterial {
    def apply(
      certificateArn: js.UndefOr[CertificateArn] = js.undefined): SigningMaterial = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningMaterial]
    }
  }

  /**
   * <p>Contains information about the signing configurations and parameters that is used to perform an AWS Signer job.</p>
   */
  @js.native
  trait SigningPlatform extends js.Object {
    var displayName: js.UndefOr[String]
    var maxSizeInMB: js.UndefOr[MaxSizeInMB]
    var signingConfiguration: js.UndefOr[SigningConfiguration]
    var platformId: js.UndefOr[String]
    var partner: js.UndefOr[String]
    var category: js.UndefOr[Category]
    var target: js.UndefOr[String]
    var signingImageFormat: js.UndefOr[SigningImageFormat]
  }

  object SigningPlatform {
    def apply(
      displayName: js.UndefOr[String] = js.undefined,
      maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined,
      signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined,
      platformId: js.UndefOr[String] = js.undefined,
      partner: js.UndefOr[String] = js.undefined,
      category: js.UndefOr[Category] = js.undefined,
      target: js.UndefOr[String] = js.undefined,
      signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined): SigningPlatform = {
      val _fields = IndexedSeq[(String, js.Any)](
        "displayName" -> displayName.map { x => x.asInstanceOf[js.Any] },
        "maxSizeInMB" -> maxSizeInMB.map { x => x.asInstanceOf[js.Any] },
        "signingConfiguration" -> signingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "platformId" -> platformId.map { x => x.asInstanceOf[js.Any] },
        "partner" -> partner.map { x => x.asInstanceOf[js.Any] },
        "category" -> category.map { x => x.asInstanceOf[js.Any] },
        "target" -> target.map { x => x.asInstanceOf[js.Any] },
        "signingImageFormat" -> signingImageFormat.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningPlatform]
    }
  }

  /**
   * <p>Any overrides that are applied to the signing configuration of an AWS Signer platform.</p>
   */
  @js.native
  trait SigningPlatformOverrides extends js.Object {
    var signingConfiguration: js.UndefOr[SigningConfigurationOverrides]
  }

  object SigningPlatformOverrides {
    def apply(
      signingConfiguration: js.UndefOr[SigningConfigurationOverrides] = js.undefined): SigningPlatformOverrides = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signingConfiguration" -> signingConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningPlatformOverrides]
    }
  }

  /**
   * <p>Contains information about the ACM certificates and AWS Signer configuration parameters that can be used by a given AWS Signer user.</p>
   */
  @js.native
  trait SigningProfile extends js.Object {
    var signingParameters: js.UndefOr[SigningParameters]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var status: js.UndefOr[SigningProfileStatus]
  }

  object SigningProfile {
    def apply(
      signingParameters: js.UndefOr[SigningParameters] = js.undefined,
      platformId: js.UndefOr[PlatformId] = js.undefined,
      profileName: js.UndefOr[ProfileName] = js.undefined,
      signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
      status: js.UndefOr[SigningProfileStatus] = js.undefined): SigningProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signingParameters" -> signingParameters.map { x => x.asInstanceOf[js.Any] },
        "platformId" -> platformId.map { x => x.asInstanceOf[js.Any] },
        "profileName" -> profileName.map { x => x.asInstanceOf[js.Any] },
        "signingMaterial" -> signingMaterial.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningProfile]
    }
  }

  object SigningProfileStatusEnum {
    val Active = "Active"
    val Canceled = "Canceled"

    val values = IndexedSeq(Active, Canceled)
  }

  object SigningStatusEnum {
    val InProgress = "InProgress"
    val Failed = "Failed"
    val Succeeded = "Succeeded"

    val values = IndexedSeq(InProgress, Failed, Succeeded)
  }

  /**
   * <p>An <code>S3Source</code> object that contains information about the S3 bucket where you saved your unsigned code.</p>
   */
  @js.native
  trait Source extends js.Object {
    var s3: js.UndefOr[S3Source]
  }

  object Source {
    def apply(
      s3: js.UndefOr[S3Source] = js.undefined): Source = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3" -> s3.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Source]
    }
  }

  @js.native
  trait StartSigningJobRequest extends js.Object {
    var source: js.UndefOr[Source]
    var destination: js.UndefOr[Destination]
    var profileName: js.UndefOr[ProfileName]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object StartSigningJobRequest {
    def apply(
      source: js.UndefOr[Source] = js.undefined,
      destination: js.UndefOr[Destination] = js.undefined,
      profileName: js.UndefOr[ProfileName] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined): StartSigningJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "source" -> source.map { x => x.asInstanceOf[js.Any] },
        "destination" -> destination.map { x => x.asInstanceOf[js.Any] },
        "profileName" -> profileName.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSigningJobRequest]
    }
  }

  @js.native
  trait StartSigningJobResponse extends js.Object {
    var jobId: js.UndefOr[JobId]
  }

  object StartSigningJobResponse {
    def apply(
      jobId: js.UndefOr[JobId] = js.undefined): StartSigningJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSigningJobResponse]
    }
  }
}
