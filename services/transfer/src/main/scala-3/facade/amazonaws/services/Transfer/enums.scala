package facade.amazonaws.services.transfer

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait Domain extends js.Any
object Domain {
  val S3 = "S3".asInstanceOf[Domain]
  val EFS = "EFS".asInstanceOf[Domain]

  @inline def values = js.Array(S3, EFS)
}

@js.native
sealed trait EndpointType extends js.Any
object EndpointType {
  val PUBLIC = "PUBLIC".asInstanceOf[EndpointType]
  val VPC = "VPC".asInstanceOf[EndpointType]
  val VPC_ENDPOINT = "VPC_ENDPOINT".asInstanceOf[EndpointType]

  @inline def values = js.Array(PUBLIC, VPC, VPC_ENDPOINT)
}

@js.native
sealed trait HomeDirectoryType extends js.Any
object HomeDirectoryType {
  val PATH = "PATH".asInstanceOf[HomeDirectoryType]
  val LOGICAL = "LOGICAL".asInstanceOf[HomeDirectoryType]

  @inline def values = js.Array(PATH, LOGICAL)
}

/** Returns information related to the type of user authentication that is in use for a file transfer protocol-enabled server's users. For <code>SERVICE_MANAGED</code> authentication, the Secure Shell (SSH) public keys are stored with a user on the server instance. For <code>API_GATEWAY</code> authentication, your custom authentication method is implemented by using an API call. The server can have only one method of authentication.
  */
@js.native
sealed trait IdentityProviderType extends js.Any
object IdentityProviderType {
  val SERVICE_MANAGED = "SERVICE_MANAGED".asInstanceOf[IdentityProviderType]
  val API_GATEWAY = "API_GATEWAY".asInstanceOf[IdentityProviderType]

  @inline def values = js.Array(SERVICE_MANAGED, API_GATEWAY)
}

@js.native
sealed trait Protocol extends js.Any
object Protocol {
  val SFTP = "SFTP".asInstanceOf[Protocol]
  val FTP = "FTP".asInstanceOf[Protocol]
  val FTPS = "FTPS".asInstanceOf[Protocol]

  @inline def values = js.Array(SFTP, FTP, FTPS)
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

  @inline def values = js.Array(OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED, STOP_FAILED)
}
