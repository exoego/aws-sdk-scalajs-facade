package facade.amazonaws.services.securitylake

import scalajs.js

type AccessType = "LAKEFORMATION" | "S3"
object AccessType {
  inline val LAKEFORMATION: "LAKEFORMATION" = "LAKEFORMATION"
  inline val S3: "S3" = "S3"

  inline def values: js.Array[AccessType] = js.Array(LAKEFORMATION, S3)
}

type AwsLogSourceType = "ROUTE53" | "VPC_FLOW" | "CLOUD_TRAIL" | "SH_FINDINGS"
object AwsLogSourceType {
  inline val ROUTE53: "ROUTE53" = "ROUTE53"
  inline val VPC_FLOW: "VPC_FLOW" = "VPC_FLOW"
  inline val CLOUD_TRAIL: "CLOUD_TRAIL" = "CLOUD_TRAIL"
  inline val SH_FINDINGS: "SH_FINDINGS" = "SH_FINDINGS"

  inline def values: js.Array[AwsLogSourceType] = js.Array(ROUTE53, VPC_FLOW, CLOUD_TRAIL, SH_FINDINGS)
}

type Dimension = "REGION" | "SOURCE_TYPE" | "MEMBER"
object Dimension {
  inline val REGION: "REGION" = "REGION"
  inline val SOURCE_TYPE: "SOURCE_TYPE" = "SOURCE_TYPE"
  inline val MEMBER: "MEMBER" = "MEMBER"

  inline def values: js.Array[Dimension] = js.Array(REGION, SOURCE_TYPE, MEMBER)
}

type EndpointProtocol = "HTTPS" | "SQS"
object EndpointProtocol {
  inline val HTTPS: "HTTPS" = "HTTPS"
  inline val SQS: "SQS" = "SQS"

  inline def values: js.Array[EndpointProtocol] = js.Array(HTTPS, SQS)
}

type HttpsMethod = "POST" | "PUT"
object HttpsMethod {
  inline val POST: "POST" = "POST"
  inline val PUT: "PUT" = "PUT"

  inline def values: js.Array[HttpsMethod] = js.Array(POST, PUT)
}

type OcsfEventClass = "ACCESS_ACTIVITY" | "FILE_ACTIVITY" | "KERNEL_ACTIVITY" | "KERNEL_EXTENSION" | "MEMORY_ACTIVITY" | "MODULE_ACTIVITY" | "PROCESS_ACTIVITY" | "REGISTRY_KEY_ACTIVITY" | "REGISTRY_VALUE_ACTIVITY" | "RESOURCE_ACTIVITY" | "SCHEDULED_JOB_ACTIVITY" | "SECURITY_FINDING" | "ACCOUNT_CHANGE" | "AUTHENTICATION" | "AUTHORIZATION" | "ENTITY_MANAGEMENT_AUDIT" | "DHCP_ACTIVITY" | "NETWORK_ACTIVITY" | "DNS_ACTIVITY" | "FTP_ACTIVITY" | "HTTP_ACTIVITY" | "RDP_ACTIVITY" | "SMB_ACTIVITY" | "SSH_ACTIVITY" | "CLOUD_API" | "CONTAINER_LIFECYCLE" | "DATABASE_LIFECYCLE" | "CONFIG_STATE" | "CLOUD_STORAGE" | "INVENTORY_INFO" | "RFB_ACTIVITY" | "SMTP_ACTIVITY" | "VIRTUAL_MACHINE_ACTIVITY"
object OcsfEventClass {
  inline val ACCESS_ACTIVITY: "ACCESS_ACTIVITY" = "ACCESS_ACTIVITY"
  inline val FILE_ACTIVITY: "FILE_ACTIVITY" = "FILE_ACTIVITY"
  inline val KERNEL_ACTIVITY: "KERNEL_ACTIVITY" = "KERNEL_ACTIVITY"
  inline val KERNEL_EXTENSION: "KERNEL_EXTENSION" = "KERNEL_EXTENSION"
  inline val MEMORY_ACTIVITY: "MEMORY_ACTIVITY" = "MEMORY_ACTIVITY"
  inline val MODULE_ACTIVITY: "MODULE_ACTIVITY" = "MODULE_ACTIVITY"
  inline val PROCESS_ACTIVITY: "PROCESS_ACTIVITY" = "PROCESS_ACTIVITY"
  inline val REGISTRY_KEY_ACTIVITY: "REGISTRY_KEY_ACTIVITY" = "REGISTRY_KEY_ACTIVITY"
  inline val REGISTRY_VALUE_ACTIVITY: "REGISTRY_VALUE_ACTIVITY" = "REGISTRY_VALUE_ACTIVITY"
  inline val RESOURCE_ACTIVITY: "RESOURCE_ACTIVITY" = "RESOURCE_ACTIVITY"
  inline val SCHEDULED_JOB_ACTIVITY: "SCHEDULED_JOB_ACTIVITY" = "SCHEDULED_JOB_ACTIVITY"
  inline val SECURITY_FINDING: "SECURITY_FINDING" = "SECURITY_FINDING"
  inline val ACCOUNT_CHANGE: "ACCOUNT_CHANGE" = "ACCOUNT_CHANGE"
  inline val AUTHENTICATION: "AUTHENTICATION" = "AUTHENTICATION"
  inline val AUTHORIZATION: "AUTHORIZATION" = "AUTHORIZATION"
  inline val ENTITY_MANAGEMENT_AUDIT: "ENTITY_MANAGEMENT_AUDIT" = "ENTITY_MANAGEMENT_AUDIT"
  inline val DHCP_ACTIVITY: "DHCP_ACTIVITY" = "DHCP_ACTIVITY"
  inline val NETWORK_ACTIVITY: "NETWORK_ACTIVITY" = "NETWORK_ACTIVITY"
  inline val DNS_ACTIVITY: "DNS_ACTIVITY" = "DNS_ACTIVITY"
  inline val FTP_ACTIVITY: "FTP_ACTIVITY" = "FTP_ACTIVITY"
  inline val HTTP_ACTIVITY: "HTTP_ACTIVITY" = "HTTP_ACTIVITY"
  inline val RDP_ACTIVITY: "RDP_ACTIVITY" = "RDP_ACTIVITY"
  inline val SMB_ACTIVITY: "SMB_ACTIVITY" = "SMB_ACTIVITY"
  inline val SSH_ACTIVITY: "SSH_ACTIVITY" = "SSH_ACTIVITY"
  inline val CLOUD_API: "CLOUD_API" = "CLOUD_API"
  inline val CONTAINER_LIFECYCLE: "CONTAINER_LIFECYCLE" = "CONTAINER_LIFECYCLE"
  inline val DATABASE_LIFECYCLE: "DATABASE_LIFECYCLE" = "DATABASE_LIFECYCLE"
  inline val CONFIG_STATE: "CONFIG_STATE" = "CONFIG_STATE"
  inline val CLOUD_STORAGE: "CLOUD_STORAGE" = "CLOUD_STORAGE"
  inline val INVENTORY_INFO: "INVENTORY_INFO" = "INVENTORY_INFO"
  inline val RFB_ACTIVITY: "RFB_ACTIVITY" = "RFB_ACTIVITY"
  inline val SMTP_ACTIVITY: "SMTP_ACTIVITY" = "SMTP_ACTIVITY"
  inline val VIRTUAL_MACHINE_ACTIVITY: "VIRTUAL_MACHINE_ACTIVITY" = "VIRTUAL_MACHINE_ACTIVITY"

  inline def values: js.Array[OcsfEventClass] = js.Array(
    ACCESS_ACTIVITY,
    FILE_ACTIVITY,
    KERNEL_ACTIVITY,
    KERNEL_EXTENSION,
    MEMORY_ACTIVITY,
    MODULE_ACTIVITY,
    PROCESS_ACTIVITY,
    REGISTRY_KEY_ACTIVITY,
    REGISTRY_VALUE_ACTIVITY,
    RESOURCE_ACTIVITY,
    SCHEDULED_JOB_ACTIVITY,
    SECURITY_FINDING,
    ACCOUNT_CHANGE,
    AUTHENTICATION,
    AUTHORIZATION,
    ENTITY_MANAGEMENT_AUDIT,
    DHCP_ACTIVITY,
    NETWORK_ACTIVITY,
    DNS_ACTIVITY,
    FTP_ACTIVITY,
    HTTP_ACTIVITY,
    RDP_ACTIVITY,
    SMB_ACTIVITY,
    SSH_ACTIVITY,
    CLOUD_API,
    CONTAINER_LIFECYCLE,
    DATABASE_LIFECYCLE,
    CONFIG_STATE,
    CLOUD_STORAGE,
    INVENTORY_INFO,
    RFB_ACTIVITY,
    SMTP_ACTIVITY,
    VIRTUAL_MACHINE_ACTIVITY
  )
}

type Region = "us-east-1" | "us-west-2" | "eu-central-1" | "us-east-2" | "eu-west-1" | "ap-northeast-1" | "ap-southeast-2"
object Region {
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `eu-central-1`: "eu-central-1" = "eu-central-1"
  inline val `us-east-2`: "us-east-2" = "us-east-2"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"

  inline def values: js.Array[Region] = js.Array(`us-east-1`, `us-west-2`, `eu-central-1`, `us-east-2`, `eu-west-1`, `ap-northeast-1`, `ap-southeast-2`)
}

type SourceStatus = "ACTIVE" | "DEACTIVATED" | "PENDING"
object SourceStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DEACTIVATED: "DEACTIVATED" = "DEACTIVATED"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[SourceStatus] = js.Array(ACTIVE, DEACTIVATED, PENDING)
}

type StorageClass = "STANDARD_IA" | "ONEZONE_IA" | "INTELLIGENT_TIERING" | "GLACIER_IR" | "GLACIER" | "DEEP_ARCHIVE" | "EXPIRE"
object StorageClass {
  inline val STANDARD_IA: "STANDARD_IA" = "STANDARD_IA"
  inline val ONEZONE_IA: "ONEZONE_IA" = "ONEZONE_IA"
  inline val INTELLIGENT_TIERING: "INTELLIGENT_TIERING" = "INTELLIGENT_TIERING"
  inline val GLACIER_IR: "GLACIER_IR" = "GLACIER_IR"
  inline val GLACIER: "GLACIER" = "GLACIER"
  inline val DEEP_ARCHIVE: "DEEP_ARCHIVE" = "DEEP_ARCHIVE"
  inline val EXPIRE: "EXPIRE" = "EXPIRE"

  inline def values: js.Array[StorageClass] = js.Array(STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER_IR, GLACIER, DEEP_ARCHIVE, EXPIRE)
}

type SubscriptionProtocolType = "HTTP" | "HTTPS" | "EMAIL" | "EMAIL_JSON" | "SMS" | "SQS" | "LAMBDA" | "APP" | "FIREHOSE"
object SubscriptionProtocolType {
  inline val HTTP: "HTTP" = "HTTP"
  inline val HTTPS: "HTTPS" = "HTTPS"
  inline val EMAIL: "EMAIL" = "EMAIL"
  inline val EMAIL_JSON: "EMAIL_JSON" = "EMAIL_JSON"
  inline val SMS: "SMS" = "SMS"
  inline val SQS: "SQS" = "SQS"
  inline val LAMBDA: "LAMBDA" = "LAMBDA"
  inline val APP: "APP" = "APP"
  inline val FIREHOSE: "FIREHOSE" = "FIREHOSE"

  inline def values: js.Array[SubscriptionProtocolType] = js.Array(HTTP, HTTPS, EMAIL, EMAIL_JSON, SMS, SQS, LAMBDA, APP, FIREHOSE)
}

type SubscriptionStatus = "ACTIVE" | "DEACTIVATED" | "PENDING" | "READY"
object SubscriptionStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DEACTIVATED: "DEACTIVATED" = "DEACTIVATED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val READY: "READY" = "READY"

  inline def values: js.Array[SubscriptionStatus] = js.Array(ACTIVE, DEACTIVATED, PENDING, READY)
}

type settingsStatus = "INITIALIZED" | "PENDING" | "COMPLETED" | "FAILED"
object settingsStatus {
  inline val INITIALIZED: "INITIALIZED" = "INITIALIZED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[settingsStatus] = js.Array(INITIALIZED, PENDING, COMPLETED, FAILED)
}
