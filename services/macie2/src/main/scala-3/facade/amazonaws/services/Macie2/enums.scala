package facade.amazonaws.services.macie2

import scalajs._

/** The current status of an account as the delegated Amazon Macie administrator account for an AWS organization. Possible values are:
  */
type AdminStatus = "ENABLED" | "DISABLING_IN_PROGRESS"
object AdminStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLING_IN_PROGRESS: "DISABLING_IN_PROGRESS" = "DISABLING_IN_PROGRESS"

  @inline def values = js.Array[AdminStatus](ENABLED, DISABLING_IN_PROGRESS)
}

/** The type of currency that the data for an Amazon Macie usage metric is reported in. Possible values are:
  */
type Currency = "USD"
object Currency {
  val USD: "USD" = "USD"

  @inline def values = js.Array[Currency](USD)
}

type DayOfWeek = "SUNDAY" | "MONDAY" | "TUESDAY" | "WEDNESDAY" | "THURSDAY" | "FRIDAY" | "SATURDAY"
object DayOfWeek {
  val SUNDAY: "SUNDAY" = "SUNDAY"
  val MONDAY: "MONDAY" = "MONDAY"
  val TUESDAY: "TUESDAY" = "TUESDAY"
  val WEDNESDAY: "WEDNESDAY" = "WEDNESDAY"
  val THURSDAY: "THURSDAY" = "THURSDAY"
  val FRIDAY: "FRIDAY" = "FRIDAY"
  val SATURDAY: "SATURDAY" = "SATURDAY"

  @inline def values = js.Array[DayOfWeek](SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY)
}

type EffectivePermission = "PUBLIC" | "NOT_PUBLIC" | "UNKNOWN"
object EffectivePermission {
  val PUBLIC: "PUBLIC" = "PUBLIC"
  val NOT_PUBLIC: "NOT_PUBLIC" = "NOT_PUBLIC"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[EffectivePermission](PUBLIC, NOT_PUBLIC, UNKNOWN)
}

/** The type of server-side encryption that's used to encrypt an S3 object or objects in an S3 bucket. Valid values are:
  */
type EncryptionType = "NONE" | "AES256" | "aws:kms" | "UNKNOWN"
object EncryptionType {
  val NONE: "NONE" = "NONE"
  val AES256: "AES256" = "AES256"
  val `aws:kms`: "aws:kms" = "aws:kms"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[EncryptionType](NONE, AES256, `aws:kms`, UNKNOWN)
}

/** The source of an issue or delay. Possible values are:
  */
type ErrorCode = "ClientError" | "InternalError"
object ErrorCode {
  val ClientError: "ClientError" = "ClientError"
  val InternalError: "InternalError" = "InternalError"

  @inline def values = js.Array[ErrorCode](ClientError, InternalError)
}

/** The type of action that occurred for the resource and produced the policy finding:
  */
type FindingActionType = "AWS_API_CALL"
object FindingActionType {
  val AWS_API_CALL: "AWS_API_CALL" = "AWS_API_CALL"

  @inline def values = js.Array[FindingActionType](AWS_API_CALL)
}

/** The category of the finding. Valid values are:
  */
type FindingCategory = "CLASSIFICATION" | "POLICY"
object FindingCategory {
  val CLASSIFICATION: "CLASSIFICATION" = "CLASSIFICATION"
  val POLICY: "POLICY" = "POLICY"

  @inline def values = js.Array[FindingCategory](CLASSIFICATION, POLICY)
}

/** The frequency with which Amazon Macie publishes updates to policy findings for an account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events). For more information, see [[https://docs.aws.amazon.com/macie/latest/user/findings-monitor.html|Monitoring and processing findings]] in the <i>Amazon Macie User Guide</i>. Valid values are:
  */
type FindingPublishingFrequency = "FIFTEEN_MINUTES" | "ONE_HOUR" | "SIX_HOURS"
object FindingPublishingFrequency {
  val FIFTEEN_MINUTES: "FIFTEEN_MINUTES" = "FIFTEEN_MINUTES"
  val ONE_HOUR: "ONE_HOUR" = "ONE_HOUR"
  val SIX_HOURS: "SIX_HOURS" = "SIX_HOURS"

  @inline def values = js.Array[FindingPublishingFrequency](FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS)
}

/** The grouping to sort the results by. Valid values are:
  */
type FindingStatisticsSortAttributeName = "groupKey" | "count"
object FindingStatisticsSortAttributeName {
  val groupKey: "groupKey" = "groupKey"
  val count: "count" = "count"

  @inline def values = js.Array[FindingStatisticsSortAttributeName](groupKey, count)
}

/** The type of finding. For details about each type, see [[https://docs.aws.amazon.com/macie/latest/user/findings-types.html|Types of Amazon Macie findings]] in the <i>Amazon Macie User Guide</i>. Valid values are:
  */
type FindingType = "SensitiveData:S3Object/Multiple" | "SensitiveData:S3Object/Financial" | "SensitiveData:S3Object/Personal" | "SensitiveData:S3Object/Credentials" | "SensitiveData:S3Object/CustomIdentifier" | "Policy:IAMUser/S3BucketPublic" | "Policy:IAMUser/S3BucketSharedExternally" | "Policy:IAMUser/S3BucketReplicatedExternally" | "Policy:IAMUser/S3BucketEncryptionDisabled" | "Policy:IAMUser/S3BlockPublicAccessDisabled"
object FindingType {
  val `SensitiveData:S3Object/Multiple`: "SensitiveData:S3Object/Multiple" = "SensitiveData:S3Object/Multiple"
  val `SensitiveData:S3Object/Financial`: "SensitiveData:S3Object/Financial" = "SensitiveData:S3Object/Financial"
  val `SensitiveData:S3Object/Personal`: "SensitiveData:S3Object/Personal" = "SensitiveData:S3Object/Personal"
  val `SensitiveData:S3Object/Credentials`: "SensitiveData:S3Object/Credentials" = "SensitiveData:S3Object/Credentials"
  val `SensitiveData:S3Object/CustomIdentifier`: "SensitiveData:S3Object/CustomIdentifier" = "SensitiveData:S3Object/CustomIdentifier"
  val `Policy:IAMUser/S3BucketPublic`: "Policy:IAMUser/S3BucketPublic" = "Policy:IAMUser/S3BucketPublic"
  val `Policy:IAMUser/S3BucketSharedExternally`: "Policy:IAMUser/S3BucketSharedExternally" = "Policy:IAMUser/S3BucketSharedExternally"
  val `Policy:IAMUser/S3BucketReplicatedExternally`: "Policy:IAMUser/S3BucketReplicatedExternally" = "Policy:IAMUser/S3BucketReplicatedExternally"
  val `Policy:IAMUser/S3BucketEncryptionDisabled`: "Policy:IAMUser/S3BucketEncryptionDisabled" = "Policy:IAMUser/S3BucketEncryptionDisabled"
  val `Policy:IAMUser/S3BlockPublicAccessDisabled`: "Policy:IAMUser/S3BlockPublicAccessDisabled" = "Policy:IAMUser/S3BlockPublicAccessDisabled"

  @inline def values = js.Array[FindingType](
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
type FindingsFilterAction = "ARCHIVE" | "NOOP"
object FindingsFilterAction {
  val ARCHIVE: "ARCHIVE" = "ARCHIVE"
  val NOOP: "NOOP" = "NOOP"

  @inline def values = js.Array[FindingsFilterAction](ARCHIVE, NOOP)
}

type GroupBy = "resourcesAffected.s3Bucket.name" | "type" | "classificationDetails.jobId" | "severity.description"
object GroupBy {
  val `resourcesAffected.s3Bucket.name`: "resourcesAffected.s3Bucket.name" = "resourcesAffected.s3Bucket.name"
  val `type`: "type" = "type"
  val `classificationDetails.jobId`: "classificationDetails.jobId" = "classificationDetails.jobId"
  val `severity.description`: "severity.description" = "severity.description"

  @inline def values = js.Array[GroupBy](`resourcesAffected.s3Bucket.name`, `type`, `classificationDetails.jobId`, `severity.description`)
}

type IsDefinedInJob = "TRUE" | "FALSE" | "UNKNOWN"
object IsDefinedInJob {
  val TRUE: "TRUE" = "TRUE"
  val FALSE: "FALSE" = "FALSE"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[IsDefinedInJob](TRUE, FALSE, UNKNOWN)
}

type IsMonitoredByJob = "TRUE" | "FALSE" | "UNKNOWN"
object IsMonitoredByJob {
  val TRUE: "TRUE" = "TRUE"
  val FALSE: "FALSE" = "FALSE"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[IsMonitoredByJob](TRUE, FALSE, UNKNOWN)
}

/** The operator to use in a condition. Valid values are:
  */
type JobComparator = "EQ" | "GT" | "GTE" | "LT" | "LTE" | "NE" | "CONTAINS" | "STARTS_WITH"
object JobComparator {
  val EQ: "EQ" = "EQ"
  val GT: "GT" = "GT"
  val GTE: "GTE" = "GTE"
  val LT: "LT" = "LT"
  val LTE: "LTE" = "LTE"
  val NE: "NE" = "NE"
  val CONTAINS: "CONTAINS" = "CONTAINS"
  val STARTS_WITH: "STARTS_WITH" = "STARTS_WITH"

  @inline def values = js.Array[JobComparator](EQ, GT, GTE, LT, LTE, NE, CONTAINS, STARTS_WITH)
}

/** The status of a classification job. Possible values are:
  */
type JobStatus = "RUNNING" | "PAUSED" | "CANCELLED" | "COMPLETE" | "IDLE" | "USER_PAUSED"
object JobStatus {
  val RUNNING: "RUNNING" = "RUNNING"
  val PAUSED: "PAUSED" = "PAUSED"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val IDLE: "IDLE" = "IDLE"
  val USER_PAUSED: "USER_PAUSED" = "USER_PAUSED"

  @inline def values = js.Array[JobStatus](RUNNING, PAUSED, CANCELLED, COMPLETE, IDLE, USER_PAUSED)
}

/** The schedule for running a classification job. Valid values are:
  */
type JobType = "ONE_TIME" | "SCHEDULED"
object JobType {
  val ONE_TIME: "ONE_TIME" = "ONE_TIME"
  val SCHEDULED: "SCHEDULED" = "SCHEDULED"

  @inline def values = js.Array[JobType](ONE_TIME, SCHEDULED)
}

/** Specifies whether any account- or bucket-level access errors occurred during the run of a one-time classification job or the most recent run of a recurring classification job. Possible values are:
  */
type LastRunErrorStatusCode = "NONE" | "ERROR"
object LastRunErrorStatusCode {
  val NONE: "NONE" = "NONE"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[LastRunErrorStatusCode](NONE, ERROR)
}

/** The property to use to filter the results. Valid values are:
  */
type ListJobsFilterKey = "jobType" | "jobStatus" | "createdAt" | "name"
object ListJobsFilterKey {
  val jobType: "jobType" = "jobType"
  val jobStatus: "jobStatus" = "jobStatus"
  val createdAt: "createdAt" = "createdAt"
  val name: "name" = "name"

  @inline def values = js.Array[ListJobsFilterKey](jobType, jobStatus, createdAt, name)
}

/** The property to sort the results by. Valid values are:
  */
type ListJobsSortAttributeName = "createdAt" | "jobStatus" | "name" | "jobType"
object ListJobsSortAttributeName {
  val createdAt: "createdAt" = "createdAt"
  val jobStatus: "jobStatus" = "jobStatus"
  val name: "name" = "name"
  val jobType: "jobType" = "jobType"

  @inline def values = js.Array[ListJobsSortAttributeName](createdAt, jobStatus, name, jobType)
}

/** The status of an Amazon Macie account. Valid values are:
  */
type MacieStatus = "PAUSED" | "ENABLED"
object MacieStatus {
  val PAUSED: "PAUSED" = "PAUSED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[MacieStatus](PAUSED, ENABLED)
}

type OrderBy = "ASC" | "DESC"
object OrderBy {
  val ASC: "ASC" = "ASC"
  val DESC: "DESC" = "DESC"

  @inline def values = js.Array[OrderBy](ASC, DESC)
}

/** The current status of the relationship between an account and an associated Amazon Macie administrator account (<i>inviter account</i>). Possible values are:
  */
type RelationshipStatus = "Enabled" | "Paused" | "Invited" | "Created" | "Removed" | "Resigned" | "EmailVerificationInProgress" | "EmailVerificationFailed" | "RegionDisabled" | "AccountSuspended"
object RelationshipStatus {
  val Enabled: "Enabled" = "Enabled"
  val Paused: "Paused" = "Paused"
  val Invited: "Invited" = "Invited"
  val Created: "Created" = "Created"
  val Removed: "Removed" = "Removed"
  val Resigned: "Resigned" = "Resigned"
  val EmailVerificationInProgress: "EmailVerificationInProgress" = "EmailVerificationInProgress"
  val EmailVerificationFailed: "EmailVerificationFailed" = "EmailVerificationFailed"
  val RegionDisabled: "RegionDisabled" = "RegionDisabled"
  val AccountSuspended: "AccountSuspended" = "AccountSuspended"

  @inline def values = js.Array[RelationshipStatus](Enabled, Paused, Invited, Created, Removed, Resigned, EmailVerificationInProgress, EmailVerificationFailed, RegionDisabled, AccountSuspended)
}

/** The property to use in a condition that determines which objects are analyzed by a classification job. Valid values are:
  */
type ScopeFilterKey = "BUCKET_CREATION_DATE" | "OBJECT_EXTENSION" | "OBJECT_LAST_MODIFIED_DATE" | "OBJECT_SIZE" | "TAG" | "OBJECT_KEY"
object ScopeFilterKey {
  val BUCKET_CREATION_DATE: "BUCKET_CREATION_DATE" = "BUCKET_CREATION_DATE"
  val OBJECT_EXTENSION: "OBJECT_EXTENSION" = "OBJECT_EXTENSION"
  val OBJECT_LAST_MODIFIED_DATE: "OBJECT_LAST_MODIFIED_DATE" = "OBJECT_LAST_MODIFIED_DATE"
  val OBJECT_SIZE: "OBJECT_SIZE" = "OBJECT_SIZE"
  val TAG: "TAG" = "TAG"
  val OBJECT_KEY: "OBJECT_KEY" = "OBJECT_KEY"

  @inline def values = js.Array[ScopeFilterKey](BUCKET_CREATION_DATE, OBJECT_EXTENSION, OBJECT_LAST_MODIFIED_DATE, OBJECT_SIZE, TAG, OBJECT_KEY)
}

/** The category of sensitive data that was detected and produced the finding. Possible values are:
  */
type SensitiveDataItemCategory = "FINANCIAL_INFORMATION" | "PERSONAL_INFORMATION" | "CREDENTIALS" | "CUSTOM_IDENTIFIER"
object SensitiveDataItemCategory {
  val FINANCIAL_INFORMATION: "FINANCIAL_INFORMATION" = "FINANCIAL_INFORMATION"
  val PERSONAL_INFORMATION: "PERSONAL_INFORMATION" = "PERSONAL_INFORMATION"
  val CREDENTIALS: "CREDENTIALS" = "CREDENTIALS"
  val CUSTOM_IDENTIFIER: "CUSTOM_IDENTIFIER" = "CUSTOM_IDENTIFIER"

  @inline def values = js.Array[SensitiveDataItemCategory](FINANCIAL_INFORMATION, PERSONAL_INFORMATION, CREDENTIALS, CUSTOM_IDENTIFIER)
}

/** The qualitative representation of the finding's severity. Possible values are:
  */
type SeverityDescription = "Low" | "Medium" | "High"
object SeverityDescription {
  val Low: "Low" = "Low"
  val Medium: "Medium" = "Medium"
  val High: "High" = "High"

  @inline def values = js.Array[SeverityDescription](Low, Medium, High)
}

type SharedAccess = "EXTERNAL" | "INTERNAL" | "NOT_SHARED" | "UNKNOWN"
object SharedAccess {
  val EXTERNAL: "EXTERNAL" = "EXTERNAL"
  val INTERNAL: "INTERNAL" = "INTERNAL"
  val NOT_SHARED: "NOT_SHARED" = "NOT_SHARED"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[SharedAccess](EXTERNAL, INTERNAL, NOT_SHARED, UNKNOWN)
}

/** The storage class of the S3 object. Possible values are:
  */
type StorageClass = "STANDARD" | "REDUCED_REDUNDANCY" | "STANDARD_IA" | "INTELLIGENT_TIERING" | "DEEP_ARCHIVE" | "ONEZONE_IA" | "GLACIER"
object StorageClass {
  val STANDARD: "STANDARD" = "STANDARD"
  val REDUCED_REDUNDANCY: "REDUCED_REDUNDANCY" = "REDUCED_REDUNDANCY"
  val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"
  val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  val GLACIER: "GLACIER" = "GLACIER"

  @inline def values = js.Array[StorageClass](STANDARD, REDUCED_REDUNDANCY, STANDARD_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE, ONEZONE_IA, GLACIER)
}

/** The type of object to apply a tag-based condition to. Valid values are:
  */
type TagTarget = "S3_OBJECT"
object TagTarget {
  val S3_OBJECT: "S3_OBJECT" = "S3_OBJECT"

  @inline def values = js.Array[TagTarget](S3_OBJECT)
}

/** An inclusive time period that Amazon Macie usage data applies to. Possible values are:
  */
type TimeRange = "MONTH_TO_DATE" | "PAST_30_DAYS"
object TimeRange {
  val MONTH_TO_DATE: "MONTH_TO_DATE" = "MONTH_TO_DATE"
  val PAST_30_DAYS: "PAST_30_DAYS" = "PAST_30_DAYS"

  @inline def values = js.Array[TimeRange](MONTH_TO_DATE, PAST_30_DAYS)
}

type Type = "NONE" | "AES256" | "aws:kms"
object Type {
  val NONE: "NONE" = "NONE"
  val AES256: "AES256" = "AES256"
  val `aws:kms`: "aws:kms" = "aws:kms"

  @inline def values = js.Array[Type](NONE, AES256, `aws:kms`)
}

type Unit = "TERABYTES"
object Unit {
  val TERABYTES: "TERABYTES" = "TERABYTES"

  @inline def values = js.Array[Unit](TERABYTES)
}

/** The operator to use in a condition that filters the results of a query for Amazon Macie account quotas and usage data. Valid values are:
  */
type UsageStatisticsFilterComparator = "GT" | "GTE" | "LT" | "LTE" | "EQ" | "NE" | "CONTAINS"
object UsageStatisticsFilterComparator {
  val GT: "GT" = "GT"
  val GTE: "GTE" = "GTE"
  val LT: "LT" = "LT"
  val LTE: "LTE" = "LTE"
  val EQ: "EQ" = "EQ"
  val NE: "NE" = "NE"
  val CONTAINS: "CONTAINS" = "CONTAINS"

  @inline def values = js.Array[UsageStatisticsFilterComparator](GT, GTE, LT, LTE, EQ, NE, CONTAINS)
}

/** The field to use in a condition that filters the results of a query for Amazon Macie account quotas and usage data. Valid values are:
  */
type UsageStatisticsFilterKey = "accountId" | "serviceLimit" | "freeTrialStartDate" | "total"
object UsageStatisticsFilterKey {
  val accountId: "accountId" = "accountId"
  val serviceLimit: "serviceLimit" = "serviceLimit"
  val freeTrialStartDate: "freeTrialStartDate" = "freeTrialStartDate"
  val total: "total" = "total"

  @inline def values = js.Array[UsageStatisticsFilterKey](accountId, serviceLimit, freeTrialStartDate, total)
}

/** The field to use to sort the results of a query for Amazon Macie account quotas and usage data. Valid values are:
  */
type UsageStatisticsSortKey = "accountId" | "total" | "serviceLimitValue" | "freeTrialStartDate"
object UsageStatisticsSortKey {
  val accountId: "accountId" = "accountId"
  val total: "total" = "total"
  val serviceLimitValue: "serviceLimitValue" = "serviceLimitValue"
  val freeTrialStartDate: "freeTrialStartDate" = "freeTrialStartDate"

  @inline def values = js.Array[UsageStatisticsSortKey](accountId, total, serviceLimitValue, freeTrialStartDate)
}

/** The name of an Amazon Macie usage metric for an account. Possible values are:
  */
type UsageType = "DATA_INVENTORY_EVALUATION" | "SENSITIVE_DATA_DISCOVERY"
object UsageType {
  val DATA_INVENTORY_EVALUATION: "DATA_INVENTORY_EVALUATION" = "DATA_INVENTORY_EVALUATION"
  val SENSITIVE_DATA_DISCOVERY: "SENSITIVE_DATA_DISCOVERY" = "SENSITIVE_DATA_DISCOVERY"

  @inline def values = js.Array[UsageType](DATA_INVENTORY_EVALUATION, SENSITIVE_DATA_DISCOVERY)
}

/** The type of entity that performed the action on the affected resource. Possible values are:
  */
type UserIdentityType = "AssumedRole" | "IAMUser" | "FederatedUser" | "Root" | "AWSAccount" | "AWSService"
object UserIdentityType {
  val AssumedRole: "AssumedRole" = "AssumedRole"
  val IAMUser: "IAMUser" = "IAMUser"
  val FederatedUser: "FederatedUser" = "FederatedUser"
  val Root: "Root" = "Root"
  val AWSAccount: "AWSAccount" = "AWSAccount"
  val AWSService: "AWSService" = "AWSService"

  @inline def values = js.Array[UserIdentityType](AssumedRole, IAMUser, FederatedUser, Root, AWSAccount, AWSService)
}
