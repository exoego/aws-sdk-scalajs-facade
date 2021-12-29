package facade.amazonaws.services.appmesh

import scalajs._

type DurationUnit = "s" | "ms"
object DurationUnit {
  inline val s: "s" = "s"
  inline val ms: "ms" = "ms"

  inline def values: js.Array[DurationUnit] = js.Array(s, ms)
}

type EgressFilterType = "ALLOW_ALL" | "DROP_ALL"
object EgressFilterType {
  inline val ALLOW_ALL: "ALLOW_ALL" = "ALLOW_ALL"
  inline val DROP_ALL: "DROP_ALL" = "DROP_ALL"

  inline def values: js.Array[EgressFilterType] = js.Array(ALLOW_ALL, DROP_ALL)
}

type GatewayRouteStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object GatewayRouteStatusCode {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[GatewayRouteStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}

type GrpcRetryPolicyEvent = "cancelled" | "deadline-exceeded" | "internal" | "resource-exhausted" | "unavailable"
object GrpcRetryPolicyEvent {
  inline val cancelled: "cancelled" = "cancelled"
  inline val `deadline-exceeded`: "deadline-exceeded" = "deadline-exceeded"
  inline val internal: "internal" = "internal"
  inline val `resource-exhausted`: "resource-exhausted" = "resource-exhausted"
  inline val unavailable: "unavailable" = "unavailable"

  inline def values: js.Array[GrpcRetryPolicyEvent] = js.Array(cancelled, `deadline-exceeded`, internal, `resource-exhausted`, unavailable)
}

type HttpMethod = "GET" | "HEAD" | "POST" | "PUT" | "DELETE" | "CONNECT" | "OPTIONS" | "TRACE" | "PATCH"
object HttpMethod {
  inline val GET: "GET" = "GET"
  inline val HEAD: "HEAD" = "HEAD"
  inline val POST: "POST" = "POST"
  inline val PUT: "PUT" = "PUT"
  inline val DELETE: "DELETE" = "DELETE"
  inline val CONNECT: "CONNECT" = "CONNECT"
  inline val OPTIONS: "OPTIONS" = "OPTIONS"
  inline val TRACE: "TRACE" = "TRACE"
  inline val PATCH: "PATCH" = "PATCH"

  inline def values: js.Array[HttpMethod] = js.Array(GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH)
}

type HttpScheme = "http" | "https"
object HttpScheme {
  inline val http: "http" = "http"
  inline val https: "https" = "https"

  inline def values: js.Array[HttpScheme] = js.Array(http, https)
}

type ListenerTlsMode = "STRICT" | "PERMISSIVE" | "DISABLED"
object ListenerTlsMode {
  inline val STRICT: "STRICT" = "STRICT"
  inline val PERMISSIVE: "PERMISSIVE" = "PERMISSIVE"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ListenerTlsMode] = js.Array(STRICT, PERMISSIVE, DISABLED)
}

type MeshStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object MeshStatusCode {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[MeshStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}

type PortProtocol = "http" | "tcp" | "http2" | "grpc"
object PortProtocol {
  inline val http: "http" = "http"
  inline val tcp: "tcp" = "tcp"
  inline val http2: "http2" = "http2"
  inline val grpc: "grpc" = "grpc"

  inline def values: js.Array[PortProtocol] = js.Array(http, tcp, http2, grpc)
}

type RouteStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object RouteStatusCode {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[RouteStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}

type TcpRetryPolicyEvent = "connection-error"
object TcpRetryPolicyEvent {
  inline val `connection-error`: "connection-error" = "connection-error"

  inline def values: js.Array[TcpRetryPolicyEvent] = js.Array(`connection-error`)
}

type VirtualGatewayListenerTlsMode = "STRICT" | "PERMISSIVE" | "DISABLED"
object VirtualGatewayListenerTlsMode {
  inline val STRICT: "STRICT" = "STRICT"
  inline val PERMISSIVE: "PERMISSIVE" = "PERMISSIVE"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[VirtualGatewayListenerTlsMode] = js.Array(STRICT, PERMISSIVE, DISABLED)
}

type VirtualGatewayPortProtocol = "http" | "http2" | "grpc"
object VirtualGatewayPortProtocol {
  inline val http: "http" = "http"
  inline val http2: "http2" = "http2"
  inline val grpc: "grpc" = "grpc"

  inline def values: js.Array[VirtualGatewayPortProtocol] = js.Array(http, http2, grpc)
}

type VirtualGatewayStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object VirtualGatewayStatusCode {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[VirtualGatewayStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}

type VirtualNodeStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object VirtualNodeStatusCode {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[VirtualNodeStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}

type VirtualRouterStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object VirtualRouterStatusCode {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[VirtualRouterStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}

type VirtualServiceStatusCode = "ACTIVE" | "INACTIVE" | "DELETED"
object VirtualServiceStatusCode {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[VirtualServiceStatusCode] = js.Array(ACTIVE, INACTIVE, DELETED)
}
