package facade.amazonaws.services.globalaccelerator

import scalajs.js

type AcceleratorStatus = "DEPLOYED" | "IN_PROGRESS"
object AcceleratorStatus {
  inline val DEPLOYED: "DEPLOYED" = "DEPLOYED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"

  inline def values: js.Array[AcceleratorStatus] = js.Array(DEPLOYED, IN_PROGRESS)
}

type ByoipCidrState = "PENDING_PROVISIONING" | "READY" | "PENDING_ADVERTISING" | "ADVERTISING" | "PENDING_WITHDRAWING" | "PENDING_DEPROVISIONING" | "DEPROVISIONED" | "FAILED_PROVISION" | "FAILED_ADVERTISING" | "FAILED_WITHDRAW" | "FAILED_DEPROVISION"
object ByoipCidrState {
  inline val PENDING_PROVISIONING: "PENDING_PROVISIONING" = "PENDING_PROVISIONING"
  inline val READY: "READY" = "READY"
  inline val PENDING_ADVERTISING: "PENDING_ADVERTISING" = "PENDING_ADVERTISING"
  inline val ADVERTISING: "ADVERTISING" = "ADVERTISING"
  inline val PENDING_WITHDRAWING: "PENDING_WITHDRAWING" = "PENDING_WITHDRAWING"
  inline val PENDING_DEPROVISIONING: "PENDING_DEPROVISIONING" = "PENDING_DEPROVISIONING"
  inline val DEPROVISIONED: "DEPROVISIONED" = "DEPROVISIONED"
  inline val FAILED_PROVISION: "FAILED_PROVISION" = "FAILED_PROVISION"
  inline val FAILED_ADVERTISING: "FAILED_ADVERTISING" = "FAILED_ADVERTISING"
  inline val FAILED_WITHDRAW: "FAILED_WITHDRAW" = "FAILED_WITHDRAW"
  inline val FAILED_DEPROVISION: "FAILED_DEPROVISION" = "FAILED_DEPROVISION"

  inline def values: js.Array[ByoipCidrState] = js.Array(
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
  inline val NONE: "NONE" = "NONE"
  inline val SOURCE_IP: "SOURCE_IP" = "SOURCE_IP"

  inline def values: js.Array[ClientAffinity] = js.Array(NONE, SOURCE_IP)
}

type CustomRoutingAcceleratorStatus = "DEPLOYED" | "IN_PROGRESS"
object CustomRoutingAcceleratorStatus {
  inline val DEPLOYED: "DEPLOYED" = "DEPLOYED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"

  inline def values: js.Array[CustomRoutingAcceleratorStatus] = js.Array(DEPLOYED, IN_PROGRESS)
}

type CustomRoutingDestinationTrafficState = "ALLOW" | "DENY"
object CustomRoutingDestinationTrafficState {
  inline val ALLOW: "ALLOW" = "ALLOW"
  inline val DENY: "DENY" = "DENY"

  inline def values: js.Array[CustomRoutingDestinationTrafficState] = js.Array(ALLOW, DENY)
}

type CustomRoutingProtocol = "TCP" | "UDP"
object CustomRoutingProtocol {
  inline val TCP: "TCP" = "TCP"
  inline val UDP: "UDP" = "UDP"

  inline def values: js.Array[CustomRoutingProtocol] = js.Array(TCP, UDP)
}

type HealthCheckProtocol = "TCP" | "HTTP" | "HTTPS"
object HealthCheckProtocol {
  inline val TCP: "TCP" = "TCP"
  inline val HTTP: "HTTP" = "HTTP"
  inline val HTTPS: "HTTPS" = "HTTPS"

  inline def values: js.Array[HealthCheckProtocol] = js.Array(TCP, HTTP, HTTPS)
}

type HealthState = "INITIAL" | "HEALTHY" | "UNHEALTHY"
object HealthState {
  inline val INITIAL: "INITIAL" = "INITIAL"
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"

  inline def values: js.Array[HealthState] = js.Array(INITIAL, HEALTHY, UNHEALTHY)
}

type IpAddressType = "IPV4"
object IpAddressType {
  inline val IPV4: "IPV4" = "IPV4"

  inline def values: js.Array[IpAddressType] = js.Array(IPV4)
}

type Protocol = "TCP" | "UDP"
object Protocol {
  inline val TCP: "TCP" = "TCP"
  inline val UDP: "UDP" = "UDP"

  inline def values: js.Array[Protocol] = js.Array(TCP, UDP)
}
