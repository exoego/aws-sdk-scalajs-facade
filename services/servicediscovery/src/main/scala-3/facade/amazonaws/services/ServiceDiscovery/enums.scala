package facade.amazonaws.services.servicediscovery

import scalajs.js

type CustomHealthStatus = "HEALTHY" | "UNHEALTHY"
object CustomHealthStatus {
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"

  inline def values: js.Array[CustomHealthStatus] = js.Array(HEALTHY, UNHEALTHY)
}

type FilterCondition = "EQ" | "IN" | "BETWEEN"
object FilterCondition {
  inline val EQ: "EQ" = "EQ"
  inline val IN: "IN" = "IN"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"

  inline def values: js.Array[FilterCondition] = js.Array(EQ, IN, BETWEEN)
}

type HealthCheckType = "HTTP" | "HTTPS" | "TCP"
object HealthCheckType {
  inline val HTTP: "HTTP" = "HTTP"
  inline val HTTPS: "HTTPS" = "HTTPS"
  inline val TCP: "TCP" = "TCP"

  inline def values: js.Array[HealthCheckType] = js.Array(HTTP, HTTPS, TCP)
}

type HealthStatus = "HEALTHY" | "UNHEALTHY" | "UNKNOWN"
object HealthStatus {
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[HealthStatus] = js.Array(HEALTHY, UNHEALTHY, UNKNOWN)
}

type HealthStatusFilter = "HEALTHY" | "UNHEALTHY" | "ALL" | "HEALTHY_OR_ELSE_ALL"
object HealthStatusFilter {
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  inline val ALL: "ALL" = "ALL"
  inline val HEALTHY_OR_ELSE_ALL: "HEALTHY_OR_ELSE_ALL" = "HEALTHY_OR_ELSE_ALL"

  inline def values: js.Array[HealthStatusFilter] = js.Array(HEALTHY, UNHEALTHY, ALL, HEALTHY_OR_ELSE_ALL)
}

type NamespaceFilterName = "TYPE"
object NamespaceFilterName {
  inline val TYPE: "TYPE" = "TYPE"

  inline def values: js.Array[NamespaceFilterName] = js.Array(TYPE)
}

type NamespaceType = "DNS_PUBLIC" | "DNS_PRIVATE" | "HTTP"
object NamespaceType {
  inline val DNS_PUBLIC: "DNS_PUBLIC" = "DNS_PUBLIC"
  inline val DNS_PRIVATE: "DNS_PRIVATE" = "DNS_PRIVATE"
  inline val HTTP: "HTTP" = "HTTP"

  inline def values: js.Array[NamespaceType] = js.Array(DNS_PUBLIC, DNS_PRIVATE, HTTP)
}

type OperationFilterName = "NAMESPACE_ID" | "SERVICE_ID" | "STATUS" | "TYPE" | "UPDATE_DATE"
object OperationFilterName {
  inline val NAMESPACE_ID: "NAMESPACE_ID" = "NAMESPACE_ID"
  inline val SERVICE_ID: "SERVICE_ID" = "SERVICE_ID"
  inline val STATUS: "STATUS" = "STATUS"
  inline val TYPE: "TYPE" = "TYPE"
  inline val UPDATE_DATE: "UPDATE_DATE" = "UPDATE_DATE"

  inline def values: js.Array[OperationFilterName] = js.Array(NAMESPACE_ID, SERVICE_ID, STATUS, TYPE, UPDATE_DATE)
}

type OperationStatus = "SUBMITTED" | "PENDING" | "SUCCESS" | "FAIL"
object OperationStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAIL: "FAIL" = "FAIL"

  inline def values: js.Array[OperationStatus] = js.Array(SUBMITTED, PENDING, SUCCESS, FAIL)
}

type OperationTargetType = "NAMESPACE" | "SERVICE" | "INSTANCE"
object OperationTargetType {
  inline val NAMESPACE: "NAMESPACE" = "NAMESPACE"
  inline val SERVICE: "SERVICE" = "SERVICE"
  inline val INSTANCE: "INSTANCE" = "INSTANCE"

  inline def values: js.Array[OperationTargetType] = js.Array(NAMESPACE, SERVICE, INSTANCE)
}

type OperationType = "CREATE_NAMESPACE" | "DELETE_NAMESPACE" | "UPDATE_NAMESPACE" | "UPDATE_SERVICE" | "REGISTER_INSTANCE" | "DEREGISTER_INSTANCE"
object OperationType {
  inline val CREATE_NAMESPACE: "CREATE_NAMESPACE" = "CREATE_NAMESPACE"
  inline val DELETE_NAMESPACE: "DELETE_NAMESPACE" = "DELETE_NAMESPACE"
  inline val UPDATE_NAMESPACE: "UPDATE_NAMESPACE" = "UPDATE_NAMESPACE"
  inline val UPDATE_SERVICE: "UPDATE_SERVICE" = "UPDATE_SERVICE"
  inline val REGISTER_INSTANCE: "REGISTER_INSTANCE" = "REGISTER_INSTANCE"
  inline val DEREGISTER_INSTANCE: "DEREGISTER_INSTANCE" = "DEREGISTER_INSTANCE"

  inline def values: js.Array[OperationType] = js.Array(CREATE_NAMESPACE, DELETE_NAMESPACE, UPDATE_NAMESPACE, UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE)
}

type RecordType = "SRV" | "A" | "AAAA" | "CNAME"
object RecordType {
  inline val SRV: "SRV" = "SRV"
  inline val A: "A" = "A"
  inline val AAAA: "AAAA" = "AAAA"
  inline val CNAME: "CNAME" = "CNAME"

  inline def values: js.Array[RecordType] = js.Array(SRV, A, AAAA, CNAME)
}

type RoutingPolicy = "MULTIVALUE" | "WEIGHTED"
object RoutingPolicy {
  inline val MULTIVALUE: "MULTIVALUE" = "MULTIVALUE"
  inline val WEIGHTED: "WEIGHTED" = "WEIGHTED"

  inline def values: js.Array[RoutingPolicy] = js.Array(MULTIVALUE, WEIGHTED)
}

type ServiceFilterName = "NAMESPACE_ID"
object ServiceFilterName {
  inline val NAMESPACE_ID: "NAMESPACE_ID" = "NAMESPACE_ID"

  inline def values: js.Array[ServiceFilterName] = js.Array(NAMESPACE_ID)
}

type ServiceType = "HTTP" | "DNS_HTTP" | "DNS"
object ServiceType {
  inline val HTTP: "HTTP" = "HTTP"
  inline val DNS_HTTP: "DNS_HTTP" = "DNS_HTTP"
  inline val DNS: "DNS" = "DNS"

  inline def values: js.Array[ServiceType] = js.Array(HTTP, DNS_HTTP, DNS)
}

type ServiceTypeOption = "HTTP"
object ServiceTypeOption {
  inline val HTTP: "HTTP" = "HTTP"

  inline def values: js.Array[ServiceTypeOption] = js.Array(HTTP)
}
