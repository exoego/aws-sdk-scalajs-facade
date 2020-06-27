package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cloudfront {
  type AliasICPRecordals                         = js.Array[AliasICPRecordal]
  type AliasList                                 = js.Array[String]
  type AwsAccountNumberList                      = js.Array[String]
  type CacheBehaviorList                         = js.Array[CacheBehavior]
  type CloudFrontOriginAccessIdentitySummaryList = js.Array[CloudFrontOriginAccessIdentitySummary]
  type CommentType                               = String
  type ContentTypeProfileList                    = js.Array[ContentTypeProfile]
  type CookieNameList                            = js.Array[String]
  type CustomErrorResponseList                   = js.Array[CustomErrorResponse]
  type DistributionSummaryList                   = js.Array[DistributionSummary]
  type EncryptionEntityList                      = js.Array[EncryptionEntity]
  type FieldLevelEncryptionProfileSummaryList    = js.Array[FieldLevelEncryptionProfileSummary]
  type FieldLevelEncryptionSummaryList           = js.Array[FieldLevelEncryptionSummary]
  type FieldPatternList                          = js.Array[String]
  type HeaderList                                = js.Array[String]
  type InvalidationSummaryList                   = js.Array[InvalidationSummary]
  type KeyPairIdList                             = js.Array[String]
  type LambdaFunctionARN                         = String
  type LambdaFunctionAssociationList             = js.Array[LambdaFunctionAssociation]
  type LocationList                              = js.Array[String]
  type MethodsList                               = js.Array[Method]
  type OriginCustomHeadersList                   = js.Array[OriginCustomHeader]
  type OriginGroupList                           = js.Array[OriginGroup]
  type OriginGroupMemberList                     = js.Array[OriginGroupMember]
  type OriginList                                = js.Array[Origin]
  type PathList                                  = js.Array[String]
  type PublicKeySummaryList                      = js.Array[PublicKeySummary]
  type QueryArgProfileList                       = js.Array[QueryArgProfile]
  type QueryStringCacheKeysList                  = js.Array[String]
  type ResourceARN                               = String
  type SignerList                                = js.Array[Signer]
  type SslProtocolsList                          = js.Array[SslProtocol]
  type StatusCodeList                            = js.Array[Int]
  type StreamingDistributionSummaryList          = js.Array[StreamingDistributionSummary]
  type TagKey                                    = String
  type TagKeyList                                = js.Array[TagKey]
  type TagList                                   = js.Array[Tag]
  type TagValue                                  = String
  type timestamp                                 = js.Date

  implicit final class CloudFrontOps(private val service: CloudFront) extends AnyVal {

    @inline def createCloudFrontOriginAccessIdentityFuture(
        params: CreateCloudFrontOriginAccessIdentityRequest
    ): Future[CreateCloudFrontOriginAccessIdentityResult] =
      service.createCloudFrontOriginAccessIdentity(params).promise().toFuture
    @inline def createDistributionFuture(params: CreateDistributionRequest): Future[CreateDistributionResult] =
      service.createDistribution(params).promise().toFuture
    @inline def createDistributionWithTagsFuture(
        params: CreateDistributionWithTagsRequest
    ): Future[CreateDistributionWithTagsResult] = service.createDistributionWithTags(params).promise().toFuture
    @inline def createFieldLevelEncryptionConfigFuture(
        params: CreateFieldLevelEncryptionConfigRequest
    ): Future[CreateFieldLevelEncryptionConfigResult] =
      service.createFieldLevelEncryptionConfig(params).promise().toFuture
    @inline def createFieldLevelEncryptionProfileFuture(
        params: CreateFieldLevelEncryptionProfileRequest
    ): Future[CreateFieldLevelEncryptionProfileResult] =
      service.createFieldLevelEncryptionProfile(params).promise().toFuture
    @inline def createInvalidationFuture(params: CreateInvalidationRequest): Future[CreateInvalidationResult] =
      service.createInvalidation(params).promise().toFuture
    @inline def createPublicKeyFuture(params: CreatePublicKeyRequest): Future[CreatePublicKeyResult] =
      service.createPublicKey(params).promise().toFuture
    @inline def createStreamingDistributionFuture(
        params: CreateStreamingDistributionRequest
    ): Future[CreateStreamingDistributionResult] = service.createStreamingDistribution(params).promise().toFuture
    @inline def createStreamingDistributionWithTagsFuture(
        params: CreateStreamingDistributionWithTagsRequest
    ): Future[CreateStreamingDistributionWithTagsResult] =
      service.createStreamingDistributionWithTags(params).promise().toFuture
    @inline def deleteCloudFrontOriginAccessIdentityFuture(
        params: DeleteCloudFrontOriginAccessIdentityRequest
    ): Future[js.Object] = service.deleteCloudFrontOriginAccessIdentity(params).promise().toFuture
    @inline def deleteDistributionFuture(params: DeleteDistributionRequest): Future[js.Object] =
      service.deleteDistribution(params).promise().toFuture
    @inline def deleteFieldLevelEncryptionConfigFuture(
        params: DeleteFieldLevelEncryptionConfigRequest
    ): Future[js.Object] = service.deleteFieldLevelEncryptionConfig(params).promise().toFuture
    @inline def deleteFieldLevelEncryptionProfileFuture(
        params: DeleteFieldLevelEncryptionProfileRequest
    ): Future[js.Object] = service.deleteFieldLevelEncryptionProfile(params).promise().toFuture
    @inline def deletePublicKeyFuture(params: DeletePublicKeyRequest): Future[js.Object] =
      service.deletePublicKey(params).promise().toFuture
    @inline def deleteStreamingDistributionFuture(params: DeleteStreamingDistributionRequest): Future[js.Object] =
      service.deleteStreamingDistribution(params).promise().toFuture
    @inline def getCloudFrontOriginAccessIdentityConfigFuture(
        params: GetCloudFrontOriginAccessIdentityConfigRequest
    ): Future[GetCloudFrontOriginAccessIdentityConfigResult] =
      service.getCloudFrontOriginAccessIdentityConfig(params).promise().toFuture
    @inline def getCloudFrontOriginAccessIdentityFuture(
        params: GetCloudFrontOriginAccessIdentityRequest
    ): Future[GetCloudFrontOriginAccessIdentityResult] =
      service.getCloudFrontOriginAccessIdentity(params).promise().toFuture
    @inline def getDistributionConfigFuture(params: GetDistributionConfigRequest): Future[GetDistributionConfigResult] =
      service.getDistributionConfig(params).promise().toFuture
    @inline def getDistributionFuture(params: GetDistributionRequest): Future[GetDistributionResult] =
      service.getDistribution(params).promise().toFuture
    @inline def getFieldLevelEncryptionConfigFuture(
        params: GetFieldLevelEncryptionConfigRequest
    ): Future[GetFieldLevelEncryptionConfigResult] = service.getFieldLevelEncryptionConfig(params).promise().toFuture
    @inline def getFieldLevelEncryptionFuture(
        params: GetFieldLevelEncryptionRequest
    ): Future[GetFieldLevelEncryptionResult] = service.getFieldLevelEncryption(params).promise().toFuture
    @inline def getFieldLevelEncryptionProfileConfigFuture(
        params: GetFieldLevelEncryptionProfileConfigRequest
    ): Future[GetFieldLevelEncryptionProfileConfigResult] =
      service.getFieldLevelEncryptionProfileConfig(params).promise().toFuture
    @inline def getFieldLevelEncryptionProfileFuture(
        params: GetFieldLevelEncryptionProfileRequest
    ): Future[GetFieldLevelEncryptionProfileResult] = service.getFieldLevelEncryptionProfile(params).promise().toFuture
    @inline def getInvalidationFuture(params: GetInvalidationRequest): Future[GetInvalidationResult] =
      service.getInvalidation(params).promise().toFuture
    @inline def getPublicKeyConfigFuture(params: GetPublicKeyConfigRequest): Future[GetPublicKeyConfigResult] =
      service.getPublicKeyConfig(params).promise().toFuture
    @inline def getPublicKeyFuture(params: GetPublicKeyRequest): Future[GetPublicKeyResult] =
      service.getPublicKey(params).promise().toFuture
    @inline def getStreamingDistributionConfigFuture(
        params: GetStreamingDistributionConfigRequest
    ): Future[GetStreamingDistributionConfigResult] = service.getStreamingDistributionConfig(params).promise().toFuture
    @inline def getStreamingDistributionFuture(
        params: GetStreamingDistributionRequest
    ): Future[GetStreamingDistributionResult] = service.getStreamingDistribution(params).promise().toFuture
    @inline def listCloudFrontOriginAccessIdentitiesFuture(
        params: ListCloudFrontOriginAccessIdentitiesRequest
    ): Future[ListCloudFrontOriginAccessIdentitiesResult] =
      service.listCloudFrontOriginAccessIdentities(params).promise().toFuture
    @inline def listDistributionsByWebACLIdFuture(
        params: ListDistributionsByWebACLIdRequest
    ): Future[ListDistributionsByWebACLIdResult] = service.listDistributionsByWebACLId(params).promise().toFuture
    @inline def listDistributionsFuture(params: ListDistributionsRequest): Future[ListDistributionsResult] =
      service.listDistributions(params).promise().toFuture
    @inline def listFieldLevelEncryptionConfigsFuture(
        params: ListFieldLevelEncryptionConfigsRequest
    ): Future[ListFieldLevelEncryptionConfigsResult] =
      service.listFieldLevelEncryptionConfigs(params).promise().toFuture
    @inline def listFieldLevelEncryptionProfilesFuture(
        params: ListFieldLevelEncryptionProfilesRequest
    ): Future[ListFieldLevelEncryptionProfilesResult] =
      service.listFieldLevelEncryptionProfiles(params).promise().toFuture
    @inline def listInvalidationsFuture(params: ListInvalidationsRequest): Future[ListInvalidationsResult] =
      service.listInvalidations(params).promise().toFuture
    @inline def listPublicKeysFuture(params: ListPublicKeysRequest): Future[ListPublicKeysResult] =
      service.listPublicKeys(params).promise().toFuture
    @inline def listStreamingDistributionsFuture(
        params: ListStreamingDistributionsRequest
    ): Future[ListStreamingDistributionsResult] = service.listStreamingDistributions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateCloudFrontOriginAccessIdentityFuture(
        params: UpdateCloudFrontOriginAccessIdentityRequest
    ): Future[UpdateCloudFrontOriginAccessIdentityResult] =
      service.updateCloudFrontOriginAccessIdentity(params).promise().toFuture
    @inline def updateDistributionFuture(params: UpdateDistributionRequest): Future[UpdateDistributionResult] =
      service.updateDistribution(params).promise().toFuture
    @inline def updateFieldLevelEncryptionConfigFuture(
        params: UpdateFieldLevelEncryptionConfigRequest
    ): Future[UpdateFieldLevelEncryptionConfigResult] =
      service.updateFieldLevelEncryptionConfig(params).promise().toFuture
    @inline def updateFieldLevelEncryptionProfileFuture(
        params: UpdateFieldLevelEncryptionProfileRequest
    ): Future[UpdateFieldLevelEncryptionProfileResult] =
      service.updateFieldLevelEncryptionProfile(params).promise().toFuture
    @inline def updatePublicKeyFuture(params: UpdatePublicKeyRequest): Future[UpdatePublicKeyResult] =
      service.updatePublicKey(params).promise().toFuture
    @inline def updateStreamingDistributionFuture(
        params: UpdateStreamingDistributionRequest
    ): Future[UpdateStreamingDistributionResult] = service.updateStreamingDistribution(params).promise().toFuture
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
  @Factory
  trait ActiveTrustedSigners extends js.Object {
    var Enabled: Boolean
    var Quantity: Int
    var Items: js.UndefOr[SignerList]
  }

  /**
    * AWS services in China customers must file for an Internet Content Provider (ICP) recordal if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions. The status is returned in the CloudFront response; you can't configure it yourself.
    *  For more information about ICP recordals, see [[https://docs.amazonaws.cn/en_us/aws/latest/userguide/accounts-and-credentials.html| Signup, Accounts, and Credentials]] in <i>Getting Started with AWS services in China</i>.
    */
  @js.native
  @Factory
  trait AliasICPRecordal extends js.Object {
    var CNAME: js.UndefOr[String]
    var ICPRecordalStatus: js.UndefOr[ICPRecordalStatus]
  }

  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
    */
  @js.native
  @Factory
  trait Aliases extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[AliasList]
  }

  /**
    * A complex type that controls which HTTP methods CloudFront processes and forwards to your Amazon S3 bucket or your custom origin. There are three choices:
    * * CloudFront forwards only <code>GET</code> and <code>HEAD</code> requests.
    *  * CloudFront forwards only <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests.
    *  * CloudFront forwards <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and <code>DELETE</code> requests.
    * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or to your custom origin so users can't perform operations that you don't want them to. For example, you might not want users to have permissions to delete objects from your origin.
    */
  @js.native
  @Factory
  trait AllowedMethods extends js.Object {
    var Items: MethodsList
    var Quantity: Int
    var CachedMethods: js.UndefOr[CachedMethods]
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
  @Factory
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

  /**
    * A complex type that contains zero or more <code>CacheBehavior</code> elements.
    */
  @js.native
  @Factory
  trait CacheBehaviors extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[CacheBehaviorList]
  }

  /**
    * A complex type that controls whether CloudFront caches the response to requests using the specified HTTP methods. There are two choices:
    * * CloudFront caches responses to <code>GET</code> and <code>HEAD</code> requests.
    *  * CloudFront caches responses to <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests.
    * If you pick the second choice for your Amazon S3 Origin, you may need to forward Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the responses to be cached correctly.
    */
  @js.native
  @Factory
  trait CachedMethods extends js.Object {
    var Items: MethodsList
    var Quantity: Int
  }

  @js.native
  sealed trait CertificateSource extends js.Any
  object CertificateSource extends js.Object {
    val cloudfront = "cloudfront".asInstanceOf[CertificateSource]
    val iam        = "iam".asInstanceOf[CertificateSource]
    val acm        = "acm".asInstanceOf[CertificateSource]

    val values = js.Object.freeze(js.Array(cloudfront, iam, acm))
  }

  /**
    * CloudFront origin access identity.
    */
  @js.native
  @Factory
  trait CloudFrontOriginAccessIdentity extends js.Object {
    var Id: String
    var S3CanonicalUserId: String
    var CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig]
  }

  /**
    * Origin access identity configuration. Send a <code>GET</code> request to the <code>/<i>CloudFront API version</i>/CloudFront/identity ID/config</code> resource.
    */
  @js.native
  @Factory
  trait CloudFrontOriginAccessIdentityConfig extends js.Object {
    var CallerReference: String
    var Comment: String
  }

  /**
    * Lists the origin access identities for CloudFront.Send a <code>GET</code> request to the <code>/<i>CloudFront API version</i>/origin-access-identity/cloudfront</code> resource. The response includes a <code>CloudFrontOriginAccessIdentityList</code> element with zero or more <code>CloudFrontOriginAccessIdentitySummary</code> child elements. By default, your entire list of origin access identities is returned in one single page. If the list is long, you can paginate it using the <code>MaxItems</code> and <code>Marker</code> parameters.
    */
  @js.native
  @Factory
  trait CloudFrontOriginAccessIdentityList extends js.Object {
    var IsTruncated: Boolean
    var Marker: String
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[CloudFrontOriginAccessIdentitySummaryList]
    var NextMarker: js.UndefOr[String]
  }

  /**
    * Summary of the information about a CloudFront origin access identity.
    */
  @js.native
  @Factory
  trait CloudFrontOriginAccessIdentitySummary extends js.Object {
    var Comment: String
    var Id: String
    var S3CanonicalUserId: String
  }

  /**
    * A field-level encryption content type profile.
    */
  @js.native
  @Factory
  trait ContentTypeProfile extends js.Object {
    var ContentType: String
    var Format: Format
    var ProfileId: js.UndefOr[String]
  }

  /**
    * The configuration for a field-level encryption content type-profile mapping.
    */
  @js.native
  @Factory
  trait ContentTypeProfileConfig extends js.Object {
    var ForwardWhenContentTypeIsUnknown: Boolean
    var ContentTypeProfiles: js.UndefOr[ContentTypeProfiles]
  }

  /**
    * Field-level encryption content type-profile.
    */
  @js.native
  @Factory
  trait ContentTypeProfiles extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[ContentTypeProfileList]
  }

  /**
    * A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones. For more information about forwarding cookies to the origin, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html| Caching Content Based on Request Headers]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  @Factory
  trait CookieNames extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[CookieNameList]
  }

  /**
    * A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones. For more information about forwarding cookies to the origin, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html|Caching Content Based on Cookies]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  @Factory
  trait CookiePreference extends js.Object {
    var Forward: ItemSelection
    var WhitelistedNames: js.UndefOr[CookieNames]
  }

  /**
    * The request to create a new origin access identity (OAI). An origin access identity is a special CloudFront user that you can associate with Amazon S3 origins, so that you can secure all or just some of your Amazon S3 content. For more information, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html| Restricting Access to Amazon S3 Content by Using an Origin Access Identity]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  @Factory
  trait CreateCloudFrontOriginAccessIdentityRequest extends js.Object {
    var CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait CreateCloudFrontOriginAccessIdentityResult extends js.Object {
    var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity]
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
  }

  /**
    * The request to create a new distribution.
    */
  @js.native
  @Factory
  trait CreateDistributionRequest extends js.Object {
    var DistributionConfig: DistributionConfig
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait CreateDistributionResult extends js.Object {
    var Distribution: js.UndefOr[Distribution]
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
  }

  /**
    * The request to create a new distribution with tags.
    */
  @js.native
  @Factory
  trait CreateDistributionWithTagsRequest extends js.Object {
    var DistributionConfigWithTags: DistributionConfigWithTags
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait CreateDistributionWithTagsResult extends js.Object {
    var Distribution: js.UndefOr[Distribution]
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateFieldLevelEncryptionConfigRequest extends js.Object {
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
  }

  @js.native
  @Factory
  trait CreateFieldLevelEncryptionConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption]
    var Location: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateFieldLevelEncryptionProfileRequest extends js.Object {
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
  }

  @js.native
  @Factory
  trait CreateFieldLevelEncryptionProfileResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile]
    var Location: js.UndefOr[String]
  }

  /**
    * The request to create an invalidation.
    */
  @js.native
  @Factory
  trait CreateInvalidationRequest extends js.Object {
    var DistributionId: String
    var InvalidationBatch: InvalidationBatch
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait CreateInvalidationResult extends js.Object {
    var Invalidation: js.UndefOr[Invalidation]
    var Location: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreatePublicKeyRequest extends js.Object {
    var PublicKeyConfig: PublicKeyConfig
  }

  @js.native
  @Factory
  trait CreatePublicKeyResult extends js.Object {
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
    var PublicKey: js.UndefOr[PublicKey]
  }

  /**
    * The request to create a new streaming distribution.
    */
  @js.native
  @Factory
  trait CreateStreamingDistributionRequest extends js.Object {
    var StreamingDistributionConfig: StreamingDistributionConfig
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait CreateStreamingDistributionResult extends js.Object {
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
    var StreamingDistribution: js.UndefOr[StreamingDistribution]
  }

  /**
    * The request to create a new streaming distribution with tags.
    */
  @js.native
  @Factory
  trait CreateStreamingDistributionWithTagsRequest extends js.Object {
    var StreamingDistributionConfigWithTags: StreamingDistributionConfigWithTags
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait CreateStreamingDistributionWithTagsResult extends js.Object {
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
    var StreamingDistribution: js.UndefOr[StreamingDistribution]
  }

  /**
    * A complex type that controls:
    * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning the response to the viewer.
    *  * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
    * For more information about custom error pages, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html|Customizing Error Responses]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  @Factory
  trait CustomErrorResponse extends js.Object {
    var ErrorCode: Int
    var ErrorCachingMinTTL: js.UndefOr[Double]
    var ResponseCode: js.UndefOr[String]
    var ResponsePagePath: js.UndefOr[String]
  }

  /**
    * A complex type that controls:
    * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning the response to the viewer.
    *  * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
    * For more information about custom error pages, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html|Customizing Error Responses]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  @Factory
  trait CustomErrorResponses extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[CustomErrorResponseList]
  }

  /**
    * A complex type that contains the list of Custom Headers for each origin.
    */
  @js.native
  @Factory
  trait CustomHeaders extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[OriginCustomHeadersList]
  }

  /**
    * A custom origin or an Amazon S3 bucket configured as a website endpoint.
    */
  @js.native
  @Factory
  trait CustomOriginConfig extends js.Object {
    var HTTPPort: Int
    var HTTPSPort: Int
    var OriginProtocolPolicy: OriginProtocolPolicy
    var OriginKeepaliveTimeout: js.UndefOr[Int]
    var OriginReadTimeout: js.UndefOr[Int]
    var OriginSslProtocols: js.UndefOr[OriginSslProtocols]
  }

  /**
    * A complex type that describes the default cache behavior if you don't specify a <code>CacheBehavior</code> element or if files don't match any of the values of <code>PathPattern</code> in <code>CacheBehavior</code> elements. You must create exactly one default cache behavior.
    */
  @js.native
  @Factory
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

  /**
    * Deletes a origin access identity.
    */
  @js.native
  @Factory
  trait DeleteCloudFrontOriginAccessIdentityRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
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
  @Factory
  trait DeleteDistributionRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteFieldLevelEncryptionConfigRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteFieldLevelEncryptionProfileRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeletePublicKeyRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  /**
    * The request to delete a streaming distribution.
    */
  @js.native
  @Factory
  trait DeleteStreamingDistributionRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  /**
    * A distribution tells CloudFront where you want content to be delivered from, and the details about how to track and manage content delivery.
    */
  @js.native
  @Factory
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

  /**
    * A distribution configuration.
    */
  @js.native
  @Factory
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

  /**
    * A distribution Configuration and a list of tags to be associated with the distribution.
    */
  @js.native
  @Factory
  trait DistributionConfigWithTags extends js.Object {
    var DistributionConfig: DistributionConfig
    var Tags: Tags
  }

  /**
    * A distribution list.
    */
  @js.native
  @Factory
  trait DistributionList extends js.Object {
    var IsTruncated: Boolean
    var Marker: String
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[DistributionSummaryList]
    var NextMarker: js.UndefOr[String]
  }

  /**
    * A summary of the information about a CloudFront distribution.
    */
  @js.native
  @Factory
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

  /**
    * Complex data type for field-level encryption profiles that includes all of the encryption entities.
    */
  @js.native
  @Factory
  trait EncryptionEntities extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[EncryptionEntityList]
  }

  /**
    * Complex data type for field-level encryption profiles that includes the encryption key and field pattern specifications.
    */
  @js.native
  @Factory
  trait EncryptionEntity extends js.Object {
    var FieldPatterns: FieldPatterns
    var ProviderId: String
    var PublicKeyId: String
  }

  @js.native
  sealed trait EventType extends js.Any
  object EventType extends js.Object {
    val `viewer-request`  = "viewer-request".asInstanceOf[EventType]
    val `viewer-response` = "viewer-response".asInstanceOf[EventType]
    val `origin-request`  = "origin-request".asInstanceOf[EventType]
    val `origin-response` = "origin-response".asInstanceOf[EventType]

    val values = js.Object.freeze(js.Array(`viewer-request`, `viewer-response`, `origin-request`, `origin-response`))
  }

  /**
    * A complex data type that includes the profile configurations and other options specified for field-level encryption.
    */
  @js.native
  @Factory
  trait FieldLevelEncryption extends js.Object {
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
    var Id: String
    var LastModifiedTime: timestamp
  }

  /**
    * A complex data type that includes the profile configurations specified for field-level encryption.
    */
  @js.native
  @Factory
  trait FieldLevelEncryptionConfig extends js.Object {
    var CallerReference: String
    var Comment: js.UndefOr[String]
    var ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig]
    var QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig]
  }

  /**
    * List of field-level encrpytion configurations.
    */
  @js.native
  @Factory
  trait FieldLevelEncryptionList extends js.Object {
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[FieldLevelEncryptionSummaryList]
    var NextMarker: js.UndefOr[String]
  }

  /**
    * A complex data type for field-level encryption profiles.
    */
  @js.native
  @Factory
  trait FieldLevelEncryptionProfile extends js.Object {
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
    var Id: String
    var LastModifiedTime: timestamp
  }

  /**
    * A complex data type of profiles for the field-level encryption.
    */
  @js.native
  @Factory
  trait FieldLevelEncryptionProfileConfig extends js.Object {
    var CallerReference: String
    var EncryptionEntities: EncryptionEntities
    var Name: String
    var Comment: js.UndefOr[String]
  }

  /**
    * List of field-level encryption profiles.
    */
  @js.native
  @Factory
  trait FieldLevelEncryptionProfileList extends js.Object {
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[FieldLevelEncryptionProfileSummaryList]
    var NextMarker: js.UndefOr[String]
  }

  /**
    * The field-level encryption profile summary.
    */
  @js.native
  @Factory
  trait FieldLevelEncryptionProfileSummary extends js.Object {
    var EncryptionEntities: EncryptionEntities
    var Id: String
    var LastModifiedTime: timestamp
    var Name: String
    var Comment: js.UndefOr[String]
  }

  /**
    * A summary of a field-level encryption item.
    */
  @js.native
  @Factory
  trait FieldLevelEncryptionSummary extends js.Object {
    var Id: String
    var LastModifiedTime: timestamp
    var Comment: js.UndefOr[String]
    var ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig]
    var QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig]
  }

  /**
    * A complex data type that includes the field patterns to match for field-level encryption.
    */
  @js.native
  @Factory
  trait FieldPatterns extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[FieldPatternList]
  }

  @js.native
  sealed trait Format extends js.Any
  object Format extends js.Object {
    val URLEncoded = "URLEncoded".asInstanceOf[Format]

    val values = js.Object.freeze(js.Array(URLEncoded))
  }

  /**
    * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
    */
  @js.native
  @Factory
  trait ForwardedValues extends js.Object {
    var Cookies: CookiePreference
    var QueryString: Boolean
    var Headers: js.UndefOr[Headers]
    var QueryStringCacheKeys: js.UndefOr[QueryStringCacheKeys]
  }

  /**
    * A complex type that controls the countries in which your content is distributed. CloudFront determines the location of your users using <code>MaxMind</code> GeoIP databases.
    */
  @js.native
  @Factory
  trait GeoRestriction extends js.Object {
    var Quantity: Int
    var RestrictionType: GeoRestrictionType
    var Items: js.UndefOr[LocationList]
  }

  @js.native
  sealed trait GeoRestrictionType extends js.Any
  object GeoRestrictionType extends js.Object {
    val blacklist = "blacklist".asInstanceOf[GeoRestrictionType]
    val whitelist = "whitelist".asInstanceOf[GeoRestrictionType]
    val none      = "none".asInstanceOf[GeoRestrictionType]

    val values = js.Object.freeze(js.Array(blacklist, whitelist, none))
  }

  /**
    * The origin access identity's configuration information. For more information, see [[https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CloudFrontOriginAccessIdentityConfig.html|CloudFrontOriginAccessIdentityConfig]].
    */
  @js.native
  @Factory
  trait GetCloudFrontOriginAccessIdentityConfigRequest extends js.Object {
    var Id: String
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait GetCloudFrontOriginAccessIdentityConfigResult extends js.Object {
    var CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig]
    var ETag: js.UndefOr[String]
  }

  /**
    * The request to get an origin access identity's information.
    */
  @js.native
  @Factory
  trait GetCloudFrontOriginAccessIdentityRequest extends js.Object {
    var Id: String
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait GetCloudFrontOriginAccessIdentityResult extends js.Object {
    var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity]
    var ETag: js.UndefOr[String]
  }

  /**
    * The request to get a distribution configuration.
    */
  @js.native
  @Factory
  trait GetDistributionConfigRequest extends js.Object {
    var Id: String
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait GetDistributionConfigResult extends js.Object {
    var DistributionConfig: js.UndefOr[DistributionConfig]
    var ETag: js.UndefOr[String]
  }

  /**
    * The request to get a distribution's information.
    */
  @js.native
  @Factory
  trait GetDistributionRequest extends js.Object {
    var Id: String
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait GetDistributionResult extends js.Object {
    var Distribution: js.UndefOr[Distribution]
    var ETag: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetFieldLevelEncryptionConfigRequest extends js.Object {
    var Id: String
  }

  @js.native
  @Factory
  trait GetFieldLevelEncryptionConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryptionConfig: js.UndefOr[FieldLevelEncryptionConfig]
  }

  @js.native
  @Factory
  trait GetFieldLevelEncryptionProfileConfigRequest extends js.Object {
    var Id: String
  }

  @js.native
  @Factory
  trait GetFieldLevelEncryptionProfileConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryptionProfileConfig: js.UndefOr[FieldLevelEncryptionProfileConfig]
  }

  @js.native
  @Factory
  trait GetFieldLevelEncryptionProfileRequest extends js.Object {
    var Id: String
  }

  @js.native
  @Factory
  trait GetFieldLevelEncryptionProfileResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile]
  }

  @js.native
  @Factory
  trait GetFieldLevelEncryptionRequest extends js.Object {
    var Id: String
  }

  @js.native
  @Factory
  trait GetFieldLevelEncryptionResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption]
  }

  /**
    * The request to get an invalidation's information.
    */
  @js.native
  @Factory
  trait GetInvalidationRequest extends js.Object {
    var DistributionId: String
    var Id: String
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait GetInvalidationResult extends js.Object {
    var Invalidation: js.UndefOr[Invalidation]
  }

  @js.native
  @Factory
  trait GetPublicKeyConfigRequest extends js.Object {
    var Id: String
  }

  @js.native
  @Factory
  trait GetPublicKeyConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var PublicKeyConfig: js.UndefOr[PublicKeyConfig]
  }

  @js.native
  @Factory
  trait GetPublicKeyRequest extends js.Object {
    var Id: String
  }

  @js.native
  @Factory
  trait GetPublicKeyResult extends js.Object {
    var ETag: js.UndefOr[String]
    var PublicKey: js.UndefOr[PublicKey]
  }

  /**
    * To request to get a streaming distribution configuration.
    */
  @js.native
  @Factory
  trait GetStreamingDistributionConfigRequest extends js.Object {
    var Id: String
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait GetStreamingDistributionConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig]
  }

  /**
    * The request to get a streaming distribution's information.
    */
  @js.native
  @Factory
  trait GetStreamingDistributionRequest extends js.Object {
    var Id: String
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait GetStreamingDistributionResult extends js.Object {
    var ETag: js.UndefOr[String]
    var StreamingDistribution: js.UndefOr[StreamingDistribution]
  }

  /**
    * A complex type that specifies the request headers, if any, that you want CloudFront to base caching on for this cache behavior.
    *  For the headers that you specify, CloudFront caches separate versions of a specified object based on the header values in viewer requests. For example, suppose viewer requests for <code>logo.jpg</code> contain a custom <code>product</code> header that has a value of either <code>acme</code> or <code>apex</code>, and you configure CloudFront to cache your content based on values in the <code>product</code> header. CloudFront forwards the <code>product</code> header to the origin and caches the response from the origin once for each header value. For more information about caching based on header values, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html|How CloudFront Forwards and Caches Headers]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  @Factory
  trait Headers extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[HeaderList]
  }

  @js.native
  sealed trait HttpVersion extends js.Any
  object HttpVersion extends js.Object {
    val `http1.1` = "http1.1".asInstanceOf[HttpVersion]
    val http2     = "http2".asInstanceOf[HttpVersion]

    val values = js.Object.freeze(js.Array(`http1.1`, http2))
  }

  @js.native
  sealed trait ICPRecordalStatus extends js.Any
  object ICPRecordalStatus extends js.Object {
    val APPROVED  = "APPROVED".asInstanceOf[ICPRecordalStatus]
    val SUSPENDED = "SUSPENDED".asInstanceOf[ICPRecordalStatus]
    val PENDING   = "PENDING".asInstanceOf[ICPRecordalStatus]

    val values = js.Object.freeze(js.Array(APPROVED, SUSPENDED, PENDING))
  }

  /**
    * An invalidation.
    */
  @js.native
  @Factory
  trait Invalidation extends js.Object {
    var CreateTime: timestamp
    var Id: String
    var InvalidationBatch: InvalidationBatch
    var Status: String
  }

  /**
    * An invalidation batch.
    */
  @js.native
  @Factory
  trait InvalidationBatch extends js.Object {
    var CallerReference: String
    var Paths: Paths
  }

  /**
    * The <code>InvalidationList</code> complex type describes the list of invalidation objects. For more information about invalidation, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html|Invalidating Objects (Web Distributions Only)]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  @Factory
  trait InvalidationList extends js.Object {
    var IsTruncated: Boolean
    var Marker: String
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[InvalidationSummaryList]
    var NextMarker: js.UndefOr[String]
  }

  /**
    * A summary of an invalidation request.
    */
  @js.native
  @Factory
  trait InvalidationSummary extends js.Object {
    var CreateTime: timestamp
    var Id: String
    var Status: String
  }

  @js.native
  sealed trait ItemSelection extends js.Any
  object ItemSelection extends js.Object {
    val none      = "none".asInstanceOf[ItemSelection]
    val whitelist = "whitelist".asInstanceOf[ItemSelection]
    val all       = "all".asInstanceOf[ItemSelection]

    val values = js.Object.freeze(js.Array(none, whitelist, all))
  }

  /**
    * A complex type that lists the active CloudFront key pairs, if any, that are associated with <code>AwsAccountNumber</code>.
    *  For more information, see [[https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ActiveTrustedSigners.html|ActiveTrustedSigners]].
    */
  @js.native
  @Factory
  trait KeyPairIds extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[KeyPairIdList]
  }

  /**
    * A complex type that contains a Lambda function association.
    */
  @js.native
  @Factory
  trait LambdaFunctionAssociation extends js.Object {
    var EventType: EventType
    var LambdaFunctionARN: LambdaFunctionARN
    var IncludeBody: js.UndefOr[Boolean]
  }

  /**
    * A complex type that specifies a list of Lambda functions associations for a cache behavior.
    *  If you want to invoke one or more Lambda functions triggered by requests that match the <code>PathPattern</code> of the cache behavior, specify the applicable values for <code>Quantity</code> and <code>Items</code>. Note that there can be up to 4 <code>LambdaFunctionAssociation</code> items in this list (one for each possible value of <code>EventType</code>) and each <code>EventType</code> can be associated with the Lambda function only once.
    *  If you don't want to invoke any Lambda functions for the requests that match <code>PathPattern</code>, specify <code>0</code> for <code>Quantity</code> and omit <code>Items</code>.
    */
  @js.native
  @Factory
  trait LambdaFunctionAssociations extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[LambdaFunctionAssociationList]
  }

  /**
    * The request to list origin access identities.
    */
  @js.native
  @Factory
  trait ListCloudFrontOriginAccessIdentitiesRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait ListCloudFrontOriginAccessIdentitiesResult extends js.Object {
    var CloudFrontOriginAccessIdentityList: js.UndefOr[CloudFrontOriginAccessIdentityList]
  }

  /**
    * The request to list distributions that are associated with a specified AWS WAF web ACL.
    */
  @js.native
  @Factory
  trait ListDistributionsByWebACLIdRequest extends js.Object {
    var WebACLId: String
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  /**
    * The response to a request to list the distributions that are associated with a specified AWS WAF web ACL.
    */
  @js.native
  @Factory
  trait ListDistributionsByWebACLIdResult extends js.Object {
    var DistributionList: js.UndefOr[DistributionList]
  }

  /**
    * The request to list your distributions.
    */
  @js.native
  @Factory
  trait ListDistributionsRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait ListDistributionsResult extends js.Object {
    var DistributionList: js.UndefOr[DistributionList]
  }

  @js.native
  @Factory
  trait ListFieldLevelEncryptionConfigsRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListFieldLevelEncryptionConfigsResult extends js.Object {
    var FieldLevelEncryptionList: js.UndefOr[FieldLevelEncryptionList]
  }

  @js.native
  @Factory
  trait ListFieldLevelEncryptionProfilesRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListFieldLevelEncryptionProfilesResult extends js.Object {
    var FieldLevelEncryptionProfileList: js.UndefOr[FieldLevelEncryptionProfileList]
  }

  /**
    * The request to list invalidations.
    */
  @js.native
  @Factory
  trait ListInvalidationsRequest extends js.Object {
    var DistributionId: String
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait ListInvalidationsResult extends js.Object {
    var InvalidationList: js.UndefOr[InvalidationList]
  }

  @js.native
  @Factory
  trait ListPublicKeysRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListPublicKeysResult extends js.Object {
    var PublicKeyList: js.UndefOr[PublicKeyList]
  }

  /**
    * The request to list your streaming distributions.
    */
  @js.native
  @Factory
  trait ListStreamingDistributionsRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait ListStreamingDistributionsResult extends js.Object {
    var StreamingDistributionList: js.UndefOr[StreamingDistributionList]
  }

  /**
    * The request to list tags for a CloudFront resource.
    */
  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var Resource: ResourceARN
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait ListTagsForResourceResult extends js.Object {
    var Tags: Tags
  }

  /**
    * A complex type that controls whether access logs are written for the distribution.
    */
  @js.native
  @Factory
  trait LoggingConfig extends js.Object {
    var Bucket: String
    var Enabled: Boolean
    var IncludeCookies: Boolean
    var Prefix: String
  }

  @js.native
  sealed trait Method extends js.Any
  object Method extends js.Object {
    val GET     = "GET".asInstanceOf[Method]
    val HEAD    = "HEAD".asInstanceOf[Method]
    val POST    = "POST".asInstanceOf[Method]
    val PUT     = "PUT".asInstanceOf[Method]
    val PATCH   = "PATCH".asInstanceOf[Method]
    val OPTIONS = "OPTIONS".asInstanceOf[Method]
    val DELETE  = "DELETE".asInstanceOf[Method]

    val values = js.Object.freeze(js.Array(GET, HEAD, POST, PUT, PATCH, OPTIONS, DELETE))
  }

  @js.native
  sealed trait MinimumProtocolVersion extends js.Any
  object MinimumProtocolVersion extends js.Object {
    val SSLv3          = "SSLv3".asInstanceOf[MinimumProtocolVersion]
    val TLSv1          = "TLSv1".asInstanceOf[MinimumProtocolVersion]
    val TLSv1_2016     = "TLSv1_2016".asInstanceOf[MinimumProtocolVersion]
    val `TLSv1.1_2016` = "TLSv1.1_2016".asInstanceOf[MinimumProtocolVersion]
    val `TLSv1.2_2018` = "TLSv1.2_2018".asInstanceOf[MinimumProtocolVersion]

    val values = js.Object.freeze(js.Array(SSLv3, TLSv1, TLSv1_2016, `TLSv1.1_2016`, `TLSv1.2_2018`))
  }

  /**
    * A complex type that describes the Amazon S3 bucket, HTTP server (for example, a web server), Amazon MediaStore, or other server from which CloudFront gets your files. This can also be an origin group, if you've created an origin group. You must specify at least one origin or origin group.
    *  For the current limit on the number of origins or origin groups that you can specify for a distribution, see [[https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront|Amazon CloudFront Limits]] in the <i>AWS General Reference</i>.
    */
  @js.native
  @Factory
  trait Origin extends js.Object {
    var DomainName: String
    var Id: String
    var CustomHeaders: js.UndefOr[CustomHeaders]
    var CustomOriginConfig: js.UndefOr[CustomOriginConfig]
    var OriginPath: js.UndefOr[String]
    var S3OriginConfig: js.UndefOr[S3OriginConfig]
  }

  /**
    * A complex type that contains <code>HeaderName</code> and <code>HeaderValue</code> elements, if any, for this distribution.
    */
  @js.native
  @Factory
  trait OriginCustomHeader extends js.Object {
    var HeaderName: String
    var HeaderValue: String
  }

  /**
    * An origin group includes two origins (a primary origin and a second origin to failover to) and a failover criteria that you specify. You create an origin group to support origin failover in CloudFront. When you create or update a distribution, you can specifiy the origin group instead of a single origin, and CloudFront will failover from the primary origin to the second origin under the failover conditions that you've chosen.
    */
  @js.native
  @Factory
  trait OriginGroup extends js.Object {
    var FailoverCriteria: OriginGroupFailoverCriteria
    var Id: String
    var Members: OriginGroupMembers
  }

  /**
    * A complex data type that includes information about the failover criteria for an origin group, including the status codes for which CloudFront will failover from the primary origin to the second origin.
    */
  @js.native
  @Factory
  trait OriginGroupFailoverCriteria extends js.Object {
    var StatusCodes: StatusCodes
  }

  /**
    * An origin in an origin group.
    */
  @js.native
  @Factory
  trait OriginGroupMember extends js.Object {
    var OriginId: String
  }

  /**
    * A complex data type for the origins included in an origin group.
    */
  @js.native
  @Factory
  trait OriginGroupMembers extends js.Object {
    var Items: OriginGroupMemberList
    var Quantity: Int
  }

  /**
    * A complex data type for the origin groups specified for a distribution.
    */
  @js.native
  @Factory
  trait OriginGroups extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[OriginGroupList]
  }

  @js.native
  sealed trait OriginProtocolPolicy extends js.Any
  object OriginProtocolPolicy extends js.Object {
    val `http-only`    = "http-only".asInstanceOf[OriginProtocolPolicy]
    val `match-viewer` = "match-viewer".asInstanceOf[OriginProtocolPolicy]
    val `https-only`   = "https-only".asInstanceOf[OriginProtocolPolicy]

    val values = js.Object.freeze(js.Array(`http-only`, `match-viewer`, `https-only`))
  }

  /**
    * A complex type that contains information about the SSL/TLS protocols that CloudFront can use when establishing an HTTPS connection with your origin.
    */
  @js.native
  @Factory
  trait OriginSslProtocols extends js.Object {
    var Items: SslProtocolsList
    var Quantity: Int
  }

  /**
    * A complex type that contains information about origins and origin groups for this distribution.
    */
  @js.native
  @Factory
  trait Origins extends js.Object {
    var Items: OriginList
    var Quantity: Int
  }

  /**
    * A complex type that contains information about the objects that you want to invalidate. For more information, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html#invalidation-specifying-objects|Specifying the Objects to Invalidate]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  @Factory
  trait Paths extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[PathList]
  }

  @js.native
  sealed trait PriceClass extends js.Any
  object PriceClass extends js.Object {
    val PriceClass_100 = "PriceClass_100".asInstanceOf[PriceClass]
    val PriceClass_200 = "PriceClass_200".asInstanceOf[PriceClass]
    val PriceClass_All = "PriceClass_All".asInstanceOf[PriceClass]

    val values = js.Object.freeze(js.Array(PriceClass_100, PriceClass_200, PriceClass_All))
  }

  /**
    * A complex data type of public keys you add to CloudFront to use with features like field-level encryption.
    */
  @js.native
  @Factory
  trait PublicKey extends js.Object {
    var CreatedTime: timestamp
    var Id: String
    var PublicKeyConfig: PublicKeyConfig
  }

  /**
    * Information about a public key you add to CloudFront to use with features like field-level encryption.
    */
  @js.native
  @Factory
  trait PublicKeyConfig extends js.Object {
    var CallerReference: String
    var EncodedKey: String
    var Name: String
    var Comment: js.UndefOr[String]
  }

  /**
    * A list of public keys you've added to CloudFront to use with features like field-level encryption.
    */
  @js.native
  @Factory
  trait PublicKeyList extends js.Object {
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[PublicKeySummaryList]
    var NextMarker: js.UndefOr[String]
  }

  /**
    * A complex data type for public key information.
    */
  @js.native
  @Factory
  trait PublicKeySummary extends js.Object {
    var CreatedTime: timestamp
    var EncodedKey: String
    var Id: String
    var Name: String
    var Comment: js.UndefOr[String]
  }

  /**
    * Query argument-profile mapping for field-level encryption.
    */
  @js.native
  @Factory
  trait QueryArgProfile extends js.Object {
    var ProfileId: String
    var QueryArg: String
  }

  /**
    * Configuration for query argument-profile mapping for field-level encryption.
    */
  @js.native
  @Factory
  trait QueryArgProfileConfig extends js.Object {
    var ForwardWhenQueryArgProfileIsUnknown: Boolean
    var QueryArgProfiles: js.UndefOr[QueryArgProfiles]
  }

  /**
    * Query argument-profile mapping for field-level encryption.
    */
  @js.native
  @Factory
  trait QueryArgProfiles extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[QueryArgProfileList]
  }

  /**
    * A complex type that contains information about the query string parameters that you want CloudFront to use for caching for a cache behavior.
    */
  @js.native
  @Factory
  trait QueryStringCacheKeys extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[QueryStringCacheKeysList]
  }

  /**
    * A complex type that identifies ways in which you want to restrict distribution of your content.
    */
  @js.native
  @Factory
  trait Restrictions extends js.Object {
    var GeoRestriction: GeoRestriction
  }

  /**
    * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution.
    */
  @js.native
  @Factory
  trait S3Origin extends js.Object {
    var DomainName: String
    var OriginAccessIdentity: String
  }

  /**
    * A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use the <code>CustomOriginConfig</code> element instead.
    */
  @js.native
  @Factory
  trait S3OriginConfig extends js.Object {
    var OriginAccessIdentity: String
  }

  @js.native
  sealed trait SSLSupportMethod extends js.Any
  object SSLSupportMethod extends js.Object {
    val `sni-only` = "sni-only".asInstanceOf[SSLSupportMethod]
    val vip        = "vip".asInstanceOf[SSLSupportMethod]

    val values = js.Object.freeze(js.Array(`sni-only`, vip))
  }

  /**
    * A complex type that lists the AWS accounts that were included in the <code>TrustedSigners</code> complex type, as well as their active CloudFront key pair IDs, if any.
    */
  @js.native
  @Factory
  trait Signer extends js.Object {
    var AwsAccountNumber: js.UndefOr[String]
    var KeyPairIds: js.UndefOr[KeyPairIds]
  }

  @js.native
  sealed trait SslProtocol extends js.Any
  object SslProtocol extends js.Object {
    val SSLv3     = "SSLv3".asInstanceOf[SslProtocol]
    val TLSv1     = "TLSv1".asInstanceOf[SslProtocol]
    val `TLSv1.1` = "TLSv1.1".asInstanceOf[SslProtocol]
    val `TLSv1.2` = "TLSv1.2".asInstanceOf[SslProtocol]

    val values = js.Object.freeze(js.Array(SSLv3, TLSv1, `TLSv1.1`, `TLSv1.2`))
  }

  /**
    * A complex data type for the status codes that you specify that, when returned by a primary origin, trigger CloudFront to failover to a second origin.
    */
  @js.native
  @Factory
  trait StatusCodes extends js.Object {
    var Items: StatusCodeList
    var Quantity: Int
  }

  /**
    * A streaming distribution tells CloudFront where you want RTMP content to be delivered from, and the details about how to track and manage content delivery.
    */
  @js.native
  @Factory
  trait StreamingDistribution extends js.Object {
    var ARN: String
    var ActiveTrustedSigners: ActiveTrustedSigners
    var DomainName: String
    var Id: String
    var Status: String
    var StreamingDistributionConfig: StreamingDistributionConfig
    var LastModifiedTime: js.UndefOr[timestamp]
  }

  /**
    * The RTMP distribution's configuration information.
    */
  @js.native
  @Factory
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

  /**
    * A streaming distribution Configuration and a list of tags to be associated with the streaming distribution.
    */
  @js.native
  @Factory
  trait StreamingDistributionConfigWithTags extends js.Object {
    var StreamingDistributionConfig: StreamingDistributionConfig
    var Tags: Tags
  }

  /**
    * A streaming distribution list.
    */
  @js.native
  @Factory
  trait StreamingDistributionList extends js.Object {
    var IsTruncated: Boolean
    var Marker: String
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[StreamingDistributionSummaryList]
    var NextMarker: js.UndefOr[String]
  }

  /**
    * A summary of the information for a CloudFront streaming distribution.
    */
  @js.native
  @Factory
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

  /**
    * A complex type that controls whether access logs are written for this streaming distribution.
    */
  @js.native
  @Factory
  trait StreamingLoggingConfig extends js.Object {
    var Bucket: String
    var Enabled: Boolean
    var Prefix: String
  }

  /**
    * A complex type that contains <code>Tag</code> key and <code>Tag</code> value.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  /**
    * A complex type that contains zero or more <code>Tag</code> elements.
    */
  @js.native
  @Factory
  trait TagKeys extends js.Object {
    var Items: js.UndefOr[TagKeyList]
  }

  /**
    * The request to add tags to a CloudFront resource.
    */
  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var Resource: ResourceARN
    var Tags: Tags
  }

  /**
    * A complex type that contains zero or more <code>Tag</code> elements.
    */
  @js.native
  @Factory
  trait Tags extends js.Object {
    var Items: js.UndefOr[TagList]
  }

  /**
    * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content.
    *  If you want to require signed URLs in requests for objects in the target origin that match the <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify the applicable values for <code>Quantity</code> and <code>Items</code>. For more information, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html|Serving Private Content through CloudFront]] in the <i> Amazon CloudFront Developer Guide</i>.
    *  If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>, specify <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>.
    *  To add, change, or remove one or more trusted signers, change <code>Enabled</code> to <code>true</code> (if it's currently <code>false</code>), change <code>Quantity</code> as applicable, and specify all of the trusted signers that you want to include in the updated distribution.
    *  For more information about updating the distribution configuration, see [[https://docs.aws.amazon.com/cloudfront/latest/APIReference/DistributionConfig.html|DistributionConfig]] in the <i>Amazon CloudFront API Reference</i>.
    */
  @js.native
  @Factory
  trait TrustedSigners extends js.Object {
    var Enabled: Boolean
    var Quantity: Int
    var Items: js.UndefOr[AwsAccountNumberList]
  }

  /**
    * The request to remove tags from a CloudFront resource.
    */
  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var Resource: ResourceARN
    var TagKeys: TagKeys
  }

  /**
    * The request to update an origin access identity.
    */
  @js.native
  @Factory
  trait UpdateCloudFrontOriginAccessIdentityRequest extends js.Object {
    var CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait UpdateCloudFrontOriginAccessIdentityResult extends js.Object {
    var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity]
    var ETag: js.UndefOr[String]
  }

  /**
    * The request to update a distribution.
    */
  @js.native
  @Factory
  trait UpdateDistributionRequest extends js.Object {
    var DistributionConfig: DistributionConfig
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait UpdateDistributionResult extends js.Object {
    var Distribution: js.UndefOr[Distribution]
    var ETag: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateFieldLevelEncryptionConfigRequest extends js.Object {
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateFieldLevelEncryptionConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption]
  }

  @js.native
  @Factory
  trait UpdateFieldLevelEncryptionProfileRequest extends js.Object {
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateFieldLevelEncryptionProfileResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile]
  }

  @js.native
  @Factory
  trait UpdatePublicKeyRequest extends js.Object {
    var Id: String
    var PublicKeyConfig: PublicKeyConfig
    var IfMatch: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdatePublicKeyResult extends js.Object {
    var ETag: js.UndefOr[String]
    var PublicKey: js.UndefOr[PublicKey]
  }

  /**
    * The request to update a streaming distribution.
    */
  @js.native
  @Factory
  trait UpdateStreamingDistributionRequest extends js.Object {
    var Id: String
    var StreamingDistributionConfig: StreamingDistributionConfig
    var IfMatch: js.UndefOr[String]
  }

  /**
    * The returned result of the corresponding request.
    */
  @js.native
  @Factory
  trait UpdateStreamingDistributionResult extends js.Object {
    var ETag: js.UndefOr[String]
    var StreamingDistribution: js.UndefOr[StreamingDistribution]
  }

  /**
    * A complex type that determines the distribution’s SSL/TLS configuration for communicating with viewers.
    *  If the distribution doesn’t use <code>Aliases</code> (also known as alternate domain names or CNAMEs)—that is, if the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>—set <code>CloudFrontDefaultCertificate</code> to <code>true</code> and leave all other fields empty.
    *  If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), use the fields in this type to specify the following settings:
    * * Which viewers the distribution accepts HTTPS connections from: only viewers that support [[https://en.wikipedia.org/wiki/Server_Name_Indication|server name indication (SNI)]] (recommended), or all viewers including those that don’t support SNI.
    * <li> To accept HTTPS connections from only viewers that support SNI, set <code>SSLSupportMethod</code> to <code>sni-only</code>. This is recommended. Most browsers and clients released after 2010 support SNI.
    *  * To accept HTTPS connections from all viewers, including those that don’t support SNI, set <code>SSLSupportMethod</code> to <code>vip</code>. This is not recommended, and results in additional monthly charges from CloudFront.
    * </li> * The minimum SSL/TLS protocol version that the distribution can use to communicate with viewers. To specify a minimum version, choose a value for <code>MinimumProtocolVersion</code>. For more information, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy|Security Policy]] in the <i>Amazon CloudFront Developer Guide</i>.
    *  * The location of the SSL/TLS certificate, [[https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html|AWS Certificate Manager (ACM)]] (recommended) or [[https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html|AWS Identity and Access Management (AWS IAM)]]. You specify the location by setting a value in one of the following fields (not both):
    * <li> <code>ACMCertificateArn</code>
    *  * <code>IAMCertificateId</code>
    * </li>All distributions support HTTPS connections from viewers. To require viewers to use HTTPS only, or to redirect them from HTTP to HTTPS, use <code>ViewerProtocolPolicy</code> in the <code>CacheBehavior</code> or <code>DefaultCacheBehavior</code>. To specify how CloudFront should use SSL/TLS to communicate with your custom origin, use <code>CustomOriginConfig</code>.
    *  For more information, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https.html|Using HTTPS with CloudFront]] and [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-alternate-domain-names.html| Using Alternate Domain Names and HTTPS]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  @Factory
  trait ViewerCertificate extends js.Object {
    var ACMCertificateArn: js.UndefOr[String]
    var Certificate: js.UndefOr[String]
    var CertificateSource: js.UndefOr[CertificateSource]
    var CloudFrontDefaultCertificate: js.UndefOr[Boolean]
    var IAMCertificateId: js.UndefOr[String]
    var MinimumProtocolVersion: js.UndefOr[MinimumProtocolVersion]
    var SSLSupportMethod: js.UndefOr[SSLSupportMethod]
  }

  @js.native
  sealed trait ViewerProtocolPolicy extends js.Any
  object ViewerProtocolPolicy extends js.Object {
    val `allow-all`         = "allow-all".asInstanceOf[ViewerProtocolPolicy]
    val `https-only`        = "https-only".asInstanceOf[ViewerProtocolPolicy]
    val `redirect-to-https` = "redirect-to-https".asInstanceOf[ViewerProtocolPolicy]

    val values = js.Object.freeze(js.Array(`allow-all`, `https-only`, `redirect-to-https`))
  }
}
