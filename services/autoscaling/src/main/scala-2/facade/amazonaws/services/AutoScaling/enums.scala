package facade.amazonaws.services.autoscaling

import scalajs.js

@js.native
sealed trait AcceleratorManufacturer extends js.Any
object AcceleratorManufacturer {
  val nvidia = "nvidia".asInstanceOf[AcceleratorManufacturer]
  val amd = "amd".asInstanceOf[AcceleratorManufacturer]
  val `amazon-web-services` = "amazon-web-services".asInstanceOf[AcceleratorManufacturer]
  val xilinx = "xilinx".asInstanceOf[AcceleratorManufacturer]

  @inline def values: js.Array[AcceleratorManufacturer] = js.Array(nvidia, amd, `amazon-web-services`, xilinx)
}

@js.native
sealed trait AcceleratorName extends js.Any
object AcceleratorName {
  val a100 = "a100".asInstanceOf[AcceleratorName]
  val v100 = "v100".asInstanceOf[AcceleratorName]
  val k80 = "k80".asInstanceOf[AcceleratorName]
  val t4 = "t4".asInstanceOf[AcceleratorName]
  val m60 = "m60".asInstanceOf[AcceleratorName]
  val `radeon-pro-v520` = "radeon-pro-v520".asInstanceOf[AcceleratorName]
  val vu9p = "vu9p".asInstanceOf[AcceleratorName]

  @inline def values: js.Array[AcceleratorName] = js.Array(a100, v100, k80, t4, m60, `radeon-pro-v520`, vu9p)
}

@js.native
sealed trait AcceleratorType extends js.Any
object AcceleratorType {
  val gpu = "gpu".asInstanceOf[AcceleratorType]
  val fpga = "fpga".asInstanceOf[AcceleratorType]
  val inference = "inference".asInstanceOf[AcceleratorType]

  @inline def values: js.Array[AcceleratorType] = js.Array(gpu, fpga, inference)
}

@js.native
sealed trait BareMetal extends js.Any
object BareMetal {
  val included = "included".asInstanceOf[BareMetal]
  val excluded = "excluded".asInstanceOf[BareMetal]
  val required = "required".asInstanceOf[BareMetal]

  @inline def values: js.Array[BareMetal] = js.Array(included, excluded, required)
}

@js.native
sealed trait BurstablePerformance extends js.Any
object BurstablePerformance {
  val included = "included".asInstanceOf[BurstablePerformance]
  val excluded = "excluded".asInstanceOf[BurstablePerformance]
  val required = "required".asInstanceOf[BurstablePerformance]

  @inline def values: js.Array[BurstablePerformance] = js.Array(included, excluded, required)
}

@js.native
sealed trait CpuManufacturer extends js.Any
object CpuManufacturer {
  val intel = "intel".asInstanceOf[CpuManufacturer]
  val amd = "amd".asInstanceOf[CpuManufacturer]
  val `amazon-web-services` = "amazon-web-services".asInstanceOf[CpuManufacturer]

  @inline def values: js.Array[CpuManufacturer] = js.Array(intel, amd, `amazon-web-services`)
}

@js.native
sealed trait InstanceGeneration extends js.Any
object InstanceGeneration {
  val current = "current".asInstanceOf[InstanceGeneration]
  val previous = "previous".asInstanceOf[InstanceGeneration]

  @inline def values: js.Array[InstanceGeneration] = js.Array(current, previous)
}

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
sealed trait LocalStorage extends js.Any
object LocalStorage {
  val included = "included".asInstanceOf[LocalStorage]
  val excluded = "excluded".asInstanceOf[LocalStorage]
  val required = "required".asInstanceOf[LocalStorage]

  @inline def values: js.Array[LocalStorage] = js.Array(included, excluded, required)
}

@js.native
sealed trait LocalStorageType extends js.Any
object LocalStorageType {
  val hdd = "hdd".asInstanceOf[LocalStorageType]
  val ssd = "ssd".asInstanceOf[LocalStorageType]

  @inline def values: js.Array[LocalStorageType] = js.Array(hdd, ssd)
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
sealed trait PredefinedLoadMetricType extends js.Any
object PredefinedLoadMetricType {
  val ASGTotalCPUUtilization = "ASGTotalCPUUtilization".asInstanceOf[PredefinedLoadMetricType]
  val ASGTotalNetworkIn = "ASGTotalNetworkIn".asInstanceOf[PredefinedLoadMetricType]
  val ASGTotalNetworkOut = "ASGTotalNetworkOut".asInstanceOf[PredefinedLoadMetricType]
  val ALBTargetGroupRequestCount = "ALBTargetGroupRequestCount".asInstanceOf[PredefinedLoadMetricType]

  @inline def values: js.Array[PredefinedLoadMetricType] = js.Array(ASGTotalCPUUtilization, ASGTotalNetworkIn, ASGTotalNetworkOut, ALBTargetGroupRequestCount)
}

@js.native
sealed trait PredefinedMetricPairType extends js.Any
object PredefinedMetricPairType {
  val ASGCPUUtilization = "ASGCPUUtilization".asInstanceOf[PredefinedMetricPairType]
  val ASGNetworkIn = "ASGNetworkIn".asInstanceOf[PredefinedMetricPairType]
  val ASGNetworkOut = "ASGNetworkOut".asInstanceOf[PredefinedMetricPairType]
  val ALBRequestCount = "ALBRequestCount".asInstanceOf[PredefinedMetricPairType]

  @inline def values: js.Array[PredefinedMetricPairType] = js.Array(ASGCPUUtilization, ASGNetworkIn, ASGNetworkOut, ALBRequestCount)
}

@js.native
sealed trait PredefinedScalingMetricType extends js.Any
object PredefinedScalingMetricType {
  val ASGAverageCPUUtilization = "ASGAverageCPUUtilization".asInstanceOf[PredefinedScalingMetricType]
  val ASGAverageNetworkIn = "ASGAverageNetworkIn".asInstanceOf[PredefinedScalingMetricType]
  val ASGAverageNetworkOut = "ASGAverageNetworkOut".asInstanceOf[PredefinedScalingMetricType]
  val ALBRequestCountPerTarget = "ALBRequestCountPerTarget".asInstanceOf[PredefinedScalingMetricType]

  @inline def values: js.Array[PredefinedScalingMetricType] = js.Array(ASGAverageCPUUtilization, ASGAverageNetworkIn, ASGAverageNetworkOut, ALBRequestCountPerTarget)
}

@js.native
sealed trait PredictiveScalingMaxCapacityBreachBehavior extends js.Any
object PredictiveScalingMaxCapacityBreachBehavior {
  val HonorMaxCapacity = "HonorMaxCapacity".asInstanceOf[PredictiveScalingMaxCapacityBreachBehavior]
  val IncreaseMaxCapacity = "IncreaseMaxCapacity".asInstanceOf[PredictiveScalingMaxCapacityBreachBehavior]

  @inline def values: js.Array[PredictiveScalingMaxCapacityBreachBehavior] = js.Array(HonorMaxCapacity, IncreaseMaxCapacity)
}

@js.native
sealed trait PredictiveScalingMode extends js.Any
object PredictiveScalingMode {
  val ForecastAndScale = "ForecastAndScale".asInstanceOf[PredictiveScalingMode]
  val ForecastOnly = "ForecastOnly".asInstanceOf[PredictiveScalingMode]

  @inline def values: js.Array[PredictiveScalingMode] = js.Array(ForecastAndScale, ForecastOnly)
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
