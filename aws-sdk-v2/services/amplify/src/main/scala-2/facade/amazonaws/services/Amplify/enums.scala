package facade.amazonaws.services.amplify

import scalajs.js

@js.native
sealed trait DomainStatus extends js.Any
object DomainStatus {
  val PENDING_VERIFICATION = "PENDING_VERIFICATION".asInstanceOf[DomainStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DomainStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[DomainStatus]
  val PENDING_DEPLOYMENT = "PENDING_DEPLOYMENT".asInstanceOf[DomainStatus]
  val FAILED = "FAILED".asInstanceOf[DomainStatus]
  val CREATING = "CREATING".asInstanceOf[DomainStatus]
  val REQUESTING_CERTIFICATE = "REQUESTING_CERTIFICATE".asInstanceOf[DomainStatus]
  val UPDATING = "UPDATING".asInstanceOf[DomainStatus]

  @inline def values: js.Array[DomainStatus] = js.Array(PENDING_VERIFICATION, IN_PROGRESS, AVAILABLE, PENDING_DEPLOYMENT, FAILED, CREATING, REQUESTING_CERTIFICATE, UPDATING)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val PENDING = "PENDING".asInstanceOf[JobStatus]
  val PROVISIONING = "PROVISIONING".asInstanceOf[JobStatus]
  val RUNNING = "RUNNING".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]
  val SUCCEED = "SUCCEED".asInstanceOf[JobStatus]
  val CANCELLING = "CANCELLING".asInstanceOf[JobStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED, CANCELLING, CANCELLED)
}

@js.native
sealed trait JobType extends js.Any
object JobType {
  val RELEASE = "RELEASE".asInstanceOf[JobType]
  val RETRY = "RETRY".asInstanceOf[JobType]
  val MANUAL = "MANUAL".asInstanceOf[JobType]
  val WEB_HOOK = "WEB_HOOK".asInstanceOf[JobType]

  @inline def values: js.Array[JobType] = js.Array(RELEASE, RETRY, MANUAL, WEB_HOOK)
}

@js.native
sealed trait Platform extends js.Any
object Platform {
  val WEB = "WEB".asInstanceOf[Platform]
  val WEB_DYNAMIC = "WEB_DYNAMIC".asInstanceOf[Platform]
  val WEB_COMPUTE = "WEB_COMPUTE".asInstanceOf[Platform]

  @inline def values: js.Array[Platform] = js.Array(WEB, WEB_DYNAMIC, WEB_COMPUTE)
}

@js.native
sealed trait RepositoryCloneMethod extends js.Any
object RepositoryCloneMethod {
  val SSH = "SSH".asInstanceOf[RepositoryCloneMethod]
  val TOKEN = "TOKEN".asInstanceOf[RepositoryCloneMethod]
  val SIGV4 = "SIGV4".asInstanceOf[RepositoryCloneMethod]

  @inline def values: js.Array[RepositoryCloneMethod] = js.Array(SSH, TOKEN, SIGV4)
}

@js.native
sealed trait Stage extends js.Any
object Stage {
  val PRODUCTION = "PRODUCTION".asInstanceOf[Stage]
  val BETA = "BETA".asInstanceOf[Stage]
  val DEVELOPMENT = "DEVELOPMENT".asInstanceOf[Stage]
  val EXPERIMENTAL = "EXPERIMENTAL".asInstanceOf[Stage]
  val PULL_REQUEST = "PULL_REQUEST".asInstanceOf[Stage]

  @inline def values: js.Array[Stage] = js.Array(PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL, PULL_REQUEST)
}
