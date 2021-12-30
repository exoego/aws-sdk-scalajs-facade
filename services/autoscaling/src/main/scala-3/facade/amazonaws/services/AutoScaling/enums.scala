package facade.amazonaws.services.autoscaling

import scalajs.js

type InstanceMetadataEndpointState = "disabled" | "enabled"
object InstanceMetadataEndpointState {
  inline val disabled: "disabled" = "disabled"
  inline val enabled: "enabled" = "enabled"

  inline def values: js.Array[InstanceMetadataEndpointState] = js.Array(disabled, enabled)
}

type InstanceMetadataHttpTokensState = "optional" | "required"
object InstanceMetadataHttpTokensState {
  inline val optional: "optional" = "optional"
  inline val required: "required" = "required"

  inline def values: js.Array[InstanceMetadataHttpTokensState] = js.Array(optional, required)
}

type InstanceRefreshStatus = "Pending" | "InProgress" | "Successful" | "Failed" | "Cancelling" | "Cancelled"
object InstanceRefreshStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Successful: "Successful" = "Successful"
  inline val Failed: "Failed" = "Failed"
  inline val Cancelling: "Cancelling" = "Cancelling"
  inline val Cancelled: "Cancelled" = "Cancelled"

  inline def values: js.Array[InstanceRefreshStatus] = js.Array(Pending, InProgress, Successful, Failed, Cancelling, Cancelled)
}

type LifecycleState = "Pending" | "Pending:Wait" | "Pending:Proceed" | "Quarantined" | "InService" | "Terminating" | "Terminating:Wait" | "Terminating:Proceed" | "Terminated" | "Detaching" | "Detached" | "EnteringStandby" | "Standby" | "Warmed:Pending" | "Warmed:Pending:Wait" | "Warmed:Pending:Proceed" | "Warmed:Terminating" | "Warmed:Terminating:Wait" | "Warmed:Terminating:Proceed" | "Warmed:Terminated" | "Warmed:Stopped" | "Warmed:Running"
object LifecycleState {
  inline val Pending: "Pending" = "Pending"
  inline val `Pending:Wait`: "Pending:Wait" = "Pending:Wait"
  inline val `Pending:Proceed`: "Pending:Proceed" = "Pending:Proceed"
  inline val Quarantined: "Quarantined" = "Quarantined"
  inline val InService: "InService" = "InService"
  inline val Terminating: "Terminating" = "Terminating"
  inline val `Terminating:Wait`: "Terminating:Wait" = "Terminating:Wait"
  inline val `Terminating:Proceed`: "Terminating:Proceed" = "Terminating:Proceed"
  inline val Terminated: "Terminated" = "Terminated"
  inline val Detaching: "Detaching" = "Detaching"
  inline val Detached: "Detached" = "Detached"
  inline val EnteringStandby: "EnteringStandby" = "EnteringStandby"
  inline val Standby: "Standby" = "Standby"
  inline val `Warmed:Pending`: "Warmed:Pending" = "Warmed:Pending"
  inline val `Warmed:Pending:Wait`: "Warmed:Pending:Wait" = "Warmed:Pending:Wait"
  inline val `Warmed:Pending:Proceed`: "Warmed:Pending:Proceed" = "Warmed:Pending:Proceed"
  inline val `Warmed:Terminating`: "Warmed:Terminating" = "Warmed:Terminating"
  inline val `Warmed:Terminating:Wait`: "Warmed:Terminating:Wait" = "Warmed:Terminating:Wait"
  inline val `Warmed:Terminating:Proceed`: "Warmed:Terminating:Proceed" = "Warmed:Terminating:Proceed"
  inline val `Warmed:Terminated`: "Warmed:Terminated" = "Warmed:Terminated"
  inline val `Warmed:Stopped`: "Warmed:Stopped" = "Warmed:Stopped"
  inline val `Warmed:Running`: "Warmed:Running" = "Warmed:Running"

  inline def values: js.Array[LifecycleState] = js.Array(
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
  inline val Average: "Average" = "Average"
  inline val Minimum: "Minimum" = "Minimum"
  inline val Maximum: "Maximum" = "Maximum"
  inline val SampleCount: "SampleCount" = "SampleCount"
  inline val Sum: "Sum" = "Sum"

  inline def values: js.Array[MetricStatistic] = js.Array(Average, Minimum, Maximum, SampleCount, Sum)
}

type MetricType = "ASGAverageCPUUtilization" | "ASGAverageNetworkIn" | "ASGAverageNetworkOut" | "ALBRequestCountPerTarget"
object MetricType {
  inline val ASGAverageCPUUtilization: "ASGAverageCPUUtilization" = "ASGAverageCPUUtilization"
  inline val ASGAverageNetworkIn: "ASGAverageNetworkIn" = "ASGAverageNetworkIn"
  inline val ASGAverageNetworkOut: "ASGAverageNetworkOut" = "ASGAverageNetworkOut"
  inline val ALBRequestCountPerTarget: "ALBRequestCountPerTarget" = "ALBRequestCountPerTarget"

  inline def values: js.Array[MetricType] = js.Array(ASGAverageCPUUtilization, ASGAverageNetworkIn, ASGAverageNetworkOut, ALBRequestCountPerTarget)
}

type RefreshStrategy = "Rolling"
object RefreshStrategy {
  inline val Rolling: "Rolling" = "Rolling"

  inline def values: js.Array[RefreshStrategy] = js.Array(Rolling)
}

type ScalingActivityStatusCode = "PendingSpotBidPlacement" | "WaitingForSpotInstanceRequestId" | "WaitingForSpotInstanceId" | "WaitingForInstanceId" | "PreInService" | "InProgress" | "WaitingForELBConnectionDraining" | "MidLifecycleAction" | "WaitingForInstanceWarmup" | "Successful" | "Failed" | "Cancelled"
object ScalingActivityStatusCode {
  inline val PendingSpotBidPlacement: "PendingSpotBidPlacement" = "PendingSpotBidPlacement"
  inline val WaitingForSpotInstanceRequestId: "WaitingForSpotInstanceRequestId" = "WaitingForSpotInstanceRequestId"
  inline val WaitingForSpotInstanceId: "WaitingForSpotInstanceId" = "WaitingForSpotInstanceId"
  inline val WaitingForInstanceId: "WaitingForInstanceId" = "WaitingForInstanceId"
  inline val PreInService: "PreInService" = "PreInService"
  inline val InProgress: "InProgress" = "InProgress"
  inline val WaitingForELBConnectionDraining: "WaitingForELBConnectionDraining" = "WaitingForELBConnectionDraining"
  inline val MidLifecycleAction: "MidLifecycleAction" = "MidLifecycleAction"
  inline val WaitingForInstanceWarmup: "WaitingForInstanceWarmup" = "WaitingForInstanceWarmup"
  inline val Successful: "Successful" = "Successful"
  inline val Failed: "Failed" = "Failed"
  inline val Cancelled: "Cancelled" = "Cancelled"

  inline def values: js.Array[ScalingActivityStatusCode] = js.Array(
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
  inline val Stopped: "Stopped" = "Stopped"
  inline val Running: "Running" = "Running"

  inline def values: js.Array[WarmPoolState] = js.Array(Stopped, Running)
}

type WarmPoolStatus = "PendingDelete"
object WarmPoolStatus {
  inline val PendingDelete: "PendingDelete" = "PendingDelete"

  inline def values: js.Array[WarmPoolStatus] = js.Array(PendingDelete)
}
