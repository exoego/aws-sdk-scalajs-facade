package facade.amazonaws.services.emrcontainers

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ContainerProviderType extends js.Any
object ContainerProviderType {
  val EKS = "EKS".asInstanceOf[ContainerProviderType]

  @inline def values = js.Array(EKS)
}

@js.native
sealed trait EndpointState extends js.Any
object EndpointState {
  val CREATING = "CREATING".asInstanceOf[EndpointState]
  val ACTIVE = "ACTIVE".asInstanceOf[EndpointState]
  val TERMINATING = "TERMINATING".asInstanceOf[EndpointState]
  val TERMINATED = "TERMINATED".asInstanceOf[EndpointState]
  val TERMINATED_WITH_ERRORS = "TERMINATED_WITH_ERRORS".asInstanceOf[EndpointState]

  @inline def values = js.Array(CREATING, ACTIVE, TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS)
}

@js.native
sealed trait FailureReason extends js.Any
object FailureReason {
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[FailureReason]
  val USER_ERROR = "USER_ERROR".asInstanceOf[FailureReason]
  val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[FailureReason]
  val CLUSTER_UNAVAILABLE = "CLUSTER_UNAVAILABLE".asInstanceOf[FailureReason]

  @inline def values = js.Array(INTERNAL_ERROR, USER_ERROR, VALIDATION_ERROR, CLUSTER_UNAVAILABLE)
}

@js.native
sealed trait JobRunState extends js.Any
object JobRunState {
  val PENDING = "PENDING".asInstanceOf[JobRunState]
  val SUBMITTED = "SUBMITTED".asInstanceOf[JobRunState]
  val RUNNING = "RUNNING".asInstanceOf[JobRunState]
  val FAILED = "FAILED".asInstanceOf[JobRunState]
  val CANCELLED = "CANCELLED".asInstanceOf[JobRunState]
  val CANCEL_PENDING = "CANCEL_PENDING".asInstanceOf[JobRunState]
  val COMPLETED = "COMPLETED".asInstanceOf[JobRunState]

  @inline def values = js.Array(PENDING, SUBMITTED, RUNNING, FAILED, CANCELLED, CANCEL_PENDING, COMPLETED)
}

@js.native
sealed trait PersistentAppUI extends js.Any
object PersistentAppUI {
  val ENABLED = "ENABLED".asInstanceOf[PersistentAppUI]
  val DISABLED = "DISABLED".asInstanceOf[PersistentAppUI]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait VirtualClusterState extends js.Any
object VirtualClusterState {
  val RUNNING = "RUNNING".asInstanceOf[VirtualClusterState]
  val TERMINATING = "TERMINATING".asInstanceOf[VirtualClusterState]
  val TERMINATED = "TERMINATED".asInstanceOf[VirtualClusterState]
  val ARRESTED = "ARRESTED".asInstanceOf[VirtualClusterState]

  @inline def values = js.Array(RUNNING, TERMINATING, TERMINATED, ARRESTED)
}

