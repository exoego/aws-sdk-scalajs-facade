package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object signer {
  type AccountId = String
  type Arn = String
  type BucketName = String
  type CertificateArn = String
  type ClientRequestToken = String
  type DisplayName = String
  type EncryptionAlgorithms = js.Array[EncryptionAlgorithm]
  type HashAlgorithms = js.Array[HashAlgorithm]
  type ImageFormats = js.Array[ImageFormat]
  type JobId = String
  type Key = String
  type MaxResults = Int
  type MaxSizeInMB = Int
  type NextToken = String
  type Permissions = js.Array[Permission]
  type PlatformId = String
  type PolicySizeBytes = Int
  type Prefix = String
  type ProfileName = String
  type ProfileVersion = String
  type RequestedBy = String
  type RevocationReasonString = String
  type SigningJobs = js.Array[SigningJob]
  type SigningParameterKey = String
  type SigningParameterValue = String
  type SigningParameters = js.Dictionary[SigningParameterValue]
  type SigningPlatforms = js.Array[SigningPlatform]
  type SigningProfiles = js.Array[SigningProfile]
  type StatusReason = String
  type Statuses = js.Array[SigningProfileStatus]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type Version = String

  implicit final class SignerOps(private val service: Signer) extends AnyVal {

    @inline def addProfilePermissionFuture(params: AddProfilePermissionRequest): Future[AddProfilePermissionResponse] = service.addProfilePermission(params).promise().toFuture
    @inline def cancelSigningProfileFuture(params: CancelSigningProfileRequest): Future[js.Object] = service.cancelSigningProfile(params).promise().toFuture
    @inline def describeSigningJobFuture(params: DescribeSigningJobRequest): Future[DescribeSigningJobResponse] = service.describeSigningJob(params).promise().toFuture
    @inline def getSigningPlatformFuture(params: GetSigningPlatformRequest): Future[GetSigningPlatformResponse] = service.getSigningPlatform(params).promise().toFuture
    @inline def getSigningProfileFuture(params: GetSigningProfileRequest): Future[GetSigningProfileResponse] = service.getSigningProfile(params).promise().toFuture
    @inline def listProfilePermissionsFuture(params: ListProfilePermissionsRequest): Future[ListProfilePermissionsResponse] = service.listProfilePermissions(params).promise().toFuture
    @inline def listSigningJobsFuture(params: ListSigningJobsRequest): Future[ListSigningJobsResponse] = service.listSigningJobs(params).promise().toFuture
    @inline def listSigningPlatformsFuture(params: ListSigningPlatformsRequest): Future[ListSigningPlatformsResponse] = service.listSigningPlatforms(params).promise().toFuture
    @inline def listSigningProfilesFuture(params: ListSigningProfilesRequest): Future[ListSigningProfilesResponse] = service.listSigningProfiles(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putSigningProfileFuture(params: PutSigningProfileRequest): Future[PutSigningProfileResponse] = service.putSigningProfile(params).promise().toFuture
    @inline def removeProfilePermissionFuture(params: RemoveProfilePermissionRequest): Future[RemoveProfilePermissionResponse] = service.removeProfilePermission(params).promise().toFuture
    @inline def revokeSignatureFuture(params: RevokeSignatureRequest): Future[js.Object] = service.revokeSignature(params).promise().toFuture
    @inline def revokeSigningProfileFuture(params: RevokeSigningProfileRequest): Future[js.Object] = service.revokeSigningProfile(params).promise().toFuture
    @inline def startSigningJobFuture(params: StartSigningJobRequest): Future[StartSigningJobResponse] = service.startSigningJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }
}

package signer {
  @js.native
  @JSImport("aws-sdk/clients/signer", JSImport.Namespace, "AWS.Signer")
  class Signer() extends js.Object {
    def this(config: AWSConfig) = this()

    def addProfilePermission(params: AddProfilePermissionRequest): Request[AddProfilePermissionResponse] = js.native
    def cancelSigningProfile(params: CancelSigningProfileRequest): Request[js.Object] = js.native
    def describeSigningJob(params: DescribeSigningJobRequest): Request[DescribeSigningJobResponse] = js.native
    def getSigningPlatform(params: GetSigningPlatformRequest): Request[GetSigningPlatformResponse] = js.native
    def getSigningProfile(params: GetSigningProfileRequest): Request[GetSigningProfileResponse] = js.native
    def listProfilePermissions(params: ListProfilePermissionsRequest): Request[ListProfilePermissionsResponse] = js.native
    def listSigningJobs(params: ListSigningJobsRequest): Request[ListSigningJobsResponse] = js.native
    def listSigningPlatforms(params: ListSigningPlatformsRequest): Request[ListSigningPlatformsResponse] = js.native
    def listSigningProfiles(params: ListSigningProfilesRequest): Request[ListSigningProfilesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putSigningProfile(params: PutSigningProfileRequest): Request[PutSigningProfileResponse] = js.native
    def removeProfilePermission(params: RemoveProfilePermissionRequest): Request[RemoveProfilePermissionResponse] = js.native
    def revokeSignature(params: RevokeSignatureRequest): Request[js.Object] = js.native
    def revokeSigningProfile(params: RevokeSigningProfileRequest): Request[js.Object] = js.native
    def startSigningJob(params: StartSigningJobRequest): Request[StartSigningJobResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }

  @js.native
  trait AddProfilePermissionRequest extends js.Object {
    var action: String
    var principal: String
    var profileName: ProfileName
    var statementId: String
    var profileVersion: js.UndefOr[ProfileVersion]
    var revisionId: js.UndefOr[String]
  }

  object AddProfilePermissionRequest {
    @inline
    def apply(
        action: String,
        principal: String,
        profileName: ProfileName,
        statementId: String,
        profileVersion: js.UndefOr[ProfileVersion] = js.undefined,
        revisionId: js.UndefOr[String] = js.undefined
    ): AddProfilePermissionRequest = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "principal" -> principal.asInstanceOf[js.Any],
        "profileName" -> profileName.asInstanceOf[js.Any],
        "statementId" -> statementId.asInstanceOf[js.Any]
      )

      profileVersion.foreach(__v => __obj.updateDynamic("profileVersion")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddProfilePermissionRequest]
    }
  }

  @js.native
  trait AddProfilePermissionResponse extends js.Object {
    var revisionId: js.UndefOr[String]
  }

  object AddProfilePermissionResponse {
    @inline
    def apply(
        revisionId: js.UndefOr[String] = js.undefined
    ): AddProfilePermissionResponse = {
      val __obj = js.Dynamic.literal()
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddProfilePermissionResponse]
    }
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
  object Category {
    val AWSIoT = "AWSIoT".asInstanceOf[Category]

    @inline def values = js.Array(AWSIoT)
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
    var completedAt: js.UndefOr[Timestamp]
    var createdAt: js.UndefOr[Timestamp]
    var jobId: js.UndefOr[JobId]
    var jobInvoker: js.UndefOr[AccountId]
    var jobOwner: js.UndefOr[AccountId]
    var overrides: js.UndefOr[SigningPlatformOverrides]
    var platformDisplayName: js.UndefOr[DisplayName]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var profileVersion: js.UndefOr[ProfileVersion]
    var requestedBy: js.UndefOr[RequestedBy]
    var revocationRecord: js.UndefOr[SigningJobRevocationRecord]
    var signatureExpiresAt: js.UndefOr[Timestamp]
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
        completedAt: js.UndefOr[Timestamp] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined,
        jobInvoker: js.UndefOr[AccountId] = js.undefined,
        jobOwner: js.UndefOr[AccountId] = js.undefined,
        overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined,
        platformDisplayName: js.UndefOr[DisplayName] = js.undefined,
        platformId: js.UndefOr[PlatformId] = js.undefined,
        profileName: js.UndefOr[ProfileName] = js.undefined,
        profileVersion: js.UndefOr[ProfileVersion] = js.undefined,
        requestedBy: js.UndefOr[RequestedBy] = js.undefined,
        revocationRecord: js.UndefOr[SigningJobRevocationRecord] = js.undefined,
        signatureExpiresAt: js.UndefOr[Timestamp] = js.undefined,
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
      jobInvoker.foreach(__v => __obj.updateDynamic("jobInvoker")(__v.asInstanceOf[js.Any]))
      jobOwner.foreach(__v => __obj.updateDynamic("jobOwner")(__v.asInstanceOf[js.Any]))
      overrides.foreach(__v => __obj.updateDynamic("overrides")(__v.asInstanceOf[js.Any]))
      platformDisplayName.foreach(__v => __obj.updateDynamic("platformDisplayName")(__v.asInstanceOf[js.Any]))
      platformId.foreach(__v => __obj.updateDynamic("platformId")(__v.asInstanceOf[js.Any]))
      profileName.foreach(__v => __obj.updateDynamic("profileName")(__v.asInstanceOf[js.Any]))
      profileVersion.foreach(__v => __obj.updateDynamic("profileVersion")(__v.asInstanceOf[js.Any]))
      requestedBy.foreach(__v => __obj.updateDynamic("requestedBy")(__v.asInstanceOf[js.Any]))
      revocationRecord.foreach(__v => __obj.updateDynamic("revocationRecord")(__v.asInstanceOf[js.Any]))
      signatureExpiresAt.foreach(__v => __obj.updateDynamic("signatureExpiresAt")(__v.asInstanceOf[js.Any]))
      signedObject.foreach(__v => __obj.updateDynamic("signedObject")(__v.asInstanceOf[js.Any]))
      signingMaterial.foreach(__v => __obj.updateDynamic("signingMaterial")(__v.asInstanceOf[js.Any]))
      signingParameters.foreach(__v => __obj.updateDynamic("signingParameters")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSigningJobResponse]
    }
  }

  /** Points to an <code>S3Destination</code> object that contains information about your S3 bucket.
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
  object EncryptionAlgorithm {
    val RSA = "RSA".asInstanceOf[EncryptionAlgorithm]
    val ECDSA = "ECDSA".asInstanceOf[EncryptionAlgorithm]

    @inline def values = js.Array(RSA, ECDSA)
  }

  /** The encryption algorithm options that are available to a code signing job.
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
        "defaultValue" -> defaultValue.asInstanceOf[js.Any]
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
    var revocationSupported: js.UndefOr[Boolean]
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
        revocationSupported: js.UndefOr[Boolean] = js.undefined,
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
      revocationSupported.foreach(__v => __obj.updateDynamic("revocationSupported")(__v.asInstanceOf[js.Any]))
      signingConfiguration.foreach(__v => __obj.updateDynamic("signingConfiguration")(__v.asInstanceOf[js.Any]))
      signingImageFormat.foreach(__v => __obj.updateDynamic("signingImageFormat")(__v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSigningPlatformResponse]
    }
  }

  @js.native
  trait GetSigningProfileRequest extends js.Object {
    var profileName: ProfileName
    var profileOwner: js.UndefOr[AccountId]
  }

  object GetSigningProfileRequest {
    @inline
    def apply(
        profileName: ProfileName,
        profileOwner: js.UndefOr[AccountId] = js.undefined
    ): GetSigningProfileRequest = {
      val __obj = js.Dynamic.literal(
        "profileName" -> profileName.asInstanceOf[js.Any]
      )

      profileOwner.foreach(__v => __obj.updateDynamic("profileOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSigningProfileRequest]
    }
  }

  @js.native
  trait GetSigningProfileResponse extends js.Object {
    var arn: js.UndefOr[String]
    var overrides: js.UndefOr[SigningPlatformOverrides]
    var platformDisplayName: js.UndefOr[DisplayName]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var profileVersion: js.UndefOr[ProfileVersion]
    var profileVersionArn: js.UndefOr[Arn]
    var revocationRecord: js.UndefOr[SigningProfileRevocationRecord]
    var signatureValidityPeriod: js.UndefOr[SignatureValidityPeriod]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var signingParameters: js.UndefOr[SigningParameters]
    var status: js.UndefOr[SigningProfileStatus]
    var statusReason: js.UndefOr[String]
    var tags: js.UndefOr[TagMap]
  }

  object GetSigningProfileResponse {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined,
        platformDisplayName: js.UndefOr[DisplayName] = js.undefined,
        platformId: js.UndefOr[PlatformId] = js.undefined,
        profileName: js.UndefOr[ProfileName] = js.undefined,
        profileVersion: js.UndefOr[ProfileVersion] = js.undefined,
        profileVersionArn: js.UndefOr[Arn] = js.undefined,
        revocationRecord: js.UndefOr[SigningProfileRevocationRecord] = js.undefined,
        signatureValidityPeriod: js.UndefOr[SignatureValidityPeriod] = js.undefined,
        signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
        signingParameters: js.UndefOr[SigningParameters] = js.undefined,
        status: js.UndefOr[SigningProfileStatus] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetSigningProfileResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      overrides.foreach(__v => __obj.updateDynamic("overrides")(__v.asInstanceOf[js.Any]))
      platformDisplayName.foreach(__v => __obj.updateDynamic("platformDisplayName")(__v.asInstanceOf[js.Any]))
      platformId.foreach(__v => __obj.updateDynamic("platformId")(__v.asInstanceOf[js.Any]))
      profileName.foreach(__v => __obj.updateDynamic("profileName")(__v.asInstanceOf[js.Any]))
      profileVersion.foreach(__v => __obj.updateDynamic("profileVersion")(__v.asInstanceOf[js.Any]))
      profileVersionArn.foreach(__v => __obj.updateDynamic("profileVersionArn")(__v.asInstanceOf[js.Any]))
      revocationRecord.foreach(__v => __obj.updateDynamic("revocationRecord")(__v.asInstanceOf[js.Any]))
      signatureValidityPeriod.foreach(__v => __obj.updateDynamic("signatureValidityPeriod")(__v.asInstanceOf[js.Any]))
      signingMaterial.foreach(__v => __obj.updateDynamic("signingMaterial")(__v.asInstanceOf[js.Any]))
      signingParameters.foreach(__v => __obj.updateDynamic("signingParameters")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSigningProfileResponse]
    }
  }

  @js.native
  sealed trait HashAlgorithm extends js.Any
  object HashAlgorithm {
    val SHA1 = "SHA1".asInstanceOf[HashAlgorithm]
    val SHA256 = "SHA256".asInstanceOf[HashAlgorithm]

    @inline def values = js.Array(SHA1, SHA256)
  }

  /** The hash algorithms that are available to a code signing job.
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
        "defaultValue" -> defaultValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HashAlgorithmOptions]
    }
  }

  @js.native
  sealed trait ImageFormat extends js.Any
  object ImageFormat {
    val JSON = "JSON".asInstanceOf[ImageFormat]
    val JSONEmbedded = "JSONEmbedded".asInstanceOf[ImageFormat]
    val JSONDetached = "JSONDetached".asInstanceOf[ImageFormat]

    @inline def values = js.Array(JSON, JSONEmbedded, JSONDetached)
  }

  @js.native
  trait ListProfilePermissionsRequest extends js.Object {
    var profileName: ProfileName
    var nextToken: js.UndefOr[String]
  }

  object ListProfilePermissionsRequest {
    @inline
    def apply(
        profileName: ProfileName,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListProfilePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "profileName" -> profileName.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfilePermissionsRequest]
    }
  }

  @js.native
  trait ListProfilePermissionsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var permissions: js.UndefOr[Permissions]
    var policySizeBytes: js.UndefOr[PolicySizeBytes]
    var revisionId: js.UndefOr[String]
  }

  object ListProfilePermissionsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        permissions: js.UndefOr[Permissions] = js.undefined,
        policySizeBytes: js.UndefOr[PolicySizeBytes] = js.undefined,
        revisionId: js.UndefOr[String] = js.undefined
    ): ListProfilePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      permissions.foreach(__v => __obj.updateDynamic("permissions")(__v.asInstanceOf[js.Any]))
      policySizeBytes.foreach(__v => __obj.updateDynamic("policySizeBytes")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfilePermissionsResponse]
    }
  }

  @js.native
  trait ListSigningJobsRequest extends js.Object {
    var isRevoked: js.UndefOr[Boolean]
    var jobInvoker: js.UndefOr[AccountId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var platformId: js.UndefOr[PlatformId]
    var requestedBy: js.UndefOr[RequestedBy]
    var signatureExpiresAfter: js.UndefOr[Timestamp]
    var signatureExpiresBefore: js.UndefOr[Timestamp]
    var status: js.UndefOr[SigningStatus]
  }

  object ListSigningJobsRequest {
    @inline
    def apply(
        isRevoked: js.UndefOr[Boolean] = js.undefined,
        jobInvoker: js.UndefOr[AccountId] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        platformId: js.UndefOr[PlatformId] = js.undefined,
        requestedBy: js.UndefOr[RequestedBy] = js.undefined,
        signatureExpiresAfter: js.UndefOr[Timestamp] = js.undefined,
        signatureExpiresBefore: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[SigningStatus] = js.undefined
    ): ListSigningJobsRequest = {
      val __obj = js.Dynamic.literal()
      isRevoked.foreach(__v => __obj.updateDynamic("isRevoked")(__v.asInstanceOf[js.Any]))
      jobInvoker.foreach(__v => __obj.updateDynamic("jobInvoker")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      platformId.foreach(__v => __obj.updateDynamic("platformId")(__v.asInstanceOf[js.Any]))
      requestedBy.foreach(__v => __obj.updateDynamic("requestedBy")(__v.asInstanceOf[js.Any]))
      signatureExpiresAfter.foreach(__v => __obj.updateDynamic("signatureExpiresAfter")(__v.asInstanceOf[js.Any]))
      signatureExpiresBefore.foreach(__v => __obj.updateDynamic("signatureExpiresBefore")(__v.asInstanceOf[js.Any]))
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
    var platformId: js.UndefOr[PlatformId]
    var statuses: js.UndefOr[Statuses]
  }

  object ListSigningProfilesRequest {
    @inline
    def apply(
        includeCanceled: js.UndefOr[Boolean] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        platformId: js.UndefOr[PlatformId] = js.undefined,
        statuses: js.UndefOr[Statuses] = js.undefined
    ): ListSigningProfilesRequest = {
      val __obj = js.Dynamic.literal()
      includeCanceled.foreach(__v => __obj.updateDynamic("includeCanceled")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      platformId.foreach(__v => __obj.updateDynamic("platformId")(__v.asInstanceOf[js.Any]))
      statuses.foreach(__v => __obj.updateDynamic("statuses")(__v.asInstanceOf[js.Any]))
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

  /** A cross-account permission for a signing profile.
    */
  @js.native
  trait Permission extends js.Object {
    var action: js.UndefOr[String]
    var principal: js.UndefOr[String]
    var profileVersion: js.UndefOr[ProfileVersion]
    var statementId: js.UndefOr[String]
  }

  object Permission {
    @inline
    def apply(
        action: js.UndefOr[String] = js.undefined,
        principal: js.UndefOr[String] = js.undefined,
        profileVersion: js.UndefOr[ProfileVersion] = js.undefined,
        statementId: js.UndefOr[String] = js.undefined
    ): Permission = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      principal.foreach(__v => __obj.updateDynamic("principal")(__v.asInstanceOf[js.Any]))
      profileVersion.foreach(__v => __obj.updateDynamic("profileVersion")(__v.asInstanceOf[js.Any]))
      statementId.foreach(__v => __obj.updateDynamic("statementId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Permission]
    }
  }

  @js.native
  trait PutSigningProfileRequest extends js.Object {
    var platformId: PlatformId
    var profileName: ProfileName
    var overrides: js.UndefOr[SigningPlatformOverrides]
    var signatureValidityPeriod: js.UndefOr[SignatureValidityPeriod]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var signingParameters: js.UndefOr[SigningParameters]
    var tags: js.UndefOr[TagMap]
  }

  object PutSigningProfileRequest {
    @inline
    def apply(
        platformId: PlatformId,
        profileName: ProfileName,
        overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined,
        signatureValidityPeriod: js.UndefOr[SignatureValidityPeriod] = js.undefined,
        signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
        signingParameters: js.UndefOr[SigningParameters] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): PutSigningProfileRequest = {
      val __obj = js.Dynamic.literal(
        "platformId" -> platformId.asInstanceOf[js.Any],
        "profileName" -> profileName.asInstanceOf[js.Any]
      )

      overrides.foreach(__v => __obj.updateDynamic("overrides")(__v.asInstanceOf[js.Any]))
      signatureValidityPeriod.foreach(__v => __obj.updateDynamic("signatureValidityPeriod")(__v.asInstanceOf[js.Any]))
      signingMaterial.foreach(__v => __obj.updateDynamic("signingMaterial")(__v.asInstanceOf[js.Any]))
      signingParameters.foreach(__v => __obj.updateDynamic("signingParameters")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSigningProfileRequest]
    }
  }

  @js.native
  trait PutSigningProfileResponse extends js.Object {
    var arn: js.UndefOr[String]
    var profileVersion: js.UndefOr[ProfileVersion]
    var profileVersionArn: js.UndefOr[Arn]
  }

  object PutSigningProfileResponse {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        profileVersion: js.UndefOr[ProfileVersion] = js.undefined,
        profileVersionArn: js.UndefOr[Arn] = js.undefined
    ): PutSigningProfileResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      profileVersion.foreach(__v => __obj.updateDynamic("profileVersion")(__v.asInstanceOf[js.Any]))
      profileVersionArn.foreach(__v => __obj.updateDynamic("profileVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSigningProfileResponse]
    }
  }

  @js.native
  trait RemoveProfilePermissionRequest extends js.Object {
    var profileName: ProfileName
    var revisionId: String
    var statementId: String
  }

  object RemoveProfilePermissionRequest {
    @inline
    def apply(
        profileName: ProfileName,
        revisionId: String,
        statementId: String
    ): RemoveProfilePermissionRequest = {
      val __obj = js.Dynamic.literal(
        "profileName" -> profileName.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any],
        "statementId" -> statementId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveProfilePermissionRequest]
    }
  }

  @js.native
  trait RemoveProfilePermissionResponse extends js.Object {
    var revisionId: js.UndefOr[String]
  }

  object RemoveProfilePermissionResponse {
    @inline
    def apply(
        revisionId: js.UndefOr[String] = js.undefined
    ): RemoveProfilePermissionResponse = {
      val __obj = js.Dynamic.literal()
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveProfilePermissionResponse]
    }
  }

  @js.native
  trait RevokeSignatureRequest extends js.Object {
    var jobId: JobId
    var reason: RevocationReasonString
    var jobOwner: js.UndefOr[AccountId]
  }

  object RevokeSignatureRequest {
    @inline
    def apply(
        jobId: JobId,
        reason: RevocationReasonString,
        jobOwner: js.UndefOr[AccountId] = js.undefined
    ): RevokeSignatureRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "reason" -> reason.asInstanceOf[js.Any]
      )

      jobOwner.foreach(__v => __obj.updateDynamic("jobOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevokeSignatureRequest]
    }
  }

  @js.native
  trait RevokeSigningProfileRequest extends js.Object {
    var effectiveTime: Timestamp
    var profileName: ProfileName
    var profileVersion: ProfileVersion
    var reason: RevocationReasonString
  }

  object RevokeSigningProfileRequest {
    @inline
    def apply(
        effectiveTime: Timestamp,
        profileName: ProfileName,
        profileVersion: ProfileVersion,
        reason: RevocationReasonString
    ): RevokeSigningProfileRequest = {
      val __obj = js.Dynamic.literal(
        "effectiveTime" -> effectiveTime.asInstanceOf[js.Any],
        "profileName" -> profileName.asInstanceOf[js.Any],
        "profileVersion" -> profileVersion.asInstanceOf[js.Any],
        "reason" -> reason.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RevokeSigningProfileRequest]
    }
  }

  /** The name and prefix of the S3 bucket where code signing saves your signed objects.
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

  /** The S3 bucket name and key where code signing saved your signed code image.
    */
  @js.native
  trait S3SignedObject extends js.Object {
    var bucketName: js.UndefOr[BucketName]
    var key: js.UndefOr[Key]
  }

  object S3SignedObject {
    @inline
    def apply(
        bucketName: js.UndefOr[BucketName] = js.undefined,
        key: js.UndefOr[Key] = js.undefined
    ): S3SignedObject = {
      val __obj = js.Dynamic.literal()
      bucketName.foreach(__v => __obj.updateDynamic("bucketName")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3SignedObject]
    }
  }

  /** Information about the S3 bucket where you saved your unsigned code.
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
        "key" -> key.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Source]
    }
  }

  /** The validity period for a signing job.
    */
  @js.native
  trait SignatureValidityPeriod extends js.Object {
    var `type`: js.UndefOr[ValidityType]
    var value: js.UndefOr[Int]
  }

  object SignatureValidityPeriod {
    @inline
    def apply(
        `type`: js.UndefOr[ValidityType] = js.undefined,
        value: js.UndefOr[Int] = js.undefined
    ): SignatureValidityPeriod = {
      val __obj = js.Dynamic.literal()
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SignatureValidityPeriod]
    }
  }

  /** Points to an <code>S3SignedObject</code> object that contains information about your signed code image.
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

  /** The configuration of a code signing operation.
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
        "hashAlgorithmOptions" -> hashAlgorithmOptions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SigningConfiguration]
    }
  }

  /** A signing configuration that overrides the default encryption or hash algorithm of a signing job.
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

  /** The image format of a code signing platform or profile.
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
        "defaultFormat" -> defaultFormat.asInstanceOf[js.Any],
        "supportedFormats" -> supportedFormats.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SigningImageFormat]
    }
  }

  /** Contains information about a signing job.
    */
  @js.native
  trait SigningJob extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var isRevoked: js.UndefOr[Boolean]
    var jobId: js.UndefOr[JobId]
    var jobInvoker: js.UndefOr[AccountId]
    var jobOwner: js.UndefOr[AccountId]
    var platformDisplayName: js.UndefOr[DisplayName]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var profileVersion: js.UndefOr[ProfileVersion]
    var signatureExpiresAt: js.UndefOr[Timestamp]
    var signedObject: js.UndefOr[SignedObject]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var source: js.UndefOr[Source]
    var status: js.UndefOr[SigningStatus]
  }

  object SigningJob {
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        isRevoked: js.UndefOr[Boolean] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined,
        jobInvoker: js.UndefOr[AccountId] = js.undefined,
        jobOwner: js.UndefOr[AccountId] = js.undefined,
        platformDisplayName: js.UndefOr[DisplayName] = js.undefined,
        platformId: js.UndefOr[PlatformId] = js.undefined,
        profileName: js.UndefOr[ProfileName] = js.undefined,
        profileVersion: js.UndefOr[ProfileVersion] = js.undefined,
        signatureExpiresAt: js.UndefOr[Timestamp] = js.undefined,
        signedObject: js.UndefOr[SignedObject] = js.undefined,
        signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
        source: js.UndefOr[Source] = js.undefined,
        status: js.UndefOr[SigningStatus] = js.undefined
    ): SigningJob = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      isRevoked.foreach(__v => __obj.updateDynamic("isRevoked")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      jobInvoker.foreach(__v => __obj.updateDynamic("jobInvoker")(__v.asInstanceOf[js.Any]))
      jobOwner.foreach(__v => __obj.updateDynamic("jobOwner")(__v.asInstanceOf[js.Any]))
      platformDisplayName.foreach(__v => __obj.updateDynamic("platformDisplayName")(__v.asInstanceOf[js.Any]))
      platformId.foreach(__v => __obj.updateDynamic("platformId")(__v.asInstanceOf[js.Any]))
      profileName.foreach(__v => __obj.updateDynamic("profileName")(__v.asInstanceOf[js.Any]))
      profileVersion.foreach(__v => __obj.updateDynamic("profileVersion")(__v.asInstanceOf[js.Any]))
      signatureExpiresAt.foreach(__v => __obj.updateDynamic("signatureExpiresAt")(__v.asInstanceOf[js.Any]))
      signedObject.foreach(__v => __obj.updateDynamic("signedObject")(__v.asInstanceOf[js.Any]))
      signingMaterial.foreach(__v => __obj.updateDynamic("signingMaterial")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigningJob]
    }
  }

  /** Revocation information for a signing job.
    */
  @js.native
  trait SigningJobRevocationRecord extends js.Object {
    var reason: js.UndefOr[String]
    var revokedAt: js.UndefOr[Timestamp]
    var revokedBy: js.UndefOr[String]
  }

  object SigningJobRevocationRecord {
    @inline
    def apply(
        reason: js.UndefOr[String] = js.undefined,
        revokedAt: js.UndefOr[Timestamp] = js.undefined,
        revokedBy: js.UndefOr[String] = js.undefined
    ): SigningJobRevocationRecord = {
      val __obj = js.Dynamic.literal()
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      revokedAt.foreach(__v => __obj.updateDynamic("revokedAt")(__v.asInstanceOf[js.Any]))
      revokedBy.foreach(__v => __obj.updateDynamic("revokedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigningJobRevocationRecord]
    }
  }

  /** The ACM certificate that is used to sign your code.
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

  /** Contains information about the signing configurations and parameters that are used to perform a code signing job.
    */
  @js.native
  trait SigningPlatform extends js.Object {
    var category: js.UndefOr[Category]
    var displayName: js.UndefOr[String]
    var maxSizeInMB: js.UndefOr[MaxSizeInMB]
    var partner: js.UndefOr[String]
    var platformId: js.UndefOr[String]
    var revocationSupported: js.UndefOr[Boolean]
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
        revocationSupported: js.UndefOr[Boolean] = js.undefined,
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
      revocationSupported.foreach(__v => __obj.updateDynamic("revocationSupported")(__v.asInstanceOf[js.Any]))
      signingConfiguration.foreach(__v => __obj.updateDynamic("signingConfiguration")(__v.asInstanceOf[js.Any]))
      signingImageFormat.foreach(__v => __obj.updateDynamic("signingImageFormat")(__v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigningPlatform]
    }
  }

  /** Any overrides that are applied to the signing configuration of a code signing platform.
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

  /** Contains information about the ACM certificates and code signing configuration parameters that can be used by a given code signing user.
    */
  @js.native
  trait SigningProfile extends js.Object {
    var arn: js.UndefOr[String]
    var platformDisplayName: js.UndefOr[DisplayName]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var profileVersion: js.UndefOr[ProfileVersion]
    var profileVersionArn: js.UndefOr[Arn]
    var signatureValidityPeriod: js.UndefOr[SignatureValidityPeriod]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var signingParameters: js.UndefOr[SigningParameters]
    var status: js.UndefOr[SigningProfileStatus]
    var tags: js.UndefOr[TagMap]
  }

  object SigningProfile {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        platformDisplayName: js.UndefOr[DisplayName] = js.undefined,
        platformId: js.UndefOr[PlatformId] = js.undefined,
        profileName: js.UndefOr[ProfileName] = js.undefined,
        profileVersion: js.UndefOr[ProfileVersion] = js.undefined,
        profileVersionArn: js.UndefOr[Arn] = js.undefined,
        signatureValidityPeriod: js.UndefOr[SignatureValidityPeriod] = js.undefined,
        signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
        signingParameters: js.UndefOr[SigningParameters] = js.undefined,
        status: js.UndefOr[SigningProfileStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): SigningProfile = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      platformDisplayName.foreach(__v => __obj.updateDynamic("platformDisplayName")(__v.asInstanceOf[js.Any]))
      platformId.foreach(__v => __obj.updateDynamic("platformId")(__v.asInstanceOf[js.Any]))
      profileName.foreach(__v => __obj.updateDynamic("profileName")(__v.asInstanceOf[js.Any]))
      profileVersion.foreach(__v => __obj.updateDynamic("profileVersion")(__v.asInstanceOf[js.Any]))
      profileVersionArn.foreach(__v => __obj.updateDynamic("profileVersionArn")(__v.asInstanceOf[js.Any]))
      signatureValidityPeriod.foreach(__v => __obj.updateDynamic("signatureValidityPeriod")(__v.asInstanceOf[js.Any]))
      signingMaterial.foreach(__v => __obj.updateDynamic("signingMaterial")(__v.asInstanceOf[js.Any]))
      signingParameters.foreach(__v => __obj.updateDynamic("signingParameters")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigningProfile]
    }
  }

  /** Revocation information for a signing profile.
    */
  @js.native
  trait SigningProfileRevocationRecord extends js.Object {
    var revocationEffectiveFrom: js.UndefOr[Timestamp]
    var revokedAt: js.UndefOr[Timestamp]
    var revokedBy: js.UndefOr[String]
  }

  object SigningProfileRevocationRecord {
    @inline
    def apply(
        revocationEffectiveFrom: js.UndefOr[Timestamp] = js.undefined,
        revokedAt: js.UndefOr[Timestamp] = js.undefined,
        revokedBy: js.UndefOr[String] = js.undefined
    ): SigningProfileRevocationRecord = {
      val __obj = js.Dynamic.literal()
      revocationEffectiveFrom.foreach(__v => __obj.updateDynamic("revocationEffectiveFrom")(__v.asInstanceOf[js.Any]))
      revokedAt.foreach(__v => __obj.updateDynamic("revokedAt")(__v.asInstanceOf[js.Any]))
      revokedBy.foreach(__v => __obj.updateDynamic("revokedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigningProfileRevocationRecord]
    }
  }

  @js.native
  sealed trait SigningProfileStatus extends js.Any
  object SigningProfileStatus {
    val Active = "Active".asInstanceOf[SigningProfileStatus]
    val Canceled = "Canceled".asInstanceOf[SigningProfileStatus]
    val Revoked = "Revoked".asInstanceOf[SigningProfileStatus]

    @inline def values = js.Array(Active, Canceled, Revoked)
  }

  @js.native
  sealed trait SigningStatus extends js.Any
  object SigningStatus {
    val InProgress = "InProgress".asInstanceOf[SigningStatus]
    val Failed = "Failed".asInstanceOf[SigningStatus]
    val Succeeded = "Succeeded".asInstanceOf[SigningStatus]

    @inline def values = js.Array(InProgress, Failed, Succeeded)
  }

  /** An <code>S3Source</code> object that contains information about the S3 bucket where you saved your unsigned code.
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
    var profileName: ProfileName
    var source: Source
    var profileOwner: js.UndefOr[AccountId]
  }

  object StartSigningJobRequest {
    @inline
    def apply(
        clientRequestToken: ClientRequestToken,
        destination: Destination,
        profileName: ProfileName,
        source: Source,
        profileOwner: js.UndefOr[AccountId] = js.undefined
    ): StartSigningJobRequest = {
      val __obj = js.Dynamic.literal(
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "destination" -> destination.asInstanceOf[js.Any],
        "profileName" -> profileName.asInstanceOf[js.Any],
        "source" -> source.asInstanceOf[js.Any]
      )

      profileOwner.foreach(__v => __obj.updateDynamic("profileOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSigningJobRequest]
    }
  }

  @js.native
  trait StartSigningJobResponse extends js.Object {
    var jobId: js.UndefOr[JobId]
    var jobOwner: js.UndefOr[AccountId]
  }

  object StartSigningJobResponse {
    @inline
    def apply(
        jobId: js.UndefOr[JobId] = js.undefined,
        jobOwner: js.UndefOr[AccountId] = js.undefined
    ): StartSigningJobResponse = {
      val __obj = js.Dynamic.literal()
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      jobOwner.foreach(__v => __obj.updateDynamic("jobOwner")(__v.asInstanceOf[js.Any]))
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
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
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
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  sealed trait ValidityType extends js.Any
  object ValidityType {
    val DAYS = "DAYS".asInstanceOf[ValidityType]
    val MONTHS = "MONTHS".asInstanceOf[ValidityType]
    val YEARS = "YEARS".asInstanceOf[ValidityType]

    @inline def values = js.Array(DAYS, MONTHS, YEARS)
  }
}
