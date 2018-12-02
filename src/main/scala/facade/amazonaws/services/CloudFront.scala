package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudfront {
  type AliasList = js.Array[string]
  type AwsAccountNumberList = js.Array[string]
  type CacheBehaviorList = js.Array[CacheBehavior]
  type CertificateSource = String
  type CloudFrontOriginAccessIdentitySummaryList = js.Array[CloudFrontOriginAccessIdentitySummary]
  type ContentTypeProfileList = js.Array[ContentTypeProfile]
  type CookieNameList = js.Array[string]
  type CustomErrorResponseList = js.Array[CustomErrorResponse]
  type DistributionSummaryList = js.Array[DistributionSummary]
  type EncryptionEntityList = js.Array[EncryptionEntity]
  type EventType = String
  type FieldLevelEncryptionProfileSummaryList = js.Array[FieldLevelEncryptionProfileSummary]
  type FieldLevelEncryptionSummaryList = js.Array[FieldLevelEncryptionSummary]
  type FieldPatternList = js.Array[string]
  type Format = String
  type GeoRestrictionType = String
  type HeaderList = js.Array[string]
  type HttpVersion = String
  type InvalidationSummaryList = js.Array[InvalidationSummary]
  type ItemSelection = String
  type KeyPairIdList = js.Array[string]
  type LambdaFunctionARN = String
  type LambdaFunctionAssociationList = js.Array[LambdaFunctionAssociation]
  type LocationList = js.Array[string]
  type Method = String
  type MethodsList = js.Array[Method]
  type MinimumProtocolVersion = String
  type OriginCustomHeadersList = js.Array[OriginCustomHeader]
  type OriginGroupList = js.Array[OriginGroup]
  type OriginGroupMemberList = js.Array[OriginGroupMember]
  type OriginList = js.Array[Origin]
  type OriginProtocolPolicy = String
  type PathList = js.Array[string]
  type PriceClass = String
  type PublicKeySummaryList = js.Array[PublicKeySummary]
  type QueryArgProfileList = js.Array[QueryArgProfile]
  type QueryStringCacheKeysList = js.Array[string]
  type ResourceARN = String
  type SSLSupportMethod = String
  type SignerList = js.Array[Signer]
  type SslProtocol = String
  type SslProtocolsList = js.Array[SslProtocol]
  type StatusCodeList = js.Array[integer]
  type StreamingDistributionSummaryList = js.Array[StreamingDistributionSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type ViewerProtocolPolicy = String
  type boolean = Boolean
  type integer = Int
  type long = Double
  type string = String
  type timestamp = js.Date
}

package cloudfront {
  @js.native
  @JSImport("aws-sdk", "CloudFront")
  class CloudFront(config: AWSConfig) extends js.Object {
    def createCloudFrontOriginAccessIdentity(params: CreateCloudFrontOriginAccessIdentityRequest): Request[CreateCloudFrontOriginAccessIdentityResult] = js.native
    def createDistribution(params: CreateDistributionRequest): Request[CreateDistributionResult] = js.native
    def createDistributionWithTags(params: CreateDistributionWithTagsRequest): Request[CreateDistributionWithTagsResult] = js.native
    def createFieldLevelEncryptionConfig(params: CreateFieldLevelEncryptionConfigRequest): Request[CreateFieldLevelEncryptionConfigResult] = js.native
    def createFieldLevelEncryptionProfile(params: CreateFieldLevelEncryptionProfileRequest): Request[CreateFieldLevelEncryptionProfileResult] = js.native
    def createInvalidation(params: CreateInvalidationRequest): Request[CreateInvalidationResult] = js.native
    def createPublicKey(params: CreatePublicKeyRequest): Request[CreatePublicKeyResult] = js.native
    def createStreamingDistribution(params: CreateStreamingDistributionRequest): Request[CreateStreamingDistributionResult] = js.native
    def createStreamingDistributionWithTags(params: CreateStreamingDistributionWithTagsRequest): Request[CreateStreamingDistributionWithTagsResult] = js.native
    def deleteCloudFrontOriginAccessIdentity(params: DeleteCloudFrontOriginAccessIdentityRequest): Request[js.Object] = js.native
    def deleteDistribution(params: DeleteDistributionRequest): Request[js.Object] = js.native
    def deleteFieldLevelEncryptionConfig(params: DeleteFieldLevelEncryptionConfigRequest): Request[js.Object] = js.native
    def deleteFieldLevelEncryptionProfile(params: DeleteFieldLevelEncryptionProfileRequest): Request[js.Object] = js.native
    def deletePublicKey(params: DeletePublicKeyRequest): Request[js.Object] = js.native
    def deleteStreamingDistribution(params: DeleteStreamingDistributionRequest): Request[js.Object] = js.native
    def getCloudFrontOriginAccessIdentity(params: GetCloudFrontOriginAccessIdentityRequest): Request[GetCloudFrontOriginAccessIdentityResult] = js.native
    def getCloudFrontOriginAccessIdentityConfig(params: GetCloudFrontOriginAccessIdentityConfigRequest): Request[GetCloudFrontOriginAccessIdentityConfigResult] = js.native
    def getDistribution(params: GetDistributionRequest): Request[GetDistributionResult] = js.native
    def getDistributionConfig(params: GetDistributionConfigRequest): Request[GetDistributionConfigResult] = js.native
    def getFieldLevelEncryption(params: GetFieldLevelEncryptionRequest): Request[GetFieldLevelEncryptionResult] = js.native
    def getFieldLevelEncryptionConfig(params: GetFieldLevelEncryptionConfigRequest): Request[GetFieldLevelEncryptionConfigResult] = js.native
    def getFieldLevelEncryptionProfile(params: GetFieldLevelEncryptionProfileRequest): Request[GetFieldLevelEncryptionProfileResult] = js.native
    def getFieldLevelEncryptionProfileConfig(params: GetFieldLevelEncryptionProfileConfigRequest): Request[GetFieldLevelEncryptionProfileConfigResult] = js.native
    def getInvalidation(params: GetInvalidationRequest): Request[GetInvalidationResult] = js.native
    def getPublicKey(params: GetPublicKeyRequest): Request[GetPublicKeyResult] = js.native
    def getPublicKeyConfig(params: GetPublicKeyConfigRequest): Request[GetPublicKeyConfigResult] = js.native
    def getStreamingDistribution(params: GetStreamingDistributionRequest): Request[GetStreamingDistributionResult] = js.native
    def getStreamingDistributionConfig(params: GetStreamingDistributionConfigRequest): Request[GetStreamingDistributionConfigResult] = js.native
    def listCloudFrontOriginAccessIdentities(params: ListCloudFrontOriginAccessIdentitiesRequest): Request[ListCloudFrontOriginAccessIdentitiesResult] = js.native
    def listDistributions(params: ListDistributionsRequest): Request[ListDistributionsResult] = js.native
    def listDistributionsByWebACLId(params: ListDistributionsByWebACLIdRequest): Request[ListDistributionsByWebACLIdResult] = js.native
    def listFieldLevelEncryptionConfigs(params: ListFieldLevelEncryptionConfigsRequest): Request[ListFieldLevelEncryptionConfigsResult] = js.native
    def listFieldLevelEncryptionProfiles(params: ListFieldLevelEncryptionProfilesRequest): Request[ListFieldLevelEncryptionProfilesResult] = js.native
    def listInvalidations(params: ListInvalidationsRequest): Request[ListInvalidationsResult] = js.native
    def listPublicKeys(params: ListPublicKeysRequest): Request[ListPublicKeysResult] = js.native
    def listStreamingDistributions(params: ListStreamingDistributionsRequest): Request[ListStreamingDistributionsResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateCloudFrontOriginAccessIdentity(params: UpdateCloudFrontOriginAccessIdentityRequest): Request[UpdateCloudFrontOriginAccessIdentityResult] = js.native
    def updateDistribution(params: UpdateDistributionRequest): Request[UpdateDistributionResult] = js.native
    def updateFieldLevelEncryptionConfig(params: UpdateFieldLevelEncryptionConfigRequest): Request[UpdateFieldLevelEncryptionConfigResult] = js.native
    def updateFieldLevelEncryptionProfile(params: UpdateFieldLevelEncryptionProfileRequest): Request[UpdateFieldLevelEncryptionProfileResult] = js.native
    def updatePublicKey(params: UpdatePublicKeyRequest): Request[UpdatePublicKeyResult] = js.native
    def updateStreamingDistribution(params: UpdateStreamingDistributionRequest): Request[UpdateStreamingDistributionResult] = js.native
  }

  /**
   * <p>A complex type that lists the AWS accounts, if any, that you included in the <code>TrustedSigners</code> complex type for this distribution. These are the accounts that you want to allow to create signed URLs for private content.</p> <p>The <code>Signer</code> complex type lists the AWS account number of the trusted signer or <code>self</code> if the signer is the AWS account that created the distribution. The <code>Signer</code> element also includes the IDs of any active CloudFront key pairs that are associated with the trusted signer's AWS account. If no <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer can't create signed URLs. </p> <p>For more information, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait ActiveTrustedSigners extends js.Object {
    var Enabled: boolean
    var Quantity: integer
    var Items: js.UndefOr[SignerList]
  }

  object ActiveTrustedSigners {
    def apply(
      Enabled: boolean,
      Quantity: integer,
      Items: js.UndefOr[SignerList] = js.undefined): ActiveTrustedSigners = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActiveTrustedSigners]
    }
  }

  /**
   * <p>A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution. </p>
   */
  @js.native
  trait Aliases extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[AliasList]
  }

  object Aliases {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[AliasList] = js.undefined): Aliases = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Aliases]
    }
  }

  /**
   * <p>A complex type that controls which HTTP methods CloudFront processes and forwards to your Amazon S3 bucket or your custom origin. There are three choices:</p> <ul> <li> <p>CloudFront forwards only <code>GET</code> and <code>HEAD</code> requests.</p> </li> <li> <p>CloudFront forwards only <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests.</p> </li> <li> <p>CloudFront forwards <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and <code>DELETE</code> requests.</p> </li> </ul> <p>If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or to your custom origin so users can't perform operations that you don't want them to. For example, you might not want users to have permissions to delete objects from your origin.</p>
   */
  @js.native
  trait AllowedMethods extends js.Object {
    var Items: MethodsList
    var Quantity: integer
    var CachedMethods: js.UndefOr[CachedMethods]
  }

  object AllowedMethods {
    def apply(
      Items: MethodsList,
      Quantity: integer,
      CachedMethods: js.UndefOr[CachedMethods] = js.undefined): AllowedMethods = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Items" -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "CachedMethods" -> CachedMethods.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllowedMethods]
    }
  }

  /**
   * <p>A complex type that describes how CloudFront processes requests.</p> <p>You must create at least as many cache behaviors (including the default cache behavior) as you have origins if you want CloudFront to distribute objects from all of the origins. Each cache behavior specifies the one origin from which you want CloudFront to get objects. If you have two origins and only the default cache behavior, the default cache behavior will cause CloudFront to get objects from one of the origins, but the other origin is never used.</p> <p>For the current limit on the number of cache behaviors that you can add to a distribution, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon CloudFront Limits</a> in the <i>AWS General Reference</i>.</p> <p>If you don't want to specify any cache behaviors, include only an empty <code>CacheBehaviors</code> element. Don't include an empty <code>CacheBehavior</code> element, or CloudFront returns a <code>MalformedXML</code> error.</p> <p>To delete all cache behaviors in an existing distribution, update the distribution configuration and include only an empty <code>CacheBehaviors</code> element.</p> <p>To add, change, or remove one or more cache behaviors, update the distribution configuration and specify all of the cache behaviors that you want to include in the updated distribution.</p> <p>For more information about cache behaviors, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior">Cache Behaviors</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait CacheBehavior extends js.Object {
    var ForwardedValues: ForwardedValues
    var MinTTL: long
    var PathPattern: string
    var TargetOriginId: string
    var TrustedSigners: TrustedSigners
    var ViewerProtocolPolicy: ViewerProtocolPolicy
    var AllowedMethods: js.UndefOr[AllowedMethods]
    var Compress: js.UndefOr[boolean]
    var DefaultTTL: js.UndefOr[long]
    var FieldLevelEncryptionId: js.UndefOr[string]
    var LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations]
    var MaxTTL: js.UndefOr[long]
    var SmoothStreaming: js.UndefOr[boolean]
  }

  object CacheBehavior {
    def apply(
      ForwardedValues: ForwardedValues,
      MinTTL: long,
      PathPattern: string,
      TargetOriginId: string,
      TrustedSigners: TrustedSigners,
      ViewerProtocolPolicy: ViewerProtocolPolicy,
      AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
      Compress: js.UndefOr[boolean] = js.undefined,
      DefaultTTL: js.UndefOr[long] = js.undefined,
      FieldLevelEncryptionId: js.UndefOr[string] = js.undefined,
      LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations] = js.undefined,
      MaxTTL: js.UndefOr[long] = js.undefined,
      SmoothStreaming: js.UndefOr[boolean] = js.undefined): CacheBehavior = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ForwardedValues" -> ForwardedValues.asInstanceOf[js.Any],
        "MinTTL" -> MinTTL.asInstanceOf[js.Any],
        "PathPattern" -> PathPattern.asInstanceOf[js.Any],
        "TargetOriginId" -> TargetOriginId.asInstanceOf[js.Any],
        "TrustedSigners" -> TrustedSigners.asInstanceOf[js.Any],
        "ViewerProtocolPolicy" -> ViewerProtocolPolicy.asInstanceOf[js.Any],
        "AllowedMethods" -> AllowedMethods.map { x => x.asInstanceOf[js.Any] },
        "Compress" -> Compress.map { x => x.asInstanceOf[js.Any] },
        "DefaultTTL" -> DefaultTTL.map { x => x.asInstanceOf[js.Any] },
        "FieldLevelEncryptionId" -> FieldLevelEncryptionId.map { x => x.asInstanceOf[js.Any] },
        "LambdaFunctionAssociations" -> LambdaFunctionAssociations.map { x => x.asInstanceOf[js.Any] },
        "MaxTTL" -> MaxTTL.map { x => x.asInstanceOf[js.Any] },
        "SmoothStreaming" -> SmoothStreaming.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheBehavior]
    }
  }

  /**
   * <p>A complex type that contains zero or more <code>CacheBehavior</code> elements. </p>
   */
  @js.native
  trait CacheBehaviors extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[CacheBehaviorList]
  }

  object CacheBehaviors {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[CacheBehaviorList] = js.undefined): CacheBehaviors = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheBehaviors]
    }
  }

  /**
   * <p>A complex type that controls whether CloudFront caches the response to requests using the specified HTTP methods. There are two choices:</p> <ul> <li> <p>CloudFront caches responses to <code>GET</code> and <code>HEAD</code> requests.</p> </li> <li> <p>CloudFront caches responses to <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests.</p> </li> </ul> <p>If you pick the second choice for your Amazon S3 Origin, you may need to forward Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the responses to be cached correctly. </p>
   */
  @js.native
  trait CachedMethods extends js.Object {
    var Items: MethodsList
    var Quantity: integer
  }

  object CachedMethods {
    def apply(
      Items: MethodsList,
      Quantity: integer): CachedMethods = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Items" -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CachedMethods]
    }
  }

  object CertificateSourceEnum {
    val cloudfront = "cloudfront"
    val iam = "iam"
    val acm = "acm"

    val values = IndexedSeq(cloudfront, iam, acm)
  }

  /**
   * <p>CloudFront origin access identity.</p>
   */
  @js.native
  trait CloudFrontOriginAccessIdentity extends js.Object {
    var Id: string
    var S3CanonicalUserId: string
    var CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig]
  }

  object CloudFrontOriginAccessIdentity {
    def apply(
      Id: string,
      S3CanonicalUserId: string,
      CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined): CloudFrontOriginAccessIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "S3CanonicalUserId" -> S3CanonicalUserId.asInstanceOf[js.Any],
        "CloudFrontOriginAccessIdentityConfig" -> CloudFrontOriginAccessIdentityConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudFrontOriginAccessIdentity]
    }
  }

  /**
   * <p>Origin access identity configuration. Send a <code>GET</code> request to the <code>/<i>CloudFront API version</i>/CloudFront/identity ID/config</code> resource. </p>
   */
  @js.native
  trait CloudFrontOriginAccessIdentityConfig extends js.Object {
    var CallerReference: string
    var Comment: string
  }

  object CloudFrontOriginAccessIdentityConfig {
    def apply(
      CallerReference: string,
      Comment: string): CloudFrontOriginAccessIdentityConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Comment" -> Comment.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudFrontOriginAccessIdentityConfig]
    }
  }

  /**
   * <p>Lists the origin access identities for CloudFront.Send a <code>GET</code> request to the <code>/<i>CloudFront API version</i>/origin-access-identity/cloudfront</code> resource. The response includes a <code>CloudFrontOriginAccessIdentityList</code> element with zero or more <code>CloudFrontOriginAccessIdentitySummary</code> child elements. By default, your entire list of origin access identities is returned in one single page. If the list is long, you can paginate it using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
   */
  @js.native
  trait CloudFrontOriginAccessIdentityList extends js.Object {
    var IsTruncated: boolean
    var Marker: string
    var MaxItems: integer
    var Quantity: integer
    var Items: js.UndefOr[CloudFrontOriginAccessIdentitySummaryList]
    var NextMarker: js.UndefOr[string]
  }

  object CloudFrontOriginAccessIdentityList {
    def apply(
      IsTruncated: boolean,
      Marker: string,
      MaxItems: integer,
      Quantity: integer,
      Items: js.UndefOr[CloudFrontOriginAccessIdentitySummaryList] = js.undefined,
      NextMarker: js.UndefOr[string] = js.undefined): CloudFrontOriginAccessIdentityList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker" -> Marker.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudFrontOriginAccessIdentityList]
    }
  }

  /**
   * <p>Summary of the information about a CloudFront origin access identity.</p>
   */
  @js.native
  trait CloudFrontOriginAccessIdentitySummary extends js.Object {
    var Comment: string
    var Id: string
    var S3CanonicalUserId: string
  }

  object CloudFrontOriginAccessIdentitySummary {
    def apply(
      Comment: string,
      Id: string,
      S3CanonicalUserId: string): CloudFrontOriginAccessIdentitySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comment" -> Comment.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "S3CanonicalUserId" -> S3CanonicalUserId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudFrontOriginAccessIdentitySummary]
    }
  }

  /**
   * <p>A field-level encryption content type profile. </p>
   */
  @js.native
  trait ContentTypeProfile extends js.Object {
    var ContentType: string
    var Format: Format
    var ProfileId: js.UndefOr[string]
  }

  object ContentTypeProfile {
    def apply(
      ContentType: string,
      Format: Format,
      ProfileId: js.UndefOr[string] = js.undefined): ContentTypeProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContentType" -> ContentType.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any],
        "ProfileId" -> ProfileId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContentTypeProfile]
    }
  }

  /**
   * <p>The configuration for a field-level encryption content type-profile mapping. </p>
   */
  @js.native
  trait ContentTypeProfileConfig extends js.Object {
    var ForwardWhenContentTypeIsUnknown: boolean
    var ContentTypeProfiles: js.UndefOr[ContentTypeProfiles]
  }

  object ContentTypeProfileConfig {
    def apply(
      ForwardWhenContentTypeIsUnknown: boolean,
      ContentTypeProfiles: js.UndefOr[ContentTypeProfiles] = js.undefined): ContentTypeProfileConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ForwardWhenContentTypeIsUnknown" -> ForwardWhenContentTypeIsUnknown.asInstanceOf[js.Any],
        "ContentTypeProfiles" -> ContentTypeProfiles.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContentTypeProfileConfig]
    }
  }

  /**
   * <p>Field-level encryption content type-profile. </p>
   */
  @js.native
  trait ContentTypeProfiles extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[ContentTypeProfileList]
  }

  object ContentTypeProfiles {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[ContentTypeProfileList] = js.undefined): ContentTypeProfiles = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContentTypeProfiles]
    }
  }

  /**
   * <p>A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones. For more information about forwarding cookies to the origin, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html">How CloudFront Forwards, Caches, and Logs Cookies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait CookieNames extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[CookieNameList]
  }

  object CookieNames {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[CookieNameList] = js.undefined): CookieNames = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CookieNames]
    }
  }

  /**
   * <p>A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones. For more information about forwarding cookies to the origin, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html">How CloudFront Forwards, Caches, and Logs Cookies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait CookiePreference extends js.Object {
    var Forward: ItemSelection
    var WhitelistedNames: js.UndefOr[CookieNames]
  }

  object CookiePreference {
    def apply(
      Forward: ItemSelection,
      WhitelistedNames: js.UndefOr[CookieNames] = js.undefined): CookiePreference = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Forward" -> Forward.asInstanceOf[js.Any],
        "WhitelistedNames" -> WhitelistedNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CookiePreference]
    }
  }

  /**
   * <p>The request to create a new origin access identity.</p>
   */
  @js.native
  trait CreateCloudFrontOriginAccessIdentityRequest extends js.Object {
    var CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig
  }

  object CreateCloudFrontOriginAccessIdentityRequest {
    def apply(
      CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig): CreateCloudFrontOriginAccessIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudFrontOriginAccessIdentityConfig" -> CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCloudFrontOriginAccessIdentityRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait CreateCloudFrontOriginAccessIdentityResult extends js.Object {
    var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity]
    var ETag: js.UndefOr[string]
    var Location: js.UndefOr[string]
  }

  object CreateCloudFrontOriginAccessIdentityResult {
    def apply(
      CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined,
      Location: js.UndefOr[string] = js.undefined): CreateCloudFrontOriginAccessIdentityResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudFrontOriginAccessIdentity" -> CloudFrontOriginAccessIdentity.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCloudFrontOriginAccessIdentityResult]
    }
  }

  /**
   * <p>The request to create a new distribution.</p>
   */
  @js.native
  trait CreateDistributionRequest extends js.Object {
    var DistributionConfig: DistributionConfig
  }

  object CreateDistributionRequest {
    def apply(
      DistributionConfig: DistributionConfig): CreateDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DistributionConfig" -> DistributionConfig.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDistributionRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait CreateDistributionResult extends js.Object {
    var Distribution: js.UndefOr[Distribution]
    var ETag: js.UndefOr[string]
    var Location: js.UndefOr[string]
  }

  object CreateDistributionResult {
    def apply(
      Distribution: js.UndefOr[Distribution] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined,
      Location: js.UndefOr[string] = js.undefined): CreateDistributionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Distribution" -> Distribution.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDistributionResult]
    }
  }

  /**
   * <p>The request to create a new distribution with tags. </p>
   */
  @js.native
  trait CreateDistributionWithTagsRequest extends js.Object {
    var DistributionConfigWithTags: DistributionConfigWithTags
  }

  object CreateDistributionWithTagsRequest {
    def apply(
      DistributionConfigWithTags: DistributionConfigWithTags): CreateDistributionWithTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DistributionConfigWithTags" -> DistributionConfigWithTags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDistributionWithTagsRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request. </p>
   */
  @js.native
  trait CreateDistributionWithTagsResult extends js.Object {
    var Distribution: js.UndefOr[Distribution]
    var ETag: js.UndefOr[string]
    var Location: js.UndefOr[string]
  }

  object CreateDistributionWithTagsResult {
    def apply(
      Distribution: js.UndefOr[Distribution] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined,
      Location: js.UndefOr[string] = js.undefined): CreateDistributionWithTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Distribution" -> Distribution.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDistributionWithTagsResult]
    }
  }

  @js.native
  trait CreateFieldLevelEncryptionConfigRequest extends js.Object {
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
  }

  object CreateFieldLevelEncryptionConfigRequest {
    def apply(
      FieldLevelEncryptionConfig: FieldLevelEncryptionConfig): CreateFieldLevelEncryptionConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldLevelEncryptionConfig" -> FieldLevelEncryptionConfig.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFieldLevelEncryptionConfigRequest]
    }
  }

  @js.native
  trait CreateFieldLevelEncryptionConfigResult extends js.Object {
    var ETag: js.UndefOr[string]
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption]
    var Location: js.UndefOr[string]
  }

  object CreateFieldLevelEncryptionConfigResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined,
      Location: js.UndefOr[string] = js.undefined): CreateFieldLevelEncryptionConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "FieldLevelEncryption" -> FieldLevelEncryption.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFieldLevelEncryptionConfigResult]
    }
  }

  @js.native
  trait CreateFieldLevelEncryptionProfileRequest extends js.Object {
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
  }

  object CreateFieldLevelEncryptionProfileRequest {
    def apply(
      FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig): CreateFieldLevelEncryptionProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldLevelEncryptionProfileConfig" -> FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFieldLevelEncryptionProfileRequest]
    }
  }

  @js.native
  trait CreateFieldLevelEncryptionProfileResult extends js.Object {
    var ETag: js.UndefOr[string]
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile]
    var Location: js.UndefOr[string]
  }

  object CreateFieldLevelEncryptionProfileResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined,
      Location: js.UndefOr[string] = js.undefined): CreateFieldLevelEncryptionProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "FieldLevelEncryptionProfile" -> FieldLevelEncryptionProfile.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFieldLevelEncryptionProfileResult]
    }
  }

  /**
   * <p>The request to create an invalidation.</p>
   */
  @js.native
  trait CreateInvalidationRequest extends js.Object {
    var DistributionId: string
    var InvalidationBatch: InvalidationBatch
  }

  object CreateInvalidationRequest {
    def apply(
      DistributionId: string,
      InvalidationBatch: InvalidationBatch): CreateInvalidationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DistributionId" -> DistributionId.asInstanceOf[js.Any],
        "InvalidationBatch" -> InvalidationBatch.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInvalidationRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait CreateInvalidationResult extends js.Object {
    var Invalidation: js.UndefOr[Invalidation]
    var Location: js.UndefOr[string]
  }

  object CreateInvalidationResult {
    def apply(
      Invalidation: js.UndefOr[Invalidation] = js.undefined,
      Location: js.UndefOr[string] = js.undefined): CreateInvalidationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Invalidation" -> Invalidation.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInvalidationResult]
    }
  }

  @js.native
  trait CreatePublicKeyRequest extends js.Object {
    var PublicKeyConfig: PublicKeyConfig
  }

  object CreatePublicKeyRequest {
    def apply(
      PublicKeyConfig: PublicKeyConfig): CreatePublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublicKeyConfig" -> PublicKeyConfig.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePublicKeyRequest]
    }
  }

  @js.native
  trait CreatePublicKeyResult extends js.Object {
    var ETag: js.UndefOr[string]
    var Location: js.UndefOr[string]
    var PublicKey: js.UndefOr[PublicKey]
  }

  object CreatePublicKeyResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      Location: js.UndefOr[string] = js.undefined,
      PublicKey: js.UndefOr[PublicKey] = js.undefined): CreatePublicKeyResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] },
        "PublicKey" -> PublicKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePublicKeyResult]
    }
  }

  /**
   * <p>The request to create a new streaming distribution.</p>
   */
  @js.native
  trait CreateStreamingDistributionRequest extends js.Object {
    var StreamingDistributionConfig: StreamingDistributionConfig
  }

  object CreateStreamingDistributionRequest {
    def apply(
      StreamingDistributionConfig: StreamingDistributionConfig): CreateStreamingDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamingDistributionConfig" -> StreamingDistributionConfig.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamingDistributionRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait CreateStreamingDistributionResult extends js.Object {
    var ETag: js.UndefOr[string]
    var Location: js.UndefOr[string]
    var StreamingDistribution: js.UndefOr[StreamingDistribution]
  }

  object CreateStreamingDistributionResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      Location: js.UndefOr[string] = js.undefined,
      StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined): CreateStreamingDistributionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] },
        "StreamingDistribution" -> StreamingDistribution.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamingDistributionResult]
    }
  }

  /**
   * <p>The request to create a new streaming distribution with tags.</p>
   */
  @js.native
  trait CreateStreamingDistributionWithTagsRequest extends js.Object {
    var StreamingDistributionConfigWithTags: StreamingDistributionConfigWithTags
  }

  object CreateStreamingDistributionWithTagsRequest {
    def apply(
      StreamingDistributionConfigWithTags: StreamingDistributionConfigWithTags): CreateStreamingDistributionWithTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamingDistributionConfigWithTags" -> StreamingDistributionConfigWithTags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamingDistributionWithTagsRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request. </p>
   */
  @js.native
  trait CreateStreamingDistributionWithTagsResult extends js.Object {
    var ETag: js.UndefOr[string]
    var Location: js.UndefOr[string]
    var StreamingDistribution: js.UndefOr[StreamingDistribution]
  }

  object CreateStreamingDistributionWithTagsResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      Location: js.UndefOr[string] = js.undefined,
      StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined): CreateStreamingDistributionWithTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] },
        "StreamingDistribution" -> StreamingDistribution.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamingDistributionWithTagsResult]
    }
  }

  /**
   * <p>A complex type that controls:</p> <ul> <li> <p>Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning the response to the viewer. </p> </li> <li> <p>How long CloudFront caches HTTP status codes in the 4xx and 5xx range.</p> </li> </ul> <p>For more information about custom error pages, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html">Customizing Error Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait CustomErrorResponse extends js.Object {
    var ErrorCode: integer
    var ErrorCachingMinTTL: js.UndefOr[long]
    var ResponseCode: js.UndefOr[string]
    var ResponsePagePath: js.UndefOr[string]
  }

  object CustomErrorResponse {
    def apply(
      ErrorCode: integer,
      ErrorCachingMinTTL: js.UndefOr[long] = js.undefined,
      ResponseCode: js.UndefOr[string] = js.undefined,
      ResponsePagePath: js.UndefOr[string] = js.undefined): CustomErrorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.asInstanceOf[js.Any],
        "ErrorCachingMinTTL" -> ErrorCachingMinTTL.map { x => x.asInstanceOf[js.Any] },
        "ResponseCode" -> ResponseCode.map { x => x.asInstanceOf[js.Any] },
        "ResponsePagePath" -> ResponsePagePath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomErrorResponse]
    }
  }

  /**
   * <p>A complex type that controls:</p> <ul> <li> <p>Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning the response to the viewer.</p> </li> <li> <p>How long CloudFront caches HTTP status codes in the 4xx and 5xx range.</p> </li> </ul> <p>For more information about custom error pages, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html">Customizing Error Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait CustomErrorResponses extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[CustomErrorResponseList]
  }

  object CustomErrorResponses {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[CustomErrorResponseList] = js.undefined): CustomErrorResponses = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomErrorResponses]
    }
  }

  /**
   * <p>A complex type that contains the list of Custom Headers for each origin. </p>
   */
  @js.native
  trait CustomHeaders extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[OriginCustomHeadersList]
  }

  object CustomHeaders {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[OriginCustomHeadersList] = js.undefined): CustomHeaders = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomHeaders]
    }
  }

  /**
   * <p>A customer origin or an Amazon S3 bucket configured as a website endpoint.</p>
   */
  @js.native
  trait CustomOriginConfig extends js.Object {
    var HTTPPort: integer
    var HTTPSPort: integer
    var OriginProtocolPolicy: OriginProtocolPolicy
    var OriginKeepaliveTimeout: js.UndefOr[integer]
    var OriginReadTimeout: js.UndefOr[integer]
    var OriginSslProtocols: js.UndefOr[OriginSslProtocols]
  }

  object CustomOriginConfig {
    def apply(
      HTTPPort: integer,
      HTTPSPort: integer,
      OriginProtocolPolicy: OriginProtocolPolicy,
      OriginKeepaliveTimeout: js.UndefOr[integer] = js.undefined,
      OriginReadTimeout: js.UndefOr[integer] = js.undefined,
      OriginSslProtocols: js.UndefOr[OriginSslProtocols] = js.undefined): CustomOriginConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HTTPPort" -> HTTPPort.asInstanceOf[js.Any],
        "HTTPSPort" -> HTTPSPort.asInstanceOf[js.Any],
        "OriginProtocolPolicy" -> OriginProtocolPolicy.asInstanceOf[js.Any],
        "OriginKeepaliveTimeout" -> OriginKeepaliveTimeout.map { x => x.asInstanceOf[js.Any] },
        "OriginReadTimeout" -> OriginReadTimeout.map { x => x.asInstanceOf[js.Any] },
        "OriginSslProtocols" -> OriginSslProtocols.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomOriginConfig]
    }
  }

  /**
   * <p>A complex type that describes the default cache behavior if you don't specify a <code>CacheBehavior</code> element or if files don't match any of the values of <code>PathPattern</code> in <code>CacheBehavior</code> elements. You must create exactly one default cache behavior.</p>
   */
  @js.native
  trait DefaultCacheBehavior extends js.Object {
    var ForwardedValues: ForwardedValues
    var MinTTL: long
    var TargetOriginId: string
    var TrustedSigners: TrustedSigners
    var ViewerProtocolPolicy: ViewerProtocolPolicy
    var AllowedMethods: js.UndefOr[AllowedMethods]
    var Compress: js.UndefOr[boolean]
    var DefaultTTL: js.UndefOr[long]
    var FieldLevelEncryptionId: js.UndefOr[string]
    var LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations]
    var MaxTTL: js.UndefOr[long]
    var SmoothStreaming: js.UndefOr[boolean]
  }

  object DefaultCacheBehavior {
    def apply(
      ForwardedValues: ForwardedValues,
      MinTTL: long,
      TargetOriginId: string,
      TrustedSigners: TrustedSigners,
      ViewerProtocolPolicy: ViewerProtocolPolicy,
      AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
      Compress: js.UndefOr[boolean] = js.undefined,
      DefaultTTL: js.UndefOr[long] = js.undefined,
      FieldLevelEncryptionId: js.UndefOr[string] = js.undefined,
      LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations] = js.undefined,
      MaxTTL: js.UndefOr[long] = js.undefined,
      SmoothStreaming: js.UndefOr[boolean] = js.undefined): DefaultCacheBehavior = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ForwardedValues" -> ForwardedValues.asInstanceOf[js.Any],
        "MinTTL" -> MinTTL.asInstanceOf[js.Any],
        "TargetOriginId" -> TargetOriginId.asInstanceOf[js.Any],
        "TrustedSigners" -> TrustedSigners.asInstanceOf[js.Any],
        "ViewerProtocolPolicy" -> ViewerProtocolPolicy.asInstanceOf[js.Any],
        "AllowedMethods" -> AllowedMethods.map { x => x.asInstanceOf[js.Any] },
        "Compress" -> Compress.map { x => x.asInstanceOf[js.Any] },
        "DefaultTTL" -> DefaultTTL.map { x => x.asInstanceOf[js.Any] },
        "FieldLevelEncryptionId" -> FieldLevelEncryptionId.map { x => x.asInstanceOf[js.Any] },
        "LambdaFunctionAssociations" -> LambdaFunctionAssociations.map { x => x.asInstanceOf[js.Any] },
        "MaxTTL" -> MaxTTL.map { x => x.asInstanceOf[js.Any] },
        "SmoothStreaming" -> SmoothStreaming.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefaultCacheBehavior]
    }
  }

  /**
   * <p>Deletes a origin access identity.</p>
   */
  @js.native
  trait DeleteCloudFrontOriginAccessIdentityRequest extends js.Object {
    var Id: string
    var IfMatch: js.UndefOr[string]
  }

  object DeleteCloudFrontOriginAccessIdentityRequest {
    def apply(
      Id: string,
      IfMatch: js.UndefOr[string] = js.undefined): DeleteCloudFrontOriginAccessIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCloudFrontOriginAccessIdentityRequest]
    }
  }

  /**
   * <p>This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the following steps.</p> <p> <b>To delete a web distribution using the CloudFront API:</b> </p> <ol> <li> <p>Disable the web distribution </p> </li> <li> <p>Submit a <code>GET Distribution Config</code> request to get the current configuration and the <code>Etag</code> header for the distribution.</p> </li> <li> <p>Update the XML document that was returned in the response to your <code>GET Distribution Config</code> request to change the value of <code>Enabled</code> to <code>false</code>.</p> </li> <li> <p>Submit a <code>PUT Distribution Config</code> request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Set the value of the HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when you submitted the <code>GET Distribution Config</code> request in Step 2.</p> </li> <li> <p>Review the response to the <code>PUT Distribution Config</code> request to confirm that the distribution was successfully disabled.</p> </li> <li> <p>Submit a <code>GET Distribution</code> request to confirm that your changes have propagated. When propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.</p> </li> <li> <p>Submit a <code>DELETE Distribution</code> request. Set the value of the HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when you submitted the <code>GET Distribution Config</code> request in Step 6.</p> </li> <li> <p>Review the response to your <code>DELETE Distribution</code> request to confirm that the distribution was successfully deleted.</p> </li> </ol> <p>For information about deleting a distribution using the CloudFront console, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html">Deleting a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait DeleteDistributionRequest extends js.Object {
    var Id: string
    var IfMatch: js.UndefOr[string]
  }

  object DeleteDistributionRequest {
    def apply(
      Id: string,
      IfMatch: js.UndefOr[string] = js.undefined): DeleteDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDistributionRequest]
    }
  }

  @js.native
  trait DeleteFieldLevelEncryptionConfigRequest extends js.Object {
    var Id: string
    var IfMatch: js.UndefOr[string]
  }

  object DeleteFieldLevelEncryptionConfigRequest {
    def apply(
      Id: string,
      IfMatch: js.UndefOr[string] = js.undefined): DeleteFieldLevelEncryptionConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFieldLevelEncryptionConfigRequest]
    }
  }

  @js.native
  trait DeleteFieldLevelEncryptionProfileRequest extends js.Object {
    var Id: string
    var IfMatch: js.UndefOr[string]
  }

  object DeleteFieldLevelEncryptionProfileRequest {
    def apply(
      Id: string,
      IfMatch: js.UndefOr[string] = js.undefined): DeleteFieldLevelEncryptionProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFieldLevelEncryptionProfileRequest]
    }
  }

  @js.native
  trait DeletePublicKeyRequest extends js.Object {
    var Id: string
    var IfMatch: js.UndefOr[string]
  }

  object DeletePublicKeyRequest {
    def apply(
      Id: string,
      IfMatch: js.UndefOr[string] = js.undefined): DeletePublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePublicKeyRequest]
    }
  }

  /**
   * <p>The request to delete a streaming distribution.</p>
   */
  @js.native
  trait DeleteStreamingDistributionRequest extends js.Object {
    var Id: string
    var IfMatch: js.UndefOr[string]
  }

  object DeleteStreamingDistributionRequest {
    def apply(
      Id: string,
      IfMatch: js.UndefOr[string] = js.undefined): DeleteStreamingDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamingDistributionRequest]
    }
  }

  /**
   * <p>The distribution's information.</p>
   */
  @js.native
  trait Distribution extends js.Object {
    var ARN: string
    var ActiveTrustedSigners: ActiveTrustedSigners
    var DistributionConfig: DistributionConfig
    var DomainName: string
    var Id: string
    var InProgressInvalidationBatches: integer
    var LastModifiedTime: timestamp
    var Status: string
  }

  object Distribution {
    def apply(
      ARN: string,
      ActiveTrustedSigners: ActiveTrustedSigners,
      DistributionConfig: DistributionConfig,
      DomainName: string,
      Id: string,
      InProgressInvalidationBatches: integer,
      LastModifiedTime: timestamp,
      Status: string): Distribution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.asInstanceOf[js.Any],
        "ActiveTrustedSigners" -> ActiveTrustedSigners.asInstanceOf[js.Any],
        "DistributionConfig" -> DistributionConfig.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "InProgressInvalidationBatches" -> InProgressInvalidationBatches.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Distribution]
    }
  }

  /**
   * <p>A distribution configuration.</p>
   */
  @js.native
  trait DistributionConfig extends js.Object {
    var CallerReference: string
    var Comment: string
    var DefaultCacheBehavior: DefaultCacheBehavior
    var Enabled: boolean
    var Origins: Origins
    var Aliases: js.UndefOr[Aliases]
    var CacheBehaviors: js.UndefOr[CacheBehaviors]
    var CustomErrorResponses: js.UndefOr[CustomErrorResponses]
    var DefaultRootObject: js.UndefOr[string]
    var HttpVersion: js.UndefOr[HttpVersion]
    var IsIPV6Enabled: js.UndefOr[boolean]
    var Logging: js.UndefOr[LoggingConfig]
    var OriginGroups: js.UndefOr[OriginGroups]
    var PriceClass: js.UndefOr[PriceClass]
    var Restrictions: js.UndefOr[Restrictions]
    var ViewerCertificate: js.UndefOr[ViewerCertificate]
    var WebACLId: js.UndefOr[string]
  }

  object DistributionConfig {
    def apply(
      CallerReference: string,
      Comment: string,
      DefaultCacheBehavior: DefaultCacheBehavior,
      Enabled: boolean,
      Origins: Origins,
      Aliases: js.UndefOr[Aliases] = js.undefined,
      CacheBehaviors: js.UndefOr[CacheBehaviors] = js.undefined,
      CustomErrorResponses: js.UndefOr[CustomErrorResponses] = js.undefined,
      DefaultRootObject: js.UndefOr[string] = js.undefined,
      HttpVersion: js.UndefOr[HttpVersion] = js.undefined,
      IsIPV6Enabled: js.UndefOr[boolean] = js.undefined,
      Logging: js.UndefOr[LoggingConfig] = js.undefined,
      OriginGroups: js.UndefOr[OriginGroups] = js.undefined,
      PriceClass: js.UndefOr[PriceClass] = js.undefined,
      Restrictions: js.UndefOr[Restrictions] = js.undefined,
      ViewerCertificate: js.UndefOr[ViewerCertificate] = js.undefined,
      WebACLId: js.UndefOr[string] = js.undefined): DistributionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Comment" -> Comment.asInstanceOf[js.Any],
        "DefaultCacheBehavior" -> DefaultCacheBehavior.asInstanceOf[js.Any],
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "Origins" -> Origins.asInstanceOf[js.Any],
        "Aliases" -> Aliases.map { x => x.asInstanceOf[js.Any] },
        "CacheBehaviors" -> CacheBehaviors.map { x => x.asInstanceOf[js.Any] },
        "CustomErrorResponses" -> CustomErrorResponses.map { x => x.asInstanceOf[js.Any] },
        "DefaultRootObject" -> DefaultRootObject.map { x => x.asInstanceOf[js.Any] },
        "HttpVersion" -> HttpVersion.map { x => x.asInstanceOf[js.Any] },
        "IsIPV6Enabled" -> IsIPV6Enabled.map { x => x.asInstanceOf[js.Any] },
        "Logging" -> Logging.map { x => x.asInstanceOf[js.Any] },
        "OriginGroups" -> OriginGroups.map { x => x.asInstanceOf[js.Any] },
        "PriceClass" -> PriceClass.map { x => x.asInstanceOf[js.Any] },
        "Restrictions" -> Restrictions.map { x => x.asInstanceOf[js.Any] },
        "ViewerCertificate" -> ViewerCertificate.map { x => x.asInstanceOf[js.Any] },
        "WebACLId" -> WebACLId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DistributionConfig]
    }
  }

  /**
   * <p>A distribution Configuration and a list of tags to be associated with the distribution.</p>
   */
  @js.native
  trait DistributionConfigWithTags extends js.Object {
    var DistributionConfig: DistributionConfig
    var Tags: Tags
  }

  object DistributionConfigWithTags {
    def apply(
      DistributionConfig: DistributionConfig,
      Tags: Tags): DistributionConfigWithTags = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DistributionConfig" -> DistributionConfig.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DistributionConfigWithTags]
    }
  }

  /**
   * <p>A distribution list.</p>
   */
  @js.native
  trait DistributionList extends js.Object {
    var IsTruncated: boolean
    var Marker: string
    var MaxItems: integer
    var Quantity: integer
    var Items: js.UndefOr[DistributionSummaryList]
    var NextMarker: js.UndefOr[string]
  }

  object DistributionList {
    def apply(
      IsTruncated: boolean,
      Marker: string,
      MaxItems: integer,
      Quantity: integer,
      Items: js.UndefOr[DistributionSummaryList] = js.undefined,
      NextMarker: js.UndefOr[string] = js.undefined): DistributionList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker" -> Marker.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DistributionList]
    }
  }

  /**
   * <p>A summary of the information about a CloudFront distribution.</p>
   */
  @js.native
  trait DistributionSummary extends js.Object {
    var ARN: string
    var Aliases: Aliases
    var CacheBehaviors: CacheBehaviors
    var Comment: string
    var CustomErrorResponses: CustomErrorResponses
    var DefaultCacheBehavior: DefaultCacheBehavior
    var DomainName: string
    var Enabled: boolean
    var HttpVersion: HttpVersion
    var Id: string
    var IsIPV6Enabled: boolean
    var LastModifiedTime: timestamp
    var Origins: Origins
    var PriceClass: PriceClass
    var Restrictions: Restrictions
    var Status: string
    var ViewerCertificate: ViewerCertificate
    var WebACLId: string
    var OriginGroups: js.UndefOr[OriginGroups]
  }

  object DistributionSummary {
    def apply(
      ARN: string,
      Aliases: Aliases,
      CacheBehaviors: CacheBehaviors,
      Comment: string,
      CustomErrorResponses: CustomErrorResponses,
      DefaultCacheBehavior: DefaultCacheBehavior,
      DomainName: string,
      Enabled: boolean,
      HttpVersion: HttpVersion,
      Id: string,
      IsIPV6Enabled: boolean,
      LastModifiedTime: timestamp,
      Origins: Origins,
      PriceClass: PriceClass,
      Restrictions: Restrictions,
      Status: string,
      ViewerCertificate: ViewerCertificate,
      WebACLId: string,
      OriginGroups: js.UndefOr[OriginGroups] = js.undefined): DistributionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
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
        "WebACLId" -> WebACLId.asInstanceOf[js.Any],
        "OriginGroups" -> OriginGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DistributionSummary]
    }
  }

  /**
   * <p>Complex data type for field-level encryption profiles that includes all of the encryption entities. </p>
   */
  @js.native
  trait EncryptionEntities extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[EncryptionEntityList]
  }

  object EncryptionEntities {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[EncryptionEntityList] = js.undefined): EncryptionEntities = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionEntities]
    }
  }

  /**
   * <p>Complex data type for field-level encryption profiles that includes the encryption key and field pattern specifications. </p>
   */
  @js.native
  trait EncryptionEntity extends js.Object {
    var FieldPatterns: FieldPatterns
    var ProviderId: string
    var PublicKeyId: string
  }

  object EncryptionEntity {
    def apply(
      FieldPatterns: FieldPatterns,
      ProviderId: string,
      PublicKeyId: string): EncryptionEntity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldPatterns" -> FieldPatterns.asInstanceOf[js.Any],
        "ProviderId" -> ProviderId.asInstanceOf[js.Any],
        "PublicKeyId" -> PublicKeyId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionEntity]
    }
  }

  object EventTypeEnum {
    val `viewer-request` = "viewer-request"
    val `viewer-response` = "viewer-response"
    val `origin-request` = "origin-request"
    val `origin-response` = "origin-response"

    val values = IndexedSeq(`viewer-request`, `viewer-response`, `origin-request`, `origin-response`)
  }

  /**
   * <p>A complex data type that includes the profile configurations and other options specified for field-level encryption. </p>
   */
  @js.native
  trait FieldLevelEncryption extends js.Object {
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
    var Id: string
    var LastModifiedTime: timestamp
  }

  object FieldLevelEncryption {
    def apply(
      FieldLevelEncryptionConfig: FieldLevelEncryptionConfig,
      Id: string,
      LastModifiedTime: timestamp): FieldLevelEncryption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldLevelEncryptionConfig" -> FieldLevelEncryptionConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldLevelEncryption]
    }
  }

  /**
   * <p>A complex data type that includes the profile configurations specified for field-level encryption. </p>
   */
  @js.native
  trait FieldLevelEncryptionConfig extends js.Object {
    var CallerReference: string
    var Comment: js.UndefOr[string]
    var ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig]
    var QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig]
  }

  object FieldLevelEncryptionConfig {
    def apply(
      CallerReference: string,
      Comment: js.UndefOr[string] = js.undefined,
      ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig] = js.undefined,
      QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig] = js.undefined): FieldLevelEncryptionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "ContentTypeProfileConfig" -> ContentTypeProfileConfig.map { x => x.asInstanceOf[js.Any] },
        "QueryArgProfileConfig" -> QueryArgProfileConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldLevelEncryptionConfig]
    }
  }

  /**
   * <p>List of field-level encrpytion configurations.</p>
   */
  @js.native
  trait FieldLevelEncryptionList extends js.Object {
    var MaxItems: integer
    var Quantity: integer
    var Items: js.UndefOr[FieldLevelEncryptionSummaryList]
    var NextMarker: js.UndefOr[string]
  }

  object FieldLevelEncryptionList {
    def apply(
      MaxItems: integer,
      Quantity: integer,
      Items: js.UndefOr[FieldLevelEncryptionSummaryList] = js.undefined,
      NextMarker: js.UndefOr[string] = js.undefined): FieldLevelEncryptionList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldLevelEncryptionList]
    }
  }

  /**
   * <p>A complex data type for field-level encryption profiles.</p>
   */
  @js.native
  trait FieldLevelEncryptionProfile extends js.Object {
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
    var Id: string
    var LastModifiedTime: timestamp
  }

  object FieldLevelEncryptionProfile {
    def apply(
      FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig,
      Id: string,
      LastModifiedTime: timestamp): FieldLevelEncryptionProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldLevelEncryptionProfileConfig" -> FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldLevelEncryptionProfile]
    }
  }

  /**
   * <p>A complex data type of profiles for the field-level encryption.</p>
   */
  @js.native
  trait FieldLevelEncryptionProfileConfig extends js.Object {
    var CallerReference: string
    var EncryptionEntities: EncryptionEntities
    var Name: string
    var Comment: js.UndefOr[string]
  }

  object FieldLevelEncryptionProfileConfig {
    def apply(
      CallerReference: string,
      EncryptionEntities: EncryptionEntities,
      Name: string,
      Comment: js.UndefOr[string] = js.undefined): FieldLevelEncryptionProfileConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "EncryptionEntities" -> EncryptionEntities.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldLevelEncryptionProfileConfig]
    }
  }

  /**
   * <p>List of field-level encryption profiles.</p>
   */
  @js.native
  trait FieldLevelEncryptionProfileList extends js.Object {
    var MaxItems: integer
    var Quantity: integer
    var Items: js.UndefOr[FieldLevelEncryptionProfileSummaryList]
    var NextMarker: js.UndefOr[string]
  }

  object FieldLevelEncryptionProfileList {
    def apply(
      MaxItems: integer,
      Quantity: integer,
      Items: js.UndefOr[FieldLevelEncryptionProfileSummaryList] = js.undefined,
      NextMarker: js.UndefOr[string] = js.undefined): FieldLevelEncryptionProfileList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldLevelEncryptionProfileList]
    }
  }

  /**
   * <p>The field-level encryption profile summary.</p>
   */
  @js.native
  trait FieldLevelEncryptionProfileSummary extends js.Object {
    var EncryptionEntities: EncryptionEntities
    var Id: string
    var LastModifiedTime: timestamp
    var Name: string
    var Comment: js.UndefOr[string]
  }

  object FieldLevelEncryptionProfileSummary {
    def apply(
      EncryptionEntities: EncryptionEntities,
      Id: string,
      LastModifiedTime: timestamp,
      Name: string,
      Comment: js.UndefOr[string] = js.undefined): FieldLevelEncryptionProfileSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionEntities" -> EncryptionEntities.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldLevelEncryptionProfileSummary]
    }
  }

  /**
   * <p>A summary of a field-level encryption item.</p>
   */
  @js.native
  trait FieldLevelEncryptionSummary extends js.Object {
    var Id: string
    var LastModifiedTime: timestamp
    var Comment: js.UndefOr[string]
    var ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig]
    var QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig]
  }

  object FieldLevelEncryptionSummary {
    def apply(
      Id: string,
      LastModifiedTime: timestamp,
      Comment: js.UndefOr[string] = js.undefined,
      ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig] = js.undefined,
      QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig] = js.undefined): FieldLevelEncryptionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "ContentTypeProfileConfig" -> ContentTypeProfileConfig.map { x => x.asInstanceOf[js.Any] },
        "QueryArgProfileConfig" -> QueryArgProfileConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldLevelEncryptionSummary]
    }
  }

  /**
   * <p>A complex data type that includes the field patterns to match for field-level encryption.</p>
   */
  @js.native
  trait FieldPatterns extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[FieldPatternList]
  }

  object FieldPatterns {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[FieldPatternList] = js.undefined): FieldPatterns = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldPatterns]
    }
  }

  object FormatEnum {
    val URLEncoded = "URLEncoded"

    val values = IndexedSeq(URLEncoded)
  }

  /**
   * <p>A complex type that specifies how CloudFront handles query strings and cookies.</p>
   */
  @js.native
  trait ForwardedValues extends js.Object {
    var Cookies: CookiePreference
    var QueryString: boolean
    var Headers: js.UndefOr[Headers]
    var QueryStringCacheKeys: js.UndefOr[QueryStringCacheKeys]
  }

  object ForwardedValues {
    def apply(
      Cookies: CookiePreference,
      QueryString: boolean,
      Headers: js.UndefOr[Headers] = js.undefined,
      QueryStringCacheKeys: js.UndefOr[QueryStringCacheKeys] = js.undefined): ForwardedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cookies" -> Cookies.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any],
        "Headers" -> Headers.map { x => x.asInstanceOf[js.Any] },
        "QueryStringCacheKeys" -> QueryStringCacheKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ForwardedValues]
    }
  }

  /**
   * <p>A complex type that controls the countries in which your content is distributed. CloudFront determines the location of your users using <code>MaxMind</code> GeoIP databases. </p>
   */
  @js.native
  trait GeoRestriction extends js.Object {
    var Quantity: integer
    var RestrictionType: GeoRestrictionType
    var Items: js.UndefOr[LocationList]
  }

  object GeoRestriction {
    def apply(
      Quantity: integer,
      RestrictionType: GeoRestrictionType,
      Items: js.UndefOr[LocationList] = js.undefined): GeoRestriction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "RestrictionType" -> RestrictionType.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoRestriction]
    }
  }

  object GeoRestrictionTypeEnum {
    val blacklist = "blacklist"
    val whitelist = "whitelist"
    val none = "none"

    val values = IndexedSeq(blacklist, whitelist, none)
  }

  /**
   * <p>The origin access identity's configuration information. For more information, see <a>CloudFrontOriginAccessIdentityConfigComplexType</a>.</p>
   */
  @js.native
  trait GetCloudFrontOriginAccessIdentityConfigRequest extends js.Object {
    var Id: string
  }

  object GetCloudFrontOriginAccessIdentityConfigRequest {
    def apply(
      Id: string): GetCloudFrontOriginAccessIdentityConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCloudFrontOriginAccessIdentityConfigRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetCloudFrontOriginAccessIdentityConfigResult extends js.Object {
    var CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig]
    var ETag: js.UndefOr[string]
  }

  object GetCloudFrontOriginAccessIdentityConfigResult {
    def apply(
      CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined): GetCloudFrontOriginAccessIdentityConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudFrontOriginAccessIdentityConfig" -> CloudFrontOriginAccessIdentityConfig.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCloudFrontOriginAccessIdentityConfigResult]
    }
  }

  /**
   * <p>The request to get an origin access identity's information.</p>
   */
  @js.native
  trait GetCloudFrontOriginAccessIdentityRequest extends js.Object {
    var Id: string
  }

  object GetCloudFrontOriginAccessIdentityRequest {
    def apply(
      Id: string): GetCloudFrontOriginAccessIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCloudFrontOriginAccessIdentityRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetCloudFrontOriginAccessIdentityResult extends js.Object {
    var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity]
    var ETag: js.UndefOr[string]
  }

  object GetCloudFrontOriginAccessIdentityResult {
    def apply(
      CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined): GetCloudFrontOriginAccessIdentityResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudFrontOriginAccessIdentity" -> CloudFrontOriginAccessIdentity.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCloudFrontOriginAccessIdentityResult]
    }
  }

  /**
   * <p>The request to get a distribution configuration.</p>
   */
  @js.native
  trait GetDistributionConfigRequest extends js.Object {
    var Id: string
  }

  object GetDistributionConfigRequest {
    def apply(
      Id: string): GetDistributionConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDistributionConfigRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetDistributionConfigResult extends js.Object {
    var DistributionConfig: js.UndefOr[DistributionConfig]
    var ETag: js.UndefOr[string]
  }

  object GetDistributionConfigResult {
    def apply(
      DistributionConfig: js.UndefOr[DistributionConfig] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined): GetDistributionConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DistributionConfig" -> DistributionConfig.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDistributionConfigResult]
    }
  }

  /**
   * <p>The request to get a distribution's information.</p>
   */
  @js.native
  trait GetDistributionRequest extends js.Object {
    var Id: string
  }

  object GetDistributionRequest {
    def apply(
      Id: string): GetDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDistributionRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetDistributionResult extends js.Object {
    var Distribution: js.UndefOr[Distribution]
    var ETag: js.UndefOr[string]
  }

  object GetDistributionResult {
    def apply(
      Distribution: js.UndefOr[Distribution] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined): GetDistributionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Distribution" -> Distribution.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDistributionResult]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionConfigRequest extends js.Object {
    var Id: string
  }

  object GetFieldLevelEncryptionConfigRequest {
    def apply(
      Id: string): GetFieldLevelEncryptionConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFieldLevelEncryptionConfigRequest]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionConfigResult extends js.Object {
    var ETag: js.UndefOr[string]
    var FieldLevelEncryptionConfig: js.UndefOr[FieldLevelEncryptionConfig]
  }

  object GetFieldLevelEncryptionConfigResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      FieldLevelEncryptionConfig: js.UndefOr[FieldLevelEncryptionConfig] = js.undefined): GetFieldLevelEncryptionConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "FieldLevelEncryptionConfig" -> FieldLevelEncryptionConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFieldLevelEncryptionConfigResult]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionProfileConfigRequest extends js.Object {
    var Id: string
  }

  object GetFieldLevelEncryptionProfileConfigRequest {
    def apply(
      Id: string): GetFieldLevelEncryptionProfileConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFieldLevelEncryptionProfileConfigRequest]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionProfileConfigResult extends js.Object {
    var ETag: js.UndefOr[string]
    var FieldLevelEncryptionProfileConfig: js.UndefOr[FieldLevelEncryptionProfileConfig]
  }

  object GetFieldLevelEncryptionProfileConfigResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      FieldLevelEncryptionProfileConfig: js.UndefOr[FieldLevelEncryptionProfileConfig] = js.undefined): GetFieldLevelEncryptionProfileConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "FieldLevelEncryptionProfileConfig" -> FieldLevelEncryptionProfileConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFieldLevelEncryptionProfileConfigResult]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionProfileRequest extends js.Object {
    var Id: string
  }

  object GetFieldLevelEncryptionProfileRequest {
    def apply(
      Id: string): GetFieldLevelEncryptionProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFieldLevelEncryptionProfileRequest]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionProfileResult extends js.Object {
    var ETag: js.UndefOr[string]
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile]
  }

  object GetFieldLevelEncryptionProfileResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined): GetFieldLevelEncryptionProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "FieldLevelEncryptionProfile" -> FieldLevelEncryptionProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFieldLevelEncryptionProfileResult]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionRequest extends js.Object {
    var Id: string
  }

  object GetFieldLevelEncryptionRequest {
    def apply(
      Id: string): GetFieldLevelEncryptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFieldLevelEncryptionRequest]
    }
  }

  @js.native
  trait GetFieldLevelEncryptionResult extends js.Object {
    var ETag: js.UndefOr[string]
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption]
  }

  object GetFieldLevelEncryptionResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined): GetFieldLevelEncryptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "FieldLevelEncryption" -> FieldLevelEncryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFieldLevelEncryptionResult]
    }
  }

  /**
   * <p>The request to get an invalidation's information. </p>
   */
  @js.native
  trait GetInvalidationRequest extends js.Object {
    var DistributionId: string
    var Id: string
  }

  object GetInvalidationRequest {
    def apply(
      DistributionId: string,
      Id: string): GetInvalidationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DistributionId" -> DistributionId.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInvalidationRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetInvalidationResult extends js.Object {
    var Invalidation: js.UndefOr[Invalidation]
  }

  object GetInvalidationResult {
    def apply(
      Invalidation: js.UndefOr[Invalidation] = js.undefined): GetInvalidationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Invalidation" -> Invalidation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInvalidationResult]
    }
  }

  @js.native
  trait GetPublicKeyConfigRequest extends js.Object {
    var Id: string
  }

  object GetPublicKeyConfigRequest {
    def apply(
      Id: string): GetPublicKeyConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPublicKeyConfigRequest]
    }
  }

  @js.native
  trait GetPublicKeyConfigResult extends js.Object {
    var ETag: js.UndefOr[string]
    var PublicKeyConfig: js.UndefOr[PublicKeyConfig]
  }

  object GetPublicKeyConfigResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      PublicKeyConfig: js.UndefOr[PublicKeyConfig] = js.undefined): GetPublicKeyConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "PublicKeyConfig" -> PublicKeyConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPublicKeyConfigResult]
    }
  }

  @js.native
  trait GetPublicKeyRequest extends js.Object {
    var Id: string
  }

  object GetPublicKeyRequest {
    def apply(
      Id: string): GetPublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPublicKeyRequest]
    }
  }

  @js.native
  trait GetPublicKeyResult extends js.Object {
    var ETag: js.UndefOr[string]
    var PublicKey: js.UndefOr[PublicKey]
  }

  object GetPublicKeyResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      PublicKey: js.UndefOr[PublicKey] = js.undefined): GetPublicKeyResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "PublicKey" -> PublicKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPublicKeyResult]
    }
  }

  /**
   * <p>To request to get a streaming distribution configuration.</p>
   */
  @js.native
  trait GetStreamingDistributionConfigRequest extends js.Object {
    var Id: string
  }

  object GetStreamingDistributionConfigRequest {
    def apply(
      Id: string): GetStreamingDistributionConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStreamingDistributionConfigRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetStreamingDistributionConfigResult extends js.Object {
    var ETag: js.UndefOr[string]
    var StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig]
  }

  object GetStreamingDistributionConfigResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig] = js.undefined): GetStreamingDistributionConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "StreamingDistributionConfig" -> StreamingDistributionConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStreamingDistributionConfigResult]
    }
  }

  /**
   * <p>The request to get a streaming distribution's information.</p>
   */
  @js.native
  trait GetStreamingDistributionRequest extends js.Object {
    var Id: string
  }

  object GetStreamingDistributionRequest {
    def apply(
      Id: string): GetStreamingDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStreamingDistributionRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetStreamingDistributionResult extends js.Object {
    var ETag: js.UndefOr[string]
    var StreamingDistribution: js.UndefOr[StreamingDistribution]
  }

  object GetStreamingDistributionResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined): GetStreamingDistributionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "StreamingDistribution" -> StreamingDistribution.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStreamingDistributionResult]
    }
  }

  /**
   * <p>A complex type that specifies the request headers, if any, that you want CloudFront to base caching on for this cache behavior. </p> <p>For the headers that you specify, CloudFront caches separate versions of a specified object based on the header values in viewer requests. For example, suppose viewer requests for <code>logo.jpg</code> contain a custom <code>product</code> header that has a value of either <code>acme</code> or <code>apex</code>, and you configure CloudFront to cache your content based on values in the <code>product</code> header. CloudFront forwards the <code>product</code> header to the origin and caches the response from the origin once for each header value. For more information about caching based on header values, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html">How CloudFront Forwards and Caches Headers</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait Headers extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[HeaderList]
  }

  object Headers {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[HeaderList] = js.undefined): Headers = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Headers]
    }
  }

  object HttpVersionEnum {
    val `http1.1` = "http1.1"
    val http2 = "http2"

    val values = IndexedSeq(`http1.1`, http2)
  }

  /**
   * <p>An invalidation. </p>
   */
  @js.native
  trait Invalidation extends js.Object {
    var CreateTime: timestamp
    var Id: string
    var InvalidationBatch: InvalidationBatch
    var Status: string
  }

  object Invalidation {
    def apply(
      CreateTime: timestamp,
      Id: string,
      InvalidationBatch: InvalidationBatch,
      Status: string): Invalidation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "InvalidationBatch" -> InvalidationBatch.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Invalidation]
    }
  }

  /**
   * <p>An invalidation batch.</p>
   */
  @js.native
  trait InvalidationBatch extends js.Object {
    var CallerReference: string
    var Paths: Paths
  }

  object InvalidationBatch {
    def apply(
      CallerReference: string,
      Paths: Paths): InvalidationBatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Paths" -> Paths.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvalidationBatch]
    }
  }

  /**
   * <p>The <code>InvalidationList</code> complex type describes the list of invalidation objects. For more information about invalidation, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html">Invalidating Objects (Web Distributions Only)</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait InvalidationList extends js.Object {
    var IsTruncated: boolean
    var Marker: string
    var MaxItems: integer
    var Quantity: integer
    var Items: js.UndefOr[InvalidationSummaryList]
    var NextMarker: js.UndefOr[string]
  }

  object InvalidationList {
    def apply(
      IsTruncated: boolean,
      Marker: string,
      MaxItems: integer,
      Quantity: integer,
      Items: js.UndefOr[InvalidationSummaryList] = js.undefined,
      NextMarker: js.UndefOr[string] = js.undefined): InvalidationList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker" -> Marker.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvalidationList]
    }
  }

  /**
   * <p>A summary of an invalidation request.</p>
   */
  @js.native
  trait InvalidationSummary extends js.Object {
    var CreateTime: timestamp
    var Id: string
    var Status: string
  }

  object InvalidationSummary {
    def apply(
      CreateTime: timestamp,
      Id: string,
      Status: string): InvalidationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateTime" -> CreateTime.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvalidationSummary]
    }
  }

  object ItemSelectionEnum {
    val none = "none"
    val whitelist = "whitelist"
    val all = "all"

    val values = IndexedSeq(none, whitelist, all)
  }

  /**
   * <p>A complex type that lists the active CloudFront key pairs, if any, that are associated with <code>AwsAccountNumber</code>. </p> <p>For more information, see <a>ActiveTrustedSigners</a>.</p>
   */
  @js.native
  trait KeyPairIds extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[KeyPairIdList]
  }

  object KeyPairIds {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[KeyPairIdList] = js.undefined): KeyPairIds = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPairIds]
    }
  }

  /**
   * <p>A complex type that contains a Lambda function association.</p>
   */
  @js.native
  trait LambdaFunctionAssociation extends js.Object {
    var EventType: EventType
    var LambdaFunctionARN: LambdaFunctionARN
    var IncludeBody: js.UndefOr[boolean]
  }

  object LambdaFunctionAssociation {
    def apply(
      EventType: EventType,
      LambdaFunctionARN: LambdaFunctionARN,
      IncludeBody: js.UndefOr[boolean] = js.undefined): LambdaFunctionAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventType" -> EventType.asInstanceOf[js.Any],
        "LambdaFunctionARN" -> LambdaFunctionARN.asInstanceOf[js.Any],
        "IncludeBody" -> IncludeBody.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionAssociation]
    }
  }

  /**
   * <p>A complex type that specifies a list of Lambda functions associations for a cache behavior.</p> <p>If you want to invoke one or more Lambda functions triggered by requests that match the <code>PathPattern</code> of the cache behavior, specify the applicable values for <code>Quantity</code> and <code>Items</code>. Note that there can be up to 4 <code>LambdaFunctionAssociation</code> items in this list (one for each possible value of <code>EventType</code>) and each <code>EventType</code> can be associated with the Lambda function only once.</p> <p>If you don't want to invoke any Lambda functions for the requests that match <code>PathPattern</code>, specify <code>0</code> for <code>Quantity</code> and omit <code>Items</code>. </p>
   */
  @js.native
  trait LambdaFunctionAssociations extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[LambdaFunctionAssociationList]
  }

  object LambdaFunctionAssociations {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[LambdaFunctionAssociationList] = js.undefined): LambdaFunctionAssociations = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionAssociations]
    }
  }

  /**
   * <p>The request to list origin access identities. </p>
   */
  @js.native
  trait ListCloudFrontOriginAccessIdentitiesRequest extends js.Object {
    var Marker: js.UndefOr[string]
    var MaxItems: js.UndefOr[string]
  }

  object ListCloudFrontOriginAccessIdentitiesRequest {
    def apply(
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined): ListCloudFrontOriginAccessIdentitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCloudFrontOriginAccessIdentitiesRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request. </p>
   */
  @js.native
  trait ListCloudFrontOriginAccessIdentitiesResult extends js.Object {
    var CloudFrontOriginAccessIdentityList: js.UndefOr[CloudFrontOriginAccessIdentityList]
  }

  object ListCloudFrontOriginAccessIdentitiesResult {
    def apply(
      CloudFrontOriginAccessIdentityList: js.UndefOr[CloudFrontOriginAccessIdentityList] = js.undefined): ListCloudFrontOriginAccessIdentitiesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudFrontOriginAccessIdentityList" -> CloudFrontOriginAccessIdentityList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCloudFrontOriginAccessIdentitiesResult]
    }
  }

  /**
   * <p>The request to list distributions that are associated with a specified AWS WAF web ACL. </p>
   */
  @js.native
  trait ListDistributionsByWebACLIdRequest extends js.Object {
    var WebACLId: string
    var Marker: js.UndefOr[string]
    var MaxItems: js.UndefOr[string]
  }

  object ListDistributionsByWebACLIdRequest {
    def apply(
      WebACLId: string,
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined): ListDistributionsByWebACLIdRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WebACLId" -> WebACLId.asInstanceOf[js.Any],
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDistributionsByWebACLIdRequest]
    }
  }

  /**
   * <p>The response to a request to list the distributions that are associated with a specified AWS WAF web ACL. </p>
   */
  @js.native
  trait ListDistributionsByWebACLIdResult extends js.Object {
    var DistributionList: js.UndefOr[DistributionList]
  }

  object ListDistributionsByWebACLIdResult {
    def apply(
      DistributionList: js.UndefOr[DistributionList] = js.undefined): ListDistributionsByWebACLIdResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DistributionList" -> DistributionList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDistributionsByWebACLIdResult]
    }
  }

  /**
   * <p>The request to list your distributions. </p>
   */
  @js.native
  trait ListDistributionsRequest extends js.Object {
    var Marker: js.UndefOr[string]
    var MaxItems: js.UndefOr[string]
  }

  object ListDistributionsRequest {
    def apply(
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined): ListDistributionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDistributionsRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request. </p>
   */
  @js.native
  trait ListDistributionsResult extends js.Object {
    var DistributionList: js.UndefOr[DistributionList]
  }

  object ListDistributionsResult {
    def apply(
      DistributionList: js.UndefOr[DistributionList] = js.undefined): ListDistributionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DistributionList" -> DistributionList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDistributionsResult]
    }
  }

  @js.native
  trait ListFieldLevelEncryptionConfigsRequest extends js.Object {
    var Marker: js.UndefOr[string]
    var MaxItems: js.UndefOr[string]
  }

  object ListFieldLevelEncryptionConfigsRequest {
    def apply(
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined): ListFieldLevelEncryptionConfigsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFieldLevelEncryptionConfigsRequest]
    }
  }

  @js.native
  trait ListFieldLevelEncryptionConfigsResult extends js.Object {
    var FieldLevelEncryptionList: js.UndefOr[FieldLevelEncryptionList]
  }

  object ListFieldLevelEncryptionConfigsResult {
    def apply(
      FieldLevelEncryptionList: js.UndefOr[FieldLevelEncryptionList] = js.undefined): ListFieldLevelEncryptionConfigsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldLevelEncryptionList" -> FieldLevelEncryptionList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFieldLevelEncryptionConfigsResult]
    }
  }

  @js.native
  trait ListFieldLevelEncryptionProfilesRequest extends js.Object {
    var Marker: js.UndefOr[string]
    var MaxItems: js.UndefOr[string]
  }

  object ListFieldLevelEncryptionProfilesRequest {
    def apply(
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined): ListFieldLevelEncryptionProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFieldLevelEncryptionProfilesRequest]
    }
  }

  @js.native
  trait ListFieldLevelEncryptionProfilesResult extends js.Object {
    var FieldLevelEncryptionProfileList: js.UndefOr[FieldLevelEncryptionProfileList]
  }

  object ListFieldLevelEncryptionProfilesResult {
    def apply(
      FieldLevelEncryptionProfileList: js.UndefOr[FieldLevelEncryptionProfileList] = js.undefined): ListFieldLevelEncryptionProfilesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldLevelEncryptionProfileList" -> FieldLevelEncryptionProfileList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFieldLevelEncryptionProfilesResult]
    }
  }

  /**
   * <p>The request to list invalidations. </p>
   */
  @js.native
  trait ListInvalidationsRequest extends js.Object {
    var DistributionId: string
    var Marker: js.UndefOr[string]
    var MaxItems: js.UndefOr[string]
  }

  object ListInvalidationsRequest {
    def apply(
      DistributionId: string,
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined): ListInvalidationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DistributionId" -> DistributionId.asInstanceOf[js.Any],
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInvalidationsRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request. </p>
   */
  @js.native
  trait ListInvalidationsResult extends js.Object {
    var InvalidationList: js.UndefOr[InvalidationList]
  }

  object ListInvalidationsResult {
    def apply(
      InvalidationList: js.UndefOr[InvalidationList] = js.undefined): ListInvalidationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InvalidationList" -> InvalidationList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInvalidationsResult]
    }
  }

  @js.native
  trait ListPublicKeysRequest extends js.Object {
    var Marker: js.UndefOr[string]
    var MaxItems: js.UndefOr[string]
  }

  object ListPublicKeysRequest {
    def apply(
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined): ListPublicKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPublicKeysRequest]
    }
  }

  @js.native
  trait ListPublicKeysResult extends js.Object {
    var PublicKeyList: js.UndefOr[PublicKeyList]
  }

  object ListPublicKeysResult {
    def apply(
      PublicKeyList: js.UndefOr[PublicKeyList] = js.undefined): ListPublicKeysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublicKeyList" -> PublicKeyList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPublicKeysResult]
    }
  }

  /**
   * <p>The request to list your streaming distributions. </p>
   */
  @js.native
  trait ListStreamingDistributionsRequest extends js.Object {
    var Marker: js.UndefOr[string]
    var MaxItems: js.UndefOr[string]
  }

  object ListStreamingDistributionsRequest {
    def apply(
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined): ListStreamingDistributionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamingDistributionsRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request. </p>
   */
  @js.native
  trait ListStreamingDistributionsResult extends js.Object {
    var StreamingDistributionList: js.UndefOr[StreamingDistributionList]
  }

  object ListStreamingDistributionsResult {
    def apply(
      StreamingDistributionList: js.UndefOr[StreamingDistributionList] = js.undefined): ListStreamingDistributionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamingDistributionList" -> StreamingDistributionList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamingDistributionsResult]
    }
  }

  /**
   * <p> The request to list tags for a CloudFront resource.</p>
   */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var Resource: ResourceARN
  }

  object ListTagsForResourceRequest {
    def apply(
      Resource: ResourceARN): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
   * <p> The returned result of the corresponding request.</p>
   */
  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var Tags: Tags
  }

  object ListTagsForResourceResult {
    def apply(
      Tags: Tags): ListTagsForResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResult]
    }
  }

  /**
   * <p>A complex type that controls whether access logs are written for the distribution.</p>
   */
  @js.native
  trait LoggingConfig extends js.Object {
    var Bucket: string
    var Enabled: boolean
    var IncludeCookies: boolean
    var Prefix: string
  }

  object LoggingConfig {
    def apply(
      Bucket: string,
      Enabled: boolean,
      IncludeCookies: boolean,
      Prefix: string): LoggingConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "IncludeCookies" -> IncludeCookies.asInstanceOf[js.Any],
        "Prefix" -> Prefix.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggingConfig]
    }
  }

  object MethodEnum {
    val GET = "GET"
    val HEAD = "HEAD"
    val POST = "POST"
    val PUT = "PUT"
    val PATCH = "PATCH"
    val OPTIONS = "OPTIONS"
    val DELETE = "DELETE"

    val values = IndexedSeq(GET, HEAD, POST, PUT, PATCH, OPTIONS, DELETE)
  }

  object MinimumProtocolVersionEnum {
    val SSLv3 = "SSLv3"
    val TLSv1 = "TLSv1"
    val TLSv1_2016 = "TLSv1_2016"
    val `TLSv1.1_2016` = "TLSv1.1_2016"
    val `TLSv1.2_2018` = "TLSv1.2_2018"

    val values = IndexedSeq(SSLv3, TLSv1, TLSv1_2016, `TLSv1.1_2016`, `TLSv1.2_2018`)
  }

  /**
   * <p>A complex type that describes the Amazon S3 bucket, HTTP server (for example, a web server), Amazon MediaStore, or other server from which CloudFront gets your files. This can also be an origin group, if you've created an origin group. You must specify at least one origin or origin group.</p> <p>For the current limit on the number of origins or origin groups that you can specify for a distribution, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon CloudFront Limits</a> in the <i>AWS General Reference</i>.</p>
   */
  @js.native
  trait Origin extends js.Object {
    var DomainName: string
    var Id: string
    var CustomHeaders: js.UndefOr[CustomHeaders]
    var CustomOriginConfig: js.UndefOr[CustomOriginConfig]
    var OriginPath: js.UndefOr[string]
    var S3OriginConfig: js.UndefOr[S3OriginConfig]
  }

  object Origin {
    def apply(
      DomainName: string,
      Id: string,
      CustomHeaders: js.UndefOr[CustomHeaders] = js.undefined,
      CustomOriginConfig: js.UndefOr[CustomOriginConfig] = js.undefined,
      OriginPath: js.UndefOr[string] = js.undefined,
      S3OriginConfig: js.UndefOr[S3OriginConfig] = js.undefined): Origin = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "CustomHeaders" -> CustomHeaders.map { x => x.asInstanceOf[js.Any] },
        "CustomOriginConfig" -> CustomOriginConfig.map { x => x.asInstanceOf[js.Any] },
        "OriginPath" -> OriginPath.map { x => x.asInstanceOf[js.Any] },
        "S3OriginConfig" -> S3OriginConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Origin]
    }
  }

  /**
   * <p>A complex type that contains <code>HeaderName</code> and <code>HeaderValue</code> elements, if any, for this distribution. </p>
   */
  @js.native
  trait OriginCustomHeader extends js.Object {
    var HeaderName: string
    var HeaderValue: string
  }

  object OriginCustomHeader {
    def apply(
      HeaderName: string,
      HeaderValue: string): OriginCustomHeader = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HeaderName" -> HeaderName.asInstanceOf[js.Any],
        "HeaderValue" -> HeaderValue.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OriginCustomHeader]
    }
  }

  /**
   * <p>An origin group includes two origins (a primary origin and a second origin to failover to) and a failover criteria that you specify. You create an origin group to support origin failover in CloudFront. When you create or update a distribution, you can specifiy the origin group instead of a single origin, and CloudFront will failover from the primary origin to the second origin under the failover conditions that you've chosen.</p>
   */
  @js.native
  trait OriginGroup extends js.Object {
    var FailoverCriteria: OriginGroupFailoverCriteria
    var Id: string
    var Members: OriginGroupMembers
  }

  object OriginGroup {
    def apply(
      FailoverCriteria: OriginGroupFailoverCriteria,
      Id: string,
      Members: OriginGroupMembers): OriginGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailoverCriteria" -> FailoverCriteria.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Members" -> Members.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OriginGroup]
    }
  }

  /**
   * <p>A complex data type that includes information about the failover criteria for an origin group, including the status codes for which CloudFront will failover from the primary origin to the second origin.</p>
   */
  @js.native
  trait OriginGroupFailoverCriteria extends js.Object {
    var StatusCodes: StatusCodes
  }

  object OriginGroupFailoverCriteria {
    def apply(
      StatusCodes: StatusCodes): OriginGroupFailoverCriteria = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusCodes" -> StatusCodes.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OriginGroupFailoverCriteria]
    }
  }

  /**
   * <p>An origin in an origin group.</p>
   */
  @js.native
  trait OriginGroupMember extends js.Object {
    var OriginId: string
  }

  object OriginGroupMember {
    def apply(
      OriginId: string): OriginGroupMember = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OriginId" -> OriginId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OriginGroupMember]
    }
  }

  /**
   * <p>A complex data type for the origins included in an origin group.</p>
   */
  @js.native
  trait OriginGroupMembers extends js.Object {
    var Items: OriginGroupMemberList
    var Quantity: integer
  }

  object OriginGroupMembers {
    def apply(
      Items: OriginGroupMemberList,
      Quantity: integer): OriginGroupMembers = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Items" -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OriginGroupMembers]
    }
  }

  /**
   * <p>A complex data type for the origin groups specified for a distribution.</p>
   */
  @js.native
  trait OriginGroups extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[OriginGroupList]
  }

  object OriginGroups {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[OriginGroupList] = js.undefined): OriginGroups = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OriginGroups]
    }
  }

  object OriginProtocolPolicyEnum {
    val `http-only` = "http-only"
    val `match-viewer` = "match-viewer"
    val `https-only` = "https-only"

    val values = IndexedSeq(`http-only`, `match-viewer`, `https-only`)
  }

  /**
   * <p>A complex type that contains information about the SSL/TLS protocols that CloudFront can use when establishing an HTTPS connection with your origin. </p>
   */
  @js.native
  trait OriginSslProtocols extends js.Object {
    var Items: SslProtocolsList
    var Quantity: integer
  }

  object OriginSslProtocols {
    def apply(
      Items: SslProtocolsList,
      Quantity: integer): OriginSslProtocols = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Items" -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OriginSslProtocols]
    }
  }

  /**
   * <p>A complex type that contains information about origins and origin groups for this distribution. </p>
   */
  @js.native
  trait Origins extends js.Object {
    var Items: OriginList
    var Quantity: integer
  }

  object Origins {
    def apply(
      Items: OriginList,
      Quantity: integer): Origins = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Items" -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Origins]
    }
  }

  /**
   * <p>A complex type that contains information about the objects that you want to invalidate. For more information, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html#invalidation-specifying-objects">Specifying the Objects to Invalidate</a> in the <i>Amazon CloudFront Developer Guide</i>. </p>
   */
  @js.native
  trait Paths extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[PathList]
  }

  object Paths {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[PathList] = js.undefined): Paths = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Paths]
    }
  }

  object PriceClassEnum {
    val PriceClass_100 = "PriceClass_100"
    val PriceClass_200 = "PriceClass_200"
    val PriceClass_All = "PriceClass_All"

    val values = IndexedSeq(PriceClass_100, PriceClass_200, PriceClass_All)
  }

  /**
   * <p>A complex data type of public keys you add to CloudFront to use with features like field-level encryption.</p>
   */
  @js.native
  trait PublicKey extends js.Object {
    var CreatedTime: timestamp
    var Id: string
    var PublicKeyConfig: PublicKeyConfig
  }

  object PublicKey {
    def apply(
      CreatedTime: timestamp,
      Id: string,
      PublicKeyConfig: PublicKeyConfig): PublicKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "PublicKeyConfig" -> PublicKeyConfig.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicKey]
    }
  }

  /**
   * <p>Information about a public key you add to CloudFront to use with features like field-level encryption.</p>
   */
  @js.native
  trait PublicKeyConfig extends js.Object {
    var CallerReference: string
    var EncodedKey: string
    var Name: string
    var Comment: js.UndefOr[string]
  }

  object PublicKeyConfig {
    def apply(
      CallerReference: string,
      EncodedKey: string,
      Name: string,
      Comment: js.UndefOr[string] = js.undefined): PublicKeyConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "EncodedKey" -> EncodedKey.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicKeyConfig]
    }
  }

  /**
   * <p>A list of public keys you've added to CloudFront to use with features like field-level encryption.</p>
   */
  @js.native
  trait PublicKeyList extends js.Object {
    var MaxItems: integer
    var Quantity: integer
    var Items: js.UndefOr[PublicKeySummaryList]
    var NextMarker: js.UndefOr[string]
  }

  object PublicKeyList {
    def apply(
      MaxItems: integer,
      Quantity: integer,
      Items: js.UndefOr[PublicKeySummaryList] = js.undefined,
      NextMarker: js.UndefOr[string] = js.undefined): PublicKeyList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicKeyList]
    }
  }

  /**
   * <p>A complex data type for public key information. </p>
   */
  @js.native
  trait PublicKeySummary extends js.Object {
    var CreatedTime: timestamp
    var EncodedKey: string
    var Id: string
    var Name: string
    var Comment: js.UndefOr[string]
  }

  object PublicKeySummary {
    def apply(
      CreatedTime: timestamp,
      EncodedKey: string,
      Id: string,
      Name: string,
      Comment: js.UndefOr[string] = js.undefined): PublicKeySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "EncodedKey" -> EncodedKey.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicKeySummary]
    }
  }

  /**
   * <p>Query argument-profile mapping for field-level encryption.</p>
   */
  @js.native
  trait QueryArgProfile extends js.Object {
    var ProfileId: string
    var QueryArg: string
  }

  object QueryArgProfile {
    def apply(
      ProfileId: string,
      QueryArg: string): QueryArgProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProfileId" -> ProfileId.asInstanceOf[js.Any],
        "QueryArg" -> QueryArg.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryArgProfile]
    }
  }

  /**
   * <p>Configuration for query argument-profile mapping for field-level encryption.</p>
   */
  @js.native
  trait QueryArgProfileConfig extends js.Object {
    var ForwardWhenQueryArgProfileIsUnknown: boolean
    var QueryArgProfiles: js.UndefOr[QueryArgProfiles]
  }

  object QueryArgProfileConfig {
    def apply(
      ForwardWhenQueryArgProfileIsUnknown: boolean,
      QueryArgProfiles: js.UndefOr[QueryArgProfiles] = js.undefined): QueryArgProfileConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ForwardWhenQueryArgProfileIsUnknown" -> ForwardWhenQueryArgProfileIsUnknown.asInstanceOf[js.Any],
        "QueryArgProfiles" -> QueryArgProfiles.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryArgProfileConfig]
    }
  }

  /**
   * <p>Query argument-profile mapping for field-level encryption.</p>
   */
  @js.native
  trait QueryArgProfiles extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[QueryArgProfileList]
  }

  object QueryArgProfiles {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[QueryArgProfileList] = js.undefined): QueryArgProfiles = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryArgProfiles]
    }
  }

  @js.native
  trait QueryStringCacheKeys extends js.Object {
    var Quantity: integer
    var Items: js.UndefOr[QueryStringCacheKeysList]
  }

  object QueryStringCacheKeys {
    def apply(
      Quantity: integer,
      Items: js.UndefOr[QueryStringCacheKeysList] = js.undefined): QueryStringCacheKeys = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryStringCacheKeys]
    }
  }

  /**
   * <p>A complex type that identifies ways in which you want to restrict distribution of your content.</p>
   */
  @js.native
  trait Restrictions extends js.Object {
    var GeoRestriction: GeoRestriction
  }

  object Restrictions {
    def apply(
      GeoRestriction: GeoRestriction): Restrictions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoRestriction" -> GeoRestriction.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Restrictions]
    }
  }

  /**
   * <p>A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution.</p>
   */
  @js.native
  trait S3Origin extends js.Object {
    var DomainName: string
    var OriginAccessIdentity: string
  }

  object S3Origin {
    def apply(
      DomainName: string,
      OriginAccessIdentity: string): S3Origin = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "OriginAccessIdentity" -> OriginAccessIdentity.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Origin]
    }
  }

  /**
   * <p>A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use the <code>CustomOriginConfig</code> element instead.</p>
   */
  @js.native
  trait S3OriginConfig extends js.Object {
    var OriginAccessIdentity: string
  }

  object S3OriginConfig {
    def apply(
      OriginAccessIdentity: string): S3OriginConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OriginAccessIdentity" -> OriginAccessIdentity.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3OriginConfig]
    }
  }

  object SSLSupportMethodEnum {
    val `sni-only` = "sni-only"
    val vip = "vip"

    val values = IndexedSeq(`sni-only`, vip)
  }

  /**
   * <p>A complex type that lists the AWS accounts that were included in the <code>TrustedSigners</code> complex type, as well as their active CloudFront key pair IDs, if any. </p>
   */
  @js.native
  trait Signer extends js.Object {
    var AwsAccountNumber: js.UndefOr[string]
    var KeyPairIds: js.UndefOr[KeyPairIds]
  }

  object Signer {
    def apply(
      AwsAccountNumber: js.UndefOr[string] = js.undefined,
      KeyPairIds: js.UndefOr[KeyPairIds] = js.undefined): Signer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AwsAccountNumber" -> AwsAccountNumber.map { x => x.asInstanceOf[js.Any] },
        "KeyPairIds" -> KeyPairIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Signer]
    }
  }

  object SslProtocolEnum {
    val SSLv3 = "SSLv3"
    val TLSv1 = "TLSv1"
    val `TLSv1.1` = "TLSv1.1"
    val `TLSv1.2` = "TLSv1.2"

    val values = IndexedSeq(SSLv3, TLSv1, `TLSv1.1`, `TLSv1.2`)
  }

  /**
   * <p>A complex data type for the status codes that you specify that, when returned by a primary origin, trigger CloudFront to failover to a second origin.</p>
   */
  @js.native
  trait StatusCodes extends js.Object {
    var Items: StatusCodeList
    var Quantity: integer
  }

  object StatusCodes {
    def apply(
      Items: StatusCodeList,
      Quantity: integer): StatusCodes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Items" -> Items.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StatusCodes]
    }
  }

  /**
   * <p>A streaming distribution. </p>
   */
  @js.native
  trait StreamingDistribution extends js.Object {
    var ARN: string
    var ActiveTrustedSigners: ActiveTrustedSigners
    var DomainName: string
    var Id: string
    var Status: string
    var StreamingDistributionConfig: StreamingDistributionConfig
    var LastModifiedTime: js.UndefOr[timestamp]
  }

  object StreamingDistribution {
    def apply(
      ARN: string,
      ActiveTrustedSigners: ActiveTrustedSigners,
      DomainName: string,
      Id: string,
      Status: string,
      StreamingDistributionConfig: StreamingDistributionConfig,
      LastModifiedTime: js.UndefOr[timestamp] = js.undefined): StreamingDistribution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.asInstanceOf[js.Any],
        "ActiveTrustedSigners" -> ActiveTrustedSigners.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "StreamingDistributionConfig" -> StreamingDistributionConfig.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamingDistribution]
    }
  }

  /**
   * <p>The RTMP distribution's configuration information.</p>
   */
  @js.native
  trait StreamingDistributionConfig extends js.Object {
    var CallerReference: string
    var Comment: string
    var Enabled: boolean
    var S3Origin: S3Origin
    var TrustedSigners: TrustedSigners
    var Aliases: js.UndefOr[Aliases]
    var Logging: js.UndefOr[StreamingLoggingConfig]
    var PriceClass: js.UndefOr[PriceClass]
  }

  object StreamingDistributionConfig {
    def apply(
      CallerReference: string,
      Comment: string,
      Enabled: boolean,
      S3Origin: S3Origin,
      TrustedSigners: TrustedSigners,
      Aliases: js.UndefOr[Aliases] = js.undefined,
      Logging: js.UndefOr[StreamingLoggingConfig] = js.undefined,
      PriceClass: js.UndefOr[PriceClass] = js.undefined): StreamingDistributionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Comment" -> Comment.asInstanceOf[js.Any],
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "S3Origin" -> S3Origin.asInstanceOf[js.Any],
        "TrustedSigners" -> TrustedSigners.asInstanceOf[js.Any],
        "Aliases" -> Aliases.map { x => x.asInstanceOf[js.Any] },
        "Logging" -> Logging.map { x => x.asInstanceOf[js.Any] },
        "PriceClass" -> PriceClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamingDistributionConfig]
    }
  }

  /**
   * <p>A streaming distribution Configuration and a list of tags to be associated with the streaming distribution.</p>
   */
  @js.native
  trait StreamingDistributionConfigWithTags extends js.Object {
    var StreamingDistributionConfig: StreamingDistributionConfig
    var Tags: Tags
  }

  object StreamingDistributionConfigWithTags {
    def apply(
      StreamingDistributionConfig: StreamingDistributionConfig,
      Tags: Tags): StreamingDistributionConfigWithTags = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamingDistributionConfig" -> StreamingDistributionConfig.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamingDistributionConfigWithTags]
    }
  }

  /**
   * <p>A streaming distribution list. </p>
   */
  @js.native
  trait StreamingDistributionList extends js.Object {
    var IsTruncated: boolean
    var Marker: string
    var MaxItems: integer
    var Quantity: integer
    var Items: js.UndefOr[StreamingDistributionSummaryList]
    var NextMarker: js.UndefOr[string]
  }

  object StreamingDistributionList {
    def apply(
      IsTruncated: boolean,
      Marker: string,
      MaxItems: integer,
      Quantity: integer,
      Items: js.UndefOr[StreamingDistributionSummaryList] = js.undefined,
      NextMarker: js.UndefOr[string] = js.undefined): StreamingDistributionList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker" -> Marker.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamingDistributionList]
    }
  }

  /**
   * <p> A summary of the information for an Amazon CloudFront streaming distribution.</p>
   */
  @js.native
  trait StreamingDistributionSummary extends js.Object {
    var ARN: string
    var Aliases: Aliases
    var Comment: string
    var DomainName: string
    var Enabled: boolean
    var Id: string
    var LastModifiedTime: timestamp
    var PriceClass: PriceClass
    var S3Origin: S3Origin
    var Status: string
    var TrustedSigners: TrustedSigners
  }

  object StreamingDistributionSummary {
    def apply(
      ARN: string,
      Aliases: Aliases,
      Comment: string,
      DomainName: string,
      Enabled: boolean,
      Id: string,
      LastModifiedTime: timestamp,
      PriceClass: PriceClass,
      S3Origin: S3Origin,
      Status: string,
      TrustedSigners: TrustedSigners): StreamingDistributionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
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
        "TrustedSigners" -> TrustedSigners.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamingDistributionSummary]
    }
  }

  /**
   * <p>A complex type that controls whether access logs are written for this streaming distribution.</p>
   */
  @js.native
  trait StreamingLoggingConfig extends js.Object {
    var Bucket: string
    var Enabled: boolean
    var Prefix: string
  }

  object StreamingLoggingConfig {
    def apply(
      Bucket: string,
      Enabled: boolean,
      Prefix: string): StreamingLoggingConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "Prefix" -> Prefix.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamingLoggingConfig]
    }
  }

  /**
   * <p> A complex type that contains <code>Tag</code> key and <code>Tag</code> value.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: TagKey,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p> A complex type that contains zero or more <code>Tag</code> elements.</p>
   */
  @js.native
  trait TagKeys extends js.Object {
    var Items: js.UndefOr[TagKeyList]
  }

  object TagKeys {
    def apply(
      Items: js.UndefOr[TagKeyList] = js.undefined): TagKeys = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagKeys]
    }
  }

  /**
   * <p> The request to add tags to a CloudFront resource.</p>
   */
  @js.native
  trait TagResourceRequest extends js.Object {
    var Resource: ResourceARN
    var Tags: Tags
  }

  object TagResourceRequest {
    def apply(
      Resource: ResourceARN,
      Tags: Tags): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  /**
   * <p> A complex type that contains zero or more <code>Tag</code> elements.</p>
   */
  @js.native
  trait Tags extends js.Object {
    var Items: js.UndefOr[TagList]
  }

  object Tags {
    def apply(
      Items: js.UndefOr[TagList] = js.undefined): Tags = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tags]
    }
  }

  /**
   * <p>A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content.</p> <p>If you want to require signed URLs in requests for objects in the target origin that match the <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify the applicable values for <code>Quantity</code> and <code>Items</code>. For more information, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private Content through CloudFront</a> in the <i>Amazon Amazon CloudFront Developer Guide</i>.</p> <p>If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>, specify <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>.</p> <p>To add, change, or remove one or more trusted signers, change <code>Enabled</code> to <code>true</code> (if it's currently <code>false</code>), change <code>Quantity</code> as applicable, and specify all of the trusted signers that you want to include in the updated distribution.</p> <p>For more information about updating the distribution configuration, see <a>DistributionConfig</a> .</p>
   */
  @js.native
  trait TrustedSigners extends js.Object {
    var Enabled: boolean
    var Quantity: integer
    var Items: js.UndefOr[AwsAccountNumberList]
  }

  object TrustedSigners {
    def apply(
      Enabled: boolean,
      Quantity: integer,
      Items: js.UndefOr[AwsAccountNumberList] = js.undefined): TrustedSigners = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "Quantity" -> Quantity.asInstanceOf[js.Any],
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedSigners]
    }
  }

  /**
   * <p> The request to remove tags from a CloudFront resource.</p>
   */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var Resource: ResourceARN
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    def apply(
      Resource: ResourceARN,
      TagKeys: TagKeys): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  /**
   * <p>The request to update an origin access identity.</p>
   */
  @js.native
  trait UpdateCloudFrontOriginAccessIdentityRequest extends js.Object {
    var CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig
    var Id: string
    var IfMatch: js.UndefOr[string]
  }

  object UpdateCloudFrontOriginAccessIdentityRequest {
    def apply(
      CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig,
      Id: string,
      IfMatch: js.UndefOr[string] = js.undefined): UpdateCloudFrontOriginAccessIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudFrontOriginAccessIdentityConfig" -> CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCloudFrontOriginAccessIdentityRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait UpdateCloudFrontOriginAccessIdentityResult extends js.Object {
    var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity]
    var ETag: js.UndefOr[string]
  }

  object UpdateCloudFrontOriginAccessIdentityResult {
    def apply(
      CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined): UpdateCloudFrontOriginAccessIdentityResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudFrontOriginAccessIdentity" -> CloudFrontOriginAccessIdentity.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCloudFrontOriginAccessIdentityResult]
    }
  }

  /**
   * <p>The request to update a distribution.</p>
   */
  @js.native
  trait UpdateDistributionRequest extends js.Object {
    var DistributionConfig: DistributionConfig
    var Id: string
    var IfMatch: js.UndefOr[string]
  }

  object UpdateDistributionRequest {
    def apply(
      DistributionConfig: DistributionConfig,
      Id: string,
      IfMatch: js.UndefOr[string] = js.undefined): UpdateDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DistributionConfig" -> DistributionConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDistributionRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait UpdateDistributionResult extends js.Object {
    var Distribution: js.UndefOr[Distribution]
    var ETag: js.UndefOr[string]
  }

  object UpdateDistributionResult {
    def apply(
      Distribution: js.UndefOr[Distribution] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined): UpdateDistributionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Distribution" -> Distribution.map { x => x.asInstanceOf[js.Any] },
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDistributionResult]
    }
  }

  @js.native
  trait UpdateFieldLevelEncryptionConfigRequest extends js.Object {
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
    var Id: string
    var IfMatch: js.UndefOr[string]
  }

  object UpdateFieldLevelEncryptionConfigRequest {
    def apply(
      FieldLevelEncryptionConfig: FieldLevelEncryptionConfig,
      Id: string,
      IfMatch: js.UndefOr[string] = js.undefined): UpdateFieldLevelEncryptionConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldLevelEncryptionConfig" -> FieldLevelEncryptionConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFieldLevelEncryptionConfigRequest]
    }
  }

  @js.native
  trait UpdateFieldLevelEncryptionConfigResult extends js.Object {
    var ETag: js.UndefOr[string]
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption]
  }

  object UpdateFieldLevelEncryptionConfigResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined): UpdateFieldLevelEncryptionConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "FieldLevelEncryption" -> FieldLevelEncryption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFieldLevelEncryptionConfigResult]
    }
  }

  @js.native
  trait UpdateFieldLevelEncryptionProfileRequest extends js.Object {
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
    var Id: string
    var IfMatch: js.UndefOr[string]
  }

  object UpdateFieldLevelEncryptionProfileRequest {
    def apply(
      FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig,
      Id: string,
      IfMatch: js.UndefOr[string] = js.undefined): UpdateFieldLevelEncryptionProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FieldLevelEncryptionProfileConfig" -> FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFieldLevelEncryptionProfileRequest]
    }
  }

  @js.native
  trait UpdateFieldLevelEncryptionProfileResult extends js.Object {
    var ETag: js.UndefOr[string]
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile]
  }

  object UpdateFieldLevelEncryptionProfileResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined): UpdateFieldLevelEncryptionProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "FieldLevelEncryptionProfile" -> FieldLevelEncryptionProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFieldLevelEncryptionProfileResult]
    }
  }

  @js.native
  trait UpdatePublicKeyRequest extends js.Object {
    var Id: string
    var PublicKeyConfig: PublicKeyConfig
    var IfMatch: js.UndefOr[string]
  }

  object UpdatePublicKeyRequest {
    def apply(
      Id: string,
      PublicKeyConfig: PublicKeyConfig,
      IfMatch: js.UndefOr[string] = js.undefined): UpdatePublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "PublicKeyConfig" -> PublicKeyConfig.asInstanceOf[js.Any],
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePublicKeyRequest]
    }
  }

  @js.native
  trait UpdatePublicKeyResult extends js.Object {
    var ETag: js.UndefOr[string]
    var PublicKey: js.UndefOr[PublicKey]
  }

  object UpdatePublicKeyResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      PublicKey: js.UndefOr[PublicKey] = js.undefined): UpdatePublicKeyResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "PublicKey" -> PublicKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePublicKeyResult]
    }
  }

  /**
   * <p>The request to update a streaming distribution.</p>
   */
  @js.native
  trait UpdateStreamingDistributionRequest extends js.Object {
    var Id: string
    var StreamingDistributionConfig: StreamingDistributionConfig
    var IfMatch: js.UndefOr[string]
  }

  object UpdateStreamingDistributionRequest {
    def apply(
      Id: string,
      StreamingDistributionConfig: StreamingDistributionConfig,
      IfMatch: js.UndefOr[string] = js.undefined): UpdateStreamingDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "StreamingDistributionConfig" -> StreamingDistributionConfig.asInstanceOf[js.Any],
        "IfMatch" -> IfMatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStreamingDistributionRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait UpdateStreamingDistributionResult extends js.Object {
    var ETag: js.UndefOr[string]
    var StreamingDistribution: js.UndefOr[StreamingDistribution]
  }

  object UpdateStreamingDistributionResult {
    def apply(
      ETag: js.UndefOr[string] = js.undefined,
      StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined): UpdateStreamingDistributionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ETag" -> ETag.map { x => x.asInstanceOf[js.Any] },
        "StreamingDistribution" -> StreamingDistribution.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStreamingDistributionResult]
    }
  }

  /**
   * <p>A complex type that specifies the following:</p> <ul> <li> <p>Whether you want viewers to use HTTP or HTTPS to request your objects.</p> </li> <li> <p>If you want viewers to use HTTPS, whether you're using an alternate domain name such as <code>example.com</code> or the CloudFront domain name for your distribution, such as <code>d111111abcdef8.cloudfront.net</code>.</p> </li> <li> <p>If you're using an alternate domain name, whether AWS Certificate Manager (ACM) provided the certificate, or you purchased a certificate from a third-party certificate authority and imported it into ACM or uploaded it to the IAM certificate store.</p> </li> </ul> <p>You must specify only one of the following values: </p> <ul> <li> <p> <a>ViewerCertificate$ACMCertificateArn</a> </p> </li> <li> <p> <a>ViewerCertificate$IAMCertificateId</a> </p> </li> <li> <p> <a>ViewerCertificate$CloudFrontDefaultCertificate</a> </p> </li> </ul> <p>Don't specify <code>false</code> for <code>CloudFrontDefaultCertificate</code>.</p> <p> <b>If you want viewers to use HTTP instead of HTTPS to request your objects</b>: Specify the following value:</p> <p> <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;</code> </p> <p>In addition, specify <code>allow-all</code> for <code>ViewerProtocolPolicy</code> for all of your cache behaviors.</p> <p> <b>If you want viewers to use HTTPS to request your objects</b>: Choose the type of certificate that you want to use based on whether you're using an alternate domain name for your objects or the CloudFront domain name:</p> <ul> <li> <p> <b>If you're using an alternate domain name, such as example.com</b>: Specify one of the following values, depending on whether ACM provided your certificate or you purchased your certificate from third-party certificate authority:</p> <ul> <li> <p> <code>&lt;ACMCertificateArn&gt;<i>ARN for ACM SSL/TLS certificate</i>&lt;ACMCertificateArn&gt;</code> where <code> <i>ARN for ACM SSL/TLS certificate</i> </code> is the ARN for the ACM SSL/TLS certificate that you want to use for this distribution.</p> </li> <li> <p> <code>&lt;IAMCertificateId&gt;<i>IAM certificate ID</i>&lt;IAMCertificateId&gt;</code> where <code> <i>IAM certificate ID</i> </code> is the ID that IAM returned when you added the certificate to the IAM certificate store.</p> </li> </ul> <p>If you specify <code>ACMCertificateArn</code> or <code>IAMCertificateId</code>, you must also specify a value for <code>SSLSupportMethod</code>.</p> <p>If you choose to use an ACM certificate or a certificate in the IAM certificate store, we recommend that you use only an alternate domain name in your object URLs (<code>https://example.com/logo.jpg</code>). If you use the domain name that is associated with your CloudFront distribution (such as <code>https://d111111abcdef8.cloudfront.net/logo.jpg</code>) and the viewer supports <code>SNI</code>, then CloudFront behaves normally. However, if the browser does not support SNI, the user's experience depends on the value that you choose for <code>SSLSupportMethod</code>:</p> <ul> <li> <p> <code>vip</code>: The viewer displays a warning because there is a mismatch between the CloudFront domain name and the domain name in your SSL/TLS certificate.</p> </li> <li> <p> <code>sni-only</code>: CloudFront drops the connection with the browser without returning the object.</p> </li> </ul> </li> <li> <p> <b>If you're using the CloudFront domain name for your distribution, such as <code>d111111abcdef8.cloudfront.net</code> </b>: Specify the following value:</p> <p> <code>&lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt; </code> </p> </li> </ul> <p>If you want viewers to use HTTPS, you must also specify one of the following values in your cache behaviors:</p> <ul> <li> <p> <code> &lt;ViewerProtocolPolicy&gt;https-only&lt;ViewerProtocolPolicy&gt;</code> </p> </li> <li> <p> <code>&lt;ViewerProtocolPolicy&gt;redirect-to-https&lt;ViewerProtocolPolicy&gt;</code> </p> </li> </ul> <p>You can also optionally require that CloudFront use HTTPS to communicate with your origin by specifying one of the following values for the applicable origins:</p> <ul> <li> <p> <code>&lt;OriginProtocolPolicy&gt;https-only&lt;OriginProtocolPolicy&gt; </code> </p> </li> <li> <p> <code>&lt;OriginProtocolPolicy&gt;match-viewer&lt;OriginProtocolPolicy&gt; </code> </p> </li> </ul> <p>For more information, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html#CNAMEsAndHTTPS">Using Alternate Domain Names and HTTPS</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait ViewerCertificate extends js.Object {
    var ACMCertificateArn: js.UndefOr[string]
    var Certificate: js.UndefOr[string]
    var CertificateSource: js.UndefOr[CertificateSource]
    var CloudFrontDefaultCertificate: js.UndefOr[boolean]
    var IAMCertificateId: js.UndefOr[string]
    var MinimumProtocolVersion: js.UndefOr[MinimumProtocolVersion]
    var SSLSupportMethod: js.UndefOr[SSLSupportMethod]
  }

  object ViewerCertificate {
    def apply(
      ACMCertificateArn: js.UndefOr[string] = js.undefined,
      Certificate: js.UndefOr[string] = js.undefined,
      CertificateSource: js.UndefOr[CertificateSource] = js.undefined,
      CloudFrontDefaultCertificate: js.UndefOr[boolean] = js.undefined,
      IAMCertificateId: js.UndefOr[string] = js.undefined,
      MinimumProtocolVersion: js.UndefOr[MinimumProtocolVersion] = js.undefined,
      SSLSupportMethod: js.UndefOr[SSLSupportMethod] = js.undefined): ViewerCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ACMCertificateArn" -> ACMCertificateArn.map { x => x.asInstanceOf[js.Any] },
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] },
        "CertificateSource" -> CertificateSource.map { x => x.asInstanceOf[js.Any] },
        "CloudFrontDefaultCertificate" -> CloudFrontDefaultCertificate.map { x => x.asInstanceOf[js.Any] },
        "IAMCertificateId" -> IAMCertificateId.map { x => x.asInstanceOf[js.Any] },
        "MinimumProtocolVersion" -> MinimumProtocolVersion.map { x => x.asInstanceOf[js.Any] },
        "SSLSupportMethod" -> SSLSupportMethod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ViewerCertificate]
    }
  }

  object ViewerProtocolPolicyEnum {
    val `allow-all` = "allow-all"
    val `https-only` = "https-only"
    val `redirect-to-https` = "redirect-to-https"

    val values = IndexedSeq(`allow-all`, `https-only`, `redirect-to-https`)
  }
}
