package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudfront {
  type AliasICPRecordals                         = js.Array[AliasICPRecordal]
  type AliasList                                 = js.Array[String]
  type AwsAccountNumberList                      = js.Array[String]
  type CacheBehaviorList                         = js.Array[CacheBehavior]
  type CertificateSource                         = String
  type CloudFrontOriginAccessIdentitySummaryList = js.Array[CloudFrontOriginAccessIdentitySummary]
  type CommentType                               = String
  type ContentTypeProfileList                    = js.Array[ContentTypeProfile]
  type CookieNameList                            = js.Array[String]
  type CustomErrorResponseList                   = js.Array[CustomErrorResponse]
  type DistributionSummaryList                   = js.Array[DistributionSummary]
  type EncryptionEntityList                      = js.Array[EncryptionEntity]
  type EventType                                 = String
  type FieldLevelEncryptionProfileSummaryList    = js.Array[FieldLevelEncryptionProfileSummary]
  type FieldLevelEncryptionSummaryList           = js.Array[FieldLevelEncryptionSummary]
  type FieldPatternList                          = js.Array[String]
  type Format                                    = String
  type GeoRestrictionType                        = String
  type HeaderList                                = js.Array[String]
  type HttpVersion                               = String
  type ICPRecordalStatus                         = String
  type InvalidationSummaryList                   = js.Array[InvalidationSummary]
  type ItemSelection                             = String
  type KeyPairIdList                             = js.Array[String]
  type LambdaFunctionARN                         = String
  type LambdaFunctionAssociationList             = js.Array[LambdaFunctionAssociation]
  type LocationList                              = js.Array[String]
  type Method                                    = String
  type MethodsList                               = js.Array[Method]
  type MinimumProtocolVersion                    = String
  type OriginCustomHeadersList                   = js.Array[OriginCustomHeader]
  type OriginGroupList                           = js.Array[OriginGroup]
  type OriginGroupMemberList                     = js.Array[OriginGroupMember]
  type OriginList                                = js.Array[Origin]
  type OriginProtocolPolicy                      = String
  type PathList                                  = js.Array[String]
  type PriceClass                                = String
  type PublicKeySummaryList                      = js.Array[PublicKeySummary]
  type QueryArgProfileList                       = js.Array[QueryArgProfile]
  type QueryStringCacheKeysList                  = js.Array[String]
  type ResourceARN                               = String
  type SSLSupportMethod                          = String
  type SignerList                                = js.Array[Signer]
  type SslProtocol                               = String
  type SslProtocolsList                          = js.Array[SslProtocol]
  type StatusCodeList                            = js.Array[Int]
  type StreamingDistributionSummaryList          = js.Array[StreamingDistributionSummary]
  type TagKey                                    = String
  type TagKeyList                                = js.Array[TagKey]
  type TagList                                   = js.Array[Tag]
  type TagValue                                  = String
  type ViewerProtocolPolicy                      = String
  type timestamp                                 = js.Date

  implicit final class CloudFrontOps(private val service: CloudFront) extends AnyVal {

    def createCloudFrontOriginAccessIdentityFuture(
        params: CreateCloudFrontOriginAccessIdentityRequest
    ): Future[CreateCloudFrontOriginAccessIdentityResult] =
      service.createCloudFrontOriginAccessIdentity(params).promise.toFuture
    def createDistributionFuture(params: CreateDistributionRequest): Future[CreateDistributionResult] =
      service.createDistribution(params).promise.toFuture
    def createDistributionWithTagsFuture(
        params: CreateDistributionWithTagsRequest
    ): Future[CreateDistributionWithTagsResult] = service.createDistributionWithTags(params).promise.toFuture
    def createFieldLevelEncryptionConfigFuture(
        params: CreateFieldLevelEncryptionConfigRequest
    ): Future[CreateFieldLevelEncryptionConfigResult] =
      service.createFieldLevelEncryptionConfig(params).promise.toFuture
    def createFieldLevelEncryptionProfileFuture(
        params: CreateFieldLevelEncryptionProfileRequest
    ): Future[CreateFieldLevelEncryptionProfileResult] =
      service.createFieldLevelEncryptionProfile(params).promise.toFuture
    def createInvalidationFuture(params: CreateInvalidationRequest): Future[CreateInvalidationResult] =
      service.createInvalidation(params).promise.toFuture
    def createPublicKeyFuture(params: CreatePublicKeyRequest): Future[CreatePublicKeyResult] =
      service.createPublicKey(params).promise.toFuture
    def createStreamingDistributionFuture(
        params: CreateStreamingDistributionRequest
    ): Future[CreateStreamingDistributionResult] = service.createStreamingDistribution(params).promise.toFuture
    def createStreamingDistributionWithTagsFuture(
        params: CreateStreamingDistributionWithTagsRequest
    ): Future[CreateStreamingDistributionWithTagsResult] =
      service.createStreamingDistributionWithTags(params).promise.toFuture
    def deleteCloudFrontOriginAccessIdentityFuture(
        params: DeleteCloudFrontOriginAccessIdentityRequest
    ): Future[js.Object] = service.deleteCloudFrontOriginAccessIdentity(params).promise.toFuture
    def deleteDistributionFuture(params: DeleteDistributionRequest): Future[js.Object] =
      service.deleteDistribution(params).promise.toFuture
    def deleteFieldLevelEncryptionConfigFuture(params: DeleteFieldLevelEncryptionConfigRequest): Future[js.Object] =
      service.deleteFieldLevelEncryptionConfig(params).promise.toFuture
    def deleteFieldLevelEncryptionProfileFuture(params: DeleteFieldLevelEncryptionProfileRequest): Future[js.Object] =
      service.deleteFieldLevelEncryptionProfile(params).promise.toFuture
    def deletePublicKeyFuture(params: DeletePublicKeyRequest): Future[js.Object] =
      service.deletePublicKey(params).promise.toFuture
    def deleteStreamingDistributionFuture(params: DeleteStreamingDistributionRequest): Future[js.Object] =
      service.deleteStreamingDistribution(params).promise.toFuture
    def getCloudFrontOriginAccessIdentityConfigFuture(
        params: GetCloudFrontOriginAccessIdentityConfigRequest
    ): Future[GetCloudFrontOriginAccessIdentityConfigResult] =
      service.getCloudFrontOriginAccessIdentityConfig(params).promise.toFuture
    def getCloudFrontOriginAccessIdentityFuture(
        params: GetCloudFrontOriginAccessIdentityRequest
    ): Future[GetCloudFrontOriginAccessIdentityResult] =
      service.getCloudFrontOriginAccessIdentity(params).promise.toFuture
    def getDistributionConfigFuture(params: GetDistributionConfigRequest): Future[GetDistributionConfigResult] =
      service.getDistributionConfig(params).promise.toFuture
    def getDistributionFuture(params: GetDistributionRequest): Future[GetDistributionResult] =
      service.getDistribution(params).promise.toFuture
    def getFieldLevelEncryptionConfigFuture(
        params: GetFieldLevelEncryptionConfigRequest
    ): Future[GetFieldLevelEncryptionConfigResult] = service.getFieldLevelEncryptionConfig(params).promise.toFuture
    def getFieldLevelEncryptionFuture(params: GetFieldLevelEncryptionRequest): Future[GetFieldLevelEncryptionResult] =
      service.getFieldLevelEncryption(params).promise.toFuture
    def getFieldLevelEncryptionProfileConfigFuture(
        params: GetFieldLevelEncryptionProfileConfigRequest
    ): Future[GetFieldLevelEncryptionProfileConfigResult] =
      service.getFieldLevelEncryptionProfileConfig(params).promise.toFuture
    def getFieldLevelEncryptionProfileFuture(
        params: GetFieldLevelEncryptionProfileRequest
    ): Future[GetFieldLevelEncryptionProfileResult] = service.getFieldLevelEncryptionProfile(params).promise.toFuture
    def getInvalidationFuture(params: GetInvalidationRequest): Future[GetInvalidationResult] =
      service.getInvalidation(params).promise.toFuture
    def getPublicKeyConfigFuture(params: GetPublicKeyConfigRequest): Future[GetPublicKeyConfigResult] =
      service.getPublicKeyConfig(params).promise.toFuture
    def getPublicKeyFuture(params: GetPublicKeyRequest): Future[GetPublicKeyResult] =
      service.getPublicKey(params).promise.toFuture
    def getStreamingDistributionConfigFuture(
        params: GetStreamingDistributionConfigRequest
    ): Future[GetStreamingDistributionConfigResult] = service.getStreamingDistributionConfig(params).promise.toFuture
    def getStreamingDistributionFuture(
        params: GetStreamingDistributionRequest
    ): Future[GetStreamingDistributionResult] = service.getStreamingDistribution(params).promise.toFuture
    def listCloudFrontOriginAccessIdentitiesFuture(
        params: ListCloudFrontOriginAccessIdentitiesRequest
    ): Future[ListCloudFrontOriginAccessIdentitiesResult] =
      service.listCloudFrontOriginAccessIdentities(params).promise.toFuture
    def listDistributionsByWebACLIdFuture(
        params: ListDistributionsByWebACLIdRequest
    ): Future[ListDistributionsByWebACLIdResult] = service.listDistributionsByWebACLId(params).promise.toFuture
    def listDistributionsFuture(params: ListDistributionsRequest): Future[ListDistributionsResult] =
      service.listDistributions(params).promise.toFuture
    def listFieldLevelEncryptionConfigsFuture(
        params: ListFieldLevelEncryptionConfigsRequest
    ): Future[ListFieldLevelEncryptionConfigsResult] = service.listFieldLevelEncryptionConfigs(params).promise.toFuture
    def listFieldLevelEncryptionProfilesFuture(
        params: ListFieldLevelEncryptionProfilesRequest
    ): Future[ListFieldLevelEncryptionProfilesResult] =
      service.listFieldLevelEncryptionProfiles(params).promise.toFuture
    def listInvalidationsFuture(params: ListInvalidationsRequest): Future[ListInvalidationsResult] =
      service.listInvalidations(params).promise.toFuture
    def listPublicKeysFuture(params: ListPublicKeysRequest): Future[ListPublicKeysResult] =
      service.listPublicKeys(params).promise.toFuture
    def listStreamingDistributionsFuture(
        params: ListStreamingDistributionsRequest
    ): Future[ListStreamingDistributionsResult] = service.listStreamingDistributions(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] =
      service.listTagsForResource(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    def updateCloudFrontOriginAccessIdentityFuture(
        params: UpdateCloudFrontOriginAccessIdentityRequest
    ): Future[UpdateCloudFrontOriginAccessIdentityResult] =
      service.updateCloudFrontOriginAccessIdentity(params).promise.toFuture
    def updateDistributionFuture(params: UpdateDistributionRequest): Future[UpdateDistributionResult] =
      service.updateDistribution(params).promise.toFuture
    def updateFieldLevelEncryptionConfigFuture(
        params: UpdateFieldLevelEncryptionConfigRequest
    ): Future[UpdateFieldLevelEncryptionConfigResult] =
      service.updateFieldLevelEncryptionConfig(params).promise.toFuture
    def updateFieldLevelEncryptionProfileFuture(
        params: UpdateFieldLevelEncryptionProfileRequest
    ): Future[UpdateFieldLevelEncryptionProfileResult] =
      service.updateFieldLevelEncryptionProfile(params).promise.toFuture
    def updatePublicKeyFuture(params: UpdatePublicKeyRequest): Future[UpdatePublicKeyResult] =
      service.updatePublicKey(params).promise.toFuture
    def updateStreamingDistributionFuture(
        params: UpdateStreamingDistributionRequest
    ): Future[UpdateStreamingDistributionResult] = service.updateStreamingDistribution(params).promise.toFuture
  }
}

package cloudfront {
  @js.native
  @JSImport("aws-sdk", "CloudFront")
  class CloudFront() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCloudFrontOriginAccessIdentity(
        params: CreateCloudFrontOriginAccessIdentityRequest
    ): Request[CreateCloudFrontOriginAccessIdentityResult]                                       = js.native
    def createDistribution(params: CreateDistributionRequest): Request[CreateDistributionResult] = js.native
    def createDistributionWithTags(
        params: CreateDistributionWithTagsRequest
    ): Request[CreateDistributionWithTagsResult] = js.native
    def createFieldLevelEncryptionConfig(
        params: CreateFieldLevelEncryptionConfigRequest
    ): Request[CreateFieldLevelEncryptionConfigResult] = js.native
    def createFieldLevelEncryptionProfile(
        params: CreateFieldLevelEncryptionProfileRequest
    ): Request[CreateFieldLevelEncryptionProfileResult]                                          = js.native
    def createInvalidation(params: CreateInvalidationRequest): Request[CreateInvalidationResult] = js.native
    def createPublicKey(params: CreatePublicKeyRequest): Request[CreatePublicKeyResult]          = js.native
    def createStreamingDistribution(
        params: CreateStreamingDistributionRequest
    ): Request[CreateStreamingDistributionResult] = js.native
    def createStreamingDistributionWithTags(
        params: CreateStreamingDistributionWithTagsRequest
    ): Request[CreateStreamingDistributionWithTagsResult] = js.native
    def deleteCloudFrontOriginAccessIdentity(params: DeleteCloudFrontOriginAccessIdentityRequest): Request[js.Object] =
      js.native
    def deleteDistribution(params: DeleteDistributionRequest): Request[js.Object] = js.native
    def deleteFieldLevelEncryptionConfig(params: DeleteFieldLevelEncryptionConfigRequest): Request[js.Object] =
      js.native
    def deleteFieldLevelEncryptionProfile(params: DeleteFieldLevelEncryptionProfileRequest): Request[js.Object] =
      js.native
    def deletePublicKey(params: DeletePublicKeyRequest): Request[js.Object]                         = js.native
    def deleteStreamingDistribution(params: DeleteStreamingDistributionRequest): Request[js.Object] = js.native
    def getCloudFrontOriginAccessIdentity(
        params: GetCloudFrontOriginAccessIdentityRequest
    ): Request[GetCloudFrontOriginAccessIdentityResult] = js.native
    def getCloudFrontOriginAccessIdentityConfig(
        params: GetCloudFrontOriginAccessIdentityConfigRequest
    ): Request[GetCloudFrontOriginAccessIdentityConfigResult]                                             = js.native
    def getDistribution(params: GetDistributionRequest): Request[GetDistributionResult]                   = js.native
    def getDistributionConfig(params: GetDistributionConfigRequest): Request[GetDistributionConfigResult] = js.native
    def getFieldLevelEncryption(params: GetFieldLevelEncryptionRequest): Request[GetFieldLevelEncryptionResult] =
      js.native
    def getFieldLevelEncryptionConfig(
        params: GetFieldLevelEncryptionConfigRequest
    ): Request[GetFieldLevelEncryptionConfigResult] = js.native
    def getFieldLevelEncryptionProfile(
        params: GetFieldLevelEncryptionProfileRequest
    ): Request[GetFieldLevelEncryptionProfileResult] = js.native
    def getFieldLevelEncryptionProfileConfig(
        params: GetFieldLevelEncryptionProfileConfigRequest
    ): Request[GetFieldLevelEncryptionProfileConfigResult]                                       = js.native
    def getInvalidation(params: GetInvalidationRequest): Request[GetInvalidationResult]          = js.native
    def getPublicKey(params: GetPublicKeyRequest): Request[GetPublicKeyResult]                   = js.native
    def getPublicKeyConfig(params: GetPublicKeyConfigRequest): Request[GetPublicKeyConfigResult] = js.native
    def getStreamingDistribution(params: GetStreamingDistributionRequest): Request[GetStreamingDistributionResult] =
      js.native
    def getStreamingDistributionConfig(
        params: GetStreamingDistributionConfigRequest
    ): Request[GetStreamingDistributionConfigResult] = js.native
    def listCloudFrontOriginAccessIdentities(
        params: ListCloudFrontOriginAccessIdentitiesRequest
    ): Request[ListCloudFrontOriginAccessIdentitiesResult]                                    = js.native
    def listDistributions(params: ListDistributionsRequest): Request[ListDistributionsResult] = js.native
    def listDistributionsByWebACLId(
        params: ListDistributionsByWebACLIdRequest
    ): Request[ListDistributionsByWebACLIdResult] = js.native
    def listFieldLevelEncryptionConfigs(
        params: ListFieldLevelEncryptionConfigsRequest
    ): Request[ListFieldLevelEncryptionConfigsResult] = js.native
    def listFieldLevelEncryptionProfiles(
        params: ListFieldLevelEncryptionProfilesRequest
    ): Request[ListFieldLevelEncryptionProfilesResult]                                        = js.native
    def listInvalidations(params: ListInvalidationsRequest): Request[ListInvalidationsResult] = js.native
    def listPublicKeys(params: ListPublicKeysRequest): Request[ListPublicKeysResult]          = js.native
    def listStreamingDistributions(
        params: ListStreamingDistributionsRequest
    ): Request[ListStreamingDistributionsResult]                                                    = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                 = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                             = js.native
    def updateCloudFrontOriginAccessIdentity(
        params: UpdateCloudFrontOriginAccessIdentityRequest
    ): Request[UpdateCloudFrontOriginAccessIdentityResult]                                       = js.native
    def updateDistribution(params: UpdateDistributionRequest): Request[UpdateDistributionResult] = js.native
    def updateFieldLevelEncryptionConfig(
        params: UpdateFieldLevelEncryptionConfigRequest
    ): Request[UpdateFieldLevelEncryptionConfigResult] = js.native
    def updateFieldLevelEncryptionProfile(
        params: UpdateFieldLevelEncryptionProfileRequest
    ): Request[UpdateFieldLevelEncryptionProfileResult]                                 = js.native
    def updatePublicKey(params: UpdatePublicKeyRequest): Request[UpdatePublicKeyResult] = js.native
    def updateStreamingDistribution(
        params: UpdateStreamingDistributionRequest
    ): Request[UpdateStreamingDistributionResult] = js.native
  }

  /**
    * A complex type that lists the AWS accounts, if any, that you included in the <code>TrustedSigners</code> complex type for this distribution. These are the accounts that you want to allow to create signed URLs for private content.
    *  The <code>Signer</code> complex type lists the AWS account number of the trusted signer or <code>self</code> if the signer is the AWS account that created the distribution. The <code>Signer</code> element also includes the IDs of any active CloudFront key pairs that are associated with the trusted signer's AWS account. If no <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer can't create signed URLs.
    *  For more information, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html|Serving Private Content through CloudFront]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait ActiveTrustedSigners extends js.Object {
    var Enabled: Boolean
    var Quantity: Int
    var Items: js.UndefOr[SignerList]
  }

  object ActiveTrustedSigners {
    def apply(
        Enabled: Boolean,
        Quantity: Int,
        Items: js.UndefOr[SignerList] = js.undefined
    ): ActiveTrustedSigners = {
      val __obj = js.Dictionary[js.Any](
        "Enabled"  -> Enabled.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActiveTrustedSigners]
    }
  }

  /**
    * AWS services in China customers must file for an Internet Content Provider (ICP) recordal if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions. The status is returned in the CloudFront response; you can't configure it yourself.
    *  For more information about ICP recordals, see [[https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html| Signup, Accounts, and Credentials]] in <i>Getting Started with AWS services in China</i>.
    */
  @js.native
  trait AliasICPRecordal extends js.Object {
    var CNAME: js.UndefOr[String]
    var ICPRecordalStatus: js.UndefOr[ICPRecordalStatus]
  }

  object AliasICPRecordal {
    def apply(
        CNAME: js.UndefOr[String] = js.undefined,
        ICPRecordalStatus: js.UndefOr[ICPRecordalStatus] = js.undefined
    ): AliasICPRecordal = {
      val __obj = js.Dictionary.empty[js.Any]
      CNAME.foreach(__v => __obj.update("CNAME", __v.asInstanceOf[js.Any]))
      ICPRecordalStatus.foreach(__v => __obj.update("ICPRecordalStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AliasICPRecordal]
    }
  }

  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
    */
  @js.native
  trait Aliases extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[AliasList]
  }

  object Aliases {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[AliasList] = js.undefined
    ): Aliases = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Aliases]
    }
  }

  /**
    * A complex type that controls which HTTP methods CloudFront processes and forwards to your Amazon S3 bucket or your custom origin. There are three choices:
    * * CloudFront forwards only <code>GET</code> and <code>HEAD</code> requests.
    *  * CloudFront forwards only <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests.
    *  * CloudFront forwards <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and <code>DELETE</code> requests.
    * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or to your custom origin so users can't perform operations that you don't want them to. For example, you might not want users to have permissions to delete objects from your origin.
    */
  @js.native
  trait AllowedMethods extends js.Object {
    var Items: MethodsList
    var Quantity: Int
    var CachedMethods: js.UndefOr[CachedMethods]
  }

  object AllowedMethods {
    def apply(
        Items: MethodsList,
        Quantity: Int,
        CachedMethods: js.UndefOr[CachedMethods] = js.undefined
    ): AllowedMethods = {
      val __obj = js.Dictionary[js.Any](
        "Items"    -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      CachedMethods.foreach(__v => __obj.update("CachedMethods", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AllowedMethods]
    }
  }

  /**
    * A complex type that describes how CloudFront processes requests.
    *  You must create at least as many cache behaviors (including the default cache behavior) as you have origins if you want CloudFront to distribute objects from all of the origins. Each cache behavior specifies the one origin from which you want CloudFront to get objects. If you have two origins and only the default cache behavior, the default cache behavior will cause CloudFront to get objects from one of the origins, but the other origin is never used.
    *  For the current limit on the number of cache behaviors that you can add to a distribution, see [[https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront|Amazon CloudFront Limits]] in the <i>AWS General Reference</i>.
    *  If you don't want to specify any cache behaviors, include only an empty <code>CacheBehaviors</code> element. Don't include an empty <code>CacheBehavior</code> element, or CloudFront returns a <code>MalformedXML</code> error.
    *  To delete all cache behaviors in an existing distribution, update the distribution configuration and include only an empty <code>CacheBehaviors</code> element.
    *  To add, change, or remove one or more cache behaviors, update the distribution configuration and specify all of the cache behaviors that you want to include in the updated distribution.
    *  For more information about cache behaviors, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior|Cache Behaviors]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait CacheBehavior extends js.Object {
    var ForwardedValues: ForwardedValues
    var MinTTL: Double
    var PathPattern: String
    var TargetOriginId: String
    var TrustedSigners: TrustedSigners
    var ViewerProtocolPolicy: ViewerProtocolPolicy
    var AllowedMethods: js.UndefOr[AllowedMethods]
    var Compress: js.UndefOr[Boolean]
    var DefaultTTL: js.UndefOr[Double]
    var FieldLevelEncryptionId: js.UndefOr[String]
    var LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations]
    var MaxTTL: js.UndefOr[Double]
    var SmoothStreaming: js.UndefOr[Boolean]
  }

  object CacheBehavior {
    def apply(
        ForwardedValues: ForwardedValues,
        MinTTL: Double,
        PathPattern: String,
        TargetOriginId: String,
        TrustedSigners: TrustedSigners,
        ViewerProtocolPolicy: ViewerProtocolPolicy,
        AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
        Compress: js.UndefOr[Boolean] = js.undefined,
        DefaultTTL: js.UndefOr[Double] = js.undefined,
        FieldLevelEncryptionId: js.UndefOr[String] = js.undefined,
        LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations] = js.undefined,
        MaxTTL: js.UndefOr[Double] = js.undefined,
        SmoothStreaming: js.UndefOr[Boolean] = js.undefined
    ): CacheBehavior = {
      val __obj = js.Dictionary[js.Any](
        "ForwardedValues"      -> ForwardedValues.asInstanceOf[js.Any],
        "MinTTL"               -> MinTTL.asInstanceOf[js.Any],
        "PathPattern"          -> PathPattern.asInstanceOf[js.Any],
        "TargetOriginId"       -> TargetOriginId.asInstanceOf[js.Any],
        "TrustedSigners"       -> TrustedSigners.asInstanceOf[js.Any],
        "ViewerProtocolPolicy" -> ViewerProtocolPolicy.asInstanceOf[js.Any]
      )

      AllowedMethods.foreach(__v => __obj.update("AllowedMethods", __v.asInstanceOf[js.Any]))
      Compress.foreach(__v => __obj.update("Compress", __v.asInstanceOf[js.Any]))
      DefaultTTL.foreach(__v => __obj.update("DefaultTTL", __v.asInstanceOf[js.Any]))
      FieldLevelEncryptionId.foreach(__v => __obj.update("FieldLevelEncryptionId", __v.asInstanceOf[js.Any]))
      LambdaFunctionAssociations.foreach(__v => __obj.update("LambdaFunctionAssociations", __v.asInstanceOf[js.Any]))
      MaxTTL.foreach(__v => __obj.update("MaxTTL", __v.asInstanceOf[js.Any]))
      SmoothStreaming.foreach(__v => __obj.update("SmoothStreaming", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheBehavior]
    }
  }

  /**
    * A complex type that contains zero or more <code>CacheBehavior</code> elements.
    */
  @js.native
  trait CacheBehaviors extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[CacheBehaviorList]
  }

  object CacheBehaviors {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[CacheBehaviorList] = js.undefined
    ): CacheBehaviors = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheBehaviors]
    }
  }

  /**
    * A complex type that controls whether CloudFront caches the response to requests using the specified HTTP methods. There are two choices:
    * * CloudFront caches responses to <code>GET</code> and <code>HEAD</code> requests.
    *  * CloudFront caches responses to <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests.
    * If you pick the second choice for your Amazon S3 Origin, you may need to forward Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the responses to be cached correctly.
    */
  @js.native
  trait CachedMethods extends js.Object {
    var Items: MethodsList
    var Quantity: Int
  }

  object CachedMethods {
    def apply(
        Items: MethodsList,
        Quantity: Int
    ): CachedMethods = {
      val __obj = js.Dictionary[js.Any](
        "Items"    -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CachedMethods]
    }
  }

  object CertificateSourceEnum {
    val cloudfront = "cloudfront"
    val iam        = "iam"
    val acm        = "acm"

    val values = js.Object.freeze(js.Array(cloudfront, iam, acm))
  }

  /**
    * CloudFront origin access identity.
    */
  @js.native
  trait CloudFrontOriginAccessIdentity extends js.Object {
    var Id: String
    var S3CanonicalUserId: String
    var CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig]
  }

  object CloudFrontOriginAccessIdentity {
    def apply(
        Id: String,
        S3CanonicalUserId: String,
        CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined
    ): CloudFrontOriginAccessIdentity = {
      val __obj = js.Dictionary[js.Any](
        "Id"                -> Id.asInstanceOf[js.Any],
        "S3CanonicalUserId" -> S3CanonicalUserId.asInstanceOf[js.Any]
      )

      CloudFrontOriginAccessIdentityConfig.foreach(
        __v => __obj.update("CloudFrontOriginAccessIdentityConfig", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CloudFrontOriginAccessIdentity]
    }
  }

  /**
    * Origin access identity configuration. Send a <code>GET</code> request to the <code>/<i>CloudFront API version</i>/CloudFront/identity ID/config</code> resource.
    */
  @js.native
  trait CloudFrontOriginAccessIdentityConfig extends js.Object {
    var CallerReference: String
    var Comment: String
  }

  object CloudFrontOriginAccessIdentityConfig {
    def apply(
        CallerReference: String,
        Comment: String
    ): CloudFrontOriginAccessIdentityConfig = {
      val __obj = js.Dictionary[js.Any](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Comment"         -> Comment.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CloudFrontOriginAccessIdentityConfig]
    }
  }

  /**
    * Lists the origin access identities for CloudFront.Send a <code>GET</code> request to the <code>/<i>CloudFront API version</i>/origin-access-identity/cloudfront</code> resource. The response includes a <code>CloudFrontOriginAccessIdentityList</code> element with zero or more <code>CloudFrontOriginAccessIdentitySummary</code> child elements. By default, your entire list of origin access identities is returned in one single page. If the list is long, you can paginate it using the <code>MaxItems</code> and <code>Marker</code> parameters.
    */
  @js.native
  trait CloudFrontOriginAccessIdentityList extends js.Object {
    var IsTruncated: Boolean
    var Marker: String
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[CloudFrontOriginAccessIdentitySummaryList]
    var NextMarker: js.UndefOr[String]
  }

  object CloudFrontOriginAccessIdentityList {
    def apply(
        IsTruncated: Boolean,
        Marker: String,
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[CloudFrontOriginAccessIdentitySummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): CloudFrontOriginAccessIdentityList = {
      val __obj = js.Dictionary[js.Any](
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker"      -> Marker.asInstanceOf[js.Any],
        "MaxItems"    -> MaxItems.asInstanceOf[js.Any],
        "Quantity"    -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudFrontOriginAccessIdentityList]
    }
  }

  /**
    * Summary of the information about a CloudFront origin access identity.
    */
  @js.native
  trait CloudFrontOriginAccessIdentitySummary extends js.Object {
    var Comment: String
    var Id: String
    var S3CanonicalUserId: String
  }

  object CloudFrontOriginAccessIdentitySummary {
    def apply(
        Comment: String,
        Id: String,
        S3CanonicalUserId: String
    ): CloudFrontOriginAccessIdentitySummary = {
      val __obj = js.Dictionary[js.Any](
        "Comment"           -> Comment.asInstanceOf[js.Any],
        "Id"                -> Id.asInstanceOf[js.Any],
        "S3CanonicalUserId" -> S3CanonicalUserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CloudFrontOriginAccessIdentitySummary]
    }
  }

  /**
    * A field-level encryption content type profile.
    */
  @js.native
  trait ContentTypeProfile extends js.Object {
    var ContentType: String
    var Format: Format
    var ProfileId: js.UndefOr[String]
  }

  object ContentTypeProfile {
    def apply(
        ContentType: String,
        Format: Format,
        ProfileId: js.UndefOr[String] = js.undefined
    ): ContentTypeProfile = {
      val __obj = js.Dictionary[js.Any](
        "ContentType" -> ContentType.asInstanceOf[js.Any],
        "Format"      -> Format.asInstanceOf[js.Any]
      )

      ProfileId.foreach(__v => __obj.update("ProfileId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContentTypeProfile]
    }
  }

  /**
    * The configuration for a field-level encryption content type-profile mapping.
    */
  @js.native
  trait ContentTypeProfileConfig extends js.Object {
    var ForwardWhenContentTypeIsUnknown: Boolean
    var ContentTypeProfiles: js.UndefOr[ContentTypeProfiles]
  }

  object ContentTypeProfileConfig {
    def apply(
        ForwardWhenContentTypeIsUnknown: Boolean,
        ContentTypeProfiles: js.UndefOr[ContentTypeProfiles] = js.undefined
    ): ContentTypeProfileConfig = {
      val __obj = js.Dictionary[js.Any](
        "ForwardWhenContentTypeIsUnknown" -> ForwardWhenContentTypeIsUnknown.asInstanceOf[js.Any]
      )

      ContentTypeProfiles.foreach(__v => __obj.update("ContentTypeProfiles", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContentTypeProfileConfig]
    }
  }

  /**
    * Field-level encryption content type-profile.
    */
  @js.native
  trait ContentTypeProfiles extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[ContentTypeProfileList]
  }

  object ContentTypeProfiles {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[ContentTypeProfileList] = js.undefined
    ): ContentTypeProfiles = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContentTypeProfiles]
    }
  }

  /**
    * A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones. For more information about forwarding cookies to the origin, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html| Caching Content Based on Request Headers]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait CookieNames extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[CookieNameList]
  }

  object CookieNames {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[CookieNameList] = js.undefined
    ): CookieNames = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CookieNames]
    }
  }

  /**
    * A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones. For more information about forwarding cookies to the origin, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html|Caching Content Based on Cookies]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait CookiePreference extends js.Object {
    var Forward: ItemSelection
    var WhitelistedNames: js.UndefOr[CookieNames]
  }

  object CookiePreference {
    def apply(
        Forward: ItemSelection,
        WhitelistedNames: js.UndefOr[CookieNames] = js.undefined
    ): CookiePreference = {
      val __obj = js.Dictionary[js.Any](
        "Forward" -> Forward.asInstanceOf[js.Any]
      )

      WhitelistedNames.foreach(__v => __obj.update("WhitelistedNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CookiePreference]
    }
  }

  /**
    * The request to create a new origin access identity (OAI). An origin access identity is a special CloudFront user that you can associate with Amazon S3 origins, so that you can secure all or just some of your Amazon S3 content. For more information, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html| Restricting Access to Amazon S3 Content by Using an Origin Access Identity]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait CreateCloudFrontOriginAccessIdentityRequest extends js.Object {
    var CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig
  }

  object CreateCloudFrontOriginAccessIdentityRequest {
    def apply(
        CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig
    ): CreateCloudFrontOriginAccessIdentityRequest = {
      val __obj = js.Dictionary[js.Any](
        "CloudFrontOriginAccessIdentityConfig" -> CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCloudFrontOriginAccessIdentityRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait CreateCloudFrontOriginAccessIdentityResult extends js.Object {
    var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity]
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
  }

  object CreateCloudFrontOriginAccessIdentityResult {
    def apply(
        CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateCloudFrontOriginAccessIdentityResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudFrontOriginAccessIdentity.foreach(
        __v => __obj.update("CloudFrontOriginAccessIdentity", __v.asInstanceOf[js.Any])
      )
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCloudFrontOriginAccessIdentityResult]
    }
  }

  /**
    * The request to create a new distribution.
    */
  @js.native
  trait CreateDistributionRequest extends js.Object {
    var DistributionConfig: DistributionConfig
  }

  object CreateDistributionRequest {
    def apply(
        DistributionConfig: DistributionConfig
    ): CreateDistributionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DistributionConfig" -> DistributionConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDistributionRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait CreateDistributionResult extends js.Object {
    var Distribution: js.UndefOr[Distribution]
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
  }

  object CreateDistributionResult {
    def apply(
        Distribution: js.UndefOr[Distribution] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateDistributionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Distribution.foreach(__v => __obj.update("Distribution", __v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDistributionResult]
    }
  }

  /**
    * The request to create a new distribution with tags.
    */
  @js.native
  trait CreateDistributionWithTagsRequest extends js.Object {
    var DistributionConfigWithTags: DistributionConfigWithTags
  }

  object CreateDistributionWithTagsRequest {
    def apply(
        DistributionConfigWithTags: DistributionConfigWithTags
    ): CreateDistributionWithTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DistributionConfigWithTags" -> DistributionConfigWithTags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDistributionWithTagsRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait CreateDistributionWithTagsResult extends js.Object {
    var Distribution: js.UndefOr[Distribution]
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
  }

  object CreateDistributionWithTagsResult {
    def apply(
        Distribution: js.UndefOr[Distribution] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateDistributionWithTagsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Distribution.foreach(__v => __obj.update("Distribution", __v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDistributionWithTagsResult]
    }
  }

  @js.native
  trait CreateFieldLevelEncryptionConfigRequest extends js.Object {
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
  }

  object CreateFieldLevelEncryptionConfigRequest {
    def apply(
        FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
    ): CreateFieldLevelEncryptionConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "FieldLevelEncryptionConfig" -> FieldLevelEncryptionConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateFieldLevelEncryptionConfigRequest]
    }
  }

  @js.native
  trait CreateFieldLevelEncryptionConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption]
    var Location: js.UndefOr[String]
  }

  object CreateFieldLevelEncryptionConfigResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateFieldLevelEncryptionConfigResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      FieldLevelEncryption.foreach(__v => __obj.update("FieldLevelEncryption", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFieldLevelEncryptionConfigResult]
    }
  }

  @js.native
  trait CreateFieldLevelEncryptionProfileRequest extends js.Object {
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
  }

  object CreateFieldLevelEncryptionProfileRequest {
    def apply(
        FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
    ): CreateFieldLevelEncryptionProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "FieldLevelEncryptionProfileConfig" -> FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateFieldLevelEncryptionProfileRequest]
    }
  }

  @js.native
  trait CreateFieldLevelEncryptionProfileResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile]
    var Location: js.UndefOr[String]
  }

  object CreateFieldLevelEncryptionProfileResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateFieldLevelEncryptionProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      FieldLevelEncryptionProfile.foreach(__v => __obj.update("FieldLevelEncryptionProfile", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFieldLevelEncryptionProfileResult]
    }
  }

  /**
    * The request to create an invalidation.
    */
  @js.native
  trait CreateInvalidationRequest extends js.Object {
    var DistributionId: String
    var InvalidationBatch: InvalidationBatch
  }

  object CreateInvalidationRequest {
    def apply(
        DistributionId: String,
        InvalidationBatch: InvalidationBatch
    ): CreateInvalidationRequest = {
      val __obj = js.Dictionary[js.Any](
        "DistributionId"    -> DistributionId.asInstanceOf[js.Any],
        "InvalidationBatch" -> InvalidationBatch.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateInvalidationRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait CreateInvalidationResult extends js.Object {
    var Invalidation: js.UndefOr[Invalidation]
    var Location: js.UndefOr[String]
  }

  object CreateInvalidationResult {
    def apply(
        Invalidation: js.UndefOr[Invalidation] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateInvalidationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Invalidation.foreach(__v => __obj.update("Invalidation", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInvalidationResult]
    }
  }

  @js.native
  trait CreatePublicKeyRequest extends js.Object {
    var PublicKeyConfig: PublicKeyConfig
  }

  object CreatePublicKeyRequest {
    def apply(
        PublicKeyConfig: PublicKeyConfig
    ): CreatePublicKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PublicKeyConfig" -> PublicKeyConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreatePublicKeyRequest]
    }
  }

  @js.native
  trait CreatePublicKeyResult extends js.Object {
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
    var PublicKey: js.UndefOr[PublicKey]
  }

  object CreatePublicKeyResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined,
        PublicKey: js.UndefOr[PublicKey] = js.undefined
    ): CreatePublicKeyResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.update("PublicKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePublicKeyResult]
    }
  }

  /**
    * The request to create a new streaming distribution.
    */
  @js.native
  trait CreateStreamingDistributionRequest extends js.Object {
    var StreamingDistributionConfig: StreamingDistributionConfig
  }

  object CreateStreamingDistributionRequest {
    def apply(
        StreamingDistributionConfig: StreamingDistributionConfig
    ): CreateStreamingDistributionRequest = {
      val __obj = js.Dictionary[js.Any](
        "StreamingDistributionConfig" -> StreamingDistributionConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateStreamingDistributionRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait CreateStreamingDistributionResult extends js.Object {
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
    var StreamingDistribution: js.UndefOr[StreamingDistribution]
  }

  object CreateStreamingDistributionResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined,
        StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
    ): CreateStreamingDistributionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      StreamingDistribution.foreach(__v => __obj.update("StreamingDistribution", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamingDistributionResult]
    }
  }

  /**
    * The request to create a new streaming distribution with tags.
    */
  @js.native
  trait CreateStreamingDistributionWithTagsRequest extends js.Object {
    var StreamingDistributionConfigWithTags: StreamingDistributionConfigWithTags
  }

  object CreateStreamingDistributionWithTagsRequest {
    def apply(
        StreamingDistributionConfigWithTags: StreamingDistributionConfigWithTags
    ): CreateStreamingDistributionWithTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "StreamingDistributionConfigWithTags" -> StreamingDistributionConfigWithTags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateStreamingDistributionWithTagsRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait CreateStreamingDistributionWithTagsResult extends js.Object {
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
    var StreamingDistribution: js.UndefOr[StreamingDistribution]
  }

  object CreateStreamingDistributionWithTagsResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined,
        StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
    ): CreateStreamingDistributionWithTagsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      StreamingDistribution.foreach(__v => __obj.update("StreamingDistribution", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamingDistributionWithTagsResult]
    }
  }

  /**
    * A complex type that controls:
    * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning the response to the viewer.
    *  * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
    * For more information about custom error pages, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html|Customizing Error Responses]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait CustomErrorResponse extends js.Object {
    var ErrorCode: Int
    var ErrorCachingMinTTL: js.UndefOr[Double]
    var ResponseCode: js.UndefOr[String]
    var ResponsePagePath: js.UndefOr[String]
  }

  object CustomErrorResponse {
    def apply(
        ErrorCode: Int,
        ErrorCachingMinTTL: js.UndefOr[Double] = js.undefined,
        ResponseCode: js.UndefOr[String] = js.undefined,
        ResponsePagePath: js.UndefOr[String] = js.undefined
    ): CustomErrorResponse = {
      val __obj = js.Dictionary[js.Any](
        "ErrorCode" -> ErrorCode.asInstanceOf[js.Any]
      )

      ErrorCachingMinTTL.foreach(__v => __obj.update("ErrorCachingMinTTL", __v.asInstanceOf[js.Any]))
      ResponseCode.foreach(__v => __obj.update("ResponseCode", __v.asInstanceOf[js.Any]))
      ResponsePagePath.foreach(__v => __obj.update("ResponsePagePath", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomErrorResponse]
    }
  }

  /**
    * A complex type that controls:
    * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning the response to the viewer.
    *  * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
    * For more information about custom error pages, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html|Customizing Error Responses]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait CustomErrorResponses extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[CustomErrorResponseList]
  }

  object CustomErrorResponses {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[CustomErrorResponseList] = js.undefined
    ): CustomErrorResponses = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomErrorResponses]
    }
  }

  /**
    * A complex type that contains the list of Custom Headers for each origin.
    */
  @js.native
  trait CustomHeaders extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[OriginCustomHeadersList]
  }

  object CustomHeaders {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[OriginCustomHeadersList] = js.undefined
    ): CustomHeaders = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomHeaders]
    }
  }

  /**
    * A custom origin or an Amazon S3 bucket configured as a website endpoint.
    */
  @js.native
  trait CustomOriginConfig extends js.Object {
    var HTTPPort: Int
    var HTTPSPort: Int
    var OriginProtocolPolicy: OriginProtocolPolicy
    var OriginKeepaliveTimeout: js.UndefOr[Int]
    var OriginReadTimeout: js.UndefOr[Int]
    var OriginSslProtocols: js.UndefOr[OriginSslProtocols]
  }

  object CustomOriginConfig {
    def apply(
        HTTPPort: Int,
        HTTPSPort: Int,
        OriginProtocolPolicy: OriginProtocolPolicy,
        OriginKeepaliveTimeout: js.UndefOr[Int] = js.undefined,
        OriginReadTimeout: js.UndefOr[Int] = js.undefined,
        OriginSslProtocols: js.UndefOr[OriginSslProtocols] = js.undefined
    ): CustomOriginConfig = {
      val __obj = js.Dictionary[js.Any](
        "HTTPPort"             -> HTTPPort.asInstanceOf[js.Any],
        "HTTPSPort"            -> HTTPSPort.asInstanceOf[js.Any],
        "OriginProtocolPolicy" -> OriginProtocolPolicy.asInstanceOf[js.Any]
      )

      OriginKeepaliveTimeout.foreach(__v => __obj.update("OriginKeepaliveTimeout", __v.asInstanceOf[js.Any]))
      OriginReadTimeout.foreach(__v => __obj.update("OriginReadTimeout", __v.asInstanceOf[js.Any]))
      OriginSslProtocols.foreach(__v => __obj.update("OriginSslProtocols", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomOriginConfig]
    }
  }

  /**
    * A complex type that describes the default cache behavior if you don't specify a <code>CacheBehavior</code> element or if files don't match any of the values of <code>PathPattern</code> in <code>CacheBehavior</code> elements. You must create exactly one default cache behavior.
    */
  @js.native
  trait DefaultCacheBehavior extends js.Object {
    var ForwardedValues: ForwardedValues
    var MinTTL: Double
    var TargetOriginId: String
    var TrustedSigners: TrustedSigners
    var ViewerProtocolPolicy: ViewerProtocolPolicy
    var AllowedMethods: js.UndefOr[AllowedMethods]
    var Compress: js.UndefOr[Boolean]
    var DefaultTTL: js.UndefOr[Double]
    var FieldLevelEncryptionId: js.UndefOr[String]
    var LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations]
    var MaxTTL: js.UndefOr[Double]
    var SmoothStreaming: js.UndefOr[Boolean]
  }

  object DefaultCacheBehavior {
    def apply(
        ForwardedValues: ForwardedValues,
        MinTTL: Double,
        TargetOriginId: String,
        TrustedSigners: TrustedSigners,
        ViewerProtocolPolicy: ViewerProtocolPolicy,
        AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
        Compress: js.UndefOr[Boolean] = js.undefined,
        DefaultTTL: js.UndefOr[Double] = js.undefined,
        FieldLevelEncryptionId: js.UndefOr[String] = js.undefined,
        LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations] = js.undefined,
        MaxTTL: js.UndefOr[Double] = js.undefined,
        SmoothStreaming: js.UndefOr[Boolean] = js.undefined
    ): DefaultCacheBehavior = {
      val __obj = js.Dictionary[js.Any](
        "ForwardedValues"      -> ForwardedValues.asInstanceOf[js.Any],
        "MinTTL"               -> MinTTL.asInstanceOf[js.Any],
        "TargetOriginId"       -> TargetOriginId.asInstanceOf[js.Any],
        "TrustedSigners"       -> TrustedSigners.asInstanceOf[js.Any],
        "ViewerProtocolPolicy" -> ViewerProtocolPolicy.asInstanceOf[js.Any]
      )

      AllowedMethods.foreach(__v => __obj.update("AllowedMethods", __v.asInstanceOf[js.Any]))
      Compress.foreach(__v => __obj.update("Compress", __v.asInstanceOf[js.Any]))
      DefaultTTL.foreach(__v => __obj.update("DefaultTTL", __v.asInstanceOf[js.Any]))
      FieldLevelEncryptionId.foreach(__v => __obj.update("FieldLevelEncryptionId", __v.asInstanceOf[js.Any]))
      LambdaFunctionAssociations.foreach(__v => __obj.update("LambdaFunctionAssociations", __v.asInstanceOf[js.Any]))
      MaxTTL.foreach(__v => __obj.update("MaxTTL", __v.asInstanceOf[js.Any]))
      SmoothStreaming.foreach(__v => __obj.update("SmoothStreaming", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultCacheBehavior]
    }
  }

  /**
    * Deletes a origin access identity.
    */
  @js.native
  trait DeleteCloudFrontOriginAccessIdentityRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object DeleteCloudFrontOriginAccessIdentityRequest {
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeleteCloudFrontOriginAccessIdentityRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCloudFrontOriginAccessIdentityRequest]
    }
  }

  /**
    * This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the following steps.
    *  ```To delete a web distribution using the CloudFront API:```
    *  <ol> * Disable the web distribution
    *  * Submit a <code>GET Distribution Config</code> request to get the current configuration and the <code>Etag</code> header for the distribution.
    *  * Update the XML document that was returned in the response to your <code>GET Distribution Config</code> request to change the value of <code>Enabled</code> to <code>false</code>.
    *  * Submit a <code>PUT Distribution Config</code> request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Set the value of the HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when you submitted the <code>GET Distribution Config</code> request in Step 2.
    *  * Review the response to the <code>PUT Distribution Config</code> request to confirm that the distribution was successfully disabled.
    *  * Submit a <code>GET Distribution</code> request to confirm that your changes have propagated. When propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.
    *  * Submit a <code>DELETE Distribution</code> request. Set the value of the HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when you submitted the <code>GET Distribution Config</code> request in Step 6.
    *  * Review the response to your <code>DELETE Distribution</code> request to confirm that the distribution was successfully deleted.
    *  </ol> For information about deleting a distribution using the CloudFront console, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html|Deleting a Distribution]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait DeleteDistributionRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object DeleteDistributionRequest {
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeleteDistributionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDistributionRequest]
    }
  }

  @js.native
  trait DeleteFieldLevelEncryptionConfigRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object DeleteFieldLevelEncryptionConfigRequest {
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeleteFieldLevelEncryptionConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFieldLevelEncryptionConfigRequest]
    }
  }

  @js.native
  trait DeleteFieldLevelEncryptionProfileRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object DeleteFieldLevelEncryptionProfileRequest {
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeleteFieldLevelEncryptionProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFieldLevelEncryptionProfileRequest]
    }
  }

  @js.native
  trait DeletePublicKeyRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object DeletePublicKeyRequest {
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeletePublicKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePublicKeyRequest]
    }
  }

  /**
    * The request to delete a streaming distribution.
    */
  @js.native
  trait DeleteStreamingDistributionRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object DeleteStreamingDistributionRequest {
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeleteStreamingDistributionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStreamingDistributionRequest]
    }
  }

  /**
    * A distribution tells CloudFront where you want content to be delivered from, and the details about how to track and manage content delivery.
    */
  @js.native
  trait Distribution extends js.Object {
    var ARN: String
    var ActiveTrustedSigners: ActiveTrustedSigners
    var DistributionConfig: DistributionConfig
    var DomainName: String
    var Id: String
    var InProgressInvalidationBatches: Int
    var LastModifiedTime: timestamp
    var Status: String
    var AliasICPRecordals: js.UndefOr[AliasICPRecordals]
  }

  object Distribution {
    def apply(
        ARN: String,
        ActiveTrustedSigners: ActiveTrustedSigners,
        DistributionConfig: DistributionConfig,
        DomainName: String,
        Id: String,
        InProgressInvalidationBatches: Int,
        LastModifiedTime: timestamp,
        Status: String,
        AliasICPRecordals: js.UndefOr[AliasICPRecordals] = js.undefined
    ): Distribution = {
      val __obj = js.Dictionary[js.Any](
        "ARN"                           -> ARN.asInstanceOf[js.Any],
        "ActiveTrustedSigners"          -> ActiveTrustedSigners.asInstanceOf[js.Any],
        "DistributionConfig"            -> DistributionConfig.asInstanceOf[js.Any],
        "DomainName"                    -> DomainName.asInstanceOf[js.Any],
        "Id"                            -> Id.asInstanceOf[js.Any],
        "InProgressInvalidationBatches" -> InProgressInvalidationBatches.asInstanceOf[js.Any],
        "LastModifiedTime"              -> LastModifiedTime.asInstanceOf[js.Any],
        "Status"                        -> Status.asInstanceOf[js.Any]
      )

      AliasICPRecordals.foreach(__v => __obj.update("AliasICPRecordals", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Distribution]
    }
  }

  /**
    * A distribution configuration.
    */
  @js.native
  trait DistributionConfig extends js.Object {
    var CallerReference: String
    var Comment: CommentType
    var DefaultCacheBehavior: DefaultCacheBehavior
    var Enabled: Boolean
    var Origins: Origins
    var Aliases: js.UndefOr[Aliases]
    var CacheBehaviors: js.UndefOr[CacheBehaviors]
    var CustomErrorResponses: js.UndefOr[CustomErrorResponses]
    var DefaultRootObject: js.UndefOr[String]
    var HttpVersion: js.UndefOr[HttpVersion]
    var IsIPV6Enabled: js.UndefOr[Boolean]
    var Logging: js.UndefOr[LoggingConfig]
    var OriginGroups: js.UndefOr[OriginGroups]
    var PriceClass: js.UndefOr[PriceClass]
    var Restrictions: js.UndefOr[Restrictions]
    var ViewerCertificate: js.UndefOr[ViewerCertificate]
    var WebACLId: js.UndefOr[String]
  }

  object DistributionConfig {
    def apply(
        CallerReference: String,
        Comment: CommentType,
        DefaultCacheBehavior: DefaultCacheBehavior,
        Enabled: Boolean,
        Origins: Origins,
        Aliases: js.UndefOr[Aliases] = js.undefined,
        CacheBehaviors: js.UndefOr[CacheBehaviors] = js.undefined,
        CustomErrorResponses: js.UndefOr[CustomErrorResponses] = js.undefined,
        DefaultRootObject: js.UndefOr[String] = js.undefined,
        HttpVersion: js.UndefOr[HttpVersion] = js.undefined,
        IsIPV6Enabled: js.UndefOr[Boolean] = js.undefined,
        Logging: js.UndefOr[LoggingConfig] = js.undefined,
        OriginGroups: js.UndefOr[OriginGroups] = js.undefined,
        PriceClass: js.UndefOr[PriceClass] = js.undefined,
        Restrictions: js.UndefOr[Restrictions] = js.undefined,
        ViewerCertificate: js.UndefOr[ViewerCertificate] = js.undefined,
        WebACLId: js.UndefOr[String] = js.undefined
    ): DistributionConfig = {
      val __obj = js.Dictionary[js.Any](
        "CallerReference"      -> CallerReference.asInstanceOf[js.Any],
        "Comment"              -> Comment.asInstanceOf[js.Any],
        "DefaultCacheBehavior" -> DefaultCacheBehavior.asInstanceOf[js.Any],
        "Enabled"              -> Enabled.asInstanceOf[js.Any],
        "Origins"              -> Origins.asInstanceOf[js.Any]
      )

      Aliases.foreach(__v => __obj.update("Aliases", __v.asInstanceOf[js.Any]))
      CacheBehaviors.foreach(__v => __obj.update("CacheBehaviors", __v.asInstanceOf[js.Any]))
      CustomErrorResponses.foreach(__v => __obj.update("CustomErrorResponses", __v.asInstanceOf[js.Any]))
      DefaultRootObject.foreach(__v => __obj.update("DefaultRootObject", __v.asInstanceOf[js.Any]))
      HttpVersion.foreach(__v => __obj.update("HttpVersion", __v.asInstanceOf[js.Any]))
      IsIPV6Enabled.foreach(__v => __obj.update("IsIPV6Enabled", __v.asInstanceOf[js.Any]))
      Logging.foreach(__v => __obj.update("Logging", __v.asInstanceOf[js.Any]))
      OriginGroups.foreach(__v => __obj.update("OriginGroups", __v.asInstanceOf[js.Any]))
      PriceClass.foreach(__v => __obj.update("PriceClass", __v.asInstanceOf[js.Any]))
      Restrictions.foreach(__v => __obj.update("Restrictions", __v.asInstanceOf[js.Any]))
      ViewerCertificate.foreach(__v => __obj.update("ViewerCertificate", __v.asInstanceOf[js.Any]))
      WebACLId.foreach(__v => __obj.update("WebACLId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DistributionConfig]
    }
  }

  /**
    * A distribution Configuration and a list of tags to be associated with the distribution.
    */
  @js.native
  trait DistributionConfigWithTags extends js.Object {
    var DistributionConfig: DistributionConfig
    var Tags: Tags
  }

  object DistributionConfigWithTags {
    def apply(
        DistributionConfig: DistributionConfig,
        Tags: Tags
    ): DistributionConfigWithTags = {
      val __obj = js.Dictionary[js.Any](
        "DistributionConfig" -> DistributionConfig.asInstanceOf[js.Any],
        "Tags"               -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DistributionConfigWithTags]
    }
  }

  /**
    * A distribution list.
    */
  @js.native
  trait DistributionList extends js.Object {
    var IsTruncated: Boolean
    var Marker: String
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[DistributionSummaryList]
    var NextMarker: js.UndefOr[String]
  }

  object DistributionList {
    def apply(
        IsTruncated: Boolean,
        Marker: String,
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[DistributionSummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): DistributionList = {
      val __obj = js.Dictionary[js.Any](
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker"      -> Marker.asInstanceOf[js.Any],
        "MaxItems"    -> MaxItems.asInstanceOf[js.Any],
        "Quantity"    -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DistributionList]
    }
  }

  /**
    * A summary of the information about a CloudFront distribution.
    */
  @js.native
  trait DistributionSummary extends js.Object {
    var ARN: String
    var Aliases: Aliases
    var CacheBehaviors: CacheBehaviors
    var Comment: String
    var CustomErrorResponses: CustomErrorResponses
    var DefaultCacheBehavior: DefaultCacheBehavior
    var DomainName: String
    var Enabled: Boolean
    var HttpVersion: HttpVersion
    var Id: String
    var IsIPV6Enabled: Boolean
    var LastModifiedTime: timestamp
    var Origins: Origins
    var PriceClass: PriceClass
    var Restrictions: Restrictions
    var Status: String
    var ViewerCertificate: ViewerCertificate
    var WebACLId: String
    var AliasICPRecordals: js.UndefOr[AliasICPRecordals]
    var OriginGroups: js.UndefOr[OriginGroups]
  }

  object DistributionSummary {
    def apply(
        ARN: String,
        Aliases: Aliases,
        CacheBehaviors: CacheBehaviors,
        Comment: String,
        CustomErrorResponses: CustomErrorResponses,
        DefaultCacheBehavior: DefaultCacheBehavior,
        DomainName: String,
        Enabled: Boolean,
        HttpVersion: HttpVersion,
        Id: String,
        IsIPV6Enabled: Boolean,
        LastModifiedTime: timestamp,
        Origins: Origins,
        PriceClass: PriceClass,
        Restrictions: Restrictions,
        Status: String,
        ViewerCertificate: ViewerCertificate,
        WebACLId: String,
        AliasICPRecordals: js.UndefOr[AliasICPRecordals] = js.undefined,
        OriginGroups: js.UndefOr[OriginGroups] = js.undefined
    ): DistributionSummary = {
      val __obj = js.Dictionary[js.Any](
        "ARN"                  -> ARN.asInstanceOf[js.Any],
        "Aliases"              -> Aliases.asInstanceOf[js.Any],
        "CacheBehaviors"       -> CacheBehaviors.asInstanceOf[js.Any],
        "Comment"              -> Comment.asInstanceOf[js.Any],
        "CustomErrorResponses" -> CustomErrorResponses.asInstanceOf[js.Any],
        "DefaultCacheBehavior" -> DefaultCacheBehavior.asInstanceOf[js.Any],
        "DomainName"           -> DomainName.asInstanceOf[js.Any],
        "Enabled"              -> Enabled.asInstanceOf[js.Any],
        "HttpVersion"          -> HttpVersion.asInstanceOf[js.Any],
        "Id"                   -> Id.asInstanceOf[js.Any],
        "IsIPV6Enabled"        -> IsIPV6Enabled.asInstanceOf[js.Any],
        "LastModifiedTime"     -> LastModifiedTime.asInstanceOf[js.Any],
        "Origins"              -> Origins.asInstanceOf[js.Any],
        "PriceClass"           -> PriceClass.asInstanceOf[js.Any],
        "Restrictions"         -> Restrictions.asInstanceOf[js.Any],
        "Status"               -> Status.asInstanceOf[js.Any],
        "ViewerCertificate"    -> ViewerCertificate.asInstanceOf[js.Any],
        "WebACLId"             -> WebACLId.asInstanceOf[js.Any]
      )

      AliasICPRecordals.foreach(__v => __obj.update("AliasICPRecordals", __v.asInstanceOf[js.Any]))
      OriginGroups.foreach(__v => __obj.update("OriginGroups", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DistributionSummary]
    }
  }

  /**
    * Complex data type for field-level encryption profiles that includes all of the encryption entities.
    */
  @js.native
  trait EncryptionEntities extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[EncryptionEntityList]
  }

  object EncryptionEntities {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[EncryptionEntityList] = js.undefined
    ): EncryptionEntities = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionEntities]
    }
  }

  /**
    * Complex data type for field-level encryption profiles that includes the encryption key and field pattern specifications.
    */
  @js.native
  trait EncryptionEntity extends js.Object {
    var FieldPatterns: FieldPatterns
    var ProviderId: String
    var PublicKeyId: String
  }

  object EncryptionEntity {
    def apply(
        FieldPatterns: FieldPatterns,
        ProviderId: String,
        PublicKeyId: String
    ): EncryptionEntity = {
      val __obj = js.Dictionary[js.Any](
        "FieldPatterns" -> FieldPatterns.asInstanceOf[js.Any],
        "ProviderId"    -> ProviderId.asInstanceOf[js.Any],
        "PublicKeyId"   -> PublicKeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EncryptionEntity]
    }
  }

  object EventTypeEnum {
    val `viewer-request`  = "viewer-request"
    val `viewer-response` = "viewer-response"
    val `origin-request`  = "origin-request"
    val `origin-response` = "origin-response"

    val values = js.Object.freeze(js.Array(`viewer-request`, `viewer-response`, `origin-request`, `origin-response`))
  }

  /**
    * A complex data type that includes the profile configurations and other options specified for field-level encryption.
    */
  @js.native
  trait FieldLevelEncryption extends js.Object {
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
    var Id: String
    var LastModifiedTime: timestamp
  }

  object FieldLevelEncryption {
    def apply(
        FieldLevelEncryptionConfig: FieldLevelEncryptionConfig,
        Id: String,
        LastModifiedTime: timestamp
    ): FieldLevelEncryption = {
      val __obj = js.Dictionary[js.Any](
        "FieldLevelEncryptionConfig" -> FieldLevelEncryptionConfig.asInstanceOf[js.Any],
        "Id"                         -> Id.asInstanceOf[js.Any],
        "LastModifiedTime"           -> LastModifiedTime.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FieldLevelEncryption]
    }
  }

  /**
    * A complex data type that includes the profile configurations specified for field-level encryption.
    */
  @js.native
  trait FieldLevelEncryptionConfig extends js.Object {
    var CallerReference: String
    var Comment: js.UndefOr[String]
    var ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig]
    var QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig]
  }

  object FieldLevelEncryptionConfig {
    def apply(
        CallerReference: String,
        Comment: js.UndefOr[String] = js.undefined,
        ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig] = js.undefined,
        QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig] = js.undefined
    ): FieldLevelEncryptionConfig = {
      val __obj = js.Dictionary[js.Any](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      ContentTypeProfileConfig.foreach(__v => __obj.update("ContentTypeProfileConfig", __v.asInstanceOf[js.Any]))
      QueryArgProfileConfig.foreach(__v => __obj.update("QueryArgProfileConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldLevelEncryptionConfig]
    }
  }

  /**
    * List of field-level encrpytion configurations.
    */
  @js.native
  trait FieldLevelEncryptionList extends js.Object {
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[FieldLevelEncryptionSummaryList]
    var NextMarker: js.UndefOr[String]
  }

  object FieldLevelEncryptionList {
    def apply(
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[FieldLevelEncryptionSummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): FieldLevelEncryptionList = {
      val __obj = js.Dictionary[js.Any](
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldLevelEncryptionList]
    }
  }

  /**
    * A complex data type for field-level encryption profiles.
    */
  @js.native
  trait FieldLevelEncryptionProfile extends js.Object {
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
    var Id: String
    var LastModifiedTime: timestamp
  }

  object FieldLevelEncryptionProfile {
    def apply(
        FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig,
        Id: String,
        LastModifiedTime: timestamp
    ): FieldLevelEncryptionProfile = {
      val __obj = js.Dictionary[js.Any](
        "FieldLevelEncryptionProfileConfig" -> FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any],
        "Id"                                -> Id.asInstanceOf[js.Any],
        "LastModifiedTime"                  -> LastModifiedTime.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FieldLevelEncryptionProfile]
    }
  }

  /**
    * A complex data type of profiles for the field-level encryption.
    */
  @js.native
  trait FieldLevelEncryptionProfileConfig extends js.Object {
    var CallerReference: String
    var EncryptionEntities: EncryptionEntities
    var Name: String
    var Comment: js.UndefOr[String]
  }

  object FieldLevelEncryptionProfileConfig {
    def apply(
        CallerReference: String,
        EncryptionEntities: EncryptionEntities,
        Name: String,
        Comment: js.UndefOr[String] = js.undefined
    ): FieldLevelEncryptionProfileConfig = {
      val __obj = js.Dictionary[js.Any](
        "CallerReference"    -> CallerReference.asInstanceOf[js.Any],
        "EncryptionEntities" -> EncryptionEntities.asInstanceOf[js.Any],
        "Name"               -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldLevelEncryptionProfileConfig]
    }
  }

  /**
    * List of field-level encryption profiles.
    */
  @js.native
  trait FieldLevelEncryptionProfileList extends js.Object {
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[FieldLevelEncryptionProfileSummaryList]
    var NextMarker: js.UndefOr[String]
  }

  object FieldLevelEncryptionProfileList {
    def apply(
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[FieldLevelEncryptionProfileSummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): FieldLevelEncryptionProfileList = {
      val __obj = js.Dictionary[js.Any](
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldLevelEncryptionProfileList]
    }
  }

  /**
    * The field-level encryption profile summary.
    */
  @js.native
  trait FieldLevelEncryptionProfileSummary extends js.Object {
    var EncryptionEntities: EncryptionEntities
    var Id: String
    var LastModifiedTime: timestamp
    var Name: String
    var Comment: js.UndefOr[String]
  }

  object FieldLevelEncryptionProfileSummary {
    def apply(
        EncryptionEntities: EncryptionEntities,
        Id: String,
        LastModifiedTime: timestamp,
        Name: String,
        Comment: js.UndefOr[String] = js.undefined
    ): FieldLevelEncryptionProfileSummary = {
      val __obj = js.Dictionary[js.Any](
        "EncryptionEntities" -> EncryptionEntities.asInstanceOf[js.Any],
        "Id"                 -> Id.asInstanceOf[js.Any],
        "LastModifiedTime"   -> LastModifiedTime.asInstanceOf[js.Any],
        "Name"               -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldLevelEncryptionProfileSummary]
    }
  }

  /**
    * A summary of a field-level encryption item.
    */
  @js.native
  trait FieldLevelEncryptionSummary extends js.Object {
    var Id: String
    var LastModifiedTime: timestamp
    var Comment: js.UndefOr[String]
    var ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig]
    var QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig]
  }

  object FieldLevelEncryptionSummary {
    def apply(
        Id: String,
        LastModifiedTime: timestamp,
        Comment: js.UndefOr[String] = js.undefined,
        ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig] = js.undefined,
        QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig] = js.undefined
    ): FieldLevelEncryptionSummary = {
      val __obj = js.Dictionary[js.Any](
        "Id"               -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      ContentTypeProfileConfig.foreach(__v => __obj.update("ContentTypeProfileConfig", __v.asInstanceOf[js.Any]))
      QueryArgProfileConfig.foreach(__v => __obj.update("QueryArgProfileConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldLevelEncryptionSummary]
    }
  }

  /**
    * A complex data type that includes the field patterns to match for field-level encryption.
    */
  @js.native
  trait FieldPatterns extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[FieldPatternList]
  }

  object FieldPatterns {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[FieldPatternList] = js.undefined
    ): FieldPatterns = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldPatterns]
    }
  }

  object FormatEnum {
    val URLEncoded = "URLEncoded"

    val values = js.Object.freeze(js.Array(URLEncoded))
  }

  /**
    * A complex type that specifies how CloudFront handles query strings and cookies.
    */
  @js.native
  trait ForwardedValues extends js.Object {
    var Cookies: CookiePreference
    var QueryString: Boolean
    var Headers: js.UndefOr[Headers]
    var QueryStringCacheKeys: js.UndefOr[QueryStringCacheKeys]
  }

  object ForwardedValues {
    def apply(
        Cookies: CookiePreference,
        QueryString: Boolean,
        Headers: js.UndefOr[Headers] = js.undefined,
        QueryStringCacheKeys: js.UndefOr[QueryStringCacheKeys] = js.undefined
    ): ForwardedValues = {
      val __obj = js.Dictionary[js.Any](
        "Cookies"     -> Cookies.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      Headers.foreach(__v => __obj.update("Headers", __v.asInstanceOf[js.Any]))
      QueryStringCacheKeys.foreach(__v => __obj.update("QueryStringCacheKeys", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForwardedValues]
    }
  }

  /**
    * A complex type that controls the countries in which your content is distributed. CloudFront determines the location of your users using <code>MaxMind</code> GeoIP databases.
    */
  @js.native
  trait GeoRestriction extends js.Object {
    var Quantity: Int
    var RestrictionType: GeoRestrictionType
    var Items: js.UndefOr[LocationList]
  }

  object GeoRestriction {
    def apply(
        Quantity: Int,
        RestrictionType: GeoRestrictionType,
        Items: js.UndefOr[LocationList] = js.undefined
    ): GeoRestriction = {
      val __obj = js.Dictionary[js.Any](
        "Quantity"        -> Quantity.asInstanceOf[js.Any],
        "RestrictionType" -> RestrictionType.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeoRestriction]
    }
  }

  object GeoRestrictionTypeEnum {
    val blacklist = "blacklist"
    val whitelist = "whitelist"
    val none      = "none"

    val values = js.Object.freeze(js.Array(blacklist, whitelist, none))
  }

  /**
    * The origin access identity's configuration information. For more information, see [[https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CloudFrontOriginAccessIdentityConfig.html|CloudFrontOriginAccessIdentityConfig]].
    */
  @js.native
  trait GetCloudFrontOriginAccessIdentityConfigRequest extends js.Object {
    var Id: String
  }

  object GetCloudFrontOriginAccessIdentityConfigRequest {
    def apply(
        Id: String
    ): GetCloudFrontOriginAccessIdentityConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityConfigRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait GetCloudFrontOriginAccessIdentityConfigResult extends js.Object {
    var CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig]
    var ETag: js.UndefOr[String]
  }

  object GetCloudFrontOriginAccessIdentityConfigResult {
    def apply(
        CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): GetCloudFrontOriginAccessIdentityConfigResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudFrontOriginAccessIdentityConfig.foreach(
        __v => __obj.update("CloudFrontOriginAccessIdentityConfig", __v.asInstanceOf[js.Any])
      )
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityConfigResult]
    }
  }

  /**
    * The request to get an origin access identity's information.
    */
  @js.native
  trait GetCloudFrontOriginAccessIdentityRequest extends js.Object {
    var Id: String
  }

  object GetCloudFrontOriginAccessIdentityRequest {
    def apply(
        Id: String
    ): GetCloudFrontOriginAccessIdentityRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait GetCloudFrontOriginAccessIdentityResult extends js.Object {
    var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity]
    var ETag: js.UndefOr[String]
  }

  object GetCloudFrontOriginAccessIdentityResult {
    def apply(
        CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): GetCloudFrontOriginAccessIdentityResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudFrontOriginAccessIdentity.foreach(
        __v => __obj.update("CloudFrontOriginAccessIdentity", __v.asInstanceOf[js.Any])
      )
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityResult]
    }
  }

  /**
    * The request to get a distribution configuration.
    */
  @js.native
  trait GetDistributionConfigRequest extends js.Object {
    var Id: String
  }

  object GetDistributionConfigRequest {
    def apply(
        Id: String
    ): GetDistributionConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDistributionConfigRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait GetDistributionConfigResult extends js.Object {
    var DistributionConfig: js.UndefOr[DistributionConfig]
    var ETag: js.UndefOr[String]
  }

  object GetDistributionConfigResult {
    def apply(
        DistributionConfig: js.UndefOr[DistributionConfig] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): GetDistributionConfigResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DistributionConfig.foreach(__v => __obj.update("DistributionConfig", __v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDistributionConfigResult]
    }
  }

  /**
    * The request to get a distribution's information.
    */
  @js.native
  trait GetDistributionRequest extends js.Object {
    var Id: String
  }

  object GetDistributionRequest {
    def apply(
        Id: String
    ): GetDistributionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDistributionRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait GetDistributionResult extends js.Object {
    var Distribution: js.UndefOr[Distribution]
    var ETag: js.UndefOr[String]
  }

  object GetDistributionResult {
    def apply(
        Distribution: js.UndefOr[Distribution] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): GetDistributionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Distribution.foreach(__v => __obj.update("Distribution", __v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDistributionResult]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionConfigRequest extends js.Object {
    var Id: String
  }

  object GetFieldLevelEncryptionConfigRequest {
    def apply(
        Id: String
    ): GetFieldLevelEncryptionConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFieldLevelEncryptionConfigRequest]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryptionConfig: js.UndefOr[FieldLevelEncryptionConfig]
  }

  object GetFieldLevelEncryptionConfigResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryptionConfig: js.UndefOr[FieldLevelEncryptionConfig] = js.undefined
    ): GetFieldLevelEncryptionConfigResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      FieldLevelEncryptionConfig.foreach(__v => __obj.update("FieldLevelEncryptionConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFieldLevelEncryptionConfigResult]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionProfileConfigRequest extends js.Object {
    var Id: String
  }

  object GetFieldLevelEncryptionProfileConfigRequest {
    def apply(
        Id: String
    ): GetFieldLevelEncryptionProfileConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFieldLevelEncryptionProfileConfigRequest]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionProfileConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryptionProfileConfig: js.UndefOr[FieldLevelEncryptionProfileConfig]
  }

  object GetFieldLevelEncryptionProfileConfigResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryptionProfileConfig: js.UndefOr[FieldLevelEncryptionProfileConfig] = js.undefined
    ): GetFieldLevelEncryptionProfileConfigResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      FieldLevelEncryptionProfileConfig.foreach(
        __v => __obj.update("FieldLevelEncryptionProfileConfig", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetFieldLevelEncryptionProfileConfigResult]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionProfileRequest extends js.Object {
    var Id: String
  }

  object GetFieldLevelEncryptionProfileRequest {
    def apply(
        Id: String
    ): GetFieldLevelEncryptionProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFieldLevelEncryptionProfileRequest]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionProfileResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile]
  }

  object GetFieldLevelEncryptionProfileResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined
    ): GetFieldLevelEncryptionProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      FieldLevelEncryptionProfile.foreach(__v => __obj.update("FieldLevelEncryptionProfile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFieldLevelEncryptionProfileResult]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionRequest extends js.Object {
    var Id: String
  }

  object GetFieldLevelEncryptionRequest {
    def apply(
        Id: String
    ): GetFieldLevelEncryptionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFieldLevelEncryptionRequest]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption]
  }

  object GetFieldLevelEncryptionResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined
    ): GetFieldLevelEncryptionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      FieldLevelEncryption.foreach(__v => __obj.update("FieldLevelEncryption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFieldLevelEncryptionResult]
    }
  }

  /**
    * The request to get an invalidation's information.
    */
  @js.native
  trait GetInvalidationRequest extends js.Object {
    var DistributionId: String
    var Id: String
  }

  object GetInvalidationRequest {
    def apply(
        DistributionId: String,
        Id: String
    ): GetInvalidationRequest = {
      val __obj = js.Dictionary[js.Any](
        "DistributionId" -> DistributionId.asInstanceOf[js.Any],
        "Id"             -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInvalidationRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait GetInvalidationResult extends js.Object {
    var Invalidation: js.UndefOr[Invalidation]
  }

  object GetInvalidationResult {
    def apply(
        Invalidation: js.UndefOr[Invalidation] = js.undefined
    ): GetInvalidationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Invalidation.foreach(__v => __obj.update("Invalidation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInvalidationResult]
    }
  }

  @js.native
  trait GetPublicKeyConfigRequest extends js.Object {
    var Id: String
  }

  object GetPublicKeyConfigRequest {
    def apply(
        Id: String
    ): GetPublicKeyConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPublicKeyConfigRequest]
    }
  }

  @js.native
  trait GetPublicKeyConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var PublicKeyConfig: js.UndefOr[PublicKeyConfig]
  }

  object GetPublicKeyConfigResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        PublicKeyConfig: js.UndefOr[PublicKeyConfig] = js.undefined
    ): GetPublicKeyConfigResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      PublicKeyConfig.foreach(__v => __obj.update("PublicKeyConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPublicKeyConfigResult]
    }
  }

  @js.native
  trait GetPublicKeyRequest extends js.Object {
    var Id: String
  }

  object GetPublicKeyRequest {
    def apply(
        Id: String
    ): GetPublicKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPublicKeyRequest]
    }
  }

  @js.native
  trait GetPublicKeyResult extends js.Object {
    var ETag: js.UndefOr[String]
    var PublicKey: js.UndefOr[PublicKey]
  }

  object GetPublicKeyResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        PublicKey: js.UndefOr[PublicKey] = js.undefined
    ): GetPublicKeyResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.update("PublicKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPublicKeyResult]
    }
  }

  /**
    * To request to get a streaming distribution configuration.
    */
  @js.native
  trait GetStreamingDistributionConfigRequest extends js.Object {
    var Id: String
  }

  object GetStreamingDistributionConfigRequest {
    def apply(
        Id: String
    ): GetStreamingDistributionConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetStreamingDistributionConfigRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait GetStreamingDistributionConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig]
  }

  object GetStreamingDistributionConfigResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig] = js.undefined
    ): GetStreamingDistributionConfigResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      StreamingDistributionConfig.foreach(__v => __obj.update("StreamingDistributionConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStreamingDistributionConfigResult]
    }
  }

  /**
    * The request to get a streaming distribution's information.
    */
  @js.native
  trait GetStreamingDistributionRequest extends js.Object {
    var Id: String
  }

  object GetStreamingDistributionRequest {
    def apply(
        Id: String
    ): GetStreamingDistributionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetStreamingDistributionRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait GetStreamingDistributionResult extends js.Object {
    var ETag: js.UndefOr[String]
    var StreamingDistribution: js.UndefOr[StreamingDistribution]
  }

  object GetStreamingDistributionResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
    ): GetStreamingDistributionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      StreamingDistribution.foreach(__v => __obj.update("StreamingDistribution", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStreamingDistributionResult]
    }
  }

  /**
    * A complex type that specifies the request headers, if any, that you want CloudFront to base caching on for this cache behavior.
    *  For the headers that you specify, CloudFront caches separate versions of a specified object based on the header values in viewer requests. For example, suppose viewer requests for <code>logo.jpg</code> contain a custom <code>product</code> header that has a value of either <code>acme</code> or <code>apex</code>, and you configure CloudFront to cache your content based on values in the <code>product</code> header. CloudFront forwards the <code>product</code> header to the origin and caches the response from the origin once for each header value. For more information about caching based on header values, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html|How CloudFront Forwards and Caches Headers]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait Headers extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[HeaderList]
  }

  object Headers {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[HeaderList] = js.undefined
    ): Headers = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Headers]
    }
  }

  object HttpVersionEnum {
    val `http1.1` = "http1.1"
    val http2     = "http2"

    val values = js.Object.freeze(js.Array(`http1.1`, http2))
  }

  object ICPRecordalStatusEnum {
    val APPROVED  = "APPROVED"
    val SUSPENDED = "SUSPENDED"
    val PENDING   = "PENDING"

    val values = js.Object.freeze(js.Array(APPROVED, SUSPENDED, PENDING))
  }

  /**
    * An invalidation.
    */
  @js.native
  trait Invalidation extends js.Object {
    var CreateTime: timestamp
    var Id: String
    var InvalidationBatch: InvalidationBatch
    var Status: String
  }

  object Invalidation {
    def apply(
        CreateTime: timestamp,
        Id: String,
        InvalidationBatch: InvalidationBatch,
        Status: String
    ): Invalidation = {
      val __obj = js.Dictionary[js.Any](
        "CreateTime"        -> CreateTime.asInstanceOf[js.Any],
        "Id"                -> Id.asInstanceOf[js.Any],
        "InvalidationBatch" -> InvalidationBatch.asInstanceOf[js.Any],
        "Status"            -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Invalidation]
    }
  }

  /**
    * An invalidation batch.
    */
  @js.native
  trait InvalidationBatch extends js.Object {
    var CallerReference: String
    var Paths: Paths
  }

  object InvalidationBatch {
    def apply(
        CallerReference: String,
        Paths: Paths
    ): InvalidationBatch = {
      val __obj = js.Dictionary[js.Any](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Paths"           -> Paths.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InvalidationBatch]
    }
  }

  /**
    * The <code>InvalidationList</code> complex type describes the list of invalidation objects. For more information about invalidation, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html|Invalidating Objects (Web Distributions Only)]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait InvalidationList extends js.Object {
    var IsTruncated: Boolean
    var Marker: String
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[InvalidationSummaryList]
    var NextMarker: js.UndefOr[String]
  }

  object InvalidationList {
    def apply(
        IsTruncated: Boolean,
        Marker: String,
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[InvalidationSummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): InvalidationList = {
      val __obj = js.Dictionary[js.Any](
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker"      -> Marker.asInstanceOf[js.Any],
        "MaxItems"    -> MaxItems.asInstanceOf[js.Any],
        "Quantity"    -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InvalidationList]
    }
  }

  /**
    * A summary of an invalidation request.
    */
  @js.native
  trait InvalidationSummary extends js.Object {
    var CreateTime: timestamp
    var Id: String
    var Status: String
  }

  object InvalidationSummary {
    def apply(
        CreateTime: timestamp,
        Id: String,
        Status: String
    ): InvalidationSummary = {
      val __obj = js.Dictionary[js.Any](
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "Id"         -> Id.asInstanceOf[js.Any],
        "Status"     -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InvalidationSummary]
    }
  }

  object ItemSelectionEnum {
    val none      = "none"
    val whitelist = "whitelist"
    val all       = "all"

    val values = js.Object.freeze(js.Array(none, whitelist, all))
  }

  /**
    * A complex type that lists the active CloudFront key pairs, if any, that are associated with <code>AwsAccountNumber</code>.
    *  For more information, see [[https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ActiveTrustedSigners.html|ActiveTrustedSigners]].
    */
  @js.native
  trait KeyPairIds extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[KeyPairIdList]
  }

  object KeyPairIds {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[KeyPairIdList] = js.undefined
    ): KeyPairIds = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyPairIds]
    }
  }

  /**
    * A complex type that contains a Lambda function association.
    */
  @js.native
  trait LambdaFunctionAssociation extends js.Object {
    var EventType: EventType
    var LambdaFunctionARN: LambdaFunctionARN
    var IncludeBody: js.UndefOr[Boolean]
  }

  object LambdaFunctionAssociation {
    def apply(
        EventType: EventType,
        LambdaFunctionARN: LambdaFunctionARN,
        IncludeBody: js.UndefOr[Boolean] = js.undefined
    ): LambdaFunctionAssociation = {
      val __obj = js.Dictionary[js.Any](
        "EventType"         -> EventType.asInstanceOf[js.Any],
        "LambdaFunctionARN" -> LambdaFunctionARN.asInstanceOf[js.Any]
      )

      IncludeBody.foreach(__v => __obj.update("IncludeBody", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionAssociation]
    }
  }

  /**
    * A complex type that specifies a list of Lambda functions associations for a cache behavior.
    *  If you want to invoke one or more Lambda functions triggered by requests that match the <code>PathPattern</code> of the cache behavior, specify the applicable values for <code>Quantity</code> and <code>Items</code>. Note that there can be up to 4 <code>LambdaFunctionAssociation</code> items in this list (one for each possible value of <code>EventType</code>) and each <code>EventType</code> can be associated with the Lambda function only once.
    *  If you don't want to invoke any Lambda functions for the requests that match <code>PathPattern</code>, specify <code>0</code> for <code>Quantity</code> and omit <code>Items</code>.
    */
  @js.native
  trait LambdaFunctionAssociations extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[LambdaFunctionAssociationList]
  }

  object LambdaFunctionAssociations {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[LambdaFunctionAssociationList] = js.undefined
    ): LambdaFunctionAssociations = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionAssociations]
    }
  }

  /**
    * The request to list origin access identities.
    */
  @js.native
  trait ListCloudFrontOriginAccessIdentitiesRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListCloudFrontOriginAccessIdentitiesRequest {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListCloudFrontOriginAccessIdentitiesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCloudFrontOriginAccessIdentitiesRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait ListCloudFrontOriginAccessIdentitiesResult extends js.Object {
    var CloudFrontOriginAccessIdentityList: js.UndefOr[CloudFrontOriginAccessIdentityList]
  }

  object ListCloudFrontOriginAccessIdentitiesResult {
    def apply(
        CloudFrontOriginAccessIdentityList: js.UndefOr[CloudFrontOriginAccessIdentityList] = js.undefined
    ): ListCloudFrontOriginAccessIdentitiesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudFrontOriginAccessIdentityList.foreach(
        __v => __obj.update("CloudFrontOriginAccessIdentityList", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListCloudFrontOriginAccessIdentitiesResult]
    }
  }

  /**
    * The request to list distributions that are associated with a specified AWS WAF web ACL.
    */
  @js.native
  trait ListDistributionsByWebACLIdRequest extends js.Object {
    var WebACLId: String
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListDistributionsByWebACLIdRequest {
    def apply(
        WebACLId: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListDistributionsByWebACLIdRequest = {
      val __obj = js.Dictionary[js.Any](
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributionsByWebACLIdRequest]
    }
  }

  /**
    * The response to a request to list the distributions that are associated with a specified AWS WAF web ACL.
    */
  @js.native
  trait ListDistributionsByWebACLIdResult extends js.Object {
    var DistributionList: js.UndefOr[DistributionList]
  }

  object ListDistributionsByWebACLIdResult {
    def apply(
        DistributionList: js.UndefOr[DistributionList] = js.undefined
    ): ListDistributionsByWebACLIdResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DistributionList.foreach(__v => __obj.update("DistributionList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributionsByWebACLIdResult]
    }
  }

  /**
    * The request to list your distributions.
    */
  @js.native
  trait ListDistributionsRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListDistributionsRequest {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListDistributionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributionsRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait ListDistributionsResult extends js.Object {
    var DistributionList: js.UndefOr[DistributionList]
  }

  object ListDistributionsResult {
    def apply(
        DistributionList: js.UndefOr[DistributionList] = js.undefined
    ): ListDistributionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DistributionList.foreach(__v => __obj.update("DistributionList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributionsResult]
    }
  }

  @js.native
  trait ListFieldLevelEncryptionConfigsRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListFieldLevelEncryptionConfigsRequest {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListFieldLevelEncryptionConfigsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFieldLevelEncryptionConfigsRequest]
    }
  }

  @js.native
  trait ListFieldLevelEncryptionConfigsResult extends js.Object {
    var FieldLevelEncryptionList: js.UndefOr[FieldLevelEncryptionList]
  }

  object ListFieldLevelEncryptionConfigsResult {
    def apply(
        FieldLevelEncryptionList: js.UndefOr[FieldLevelEncryptionList] = js.undefined
    ): ListFieldLevelEncryptionConfigsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      FieldLevelEncryptionList.foreach(__v => __obj.update("FieldLevelEncryptionList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFieldLevelEncryptionConfigsResult]
    }
  }

  @js.native
  trait ListFieldLevelEncryptionProfilesRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListFieldLevelEncryptionProfilesRequest {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListFieldLevelEncryptionProfilesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFieldLevelEncryptionProfilesRequest]
    }
  }

  @js.native
  trait ListFieldLevelEncryptionProfilesResult extends js.Object {
    var FieldLevelEncryptionProfileList: js.UndefOr[FieldLevelEncryptionProfileList]
  }

  object ListFieldLevelEncryptionProfilesResult {
    def apply(
        FieldLevelEncryptionProfileList: js.UndefOr[FieldLevelEncryptionProfileList] = js.undefined
    ): ListFieldLevelEncryptionProfilesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      FieldLevelEncryptionProfileList.foreach(
        __v => __obj.update("FieldLevelEncryptionProfileList", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListFieldLevelEncryptionProfilesResult]
    }
  }

  /**
    * The request to list invalidations.
    */
  @js.native
  trait ListInvalidationsRequest extends js.Object {
    var DistributionId: String
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListInvalidationsRequest {
    def apply(
        DistributionId: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListInvalidationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DistributionId" -> DistributionId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvalidationsRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait ListInvalidationsResult extends js.Object {
    var InvalidationList: js.UndefOr[InvalidationList]
  }

  object ListInvalidationsResult {
    def apply(
        InvalidationList: js.UndefOr[InvalidationList] = js.undefined
    ): ListInvalidationsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      InvalidationList.foreach(__v => __obj.update("InvalidationList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvalidationsResult]
    }
  }

  @js.native
  trait ListPublicKeysRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListPublicKeysRequest {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListPublicKeysRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPublicKeysRequest]
    }
  }

  @js.native
  trait ListPublicKeysResult extends js.Object {
    var PublicKeyList: js.UndefOr[PublicKeyList]
  }

  object ListPublicKeysResult {
    def apply(
        PublicKeyList: js.UndefOr[PublicKeyList] = js.undefined
    ): ListPublicKeysResult = {
      val __obj = js.Dictionary.empty[js.Any]
      PublicKeyList.foreach(__v => __obj.update("PublicKeyList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPublicKeysResult]
    }
  }

  /**
    * The request to list your streaming distributions.
    */
  @js.native
  trait ListStreamingDistributionsRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListStreamingDistributionsRequest {
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListStreamingDistributionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamingDistributionsRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait ListStreamingDistributionsResult extends js.Object {
    var StreamingDistributionList: js.UndefOr[StreamingDistributionList]
  }

  object ListStreamingDistributionsResult {
    def apply(
        StreamingDistributionList: js.UndefOr[StreamingDistributionList] = js.undefined
    ): ListStreamingDistributionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      StreamingDistributionList.foreach(__v => __obj.update("StreamingDistributionList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamingDistributionsResult]
    }
  }

  /**
    * The request to list tags for a CloudFront resource.
    */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var Resource: ResourceARN
  }

  object ListTagsForResourceRequest {
    def apply(
        Resource: ResourceARN
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Resource" -> Resource.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var Tags: Tags
  }

  object ListTagsForResourceResult {
    def apply(
        Tags: Tags
    ): ListTagsForResourceResult = {
      val __obj = js.Dictionary[js.Any](
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceResult]
    }
  }

  /**
    * A complex type that controls whether access logs are written for the distribution.
    */
  @js.native
  trait LoggingConfig extends js.Object {
    var Bucket: String
    var Enabled: Boolean
    var IncludeCookies: Boolean
    var Prefix: String
  }

  object LoggingConfig {
    def apply(
        Bucket: String,
        Enabled: Boolean,
        IncludeCookies: Boolean,
        Prefix: String
    ): LoggingConfig = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"         -> Bucket.asInstanceOf[js.Any],
        "Enabled"        -> Enabled.asInstanceOf[js.Any],
        "IncludeCookies" -> IncludeCookies.asInstanceOf[js.Any],
        "Prefix"         -> Prefix.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LoggingConfig]
    }
  }

  object MethodEnum {
    val GET     = "GET"
    val HEAD    = "HEAD"
    val POST    = "POST"
    val PUT     = "PUT"
    val PATCH   = "PATCH"
    val OPTIONS = "OPTIONS"
    val DELETE  = "DELETE"

    val values = js.Object.freeze(js.Array(GET, HEAD, POST, PUT, PATCH, OPTIONS, DELETE))
  }

  object MinimumProtocolVersionEnum {
    val SSLv3          = "SSLv3"
    val TLSv1          = "TLSv1"
    val TLSv1_2016     = "TLSv1_2016"
    val `TLSv1.1_2016` = "TLSv1.1_2016"
    val `TLSv1.2_2018` = "TLSv1.2_2018"

    val values = js.Object.freeze(js.Array(SSLv3, TLSv1, TLSv1_2016, `TLSv1.1_2016`, `TLSv1.2_2018`))
  }

  /**
    * A complex type that describes the Amazon S3 bucket, HTTP server (for example, a web server), Amazon MediaStore, or other server from which CloudFront gets your files. This can also be an origin group, if you've created an origin group. You must specify at least one origin or origin group.
    *  For the current limit on the number of origins or origin groups that you can specify for a distribution, see [[https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront|Amazon CloudFront Limits]] in the <i>AWS General Reference</i>.
    */
  @js.native
  trait Origin extends js.Object {
    var DomainName: String
    var Id: String
    var CustomHeaders: js.UndefOr[CustomHeaders]
    var CustomOriginConfig: js.UndefOr[CustomOriginConfig]
    var OriginPath: js.UndefOr[String]
    var S3OriginConfig: js.UndefOr[S3OriginConfig]
  }

  object Origin {
    def apply(
        DomainName: String,
        Id: String,
        CustomHeaders: js.UndefOr[CustomHeaders] = js.undefined,
        CustomOriginConfig: js.UndefOr[CustomOriginConfig] = js.undefined,
        OriginPath: js.UndefOr[String] = js.undefined,
        S3OriginConfig: js.UndefOr[S3OriginConfig] = js.undefined
    ): Origin = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Id"         -> Id.asInstanceOf[js.Any]
      )

      CustomHeaders.foreach(__v => __obj.update("CustomHeaders", __v.asInstanceOf[js.Any]))
      CustomOriginConfig.foreach(__v => __obj.update("CustomOriginConfig", __v.asInstanceOf[js.Any]))
      OriginPath.foreach(__v => __obj.update("OriginPath", __v.asInstanceOf[js.Any]))
      S3OriginConfig.foreach(__v => __obj.update("S3OriginConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Origin]
    }
  }

  /**
    * A complex type that contains <code>HeaderName</code> and <code>HeaderValue</code> elements, if any, for this distribution.
    */
  @js.native
  trait OriginCustomHeader extends js.Object {
    var HeaderName: String
    var HeaderValue: String
  }

  object OriginCustomHeader {
    def apply(
        HeaderName: String,
        HeaderValue: String
    ): OriginCustomHeader = {
      val __obj = js.Dictionary[js.Any](
        "HeaderName"  -> HeaderName.asInstanceOf[js.Any],
        "HeaderValue" -> HeaderValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OriginCustomHeader]
    }
  }

  /**
    * An origin group includes two origins (a primary origin and a second origin to failover to) and a failover criteria that you specify. You create an origin group to support origin failover in CloudFront. When you create or update a distribution, you can specifiy the origin group instead of a single origin, and CloudFront will failover from the primary origin to the second origin under the failover conditions that you've chosen.
    */
  @js.native
  trait OriginGroup extends js.Object {
    var FailoverCriteria: OriginGroupFailoverCriteria
    var Id: String
    var Members: OriginGroupMembers
  }

  object OriginGroup {
    def apply(
        FailoverCriteria: OriginGroupFailoverCriteria,
        Id: String,
        Members: OriginGroupMembers
    ): OriginGroup = {
      val __obj = js.Dictionary[js.Any](
        "FailoverCriteria" -> FailoverCriteria.asInstanceOf[js.Any],
        "Id"               -> Id.asInstanceOf[js.Any],
        "Members"          -> Members.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OriginGroup]
    }
  }

  /**
    * A complex data type that includes information about the failover criteria for an origin group, including the status codes for which CloudFront will failover from the primary origin to the second origin.
    */
  @js.native
  trait OriginGroupFailoverCriteria extends js.Object {
    var StatusCodes: StatusCodes
  }

  object OriginGroupFailoverCriteria {
    def apply(
        StatusCodes: StatusCodes
    ): OriginGroupFailoverCriteria = {
      val __obj = js.Dictionary[js.Any](
        "StatusCodes" -> StatusCodes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OriginGroupFailoverCriteria]
    }
  }

  /**
    * An origin in an origin group.
    */
  @js.native
  trait OriginGroupMember extends js.Object {
    var OriginId: String
  }

  object OriginGroupMember {
    def apply(
        OriginId: String
    ): OriginGroupMember = {
      val __obj = js.Dictionary[js.Any](
        "OriginId" -> OriginId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OriginGroupMember]
    }
  }

  /**
    * A complex data type for the origins included in an origin group.
    */
  @js.native
  trait OriginGroupMembers extends js.Object {
    var Items: OriginGroupMemberList
    var Quantity: Int
  }

  object OriginGroupMembers {
    def apply(
        Items: OriginGroupMemberList,
        Quantity: Int
    ): OriginGroupMembers = {
      val __obj = js.Dictionary[js.Any](
        "Items"    -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OriginGroupMembers]
    }
  }

  /**
    * A complex data type for the origin groups specified for a distribution.
    */
  @js.native
  trait OriginGroups extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[OriginGroupList]
  }

  object OriginGroups {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[OriginGroupList] = js.undefined
    ): OriginGroups = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OriginGroups]
    }
  }

  object OriginProtocolPolicyEnum {
    val `http-only`    = "http-only"
    val `match-viewer` = "match-viewer"
    val `https-only`   = "https-only"

    val values = js.Object.freeze(js.Array(`http-only`, `match-viewer`, `https-only`))
  }

  /**
    * A complex type that contains information about the SSL/TLS protocols that CloudFront can use when establishing an HTTPS connection with your origin.
    */
  @js.native
  trait OriginSslProtocols extends js.Object {
    var Items: SslProtocolsList
    var Quantity: Int
  }

  object OriginSslProtocols {
    def apply(
        Items: SslProtocolsList,
        Quantity: Int
    ): OriginSslProtocols = {
      val __obj = js.Dictionary[js.Any](
        "Items"    -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OriginSslProtocols]
    }
  }

  /**
    * A complex type that contains information about origins and origin groups for this distribution.
    */
  @js.native
  trait Origins extends js.Object {
    var Items: OriginList
    var Quantity: Int
  }

  object Origins {
    def apply(
        Items: OriginList,
        Quantity: Int
    ): Origins = {
      val __obj = js.Dictionary[js.Any](
        "Items"    -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Origins]
    }
  }

  /**
    * A complex type that contains information about the objects that you want to invalidate. For more information, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html#invalidation-specifying-objects|Specifying the Objects to Invalidate]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait Paths extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[PathList]
  }

  object Paths {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[PathList] = js.undefined
    ): Paths = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Paths]
    }
  }

  object PriceClassEnum {
    val PriceClass_100 = "PriceClass_100"
    val PriceClass_200 = "PriceClass_200"
    val PriceClass_All = "PriceClass_All"

    val values = js.Object.freeze(js.Array(PriceClass_100, PriceClass_200, PriceClass_All))
  }

  /**
    * A complex data type of public keys you add to CloudFront to use with features like field-level encryption.
    */
  @js.native
  trait PublicKey extends js.Object {
    var CreatedTime: timestamp
    var Id: String
    var PublicKeyConfig: PublicKeyConfig
  }

  object PublicKey {
    def apply(
        CreatedTime: timestamp,
        Id: String,
        PublicKeyConfig: PublicKeyConfig
    ): PublicKey = {
      val __obj = js.Dictionary[js.Any](
        "CreatedTime"     -> CreatedTime.asInstanceOf[js.Any],
        "Id"              -> Id.asInstanceOf[js.Any],
        "PublicKeyConfig" -> PublicKeyConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PublicKey]
    }
  }

  /**
    * Information about a public key you add to CloudFront to use with features like field-level encryption.
    */
  @js.native
  trait PublicKeyConfig extends js.Object {
    var CallerReference: String
    var EncodedKey: String
    var Name: String
    var Comment: js.UndefOr[String]
  }

  object PublicKeyConfig {
    def apply(
        CallerReference: String,
        EncodedKey: String,
        Name: String,
        Comment: js.UndefOr[String] = js.undefined
    ): PublicKeyConfig = {
      val __obj = js.Dictionary[js.Any](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "EncodedKey"      -> EncodedKey.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicKeyConfig]
    }
  }

  /**
    * A list of public keys you've added to CloudFront to use with features like field-level encryption.
    */
  @js.native
  trait PublicKeyList extends js.Object {
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[PublicKeySummaryList]
    var NextMarker: js.UndefOr[String]
  }

  object PublicKeyList {
    def apply(
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[PublicKeySummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): PublicKeyList = {
      val __obj = js.Dictionary[js.Any](
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicKeyList]
    }
  }

  /**
    * A complex data type for public key information.
    */
  @js.native
  trait PublicKeySummary extends js.Object {
    var CreatedTime: timestamp
    var EncodedKey: String
    var Id: String
    var Name: String
    var Comment: js.UndefOr[String]
  }

  object PublicKeySummary {
    def apply(
        CreatedTime: timestamp,
        EncodedKey: String,
        Id: String,
        Name: String,
        Comment: js.UndefOr[String] = js.undefined
    ): PublicKeySummary = {
      val __obj = js.Dictionary[js.Any](
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "EncodedKey"  -> EncodedKey.asInstanceOf[js.Any],
        "Id"          -> Id.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicKeySummary]
    }
  }

  /**
    * Query argument-profile mapping for field-level encryption.
    */
  @js.native
  trait QueryArgProfile extends js.Object {
    var ProfileId: String
    var QueryArg: String
  }

  object QueryArgProfile {
    def apply(
        ProfileId: String,
        QueryArg: String
    ): QueryArgProfile = {
      val __obj = js.Dictionary[js.Any](
        "ProfileId" -> ProfileId.asInstanceOf[js.Any],
        "QueryArg"  -> QueryArg.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[QueryArgProfile]
    }
  }

  /**
    * Configuration for query argument-profile mapping for field-level encryption.
    */
  @js.native
  trait QueryArgProfileConfig extends js.Object {
    var ForwardWhenQueryArgProfileIsUnknown: Boolean
    var QueryArgProfiles: js.UndefOr[QueryArgProfiles]
  }

  object QueryArgProfileConfig {
    def apply(
        ForwardWhenQueryArgProfileIsUnknown: Boolean,
        QueryArgProfiles: js.UndefOr[QueryArgProfiles] = js.undefined
    ): QueryArgProfileConfig = {
      val __obj = js.Dictionary[js.Any](
        "ForwardWhenQueryArgProfileIsUnknown" -> ForwardWhenQueryArgProfileIsUnknown.asInstanceOf[js.Any]
      )

      QueryArgProfiles.foreach(__v => __obj.update("QueryArgProfiles", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryArgProfileConfig]
    }
  }

  /**
    * Query argument-profile mapping for field-level encryption.
    */
  @js.native
  trait QueryArgProfiles extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[QueryArgProfileList]
  }

  object QueryArgProfiles {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[QueryArgProfileList] = js.undefined
    ): QueryArgProfiles = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryArgProfiles]
    }
  }

  /**
    * A complex type that contains information about the query string parameters that you want CloudFront to use for caching for a cache behavior.
    */
  @js.native
  trait QueryStringCacheKeys extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[QueryStringCacheKeysList]
  }

  object QueryStringCacheKeys {
    def apply(
        Quantity: Int,
        Items: js.UndefOr[QueryStringCacheKeysList] = js.undefined
    ): QueryStringCacheKeys = {
      val __obj = js.Dictionary[js.Any](
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryStringCacheKeys]
    }
  }

  /**
    * A complex type that identifies ways in which you want to restrict distribution of your content.
    */
  @js.native
  trait Restrictions extends js.Object {
    var GeoRestriction: GeoRestriction
  }

  object Restrictions {
    def apply(
        GeoRestriction: GeoRestriction
    ): Restrictions = {
      val __obj = js.Dictionary[js.Any](
        "GeoRestriction" -> GeoRestriction.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Restrictions]
    }
  }

  /**
    * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution.
    */
  @js.native
  trait S3Origin extends js.Object {
    var DomainName: String
    var OriginAccessIdentity: String
  }

  object S3Origin {
    def apply(
        DomainName: String,
        OriginAccessIdentity: String
    ): S3Origin = {
      val __obj = js.Dictionary[js.Any](
        "DomainName"           -> DomainName.asInstanceOf[js.Any],
        "OriginAccessIdentity" -> OriginAccessIdentity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[S3Origin]
    }
  }

  /**
    * A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use the <code>CustomOriginConfig</code> element instead.
    */
  @js.native
  trait S3OriginConfig extends js.Object {
    var OriginAccessIdentity: String
  }

  object S3OriginConfig {
    def apply(
        OriginAccessIdentity: String
    ): S3OriginConfig = {
      val __obj = js.Dictionary[js.Any](
        "OriginAccessIdentity" -> OriginAccessIdentity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[S3OriginConfig]
    }
  }

  object SSLSupportMethodEnum {
    val `sni-only` = "sni-only"
    val vip        = "vip"

    val values = js.Object.freeze(js.Array(`sni-only`, vip))
  }

  /**
    * A complex type that lists the AWS accounts that were included in the <code>TrustedSigners</code> complex type, as well as their active CloudFront key pair IDs, if any.
    */
  @js.native
  trait Signer extends js.Object {
    var AwsAccountNumber: js.UndefOr[String]
    var KeyPairIds: js.UndefOr[KeyPairIds]
  }

  object Signer {
    def apply(
        AwsAccountNumber: js.UndefOr[String] = js.undefined,
        KeyPairIds: js.UndefOr[KeyPairIds] = js.undefined
    ): Signer = {
      val __obj = js.Dictionary.empty[js.Any]
      AwsAccountNumber.foreach(__v => __obj.update("AwsAccountNumber", __v.asInstanceOf[js.Any]))
      KeyPairIds.foreach(__v => __obj.update("KeyPairIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Signer]
    }
  }

  object SslProtocolEnum {
    val SSLv3     = "SSLv3"
    val TLSv1     = "TLSv1"
    val `TLSv1.1` = "TLSv1.1"
    val `TLSv1.2` = "TLSv1.2"

    val values = js.Object.freeze(js.Array(SSLv3, TLSv1, `TLSv1.1`, `TLSv1.2`))
  }

  /**
    * A complex data type for the status codes that you specify that, when returned by a primary origin, trigger CloudFront to failover to a second origin.
    */
  @js.native
  trait StatusCodes extends js.Object {
    var Items: StatusCodeList
    var Quantity: Int
  }

  object StatusCodes {
    def apply(
        Items: StatusCodeList,
        Quantity: Int
    ): StatusCodes = {
      val __obj = js.Dictionary[js.Any](
        "Items"    -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StatusCodes]
    }
  }

  /**
    * A streaming distribution tells CloudFront where you want RTMP content to be delivered from, and the details about how to track and manage content delivery.
    */
  @js.native
  trait StreamingDistribution extends js.Object {
    var ARN: String
    var ActiveTrustedSigners: ActiveTrustedSigners
    var DomainName: String
    var Id: String
    var Status: String
    var StreamingDistributionConfig: StreamingDistributionConfig
    var LastModifiedTime: js.UndefOr[timestamp]
  }

  object StreamingDistribution {
    def apply(
        ARN: String,
        ActiveTrustedSigners: ActiveTrustedSigners,
        DomainName: String,
        Id: String,
        Status: String,
        StreamingDistributionConfig: StreamingDistributionConfig,
        LastModifiedTime: js.UndefOr[timestamp] = js.undefined
    ): StreamingDistribution = {
      val __obj = js.Dictionary[js.Any](
        "ARN"                         -> ARN.asInstanceOf[js.Any],
        "ActiveTrustedSigners"        -> ActiveTrustedSigners.asInstanceOf[js.Any],
        "DomainName"                  -> DomainName.asInstanceOf[js.Any],
        "Id"                          -> Id.asInstanceOf[js.Any],
        "Status"                      -> Status.asInstanceOf[js.Any],
        "StreamingDistributionConfig" -> StreamingDistributionConfig.asInstanceOf[js.Any]
      )

      LastModifiedTime.foreach(__v => __obj.update("LastModifiedTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamingDistribution]
    }
  }

  /**
    * The RTMP distribution's configuration information.
    */
  @js.native
  trait StreamingDistributionConfig extends js.Object {
    var CallerReference: String
    var Comment: String
    var Enabled: Boolean
    var S3Origin: S3Origin
    var TrustedSigners: TrustedSigners
    var Aliases: js.UndefOr[Aliases]
    var Logging: js.UndefOr[StreamingLoggingConfig]
    var PriceClass: js.UndefOr[PriceClass]
  }

  object StreamingDistributionConfig {
    def apply(
        CallerReference: String,
        Comment: String,
        Enabled: Boolean,
        S3Origin: S3Origin,
        TrustedSigners: TrustedSigners,
        Aliases: js.UndefOr[Aliases] = js.undefined,
        Logging: js.UndefOr[StreamingLoggingConfig] = js.undefined,
        PriceClass: js.UndefOr[PriceClass] = js.undefined
    ): StreamingDistributionConfig = {
      val __obj = js.Dictionary[js.Any](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Comment"         -> Comment.asInstanceOf[js.Any],
        "Enabled"         -> Enabled.asInstanceOf[js.Any],
        "S3Origin"        -> S3Origin.asInstanceOf[js.Any],
        "TrustedSigners"  -> TrustedSigners.asInstanceOf[js.Any]
      )

      Aliases.foreach(__v => __obj.update("Aliases", __v.asInstanceOf[js.Any]))
      Logging.foreach(__v => __obj.update("Logging", __v.asInstanceOf[js.Any]))
      PriceClass.foreach(__v => __obj.update("PriceClass", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamingDistributionConfig]
    }
  }

  /**
    * A streaming distribution Configuration and a list of tags to be associated with the streaming distribution.
    */
  @js.native
  trait StreamingDistributionConfigWithTags extends js.Object {
    var StreamingDistributionConfig: StreamingDistributionConfig
    var Tags: Tags
  }

  object StreamingDistributionConfigWithTags {
    def apply(
        StreamingDistributionConfig: StreamingDistributionConfig,
        Tags: Tags
    ): StreamingDistributionConfigWithTags = {
      val __obj = js.Dictionary[js.Any](
        "StreamingDistributionConfig" -> StreamingDistributionConfig.asInstanceOf[js.Any],
        "Tags"                        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StreamingDistributionConfigWithTags]
    }
  }

  /**
    * A streaming distribution list.
    */
  @js.native
  trait StreamingDistributionList extends js.Object {
    var IsTruncated: Boolean
    var Marker: String
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[StreamingDistributionSummaryList]
    var NextMarker: js.UndefOr[String]
  }

  object StreamingDistributionList {
    def apply(
        IsTruncated: Boolean,
        Marker: String,
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[StreamingDistributionSummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): StreamingDistributionList = {
      val __obj = js.Dictionary[js.Any](
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker"      -> Marker.asInstanceOf[js.Any],
        "MaxItems"    -> MaxItems.asInstanceOf[js.Any],
        "Quantity"    -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamingDistributionList]
    }
  }

  /**
    * A summary of the information for a CloudFront streaming distribution.
    */
  @js.native
  trait StreamingDistributionSummary extends js.Object {
    var ARN: String
    var Aliases: Aliases
    var Comment: String
    var DomainName: String
    var Enabled: Boolean
    var Id: String
    var LastModifiedTime: timestamp
    var PriceClass: PriceClass
    var S3Origin: S3Origin
    var Status: String
    var TrustedSigners: TrustedSigners
  }

  object StreamingDistributionSummary {
    def apply(
        ARN: String,
        Aliases: Aliases,
        Comment: String,
        DomainName: String,
        Enabled: Boolean,
        Id: String,
        LastModifiedTime: timestamp,
        PriceClass: PriceClass,
        S3Origin: S3Origin,
        Status: String,
        TrustedSigners: TrustedSigners
    ): StreamingDistributionSummary = {
      val __obj = js.Dictionary[js.Any](
        "ARN"              -> ARN.asInstanceOf[js.Any],
        "Aliases"          -> Aliases.asInstanceOf[js.Any],
        "Comment"          -> Comment.asInstanceOf[js.Any],
        "DomainName"       -> DomainName.asInstanceOf[js.Any],
        "Enabled"          -> Enabled.asInstanceOf[js.Any],
        "Id"               -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "PriceClass"       -> PriceClass.asInstanceOf[js.Any],
        "S3Origin"         -> S3Origin.asInstanceOf[js.Any],
        "Status"           -> Status.asInstanceOf[js.Any],
        "TrustedSigners"   -> TrustedSigners.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StreamingDistributionSummary]
    }
  }

  /**
    * A complex type that controls whether access logs are written for this streaming distribution.
    */
  @js.native
  trait StreamingLoggingConfig extends js.Object {
    var Bucket: String
    var Enabled: Boolean
    var Prefix: String
  }

  object StreamingLoggingConfig {
    def apply(
        Bucket: String,
        Enabled: Boolean,
        Prefix: String
    ): StreamingLoggingConfig = {
      val __obj = js.Dictionary[js.Any](
        "Bucket"  -> Bucket.asInstanceOf[js.Any],
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "Prefix"  -> Prefix.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StreamingLoggingConfig]
    }
  }

  /**
    * A complex type that contains <code>Tag</code> key and <code>Tag</code> value.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * A complex type that contains zero or more <code>Tag</code> elements.
    */
  @js.native
  trait TagKeys extends js.Object {
    var Items: js.UndefOr[TagKeyList]
  }

  object TagKeys {
    def apply(
        Items: js.UndefOr[TagKeyList] = js.undefined
    ): TagKeys = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagKeys]
    }
  }

  /**
    * The request to add tags to a CloudFront resource.
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var Resource: ResourceARN
    var Tags: Tags
  }

  object TagResourceRequest {
    def apply(
        Resource: ResourceARN,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Resource" -> Resource.asInstanceOf[js.Any],
        "Tags"     -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /**
    * A complex type that contains zero or more <code>Tag</code> elements.
    */
  @js.native
  trait Tags extends js.Object {
    var Items: js.UndefOr[TagList]
  }

  object Tags {
    def apply(
        Items: js.UndefOr[TagList] = js.undefined
    ): Tags = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tags]
    }
  }

  /**
    * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content.
    *  If you want to require signed URLs in requests for objects in the target origin that match the <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify the applicable values for <code>Quantity</code> and <code>Items</code>. For more information, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html|Serving Private Content through CloudFront]] in the <i> Amazon CloudFront Developer Guide</i>.
    *  If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>, specify <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>.
    *  To add, change, or remove one or more trusted signers, change <code>Enabled</code> to <code>true</code> (if it's currently <code>false</code>), change <code>Quantity</code> as applicable, and specify all of the trusted signers that you want to include in the updated distribution.
    *  For more information about updating the distribution configuration, see [[https://docs.aws.amazon.com/cloudfront/latest/APIReference/DistributionConfig.html|DistributionConfig]] in the <i>Amazon CloudFront API Reference</i>.
    */
  @js.native
  trait TrustedSigners extends js.Object {
    var Enabled: Boolean
    var Quantity: Int
    var Items: js.UndefOr[AwsAccountNumberList]
  }

  object TrustedSigners {
    def apply(
        Enabled: Boolean,
        Quantity: Int,
        Items: js.UndefOr[AwsAccountNumberList] = js.undefined
    ): TrustedSigners = {
      val __obj = js.Dictionary[js.Any](
        "Enabled"  -> Enabled.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrustedSigners]
    }
  }

  /**
    * The request to remove tags from a CloudFront resource.
    */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var Resource: ResourceARN
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    def apply(
        Resource: ResourceARN,
        TagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Resource" -> Resource.asInstanceOf[js.Any],
        "TagKeys"  -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /**
    * The request to update an origin access identity.
    */
  @js.native
  trait UpdateCloudFrontOriginAccessIdentityRequest extends js.Object {
    var CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object UpdateCloudFrontOriginAccessIdentityRequest {
    def apply(
        CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig,
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdateCloudFrontOriginAccessIdentityRequest = {
      val __obj = js.Dictionary[js.Any](
        "CloudFrontOriginAccessIdentityConfig" -> CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any],
        "Id"                                   -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCloudFrontOriginAccessIdentityRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait UpdateCloudFrontOriginAccessIdentityResult extends js.Object {
    var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity]
    var ETag: js.UndefOr[String]
  }

  object UpdateCloudFrontOriginAccessIdentityResult {
    def apply(
        CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): UpdateCloudFrontOriginAccessIdentityResult = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudFrontOriginAccessIdentity.foreach(
        __v => __obj.update("CloudFrontOriginAccessIdentity", __v.asInstanceOf[js.Any])
      )
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCloudFrontOriginAccessIdentityResult]
    }
  }

  /**
    * The request to update a distribution.
    */
  @js.native
  trait UpdateDistributionRequest extends js.Object {
    var DistributionConfig: DistributionConfig
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object UpdateDistributionRequest {
    def apply(
        DistributionConfig: DistributionConfig,
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdateDistributionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DistributionConfig" -> DistributionConfig.asInstanceOf[js.Any],
        "Id"                 -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDistributionRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait UpdateDistributionResult extends js.Object {
    var Distribution: js.UndefOr[Distribution]
    var ETag: js.UndefOr[String]
  }

  object UpdateDistributionResult {
    def apply(
        Distribution: js.UndefOr[Distribution] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): UpdateDistributionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Distribution.foreach(__v => __obj.update("Distribution", __v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDistributionResult]
    }
  }

  @js.native
  trait UpdateFieldLevelEncryptionConfigRequest extends js.Object {
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object UpdateFieldLevelEncryptionConfigRequest {
    def apply(
        FieldLevelEncryptionConfig: FieldLevelEncryptionConfig,
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdateFieldLevelEncryptionConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "FieldLevelEncryptionConfig" -> FieldLevelEncryptionConfig.asInstanceOf[js.Any],
        "Id"                         -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFieldLevelEncryptionConfigRequest]
    }
  }

  @js.native
  trait UpdateFieldLevelEncryptionConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption]
  }

  object UpdateFieldLevelEncryptionConfigResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined
    ): UpdateFieldLevelEncryptionConfigResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      FieldLevelEncryption.foreach(__v => __obj.update("FieldLevelEncryption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFieldLevelEncryptionConfigResult]
    }
  }

  @js.native
  trait UpdateFieldLevelEncryptionProfileRequest extends js.Object {
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object UpdateFieldLevelEncryptionProfileRequest {
    def apply(
        FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig,
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdateFieldLevelEncryptionProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "FieldLevelEncryptionProfileConfig" -> FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any],
        "Id"                                -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFieldLevelEncryptionProfileRequest]
    }
  }

  @js.native
  trait UpdateFieldLevelEncryptionProfileResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile]
  }

  object UpdateFieldLevelEncryptionProfileResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined
    ): UpdateFieldLevelEncryptionProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      FieldLevelEncryptionProfile.foreach(__v => __obj.update("FieldLevelEncryptionProfile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFieldLevelEncryptionProfileResult]
    }
  }

  @js.native
  trait UpdatePublicKeyRequest extends js.Object {
    var Id: String
    var PublicKeyConfig: PublicKeyConfig
    var IfMatch: js.UndefOr[String]
  }

  object UpdatePublicKeyRequest {
    def apply(
        Id: String,
        PublicKeyConfig: PublicKeyConfig,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdatePublicKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id"              -> Id.asInstanceOf[js.Any],
        "PublicKeyConfig" -> PublicKeyConfig.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePublicKeyRequest]
    }
  }

  @js.native
  trait UpdatePublicKeyResult extends js.Object {
    var ETag: js.UndefOr[String]
    var PublicKey: js.UndefOr[PublicKey]
  }

  object UpdatePublicKeyResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        PublicKey: js.UndefOr[PublicKey] = js.undefined
    ): UpdatePublicKeyResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.update("PublicKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePublicKeyResult]
    }
  }

  /**
    * The request to update a streaming distribution.
    */
  @js.native
  trait UpdateStreamingDistributionRequest extends js.Object {
    var Id: String
    var StreamingDistributionConfig: StreamingDistributionConfig
    var IfMatch: js.UndefOr[String]
  }

  object UpdateStreamingDistributionRequest {
    def apply(
        Id: String,
        StreamingDistributionConfig: StreamingDistributionConfig,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdateStreamingDistributionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Id"                          -> Id.asInstanceOf[js.Any],
        "StreamingDistributionConfig" -> StreamingDistributionConfig.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.update("IfMatch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStreamingDistributionRequest]
    }
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  trait UpdateStreamingDistributionResult extends js.Object {
    var ETag: js.UndefOr[String]
    var StreamingDistribution: js.UndefOr[StreamingDistribution]
  }

  object UpdateStreamingDistributionResult {
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
    ): UpdateStreamingDistributionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ETag.foreach(__v => __obj.update("ETag", __v.asInstanceOf[js.Any]))
      StreamingDistribution.foreach(__v => __obj.update("StreamingDistribution", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStreamingDistributionResult]
    }
  }

  /**
    * A complex type that specifies the following:
    * * Whether you want viewers to use HTTP or HTTPS to request your objects.
    *  * If you want viewers to use HTTPS, whether you're using an alternate domain name such as <code>example.com</code> or the CloudFront domain name for your distribution, such as <code>d111111abcdef8.cloudfront.net</code>.
    *  * If you're using an alternate domain name, whether AWS Certificate Manager (ACM) provided the certificate, or you purchased a certificate from a third-party certificate authority and imported it into ACM or uploaded it to the IAM certificate store.
    * Specify only one of the following values:
    * * [[https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-ACMCertificateArn|ACMCertificateArn]]
    *  * [[https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-IAMCertificateId|IAMCertificateId]]
    *  * [[https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html#cloudfront-Type-ViewerCertificate-CloudFrontDefaultCertificate|CloudFrontDefaultCertificate]]
    * For more information, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS| Using Alternate Domain Names and HTTPS]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait ViewerCertificate extends js.Object {
    var ACMCertificateArn: js.UndefOr[String]
    var Certificate: js.UndefOr[String]
    var CertificateSource: js.UndefOr[CertificateSource]
    var CloudFrontDefaultCertificate: js.UndefOr[Boolean]
    var IAMCertificateId: js.UndefOr[String]
    var MinimumProtocolVersion: js.UndefOr[MinimumProtocolVersion]
    var SSLSupportMethod: js.UndefOr[SSLSupportMethod]
  }

  object ViewerCertificate {
    def apply(
        ACMCertificateArn: js.UndefOr[String] = js.undefined,
        Certificate: js.UndefOr[String] = js.undefined,
        CertificateSource: js.UndefOr[CertificateSource] = js.undefined,
        CloudFrontDefaultCertificate: js.UndefOr[Boolean] = js.undefined,
        IAMCertificateId: js.UndefOr[String] = js.undefined,
        MinimumProtocolVersion: js.UndefOr[MinimumProtocolVersion] = js.undefined,
        SSLSupportMethod: js.UndefOr[SSLSupportMethod] = js.undefined
    ): ViewerCertificate = {
      val __obj = js.Dictionary.empty[js.Any]
      ACMCertificateArn.foreach(__v => __obj.update("ACMCertificateArn", __v.asInstanceOf[js.Any]))
      Certificate.foreach(__v => __obj.update("Certificate", __v.asInstanceOf[js.Any]))
      CertificateSource.foreach(__v => __obj.update("CertificateSource", __v.asInstanceOf[js.Any]))
      CloudFrontDefaultCertificate.foreach(
        __v => __obj.update("CloudFrontDefaultCertificate", __v.asInstanceOf[js.Any])
      )
      IAMCertificateId.foreach(__v => __obj.update("IAMCertificateId", __v.asInstanceOf[js.Any]))
      MinimumProtocolVersion.foreach(__v => __obj.update("MinimumProtocolVersion", __v.asInstanceOf[js.Any]))
      SSLSupportMethod.foreach(__v => __obj.update("SSLSupportMethod", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ViewerCertificate]
    }
  }

  object ViewerProtocolPolicyEnum {
    val `allow-all`         = "allow-all"
    val `https-only`        = "https-only"
    val `redirect-to-https` = "redirect-to-https"

    val values = js.Object.freeze(js.Array(`allow-all`, `https-only`, `redirect-to-https`))
  }
}
