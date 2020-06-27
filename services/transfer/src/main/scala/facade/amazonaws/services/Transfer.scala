package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object transfer {
  type AddressAllocationId   = String
  type AddressAllocationIds  = js.Array[AddressAllocationId]
  type Arn                   = String
  type DateImported          = js.Date
  type HomeDirectory         = String
  type HomeDirectoryMappings = js.Array[HomeDirectoryMapEntry]
  type HostKey               = String
  type HostKeyFingerprint    = String
  type ListedServers         = js.Array[ListedServer]
  type ListedUsers           = js.Array[ListedUser]
  type MapEntry              = String
  type MapTarget             = String
  type MaxResults            = Int
  type Message               = String
  type NextToken             = String
  type NullableRole          = String
  type Policy                = String
  type Response              = String
  type Role                  = String
  type ServerId              = String
  type SshPublicKeyBody      = String
  type SshPublicKeyCount     = Int
  type SshPublicKeyId        = String
  type SshPublicKeys         = js.Array[SshPublicKey]
  type StatusCode            = Int
  type SubnetId              = String
  type SubnetIds             = js.Array[SubnetId]
  type TagKey                = String
  type TagKeys               = js.Array[TagKey]
  type TagValue              = String
  type Tags                  = js.Array[Tag]
  type Url                   = String
  type UserCount             = Int
  type UserName              = String
  type UserPassword          = String
  type VpcEndpointId         = String
  type VpcId                 = String

  implicit final class TransferOps(private val service: Transfer) extends AnyVal {

    @inline def createServerFuture(params: CreateServerRequest): Future[CreateServerResponse] =
      service.createServer(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise().toFuture
    @inline def deleteServerFuture(params: DeleteServerRequest): Future[js.Object] =
      service.deleteServer(params).promise().toFuture
    @inline def deleteSshPublicKeyFuture(params: DeleteSshPublicKeyRequest): Future[js.Object] =
      service.deleteSshPublicKey(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] =
      service.deleteUser(params).promise().toFuture
    @inline def describeServerFuture(params: DescribeServerRequest): Future[DescribeServerResponse] =
      service.describeServer(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] =
      service.describeUser(params).promise().toFuture
    @inline def importSshPublicKeyFuture(params: ImportSshPublicKeyRequest): Future[ImportSshPublicKeyResponse] =
      service.importSshPublicKey(params).promise().toFuture
    @inline def listServersFuture(params: ListServersRequest): Future[ListServersResponse] =
      service.listServers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise().toFuture
    @inline def startServerFuture(params: StartServerRequest): Future[js.Object] =
      service.startServer(params).promise().toFuture
    @inline def stopServerFuture(params: StopServerRequest): Future[js.Object] =
      service.stopServer(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def testIdentityProviderFuture(params: TestIdentityProviderRequest): Future[TestIdentityProviderResponse] =
      service.testIdentityProvider(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateServerFuture(params: UpdateServerRequest): Future[UpdateServerResponse] =
      service.updateServer(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] =
      service.updateUser(params).promise().toFuture
  }
}

package transfer {
  @js.native
  @JSImport("aws-sdk", "Transfer")
  class Transfer() extends js.Object {
    def this(config: AWSConfig) = this()

    def createServer(params: CreateServerRequest): Request[CreateServerResponse]                         = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse]                               = js.native
    def deleteServer(params: DeleteServerRequest): Request[js.Object]                                    = js.native
    def deleteSshPublicKey(params: DeleteSshPublicKeyRequest): Request[js.Object]                        = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object]                                        = js.native
    def describeServer(params: DescribeServerRequest): Request[DescribeServerResponse]                   = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse]                         = js.native
    def importSshPublicKey(params: ImportSshPublicKeyRequest): Request[ImportSshPublicKeyResponse]       = js.native
    def listServers(params: ListServersRequest): Request[ListServersResponse]                            = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                  = js.native
    def startServer(params: StartServerRequest): Request[js.Object]                                      = js.native
    def stopServer(params: StopServerRequest): Request[js.Object]                                        = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                      = js.native
    def testIdentityProvider(params: TestIdentityProviderRequest): Request[TestIdentityProviderResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                  = js.native
    def updateServer(params: UpdateServerRequest): Request[UpdateServerResponse]                         = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse]                               = js.native
  }

  @js.native
  @Factory
  trait CreateServerRequest extends js.Object {
    var EndpointDetails: js.UndefOr[EndpointDetails]
    var EndpointType: js.UndefOr[EndpointType]
    var HostKey: js.UndefOr[HostKey]
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var LoggingRole: js.UndefOr[Role]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateServerResponse extends js.Object {
    var ServerId: ServerId
  }

  @js.native
  @Factory
  trait CreateUserRequest extends js.Object {
    var Role: Role
    var ServerId: ServerId
    var UserName: UserName
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings]
    var HomeDirectoryType: js.UndefOr[HomeDirectoryType]
    var Policy: js.UndefOr[Policy]
    var SshPublicKeyBody: js.UndefOr[SshPublicKeyBody]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateUserResponse extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
  }

  @js.native
  @Factory
  trait DeleteServerRequest extends js.Object {
    var ServerId: ServerId
  }

  @js.native
  @Factory
  trait DeleteSshPublicKeyRequest extends js.Object {
    var ServerId: ServerId
    var SshPublicKeyId: SshPublicKeyId
    var UserName: UserName
  }

  @js.native
  @Factory
  trait DeleteUserRequest extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
  }

  @js.native
  @Factory
  trait DescribeServerRequest extends js.Object {
    var ServerId: ServerId
  }

  @js.native
  @Factory
  trait DescribeServerResponse extends js.Object {
    var Server: DescribedServer
  }

  @js.native
  @Factory
  trait DescribeUserRequest extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
  }

  @js.native
  @Factory
  trait DescribeUserResponse extends js.Object {
    var ServerId: ServerId
    var User: DescribedUser
  }

  /**
    * Describes the properties of the server that was specified. Information returned includes the following: the server Amazon Resource Name (ARN), the authentication configuration and type, the logging role, the server ID and state, and assigned tags or metadata.
    */
  @js.native
  @Factory
  trait DescribedServer extends js.Object {
    var Arn: Arn
    var EndpointDetails: js.UndefOr[EndpointDetails]
    var EndpointType: js.UndefOr[EndpointType]
    var HostKeyFingerprint: js.UndefOr[HostKeyFingerprint]
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var LoggingRole: js.UndefOr[Role]
    var ServerId: js.UndefOr[ServerId]
    var State: js.UndefOr[State]
    var Tags: js.UndefOr[Tags]
    var UserCount: js.UndefOr[UserCount]
  }

  /**
    * Returns properties of the user that you want to describe.
    */
  @js.native
  @Factory
  trait DescribedUser extends js.Object {
    var Arn: Arn
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings]
    var HomeDirectoryType: js.UndefOr[HomeDirectoryType]
    var Policy: js.UndefOr[Policy]
    var Role: js.UndefOr[Role]
    var SshPublicKeys: js.UndefOr[SshPublicKeys]
    var Tags: js.UndefOr[Tags]
    var UserName: js.UndefOr[UserName]
  }

  /**
    * The virtual private cloud (VPC) endpoint settings that are configured for your SFTP server. With a VPC endpoint, you can restrict access to your SFTP server and resources only within your VPC. To control incoming internet traffic, invoke the <code>UpdateServer</code> API and attach an Elastic IP to your server's endpoint.
    */
  @js.native
  @Factory
  trait EndpointDetails extends js.Object {
    var AddressAllocationIds: js.UndefOr[AddressAllocationIds]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcEndpointId: js.UndefOr[VpcEndpointId]
    var VpcId: js.UndefOr[VpcId]
  }

  @js.native
  sealed trait EndpointType extends js.Any
  object EndpointType extends js.Object {
    val PUBLIC       = "PUBLIC".asInstanceOf[EndpointType]
    val VPC          = "VPC".asInstanceOf[EndpointType]
    val VPC_ENDPOINT = "VPC_ENDPOINT".asInstanceOf[EndpointType]

    val values = js.Object.freeze(js.Array(PUBLIC, VPC, VPC_ENDPOINT))
  }

  /**
    * Represents an object that contains entries and a targets for <code>HomeDirectoryMappings</code>.
    */
  @js.native
  @Factory
  trait HomeDirectoryMapEntry extends js.Object {
    var Entry: MapEntry
    var Target: MapTarget
  }

  @js.native
  sealed trait HomeDirectoryType extends js.Any
  object HomeDirectoryType extends js.Object {
    val PATH    = "PATH".asInstanceOf[HomeDirectoryType]
    val LOGICAL = "LOGICAL".asInstanceOf[HomeDirectoryType]

    val values = js.Object.freeze(js.Array(PATH, LOGICAL))
  }

  /**
    * Returns information related to the type of user authentication that is in use for a server's users. A server can have only one method of authentication.
    */
  @js.native
  @Factory
  trait IdentityProviderDetails extends js.Object {
    var InvocationRole: js.UndefOr[Role]
    var Url: js.UndefOr[Url]
  }

  /**
    * Returns information related to the type of user authentication that is in use for a server's users. For <code>SERVICE_MANAGED</code> authentication, the Secure Shell (SSH) public keys are stored with a user on an SFTP server instance. For <code>API_GATEWAY</code> authentication, your custom authentication method is implemented by using an API call. A server can have only one method of authentication.
    */
  @js.native
  sealed trait IdentityProviderType extends js.Any
  object IdentityProviderType extends js.Object {
    val SERVICE_MANAGED = "SERVICE_MANAGED".asInstanceOf[IdentityProviderType]
    val API_GATEWAY     = "API_GATEWAY".asInstanceOf[IdentityProviderType]

    val values = js.Object.freeze(js.Array(SERVICE_MANAGED, API_GATEWAY))
  }

  @js.native
  @Factory
  trait ImportSshPublicKeyRequest extends js.Object {
    var ServerId: ServerId
    var SshPublicKeyBody: SshPublicKeyBody
    var UserName: UserName
  }

  /**
    * This response identifies the user, the server they belong to, and the identifier of the SSH public key associated with that user. A user can have more than one key on each server that they are associated with.
    */
  @js.native
  @Factory
  trait ImportSshPublicKeyResponse extends js.Object {
    var ServerId: ServerId
    var SshPublicKeyId: SshPublicKeyId
    var UserName: UserName
  }

  @js.native
  @Factory
  trait ListServersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListServersResponse extends js.Object {
    var Servers: ListedServers
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var Arn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait ListUsersRequest extends js.Object {
    var ServerId: ServerId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListUsersResponse extends js.Object {
    var ServerId: ServerId
    var Users: ListedUsers
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Returns properties of the server that was specified.
    */
  @js.native
  @Factory
  trait ListedServer extends js.Object {
    var Arn: Arn
    var EndpointType: js.UndefOr[EndpointType]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var LoggingRole: js.UndefOr[Role]
    var ServerId: js.UndefOr[ServerId]
    var State: js.UndefOr[State]
    var UserCount: js.UndefOr[UserCount]
  }

  /**
    * Returns properties of the user that you specify.
    */
  @js.native
  @Factory
  trait ListedUser extends js.Object {
    var Arn: Arn
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var HomeDirectoryType: js.UndefOr[HomeDirectoryType]
    var Role: js.UndefOr[Role]
    var SshPublicKeyCount: js.UndefOr[SshPublicKeyCount]
    var UserName: js.UndefOr[UserName]
  }

  /**
    * Provides information about the public Secure Shell (SSH) key that is associated with a user account for a specific server (as identified by <code>ServerId</code>). The information returned includes the date the key was imported, the public key contents, and the public key ID. A user can store more than one SSH public key associated with their user name on a specific SFTP server.
    */
  @js.native
  @Factory
  trait SshPublicKey extends js.Object {
    var DateImported: DateImported
    var SshPublicKeyBody: SshPublicKeyBody
    var SshPublicKeyId: SshPublicKeyId
  }

  @js.native
  @Factory
  trait StartServerRequest extends js.Object {
    var ServerId: ServerId
  }

  /**
    * Describes the condition of the SFTP server with respect to its ability to perform file operations. There are six possible states: <code>OFFLINE</code>, <code>ONLINE</code>, <code>STARTING</code>, <code>STOPPING</code>, <code>START_FAILED</code>, and <code>STOP_FAILED</code>.
    *  <code>OFFLINE</code> indicates that the SFTP server exists, but that it is not available for file operations. <code>ONLINE</code> indicates that the SFTP server is available to perform file operations. <code>STARTING</code> indicates that the SFTP server's was instantiated, but the server is not yet available to perform file operations. Under normal conditions, it can take a couple of minutes for an SFTP server to be completely operational. Both <code>START_FAILED</code> and <code>STOP_FAILED</code> are error conditions.
    */
  @js.native
  sealed trait State extends js.Any
  object State extends js.Object {
    val OFFLINE      = "OFFLINE".asInstanceOf[State]
    val ONLINE       = "ONLINE".asInstanceOf[State]
    val STARTING     = "STARTING".asInstanceOf[State]
    val STOPPING     = "STOPPING".asInstanceOf[State]
    val START_FAILED = "START_FAILED".asInstanceOf[State]
    val STOP_FAILED  = "STOP_FAILED".asInstanceOf[State]

    val values = js.Object.freeze(js.Array(OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED, STOP_FAILED))
  }

  @js.native
  @Factory
  trait StopServerRequest extends js.Object {
    var ServerId: ServerId
  }

  /**
    * Creates a key-value pair for a specific resource. Tags are metadata that you can use to search for and group a resource for various purposes. You can apply tags to servers, users, and roles. A tag key can take more than one value. For example, to group servers for accounting purposes, you might create a tag called <code>Group</code> and assign the values <code>Research</code> and <code>Accounting</code> to that group.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var Arn: Arn
    var Tags: Tags
  }

  @js.native
  @Factory
  trait TestIdentityProviderRequest extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
    var UserPassword: js.UndefOr[UserPassword]
  }

  @js.native
  @Factory
  trait TestIdentityProviderResponse extends js.Object {
    var StatusCode: StatusCode
    var Url: Url
    var Message: js.UndefOr[Message]
    var Response: js.UndefOr[Response]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var Arn: Arn
    var TagKeys: TagKeys
  }

  @js.native
  @Factory
  trait UpdateServerRequest extends js.Object {
    var ServerId: ServerId
    var EndpointDetails: js.UndefOr[EndpointDetails]
    var EndpointType: js.UndefOr[EndpointType]
    var HostKey: js.UndefOr[HostKey]
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var LoggingRole: js.UndefOr[NullableRole]
  }

  @js.native
  @Factory
  trait UpdateServerResponse extends js.Object {
    var ServerId: ServerId
  }

  @js.native
  @Factory
  trait UpdateUserRequest extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings]
    var HomeDirectoryType: js.UndefOr[HomeDirectoryType]
    var Policy: js.UndefOr[Policy]
    var Role: js.UndefOr[Role]
  }

  /**
    * <code>UpdateUserResponse</code> returns the user name and server identifier for the request to update a user's properties.
    */
  @js.native
  @Factory
  trait UpdateUserResponse extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
  }
}
