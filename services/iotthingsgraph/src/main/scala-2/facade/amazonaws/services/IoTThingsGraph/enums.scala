package facade.amazonaws.services.iotthingsgraph

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait DefinitionLanguage extends js.Any
object DefinitionLanguage {
  val GRAPHQL = "GRAPHQL".asInstanceOf[DefinitionLanguage]

  @inline def values = js.Array(GRAPHQL)
}

@js.native
sealed trait DeploymentTarget extends js.Any
object DeploymentTarget {
  val GREENGRASS = "GREENGRASS".asInstanceOf[DeploymentTarget]
  val CLOUD = "CLOUD".asInstanceOf[DeploymentTarget]

  @inline def values = js.Array(GREENGRASS, CLOUD)
}

@js.native
sealed trait EntityFilterName extends js.Any
object EntityFilterName {
  val NAME = "NAME".asInstanceOf[EntityFilterName]
  val NAMESPACE = "NAMESPACE".asInstanceOf[EntityFilterName]
  val SEMANTIC_TYPE_PATH = "SEMANTIC_TYPE_PATH".asInstanceOf[EntityFilterName]
  val REFERENCED_ENTITY_ID = "REFERENCED_ENTITY_ID".asInstanceOf[EntityFilterName]

  @inline def values = js.Array(NAME, NAMESPACE, SEMANTIC_TYPE_PATH, REFERENCED_ENTITY_ID)
}

@js.native
sealed trait EntityType extends js.Any
object EntityType {
  val DEVICE = "DEVICE".asInstanceOf[EntityType]
  val SERVICE = "SERVICE".asInstanceOf[EntityType]
  val DEVICE_MODEL = "DEVICE_MODEL".asInstanceOf[EntityType]
  val CAPABILITY = "CAPABILITY".asInstanceOf[EntityType]
  val STATE = "STATE".asInstanceOf[EntityType]
  val ACTION = "ACTION".asInstanceOf[EntityType]
  val EVENT = "EVENT".asInstanceOf[EntityType]
  val PROPERTY = "PROPERTY".asInstanceOf[EntityType]
  val MAPPING = "MAPPING".asInstanceOf[EntityType]
  val ENUM = "ENUM".asInstanceOf[EntityType]

  @inline def values = js.Array(DEVICE, SERVICE, DEVICE_MODEL, CAPABILITY, STATE, ACTION, EVENT, PROPERTY, MAPPING, ENUM)
}

@js.native
sealed trait FlowExecutionEventType extends js.Any
object FlowExecutionEventType {
  val EXECUTION_STARTED = "EXECUTION_STARTED".asInstanceOf[FlowExecutionEventType]
  val EXECUTION_FAILED = "EXECUTION_FAILED".asInstanceOf[FlowExecutionEventType]
  val EXECUTION_ABORTED = "EXECUTION_ABORTED".asInstanceOf[FlowExecutionEventType]
  val EXECUTION_SUCCEEDED = "EXECUTION_SUCCEEDED".asInstanceOf[FlowExecutionEventType]
  val STEP_STARTED = "STEP_STARTED".asInstanceOf[FlowExecutionEventType]
  val STEP_FAILED = "STEP_FAILED".asInstanceOf[FlowExecutionEventType]
  val STEP_SUCCEEDED = "STEP_SUCCEEDED".asInstanceOf[FlowExecutionEventType]
  val ACTIVITY_SCHEDULED = "ACTIVITY_SCHEDULED".asInstanceOf[FlowExecutionEventType]
  val ACTIVITY_STARTED = "ACTIVITY_STARTED".asInstanceOf[FlowExecutionEventType]
  val ACTIVITY_FAILED = "ACTIVITY_FAILED".asInstanceOf[FlowExecutionEventType]
  val ACTIVITY_SUCCEEDED = "ACTIVITY_SUCCEEDED".asInstanceOf[FlowExecutionEventType]
  val START_FLOW_EXECUTION_TASK = "START_FLOW_EXECUTION_TASK".asInstanceOf[FlowExecutionEventType]
  val SCHEDULE_NEXT_READY_STEPS_TASK = "SCHEDULE_NEXT_READY_STEPS_TASK".asInstanceOf[FlowExecutionEventType]
  val THING_ACTION_TASK = "THING_ACTION_TASK".asInstanceOf[FlowExecutionEventType]
  val THING_ACTION_TASK_FAILED = "THING_ACTION_TASK_FAILED".asInstanceOf[FlowExecutionEventType]
  val THING_ACTION_TASK_SUCCEEDED = "THING_ACTION_TASK_SUCCEEDED".asInstanceOf[FlowExecutionEventType]
  val ACKNOWLEDGE_TASK_MESSAGE = "ACKNOWLEDGE_TASK_MESSAGE".asInstanceOf[FlowExecutionEventType]

  @inline def values = js.Array(EXECUTION_STARTED, EXECUTION_FAILED, EXECUTION_ABORTED, EXECUTION_SUCCEEDED, STEP_STARTED, STEP_FAILED, STEP_SUCCEEDED, ACTIVITY_SCHEDULED, ACTIVITY_STARTED, ACTIVITY_FAILED, ACTIVITY_SUCCEEDED, START_FLOW_EXECUTION_TASK, SCHEDULE_NEXT_READY_STEPS_TASK, THING_ACTION_TASK, THING_ACTION_TASK_FAILED, THING_ACTION_TASK_SUCCEEDED, ACKNOWLEDGE_TASK_MESSAGE)
}

@js.native
sealed trait FlowExecutionStatus extends js.Any
object FlowExecutionStatus {
  val RUNNING = "RUNNING".asInstanceOf[FlowExecutionStatus]
  val ABORTED = "ABORTED".asInstanceOf[FlowExecutionStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[FlowExecutionStatus]
  val FAILED = "FAILED".asInstanceOf[FlowExecutionStatus]

  @inline def values = js.Array(RUNNING, ABORTED, SUCCEEDED, FAILED)
}

@js.native
sealed trait FlowTemplateFilterName extends js.Any
object FlowTemplateFilterName {
  val DEVICE_MODEL_ID = "DEVICE_MODEL_ID".asInstanceOf[FlowTemplateFilterName]

  @inline def values = js.Array(DEVICE_MODEL_ID)
}

@js.native
sealed trait NamespaceDeletionStatus extends js.Any
object NamespaceDeletionStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[NamespaceDeletionStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[NamespaceDeletionStatus]
  val FAILED = "FAILED".asInstanceOf[NamespaceDeletionStatus]

  @inline def values = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}

@js.native
sealed trait NamespaceDeletionStatusErrorCodes extends js.Any
object NamespaceDeletionStatusErrorCodes {
  val VALIDATION_FAILED = "VALIDATION_FAILED".asInstanceOf[NamespaceDeletionStatusErrorCodes]

  @inline def values = js.Array(VALIDATION_FAILED)
}

@js.native
sealed trait SystemInstanceDeploymentStatus extends js.Any
object SystemInstanceDeploymentStatus {
  val NOT_DEPLOYED = "NOT_DEPLOYED".asInstanceOf[SystemInstanceDeploymentStatus]
  val BOOTSTRAP = "BOOTSTRAP".asInstanceOf[SystemInstanceDeploymentStatus]
  val DEPLOY_IN_PROGRESS = "DEPLOY_IN_PROGRESS".asInstanceOf[SystemInstanceDeploymentStatus]
  val DEPLOYED_IN_TARGET = "DEPLOYED_IN_TARGET".asInstanceOf[SystemInstanceDeploymentStatus]
  val UNDEPLOY_IN_PROGRESS = "UNDEPLOY_IN_PROGRESS".asInstanceOf[SystemInstanceDeploymentStatus]
  val FAILED = "FAILED".asInstanceOf[SystemInstanceDeploymentStatus]
  val PENDING_DELETE = "PENDING_DELETE".asInstanceOf[SystemInstanceDeploymentStatus]
  val DELETED_IN_TARGET = "DELETED_IN_TARGET".asInstanceOf[SystemInstanceDeploymentStatus]

  @inline def values = js.Array(NOT_DEPLOYED, BOOTSTRAP, DEPLOY_IN_PROGRESS, DEPLOYED_IN_TARGET, UNDEPLOY_IN_PROGRESS, FAILED, PENDING_DELETE, DELETED_IN_TARGET)
}

@js.native
sealed trait SystemInstanceFilterName extends js.Any
object SystemInstanceFilterName {
  val SYSTEM_TEMPLATE_ID = "SYSTEM_TEMPLATE_ID".asInstanceOf[SystemInstanceFilterName]
  val STATUS = "STATUS".asInstanceOf[SystemInstanceFilterName]
  val GREENGRASS_GROUP_NAME = "GREENGRASS_GROUP_NAME".asInstanceOf[SystemInstanceFilterName]

  @inline def values = js.Array(SYSTEM_TEMPLATE_ID, STATUS, GREENGRASS_GROUP_NAME)
}

@js.native
sealed trait SystemTemplateFilterName extends js.Any
object SystemTemplateFilterName {
  val FLOW_TEMPLATE_ID = "FLOW_TEMPLATE_ID".asInstanceOf[SystemTemplateFilterName]

  @inline def values = js.Array(FLOW_TEMPLATE_ID)
}

@js.native
sealed trait UploadStatus extends js.Any
object UploadStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[UploadStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[UploadStatus]
  val FAILED = "FAILED".asInstanceOf[UploadStatus]

  @inline def values = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}

