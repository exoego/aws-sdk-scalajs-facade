package facade.amazonaws.services.autoscaling

import scalajs.js

@js.native
sealed trait InstanceMetadataEndpointState extends js.Any
object InstanceMetadataEndpointState {
  val disabled = "disabled".asInstanceOf[InstanceMetadataEndpointState]
  val enabled = "enabled".asInstanceOf[InstanceMetadataEndpointState]

  @inline def values: js.Array[InstanceMetadataEndpointState] = js.Array(disabled, enabled)
}

@js.native
sealed trait InstanceMetadataHttpTokensState extends js.Any
object InstanceMetadataHttpTokensState {
  val optional = "optional".asInstanceOf[InstanceMetadataHttpTokensState]
  val required = "required".asInstanceOf[InstanceMetadataHttpTokensState]

  @inline def values: js.Array[InstanceMetadataHttpTokensState] = js.Array(optional, required)
}

@js.native
sealed trait InstanceRefreshStatus extends js.Any
object InstanceRefreshStatus {
  val Pending = "Pending".asInstanceOf[InstanceRefreshStatus]
  val InProgress = "InProgress".asInstanceOf[InstanceRefreshStatus]
  val Successful = "Successful".asInstanceOf[InstanceRefreshStatus]
  val Failed = "Failed".asInstanceOf[InstanceRefreshStatus]
  val Cancelling = "Cancelling".asInstanceOf[InstanceRefreshStatus]
  val Cancelled = "Cancelled".asInstanceOf[InstanceRefreshStatus]

  @inline def values: js.Array[InstanceRefreshStatus] = js.Array(Pending, InProgress, Successful, Failed, Cancelling, Cancelled)
}

@js.native
sealed trait LifecycleState extends js.Any
object LifecycleState {
  val Pending = "Pending".asInstanceOf[LifecycleState]
  val `Pending:Wait` = "Pending:Wait".asInstanceOf[LifecycleState]
  val `Pending:Proceed` = "Pending:Proceed".asInstanceOf[LifecycleState]
  val Quarantined = "Quarantined".asInstanceOf[LifecycleState]
  val InService = "InService".asInstanceOf[LifecycleState]
  val Terminating = "Terminating".asInstanceOf[LifecycleState]
  val `Terminating:Wait` = "Terminating:Wait".asInstanceOf[LifecycleState]
  val `Terminating:Proceed` = "Terminating:Proceed".asInstanceOf[LifecycleState]
  val Terminated = "Terminated".asInstanceOf[LifecycleState]
  val Detaching = "Detaching".asInstanceOf[LifecycleState]
  val Detached = "Detached".asInstanceOf[LifecycleState]
  val EnteringStandby = "EnteringStandby".asInstanceOf[LifecycleState]
  val Standby = "Standby".asInstanceOf[LifecycleState]
  val `Warmed:Pending` = "Warmed:Pending".asInstanceOf[LifecycleState]
  val `Warmed:Pending:Wait` = "Warmed:Pending:Wait".asInstanceOf[LifecycleState]
  val `Warmed:Pending:Proceed` = "Warmed:Pending:Proceed".asInstanceOf[LifecycleState]
  val `Warmed:Terminating` = "Warmed:Terminating".asInstanceOf[LifecycleState]
  val `Warmed:Terminating:Wait` = "Warmed:Terminating:Wait".asInstanceOf[LifecycleState]
  val `Warmed:Terminating:Proceed` = "Warmed:Terminating:Proceed".asInstanceOf[LifecycleState]
  val `Warmed:Terminated` = "Warmed:Terminated".asInstanceOf[LifecycleState]
  val `Warmed:Stopped` = "Warmed:Stopped".asInstanceOf[LifecycleState]
  val `Warmed:Running` = "Warmed:Running".asInstanceOf[LifecycleState]

  @inline def values: js.Array[LifecycleState] = js.Array(
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

@js.native
sealed trait MetricStatistic extends js.Any
object MetricStatistic {
  val Average = "Average".asInstanceOf[MetricStatistic]
  val Minimum = "Minimum".asInstanceOf[MetricStatistic]
  val Maximum = "Maximum".asInstanceOf[MetricStatistic]
  val SampleCount = "SampleCount".asInstanceOf[MetricStatistic]
  val Sum = "Sum".asInstanceOf[MetricStatistic]

  @inline def values: js.Array[MetricStatistic] = js.Array(Average, Minimum, Maximum, SampleCount, Sum)
}

@js.native
sealed trait MetricType extends js.Any
object MetricType {
  val ASGAverageCPUUtilization = "ASGAverageCPUUtilization".asInstanceOf[MetricType]
  val ASGAverageNetworkIn = "ASGAverageNetworkIn".asInstanceOf[MetricType]
  val ASGAverageNetworkOut = "ASGAverageNetworkOut".asInstanceOf[MetricType]
  val ALBRequestCountPerTarget = "ALBRequestCountPerTarget".asInstanceOf[MetricType]

  @inline def values: js.Array[MetricType] = js.Array(ASGAverageCPUUtilization, ASGAverageNetworkIn, ASGAverageNetworkOut, ALBRequestCountPerTarget)
}

@js.native
sealed trait RefreshStrategy extends js.Any
object RefreshStrategy {
  val Rolling = "Rolling".asInstanceOf[RefreshStrategy]

  @inline def values: js.Array[RefreshStrategy] = js.Array(Rolling)
}

@js.native
sealed trait ScalingActivityStatusCode extends js.Any
object ScalingActivityStatusCode {
  val PendingSpotBidPlacement = "PendingSpotBidPlacement".asInstanceOf[ScalingActivityStatusCode]
  val WaitingForSpotInstanceRequestId = "WaitingForSpotInstanceRequestId".asInstanceOf[ScalingActivityStatusCode]
  val WaitingForSpotInstanceId = "WaitingForSpotInstanceId".asInstanceOf[ScalingActivityStatusCode]
  val WaitingForInstanceId = "WaitingForInstanceId".asInstanceOf[ScalingActivityStatusCode]
  val PreInService = "PreInService".asInstanceOf[ScalingActivityStatusCode]
  val InProgress = "InProgress".asInstanceOf[ScalingActivityStatusCode]
  val WaitingForELBConnectionDraining = "WaitingForELBConnectionDraining".asInstanceOf[ScalingActivityStatusCode]
  val MidLifecycleAction = "MidLifecycleAction".asInstanceOf[ScalingActivityStatusCode]
  val WaitingForInstanceWarmup = "WaitingForInstanceWarmup".asInstanceOf[ScalingActivityStatusCode]
  val Successful = "Successful".asInstanceOf[ScalingActivityStatusCode]
  val Failed = "Failed".asInstanceOf[ScalingActivityStatusCode]
  val Cancelled = "Cancelled".asInstanceOf[ScalingActivityStatusCode]

  @inline def values: js.Array[ScalingActivityStatusCode] = js.Array(
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

@js.native
sealed trait WarmPoolState extends js.Any
object WarmPoolState {
  val Stopped = "Stopped".asInstanceOf[WarmPoolState]
  val Running = "Running".asInstanceOf[WarmPoolState]

  @inline def values: js.Array[WarmPoolState] = js.Array(Stopped, Running)
}

@js.native
sealed trait WarmPoolStatus extends js.Any
object WarmPoolStatus {
  val PendingDelete = "PendingDelete".asInstanceOf[WarmPoolStatus]

  @inline def values: js.Array[WarmPoolStatus] = js.Array(PendingDelete)
}
