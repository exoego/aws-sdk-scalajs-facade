package facade.amazonaws.services.cloudwatchevents

import scalajs.js

type ApiDestinationHttpMethod = "POST" | "GET" | "HEAD" | "OPTIONS" | "PUT" | "PATCH" | "DELETE"
object ApiDestinationHttpMethod {
  inline val POST: "POST" = "POST"
  inline val GET: "GET" = "GET"
  inline val HEAD: "HEAD" = "HEAD"
  inline val OPTIONS: "OPTIONS" = "OPTIONS"
  inline val PUT: "PUT" = "PUT"
  inline val PATCH: "PATCH" = "PATCH"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[ApiDestinationHttpMethod] = js.Array(POST, GET, HEAD, OPTIONS, PUT, PATCH, DELETE)
}

type ApiDestinationState = "ACTIVE" | "INACTIVE"
object ApiDestinationState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[ApiDestinationState] = js.Array(ACTIVE, INACTIVE)
}

type ArchiveState = "ENABLED" | "DISABLED" | "CREATING" | "UPDATING" | "CREATE_FAILED" | "UPDATE_FAILED"
object ArchiveState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[ArchiveState] = js.Array(ENABLED, DISABLED, CREATING, UPDATING, CREATE_FAILED, UPDATE_FAILED)
}

type AssignPublicIp = "ENABLED" | "DISABLED"
object AssignPublicIp {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AssignPublicIp] = js.Array(ENABLED, DISABLED)
}

type ConnectionAuthorizationType = "BASIC" | "OAUTH_CLIENT_CREDENTIALS" | "API_KEY"
object ConnectionAuthorizationType {
  inline val BASIC: "BASIC" = "BASIC"
  inline val OAUTH_CLIENT_CREDENTIALS: "OAUTH_CLIENT_CREDENTIALS" = "OAUTH_CLIENT_CREDENTIALS"
  inline val API_KEY: "API_KEY" = "API_KEY"

  inline def values: js.Array[ConnectionAuthorizationType] = js.Array(BASIC, OAUTH_CLIENT_CREDENTIALS, API_KEY)
}

type ConnectionOAuthHttpMethod = "GET" | "POST" | "PUT"
object ConnectionOAuthHttpMethod {
  inline val GET: "GET" = "GET"
  inline val POST: "POST" = "POST"
  inline val PUT: "PUT" = "PUT"

  inline def values: js.Array[ConnectionOAuthHttpMethod] = js.Array(GET, POST, PUT)
}

type ConnectionState = "CREATING" | "UPDATING" | "DELETING" | "AUTHORIZED" | "DEAUTHORIZED" | "AUTHORIZING" | "DEAUTHORIZING"
object ConnectionState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val AUTHORIZED: "AUTHORIZED" = "AUTHORIZED"
  inline val DEAUTHORIZED: "DEAUTHORIZED" = "DEAUTHORIZED"
  inline val AUTHORIZING: "AUTHORIZING" = "AUTHORIZING"
  inline val DEAUTHORIZING: "DEAUTHORIZING" = "DEAUTHORIZING"

  inline def values: js.Array[ConnectionState] = js.Array(CREATING, UPDATING, DELETING, AUTHORIZED, DEAUTHORIZED, AUTHORIZING, DEAUTHORIZING)
}

type EventSourceState = "PENDING" | "ACTIVE" | "DELETED"
object EventSourceState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[EventSourceState] = js.Array(PENDING, ACTIVE, DELETED)
}

type LaunchType = "EC2" | "FARGATE"
object LaunchType {
  inline val EC2: "EC2" = "EC2"
  inline val FARGATE: "FARGATE" = "FARGATE"

  inline def values: js.Array[LaunchType] = js.Array(EC2, FARGATE)
}

type ReplayState = "STARTING" | "RUNNING" | "CANCELLING" | "COMPLETED" | "CANCELLED" | "FAILED"
object ReplayState {
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ReplayState] = js.Array(STARTING, RUNNING, CANCELLING, COMPLETED, CANCELLED, FAILED)
}

type RuleState = "ENABLED" | "DISABLED"
object RuleState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[RuleState] = js.Array(ENABLED, DISABLED)
}
