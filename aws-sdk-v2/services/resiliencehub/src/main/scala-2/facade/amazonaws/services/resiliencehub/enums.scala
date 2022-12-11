package facade.amazonaws.services.resiliencehub

import scalajs.js

@js.native
sealed trait AlarmType extends js.Any
object AlarmType {
  val Metric = "Metric".asInstanceOf[AlarmType]
  val Composite = "Composite".asInstanceOf[AlarmType]
  val Canary = "Canary".asInstanceOf[AlarmType]
  val Logs = "Logs".asInstanceOf[AlarmType]
  val Event = "Event".asInstanceOf[AlarmType]

  @inline def values: js.Array[AlarmType] = js.Array(Metric, Composite, Canary, Logs, Event)
}

@js.native
sealed trait AppAssessmentScheduleType extends js.Any
object AppAssessmentScheduleType {
  val Disabled = "Disabled".asInstanceOf[AppAssessmentScheduleType]
  val Daily = "Daily".asInstanceOf[AppAssessmentScheduleType]

  @inline def values: js.Array[AppAssessmentScheduleType] = js.Array(Disabled, Daily)
}

@js.native
sealed trait AppComplianceStatusType extends js.Any
object AppComplianceStatusType {
  val PolicyBreached = "PolicyBreached".asInstanceOf[AppComplianceStatusType]
  val PolicyMet = "PolicyMet".asInstanceOf[AppComplianceStatusType]
  val NotAssessed = "NotAssessed".asInstanceOf[AppComplianceStatusType]
  val ChangesDetected = "ChangesDetected".asInstanceOf[AppComplianceStatusType]

  @inline def values: js.Array[AppComplianceStatusType] = js.Array(PolicyBreached, PolicyMet, NotAssessed, ChangesDetected)
}

@js.native
sealed trait AppStatusType extends js.Any
object AppStatusType {
  val Active = "Active".asInstanceOf[AppStatusType]
  val Deleting = "Deleting".asInstanceOf[AppStatusType]

  @inline def values: js.Array[AppStatusType] = js.Array(Active, Deleting)
}

@js.native
sealed trait AssessmentInvoker extends js.Any
object AssessmentInvoker {
  val User = "User".asInstanceOf[AssessmentInvoker]
  val System = "System".asInstanceOf[AssessmentInvoker]

  @inline def values: js.Array[AssessmentInvoker] = js.Array(User, System)
}

@js.native
sealed trait AssessmentStatus extends js.Any
object AssessmentStatus {
  val Pending = "Pending".asInstanceOf[AssessmentStatus]
  val InProgress = "InProgress".asInstanceOf[AssessmentStatus]
  val Failed = "Failed".asInstanceOf[AssessmentStatus]
  val Success = "Success".asInstanceOf[AssessmentStatus]

  @inline def values: js.Array[AssessmentStatus] = js.Array(Pending, InProgress, Failed, Success)
}

@js.native
sealed trait ComplianceStatus extends js.Any
object ComplianceStatus {
  val PolicyBreached = "PolicyBreached".asInstanceOf[ComplianceStatus]
  val PolicyMet = "PolicyMet".asInstanceOf[ComplianceStatus]

  @inline def values: js.Array[ComplianceStatus] = js.Array(PolicyBreached, PolicyMet)
}

@js.native
sealed trait ConfigRecommendationOptimizationType extends js.Any
object ConfigRecommendationOptimizationType {
  val LeastCost = "LeastCost".asInstanceOf[ConfigRecommendationOptimizationType]
  val LeastChange = "LeastChange".asInstanceOf[ConfigRecommendationOptimizationType]
  val BestAZRecovery = "BestAZRecovery".asInstanceOf[ConfigRecommendationOptimizationType]
  val LeastErrors = "LeastErrors".asInstanceOf[ConfigRecommendationOptimizationType]
  val BestAttainable = "BestAttainable".asInstanceOf[ConfigRecommendationOptimizationType]
  val BestRegionRecovery = "BestRegionRecovery".asInstanceOf[ConfigRecommendationOptimizationType]

  @inline def values: js.Array[ConfigRecommendationOptimizationType] = js.Array(LeastCost, LeastChange, BestAZRecovery, LeastErrors, BestAttainable, BestRegionRecovery)
}

@js.native
sealed trait CostFrequency extends js.Any
object CostFrequency {
  val Hourly = "Hourly".asInstanceOf[CostFrequency]
  val Daily = "Daily".asInstanceOf[CostFrequency]
  val Monthly = "Monthly".asInstanceOf[CostFrequency]
  val Yearly = "Yearly".asInstanceOf[CostFrequency]

  @inline def values: js.Array[CostFrequency] = js.Array(Hourly, Daily, Monthly, Yearly)
}

@js.native
sealed trait DataLocationConstraint extends js.Any
object DataLocationConstraint {
  val AnyLocation = "AnyLocation".asInstanceOf[DataLocationConstraint]
  val SameContinent = "SameContinent".asInstanceOf[DataLocationConstraint]
  val SameCountry = "SameCountry".asInstanceOf[DataLocationConstraint]

  @inline def values: js.Array[DataLocationConstraint] = js.Array(AnyLocation, SameContinent, SameCountry)
}

@js.native
sealed trait DisruptionType extends js.Any
object DisruptionType {
  val Software = "Software".asInstanceOf[DisruptionType]
  val Hardware = "Hardware".asInstanceOf[DisruptionType]
  val AZ = "AZ".asInstanceOf[DisruptionType]
  val Region = "Region".asInstanceOf[DisruptionType]

  @inline def values: js.Array[DisruptionType] = js.Array(Software, Hardware, AZ, Region)
}

@js.native
sealed trait EstimatedCostTier extends js.Any
object EstimatedCostTier {
  val L1 = "L1".asInstanceOf[EstimatedCostTier]
  val L2 = "L2".asInstanceOf[EstimatedCostTier]
  val L3 = "L3".asInstanceOf[EstimatedCostTier]
  val L4 = "L4".asInstanceOf[EstimatedCostTier]

  @inline def values: js.Array[EstimatedCostTier] = js.Array(L1, L2, L3, L4)
}

@js.native
sealed trait HaArchitecture extends js.Any
object HaArchitecture {
  val MultiSite = "MultiSite".asInstanceOf[HaArchitecture]
  val WarmStandby = "WarmStandby".asInstanceOf[HaArchitecture]
  val PilotLight = "PilotLight".asInstanceOf[HaArchitecture]
  val BackupAndRestore = "BackupAndRestore".asInstanceOf[HaArchitecture]
  val NoRecoveryPlan = "NoRecoveryPlan".asInstanceOf[HaArchitecture]

  @inline def values: js.Array[HaArchitecture] = js.Array(MultiSite, WarmStandby, PilotLight, BackupAndRestore, NoRecoveryPlan)
}

@js.native
sealed trait PhysicalIdentifierType extends js.Any
object PhysicalIdentifierType {
  val Arn = "Arn".asInstanceOf[PhysicalIdentifierType]
  val Native = "Native".asInstanceOf[PhysicalIdentifierType]

  @inline def values: js.Array[PhysicalIdentifierType] = js.Array(Arn, Native)
}

@js.native
sealed trait RecommendationComplianceStatus extends js.Any
object RecommendationComplianceStatus {
  val BreachedUnattainable = "BreachedUnattainable".asInstanceOf[RecommendationComplianceStatus]
  val BreachedCanMeet = "BreachedCanMeet".asInstanceOf[RecommendationComplianceStatus]
  val MetCanImprove = "MetCanImprove".asInstanceOf[RecommendationComplianceStatus]

  @inline def values: js.Array[RecommendationComplianceStatus] = js.Array(BreachedUnattainable, BreachedCanMeet, MetCanImprove)
}

@js.native
sealed trait RecommendationTemplateStatus extends js.Any
object RecommendationTemplateStatus {
  val Pending = "Pending".asInstanceOf[RecommendationTemplateStatus]
  val InProgress = "InProgress".asInstanceOf[RecommendationTemplateStatus]
  val Failed = "Failed".asInstanceOf[RecommendationTemplateStatus]
  val Success = "Success".asInstanceOf[RecommendationTemplateStatus]

  @inline def values: js.Array[RecommendationTemplateStatus] = js.Array(Pending, InProgress, Failed, Success)
}

@js.native
sealed trait RenderRecommendationType extends js.Any
object RenderRecommendationType {
  val Alarm = "Alarm".asInstanceOf[RenderRecommendationType]
  val Sop = "Sop".asInstanceOf[RenderRecommendationType]
  val Test = "Test".asInstanceOf[RenderRecommendationType]

  @inline def values: js.Array[RenderRecommendationType] = js.Array(Alarm, Sop, Test)
}

@js.native
sealed trait ResiliencyPolicyTier extends js.Any
object ResiliencyPolicyTier {
  val MissionCritical = "MissionCritical".asInstanceOf[ResiliencyPolicyTier]
  val Critical = "Critical".asInstanceOf[ResiliencyPolicyTier]
  val Important = "Important".asInstanceOf[ResiliencyPolicyTier]
  val CoreServices = "CoreServices".asInstanceOf[ResiliencyPolicyTier]
  val NonCritical = "NonCritical".asInstanceOf[ResiliencyPolicyTier]

  @inline def values: js.Array[ResiliencyPolicyTier] = js.Array(MissionCritical, Critical, Important, CoreServices, NonCritical)
}

@js.native
sealed trait ResourceImportStatusType extends js.Any
object ResourceImportStatusType {
  val Pending = "Pending".asInstanceOf[ResourceImportStatusType]
  val InProgress = "InProgress".asInstanceOf[ResourceImportStatusType]
  val Failed = "Failed".asInstanceOf[ResourceImportStatusType]
  val Success = "Success".asInstanceOf[ResourceImportStatusType]

  @inline def values: js.Array[ResourceImportStatusType] = js.Array(Pending, InProgress, Failed, Success)
}

@js.native
sealed trait ResourceMappingType extends js.Any
object ResourceMappingType {
  val CfnStack = "CfnStack".asInstanceOf[ResourceMappingType]
  val Resource = "Resource".asInstanceOf[ResourceMappingType]
  val AppRegistryApp = "AppRegistryApp".asInstanceOf[ResourceMappingType]
  val ResourceGroup = "ResourceGroup".asInstanceOf[ResourceMappingType]
  val Terraform = "Terraform".asInstanceOf[ResourceMappingType]

  @inline def values: js.Array[ResourceMappingType] = js.Array(CfnStack, Resource, AppRegistryApp, ResourceGroup, Terraform)
}

@js.native
sealed trait ResourceResolutionStatusType extends js.Any
object ResourceResolutionStatusType {
  val Pending = "Pending".asInstanceOf[ResourceResolutionStatusType]
  val InProgress = "InProgress".asInstanceOf[ResourceResolutionStatusType]
  val Failed = "Failed".asInstanceOf[ResourceResolutionStatusType]
  val Success = "Success".asInstanceOf[ResourceResolutionStatusType]

  @inline def values: js.Array[ResourceResolutionStatusType] = js.Array(Pending, InProgress, Failed, Success)
}

@js.native
sealed trait SopServiceType extends js.Any
object SopServiceType {
  val SSM = "SSM".asInstanceOf[SopServiceType]

  @inline def values: js.Array[SopServiceType] = js.Array(SSM)
}

@js.native
sealed trait TemplateFormat extends js.Any
object TemplateFormat {
  val CfnYaml = "CfnYaml".asInstanceOf[TemplateFormat]
  val CfnJson = "CfnJson".asInstanceOf[TemplateFormat]

  @inline def values: js.Array[TemplateFormat] = js.Array(CfnYaml, CfnJson)
}

@js.native
sealed trait TestRisk extends js.Any
object TestRisk {
  val Small = "Small".asInstanceOf[TestRisk]
  val Medium = "Medium".asInstanceOf[TestRisk]
  val High = "High".asInstanceOf[TestRisk]

  @inline def values: js.Array[TestRisk] = js.Array(Small, Medium, High)
}

@js.native
sealed trait TestType extends js.Any
object TestType {
  val Software = "Software".asInstanceOf[TestType]
  val Hardware = "Hardware".asInstanceOf[TestType]
  val AZ = "AZ".asInstanceOf[TestType]
  val Region = "Region".asInstanceOf[TestType]

  @inline def values: js.Array[TestType] = js.Array(Software, Hardware, AZ, Region)
}
