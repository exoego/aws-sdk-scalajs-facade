package facade.amazonaws.services.appconfig

import scalajs._

type DeploymentEventType = "PERCENTAGE_UPDATED" | "ROLLBACK_STARTED" | "ROLLBACK_COMPLETED" | "BAKE_TIME_STARTED" | "DEPLOYMENT_STARTED" | "DEPLOYMENT_COMPLETED"
object DeploymentEventType {
  inline val PERCENTAGE_UPDATED: "PERCENTAGE_UPDATED" = "PERCENTAGE_UPDATED"
  inline val ROLLBACK_STARTED: "ROLLBACK_STARTED" = "ROLLBACK_STARTED"
  inline val ROLLBACK_COMPLETED: "ROLLBACK_COMPLETED" = "ROLLBACK_COMPLETED"
  inline val BAKE_TIME_STARTED: "BAKE_TIME_STARTED" = "BAKE_TIME_STARTED"
  inline val DEPLOYMENT_STARTED: "DEPLOYMENT_STARTED" = "DEPLOYMENT_STARTED"
  inline val DEPLOYMENT_COMPLETED: "DEPLOYMENT_COMPLETED" = "DEPLOYMENT_COMPLETED"

  inline def values: js.Array[DeploymentEventType] = js.Array(PERCENTAGE_UPDATED, ROLLBACK_STARTED, ROLLBACK_COMPLETED, BAKE_TIME_STARTED, DEPLOYMENT_STARTED, DEPLOYMENT_COMPLETED)
}

type DeploymentState = "BAKING" | "VALIDATING" | "DEPLOYING" | "COMPLETE" | "ROLLING_BACK" | "ROLLED_BACK"
object DeploymentState {
  inline val BAKING: "BAKING" = "BAKING"
  inline val VALIDATING: "VALIDATING" = "VALIDATING"
  inline val DEPLOYING: "DEPLOYING" = "DEPLOYING"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val ROLLING_BACK: "ROLLING_BACK" = "ROLLING_BACK"
  inline val ROLLED_BACK: "ROLLED_BACK" = "ROLLED_BACK"

  inline def values: js.Array[DeploymentState] = js.Array(BAKING, VALIDATING, DEPLOYING, COMPLETE, ROLLING_BACK, ROLLED_BACK)
}

type EnvironmentState = "READY_FOR_DEPLOYMENT" | "DEPLOYING" | "ROLLING_BACK" | "ROLLED_BACK"
object EnvironmentState {
  inline val READY_FOR_DEPLOYMENT: "READY_FOR_DEPLOYMENT" = "READY_FOR_DEPLOYMENT"
  inline val DEPLOYING: "DEPLOYING" = "DEPLOYING"
  inline val ROLLING_BACK: "ROLLING_BACK" = "ROLLING_BACK"
  inline val ROLLED_BACK: "ROLLED_BACK" = "ROLLED_BACK"

  inline def values: js.Array[EnvironmentState] = js.Array(READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK, ROLLED_BACK)
}

type GrowthType = "LINEAR" | "EXPONENTIAL"
object GrowthType {
  inline val LINEAR: "LINEAR" = "LINEAR"
  inline val EXPONENTIAL: "EXPONENTIAL" = "EXPONENTIAL"

  inline def values: js.Array[GrowthType] = js.Array(LINEAR, EXPONENTIAL)
}

type ReplicateTo = "NONE" | "SSM_DOCUMENT"
object ReplicateTo {
  inline val NONE: "NONE" = "NONE"
  inline val SSM_DOCUMENT: "SSM_DOCUMENT" = "SSM_DOCUMENT"

  inline def values: js.Array[ReplicateTo] = js.Array(NONE, SSM_DOCUMENT)
}

type TriggeredBy = "USER" | "APPCONFIG" | "CLOUDWATCH_ALARM" | "INTERNAL_ERROR"
object TriggeredBy {
  inline val USER: "USER" = "USER"
  inline val APPCONFIG: "APPCONFIG" = "APPCONFIG"
  inline val CLOUDWATCH_ALARM: "CLOUDWATCH_ALARM" = "CLOUDWATCH_ALARM"
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"

  inline def values: js.Array[TriggeredBy] = js.Array(USER, APPCONFIG, CLOUDWATCH_ALARM, INTERNAL_ERROR)
}

type ValidatorType = "JSON_SCHEMA" | "LAMBDA"
object ValidatorType {
  inline val JSON_SCHEMA: "JSON_SCHEMA" = "JSON_SCHEMA"
  inline val LAMBDA: "LAMBDA" = "LAMBDA"

  inline def values: js.Array[ValidatorType] = js.Array(JSON_SCHEMA, LAMBDA)
}
