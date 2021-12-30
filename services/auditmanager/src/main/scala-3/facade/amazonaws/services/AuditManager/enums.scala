package facade.amazonaws.services.auditmanager

import scalajs.js

type AccountStatus = "ACTIVE" | "INACTIVE" | "PENDING_ACTIVATION"
object AccountStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val PENDING_ACTIVATION: "PENDING_ACTIVATION" = "PENDING_ACTIVATION"

  inline def values: js.Array[AccountStatus] = js.Array(ACTIVE, INACTIVE, PENDING_ACTIVATION)
}

type ActionEnum = "CREATE" | "UPDATE_METADATA" | "ACTIVE" | "INACTIVE" | "DELETE" | "UNDER_REVIEW" | "REVIEWED" | "IMPORT_EVIDENCE"
object ActionEnum {
  inline val CREATE: "CREATE" = "CREATE"
  inline val UPDATE_METADATA: "UPDATE_METADATA" = "UPDATE_METADATA"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val DELETE: "DELETE" = "DELETE"
  inline val UNDER_REVIEW: "UNDER_REVIEW" = "UNDER_REVIEW"
  inline val REVIEWED: "REVIEWED" = "REVIEWED"
  inline val IMPORT_EVIDENCE: "IMPORT_EVIDENCE" = "IMPORT_EVIDENCE"

  inline def values: js.Array[ActionEnum] = js.Array(CREATE, UPDATE_METADATA, ACTIVE, INACTIVE, DELETE, UNDER_REVIEW, REVIEWED, IMPORT_EVIDENCE)
}

type AssessmentReportDestinationType = "S3"
object AssessmentReportDestinationType {
  inline val S3: "S3" = "S3"

  inline def values: js.Array[AssessmentReportDestinationType] = js.Array(S3)
}

type AssessmentReportStatus = "COMPLETE" | "IN_PROGRESS" | "FAILED"
object AssessmentReportStatus {
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[AssessmentReportStatus] = js.Array(COMPLETE, IN_PROGRESS, FAILED)
}

type AssessmentStatus = "ACTIVE" | "INACTIVE"
object AssessmentStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[AssessmentStatus] = js.Array(ACTIVE, INACTIVE)
}

type ControlResponse = "MANUAL" | "AUTOMATE" | "DEFER" | "IGNORE"
object ControlResponse {
  inline val MANUAL: "MANUAL" = "MANUAL"
  inline val AUTOMATE: "AUTOMATE" = "AUTOMATE"
  inline val DEFER: "DEFER" = "DEFER"
  inline val IGNORE: "IGNORE" = "IGNORE"

  inline def values: js.Array[ControlResponse] = js.Array(MANUAL, AUTOMATE, DEFER, IGNORE)
}

type ControlSetStatus = "ACTIVE" | "UNDER_REVIEW" | "REVIEWED"
object ControlSetStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UNDER_REVIEW: "UNDER_REVIEW" = "UNDER_REVIEW"
  inline val REVIEWED: "REVIEWED" = "REVIEWED"

  inline def values: js.Array[ControlSetStatus] = js.Array(ACTIVE, UNDER_REVIEW, REVIEWED)
}

type ControlStatus = "UNDER_REVIEW" | "REVIEWED" | "INACTIVE"
object ControlStatus {
  inline val UNDER_REVIEW: "UNDER_REVIEW" = "UNDER_REVIEW"
  inline val REVIEWED: "REVIEWED" = "REVIEWED"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[ControlStatus] = js.Array(UNDER_REVIEW, REVIEWED, INACTIVE)
}

type ControlType = "Standard" | "Custom"
object ControlType {
  inline val Standard: "Standard" = "Standard"
  inline val Custom: "Custom" = "Custom"

  inline def values: js.Array[ControlType] = js.Array(Standard, Custom)
}

type DelegationStatus = "IN_PROGRESS" | "UNDER_REVIEW" | "COMPLETE"
object DelegationStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val UNDER_REVIEW: "UNDER_REVIEW" = "UNDER_REVIEW"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"

  inline def values: js.Array[DelegationStatus] = js.Array(IN_PROGRESS, UNDER_REVIEW, COMPLETE)
}

type FrameworkType = "Standard" | "Custom"
object FrameworkType {
  inline val Standard: "Standard" = "Standard"
  inline val Custom: "Custom" = "Custom"

  inline def values: js.Array[FrameworkType] = js.Array(Standard, Custom)
}

type KeywordInputType = "SELECT_FROM_LIST"
object KeywordInputType {
  inline val SELECT_FROM_LIST: "SELECT_FROM_LIST" = "SELECT_FROM_LIST"

  inline def values: js.Array[KeywordInputType] = js.Array(SELECT_FROM_LIST)
}

type ObjectTypeEnum = "ASSESSMENT" | "CONTROL_SET" | "CONTROL" | "DELEGATION" | "ASSESSMENT_REPORT"
object ObjectTypeEnum {
  inline val ASSESSMENT: "ASSESSMENT" = "ASSESSMENT"
  inline val CONTROL_SET: "CONTROL_SET" = "CONTROL_SET"
  inline val CONTROL: "CONTROL" = "CONTROL"
  inline val DELEGATION: "DELEGATION" = "DELEGATION"
  inline val ASSESSMENT_REPORT: "ASSESSMENT_REPORT" = "ASSESSMENT_REPORT"

  inline def values: js.Array[ObjectTypeEnum] = js.Array(ASSESSMENT, CONTROL_SET, CONTROL, DELEGATION, ASSESSMENT_REPORT)
}

type RoleType = "PROCESS_OWNER" | "RESOURCE_OWNER"
object RoleType {
  inline val PROCESS_OWNER: "PROCESS_OWNER" = "PROCESS_OWNER"
  inline val RESOURCE_OWNER: "RESOURCE_OWNER" = "RESOURCE_OWNER"

  inline def values: js.Array[RoleType] = js.Array(PROCESS_OWNER, RESOURCE_OWNER)
}

type SettingAttribute = "ALL" | "IS_AWS_ORG_ENABLED" | "SNS_TOPIC" | "DEFAULT_ASSESSMENT_REPORTS_DESTINATION" | "DEFAULT_PROCESS_OWNERS"
object SettingAttribute {
  inline val ALL: "ALL" = "ALL"
  inline val IS_AWS_ORG_ENABLED: "IS_AWS_ORG_ENABLED" = "IS_AWS_ORG_ENABLED"
  inline val SNS_TOPIC: "SNS_TOPIC" = "SNS_TOPIC"
  inline val DEFAULT_ASSESSMENT_REPORTS_DESTINATION: "DEFAULT_ASSESSMENT_REPORTS_DESTINATION" = "DEFAULT_ASSESSMENT_REPORTS_DESTINATION"
  inline val DEFAULT_PROCESS_OWNERS: "DEFAULT_PROCESS_OWNERS" = "DEFAULT_PROCESS_OWNERS"

  inline def values: js.Array[SettingAttribute] = js.Array(ALL, IS_AWS_ORG_ENABLED, SNS_TOPIC, DEFAULT_ASSESSMENT_REPORTS_DESTINATION, DEFAULT_PROCESS_OWNERS)
}

type SourceFrequency = "DAILY" | "WEEKLY" | "MONTHLY"
object SourceFrequency {
  inline val DAILY: "DAILY" = "DAILY"
  inline val WEEKLY: "WEEKLY" = "WEEKLY"
  inline val MONTHLY: "MONTHLY" = "MONTHLY"

  inline def values: js.Array[SourceFrequency] = js.Array(DAILY, WEEKLY, MONTHLY)
}

type SourceSetUpOption = "System_Controls_Mapping" | "Procedural_Controls_Mapping"
object SourceSetUpOption {
  inline val System_Controls_Mapping: "System_Controls_Mapping" = "System_Controls_Mapping"
  inline val Procedural_Controls_Mapping: "Procedural_Controls_Mapping" = "Procedural_Controls_Mapping"

  inline def values: js.Array[SourceSetUpOption] = js.Array(System_Controls_Mapping, Procedural_Controls_Mapping)
}

type SourceType = "AWS_Cloudtrail" | "AWS_Config" | "AWS_Security_Hub" | "AWS_API_Call" | "MANUAL"
object SourceType {
  inline val AWS_Cloudtrail: "AWS_Cloudtrail" = "AWS_Cloudtrail"
  inline val AWS_Config: "AWS_Config" = "AWS_Config"
  inline val AWS_Security_Hub: "AWS_Security_Hub" = "AWS_Security_Hub"
  inline val AWS_API_Call: "AWS_API_Call" = "AWS_API_Call"
  inline val MANUAL: "MANUAL" = "MANUAL"

  inline def values: js.Array[SourceType] = js.Array(AWS_Cloudtrail, AWS_Config, AWS_Security_Hub, AWS_API_Call, MANUAL)
}
