package facade.amazonaws.services.scheduler

import scalajs.js

@js.native
sealed trait AssignPublicIp extends js.Any
object AssignPublicIp {
  val ENABLED = "ENABLED".asInstanceOf[AssignPublicIp]
  val DISABLED = "DISABLED".asInstanceOf[AssignPublicIp]

  @inline def values: js.Array[AssignPublicIp] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait FlexibleTimeWindowMode extends js.Any
object FlexibleTimeWindowMode {
  val OFF = "OFF".asInstanceOf[FlexibleTimeWindowMode]
  val FLEXIBLE = "FLEXIBLE".asInstanceOf[FlexibleTimeWindowMode]

  @inline def values: js.Array[FlexibleTimeWindowMode] = js.Array(OFF, FLEXIBLE)
}

@js.native
sealed trait LaunchType extends js.Any
object LaunchType {
  val EC2 = "EC2".asInstanceOf[LaunchType]
  val FARGATE = "FARGATE".asInstanceOf[LaunchType]
  val EXTERNAL = "EXTERNAL".asInstanceOf[LaunchType]

  @inline def values: js.Array[LaunchType] = js.Array(EC2, FARGATE, EXTERNAL)
}

@js.native
sealed trait PlacementConstraintType extends js.Any
object PlacementConstraintType {
  val distinctInstance = "distinctInstance".asInstanceOf[PlacementConstraintType]
  val memberOf = "memberOf".asInstanceOf[PlacementConstraintType]

  @inline def values: js.Array[PlacementConstraintType] = js.Array(distinctInstance, memberOf)
}

@js.native
sealed trait PlacementStrategyType extends js.Any
object PlacementStrategyType {
  val random = "random".asInstanceOf[PlacementStrategyType]
  val spread = "spread".asInstanceOf[PlacementStrategyType]
  val binpack = "binpack".asInstanceOf[PlacementStrategyType]

  @inline def values: js.Array[PlacementStrategyType] = js.Array(random, spread, binpack)
}

@js.native
sealed trait PropagateTags extends js.Any
object PropagateTags {
  val TASK_DEFINITION = "TASK_DEFINITION".asInstanceOf[PropagateTags]

  @inline def values: js.Array[PropagateTags] = js.Array(TASK_DEFINITION)
}

@js.native
sealed trait ScheduleGroupState extends js.Any
object ScheduleGroupState {
  val ACTIVE = "ACTIVE".asInstanceOf[ScheduleGroupState]
  val DELETING = "DELETING".asInstanceOf[ScheduleGroupState]

  @inline def values: js.Array[ScheduleGroupState] = js.Array(ACTIVE, DELETING)
}

@js.native
sealed trait ScheduleState extends js.Any
object ScheduleState {
  val ENABLED = "ENABLED".asInstanceOf[ScheduleState]
  val DISABLED = "DISABLED".asInstanceOf[ScheduleState]

  @inline def values: js.Array[ScheduleState] = js.Array(ENABLED, DISABLED)
}
