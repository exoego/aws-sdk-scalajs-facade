package facade.amazonaws.services.appconfig

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait DeploymentEventType extends js.Any
object DeploymentEventType {
  val PERCENTAGE_UPDATED = "PERCENTAGE_UPDATED".asInstanceOf[DeploymentEventType]
  val ROLLBACK_STARTED = "ROLLBACK_STARTED".asInstanceOf[DeploymentEventType]
  val ROLLBACK_COMPLETED = "ROLLBACK_COMPLETED".asInstanceOf[DeploymentEventType]
  val BAKE_TIME_STARTED = "BAKE_TIME_STARTED".asInstanceOf[DeploymentEventType]
  val DEPLOYMENT_STARTED = "DEPLOYMENT_STARTED".asInstanceOf[DeploymentEventType]
  val DEPLOYMENT_COMPLETED = "DEPLOYMENT_COMPLETED".asInstanceOf[DeploymentEventType]

  @inline def values = js.Array(PERCENTAGE_UPDATED, ROLLBACK_STARTED, ROLLBACK_COMPLETED, BAKE_TIME_STARTED, DEPLOYMENT_STARTED, DEPLOYMENT_COMPLETED)
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

  @inline def values = js.Array(BAKING, VALIDATING, DEPLOYING, COMPLETE, ROLLING_BACK, ROLLED_BACK)
}

@js.native
sealed trait EnvironmentState extends js.Any
object EnvironmentState {
  val READY_FOR_DEPLOYMENT = "READY_FOR_DEPLOYMENT".asInstanceOf[EnvironmentState]
  val DEPLOYING = "DEPLOYING".asInstanceOf[EnvironmentState]
  val ROLLING_BACK = "ROLLING_BACK".asInstanceOf[EnvironmentState]
  val ROLLED_BACK = "ROLLED_BACK".asInstanceOf[EnvironmentState]

  @inline def values = js.Array(READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK, ROLLED_BACK)
}

@js.native
sealed trait GrowthType extends js.Any
object GrowthType {
  val LINEAR = "LINEAR".asInstanceOf[GrowthType]
  val EXPONENTIAL = "EXPONENTIAL".asInstanceOf[GrowthType]

  @inline def values = js.Array(LINEAR, EXPONENTIAL)
}

@js.native
sealed trait ReplicateTo extends js.Any
object ReplicateTo {
  val NONE = "NONE".asInstanceOf[ReplicateTo]
  val SSM_DOCUMENT = "SSM_DOCUMENT".asInstanceOf[ReplicateTo]

  @inline def values = js.Array(NONE, SSM_DOCUMENT)
}

@js.native
sealed trait TriggeredBy extends js.Any
object TriggeredBy {
  val USER = "USER".asInstanceOf[TriggeredBy]
  val APPCONFIG = "APPCONFIG".asInstanceOf[TriggeredBy]
  val CLOUDWATCH_ALARM = "CLOUDWATCH_ALARM".asInstanceOf[TriggeredBy]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[TriggeredBy]

  @inline def values = js.Array(USER, APPCONFIG, CLOUDWATCH_ALARM, INTERNAL_ERROR)
}

@js.native
sealed trait ValidatorType extends js.Any
object ValidatorType {
  val JSON_SCHEMA = "JSON_SCHEMA".asInstanceOf[ValidatorType]
  val LAMBDA = "LAMBDA".asInstanceOf[ValidatorType]

  @inline def values = js.Array(JSON_SCHEMA, LAMBDA)
}

