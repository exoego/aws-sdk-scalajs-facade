package facade.amazonaws.services.emrserverless

import scalajs.js

@js.native
sealed trait ApplicationState extends js.Any
object ApplicationState {
  val CREATING = "CREATING".asInstanceOf[ApplicationState]
  val CREATED = "CREATED".asInstanceOf[ApplicationState]
  val STARTING = "STARTING".asInstanceOf[ApplicationState]
  val STARTED = "STARTED".asInstanceOf[ApplicationState]
  val STOPPING = "STOPPING".asInstanceOf[ApplicationState]
  val STOPPED = "STOPPED".asInstanceOf[ApplicationState]
  val TERMINATED = "TERMINATED".asInstanceOf[ApplicationState]

  @inline def values: js.Array[ApplicationState] = js.Array(CREATING, CREATED, STARTING, STARTED, STOPPING, STOPPED, TERMINATED)
}

@js.native
sealed trait Architecture extends js.Any
object Architecture {
  val ARM64 = "ARM64".asInstanceOf[Architecture]
  val X86_64 = "X86_64".asInstanceOf[Architecture]

  @inline def values: js.Array[Architecture] = js.Array(ARM64, X86_64)
}

@js.native
sealed trait JobRunState extends js.Any
object JobRunState {
  val SUBMITTED = "SUBMITTED".asInstanceOf[JobRunState]
  val PENDING = "PENDING".asInstanceOf[JobRunState]
  val SCHEDULED = "SCHEDULED".asInstanceOf[JobRunState]
  val RUNNING = "RUNNING".asInstanceOf[JobRunState]
  val SUCCESS = "SUCCESS".asInstanceOf[JobRunState]
  val FAILED = "FAILED".asInstanceOf[JobRunState]
  val CANCELLING = "CANCELLING".asInstanceOf[JobRunState]
  val CANCELLED = "CANCELLED".asInstanceOf[JobRunState]

  @inline def values: js.Array[JobRunState] = js.Array(SUBMITTED, PENDING, SCHEDULED, RUNNING, SUCCESS, FAILED, CANCELLING, CANCELLED)
}
