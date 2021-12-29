package facade.amazonaws.services.elbv2

import scalajs._

type ActionTypeEnum = "forward" | "authenticate-oidc" | "authenticate-cognito" | "redirect" | "fixed-response"
object ActionTypeEnum {
  val forward: "forward" = "forward"
  val `authenticate-oidc`: "authenticate-oidc" = "authenticate-oidc"
  val `authenticate-cognito`: "authenticate-cognito" = "authenticate-cognito"
  val redirect: "redirect" = "redirect"
  val `fixed-response`: "fixed-response" = "fixed-response"

  @inline def values = js.Array[ActionTypeEnum](forward, `authenticate-oidc`, `authenticate-cognito`, redirect, `fixed-response`)
}

type AuthenticateCognitoActionConditionalBehaviorEnum = "deny" | "allow" | "authenticate"
object AuthenticateCognitoActionConditionalBehaviorEnum {
  val deny: "deny" = "deny"
  val allow: "allow" = "allow"
  val authenticate: "authenticate" = "authenticate"

  @inline def values = js.Array[AuthenticateCognitoActionConditionalBehaviorEnum](deny, allow, authenticate)
}

type AuthenticateOidcActionConditionalBehaviorEnum = "deny" | "allow" | "authenticate"
object AuthenticateOidcActionConditionalBehaviorEnum {
  val deny: "deny" = "deny"
  val allow: "allow" = "allow"
  val authenticate: "authenticate" = "authenticate"

  @inline def values = js.Array[AuthenticateOidcActionConditionalBehaviorEnum](deny, allow, authenticate)
}

type IpAddressType = "ipv4" | "dualstack"
object IpAddressType {
  val ipv4: "ipv4" = "ipv4"
  val dualstack: "dualstack" = "dualstack"

  @inline def values = js.Array[IpAddressType](ipv4, dualstack)
}

type LoadBalancerSchemeEnum = "internet-facing" | "internal"
object LoadBalancerSchemeEnum {
  val `internet-facing`: "internet-facing" = "internet-facing"
  val internal: "internal" = "internal"

  @inline def values = js.Array[LoadBalancerSchemeEnum](`internet-facing`, internal)
}

type LoadBalancerStateEnum = "active" | "provisioning" | "active_impaired" | "failed"
object LoadBalancerStateEnum {
  val active: "active" = "active"
  val provisioning: "provisioning" = "provisioning"
  val active_impaired: "active_impaired" = "active_impaired"
  val failed: "failed" = "failed"

  @inline def values = js.Array[LoadBalancerStateEnum](active, provisioning, active_impaired, failed)
}

type LoadBalancerTypeEnum = "application" | "network" | "gateway"
object LoadBalancerTypeEnum {
  val application: "application" = "application"
  val network: "network" = "network"
  val gateway: "gateway" = "gateway"

  @inline def values = js.Array[LoadBalancerTypeEnum](application, network, gateway)
}

type ProtocolEnum = "HTTP" | "HTTPS" | "TCP" | "TLS" | "UDP" | "TCP_UDP" | "GENEVE"
object ProtocolEnum {
  val HTTP: "HTTP" = "HTTP"
  val HTTPS: "HTTPS" = "HTTPS"
  val TCP: "TCP" = "TCP"
  val TLS: "TLS" = "TLS"
  val UDP: "UDP" = "UDP"
  val TCP_UDP: "TCP_UDP" = "TCP_UDP"
  val GENEVE: "GENEVE" = "GENEVE"

  @inline def values = js.Array[ProtocolEnum](HTTP, HTTPS, TCP, TLS, UDP, TCP_UDP, GENEVE)
}

type RedirectActionStatusCodeEnum = "HTTP_301" | "HTTP_302"
object RedirectActionStatusCodeEnum {
  val HTTP_301: "HTTP_301" = "HTTP_301"
  val HTTP_302: "HTTP_302" = "HTTP_302"

  @inline def values = js.Array[RedirectActionStatusCodeEnum](HTTP_301, HTTP_302)
}

type TargetHealthReasonEnum = "Elb.RegistrationInProgress" | "Elb.InitialHealthChecking" | "Target.ResponseCodeMismatch" | "Target.Timeout" | "Target.FailedHealthChecks" | "Target.NotRegistered" | "Target.NotInUse" | "Target.DeregistrationInProgress" | "Target.InvalidState" | "Target.IpUnusable" | "Target.HealthCheckDisabled" | "Elb.InternalError"
object TargetHealthReasonEnum {
  val `Elb.RegistrationInProgress`: "Elb.RegistrationInProgress" = "Elb.RegistrationInProgress"
  val `Elb.InitialHealthChecking`: "Elb.InitialHealthChecking" = "Elb.InitialHealthChecking"
  val `Target.ResponseCodeMismatch`: "Target.ResponseCodeMismatch" = "Target.ResponseCodeMismatch"
  val `Target.Timeout`: "Target.Timeout" = "Target.Timeout"
  val `Target.FailedHealthChecks`: "Target.FailedHealthChecks" = "Target.FailedHealthChecks"
  val `Target.NotRegistered`: "Target.NotRegistered" = "Target.NotRegistered"
  val `Target.NotInUse`: "Target.NotInUse" = "Target.NotInUse"
  val `Target.DeregistrationInProgress`: "Target.DeregistrationInProgress" = "Target.DeregistrationInProgress"
  val `Target.InvalidState`: "Target.InvalidState" = "Target.InvalidState"
  val `Target.IpUnusable`: "Target.IpUnusable" = "Target.IpUnusable"
  val `Target.HealthCheckDisabled`: "Target.HealthCheckDisabled" = "Target.HealthCheckDisabled"
  val `Elb.InternalError`: "Elb.InternalError" = "Elb.InternalError"

  @inline def values = js.Array[TargetHealthReasonEnum](
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
  val initial: "initial" = "initial"
  val healthy: "healthy" = "healthy"
  val unhealthy: "unhealthy" = "unhealthy"
  val unused: "unused" = "unused"
  val draining: "draining" = "draining"
  val unavailable: "unavailable" = "unavailable"

  @inline def values = js.Array[TargetHealthStateEnum](initial, healthy, unhealthy, unused, draining, unavailable)
}

type TargetTypeEnum = "instance" | "ip" | "lambda"
object TargetTypeEnum {
  val instance: "instance" = "instance"
  val ip: "ip" = "ip"
  val lambda: "lambda" = "lambda"

  @inline def values = js.Array[TargetTypeEnum](instance, ip, lambda)
}
