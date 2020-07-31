package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object cloudfront {
  type AliasICPRecordals = js.Array[AliasICPRecordal]
  type AliasList = js.Array[String]
  type AwsAccountNumberList = js.Array[String]
  type CacheBehaviorList = js.Array[CacheBehavior]
  type CachePolicySummaryList = js.Array[CachePolicySummary]
  type CloudFrontOriginAccessIdentitySummaryList = js.Array[CloudFrontOriginAccessIdentitySummary]
  type CommentType = String
  type ContentTypeProfileList = js.Array[ContentTypeProfile]
  type CookieNameList = js.Array[String]
  type CustomErrorResponseList = js.Array[CustomErrorResponse]
  type DistributionIdListSummary = js.Array[String]
  type DistributionSummaryList = js.Array[DistributionSummary]
  type EncryptionEntityList = js.Array[EncryptionEntity]
  type FieldLevelEncryptionProfileSummaryList = js.Array[FieldLevelEncryptionProfileSummary]
  type FieldLevelEncryptionSummaryList = js.Array[FieldLevelEncryptionSummary]
  type FieldPatternList = js.Array[String]
  type HeaderList = js.Array[String]
  type InvalidationSummaryList = js.Array[InvalidationSummary]
  type KeyPairIdList = js.Array[String]
  type LambdaFunctionARN = String
  type LambdaFunctionAssociationList = js.Array[LambdaFunctionAssociation]
  type LocationList = js.Array[String]
  type MethodsList = js.Array[Method]
  type OriginCustomHeadersList = js.Array[OriginCustomHeader]
  type OriginGroupList = js.Array[OriginGroup]
  type OriginGroupMemberList = js.Array[OriginGroupMember]
  type OriginList = js.Array[Origin]
  type OriginRequestPolicySummaryList = js.Array[OriginRequestPolicySummary]
  type PathList = js.Array[String]
  type PublicKeySummaryList = js.Array[PublicKeySummary]
  type QueryArgProfileList = js.Array[QueryArgProfile]
  type QueryStringCacheKeysList = js.Array[String]
  type QueryStringNamesList = js.Array[String]
  type ResourceARN = String
  type SignerList = js.Array[Signer]
  type SslProtocolsList = js.Array[SslProtocol]
  type StatusCodeList = js.Array[Int]
  type StreamingDistributionSummaryList = js.Array[StreamingDistributionSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type timestamp = js.Date

  implicit final class CloudFrontOps(private val service: CloudFront) extends AnyVal {

    @inline def createCachePolicyFuture(params: CreateCachePolicyRequest): Future[CreateCachePolicyResult] = service.createCachePolicy(params).promise().toFuture
    @inline def createCloudFrontOriginAccessIdentityFuture(params: CreateCloudFrontOriginAccessIdentityRequest): Future[CreateCloudFrontOriginAccessIdentityResult] = service.createCloudFrontOriginAccessIdentity(params).promise().toFuture
    @inline def createDistributionFuture(params: CreateDistributionRequest): Future[CreateDistributionResult] = service.createDistribution(params).promise().toFuture
    @inline def createDistributionWithTagsFuture(params: CreateDistributionWithTagsRequest): Future[CreateDistributionWithTagsResult] = service.createDistributionWithTags(params).promise().toFuture
    @inline def createFieldLevelEncryptionConfigFuture(params: CreateFieldLevelEncryptionConfigRequest): Future[CreateFieldLevelEncryptionConfigResult] = service.createFieldLevelEncryptionConfig(params).promise().toFuture
    @inline def createFieldLevelEncryptionProfileFuture(params: CreateFieldLevelEncryptionProfileRequest): Future[CreateFieldLevelEncryptionProfileResult] = service.createFieldLevelEncryptionProfile(params).promise().toFuture
    @inline def createInvalidationFuture(params: CreateInvalidationRequest): Future[CreateInvalidationResult] = service.createInvalidation(params).promise().toFuture
    @inline def createOriginRequestPolicyFuture(params: CreateOriginRequestPolicyRequest): Future[CreateOriginRequestPolicyResult] = service.createOriginRequestPolicy(params).promise().toFuture
    @inline def createPublicKeyFuture(params: CreatePublicKeyRequest): Future[CreatePublicKeyResult] = service.createPublicKey(params).promise().toFuture
    @inline def createStreamingDistributionFuture(params: CreateStreamingDistributionRequest): Future[CreateStreamingDistributionResult] = service.createStreamingDistribution(params).promise().toFuture
    @inline def createStreamingDistributionWithTagsFuture(params: CreateStreamingDistributionWithTagsRequest): Future[CreateStreamingDistributionWithTagsResult] = service.createStreamingDistributionWithTags(params).promise().toFuture
    @inline def deleteCachePolicyFuture(params: DeleteCachePolicyRequest): Future[js.Object] = service.deleteCachePolicy(params).promise().toFuture
    @inline def deleteCloudFrontOriginAccessIdentityFuture(params: DeleteCloudFrontOriginAccessIdentityRequest): Future[js.Object] = service.deleteCloudFrontOriginAccessIdentity(params).promise().toFuture
    @inline def deleteDistributionFuture(params: DeleteDistributionRequest): Future[js.Object] = service.deleteDistribution(params).promise().toFuture
    @inline def deleteFieldLevelEncryptionConfigFuture(params: DeleteFieldLevelEncryptionConfigRequest): Future[js.Object] = service.deleteFieldLevelEncryptionConfig(params).promise().toFuture
    @inline def deleteFieldLevelEncryptionProfileFuture(params: DeleteFieldLevelEncryptionProfileRequest): Future[js.Object] = service.deleteFieldLevelEncryptionProfile(params).promise().toFuture
    @inline def deleteOriginRequestPolicyFuture(params: DeleteOriginRequestPolicyRequest): Future[js.Object] = service.deleteOriginRequestPolicy(params).promise().toFuture
    @inline def deletePublicKeyFuture(params: DeletePublicKeyRequest): Future[js.Object] = service.deletePublicKey(params).promise().toFuture
    @inline def deleteStreamingDistributionFuture(params: DeleteStreamingDistributionRequest): Future[js.Object] = service.deleteStreamingDistribution(params).promise().toFuture
    @inline def getCachePolicyConfigFuture(params: GetCachePolicyConfigRequest): Future[GetCachePolicyConfigResult] = service.getCachePolicyConfig(params).promise().toFuture
    @inline def getCachePolicyFuture(params: GetCachePolicyRequest): Future[GetCachePolicyResult] = service.getCachePolicy(params).promise().toFuture
    @inline def getCloudFrontOriginAccessIdentityConfigFuture(params: GetCloudFrontOriginAccessIdentityConfigRequest): Future[GetCloudFrontOriginAccessIdentityConfigResult] = service.getCloudFrontOriginAccessIdentityConfig(params).promise().toFuture
    @inline def getCloudFrontOriginAccessIdentityFuture(params: GetCloudFrontOriginAccessIdentityRequest): Future[GetCloudFrontOriginAccessIdentityResult] = service.getCloudFrontOriginAccessIdentity(params).promise().toFuture
    @inline def getDistributionConfigFuture(params: GetDistributionConfigRequest): Future[GetDistributionConfigResult] = service.getDistributionConfig(params).promise().toFuture
    @inline def getDistributionFuture(params: GetDistributionRequest): Future[GetDistributionResult] = service.getDistribution(params).promise().toFuture
    @inline def getFieldLevelEncryptionConfigFuture(params: GetFieldLevelEncryptionConfigRequest): Future[GetFieldLevelEncryptionConfigResult] = service.getFieldLevelEncryptionConfig(params).promise().toFuture
    @inline def getFieldLevelEncryptionFuture(params: GetFieldLevelEncryptionRequest): Future[GetFieldLevelEncryptionResult] = service.getFieldLevelEncryption(params).promise().toFuture
    @inline def getFieldLevelEncryptionProfileConfigFuture(params: GetFieldLevelEncryptionProfileConfigRequest): Future[GetFieldLevelEncryptionProfileConfigResult] = service.getFieldLevelEncryptionProfileConfig(params).promise().toFuture
    @inline def getFieldLevelEncryptionProfileFuture(params: GetFieldLevelEncryptionProfileRequest): Future[GetFieldLevelEncryptionProfileResult] = service.getFieldLevelEncryptionProfile(params).promise().toFuture
    @inline def getInvalidationFuture(params: GetInvalidationRequest): Future[GetInvalidationResult] = service.getInvalidation(params).promise().toFuture
    @inline def getOriginRequestPolicyConfigFuture(params: GetOriginRequestPolicyConfigRequest): Future[GetOriginRequestPolicyConfigResult] = service.getOriginRequestPolicyConfig(params).promise().toFuture
    @inline def getOriginRequestPolicyFuture(params: GetOriginRequestPolicyRequest): Future[GetOriginRequestPolicyResult] = service.getOriginRequestPolicy(params).promise().toFuture
    @inline def getPublicKeyConfigFuture(params: GetPublicKeyConfigRequest): Future[GetPublicKeyConfigResult] = service.getPublicKeyConfig(params).promise().toFuture
    @inline def getPublicKeyFuture(params: GetPublicKeyRequest): Future[GetPublicKeyResult] = service.getPublicKey(params).promise().toFuture
    @inline def getStreamingDistributionConfigFuture(params: GetStreamingDistributionConfigRequest): Future[GetStreamingDistributionConfigResult] = service.getStreamingDistributionConfig(params).promise().toFuture
    @inline def getStreamingDistributionFuture(params: GetStreamingDistributionRequest): Future[GetStreamingDistributionResult] = service.getStreamingDistribution(params).promise().toFuture
    @inline def listCachePoliciesFuture(params: ListCachePoliciesRequest): Future[ListCachePoliciesResult] = service.listCachePolicies(params).promise().toFuture
    @inline def listCloudFrontOriginAccessIdentitiesFuture(params: ListCloudFrontOriginAccessIdentitiesRequest): Future[ListCloudFrontOriginAccessIdentitiesResult] = service.listCloudFrontOriginAccessIdentities(params).promise().toFuture
    @inline def listDistributionsByCachePolicyIdFuture(params: ListDistributionsByCachePolicyIdRequest): Future[ListDistributionsByCachePolicyIdResult] = service.listDistributionsByCachePolicyId(params).promise().toFuture
    @inline def listDistributionsByOriginRequestPolicyIdFuture(params: ListDistributionsByOriginRequestPolicyIdRequest): Future[ListDistributionsByOriginRequestPolicyIdResult] = service.listDistributionsByOriginRequestPolicyId(params).promise().toFuture
    @inline def listDistributionsByWebACLIdFuture(params: ListDistributionsByWebACLIdRequest): Future[ListDistributionsByWebACLIdResult] = service.listDistributionsByWebACLId(params).promise().toFuture
    @inline def listDistributionsFuture(params: ListDistributionsRequest): Future[ListDistributionsResult] = service.listDistributions(params).promise().toFuture
    @inline def listFieldLevelEncryptionConfigsFuture(params: ListFieldLevelEncryptionConfigsRequest): Future[ListFieldLevelEncryptionConfigsResult] = service.listFieldLevelEncryptionConfigs(params).promise().toFuture
    @inline def listFieldLevelEncryptionProfilesFuture(params: ListFieldLevelEncryptionProfilesRequest): Future[ListFieldLevelEncryptionProfilesResult] = service.listFieldLevelEncryptionProfiles(params).promise().toFuture
    @inline def listInvalidationsFuture(params: ListInvalidationsRequest): Future[ListInvalidationsResult] = service.listInvalidations(params).promise().toFuture
    @inline def listOriginRequestPoliciesFuture(params: ListOriginRequestPoliciesRequest): Future[ListOriginRequestPoliciesResult] = service.listOriginRequestPolicies(params).promise().toFuture
    @inline def listPublicKeysFuture(params: ListPublicKeysRequest): Future[ListPublicKeysResult] = service.listPublicKeys(params).promise().toFuture
    @inline def listStreamingDistributionsFuture(params: ListStreamingDistributionsRequest): Future[ListStreamingDistributionsResult] = service.listStreamingDistributions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateCachePolicyFuture(params: UpdateCachePolicyRequest): Future[UpdateCachePolicyResult] = service.updateCachePolicy(params).promise().toFuture
    @inline def updateCloudFrontOriginAccessIdentityFuture(params: UpdateCloudFrontOriginAccessIdentityRequest): Future[UpdateCloudFrontOriginAccessIdentityResult] = service.updateCloudFrontOriginAccessIdentity(params).promise().toFuture
    @inline def updateDistributionFuture(params: UpdateDistributionRequest): Future[UpdateDistributionResult] = service.updateDistribution(params).promise().toFuture
    @inline def updateFieldLevelEncryptionConfigFuture(params: UpdateFieldLevelEncryptionConfigRequest): Future[UpdateFieldLevelEncryptionConfigResult] = service.updateFieldLevelEncryptionConfig(params).promise().toFuture
    @inline def updateFieldLevelEncryptionProfileFuture(params: UpdateFieldLevelEncryptionProfileRequest): Future[UpdateFieldLevelEncryptionProfileResult] = service.updateFieldLevelEncryptionProfile(params).promise().toFuture
    @inline def updateOriginRequestPolicyFuture(params: UpdateOriginRequestPolicyRequest): Future[UpdateOriginRequestPolicyResult] = service.updateOriginRequestPolicy(params).promise().toFuture
    @inline def updatePublicKeyFuture(params: UpdatePublicKeyRequest): Future[UpdatePublicKeyResult] = service.updatePublicKey(params).promise().toFuture
    @inline def updateStreamingDistributionFuture(params: UpdateStreamingDistributionRequest): Future[UpdateStreamingDistributionResult] = service.updateStreamingDistribution(params).promise().toFuture
  }
}

package cloudfront {
  @js.native
  @JSImport("aws-sdk", "CloudFront", "AWS.CloudFront")
  class CloudFront() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCachePolicy(params: CreateCachePolicyRequest): Request[CreateCachePolicyResult] = js.native
    def createCloudFrontOriginAccessIdentity(params: CreateCloudFrontOriginAccessIdentityRequest): Request[CreateCloudFrontOriginAccessIdentityResult] = js.native
    def createDistribution(params: CreateDistributionRequest): Request[CreateDistributionResult] = js.native
    def createDistributionWithTags(params: CreateDistributionWithTagsRequest): Request[CreateDistributionWithTagsResult] = js.native
    def createFieldLevelEncryptionConfig(params: CreateFieldLevelEncryptionConfigRequest): Request[CreateFieldLevelEncryptionConfigResult] = js.native
    def createFieldLevelEncryptionProfile(params: CreateFieldLevelEncryptionProfileRequest): Request[CreateFieldLevelEncryptionProfileResult] = js.native
    def createInvalidation(params: CreateInvalidationRequest): Request[CreateInvalidationResult] = js.native
    def createOriginRequestPolicy(params: CreateOriginRequestPolicyRequest): Request[CreateOriginRequestPolicyResult] = js.native
    def createPublicKey(params: CreatePublicKeyRequest): Request[CreatePublicKeyResult] = js.native
    def createStreamingDistribution(params: CreateStreamingDistributionRequest): Request[CreateStreamingDistributionResult] = js.native
    def createStreamingDistributionWithTags(params: CreateStreamingDistributionWithTagsRequest): Request[CreateStreamingDistributionWithTagsResult] = js.native
    def deleteCachePolicy(params: DeleteCachePolicyRequest): Request[js.Object] = js.native
    def deleteCloudFrontOriginAccessIdentity(params: DeleteCloudFrontOriginAccessIdentityRequest): Request[js.Object] = js.native
    def deleteDistribution(params: DeleteDistributionRequest): Request[js.Object] = js.native
    def deleteFieldLevelEncryptionConfig(params: DeleteFieldLevelEncryptionConfigRequest): Request[js.Object] = js.native
    def deleteFieldLevelEncryptionProfile(params: DeleteFieldLevelEncryptionProfileRequest): Request[js.Object] = js.native
    def deleteOriginRequestPolicy(params: DeleteOriginRequestPolicyRequest): Request[js.Object] = js.native
    def deletePublicKey(params: DeletePublicKeyRequest): Request[js.Object] = js.native
    def deleteStreamingDistribution(params: DeleteStreamingDistributionRequest): Request[js.Object] = js.native
    def getCachePolicy(params: GetCachePolicyRequest): Request[GetCachePolicyResult] = js.native
    def getCachePolicyConfig(params: GetCachePolicyConfigRequest): Request[GetCachePolicyConfigResult] = js.native
    def getCloudFrontOriginAccessIdentity(params: GetCloudFrontOriginAccessIdentityRequest): Request[GetCloudFrontOriginAccessIdentityResult] = js.native
    def getCloudFrontOriginAccessIdentityConfig(params: GetCloudFrontOriginAccessIdentityConfigRequest): Request[GetCloudFrontOriginAccessIdentityConfigResult] = js.native
    def getDistribution(params: GetDistributionRequest): Request[GetDistributionResult] = js.native
    def getDistributionConfig(params: GetDistributionConfigRequest): Request[GetDistributionConfigResult] = js.native
    def getFieldLevelEncryption(params: GetFieldLevelEncryptionRequest): Request[GetFieldLevelEncryptionResult] = js.native
    def getFieldLevelEncryptionConfig(params: GetFieldLevelEncryptionConfigRequest): Request[GetFieldLevelEncryptionConfigResult] = js.native
    def getFieldLevelEncryptionProfile(params: GetFieldLevelEncryptionProfileRequest): Request[GetFieldLevelEncryptionProfileResult] = js.native
    def getFieldLevelEncryptionProfileConfig(params: GetFieldLevelEncryptionProfileConfigRequest): Request[GetFieldLevelEncryptionProfileConfigResult] = js.native
    def getInvalidation(params: GetInvalidationRequest): Request[GetInvalidationResult] = js.native
    def getOriginRequestPolicy(params: GetOriginRequestPolicyRequest): Request[GetOriginRequestPolicyResult] = js.native
    def getOriginRequestPolicyConfig(params: GetOriginRequestPolicyConfigRequest): Request[GetOriginRequestPolicyConfigResult] = js.native
    def getPublicKey(params: GetPublicKeyRequest): Request[GetPublicKeyResult] = js.native
    def getPublicKeyConfig(params: GetPublicKeyConfigRequest): Request[GetPublicKeyConfigResult] = js.native
    def getStreamingDistribution(params: GetStreamingDistributionRequest): Request[GetStreamingDistributionResult] = js.native
    def getStreamingDistributionConfig(params: GetStreamingDistributionConfigRequest): Request[GetStreamingDistributionConfigResult] = js.native
    def listCachePolicies(params: ListCachePoliciesRequest): Request[ListCachePoliciesResult] = js.native
    def listCloudFrontOriginAccessIdentities(params: ListCloudFrontOriginAccessIdentitiesRequest): Request[ListCloudFrontOriginAccessIdentitiesResult] = js.native
    def listDistributions(params: ListDistributionsRequest): Request[ListDistributionsResult] = js.native
    def listDistributionsByCachePolicyId(params: ListDistributionsByCachePolicyIdRequest): Request[ListDistributionsByCachePolicyIdResult] = js.native
    def listDistributionsByOriginRequestPolicyId(params: ListDistributionsByOriginRequestPolicyIdRequest): Request[ListDistributionsByOriginRequestPolicyIdResult] = js.native
    def listDistributionsByWebACLId(params: ListDistributionsByWebACLIdRequest): Request[ListDistributionsByWebACLIdResult] = js.native
    def listFieldLevelEncryptionConfigs(params: ListFieldLevelEncryptionConfigsRequest): Request[ListFieldLevelEncryptionConfigsResult] = js.native
    def listFieldLevelEncryptionProfiles(params: ListFieldLevelEncryptionProfilesRequest): Request[ListFieldLevelEncryptionProfilesResult] = js.native
    def listInvalidations(params: ListInvalidationsRequest): Request[ListInvalidationsResult] = js.native
    def listOriginRequestPolicies(params: ListOriginRequestPoliciesRequest): Request[ListOriginRequestPoliciesResult] = js.native
    def listPublicKeys(params: ListPublicKeysRequest): Request[ListPublicKeysResult] = js.native
    def listStreamingDistributions(params: ListStreamingDistributionsRequest): Request[ListStreamingDistributionsResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateCachePolicy(params: UpdateCachePolicyRequest): Request[UpdateCachePolicyResult] = js.native
    def updateCloudFrontOriginAccessIdentity(params: UpdateCloudFrontOriginAccessIdentityRequest): Request[UpdateCloudFrontOriginAccessIdentityResult] = js.native
    def updateDistribution(params: UpdateDistributionRequest): Request[UpdateDistributionResult] = js.native
    def updateFieldLevelEncryptionConfig(params: UpdateFieldLevelEncryptionConfigRequest): Request[UpdateFieldLevelEncryptionConfigResult] = js.native
    def updateFieldLevelEncryptionProfile(params: UpdateFieldLevelEncryptionProfileRequest): Request[UpdateFieldLevelEncryptionProfileResult] = js.native
    def updateOriginRequestPolicy(params: UpdateOriginRequestPolicyRequest): Request[UpdateOriginRequestPolicyResult] = js.native
    def updatePublicKey(params: UpdatePublicKeyRequest): Request[UpdatePublicKeyResult] = js.native
    def updateStreamingDistribution(params: UpdateStreamingDistributionRequest): Request[UpdateStreamingDistributionResult] = js.native
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
    @inline
    def apply(
        Enabled: Boolean,
        Quantity: Int,
        Items: js.UndefOr[SignerList] = js.undefined
    ): ActiveTrustedSigners = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CNAME: js.UndefOr[String] = js.undefined,
        ICPRecordalStatus: js.UndefOr[ICPRecordalStatus] = js.undefined
    ): AliasICPRecordal = {
      val __obj = js.Dynamic.literal()
      CNAME.foreach(__v => __obj.updateDynamic("CNAME")(__v.asInstanceOf[js.Any]))
      ICPRecordalStatus.foreach(__v => __obj.updateDynamic("ICPRecordalStatus")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[AliasList] = js.undefined
    ): Aliases = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Items: MethodsList,
        Quantity: Int,
        CachedMethods: js.UndefOr[CachedMethods] = js.undefined
    ): AllowedMethods = {
      val __obj = js.Dynamic.literal(
        "Items" -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      CachedMethods.foreach(__v => __obj.updateDynamic("CachedMethods")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AllowedMethods]
    }
  }

  /**
    * A complex type that describes how CloudFront processes requests.
    *  You must create at least as many cache behaviors (including the default cache behavior) as you have origins if you want CloudFront to serve objects from all of the origins. Each cache behavior specifies the one origin from which you want CloudFront to get objects. If you have two origins and only the default cache behavior, the default cache behavior will cause CloudFront to get objects from one of the origins, but the other origin is never used.
    *  For the current quota (formerly known as limit) on the number of cache behaviors that you can add to a distribution, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html|Quotas]] in the <i>Amazon CloudFront Developer Guide</i>.
    *  If you don’t want to specify any cache behaviors, include only an empty <code>CacheBehaviors</code> element. Don’t include an empty <code>CacheBehavior</code> element because this is invalid.
    *  To delete all cache behaviors in an existing distribution, update the distribution configuration and include only an empty <code>CacheBehaviors</code> element.
    *  To add, change, or remove one or more cache behaviors, update the distribution configuration and specify all of the cache behaviors that you want to include in the updated distribution.
    *  For more information about cache behaviors, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior|Cache Behavior Settings]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait CacheBehavior extends js.Object {
    var PathPattern: String
    var TargetOriginId: String
    var TrustedSigners: TrustedSigners
    var ViewerProtocolPolicy: ViewerProtocolPolicy
    var AllowedMethods: js.UndefOr[AllowedMethods]
    var CachePolicyId: js.UndefOr[String]
    var Compress: js.UndefOr[Boolean]
    var DefaultTTL: js.UndefOr[Double]
    var FieldLevelEncryptionId: js.UndefOr[String]
    var ForwardedValues: js.UndefOr[ForwardedValues]
    var LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations]
    var MaxTTL: js.UndefOr[Double]
    var MinTTL: js.UndefOr[Double]
    var OriginRequestPolicyId: js.UndefOr[String]
    var SmoothStreaming: js.UndefOr[Boolean]
  }

  object CacheBehavior {
    @inline
    def apply(
        PathPattern: String,
        TargetOriginId: String,
        TrustedSigners: TrustedSigners,
        ViewerProtocolPolicy: ViewerProtocolPolicy,
        AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
        CachePolicyId: js.UndefOr[String] = js.undefined,
        Compress: js.UndefOr[Boolean] = js.undefined,
        DefaultTTL: js.UndefOr[Double] = js.undefined,
        FieldLevelEncryptionId: js.UndefOr[String] = js.undefined,
        ForwardedValues: js.UndefOr[ForwardedValues] = js.undefined,
        LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations] = js.undefined,
        MaxTTL: js.UndefOr[Double] = js.undefined,
        MinTTL: js.UndefOr[Double] = js.undefined,
        OriginRequestPolicyId: js.UndefOr[String] = js.undefined,
        SmoothStreaming: js.UndefOr[Boolean] = js.undefined
    ): CacheBehavior = {
      val __obj = js.Dynamic.literal(
        "PathPattern" -> PathPattern.asInstanceOf[js.Any],
        "TargetOriginId" -> TargetOriginId.asInstanceOf[js.Any],
        "TrustedSigners" -> TrustedSigners.asInstanceOf[js.Any],
        "ViewerProtocolPolicy" -> ViewerProtocolPolicy.asInstanceOf[js.Any]
      )

      AllowedMethods.foreach(__v => __obj.updateDynamic("AllowedMethods")(__v.asInstanceOf[js.Any]))
      CachePolicyId.foreach(__v => __obj.updateDynamic("CachePolicyId")(__v.asInstanceOf[js.Any]))
      Compress.foreach(__v => __obj.updateDynamic("Compress")(__v.asInstanceOf[js.Any]))
      DefaultTTL.foreach(__v => __obj.updateDynamic("DefaultTTL")(__v.asInstanceOf[js.Any]))
      FieldLevelEncryptionId.foreach(__v => __obj.updateDynamic("FieldLevelEncryptionId")(__v.asInstanceOf[js.Any]))
      ForwardedValues.foreach(__v => __obj.updateDynamic("ForwardedValues")(__v.asInstanceOf[js.Any]))
      LambdaFunctionAssociations.foreach(__v => __obj.updateDynamic("LambdaFunctionAssociations")(__v.asInstanceOf[js.Any]))
      MaxTTL.foreach(__v => __obj.updateDynamic("MaxTTL")(__v.asInstanceOf[js.Any]))
      MinTTL.foreach(__v => __obj.updateDynamic("MinTTL")(__v.asInstanceOf[js.Any]))
      OriginRequestPolicyId.foreach(__v => __obj.updateDynamic("OriginRequestPolicyId")(__v.asInstanceOf[js.Any]))
      SmoothStreaming.foreach(__v => __obj.updateDynamic("SmoothStreaming")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[CacheBehaviorList] = js.undefined
    ): CacheBehaviors = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CacheBehaviors]
    }
  }

  /**
    * A cache policy.
    *  When it’s attached to a cache behavior, the cache policy determines the following:
    * * The values that CloudFront includes in the cache key. These values can include HTTP headers, cookies, and URL query strings. CloudFront uses the cache key to find an object in its cache that it can return to the viewer.
    *  * The default, minimum, and maximum time to live (TTL) values that you want objects to stay in the CloudFront cache.
    * The headers, cookies, and query strings that are included in the cache key are automatically included in requests that CloudFront sends to the origin. CloudFront sends a request when it can’t find a valid object in its cache that matches the request’s cache key. If you want to send values to the origin but <i>not</i> include them in the cache key, use <code>OriginRequestPolicy</code>.
    */
  @js.native
  trait CachePolicy extends js.Object {
    var CachePolicyConfig: CachePolicyConfig
    var Id: String
    var LastModifiedTime: timestamp
  }

  object CachePolicy {
    @inline
    def apply(
        CachePolicyConfig: CachePolicyConfig,
        Id: String,
        LastModifiedTime: timestamp
    ): CachePolicy = {
      val __obj = js.Dynamic.literal(
        "CachePolicyConfig" -> CachePolicyConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CachePolicy]
    }
  }

  /**
    * A cache policy configuration.
    *  This configuration determines the following:
    * * The values that CloudFront includes in the cache key. These values can include HTTP headers, cookies, and URL query strings. CloudFront uses the cache key to find an object in its cache that it can return to the viewer.
    *  * The default, minimum, and maximum time to live (TTL) values that you want objects to stay in the CloudFront cache.
    * The headers, cookies, and query strings that are included in the cache key are automatically included in requests that CloudFront sends to the origin. CloudFront sends a request when it can’t find a valid object in its cache that matches the request’s cache key. If you want to send values to the origin but <i>not</i> include them in the cache key, use <code>OriginRequestPolicy</code>.
    */
  @js.native
  trait CachePolicyConfig extends js.Object {
    var MinTTL: Double
    var Name: String
    var Comment: js.UndefOr[String]
    var DefaultTTL: js.UndefOr[Double]
    var MaxTTL: js.UndefOr[Double]
    var ParametersInCacheKeyAndForwardedToOrigin: js.UndefOr[ParametersInCacheKeyAndForwardedToOrigin]
  }

  object CachePolicyConfig {
    @inline
    def apply(
        MinTTL: Double,
        Name: String,
        Comment: js.UndefOr[String] = js.undefined,
        DefaultTTL: js.UndefOr[Double] = js.undefined,
        MaxTTL: js.UndefOr[Double] = js.undefined,
        ParametersInCacheKeyAndForwardedToOrigin: js.UndefOr[ParametersInCacheKeyAndForwardedToOrigin] = js.undefined
    ): CachePolicyConfig = {
      val __obj = js.Dynamic.literal(
        "MinTTL" -> MinTTL.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      DefaultTTL.foreach(__v => __obj.updateDynamic("DefaultTTL")(__v.asInstanceOf[js.Any]))
      MaxTTL.foreach(__v => __obj.updateDynamic("MaxTTL")(__v.asInstanceOf[js.Any]))
      ParametersInCacheKeyAndForwardedToOrigin.foreach(__v => __obj.updateDynamic("ParametersInCacheKeyAndForwardedToOrigin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CachePolicyConfig]
    }
  }

  @js.native
  sealed trait CachePolicyCookieBehavior extends js.Any
  object CachePolicyCookieBehavior {
    @inline def none = "none".asInstanceOf[CachePolicyCookieBehavior]
    @inline def whitelist = "whitelist".asInstanceOf[CachePolicyCookieBehavior]
    @inline def allExcept = "allExcept".asInstanceOf[CachePolicyCookieBehavior]
    @inline def all = "all".asInstanceOf[CachePolicyCookieBehavior]

    @inline def values = js.Object.freeze(js.Array(none, whitelist, allExcept, all))
  }

  /**
    * An object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache key and automatically included in requests that CloudFront sends to the origin.
    */
  @js.native
  trait CachePolicyCookiesConfig extends js.Object {
    var CookieBehavior: CachePolicyCookieBehavior
    var Cookies: js.UndefOr[CookieNames]
  }

  object CachePolicyCookiesConfig {
    @inline
    def apply(
        CookieBehavior: CachePolicyCookieBehavior,
        Cookies: js.UndefOr[CookieNames] = js.undefined
    ): CachePolicyCookiesConfig = {
      val __obj = js.Dynamic.literal(
        "CookieBehavior" -> CookieBehavior.asInstanceOf[js.Any]
      )

      Cookies.foreach(__v => __obj.updateDynamic("Cookies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CachePolicyCookiesConfig]
    }
  }

  @js.native
  sealed trait CachePolicyHeaderBehavior extends js.Any
  object CachePolicyHeaderBehavior {
    @inline def none = "none".asInstanceOf[CachePolicyHeaderBehavior]
    @inline def whitelist = "whitelist".asInstanceOf[CachePolicyHeaderBehavior]

    @inline def values = js.Object.freeze(js.Array(none, whitelist))
  }

  /**
    * An object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and automatically included in requests that CloudFront sends to the origin.
    */
  @js.native
  trait CachePolicyHeadersConfig extends js.Object {
    var HeaderBehavior: CachePolicyHeaderBehavior
    var Headers: js.UndefOr[Headers]
  }

  object CachePolicyHeadersConfig {
    @inline
    def apply(
        HeaderBehavior: CachePolicyHeaderBehavior,
        Headers: js.UndefOr[Headers] = js.undefined
    ): CachePolicyHeadersConfig = {
      val __obj = js.Dynamic.literal(
        "HeaderBehavior" -> HeaderBehavior.asInstanceOf[js.Any]
      )

      Headers.foreach(__v => __obj.updateDynamic("Headers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CachePolicyHeadersConfig]
    }
  }

  /**
    * A list of cache policies.
    */
  @js.native
  trait CachePolicyList extends js.Object {
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[CachePolicySummaryList]
    var NextMarker: js.UndefOr[String]
  }

  object CachePolicyList {
    @inline
    def apply(
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[CachePolicySummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): CachePolicyList = {
      val __obj = js.Dynamic.literal(
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CachePolicyList]
    }
  }

  @js.native
  sealed trait CachePolicyQueryStringBehavior extends js.Any
  object CachePolicyQueryStringBehavior {
    @inline def none = "none".asInstanceOf[CachePolicyQueryStringBehavior]
    @inline def whitelist = "whitelist".asInstanceOf[CachePolicyQueryStringBehavior]
    @inline def allExcept = "allExcept".asInstanceOf[CachePolicyQueryStringBehavior]
    @inline def all = "all".asInstanceOf[CachePolicyQueryStringBehavior]

    @inline def values = js.Object.freeze(js.Array(none, whitelist, allExcept, all))
  }

  /**
    * An object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the cache key and automatically included in requests that CloudFront sends to the origin.
    */
  @js.native
  trait CachePolicyQueryStringsConfig extends js.Object {
    var QueryStringBehavior: CachePolicyQueryStringBehavior
    var QueryStrings: js.UndefOr[QueryStringNames]
  }

  object CachePolicyQueryStringsConfig {
    @inline
    def apply(
        QueryStringBehavior: CachePolicyQueryStringBehavior,
        QueryStrings: js.UndefOr[QueryStringNames] = js.undefined
    ): CachePolicyQueryStringsConfig = {
      val __obj = js.Dynamic.literal(
        "QueryStringBehavior" -> QueryStringBehavior.asInstanceOf[js.Any]
      )

      QueryStrings.foreach(__v => __obj.updateDynamic("QueryStrings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CachePolicyQueryStringsConfig]
    }
  }

  /**
    * Contains a cache policy.
    */
  @js.native
  trait CachePolicySummary extends js.Object {
    var CachePolicy: CachePolicy
    var Type: CachePolicyType
  }

  object CachePolicySummary {
    @inline
    def apply(
        CachePolicy: CachePolicy,
        Type: CachePolicyType
    ): CachePolicySummary = {
      val __obj = js.Dynamic.literal(
        "CachePolicy" -> CachePolicy.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CachePolicySummary]
    }
  }

  @js.native
  sealed trait CachePolicyType extends js.Any
  object CachePolicyType {
    @inline def managed = "managed".asInstanceOf[CachePolicyType]
    @inline def custom = "custom".asInstanceOf[CachePolicyType]

    @inline def values = js.Object.freeze(js.Array(managed, custom))
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
    @inline
    def apply(
        Items: MethodsList,
        Quantity: Int
    ): CachedMethods = {
      val __obj = js.Dynamic.literal(
        "Items" -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CachedMethods]
    }
  }

  @js.native
  sealed trait CertificateSource extends js.Any
  object CertificateSource {
    @inline def cloudfront = "cloudfront".asInstanceOf[CertificateSource]
    @inline def iam = "iam".asInstanceOf[CertificateSource]
    @inline def acm = "acm".asInstanceOf[CertificateSource]

    @inline def values = js.Object.freeze(js.Array(cloudfront, iam, acm))
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
    @inline
    def apply(
        Id: String,
        S3CanonicalUserId: String,
        CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined
    ): CloudFrontOriginAccessIdentity = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "S3CanonicalUserId" -> S3CanonicalUserId.asInstanceOf[js.Any]
      )

      CloudFrontOriginAccessIdentityConfig.foreach(__v => __obj.updateDynamic("CloudFrontOriginAccessIdentityConfig")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CallerReference: String,
        Comment: String
    ): CloudFrontOriginAccessIdentityConfig = {
      val __obj = js.Dynamic.literal(
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Comment" -> Comment.asInstanceOf[js.Any]
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
    @inline
    def apply(
        IsTruncated: Boolean,
        Marker: String,
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[CloudFrontOriginAccessIdentitySummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): CloudFrontOriginAccessIdentityList = {
      val __obj = js.Dynamic.literal(
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker" -> Marker.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Comment: String,
        Id: String,
        S3CanonicalUserId: String
    ): CloudFrontOriginAccessIdentitySummary = {
      val __obj = js.Dynamic.literal(
        "Comment" -> Comment.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
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
    @inline
    def apply(
        ContentType: String,
        Format: Format,
        ProfileId: js.UndefOr[String] = js.undefined
    ): ContentTypeProfile = {
      val __obj = js.Dynamic.literal(
        "ContentType" -> ContentType.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any]
      )

      ProfileId.foreach(__v => __obj.updateDynamic("ProfileId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ForwardWhenContentTypeIsUnknown: Boolean,
        ContentTypeProfiles: js.UndefOr[ContentTypeProfiles] = js.undefined
    ): ContentTypeProfileConfig = {
      val __obj = js.Dynamic.literal(
        "ForwardWhenContentTypeIsUnknown" -> ForwardWhenContentTypeIsUnknown.asInstanceOf[js.Any]
      )

      ContentTypeProfiles.foreach(__v => __obj.updateDynamic("ContentTypeProfiles")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[ContentTypeProfileList] = js.undefined
    ): ContentTypeProfiles = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContentTypeProfiles]
    }
  }

  /**
    * Contains a list of cookie names.
    */
  @js.native
  trait CookieNames extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[CookieNameList]
  }

  object CookieNames {
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[CookieNameList] = js.undefined
    ): CookieNames = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CookieNames]
    }
  }

  /**
    * This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of this field.
    *  If you want to include cookies in the cache key, use <code>CookiesConfig</code> in a cache policy. See <code>CreateCachePolicy</code>.
    *  If you want to send cookies to the origin but not include them in the cache key, use <code>CookiesConfig</code> in an origin request policy. See <code>CreateOriginRequestPolicy</code>.
    *  A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones. For more information about forwarding cookies to the origin, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html|Caching Content Based on Cookies]] in the <i>Amazon CloudFront Developer Guide</i>.
    */
  @js.native
  trait CookiePreference extends js.Object {
    var Forward: ItemSelection
    var WhitelistedNames: js.UndefOr[CookieNames]
  }

  object CookiePreference {
    @inline
    def apply(
        Forward: ItemSelection,
        WhitelistedNames: js.UndefOr[CookieNames] = js.undefined
    ): CookiePreference = {
      val __obj = js.Dynamic.literal(
        "Forward" -> Forward.asInstanceOf[js.Any]
      )

      WhitelistedNames.foreach(__v => __obj.updateDynamic("WhitelistedNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CookiePreference]
    }
  }

  @js.native
  trait CreateCachePolicyRequest extends js.Object {
    var CachePolicyConfig: CachePolicyConfig
  }

  object CreateCachePolicyRequest {
    @inline
    def apply(
        CachePolicyConfig: CachePolicyConfig
    ): CreateCachePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "CachePolicyConfig" -> CachePolicyConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCachePolicyRequest]
    }
  }

  @js.native
  trait CreateCachePolicyResult extends js.Object {
    var CachePolicy: js.UndefOr[CachePolicy]
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
  }

  object CreateCachePolicyResult {
    @inline
    def apply(
        CachePolicy: js.UndefOr[CachePolicy] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateCachePolicyResult = {
      val __obj = js.Dynamic.literal()
      CachePolicy.foreach(__v => __obj.updateDynamic("CachePolicy")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCachePolicyResult]
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
    @inline
    def apply(
        CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig
    ): CreateCloudFrontOriginAccessIdentityRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateCloudFrontOriginAccessIdentityResult = {
      val __obj = js.Dynamic.literal()
      CloudFrontOriginAccessIdentity.foreach(__v => __obj.updateDynamic("CloudFrontOriginAccessIdentity")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DistributionConfig: DistributionConfig
    ): CreateDistributionRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Distribution: js.UndefOr[Distribution] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateDistributionResult = {
      val __obj = js.Dynamic.literal()
      Distribution.foreach(__v => __obj.updateDynamic("Distribution")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DistributionConfigWithTags: DistributionConfigWithTags
    ): CreateDistributionWithTagsRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Distribution: js.UndefOr[Distribution] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateDistributionWithTagsResult = {
      val __obj = js.Dynamic.literal()
      Distribution.foreach(__v => __obj.updateDynamic("Distribution")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDistributionWithTagsResult]
    }
  }

  @js.native
  trait CreateFieldLevelEncryptionConfigRequest extends js.Object {
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
  }

  object CreateFieldLevelEncryptionConfigRequest {
    @inline
    def apply(
        FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
    ): CreateFieldLevelEncryptionConfigRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateFieldLevelEncryptionConfigResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      FieldLevelEncryption.foreach(__v => __obj.updateDynamic("FieldLevelEncryption")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFieldLevelEncryptionConfigResult]
    }
  }

  @js.native
  trait CreateFieldLevelEncryptionProfileRequest extends js.Object {
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
  }

  object CreateFieldLevelEncryptionProfileRequest {
    @inline
    def apply(
        FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
    ): CreateFieldLevelEncryptionProfileRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateFieldLevelEncryptionProfileResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      FieldLevelEncryptionProfile.foreach(__v => __obj.updateDynamic("FieldLevelEncryptionProfile")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DistributionId: String,
        InvalidationBatch: InvalidationBatch
    ): CreateInvalidationRequest = {
      val __obj = js.Dynamic.literal(
        "DistributionId" -> DistributionId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        Invalidation: js.UndefOr[Invalidation] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): CreateInvalidationResult = {
      val __obj = js.Dynamic.literal()
      Invalidation.foreach(__v => __obj.updateDynamic("Invalidation")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInvalidationResult]
    }
  }

  @js.native
  trait CreateOriginRequestPolicyRequest extends js.Object {
    var OriginRequestPolicyConfig: OriginRequestPolicyConfig
  }

  object CreateOriginRequestPolicyRequest {
    @inline
    def apply(
        OriginRequestPolicyConfig: OriginRequestPolicyConfig
    ): CreateOriginRequestPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "OriginRequestPolicyConfig" -> OriginRequestPolicyConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateOriginRequestPolicyRequest]
    }
  }

  @js.native
  trait CreateOriginRequestPolicyResult extends js.Object {
    var ETag: js.UndefOr[String]
    var Location: js.UndefOr[String]
    var OriginRequestPolicy: js.UndefOr[OriginRequestPolicy]
  }

  object CreateOriginRequestPolicyResult {
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined,
        OriginRequestPolicy: js.UndefOr[OriginRequestPolicy] = js.undefined
    ): CreateOriginRequestPolicyResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      OriginRequestPolicy.foreach(__v => __obj.updateDynamic("OriginRequestPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOriginRequestPolicyResult]
    }
  }

  @js.native
  trait CreatePublicKeyRequest extends js.Object {
    var PublicKeyConfig: PublicKeyConfig
  }

  object CreatePublicKeyRequest {
    @inline
    def apply(
        PublicKeyConfig: PublicKeyConfig
    ): CreatePublicKeyRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined,
        PublicKey: js.UndefOr[PublicKey] = js.undefined
    ): CreatePublicKeyResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.updateDynamic("PublicKey")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        StreamingDistributionConfig: StreamingDistributionConfig
    ): CreateStreamingDistributionRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined,
        StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
    ): CreateStreamingDistributionResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      StreamingDistribution.foreach(__v => __obj.updateDynamic("StreamingDistribution")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        StreamingDistributionConfigWithTags: StreamingDistributionConfigWithTags
    ): CreateStreamingDistributionWithTagsRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined,
        StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
    ): CreateStreamingDistributionWithTagsResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      StreamingDistribution.foreach(__v => __obj.updateDynamic("StreamingDistribution")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ErrorCode: Int,
        ErrorCachingMinTTL: js.UndefOr[Double] = js.undefined,
        ResponseCode: js.UndefOr[String] = js.undefined,
        ResponsePagePath: js.UndefOr[String] = js.undefined
    ): CustomErrorResponse = {
      val __obj = js.Dynamic.literal(
        "ErrorCode" -> ErrorCode.asInstanceOf[js.Any]
      )

      ErrorCachingMinTTL.foreach(__v => __obj.updateDynamic("ErrorCachingMinTTL")(__v.asInstanceOf[js.Any]))
      ResponseCode.foreach(__v => __obj.updateDynamic("ResponseCode")(__v.asInstanceOf[js.Any]))
      ResponsePagePath.foreach(__v => __obj.updateDynamic("ResponsePagePath")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[CustomErrorResponseList] = js.undefined
    ): CustomErrorResponses = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[OriginCustomHeadersList] = js.undefined
    ): CustomHeaders = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomHeaders]
    }
  }

  /**
    * A custom origin. A custom origin is any origin that is <i>not</i> an Amazon S3 bucket, with one exception. An Amazon S3 bucket that is [[https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html|configured with static website hosting]] <i>is</i> a custom origin.
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
    @inline
    def apply(
        HTTPPort: Int,
        HTTPSPort: Int,
        OriginProtocolPolicy: OriginProtocolPolicy,
        OriginKeepaliveTimeout: js.UndefOr[Int] = js.undefined,
        OriginReadTimeout: js.UndefOr[Int] = js.undefined,
        OriginSslProtocols: js.UndefOr[OriginSslProtocols] = js.undefined
    ): CustomOriginConfig = {
      val __obj = js.Dynamic.literal(
        "HTTPPort" -> HTTPPort.asInstanceOf[js.Any],
        "HTTPSPort" -> HTTPSPort.asInstanceOf[js.Any],
        "OriginProtocolPolicy" -> OriginProtocolPolicy.asInstanceOf[js.Any]
      )

      OriginKeepaliveTimeout.foreach(__v => __obj.updateDynamic("OriginKeepaliveTimeout")(__v.asInstanceOf[js.Any]))
      OriginReadTimeout.foreach(__v => __obj.updateDynamic("OriginReadTimeout")(__v.asInstanceOf[js.Any]))
      OriginSslProtocols.foreach(__v => __obj.updateDynamic("OriginSslProtocols")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomOriginConfig]
    }
  }

  /**
    * A complex type that describes the default cache behavior if you don’t specify a <code>CacheBehavior</code> element or if request URLs don’t match any of the values of <code>PathPattern</code> in <code>CacheBehavior</code> elements. You must create exactly one default cache behavior.
    */
  @js.native
  trait DefaultCacheBehavior extends js.Object {
    var TargetOriginId: String
    var TrustedSigners: TrustedSigners
    var ViewerProtocolPolicy: ViewerProtocolPolicy
    var AllowedMethods: js.UndefOr[AllowedMethods]
    var CachePolicyId: js.UndefOr[String]
    var Compress: js.UndefOr[Boolean]
    var DefaultTTL: js.UndefOr[Double]
    var FieldLevelEncryptionId: js.UndefOr[String]
    var ForwardedValues: js.UndefOr[ForwardedValues]
    var LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations]
    var MaxTTL: js.UndefOr[Double]
    var MinTTL: js.UndefOr[Double]
    var OriginRequestPolicyId: js.UndefOr[String]
    var SmoothStreaming: js.UndefOr[Boolean]
  }

  object DefaultCacheBehavior {
    @inline
    def apply(
        TargetOriginId: String,
        TrustedSigners: TrustedSigners,
        ViewerProtocolPolicy: ViewerProtocolPolicy,
        AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
        CachePolicyId: js.UndefOr[String] = js.undefined,
        Compress: js.UndefOr[Boolean] = js.undefined,
        DefaultTTL: js.UndefOr[Double] = js.undefined,
        FieldLevelEncryptionId: js.UndefOr[String] = js.undefined,
        ForwardedValues: js.UndefOr[ForwardedValues] = js.undefined,
        LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations] = js.undefined,
        MaxTTL: js.UndefOr[Double] = js.undefined,
        MinTTL: js.UndefOr[Double] = js.undefined,
        OriginRequestPolicyId: js.UndefOr[String] = js.undefined,
        SmoothStreaming: js.UndefOr[Boolean] = js.undefined
    ): DefaultCacheBehavior = {
      val __obj = js.Dynamic.literal(
        "TargetOriginId" -> TargetOriginId.asInstanceOf[js.Any],
        "TrustedSigners" -> TrustedSigners.asInstanceOf[js.Any],
        "ViewerProtocolPolicy" -> ViewerProtocolPolicy.asInstanceOf[js.Any]
      )

      AllowedMethods.foreach(__v => __obj.updateDynamic("AllowedMethods")(__v.asInstanceOf[js.Any]))
      CachePolicyId.foreach(__v => __obj.updateDynamic("CachePolicyId")(__v.asInstanceOf[js.Any]))
      Compress.foreach(__v => __obj.updateDynamic("Compress")(__v.asInstanceOf[js.Any]))
      DefaultTTL.foreach(__v => __obj.updateDynamic("DefaultTTL")(__v.asInstanceOf[js.Any]))
      FieldLevelEncryptionId.foreach(__v => __obj.updateDynamic("FieldLevelEncryptionId")(__v.asInstanceOf[js.Any]))
      ForwardedValues.foreach(__v => __obj.updateDynamic("ForwardedValues")(__v.asInstanceOf[js.Any]))
      LambdaFunctionAssociations.foreach(__v => __obj.updateDynamic("LambdaFunctionAssociations")(__v.asInstanceOf[js.Any]))
      MaxTTL.foreach(__v => __obj.updateDynamic("MaxTTL")(__v.asInstanceOf[js.Any]))
      MinTTL.foreach(__v => __obj.updateDynamic("MinTTL")(__v.asInstanceOf[js.Any]))
      OriginRequestPolicyId.foreach(__v => __obj.updateDynamic("OriginRequestPolicyId")(__v.asInstanceOf[js.Any]))
      SmoothStreaming.foreach(__v => __obj.updateDynamic("SmoothStreaming")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultCacheBehavior]
    }
  }

  @js.native
  trait DeleteCachePolicyRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object DeleteCachePolicyRequest {
    @inline
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeleteCachePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCachePolicyRequest]
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
    @inline
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeleteCloudFrontOriginAccessIdentityRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeleteDistributionRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDistributionRequest]
    }
  }

  @js.native
  trait DeleteFieldLevelEncryptionConfigRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object DeleteFieldLevelEncryptionConfigRequest {
    @inline
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeleteFieldLevelEncryptionConfigRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFieldLevelEncryptionConfigRequest]
    }
  }

  @js.native
  trait DeleteFieldLevelEncryptionProfileRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object DeleteFieldLevelEncryptionProfileRequest {
    @inline
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeleteFieldLevelEncryptionProfileRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFieldLevelEncryptionProfileRequest]
    }
  }

  @js.native
  trait DeleteOriginRequestPolicyRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object DeleteOriginRequestPolicyRequest {
    @inline
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeleteOriginRequestPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteOriginRequestPolicyRequest]
    }
  }

  @js.native
  trait DeletePublicKeyRequest extends js.Object {
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object DeletePublicKeyRequest {
    @inline
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeletePublicKeyRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): DeleteStreamingDistributionRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "ActiveTrustedSigners" -> ActiveTrustedSigners.asInstanceOf[js.Any],
        "DistributionConfig" -> DistributionConfig.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "InProgressInvalidationBatches" -> InProgressInvalidationBatches.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      AliasICPRecordals.foreach(__v => __obj.updateDynamic("AliasICPRecordals")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Comment" -> Comment.asInstanceOf[js.Any],
        "DefaultCacheBehavior" -> DefaultCacheBehavior.asInstanceOf[js.Any],
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "Origins" -> Origins.asInstanceOf[js.Any]
      )

      Aliases.foreach(__v => __obj.updateDynamic("Aliases")(__v.asInstanceOf[js.Any]))
      CacheBehaviors.foreach(__v => __obj.updateDynamic("CacheBehaviors")(__v.asInstanceOf[js.Any]))
      CustomErrorResponses.foreach(__v => __obj.updateDynamic("CustomErrorResponses")(__v.asInstanceOf[js.Any]))
      DefaultRootObject.foreach(__v => __obj.updateDynamic("DefaultRootObject")(__v.asInstanceOf[js.Any]))
      HttpVersion.foreach(__v => __obj.updateDynamic("HttpVersion")(__v.asInstanceOf[js.Any]))
      IsIPV6Enabled.foreach(__v => __obj.updateDynamic("IsIPV6Enabled")(__v.asInstanceOf[js.Any]))
      Logging.foreach(__v => __obj.updateDynamic("Logging")(__v.asInstanceOf[js.Any]))
      OriginGroups.foreach(__v => __obj.updateDynamic("OriginGroups")(__v.asInstanceOf[js.Any]))
      PriceClass.foreach(__v => __obj.updateDynamic("PriceClass")(__v.asInstanceOf[js.Any]))
      Restrictions.foreach(__v => __obj.updateDynamic("Restrictions")(__v.asInstanceOf[js.Any]))
      ViewerCertificate.foreach(__v => __obj.updateDynamic("ViewerCertificate")(__v.asInstanceOf[js.Any]))
      WebACLId.foreach(__v => __obj.updateDynamic("WebACLId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DistributionConfig: DistributionConfig,
        Tags: Tags
    ): DistributionConfigWithTags = {
      val __obj = js.Dynamic.literal(
        "DistributionConfig" -> DistributionConfig.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DistributionConfigWithTags]
    }
  }

  /**
    * A list of distribution IDs.
    */
  @js.native
  trait DistributionIdList extends js.Object {
    var IsTruncated: Boolean
    var Marker: String
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[DistributionIdListSummary]
    var NextMarker: js.UndefOr[String]
  }

  object DistributionIdList {
    @inline
    def apply(
        IsTruncated: Boolean,
        Marker: String,
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[DistributionIdListSummary] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): DistributionIdList = {
      val __obj = js.Dynamic.literal(
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker" -> Marker.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DistributionIdList]
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
    @inline
    def apply(
        IsTruncated: Boolean,
        Marker: String,
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[DistributionSummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): DistributionList = {
      val __obj = js.Dynamic.literal(
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker" -> Marker.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "Aliases" -> Aliases.asInstanceOf[js.Any],
        "CacheBehaviors" -> CacheBehaviors.asInstanceOf[js.Any],
        "Comment" -> Comment.asInstanceOf[js.Any],
        "CustomErrorResponses" -> CustomErrorResponses.asInstanceOf[js.Any],
        "DefaultCacheBehavior" -> DefaultCacheBehavior.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "HttpVersion" -> HttpVersion.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "IsIPV6Enabled" -> IsIPV6Enabled.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "Origins" -> Origins.asInstanceOf[js.Any],
        "PriceClass" -> PriceClass.asInstanceOf[js.Any],
        "Restrictions" -> Restrictions.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "ViewerCertificate" -> ViewerCertificate.asInstanceOf[js.Any],
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]
      )

      AliasICPRecordals.foreach(__v => __obj.updateDynamic("AliasICPRecordals")(__v.asInstanceOf[js.Any]))
      OriginGroups.foreach(__v => __obj.updateDynamic("OriginGroups")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[EncryptionEntityList] = js.undefined
    ): EncryptionEntities = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        FieldPatterns: FieldPatterns,
        ProviderId: String,
        PublicKeyId: String
    ): EncryptionEntity = {
      val __obj = js.Dynamic.literal(
        "FieldPatterns" -> FieldPatterns.asInstanceOf[js.Any],
        "ProviderId" -> ProviderId.asInstanceOf[js.Any],
        "PublicKeyId" -> PublicKeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EncryptionEntity]
    }
  }

  @js.native
  sealed trait EventType extends js.Any
  object EventType {
    @inline def `viewer-request` = "viewer-request".asInstanceOf[EventType]
    @inline def `viewer-response` = "viewer-response".asInstanceOf[EventType]
    @inline def `origin-request` = "origin-request".asInstanceOf[EventType]
    @inline def `origin-response` = "origin-response".asInstanceOf[EventType]

    @inline def values = js.Object.freeze(js.Array(`viewer-request`, `viewer-response`, `origin-request`, `origin-response`))
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
    @inline
    def apply(
        FieldLevelEncryptionConfig: FieldLevelEncryptionConfig,
        Id: String,
        LastModifiedTime: timestamp
    ): FieldLevelEncryption = {
      val __obj = js.Dynamic.literal(
        "FieldLevelEncryptionConfig" -> FieldLevelEncryptionConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
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
    @inline
    def apply(
        CallerReference: String,
        Comment: js.UndefOr[String] = js.undefined,
        ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig] = js.undefined,
        QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig] = js.undefined
    ): FieldLevelEncryptionConfig = {
      val __obj = js.Dynamic.literal(
        "CallerReference" -> CallerReference.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      ContentTypeProfileConfig.foreach(__v => __obj.updateDynamic("ContentTypeProfileConfig")(__v.asInstanceOf[js.Any]))
      QueryArgProfileConfig.foreach(__v => __obj.updateDynamic("QueryArgProfileConfig")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[FieldLevelEncryptionSummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): FieldLevelEncryptionList = {
      val __obj = js.Dynamic.literal(
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig,
        Id: String,
        LastModifiedTime: timestamp
    ): FieldLevelEncryptionProfile = {
      val __obj = js.Dynamic.literal(
        "FieldLevelEncryptionProfileConfig" -> FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
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
    @inline
    def apply(
        CallerReference: String,
        EncryptionEntities: EncryptionEntities,
        Name: String,
        Comment: js.UndefOr[String] = js.undefined
    ): FieldLevelEncryptionProfileConfig = {
      val __obj = js.Dynamic.literal(
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "EncryptionEntities" -> EncryptionEntities.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[FieldLevelEncryptionProfileSummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): FieldLevelEncryptionProfileList = {
      val __obj = js.Dynamic.literal(
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        EncryptionEntities: EncryptionEntities,
        Id: String,
        LastModifiedTime: timestamp,
        Name: String,
        Comment: js.UndefOr[String] = js.undefined
    ): FieldLevelEncryptionProfileSummary = {
      val __obj = js.Dynamic.literal(
        "EncryptionEntities" -> EncryptionEntities.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Id: String,
        LastModifiedTime: timestamp,
        Comment: js.UndefOr[String] = js.undefined,
        ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig] = js.undefined,
        QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig] = js.undefined
    ): FieldLevelEncryptionSummary = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      ContentTypeProfileConfig.foreach(__v => __obj.updateDynamic("ContentTypeProfileConfig")(__v.asInstanceOf[js.Any]))
      QueryArgProfileConfig.foreach(__v => __obj.updateDynamic("QueryArgProfileConfig")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[FieldPatternList] = js.undefined
    ): FieldPatterns = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldPatterns]
    }
  }

  @js.native
  sealed trait Format extends js.Any
  object Format {
    @inline def URLEncoded = "URLEncoded".asInstanceOf[Format]

    @inline def values = js.Object.freeze(js.Array(URLEncoded))
  }

  /**
    * This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of this field.
    *  If you want to include values in the cache key, use a <code>CachePolicy</code>. See <code>CreateCachePolicy</code>.
    *  If you want to send values to the origin but not include them in the cache key, use an <code>OriginRequestPolicy</code>. See <code>CreateOriginRequestPolicy</code>.
    *  A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
    */
  @js.native
  trait ForwardedValues extends js.Object {
    var Cookies: CookiePreference
    var QueryString: Boolean
    var Headers: js.UndefOr[Headers]
    var QueryStringCacheKeys: js.UndefOr[QueryStringCacheKeys]
  }

  object ForwardedValues {
    @inline
    def apply(
        Cookies: CookiePreference,
        QueryString: Boolean,
        Headers: js.UndefOr[Headers] = js.undefined,
        QueryStringCacheKeys: js.UndefOr[QueryStringCacheKeys] = js.undefined
    ): ForwardedValues = {
      val __obj = js.Dynamic.literal(
        "Cookies" -> Cookies.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      Headers.foreach(__v => __obj.updateDynamic("Headers")(__v.asInstanceOf[js.Any]))
      QueryStringCacheKeys.foreach(__v => __obj.updateDynamic("QueryStringCacheKeys")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Quantity: Int,
        RestrictionType: GeoRestrictionType,
        Items: js.UndefOr[LocationList] = js.undefined
    ): GeoRestriction = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "RestrictionType" -> RestrictionType.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeoRestriction]
    }
  }

  @js.native
  sealed trait GeoRestrictionType extends js.Any
  object GeoRestrictionType {
    @inline def blacklist = "blacklist".asInstanceOf[GeoRestrictionType]
    @inline def whitelist = "whitelist".asInstanceOf[GeoRestrictionType]
    @inline def none = "none".asInstanceOf[GeoRestrictionType]

    @inline def values = js.Object.freeze(js.Array(blacklist, whitelist, none))
  }

  @js.native
  trait GetCachePolicyConfigRequest extends js.Object {
    var Id: String
  }

  object GetCachePolicyConfigRequest {
    @inline
    def apply(
        Id: String
    ): GetCachePolicyConfigRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCachePolicyConfigRequest]
    }
  }

  @js.native
  trait GetCachePolicyConfigResult extends js.Object {
    var CachePolicyConfig: js.UndefOr[CachePolicyConfig]
    var ETag: js.UndefOr[String]
  }

  object GetCachePolicyConfigResult {
    @inline
    def apply(
        CachePolicyConfig: js.UndefOr[CachePolicyConfig] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): GetCachePolicyConfigResult = {
      val __obj = js.Dynamic.literal()
      CachePolicyConfig.foreach(__v => __obj.updateDynamic("CachePolicyConfig")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCachePolicyConfigResult]
    }
  }

  @js.native
  trait GetCachePolicyRequest extends js.Object {
    var Id: String
  }

  object GetCachePolicyRequest {
    @inline
    def apply(
        Id: String
    ): GetCachePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCachePolicyRequest]
    }
  }

  @js.native
  trait GetCachePolicyResult extends js.Object {
    var CachePolicy: js.UndefOr[CachePolicy]
    var ETag: js.UndefOr[String]
  }

  object GetCachePolicyResult {
    @inline
    def apply(
        CachePolicy: js.UndefOr[CachePolicy] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): GetCachePolicyResult = {
      val __obj = js.Dynamic.literal()
      CachePolicy.foreach(__v => __obj.updateDynamic("CachePolicy")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCachePolicyResult]
    }
  }

  /**
    * The origin access identity's configuration information. For more information, see [[https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CloudFrontOriginAccessIdentityConfig.html|CloudFrontOriginAccessIdentityConfig]].
    */
  @js.native
  trait GetCloudFrontOriginAccessIdentityConfigRequest extends js.Object {
    var Id: String
  }

  object GetCloudFrontOriginAccessIdentityConfigRequest {
    @inline
    def apply(
        Id: String
    ): GetCloudFrontOriginAccessIdentityConfigRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): GetCloudFrontOriginAccessIdentityConfigResult = {
      val __obj = js.Dynamic.literal()
      CloudFrontOriginAccessIdentityConfig.foreach(__v => __obj.updateDynamic("CloudFrontOriginAccessIdentityConfig")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Id: String
    ): GetCloudFrontOriginAccessIdentityRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): GetCloudFrontOriginAccessIdentityResult = {
      val __obj = js.Dynamic.literal()
      CloudFrontOriginAccessIdentity.foreach(__v => __obj.updateDynamic("CloudFrontOriginAccessIdentity")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Id: String
    ): GetDistributionConfigRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        DistributionConfig: js.UndefOr[DistributionConfig] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): GetDistributionConfigResult = {
      val __obj = js.Dynamic.literal()
      DistributionConfig.foreach(__v => __obj.updateDynamic("DistributionConfig")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Id: String
    ): GetDistributionRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Distribution: js.UndefOr[Distribution] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): GetDistributionResult = {
      val __obj = js.Dynamic.literal()
      Distribution.foreach(__v => __obj.updateDynamic("Distribution")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDistributionResult]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionConfigRequest extends js.Object {
    var Id: String
  }

  object GetFieldLevelEncryptionConfigRequest {
    @inline
    def apply(
        Id: String
    ): GetFieldLevelEncryptionConfigRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryptionConfig: js.UndefOr[FieldLevelEncryptionConfig] = js.undefined
    ): GetFieldLevelEncryptionConfigResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      FieldLevelEncryptionConfig.foreach(__v => __obj.updateDynamic("FieldLevelEncryptionConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFieldLevelEncryptionConfigResult]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionProfileConfigRequest extends js.Object {
    var Id: String
  }

  object GetFieldLevelEncryptionProfileConfigRequest {
    @inline
    def apply(
        Id: String
    ): GetFieldLevelEncryptionProfileConfigRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryptionProfileConfig: js.UndefOr[FieldLevelEncryptionProfileConfig] = js.undefined
    ): GetFieldLevelEncryptionProfileConfigResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      FieldLevelEncryptionProfileConfig.foreach(__v => __obj.updateDynamic("FieldLevelEncryptionProfileConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFieldLevelEncryptionProfileConfigResult]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionProfileRequest extends js.Object {
    var Id: String
  }

  object GetFieldLevelEncryptionProfileRequest {
    @inline
    def apply(
        Id: String
    ): GetFieldLevelEncryptionProfileRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined
    ): GetFieldLevelEncryptionProfileResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      FieldLevelEncryptionProfile.foreach(__v => __obj.updateDynamic("FieldLevelEncryptionProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFieldLevelEncryptionProfileResult]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionRequest extends js.Object {
    var Id: String
  }

  object GetFieldLevelEncryptionRequest {
    @inline
    def apply(
        Id: String
    ): GetFieldLevelEncryptionRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined
    ): GetFieldLevelEncryptionResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      FieldLevelEncryption.foreach(__v => __obj.updateDynamic("FieldLevelEncryption")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DistributionId: String,
        Id: String
    ): GetInvalidationRequest = {
      val __obj = js.Dynamic.literal(
        "DistributionId" -> DistributionId.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
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
    @inline
    def apply(
        Invalidation: js.UndefOr[Invalidation] = js.undefined
    ): GetInvalidationResult = {
      val __obj = js.Dynamic.literal()
      Invalidation.foreach(__v => __obj.updateDynamic("Invalidation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInvalidationResult]
    }
  }

  @js.native
  trait GetOriginRequestPolicyConfigRequest extends js.Object {
    var Id: String
  }

  object GetOriginRequestPolicyConfigRequest {
    @inline
    def apply(
        Id: String
    ): GetOriginRequestPolicyConfigRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetOriginRequestPolicyConfigRequest]
    }
  }

  @js.native
  trait GetOriginRequestPolicyConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var OriginRequestPolicyConfig: js.UndefOr[OriginRequestPolicyConfig]
  }

  object GetOriginRequestPolicyConfigResult {
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        OriginRequestPolicyConfig: js.UndefOr[OriginRequestPolicyConfig] = js.undefined
    ): GetOriginRequestPolicyConfigResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      OriginRequestPolicyConfig.foreach(__v => __obj.updateDynamic("OriginRequestPolicyConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOriginRequestPolicyConfigResult]
    }
  }

  @js.native
  trait GetOriginRequestPolicyRequest extends js.Object {
    var Id: String
  }

  object GetOriginRequestPolicyRequest {
    @inline
    def apply(
        Id: String
    ): GetOriginRequestPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetOriginRequestPolicyRequest]
    }
  }

  @js.native
  trait GetOriginRequestPolicyResult extends js.Object {
    var ETag: js.UndefOr[String]
    var OriginRequestPolicy: js.UndefOr[OriginRequestPolicy]
  }

  object GetOriginRequestPolicyResult {
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        OriginRequestPolicy: js.UndefOr[OriginRequestPolicy] = js.undefined
    ): GetOriginRequestPolicyResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      OriginRequestPolicy.foreach(__v => __obj.updateDynamic("OriginRequestPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOriginRequestPolicyResult]
    }
  }

  @js.native
  trait GetPublicKeyConfigRequest extends js.Object {
    var Id: String
  }

  object GetPublicKeyConfigRequest {
    @inline
    def apply(
        Id: String
    ): GetPublicKeyConfigRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        PublicKeyConfig: js.UndefOr[PublicKeyConfig] = js.undefined
    ): GetPublicKeyConfigResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      PublicKeyConfig.foreach(__v => __obj.updateDynamic("PublicKeyConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPublicKeyConfigResult]
    }
  }

  @js.native
  trait GetPublicKeyRequest extends js.Object {
    var Id: String
  }

  object GetPublicKeyRequest {
    @inline
    def apply(
        Id: String
    ): GetPublicKeyRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        PublicKey: js.UndefOr[PublicKey] = js.undefined
    ): GetPublicKeyResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.updateDynamic("PublicKey")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Id: String
    ): GetStreamingDistributionConfigRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig] = js.undefined
    ): GetStreamingDistributionConfigResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      StreamingDistributionConfig.foreach(__v => __obj.updateDynamic("StreamingDistributionConfig")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Id: String
    ): GetStreamingDistributionRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
    ): GetStreamingDistributionResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      StreamingDistribution.foreach(__v => __obj.updateDynamic("StreamingDistribution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStreamingDistributionResult]
    }
  }

  /**
    * Contains a list of HTTP header names.
    */
  @js.native
  trait Headers extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[HeaderList]
  }

  object Headers {
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[HeaderList] = js.undefined
    ): Headers = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Headers]
    }
  }

  @js.native
  sealed trait HttpVersion extends js.Any
  object HttpVersion {
    @inline def `http1.1` = "http1.1".asInstanceOf[HttpVersion]
    @inline def http2 = "http2".asInstanceOf[HttpVersion]

    @inline def values = js.Object.freeze(js.Array(`http1.1`, http2))
  }

  @js.native
  sealed trait ICPRecordalStatus extends js.Any
  object ICPRecordalStatus {
    @inline def APPROVED = "APPROVED".asInstanceOf[ICPRecordalStatus]
    @inline def SUSPENDED = "SUSPENDED".asInstanceOf[ICPRecordalStatus]
    @inline def PENDING = "PENDING".asInstanceOf[ICPRecordalStatus]

    @inline def values = js.Object.freeze(js.Array(APPROVED, SUSPENDED, PENDING))
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
    @inline
    def apply(
        CreateTime: timestamp,
        Id: String,
        InvalidationBatch: InvalidationBatch,
        Status: String
    ): Invalidation = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "InvalidationBatch" -> InvalidationBatch.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
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
    @inline
    def apply(
        CallerReference: String,
        Paths: Paths
    ): InvalidationBatch = {
      val __obj = js.Dynamic.literal(
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Paths" -> Paths.asInstanceOf[js.Any]
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
    @inline
    def apply(
        IsTruncated: Boolean,
        Marker: String,
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[InvalidationSummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): InvalidationList = {
      val __obj = js.Dynamic.literal(
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker" -> Marker.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CreateTime: timestamp,
        Id: String,
        Status: String
    ): InvalidationSummary = {
      val __obj = js.Dynamic.literal(
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InvalidationSummary]
    }
  }

  @js.native
  sealed trait ItemSelection extends js.Any
  object ItemSelection {
    @inline def none = "none".asInstanceOf[ItemSelection]
    @inline def whitelist = "whitelist".asInstanceOf[ItemSelection]
    @inline def all = "all".asInstanceOf[ItemSelection]

    @inline def values = js.Object.freeze(js.Array(none, whitelist, all))
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
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[KeyPairIdList] = js.undefined
    ): KeyPairIds = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        EventType: EventType,
        LambdaFunctionARN: LambdaFunctionARN,
        IncludeBody: js.UndefOr[Boolean] = js.undefined
    ): LambdaFunctionAssociation = {
      val __obj = js.Dynamic.literal(
        "EventType" -> EventType.asInstanceOf[js.Any],
        "LambdaFunctionARN" -> LambdaFunctionARN.asInstanceOf[js.Any]
      )

      IncludeBody.foreach(__v => __obj.updateDynamic("IncludeBody")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[LambdaFunctionAssociationList] = js.undefined
    ): LambdaFunctionAssociations = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionAssociations]
    }
  }

  @js.native
  trait ListCachePoliciesRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
    var Type: js.UndefOr[CachePolicyType]
  }

  object ListCachePoliciesRequest {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[CachePolicyType] = js.undefined
    ): ListCachePoliciesRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCachePoliciesRequest]
    }
  }

  @js.native
  trait ListCachePoliciesResult extends js.Object {
    var CachePolicyList: js.UndefOr[CachePolicyList]
  }

  object ListCachePoliciesResult {
    @inline
    def apply(
        CachePolicyList: js.UndefOr[CachePolicyList] = js.undefined
    ): ListCachePoliciesResult = {
      val __obj = js.Dynamic.literal()
      CachePolicyList.foreach(__v => __obj.updateDynamic("CachePolicyList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCachePoliciesResult]
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
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListCloudFrontOriginAccessIdentitiesRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CloudFrontOriginAccessIdentityList: js.UndefOr[CloudFrontOriginAccessIdentityList] = js.undefined
    ): ListCloudFrontOriginAccessIdentitiesResult = {
      val __obj = js.Dynamic.literal()
      CloudFrontOriginAccessIdentityList.foreach(__v => __obj.updateDynamic("CloudFrontOriginAccessIdentityList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCloudFrontOriginAccessIdentitiesResult]
    }
  }

  @js.native
  trait ListDistributionsByCachePolicyIdRequest extends js.Object {
    var CachePolicyId: String
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListDistributionsByCachePolicyIdRequest {
    @inline
    def apply(
        CachePolicyId: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListDistributionsByCachePolicyIdRequest = {
      val __obj = js.Dynamic.literal(
        "CachePolicyId" -> CachePolicyId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributionsByCachePolicyIdRequest]
    }
  }

  @js.native
  trait ListDistributionsByCachePolicyIdResult extends js.Object {
    var DistributionIdList: js.UndefOr[DistributionIdList]
  }

  object ListDistributionsByCachePolicyIdResult {
    @inline
    def apply(
        DistributionIdList: js.UndefOr[DistributionIdList] = js.undefined
    ): ListDistributionsByCachePolicyIdResult = {
      val __obj = js.Dynamic.literal()
      DistributionIdList.foreach(__v => __obj.updateDynamic("DistributionIdList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributionsByCachePolicyIdResult]
    }
  }

  @js.native
  trait ListDistributionsByOriginRequestPolicyIdRequest extends js.Object {
    var OriginRequestPolicyId: String
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListDistributionsByOriginRequestPolicyIdRequest {
    @inline
    def apply(
        OriginRequestPolicyId: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListDistributionsByOriginRequestPolicyIdRequest = {
      val __obj = js.Dynamic.literal(
        "OriginRequestPolicyId" -> OriginRequestPolicyId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributionsByOriginRequestPolicyIdRequest]
    }
  }

  @js.native
  trait ListDistributionsByOriginRequestPolicyIdResult extends js.Object {
    var DistributionIdList: js.UndefOr[DistributionIdList]
  }

  object ListDistributionsByOriginRequestPolicyIdResult {
    @inline
    def apply(
        DistributionIdList: js.UndefOr[DistributionIdList] = js.undefined
    ): ListDistributionsByOriginRequestPolicyIdResult = {
      val __obj = js.Dynamic.literal()
      DistributionIdList.foreach(__v => __obj.updateDynamic("DistributionIdList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributionsByOriginRequestPolicyIdResult]
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
    @inline
    def apply(
        WebACLId: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListDistributionsByWebACLIdRequest = {
      val __obj = js.Dynamic.literal(
        "WebACLId" -> WebACLId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DistributionList: js.UndefOr[DistributionList] = js.undefined
    ): ListDistributionsByWebACLIdResult = {
      val __obj = js.Dynamic.literal()
      DistributionList.foreach(__v => __obj.updateDynamic("DistributionList")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListDistributionsRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DistributionList: js.UndefOr[DistributionList] = js.undefined
    ): ListDistributionsResult = {
      val __obj = js.Dynamic.literal()
      DistributionList.foreach(__v => __obj.updateDynamic("DistributionList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributionsResult]
    }
  }

  @js.native
  trait ListFieldLevelEncryptionConfigsRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListFieldLevelEncryptionConfigsRequest {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListFieldLevelEncryptionConfigsRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFieldLevelEncryptionConfigsRequest]
    }
  }

  @js.native
  trait ListFieldLevelEncryptionConfigsResult extends js.Object {
    var FieldLevelEncryptionList: js.UndefOr[FieldLevelEncryptionList]
  }

  object ListFieldLevelEncryptionConfigsResult {
    @inline
    def apply(
        FieldLevelEncryptionList: js.UndefOr[FieldLevelEncryptionList] = js.undefined
    ): ListFieldLevelEncryptionConfigsResult = {
      val __obj = js.Dynamic.literal()
      FieldLevelEncryptionList.foreach(__v => __obj.updateDynamic("FieldLevelEncryptionList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFieldLevelEncryptionConfigsResult]
    }
  }

  @js.native
  trait ListFieldLevelEncryptionProfilesRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListFieldLevelEncryptionProfilesRequest {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListFieldLevelEncryptionProfilesRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFieldLevelEncryptionProfilesRequest]
    }
  }

  @js.native
  trait ListFieldLevelEncryptionProfilesResult extends js.Object {
    var FieldLevelEncryptionProfileList: js.UndefOr[FieldLevelEncryptionProfileList]
  }

  object ListFieldLevelEncryptionProfilesResult {
    @inline
    def apply(
        FieldLevelEncryptionProfileList: js.UndefOr[FieldLevelEncryptionProfileList] = js.undefined
    ): ListFieldLevelEncryptionProfilesResult = {
      val __obj = js.Dynamic.literal()
      FieldLevelEncryptionProfileList.foreach(__v => __obj.updateDynamic("FieldLevelEncryptionProfileList")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DistributionId: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListInvalidationsRequest = {
      val __obj = js.Dynamic.literal(
        "DistributionId" -> DistributionId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        InvalidationList: js.UndefOr[InvalidationList] = js.undefined
    ): ListInvalidationsResult = {
      val __obj = js.Dynamic.literal()
      InvalidationList.foreach(__v => __obj.updateDynamic("InvalidationList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvalidationsResult]
    }
  }

  @js.native
  trait ListOriginRequestPoliciesRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
    var Type: js.UndefOr[OriginRequestPolicyType]
  }

  object ListOriginRequestPoliciesRequest {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[OriginRequestPolicyType] = js.undefined
    ): ListOriginRequestPoliciesRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOriginRequestPoliciesRequest]
    }
  }

  @js.native
  trait ListOriginRequestPoliciesResult extends js.Object {
    var OriginRequestPolicyList: js.UndefOr[OriginRequestPolicyList]
  }

  object ListOriginRequestPoliciesResult {
    @inline
    def apply(
        OriginRequestPolicyList: js.UndefOr[OriginRequestPolicyList] = js.undefined
    ): ListOriginRequestPoliciesResult = {
      val __obj = js.Dynamic.literal()
      OriginRequestPolicyList.foreach(__v => __obj.updateDynamic("OriginRequestPolicyList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOriginRequestPoliciesResult]
    }
  }

  @js.native
  trait ListPublicKeysRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[String]
  }

  object ListPublicKeysRequest {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListPublicKeysRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPublicKeysRequest]
    }
  }

  @js.native
  trait ListPublicKeysResult extends js.Object {
    var PublicKeyList: js.UndefOr[PublicKeyList]
  }

  object ListPublicKeysResult {
    @inline
    def apply(
        PublicKeyList: js.UndefOr[PublicKeyList] = js.undefined
    ): ListPublicKeysResult = {
      val __obj = js.Dynamic.literal()
      PublicKeyList.foreach(__v => __obj.updateDynamic("PublicKeyList")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[String] = js.undefined
    ): ListStreamingDistributionsRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        StreamingDistributionList: js.UndefOr[StreamingDistributionList] = js.undefined
    ): ListStreamingDistributionsResult = {
      val __obj = js.Dynamic.literal()
      StreamingDistributionList.foreach(__v => __obj.updateDynamic("StreamingDistributionList")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Resource: ResourceARN
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Tags: Tags
    ): ListTagsForResourceResult = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Bucket: String,
        Enabled: Boolean,
        IncludeCookies: Boolean,
        Prefix: String
    ): LoggingConfig = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "IncludeCookies" -> IncludeCookies.asInstanceOf[js.Any],
        "Prefix" -> Prefix.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LoggingConfig]
    }
  }

  @js.native
  sealed trait Method extends js.Any
  object Method {
    @inline def GET = "GET".asInstanceOf[Method]
    @inline def HEAD = "HEAD".asInstanceOf[Method]
    @inline def POST = "POST".asInstanceOf[Method]
    @inline def PUT = "PUT".asInstanceOf[Method]
    @inline def PATCH = "PATCH".asInstanceOf[Method]
    @inline def OPTIONS = "OPTIONS".asInstanceOf[Method]
    @inline def DELETE = "DELETE".asInstanceOf[Method]

    @inline def values = js.Object.freeze(js.Array(GET, HEAD, POST, PUT, PATCH, OPTIONS, DELETE))
  }

  @js.native
  sealed trait MinimumProtocolVersion extends js.Any
  object MinimumProtocolVersion {
    @inline def SSLv3 = "SSLv3".asInstanceOf[MinimumProtocolVersion]
    @inline def TLSv1 = "TLSv1".asInstanceOf[MinimumProtocolVersion]
    @inline def TLSv1_2016 = "TLSv1_2016".asInstanceOf[MinimumProtocolVersion]
    @inline def `TLSv1.1_2016` = "TLSv1.1_2016".asInstanceOf[MinimumProtocolVersion]
    @inline def `TLSv1.2_2018` = "TLSv1.2_2018".asInstanceOf[MinimumProtocolVersion]
    @inline def `TLSv1.2_2019` = "TLSv1.2_2019".asInstanceOf[MinimumProtocolVersion]

    @inline def values = js.Object.freeze(js.Array(SSLv3, TLSv1, TLSv1_2016, `TLSv1.1_2016`, `TLSv1.2_2018`, `TLSv1.2_2019`))
  }

  /**
    * An origin.
    *  An origin is the location where content is stored, and from which CloudFront gets content to serve to viewers. To specify an origin:
    * * Use the <code>S3OriginConfig</code> type to specify an Amazon S3 bucket that is <i> ```not``` </i> configured with static website hosting.
    *  * Use the <code>CustomOriginConfig</code> type to specify various other kinds of content containers or HTTP servers, including:
    * <li> An Amazon S3 bucket that is configured with static website hosting
    *  * An Elastic Load Balancing load balancer
    *  * An AWS Elemental MediaPackage origin
    *  * An AWS Elemental MediaStore container
    *  * Any other HTTP server, running on an Amazon EC2 instance or any other kind of host
    * </li>For the current maximum number of origins that you can specify per distribution, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html#limits-web-distributions|General Quotas on Web Distributions]] in the <i>Amazon CloudFront Developer Guide</i> (quotas were formerly referred to as limits).
    */
  @js.native
  trait Origin extends js.Object {
    var DomainName: String
    var Id: String
    var ConnectionAttempts: js.UndefOr[Int]
    var ConnectionTimeout: js.UndefOr[Int]
    var CustomHeaders: js.UndefOr[CustomHeaders]
    var CustomOriginConfig: js.UndefOr[CustomOriginConfig]
    var OriginPath: js.UndefOr[String]
    var S3OriginConfig: js.UndefOr[S3OriginConfig]
  }

  object Origin {
    @inline
    def apply(
        DomainName: String,
        Id: String,
        ConnectionAttempts: js.UndefOr[Int] = js.undefined,
        ConnectionTimeout: js.UndefOr[Int] = js.undefined,
        CustomHeaders: js.UndefOr[CustomHeaders] = js.undefined,
        CustomOriginConfig: js.UndefOr[CustomOriginConfig] = js.undefined,
        OriginPath: js.UndefOr[String] = js.undefined,
        S3OriginConfig: js.UndefOr[S3OriginConfig] = js.undefined
    ): Origin = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      ConnectionAttempts.foreach(__v => __obj.updateDynamic("ConnectionAttempts")(__v.asInstanceOf[js.Any]))
      ConnectionTimeout.foreach(__v => __obj.updateDynamic("ConnectionTimeout")(__v.asInstanceOf[js.Any]))
      CustomHeaders.foreach(__v => __obj.updateDynamic("CustomHeaders")(__v.asInstanceOf[js.Any]))
      CustomOriginConfig.foreach(__v => __obj.updateDynamic("CustomOriginConfig")(__v.asInstanceOf[js.Any]))
      OriginPath.foreach(__v => __obj.updateDynamic("OriginPath")(__v.asInstanceOf[js.Any]))
      S3OriginConfig.foreach(__v => __obj.updateDynamic("S3OriginConfig")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        HeaderName: String,
        HeaderValue: String
    ): OriginCustomHeader = {
      val __obj = js.Dynamic.literal(
        "HeaderName" -> HeaderName.asInstanceOf[js.Any],
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
    @inline
    def apply(
        FailoverCriteria: OriginGroupFailoverCriteria,
        Id: String,
        Members: OriginGroupMembers
    ): OriginGroup = {
      val __obj = js.Dynamic.literal(
        "FailoverCriteria" -> FailoverCriteria.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Members" -> Members.asInstanceOf[js.Any]
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
    @inline
    def apply(
        StatusCodes: StatusCodes
    ): OriginGroupFailoverCriteria = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        OriginId: String
    ): OriginGroupMember = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Items: OriginGroupMemberList,
        Quantity: Int
    ): OriginGroupMembers = {
      val __obj = js.Dynamic.literal(
        "Items" -> Items.asInstanceOf[js.Any],
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
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[OriginGroupList] = js.undefined
    ): OriginGroups = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OriginGroups]
    }
  }

  @js.native
  sealed trait OriginProtocolPolicy extends js.Any
  object OriginProtocolPolicy {
    @inline def `http-only` = "http-only".asInstanceOf[OriginProtocolPolicy]
    @inline def `match-viewer` = "match-viewer".asInstanceOf[OriginProtocolPolicy]
    @inline def `https-only` = "https-only".asInstanceOf[OriginProtocolPolicy]

    @inline def values = js.Object.freeze(js.Array(`http-only`, `match-viewer`, `https-only`))
  }

  /**
    * An origin request policy.
    *  When it’s attached to a cache behavior, the origin request policy determines the values that CloudFront includes in requests that it sends to the origin. Each request that CloudFront sends to the origin includes the following:
    * * The request body and the URL path (without the domain name) from the viewer request.
    *  * The headers that CloudFront automatically includes in every origin request, including <code>Host</code>, <code>User-Agent</code>, and <code>X-Amz-Cf-Id</code>.
    *  * All HTTP headers, cookies, and URL query strings that are specified in the cache policy or the origin request policy. These can include items from the viewer request and, in the case of headers, additional ones that are added by CloudFront.
    * CloudFront sends a request when it can’t find an object in its cache that matches the request. If you want to send values to the origin and also include them in the cache key, use <code>CreateCachePolicy</code>.
    */
  @js.native
  trait OriginRequestPolicy extends js.Object {
    var Id: String
    var LastModifiedTime: timestamp
    var OriginRequestPolicyConfig: OriginRequestPolicyConfig
  }

  object OriginRequestPolicy {
    @inline
    def apply(
        Id: String,
        LastModifiedTime: timestamp,
        OriginRequestPolicyConfig: OriginRequestPolicyConfig
    ): OriginRequestPolicy = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "OriginRequestPolicyConfig" -> OriginRequestPolicyConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OriginRequestPolicy]
    }
  }

  /**
    * An origin request policy configuration.
    *  This configuration determines the values that CloudFront includes in requests that it sends to the origin. Each request that CloudFront sends to the origin includes the following:
    * * The request body and the URL path (without the domain name) from the viewer request.
    *  * The headers that CloudFront automatically includes in every origin request, including <code>Host</code>, <code>User-Agent</code>, and <code>X-Amz-Cf-Id</code>.
    *  * All HTTP headers, cookies, and URL query strings that are specified in the cache policy or the origin request policy. These can include items from the viewer request and, in the case of headers, additional ones that are added by CloudFront.
    * CloudFront sends a request when it can’t find an object in its cache that matches the request. If you want to send values to the origin and also include them in the cache key, use <code>CreateCachePolicy</code>.
    */
  @js.native
  trait OriginRequestPolicyConfig extends js.Object {
    var CookiesConfig: OriginRequestPolicyCookiesConfig
    var HeadersConfig: OriginRequestPolicyHeadersConfig
    var Name: String
    var QueryStringsConfig: OriginRequestPolicyQueryStringsConfig
    var Comment: js.UndefOr[String]
  }

  object OriginRequestPolicyConfig {
    @inline
    def apply(
        CookiesConfig: OriginRequestPolicyCookiesConfig,
        HeadersConfig: OriginRequestPolicyHeadersConfig,
        Name: String,
        QueryStringsConfig: OriginRequestPolicyQueryStringsConfig,
        Comment: js.UndefOr[String] = js.undefined
    ): OriginRequestPolicyConfig = {
      val __obj = js.Dynamic.literal(
        "CookiesConfig" -> CookiesConfig.asInstanceOf[js.Any],
        "HeadersConfig" -> HeadersConfig.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "QueryStringsConfig" -> QueryStringsConfig.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OriginRequestPolicyConfig]
    }
  }

  @js.native
  sealed trait OriginRequestPolicyCookieBehavior extends js.Any
  object OriginRequestPolicyCookieBehavior {
    @inline def none = "none".asInstanceOf[OriginRequestPolicyCookieBehavior]
    @inline def whitelist = "whitelist".asInstanceOf[OriginRequestPolicyCookieBehavior]
    @inline def all = "all".asInstanceOf[OriginRequestPolicyCookieBehavior]

    @inline def values = js.Object.freeze(js.Array(none, whitelist, all))
  }

  /**
    * An object that determines whether any cookies in viewer requests (and if so, which cookies) are included in requests that CloudFront sends to the origin.
    */
  @js.native
  trait OriginRequestPolicyCookiesConfig extends js.Object {
    var CookieBehavior: OriginRequestPolicyCookieBehavior
    var Cookies: js.UndefOr[CookieNames]
  }

  object OriginRequestPolicyCookiesConfig {
    @inline
    def apply(
        CookieBehavior: OriginRequestPolicyCookieBehavior,
        Cookies: js.UndefOr[CookieNames] = js.undefined
    ): OriginRequestPolicyCookiesConfig = {
      val __obj = js.Dynamic.literal(
        "CookieBehavior" -> CookieBehavior.asInstanceOf[js.Any]
      )

      Cookies.foreach(__v => __obj.updateDynamic("Cookies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OriginRequestPolicyCookiesConfig]
    }
  }

  @js.native
  sealed trait OriginRequestPolicyHeaderBehavior extends js.Any
  object OriginRequestPolicyHeaderBehavior {
    @inline def none = "none".asInstanceOf[OriginRequestPolicyHeaderBehavior]
    @inline def whitelist = "whitelist".asInstanceOf[OriginRequestPolicyHeaderBehavior]
    @inline def allViewer = "allViewer".asInstanceOf[OriginRequestPolicyHeaderBehavior]
    @inline def allViewerAndWhitelistCloudFront = "allViewerAndWhitelistCloudFront".asInstanceOf[OriginRequestPolicyHeaderBehavior]

    @inline def values = js.Object.freeze(js.Array(none, whitelist, allViewer, allViewerAndWhitelistCloudFront))
  }

  /**
    * An object that determines whether any HTTP headers (and if so, which headers) are included in requests that CloudFront sends to the origin.
    */
  @js.native
  trait OriginRequestPolicyHeadersConfig extends js.Object {
    var HeaderBehavior: OriginRequestPolicyHeaderBehavior
    var Headers: js.UndefOr[Headers]
  }

  object OriginRequestPolicyHeadersConfig {
    @inline
    def apply(
        HeaderBehavior: OriginRequestPolicyHeaderBehavior,
        Headers: js.UndefOr[Headers] = js.undefined
    ): OriginRequestPolicyHeadersConfig = {
      val __obj = js.Dynamic.literal(
        "HeaderBehavior" -> HeaderBehavior.asInstanceOf[js.Any]
      )

      Headers.foreach(__v => __obj.updateDynamic("Headers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OriginRequestPolicyHeadersConfig]
    }
  }

  /**
    * A list of origin request policies.
    */
  @js.native
  trait OriginRequestPolicyList extends js.Object {
    var MaxItems: Int
    var Quantity: Int
    var Items: js.UndefOr[OriginRequestPolicySummaryList]
    var NextMarker: js.UndefOr[String]
  }

  object OriginRequestPolicyList {
    @inline
    def apply(
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[OriginRequestPolicySummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): OriginRequestPolicyList = {
      val __obj = js.Dynamic.literal(
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OriginRequestPolicyList]
    }
  }

  @js.native
  sealed trait OriginRequestPolicyQueryStringBehavior extends js.Any
  object OriginRequestPolicyQueryStringBehavior {
    @inline def none = "none".asInstanceOf[OriginRequestPolicyQueryStringBehavior]
    @inline def whitelist = "whitelist".asInstanceOf[OriginRequestPolicyQueryStringBehavior]
    @inline def all = "all".asInstanceOf[OriginRequestPolicyQueryStringBehavior]

    @inline def values = js.Object.freeze(js.Array(none, whitelist, all))
  }

  /**
    * An object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in requests that CloudFront sends to the origin.
    */
  @js.native
  trait OriginRequestPolicyQueryStringsConfig extends js.Object {
    var QueryStringBehavior: OriginRequestPolicyQueryStringBehavior
    var QueryStrings: js.UndefOr[QueryStringNames]
  }

  object OriginRequestPolicyQueryStringsConfig {
    @inline
    def apply(
        QueryStringBehavior: OriginRequestPolicyQueryStringBehavior,
        QueryStrings: js.UndefOr[QueryStringNames] = js.undefined
    ): OriginRequestPolicyQueryStringsConfig = {
      val __obj = js.Dynamic.literal(
        "QueryStringBehavior" -> QueryStringBehavior.asInstanceOf[js.Any]
      )

      QueryStrings.foreach(__v => __obj.updateDynamic("QueryStrings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OriginRequestPolicyQueryStringsConfig]
    }
  }

  /**
    * Contains an origin request policy.
    */
  @js.native
  trait OriginRequestPolicySummary extends js.Object {
    var OriginRequestPolicy: OriginRequestPolicy
    var Type: OriginRequestPolicyType
  }

  object OriginRequestPolicySummary {
    @inline
    def apply(
        OriginRequestPolicy: OriginRequestPolicy,
        Type: OriginRequestPolicyType
    ): OriginRequestPolicySummary = {
      val __obj = js.Dynamic.literal(
        "OriginRequestPolicy" -> OriginRequestPolicy.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OriginRequestPolicySummary]
    }
  }

  @js.native
  sealed trait OriginRequestPolicyType extends js.Any
  object OriginRequestPolicyType {
    @inline def managed = "managed".asInstanceOf[OriginRequestPolicyType]
    @inline def custom = "custom".asInstanceOf[OriginRequestPolicyType]

    @inline def values = js.Object.freeze(js.Array(managed, custom))
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
    @inline
    def apply(
        Items: SslProtocolsList,
        Quantity: Int
    ): OriginSslProtocols = {
      val __obj = js.Dynamic.literal(
        "Items" -> Items.asInstanceOf[js.Any],
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
    @inline
    def apply(
        Items: OriginList,
        Quantity: Int
    ): Origins = {
      val __obj = js.Dynamic.literal(
        "Items" -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Origins]
    }
  }

  /**
    * This object determines the values that CloudFront includes in the cache key. These values can include HTTP headers, cookies, and URL query strings. CloudFront uses the cache key to find an object in its cache that it can return to the viewer.
    *  The headers, cookies, and query strings that are included in the cache key are automatically included in requests that CloudFront sends to the origin. CloudFront sends a request when it can’t find an object in its cache that matches the request’s cache key. If you want to send values to the origin but <i>not</i> include them in the cache key, use <code>CreateOriginRequestPolicy</code>.
    */
  @js.native
  trait ParametersInCacheKeyAndForwardedToOrigin extends js.Object {
    var CookiesConfig: CachePolicyCookiesConfig
    var EnableAcceptEncodingGzip: Boolean
    var HeadersConfig: CachePolicyHeadersConfig
    var QueryStringsConfig: CachePolicyQueryStringsConfig
  }

  object ParametersInCacheKeyAndForwardedToOrigin {
    @inline
    def apply(
        CookiesConfig: CachePolicyCookiesConfig,
        EnableAcceptEncodingGzip: Boolean,
        HeadersConfig: CachePolicyHeadersConfig,
        QueryStringsConfig: CachePolicyQueryStringsConfig
    ): ParametersInCacheKeyAndForwardedToOrigin = {
      val __obj = js.Dynamic.literal(
        "CookiesConfig" -> CookiesConfig.asInstanceOf[js.Any],
        "EnableAcceptEncodingGzip" -> EnableAcceptEncodingGzip.asInstanceOf[js.Any],
        "HeadersConfig" -> HeadersConfig.asInstanceOf[js.Any],
        "QueryStringsConfig" -> QueryStringsConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ParametersInCacheKeyAndForwardedToOrigin]
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
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[PathList] = js.undefined
    ): Paths = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Paths]
    }
  }

  @js.native
  sealed trait PriceClass extends js.Any
  object PriceClass {
    @inline def PriceClass_100 = "PriceClass_100".asInstanceOf[PriceClass]
    @inline def PriceClass_200 = "PriceClass_200".asInstanceOf[PriceClass]
    @inline def PriceClass_All = "PriceClass_All".asInstanceOf[PriceClass]

    @inline def values = js.Object.freeze(js.Array(PriceClass_100, PriceClass_200, PriceClass_All))
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
    @inline
    def apply(
        CreatedTime: timestamp,
        Id: String,
        PublicKeyConfig: PublicKeyConfig
    ): PublicKey = {
      val __obj = js.Dynamic.literal(
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
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
    @inline
    def apply(
        CallerReference: String,
        EncodedKey: String,
        Name: String,
        Comment: js.UndefOr[String] = js.undefined
    ): PublicKeyConfig = {
      val __obj = js.Dynamic.literal(
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "EncodedKey" -> EncodedKey.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[PublicKeySummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): PublicKeyList = {
      val __obj = js.Dynamic.literal(
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CreatedTime: timestamp,
        EncodedKey: String,
        Id: String,
        Name: String,
        Comment: js.UndefOr[String] = js.undefined
    ): PublicKeySummary = {
      val __obj = js.Dynamic.literal(
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "EncodedKey" -> EncodedKey.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ProfileId: String,
        QueryArg: String
    ): QueryArgProfile = {
      val __obj = js.Dynamic.literal(
        "ProfileId" -> ProfileId.asInstanceOf[js.Any],
        "QueryArg" -> QueryArg.asInstanceOf[js.Any]
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
    @inline
    def apply(
        ForwardWhenQueryArgProfileIsUnknown: Boolean,
        QueryArgProfiles: js.UndefOr[QueryArgProfiles] = js.undefined
    ): QueryArgProfileConfig = {
      val __obj = js.Dynamic.literal(
        "ForwardWhenQueryArgProfileIsUnknown" -> ForwardWhenQueryArgProfileIsUnknown.asInstanceOf[js.Any]
      )

      QueryArgProfiles.foreach(__v => __obj.updateDynamic("QueryArgProfiles")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[QueryArgProfileList] = js.undefined
    ): QueryArgProfiles = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryArgProfiles]
    }
  }

  /**
    * This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of this field.
    *  If you want to include query strings in the cache key, use <code>QueryStringsConfig</code> in a cache policy. See <code>CreateCachePolicy</code>.
    *  If you want to send query strings to the origin but not include them in the cache key, use <code>QueryStringsConfig</code> in an origin request policy. See <code>CreateOriginRequestPolicy</code>.
    *  A complex type that contains information about the query string parameters that you want CloudFront to use for caching for a cache behavior.
    */
  @js.native
  trait QueryStringCacheKeys extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[QueryStringCacheKeysList]
  }

  object QueryStringCacheKeys {
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[QueryStringCacheKeysList] = js.undefined
    ): QueryStringCacheKeys = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryStringCacheKeys]
    }
  }

  /**
    * Contains a list of query string names.
    */
  @js.native
  trait QueryStringNames extends js.Object {
    var Quantity: Int
    var Items: js.UndefOr[QueryStringNamesList]
  }

  object QueryStringNames {
    @inline
    def apply(
        Quantity: Int,
        Items: js.UndefOr[QueryStringNamesList] = js.undefined
    ): QueryStringNames = {
      val __obj = js.Dynamic.literal(
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryStringNames]
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
    @inline
    def apply(
        GeoRestriction: GeoRestriction
    ): Restrictions = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        DomainName: String,
        OriginAccessIdentity: String
    ): S3Origin = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "OriginAccessIdentity" -> OriginAccessIdentity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[S3Origin]
    }
  }

  /**
    * A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin or an S3 bucket that is configured as a website endpoint, use the <code>CustomOriginConfig</code> element instead.
    */
  @js.native
  trait S3OriginConfig extends js.Object {
    var OriginAccessIdentity: String
  }

  object S3OriginConfig {
    @inline
    def apply(
        OriginAccessIdentity: String
    ): S3OriginConfig = {
      val __obj = js.Dynamic.literal(
        "OriginAccessIdentity" -> OriginAccessIdentity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[S3OriginConfig]
    }
  }

  @js.native
  sealed trait SSLSupportMethod extends js.Any
  object SSLSupportMethod {
    @inline def `sni-only` = "sni-only".asInstanceOf[SSLSupportMethod]
    @inline def vip = "vip".asInstanceOf[SSLSupportMethod]

    @inline def values = js.Object.freeze(js.Array(`sni-only`, vip))
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
    @inline
    def apply(
        AwsAccountNumber: js.UndefOr[String] = js.undefined,
        KeyPairIds: js.UndefOr[KeyPairIds] = js.undefined
    ): Signer = {
      val __obj = js.Dynamic.literal()
      AwsAccountNumber.foreach(__v => __obj.updateDynamic("AwsAccountNumber")(__v.asInstanceOf[js.Any]))
      KeyPairIds.foreach(__v => __obj.updateDynamic("KeyPairIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Signer]
    }
  }

  @js.native
  sealed trait SslProtocol extends js.Any
  object SslProtocol {
    @inline def SSLv3 = "SSLv3".asInstanceOf[SslProtocol]
    @inline def TLSv1 = "TLSv1".asInstanceOf[SslProtocol]
    @inline def `TLSv1.1` = "TLSv1.1".asInstanceOf[SslProtocol]
    @inline def `TLSv1.2` = "TLSv1.2".asInstanceOf[SslProtocol]

    @inline def values = js.Object.freeze(js.Array(SSLv3, TLSv1, `TLSv1.1`, `TLSv1.2`))
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
    @inline
    def apply(
        Items: StatusCodeList,
        Quantity: Int
    ): StatusCodes = {
      val __obj = js.Dynamic.literal(
        "Items" -> Items.asInstanceOf[js.Any],
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
    @inline
    def apply(
        ARN: String,
        ActiveTrustedSigners: ActiveTrustedSigners,
        DomainName: String,
        Id: String,
        Status: String,
        StreamingDistributionConfig: StreamingDistributionConfig,
        LastModifiedTime: js.UndefOr[timestamp] = js.undefined
    ): StreamingDistribution = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "ActiveTrustedSigners" -> ActiveTrustedSigners.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "StreamingDistributionConfig" -> StreamingDistributionConfig.asInstanceOf[js.Any]
      )

      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Comment" -> Comment.asInstanceOf[js.Any],
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "S3Origin" -> S3Origin.asInstanceOf[js.Any],
        "TrustedSigners" -> TrustedSigners.asInstanceOf[js.Any]
      )

      Aliases.foreach(__v => __obj.updateDynamic("Aliases")(__v.asInstanceOf[js.Any]))
      Logging.foreach(__v => __obj.updateDynamic("Logging")(__v.asInstanceOf[js.Any]))
      PriceClass.foreach(__v => __obj.updateDynamic("PriceClass")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        StreamingDistributionConfig: StreamingDistributionConfig,
        Tags: Tags
    ): StreamingDistributionConfigWithTags = {
      val __obj = js.Dynamic.literal(
        "StreamingDistributionConfig" -> StreamingDistributionConfig.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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
    @inline
    def apply(
        IsTruncated: Boolean,
        Marker: String,
        MaxItems: Int,
        Quantity: Int,
        Items: js.UndefOr[StreamingDistributionSummaryList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): StreamingDistributionList = {
      val __obj = js.Dynamic.literal(
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker" -> Marker.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "Aliases" -> Aliases.asInstanceOf[js.Any],
        "Comment" -> Comment.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "PriceClass" -> PriceClass.asInstanceOf[js.Any],
        "S3Origin" -> S3Origin.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "TrustedSigners" -> TrustedSigners.asInstanceOf[js.Any]
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
    @inline
    def apply(
        Bucket: String,
        Enabled: Boolean,
        Prefix: String
    ): StreamingLoggingConfig = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "Prefix" -> Prefix.asInstanceOf[js.Any]
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
    @inline
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Items: js.UndefOr[TagKeyList] = js.undefined
    ): TagKeys = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Resource: ResourceARN,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Resource" -> Resource.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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
    @inline
    def apply(
        Items: js.UndefOr[TagList] = js.undefined
    ): Tags = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Enabled: Boolean,
        Quantity: Int,
        Items: js.UndefOr[AwsAccountNumberList] = js.undefined
    ): TrustedSigners = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]
      )

      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Resource: ResourceARN,
        TagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Resource" -> Resource.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateCachePolicyRequest extends js.Object {
    var CachePolicyConfig: CachePolicyConfig
    var Id: String
    var IfMatch: js.UndefOr[String]
  }

  object UpdateCachePolicyRequest {
    @inline
    def apply(
        CachePolicyConfig: CachePolicyConfig,
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdateCachePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "CachePolicyConfig" -> CachePolicyConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCachePolicyRequest]
    }
  }

  @js.native
  trait UpdateCachePolicyResult extends js.Object {
    var CachePolicy: js.UndefOr[CachePolicy]
    var ETag: js.UndefOr[String]
  }

  object UpdateCachePolicyResult {
    @inline
    def apply(
        CachePolicy: js.UndefOr[CachePolicy] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): UpdateCachePolicyResult = {
      val __obj = js.Dynamic.literal()
      CachePolicy.foreach(__v => __obj.updateDynamic("CachePolicy")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCachePolicyResult]
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
    @inline
    def apply(
        CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig,
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdateCloudFrontOriginAccessIdentityRequest = {
      val __obj = js.Dynamic.literal(
        "CloudFrontOriginAccessIdentityConfig" -> CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): UpdateCloudFrontOriginAccessIdentityResult = {
      val __obj = js.Dynamic.literal()
      CloudFrontOriginAccessIdentity.foreach(__v => __obj.updateDynamic("CloudFrontOriginAccessIdentity")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DistributionConfig: DistributionConfig,
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdateDistributionRequest = {
      val __obj = js.Dynamic.literal(
        "DistributionConfig" -> DistributionConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Distribution: js.UndefOr[Distribution] = js.undefined,
        ETag: js.UndefOr[String] = js.undefined
    ): UpdateDistributionResult = {
      val __obj = js.Dynamic.literal()
      Distribution.foreach(__v => __obj.updateDynamic("Distribution")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        FieldLevelEncryptionConfig: FieldLevelEncryptionConfig,
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdateFieldLevelEncryptionConfigRequest = {
      val __obj = js.Dynamic.literal(
        "FieldLevelEncryptionConfig" -> FieldLevelEncryptionConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFieldLevelEncryptionConfigRequest]
    }
  }

  @js.native
  trait UpdateFieldLevelEncryptionConfigResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption]
  }

  object UpdateFieldLevelEncryptionConfigResult {
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined
    ): UpdateFieldLevelEncryptionConfigResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      FieldLevelEncryption.foreach(__v => __obj.updateDynamic("FieldLevelEncryption")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig,
        Id: String,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdateFieldLevelEncryptionProfileRequest = {
      val __obj = js.Dynamic.literal(
        "FieldLevelEncryptionProfileConfig" -> FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFieldLevelEncryptionProfileRequest]
    }
  }

  @js.native
  trait UpdateFieldLevelEncryptionProfileResult extends js.Object {
    var ETag: js.UndefOr[String]
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile]
  }

  object UpdateFieldLevelEncryptionProfileResult {
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined
    ): UpdateFieldLevelEncryptionProfileResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      FieldLevelEncryptionProfile.foreach(__v => __obj.updateDynamic("FieldLevelEncryptionProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFieldLevelEncryptionProfileResult]
    }
  }

  @js.native
  trait UpdateOriginRequestPolicyRequest extends js.Object {
    var Id: String
    var OriginRequestPolicyConfig: OriginRequestPolicyConfig
    var IfMatch: js.UndefOr[String]
  }

  object UpdateOriginRequestPolicyRequest {
    @inline
    def apply(
        Id: String,
        OriginRequestPolicyConfig: OriginRequestPolicyConfig,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdateOriginRequestPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "OriginRequestPolicyConfig" -> OriginRequestPolicyConfig.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOriginRequestPolicyRequest]
    }
  }

  @js.native
  trait UpdateOriginRequestPolicyResult extends js.Object {
    var ETag: js.UndefOr[String]
    var OriginRequestPolicy: js.UndefOr[OriginRequestPolicy]
  }

  object UpdateOriginRequestPolicyResult {
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        OriginRequestPolicy: js.UndefOr[OriginRequestPolicy] = js.undefined
    ): UpdateOriginRequestPolicyResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      OriginRequestPolicy.foreach(__v => __obj.updateDynamic("OriginRequestPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOriginRequestPolicyResult]
    }
  }

  @js.native
  trait UpdatePublicKeyRequest extends js.Object {
    var Id: String
    var PublicKeyConfig: PublicKeyConfig
    var IfMatch: js.UndefOr[String]
  }

  object UpdatePublicKeyRequest {
    @inline
    def apply(
        Id: String,
        PublicKeyConfig: PublicKeyConfig,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdatePublicKeyRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "PublicKeyConfig" -> PublicKeyConfig.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePublicKeyRequest]
    }
  }

  @js.native
  trait UpdatePublicKeyResult extends js.Object {
    var ETag: js.UndefOr[String]
    var PublicKey: js.UndefOr[PublicKey]
  }

  object UpdatePublicKeyResult {
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        PublicKey: js.UndefOr[PublicKey] = js.undefined
    ): UpdatePublicKeyResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.updateDynamic("PublicKey")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Id: String,
        StreamingDistributionConfig: StreamingDistributionConfig,
        IfMatch: js.UndefOr[String] = js.undefined
    ): UpdateStreamingDistributionRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "StreamingDistributionConfig" -> StreamingDistributionConfig.asInstanceOf[js.Any]
      )

      IfMatch.foreach(__v => __obj.updateDynamic("IfMatch")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ETag: js.UndefOr[String] = js.undefined,
        StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
    ): UpdateStreamingDistributionResult = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      StreamingDistribution.foreach(__v => __obj.updateDynamic("StreamingDistribution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStreamingDistributionResult]
    }
  }

  /**
    * A complex type that determines the distribution’s SSL/TLS configuration for communicating with viewers.
    *  If the distribution doesn’t use <code>Aliases</code> (also known as alternate domain names or CNAMEs)—that is, if the distribution uses the CloudFront domain name such as <code>d111111abcdef8.cloudfront.net</code>—set <code>CloudFrontDefaultCertificate</code> to <code>true</code> and leave all other fields empty.
    *  If the distribution uses <code>Aliases</code> (alternate domain names or CNAMEs), use the fields in this type to specify the following settings:
    * * Which viewers the distribution accepts HTTPS connections from: only viewers that support [[https://en.wikipedia.org/wiki/Server_Name_Indication|server name indication (SNI)]] (recommended), or all viewers including those that don’t support SNI.
    * <li> To accept HTTPS connections from only viewers that support SNI, set <code>SSLSupportMethod</code> to <code>sni-only</code>. This is recommended. Most browsers and clients support SNI.
    *  * To accept HTTPS connections from all viewers, including those that don’t support SNI, set <code>SSLSupportMethod</code> to <code>vip</code>. This is not recommended, and results in additional monthly charges from CloudFront.
    * </li> * The minimum SSL/TLS protocol version that the distribution can use to communicate with viewers. To specify a minimum version, choose a value for <code>MinimumProtocolVersion</code>. For more information, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy|Security Policy]] in the <i>Amazon CloudFront Developer Guide</i>.
    *  * The location of the SSL/TLS certificate, [[https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html|AWS Certificate Manager (ACM)]] (recommended) or [[https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html|AWS Identity and Access Management (AWS IAM)]]. You specify the location by setting a value in one of the following fields (not both):
    * <li> <code>ACMCertificateArn</code>
    *  * <code>IAMCertificateId</code>
    * </li>All distributions support HTTPS connections from viewers. To require viewers to use HTTPS only, or to redirect them from HTTP to HTTPS, use <code>ViewerProtocolPolicy</code> in the <code>CacheBehavior</code> or <code>DefaultCacheBehavior</code>. To specify how CloudFront should use SSL/TLS to communicate with your custom origin, use <code>CustomOriginConfig</code>.
    *  For more information, see [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https.html|Using HTTPS with CloudFront]] and [[https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-alternate-domain-names.html| Using Alternate Domain Names and HTTPS]] in the <i>Amazon CloudFront Developer Guide</i>.
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
    @inline
    def apply(
        ACMCertificateArn: js.UndefOr[String] = js.undefined,
        Certificate: js.UndefOr[String] = js.undefined,
        CertificateSource: js.UndefOr[CertificateSource] = js.undefined,
        CloudFrontDefaultCertificate: js.UndefOr[Boolean] = js.undefined,
        IAMCertificateId: js.UndefOr[String] = js.undefined,
        MinimumProtocolVersion: js.UndefOr[MinimumProtocolVersion] = js.undefined,
        SSLSupportMethod: js.UndefOr[SSLSupportMethod] = js.undefined
    ): ViewerCertificate = {
      val __obj = js.Dynamic.literal()
      ACMCertificateArn.foreach(__v => __obj.updateDynamic("ACMCertificateArn")(__v.asInstanceOf[js.Any]))
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      CertificateSource.foreach(__v => __obj.updateDynamic("CertificateSource")(__v.asInstanceOf[js.Any]))
      CloudFrontDefaultCertificate.foreach(__v => __obj.updateDynamic("CloudFrontDefaultCertificate")(__v.asInstanceOf[js.Any]))
      IAMCertificateId.foreach(__v => __obj.updateDynamic("IAMCertificateId")(__v.asInstanceOf[js.Any]))
      MinimumProtocolVersion.foreach(__v => __obj.updateDynamic("MinimumProtocolVersion")(__v.asInstanceOf[js.Any]))
      SSLSupportMethod.foreach(__v => __obj.updateDynamic("SSLSupportMethod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ViewerCertificate]
    }
  }

  @js.native
  sealed trait ViewerProtocolPolicy extends js.Any
  object ViewerProtocolPolicy {
    @inline def `allow-all` = "allow-all".asInstanceOf[ViewerProtocolPolicy]
    @inline def `https-only` = "https-only".asInstanceOf[ViewerProtocolPolicy]
    @inline def `redirect-to-https` = "redirect-to-https".asInstanceOf[ViewerProtocolPolicy]

    @inline def values = js.Object.freeze(js.Array(`allow-all`, `https-only`, `redirect-to-https`))
  }
}
