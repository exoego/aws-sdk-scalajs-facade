package facade.amazonaws.services.eventbridge

import scalajs._

type ApiDestinationHttpMethod = "POST" | "GET" | "HEAD" | "OPTIONS" | "PUT" | "PATCH" | "DELETE"
object ApiDestinationHttpMethod {
  val POST: "POST" = "POST"
  val GET: "GET" = "GET"
  val HEAD: "HEAD" = "HEAD"
  val OPTIONS: "OPTIONS" = "OPTIONS"
  val PUT: "PUT" = "PUT"
  val PATCH: "PATCH" = "PATCH"
  val DELETE: "DELETE" = "DELETE"

  @inline def values = js.Array[ApiDestinationHttpMethod](POST, GET, HEAD, OPTIONS, PUT, PATCH, DELETE)
}

type ApiDestinationState = "ACTIVE" | "INACTIVE"
object ApiDestinationState {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[ApiDestinationState](ACTIVE, INACTIVE)
}

type ArchiveState = "ENABLED" | "DISABLED" | "CREATING" | "UPDATING" | "CREATE_FAILED" | "UPDATE_FAILED"
object ArchiveState {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"
  val CREATING: "CREATING" = "CREATING"
  val UPDATING: "UPDATING" = "UPDATING"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  @inline def values = js.Array[ArchiveState](ENABLED, DISABLED, CREATING, UPDATING, CREATE_FAILED, UPDATE_FAILED)
}

type AssignPublicIp = "ENABLED" | "DISABLED"
object AssignPublicIp {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[AssignPublicIp](ENABLED, DISABLED)
}

type ConnectionAuthorizationType = "BASIC" | "OAUTH_CLIENT_CREDENTIALS" | "API_KEY"
object ConnectionAuthorizationType {
  val BASIC: "BASIC" = "BASIC"
  val OAUTH_CLIENT_CREDENTIALS: "OAUTH_CLIENT_CREDENTIALS" = "OAUTH_CLIENT_CREDENTIALS"
  val API_KEY: "API_KEY" = "API_KEY"

  @inline def values = js.Array[ConnectionAuthorizationType](BASIC, OAUTH_CLIENT_CREDENTIALS, API_KEY)
}

type ConnectionOAuthHttpMethod = "GET" | "POST" | "PUT"
object ConnectionOAuthHttpMethod {
  val GET: "GET" = "GET"
  val POST: "POST" = "POST"
  val PUT: "PUT" = "PUT"

  @inline def values = js.Array[ConnectionOAuthHttpMethod](GET, POST, PUT)
}

type ConnectionState = "CREATING" | "UPDATING" | "DELETING" | "AUTHORIZED" | "DEAUTHORIZED" | "AUTHORIZING" | "DEAUTHORIZING"
object ConnectionState {
  val CREATING: "CREATING" = "CREATING"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val AUTHORIZED: "AUTHORIZED" = "AUTHORIZED"
  val DEAUTHORIZED: "DEAUTHORIZED" = "DEAUTHORIZED"
  val AUTHORIZING: "AUTHORIZING" = "AUTHORIZING"
  val DEAUTHORIZING: "DEAUTHORIZING" = "DEAUTHORIZING"

  @inline def values = js.Array[ConnectionState](CREATING, UPDATING, DELETING, AUTHORIZED, DEAUTHORIZED, AUTHORIZING, DEAUTHORIZING)
}

type EventSourceState = "PENDING" | "ACTIVE" | "DELETED"
object EventSourceState {
  val PENDING: "PENDING" = "PENDING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[EventSourceState](PENDING, ACTIVE, DELETED)
}

type LaunchType = "EC2" | "FARGATE"
object LaunchType {
  val EC2: "EC2" = "EC2"
  val FARGATE: "FARGATE" = "FARGATE"

  @inline def values = js.Array[LaunchType](EC2, FARGATE)
}

type ReplayState = "STARTING" | "RUNNING" | "CANCELLING" | "COMPLETED" | "CANCELLED" | "FAILED"
object ReplayState {
  val STARTING: "STARTING" = "STARTING"
  val RUNNING: "RUNNING" = "RUNNING"
  val CANCELLING: "CANCELLING" = "CANCELLING"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ReplayState](STARTING, RUNNING, CANCELLING, COMPLETED, CANCELLED, FAILED)
}

type RuleState = "ENABLED" | "DISABLED"
object RuleState {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[RuleState](ENABLED, DISABLED)
}
