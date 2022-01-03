package facade.amazonaws.services.inspector2

import scalajs.js

@js.native
sealed trait AccountSortBy extends js.Any
object AccountSortBy {
  val CRITICAL = "CRITICAL".asInstanceOf[AccountSortBy]
  val HIGH = "HIGH".asInstanceOf[AccountSortBy]
  val ALL = "ALL".asInstanceOf[AccountSortBy]

  @inline def values: js.Array[AccountSortBy] = js.Array(CRITICAL, HIGH, ALL)
}

@js.native
sealed trait AggregationFindingType extends js.Any
object AggregationFindingType {
  val NETWORK_REACHABILITY = "NETWORK_REACHABILITY".asInstanceOf[AggregationFindingType]
  val PACKAGE_VULNERABILITY = "PACKAGE_VULNERABILITY".asInstanceOf[AggregationFindingType]

  @inline def values: js.Array[AggregationFindingType] = js.Array(NETWORK_REACHABILITY, PACKAGE_VULNERABILITY)
}

@js.native
sealed trait AggregationResourceType extends js.Any
object AggregationResourceType {
  val AWS_EC2_INSTANCE = "AWS_EC2_INSTANCE".asInstanceOf[AggregationResourceType]
  val AWS_ECR_CONTAINER_IMAGE = "AWS_ECR_CONTAINER_IMAGE".asInstanceOf[AggregationResourceType]

  @inline def values: js.Array[AggregationResourceType] = js.Array(AWS_EC2_INSTANCE, AWS_ECR_CONTAINER_IMAGE)
}

@js.native
sealed trait AggregationType extends js.Any
object AggregationType {
  val FINDING_TYPE = "FINDING_TYPE".asInstanceOf[AggregationType]
  val PACKAGE = "PACKAGE".asInstanceOf[AggregationType]
  val TITLE = "TITLE".asInstanceOf[AggregationType]
  val REPOSITORY = "REPOSITORY".asInstanceOf[AggregationType]
  val AMI = "AMI".asInstanceOf[AggregationType]
  val AWS_EC2_INSTANCE = "AWS_EC2_INSTANCE".asInstanceOf[AggregationType]
  val AWS_ECR_CONTAINER = "AWS_ECR_CONTAINER".asInstanceOf[AggregationType]
  val IMAGE_LAYER = "IMAGE_LAYER".asInstanceOf[AggregationType]
  val ACCOUNT = "ACCOUNT".asInstanceOf[AggregationType]

  @inline def values: js.Array[AggregationType] = js.Array(FINDING_TYPE, PACKAGE, TITLE, REPOSITORY, AMI, AWS_EC2_INSTANCE, AWS_ECR_CONTAINER, IMAGE_LAYER, ACCOUNT)
}

@js.native
sealed trait AmiSortBy extends js.Any
object AmiSortBy {
  val CRITICAL = "CRITICAL".asInstanceOf[AmiSortBy]
  val HIGH = "HIGH".asInstanceOf[AmiSortBy]
  val ALL = "ALL".asInstanceOf[AmiSortBy]
  val AFFECTED_INSTANCES = "AFFECTED_INSTANCES".asInstanceOf[AmiSortBy]

  @inline def values: js.Array[AmiSortBy] = js.Array(CRITICAL, HIGH, ALL, AFFECTED_INSTANCES)
}

@js.native
sealed trait AwsEcrContainerSortBy extends js.Any
object AwsEcrContainerSortBy {
  val CRITICAL = "CRITICAL".asInstanceOf[AwsEcrContainerSortBy]
  val HIGH = "HIGH".asInstanceOf[AwsEcrContainerSortBy]
  val ALL = "ALL".asInstanceOf[AwsEcrContainerSortBy]

  @inline def values: js.Array[AwsEcrContainerSortBy] = js.Array(CRITICAL, HIGH, ALL)
}

@js.native
sealed trait CoverageMapComparison extends js.Any
object CoverageMapComparison {
  val EQUALS = "EQUALS".asInstanceOf[CoverageMapComparison]

  @inline def values: js.Array[CoverageMapComparison] = js.Array(EQUALS)
}

@js.native
sealed trait CoverageResourceType extends js.Any
object CoverageResourceType {
  val AWS_EC2_INSTANCE = "AWS_EC2_INSTANCE".asInstanceOf[CoverageResourceType]
  val AWS_ECR_CONTAINER_IMAGE = "AWS_ECR_CONTAINER_IMAGE".asInstanceOf[CoverageResourceType]
  val AWS_ECR_REPOSITORY = "AWS_ECR_REPOSITORY".asInstanceOf[CoverageResourceType]

  @inline def values: js.Array[CoverageResourceType] = js.Array(AWS_EC2_INSTANCE, AWS_ECR_CONTAINER_IMAGE, AWS_ECR_REPOSITORY)
}

@js.native
sealed trait CoverageStringComparison extends js.Any
object CoverageStringComparison {
  val EQUALS = "EQUALS".asInstanceOf[CoverageStringComparison]
  val NOT_EQUALS = "NOT_EQUALS".asInstanceOf[CoverageStringComparison]

  @inline def values: js.Array[CoverageStringComparison] = js.Array(EQUALS, NOT_EQUALS)
}

@js.native
sealed trait Currency extends js.Any
object Currency {
  val USD = "USD".asInstanceOf[Currency]

  @inline def values: js.Array[Currency] = js.Array(USD)
}

@js.native
sealed trait DelegatedAdminStatus extends js.Any
object DelegatedAdminStatus {
  val ENABLED = "ENABLED".asInstanceOf[DelegatedAdminStatus]
  val DISABLE_IN_PROGRESS = "DISABLE_IN_PROGRESS".asInstanceOf[DelegatedAdminStatus]

  @inline def values: js.Array[DelegatedAdminStatus] = js.Array(ENABLED, DISABLE_IN_PROGRESS)
}

@js.native
sealed trait Ec2InstanceSortBy extends js.Any
object Ec2InstanceSortBy {
  val NETWORK_FINDINGS = "NETWORK_FINDINGS".asInstanceOf[Ec2InstanceSortBy]
  val CRITICAL = "CRITICAL".asInstanceOf[Ec2InstanceSortBy]
  val HIGH = "HIGH".asInstanceOf[Ec2InstanceSortBy]
  val ALL = "ALL".asInstanceOf[Ec2InstanceSortBy]

  @inline def values: js.Array[Ec2InstanceSortBy] = js.Array(NETWORK_FINDINGS, CRITICAL, HIGH, ALL)
}

@js.native
sealed trait Ec2Platform extends js.Any
object Ec2Platform {
  val WINDOWS = "WINDOWS".asInstanceOf[Ec2Platform]
  val LINUX = "LINUX".asInstanceOf[Ec2Platform]
  val UNKNOWN = "UNKNOWN".asInstanceOf[Ec2Platform]

  @inline def values: js.Array[Ec2Platform] = js.Array(WINDOWS, LINUX, UNKNOWN)
}

@js.native
sealed trait EcrScanFrequency extends js.Any
object EcrScanFrequency {
  val MANUAL = "MANUAL".asInstanceOf[EcrScanFrequency]
  val SCAN_ON_PUSH = "SCAN_ON_PUSH".asInstanceOf[EcrScanFrequency]
  val CONTINUOUS_SCAN = "CONTINUOUS_SCAN".asInstanceOf[EcrScanFrequency]

  @inline def values: js.Array[EcrScanFrequency] = js.Array(MANUAL, SCAN_ON_PUSH, CONTINUOUS_SCAN)
}

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val ALREADY_ENABLED = "ALREADY_ENABLED".asInstanceOf[ErrorCode]
  val ENABLE_IN_PROGRESS = "ENABLE_IN_PROGRESS".asInstanceOf[ErrorCode]
  val DISABLE_IN_PROGRESS = "DISABLE_IN_PROGRESS".asInstanceOf[ErrorCode]
  val SUSPEND_IN_PROGRESS = "SUSPEND_IN_PROGRESS".asInstanceOf[ErrorCode]
  val RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND".asInstanceOf[ErrorCode]
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[ErrorCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[ErrorCode]
  val SSM_UNAVAILABLE = "SSM_UNAVAILABLE".asInstanceOf[ErrorCode]
  val SSM_THROTTLED = "SSM_THROTTLED".asInstanceOf[ErrorCode]
  val EVENTBRIDGE_UNAVAILABLE = "EVENTBRIDGE_UNAVAILABLE".asInstanceOf[ErrorCode]
  val EVENTBRIDGE_THROTTLED = "EVENTBRIDGE_THROTTLED".asInstanceOf[ErrorCode]
  val RESOURCE_SCAN_NOT_DISABLED = "RESOURCE_SCAN_NOT_DISABLED".asInstanceOf[ErrorCode]
  val DISASSOCIATE_ALL_MEMBERS = "DISASSOCIATE_ALL_MEMBERS".asInstanceOf[ErrorCode]

  @inline def values: js.Array[ErrorCode] = js.Array(
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

@js.native
sealed trait ExternalReportStatus extends js.Any
object ExternalReportStatus {
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ExternalReportStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ExternalReportStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[ExternalReportStatus]
  val FAILED = "FAILED".asInstanceOf[ExternalReportStatus]

  @inline def values: js.Array[ExternalReportStatus] = js.Array(SUCCEEDED, IN_PROGRESS, CANCELLED, FAILED)
}

@js.native
sealed trait FilterAction extends js.Any
object FilterAction {
  val NONE = "NONE".asInstanceOf[FilterAction]
  val SUPPRESS = "SUPPRESS".asInstanceOf[FilterAction]

  @inline def values: js.Array[FilterAction] = js.Array(NONE, SUPPRESS)
}

@js.native
sealed trait FindingStatus extends js.Any
object FindingStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[FindingStatus]
  val SUPPRESSED = "SUPPRESSED".asInstanceOf[FindingStatus]
  val CLOSED = "CLOSED".asInstanceOf[FindingStatus]

  @inline def values: js.Array[FindingStatus] = js.Array(ACTIVE, SUPPRESSED, CLOSED)
}

@js.native
sealed trait FindingType extends js.Any
object FindingType {
  val NETWORK_REACHABILITY = "NETWORK_REACHABILITY".asInstanceOf[FindingType]
  val PACKAGE_VULNERABILITY = "PACKAGE_VULNERABILITY".asInstanceOf[FindingType]

  @inline def values: js.Array[FindingType] = js.Array(NETWORK_REACHABILITY, PACKAGE_VULNERABILITY)
}

@js.native
sealed trait FindingTypeSortBy extends js.Any
object FindingTypeSortBy {
  val CRITICAL = "CRITICAL".asInstanceOf[FindingTypeSortBy]
  val HIGH = "HIGH".asInstanceOf[FindingTypeSortBy]
  val ALL = "ALL".asInstanceOf[FindingTypeSortBy]

  @inline def values: js.Array[FindingTypeSortBy] = js.Array(CRITICAL, HIGH, ALL)
}

@js.native
sealed trait FreeTrialInfoErrorCode extends js.Any
object FreeTrialInfoErrorCode {
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[FreeTrialInfoErrorCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[FreeTrialInfoErrorCode]

  @inline def values: js.Array[FreeTrialInfoErrorCode] = js.Array(ACCESS_DENIED, INTERNAL_ERROR)
}

@js.native
sealed trait FreeTrialStatus extends js.Any
object FreeTrialStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[FreeTrialStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[FreeTrialStatus]

  @inline def values: js.Array[FreeTrialStatus] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait FreeTrialType extends js.Any
object FreeTrialType {
  val EC2 = "EC2".asInstanceOf[FreeTrialType]
  val ECR = "ECR".asInstanceOf[FreeTrialType]

  @inline def values: js.Array[FreeTrialType] = js.Array(EC2, ECR)
}

@js.native
sealed trait GroupKey extends js.Any
object GroupKey {
  val SCAN_STATUS_CODE = "SCAN_STATUS_CODE".asInstanceOf[GroupKey]
  val SCAN_STATUS_REASON = "SCAN_STATUS_REASON".asInstanceOf[GroupKey]
  val ACCOUNT_ID = "ACCOUNT_ID".asInstanceOf[GroupKey]
  val RESOURCE_TYPE = "RESOURCE_TYPE".asInstanceOf[GroupKey]
  val ECR_REPOSITORY_NAME = "ECR_REPOSITORY_NAME".asInstanceOf[GroupKey]

  @inline def values: js.Array[GroupKey] = js.Array(SCAN_STATUS_CODE, SCAN_STATUS_REASON, ACCOUNT_ID, RESOURCE_TYPE, ECR_REPOSITORY_NAME)
}

@js.native
sealed trait ImageLayerSortBy extends js.Any
object ImageLayerSortBy {
  val CRITICAL = "CRITICAL".asInstanceOf[ImageLayerSortBy]
  val HIGH = "HIGH".asInstanceOf[ImageLayerSortBy]
  val ALL = "ALL".asInstanceOf[ImageLayerSortBy]

  @inline def values: js.Array[ImageLayerSortBy] = js.Array(CRITICAL, HIGH, ALL)
}

@js.native
sealed trait MapComparison extends js.Any
object MapComparison {
  val EQUALS = "EQUALS".asInstanceOf[MapComparison]

  @inline def values: js.Array[MapComparison] = js.Array(EQUALS)
}

@js.native
sealed trait NetworkProtocol extends js.Any
object NetworkProtocol {
  val TCP = "TCP".asInstanceOf[NetworkProtocol]
  val UDP = "UDP".asInstanceOf[NetworkProtocol]

  @inline def values: js.Array[NetworkProtocol] = js.Array(TCP, UDP)
}

@js.native
sealed trait Operation extends js.Any
object Operation {
  val ENABLE_SCANNING = "ENABLE_SCANNING".asInstanceOf[Operation]
  val DISABLE_SCANNING = "DISABLE_SCANNING".asInstanceOf[Operation]
  val ENABLE_REPOSITORY = "ENABLE_REPOSITORY".asInstanceOf[Operation]
  val DISABLE_REPOSITORY = "DISABLE_REPOSITORY".asInstanceOf[Operation]

  @inline def values: js.Array[Operation] = js.Array(ENABLE_SCANNING, DISABLE_SCANNING, ENABLE_REPOSITORY, DISABLE_REPOSITORY)
}

@js.native
sealed trait PackageManager extends js.Any
object PackageManager {
  val BUNDLER = "BUNDLER".asInstanceOf[PackageManager]
  val CARGO = "CARGO".asInstanceOf[PackageManager]
  val COMPOSER = "COMPOSER".asInstanceOf[PackageManager]
  val NPM = "NPM".asInstanceOf[PackageManager]
  val NUGET = "NUGET".asInstanceOf[PackageManager]
  val PIPENV = "PIPENV".asInstanceOf[PackageManager]
  val POETRY = "POETRY".asInstanceOf[PackageManager]
  val YARN = "YARN".asInstanceOf[PackageManager]
  val GOBINARY = "GOBINARY".asInstanceOf[PackageManager]
  val GOMOD = "GOMOD".asInstanceOf[PackageManager]
  val JAR = "JAR".asInstanceOf[PackageManager]
  val OS = "OS".asInstanceOf[PackageManager]

  @inline def values: js.Array[PackageManager] = js.Array(BUNDLER, CARGO, COMPOSER, NPM, NUGET, PIPENV, POETRY, YARN, GOBINARY, GOMOD, JAR, OS)
}

@js.native
sealed trait PackageSortBy extends js.Any
object PackageSortBy {
  val CRITICAL = "CRITICAL".asInstanceOf[PackageSortBy]
  val HIGH = "HIGH".asInstanceOf[PackageSortBy]
  val ALL = "ALL".asInstanceOf[PackageSortBy]

  @inline def values: js.Array[PackageSortBy] = js.Array(CRITICAL, HIGH, ALL)
}

@js.native
sealed trait RelationshipStatus extends js.Any
object RelationshipStatus {
  val CREATED = "CREATED".asInstanceOf[RelationshipStatus]
  val INVITED = "INVITED".asInstanceOf[RelationshipStatus]
  val DISABLED = "DISABLED".asInstanceOf[RelationshipStatus]
  val ENABLED = "ENABLED".asInstanceOf[RelationshipStatus]
  val REMOVED = "REMOVED".asInstanceOf[RelationshipStatus]
  val RESIGNED = "RESIGNED".asInstanceOf[RelationshipStatus]
  val DELETED = "DELETED".asInstanceOf[RelationshipStatus]
  val EMAIL_VERIFICATION_IN_PROGRESS = "EMAIL_VERIFICATION_IN_PROGRESS".asInstanceOf[RelationshipStatus]
  val EMAIL_VERIFICATION_FAILED = "EMAIL_VERIFICATION_FAILED".asInstanceOf[RelationshipStatus]
  val REGION_DISABLED = "REGION_DISABLED".asInstanceOf[RelationshipStatus]
  val ACCOUNT_SUSPENDED = "ACCOUNT_SUSPENDED".asInstanceOf[RelationshipStatus]
  val CANNOT_CREATE_DETECTOR_IN_ORG_MASTER = "CANNOT_CREATE_DETECTOR_IN_ORG_MASTER".asInstanceOf[RelationshipStatus]

  @inline def values: js.Array[RelationshipStatus] = js.Array(
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

@js.native
sealed trait ReportFormat extends js.Any
object ReportFormat {
  val CSV = "CSV".asInstanceOf[ReportFormat]
  val JSON = "JSON".asInstanceOf[ReportFormat]

  @inline def values: js.Array[ReportFormat] = js.Array(CSV, JSON)
}

@js.native
sealed trait ReportingErrorCode extends js.Any
object ReportingErrorCode {
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[ReportingErrorCode]
  val INVALID_PERMISSIONS = "INVALID_PERMISSIONS".asInstanceOf[ReportingErrorCode]

  @inline def values: js.Array[ReportingErrorCode] = js.Array(INTERNAL_ERROR, INVALID_PERMISSIONS)
}

@js.native
sealed trait RepositorySortBy extends js.Any
object RepositorySortBy {
  val CRITICAL = "CRITICAL".asInstanceOf[RepositorySortBy]
  val HIGH = "HIGH".asInstanceOf[RepositorySortBy]
  val ALL = "ALL".asInstanceOf[RepositorySortBy]
  val AFFECTED_IMAGES = "AFFECTED_IMAGES".asInstanceOf[RepositorySortBy]

  @inline def values: js.Array[RepositorySortBy] = js.Array(CRITICAL, HIGH, ALL, AFFECTED_IMAGES)
}

@js.native
sealed trait ResourceScanType extends js.Any
object ResourceScanType {
  val EC2 = "EC2".asInstanceOf[ResourceScanType]
  val ECR = "ECR".asInstanceOf[ResourceScanType]

  @inline def values: js.Array[ResourceScanType] = js.Array(EC2, ECR)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val AWS_EC2_INSTANCE = "AWS_EC2_INSTANCE".asInstanceOf[ResourceType]
  val AWS_ECR_CONTAINER_IMAGE = "AWS_ECR_CONTAINER_IMAGE".asInstanceOf[ResourceType]
  val AWS_ECR_REPOSITORY = "AWS_ECR_REPOSITORY".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(AWS_EC2_INSTANCE, AWS_ECR_CONTAINER_IMAGE, AWS_ECR_REPOSITORY)
}

@js.native
sealed trait ScanStatusCode extends js.Any
object ScanStatusCode {
  val ACTIVE = "ACTIVE".asInstanceOf[ScanStatusCode]
  val INACTIVE = "INACTIVE".asInstanceOf[ScanStatusCode]

  @inline def values: js.Array[ScanStatusCode] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait ScanStatusReason extends js.Any
object ScanStatusReason {
  val PENDING_INITIAL_SCAN = "PENDING_INITIAL_SCAN".asInstanceOf[ScanStatusReason]
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[ScanStatusReason]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[ScanStatusReason]
  val UNMANAGED_EC2_INSTANCE = "UNMANAGED_EC2_INSTANCE".asInstanceOf[ScanStatusReason]
  val UNSUPPORTED_OS = "UNSUPPORTED_OS".asInstanceOf[ScanStatusReason]
  val SCAN_ELIGIBILITY_EXPIRED = "SCAN_ELIGIBILITY_EXPIRED".asInstanceOf[ScanStatusReason]
  val RESOURCE_TERMINATED = "RESOURCE_TERMINATED".asInstanceOf[ScanStatusReason]
  val SUCCESSFUL = "SUCCESSFUL".asInstanceOf[ScanStatusReason]
  val NO_RESOURCES_FOUND = "NO_RESOURCES_FOUND".asInstanceOf[ScanStatusReason]
  val IMAGE_SIZE_EXCEEDED = "IMAGE_SIZE_EXCEEDED".asInstanceOf[ScanStatusReason]
  val SCAN_FREQUENCY_MANUAL = "SCAN_FREQUENCY_MANUAL".asInstanceOf[ScanStatusReason]
  val SCAN_FREQUENCY_SCAN_ON_PUSH = "SCAN_FREQUENCY_SCAN_ON_PUSH".asInstanceOf[ScanStatusReason]
  val EC2_INSTANCE_STOPPED = "EC2_INSTANCE_STOPPED".asInstanceOf[ScanStatusReason]

  @inline def values: js.Array[ScanStatusReason] = js.Array(
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

@js.native
sealed trait ScanType extends js.Any
object ScanType {
  val NETWORK = "NETWORK".asInstanceOf[ScanType]
  val PACKAGE = "PACKAGE".asInstanceOf[ScanType]

  @inline def values: js.Array[ScanType] = js.Array(NETWORK, PACKAGE)
}

@js.native
sealed trait Service extends js.Any
object Service {
  val EC2 = "EC2".asInstanceOf[Service]
  val ECR = "ECR".asInstanceOf[Service]

  @inline def values: js.Array[Service] = js.Array(EC2, ECR)
}

@js.native
sealed trait Severity extends js.Any
object Severity {
  val INFORMATIONAL = "INFORMATIONAL".asInstanceOf[Severity]
  val LOW = "LOW".asInstanceOf[Severity]
  val MEDIUM = "MEDIUM".asInstanceOf[Severity]
  val HIGH = "HIGH".asInstanceOf[Severity]
  val CRITICAL = "CRITICAL".asInstanceOf[Severity]
  val UNTRIAGED = "UNTRIAGED".asInstanceOf[Severity]

  @inline def values: js.Array[Severity] = js.Array(INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL, UNTRIAGED)
}

@js.native
sealed trait SortField extends js.Any
object SortField {
  val AWS_ACCOUNT_ID = "AWS_ACCOUNT_ID".asInstanceOf[SortField]
  val FINDING_TYPE = "FINDING_TYPE".asInstanceOf[SortField]
  val SEVERITY = "SEVERITY".asInstanceOf[SortField]
  val FIRST_OBSERVED_AT = "FIRST_OBSERVED_AT".asInstanceOf[SortField]
  val LAST_OBSERVED_AT = "LAST_OBSERVED_AT".asInstanceOf[SortField]
  val FINDING_STATUS = "FINDING_STATUS".asInstanceOf[SortField]
  val RESOURCE_TYPE = "RESOURCE_TYPE".asInstanceOf[SortField]
  val ECR_IMAGE_PUSHED_AT = "ECR_IMAGE_PUSHED_AT".asInstanceOf[SortField]
  val ECR_IMAGE_REPOSITORY_NAME = "ECR_IMAGE_REPOSITORY_NAME".asInstanceOf[SortField]
  val ECR_IMAGE_REGISTRY = "ECR_IMAGE_REGISTRY".asInstanceOf[SortField]
  val NETWORK_PROTOCOL = "NETWORK_PROTOCOL".asInstanceOf[SortField]
  val COMPONENT_TYPE = "COMPONENT_TYPE".asInstanceOf[SortField]
  val VULNERABILITY_ID = "VULNERABILITY_ID".asInstanceOf[SortField]
  val VULNERABILITY_SOURCE = "VULNERABILITY_SOURCE".asInstanceOf[SortField]
  val INSPECTOR_SCORE = "INSPECTOR_SCORE".asInstanceOf[SortField]
  val VENDOR_SEVERITY = "VENDOR_SEVERITY".asInstanceOf[SortField]

  @inline def values: js.Array[SortField] = js.Array(
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

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASC = "ASC".asInstanceOf[SortOrder]
  val DESC = "DESC".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(ASC, DESC)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val ENABLING = "ENABLING".asInstanceOf[Status]
  val ENABLED = "ENABLED".asInstanceOf[Status]
  val DISABLING = "DISABLING".asInstanceOf[Status]
  val DISABLED = "DISABLED".asInstanceOf[Status]
  val SUSPENDING = "SUSPENDING".asInstanceOf[Status]
  val SUSPENDED = "SUSPENDED".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(ENABLING, ENABLED, DISABLING, DISABLED, SUSPENDING, SUSPENDED)
}

@js.native
sealed trait StringComparison extends js.Any
object StringComparison {
  val EQUALS = "EQUALS".asInstanceOf[StringComparison]
  val PREFIX = "PREFIX".asInstanceOf[StringComparison]
  val NOT_EQUALS = "NOT_EQUALS".asInstanceOf[StringComparison]

  @inline def values: js.Array[StringComparison] = js.Array(EQUALS, PREFIX, NOT_EQUALS)
}

@js.native
sealed trait TitleSortBy extends js.Any
object TitleSortBy {
  val CRITICAL = "CRITICAL".asInstanceOf[TitleSortBy]
  val HIGH = "HIGH".asInstanceOf[TitleSortBy]
  val ALL = "ALL".asInstanceOf[TitleSortBy]

  @inline def values: js.Array[TitleSortBy] = js.Array(CRITICAL, HIGH, ALL)
}

@js.native
sealed trait UsageType extends js.Any
object UsageType {
  val EC2_INSTANCE_HOURS = "EC2_INSTANCE_HOURS".asInstanceOf[UsageType]
  val ECR_INITIAL_SCAN = "ECR_INITIAL_SCAN".asInstanceOf[UsageType]
  val ECR_RESCAN = "ECR_RESCAN".asInstanceOf[UsageType]

  @inline def values: js.Array[UsageType] = js.Array(EC2_INSTANCE_HOURS, ECR_INITIAL_SCAN, ECR_RESCAN)
}
