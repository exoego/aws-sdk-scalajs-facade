package facade.amazonaws.services.shield

import scalajs.js

@js.native
sealed trait AttackLayer extends js.Any
object AttackLayer {
  val NETWORK = "NETWORK".asInstanceOf[AttackLayer]
  val APPLICATION = "APPLICATION".asInstanceOf[AttackLayer]

  @inline def values: js.Array[AttackLayer] = js.Array(NETWORK, APPLICATION)
}

@js.native
sealed trait AttackPropertyIdentifier extends js.Any
object AttackPropertyIdentifier {
  val DESTINATION_URL = "DESTINATION_URL".asInstanceOf[AttackPropertyIdentifier]
  val REFERRER = "REFERRER".asInstanceOf[AttackPropertyIdentifier]
  val SOURCE_ASN = "SOURCE_ASN".asInstanceOf[AttackPropertyIdentifier]
  val SOURCE_COUNTRY = "SOURCE_COUNTRY".asInstanceOf[AttackPropertyIdentifier]
  val SOURCE_IP_ADDRESS = "SOURCE_IP_ADDRESS".asInstanceOf[AttackPropertyIdentifier]
  val SOURCE_USER_AGENT = "SOURCE_USER_AGENT".asInstanceOf[AttackPropertyIdentifier]
  val WORDPRESS_PINGBACK_REFLECTOR = "WORDPRESS_PINGBACK_REFLECTOR".asInstanceOf[AttackPropertyIdentifier]
  val WORDPRESS_PINGBACK_SOURCE = "WORDPRESS_PINGBACK_SOURCE".asInstanceOf[AttackPropertyIdentifier]

  @inline def values: js.Array[AttackPropertyIdentifier] = js.Array(DESTINATION_URL, REFERRER, SOURCE_ASN, SOURCE_COUNTRY, SOURCE_IP_ADDRESS, SOURCE_USER_AGENT, WORDPRESS_PINGBACK_REFLECTOR, WORDPRESS_PINGBACK_SOURCE)
}

@js.native
sealed trait AutoRenew extends js.Any
object AutoRenew {
  val ENABLED = "ENABLED".asInstanceOf[AutoRenew]
  val DISABLED = "DISABLED".asInstanceOf[AutoRenew]

  @inline def values: js.Array[AutoRenew] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait ProactiveEngagementStatus extends js.Any
object ProactiveEngagementStatus {
  val ENABLED = "ENABLED".asInstanceOf[ProactiveEngagementStatus]
  val DISABLED = "DISABLED".asInstanceOf[ProactiveEngagementStatus]
  val PENDING = "PENDING".asInstanceOf[ProactiveEngagementStatus]

  @inline def values: js.Array[ProactiveEngagementStatus] = js.Array(ENABLED, DISABLED, PENDING)
}

@js.native
sealed trait ProtectedResourceType extends js.Any
object ProtectedResourceType {
  val CLOUDFRONT_DISTRIBUTION = "CLOUDFRONT_DISTRIBUTION".asInstanceOf[ProtectedResourceType]
  val ROUTE_53_HOSTED_ZONE = "ROUTE_53_HOSTED_ZONE".asInstanceOf[ProtectedResourceType]
  val ELASTIC_IP_ALLOCATION = "ELASTIC_IP_ALLOCATION".asInstanceOf[ProtectedResourceType]
  val CLASSIC_LOAD_BALANCER = "CLASSIC_LOAD_BALANCER".asInstanceOf[ProtectedResourceType]
  val APPLICATION_LOAD_BALANCER = "APPLICATION_LOAD_BALANCER".asInstanceOf[ProtectedResourceType]
  val GLOBAL_ACCELERATOR = "GLOBAL_ACCELERATOR".asInstanceOf[ProtectedResourceType]

  @inline def values: js.Array[ProtectedResourceType] = js.Array(CLOUDFRONT_DISTRIBUTION, ROUTE_53_HOSTED_ZONE, ELASTIC_IP_ALLOCATION, CLASSIC_LOAD_BALANCER, APPLICATION_LOAD_BALANCER, GLOBAL_ACCELERATOR)
}

@js.native
sealed trait ProtectionGroupAggregation extends js.Any
object ProtectionGroupAggregation {
  val SUM = "SUM".asInstanceOf[ProtectionGroupAggregation]
  val MEAN = "MEAN".asInstanceOf[ProtectionGroupAggregation]
  val MAX = "MAX".asInstanceOf[ProtectionGroupAggregation]

  @inline def values: js.Array[ProtectionGroupAggregation] = js.Array(SUM, MEAN, MAX)
}

@js.native
sealed trait ProtectionGroupPattern extends js.Any
object ProtectionGroupPattern {
  val ALL = "ALL".asInstanceOf[ProtectionGroupPattern]
  val ARBITRARY = "ARBITRARY".asInstanceOf[ProtectionGroupPattern]
  val BY_RESOURCE_TYPE = "BY_RESOURCE_TYPE".asInstanceOf[ProtectionGroupPattern]

  @inline def values: js.Array[ProtectionGroupPattern] = js.Array(ALL, ARBITRARY, BY_RESOURCE_TYPE)
}

@js.native
sealed trait SubResourceType extends js.Any
object SubResourceType {
  val IP = "IP".asInstanceOf[SubResourceType]
  val URL = "URL".asInstanceOf[SubResourceType]

  @inline def values: js.Array[SubResourceType] = js.Array(IP, URL)
}

@js.native
sealed trait SubscriptionState extends js.Any
object SubscriptionState {
  val ACTIVE = "ACTIVE".asInstanceOf[SubscriptionState]
  val INACTIVE = "INACTIVE".asInstanceOf[SubscriptionState]

  @inline def values: js.Array[SubscriptionState] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait Unit extends js.Any
object Unit {
  val BITS = "BITS".asInstanceOf[Unit]
  val BYTES = "BYTES".asInstanceOf[Unit]
  val PACKETS = "PACKETS".asInstanceOf[Unit]
  val REQUESTS = "REQUESTS".asInstanceOf[Unit]

  @inline def values: js.Array[Unit] = js.Array(BITS, BYTES, PACKETS, REQUESTS)
}
