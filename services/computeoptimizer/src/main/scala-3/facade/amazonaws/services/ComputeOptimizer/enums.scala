package facade.amazonaws.services.computeoptimizer

import scalajs._

type EBSFilterName = "Finding"
object EBSFilterName {
  val Finding: "Finding" = "Finding"

  @inline def values = js.Array[EBSFilterName](Finding)
}

type EBSFinding = "Optimized" | "NotOptimized"
object EBSFinding {
  val Optimized: "Optimized" = "Optimized"
  val NotOptimized: "NotOptimized" = "NotOptimized"

  @inline def values = js.Array[EBSFinding](Optimized, NotOptimized)
}

type EBSMetricName = "VolumeReadOpsPerSecond" | "VolumeWriteOpsPerSecond" | "VolumeReadBytesPerSecond" | "VolumeWriteBytesPerSecond"
object EBSMetricName {
  val VolumeReadOpsPerSecond: "VolumeReadOpsPerSecond" = "VolumeReadOpsPerSecond"
  val VolumeWriteOpsPerSecond: "VolumeWriteOpsPerSecond" = "VolumeWriteOpsPerSecond"
  val VolumeReadBytesPerSecond: "VolumeReadBytesPerSecond" = "VolumeReadBytesPerSecond"
  val VolumeWriteBytesPerSecond: "VolumeWriteBytesPerSecond" = "VolumeWriteBytesPerSecond"

  @inline def values = js.Array[EBSMetricName](VolumeReadOpsPerSecond, VolumeWriteOpsPerSecond, VolumeReadBytesPerSecond, VolumeWriteBytesPerSecond)
}

type ExportableAutoScalingGroupField = "AccountId" | "AutoScalingGroupArn" | "AutoScalingGroupName" | "Finding" | "UtilizationMetricsCpuMaximum" | "UtilizationMetricsMemoryMaximum" | "UtilizationMetricsEbsReadOpsPerSecondMaximum" | "UtilizationMetricsEbsWriteOpsPerSecondMaximum" | "UtilizationMetricsEbsReadBytesPerSecondMaximum" | "UtilizationMetricsEbsWriteBytesPerSecondMaximum" | "LookbackPeriodInDays" | "CurrentConfigurationInstanceType" | "CurrentConfigurationDesiredCapacity" | "CurrentConfigurationMinSize" | "CurrentConfigurationMaxSize" | "CurrentOnDemandPrice" | "CurrentStandardOneYearNoUpfrontReservedPrice" | "CurrentStandardThreeYearNoUpfrontReservedPrice" | "CurrentVCpus" | "CurrentMemory" | "CurrentStorage" | "CurrentNetwork" | "RecommendationOptionsConfigurationInstanceType" | "RecommendationOptionsConfigurationDesiredCapacity" | "RecommendationOptionsConfigurationMinSize" | "RecommendationOptionsConfigurationMaxSize" |
  "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum" | "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum" | "RecommendationOptionsPerformanceRisk" | "RecommendationOptionsOnDemandPrice" | "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice" | "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice" | "RecommendationOptionsVcpus" | "RecommendationOptionsMemory" | "RecommendationOptionsStorage" | "RecommendationOptionsNetwork" | "LastRefreshTimestamp"
object ExportableAutoScalingGroupField {
  val AccountId: "AccountId" = "AccountId"
  val AutoScalingGroupArn: "AutoScalingGroupArn" = "AutoScalingGroupArn"
  val AutoScalingGroupName: "AutoScalingGroupName" = "AutoScalingGroupName"
  val Finding: "Finding" = "Finding"
  val UtilizationMetricsCpuMaximum: "UtilizationMetricsCpuMaximum" = "UtilizationMetricsCpuMaximum"
  val UtilizationMetricsMemoryMaximum: "UtilizationMetricsMemoryMaximum" = "UtilizationMetricsMemoryMaximum"
  val UtilizationMetricsEbsReadOpsPerSecondMaximum: "UtilizationMetricsEbsReadOpsPerSecondMaximum" = "UtilizationMetricsEbsReadOpsPerSecondMaximum"
  val UtilizationMetricsEbsWriteOpsPerSecondMaximum: "UtilizationMetricsEbsWriteOpsPerSecondMaximum" = "UtilizationMetricsEbsWriteOpsPerSecondMaximum"
  val UtilizationMetricsEbsReadBytesPerSecondMaximum: "UtilizationMetricsEbsReadBytesPerSecondMaximum" = "UtilizationMetricsEbsReadBytesPerSecondMaximum"
  val UtilizationMetricsEbsWriteBytesPerSecondMaximum: "UtilizationMetricsEbsWriteBytesPerSecondMaximum" = "UtilizationMetricsEbsWriteBytesPerSecondMaximum"
  val LookbackPeriodInDays: "LookbackPeriodInDays" = "LookbackPeriodInDays"
  val CurrentConfigurationInstanceType: "CurrentConfigurationInstanceType" = "CurrentConfigurationInstanceType"
  val CurrentConfigurationDesiredCapacity: "CurrentConfigurationDesiredCapacity" = "CurrentConfigurationDesiredCapacity"
  val CurrentConfigurationMinSize: "CurrentConfigurationMinSize" = "CurrentConfigurationMinSize"
  val CurrentConfigurationMaxSize: "CurrentConfigurationMaxSize" = "CurrentConfigurationMaxSize"
  val CurrentOnDemandPrice: "CurrentOnDemandPrice" = "CurrentOnDemandPrice"
  val CurrentStandardOneYearNoUpfrontReservedPrice: "CurrentStandardOneYearNoUpfrontReservedPrice" = "CurrentStandardOneYearNoUpfrontReservedPrice"
  val CurrentStandardThreeYearNoUpfrontReservedPrice: "CurrentStandardThreeYearNoUpfrontReservedPrice" = "CurrentStandardThreeYearNoUpfrontReservedPrice"
  val CurrentVCpus: "CurrentVCpus" = "CurrentVCpus"
  val CurrentMemory: "CurrentMemory" = "CurrentMemory"
  val CurrentStorage: "CurrentStorage" = "CurrentStorage"
  val CurrentNetwork: "CurrentNetwork" = "CurrentNetwork"
  val RecommendationOptionsConfigurationInstanceType: "RecommendationOptionsConfigurationInstanceType" = "RecommendationOptionsConfigurationInstanceType"
  val RecommendationOptionsConfigurationDesiredCapacity: "RecommendationOptionsConfigurationDesiredCapacity" = "RecommendationOptionsConfigurationDesiredCapacity"
  val RecommendationOptionsConfigurationMinSize: "RecommendationOptionsConfigurationMinSize" = "RecommendationOptionsConfigurationMinSize"
  val RecommendationOptionsConfigurationMaxSize: "RecommendationOptionsConfigurationMaxSize" = "RecommendationOptionsConfigurationMaxSize"
  val RecommendationOptionsProjectedUtilizationMetricsCpuMaximum: "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum" = "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum"
  val RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum: "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum" = "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum"
  val RecommendationOptionsPerformanceRisk: "RecommendationOptionsPerformanceRisk" = "RecommendationOptionsPerformanceRisk"
  val RecommendationOptionsOnDemandPrice: "RecommendationOptionsOnDemandPrice" = "RecommendationOptionsOnDemandPrice"
  val RecommendationOptionsStandardOneYearNoUpfrontReservedPrice: "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice" = "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice"
  val RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice: "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice" = "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice"
  val RecommendationOptionsVcpus: "RecommendationOptionsVcpus" = "RecommendationOptionsVcpus"
  val RecommendationOptionsMemory: "RecommendationOptionsMemory" = "RecommendationOptionsMemory"
  val RecommendationOptionsStorage: "RecommendationOptionsStorage" = "RecommendationOptionsStorage"
  val RecommendationOptionsNetwork: "RecommendationOptionsNetwork" = "RecommendationOptionsNetwork"
  val LastRefreshTimestamp: "LastRefreshTimestamp" = "LastRefreshTimestamp"

  @inline def values = js.Array[ExportableAutoScalingGroupField](
    AccountId,
    AutoScalingGroupArn,
    AutoScalingGroupName,
    Finding,
    UtilizationMetricsCpuMaximum,
    UtilizationMetricsMemoryMaximum,
    UtilizationMetricsEbsReadOpsPerSecondMaximum,
    UtilizationMetricsEbsWriteOpsPerSecondMaximum,
    UtilizationMetricsEbsReadBytesPerSecondMaximum,
    UtilizationMetricsEbsWriteBytesPerSecondMaximum,
    LookbackPeriodInDays,
    CurrentConfigurationInstanceType,
    CurrentConfigurationDesiredCapacity,
    CurrentConfigurationMinSize,
    CurrentConfigurationMaxSize,
    CurrentOnDemandPrice,
    CurrentStandardOneYearNoUpfrontReservedPrice,
    CurrentStandardThreeYearNoUpfrontReservedPrice,
    CurrentVCpus,
    CurrentMemory,
    CurrentStorage,
    CurrentNetwork,
    RecommendationOptionsConfigurationInstanceType,
    RecommendationOptionsConfigurationDesiredCapacity,
    RecommendationOptionsConfigurationMinSize,
    RecommendationOptionsConfigurationMaxSize,
    RecommendationOptionsProjectedUtilizationMetricsCpuMaximum,
    RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum,
    RecommendationOptionsPerformanceRisk,
    RecommendationOptionsOnDemandPrice,
    RecommendationOptionsStandardOneYearNoUpfrontReservedPrice,
    RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice,
    RecommendationOptionsVcpus,
    RecommendationOptionsMemory,
    RecommendationOptionsStorage,
    RecommendationOptionsNetwork,
    LastRefreshTimestamp
  )
}

type ExportableInstanceField = "AccountId" | "InstanceArn" | "InstanceName" | "Finding" | "LookbackPeriodInDays" | "CurrentInstanceType" | "UtilizationMetricsCpuMaximum" | "UtilizationMetricsMemoryMaximum" | "UtilizationMetricsEbsReadOpsPerSecondMaximum" | "UtilizationMetricsEbsWriteOpsPerSecondMaximum" | "UtilizationMetricsEbsReadBytesPerSecondMaximum" | "UtilizationMetricsEbsWriteBytesPerSecondMaximum" | "CurrentOnDemandPrice" | "CurrentStandardOneYearNoUpfrontReservedPrice" | "CurrentStandardThreeYearNoUpfrontReservedPrice" | "CurrentVCpus" | "CurrentMemory" | "CurrentStorage" | "CurrentNetwork" | "RecommendationOptionsInstanceType" | "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum" | "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum" | "RecommendationOptionsPerformanceRisk" | "RecommendationOptionsVcpus" | "RecommendationOptionsMemory" | "RecommendationOptionsStorage" | "RecommendationOptionsNetwork" | "RecommendationOptionsOnDemandPrice" |
  "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice" | "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice" | "RecommendationsSourcesRecommendationSourceArn" | "RecommendationsSourcesRecommendationSourceType" | "LastRefreshTimestamp"
object ExportableInstanceField {
  val AccountId: "AccountId" = "AccountId"
  val InstanceArn: "InstanceArn" = "InstanceArn"
  val InstanceName: "InstanceName" = "InstanceName"
  val Finding: "Finding" = "Finding"
  val LookbackPeriodInDays: "LookbackPeriodInDays" = "LookbackPeriodInDays"
  val CurrentInstanceType: "CurrentInstanceType" = "CurrentInstanceType"
  val UtilizationMetricsCpuMaximum: "UtilizationMetricsCpuMaximum" = "UtilizationMetricsCpuMaximum"
  val UtilizationMetricsMemoryMaximum: "UtilizationMetricsMemoryMaximum" = "UtilizationMetricsMemoryMaximum"
  val UtilizationMetricsEbsReadOpsPerSecondMaximum: "UtilizationMetricsEbsReadOpsPerSecondMaximum" = "UtilizationMetricsEbsReadOpsPerSecondMaximum"
  val UtilizationMetricsEbsWriteOpsPerSecondMaximum: "UtilizationMetricsEbsWriteOpsPerSecondMaximum" = "UtilizationMetricsEbsWriteOpsPerSecondMaximum"
  val UtilizationMetricsEbsReadBytesPerSecondMaximum: "UtilizationMetricsEbsReadBytesPerSecondMaximum" = "UtilizationMetricsEbsReadBytesPerSecondMaximum"
  val UtilizationMetricsEbsWriteBytesPerSecondMaximum: "UtilizationMetricsEbsWriteBytesPerSecondMaximum" = "UtilizationMetricsEbsWriteBytesPerSecondMaximum"
  val CurrentOnDemandPrice: "CurrentOnDemandPrice" = "CurrentOnDemandPrice"
  val CurrentStandardOneYearNoUpfrontReservedPrice: "CurrentStandardOneYearNoUpfrontReservedPrice" = "CurrentStandardOneYearNoUpfrontReservedPrice"
  val CurrentStandardThreeYearNoUpfrontReservedPrice: "CurrentStandardThreeYearNoUpfrontReservedPrice" = "CurrentStandardThreeYearNoUpfrontReservedPrice"
  val CurrentVCpus: "CurrentVCpus" = "CurrentVCpus"
  val CurrentMemory: "CurrentMemory" = "CurrentMemory"
  val CurrentStorage: "CurrentStorage" = "CurrentStorage"
  val CurrentNetwork: "CurrentNetwork" = "CurrentNetwork"
  val RecommendationOptionsInstanceType: "RecommendationOptionsInstanceType" = "RecommendationOptionsInstanceType"
  val RecommendationOptionsProjectedUtilizationMetricsCpuMaximum: "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum" = "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum"
  val RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum: "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum" = "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum"
  val RecommendationOptionsPerformanceRisk: "RecommendationOptionsPerformanceRisk" = "RecommendationOptionsPerformanceRisk"
  val RecommendationOptionsVcpus: "RecommendationOptionsVcpus" = "RecommendationOptionsVcpus"
  val RecommendationOptionsMemory: "RecommendationOptionsMemory" = "RecommendationOptionsMemory"
  val RecommendationOptionsStorage: "RecommendationOptionsStorage" = "RecommendationOptionsStorage"
  val RecommendationOptionsNetwork: "RecommendationOptionsNetwork" = "RecommendationOptionsNetwork"
  val RecommendationOptionsOnDemandPrice: "RecommendationOptionsOnDemandPrice" = "RecommendationOptionsOnDemandPrice"
  val RecommendationOptionsStandardOneYearNoUpfrontReservedPrice: "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice" = "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice"
  val RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice: "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice" = "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice"
  val RecommendationsSourcesRecommendationSourceArn: "RecommendationsSourcesRecommendationSourceArn" = "RecommendationsSourcesRecommendationSourceArn"
  val RecommendationsSourcesRecommendationSourceType: "RecommendationsSourcesRecommendationSourceType" = "RecommendationsSourcesRecommendationSourceType"
  val LastRefreshTimestamp: "LastRefreshTimestamp" = "LastRefreshTimestamp"

  @inline def values = js.Array[ExportableInstanceField](
    AccountId,
    InstanceArn,
    InstanceName,
    Finding,
    LookbackPeriodInDays,
    CurrentInstanceType,
    UtilizationMetricsCpuMaximum,
    UtilizationMetricsMemoryMaximum,
    UtilizationMetricsEbsReadOpsPerSecondMaximum,
    UtilizationMetricsEbsWriteOpsPerSecondMaximum,
    UtilizationMetricsEbsReadBytesPerSecondMaximum,
    UtilizationMetricsEbsWriteBytesPerSecondMaximum,
    CurrentOnDemandPrice,
    CurrentStandardOneYearNoUpfrontReservedPrice,
    CurrentStandardThreeYearNoUpfrontReservedPrice,
    CurrentVCpus,
    CurrentMemory,
    CurrentStorage,
    CurrentNetwork,
    RecommendationOptionsInstanceType,
    RecommendationOptionsProjectedUtilizationMetricsCpuMaximum,
    RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum,
    RecommendationOptionsPerformanceRisk,
    RecommendationOptionsVcpus,
    RecommendationOptionsMemory,
    RecommendationOptionsStorage,
    RecommendationOptionsNetwork,
    RecommendationOptionsOnDemandPrice,
    RecommendationOptionsStandardOneYearNoUpfrontReservedPrice,
    RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice,
    RecommendationsSourcesRecommendationSourceArn,
    RecommendationsSourcesRecommendationSourceType,
    LastRefreshTimestamp
  )
}

type FileFormat = "Csv"
object FileFormat {
  val Csv: "Csv" = "Csv"

  @inline def values = js.Array[FileFormat](Csv)
}

type FilterName = "Finding" | "RecommendationSourceType"
object FilterName {
  val Finding: "Finding" = "Finding"
  val RecommendationSourceType: "RecommendationSourceType" = "RecommendationSourceType"

  @inline def values = js.Array[FilterName](Finding, RecommendationSourceType)
}

type Finding = "Underprovisioned" | "Overprovisioned" | "Optimized" | "NotOptimized"
object Finding {
  val Underprovisioned: "Underprovisioned" = "Underprovisioned"
  val Overprovisioned: "Overprovisioned" = "Overprovisioned"
  val Optimized: "Optimized" = "Optimized"
  val NotOptimized: "NotOptimized" = "NotOptimized"

  @inline def values = js.Array[Finding](Underprovisioned, Overprovisioned, Optimized, NotOptimized)
}

type FindingReasonCode = "MemoryOverprovisioned" | "MemoryUnderprovisioned"
object FindingReasonCode {
  val MemoryOverprovisioned: "MemoryOverprovisioned" = "MemoryOverprovisioned"
  val MemoryUnderprovisioned: "MemoryUnderprovisioned" = "MemoryUnderprovisioned"

  @inline def values = js.Array[FindingReasonCode](MemoryOverprovisioned, MemoryUnderprovisioned)
}

type JobFilterName = "ResourceType" | "JobStatus"
object JobFilterName {
  val ResourceType: "ResourceType" = "ResourceType"
  val JobStatus: "JobStatus" = "JobStatus"

  @inline def values = js.Array[JobFilterName](ResourceType, JobStatus)
}

type JobStatus = "Queued" | "InProgress" | "Complete" | "Failed"
object JobStatus {
  val Queued: "Queued" = "Queued"
  val InProgress: "InProgress" = "InProgress"
  val Complete: "Complete" = "Complete"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[JobStatus](Queued, InProgress, Complete, Failed)
}

type LambdaFunctionMemoryMetricName = "Duration"
object LambdaFunctionMemoryMetricName {
  val Duration: "Duration" = "Duration"

  @inline def values = js.Array[LambdaFunctionMemoryMetricName](Duration)
}

type LambdaFunctionMemoryMetricStatistic = "LowerBound" | "UpperBound" | "Expected"
object LambdaFunctionMemoryMetricStatistic {
  val LowerBound: "LowerBound" = "LowerBound"
  val UpperBound: "UpperBound" = "UpperBound"
  val Expected: "Expected" = "Expected"

  @inline def values = js.Array[LambdaFunctionMemoryMetricStatistic](LowerBound, UpperBound, Expected)
}

type LambdaFunctionMetricName = "Duration" | "Memory"
object LambdaFunctionMetricName {
  val Duration: "Duration" = "Duration"
  val Memory: "Memory" = "Memory"

  @inline def values = js.Array[LambdaFunctionMetricName](Duration, Memory)
}

type LambdaFunctionMetricStatistic = "Maximum" | "Average"
object LambdaFunctionMetricStatistic {
  val Maximum: "Maximum" = "Maximum"
  val Average: "Average" = "Average"

  @inline def values = js.Array[LambdaFunctionMetricStatistic](Maximum, Average)
}

type LambdaFunctionRecommendationFilterName = "Finding" | "FindingReasonCode"
object LambdaFunctionRecommendationFilterName {
  val Finding: "Finding" = "Finding"
  val FindingReasonCode: "FindingReasonCode" = "FindingReasonCode"

  @inline def values = js.Array[LambdaFunctionRecommendationFilterName](Finding, FindingReasonCode)
}

type LambdaFunctionRecommendationFinding = "Optimized" | "NotOptimized" | "Unavailable"
object LambdaFunctionRecommendationFinding {
  val Optimized: "Optimized" = "Optimized"
  val NotOptimized: "NotOptimized" = "NotOptimized"
  val Unavailable: "Unavailable" = "Unavailable"

  @inline def values = js.Array[LambdaFunctionRecommendationFinding](Optimized, NotOptimized, Unavailable)
}

type LambdaFunctionRecommendationFindingReasonCode = "MemoryOverprovisioned" | "MemoryUnderprovisioned" | "InsufficientData" | "Inconclusive"
object LambdaFunctionRecommendationFindingReasonCode {
  val MemoryOverprovisioned: "MemoryOverprovisioned" = "MemoryOverprovisioned"
  val MemoryUnderprovisioned: "MemoryUnderprovisioned" = "MemoryUnderprovisioned"
  val InsufficientData: "InsufficientData" = "InsufficientData"
  val Inconclusive: "Inconclusive" = "Inconclusive"

  @inline def values = js.Array[LambdaFunctionRecommendationFindingReasonCode](MemoryOverprovisioned, MemoryUnderprovisioned, InsufficientData, Inconclusive)
}

type MetricName = "Cpu" | "Memory" | "EBS_READ_OPS_PER_SECOND" | "EBS_WRITE_OPS_PER_SECOND" | "EBS_READ_BYTES_PER_SECOND" | "EBS_WRITE_BYTES_PER_SECOND"
object MetricName {
  val Cpu: "Cpu" = "Cpu"
  val Memory: "Memory" = "Memory"
  val EBS_READ_OPS_PER_SECOND: "EBS_READ_OPS_PER_SECOND" = "EBS_READ_OPS_PER_SECOND"
  val EBS_WRITE_OPS_PER_SECOND: "EBS_WRITE_OPS_PER_SECOND" = "EBS_WRITE_OPS_PER_SECOND"
  val EBS_READ_BYTES_PER_SECOND: "EBS_READ_BYTES_PER_SECOND" = "EBS_READ_BYTES_PER_SECOND"
  val EBS_WRITE_BYTES_PER_SECOND: "EBS_WRITE_BYTES_PER_SECOND" = "EBS_WRITE_BYTES_PER_SECOND"

  @inline def values = js.Array[MetricName](Cpu, Memory, EBS_READ_OPS_PER_SECOND, EBS_WRITE_OPS_PER_SECOND, EBS_READ_BYTES_PER_SECOND, EBS_WRITE_BYTES_PER_SECOND)
}

type MetricStatistic = "Maximum" | "Average"
object MetricStatistic {
  val Maximum: "Maximum" = "Maximum"
  val Average: "Average" = "Average"

  @inline def values = js.Array[MetricStatistic](Maximum, Average)
}

type RecommendationSourceType = "Ec2Instance" | "AutoScalingGroup" | "EbsVolume" | "LambdaFunction"
object RecommendationSourceType {
  val Ec2Instance: "Ec2Instance" = "Ec2Instance"
  val AutoScalingGroup: "AutoScalingGroup" = "AutoScalingGroup"
  val EbsVolume: "EbsVolume" = "EbsVolume"
  val LambdaFunction: "LambdaFunction" = "LambdaFunction"

  @inline def values = js.Array[RecommendationSourceType](Ec2Instance, AutoScalingGroup, EbsVolume, LambdaFunction)
}

type ResourceType = "Ec2Instance" | "AutoScalingGroup"
object ResourceType {
  val Ec2Instance: "Ec2Instance" = "Ec2Instance"
  val AutoScalingGroup: "AutoScalingGroup" = "AutoScalingGroup"

  @inline def values = js.Array[ResourceType](Ec2Instance, AutoScalingGroup)
}

type Status = "Active" | "Inactive" | "Pending" | "Failed"
object Status {
  val Active: "Active" = "Active"
  val Inactive: "Inactive" = "Inactive"
  val Pending: "Pending" = "Pending"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[Status](Active, Inactive, Pending, Failed)
}
