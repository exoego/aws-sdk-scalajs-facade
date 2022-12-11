package facade.amazonaws.services.auditmanager

import scalajs.js

@js.native
sealed trait AccountStatus extends js.Any
object AccountStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AccountStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[AccountStatus]
  val PENDING_ACTIVATION = "PENDING_ACTIVATION".asInstanceOf[AccountStatus]

  @inline def values: js.Array[AccountStatus] = js.Array(ACTIVE, INACTIVE, PENDING_ACTIVATION)
}

@js.native
sealed trait ActionEnum extends js.Any
object ActionEnum {
  val CREATE = "CREATE".asInstanceOf[ActionEnum]
  val UPDATE_METADATA = "UPDATE_METADATA".asInstanceOf[ActionEnum]
  val ACTIVE = "ACTIVE".asInstanceOf[ActionEnum]
  val INACTIVE = "INACTIVE".asInstanceOf[ActionEnum]
  val DELETE = "DELETE".asInstanceOf[ActionEnum]
  val UNDER_REVIEW = "UNDER_REVIEW".asInstanceOf[ActionEnum]
  val REVIEWED = "REVIEWED".asInstanceOf[ActionEnum]
  val IMPORT_EVIDENCE = "IMPORT_EVIDENCE".asInstanceOf[ActionEnum]

  @inline def values: js.Array[ActionEnum] = js.Array(CREATE, UPDATE_METADATA, ACTIVE, INACTIVE, DELETE, UNDER_REVIEW, REVIEWED, IMPORT_EVIDENCE)
}

@js.native
sealed trait AssessmentReportDestinationType extends js.Any
object AssessmentReportDestinationType {
  val S3 = "S3".asInstanceOf[AssessmentReportDestinationType]

  @inline def values: js.Array[AssessmentReportDestinationType] = js.Array(S3)
}

@js.native
sealed trait AssessmentReportStatus extends js.Any
object AssessmentReportStatus {
  val COMPLETE = "COMPLETE".asInstanceOf[AssessmentReportStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AssessmentReportStatus]
  val FAILED = "FAILED".asInstanceOf[AssessmentReportStatus]

  @inline def values: js.Array[AssessmentReportStatus] = js.Array(COMPLETE, IN_PROGRESS, FAILED)
}

@js.native
sealed trait AssessmentStatus extends js.Any
object AssessmentStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AssessmentStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[AssessmentStatus]

  @inline def values: js.Array[AssessmentStatus] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait ControlResponse extends js.Any
object ControlResponse {
  val MANUAL = "MANUAL".asInstanceOf[ControlResponse]
  val AUTOMATE = "AUTOMATE".asInstanceOf[ControlResponse]
  val DEFER = "DEFER".asInstanceOf[ControlResponse]
  val IGNORE = "IGNORE".asInstanceOf[ControlResponse]

  @inline def values: js.Array[ControlResponse] = js.Array(MANUAL, AUTOMATE, DEFER, IGNORE)
}

@js.native
sealed trait ControlSetStatus extends js.Any
object ControlSetStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ControlSetStatus]
  val UNDER_REVIEW = "UNDER_REVIEW".asInstanceOf[ControlSetStatus]
  val REVIEWED = "REVIEWED".asInstanceOf[ControlSetStatus]

  @inline def values: js.Array[ControlSetStatus] = js.Array(ACTIVE, UNDER_REVIEW, REVIEWED)
}

@js.native
sealed trait ControlStatus extends js.Any
object ControlStatus {
  val UNDER_REVIEW = "UNDER_REVIEW".asInstanceOf[ControlStatus]
  val REVIEWED = "REVIEWED".asInstanceOf[ControlStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[ControlStatus]

  @inline def values: js.Array[ControlStatus] = js.Array(UNDER_REVIEW, REVIEWED, INACTIVE)
}

@js.native
sealed trait ControlType extends js.Any
object ControlType {
  val Standard = "Standard".asInstanceOf[ControlType]
  val Custom = "Custom".asInstanceOf[ControlType]

  @inline def values: js.Array[ControlType] = js.Array(Standard, Custom)
}

@js.native
sealed trait DelegationStatus extends js.Any
object DelegationStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DelegationStatus]
  val UNDER_REVIEW = "UNDER_REVIEW".asInstanceOf[DelegationStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[DelegationStatus]

  @inline def values: js.Array[DelegationStatus] = js.Array(IN_PROGRESS, UNDER_REVIEW, COMPLETE)
}

@js.native
sealed trait EvidenceFinderBackfillStatus extends js.Any
object EvidenceFinderBackfillStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[EvidenceFinderBackfillStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[EvidenceFinderBackfillStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[EvidenceFinderBackfillStatus]

  @inline def values: js.Array[EvidenceFinderBackfillStatus] = js.Array(NOT_STARTED, IN_PROGRESS, COMPLETED)
}

@js.native
sealed trait EvidenceFinderEnablementStatus extends js.Any
object EvidenceFinderEnablementStatus {
  val ENABLED = "ENABLED".asInstanceOf[EvidenceFinderEnablementStatus]
  val DISABLED = "DISABLED".asInstanceOf[EvidenceFinderEnablementStatus]
  val ENABLE_IN_PROGRESS = "ENABLE_IN_PROGRESS".asInstanceOf[EvidenceFinderEnablementStatus]
  val DISABLE_IN_PROGRESS = "DISABLE_IN_PROGRESS".asInstanceOf[EvidenceFinderEnablementStatus]

  @inline def values: js.Array[EvidenceFinderEnablementStatus] = js.Array(ENABLED, DISABLED, ENABLE_IN_PROGRESS, DISABLE_IN_PROGRESS)
}

@js.native
sealed trait FrameworkType extends js.Any
object FrameworkType {
  val Standard = "Standard".asInstanceOf[FrameworkType]
  val Custom = "Custom".asInstanceOf[FrameworkType]

  @inline def values: js.Array[FrameworkType] = js.Array(Standard, Custom)
}

@js.native
sealed trait KeywordInputType extends js.Any
object KeywordInputType {
  val SELECT_FROM_LIST = "SELECT_FROM_LIST".asInstanceOf[KeywordInputType]

  @inline def values: js.Array[KeywordInputType] = js.Array(SELECT_FROM_LIST)
}

@js.native
sealed trait ObjectTypeEnum extends js.Any
object ObjectTypeEnum {
  val ASSESSMENT = "ASSESSMENT".asInstanceOf[ObjectTypeEnum]
  val CONTROL_SET = "CONTROL_SET".asInstanceOf[ObjectTypeEnum]
  val CONTROL = "CONTROL".asInstanceOf[ObjectTypeEnum]
  val DELEGATION = "DELEGATION".asInstanceOf[ObjectTypeEnum]
  val ASSESSMENT_REPORT = "ASSESSMENT_REPORT".asInstanceOf[ObjectTypeEnum]

  @inline def values: js.Array[ObjectTypeEnum] = js.Array(ASSESSMENT, CONTROL_SET, CONTROL, DELEGATION, ASSESSMENT_REPORT)
}

@js.native
sealed trait RoleType extends js.Any
object RoleType {
  val PROCESS_OWNER = "PROCESS_OWNER".asInstanceOf[RoleType]
  val RESOURCE_OWNER = "RESOURCE_OWNER".asInstanceOf[RoleType]

  @inline def values: js.Array[RoleType] = js.Array(PROCESS_OWNER, RESOURCE_OWNER)
}

@js.native
sealed trait SettingAttribute extends js.Any
object SettingAttribute {
  val ALL = "ALL".asInstanceOf[SettingAttribute]
  val IS_AWS_ORG_ENABLED = "IS_AWS_ORG_ENABLED".asInstanceOf[SettingAttribute]
  val SNS_TOPIC = "SNS_TOPIC".asInstanceOf[SettingAttribute]
  val DEFAULT_ASSESSMENT_REPORTS_DESTINATION = "DEFAULT_ASSESSMENT_REPORTS_DESTINATION".asInstanceOf[SettingAttribute]
  val DEFAULT_PROCESS_OWNERS = "DEFAULT_PROCESS_OWNERS".asInstanceOf[SettingAttribute]
  val EVIDENCE_FINDER_ENABLEMENT = "EVIDENCE_FINDER_ENABLEMENT".asInstanceOf[SettingAttribute]

  @inline def values: js.Array[SettingAttribute] = js.Array(ALL, IS_AWS_ORG_ENABLED, SNS_TOPIC, DEFAULT_ASSESSMENT_REPORTS_DESTINATION, DEFAULT_PROCESS_OWNERS, EVIDENCE_FINDER_ENABLEMENT)
}

@js.native
sealed trait ShareRequestAction extends js.Any
object ShareRequestAction {
  val ACCEPT = "ACCEPT".asInstanceOf[ShareRequestAction]
  val DECLINE = "DECLINE".asInstanceOf[ShareRequestAction]
  val REVOKE = "REVOKE".asInstanceOf[ShareRequestAction]

  @inline def values: js.Array[ShareRequestAction] = js.Array(ACCEPT, DECLINE, REVOKE)
}

@js.native
sealed trait ShareRequestStatus extends js.Any
object ShareRequestStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ShareRequestStatus]
  val REPLICATING = "REPLICATING".asInstanceOf[ShareRequestStatus]
  val SHARED = "SHARED".asInstanceOf[ShareRequestStatus]
  val EXPIRING = "EXPIRING".asInstanceOf[ShareRequestStatus]
  val FAILED = "FAILED".asInstanceOf[ShareRequestStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[ShareRequestStatus]
  val DECLINED = "DECLINED".asInstanceOf[ShareRequestStatus]
  val REVOKED = "REVOKED".asInstanceOf[ShareRequestStatus]

  @inline def values: js.Array[ShareRequestStatus] = js.Array(ACTIVE, REPLICATING, SHARED, EXPIRING, FAILED, EXPIRED, DECLINED, REVOKED)
}

@js.native
sealed trait ShareRequestType extends js.Any
object ShareRequestType {
  val SENT = "SENT".asInstanceOf[ShareRequestType]
  val RECEIVED = "RECEIVED".asInstanceOf[ShareRequestType]

  @inline def values: js.Array[ShareRequestType] = js.Array(SENT, RECEIVED)
}

@js.native
sealed trait SourceFrequency extends js.Any
object SourceFrequency {
  val DAILY = "DAILY".asInstanceOf[SourceFrequency]
  val WEEKLY = "WEEKLY".asInstanceOf[SourceFrequency]
  val MONTHLY = "MONTHLY".asInstanceOf[SourceFrequency]

  @inline def values: js.Array[SourceFrequency] = js.Array(DAILY, WEEKLY, MONTHLY)
}

@js.native
sealed trait SourceSetUpOption extends js.Any
object SourceSetUpOption {
  val System_Controls_Mapping = "System_Controls_Mapping".asInstanceOf[SourceSetUpOption]
  val Procedural_Controls_Mapping = "Procedural_Controls_Mapping".asInstanceOf[SourceSetUpOption]

  @inline def values: js.Array[SourceSetUpOption] = js.Array(System_Controls_Mapping, Procedural_Controls_Mapping)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val AWS_Cloudtrail = "AWS_Cloudtrail".asInstanceOf[SourceType]
  val AWS_Config = "AWS_Config".asInstanceOf[SourceType]
  val AWS_Security_Hub = "AWS_Security_Hub".asInstanceOf[SourceType]
  val AWS_API_Call = "AWS_API_Call".asInstanceOf[SourceType]
  val MANUAL = "MANUAL".asInstanceOf[SourceType]

  @inline def values: js.Array[SourceType] = js.Array(AWS_Cloudtrail, AWS_Config, AWS_Security_Hub, AWS_API_Call, MANUAL)
}
