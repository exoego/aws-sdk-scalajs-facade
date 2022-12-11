package facade.amazonaws.services.scheduler

import scalajs.js

type AssignPublicIp = "ENABLED" | "DISABLED"
object AssignPublicIp {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AssignPublicIp] = js.Array(ENABLED, DISABLED)
}

type FlexibleTimeWindowMode = "OFF" | "FLEXIBLE"
object FlexibleTimeWindowMode {
  inline val OFF: "OFF" = "OFF"
  inline val FLEXIBLE: "FLEXIBLE" = "FLEXIBLE"

  inline def values: js.Array[FlexibleTimeWindowMode] = js.Array(OFF, FLEXIBLE)
}

type LaunchType = "EC2" | "FARGATE" | "EXTERNAL"
object LaunchType {
  inline val EC2: "EC2" = "EC2"
  inline val FARGATE: "FARGATE" = "FARGATE"
  inline val EXTERNAL: "EXTERNAL" = "EXTERNAL"

  inline def values: js.Array[LaunchType] = js.Array(EC2, FARGATE, EXTERNAL)
}

type PlacementConstraintType = "distinctInstance" | "memberOf"
object PlacementConstraintType {
  inline val distinctInstance: "distinctInstance" = "distinctInstance"
  inline val memberOf: "memberOf" = "memberOf"

  inline def values: js.Array[PlacementConstraintType] = js.Array(distinctInstance, memberOf)
}

type PlacementStrategyType = "random" | "spread" | "binpack"
object PlacementStrategyType {
  inline val random: "random" = "random"
  inline val spread: "spread" = "spread"
  inline val binpack: "binpack" = "binpack"

  inline def values: js.Array[PlacementStrategyType] = js.Array(random, spread, binpack)
}

type PropagateTags = "TASK_DEFINITION"
object PropagateTags {
  inline val TASK_DEFINITION: "TASK_DEFINITION" = "TASK_DEFINITION"

  inline def values: js.Array[PropagateTags] = js.Array(TASK_DEFINITION)
}

type ScheduleGroupState = "ACTIVE" | "DELETING"
object ScheduleGroupState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[ScheduleGroupState] = js.Array(ACTIVE, DELETING)
}

type ScheduleState = "ENABLED" | "DISABLED"
object ScheduleState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ScheduleState] = js.Array(ENABLED, DISABLED)
}
