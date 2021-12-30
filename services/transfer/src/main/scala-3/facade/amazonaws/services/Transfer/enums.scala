package facade.amazonaws.services.transfer

import scalajs.js

type Domain = "S3" | "EFS"
object Domain {
  inline val S3: "S3" = "S3"
  inline val EFS: "EFS" = "EFS"

  inline def values: js.Array[Domain] = js.Array(S3, EFS)
}

type EndpointType = "PUBLIC" | "VPC" | "VPC_ENDPOINT"
object EndpointType {
  inline val PUBLIC: "PUBLIC" = "PUBLIC"
  inline val VPC: "VPC" = "VPC"
  inline val VPC_ENDPOINT: "VPC_ENDPOINT" = "VPC_ENDPOINT"

  inline def values: js.Array[EndpointType] = js.Array(PUBLIC, VPC, VPC_ENDPOINT)
}

type HomeDirectoryType = "PATH" | "LOGICAL"
object HomeDirectoryType {
  inline val PATH: "PATH" = "PATH"
  inline val LOGICAL: "LOGICAL" = "LOGICAL"

  inline def values: js.Array[HomeDirectoryType] = js.Array(PATH, LOGICAL)
}

/** Returns information related to the type of user authentication that is in use for a file transfer protocol-enabled server's users. For <code>SERVICE_MANAGED</code> authentication, the Secure Shell (SSH) public keys are stored with a user on the server instance. For <code>API_GATEWAY</code> authentication, your custom authentication method is implemented by using an API call. The server can have only one method of authentication.
  */
type IdentityProviderType = "SERVICE_MANAGED" | "API_GATEWAY"
object IdentityProviderType {
  inline val SERVICE_MANAGED: "SERVICE_MANAGED" = "SERVICE_MANAGED"
  inline val API_GATEWAY: "API_GATEWAY" = "API_GATEWAY"

  inline def values: js.Array[IdentityProviderType] = js.Array(SERVICE_MANAGED, API_GATEWAY)
}

type Protocol = "SFTP" | "FTP" | "FTPS"
object Protocol {
  inline val SFTP: "SFTP" = "SFTP"
  inline val FTP: "FTP" = "FTP"
  inline val FTPS: "FTPS" = "FTPS"

  inline def values: js.Array[Protocol] = js.Array(SFTP, FTP, FTPS)
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
