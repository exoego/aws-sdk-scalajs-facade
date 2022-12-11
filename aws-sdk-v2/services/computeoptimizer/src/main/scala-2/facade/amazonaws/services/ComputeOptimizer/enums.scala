package facade.amazonaws.services.computeoptimizer

import scalajs.js

@js.native
sealed trait CpuVendorArchitecture extends js.Any
object CpuVendorArchitecture {
  val AWS_ARM64 = "AWS_ARM64".asInstanceOf[CpuVendorArchitecture]
  val CURRENT = "CURRENT".asInstanceOf[CpuVendorArchitecture]

  @inline def values: js.Array[CpuVendorArchitecture] = js.Array(AWS_ARM64, CURRENT)
}

@js.native
sealed trait Currency extends js.Any
object Currency {
  val USD = "USD".asInstanceOf[Currency]
  val CNY = "CNY".asInstanceOf[Currency]

  @inline def values: js.Array[Currency] = js.Array(USD, CNY)
}

@js.native
sealed trait CurrentPerformanceRisk extends js.Any
object CurrentPerformanceRisk {
  val VeryLow = "VeryLow".asInstanceOf[CurrentPerformanceRisk]
  val Low = "Low".asInstanceOf[CurrentPerformanceRisk]
  val Medium = "Medium".asInstanceOf[CurrentPerformanceRisk]
  val High = "High".asInstanceOf[CurrentPerformanceRisk]

  @inline def values: js.Array[CurrentPerformanceRisk] = js.Array(VeryLow, Low, Medium, High)
}

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
sealed trait EnhancedInfrastructureMetrics extends js.Any
object EnhancedInfrastructureMetrics {
  val Active = "Active".asInstanceOf[EnhancedInfrastructureMetrics]
  val Inactive = "Inactive".asInstanceOf[EnhancedInfrastructureMetrics]

  @inline def values: js.Array[EnhancedInfrastructureMetrics] = js.Array(Active, Inactive)
}

@js.native
sealed trait EnrollmentFilterName extends js.Any
object EnrollmentFilterName {
  val Status = "Status".asInstanceOf[EnrollmentFilterName]

  @inline def values: js.Array[EnrollmentFilterName] = js.Array(Status)
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
  val UtilizationMetricsDiskReadOpsPerSecondMaximum = "UtilizationMetricsDiskReadOpsPerSecondMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsDiskWriteOpsPerSecondMaximum = "UtilizationMetricsDiskWriteOpsPerSecondMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsDiskReadBytesPerSecondMaximum = "UtilizationMetricsDiskReadBytesPerSecondMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsDiskWriteBytesPerSecondMaximum = "UtilizationMetricsDiskWriteBytesPerSecondMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsNetworkInBytesPerSecondMaximum = "UtilizationMetricsNetworkInBytesPerSecondMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsNetworkOutBytesPerSecondMaximum = "UtilizationMetricsNetworkOutBytesPerSecondMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsNetworkPacketsInPerSecondMaximum = "UtilizationMetricsNetworkPacketsInPerSecondMaximum".asInstanceOf[ExportableAutoScalingGroupField]
  val UtilizationMetricsNetworkPacketsOutPerSecondMaximum = "UtilizationMetricsNetworkPacketsOutPerSecondMaximum".asInstanceOf[ExportableAutoScalingGroupField]
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
  val CurrentPerformanceRisk = "CurrentPerformanceRisk".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsSavingsOpportunityPercentage = "RecommendationOptionsSavingsOpportunityPercentage".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsEstimatedMonthlySavingsCurrency = "RecommendationOptionsEstimatedMonthlySavingsCurrency".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsEstimatedMonthlySavingsValue = "RecommendationOptionsEstimatedMonthlySavingsValue".asInstanceOf[ExportableAutoScalingGroupField]
  val EffectiveRecommendationPreferencesCpuVendorArchitectures = "EffectiveRecommendationPreferencesCpuVendorArchitectures".asInstanceOf[ExportableAutoScalingGroupField]
  val EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics = "EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics".asInstanceOf[ExportableAutoScalingGroupField]
  val EffectiveRecommendationPreferencesInferredWorkloadTypes = "EffectiveRecommendationPreferencesInferredWorkloadTypes".asInstanceOf[ExportableAutoScalingGroupField]
  val InferredWorkloadTypes = "InferredWorkloadTypes".asInstanceOf[ExportableAutoScalingGroupField]
  val RecommendationOptionsMigrationEffort = "RecommendationOptionsMigrationEffort".asInstanceOf[ExportableAutoScalingGroupField]

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
    UtilizationMetricsDiskReadOpsPerSecondMaximum,
    UtilizationMetricsDiskWriteOpsPerSecondMaximum,
    UtilizationMetricsDiskReadBytesPerSecondMaximum,
    UtilizationMetricsDiskWriteBytesPerSecondMaximum,
    UtilizationMetricsNetworkInBytesPerSecondMaximum,
    UtilizationMetricsNetworkOutBytesPerSecondMaximum,
    UtilizationMetricsNetworkPacketsInPerSecondMaximum,
    UtilizationMetricsNetworkPacketsOutPerSecondMaximum,
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
    LastRefreshTimestamp,
    CurrentPerformanceRisk,
    RecommendationOptionsSavingsOpportunityPercentage,
    RecommendationOptionsEstimatedMonthlySavingsCurrency,
    RecommendationOptionsEstimatedMonthlySavingsValue,
    EffectiveRecommendationPreferencesCpuVendorArchitectures,
    EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics,
    EffectiveRecommendationPreferencesInferredWorkloadTypes,
    InferredWorkloadTypes,
    RecommendationOptionsMigrationEffort
  )
}

@js.native
sealed trait ExportableInstanceField extends js.Any
object ExportableInstanceField {
  val AccountId = "AccountId".asInstanceOf[ExportableInstanceField]
  val InstanceArn = "InstanceArn".asInstanceOf[ExportableInstanceField]
  val InstanceName = "InstanceName".asInstanceOf[ExportableInstanceField]
  val Finding = "Finding".asInstanceOf[ExportableInstanceField]
  val FindingReasonCodes = "FindingReasonCodes".asInstanceOf[ExportableInstanceField]
  val LookbackPeriodInDays = "LookbackPeriodInDays".asInstanceOf[ExportableInstanceField]
  val CurrentInstanceType = "CurrentInstanceType".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsCpuMaximum = "UtilizationMetricsCpuMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsMemoryMaximum = "UtilizationMetricsMemoryMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsEbsReadOpsPerSecondMaximum = "UtilizationMetricsEbsReadOpsPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsEbsWriteOpsPerSecondMaximum = "UtilizationMetricsEbsWriteOpsPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsEbsReadBytesPerSecondMaximum = "UtilizationMetricsEbsReadBytesPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsEbsWriteBytesPerSecondMaximum = "UtilizationMetricsEbsWriteBytesPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsDiskReadOpsPerSecondMaximum = "UtilizationMetricsDiskReadOpsPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsDiskWriteOpsPerSecondMaximum = "UtilizationMetricsDiskWriteOpsPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsDiskReadBytesPerSecondMaximum = "UtilizationMetricsDiskReadBytesPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsDiskWriteBytesPerSecondMaximum = "UtilizationMetricsDiskWriteBytesPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsNetworkInBytesPerSecondMaximum = "UtilizationMetricsNetworkInBytesPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsNetworkOutBytesPerSecondMaximum = "UtilizationMetricsNetworkOutBytesPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsNetworkPacketsInPerSecondMaximum = "UtilizationMetricsNetworkPacketsInPerSecondMaximum".asInstanceOf[ExportableInstanceField]
  val UtilizationMetricsNetworkPacketsOutPerSecondMaximum = "UtilizationMetricsNetworkPacketsOutPerSecondMaximum".asInstanceOf[ExportableInstanceField]
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
  val RecommendationOptionsPlatformDifferences = "RecommendationOptionsPlatformDifferences".asInstanceOf[ExportableInstanceField]
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
  val CurrentPerformanceRisk = "CurrentPerformanceRisk".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsSavingsOpportunityPercentage = "RecommendationOptionsSavingsOpportunityPercentage".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsEstimatedMonthlySavingsCurrency = "RecommendationOptionsEstimatedMonthlySavingsCurrency".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsEstimatedMonthlySavingsValue = "RecommendationOptionsEstimatedMonthlySavingsValue".asInstanceOf[ExportableInstanceField]
  val EffectiveRecommendationPreferencesCpuVendorArchitectures = "EffectiveRecommendationPreferencesCpuVendorArchitectures".asInstanceOf[ExportableInstanceField]
  val EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics = "EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics".asInstanceOf[ExportableInstanceField]
  val EffectiveRecommendationPreferencesInferredWorkloadTypes = "EffectiveRecommendationPreferencesInferredWorkloadTypes".asInstanceOf[ExportableInstanceField]
  val InferredWorkloadTypes = "InferredWorkloadTypes".asInstanceOf[ExportableInstanceField]
  val RecommendationOptionsMigrationEffort = "RecommendationOptionsMigrationEffort".asInstanceOf[ExportableInstanceField]
  val EffectiveRecommendationPreferencesExternalMetricsSource = "EffectiveRecommendationPreferencesExternalMetricsSource".asInstanceOf[ExportableInstanceField]

  @inline def values: js.Array[ExportableInstanceField] = js.Array(
    AccountId,
    InstanceArn,
    InstanceName,
    Finding,
    FindingReasonCodes,
    LookbackPeriodInDays,
    CurrentInstanceType,
    UtilizationMetricsCpuMaximum,
    UtilizationMetricsMemoryMaximum,
    UtilizationMetricsEbsReadOpsPerSecondMaximum,
    UtilizationMetricsEbsWriteOpsPerSecondMaximum,
    UtilizationMetricsEbsReadBytesPerSecondMaximum,
    UtilizationMetricsEbsWriteBytesPerSecondMaximum,
    UtilizationMetricsDiskReadOpsPerSecondMaximum,
    UtilizationMetricsDiskWriteOpsPerSecondMaximum,
    UtilizationMetricsDiskReadBytesPerSecondMaximum,
    UtilizationMetricsDiskWriteBytesPerSecondMaximum,
    UtilizationMetricsNetworkInBytesPerSecondMaximum,
    UtilizationMetricsNetworkOutBytesPerSecondMaximum,
    UtilizationMetricsNetworkPacketsInPerSecondMaximum,
    UtilizationMetricsNetworkPacketsOutPerSecondMaximum,
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
    RecommendationOptionsPlatformDifferences,
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
    LastRefreshTimestamp,
    CurrentPerformanceRisk,
    RecommendationOptionsSavingsOpportunityPercentage,
    RecommendationOptionsEstimatedMonthlySavingsCurrency,
    RecommendationOptionsEstimatedMonthlySavingsValue,
    EffectiveRecommendationPreferencesCpuVendorArchitectures,
    EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics,
    EffectiveRecommendationPreferencesInferredWorkloadTypes,
    InferredWorkloadTypes,
    RecommendationOptionsMigrationEffort,
    EffectiveRecommendationPreferencesExternalMetricsSource
  )
}

@js.native
sealed trait ExportableLambdaFunctionField extends js.Any
object ExportableLambdaFunctionField {
  val AccountId = "AccountId".asInstanceOf[ExportableLambdaFunctionField]
  val FunctionArn = "FunctionArn".asInstanceOf[ExportableLambdaFunctionField]
  val FunctionVersion = "FunctionVersion".asInstanceOf[ExportableLambdaFunctionField]
  val Finding = "Finding".asInstanceOf[ExportableLambdaFunctionField]
  val FindingReasonCodes = "FindingReasonCodes".asInstanceOf[ExportableLambdaFunctionField]
  val NumberOfInvocations = "NumberOfInvocations".asInstanceOf[ExportableLambdaFunctionField]
  val UtilizationMetricsDurationMaximum = "UtilizationMetricsDurationMaximum".asInstanceOf[ExportableLambdaFunctionField]
  val UtilizationMetricsDurationAverage = "UtilizationMetricsDurationAverage".asInstanceOf[ExportableLambdaFunctionField]
  val UtilizationMetricsMemoryMaximum = "UtilizationMetricsMemoryMaximum".asInstanceOf[ExportableLambdaFunctionField]
  val UtilizationMetricsMemoryAverage = "UtilizationMetricsMemoryAverage".asInstanceOf[ExportableLambdaFunctionField]
  val LookbackPeriodInDays = "LookbackPeriodInDays".asInstanceOf[ExportableLambdaFunctionField]
  val CurrentConfigurationMemorySize = "CurrentConfigurationMemorySize".asInstanceOf[ExportableLambdaFunctionField]
  val CurrentConfigurationTimeout = "CurrentConfigurationTimeout".asInstanceOf[ExportableLambdaFunctionField]
  val CurrentCostTotal = "CurrentCostTotal".asInstanceOf[ExportableLambdaFunctionField]
  val CurrentCostAverage = "CurrentCostAverage".asInstanceOf[ExportableLambdaFunctionField]
  val RecommendationOptionsConfigurationMemorySize = "RecommendationOptionsConfigurationMemorySize".asInstanceOf[ExportableLambdaFunctionField]
  val RecommendationOptionsCostLow = "RecommendationOptionsCostLow".asInstanceOf[ExportableLambdaFunctionField]
  val RecommendationOptionsCostHigh = "RecommendationOptionsCostHigh".asInstanceOf[ExportableLambdaFunctionField]
  val RecommendationOptionsProjectedUtilizationMetricsDurationLowerBound = "RecommendationOptionsProjectedUtilizationMetricsDurationLowerBound".asInstanceOf[ExportableLambdaFunctionField]
  val RecommendationOptionsProjectedUtilizationMetricsDurationUpperBound = "RecommendationOptionsProjectedUtilizationMetricsDurationUpperBound".asInstanceOf[ExportableLambdaFunctionField]
  val RecommendationOptionsProjectedUtilizationMetricsDurationExpected = "RecommendationOptionsProjectedUtilizationMetricsDurationExpected".asInstanceOf[ExportableLambdaFunctionField]
  val LastRefreshTimestamp = "LastRefreshTimestamp".asInstanceOf[ExportableLambdaFunctionField]
  val CurrentPerformanceRisk = "CurrentPerformanceRisk".asInstanceOf[ExportableLambdaFunctionField]
  val RecommendationOptionsSavingsOpportunityPercentage = "RecommendationOptionsSavingsOpportunityPercentage".asInstanceOf[ExportableLambdaFunctionField]
  val RecommendationOptionsEstimatedMonthlySavingsCurrency = "RecommendationOptionsEstimatedMonthlySavingsCurrency".asInstanceOf[ExportableLambdaFunctionField]
  val RecommendationOptionsEstimatedMonthlySavingsValue = "RecommendationOptionsEstimatedMonthlySavingsValue".asInstanceOf[ExportableLambdaFunctionField]

  @inline def values: js.Array[ExportableLambdaFunctionField] = js.Array(
    AccountId,
    FunctionArn,
    FunctionVersion,
    Finding,
    FindingReasonCodes,
    NumberOfInvocations,
    UtilizationMetricsDurationMaximum,
    UtilizationMetricsDurationAverage,
    UtilizationMetricsMemoryMaximum,
    UtilizationMetricsMemoryAverage,
    LookbackPeriodInDays,
    CurrentConfigurationMemorySize,
    CurrentConfigurationTimeout,
    CurrentCostTotal,
    CurrentCostAverage,
    RecommendationOptionsConfigurationMemorySize,
    RecommendationOptionsCostLow,
    RecommendationOptionsCostHigh,
    RecommendationOptionsProjectedUtilizationMetricsDurationLowerBound,
    RecommendationOptionsProjectedUtilizationMetricsDurationUpperBound,
    RecommendationOptionsProjectedUtilizationMetricsDurationExpected,
    LastRefreshTimestamp,
    CurrentPerformanceRisk,
    RecommendationOptionsSavingsOpportunityPercentage,
    RecommendationOptionsEstimatedMonthlySavingsCurrency,
    RecommendationOptionsEstimatedMonthlySavingsValue
  )
}

@js.native
sealed trait ExportableVolumeField extends js.Any
object ExportableVolumeField {
  val AccountId = "AccountId".asInstanceOf[ExportableVolumeField]
  val VolumeArn = "VolumeArn".asInstanceOf[ExportableVolumeField]
  val Finding = "Finding".asInstanceOf[ExportableVolumeField]
  val UtilizationMetricsVolumeReadOpsPerSecondMaximum = "UtilizationMetricsVolumeReadOpsPerSecondMaximum".asInstanceOf[ExportableVolumeField]
  val UtilizationMetricsVolumeWriteOpsPerSecondMaximum = "UtilizationMetricsVolumeWriteOpsPerSecondMaximum".asInstanceOf[ExportableVolumeField]
  val UtilizationMetricsVolumeReadBytesPerSecondMaximum = "UtilizationMetricsVolumeReadBytesPerSecondMaximum".asInstanceOf[ExportableVolumeField]
  val UtilizationMetricsVolumeWriteBytesPerSecondMaximum = "UtilizationMetricsVolumeWriteBytesPerSecondMaximum".asInstanceOf[ExportableVolumeField]
  val LookbackPeriodInDays = "LookbackPeriodInDays".asInstanceOf[ExportableVolumeField]
  val CurrentConfigurationVolumeType = "CurrentConfigurationVolumeType".asInstanceOf[ExportableVolumeField]
  val CurrentConfigurationVolumeBaselineIOPS = "CurrentConfigurationVolumeBaselineIOPS".asInstanceOf[ExportableVolumeField]
  val CurrentConfigurationVolumeBaselineThroughput = "CurrentConfigurationVolumeBaselineThroughput".asInstanceOf[ExportableVolumeField]
  val CurrentConfigurationVolumeBurstIOPS = "CurrentConfigurationVolumeBurstIOPS".asInstanceOf[ExportableVolumeField]
  val CurrentConfigurationVolumeBurstThroughput = "CurrentConfigurationVolumeBurstThroughput".asInstanceOf[ExportableVolumeField]
  val CurrentConfigurationVolumeSize = "CurrentConfigurationVolumeSize".asInstanceOf[ExportableVolumeField]
  val CurrentMonthlyPrice = "CurrentMonthlyPrice".asInstanceOf[ExportableVolumeField]
  val RecommendationOptionsConfigurationVolumeType = "RecommendationOptionsConfigurationVolumeType".asInstanceOf[ExportableVolumeField]
  val RecommendationOptionsConfigurationVolumeBaselineIOPS = "RecommendationOptionsConfigurationVolumeBaselineIOPS".asInstanceOf[ExportableVolumeField]
  val RecommendationOptionsConfigurationVolumeBaselineThroughput = "RecommendationOptionsConfigurationVolumeBaselineThroughput".asInstanceOf[ExportableVolumeField]
  val RecommendationOptionsConfigurationVolumeBurstIOPS = "RecommendationOptionsConfigurationVolumeBurstIOPS".asInstanceOf[ExportableVolumeField]
  val RecommendationOptionsConfigurationVolumeBurstThroughput = "RecommendationOptionsConfigurationVolumeBurstThroughput".asInstanceOf[ExportableVolumeField]
  val RecommendationOptionsConfigurationVolumeSize = "RecommendationOptionsConfigurationVolumeSize".asInstanceOf[ExportableVolumeField]
  val RecommendationOptionsMonthlyPrice = "RecommendationOptionsMonthlyPrice".asInstanceOf[ExportableVolumeField]
  val RecommendationOptionsPerformanceRisk = "RecommendationOptionsPerformanceRisk".asInstanceOf[ExportableVolumeField]
  val LastRefreshTimestamp = "LastRefreshTimestamp".asInstanceOf[ExportableVolumeField]
  val CurrentPerformanceRisk = "CurrentPerformanceRisk".asInstanceOf[ExportableVolumeField]
  val RecommendationOptionsSavingsOpportunityPercentage = "RecommendationOptionsSavingsOpportunityPercentage".asInstanceOf[ExportableVolumeField]
  val RecommendationOptionsEstimatedMonthlySavingsCurrency = "RecommendationOptionsEstimatedMonthlySavingsCurrency".asInstanceOf[ExportableVolumeField]
  val RecommendationOptionsEstimatedMonthlySavingsValue = "RecommendationOptionsEstimatedMonthlySavingsValue".asInstanceOf[ExportableVolumeField]

  @inline def values: js.Array[ExportableVolumeField] = js.Array(
    AccountId,
    VolumeArn,
    Finding,
    UtilizationMetricsVolumeReadOpsPerSecondMaximum,
    UtilizationMetricsVolumeWriteOpsPerSecondMaximum,
    UtilizationMetricsVolumeReadBytesPerSecondMaximum,
    UtilizationMetricsVolumeWriteBytesPerSecondMaximum,
    LookbackPeriodInDays,
    CurrentConfigurationVolumeType,
    CurrentConfigurationVolumeBaselineIOPS,
    CurrentConfigurationVolumeBaselineThroughput,
    CurrentConfigurationVolumeBurstIOPS,
    CurrentConfigurationVolumeBurstThroughput,
    CurrentConfigurationVolumeSize,
    CurrentMonthlyPrice,
    RecommendationOptionsConfigurationVolumeType,
    RecommendationOptionsConfigurationVolumeBaselineIOPS,
    RecommendationOptionsConfigurationVolumeBaselineThroughput,
    RecommendationOptionsConfigurationVolumeBurstIOPS,
    RecommendationOptionsConfigurationVolumeBurstThroughput,
    RecommendationOptionsConfigurationVolumeSize,
    RecommendationOptionsMonthlyPrice,
    RecommendationOptionsPerformanceRisk,
    LastRefreshTimestamp,
    CurrentPerformanceRisk,
    RecommendationOptionsSavingsOpportunityPercentage,
    RecommendationOptionsEstimatedMonthlySavingsCurrency,
    RecommendationOptionsEstimatedMonthlySavingsValue
  )
}

@js.native
sealed trait ExternalMetricsSource extends js.Any
object ExternalMetricsSource {
  val Datadog = "Datadog".asInstanceOf[ExternalMetricsSource]
  val Dynatrace = "Dynatrace".asInstanceOf[ExternalMetricsSource]
  val NewRelic = "NewRelic".asInstanceOf[ExternalMetricsSource]
  val Instana = "Instana".asInstanceOf[ExternalMetricsSource]

  @inline def values: js.Array[ExternalMetricsSource] = js.Array(Datadog, Dynatrace, NewRelic, Instana)
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
  val FindingReasonCodes = "FindingReasonCodes".asInstanceOf[FilterName]
  val RecommendationSourceType = "RecommendationSourceType".asInstanceOf[FilterName]

  @inline def values: js.Array[FilterName] = js.Array(Finding, FindingReasonCodes, RecommendationSourceType)
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
sealed trait InferredWorkloadType extends js.Any
object InferredWorkloadType {
  val AmazonEmr = "AmazonEmr".asInstanceOf[InferredWorkloadType]
  val ApacheCassandra = "ApacheCassandra".asInstanceOf[InferredWorkloadType]
  val ApacheHadoop = "ApacheHadoop".asInstanceOf[InferredWorkloadType]
  val Memcached = "Memcached".asInstanceOf[InferredWorkloadType]
  val Nginx = "Nginx".asInstanceOf[InferredWorkloadType]
  val PostgreSql = "PostgreSql".asInstanceOf[InferredWorkloadType]
  val Redis = "Redis".asInstanceOf[InferredWorkloadType]

  @inline def values: js.Array[InferredWorkloadType] = js.Array(AmazonEmr, ApacheCassandra, ApacheHadoop, Memcached, Nginx, PostgreSql, Redis)
}

@js.native
sealed trait InferredWorkloadTypesPreference extends js.Any
object InferredWorkloadTypesPreference {
  val Active = "Active".asInstanceOf[InferredWorkloadTypesPreference]
  val Inactive = "Inactive".asInstanceOf[InferredWorkloadTypesPreference]

  @inline def values: js.Array[InferredWorkloadTypesPreference] = js.Array(Active, Inactive)
}

@js.native
sealed trait InstanceRecommendationFindingReasonCode extends js.Any
object InstanceRecommendationFindingReasonCode {
  val CPUOverprovisioned = "CPUOverprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val CPUUnderprovisioned = "CPUUnderprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val MemoryOverprovisioned = "MemoryOverprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val MemoryUnderprovisioned = "MemoryUnderprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val EBSThroughputOverprovisioned = "EBSThroughputOverprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val EBSThroughputUnderprovisioned = "EBSThroughputUnderprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val EBSIOPSOverprovisioned = "EBSIOPSOverprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val EBSIOPSUnderprovisioned = "EBSIOPSUnderprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val NetworkBandwidthOverprovisioned = "NetworkBandwidthOverprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val NetworkBandwidthUnderprovisioned = "NetworkBandwidthUnderprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val NetworkPPSOverprovisioned = "NetworkPPSOverprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val NetworkPPSUnderprovisioned = "NetworkPPSUnderprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val DiskIOPSOverprovisioned = "DiskIOPSOverprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val DiskIOPSUnderprovisioned = "DiskIOPSUnderprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val DiskThroughputOverprovisioned = "DiskThroughputOverprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]
  val DiskThroughputUnderprovisioned = "DiskThroughputUnderprovisioned".asInstanceOf[InstanceRecommendationFindingReasonCode]

  @inline def values: js.Array[InstanceRecommendationFindingReasonCode] = js.Array(
    CPUOverprovisioned,
    CPUUnderprovisioned,
    MemoryOverprovisioned,
    MemoryUnderprovisioned,
    EBSThroughputOverprovisioned,
    EBSThroughputUnderprovisioned,
    EBSIOPSOverprovisioned,
    EBSIOPSUnderprovisioned,
    NetworkBandwidthOverprovisioned,
    NetworkBandwidthUnderprovisioned,
    NetworkPPSOverprovisioned,
    NetworkPPSUnderprovisioned,
    DiskIOPSOverprovisioned,
    DiskIOPSUnderprovisioned,
    DiskThroughputOverprovisioned,
    DiskThroughputUnderprovisioned
  )
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
  val DISK_READ_OPS_PER_SECOND = "DISK_READ_OPS_PER_SECOND".asInstanceOf[MetricName]
  val DISK_WRITE_OPS_PER_SECOND = "DISK_WRITE_OPS_PER_SECOND".asInstanceOf[MetricName]
  val DISK_READ_BYTES_PER_SECOND = "DISK_READ_BYTES_PER_SECOND".asInstanceOf[MetricName]
  val DISK_WRITE_BYTES_PER_SECOND = "DISK_WRITE_BYTES_PER_SECOND".asInstanceOf[MetricName]
  val NETWORK_IN_BYTES_PER_SECOND = "NETWORK_IN_BYTES_PER_SECOND".asInstanceOf[MetricName]
  val NETWORK_OUT_BYTES_PER_SECOND = "NETWORK_OUT_BYTES_PER_SECOND".asInstanceOf[MetricName]
  val NETWORK_PACKETS_IN_PER_SECOND = "NETWORK_PACKETS_IN_PER_SECOND".asInstanceOf[MetricName]
  val NETWORK_PACKETS_OUT_PER_SECOND = "NETWORK_PACKETS_OUT_PER_SECOND".asInstanceOf[MetricName]

  @inline def values: js.Array[MetricName] = js.Array(
    Cpu,
    Memory,
    EBS_READ_OPS_PER_SECOND,
    EBS_WRITE_OPS_PER_SECOND,
    EBS_READ_BYTES_PER_SECOND,
    EBS_WRITE_BYTES_PER_SECOND,
    DISK_READ_OPS_PER_SECOND,
    DISK_WRITE_OPS_PER_SECOND,
    DISK_READ_BYTES_PER_SECOND,
    DISK_WRITE_BYTES_PER_SECOND,
    NETWORK_IN_BYTES_PER_SECOND,
    NETWORK_OUT_BYTES_PER_SECOND,
    NETWORK_PACKETS_IN_PER_SECOND,
    NETWORK_PACKETS_OUT_PER_SECOND
  )
}

@js.native
sealed trait MetricStatistic extends js.Any
object MetricStatistic {
  val Maximum = "Maximum".asInstanceOf[MetricStatistic]
  val Average = "Average".asInstanceOf[MetricStatistic]

  @inline def values: js.Array[MetricStatistic] = js.Array(Maximum, Average)
}

@js.native
sealed trait MigrationEffort extends js.Any
object MigrationEffort {
  val VeryLow = "VeryLow".asInstanceOf[MigrationEffort]
  val Low = "Low".asInstanceOf[MigrationEffort]
  val Medium = "Medium".asInstanceOf[MigrationEffort]
  val High = "High".asInstanceOf[MigrationEffort]

  @inline def values: js.Array[MigrationEffort] = js.Array(VeryLow, Low, Medium, High)
}

@js.native
sealed trait PlatformDifference extends js.Any
object PlatformDifference {
  val Hypervisor = "Hypervisor".asInstanceOf[PlatformDifference]
  val NetworkInterface = "NetworkInterface".asInstanceOf[PlatformDifference]
  val StorageInterface = "StorageInterface".asInstanceOf[PlatformDifference]
  val InstanceStoreAvailability = "InstanceStoreAvailability".asInstanceOf[PlatformDifference]
  val VirtualizationType = "VirtualizationType".asInstanceOf[PlatformDifference]
  val Architecture = "Architecture".asInstanceOf[PlatformDifference]

  @inline def values: js.Array[PlatformDifference] = js.Array(Hypervisor, NetworkInterface, StorageInterface, InstanceStoreAvailability, VirtualizationType, Architecture)
}

@js.native
sealed trait RecommendationPreferenceName extends js.Any
object RecommendationPreferenceName {
  val EnhancedInfrastructureMetrics = "EnhancedInfrastructureMetrics".asInstanceOf[RecommendationPreferenceName]
  val InferredWorkloadTypes = "InferredWorkloadTypes".asInstanceOf[RecommendationPreferenceName]
  val ExternalMetricsPreference = "ExternalMetricsPreference".asInstanceOf[RecommendationPreferenceName]

  @inline def values: js.Array[RecommendationPreferenceName] = js.Array(EnhancedInfrastructureMetrics, InferredWorkloadTypes, ExternalMetricsPreference)
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
  val EbsVolume = "EbsVolume".asInstanceOf[ResourceType]
  val LambdaFunction = "LambdaFunction".asInstanceOf[ResourceType]
  val NotApplicable = "NotApplicable".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(Ec2Instance, AutoScalingGroup, EbsVolume, LambdaFunction, NotApplicable)
}

@js.native
sealed trait ScopeName extends js.Any
object ScopeName {
  val Organization = "Organization".asInstanceOf[ScopeName]
  val AccountId = "AccountId".asInstanceOf[ScopeName]
  val ResourceArn = "ResourceArn".asInstanceOf[ScopeName]

  @inline def values: js.Array[ScopeName] = js.Array(Organization, AccountId, ResourceArn)
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
