package facade.amazonaws.services.resiliencehub

import scalajs.js

type AlarmType = "Metric" | "Composite" | "Canary" | "Logs" | "Event"
object AlarmType {
  inline val Metric: "Metric" = "Metric"
  inline val Composite: "Composite" = "Composite"
  inline val Canary: "Canary" = "Canary"
  inline val Logs: "Logs" = "Logs"
  inline val Event: "Event" = "Event"

  inline def values: js.Array[AlarmType] = js.Array(Metric, Composite, Canary, Logs, Event)
}

type AppComplianceStatusType = "PolicyBreached" | "PolicyMet" | "NotAssessed" | "ChangesDetected"
object AppComplianceStatusType {
  inline val PolicyBreached: "PolicyBreached" = "PolicyBreached"
  inline val PolicyMet: "PolicyMet" = "PolicyMet"
  inline val NotAssessed: "NotAssessed" = "NotAssessed"
  inline val ChangesDetected: "ChangesDetected" = "ChangesDetected"

  inline def values: js.Array[AppComplianceStatusType] = js.Array(PolicyBreached, PolicyMet, NotAssessed, ChangesDetected)
}

type AppStatusType = "Active" | "Deleting"
object AppStatusType {
  inline val Active: "Active" = "Active"
  inline val Deleting: "Deleting" = "Deleting"

  inline def values: js.Array[AppStatusType] = js.Array(Active, Deleting)
}

type AssessmentInvoker = "User" | "System"
object AssessmentInvoker {
  inline val User: "User" = "User"
  inline val System: "System" = "System"

  inline def values: js.Array[AssessmentInvoker] = js.Array(User, System)
}

type AssessmentStatus = "Pending" | "InProgress" | "Failed" | "Success"
object AssessmentStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Success: "Success" = "Success"

  inline def values: js.Array[AssessmentStatus] = js.Array(Pending, InProgress, Failed, Success)
}

type ComplianceStatus = "PolicyBreached" | "PolicyMet"
object ComplianceStatus {
  inline val PolicyBreached: "PolicyBreached" = "PolicyBreached"
  inline val PolicyMet: "PolicyMet" = "PolicyMet"

  inline def values: js.Array[ComplianceStatus] = js.Array(PolicyBreached, PolicyMet)
}

type ConfigRecommendationOptimizationType = "LeastCost" | "LeastChange" | "BestAZRecovery" | "LeastErrors" | "BestAttainable"
object ConfigRecommendationOptimizationType {
  inline val LeastCost: "LeastCost" = "LeastCost"
  inline val LeastChange: "LeastChange" = "LeastChange"
  inline val BestAZRecovery: "BestAZRecovery" = "BestAZRecovery"
  inline val LeastErrors: "LeastErrors" = "LeastErrors"
  inline val BestAttainable: "BestAttainable" = "BestAttainable"

  inline def values: js.Array[ConfigRecommendationOptimizationType] = js.Array(LeastCost, LeastChange, BestAZRecovery, LeastErrors, BestAttainable)
}

type CostFrequency = "Hourly" | "Daily" | "Monthly" | "Yearly"
object CostFrequency {
  inline val Hourly: "Hourly" = "Hourly"
  inline val Daily: "Daily" = "Daily"
  inline val Monthly: "Monthly" = "Monthly"
  inline val Yearly: "Yearly" = "Yearly"

  inline def values: js.Array[CostFrequency] = js.Array(Hourly, Daily, Monthly, Yearly)
}

type DataLocationConstraint = "AnyLocation" | "SameContinent" | "SameCountry"
object DataLocationConstraint {
  inline val AnyLocation: "AnyLocation" = "AnyLocation"
  inline val SameContinent: "SameContinent" = "SameContinent"
  inline val SameCountry: "SameCountry" = "SameCountry"

  inline def values: js.Array[DataLocationConstraint] = js.Array(AnyLocation, SameContinent, SameCountry)
}

type DisruptionType = "Software" | "Hardware" | "AZ" | "Region"
object DisruptionType {
  inline val Software: "Software" = "Software"
  inline val Hardware: "Hardware" = "Hardware"
  inline val AZ: "AZ" = "AZ"
  inline val Region: "Region" = "Region"

  inline def values: js.Array[DisruptionType] = js.Array(Software, Hardware, AZ, Region)
}

type EstimatedCostTier = "L1" | "L2" | "L3" | "L4"
object EstimatedCostTier {
  inline val L1: "L1" = "L1"
  inline val L2: "L2" = "L2"
  inline val L3: "L3" = "L3"
  inline val L4: "L4" = "L4"

  inline def values: js.Array[EstimatedCostTier] = js.Array(L1, L2, L3, L4)
}

type HaArchitecture = "MultiSite" | "WarmStandby" | "PilotLight" | "BackupAndRestore" | "NoRecoveryPlan"
object HaArchitecture {
  inline val MultiSite: "MultiSite" = "MultiSite"
  inline val WarmStandby: "WarmStandby" = "WarmStandby"
  inline val PilotLight: "PilotLight" = "PilotLight"
  inline val BackupAndRestore: "BackupAndRestore" = "BackupAndRestore"
  inline val NoRecoveryPlan: "NoRecoveryPlan" = "NoRecoveryPlan"

  inline def values: js.Array[HaArchitecture] = js.Array(MultiSite, WarmStandby, PilotLight, BackupAndRestore, NoRecoveryPlan)
}

type PhysicalIdentifierType = "Arn" | "Native"
object PhysicalIdentifierType {
  inline val Arn: "Arn" = "Arn"
  inline val Native: "Native" = "Native"

  inline def values: js.Array[PhysicalIdentifierType] = js.Array(Arn, Native)
}

type RecommendationComplianceStatus = "BreachedUnattainable" | "BreachedCanMeet" | "MetCanImprove"
object RecommendationComplianceStatus {
  inline val BreachedUnattainable: "BreachedUnattainable" = "BreachedUnattainable"
  inline val BreachedCanMeet: "BreachedCanMeet" = "BreachedCanMeet"
  inline val MetCanImprove: "MetCanImprove" = "MetCanImprove"

  inline def values: js.Array[RecommendationComplianceStatus] = js.Array(BreachedUnattainable, BreachedCanMeet, MetCanImprove)
}

type RecommendationTemplateStatus = "Pending" | "InProgress" | "Failed" | "Success"
object RecommendationTemplateStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Success: "Success" = "Success"

  inline def values: js.Array[RecommendationTemplateStatus] = js.Array(Pending, InProgress, Failed, Success)
}

type RenderRecommendationType = "Alarm" | "Sop" | "Test"
object RenderRecommendationType {
  inline val Alarm: "Alarm" = "Alarm"
  inline val Sop: "Sop" = "Sop"
  inline val Test: "Test" = "Test"

  inline def values: js.Array[RenderRecommendationType] = js.Array(Alarm, Sop, Test)
}

type ResiliencyPolicyTier = "MissionCritical" | "Critical" | "Important" | "CoreServices" | "NonCritical"
object ResiliencyPolicyTier {
  inline val MissionCritical: "MissionCritical" = "MissionCritical"
  inline val Critical: "Critical" = "Critical"
  inline val Important: "Important" = "Important"
  inline val CoreServices: "CoreServices" = "CoreServices"
  inline val NonCritical: "NonCritical" = "NonCritical"

  inline def values: js.Array[ResiliencyPolicyTier] = js.Array(MissionCritical, Critical, Important, CoreServices, NonCritical)
}

type ResourceImportStatusType = "Pending" | "InProgress" | "Failed" | "Success"
object ResourceImportStatusType {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Success: "Success" = "Success"

  inline def values: js.Array[ResourceImportStatusType] = js.Array(Pending, InProgress, Failed, Success)
}

type ResourceMappingType = "CfnStack" | "Resource" | "AppRegistryApp" | "ResourceGroup"
object ResourceMappingType {
  inline val CfnStack: "CfnStack" = "CfnStack"
  inline val Resource: "Resource" = "Resource"
  inline val AppRegistryApp: "AppRegistryApp" = "AppRegistryApp"
  inline val ResourceGroup: "ResourceGroup" = "ResourceGroup"

  inline def values: js.Array[ResourceMappingType] = js.Array(CfnStack, Resource, AppRegistryApp, ResourceGroup)
}

type ResourceResolutionStatusType = "Pending" | "InProgress" | "Failed" | "Success"
object ResourceResolutionStatusType {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Success: "Success" = "Success"

  inline def values: js.Array[ResourceResolutionStatusType] = js.Array(Pending, InProgress, Failed, Success)
}

type SopServiceType = "SSM"
object SopServiceType {
  inline val SSM: "SSM" = "SSM"

  inline def values: js.Array[SopServiceType] = js.Array(SSM)
}

type TemplateFormat = "CfnYaml" | "CfnJson"
object TemplateFormat {
  inline val CfnYaml: "CfnYaml" = "CfnYaml"
  inline val CfnJson: "CfnJson" = "CfnJson"

  inline def values: js.Array[TemplateFormat] = js.Array(CfnYaml, CfnJson)
}

type TestRisk = "Small" | "Medium" | "High"
object TestRisk {
  inline val Small: "Small" = "Small"
  inline val Medium: "Medium" = "Medium"
  inline val High: "High" = "High"

  inline def values: js.Array[TestRisk] = js.Array(Small, Medium, High)
}

type TestType = "Software" | "Hardware" | "AZ" | "Region"
object TestType {
  inline val Software: "Software" = "Software"
  inline val Hardware: "Hardware" = "Hardware"
  inline val AZ: "AZ" = "AZ"
  inline val Region: "Region" = "Region"

  inline def values: js.Array[TestType] = js.Array(Software, Hardware, AZ, Region)
}
