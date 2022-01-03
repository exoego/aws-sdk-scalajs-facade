package facade.amazonaws.services.cloudfront

import scalajs.js

type CachePolicyCookieBehavior = "none" | "whitelist" | "allExcept" | "all"
object CachePolicyCookieBehavior {
  inline val none: "none" = "none"
  inline val whitelist: "whitelist" = "whitelist"
  inline val allExcept: "allExcept" = "allExcept"
  inline val all: "all" = "all"

  inline def values: js.Array[CachePolicyCookieBehavior] = js.Array(none, whitelist, allExcept, all)
}

type CachePolicyHeaderBehavior = "none" | "whitelist"
object CachePolicyHeaderBehavior {
  inline val none: "none" = "none"
  inline val whitelist: "whitelist" = "whitelist"

  inline def values: js.Array[CachePolicyHeaderBehavior] = js.Array(none, whitelist)
}

type CachePolicyQueryStringBehavior = "none" | "whitelist" | "allExcept" | "all"
object CachePolicyQueryStringBehavior {
  inline val none: "none" = "none"
  inline val whitelist: "whitelist" = "whitelist"
  inline val allExcept: "allExcept" = "allExcept"
  inline val all: "all" = "all"

  inline def values: js.Array[CachePolicyQueryStringBehavior] = js.Array(none, whitelist, allExcept, all)
}

type CachePolicyType = "managed" | "custom"
object CachePolicyType {
  inline val managed: "managed" = "managed"
  inline val custom: "custom" = "custom"

  inline def values: js.Array[CachePolicyType] = js.Array(managed, custom)
}

type CertificateSource = "cloudfront" | "iam" | "acm"
object CertificateSource {
  inline val cloudfront: "cloudfront" = "cloudfront"
  inline val iam: "iam" = "iam"
  inline val acm: "acm" = "acm"

  inline def values: js.Array[CertificateSource] = js.Array(cloudfront, iam, acm)
}

type EventType = "viewer-request" | "viewer-response" | "origin-request" | "origin-response"
object EventType {
  inline val `viewer-request`: "viewer-request" = "viewer-request"
  inline val `viewer-response`: "viewer-response" = "viewer-response"
  inline val `origin-request`: "origin-request" = "origin-request"
  inline val `origin-response`: "origin-response" = "origin-response"

  inline def values: js.Array[EventType] = js.Array(`viewer-request`, `viewer-response`, `origin-request`, `origin-response`)
}

type Format = "URLEncoded"
object Format {
  inline val URLEncoded: "URLEncoded" = "URLEncoded"

  inline def values: js.Array[Format] = js.Array(URLEncoded)
}

type FrameOptionsList = "DENY" | "SAMEORIGIN"
object FrameOptionsList {
  inline val DENY: "DENY" = "DENY"
  inline val SAMEORIGIN: "SAMEORIGIN" = "SAMEORIGIN"

  inline def values: js.Array[FrameOptionsList] = js.Array(DENY, SAMEORIGIN)
}

type FunctionRuntime = "cloudfront-js-1.0"
object FunctionRuntime {
  inline val `cloudfront-js-1.0`: "cloudfront-js-1.0" = "cloudfront-js-1.0"

  inline def values: js.Array[FunctionRuntime] = js.Array(`cloudfront-js-1.0`)
}

type FunctionStage = "DEVELOPMENT" | "LIVE"
object FunctionStage {
  inline val DEVELOPMENT: "DEVELOPMENT" = "DEVELOPMENT"
  inline val LIVE: "LIVE" = "LIVE"

  inline def values: js.Array[FunctionStage] = js.Array(DEVELOPMENT, LIVE)
}

type GeoRestrictionType = "blacklist" | "whitelist" | "none"
object GeoRestrictionType {
  inline val blacklist: "blacklist" = "blacklist"
  inline val whitelist: "whitelist" = "whitelist"
  inline val none: "none" = "none"

  inline def values: js.Array[GeoRestrictionType] = js.Array(blacklist, whitelist, none)
}

type HttpVersion = "http1.1" | "http2"
object HttpVersion {
  inline val `http1.1`: "http1.1" = "http1.1"
  inline val http2: "http2" = "http2"

  inline def values: js.Array[HttpVersion] = js.Array(`http1.1`, http2)
}

type ICPRecordalStatus = "APPROVED" | "SUSPENDED" | "PENDING"
object ICPRecordalStatus {
  inline val APPROVED: "APPROVED" = "APPROVED"
  inline val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[ICPRecordalStatus] = js.Array(APPROVED, SUSPENDED, PENDING)
}

type ItemSelection = "none" | "whitelist" | "all"
object ItemSelection {
  inline val none: "none" = "none"
  inline val whitelist: "whitelist" = "whitelist"
  inline val all: "all" = "all"

  inline def values: js.Array[ItemSelection] = js.Array(none, whitelist, all)
}

type Method = "GET" | "HEAD" | "POST" | "PUT" | "PATCH" | "OPTIONS" | "DELETE"
object Method {
  inline val GET: "GET" = "GET"
  inline val HEAD: "HEAD" = "HEAD"
  inline val POST: "POST" = "POST"
  inline val PUT: "PUT" = "PUT"
  inline val PATCH: "PATCH" = "PATCH"
  inline val OPTIONS: "OPTIONS" = "OPTIONS"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[Method] = js.Array(GET, HEAD, POST, PUT, PATCH, OPTIONS, DELETE)
}

type MinimumProtocolVersion = "SSLv3" | "TLSv1" | "TLSv1_2016" | "TLSv1.1_2016" | "TLSv1.2_2018" | "TLSv1.2_2019" | "TLSv1.2_2021"
object MinimumProtocolVersion {
  inline val SSLv3: "SSLv3" = "SSLv3"
  inline val TLSv1: "TLSv1" = "TLSv1"
  inline val TLSv1_2016: "TLSv1_2016" = "TLSv1_2016"
  inline val `TLSv1.1_2016`: "TLSv1.1_2016" = "TLSv1.1_2016"
  inline val `TLSv1.2_2018`: "TLSv1.2_2018" = "TLSv1.2_2018"
  inline val `TLSv1.2_2019`: "TLSv1.2_2019" = "TLSv1.2_2019"
  inline val `TLSv1.2_2021`: "TLSv1.2_2021" = "TLSv1.2_2021"

  inline def values: js.Array[MinimumProtocolVersion] = js.Array(SSLv3, TLSv1, TLSv1_2016, `TLSv1.1_2016`, `TLSv1.2_2018`, `TLSv1.2_2019`, `TLSv1.2_2021`)
}

type OriginProtocolPolicy = "http-only" | "match-viewer" | "https-only"
object OriginProtocolPolicy {
  inline val `http-only`: "http-only" = "http-only"
  inline val `match-viewer`: "match-viewer" = "match-viewer"
  inline val `https-only`: "https-only" = "https-only"

  inline def values: js.Array[OriginProtocolPolicy] = js.Array(`http-only`, `match-viewer`, `https-only`)
}

type OriginRequestPolicyCookieBehavior = "none" | "whitelist" | "all"
object OriginRequestPolicyCookieBehavior {
  inline val none: "none" = "none"
  inline val whitelist: "whitelist" = "whitelist"
  inline val all: "all" = "all"

  inline def values: js.Array[OriginRequestPolicyCookieBehavior] = js.Array(none, whitelist, all)
}

type OriginRequestPolicyHeaderBehavior = "none" | "whitelist" | "allViewer" | "allViewerAndWhitelistCloudFront"
object OriginRequestPolicyHeaderBehavior {
  inline val none: "none" = "none"
  inline val whitelist: "whitelist" = "whitelist"
  inline val allViewer: "allViewer" = "allViewer"
  inline val allViewerAndWhitelistCloudFront: "allViewerAndWhitelistCloudFront" = "allViewerAndWhitelistCloudFront"

  inline def values: js.Array[OriginRequestPolicyHeaderBehavior] = js.Array(none, whitelist, allViewer, allViewerAndWhitelistCloudFront)
}

type OriginRequestPolicyQueryStringBehavior = "none" | "whitelist" | "all"
object OriginRequestPolicyQueryStringBehavior {
  inline val none: "none" = "none"
  inline val whitelist: "whitelist" = "whitelist"
  inline val all: "all" = "all"

  inline def values: js.Array[OriginRequestPolicyQueryStringBehavior] = js.Array(none, whitelist, all)
}

type OriginRequestPolicyType = "managed" | "custom"
object OriginRequestPolicyType {
  inline val managed: "managed" = "managed"
  inline val custom: "custom" = "custom"

  inline def values: js.Array[OriginRequestPolicyType] = js.Array(managed, custom)
}

type PriceClass = "PriceClass_100" | "PriceClass_200" | "PriceClass_All"
object PriceClass {
  inline val PriceClass_100: "PriceClass_100" = "PriceClass_100"
  inline val PriceClass_200: "PriceClass_200" = "PriceClass_200"
  inline val PriceClass_All: "PriceClass_All" = "PriceClass_All"

  inline def values: js.Array[PriceClass] = js.Array(PriceClass_100, PriceClass_200, PriceClass_All)
}

type RealtimeMetricsSubscriptionStatus = "Enabled" | "Disabled"
object RealtimeMetricsSubscriptionStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[RealtimeMetricsSubscriptionStatus] = js.Array(Enabled, Disabled)
}

type ReferrerPolicyList = "no-referrer" | "no-referrer-when-downgrade" | "origin" | "origin-when-cross-origin" | "same-origin" | "strict-origin" | "strict-origin-when-cross-origin" | "unsafe-url"
object ReferrerPolicyList {
  inline val `no-referrer`: "no-referrer" = "no-referrer"
  inline val `no-referrer-when-downgrade`: "no-referrer-when-downgrade" = "no-referrer-when-downgrade"
  inline val origin: "origin" = "origin"
  inline val `origin-when-cross-origin`: "origin-when-cross-origin" = "origin-when-cross-origin"
  inline val `same-origin`: "same-origin" = "same-origin"
  inline val `strict-origin`: "strict-origin" = "strict-origin"
  inline val `strict-origin-when-cross-origin`: "strict-origin-when-cross-origin" = "strict-origin-when-cross-origin"
  inline val `unsafe-url`: "unsafe-url" = "unsafe-url"

  inline def values: js.Array[ReferrerPolicyList] = js.Array(
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

type ResponseHeadersPolicyAccessControlAllowMethodsValues = "GET" | "POST" | "OPTIONS" | "PUT" | "DELETE" | "PATCH" | "HEAD" | "ALL"
object ResponseHeadersPolicyAccessControlAllowMethodsValues {
  inline val GET: "GET" = "GET"
  inline val POST: "POST" = "POST"
  inline val OPTIONS: "OPTIONS" = "OPTIONS"
  inline val PUT: "PUT" = "PUT"
  inline val DELETE: "DELETE" = "DELETE"
  inline val PATCH: "PATCH" = "PATCH"
  inline val HEAD: "HEAD" = "HEAD"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[ResponseHeadersPolicyAccessControlAllowMethodsValues] = js.Array(GET, POST, OPTIONS, PUT, DELETE, PATCH, HEAD, ALL)
}

type ResponseHeadersPolicyType = "managed" | "custom"
object ResponseHeadersPolicyType {
  inline val managed: "managed" = "managed"
  inline val custom: "custom" = "custom"

  inline def values: js.Array[ResponseHeadersPolicyType] = js.Array(managed, custom)
}

type SSLSupportMethod = "sni-only" | "vip" | "static-ip"
object SSLSupportMethod {
  inline val `sni-only`: "sni-only" = "sni-only"
  inline val vip: "vip" = "vip"
  inline val `static-ip`: "static-ip" = "static-ip"

  inline def values: js.Array[SSLSupportMethod] = js.Array(`sni-only`, vip, `static-ip`)
}

type SslProtocol = "SSLv3" | "TLSv1" | "TLSv1.1" | "TLSv1.2"
object SslProtocol {
  inline val SSLv3: "SSLv3" = "SSLv3"
  inline val TLSv1: "TLSv1" = "TLSv1"
  inline val `TLSv1.1`: "TLSv1.1" = "TLSv1.1"
  inline val `TLSv1.2`: "TLSv1.2" = "TLSv1.2"

  inline def values: js.Array[SslProtocol] = js.Array(SSLv3, TLSv1, `TLSv1.1`, `TLSv1.2`)
}

type ViewerProtocolPolicy = "allow-all" | "https-only" | "redirect-to-https"
object ViewerProtocolPolicy {
  inline val `allow-all`: "allow-all" = "allow-all"
  inline val `https-only`: "https-only" = "https-only"
  inline val `redirect-to-https`: "redirect-to-https" = "redirect-to-https"

  inline def values: js.Array[ViewerProtocolPolicy] = js.Array(`allow-all`, `https-only`, `redirect-to-https`)
}
