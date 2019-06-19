package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object signer {
  type BucketName            = String
  type Category              = String
  type CertificateArn        = String
  type ClientRequestToken    = String
  type CompletedAt           = js.Date
  type CreatedAt             = js.Date
  type DisplayName           = String
  type EncryptionAlgorithm   = String
  type EncryptionAlgorithms  = js.Array[EncryptionAlgorithm]
  type HashAlgorithm         = String
  type HashAlgorithms        = js.Array[HashAlgorithm]
  type ImageFormat           = String
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
  type SigningProfileStatus  = String
  type SigningProfiles       = js.Array[SigningProfile]
  type SigningStatus         = String
  type StatusReason          = String
  type Version               = String
  type bool                  = Boolean
  type key                   = String
  type string                = String
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
    def putSigningProfile(params: PutSigningProfileRequest): Request[PutSigningProfileResponse]          = js.native
    def startSigningJob(params: StartSigningJobRequest): Request[StartSigningJobResponse]                = js.native
  }

  @js.native
  trait CancelSigningProfileRequest extends js.Object {
    var profileName: ProfileName
  }

  object CancelSigningProfileRequest {
    def apply(profileName: ProfileName): CancelSigningProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("profileName" -> profileName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSigningProfileRequest]
    }
  }

  object CategoryEnum {
    val AWSIoT = "AWSIoT"

    val values = IndexedSeq(AWSIoT)
  }

  @js.native
  trait DescribeSigningJobRequest extends js.Object {
    var jobId: JobId
  }

  object DescribeSigningJobRequest {
    def apply(jobId: JobId): DescribeSigningJobRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("jobId" -> jobId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSigningJobRequest]
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
    def apply(completedAt: js.UndefOr[CompletedAt] = js.undefined,
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
              statusReason: js.UndefOr[StatusReason] = js.undefined): DescribeSigningJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "completedAt" -> completedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobId" -> jobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "overrides" -> overrides.map { x =>
          x.asInstanceOf[js.Any]
        },
        "platformId" -> platformId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "profileName" -> profileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "requestedBy" -> requestedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signedObject" -> signedObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingMaterial" -> signingMaterial.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingParameters" -> signingParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "source" -> source.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusReason" -> statusReason.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSigningJobResponse]
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
    def apply(s3: js.UndefOr[S3Destination] = js.undefined): Destination = {
      val _fields = IndexedSeq[(String, js.Any)]("s3" -> s3.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }

  object EncryptionAlgorithmEnum {
    val RSA   = "RSA"
    val ECDSA = "ECDSA"

    val values = IndexedSeq(RSA, ECDSA)
  }

  /**
    * The encryption algorithm options that are available to an AWS Signer job.
    */
  @js.native
  trait EncryptionAlgorithmOptions extends js.Object {
    var allowedValues: EncryptionAlgorithms
    var defaultValue: EncryptionAlgorithm
  }

  object EncryptionAlgorithmOptions {
    def apply(allowedValues: EncryptionAlgorithms, defaultValue: EncryptionAlgorithm): EncryptionAlgorithmOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "allowedValues" -> allowedValues.asInstanceOf[js.Any],
        "defaultValue"  -> defaultValue.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionAlgorithmOptions]
    }
  }

  @js.native
  trait GetSigningPlatformRequest extends js.Object {
    var platformId: PlatformId
  }

  object GetSigningPlatformRequest {
    def apply(platformId: PlatformId): GetSigningPlatformRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("platformId" -> platformId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSigningPlatformRequest]
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
    def apply(category: js.UndefOr[Category] = js.undefined,
              displayName: js.UndefOr[DisplayName] = js.undefined,
              maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined,
              partner: js.UndefOr[String] = js.undefined,
              platformId: js.UndefOr[PlatformId] = js.undefined,
              signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined,
              signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined,
              target: js.UndefOr[String] = js.undefined): GetSigningPlatformResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "category" -> category.map { x =>
          x.asInstanceOf[js.Any]
        },
        "displayName" -> displayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxSizeInMB" -> maxSizeInMB.map { x =>
          x.asInstanceOf[js.Any]
        },
        "partner" -> partner.map { x =>
          x.asInstanceOf[js.Any]
        },
        "platformId" -> platformId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingConfiguration" -> signingConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingImageFormat" -> signingImageFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "target" -> target.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSigningPlatformResponse]
    }
  }

  @js.native
  trait GetSigningProfileRequest extends js.Object {
    var profileName: ProfileName
  }

  object GetSigningProfileRequest {
    def apply(profileName: ProfileName): GetSigningProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("profileName" -> profileName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSigningProfileRequest]
    }
  }

  @js.native
  trait GetSigningProfileResponse extends js.Object {
    var overrides: js.UndefOr[SigningPlatformOverrides]
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var signingParameters: js.UndefOr[SigningParameters]
    var status: js.UndefOr[SigningProfileStatus]
  }

  object GetSigningProfileResponse {
    def apply(overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined,
              platformId: js.UndefOr[PlatformId] = js.undefined,
              profileName: js.UndefOr[ProfileName] = js.undefined,
              signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
              signingParameters: js.UndefOr[SigningParameters] = js.undefined,
              status: js.UndefOr[SigningProfileStatus] = js.undefined): GetSigningProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "overrides" -> overrides.map { x =>
          x.asInstanceOf[js.Any]
        },
        "platformId" -> platformId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "profileName" -> profileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingMaterial" -> signingMaterial.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingParameters" -> signingParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSigningProfileResponse]
    }
  }

  object HashAlgorithmEnum {
    val SHA1   = "SHA1"
    val SHA256 = "SHA256"

    val values = IndexedSeq(SHA1, SHA256)
  }

  /**
    * The hash algorithms that are available to an AWS Signer job.
    */
  @js.native
  trait HashAlgorithmOptions extends js.Object {
    var allowedValues: HashAlgorithms
    var defaultValue: HashAlgorithm
  }

  object HashAlgorithmOptions {
    def apply(allowedValues: HashAlgorithms, defaultValue: HashAlgorithm): HashAlgorithmOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "allowedValues" -> allowedValues.asInstanceOf[js.Any],
        "defaultValue"  -> defaultValue.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
    var nextToken: js.UndefOr[NextToken]
    var platformId: js.UndefOr[PlatformId]
    var requestedBy: js.UndefOr[RequestedBy]
    var status: js.UndefOr[SigningStatus]
  }

  object ListSigningJobsRequest {
    def apply(maxResults: js.UndefOr[MaxResults] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined,
              platformId: js.UndefOr[PlatformId] = js.undefined,
              requestedBy: js.UndefOr[RequestedBy] = js.undefined,
              status: js.UndefOr[SigningStatus] = js.undefined): ListSigningJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "platformId" -> platformId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "requestedBy" -> requestedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningJobsRequest]
    }
  }

  @js.native
  trait ListSigningJobsResponse extends js.Object {
    var jobs: js.UndefOr[SigningJobs]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSigningJobsResponse {
    def apply(jobs: js.UndefOr[SigningJobs] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): ListSigningJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("jobs" -> jobs.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningJobsResponse]
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
    def apply(category: js.UndefOr[String] = js.undefined,
              maxResults: js.UndefOr[MaxResults] = js.undefined,
              nextToken: js.UndefOr[String] = js.undefined,
              partner: js.UndefOr[String] = js.undefined,
              target: js.UndefOr[String] = js.undefined): ListSigningPlatformsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "category" -> category.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "partner" -> partner.map { x =>
          x.asInstanceOf[js.Any]
        },
        "target" -> target.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningPlatformsRequest]
    }
  }

  @js.native
  trait ListSigningPlatformsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var platforms: js.UndefOr[SigningPlatforms]
  }

  object ListSigningPlatformsResponse {
    def apply(nextToken: js.UndefOr[String] = js.undefined,
              platforms: js.UndefOr[SigningPlatforms] = js.undefined): ListSigningPlatformsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "platforms" -> platforms.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(includeCanceled: js.UndefOr[bool] = js.undefined,
              maxResults: js.UndefOr[MaxResults] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): ListSigningProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "includeCanceled" -> includeCanceled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningProfilesRequest]
    }
  }

  @js.native
  trait ListSigningProfilesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var profiles: js.UndefOr[SigningProfiles]
  }

  object ListSigningProfilesResponse {
    def apply(nextToken: js.UndefOr[NextToken] = js.undefined,
              profiles: js.UndefOr[SigningProfiles] = js.undefined): ListSigningProfilesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "profiles" -> profiles.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSigningProfilesResponse]
    }
  }

  @js.native
  trait PutSigningProfileRequest extends js.Object {
    var platformId: PlatformId
    var profileName: ProfileName
    var signingMaterial: SigningMaterial
    var overrides: js.UndefOr[SigningPlatformOverrides]
    var signingParameters: js.UndefOr[SigningParameters]
  }

  object PutSigningProfileRequest {
    def apply(platformId: PlatformId,
              profileName: ProfileName,
              signingMaterial: SigningMaterial,
              overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined,
              signingParameters: js.UndefOr[SigningParameters] = js.undefined): PutSigningProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "platformId"      -> platformId.asInstanceOf[js.Any],
        "profileName"     -> profileName.asInstanceOf[js.Any],
        "signingMaterial" -> signingMaterial.asInstanceOf[js.Any],
        "overrides" -> overrides.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingParameters" -> signingParameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSigningProfileRequest]
    }
  }

  @js.native
  trait PutSigningProfileResponse extends js.Object {
    var arn: js.UndefOr[string]
  }

  object PutSigningProfileResponse {
    def apply(arn: js.UndefOr[string] = js.undefined): PutSigningProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("arn" -> arn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSigningProfileResponse]
    }
  }

  /**
    * The name and prefix of the S3 bucket where AWS Signer saves your signed objects.
    */
  @js.native
  trait S3Destination extends js.Object {
    var bucketName: js.UndefOr[BucketName]
    var prefix: js.UndefOr[Prefix]
  }

  object S3Destination {
    def apply(bucketName: js.UndefOr[BucketName] = js.undefined,
              prefix: js.UndefOr[Prefix] = js.undefined): S3Destination = {
      val _fields = IndexedSeq[(String, js.Any)]("bucketName" -> bucketName.map { x =>
        x.asInstanceOf[js.Any]
      }, "prefix" -> prefix.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Destination]
    }
  }

  /**
    * The S3 bucket name and key where AWS Signer saved your signed code image.
    */
  @js.native
  trait S3SignedObject extends js.Object {
    var bucketName: js.UndefOr[BucketName]
    var key: js.UndefOr[key]
  }

  object S3SignedObject {
    def apply(bucketName: js.UndefOr[BucketName] = js.undefined,
              key: js.UndefOr[key] = js.undefined): S3SignedObject = {
      val _fields = IndexedSeq[(String, js.Any)]("bucketName" -> bucketName.map { x =>
        x.asInstanceOf[js.Any]
      }, "key" -> key.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3SignedObject]
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
    def apply(bucketName: BucketName, key: Key, version: Version): S3Source = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "key"        -> key.asInstanceOf[js.Any],
        "version"    -> version.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Source]
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
    def apply(s3: js.UndefOr[S3SignedObject] = js.undefined): SignedObject = {
      val _fields = IndexedSeq[(String, js.Any)]("s3" -> s3.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignedObject]
    }
  }

  /**
    * The configuration of an AWS Signer operation.
    */
  @js.native
  trait SigningConfiguration extends js.Object {
    var encryptionAlgorithmOptions: EncryptionAlgorithmOptions
    var hashAlgorithmOptions: HashAlgorithmOptions
  }

  object SigningConfiguration {
    def apply(encryptionAlgorithmOptions: EncryptionAlgorithmOptions,
              hashAlgorithmOptions: HashAlgorithmOptions): SigningConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "encryptionAlgorithmOptions" -> encryptionAlgorithmOptions.asInstanceOf[js.Any],
        "hashAlgorithmOptions"       -> hashAlgorithmOptions.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningConfiguration]
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
    def apply(encryptionAlgorithm: js.UndefOr[EncryptionAlgorithm] = js.undefined,
              hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined): SigningConfigurationOverrides = {
      val _fields = IndexedSeq[(String, js.Any)]("encryptionAlgorithm" -> encryptionAlgorithm.map { x =>
        x.asInstanceOf[js.Any]
      }, "hashAlgorithm" -> hashAlgorithm.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningConfigurationOverrides]
    }
  }

  /**
    * The image format of an AWS Signer platform or profile.
    */
  @js.native
  trait SigningImageFormat extends js.Object {
    var defaultFormat: ImageFormat
    var supportedFormats: ImageFormats
  }

  object SigningImageFormat {
    def apply(defaultFormat: ImageFormat, supportedFormats: ImageFormats): SigningImageFormat = {
      val _fields = IndexedSeq[(String, js.Any)](
        "defaultFormat"    -> defaultFormat.asInstanceOf[js.Any],
        "supportedFormats" -> supportedFormats.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningImageFormat]
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
    def apply(createdAt: js.UndefOr[CreatedAt] = js.undefined,
              jobId: js.UndefOr[JobId] = js.undefined,
              signedObject: js.UndefOr[SignedObject] = js.undefined,
              signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
              source: js.UndefOr[Source] = js.undefined,
              status: js.UndefOr[SigningStatus] = js.undefined): SigningJob = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobId" -> jobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signedObject" -> signedObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingMaterial" -> signingMaterial.map { x =>
          x.asInstanceOf[js.Any]
        },
        "source" -> source.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningJob]
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
    def apply(certificateArn: CertificateArn): SigningMaterial = {
      val _fields = IndexedSeq[(String, js.Any)]("certificateArn" -> certificateArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningMaterial]
    }
  }

  /**
    * Contains information about the signing configurations and parameters that is used to perform an AWS Signer job.
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
    def apply(category: js.UndefOr[Category] = js.undefined,
              displayName: js.UndefOr[String] = js.undefined,
              maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined,
              partner: js.UndefOr[String] = js.undefined,
              platformId: js.UndefOr[String] = js.undefined,
              signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined,
              signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined,
              target: js.UndefOr[String] = js.undefined): SigningPlatform = {
      val _fields = IndexedSeq[(String, js.Any)](
        "category" -> category.map { x =>
          x.asInstanceOf[js.Any]
        },
        "displayName" -> displayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxSizeInMB" -> maxSizeInMB.map { x =>
          x.asInstanceOf[js.Any]
        },
        "partner" -> partner.map { x =>
          x.asInstanceOf[js.Any]
        },
        "platformId" -> platformId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingConfiguration" -> signingConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingImageFormat" -> signingImageFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "target" -> target.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningPlatform]
    }
  }

  /**
    * Any overrides that are applied to the signing configuration of an AWS Signer platform.
    */
  @js.native
  trait SigningPlatformOverrides extends js.Object {
    var signingConfiguration: js.UndefOr[SigningConfigurationOverrides]
  }

  object SigningPlatformOverrides {
    def apply(
        signingConfiguration: js.UndefOr[SigningConfigurationOverrides] = js.undefined
    ): SigningPlatformOverrides = {
      val _fields = IndexedSeq[(String, js.Any)]("signingConfiguration" -> signingConfiguration.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningPlatformOverrides]
    }
  }

  /**
    * Contains information about the ACM certificates and AWS Signer configuration parameters that can be used by a given AWS Signer user.
    */
  @js.native
  trait SigningProfile extends js.Object {
    var platformId: js.UndefOr[PlatformId]
    var profileName: js.UndefOr[ProfileName]
    var signingMaterial: js.UndefOr[SigningMaterial]
    var signingParameters: js.UndefOr[SigningParameters]
    var status: js.UndefOr[SigningProfileStatus]
  }

  object SigningProfile {
    def apply(platformId: js.UndefOr[PlatformId] = js.undefined,
              profileName: js.UndefOr[ProfileName] = js.undefined,
              signingMaterial: js.UndefOr[SigningMaterial] = js.undefined,
              signingParameters: js.UndefOr[SigningParameters] = js.undefined,
              status: js.UndefOr[SigningProfileStatus] = js.undefined): SigningProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "platformId" -> platformId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "profileName" -> profileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingMaterial" -> signingMaterial.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingParameters" -> signingParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningProfile]
    }
  }

  object SigningProfileStatusEnum {
    val Active   = "Active"
    val Canceled = "Canceled"

    val values = IndexedSeq(Active, Canceled)
  }

  object SigningStatusEnum {
    val InProgress = "InProgress"
    val Failed     = "Failed"
    val Succeeded  = "Succeeded"

    val values = IndexedSeq(InProgress, Failed, Succeeded)
  }

  /**
    * An <code>S3Source</code> object that contains information about the S3 bucket where you saved your unsigned code.
    */
  @js.native
  trait Source extends js.Object {
    var s3: js.UndefOr[S3Source]
  }

  object Source {
    def apply(s3: js.UndefOr[S3Source] = js.undefined): Source = {
      val _fields = IndexedSeq[(String, js.Any)]("s3" -> s3.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Source]
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
    def apply(clientRequestToken: ClientRequestToken,
              destination: Destination,
              source: Source,
              profileName: js.UndefOr[ProfileName] = js.undefined): StartSigningJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "destination"        -> destination.asInstanceOf[js.Any],
        "source"             -> source.asInstanceOf[js.Any],
        "profileName" -> profileName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSigningJobRequest]
    }
  }

  @js.native
  trait StartSigningJobResponse extends js.Object {
    var jobId: js.UndefOr[JobId]
  }

  object StartSigningJobResponse {
    def apply(jobId: js.UndefOr[JobId] = js.undefined): StartSigningJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("jobId" -> jobId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSigningJobResponse]
    }
  }
}
