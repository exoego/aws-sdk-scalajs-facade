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
  type AgreementId = String
  type Arn = String
  type As2Id = String
  type As2Transports = js.Array[As2Transport]
  type CallbackToken = String
  type CertDate = js.Date
  type CertSerial = String
  type Certificate = String
  type CertificateBodyType = String
  type CertificateChainType = String
  type CertificateId = String
  type CertificateIds = js.Array[CertificateId]
  type ConnectorId = String
  type CustomStepTarget = String
  type CustomStepTimeoutSeconds = Int
  type DateImported = js.Date
  type Description = String
  type DirectoryId = String
  type EfsFileSystemId = String
  type EfsPath = String
  type ExecutionErrorMessage = String
  type ExecutionId = String
  type ExecutionStepResults = js.Array[ExecutionStepResult]
  type ExternalId = String
  type FilePath = String
  type FilePaths = js.Array[FilePath]
  type Fips = Boolean
  type Function = String
  type HomeDirectory = String
  type HomeDirectoryMappings = js.Array[HomeDirectoryMapEntry]
  type HostKey = String
  type HostKeyDescription = String
  type HostKeyFingerprint = String
  type HostKeyId = String
  type HostKeyType = String
  type ListedAccesses = js.Array[ListedAccess]
  type ListedAgreements = js.Array[ListedAgreement]
  type ListedCertificates = js.Array[ListedCertificate]
  type ListedConnectors = js.Array[ListedConnector]
  type ListedExecutions = js.Array[ListedExecution]
  type ListedHostKeys = js.Array[ListedHostKey]
  type ListedProfiles = js.Array[ListedProfile]
  type ListedServers = js.Array[ListedServer]
  type ListedUsers = js.Array[ListedUser]
  type ListedWorkflows = js.Array[ListedWorkflow]
  type LogGroupName = String
  type MapEntry = String
  type MapTarget = String
  type MaxResults = Int
  type Message = String
  type MessageSubject = String
  type NextToken = String
  type NullableRole = String
  type OnPartialUploadWorkflowDetails = js.Array[WorkflowDetail]
  type OnUploadWorkflowDetails = js.Array[WorkflowDetail]
  type PassiveIp = String
  type Policy = String
  type PosixId = Double
  type PostAuthenticationLoginBanner = String
  type PreAuthenticationLoginBanner = String
  type PrivateKeyType = String
  type ProfileId = String
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
  type SourceFileLocation = String
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
  type TransferId = String
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
    @inline def createAgreementFuture(params: CreateAgreementRequest): Future[CreateAgreementResponse] = service.createAgreement(params).promise().toFuture
    @inline def createConnectorFuture(params: CreateConnectorRequest): Future[CreateConnectorResponse] = service.createConnector(params).promise().toFuture
    @inline def createProfileFuture(params: CreateProfileRequest): Future[CreateProfileResponse] = service.createProfile(params).promise().toFuture
    @inline def createServerFuture(params: CreateServerRequest): Future[CreateServerResponse] = service.createServer(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] = service.createUser(params).promise().toFuture
    @inline def createWorkflowFuture(params: CreateWorkflowRequest): Future[CreateWorkflowResponse] = service.createWorkflow(params).promise().toFuture
    @inline def deleteAccessFuture(params: DeleteAccessRequest): Future[js.Object] = service.deleteAccess(params).promise().toFuture
    @inline def deleteAgreementFuture(params: DeleteAgreementRequest): Future[js.Object] = service.deleteAgreement(params).promise().toFuture
    @inline def deleteCertificateFuture(params: DeleteCertificateRequest): Future[js.Object] = service.deleteCertificate(params).promise().toFuture
    @inline def deleteConnectorFuture(params: DeleteConnectorRequest): Future[js.Object] = service.deleteConnector(params).promise().toFuture
    @inline def deleteHostKeyFuture(params: DeleteHostKeyRequest): Future[js.Object] = service.deleteHostKey(params).promise().toFuture
    @inline def deleteProfileFuture(params: DeleteProfileRequest): Future[js.Object] = service.deleteProfile(params).promise().toFuture
    @inline def deleteServerFuture(params: DeleteServerRequest): Future[js.Object] = service.deleteServer(params).promise().toFuture
    @inline def deleteSshPublicKeyFuture(params: DeleteSshPublicKeyRequest): Future[js.Object] = service.deleteSshPublicKey(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] = service.deleteUser(params).promise().toFuture
    @inline def deleteWorkflowFuture(params: DeleteWorkflowRequest): Future[js.Object] = service.deleteWorkflow(params).promise().toFuture
    @inline def describeAccessFuture(params: DescribeAccessRequest): Future[DescribeAccessResponse] = service.describeAccess(params).promise().toFuture
    @inline def describeAgreementFuture(params: DescribeAgreementRequest): Future[DescribeAgreementResponse] = service.describeAgreement(params).promise().toFuture
    @inline def describeCertificateFuture(params: DescribeCertificateRequest): Future[DescribeCertificateResponse] = service.describeCertificate(params).promise().toFuture
    @inline def describeConnectorFuture(params: DescribeConnectorRequest): Future[DescribeConnectorResponse] = service.describeConnector(params).promise().toFuture
    @inline def describeExecutionFuture(params: DescribeExecutionRequest): Future[DescribeExecutionResponse] = service.describeExecution(params).promise().toFuture
    @inline def describeHostKeyFuture(params: DescribeHostKeyRequest): Future[DescribeHostKeyResponse] = service.describeHostKey(params).promise().toFuture
    @inline def describeProfileFuture(params: DescribeProfileRequest): Future[DescribeProfileResponse] = service.describeProfile(params).promise().toFuture
    @inline def describeSecurityPolicyFuture(params: DescribeSecurityPolicyRequest): Future[DescribeSecurityPolicyResponse] = service.describeSecurityPolicy(params).promise().toFuture
    @inline def describeServerFuture(params: DescribeServerRequest): Future[DescribeServerResponse] = service.describeServer(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] = service.describeUser(params).promise().toFuture
    @inline def describeWorkflowFuture(params: DescribeWorkflowRequest): Future[DescribeWorkflowResponse] = service.describeWorkflow(params).promise().toFuture
    @inline def importCertificateFuture(params: ImportCertificateRequest): Future[ImportCertificateResponse] = service.importCertificate(params).promise().toFuture
    @inline def importHostKeyFuture(params: ImportHostKeyRequest): Future[ImportHostKeyResponse] = service.importHostKey(params).promise().toFuture
    @inline def importSshPublicKeyFuture(params: ImportSshPublicKeyRequest): Future[ImportSshPublicKeyResponse] = service.importSshPublicKey(params).promise().toFuture
    @inline def listAccessesFuture(params: ListAccessesRequest): Future[ListAccessesResponse] = service.listAccesses(params).promise().toFuture
    @inline def listAgreementsFuture(params: ListAgreementsRequest): Future[ListAgreementsResponse] = service.listAgreements(params).promise().toFuture
    @inline def listCertificatesFuture(params: ListCertificatesRequest): Future[ListCertificatesResponse] = service.listCertificates(params).promise().toFuture
    @inline def listConnectorsFuture(params: ListConnectorsRequest): Future[ListConnectorsResponse] = service.listConnectors(params).promise().toFuture
    @inline def listExecutionsFuture(params: ListExecutionsRequest): Future[ListExecutionsResponse] = service.listExecutions(params).promise().toFuture
    @inline def listHostKeysFuture(params: ListHostKeysRequest): Future[ListHostKeysResponse] = service.listHostKeys(params).promise().toFuture
    @inline def listProfilesFuture(params: ListProfilesRequest): Future[ListProfilesResponse] = service.listProfiles(params).promise().toFuture
    @inline def listSecurityPoliciesFuture(params: ListSecurityPoliciesRequest): Future[ListSecurityPoliciesResponse] = service.listSecurityPolicies(params).promise().toFuture
    @inline def listServersFuture(params: ListServersRequest): Future[ListServersResponse] = service.listServers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture
    @inline def listWorkflowsFuture(params: ListWorkflowsRequest): Future[ListWorkflowsResponse] = service.listWorkflows(params).promise().toFuture
    @inline def sendWorkflowStepStateFuture(params: SendWorkflowStepStateRequest): Future[SendWorkflowStepStateResponse] = service.sendWorkflowStepState(params).promise().toFuture
    @inline def startFileTransferFuture(params: StartFileTransferRequest): Future[StartFileTransferResponse] = service.startFileTransfer(params).promise().toFuture
    @inline def startServerFuture(params: StartServerRequest): Future[js.Object] = service.startServer(params).promise().toFuture
    @inline def stopServerFuture(params: StopServerRequest): Future[js.Object] = service.stopServer(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def testIdentityProviderFuture(params: TestIdentityProviderRequest): Future[TestIdentityProviderResponse] = service.testIdentityProvider(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateAccessFuture(params: UpdateAccessRequest): Future[UpdateAccessResponse] = service.updateAccess(params).promise().toFuture
    @inline def updateAgreementFuture(params: UpdateAgreementRequest): Future[UpdateAgreementResponse] = service.updateAgreement(params).promise().toFuture
    @inline def updateCertificateFuture(params: UpdateCertificateRequest): Future[UpdateCertificateResponse] = service.updateCertificate(params).promise().toFuture
    @inline def updateConnectorFuture(params: UpdateConnectorRequest): Future[UpdateConnectorResponse] = service.updateConnector(params).promise().toFuture
    @inline def updateHostKeyFuture(params: UpdateHostKeyRequest): Future[UpdateHostKeyResponse] = service.updateHostKey(params).promise().toFuture
    @inline def updateProfileFuture(params: UpdateProfileRequest): Future[UpdateProfileResponse] = service.updateProfile(params).promise().toFuture
    @inline def updateServerFuture(params: UpdateServerRequest): Future[UpdateServerResponse] = service.updateServer(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] = service.updateUser(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/transfer", JSImport.Namespace, "AWS.Transfer")
  class Transfer() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAccess(params: CreateAccessRequest): Request[CreateAccessResponse] = js.native
    def createAgreement(params: CreateAgreementRequest): Request[CreateAgreementResponse] = js.native
    def createConnector(params: CreateConnectorRequest): Request[CreateConnectorResponse] = js.native
    def createProfile(params: CreateProfileRequest): Request[CreateProfileResponse] = js.native
    def createServer(params: CreateServerRequest): Request[CreateServerResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def createWorkflow(params: CreateWorkflowRequest): Request[CreateWorkflowResponse] = js.native
    def deleteAccess(params: DeleteAccessRequest): Request[js.Object] = js.native
    def deleteAgreement(params: DeleteAgreementRequest): Request[js.Object] = js.native
    def deleteCertificate(params: DeleteCertificateRequest): Request[js.Object] = js.native
    def deleteConnector(params: DeleteConnectorRequest): Request[js.Object] = js.native
    def deleteHostKey(params: DeleteHostKeyRequest): Request[js.Object] = js.native
    def deleteProfile(params: DeleteProfileRequest): Request[js.Object] = js.native
    def deleteServer(params: DeleteServerRequest): Request[js.Object] = js.native
    def deleteSshPublicKey(params: DeleteSshPublicKeyRequest): Request[js.Object] = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object] = js.native
    def deleteWorkflow(params: DeleteWorkflowRequest): Request[js.Object] = js.native
    def describeAccess(params: DescribeAccessRequest): Request[DescribeAccessResponse] = js.native
    def describeAgreement(params: DescribeAgreementRequest): Request[DescribeAgreementResponse] = js.native
    def describeCertificate(params: DescribeCertificateRequest): Request[DescribeCertificateResponse] = js.native
    def describeConnector(params: DescribeConnectorRequest): Request[DescribeConnectorResponse] = js.native
    def describeExecution(params: DescribeExecutionRequest): Request[DescribeExecutionResponse] = js.native
    def describeHostKey(params: DescribeHostKeyRequest): Request[DescribeHostKeyResponse] = js.native
    def describeProfile(params: DescribeProfileRequest): Request[DescribeProfileResponse] = js.native
    def describeSecurityPolicy(params: DescribeSecurityPolicyRequest): Request[DescribeSecurityPolicyResponse] = js.native
    def describeServer(params: DescribeServerRequest): Request[DescribeServerResponse] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def describeWorkflow(params: DescribeWorkflowRequest): Request[DescribeWorkflowResponse] = js.native
    def importCertificate(params: ImportCertificateRequest): Request[ImportCertificateResponse] = js.native
    def importHostKey(params: ImportHostKeyRequest): Request[ImportHostKeyResponse] = js.native
    def importSshPublicKey(params: ImportSshPublicKeyRequest): Request[ImportSshPublicKeyResponse] = js.native
    def listAccesses(params: ListAccessesRequest): Request[ListAccessesResponse] = js.native
    def listAgreements(params: ListAgreementsRequest): Request[ListAgreementsResponse] = js.native
    def listCertificates(params: ListCertificatesRequest): Request[ListCertificatesResponse] = js.native
    def listConnectors(params: ListConnectorsRequest): Request[ListConnectorsResponse] = js.native
    def listExecutions(params: ListExecutionsRequest): Request[ListExecutionsResponse] = js.native
    def listHostKeys(params: ListHostKeysRequest): Request[ListHostKeysResponse] = js.native
    def listProfiles(params: ListProfilesRequest): Request[ListProfilesResponse] = js.native
    def listSecurityPolicies(params: ListSecurityPoliciesRequest): Request[ListSecurityPoliciesResponse] = js.native
    def listServers(params: ListServersRequest): Request[ListServersResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def listWorkflows(params: ListWorkflowsRequest): Request[ListWorkflowsResponse] = js.native
    def sendWorkflowStepState(params: SendWorkflowStepStateRequest): Request[SendWorkflowStepStateResponse] = js.native
    def startFileTransfer(params: StartFileTransferRequest): Request[StartFileTransferResponse] = js.native
    def startServer(params: StartServerRequest): Request[js.Object] = js.native
    def stopServer(params: StopServerRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def testIdentityProvider(params: TestIdentityProviderRequest): Request[TestIdentityProviderResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateAccess(params: UpdateAccessRequest): Request[UpdateAccessResponse] = js.native
    def updateAgreement(params: UpdateAgreementRequest): Request[UpdateAgreementResponse] = js.native
    def updateCertificate(params: UpdateCertificateRequest): Request[UpdateCertificateResponse] = js.native
    def updateConnector(params: UpdateConnectorRequest): Request[UpdateConnectorResponse] = js.native
    def updateHostKey(params: UpdateHostKeyRequest): Request[UpdateHostKeyResponse] = js.native
    def updateProfile(params: UpdateProfileRequest): Request[UpdateProfileResponse] = js.native
    def updateServer(params: UpdateServerRequest): Request[UpdateServerResponse] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse] = js.native
  }
  object Transfer {
    @inline implicit def toOps(service: Transfer): TransferOps = {
      new TransferOps(service)
    }
  }

  /** Contains the details for a connector object. The connector object is used for AS2 outbound processes, to connect the Transfer Family customer with the trading partner.
    */
  @js.native
  trait As2ConnectorConfig extends js.Object {
    var Compression: js.UndefOr[CompressionEnum]
    var EncryptionAlgorithm: js.UndefOr[EncryptionAlg]
    var LocalProfileId: js.UndefOr[ProfileId]
    var MdnResponse: js.UndefOr[MdnResponse]
    var MdnSigningAlgorithm: js.UndefOr[MdnSigningAlg]
    var MessageSubject: js.UndefOr[MessageSubject]
    var PartnerProfileId: js.UndefOr[ProfileId]
    var SigningAlgorithm: js.UndefOr[SigningAlg]
  }

  object As2ConnectorConfig {
    @inline
    def apply(
        Compression: js.UndefOr[CompressionEnum] = js.undefined,
        EncryptionAlgorithm: js.UndefOr[EncryptionAlg] = js.undefined,
        LocalProfileId: js.UndefOr[ProfileId] = js.undefined,
        MdnResponse: js.UndefOr[MdnResponse] = js.undefined,
        MdnSigningAlgorithm: js.UndefOr[MdnSigningAlg] = js.undefined,
        MessageSubject: js.UndefOr[MessageSubject] = js.undefined,
        PartnerProfileId: js.UndefOr[ProfileId] = js.undefined,
        SigningAlgorithm: js.UndefOr[SigningAlg] = js.undefined
    ): As2ConnectorConfig = {
      val __obj = js.Dynamic.literal()
      Compression.foreach(__v => __obj.updateDynamic("Compression")(__v.asInstanceOf[js.Any]))
      EncryptionAlgorithm.foreach(__v => __obj.updateDynamic("EncryptionAlgorithm")(__v.asInstanceOf[js.Any]))
      LocalProfileId.foreach(__v => __obj.updateDynamic("LocalProfileId")(__v.asInstanceOf[js.Any]))
      MdnResponse.foreach(__v => __obj.updateDynamic("MdnResponse")(__v.asInstanceOf[js.Any]))
      MdnSigningAlgorithm.foreach(__v => __obj.updateDynamic("MdnSigningAlgorithm")(__v.asInstanceOf[js.Any]))
      MessageSubject.foreach(__v => __obj.updateDynamic("MessageSubject")(__v.asInstanceOf[js.Any]))
      PartnerProfileId.foreach(__v => __obj.updateDynamic("PartnerProfileId")(__v.asInstanceOf[js.Any]))
      SigningAlgorithm.foreach(__v => __obj.updateDynamic("SigningAlgorithm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[As2ConnectorConfig]
    }
  }

  /** Each step type has its own <code>StepDetails</code> structure.
    */
  @js.native
  trait CopyStepDetails extends js.Object {
    var DestinationFileLocation: js.UndefOr[InputFileLocation]
    var Name: js.UndefOr[WorkflowStepName]
    var OverwriteExisting: js.UndefOr[OverwriteExisting]
    var SourceFileLocation: js.UndefOr[SourceFileLocation]
  }

  object CopyStepDetails {
    @inline
    def apply(
        DestinationFileLocation: js.UndefOr[InputFileLocation] = js.undefined,
        Name: js.UndefOr[WorkflowStepName] = js.undefined,
        OverwriteExisting: js.UndefOr[OverwriteExisting] = js.undefined,
        SourceFileLocation: js.UndefOr[SourceFileLocation] = js.undefined
    ): CopyStepDetails = {
      val __obj = js.Dynamic.literal()
      DestinationFileLocation.foreach(__v => __obj.updateDynamic("DestinationFileLocation")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OverwriteExisting.foreach(__v => __obj.updateDynamic("OverwriteExisting")(__v.asInstanceOf[js.Any]))
      SourceFileLocation.foreach(__v => __obj.updateDynamic("SourceFileLocation")(__v.asInstanceOf[js.Any]))
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
  trait CreateAgreementRequest extends js.Object {
    var AccessRole: Role
    var BaseDirectory: HomeDirectory
    var LocalProfileId: ProfileId
    var PartnerProfileId: ProfileId
    var ServerId: ServerId
    var Description: js.UndefOr[Description]
    var Status: js.UndefOr[AgreementStatusType]
    var Tags: js.UndefOr[Tags]
  }

  object CreateAgreementRequest {
    @inline
    def apply(
        AccessRole: Role,
        BaseDirectory: HomeDirectory,
        LocalProfileId: ProfileId,
        PartnerProfileId: ProfileId,
        ServerId: ServerId,
        Description: js.UndefOr[Description] = js.undefined,
        Status: js.UndefOr[AgreementStatusType] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateAgreementRequest = {
      val __obj = js.Dynamic.literal(
        "AccessRole" -> AccessRole.asInstanceOf[js.Any],
        "BaseDirectory" -> BaseDirectory.asInstanceOf[js.Any],
        "LocalProfileId" -> LocalProfileId.asInstanceOf[js.Any],
        "PartnerProfileId" -> PartnerProfileId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAgreementRequest]
    }
  }

  @js.native
  trait CreateAgreementResponse extends js.Object {
    var AgreementId: AgreementId
  }

  object CreateAgreementResponse {
    @inline
    def apply(
        AgreementId: AgreementId
    ): CreateAgreementResponse = {
      val __obj = js.Dynamic.literal(
        "AgreementId" -> AgreementId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAgreementResponse]
    }
  }

  @js.native
  trait CreateConnectorRequest extends js.Object {
    var AccessRole: Role
    var As2Config: As2ConnectorConfig
    var Url: Url
    var LoggingRole: js.UndefOr[Role]
    var Tags: js.UndefOr[Tags]
  }

  object CreateConnectorRequest {
    @inline
    def apply(
        AccessRole: Role,
        As2Config: As2ConnectorConfig,
        Url: Url,
        LoggingRole: js.UndefOr[Role] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "AccessRole" -> AccessRole.asInstanceOf[js.Any],
        "As2Config" -> As2Config.asInstanceOf[js.Any],
        "Url" -> Url.asInstanceOf[js.Any]
      )

      LoggingRole.foreach(__v => __obj.updateDynamic("LoggingRole")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectorRequest]
    }
  }

  @js.native
  trait CreateConnectorResponse extends js.Object {
    var ConnectorId: ConnectorId
  }

  object CreateConnectorResponse {
    @inline
    def apply(
        ConnectorId: ConnectorId
    ): CreateConnectorResponse = {
      val __obj = js.Dynamic.literal(
        "ConnectorId" -> ConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateConnectorResponse]
    }
  }

  @js.native
  trait CreateProfileRequest extends js.Object {
    var As2Id: As2Id
    var ProfileType: ProfileType
    var CertificateIds: js.UndefOr[CertificateIds]
    var Tags: js.UndefOr[Tags]
  }

  object CreateProfileRequest {
    @inline
    def apply(
        As2Id: As2Id,
        ProfileType: ProfileType,
        CertificateIds: js.UndefOr[CertificateIds] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateProfileRequest = {
      val __obj = js.Dynamic.literal(
        "As2Id" -> As2Id.asInstanceOf[js.Any],
        "ProfileType" -> ProfileType.asInstanceOf[js.Any]
      )

      CertificateIds.foreach(__v => __obj.updateDynamic("CertificateIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProfileRequest]
    }
  }

  @js.native
  trait CreateProfileResponse extends js.Object {
    var ProfileId: ProfileId
  }

  object CreateProfileResponse {
    @inline
    def apply(
        ProfileId: ProfileId
    ): CreateProfileResponse = {
      val __obj = js.Dynamic.literal(
        "ProfileId" -> ProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateProfileResponse]
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
    var PostAuthenticationLoginBanner: js.UndefOr[PostAuthenticationLoginBanner]
    var PreAuthenticationLoginBanner: js.UndefOr[PreAuthenticationLoginBanner]
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
        PostAuthenticationLoginBanner: js.UndefOr[PostAuthenticationLoginBanner] = js.undefined,
        PreAuthenticationLoginBanner: js.UndefOr[PreAuthenticationLoginBanner] = js.undefined,
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
      PostAuthenticationLoginBanner.foreach(__v => __obj.updateDynamic("PostAuthenticationLoginBanner")(__v.asInstanceOf[js.Any]))
      PreAuthenticationLoginBanner.foreach(__v => __obj.updateDynamic("PreAuthenticationLoginBanner")(__v.asInstanceOf[js.Any]))
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
    var SourceFileLocation: js.UndefOr[SourceFileLocation]
    var Target: js.UndefOr[CustomStepTarget]
    var TimeoutSeconds: js.UndefOr[CustomStepTimeoutSeconds]
  }

  object CustomStepDetails {
    @inline
    def apply(
        Name: js.UndefOr[WorkflowStepName] = js.undefined,
        SourceFileLocation: js.UndefOr[SourceFileLocation] = js.undefined,
        Target: js.UndefOr[CustomStepTarget] = js.undefined,
        TimeoutSeconds: js.UndefOr[CustomStepTimeoutSeconds] = js.undefined
    ): CustomStepDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SourceFileLocation.foreach(__v => __obj.updateDynamic("SourceFileLocation")(__v.asInstanceOf[js.Any]))
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
  trait DeleteAgreementRequest extends js.Object {
    var AgreementId: AgreementId
    var ServerId: ServerId
  }

  object DeleteAgreementRequest {
    @inline
    def apply(
        AgreementId: AgreementId,
        ServerId: ServerId
    ): DeleteAgreementRequest = {
      val __obj = js.Dynamic.literal(
        "AgreementId" -> AgreementId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAgreementRequest]
    }
  }

  @js.native
  trait DeleteCertificateRequest extends js.Object {
    var CertificateId: CertificateId
  }

  object DeleteCertificateRequest {
    @inline
    def apply(
        CertificateId: CertificateId
    ): DeleteCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateId" -> CertificateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCertificateRequest]
    }
  }

  @js.native
  trait DeleteConnectorRequest extends js.Object {
    var ConnectorId: ConnectorId
  }

  object DeleteConnectorRequest {
    @inline
    def apply(
        ConnectorId: ConnectorId
    ): DeleteConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectorId" -> ConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConnectorRequest]
    }
  }

  @js.native
  trait DeleteHostKeyRequest extends js.Object {
    var HostKeyId: HostKeyId
    var ServerId: ServerId
  }

  object DeleteHostKeyRequest {
    @inline
    def apply(
        HostKeyId: HostKeyId,
        ServerId: ServerId
    ): DeleteHostKeyRequest = {
      val __obj = js.Dynamic.literal(
        "HostKeyId" -> HostKeyId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteHostKeyRequest]
    }
  }

  @js.native
  trait DeleteProfileRequest extends js.Object {
    var ProfileId: ProfileId
  }

  object DeleteProfileRequest {
    @inline
    def apply(
        ProfileId: ProfileId
    ): DeleteProfileRequest = {
      val __obj = js.Dynamic.literal(
        "ProfileId" -> ProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProfileRequest]
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
    var SourceFileLocation: js.UndefOr[SourceFileLocation]
  }

  object DeleteStepDetails {
    @inline
    def apply(
        Name: js.UndefOr[WorkflowStepName] = js.undefined,
        SourceFileLocation: js.UndefOr[SourceFileLocation] = js.undefined
    ): DeleteStepDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SourceFileLocation.foreach(__v => __obj.updateDynamic("SourceFileLocation")(__v.asInstanceOf[js.Any]))
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
  trait DescribeAgreementRequest extends js.Object {
    var AgreementId: AgreementId
    var ServerId: ServerId
  }

  object DescribeAgreementRequest {
    @inline
    def apply(
        AgreementId: AgreementId,
        ServerId: ServerId
    ): DescribeAgreementRequest = {
      val __obj = js.Dynamic.literal(
        "AgreementId" -> AgreementId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAgreementRequest]
    }
  }

  @js.native
  trait DescribeAgreementResponse extends js.Object {
    var Agreement: DescribedAgreement
  }

  object DescribeAgreementResponse {
    @inline
    def apply(
        Agreement: DescribedAgreement
    ): DescribeAgreementResponse = {
      val __obj = js.Dynamic.literal(
        "Agreement" -> Agreement.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAgreementResponse]
    }
  }

  @js.native
  trait DescribeCertificateRequest extends js.Object {
    var CertificateId: CertificateId
  }

  object DescribeCertificateRequest {
    @inline
    def apply(
        CertificateId: CertificateId
    ): DescribeCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateId" -> CertificateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeCertificateRequest]
    }
  }

  @js.native
  trait DescribeCertificateResponse extends js.Object {
    var Certificate: DescribedCertificate
  }

  object DescribeCertificateResponse {
    @inline
    def apply(
        Certificate: DescribedCertificate
    ): DescribeCertificateResponse = {
      val __obj = js.Dynamic.literal(
        "Certificate" -> Certificate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeCertificateResponse]
    }
  }

  @js.native
  trait DescribeConnectorRequest extends js.Object {
    var ConnectorId: ConnectorId
  }

  object DescribeConnectorRequest {
    @inline
    def apply(
        ConnectorId: ConnectorId
    ): DescribeConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectorId" -> ConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeConnectorRequest]
    }
  }

  @js.native
  trait DescribeConnectorResponse extends js.Object {
    var Connector: DescribedConnector
  }

  object DescribeConnectorResponse {
    @inline
    def apply(
        Connector: DescribedConnector
    ): DescribeConnectorResponse = {
      val __obj = js.Dynamic.literal(
        "Connector" -> Connector.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeConnectorResponse]
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
  trait DescribeHostKeyRequest extends js.Object {
    var HostKeyId: HostKeyId
    var ServerId: ServerId
  }

  object DescribeHostKeyRequest {
    @inline
    def apply(
        HostKeyId: HostKeyId,
        ServerId: ServerId
    ): DescribeHostKeyRequest = {
      val __obj = js.Dynamic.literal(
        "HostKeyId" -> HostKeyId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeHostKeyRequest]
    }
  }

  @js.native
  trait DescribeHostKeyResponse extends js.Object {
    var HostKey: DescribedHostKey
  }

  object DescribeHostKeyResponse {
    @inline
    def apply(
        HostKey: DescribedHostKey
    ): DescribeHostKeyResponse = {
      val __obj = js.Dynamic.literal(
        "HostKey" -> HostKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeHostKeyResponse]
    }
  }

  @js.native
  trait DescribeProfileRequest extends js.Object {
    var ProfileId: ProfileId
  }

  object DescribeProfileRequest {
    @inline
    def apply(
        ProfileId: ProfileId
    ): DescribeProfileRequest = {
      val __obj = js.Dynamic.literal(
        "ProfileId" -> ProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeProfileRequest]
    }
  }

  @js.native
  trait DescribeProfileResponse extends js.Object {
    var Profile: DescribedProfile
  }

  object DescribeProfileResponse {
    @inline
    def apply(
        Profile: DescribedProfile
    ): DescribeProfileResponse = {
      val __obj = js.Dynamic.literal(
        "Profile" -> Profile.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeProfileResponse]
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

  /** Describes the properties of an agreement.
    */
  @js.native
  trait DescribedAgreement extends js.Object {
    var Arn: Arn
    var AccessRole: js.UndefOr[Role]
    var AgreementId: js.UndefOr[AgreementId]
    var BaseDirectory: js.UndefOr[HomeDirectory]
    var Description: js.UndefOr[Description]
    var LocalProfileId: js.UndefOr[ProfileId]
    var PartnerProfileId: js.UndefOr[ProfileId]
    var ServerId: js.UndefOr[ServerId]
    var Status: js.UndefOr[AgreementStatusType]
    var Tags: js.UndefOr[Tags]
  }

  object DescribedAgreement {
    @inline
    def apply(
        Arn: Arn,
        AccessRole: js.UndefOr[Role] = js.undefined,
        AgreementId: js.UndefOr[AgreementId] = js.undefined,
        BaseDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LocalProfileId: js.UndefOr[ProfileId] = js.undefined,
        PartnerProfileId: js.UndefOr[ProfileId] = js.undefined,
        ServerId: js.UndefOr[ServerId] = js.undefined,
        Status: js.UndefOr[AgreementStatusType] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribedAgreement = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      AccessRole.foreach(__v => __obj.updateDynamic("AccessRole")(__v.asInstanceOf[js.Any]))
      AgreementId.foreach(__v => __obj.updateDynamic("AgreementId")(__v.asInstanceOf[js.Any]))
      BaseDirectory.foreach(__v => __obj.updateDynamic("BaseDirectory")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LocalProfileId.foreach(__v => __obj.updateDynamic("LocalProfileId")(__v.asInstanceOf[js.Any]))
      PartnerProfileId.foreach(__v => __obj.updateDynamic("PartnerProfileId")(__v.asInstanceOf[js.Any]))
      ServerId.foreach(__v => __obj.updateDynamic("ServerId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedAgreement]
    }
  }

  /** Describes the properties of a certificate.
    */
  @js.native
  trait DescribedCertificate extends js.Object {
    var Arn: Arn
    var ActiveDate: js.UndefOr[CertDate]
    var Certificate: js.UndefOr[CertificateBodyType]
    var CertificateChain: js.UndefOr[CertificateChainType]
    var CertificateId: js.UndefOr[CertificateId]
    var Description: js.UndefOr[Description]
    var InactiveDate: js.UndefOr[CertDate]
    var NotAfterDate: js.UndefOr[CertDate]
    var NotBeforeDate: js.UndefOr[CertDate]
    var Serial: js.UndefOr[CertSerial]
    var Status: js.UndefOr[CertificateStatusType]
    var Tags: js.UndefOr[Tags]
    var Type: js.UndefOr[CertificateType]
    var Usage: js.UndefOr[CertificateUsageType]
  }

  object DescribedCertificate {
    @inline
    def apply(
        Arn: Arn,
        ActiveDate: js.UndefOr[CertDate] = js.undefined,
        Certificate: js.UndefOr[CertificateBodyType] = js.undefined,
        CertificateChain: js.UndefOr[CertificateChainType] = js.undefined,
        CertificateId: js.UndefOr[CertificateId] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        InactiveDate: js.UndefOr[CertDate] = js.undefined,
        NotAfterDate: js.UndefOr[CertDate] = js.undefined,
        NotBeforeDate: js.UndefOr[CertDate] = js.undefined,
        Serial: js.UndefOr[CertSerial] = js.undefined,
        Status: js.UndefOr[CertificateStatusType] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[CertificateType] = js.undefined,
        Usage: js.UndefOr[CertificateUsageType] = js.undefined
    ): DescribedCertificate = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      ActiveDate.foreach(__v => __obj.updateDynamic("ActiveDate")(__v.asInstanceOf[js.Any]))
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      CertificateChain.foreach(__v => __obj.updateDynamic("CertificateChain")(__v.asInstanceOf[js.Any]))
      CertificateId.foreach(__v => __obj.updateDynamic("CertificateId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      InactiveDate.foreach(__v => __obj.updateDynamic("InactiveDate")(__v.asInstanceOf[js.Any]))
      NotAfterDate.foreach(__v => __obj.updateDynamic("NotAfterDate")(__v.asInstanceOf[js.Any]))
      NotBeforeDate.foreach(__v => __obj.updateDynamic("NotBeforeDate")(__v.asInstanceOf[js.Any]))
      Serial.foreach(__v => __obj.updateDynamic("Serial")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Usage.foreach(__v => __obj.updateDynamic("Usage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedCertificate]
    }
  }

  /** Describes the parameters for the connector, as identified by the <code>ConnectorId</code>.
    */
  @js.native
  trait DescribedConnector extends js.Object {
    var Arn: Arn
    var AccessRole: js.UndefOr[Role]
    var As2Config: js.UndefOr[As2ConnectorConfig]
    var ConnectorId: js.UndefOr[ConnectorId]
    var LoggingRole: js.UndefOr[Role]
    var Tags: js.UndefOr[Tags]
    var Url: js.UndefOr[Url]
  }

  object DescribedConnector {
    @inline
    def apply(
        Arn: Arn,
        AccessRole: js.UndefOr[Role] = js.undefined,
        As2Config: js.UndefOr[As2ConnectorConfig] = js.undefined,
        ConnectorId: js.UndefOr[ConnectorId] = js.undefined,
        LoggingRole: js.UndefOr[Role] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Url: js.UndefOr[Url] = js.undefined
    ): DescribedConnector = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      AccessRole.foreach(__v => __obj.updateDynamic("AccessRole")(__v.asInstanceOf[js.Any]))
      As2Config.foreach(__v => __obj.updateDynamic("As2Config")(__v.asInstanceOf[js.Any]))
      ConnectorId.foreach(__v => __obj.updateDynamic("ConnectorId")(__v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.updateDynamic("LoggingRole")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedConnector]
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

  /** The details for a server host key.
    */
  @js.native
  trait DescribedHostKey extends js.Object {
    var Arn: Arn
    var DateImported: js.UndefOr[DateImported]
    var Description: js.UndefOr[HostKeyDescription]
    var HostKeyFingerprint: js.UndefOr[HostKeyFingerprint]
    var HostKeyId: js.UndefOr[HostKeyId]
    var Tags: js.UndefOr[Tags]
    var Type: js.UndefOr[HostKeyType]
  }

  object DescribedHostKey {
    @inline
    def apply(
        Arn: Arn,
        DateImported: js.UndefOr[DateImported] = js.undefined,
        Description: js.UndefOr[HostKeyDescription] = js.undefined,
        HostKeyFingerprint: js.UndefOr[HostKeyFingerprint] = js.undefined,
        HostKeyId: js.UndefOr[HostKeyId] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[HostKeyType] = js.undefined
    ): DescribedHostKey = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      DateImported.foreach(__v => __obj.updateDynamic("DateImported")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HostKeyFingerprint.foreach(__v => __obj.updateDynamic("HostKeyFingerprint")(__v.asInstanceOf[js.Any]))
      HostKeyId.foreach(__v => __obj.updateDynamic("HostKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedHostKey]
    }
  }

  /** The details for a local or partner AS2 profile.
    */
  @js.native
  trait DescribedProfile extends js.Object {
    var Arn: Arn
    var As2Id: js.UndefOr[As2Id]
    var CertificateIds: js.UndefOr[CertificateIds]
    var ProfileId: js.UndefOr[ProfileId]
    var ProfileType: js.UndefOr[ProfileType]
    var Tags: js.UndefOr[Tags]
  }

  object DescribedProfile {
    @inline
    def apply(
        Arn: Arn,
        As2Id: js.UndefOr[As2Id] = js.undefined,
        CertificateIds: js.UndefOr[CertificateIds] = js.undefined,
        ProfileId: js.UndefOr[ProfileId] = js.undefined,
        ProfileType: js.UndefOr[ProfileType] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribedProfile = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      As2Id.foreach(__v => __obj.updateDynamic("As2Id")(__v.asInstanceOf[js.Any]))
      CertificateIds.foreach(__v => __obj.updateDynamic("CertificateIds")(__v.asInstanceOf[js.Any]))
      ProfileId.foreach(__v => __obj.updateDynamic("ProfileId")(__v.asInstanceOf[js.Any]))
      ProfileType.foreach(__v => __obj.updateDynamic("ProfileType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribedProfile]
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
    var PostAuthenticationLoginBanner: js.UndefOr[PostAuthenticationLoginBanner]
    var PreAuthenticationLoginBanner: js.UndefOr[PreAuthenticationLoginBanner]
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
        PostAuthenticationLoginBanner: js.UndefOr[PostAuthenticationLoginBanner] = js.undefined,
        PreAuthenticationLoginBanner: js.UndefOr[PreAuthenticationLoginBanner] = js.undefined,
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
      PostAuthenticationLoginBanner.foreach(__v => __obj.updateDynamic("PostAuthenticationLoginBanner")(__v.asInstanceOf[js.Any]))
      PreAuthenticationLoginBanner.foreach(__v => __obj.updateDynamic("PreAuthenticationLoginBanner")(__v.asInstanceOf[js.Any]))
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

  /** Represents an object that contains entries and targets for <code>HomeDirectoryMappings</code>. The following is an <code>Entry</code> and <code>Target</code> pair example for <code>chroot</code>. <code>[ { "Entry": "/", "Target": "/bucket_name/home/mydirectory" } ]</code>
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
  trait ImportCertificateRequest extends js.Object {
    var Certificate: CertificateBodyType
    var Usage: CertificateUsageType
    var ActiveDate: js.UndefOr[CertDate]
    var CertificateChain: js.UndefOr[CertificateChainType]
    var Description: js.UndefOr[Description]
    var InactiveDate: js.UndefOr[CertDate]
    var PrivateKey: js.UndefOr[PrivateKeyType]
    var Tags: js.UndefOr[Tags]
  }

  object ImportCertificateRequest {
    @inline
    def apply(
        Certificate: CertificateBodyType,
        Usage: CertificateUsageType,
        ActiveDate: js.UndefOr[CertDate] = js.undefined,
        CertificateChain: js.UndefOr[CertificateChainType] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        InactiveDate: js.UndefOr[CertDate] = js.undefined,
        PrivateKey: js.UndefOr[PrivateKeyType] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ImportCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "Certificate" -> Certificate.asInstanceOf[js.Any],
        "Usage" -> Usage.asInstanceOf[js.Any]
      )

      ActiveDate.foreach(__v => __obj.updateDynamic("ActiveDate")(__v.asInstanceOf[js.Any]))
      CertificateChain.foreach(__v => __obj.updateDynamic("CertificateChain")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      InactiveDate.foreach(__v => __obj.updateDynamic("InactiveDate")(__v.asInstanceOf[js.Any]))
      PrivateKey.foreach(__v => __obj.updateDynamic("PrivateKey")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportCertificateRequest]
    }
  }

  @js.native
  trait ImportCertificateResponse extends js.Object {
    var CertificateId: CertificateId
  }

  object ImportCertificateResponse {
    @inline
    def apply(
        CertificateId: CertificateId
    ): ImportCertificateResponse = {
      val __obj = js.Dynamic.literal(
        "CertificateId" -> CertificateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportCertificateResponse]
    }
  }

  @js.native
  trait ImportHostKeyRequest extends js.Object {
    var HostKeyBody: HostKey
    var ServerId: ServerId
    var Description: js.UndefOr[HostKeyDescription]
    var Tags: js.UndefOr[Tags]
  }

  object ImportHostKeyRequest {
    @inline
    def apply(
        HostKeyBody: HostKey,
        ServerId: ServerId,
        Description: js.UndefOr[HostKeyDescription] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ImportHostKeyRequest = {
      val __obj = js.Dynamic.literal(
        "HostKeyBody" -> HostKeyBody.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportHostKeyRequest]
    }
  }

  @js.native
  trait ImportHostKeyResponse extends js.Object {
    var HostKeyId: HostKeyId
    var ServerId: ServerId
  }

  object ImportHostKeyResponse {
    @inline
    def apply(
        HostKeyId: HostKeyId,
        ServerId: ServerId
    ): ImportHostKeyResponse = {
      val __obj = js.Dynamic.literal(
        "HostKeyId" -> HostKeyId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportHostKeyResponse]
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
  trait ListAgreementsRequest extends js.Object {
    var ServerId: ServerId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAgreementsRequest {
    @inline
    def apply(
        ServerId: ServerId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAgreementsRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAgreementsRequest]
    }
  }

  @js.native
  trait ListAgreementsResponse extends js.Object {
    var Agreements: ListedAgreements
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAgreementsResponse {
    @inline
    def apply(
        Agreements: ListedAgreements,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAgreementsResponse = {
      val __obj = js.Dynamic.literal(
        "Agreements" -> Agreements.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAgreementsResponse]
    }
  }

  @js.native
  trait ListCertificatesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCertificatesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCertificatesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCertificatesRequest]
    }
  }

  @js.native
  trait ListCertificatesResponse extends js.Object {
    var Certificates: ListedCertificates
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCertificatesResponse {
    @inline
    def apply(
        Certificates: ListedCertificates,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCertificatesResponse = {
      val __obj = js.Dynamic.literal(
        "Certificates" -> Certificates.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCertificatesResponse]
    }
  }

  @js.native
  trait ListConnectorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConnectorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConnectorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectorsRequest]
    }
  }

  @js.native
  trait ListConnectorsResponse extends js.Object {
    var Connectors: ListedConnectors
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConnectorsResponse {
    @inline
    def apply(
        Connectors: ListedConnectors,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConnectorsResponse = {
      val __obj = js.Dynamic.literal(
        "Connectors" -> Connectors.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectorsResponse]
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
  trait ListHostKeysRequest extends js.Object {
    var ServerId: ServerId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHostKeysRequest {
    @inline
    def apply(
        ServerId: ServerId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHostKeysRequest = {
      val __obj = js.Dynamic.literal(
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHostKeysRequest]
    }
  }

  @js.native
  trait ListHostKeysResponse extends js.Object {
    var HostKeys: ListedHostKeys
    var ServerId: ServerId
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHostKeysResponse {
    @inline
    def apply(
        HostKeys: ListedHostKeys,
        ServerId: ServerId,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHostKeysResponse = {
      val __obj = js.Dynamic.literal(
        "HostKeys" -> HostKeys.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHostKeysResponse]
    }
  }

  @js.native
  trait ListProfilesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ProfileType: js.UndefOr[ProfileType]
  }

  object ListProfilesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ProfileType: js.UndefOr[ProfileType] = js.undefined
    ): ListProfilesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProfileType.foreach(__v => __obj.updateDynamic("ProfileType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfilesRequest]
    }
  }

  @js.native
  trait ListProfilesResponse extends js.Object {
    var Profiles: ListedProfiles
    var NextToken: js.UndefOr[NextToken]
  }

  object ListProfilesResponse {
    @inline
    def apply(
        Profiles: ListedProfiles,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProfilesResponse = {
      val __obj = js.Dynamic.literal(
        "Profiles" -> Profiles.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfilesResponse]
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

  /** Describes the properties of an agreement.
    */
  @js.native
  trait ListedAgreement extends js.Object {
    var AgreementId: js.UndefOr[AgreementId]
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[Description]
    var LocalProfileId: js.UndefOr[ProfileId]
    var PartnerProfileId: js.UndefOr[ProfileId]
    var ServerId: js.UndefOr[ServerId]
    var Status: js.UndefOr[AgreementStatusType]
  }

  object ListedAgreement {
    @inline
    def apply(
        AgreementId: js.UndefOr[AgreementId] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LocalProfileId: js.UndefOr[ProfileId] = js.undefined,
        PartnerProfileId: js.UndefOr[ProfileId] = js.undefined,
        ServerId: js.UndefOr[ServerId] = js.undefined,
        Status: js.UndefOr[AgreementStatusType] = js.undefined
    ): ListedAgreement = {
      val __obj = js.Dynamic.literal()
      AgreementId.foreach(__v => __obj.updateDynamic("AgreementId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LocalProfileId.foreach(__v => __obj.updateDynamic("LocalProfileId")(__v.asInstanceOf[js.Any]))
      PartnerProfileId.foreach(__v => __obj.updateDynamic("PartnerProfileId")(__v.asInstanceOf[js.Any]))
      ServerId.foreach(__v => __obj.updateDynamic("ServerId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedAgreement]
    }
  }

  /** Describes the properties of a certificate.
    */
  @js.native
  trait ListedCertificate extends js.Object {
    var ActiveDate: js.UndefOr[CertDate]
    var Arn: js.UndefOr[Arn]
    var CertificateId: js.UndefOr[CertificateId]
    var Description: js.UndefOr[Description]
    var InactiveDate: js.UndefOr[CertDate]
    var Status: js.UndefOr[CertificateStatusType]
    var Type: js.UndefOr[CertificateType]
    var Usage: js.UndefOr[CertificateUsageType]
  }

  object ListedCertificate {
    @inline
    def apply(
        ActiveDate: js.UndefOr[CertDate] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        CertificateId: js.UndefOr[CertificateId] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        InactiveDate: js.UndefOr[CertDate] = js.undefined,
        Status: js.UndefOr[CertificateStatusType] = js.undefined,
        Type: js.UndefOr[CertificateType] = js.undefined,
        Usage: js.UndefOr[CertificateUsageType] = js.undefined
    ): ListedCertificate = {
      val __obj = js.Dynamic.literal()
      ActiveDate.foreach(__v => __obj.updateDynamic("ActiveDate")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CertificateId.foreach(__v => __obj.updateDynamic("CertificateId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      InactiveDate.foreach(__v => __obj.updateDynamic("InactiveDate")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Usage.foreach(__v => __obj.updateDynamic("Usage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedCertificate]
    }
  }

  /** Returns details of the connector that is specified.
    */
  @js.native
  trait ListedConnector extends js.Object {
    var Arn: js.UndefOr[Arn]
    var ConnectorId: js.UndefOr[ConnectorId]
    var Url: js.UndefOr[Url]
  }

  object ListedConnector {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        ConnectorId: js.UndefOr[ConnectorId] = js.undefined,
        Url: js.UndefOr[Url] = js.undefined
    ): ListedConnector = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ConnectorId.foreach(__v => __obj.updateDynamic("ConnectorId")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedConnector]
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

  /** Returns properties of the host key that's specified.
    */
  @js.native
  trait ListedHostKey extends js.Object {
    var Arn: Arn
    var DateImported: js.UndefOr[DateImported]
    var Description: js.UndefOr[HostKeyDescription]
    var Fingerprint: js.UndefOr[HostKeyFingerprint]
    var HostKeyId: js.UndefOr[HostKeyId]
    var Type: js.UndefOr[HostKeyType]
  }

  object ListedHostKey {
    @inline
    def apply(
        Arn: Arn,
        DateImported: js.UndefOr[DateImported] = js.undefined,
        Description: js.UndefOr[HostKeyDescription] = js.undefined,
        Fingerprint: js.UndefOr[HostKeyFingerprint] = js.undefined,
        HostKeyId: js.UndefOr[HostKeyId] = js.undefined,
        Type: js.UndefOr[HostKeyType] = js.undefined
    ): ListedHostKey = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      DateImported.foreach(__v => __obj.updateDynamic("DateImported")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Fingerprint.foreach(__v => __obj.updateDynamic("Fingerprint")(__v.asInstanceOf[js.Any]))
      HostKeyId.foreach(__v => __obj.updateDynamic("HostKeyId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedHostKey]
    }
  }

  /** Returns the properties of the profile that was specified.
    */
  @js.native
  trait ListedProfile extends js.Object {
    var Arn: js.UndefOr[Arn]
    var As2Id: js.UndefOr[As2Id]
    var ProfileId: js.UndefOr[ProfileId]
    var ProfileType: js.UndefOr[ProfileType]
  }

  object ListedProfile {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        As2Id: js.UndefOr[As2Id] = js.undefined,
        ProfileId: js.UndefOr[ProfileId] = js.undefined,
        ProfileType: js.UndefOr[ProfileType] = js.undefined
    ): ListedProfile = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      As2Id.foreach(__v => __obj.updateDynamic("As2Id")(__v.asInstanceOf[js.Any]))
      ProfileId.foreach(__v => __obj.updateDynamic("ProfileId")(__v.asInstanceOf[js.Any]))
      ProfileType.foreach(__v => __obj.updateDynamic("ProfileType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListedProfile]
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

  /** Contains the identifier, text description, and Amazon Resource Name (ARN) for the workflow.
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
    var As2Transports: js.UndefOr[As2Transports]
    var PassiveIp: js.UndefOr[PassiveIp]
    var SetStatOption: js.UndefOr[SetStatOption]
    var TlsSessionResumptionMode: js.UndefOr[TlsSessionResumptionMode]
  }

  object ProtocolDetails {
    @inline
    def apply(
        As2Transports: js.UndefOr[As2Transports] = js.undefined,
        PassiveIp: js.UndefOr[PassiveIp] = js.undefined,
        SetStatOption: js.UndefOr[SetStatOption] = js.undefined,
        TlsSessionResumptionMode: js.UndefOr[TlsSessionResumptionMode] = js.undefined
    ): ProtocolDetails = {
      val __obj = js.Dynamic.literal()
      As2Transports.foreach(__v => __obj.updateDynamic("As2Transports")(__v.asInstanceOf[js.Any]))
      PassiveIp.foreach(__v => __obj.updateDynamic("PassiveIp")(__v.asInstanceOf[js.Any]))
      SetStatOption.foreach(__v => __obj.updateDynamic("SetStatOption")(__v.asInstanceOf[js.Any]))
      TlsSessionResumptionMode.foreach(__v => __obj.updateDynamic("TlsSessionResumptionMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProtocolDetails]
    }
  }

  /** Specifies the details for the file location for the file that's being used in the workflow. Only applicable if you are using S3 storage.
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

  /** A container object for the session details that are associated with a workflow.
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
  trait StartFileTransferRequest extends js.Object {
    var ConnectorId: ConnectorId
    var SendFilePaths: FilePaths
  }

  object StartFileTransferRequest {
    @inline
    def apply(
        ConnectorId: ConnectorId,
        SendFilePaths: FilePaths
    ): StartFileTransferRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectorId" -> ConnectorId.asInstanceOf[js.Any],
        "SendFilePaths" -> SendFilePaths.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartFileTransferRequest]
    }
  }

  @js.native
  trait StartFileTransferResponse extends js.Object {
    var TransferId: TransferId
  }

  object StartFileTransferResponse {
    @inline
    def apply(
        TransferId: TransferId
    ): StartFileTransferResponse = {
      val __obj = js.Dynamic.literal(
        "TransferId" -> TransferId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartFileTransferResponse]
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
    var SourceFileLocation: js.UndefOr[SourceFileLocation]
    var Tags: js.UndefOr[S3Tags]
  }

  object TagStepDetails {
    @inline
    def apply(
        Name: js.UndefOr[WorkflowStepName] = js.undefined,
        SourceFileLocation: js.UndefOr[SourceFileLocation] = js.undefined,
        Tags: js.UndefOr[S3Tags] = js.undefined
    ): TagStepDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SourceFileLocation.foreach(__v => __obj.updateDynamic("SourceFileLocation")(__v.asInstanceOf[js.Any]))
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
  trait UpdateAgreementRequest extends js.Object {
    var AgreementId: AgreementId
    var ServerId: ServerId
    var AccessRole: js.UndefOr[Role]
    var BaseDirectory: js.UndefOr[HomeDirectory]
    var Description: js.UndefOr[Description]
    var LocalProfileId: js.UndefOr[ProfileId]
    var PartnerProfileId: js.UndefOr[ProfileId]
    var Status: js.UndefOr[AgreementStatusType]
  }

  object UpdateAgreementRequest {
    @inline
    def apply(
        AgreementId: AgreementId,
        ServerId: ServerId,
        AccessRole: js.UndefOr[Role] = js.undefined,
        BaseDirectory: js.UndefOr[HomeDirectory] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LocalProfileId: js.UndefOr[ProfileId] = js.undefined,
        PartnerProfileId: js.UndefOr[ProfileId] = js.undefined,
        Status: js.UndefOr[AgreementStatusType] = js.undefined
    ): UpdateAgreementRequest = {
      val __obj = js.Dynamic.literal(
        "AgreementId" -> AgreementId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )

      AccessRole.foreach(__v => __obj.updateDynamic("AccessRole")(__v.asInstanceOf[js.Any]))
      BaseDirectory.foreach(__v => __obj.updateDynamic("BaseDirectory")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LocalProfileId.foreach(__v => __obj.updateDynamic("LocalProfileId")(__v.asInstanceOf[js.Any]))
      PartnerProfileId.foreach(__v => __obj.updateDynamic("PartnerProfileId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAgreementRequest]
    }
  }

  @js.native
  trait UpdateAgreementResponse extends js.Object {
    var AgreementId: AgreementId
  }

  object UpdateAgreementResponse {
    @inline
    def apply(
        AgreementId: AgreementId
    ): UpdateAgreementResponse = {
      val __obj = js.Dynamic.literal(
        "AgreementId" -> AgreementId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAgreementResponse]
    }
  }

  @js.native
  trait UpdateCertificateRequest extends js.Object {
    var CertificateId: CertificateId
    var ActiveDate: js.UndefOr[CertDate]
    var Description: js.UndefOr[Description]
    var InactiveDate: js.UndefOr[CertDate]
  }

  object UpdateCertificateRequest {
    @inline
    def apply(
        CertificateId: CertificateId,
        ActiveDate: js.UndefOr[CertDate] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        InactiveDate: js.UndefOr[CertDate] = js.undefined
    ): UpdateCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateId" -> CertificateId.asInstanceOf[js.Any]
      )

      ActiveDate.foreach(__v => __obj.updateDynamic("ActiveDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      InactiveDate.foreach(__v => __obj.updateDynamic("InactiveDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCertificateRequest]
    }
  }

  @js.native
  trait UpdateCertificateResponse extends js.Object {
    var CertificateId: CertificateId
  }

  object UpdateCertificateResponse {
    @inline
    def apply(
        CertificateId: CertificateId
    ): UpdateCertificateResponse = {
      val __obj = js.Dynamic.literal(
        "CertificateId" -> CertificateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCertificateResponse]
    }
  }

  @js.native
  trait UpdateConnectorRequest extends js.Object {
    var ConnectorId: ConnectorId
    var AccessRole: js.UndefOr[Role]
    var As2Config: js.UndefOr[As2ConnectorConfig]
    var LoggingRole: js.UndefOr[Role]
    var Url: js.UndefOr[Url]
  }

  object UpdateConnectorRequest {
    @inline
    def apply(
        ConnectorId: ConnectorId,
        AccessRole: js.UndefOr[Role] = js.undefined,
        As2Config: js.UndefOr[As2ConnectorConfig] = js.undefined,
        LoggingRole: js.UndefOr[Role] = js.undefined,
        Url: js.UndefOr[Url] = js.undefined
    ): UpdateConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectorId" -> ConnectorId.asInstanceOf[js.Any]
      )

      AccessRole.foreach(__v => __obj.updateDynamic("AccessRole")(__v.asInstanceOf[js.Any]))
      As2Config.foreach(__v => __obj.updateDynamic("As2Config")(__v.asInstanceOf[js.Any]))
      LoggingRole.foreach(__v => __obj.updateDynamic("LoggingRole")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectorRequest]
    }
  }

  @js.native
  trait UpdateConnectorResponse extends js.Object {
    var ConnectorId: ConnectorId
  }

  object UpdateConnectorResponse {
    @inline
    def apply(
        ConnectorId: ConnectorId
    ): UpdateConnectorResponse = {
      val __obj = js.Dynamic.literal(
        "ConnectorId" -> ConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateConnectorResponse]
    }
  }

  @js.native
  trait UpdateHostKeyRequest extends js.Object {
    var Description: HostKeyDescription
    var HostKeyId: HostKeyId
    var ServerId: ServerId
  }

  object UpdateHostKeyRequest {
    @inline
    def apply(
        Description: HostKeyDescription,
        HostKeyId: HostKeyId,
        ServerId: ServerId
    ): UpdateHostKeyRequest = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "HostKeyId" -> HostKeyId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateHostKeyRequest]
    }
  }

  @js.native
  trait UpdateHostKeyResponse extends js.Object {
    var HostKeyId: HostKeyId
    var ServerId: ServerId
  }

  object UpdateHostKeyResponse {
    @inline
    def apply(
        HostKeyId: HostKeyId,
        ServerId: ServerId
    ): UpdateHostKeyResponse = {
      val __obj = js.Dynamic.literal(
        "HostKeyId" -> HostKeyId.asInstanceOf[js.Any],
        "ServerId" -> ServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateHostKeyResponse]
    }
  }

  @js.native
  trait UpdateProfileRequest extends js.Object {
    var ProfileId: ProfileId
    var CertificateIds: js.UndefOr[CertificateIds]
  }

  object UpdateProfileRequest {
    @inline
    def apply(
        ProfileId: ProfileId,
        CertificateIds: js.UndefOr[CertificateIds] = js.undefined
    ): UpdateProfileRequest = {
      val __obj = js.Dynamic.literal(
        "ProfileId" -> ProfileId.asInstanceOf[js.Any]
      )

      CertificateIds.foreach(__v => __obj.updateDynamic("CertificateIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProfileRequest]
    }
  }

  @js.native
  trait UpdateProfileResponse extends js.Object {
    var ProfileId: ProfileId
  }

  object UpdateProfileResponse {
    @inline
    def apply(
        ProfileId: ProfileId
    ): UpdateProfileResponse = {
      val __obj = js.Dynamic.literal(
        "ProfileId" -> ProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateProfileResponse]
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
    var PostAuthenticationLoginBanner: js.UndefOr[PostAuthenticationLoginBanner]
    var PreAuthenticationLoginBanner: js.UndefOr[PreAuthenticationLoginBanner]
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
        PostAuthenticationLoginBanner: js.UndefOr[PostAuthenticationLoginBanner] = js.undefined,
        PreAuthenticationLoginBanner: js.UndefOr[PreAuthenticationLoginBanner] = js.undefined,
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
      PostAuthenticationLoginBanner.foreach(__v => __obj.updateDynamic("PostAuthenticationLoginBanner")(__v.asInstanceOf[js.Any]))
      PreAuthenticationLoginBanner.foreach(__v => __obj.updateDynamic("PreAuthenticationLoginBanner")(__v.asInstanceOf[js.Any]))
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

  /** Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the workflow. In addition to a workflow to execute when a file is uploaded completely, <code>WorkflowDetails</code> can also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial upload occurs when a file is open when the session disconnects.
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
    var OnPartialUpload: js.UndefOr[OnPartialUploadWorkflowDetails]
    var OnUpload: js.UndefOr[OnUploadWorkflowDetails]
  }

  object WorkflowDetails {
    @inline
    def apply(
        OnPartialUpload: js.UndefOr[OnPartialUploadWorkflowDetails] = js.undefined,
        OnUpload: js.UndefOr[OnUploadWorkflowDetails] = js.undefined
    ): WorkflowDetails = {
      val __obj = js.Dynamic.literal()
      OnPartialUpload.foreach(__v => __obj.updateDynamic("OnPartialUpload")(__v.asInstanceOf[js.Any]))
      OnUpload.foreach(__v => __obj.updateDynamic("OnUpload")(__v.asInstanceOf[js.Any]))
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
