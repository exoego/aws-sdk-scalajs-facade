package facade.amazonaws.services.transfer

import scalajs._

type Domain = "S3" | "EFS"
object Domain {
  val S3: "S3" = "S3"
  val EFS: "EFS" = "EFS"

  @inline def values = js.Array[Domain](S3, EFS)
}

type EndpointType = "PUBLIC" | "VPC" | "VPC_ENDPOINT"
object EndpointType {
  val PUBLIC: "PUBLIC" = "PUBLIC"
  val VPC: "VPC" = "VPC"
  val VPC_ENDPOINT: "VPC_ENDPOINT" = "VPC_ENDPOINT"

  @inline def values = js.Array[EndpointType](PUBLIC, VPC, VPC_ENDPOINT)
}

type HomeDirectoryType = "PATH" | "LOGICAL"
object HomeDirectoryType {
  val PATH: "PATH" = "PATH"
  val LOGICAL: "LOGICAL" = "LOGICAL"

  @inline def values = js.Array[HomeDirectoryType](PATH, LOGICAL)
}

/** Returns information related to the type of user authentication that is in use for a file transfer protocol-enabled server's users. For <code>SERVICE_MANAGED</code> authentication, the Secure Shell (SSH) public keys are stored with a user on the server instance. For <code>API_GATEWAY</code> authentication, your custom authentication method is implemented by using an API call. The server can have only one method of authentication.
  */
type IdentityProviderType = "SERVICE_MANAGED" | "API_GATEWAY"
object IdentityProviderType {
  val SERVICE_MANAGED: "SERVICE_MANAGED" = "SERVICE_MANAGED"
  val API_GATEWAY: "API_GATEWAY" = "API_GATEWAY"

  @inline def values = js.Array[IdentityProviderType](SERVICE_MANAGED, API_GATEWAY)
}

type Protocol = "SFTP" | "FTP" | "FTPS"
object Protocol {
  val SFTP: "SFTP" = "SFTP"
  val FTP: "FTP" = "FTP"
  val FTPS: "FTPS" = "FTPS"

  @inline def values = js.Array[Protocol](SFTP, FTP, FTPS)
}

/** Describes the condition of a file transfer protocol-enabled server with respect to its ability to perform file operations. There are six possible states: <code>OFFLINE</code>, <code>ONLINE</code>, <code>STARTING</code>, <code>STOPPING</code>, <code>START_FAILED</code>, and <code>STOP_FAILED</code>. <code>OFFLINE</code> indicates that the server exists, but that it is not available for file operations. <code>ONLINE</code> indicates that the server is available to perform file operations. <code>STARTING</code> indicates that the server's was instantiated, but the server is not yet available to perform file operations. Under normal conditions, it can take a couple of minutes for the server to be completely operational. Both <code>START_FAILED</code> and <code>STOP_FAILED</code> are error conditions.
  */
type State = "OFFLINE" | "ONLINE" | "STARTING" | "STOPPING" | "START_FAILED" | "STOP_FAILED"
object State {
  val OFFLINE: "OFFLINE" = "OFFLINE"
  val ONLINE: "ONLINE" = "ONLINE"
  val STARTING: "STARTING" = "STARTING"
  val STOPPING: "STOPPING" = "STOPPING"
  val START_FAILED: "START_FAILED" = "START_FAILED"
  val STOP_FAILED: "STOP_FAILED" = "STOP_FAILED"

  @inline def values = js.Array[State](OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED, STOP_FAILED)
}
