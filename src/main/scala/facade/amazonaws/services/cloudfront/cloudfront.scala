package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object cloudfront {
  type AliasList = js.Array[string]
  type AwsAccountNumberList = js.Array[string]
  type CacheBehaviorList = js.Array[CacheBehavior]
  type CloudFrontOriginAccessIdentitySummaryList = js.Array[CloudFrontOriginAccessIdentitySummary]
  type CookieNameList = js.Array[string]
  type CustomErrorResponseList = js.Array[CustomErrorResponse]
  type DistributionSummaryList = js.Array[DistributionSummary]
  type GeoRestrictionType = String
  type HeaderList = js.Array[string]
  type InvalidationSummaryList = js.Array[InvalidationSummary]
  type ItemSelection = String
  type KeyPairIdList = js.Array[string]
  type LocationList = js.Array[string]
  type Method = String
  type MethodsList = js.Array[Method]
  type MinimumProtocolVersion = String
  type OriginList = js.Array[Origin]
  type OriginProtocolPolicy = String
  type PathList = js.Array[string]
  type PriceClass = String
  type SSLSupportMethod = String
  type SignerList = js.Array[Signer]
  type StreamingDistributionSummaryList = js.Array[StreamingDistributionSummary]
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
    def createInvalidation(params: CreateInvalidationRequest, callback: Callback[CreateInvalidationResult]): Unit = js.native
    def createInvalidation(params: CreateInvalidationRequest): Request[CreateInvalidationResult] = js.native
    def createStreamingDistribution(params: CreateStreamingDistributionRequest, callback: Callback[CreateStreamingDistributionResult]): Unit = js.native
    def createStreamingDistribution(params: CreateStreamingDistributionRequest): Request[CreateStreamingDistributionResult] = js.native
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
    def listInvalidations(params: ListInvalidationsRequest, callback: Callback[ListInvalidationsResult]): Unit = js.native
    def listInvalidations(params: ListInvalidationsRequest): Request[ListInvalidationsResult] = js.native
    def listStreamingDistributions(params: ListStreamingDistributionsRequest, callback: Callback[ListStreamingDistributionsResult]): Unit = js.native
    def listStreamingDistributions(params: ListStreamingDistributionsRequest): Request[ListStreamingDistributionsResult] = js.native
    def updateCloudFrontOriginAccessIdentity(params: UpdateCloudFrontOriginAccessIdentityRequest, callback: Callback[UpdateCloudFrontOriginAccessIdentityResult]): Unit = js.native
    def updateCloudFrontOriginAccessIdentity(params: UpdateCloudFrontOriginAccessIdentityRequest): Request[UpdateCloudFrontOriginAccessIdentityResult] = js.native
    def updateDistribution(params: UpdateDistributionRequest, callback: Callback[UpdateDistributionResult]): Unit = js.native
    def updateDistribution(params: UpdateDistributionRequest): Request[UpdateDistributionResult] = js.native
    def updateStreamingDistribution(params: UpdateStreamingDistributionRequest, callback: Callback[UpdateStreamingDistributionResult]): Unit = js.native
    def updateStreamingDistribution(params: UpdateStreamingDistributionRequest): Request[UpdateStreamingDistributionResult] = js.native
  }

  /**
   * Access denied.
   */
  @js.native
  trait AccessDeniedException extends js.Object {
    var Message: string
  }

  /**
   * A complex type that lists the AWS accounts, if any, that you included in the TrustedSigners complex type for the default cache behavior or for any of the other cache behaviors for this distribution. These are accounts that you want to allow to create signed URLs for private content.
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
   * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
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
   * A complex type that controls which HTTP methods CloudFront processes and forwards to your Amazon S3 bucket or your custom origin. There are three choices: - CloudFront forwards only GET and HEAD requests. - CloudFront forwards only GET, HEAD and OPTIONS requests. - CloudFront forwards GET, HEAD, OPTIONS, PUT, PATCH, POST, and DELETE requests. If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or to your custom origin so users can't perform operations that you don't want them to. For example, you may not want users to have permission to delete objects from your origin.
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
   * A complex type that describes how CloudFront processes requests. You can create up to 10 cache behaviors.You must create at least as many cache behaviors (including the default cache behavior) as you have origins if you want CloudFront to distribute objects from all of the origins. Each cache behavior specifies the one origin from which you want CloudFront to get objects. If you have two origins and only the default cache behavior, the default cache behavior will cause CloudFront to get objects from one of the origins, but the other origin will never be used. If you don't want to specify any cache behaviors, include only an empty CacheBehaviors element. Don't include an empty CacheBehavior element, or CloudFront returns a MalformedXML error. To delete all cache behaviors in an existing distribution, update the distribution configuration and include only an empty CacheBehaviors element. To add, change, or remove one or more cache behaviors, update the distribution configuration and specify all of the cache behaviors that you want to include in the updated distribution.
   */
  @js.native
  trait CacheBehavior extends js.Object {
    var PathPattern: string
    var TrustedSigners: TrustedSigners
    var SmoothStreaming: boolean
    var ForwardedValues: ForwardedValues
    var AllowedMethods: AllowedMethods
    var TargetOriginId: string
    var MinTTL: long
    var ViewerProtocolPolicy: ViewerProtocolPolicy
  }

  object CacheBehavior {
    def apply(
      PathPattern: js.UndefOr[string] = js.undefined,
      TrustedSigners: js.UndefOr[TrustedSigners] = js.undefined,
      SmoothStreaming: js.UndefOr[boolean] = js.undefined,
      ForwardedValues: js.UndefOr[ForwardedValues] = js.undefined,
      AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
      TargetOriginId: js.UndefOr[string] = js.undefined,
      MinTTL: js.UndefOr[long] = js.undefined,
      ViewerProtocolPolicy: js.UndefOr[ViewerProtocolPolicy] = js.undefined
    ): CacheBehavior = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PathPattern" -> PathPattern.map { x => x: js.Any }),
        ("TrustedSigners" -> TrustedSigners.map { x => x: js.Any }),
        ("SmoothStreaming" -> SmoothStreaming.map { x => x: js.Any }),
        ("ForwardedValues" -> ForwardedValues.map { x => x: js.Any }),
        ("AllowedMethods" -> AllowedMethods.map { x => x: js.Any }),
        ("TargetOriginId" -> TargetOriginId.map { x => x: js.Any }),
        ("MinTTL" -> MinTTL.map { x => x: js.Any }),
        ("ViewerProtocolPolicy" -> ViewerProtocolPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CacheBehavior]
    }
  }

  /**
   * A complex type that contains zero or more CacheBehavior elements.
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
   * A complex type that controls whether CloudFront caches the response to requests using the specified HTTP methods. There are two choices: - CloudFront caches responses to GET and HEAD requests. - CloudFront caches responses to GET, HEAD, and OPTIONS requests. If you pick the second choice for your S3 Origin, you may need to forward Access-Control-Request-Method, Access-Control-Request-Headers and Origin headers for the responses to be cached correctly.
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

  /**
   * CloudFront origin access identity.
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
   * If the CallerReference is a value you already sent in a previous request to create an identity but the content of the CloudFrontOriginAccessIdentityConfig is different from the original request, CloudFront returns a CloudFrontOriginAccessIdentityAlreadyExists error.
   */
  @js.native
  trait CloudFrontOriginAccessIdentityAlreadyExistsException extends js.Object {
    var Message: string
  }

  /**
   * Origin access identity configuration.
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
   * The CloudFrontOriginAccessIdentityList type.
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
   * Summary of the information about a CloudFront origin access identity.
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
   * A complex type that specifies the whitelisted cookies, if any, that you want CloudFront to forward to your origin that is associated with this cache behavior.
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
   * A complex type that specifies the cookie preferences associated with this cache behavior.
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
   * The request to create a new origin access identity.
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
   * The returned result of the corresponding request.
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
   * The request to create a new distribution.
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
   * The returned result of the corresponding request.
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
   * The request to create an invalidation.
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
   * The returned result of the corresponding request.
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
   * The request to create a new streaming distribution.
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
   * The returned result of the corresponding request.
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
   * A complex type that describes how you'd prefer CloudFront to respond to requests that result in either a 4xx or 5xx response. You can control whether a custom error page should be displayed, what the desired response code should be for this error page and how long should the error response be cached by CloudFront. If you don't want to specify any custom error responses, include only an empty CustomErrorResponses element. To delete all custom error responses in an existing distribution, update the distribution configuration and include only an empty CustomErrorResponses element. To add, change, or remove one or more custom error responses, update the distribution configuration and specify all of the custom error responses that you want to include in the updated distribution.
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
   * A complex type that contains zero or more CustomErrorResponse elements.
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
   * A customer origin.
   */
  @js.native
  trait CustomOriginConfig extends js.Object {
    var HTTPPort: integer
    var HTTPSPort: integer
    var OriginProtocolPolicy: OriginProtocolPolicy
  }

  object CustomOriginConfig {
    def apply(
      HTTPPort: js.UndefOr[integer] = js.undefined,
      HTTPSPort: js.UndefOr[integer] = js.undefined,
      OriginProtocolPolicy: js.UndefOr[OriginProtocolPolicy] = js.undefined
    ): CustomOriginConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HTTPPort" -> HTTPPort.map { x => x: js.Any }),
        ("HTTPSPort" -> HTTPSPort.map { x => x: js.Any }),
        ("OriginProtocolPolicy" -> OriginProtocolPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomOriginConfig]
    }
  }

  /**
   * A complex type that describes the default cache behavior if you do not specify a CacheBehavior element or if files don't match any of the values of PathPattern in CacheBehavior elements.You must create exactly one default cache behavior.
   */
  @js.native
  trait DefaultCacheBehavior extends js.Object {
    var TrustedSigners: TrustedSigners
    var SmoothStreaming: boolean
    var ForwardedValues: ForwardedValues
    var AllowedMethods: AllowedMethods
    var TargetOriginId: string
    var MinTTL: long
    var ViewerProtocolPolicy: ViewerProtocolPolicy
  }

  object DefaultCacheBehavior {
    def apply(
      TrustedSigners: js.UndefOr[TrustedSigners] = js.undefined,
      SmoothStreaming: js.UndefOr[boolean] = js.undefined,
      ForwardedValues: js.UndefOr[ForwardedValues] = js.undefined,
      AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
      TargetOriginId: js.UndefOr[string] = js.undefined,
      MinTTL: js.UndefOr[long] = js.undefined,
      ViewerProtocolPolicy: js.UndefOr[ViewerProtocolPolicy] = js.undefined
    ): DefaultCacheBehavior = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrustedSigners" -> TrustedSigners.map { x => x: js.Any }),
        ("SmoothStreaming" -> SmoothStreaming.map { x => x: js.Any }),
        ("ForwardedValues" -> ForwardedValues.map { x => x: js.Any }),
        ("AllowedMethods" -> AllowedMethods.map { x => x: js.Any }),
        ("TargetOriginId" -> TargetOriginId.map { x => x: js.Any }),
        ("MinTTL" -> MinTTL.map { x => x: js.Any }),
        ("ViewerProtocolPolicy" -> ViewerProtocolPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefaultCacheBehavior]
    }
  }

  /**
   * The request to delete a origin access identity.
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
   * The request to delete a distribution.
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
   * The request to delete a streaming distribution.
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
   * A distribution.
   */
  @js.native
  trait Distribution extends js.Object {
    var Id: string
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
      DistributionConfig: js.UndefOr[DistributionConfig] = js.undefined,
      InProgressInvalidationBatches: js.UndefOr[integer] = js.undefined,
      LastModifiedTime: js.UndefOr[timestamp] = js.undefined,
      DomainName: js.UndefOr[string] = js.undefined,
      ActiveTrustedSigners: js.UndefOr[ActiveTrustedSigners] = js.undefined,
      Status: js.UndefOr[string] = js.undefined
    ): Distribution = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
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
   * The caller reference you attempted to create the distribution with is associated with another distribution.
   */
  @js.native
  trait DistributionAlreadyExistsException extends js.Object {
    var Message: string
  }

  /**
   * A distribution Configuration.
   */
  @js.native
  trait DistributionConfig extends js.Object {
    var ViewerCertificate: ViewerCertificate
    var CallerReference: string
    var Enabled: boolean
    var CacheBehaviors: CacheBehaviors
    var PriceClass: PriceClass
    var Origins: Origins
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
      ViewerCertificate: js.UndefOr[ViewerCertificate] = js.undefined,
      CallerReference: js.UndefOr[string] = js.undefined,
      Enabled: js.UndefOr[boolean] = js.undefined,
      CacheBehaviors: js.UndefOr[CacheBehaviors] = js.undefined,
      PriceClass: js.UndefOr[PriceClass] = js.undefined,
      Origins: js.UndefOr[Origins] = js.undefined,
      Logging: js.UndefOr[LoggingConfig] = js.undefined,
      DefaultRootObject: js.UndefOr[string] = js.undefined,
      CustomErrorResponses: js.UndefOr[CustomErrorResponses] = js.undefined,
      Restrictions: js.UndefOr[Restrictions] = js.undefined,
      Comment: js.UndefOr[string] = js.undefined,
      DefaultCacheBehavior: js.UndefOr[DefaultCacheBehavior] = js.undefined,
      Aliases: js.UndefOr[Aliases] = js.undefined
    ): DistributionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ViewerCertificate" -> ViewerCertificate.map { x => x: js.Any }),
        ("CallerReference" -> CallerReference.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("CacheBehaviors" -> CacheBehaviors.map { x => x: js.Any }),
        ("PriceClass" -> PriceClass.map { x => x: js.Any }),
        ("Origins" -> Origins.map { x => x: js.Any }),
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
   * A distribution list.
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
   * A summary of the information for an Amazon CloudFront distribution.
   */
  @js.native
  trait DistributionSummary extends js.Object {
    var Id: string
    var ViewerCertificate: ViewerCertificate
    var Enabled: boolean
    var CacheBehaviors: CacheBehaviors
    var PriceClass: PriceClass
    var LastModifiedTime: timestamp
    var DomainName: string
    var Origins: Origins
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
      ViewerCertificate: js.UndefOr[ViewerCertificate] = js.undefined,
      Enabled: js.UndefOr[boolean] = js.undefined,
      CacheBehaviors: js.UndefOr[CacheBehaviors] = js.undefined,
      PriceClass: js.UndefOr[PriceClass] = js.undefined,
      LastModifiedTime: js.UndefOr[timestamp] = js.undefined,
      DomainName: js.UndefOr[string] = js.undefined,
      Origins: js.UndefOr[Origins] = js.undefined,
      CustomErrorResponses: js.UndefOr[CustomErrorResponses] = js.undefined,
      Restrictions: js.UndefOr[Restrictions] = js.undefined,
      Comment: js.UndefOr[string] = js.undefined,
      DefaultCacheBehavior: js.UndefOr[DefaultCacheBehavior] = js.undefined,
      Aliases: js.UndefOr[Aliases] = js.undefined,
      Status: js.UndefOr[string] = js.undefined
    ): DistributionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("ViewerCertificate" -> ViewerCertificate.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("CacheBehaviors" -> CacheBehaviors.map { x => x: js.Any }),
        ("PriceClass" -> PriceClass.map { x => x: js.Any }),
        ("LastModifiedTime" -> LastModifiedTime.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("Origins" -> Origins.map { x => x: js.Any }),
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

  /**
   * A complex type that specifies how CloudFront handles query strings, cookies and headers.
   */
  @js.native
  trait ForwardedValues extends js.Object {
    var QueryString: boolean
    var Cookies: CookiePreference
    var Headers: Headers
  }

  object ForwardedValues {
    def apply(
      QueryString: js.UndefOr[boolean] = js.undefined,
      Cookies: js.UndefOr[CookiePreference] = js.undefined,
      Headers: js.UndefOr[Headers] = js.undefined
    ): ForwardedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("QueryString" -> QueryString.map { x => x: js.Any }),
        ("Cookies" -> Cookies.map { x => x: js.Any }),
        ("Headers" -> Headers.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ForwardedValues]
    }
  }

  /**
   * A complex type that controls the countries in which your content is distributed. For more information about geo restriction, go to Customizing Error Responses in the Amazon CloudFront Developer Guide. CloudFront determines the location of your users using MaxMind GeoIP databases. For information about the accuracy of these databases, see How accurate are your GeoIP databases? on the MaxMind website.
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
   * The request to get an origin access identity's configuration.
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
   * The returned result of the corresponding request.
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
   * The request to get an origin access identity's information.
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
   * The returned result of the corresponding request.
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
   * The request to get a distribution configuration.
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
   * The returned result of the corresponding request.
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
   * The request to get a distribution's information.
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
   * The returned result of the corresponding request.
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
   * The request to get an invalidation's information.
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
   * The returned result of the corresponding request.
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
   * To request to get a streaming distribution configuration.
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
   * The returned result of the corresponding request.
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
   * The request to get a streaming distribution's information.
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
   * The returned result of the corresponding request.
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
   * A complex type that specifies the headers that you want CloudFront to forward to the origin for this cache behavior. For the headers that you specify, CloudFront also caches separate versions of a given object based on the header values in viewer requests; this is known as varying on headers. For example, suppose viewer requests for logo.jpg contain a custom Product header that has a value of either Acme or Apex, and you configure CloudFront to vary on the Product header. CloudFront forwards the Product header to the origin and caches the response from the origin once for each header value.
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

  /**
   * Origin and CallerReference cannot be updated.
   */
  @js.native
  trait IllegalUpdateException extends js.Object {
    var Message: string
  }

  /**
   * The value of Quantity and the size of Items do not match.
   */
  @js.native
  trait InconsistentQuantitiesException extends js.Object {
    var Message: string
  }

  /**
   * The argument is invalid.
   */
  @js.native
  trait InvalidArgumentException extends js.Object {
    var Message: string
  }

  /**
   * The default root object file name is too big or contains an invalid character.
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
   * Your request contains forward cookies option which doesn't match with the expectation for the whitelisted list of cookie names. Either list of cookie names has been specified when not allowed or list of cookie names is missing when expected.
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
   * The If-Match version is missing or not valid for the distribution.
   */
  @js.native
  trait InvalidIfMatchVersionException extends js.Object {
    var Message: string
  }

  @js.native
  trait InvalidLocationCodeException extends js.Object {
    var Message: string
  }

  /**
   * The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
   */
  @js.native
  trait InvalidOriginException extends js.Object {
    var Message: string
  }

  /**
   * The origin access identity is not valid or doesn't exist.
   */
  @js.native
  trait InvalidOriginAccessIdentityException extends js.Object {
    var Message: string
  }

  /**
   * You cannot specify SSLv3 as the minimum protocol version if you only want to support only clients that Support Server Name Indication (SNI).
   */
  @js.native
  trait InvalidProtocolSettingsException extends js.Object {
    var Message: string
  }

  /**
   * The relative path is too big, is not URL-encoded, or does not begin with a slash (/).
   */
  @js.native
  trait InvalidRelativePathException extends js.Object {
    var Message: string
  }

  /**
   * This operation requires the HTTPS protocol. Ensure that you specify the HTTPS protocol in your request, or omit the RequiredProtocols element from your distribution configuration.
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
  trait InvalidViewerCertificateException extends js.Object {
    var Message: string
  }

  /**
   * An invalidation.
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
   * An invalidation batch.
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
   * An invalidation list.
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
   * Summary of an invalidation request.
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
   * A complex type that lists the active CloudFront key pairs, if any, that are associated with AwsAccountNumber.
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
   * The request to list origin access identities.
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
   * The returned result of the corresponding request.
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
   * The request to list your distributions.
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
   * The returned result of the corresponding request.
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
   * The request to list invalidations.
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
   * The returned result of the corresponding request.
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
   * The request to list your streaming distributions.
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
   * The returned result of the corresponding request.
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
   * A complex type that controls whether access logs are written for the distribution.
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
   * This operation requires a body. Ensure that the body is present and the Content-Type header is set.
   */
  @js.native
  trait MissingBodyException extends js.Object {
    var Message: string
  }

  /**
   * The specified origin access identity does not exist.
   */
  @js.native
  trait NoSuchCloudFrontOriginAccessIdentityException extends js.Object {
    var Message: string
  }

  /**
   * The specified distribution does not exist.
   */
  @js.native
  trait NoSuchDistributionException extends js.Object {
    var Message: string
  }

  /**
   * The specified invalidation does not exist.
   */
  @js.native
  trait NoSuchInvalidationException extends js.Object {
    var Message: string
  }

  /**
   * No origin exists with the specified Origin Id.
   */
  @js.native
  trait NoSuchOriginException extends js.Object {
    var Message: string
  }

  /**
   * The specified streaming distribution does not exist.
   */
  @js.native
  trait NoSuchStreamingDistributionException extends js.Object {
    var Message: string
  }

  /**
   * A complex type that describes the Amazon S3 bucket or the HTTP server (for example, a web server) from which CloudFront gets your files.You must create at least one origin.
   */
  @js.native
  trait Origin extends js.Object {
    var Id: string
    var S3OriginConfig: S3OriginConfig
    var DomainName: string
    var OriginPath: string
    var CustomOriginConfig: CustomOriginConfig
  }

  object Origin {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      S3OriginConfig: js.UndefOr[S3OriginConfig] = js.undefined,
      DomainName: js.UndefOr[string] = js.undefined,
      OriginPath: js.UndefOr[string] = js.undefined,
      CustomOriginConfig: js.UndefOr[CustomOriginConfig] = js.undefined
    ): Origin = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("S3OriginConfig" -> S3OriginConfig.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("OriginPath" -> OriginPath.map { x => x: js.Any }),
        ("CustomOriginConfig" -> CustomOriginConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Origin]
    }
  }


  object OriginProtocolPolicyEnum {
    val `http-only` = "http-only"
    val `match-viewer` = "match-viewer"

    val values = IndexedSeq(`http-only`, `match-viewer`)
  }

  /**
   * A complex type that contains information about origins for this distribution.
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
   * A complex type that contains information about the objects that you want to invalidate.
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
   * The precondition given in one or more of the request-header fields evaluated to false.
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

  /**
   * A complex type that identifies ways in which you want to restrict distribution of your content.
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
   * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution.
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
   * A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use the CustomOriginConfig element instead.
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
   * A complex type that lists the AWS accounts that were included in the TrustedSigners complex type, as well as their active CloudFront key pair IDs, if any.
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

  /**
   * A streaming distribution.
   */
  @js.native
  trait StreamingDistribution extends js.Object {
    var Id: string
    var StreamingDistributionConfig: StreamingDistributionConfig
    var LastModifiedTime: timestamp
    var DomainName: string
    var ActiveTrustedSigners: ActiveTrustedSigners
    var Status: string
  }

  object StreamingDistribution {
    def apply(
      Id: js.UndefOr[string] = js.undefined,
      StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig] = js.undefined,
      LastModifiedTime: js.UndefOr[timestamp] = js.undefined,
      DomainName: js.UndefOr[string] = js.undefined,
      ActiveTrustedSigners: js.UndefOr[ActiveTrustedSigners] = js.undefined,
      Status: js.UndefOr[string] = js.undefined
    ): StreamingDistribution = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
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
   * The configuration for the streaming distribution.
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
   * A streaming distribution list.
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
   * A summary of the information for an Amazon CloudFront streaming distribution.
   */
  @js.native
  trait StreamingDistributionSummary extends js.Object {
    var Id: string
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
   * A complex type that controls whether access logs are written for this streaming distribution.
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
   * You cannot create anymore cache behaviors for the distribution.
   */
  @js.native
  trait TooManyCacheBehaviorsException extends js.Object {
    var Message: string
  }

  /**
   * You cannot create anymore custom ssl certificates.
   */
  @js.native
  trait TooManyCertificatesException extends js.Object {
    var Message: string
  }

  /**
   * Processing your request would cause you to exceed the maximum number of origin access identities allowed.
   */
  @js.native
  trait TooManyCloudFrontOriginAccessIdentitiesException extends js.Object {
    var Message: string
  }

  /**
   * Your request contains more cookie names in the whitelist than are allowed per cache behavior.
   */
  @js.native
  trait TooManyCookieNamesInWhiteListException extends js.Object {
    var Message: string
  }

  /**
   * Your request contains more CNAMEs than are allowed per distribution.
   */
  @js.native
  trait TooManyDistributionCNAMEsException extends js.Object {
    var Message: string
  }

  /**
   * Processing your request would cause you to exceed the maximum number of distributions allowed.
   */
  @js.native
  trait TooManyDistributionsException extends js.Object {
    var Message: string
  }

  @js.native
  trait TooManyHeadersInForwardedValuesException extends js.Object {
    var Message: string
  }

  /**
   * You have exceeded the maximum number of allowable InProgress invalidation batch requests, or invalidation objects.
   */
  @js.native
  trait TooManyInvalidationsInProgressException extends js.Object {
    var Message: string
  }

  /**
   * You cannot create anymore origins for the distribution.
   */
  @js.native
  trait TooManyOriginsException extends js.Object {
    var Message: string
  }

  @js.native
  trait TooManyStreamingDistributionCNAMEsException extends js.Object {
    var Message: string
  }

  /**
   * Processing your request would cause you to exceed the maximum number of streaming distributions allowed.
   */
  @js.native
  trait TooManyStreamingDistributionsException extends js.Object {
    var Message: string
  }

  /**
   * Your request contains more trusted signers than are allowed per distribution.
   */
  @js.native
  trait TooManyTrustedSignersException extends js.Object {
    var Message: string
  }

  /**
   * One or more of your trusted signers do not exist.
   */
  @js.native
  trait TrustedSignerDoesNotExistException extends js.Object {
    var Message: string
  }

  /**
   * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content. If you want to require signed URLs in requests for objects in the target origin that match the PathPattern for this cache behavior, specify true for Enabled, and specify the applicable values for Quantity and Items. For more information, go to Using a Signed URL to Serve Private Content in the Amazon CloudFront Developer Guide. If you don't want to require signed URLs in requests for objects that match PathPattern, specify false for Enabled and 0 for Quantity. Omit Items. To add, change, or remove one or more trusted signers, change Enabled to true (if it's currently false), change Quantity as applicable, and specify all of the trusted signers that you want to include in the updated distribution.
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
   * The request to update an origin access identity.
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
   * The returned result of the corresponding request.
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
   * The request to update a distribution.
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
   * The returned result of the corresponding request.
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
   * The request to update a streaming distribution.
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
   * The returned result of the corresponding request.
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
   * A complex type that contains information about viewer certificates for this distribution.
   */
  @js.native
  trait ViewerCertificate extends js.Object {
    var IAMCertificateId: string
    var CloudFrontDefaultCertificate: boolean
    var SSLSupportMethod: SSLSupportMethod
    var MinimumProtocolVersion: MinimumProtocolVersion
  }

  object ViewerCertificate {
    def apply(
      IAMCertificateId: js.UndefOr[string] = js.undefined,
      CloudFrontDefaultCertificate: js.UndefOr[boolean] = js.undefined,
      SSLSupportMethod: js.UndefOr[SSLSupportMethod] = js.undefined,
      MinimumProtocolVersion: js.UndefOr[MinimumProtocolVersion] = js.undefined
    ): ViewerCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IAMCertificateId" -> IAMCertificateId.map { x => x: js.Any }),
        ("CloudFrontDefaultCertificate" -> CloudFrontDefaultCertificate.map { x => x: js.Any }),
        ("SSLSupportMethod" -> SSLSupportMethod.map { x => x: js.Any }),
        ("MinimumProtocolVersion" -> MinimumProtocolVersion.map { x => x: js.Any })
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
