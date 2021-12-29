package facade.amazonaws.services.lightsail

import scalajs._

type AccessDirection = "inbound" | "outbound"
object AccessDirection {
  val inbound: "inbound" = "inbound"
  val outbound: "outbound" = "outbound"

  @inline def values = js.Array[AccessDirection](inbound, outbound)
}

type AddOnType = "AutoSnapshot"
object AddOnType {
  val AutoSnapshot: "AutoSnapshot" = "AutoSnapshot"

  @inline def values = js.Array[AddOnType](AutoSnapshot)
}

type AlarmState = "OK" | "ALARM" | "INSUFFICIENT_DATA"
object AlarmState {
  val OK: "OK" = "OK"
  val ALARM: "ALARM" = "ALARM"
  val INSUFFICIENT_DATA: "INSUFFICIENT_DATA" = "INSUFFICIENT_DATA"

  @inline def values = js.Array[AlarmState](OK, ALARM, INSUFFICIENT_DATA)
}

type AutoSnapshotStatus = "Success" | "Failed" | "InProgress" | "NotFound"
object AutoSnapshotStatus {
  val Success: "Success" = "Success"
  val Failed: "Failed" = "Failed"
  val InProgress: "InProgress" = "InProgress"
  val NotFound: "NotFound" = "NotFound"

  @inline def values = js.Array[AutoSnapshotStatus](Success, Failed, InProgress, NotFound)
}

type BehaviorEnum = "dont-cache" | "cache"
object BehaviorEnum {
  val `dont-cache`: "dont-cache" = "dont-cache"
  val cache: "cache" = "cache"

  @inline def values = js.Array[BehaviorEnum](`dont-cache`, cache)
}

type BlueprintType = "os" | "app"
object BlueprintType {
  val os: "os" = "os"
  val app: "app" = "app"

  @inline def values = js.Array[BlueprintType](os, app)
}

type CertificateStatus = "PENDING_VALIDATION" | "ISSUED" | "INACTIVE" | "EXPIRED" | "VALIDATION_TIMED_OUT" | "REVOKED" | "FAILED"
object CertificateStatus {
  val PENDING_VALIDATION: "PENDING_VALIDATION" = "PENDING_VALIDATION"
  val ISSUED: "ISSUED" = "ISSUED"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val EXPIRED: "EXPIRED" = "EXPIRED"
  val VALIDATION_TIMED_OUT: "VALIDATION_TIMED_OUT" = "VALIDATION_TIMED_OUT"
  val REVOKED: "REVOKED" = "REVOKED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[CertificateStatus](PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED, VALIDATION_TIMED_OUT, REVOKED, FAILED)
}

type CloudFormationStackRecordSourceType = "ExportSnapshotRecord"
object CloudFormationStackRecordSourceType {
  val ExportSnapshotRecord: "ExportSnapshotRecord" = "ExportSnapshotRecord"

  @inline def values = js.Array[CloudFormationStackRecordSourceType](ExportSnapshotRecord)
}

type ComparisonOperator = "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold"
object ComparisonOperator {
  val GreaterThanOrEqualToThreshold: "GreaterThanOrEqualToThreshold" = "GreaterThanOrEqualToThreshold"
  val GreaterThanThreshold: "GreaterThanThreshold" = "GreaterThanThreshold"
  val LessThanThreshold: "LessThanThreshold" = "LessThanThreshold"
  val LessThanOrEqualToThreshold: "LessThanOrEqualToThreshold" = "LessThanOrEqualToThreshold"

  @inline def values = js.Array[ComparisonOperator](GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
}

type ContactMethodStatus = "PendingVerification" | "Valid" | "Invalid"
object ContactMethodStatus {
  val PendingVerification: "PendingVerification" = "PendingVerification"
  val Valid: "Valid" = "Valid"
  val Invalid: "Invalid" = "Invalid"

  @inline def values = js.Array[ContactMethodStatus](PendingVerification, Valid, Invalid)
}

type ContactMethodVerificationProtocol = "Email"
object ContactMethodVerificationProtocol {
  val Email: "Email" = "Email"

  @inline def values = js.Array[ContactMethodVerificationProtocol](Email)
}

type ContactProtocol = "Email" | "SMS"
object ContactProtocol {
  val Email: "Email" = "Email"
  val SMS: "SMS" = "SMS"

  @inline def values = js.Array[ContactProtocol](Email, SMS)
}

type ContainerServiceDeploymentState = "ACTIVATING" | "ACTIVE" | "INACTIVE" | "FAILED"
object ContainerServiceDeploymentState {
  val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ContainerServiceDeploymentState](ACTIVATING, ACTIVE, INACTIVE, FAILED)
}

type ContainerServiceMetricName = "CPUUtilization" | "MemoryUtilization"
object ContainerServiceMetricName {
  val CPUUtilization: "CPUUtilization" = "CPUUtilization"
  val MemoryUtilization: "MemoryUtilization" = "MemoryUtilization"

  @inline def values = js.Array[ContainerServiceMetricName](CPUUtilization, MemoryUtilization)
}

type ContainerServicePowerName = "nano" | "micro" | "small" | "medium" | "large" | "xlarge"
object ContainerServicePowerName {
  val nano: "nano" = "nano"
  val micro: "micro" = "micro"
  val small: "small" = "small"
  val medium: "medium" = "medium"
  val large: "large" = "large"
  val xlarge: "xlarge" = "xlarge"

  @inline def values = js.Array[ContainerServicePowerName](nano, micro, small, medium, large, xlarge)
}

type ContainerServiceProtocol = "HTTP" | "HTTPS" | "TCP" | "UDP"
object ContainerServiceProtocol {
  val HTTP: "HTTP" = "HTTP"
  val HTTPS: "HTTPS" = "HTTPS"
  val TCP: "TCP" = "TCP"
  val UDP: "UDP" = "UDP"

  @inline def values = js.Array[ContainerServiceProtocol](HTTP, HTTPS, TCP, UDP)
}

type ContainerServiceState = "PENDING" | "READY" | "RUNNING" | "UPDATING" | "DELETING" | "DISABLED" | "DEPLOYING"
object ContainerServiceState {
  val PENDING: "PENDING" = "PENDING"
  val READY: "READY" = "READY"
  val RUNNING: "RUNNING" = "RUNNING"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val DISABLED: "DISABLED" = "DISABLED"
  val DEPLOYING: "DEPLOYING" = "DEPLOYING"

  @inline def values = js.Array[ContainerServiceState](PENDING, READY, RUNNING, UPDATING, DELETING, DISABLED, DEPLOYING)
}

type ContainerServiceStateDetailCode = "CREATING_SYSTEM_RESOURCES" | "CREATING_NETWORK_INFRASTRUCTURE" | "PROVISIONING_CERTIFICATE" | "PROVISIONING_SERVICE" | "CREATING_DEPLOYMENT" | "EVALUATING_HEALTH_CHECK" | "ACTIVATING_DEPLOYMENT" | "CERTIFICATE_LIMIT_EXCEEDED" | "UNKNOWN_ERROR"
object ContainerServiceStateDetailCode {
  val CREATING_SYSTEM_RESOURCES: "CREATING_SYSTEM_RESOURCES" = "CREATING_SYSTEM_RESOURCES"
  val CREATING_NETWORK_INFRASTRUCTURE: "CREATING_NETWORK_INFRASTRUCTURE" = "CREATING_NETWORK_INFRASTRUCTURE"
  val PROVISIONING_CERTIFICATE: "PROVISIONING_CERTIFICATE" = "PROVISIONING_CERTIFICATE"
  val PROVISIONING_SERVICE: "PROVISIONING_SERVICE" = "PROVISIONING_SERVICE"
  val CREATING_DEPLOYMENT: "CREATING_DEPLOYMENT" = "CREATING_DEPLOYMENT"
  val EVALUATING_HEALTH_CHECK: "EVALUATING_HEALTH_CHECK" = "EVALUATING_HEALTH_CHECK"
  val ACTIVATING_DEPLOYMENT: "ACTIVATING_DEPLOYMENT" = "ACTIVATING_DEPLOYMENT"
  val CERTIFICATE_LIMIT_EXCEEDED: "CERTIFICATE_LIMIT_EXCEEDED" = "CERTIFICATE_LIMIT_EXCEEDED"
  val UNKNOWN_ERROR: "UNKNOWN_ERROR" = "UNKNOWN_ERROR"

  @inline def values = js.Array[ContainerServiceStateDetailCode](
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

type DiskSnapshotState = "pending" | "completed" | "error" | "unknown"
object DiskSnapshotState {
  val pending: "pending" = "pending"
  val completed: "completed" = "completed"
  val error: "error" = "error"
  val unknown: "unknown" = "unknown"

  @inline def values = js.Array[DiskSnapshotState](pending, completed, error, unknown)
}

type DiskState = "pending" | "error" | "available" | "in-use" | "unknown"
object DiskState {
  val pending: "pending" = "pending"
  val error: "error" = "error"
  val available: "available" = "available"
  val `in-use`: "in-use" = "in-use"
  val unknown: "unknown" = "unknown"

  @inline def values = js.Array[DiskState](pending, error, available, `in-use`, unknown)
}

type DistributionMetricName = "Requests" | "BytesDownloaded" | "BytesUploaded" | "TotalErrorRate" | "Http4xxErrorRate" | "Http5xxErrorRate"
object DistributionMetricName {
  val Requests: "Requests" = "Requests"
  val BytesDownloaded: "BytesDownloaded" = "BytesDownloaded"
  val BytesUploaded: "BytesUploaded" = "BytesUploaded"
  val TotalErrorRate: "TotalErrorRate" = "TotalErrorRate"
  val Http4xxErrorRate: "Http4xxErrorRate" = "Http4xxErrorRate"
  val Http5xxErrorRate: "Http5xxErrorRate" = "Http5xxErrorRate"

  @inline def values = js.Array[DistributionMetricName](Requests, BytesDownloaded, BytesUploaded, TotalErrorRate, Http4xxErrorRate, Http5xxErrorRate)
}

type ExportSnapshotRecordSourceType = "InstanceSnapshot" | "DiskSnapshot"
object ExportSnapshotRecordSourceType {
  val InstanceSnapshot: "InstanceSnapshot" = "InstanceSnapshot"
  val DiskSnapshot: "DiskSnapshot" = "DiskSnapshot"

  @inline def values = js.Array[ExportSnapshotRecordSourceType](InstanceSnapshot, DiskSnapshot)
}

type ForwardValues = "none" | "allow-list" | "all"
object ForwardValues {
  val none: "none" = "none"
  val `allow-list`: "allow-list" = "allow-list"
  val all: "all" = "all"

  @inline def values = js.Array[ForwardValues](none, `allow-list`, all)
}

type HeaderEnum = "Accept" | "Accept-Charset" | "Accept-Datetime" | "Accept-Encoding" | "Accept-Language" | "Authorization" | "CloudFront-Forwarded-Proto" | "CloudFront-Is-Desktop-Viewer" | "CloudFront-Is-Mobile-Viewer" | "CloudFront-Is-SmartTV-Viewer" | "CloudFront-Is-Tablet-Viewer" | "CloudFront-Viewer-Country" | "Host" | "Origin" | "Referer"
object HeaderEnum {
  val Accept: "Accept" = "Accept"
  val `Accept-Charset`: "Accept-Charset" = "Accept-Charset"
  val `Accept-Datetime`: "Accept-Datetime" = "Accept-Datetime"
  val `Accept-Encoding`: "Accept-Encoding" = "Accept-Encoding"
  val `Accept-Language`: "Accept-Language" = "Accept-Language"
  val Authorization: "Authorization" = "Authorization"
  val `CloudFront-Forwarded-Proto`: "CloudFront-Forwarded-Proto" = "CloudFront-Forwarded-Proto"
  val `CloudFront-Is-Desktop-Viewer`: "CloudFront-Is-Desktop-Viewer" = "CloudFront-Is-Desktop-Viewer"
  val `CloudFront-Is-Mobile-Viewer`: "CloudFront-Is-Mobile-Viewer" = "CloudFront-Is-Mobile-Viewer"
  val `CloudFront-Is-SmartTV-Viewer`: "CloudFront-Is-SmartTV-Viewer" = "CloudFront-Is-SmartTV-Viewer"
  val `CloudFront-Is-Tablet-Viewer`: "CloudFront-Is-Tablet-Viewer" = "CloudFront-Is-Tablet-Viewer"
  val `CloudFront-Viewer-Country`: "CloudFront-Viewer-Country" = "CloudFront-Viewer-Country"
  val Host: "Host" = "Host"
  val Origin: "Origin" = "Origin"
  val Referer: "Referer" = "Referer"

  @inline def values = js.Array[HeaderEnum](
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

type InstanceAccessProtocol = "ssh" | "rdp"
object InstanceAccessProtocol {
  val ssh: "ssh" = "ssh"
  val rdp: "rdp" = "rdp"

  @inline def values = js.Array[InstanceAccessProtocol](ssh, rdp)
}

type InstanceHealthReason = "Lb.RegistrationInProgress" | "Lb.InitialHealthChecking" | "Lb.InternalError" | "Instance.ResponseCodeMismatch" | "Instance.Timeout" | "Instance.FailedHealthChecks" | "Instance.NotRegistered" | "Instance.NotInUse" | "Instance.DeregistrationInProgress" | "Instance.InvalidState" | "Instance.IpUnusable"
object InstanceHealthReason {
  val `Lb.RegistrationInProgress`: "Lb.RegistrationInProgress" = "Lb.RegistrationInProgress"
  val `Lb.InitialHealthChecking`: "Lb.InitialHealthChecking" = "Lb.InitialHealthChecking"
  val `Lb.InternalError`: "Lb.InternalError" = "Lb.InternalError"
  val `Instance.ResponseCodeMismatch`: "Instance.ResponseCodeMismatch" = "Instance.ResponseCodeMismatch"
  val `Instance.Timeout`: "Instance.Timeout" = "Instance.Timeout"
  val `Instance.FailedHealthChecks`: "Instance.FailedHealthChecks" = "Instance.FailedHealthChecks"
  val `Instance.NotRegistered`: "Instance.NotRegistered" = "Instance.NotRegistered"
  val `Instance.NotInUse`: "Instance.NotInUse" = "Instance.NotInUse"
  val `Instance.DeregistrationInProgress`: "Instance.DeregistrationInProgress" = "Instance.DeregistrationInProgress"
  val `Instance.InvalidState`: "Instance.InvalidState" = "Instance.InvalidState"
  val `Instance.IpUnusable`: "Instance.IpUnusable" = "Instance.IpUnusable"

  @inline def values = js.Array[InstanceHealthReason](
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

type InstanceHealthState = "initial" | "healthy" | "unhealthy" | "unused" | "draining" | "unavailable"
object InstanceHealthState {
  val initial: "initial" = "initial"
  val healthy: "healthy" = "healthy"
  val unhealthy: "unhealthy" = "unhealthy"
  val unused: "unused" = "unused"
  val draining: "draining" = "draining"
  val unavailable: "unavailable" = "unavailable"

  @inline def values = js.Array[InstanceHealthState](initial, healthy, unhealthy, unused, draining, unavailable)
}

type InstanceMetricName = "CPUUtilization" | "NetworkIn" | "NetworkOut" | "StatusCheckFailed" | "StatusCheckFailed_Instance" | "StatusCheckFailed_System" | "BurstCapacityTime" | "BurstCapacityPercentage"
object InstanceMetricName {
  val CPUUtilization: "CPUUtilization" = "CPUUtilization"
  val NetworkIn: "NetworkIn" = "NetworkIn"
  val NetworkOut: "NetworkOut" = "NetworkOut"
  val StatusCheckFailed: "StatusCheckFailed" = "StatusCheckFailed"
  val StatusCheckFailed_Instance: "StatusCheckFailed_Instance" = "StatusCheckFailed_Instance"
  val StatusCheckFailed_System: "StatusCheckFailed_System" = "StatusCheckFailed_System"
  val BurstCapacityTime: "BurstCapacityTime" = "BurstCapacityTime"
  val BurstCapacityPercentage: "BurstCapacityPercentage" = "BurstCapacityPercentage"

  @inline def values = js.Array[InstanceMetricName](CPUUtilization, NetworkIn, NetworkOut, StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System, BurstCapacityTime, BurstCapacityPercentage)
}

type InstancePlatform = "LINUX_UNIX" | "WINDOWS"
object InstancePlatform {
  val LINUX_UNIX: "LINUX_UNIX" = "LINUX_UNIX"
  val WINDOWS: "WINDOWS" = "WINDOWS"

  @inline def values = js.Array[InstancePlatform](LINUX_UNIX, WINDOWS)
}

type InstanceSnapshotState = "pending" | "error" | "available"
object InstanceSnapshotState {
  val pending: "pending" = "pending"
  val error: "error" = "error"
  val available: "available" = "available"

  @inline def values = js.Array[InstanceSnapshotState](pending, error, available)
}

type IpAddressType = "dualstack" | "ipv4"
object IpAddressType {
  val dualstack: "dualstack" = "dualstack"
  val ipv4: "ipv4" = "ipv4"

  @inline def values = js.Array[IpAddressType](dualstack, ipv4)
}

type LoadBalancerAttributeName = "HealthCheckPath" | "SessionStickinessEnabled" | "SessionStickiness_LB_CookieDurationSeconds"
object LoadBalancerAttributeName {
  val HealthCheckPath: "HealthCheckPath" = "HealthCheckPath"
  val SessionStickinessEnabled: "SessionStickinessEnabled" = "SessionStickinessEnabled"
  val SessionStickiness_LB_CookieDurationSeconds: "SessionStickiness_LB_CookieDurationSeconds" = "SessionStickiness_LB_CookieDurationSeconds"

  @inline def values = js.Array[LoadBalancerAttributeName](HealthCheckPath, SessionStickinessEnabled, SessionStickiness_LB_CookieDurationSeconds)
}

type LoadBalancerMetricName = "ClientTLSNegotiationErrorCount" | "HealthyHostCount" | "UnhealthyHostCount" | "HTTPCode_LB_4XX_Count" | "HTTPCode_LB_5XX_Count" | "HTTPCode_Instance_2XX_Count" | "HTTPCode_Instance_3XX_Count" | "HTTPCode_Instance_4XX_Count" | "HTTPCode_Instance_5XX_Count" | "InstanceResponseTime" | "RejectedConnectionCount" | "RequestCount"
object LoadBalancerMetricName {
  val ClientTLSNegotiationErrorCount: "ClientTLSNegotiationErrorCount" = "ClientTLSNegotiationErrorCount"
  val HealthyHostCount: "HealthyHostCount" = "HealthyHostCount"
  val UnhealthyHostCount: "UnhealthyHostCount" = "UnhealthyHostCount"
  val HTTPCode_LB_4XX_Count: "HTTPCode_LB_4XX_Count" = "HTTPCode_LB_4XX_Count"
  val HTTPCode_LB_5XX_Count: "HTTPCode_LB_5XX_Count" = "HTTPCode_LB_5XX_Count"
  val HTTPCode_Instance_2XX_Count: "HTTPCode_Instance_2XX_Count" = "HTTPCode_Instance_2XX_Count"
  val HTTPCode_Instance_3XX_Count: "HTTPCode_Instance_3XX_Count" = "HTTPCode_Instance_3XX_Count"
  val HTTPCode_Instance_4XX_Count: "HTTPCode_Instance_4XX_Count" = "HTTPCode_Instance_4XX_Count"
  val HTTPCode_Instance_5XX_Count: "HTTPCode_Instance_5XX_Count" = "HTTPCode_Instance_5XX_Count"
  val InstanceResponseTime: "InstanceResponseTime" = "InstanceResponseTime"
  val RejectedConnectionCount: "RejectedConnectionCount" = "RejectedConnectionCount"
  val RequestCount: "RequestCount" = "RequestCount"

  @inline def values = js.Array[LoadBalancerMetricName](
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

type LoadBalancerProtocol = "HTTP_HTTPS" | "HTTP"
object LoadBalancerProtocol {
  val HTTP_HTTPS: "HTTP_HTTPS" = "HTTP_HTTPS"
  val HTTP: "HTTP" = "HTTP"

  @inline def values = js.Array[LoadBalancerProtocol](HTTP_HTTPS, HTTP)
}

type LoadBalancerState = "active" | "provisioning" | "active_impaired" | "failed" | "unknown"
object LoadBalancerState {
  val active: "active" = "active"
  val provisioning: "provisioning" = "provisioning"
  val active_impaired: "active_impaired" = "active_impaired"
  val failed: "failed" = "failed"
  val unknown: "unknown" = "unknown"

  @inline def values = js.Array[LoadBalancerState](active, provisioning, active_impaired, failed, unknown)
}

type LoadBalancerTlsCertificateDomainStatus = "PENDING_VALIDATION" | "FAILED" | "SUCCESS"
object LoadBalancerTlsCertificateDomainStatus {
  val PENDING_VALIDATION: "PENDING_VALIDATION" = "PENDING_VALIDATION"
  val FAILED: "FAILED" = "FAILED"
  val SUCCESS: "SUCCESS" = "SUCCESS"

  @inline def values = js.Array[LoadBalancerTlsCertificateDomainStatus](PENDING_VALIDATION, FAILED, SUCCESS)
}

type LoadBalancerTlsCertificateFailureReason = "NO_AVAILABLE_CONTACTS" | "ADDITIONAL_VERIFICATION_REQUIRED" | "DOMAIN_NOT_ALLOWED" | "INVALID_PUBLIC_DOMAIN" | "OTHER"
object LoadBalancerTlsCertificateFailureReason {
  val NO_AVAILABLE_CONTACTS: "NO_AVAILABLE_CONTACTS" = "NO_AVAILABLE_CONTACTS"
  val ADDITIONAL_VERIFICATION_REQUIRED: "ADDITIONAL_VERIFICATION_REQUIRED" = "ADDITIONAL_VERIFICATION_REQUIRED"
  val DOMAIN_NOT_ALLOWED: "DOMAIN_NOT_ALLOWED" = "DOMAIN_NOT_ALLOWED"
  val INVALID_PUBLIC_DOMAIN: "INVALID_PUBLIC_DOMAIN" = "INVALID_PUBLIC_DOMAIN"
  val OTHER: "OTHER" = "OTHER"

  @inline def values = js.Array[LoadBalancerTlsCertificateFailureReason](NO_AVAILABLE_CONTACTS, ADDITIONAL_VERIFICATION_REQUIRED, DOMAIN_NOT_ALLOWED, INVALID_PUBLIC_DOMAIN, OTHER)
}

type LoadBalancerTlsCertificateRenewalStatus = "PENDING_AUTO_RENEWAL" | "PENDING_VALIDATION" | "SUCCESS" | "FAILED"
object LoadBalancerTlsCertificateRenewalStatus {
  val PENDING_AUTO_RENEWAL: "PENDING_AUTO_RENEWAL" = "PENDING_AUTO_RENEWAL"
  val PENDING_VALIDATION: "PENDING_VALIDATION" = "PENDING_VALIDATION"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[LoadBalancerTlsCertificateRenewalStatus](PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS, FAILED)
}

type LoadBalancerTlsCertificateRevocationReason = "UNSPECIFIED" | "KEY_COMPROMISE" | "CA_COMPROMISE" | "AFFILIATION_CHANGED" | "SUPERCEDED" | "CESSATION_OF_OPERATION" | "CERTIFICATE_HOLD" | "REMOVE_FROM_CRL" | "PRIVILEGE_WITHDRAWN" | "A_A_COMPROMISE"
object LoadBalancerTlsCertificateRevocationReason {
  val UNSPECIFIED: "UNSPECIFIED" = "UNSPECIFIED"
  val KEY_COMPROMISE: "KEY_COMPROMISE" = "KEY_COMPROMISE"
  val CA_COMPROMISE: "CA_COMPROMISE" = "CA_COMPROMISE"
  val AFFILIATION_CHANGED: "AFFILIATION_CHANGED" = "AFFILIATION_CHANGED"
  val SUPERCEDED: "SUPERCEDED" = "SUPERCEDED"
  val CESSATION_OF_OPERATION: "CESSATION_OF_OPERATION" = "CESSATION_OF_OPERATION"
  val CERTIFICATE_HOLD: "CERTIFICATE_HOLD" = "CERTIFICATE_HOLD"
  val REMOVE_FROM_CRL: "REMOVE_FROM_CRL" = "REMOVE_FROM_CRL"
  val PRIVILEGE_WITHDRAWN: "PRIVILEGE_WITHDRAWN" = "PRIVILEGE_WITHDRAWN"
  val A_A_COMPROMISE: "A_A_COMPROMISE" = "A_A_COMPROMISE"

  @inline def values = js.Array[LoadBalancerTlsCertificateRevocationReason](
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

type LoadBalancerTlsCertificateStatus = "PENDING_VALIDATION" | "ISSUED" | "INACTIVE" | "EXPIRED" | "VALIDATION_TIMED_OUT" | "REVOKED" | "FAILED" | "UNKNOWN"
object LoadBalancerTlsCertificateStatus {
  val PENDING_VALIDATION: "PENDING_VALIDATION" = "PENDING_VALIDATION"
  val ISSUED: "ISSUED" = "ISSUED"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val EXPIRED: "EXPIRED" = "EXPIRED"
  val VALIDATION_TIMED_OUT: "VALIDATION_TIMED_OUT" = "VALIDATION_TIMED_OUT"
  val REVOKED: "REVOKED" = "REVOKED"
  val FAILED: "FAILED" = "FAILED"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[LoadBalancerTlsCertificateStatus](PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED, VALIDATION_TIMED_OUT, REVOKED, FAILED, UNKNOWN)
}

type MetricName = "CPUUtilization" | "NetworkIn" | "NetworkOut" | "StatusCheckFailed" | "StatusCheckFailed_Instance" | "StatusCheckFailed_System" | "ClientTLSNegotiationErrorCount" | "HealthyHostCount" | "UnhealthyHostCount" | "HTTPCode_LB_4XX_Count" | "HTTPCode_LB_5XX_Count" | "HTTPCode_Instance_2XX_Count" | "HTTPCode_Instance_3XX_Count" | "HTTPCode_Instance_4XX_Count" | "HTTPCode_Instance_5XX_Count" | "InstanceResponseTime" | "RejectedConnectionCount" | "RequestCount" | "DatabaseConnections" | "DiskQueueDepth" | "FreeStorageSpace" | "NetworkReceiveThroughput" | "NetworkTransmitThroughput" | "BurstCapacityTime" | "BurstCapacityPercentage"
object MetricName {
  val CPUUtilization: "CPUUtilization" = "CPUUtilization"
  val NetworkIn: "NetworkIn" = "NetworkIn"
  val NetworkOut: "NetworkOut" = "NetworkOut"
  val StatusCheckFailed: "StatusCheckFailed" = "StatusCheckFailed"
  val StatusCheckFailed_Instance: "StatusCheckFailed_Instance" = "StatusCheckFailed_Instance"
  val StatusCheckFailed_System: "StatusCheckFailed_System" = "StatusCheckFailed_System"
  val ClientTLSNegotiationErrorCount: "ClientTLSNegotiationErrorCount" = "ClientTLSNegotiationErrorCount"
  val HealthyHostCount: "HealthyHostCount" = "HealthyHostCount"
  val UnhealthyHostCount: "UnhealthyHostCount" = "UnhealthyHostCount"
  val HTTPCode_LB_4XX_Count: "HTTPCode_LB_4XX_Count" = "HTTPCode_LB_4XX_Count"
  val HTTPCode_LB_5XX_Count: "HTTPCode_LB_5XX_Count" = "HTTPCode_LB_5XX_Count"
  val HTTPCode_Instance_2XX_Count: "HTTPCode_Instance_2XX_Count" = "HTTPCode_Instance_2XX_Count"
  val HTTPCode_Instance_3XX_Count: "HTTPCode_Instance_3XX_Count" = "HTTPCode_Instance_3XX_Count"
  val HTTPCode_Instance_4XX_Count: "HTTPCode_Instance_4XX_Count" = "HTTPCode_Instance_4XX_Count"
  val HTTPCode_Instance_5XX_Count: "HTTPCode_Instance_5XX_Count" = "HTTPCode_Instance_5XX_Count"
  val InstanceResponseTime: "InstanceResponseTime" = "InstanceResponseTime"
  val RejectedConnectionCount: "RejectedConnectionCount" = "RejectedConnectionCount"
  val RequestCount: "RequestCount" = "RequestCount"
  val DatabaseConnections: "DatabaseConnections" = "DatabaseConnections"
  val DiskQueueDepth: "DiskQueueDepth" = "DiskQueueDepth"
  val FreeStorageSpace: "FreeStorageSpace" = "FreeStorageSpace"
  val NetworkReceiveThroughput: "NetworkReceiveThroughput" = "NetworkReceiveThroughput"
  val NetworkTransmitThroughput: "NetworkTransmitThroughput" = "NetworkTransmitThroughput"
  val BurstCapacityTime: "BurstCapacityTime" = "BurstCapacityTime"
  val BurstCapacityPercentage: "BurstCapacityPercentage" = "BurstCapacityPercentage"

  @inline def values = js.Array[MetricName](
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

type MetricStatistic = "Minimum" | "Maximum" | "Sum" | "Average" | "SampleCount"
object MetricStatistic {
  val Minimum: "Minimum" = "Minimum"
  val Maximum: "Maximum" = "Maximum"
  val Sum: "Sum" = "Sum"
  val Average: "Average" = "Average"
  val SampleCount: "SampleCount" = "SampleCount"

  @inline def values = js.Array[MetricStatistic](Minimum, Maximum, Sum, Average, SampleCount)
}

type MetricUnit = "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None"
object MetricUnit {
  val Seconds: "Seconds" = "Seconds"
  val Microseconds: "Microseconds" = "Microseconds"
  val Milliseconds: "Milliseconds" = "Milliseconds"
  val Bytes: "Bytes" = "Bytes"
  val Kilobytes: "Kilobytes" = "Kilobytes"
  val Megabytes: "Megabytes" = "Megabytes"
  val Gigabytes: "Gigabytes" = "Gigabytes"
  val Terabytes: "Terabytes" = "Terabytes"
  val Bits: "Bits" = "Bits"
  val Kilobits: "Kilobits" = "Kilobits"
  val Megabits: "Megabits" = "Megabits"
  val Gigabits: "Gigabits" = "Gigabits"
  val Terabits: "Terabits" = "Terabits"
  val Percent: "Percent" = "Percent"
  val Count: "Count" = "Count"
  val `Bytes/Second`: "Bytes/Second" = "Bytes/Second"
  val `Kilobytes/Second`: "Kilobytes/Second" = "Kilobytes/Second"
  val `Megabytes/Second`: "Megabytes/Second" = "Megabytes/Second"
  val `Gigabytes/Second`: "Gigabytes/Second" = "Gigabytes/Second"
  val `Terabytes/Second`: "Terabytes/Second" = "Terabytes/Second"
  val `Bits/Second`: "Bits/Second" = "Bits/Second"
  val `Kilobits/Second`: "Kilobits/Second" = "Kilobits/Second"
  val `Megabits/Second`: "Megabits/Second" = "Megabits/Second"
  val `Gigabits/Second`: "Gigabits/Second" = "Gigabits/Second"
  val `Terabits/Second`: "Terabits/Second" = "Terabits/Second"
  val `Count/Second`: "Count/Second" = "Count/Second"
  val None: "None" = "None"

  @inline def values = js.Array[MetricUnit](
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

type NetworkProtocol = "tcp" | "all" | "udp" | "icmp"
object NetworkProtocol {
  val tcp: "tcp" = "tcp"
  val all: "all" = "all"
  val udp: "udp" = "udp"
  val icmp: "icmp" = "icmp"

  @inline def values = js.Array[NetworkProtocol](tcp, all, udp, icmp)
}

type OperationStatus = "NotStarted" | "Started" | "Failed" | "Completed" | "Succeeded"
object OperationStatus {
  val NotStarted: "NotStarted" = "NotStarted"
  val Started: "Started" = "Started"
  val Failed: "Failed" = "Failed"
  val Completed: "Completed" = "Completed"
  val Succeeded: "Succeeded" = "Succeeded"

  @inline def values = js.Array[OperationStatus](NotStarted, Started, Failed, Completed, Succeeded)
}

type OperationType = "DeleteKnownHostKeys" | "DeleteInstance" | "CreateInstance" | "StopInstance" | "StartInstance" | "RebootInstance" | "OpenInstancePublicPorts" | "PutInstancePublicPorts" | "CloseInstancePublicPorts" | "AllocateStaticIp" | "ReleaseStaticIp" | "AttachStaticIp" | "DetachStaticIp" | "UpdateDomainEntry" | "DeleteDomainEntry" | "CreateDomain" | "DeleteDomain" | "CreateInstanceSnapshot" | "DeleteInstanceSnapshot" | "CreateInstancesFromSnapshot" | "CreateLoadBalancer" | "DeleteLoadBalancer" | "AttachInstancesToLoadBalancer" | "DetachInstancesFromLoadBalancer" | "UpdateLoadBalancerAttribute" | "CreateLoadBalancerTlsCertificate" | "DeleteLoadBalancerTlsCertificate" | "AttachLoadBalancerTlsCertificate" | "CreateDisk" | "DeleteDisk" | "AttachDisk" | "DetachDisk" | "CreateDiskSnapshot" | "DeleteDiskSnapshot" | "CreateDiskFromSnapshot" | "CreateRelationalDatabase" | "UpdateRelationalDatabase" | "DeleteRelationalDatabase" | "CreateRelationalDatabaseFromSnapshot" |
  "CreateRelationalDatabaseSnapshot" | "DeleteRelationalDatabaseSnapshot" | "UpdateRelationalDatabaseParameters" | "StartRelationalDatabase" | "RebootRelationalDatabase" | "StopRelationalDatabase" | "EnableAddOn" | "DisableAddOn" | "PutAlarm" | "GetAlarms" | "DeleteAlarm" | "TestAlarm" | "CreateContactMethod" | "GetContactMethods" | "SendContactMethodVerification" | "DeleteContactMethod" | "CreateDistribution" | "UpdateDistribution" | "DeleteDistribution" | "ResetDistributionCache" | "AttachCertificateToDistribution" | "DetachCertificateFromDistribution" | "UpdateDistributionBundle" | "SetIpAddressType" | "CreateCertificate" | "DeleteCertificate" | "CreateContainerService" | "UpdateContainerService" | "DeleteContainerService" | "CreateContainerServiceDeployment" | "CreateContainerServiceRegistryLogin" | "RegisterContainerImage" | "DeleteContainerImage"
object OperationType {
  val DeleteKnownHostKeys: "DeleteKnownHostKeys" = "DeleteKnownHostKeys"
  val DeleteInstance: "DeleteInstance" = "DeleteInstance"
  val CreateInstance: "CreateInstance" = "CreateInstance"
  val StopInstance: "StopInstance" = "StopInstance"
  val StartInstance: "StartInstance" = "StartInstance"
  val RebootInstance: "RebootInstance" = "RebootInstance"
  val OpenInstancePublicPorts: "OpenInstancePublicPorts" = "OpenInstancePublicPorts"
  val PutInstancePublicPorts: "PutInstancePublicPorts" = "PutInstancePublicPorts"
  val CloseInstancePublicPorts: "CloseInstancePublicPorts" = "CloseInstancePublicPorts"
  val AllocateStaticIp: "AllocateStaticIp" = "AllocateStaticIp"
  val ReleaseStaticIp: "ReleaseStaticIp" = "ReleaseStaticIp"
  val AttachStaticIp: "AttachStaticIp" = "AttachStaticIp"
  val DetachStaticIp: "DetachStaticIp" = "DetachStaticIp"
  val UpdateDomainEntry: "UpdateDomainEntry" = "UpdateDomainEntry"
  val DeleteDomainEntry: "DeleteDomainEntry" = "DeleteDomainEntry"
  val CreateDomain: "CreateDomain" = "CreateDomain"
  val DeleteDomain: "DeleteDomain" = "DeleteDomain"
  val CreateInstanceSnapshot: "CreateInstanceSnapshot" = "CreateInstanceSnapshot"
  val DeleteInstanceSnapshot: "DeleteInstanceSnapshot" = "DeleteInstanceSnapshot"
  val CreateInstancesFromSnapshot: "CreateInstancesFromSnapshot" = "CreateInstancesFromSnapshot"
  val CreateLoadBalancer: "CreateLoadBalancer" = "CreateLoadBalancer"
  val DeleteLoadBalancer: "DeleteLoadBalancer" = "DeleteLoadBalancer"
  val AttachInstancesToLoadBalancer: "AttachInstancesToLoadBalancer" = "AttachInstancesToLoadBalancer"
  val DetachInstancesFromLoadBalancer: "DetachInstancesFromLoadBalancer" = "DetachInstancesFromLoadBalancer"
  val UpdateLoadBalancerAttribute: "UpdateLoadBalancerAttribute" = "UpdateLoadBalancerAttribute"
  val CreateLoadBalancerTlsCertificate: "CreateLoadBalancerTlsCertificate" = "CreateLoadBalancerTlsCertificate"
  val DeleteLoadBalancerTlsCertificate: "DeleteLoadBalancerTlsCertificate" = "DeleteLoadBalancerTlsCertificate"
  val AttachLoadBalancerTlsCertificate: "AttachLoadBalancerTlsCertificate" = "AttachLoadBalancerTlsCertificate"
  val CreateDisk: "CreateDisk" = "CreateDisk"
  val DeleteDisk: "DeleteDisk" = "DeleteDisk"
  val AttachDisk: "AttachDisk" = "AttachDisk"
  val DetachDisk: "DetachDisk" = "DetachDisk"
  val CreateDiskSnapshot: "CreateDiskSnapshot" = "CreateDiskSnapshot"
  val DeleteDiskSnapshot: "DeleteDiskSnapshot" = "DeleteDiskSnapshot"
  val CreateDiskFromSnapshot: "CreateDiskFromSnapshot" = "CreateDiskFromSnapshot"
  val CreateRelationalDatabase: "CreateRelationalDatabase" = "CreateRelationalDatabase"
  val UpdateRelationalDatabase: "UpdateRelationalDatabase" = "UpdateRelationalDatabase"
  val DeleteRelationalDatabase: "DeleteRelationalDatabase" = "DeleteRelationalDatabase"
  val CreateRelationalDatabaseFromSnapshot: "CreateRelationalDatabaseFromSnapshot" = "CreateRelationalDatabaseFromSnapshot"
  val CreateRelationalDatabaseSnapshot: "CreateRelationalDatabaseSnapshot" = "CreateRelationalDatabaseSnapshot"
  val DeleteRelationalDatabaseSnapshot: "DeleteRelationalDatabaseSnapshot" = "DeleteRelationalDatabaseSnapshot"
  val UpdateRelationalDatabaseParameters: "UpdateRelationalDatabaseParameters" = "UpdateRelationalDatabaseParameters"
  val StartRelationalDatabase: "StartRelationalDatabase" = "StartRelationalDatabase"
  val RebootRelationalDatabase: "RebootRelationalDatabase" = "RebootRelationalDatabase"
  val StopRelationalDatabase: "StopRelationalDatabase" = "StopRelationalDatabase"
  val EnableAddOn: "EnableAddOn" = "EnableAddOn"
  val DisableAddOn: "DisableAddOn" = "DisableAddOn"
  val PutAlarm: "PutAlarm" = "PutAlarm"
  val GetAlarms: "GetAlarms" = "GetAlarms"
  val DeleteAlarm: "DeleteAlarm" = "DeleteAlarm"
  val TestAlarm: "TestAlarm" = "TestAlarm"
  val CreateContactMethod: "CreateContactMethod" = "CreateContactMethod"
  val GetContactMethods: "GetContactMethods" = "GetContactMethods"
  val SendContactMethodVerification: "SendContactMethodVerification" = "SendContactMethodVerification"
  val DeleteContactMethod: "DeleteContactMethod" = "DeleteContactMethod"
  val CreateDistribution: "CreateDistribution" = "CreateDistribution"
  val UpdateDistribution: "UpdateDistribution" = "UpdateDistribution"
  val DeleteDistribution: "DeleteDistribution" = "DeleteDistribution"
  val ResetDistributionCache: "ResetDistributionCache" = "ResetDistributionCache"
  val AttachCertificateToDistribution: "AttachCertificateToDistribution" = "AttachCertificateToDistribution"
  val DetachCertificateFromDistribution: "DetachCertificateFromDistribution" = "DetachCertificateFromDistribution"
  val UpdateDistributionBundle: "UpdateDistributionBundle" = "UpdateDistributionBundle"
  val SetIpAddressType: "SetIpAddressType" = "SetIpAddressType"
  val CreateCertificate: "CreateCertificate" = "CreateCertificate"
  val DeleteCertificate: "DeleteCertificate" = "DeleteCertificate"
  val CreateContainerService: "CreateContainerService" = "CreateContainerService"
  val UpdateContainerService: "UpdateContainerService" = "UpdateContainerService"
  val DeleteContainerService: "DeleteContainerService" = "DeleteContainerService"
  val CreateContainerServiceDeployment: "CreateContainerServiceDeployment" = "CreateContainerServiceDeployment"
  val CreateContainerServiceRegistryLogin: "CreateContainerServiceRegistryLogin" = "CreateContainerServiceRegistryLogin"
  val RegisterContainerImage: "RegisterContainerImage" = "RegisterContainerImage"
  val DeleteContainerImage: "DeleteContainerImage" = "DeleteContainerImage"

  @inline def values = js.Array[OperationType](
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

type OriginProtocolPolicyEnum = "http-only" | "https-only"
object OriginProtocolPolicyEnum {
  val `http-only`: "http-only" = "http-only"
  val `https-only`: "https-only" = "https-only"

  @inline def values = js.Array[OriginProtocolPolicyEnum](`http-only`, `https-only`)
}

type PortAccessType = "Public" | "Private"
object PortAccessType {
  val Public: "Public" = "Public"
  val Private: "Private" = "Private"

  @inline def values = js.Array[PortAccessType](Public, Private)
}

type PortInfoSourceType = "DEFAULT" | "INSTANCE" | "NONE" | "CLOSED"
object PortInfoSourceType {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val INSTANCE: "INSTANCE" = "INSTANCE"
  val NONE: "NONE" = "NONE"
  val CLOSED: "CLOSED" = "CLOSED"

  @inline def values = js.Array[PortInfoSourceType](DEFAULT, INSTANCE, NONE, CLOSED)
}

type PortState = "open" | "closed"
object PortState {
  val open: "open" = "open"
  val closed: "closed" = "closed"

  @inline def values = js.Array[PortState](open, closed)
}

type RecordState = "Started" | "Succeeded" | "Failed"
object RecordState {
  val Started: "Started" = "Started"
  val Succeeded: "Succeeded" = "Succeeded"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[RecordState](Started, Succeeded, Failed)
}

type RegionName = "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-central-1" | "ca-central-1" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "ap-northeast-2"
object RegionName {
  val `us-east-1`: "us-east-1" = "us-east-1"
  val `us-east-2`: "us-east-2" = "us-east-2"
  val `us-west-1`: "us-west-1" = "us-west-1"
  val `us-west-2`: "us-west-2" = "us-west-2"
  val `eu-west-1`: "eu-west-1" = "eu-west-1"
  val `eu-west-2`: "eu-west-2" = "eu-west-2"
  val `eu-west-3`: "eu-west-3" = "eu-west-3"
  val `eu-central-1`: "eu-central-1" = "eu-central-1"
  val `ca-central-1`: "ca-central-1" = "ca-central-1"
  val `ap-south-1`: "ap-south-1" = "ap-south-1"
  val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"

  @inline def values = js.Array[RegionName](
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

type RelationalDatabaseEngine = "mysql"
object RelationalDatabaseEngine {
  val mysql: "mysql" = "mysql"

  @inline def values = js.Array[RelationalDatabaseEngine](mysql)
}

type RelationalDatabaseMetricName = "CPUUtilization" | "DatabaseConnections" | "DiskQueueDepth" | "FreeStorageSpace" | "NetworkReceiveThroughput" | "NetworkTransmitThroughput"
object RelationalDatabaseMetricName {
  val CPUUtilization: "CPUUtilization" = "CPUUtilization"
  val DatabaseConnections: "DatabaseConnections" = "DatabaseConnections"
  val DiskQueueDepth: "DiskQueueDepth" = "DiskQueueDepth"
  val FreeStorageSpace: "FreeStorageSpace" = "FreeStorageSpace"
  val NetworkReceiveThroughput: "NetworkReceiveThroughput" = "NetworkReceiveThroughput"
  val NetworkTransmitThroughput: "NetworkTransmitThroughput" = "NetworkTransmitThroughput"

  @inline def values = js.Array[RelationalDatabaseMetricName](CPUUtilization, DatabaseConnections, DiskQueueDepth, FreeStorageSpace, NetworkReceiveThroughput, NetworkTransmitThroughput)
}

type RelationalDatabasePasswordVersion = "CURRENT" | "PREVIOUS" | "PENDING"
object RelationalDatabasePasswordVersion {
  val CURRENT: "CURRENT" = "CURRENT"
  val PREVIOUS: "PREVIOUS" = "PREVIOUS"
  val PENDING: "PENDING" = "PENDING"

  @inline def values = js.Array[RelationalDatabasePasswordVersion](CURRENT, PREVIOUS, PENDING)
}

type RenewalStatus = "PendingAutoRenewal" | "PendingValidation" | "Success" | "Failed"
object RenewalStatus {
  val PendingAutoRenewal: "PendingAutoRenewal" = "PendingAutoRenewal"
  val PendingValidation: "PendingValidation" = "PendingValidation"
  val Success: "Success" = "Success"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[RenewalStatus](PendingAutoRenewal, PendingValidation, Success, Failed)
}

type ResourceType = "ContainerService" | "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | "Distribution" | "Certificate"
object ResourceType {
  val ContainerService: "ContainerService" = "ContainerService"
  val Instance: "Instance" = "Instance"
  val StaticIp: "StaticIp" = "StaticIp"
  val KeyPair: "KeyPair" = "KeyPair"
  val InstanceSnapshot: "InstanceSnapshot" = "InstanceSnapshot"
  val Domain: "Domain" = "Domain"
  val PeeredVpc: "PeeredVpc" = "PeeredVpc"
  val LoadBalancer: "LoadBalancer" = "LoadBalancer"
  val LoadBalancerTlsCertificate: "LoadBalancerTlsCertificate" = "LoadBalancerTlsCertificate"
  val Disk: "Disk" = "Disk"
  val DiskSnapshot: "DiskSnapshot" = "DiskSnapshot"
  val RelationalDatabase: "RelationalDatabase" = "RelationalDatabase"
  val RelationalDatabaseSnapshot: "RelationalDatabaseSnapshot" = "RelationalDatabaseSnapshot"
  val ExportSnapshotRecord: "ExportSnapshotRecord" = "ExportSnapshotRecord"
  val CloudFormationStackRecord: "CloudFormationStackRecord" = "CloudFormationStackRecord"
  val Alarm: "Alarm" = "Alarm"
  val ContactMethod: "ContactMethod" = "ContactMethod"
  val Distribution: "Distribution" = "Distribution"
  val Certificate: "Certificate" = "Certificate"

  @inline def values = js.Array[ResourceType](
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

type TreatMissingData = "breaching" | "notBreaching" | "ignore" | "missing"
object TreatMissingData {
  val breaching: "breaching" = "breaching"
  val notBreaching: "notBreaching" = "notBreaching"
  val ignore: "ignore" = "ignore"
  val missing: "missing" = "missing"

  @inline def values = js.Array[TreatMissingData](breaching, notBreaching, ignore, missing)
}
