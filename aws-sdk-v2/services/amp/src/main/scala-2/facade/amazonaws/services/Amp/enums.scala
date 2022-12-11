package facade.amazonaws.services.amp

import scalajs.js

/** State of an alert manager definition.
  */
@js.native
sealed trait AlertManagerDefinitionStatusCode extends js.Any
object AlertManagerDefinitionStatusCode {
  val CREATING = "CREATING".asInstanceOf[AlertManagerDefinitionStatusCode]
  val ACTIVE = "ACTIVE".asInstanceOf[AlertManagerDefinitionStatusCode]
  val UPDATING = "UPDATING".asInstanceOf[AlertManagerDefinitionStatusCode]
  val DELETING = "DELETING".asInstanceOf[AlertManagerDefinitionStatusCode]
  val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[AlertManagerDefinitionStatusCode]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[AlertManagerDefinitionStatusCode]

  @inline def values: js.Array[AlertManagerDefinitionStatusCode] = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATION_FAILED, UPDATE_FAILED)
}

/** State of a logging configuration.
  */
@js.native
sealed trait LoggingConfigurationStatusCode extends js.Any
object LoggingConfigurationStatusCode {
  val CREATING = "CREATING".asInstanceOf[LoggingConfigurationStatusCode]
  val ACTIVE = "ACTIVE".asInstanceOf[LoggingConfigurationStatusCode]
  val UPDATING = "UPDATING".asInstanceOf[LoggingConfigurationStatusCode]
  val DELETING = "DELETING".asInstanceOf[LoggingConfigurationStatusCode]
  val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[LoggingConfigurationStatusCode]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[LoggingConfigurationStatusCode]

  @inline def values: js.Array[LoggingConfigurationStatusCode] = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATION_FAILED, UPDATE_FAILED)
}

/** State of a namespace.
  */
@js.native
sealed trait RuleGroupsNamespaceStatusCode extends js.Any
object RuleGroupsNamespaceStatusCode {
  val CREATING = "CREATING".asInstanceOf[RuleGroupsNamespaceStatusCode]
  val ACTIVE = "ACTIVE".asInstanceOf[RuleGroupsNamespaceStatusCode]
  val UPDATING = "UPDATING".asInstanceOf[RuleGroupsNamespaceStatusCode]
  val DELETING = "DELETING".asInstanceOf[RuleGroupsNamespaceStatusCode]
  val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[RuleGroupsNamespaceStatusCode]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[RuleGroupsNamespaceStatusCode]

  @inline def values: js.Array[RuleGroupsNamespaceStatusCode] = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATION_FAILED, UPDATE_FAILED)
}

/** State of a workspace.
  */
@js.native
sealed trait WorkspaceStatusCode extends js.Any
object WorkspaceStatusCode {
  val CREATING = "CREATING".asInstanceOf[WorkspaceStatusCode]
  val ACTIVE = "ACTIVE".asInstanceOf[WorkspaceStatusCode]
  val UPDATING = "UPDATING".asInstanceOf[WorkspaceStatusCode]
  val DELETING = "DELETING".asInstanceOf[WorkspaceStatusCode]
  val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[WorkspaceStatusCode]

  @inline def values: js.Array[WorkspaceStatusCode] = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATION_FAILED)
}
