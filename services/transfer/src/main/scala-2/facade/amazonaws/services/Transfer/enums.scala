package facade.amazonaws.services.transfer

import scalajs.js

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

  @inline def values: js.Array[ExecutionErrorType] = js.Array(PERMISSION_DENIED)
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
sealed trait OverwriteExisting extends js.Any
object OverwriteExisting {
  val TRUE = "TRUE".asInstanceOf[OverwriteExisting]
  val FALSE = "FALSE".asInstanceOf[OverwriteExisting]

  @inline def values: js.Array[OverwriteExisting] = js.Array(TRUE, FALSE)
}

@js.native
sealed trait Protocol extends js.Any
object Protocol {
  val SFTP = "SFTP".asInstanceOf[Protocol]
  val FTP = "FTP".asInstanceOf[Protocol]
  val FTPS = "FTPS".asInstanceOf[Protocol]

  @inline def values: js.Array[Protocol] = js.Array(SFTP, FTP, FTPS)
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
