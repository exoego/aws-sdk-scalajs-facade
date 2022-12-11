package facade.amazonaws.services.globalaccelerator

import scalajs.js

@js.native
sealed trait AcceleratorStatus extends js.Any
object AcceleratorStatus {
  val DEPLOYED = "DEPLOYED".asInstanceOf[AcceleratorStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AcceleratorStatus]

  @inline def values: js.Array[AcceleratorStatus] = js.Array(DEPLOYED, IN_PROGRESS)
}

@js.native
sealed trait ByoipCidrState extends js.Any
object ByoipCidrState {
  val PENDING_PROVISIONING = "PENDING_PROVISIONING".asInstanceOf[ByoipCidrState]
  val READY = "READY".asInstanceOf[ByoipCidrState]
  val PENDING_ADVERTISING = "PENDING_ADVERTISING".asInstanceOf[ByoipCidrState]
  val ADVERTISING = "ADVERTISING".asInstanceOf[ByoipCidrState]
  val PENDING_WITHDRAWING = "PENDING_WITHDRAWING".asInstanceOf[ByoipCidrState]
  val PENDING_DEPROVISIONING = "PENDING_DEPROVISIONING".asInstanceOf[ByoipCidrState]
  val DEPROVISIONED = "DEPROVISIONED".asInstanceOf[ByoipCidrState]
  val FAILED_PROVISION = "FAILED_PROVISION".asInstanceOf[ByoipCidrState]
  val FAILED_ADVERTISING = "FAILED_ADVERTISING".asInstanceOf[ByoipCidrState]
  val FAILED_WITHDRAW = "FAILED_WITHDRAW".asInstanceOf[ByoipCidrState]
  val FAILED_DEPROVISION = "FAILED_DEPROVISION".asInstanceOf[ByoipCidrState]

  @inline def values: js.Array[ByoipCidrState] = js.Array(
    PENDING_PROVISIONING,
    READY,
    PENDING_ADVERTISING,
    ADVERTISING,
    PENDING_WITHDRAWING,
    PENDING_DEPROVISIONING,
    DEPROVISIONED,
    FAILED_PROVISION,
    FAILED_ADVERTISING,
    FAILED_WITHDRAW,
    FAILED_DEPROVISION
  )
}

@js.native
sealed trait ClientAffinity extends js.Any
object ClientAffinity {
  val NONE = "NONE".asInstanceOf[ClientAffinity]
  val SOURCE_IP = "SOURCE_IP".asInstanceOf[ClientAffinity]

  @inline def values: js.Array[ClientAffinity] = js.Array(NONE, SOURCE_IP)
}

@js.native
sealed trait CustomRoutingAcceleratorStatus extends js.Any
object CustomRoutingAcceleratorStatus {
  val DEPLOYED = "DEPLOYED".asInstanceOf[CustomRoutingAcceleratorStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[CustomRoutingAcceleratorStatus]

  @inline def values: js.Array[CustomRoutingAcceleratorStatus] = js.Array(DEPLOYED, IN_PROGRESS)
}

@js.native
sealed trait CustomRoutingDestinationTrafficState extends js.Any
object CustomRoutingDestinationTrafficState {
  val ALLOW = "ALLOW".asInstanceOf[CustomRoutingDestinationTrafficState]
  val DENY = "DENY".asInstanceOf[CustomRoutingDestinationTrafficState]

  @inline def values: js.Array[CustomRoutingDestinationTrafficState] = js.Array(ALLOW, DENY)
}

@js.native
sealed trait CustomRoutingProtocol extends js.Any
object CustomRoutingProtocol {
  val TCP = "TCP".asInstanceOf[CustomRoutingProtocol]
  val UDP = "UDP".asInstanceOf[CustomRoutingProtocol]

  @inline def values: js.Array[CustomRoutingProtocol] = js.Array(TCP, UDP)
}

@js.native
sealed trait HealthCheckProtocol extends js.Any
object HealthCheckProtocol {
  val TCP = "TCP".asInstanceOf[HealthCheckProtocol]
  val HTTP = "HTTP".asInstanceOf[HealthCheckProtocol]
  val HTTPS = "HTTPS".asInstanceOf[HealthCheckProtocol]

  @inline def values: js.Array[HealthCheckProtocol] = js.Array(TCP, HTTP, HTTPS)
}

@js.native
sealed trait HealthState extends js.Any
object HealthState {
  val INITIAL = "INITIAL".asInstanceOf[HealthState]
  val HEALTHY = "HEALTHY".asInstanceOf[HealthState]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[HealthState]

  @inline def values: js.Array[HealthState] = js.Array(INITIAL, HEALTHY, UNHEALTHY)
}

@js.native
sealed trait IpAddressFamily extends js.Any
object IpAddressFamily {
  val IPv4 = "IPv4".asInstanceOf[IpAddressFamily]
  val IPv6 = "IPv6".asInstanceOf[IpAddressFamily]

  @inline def values: js.Array[IpAddressFamily] = js.Array(IPv4, IPv6)
}

@js.native
sealed trait IpAddressType extends js.Any
object IpAddressType {
  val IPV4 = "IPV4".asInstanceOf[IpAddressType]
  val DUAL_STACK = "DUAL_STACK".asInstanceOf[IpAddressType]

  @inline def values: js.Array[IpAddressType] = js.Array(IPV4, DUAL_STACK)
}

@js.native
sealed trait Protocol extends js.Any
object Protocol {
  val TCP = "TCP".asInstanceOf[Protocol]
  val UDP = "UDP".asInstanceOf[Protocol]

  @inline def values: js.Array[Protocol] = js.Array(TCP, UDP)
}
