package facade.amazonaws.services.transfer

import scalajs.js

@js.native
sealed trait AgreementStatusType extends js.Any
object AgreementStatusType {
  val ACTIVE = "ACTIVE".asInstanceOf[AgreementStatusType]
  val INACTIVE = "INACTIVE".asInstanceOf[AgreementStatusType]

  @inline def values: js.Array[AgreementStatusType] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait As2Transport extends js.Any
object As2Transport {
  val HTTP = "HTTP".asInstanceOf[As2Transport]

  @inline def values: js.Array[As2Transport] = js.Array(HTTP)
}

@js.native
sealed trait CertificateStatusType extends js.Any
object CertificateStatusType {
  val ACTIVE = "ACTIVE".asInstanceOf[CertificateStatusType]
  val PENDING_ROTATION = "PENDING_ROTATION".asInstanceOf[CertificateStatusType]
  val INACTIVE = "INACTIVE".asInstanceOf[CertificateStatusType]

  @inline def values: js.Array[CertificateStatusType] = js.Array(ACTIVE, PENDING_ROTATION, INACTIVE)
}

@js.native
sealed trait CertificateType extends js.Any
object CertificateType {
  val CERTIFICATE = "CERTIFICATE".asInstanceOf[CertificateType]
  val CERTIFICATE_WITH_PRIVATE_KEY = "CERTIFICATE_WITH_PRIVATE_KEY".asInstanceOf[CertificateType]

  @inline def values: js.Array[CertificateType] = js.Array(CERTIFICATE, CERTIFICATE_WITH_PRIVATE_KEY)
}

@js.native
sealed trait CertificateUsageType extends js.Any
object CertificateUsageType {
  val SIGNING = "SIGNING".asInstanceOf[CertificateUsageType]
  val ENCRYPTION = "ENCRYPTION".asInstanceOf[CertificateUsageType]

  @inline def values: js.Array[CertificateUsageType] = js.Array(SIGNING, ENCRYPTION)
}

@js.native
sealed trait CompressionEnum extends js.Any
object CompressionEnum {
  val ZLIB = "ZLIB".asInstanceOf[CompressionEnum]
  val DISABLED = "DISABLED".asInstanceOf[CompressionEnum]

  @inline def values: js.Array[CompressionEnum] = js.Array(ZLIB, DISABLED)
}

@js.native
sealed trait CustomStepStatus extends js.Any
object CustomStepStatus {
  val SUCCESS = "SUCCESS".asInstanceOf[CustomStepStatus]
  val FAILURE = "FAILURE".asInstanceOf[CustomStepStatus]

  @inline def values: js.Array[CustomStepStatus] = js.Array(SUCCESS, FAILURE)
}

@js.native
sealed trait Domain extends js.Any
object Domain {
  val S3 = "S3".asInstanceOf[Domain]
  val EFS = "EFS".asInstanceOf[Domain]

  @inline def values: js.Array[Domain] = js.Array(S3, EFS)
}

@js.native
sealed trait EncryptionAlg extends js.Any
object EncryptionAlg {
  val AES128_CBC = "AES128_CBC".asInstanceOf[EncryptionAlg]
  val AES192_CBC = "AES192_CBC".asInstanceOf[EncryptionAlg]
  val AES256_CBC = "AES256_CBC".asInstanceOf[EncryptionAlg]
  val NONE = "NONE".asInstanceOf[EncryptionAlg]

  @inline def values: js.Array[EncryptionAlg] = js.Array(AES128_CBC, AES192_CBC, AES256_CBC, NONE)
}

@js.native
sealed trait EndpointType extends js.Any
object EndpointType {
  val PUBLIC = "PUBLIC".asInstanceOf[EndpointType]
  val VPC = "VPC".asInstanceOf[EndpointType]
  val VPC_ENDPOINT = "VPC_ENDPOINT".asInstanceOf[EndpointType]

  @inline def values: js.Array[EndpointType] = js.Array(PUBLIC, VPC, VPC_ENDPOINT)
}

@js.native
sealed trait ExecutionErrorType extends js.Any
object ExecutionErrorType {
  val PERMISSION_DENIED = "PERMISSION_DENIED".asInstanceOf[ExecutionErrorType]
  val CUSTOM_STEP_FAILED = "CUSTOM_STEP_FAILED".asInstanceOf[ExecutionErrorType]
  val THROTTLED = "THROTTLED".asInstanceOf[ExecutionErrorType]
  val ALREADY_EXISTS = "ALREADY_EXISTS".asInstanceOf[ExecutionErrorType]
  val NOT_FOUND = "NOT_FOUND".asInstanceOf[ExecutionErrorType]
  val BAD_REQUEST = "BAD_REQUEST".asInstanceOf[ExecutionErrorType]
  val TIMEOUT = "TIMEOUT".asInstanceOf[ExecutionErrorType]
  val INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR".asInstanceOf[ExecutionErrorType]

  @inline def values: js.Array[ExecutionErrorType] = js.Array(PERMISSION_DENIED, CUSTOM_STEP_FAILED, THROTTLED, ALREADY_EXISTS, NOT_FOUND, BAD_REQUEST, TIMEOUT, INTERNAL_SERVER_ERROR)
}

@js.native
sealed trait ExecutionStatus extends js.Any
object ExecutionStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ExecutionStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ExecutionStatus]
  val EXCEPTION = "EXCEPTION".asInstanceOf[ExecutionStatus]
  val HANDLING_EXCEPTION = "HANDLING_EXCEPTION".asInstanceOf[ExecutionStatus]

  @inline def values: js.Array[ExecutionStatus] = js.Array(IN_PROGRESS, COMPLETED, EXCEPTION, HANDLING_EXCEPTION)
}

@js.native
sealed trait HomeDirectoryType extends js.Any
object HomeDirectoryType {
  val PATH = "PATH".asInstanceOf[HomeDirectoryType]
  val LOGICAL = "LOGICAL".asInstanceOf[HomeDirectoryType]

  @inline def values: js.Array[HomeDirectoryType] = js.Array(PATH, LOGICAL)
}

/** Returns information related to the type of user authentication that is in use for a file transfer protocol-enabled server's users. For <code>AWS_DIRECTORY_SERVICE</code> or <code>SERVICE_MANAGED</code> authentication, the Secure Shell (SSH) public keys are stored with a user on the server instance. For <code>API_GATEWAY</code> authentication, your custom authentication method is implemented by using an API call. The server can have only one method of authentication.
  */
@js.native
sealed trait IdentityProviderType extends js.Any
object IdentityProviderType {
  val SERVICE_MANAGED = "SERVICE_MANAGED".asInstanceOf[IdentityProviderType]
  val API_GATEWAY = "API_GATEWAY".asInstanceOf[IdentityProviderType]
  val AWS_DIRECTORY_SERVICE = "AWS_DIRECTORY_SERVICE".asInstanceOf[IdentityProviderType]
  val AWS_LAMBDA = "AWS_LAMBDA".asInstanceOf[IdentityProviderType]

  @inline def values: js.Array[IdentityProviderType] = js.Array(SERVICE_MANAGED, API_GATEWAY, AWS_DIRECTORY_SERVICE, AWS_LAMBDA)
}

@js.native
sealed trait MdnResponse extends js.Any
object MdnResponse {
  val SYNC = "SYNC".asInstanceOf[MdnResponse]
  val NONE = "NONE".asInstanceOf[MdnResponse]

  @inline def values: js.Array[MdnResponse] = js.Array(SYNC, NONE)
}

@js.native
sealed trait MdnSigningAlg extends js.Any
object MdnSigningAlg {
  val SHA256 = "SHA256".asInstanceOf[MdnSigningAlg]
  val SHA384 = "SHA384".asInstanceOf[MdnSigningAlg]
  val SHA512 = "SHA512".asInstanceOf[MdnSigningAlg]
  val SHA1 = "SHA1".asInstanceOf[MdnSigningAlg]
  val NONE = "NONE".asInstanceOf[MdnSigningAlg]
  val DEFAULT = "DEFAULT".asInstanceOf[MdnSigningAlg]

  @inline def values: js.Array[MdnSigningAlg] = js.Array(SHA256, SHA384, SHA512, SHA1, NONE, DEFAULT)
}

@js.native
sealed trait OverwriteExisting extends js.Any
object OverwriteExisting {
  val TRUE = "TRUE".asInstanceOf[OverwriteExisting]
  val FALSE = "FALSE".asInstanceOf[OverwriteExisting]

  @inline def values: js.Array[OverwriteExisting] = js.Array(TRUE, FALSE)
}

@js.native
sealed trait ProfileType extends js.Any
object ProfileType {
  val LOCAL = "LOCAL".asInstanceOf[ProfileType]
  val PARTNER = "PARTNER".asInstanceOf[ProfileType]

  @inline def values: js.Array[ProfileType] = js.Array(LOCAL, PARTNER)
}

@js.native
sealed trait Protocol extends js.Any
object Protocol {
  val SFTP = "SFTP".asInstanceOf[Protocol]
  val FTP = "FTP".asInstanceOf[Protocol]
  val FTPS = "FTPS".asInstanceOf[Protocol]
  val AS2 = "AS2".asInstanceOf[Protocol]

  @inline def values: js.Array[Protocol] = js.Array(SFTP, FTP, FTPS, AS2)
}

@js.native
sealed trait SetStatOption extends js.Any
object SetStatOption {
  val DEFAULT = "DEFAULT".asInstanceOf[SetStatOption]
  val ENABLE_NO_OP = "ENABLE_NO_OP".asInstanceOf[SetStatOption]

  @inline def values: js.Array[SetStatOption] = js.Array(DEFAULT, ENABLE_NO_OP)
}

@js.native
sealed trait SigningAlg extends js.Any
object SigningAlg {
  val SHA256 = "SHA256".asInstanceOf[SigningAlg]
  val SHA384 = "SHA384".asInstanceOf[SigningAlg]
  val SHA512 = "SHA512".asInstanceOf[SigningAlg]
  val SHA1 = "SHA1".asInstanceOf[SigningAlg]
  val NONE = "NONE".asInstanceOf[SigningAlg]

  @inline def values: js.Array[SigningAlg] = js.Array(SHA256, SHA384, SHA512, SHA1, NONE)
}

/** Describes the condition of a file transfer protocol-enabled server with respect to its ability to perform file operations. There are six possible states: <code>OFFLINE</code>, <code>ONLINE</code>, <code>STARTING</code>, <code>STOPPING</code>, <code>START_FAILED</code>, and <code>STOP_FAILED</code>. <code>OFFLINE</code> indicates that the server exists, but that it is not available for file operations. <code>ONLINE</code> indicates that the server is available to perform file operations. <code>STARTING</code> indicates that the server's was instantiated, but the server is not yet available to perform file operations. Under normal conditions, it can take a couple of minutes for the server to be completely operational. Both <code>START_FAILED</code> and <code>STOP_FAILED</code> are error conditions.
  */
@js.native
sealed trait State extends js.Any
object State {
  val OFFLINE = "OFFLINE".asInstanceOf[State]
  val ONLINE = "ONLINE".asInstanceOf[State]
  val STARTING = "STARTING".asInstanceOf[State]
  val STOPPING = "STOPPING".asInstanceOf[State]
  val START_FAILED = "START_FAILED".asInstanceOf[State]
  val STOP_FAILED = "STOP_FAILED".asInstanceOf[State]

  @inline def values: js.Array[State] = js.Array(OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED, STOP_FAILED)
}

@js.native
sealed trait TlsSessionResumptionMode extends js.Any
object TlsSessionResumptionMode {
  val DISABLED = "DISABLED".asInstanceOf[TlsSessionResumptionMode]
  val ENABLED = "ENABLED".asInstanceOf[TlsSessionResumptionMode]
  val ENFORCED = "ENFORCED".asInstanceOf[TlsSessionResumptionMode]

  @inline def values: js.Array[TlsSessionResumptionMode] = js.Array(DISABLED, ENABLED, ENFORCED)
}

@js.native
sealed trait WorkflowStepType extends js.Any
object WorkflowStepType {
  val COPY = "COPY".asInstanceOf[WorkflowStepType]
  val CUSTOM = "CUSTOM".asInstanceOf[WorkflowStepType]
  val TAG = "TAG".asInstanceOf[WorkflowStepType]
  val DELETE = "DELETE".asInstanceOf[WorkflowStepType]

  @inline def values: js.Array[WorkflowStepType] = js.Array(COPY, CUSTOM, TAG, DELETE)
}
