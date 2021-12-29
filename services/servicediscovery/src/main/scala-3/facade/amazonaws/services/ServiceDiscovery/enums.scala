package facade.amazonaws.services.servicediscovery

import scalajs._

type CustomHealthStatus = "HEALTHY" | "UNHEALTHY"
object CustomHealthStatus {
  val HEALTHY: "HEALTHY" = "HEALTHY"
  val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"

  @inline def values = js.Array[CustomHealthStatus](HEALTHY, UNHEALTHY)
}

type FilterCondition = "EQ" | "IN" | "BETWEEN"
object FilterCondition {
  val EQ: "EQ" = "EQ"
  val IN: "IN" = "IN"
  val BETWEEN: "BETWEEN" = "BETWEEN"

  @inline def values = js.Array[FilterCondition](EQ, IN, BETWEEN)
}

type HealthCheckType = "HTTP" | "HTTPS" | "TCP"
object HealthCheckType {
  val HTTP: "HTTP" = "HTTP"
  val HTTPS: "HTTPS" = "HTTPS"
  val TCP: "TCP" = "TCP"

  @inline def values = js.Array[HealthCheckType](HTTP, HTTPS, TCP)
}

type HealthStatus = "HEALTHY" | "UNHEALTHY" | "UNKNOWN"
object HealthStatus {
  val HEALTHY: "HEALTHY" = "HEALTHY"
  val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[HealthStatus](HEALTHY, UNHEALTHY, UNKNOWN)
}

type HealthStatusFilter = "HEALTHY" | "UNHEALTHY" | "ALL"
object HealthStatusFilter {
  val HEALTHY: "HEALTHY" = "HEALTHY"
  val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[HealthStatusFilter](HEALTHY, UNHEALTHY, ALL)
}

type NamespaceFilterName = "TYPE"
object NamespaceFilterName {
  val TYPE: "TYPE" = "TYPE"

  @inline def values = js.Array[NamespaceFilterName](TYPE)
}

type NamespaceType = "DNS_PUBLIC" | "DNS_PRIVATE" | "HTTP"
object NamespaceType {
  val DNS_PUBLIC: "DNS_PUBLIC" = "DNS_PUBLIC"
  val DNS_PRIVATE: "DNS_PRIVATE" = "DNS_PRIVATE"
  val HTTP: "HTTP" = "HTTP"

  @inline def values = js.Array[NamespaceType](DNS_PUBLIC, DNS_PRIVATE, HTTP)
}

type OperationFilterName = "NAMESPACE_ID" | "SERVICE_ID" | "STATUS" | "TYPE" | "UPDATE_DATE"
object OperationFilterName {
  val NAMESPACE_ID: "NAMESPACE_ID" = "NAMESPACE_ID"
  val SERVICE_ID: "SERVICE_ID" = "SERVICE_ID"
  val STATUS: "STATUS" = "STATUS"
  val TYPE: "TYPE" = "TYPE"
  val UPDATE_DATE: "UPDATE_DATE" = "UPDATE_DATE"

  @inline def values = js.Array[OperationFilterName](NAMESPACE_ID, SERVICE_ID, STATUS, TYPE, UPDATE_DATE)
}

type OperationStatus = "SUBMITTED" | "PENDING" | "SUCCESS" | "FAIL"
object OperationStatus {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val PENDING: "PENDING" = "PENDING"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val FAIL: "FAIL" = "FAIL"

  @inline def values = js.Array[OperationStatus](SUBMITTED, PENDING, SUCCESS, FAIL)
}

type OperationTargetType = "NAMESPACE" | "SERVICE" | "INSTANCE"
object OperationTargetType {
  val NAMESPACE: "NAMESPACE" = "NAMESPACE"
  val SERVICE: "SERVICE" = "SERVICE"
  val INSTANCE: "INSTANCE" = "INSTANCE"

  @inline def values = js.Array[OperationTargetType](NAMESPACE, SERVICE, INSTANCE)
}

type OperationType = "CREATE_NAMESPACE" | "DELETE_NAMESPACE" | "UPDATE_SERVICE" | "REGISTER_INSTANCE" | "DEREGISTER_INSTANCE"
object OperationType {
  val CREATE_NAMESPACE: "CREATE_NAMESPACE" = "CREATE_NAMESPACE"
  val DELETE_NAMESPACE: "DELETE_NAMESPACE" = "DELETE_NAMESPACE"
  val UPDATE_SERVICE: "UPDATE_SERVICE" = "UPDATE_SERVICE"
  val REGISTER_INSTANCE: "REGISTER_INSTANCE" = "REGISTER_INSTANCE"
  val DEREGISTER_INSTANCE: "DEREGISTER_INSTANCE" = "DEREGISTER_INSTANCE"

  @inline def values = js.Array[OperationType](CREATE_NAMESPACE, DELETE_NAMESPACE, UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE)
}

type RecordType = "SRV" | "A" | "AAAA" | "CNAME"
object RecordType {
  val SRV: "SRV" = "SRV"
  val A: "A" = "A"
  val AAAA: "AAAA" = "AAAA"
  val CNAME: "CNAME" = "CNAME"

  @inline def values = js.Array[RecordType](SRV, A, AAAA, CNAME)
}

type RoutingPolicy = "MULTIVALUE" | "WEIGHTED"
object RoutingPolicy {
  val MULTIVALUE: "MULTIVALUE" = "MULTIVALUE"
  val WEIGHTED: "WEIGHTED" = "WEIGHTED"

  @inline def values = js.Array[RoutingPolicy](MULTIVALUE, WEIGHTED)
}

type ServiceFilterName = "NAMESPACE_ID"
object ServiceFilterName {
  val NAMESPACE_ID: "NAMESPACE_ID" = "NAMESPACE_ID"

  @inline def values = js.Array[ServiceFilterName](NAMESPACE_ID)
}

type ServiceType = "HTTP" | "DNS_HTTP" | "DNS"
object ServiceType {
  val HTTP: "HTTP" = "HTTP"
  val DNS_HTTP: "DNS_HTTP" = "DNS_HTTP"
  val DNS: "DNS" = "DNS"

  @inline def values = js.Array[ServiceType](HTTP, DNS_HTTP, DNS)
}

type ServiceTypeOption = "HTTP"
object ServiceTypeOption {
  val HTTP: "HTTP" = "HTTP"

  @inline def values = js.Array[ServiceTypeOption](HTTP)
}
