package facade.amazonaws.services.servicediscovery

import scalajs.js

@js.native
sealed trait CustomHealthStatus extends js.Any
object CustomHealthStatus {
  val HEALTHY = "HEALTHY".asInstanceOf[CustomHealthStatus]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[CustomHealthStatus]

  @inline def values: js.Array[CustomHealthStatus] = js.Array(HEALTHY, UNHEALTHY)
}

@js.native
sealed trait FilterCondition extends js.Any
object FilterCondition {
  val EQ = "EQ".asInstanceOf[FilterCondition]
  val IN = "IN".asInstanceOf[FilterCondition]
  val BETWEEN = "BETWEEN".asInstanceOf[FilterCondition]
  val BEGINS_WITH = "BEGINS_WITH".asInstanceOf[FilterCondition]

  @inline def values: js.Array[FilterCondition] = js.Array(EQ, IN, BETWEEN, BEGINS_WITH)
}

@js.native
sealed trait HealthCheckType extends js.Any
object HealthCheckType {
  val HTTP = "HTTP".asInstanceOf[HealthCheckType]
  val HTTPS = "HTTPS".asInstanceOf[HealthCheckType]
  val TCP = "TCP".asInstanceOf[HealthCheckType]

  @inline def values: js.Array[HealthCheckType] = js.Array(HTTP, HTTPS, TCP)
}

@js.native
sealed trait HealthStatus extends js.Any
object HealthStatus {
  val HEALTHY = "HEALTHY".asInstanceOf[HealthStatus]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[HealthStatus]
  val UNKNOWN = "UNKNOWN".asInstanceOf[HealthStatus]

  @inline def values: js.Array[HealthStatus] = js.Array(HEALTHY, UNHEALTHY, UNKNOWN)
}

@js.native
sealed trait HealthStatusFilter extends js.Any
object HealthStatusFilter {
  val HEALTHY = "HEALTHY".asInstanceOf[HealthStatusFilter]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[HealthStatusFilter]
  val ALL = "ALL".asInstanceOf[HealthStatusFilter]
  val HEALTHY_OR_ELSE_ALL = "HEALTHY_OR_ELSE_ALL".asInstanceOf[HealthStatusFilter]

  @inline def values: js.Array[HealthStatusFilter] = js.Array(HEALTHY, UNHEALTHY, ALL, HEALTHY_OR_ELSE_ALL)
}

@js.native
sealed trait NamespaceFilterName extends js.Any
object NamespaceFilterName {
  val TYPE = "TYPE".asInstanceOf[NamespaceFilterName]
  val NAME = "NAME".asInstanceOf[NamespaceFilterName]
  val HTTP_NAME = "HTTP_NAME".asInstanceOf[NamespaceFilterName]

  @inline def values: js.Array[NamespaceFilterName] = js.Array(TYPE, NAME, HTTP_NAME)
}

@js.native
sealed trait NamespaceType extends js.Any
object NamespaceType {
  val DNS_PUBLIC = "DNS_PUBLIC".asInstanceOf[NamespaceType]
  val DNS_PRIVATE = "DNS_PRIVATE".asInstanceOf[NamespaceType]
  val HTTP = "HTTP".asInstanceOf[NamespaceType]

  @inline def values: js.Array[NamespaceType] = js.Array(DNS_PUBLIC, DNS_PRIVATE, HTTP)
}

@js.native
sealed trait OperationFilterName extends js.Any
object OperationFilterName {
  val NAMESPACE_ID = "NAMESPACE_ID".asInstanceOf[OperationFilterName]
  val SERVICE_ID = "SERVICE_ID".asInstanceOf[OperationFilterName]
  val STATUS = "STATUS".asInstanceOf[OperationFilterName]
  val TYPE = "TYPE".asInstanceOf[OperationFilterName]
  val UPDATE_DATE = "UPDATE_DATE".asInstanceOf[OperationFilterName]

  @inline def values: js.Array[OperationFilterName] = js.Array(NAMESPACE_ID, SERVICE_ID, STATUS, TYPE, UPDATE_DATE)
}

@js.native
sealed trait OperationStatus extends js.Any
object OperationStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[OperationStatus]
  val PENDING = "PENDING".asInstanceOf[OperationStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[OperationStatus]
  val FAIL = "FAIL".asInstanceOf[OperationStatus]

  @inline def values: js.Array[OperationStatus] = js.Array(SUBMITTED, PENDING, SUCCESS, FAIL)
}

@js.native
sealed trait OperationTargetType extends js.Any
object OperationTargetType {
  val NAMESPACE = "NAMESPACE".asInstanceOf[OperationTargetType]
  val SERVICE = "SERVICE".asInstanceOf[OperationTargetType]
  val INSTANCE = "INSTANCE".asInstanceOf[OperationTargetType]

  @inline def values: js.Array[OperationTargetType] = js.Array(NAMESPACE, SERVICE, INSTANCE)
}

@js.native
sealed trait OperationType extends js.Any
object OperationType {
  val CREATE_NAMESPACE = "CREATE_NAMESPACE".asInstanceOf[OperationType]
  val DELETE_NAMESPACE = "DELETE_NAMESPACE".asInstanceOf[OperationType]
  val UPDATE_NAMESPACE = "UPDATE_NAMESPACE".asInstanceOf[OperationType]
  val UPDATE_SERVICE = "UPDATE_SERVICE".asInstanceOf[OperationType]
  val REGISTER_INSTANCE = "REGISTER_INSTANCE".asInstanceOf[OperationType]
  val DEREGISTER_INSTANCE = "DEREGISTER_INSTANCE".asInstanceOf[OperationType]

  @inline def values: js.Array[OperationType] = js.Array(CREATE_NAMESPACE, DELETE_NAMESPACE, UPDATE_NAMESPACE, UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE)
}

@js.native
sealed trait RecordType extends js.Any
object RecordType {
  val SRV = "SRV".asInstanceOf[RecordType]
  val A = "A".asInstanceOf[RecordType]
  val AAAA = "AAAA".asInstanceOf[RecordType]
  val CNAME = "CNAME".asInstanceOf[RecordType]

  @inline def values: js.Array[RecordType] = js.Array(SRV, A, AAAA, CNAME)
}

@js.native
sealed trait RoutingPolicy extends js.Any
object RoutingPolicy {
  val MULTIVALUE = "MULTIVALUE".asInstanceOf[RoutingPolicy]
  val WEIGHTED = "WEIGHTED".asInstanceOf[RoutingPolicy]

  @inline def values: js.Array[RoutingPolicy] = js.Array(MULTIVALUE, WEIGHTED)
}

@js.native
sealed trait ServiceFilterName extends js.Any
object ServiceFilterName {
  val NAMESPACE_ID = "NAMESPACE_ID".asInstanceOf[ServiceFilterName]

  @inline def values: js.Array[ServiceFilterName] = js.Array(NAMESPACE_ID)
}

@js.native
sealed trait ServiceType extends js.Any
object ServiceType {
  val HTTP = "HTTP".asInstanceOf[ServiceType]
  val DNS_HTTP = "DNS_HTTP".asInstanceOf[ServiceType]
  val DNS = "DNS".asInstanceOf[ServiceType]

  @inline def values: js.Array[ServiceType] = js.Array(HTTP, DNS_HTTP, DNS)
}

@js.native
sealed trait ServiceTypeOption extends js.Any
object ServiceTypeOption {
  val HTTP = "HTTP".asInstanceOf[ServiceTypeOption]

  @inline def values: js.Array[ServiceTypeOption] = js.Array(HTTP)
}
