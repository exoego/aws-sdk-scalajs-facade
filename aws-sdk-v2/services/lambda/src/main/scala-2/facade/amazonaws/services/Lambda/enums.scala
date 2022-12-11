package facade.amazonaws.services.lambda

import scalajs.js

@js.native
sealed trait Architecture extends js.Any
object Architecture {
  val x86_64 = "x86_64".asInstanceOf[Architecture]
  val arm64 = "arm64".asInstanceOf[Architecture]

  @inline def values: js.Array[Architecture] = js.Array(x86_64, arm64)
}

@js.native
sealed trait CodeSigningPolicy extends js.Any
object CodeSigningPolicy {
  val Warn = "Warn".asInstanceOf[CodeSigningPolicy]
  val Enforce = "Enforce".asInstanceOf[CodeSigningPolicy]

  @inline def values: js.Array[CodeSigningPolicy] = js.Array(Warn, Enforce)
}

@js.native
sealed trait EndPointType extends js.Any
object EndPointType {
  val KAFKA_BOOTSTRAP_SERVERS = "KAFKA_BOOTSTRAP_SERVERS".asInstanceOf[EndPointType]

  @inline def values: js.Array[EndPointType] = js.Array(KAFKA_BOOTSTRAP_SERVERS)
}

@js.native
sealed trait EventSourcePosition extends js.Any
object EventSourcePosition {
  val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[EventSourcePosition]
  val LATEST = "LATEST".asInstanceOf[EventSourcePosition]
  val AT_TIMESTAMP = "AT_TIMESTAMP".asInstanceOf[EventSourcePosition]

  @inline def values: js.Array[EventSourcePosition] = js.Array(TRIM_HORIZON, LATEST, AT_TIMESTAMP)
}

@js.native
sealed trait FunctionResponseType extends js.Any
object FunctionResponseType {
  val ReportBatchItemFailures = "ReportBatchItemFailures".asInstanceOf[FunctionResponseType]

  @inline def values: js.Array[FunctionResponseType] = js.Array(ReportBatchItemFailures)
}

@js.native
sealed trait FunctionUrlAuthType extends js.Any
object FunctionUrlAuthType {
  val NONE = "NONE".asInstanceOf[FunctionUrlAuthType]
  val AWS_IAM = "AWS_IAM".asInstanceOf[FunctionUrlAuthType]

  @inline def values: js.Array[FunctionUrlAuthType] = js.Array(NONE, AWS_IAM)
}

@js.native
sealed trait FunctionVersion extends js.Any
object FunctionVersion {
  val ALL = "ALL".asInstanceOf[FunctionVersion]

  @inline def values: js.Array[FunctionVersion] = js.Array(ALL)
}

@js.native
sealed trait InvocationType extends js.Any
object InvocationType {
  val Event = "Event".asInstanceOf[InvocationType]
  val RequestResponse = "RequestResponse".asInstanceOf[InvocationType]
  val DryRun = "DryRun".asInstanceOf[InvocationType]

  @inline def values: js.Array[InvocationType] = js.Array(Event, RequestResponse, DryRun)
}

@js.native
sealed trait LastUpdateStatus extends js.Any
object LastUpdateStatus {
  val Successful = "Successful".asInstanceOf[LastUpdateStatus]
  val Failed = "Failed".asInstanceOf[LastUpdateStatus]
  val InProgress = "InProgress".asInstanceOf[LastUpdateStatus]

  @inline def values: js.Array[LastUpdateStatus] = js.Array(Successful, Failed, InProgress)
}

@js.native
sealed trait LastUpdateStatusReasonCode extends js.Any
object LastUpdateStatusReasonCode {
  val EniLimitExceeded = "EniLimitExceeded".asInstanceOf[LastUpdateStatusReasonCode]
  val InsufficientRolePermissions = "InsufficientRolePermissions".asInstanceOf[LastUpdateStatusReasonCode]
  val InvalidConfiguration = "InvalidConfiguration".asInstanceOf[LastUpdateStatusReasonCode]
  val InternalError = "InternalError".asInstanceOf[LastUpdateStatusReasonCode]
  val SubnetOutOfIPAddresses = "SubnetOutOfIPAddresses".asInstanceOf[LastUpdateStatusReasonCode]
  val InvalidSubnet = "InvalidSubnet".asInstanceOf[LastUpdateStatusReasonCode]
  val InvalidSecurityGroup = "InvalidSecurityGroup".asInstanceOf[LastUpdateStatusReasonCode]
  val ImageDeleted = "ImageDeleted".asInstanceOf[LastUpdateStatusReasonCode]
  val ImageAccessDenied = "ImageAccessDenied".asInstanceOf[LastUpdateStatusReasonCode]
  val InvalidImage = "InvalidImage".asInstanceOf[LastUpdateStatusReasonCode]
  val KMSKeyAccessDenied = "KMSKeyAccessDenied".asInstanceOf[LastUpdateStatusReasonCode]
  val KMSKeyNotFound = "KMSKeyNotFound".asInstanceOf[LastUpdateStatusReasonCode]
  val InvalidStateKMSKey = "InvalidStateKMSKey".asInstanceOf[LastUpdateStatusReasonCode]
  val DisabledKMSKey = "DisabledKMSKey".asInstanceOf[LastUpdateStatusReasonCode]
  val EFSIOError = "EFSIOError".asInstanceOf[LastUpdateStatusReasonCode]
  val EFSMountConnectivityError = "EFSMountConnectivityError".asInstanceOf[LastUpdateStatusReasonCode]
  val EFSMountFailure = "EFSMountFailure".asInstanceOf[LastUpdateStatusReasonCode]
  val EFSMountTimeout = "EFSMountTimeout".asInstanceOf[LastUpdateStatusReasonCode]
  val InvalidRuntime = "InvalidRuntime".asInstanceOf[LastUpdateStatusReasonCode]
  val InvalidZipFileException = "InvalidZipFileException".asInstanceOf[LastUpdateStatusReasonCode]
  val FunctionError = "FunctionError".asInstanceOf[LastUpdateStatusReasonCode]

  @inline def values: js.Array[LastUpdateStatusReasonCode] = js.Array(
    EniLimitExceeded,
    InsufficientRolePermissions,
    InvalidConfiguration,
    InternalError,
    SubnetOutOfIPAddresses,
    InvalidSubnet,
    InvalidSecurityGroup,
    ImageDeleted,
    ImageAccessDenied,
    InvalidImage,
    KMSKeyAccessDenied,
    KMSKeyNotFound,
    InvalidStateKMSKey,
    DisabledKMSKey,
    EFSIOError,
    EFSMountConnectivityError,
    EFSMountFailure,
    EFSMountTimeout,
    InvalidRuntime,
    InvalidZipFileException,
    FunctionError
  )
}

@js.native
sealed trait LogType extends js.Any
object LogType {
  val None = "None".asInstanceOf[LogType]
  val Tail = "Tail".asInstanceOf[LogType]

  @inline def values: js.Array[LogType] = js.Array(None, Tail)
}

@js.native
sealed trait PackageType extends js.Any
object PackageType {
  val Zip = "Zip".asInstanceOf[PackageType]
  val Image = "Image".asInstanceOf[PackageType]

  @inline def values: js.Array[PackageType] = js.Array(Zip, Image)
}

@js.native
sealed trait ProvisionedConcurrencyStatusEnum extends js.Any
object ProvisionedConcurrencyStatusEnum {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ProvisionedConcurrencyStatusEnum]
  val READY = "READY".asInstanceOf[ProvisionedConcurrencyStatusEnum]
  val FAILED = "FAILED".asInstanceOf[ProvisionedConcurrencyStatusEnum]

  @inline def values: js.Array[ProvisionedConcurrencyStatusEnum] = js.Array(IN_PROGRESS, READY, FAILED)
}

@js.native
sealed trait Runtime extends js.Any
object Runtime {
  val nodejs = "nodejs".asInstanceOf[Runtime]
  val `nodejs4.3` = "nodejs4.3".asInstanceOf[Runtime]
  val `nodejs6.10` = "nodejs6.10".asInstanceOf[Runtime]
  val `nodejs8.10` = "nodejs8.10".asInstanceOf[Runtime]
  val `nodejs10.x` = "nodejs10.x".asInstanceOf[Runtime]
  val `nodejs12.x` = "nodejs12.x".asInstanceOf[Runtime]
  val `nodejs14.x` = "nodejs14.x".asInstanceOf[Runtime]
  val `nodejs16.x` = "nodejs16.x".asInstanceOf[Runtime]
  val java8 = "java8".asInstanceOf[Runtime]
  val `java8.al2` = "java8.al2".asInstanceOf[Runtime]
  val java11 = "java11".asInstanceOf[Runtime]
  val `python2.7` = "python2.7".asInstanceOf[Runtime]
  val `python3.6` = "python3.6".asInstanceOf[Runtime]
  val `python3.7` = "python3.7".asInstanceOf[Runtime]
  val `python3.8` = "python3.8".asInstanceOf[Runtime]
  val `python3.9` = "python3.9".asInstanceOf[Runtime]
  val `dotnetcore1.0` = "dotnetcore1.0".asInstanceOf[Runtime]
  val `dotnetcore2.0` = "dotnetcore2.0".asInstanceOf[Runtime]
  val `dotnetcore2.1` = "dotnetcore2.1".asInstanceOf[Runtime]
  val `dotnetcore3.1` = "dotnetcore3.1".asInstanceOf[Runtime]
  val dotnet6 = "dotnet6".asInstanceOf[Runtime]
  val `nodejs4.3-edge` = "nodejs4.3-edge".asInstanceOf[Runtime]
  val `go1.x` = "go1.x".asInstanceOf[Runtime]
  val `ruby2.5` = "ruby2.5".asInstanceOf[Runtime]
  val `ruby2.7` = "ruby2.7".asInstanceOf[Runtime]
  val provided = "provided".asInstanceOf[Runtime]
  val `provided.al2` = "provided.al2".asInstanceOf[Runtime]
  val `nodejs18.x` = "nodejs18.x".asInstanceOf[Runtime]

  @inline def values: js.Array[Runtime] = js.Array(
    nodejs,
    `nodejs4.3`,
    `nodejs6.10`,
    `nodejs8.10`,
    `nodejs10.x`,
    `nodejs12.x`,
    `nodejs14.x`,
    `nodejs16.x`,
    java8,
    `java8.al2`,
    java11,
    `python2.7`,
    `python3.6`,
    `python3.7`,
    `python3.8`,
    `python3.9`,
    `dotnetcore1.0`,
    `dotnetcore2.0`,
    `dotnetcore2.1`,
    `dotnetcore3.1`,
    dotnet6,
    `nodejs4.3-edge`,
    `go1.x`,
    `ruby2.5`,
    `ruby2.7`,
    provided,
    `provided.al2`,
    `nodejs18.x`
  )
}

@js.native
sealed trait SnapStartApplyOn extends js.Any
object SnapStartApplyOn {
  val PublishedVersions = "PublishedVersions".asInstanceOf[SnapStartApplyOn]
  val None = "None".asInstanceOf[SnapStartApplyOn]

  @inline def values: js.Array[SnapStartApplyOn] = js.Array(PublishedVersions, None)
}

@js.native
sealed trait SnapStartOptimizationStatus extends js.Any
object SnapStartOptimizationStatus {
  val On = "On".asInstanceOf[SnapStartOptimizationStatus]
  val Off = "Off".asInstanceOf[SnapStartOptimizationStatus]

  @inline def values: js.Array[SnapStartOptimizationStatus] = js.Array(On, Off)
}

@js.native
sealed trait SourceAccessType extends js.Any
object SourceAccessType {
  val BASIC_AUTH = "BASIC_AUTH".asInstanceOf[SourceAccessType]
  val VPC_SUBNET = "VPC_SUBNET".asInstanceOf[SourceAccessType]
  val VPC_SECURITY_GROUP = "VPC_SECURITY_GROUP".asInstanceOf[SourceAccessType]
  val SASL_SCRAM_512_AUTH = "SASL_SCRAM_512_AUTH".asInstanceOf[SourceAccessType]
  val SASL_SCRAM_256_AUTH = "SASL_SCRAM_256_AUTH".asInstanceOf[SourceAccessType]
  val VIRTUAL_HOST = "VIRTUAL_HOST".asInstanceOf[SourceAccessType]
  val CLIENT_CERTIFICATE_TLS_AUTH = "CLIENT_CERTIFICATE_TLS_AUTH".asInstanceOf[SourceAccessType]
  val SERVER_ROOT_CA_CERTIFICATE = "SERVER_ROOT_CA_CERTIFICATE".asInstanceOf[SourceAccessType]

  @inline def values: js.Array[SourceAccessType] = js.Array(BASIC_AUTH, VPC_SUBNET, VPC_SECURITY_GROUP, SASL_SCRAM_512_AUTH, SASL_SCRAM_256_AUTH, VIRTUAL_HOST, CLIENT_CERTIFICATE_TLS_AUTH, SERVER_ROOT_CA_CERTIFICATE)
}

@js.native
sealed trait State extends js.Any
object State {
  val Pending = "Pending".asInstanceOf[State]
  val Active = "Active".asInstanceOf[State]
  val Inactive = "Inactive".asInstanceOf[State]
  val Failed = "Failed".asInstanceOf[State]

  @inline def values: js.Array[State] = js.Array(Pending, Active, Inactive, Failed)
}

@js.native
sealed trait StateReasonCode extends js.Any
object StateReasonCode {
  val Idle = "Idle".asInstanceOf[StateReasonCode]
  val Creating = "Creating".asInstanceOf[StateReasonCode]
  val Restoring = "Restoring".asInstanceOf[StateReasonCode]
  val EniLimitExceeded = "EniLimitExceeded".asInstanceOf[StateReasonCode]
  val InsufficientRolePermissions = "InsufficientRolePermissions".asInstanceOf[StateReasonCode]
  val InvalidConfiguration = "InvalidConfiguration".asInstanceOf[StateReasonCode]
  val InternalError = "InternalError".asInstanceOf[StateReasonCode]
  val SubnetOutOfIPAddresses = "SubnetOutOfIPAddresses".asInstanceOf[StateReasonCode]
  val InvalidSubnet = "InvalidSubnet".asInstanceOf[StateReasonCode]
  val InvalidSecurityGroup = "InvalidSecurityGroup".asInstanceOf[StateReasonCode]
  val ImageDeleted = "ImageDeleted".asInstanceOf[StateReasonCode]
  val ImageAccessDenied = "ImageAccessDenied".asInstanceOf[StateReasonCode]
  val InvalidImage = "InvalidImage".asInstanceOf[StateReasonCode]
  val KMSKeyAccessDenied = "KMSKeyAccessDenied".asInstanceOf[StateReasonCode]
  val KMSKeyNotFound = "KMSKeyNotFound".asInstanceOf[StateReasonCode]
  val InvalidStateKMSKey = "InvalidStateKMSKey".asInstanceOf[StateReasonCode]
  val DisabledKMSKey = "DisabledKMSKey".asInstanceOf[StateReasonCode]
  val EFSIOError = "EFSIOError".asInstanceOf[StateReasonCode]
  val EFSMountConnectivityError = "EFSMountConnectivityError".asInstanceOf[StateReasonCode]
  val EFSMountFailure = "EFSMountFailure".asInstanceOf[StateReasonCode]
  val EFSMountTimeout = "EFSMountTimeout".asInstanceOf[StateReasonCode]
  val InvalidRuntime = "InvalidRuntime".asInstanceOf[StateReasonCode]
  val InvalidZipFileException = "InvalidZipFileException".asInstanceOf[StateReasonCode]
  val FunctionError = "FunctionError".asInstanceOf[StateReasonCode]

  @inline def values: js.Array[StateReasonCode] = js.Array(
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
    InvalidImage,
    KMSKeyAccessDenied,
    KMSKeyNotFound,
    InvalidStateKMSKey,
    DisabledKMSKey,
    EFSIOError,
    EFSMountConnectivityError,
    EFSMountFailure,
    EFSMountTimeout,
    InvalidRuntime,
    InvalidZipFileException,
    FunctionError
  )
}

@js.native
sealed trait TracingMode extends js.Any
object TracingMode {
  val Active = "Active".asInstanceOf[TracingMode]
  val PassThrough = "PassThrough".asInstanceOf[TracingMode]

  @inline def values: js.Array[TracingMode] = js.Array(Active, PassThrough)
}
