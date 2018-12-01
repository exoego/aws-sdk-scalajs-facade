package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object transfer {
  type Arn = String
  type DateImported = js.Date
  type HomeDirectory = String
  type IdentityProviderType = String
  type ListedServers = js.Array[ListedServer]
  type ListedUsers = js.Array[ListedUser]
  type MaxResults = Int
  type Message = String
  type NextToken = String
  type NullableRole = String
  type Policy = String
  type Role = String
  type ServerId = String
  type SshPublicKeyBody = String
  type SshPublicKeyCount = Int
  type SshPublicKeyId = String
  type SshPublicKeys = js.Array[SshPublicKey]
  type State = String
  type StatusCode = Int
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type Url = String
  type UserCount = Int
  type UserName = String
  type UserPassword = String
}

package transfer {
  @js.native
  @JSImport("aws-sdk", "Transfer")
  class Transfer(config: AWSConfig) extends js.Object {
    def createServer(params: CreateServerRequest): Request[CreateServerResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def deleteServer(params: DeleteServerRequest): Request[js.Object] = js.native
    def deleteSshPublicKey(params: DeleteSshPublicKeyRequest): Request[js.Object] = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object] = js.native
    def describeServer(params: DescribeServerRequest): Request[DescribeServerResponse] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def importSshPublicKey(params: ImportSshPublicKeyRequest): Request[ImportSshPublicKeyResponse] = js.native
    def listServers(params: ListServersRequest): Request[ListServersResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def startServer(params: StartServerRequest): Request[js.Object] = js.native
    def stopServer(params: StopServerRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def testIdentityProvider(params: TestIdentityProviderRequest): Request[TestIdentityProviderResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateServer(params: UpdateServerRequest): Request[UpdateServerResponse] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse] = js.native
  }

  @js.native
  trait CreateServerRequest extends js.Object {
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var LoggingRole: js.UndefOr[Role]
    var Tags: js.UndefOr[Tags]
  }

  object CreateServerRequest {
    def apply(
      IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
      IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined,
      LoggingRole: js.UndefOr[Role] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): CreateServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityProviderDetails" -> IdentityProviderDetails.map { x => x.asInstanceOf[js.Any] },
        "IdentityProviderType" -> IdentityProviderType.map { x => x.asInstanceOf[js.Any] },
        "LoggingRole" -> LoggingRole.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServerRequest]
    }
  }

  @js.native
  trait CreateServerResponse extends js.Object {
    var ServerId: js.UndefOr[ServerId]
  }

  object CreateServerResponse {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined): CreateServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServerResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var UserName: js.UndefOr[UserName]
    var Role: js.UndefOr[Role]
    var SshPublicKeyBody: js.UndefOr[SshPublicKeyBody]
    var Policy: js.UndefOr[Policy]
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var ServerId: js.UndefOr[ServerId]
    var Tags: js.UndefOr[Tags]
  }

  object CreateUserRequest {
    def apply(
      UserName: js.UndefOr[UserName] = js.undefined,
      Role: js.UndefOr[Role] = js.undefined,
      SshPublicKeyBody: js.UndefOr[SshPublicKeyBody] = js.undefined,
      Policy: js.UndefOr[Policy] = js.undefined,
      HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
      ServerId: js.UndefOr[ServerId] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): CreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "SshPublicKeyBody" -> SshPublicKeyBody.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] },
        "HomeDirectory" -> HomeDirectory.map { x => x.asInstanceOf[js.Any] },
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var ServerId: js.UndefOr[ServerId]
    var UserName: js.UndefOr[UserName]
  }

  object CreateUserResponse {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined): CreateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait DeleteServerRequest extends js.Object {
    var ServerId: js.UndefOr[ServerId]
  }

  object DeleteServerRequest {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined): DeleteServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServerRequest]
    }
  }

  @js.native
  trait DeleteSshPublicKeyRequest extends js.Object {
    var ServerId: js.UndefOr[ServerId]
    var SshPublicKeyId: js.UndefOr[SshPublicKeyId]
    var UserName: js.UndefOr[UserName]
  }

  object DeleteSshPublicKeyRequest {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined,
      SshPublicKeyId: js.UndefOr[SshPublicKeyId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined): DeleteSshPublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "SshPublicKeyId" -> SshPublicKeyId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSshPublicKeyRequest]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var ServerId: js.UndefOr[ServerId]
    var UserName: js.UndefOr[UserName]
  }

  object DeleteUserRequest {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DescribeServerRequest extends js.Object {
    var ServerId: js.UndefOr[ServerId]
  }

  object DescribeServerRequest {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined): DescribeServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServerRequest]
    }
  }

  @js.native
  trait DescribeServerResponse extends js.Object {
    var Server: js.UndefOr[DescribedServer]
  }

  object DescribeServerResponse {
    def apply(
      Server: js.UndefOr[DescribedServer] = js.undefined): DescribeServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Server" -> Server.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServerResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var ServerId: js.UndefOr[ServerId]
    var UserName: js.UndefOr[UserName]
  }

  object DescribeUserRequest {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined): DescribeUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var ServerId: js.UndefOr[ServerId]
    var User: js.UndefOr[DescribedUser]
  }

  object DescribeUserResponse {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined,
      User: js.UndefOr[DescribedUser] = js.undefined): DescribeUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserResponse]
    }
  }

  /**
   * <p>Describe the properties of the server that was specified. Information returned includes: the server Amazon Resource Name (ARN), the authentication configuration and type, the logging role, server Id and state, and assigned tags or metadata. </p>
   */
  @js.native
  trait DescribedServer extends js.Object {
    var UserCount: js.UndefOr[UserCount]
    var LoggingRole: js.UndefOr[Role]
    var Arn: js.UndefOr[Arn]
    var ServerId: js.UndefOr[ServerId]
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var Tags: js.UndefOr[Tags]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var State: js.UndefOr[State]
  }

  object DescribedServer {
    def apply(
      UserCount: js.UndefOr[UserCount] = js.undefined,
      LoggingRole: js.UndefOr[Role] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      ServerId: js.UndefOr[ServerId] = js.undefined,
      IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined,
      State: js.UndefOr[State] = js.undefined): DescribedServer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserCount" -> UserCount.map { x => x.asInstanceOf[js.Any] },
        "LoggingRole" -> LoggingRole.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "IdentityProviderDetails" -> IdentityProviderDetails.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "IdentityProviderType" -> IdentityProviderType.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribedServer]
    }
  }

  /**
   * <p>Returns properties of the user that you wish to describe.</p>
   */
  @js.native
  trait DescribedUser extends js.Object {
    var UserName: js.UndefOr[UserName]
    var Role: js.UndefOr[Role]
    var Policy: js.UndefOr[Policy]
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var SshPublicKeys: js.UndefOr[SshPublicKeys]
    var Arn: js.UndefOr[Arn]
    var Tags: js.UndefOr[Tags]
  }

  object DescribedUser {
    def apply(
      UserName: js.UndefOr[UserName] = js.undefined,
      Role: js.UndefOr[Role] = js.undefined,
      Policy: js.UndefOr[Policy] = js.undefined,
      HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
      SshPublicKeys: js.UndefOr[SshPublicKeys] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): DescribedUser = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] },
        "HomeDirectory" -> HomeDirectory.map { x => x.asInstanceOf[js.Any] },
        "SshPublicKeys" -> SshPublicKeys.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribedUser]
    }
  }

  /**
   * <p>Returns information related to the type of user authentication that is in use for a server's users. A server can only have one method of authentication.</p>
   */
  @js.native
  trait IdentityProviderDetails extends js.Object {
    var Url: js.UndefOr[Url]
    var InvocationRole: js.UndefOr[Role]
  }

  object IdentityProviderDetails {
    def apply(
      Url: js.UndefOr[Url] = js.undefined,
      InvocationRole: js.UndefOr[Role] = js.undefined): IdentityProviderDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] },
        "InvocationRole" -> InvocationRole.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityProviderDetails]
    }
  }

  /**
   * <p>Returns information related to the type of user authentication that is in use for a server's users. For <code>SERVICE_MANAGED</code> authentication, the Secure Shell (SSH) public keys are stored with a user on an SFTP server instance. For <code>API_GATEWAY</code> authentication, your custom authentication method is implemented by using an API call. A server can only have one method of authentication.</p>
   */
  object IdentityProviderTypeEnum {
    val SERVICE_MANAGED = "SERVICE_MANAGED"
    val API_GATEWAY = "API_GATEWAY"

    val values = IndexedSeq(SERVICE_MANAGED, API_GATEWAY)
  }

  @js.native
  trait ImportSshPublicKeyRequest extends js.Object {
    var ServerId: js.UndefOr[ServerId]
    var SshPublicKeyBody: js.UndefOr[SshPublicKeyBody]
    var UserName: js.UndefOr[UserName]
  }

  object ImportSshPublicKeyRequest {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined,
      SshPublicKeyBody: js.UndefOr[SshPublicKeyBody] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined): ImportSshPublicKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "SshPublicKeyBody" -> SshPublicKeyBody.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportSshPublicKeyRequest]
    }
  }

  /**
   * <p>This response identifies the user, server they belong to, and the identifier of the SSH public key associated with that user. A user can have more than one key on each server that they are associate with.</p>
   */
  @js.native
  trait ImportSshPublicKeyResponse extends js.Object {
    var ServerId: js.UndefOr[ServerId]
    var SshPublicKeyId: js.UndefOr[SshPublicKeyId]
    var UserName: js.UndefOr[UserName]
  }

  object ImportSshPublicKeyResponse {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined,
      SshPublicKeyId: js.UndefOr[SshPublicKeyId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined): ImportSshPublicKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "SshPublicKeyId" -> SshPublicKeyId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportSshPublicKeyResponse]
    }
  }

  @js.native
  trait ListServersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServersRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListServersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServersRequest]
    }
  }

  @js.native
  trait ListServersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Servers: js.UndefOr[ListedServers]
  }

  object ListServersResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Servers: js.UndefOr[ListedServers] = js.undefined): ListServersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Servers" -> Servers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var Arn: js.UndefOr[Arn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    def apply(
      Arn: js.UndefOr[Arn] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    def apply(
      Arn: js.UndefOr[Arn] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ServerId: js.UndefOr[ServerId]
  }

  object ListUsersRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ServerId: js.UndefOr[ServerId] = js.undefined): ListUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ServerId: js.UndefOr[ServerId]
    var Users: js.UndefOr[ListedUsers]
  }

  object ListUsersResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ServerId: js.UndefOr[ServerId] = js.undefined,
      Users: js.UndefOr[ListedUsers] = js.undefined): ListUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "Users" -> Users.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersResponse]
    }
  }

  /**
   * <p>Returns properties of the server that was specified.</p>
   */
  @js.native
  trait ListedServer extends js.Object {
    var UserCount: js.UndefOr[UserCount]
    var LoggingRole: js.UndefOr[Role]
    var Arn: js.UndefOr[Arn]
    var ServerId: js.UndefOr[ServerId]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var State: js.UndefOr[State]
  }

  object ListedServer {
    def apply(
      UserCount: js.UndefOr[UserCount] = js.undefined,
      LoggingRole: js.UndefOr[Role] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      ServerId: js.UndefOr[ServerId] = js.undefined,
      IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined,
      State: js.UndefOr[State] = js.undefined): ListedServer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserCount" -> UserCount.map { x => x.asInstanceOf[js.Any] },
        "LoggingRole" -> LoggingRole.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "IdentityProviderType" -> IdentityProviderType.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListedServer]
    }
  }

  /**
   * <p>Returns properties of the user that you specify.</p>
   */
  @js.native
  trait ListedUser extends js.Object {
    var UserName: js.UndefOr[UserName]
    var Role: js.UndefOr[Role]
    var SshPublicKeyCount: js.UndefOr[SshPublicKeyCount]
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var Arn: js.UndefOr[Arn]
  }

  object ListedUser {
    def apply(
      UserName: js.UndefOr[UserName] = js.undefined,
      Role: js.UndefOr[Role] = js.undefined,
      SshPublicKeyCount: js.UndefOr[SshPublicKeyCount] = js.undefined,
      HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined): ListedUser = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "SshPublicKeyCount" -> SshPublicKeyCount.map { x => x.asInstanceOf[js.Any] },
        "HomeDirectory" -> HomeDirectory.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListedUser]
    }
  }

  /**
   * <p>Provides information about the public Secure Shell (SSH) key that is associated with a user account for a specific server (as identified by <code>ServerId</code>). The information returned includes the date the key was imported, the public key contents, and the public key ID. A user can store more than one SSH public key associated with their user name on a specific SFTP server.</p>
   */
  @js.native
  trait SshPublicKey extends js.Object {
    var DateImported: js.UndefOr[DateImported]
    var SshPublicKeyBody: js.UndefOr[SshPublicKeyBody]
    var SshPublicKeyId: js.UndefOr[SshPublicKeyId]
  }

  object SshPublicKey {
    def apply(
      DateImported: js.UndefOr[DateImported] = js.undefined,
      SshPublicKeyBody: js.UndefOr[SshPublicKeyBody] = js.undefined,
      SshPublicKeyId: js.UndefOr[SshPublicKeyId] = js.undefined): SshPublicKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DateImported" -> DateImported.map { x => x.asInstanceOf[js.Any] },
        "SshPublicKeyBody" -> SshPublicKeyBody.map { x => x.asInstanceOf[js.Any] },
        "SshPublicKeyId" -> SshPublicKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SshPublicKey]
    }
  }

  @js.native
  trait StartServerRequest extends js.Object {
    var ServerId: js.UndefOr[ServerId]
  }

  object StartServerRequest {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined): StartServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartServerRequest]
    }
  }

  /**
   * <p>Describes the condition of the SFTP server with respect to its ability to perform file operations. There are six possible states: <code>OFFLINE</code>, <code>ONLINE</code>, <code>STARTING</code>, <code>STOPPING</code>, <code>START_FAILED</code>, and <code>STOP_FAILED</code>.</p> <p> <code>OFFLINE</code> indicates that the SFTP server exists, but that it is not available for file operations. <code>ONLINE</code> indicates that the SFTP server is available to perform file operations. <code>STARTING</code> indicates that the SFTP server's was instantiated, but the server is not yet available to perform file operations. Under normal conditions, it can take a couple of minutes for an SFTP server to be completely operational. Both <code>START_FAILED</code> and <code>STOP_FAILED</code> are error conditions.</p>
   */
  object StateEnum {
    val OFFLINE = "OFFLINE"
    val ONLINE = "ONLINE"
    val STARTING = "STARTING"
    val STOPPING = "STOPPING"
    val START_FAILED = "START_FAILED"
    val STOP_FAILED = "STOP_FAILED"

    val values = IndexedSeq(OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED, STOP_FAILED)
  }

  @js.native
  trait StopServerRequest extends js.Object {
    var ServerId: js.UndefOr[ServerId]
  }

  object StopServerRequest {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined): StopServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopServerRequest]
    }
  }

  /**
   * <p>Creates a key-value pair for a specific resource. Tags are metadata that you can use to search for and group a resource for various purposes. You can apply tags to servers, users, and roles. A tag key can take more than one value. For example, to group servers for accounting purposes, you might create a tag called <code>Group</code> and assign the values <code>Research</code> and <code>Accounting</code> to that group.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Tags: js.UndefOr[Tags]
  }

  object TagResourceRequest {
    def apply(
      Arn: js.UndefOr[Arn] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TestIdentityProviderRequest extends js.Object {
    var ServerId: js.UndefOr[ServerId]
    var UserName: js.UndefOr[UserName]
    var UserPassword: js.UndefOr[UserPassword]
  }

  object TestIdentityProviderRequest {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined,
      UserPassword: js.UndefOr[UserPassword] = js.undefined): TestIdentityProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "UserPassword" -> UserPassword.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestIdentityProviderRequest]
    }
  }

  @js.native
  trait TestIdentityProviderResponse extends js.Object {
    var Message: js.UndefOr[Message]
    var StatusCode: js.UndefOr[StatusCode]
    var Url: js.UndefOr[Url]
  }

  object TestIdentityProviderResponse {
    def apply(
      Message: js.UndefOr[Message] = js.undefined,
      StatusCode: js.UndefOr[StatusCode] = js.undefined,
      Url: js.UndefOr[Url] = js.undefined): TestIdentityProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "StatusCode" -> StatusCode.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestIdentityProviderResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Arn: js.UndefOr[Arn]
    var TagKeys: js.UndefOr[TagKeys]
  }

  object UntagResourceRequest {
    def apply(
      Arn: js.UndefOr[Arn] = js.undefined,
      TagKeys: js.UndefOr[TagKeys] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateServerRequest extends js.Object {
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var LoggingRole: js.UndefOr[NullableRole]
    var ServerId: js.UndefOr[ServerId]
  }

  object UpdateServerRequest {
    def apply(
      IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
      LoggingRole: js.UndefOr[NullableRole] = js.undefined,
      ServerId: js.UndefOr[ServerId] = js.undefined): UpdateServerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityProviderDetails" -> IdentityProviderDetails.map { x => x.asInstanceOf[js.Any] },
        "LoggingRole" -> LoggingRole.map { x => x.asInstanceOf[js.Any] },
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServerRequest]
    }
  }

  @js.native
  trait UpdateServerResponse extends js.Object {
    var ServerId: js.UndefOr[ServerId]
  }

  object UpdateServerResponse {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined): UpdateServerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServerResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var UserName: js.UndefOr[UserName]
    var Role: js.UndefOr[Role]
    var Policy: js.UndefOr[Policy]
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var ServerId: js.UndefOr[ServerId]
  }

  object UpdateUserRequest {
    def apply(
      UserName: js.UndefOr[UserName] = js.undefined,
      Role: js.UndefOr[Role] = js.undefined,
      Policy: js.UndefOr[Policy] = js.undefined,
      HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
      ServerId: js.UndefOr[ServerId] = js.undefined): UpdateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] },
        "HomeDirectory" -> HomeDirectory.map { x => x.asInstanceOf[js.Any] },
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserRequest]
    }
  }

  /**
   * <p> <code>UpdateUserResponse</code> returns the user name and server identifier for the request to update a user's properties.</p>
   */
  @js.native
  trait UpdateUserResponse extends js.Object {
    var ServerId: js.UndefOr[ServerId]
    var UserName: js.UndefOr[UserName]
  }

  object UpdateUserResponse {
    def apply(
      ServerId: js.UndefOr[ServerId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined): UpdateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServerId" -> ServerId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserResponse]
    }
  }
}
