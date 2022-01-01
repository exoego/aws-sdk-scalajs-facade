package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object transfer {
  type AddressAllocationId = String
  type AddressAllocationIds = js.Array[AddressAllocationId]
  type Arn = String
  type CallbackToken = String
  type Certificate = String
  type CustomStepTarget = String
  type CustomStepTimeoutSeconds = Int
  type DateImported = js.Date
  type DirectoryId = String
  type EfsFileSystemId = String
  type EfsPath = String
  type ExecutionErrorMessage = String
  type ExecutionId = String
  type ExecutionStepResults = js.Array[ExecutionStepResult]
  type ExternalId = String
  type Fips = Boolean
  type Function = String
  type HomeDirectory = String
  type HomeDirectoryMappings = js.Array[HomeDirectoryMapEntry]
  type HostKey = String
  type HostKeyFingerprint = String
  type ListedAccesses = js.Array[ListedAccess]
  type ListedExecutions = js.Array[ListedExecution]
  type ListedServers = js.Array[ListedServer]
  type ListedUsers = js.Array[ListedUser]
  type ListedWorkflows = js.Array[ListedWorkflow]
  type LogGroupName = String
  type MapEntry = String
  type MapTarget = String
  type MaxResults = Int
  type Message = String
  type NextToken = String
  type NullableRole = String
  type OnUploadWorkflowDetails = js.Array[WorkflowDetail]
  type PassiveIp = String
  type Policy = String
  type PosixId = Double
  type Protocols = js.Array[Protocol]
  type Response = String
  type Role = String
  type S3Bucket = String
  type S3Etag = String
  type S3Key = String
  type S3TagKey = String
  type S3TagValue = String
  type S3Tags = js.Array[S3Tag]
  type S3VersionId = String
  type SecondaryGids = js.Array[PosixId]
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SecurityPolicyName = String
  type SecurityPolicyNames = js.Array[SecurityPolicyName]
  type SecurityPolicyOption = String
  type SecurityPolicyOptions = js.Array[SecurityPolicyOption]
  type ServerId = String
  type SessionId = String
  type SourceIp = String
  type SshPublicKeyBody = String
  type SshPublicKeyCount = Int
  type SshPublicKeyId = String
  type SshPublicKeys = js.Array[SshPublicKey]
  type StatusCode = Int
  type StepResultOutputsJson = String
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
  type WorkflowDescription = String
  type WorkflowId = String
  type WorkflowStepName = String
  type WorkflowSteps = js.Array[WorkflowStep]

  final class TransferOps(private val service: Transfer) extends AnyVal {

    @inline def createAccessFuture(params: CreateAccessRequest): Future[CreateAccessResponse] = service.createAccess(params).promise().toFuture
    @inline def createServerFuture(params: CreateServerRequest): Future[CreateServerResponse] = service.createServer(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] = service.createUser(params).promise().toFuture
    @inline def createWorkflowFuture(params: CreateWorkflowRequest): Future[CreateWorkflowResponse] = service.createWorkflow(params).promise().toFuture
    @inline def deleteAccessFuture(params: DeleteAccessRequest): Future[js.Object] = service.deleteAccess(params).promise().toFuture
    @inline def deleteServerFuture(params: DeleteServerRequest): Future[js.Object] = service.deleteServer(params).promise().toFuture
    @inline def deleteSshPublicKeyFuture(params: DeleteSshPublicKeyRequest): Future[js.Object] = service.deleteSshPublicKey(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] = service.deleteUser(params).promise().toFuture
    @inline def deleteWorkflowFuture(params: DeleteWorkflowRequest): Future[js.Object] = service.deleteWorkflow(params).promise().toFuture
    @inline def describeAccessFuture(params: DescribeAccessRequest): Future[DescribeAccessResponse] = service.describeAccess(params).promise().toFuture
    @inline def describeExecutionFuture(params: DescribeExecutionRequest): Future[DescribeExecutionResponse] = service.describeExecution(params).promise().toFuture
    @inline def describeSecurityPolicyFuture(params: DescribeSecurityPolicyRequest): Future[DescribeSecurityPolicyResponse] = service.describeSecurityPolicy(params).promise().toFuture
    @inline def describeServerFuture(params: DescribeServerRequest): Future[DescribeServerResponse] = service.describeServer(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] = service.describeUser(params).promise().toFuture
    @inline def describeWorkflowFuture(params: DescribeWorkflowRequest): Future[DescribeWorkflowResponse] = service.describeWorkflow(params).promise().toFuture
    @inline def importSshPublicKeyFuture(params: ImportSshPublicKeyRequest): Future[ImportSshPublicKeyResponse] = service.importSshPublicKey(params).promise().toFuture
    @inline def listAccessesFuture(params: ListAccessesRequest): Future[ListAccessesResponse] = service.listAccesses(params).promise().toFuture
    @inline def listExecutionsFuture(params: ListExecutionsRequest): Future[ListExecutionsResponse] = service.listExecutions(params).promise().toFuture
    @inline def listSecurityPoliciesFuture(params: ListSecurityPoliciesRequest): Future[ListSecurityPoliciesResponse] = service.listSecurityPolicies(params).promise().toFuture
    @inline def listServersFuture(params: ListServersRequest): Future[ListServersResponse] = service.listServers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture
    @inline def listWorkflowsFuture(params: ListWorkflowsRequest): Future[ListWorkflowsResponse] = service.listWorkflows(params).promise().toFuture
    @inline def sendWorkflowStepStateFuture(params: SendWorkflowStepStateRequest): Future[SendWorkflowStepStateResponse] = service.sendWorkflowStepState(params).promise().toFuture
    @inline def startServerFuture(params: StartServerRequest): Future[js.Object] = service.startServer(params).promise().toFuture
    @inline def stopServerFuture(params: StopServerRequest): Future[js.Object] = service.stopServer(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def testIdentityProviderFuture(params: TestIdentityProviderRequest): Future[TestIdentityProviderResponse] = service.testIdentityProvider(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateAccessFuture(params: UpdateAccessRequest): Future[UpdateAccessResponse] = service.updateAccess(params).promise().toFuture
    @inline def updateServerFuture(params: UpdateServerRequest): Future[UpdateServerResponse] = service.updateServer(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] = service.updateUser(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/transfer", JSImport.Namespace, "AWS.Transfer")
  class Transfer() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAccess(params: CreateAccessRequest): Request[CreateAccessResponse] = js.native
    def createServer(params: CreateServerRequest): Request[CreateServerResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def createWorkflow(params: CreateWorkflowRequest): Request[CreateWorkflowResponse] = js.native
    def deleteAccess(params: DeleteAccessRequest): Request[js.Object] = js.native
    def deleteServer(params: DeleteServerRequest): Request[js.Object] = js.native
    def deleteSshPublicKey(params: DeleteSshPublicKeyRequest): Request[js.Object] = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object] = js.native
    def deleteWorkflow(params: DeleteWorkflowRequest): Request[js.Object] = js.native
    def describeAccess(params: DescribeAccessRequest): Request[DescribeAccessResponse] = js.native
    def describeExecution(params: DescribeExecutionRequest): Request[DescribeExecutionResponse] = js.native
    def describeSecurityPolicy(params: DescribeSecurityPolicyRequest): Request[DescribeSecurityPolicyResponse] = js.native
    def describeServer(params: DescribeServerRequest): Request[DescribeServerResponse] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def describeWorkflow(params: DescribeWorkflowRequest): Request[DescribeWorkflowResponse] = js.native
    def importSshPublicKey(params: ImportSshPublicKeyRequest): Request[ImportSshPublicKeyResponse] = js.native
    def listAccesses(params: ListAccessesRequest): Request[ListAccessesResponse] = js.native
    def listExecutions(params: ListExecutionsRequest): Request[ListExecutionsResponse] = js.native
    def listSecurityPolicies(params: ListSecurityPoliciesRequest): Request[ListSecurityPoliciesResponse] = js.native
    def listServers(params: ListServersRequest): Request[ListServersResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def listWorkflows(params: ListWorkflowsRequest): Request[ListWorkflowsResponse] = js.native
    def sendWorkflowStepState(params: SendWorkflowStepStateRequest): Request[SendWorkflowStepStateResponse] = js.native
    def startServer(params: StartServerRequest): Request[js.Object] = js.native
    def stopServer(params: StopServerRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def testIdentityProvider(params: TestIdentityProviderRequest): Request[TestIdentityProviderResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateAccess(params: UpdateAccessRequest): Request[UpdateAccessResponse] = js.native
    def updateServer(params: UpdateServerRequest): Request[UpdateServerResponse] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse] = js.native
  }
  object Transfer {
    @inline implicit def toOps(service: Transfer): TransferOps = {
      new TransferOps(service)
    }
  }

  /** Each step type has its own <code>StepDetails</code> structure.
    */
  @js.native
  trait CopyStepDetails extends js.Object {
    var DestinationFileLocation: js.UndefOr[InputFileLocation]
    var Name: js.UndefOr[WorkflowStepName]
    var OverwriteExisting: js.UndefOr[OverwriteExisting]
  }

  object CopyStepDetails {
    @inline
    def apply(
        DestinationFileLocation: js.UndefOr[InputFileLocation] = js.undefined,
        Name: js.UndefOr[WorkflowStepName] = js.undefined,
        OverwriteExisting: js.UndefOr[OverwriteExisting] = js.undefined
    ): CopyStepDetails = {
      val __obj = js.Dynamic.literal()
      DestinationFileLocation.foreach(__v => __obj.updateDynamic("DestinationFileLocation")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OverwriteExisting.foreach(__v => __obj.updateDynamic("OverwriteExisting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyStepDetails]
    }
  }

  @js.native
  trait CreateAccessRequest extends js.Object {
    var ExternalId: ExternalId
    var Role: Role
    var ServerId: ServerId
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings]
    var HomeDirectoryType: js.UndefOr[HomeDirectoryType]
    var Policy: js.UndefOr[Policy]
    var PosixProfile: js.UndefOr[PosixProfile]
  }

  object CreateAccessRequest {
    @inline
    def apply(
        ExternalId: ExternalId,
        Role: Role,
        ServerId: ServerId,
        HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings] = js.undefined,
        HomeDirectoryType: js.UndefOr[HomeDirectoryType] = js.undefined,
        Policy: js.UndefOr[Policy] = js.undefined,
        PosixProfile: js.UndefOr[PosixProfile] = js.undefined
    ): CreateAccessRequest = {
      val __obj = js.Dynamic.literal(
        "ExternalId" -> ExternalId.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      HomeDirectory.foreach(__v => __obj.updateDynamic("HomeDirectory")(__v.asInstanceOf[js.Any]))
      HomeDirectoryMappings.foreach(__v => __obj.updateDynamic("HomeDirectoryMappings")(__v.asInstanceOf[js.Any]))
      HomeDirectoryType.foreach(__v => __obj.updateDynamic("HomeDirectoryType")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      PosixProfile.foreach(__v => __obj.updateDynamic("PosixProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessRequest]
    }
  }

  @js.native
  trait CreateAccessResponse extends js.Object {
    var ExternalId: ExternalId
    var ServerId: ServerId
  }

  object CreateAccessResponse {
    @inline
    def apply(
        ExternalId: ExternalId,
        ServerId: ServerId
    ): CreateAccessResponse = {
      val __obj = js.Dynamic.literal(
        "ExternalId" -> ExternalId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAccessResponse]
    }
  }

  @js.native
  trait CreateServerRequest extends js.Object {
    var Certificate: js.UndefOr[Certificate]
    var Domain: js.UndefOr[Domain]
    var EndpointDetails: js.UndefOr[EndpointDetails]
    var EndpointType: js.UndefOr[EndpointType]
    var HostKey: js.UndefOr[HostKey]
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var LoggingRole: js.UndefOr[Role]
    var ProtocolDetails: js.UndefOr[ProtocolDetails]
    var Protocols: js.UndefOr[Protocols]
    var SecurityPolicyName: js.UndefOr[SecurityPolicyName]
    var Tags: js.UndefOr[Tags]
    var WorkflowDetails: js.UndefOr[WorkflowDetails]
  }

  object CreateServerRequest {
    @inline
    def apply(
        Certificate: js.UndefOr[Certificate] = js.undefined,
        Domain: js.UndefOr[Domain] = js.undefined,
        EndpointDetails: js.UndefOr[EndpointDetails] = js.undefined,
        EndpointType: js.UndefOr[EndpointType] = js.undefined,
        HostKey: js.UndefOr[HostKey] = js.undefined,
        IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
        IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined,
        LoggingRole: js.UndefOr[Role] = js.undefined,
        ProtocolDetails: js.UndefOr[ProtocolDetails] = js.undefined,
        Protocols: js.UndefOr[Protocols] = js.undefined,
        SecurityPolicyName: js.UndefOr[SecurityPolicyName] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        WorkflowDetails: js.UndefOr[WorkflowDetails] = js.undefined
    ): CreateServerRequest = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      EndpointDetails.foreach(__v => __obj.updateDynamic("EndpointDetails")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      HostKey.foreach(__v => __obj.updateDynamic("HostKey")(__v.asInstanceOf[js.Any]))
      IdentityProviderDetails.foreach(__v => __obj.updateDynamic("IdentityProviderDetails")(__v.asInstanceOf[js.Any]))
      IdentityProviderType.foreach(__v => __obj.updateDynamic("IdentityProviderType")(__v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.updateDynamic("LoggingRole")(__v.asInstanceOf[js.Any]))
      ProtocolDetails.foreach(__v => __obj.updateDynamic("ProtocolDetails")(__v.asInstanceOf[js.Any]))
      Protocols.foreach(__v => __obj.updateDynamic("Protocols")(__v.asInstanceOf[js.Any]))
      SecurityPolicyName.foreach(__v => __obj.updateDynamic("SecurityPolicyName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WorkflowDetails.foreach(__v => __obj.updateDynamic("WorkflowDetails")(__v.asInstanceOf[js.Any]))
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
    var PosixProfile: js.UndefOr[PosixProfile]
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
        PosixProfile: js.UndefOr[PosixProfile] = js.undefined,
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
      PosixProfile.foreach(__v => __obj.updateDynamic("PosixProfile")(__v.asInstanceOf[js.Any]))
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
  trait CreateWorkflowRequest extends js.Object {
    var Steps: WorkflowSteps
    var Description: js.UndefOr[WorkflowDescription]
    var OnExceptionSteps: js.UndefOr[WorkflowSteps]
    var Tags: js.UndefOr[Tags]
  }

  object CreateWorkflowRequest {
    @inline
    def apply(
        Steps: WorkflowSteps,
        Description: js.UndefOr[WorkflowDescription] = js.undefined,
        OnExceptionSteps: js.UndefOr[WorkflowSteps] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "Steps" -> Steps.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      OnExceptionSteps.foreach(__v => __obj.updateDynamic("OnExceptionSteps")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkflowRequest]
    }
  }

  @js.native
  trait CreateWorkflowResponse extends js.Object {
    var WorkflowId: WorkflowId
  }

  object CreateWorkflowResponse {
    @inline
    def apply(
        WorkflowId: WorkflowId
    ): CreateWorkflowResponse = {
      val __obj = js.Dynamic.literal(
        "WorkflowId" -> WorkflowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWorkflowResponse]
    }
  }

  /** Each step type has its own <code>StepDetails</code> structure.
    */
  @js.native
  trait CustomStepDetails extends js.Object {
    var Name: js.UndefOr[WorkflowStepName]
    var Target: js.UndefOr[CustomStepTarget]
    var TimeoutSeconds: js.UndefOr[CustomStepTimeoutSeconds]
  }

  object CustomStepDetails {
    @inline
    def apply(
        Name: js.UndefOr[WorkflowStepName] = js.undefined,
        Target: js.UndefOr[CustomStepTarget] = js.undefined,
        TimeoutSeconds: js.UndefOr[CustomStepTimeoutSeconds] = js.undefined
    ): CustomStepDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      TimeoutSeconds.foreach(__v => __obj.updateDynamic("TimeoutSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomStepDetails]
    }
  }

  @js.native
  trait DeleteAccessRequest extends js.Object {
    var ExternalId: ExternalId
    var ServerId: ServerId
  }

  object DeleteAccessRequest {
    @inline
    def apply(
        ExternalId: ExternalId,
        ServerId: ServerId
    ): DeleteAccessRequest = {
      val __obj = js.Dynamic.literal(
        "ExternalId" -> ExternalId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAccessRequest]
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

  /** The name of the step, used to identify the delete step.
    */
  @js.native
  trait DeleteStepDetails extends js.Object {
    var Name: js.UndefOr[WorkflowStepName]
  }

  object DeleteStepDetails {
    @inline
    def apply(
        Name: js.UndefOr[WorkflowStepName] = js.undefined
    ): DeleteStepDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStepDetails]
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
  trait DeleteWorkflowRequest extends js.Object {
    var WorkflowId: WorkflowId
  }

  object DeleteWorkflowRequest {
    @inline
    def apply(
        WorkflowId: WorkflowId
    ): DeleteWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "WorkflowId" -> WorkflowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkflowRequest]
    }
  }

  @js.native
  trait DescribeAccessRequest extends js.Object {
    var ExternalId: ExternalId
    var ServerId: ServerId
  }

  object DescribeAccessRequest {
    @inline
    def apply(
        ExternalId: ExternalId,
        ServerId: ServerId
    ): DescribeAccessRequest = {
      val __obj = js.Dynamic.literal(
        "ExternalId" -> ExternalId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAccessRequest]
    }
  }

  @js.native
  trait DescribeAccessResponse extends js.Object {
    var Access: DescribedAccess
    var ServerId: ServerId
  }

  object DescribeAccessResponse {
    @inline
    def apply(
        Access: DescribedAccess,
        ServerId: ServerId
    ): DescribeAccessResponse = {
      val __obj = js.Dynamic.literal(
        "Access" -> Access.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAccessResponse]
    }
  }

  @js.native
  trait DescribeExecutionRequest extends js.Object {
    var ExecutionId: ExecutionId
    var WorkflowId: WorkflowId
  }

  object DescribeExecutionRequest {
    @inline
    def apply(
        ExecutionId: ExecutionId,
        WorkflowId: WorkflowId
    ): DescribeExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "ExecutionId" -> ExecutionId.asInstanceOf[js.Any],
        "WorkflowId" -> WorkflowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeExecutionRequest]
    }
  }

  @js.native
  trait DescribeExecutionResponse extends js.Object {
    var Execution: DescribedExecution
    var WorkflowId: WorkflowId
  }

  object DescribeExecutionResponse {
    @inline
    def apply(
        Execution: DescribedExecution,
        WorkflowId: WorkflowId
    ): DescribeExecutionResponse = {
      val __obj = js.Dynamic.literal(
        "Execution" -> Execution.asInstanceOf[js.Any],
        "WorkflowId" -> WorkflowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeExecutionResponse]
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

  @js.native
  trait DescribeWorkflowRequest extends js.Object {
    var WorkflowId: WorkflowId
  }

  object DescribeWorkflowRequest {
    @inline
    def apply(
        WorkflowId: WorkflowId
    ): DescribeWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "WorkflowId" -> WorkflowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWorkflowRequest]
    }
  }

  @js.native
  trait DescribeWorkflowResponse extends js.Object {
    var Workflow: DescribedWorkflow
  }

  object DescribeWorkflowResponse {
    @inline
    def apply(
        Workflow: DescribedWorkflow
    ): DescribeWorkflowResponse = {
      val __obj = js.Dynamic.literal(
        "Workflow" -> Workflow.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWorkflowResponse]
    }
  }

  /** Describes the properties of the access that was specified.
    */
  @js.native
  trait DescribedAccess extends js.Object {
    var ExternalId: js.UndefOr[ExternalId]
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings]
    var HomeDirectoryType: js.UndefOr[HomeDirectoryType]
    var Policy: js.UndefOr[Policy]
    var PosixProfile: js.UndefOr[PosixProfile]
    var Role: js.UndefOr[Role]
  }

  object DescribedAccess {
    @inline
    def apply(
        ExternalId: js.UndefOr[ExternalId] = js.undefined,
        HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings] = js.undefined,
        HomeDirectoryType: js.UndefOr[HomeDirectoryType] = js.undefined,
        Policy: js.UndefOr[Policy] = js.undefined,
        PosixProfile: js.UndefOr[PosixProfile] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined
    ): DescribedAccess = {
      val __obj = js.Dynamic.literal()
      ExternalId.foreach(__v => __obj.updateDynamic("ExternalId")(__v.asInstanceOf[js.Any]))
      HomeDirectory.foreach(__v => __obj.updateDynamic("HomeDirectory")(__v.asInstanceOf[js.Any]))
      HomeDirectoryMappings.foreach(__v => __obj.updateDynamic("HomeDirectoryMappings")(__v.asInstanceOf[js.Any]))
      HomeDirectoryType.foreach(__v => __obj.updateDynamic("HomeDirectoryType")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      PosixProfile.foreach(__v => __obj.updateDynamic("PosixProfile")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedAccess]
    }
  }

  /** The details for an execution object.
    */
  @js.native
  trait DescribedExecution extends js.Object {
    var ExecutionId: js.UndefOr[ExecutionId]
    var ExecutionRole: js.UndefOr[Role]
    var InitialFileLocation: js.UndefOr[FileLocation]
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
    var PosixProfile: js.UndefOr[PosixProfile]
    var Results: js.UndefOr[ExecutionResults]
    var ServiceMetadata: js.UndefOr[ServiceMetadata]
    var Status: js.UndefOr[ExecutionStatus]
  }

  object DescribedExecution {
    @inline
    def apply(
        ExecutionId: js.UndefOr[ExecutionId] = js.undefined,
        ExecutionRole: js.UndefOr[Role] = js.undefined,
        InitialFileLocation: js.UndefOr[FileLocation] = js.undefined,
        LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined,
        PosixProfile: js.UndefOr[PosixProfile] = js.undefined,
        Results: js.UndefOr[ExecutionResults] = js.undefined,
        ServiceMetadata: js.UndefOr[ServiceMetadata] = js.undefined,
        Status: js.UndefOr[ExecutionStatus] = js.undefined
    ): DescribedExecution = {
      val __obj = js.Dynamic.literal()
      ExecutionId.foreach(__v => __obj.updateDynamic("ExecutionId")(__v.asInstanceOf[js.Any]))
      ExecutionRole.foreach(__v => __obj.updateDynamic("ExecutionRole")(__v.asInstanceOf[js.Any]))
      InitialFileLocation.foreach(__v => __obj.updateDynamic("InitialFileLocation")(__v.asInstanceOf[js.Any]))
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      PosixProfile.foreach(__v => __obj.updateDynamic("PosixProfile")(__v.asInstanceOf[js.Any]))
      Results.foreach(__v => __obj.updateDynamic("Results")(__v.asInstanceOf[js.Any]))
      ServiceMetadata.foreach(__v => __obj.updateDynamic("ServiceMetadata")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedExecution]
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
    var Domain: js.UndefOr[Domain]
    var EndpointDetails: js.UndefOr[EndpointDetails]
    var EndpointType: js.UndefOr[EndpointType]
    var HostKeyFingerprint: js.UndefOr[HostKeyFingerprint]
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails]
    var IdentityProviderType: js.UndefOr[IdentityProviderType]
    var LoggingRole: js.UndefOr[Role]
    var ProtocolDetails: js.UndefOr[ProtocolDetails]
    var Protocols: js.UndefOr[Protocols]
    var SecurityPolicyName: js.UndefOr[SecurityPolicyName]
    var ServerId: js.UndefOr[ServerId]
    var State: js.UndefOr[State]
    var Tags: js.UndefOr[Tags]
    var UserCount: js.UndefOr[UserCount]
    var WorkflowDetails: js.UndefOr[WorkflowDetails]
  }

  object DescribedServer {
    @inline
    def apply(
        Arn: Arn,
        Certificate: js.UndefOr[Certificate] = js.undefined,
        Domain: js.UndefOr[Domain] = js.undefined,
        EndpointDetails: js.UndefOr[EndpointDetails] = js.undefined,
        EndpointType: js.UndefOr[EndpointType] = js.undefined,
        HostKeyFingerprint: js.UndefOr[HostKeyFingerprint] = js.undefined,
        IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined,
        IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined,
        LoggingRole: js.UndefOr[Role] = js.undefined,
        ProtocolDetails: js.UndefOr[ProtocolDetails] = js.undefined,
        Protocols: js.UndefOr[Protocols] = js.undefined,
        SecurityPolicyName: js.UndefOr[SecurityPolicyName] = js.undefined,
        ServerId: js.UndefOr[ServerId] = js.undefined,
        State: js.UndefOr[State] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        UserCount: js.UndefOr[UserCount] = js.undefined,
        WorkflowDetails: js.UndefOr[WorkflowDetails] = js.undefined
    ): DescribedServer = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      EndpointDetails.foreach(__v => __obj.updateDynamic("EndpointDetails")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      HostKeyFingerprint.foreach(__v => __obj.updateDynamic("HostKeyFingerprint")(__v.asInstanceOf[js.Any]))
      IdentityProviderDetails.foreach(__v => __obj.updateDynamic("IdentityProviderDetails")(__v.asInstanceOf[js.Any]))
      IdentityProviderType.foreach(__v => __obj.updateDynamic("IdentityProviderType")(__v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.updateDynamic("LoggingRole")(__v.asInstanceOf[js.Any]))
      ProtocolDetails.foreach(__v => __obj.updateDynamic("ProtocolDetails")(__v.asInstanceOf[js.Any]))
      Protocols.foreach(__v => __obj.updateDynamic("Protocols")(__v.asInstanceOf[js.Any]))
      SecurityPolicyName.foreach(__v => __obj.updateDynamic("SecurityPolicyName")(__v.asInstanceOf[js.Any]))
      ServerId.foreach(__v => __obj.updateDynamic("ServerId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UserCount.foreach(__v => __obj.updateDynamic("UserCount")(__v.asInstanceOf[js.Any]))
      WorkflowDetails.foreach(__v => __obj.updateDynamic("WorkflowDetails")(__v.asInstanceOf[js.Any]))
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
    var PosixProfile: js.UndefOr[PosixProfile]
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
        PosixProfile: js.UndefOr[PosixProfile] = js.undefined,
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
      PosixProfile.foreach(__v => __obj.updateDynamic("PosixProfile")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      SshPublicKeys.foreach(__v => __obj.updateDynamic("SshPublicKeys")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedUser]
    }
  }

  /** Describes the properties of the specified workflow
    */
  @js.native
  trait DescribedWorkflow extends js.Object {
    var Arn: Arn
    var Description: js.UndefOr[WorkflowDescription]
    var OnExceptionSteps: js.UndefOr[WorkflowSteps]
    var Steps: js.UndefOr[WorkflowSteps]
    var Tags: js.UndefOr[Tags]
    var WorkflowId: js.UndefOr[WorkflowId]
  }

  object DescribedWorkflow {
    @inline
    def apply(
        Arn: Arn,
        Description: js.UndefOr[WorkflowDescription] = js.undefined,
        OnExceptionSteps: js.UndefOr[WorkflowSteps] = js.undefined,
        Steps: js.UndefOr[WorkflowSteps] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        WorkflowId: js.UndefOr[WorkflowId] = js.undefined
    ): DescribedWorkflow = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      OnExceptionSteps.foreach(__v => __obj.updateDynamic("OnExceptionSteps")(__v.asInstanceOf[js.Any]))
      Steps.foreach(__v => __obj.updateDynamic("Steps")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WorkflowId.foreach(__v => __obj.updateDynamic("WorkflowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedWorkflow]
    }
  }

  /** Reserved for future use.
    */
  @js.native
  trait EfsFileLocation extends js.Object {
    var FileSystemId: js.UndefOr[EfsFileSystemId]
    var Path: js.UndefOr[EfsPath]
  }

  object EfsFileLocation {
    @inline
    def apply(
        FileSystemId: js.UndefOr[EfsFileSystemId] = js.undefined,
        Path: js.UndefOr[EfsPath] = js.undefined
    ): EfsFileLocation = {
      val __obj = js.Dynamic.literal()
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EfsFileLocation]
    }
  }

  /** The virtual private cloud (VPC) endpoint settings that are configured for your file transfer protocol-enabled server. With a VPC endpoint, you can restrict access to your server and resources only within your VPC. To control incoming internet traffic, invoke the <code>UpdateServer</code> API and attach an Elastic IP address to your server's endpoint.
    *
    * '''Note:'''After May 19, 2021, you won't be able to create a server using <code>EndpointType=VPC_ENDPOINT</code> in your Amazon Web Servicesaccount if your account hasn't already done so before May 19, 2021. If you have already created servers with <code>EndpointType=VPC_ENDPOINT</code> in your Amazon Web Servicesaccount on or before May 19, 2021, you will not be affected. After this date, use <code>EndpointType</code>=<code>VPC</code>. For more information, see https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint.
    */
  @js.native
  trait EndpointDetails extends js.Object {
    var AddressAllocationIds: js.UndefOr[AddressAllocationIds]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcEndpointId: js.UndefOr[VpcEndpointId]
    var VpcId: js.UndefOr[VpcId]
  }

  object EndpointDetails {
    @inline
    def apply(
        AddressAllocationIds: js.UndefOr[AddressAllocationIds] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        VpcEndpointId: js.UndefOr[VpcEndpointId] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): EndpointDetails = {
      val __obj = js.Dynamic.literal()
      AddressAllocationIds.foreach(__v => __obj.updateDynamic("AddressAllocationIds")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      VpcEndpointId.foreach(__v => __obj.updateDynamic("VpcEndpointId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointDetails]
    }
  }

  /** Specifies the error message and type, for an error that occurs during the execution of the workflow.
    */
  @js.native
  trait ExecutionError extends js.Object {
    var Message: ExecutionErrorMessage
    var Type: ExecutionErrorType
  }

  object ExecutionError {
    @inline
    def apply(
        Message: ExecutionErrorMessage,
        Type: ExecutionErrorType
    ): ExecutionError = {
      val __obj = js.Dynamic.literal(
        "Message" -> Message.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExecutionError]
    }
  }

  /** Specifies the steps in the workflow, as well as the steps to execute in case of any errors during workflow execution.
    */
  @js.native
  trait ExecutionResults extends js.Object {
    var OnExceptionSteps: js.UndefOr[ExecutionStepResults]
    var Steps: js.UndefOr[ExecutionStepResults]
  }

  object ExecutionResults {
    @inline
    def apply(
        OnExceptionSteps: js.UndefOr[ExecutionStepResults] = js.undefined,
        Steps: js.UndefOr[ExecutionStepResults] = js.undefined
    ): ExecutionResults = {
      val __obj = js.Dynamic.literal()
      OnExceptionSteps.foreach(__v => __obj.updateDynamic("OnExceptionSteps")(__v.asInstanceOf[js.Any]))
      Steps.foreach(__v => __obj.updateDynamic("Steps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionResults]
    }
  }

  /** Specifies the following details for the step: error (if any), outputs (if any), and the step type.
    */
  @js.native
  trait ExecutionStepResult extends js.Object {
    var Error: js.UndefOr[ExecutionError]
    var Outputs: js.UndefOr[StepResultOutputsJson]
    var StepType: js.UndefOr[WorkflowStepType]
  }

  object ExecutionStepResult {
    @inline
    def apply(
        Error: js.UndefOr[ExecutionError] = js.undefined,
        Outputs: js.UndefOr[StepResultOutputsJson] = js.undefined,
        StepType: js.UndefOr[WorkflowStepType] = js.undefined
    ): ExecutionStepResult = {
      val __obj = js.Dynamic.literal()
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      StepType.foreach(__v => __obj.updateDynamic("StepType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionStepResult]
    }
  }

  /** Specifies the Amazon S3 or EFS file details to be used in the step.
    */
  @js.native
  trait FileLocation extends js.Object {
    var EfsFileLocation: js.UndefOr[EfsFileLocation]
    var S3FileLocation: js.UndefOr[S3FileLocation]
  }

  object FileLocation {
    @inline
    def apply(
        EfsFileLocation: js.UndefOr[EfsFileLocation] = js.undefined,
        S3FileLocation: js.UndefOr[S3FileLocation] = js.undefined
    ): FileLocation = {
      val __obj = js.Dynamic.literal()
      EfsFileLocation.foreach(__v => __obj.updateDynamic("EfsFileLocation")(__v.asInstanceOf[js.Any]))
      S3FileLocation.foreach(__v => __obj.updateDynamic("S3FileLocation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileLocation]
    }
  }

  /** Represents an object that contains entries and targets for <code>HomeDirectoryMappings</code>. The following is an <code>Entry</code> and <code>Target</code> pair example for <code>chroot</code>. <code>[ { "Entry:": "/", "Target": "/bucket_name/home/mydirectory" } ]</code>
    *
    * '''Note:'''If the target of a logical directory entry does not exist in Amazon S3 or EFS, the entry is ignored. As a workaround, you can use the Amazon S3 API or EFS API to create 0 byte objects as place holders for your directory. If using the CLI, use the <code>s3api</code> or <code>efsapi</code> call instead of <code>s3</code> or <code>efs</code> so you can use the put-object operation. For example, you use the following: <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>. Make sure that the end of the key name ends in a <code>/</code> for it to be considered a folder.
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

  /** Returns information related to the type of user authentication that is in use for a file transfer protocol-enabled server's users. A server can have only one method of authentication.
    */
  @js.native
  trait IdentityProviderDetails extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Function: js.UndefOr[Function]
    var InvocationRole: js.UndefOr[Role]
    var Url: js.UndefOr[Url]
  }

  object IdentityProviderDetails {
    @inline
    def apply(
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        Function: js.UndefOr[Function] = js.undefined,
        InvocationRole: js.UndefOr[Role] = js.undefined,
        Url: js.UndefOr[Url] = js.undefined
    ): IdentityProviderDetails = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      Function.foreach(__v => __obj.updateDynamic("Function")(__v.asInstanceOf[js.Any]))
      InvocationRole.foreach(__v => __obj.updateDynamic("InvocationRole")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityProviderDetails]
    }
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

  /** Identifies the user, the server they belong to, and the identifier of the SSH public key associated with that user. A user can have more than one key on each server that they are associated with.
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

  /** Specifies the location for the file being copied. Only applicable for the Copy type of workflow steps.
    */
  @js.native
  trait InputFileLocation extends js.Object {
    var EfsFileLocation: js.UndefOr[EfsFileLocation]
    var S3FileLocation: js.UndefOr[S3InputFileLocation]
  }

  object InputFileLocation {
    @inline
    def apply(
        EfsFileLocation: js.UndefOr[EfsFileLocation] = js.undefined,
        S3FileLocation: js.UndefOr[S3InputFileLocation] = js.undefined
    ): InputFileLocation = {
      val __obj = js.Dynamic.literal()
      EfsFileLocation.foreach(__v => __obj.updateDynamic("EfsFileLocation")(__v.asInstanceOf[js.Any]))
      S3FileLocation.foreach(__v => __obj.updateDynamic("S3FileLocation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputFileLocation]
    }
  }

  @js.native
  trait ListAccessesRequest extends js.Object {
    var ServerId: ServerId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAccessesRequest {
    @inline
    def apply(
        ServerId: ServerId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAccessesRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessesRequest]
    }
  }

  @js.native
  trait ListAccessesResponse extends js.Object {
    var Accesses: ListedAccesses
    var ServerId: ServerId
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAccessesResponse {
    @inline
    def apply(
        Accesses: ListedAccesses,
        ServerId: ServerId,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAccessesResponse = {
      val __obj = js.Dynamic.literal(
        "Accesses" -> Accesses.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessesResponse]
    }
  }

  @js.native
  trait ListExecutionsRequest extends js.Object {
    var WorkflowId: WorkflowId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExecutionsRequest {
    @inline
    def apply(
        WorkflowId: WorkflowId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "WorkflowId" -> WorkflowId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExecutionsRequest]
    }
  }

  @js.native
  trait ListExecutionsResponse extends js.Object {
    var Executions: ListedExecutions
    var WorkflowId: WorkflowId
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExecutionsResponse {
    @inline
    def apply(
        Executions: ListedExecutions,
        WorkflowId: WorkflowId,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExecutionsResponse = {
      val __obj = js.Dynamic.literal(
        "Executions" -> Executions.asInstanceOf[js.Any],
        "WorkflowId" -> WorkflowId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExecutionsResponse]
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

  @js.native
  trait ListWorkflowsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWorkflowsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWorkflowsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkflowsRequest]
    }
  }

  @js.native
  trait ListWorkflowsResponse extends js.Object {
    var Workflows: ListedWorkflows
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWorkflowsResponse {
    @inline
    def apply(
        Workflows: ListedWorkflows,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWorkflowsResponse = {
      val __obj = js.Dynamic.literal(
        "Workflows" -> Workflows.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkflowsResponse]
    }
  }

  /** Lists the properties for one or more specified associated accesses.
    */
  @js.native
  trait ListedAccess extends js.Object {
    var ExternalId: js.UndefOr[ExternalId]
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var HomeDirectoryType: js.UndefOr[HomeDirectoryType]
    var Role: js.UndefOr[Role]
  }

  object ListedAccess {
    @inline
    def apply(
        ExternalId: js.UndefOr[ExternalId] = js.undefined,
        HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        HomeDirectoryType: js.UndefOr[HomeDirectoryType] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined
    ): ListedAccess = {
      val __obj = js.Dynamic.literal()
      ExternalId.foreach(__v => __obj.updateDynamic("ExternalId")(__v.asInstanceOf[js.Any]))
      HomeDirectory.foreach(__v => __obj.updateDynamic("HomeDirectory")(__v.asInstanceOf[js.Any]))
      HomeDirectoryType.foreach(__v => __obj.updateDynamic("HomeDirectoryType")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedAccess]
    }
  }

  /** Returns properties of the execution that is specified.
    */
  @js.native
  trait ListedExecution extends js.Object {
    var ExecutionId: js.UndefOr[ExecutionId]
    var InitialFileLocation: js.UndefOr[FileLocation]
    var ServiceMetadata: js.UndefOr[ServiceMetadata]
    var Status: js.UndefOr[ExecutionStatus]
  }

  object ListedExecution {
    @inline
    def apply(
        ExecutionId: js.UndefOr[ExecutionId] = js.undefined,
        InitialFileLocation: js.UndefOr[FileLocation] = js.undefined,
        ServiceMetadata: js.UndefOr[ServiceMetadata] = js.undefined,
        Status: js.UndefOr[ExecutionStatus] = js.undefined
    ): ListedExecution = {
      val __obj = js.Dynamic.literal()
      ExecutionId.foreach(__v => __obj.updateDynamic("ExecutionId")(__v.asInstanceOf[js.Any]))
      InitialFileLocation.foreach(__v => __obj.updateDynamic("InitialFileLocation")(__v.asInstanceOf[js.Any]))
      ServiceMetadata.foreach(__v => __obj.updateDynamic("ServiceMetadata")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedExecution]
    }
  }

  /** Returns properties of a file transfer protocol-enabled server that was specified.
    */
  @js.native
  trait ListedServer extends js.Object {
    var Arn: Arn
    var Domain: js.UndefOr[Domain]
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
        Domain: js.UndefOr[Domain] = js.undefined,
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

      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
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

  /** Contains the ID, text description, and Amazon Resource Name (ARN) for the workflow.
    */
  @js.native
  trait ListedWorkflow extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[WorkflowDescription]
    var WorkflowId: js.UndefOr[WorkflowId]
  }

  object ListedWorkflow {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[WorkflowDescription] = js.undefined,
        WorkflowId: js.UndefOr[WorkflowId] = js.undefined
    ): ListedWorkflow = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      WorkflowId.foreach(__v => __obj.updateDynamic("WorkflowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedWorkflow]
    }
  }

  /** Consists of the logging role and the log group name.
    */
  @js.native
  trait LoggingConfiguration extends js.Object {
    var LogGroupName: js.UndefOr[LogGroupName]
    var LoggingRole: js.UndefOr[Role]
  }

  object LoggingConfiguration {
    @inline
    def apply(
        LogGroupName: js.UndefOr[LogGroupName] = js.undefined,
        LoggingRole: js.UndefOr[Role] = js.undefined
    ): LoggingConfiguration = {
      val __obj = js.Dynamic.literal()
      LogGroupName.foreach(__v => __obj.updateDynamic("LogGroupName")(__v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.updateDynamic("LoggingRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingConfiguration]
    }
  }

  /** The full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and any secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon EFS file systems. The POSIX permissions that are set on files and directories in your file system determine the level of access your users get when transferring files into and out of your Amazon EFS file systems.
    */
  @js.native
  trait PosixProfile extends js.Object {
    var Gid: PosixId
    var Uid: PosixId
    var SecondaryGids: js.UndefOr[SecondaryGids]
  }

  object PosixProfile {
    @inline
    def apply(
        Gid: PosixId,
        Uid: PosixId,
        SecondaryGids: js.UndefOr[SecondaryGids] = js.undefined
    ): PosixProfile = {
      val __obj = js.Dynamic.literal(
        "Gid" -> Gid.asInstanceOf[js.Any],
        "Uid" -> Uid.asInstanceOf[js.Any]
      )

      SecondaryGids.foreach(__v => __obj.updateDynamic("SecondaryGids")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PosixProfile]
    }
  }

  /** The protocol settings that are configured for your server.
    */
  @js.native
  trait ProtocolDetails extends js.Object {
    var PassiveIp: js.UndefOr[PassiveIp]
    var TlsSessionResumptionMode: js.UndefOr[TlsSessionResumptionMode]
  }

  object ProtocolDetails {
    @inline
    def apply(
        PassiveIp: js.UndefOr[PassiveIp] = js.undefined,
        TlsSessionResumptionMode: js.UndefOr[TlsSessionResumptionMode] = js.undefined
    ): ProtocolDetails = {
      val __obj = js.Dynamic.literal()
      PassiveIp.foreach(__v => __obj.updateDynamic("PassiveIp")(__v.asInstanceOf[js.Any]))
      TlsSessionResumptionMode.foreach(__v => __obj.updateDynamic("TlsSessionResumptionMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProtocolDetails]
    }
  }

  /** Specifies the details for the file location for the file being used in the workflow. Only applicable if you are using S3 storage.
    */
  @js.native
  trait S3FileLocation extends js.Object {
    var Bucket: js.UndefOr[S3Bucket]
    var Etag: js.UndefOr[S3Etag]
    var Key: js.UndefOr[S3Key]
    var VersionId: js.UndefOr[S3VersionId]
  }

  object S3FileLocation {
    @inline
    def apply(
        Bucket: js.UndefOr[S3Bucket] = js.undefined,
        Etag: js.UndefOr[S3Etag] = js.undefined,
        Key: js.UndefOr[S3Key] = js.undefined,
        VersionId: js.UndefOr[S3VersionId] = js.undefined
    ): S3FileLocation = {
      val __obj = js.Dynamic.literal()
      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      Etag.foreach(__v => __obj.updateDynamic("Etag")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3FileLocation]
    }
  }

  /** Specifies the customer input S3 file location. If it is used inside <code>copyStepDetails.DestinationFileLocation</code>, it should be the S3 copy destination. You need to provide the bucket and key. The key can represent either a path or a file. This is determined by whether or not you end the key value with the forward slash (/) character. If the final character is "/", then your file is copied to the folder, and its name does not change. If, rather, the final character is alphanumeric, your uploaded file is renamed to the path value. In this case, if a file with that name already exists, it is overwritten. For example, if your path is <code>shared-files/bob/</code>, your uploaded files are copied to the <code>shared-files/bob/</code>, folder. If your path is <code>shared-files/today</code>, each uploaded file is copied to the <code>shared-files</code> folder and named <code>today</code>: each upload overwrites the previous version of the <i>bob</i> file.
    */
  @js.native
  trait S3InputFileLocation extends js.Object {
    var Bucket: js.UndefOr[S3Bucket]
    var Key: js.UndefOr[S3Key]
  }

  object S3InputFileLocation {
    @inline
    def apply(
        Bucket: js.UndefOr[S3Bucket] = js.undefined,
        Key: js.UndefOr[S3Key] = js.undefined
    ): S3InputFileLocation = {
      val __obj = js.Dynamic.literal()
      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3InputFileLocation]
    }
  }

  /** Specifies the key-value pair that are assigned to a file during the execution of a Tagging step.
    */
  @js.native
  trait S3Tag extends js.Object {
    var Key: S3TagKey
    var Value: S3TagValue
  }

  object S3Tag {
    @inline
    def apply(
        Key: S3TagKey,
        Value: S3TagValue
    ): S3Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Tag]
    }
  }

  @js.native
  trait SendWorkflowStepStateRequest extends js.Object {
    var ExecutionId: ExecutionId
    var Status: CustomStepStatus
    var Token: CallbackToken
    var WorkflowId: WorkflowId
  }

  object SendWorkflowStepStateRequest {
    @inline
    def apply(
        ExecutionId: ExecutionId,
        Status: CustomStepStatus,
        Token: CallbackToken,
        WorkflowId: WorkflowId
    ): SendWorkflowStepStateRequest = {
      val __obj = js.Dynamic.literal(
        "ExecutionId" -> ExecutionId.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "Token" -> Token.asInstanceOf[js.Any],
        "WorkflowId" -> WorkflowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SendWorkflowStepStateRequest]
    }
  }

  @js.native
  trait SendWorkflowStepStateResponse extends js.Object

  object SendWorkflowStepStateResponse {
    @inline
    def apply(): SendWorkflowStepStateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendWorkflowStepStateResponse]
    }
  }

  /** A container object for the session details associated with a workflow.
    */
  @js.native
  trait ServiceMetadata extends js.Object {
    var UserDetails: UserDetails
  }

  object ServiceMetadata {
    @inline
    def apply(
        UserDetails: UserDetails
    ): ServiceMetadata = {
      val __obj = js.Dynamic.literal(
        "UserDetails" -> UserDetails.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ServiceMetadata]
    }
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

  /** Each step type has its own <code>StepDetails</code> structure. The key/value pairs used to tag a file during the execution of a workflow step.
    */
  @js.native
  trait TagStepDetails extends js.Object {
    var Name: js.UndefOr[WorkflowStepName]
    var Tags: js.UndefOr[S3Tags]
  }

  object TagStepDetails {
    @inline
    def apply(
        Name: js.UndefOr[WorkflowStepName] = js.undefined,
        Tags: js.UndefOr[S3Tags] = js.undefined
    ): TagStepDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagStepDetails]
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
  trait UpdateAccessRequest extends js.Object {
    var ExternalId: ExternalId
    var ServerId: ServerId
    var HomeDirectory: js.UndefOr[HomeDirectory]
    var HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings]
    var HomeDirectoryType: js.UndefOr[HomeDirectoryType]
    var Policy: js.UndefOr[Policy]
    var PosixProfile: js.UndefOr[PosixProfile]
    var Role: js.UndefOr[Role]
  }

  object UpdateAccessRequest {
    @inline
    def apply(
        ExternalId: ExternalId,
        ServerId: ServerId,
        HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        HomeDirectoryMappings: js.UndefOr[HomeDirectoryMappings] = js.undefined,
        HomeDirectoryType: js.UndefOr[HomeDirectoryType] = js.undefined,
        Policy: js.UndefOr[Policy] = js.undefined,
        PosixProfile: js.UndefOr[PosixProfile] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined
    ): UpdateAccessRequest = {
      val __obj = js.Dynamic.literal(
        "ExternalId" -> ExternalId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      HomeDirectory.foreach(__v => __obj.updateDynamic("HomeDirectory")(__v.asInstanceOf[js.Any]))
      HomeDirectoryMappings.foreach(__v => __obj.updateDynamic("HomeDirectoryMappings")(__v.asInstanceOf[js.Any]))
      HomeDirectoryType.foreach(__v => __obj.updateDynamic("HomeDirectoryType")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      PosixProfile.foreach(__v => __obj.updateDynamic("PosixProfile")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccessRequest]
    }
  }

  @js.native
  trait UpdateAccessResponse extends js.Object {
    var ExternalId: ExternalId
    var ServerId: ServerId
  }

  object UpdateAccessResponse {
    @inline
    def apply(
        ExternalId: ExternalId,
        ServerId: ServerId
    ): UpdateAccessResponse = {
      val __obj = js.Dynamic.literal(
        "ExternalId" -> ExternalId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAccessResponse]
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
    var ProtocolDetails: js.UndefOr[ProtocolDetails]
    var Protocols: js.UndefOr[Protocols]
    var SecurityPolicyName: js.UndefOr[SecurityPolicyName]
    var WorkflowDetails: js.UndefOr[WorkflowDetails]
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
        ProtocolDetails: js.UndefOr[ProtocolDetails] = js.undefined,
        Protocols: js.UndefOr[Protocols] = js.undefined,
        SecurityPolicyName: js.UndefOr[SecurityPolicyName] = js.undefined,
        WorkflowDetails: js.UndefOr[WorkflowDetails] = js.undefined
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
      ProtocolDetails.foreach(__v => __obj.updateDynamic("ProtocolDetails")(__v.asInstanceOf[js.Any]))
      Protocols.foreach(__v => __obj.updateDynamic("Protocols")(__v.asInstanceOf[js.Any]))
      SecurityPolicyName.foreach(__v => __obj.updateDynamic("SecurityPolicyName")(__v.asInstanceOf[js.Any]))
      WorkflowDetails.foreach(__v => __obj.updateDynamic("WorkflowDetails")(__v.asInstanceOf[js.Any]))
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
    var PosixProfile: js.UndefOr[PosixProfile]
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
        PosixProfile: js.UndefOr[PosixProfile] = js.undefined,
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
      PosixProfile.foreach(__v => __obj.updateDynamic("PosixProfile")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequest]
    }
  }

  /** <code>UpdateUserResponse</code> returns the user name and identifier for the request to update a user's properties.
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

  /** Specifies the user name, server ID, and session ID for a workflow.
    */
  @js.native
  trait UserDetails extends js.Object {
    var ServerId: ServerId
    var UserName: UserName
    var SessionId: js.UndefOr[SessionId]
  }

  object UserDetails {
    @inline
    def apply(
        ServerId: ServerId,
        UserName: UserName,
        SessionId: js.UndefOr[SessionId] = js.undefined
    ): UserDetails = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserDetails]
    }
  }

  /** Specifies the workflow ID for the workflow to assign and the execution role used for executing the workflow.
    */
  @js.native
  trait WorkflowDetail extends js.Object {
    var ExecutionRole: Role
    var WorkflowId: WorkflowId
  }

  object WorkflowDetail {
    @inline
    def apply(
        ExecutionRole: Role,
        WorkflowId: WorkflowId
    ): WorkflowDetail = {
      val __obj = js.Dynamic.literal(
        "ExecutionRole" -> ExecutionRole.asInstanceOf[js.Any],
        "WorkflowId" -> WorkflowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WorkflowDetail]
    }
  }

  /** Container for the <code>WorkflowDetail</code> data type. It is used by actions that trigger a workflow to begin execution.
    */
  @js.native
  trait WorkflowDetails extends js.Object {
    var OnUpload: OnUploadWorkflowDetails
  }

  object WorkflowDetails {
    @inline
    def apply(
        OnUpload: OnUploadWorkflowDetails
    ): WorkflowDetails = {
      val __obj = js.Dynamic.literal(
        "OnUpload" -> OnUpload.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WorkflowDetails]
    }
  }

  /** The basic building block of a workflow.
    */
  @js.native
  trait WorkflowStep extends js.Object {
    var CopyStepDetails: js.UndefOr[CopyStepDetails]
    var CustomStepDetails: js.UndefOr[CustomStepDetails]
    var DeleteStepDetails: js.UndefOr[DeleteStepDetails]
    var TagStepDetails: js.UndefOr[TagStepDetails]
    var Type: js.UndefOr[WorkflowStepType]
  }

  object WorkflowStep {
    @inline
    def apply(
        CopyStepDetails: js.UndefOr[CopyStepDetails] = js.undefined,
        CustomStepDetails: js.UndefOr[CustomStepDetails] = js.undefined,
        DeleteStepDetails: js.UndefOr[DeleteStepDetails] = js.undefined,
        TagStepDetails: js.UndefOr[TagStepDetails] = js.undefined,
        Type: js.UndefOr[WorkflowStepType] = js.undefined
    ): WorkflowStep = {
      val __obj = js.Dynamic.literal()
      CopyStepDetails.foreach(__v => __obj.updateDynamic("CopyStepDetails")(__v.asInstanceOf[js.Any]))
      CustomStepDetails.foreach(__v => __obj.updateDynamic("CustomStepDetails")(__v.asInstanceOf[js.Any]))
      DeleteStepDetails.foreach(__v => __obj.updateDynamic("DeleteStepDetails")(__v.asInstanceOf[js.Any]))
      TagStepDetails.foreach(__v => __obj.updateDynamic("TagStepDetails")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowStep]
    }
  }
}
