package facade.amazonaws.services.securitylake

import scalajs.js

@js.native
sealed trait AccessType extends js.Any
object AccessType {
  val LAKEFORMATION = "LAKEFORMATION".asInstanceOf[AccessType]
  val S3 = "S3".asInstanceOf[AccessType]

  @inline def values: js.Array[AccessType] = js.Array(LAKEFORMATION, S3)
}

@js.native
sealed trait AwsLogSourceType extends js.Any
object AwsLogSourceType {
  val ROUTE53 = "ROUTE53".asInstanceOf[AwsLogSourceType]
  val VPC_FLOW = "VPC_FLOW".asInstanceOf[AwsLogSourceType]
  val CLOUD_TRAIL = "CLOUD_TRAIL".asInstanceOf[AwsLogSourceType]
  val SH_FINDINGS = "SH_FINDINGS".asInstanceOf[AwsLogSourceType]

  @inline def values: js.Array[AwsLogSourceType] = js.Array(ROUTE53, VPC_FLOW, CLOUD_TRAIL, SH_FINDINGS)
}

@js.native
sealed trait Dimension extends js.Any
object Dimension {
  val REGION = "REGION".asInstanceOf[Dimension]
  val SOURCE_TYPE = "SOURCE_TYPE".asInstanceOf[Dimension]
  val MEMBER = "MEMBER".asInstanceOf[Dimension]

  @inline def values: js.Array[Dimension] = js.Array(REGION, SOURCE_TYPE, MEMBER)
}

@js.native
sealed trait EndpointProtocol extends js.Any
object EndpointProtocol {
  val HTTPS = "HTTPS".asInstanceOf[EndpointProtocol]
  val SQS = "SQS".asInstanceOf[EndpointProtocol]

  @inline def values: js.Array[EndpointProtocol] = js.Array(HTTPS, SQS)
}

@js.native
sealed trait HttpsMethod extends js.Any
object HttpsMethod {
  val POST = "POST".asInstanceOf[HttpsMethod]
  val PUT = "PUT".asInstanceOf[HttpsMethod]

  @inline def values: js.Array[HttpsMethod] = js.Array(POST, PUT)
}

@js.native
sealed trait OcsfEventClass extends js.Any
object OcsfEventClass {
  val ACCESS_ACTIVITY = "ACCESS_ACTIVITY".asInstanceOf[OcsfEventClass]
  val FILE_ACTIVITY = "FILE_ACTIVITY".asInstanceOf[OcsfEventClass]
  val KERNEL_ACTIVITY = "KERNEL_ACTIVITY".asInstanceOf[OcsfEventClass]
  val KERNEL_EXTENSION = "KERNEL_EXTENSION".asInstanceOf[OcsfEventClass]
  val MEMORY_ACTIVITY = "MEMORY_ACTIVITY".asInstanceOf[OcsfEventClass]
  val MODULE_ACTIVITY = "MODULE_ACTIVITY".asInstanceOf[OcsfEventClass]
  val PROCESS_ACTIVITY = "PROCESS_ACTIVITY".asInstanceOf[OcsfEventClass]
  val REGISTRY_KEY_ACTIVITY = "REGISTRY_KEY_ACTIVITY".asInstanceOf[OcsfEventClass]
  val REGISTRY_VALUE_ACTIVITY = "REGISTRY_VALUE_ACTIVITY".asInstanceOf[OcsfEventClass]
  val RESOURCE_ACTIVITY = "RESOURCE_ACTIVITY".asInstanceOf[OcsfEventClass]
  val SCHEDULED_JOB_ACTIVITY = "SCHEDULED_JOB_ACTIVITY".asInstanceOf[OcsfEventClass]
  val SECURITY_FINDING = "SECURITY_FINDING".asInstanceOf[OcsfEventClass]
  val ACCOUNT_CHANGE = "ACCOUNT_CHANGE".asInstanceOf[OcsfEventClass]
  val AUTHENTICATION = "AUTHENTICATION".asInstanceOf[OcsfEventClass]
  val AUTHORIZATION = "AUTHORIZATION".asInstanceOf[OcsfEventClass]
  val ENTITY_MANAGEMENT_AUDIT = "ENTITY_MANAGEMENT_AUDIT".asInstanceOf[OcsfEventClass]
  val DHCP_ACTIVITY = "DHCP_ACTIVITY".asInstanceOf[OcsfEventClass]
  val NETWORK_ACTIVITY = "NETWORK_ACTIVITY".asInstanceOf[OcsfEventClass]
  val DNS_ACTIVITY = "DNS_ACTIVITY".asInstanceOf[OcsfEventClass]
  val FTP_ACTIVITY = "FTP_ACTIVITY".asInstanceOf[OcsfEventClass]
  val HTTP_ACTIVITY = "HTTP_ACTIVITY".asInstanceOf[OcsfEventClass]
  val RDP_ACTIVITY = "RDP_ACTIVITY".asInstanceOf[OcsfEventClass]
  val SMB_ACTIVITY = "SMB_ACTIVITY".asInstanceOf[OcsfEventClass]
  val SSH_ACTIVITY = "SSH_ACTIVITY".asInstanceOf[OcsfEventClass]
  val CLOUD_API = "CLOUD_API".asInstanceOf[OcsfEventClass]
  val CONTAINER_LIFECYCLE = "CONTAINER_LIFECYCLE".asInstanceOf[OcsfEventClass]
  val DATABASE_LIFECYCLE = "DATABASE_LIFECYCLE".asInstanceOf[OcsfEventClass]
  val CONFIG_STATE = "CONFIG_STATE".asInstanceOf[OcsfEventClass]
  val CLOUD_STORAGE = "CLOUD_STORAGE".asInstanceOf[OcsfEventClass]
  val INVENTORY_INFO = "INVENTORY_INFO".asInstanceOf[OcsfEventClass]
  val RFB_ACTIVITY = "RFB_ACTIVITY".asInstanceOf[OcsfEventClass]
  val SMTP_ACTIVITY = "SMTP_ACTIVITY".asInstanceOf[OcsfEventClass]
  val VIRTUAL_MACHINE_ACTIVITY = "VIRTUAL_MACHINE_ACTIVITY".asInstanceOf[OcsfEventClass]

  @inline def values: js.Array[OcsfEventClass] = js.Array(
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

@js.native
sealed trait Region extends js.Any
object Region {
  val `us-east-1` = "us-east-1".asInstanceOf[Region]
  val `us-west-2` = "us-west-2".asInstanceOf[Region]
  val `eu-central-1` = "eu-central-1".asInstanceOf[Region]
  val `us-east-2` = "us-east-2".asInstanceOf[Region]
  val `eu-west-1` = "eu-west-1".asInstanceOf[Region]
  val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[Region]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[Region]

  @inline def values: js.Array[Region] = js.Array(`us-east-1`, `us-west-2`, `eu-central-1`, `us-east-2`, `eu-west-1`, `ap-northeast-1`, `ap-southeast-2`)
}

@js.native
sealed trait SourceStatus extends js.Any
object SourceStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[SourceStatus]
  val DEACTIVATED = "DEACTIVATED".asInstanceOf[SourceStatus]
  val PENDING = "PENDING".asInstanceOf[SourceStatus]

  @inline def values: js.Array[SourceStatus] = js.Array(ACTIVE, DEACTIVATED, PENDING)
}

@js.native
sealed trait StorageClass extends js.Any
object StorageClass {
  val STANDARD_IA = "STANDARD_IA".asInstanceOf[StorageClass]
  val ONEZONE_IA = "ONEZONE_IA".asInstanceOf[StorageClass]
  val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[StorageClass]
  val GLACIER_IR = "GLACIER_IR".asInstanceOf[StorageClass]
  val GLACIER = "GLACIER".asInstanceOf[StorageClass]
  val DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[StorageClass]
  val EXPIRE = "EXPIRE".asInstanceOf[StorageClass]

  @inline def values: js.Array[StorageClass] = js.Array(STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER_IR, GLACIER, DEEP_ARCHIVE, EXPIRE)
}

@js.native
sealed trait SubscriptionProtocolType extends js.Any
object SubscriptionProtocolType {
  val HTTP = "HTTP".asInstanceOf[SubscriptionProtocolType]
  val HTTPS = "HTTPS".asInstanceOf[SubscriptionProtocolType]
  val EMAIL = "EMAIL".asInstanceOf[SubscriptionProtocolType]
  val EMAIL_JSON = "EMAIL_JSON".asInstanceOf[SubscriptionProtocolType]
  val SMS = "SMS".asInstanceOf[SubscriptionProtocolType]
  val SQS = "SQS".asInstanceOf[SubscriptionProtocolType]
  val LAMBDA = "LAMBDA".asInstanceOf[SubscriptionProtocolType]
  val APP = "APP".asInstanceOf[SubscriptionProtocolType]
  val FIREHOSE = "FIREHOSE".asInstanceOf[SubscriptionProtocolType]

  @inline def values: js.Array[SubscriptionProtocolType] = js.Array(HTTP, HTTPS, EMAIL, EMAIL_JSON, SMS, SQS, LAMBDA, APP, FIREHOSE)
}

@js.native
sealed trait SubscriptionStatus extends js.Any
object SubscriptionStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[SubscriptionStatus]
  val DEACTIVATED = "DEACTIVATED".asInstanceOf[SubscriptionStatus]
  val PENDING = "PENDING".asInstanceOf[SubscriptionStatus]
  val READY = "READY".asInstanceOf[SubscriptionStatus]

  @inline def values: js.Array[SubscriptionStatus] = js.Array(ACTIVE, DEACTIVATED, PENDING, READY)
}

@js.native
sealed trait settingsStatus extends js.Any
object settingsStatus {
  val INITIALIZED = "INITIALIZED".asInstanceOf[settingsStatus]
  val PENDING = "PENDING".asInstanceOf[settingsStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[settingsStatus]
  val FAILED = "FAILED".asInstanceOf[settingsStatus]

  @inline def values: js.Array[settingsStatus] = js.Array(INITIALIZED, PENDING, COMPLETED, FAILED)
}
