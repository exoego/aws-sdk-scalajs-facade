package facade.amazonaws.services.finspace

import scalajs.js

type EnvironmentStatus = "CREATE_REQUESTED" | "CREATING" | "CREATED" | "DELETE_REQUESTED" | "DELETING" | "DELETED" | "FAILED_CREATION" | "RETRY_DELETION" | "FAILED_DELETION" | "SUSPENDED"
object EnvironmentStatus {
  inline val CREATE_REQUESTED: "CREATE_REQUESTED" = "CREATE_REQUESTED"
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val DELETE_REQUESTED: "DELETE_REQUESTED" = "DELETE_REQUESTED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val FAILED_CREATION: "FAILED_CREATION" = "FAILED_CREATION"
  inline val RETRY_DELETION: "RETRY_DELETION" = "RETRY_DELETION"
  inline val FAILED_DELETION: "FAILED_DELETION" = "FAILED_DELETION"
  inline val SUSPENDED: "SUSPENDED" = "SUSPENDED"

  inline def values: js.Array[EnvironmentStatus] = js.Array(CREATE_REQUESTED, CREATING, CREATED, DELETE_REQUESTED, DELETING, DELETED, FAILED_CREATION, RETRY_DELETION, FAILED_DELETION, SUSPENDED)
}

type FederationMode = "FEDERATED" | "LOCAL"
object FederationMode {
  inline val FEDERATED: "FEDERATED" = "FEDERATED"
  inline val LOCAL: "LOCAL" = "LOCAL"

  inline def values: js.Array[FederationMode] = js.Array(FEDERATED, LOCAL)
}
