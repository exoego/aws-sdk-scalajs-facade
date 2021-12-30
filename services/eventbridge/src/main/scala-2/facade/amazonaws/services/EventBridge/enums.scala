package facade.amazonaws.services.eventbridge

import scalajs.js

@js.native
sealed trait ApiDestinationHttpMethod extends js.Any
object ApiDestinationHttpMethod {
  val POST = "POST".asInstanceOf[ApiDestinationHttpMethod]
  val GET = "GET".asInstanceOf[ApiDestinationHttpMethod]
  val HEAD = "HEAD".asInstanceOf[ApiDestinationHttpMethod]
  val OPTIONS = "OPTIONS".asInstanceOf[ApiDestinationHttpMethod]
  val PUT = "PUT".asInstanceOf[ApiDestinationHttpMethod]
  val PATCH = "PATCH".asInstanceOf[ApiDestinationHttpMethod]
  val DELETE = "DELETE".asInstanceOf[ApiDestinationHttpMethod]

  @inline def values: js.Array[ApiDestinationHttpMethod] = js.Array(POST, GET, HEAD, OPTIONS, PUT, PATCH, DELETE)
}

@js.native
sealed trait ApiDestinationState extends js.Any
object ApiDestinationState {
  val ACTIVE = "ACTIVE".asInstanceOf[ApiDestinationState]
  val INACTIVE = "INACTIVE".asInstanceOf[ApiDestinationState]

  @inline def values: js.Array[ApiDestinationState] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait ArchiveState extends js.Any
object ArchiveState {
  val ENABLED = "ENABLED".asInstanceOf[ArchiveState]
  val DISABLED = "DISABLED".asInstanceOf[ArchiveState]
  val CREATING = "CREATING".asInstanceOf[ArchiveState]
  val UPDATING = "UPDATING".asInstanceOf[ArchiveState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ArchiveState]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[ArchiveState]

  @inline def values: js.Array[ArchiveState] = js.Array(ENABLED, DISABLED, CREATING, UPDATING, CREATE_FAILED, UPDATE_FAILED)
}

@js.native
sealed trait AssignPublicIp extends js.Any
object AssignPublicIp {
  val ENABLED = "ENABLED".asInstanceOf[AssignPublicIp]
  val DISABLED = "DISABLED".asInstanceOf[AssignPublicIp]

  @inline def values: js.Array[AssignPublicIp] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait ConnectionAuthorizationType extends js.Any
object ConnectionAuthorizationType {
  val BASIC = "BASIC".asInstanceOf[ConnectionAuthorizationType]
  val OAUTH_CLIENT_CREDENTIALS = "OAUTH_CLIENT_CREDENTIALS".asInstanceOf[ConnectionAuthorizationType]
  val API_KEY = "API_KEY".asInstanceOf[ConnectionAuthorizationType]

  @inline def values: js.Array[ConnectionAuthorizationType] = js.Array(BASIC, OAUTH_CLIENT_CREDENTIALS, API_KEY)
}

@js.native
sealed trait ConnectionOAuthHttpMethod extends js.Any
object ConnectionOAuthHttpMethod {
  val GET = "GET".asInstanceOf[ConnectionOAuthHttpMethod]
  val POST = "POST".asInstanceOf[ConnectionOAuthHttpMethod]
  val PUT = "PUT".asInstanceOf[ConnectionOAuthHttpMethod]

  @inline def values: js.Array[ConnectionOAuthHttpMethod] = js.Array(GET, POST, PUT)
}

@js.native
sealed trait ConnectionState extends js.Any
object ConnectionState {
  val CREATING = "CREATING".asInstanceOf[ConnectionState]
  val UPDATING = "UPDATING".asInstanceOf[ConnectionState]
  val DELETING = "DELETING".asInstanceOf[ConnectionState]
  val AUTHORIZED = "AUTHORIZED".asInstanceOf[ConnectionState]
  val DEAUTHORIZED = "DEAUTHORIZED".asInstanceOf[ConnectionState]
  val AUTHORIZING = "AUTHORIZING".asInstanceOf[ConnectionState]
  val DEAUTHORIZING = "DEAUTHORIZING".asInstanceOf[ConnectionState]

  @inline def values: js.Array[ConnectionState] = js.Array(CREATING, UPDATING, DELETING, AUTHORIZED, DEAUTHORIZED, AUTHORIZING, DEAUTHORIZING)
}

@js.native
sealed trait EventSourceState extends js.Any
object EventSourceState {
  val PENDING = "PENDING".asInstanceOf[EventSourceState]
  val ACTIVE = "ACTIVE".asInstanceOf[EventSourceState]
  val DELETED = "DELETED".asInstanceOf[EventSourceState]

  @inline def values: js.Array[EventSourceState] = js.Array(PENDING, ACTIVE, DELETED)
}

@js.native
sealed trait LaunchType extends js.Any
object LaunchType {
  val EC2 = "EC2".asInstanceOf[LaunchType]
  val FARGATE = "FARGATE".asInstanceOf[LaunchType]

  @inline def values: js.Array[LaunchType] = js.Array(EC2, FARGATE)
}

@js.native
sealed trait ReplayState extends js.Any
object ReplayState {
  val STARTING = "STARTING".asInstanceOf[ReplayState]
  val RUNNING = "RUNNING".asInstanceOf[ReplayState]
  val CANCELLING = "CANCELLING".asInstanceOf[ReplayState]
  val COMPLETED = "COMPLETED".asInstanceOf[ReplayState]
  val CANCELLED = "CANCELLED".asInstanceOf[ReplayState]
  val FAILED = "FAILED".asInstanceOf[ReplayState]

  @inline def values: js.Array[ReplayState] = js.Array(STARTING, RUNNING, CANCELLING, COMPLETED, CANCELLED, FAILED)
}

@js.native
sealed trait RuleState extends js.Any
object RuleState {
  val ENABLED = "ENABLED".asInstanceOf[RuleState]
  val DISABLED = "DISABLED".asInstanceOf[RuleState]

  @inline def values: js.Array[RuleState] = js.Array(ENABLED, DISABLED)
}
