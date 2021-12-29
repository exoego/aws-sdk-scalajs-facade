package facade.amazonaws.services.appmesh

import scalajs._

type DurationUnit = "s" | "ms"
object DurationUnit {
  val s: "s" = "s"
  val ms: "ms" = "ms"

  @inline def values = js.Array[DurationUnit](s, ms)
}

type EgressFilterType = "ALLOW_ALL" | "DROP_ALL"
object EgressFilterType {
  val ALLOW_ALL: "ALLOW_ALL" = "ALLOW_ALL"
  val DROP_ALL: "DROP_ALL" = "DROP_ALL"

  @inline def values = js.Array[EgressFilterType](ALLOW_ALL, DROP_ALL)
}

type GatewayRouteStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object GatewayRouteStatusCode {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[GatewayRouteStatusCode](ACTIVE, INACTIVE, DELETED)
}

type GrpcRetryPolicyEvent = "cancelled" | "deadline-exceeded" | "internal" | "resource-exhausted" | "unavailable"
object GrpcRetryPolicyEvent {
  val cancelled: "cancelled" = "cancelled"
  val `deadline-exceeded`: "deadline-exceeded" = "deadline-exceeded"
  val internal: "internal" = "internal"
  val `resource-exhausted`: "resource-exhausted" = "resource-exhausted"
  val unavailable: "unavailable" = "unavailable"

  @inline def values = js.Array[GrpcRetryPolicyEvent](cancelled, `deadline-exceeded`, internal, `resource-exhausted`, unavailable)
}

type HttpMethod = "GET" | "HEAD" | "POST" | "PUT" | "DELETE" | "CONNECT" | "OPTIONS" | "TRACE" | "PATCH"
object HttpMethod {
  val GET: "GET" = "GET"
  val HEAD: "HEAD" = "HEAD"
  val POST: "POST" = "POST"
  val PUT: "PUT" = "PUT"
  val DELETE: "DELETE" = "DELETE"
  val CONNECT: "CONNECT" = "CONNECT"
  val OPTIONS: "OPTIONS" = "OPTIONS"
  val TRACE: "TRACE" = "TRACE"
  val PATCH: "PATCH" = "PATCH"

  @inline def values = js.Array[HttpMethod](GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH)
}

type HttpScheme = "http" | "https"
object HttpScheme {
  val http: "http" = "http"
  val https: "https" = "https"

  @inline def values = js.Array[HttpScheme](http, https)
}

type ListenerTlsMode = "STRICT" | "PERMISSIVE" | "DISABLED"
object ListenerTlsMode {
  val STRICT: "STRICT" = "STRICT"
  val PERMISSIVE: "PERMISSIVE" = "PERMISSIVE"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[ListenerTlsMode](STRICT, PERMISSIVE, DISABLED)
}

type MeshStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object MeshStatusCode {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[MeshStatusCode](ACTIVE, INACTIVE, DELETED)
}

type PortProtocol = "http" | "tcp" | "http2" | "grpc"
object PortProtocol {
  val http: "http" = "http"
  val tcp: "tcp" = "tcp"
  val http2: "http2" = "http2"
  val grpc: "grpc" = "grpc"

  @inline def values = js.Array[PortProtocol](http, tcp, http2, grpc)
}

type RouteStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object RouteStatusCode {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[RouteStatusCode](ACTIVE, INACTIVE, DELETED)
}

type TcpRetryPolicyEvent = "connection-error"
object TcpRetryPolicyEvent {
  val `connection-error`: "connection-error" = "connection-error"

  @inline def values = js.Array[TcpRetryPolicyEvent](`connection-error`)
}

type VirtualGatewayListenerTlsMode = "STRICT" | "PERMISSIVE" | "DISABLED"
object VirtualGatewayListenerTlsMode {
  val STRICT: "STRICT" = "STRICT"
  val PERMISSIVE: "PERMISSIVE" = "PERMISSIVE"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[VirtualGatewayListenerTlsMode](STRICT, PERMISSIVE, DISABLED)
}

type VirtualGatewayPortProtocol = "http" | "http2" | "grpc"
object VirtualGatewayPortProtocol {
  val http: "http" = "http"
  val http2: "http2" = "http2"
  val grpc: "grpc" = "grpc"

  @inline def values = js.Array[VirtualGatewayPortProtocol](http, http2, grpc)
}

type VirtualGatewayStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object VirtualGatewayStatusCode {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[VirtualGatewayStatusCode](ACTIVE, INACTIVE, DELETED)
}

type VirtualNodeStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object VirtualNodeStatusCode {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[VirtualNodeStatusCode](ACTIVE, INACTIVE, DELETED)
}

type VirtualRouterStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object VirtualRouterStatusCode {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[VirtualRouterStatusCode](ACTIVE, INACTIVE, DELETED)
}

type VirtualServiceStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object VirtualServiceStatusCode {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[VirtualServiceStatusCode](ACTIVE, INACTIVE, DELETED)
}
