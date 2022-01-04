package facade.amazonaws.services.elbv2

import scalajs.js

@js.native
sealed trait ActionTypeEnum extends js.Any
object ActionTypeEnum {
  val forward = "forward".asInstanceOf[ActionTypeEnum]
  val `authenticate-oidc` = "authenticate-oidc".asInstanceOf[ActionTypeEnum]
  val `authenticate-cognito` = "authenticate-cognito".asInstanceOf[ActionTypeEnum]
  val redirect = "redirect".asInstanceOf[ActionTypeEnum]
  val `fixed-response` = "fixed-response".asInstanceOf[ActionTypeEnum]

  @inline def values: js.Array[ActionTypeEnum] = js.Array(forward, `authenticate-oidc`, `authenticate-cognito`, redirect, `fixed-response`)
}

@js.native
sealed trait AuthenticateCognitoActionConditionalBehaviorEnum extends js.Any
object AuthenticateCognitoActionConditionalBehaviorEnum {
  val deny = "deny".asInstanceOf[AuthenticateCognitoActionConditionalBehaviorEnum]
  val allow = "allow".asInstanceOf[AuthenticateCognitoActionConditionalBehaviorEnum]
  val authenticate = "authenticate".asInstanceOf[AuthenticateCognitoActionConditionalBehaviorEnum]

  @inline def values: js.Array[AuthenticateCognitoActionConditionalBehaviorEnum] = js.Array(deny, allow, authenticate)
}

@js.native
sealed trait AuthenticateOidcActionConditionalBehaviorEnum extends js.Any
object AuthenticateOidcActionConditionalBehaviorEnum {
  val deny = "deny".asInstanceOf[AuthenticateOidcActionConditionalBehaviorEnum]
  val allow = "allow".asInstanceOf[AuthenticateOidcActionConditionalBehaviorEnum]
  val authenticate = "authenticate".asInstanceOf[AuthenticateOidcActionConditionalBehaviorEnum]

  @inline def values: js.Array[AuthenticateOidcActionConditionalBehaviorEnum] = js.Array(deny, allow, authenticate)
}

@js.native
sealed trait IpAddressType extends js.Any
object IpAddressType {
  val ipv4 = "ipv4".asInstanceOf[IpAddressType]
  val dualstack = "dualstack".asInstanceOf[IpAddressType]

  @inline def values: js.Array[IpAddressType] = js.Array(ipv4, dualstack)
}

@js.native
sealed trait LoadBalancerSchemeEnum extends js.Any
object LoadBalancerSchemeEnum {
  val `internet-facing` = "internet-facing".asInstanceOf[LoadBalancerSchemeEnum]
  val internal = "internal".asInstanceOf[LoadBalancerSchemeEnum]

  @inline def values: js.Array[LoadBalancerSchemeEnum] = js.Array(`internet-facing`, internal)
}

@js.native
sealed trait LoadBalancerStateEnum extends js.Any
object LoadBalancerStateEnum {
  val active = "active".asInstanceOf[LoadBalancerStateEnum]
  val provisioning = "provisioning".asInstanceOf[LoadBalancerStateEnum]
  val active_impaired = "active_impaired".asInstanceOf[LoadBalancerStateEnum]
  val failed = "failed".asInstanceOf[LoadBalancerStateEnum]

  @inline def values: js.Array[LoadBalancerStateEnum] = js.Array(active, provisioning, active_impaired, failed)
}

@js.native
sealed trait LoadBalancerTypeEnum extends js.Any
object LoadBalancerTypeEnum {
  val application = "application".asInstanceOf[LoadBalancerTypeEnum]
  val network = "network".asInstanceOf[LoadBalancerTypeEnum]
  val gateway = "gateway".asInstanceOf[LoadBalancerTypeEnum]

  @inline def values: js.Array[LoadBalancerTypeEnum] = js.Array(application, network, gateway)
}

@js.native
sealed trait ProtocolEnum extends js.Any
object ProtocolEnum {
  val HTTP = "HTTP".asInstanceOf[ProtocolEnum]
  val HTTPS = "HTTPS".asInstanceOf[ProtocolEnum]
  val TCP = "TCP".asInstanceOf[ProtocolEnum]
  val TLS = "TLS".asInstanceOf[ProtocolEnum]
  val UDP = "UDP".asInstanceOf[ProtocolEnum]
  val TCP_UDP = "TCP_UDP".asInstanceOf[ProtocolEnum]
  val GENEVE = "GENEVE".asInstanceOf[ProtocolEnum]

  @inline def values: js.Array[ProtocolEnum] = js.Array(HTTP, HTTPS, TCP, TLS, UDP, TCP_UDP, GENEVE)
}

@js.native
sealed trait RedirectActionStatusCodeEnum extends js.Any
object RedirectActionStatusCodeEnum {
  val HTTP_301 = "HTTP_301".asInstanceOf[RedirectActionStatusCodeEnum]
  val HTTP_302 = "HTTP_302".asInstanceOf[RedirectActionStatusCodeEnum]

  @inline def values: js.Array[RedirectActionStatusCodeEnum] = js.Array(HTTP_301, HTTP_302)
}

@js.native
sealed trait TargetGroupIpAddressTypeEnum extends js.Any
object TargetGroupIpAddressTypeEnum {
  val ipv4 = "ipv4".asInstanceOf[TargetGroupIpAddressTypeEnum]
  val ipv6 = "ipv6".asInstanceOf[TargetGroupIpAddressTypeEnum]

  @inline def values: js.Array[TargetGroupIpAddressTypeEnum] = js.Array(ipv4, ipv6)
}

@js.native
sealed trait TargetHealthReasonEnum extends js.Any
object TargetHealthReasonEnum {
  val `Elb.RegistrationInProgress` = "Elb.RegistrationInProgress".asInstanceOf[TargetHealthReasonEnum]
  val `Elb.InitialHealthChecking` = "Elb.InitialHealthChecking".asInstanceOf[TargetHealthReasonEnum]
  val `Target.ResponseCodeMismatch` = "Target.ResponseCodeMismatch".asInstanceOf[TargetHealthReasonEnum]
  val `Target.Timeout` = "Target.Timeout".asInstanceOf[TargetHealthReasonEnum]
  val `Target.FailedHealthChecks` = "Target.FailedHealthChecks".asInstanceOf[TargetHealthReasonEnum]
  val `Target.NotRegistered` = "Target.NotRegistered".asInstanceOf[TargetHealthReasonEnum]
  val `Target.NotInUse` = "Target.NotInUse".asInstanceOf[TargetHealthReasonEnum]
  val `Target.DeregistrationInProgress` = "Target.DeregistrationInProgress".asInstanceOf[TargetHealthReasonEnum]
  val `Target.InvalidState` = "Target.InvalidState".asInstanceOf[TargetHealthReasonEnum]
  val `Target.IpUnusable` = "Target.IpUnusable".asInstanceOf[TargetHealthReasonEnum]
  val `Target.HealthCheckDisabled` = "Target.HealthCheckDisabled".asInstanceOf[TargetHealthReasonEnum]
  val `Elb.InternalError` = "Elb.InternalError".asInstanceOf[TargetHealthReasonEnum]

  @inline def values: js.Array[TargetHealthReasonEnum] = js.Array(
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

@js.native
sealed trait TargetHealthStateEnum extends js.Any
object TargetHealthStateEnum {
  val initial = "initial".asInstanceOf[TargetHealthStateEnum]
  val healthy = "healthy".asInstanceOf[TargetHealthStateEnum]
  val unhealthy = "unhealthy".asInstanceOf[TargetHealthStateEnum]
  val unused = "unused".asInstanceOf[TargetHealthStateEnum]
  val draining = "draining".asInstanceOf[TargetHealthStateEnum]
  val unavailable = "unavailable".asInstanceOf[TargetHealthStateEnum]

  @inline def values: js.Array[TargetHealthStateEnum] = js.Array(initial, healthy, unhealthy, unused, draining, unavailable)
}

@js.native
sealed trait TargetTypeEnum extends js.Any
object TargetTypeEnum {
  val instance = "instance".asInstanceOf[TargetTypeEnum]
  val ip = "ip".asInstanceOf[TargetTypeEnum]
  val lambda = "lambda".asInstanceOf[TargetTypeEnum]
  val alb = "alb".asInstanceOf[TargetTypeEnum]

  @inline def values: js.Array[TargetTypeEnum] = js.Array(instance, ip, lambda, alb)
}
