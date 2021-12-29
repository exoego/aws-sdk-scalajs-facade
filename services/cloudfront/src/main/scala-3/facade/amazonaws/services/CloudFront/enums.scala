package facade.amazonaws.services.cloudfront

import scalajs._

type CachePolicyCookieBehavior = "none" | "whitelist" | "allExcept" | "all"
object CachePolicyCookieBehavior {
  val none: "none" = "none"
  val whitelist: "whitelist" = "whitelist"
  val allExcept: "allExcept" = "allExcept"
  val all: "all" = "all"

  @inline def values = js.Array[CachePolicyCookieBehavior](none, whitelist, allExcept, all)
}

type CachePolicyHeaderBehavior = "none" | "whitelist"
object CachePolicyHeaderBehavior {
  val none: "none" = "none"
  val whitelist: "whitelist" = "whitelist"

  @inline def values = js.Array[CachePolicyHeaderBehavior](none, whitelist)
}

type CachePolicyQueryStringBehavior = "none" | "whitelist" | "allExcept" | "all"
object CachePolicyQueryStringBehavior {
  val none: "none" = "none"
  val whitelist: "whitelist" = "whitelist"
  val allExcept: "allExcept" = "allExcept"
  val all: "all" = "all"

  @inline def values = js.Array[CachePolicyQueryStringBehavior](none, whitelist, allExcept, all)
}

type CachePolicyType = "managed" | "custom"
object CachePolicyType {
  val managed: "managed" = "managed"
  val custom: "custom" = "custom"

  @inline def values = js.Array[CachePolicyType](managed, custom)
}

type CertificateSource = "cloudfront" | "iam" | "acm"
object CertificateSource {
  val cloudfront: "cloudfront" = "cloudfront"
  val iam: "iam" = "iam"
  val acm: "acm" = "acm"

  @inline def values = js.Array[CertificateSource](cloudfront, iam, acm)
}

type EventType = "viewer-request" | "viewer-response" | "origin-request" | "origin-response"
object EventType {
  val `viewer-request`: "viewer-request" = "viewer-request"
  val `viewer-response`: "viewer-response" = "viewer-response"
  val `origin-request`: "origin-request" = "origin-request"
  val `origin-response`: "origin-response" = "origin-response"

  @inline def values = js.Array[EventType](`viewer-request`, `viewer-response`, `origin-request`, `origin-response`)
}

type Format = "URLEncoded"
object Format {
  val URLEncoded: "URLEncoded" = "URLEncoded"

  @inline def values = js.Array[Format](URLEncoded)
}

type GeoRestrictionType = "blacklist" | "whitelist" | "none"
object GeoRestrictionType {
  val blacklist: "blacklist" = "blacklist"
  val whitelist: "whitelist" = "whitelist"
  val none: "none" = "none"

  @inline def values = js.Array[GeoRestrictionType](blacklist, whitelist, none)
}

type HttpVersion = "http1.1" | "http2"
object HttpVersion {
  val `http1.1`: "http1.1" = "http1.1"
  val http2: "http2" = "http2"

  @inline def values = js.Array[HttpVersion](`http1.1`, http2)
}

type ICPRecordalStatus = "APPROVED" | "SUSPENDED" | "PENDING"
object ICPRecordalStatus {
  val APPROVED: "APPROVED" = "APPROVED"
  val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  val PENDING: "PENDING" = "PENDING"

  @inline def values = js.Array[ICPRecordalStatus](APPROVED, SUSPENDED, PENDING)
}

type ItemSelection = "none" | "whitelist" | "all"
object ItemSelection {
  val none: "none" = "none"
  val whitelist: "whitelist" = "whitelist"
  val all: "all" = "all"

  @inline def values = js.Array[ItemSelection](none, whitelist, all)
}

type Method = "GET" | "HEAD" | "POST" | "PUT" | "PATCH" | "OPTIONS" | "DELETE"
object Method {
  val GET: "GET" = "GET"
  val HEAD: "HEAD" = "HEAD"
  val POST: "POST" = "POST"
  val PUT: "PUT" = "PUT"
  val PATCH: "PATCH" = "PATCH"
  val OPTIONS: "OPTIONS" = "OPTIONS"
  val DELETE: "DELETE" = "DELETE"

  @inline def values = js.Array[Method](GET, HEAD, POST, PUT, PATCH, OPTIONS, DELETE)
}

type MinimumProtocolVersion = "SSLv3" | "TLSv1" | "TLSv1_2016" | "TLSv1.1_2016" | "TLSv1.2_2018" | "TLSv1.2_2019"
object MinimumProtocolVersion {
  val SSLv3: "SSLv3" = "SSLv3"
  val TLSv1: "TLSv1" = "TLSv1"
  val TLSv1_2016: "TLSv1_2016" = "TLSv1_2016"
  val `TLSv1.1_2016`: "TLSv1.1_2016" = "TLSv1.1_2016"
  val `TLSv1.2_2018`: "TLSv1.2_2018" = "TLSv1.2_2018"
  val `TLSv1.2_2019`: "TLSv1.2_2019" = "TLSv1.2_2019"

  @inline def values = js.Array[MinimumProtocolVersion](SSLv3, TLSv1, TLSv1_2016, `TLSv1.1_2016`, `TLSv1.2_2018`, `TLSv1.2_2019`)
}

type OriginProtocolPolicy = "http-only" | "match-viewer" | "https-only"
object OriginProtocolPolicy {
  val `http-only`: "http-only" = "http-only"
  val `match-viewer`: "match-viewer" = "match-viewer"
  val `https-only`: "https-only" = "https-only"

  @inline def values = js.Array[OriginProtocolPolicy](`http-only`, `match-viewer`, `https-only`)
}

type OriginRequestPolicyCookieBehavior = "none" | "whitelist" | "all"
object OriginRequestPolicyCookieBehavior {
  val none: "none" = "none"
  val whitelist: "whitelist" = "whitelist"
  val all: "all" = "all"

  @inline def values = js.Array[OriginRequestPolicyCookieBehavior](none, whitelist, all)
}

type OriginRequestPolicyHeaderBehavior = "none" | "whitelist" | "allViewer" | "allViewerAndWhitelistCloudFront"
object OriginRequestPolicyHeaderBehavior {
  val none: "none" = "none"
  val whitelist: "whitelist" = "whitelist"
  val allViewer: "allViewer" = "allViewer"
  val allViewerAndWhitelistCloudFront: "allViewerAndWhitelistCloudFront" = "allViewerAndWhitelistCloudFront"

  @inline def values = js.Array[OriginRequestPolicyHeaderBehavior](none, whitelist, allViewer, allViewerAndWhitelistCloudFront)
}

type OriginRequestPolicyQueryStringBehavior = "none" | "whitelist" | "all"
object OriginRequestPolicyQueryStringBehavior {
  val none: "none" = "none"
  val whitelist: "whitelist" = "whitelist"
  val all: "all" = "all"

  @inline def values = js.Array[OriginRequestPolicyQueryStringBehavior](none, whitelist, all)
}

type OriginRequestPolicyType = "managed" | "custom"
object OriginRequestPolicyType {
  val managed: "managed" = "managed"
  val custom: "custom" = "custom"

  @inline def values = js.Array[OriginRequestPolicyType](managed, custom)
}

type PriceClass = "PriceClass_100" | "PriceClass_200" | "PriceClass_All"
object PriceClass {
  val PriceClass_100: "PriceClass_100" = "PriceClass_100"
  val PriceClass_200: "PriceClass_200" = "PriceClass_200"
  val PriceClass_All: "PriceClass_All" = "PriceClass_All"

  @inline def values = js.Array[PriceClass](PriceClass_100, PriceClass_200, PriceClass_All)
}

type RealtimeMetricsSubscriptionStatus = "Enabled" | "Disabled"
object RealtimeMetricsSubscriptionStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[RealtimeMetricsSubscriptionStatus](Enabled, Disabled)
}

type SSLSupportMethod = "sni-only" | "vip" | "static-ip"
object SSLSupportMethod {
  val `sni-only`: "sni-only" = "sni-only"
  val vip: "vip" = "vip"
  val `static-ip`: "static-ip" = "static-ip"

  @inline def values = js.Array[SSLSupportMethod](`sni-only`, vip, `static-ip`)
}

type SslProtocol = "SSLv3" | "TLSv1" | "TLSv1.1" | "TLSv1.2"
object SslProtocol {
  val SSLv3: "SSLv3" = "SSLv3"
  val TLSv1: "TLSv1" = "TLSv1"
  val `TLSv1.1`: "TLSv1.1" = "TLSv1.1"
  val `TLSv1.2`: "TLSv1.2" = "TLSv1.2"

  @inline def values = js.Array[SslProtocol](SSLv3, TLSv1, `TLSv1.1`, `TLSv1.2`)
}

type ViewerProtocolPolicy = "allow-all" | "https-only" | "redirect-to-https"
object ViewerProtocolPolicy {
  val `allow-all`: "allow-all" = "allow-all"
  val `https-only`: "https-only" = "https-only"
  val `redirect-to-https`: "redirect-to-https" = "redirect-to-https"

  @inline def values = js.Array[ViewerProtocolPolicy](`allow-all`, `https-only`, `redirect-to-https`)
}
