package facade.amazonaws.services.macie2

import scalajs.js

/** The current status of an account as the delegated Amazon Macie administrator account for an AWS organization. Possible values are:
  */
@js.native
sealed trait AdminStatus extends js.Any
object AdminStatus {
  val ENABLED = "ENABLED".asInstanceOf[AdminStatus]
  val DISABLING_IN_PROGRESS = "DISABLING_IN_PROGRESS".asInstanceOf[AdminStatus]

  @inline def values: js.Array[AdminStatus] = js.Array(ENABLED, DISABLING_IN_PROGRESS)
}

/** The type of currency that the data for an Amazon Macie usage metric is reported in. Possible values are:
  */
@js.native
sealed trait Currency extends js.Any
object Currency {
  val USD = "USD".asInstanceOf[Currency]

  @inline def values: js.Array[Currency] = js.Array(USD)
}

@js.native
sealed trait DayOfWeek extends js.Any
object DayOfWeek {
  val SUNDAY = "SUNDAY".asInstanceOf[DayOfWeek]
  val MONDAY = "MONDAY".asInstanceOf[DayOfWeek]
  val TUESDAY = "TUESDAY".asInstanceOf[DayOfWeek]
  val WEDNESDAY = "WEDNESDAY".asInstanceOf[DayOfWeek]
  val THURSDAY = "THURSDAY".asInstanceOf[DayOfWeek]
  val FRIDAY = "FRIDAY".asInstanceOf[DayOfWeek]
  val SATURDAY = "SATURDAY".asInstanceOf[DayOfWeek]

  @inline def values: js.Array[DayOfWeek] = js.Array(SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY)
}

@js.native
sealed trait EffectivePermission extends js.Any
object EffectivePermission {
  val PUBLIC = "PUBLIC".asInstanceOf[EffectivePermission]
  val NOT_PUBLIC = "NOT_PUBLIC".asInstanceOf[EffectivePermission]
  val UNKNOWN = "UNKNOWN".asInstanceOf[EffectivePermission]

  @inline def values: js.Array[EffectivePermission] = js.Array(PUBLIC, NOT_PUBLIC, UNKNOWN)
}

/** The type of server-side encryption that's used to encrypt an S3 object or objects in an S3 bucket. Valid values are:
  */
@js.native
sealed trait EncryptionType extends js.Any
object EncryptionType {
  val NONE = "NONE".asInstanceOf[EncryptionType]
  val AES256 = "AES256".asInstanceOf[EncryptionType]
  val `aws:kms` = "aws:kms".asInstanceOf[EncryptionType]
  val UNKNOWN = "UNKNOWN".asInstanceOf[EncryptionType]

  @inline def values: js.Array[EncryptionType] = js.Array(NONE, AES256, `aws:kms`, UNKNOWN)
}

/** The source of an issue or delay. Possible values are:
  */
@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val ClientError = "ClientError".asInstanceOf[ErrorCode]
  val InternalError = "InternalError".asInstanceOf[ErrorCode]

  @inline def values: js.Array[ErrorCode] = js.Array(ClientError, InternalError)
}

/** The type of action that occurred for the resource and produced the policy finding:
  */
@js.native
sealed trait FindingActionType extends js.Any
object FindingActionType {
  val AWS_API_CALL = "AWS_API_CALL".asInstanceOf[FindingActionType]

  @inline def values: js.Array[FindingActionType] = js.Array(AWS_API_CALL)
}

/** The category of the finding. Valid values are:
  */
@js.native
sealed trait FindingCategory extends js.Any
object FindingCategory {
  val CLASSIFICATION = "CLASSIFICATION".asInstanceOf[FindingCategory]
  val POLICY = "POLICY".asInstanceOf[FindingCategory]

  @inline def values: js.Array[FindingCategory] = js.Array(CLASSIFICATION, POLICY)
}

/** The frequency with which Amazon Macie publishes updates to policy findings for an account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events). For more information, see [[https://docs.aws.amazon.com/macie/latest/user/findings-monitor.html|Monitoring and processing findings]] in the <i>Amazon Macie User Guide</i>. Valid values are:
  */
@js.native
sealed trait FindingPublishingFrequency extends js.Any
object FindingPublishingFrequency {
  val FIFTEEN_MINUTES = "FIFTEEN_MINUTES".asInstanceOf[FindingPublishingFrequency]
  val ONE_HOUR = "ONE_HOUR".asInstanceOf[FindingPublishingFrequency]
  val SIX_HOURS = "SIX_HOURS".asInstanceOf[FindingPublishingFrequency]

  @inline def values: js.Array[FindingPublishingFrequency] = js.Array(FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS)
}

/** The grouping to sort the results by. Valid values are:
  */
@js.native
sealed trait FindingStatisticsSortAttributeName extends js.Any
object FindingStatisticsSortAttributeName {
  val groupKey = "groupKey".asInstanceOf[FindingStatisticsSortAttributeName]
  val count = "count".asInstanceOf[FindingStatisticsSortAttributeName]

  @inline def values: js.Array[FindingStatisticsSortAttributeName] = js.Array(groupKey, count)
}

/** The type of finding. For details about each type, see [[https://docs.aws.amazon.com/macie/latest/user/findings-types.html|Types of Amazon Macie findings]] in the <i>Amazon Macie User Guide</i>. Valid values are:
  */
@js.native
sealed trait FindingType extends js.Any
object FindingType {
  val `SensitiveData:S3Object/Multiple` = "SensitiveData:S3Object/Multiple".asInstanceOf[FindingType]
  val `SensitiveData:S3Object/Financial` = "SensitiveData:S3Object/Financial".asInstanceOf[FindingType]
  val `SensitiveData:S3Object/Personal` = "SensitiveData:S3Object/Personal".asInstanceOf[FindingType]
  val `SensitiveData:S3Object/Credentials` = "SensitiveData:S3Object/Credentials".asInstanceOf[FindingType]
  val `SensitiveData:S3Object/CustomIdentifier` = "SensitiveData:S3Object/CustomIdentifier".asInstanceOf[FindingType]
  val `Policy:IAMUser/S3BucketPublic` = "Policy:IAMUser/S3BucketPublic".asInstanceOf[FindingType]
  val `Policy:IAMUser/S3BucketSharedExternally` = "Policy:IAMUser/S3BucketSharedExternally".asInstanceOf[FindingType]
  val `Policy:IAMUser/S3BucketReplicatedExternally` = "Policy:IAMUser/S3BucketReplicatedExternally".asInstanceOf[FindingType]
  val `Policy:IAMUser/S3BucketEncryptionDisabled` = "Policy:IAMUser/S3BucketEncryptionDisabled".asInstanceOf[FindingType]
  val `Policy:IAMUser/S3BlockPublicAccessDisabled` = "Policy:IAMUser/S3BlockPublicAccessDisabled".asInstanceOf[FindingType]

  @inline def values: js.Array[FindingType] = js.Array(
    `SensitiveData:S3Object/Multiple`,
    `SensitiveData:S3Object/Financial`,
    `SensitiveData:S3Object/Personal`,
    `SensitiveData:S3Object/Credentials`,
    `SensitiveData:S3Object/CustomIdentifier`,
    `Policy:IAMUser/S3BucketPublic`,
    `Policy:IAMUser/S3BucketSharedExternally`,
    `Policy:IAMUser/S3BucketReplicatedExternally`,
    `Policy:IAMUser/S3BucketEncryptionDisabled`,
    `Policy:IAMUser/S3BlockPublicAccessDisabled`
  )
}

/** The action to perform on findings that meet the filter criteria. To suppress (automatically archive) findings that meet the criteria, set this value to ARCHIVE. Valid values are:
  */
@js.native
sealed trait FindingsFilterAction extends js.Any
object FindingsFilterAction {
  val ARCHIVE = "ARCHIVE".asInstanceOf[FindingsFilterAction]
  val NOOP = "NOOP".asInstanceOf[FindingsFilterAction]

  @inline def values: js.Array[FindingsFilterAction] = js.Array(ARCHIVE, NOOP)
}

@js.native
sealed trait GroupBy extends js.Any
object GroupBy {
  val `resourcesAffected.s3Bucket.name` = "resourcesAffected.s3Bucket.name".asInstanceOf[GroupBy]
  val `type` = "type".asInstanceOf[GroupBy]
  val `classificationDetails.jobId` = "classificationDetails.jobId".asInstanceOf[GroupBy]
  val `severity.description` = "severity.description".asInstanceOf[GroupBy]

  @inline def values: js.Array[GroupBy] = js.Array(`resourcesAffected.s3Bucket.name`, `type`, `classificationDetails.jobId`, `severity.description`)
}

@js.native
sealed trait IsDefinedInJob extends js.Any
object IsDefinedInJob {
  val TRUE = "TRUE".asInstanceOf[IsDefinedInJob]
  val FALSE = "FALSE".asInstanceOf[IsDefinedInJob]
  val UNKNOWN = "UNKNOWN".asInstanceOf[IsDefinedInJob]

  @inline def values: js.Array[IsDefinedInJob] = js.Array(TRUE, FALSE, UNKNOWN)
}

@js.native
sealed trait IsMonitoredByJob extends js.Any
object IsMonitoredByJob {
  val TRUE = "TRUE".asInstanceOf[IsMonitoredByJob]
  val FALSE = "FALSE".asInstanceOf[IsMonitoredByJob]
  val UNKNOWN = "UNKNOWN".asInstanceOf[IsMonitoredByJob]

  @inline def values: js.Array[IsMonitoredByJob] = js.Array(TRUE, FALSE, UNKNOWN)
}

/** The operator to use in a condition. Valid values are:
  */
@js.native
sealed trait JobComparator extends js.Any
object JobComparator {
  val EQ = "EQ".asInstanceOf[JobComparator]
  val GT = "GT".asInstanceOf[JobComparator]
  val GTE = "GTE".asInstanceOf[JobComparator]
  val LT = "LT".asInstanceOf[JobComparator]
  val LTE = "LTE".asInstanceOf[JobComparator]
  val NE = "NE".asInstanceOf[JobComparator]
  val CONTAINS = "CONTAINS".asInstanceOf[JobComparator]
  val STARTS_WITH = "STARTS_WITH".asInstanceOf[JobComparator]

  @inline def values: js.Array[JobComparator] = js.Array(EQ, GT, GTE, LT, LTE, NE, CONTAINS, STARTS_WITH)
}

/** The status of a classification job. Possible values are:
  */
@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val RUNNING = "RUNNING".asInstanceOf[JobStatus]
  val PAUSED = "PAUSED".asInstanceOf[JobStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[JobStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[JobStatus]
  val IDLE = "IDLE".asInstanceOf[JobStatus]
  val USER_PAUSED = "USER_PAUSED".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(RUNNING, PAUSED, CANCELLED, COMPLETE, IDLE, USER_PAUSED)
}

/** The schedule for running a classification job. Valid values are:
  */
@js.native
sealed trait JobType extends js.Any
object JobType {
  val ONE_TIME = "ONE_TIME".asInstanceOf[JobType]
  val SCHEDULED = "SCHEDULED".asInstanceOf[JobType]

  @inline def values: js.Array[JobType] = js.Array(ONE_TIME, SCHEDULED)
}

/** Specifies whether any account- or bucket-level access errors occurred during the run of a one-time classification job or the most recent run of a recurring classification job. Possible values are:
  */
@js.native
sealed trait LastRunErrorStatusCode extends js.Any
object LastRunErrorStatusCode {
  val NONE = "NONE".asInstanceOf[LastRunErrorStatusCode]
  val ERROR = "ERROR".asInstanceOf[LastRunErrorStatusCode]

  @inline def values: js.Array[LastRunErrorStatusCode] = js.Array(NONE, ERROR)
}

/** The property to use to filter the results. Valid values are:
  */
@js.native
sealed trait ListJobsFilterKey extends js.Any
object ListJobsFilterKey {
  val jobType = "jobType".asInstanceOf[ListJobsFilterKey]
  val jobStatus = "jobStatus".asInstanceOf[ListJobsFilterKey]
  val createdAt = "createdAt".asInstanceOf[ListJobsFilterKey]
  val name = "name".asInstanceOf[ListJobsFilterKey]

  @inline def values: js.Array[ListJobsFilterKey] = js.Array(jobType, jobStatus, createdAt, name)
}

/** The property to sort the results by. Valid values are:
  */
@js.native
sealed trait ListJobsSortAttributeName extends js.Any
object ListJobsSortAttributeName {
  val createdAt = "createdAt".asInstanceOf[ListJobsSortAttributeName]
  val jobStatus = "jobStatus".asInstanceOf[ListJobsSortAttributeName]
  val name = "name".asInstanceOf[ListJobsSortAttributeName]
  val jobType = "jobType".asInstanceOf[ListJobsSortAttributeName]

  @inline def values: js.Array[ListJobsSortAttributeName] = js.Array(createdAt, jobStatus, name, jobType)
}

/** The status of an Amazon Macie account. Valid values are:
  */
@js.native
sealed trait MacieStatus extends js.Any
object MacieStatus {
  val PAUSED = "PAUSED".asInstanceOf[MacieStatus]
  val ENABLED = "ENABLED".asInstanceOf[MacieStatus]

  @inline def values: js.Array[MacieStatus] = js.Array(PAUSED, ENABLED)
}

@js.native
sealed trait OrderBy extends js.Any
object OrderBy {
  val ASC = "ASC".asInstanceOf[OrderBy]
  val DESC = "DESC".asInstanceOf[OrderBy]

  @inline def values: js.Array[OrderBy] = js.Array(ASC, DESC)
}

/** The current status of the relationship between an account and an associated Amazon Macie administrator account (<i>inviter account</i>). Possible values are:
  */
@js.native
sealed trait RelationshipStatus extends js.Any
object RelationshipStatus {
  val Enabled = "Enabled".asInstanceOf[RelationshipStatus]
  val Paused = "Paused".asInstanceOf[RelationshipStatus]
  val Invited = "Invited".asInstanceOf[RelationshipStatus]
  val Created = "Created".asInstanceOf[RelationshipStatus]
  val Removed = "Removed".asInstanceOf[RelationshipStatus]
  val Resigned = "Resigned".asInstanceOf[RelationshipStatus]
  val EmailVerificationInProgress = "EmailVerificationInProgress".asInstanceOf[RelationshipStatus]
  val EmailVerificationFailed = "EmailVerificationFailed".asInstanceOf[RelationshipStatus]
  val RegionDisabled = "RegionDisabled".asInstanceOf[RelationshipStatus]
  val AccountSuspended = "AccountSuspended".asInstanceOf[RelationshipStatus]

  @inline def values: js.Array[RelationshipStatus] = js.Array(Enabled, Paused, Invited, Created, Removed, Resigned, EmailVerificationInProgress, EmailVerificationFailed, RegionDisabled, AccountSuspended)
}

/** The property to use in a condition that determines which objects are analyzed by a classification job. Valid values are:
  */
@js.native
sealed trait ScopeFilterKey extends js.Any
object ScopeFilterKey {
  val BUCKET_CREATION_DATE = "BUCKET_CREATION_DATE".asInstanceOf[ScopeFilterKey]
  val OBJECT_EXTENSION = "OBJECT_EXTENSION".asInstanceOf[ScopeFilterKey]
  val OBJECT_LAST_MODIFIED_DATE = "OBJECT_LAST_MODIFIED_DATE".asInstanceOf[ScopeFilterKey]
  val OBJECT_SIZE = "OBJECT_SIZE".asInstanceOf[ScopeFilterKey]
  val TAG = "TAG".asInstanceOf[ScopeFilterKey]
  val OBJECT_KEY = "OBJECT_KEY".asInstanceOf[ScopeFilterKey]

  @inline def values: js.Array[ScopeFilterKey] = js.Array(BUCKET_CREATION_DATE, OBJECT_EXTENSION, OBJECT_LAST_MODIFIED_DATE, OBJECT_SIZE, TAG, OBJECT_KEY)
}

/** The category of sensitive data that was detected and produced the finding. Possible values are:
  */
@js.native
sealed trait SensitiveDataItemCategory extends js.Any
object SensitiveDataItemCategory {
  val FINANCIAL_INFORMATION = "FINANCIAL_INFORMATION".asInstanceOf[SensitiveDataItemCategory]
  val PERSONAL_INFORMATION = "PERSONAL_INFORMATION".asInstanceOf[SensitiveDataItemCategory]
  val CREDENTIALS = "CREDENTIALS".asInstanceOf[SensitiveDataItemCategory]
  val CUSTOM_IDENTIFIER = "CUSTOM_IDENTIFIER".asInstanceOf[SensitiveDataItemCategory]

  @inline def values: js.Array[SensitiveDataItemCategory] = js.Array(FINANCIAL_INFORMATION, PERSONAL_INFORMATION, CREDENTIALS, CUSTOM_IDENTIFIER)
}

/** The qualitative representation of the finding's severity. Possible values are:
  */
@js.native
sealed trait SeverityDescription extends js.Any
object SeverityDescription {
  val Low = "Low".asInstanceOf[SeverityDescription]
  val Medium = "Medium".asInstanceOf[SeverityDescription]
  val High = "High".asInstanceOf[SeverityDescription]

  @inline def values: js.Array[SeverityDescription] = js.Array(Low, Medium, High)
}

@js.native
sealed trait SharedAccess extends js.Any
object SharedAccess {
  val EXTERNAL = "EXTERNAL".asInstanceOf[SharedAccess]
  val INTERNAL = "INTERNAL".asInstanceOf[SharedAccess]
  val NOT_SHARED = "NOT_SHARED".asInstanceOf[SharedAccess]
  val UNKNOWN = "UNKNOWN".asInstanceOf[SharedAccess]

  @inline def values: js.Array[SharedAccess] = js.Array(EXTERNAL, INTERNAL, NOT_SHARED, UNKNOWN)
}

/** The storage class of the S3 object. Possible values are:
  */
@js.native
sealed trait StorageClass extends js.Any
object StorageClass {
  val STANDARD = "STANDARD".asInstanceOf[StorageClass]
  val REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY".asInstanceOf[StorageClass]
  val STANDARD_IA = "STANDARD_IA".asInstanceOf[StorageClass]
  val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[StorageClass]
  val DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[StorageClass]
  val ONEZONE_IA = "ONEZONE_IA".asInstanceOf[StorageClass]
  val GLACIER = "GLACIER".asInstanceOf[StorageClass]

  @inline def values: js.Array[StorageClass] = js.Array(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE, ONEZONE_IA, GLACIER)
}

/** The type of object to apply a tag-based condition to. Valid values are:
  */
@js.native
sealed trait TagTarget extends js.Any
object TagTarget {
  val S3_OBJECT = "S3_OBJECT".asInstanceOf[TagTarget]

  @inline def values: js.Array[TagTarget] = js.Array(S3_OBJECT)
}

/** An inclusive time period that Amazon Macie usage data applies to. Possible values are:
  */
@js.native
sealed trait TimeRange extends js.Any
object TimeRange {
  val MONTH_TO_DATE = "MONTH_TO_DATE".asInstanceOf[TimeRange]
  val PAST_30_DAYS = "PAST_30_DAYS".asInstanceOf[TimeRange]

  @inline def values: js.Array[TimeRange] = js.Array(MONTH_TO_DATE, PAST_30_DAYS)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val NONE = "NONE".asInstanceOf[Type]
  val AES256 = "AES256".asInstanceOf[Type]
  val `aws:kms` = "aws:kms".asInstanceOf[Type]

  @inline def values: js.Array[Type] = js.Array(NONE, AES256, `aws:kms`)
}

@js.native
sealed trait Unit extends js.Any
object Unit {
  val TERABYTES = "TERABYTES".asInstanceOf[Unit]

  @inline def values: js.Array[Unit] = js.Array(TERABYTES)
}

/** The operator to use in a condition that filters the results of a query for Amazon Macie account quotas and usage data. Valid values are:
  */
@js.native
sealed trait UsageStatisticsFilterComparator extends js.Any
object UsageStatisticsFilterComparator {
  val GT = "GT".asInstanceOf[UsageStatisticsFilterComparator]
  val GTE = "GTE".asInstanceOf[UsageStatisticsFilterComparator]
  val LT = "LT".asInstanceOf[UsageStatisticsFilterComparator]
  val LTE = "LTE".asInstanceOf[UsageStatisticsFilterComparator]
  val EQ = "EQ".asInstanceOf[UsageStatisticsFilterComparator]
  val NE = "NE".asInstanceOf[UsageStatisticsFilterComparator]
  val CONTAINS = "CONTAINS".asInstanceOf[UsageStatisticsFilterComparator]

  @inline def values: js.Array[UsageStatisticsFilterComparator] = js.Array(GT, GTE, LT, LTE, EQ, NE, CONTAINS)
}

/** The field to use in a condition that filters the results of a query for Amazon Macie account quotas and usage data. Valid values are:
  */
@js.native
sealed trait UsageStatisticsFilterKey extends js.Any
object UsageStatisticsFilterKey {
  val accountId = "accountId".asInstanceOf[UsageStatisticsFilterKey]
  val serviceLimit = "serviceLimit".asInstanceOf[UsageStatisticsFilterKey]
  val freeTrialStartDate = "freeTrialStartDate".asInstanceOf[UsageStatisticsFilterKey]
  val total = "total".asInstanceOf[UsageStatisticsFilterKey]

  @inline def values: js.Array[UsageStatisticsFilterKey] = js.Array(accountId, serviceLimit, freeTrialStartDate, total)
}

/** The field to use to sort the results of a query for Amazon Macie account quotas and usage data. Valid values are:
  */
@js.native
sealed trait UsageStatisticsSortKey extends js.Any
object UsageStatisticsSortKey {
  val accountId = "accountId".asInstanceOf[UsageStatisticsSortKey]
  val total = "total".asInstanceOf[UsageStatisticsSortKey]
  val serviceLimitValue = "serviceLimitValue".asInstanceOf[UsageStatisticsSortKey]
  val freeTrialStartDate = "freeTrialStartDate".asInstanceOf[UsageStatisticsSortKey]

  @inline def values: js.Array[UsageStatisticsSortKey] = js.Array(accountId, total, serviceLimitValue, freeTrialStartDate)
}

/** The name of an Amazon Macie usage metric for an account. Possible values are:
  */
@js.native
sealed trait UsageType extends js.Any
object UsageType {
  val DATA_INVENTORY_EVALUATION = "DATA_INVENTORY_EVALUATION".asInstanceOf[UsageType]
  val SENSITIVE_DATA_DISCOVERY = "SENSITIVE_DATA_DISCOVERY".asInstanceOf[UsageType]

  @inline def values: js.Array[UsageType] = js.Array(DATA_INVENTORY_EVALUATION, SENSITIVE_DATA_DISCOVERY)
}

/** The type of entity that performed the action on the affected resource. Possible values are:
  */
@js.native
sealed trait UserIdentityType extends js.Any
object UserIdentityType {
  val AssumedRole = "AssumedRole".asInstanceOf[UserIdentityType]
  val IAMUser = "IAMUser".asInstanceOf[UserIdentityType]
  val FederatedUser = "FederatedUser".asInstanceOf[UserIdentityType]
  val Root = "Root".asInstanceOf[UserIdentityType]
  val AWSAccount = "AWSAccount".asInstanceOf[UserIdentityType]
  val AWSService = "AWSService".asInstanceOf[UserIdentityType]

  @inline def values: js.Array[UserIdentityType] = js.Array(AssumedRole, IAMUser, FederatedUser, Root, AWSAccount, AWSService)
}
