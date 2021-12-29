package facade.amazonaws.services.shield

import scalajs._

type AttackLayer = "NETWORK" | "APPLICATION"
object AttackLayer {
  val NETWORK: "NETWORK" = "NETWORK"
  val APPLICATION: "APPLICATION" = "APPLICATION"

  @inline def values = js.Array[AttackLayer](NETWORK, APPLICATION)
}

type AttackPropertyIdentifier = "DESTINATION_URL" | "REFERRER" | "SOURCE_ASN" | "SOURCE_COUNTRY" | "SOURCE_IP_ADDRESS" | "SOURCE_USER_AGENT" | "WORDPRESS_PINGBACK_REFLECTOR" | "WORDPRESS_PINGBACK_SOURCE"
object AttackPropertyIdentifier {
  val DESTINATION_URL: "DESTINATION_URL" = "DESTINATION_URL"
  val REFERRER: "REFERRER" = "REFERRER"
  val SOURCE_ASN: "SOURCE_ASN" = "SOURCE_ASN"
  val SOURCE_COUNTRY: "SOURCE_COUNTRY" = "SOURCE_COUNTRY"
  val SOURCE_IP_ADDRESS: "SOURCE_IP_ADDRESS" = "SOURCE_IP_ADDRESS"
  val SOURCE_USER_AGENT: "SOURCE_USER_AGENT" = "SOURCE_USER_AGENT"
  val WORDPRESS_PINGBACK_REFLECTOR: "WORDPRESS_PINGBACK_REFLECTOR" = "WORDPRESS_PINGBACK_REFLECTOR"
  val WORDPRESS_PINGBACK_SOURCE: "WORDPRESS_PINGBACK_SOURCE" = "WORDPRESS_PINGBACK_SOURCE"

  @inline def values = js.Array[AttackPropertyIdentifier](DESTINATION_URL, REFERRER, SOURCE_ASN, SOURCE_COUNTRY, SOURCE_IP_ADDRESS, SOURCE_USER_AGENT, WORDPRESS_PINGBACK_REFLECTOR, WORDPRESS_PINGBACK_SOURCE)
}

type AutoRenew = "ENABLED" | "DISABLED"
object AutoRenew {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[AutoRenew](ENABLED, DISABLED)
}

type ProactiveEngagementStatus = "ENABLED" | "DISABLED" | "PENDING"
object ProactiveEngagementStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"
  val PENDING: "PENDING" = "PENDING"

  @inline def values = js.Array[ProactiveEngagementStatus](ENABLED, DISABLED, PENDING)
}

type ProtectedResourceType = "CLOUDFRONT_DISTRIBUTION" | "ROUTE_53_HOSTED_ZONE" | "ELASTIC_IP_ALLOCATION" | "CLASSIC_LOAD_BALANCER" | "APPLICATION_LOAD_BALANCER" | "GLOBAL_ACCELERATOR"
object ProtectedResourceType {
  val CLOUDFRONT_DISTRIBUTION: "CLOUDFRONT_DISTRIBUTION" = "CLOUDFRONT_DISTRIBUTION"
  val ROUTE_53_HOSTED_ZONE: "ROUTE_53_HOSTED_ZONE" = "ROUTE_53_HOSTED_ZONE"
  val ELASTIC_IP_ALLOCATION: "ELASTIC_IP_ALLOCATION" = "ELASTIC_IP_ALLOCATION"
  val CLASSIC_LOAD_BALANCER: "CLASSIC_LOAD_BALANCER" = "CLASSIC_LOAD_BALANCER"
  val APPLICATION_LOAD_BALANCER: "APPLICATION_LOAD_BALANCER" = "APPLICATION_LOAD_BALANCER"
  val GLOBAL_ACCELERATOR: "GLOBAL_ACCELERATOR" = "GLOBAL_ACCELERATOR"

  @inline def values = js.Array[ProtectedResourceType](CLOUDFRONT_DISTRIBUTION, ROUTE_53_HOSTED_ZONE, ELASTIC_IP_ALLOCATION, CLASSIC_LOAD_BALANCER, APPLICATION_LOAD_BALANCER, GLOBAL_ACCELERATOR)
}

type ProtectionGroupAggregation = "SUM" | "MEAN" | "MAX"
object ProtectionGroupAggregation {
  val SUM: "SUM" = "SUM"
  val MEAN: "MEAN" = "MEAN"
  val MAX: "MAX" = "MAX"

  @inline def values = js.Array[ProtectionGroupAggregation](SUM, MEAN, MAX)
}

type ProtectionGroupPattern = "ALL" | "ARBITRARY" | "BY_RESOURCE_TYPE"
object ProtectionGroupPattern {
  val ALL: "ALL" = "ALL"
  val ARBITRARY: "ARBITRARY" = "ARBITRARY"
  val BY_RESOURCE_TYPE: "BY_RESOURCE_TYPE" = "BY_RESOURCE_TYPE"

  @inline def values = js.Array[ProtectionGroupPattern](ALL, ARBITRARY, BY_RESOURCE_TYPE)
}

type SubResourceType = "IP" | "URL"
object SubResourceType {
  val IP: "IP" = "IP"
  val URL: "URL" = "URL"

  @inline def values = js.Array[SubResourceType](IP, URL)
}

type SubscriptionState = "ACTIVE" | "INACTIVE"
object SubscriptionState {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[SubscriptionState](ACTIVE, INACTIVE)
}

type Unit = "BITS" | "BYTES" | "PACKETS" | "REQUESTS"
object Unit {
  val BITS: "BITS" = "BITS"
  val BYTES: "BYTES" = "BYTES"
  val PACKETS: "PACKETS" = "PACKETS"
  val REQUESTS: "REQUESTS" = "REQUESTS"

  @inline def values = js.Array[Unit](BITS, BYTES, PACKETS, REQUESTS)
}
