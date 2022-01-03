package facade.amazonaws.services.elbv2

import scalajs.js

type ActionTypeEnum = "forward" | "authenticate-oidc" | "authenticate-cognito" | "redirect" | "fixed-response"
object ActionTypeEnum {
  inline val forward: "forward" = "forward"
  inline val `authenticate-oidc`: "authenticate-oidc" = "authenticate-oidc"
  inline val `authenticate-cognito`: "authenticate-cognito" = "authenticate-cognito"
  inline val redirect: "redirect" = "redirect"
  inline val `fixed-response`: "fixed-response" = "fixed-response"

  inline def values: js.Array[ActionTypeEnum] = js.Array(forward, `authenticate-oidc`, `authenticate-cognito`, redirect, `fixed-response`)
}

type AuthenticateCognitoActionConditionalBehaviorEnum = "deny" | "allow" | "authenticate"
object AuthenticateCognitoActionConditionalBehaviorEnum {
  inline val deny: "deny" = "deny"
  inline val allow: "allow" = "allow"
  inline val authenticate: "authenticate" = "authenticate"

  inline def values: js.Array[AuthenticateCognitoActionConditionalBehaviorEnum] = js.Array(deny, allow, authenticate)
}

type AuthenticateOidcActionConditionalBehaviorEnum = "deny" | "allow" | "authenticate"
object AuthenticateOidcActionConditionalBehaviorEnum {
  inline val deny: "deny" = "deny"
  inline val allow: "allow" = "allow"
  inline val authenticate: "authenticate" = "authenticate"

  inline def values: js.Array[AuthenticateOidcActionConditionalBehaviorEnum] = js.Array(deny, allow, authenticate)
}

type IpAddressType = "ipv4" | "dualstack"
object IpAddressType {
  inline val ipv4: "ipv4" = "ipv4"
  inline val dualstack: "dualstack" = "dualstack"

  inline def values: js.Array[IpAddressType] = js.Array(ipv4, dualstack)
}

type LoadBalancerSchemeEnum = "internet-facing" | "internal"
object LoadBalancerSchemeEnum {
  inline val `internet-facing`: "internet-facing" = "internet-facing"
  inline val internal: "internal" = "internal"

  inline def values: js.Array[LoadBalancerSchemeEnum] = js.Array(`internet-facing`, internal)
}

type LoadBalancerStateEnum = "active" | "provisioning" | "active_impaired" | "failed"
object LoadBalancerStateEnum {
  inline val active: "active" = "active"
  inline val provisioning: "provisioning" = "provisioning"
  inline val active_impaired: "active_impaired" = "active_impaired"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[LoadBalancerStateEnum] = js.Array(active, provisioning, active_impaired, failed)
}

type LoadBalancerTypeEnum = "application" | "network" | "gateway"
object LoadBalancerTypeEnum {
  inline val application: "application" = "application"
  inline val network: "network" = "network"
  inline val gateway: "gateway" = "gateway"

  inline def values: js.Array[LoadBalancerTypeEnum] = js.Array(application, network, gateway)
}

type ProtocolEnum = "HTTP" | "HTTPS" | "TCP" | "TLS" | "UDP" | "TCP_UDP" | "GENEVE"
object ProtocolEnum {
  inline val HTTP: "HTTP" = "HTTP"
  inline val HTTPS: "HTTPS" = "HTTPS"
  inline val TCP: "TCP" = "TCP"
  inline val TLS: "TLS" = "TLS"
  inline val UDP: "UDP" = "UDP"
  inline val TCP_UDP: "TCP_UDP" = "TCP_UDP"
  inline val GENEVE: "GENEVE" = "GENEVE"

  inline def values: js.Array[ProtocolEnum] = js.Array(HTTP, HTTPS, TCP, TLS, UDP, TCP_UDP, GENEVE)
}

type RedirectActionStatusCodeEnum = "HTTP_301" | "HTTP_302"
object RedirectActionStatusCodeEnum {
  inline val HTTP_301: "HTTP_301" = "HTTP_301"
  inline val HTTP_302: "HTTP_302" = "HTTP_302"

  inline def values: js.Array[RedirectActionStatusCodeEnum] = js.Array(HTTP_301, HTTP_302)
}

type TargetGroupIpAddressTypeEnum = "ipv4" | "ipv6"
object TargetGroupIpAddressTypeEnum {
  inline val ipv4: "ipv4" = "ipv4"
  inline val ipv6: "ipv6" = "ipv6"

  inline def values: js.Array[TargetGroupIpAddressTypeEnum] = js.Array(ipv4, ipv6)
}

type TargetHealthReasonEnum = "Elb.RegistrationInProgress" | "Elb.InitialHealthChecking" | "Target.ResponseCodeMismatch" | "Target.Timeout" | "Target.FailedHealthChecks" | "Target.NotRegistered" | "Target.NotInUse" | "Target.DeregistrationInProgress" | "Target.InvalidState" | "Target.IpUnusable" | "Target.HealthCheckDisabled" | "Elb.InternalError"
object TargetHealthReasonEnum {
  inline val `Elb.RegistrationInProgress`: "Elb.RegistrationInProgress" = "Elb.RegistrationInProgress"
  inline val `Elb.InitialHealthChecking`: "Elb.InitialHealthChecking" = "Elb.InitialHealthChecking"
  inline val `Target.ResponseCodeMismatch`: "Target.ResponseCodeMismatch" = "Target.ResponseCodeMismatch"
  inline val `Target.Timeout`: "Target.Timeout" = "Target.Timeout"
  inline val `Target.FailedHealthChecks`: "Target.FailedHealthChecks" = "Target.FailedHealthChecks"
  inline val `Target.NotRegistered`: "Target.NotRegistered" = "Target.NotRegistered"
  inline val `Target.NotInUse`: "Target.NotInUse" = "Target.NotInUse"
  inline val `Target.DeregistrationInProgress`: "Target.DeregistrationInProgress" = "Target.DeregistrationInProgress"
  inline val `Target.InvalidState`: "Target.InvalidState" = "Target.InvalidState"
  inline val `Target.IpUnusable`: "Target.IpUnusable" = "Target.IpUnusable"
  inline val `Target.HealthCheckDisabled`: "Target.HealthCheckDisabled" = "Target.HealthCheckDisabled"
  inline val `Elb.InternalError`: "Elb.InternalError" = "Elb.InternalError"

  inline def values: js.Array[TargetHealthReasonEnum] = js.Array(
    `Elb.RegistrationInProgress`,
    `Elb.InitialHealthChecking`,
    `Target.ResponseCodeMismatch`,
    `Target.Timeout`,
    `Target.FailedHealthChecks`,
    `Target.NotRegistered`,
    `Target.NotInUse`,
    `Target.DeregistrationInProgress`,
    `Target.InvalidState`,
    `Target.IpUnusable`,
    `Target.HealthCheckDisabled`,
    `Elb.InternalError`
  )
}

type TargetHealthStateEnum = "initial" | "healthy" | "unhealthy" | "unused" | "draining" | "unavailable"
object TargetHealthStateEnum {
  inline val initial: "initial" = "initial"
  inline val healthy: "healthy" = "healthy"
  inline val unhealthy: "unhealthy" = "unhealthy"
  inline val unused: "unused" = "unused"
  inline val draining: "draining" = "draining"
  inline val unavailable: "unavailable" = "unavailable"

  inline def values: js.Array[TargetHealthStateEnum] = js.Array(initial, healthy, unhealthy, unused, draining, unavailable)
}

type TargetTypeEnum = "instance" | "ip" | "lambda" | "alb"
object TargetTypeEnum {
  inline val instance: "instance" = "instance"
  inline val ip: "ip" = "ip"
  inline val lambda: "lambda" = "lambda"
  inline val alb: "alb" = "alb"

  inline def values: js.Array[TargetTypeEnum] = js.Array(instance, ip, lambda, alb)
}
