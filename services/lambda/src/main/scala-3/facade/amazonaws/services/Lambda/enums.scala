package facade.amazonaws.services.lambda

import scalajs._

type CodeSigningPolicy = "Warn" | "Enforce"
object CodeSigningPolicy {
  val Warn: "Warn" = "Warn"
  val Enforce: "Enforce" = "Enforce"

  @inline def values = js.Array[CodeSigningPolicy](Warn, Enforce)
}

type EndPointType = "KAFKA_BOOTSTRAP_SERVERS"
object EndPointType {
  val KAFKA_BOOTSTRAP_SERVERS: "KAFKA_BOOTSTRAP_SERVERS" = "KAFKA_BOOTSTRAP_SERVERS"

  @inline def values = js.Array[EndPointType](KAFKA_BOOTSTRAP_SERVERS)
}

type EventSourcePosition = "TRIM_HORIZON" | "LATEST" | "AT_TIMESTAMP"
object EventSourcePosition {
  val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  val LATEST: "LATEST" = "LATEST"
  val AT_TIMESTAMP: "AT_TIMESTAMP" = "AT_TIMESTAMP"

  @inline def values = js.Array[EventSourcePosition](TRIM_HORIZON, LATEST, AT_TIMESTAMP)
}

type FunctionResponseType = "ReportBatchItemFailures"
object FunctionResponseType {
  val ReportBatchItemFailures: "ReportBatchItemFailures" = "ReportBatchItemFailures"

  @inline def values = js.Array[FunctionResponseType](ReportBatchItemFailures)
}

type FunctionVersion = "ALL"
object FunctionVersion {
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[FunctionVersion](ALL)
}

type InvocationType = "Event" | "RequestResponse" | "DryRun"
object InvocationType {
  val Event: "Event" = "Event"
  val RequestResponse: "RequestResponse" = "RequestResponse"
  val DryRun: "DryRun" = "DryRun"

  @inline def values = js.Array[InvocationType](Event, RequestResponse, DryRun)
}

type LastUpdateStatus = "Successful" | "Failed" | "InProgress"
object LastUpdateStatus {
  val Successful: "Successful" = "Successful"
  val Failed: "Failed" = "Failed"
  val InProgress: "InProgress" = "InProgress"

  @inline def values = js.Array[LastUpdateStatus](Successful, Failed, InProgress)
}

type LastUpdateStatusReasonCode = "EniLimitExceeded" | "InsufficientRolePermissions" | "InvalidConfiguration" | "InternalError" | "SubnetOutOfIPAddresses" | "InvalidSubnet" | "InvalidSecurityGroup" | "ImageDeleted" | "ImageAccessDenied" | "InvalidImage"
object LastUpdateStatusReasonCode {
  val EniLimitExceeded: "EniLimitExceeded" = "EniLimitExceeded"
  val InsufficientRolePermissions: "InsufficientRolePermissions" = "InsufficientRolePermissions"
  val InvalidConfiguration: "InvalidConfiguration" = "InvalidConfiguration"
  val InternalError: "InternalError" = "InternalError"
  val SubnetOutOfIPAddresses: "SubnetOutOfIPAddresses" = "SubnetOutOfIPAddresses"
  val InvalidSubnet: "InvalidSubnet" = "InvalidSubnet"
  val InvalidSecurityGroup: "InvalidSecurityGroup" = "InvalidSecurityGroup"
  val ImageDeleted: "ImageDeleted" = "ImageDeleted"
  val ImageAccessDenied: "ImageAccessDenied" = "ImageAccessDenied"
  val InvalidImage: "InvalidImage" = "InvalidImage"

  @inline def values = js.Array[LastUpdateStatusReasonCode](
    EniLimitExceeded,
    InsufficientRolePermissions,
    InvalidConfiguration,
    InternalError,
    SubnetOutOfIPAddresses,
    InvalidSubnet,
    InvalidSecurityGroup,
    ImageDeleted,
    ImageAccessDenied,
    InvalidImage
  )
}

type LogType = "None" | "Tail"
object LogType {
  val None: "None" = "None"
  val Tail: "Tail" = "Tail"

  @inline def values = js.Array[LogType](None, Tail)
}

type PackageType = "Zip" | "Image"
object PackageType {
  val Zip: "Zip" = "Zip"
  val Image: "Image" = "Image"

  @inline def values = js.Array[PackageType](Zip, Image)
}

type ProvisionedConcurrencyStatusEnum = "IN_PROGRESS" | "READY" | "FAILED"
object ProvisionedConcurrencyStatusEnum {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val READY: "READY" = "READY"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ProvisionedConcurrencyStatusEnum](IN_PROGRESS, READY, FAILED)
}

type Runtime = "nodejs" | "nodejs4.3" | "nodejs6.10" | "nodejs8.10" | "nodejs10.x" | "nodejs12.x" | "nodejs14.x" | "java8" | "java8.al2" | "java11" | "python2.7" | "python3.6" | "python3.7" | "python3.8" | "dotnetcore1.0" | "dotnetcore2.0" | "dotnetcore2.1" | "dotnetcore3.1" | "nodejs4.3-edge" | "go1.x" | "ruby2.5" | "ruby2.7" | "provided" | "provided.al2"
object Runtime {
  val nodejs: "nodejs" = "nodejs"
  val `nodejs4.3`: "nodejs4.3" = "nodejs4.3"
  val `nodejs6.10`: "nodejs6.10" = "nodejs6.10"
  val `nodejs8.10`: "nodejs8.10" = "nodejs8.10"
  val `nodejs10.x`: "nodejs10.x" = "nodejs10.x"
  val `nodejs12.x`: "nodejs12.x" = "nodejs12.x"
  val `nodejs14.x`: "nodejs14.x" = "nodejs14.x"
  val java8: "java8" = "java8"
  val `java8.al2`: "java8.al2" = "java8.al2"
  val java11: "java11" = "java11"
  val `python2.7`: "python2.7" = "python2.7"
  val `python3.6`: "python3.6" = "python3.6"
  val `python3.7`: "python3.7" = "python3.7"
  val `python3.8`: "python3.8" = "python3.8"
  val `dotnetcore1.0`: "dotnetcore1.0" = "dotnetcore1.0"
  val `dotnetcore2.0`: "dotnetcore2.0" = "dotnetcore2.0"
  val `dotnetcore2.1`: "dotnetcore2.1" = "dotnetcore2.1"
  val `dotnetcore3.1`: "dotnetcore3.1" = "dotnetcore3.1"
  val `nodejs4.3-edge`: "nodejs4.3-edge" = "nodejs4.3-edge"
  val `go1.x`: "go1.x" = "go1.x"
  val `ruby2.5`: "ruby2.5" = "ruby2.5"
  val `ruby2.7`: "ruby2.7" = "ruby2.7"
  val provided: "provided" = "provided"
  val `provided.al2`: "provided.al2" = "provided.al2"

  @inline def values = js.Array[Runtime](
    nodejs,
    `nodejs4.3`,
    `nodejs6.10`,
    `nodejs8.10`,
    `nodejs10.x`,
    `nodejs12.x`,
    `nodejs14.x`,
    java8,
    `java8.al2`,
    java11,
    `python2.7`,
    `python3.6`,
    `python3.7`,
    `python3.8`,
    `dotnetcore1.0`,
    `dotnetcore2.0`,
    `dotnetcore2.1`,
    `dotnetcore3.1`,
    `nodejs4.3-edge`,
    `go1.x`,
    `ruby2.5`,
    `ruby2.7`,
    provided,
    `provided.al2`
  )
}

type SourceAccessType = "BASIC_AUTH" | "VPC_SUBNET" | "VPC_SECURITY_GROUP" | "SASL_SCRAM_512_AUTH" | "SASL_SCRAM_256_AUTH"
object SourceAccessType {
  val BASIC_AUTH: "BASIC_AUTH" = "BASIC_AUTH"
  val VPC_SUBNET: "VPC_SUBNET" = "VPC_SUBNET"
  val VPC_SECURITY_GROUP: "VPC_SECURITY_GROUP" = "VPC_SECURITY_GROUP"
  val SASL_SCRAM_512_AUTH: "SASL_SCRAM_512_AUTH" = "SASL_SCRAM_512_AUTH"
  val SASL_SCRAM_256_AUTH: "SASL_SCRAM_256_AUTH" = "SASL_SCRAM_256_AUTH"

  @inline def values = js.Array[SourceAccessType](BASIC_AUTH, VPC_SUBNET, VPC_SECURITY_GROUP, SASL_SCRAM_512_AUTH, SASL_SCRAM_256_AUTH)
}

type State = "Pending" | "Active" | "Inactive" | "Failed"
object State {
  val Pending: "Pending" = "Pending"
  val Active: "Active" = "Active"
  val Inactive: "Inactive" = "Inactive"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[State](Pending, Active, Inactive, Failed)
}

type StateReasonCode = "Idle" | "Creating" | "Restoring" | "EniLimitExceeded" | "InsufficientRolePermissions" | "InvalidConfiguration" | "InternalError" | "SubnetOutOfIPAddresses" | "InvalidSubnet" | "InvalidSecurityGroup" | "ImageDeleted" | "ImageAccessDenied" | "InvalidImage"
object StateReasonCode {
  val Idle: "Idle" = "Idle"
  val Creating: "Creating" = "Creating"
  val Restoring: "Restoring" = "Restoring"
  val EniLimitExceeded: "EniLimitExceeded" = "EniLimitExceeded"
  val InsufficientRolePermissions: "InsufficientRolePermissions" = "InsufficientRolePermissions"
  val InvalidConfiguration: "InvalidConfiguration" = "InvalidConfiguration"
  val InternalError: "InternalError" = "InternalError"
  val SubnetOutOfIPAddresses: "SubnetOutOfIPAddresses" = "SubnetOutOfIPAddresses"
  val InvalidSubnet: "InvalidSubnet" = "InvalidSubnet"
  val InvalidSecurityGroup: "InvalidSecurityGroup" = "InvalidSecurityGroup"
  val ImageDeleted: "ImageDeleted" = "ImageDeleted"
  val ImageAccessDenied: "ImageAccessDenied" = "ImageAccessDenied"
  val InvalidImage: "InvalidImage" = "InvalidImage"

  @inline def values = js.Array[StateReasonCode](
    Idle,
    Creating,
    Restoring,
    EniLimitExceeded,
    InsufficientRolePermissions,
    InvalidConfiguration,
    InternalError,
    SubnetOutOfIPAddresses,
    InvalidSubnet,
    InvalidSecurityGroup,
    ImageDeleted,
    ImageAccessDenied,
    InvalidImage
  )
}

type TracingMode = "Active" | "PassThrough"
object TracingMode {
  val Active: "Active" = "Active"
  val PassThrough: "PassThrough" = "PassThrough"

  @inline def values = js.Array[TracingMode](Active, PassThrough)
}
