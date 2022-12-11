package facade.amazonaws.services.autoscaling

import scalajs.js

type AcceleratorManufacturer = "nvidia" | "amd" | "amazon-web-services" | "xilinx"
object AcceleratorManufacturer {
  inline val nvidia: "nvidia" = "nvidia"
  inline val amd: "amd" = "amd"
  inline val `amazon-web-services`: "amazon-web-services" = "amazon-web-services"
  inline val xilinx: "xilinx" = "xilinx"

  inline def values: js.Array[AcceleratorManufacturer] = js.Array(nvidia, amd, `amazon-web-services`, xilinx)
}

type AcceleratorName = "a100" | "v100" | "k80" | "t4" | "m60" | "radeon-pro-v520" | "vu9p"
object AcceleratorName {
  inline val a100: "a100" = "a100"
  inline val v100: "v100" = "v100"
  inline val k80: "k80" = "k80"
  inline val t4: "t4" = "t4"
  inline val m60: "m60" = "m60"
  inline val `radeon-pro-v520`: "radeon-pro-v520" = "radeon-pro-v520"
  inline val vu9p: "vu9p" = "vu9p"

  inline def values: js.Array[AcceleratorName] = js.Array(a100, v100, k80, t4, m60, `radeon-pro-v520`, vu9p)
}

type AcceleratorType = "gpu" | "fpga" | "inference"
object AcceleratorType {
  inline val gpu: "gpu" = "gpu"
  inline val fpga: "fpga" = "fpga"
  inline val inference: "inference" = "inference"

  inline def values: js.Array[AcceleratorType] = js.Array(gpu, fpga, inference)
}

type BareMetal = "included" | "excluded" | "required"
object BareMetal {
  inline val included: "included" = "included"
  inline val excluded: "excluded" = "excluded"
  inline val required: "required" = "required"

  inline def values: js.Array[BareMetal] = js.Array(included, excluded, required)
}

type BurstablePerformance = "included" | "excluded" | "required"
object BurstablePerformance {
  inline val included: "included" = "included"
  inline val excluded: "excluded" = "excluded"
  inline val required: "required" = "required"

  inline def values: js.Array[BurstablePerformance] = js.Array(included, excluded, required)
}

type CpuManufacturer = "intel" | "amd" | "amazon-web-services"
object CpuManufacturer {
  inline val intel: "intel" = "intel"
  inline val amd: "amd" = "amd"
  inline val `amazon-web-services`: "amazon-web-services" = "amazon-web-services"

  inline def values: js.Array[CpuManufacturer] = js.Array(intel, amd, `amazon-web-services`)
}

type InstanceGeneration = "current" | "previous"
object InstanceGeneration {
  inline val current: "current" = "current"
  inline val previous: "previous" = "previous"

  inline def values: js.Array[InstanceGeneration] = js.Array(current, previous)
}

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

type LifecycleState = "Pending" | "Pending:Wait" | "Pending:Proceed" | "Quarantined" | "InService" | "Terminating" | "Terminating:Wait" | "Terminating:Proceed" | "Terminated" | "Detaching" | "Detached" | "EnteringStandby" | "Standby" | "Warmed:Pending" | "Warmed:Pending:Wait" | "Warmed:Pending:Proceed" | "Warmed:Terminating" | "Warmed:Terminating:Wait" | "Warmed:Terminating:Proceed" | "Warmed:Terminated" | "Warmed:Stopped" | "Warmed:Running" | "Warmed:Hibernated"
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
  inline val `Warmed:Hibernated`: "Warmed:Hibernated" = "Warmed:Hibernated"

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
    `Warmed:Running`,
    `Warmed:Hibernated`
  )
}

type LocalStorage = "included" | "excluded" | "required"
object LocalStorage {
  inline val included: "included" = "included"
  inline val excluded: "excluded" = "excluded"
  inline val required: "required" = "required"

  inline def values: js.Array[LocalStorage] = js.Array(included, excluded, required)
}

type LocalStorageType = "hdd" | "ssd"
object LocalStorageType {
  inline val hdd: "hdd" = "hdd"
  inline val ssd: "ssd" = "ssd"

  inline def values: js.Array[LocalStorageType] = js.Array(hdd, ssd)
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

type PredefinedLoadMetricType = "ASGTotalCPUUtilization" | "ASGTotalNetworkIn" | "ASGTotalNetworkOut" | "ALBTargetGroupRequestCount"
object PredefinedLoadMetricType {
  inline val ASGTotalCPUUtilization: "ASGTotalCPUUtilization" = "ASGTotalCPUUtilization"
  inline val ASGTotalNetworkIn: "ASGTotalNetworkIn" = "ASGTotalNetworkIn"
  inline val ASGTotalNetworkOut: "ASGTotalNetworkOut" = "ASGTotalNetworkOut"
  inline val ALBTargetGroupRequestCount: "ALBTargetGroupRequestCount" = "ALBTargetGroupRequestCount"

  inline def values: js.Array[PredefinedLoadMetricType] = js.Array(ASGTotalCPUUtilization, ASGTotalNetworkIn, ASGTotalNetworkOut, ALBTargetGroupRequestCount)
}

type PredefinedMetricPairType = "ASGCPUUtilization" | "ASGNetworkIn" | "ASGNetworkOut" | "ALBRequestCount"
object PredefinedMetricPairType {
  inline val ASGCPUUtilization: "ASGCPUUtilization" = "ASGCPUUtilization"
  inline val ASGNetworkIn: "ASGNetworkIn" = "ASGNetworkIn"
  inline val ASGNetworkOut: "ASGNetworkOut" = "ASGNetworkOut"
  inline val ALBRequestCount: "ALBRequestCount" = "ALBRequestCount"

  inline def values: js.Array[PredefinedMetricPairType] = js.Array(ASGCPUUtilization, ASGNetworkIn, ASGNetworkOut, ALBRequestCount)
}

type PredefinedScalingMetricType = "ASGAverageCPUUtilization" | "ASGAverageNetworkIn" | "ASGAverageNetworkOut" | "ALBRequestCountPerTarget"
object PredefinedScalingMetricType {
  inline val ASGAverageCPUUtilization: "ASGAverageCPUUtilization" = "ASGAverageCPUUtilization"
  inline val ASGAverageNetworkIn: "ASGAverageNetworkIn" = "ASGAverageNetworkIn"
  inline val ASGAverageNetworkOut: "ASGAverageNetworkOut" = "ASGAverageNetworkOut"
  inline val ALBRequestCountPerTarget: "ALBRequestCountPerTarget" = "ALBRequestCountPerTarget"

  inline def values: js.Array[PredefinedScalingMetricType] = js.Array(ASGAverageCPUUtilization, ASGAverageNetworkIn, ASGAverageNetworkOut, ALBRequestCountPerTarget)
}

type PredictiveScalingMaxCapacityBreachBehavior = "HonorMaxCapacity" | "IncreaseMaxCapacity"
object PredictiveScalingMaxCapacityBreachBehavior {
  inline val HonorMaxCapacity: "HonorMaxCapacity" = "HonorMaxCapacity"
  inline val IncreaseMaxCapacity: "IncreaseMaxCapacity" = "IncreaseMaxCapacity"

  inline def values: js.Array[PredictiveScalingMaxCapacityBreachBehavior] = js.Array(HonorMaxCapacity, IncreaseMaxCapacity)
}

type PredictiveScalingMode = "ForecastAndScale" | "ForecastOnly"
object PredictiveScalingMode {
  inline val ForecastAndScale: "ForecastAndScale" = "ForecastAndScale"
  inline val ForecastOnly: "ForecastOnly" = "ForecastOnly"

  inline def values: js.Array[PredictiveScalingMode] = js.Array(ForecastAndScale, ForecastOnly)
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

type WarmPoolState = "Stopped" | "Running" | "Hibernated"
object WarmPoolState {
  inline val Stopped: "Stopped" = "Stopped"
  inline val Running: "Running" = "Running"
  inline val Hibernated: "Hibernated" = "Hibernated"

  inline def values: js.Array[WarmPoolState] = js.Array(Stopped, Running, Hibernated)
}

type WarmPoolStatus = "PendingDelete"
object WarmPoolStatus {
  inline val PendingDelete: "PendingDelete" = "PendingDelete"

  inline def values: js.Array[WarmPoolStatus] = js.Array(PendingDelete)
}
