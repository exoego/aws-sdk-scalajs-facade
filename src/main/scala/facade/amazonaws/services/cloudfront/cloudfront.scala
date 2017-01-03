package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object cloudfront {
  type AliasList = js.Array[string]
  type AwsAccountNumberList = js.Array[string]
  type CacheBehaviorList = js.Array[CacheBehavior]
  type CertificateSource = String
  type CloudFrontOriginAccessIdentitySummaryList = js.Array[CloudFrontOriginAccessIdentitySummary]
  type CookieNameList = js.Array[string]
  type CustomErrorResponseList = js.Array[CustomErrorResponse]
  type DistributionSummaryList = js.Array[DistributionSummary]
  type EventType = String
  type GeoRestrictionType = String
  type HeaderList = js.Array[string]
  type HttpVersion = String
  type InvalidationSummaryList = js.Array[InvalidationSummary]
  type ItemSelection = String
  type KeyPairIdList = js.Array[string]
  type LambdaFunctionAssociationList = js.Array[LambdaFunctionAssociation]
  type LocationList = js.Array[string]
  type Method = String
  type MethodsList = js.Array[Method]
  type MinimumProtocolVersion = String
  type OriginCustomHeadersList = js.Array[OriginCustomHeader]
  type OriginList = js.Array[Origin]
  type OriginProtocolPolicy = String
  type PathList = js.Array[string]
  type PriceClass = String
  type QueryStringCacheKeysList = js.Array[string]
  type ResourceARN = String
  type SSLSupportMethod = String
  type SignerList = js.Array[Signer]
  type SslProtocol = String
  type SslProtocolsList = js.Array[SslProtocol]
  type StreamingDistributionSummaryList = js.Array[StreamingDistributionSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type ViewerProtocolPolicy = String
  type boolean = Boolean
  type integer = Integer
  type long = Long
  type string = String
  type timestamp = js.Date
}

package cloudfront {
  @js.native
  trait Cloudfront extends js.Object {
    def createCloudFrontOriginAccessIdentity(params: CreateCloudFrontOriginAccessIdentityRequest, callback: Callback[CreateCloudFrontOriginAccessIdentityResult]): Unit = js.native
    def createCloudFrontOriginAccessIdentity(params: CreateCloudFrontOriginAccessIdentityRequest): Request[CreateCloudFrontOriginAccessIdentityResult] = js.native
    def createDistribution(params: CreateDistributionRequest, callback: Callback[CreateDistributionResult]): Unit = js.native
    def createDistribution(params: CreateDistributionRequest): Request[CreateDistributionResult] = js.native
    def createDistributionWithTags(params: CreateDistributionWithTagsRequest, callback: Callback[CreateDistributionWithTagsResult]): Unit = js.native
    def createDistributionWithTags(params: CreateDistributionWithTagsRequest): Request[CreateDistributionWithTagsResult] = js.native
    def createInvalidation(params: CreateInvalidationRequest, callback: Callback[CreateInvalidationResult]): Unit = js.native
    def createInvalidation(params: CreateInvalidationRequest): Request[CreateInvalidationResult] = js.native
    def createStreamingDistribution(params: CreateStreamingDistributionRequest, callback: Callback[CreateStreamingDistributionResult]): Unit = js.native
    def createStreamingDistribution(params: CreateStreamingDistributionRequest): Request[CreateStreamingDistributionResult] = js.native
    def createStreamingDistributionWithTags(params: CreateStreamingDistributionWithTagsRequest, callback: Callback[CreateStreamingDistributionWithTagsResult]): Unit = js.native
    def createStreamingDistributionWithTags(params: CreateStreamingDistributionWithTagsRequest): Request[CreateStreamingDistributionWithTagsResult] = js.native
    def deleteCloudFrontOriginAccessIdentity(params: DeleteCloudFrontOriginAccessIdentityRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteCloudFrontOriginAccessIdentity(params: DeleteCloudFrontOriginAccessIdentityRequest): Request[js.Object] = js.native
    def deleteDistribution(params: DeleteDistributionRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteDistribution(params: DeleteDistributionRequest): Request[js.Object] = js.native
    def deleteStreamingDistribution(params: DeleteStreamingDistributionRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteStreamingDistribution(params: DeleteStreamingDistributionRequest): Request[js.Object] = js.native
    def getCloudFrontOriginAccessIdentity(params: GetCloudFrontOriginAccessIdentityRequest, callback: Callback[GetCloudFrontOriginAccessIdentityResult]): Unit = js.native
    def getCloudFrontOriginAccessIdentity(params: GetCloudFrontOriginAccessIdentityRequest): Request[GetCloudFrontOriginAccessIdentityResult] = js.native
    def getCloudFrontOriginAccessIdentityConfig(params: GetCloudFrontOriginAccessIdentityConfigRequest, callback: Callback[GetCloudFrontOriginAccessIdentityConfigResult]): Unit = js.native
    def getCloudFrontOriginAccessIdentityConfig(params: GetCloudFrontOriginAccessIdentityConfigRequest): Request[GetCloudFrontOriginAccessIdentityConfigResult] = js.native
    def getDistribution(params: GetDistributionRequest, callback: Callback[GetDistributionResult]): Unit = js.native
    def getDistribution(params: GetDistributionRequest): Request[GetDistributionResult] = js.native
    def getDistributionConfig(params: GetDistributionConfigRequest, callback: Callback[GetDistributionConfigResult]): Unit = js.native
    def getDistributionConfig(params: GetDistributionConfigRequest): Request[GetDistributionConfigResult] = js.native
    def getInvalidation(params: GetInvalidationRequest, callback: Callback[GetInvalidationResult]): Unit = js.native
    def getInvalidation(params: GetInvalidationRequest): Request[GetInvalidationResult] = js.native
    def getStreamingDistribution(params: GetStreamingDistributionRequest, callback: Callback[GetStreamingDistributionResult]): Unit = js.native
    def getStreamingDistribution(params: GetStreamingDistributionRequest): Request[GetStreamingDistributionResult] = js.native
    def getStreamingDistributionConfig(params: GetStreamingDistributionConfigRequest, callback: Callback[GetStreamingDistributionConfigResult]): Unit = js.native
    def getStreamingDistributionConfig(params: GetStreamingDistributionConfigRequest): Request[GetStreamingDistributionConfigResult] = js.native
    def listCloudFrontOriginAccessIdentities(params: ListCloudFrontOriginAccessIdentitiesRequest, callback: Callback[ListCloudFrontOriginAccessIdentitiesResult]): Unit = js.native
    def listCloudFrontOriginAccessIdentities(params: ListCloudFrontOriginAccessIdentitiesRequest): Request[ListCloudFrontOriginAccessIdentitiesResult] = js.native
    def listDistributions(params: ListDistributionsRequest, callback: Callback[ListDistributionsResult]): Unit = js.native
    def listDistributions(params: ListDistributionsRequest): Request[ListDistributionsResult] = js.native
    def listDistributionsByWebACLId(params: ListDistributionsByWebACLIdRequest, callback: Callback[ListDistributionsByWebACLIdResult]): Unit = js.native
    def listDistributionsByWebACLId(params: ListDistributionsByWebACLIdRequest): Request[ListDistributionsByWebACLIdResult] = js.native
    def listInvalidations(params: ListInvalidationsRequest, callback: Callback[ListInvalidationsResult]): Unit = js.native
    def listInvalidations(params: ListInvalidationsRequest): Request[ListInvalidationsResult] = js.native
    def listStreamingDistributions(params: ListStreamingDistributionsRequest, callback: Callback[ListStreamingDistributionsResult]): Unit = js.native
    def listStreamingDistributions(params: ListStreamingDistributionsRequest): Request[ListStreamingDistributionsResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest, callback: Callback[ListTagsForResourceResult]): Unit = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def tagResource(params: TagResourceRequest, callback: Callback[js.Object]): Unit = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest, callback: Callback[js.Object]): Unit = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateCloudFrontOriginAccessIdentity(params: UpdateCloudFrontOriginAccessIdentityRequest, callback: Callback[UpdateCloudFrontOriginAccessIdentityResult]): Unit = js.native
    def updateCloudFrontOriginAccessIdentity(params: UpdateCloudFrontOriginAccessIdentityRequest): Request[UpdateCloudFrontOriginAccessIdentityResult] = js.native
    def updateDistribution(params: UpdateDistributionRequest, callback: Callback[UpdateDistributionResult]): Unit = js.native
    def updateDistribution(params: UpdateDistributionRequest): Request[UpdateDistributionResult] = js.native
    def updateStreamingDistribution(params: UpdateStreamingDistributionRequest, callback: Callback[UpdateStreamingDistributionResult]): Unit = js.native
    def updateStreamingDistribution(params: UpdateStreamingDistributionRequest): Request[UpdateStreamingDistributionResult] = js.native
  }

  /**
   * <p>Access denied.</p>
   */
  @js.native
  trait AccessDeniedException extends js.Object {
    var Message: string
  }

  /**
   * <p>A complex type that lists the AWS accounts, if any, that you included in the <code>TrustedSigners</code> complex type for this distribution. These are the accounts that you want to allow to create signed URLs for private content.</p> <p>The <code>Signer</code> complex type lists the AWS account number of the trusted signer or <code>self</code> if the signer is the AWS account that created the distribution. The <code>Signer</code> element also includes the IDs of any active CloudFront key pairs that are associated with the trusted signer's AWS account. If no <code>KeyPairId</code> element appears for a <code>Signer</code>, that signer can't create signed URLs. </p> <p>For more information, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait ActiveTrustedSigners extends js.Object {
    var Enabled: boolean
    var Quantity: integer
    var Items: SignerList
  }

  object ActiveTrustedSigners {
    def apply(
      Enabled: js.UndefOr[boolean] = js.undefined,
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[SignerList] = js.undefined
    ): ActiveTrustedSigners = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActiveTrustedSigners]
    }
  }

  /**
   * <p>A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution. </p>
   */
  @js.native
  trait Aliases extends js.Object {
    var Quantity: integer
    var Items: AliasList
  }

  object Aliases {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[AliasList] = js.undefined
    ): Aliases = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Aliases]
    }
  }

  /**
   * <p>A complex type that controls which HTTP methods CloudFront processes and forwards to your Amazon S3 bucket or your custom origin. There are three choices:</p> <ul> <li> <p>CloudFront forwards only <code>GET</code> and <code>HEAD</code> requests.</p> </li> <li> <p>CloudFront forwards only <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests.</p> </li> <li> <p>CloudFront forwards <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and <code>DELETE</code> requests.</p> </li> </ul> <p>If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or to your custom origin so users can't perform operations that you don't want them to. For example, you might not want users to have permissions to delete objects from your origin.</p>
   */
  @js.native
  trait AllowedMethods extends js.Object {
    var Quantity: integer
    var Items: MethodsList
    var CachedMethods: CachedMethods
  }

  object AllowedMethods {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[MethodsList] = js.undefined,
      CachedMethods: js.UndefOr[CachedMethods] = js.undefined
    ): AllowedMethods = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any }),
        ("CachedMethods" -> CachedMethods.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllowedMethods]
    }
  }

  @js.native
  trait BatchTooLargeException extends js.Object {
    var Message: string
  }

  @js.native
  trait CNAMEAlreadyExistsException extends js.Object {
    var Message: string
  }

  /**
   * <p>A complex type that describes how CloudFront processes requests.</p> <p>You must create at least as many cache behaviors (including the default cache behavior) as you have origins if you want CloudFront to distribute objects from all of the origins. Each cache behavior specifies the one origin from which you want CloudFront to get objects. If you have two origins and only the default cache behavior, the default cache behavior will cause CloudFront to get objects from one of the origins, but the other origin is never used.</p> <p>For the current limit on the number of cache behaviors that you can add to a distribution, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon CloudFront Limits</a> in the <i>AWS General Reference</i>.</p> <p>If you don't want to specify any cache behaviors, include only an empty <code>CacheBehaviors</code> element. Don't include an empty <code>CacheBehavior</code> element, or CloudFront returns a <code>MalformedXML</code> error.</p> <p>To delete all cache behaviors in an existing distribution, update the distribution configuration and include only an empty <code>CacheBehaviors</code> element.</p> <p>To add, change, or remove one or more cache behaviors, update the distribution configuration and specify all of the cache behaviors that you want to include in the updated distribution.</p> <p>For more information about cache behaviors, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior">Cache Behaviors</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait CacheBehavior extends js.Object {
    var PathPattern: string
    var TrustedSigners: TrustedSigners
    var SmoothStreaming: boolean
    var MaxTTL: long
    var ForwardedValues: ForwardedValues
    var AllowedMethods: AllowedMethods
    var TargetOriginId: string
    var DefaultTTL: long
    var Compress: boolean
    var LambdaFunctionAssociations: LambdaFunctionAssociations
    var MinTTL: long
    var ViewerProtocolPolicy: ViewerProtocolPolicy
  }

  object CacheBehavior {
    def apply(
      PathPattern: js.UndefOr[string] = js.undefined,
      TrustedSigners: js.UndefOr[TrustedSigners] = js.undefined,
      SmoothStreaming: js.UndefOr[boolean] = js.undefined,
      MaxTTL: js.UndefOr[long] = js.undefined,
      ForwardedValues: js.UndefOr[ForwardedValues] = js.undefined,
      AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
      TargetOriginId: js.UndefOr[string] = js.undefined,
      DefaultTTL: js.UndefOr[long] = js.undefined,
      Compress: js.UndefOr[boolean] = js.undefined,
      LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations] = js.undefined,
      MinTTL: js.UndefOr[long] = js.undefined,
      ViewerProtocolPolicy: js.UndefOr[ViewerProtocolPolicy] = js.undefined
    ): CacheBehavior = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PathPattern" -> PathPattern.map { x => x: js.Any }),
        ("TrustedSigners" -> TrustedSigners.map { x => x: js.Any }),
        ("SmoothStreaming" -> SmoothStreaming.map { x => x: js.Any }),
        ("MaxTTL" -> MaxTTL.map { x => x: js.Any }),
        ("ForwardedValues" -> ForwardedValues.map { x => x: js.Any }),
        ("AllowedMethods" -> AllowedMethods.map { x => x: js.Any }),
        ("TargetOriginId" -> TargetOriginId.map { x => x: js.Any }),
        ("DefaultTTL" -> DefaultTTL.map { x => x: js.Any }),
        ("Compress" -> Compress.map { x => x: js.Any }),
        ("LambdaFunctionAssociations" -> LambdaFunctionAssociations.map { x => x: js.Any }),
        ("MinTTL" -> MinTTL.map { x => x: js.Any }),
        ("ViewerProtocolPolicy" -> ViewerProtocolPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheBehavior]
    }
  }

  /**
   * <p>A complex type that contains zero or more <code>CacheBehavior</code> elements. </p>
   */
  @js.native
  trait CacheBehaviors extends js.Object {
    var Quantity: integer
    var Items: CacheBehaviorList
  }

  object CacheBehaviors {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[CacheBehaviorList] = js.undefined
    ): CacheBehaviors = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheBehaviors]
    }
  }

  /**
   * <p>A complex type that controls whether CloudFront caches the response to requests using the specified HTTP methods. There are two choices:</p> <ul> <li> <p>CloudFront caches responses to <code>GET</code> and <code>HEAD</code> requests.</p> </li> <li> <p>CloudFront caches responses to <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests.</p> </li> </ul> <p>If you pick the second choice for your Amazon S3 Origin, you may need to forward Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the responses to be cached correctly. </p>
   */
  @js.native
  trait CachedMethods extends js.Object {
    var Quantity: integer
    var Items: MethodsList
  }

  object CachedMethods {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[MethodsList] = js.undefined
    ): CachedMethods = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig
  }

  object CloudFrontOriginAccessIdentity {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      S3CanonicalUserId: js.UndefOr[string] = js.undefined,
      CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined
    ): CloudFrontOriginAccessIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("S3CanonicalUserId" -> S3CanonicalUserId.map { x => x: js.Any }),
        ("CloudFrontOriginAccessIdentityConfig" -> CloudFrontOriginAccessIdentityConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudFrontOriginAccessIdentity]
    }
  }

  /**
   * <p>If the <code>CallerReference</code> is a value you already sent in a previous request to create an identity but the content of the <code>CloudFrontOriginAccessIdentityConfig</code> is different from the original request, CloudFront returns a <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error. </p>
   */
  @js.native
  trait CloudFrontOriginAccessIdentityAlreadyExistsException extends js.Object {
    var Message: string
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
      CallerReference: js.UndefOr[string] = js.undefined,
      Comment: js.UndefOr[string] = js.undefined
    ): CloudFrontOriginAccessIdentityConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CallerReference" -> CallerReference.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudFrontOriginAccessIdentityConfig]
    }
  }

  @js.native
  trait CloudFrontOriginAccessIdentityInUseException extends js.Object {
    var Message: string
  }

  /**
   * <p>Lists the origin access identities for CloudFront.Send a <code>GET</code> request to the <code>/<i>CloudFront API version</i>/origin-access-identity/cloudfront</code> resource. The response includes a <code>CloudFrontOriginAccessIdentityList</code> element with zero or more <code>CloudFrontOriginAccessIdentitySummary</code> child elements. By default, your entire list of origin access identities is returned in one single page. If the list is long, you can paginate it using the <code>MaxItems</code> and <code>Marker</code> parameters.</p>
   */
  @js.native
  trait CloudFrontOriginAccessIdentityList extends js.Object {
    var Quantity: integer
    var IsTruncated: boolean
    var MaxItems: integer
    var NextMarker: string
    var Items: CloudFrontOriginAccessIdentitySummaryList
    var Marker: string
  }

  object CloudFrontOriginAccessIdentityList {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      IsTruncated: js.UndefOr[boolean] = js.undefined,
      MaxItems: js.UndefOr[integer] = js.undefined,
      NextMarker: js.UndefOr[string] = js.undefined,
      Items: js.UndefOr[CloudFrontOriginAccessIdentitySummaryList] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined
    ): CloudFrontOriginAccessIdentityList = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudFrontOriginAccessIdentityList]
    }
  }

  /**
   * <p>Summary of the information about a CloudFront origin access identity.</p>
   */
  @js.native
  trait CloudFrontOriginAccessIdentitySummary extends js.Object {
    var Id: string
    var S3CanonicalUserId: string
    var Comment: string
  }

  object CloudFrontOriginAccessIdentitySummary {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      S3CanonicalUserId: js.UndefOr[string] = js.undefined,
      Comment: js.UndefOr[string] = js.undefined
    ): CloudFrontOriginAccessIdentitySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("S3CanonicalUserId" -> S3CanonicalUserId.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudFrontOriginAccessIdentitySummary]
    }
  }

  /**
   * <p>A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones. For more information about forwarding cookies to the origin, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html">How CloudFront Forwards, Caches, and Logs Cookies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait CookieNames extends js.Object {
    var Quantity: integer
    var Items: CookieNameList
  }

  object CookieNames {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[CookieNameList] = js.undefined
    ): CookieNames = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CookieNames]
    }
  }

  /**
   * <p>A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones. For more information about forwarding cookies to the origin, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html">How CloudFront Forwards, Caches, and Logs Cookies</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait CookiePreference extends js.Object {
    var Forward: ItemSelection
    var WhitelistedNames: CookieNames
  }

  object CookiePreference {
    def apply(
      Forward: js.UndefOr[ItemSelection] = js.undefined,
      WhitelistedNames: js.UndefOr[CookieNames] = js.undefined
    ): CookiePreference = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Forward" -> Forward.map { x => x: js.Any }),
        ("WhitelistedNames" -> WhitelistedNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined
    ): CreateCloudFrontOriginAccessIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudFrontOriginAccessIdentityConfig" -> CloudFrontOriginAccessIdentityConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCloudFrontOriginAccessIdentityRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait CreateCloudFrontOriginAccessIdentityResult extends js.Object {
    var CloudFrontOriginAccessIdentity: CloudFrontOriginAccessIdentity
    var Location: string
    var ETag: string
  }

  object CreateCloudFrontOriginAccessIdentityResult {
    def apply(
      CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined,
      Location: js.UndefOr[string] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): CreateCloudFrontOriginAccessIdentityResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudFrontOriginAccessIdentity" -> CloudFrontOriginAccessIdentity.map { x => x: js.Any }),
        ("Location" -> Location.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      DistributionConfig: js.UndefOr[DistributionConfig] = js.undefined
    ): CreateDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DistributionConfig" -> DistributionConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDistributionRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait CreateDistributionResult extends js.Object {
    var Distribution: Distribution
    var Location: string
    var ETag: string
  }

  object CreateDistributionResult {
    def apply(
      Distribution: js.UndefOr[Distribution] = js.undefined,
      Location: js.UndefOr[string] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): CreateDistributionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Distribution" -> Distribution.map { x => x: js.Any }),
        ("Location" -> Location.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      DistributionConfigWithTags: js.UndefOr[DistributionConfigWithTags] = js.undefined
    ): CreateDistributionWithTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DistributionConfigWithTags" -> DistributionConfigWithTags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDistributionWithTagsRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request. </p>
   */
  @js.native
  trait CreateDistributionWithTagsResult extends js.Object {
    var Distribution: Distribution
    var Location: string
    var ETag: string
  }

  object CreateDistributionWithTagsResult {
    def apply(
      Distribution: js.UndefOr[Distribution] = js.undefined,
      Location: js.UndefOr[string] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): CreateDistributionWithTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Distribution" -> Distribution.map { x => x: js.Any }),
        ("Location" -> Location.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDistributionWithTagsResult]
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
      DistributionId: js.UndefOr[string] = js.undefined,
      InvalidationBatch: js.UndefOr[InvalidationBatch] = js.undefined
    ): CreateInvalidationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DistributionId" -> DistributionId.map { x => x: js.Any }),
        ("InvalidationBatch" -> InvalidationBatch.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInvalidationRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait CreateInvalidationResult extends js.Object {
    var Location: string
    var Invalidation: Invalidation
  }

  object CreateInvalidationResult {
    def apply(
      Location: js.UndefOr[string] = js.undefined,
      Invalidation: js.UndefOr[Invalidation] = js.undefined
    ): CreateInvalidationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Location" -> Location.map { x => x: js.Any }),
        ("Invalidation" -> Invalidation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInvalidationResult]
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
      StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig] = js.undefined
    ): CreateStreamingDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamingDistributionConfig" -> StreamingDistributionConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamingDistributionRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait CreateStreamingDistributionResult extends js.Object {
    var StreamingDistribution: StreamingDistribution
    var Location: string
    var ETag: string
  }

  object CreateStreamingDistributionResult {
    def apply(
      StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined,
      Location: js.UndefOr[string] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): CreateStreamingDistributionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamingDistribution" -> StreamingDistribution.map { x => x: js.Any }),
        ("Location" -> Location.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      StreamingDistributionConfigWithTags: js.UndefOr[StreamingDistributionConfigWithTags] = js.undefined
    ): CreateStreamingDistributionWithTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamingDistributionConfigWithTags" -> StreamingDistributionConfigWithTags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamingDistributionWithTagsRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request. </p>
   */
  @js.native
  trait CreateStreamingDistributionWithTagsResult extends js.Object {
    var StreamingDistribution: StreamingDistribution
    var Location: string
    var ETag: string
  }

  object CreateStreamingDistributionWithTagsResult {
    def apply(
      StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined,
      Location: js.UndefOr[string] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): CreateStreamingDistributionWithTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamingDistribution" -> StreamingDistribution.map { x => x: js.Any }),
        ("Location" -> Location.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamingDistributionWithTagsResult]
    }
  }

  /**
   * <p>A complex type that controls:</p> <ul> <li> <p>Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning the response to the viewer. </p> </li> <li> <p>How long CloudFront caches HTTP status codes in the 4xx and 5xx range.</p> </li> </ul> <p>For more information about custom error pages, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html">Customizing Error Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait CustomErrorResponse extends js.Object {
    var ErrorCode: integer
    var ResponsePagePath: string
    var ResponseCode: string
    var ErrorCachingMinTTL: long
  }

  object CustomErrorResponse {
    def apply(
      ErrorCode: js.UndefOr[integer] = js.undefined,
      ResponsePagePath: js.UndefOr[string] = js.undefined,
      ResponseCode: js.UndefOr[string] = js.undefined,
      ErrorCachingMinTTL: js.UndefOr[long] = js.undefined
    ): CustomErrorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ErrorCode" -> ErrorCode.map { x => x: js.Any }),
        ("ResponsePagePath" -> ResponsePagePath.map { x => x: js.Any }),
        ("ResponseCode" -> ResponseCode.map { x => x: js.Any }),
        ("ErrorCachingMinTTL" -> ErrorCachingMinTTL.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomErrorResponse]
    }
  }

  /**
   * <p>A complex type that controls:</p> <ul> <li> <p>Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning the response to the viewer.</p> </li> <li> <p>How long CloudFront caches HTTP status codes in the 4xx and 5xx range.</p> </li> </ul> <p>For more information about custom error pages, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html">Customizing Error Responses</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait CustomErrorResponses extends js.Object {
    var Quantity: integer
    var Items: CustomErrorResponseList
  }

  object CustomErrorResponses {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[CustomErrorResponseList] = js.undefined
    ): CustomErrorResponses = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomErrorResponses]
    }
  }

  /**
   * <p>A complex type that contains the list of Custom Headers for each origin. </p>
   */
  @js.native
  trait CustomHeaders extends js.Object {
    var Quantity: integer
    var Items: OriginCustomHeadersList
  }

  object CustomHeaders {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[OriginCustomHeadersList] = js.undefined
    ): CustomHeaders = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomHeaders]
    }
  }

  /**
   * <p>A customer origin.</p>
   */
  @js.native
  trait CustomOriginConfig extends js.Object {
    var HTTPPort: integer
    var HTTPSPort: integer
    var OriginProtocolPolicy: OriginProtocolPolicy
    var OriginSslProtocols: OriginSslProtocols
  }

  object CustomOriginConfig {
    def apply(
      HTTPPort: js.UndefOr[integer] = js.undefined,
      HTTPSPort: js.UndefOr[integer] = js.undefined,
      OriginProtocolPolicy: js.UndefOr[OriginProtocolPolicy] = js.undefined,
      OriginSslProtocols: js.UndefOr[OriginSslProtocols] = js.undefined
    ): CustomOriginConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HTTPPort" -> HTTPPort.map { x => x: js.Any }),
        ("HTTPSPort" -> HTTPSPort.map { x => x: js.Any }),
        ("OriginProtocolPolicy" -> OriginProtocolPolicy.map { x => x: js.Any }),
        ("OriginSslProtocols" -> OriginSslProtocols.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomOriginConfig]
    }
  }

  /**
   * <p>A complex type that describes the default cache behavior if you do not specify a <code>CacheBehavior</code> element or if files don't match any of the values of <code>PathPattern</code> in <code>CacheBehavior</code> elements. You must create exactly one default cache behavior.</p>
   */
  @js.native
  trait DefaultCacheBehavior extends js.Object {
    var TrustedSigners: TrustedSigners
    var SmoothStreaming: boolean
    var MaxTTL: long
    var ForwardedValues: ForwardedValues
    var AllowedMethods: AllowedMethods
    var TargetOriginId: string
    var DefaultTTL: long
    var Compress: boolean
    var LambdaFunctionAssociations: LambdaFunctionAssociations
    var MinTTL: long
    var ViewerProtocolPolicy: ViewerProtocolPolicy
  }

  object DefaultCacheBehavior {
    def apply(
      TrustedSigners: js.UndefOr[TrustedSigners] = js.undefined,
      SmoothStreaming: js.UndefOr[boolean] = js.undefined,
      MaxTTL: js.UndefOr[long] = js.undefined,
      ForwardedValues: js.UndefOr[ForwardedValues] = js.undefined,
      AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
      TargetOriginId: js.UndefOr[string] = js.undefined,
      DefaultTTL: js.UndefOr[long] = js.undefined,
      Compress: js.UndefOr[boolean] = js.undefined,
      LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations] = js.undefined,
      MinTTL: js.UndefOr[long] = js.undefined,
      ViewerProtocolPolicy: js.UndefOr[ViewerProtocolPolicy] = js.undefined
    ): DefaultCacheBehavior = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrustedSigners" -> TrustedSigners.map { x => x: js.Any }),
        ("SmoothStreaming" -> SmoothStreaming.map { x => x: js.Any }),
        ("MaxTTL" -> MaxTTL.map { x => x: js.Any }),
        ("ForwardedValues" -> ForwardedValues.map { x => x: js.Any }),
        ("AllowedMethods" -> AllowedMethods.map { x => x: js.Any }),
        ("TargetOriginId" -> TargetOriginId.map { x => x: js.Any }),
        ("DefaultTTL" -> DefaultTTL.map { x => x: js.Any }),
        ("Compress" -> Compress.map { x => x: js.Any }),
        ("LambdaFunctionAssociations" -> LambdaFunctionAssociations.map { x => x: js.Any }),
        ("MinTTL" -> MinTTL.map { x => x: js.Any }),
        ("ViewerProtocolPolicy" -> ViewerProtocolPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefaultCacheBehavior]
    }
  }

  /**
   * <p>Deletes a origin access identity.</p>
   */
  @js.native
  trait DeleteCloudFrontOriginAccessIdentityRequest extends js.Object {
    var Id: string
    var IfMatch: string
  }

  object DeleteCloudFrontOriginAccessIdentityRequest {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      IfMatch: js.UndefOr[string] = js.undefined
    ): DeleteCloudFrontOriginAccessIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("IfMatch" -> IfMatch.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCloudFrontOriginAccessIdentityRequest]
    }
  }

  /**
   * <p>This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the following steps.</p> <p> <b>To delete a web distribution using the CloudFront API:</b> </p> <ol> <li> <p>Disable the web distribution </p> </li> <li> <p>Submit a <code>GET Distribution Config</code> request to get the current configuration and the <code>Etag</code> header for the distribution.</p> </li> <li> <p>Update the XML document that was returned in the response to your <code>GET Distribution Config</code> request to change the value of <code>Enabled</code> to <code>false</code>.</p> </li> <li> <p>Submit a <code>PUT Distribution Config</code> request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Set the value of the HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when you submitted the <code>GET Distribution Config</code> request in Step 2.</p> </li> <li> <p>Review the response to the <code>PUT Distribution Config</code> request to confirm that the distribution was successfully disabled.</p> </li> <li> <p>Submit a <code>GET Distribution</code> request to confirm that your changes have propagated. When propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.</p> </li> <li> <p>Submit a <code>DELETE Distribution</code> request. Set the value of the HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when you submitted the <code>GET Distribution Config</code> request in Step 6.</p> </li> <li> <p>Review the response to your <code>DELETE Distribution</code> request to confirm that the distribution was successfully deleted.</p> </li> </ol> <p>For information about deleting a distribution using the CloudFront console, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html">Deleting a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait DeleteDistributionRequest extends js.Object {
    var Id: string
    var IfMatch: string
  }

  object DeleteDistributionRequest {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      IfMatch: js.UndefOr[string] = js.undefined
    ): DeleteDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("IfMatch" -> IfMatch.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDistributionRequest]
    }
  }

  /**
   * <p>The request to delete a streaming distribution.</p>
   */
  @js.native
  trait DeleteStreamingDistributionRequest extends js.Object {
    var Id: string
    var IfMatch: string
  }

  object DeleteStreamingDistributionRequest {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      IfMatch: js.UndefOr[string] = js.undefined
    ): DeleteStreamingDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("IfMatch" -> IfMatch.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamingDistributionRequest]
    }
  }

  /**
   * <p>The distribution's information.</p>
   */
  @js.native
  trait Distribution extends js.Object {
    var Id: string
    var ARN: string
    var DistributionConfig: DistributionConfig
    var InProgressInvalidationBatches: integer
    var LastModifiedTime: timestamp
    var DomainName: string
    var ActiveTrustedSigners: ActiveTrustedSigners
    var Status: string
  }

  object Distribution {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      ARN: js.UndefOr[string] = js.undefined,
      DistributionConfig: js.UndefOr[DistributionConfig] = js.undefined,
      InProgressInvalidationBatches: js.UndefOr[integer] = js.undefined,
      LastModifiedTime: js.UndefOr[timestamp] = js.undefined,
      DomainName: js.UndefOr[string] = js.undefined,
      ActiveTrustedSigners: js.UndefOr[ActiveTrustedSigners] = js.undefined,
      Status: js.UndefOr[string] = js.undefined
    ): Distribution = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("ARN" -> ARN.map { x => x: js.Any }),
        ("DistributionConfig" -> DistributionConfig.map { x => x: js.Any }),
        ("InProgressInvalidationBatches" -> InProgressInvalidationBatches.map { x => x: js.Any }),
        ("LastModifiedTime" -> LastModifiedTime.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("ActiveTrustedSigners" -> ActiveTrustedSigners.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Distribution]
    }
  }

  /**
   * <p>The caller reference you attempted to create the distribution with is associated with another distribution.</p>
   */
  @js.native
  trait DistributionAlreadyExistsException extends js.Object {
    var Message: string
  }

  /**
   * <p>A distribution configuration.</p>
   */
  @js.native
  trait DistributionConfig extends js.Object {
    var WebACLId: string
    var ViewerCertificate: ViewerCertificate
    var IsIPV6Enabled: boolean
    var CallerReference: string
    var Enabled: boolean
    var CacheBehaviors: CacheBehaviors
    var PriceClass: PriceClass
    var Origins: Origins
    var HttpVersion: HttpVersion
    var Logging: LoggingConfig
    var DefaultRootObject: string
    var CustomErrorResponses: CustomErrorResponses
    var Restrictions: Restrictions
    var Comment: string
    var DefaultCacheBehavior: DefaultCacheBehavior
    var Aliases: Aliases
  }

  object DistributionConfig {
    def apply(
      WebACLId: js.UndefOr[string] = js.undefined,
      ViewerCertificate: js.UndefOr[ViewerCertificate] = js.undefined,
      IsIPV6Enabled: js.UndefOr[boolean] = js.undefined,
      CallerReference: js.UndefOr[string] = js.undefined,
      Enabled: js.UndefOr[boolean] = js.undefined,
      CacheBehaviors: js.UndefOr[CacheBehaviors] = js.undefined,
      PriceClass: js.UndefOr[PriceClass] = js.undefined,
      Origins: js.UndefOr[Origins] = js.undefined,
      HttpVersion: js.UndefOr[HttpVersion] = js.undefined,
      Logging: js.UndefOr[LoggingConfig] = js.undefined,
      DefaultRootObject: js.UndefOr[string] = js.undefined,
      CustomErrorResponses: js.UndefOr[CustomErrorResponses] = js.undefined,
      Restrictions: js.UndefOr[Restrictions] = js.undefined,
      Comment: js.UndefOr[string] = js.undefined,
      DefaultCacheBehavior: js.UndefOr[DefaultCacheBehavior] = js.undefined,
      Aliases: js.UndefOr[Aliases] = js.undefined
    ): DistributionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WebACLId" -> WebACLId.map { x => x: js.Any }),
        ("ViewerCertificate" -> ViewerCertificate.map { x => x: js.Any }),
        ("IsIPV6Enabled" -> IsIPV6Enabled.map { x => x: js.Any }),
        ("CallerReference" -> CallerReference.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("CacheBehaviors" -> CacheBehaviors.map { x => x: js.Any }),
        ("PriceClass" -> PriceClass.map { x => x: js.Any }),
        ("Origins" -> Origins.map { x => x: js.Any }),
        ("HttpVersion" -> HttpVersion.map { x => x: js.Any }),
        ("Logging" -> Logging.map { x => x: js.Any }),
        ("DefaultRootObject" -> DefaultRootObject.map { x => x: js.Any }),
        ("CustomErrorResponses" -> CustomErrorResponses.map { x => x: js.Any }),
        ("Restrictions" -> Restrictions.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("DefaultCacheBehavior" -> DefaultCacheBehavior.map { x => x: js.Any }),
        ("Aliases" -> Aliases.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      DistributionConfig: js.UndefOr[DistributionConfig] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined
    ): DistributionConfigWithTags = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DistributionConfig" -> DistributionConfig.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DistributionConfigWithTags]
    }
  }

  /**
   * <p>A distribution list.</p>
   */
  @js.native
  trait DistributionList extends js.Object {
    var Quantity: integer
    var IsTruncated: boolean
    var MaxItems: integer
    var NextMarker: string
    var Items: DistributionSummaryList
    var Marker: string
  }

  object DistributionList {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      IsTruncated: js.UndefOr[boolean] = js.undefined,
      MaxItems: js.UndefOr[integer] = js.undefined,
      NextMarker: js.UndefOr[string] = js.undefined,
      Items: js.UndefOr[DistributionSummaryList] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined
    ): DistributionList = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DistributionList]
    }
  }

  @js.native
  trait DistributionNotDisabledException extends js.Object {
    var Message: string
  }

  /**
   * <p>A summary of the information about a CloudFront distribution.</p>
   */
  @js.native
  trait DistributionSummary extends js.Object {
    var Id: string
    var ARN: string
    var WebACLId: string
    var ViewerCertificate: ViewerCertificate
    var IsIPV6Enabled: boolean
    var Enabled: boolean
    var CacheBehaviors: CacheBehaviors
    var PriceClass: PriceClass
    var LastModifiedTime: timestamp
    var DomainName: string
    var Origins: Origins
    var HttpVersion: HttpVersion
    var CustomErrorResponses: CustomErrorResponses
    var Restrictions: Restrictions
    var Comment: string
    var DefaultCacheBehavior: DefaultCacheBehavior
    var Aliases: Aliases
    var Status: string
  }

  object DistributionSummary {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      ARN: js.UndefOr[string] = js.undefined,
      WebACLId: js.UndefOr[string] = js.undefined,
      ViewerCertificate: js.UndefOr[ViewerCertificate] = js.undefined,
      IsIPV6Enabled: js.UndefOr[boolean] = js.undefined,
      Enabled: js.UndefOr[boolean] = js.undefined,
      CacheBehaviors: js.UndefOr[CacheBehaviors] = js.undefined,
      PriceClass: js.UndefOr[PriceClass] = js.undefined,
      LastModifiedTime: js.UndefOr[timestamp] = js.undefined,
      DomainName: js.UndefOr[string] = js.undefined,
      Origins: js.UndefOr[Origins] = js.undefined,
      HttpVersion: js.UndefOr[HttpVersion] = js.undefined,
      CustomErrorResponses: js.UndefOr[CustomErrorResponses] = js.undefined,
      Restrictions: js.UndefOr[Restrictions] = js.undefined,
      Comment: js.UndefOr[string] = js.undefined,
      DefaultCacheBehavior: js.UndefOr[DefaultCacheBehavior] = js.undefined,
      Aliases: js.UndefOr[Aliases] = js.undefined,
      Status: js.UndefOr[string] = js.undefined
    ): DistributionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("ARN" -> ARN.map { x => x: js.Any }),
        ("WebACLId" -> WebACLId.map { x => x: js.Any }),
        ("ViewerCertificate" -> ViewerCertificate.map { x => x: js.Any }),
        ("IsIPV6Enabled" -> IsIPV6Enabled.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("CacheBehaviors" -> CacheBehaviors.map { x => x: js.Any }),
        ("PriceClass" -> PriceClass.map { x => x: js.Any }),
        ("LastModifiedTime" -> LastModifiedTime.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("Origins" -> Origins.map { x => x: js.Any }),
        ("HttpVersion" -> HttpVersion.map { x => x: js.Any }),
        ("CustomErrorResponses" -> CustomErrorResponses.map { x => x: js.Any }),
        ("Restrictions" -> Restrictions.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("DefaultCacheBehavior" -> DefaultCacheBehavior.map { x => x: js.Any }),
        ("Aliases" -> Aliases.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DistributionSummary]
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
   * <p>A complex type that specifies how CloudFront handles query strings and cookies.</p>
   */
  @js.native
  trait ForwardedValues extends js.Object {
    var QueryString: boolean
    var Cookies: CookiePreference
    var Headers: Headers
    var QueryStringCacheKeys: QueryStringCacheKeys
  }

  object ForwardedValues {
    def apply(
      QueryString: js.UndefOr[boolean] = js.undefined,
      Cookies: js.UndefOr[CookiePreference] = js.undefined,
      Headers: js.UndefOr[Headers] = js.undefined,
      QueryStringCacheKeys: js.UndefOr[QueryStringCacheKeys] = js.undefined
    ): ForwardedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueryString" -> QueryString.map { x => x: js.Any }),
        ("Cookies" -> Cookies.map { x => x: js.Any }),
        ("Headers" -> Headers.map { x => x: js.Any }),
        ("QueryStringCacheKeys" -> QueryStringCacheKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ForwardedValues]
    }
  }

  /**
   * <p>A complex type that controls the countries in which your content is distributed. CloudFront determines the location of your users using <code>MaxMind</code> GeoIP databases. </p>
   */
  @js.native
  trait GeoRestriction extends js.Object {
    var RestrictionType: GeoRestrictionType
    var Quantity: integer
    var Items: LocationList
  }

  object GeoRestriction {
    def apply(
      RestrictionType: js.UndefOr[GeoRestrictionType] = js.undefined,
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[LocationList] = js.undefined
    ): GeoRestriction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RestrictionType" -> RestrictionType.map { x => x: js.Any }),
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      Id: js.UndefOr[string] = js.undefined
    ): GetCloudFrontOriginAccessIdentityConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCloudFrontOriginAccessIdentityConfigRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetCloudFrontOriginAccessIdentityConfigResult extends js.Object {
    var CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig
    var ETag: string
  }

  object GetCloudFrontOriginAccessIdentityConfigResult {
    def apply(
      CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): GetCloudFrontOriginAccessIdentityConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudFrontOriginAccessIdentityConfig" -> CloudFrontOriginAccessIdentityConfig.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      Id: js.UndefOr[string] = js.undefined
    ): GetCloudFrontOriginAccessIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCloudFrontOriginAccessIdentityRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetCloudFrontOriginAccessIdentityResult extends js.Object {
    var CloudFrontOriginAccessIdentity: CloudFrontOriginAccessIdentity
    var ETag: string
  }

  object GetCloudFrontOriginAccessIdentityResult {
    def apply(
      CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): GetCloudFrontOriginAccessIdentityResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudFrontOriginAccessIdentity" -> CloudFrontOriginAccessIdentity.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      Id: js.UndefOr[string] = js.undefined
    ): GetDistributionConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDistributionConfigRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetDistributionConfigResult extends js.Object {
    var DistributionConfig: DistributionConfig
    var ETag: string
  }

  object GetDistributionConfigResult {
    def apply(
      DistributionConfig: js.UndefOr[DistributionConfig] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): GetDistributionConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DistributionConfig" -> DistributionConfig.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      Id: js.UndefOr[string] = js.undefined
    ): GetDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDistributionRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetDistributionResult extends js.Object {
    var Distribution: Distribution
    var ETag: string
  }

  object GetDistributionResult {
    def apply(
      Distribution: js.UndefOr[Distribution] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): GetDistributionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Distribution" -> Distribution.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDistributionResult]
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
      DistributionId: js.UndefOr[string] = js.undefined,
      Id: js.UndefOr[string] = js.undefined
    ): GetInvalidationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DistributionId" -> DistributionId.map { x => x: js.Any }),
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInvalidationRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetInvalidationResult extends js.Object {
    var Invalidation: Invalidation
  }

  object GetInvalidationResult {
    def apply(
      Invalidation: js.UndefOr[Invalidation] = js.undefined
    ): GetInvalidationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Invalidation" -> Invalidation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInvalidationResult]
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
      Id: js.UndefOr[string] = js.undefined
    ): GetStreamingDistributionConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStreamingDistributionConfigRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetStreamingDistributionConfigResult extends js.Object {
    var StreamingDistributionConfig: StreamingDistributionConfig
    var ETag: string
  }

  object GetStreamingDistributionConfigResult {
    def apply(
      StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): GetStreamingDistributionConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamingDistributionConfig" -> StreamingDistributionConfig.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      Id: js.UndefOr[string] = js.undefined
    ): GetStreamingDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStreamingDistributionRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait GetStreamingDistributionResult extends js.Object {
    var StreamingDistribution: StreamingDistribution
    var ETag: string
  }

  object GetStreamingDistributionResult {
    def apply(
      StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): GetStreamingDistributionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamingDistribution" -> StreamingDistribution.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStreamingDistributionResult]
    }
  }

  /**
   * <p>A complex type that specifies the headers that you want CloudFront to forward to the origin for this cache behavior.</p> <p>For the headers that you specify, CloudFront also caches separate versions of a specified object based on the header values in viewer requests. For example, suppose viewer requests for <code>logo.jpg</code> contain a custom <code>Product</code> header that has a value of either <code>Acme</code> or <code>Apex</code>, and you configure CloudFront to cache your content based on values in the <code>Product</code> header. CloudFront forwards the <code>Product</code> header to the origin and caches the response from the origin once for each header value. For more information about caching based on header values, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html">How CloudFront Forwards and Caches Headers</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait Headers extends js.Object {
    var Quantity: integer
    var Items: HeaderList
  }

  object Headers {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[HeaderList] = js.undefined
    ): Headers = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Headers]
    }
  }


  object HttpVersionEnum {
    val `http1.1` = "http1.1"
    val http2 = "http2"

    val values = IndexedSeq(`http1.1`, http2)
  }

  /**
   * <p>Origin and <code>CallerReference</code> cannot be updated. </p>
   */
  @js.native
  trait IllegalUpdateException extends js.Object {
    var Message: string
  }

  /**
   * <p>The value of <code>Quantity</code> and the size of <code>Items</code> do not match.</p>
   */
  @js.native
  trait InconsistentQuantitiesException extends js.Object {
    var Message: string
  }

  /**
   * <p>The argument is invalid.</p>
   */
  @js.native
  trait InvalidArgumentException extends js.Object {
    var Message: string
  }

  /**
   * <p>The default root object file name is too big or contains an invalid character.</p>
   */
  @js.native
  trait InvalidDefaultRootObjectException extends js.Object {
    var Message: string
  }

  @js.native
  trait InvalidErrorCodeException extends js.Object {
    var Message: string
  }

  /**
   * <p>Your request contains forward cookies option which doesn't match with the expectation for the <code>whitelisted</code> list of cookie names. Either list of cookie names has been specified when not allowed or list of cookie names is missing when expected.</p>
   */
  @js.native
  trait InvalidForwardCookiesException extends js.Object {
    var Message: string
  }

  @js.native
  trait InvalidGeoRestrictionParameterException extends js.Object {
    var Message: string
  }

  @js.native
  trait InvalidHeadersForS3OriginException extends js.Object {
    var Message: string
  }

  /**
   * <p>The <code>If-Match</code> version is missing or not valid for the distribution.</p>
   */
  @js.native
  trait InvalidIfMatchVersionException extends js.Object {
    var Message: string
  }

  /**
   * <p>The specified Lambda function association is invalid.</p>
   */
  @js.native
  trait InvalidLambdaFunctionAssociationException extends js.Object {
    var Message: string
  }

  @js.native
  trait InvalidLocationCodeException extends js.Object {
    var Message: string
  }

  @js.native
  trait InvalidMinimumProtocolVersionException extends js.Object {
    var Message: string
  }

  /**
   * <p>The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.</p>
   */
  @js.native
  trait InvalidOriginException extends js.Object {
    var Message: string
  }

  /**
   * <p>The origin access identity is not valid or doesn't exist.</p>
   */
  @js.native
  trait InvalidOriginAccessIdentityException extends js.Object {
    var Message: string
  }

  /**
   * <p>You cannot specify SSLv3 as the minimum protocol version if you only want to support only clients that support Server Name Indication (SNI).</p>
   */
  @js.native
  trait InvalidProtocolSettingsException extends js.Object {
    var Message: string
  }

  @js.native
  trait InvalidQueryStringParametersException extends js.Object {
    var Message: string
  }

  /**
   * <p>The relative path is too big, is not URL-encoded, or does not begin with a slash (/).</p>
   */
  @js.native
  trait InvalidRelativePathException extends js.Object {
    var Message: string
  }

  /**
   * <p>This operation requires the HTTPS protocol. Ensure that you specify the HTTPS protocol in your request, or omit the <code>RequiredProtocols</code> element from your distribution configuration.</p>
   */
  @js.native
  trait InvalidRequiredProtocolException extends js.Object {
    var Message: string
  }

  @js.native
  trait InvalidResponseCodeException extends js.Object {
    var Message: string
  }

  @js.native
  trait InvalidTTLOrderException extends js.Object {
    var Message: string
  }

  @js.native
  trait InvalidTaggingException extends js.Object {
    var Message: string
  }

  @js.native
  trait InvalidViewerCertificateException extends js.Object {
    var Message: string
  }

  @js.native
  trait InvalidWebACLIdException extends js.Object {
    var Message: string
  }

  /**
   * <p>An invalidation. </p>
   */
  @js.native
  trait Invalidation extends js.Object {
    var Id: string
    var Status: string
    var CreateTime: timestamp
    var InvalidationBatch: InvalidationBatch
  }

  object Invalidation {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      Status: js.UndefOr[string] = js.undefined,
      CreateTime: js.UndefOr[timestamp] = js.undefined,
      InvalidationBatch: js.UndefOr[InvalidationBatch] = js.undefined
    ): Invalidation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("CreateTime" -> CreateTime.map { x => x: js.Any }),
        ("InvalidationBatch" -> InvalidationBatch.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Invalidation]
    }
  }

  /**
   * <p>An invalidation batch.</p>
   */
  @js.native
  trait InvalidationBatch extends js.Object {
    var Paths: Paths
    var CallerReference: string
  }

  object InvalidationBatch {
    def apply(
      Paths: js.UndefOr[Paths] = js.undefined,
      CallerReference: js.UndefOr[string] = js.undefined
    ): InvalidationBatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Paths" -> Paths.map { x => x: js.Any }),
        ("CallerReference" -> CallerReference.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvalidationBatch]
    }
  }

  /**
   * <p>The <code>InvalidationList</code> complex type describes the list of invalidation objects. For more information about invalidation, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html">Invalidating Objects (Web Distributions Only)</a> in the <i>Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait InvalidationList extends js.Object {
    var Quantity: integer
    var IsTruncated: boolean
    var MaxItems: integer
    var NextMarker: string
    var Items: InvalidationSummaryList
    var Marker: string
  }

  object InvalidationList {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      IsTruncated: js.UndefOr[boolean] = js.undefined,
      MaxItems: js.UndefOr[integer] = js.undefined,
      NextMarker: js.UndefOr[string] = js.undefined,
      Items: js.UndefOr[InvalidationSummaryList] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined
    ): InvalidationList = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvalidationList]
    }
  }

  /**
   * <p>A summary of an invalidation request.</p>
   */
  @js.native
  trait InvalidationSummary extends js.Object {
    var Id: string
    var CreateTime: timestamp
    var Status: string
  }

  object InvalidationSummary {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      CreateTime: js.UndefOr[timestamp] = js.undefined,
      Status: js.UndefOr[string] = js.undefined
    ): InvalidationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("CreateTime" -> CreateTime.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var Items: KeyPairIdList
  }

  object KeyPairIds {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[KeyPairIdList] = js.undefined
    ): KeyPairIds = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPairIds]
    }
  }

  /**
   * <p>A complex type that contains a Lambda function association.</p>
   */
  @js.native
  trait LambdaFunctionAssociation extends js.Object {
    var LambdaFunctionARN: string
    var EventType: EventType
  }

  object LambdaFunctionAssociation {
    def apply(
      LambdaFunctionARN: js.UndefOr[string] = js.undefined,
      EventType: js.UndefOr[EventType] = js.undefined
    ): LambdaFunctionAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LambdaFunctionARN" -> LambdaFunctionARN.map { x => x: js.Any }),
        ("EventType" -> EventType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionAssociation]
    }
  }

  /**
   * <p>A complex type that specifies a list of Lambda functions associations for a cache behavior.</p> <p>If you want to invoke one or more Lambda functions triggered by requests that match the <code>PathPattern</code> of the cache behavior, specify the applicable values for <code>Quantity</code> and <code>Items</code>. Note that there can be up to 4 <code>LambdaFunctionAssociation</code> items in this list (one for each possible value of <code>EventType</code>) and each <code>EventType</code> can be associated with the Lambda function only once.</p> <p>If you don't want to invoke any Lambda functions for the requests that match <code>PathPattern</code>, specify <code>0</code> for <code>Quantity</code> and omit <code>Items</code>. </p>
   */
  @js.native
  trait LambdaFunctionAssociations extends js.Object {
    var Quantity: integer
    var Items: LambdaFunctionAssociationList
  }

  object LambdaFunctionAssociations {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[LambdaFunctionAssociationList] = js.undefined
    ): LambdaFunctionAssociations = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionAssociations]
    }
  }

  /**
   * <p>The request to list origin access identities. </p>
   */
  @js.native
  trait ListCloudFrontOriginAccessIdentitiesRequest extends js.Object {
    var Marker: string
    var MaxItems: string
  }

  object ListCloudFrontOriginAccessIdentitiesRequest {
    def apply(
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined
    ): ListCloudFrontOriginAccessIdentitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCloudFrontOriginAccessIdentitiesRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request. </p>
   */
  @js.native
  trait ListCloudFrontOriginAccessIdentitiesResult extends js.Object {
    var CloudFrontOriginAccessIdentityList: CloudFrontOriginAccessIdentityList
  }

  object ListCloudFrontOriginAccessIdentitiesResult {
    def apply(
      CloudFrontOriginAccessIdentityList: js.UndefOr[CloudFrontOriginAccessIdentityList] = js.undefined
    ): ListCloudFrontOriginAccessIdentitiesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudFrontOriginAccessIdentityList" -> CloudFrontOriginAccessIdentityList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCloudFrontOriginAccessIdentitiesResult]
    }
  }

  /**
   * <p>The request to list distributions that are associated with a specified AWS WAF web ACL. </p>
   */
  @js.native
  trait ListDistributionsByWebACLIdRequest extends js.Object {
    var Marker: string
    var MaxItems: string
    var WebACLId: string
  }

  object ListDistributionsByWebACLIdRequest {
    def apply(
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined,
      WebACLId: js.UndefOr[string] = js.undefined
    ): ListDistributionsByWebACLIdRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("WebACLId" -> WebACLId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDistributionsByWebACLIdRequest]
    }
  }

  /**
   * <p>The response to a request to list the distributions that are associated with a specified AWS WAF web ACL. </p>
   */
  @js.native
  trait ListDistributionsByWebACLIdResult extends js.Object {
    var DistributionList: DistributionList
  }

  object ListDistributionsByWebACLIdResult {
    def apply(
      DistributionList: js.UndefOr[DistributionList] = js.undefined
    ): ListDistributionsByWebACLIdResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DistributionList" -> DistributionList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDistributionsByWebACLIdResult]
    }
  }

  /**
   * <p>The request to list your distributions. </p>
   */
  @js.native
  trait ListDistributionsRequest extends js.Object {
    var Marker: string
    var MaxItems: string
  }

  object ListDistributionsRequest {
    def apply(
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined
    ): ListDistributionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDistributionsRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request. </p>
   */
  @js.native
  trait ListDistributionsResult extends js.Object {
    var DistributionList: DistributionList
  }

  object ListDistributionsResult {
    def apply(
      DistributionList: js.UndefOr[DistributionList] = js.undefined
    ): ListDistributionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DistributionList" -> DistributionList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDistributionsResult]
    }
  }

  /**
   * <p>The request to list invalidations. </p>
   */
  @js.native
  trait ListInvalidationsRequest extends js.Object {
    var DistributionId: string
    var Marker: string
    var MaxItems: string
  }

  object ListInvalidationsRequest {
    def apply(
      DistributionId: js.UndefOr[string] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined
    ): ListInvalidationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DistributionId" -> DistributionId.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInvalidationsRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request. </p>
   */
  @js.native
  trait ListInvalidationsResult extends js.Object {
    var InvalidationList: InvalidationList
  }

  object ListInvalidationsResult {
    def apply(
      InvalidationList: js.UndefOr[InvalidationList] = js.undefined
    ): ListInvalidationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InvalidationList" -> InvalidationList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInvalidationsResult]
    }
  }

  /**
   * <p>The request to list your streaming distributions. </p>
   */
  @js.native
  trait ListStreamingDistributionsRequest extends js.Object {
    var Marker: string
    var MaxItems: string
  }

  object ListStreamingDistributionsRequest {
    def apply(
      Marker: js.UndefOr[string] = js.undefined,
      MaxItems: js.UndefOr[string] = js.undefined
    ): ListStreamingDistributionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamingDistributionsRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request. </p>
   */
  @js.native
  trait ListStreamingDistributionsResult extends js.Object {
    var StreamingDistributionList: StreamingDistributionList
  }

  object ListStreamingDistributionsResult {
    def apply(
      StreamingDistributionList: js.UndefOr[StreamingDistributionList] = js.undefined
    ): ListStreamingDistributionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamingDistributionList" -> StreamingDistributionList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      Resource: js.UndefOr[ResourceARN] = js.undefined
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Resource" -> Resource.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResult]
    }
  }

  /**
   * <p>A complex type that controls whether access logs are written for the distribution.</p>
   */
  @js.native
  trait LoggingConfig extends js.Object {
    var Enabled: boolean
    var IncludeCookies: boolean
    var Bucket: string
    var Prefix: string
  }

  object LoggingConfig {
    def apply(
      Enabled: js.UndefOr[boolean] = js.undefined,
      IncludeCookies: js.UndefOr[boolean] = js.undefined,
      Bucket: js.UndefOr[string] = js.undefined,
      Prefix: js.UndefOr[string] = js.undefined
    ): LoggingConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("IncludeCookies" -> IncludeCookies.map { x => x: js.Any }),
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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

    val values = IndexedSeq(SSLv3, TLSv1)
  }

  /**
   * <p>This operation requires a body. Ensure that the body is present and the Content-Type header is set.</p>
   */
  @js.native
  trait MissingBodyException extends js.Object {
    var Message: string
  }

  /**
   * <p>The specified origin access identity does not exist.</p>
   */
  @js.native
  trait NoSuchCloudFrontOriginAccessIdentityException extends js.Object {
    var Message: string
  }

  /**
   * <p>The specified distribution does not exist.</p>
   */
  @js.native
  trait NoSuchDistributionException extends js.Object {
    var Message: string
  }

  /**
   * <p>The specified invalidation does not exist.</p>
   */
  @js.native
  trait NoSuchInvalidationException extends js.Object {
    var Message: string
  }

  /**
   * <p>No origin exists with the specified <code>Origin Id</code>. </p>
   */
  @js.native
  trait NoSuchOriginException extends js.Object {
    var Message: string
  }

  @js.native
  trait NoSuchResourceException extends js.Object {
    var Message: string
  }

  /**
   * <p>The specified streaming distribution does not exist.</p>
   */
  @js.native
  trait NoSuchStreamingDistributionException extends js.Object {
    var Message: string
  }

  /**
   * <p>A complex type that describes the Amazon S3 bucket or the HTTP server (for example, a web server) from which CloudFront gets your files. You must create at least one origin.</p> <p>For the current limit on the number of origins that you can create for a distribution, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon CloudFront Limits</a> in the <i>AWS General Reference</i>.</p>
   */
  @js.native
  trait Origin extends js.Object {
    var Id: string
    var S3OriginConfig: S3OriginConfig
    var DomainName: string
    var CustomHeaders: CustomHeaders
    var OriginPath: string
    var CustomOriginConfig: CustomOriginConfig
  }

  object Origin {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      S3OriginConfig: js.UndefOr[S3OriginConfig] = js.undefined,
      DomainName: js.UndefOr[string] = js.undefined,
      CustomHeaders: js.UndefOr[CustomHeaders] = js.undefined,
      OriginPath: js.UndefOr[string] = js.undefined,
      CustomOriginConfig: js.UndefOr[CustomOriginConfig] = js.undefined
    ): Origin = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("S3OriginConfig" -> S3OriginConfig.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("CustomHeaders" -> CustomHeaders.map { x => x: js.Any }),
        ("OriginPath" -> OriginPath.map { x => x: js.Any }),
        ("CustomOriginConfig" -> CustomOriginConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      HeaderName: js.UndefOr[string] = js.undefined,
      HeaderValue: js.UndefOr[string] = js.undefined
    ): OriginCustomHeader = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HeaderName" -> HeaderName.map { x => x: js.Any }),
        ("HeaderValue" -> HeaderValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OriginCustomHeader]
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
    var Quantity: integer
    var Items: SslProtocolsList
  }

  object OriginSslProtocols {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[SslProtocolsList] = js.undefined
    ): OriginSslProtocols = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OriginSslProtocols]
    }
  }

  /**
   * <p>A complex type that contains information about origins for this distribution. </p>
   */
  @js.native
  trait Origins extends js.Object {
    var Quantity: integer
    var Items: OriginList
  }

  object Origins {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[OriginList] = js.undefined
    ): Origins = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Origins]
    }
  }

  /**
   * <p>A complex type that contains information about the objects that you want to invalidate. For more information, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Invalidation.html#invalidation-specifying-objects">Specifying the Objects to Invalidate</a> in the <i>Amazon CloudFront Developer Guide</i>. </p>
   */
  @js.native
  trait Paths extends js.Object {
    var Quantity: integer
    var Items: PathList
  }

  object Paths {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[PathList] = js.undefined
    ): Paths = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Paths]
    }
  }

  /**
   * <p>The precondition given in one or more of the request-header fields evaluated to <code>false</code>. </p>
   */
  @js.native
  trait PreconditionFailedException extends js.Object {
    var Message: string
  }


  object PriceClassEnum {
    val `PriceClass_100` = "PriceClass_100"
    val `PriceClass_200` = "PriceClass_200"
    val `PriceClass_All` = "PriceClass_All"

    val values = IndexedSeq(`PriceClass_100`, `PriceClass_200`, `PriceClass_All`)
  }

  @js.native
  trait QueryStringCacheKeys extends js.Object {
    var Quantity: integer
    var Items: QueryStringCacheKeysList
  }

  object QueryStringCacheKeys {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[QueryStringCacheKeysList] = js.undefined
    ): QueryStringCacheKeys = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      GeoRestriction: js.UndefOr[GeoRestriction] = js.undefined
    ): Restrictions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GeoRestriction" -> GeoRestriction.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      DomainName: js.UndefOr[string] = js.undefined,
      OriginAccessIdentity: js.UndefOr[string] = js.undefined
    ): S3Origin = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("OriginAccessIdentity" -> OriginAccessIdentity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      OriginAccessIdentity: js.UndefOr[string] = js.undefined
    ): S3OriginConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OriginAccessIdentity" -> OriginAccessIdentity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var AwsAccountNumber: string
    var KeyPairIds: KeyPairIds
  }

  object Signer {
    def apply(
      AwsAccountNumber: js.UndefOr[string] = js.undefined,
      KeyPairIds: js.UndefOr[KeyPairIds] = js.undefined
    ): Signer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AwsAccountNumber" -> AwsAccountNumber.map { x => x: js.Any }),
        ("KeyPairIds" -> KeyPairIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
   * <p>A streaming distribution. </p>
   */
  @js.native
  trait StreamingDistribution extends js.Object {
    var Id: string
    var ARN: string
    var StreamingDistributionConfig: StreamingDistributionConfig
    var LastModifiedTime: timestamp
    var DomainName: string
    var ActiveTrustedSigners: ActiveTrustedSigners
    var Status: string
  }

  object StreamingDistribution {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      ARN: js.UndefOr[string] = js.undefined,
      StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig] = js.undefined,
      LastModifiedTime: js.UndefOr[timestamp] = js.undefined,
      DomainName: js.UndefOr[string] = js.undefined,
      ActiveTrustedSigners: js.UndefOr[ActiveTrustedSigners] = js.undefined,
      Status: js.UndefOr[string] = js.undefined
    ): StreamingDistribution = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("ARN" -> ARN.map { x => x: js.Any }),
        ("StreamingDistributionConfig" -> StreamingDistributionConfig.map { x => x: js.Any }),
        ("LastModifiedTime" -> LastModifiedTime.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("ActiveTrustedSigners" -> ActiveTrustedSigners.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamingDistribution]
    }
  }

  @js.native
  trait StreamingDistributionAlreadyExistsException extends js.Object {
    var Message: string
  }

  /**
   * <p>The RTMP distribution's configuration information.</p>
   */
  @js.native
  trait StreamingDistributionConfig extends js.Object {
    var TrustedSigners: TrustedSigners
    var CallerReference: string
    var Enabled: boolean
    var PriceClass: PriceClass
    var Logging: StreamingLoggingConfig
    var S3Origin: S3Origin
    var Comment: string
    var Aliases: Aliases
  }

  object StreamingDistributionConfig {
    def apply(
      TrustedSigners: js.UndefOr[TrustedSigners] = js.undefined,
      CallerReference: js.UndefOr[string] = js.undefined,
      Enabled: js.UndefOr[boolean] = js.undefined,
      PriceClass: js.UndefOr[PriceClass] = js.undefined,
      Logging: js.UndefOr[StreamingLoggingConfig] = js.undefined,
      S3Origin: js.UndefOr[S3Origin] = js.undefined,
      Comment: js.UndefOr[string] = js.undefined,
      Aliases: js.UndefOr[Aliases] = js.undefined
    ): StreamingDistributionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrustedSigners" -> TrustedSigners.map { x => x: js.Any }),
        ("CallerReference" -> CallerReference.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("PriceClass" -> PriceClass.map { x => x: js.Any }),
        ("Logging" -> Logging.map { x => x: js.Any }),
        ("S3Origin" -> S3Origin.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("Aliases" -> Aliases.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined
    ): StreamingDistributionConfigWithTags = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamingDistributionConfig" -> StreamingDistributionConfig.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamingDistributionConfigWithTags]
    }
  }

  /**
   * <p>A streaming distribution list. </p>
   */
  @js.native
  trait StreamingDistributionList extends js.Object {
    var Quantity: integer
    var IsTruncated: boolean
    var MaxItems: integer
    var NextMarker: string
    var Items: StreamingDistributionSummaryList
    var Marker: string
  }

  object StreamingDistributionList {
    def apply(
      Quantity: js.UndefOr[integer] = js.undefined,
      IsTruncated: js.UndefOr[boolean] = js.undefined,
      MaxItems: js.UndefOr[integer] = js.undefined,
      NextMarker: js.UndefOr[string] = js.undefined,
      Items: js.UndefOr[StreamingDistributionSummaryList] = js.undefined,
      Marker: js.UndefOr[string] = js.undefined
    ): StreamingDistributionList = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamingDistributionList]
    }
  }

  @js.native
  trait StreamingDistributionNotDisabledException extends js.Object {
    var Message: string
  }

  /**
   * <p> A summary of the information for an Amazon CloudFront streaming distribution.</p>
   */
  @js.native
  trait StreamingDistributionSummary extends js.Object {
    var Id: string
    var ARN: string
    var TrustedSigners: TrustedSigners
    var Enabled: boolean
    var PriceClass: PriceClass
    var LastModifiedTime: timestamp
    var DomainName: string
    var S3Origin: S3Origin
    var Comment: string
    var Aliases: Aliases
    var Status: string
  }

  object StreamingDistributionSummary {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      ARN: js.UndefOr[string] = js.undefined,
      TrustedSigners: js.UndefOr[TrustedSigners] = js.undefined,
      Enabled: js.UndefOr[boolean] = js.undefined,
      PriceClass: js.UndefOr[PriceClass] = js.undefined,
      LastModifiedTime: js.UndefOr[timestamp] = js.undefined,
      DomainName: js.UndefOr[string] = js.undefined,
      S3Origin: js.UndefOr[S3Origin] = js.undefined,
      Comment: js.UndefOr[string] = js.undefined,
      Aliases: js.UndefOr[Aliases] = js.undefined,
      Status: js.UndefOr[string] = js.undefined
    ): StreamingDistributionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("ARN" -> ARN.map { x => x: js.Any }),
        ("TrustedSigners" -> TrustedSigners.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("PriceClass" -> PriceClass.map { x => x: js.Any }),
        ("LastModifiedTime" -> LastModifiedTime.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("S3Origin" -> S3Origin.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("Aliases" -> Aliases.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamingDistributionSummary]
    }
  }

  /**
   * <p>A complex type that controls whether access logs are written for this streaming distribution.</p>
   */
  @js.native
  trait StreamingLoggingConfig extends js.Object {
    var Enabled: boolean
    var Bucket: string
    var Prefix: string
  }

  object StreamingLoggingConfig {
    def apply(
      Enabled: js.UndefOr[boolean] = js.undefined,
      Bucket: js.UndefOr[string] = js.undefined,
      Prefix: js.UndefOr[string] = js.undefined
    ): StreamingLoggingConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamingLoggingConfig]
    }
  }

  /**
   * <p> A complex type that contains <code>Tag</code> key and <code>Tag</code> value.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p> A complex type that contains zero or more <code>Tag</code> elements.</p>
   */
  @js.native
  trait TagKeys extends js.Object {
    var Items: TagKeyList
  }

  object TagKeys {
    def apply(
      Items: js.UndefOr[TagKeyList] = js.undefined
    ): TagKeys = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      Resource: js.UndefOr[ResourceARN] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined
    ): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Resource" -> Resource.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  /**
   * <p> A complex type that contains zero or more <code>Tag</code> elements.</p>
   */
  @js.native
  trait Tags extends js.Object {
    var Items: TagList
  }

  object Tags {
    def apply(
      Items: js.UndefOr[TagList] = js.undefined
    ): Tags = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tags]
    }
  }

  /**
   * <p>You cannot create more cache behaviors for the distribution.</p>
   */
  @js.native
  trait TooManyCacheBehaviorsException extends js.Object {
    var Message: string
  }

  /**
   * <p>You cannot create anymore custom SSL/TLS certificates.</p>
   */
  @js.native
  trait TooManyCertificatesException extends js.Object {
    var Message: string
  }

  /**
   * <p>Processing your request would cause you to exceed the maximum number of origin access identities allowed.</p>
   */
  @js.native
  trait TooManyCloudFrontOriginAccessIdentitiesException extends js.Object {
    var Message: string
  }

  /**
   * <p>Your request contains more cookie names in the whitelist than are allowed per cache behavior.</p>
   */
  @js.native
  trait TooManyCookieNamesInWhiteListException extends js.Object {
    var Message: string
  }

  /**
   * <p>Your request contains more CNAMEs than are allowed per distribution.</p>
   */
  @js.native
  trait TooManyDistributionCNAMEsException extends js.Object {
    var Message: string
  }

  /**
   * <p>Processing your request would cause you to exceed the maximum number of distributions allowed.</p>
   */
  @js.native
  trait TooManyDistributionsException extends js.Object {
    var Message: string
  }

  /**
   * <p>Processing your request would cause the maximum number of distributions with Lambda function associations per owner to be exceeded.</p>
   */
  @js.native
  trait TooManyDistributionsWithLambdaAssociationsException extends js.Object {
    var Message: string
  }

  @js.native
  trait TooManyHeadersInForwardedValuesException extends js.Object {
    var Message: string
  }

  /**
   * <p>You have exceeded the maximum number of allowable InProgress invalidation batch requests, or invalidation objects.</p>
   */
  @js.native
  trait TooManyInvalidationsInProgressException extends js.Object {
    var Message: string
  }

  /**
   * <p>Your request contains more Lambda function associations than are allowed per distribution.</p>
   */
  @js.native
  trait TooManyLambdaFunctionAssociationsException extends js.Object {
    var Message: string
  }

  @js.native
  trait TooManyOriginCustomHeadersException extends js.Object {
    var Message: string
  }

  /**
   * <p>You cannot create more origins for the distribution.</p>
   */
  @js.native
  trait TooManyOriginsException extends js.Object {
    var Message: string
  }

  @js.native
  trait TooManyQueryStringParametersException extends js.Object {
    var Message: string
  }

  @js.native
  trait TooManyStreamingDistributionCNAMEsException extends js.Object {
    var Message: string
  }

  /**
   * <p>Processing your request would cause you to exceed the maximum number of streaming distributions allowed.</p>
   */
  @js.native
  trait TooManyStreamingDistributionsException extends js.Object {
    var Message: string
  }

  /**
   * <p>Your request contains more trusted signers than are allowed per distribution.</p>
   */
  @js.native
  trait TooManyTrustedSignersException extends js.Object {
    var Message: string
  }

  /**
   * <p>One or more of your trusted signers do not exist.</p>
   */
  @js.native
  trait TrustedSignerDoesNotExistException extends js.Object {
    var Message: string
  }

  /**
   * <p>A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content.</p> <p>If you want to require signed URLs in requests for objects in the target origin that match the <code>PathPattern</code> for this cache behavior, specify <code>true</code> for <code>Enabled</code>, and specify the applicable values for <code>Quantity</code> and <code>Items</code>. For more information, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private Content through CloudFront</a> in the <i>Amazon Amazon CloudFront Developer Guide</i>.</p> <p>If you don't want to require signed URLs in requests for objects that match <code>PathPattern</code>, specify <code>false</code> for <code>Enabled</code> and <code>0</code> for <code>Quantity</code>. Omit <code>Items</code>.</p> <p>To add, change, or remove one or more trusted signers, change <code>Enabled</code> to <code>true</code> (if it's currently <code>false</code>), change <code>Quantity</code> as applicable, and specify all of the trusted signers that you want to include in the updated distribution.</p> <p>For more information about updating the distribution configuration, see <a>DistributionConfig</a> .</p>
   */
  @js.native
  trait TrustedSigners extends js.Object {
    var Enabled: boolean
    var Quantity: integer
    var Items: AwsAccountNumberList
  }

  object TrustedSigners {
    def apply(
      Enabled: js.UndefOr[boolean] = js.undefined,
      Quantity: js.UndefOr[integer] = js.undefined,
      Items: js.UndefOr[AwsAccountNumberList] = js.undefined
    ): TrustedSigners = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      Resource: js.UndefOr[ResourceARN] = js.undefined,
      TagKeys: js.UndefOr[TagKeys] = js.undefined
    ): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Resource" -> Resource.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var IfMatch: string
  }

  object UpdateCloudFrontOriginAccessIdentityRequest {
    def apply(
      CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined,
      Id: js.UndefOr[string] = js.undefined,
      IfMatch: js.UndefOr[string] = js.undefined
    ): UpdateCloudFrontOriginAccessIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudFrontOriginAccessIdentityConfig" -> CloudFrontOriginAccessIdentityConfig.map { x => x: js.Any }),
        ("Id" -> Id.map { x => x: js.Any }),
        ("IfMatch" -> IfMatch.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCloudFrontOriginAccessIdentityRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait UpdateCloudFrontOriginAccessIdentityResult extends js.Object {
    var CloudFrontOriginAccessIdentity: CloudFrontOriginAccessIdentity
    var ETag: string
  }

  object UpdateCloudFrontOriginAccessIdentityResult {
    def apply(
      CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): UpdateCloudFrontOriginAccessIdentityResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudFrontOriginAccessIdentity" -> CloudFrontOriginAccessIdentity.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var IfMatch: string
  }

  object UpdateDistributionRequest {
    def apply(
      DistributionConfig: js.UndefOr[DistributionConfig] = js.undefined,
      Id: js.UndefOr[string] = js.undefined,
      IfMatch: js.UndefOr[string] = js.undefined
    ): UpdateDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DistributionConfig" -> DistributionConfig.map { x => x: js.Any }),
        ("Id" -> Id.map { x => x: js.Any }),
        ("IfMatch" -> IfMatch.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDistributionRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait UpdateDistributionResult extends js.Object {
    var Distribution: Distribution
    var ETag: string
  }

  object UpdateDistributionResult {
    def apply(
      Distribution: js.UndefOr[Distribution] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): UpdateDistributionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Distribution" -> Distribution.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDistributionResult]
    }
  }

  /**
   * <p>The request to update a streaming distribution.</p>
   */
  @js.native
  trait UpdateStreamingDistributionRequest extends js.Object {
    var StreamingDistributionConfig: StreamingDistributionConfig
    var Id: string
    var IfMatch: string
  }

  object UpdateStreamingDistributionRequest {
    def apply(
      StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig] = js.undefined,
      Id: js.UndefOr[string] = js.undefined,
      IfMatch: js.UndefOr[string] = js.undefined
    ): UpdateStreamingDistributionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamingDistributionConfig" -> StreamingDistributionConfig.map { x => x: js.Any }),
        ("Id" -> Id.map { x => x: js.Any }),
        ("IfMatch" -> IfMatch.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStreamingDistributionRequest]
    }
  }

  /**
   * <p>The returned result of the corresponding request.</p>
   */
  @js.native
  trait UpdateStreamingDistributionResult extends js.Object {
    var StreamingDistribution: StreamingDistribution
    var ETag: string
  }

  object UpdateStreamingDistributionResult {
    def apply(
      StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined,
      ETag: js.UndefOr[string] = js.undefined
    ): UpdateStreamingDistributionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamingDistribution" -> StreamingDistribution.map { x => x: js.Any }),
        ("ETag" -> ETag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStreamingDistributionResult]
    }
  }

  /**
   * <p>A complex type that specifies the following:</p> <ul> <li> <p>Which SSL/TLS certificate to use when viewers request objects using HTTPS</p> </li> <li> <p>Whether you want CloudFront to use dedicated IP addresses or SNI when you're using alternate domain names in your object names</p> </li> <li> <p>The minimum protocol version that you want CloudFront to use when communicating with viewers</p> </li> </ul> <p>For more information, see <a href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/SecureConnections.html">Using an HTTPS Connection to Access Your Objects</a> in the <i>Amazon Amazon CloudFront Developer Guide</i>.</p>
   */
  @js.native
  trait ViewerCertificate extends js.Object {
    var IAMCertificateId: string
    var MinimumProtocolVersion: MinimumProtocolVersion
    var ACMCertificateArn: string
    var CloudFrontDefaultCertificate: boolean
    var SSLSupportMethod: SSLSupportMethod
    var CertificateSource: CertificateSource
    var Certificate: string
  }

  object ViewerCertificate {
    def apply(
      IAMCertificateId: js.UndefOr[string] = js.undefined,
      MinimumProtocolVersion: js.UndefOr[MinimumProtocolVersion] = js.undefined,
      ACMCertificateArn: js.UndefOr[string] = js.undefined,
      CloudFrontDefaultCertificate: js.UndefOr[boolean] = js.undefined,
      SSLSupportMethod: js.UndefOr[SSLSupportMethod] = js.undefined,
      CertificateSource: js.UndefOr[CertificateSource] = js.undefined,
      Certificate: js.UndefOr[string] = js.undefined
    ): ViewerCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IAMCertificateId" -> IAMCertificateId.map { x => x: js.Any }),
        ("MinimumProtocolVersion" -> MinimumProtocolVersion.map { x => x: js.Any }),
        ("ACMCertificateArn" -> ACMCertificateArn.map { x => x: js.Any }),
        ("CloudFrontDefaultCertificate" -> CloudFrontDefaultCertificate.map { x => x: js.Any }),
        ("SSLSupportMethod" -> SSLSupportMethod.map { x => x: js.Any }),
        ("CertificateSource" -> CertificateSource.map { x => x: js.Any }),
        ("Certificate" -> Certificate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
