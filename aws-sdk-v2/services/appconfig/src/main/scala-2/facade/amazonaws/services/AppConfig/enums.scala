package facade.amazonaws.services.appconfig

import scalajs.js

@js.native
sealed trait ActionPoint extends js.Any
object ActionPoint {
  val PRE_CREATE_HOSTED_CONFIGURATION_VERSION = "PRE_CREATE_HOSTED_CONFIGURATION_VERSION".asInstanceOf[ActionPoint]
  val PRE_START_DEPLOYMENT = "PRE_START_DEPLOYMENT".asInstanceOf[ActionPoint]
  val ON_DEPLOYMENT_START = "ON_DEPLOYMENT_START".asInstanceOf[ActionPoint]
  val ON_DEPLOYMENT_STEP = "ON_DEPLOYMENT_STEP".asInstanceOf[ActionPoint]
  val ON_DEPLOYMENT_BAKING = "ON_DEPLOYMENT_BAKING".asInstanceOf[ActionPoint]
  val ON_DEPLOYMENT_COMPLETE = "ON_DEPLOYMENT_COMPLETE".asInstanceOf[ActionPoint]
  val ON_DEPLOYMENT_ROLLED_BACK = "ON_DEPLOYMENT_ROLLED_BACK".asInstanceOf[ActionPoint]

  @inline def values: js.Array[ActionPoint] = js.Array(
    PRE_CREATE_HOSTED_CONFIGURATION_VERSION,
    PRE_START_DEPLOYMENT,
    ON_DEPLOYMENT_START,
    ON_DEPLOYMENT_STEP,
    ON_DEPLOYMENT_BAKING,
    ON_DEPLOYMENT_COMPLETE,
    ON_DEPLOYMENT_ROLLED_BACK
  )
}

@js.native
sealed trait DeploymentEventType extends js.Any
object DeploymentEventType {
  val PERCENTAGE_UPDATED = "PERCENTAGE_UPDATED".asInstanceOf[DeploymentEventType]
  val ROLLBACK_STARTED = "ROLLBACK_STARTED".asInstanceOf[DeploymentEventType]
  val ROLLBACK_COMPLETED = "ROLLBACK_COMPLETED".asInstanceOf[DeploymentEventType]
  val BAKE_TIME_STARTED = "BAKE_TIME_STARTED".asInstanceOf[DeploymentEventType]
  val DEPLOYMENT_STARTED = "DEPLOYMENT_STARTED".asInstanceOf[DeploymentEventType]
  val DEPLOYMENT_COMPLETED = "DEPLOYMENT_COMPLETED".asInstanceOf[DeploymentEventType]

  @inline def values: js.Array[DeploymentEventType] = js.Array(PERCENTAGE_UPDATED, ROLLBACK_STARTED, ROLLBACK_COMPLETED, BAKE_TIME_STARTED, DEPLOYMENT_STARTED, DEPLOYMENT_COMPLETED)
}

@js.native
sealed trait DeploymentState extends js.Any
object DeploymentState {
  val BAKING = "BAKING".asInstanceOf[DeploymentState]
  val VALIDATING = "VALIDATING".asInstanceOf[DeploymentState]
  val DEPLOYING = "DEPLOYING".asInstanceOf[DeploymentState]
  val COMPLETE = "COMPLETE".asInstanceOf[DeploymentState]
  val ROLLING_BACK = "ROLLING_BACK".asInstanceOf[DeploymentState]
  val ROLLED_BACK = "ROLLED_BACK".asInstanceOf[DeploymentState]

  @inline def values: js.Array[DeploymentState] = js.Array(BAKING, VALIDATING, DEPLOYING, COMPLETE, ROLLING_BACK, ROLLED_BACK)
}

@js.native
sealed trait EnvironmentState extends js.Any
object EnvironmentState {
  val READY_FOR_DEPLOYMENT = "READY_FOR_DEPLOYMENT".asInstanceOf[EnvironmentState]
  val DEPLOYING = "DEPLOYING".asInstanceOf[EnvironmentState]
  val ROLLING_BACK = "ROLLING_BACK".asInstanceOf[EnvironmentState]
  val ROLLED_BACK = "ROLLED_BACK".asInstanceOf[EnvironmentState]

  @inline def values: js.Array[EnvironmentState] = js.Array(READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK, ROLLED_BACK)
}

@js.native
sealed trait GrowthType extends js.Any
object GrowthType {
  val LINEAR = "LINEAR".asInstanceOf[GrowthType]
  val EXPONENTIAL = "EXPONENTIAL".asInstanceOf[GrowthType]

  @inline def values: js.Array[GrowthType] = js.Array(LINEAR, EXPONENTIAL)
}

@js.native
sealed trait ReplicateTo extends js.Any
object ReplicateTo {
  val NONE = "NONE".asInstanceOf[ReplicateTo]
  val SSM_DOCUMENT = "SSM_DOCUMENT".asInstanceOf[ReplicateTo]

  @inline def values: js.Array[ReplicateTo] = js.Array(NONE, SSM_DOCUMENT)
}

@js.native
sealed trait TriggeredBy extends js.Any
object TriggeredBy {
  val USER = "USER".asInstanceOf[TriggeredBy]
  val APPCONFIG = "APPCONFIG".asInstanceOf[TriggeredBy]
  val CLOUDWATCH_ALARM = "CLOUDWATCH_ALARM".asInstanceOf[TriggeredBy]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[TriggeredBy]

  @inline def values: js.Array[TriggeredBy] = js.Array(USER, APPCONFIG, CLOUDWATCH_ALARM, INTERNAL_ERROR)
}

@js.native
sealed trait ValidatorType extends js.Any
object ValidatorType {
  val JSON_SCHEMA = "JSON_SCHEMA".asInstanceOf[ValidatorType]
  val LAMBDA = "LAMBDA".asInstanceOf[ValidatorType]

  @inline def values: js.Array[ValidatorType] = js.Array(JSON_SCHEMA, LAMBDA)
}
