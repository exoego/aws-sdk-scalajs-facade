package facade.amazonaws.services.finspace

import scalajs.js

@js.native
sealed trait EnvironmentStatus extends js.Any
object EnvironmentStatus {
  val CREATE_REQUESTED = "CREATE_REQUESTED".asInstanceOf[EnvironmentStatus]
  val CREATING = "CREATING".asInstanceOf[EnvironmentStatus]
  val CREATED = "CREATED".asInstanceOf[EnvironmentStatus]
  val DELETE_REQUESTED = "DELETE_REQUESTED".asInstanceOf[EnvironmentStatus]
  val DELETING = "DELETING".asInstanceOf[EnvironmentStatus]
  val DELETED = "DELETED".asInstanceOf[EnvironmentStatus]
  val FAILED_CREATION = "FAILED_CREATION".asInstanceOf[EnvironmentStatus]
  val RETRY_DELETION = "RETRY_DELETION".asInstanceOf[EnvironmentStatus]
  val FAILED_DELETION = "FAILED_DELETION".asInstanceOf[EnvironmentStatus]
  val SUSPENDED = "SUSPENDED".asInstanceOf[EnvironmentStatus]

  @inline def values: js.Array[EnvironmentStatus] = js.Array(CREATE_REQUESTED, CREATING, CREATED, DELETE_REQUESTED, DELETING, DELETED, FAILED_CREATION, RETRY_DELETION, FAILED_DELETION, SUSPENDED)
}

@js.native
sealed trait FederationMode extends js.Any
object FederationMode {
  val FEDERATED = "FEDERATED".asInstanceOf[FederationMode]
  val LOCAL = "LOCAL".asInstanceOf[FederationMode]

  @inline def values: js.Array[FederationMode] = js.Array(FEDERATED, LOCAL)
}
