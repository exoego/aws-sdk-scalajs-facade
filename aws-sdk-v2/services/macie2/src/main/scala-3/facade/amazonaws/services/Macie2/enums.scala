package facade.amazonaws.services.macie2

import scalajs.js

/** The current status of an account as the delegated Amazon Macie administrator account for an organization in Organizations. Possible values are:
  */
type AdminStatus = "ENABLED" | "DISABLING_IN_PROGRESS"
object AdminStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLING_IN_PROGRESS: "DISABLING_IN_PROGRESS" = "DISABLING_IN_PROGRESS"

  inline def values: js.Array[AdminStatus] = js.Array(ENABLED, DISABLING_IN_PROGRESS)
}

/** Indicates the current status of an allow list. Depending on the type of criteria that the list specifies, possible values are:
  */
type AllowListStatusCode = "OK" | "S3_OBJECT_NOT_FOUND" | "S3_USER_ACCESS_DENIED" | "S3_OBJECT_ACCESS_DENIED" | "S3_THROTTLED" | "S3_OBJECT_OVERSIZE" | "S3_OBJECT_EMPTY" | "UNKNOWN_ERROR"
object AllowListStatusCode {
  inline val OK: "OK" = "OK"
  inline val S3_OBJECT_NOT_FOUND: "S3_OBJECT_NOT_FOUND" = "S3_OBJECT_NOT_FOUND"
  inline val S3_USER_ACCESS_DENIED: "S3_USER_ACCESS_DENIED" = "S3_USER_ACCESS_DENIED"
  inline val S3_OBJECT_ACCESS_DENIED: "S3_OBJECT_ACCESS_DENIED" = "S3_OBJECT_ACCESS_DENIED"
  inline val S3_THROTTLED: "S3_THROTTLED" = "S3_THROTTLED"
  inline val S3_OBJECT_OVERSIZE: "S3_OBJECT_OVERSIZE" = "S3_OBJECT_OVERSIZE"
  inline val S3_OBJECT_EMPTY: "S3_OBJECT_EMPTY" = "S3_OBJECT_EMPTY"
  inline val UNKNOWN_ERROR: "UNKNOWN_ERROR" = "UNKNOWN_ERROR"

  inline def values: js.Array[AllowListStatusCode] = js.Array(OK, S3_OBJECT_NOT_FOUND, S3_USER_ACCESS_DENIED, S3_OBJECT_ACCESS_DENIED, S3_THROTTLED, S3_OBJECT_OVERSIZE, S3_OBJECT_EMPTY, UNKNOWN_ERROR)
}

type AllowsUnencryptedObjectUploads = "TRUE" | "FALSE" | "UNKNOWN"
object AllowsUnencryptedObjectUploads {
  inline val TRUE: "TRUE" = "TRUE"
  inline val FALSE: "FALSE" = "FALSE"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[AllowsUnencryptedObjectUploads] = js.Array(TRUE, FALSE, UNKNOWN)
}

/** The status of the automated sensitive data discovery configuration for an Amazon Macie account. Valid values are:
  */
type AutomatedDiscoveryStatus = "ENABLED" | "DISABLED"
object AutomatedDiscoveryStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AutomatedDiscoveryStatus] = js.Array(ENABLED, DISABLED)
}

/** Specifies whether occurrences of sensitive data can be retrieved for a finding. Possible values are:
  */
type AvailabilityCode = "AVAILABLE" | "UNAVAILABLE"
object AvailabilityCode {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"

  inline def values: js.Array[AvailabilityCode] = js.Array(AVAILABLE, UNAVAILABLE)
}

/** The error code for an error that prevented Amazon Macie from retrieving and processing metadata from Amazon S3 for an S3 bucket and the bucket's objects.
  */
type BucketMetadataErrorCode = "ACCESS_DENIED"
object BucketMetadataErrorCode {
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"

  inline def values: js.Array[BucketMetadataErrorCode] = js.Array(ACCESS_DENIED)
}

/** Specifies how to apply changes to the S3 bucket exclusion list defined by the classification scope for an Amazon Macie account. Valid values are:
  */
type ClassificationScopeUpdateOperation = "ADD" | "REPLACE" | "REMOVE"
object ClassificationScopeUpdateOperation {
  inline val ADD: "ADD" = "ADD"
  inline val REPLACE: "REPLACE" = "REPLACE"
  inline val REMOVE: "REMOVE" = "REMOVE"

  inline def values: js.Array[ClassificationScopeUpdateOperation] = js.Array(ADD, REPLACE, REMOVE)
}

/** The type of currency that the data for an Amazon Macie usage metric is reported in. Possible values are:
  */
type Currency = "USD"
object Currency {
  inline val USD: "USD" = "USD"

  inline def values: js.Array[Currency] = js.Array(USD)
}

/** The severity of a finding, ranging from LOW, for least severe, to HIGH, for most severe. Valid values are:
  */
type DataIdentifierSeverity = "LOW" | "MEDIUM" | "HIGH"
object DataIdentifierSeverity {
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"

  inline def values: js.Array[DataIdentifierSeverity] = js.Array(LOW, MEDIUM, HIGH)
}

/** The type of data identifier that detected a specific type of sensitive data in an S3 bucket. Possible values are:
  */
type DataIdentifierType = "CUSTOM" | "MANAGED"
object DataIdentifierType {
  inline val CUSTOM: "CUSTOM" = "CUSTOM"
  inline val MANAGED: "MANAGED" = "MANAGED"

  inline def values: js.Array[DataIdentifierType] = js.Array(CUSTOM, MANAGED)
}

type DayOfWeek = "SUNDAY" | "MONDAY" | "TUESDAY" | "WEDNESDAY" | "THURSDAY" | "FRIDAY" | "SATURDAY"
object DayOfWeek {
  inline val SUNDAY: "SUNDAY" = "SUNDAY"
  inline val MONDAY: "MONDAY" = "MONDAY"
  inline val TUESDAY: "TUESDAY" = "TUESDAY"
  inline val WEDNESDAY: "WEDNESDAY" = "WEDNESDAY"
  inline val THURSDAY: "THURSDAY" = "THURSDAY"
  inline val FRIDAY: "FRIDAY" = "FRIDAY"
  inline val SATURDAY: "SATURDAY" = "SATURDAY"

  inline def values: js.Array[DayOfWeek] = js.Array(SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY)
}

type EffectivePermission = "PUBLIC" | "NOT_PUBLIC" | "UNKNOWN"
object EffectivePermission {
  inline val PUBLIC: "PUBLIC" = "PUBLIC"
  inline val NOT_PUBLIC: "NOT_PUBLIC" = "NOT_PUBLIC"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[EffectivePermission] = js.Array(PUBLIC, NOT_PUBLIC, UNKNOWN)
}

/** The type of server-side encryption that's used to encrypt an S3 object or objects in an S3 bucket. Possible values are:
  */
type EncryptionType = "NONE" | "AES256" | "aws:kms" | "UNKNOWN"
object EncryptionType {
  inline val NONE: "NONE" = "NONE"
  inline val AES256: "AES256" = "AES256"
  inline val `aws:kms`: "aws:kms" = "aws:kms"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[EncryptionType] = js.Array(NONE, AES256, `aws:kms`, UNKNOWN)
}

/** The source of an issue or delay. Possible values are:
  */
type ErrorCode = "ClientError" | "InternalError"
object ErrorCode {
  inline val ClientError: "ClientError" = "ClientError"
  inline val InternalError: "InternalError" = "InternalError"

  inline def values: js.Array[ErrorCode] = js.Array(ClientError, InternalError)
}

/** The type of action that occurred for the resource and produced the policy finding:
  */
type FindingActionType = "AWS_API_CALL"
object FindingActionType {
  inline val AWS_API_CALL: "AWS_API_CALL" = "AWS_API_CALL"

  inline def values: js.Array[FindingActionType] = js.Array(AWS_API_CALL)
}

/** The category of the finding. Possible values are:
  */
type FindingCategory = "CLASSIFICATION" | "POLICY"
object FindingCategory {
  inline val CLASSIFICATION: "CLASSIFICATION" = "CLASSIFICATION"
  inline val POLICY: "POLICY" = "POLICY"

  inline def values: js.Array[FindingCategory] = js.Array(CLASSIFICATION, POLICY)
}

/** The frequency with which Amazon Macie publishes updates to policy findings for an account. This includes publishing updates to Security Hub and Amazon EventBridge (formerly Amazon CloudWatch Events). For more information, see [[https://docs.aws.amazon.com/macie/latest/user/findings-monitor.html|Monitoring and processing findings]] in the <i>Amazon Macie User Guide</i>. Valid values are:
  */
type FindingPublishingFrequency = "FIFTEEN_MINUTES" | "ONE_HOUR" | "SIX_HOURS"
object FindingPublishingFrequency {
  inline val FIFTEEN_MINUTES: "FIFTEEN_MINUTES" = "FIFTEEN_MINUTES"
  inline val ONE_HOUR: "ONE_HOUR" = "ONE_HOUR"
  inline val SIX_HOURS: "SIX_HOURS" = "SIX_HOURS"

  inline def values: js.Array[FindingPublishingFrequency] = js.Array(FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS)
}

/** The grouping to sort the results by. Valid values are:
  */
type FindingStatisticsSortAttributeName = "groupKey" | "count"
object FindingStatisticsSortAttributeName {
  inline val groupKey: "groupKey" = "groupKey"
  inline val count: "count" = "count"

  inline def values: js.Array[FindingStatisticsSortAttributeName] = js.Array(groupKey, count)
}

/** The type of finding. For details about each type, see [[https://docs.aws.amazon.com/macie/latest/user/findings-types.html|Types of Amazon Macie findings]] in the <i>Amazon Macie User Guide</i>. Possible values are:
  */
type FindingType = "SensitiveData:S3Object/Multiple" | "SensitiveData:S3Object/Financial" | "SensitiveData:S3Object/Personal" | "SensitiveData:S3Object/Credentials" | "SensitiveData:S3Object/CustomIdentifier" | "Policy:IAMUser/S3BucketPublic" | "Policy:IAMUser/S3BucketSharedExternally" | "Policy:IAMUser/S3BucketReplicatedExternally" | "Policy:IAMUser/S3BucketEncryptionDisabled" | "Policy:IAMUser/S3BlockPublicAccessDisabled"
object FindingType {
  inline val `SensitiveData:S3Object/Multiple`: "SensitiveData:S3Object/Multiple" = "SensitiveData:S3Object/Multiple"
  inline val `SensitiveData:S3Object/Financial`: "SensitiveData:S3Object/Financial" = "SensitiveData:S3Object/Financial"
  inline val `SensitiveData:S3Object/Personal`: "SensitiveData:S3Object/Personal" = "SensitiveData:S3Object/Personal"
  inline val `SensitiveData:S3Object/Credentials`: "SensitiveData:S3Object/Credentials" = "SensitiveData:S3Object/Credentials"
  inline val `SensitiveData:S3Object/CustomIdentifier`: "SensitiveData:S3Object/CustomIdentifier" = "SensitiveData:S3Object/CustomIdentifier"
  inline val `Policy:IAMUser/S3BucketPublic`: "Policy:IAMUser/S3BucketPublic" = "Policy:IAMUser/S3BucketPublic"
  inline val `Policy:IAMUser/S3BucketSharedExternally`: "Policy:IAMUser/S3BucketSharedExternally" = "Policy:IAMUser/S3BucketSharedExternally"
  inline val `Policy:IAMUser/S3BucketReplicatedExternally`: "Policy:IAMUser/S3BucketReplicatedExternally" = "Policy:IAMUser/S3BucketReplicatedExternally"
  inline val `Policy:IAMUser/S3BucketEncryptionDisabled`: "Policy:IAMUser/S3BucketEncryptionDisabled" = "Policy:IAMUser/S3BucketEncryptionDisabled"
  inline val `Policy:IAMUser/S3BlockPublicAccessDisabled`: "Policy:IAMUser/S3BlockPublicAccessDisabled" = "Policy:IAMUser/S3BlockPublicAccessDisabled"

  inline def values: js.Array[FindingType] = js.Array(
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

/** The action to perform on findings that match the filter criteria. To suppress (automatically archive) findings that match the criteria, set this value to ARCHIVE. Valid values are:
  */
type FindingsFilterAction = "ARCHIVE" | "NOOP"
object FindingsFilterAction {
  inline val ARCHIVE: "ARCHIVE" = "ARCHIVE"
  inline val NOOP: "NOOP" = "NOOP"

  inline def values: js.Array[FindingsFilterAction] = js.Array(ARCHIVE, NOOP)
}

type GroupBy = "resourcesAffected.s3Bucket.name" | "type" | "classificationDetails.jobId" | "severity.description"
object GroupBy {
  inline val `resourcesAffected.s3Bucket.name`: "resourcesAffected.s3Bucket.name" = "resourcesAffected.s3Bucket.name"
  inline val `type`: "type" = "type"
  inline val `classificationDetails.jobId`: "classificationDetails.jobId" = "classificationDetails.jobId"
  inline val `severity.description`: "severity.description" = "severity.description"

  inline def values: js.Array[GroupBy] = js.Array(`resourcesAffected.s3Bucket.name`, `type`, `classificationDetails.jobId`, `severity.description`)
}

type IsDefinedInJob = "TRUE" | "FALSE" | "UNKNOWN"
object IsDefinedInJob {
  inline val TRUE: "TRUE" = "TRUE"
  inline val FALSE: "FALSE" = "FALSE"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[IsDefinedInJob] = js.Array(TRUE, FALSE, UNKNOWN)
}

type IsMonitoredByJob = "TRUE" | "FALSE" | "UNKNOWN"
object IsMonitoredByJob {
  inline val TRUE: "TRUE" = "TRUE"
  inline val FALSE: "FALSE" = "FALSE"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[IsMonitoredByJob] = js.Array(TRUE, FALSE, UNKNOWN)
}

/** The operator to use in a condition. Depending on the type of condition, possible values are:
  */
type JobComparator = "EQ" | "GT" | "GTE" | "LT" | "LTE" | "NE" | "CONTAINS" | "STARTS_WITH"
object JobComparator {
  inline val EQ: "EQ" = "EQ"
  inline val GT: "GT" = "GT"
  inline val GTE: "GTE" = "GTE"
  inline val LT: "LT" = "LT"
  inline val LTE: "LTE" = "LTE"
  inline val NE: "NE" = "NE"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"
  inline val STARTS_WITH: "STARTS_WITH" = "STARTS_WITH"

  inline def values: js.Array[JobComparator] = js.Array(EQ, GT, GTE, LT, LTE, NE, CONTAINS, STARTS_WITH)
}

/** The status of a classification job. Possible values are:
  */
type JobStatus = "RUNNING" | "PAUSED" | "CANCELLED" | "COMPLETE" | "IDLE" | "USER_PAUSED"
object JobStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val PAUSED: "PAUSED" = "PAUSED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val IDLE: "IDLE" = "IDLE"
  inline val USER_PAUSED: "USER_PAUSED" = "USER_PAUSED"

  inline def values: js.Array[JobStatus] = js.Array(RUNNING, PAUSED, CANCELLED, COMPLETE, IDLE, USER_PAUSED)
}

/** The schedule for running a classification job. Valid values are:
  */
type JobType = "ONE_TIME" | "SCHEDULED"
object JobType {
  inline val ONE_TIME: "ONE_TIME" = "ONE_TIME"
  inline val SCHEDULED: "SCHEDULED" = "SCHEDULED"

  inline def values: js.Array[JobType] = js.Array(ONE_TIME, SCHEDULED)
}

/** Specifies whether any account- or bucket-level access errors occurred during the run of a one-time classification job or the most recent run of a recurring classification job. Possible values are:
  */
type LastRunErrorStatusCode = "NONE" | "ERROR"
object LastRunErrorStatusCode {
  inline val NONE: "NONE" = "NONE"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[LastRunErrorStatusCode] = js.Array(NONE, ERROR)
}

/** The property to use to filter the results. Valid values are:
  */
type ListJobsFilterKey = "jobType" | "jobStatus" | "createdAt" | "name"
object ListJobsFilterKey {
  inline val jobType: "jobType" = "jobType"
  inline val jobStatus: "jobStatus" = "jobStatus"
  inline val createdAt: "createdAt" = "createdAt"
  inline val name: "name" = "name"

  inline def values: js.Array[ListJobsFilterKey] = js.Array(jobType, jobStatus, createdAt, name)
}

/** The property to sort the results by. Valid values are:
  */
type ListJobsSortAttributeName = "createdAt" | "jobStatus" | "name" | "jobType"
object ListJobsSortAttributeName {
  inline val createdAt: "createdAt" = "createdAt"
  inline val jobStatus: "jobStatus" = "jobStatus"
  inline val name: "name" = "name"
  inline val jobType: "jobType" = "jobType"

  inline def values: js.Array[ListJobsSortAttributeName] = js.Array(createdAt, jobStatus, name, jobType)
}

/** The status of an Amazon Macie account. Valid values are:
  */
type MacieStatus = "PAUSED" | "ENABLED"
object MacieStatus {
  inline val PAUSED: "PAUSED" = "PAUSED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[MacieStatus] = js.Array(PAUSED, ENABLED)
}

/** The selection type that determines which managed data identifiers a classification job uses to analyze data. Valid values are:
  */
type ManagedDataIdentifierSelector = "ALL" | "EXCLUDE" | "INCLUDE" | "NONE"
object ManagedDataIdentifierSelector {
  inline val ALL: "ALL" = "ALL"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ManagedDataIdentifierSelector] = js.Array(ALL, EXCLUDE, INCLUDE, NONE)
}

type OrderBy = "ASC" | "DESC"
object OrderBy {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[OrderBy] = js.Array(ASC, DESC)
}

/** Specifies how Amazon Macie found the sensitive data that produced a finding. Possible values are:
  */
type OriginType = "SENSITIVE_DATA_DISCOVERY_JOB" | "AUTOMATED_SENSITIVE_DATA_DISCOVERY"
object OriginType {
  inline val SENSITIVE_DATA_DISCOVERY_JOB: "SENSITIVE_DATA_DISCOVERY_JOB" = "SENSITIVE_DATA_DISCOVERY_JOB"
  inline val AUTOMATED_SENSITIVE_DATA_DISCOVERY: "AUTOMATED_SENSITIVE_DATA_DISCOVERY" = "AUTOMATED_SENSITIVE_DATA_DISCOVERY"

  inline def values: js.Array[OriginType] = js.Array(SENSITIVE_DATA_DISCOVERY_JOB, AUTOMATED_SENSITIVE_DATA_DISCOVERY)
}

/** The current status of the relationship between an account and an associated Amazon Macie administrator account. Possible values are:
  */
type RelationshipStatus = "Enabled" | "Paused" | "Invited" | "Created" | "Removed" | "Resigned" | "EmailVerificationInProgress" | "EmailVerificationFailed" | "RegionDisabled" | "AccountSuspended"
object RelationshipStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Paused: "Paused" = "Paused"
  inline val Invited: "Invited" = "Invited"
  inline val Created: "Created" = "Created"
  inline val Removed: "Removed" = "Removed"
  inline val Resigned: "Resigned" = "Resigned"
  inline val EmailVerificationInProgress: "EmailVerificationInProgress" = "EmailVerificationInProgress"
  inline val EmailVerificationFailed: "EmailVerificationFailed" = "EmailVerificationFailed"
  inline val RegionDisabled: "RegionDisabled" = "RegionDisabled"
  inline val AccountSuspended: "AccountSuspended" = "AccountSuspended"

  inline def values: js.Array[RelationshipStatus] = js.Array(Enabled, Paused, Invited, Created, Removed, Resigned, EmailVerificationInProgress, EmailVerificationFailed, RegionDisabled, AccountSuspended)
}

/** The status of a request to retrieve occurrences of sensitive data reported by a finding. Possible values are:
  */
type RevealRequestStatus = "SUCCESS" | "PROCESSING" | "ERROR"
object RevealRequestStatus {
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[RevealRequestStatus] = js.Array(SUCCESS, PROCESSING, ERROR)
}

/** The status of the configuration for retrieving occurrences of sensitive data reported by findings. Valid values are:
  */
type RevealStatus = "ENABLED" | "DISABLED"
object RevealStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[RevealStatus] = js.Array(ENABLED, DISABLED)
}

/** The property to use in a condition that determines whether an S3 object is included or excluded from a classification job. Valid values are:
  */
type ScopeFilterKey = "OBJECT_EXTENSION" | "OBJECT_LAST_MODIFIED_DATE" | "OBJECT_SIZE" | "OBJECT_KEY"
object ScopeFilterKey {
  inline val OBJECT_EXTENSION: "OBJECT_EXTENSION" = "OBJECT_EXTENSION"
  inline val OBJECT_LAST_MODIFIED_DATE: "OBJECT_LAST_MODIFIED_DATE" = "OBJECT_LAST_MODIFIED_DATE"
  inline val OBJECT_SIZE: "OBJECT_SIZE" = "OBJECT_SIZE"
  inline val OBJECT_KEY: "OBJECT_KEY" = "OBJECT_KEY"

  inline def values: js.Array[ScopeFilterKey] = js.Array(OBJECT_EXTENSION, OBJECT_LAST_MODIFIED_DATE, OBJECT_SIZE, OBJECT_KEY)
}

/** The operator to use in a condition that filters the results of a query. Valid values are:
  */
type SearchResourcesComparator = "EQ" | "NE"
object SearchResourcesComparator {
  inline val EQ: "EQ" = "EQ"
  inline val NE: "NE" = "NE"

  inline def values: js.Array[SearchResourcesComparator] = js.Array(EQ, NE)
}

/** The property to use in a condition that filters the query results. Valid values are:
  */
type SearchResourcesSimpleCriterionKey = "ACCOUNT_ID" | "S3_BUCKET_NAME" | "S3_BUCKET_EFFECTIVE_PERMISSION" | "S3_BUCKET_SHARED_ACCESS"
object SearchResourcesSimpleCriterionKey {
  inline val ACCOUNT_ID: "ACCOUNT_ID" = "ACCOUNT_ID"
  inline val S3_BUCKET_NAME: "S3_BUCKET_NAME" = "S3_BUCKET_NAME"
  inline val S3_BUCKET_EFFECTIVE_PERMISSION: "S3_BUCKET_EFFECTIVE_PERMISSION" = "S3_BUCKET_EFFECTIVE_PERMISSION"
  inline val S3_BUCKET_SHARED_ACCESS: "S3_BUCKET_SHARED_ACCESS" = "S3_BUCKET_SHARED_ACCESS"

  inline def values: js.Array[SearchResourcesSimpleCriterionKey] = js.Array(ACCOUNT_ID, S3_BUCKET_NAME, S3_BUCKET_EFFECTIVE_PERMISSION, S3_BUCKET_SHARED_ACCESS)
}

/** The property to sort the query results by. Valid values are:
  */
type SearchResourcesSortAttributeName = "ACCOUNT_ID" | "RESOURCE_NAME" | "S3_CLASSIFIABLE_OBJECT_COUNT" | "S3_CLASSIFIABLE_SIZE_IN_BYTES"
object SearchResourcesSortAttributeName {
  inline val ACCOUNT_ID: "ACCOUNT_ID" = "ACCOUNT_ID"
  inline val RESOURCE_NAME: "RESOURCE_NAME" = "RESOURCE_NAME"
  inline val S3_CLASSIFIABLE_OBJECT_COUNT: "S3_CLASSIFIABLE_OBJECT_COUNT" = "S3_CLASSIFIABLE_OBJECT_COUNT"
  inline val S3_CLASSIFIABLE_SIZE_IN_BYTES: "S3_CLASSIFIABLE_SIZE_IN_BYTES" = "S3_CLASSIFIABLE_SIZE_IN_BYTES"

  inline def values: js.Array[SearchResourcesSortAttributeName] = js.Array(ACCOUNT_ID, RESOURCE_NAME, S3_CLASSIFIABLE_OBJECT_COUNT, S3_CLASSIFIABLE_SIZE_IN_BYTES)
}

/** For a finding, the category of sensitive data that was detected and produced the finding. For a managed data identifier, the category of sensitive data that the managed data identifier detects. Possible values are:
  */
type SensitiveDataItemCategory = "FINANCIAL_INFORMATION" | "PERSONAL_INFORMATION" | "CREDENTIALS" | "CUSTOM_IDENTIFIER"
object SensitiveDataItemCategory {
  inline val FINANCIAL_INFORMATION: "FINANCIAL_INFORMATION" = "FINANCIAL_INFORMATION"
  inline val PERSONAL_INFORMATION: "PERSONAL_INFORMATION" = "PERSONAL_INFORMATION"
  inline val CREDENTIALS: "CREDENTIALS" = "CREDENTIALS"
  inline val CUSTOM_IDENTIFIER: "CUSTOM_IDENTIFIER" = "CUSTOM_IDENTIFIER"

  inline def values: js.Array[SensitiveDataItemCategory] = js.Array(FINANCIAL_INFORMATION, PERSONAL_INFORMATION, CREDENTIALS, CUSTOM_IDENTIFIER)
}

/** The qualitative representation of the finding's severity. Possible values are:
  */
type SeverityDescription = "Low" | "Medium" | "High"
object SeverityDescription {
  inline val Low: "Low" = "Low"
  inline val Medium: "Medium" = "Medium"
  inline val High: "High" = "High"

  inline def values: js.Array[SeverityDescription] = js.Array(Low, Medium, High)
}

type SharedAccess = "EXTERNAL" | "INTERNAL" | "NOT_SHARED" | "UNKNOWN"
object SharedAccess {
  inline val EXTERNAL: "EXTERNAL" = "EXTERNAL"
  inline val INTERNAL: "INTERNAL" = "INTERNAL"
  inline val NOT_SHARED: "NOT_SHARED" = "NOT_SHARED"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[SharedAccess] = js.Array(EXTERNAL, INTERNAL, NOT_SHARED, UNKNOWN)
}

/** The property to use in a condition that determines whether an S3 bucket is included or excluded from a classification job. Valid values are:
  */
type SimpleCriterionKeyForJob = "ACCOUNT_ID" | "S3_BUCKET_NAME" | "S3_BUCKET_EFFECTIVE_PERMISSION" | "S3_BUCKET_SHARED_ACCESS"
object SimpleCriterionKeyForJob {
  inline val ACCOUNT_ID: "ACCOUNT_ID" = "ACCOUNT_ID"
  inline val S3_BUCKET_NAME: "S3_BUCKET_NAME" = "S3_BUCKET_NAME"
  inline val S3_BUCKET_EFFECTIVE_PERMISSION: "S3_BUCKET_EFFECTIVE_PERMISSION" = "S3_BUCKET_EFFECTIVE_PERMISSION"
  inline val S3_BUCKET_SHARED_ACCESS: "S3_BUCKET_SHARED_ACCESS" = "S3_BUCKET_SHARED_ACCESS"

  inline def values: js.Array[SimpleCriterionKeyForJob] = js.Array(ACCOUNT_ID, S3_BUCKET_NAME, S3_BUCKET_EFFECTIVE_PERMISSION, S3_BUCKET_SHARED_ACCESS)
}

/** The storage class of the S3 object. Possible values are:
  */
type StorageClass = "STANDARD" | "REDUCED_REDUNDANCY" | "STANDARD_IA" | "INTELLIGENT_TIERING" | "DEEP_ARCHIVE" | "ONEZONE_IA" | "GLACIER"
object StorageClass {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val REDUCED_REDUNDANCY: "REDUCED_REDUNDANCY" = "REDUCED_REDUNDANCY"
  inline val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  inline val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  inline val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"
  inline val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  inline val GLACIER: "GLACIER" = "GLACIER"

  inline def values: js.Array[StorageClass] = js.Array(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE, ONEZONE_IA, GLACIER)
}

/** The type of object to apply a tag-based condition to. Valid values are:
  */
type TagTarget = "S3_OBJECT"
object TagTarget {
  inline val S3_OBJECT: "S3_OBJECT" = "S3_OBJECT"

  inline def values: js.Array[TagTarget] = js.Array(S3_OBJECT)
}

/** An inclusive time period that Amazon Macie usage data applies to. Possible values are:
  */
type TimeRange = "MONTH_TO_DATE" | "PAST_30_DAYS"
object TimeRange {
  inline val MONTH_TO_DATE: "MONTH_TO_DATE" = "MONTH_TO_DATE"
  inline val PAST_30_DAYS: "PAST_30_DAYS" = "PAST_30_DAYS"

  inline def values: js.Array[TimeRange] = js.Array(MONTH_TO_DATE, PAST_30_DAYS)
}

type Type = "NONE" | "AES256" | "aws:kms"
object Type {
  inline val NONE: "NONE" = "NONE"
  inline val AES256: "AES256" = "AES256"
  inline val `aws:kms`: "aws:kms" = "aws:kms"

  inline def values: js.Array[Type] = js.Array(NONE, AES256, `aws:kms`)
}

/** Specifies why occurrences of sensitive data can't be retrieved for a finding. Possible values are:
  */
type UnavailabilityReasonCode = "OBJECT_EXCEEDS_SIZE_QUOTA" | "UNSUPPORTED_OBJECT_TYPE" | "UNSUPPORTED_FINDING_TYPE" | "INVALID_CLASSIFICATION_RESULT" | "OBJECT_UNAVAILABLE"
object UnavailabilityReasonCode {
  inline val OBJECT_EXCEEDS_SIZE_QUOTA: "OBJECT_EXCEEDS_SIZE_QUOTA" = "OBJECT_EXCEEDS_SIZE_QUOTA"
  inline val UNSUPPORTED_OBJECT_TYPE: "UNSUPPORTED_OBJECT_TYPE" = "UNSUPPORTED_OBJECT_TYPE"
  inline val UNSUPPORTED_FINDING_TYPE: "UNSUPPORTED_FINDING_TYPE" = "UNSUPPORTED_FINDING_TYPE"
  inline val INVALID_CLASSIFICATION_RESULT: "INVALID_CLASSIFICATION_RESULT" = "INVALID_CLASSIFICATION_RESULT"
  inline val OBJECT_UNAVAILABLE: "OBJECT_UNAVAILABLE" = "OBJECT_UNAVAILABLE"

  inline def values: js.Array[UnavailabilityReasonCode] = js.Array(OBJECT_EXCEEDS_SIZE_QUOTA, UNSUPPORTED_OBJECT_TYPE, UNSUPPORTED_FINDING_TYPE, INVALID_CLASSIFICATION_RESULT, OBJECT_UNAVAILABLE)
}

type Unit = "TERABYTES"
object Unit {
  inline val TERABYTES: "TERABYTES" = "TERABYTES"

  inline def values: js.Array[Unit] = js.Array(TERABYTES)
}

/** The operator to use in a condition that filters the results of a query for Amazon Macie account quotas and usage data. Valid values are:
  */
type UsageStatisticsFilterComparator = "GT" | "GTE" | "LT" | "LTE" | "EQ" | "NE" | "CONTAINS"
object UsageStatisticsFilterComparator {
  inline val GT: "GT" = "GT"
  inline val GTE: "GTE" = "GTE"
  inline val LT: "LT" = "LT"
  inline val LTE: "LTE" = "LTE"
  inline val EQ: "EQ" = "EQ"
  inline val NE: "NE" = "NE"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"

  inline def values: js.Array[UsageStatisticsFilterComparator] = js.Array(GT, GTE, LT, LTE, EQ, NE, CONTAINS)
}

/** The field to use in a condition that filters the results of a query for Amazon Macie account quotas and usage data. Valid values are:
  */
type UsageStatisticsFilterKey = "accountId" | "serviceLimit" | "freeTrialStartDate" | "total"
object UsageStatisticsFilterKey {
  inline val accountId: "accountId" = "accountId"
  inline val serviceLimit: "serviceLimit" = "serviceLimit"
  inline val freeTrialStartDate: "freeTrialStartDate" = "freeTrialStartDate"
  inline val total: "total" = "total"

  inline def values: js.Array[UsageStatisticsFilterKey] = js.Array(accountId, serviceLimit, freeTrialStartDate, total)
}

/** The field to use to sort the results of a query for Amazon Macie account quotas and usage data. Valid values are:
  */
type UsageStatisticsSortKey = "accountId" | "total" | "serviceLimitValue" | "freeTrialStartDate"
object UsageStatisticsSortKey {
  inline val accountId: "accountId" = "accountId"
  inline val total: "total" = "total"
  inline val serviceLimitValue: "serviceLimitValue" = "serviceLimitValue"
  inline val freeTrialStartDate: "freeTrialStartDate" = "freeTrialStartDate"

  inline def values: js.Array[UsageStatisticsSortKey] = js.Array(accountId, total, serviceLimitValue, freeTrialStartDate)
}

/** The name of an Amazon Macie usage metric for an account. Possible values are:
  */
type UsageType = "DATA_INVENTORY_EVALUATION" | "SENSITIVE_DATA_DISCOVERY" | "AUTOMATED_SENSITIVE_DATA_DISCOVERY" | "AUTOMATED_OBJECT_MONITORING"
object UsageType {
  inline val DATA_INVENTORY_EVALUATION: "DATA_INVENTORY_EVALUATION" = "DATA_INVENTORY_EVALUATION"
  inline val SENSITIVE_DATA_DISCOVERY: "SENSITIVE_DATA_DISCOVERY" = "SENSITIVE_DATA_DISCOVERY"
  inline val AUTOMATED_SENSITIVE_DATA_DISCOVERY: "AUTOMATED_SENSITIVE_DATA_DISCOVERY" = "AUTOMATED_SENSITIVE_DATA_DISCOVERY"
  inline val AUTOMATED_OBJECT_MONITORING: "AUTOMATED_OBJECT_MONITORING" = "AUTOMATED_OBJECT_MONITORING"

  inline def values: js.Array[UsageType] = js.Array(DATA_INVENTORY_EVALUATION, SENSITIVE_DATA_DISCOVERY, AUTOMATED_SENSITIVE_DATA_DISCOVERY, AUTOMATED_OBJECT_MONITORING)
}

/** The type of entity that performed the action on the affected resource. Possible values are:
  */
type UserIdentityType = "AssumedRole" | "IAMUser" | "FederatedUser" | "Root" | "AWSAccount" | "AWSService"
object UserIdentityType {
  inline val AssumedRole: "AssumedRole" = "AssumedRole"
  inline val IAMUser: "IAMUser" = "IAMUser"
  inline val FederatedUser: "FederatedUser" = "FederatedUser"
  inline val Root: "Root" = "Root"
  inline val AWSAccount: "AWSAccount" = "AWSAccount"
  inline val AWSService: "AWSService" = "AWSService"

  inline def values: js.Array[UserIdentityType] = js.Array(AssumedRole, IAMUser, FederatedUser, Root, AWSAccount, AWSService)
}
