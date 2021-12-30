package facade.amazonaws.services.computeoptimizer

import scalajs.js

type EBSFilterName = "Finding"
object EBSFilterName {
  inline val Finding: "Finding" = "Finding"

  inline def values: js.Array[EBSFilterName] = js.Array(Finding)
}

type EBSFinding = "Optimized" | "NotOptimized"
object EBSFinding {
  inline val Optimized: "Optimized" = "Optimized"
  inline val NotOptimized: "NotOptimized" = "NotOptimized"

  inline def values: js.Array[EBSFinding] = js.Array(Optimized, NotOptimized)
}

type EBSMetricName = "VolumeReadOpsPerSecond" | "VolumeWriteOpsPerSecond" | "VolumeReadBytesPerSecond" | "VolumeWriteBytesPerSecond"
object EBSMetricName {
  inline val VolumeReadOpsPerSecond: "VolumeReadOpsPerSecond" = "VolumeReadOpsPerSecond"
  inline val VolumeWriteOpsPerSecond: "VolumeWriteOpsPerSecond" = "VolumeWriteOpsPerSecond"
  inline val VolumeReadBytesPerSecond: "VolumeReadBytesPerSecond" = "VolumeReadBytesPerSecond"
  inline val VolumeWriteBytesPerSecond: "VolumeWriteBytesPerSecond" = "VolumeWriteBytesPerSecond"

  inline def values: js.Array[EBSMetricName] = js.Array(VolumeReadOpsPerSecond, VolumeWriteOpsPerSecond, VolumeReadBytesPerSecond, VolumeWriteBytesPerSecond)
}

type ExportableAutoScalingGroupField = "AccountId" | "AutoScalingGroupArn" | "AutoScalingGroupName" | "Finding" | "UtilizationMetricsCpuMaximum" | "UtilizationMetricsMemoryMaximum" | "UtilizationMetricsEbsReadOpsPerSecondMaximum" | "UtilizationMetricsEbsWriteOpsPerSecondMaximum" | "UtilizationMetricsEbsReadBytesPerSecondMaximum" | "UtilizationMetricsEbsWriteBytesPerSecondMaximum" | "LookbackPeriodInDays" | "CurrentConfigurationInstanceType" | "CurrentConfigurationDesiredCapacity" | "CurrentConfigurationMinSize" | "CurrentConfigurationMaxSize" | "CurrentOnDemandPrice" | "CurrentStandardOneYearNoUpfrontReservedPrice" | "CurrentStandardThreeYearNoUpfrontReservedPrice" | "CurrentVCpus" | "CurrentMemory" | "CurrentStorage" | "CurrentNetwork" | "RecommendationOptionsConfigurationInstanceType" | "RecommendationOptionsConfigurationDesiredCapacity" | "RecommendationOptionsConfigurationMinSize" | "RecommendationOptionsConfigurationMaxSize" |
  "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum" | "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum" | "RecommendationOptionsPerformanceRisk" | "RecommendationOptionsOnDemandPrice" | "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice" | "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice" | "RecommendationOptionsVcpus" | "RecommendationOptionsMemory" | "RecommendationOptionsStorage" | "RecommendationOptionsNetwork" | "LastRefreshTimestamp"
object ExportableAutoScalingGroupField {
  inline val AccountId: "AccountId" = "AccountId"
  inline val AutoScalingGroupArn: "AutoScalingGroupArn" = "AutoScalingGroupArn"
  inline val AutoScalingGroupName: "AutoScalingGroupName" = "AutoScalingGroupName"
  inline val Finding: "Finding" = "Finding"
  inline val UtilizationMetricsCpuMaximum: "UtilizationMetricsCpuMaximum" = "UtilizationMetricsCpuMaximum"
  inline val UtilizationMetricsMemoryMaximum: "UtilizationMetricsMemoryMaximum" = "UtilizationMetricsMemoryMaximum"
  inline val UtilizationMetricsEbsReadOpsPerSecondMaximum: "UtilizationMetricsEbsReadOpsPerSecondMaximum" = "UtilizationMetricsEbsReadOpsPerSecondMaximum"
  inline val UtilizationMetricsEbsWriteOpsPerSecondMaximum: "UtilizationMetricsEbsWriteOpsPerSecondMaximum" = "UtilizationMetricsEbsWriteOpsPerSecondMaximum"
  inline val UtilizationMetricsEbsReadBytesPerSecondMaximum: "UtilizationMetricsEbsReadBytesPerSecondMaximum" = "UtilizationMetricsEbsReadBytesPerSecondMaximum"
  inline val UtilizationMetricsEbsWriteBytesPerSecondMaximum: "UtilizationMetricsEbsWriteBytesPerSecondMaximum" = "UtilizationMetricsEbsWriteBytesPerSecondMaximum"
  inline val LookbackPeriodInDays: "LookbackPeriodInDays" = "LookbackPeriodInDays"
  inline val CurrentConfigurationInstanceType: "CurrentConfigurationInstanceType" = "CurrentConfigurationInstanceType"
  inline val CurrentConfigurationDesiredCapacity: "CurrentConfigurationDesiredCapacity" = "CurrentConfigurationDesiredCapacity"
  inline val CurrentConfigurationMinSize: "CurrentConfigurationMinSize" = "CurrentConfigurationMinSize"
  inline val CurrentConfigurationMaxSize: "CurrentConfigurationMaxSize" = "CurrentConfigurationMaxSize"
  inline val CurrentOnDemandPrice: "CurrentOnDemandPrice" = "CurrentOnDemandPrice"
  inline val CurrentStandardOneYearNoUpfrontReservedPrice: "CurrentStandardOneYearNoUpfrontReservedPrice" = "CurrentStandardOneYearNoUpfrontReservedPrice"
  inline val CurrentStandardThreeYearNoUpfrontReservedPrice: "CurrentStandardThreeYearNoUpfrontReservedPrice" = "CurrentStandardThreeYearNoUpfrontReservedPrice"
  inline val CurrentVCpus: "CurrentVCpus" = "CurrentVCpus"
  inline val CurrentMemory: "CurrentMemory" = "CurrentMemory"
  inline val CurrentStorage: "CurrentStorage" = "CurrentStorage"
  inline val CurrentNetwork: "CurrentNetwork" = "CurrentNetwork"
  inline val RecommendationOptionsConfigurationInstanceType: "RecommendationOptionsConfigurationInstanceType" = "RecommendationOptionsConfigurationInstanceType"
  inline val RecommendationOptionsConfigurationDesiredCapacity: "RecommendationOptionsConfigurationDesiredCapacity" = "RecommendationOptionsConfigurationDesiredCapacity"
  inline val RecommendationOptionsConfigurationMinSize: "RecommendationOptionsConfigurationMinSize" = "RecommendationOptionsConfigurationMinSize"
  inline val RecommendationOptionsConfigurationMaxSize: "RecommendationOptionsConfigurationMaxSize" = "RecommendationOptionsConfigurationMaxSize"
  inline val RecommendationOptionsProjectedUtilizationMetricsCpuMaximum: "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum" = "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum"
  inline val RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum: "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum" = "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum"
  inline val RecommendationOptionsPerformanceRisk: "RecommendationOptionsPerformanceRisk" = "RecommendationOptionsPerformanceRisk"
  inline val RecommendationOptionsOnDemandPrice: "RecommendationOptionsOnDemandPrice" = "RecommendationOptionsOnDemandPrice"
  inline val RecommendationOptionsStandardOneYearNoUpfrontReservedPrice: "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice" = "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice"
  inline val RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice: "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice" = "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice"
  inline val RecommendationOptionsVcpus: "RecommendationOptionsVcpus" = "RecommendationOptionsVcpus"
  inline val RecommendationOptionsMemory: "RecommendationOptionsMemory" = "RecommendationOptionsMemory"
  inline val RecommendationOptionsStorage: "RecommendationOptionsStorage" = "RecommendationOptionsStorage"
  inline val RecommendationOptionsNetwork: "RecommendationOptionsNetwork" = "RecommendationOptionsNetwork"
  inline val LastRefreshTimestamp: "LastRefreshTimestamp" = "LastRefreshTimestamp"

  inline def values: js.Array[ExportableAutoScalingGroupField] = js.Array(
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
  inline val AccountId: "AccountId" = "AccountId"
  inline val InstanceArn: "InstanceArn" = "InstanceArn"
  inline val InstanceName: "InstanceName" = "InstanceName"
  inline val Finding: "Finding" = "Finding"
  inline val LookbackPeriodInDays: "LookbackPeriodInDays" = "LookbackPeriodInDays"
  inline val CurrentInstanceType: "CurrentInstanceType" = "CurrentInstanceType"
  inline val UtilizationMetricsCpuMaximum: "UtilizationMetricsCpuMaximum" = "UtilizationMetricsCpuMaximum"
  inline val UtilizationMetricsMemoryMaximum: "UtilizationMetricsMemoryMaximum" = "UtilizationMetricsMemoryMaximum"
  inline val UtilizationMetricsEbsReadOpsPerSecondMaximum: "UtilizationMetricsEbsReadOpsPerSecondMaximum" = "UtilizationMetricsEbsReadOpsPerSecondMaximum"
  inline val UtilizationMetricsEbsWriteOpsPerSecondMaximum: "UtilizationMetricsEbsWriteOpsPerSecondMaximum" = "UtilizationMetricsEbsWriteOpsPerSecondMaximum"
  inline val UtilizationMetricsEbsReadBytesPerSecondMaximum: "UtilizationMetricsEbsReadBytesPerSecondMaximum" = "UtilizationMetricsEbsReadBytesPerSecondMaximum"
  inline val UtilizationMetricsEbsWriteBytesPerSecondMaximum: "UtilizationMetricsEbsWriteBytesPerSecondMaximum" = "UtilizationMetricsEbsWriteBytesPerSecondMaximum"
  inline val CurrentOnDemandPrice: "CurrentOnDemandPrice" = "CurrentOnDemandPrice"
  inline val CurrentStandardOneYearNoUpfrontReservedPrice: "CurrentStandardOneYearNoUpfrontReservedPrice" = "CurrentStandardOneYearNoUpfrontReservedPrice"
  inline val CurrentStandardThreeYearNoUpfrontReservedPrice: "CurrentStandardThreeYearNoUpfrontReservedPrice" = "CurrentStandardThreeYearNoUpfrontReservedPrice"
  inline val CurrentVCpus: "CurrentVCpus" = "CurrentVCpus"
  inline val CurrentMemory: "CurrentMemory" = "CurrentMemory"
  inline val CurrentStorage: "CurrentStorage" = "CurrentStorage"
  inline val CurrentNetwork: "CurrentNetwork" = "CurrentNetwork"
  inline val RecommendationOptionsInstanceType: "RecommendationOptionsInstanceType" = "RecommendationOptionsInstanceType"
  inline val RecommendationOptionsProjectedUtilizationMetricsCpuMaximum: "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum" = "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum"
  inline val RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum: "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum" = "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum"
  inline val RecommendationOptionsPerformanceRisk: "RecommendationOptionsPerformanceRisk" = "RecommendationOptionsPerformanceRisk"
  inline val RecommendationOptionsVcpus: "RecommendationOptionsVcpus" = "RecommendationOptionsVcpus"
  inline val RecommendationOptionsMemory: "RecommendationOptionsMemory" = "RecommendationOptionsMemory"
  inline val RecommendationOptionsStorage: "RecommendationOptionsStorage" = "RecommendationOptionsStorage"
  inline val RecommendationOptionsNetwork: "RecommendationOptionsNetwork" = "RecommendationOptionsNetwork"
  inline val RecommendationOptionsOnDemandPrice: "RecommendationOptionsOnDemandPrice" = "RecommendationOptionsOnDemandPrice"
  inline val RecommendationOptionsStandardOneYearNoUpfrontReservedPrice: "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice" = "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice"
  inline val RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice: "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice" = "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice"
  inline val RecommendationsSourcesRecommendationSourceArn: "RecommendationsSourcesRecommendationSourceArn" = "RecommendationsSourcesRecommendationSourceArn"
  inline val RecommendationsSourcesRecommendationSourceType: "RecommendationsSourcesRecommendationSourceType" = "RecommendationsSourcesRecommendationSourceType"
  inline val LastRefreshTimestamp: "LastRefreshTimestamp" = "LastRefreshTimestamp"

  inline def values: js.Array[ExportableInstanceField] = js.Array(
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
  inline val Csv: "Csv" = "Csv"

  inline def values: js.Array[FileFormat] = js.Array(Csv)
}

type FilterName = "Finding" | "RecommendationSourceType"
object FilterName {
  inline val Finding: "Finding" = "Finding"
  inline val RecommendationSourceType: "RecommendationSourceType" = "RecommendationSourceType"

  inline def values: js.Array[FilterName] = js.Array(Finding, RecommendationSourceType)
}

type Finding = "Underprovisioned" | "Overprovisioned" | "Optimized" | "NotOptimized"
object Finding {
  inline val Underprovisioned: "Underprovisioned" = "Underprovisioned"
  inline val Overprovisioned: "Overprovisioned" = "Overprovisioned"
  inline val Optimized: "Optimized" = "Optimized"
  inline val NotOptimized: "NotOptimized" = "NotOptimized"

  inline def values: js.Array[Finding] = js.Array(Underprovisioned, Overprovisioned, Optimized, NotOptimized)
}

type FindingReasonCode = "MemoryOverprovisioned" | "MemoryUnderprovisioned"
object FindingReasonCode {
  inline val MemoryOverprovisioned: "MemoryOverprovisioned" = "MemoryOverprovisioned"
  inline val MemoryUnderprovisioned: "MemoryUnderprovisioned" = "MemoryUnderprovisioned"

  inline def values: js.Array[FindingReasonCode] = js.Array(MemoryOverprovisioned, MemoryUnderprovisioned)
}

type JobFilterName = "ResourceType" | "JobStatus"
object JobFilterName {
  inline val ResourceType: "ResourceType" = "ResourceType"
  inline val JobStatus: "JobStatus" = "JobStatus"

  inline def values: js.Array[JobFilterName] = js.Array(ResourceType, JobStatus)
}

type JobStatus = "Queued" | "InProgress" | "Complete" | "Failed"
object JobStatus {
  inline val Queued: "Queued" = "Queued"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Complete: "Complete" = "Complete"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[JobStatus] = js.Array(Queued, InProgress, Complete, Failed)
}

type LambdaFunctionMemoryMetricName = "Duration"
object LambdaFunctionMemoryMetricName {
  inline val Duration: "Duration" = "Duration"

  inline def values: js.Array[LambdaFunctionMemoryMetricName] = js.Array(Duration)
}

type LambdaFunctionMemoryMetricStatistic = "LowerBound" | "UpperBound" | "Expected"
object LambdaFunctionMemoryMetricStatistic {
  inline val LowerBound: "LowerBound" = "LowerBound"
  inline val UpperBound: "UpperBound" = "UpperBound"
  inline val Expected: "Expected" = "Expected"

  inline def values: js.Array[LambdaFunctionMemoryMetricStatistic] = js.Array(LowerBound, UpperBound, Expected)
}

type LambdaFunctionMetricName = "Duration" | "Memory"
object LambdaFunctionMetricName {
  inline val Duration: "Duration" = "Duration"
  inline val Memory: "Memory" = "Memory"

  inline def values: js.Array[LambdaFunctionMetricName] = js.Array(Duration, Memory)
}

type LambdaFunctionMetricStatistic = "Maximum" | "Average"
object LambdaFunctionMetricStatistic {
  inline val Maximum: "Maximum" = "Maximum"
  inline val Average: "Average" = "Average"

  inline def values: js.Array[LambdaFunctionMetricStatistic] = js.Array(Maximum, Average)
}

type LambdaFunctionRecommendationFilterName = "Finding" | "FindingReasonCode"
object LambdaFunctionRecommendationFilterName {
  inline val Finding: "Finding" = "Finding"
  inline val FindingReasonCode: "FindingReasonCode" = "FindingReasonCode"

  inline def values: js.Array[LambdaFunctionRecommendationFilterName] = js.Array(Finding, FindingReasonCode)
}

type LambdaFunctionRecommendationFinding = "Optimized" | "NotOptimized" | "Unavailable"
object LambdaFunctionRecommendationFinding {
  inline val Optimized: "Optimized" = "Optimized"
  inline val NotOptimized: "NotOptimized" = "NotOptimized"
  inline val Unavailable: "Unavailable" = "Unavailable"

  inline def values: js.Array[LambdaFunctionRecommendationFinding] = js.Array(Optimized, NotOptimized, Unavailable)
}

type LambdaFunctionRecommendationFindingReasonCode = "MemoryOverprovisioned" | "MemoryUnderprovisioned" | "InsufficientData" | "Inconclusive"
object LambdaFunctionRecommendationFindingReasonCode {
  inline val MemoryOverprovisioned: "MemoryOverprovisioned" = "MemoryOverprovisioned"
  inline val MemoryUnderprovisioned: "MemoryUnderprovisioned" = "MemoryUnderprovisioned"
  inline val InsufficientData: "InsufficientData" = "InsufficientData"
  inline val Inconclusive: "Inconclusive" = "Inconclusive"

  inline def values: js.Array[LambdaFunctionRecommendationFindingReasonCode] = js.Array(MemoryOverprovisioned, MemoryUnderprovisioned, InsufficientData, Inconclusive)
}

type MetricName = "Cpu" | "Memory" | "EBS_READ_OPS_PER_SECOND" | "EBS_WRITE_OPS_PER_SECOND" | "EBS_READ_BYTES_PER_SECOND" | "EBS_WRITE_BYTES_PER_SECOND"
object MetricName {
  inline val Cpu: "Cpu" = "Cpu"
  inline val Memory: "Memory" = "Memory"
  inline val EBS_READ_OPS_PER_SECOND: "EBS_READ_OPS_PER_SECOND" = "EBS_READ_OPS_PER_SECOND"
  inline val EBS_WRITE_OPS_PER_SECOND: "EBS_WRITE_OPS_PER_SECOND" = "EBS_WRITE_OPS_PER_SECOND"
  inline val EBS_READ_BYTES_PER_SECOND: "EBS_READ_BYTES_PER_SECOND" = "EBS_READ_BYTES_PER_SECOND"
  inline val EBS_WRITE_BYTES_PER_SECOND: "EBS_WRITE_BYTES_PER_SECOND" = "EBS_WRITE_BYTES_PER_SECOND"

  inline def values: js.Array[MetricName] = js.Array(Cpu, Memory, EBS_READ_OPS_PER_SECOND, EBS_WRITE_OPS_PER_SECOND, EBS_READ_BYTES_PER_SECOND, EBS_WRITE_BYTES_PER_SECOND)
}

type MetricStatistic = "Maximum" | "Average"
object MetricStatistic {
  inline val Maximum: "Maximum" = "Maximum"
  inline val Average: "Average" = "Average"

  inline def values: js.Array[MetricStatistic] = js.Array(Maximum, Average)
}

type RecommendationSourceType = "Ec2Instance" | "AutoScalingGroup" | "EbsVolume" | "LambdaFunction"
object RecommendationSourceType {
  inline val Ec2Instance: "Ec2Instance" = "Ec2Instance"
  inline val AutoScalingGroup: "AutoScalingGroup" = "AutoScalingGroup"
  inline val EbsVolume: "EbsVolume" = "EbsVolume"
  inline val LambdaFunction: "LambdaFunction" = "LambdaFunction"

  inline def values: js.Array[RecommendationSourceType] = js.Array(Ec2Instance, AutoScalingGroup, EbsVolume, LambdaFunction)
}

type ResourceType = "Ec2Instance" | "AutoScalingGroup"
object ResourceType {
  inline val Ec2Instance: "Ec2Instance" = "Ec2Instance"
  inline val AutoScalingGroup: "AutoScalingGroup" = "AutoScalingGroup"

  inline def values: js.Array[ResourceType] = js.Array(Ec2Instance, AutoScalingGroup)
}

type Status = "Active" | "Inactive" | "Pending" | "Failed"
object Status {
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"
  inline val Pending: "Pending" = "Pending"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[Status] = js.Array(Active, Inactive, Pending, Failed)
}
