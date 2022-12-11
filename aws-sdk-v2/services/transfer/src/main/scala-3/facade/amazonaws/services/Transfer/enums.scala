package facade.amazonaws.services.transfer

import scalajs.js

type AgreementStatusType = "ACTIVE" | "INACTIVE"
object AgreementStatusType {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[AgreementStatusType] = js.Array(ACTIVE, INACTIVE)
}

type As2Transport = "HTTP"
object As2Transport {
  inline val HTTP: "HTTP" = "HTTP"

  inline def values: js.Array[As2Transport] = js.Array(HTTP)
}

type CertificateStatusType = "ACTIVE" | "PENDING_ROTATION" | "INACTIVE"
object CertificateStatusType {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val PENDING_ROTATION: "PENDING_ROTATION" = "PENDING_ROTATION"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[CertificateStatusType] = js.Array(ACTIVE, PENDING_ROTATION, INACTIVE)
}

type CertificateType = "CERTIFICATE" | "CERTIFICATE_WITH_PRIVATE_KEY"
object CertificateType {
  inline val CERTIFICATE: "CERTIFICATE" = "CERTIFICATE"
  inline val CERTIFICATE_WITH_PRIVATE_KEY: "CERTIFICATE_WITH_PRIVATE_KEY" = "CERTIFICATE_WITH_PRIVATE_KEY"

  inline def values: js.Array[CertificateType] = js.Array(CERTIFICATE, CERTIFICATE_WITH_PRIVATE_KEY)
}

type CertificateUsageType = "SIGNING" | "ENCRYPTION"
object CertificateUsageType {
  inline val SIGNING: "SIGNING" = "SIGNING"
  inline val ENCRYPTION: "ENCRYPTION" = "ENCRYPTION"

  inline def values: js.Array[CertificateUsageType] = js.Array(SIGNING, ENCRYPTION)
}

type CompressionEnum = "ZLIB" | "DISABLED"
object CompressionEnum {
  inline val ZLIB: "ZLIB" = "ZLIB"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[CompressionEnum] = js.Array(ZLIB, DISABLED)
}

type CustomStepStatus = "SUCCESS" | "FAILURE"
object CustomStepStatus {
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILURE: "FAILURE" = "FAILURE"

  inline def values: js.Array[CustomStepStatus] = js.Array(SUCCESS, FAILURE)
}

type Domain = "S3" | "EFS"
object Domain {
  inline val S3: "S3" = "S3"
  inline val EFS: "EFS" = "EFS"

  inline def values: js.Array[Domain] = js.Array(S3, EFS)
}

type EncryptionAlg = "AES128_CBC" | "AES192_CBC" | "AES256_CBC" | "NONE"
object EncryptionAlg {
  inline val AES128_CBC: "AES128_CBC" = "AES128_CBC"
  inline val AES192_CBC: "AES192_CBC" = "AES192_CBC"
  inline val AES256_CBC: "AES256_CBC" = "AES256_CBC"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[EncryptionAlg] = js.Array(AES128_CBC, AES192_CBC, AES256_CBC, NONE)
}

type EndpointType = "PUBLIC" | "VPC" | "VPC_ENDPOINT"
object EndpointType {
  inline val PUBLIC: "PUBLIC" = "PUBLIC"
  inline val VPC: "VPC" = "VPC"
  inline val VPC_ENDPOINT: "VPC_ENDPOINT" = "VPC_ENDPOINT"

  inline def values: js.Array[EndpointType] = js.Array(PUBLIC, VPC, VPC_ENDPOINT)
}

type ExecutionErrorType = "PERMISSION_DENIED" | "CUSTOM_STEP_FAILED" | "THROTTLED" | "ALREADY_EXISTS" | "NOT_FOUND" | "BAD_REQUEST" | "TIMEOUT" | "INTERNAL_SERVER_ERROR"
object ExecutionErrorType {
  inline val PERMISSION_DENIED: "PERMISSION_DENIED" = "PERMISSION_DENIED"
  inline val CUSTOM_STEP_FAILED: "CUSTOM_STEP_FAILED" = "CUSTOM_STEP_FAILED"
  inline val THROTTLED: "THROTTLED" = "THROTTLED"
  inline val ALREADY_EXISTS: "ALREADY_EXISTS" = "ALREADY_EXISTS"
  inline val NOT_FOUND: "NOT_FOUND" = "NOT_FOUND"
  inline val BAD_REQUEST: "BAD_REQUEST" = "BAD_REQUEST"
  inline val TIMEOUT: "TIMEOUT" = "TIMEOUT"
  inline val INTERNAL_SERVER_ERROR: "INTERNAL_SERVER_ERROR" = "INTERNAL_SERVER_ERROR"

  inline def values: js.Array[ExecutionErrorType] = js.Array(PERMISSION_DENIED, CUSTOM_STEP_FAILED, THROTTLED, ALREADY_EXISTS, NOT_FOUND, BAD_REQUEST, TIMEOUT, INTERNAL_SERVER_ERROR)
}

type ExecutionStatus = "IN_PROGRESS" | "COMPLETED" | "EXCEPTION" | "HANDLING_EXCEPTION"
object ExecutionStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val EXCEPTION: "EXCEPTION" = "EXCEPTION"
  inline val HANDLING_EXCEPTION: "HANDLING_EXCEPTION" = "HANDLING_EXCEPTION"

  inline def values: js.Array[ExecutionStatus] = js.Array(IN_PROGRESS, COMPLETED, EXCEPTION, HANDLING_EXCEPTION)
}

type HomeDirectoryType = "PATH" | "LOGICAL"
object HomeDirectoryType {
  inline val PATH: "PATH" = "PATH"
  inline val LOGICAL: "LOGICAL" = "LOGICAL"

  inline def values: js.Array[HomeDirectoryType] = js.Array(PATH, LOGICAL)
}

/** Returns information related to the type of user authentication that is in use for a file transfer protocol-enabled server's users. For <code>AWS_DIRECTORY_SERVICE</code> or <code>SERVICE_MANAGED</code> authentication, the Secure Shell (SSH) public keys are stored with a user on the server instance. For <code>API_GATEWAY</code> authentication, your custom authentication method is implemented by using an API call. The server can have only one method of authentication.
  */
type IdentityProviderType = "SERVICE_MANAGED" | "API_GATEWAY" | "AWS_DIRECTORY_SERVICE" | "AWS_LAMBDA"
object IdentityProviderType {
  inline val SERVICE_MANAGED: "SERVICE_MANAGED" = "SERVICE_MANAGED"
  inline val API_GATEWAY: "API_GATEWAY" = "API_GATEWAY"
  inline val AWS_DIRECTORY_SERVICE: "AWS_DIRECTORY_SERVICE" = "AWS_DIRECTORY_SERVICE"
  inline val AWS_LAMBDA: "AWS_LAMBDA" = "AWS_LAMBDA"

  inline def values: js.Array[IdentityProviderType] = js.Array(SERVICE_MANAGED, API_GATEWAY, AWS_DIRECTORY_SERVICE, AWS_LAMBDA)
}

type MdnResponse = "SYNC" | "NONE"
object MdnResponse {
  inline val SYNC: "SYNC" = "SYNC"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[MdnResponse] = js.Array(SYNC, NONE)
}

type MdnSigningAlg = "SHA256" | "SHA384" | "SHA512" | "SHA1" | "NONE" | "DEFAULT"
object MdnSigningAlg {
  inline val SHA256: "SHA256" = "SHA256"
  inline val SHA384: "SHA384" = "SHA384"
  inline val SHA512: "SHA512" = "SHA512"
  inline val SHA1: "SHA1" = "SHA1"
  inline val NONE: "NONE" = "NONE"
  inline val DEFAULT: "DEFAULT" = "DEFAULT"

  inline def values: js.Array[MdnSigningAlg] = js.Array(SHA256, SHA384, SHA512, SHA1, NONE, DEFAULT)
}

type OverwriteExisting = "TRUE" | "FALSE"
object OverwriteExisting {
  inline val TRUE: "TRUE" = "TRUE"
  inline val FALSE: "FALSE" = "FALSE"

  inline def values: js.Array[OverwriteExisting] = js.Array(TRUE, FALSE)
}

type ProfileType = "LOCAL" | "PARTNER"
object ProfileType {
  inline val LOCAL: "LOCAL" = "LOCAL"
  inline val PARTNER: "PARTNER" = "PARTNER"

  inline def values: js.Array[ProfileType] = js.Array(LOCAL, PARTNER)
}

type Protocol = "SFTP" | "FTP" | "FTPS" | "AS2"
object Protocol {
  inline val SFTP: "SFTP" = "SFTP"
  inline val FTP: "FTP" = "FTP"
  inline val FTPS: "FTPS" = "FTPS"
  inline val AS2: "AS2" = "AS2"

  inline def values: js.Array[Protocol] = js.Array(SFTP, FTP, FTPS, AS2)
}

type SetStatOption = "DEFAULT" | "ENABLE_NO_OP"
object SetStatOption {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val ENABLE_NO_OP: "ENABLE_NO_OP" = "ENABLE_NO_OP"

  inline def values: js.Array[SetStatOption] = js.Array(DEFAULT, ENABLE_NO_OP)
}

type SigningAlg = "SHA256" | "SHA384" | "SHA512" | "SHA1" | "NONE"
object SigningAlg {
  inline val SHA256: "SHA256" = "SHA256"
  inline val SHA384: "SHA384" = "SHA384"
  inline val SHA512: "SHA512" = "SHA512"
  inline val SHA1: "SHA1" = "SHA1"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[SigningAlg] = js.Array(SHA256, SHA384, SHA512, SHA1, NONE)
}

/** Describes the condition of a file transfer protocol-enabled server with respect to its ability to perform file operations. There are six possible states: <code>OFFLINE</code>, <code>ONLINE</code>, <code>STARTING</code>, <code>STOPPING</code>, <code>START_FAILED</code>, and <code>STOP_FAILED</code>. <code>OFFLINE</code> indicates that the server exists, but that it is not available for file operations. <code>ONLINE</code> indicates that the server is available to perform file operations. <code>STARTING</code> indicates that the server's was instantiated, but the server is not yet available to perform file operations. Under normal conditions, it can take a couple of minutes for the server to be completely operational. Both <code>START_FAILED</code> and <code>STOP_FAILED</code> are error conditions.
  */
type State = "OFFLINE" | "ONLINE" | "STARTING" | "STOPPING" | "START_FAILED" | "STOP_FAILED"
object State {
  inline val OFFLINE: "OFFLINE" = "OFFLINE"
  inline val ONLINE: "ONLINE" = "ONLINE"
  inline val STARTING: "STARTING" = "STARTING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val START_FAILED: "START_FAILED" = "START_FAILED"
  inline val STOP_FAILED: "STOP_FAILED" = "STOP_FAILED"

  inline def values: js.Array[State] = js.Array(OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED, STOP_FAILED)
}

type TlsSessionResumptionMode = "DISABLED" | "ENABLED" | "ENFORCED"
object TlsSessionResumptionMode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val ENFORCED: "ENFORCED" = "ENFORCED"

  inline def values: js.Array[TlsSessionResumptionMode] = js.Array(DISABLED, ENABLED, ENFORCED)
}

type WorkflowStepType = "COPY" | "CUSTOM" | "TAG" | "DELETE"
object WorkflowStepType {
  inline val COPY: "COPY" = "COPY"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"
  inline val TAG: "TAG" = "TAG"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[WorkflowStepType] = js.Array(COPY, CUSTOM, TAG, DELETE)
}
