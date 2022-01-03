package facade.amazonaws.services.inspector2

import scalajs.js

type AccountSortBy = "CRITICAL" | "HIGH" | "ALL"
object AccountSortBy {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[AccountSortBy] = js.Array(CRITICAL, HIGH, ALL)
}

type AggregationFindingType = "NETWORK_REACHABILITY" | "PACKAGE_VULNERABILITY"
object AggregationFindingType {
  inline val NETWORK_REACHABILITY: "NETWORK_REACHABILITY" = "NETWORK_REACHABILITY"
  inline val PACKAGE_VULNERABILITY: "PACKAGE_VULNERABILITY" = "PACKAGE_VULNERABILITY"

  inline def values: js.Array[AggregationFindingType] = js.Array(NETWORK_REACHABILITY, PACKAGE_VULNERABILITY)
}

type AggregationResourceType = "AWS_EC2_INSTANCE" | "AWS_ECR_CONTAINER_IMAGE"
object AggregationResourceType {
  inline val AWS_EC2_INSTANCE: "AWS_EC2_INSTANCE" = "AWS_EC2_INSTANCE"
  inline val AWS_ECR_CONTAINER_IMAGE: "AWS_ECR_CONTAINER_IMAGE" = "AWS_ECR_CONTAINER_IMAGE"

  inline def values: js.Array[AggregationResourceType] = js.Array(AWS_EC2_INSTANCE, AWS_ECR_CONTAINER_IMAGE)
}

type AggregationType = "FINDING_TYPE" | "PACKAGE" | "TITLE" | "REPOSITORY" | "AMI" | "AWS_EC2_INSTANCE" | "AWS_ECR_CONTAINER" | "IMAGE_LAYER" | "ACCOUNT"
object AggregationType {
  inline val FINDING_TYPE: "FINDING_TYPE" = "FINDING_TYPE"
  inline val PACKAGE: "PACKAGE" = "PACKAGE"
  inline val TITLE: "TITLE" = "TITLE"
  inline val REPOSITORY: "REPOSITORY" = "REPOSITORY"
  inline val AMI: "AMI" = "AMI"
  inline val AWS_EC2_INSTANCE: "AWS_EC2_INSTANCE" = "AWS_EC2_INSTANCE"
  inline val AWS_ECR_CONTAINER: "AWS_ECR_CONTAINER" = "AWS_ECR_CONTAINER"
  inline val IMAGE_LAYER: "IMAGE_LAYER" = "IMAGE_LAYER"
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"

  inline def values: js.Array[AggregationType] = js.Array(FINDING_TYPE, PACKAGE, TITLE, REPOSITORY, AMI, AWS_EC2_INSTANCE, AWS_ECR_CONTAINER, IMAGE_LAYER, ACCOUNT)
}

type AmiSortBy = "CRITICAL" | "HIGH" | "ALL" | "AFFECTED_INSTANCES"
object AmiSortBy {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val ALL: "ALL" = "ALL"
  inline val AFFECTED_INSTANCES: "AFFECTED_INSTANCES" = "AFFECTED_INSTANCES"

  inline def values: js.Array[AmiSortBy] = js.Array(CRITICAL, HIGH, ALL, AFFECTED_INSTANCES)
}

type AwsEcrContainerSortBy = "CRITICAL" | "HIGH" | "ALL"
object AwsEcrContainerSortBy {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[AwsEcrContainerSortBy] = js.Array(CRITICAL, HIGH, ALL)
}

type CoverageMapComparison = "EQUALS"
object CoverageMapComparison {
  inline val EQUALS: "EQUALS" = "EQUALS"

  inline def values: js.Array[CoverageMapComparison] = js.Array(EQUALS)
}

type CoverageResourceType = "AWS_EC2_INSTANCE" | "AWS_ECR_CONTAINER_IMAGE" | "AWS_ECR_REPOSITORY"
object CoverageResourceType {
  inline val AWS_EC2_INSTANCE: "AWS_EC2_INSTANCE" = "AWS_EC2_INSTANCE"
  inline val AWS_ECR_CONTAINER_IMAGE: "AWS_ECR_CONTAINER_IMAGE" = "AWS_ECR_CONTAINER_IMAGE"
  inline val AWS_ECR_REPOSITORY: "AWS_ECR_REPOSITORY" = "AWS_ECR_REPOSITORY"

  inline def values: js.Array[CoverageResourceType] = js.Array(AWS_EC2_INSTANCE, AWS_ECR_CONTAINER_IMAGE, AWS_ECR_REPOSITORY)
}

type CoverageStringComparison = "EQUALS" | "NOT_EQUALS"
object CoverageStringComparison {
  inline val EQUALS: "EQUALS" = "EQUALS"
  inline val NOT_EQUALS: "NOT_EQUALS" = "NOT_EQUALS"

  inline def values: js.Array[CoverageStringComparison] = js.Array(EQUALS, NOT_EQUALS)
}

type Currency = "USD"
object Currency {
  inline val USD: "USD" = "USD"

  inline def values: js.Array[Currency] = js.Array(USD)
}

type DelegatedAdminStatus = "ENABLED" | "DISABLE_IN_PROGRESS"
object DelegatedAdminStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLE_IN_PROGRESS: "DISABLE_IN_PROGRESS" = "DISABLE_IN_PROGRESS"

  inline def values: js.Array[DelegatedAdminStatus] = js.Array(ENABLED, DISABLE_IN_PROGRESS)
}

type Ec2InstanceSortBy = "NETWORK_FINDINGS" | "CRITICAL" | "HIGH" | "ALL"
object Ec2InstanceSortBy {
  inline val NETWORK_FINDINGS: "NETWORK_FINDINGS" = "NETWORK_FINDINGS"
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[Ec2InstanceSortBy] = js.Array(NETWORK_FINDINGS, CRITICAL, HIGH, ALL)
}

type Ec2Platform = "WINDOWS" | "LINUX" | "UNKNOWN"
object Ec2Platform {
  inline val WINDOWS: "WINDOWS" = "WINDOWS"
  inline val LINUX: "LINUX" = "LINUX"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[Ec2Platform] = js.Array(WINDOWS, LINUX, UNKNOWN)
}

type EcrScanFrequency = "MANUAL" | "SCAN_ON_PUSH" | "CONTINUOUS_SCAN"
object EcrScanFrequency {
  inline val MANUAL: "MANUAL" = "MANUAL"
  inline val SCAN_ON_PUSH: "SCAN_ON_PUSH" = "SCAN_ON_PUSH"
  inline val CONTINUOUS_SCAN: "CONTINUOUS_SCAN" = "CONTINUOUS_SCAN"

  inline def values: js.Array[EcrScanFrequency] = js.Array(MANUAL, SCAN_ON_PUSH, CONTINUOUS_SCAN)
}

type ErrorCode = "ALREADY_ENABLED" | "ENABLE_IN_PROGRESS" | "DISABLE_IN_PROGRESS" | "SUSPEND_IN_PROGRESS" | "RESOURCE_NOT_FOUND" | "ACCESS_DENIED" | "INTERNAL_ERROR" | "SSM_UNAVAILABLE" | "SSM_THROTTLED" | "EVENTBRIDGE_UNAVAILABLE" | "EVENTBRIDGE_THROTTLED" | "RESOURCE_SCAN_NOT_DISABLED" | "DISASSOCIATE_ALL_MEMBERS"
object ErrorCode {
  inline val ALREADY_ENABLED: "ALREADY_ENABLED" = "ALREADY_ENABLED"
  inline val ENABLE_IN_PROGRESS: "ENABLE_IN_PROGRESS" = "ENABLE_IN_PROGRESS"
  inline val DISABLE_IN_PROGRESS: "DISABLE_IN_PROGRESS" = "DISABLE_IN_PROGRESS"
  inline val SUSPEND_IN_PROGRESS: "SUSPEND_IN_PROGRESS" = "SUSPEND_IN_PROGRESS"
  inline val RESOURCE_NOT_FOUND: "RESOURCE_NOT_FOUND" = "RESOURCE_NOT_FOUND"
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val SSM_UNAVAILABLE: "SSM_UNAVAILABLE" = "SSM_UNAVAILABLE"
  inline val SSM_THROTTLED: "SSM_THROTTLED" = "SSM_THROTTLED"
  inline val EVENTBRIDGE_UNAVAILABLE: "EVENTBRIDGE_UNAVAILABLE" = "EVENTBRIDGE_UNAVAILABLE"
  inline val EVENTBRIDGE_THROTTLED: "EVENTBRIDGE_THROTTLED" = "EVENTBRIDGE_THROTTLED"
  inline val RESOURCE_SCAN_NOT_DISABLED: "RESOURCE_SCAN_NOT_DISABLED" = "RESOURCE_SCAN_NOT_DISABLED"
  inline val DISASSOCIATE_ALL_MEMBERS: "DISASSOCIATE_ALL_MEMBERS" = "DISASSOCIATE_ALL_MEMBERS"

  inline def values: js.Array[ErrorCode] = js.Array(
    ALREADY_ENABLED,
    ENABLE_IN_PROGRESS,
    DISABLE_IN_PROGRESS,
    SUSPEND_IN_PROGRESS,
    RESOURCE_NOT_FOUND,
    ACCESS_DENIED,
    INTERNAL_ERROR,
    SSM_UNAVAILABLE,
    SSM_THROTTLED,
    EVENTBRIDGE_UNAVAILABLE,
    EVENTBRIDGE_THROTTLED,
    RESOURCE_SCAN_NOT_DISABLED,
    DISASSOCIATE_ALL_MEMBERS
  )
}

type ExternalReportStatus = "SUCCEEDED" | "IN_PROGRESS" | "CANCELLED" | "FAILED"
object ExternalReportStatus {
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ExternalReportStatus] = js.Array(SUCCEEDED, IN_PROGRESS, CANCELLED, FAILED)
}

type FilterAction = "NONE" | "SUPPRESS"
object FilterAction {
  inline val NONE: "NONE" = "NONE"
  inline val SUPPRESS: "SUPPRESS" = "SUPPRESS"

  inline def values: js.Array[FilterAction] = js.Array(NONE, SUPPRESS)
}

type FindingStatus = "ACTIVE" | "SUPPRESSED" | "CLOSED"
object FindingStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val SUPPRESSED: "SUPPRESSED" = "SUPPRESSED"
  inline val CLOSED: "CLOSED" = "CLOSED"

  inline def values: js.Array[FindingStatus] = js.Array(ACTIVE, SUPPRESSED, CLOSED)
}

type FindingType = "NETWORK_REACHABILITY" | "PACKAGE_VULNERABILITY"
object FindingType {
  inline val NETWORK_REACHABILITY: "NETWORK_REACHABILITY" = "NETWORK_REACHABILITY"
  inline val PACKAGE_VULNERABILITY: "PACKAGE_VULNERABILITY" = "PACKAGE_VULNERABILITY"

  inline def values: js.Array[FindingType] = js.Array(NETWORK_REACHABILITY, PACKAGE_VULNERABILITY)
}

type FindingTypeSortBy = "CRITICAL" | "HIGH" | "ALL"
object FindingTypeSortBy {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[FindingTypeSortBy] = js.Array(CRITICAL, HIGH, ALL)
}

type FreeTrialInfoErrorCode = "ACCESS_DENIED" | "INTERNAL_ERROR"
object FreeTrialInfoErrorCode {
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"

  inline def values: js.Array[FreeTrialInfoErrorCode] = js.Array(ACCESS_DENIED, INTERNAL_ERROR)
}

type FreeTrialStatus = "ACTIVE" | "INACTIVE"
object FreeTrialStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[FreeTrialStatus] = js.Array(ACTIVE, INACTIVE)
}

type FreeTrialType = "EC2" | "ECR"
object FreeTrialType {
  inline val EC2: "EC2" = "EC2"
  inline val ECR: "ECR" = "ECR"

  inline def values: js.Array[FreeTrialType] = js.Array(EC2, ECR)
}

type GroupKey = "SCAN_STATUS_CODE" | "SCAN_STATUS_REASON" | "ACCOUNT_ID" | "RESOURCE_TYPE" | "ECR_REPOSITORY_NAME"
object GroupKey {
  inline val SCAN_STATUS_CODE: "SCAN_STATUS_CODE" = "SCAN_STATUS_CODE"
  inline val SCAN_STATUS_REASON: "SCAN_STATUS_REASON" = "SCAN_STATUS_REASON"
  inline val ACCOUNT_ID: "ACCOUNT_ID" = "ACCOUNT_ID"
  inline val RESOURCE_TYPE: "RESOURCE_TYPE" = "RESOURCE_TYPE"
  inline val ECR_REPOSITORY_NAME: "ECR_REPOSITORY_NAME" = "ECR_REPOSITORY_NAME"

  inline def values: js.Array[GroupKey] = js.Array(SCAN_STATUS_CODE, SCAN_STATUS_REASON, ACCOUNT_ID, RESOURCE_TYPE, ECR_REPOSITORY_NAME)
}

type ImageLayerSortBy = "CRITICAL" | "HIGH" | "ALL"
object ImageLayerSortBy {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[ImageLayerSortBy] = js.Array(CRITICAL, HIGH, ALL)
}

type MapComparison = "EQUALS"
object MapComparison {
  inline val EQUALS: "EQUALS" = "EQUALS"

  inline def values: js.Array[MapComparison] = js.Array(EQUALS)
}

type NetworkProtocol = "TCP" | "UDP"
object NetworkProtocol {
  inline val TCP: "TCP" = "TCP"
  inline val UDP: "UDP" = "UDP"

  inline def values: js.Array[NetworkProtocol] = js.Array(TCP, UDP)
}

type Operation = "ENABLE_SCANNING" | "DISABLE_SCANNING" | "ENABLE_REPOSITORY" | "DISABLE_REPOSITORY"
object Operation {
  inline val ENABLE_SCANNING: "ENABLE_SCANNING" = "ENABLE_SCANNING"
  inline val DISABLE_SCANNING: "DISABLE_SCANNING" = "DISABLE_SCANNING"
  inline val ENABLE_REPOSITORY: "ENABLE_REPOSITORY" = "ENABLE_REPOSITORY"
  inline val DISABLE_REPOSITORY: "DISABLE_REPOSITORY" = "DISABLE_REPOSITORY"

  inline def values: js.Array[Operation] = js.Array(ENABLE_SCANNING, DISABLE_SCANNING, ENABLE_REPOSITORY, DISABLE_REPOSITORY)
}

type PackageManager = "BUNDLER" | "CARGO" | "COMPOSER" | "NPM" | "NUGET" | "PIPENV" | "POETRY" | "YARN" | "GOBINARY" | "GOMOD" | "JAR" | "OS"
object PackageManager {
  inline val BUNDLER: "BUNDLER" = "BUNDLER"
  inline val CARGO: "CARGO" = "CARGO"
  inline val COMPOSER: "COMPOSER" = "COMPOSER"
  inline val NPM: "NPM" = "NPM"
  inline val NUGET: "NUGET" = "NUGET"
  inline val PIPENV: "PIPENV" = "PIPENV"
  inline val POETRY: "POETRY" = "POETRY"
  inline val YARN: "YARN" = "YARN"
  inline val GOBINARY: "GOBINARY" = "GOBINARY"
  inline val GOMOD: "GOMOD" = "GOMOD"
  inline val JAR: "JAR" = "JAR"
  inline val OS: "OS" = "OS"

  inline def values: js.Array[PackageManager] = js.Array(BUNDLER, CARGO, COMPOSER, NPM, NUGET, PIPENV, POETRY, YARN, GOBINARY, GOMOD, JAR, OS)
}

type PackageSortBy = "CRITICAL" | "HIGH" | "ALL"
object PackageSortBy {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[PackageSortBy] = js.Array(CRITICAL, HIGH, ALL)
}

type RelationshipStatus = "CREATED" | "INVITED" | "DISABLED" | "ENABLED" | "REMOVED" | "RESIGNED" | "DELETED" | "EMAIL_VERIFICATION_IN_PROGRESS" | "EMAIL_VERIFICATION_FAILED" | "REGION_DISABLED" | "ACCOUNT_SUSPENDED" | "CANNOT_CREATE_DETECTOR_IN_ORG_MASTER"
object RelationshipStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val INVITED: "INVITED" = "INVITED"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val REMOVED: "REMOVED" = "REMOVED"
  inline val RESIGNED: "RESIGNED" = "RESIGNED"
  inline val DELETED: "DELETED" = "DELETED"
  inline val EMAIL_VERIFICATION_IN_PROGRESS: "EMAIL_VERIFICATION_IN_PROGRESS" = "EMAIL_VERIFICATION_IN_PROGRESS"
  inline val EMAIL_VERIFICATION_FAILED: "EMAIL_VERIFICATION_FAILED" = "EMAIL_VERIFICATION_FAILED"
  inline val REGION_DISABLED: "REGION_DISABLED" = "REGION_DISABLED"
  inline val ACCOUNT_SUSPENDED: "ACCOUNT_SUSPENDED" = "ACCOUNT_SUSPENDED"
  inline val CANNOT_CREATE_DETECTOR_IN_ORG_MASTER: "CANNOT_CREATE_DETECTOR_IN_ORG_MASTER" = "CANNOT_CREATE_DETECTOR_IN_ORG_MASTER"

  inline def values: js.Array[RelationshipStatus] = js.Array(
    CREATED,
    INVITED,
    DISABLED,
    ENABLED,
    REMOVED,
    RESIGNED,
    DELETED,
    EMAIL_VERIFICATION_IN_PROGRESS,
    EMAIL_VERIFICATION_FAILED,
    REGION_DISABLED,
    ACCOUNT_SUSPENDED,
    CANNOT_CREATE_DETECTOR_IN_ORG_MASTER
  )
}

type ReportFormat = "CSV" | "JSON"
object ReportFormat {
  inline val CSV: "CSV" = "CSV"
  inline val JSON: "JSON" = "JSON"

  inline def values: js.Array[ReportFormat] = js.Array(CSV, JSON)
}

type ReportingErrorCode = "INTERNAL_ERROR" | "INVALID_PERMISSIONS"
object ReportingErrorCode {
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val INVALID_PERMISSIONS: "INVALID_PERMISSIONS" = "INVALID_PERMISSIONS"

  inline def values: js.Array[ReportingErrorCode] = js.Array(INTERNAL_ERROR, INVALID_PERMISSIONS)
}

type RepositorySortBy = "CRITICAL" | "HIGH" | "ALL" | "AFFECTED_IMAGES"
object RepositorySortBy {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val ALL: "ALL" = "ALL"
  inline val AFFECTED_IMAGES: "AFFECTED_IMAGES" = "AFFECTED_IMAGES"

  inline def values: js.Array[RepositorySortBy] = js.Array(CRITICAL, HIGH, ALL, AFFECTED_IMAGES)
}

type ResourceScanType = "EC2" | "ECR"
object ResourceScanType {
  inline val EC2: "EC2" = "EC2"
  inline val ECR: "ECR" = "ECR"

  inline def values: js.Array[ResourceScanType] = js.Array(EC2, ECR)
}

type ResourceType = "AWS_EC2_INSTANCE" | "AWS_ECR_CONTAINER_IMAGE" | "AWS_ECR_REPOSITORY"
object ResourceType {
  inline val AWS_EC2_INSTANCE: "AWS_EC2_INSTANCE" = "AWS_EC2_INSTANCE"
  inline val AWS_ECR_CONTAINER_IMAGE: "AWS_ECR_CONTAINER_IMAGE" = "AWS_ECR_CONTAINER_IMAGE"
  inline val AWS_ECR_REPOSITORY: "AWS_ECR_REPOSITORY" = "AWS_ECR_REPOSITORY"

  inline def values: js.Array[ResourceType] = js.Array(AWS_EC2_INSTANCE, AWS_ECR_CONTAINER_IMAGE, AWS_ECR_REPOSITORY)
}

type ScanStatusCode = "ACTIVE" | "INACTIVE"
object ScanStatusCode {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[ScanStatusCode] = js.Array(ACTIVE, INACTIVE)
}

type ScanStatusReason = "PENDING_INITIAL_SCAN" | "ACCESS_DENIED" | "INTERNAL_ERROR" | "UNMANAGED_EC2_INSTANCE" | "UNSUPPORTED_OS" | "SCAN_ELIGIBILITY_EXPIRED" | "RESOURCE_TERMINATED" | "SUCCESSFUL" | "NO_RESOURCES_FOUND" | "IMAGE_SIZE_EXCEEDED" | "SCAN_FREQUENCY_MANUAL" | "SCAN_FREQUENCY_SCAN_ON_PUSH" | "EC2_INSTANCE_STOPPED"
object ScanStatusReason {
  inline val PENDING_INITIAL_SCAN: "PENDING_INITIAL_SCAN" = "PENDING_INITIAL_SCAN"
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val UNMANAGED_EC2_INSTANCE: "UNMANAGED_EC2_INSTANCE" = "UNMANAGED_EC2_INSTANCE"
  inline val UNSUPPORTED_OS: "UNSUPPORTED_OS" = "UNSUPPORTED_OS"
  inline val SCAN_ELIGIBILITY_EXPIRED: "SCAN_ELIGIBILITY_EXPIRED" = "SCAN_ELIGIBILITY_EXPIRED"
  inline val RESOURCE_TERMINATED: "RESOURCE_TERMINATED" = "RESOURCE_TERMINATED"
  inline val SUCCESSFUL: "SUCCESSFUL" = "SUCCESSFUL"
  inline val NO_RESOURCES_FOUND: "NO_RESOURCES_FOUND" = "NO_RESOURCES_FOUND"
  inline val IMAGE_SIZE_EXCEEDED: "IMAGE_SIZE_EXCEEDED" = "IMAGE_SIZE_EXCEEDED"
  inline val SCAN_FREQUENCY_MANUAL: "SCAN_FREQUENCY_MANUAL" = "SCAN_FREQUENCY_MANUAL"
  inline val SCAN_FREQUENCY_SCAN_ON_PUSH: "SCAN_FREQUENCY_SCAN_ON_PUSH" = "SCAN_FREQUENCY_SCAN_ON_PUSH"
  inline val EC2_INSTANCE_STOPPED: "EC2_INSTANCE_STOPPED" = "EC2_INSTANCE_STOPPED"

  inline def values: js.Array[ScanStatusReason] = js.Array(
    PENDING_INITIAL_SCAN,
    ACCESS_DENIED,
    INTERNAL_ERROR,
    UNMANAGED_EC2_INSTANCE,
    UNSUPPORTED_OS,
    SCAN_ELIGIBILITY_EXPIRED,
    RESOURCE_TERMINATED,
    SUCCESSFUL,
    NO_RESOURCES_FOUND,
    IMAGE_SIZE_EXCEEDED,
    SCAN_FREQUENCY_MANUAL,
    SCAN_FREQUENCY_SCAN_ON_PUSH,
    EC2_INSTANCE_STOPPED
  )
}

type ScanType = "NETWORK" | "PACKAGE"
object ScanType {
  inline val NETWORK: "NETWORK" = "NETWORK"
  inline val PACKAGE: "PACKAGE" = "PACKAGE"

  inline def values: js.Array[ScanType] = js.Array(NETWORK, PACKAGE)
}

type Service = "EC2" | "ECR"
object Service {
  inline val EC2: "EC2" = "EC2"
  inline val ECR: "ECR" = "ECR"

  inline def values: js.Array[Service] = js.Array(EC2, ECR)
}

type Severity = "INFORMATIONAL" | "LOW" | "MEDIUM" | "HIGH" | "CRITICAL" | "UNTRIAGED"
object Severity {
  inline val INFORMATIONAL: "INFORMATIONAL" = "INFORMATIONAL"
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val UNTRIAGED: "UNTRIAGED" = "UNTRIAGED"

  inline def values: js.Array[Severity] = js.Array(INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL, UNTRIAGED)
}

type SortField = "AWS_ACCOUNT_ID" | "FINDING_TYPE" | "SEVERITY" | "FIRST_OBSERVED_AT" | "LAST_OBSERVED_AT" | "FINDING_STATUS" | "RESOURCE_TYPE" | "ECR_IMAGE_PUSHED_AT" | "ECR_IMAGE_REPOSITORY_NAME" | "ECR_IMAGE_REGISTRY" | "NETWORK_PROTOCOL" | "COMPONENT_TYPE" | "VULNERABILITY_ID" | "VULNERABILITY_SOURCE" | "INSPECTOR_SCORE" | "VENDOR_SEVERITY"
object SortField {
  inline val AWS_ACCOUNT_ID: "AWS_ACCOUNT_ID" = "AWS_ACCOUNT_ID"
  inline val FINDING_TYPE: "FINDING_TYPE" = "FINDING_TYPE"
  inline val SEVERITY: "SEVERITY" = "SEVERITY"
  inline val FIRST_OBSERVED_AT: "FIRST_OBSERVED_AT" = "FIRST_OBSERVED_AT"
  inline val LAST_OBSERVED_AT: "LAST_OBSERVED_AT" = "LAST_OBSERVED_AT"
  inline val FINDING_STATUS: "FINDING_STATUS" = "FINDING_STATUS"
  inline val RESOURCE_TYPE: "RESOURCE_TYPE" = "RESOURCE_TYPE"
  inline val ECR_IMAGE_PUSHED_AT: "ECR_IMAGE_PUSHED_AT" = "ECR_IMAGE_PUSHED_AT"
  inline val ECR_IMAGE_REPOSITORY_NAME: "ECR_IMAGE_REPOSITORY_NAME" = "ECR_IMAGE_REPOSITORY_NAME"
  inline val ECR_IMAGE_REGISTRY: "ECR_IMAGE_REGISTRY" = "ECR_IMAGE_REGISTRY"
  inline val NETWORK_PROTOCOL: "NETWORK_PROTOCOL" = "NETWORK_PROTOCOL"
  inline val COMPONENT_TYPE: "COMPONENT_TYPE" = "COMPONENT_TYPE"
  inline val VULNERABILITY_ID: "VULNERABILITY_ID" = "VULNERABILITY_ID"
  inline val VULNERABILITY_SOURCE: "VULNERABILITY_SOURCE" = "VULNERABILITY_SOURCE"
  inline val INSPECTOR_SCORE: "INSPECTOR_SCORE" = "INSPECTOR_SCORE"
  inline val VENDOR_SEVERITY: "VENDOR_SEVERITY" = "VENDOR_SEVERITY"

  inline def values: js.Array[SortField] = js.Array(
    AWS_ACCOUNT_ID,
    FINDING_TYPE,
    SEVERITY,
    FIRST_OBSERVED_AT,
    LAST_OBSERVED_AT,
    FINDING_STATUS,
    RESOURCE_TYPE,
    ECR_IMAGE_PUSHED_AT,
    ECR_IMAGE_REPOSITORY_NAME,
    ECR_IMAGE_REGISTRY,
    NETWORK_PROTOCOL,
    COMPONENT_TYPE,
    VULNERABILITY_ID,
    VULNERABILITY_SOURCE,
    INSPECTOR_SCORE,
    VENDOR_SEVERITY
  )
}

type SortOrder = "ASC" | "DESC"
object SortOrder {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[SortOrder] = js.Array(ASC, DESC)
}

type Status = "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED" | "SUSPENDING" | "SUSPENDED"
object Status {
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLING: "DISABLING" = "DISABLING"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val SUSPENDING: "SUSPENDING" = "SUSPENDING"
  inline val SUSPENDED: "SUSPENDED" = "SUSPENDED"

  inline def values: js.Array[Status] = js.Array(ENABLING, ENABLED, DISABLING, DISABLED, SUSPENDING, SUSPENDED)
}

type StringComparison = "EQUALS" | "PREFIX" | "NOT_EQUALS"
object StringComparison {
  inline val EQUALS: "EQUALS" = "EQUALS"
  inline val PREFIX: "PREFIX" = "PREFIX"
  inline val NOT_EQUALS: "NOT_EQUALS" = "NOT_EQUALS"

  inline def values: js.Array[StringComparison] = js.Array(EQUALS, PREFIX, NOT_EQUALS)
}

type TitleSortBy = "CRITICAL" | "HIGH" | "ALL"
object TitleSortBy {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[TitleSortBy] = js.Array(CRITICAL, HIGH, ALL)
}

type UsageType = "EC2_INSTANCE_HOURS" | "ECR_INITIAL_SCAN" | "ECR_RESCAN"
object UsageType {
  inline val EC2_INSTANCE_HOURS: "EC2_INSTANCE_HOURS" = "EC2_INSTANCE_HOURS"
  inline val ECR_INITIAL_SCAN: "ECR_INITIAL_SCAN" = "ECR_INITIAL_SCAN"
  inline val ECR_RESCAN: "ECR_RESCAN" = "ECR_RESCAN"

  inline def values: js.Array[UsageType] = js.Array(EC2_INSTANCE_HOURS, ECR_INITIAL_SCAN, ECR_RESCAN)
}
