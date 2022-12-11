package facade.amazonaws.services.gamesparks

import scalajs.js

type DeploymentAction = "DEPLOY" | "UNDEPLOY"
object DeploymentAction {
  inline val DEPLOY: "DEPLOY" = "DEPLOY"
  inline val UNDEPLOY: "UNDEPLOY" = "UNDEPLOY"

  inline def values: js.Array[DeploymentAction] = js.Array(DEPLOY, UNDEPLOY)
}

type DeploymentState = "PENDING" | "IN_PROGRESS" | "COMPLETED" | "FAILED"
object DeploymentState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[DeploymentState] = js.Array(PENDING, IN_PROGRESS, COMPLETED, FAILED)
}

type GameState = "ACTIVE" | "DELETING"
object GameState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[GameState] = js.Array(ACTIVE, DELETING)
}

type GeneratedCodeJobState = "IN_PROGRESS" | "COMPLETED" | "FAILED" | "PENDING"
object GeneratedCodeJobState {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[GeneratedCodeJobState] = js.Array(IN_PROGRESS, COMPLETED, FAILED, PENDING)
}

type Operation = "ADD" | "REMOVE" | "REPLACE"
object Operation {
  inline val ADD: "ADD" = "ADD"
  inline val REMOVE: "REMOVE" = "REMOVE"
  inline val REPLACE: "REPLACE" = "REPLACE"

  inline def values: js.Array[Operation] = js.Array(ADD, REMOVE, REPLACE)
}

type ResultCode = "SUCCESS" | "INVALID_ROLE_FAILURE" | "UNSPECIFIED_FAILURE"
object ResultCode {
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val INVALID_ROLE_FAILURE: "INVALID_ROLE_FAILURE" = "INVALID_ROLE_FAILURE"
  inline val UNSPECIFIED_FAILURE: "UNSPECIFIED_FAILURE" = "UNSPECIFIED_FAILURE"

  inline def values: js.Array[ResultCode] = js.Array(SUCCESS, INVALID_ROLE_FAILURE, UNSPECIFIED_FAILURE)
}

type StageState = "ACTIVE" | "DELETING"
object StageState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[StageState] = js.Array(ACTIVE, DELETING)
}
