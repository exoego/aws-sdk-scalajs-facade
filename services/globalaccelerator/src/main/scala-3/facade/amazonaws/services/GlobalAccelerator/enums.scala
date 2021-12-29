package facade.amazonaws.services.globalaccelerator

import scalajs._

type AcceleratorStatus = "DEPLOYED" | "IN_PROGRESS"
object AcceleratorStatus {
  val DEPLOYED: "DEPLOYED" = "DEPLOYED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"

  @inline def values = js.Array[AcceleratorStatus](DEPLOYED, IN_PROGRESS)
}

type ByoipCidrState = "PENDING_PROVISIONING" | "READY" | "PENDING_ADVERTISING" | "ADVERTISING" | "PENDING_WITHDRAWING" | "PENDING_DEPROVISIONING" | "DEPROVISIONED" | "FAILED_PROVISION" | "FAILED_ADVERTISING" | "FAILED_WITHDRAW" | "FAILED_DEPROVISION"
object ByoipCidrState {
  val PENDING_PROVISIONING: "PENDING_PROVISIONING" = "PENDING_PROVISIONING"
  val READY: "READY" = "READY"
  val PENDING_ADVERTISING: "PENDING_ADVERTISING" = "PENDING_ADVERTISING"
  val ADVERTISING: "ADVERTISING" = "ADVERTISING"
  val PENDING_WITHDRAWING: "PENDING_WITHDRAWING" = "PENDING_WITHDRAWING"
  val PENDING_DEPROVISIONING: "PENDING_DEPROVISIONING" = "PENDING_DEPROVISIONING"
  val DEPROVISIONED: "DEPROVISIONED" = "DEPROVISIONED"
  val FAILED_PROVISION: "FAILED_PROVISION" = "FAILED_PROVISION"
  val FAILED_ADVERTISING: "FAILED_ADVERTISING" = "FAILED_ADVERTISING"
  val FAILED_WITHDRAW: "FAILED_WITHDRAW" = "FAILED_WITHDRAW"
  val FAILED_DEPROVISION: "FAILED_DEPROVISION" = "FAILED_DEPROVISION"

  @inline def values = js.Array[ByoipCidrState](
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

type ClientAffinity = "NONE" | "SOURCE_IP"
object ClientAffinity {
  val NONE: "NONE" = "NONE"
  val SOURCE_IP: "SOURCE_IP" = "SOURCE_IP"

  @inline def values = js.Array[ClientAffinity](NONE, SOURCE_IP)
}

type CustomRoutingAcceleratorStatus = "DEPLOYED" | "IN_PROGRESS"
object CustomRoutingAcceleratorStatus {
  val DEPLOYED: "DEPLOYED" = "DEPLOYED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"

  @inline def values = js.Array[CustomRoutingAcceleratorStatus](DEPLOYED, IN_PROGRESS)
}

type CustomRoutingDestinationTrafficState = "ALLOW" | "DENY"
object CustomRoutingDestinationTrafficState {
  val ALLOW: "ALLOW" = "ALLOW"
  val DENY: "DENY" = "DENY"

  @inline def values = js.Array[CustomRoutingDestinationTrafficState](ALLOW, DENY)
}

type CustomRoutingProtocol = "TCP" | "UDP"
object CustomRoutingProtocol {
  val TCP: "TCP" = "TCP"
  val UDP: "UDP" = "UDP"

  @inline def values = js.Array[CustomRoutingProtocol](TCP, UDP)
}

type HealthCheckProtocol = "TCP" | "HTTP" | "HTTPS"
object HealthCheckProtocol {
  val TCP: "TCP" = "TCP"
  val HTTP: "HTTP" = "HTTP"
  val HTTPS: "HTTPS" = "HTTPS"

  @inline def values = js.Array[HealthCheckProtocol](TCP, HTTP, HTTPS)
}

type HealthState = "INITIAL" | "HEALTHY" | "UNHEALTHY"
object HealthState {
  val INITIAL: "INITIAL" = "INITIAL"
  val HEALTHY: "HEALTHY" = "HEALTHY"
  val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"

  @inline def values = js.Array[HealthState](INITIAL, HEALTHY, UNHEALTHY)
}

type IpAddressType = "IPV4"
object IpAddressType {
  val IPV4: "IPV4" = "IPV4"

  @inline def values = js.Array[IpAddressType](IPV4)
}

type Protocol = "TCP" | "UDP"
object Protocol {
  val TCP: "TCP" = "TCP"
  val UDP: "UDP" = "UDP"

  @inline def values = js.Array[Protocol](TCP, UDP)
}
