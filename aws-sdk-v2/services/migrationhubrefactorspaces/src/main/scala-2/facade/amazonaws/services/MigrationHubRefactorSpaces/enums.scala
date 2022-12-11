package facade.amazonaws.services.migrationhubrefactorspaces

import scalajs.js

@js.native
sealed trait ApiGatewayEndpointType extends js.Any
object ApiGatewayEndpointType {
  val REGIONAL = "REGIONAL".asInstanceOf[ApiGatewayEndpointType]
  val PRIVATE = "PRIVATE".asInstanceOf[ApiGatewayEndpointType]

  @inline def values: js.Array[ApiGatewayEndpointType] = js.Array(REGIONAL, PRIVATE)
}

@js.native
sealed trait ApplicationState extends js.Any
object ApplicationState {
  val CREATING = "CREATING".asInstanceOf[ApplicationState]
  val ACTIVE = "ACTIVE".asInstanceOf[ApplicationState]
  val DELETING = "DELETING".asInstanceOf[ApplicationState]
  val FAILED = "FAILED".asInstanceOf[ApplicationState]
  val UPDATING = "UPDATING".asInstanceOf[ApplicationState]

  @inline def values: js.Array[ApplicationState] = js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING)
}

@js.native
sealed trait EnvironmentState extends js.Any
object EnvironmentState {
  val CREATING = "CREATING".asInstanceOf[EnvironmentState]
  val ACTIVE = "ACTIVE".asInstanceOf[EnvironmentState]
  val DELETING = "DELETING".asInstanceOf[EnvironmentState]
  val FAILED = "FAILED".asInstanceOf[EnvironmentState]

  @inline def values: js.Array[EnvironmentState] = js.Array(CREATING, ACTIVE, DELETING, FAILED)
}

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val INVALID_RESOURCE_STATE = "INVALID_RESOURCE_STATE".asInstanceOf[ErrorCode]
  val RESOURCE_LIMIT_EXCEEDED = "RESOURCE_LIMIT_EXCEEDED".asInstanceOf[ErrorCode]
  val RESOURCE_CREATION_FAILURE = "RESOURCE_CREATION_FAILURE".asInstanceOf[ErrorCode]
  val RESOURCE_UPDATE_FAILURE = "RESOURCE_UPDATE_FAILURE".asInstanceOf[ErrorCode]
  val SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE = "SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE".asInstanceOf[ErrorCode]
  val RESOURCE_DELETION_FAILURE = "RESOURCE_DELETION_FAILURE".asInstanceOf[ErrorCode]
  val RESOURCE_RETRIEVAL_FAILURE = "RESOURCE_RETRIEVAL_FAILURE".asInstanceOf[ErrorCode]
  val RESOURCE_IN_USE = "RESOURCE_IN_USE".asInstanceOf[ErrorCode]
  val RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND".asInstanceOf[ErrorCode]
  val STATE_TRANSITION_FAILURE = "STATE_TRANSITION_FAILURE".asInstanceOf[ErrorCode]
  val REQUEST_LIMIT_EXCEEDED = "REQUEST_LIMIT_EXCEEDED".asInstanceOf[ErrorCode]
  val NOT_AUTHORIZED = "NOT_AUTHORIZED".asInstanceOf[ErrorCode]

  @inline def values: js.Array[ErrorCode] = js.Array(
    INVALID_RESOURCE_STATE,
    RESOURCE_LIMIT_EXCEEDED,
    RESOURCE_CREATION_FAILURE,
    RESOURCE_UPDATE_FAILURE,
    SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE,
    RESOURCE_DELETION_FAILURE,
    RESOURCE_RETRIEVAL_FAILURE,
    RESOURCE_IN_USE,
    RESOURCE_NOT_FOUND,
    STATE_TRANSITION_FAILURE,
    REQUEST_LIMIT_EXCEEDED,
    NOT_AUTHORIZED
  )
}

@js.native
sealed trait ErrorResourceType extends js.Any
object ErrorResourceType {
  val ENVIRONMENT = "ENVIRONMENT".asInstanceOf[ErrorResourceType]
  val APPLICATION = "APPLICATION".asInstanceOf[ErrorResourceType]
  val ROUTE = "ROUTE".asInstanceOf[ErrorResourceType]
  val SERVICE = "SERVICE".asInstanceOf[ErrorResourceType]
  val TRANSIT_GATEWAY = "TRANSIT_GATEWAY".asInstanceOf[ErrorResourceType]
  val TRANSIT_GATEWAY_ATTACHMENT = "TRANSIT_GATEWAY_ATTACHMENT".asInstanceOf[ErrorResourceType]
  val API_GATEWAY = "API_GATEWAY".asInstanceOf[ErrorResourceType]
  val NLB = "NLB".asInstanceOf[ErrorResourceType]
  val TARGET_GROUP = "TARGET_GROUP".asInstanceOf[ErrorResourceType]
  val LOAD_BALANCER_LISTENER = "LOAD_BALANCER_LISTENER".asInstanceOf[ErrorResourceType]
  val VPC_LINK = "VPC_LINK".asInstanceOf[ErrorResourceType]
  val LAMBDA = "LAMBDA".asInstanceOf[ErrorResourceType]
  val VPC = "VPC".asInstanceOf[ErrorResourceType]
  val SUBNET = "SUBNET".asInstanceOf[ErrorResourceType]
  val ROUTE_TABLE = "ROUTE_TABLE".asInstanceOf[ErrorResourceType]
  val SECURITY_GROUP = "SECURITY_GROUP".asInstanceOf[ErrorResourceType]
  val VPC_ENDPOINT_SERVICE_CONFIGURATION = "VPC_ENDPOINT_SERVICE_CONFIGURATION".asInstanceOf[ErrorResourceType]
  val RESOURCE_SHARE = "RESOURCE_SHARE".asInstanceOf[ErrorResourceType]
  val IAM_ROLE = "IAM_ROLE".asInstanceOf[ErrorResourceType]

  @inline def values: js.Array[ErrorResourceType] = js.Array(
    ENVIRONMENT,
    APPLICATION,
    ROUTE,
    SERVICE,
    TRANSIT_GATEWAY,
    TRANSIT_GATEWAY_ATTACHMENT,
    API_GATEWAY,
    NLB,
    TARGET_GROUP,
    LOAD_BALANCER_LISTENER,
    VPC_LINK,
    LAMBDA,
    VPC,
    SUBNET,
    ROUTE_TABLE,
    SECURITY_GROUP,
    VPC_ENDPOINT_SERVICE_CONFIGURATION,
    RESOURCE_SHARE,
    IAM_ROLE
  )
}

@js.native
sealed trait HttpMethod extends js.Any
object HttpMethod {
  val DELETE = "DELETE".asInstanceOf[HttpMethod]
  val GET = "GET".asInstanceOf[HttpMethod]
  val HEAD = "HEAD".asInstanceOf[HttpMethod]
  val OPTIONS = "OPTIONS".asInstanceOf[HttpMethod]
  val PATCH = "PATCH".asInstanceOf[HttpMethod]
  val POST = "POST".asInstanceOf[HttpMethod]
  val PUT = "PUT".asInstanceOf[HttpMethod]

  @inline def values: js.Array[HttpMethod] = js.Array(DELETE, GET, HEAD, OPTIONS, PATCH, POST, PUT)
}

@js.native
sealed trait NetworkFabricType extends js.Any
object NetworkFabricType {
  val TRANSIT_GATEWAY = "TRANSIT_GATEWAY".asInstanceOf[NetworkFabricType]

  @inline def values: js.Array[NetworkFabricType] = js.Array(TRANSIT_GATEWAY)
}

@js.native
sealed trait ProxyType extends js.Any
object ProxyType {
  val API_GATEWAY = "API_GATEWAY".asInstanceOf[ProxyType]

  @inline def values: js.Array[ProxyType] = js.Array(API_GATEWAY)
}

@js.native
sealed trait RouteActivationState extends js.Any
object RouteActivationState {
  val ACTIVE = "ACTIVE".asInstanceOf[RouteActivationState]
  val INACTIVE = "INACTIVE".asInstanceOf[RouteActivationState]

  @inline def values: js.Array[RouteActivationState] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait RouteState extends js.Any
object RouteState {
  val CREATING = "CREATING".asInstanceOf[RouteState]
  val ACTIVE = "ACTIVE".asInstanceOf[RouteState]
  val DELETING = "DELETING".asInstanceOf[RouteState]
  val FAILED = "FAILED".asInstanceOf[RouteState]
  val UPDATING = "UPDATING".asInstanceOf[RouteState]
  val INACTIVE = "INACTIVE".asInstanceOf[RouteState]

  @inline def values: js.Array[RouteState] = js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING, INACTIVE)
}

@js.native
sealed trait RouteType extends js.Any
object RouteType {
  val DEFAULT = "DEFAULT".asInstanceOf[RouteType]
  val URI_PATH = "URI_PATH".asInstanceOf[RouteType]

  @inline def values: js.Array[RouteType] = js.Array(DEFAULT, URI_PATH)
}

@js.native
sealed trait ServiceEndpointType extends js.Any
object ServiceEndpointType {
  val LAMBDA = "LAMBDA".asInstanceOf[ServiceEndpointType]
  val URL = "URL".asInstanceOf[ServiceEndpointType]

  @inline def values: js.Array[ServiceEndpointType] = js.Array(LAMBDA, URL)
}

@js.native
sealed trait ServiceState extends js.Any
object ServiceState {
  val CREATING = "CREATING".asInstanceOf[ServiceState]
  val ACTIVE = "ACTIVE".asInstanceOf[ServiceState]
  val DELETING = "DELETING".asInstanceOf[ServiceState]
  val FAILED = "FAILED".asInstanceOf[ServiceState]

  @inline def values: js.Array[ServiceState] = js.Array(CREATING, ACTIVE, DELETING, FAILED)
}
