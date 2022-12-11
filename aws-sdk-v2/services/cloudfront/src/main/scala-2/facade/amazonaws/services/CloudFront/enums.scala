package facade.amazonaws.services.cloudfront

import scalajs.js

@js.native
sealed trait CachePolicyCookieBehavior extends js.Any
object CachePolicyCookieBehavior {
  val none = "none".asInstanceOf[CachePolicyCookieBehavior]
  val whitelist = "whitelist".asInstanceOf[CachePolicyCookieBehavior]
  val allExcept = "allExcept".asInstanceOf[CachePolicyCookieBehavior]
  val all = "all".asInstanceOf[CachePolicyCookieBehavior]

  @inline def values: js.Array[CachePolicyCookieBehavior] = js.Array(none, whitelist, allExcept, all)
}

@js.native
sealed trait CachePolicyHeaderBehavior extends js.Any
object CachePolicyHeaderBehavior {
  val none = "none".asInstanceOf[CachePolicyHeaderBehavior]
  val whitelist = "whitelist".asInstanceOf[CachePolicyHeaderBehavior]

  @inline def values: js.Array[CachePolicyHeaderBehavior] = js.Array(none, whitelist)
}

@js.native
sealed trait CachePolicyQueryStringBehavior extends js.Any
object CachePolicyQueryStringBehavior {
  val none = "none".asInstanceOf[CachePolicyQueryStringBehavior]
  val whitelist = "whitelist".asInstanceOf[CachePolicyQueryStringBehavior]
  val allExcept = "allExcept".asInstanceOf[CachePolicyQueryStringBehavior]
  val all = "all".asInstanceOf[CachePolicyQueryStringBehavior]

  @inline def values: js.Array[CachePolicyQueryStringBehavior] = js.Array(none, whitelist, allExcept, all)
}

@js.native
sealed trait CachePolicyType extends js.Any
object CachePolicyType {
  val managed = "managed".asInstanceOf[CachePolicyType]
  val custom = "custom".asInstanceOf[CachePolicyType]

  @inline def values: js.Array[CachePolicyType] = js.Array(managed, custom)
}

@js.native
sealed trait CertificateSource extends js.Any
object CertificateSource {
  val cloudfront = "cloudfront".asInstanceOf[CertificateSource]
  val iam = "iam".asInstanceOf[CertificateSource]
  val acm = "acm".asInstanceOf[CertificateSource]

  @inline def values: js.Array[CertificateSource] = js.Array(cloudfront, iam, acm)
}

@js.native
sealed trait ContinuousDeploymentPolicyType extends js.Any
object ContinuousDeploymentPolicyType {
  val SingleWeight = "SingleWeight".asInstanceOf[ContinuousDeploymentPolicyType]
  val SingleHeader = "SingleHeader".asInstanceOf[ContinuousDeploymentPolicyType]

  @inline def values: js.Array[ContinuousDeploymentPolicyType] = js.Array(SingleWeight, SingleHeader)
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val `viewer-request` = "viewer-request".asInstanceOf[EventType]
  val `viewer-response` = "viewer-response".asInstanceOf[EventType]
  val `origin-request` = "origin-request".asInstanceOf[EventType]
  val `origin-response` = "origin-response".asInstanceOf[EventType]

  @inline def values: js.Array[EventType] = js.Array(`viewer-request`, `viewer-response`, `origin-request`, `origin-response`)
}

@js.native
sealed trait Format extends js.Any
object Format {
  val URLEncoded = "URLEncoded".asInstanceOf[Format]

  @inline def values: js.Array[Format] = js.Array(URLEncoded)
}

@js.native
sealed trait FrameOptionsList extends js.Any
object FrameOptionsList {
  val DENY = "DENY".asInstanceOf[FrameOptionsList]
  val SAMEORIGIN = "SAMEORIGIN".asInstanceOf[FrameOptionsList]

  @inline def values: js.Array[FrameOptionsList] = js.Array(DENY, SAMEORIGIN)
}

@js.native
sealed trait FunctionRuntime extends js.Any
object FunctionRuntime {
  val `cloudfront-js-1.0` = "cloudfront-js-1.0".asInstanceOf[FunctionRuntime]

  @inline def values: js.Array[FunctionRuntime] = js.Array(`cloudfront-js-1.0`)
}

@js.native
sealed trait FunctionStage extends js.Any
object FunctionStage {
  val DEVELOPMENT = "DEVELOPMENT".asInstanceOf[FunctionStage]
  val LIVE = "LIVE".asInstanceOf[FunctionStage]

  @inline def values: js.Array[FunctionStage] = js.Array(DEVELOPMENT, LIVE)
}

@js.native
sealed trait GeoRestrictionType extends js.Any
object GeoRestrictionType {
  val blacklist = "blacklist".asInstanceOf[GeoRestrictionType]
  val whitelist = "whitelist".asInstanceOf[GeoRestrictionType]
  val none = "none".asInstanceOf[GeoRestrictionType]

  @inline def values: js.Array[GeoRestrictionType] = js.Array(blacklist, whitelist, none)
}

@js.native
sealed trait HttpVersion extends js.Any
object HttpVersion {
  val `http1.1` = "http1.1".asInstanceOf[HttpVersion]
  val http2 = "http2".asInstanceOf[HttpVersion]
  val http3 = "http3".asInstanceOf[HttpVersion]
  val http2and3 = "http2and3".asInstanceOf[HttpVersion]

  @inline def values: js.Array[HttpVersion] = js.Array(`http1.1`, http2, http3, http2and3)
}

@js.native
sealed trait ICPRecordalStatus extends js.Any
object ICPRecordalStatus {
  val APPROVED = "APPROVED".asInstanceOf[ICPRecordalStatus]
  val SUSPENDED = "SUSPENDED".asInstanceOf[ICPRecordalStatus]
  val PENDING = "PENDING".asInstanceOf[ICPRecordalStatus]

  @inline def values: js.Array[ICPRecordalStatus] = js.Array(APPROVED, SUSPENDED, PENDING)
}

@js.native
sealed trait ItemSelection extends js.Any
object ItemSelection {
  val none = "none".asInstanceOf[ItemSelection]
  val whitelist = "whitelist".asInstanceOf[ItemSelection]
  val all = "all".asInstanceOf[ItemSelection]

  @inline def values: js.Array[ItemSelection] = js.Array(none, whitelist, all)
}

@js.native
sealed trait Method extends js.Any
object Method {
  val GET = "GET".asInstanceOf[Method]
  val HEAD = "HEAD".asInstanceOf[Method]
  val POST = "POST".asInstanceOf[Method]
  val PUT = "PUT".asInstanceOf[Method]
  val PATCH = "PATCH".asInstanceOf[Method]
  val OPTIONS = "OPTIONS".asInstanceOf[Method]
  val DELETE = "DELETE".asInstanceOf[Method]

  @inline def values: js.Array[Method] = js.Array(GET, HEAD, POST, PUT, PATCH, OPTIONS, DELETE)
}

@js.native
sealed trait MinimumProtocolVersion extends js.Any
object MinimumProtocolVersion {
  val SSLv3 = "SSLv3".asInstanceOf[MinimumProtocolVersion]
  val TLSv1 = "TLSv1".asInstanceOf[MinimumProtocolVersion]
  val TLSv1_2016 = "TLSv1_2016".asInstanceOf[MinimumProtocolVersion]
  val `TLSv1.1_2016` = "TLSv1.1_2016".asInstanceOf[MinimumProtocolVersion]
  val `TLSv1.2_2018` = "TLSv1.2_2018".asInstanceOf[MinimumProtocolVersion]
  val `TLSv1.2_2019` = "TLSv1.2_2019".asInstanceOf[MinimumProtocolVersion]
  val `TLSv1.2_2021` = "TLSv1.2_2021".asInstanceOf[MinimumProtocolVersion]

  @inline def values: js.Array[MinimumProtocolVersion] = js.Array(SSLv3, TLSv1, TLSv1_2016, `TLSv1.1_2016`, `TLSv1.2_2018`, `TLSv1.2_2019`, `TLSv1.2_2021`)
}

@js.native
sealed trait OriginAccessControlOriginTypes extends js.Any
object OriginAccessControlOriginTypes {
  val s3 = "s3".asInstanceOf[OriginAccessControlOriginTypes]

  @inline def values: js.Array[OriginAccessControlOriginTypes] = js.Array(s3)
}

@js.native
sealed trait OriginAccessControlSigningBehaviors extends js.Any
object OriginAccessControlSigningBehaviors {
  val never = "never".asInstanceOf[OriginAccessControlSigningBehaviors]
  val always = "always".asInstanceOf[OriginAccessControlSigningBehaviors]
  val `no-override` = "no-override".asInstanceOf[OriginAccessControlSigningBehaviors]

  @inline def values: js.Array[OriginAccessControlSigningBehaviors] = js.Array(never, always, `no-override`)
}

@js.native
sealed trait OriginAccessControlSigningProtocols extends js.Any
object OriginAccessControlSigningProtocols {
  val sigv4 = "sigv4".asInstanceOf[OriginAccessControlSigningProtocols]

  @inline def values: js.Array[OriginAccessControlSigningProtocols] = js.Array(sigv4)
}

@js.native
sealed trait OriginProtocolPolicy extends js.Any
object OriginProtocolPolicy {
  val `http-only` = "http-only".asInstanceOf[OriginProtocolPolicy]
  val `match-viewer` = "match-viewer".asInstanceOf[OriginProtocolPolicy]
  val `https-only` = "https-only".asInstanceOf[OriginProtocolPolicy]

  @inline def values: js.Array[OriginProtocolPolicy] = js.Array(`http-only`, `match-viewer`, `https-only`)
}

@js.native
sealed trait OriginRequestPolicyCookieBehavior extends js.Any
object OriginRequestPolicyCookieBehavior {
  val none = "none".asInstanceOf[OriginRequestPolicyCookieBehavior]
  val whitelist = "whitelist".asInstanceOf[OriginRequestPolicyCookieBehavior]
  val all = "all".asInstanceOf[OriginRequestPolicyCookieBehavior]

  @inline def values: js.Array[OriginRequestPolicyCookieBehavior] = js.Array(none, whitelist, all)
}

@js.native
sealed trait OriginRequestPolicyHeaderBehavior extends js.Any
object OriginRequestPolicyHeaderBehavior {
  val none = "none".asInstanceOf[OriginRequestPolicyHeaderBehavior]
  val whitelist = "whitelist".asInstanceOf[OriginRequestPolicyHeaderBehavior]
  val allViewer = "allViewer".asInstanceOf[OriginRequestPolicyHeaderBehavior]
  val allViewerAndWhitelistCloudFront = "allViewerAndWhitelistCloudFront".asInstanceOf[OriginRequestPolicyHeaderBehavior]

  @inline def values: js.Array[OriginRequestPolicyHeaderBehavior] = js.Array(none, whitelist, allViewer, allViewerAndWhitelistCloudFront)
}

@js.native
sealed trait OriginRequestPolicyQueryStringBehavior extends js.Any
object OriginRequestPolicyQueryStringBehavior {
  val none = "none".asInstanceOf[OriginRequestPolicyQueryStringBehavior]
  val whitelist = "whitelist".asInstanceOf[OriginRequestPolicyQueryStringBehavior]
  val all = "all".asInstanceOf[OriginRequestPolicyQueryStringBehavior]

  @inline def values: js.Array[OriginRequestPolicyQueryStringBehavior] = js.Array(none, whitelist, all)
}

@js.native
sealed trait OriginRequestPolicyType extends js.Any
object OriginRequestPolicyType {
  val managed = "managed".asInstanceOf[OriginRequestPolicyType]
  val custom = "custom".asInstanceOf[OriginRequestPolicyType]

  @inline def values: js.Array[OriginRequestPolicyType] = js.Array(managed, custom)
}

@js.native
sealed trait PriceClass extends js.Any
object PriceClass {
  val PriceClass_100 = "PriceClass_100".asInstanceOf[PriceClass]
  val PriceClass_200 = "PriceClass_200".asInstanceOf[PriceClass]
  val PriceClass_All = "PriceClass_All".asInstanceOf[PriceClass]

  @inline def values: js.Array[PriceClass] = js.Array(PriceClass_100, PriceClass_200, PriceClass_All)
}

@js.native
sealed trait RealtimeMetricsSubscriptionStatus extends js.Any
object RealtimeMetricsSubscriptionStatus {
  val Enabled = "Enabled".asInstanceOf[RealtimeMetricsSubscriptionStatus]
  val Disabled = "Disabled".asInstanceOf[RealtimeMetricsSubscriptionStatus]

  @inline def values: js.Array[RealtimeMetricsSubscriptionStatus] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ReferrerPolicyList extends js.Any
object ReferrerPolicyList {
  val `no-referrer` = "no-referrer".asInstanceOf[ReferrerPolicyList]
  val `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[ReferrerPolicyList]
  val origin = "origin".asInstanceOf[ReferrerPolicyList]
  val `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[ReferrerPolicyList]
  val `same-origin` = "same-origin".asInstanceOf[ReferrerPolicyList]
  val `strict-origin` = "strict-origin".asInstanceOf[ReferrerPolicyList]
  val `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[ReferrerPolicyList]
  val `unsafe-url` = "unsafe-url".asInstanceOf[ReferrerPolicyList]

  @inline def values: js.Array[ReferrerPolicyList] = js.Array(
    `no-referrer`,
    `no-referrer-when-downgrade`,
    origin,
    `origin-when-cross-origin`,
    `same-origin`,
    `strict-origin`,
    `strict-origin-when-cross-origin`,
    `unsafe-url`
  )
}

@js.native
sealed trait ResponseHeadersPolicyAccessControlAllowMethodsValues extends js.Any
object ResponseHeadersPolicyAccessControlAllowMethodsValues {
  val GET = "GET".asInstanceOf[ResponseHeadersPolicyAccessControlAllowMethodsValues]
  val POST = "POST".asInstanceOf[ResponseHeadersPolicyAccessControlAllowMethodsValues]
  val OPTIONS = "OPTIONS".asInstanceOf[ResponseHeadersPolicyAccessControlAllowMethodsValues]
  val PUT = "PUT".asInstanceOf[ResponseHeadersPolicyAccessControlAllowMethodsValues]
  val DELETE = "DELETE".asInstanceOf[ResponseHeadersPolicyAccessControlAllowMethodsValues]
  val PATCH = "PATCH".asInstanceOf[ResponseHeadersPolicyAccessControlAllowMethodsValues]
  val HEAD = "HEAD".asInstanceOf[ResponseHeadersPolicyAccessControlAllowMethodsValues]
  val ALL = "ALL".asInstanceOf[ResponseHeadersPolicyAccessControlAllowMethodsValues]

  @inline def values: js.Array[ResponseHeadersPolicyAccessControlAllowMethodsValues] = js.Array(GET, POST, OPTIONS, PUT, DELETE, PATCH, HEAD, ALL)
}

@js.native
sealed trait ResponseHeadersPolicyType extends js.Any
object ResponseHeadersPolicyType {
  val managed = "managed".asInstanceOf[ResponseHeadersPolicyType]
  val custom = "custom".asInstanceOf[ResponseHeadersPolicyType]

  @inline def values: js.Array[ResponseHeadersPolicyType] = js.Array(managed, custom)
}

@js.native
sealed trait SSLSupportMethod extends js.Any
object SSLSupportMethod {
  val `sni-only` = "sni-only".asInstanceOf[SSLSupportMethod]
  val vip = "vip".asInstanceOf[SSLSupportMethod]
  val `static-ip` = "static-ip".asInstanceOf[SSLSupportMethod]

  @inline def values: js.Array[SSLSupportMethod] = js.Array(`sni-only`, vip, `static-ip`)
}

@js.native
sealed trait SslProtocol extends js.Any
object SslProtocol {
  val SSLv3 = "SSLv3".asInstanceOf[SslProtocol]
  val TLSv1 = "TLSv1".asInstanceOf[SslProtocol]
  val `TLSv1.1` = "TLSv1.1".asInstanceOf[SslProtocol]
  val `TLSv1.2` = "TLSv1.2".asInstanceOf[SslProtocol]

  @inline def values: js.Array[SslProtocol] = js.Array(SSLv3, TLSv1, `TLSv1.1`, `TLSv1.2`)
}

@js.native
sealed trait ViewerProtocolPolicy extends js.Any
object ViewerProtocolPolicy {
  val `allow-all` = "allow-all".asInstanceOf[ViewerProtocolPolicy]
  val `https-only` = "https-only".asInstanceOf[ViewerProtocolPolicy]
  val `redirect-to-https` = "redirect-to-https".asInstanceOf[ViewerProtocolPolicy]

  @inline def values: js.Array[ViewerProtocolPolicy] = js.Array(`allow-all`, `https-only`, `redirect-to-https`)
}
