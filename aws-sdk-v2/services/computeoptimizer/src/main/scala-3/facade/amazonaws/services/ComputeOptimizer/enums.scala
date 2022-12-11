package facade.amazonaws.services.computeoptimizer

import scalajs.js

type CpuVendorArchitecture = "AWS_ARM64" | "CURRENT"
object CpuVendorArchitecture {
  inline val AWS_ARM64: "AWS_ARM64" = "AWS_ARM64"
  inline val CURRENT: "CURRENT" = "CURRENT"

  inline def values: js.Array[CpuVendorArchitecture] = js.Array(AWS_ARM64, CURRENT)
}

type Currency = "USD" | "CNY"
object Currency {
  inline val USD: "USD" = "USD"
  inline val CNY: "CNY" = "CNY"

  inline def values: js.Array[Currency] = js.Array(USD, CNY)
}

type CurrentPerformanceRisk = "VeryLow" | "Low" | "Medium" | "High"
object CurrentPerformanceRisk {
  inline val VeryLow: "VeryLow" = "VeryLow"
  inline val Low: "Low" = "Low"
  inline val Medium: "Medium" = "Medium"
  inline val High: "High" = "High"

  inline def values: js.Array[CurrentPerformanceRisk] = js.Array(VeryLow, Low, Medium, High)
}

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

type EnhancedInfrastructureMetrics = "Active" | "Inactive"
object EnhancedInfrastructureMetrics {
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"

  inline def values: js.Array[EnhancedInfrastructureMetrics] = js.Array(Active, Inactive)
}

type EnrollmentFilterName = "Status"
object EnrollmentFilterName {
  inline val Status: "Status" = "Status"

  inline def values: js.Array[EnrollmentFilterName] = js.Array(Status)
}

type ExportableAutoScalingGroupField =
  "AccountId" | "AutoScalingGroupArn" | "AutoScalingGroupName" | "Finding" | "UtilizationMetricsCpuMaximum" | "UtilizationMetricsMemoryMaximum" | "UtilizationMetricsEbsReadOpsPerSecondMaximum" | "UtilizationMetricsEbsWriteOpsPerSecondMaximum" | "UtilizationMetricsEbsReadBytesPerSecondMaximum" | "UtilizationMetricsEbsWriteBytesPerSecondMaximum" | "UtilizationMetricsDiskReadOpsPerSecondMaximum" | "UtilizationMetricsDiskWriteOpsPerSecondMaximum" | "UtilizationMetricsDiskReadBytesPerSecondMaximum" | "UtilizationMetricsDiskWriteBytesPerSecondMaximum" | "UtilizationMetricsNetworkInBytesPerSecondMaximum" | "UtilizationMetricsNetworkOutBytesPerSecondMaximum" | "UtilizationMetricsNetworkPacketsInPerSecondMaximum" | "UtilizationMetricsNetworkPacketsOutPerSecondMaximum" | "LookbackPeriodInDays" | "CurrentConfigurationInstanceType" | "CurrentConfigurationDesiredCapacity" | "CurrentConfigurationMinSize" | "CurrentConfigurationMaxSize" | "CurrentOnDemandPrice" | "CurrentStandardOneYearNoUpfrontReservedPrice" | "CurrentStandardThreeYearNoUpfrontReservedPrice" | "CurrentVCpus" | "CurrentMemory" | "CurrentStorage" | "CurrentNetwork" | "RecommendationOptionsConfigurationInstanceType" | "RecommendationOptionsConfigurationDesiredCapacity" | "RecommendationOptionsConfigurationMinSize" | "RecommendationOptionsConfigurationMaxSize" | "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum" | "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum" | "RecommendationOptionsPerformanceRisk" | "RecommendationOptionsOnDemandPrice" | "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice" | "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice" | "RecommendationOptionsVcpus" | "RecommendationOptionsMemory" | "RecommendationOptionsStorage" | "RecommendationOptionsNetwork" | "LastRefreshTimestamp" | "CurrentPerformanceRisk" | "RecommendationOptionsSavingsOpportunityPercentage" | "RecommendationOptionsEstimatedMonthlySavingsCurrency" | "RecommendationOptionsEstimatedMonthlySavingsValue" | "EffectiveRecommendationPreferencesCpuVendorArchitectures" | "EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics" | "EffectiveRecommendationPreferencesInferredWorkloadTypes" | "InferredWorkloadTypes" | "RecommendationOptionsMigrationEffort"
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
  inline val UtilizationMetricsDiskReadOpsPerSecondMaximum: "UtilizationMetricsDiskReadOpsPerSecondMaximum" = "UtilizationMetricsDiskReadOpsPerSecondMaximum"
  inline val UtilizationMetricsDiskWriteOpsPerSecondMaximum: "UtilizationMetricsDiskWriteOpsPerSecondMaximum" = "UtilizationMetricsDiskWriteOpsPerSecondMaximum"
  inline val UtilizationMetricsDiskReadBytesPerSecondMaximum: "UtilizationMetricsDiskReadBytesPerSecondMaximum" = "UtilizationMetricsDiskReadBytesPerSecondMaximum"
  inline val UtilizationMetricsDiskWriteBytesPerSecondMaximum: "UtilizationMetricsDiskWriteBytesPerSecondMaximum" = "UtilizationMetricsDiskWriteBytesPerSecondMaximum"
  inline val UtilizationMetricsNetworkInBytesPerSecondMaximum: "UtilizationMetricsNetworkInBytesPerSecondMaximum" = "UtilizationMetricsNetworkInBytesPerSecondMaximum"
  inline val UtilizationMetricsNetworkOutBytesPerSecondMaximum: "UtilizationMetricsNetworkOutBytesPerSecondMaximum" = "UtilizationMetricsNetworkOutBytesPerSecondMaximum"
  inline val UtilizationMetricsNetworkPacketsInPerSecondMaximum: "UtilizationMetricsNetworkPacketsInPerSecondMaximum" = "UtilizationMetricsNetworkPacketsInPerSecondMaximum"
  inline val UtilizationMetricsNetworkPacketsOutPerSecondMaximum: "UtilizationMetricsNetworkPacketsOutPerSecondMaximum" = "UtilizationMetricsNetworkPacketsOutPerSecondMaximum"
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
  inline val CurrentPerformanceRisk: "CurrentPerformanceRisk" = "CurrentPerformanceRisk"
  inline val RecommendationOptionsSavingsOpportunityPercentage: "RecommendationOptionsSavingsOpportunityPercentage" = "RecommendationOptionsSavingsOpportunityPercentage"
  inline val RecommendationOptionsEstimatedMonthlySavingsCurrency: "RecommendationOptionsEstimatedMonthlySavingsCurrency" = "RecommendationOptionsEstimatedMonthlySavingsCurrency"
  inline val RecommendationOptionsEstimatedMonthlySavingsValue: "RecommendationOptionsEstimatedMonthlySavingsValue" = "RecommendationOptionsEstimatedMonthlySavingsValue"
  inline val EffectiveRecommendationPreferencesCpuVendorArchitectures: "EffectiveRecommendationPreferencesCpuVendorArchitectures" = "EffectiveRecommendationPreferencesCpuVendorArchitectures"
  inline val EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics: "EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics" = "EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics"
  inline val EffectiveRecommendationPreferencesInferredWorkloadTypes: "EffectiveRecommendationPreferencesInferredWorkloadTypes" = "EffectiveRecommendationPreferencesInferredWorkloadTypes"
  inline val InferredWorkloadTypes: "InferredWorkloadTypes" = "InferredWorkloadTypes"
  inline val RecommendationOptionsMigrationEffort: "RecommendationOptionsMigrationEffort" = "RecommendationOptionsMigrationEffort"

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

type ExportableInstanceField =
  "AccountId" | "InstanceArn" | "InstanceName" | "Finding" | "FindingReasonCodes" | "LookbackPeriodInDays" | "CurrentInstanceType" | "UtilizationMetricsCpuMaximum" | "UtilizationMetricsMemoryMaximum" | "UtilizationMetricsEbsReadOpsPerSecondMaximum" | "UtilizationMetricsEbsWriteOpsPerSecondMaximum" | "UtilizationMetricsEbsReadBytesPerSecondMaximum" | "UtilizationMetricsEbsWriteBytesPerSecondMaximum" | "UtilizationMetricsDiskReadOpsPerSecondMaximum" | "UtilizationMetricsDiskWriteOpsPerSecondMaximum" | "UtilizationMetricsDiskReadBytesPerSecondMaximum" | "UtilizationMetricsDiskWriteBytesPerSecondMaximum" | "UtilizationMetricsNetworkInBytesPerSecondMaximum" | "UtilizationMetricsNetworkOutBytesPerSecondMaximum" | "UtilizationMetricsNetworkPacketsInPerSecondMaximum" | "UtilizationMetricsNetworkPacketsOutPerSecondMaximum" | "CurrentOnDemandPrice" | "CurrentStandardOneYearNoUpfrontReservedPrice" | "CurrentStandardThreeYearNoUpfrontReservedPrice" | "CurrentVCpus" | "CurrentMemory" | "CurrentStorage" | "CurrentNetwork" | "RecommendationOptionsInstanceType" | "RecommendationOptionsProjectedUtilizationMetricsCpuMaximum" | "RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum" | "RecommendationOptionsPlatformDifferences" | "RecommendationOptionsPerformanceRisk" | "RecommendationOptionsVcpus" | "RecommendationOptionsMemory" | "RecommendationOptionsStorage" | "RecommendationOptionsNetwork" | "RecommendationOptionsOnDemandPrice" | "RecommendationOptionsStandardOneYearNoUpfrontReservedPrice" | "RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice" | "RecommendationsSourcesRecommendationSourceArn" | "RecommendationsSourcesRecommendationSourceType" | "LastRefreshTimestamp" | "CurrentPerformanceRisk" | "RecommendationOptionsSavingsOpportunityPercentage" | "RecommendationOptionsEstimatedMonthlySavingsCurrency" | "RecommendationOptionsEstimatedMonthlySavingsValue" | "EffectiveRecommendationPreferencesCpuVendorArchitectures" | "EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics" | "EffectiveRecommendationPreferencesInferredWorkloadTypes" | "InferredWorkloadTypes" | "RecommendationOptionsMigrationEffort" | "EffectiveRecommendationPreferencesExternalMetricsSource"
object ExportableInstanceField {
  inline val AccountId: "AccountId" = "AccountId"
  inline val InstanceArn: "InstanceArn" = "InstanceArn"
  inline val InstanceName: "InstanceName" = "InstanceName"
  inline val Finding: "Finding" = "Finding"
  inline val FindingReasonCodes: "FindingReasonCodes" = "FindingReasonCodes"
  inline val LookbackPeriodInDays: "LookbackPeriodInDays" = "LookbackPeriodInDays"
  inline val CurrentInstanceType: "CurrentInstanceType" = "CurrentInstanceType"
  inline val UtilizationMetricsCpuMaximum: "UtilizationMetricsCpuMaximum" = "UtilizationMetricsCpuMaximum"
  inline val UtilizationMetricsMemoryMaximum: "UtilizationMetricsMemoryMaximum" = "UtilizationMetricsMemoryMaximum"
  inline val UtilizationMetricsEbsReadOpsPerSecondMaximum: "UtilizationMetricsEbsReadOpsPerSecondMaximum" = "UtilizationMetricsEbsReadOpsPerSecondMaximum"
  inline val UtilizationMetricsEbsWriteOpsPerSecondMaximum: "UtilizationMetricsEbsWriteOpsPerSecondMaximum" = "UtilizationMetricsEbsWriteOpsPerSecondMaximum"
  inline val UtilizationMetricsEbsReadBytesPerSecondMaximum: "UtilizationMetricsEbsReadBytesPerSecondMaximum" = "UtilizationMetricsEbsReadBytesPerSecondMaximum"
  inline val UtilizationMetricsEbsWriteBytesPerSecondMaximum: "UtilizationMetricsEbsWriteBytesPerSecondMaximum" = "UtilizationMetricsEbsWriteBytesPerSecondMaximum"
  inline val UtilizationMetricsDiskReadOpsPerSecondMaximum: "UtilizationMetricsDiskReadOpsPerSecondMaximum" = "UtilizationMetricsDiskReadOpsPerSecondMaximum"
  inline val UtilizationMetricsDiskWriteOpsPerSecondMaximum: "UtilizationMetricsDiskWriteOpsPerSecondMaximum" = "UtilizationMetricsDiskWriteOpsPerSecondMaximum"
  inline val UtilizationMetricsDiskReadBytesPerSecondMaximum: "UtilizationMetricsDiskReadBytesPerSecondMaximum" = "UtilizationMetricsDiskReadBytesPerSecondMaximum"
  inline val UtilizationMetricsDiskWriteBytesPerSecondMaximum: "UtilizationMetricsDiskWriteBytesPerSecondMaximum" = "UtilizationMetricsDiskWriteBytesPerSecondMaximum"
  inline val UtilizationMetricsNetworkInBytesPerSecondMaximum: "UtilizationMetricsNetworkInBytesPerSecondMaximum" = "UtilizationMetricsNetworkInBytesPerSecondMaximum"
  inline val UtilizationMetricsNetworkOutBytesPerSecondMaximum: "UtilizationMetricsNetworkOutBytesPerSecondMaximum" = "UtilizationMetricsNetworkOutBytesPerSecondMaximum"
  inline val UtilizationMetricsNetworkPacketsInPerSecondMaximum: "UtilizationMetricsNetworkPacketsInPerSecondMaximum" = "UtilizationMetricsNetworkPacketsInPerSecondMaximum"
  inline val UtilizationMetricsNetworkPacketsOutPerSecondMaximum: "UtilizationMetricsNetworkPacketsOutPerSecondMaximum" = "UtilizationMetricsNetworkPacketsOutPerSecondMaximum"
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
  inline val RecommendationOptionsPlatformDifferences: "RecommendationOptionsPlatformDifferences" = "RecommendationOptionsPlatformDifferences"
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
  inline val CurrentPerformanceRisk: "CurrentPerformanceRisk" = "CurrentPerformanceRisk"
  inline val RecommendationOptionsSavingsOpportunityPercentage: "RecommendationOptionsSavingsOpportunityPercentage" = "RecommendationOptionsSavingsOpportunityPercentage"
  inline val RecommendationOptionsEstimatedMonthlySavingsCurrency: "RecommendationOptionsEstimatedMonthlySavingsCurrency" = "RecommendationOptionsEstimatedMonthlySavingsCurrency"
  inline val RecommendationOptionsEstimatedMonthlySavingsValue: "RecommendationOptionsEstimatedMonthlySavingsValue" = "RecommendationOptionsEstimatedMonthlySavingsValue"
  inline val EffectiveRecommendationPreferencesCpuVendorArchitectures: "EffectiveRecommendationPreferencesCpuVendorArchitectures" = "EffectiveRecommendationPreferencesCpuVendorArchitectures"
  inline val EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics: "EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics" = "EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics"
  inline val EffectiveRecommendationPreferencesInferredWorkloadTypes: "EffectiveRecommendationPreferencesInferredWorkloadTypes" = "EffectiveRecommendationPreferencesInferredWorkloadTypes"
  inline val InferredWorkloadTypes: "InferredWorkloadTypes" = "InferredWorkloadTypes"
  inline val RecommendationOptionsMigrationEffort: "RecommendationOptionsMigrationEffort" = "RecommendationOptionsMigrationEffort"
  inline val EffectiveRecommendationPreferencesExternalMetricsSource: "EffectiveRecommendationPreferencesExternalMetricsSource" = "EffectiveRecommendationPreferencesExternalMetricsSource"

  inline def values: js.Array[ExportableInstanceField] = js.Array(
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

type ExportableLambdaFunctionField = "AccountId" | "FunctionArn" | "FunctionVersion" | "Finding" | "FindingReasonCodes" | "NumberOfInvocations" | "UtilizationMetricsDurationMaximum" | "UtilizationMetricsDurationAverage" | "UtilizationMetricsMemoryMaximum" | "UtilizationMetricsMemoryAverage" | "LookbackPeriodInDays" | "CurrentConfigurationMemorySize" | "CurrentConfigurationTimeout" | "CurrentCostTotal" | "CurrentCostAverage" | "RecommendationOptionsConfigurationMemorySize" | "RecommendationOptionsCostLow" | "RecommendationOptionsCostHigh" | "RecommendationOptionsProjectedUtilizationMetricsDurationLowerBound" | "RecommendationOptionsProjectedUtilizationMetricsDurationUpperBound" | "RecommendationOptionsProjectedUtilizationMetricsDurationExpected" | "LastRefreshTimestamp" | "CurrentPerformanceRisk" | "RecommendationOptionsSavingsOpportunityPercentage" | "RecommendationOptionsEstimatedMonthlySavingsCurrency" | "RecommendationOptionsEstimatedMonthlySavingsValue"
object ExportableLambdaFunctionField {
  inline val AccountId: "AccountId" = "AccountId"
  inline val FunctionArn: "FunctionArn" = "FunctionArn"
  inline val FunctionVersion: "FunctionVersion" = "FunctionVersion"
  inline val Finding: "Finding" = "Finding"
  inline val FindingReasonCodes: "FindingReasonCodes" = "FindingReasonCodes"
  inline val NumberOfInvocations: "NumberOfInvocations" = "NumberOfInvocations"
  inline val UtilizationMetricsDurationMaximum: "UtilizationMetricsDurationMaximum" = "UtilizationMetricsDurationMaximum"
  inline val UtilizationMetricsDurationAverage: "UtilizationMetricsDurationAverage" = "UtilizationMetricsDurationAverage"
  inline val UtilizationMetricsMemoryMaximum: "UtilizationMetricsMemoryMaximum" = "UtilizationMetricsMemoryMaximum"
  inline val UtilizationMetricsMemoryAverage: "UtilizationMetricsMemoryAverage" = "UtilizationMetricsMemoryAverage"
  inline val LookbackPeriodInDays: "LookbackPeriodInDays" = "LookbackPeriodInDays"
  inline val CurrentConfigurationMemorySize: "CurrentConfigurationMemorySize" = "CurrentConfigurationMemorySize"
  inline val CurrentConfigurationTimeout: "CurrentConfigurationTimeout" = "CurrentConfigurationTimeout"
  inline val CurrentCostTotal: "CurrentCostTotal" = "CurrentCostTotal"
  inline val CurrentCostAverage: "CurrentCostAverage" = "CurrentCostAverage"
  inline val RecommendationOptionsConfigurationMemorySize: "RecommendationOptionsConfigurationMemorySize" = "RecommendationOptionsConfigurationMemorySize"
  inline val RecommendationOptionsCostLow: "RecommendationOptionsCostLow" = "RecommendationOptionsCostLow"
  inline val RecommendationOptionsCostHigh: "RecommendationOptionsCostHigh" = "RecommendationOptionsCostHigh"
  inline val RecommendationOptionsProjectedUtilizationMetricsDurationLowerBound: "RecommendationOptionsProjectedUtilizationMetricsDurationLowerBound" = "RecommendationOptionsProjectedUtilizationMetricsDurationLowerBound"
  inline val RecommendationOptionsProjectedUtilizationMetricsDurationUpperBound: "RecommendationOptionsProjectedUtilizationMetricsDurationUpperBound" = "RecommendationOptionsProjectedUtilizationMetricsDurationUpperBound"
  inline val RecommendationOptionsProjectedUtilizationMetricsDurationExpected: "RecommendationOptionsProjectedUtilizationMetricsDurationExpected" = "RecommendationOptionsProjectedUtilizationMetricsDurationExpected"
  inline val LastRefreshTimestamp: "LastRefreshTimestamp" = "LastRefreshTimestamp"
  inline val CurrentPerformanceRisk: "CurrentPerformanceRisk" = "CurrentPerformanceRisk"
  inline val RecommendationOptionsSavingsOpportunityPercentage: "RecommendationOptionsSavingsOpportunityPercentage" = "RecommendationOptionsSavingsOpportunityPercentage"
  inline val RecommendationOptionsEstimatedMonthlySavingsCurrency: "RecommendationOptionsEstimatedMonthlySavingsCurrency" = "RecommendationOptionsEstimatedMonthlySavingsCurrency"
  inline val RecommendationOptionsEstimatedMonthlySavingsValue: "RecommendationOptionsEstimatedMonthlySavingsValue" = "RecommendationOptionsEstimatedMonthlySavingsValue"

  inline def values: js.Array[ExportableLambdaFunctionField] = js.Array(
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

type ExportableVolumeField =
  "AccountId" | "VolumeArn" | "Finding" | "UtilizationMetricsVolumeReadOpsPerSecondMaximum" | "UtilizationMetricsVolumeWriteOpsPerSecondMaximum" | "UtilizationMetricsVolumeReadBytesPerSecondMaximum" | "UtilizationMetricsVolumeWriteBytesPerSecondMaximum" | "LookbackPeriodInDays" | "CurrentConfigurationVolumeType" | "CurrentConfigurationVolumeBaselineIOPS" | "CurrentConfigurationVolumeBaselineThroughput" | "CurrentConfigurationVolumeBurstIOPS" | "CurrentConfigurationVolumeBurstThroughput" | "CurrentConfigurationVolumeSize" | "CurrentMonthlyPrice" | "RecommendationOptionsConfigurationVolumeType" | "RecommendationOptionsConfigurationVolumeBaselineIOPS" | "RecommendationOptionsConfigurationVolumeBaselineThroughput" | "RecommendationOptionsConfigurationVolumeBurstIOPS" | "RecommendationOptionsConfigurationVolumeBurstThroughput" | "RecommendationOptionsConfigurationVolumeSize" | "RecommendationOptionsMonthlyPrice" | "RecommendationOptionsPerformanceRisk" | "LastRefreshTimestamp" | "CurrentPerformanceRisk" | "RecommendationOptionsSavingsOpportunityPercentage" | "RecommendationOptionsEstimatedMonthlySavingsCurrency" | "RecommendationOptionsEstimatedMonthlySavingsValue"
object ExportableVolumeField {
  inline val AccountId: "AccountId" = "AccountId"
  inline val VolumeArn: "VolumeArn" = "VolumeArn"
  inline val Finding: "Finding" = "Finding"
  inline val UtilizationMetricsVolumeReadOpsPerSecondMaximum: "UtilizationMetricsVolumeReadOpsPerSecondMaximum" = "UtilizationMetricsVolumeReadOpsPerSecondMaximum"
  inline val UtilizationMetricsVolumeWriteOpsPerSecondMaximum: "UtilizationMetricsVolumeWriteOpsPerSecondMaximum" = "UtilizationMetricsVolumeWriteOpsPerSecondMaximum"
  inline val UtilizationMetricsVolumeReadBytesPerSecondMaximum: "UtilizationMetricsVolumeReadBytesPerSecondMaximum" = "UtilizationMetricsVolumeReadBytesPerSecondMaximum"
  inline val UtilizationMetricsVolumeWriteBytesPerSecondMaximum: "UtilizationMetricsVolumeWriteBytesPerSecondMaximum" = "UtilizationMetricsVolumeWriteBytesPerSecondMaximum"
  inline val LookbackPeriodInDays: "LookbackPeriodInDays" = "LookbackPeriodInDays"
  inline val CurrentConfigurationVolumeType: "CurrentConfigurationVolumeType" = "CurrentConfigurationVolumeType"
  inline val CurrentConfigurationVolumeBaselineIOPS: "CurrentConfigurationVolumeBaselineIOPS" = "CurrentConfigurationVolumeBaselineIOPS"
  inline val CurrentConfigurationVolumeBaselineThroughput: "CurrentConfigurationVolumeBaselineThroughput" = "CurrentConfigurationVolumeBaselineThroughput"
  inline val CurrentConfigurationVolumeBurstIOPS: "CurrentConfigurationVolumeBurstIOPS" = "CurrentConfigurationVolumeBurstIOPS"
  inline val CurrentConfigurationVolumeBurstThroughput: "CurrentConfigurationVolumeBurstThroughput" = "CurrentConfigurationVolumeBurstThroughput"
  inline val CurrentConfigurationVolumeSize: "CurrentConfigurationVolumeSize" = "CurrentConfigurationVolumeSize"
  inline val CurrentMonthlyPrice: "CurrentMonthlyPrice" = "CurrentMonthlyPrice"
  inline val RecommendationOptionsConfigurationVolumeType: "RecommendationOptionsConfigurationVolumeType" = "RecommendationOptionsConfigurationVolumeType"
  inline val RecommendationOptionsConfigurationVolumeBaselineIOPS: "RecommendationOptionsConfigurationVolumeBaselineIOPS" = "RecommendationOptionsConfigurationVolumeBaselineIOPS"
  inline val RecommendationOptionsConfigurationVolumeBaselineThroughput: "RecommendationOptionsConfigurationVolumeBaselineThroughput" = "RecommendationOptionsConfigurationVolumeBaselineThroughput"
  inline val RecommendationOptionsConfigurationVolumeBurstIOPS: "RecommendationOptionsConfigurationVolumeBurstIOPS" = "RecommendationOptionsConfigurationVolumeBurstIOPS"
  inline val RecommendationOptionsConfigurationVolumeBurstThroughput: "RecommendationOptionsConfigurationVolumeBurstThroughput" = "RecommendationOptionsConfigurationVolumeBurstThroughput"
  inline val RecommendationOptionsConfigurationVolumeSize: "RecommendationOptionsConfigurationVolumeSize" = "RecommendationOptionsConfigurationVolumeSize"
  inline val RecommendationOptionsMonthlyPrice: "RecommendationOptionsMonthlyPrice" = "RecommendationOptionsMonthlyPrice"
  inline val RecommendationOptionsPerformanceRisk: "RecommendationOptionsPerformanceRisk" = "RecommendationOptionsPerformanceRisk"
  inline val LastRefreshTimestamp: "LastRefreshTimestamp" = "LastRefreshTimestamp"
  inline val CurrentPerformanceRisk: "CurrentPerformanceRisk" = "CurrentPerformanceRisk"
  inline val RecommendationOptionsSavingsOpportunityPercentage: "RecommendationOptionsSavingsOpportunityPercentage" = "RecommendationOptionsSavingsOpportunityPercentage"
  inline val RecommendationOptionsEstimatedMonthlySavingsCurrency: "RecommendationOptionsEstimatedMonthlySavingsCurrency" = "RecommendationOptionsEstimatedMonthlySavingsCurrency"
  inline val RecommendationOptionsEstimatedMonthlySavingsValue: "RecommendationOptionsEstimatedMonthlySavingsValue" = "RecommendationOptionsEstimatedMonthlySavingsValue"

  inline def values: js.Array[ExportableVolumeField] = js.Array(
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

type ExternalMetricsSource = "Datadog" | "Dynatrace" | "NewRelic" | "Instana"
object ExternalMetricsSource {
  inline val Datadog: "Datadog" = "Datadog"
  inline val Dynatrace: "Dynatrace" = "Dynatrace"
  inline val NewRelic: "NewRelic" = "NewRelic"
  inline val Instana: "Instana" = "Instana"

  inline def values: js.Array[ExternalMetricsSource] = js.Array(Datadog, Dynatrace, NewRelic, Instana)
}

type FileFormat = "Csv"
object FileFormat {
  inline val Csv: "Csv" = "Csv"

  inline def values: js.Array[FileFormat] = js.Array(Csv)
}

type FilterName = "Finding" | "FindingReasonCodes" | "RecommendationSourceType"
object FilterName {
  inline val Finding: "Finding" = "Finding"
  inline val FindingReasonCodes: "FindingReasonCodes" = "FindingReasonCodes"
  inline val RecommendationSourceType: "RecommendationSourceType" = "RecommendationSourceType"

  inline def values: js.Array[FilterName] = js.Array(Finding, FindingReasonCodes, RecommendationSourceType)
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

type InferredWorkloadType = "AmazonEmr" | "ApacheCassandra" | "ApacheHadoop" | "Memcached" | "Nginx" | "PostgreSql" | "Redis"
object InferredWorkloadType {
  inline val AmazonEmr: "AmazonEmr" = "AmazonEmr"
  inline val ApacheCassandra: "ApacheCassandra" = "ApacheCassandra"
  inline val ApacheHadoop: "ApacheHadoop" = "ApacheHadoop"
  inline val Memcached: "Memcached" = "Memcached"
  inline val Nginx: "Nginx" = "Nginx"
  inline val PostgreSql: "PostgreSql" = "PostgreSql"
  inline val Redis: "Redis" = "Redis"

  inline def values: js.Array[InferredWorkloadType] = js.Array(AmazonEmr, ApacheCassandra, ApacheHadoop, Memcached, Nginx, PostgreSql, Redis)
}

type InferredWorkloadTypesPreference = "Active" | "Inactive"
object InferredWorkloadTypesPreference {
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"

  inline def values: js.Array[InferredWorkloadTypesPreference] = js.Array(Active, Inactive)
}

type InstanceRecommendationFindingReasonCode = "CPUOverprovisioned" | "CPUUnderprovisioned" | "MemoryOverprovisioned" | "MemoryUnderprovisioned" | "EBSThroughputOverprovisioned" | "EBSThroughputUnderprovisioned" | "EBSIOPSOverprovisioned" | "EBSIOPSUnderprovisioned" | "NetworkBandwidthOverprovisioned" | "NetworkBandwidthUnderprovisioned" | "NetworkPPSOverprovisioned" | "NetworkPPSUnderprovisioned" | "DiskIOPSOverprovisioned" | "DiskIOPSUnderprovisioned" | "DiskThroughputOverprovisioned" | "DiskThroughputUnderprovisioned"
object InstanceRecommendationFindingReasonCode {
  inline val CPUOverprovisioned: "CPUOverprovisioned" = "CPUOverprovisioned"
  inline val CPUUnderprovisioned: "CPUUnderprovisioned" = "CPUUnderprovisioned"
  inline val MemoryOverprovisioned: "MemoryOverprovisioned" = "MemoryOverprovisioned"
  inline val MemoryUnderprovisioned: "MemoryUnderprovisioned" = "MemoryUnderprovisioned"
  inline val EBSThroughputOverprovisioned: "EBSThroughputOverprovisioned" = "EBSThroughputOverprovisioned"
  inline val EBSThroughputUnderprovisioned: "EBSThroughputUnderprovisioned" = "EBSThroughputUnderprovisioned"
  inline val EBSIOPSOverprovisioned: "EBSIOPSOverprovisioned" = "EBSIOPSOverprovisioned"
  inline val EBSIOPSUnderprovisioned: "EBSIOPSUnderprovisioned" = "EBSIOPSUnderprovisioned"
  inline val NetworkBandwidthOverprovisioned: "NetworkBandwidthOverprovisioned" = "NetworkBandwidthOverprovisioned"
  inline val NetworkBandwidthUnderprovisioned: "NetworkBandwidthUnderprovisioned" = "NetworkBandwidthUnderprovisioned"
  inline val NetworkPPSOverprovisioned: "NetworkPPSOverprovisioned" = "NetworkPPSOverprovisioned"
  inline val NetworkPPSUnderprovisioned: "NetworkPPSUnderprovisioned" = "NetworkPPSUnderprovisioned"
  inline val DiskIOPSOverprovisioned: "DiskIOPSOverprovisioned" = "DiskIOPSOverprovisioned"
  inline val DiskIOPSUnderprovisioned: "DiskIOPSUnderprovisioned" = "DiskIOPSUnderprovisioned"
  inline val DiskThroughputOverprovisioned: "DiskThroughputOverprovisioned" = "DiskThroughputOverprovisioned"
  inline val DiskThroughputUnderprovisioned: "DiskThroughputUnderprovisioned" = "DiskThroughputUnderprovisioned"

  inline def values: js.Array[InstanceRecommendationFindingReasonCode] = js.Array(
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

type MetricName = "Cpu" | "Memory" | "EBS_READ_OPS_PER_SECOND" | "EBS_WRITE_OPS_PER_SECOND" | "EBS_READ_BYTES_PER_SECOND" | "EBS_WRITE_BYTES_PER_SECOND" | "DISK_READ_OPS_PER_SECOND" | "DISK_WRITE_OPS_PER_SECOND" | "DISK_READ_BYTES_PER_SECOND" | "DISK_WRITE_BYTES_PER_SECOND" | "NETWORK_IN_BYTES_PER_SECOND" | "NETWORK_OUT_BYTES_PER_SECOND" | "NETWORK_PACKETS_IN_PER_SECOND" | "NETWORK_PACKETS_OUT_PER_SECOND"
object MetricName {
  inline val Cpu: "Cpu" = "Cpu"
  inline val Memory: "Memory" = "Memory"
  inline val EBS_READ_OPS_PER_SECOND: "EBS_READ_OPS_PER_SECOND" = "EBS_READ_OPS_PER_SECOND"
  inline val EBS_WRITE_OPS_PER_SECOND: "EBS_WRITE_OPS_PER_SECOND" = "EBS_WRITE_OPS_PER_SECOND"
  inline val EBS_READ_BYTES_PER_SECOND: "EBS_READ_BYTES_PER_SECOND" = "EBS_READ_BYTES_PER_SECOND"
  inline val EBS_WRITE_BYTES_PER_SECOND: "EBS_WRITE_BYTES_PER_SECOND" = "EBS_WRITE_BYTES_PER_SECOND"
  inline val DISK_READ_OPS_PER_SECOND: "DISK_READ_OPS_PER_SECOND" = "DISK_READ_OPS_PER_SECOND"
  inline val DISK_WRITE_OPS_PER_SECOND: "DISK_WRITE_OPS_PER_SECOND" = "DISK_WRITE_OPS_PER_SECOND"
  inline val DISK_READ_BYTES_PER_SECOND: "DISK_READ_BYTES_PER_SECOND" = "DISK_READ_BYTES_PER_SECOND"
  inline val DISK_WRITE_BYTES_PER_SECOND: "DISK_WRITE_BYTES_PER_SECOND" = "DISK_WRITE_BYTES_PER_SECOND"
  inline val NETWORK_IN_BYTES_PER_SECOND: "NETWORK_IN_BYTES_PER_SECOND" = "NETWORK_IN_BYTES_PER_SECOND"
  inline val NETWORK_OUT_BYTES_PER_SECOND: "NETWORK_OUT_BYTES_PER_SECOND" = "NETWORK_OUT_BYTES_PER_SECOND"
  inline val NETWORK_PACKETS_IN_PER_SECOND: "NETWORK_PACKETS_IN_PER_SECOND" = "NETWORK_PACKETS_IN_PER_SECOND"
  inline val NETWORK_PACKETS_OUT_PER_SECOND: "NETWORK_PACKETS_OUT_PER_SECOND" = "NETWORK_PACKETS_OUT_PER_SECOND"

  inline def values: js.Array[MetricName] = js.Array(
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

type MetricStatistic = "Maximum" | "Average"
object MetricStatistic {
  inline val Maximum: "Maximum" = "Maximum"
  inline val Average: "Average" = "Average"

  inline def values: js.Array[MetricStatistic] = js.Array(Maximum, Average)
}

type MigrationEffort = "VeryLow" | "Low" | "Medium" | "High"
object MigrationEffort {
  inline val VeryLow: "VeryLow" = "VeryLow"
  inline val Low: "Low" = "Low"
  inline val Medium: "Medium" = "Medium"
  inline val High: "High" = "High"

  inline def values: js.Array[MigrationEffort] = js.Array(VeryLow, Low, Medium, High)
}

type PlatformDifference = "Hypervisor" | "NetworkInterface" | "StorageInterface" | "InstanceStoreAvailability" | "VirtualizationType" | "Architecture"
object PlatformDifference {
  inline val Hypervisor: "Hypervisor" = "Hypervisor"
  inline val NetworkInterface: "NetworkInterface" = "NetworkInterface"
  inline val StorageInterface: "StorageInterface" = "StorageInterface"
  inline val InstanceStoreAvailability: "InstanceStoreAvailability" = "InstanceStoreAvailability"
  inline val VirtualizationType: "VirtualizationType" = "VirtualizationType"
  inline val Architecture: "Architecture" = "Architecture"

  inline def values: js.Array[PlatformDifference] = js.Array(Hypervisor, NetworkInterface, StorageInterface, InstanceStoreAvailability, VirtualizationType, Architecture)
}

type RecommendationPreferenceName = "EnhancedInfrastructureMetrics" | "InferredWorkloadTypes" | "ExternalMetricsPreference"
object RecommendationPreferenceName {
  inline val EnhancedInfrastructureMetrics: "EnhancedInfrastructureMetrics" = "EnhancedInfrastructureMetrics"
  inline val InferredWorkloadTypes: "InferredWorkloadTypes" = "InferredWorkloadTypes"
  inline val ExternalMetricsPreference: "ExternalMetricsPreference" = "ExternalMetricsPreference"

  inline def values: js.Array[RecommendationPreferenceName] = js.Array(EnhancedInfrastructureMetrics, InferredWorkloadTypes, ExternalMetricsPreference)
}

type RecommendationSourceType = "Ec2Instance" | "AutoScalingGroup" | "EbsVolume" | "LambdaFunction"
object RecommendationSourceType {
  inline val Ec2Instance: "Ec2Instance" = "Ec2Instance"
  inline val AutoScalingGroup: "AutoScalingGroup" = "AutoScalingGroup"
  inline val EbsVolume: "EbsVolume" = "EbsVolume"
  inline val LambdaFunction: "LambdaFunction" = "LambdaFunction"

  inline def values: js.Array[RecommendationSourceType] = js.Array(Ec2Instance, AutoScalingGroup, EbsVolume, LambdaFunction)
}

type ResourceType = "Ec2Instance" | "AutoScalingGroup" | "EbsVolume" | "LambdaFunction" | "NotApplicable"
object ResourceType {
  inline val Ec2Instance: "Ec2Instance" = "Ec2Instance"
  inline val AutoScalingGroup: "AutoScalingGroup" = "AutoScalingGroup"
  inline val EbsVolume: "EbsVolume" = "EbsVolume"
  inline val LambdaFunction: "LambdaFunction" = "LambdaFunction"
  inline val NotApplicable: "NotApplicable" = "NotApplicable"

  inline def values: js.Array[ResourceType] = js.Array(Ec2Instance, AutoScalingGroup, EbsVolume, LambdaFunction, NotApplicable)
}

type ScopeName = "Organization" | "AccountId" | "ResourceArn"
object ScopeName {
  inline val Organization: "Organization" = "Organization"
  inline val AccountId: "AccountId" = "AccountId"
  inline val ResourceArn: "ResourceArn" = "ResourceArn"

  inline def values: js.Array[ScopeName] = js.Array(Organization, AccountId, ResourceArn)
}

type Status = "Active" | "Inactive" | "Pending" | "Failed"
object Status {
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"
  inline val Pending: "Pending" = "Pending"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[Status] = js.Array(Active, Inactive, Pending, Failed)
}
