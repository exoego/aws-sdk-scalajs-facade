package facade.amazonaws.services.sagemakeredge

import scalajs.js

type ChecksumType = "SHA1"
object ChecksumType {
  inline val SHA1: "SHA1" = "SHA1"

  inline def values: js.Array[ChecksumType] = js.Array(SHA1)
}

type DeploymentStatus = "SUCCESS" | "FAIL"
object DeploymentStatus {
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAIL: "FAIL" = "FAIL"

  inline def values: js.Array[DeploymentStatus] = js.Array(SUCCESS, FAIL)
}

type DeploymentType = "Model"
object DeploymentType {
  inline val Model: "Model" = "Model"

  inline def values: js.Array[DeploymentType] = js.Array(Model)
}

type FailureHandlingPolicy = "ROLLBACK_ON_FAILURE" | "DO_NOTHING"
object FailureHandlingPolicy {
  inline val ROLLBACK_ON_FAILURE: "ROLLBACK_ON_FAILURE" = "ROLLBACK_ON_FAILURE"
  inline val DO_NOTHING: "DO_NOTHING" = "DO_NOTHING"

  inline def values: js.Array[FailureHandlingPolicy] = js.Array(ROLLBACK_ON_FAILURE, DO_NOTHING)
}

type ModelState = "DEPLOY" | "UNDEPLOY"
object ModelState {
  inline val DEPLOY: "DEPLOY" = "DEPLOY"
  inline val UNDEPLOY: "UNDEPLOY" = "UNDEPLOY"

  inline def values: js.Array[ModelState] = js.Array(DEPLOY, UNDEPLOY)
}
