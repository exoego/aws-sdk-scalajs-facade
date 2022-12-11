package facade.amazonaws.services.gamesparks

import scalajs.js

@js.native
sealed trait DeploymentAction extends js.Any
object DeploymentAction {
  val DEPLOY = "DEPLOY".asInstanceOf[DeploymentAction]
  val UNDEPLOY = "UNDEPLOY".asInstanceOf[DeploymentAction]

  @inline def values: js.Array[DeploymentAction] = js.Array(DEPLOY, UNDEPLOY)
}

@js.native
sealed trait DeploymentState extends js.Any
object DeploymentState {
  val PENDING = "PENDING".asInstanceOf[DeploymentState]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DeploymentState]
  val COMPLETED = "COMPLETED".asInstanceOf[DeploymentState]
  val FAILED = "FAILED".asInstanceOf[DeploymentState]

  @inline def values: js.Array[DeploymentState] = js.Array(PENDING, IN_PROGRESS, COMPLETED, FAILED)
}

@js.native
sealed trait GameState extends js.Any
object GameState {
  val ACTIVE = "ACTIVE".asInstanceOf[GameState]
  val DELETING = "DELETING".asInstanceOf[GameState]

  @inline def values: js.Array[GameState] = js.Array(ACTIVE, DELETING)
}

@js.native
sealed trait GeneratedCodeJobState extends js.Any
object GeneratedCodeJobState {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[GeneratedCodeJobState]
  val COMPLETED = "COMPLETED".asInstanceOf[GeneratedCodeJobState]
  val FAILED = "FAILED".asInstanceOf[GeneratedCodeJobState]
  val PENDING = "PENDING".asInstanceOf[GeneratedCodeJobState]

  @inline def values: js.Array[GeneratedCodeJobState] = js.Array(IN_PROGRESS, COMPLETED, FAILED, PENDING)
}

@js.native
sealed trait Operation extends js.Any
object Operation {
  val ADD = "ADD".asInstanceOf[Operation]
  val REMOVE = "REMOVE".asInstanceOf[Operation]
  val REPLACE = "REPLACE".asInstanceOf[Operation]

  @inline def values: js.Array[Operation] = js.Array(ADD, REMOVE, REPLACE)
}

@js.native
sealed trait ResultCode extends js.Any
object ResultCode {
  val SUCCESS = "SUCCESS".asInstanceOf[ResultCode]
  val INVALID_ROLE_FAILURE = "INVALID_ROLE_FAILURE".asInstanceOf[ResultCode]
  val UNSPECIFIED_FAILURE = "UNSPECIFIED_FAILURE".asInstanceOf[ResultCode]

  @inline def values: js.Array[ResultCode] = js.Array(SUCCESS, INVALID_ROLE_FAILURE, UNSPECIFIED_FAILURE)
}

@js.native
sealed trait StageState extends js.Any
object StageState {
  val ACTIVE = "ACTIVE".asInstanceOf[StageState]
  val DELETING = "DELETING".asInstanceOf[StageState]

  @inline def values: js.Array[StageState] = js.Array(ACTIVE, DELETING)
}
