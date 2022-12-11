package facade.amazonaws.services.sagemakeredge

import scalajs.js

@js.native
sealed trait ChecksumType extends js.Any
object ChecksumType {
  val SHA1 = "SHA1".asInstanceOf[ChecksumType]

  @inline def values: js.Array[ChecksumType] = js.Array(SHA1)
}

@js.native
sealed trait DeploymentStatus extends js.Any
object DeploymentStatus {
  val SUCCESS = "SUCCESS".asInstanceOf[DeploymentStatus]
  val FAIL = "FAIL".asInstanceOf[DeploymentStatus]

  @inline def values: js.Array[DeploymentStatus] = js.Array(SUCCESS, FAIL)
}

@js.native
sealed trait DeploymentType extends js.Any
object DeploymentType {
  val Model = "Model".asInstanceOf[DeploymentType]

  @inline def values: js.Array[DeploymentType] = js.Array(Model)
}

@js.native
sealed trait FailureHandlingPolicy extends js.Any
object FailureHandlingPolicy {
  val ROLLBACK_ON_FAILURE = "ROLLBACK_ON_FAILURE".asInstanceOf[FailureHandlingPolicy]
  val DO_NOTHING = "DO_NOTHING".asInstanceOf[FailureHandlingPolicy]

  @inline def values: js.Array[FailureHandlingPolicy] = js.Array(ROLLBACK_ON_FAILURE, DO_NOTHING)
}

@js.native
sealed trait ModelState extends js.Any
object ModelState {
  val DEPLOY = "DEPLOY".asInstanceOf[ModelState]
  val UNDEPLOY = "UNDEPLOY".asInstanceOf[ModelState]

  @inline def values: js.Array[ModelState] = js.Array(DEPLOY, UNDEPLOY)
}
