package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object transfer {
  type AddressAllocationId = String
  type AddressAllocationIds = js.Array[AddressAllocationId]
  type Arn = String
  type Certificate = String
  type DateImported = js.Date
  type Fips = Boolean
  type HomeDirectory = String
  type HomeDirectoryMappings = js.Array[HomeDirectoryMapEntry]
  type HostKey = String
  type HostKeyFingerprint = String
  type ListedServers = js.Array[ListedServer]
  type ListedUsers = js.Array[ListedUser]
  type MapEntry = String
  type MapTarget = String
  type MaxResults = Int
  type Message = String
  type NextToken = String
  type NullableRole = String
  type Policy = String
  type Protocols = js.Array[Protocol]
  type Response = String
  type Role = String
  type SecurityPolicyName = String
  type SecurityPolicyNames = js.Array[SecurityPolicyName]
  type SecurityPolicyOption = String
  type SecurityPolicyOptions = js.Array[SecurityPolicyOption]
  type ServerId = String
  type SourceIp = String
  type SshPublicKeyBody = String
  type SshPublicKeyCount = Int
  type SshPublicKeyId = String
  type SshPublicKeys = js.Array[SshPublicKey]
  type StatusCode = Int
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type Url = String
  type UserCount = Int
  type UserName = String
  type UserPassword = String
  type VpcEndpointId = String
  type VpcId = String

  implicit final class TransferOps(private val service: Transfer) extends AnyVal {

    @inline def createServerFuture(params: CreateServerRequest): Future[CreateServerResponse] = service.createServer(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] = service.createUser(params).promise().toFuture
    @inline def deleteServerFuture(params: DeleteServerRequest): Future[js.Object] = service.deleteServer(params).promise().toFuture
    @inline def deleteSshPublicKeyFuture(params: DeleteSshPublicKeyRequest): Future[js.Object] = service.deleteSshPublicKey(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] = service.deleteUser(params).promise().toFuture
    @inline def describeSecurityPolicyFuture(params: DescribeSecurityPolicyRequest): Future[DescribeSecurityPolicyResponse] = service.describeSecurityPolicy(params).promise().toFuture
    @inline def describeServerFuture(params: DescribeServerRequest): Future[DescribeServerResponse] = service.describeServer(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] = service.describeUser(params).promise().toFuture
    @inline def importSshPublicKeyFuture(params: ImportSshPublicKeyRequest): Future[ImportSshPublicKeyResponse] = service.importSshPublicKey(params).promise().toFuture
    @inline def listSecurityPoliciesFuture(params: ListSecurityPoliciesRequest): Future[ListSecurityPoliciesResponse] = service.listSecurityPolicies(params).promise().toFuture
    @inline def listServersFuture(params: ListServersRequest): Future[ListServersResponse] = service.listServers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture
    @inline def startServerFuture(params: StartServerRequest): Future[js.Object] = service.startServer(params).promise().toFuture
    @inline def stopServerFuture(params: StopServerRequest): Future[js.Object] = service.stopServer(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def testIdentityProviderFuture(params: TestIdentityProviderRequest): Future[TestIdentityProviderResponse] = service.testIdentityProvider(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateServerFuture(params: UpdateServerRequest): Future[UpdateServerResponse] = service.updateServer(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] = service.updateUser(params).promise().toFuture

  }
}

package transfer {
  @js.native
  @JSImport("aws-sdk/clients/transfer", JSImport.Namespace, "AWS.Transfer")
  class Transfer() extends js.Object {
    def this(config: AWSConfig) = this()

    def createServer(params: CreateServerRequest): Request[CreateServerResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def deleteServer(params: DeleteServerRequest): Request[js.Object] = js.native
    def deleteSshPublicKey(params: DeleteSshPublicKeyRequest): Request[js.Object] = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object] = js.native
    def describeSecurityPolicy(params: DescribeSecurityPolicyRequest): Request[DescribeSecurityPolicyResponse] = js.native
    def describeServer(params: DescribeServerRequest): Request[DescribeServerResponse] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def importSshPublicKey(params: ImportSshPublicKeyRequest): Request[ImportSshPublicKeyResponse] = js.native
    def listSecurityPolicies(params: ListSecurityPoliciesRequest): Request[ListSecurityPoliciesResponse] = js.native
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
    var Certificate: js.UndefOr[Certificate]
    var EndpointDetails: js.UndefOr[EndpointDetails]
    var EndpointType: js.UndefOr[EndpointType]
    var HostKey: js.UndefOr[HostKey]
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var LoggingRole: js.UndefOr[Role]
    var Protocols: js.UndefOr[Protocols]
    var SecurityPolicyName: js.UndefOr[SecurityPolicyName]
    var Tags: js.UndefOr[Tags]
  }

  object CreateServerRequest {
    @inline
    def apply(
        Certificate: js.UndefOr[Certificate] = js.undefined,
        EndpointDetails: js.UndefOr[EndpointDetails] = js.undefined,
        EndpointType: js.UndefOr[EndpointType] = js.undefined,
        HostKey: js.UndefOr[HostKey] = js.undefined,
        IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
        IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined,
        LoggingRole: js.UndefOr[Role] = js.undefined,
        Protocols: js.UndefOr[Protocols] = js.undefined,
        SecurityPolicyName: js.UndefOr[SecurityPolicyName] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateServerRequest = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      EndpointDetails.foreach(__v => __obj.updateDynamic("EndpointDetails")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      HostKey.foreach(__v => __obj.updateDynamic("HostKey")(__v.asInstanceOf[js.Any]))
      IdentityProviderDetails.foreach(__v => __obj.updateDynamic("IdentityProviderDetails")(__v.asInstanceOf[js.Any]))
      IdentityProviderType.foreach(__v => __obj.updateDynamic("IdentityProviderType")(__v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.updateDynamic("LoggingRole")(__v.asInstanceOf[js.Any]))
      Protocols.foreach(__v => __obj.updateDynamic("Protocols")(__v.asInstanceOf[js.Any]))
      SecurityPolicyName.foreach(__v => __obj.updateDynamic("SecurityPolicyName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServerRequest]
    }
  }

  @js.native
  trait CreateServerResponse extends js.Object {
    var ServerId: ServerId
  }

  object CreateServerResponse {
    @inline
    def apply(
        ServerId: ServerId
    ): CreateServerResponse = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateServerResponse]
    }
  }

  @js.native
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

  object CreateUserRequest {
    @inline
    def apply(
        Role: Role,
        ServerId: ServerId,
        UserName: UserName,
        HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings] = js.undefined,
        HomeDirectoryType: js.UndefOr[HomeDirectoryType] = js.undefined,
        Policy: js.UndefOr[Policy] = js.undefined,
        SshPublicKeyBody: js.UndefOr[SshPublicKeyBody] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "Role" -> Role.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      HomeDirectory.foreach(__v => __obj.updateDynamic("HomeDirectory")(__v.asInstanceOf[js.Any]))
      HomeDirectoryMappings.foreach(__v => __obj.updateDynamic("HomeDirectoryMappings")(__v.asInstanceOf[js.Any]))
      HomeDirectoryType.foreach(__v => __obj.updateDynamic("HomeDirectoryType")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      SshPublicKeyBody.foreach(__v => __obj.updateDynamic("SshPublicKeyBody")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
  }

  object CreateUserResponse {
    @inline
    def apply(
        ServerId: ServerId,
        UserName: UserName
    ): CreateUserResponse = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait DeleteServerRequest extends js.Object {
    var ServerId: ServerId
  }

  object DeleteServerRequest {
    @inline
    def apply(
        ServerId: ServerId
    ): DeleteServerRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteServerRequest]
    }
  }

  @js.native
  trait DeleteSshPublicKeyRequest extends js.Object {
    var ServerId: ServerId
    var SshPublicKeyId: SshPublicKeyId
    var UserName: UserName
  }

  object DeleteSshPublicKeyRequest {
    @inline
    def apply(
        ServerId: ServerId,
        SshPublicKeyId: SshPublicKeyId,
        UserName: UserName
    ): DeleteSshPublicKeyRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "SshPublicKeyId" -> SshPublicKeyId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSshPublicKeyRequest]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
  }

  object DeleteUserRequest {
    @inline
    def apply(
        ServerId: ServerId,
        UserName: UserName
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DescribeSecurityPolicyRequest extends js.Object {
    var SecurityPolicyName: SecurityPolicyName
  }

  object DescribeSecurityPolicyRequest {
    @inline
    def apply(
        SecurityPolicyName: SecurityPolicyName
    ): DescribeSecurityPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "SecurityPolicyName" -> SecurityPolicyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSecurityPolicyRequest]
    }
  }

  @js.native
  trait DescribeSecurityPolicyResponse extends js.Object {
    var SecurityPolicy: DescribedSecurityPolicy
  }

  object DescribeSecurityPolicyResponse {
    @inline
    def apply(
        SecurityPolicy: DescribedSecurityPolicy
    ): DescribeSecurityPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "SecurityPolicy" -> SecurityPolicy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSecurityPolicyResponse]
    }
  }

  @js.native
  trait DescribeServerRequest extends js.Object {
    var ServerId: ServerId
  }

  object DescribeServerRequest {
    @inline
    def apply(
        ServerId: ServerId
    ): DescribeServerRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeServerRequest]
    }
  }

  @js.native
  trait DescribeServerResponse extends js.Object {
    var Server: DescribedServer
  }

  object DescribeServerResponse {
    @inline
    def apply(
        Server: DescribedServer
    ): DescribeServerResponse = {
      val __obj = js.Dynamic.literal(
        "Server" -> Server.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeServerResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
  }

  object DescribeUserRequest {
    @inline
    def apply(
        ServerId: ServerId,
        UserName: UserName
    ): DescribeUserRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var ServerId: ServerId
    var User: DescribedUser
  }

  object DescribeUserResponse {
    @inline
    def apply(
        ServerId: ServerId,
        User: DescribedUser
    ): DescribeUserResponse = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "User" -> User.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserResponse]
    }
  }

  /** Describes the properties of a security policy that was specified. For more information about security policies, see [[https://docs.aws.amazon.com/transfer/latest/userguide/security-policies.html|Working with security policies]].
    */
  @js.native
  trait DescribedSecurityPolicy extends js.Object {
    var SecurityPolicyName: SecurityPolicyName
    var Fips: js.UndefOr[Fips]
    var SshCiphers: js.UndefOr[SecurityPolicyOptions]
    var SshKexs: js.UndefOr[SecurityPolicyOptions]
    var SshMacs: js.UndefOr[SecurityPolicyOptions]
    var TlsCiphers: js.UndefOr[SecurityPolicyOptions]
  }

  object DescribedSecurityPolicy {
    @inline
    def apply(
        SecurityPolicyName: SecurityPolicyName,
        Fips: js.UndefOr[Fips] = js.undefined,
        SshCiphers: js.UndefOr[SecurityPolicyOptions] = js.undefined,
        SshKexs: js.UndefOr[SecurityPolicyOptions] = js.undefined,
        SshMacs: js.UndefOr[SecurityPolicyOptions] = js.undefined,
        TlsCiphers: js.UndefOr[SecurityPolicyOptions] = js.undefined
    ): DescribedSecurityPolicy = {
      val __obj = js.Dynamic.literal(
        "SecurityPolicyName" -> SecurityPolicyName.asInstanceOf[js.Any]
      )

      Fips.foreach(__v => __obj.updateDynamic("Fips")(__v.asInstanceOf[js.Any]))
      SshCiphers.foreach(__v => __obj.updateDynamic("SshCiphers")(__v.asInstanceOf[js.Any]))
      SshKexs.foreach(__v => __obj.updateDynamic("SshKexs")(__v.asInstanceOf[js.Any]))
      SshMacs.foreach(__v => __obj.updateDynamic("SshMacs")(__v.asInstanceOf[js.Any]))
      TlsCiphers.foreach(__v => __obj.updateDynamic("TlsCiphers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedSecurityPolicy]
    }
  }

  /** Describes the properties of a file transfer protocol-enabled server that was specified.
    */
  @js.native
  trait DescribedServer extends js.Object {
    var Arn: Arn
    var Certificate: js.UndefOr[Certificate]
    var EndpointDetails: js.UndefOr[EndpointDetails]
    var EndpointType: js.UndefOr[EndpointType]
    var HostKeyFingerprint: js.UndefOr[HostKeyFingerprint]
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var LoggingRole: js.UndefOr[Role]
    var Protocols: js.UndefOr[Protocols]
    var SecurityPolicyName: js.UndefOr[SecurityPolicyName]
    var ServerId: js.UndefOr[ServerId]
    var State: js.UndefOr[State]
    var Tags: js.UndefOr[Tags]
    var UserCount: js.UndefOr[UserCount]
  }

  object DescribedServer {
    @inline
    def apply(
        Arn: Arn,
        Certificate: js.UndefOr[Certificate] = js.undefined,
        EndpointDetails: js.UndefOr[EndpointDetails] = js.undefined,
        EndpointType: js.UndefOr[EndpointType] = js.undefined,
        HostKeyFingerprint: js.UndefOr[HostKeyFingerprint] = js.undefined,
        IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
        IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined,
        LoggingRole: js.UndefOr[Role] = js.undefined,
        Protocols: js.UndefOr[Protocols] = js.undefined,
        SecurityPolicyName: js.UndefOr[SecurityPolicyName] = js.undefined,
        ServerId: js.UndefOr[ServerId] = js.undefined,
        State: js.UndefOr[State] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        UserCount: js.UndefOr[UserCount] = js.undefined
    ): DescribedServer = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      EndpointDetails.foreach(__v => __obj.updateDynamic("EndpointDetails")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      HostKeyFingerprint.foreach(__v => __obj.updateDynamic("HostKeyFingerprint")(__v.asInstanceOf[js.Any]))
      IdentityProviderDetails.foreach(__v => __obj.updateDynamic("IdentityProviderDetails")(__v.asInstanceOf[js.Any]))
      IdentityProviderType.foreach(__v => __obj.updateDynamic("IdentityProviderType")(__v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.updateDynamic("LoggingRole")(__v.asInstanceOf[js.Any]))
      Protocols.foreach(__v => __obj.updateDynamic("Protocols")(__v.asInstanceOf[js.Any]))
      SecurityPolicyName.foreach(__v => __obj.updateDynamic("SecurityPolicyName")(__v.asInstanceOf[js.Any]))
      ServerId.foreach(__v => __obj.updateDynamic("ServerId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UserCount.foreach(__v => __obj.updateDynamic("UserCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedServer]
    }
  }

  /** Describes the properties of a user that was specified.
    */
  @js.native
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

  object DescribedUser {
    @inline
    def apply(
        Arn: Arn,
        HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings] = js.undefined,
        HomeDirectoryType: js.UndefOr[HomeDirectoryType] = js.undefined,
        Policy: js.UndefOr[Policy] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined,
        SshPublicKeys: js.UndefOr[SshPublicKeys] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined
    ): DescribedUser = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      HomeDirectory.foreach(__v => __obj.updateDynamic("HomeDirectory")(__v.asInstanceOf[js.Any]))
      HomeDirectoryMappings.foreach(__v => __obj.updateDynamic("HomeDirectoryMappings")(__v.asInstanceOf[js.Any]))
      HomeDirectoryType.foreach(__v => __obj.updateDynamic("HomeDirectoryType")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      SshPublicKeys.foreach(__v => __obj.updateDynamic("SshPublicKeys")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedUser]
    }
  }

  /** The virtual private cloud (VPC) endpoint settings that are configured for your file transfer protocol-enabled server. With a VPC endpoint, you can restrict access to your server and resources only within your VPC. To control incoming internet traffic, invoke the <code>UpdateServer</code> API and attach an Elastic IP to your server's endpoint.
    */
  @js.native
  trait EndpointDetails extends js.Object {
    var AddressAllocationIds: js.UndefOr[AddressAllocationIds]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcEndpointId: js.UndefOr[VpcEndpointId]
    var VpcId: js.UndefOr[VpcId]
  }

  object EndpointDetails {
    @inline
    def apply(
        AddressAllocationIds: js.UndefOr[AddressAllocationIds] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        VpcEndpointId: js.UndefOr[VpcEndpointId] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): EndpointDetails = {
      val __obj = js.Dynamic.literal()
      AddressAllocationIds.foreach(__v => __obj.updateDynamic("AddressAllocationIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      VpcEndpointId.foreach(__v => __obj.updateDynamic("VpcEndpointId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointDetails]
    }
  }

  @js.native
  sealed trait EndpointType extends js.Any
  object EndpointType {
    val PUBLIC = "PUBLIC".asInstanceOf[EndpointType]
    val VPC = "VPC".asInstanceOf[EndpointType]
    val VPC_ENDPOINT = "VPC_ENDPOINT".asInstanceOf[EndpointType]

    @inline def values = js.Array(PUBLIC, VPC, VPC_ENDPOINT)
  }

  /** Represents an object that contains entries and targets for <code>HomeDirectoryMappings</code>.
    */
  @js.native
  trait HomeDirectoryMapEntry extends js.Object {
    var Entry: MapEntry
    var Target: MapTarget
  }

  object HomeDirectoryMapEntry {
    @inline
    def apply(
        Entry: MapEntry,
        Target: MapTarget
    ): HomeDirectoryMapEntry = {
      val __obj = js.Dynamic.literal(
        "Entry" -> Entry.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HomeDirectoryMapEntry]
    }
  }

  @js.native
  sealed trait HomeDirectoryType extends js.Any
  object HomeDirectoryType {
    val PATH = "PATH".asInstanceOf[HomeDirectoryType]
    val LOGICAL = "LOGICAL".asInstanceOf[HomeDirectoryType]

    @inline def values = js.Array(PATH, LOGICAL)
  }

  /** Returns information related to the type of user authentication that is in use for a file transfer protocol-enabled server's users. A server can have only one method of authentication.
    */
  @js.native
  trait IdentityProviderDetails extends js.Object {
    var InvocationRole: js.UndefOr[Role]
    var Url: js.UndefOr[Url]
  }

  object IdentityProviderDetails {
    @inline
    def apply(
        InvocationRole: js.UndefOr[Role] = js.undefined,
        Url: js.UndefOr[Url] = js.undefined
    ): IdentityProviderDetails = {
      val __obj = js.Dynamic.literal()
      InvocationRole.foreach(__v => __obj.updateDynamic("InvocationRole")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityProviderDetails]
    }
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
  trait ImportSshPublicKeyRequest extends js.Object {
    var ServerId: ServerId
    var SshPublicKeyBody: SshPublicKeyBody
    var UserName: UserName
  }

  object ImportSshPublicKeyRequest {
    @inline
    def apply(
        ServerId: ServerId,
        SshPublicKeyBody: SshPublicKeyBody,
        UserName: UserName
    ): ImportSshPublicKeyRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "SshPublicKeyBody" -> SshPublicKeyBody.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportSshPublicKeyRequest]
    }
  }

  /** Identifies the user, the file transfer protocol-enabled server they belong to, and the identifier of the SSH public key associated with that user. A user can have more than one key on each server that they are associated with.
    */
  @js.native
  trait ImportSshPublicKeyResponse extends js.Object {
    var ServerId: ServerId
    var SshPublicKeyId: SshPublicKeyId
    var UserName: UserName
  }

  object ImportSshPublicKeyResponse {
    @inline
    def apply(
        ServerId: ServerId,
        SshPublicKeyId: SshPublicKeyId,
        UserName: UserName
    ): ImportSshPublicKeyResponse = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "SshPublicKeyId" -> SshPublicKeyId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportSshPublicKeyResponse]
    }
  }

  @js.native
  trait ListSecurityPoliciesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSecurityPoliciesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSecurityPoliciesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityPoliciesRequest]
    }
  }

  @js.native
  trait ListSecurityPoliciesResponse extends js.Object {
    var SecurityPolicyNames: SecurityPolicyNames
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSecurityPoliciesResponse {
    @inline
    def apply(
        SecurityPolicyNames: SecurityPolicyNames,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSecurityPoliciesResponse = {
      val __obj = js.Dynamic.literal(
        "SecurityPolicyNames" -> SecurityPolicyNames.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityPoliciesResponse]
    }
  }

  @js.native
  trait ListServersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServersRequest]
    }
  }

  @js.native
  trait ListServersResponse extends js.Object {
    var Servers: ListedServers
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServersResponse {
    @inline
    def apply(
        Servers: ListedServers,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServersResponse = {
      val __obj = js.Dynamic.literal(
        "Servers" -> Servers.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var Arn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        Arn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var ServerId: ServerId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersRequest {
    @inline
    def apply(
        ServerId: ServerId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var ServerId: ServerId
    var Users: ListedUsers
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersResponse {
    @inline
    def apply(
        ServerId: ServerId,
        Users: ListedUsers,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "Users" -> Users.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  /** Returns properties of a file transfer protocol-enabled server that was specified.
    */
  @js.native
  trait ListedServer extends js.Object {
    var Arn: Arn
    var EndpointType: js.UndefOr[EndpointType]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var LoggingRole: js.UndefOr[Role]
    var ServerId: js.UndefOr[ServerId]
    var State: js.UndefOr[State]
    var UserCount: js.UndefOr[UserCount]
  }

  object ListedServer {
    @inline
    def apply(
        Arn: Arn,
        EndpointType: js.UndefOr[EndpointType] = js.undefined,
        IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined,
        LoggingRole: js.UndefOr[Role] = js.undefined,
        ServerId: js.UndefOr[ServerId] = js.undefined,
        State: js.UndefOr[State] = js.undefined,
        UserCount: js.UndefOr[UserCount] = js.undefined
    ): ListedServer = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      IdentityProviderType.foreach(__v => __obj.updateDynamic("IdentityProviderType")(__v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.updateDynamic("LoggingRole")(__v.asInstanceOf[js.Any]))
      ServerId.foreach(__v => __obj.updateDynamic("ServerId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      UserCount.foreach(__v => __obj.updateDynamic("UserCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedServer]
    }
  }

  /** Returns properties of the user that you specify.
    */
  @js.native
  trait ListedUser extends js.Object {
    var Arn: Arn
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var HomeDirectoryType: js.UndefOr[HomeDirectoryType]
    var Role: js.UndefOr[Role]
    var SshPublicKeyCount: js.UndefOr[SshPublicKeyCount]
    var UserName: js.UndefOr[UserName]
  }

  object ListedUser {
    @inline
    def apply(
        Arn: Arn,
        HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        HomeDirectoryType: js.UndefOr[HomeDirectoryType] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined,
        SshPublicKeyCount: js.UndefOr[SshPublicKeyCount] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined
    ): ListedUser = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      HomeDirectory.foreach(__v => __obj.updateDynamic("HomeDirectory")(__v.asInstanceOf[js.Any]))
      HomeDirectoryType.foreach(__v => __obj.updateDynamic("HomeDirectoryType")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      SshPublicKeyCount.foreach(__v => __obj.updateDynamic("SshPublicKeyCount")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedUser]
    }
  }

  @js.native
  sealed trait Protocol extends js.Any
  object Protocol {
    val SFTP = "SFTP".asInstanceOf[Protocol]
    val FTP = "FTP".asInstanceOf[Protocol]
    val FTPS = "FTPS".asInstanceOf[Protocol]

    @inline def values = js.Array(SFTP, FTP, FTPS)
  }

  /** Provides information about the public Secure Shell (SSH) key that is associated with a user account for the specific file transfer protocol-enabled server (as identified by <code>ServerId</code>). The information returned includes the date the key was imported, the public key contents, and the public key ID. A user can store more than one SSH public key associated with their user name on a specific server.
    */
  @js.native
  trait SshPublicKey extends js.Object {
    var DateImported: DateImported
    var SshPublicKeyBody: SshPublicKeyBody
    var SshPublicKeyId: SshPublicKeyId
  }

  object SshPublicKey {
    @inline
    def apply(
        DateImported: DateImported,
        SshPublicKeyBody: SshPublicKeyBody,
        SshPublicKeyId: SshPublicKeyId
    ): SshPublicKey = {
      val __obj = js.Dynamic.literal(
        "DateImported" -> DateImported.asInstanceOf[js.Any],
        "SshPublicKeyBody" -> SshPublicKeyBody.asInstanceOf[js.Any],
        "SshPublicKeyId" -> SshPublicKeyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SshPublicKey]
    }
  }

  @js.native
  trait StartServerRequest extends js.Object {
    var ServerId: ServerId
  }

  object StartServerRequest {
    @inline
    def apply(
        ServerId: ServerId
    ): StartServerRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartServerRequest]
    }
  }

  /** Describes the condition of a file transfer protocol-enabled server with respect to its ability to perform file operations. There are six possible states: <code>OFFLINE</code>, <code>ONLINE</code>, <code>STARTING</code>, <code>STOPPING</code>, <code>START_FAILED</code>, and <code>STOP_FAILED</code>.
    * <code>OFFLINE</code> indicates that the server exists, but that it is not available for file operations. <code>ONLINE</code> indicates that the server is available to perform file operations. <code>STARTING</code> indicates that the server's was instantiated, but the server is not yet available to perform file operations. Under normal conditions, it can take a couple of minutes for the server to be completely operational. Both <code>START_FAILED</code> and <code>STOP_FAILED</code> are error conditions.
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

  @js.native
  trait StopServerRequest extends js.Object {
    var ServerId: ServerId
  }

  object StopServerRequest {
    @inline
    def apply(
        ServerId: ServerId
    ): StopServerRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopServerRequest]
    }
  }

  /** Creates a key-value pair for a specific resource. Tags are metadata that you can use to search for and group a resource for various purposes. You can apply tags to servers, users, and roles. A tag key can take more than one value. For example, to group servers for accounting purposes, you might create a tag called <code>Group</code> and assign the values <code>Research</code> and <code>Accounting</code> to that group.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var Arn: Arn
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        Arn: Arn,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TestIdentityProviderRequest extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
    var ServerProtocol: js.UndefOr[Protocol]
    var SourceIp: js.UndefOr[SourceIp]
    var UserPassword: js.UndefOr[UserPassword]
  }

  object TestIdentityProviderRequest {
    @inline
    def apply(
        ServerId: ServerId,
        UserName: UserName,
        ServerProtocol: js.UndefOr[Protocol] = js.undefined,
        SourceIp: js.UndefOr[SourceIp] = js.undefined,
        UserPassword: js.UndefOr[UserPassword] = js.undefined
    ): TestIdentityProviderRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      ServerProtocol.foreach(__v => __obj.updateDynamic("ServerProtocol")(__v.asInstanceOf[js.Any]))
      SourceIp.foreach(__v => __obj.updateDynamic("SourceIp")(__v.asInstanceOf[js.Any]))
      UserPassword.foreach(__v => __obj.updateDynamic("UserPassword")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestIdentityProviderRequest]
    }
  }

  @js.native
  trait TestIdentityProviderResponse extends js.Object {
    var StatusCode: StatusCode
    var Url: Url
    var Message: js.UndefOr[Message]
    var Response: js.UndefOr[Response]
  }

  object TestIdentityProviderResponse {
    @inline
    def apply(
        StatusCode: StatusCode,
        Url: Url,
        Message: js.UndefOr[Message] = js.undefined,
        Response: js.UndefOr[Response] = js.undefined
    ): TestIdentityProviderResponse = {
      val __obj = js.Dynamic.literal(
        "StatusCode" -> StatusCode.asInstanceOf[js.Any],
        "Url" -> Url.asInstanceOf[js.Any]
      )

      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Response.foreach(__v => __obj.updateDynamic("Response")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestIdentityProviderResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Arn: Arn
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        Arn: Arn,
        TagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateServerRequest extends js.Object {
    var ServerId: ServerId
    var Certificate: js.UndefOr[Certificate]
    var EndpointDetails: js.UndefOr[EndpointDetails]
    var EndpointType: js.UndefOr[EndpointType]
    var HostKey: js.UndefOr[HostKey]
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var LoggingRole: js.UndefOr[NullableRole]
    var Protocols: js.UndefOr[Protocols]
    var SecurityPolicyName: js.UndefOr[SecurityPolicyName]
  }

  object UpdateServerRequest {
    @inline
    def apply(
        ServerId: ServerId,
        Certificate: js.UndefOr[Certificate] = js.undefined,
        EndpointDetails: js.UndefOr[EndpointDetails] = js.undefined,
        EndpointType: js.UndefOr[EndpointType] = js.undefined,
        HostKey: js.UndefOr[HostKey] = js.undefined,
        IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
        LoggingRole: js.UndefOr[NullableRole] = js.undefined,
        Protocols: js.UndefOr[Protocols] = js.undefined,
        SecurityPolicyName: js.UndefOr[SecurityPolicyName] = js.undefined
    ): UpdateServerRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      EndpointDetails.foreach(__v => __obj.updateDynamic("EndpointDetails")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      HostKey.foreach(__v => __obj.updateDynamic("HostKey")(__v.asInstanceOf[js.Any]))
      IdentityProviderDetails.foreach(__v => __obj.updateDynamic("IdentityProviderDetails")(__v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.updateDynamic("LoggingRole")(__v.asInstanceOf[js.Any]))
      Protocols.foreach(__v => __obj.updateDynamic("Protocols")(__v.asInstanceOf[js.Any]))
      SecurityPolicyName.foreach(__v => __obj.updateDynamic("SecurityPolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServerRequest]
    }
  }

  @js.native
  trait UpdateServerResponse extends js.Object {
    var ServerId: ServerId
  }

  object UpdateServerResponse {
    @inline
    def apply(
        ServerId: ServerId
    ): UpdateServerResponse = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateServerResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings]
    var HomeDirectoryType: js.UndefOr[HomeDirectoryType]
    var Policy: js.UndefOr[Policy]
    var Role: js.UndefOr[Role]
  }

  object UpdateUserRequest {
    @inline
    def apply(
        ServerId: ServerId,
        UserName: UserName,
        HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings] = js.undefined,
        HomeDirectoryType: js.UndefOr[HomeDirectoryType] = js.undefined,
        Policy: js.UndefOr[Policy] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined
    ): UpdateUserRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      HomeDirectory.foreach(__v => __obj.updateDynamic("HomeDirectory")(__v.asInstanceOf[js.Any]))
      HomeDirectoryMappings.foreach(__v => __obj.updateDynamic("HomeDirectoryMappings")(__v.asInstanceOf[js.Any]))
      HomeDirectoryType.foreach(__v => __obj.updateDynamic("HomeDirectoryType")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequest]
    }
  }

  /** <code>UpdateUserResponse</code> returns the user name and file transfer protocol-enabled server identifier for the request to update a user's properties.
    */
  @js.native
  trait UpdateUserResponse extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
  }

  object UpdateUserResponse {
    @inline
    def apply(
        ServerId: ServerId,
        UserName: UserName
    ): UpdateUserResponse = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateUserResponse]
    }
  }
}
