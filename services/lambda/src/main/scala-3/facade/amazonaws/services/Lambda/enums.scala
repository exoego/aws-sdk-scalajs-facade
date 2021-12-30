package facade.amazonaws.services.lambda

import scalajs.js

type CodeSigningPolicy = "Warn" | "Enforce"
object CodeSigningPolicy {
  inline val Warn: "Warn" = "Warn"
  inline val Enforce: "Enforce" = "Enforce"

  inline def values: js.Array[CodeSigningPolicy] = js.Array(Warn, Enforce)
}

type EndPointType = "KAFKA_BOOTSTRAP_SERVERS"
object EndPointType {
  inline val KAFKA_BOOTSTRAP_SERVERS: "KAFKA_BOOTSTRAP_SERVERS" = "KAFKA_BOOTSTRAP_SERVERS"

  inline def values: js.Array[EndPointType] = js.Array(KAFKA_BOOTSTRAP_SERVERS)
}

type EventSourcePosition = "TRIM_HORIZON" | "LATEST" | "AT_TIMESTAMP"
object EventSourcePosition {
  inline val TRIM_HORIZON: "TRIM_HORIZON" = "TRIM_HORIZON"
  inline val LATEST: "LATEST" = "LATEST"
  inline val AT_TIMESTAMP: "AT_TIMESTAMP" = "AT_TIMESTAMP"

  inline def values: js.Array[EventSourcePosition] = js.Array(TRIM_HORIZON, LATEST, AT_TIMESTAMP)
}

type FunctionResponseType = "ReportBatchItemFailures"
object FunctionResponseType {
  inline val ReportBatchItemFailures: "ReportBatchItemFailures" = "ReportBatchItemFailures"

  inline def values: js.Array[FunctionResponseType] = js.Array(ReportBatchItemFailures)
}

type FunctionVersion = "ALL"
object FunctionVersion {
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[FunctionVersion] = js.Array(ALL)
}

type InvocationType = "Event" | "RequestResponse" | "DryRun"
object InvocationType {
  inline val Event: "Event" = "Event"
  inline val RequestResponse: "RequestResponse" = "RequestResponse"
  inline val DryRun: "DryRun" = "DryRun"

  inline def values: js.Array[InvocationType] = js.Array(Event, RequestResponse, DryRun)
}

type LastUpdateStatus = "Successful" | "Failed" | "InProgress"
object LastUpdateStatus {
  inline val Successful: "Successful" = "Successful"
  inline val Failed: "Failed" = "Failed"
  inline val InProgress: "InProgress" = "InProgress"

  inline def values: js.Array[LastUpdateStatus] = js.Array(Successful, Failed, InProgress)
}

type LastUpdateStatusReasonCode = "EniLimitExceeded" | "InsufficientRolePermissions" | "InvalidConfiguration" | "InternalError" | "SubnetOutOfIPAddresses" | "InvalidSubnet" | "InvalidSecurityGroup" | "ImageDeleted" | "ImageAccessDenied" | "InvalidImage"
object LastUpdateStatusReasonCode {
  inline val EniLimitExceeded: "EniLimitExceeded" = "EniLimitExceeded"
  inline val InsufficientRolePermissions: "InsufficientRolePermissions" = "InsufficientRolePermissions"
  inline val InvalidConfiguration: "InvalidConfiguration" = "InvalidConfiguration"
  inline val InternalError: "InternalError" = "InternalError"
  inline val SubnetOutOfIPAddresses: "SubnetOutOfIPAddresses" = "SubnetOutOfIPAddresses"
  inline val InvalidSubnet: "InvalidSubnet" = "InvalidSubnet"
  inline val InvalidSecurityGroup: "InvalidSecurityGroup" = "InvalidSecurityGroup"
  inline val ImageDeleted: "ImageDeleted" = "ImageDeleted"
  inline val ImageAccessDenied: "ImageAccessDenied" = "ImageAccessDenied"
  inline val InvalidImage: "InvalidImage" = "InvalidImage"

  inline def values: js.Array[LastUpdateStatusReasonCode] = js.Array(
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
  inline val None: "None" = "None"
  inline val Tail: "Tail" = "Tail"

  inline def values: js.Array[LogType] = js.Array(None, Tail)
}

type PackageType = "Zip" | "Image"
object PackageType {
  inline val Zip: "Zip" = "Zip"
  inline val Image: "Image" = "Image"

  inline def values: js.Array[PackageType] = js.Array(Zip, Image)
}

type ProvisionedConcurrencyStatusEnum = "IN_PROGRESS" | "READY" | "FAILED"
object ProvisionedConcurrencyStatusEnum {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val READY: "READY" = "READY"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ProvisionedConcurrencyStatusEnum] = js.Array(IN_PROGRESS, READY, FAILED)
}

type Runtime = "nodejs" | "nodejs4.3" | "nodejs6.10" | "nodejs8.10" | "nodejs10.x" | "nodejs12.x" | "nodejs14.x" | "java8" | "java8.al2" | "java11" | "python2.7" | "python3.6" | "python3.7" | "python3.8" | "dotnetcore1.0" | "dotnetcore2.0" | "dotnetcore2.1" | "dotnetcore3.1" | "nodejs4.3-edge" | "go1.x" | "ruby2.5" | "ruby2.7" | "provided" | "provided.al2"
object Runtime {
  inline val nodejs: "nodejs" = "nodejs"
  inline val `nodejs4.3`: "nodejs4.3" = "nodejs4.3"
  inline val `nodejs6.10`: "nodejs6.10" = "nodejs6.10"
  inline val `nodejs8.10`: "nodejs8.10" = "nodejs8.10"
  inline val `nodejs10.x`: "nodejs10.x" = "nodejs10.x"
  inline val `nodejs12.x`: "nodejs12.x" = "nodejs12.x"
  inline val `nodejs14.x`: "nodejs14.x" = "nodejs14.x"
  inline val java8: "java8" = "java8"
  inline val `java8.al2`: "java8.al2" = "java8.al2"
  inline val java11: "java11" = "java11"
  inline val `python2.7`: "python2.7" = "python2.7"
  inline val `python3.6`: "python3.6" = "python3.6"
  inline val `python3.7`: "python3.7" = "python3.7"
  inline val `python3.8`: "python3.8" = "python3.8"
  inline val `dotnetcore1.0`: "dotnetcore1.0" = "dotnetcore1.0"
  inline val `dotnetcore2.0`: "dotnetcore2.0" = "dotnetcore2.0"
  inline val `dotnetcore2.1`: "dotnetcore2.1" = "dotnetcore2.1"
  inline val `dotnetcore3.1`: "dotnetcore3.1" = "dotnetcore3.1"
  inline val `nodejs4.3-edge`: "nodejs4.3-edge" = "nodejs4.3-edge"
  inline val `go1.x`: "go1.x" = "go1.x"
  inline val `ruby2.5`: "ruby2.5" = "ruby2.5"
  inline val `ruby2.7`: "ruby2.7" = "ruby2.7"
  inline val provided: "provided" = "provided"
  inline val `provided.al2`: "provided.al2" = "provided.al2"

  inline def values: js.Array[Runtime] = js.Array(
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
  inline val BASIC_AUTH: "BASIC_AUTH" = "BASIC_AUTH"
  inline val VPC_SUBNET: "VPC_SUBNET" = "VPC_SUBNET"
  inline val VPC_SECURITY_GROUP: "VPC_SECURITY_GROUP" = "VPC_SECURITY_GROUP"
  inline val SASL_SCRAM_512_AUTH: "SASL_SCRAM_512_AUTH" = "SASL_SCRAM_512_AUTH"
  inline val SASL_SCRAM_256_AUTH: "SASL_SCRAM_256_AUTH" = "SASL_SCRAM_256_AUTH"

  inline def values: js.Array[SourceAccessType] = js.Array(BASIC_AUTH, VPC_SUBNET, VPC_SECURITY_GROUP, SASL_SCRAM_512_AUTH, SASL_SCRAM_256_AUTH)
}

type State = "Pending" | "Active" | "Inactive" | "Failed"
object State {
  inline val Pending: "Pending" = "Pending"
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[State] = js.Array(Pending, Active, Inactive, Failed)
}

type StateReasonCode = "Idle" | "Creating" | "Restoring" | "EniLimitExceeded" | "InsufficientRolePermissions" | "InvalidConfiguration" | "InternalError" | "SubnetOutOfIPAddresses" | "InvalidSubnet" | "InvalidSecurityGroup" | "ImageDeleted" | "ImageAccessDenied" | "InvalidImage"
object StateReasonCode {
  inline val Idle: "Idle" = "Idle"
  inline val Creating: "Creating" = "Creating"
  inline val Restoring: "Restoring" = "Restoring"
  inline val EniLimitExceeded: "EniLimitExceeded" = "EniLimitExceeded"
  inline val InsufficientRolePermissions: "InsufficientRolePermissions" = "InsufficientRolePermissions"
  inline val InvalidConfiguration: "InvalidConfiguration" = "InvalidConfiguration"
  inline val InternalError: "InternalError" = "InternalError"
  inline val SubnetOutOfIPAddresses: "SubnetOutOfIPAddresses" = "SubnetOutOfIPAddresses"
  inline val InvalidSubnet: "InvalidSubnet" = "InvalidSubnet"
  inline val InvalidSecurityGroup: "InvalidSecurityGroup" = "InvalidSecurityGroup"
  inline val ImageDeleted: "ImageDeleted" = "ImageDeleted"
  inline val ImageAccessDenied: "ImageAccessDenied" = "ImageAccessDenied"
  inline val InvalidImage: "InvalidImage" = "InvalidImage"

  inline def values: js.Array[StateReasonCode] = js.Array(
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
  inline val Active: "Active" = "Active"
  inline val PassThrough: "PassThrough" = "PassThrough"

  inline def values: js.Array[TracingMode] = js.Array(Active, PassThrough)
}
