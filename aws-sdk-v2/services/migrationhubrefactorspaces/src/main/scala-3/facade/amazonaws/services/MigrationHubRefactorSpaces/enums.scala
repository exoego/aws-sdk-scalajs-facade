package facade.amazonaws.services.migrationhubrefactorspaces

import scalajs.js

type ApiGatewayEndpointType = "REGIONAL" | "PRIVATE"
object ApiGatewayEndpointType {
  inline val REGIONAL: "REGIONAL" = "REGIONAL"
  inline val PRIVATE: "PRIVATE" = "PRIVATE"

  inline def values: js.Array[ApiGatewayEndpointType] = js.Array(REGIONAL, PRIVATE)
}

type ApplicationState = "CREATING" | "ACTIVE" | "DELETING" | "FAILED" | "UPDATING"
object ApplicationState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[ApplicationState] = js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING)
}

type EnvironmentState = "CREATING" | "ACTIVE" | "DELETING" | "FAILED"
object EnvironmentState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[EnvironmentState] = js.Array(CREATING, ACTIVE, DELETING, FAILED)
}

type ErrorCode = "INVALID_RESOURCE_STATE" | "RESOURCE_LIMIT_EXCEEDED" | "RESOURCE_CREATION_FAILURE" | "RESOURCE_UPDATE_FAILURE" | "SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE" | "RESOURCE_DELETION_FAILURE" | "RESOURCE_RETRIEVAL_FAILURE" | "RESOURCE_IN_USE" | "RESOURCE_NOT_FOUND" | "STATE_TRANSITION_FAILURE" | "REQUEST_LIMIT_EXCEEDED" | "NOT_AUTHORIZED"
object ErrorCode {
  inline val INVALID_RESOURCE_STATE: "INVALID_RESOURCE_STATE" = "INVALID_RESOURCE_STATE"
  inline val RESOURCE_LIMIT_EXCEEDED: "RESOURCE_LIMIT_EXCEEDED" = "RESOURCE_LIMIT_EXCEEDED"
  inline val RESOURCE_CREATION_FAILURE: "RESOURCE_CREATION_FAILURE" = "RESOURCE_CREATION_FAILURE"
  inline val RESOURCE_UPDATE_FAILURE: "RESOURCE_UPDATE_FAILURE" = "RESOURCE_UPDATE_FAILURE"
  inline val SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE: "SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE" = "SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE"
  inline val RESOURCE_DELETION_FAILURE: "RESOURCE_DELETION_FAILURE" = "RESOURCE_DELETION_FAILURE"
  inline val RESOURCE_RETRIEVAL_FAILURE: "RESOURCE_RETRIEVAL_FAILURE" = "RESOURCE_RETRIEVAL_FAILURE"
  inline val RESOURCE_IN_USE: "RESOURCE_IN_USE" = "RESOURCE_IN_USE"
  inline val RESOURCE_NOT_FOUND: "RESOURCE_NOT_FOUND" = "RESOURCE_NOT_FOUND"
  inline val STATE_TRANSITION_FAILURE: "STATE_TRANSITION_FAILURE" = "STATE_TRANSITION_FAILURE"
  inline val REQUEST_LIMIT_EXCEEDED: "REQUEST_LIMIT_EXCEEDED" = "REQUEST_LIMIT_EXCEEDED"
  inline val NOT_AUTHORIZED: "NOT_AUTHORIZED" = "NOT_AUTHORIZED"

  inline def values: js.Array[ErrorCode] = js.Array(
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

type ErrorResourceType = "ENVIRONMENT" | "APPLICATION" | "ROUTE" | "SERVICE" | "TRANSIT_GATEWAY" | "TRANSIT_GATEWAY_ATTACHMENT" | "API_GATEWAY" | "NLB" | "TARGET_GROUP" | "LOAD_BALANCER_LISTENER" | "VPC_LINK" | "LAMBDA" | "VPC" | "SUBNET" | "ROUTE_TABLE" | "SECURITY_GROUP" | "VPC_ENDPOINT_SERVICE_CONFIGURATION" | "RESOURCE_SHARE" | "IAM_ROLE"
object ErrorResourceType {
  inline val ENVIRONMENT: "ENVIRONMENT" = "ENVIRONMENT"
  inline val APPLICATION: "APPLICATION" = "APPLICATION"
  inline val ROUTE: "ROUTE" = "ROUTE"
  inline val SERVICE: "SERVICE" = "SERVICE"
  inline val TRANSIT_GATEWAY: "TRANSIT_GATEWAY" = "TRANSIT_GATEWAY"
  inline val TRANSIT_GATEWAY_ATTACHMENT: "TRANSIT_GATEWAY_ATTACHMENT" = "TRANSIT_GATEWAY_ATTACHMENT"
  inline val API_GATEWAY: "API_GATEWAY" = "API_GATEWAY"
  inline val NLB: "NLB" = "NLB"
  inline val TARGET_GROUP: "TARGET_GROUP" = "TARGET_GROUP"
  inline val LOAD_BALANCER_LISTENER: "LOAD_BALANCER_LISTENER" = "LOAD_BALANCER_LISTENER"
  inline val VPC_LINK: "VPC_LINK" = "VPC_LINK"
  inline val LAMBDA: "LAMBDA" = "LAMBDA"
  inline val VPC: "VPC" = "VPC"
  inline val SUBNET: "SUBNET" = "SUBNET"
  inline val ROUTE_TABLE: "ROUTE_TABLE" = "ROUTE_TABLE"
  inline val SECURITY_GROUP: "SECURITY_GROUP" = "SECURITY_GROUP"
  inline val VPC_ENDPOINT_SERVICE_CONFIGURATION: "VPC_ENDPOINT_SERVICE_CONFIGURATION" = "VPC_ENDPOINT_SERVICE_CONFIGURATION"
  inline val RESOURCE_SHARE: "RESOURCE_SHARE" = "RESOURCE_SHARE"
  inline val IAM_ROLE: "IAM_ROLE" = "IAM_ROLE"

  inline def values: js.Array[ErrorResourceType] = js.Array(
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

type HttpMethod = "DELETE" | "GET" | "HEAD" | "OPTIONS" | "PATCH" | "POST" | "PUT"
object HttpMethod {
  inline val DELETE: "DELETE" = "DELETE"
  inline val GET: "GET" = "GET"
  inline val HEAD: "HEAD" = "HEAD"
  inline val OPTIONS: "OPTIONS" = "OPTIONS"
  inline val PATCH: "PATCH" = "PATCH"
  inline val POST: "POST" = "POST"
  inline val PUT: "PUT" = "PUT"

  inline def values: js.Array[HttpMethod] = js.Array(DELETE, GET, HEAD, OPTIONS, PATCH, POST, PUT)
}

type NetworkFabricType = "TRANSIT_GATEWAY"
object NetworkFabricType {
  inline val TRANSIT_GATEWAY: "TRANSIT_GATEWAY" = "TRANSIT_GATEWAY"

  inline def values: js.Array[NetworkFabricType] = js.Array(TRANSIT_GATEWAY)
}

type ProxyType = "API_GATEWAY"
object ProxyType {
  inline val API_GATEWAY: "API_GATEWAY" = "API_GATEWAY"

  inline def values: js.Array[ProxyType] = js.Array(API_GATEWAY)
}

type RouteActivationState = "ACTIVE" | "INACTIVE"
object RouteActivationState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[RouteActivationState] = js.Array(ACTIVE, INACTIVE)
}

type RouteState = "CREATING" | "ACTIVE" | "DELETING" | "FAILED" | "UPDATING" | "INACTIVE"
object RouteState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[RouteState] = js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING, INACTIVE)
}

type RouteType = "DEFAULT" | "URI_PATH"
object RouteType {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val URI_PATH: "URI_PATH" = "URI_PATH"

  inline def values: js.Array[RouteType] = js.Array(DEFAULT, URI_PATH)
}

type ServiceEndpointType = "LAMBDA" | "URL"
object ServiceEndpointType {
  inline val LAMBDA: "LAMBDA" = "LAMBDA"
  inline val URL: "URL" = "URL"

  inline def values: js.Array[ServiceEndpointType] = js.Array(LAMBDA, URL)
}

type ServiceState = "CREATING" | "ACTIVE" | "DELETING" | "FAILED"
object ServiceState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ServiceState] = js.Array(CREATING, ACTIVE, DELETING, FAILED)
}
