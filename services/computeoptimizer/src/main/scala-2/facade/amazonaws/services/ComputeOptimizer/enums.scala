package facade.amazonaws.services.computeoptimizer

import scalajs.js

@js.native
sealed trait EBSFilterName extends js.Any
object EBSFilterName {
  val Finding = "Finding".asInstanceOf[EBSFilterName]

  @inline def values: js.Array[EBSFilterName] = js.Array(Finding)
}

@js.native
sealed trait EBSFinding extends js.Any
object EBSFinding {
  val Optimized = "Optimized".asInstanceOf[EBSFinding]
  val NotOptimized = "NotOptimized".asInstanceOf[EBSFinding]

  @inline def values: js.Array[EBSFinding] = js.Array(Optimized, NotOptimized)
}

@js.native
sealed trait EBSMetricName extends js.Any
object EBSMetricName {
  val VolumeReadOpsPerSecond = "VolumeReadOpsPerSecond".asInstanceOf[EBSMetricName]
  val VolumeWriteOpsPerSecond = "VolumeWriteOpsPerSecond".asInstanceOf[EBSMetricName]
  val VolumeReadBytesPerSecond = "VolumeReadBytesPerSecond".asInstanceOf[EBSMetricName]
  val VolumeWriteBytesPerSecond = "VolumeWriteBytesPerSecond".asInstanceOf[EBSMetricName]

  @inline def values: js.Array[EBSMetricName] = js.Array(VolumeReadOpsPerSecond, VolumeWriteOpsPerSecond, VolumeReadBytesPerSecond, VolumeWriteBytesPerSecond)
}

@js.native
sealed trait ExportableAutoScalingGroupField extends js.Any
object ExportableAutoScalingGroupField {
  val AccountId = "AccountId".asInstanceOf[ExportableAutoScalingGroupField]
  val AutoScalingGroupArn = "AutoScalingGroupArn".asInstanceOf[ExportableAutoScalingGroupField]
  val AutoScalingGroupName = "AutoScalingGroupName".asInstanceOf[ExportableAutoScalingGroupField]
  val Finding = "Finding".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsCpuMaximum = "UtilizationMetricsCpuMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsMemoryMaximum = "UtilizationMetricsMemoryMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsEbsReadOpsPerSecondMaximum = "UtilizationMetricsEbsReadOpsPerSecondMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsEbsWriteOpsPerSecondMaximum = "UtilizationMetricsEbsWriteOpsPerSecondMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsEbsReadBytesPerSecondMaximum = "UtilizationMetricsEbsReadBytesPerSecondMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsEbsWriteBytesPerSecondMaximum = "UtilizationMetricsEbsWriteBytesPerSecondMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val LookbackPeriodInDays = "LookbackPeriodInDays".asInstanceOf[ExportableAutoScalingGroupField]
  val CurrentConfigurationInstanceType = "CurrentConfigurationInstanceType".asInstanceOf[ExportableAutoScalingGroupField]
  val CurrentConfigurationDesiredCapacity = "CurrentConfigurationDesiredCapacity".asInstanceOf[ExportableAutoScalingGroupField]
  val CurrentConfigurationMinSize = "CurrentConfigurationMinSize".asInstanceOf[ExportableAutoScalingGroupField]
  val CurrentConfigurationMaxSize = "CurrentConfigurationMaxSize".asInstanceOf[ExportableAutoScalingGroupField]
  val CurrentOnDemandPrice = "CurrentOnDemandPrice".asInstanceOf[ExportableAutoScalingGroupField]
  val CurrentStandardOneYearNoUpfrontReservedPrice = "CurrentStandardOneYearNoUpfrontReservedPrice".asInstanceOf[ExportableAutoScalingGroupField]
  val CurrentStandardThreeYearNoUpfrontReservedPrice = "CurrentStandardThreeYearNoUpfrontReservedPrice".asInstanceOf[ExportableAutoScalingGroupField]
  val CurrentVCpus = "CurrentVCpus".asInstanceOf[ExportableAutoScalingGroupField]
  val CurrentMemory = "CurrentMemory".asInstanceOf[ExportableAutoScalingGroupField]
  val CurrentStorage = "CurrentStorage".asInstanceOf[ExportableAutoScalingGroupField]
  val CurrentNetwork = "CurrentNetwork".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsConfigurationInstanceType = "RecommendationOptionsConfigurationInstanceType".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsConfigurationDesiredCapacity = "RecommendationOptionsConfigurationDesiredCapacity".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsConfigurationMinSize = "RecommendationOptionsConfigurationMinSize".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsConfigurationMaxSize = "RecommendationOptionsConfigurationMaxSize".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsProjectedUtilizationMetricsCpuMaximum = "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum = "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsPerformanceRisk = "RecommendationOptionsPerformanceRisk".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsOnDemandPrice = "RecommendationOptionsOnDemandPrice".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsStandardOneYearNoUpfrontReservedPrice = "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice = "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsVcpus = "RecommendationOptionsVcpus".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsMemory = "RecommendationOptionsMemory".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsStorage = "RecommendationOptionsStorage".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsNetwork = "RecommendationOptionsNetwork".asInstanceOf[ExportableAutoScalingGroupField]
  val LastRefreshTimestamp = "LastRefreshTimestamp".asInstanceOf[ExportableAutoScalingGroupField]

  @inline def values: js.Array[ExportableAutoScalingGroupField] = js.Array(
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

@js.native
sealed trait ExportableInstanceField extends js.Any
object ExportableInstanceField {
  val AccountId = "AccountId".asInstanceOf[ExportableInstanceField]
  val InstanceArn = "InstanceArn".asInstanceOf[ExportableInstanceField]
  val InstanceName = "InstanceName".asInstanceOf[ExportableInstanceField]
  val Finding = "Finding".asInstanceOf[ExportableInstanceField]
  val LookbackPeriodInDays = "LookbackPeriodInDays".asInstanceOf[ExportableInstanceField]
  val CurrentInstanceType = "CurrentInstanceType".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsCpuMaximum = "UtilizationMetricsCpuMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsMemoryMaximum = "UtilizationMetricsMemoryMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsEbsReadOpsPerSecondMaximum = "UtilizationMetricsEbsReadOpsPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsEbsWriteOpsPerSecondMaximum = "UtilizationMetricsEbsWriteOpsPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsEbsReadBytesPerSecondMaximum = "UtilizationMetricsEbsReadBytesPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsEbsWriteBytesPerSecondMaximum = "UtilizationMetricsEbsWriteBytesPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val CurrentOnDemandPrice = "CurrentOnDemandPrice".asInstanceOf[ExportableInstanceField]
  val CurrentStandardOneYearNoUpfrontReservedPrice = "CurrentStandardOneYearNoUpfrontReservedPrice".asInstanceOf[ExportableInstanceField]
  val CurrentStandardThreeYearNoUpfrontReservedPrice = "CurrentStandardThreeYearNoUpfrontReservedPrice".asInstanceOf[ExportableInstanceField]
  val CurrentVCpus = "CurrentVCpus".asInstanceOf[ExportableInstanceField]
  val CurrentMemory = "CurrentMemory".asInstanceOf[ExportableInstanceField]
  val CurrentStorage = "CurrentStorage".asInstanceOf[ExportableInstanceField]
  val CurrentNetwork = "CurrentNetwork".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsInstanceType = "RecommendationOptionsInstanceType".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsProjectedUtilizationMetricsCpuMaximum = "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum = "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsPerformanceRisk = "RecommendationOptionsPerformanceRisk".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsVcpus = "RecommendationOptionsVcpus".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsMemory = "RecommendationOptionsMemory".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsStorage = "RecommendationOptionsStorage".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsNetwork = "RecommendationOptionsNetwork".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsOnDemandPrice = "RecommendationOptionsOnDemandPrice".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsStandardOneYearNoUpfrontReservedPrice = "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice = "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice".asInstanceOf[ExportableInstanceField]
  val RecommendationsSourcesRecommendationSourceArn = "RecommendationsSourcesRecommendationSourceArn".asInstanceOf[ExportableInstanceField]
  val RecommendationsSourcesRecommendationSourceType = "RecommendationsSourcesRecommendationSourceType".asInstanceOf[ExportableInstanceField]
  val LastRefreshTimestamp = "LastRefreshTimestamp".asInstanceOf[ExportableInstanceField]

  @inline def values: js.Array[ExportableInstanceField] = js.Array(
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

@js.native
sealed trait FileFormat extends js.Any
object FileFormat {
  val Csv = "Csv".asInstanceOf[FileFormat]

  @inline def values: js.Array[FileFormat] = js.Array(Csv)
}

@js.native
sealed trait FilterName extends js.Any
object FilterName {
  val Finding = "Finding".asInstanceOf[FilterName]
  val RecommendationSourceType = "RecommendationSourceType".asInstanceOf[FilterName]

  @inline def values: js.Array[FilterName] = js.Array(Finding, RecommendationSourceType)
}

@js.native
sealed trait Finding extends js.Any
object Finding {
  val Underprovisioned = "Underprovisioned".asInstanceOf[Finding]
  val Overprovisioned = "Overprovisioned".asInstanceOf[Finding]
  val Optimized = "Optimized".asInstanceOf[Finding]
  val NotOptimized = "NotOptimized".asInstanceOf[Finding]

  @inline def values: js.Array[Finding] = js.Array(Underprovisioned, Overprovisioned, Optimized, NotOptimized)
}

@js.native
sealed trait FindingReasonCode extends js.Any
object FindingReasonCode {
  val MemoryOverprovisioned = "MemoryOverprovisioned".asInstanceOf[FindingReasonCode]
  val MemoryUnderprovisioned = "MemoryUnderprovisioned".asInstanceOf[FindingReasonCode]

  @inline def values: js.Array[FindingReasonCode] = js.Array(MemoryOverprovisioned, MemoryUnderprovisioned)
}

@js.native
sealed trait JobFilterName extends js.Any
object JobFilterName {
  val ResourceType = "ResourceType".asInstanceOf[JobFilterName]
  val JobStatus = "JobStatus".asInstanceOf[JobFilterName]

  @inline def values: js.Array[JobFilterName] = js.Array(ResourceType, JobStatus)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val Queued = "Queued".asInstanceOf[JobStatus]
  val InProgress = "InProgress".asInstanceOf[JobStatus]
  val Complete = "Complete".asInstanceOf[JobStatus]
  val Failed = "Failed".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(Queued, InProgress, Complete, Failed)
}

@js.native
sealed trait LambdaFunctionMemoryMetricName extends js.Any
object LambdaFunctionMemoryMetricName {
  val Duration = "Duration".asInstanceOf[LambdaFunctionMemoryMetricName]

  @inline def values: js.Array[LambdaFunctionMemoryMetricName] = js.Array(Duration)
}

@js.native
sealed trait LambdaFunctionMemoryMetricStatistic extends js.Any
object LambdaFunctionMemoryMetricStatistic {
  val LowerBound = "LowerBound".asInstanceOf[LambdaFunctionMemoryMetricStatistic]
  val UpperBound = "UpperBound".asInstanceOf[LambdaFunctionMemoryMetricStatistic]
  val Expected = "Expected".asInstanceOf[LambdaFunctionMemoryMetricStatistic]

  @inline def values: js.Array[LambdaFunctionMemoryMetricStatistic] = js.Array(LowerBound, UpperBound, Expected)
}

@js.native
sealed trait LambdaFunctionMetricName extends js.Any
object LambdaFunctionMetricName {
  val Duration = "Duration".asInstanceOf[LambdaFunctionMetricName]
  val Memory = "Memory".asInstanceOf[LambdaFunctionMetricName]

  @inline def values: js.Array[LambdaFunctionMetricName] = js.Array(Duration, Memory)
}

@js.native
sealed trait LambdaFunctionMetricStatistic extends js.Any
object LambdaFunctionMetricStatistic {
  val Maximum = "Maximum".asInstanceOf[LambdaFunctionMetricStatistic]
  val Average = "Average".asInstanceOf[LambdaFunctionMetricStatistic]

  @inline def values: js.Array[LambdaFunctionMetricStatistic] = js.Array(Maximum, Average)
}

@js.native
sealed trait LambdaFunctionRecommendationFilterName extends js.Any
object LambdaFunctionRecommendationFilterName {
  val Finding = "Finding".asInstanceOf[LambdaFunctionRecommendationFilterName]
  val FindingReasonCode = "FindingReasonCode".asInstanceOf[LambdaFunctionRecommendationFilterName]

  @inline def values: js.Array[LambdaFunctionRecommendationFilterName] = js.Array(Finding, FindingReasonCode)
}

@js.native
sealed trait LambdaFunctionRecommendationFinding extends js.Any
object LambdaFunctionRecommendationFinding {
  val Optimized = "Optimized".asInstanceOf[LambdaFunctionRecommendationFinding]
  val NotOptimized = "NotOptimized".asInstanceOf[LambdaFunctionRecommendationFinding]
  val Unavailable = "Unavailable".asInstanceOf[LambdaFunctionRecommendationFinding]

  @inline def values: js.Array[LambdaFunctionRecommendationFinding] = js.Array(Optimized, NotOptimized, Unavailable)
}

@js.native
sealed trait LambdaFunctionRecommendationFindingReasonCode extends js.Any
object LambdaFunctionRecommendationFindingReasonCode {
  val MemoryOverprovisioned = "MemoryOverprovisioned".asInstanceOf[LambdaFunctionRecommendationFindingReasonCode]
  val MemoryUnderprovisioned = "MemoryUnderprovisioned".asInstanceOf[LambdaFunctionRecommendationFindingReasonCode]
  val InsufficientData = "InsufficientData".asInstanceOf[LambdaFunctionRecommendationFindingReasonCode]
  val Inconclusive = "Inconclusive".asInstanceOf[LambdaFunctionRecommendationFindingReasonCode]

  @inline def values: js.Array[LambdaFunctionRecommendationFindingReasonCode] = js.Array(MemoryOverprovisioned, MemoryUnderprovisioned, InsufficientData, Inconclusive)
}

@js.native
sealed trait MetricName extends js.Any
object MetricName {
  val Cpu = "Cpu".asInstanceOf[MetricName]
  val Memory = "Memory".asInstanceOf[MetricName]
  val EBS_READ_OPS_PER_SECOND = "EBS_READ_OPS_PER_SECOND".asInstanceOf[MetricName]
  val EBS_WRITE_OPS_PER_SECOND = "EBS_WRITE_OPS_PER_SECOND".asInstanceOf[MetricName]
  val EBS_READ_BYTES_PER_SECOND = "EBS_READ_BYTES_PER_SECOND".asInstanceOf[MetricName]
  val EBS_WRITE_BYTES_PER_SECOND = "EBS_WRITE_BYTES_PER_SECOND".asInstanceOf[MetricName]

  @inline def values: js.Array[MetricName] = js.Array(Cpu, Memory, EBS_READ_OPS_PER_SECOND, EBS_WRITE_OPS_PER_SECOND, EBS_READ_BYTES_PER_SECOND, EBS_WRITE_BYTES_PER_SECOND)
}

@js.native
sealed trait MetricStatistic extends js.Any
object MetricStatistic {
  val Maximum = "Maximum".asInstanceOf[MetricStatistic]
  val Average = "Average".asInstanceOf[MetricStatistic]

  @inline def values: js.Array[MetricStatistic] = js.Array(Maximum, Average)
}

@js.native
sealed trait RecommendationSourceType extends js.Any
object RecommendationSourceType {
  val Ec2Instance = "Ec2Instance".asInstanceOf[RecommendationSourceType]
  val AutoScalingGroup = "AutoScalingGroup".asInstanceOf[RecommendationSourceType]
  val EbsVolume = "EbsVolume".asInstanceOf[RecommendationSourceType]
  val LambdaFunction = "LambdaFunction".asInstanceOf[RecommendationSourceType]

  @inline def values: js.Array[RecommendationSourceType] = js.Array(Ec2Instance, AutoScalingGroup, EbsVolume, LambdaFunction)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val Ec2Instance = "Ec2Instance".asInstanceOf[ResourceType]
  val AutoScalingGroup = "AutoScalingGroup".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(Ec2Instance, AutoScalingGroup)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val Active = "Active".asInstanceOf[Status]
  val Inactive = "Inactive".asInstanceOf[Status]
  val Pending = "Pending".asInstanceOf[Status]
  val Failed = "Failed".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(Active, Inactive, Pending, Failed)
}
