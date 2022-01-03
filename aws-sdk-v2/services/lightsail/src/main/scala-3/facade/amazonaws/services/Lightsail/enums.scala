package facade.amazonaws.services.lightsail

import scalajs.js

type AccessDirection = "inbound" | "outbound"
object AccessDirection {
  inline val inbound: "inbound" = "inbound"
  inline val outbound: "outbound" = "outbound"

  inline def values: js.Array[AccessDirection] = js.Array(inbound, outbound)
}

type AccessType = "public" | "private"
object AccessType {
  inline val `public`: "public" = "public"
  inline val `private`: "private" = "private"

  inline def values: js.Array[AccessType] = js.Array(`public`, `private`)
}

type AddOnType = "AutoSnapshot"
object AddOnType {
  inline val AutoSnapshot: "AutoSnapshot" = "AutoSnapshot"

  inline def values: js.Array[AddOnType] = js.Array(AutoSnapshot)
}

type AlarmState = "OK" | "ALARM" | "INSUFFICIENT_DATA"
object AlarmState {
  inline val OK: "OK" = "OK"
  inline val ALARM: "ALARM" = "ALARM"
  inline val INSUFFICIENT_DATA: "INSUFFICIENT_DATA" = "INSUFFICIENT_DATA"

  inline def values: js.Array[AlarmState] = js.Array(OK, ALARM, INSUFFICIENT_DATA)
}

type AutoSnapshotStatus = "Success" | "Failed" | "InProgress" | "NotFound"
object AutoSnapshotStatus {
  inline val Success: "Success" = "Success"
  inline val Failed: "Failed" = "Failed"
  inline val InProgress: "InProgress" = "InProgress"
  inline val NotFound: "NotFound" = "NotFound"

  inline def values: js.Array[AutoSnapshotStatus] = js.Array(Success, Failed, InProgress, NotFound)
}

type BehaviorEnum = "dont-cache" | "cache"
object BehaviorEnum {
  inline val `dont-cache`: "dont-cache" = "dont-cache"
  inline val cache: "cache" = "cache"

  inline def values: js.Array[BehaviorEnum] = js.Array(`dont-cache`, cache)
}

type BlueprintType = "os" | "app"
object BlueprintType {
  inline val os: "os" = "os"
  inline val app: "app" = "app"

  inline def values: js.Array[BlueprintType] = js.Array(os, app)
}

type BucketMetricName = "BucketSizeBytes" | "NumberOfObjects"
object BucketMetricName {
  inline val BucketSizeBytes: "BucketSizeBytes" = "BucketSizeBytes"
  inline val NumberOfObjects: "NumberOfObjects" = "NumberOfObjects"

  inline def values: js.Array[BucketMetricName] = js.Array(BucketSizeBytes, NumberOfObjects)
}

type CertificateStatus = "PENDING_VALIDATION" | "ISSUED" | "INACTIVE" | "EXPIRED" | "VALIDATION_TIMED_OUT" | "REVOKED" | "FAILED"
object CertificateStatus {
  inline val PENDING_VALIDATION: "PENDING_VALIDATION" = "PENDING_VALIDATION"
  inline val ISSUED: "ISSUED" = "ISSUED"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"
  inline val VALIDATION_TIMED_OUT: "VALIDATION_TIMED_OUT" = "VALIDATION_TIMED_OUT"
  inline val REVOKED: "REVOKED" = "REVOKED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[CertificateStatus] = js.Array(PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED, VALIDATION_TIMED_OUT, REVOKED, FAILED)
}

type CloudFormationStackRecordSourceType = "ExportSnapshotRecord"
object CloudFormationStackRecordSourceType {
  inline val ExportSnapshotRecord: "ExportSnapshotRecord" = "ExportSnapshotRecord"

  inline def values: js.Array[CloudFormationStackRecordSourceType] = js.Array(ExportSnapshotRecord)
}

type ComparisonOperator = "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold"
object ComparisonOperator {
  inline val GreaterThanOrEqualToThreshold: "GreaterThanOrEqualToThreshold" = "GreaterThanOrEqualToThreshold"
  inline val GreaterThanThreshold: "GreaterThanThreshold" = "GreaterThanThreshold"
  inline val LessThanThreshold: "LessThanThreshold" = "LessThanThreshold"
  inline val LessThanOrEqualToThreshold: "LessThanOrEqualToThreshold" = "LessThanOrEqualToThreshold"

  inline def values: js.Array[ComparisonOperator] = js.Array(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
}

type ContactMethodStatus = "PendingVerification" | "Valid" | "Invalid"
object ContactMethodStatus {
  inline val PendingVerification: "PendingVerification" = "PendingVerification"
  inline val Valid: "Valid" = "Valid"
  inline val Invalid: "Invalid" = "Invalid"

  inline def values: js.Array[ContactMethodStatus] = js.Array(PendingVerification, Valid, Invalid)
}

type ContactMethodVerificationProtocol = "Email"
object ContactMethodVerificationProtocol {
  inline val Email: "Email" = "Email"

  inline def values: js.Array[ContactMethodVerificationProtocol] = js.Array(Email)
}

type ContactProtocol = "Email" | "SMS"
object ContactProtocol {
  inline val Email: "Email" = "Email"
  inline val SMS: "SMS" = "SMS"

  inline def values: js.Array[ContactProtocol] = js.Array(Email, SMS)
}

type ContainerServiceDeploymentState = "ACTIVATING" | "ACTIVE" | "INACTIVE" | "FAILED"
object ContainerServiceDeploymentState {
  inline val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ContainerServiceDeploymentState] = js.Array(ACTIVATING, ACTIVE, INACTIVE, FAILED)
}

type ContainerServiceMetricName = "CPUUtilization" | "MemoryUtilization"
object ContainerServiceMetricName {
  inline val CPUUtilization: "CPUUtilization" = "CPUUtilization"
  inline val MemoryUtilization: "MemoryUtilization" = "MemoryUtilization"

  inline def values: js.Array[ContainerServiceMetricName] = js.Array(CPUUtilization, MemoryUtilization)
}

type ContainerServicePowerName = "nano" | "micro" | "small" | "medium" | "large" | "xlarge"
object ContainerServicePowerName {
  inline val nano: "nano" = "nano"
  inline val micro: "micro" = "micro"
  inline val small: "small" = "small"
  inline val medium: "medium" = "medium"
  inline val large: "large" = "large"
  inline val xlarge: "xlarge" = "xlarge"

  inline def values: js.Array[ContainerServicePowerName] = js.Array(nano, micro, small, medium, large, xlarge)
}

type ContainerServiceProtocol = "HTTP" | "HTTPS" | "TCP" | "UDP"
object ContainerServiceProtocol {
  inline val HTTP: "HTTP" = "HTTP"
  inline val HTTPS: "HTTPS" = "HTTPS"
  inline val TCP: "TCP" = "TCP"
  inline val UDP: "UDP" = "UDP"

  inline def values: js.Array[ContainerServiceProtocol] = js.Array(HTTP, HTTPS, TCP, UDP)
}

type ContainerServiceState = "PENDING" | "READY" | "RUNNING" | "UPDATING" | "DELETING" | "DISABLED" | "DEPLOYING"
object ContainerServiceState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val READY: "READY" = "READY"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val DEPLOYING: "DEPLOYING" = "DEPLOYING"

  inline def values: js.Array[ContainerServiceState] = js.Array(PENDING, READY, RUNNING, UPDATING, DELETING, DISABLED, DEPLOYING)
}

type ContainerServiceStateDetailCode = "CREATING_SYSTEM_RESOURCES" | "CREATING_NETWORK_INFRASTRUCTURE" | "PROVISIONING_CERTIFICATE" | "PROVISIONING_SERVICE" | "CREATING_DEPLOYMENT" | "EVALUATING_HEALTH_CHECK" | "ACTIVATING_DEPLOYMENT" | "CERTIFICATE_LIMIT_EXCEEDED" | "UNKNOWN_ERROR"
object ContainerServiceStateDetailCode {
  inline val CREATING_SYSTEM_RESOURCES: "CREATING_SYSTEM_RESOURCES" = "CREATING_SYSTEM_RESOURCES"
  inline val CREATING_NETWORK_INFRASTRUCTURE: "CREATING_NETWORK_INFRASTRUCTURE" = "CREATING_NETWORK_INFRASTRUCTURE"
  inline val PROVISIONING_CERTIFICATE: "PROVISIONING_CERTIFICATE" = "PROVISIONING_CERTIFICATE"
  inline val PROVISIONING_SERVICE: "PROVISIONING_SERVICE" = "PROVISIONING_SERVICE"
  inline val CREATING_DEPLOYMENT: "CREATING_DEPLOYMENT" = "CREATING_DEPLOYMENT"
  inline val EVALUATING_HEALTH_CHECK: "EVALUATING_HEALTH_CHECK" = "EVALUATING_HEALTH_CHECK"
  inline val ACTIVATING_DEPLOYMENT: "ACTIVATING_DEPLOYMENT" = "ACTIVATING_DEPLOYMENT"
  inline val CERTIFICATE_LIMIT_EXCEEDED: "CERTIFICATE_LIMIT_EXCEEDED" = "CERTIFICATE_LIMIT_EXCEEDED"
  inline val UNKNOWN_ERROR: "UNKNOWN_ERROR" = "UNKNOWN_ERROR"

  inline def values: js.Array[ContainerServiceStateDetailCode] = js.Array(
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
  inline val pending: "pending" = "pending"
  inline val completed: "completed" = "completed"
  inline val error: "error" = "error"
  inline val unknown: "unknown" = "unknown"

  inline def values: js.Array[DiskSnapshotState] = js.Array(pending, completed, error, unknown)
}

type DiskState = "pending" | "error" | "available" | "in-use" | "unknown"
object DiskState {
  inline val pending: "pending" = "pending"
  inline val error: "error" = "error"
  inline val available: "available" = "available"
  inline val `in-use`: "in-use" = "in-use"
  inline val unknown: "unknown" = "unknown"

  inline def values: js.Array[DiskState] = js.Array(pending, error, available, `in-use`, unknown)
}

type DistributionMetricName = "Requests" | "BytesDownloaded" | "BytesUploaded" | "TotalErrorRate" | "Http4xxErrorRate" | "Http5xxErrorRate"
object DistributionMetricName {
  inline val Requests: "Requests" = "Requests"
  inline val BytesDownloaded: "BytesDownloaded" = "BytesDownloaded"
  inline val BytesUploaded: "BytesUploaded" = "BytesUploaded"
  inline val TotalErrorRate: "TotalErrorRate" = "TotalErrorRate"
  inline val Http4xxErrorRate: "Http4xxErrorRate" = "Http4xxErrorRate"
  inline val Http5xxErrorRate: "Http5xxErrorRate" = "Http5xxErrorRate"

  inline def values: js.Array[DistributionMetricName] = js.Array(Requests, BytesDownloaded, BytesUploaded, TotalErrorRate, Http4xxErrorRate, Http5xxErrorRate)
}

type ExportSnapshotRecordSourceType = "InstanceSnapshot" | "DiskSnapshot"
object ExportSnapshotRecordSourceType {
  inline val InstanceSnapshot: "InstanceSnapshot" = "InstanceSnapshot"
  inline val DiskSnapshot: "DiskSnapshot" = "DiskSnapshot"

  inline def values: js.Array[ExportSnapshotRecordSourceType] = js.Array(InstanceSnapshot, DiskSnapshot)
}

type ForwardValues = "none" | "allow-list" | "all"
object ForwardValues {
  inline val none: "none" = "none"
  inline val `allow-list`: "allow-list" = "allow-list"
  inline val all: "all" = "all"

  inline def values: js.Array[ForwardValues] = js.Array(none, `allow-list`, all)
}

type HeaderEnum = "Accept" | "Accept-Charset" | "Accept-Datetime" | "Accept-Encoding" | "Accept-Language" | "Authorization" | "CloudFront-Forwarded-Proto" | "CloudFront-Is-Desktop-Viewer" | "CloudFront-Is-Mobile-Viewer" | "CloudFront-Is-SmartTV-Viewer" | "CloudFront-Is-Tablet-Viewer" | "CloudFront-Viewer-Country" | "Host" | "Origin" | "Referer"
object HeaderEnum {
  inline val Accept: "Accept" = "Accept"
  inline val `Accept-Charset`: "Accept-Charset" = "Accept-Charset"
  inline val `Accept-Datetime`: "Accept-Datetime" = "Accept-Datetime"
  inline val `Accept-Encoding`: "Accept-Encoding" = "Accept-Encoding"
  inline val `Accept-Language`: "Accept-Language" = "Accept-Language"
  inline val Authorization: "Authorization" = "Authorization"
  inline val `CloudFront-Forwarded-Proto`: "CloudFront-Forwarded-Proto" = "CloudFront-Forwarded-Proto"
  inline val `CloudFront-Is-Desktop-Viewer`: "CloudFront-Is-Desktop-Viewer" = "CloudFront-Is-Desktop-Viewer"
  inline val `CloudFront-Is-Mobile-Viewer`: "CloudFront-Is-Mobile-Viewer" = "CloudFront-Is-Mobile-Viewer"
  inline val `CloudFront-Is-SmartTV-Viewer`: "CloudFront-Is-SmartTV-Viewer" = "CloudFront-Is-SmartTV-Viewer"
  inline val `CloudFront-Is-Tablet-Viewer`: "CloudFront-Is-Tablet-Viewer" = "CloudFront-Is-Tablet-Viewer"
  inline val `CloudFront-Viewer-Country`: "CloudFront-Viewer-Country" = "CloudFront-Viewer-Country"
  inline val Host: "Host" = "Host"
  inline val Origin: "Origin" = "Origin"
  inline val Referer: "Referer" = "Referer"

  inline def values: js.Array[HeaderEnum] = js.Array(
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
  inline val ssh: "ssh" = "ssh"
  inline val rdp: "rdp" = "rdp"

  inline def values: js.Array[InstanceAccessProtocol] = js.Array(ssh, rdp)
}

type InstanceHealthReason = "Lb.RegistrationInProgress" | "Lb.InitialHealthChecking" | "Lb.InternalError" | "Instance.ResponseCodeMismatch" | "Instance.Timeout" | "Instance.FailedHealthChecks" | "Instance.NotRegistered" | "Instance.NotInUse" | "Instance.DeregistrationInProgress" | "Instance.InvalidState" | "Instance.IpUnusable"
object InstanceHealthReason {
  inline val `Lb.RegistrationInProgress`: "Lb.RegistrationInProgress" = "Lb.RegistrationInProgress"
  inline val `Lb.InitialHealthChecking`: "Lb.InitialHealthChecking" = "Lb.InitialHealthChecking"
  inline val `Lb.InternalError`: "Lb.InternalError" = "Lb.InternalError"
  inline val `Instance.ResponseCodeMismatch`: "Instance.ResponseCodeMismatch" = "Instance.ResponseCodeMismatch"
  inline val `Instance.Timeout`: "Instance.Timeout" = "Instance.Timeout"
  inline val `Instance.FailedHealthChecks`: "Instance.FailedHealthChecks" = "Instance.FailedHealthChecks"
  inline val `Instance.NotRegistered`: "Instance.NotRegistered" = "Instance.NotRegistered"
  inline val `Instance.NotInUse`: "Instance.NotInUse" = "Instance.NotInUse"
  inline val `Instance.DeregistrationInProgress`: "Instance.DeregistrationInProgress" = "Instance.DeregistrationInProgress"
  inline val `Instance.InvalidState`: "Instance.InvalidState" = "Instance.InvalidState"
  inline val `Instance.IpUnusable`: "Instance.IpUnusable" = "Instance.IpUnusable"

  inline def values: js.Array[InstanceHealthReason] = js.Array(
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
  inline val initial: "initial" = "initial"
  inline val healthy: "healthy" = "healthy"
  inline val unhealthy: "unhealthy" = "unhealthy"
  inline val unused: "unused" = "unused"
  inline val draining: "draining" = "draining"
  inline val unavailable: "unavailable" = "unavailable"

  inline def values: js.Array[InstanceHealthState] = js.Array(initial, healthy, unhealthy, unused, draining, unavailable)
}

type InstanceMetricName = "CPUUtilization" | "NetworkIn" | "NetworkOut" | "StatusCheckFailed" | "StatusCheckFailed_Instance" | "StatusCheckFailed_System" | "BurstCapacityTime" | "BurstCapacityPercentage"
object InstanceMetricName {
  inline val CPUUtilization: "CPUUtilization" = "CPUUtilization"
  inline val NetworkIn: "NetworkIn" = "NetworkIn"
  inline val NetworkOut: "NetworkOut" = "NetworkOut"
  inline val StatusCheckFailed: "StatusCheckFailed" = "StatusCheckFailed"
  inline val StatusCheckFailed_Instance: "StatusCheckFailed_Instance" = "StatusCheckFailed_Instance"
  inline val StatusCheckFailed_System: "StatusCheckFailed_System" = "StatusCheckFailed_System"
  inline val BurstCapacityTime: "BurstCapacityTime" = "BurstCapacityTime"
  inline val BurstCapacityPercentage: "BurstCapacityPercentage" = "BurstCapacityPercentage"

  inline def values: js.Array[InstanceMetricName] = js.Array(CPUUtilization, NetworkIn, NetworkOut, StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System, BurstCapacityTime, BurstCapacityPercentage)
}

type InstancePlatform = "LINUX_UNIX" | "WINDOWS"
object InstancePlatform {
  inline val LINUX_UNIX: "LINUX_UNIX" = "LINUX_UNIX"
  inline val WINDOWS: "WINDOWS" = "WINDOWS"

  inline def values: js.Array[InstancePlatform] = js.Array(LINUX_UNIX, WINDOWS)
}

type InstanceSnapshotState = "pending" | "error" | "available"
object InstanceSnapshotState {
  inline val pending: "pending" = "pending"
  inline val error: "error" = "error"
  inline val available: "available" = "available"

  inline def values: js.Array[InstanceSnapshotState] = js.Array(pending, error, available)
}

type IpAddressType = "dualstack" | "ipv4"
object IpAddressType {
  inline val dualstack: "dualstack" = "dualstack"
  inline val ipv4: "ipv4" = "ipv4"

  inline def values: js.Array[IpAddressType] = js.Array(dualstack, ipv4)
}

type LoadBalancerAttributeName = "HealthCheckPath" | "SessionStickinessEnabled" | "SessionStickiness_LB_CookieDurationSeconds"
object LoadBalancerAttributeName {
  inline val HealthCheckPath: "HealthCheckPath" = "HealthCheckPath"
  inline val SessionStickinessEnabled: "SessionStickinessEnabled" = "SessionStickinessEnabled"
  inline val SessionStickiness_LB_CookieDurationSeconds: "SessionStickiness_LB_CookieDurationSeconds" = "SessionStickiness_LB_CookieDurationSeconds"

  inline def values: js.Array[LoadBalancerAttributeName] = js.Array(HealthCheckPath, SessionStickinessEnabled, SessionStickiness_LB_CookieDurationSeconds)
}

type LoadBalancerMetricName = "ClientTLSNegotiationErrorCount" | "HealthyHostCount" | "UnhealthyHostCount" | "HTTPCode_LB_4XX_Count" | "HTTPCode_LB_5XX_Count" | "HTTPCode_Instance_2XX_Count" | "HTTPCode_Instance_3XX_Count" | "HTTPCode_Instance_4XX_Count" | "HTTPCode_Instance_5XX_Count" | "InstanceResponseTime" | "RejectedConnectionCount" | "RequestCount"
object LoadBalancerMetricName {
  inline val ClientTLSNegotiationErrorCount: "ClientTLSNegotiationErrorCount" = "ClientTLSNegotiationErrorCount"
  inline val HealthyHostCount: "HealthyHostCount" = "HealthyHostCount"
  inline val UnhealthyHostCount: "UnhealthyHostCount" = "UnhealthyHostCount"
  inline val HTTPCode_LB_4XX_Count: "HTTPCode_LB_4XX_Count" = "HTTPCode_LB_4XX_Count"
  inline val HTTPCode_LB_5XX_Count: "HTTPCode_LB_5XX_Count" = "HTTPCode_LB_5XX_Count"
  inline val HTTPCode_Instance_2XX_Count: "HTTPCode_Instance_2XX_Count" = "HTTPCode_Instance_2XX_Count"
  inline val HTTPCode_Instance_3XX_Count: "HTTPCode_Instance_3XX_Count" = "HTTPCode_Instance_3XX_Count"
  inline val HTTPCode_Instance_4XX_Count: "HTTPCode_Instance_4XX_Count" = "HTTPCode_Instance_4XX_Count"
  inline val HTTPCode_Instance_5XX_Count: "HTTPCode_Instance_5XX_Count" = "HTTPCode_Instance_5XX_Count"
  inline val InstanceResponseTime: "InstanceResponseTime" = "InstanceResponseTime"
  inline val RejectedConnectionCount: "RejectedConnectionCount" = "RejectedConnectionCount"
  inline val RequestCount: "RequestCount" = "RequestCount"

  inline def values: js.Array[LoadBalancerMetricName] = js.Array(
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
  inline val HTTP_HTTPS: "HTTP_HTTPS" = "HTTP_HTTPS"
  inline val HTTP: "HTTP" = "HTTP"

  inline def values: js.Array[LoadBalancerProtocol] = js.Array(HTTP_HTTPS, HTTP)
}

type LoadBalancerState = "active" | "provisioning" | "active_impaired" | "failed" | "unknown"
object LoadBalancerState {
  inline val active: "active" = "active"
  inline val provisioning: "provisioning" = "provisioning"
  inline val active_impaired: "active_impaired" = "active_impaired"
  inline val failed: "failed" = "failed"
  inline val unknown: "unknown" = "unknown"

  inline def values: js.Array[LoadBalancerState] = js.Array(active, provisioning, active_impaired, failed, unknown)
}

type LoadBalancerTlsCertificateDomainStatus = "PENDING_VALIDATION" | "FAILED" | "SUCCESS"
object LoadBalancerTlsCertificateDomainStatus {
  inline val PENDING_VALIDATION: "PENDING_VALIDATION" = "PENDING_VALIDATION"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"

  inline def values: js.Array[LoadBalancerTlsCertificateDomainStatus] = js.Array(PENDING_VALIDATION, FAILED, SUCCESS)
}

type LoadBalancerTlsCertificateFailureReason = "NO_AVAILABLE_CONTACTS" | "ADDITIONAL_VERIFICATION_REQUIRED" | "DOMAIN_NOT_ALLOWED" | "INVALID_PUBLIC_DOMAIN" | "OTHER"
object LoadBalancerTlsCertificateFailureReason {
  inline val NO_AVAILABLE_CONTACTS: "NO_AVAILABLE_CONTACTS" = "NO_AVAILABLE_CONTACTS"
  inline val ADDITIONAL_VERIFICATION_REQUIRED: "ADDITIONAL_VERIFICATION_REQUIRED" = "ADDITIONAL_VERIFICATION_REQUIRED"
  inline val DOMAIN_NOT_ALLOWED: "DOMAIN_NOT_ALLOWED" = "DOMAIN_NOT_ALLOWED"
  inline val INVALID_PUBLIC_DOMAIN: "INVALID_PUBLIC_DOMAIN" = "INVALID_PUBLIC_DOMAIN"
  inline val OTHER: "OTHER" = "OTHER"

  inline def values: js.Array[LoadBalancerTlsCertificateFailureReason] = js.Array(NO_AVAILABLE_CONTACTS, ADDITIONAL_VERIFICATION_REQUIRED, DOMAIN_NOT_ALLOWED, INVALID_PUBLIC_DOMAIN, OTHER)
}

type LoadBalancerTlsCertificateRenewalStatus = "PENDING_AUTO_RENEWAL" | "PENDING_VALIDATION" | "SUCCESS" | "FAILED"
object LoadBalancerTlsCertificateRenewalStatus {
  inline val PENDING_AUTO_RENEWAL: "PENDING_AUTO_RENEWAL" = "PENDING_AUTO_RENEWAL"
  inline val PENDING_VALIDATION: "PENDING_VALIDATION" = "PENDING_VALIDATION"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[LoadBalancerTlsCertificateRenewalStatus] = js.Array(PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS, FAILED)
}

type LoadBalancerTlsCertificateRevocationReason = "UNSPECIFIED" | "KEY_COMPROMISE" | "CA_COMPROMISE" | "AFFILIATION_CHANGED" | "SUPERCEDED" | "CESSATION_OF_OPERATION" | "CERTIFICATE_HOLD" | "REMOVE_FROM_CRL" | "PRIVILEGE_WITHDRAWN" | "A_A_COMPROMISE"
object LoadBalancerTlsCertificateRevocationReason {
  inline val UNSPECIFIED: "UNSPECIFIED" = "UNSPECIFIED"
  inline val KEY_COMPROMISE: "KEY_COMPROMISE" = "KEY_COMPROMISE"
  inline val CA_COMPROMISE: "CA_COMPROMISE" = "CA_COMPROMISE"
  inline val AFFILIATION_CHANGED: "AFFILIATION_CHANGED" = "AFFILIATION_CHANGED"
  inline val SUPERCEDED: "SUPERCEDED" = "SUPERCEDED"
  inline val CESSATION_OF_OPERATION: "CESSATION_OF_OPERATION" = "CESSATION_OF_OPERATION"
  inline val CERTIFICATE_HOLD: "CERTIFICATE_HOLD" = "CERTIFICATE_HOLD"
  inline val REMOVE_FROM_CRL: "REMOVE_FROM_CRL" = "REMOVE_FROM_CRL"
  inline val PRIVILEGE_WITHDRAWN: "PRIVILEGE_WITHDRAWN" = "PRIVILEGE_WITHDRAWN"
  inline val A_A_COMPROMISE: "A_A_COMPROMISE" = "A_A_COMPROMISE"

  inline def values: js.Array[LoadBalancerTlsCertificateRevocationReason] = js.Array(
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
  inline val PENDING_VALIDATION: "PENDING_VALIDATION" = "PENDING_VALIDATION"
  inline val ISSUED: "ISSUED" = "ISSUED"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"
  inline val VALIDATION_TIMED_OUT: "VALIDATION_TIMED_OUT" = "VALIDATION_TIMED_OUT"
  inline val REVOKED: "REVOKED" = "REVOKED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[LoadBalancerTlsCertificateStatus] = js.Array(PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED, VALIDATION_TIMED_OUT, REVOKED, FAILED, UNKNOWN)
}

type MetricName = "CPUUtilization" | "NetworkIn" | "NetworkOut" | "StatusCheckFailed" | "StatusCheckFailed_Instance" | "StatusCheckFailed_System" | "ClientTLSNegotiationErrorCount" | "HealthyHostCount" | "UnhealthyHostCount" | "HTTPCode_LB_4XX_Count" | "HTTPCode_LB_5XX_Count" | "HTTPCode_Instance_2XX_Count" | "HTTPCode_Instance_3XX_Count" | "HTTPCode_Instance_4XX_Count" | "HTTPCode_Instance_5XX_Count" | "InstanceResponseTime" | "RejectedConnectionCount" | "RequestCount" | "DatabaseConnections" | "DiskQueueDepth" | "FreeStorageSpace" | "NetworkReceiveThroughput" | "NetworkTransmitThroughput" | "BurstCapacityTime" | "BurstCapacityPercentage"
object MetricName {
  inline val CPUUtilization: "CPUUtilization" = "CPUUtilization"
  inline val NetworkIn: "NetworkIn" = "NetworkIn"
  inline val NetworkOut: "NetworkOut" = "NetworkOut"
  inline val StatusCheckFailed: "StatusCheckFailed" = "StatusCheckFailed"
  inline val StatusCheckFailed_Instance: "StatusCheckFailed_Instance" = "StatusCheckFailed_Instance"
  inline val StatusCheckFailed_System: "StatusCheckFailed_System" = "StatusCheckFailed_System"
  inline val ClientTLSNegotiationErrorCount: "ClientTLSNegotiationErrorCount" = "ClientTLSNegotiationErrorCount"
  inline val HealthyHostCount: "HealthyHostCount" = "HealthyHostCount"
  inline val UnhealthyHostCount: "UnhealthyHostCount" = "UnhealthyHostCount"
  inline val HTTPCode_LB_4XX_Count: "HTTPCode_LB_4XX_Count" = "HTTPCode_LB_4XX_Count"
  inline val HTTPCode_LB_5XX_Count: "HTTPCode_LB_5XX_Count" = "HTTPCode_LB_5XX_Count"
  inline val HTTPCode_Instance_2XX_Count: "HTTPCode_Instance_2XX_Count" = "HTTPCode_Instance_2XX_Count"
  inline val HTTPCode_Instance_3XX_Count: "HTTPCode_Instance_3XX_Count" = "HTTPCode_Instance_3XX_Count"
  inline val HTTPCode_Instance_4XX_Count: "HTTPCode_Instance_4XX_Count" = "HTTPCode_Instance_4XX_Count"
  inline val HTTPCode_Instance_5XX_Count: "HTTPCode_Instance_5XX_Count" = "HTTPCode_Instance_5XX_Count"
  inline val InstanceResponseTime: "InstanceResponseTime" = "InstanceResponseTime"
  inline val RejectedConnectionCount: "RejectedConnectionCount" = "RejectedConnectionCount"
  inline val RequestCount: "RequestCount" = "RequestCount"
  inline val DatabaseConnections: "DatabaseConnections" = "DatabaseConnections"
  inline val DiskQueueDepth: "DiskQueueDepth" = "DiskQueueDepth"
  inline val FreeStorageSpace: "FreeStorageSpace" = "FreeStorageSpace"
  inline val NetworkReceiveThroughput: "NetworkReceiveThroughput" = "NetworkReceiveThroughput"
  inline val NetworkTransmitThroughput: "NetworkTransmitThroughput" = "NetworkTransmitThroughput"
  inline val BurstCapacityTime: "BurstCapacityTime" = "BurstCapacityTime"
  inline val BurstCapacityPercentage: "BurstCapacityPercentage" = "BurstCapacityPercentage"

  inline def values: js.Array[MetricName] = js.Array(
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
  inline val Minimum: "Minimum" = "Minimum"
  inline val Maximum: "Maximum" = "Maximum"
  inline val Sum: "Sum" = "Sum"
  inline val Average: "Average" = "Average"
  inline val SampleCount: "SampleCount" = "SampleCount"

  inline def values: js.Array[MetricStatistic] = js.Array(Minimum, Maximum, Sum, Average, SampleCount)
}

type MetricUnit = "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None"
object MetricUnit {
  inline val Seconds: "Seconds" = "Seconds"
  inline val Microseconds: "Microseconds" = "Microseconds"
  inline val Milliseconds: "Milliseconds" = "Milliseconds"
  inline val Bytes: "Bytes" = "Bytes"
  inline val Kilobytes: "Kilobytes" = "Kilobytes"
  inline val Megabytes: "Megabytes" = "Megabytes"
  inline val Gigabytes: "Gigabytes" = "Gigabytes"
  inline val Terabytes: "Terabytes" = "Terabytes"
  inline val Bits: "Bits" = "Bits"
  inline val Kilobits: "Kilobits" = "Kilobits"
  inline val Megabits: "Megabits" = "Megabits"
  inline val Gigabits: "Gigabits" = "Gigabits"
  inline val Terabits: "Terabits" = "Terabits"
  inline val Percent: "Percent" = "Percent"
  inline val Count: "Count" = "Count"
  inline val `Bytes/Second`: "Bytes/Second" = "Bytes/Second"
  inline val `Kilobytes/Second`: "Kilobytes/Second" = "Kilobytes/Second"
  inline val `Megabytes/Second`: "Megabytes/Second" = "Megabytes/Second"
  inline val `Gigabytes/Second`: "Gigabytes/Second" = "Gigabytes/Second"
  inline val `Terabytes/Second`: "Terabytes/Second" = "Terabytes/Second"
  inline val `Bits/Second`: "Bits/Second" = "Bits/Second"
  inline val `Kilobits/Second`: "Kilobits/Second" = "Kilobits/Second"
  inline val `Megabits/Second`: "Megabits/Second" = "Megabits/Second"
  inline val `Gigabits/Second`: "Gigabits/Second" = "Gigabits/Second"
  inline val `Terabits/Second`: "Terabits/Second" = "Terabits/Second"
  inline val `Count/Second`: "Count/Second" = "Count/Second"
  inline val None: "None" = "None"

  inline def values: js.Array[MetricUnit] = js.Array(
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
  inline val tcp: "tcp" = "tcp"
  inline val all: "all" = "all"
  inline val udp: "udp" = "udp"
  inline val icmp: "icmp" = "icmp"

  inline def values: js.Array[NetworkProtocol] = js.Array(tcp, all, udp, icmp)
}

type OperationStatus = "NotStarted" | "Started" | "Failed" | "Completed" | "Succeeded"
object OperationStatus {
  inline val NotStarted: "NotStarted" = "NotStarted"
  inline val Started: "Started" = "Started"
  inline val Failed: "Failed" = "Failed"
  inline val Completed: "Completed" = "Completed"
  inline val Succeeded: "Succeeded" = "Succeeded"

  inline def values: js.Array[OperationStatus] = js.Array(NotStarted, Started, Failed, Completed, Succeeded)
}

type OperationType = "DeleteKnownHostKeys" | "DeleteInstance" | "CreateInstance" | "StopInstance" | "StartInstance" | "RebootInstance" | "OpenInstancePublicPorts" | "PutInstancePublicPorts" | "CloseInstancePublicPorts" | "AllocateStaticIp" | "ReleaseStaticIp" | "AttachStaticIp" | "DetachStaticIp" | "UpdateDomainEntry" | "DeleteDomainEntry" | "CreateDomain" | "DeleteDomain" | "CreateInstanceSnapshot" | "DeleteInstanceSnapshot" | "CreateInstancesFromSnapshot" | "CreateLoadBalancer" | "DeleteLoadBalancer" | "AttachInstancesToLoadBalancer" | "DetachInstancesFromLoadBalancer" | "UpdateLoadBalancerAttribute" | "CreateLoadBalancerTlsCertificate" | "DeleteLoadBalancerTlsCertificate" | "AttachLoadBalancerTlsCertificate" | "CreateDisk" | "DeleteDisk" | "AttachDisk" | "DetachDisk" | "CreateDiskSnapshot" | "DeleteDiskSnapshot" | "CreateDiskFromSnapshot" | "CreateRelationalDatabase" | "UpdateRelationalDatabase" | "DeleteRelationalDatabase" | "CreateRelationalDatabaseFromSnapshot" |
  "CreateRelationalDatabaseSnapshot" | "DeleteRelationalDatabaseSnapshot" | "UpdateRelationalDatabaseParameters" | "StartRelationalDatabase" | "RebootRelationalDatabase" | "StopRelationalDatabase" | "EnableAddOn" | "DisableAddOn" | "PutAlarm" | "GetAlarms" | "DeleteAlarm" | "TestAlarm" | "CreateContactMethod" | "GetContactMethods" | "SendContactMethodVerification" | "DeleteContactMethod" | "CreateDistribution" | "UpdateDistribution" | "DeleteDistribution" | "ResetDistributionCache" | "AttachCertificateToDistribution" | "DetachCertificateFromDistribution" | "UpdateDistributionBundle" | "SetIpAddressType" | "CreateCertificate" | "DeleteCertificate" | "CreateContainerService" | "UpdateContainerService" | "DeleteContainerService" | "CreateContainerServiceDeployment" | "CreateContainerServiceRegistryLogin" | "RegisterContainerImage" | "DeleteContainerImage" | "CreateBucket" | "DeleteBucket" | "CreateBucketAccessKey" | "DeleteBucketAccessKey" | "UpdateBucketBundle" | "UpdateBucket" |
  "SetResourceAccessForBucket"
object OperationType {
  inline val DeleteKnownHostKeys: "DeleteKnownHostKeys" = "DeleteKnownHostKeys"
  inline val DeleteInstance: "DeleteInstance" = "DeleteInstance"
  inline val CreateInstance: "CreateInstance" = "CreateInstance"
  inline val StopInstance: "StopInstance" = "StopInstance"
  inline val StartInstance: "StartInstance" = "StartInstance"
  inline val RebootInstance: "RebootInstance" = "RebootInstance"
  inline val OpenInstancePublicPorts: "OpenInstancePublicPorts" = "OpenInstancePublicPorts"
  inline val PutInstancePublicPorts: "PutInstancePublicPorts" = "PutInstancePublicPorts"
  inline val CloseInstancePublicPorts: "CloseInstancePublicPorts" = "CloseInstancePublicPorts"
  inline val AllocateStaticIp: "AllocateStaticIp" = "AllocateStaticIp"
  inline val ReleaseStaticIp: "ReleaseStaticIp" = "ReleaseStaticIp"
  inline val AttachStaticIp: "AttachStaticIp" = "AttachStaticIp"
  inline val DetachStaticIp: "DetachStaticIp" = "DetachStaticIp"
  inline val UpdateDomainEntry: "UpdateDomainEntry" = "UpdateDomainEntry"
  inline val DeleteDomainEntry: "DeleteDomainEntry" = "DeleteDomainEntry"
  inline val CreateDomain: "CreateDomain" = "CreateDomain"
  inline val DeleteDomain: "DeleteDomain" = "DeleteDomain"
  inline val CreateInstanceSnapshot: "CreateInstanceSnapshot" = "CreateInstanceSnapshot"
  inline val DeleteInstanceSnapshot: "DeleteInstanceSnapshot" = "DeleteInstanceSnapshot"
  inline val CreateInstancesFromSnapshot: "CreateInstancesFromSnapshot" = "CreateInstancesFromSnapshot"
  inline val CreateLoadBalancer: "CreateLoadBalancer" = "CreateLoadBalancer"
  inline val DeleteLoadBalancer: "DeleteLoadBalancer" = "DeleteLoadBalancer"
  inline val AttachInstancesToLoadBalancer: "AttachInstancesToLoadBalancer" = "AttachInstancesToLoadBalancer"
  inline val DetachInstancesFromLoadBalancer: "DetachInstancesFromLoadBalancer" = "DetachInstancesFromLoadBalancer"
  inline val UpdateLoadBalancerAttribute: "UpdateLoadBalancerAttribute" = "UpdateLoadBalancerAttribute"
  inline val CreateLoadBalancerTlsCertificate: "CreateLoadBalancerTlsCertificate" = "CreateLoadBalancerTlsCertificate"
  inline val DeleteLoadBalancerTlsCertificate: "DeleteLoadBalancerTlsCertificate" = "DeleteLoadBalancerTlsCertificate"
  inline val AttachLoadBalancerTlsCertificate: "AttachLoadBalancerTlsCertificate" = "AttachLoadBalancerTlsCertificate"
  inline val CreateDisk: "CreateDisk" = "CreateDisk"
  inline val DeleteDisk: "DeleteDisk" = "DeleteDisk"
  inline val AttachDisk: "AttachDisk" = "AttachDisk"
  inline val DetachDisk: "DetachDisk" = "DetachDisk"
  inline val CreateDiskSnapshot: "CreateDiskSnapshot" = "CreateDiskSnapshot"
  inline val DeleteDiskSnapshot: "DeleteDiskSnapshot" = "DeleteDiskSnapshot"
  inline val CreateDiskFromSnapshot: "CreateDiskFromSnapshot" = "CreateDiskFromSnapshot"
  inline val CreateRelationalDatabase: "CreateRelationalDatabase" = "CreateRelationalDatabase"
  inline val UpdateRelationalDatabase: "UpdateRelationalDatabase" = "UpdateRelationalDatabase"
  inline val DeleteRelationalDatabase: "DeleteRelationalDatabase" = "DeleteRelationalDatabase"
  inline val CreateRelationalDatabaseFromSnapshot: "CreateRelationalDatabaseFromSnapshot" = "CreateRelationalDatabaseFromSnapshot"
  inline val CreateRelationalDatabaseSnapshot: "CreateRelationalDatabaseSnapshot" = "CreateRelationalDatabaseSnapshot"
  inline val DeleteRelationalDatabaseSnapshot: "DeleteRelationalDatabaseSnapshot" = "DeleteRelationalDatabaseSnapshot"
  inline val UpdateRelationalDatabaseParameters: "UpdateRelationalDatabaseParameters" = "UpdateRelationalDatabaseParameters"
  inline val StartRelationalDatabase: "StartRelationalDatabase" = "StartRelationalDatabase"
  inline val RebootRelationalDatabase: "RebootRelationalDatabase" = "RebootRelationalDatabase"
  inline val StopRelationalDatabase: "StopRelationalDatabase" = "StopRelationalDatabase"
  inline val EnableAddOn: "EnableAddOn" = "EnableAddOn"
  inline val DisableAddOn: "DisableAddOn" = "DisableAddOn"
  inline val PutAlarm: "PutAlarm" = "PutAlarm"
  inline val GetAlarms: "GetAlarms" = "GetAlarms"
  inline val DeleteAlarm: "DeleteAlarm" = "DeleteAlarm"
  inline val TestAlarm: "TestAlarm" = "TestAlarm"
  inline val CreateContactMethod: "CreateContactMethod" = "CreateContactMethod"
  inline val GetContactMethods: "GetContactMethods" = "GetContactMethods"
  inline val SendContactMethodVerification: "SendContactMethodVerification" = "SendContactMethodVerification"
  inline val DeleteContactMethod: "DeleteContactMethod" = "DeleteContactMethod"
  inline val CreateDistribution: "CreateDistribution" = "CreateDistribution"
  inline val UpdateDistribution: "UpdateDistribution" = "UpdateDistribution"
  inline val DeleteDistribution: "DeleteDistribution" = "DeleteDistribution"
  inline val ResetDistributionCache: "ResetDistributionCache" = "ResetDistributionCache"
  inline val AttachCertificateToDistribution: "AttachCertificateToDistribution" = "AttachCertificateToDistribution"
  inline val DetachCertificateFromDistribution: "DetachCertificateFromDistribution" = "DetachCertificateFromDistribution"
  inline val UpdateDistributionBundle: "UpdateDistributionBundle" = "UpdateDistributionBundle"
  inline val SetIpAddressType: "SetIpAddressType" = "SetIpAddressType"
  inline val CreateCertificate: "CreateCertificate" = "CreateCertificate"
  inline val DeleteCertificate: "DeleteCertificate" = "DeleteCertificate"
  inline val CreateContainerService: "CreateContainerService" = "CreateContainerService"
  inline val UpdateContainerService: "UpdateContainerService" = "UpdateContainerService"
  inline val DeleteContainerService: "DeleteContainerService" = "DeleteContainerService"
  inline val CreateContainerServiceDeployment: "CreateContainerServiceDeployment" = "CreateContainerServiceDeployment"
  inline val CreateContainerServiceRegistryLogin: "CreateContainerServiceRegistryLogin" = "CreateContainerServiceRegistryLogin"
  inline val RegisterContainerImage: "RegisterContainerImage" = "RegisterContainerImage"
  inline val DeleteContainerImage: "DeleteContainerImage" = "DeleteContainerImage"
  inline val CreateBucket: "CreateBucket" = "CreateBucket"
  inline val DeleteBucket: "DeleteBucket" = "DeleteBucket"
  inline val CreateBucketAccessKey: "CreateBucketAccessKey" = "CreateBucketAccessKey"
  inline val DeleteBucketAccessKey: "DeleteBucketAccessKey" = "DeleteBucketAccessKey"
  inline val UpdateBucketBundle: "UpdateBucketBundle" = "UpdateBucketBundle"
  inline val UpdateBucket: "UpdateBucket" = "UpdateBucket"
  inline val SetResourceAccessForBucket: "SetResourceAccessForBucket" = "SetResourceAccessForBucket"

  inline def values: js.Array[OperationType] = js.Array(
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
    DeleteContainerImage,
    CreateBucket,
    DeleteBucket,
    CreateBucketAccessKey,
    DeleteBucketAccessKey,
    UpdateBucketBundle,
    UpdateBucket,
    SetResourceAccessForBucket
  )
}

type OriginProtocolPolicyEnum = "http-only" | "https-only"
object OriginProtocolPolicyEnum {
  inline val `http-only`: "http-only" = "http-only"
  inline val `https-only`: "https-only" = "https-only"

  inline def values: js.Array[OriginProtocolPolicyEnum] = js.Array(`http-only`, `https-only`)
}

type PortAccessType = "Public" | "Private"
object PortAccessType {
  inline val Public: "Public" = "Public"
  inline val Private: "Private" = "Private"

  inline def values: js.Array[PortAccessType] = js.Array(Public, Private)
}

type PortInfoSourceType = "DEFAULT" | "INSTANCE" | "NONE" | "CLOSED"
object PortInfoSourceType {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val INSTANCE: "INSTANCE" = "INSTANCE"
  inline val NONE: "NONE" = "NONE"
  inline val CLOSED: "CLOSED" = "CLOSED"

  inline def values: js.Array[PortInfoSourceType] = js.Array(DEFAULT, INSTANCE, NONE, CLOSED)
}

type PortState = "open" | "closed"
object PortState {
  inline val open: "open" = "open"
  inline val closed: "closed" = "closed"

  inline def values: js.Array[PortState] = js.Array(open, closed)
}

type RecordState = "Started" | "Succeeded" | "Failed"
object RecordState {
  inline val Started: "Started" = "Started"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[RecordState] = js.Array(Started, Succeeded, Failed)
}

type RegionName = "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-central-1" | "ca-central-1" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "ap-northeast-2" | "eu-north-1"
object RegionName {
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-east-2`: "us-east-2" = "us-east-2"
  inline val `us-west-1`: "us-west-1" = "us-west-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val `eu-west-2`: "eu-west-2" = "eu-west-2"
  inline val `eu-west-3`: "eu-west-3" = "eu-west-3"
  inline val `eu-central-1`: "eu-central-1" = "eu-central-1"
  inline val `ca-central-1`: "ca-central-1" = "ca-central-1"
  inline val `ap-south-1`: "ap-south-1" = "ap-south-1"
  inline val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  inline val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  inline val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  inline val `eu-north-1`: "eu-north-1" = "eu-north-1"

  inline def values: js.Array[RegionName] = js.Array(
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
    `ap-northeast-2`,
    `eu-north-1`
  )
}

type RelationalDatabaseEngine = "mysql"
object RelationalDatabaseEngine {
  inline val mysql: "mysql" = "mysql"

  inline def values: js.Array[RelationalDatabaseEngine] = js.Array(mysql)
}

type RelationalDatabaseMetricName = "CPUUtilization" | "DatabaseConnections" | "DiskQueueDepth" | "FreeStorageSpace" | "NetworkReceiveThroughput" | "NetworkTransmitThroughput"
object RelationalDatabaseMetricName {
  inline val CPUUtilization: "CPUUtilization" = "CPUUtilization"
  inline val DatabaseConnections: "DatabaseConnections" = "DatabaseConnections"
  inline val DiskQueueDepth: "DiskQueueDepth" = "DiskQueueDepth"
  inline val FreeStorageSpace: "FreeStorageSpace" = "FreeStorageSpace"
  inline val NetworkReceiveThroughput: "NetworkReceiveThroughput" = "NetworkReceiveThroughput"
  inline val NetworkTransmitThroughput: "NetworkTransmitThroughput" = "NetworkTransmitThroughput"

  inline def values: js.Array[RelationalDatabaseMetricName] = js.Array(CPUUtilization, DatabaseConnections, DiskQueueDepth, FreeStorageSpace, NetworkReceiveThroughput, NetworkTransmitThroughput)
}

type RelationalDatabasePasswordVersion = "CURRENT" | "PREVIOUS" | "PENDING"
object RelationalDatabasePasswordVersion {
  inline val CURRENT: "CURRENT" = "CURRENT"
  inline val PREVIOUS: "PREVIOUS" = "PREVIOUS"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[RelationalDatabasePasswordVersion] = js.Array(CURRENT, PREVIOUS, PENDING)
}

type RenewalStatus = "PendingAutoRenewal" | "PendingValidation" | "Success" | "Failed"
object RenewalStatus {
  inline val PendingAutoRenewal: "PendingAutoRenewal" = "PendingAutoRenewal"
  inline val PendingValidation: "PendingValidation" = "PendingValidation"
  inline val Success: "Success" = "Success"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[RenewalStatus] = js.Array(PendingAutoRenewal, PendingValidation, Success, Failed)
}

type ResourceBucketAccess = "allow" | "deny"
object ResourceBucketAccess {
  inline val allow: "allow" = "allow"
  inline val deny: "deny" = "deny"

  inline def values: js.Array[ResourceBucketAccess] = js.Array(allow, deny)
}

type ResourceType = "ContainerService" | "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | "Distribution" | "Certificate" | "Bucket"
object ResourceType {
  inline val ContainerService: "ContainerService" = "ContainerService"
  inline val Instance: "Instance" = "Instance"
  inline val StaticIp: "StaticIp" = "StaticIp"
  inline val KeyPair: "KeyPair" = "KeyPair"
  inline val InstanceSnapshot: "InstanceSnapshot" = "InstanceSnapshot"
  inline val Domain: "Domain" = "Domain"
  inline val PeeredVpc: "PeeredVpc" = "PeeredVpc"
  inline val LoadBalancer: "LoadBalancer" = "LoadBalancer"
  inline val LoadBalancerTlsCertificate: "LoadBalancerTlsCertificate" = "LoadBalancerTlsCertificate"
  inline val Disk: "Disk" = "Disk"
  inline val DiskSnapshot: "DiskSnapshot" = "DiskSnapshot"
  inline val RelationalDatabase: "RelationalDatabase" = "RelationalDatabase"
  inline val RelationalDatabaseSnapshot: "RelationalDatabaseSnapshot" = "RelationalDatabaseSnapshot"
  inline val ExportSnapshotRecord: "ExportSnapshotRecord" = "ExportSnapshotRecord"
  inline val CloudFormationStackRecord: "CloudFormationStackRecord" = "CloudFormationStackRecord"
  inline val Alarm: "Alarm" = "Alarm"
  inline val ContactMethod: "ContactMethod" = "ContactMethod"
  inline val Distribution: "Distribution" = "Distribution"
  inline val Certificate: "Certificate" = "Certificate"
  inline val Bucket: "Bucket" = "Bucket"

  inline def values: js.Array[ResourceType] = js.Array(
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
    Certificate,
    Bucket
  )
}

type StatusType = "Active" | "Inactive"
object StatusType {
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"

  inline def values: js.Array[StatusType] = js.Array(Active, Inactive)
}

type TreatMissingData = "breaching" | "notBreaching" | "ignore" | "missing"
object TreatMissingData {
  inline val breaching: "breaching" = "breaching"
  inline val notBreaching: "notBreaching" = "notBreaching"
  inline val ignore: "ignore" = "ignore"
  inline val missing: "missing" = "missing"

  inline def values: js.Array[TreatMissingData] = js.Array(breaching, notBreaching, ignore, missing)
}
