package facade.amazonaws.services.amp

import scalajs.js

/** State of an alert manager definition.
  */
type AlertManagerDefinitionStatusCode = "CREATING" | "ACTIVE" | "UPDATING" | "DELETING" | "CREATION_FAILED" | "UPDATE_FAILED"
object AlertManagerDefinitionStatusCode {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[AlertManagerDefinitionStatusCode] = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATION_FAILED, UPDATE_FAILED)
}

/** State of a namespace.
  */
type RuleGroupsNamespaceStatusCode = "CREATING" | "ACTIVE" | "UPDATING" | "DELETING" | "CREATION_FAILED" | "UPDATE_FAILED"
object RuleGroupsNamespaceStatusCode {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[RuleGroupsNamespaceStatusCode] = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATION_FAILED, UPDATE_FAILED)
}

/** State of a workspace.
  */
type WorkspaceStatusCode = "CREATING" | "ACTIVE" | "UPDATING" | "DELETING" | "CREATION_FAILED"
object WorkspaceStatusCode {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"

  inline def values: js.Array[WorkspaceStatusCode] = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATION_FAILED)
}
