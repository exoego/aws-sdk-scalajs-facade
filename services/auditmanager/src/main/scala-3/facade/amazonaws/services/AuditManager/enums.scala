package facade.amazonaws.services.auditmanager

import scalajs._

type AccountStatus = "ACTIVE" | "INACTIVE" | "PENDING_ACTIVATION"
object AccountStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val PENDING_ACTIVATION: "PENDING_ACTIVATION" = "PENDING_ACTIVATION"

  @inline def values = js.Array[AccountStatus](ACTIVE, INACTIVE, PENDING_ACTIVATION)
}

type ActionEnum = "CREATE" | "UPDATE_METADATA" | "ACTIVE" | "INACTIVE" | "DELETE" | "UNDER_REVIEW" | "REVIEWED" | "IMPORT_EVIDENCE"
object ActionEnum {
  val CREATE: "CREATE" = "CREATE"
  val UPDATE_METADATA: "UPDATE_METADATA" = "UPDATE_METADATA"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val DELETE: "DELETE" = "DELETE"
  val UNDER_REVIEW: "UNDER_REVIEW" = "UNDER_REVIEW"
  val REVIEWED: "REVIEWED" = "REVIEWED"
  val IMPORT_EVIDENCE: "IMPORT_EVIDENCE" = "IMPORT_EVIDENCE"

  @inline def values = js.Array[ActionEnum](CREATE, UPDATE_METADATA, ACTIVE, INACTIVE, DELETE, UNDER_REVIEW, REVIEWED, IMPORT_EVIDENCE)
}

type AssessmentReportDestinationType = "S3"
object AssessmentReportDestinationType {
  val S3: "S3" = "S3"

  @inline def values = js.Array[AssessmentReportDestinationType](S3)
}

type AssessmentReportStatus = "COMPLETE" | "IN_PROGRESS" | "FAILED"
object AssessmentReportStatus {
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[AssessmentReportStatus](COMPLETE, IN_PROGRESS, FAILED)
}

type AssessmentStatus = "ACTIVE" | "INACTIVE"
object AssessmentStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[AssessmentStatus](ACTIVE, INACTIVE)
}

type ControlResponse = "MANUAL" | "AUTOMATE" | "DEFER" | "IGNORE"
object ControlResponse {
  val MANUAL: "MANUAL" = "MANUAL"
  val AUTOMATE: "AUTOMATE" = "AUTOMATE"
  val DEFER: "DEFER" = "DEFER"
  val IGNORE: "IGNORE" = "IGNORE"

  @inline def values = js.Array[ControlResponse](MANUAL, AUTOMATE, DEFER, IGNORE)
}

type ControlSetStatus = "ACTIVE" | "UNDER_REVIEW" | "REVIEWED"
object ControlSetStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val UNDER_REVIEW: "UNDER_REVIEW" = "UNDER_REVIEW"
  val REVIEWED: "REVIEWED" = "REVIEWED"

  @inline def values = js.Array[ControlSetStatus](ACTIVE, UNDER_REVIEW, REVIEWED)
}

type ControlStatus = "UNDER_REVIEW" | "REVIEWED" | "INACTIVE"
object ControlStatus {
  val UNDER_REVIEW: "UNDER_REVIEW" = "UNDER_REVIEW"
  val REVIEWED: "REVIEWED" = "REVIEWED"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[ControlStatus](UNDER_REVIEW, REVIEWED, INACTIVE)
}

type ControlType = "Standard" | "Custom"
object ControlType {
  val Standard: "Standard" = "Standard"
  val Custom: "Custom" = "Custom"

  @inline def values = js.Array[ControlType](Standard, Custom)
}

type DelegationStatus = "IN_PROGRESS" | "UNDER_REVIEW" | "COMPLETE"
object DelegationStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val UNDER_REVIEW: "UNDER_REVIEW" = "UNDER_REVIEW"
  val COMPLETE: "COMPLETE" = "COMPLETE"

  @inline def values = js.Array[DelegationStatus](IN_PROGRESS, UNDER_REVIEW, COMPLETE)
}

type FrameworkType = "Standard" | "Custom"
object FrameworkType {
  val Standard: "Standard" = "Standard"
  val Custom: "Custom" = "Custom"

  @inline def values = js.Array[FrameworkType](Standard, Custom)
}

type KeywordInputType = "SELECT_FROM_LIST"
object KeywordInputType {
  val SELECT_FROM_LIST: "SELECT_FROM_LIST" = "SELECT_FROM_LIST"

  @inline def values = js.Array[KeywordInputType](SELECT_FROM_LIST)
}

type ObjectTypeEnum = "ASSESSMENT" | "CONTROL_SET" | "CONTROL" | "DELEGATION" | "ASSESSMENT_REPORT"
object ObjectTypeEnum {
  val ASSESSMENT: "ASSESSMENT" = "ASSESSMENT"
  val CONTROL_SET: "CONTROL_SET" = "CONTROL_SET"
  val CONTROL: "CONTROL" = "CONTROL"
  val DELEGATION: "DELEGATION" = "DELEGATION"
  val ASSESSMENT_REPORT: "ASSESSMENT_REPORT" = "ASSESSMENT_REPORT"

  @inline def values = js.Array[ObjectTypeEnum](ASSESSMENT, CONTROL_SET, CONTROL, DELEGATION, ASSESSMENT_REPORT)
}

type RoleType = "PROCESS_OWNER" | "RESOURCE_OWNER"
object RoleType {
  val PROCESS_OWNER: "PROCESS_OWNER" = "PROCESS_OWNER"
  val RESOURCE_OWNER: "RESOURCE_OWNER" = "RESOURCE_OWNER"

  @inline def values = js.Array[RoleType](PROCESS_OWNER, RESOURCE_OWNER)
}

type SettingAttribute = "ALL" | "IS_AWS_ORG_ENABLED" | "SNS_TOPIC" | "DEFAULT_ASSESSMENT_REPORTS_DESTINATION" | "DEFAULT_PROCESS_OWNERS"
object SettingAttribute {
  val ALL: "ALL" = "ALL"
  val IS_AWS_ORG_ENABLED: "IS_AWS_ORG_ENABLED" = "IS_AWS_ORG_ENABLED"
  val SNS_TOPIC: "SNS_TOPIC" = "SNS_TOPIC"
  val DEFAULT_ASSESSMENT_REPORTS_DESTINATION: "DEFAULT_ASSESSMENT_REPORTS_DESTINATION" = "DEFAULT_ASSESSMENT_REPORTS_DESTINATION"
  val DEFAULT_PROCESS_OWNERS: "DEFAULT_PROCESS_OWNERS" = "DEFAULT_PROCESS_OWNERS"

  @inline def values = js.Array[SettingAttribute](ALL, IS_AWS_ORG_ENABLED, SNS_TOPIC, DEFAULT_ASSESSMENT_REPORTS_DESTINATION, DEFAULT_PROCESS_OWNERS)
}

type SourceFrequency = "DAILY" | "WEEKLY" | "MONTHLY"
object SourceFrequency {
  val DAILY: "DAILY" = "DAILY"
  val WEEKLY: "WEEKLY" = "WEEKLY"
  val MONTHLY: "MONTHLY" = "MONTHLY"

  @inline def values = js.Array[SourceFrequency](DAILY, WEEKLY, MONTHLY)
}

type SourceSetUpOption = "System_Controls_Mapping" | "Procedural_Controls_Mapping"
object SourceSetUpOption {
  val System_Controls_Mapping: "System_Controls_Mapping" = "System_Controls_Mapping"
  val Procedural_Controls_Mapping: "Procedural_Controls_Mapping" = "Procedural_Controls_Mapping"

  @inline def values = js.Array[SourceSetUpOption](System_Controls_Mapping, Procedural_Controls_Mapping)
}

type SourceType = "AWS_Cloudtrail" | "AWS_Config" | "AWS_Security_Hub" | "AWS_API_Call" | "MANUAL"
object SourceType {
  val AWS_Cloudtrail: "AWS_Cloudtrail" = "AWS_Cloudtrail"
  val AWS_Config: "AWS_Config" = "AWS_Config"
  val AWS_Security_Hub: "AWS_Security_Hub" = "AWS_Security_Hub"
  val AWS_API_Call: "AWS_API_Call" = "AWS_API_Call"
  val MANUAL: "MANUAL" = "MANUAL"

  @inline def values = js.Array[SourceType](AWS_Cloudtrail, AWS_Config, AWS_Security_Hub, AWS_API_Call, MANUAL)
}
