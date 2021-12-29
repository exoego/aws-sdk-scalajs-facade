package facade.amazonaws.services.lightsail

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AccessDirection extends js.Any
object AccessDirection {
  val inbound = "inbound".asInstanceOf[AccessDirection]
  val outbound = "outbound".asInstanceOf[AccessDirection]

  @inline def values = js.Array(inbound, outbound)
}

@js.native
sealed trait AddOnType extends js.Any
object AddOnType {
  val AutoSnapshot = "AutoSnapshot".asInstanceOf[AddOnType]

  @inline def values = js.Array(AutoSnapshot)
}

@js.native
sealed trait AlarmState extends js.Any
object AlarmState {
  val OK = "OK".asInstanceOf[AlarmState]
  val ALARM = "ALARM".asInstanceOf[AlarmState]
  val INSUFFICIENT_DATA = "INSUFFICIENT_DATA".asInstanceOf[AlarmState]

  @inline def values = js.Array(OK, ALARM, INSUFFICIENT_DATA)
}

@js.native
sealed trait AutoSnapshotStatus extends js.Any
object AutoSnapshotStatus {
  val Success = "Success".asInstanceOf[AutoSnapshotStatus]
  val Failed = "Failed".asInstanceOf[AutoSnapshotStatus]
  val InProgress = "InProgress".asInstanceOf[AutoSnapshotStatus]
  val NotFound = "NotFound".asInstanceOf[AutoSnapshotStatus]

  @inline def values = js.Array(Success, Failed, InProgress, NotFound)
}

@js.native
sealed trait BehaviorEnum extends js.Any
object BehaviorEnum {
  val `dont-cache` = "dont-cache".asInstanceOf[BehaviorEnum]
  val cache = "cache".asInstanceOf[BehaviorEnum]

  @inline def values = js.Array(`dont-cache`, cache)
}

@js.native
sealed trait BlueprintType extends js.Any
object BlueprintType {
  val os = "os".asInstanceOf[BlueprintType]
  val app = "app".asInstanceOf[BlueprintType]

  @inline def values = js.Array(os, app)
}

@js.native
sealed trait CertificateStatus extends js.Any
object CertificateStatus {
  val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[CertificateStatus]
  val ISSUED = "ISSUED".asInstanceOf[CertificateStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[CertificateStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[CertificateStatus]
  val VALIDATION_TIMED_OUT = "VALIDATION_TIMED_OUT".asInstanceOf[CertificateStatus]
  val REVOKED = "REVOKED".asInstanceOf[CertificateStatus]
  val FAILED = "FAILED".asInstanceOf[CertificateStatus]

  @inline def values = js.Array(PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED, VALIDATION_TIMED_OUT, REVOKED, FAILED)
}

@js.native
sealed trait CloudFormationStackRecordSourceType extends js.Any
object CloudFormationStackRecordSourceType {
  val ExportSnapshotRecord = "ExportSnapshotRecord".asInstanceOf[CloudFormationStackRecordSourceType]

  @inline def values = js.Array(ExportSnapshotRecord)
}

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold".asInstanceOf[ComparisonOperator]
  val GreaterThanThreshold = "GreaterThanThreshold".asInstanceOf[ComparisonOperator]
  val LessThanThreshold = "LessThanThreshold".asInstanceOf[ComparisonOperator]
  val LessThanOrEqualToThreshold = "LessThanOrEqualToThreshold".asInstanceOf[ComparisonOperator]

  @inline def values = js.Array(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
}

@js.native
sealed trait ContactMethodStatus extends js.Any
object ContactMethodStatus {
  val PendingVerification = "PendingVerification".asInstanceOf[ContactMethodStatus]
  val Valid = "Valid".asInstanceOf[ContactMethodStatus]
  val Invalid = "Invalid".asInstanceOf[ContactMethodStatus]

  @inline def values = js.Array(PendingVerification, Valid, Invalid)
}

@js.native
sealed trait ContactMethodVerificationProtocol extends js.Any
object ContactMethodVerificationProtocol {
  val Email = "Email".asInstanceOf[ContactMethodVerificationProtocol]

  @inline def values = js.Array(Email)
}

@js.native
sealed trait ContactProtocol extends js.Any
object ContactProtocol {
  val Email = "Email".asInstanceOf[ContactProtocol]
  val SMS = "SMS".asInstanceOf[ContactProtocol]

  @inline def values = js.Array(Email, SMS)
}

@js.native
sealed trait ContainerServiceDeploymentState extends js.Any
object ContainerServiceDeploymentState {
  val ACTIVATING = "ACTIVATING".asInstanceOf[ContainerServiceDeploymentState]
  val ACTIVE = "ACTIVE".asInstanceOf[ContainerServiceDeploymentState]
  val INACTIVE = "INACTIVE".asInstanceOf[ContainerServiceDeploymentState]
  val FAILED = "FAILED".asInstanceOf[ContainerServiceDeploymentState]

  @inline def values = js.Array(ACTIVATING, ACTIVE, INACTIVE, FAILED)
}

@js.native
sealed trait ContainerServiceMetricName extends js.Any
object ContainerServiceMetricName {
  val CPUUtilization = "CPUUtilization".asInstanceOf[ContainerServiceMetricName]
  val MemoryUtilization = "MemoryUtilization".asInstanceOf[ContainerServiceMetricName]

  @inline def values = js.Array(CPUUtilization, MemoryUtilization)
}

@js.native
sealed trait ContainerServicePowerName extends js.Any
object ContainerServicePowerName {
  val nano = "nano".asInstanceOf[ContainerServicePowerName]
  val micro = "micro".asInstanceOf[ContainerServicePowerName]
  val small = "small".asInstanceOf[ContainerServicePowerName]
  val medium = "medium".asInstanceOf[ContainerServicePowerName]
  val large = "large".asInstanceOf[ContainerServicePowerName]
  val xlarge = "xlarge".asInstanceOf[ContainerServicePowerName]

  @inline def values = js.Array(nano, micro, small, medium, large, xlarge)
}

@js.native
sealed trait ContainerServiceProtocol extends js.Any
object ContainerServiceProtocol {
  val HTTP = "HTTP".asInstanceOf[ContainerServiceProtocol]
  val HTTPS = "HTTPS".asInstanceOf[ContainerServiceProtocol]
  val TCP = "TCP".asInstanceOf[ContainerServiceProtocol]
  val UDP = "UDP".asInstanceOf[ContainerServiceProtocol]

  @inline def values = js.Array(HTTP, HTTPS, TCP, UDP)
}

@js.native
sealed trait ContainerServiceState extends js.Any
object ContainerServiceState {
  val PENDING = "PENDING".asInstanceOf[ContainerServiceState]
  val READY = "READY".asInstanceOf[ContainerServiceState]
  val RUNNING = "RUNNING".asInstanceOf[ContainerServiceState]
  val UPDATING = "UPDATING".asInstanceOf[ContainerServiceState]
  val DELETING = "DELETING".asInstanceOf[ContainerServiceState]
  val DISABLED = "DISABLED".asInstanceOf[ContainerServiceState]
  val DEPLOYING = "DEPLOYING".asInstanceOf[ContainerServiceState]

  @inline def values = js.Array(PENDING, READY, RUNNING, UPDATING, DELETING, DISABLED, DEPLOYING)
}

@js.native
sealed trait ContainerServiceStateDetailCode extends js.Any
object ContainerServiceStateDetailCode {
  val CREATING_SYSTEM_RESOURCES = "CREATING_SYSTEM_RESOURCES".asInstanceOf[ContainerServiceStateDetailCode]
  val CREATING_NETWORK_INFRASTRUCTURE = "CREATING_NETWORK_INFRASTRUCTURE".asInstanceOf[ContainerServiceStateDetailCode]
  val PROVISIONING_CERTIFICATE = "PROVISIONING_CERTIFICATE".asInstanceOf[ContainerServiceStateDetailCode]
  val PROVISIONING_SERVICE = "PROVISIONING_SERVICE".asInstanceOf[ContainerServiceStateDetailCode]
  val CREATING_DEPLOYMENT = "CREATING_DEPLOYMENT".asInstanceOf[ContainerServiceStateDetailCode]
  val EVALUATING_HEALTH_CHECK = "EVALUATING_HEALTH_CHECK".asInstanceOf[ContainerServiceStateDetailCode]
  val ACTIVATING_DEPLOYMENT = "ACTIVATING_DEPLOYMENT".asInstanceOf[ContainerServiceStateDetailCode]
  val CERTIFICATE_LIMIT_EXCEEDED = "CERTIFICATE_LIMIT_EXCEEDED".asInstanceOf[ContainerServiceStateDetailCode]
  val UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[ContainerServiceStateDetailCode]

  @inline def values = js.Array(
    CREATING_SYSTEM_RESOURCES,
    CREATING_NETWORK_INFRASTRUCTURE,
    PROVISIONING_CERTIFICATE,
    PROVISIONING_SERVICE,
    CREATING_DEPLOYMENT,
    EVALUATING_HEALTH_CHECK,
    ACTIVATING_DEPLOYMENT,
    CERTIFICATE_LIMIT_EXCEEDED,
    UNKNOWN_ERROR
  )
}

@js.native
sealed trait DiskSnapshotState extends js.Any
object DiskSnapshotState {
  val pending = "pending".asInstanceOf[DiskSnapshotState]
  val completed = "completed".asInstanceOf[DiskSnapshotState]
  val error = "error".asInstanceOf[DiskSnapshotState]
  val unknown = "unknown".asInstanceOf[DiskSnapshotState]

  @inline def values = js.Array(pending, completed, error, unknown)
}

@js.native
sealed trait DiskState extends js.Any
object DiskState {
  val pending = "pending".asInstanceOf[DiskState]
  val error = "error".asInstanceOf[DiskState]
  val available = "available".asInstanceOf[DiskState]
  val `in-use` = "in-use".asInstanceOf[DiskState]
  val unknown = "unknown".asInstanceOf[DiskState]

  @inline def values = js.Array(pending, error, available, `in-use`, unknown)
}

@js.native
sealed trait DistributionMetricName extends js.Any
object DistributionMetricName {
  val Requests = "Requests".asInstanceOf[DistributionMetricName]
  val BytesDownloaded = "BytesDownloaded".asInstanceOf[DistributionMetricName]
  val BytesUploaded = "BytesUploaded".asInstanceOf[DistributionMetricName]
  val TotalErrorRate = "TotalErrorRate".asInstanceOf[DistributionMetricName]
  val Http4xxErrorRate = "Http4xxErrorRate".asInstanceOf[DistributionMetricName]
  val Http5xxErrorRate = "Http5xxErrorRate".asInstanceOf[DistributionMetricName]

  @inline def values = js.Array(Requests, BytesDownloaded, BytesUploaded, TotalErrorRate, Http4xxErrorRate, Http5xxErrorRate)
}

@js.native
sealed trait ExportSnapshotRecordSourceType extends js.Any
object ExportSnapshotRecordSourceType {
  val InstanceSnapshot = "InstanceSnapshot".asInstanceOf[ExportSnapshotRecordSourceType]
  val DiskSnapshot = "DiskSnapshot".asInstanceOf[ExportSnapshotRecordSourceType]

  @inline def values = js.Array(InstanceSnapshot, DiskSnapshot)
}

@js.native
sealed trait ForwardValues extends js.Any
object ForwardValues {
  val none = "none".asInstanceOf[ForwardValues]
  val `allow-list` = "allow-list".asInstanceOf[ForwardValues]
  val all = "all".asInstanceOf[ForwardValues]

  @inline def values = js.Array(none, `allow-list`, all)
}

@js.native
sealed trait HeaderEnum extends js.Any
object HeaderEnum {
  val Accept = "Accept".asInstanceOf[HeaderEnum]
  val `Accept-Charset` = "Accept-Charset".asInstanceOf[HeaderEnum]
  val `Accept-Datetime` = "Accept-Datetime".asInstanceOf[HeaderEnum]
  val `Accept-Encoding` = "Accept-Encoding".asInstanceOf[HeaderEnum]
  val `Accept-Language` = "Accept-Language".asInstanceOf[HeaderEnum]
  val Authorization = "Authorization".asInstanceOf[HeaderEnum]
  val `CloudFront-Forwarded-Proto` = "CloudFront-Forwarded-Proto".asInstanceOf[HeaderEnum]
  val `CloudFront-Is-Desktop-Viewer` = "CloudFront-Is-Desktop-Viewer".asInstanceOf[HeaderEnum]
  val `CloudFront-Is-Mobile-Viewer` = "CloudFront-Is-Mobile-Viewer".asInstanceOf[HeaderEnum]
  val `CloudFront-Is-SmartTV-Viewer` = "CloudFront-Is-SmartTV-Viewer".asInstanceOf[HeaderEnum]
  val `CloudFront-Is-Tablet-Viewer` = "CloudFront-Is-Tablet-Viewer".asInstanceOf[HeaderEnum]
  val `CloudFront-Viewer-Country` = "CloudFront-Viewer-Country".asInstanceOf[HeaderEnum]
  val Host = "Host".asInstanceOf[HeaderEnum]
  val Origin = "Origin".asInstanceOf[HeaderEnum]
  val Referer = "Referer".asInstanceOf[HeaderEnum]

  @inline def values = js.Array(
    Accept,
    `Accept-Charset`,
    `Accept-Datetime`,
    `Accept-Encoding`,
    `Accept-Language`,
    Authorization,
    `CloudFront-Forwarded-Proto`,
    `CloudFront-Is-Desktop-Viewer`,
    `CloudFront-Is-Mobile-Viewer`,
    `CloudFront-Is-SmartTV-Viewer`,
    `CloudFront-Is-Tablet-Viewer`,
    `CloudFront-Viewer-Country`,
    Host,
    Origin,
    Referer
  )
}

@js.native
sealed trait InstanceAccessProtocol extends js.Any
object InstanceAccessProtocol {
  val ssh = "ssh".asInstanceOf[InstanceAccessProtocol]
  val rdp = "rdp".asInstanceOf[InstanceAccessProtocol]

  @inline def values = js.Array(ssh, rdp)
}

@js.native
sealed trait InstanceHealthReason extends js.Any
object InstanceHealthReason {
  val `Lb.RegistrationInProgress` = "Lb.RegistrationInProgress".asInstanceOf[InstanceHealthReason]
  val `Lb.InitialHealthChecking` = "Lb.InitialHealthChecking".asInstanceOf[InstanceHealthReason]
  val `Lb.InternalError` = "Lb.InternalError".asInstanceOf[InstanceHealthReason]
  val `Instance.ResponseCodeMismatch` = "Instance.ResponseCodeMismatch".asInstanceOf[InstanceHealthReason]
  val `Instance.Timeout` = "Instance.Timeout".asInstanceOf[InstanceHealthReason]
  val `Instance.FailedHealthChecks` = "Instance.FailedHealthChecks".asInstanceOf[InstanceHealthReason]
  val `Instance.NotRegistered` = "Instance.NotRegistered".asInstanceOf[InstanceHealthReason]
  val `Instance.NotInUse` = "Instance.NotInUse".asInstanceOf[InstanceHealthReason]
  val `Instance.DeregistrationInProgress` = "Instance.DeregistrationInProgress".asInstanceOf[InstanceHealthReason]
  val `Instance.InvalidState` = "Instance.InvalidState".asInstanceOf[InstanceHealthReason]
  val `Instance.IpUnusable` = "Instance.IpUnusable".asInstanceOf[InstanceHealthReason]

  @inline def values = js.Array(
    `Lb.RegistrationInProgress`,
    `Lb.InitialHealthChecking`,
    `Lb.InternalError`,
    `Instance.ResponseCodeMismatch`,
    `Instance.Timeout`,
    `Instance.FailedHealthChecks`,
    `Instance.NotRegistered`,
    `Instance.NotInUse`,
    `Instance.DeregistrationInProgress`,
    `Instance.InvalidState`,
    `Instance.IpUnusable`
  )
}

@js.native
sealed trait InstanceHealthState extends js.Any
object InstanceHealthState {
  val initial = "initial".asInstanceOf[InstanceHealthState]
  val healthy = "healthy".asInstanceOf[InstanceHealthState]
  val unhealthy = "unhealthy".asInstanceOf[InstanceHealthState]
  val unused = "unused".asInstanceOf[InstanceHealthState]
  val draining = "draining".asInstanceOf[InstanceHealthState]
  val unavailable = "unavailable".asInstanceOf[InstanceHealthState]

  @inline def values = js.Array(initial, healthy, unhealthy, unused, draining, unavailable)
}

@js.native
sealed trait InstanceMetricName extends js.Any
object InstanceMetricName {
  val CPUUtilization = "CPUUtilization".asInstanceOf[InstanceMetricName]
  val NetworkIn = "NetworkIn".asInstanceOf[InstanceMetricName]
  val NetworkOut = "NetworkOut".asInstanceOf[InstanceMetricName]
  val StatusCheckFailed = "StatusCheckFailed".asInstanceOf[InstanceMetricName]
  val StatusCheckFailed_Instance = "StatusCheckFailed_Instance".asInstanceOf[InstanceMetricName]
  val StatusCheckFailed_System = "StatusCheckFailed_System".asInstanceOf[InstanceMetricName]
  val BurstCapacityTime = "BurstCapacityTime".asInstanceOf[InstanceMetricName]
  val BurstCapacityPercentage = "BurstCapacityPercentage".asInstanceOf[InstanceMetricName]

  @inline def values = js.Array(CPUUtilization, NetworkIn, NetworkOut, StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System, BurstCapacityTime, BurstCapacityPercentage)
}

@js.native
sealed trait InstancePlatform extends js.Any
object InstancePlatform {
  val LINUX_UNIX = "LINUX_UNIX".asInstanceOf[InstancePlatform]
  val WINDOWS = "WINDOWS".asInstanceOf[InstancePlatform]

  @inline def values = js.Array(LINUX_UNIX, WINDOWS)
}

@js.native
sealed trait InstanceSnapshotState extends js.Any
object InstanceSnapshotState {
  val pending = "pending".asInstanceOf[InstanceSnapshotState]
  val error = "error".asInstanceOf[InstanceSnapshotState]
  val available = "available".asInstanceOf[InstanceSnapshotState]

  @inline def values = js.Array(pending, error, available)
}

@js.native
sealed trait IpAddressType extends js.Any
object IpAddressType {
  val dualstack = "dualstack".asInstanceOf[IpAddressType]
  val ipv4 = "ipv4".asInstanceOf[IpAddressType]

  @inline def values = js.Array(dualstack, ipv4)
}

@js.native
sealed trait LoadBalancerAttributeName extends js.Any
object LoadBalancerAttributeName {
  val HealthCheckPath = "HealthCheckPath".asInstanceOf[LoadBalancerAttributeName]
  val SessionStickinessEnabled = "SessionStickinessEnabled".asInstanceOf[LoadBalancerAttributeName]
  val SessionStickiness_LB_CookieDurationSeconds = "SessionStickiness_LB_CookieDurationSeconds".asInstanceOf[LoadBalancerAttributeName]

  @inline def values = js.Array(HealthCheckPath, SessionStickinessEnabled, SessionStickiness_LB_CookieDurationSeconds)
}

@js.native
sealed trait LoadBalancerMetricName extends js.Any
object LoadBalancerMetricName {
  val ClientTLSNegotiationErrorCount = "ClientTLSNegotiationErrorCount".asInstanceOf[LoadBalancerMetricName]
  val HealthyHostCount = "HealthyHostCount".asInstanceOf[LoadBalancerMetricName]
  val UnhealthyHostCount = "UnhealthyHostCount".asInstanceOf[LoadBalancerMetricName]
  val HTTPCode_LB_4XX_Count = "HTTPCode_LB_4XX_Count".asInstanceOf[LoadBalancerMetricName]
  val HTTPCode_LB_5XX_Count = "HTTPCode_LB_5XX_Count".asInstanceOf[LoadBalancerMetricName]
  val HTTPCode_Instance_2XX_Count = "HTTPCode_Instance_2XX_Count".asInstanceOf[LoadBalancerMetricName]
  val HTTPCode_Instance_3XX_Count = "HTTPCode_Instance_3XX_Count".asInstanceOf[LoadBalancerMetricName]
  val HTTPCode_Instance_4XX_Count = "HTTPCode_Instance_4XX_Count".asInstanceOf[LoadBalancerMetricName]
  val HTTPCode_Instance_5XX_Count = "HTTPCode_Instance_5XX_Count".asInstanceOf[LoadBalancerMetricName]
  val InstanceResponseTime = "InstanceResponseTime".asInstanceOf[LoadBalancerMetricName]
  val RejectedConnectionCount = "RejectedConnectionCount".asInstanceOf[LoadBalancerMetricName]
  val RequestCount = "RequestCount".asInstanceOf[LoadBalancerMetricName]

  @inline def values = js.Array(
    ClientTLSNegotiationErrorCount,
    HealthyHostCount,
    UnhealthyHostCount,
    HTTPCode_LB_4XX_Count,
    HTTPCode_LB_5XX_Count,
    HTTPCode_Instance_2XX_Count,
    HTTPCode_Instance_3XX_Count,
    HTTPCode_Instance_4XX_Count,
    HTTPCode_Instance_5XX_Count,
    InstanceResponseTime,
    RejectedConnectionCount,
    RequestCount
  )
}

@js.native
sealed trait LoadBalancerProtocol extends js.Any
object LoadBalancerProtocol {
  val HTTP_HTTPS = "HTTP_HTTPS".asInstanceOf[LoadBalancerProtocol]
  val HTTP = "HTTP".asInstanceOf[LoadBalancerProtocol]

  @inline def values = js.Array(HTTP_HTTPS, HTTP)
}

@js.native
sealed trait LoadBalancerState extends js.Any
object LoadBalancerState {
  val active = "active".asInstanceOf[LoadBalancerState]
  val provisioning = "provisioning".asInstanceOf[LoadBalancerState]
  val active_impaired = "active_impaired".asInstanceOf[LoadBalancerState]
  val failed = "failed".asInstanceOf[LoadBalancerState]
  val unknown = "unknown".asInstanceOf[LoadBalancerState]

  @inline def values = js.Array(active, provisioning, active_impaired, failed, unknown)
}

@js.native
sealed trait LoadBalancerTlsCertificateDomainStatus extends js.Any
object LoadBalancerTlsCertificateDomainStatus {
  val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[LoadBalancerTlsCertificateDomainStatus]
  val FAILED = "FAILED".asInstanceOf[LoadBalancerTlsCertificateDomainStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[LoadBalancerTlsCertificateDomainStatus]

  @inline def values = js.Array(PENDING_VALIDATION, FAILED, SUCCESS)
}

@js.native
sealed trait LoadBalancerTlsCertificateFailureReason extends js.Any
object LoadBalancerTlsCertificateFailureReason {
  val NO_AVAILABLE_CONTACTS = "NO_AVAILABLE_CONTACTS".asInstanceOf[LoadBalancerTlsCertificateFailureReason]
  val ADDITIONAL_VERIFICATION_REQUIRED = "ADDITIONAL_VERIFICATION_REQUIRED".asInstanceOf[LoadBalancerTlsCertificateFailureReason]
  val DOMAIN_NOT_ALLOWED = "DOMAIN_NOT_ALLOWED".asInstanceOf[LoadBalancerTlsCertificateFailureReason]
  val INVALID_PUBLIC_DOMAIN = "INVALID_PUBLIC_DOMAIN".asInstanceOf[LoadBalancerTlsCertificateFailureReason]
  val OTHER = "OTHER".asInstanceOf[LoadBalancerTlsCertificateFailureReason]

  @inline def values = js.Array(NO_AVAILABLE_CONTACTS, ADDITIONAL_VERIFICATION_REQUIRED, DOMAIN_NOT_ALLOWED, INVALID_PUBLIC_DOMAIN, OTHER)
}

@js.native
sealed trait LoadBalancerTlsCertificateRenewalStatus extends js.Any
object LoadBalancerTlsCertificateRenewalStatus {
  val PENDING_AUTO_RENEWAL = "PENDING_AUTO_RENEWAL".asInstanceOf[LoadBalancerTlsCertificateRenewalStatus]
  val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[LoadBalancerTlsCertificateRenewalStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[LoadBalancerTlsCertificateRenewalStatus]
  val FAILED = "FAILED".asInstanceOf[LoadBalancerTlsCertificateRenewalStatus]

  @inline def values = js.Array(PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS, FAILED)
}

@js.native
sealed trait LoadBalancerTlsCertificateRevocationReason extends js.Any
object LoadBalancerTlsCertificateRevocationReason {
  val UNSPECIFIED = "UNSPECIFIED".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
  val KEY_COMPROMISE = "KEY_COMPROMISE".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
  val CA_COMPROMISE = "CA_COMPROMISE".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
  val AFFILIATION_CHANGED = "AFFILIATION_CHANGED".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
  val SUPERCEDED = "SUPERCEDED".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
  val CESSATION_OF_OPERATION = "CESSATION_OF_OPERATION".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
  val CERTIFICATE_HOLD = "CERTIFICATE_HOLD".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
  val REMOVE_FROM_CRL = "REMOVE_FROM_CRL".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
  val PRIVILEGE_WITHDRAWN = "PRIVILEGE_WITHDRAWN".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
  val A_A_COMPROMISE = "A_A_COMPROMISE".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]

  @inline def values = js.Array(
    UNSPECIFIED,
    KEY_COMPROMISE,
    CA_COMPROMISE,
    AFFILIATION_CHANGED,
    SUPERCEDED,
    CESSATION_OF_OPERATION,
    CERTIFICATE_HOLD,
    REMOVE_FROM_CRL,
    PRIVILEGE_WITHDRAWN,
    A_A_COMPROMISE
  )
}

@js.native
sealed trait LoadBalancerTlsCertificateStatus extends js.Any
object LoadBalancerTlsCertificateStatus {
  val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[LoadBalancerTlsCertificateStatus]
  val ISSUED = "ISSUED".asInstanceOf[LoadBalancerTlsCertificateStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[LoadBalancerTlsCertificateStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[LoadBalancerTlsCertificateStatus]
  val VALIDATION_TIMED_OUT = "VALIDATION_TIMED_OUT".asInstanceOf[LoadBalancerTlsCertificateStatus]
  val REVOKED = "REVOKED".asInstanceOf[LoadBalancerTlsCertificateStatus]
  val FAILED = "FAILED".asInstanceOf[LoadBalancerTlsCertificateStatus]
  val UNKNOWN = "UNKNOWN".asInstanceOf[LoadBalancerTlsCertificateStatus]

  @inline def values = js.Array(PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED, VALIDATION_TIMED_OUT, REVOKED, FAILED, UNKNOWN)
}

@js.native
sealed trait MetricName extends js.Any
object MetricName {
  val CPUUtilization = "CPUUtilization".asInstanceOf[MetricName]
  val NetworkIn = "NetworkIn".asInstanceOf[MetricName]
  val NetworkOut = "NetworkOut".asInstanceOf[MetricName]
  val StatusCheckFailed = "StatusCheckFailed".asInstanceOf[MetricName]
  val StatusCheckFailed_Instance = "StatusCheckFailed_Instance".asInstanceOf[MetricName]
  val StatusCheckFailed_System = "StatusCheckFailed_System".asInstanceOf[MetricName]
  val ClientTLSNegotiationErrorCount = "ClientTLSNegotiationErrorCount".asInstanceOf[MetricName]
  val HealthyHostCount = "HealthyHostCount".asInstanceOf[MetricName]
  val UnhealthyHostCount = "UnhealthyHostCount".asInstanceOf[MetricName]
  val HTTPCode_LB_4XX_Count = "HTTPCode_LB_4XX_Count".asInstanceOf[MetricName]
  val HTTPCode_LB_5XX_Count = "HTTPCode_LB_5XX_Count".asInstanceOf[MetricName]
  val HTTPCode_Instance_2XX_Count = "HTTPCode_Instance_2XX_Count".asInstanceOf[MetricName]
  val HTTPCode_Instance_3XX_Count = "HTTPCode_Instance_3XX_Count".asInstanceOf[MetricName]
  val HTTPCode_Instance_4XX_Count = "HTTPCode_Instance_4XX_Count".asInstanceOf[MetricName]
  val HTTPCode_Instance_5XX_Count = "HTTPCode_Instance_5XX_Count".asInstanceOf[MetricName]
  val InstanceResponseTime = "InstanceResponseTime".asInstanceOf[MetricName]
  val RejectedConnectionCount = "RejectedConnectionCount".asInstanceOf[MetricName]
  val RequestCount = "RequestCount".asInstanceOf[MetricName]
  val DatabaseConnections = "DatabaseConnections".asInstanceOf[MetricName]
  val DiskQueueDepth = "DiskQueueDepth".asInstanceOf[MetricName]
  val FreeStorageSpace = "FreeStorageSpace".asInstanceOf[MetricName]
  val NetworkReceiveThroughput = "NetworkReceiveThroughput".asInstanceOf[MetricName]
  val NetworkTransmitThroughput = "NetworkTransmitThroughput".asInstanceOf[MetricName]
  val BurstCapacityTime = "BurstCapacityTime".asInstanceOf[MetricName]
  val BurstCapacityPercentage = "BurstCapacityPercentage".asInstanceOf[MetricName]

  @inline def values = js.Array(
    CPUUtilization,
    NetworkIn,
    NetworkOut,
    StatusCheckFailed,
    StatusCheckFailed_Instance,
    StatusCheckFailed_System,
    ClientTLSNegotiationErrorCount,
    HealthyHostCount,
    UnhealthyHostCount,
    HTTPCode_LB_4XX_Count,
    HTTPCode_LB_5XX_Count,
    HTTPCode_Instance_2XX_Count,
    HTTPCode_Instance_3XX_Count,
    HTTPCode_Instance_4XX_Count,
    HTTPCode_Instance_5XX_Count,
    InstanceResponseTime,
    RejectedConnectionCount,
    RequestCount,
    DatabaseConnections,
    DiskQueueDepth,
    FreeStorageSpace,
    NetworkReceiveThroughput,
    NetworkTransmitThroughput,
    BurstCapacityTime,
    BurstCapacityPercentage
  )
}

@js.native
sealed trait MetricStatistic extends js.Any
object MetricStatistic {
  val Minimum = "Minimum".asInstanceOf[MetricStatistic]
  val Maximum = "Maximum".asInstanceOf[MetricStatistic]
  val Sum = "Sum".asInstanceOf[MetricStatistic]
  val Average = "Average".asInstanceOf[MetricStatistic]
  val SampleCount = "SampleCount".asInstanceOf[MetricStatistic]

  @inline def values = js.Array(Minimum, Maximum, Sum, Average, SampleCount)
}

@js.native
sealed trait MetricUnit extends js.Any
object MetricUnit {
  val Seconds = "Seconds".asInstanceOf[MetricUnit]
  val Microseconds = "Microseconds".asInstanceOf[MetricUnit]
  val Milliseconds = "Milliseconds".asInstanceOf[MetricUnit]
  val Bytes = "Bytes".asInstanceOf[MetricUnit]
  val Kilobytes = "Kilobytes".asInstanceOf[MetricUnit]
  val Megabytes = "Megabytes".asInstanceOf[MetricUnit]
  val Gigabytes = "Gigabytes".asInstanceOf[MetricUnit]
  val Terabytes = "Terabytes".asInstanceOf[MetricUnit]
  val Bits = "Bits".asInstanceOf[MetricUnit]
  val Kilobits = "Kilobits".asInstanceOf[MetricUnit]
  val Megabits = "Megabits".asInstanceOf[MetricUnit]
  val Gigabits = "Gigabits".asInstanceOf[MetricUnit]
  val Terabits = "Terabits".asInstanceOf[MetricUnit]
  val Percent = "Percent".asInstanceOf[MetricUnit]
  val Count = "Count".asInstanceOf[MetricUnit]
  val `Bytes/Second` = "Bytes/Second".asInstanceOf[MetricUnit]
  val `Kilobytes/Second` = "Kilobytes/Second".asInstanceOf[MetricUnit]
  val `Megabytes/Second` = "Megabytes/Second".asInstanceOf[MetricUnit]
  val `Gigabytes/Second` = "Gigabytes/Second".asInstanceOf[MetricUnit]
  val `Terabytes/Second` = "Terabytes/Second".asInstanceOf[MetricUnit]
  val `Bits/Second` = "Bits/Second".asInstanceOf[MetricUnit]
  val `Kilobits/Second` = "Kilobits/Second".asInstanceOf[MetricUnit]
  val `Megabits/Second` = "Megabits/Second".asInstanceOf[MetricUnit]
  val `Gigabits/Second` = "Gigabits/Second".asInstanceOf[MetricUnit]
  val `Terabits/Second` = "Terabits/Second".asInstanceOf[MetricUnit]
  val `Count/Second` = "Count/Second".asInstanceOf[MetricUnit]
  val None = "None".asInstanceOf[MetricUnit]

  @inline def values = js.Array(
    Seconds,
    Microseconds,
    Milliseconds,
    Bytes,
    Kilobytes,
    Megabytes,
    Gigabytes,
    Terabytes,
    Bits,
    Kilobits,
    Megabits,
    Gigabits,
    Terabits,
    Percent,
    Count,
    `Bytes/Second`,
    `Kilobytes/Second`,
    `Megabytes/Second`,
    `Gigabytes/Second`,
    `Terabytes/Second`,
    `Bits/Second`,
    `Kilobits/Second`,
    `Megabits/Second`,
    `Gigabits/Second`,
    `Terabits/Second`,
    `Count/Second`,
    None
  )
}

@js.native
sealed trait NetworkProtocol extends js.Any
object NetworkProtocol {
  val tcp = "tcp".asInstanceOf[NetworkProtocol]
  val all = "all".asInstanceOf[NetworkProtocol]
  val udp = "udp".asInstanceOf[NetworkProtocol]
  val icmp = "icmp".asInstanceOf[NetworkProtocol]

  @inline def values = js.Array(tcp, all, udp, icmp)
}

@js.native
sealed trait OperationStatus extends js.Any
object OperationStatus {
  val NotStarted = "NotStarted".asInstanceOf[OperationStatus]
  val Started = "Started".asInstanceOf[OperationStatus]
  val Failed = "Failed".asInstanceOf[OperationStatus]
  val Completed = "Completed".asInstanceOf[OperationStatus]
  val Succeeded = "Succeeded".asInstanceOf[OperationStatus]

  @inline def values = js.Array(NotStarted, Started, Failed, Completed, Succeeded)
}

@js.native
sealed trait OperationType extends js.Any
object OperationType {
  val DeleteKnownHostKeys = "DeleteKnownHostKeys".asInstanceOf[OperationType]
  val DeleteInstance = "DeleteInstance".asInstanceOf[OperationType]
  val CreateInstance = "CreateInstance".asInstanceOf[OperationType]
  val StopInstance = "StopInstance".asInstanceOf[OperationType]
  val StartInstance = "StartInstance".asInstanceOf[OperationType]
  val RebootInstance = "RebootInstance".asInstanceOf[OperationType]
  val OpenInstancePublicPorts = "OpenInstancePublicPorts".asInstanceOf[OperationType]
  val PutInstancePublicPorts = "PutInstancePublicPorts".asInstanceOf[OperationType]
  val CloseInstancePublicPorts = "CloseInstancePublicPorts".asInstanceOf[OperationType]
  val AllocateStaticIp = "AllocateStaticIp".asInstanceOf[OperationType]
  val ReleaseStaticIp = "ReleaseStaticIp".asInstanceOf[OperationType]
  val AttachStaticIp = "AttachStaticIp".asInstanceOf[OperationType]
  val DetachStaticIp = "DetachStaticIp".asInstanceOf[OperationType]
  val UpdateDomainEntry = "UpdateDomainEntry".asInstanceOf[OperationType]
  val DeleteDomainEntry = "DeleteDomainEntry".asInstanceOf[OperationType]
  val CreateDomain = "CreateDomain".asInstanceOf[OperationType]
  val DeleteDomain = "DeleteDomain".asInstanceOf[OperationType]
  val CreateInstanceSnapshot = "CreateInstanceSnapshot".asInstanceOf[OperationType]
  val DeleteInstanceSnapshot = "DeleteInstanceSnapshot".asInstanceOf[OperationType]
  val CreateInstancesFromSnapshot = "CreateInstancesFromSnapshot".asInstanceOf[OperationType]
  val CreateLoadBalancer = "CreateLoadBalancer".asInstanceOf[OperationType]
  val DeleteLoadBalancer = "DeleteLoadBalancer".asInstanceOf[OperationType]
  val AttachInstancesToLoadBalancer = "AttachInstancesToLoadBalancer".asInstanceOf[OperationType]
  val DetachInstancesFromLoadBalancer = "DetachInstancesFromLoadBalancer".asInstanceOf[OperationType]
  val UpdateLoadBalancerAttribute = "UpdateLoadBalancerAttribute".asInstanceOf[OperationType]
  val CreateLoadBalancerTlsCertificate = "CreateLoadBalancerTlsCertificate".asInstanceOf[OperationType]
  val DeleteLoadBalancerTlsCertificate = "DeleteLoadBalancerTlsCertificate".asInstanceOf[OperationType]
  val AttachLoadBalancerTlsCertificate = "AttachLoadBalancerTlsCertificate".asInstanceOf[OperationType]
  val CreateDisk = "CreateDisk".asInstanceOf[OperationType]
  val DeleteDisk = "DeleteDisk".asInstanceOf[OperationType]
  val AttachDisk = "AttachDisk".asInstanceOf[OperationType]
  val DetachDisk = "DetachDisk".asInstanceOf[OperationType]
  val CreateDiskSnapshot = "CreateDiskSnapshot".asInstanceOf[OperationType]
  val DeleteDiskSnapshot = "DeleteDiskSnapshot".asInstanceOf[OperationType]
  val CreateDiskFromSnapshot = "CreateDiskFromSnapshot".asInstanceOf[OperationType]
  val CreateRelationalDatabase = "CreateRelationalDatabase".asInstanceOf[OperationType]
  val UpdateRelationalDatabase = "UpdateRelationalDatabase".asInstanceOf[OperationType]
  val DeleteRelationalDatabase = "DeleteRelationalDatabase".asInstanceOf[OperationType]
  val CreateRelationalDatabaseFromSnapshot = "CreateRelationalDatabaseFromSnapshot".asInstanceOf[OperationType]
  val CreateRelationalDatabaseSnapshot = "CreateRelationalDatabaseSnapshot".asInstanceOf[OperationType]
  val DeleteRelationalDatabaseSnapshot = "DeleteRelationalDatabaseSnapshot".asInstanceOf[OperationType]
  val UpdateRelationalDatabaseParameters = "UpdateRelationalDatabaseParameters".asInstanceOf[OperationType]
  val StartRelationalDatabase = "StartRelationalDatabase".asInstanceOf[OperationType]
  val RebootRelationalDatabase = "RebootRelationalDatabase".asInstanceOf[OperationType]
  val StopRelationalDatabase = "StopRelationalDatabase".asInstanceOf[OperationType]
  val EnableAddOn = "EnableAddOn".asInstanceOf[OperationType]
  val DisableAddOn = "DisableAddOn".asInstanceOf[OperationType]
  val PutAlarm = "PutAlarm".asInstanceOf[OperationType]
  val GetAlarms = "GetAlarms".asInstanceOf[OperationType]
  val DeleteAlarm = "DeleteAlarm".asInstanceOf[OperationType]
  val TestAlarm = "TestAlarm".asInstanceOf[OperationType]
  val CreateContactMethod = "CreateContactMethod".asInstanceOf[OperationType]
  val GetContactMethods = "GetContactMethods".asInstanceOf[OperationType]
  val SendContactMethodVerification = "SendContactMethodVerification".asInstanceOf[OperationType]
  val DeleteContactMethod = "DeleteContactMethod".asInstanceOf[OperationType]
  val CreateDistribution = "CreateDistribution".asInstanceOf[OperationType]
  val UpdateDistribution = "UpdateDistribution".asInstanceOf[OperationType]
  val DeleteDistribution = "DeleteDistribution".asInstanceOf[OperationType]
  val ResetDistributionCache = "ResetDistributionCache".asInstanceOf[OperationType]
  val AttachCertificateToDistribution = "AttachCertificateToDistribution".asInstanceOf[OperationType]
  val DetachCertificateFromDistribution = "DetachCertificateFromDistribution".asInstanceOf[OperationType]
  val UpdateDistributionBundle = "UpdateDistributionBundle".asInstanceOf[OperationType]
  val SetIpAddressType = "SetIpAddressType".asInstanceOf[OperationType]
  val CreateCertificate = "CreateCertificate".asInstanceOf[OperationType]
  val DeleteCertificate = "DeleteCertificate".asInstanceOf[OperationType]
  val CreateContainerService = "CreateContainerService".asInstanceOf[OperationType]
  val UpdateContainerService = "UpdateContainerService".asInstanceOf[OperationType]
  val DeleteContainerService = "DeleteContainerService".asInstanceOf[OperationType]
  val CreateContainerServiceDeployment = "CreateContainerServiceDeployment".asInstanceOf[OperationType]
  val CreateContainerServiceRegistryLogin = "CreateContainerServiceRegistryLogin".asInstanceOf[OperationType]
  val RegisterContainerImage = "RegisterContainerImage".asInstanceOf[OperationType]
  val DeleteContainerImage = "DeleteContainerImage".asInstanceOf[OperationType]

  @inline def values = js.Array(
    DeleteKnownHostKeys,
    DeleteInstance,
    CreateInstance,
    StopInstance,
    StartInstance,
    RebootInstance,
    OpenInstancePublicPorts,
    PutInstancePublicPorts,
    CloseInstancePublicPorts,
    AllocateStaticIp,
    ReleaseStaticIp,
    AttachStaticIp,
    DetachStaticIp,
    UpdateDomainEntry,
    DeleteDomainEntry,
    CreateDomain,
    DeleteDomain,
    CreateInstanceSnapshot,
    DeleteInstanceSnapshot,
    CreateInstancesFromSnapshot,
    CreateLoadBalancer,
    DeleteLoadBalancer,
    AttachInstancesToLoadBalancer,
    DetachInstancesFromLoadBalancer,
    UpdateLoadBalancerAttribute,
    CreateLoadBalancerTlsCertificate,
    DeleteLoadBalancerTlsCertificate,
    AttachLoadBalancerTlsCertificate,
    CreateDisk,
    DeleteDisk,
    AttachDisk,
    DetachDisk,
    CreateDiskSnapshot,
    DeleteDiskSnapshot,
    CreateDiskFromSnapshot,
    CreateRelationalDatabase,
    UpdateRelationalDatabase,
    DeleteRelationalDatabase,
    CreateRelationalDatabaseFromSnapshot,
    CreateRelationalDatabaseSnapshot,
    DeleteRelationalDatabaseSnapshot,
    UpdateRelationalDatabaseParameters,
    StartRelationalDatabase,
    RebootRelationalDatabase,
    StopRelationalDatabase,
    EnableAddOn,
    DisableAddOn,
    PutAlarm,
    GetAlarms,
    DeleteAlarm,
    TestAlarm,
    CreateContactMethod,
    GetContactMethods,
    SendContactMethodVerification,
    DeleteContactMethod,
    CreateDistribution,
    UpdateDistribution,
    DeleteDistribution,
    ResetDistributionCache,
    AttachCertificateToDistribution,
    DetachCertificateFromDistribution,
    UpdateDistributionBundle,
    SetIpAddressType,
    CreateCertificate,
    DeleteCertificate,
    CreateContainerService,
    UpdateContainerService,
    DeleteContainerService,
    CreateContainerServiceDeployment,
    CreateContainerServiceRegistryLogin,
    RegisterContainerImage,
    DeleteContainerImage
  )
}

@js.native
sealed trait OriginProtocolPolicyEnum extends js.Any
object OriginProtocolPolicyEnum {
  val `http-only` = "http-only".asInstanceOf[OriginProtocolPolicyEnum]
  val `https-only` = "https-only".asInstanceOf[OriginProtocolPolicyEnum]

  @inline def values = js.Array(`http-only`, `https-only`)
}

@js.native
sealed trait PortAccessType extends js.Any
object PortAccessType {
  val Public = "Public".asInstanceOf[PortAccessType]
  val Private = "Private".asInstanceOf[PortAccessType]

  @inline def values = js.Array(Public, Private)
}

@js.native
sealed trait PortInfoSourceType extends js.Any
object PortInfoSourceType {
  val DEFAULT = "DEFAULT".asInstanceOf[PortInfoSourceType]
  val INSTANCE = "INSTANCE".asInstanceOf[PortInfoSourceType]
  val NONE = "NONE".asInstanceOf[PortInfoSourceType]
  val CLOSED = "CLOSED".asInstanceOf[PortInfoSourceType]

  @inline def values = js.Array(DEFAULT, INSTANCE, NONE, CLOSED)
}

@js.native
sealed trait PortState extends js.Any
object PortState {
  val open = "open".asInstanceOf[PortState]
  val closed = "closed".asInstanceOf[PortState]

  @inline def values = js.Array(open, closed)
}

@js.native
sealed trait RecordState extends js.Any
object RecordState {
  val Started = "Started".asInstanceOf[RecordState]
  val Succeeded = "Succeeded".asInstanceOf[RecordState]
  val Failed = "Failed".asInstanceOf[RecordState]

  @inline def values = js.Array(Started, Succeeded, Failed)
}

@js.native
sealed trait RegionName extends js.Any
object RegionName {
  val `us-east-1` = "us-east-1".asInstanceOf[RegionName]
  val `us-east-2` = "us-east-2".asInstanceOf[RegionName]
  val `us-west-1` = "us-west-1".asInstanceOf[RegionName]
  val `us-west-2` = "us-west-2".asInstanceOf[RegionName]
  val `eu-west-1` = "eu-west-1".asInstanceOf[RegionName]
  val `eu-west-2` = "eu-west-2".asInstanceOf[RegionName]
  val `eu-west-3` = "eu-west-3".asInstanceOf[RegionName]
  val `eu-central-1` = "eu-central-1".asInstanceOf[RegionName]
  val `ca-central-1` = "ca-central-1".asInstanceOf[RegionName]
  val `ap-south-1` = "ap-south-1".asInstanceOf[RegionName]
  val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[RegionName]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[RegionName]
  val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[RegionName]
  val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[RegionName]

  @inline def values = js.Array(
    `us-east-1`,
    `us-east-2`,
    `us-west-1`,
    `us-west-2`,
    `eu-west-1`,
    `eu-west-2`,
    `eu-west-3`,
    `eu-central-1`,
    `ca-central-1`,
    `ap-south-1`,
    `ap-southeast-1`,
    `ap-southeast-2`,
    `ap-northeast-1`,
    `ap-northeast-2`
  )
}

@js.native
sealed trait RelationalDatabaseEngine extends js.Any
object RelationalDatabaseEngine {
  val mysql = "mysql".asInstanceOf[RelationalDatabaseEngine]

  @inline def values = js.Array(mysql)
}

@js.native
sealed trait RelationalDatabaseMetricName extends js.Any
object RelationalDatabaseMetricName {
  val CPUUtilization = "CPUUtilization".asInstanceOf[RelationalDatabaseMetricName]
  val DatabaseConnections = "DatabaseConnections".asInstanceOf[RelationalDatabaseMetricName]
  val DiskQueueDepth = "DiskQueueDepth".asInstanceOf[RelationalDatabaseMetricName]
  val FreeStorageSpace = "FreeStorageSpace".asInstanceOf[RelationalDatabaseMetricName]
  val NetworkReceiveThroughput = "NetworkReceiveThroughput".asInstanceOf[RelationalDatabaseMetricName]
  val NetworkTransmitThroughput = "NetworkTransmitThroughput".asInstanceOf[RelationalDatabaseMetricName]

  @inline def values = js.Array(CPUUtilization, DatabaseConnections, DiskQueueDepth, FreeStorageSpace, NetworkReceiveThroughput, NetworkTransmitThroughput)
}

@js.native
sealed trait RelationalDatabasePasswordVersion extends js.Any
object RelationalDatabasePasswordVersion {
  val CURRENT = "CURRENT".asInstanceOf[RelationalDatabasePasswordVersion]
  val PREVIOUS = "PREVIOUS".asInstanceOf[RelationalDatabasePasswordVersion]
  val PENDING = "PENDING".asInstanceOf[RelationalDatabasePasswordVersion]

  @inline def values = js.Array(CURRENT, PREVIOUS, PENDING)
}

@js.native
sealed trait RenewalStatus extends js.Any
object RenewalStatus {
  val PendingAutoRenewal = "PendingAutoRenewal".asInstanceOf[RenewalStatus]
  val PendingValidation = "PendingValidation".asInstanceOf[RenewalStatus]
  val Success = "Success".asInstanceOf[RenewalStatus]
  val Failed = "Failed".asInstanceOf[RenewalStatus]

  @inline def values = js.Array(PendingAutoRenewal, PendingValidation, Success, Failed)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val ContainerService = "ContainerService".asInstanceOf[ResourceType]
  val Instance = "Instance".asInstanceOf[ResourceType]
  val StaticIp = "StaticIp".asInstanceOf[ResourceType]
  val KeyPair = "KeyPair".asInstanceOf[ResourceType]
  val InstanceSnapshot = "InstanceSnapshot".asInstanceOf[ResourceType]
  val Domain = "Domain".asInstanceOf[ResourceType]
  val PeeredVpc = "PeeredVpc".asInstanceOf[ResourceType]
  val LoadBalancer = "LoadBalancer".asInstanceOf[ResourceType]
  val LoadBalancerTlsCertificate = "LoadBalancerTlsCertificate".asInstanceOf[ResourceType]
  val Disk = "Disk".asInstanceOf[ResourceType]
  val DiskSnapshot = "DiskSnapshot".asInstanceOf[ResourceType]
  val RelationalDatabase = "RelationalDatabase".asInstanceOf[ResourceType]
  val RelationalDatabaseSnapshot = "RelationalDatabaseSnapshot".asInstanceOf[ResourceType]
  val ExportSnapshotRecord = "ExportSnapshotRecord".asInstanceOf[ResourceType]
  val CloudFormationStackRecord = "CloudFormationStackRecord".asInstanceOf[ResourceType]
  val Alarm = "Alarm".asInstanceOf[ResourceType]
  val ContactMethod = "ContactMethod".asInstanceOf[ResourceType]
  val Distribution = "Distribution".asInstanceOf[ResourceType]
  val Certificate = "Certificate".asInstanceOf[ResourceType]

  @inline def values = js.Array(
    ContainerService,
    Instance,
    StaticIp,
    KeyPair,
    InstanceSnapshot,
    Domain,
    PeeredVpc,
    LoadBalancer,
    LoadBalancerTlsCertificate,
    Disk,
    DiskSnapshot,
    RelationalDatabase,
    RelationalDatabaseSnapshot,
    ExportSnapshotRecord,
    CloudFormationStackRecord,
    Alarm,
    ContactMethod,
    Distribution,
    Certificate
  )
}

@js.native
sealed trait TreatMissingData extends js.Any
object TreatMissingData {
  val breaching = "breaching".asInstanceOf[TreatMissingData]
  val notBreaching = "notBreaching".asInstanceOf[TreatMissingData]
  val ignore = "ignore".asInstanceOf[TreatMissingData]
  val missing = "missing".asInstanceOf[TreatMissingData]

  @inline def values = js.Array(breaching, notBreaching, ignore, missing)
}
