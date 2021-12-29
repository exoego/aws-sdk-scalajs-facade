package facade.amazonaws.services.autoscaling

import scalajs._

type InstanceMetadataEndpointState = "disabled" | "enabled"
object InstanceMetadataEndpointState {
  val disabled: "disabled" = "disabled"
  val enabled: "enabled" = "enabled"

  @inline def values = js.Array[InstanceMetadataEndpointState](disabled, enabled)
}

type InstanceMetadataHttpTokensState = "optional" | "required"
object InstanceMetadataHttpTokensState {
  val optional: "optional" = "optional"
  val required: "required" = "required"

  @inline def values = js.Array[InstanceMetadataHttpTokensState](optional, required)
}

type InstanceRefreshStatus = "Pending" | "InProgress" | "Successful" | "Failed" | "Cancelling" | "Cancelled"
object InstanceRefreshStatus {
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Successful: "Successful" = "Successful"
  val Failed: "Failed" = "Failed"
  val Cancelling: "Cancelling" = "Cancelling"
  val Cancelled: "Cancelled" = "Cancelled"

  @inline def values = js.Array[InstanceRefreshStatus](Pending, InProgress, Successful, Failed, Cancelling, Cancelled)
}

type LifecycleState = "Pending" | "Pending:Wait" | "Pending:Proceed" | "Quarantined" | "InService" | "Terminating" | "Terminating:Wait" | "Terminating:Proceed" | "Terminated" | "Detaching" | "Detached" | "EnteringStandby" | "Standby" | "Warmed:Pending" | "Warmed:Pending:Wait" | "Warmed:Pending:Proceed" | "Warmed:Terminating" | "Warmed:Terminating:Wait" | "Warmed:Terminating:Proceed" | "Warmed:Terminated" | "Warmed:Stopped" | "Warmed:Running"
object LifecycleState {
  val Pending: "Pending" = "Pending"
  val `Pending:Wait`: "Pending:Wait" = "Pending:Wait"
  val `Pending:Proceed`: "Pending:Proceed" = "Pending:Proceed"
  val Quarantined: "Quarantined" = "Quarantined"
  val InService: "InService" = "InService"
  val Terminating: "Terminating" = "Terminating"
  val `Terminating:Wait`: "Terminating:Wait" = "Terminating:Wait"
  val `Terminating:Proceed`: "Terminating:Proceed" = "Terminating:Proceed"
  val Terminated: "Terminated" = "Terminated"
  val Detaching: "Detaching" = "Detaching"
  val Detached: "Detached" = "Detached"
  val EnteringStandby: "EnteringStandby" = "EnteringStandby"
  val Standby: "Standby" = "Standby"
  val `Warmed:Pending`: "Warmed:Pending" = "Warmed:Pending"
  val `Warmed:Pending:Wait`: "Warmed:Pending:Wait" = "Warmed:Pending:Wait"
  val `Warmed:Pending:Proceed`: "Warmed:Pending:Proceed" = "Warmed:Pending:Proceed"
  val `Warmed:Terminating`: "Warmed:Terminating" = "Warmed:Terminating"
  val `Warmed:Terminating:Wait`: "Warmed:Terminating:Wait" = "Warmed:Terminating:Wait"
  val `Warmed:Terminating:Proceed`: "Warmed:Terminating:Proceed" = "Warmed:Terminating:Proceed"
  val `Warmed:Terminated`: "Warmed:Terminated" = "Warmed:Terminated"
  val `Warmed:Stopped`: "Warmed:Stopped" = "Warmed:Stopped"
  val `Warmed:Running`: "Warmed:Running" = "Warmed:Running"

  @inline def values = js.Array[LifecycleState](
    Pending,
    `Pending:Wait`,
    `Pending:Proceed`,
    Quarantined,
    InService,
    Terminating,
    `Terminating:Wait`,
    `Terminating:Proceed`,
    Terminated,
    Detaching,
    Detached,
    EnteringStandby,
    Standby,
    `Warmed:Pending`,
    `Warmed:Pending:Wait`,
    `Warmed:Pending:Proceed`,
    `Warmed:Terminating`,
    `Warmed:Terminating:Wait`,
    `Warmed:Terminating:Proceed`,
    `Warmed:Terminated`,
    `Warmed:Stopped`,
    `Warmed:Running`
  )
}

type MetricStatistic = "Average" | "Minimum" | "Maximum" | "SampleCount" | "Sum"
object MetricStatistic {
  val Average: "Average" = "Average"
  val Minimum: "Minimum" = "Minimum"
  val Maximum: "Maximum" = "Maximum"
  val SampleCount: "SampleCount" = "SampleCount"
  val Sum: "Sum" = "Sum"

  @inline def values = js.Array[MetricStatistic](Average, Minimum, Maximum, SampleCount, Sum)
}

type MetricType = "ASGAverageCPUUtilization" | "ASGAverageNetworkIn" | "ASGAverageNetworkOut" | "ALBRequestCountPerTarget"
object MetricType {
  val ASGAverageCPUUtilization: "ASGAverageCPUUtilization" = "ASGAverageCPUUtilization"
  val ASGAverageNetworkIn: "ASGAverageNetworkIn" = "ASGAverageNetworkIn"
  val ASGAverageNetworkOut: "ASGAverageNetworkOut" = "ASGAverageNetworkOut"
  val ALBRequestCountPerTarget: "ALBRequestCountPerTarget" = "ALBRequestCountPerTarget"

  @inline def values = js.Array[MetricType](ASGAverageCPUUtilization, ASGAverageNetworkIn, ASGAverageNetworkOut, ALBRequestCountPerTarget)
}

type RefreshStrategy = "Rolling"
object RefreshStrategy {
  val Rolling: "Rolling" = "Rolling"

  @inline def values = js.Array[RefreshStrategy](Rolling)
}

type ScalingActivityStatusCode = "PendingSpotBidPlacement" | "WaitingForSpotInstanceRequestId" | "WaitingForSpotInstanceId" | "WaitingForInstanceId" | "PreInService" | "InProgress" | "WaitingForELBConnectionDraining" | "MidLifecycleAction" | "WaitingForInstanceWarmup" | "Successful" | "Failed" | "Cancelled"
object ScalingActivityStatusCode {
  val PendingSpotBidPlacement: "PendingSpotBidPlacement" = "PendingSpotBidPlacement"
  val WaitingForSpotInstanceRequestId: "WaitingForSpotInstanceRequestId" = "WaitingForSpotInstanceRequestId"
  val WaitingForSpotInstanceId: "WaitingForSpotInstanceId" = "WaitingForSpotInstanceId"
  val WaitingForInstanceId: "WaitingForInstanceId" = "WaitingForInstanceId"
  val PreInService: "PreInService" = "PreInService"
  val InProgress: "InProgress" = "InProgress"
  val WaitingForELBConnectionDraining: "WaitingForELBConnectionDraining" = "WaitingForELBConnectionDraining"
  val MidLifecycleAction: "MidLifecycleAction" = "MidLifecycleAction"
  val WaitingForInstanceWarmup: "WaitingForInstanceWarmup" = "WaitingForInstanceWarmup"
  val Successful: "Successful" = "Successful"
  val Failed: "Failed" = "Failed"
  val Cancelled: "Cancelled" = "Cancelled"

  @inline def values = js.Array[ScalingActivityStatusCode](
    PendingSpotBidPlacement,
    WaitingForSpotInstanceRequestId,
    WaitingForSpotInstanceId,
    WaitingForInstanceId,
    PreInService,
    InProgress,
    WaitingForELBConnectionDraining,
    MidLifecycleAction,
    WaitingForInstanceWarmup,
    Successful,
    Failed,
    Cancelled
  )
}

type WarmPoolState = "Stopped" | "Running"
object WarmPoolState {
  val Stopped: "Stopped" = "Stopped"
  val Running: "Running" = "Running"

  @inline def values = js.Array[WarmPoolState](Stopped, Running)
}

type WarmPoolStatus = "PendingDelete"
object WarmPoolStatus {
  val PendingDelete: "PendingDelete" = "PendingDelete"

  @inline def values = js.Array[WarmPoolStatus](PendingDelete)
}
