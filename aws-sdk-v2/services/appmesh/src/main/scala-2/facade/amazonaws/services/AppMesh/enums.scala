package facade.amazonaws.services.appmesh

import scalajs.js

@js.native
sealed trait DefaultGatewayRouteRewrite extends js.Any
object DefaultGatewayRouteRewrite {
  val ENABLED = "ENABLED".asInstanceOf[DefaultGatewayRouteRewrite]
  val DISABLED = "DISABLED".asInstanceOf[DefaultGatewayRouteRewrite]

  @inline def values: js.Array[DefaultGatewayRouteRewrite] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait DnsResponseType extends js.Any
object DnsResponseType {
  val LOADBALANCER = "LOADBALANCER".asInstanceOf[DnsResponseType]
  val ENDPOINTS = "ENDPOINTS".asInstanceOf[DnsResponseType]

  @inline def values: js.Array[DnsResponseType] = js.Array(LOADBALANCER, ENDPOINTS)
}

@js.native
sealed trait DurationUnit extends js.Any
object DurationUnit {
  val s = "s".asInstanceOf[DurationUnit]
  val ms = "ms".asInstanceOf[DurationUnit]

  @inline def values: js.Array[DurationUnit] = js.Array(s, ms)
}

@js.native
sealed trait EgressFilterType extends js.Any
object EgressFilterType {
  val ALLOW_ALL = "ALLOW_ALL".asInstanceOf[EgressFilterType]
  val DROP_ALL = "DROP_ALL".asInstanceOf[EgressFilterType]

  @inline def values: js.Array[EgressFilterType] = js.Array(ALLOW_ALL, DROP_ALL)
}

@js.native
sealed trait GatewayRouteStatusCode extends js.Any
object GatewayRouteStatusCode {
  val ACTIVE = "ACTIVE".asInstanceOf[GatewayRouteStatusCode]
  val INACTIVE = "INACTIVE".asInstanceOf[GatewayRouteStatusCode]
  val DELETED = "DELETED".asInstanceOf[GatewayRouteStatusCode]

  @inline def values: js.Array[GatewayRouteStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}

@js.native
sealed trait GrpcRetryPolicyEvent extends js.Any
object GrpcRetryPolicyEvent {
  val cancelled = "cancelled".asInstanceOf[GrpcRetryPolicyEvent]
  val `deadline-exceeded` = "deadline-exceeded".asInstanceOf[GrpcRetryPolicyEvent]
  val internal = "internal".asInstanceOf[GrpcRetryPolicyEvent]
  val `resource-exhausted` = "resource-exhausted".asInstanceOf[GrpcRetryPolicyEvent]
  val unavailable = "unavailable".asInstanceOf[GrpcRetryPolicyEvent]

  @inline def values: js.Array[GrpcRetryPolicyEvent] = js.Array(cancelled, `deadline-exceeded`, internal, `resource-exhausted`, unavailable)
}

@js.native
sealed trait HttpMethod extends js.Any
object HttpMethod {
  val GET = "GET".asInstanceOf[HttpMethod]
  val HEAD = "HEAD".asInstanceOf[HttpMethod]
  val POST = "POST".asInstanceOf[HttpMethod]
  val PUT = "PUT".asInstanceOf[HttpMethod]
  val DELETE = "DELETE".asInstanceOf[HttpMethod]
  val CONNECT = "CONNECT".asInstanceOf[HttpMethod]
  val OPTIONS = "OPTIONS".asInstanceOf[HttpMethod]
  val TRACE = "TRACE".asInstanceOf[HttpMethod]
  val PATCH = "PATCH".asInstanceOf[HttpMethod]

  @inline def values: js.Array[HttpMethod] = js.Array(GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH)
}

@js.native
sealed trait HttpScheme extends js.Any
object HttpScheme {
  val http = "http".asInstanceOf[HttpScheme]
  val https = "https".asInstanceOf[HttpScheme]

  @inline def values: js.Array[HttpScheme] = js.Array(http, https)
}

@js.native
sealed trait ListenerTlsMode extends js.Any
object ListenerTlsMode {
  val STRICT = "STRICT".asInstanceOf[ListenerTlsMode]
  val PERMISSIVE = "PERMISSIVE".asInstanceOf[ListenerTlsMode]
  val DISABLED = "DISABLED".asInstanceOf[ListenerTlsMode]

  @inline def values: js.Array[ListenerTlsMode] = js.Array(STRICT, PERMISSIVE, DISABLED)
}

@js.native
sealed trait MeshStatusCode extends js.Any
object MeshStatusCode {
  val ACTIVE = "ACTIVE".asInstanceOf[MeshStatusCode]
  val INACTIVE = "INACTIVE".asInstanceOf[MeshStatusCode]
  val DELETED = "DELETED".asInstanceOf[MeshStatusCode]

  @inline def values: js.Array[MeshStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}

@js.native
sealed trait PortProtocol extends js.Any
object PortProtocol {
  val http = "http".asInstanceOf[PortProtocol]
  val tcp = "tcp".asInstanceOf[PortProtocol]
  val http2 = "http2".asInstanceOf[PortProtocol]
  val grpc = "grpc".asInstanceOf[PortProtocol]

  @inline def values: js.Array[PortProtocol] = js.Array(http, tcp, http2, grpc)
}

@js.native
sealed trait RouteStatusCode extends js.Any
object RouteStatusCode {
  val ACTIVE = "ACTIVE".asInstanceOf[RouteStatusCode]
  val INACTIVE = "INACTIVE".asInstanceOf[RouteStatusCode]
  val DELETED = "DELETED".asInstanceOf[RouteStatusCode]

  @inline def values: js.Array[RouteStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}

@js.native
sealed trait TcpRetryPolicyEvent extends js.Any
object TcpRetryPolicyEvent {
  val `connection-error` = "connection-error".asInstanceOf[TcpRetryPolicyEvent]

  @inline def values: js.Array[TcpRetryPolicyEvent] = js.Array(`connection-error`)
}

@js.native
sealed trait VirtualGatewayListenerTlsMode extends js.Any
object VirtualGatewayListenerTlsMode {
  val STRICT = "STRICT".asInstanceOf[VirtualGatewayListenerTlsMode]
  val PERMISSIVE = "PERMISSIVE".asInstanceOf[VirtualGatewayListenerTlsMode]
  val DISABLED = "DISABLED".asInstanceOf[VirtualGatewayListenerTlsMode]

  @inline def values: js.Array[VirtualGatewayListenerTlsMode] = js.Array(STRICT, PERMISSIVE, DISABLED)
}

@js.native
sealed trait VirtualGatewayPortProtocol extends js.Any
object VirtualGatewayPortProtocol {
  val http = "http".asInstanceOf[VirtualGatewayPortProtocol]
  val http2 = "http2".asInstanceOf[VirtualGatewayPortProtocol]
  val grpc = "grpc".asInstanceOf[VirtualGatewayPortProtocol]

  @inline def values: js.Array[VirtualGatewayPortProtocol] = js.Array(http, http2, grpc)
}

@js.native
sealed trait VirtualGatewayStatusCode extends js.Any
object VirtualGatewayStatusCode {
  val ACTIVE = "ACTIVE".asInstanceOf[VirtualGatewayStatusCode]
  val INACTIVE = "INACTIVE".asInstanceOf[VirtualGatewayStatusCode]
  val DELETED = "DELETED".asInstanceOf[VirtualGatewayStatusCode]

  @inline def values: js.Array[VirtualGatewayStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}

@js.native
sealed trait VirtualNodeStatusCode extends js.Any
object VirtualNodeStatusCode {
  val ACTIVE = "ACTIVE".asInstanceOf[VirtualNodeStatusCode]
  val INACTIVE = "INACTIVE".asInstanceOf[VirtualNodeStatusCode]
  val DELETED = "DELETED".asInstanceOf[VirtualNodeStatusCode]

  @inline def values: js.Array[VirtualNodeStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}

@js.native
sealed trait VirtualRouterStatusCode extends js.Any
object VirtualRouterStatusCode {
  val ACTIVE = "ACTIVE".asInstanceOf[VirtualRouterStatusCode]
  val INACTIVE = "INACTIVE".asInstanceOf[VirtualRouterStatusCode]
  val DELETED = "DELETED".asInstanceOf[VirtualRouterStatusCode]

  @inline def values: js.Array[VirtualRouterStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}

@js.native
sealed trait VirtualServiceStatusCode extends js.Any
object VirtualServiceStatusCode {
  val ACTIVE = "ACTIVE".asInstanceOf[VirtualServiceStatusCode]
  val INACTIVE = "INACTIVE".asInstanceOf[VirtualServiceStatusCode]
  val DELETED = "DELETED".asInstanceOf[VirtualServiceStatusCode]

  @inline def values: js.Array[VirtualServiceStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}
