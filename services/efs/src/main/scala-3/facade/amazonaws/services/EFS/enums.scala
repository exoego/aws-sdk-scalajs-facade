package facade.amazonaws.services.efs

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait LifeCycleState extends js.Any
object LifeCycleState {
  val creating = "creating".asInstanceOf[LifeCycleState]
  val available = "available".asInstanceOf[LifeCycleState]
  val updating = "updating".asInstanceOf[LifeCycleState]
  val deleting = "deleting".asInstanceOf[LifeCycleState]
  val deleted = "deleted".asInstanceOf[LifeCycleState]
  val error = "error".asInstanceOf[LifeCycleState]

  @inline def values = js.Array(creating, available, updating, deleting, deleted, error)
}

@js.native
sealed trait PerformanceMode extends js.Any
object PerformanceMode {
  val generalPurpose = "generalPurpose".asInstanceOf[PerformanceMode]
  val maxIO = "maxIO".asInstanceOf[PerformanceMode]

  @inline def values = js.Array(generalPurpose, maxIO)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val ENABLED = "ENABLED".asInstanceOf[Status]
  val ENABLING = "ENABLING".asInstanceOf[Status]
  val DISABLED = "DISABLED".asInstanceOf[Status]
  val DISABLING = "DISABLING".asInstanceOf[Status]

  @inline def values = js.Array(ENABLED, ENABLING, DISABLED, DISABLING)
}

@js.native
sealed trait ThroughputMode extends js.Any
object ThroughputMode {
  val bursting = "bursting".asInstanceOf[ThroughputMode]
  val provisioned = "provisioned".asInstanceOf[ThroughputMode]

  @inline def values = js.Array(bursting, provisioned)
}

@js.native
sealed trait TransitionToIARules extends js.Any
object TransitionToIARules {
  val AFTER_7_DAYS = "AFTER_7_DAYS".asInstanceOf[TransitionToIARules]
  val AFTER_14_DAYS = "AFTER_14_DAYS".asInstanceOf[TransitionToIARules]
  val AFTER_30_DAYS = "AFTER_30_DAYS".asInstanceOf[TransitionToIARules]
  val AFTER_60_DAYS = "AFTER_60_DAYS".asInstanceOf[TransitionToIARules]
  val AFTER_90_DAYS = "AFTER_90_DAYS".asInstanceOf[TransitionToIARules]

  @inline def values = js.Array(AFTER_7_DAYS, AFTER_14_DAYS, AFTER_30_DAYS, AFTER_60_DAYS, AFTER_90_DAYS)
}
