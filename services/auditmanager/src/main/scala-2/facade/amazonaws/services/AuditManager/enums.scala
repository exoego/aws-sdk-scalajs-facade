package facade.amazonaws.services.auditmanager

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AccountStatus extends js.Any
object AccountStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AccountStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[AccountStatus]
  val PENDING_ACTIVATION = "PENDING_ACTIVATION".asInstanceOf[AccountStatus]

  @inline def values = js.Array(ACTIVE, INACTIVE, PENDING_ACTIVATION)
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

  @inline def values = js.Array(CREATE, UPDATE_METADATA, ACTIVE, INACTIVE, DELETE, UNDER_REVIEW, REVIEWED, IMPORT_EVIDENCE)
}

@js.native
sealed trait AssessmentReportDestinationType extends js.Any
object AssessmentReportDestinationType {
  val S3 = "S3".asInstanceOf[AssessmentReportDestinationType]

  @inline def values = js.Array(S3)
}

@js.native
sealed trait AssessmentReportStatus extends js.Any
object AssessmentReportStatus {
  val COMPLETE = "COMPLETE".asInstanceOf[AssessmentReportStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AssessmentReportStatus]
  val FAILED = "FAILED".asInstanceOf[AssessmentReportStatus]

  @inline def values = js.Array(COMPLETE, IN_PROGRESS, FAILED)
}

@js.native
sealed trait AssessmentStatus extends js.Any
object AssessmentStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AssessmentStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[AssessmentStatus]

  @inline def values = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait ControlResponse extends js.Any
object ControlResponse {
  val MANUAL = "MANUAL".asInstanceOf[ControlResponse]
  val AUTOMATE = "AUTOMATE".asInstanceOf[ControlResponse]
  val DEFER = "DEFER".asInstanceOf[ControlResponse]
  val IGNORE = "IGNORE".asInstanceOf[ControlResponse]

  @inline def values = js.Array(MANUAL, AUTOMATE, DEFER, IGNORE)
}

@js.native
sealed trait ControlSetStatus extends js.Any
object ControlSetStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ControlSetStatus]
  val UNDER_REVIEW = "UNDER_REVIEW".asInstanceOf[ControlSetStatus]
  val REVIEWED = "REVIEWED".asInstanceOf[ControlSetStatus]

  @inline def values = js.Array(ACTIVE, UNDER_REVIEW, REVIEWED)
}

@js.native
sealed trait ControlStatus extends js.Any
object ControlStatus {
  val UNDER_REVIEW = "UNDER_REVIEW".asInstanceOf[ControlStatus]
  val REVIEWED = "REVIEWED".asInstanceOf[ControlStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[ControlStatus]

  @inline def values = js.Array(UNDER_REVIEW, REVIEWED, INACTIVE)
}

@js.native
sealed trait ControlType extends js.Any
object ControlType {
  val Standard = "Standard".asInstanceOf[ControlType]
  val Custom = "Custom".asInstanceOf[ControlType]

  @inline def values = js.Array(Standard, Custom)
}

@js.native
sealed trait DelegationStatus extends js.Any
object DelegationStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DelegationStatus]
  val UNDER_REVIEW = "UNDER_REVIEW".asInstanceOf[DelegationStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[DelegationStatus]

  @inline def values = js.Array(IN_PROGRESS, UNDER_REVIEW, COMPLETE)
}

@js.native
sealed trait FrameworkType extends js.Any
object FrameworkType {
  val Standard = "Standard".asInstanceOf[FrameworkType]
  val Custom = "Custom".asInstanceOf[FrameworkType]

  @inline def values = js.Array(Standard, Custom)
}

@js.native
sealed trait KeywordInputType extends js.Any
object KeywordInputType {
  val SELECT_FROM_LIST = "SELECT_FROM_LIST".asInstanceOf[KeywordInputType]

  @inline def values = js.Array(SELECT_FROM_LIST)
}

@js.native
sealed trait ObjectTypeEnum extends js.Any
object ObjectTypeEnum {
  val ASSESSMENT = "ASSESSMENT".asInstanceOf[ObjectTypeEnum]
  val CONTROL_SET = "CONTROL_SET".asInstanceOf[ObjectTypeEnum]
  val CONTROL = "CONTROL".asInstanceOf[ObjectTypeEnum]
  val DELEGATION = "DELEGATION".asInstanceOf[ObjectTypeEnum]
  val ASSESSMENT_REPORT = "ASSESSMENT_REPORT".asInstanceOf[ObjectTypeEnum]

  @inline def values = js.Array(ASSESSMENT, CONTROL_SET, CONTROL, DELEGATION, ASSESSMENT_REPORT)
}

@js.native
sealed trait RoleType extends js.Any
object RoleType {
  val PROCESS_OWNER = "PROCESS_OWNER".asInstanceOf[RoleType]
  val RESOURCE_OWNER = "RESOURCE_OWNER".asInstanceOf[RoleType]

  @inline def values = js.Array(PROCESS_OWNER, RESOURCE_OWNER)
}

@js.native
sealed trait SettingAttribute extends js.Any
object SettingAttribute {
  val ALL = "ALL".asInstanceOf[SettingAttribute]
  val IS_AWS_ORG_ENABLED = "IS_AWS_ORG_ENABLED".asInstanceOf[SettingAttribute]
  val SNS_TOPIC = "SNS_TOPIC".asInstanceOf[SettingAttribute]
  val DEFAULT_ASSESSMENT_REPORTS_DESTINATION = "DEFAULT_ASSESSMENT_REPORTS_DESTINATION".asInstanceOf[SettingAttribute]
  val DEFAULT_PROCESS_OWNERS = "DEFAULT_PROCESS_OWNERS".asInstanceOf[SettingAttribute]

  @inline def values = js.Array(ALL, IS_AWS_ORG_ENABLED, SNS_TOPIC, DEFAULT_ASSESSMENT_REPORTS_DESTINATION, DEFAULT_PROCESS_OWNERS)
}

@js.native
sealed trait SourceFrequency extends js.Any
object SourceFrequency {
  val DAILY = "DAILY".asInstanceOf[SourceFrequency]
  val WEEKLY = "WEEKLY".asInstanceOf[SourceFrequency]
  val MONTHLY = "MONTHLY".asInstanceOf[SourceFrequency]

  @inline def values = js.Array(DAILY, WEEKLY, MONTHLY)
}

@js.native
sealed trait SourceSetUpOption extends js.Any
object SourceSetUpOption {
  val System_Controls_Mapping = "System_Controls_Mapping".asInstanceOf[SourceSetUpOption]
  val Procedural_Controls_Mapping = "Procedural_Controls_Mapping".asInstanceOf[SourceSetUpOption]

  @inline def values = js.Array(System_Controls_Mapping, Procedural_Controls_Mapping)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val AWS_Cloudtrail = "AWS_Cloudtrail".asInstanceOf[SourceType]
  val AWS_Config = "AWS_Config".asInstanceOf[SourceType]
  val AWS_Security_Hub = "AWS_Security_Hub".asInstanceOf[SourceType]
  val AWS_API_Call = "AWS_API_Call".asInstanceOf[SourceType]
  val MANUAL = "MANUAL".asInstanceOf[SourceType]

  @inline def values = js.Array(AWS_Cloudtrail, AWS_Config, AWS_Security_Hub, AWS_API_Call, MANUAL)
}

