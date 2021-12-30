package facade.amazonaws.services.shield

import scalajs.js

type AttackLayer = "NETWORK" | "APPLICATION"
object AttackLayer {
  inline val NETWORK: "NETWORK" = "NETWORK"
  inline val APPLICATION: "APPLICATION" = "APPLICATION"

  inline def values: js.Array[AttackLayer] = js.Array(NETWORK, APPLICATION)
}

type AttackPropertyIdentifier = "DESTINATION_URL" | "REFERRER" | "SOURCE_ASN" | "SOURCE_COUNTRY" | "SOURCE_IP_ADDRESS" | "SOURCE_USER_AGENT" | "WORDPRESS_PINGBACK_REFLECTOR" | "WORDPRESS_PINGBACK_SOURCE"
object AttackPropertyIdentifier {
  inline val DESTINATION_URL: "DESTINATION_URL" = "DESTINATION_URL"
  inline val REFERRER: "REFERRER" = "REFERRER"
  inline val SOURCE_ASN: "SOURCE_ASN" = "SOURCE_ASN"
  inline val SOURCE_COUNTRY: "SOURCE_COUNTRY" = "SOURCE_COUNTRY"
  inline val SOURCE_IP_ADDRESS: "SOURCE_IP_ADDRESS" = "SOURCE_IP_ADDRESS"
  inline val SOURCE_USER_AGENT: "SOURCE_USER_AGENT" = "SOURCE_USER_AGENT"
  inline val WORDPRESS_PINGBACK_REFLECTOR: "WORDPRESS_PINGBACK_REFLECTOR" = "WORDPRESS_PINGBACK_REFLECTOR"
  inline val WORDPRESS_PINGBACK_SOURCE: "WORDPRESS_PINGBACK_SOURCE" = "WORDPRESS_PINGBACK_SOURCE"

  inline def values: js.Array[AttackPropertyIdentifier] = js.Array(DESTINATION_URL, REFERRER, SOURCE_ASN, SOURCE_COUNTRY, SOURCE_IP_ADDRESS, SOURCE_USER_AGENT, WORDPRESS_PINGBACK_REFLECTOR, WORDPRESS_PINGBACK_SOURCE)
}

type AutoRenew = "ENABLED" | "DISABLED"
object AutoRenew {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AutoRenew] = js.Array(ENABLED, DISABLED)
}

type ProactiveEngagementStatus = "ENABLED" | "DISABLED" | "PENDING"
object ProactiveEngagementStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[ProactiveEngagementStatus] = js.Array(ENABLED, DISABLED, PENDING)
}

type ProtectedResourceType = "CLOUDFRONT_DISTRIBUTION" | "ROUTE_53_HOSTED_ZONE" | "ELASTIC_IP_ALLOCATION" | "CLASSIC_LOAD_BALANCER" | "APPLICATION_LOAD_BALANCER" | "GLOBAL_ACCELERATOR"
object ProtectedResourceType {
  inline val CLOUDFRONT_DISTRIBUTION: "CLOUDFRONT_DISTRIBUTION" = "CLOUDFRONT_DISTRIBUTION"
  inline val ROUTE_53_HOSTED_ZONE: "ROUTE_53_HOSTED_ZONE" = "ROUTE_53_HOSTED_ZONE"
  inline val ELASTIC_IP_ALLOCATION: "ELASTIC_IP_ALLOCATION" = "ELASTIC_IP_ALLOCATION"
  inline val CLASSIC_LOAD_BALANCER: "CLASSIC_LOAD_BALANCER" = "CLASSIC_LOAD_BALANCER"
  inline val APPLICATION_LOAD_BALANCER: "APPLICATION_LOAD_BALANCER" = "APPLICATION_LOAD_BALANCER"
  inline val GLOBAL_ACCELERATOR: "GLOBAL_ACCELERATOR" = "GLOBAL_ACCELERATOR"

  inline def values: js.Array[ProtectedResourceType] = js.Array(CLOUDFRONT_DISTRIBUTION, ROUTE_53_HOSTED_ZONE, ELASTIC_IP_ALLOCATION, CLASSIC_LOAD_BALANCER, APPLICATION_LOAD_BALANCER, GLOBAL_ACCELERATOR)
}

type ProtectionGroupAggregation = "SUM" | "MEAN" | "MAX"
object ProtectionGroupAggregation {
  inline val SUM: "SUM" = "SUM"
  inline val MEAN: "MEAN" = "MEAN"
  inline val MAX: "MAX" = "MAX"

  inline def values: js.Array[ProtectionGroupAggregation] = js.Array(SUM, MEAN, MAX)
}

type ProtectionGroupPattern = "ALL" | "ARBITRARY" | "BY_RESOURCE_TYPE"
object ProtectionGroupPattern {
  inline val ALL: "ALL" = "ALL"
  inline val ARBITRARY: "ARBITRARY" = "ARBITRARY"
  inline val BY_RESOURCE_TYPE: "BY_RESOURCE_TYPE" = "BY_RESOURCE_TYPE"

  inline def values: js.Array[ProtectionGroupPattern] = js.Array(ALL, ARBITRARY, BY_RESOURCE_TYPE)
}

type SubResourceType = "IP" | "URL"
object SubResourceType {
  inline val IP: "IP" = "IP"
  inline val URL: "URL" = "URL"

  inline def values: js.Array[SubResourceType] = js.Array(IP, URL)
}

type SubscriptionState = "ACTIVE" | "INACTIVE"
object SubscriptionState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[SubscriptionState] = js.Array(ACTIVE, INACTIVE)
}

type Unit = "BITS" | "BYTES" | "PACKETS" | "REQUESTS"
object Unit {
  inline val BITS: "BITS" = "BITS"
  inline val BYTES: "BYTES" = "BYTES"
  inline val PACKETS: "PACKETS" = "PACKETS"
  inline val REQUESTS: "REQUESTS" = "REQUESTS"

  inline def values: js.Array[Unit] = js.Array(BITS, BYTES, PACKETS, REQUESTS)
}
