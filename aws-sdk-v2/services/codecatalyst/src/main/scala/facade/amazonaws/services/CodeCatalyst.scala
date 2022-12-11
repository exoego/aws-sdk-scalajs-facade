package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object codecatalyst {
  type AccessTokenId = String
  type AccessTokenName = String
  type AccessTokenSecret = String
  type AccessTokenSummaries = js.Array[AccessTokenSummary]
  type ClientToken = String
  type CreateDevEnvironmentRequestAliasString = String
  type DevEnvironmentRepositorySummaries = js.Array[DevEnvironmentRepositorySummary]
  type DevEnvironmentSummaryAliasString = String
  type DevEnvironmentSummaryCreatorIdString = String
  type DevEnvironmentSummaryList = js.Array[DevEnvironmentSummary]
  type EventLogEntries = js.Array[EventLogEntry]
  type ExecuteCommandSessionConfigurationArguments = js.Array[ExecuteCommandSessionConfigurationArgumentsMemberString]
  type ExecuteCommandSessionConfigurationArgumentsMemberString = String
  type ExecuteCommandSessionConfigurationCommandString = String
  type Filters = js.Array[Filter]
  type GetDevEnvironmentResponseAliasString = String
  type GetDevEnvironmentResponseCreatorIdString = String
  type GetUserDetailsRequestIdString = String
  type GetUserDetailsRequestUserNameString = String
  type IdeConfigurationList = js.Array[IdeConfiguration]
  type IdeConfigurationNameString = String
  type IdeConfigurationRuntimeString = String
  type IdeNameString = String
  type IdeRuntimeString = String
  type Ides = js.Array[Ide]
  type InactivityTimeoutMinutes = Int
  type ListAccessTokensRequestMaxResultsInteger = Int
  type ListAccessTokensRequestNextTokenString = String
  type ListDevEnvironmentsRequestMaxResultsInteger = Int
  type ListDevEnvironmentsRequestNextTokenString = String
  type ListEventLogsRequestMaxResultsInteger = Int
  type ListEventLogsRequestNextTokenString = String
  type ListProjectsRequestMaxResultsInteger = Int
  type ListProjectsRequestNextTokenString = String
  type ListSourceRepositoriesItems = js.Array[ListSourceRepositoriesItem]
  type ListSourceRepositoriesRequestMaxResultsInteger = Int
  type ListSourceRepositoriesRequestNextTokenString = String
  type ListSourceRepositoryBranchesItems = js.Array[ListSourceRepositoryBranchesItem]
  type ListSourceRepositoryBranchesRequestMaxResultsInteger = Int
  type ListSourceRepositoryBranchesRequestNextTokenString = String
  type ListSpacesRequestNextTokenString = String
  type NameString = String
  type PersistentStorageConfigurationSizeInGiBInteger = Int
  type PersistentStorageSizeInGiBInteger = Int
  type ProjectDescription = String
  type ProjectDisplayName = String
  type ProjectListFilters = js.Array[ProjectListFilter]
  type ProjectSummaries = js.Array[ProjectSummary]
  type RegionString = String
  type RepositoriesInput = js.Array[RepositoryInput]
  type SensitiveString = String
  type SourceRepositoryBranchRefString = String
  type SourceRepositoryBranchString = String
  type SourceRepositoryDescriptionString = String
  type SourceRepositoryIdString = String
  type SourceRepositoryNameString = String
  type SpaceSummaries = js.Array[SpaceSummary]
  type StartDevEnvironmentSessionResponseSessionIdString = String
  type StatusReason = String
  type StringList = js.Array[String]
  type SyntheticTimestamp_date_time = js.Date
  type Timestamp = js.Date
  type UpdateDevEnvironmentRequestAliasString = String
  type UpdateDevEnvironmentResponseAliasString = String
  type Uuid = String
  type VerifySessionResponseIdentityString = String

  final class CodeCatalystOps(private val service: CodeCatalyst) extends AnyVal {

    @inline def createAccessTokenFuture(params: CreateAccessTokenRequest): Future[CreateAccessTokenResponse] = service.createAccessToken(params).promise().toFuture
    @inline def createDevEnvironmentFuture(params: CreateDevEnvironmentRequest): Future[CreateDevEnvironmentResponse] = service.createDevEnvironment(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResponse] = service.createProject(params).promise().toFuture
    @inline def createSourceRepositoryBranchFuture(params: CreateSourceRepositoryBranchRequest): Future[CreateSourceRepositoryBranchResponse] = service.createSourceRepositoryBranch(params).promise().toFuture
    @inline def deleteAccessTokenFuture(params: DeleteAccessTokenRequest): Future[DeleteAccessTokenResponse] = service.deleteAccessToken(params).promise().toFuture
    @inline def deleteDevEnvironmentFuture(params: DeleteDevEnvironmentRequest): Future[DeleteDevEnvironmentResponse] = service.deleteDevEnvironment(params).promise().toFuture
    @inline def getDevEnvironmentFuture(params: GetDevEnvironmentRequest): Future[GetDevEnvironmentResponse] = service.getDevEnvironment(params).promise().toFuture
    @inline def getProjectFuture(params: GetProjectRequest): Future[GetProjectResponse] = service.getProject(params).promise().toFuture
    @inline def getSourceRepositoryCloneUrlsFuture(params: GetSourceRepositoryCloneUrlsRequest): Future[GetSourceRepositoryCloneUrlsResponse] = service.getSourceRepositoryCloneUrls(params).promise().toFuture
    @inline def getSpaceFuture(params: GetSpaceRequest): Future[GetSpaceResponse] = service.getSpace(params).promise().toFuture
    @inline def getSubscriptionFuture(params: GetSubscriptionRequest): Future[GetSubscriptionResponse] = service.getSubscription(params).promise().toFuture
    @inline def getUserDetailsFuture(params: GetUserDetailsRequest): Future[GetUserDetailsResponse] = service.getUserDetails(params).promise().toFuture
    @inline def listAccessTokensFuture(params: ListAccessTokensRequest): Future[ListAccessTokensResponse] = service.listAccessTokens(params).promise().toFuture
    @inline def listDevEnvironmentsFuture(params: ListDevEnvironmentsRequest): Future[ListDevEnvironmentsResponse] = service.listDevEnvironments(params).promise().toFuture
    @inline def listEventLogsFuture(params: ListEventLogsRequest): Future[ListEventLogsResponse] = service.listEventLogs(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResponse] = service.listProjects(params).promise().toFuture
    @inline def listSourceRepositoriesFuture(params: ListSourceRepositoriesRequest): Future[ListSourceRepositoriesResponse] = service.listSourceRepositories(params).promise().toFuture
    @inline def listSourceRepositoryBranchesFuture(params: ListSourceRepositoryBranchesRequest): Future[ListSourceRepositoryBranchesResponse] = service.listSourceRepositoryBranches(params).promise().toFuture
    @inline def listSpacesFuture(params: ListSpacesRequest): Future[ListSpacesResponse] = service.listSpaces(params).promise().toFuture
    @inline def startDevEnvironmentFuture(params: StartDevEnvironmentRequest): Future[StartDevEnvironmentResponse] = service.startDevEnvironment(params).promise().toFuture
    @inline def startDevEnvironmentSessionFuture(params: StartDevEnvironmentSessionRequest): Future[StartDevEnvironmentSessionResponse] = service.startDevEnvironmentSession(params).promise().toFuture
    @inline def stopDevEnvironmentFuture(params: StopDevEnvironmentRequest): Future[StopDevEnvironmentResponse] = service.stopDevEnvironment(params).promise().toFuture
    @inline def updateDevEnvironmentFuture(params: UpdateDevEnvironmentRequest): Future[UpdateDevEnvironmentResponse] = service.updateDevEnvironment(params).promise().toFuture
    @inline def verifySessionFuture(): Future[VerifySessionResponse] = service.verifySession().promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/codecatalyst", JSImport.Namespace, "AWS.CodeCatalyst")
  class CodeCatalyst() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAccessToken(params: CreateAccessTokenRequest): Request[CreateAccessTokenResponse] = js.native
    def createDevEnvironment(params: CreateDevEnvironmentRequest): Request[CreateDevEnvironmentResponse] = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResponse] = js.native
    def createSourceRepositoryBranch(params: CreateSourceRepositoryBranchRequest): Request[CreateSourceRepositoryBranchResponse] = js.native
    def deleteAccessToken(params: DeleteAccessTokenRequest): Request[DeleteAccessTokenResponse] = js.native
    def deleteDevEnvironment(params: DeleteDevEnvironmentRequest): Request[DeleteDevEnvironmentResponse] = js.native
    def getDevEnvironment(params: GetDevEnvironmentRequest): Request[GetDevEnvironmentResponse] = js.native
    def getProject(params: GetProjectRequest): Request[GetProjectResponse] = js.native
    def getSourceRepositoryCloneUrls(params: GetSourceRepositoryCloneUrlsRequest): Request[GetSourceRepositoryCloneUrlsResponse] = js.native
    def getSpace(params: GetSpaceRequest): Request[GetSpaceResponse] = js.native
    def getSubscription(params: GetSubscriptionRequest): Request[GetSubscriptionResponse] = js.native
    def getUserDetails(params: GetUserDetailsRequest): Request[GetUserDetailsResponse] = js.native
    def listAccessTokens(params: ListAccessTokensRequest): Request[ListAccessTokensResponse] = js.native
    def listDevEnvironments(params: ListDevEnvironmentsRequest): Request[ListDevEnvironmentsResponse] = js.native
    def listEventLogs(params: ListEventLogsRequest): Request[ListEventLogsResponse] = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse] = js.native
    def listSourceRepositories(params: ListSourceRepositoriesRequest): Request[ListSourceRepositoriesResponse] = js.native
    def listSourceRepositoryBranches(params: ListSourceRepositoryBranchesRequest): Request[ListSourceRepositoryBranchesResponse] = js.native
    def listSpaces(params: ListSpacesRequest): Request[ListSpacesResponse] = js.native
    def startDevEnvironment(params: StartDevEnvironmentRequest): Request[StartDevEnvironmentResponse] = js.native
    def startDevEnvironmentSession(params: StartDevEnvironmentSessionRequest): Request[StartDevEnvironmentSessionResponse] = js.native
    def stopDevEnvironment(params: StopDevEnvironmentRequest): Request[StopDevEnvironmentResponse] = js.native
    def updateDevEnvironment(params: UpdateDevEnvironmentRequest): Request[UpdateDevEnvironmentResponse] = js.native
    def verifySession(): Request[VerifySessionResponse] = js.native
  }
  object CodeCatalyst {
    @inline implicit def toOps(service: CodeCatalyst): CodeCatalystOps = {
      new CodeCatalystOps(service)
    }
  }

  /** Information about a specified personal access token (PAT).
    */
  @js.native
  trait AccessTokenSummary extends js.Object {
    var id: AccessTokenId
    var name: AccessTokenName
    var expiresTime: js.UndefOr[SyntheticTimestamp_date_time]
  }

  object AccessTokenSummary {
    @inline
    def apply(
        id: AccessTokenId,
        name: AccessTokenName,
        expiresTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
    ): AccessTokenSummary = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      expiresTime.foreach(__v => __obj.updateDynamic("expiresTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessTokenSummary]
    }
  }

  @js.native
  trait CreateAccessTokenRequest extends js.Object {
    var name: AccessTokenName
    var expiresTime: js.UndefOr[SyntheticTimestamp_date_time]
  }

  object CreateAccessTokenRequest {
    @inline
    def apply(
        name: AccessTokenName,
        expiresTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
    ): CreateAccessTokenRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      expiresTime.foreach(__v => __obj.updateDynamic("expiresTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessTokenRequest]
    }
  }

  @js.native
  trait CreateAccessTokenResponse extends js.Object {
    var secret: AccessTokenSecret
    var expiresTime: js.UndefOr[SyntheticTimestamp_date_time]
    var name: js.UndefOr[AccessTokenName]
  }

  object CreateAccessTokenResponse {
    @inline
    def apply(
        secret: AccessTokenSecret,
        expiresTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        name: js.UndefOr[AccessTokenName] = js.undefined
    ): CreateAccessTokenResponse = {
      val __obj = js.Dynamic.literal(
        "secret" -> secret.asInstanceOf[js.Any]
      )

      expiresTime.foreach(__v => __obj.updateDynamic("expiresTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessTokenResponse]
    }
  }

  @js.native
  trait CreateDevEnvironmentRequest extends js.Object {
    var instanceType: InstanceType
    var persistentStorage: PersistentStorageConfiguration
    var projectName: NameString
    var spaceName: NameString
    var alias: js.UndefOr[CreateDevEnvironmentRequestAliasString]
    var clientToken: js.UndefOr[ClientToken]
    var ides: js.UndefOr[IdeConfigurationList]
    var inactivityTimeoutMinutes: js.UndefOr[InactivityTimeoutMinutes]
    var repositories: js.UndefOr[RepositoriesInput]
  }

  object CreateDevEnvironmentRequest {
    @inline
    def apply(
        instanceType: InstanceType,
        persistentStorage: PersistentStorageConfiguration,
        projectName: NameString,
        spaceName: NameString,
        alias: js.UndefOr[CreateDevEnvironmentRequestAliasString] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        ides: js.UndefOr[IdeConfigurationList] = js.undefined,
        inactivityTimeoutMinutes: js.UndefOr[InactivityTimeoutMinutes] = js.undefined,
        repositories: js.UndefOr[RepositoriesInput] = js.undefined
    ): CreateDevEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "instanceType" -> instanceType.asInstanceOf[js.Any],
        "persistentStorage" -> persistentStorage.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      ides.foreach(__v => __obj.updateDynamic("ides")(__v.asInstanceOf[js.Any]))
      inactivityTimeoutMinutes.foreach(__v => __obj.updateDynamic("inactivityTimeoutMinutes")(__v.asInstanceOf[js.Any]))
      repositories.foreach(__v => __obj.updateDynamic("repositories")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDevEnvironmentRequest]
    }
  }

  @js.native
  trait CreateDevEnvironmentResponse extends js.Object {
    var id: Uuid
    var projectName: NameString
    var spaceName: NameString
  }

  object CreateDevEnvironmentResponse {
    @inline
    def apply(
        id: Uuid,
        projectName: NameString,
        spaceName: NameString
    ): CreateDevEnvironmentResponse = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDevEnvironmentResponse]
    }
  }

  @js.native
  trait CreateProjectRequest extends js.Object {
    var displayName: ProjectDisplayName
    var spaceName: NameString
    var description: js.UndefOr[ProjectDescription]
  }

  object CreateProjectRequest {
    @inline
    def apply(
        displayName: ProjectDisplayName,
        spaceName: NameString,
        description: js.UndefOr[ProjectDescription] = js.undefined
    ): CreateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "displayName" -> displayName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectRequest]
    }
  }

  @js.native
  trait CreateProjectResponse extends js.Object {
    var name: NameString
    var description: js.UndefOr[String]
    var displayName: js.UndefOr[String]
    var spaceName: js.UndefOr[NameString]
  }

  object CreateProjectResponse {
    @inline
    def apply(
        name: NameString,
        description: js.UndefOr[String] = js.undefined,
        displayName: js.UndefOr[String] = js.undefined,
        spaceName: js.UndefOr[NameString] = js.undefined
    ): CreateProjectResponse = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      spaceName.foreach(__v => __obj.updateDynamic("spaceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectResponse]
    }
  }

  @js.native
  trait CreateSourceRepositoryBranchRequest extends js.Object {
    var name: SourceRepositoryBranchString
    var projectName: NameString
    var sourceRepositoryName: SourceRepositoryNameString
    var spaceName: NameString
    var headCommitId: js.UndefOr[String]
  }

  object CreateSourceRepositoryBranchRequest {
    @inline
    def apply(
        name: SourceRepositoryBranchString,
        projectName: NameString,
        sourceRepositoryName: SourceRepositoryNameString,
        spaceName: NameString,
        headCommitId: js.UndefOr[String] = js.undefined
    ): CreateSourceRepositoryBranchRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "sourceRepositoryName" -> sourceRepositoryName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )

      headCommitId.foreach(__v => __obj.updateDynamic("headCommitId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSourceRepositoryBranchRequest]
    }
  }

  @js.native
  trait CreateSourceRepositoryBranchResponse extends js.Object {
    var headCommitId: js.UndefOr[String]
    var lastUpdatedTime: js.UndefOr[SyntheticTimestamp_date_time]
    var name: js.UndefOr[SourceRepositoryBranchString]
    var ref: js.UndefOr[SourceRepositoryBranchRefString]
  }

  object CreateSourceRepositoryBranchResponse {
    @inline
    def apply(
        headCommitId: js.UndefOr[String] = js.undefined,
        lastUpdatedTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        name: js.UndefOr[SourceRepositoryBranchString] = js.undefined,
        ref: js.UndefOr[SourceRepositoryBranchRefString] = js.undefined
    ): CreateSourceRepositoryBranchResponse = {
      val __obj = js.Dynamic.literal()
      headCommitId.foreach(__v => __obj.updateDynamic("headCommitId")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      ref.foreach(__v => __obj.updateDynamic("ref")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSourceRepositoryBranchResponse]
    }
  }

  @js.native
  trait DeleteAccessTokenRequest extends js.Object {
    var id: AccessTokenId
  }

  object DeleteAccessTokenRequest {
    @inline
    def apply(
        id: AccessTokenId
    ): DeleteAccessTokenRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAccessTokenRequest]
    }
  }

  @js.native
  trait DeleteAccessTokenResponse extends js.Object

  object DeleteAccessTokenResponse {
    @inline
    def apply(): DeleteAccessTokenResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAccessTokenResponse]
    }
  }

  @js.native
  trait DeleteDevEnvironmentRequest extends js.Object {
    var id: Uuid
    var projectName: NameString
    var spaceName: NameString
  }

  object DeleteDevEnvironmentRequest {
    @inline
    def apply(
        id: Uuid,
        projectName: NameString,
        spaceName: NameString
    ): DeleteDevEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDevEnvironmentRequest]
    }
  }

  @js.native
  trait DeleteDevEnvironmentResponse extends js.Object {
    var id: Uuid
    var projectName: NameString
    var spaceName: NameString
  }

  object DeleteDevEnvironmentResponse {
    @inline
    def apply(
        id: Uuid,
        projectName: NameString,
        spaceName: NameString
    ): DeleteDevEnvironmentResponse = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDevEnvironmentResponse]
    }
  }

  /** Information about connection details for a Dev Environment.
    */
  @js.native
  trait DevEnvironmentAccessDetails extends js.Object {
    var streamUrl: SensitiveString
    var tokenValue: SensitiveString
  }

  object DevEnvironmentAccessDetails {
    @inline
    def apply(
        streamUrl: SensitiveString,
        tokenValue: SensitiveString
    ): DevEnvironmentAccessDetails = {
      val __obj = js.Dynamic.literal(
        "streamUrl" -> streamUrl.asInstanceOf[js.Any],
        "tokenValue" -> tokenValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DevEnvironmentAccessDetails]
    }
  }

  /** Information about the source repsitory for a Dev Environment.
    */
  @js.native
  trait DevEnvironmentRepositorySummary extends js.Object {
    var repositoryName: SourceRepositoryNameString
    var branchName: js.UndefOr[SourceRepositoryBranchString]
  }

  object DevEnvironmentRepositorySummary {
    @inline
    def apply(
        repositoryName: SourceRepositoryNameString,
        branchName: js.UndefOr[SourceRepositoryBranchString] = js.undefined
    ): DevEnvironmentRepositorySummary = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      branchName.foreach(__v => __obj.updateDynamic("branchName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DevEnvironmentRepositorySummary]
    }
  }

  /** Information about the configuration of a Dev Environment session.
    */
  @js.native
  trait DevEnvironmentSessionConfiguration extends js.Object {
    var sessionType: DevEnvironmentSessionType
    var executeCommandSessionConfiguration: js.UndefOr[ExecuteCommandSessionConfiguration]
  }

  object DevEnvironmentSessionConfiguration {
    @inline
    def apply(
        sessionType: DevEnvironmentSessionType,
        executeCommandSessionConfiguration: js.UndefOr[ExecuteCommandSessionConfiguration] = js.undefined
    ): DevEnvironmentSessionConfiguration = {
      val __obj = js.Dynamic.literal(
        "sessionType" -> sessionType.asInstanceOf[js.Any]
      )

      executeCommandSessionConfiguration.foreach(__v => __obj.updateDynamic("executeCommandSessionConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DevEnvironmentSessionConfiguration]
    }
  }

  /** Information about a Dev Environment.
    */
  @js.native
  trait DevEnvironmentSummary extends js.Object {
    var creatorId: DevEnvironmentSummaryCreatorIdString
    var id: Uuid
    var inactivityTimeoutMinutes: InactivityTimeoutMinutes
    var instanceType: InstanceType
    var lastUpdatedTime: SyntheticTimestamp_date_time
    var persistentStorage: PersistentStorage
    var repositories: DevEnvironmentRepositorySummaries
    var status: DevEnvironmentStatus
    var alias: js.UndefOr[DevEnvironmentSummaryAliasString]
    var ides: js.UndefOr[Ides]
    var projectName: js.UndefOr[NameString]
    var spaceName: js.UndefOr[NameString]
    var statusReason: js.UndefOr[StatusReason]
  }

  object DevEnvironmentSummary {
    @inline
    def apply(
        creatorId: DevEnvironmentSummaryCreatorIdString,
        id: Uuid,
        inactivityTimeoutMinutes: InactivityTimeoutMinutes,
        instanceType: InstanceType,
        lastUpdatedTime: SyntheticTimestamp_date_time,
        persistentStorage: PersistentStorage,
        repositories: DevEnvironmentRepositorySummaries,
        status: DevEnvironmentStatus,
        alias: js.UndefOr[DevEnvironmentSummaryAliasString] = js.undefined,
        ides: js.UndefOr[Ides] = js.undefined,
        projectName: js.UndefOr[NameString] = js.undefined,
        spaceName: js.UndefOr[NameString] = js.undefined,
        statusReason: js.UndefOr[StatusReason] = js.undefined
    ): DevEnvironmentSummary = {
      val __obj = js.Dynamic.literal(
        "creatorId" -> creatorId.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "inactivityTimeoutMinutes" -> inactivityTimeoutMinutes.asInstanceOf[js.Any],
        "instanceType" -> instanceType.asInstanceOf[js.Any],
        "lastUpdatedTime" -> lastUpdatedTime.asInstanceOf[js.Any],
        "persistentStorage" -> persistentStorage.asInstanceOf[js.Any],
        "repositories" -> repositories.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      ides.foreach(__v => __obj.updateDynamic("ides")(__v.asInstanceOf[js.Any]))
      projectName.foreach(__v => __obj.updateDynamic("projectName")(__v.asInstanceOf[js.Any]))
      spaceName.foreach(__v => __obj.updateDynamic("spaceName")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DevEnvironmentSummary]
    }
  }

  /** Information about an email address.
    */
  @js.native
  trait EmailAddress extends js.Object {
    var email: js.UndefOr[String]
    var verified: js.UndefOr[Boolean]
  }

  object EmailAddress {
    @inline
    def apply(
        email: js.UndefOr[String] = js.undefined,
        verified: js.UndefOr[Boolean] = js.undefined
    ): EmailAddress = {
      val __obj = js.Dynamic.literal()
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      verified.foreach(__v => __obj.updateDynamic("verified")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailAddress]
    }
  }

  /** Information about an entry in an event log of Amazon CodeCatalyst activity.
    */
  @js.native
  trait EventLogEntry extends js.Object {
    var eventCategory: String
    var eventName: String
    var eventSource: String
    var eventTime: SyntheticTimestamp_date_time
    var eventType: String
    var id: String
    var operationType: OperationType
    var userIdentity: UserIdentity
    var errorCode: js.UndefOr[String]
    var projectInformation: js.UndefOr[ProjectInformation]
    var requestId: js.UndefOr[String]
    var requestPayload: js.UndefOr[EventPayload]
    var responsePayload: js.UndefOr[EventPayload]
    var sourceIpAddress: js.UndefOr[String]
    var userAgent: js.UndefOr[String]
  }

  object EventLogEntry {
    @inline
    def apply(
        eventCategory: String,
        eventName: String,
        eventSource: String,
        eventTime: SyntheticTimestamp_date_time,
        eventType: String,
        id: String,
        operationType: OperationType,
        userIdentity: UserIdentity,
        errorCode: js.UndefOr[String] = js.undefined,
        projectInformation: js.UndefOr[ProjectInformation] = js.undefined,
        requestId: js.UndefOr[String] = js.undefined,
        requestPayload: js.UndefOr[EventPayload] = js.undefined,
        responsePayload: js.UndefOr[EventPayload] = js.undefined,
        sourceIpAddress: js.UndefOr[String] = js.undefined,
        userAgent: js.UndefOr[String] = js.undefined
    ): EventLogEntry = {
      val __obj = js.Dynamic.literal(
        "eventCategory" -> eventCategory.asInstanceOf[js.Any],
        "eventName" -> eventName.asInstanceOf[js.Any],
        "eventSource" -> eventSource.asInstanceOf[js.Any],
        "eventTime" -> eventTime.asInstanceOf[js.Any],
        "eventType" -> eventType.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "operationType" -> operationType.asInstanceOf[js.Any],
        "userIdentity" -> userIdentity.asInstanceOf[js.Any]
      )

      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      projectInformation.foreach(__v => __obj.updateDynamic("projectInformation")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      requestPayload.foreach(__v => __obj.updateDynamic("requestPayload")(__v.asInstanceOf[js.Any]))
      responsePayload.foreach(__v => __obj.updateDynamic("responsePayload")(__v.asInstanceOf[js.Any]))
      sourceIpAddress.foreach(__v => __obj.updateDynamic("sourceIpAddress")(__v.asInstanceOf[js.Any]))
      userAgent.foreach(__v => __obj.updateDynamic("userAgent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventLogEntry]
    }
  }

  /** Information about the payload of an event recording Amazon CodeCatalyst activity.
    */
  @js.native
  trait EventPayload extends js.Object {
    var contentType: js.UndefOr[String]
    var data: js.UndefOr[String]
  }

  object EventPayload {
    @inline
    def apply(
        contentType: js.UndefOr[String] = js.undefined,
        data: js.UndefOr[String] = js.undefined
    ): EventPayload = {
      val __obj = js.Dynamic.literal()
      contentType.foreach(__v => __obj.updateDynamic("contentType")(__v.asInstanceOf[js.Any]))
      data.foreach(__v => __obj.updateDynamic("data")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventPayload]
    }
  }

  /** Information about the commands that will be run on a Dev Environment when an SSH session begins.
    */
  @js.native
  trait ExecuteCommandSessionConfiguration extends js.Object {
    var command: ExecuteCommandSessionConfigurationCommandString
    var arguments: js.UndefOr[ExecuteCommandSessionConfigurationArguments]
  }

  object ExecuteCommandSessionConfiguration {
    @inline
    def apply(
        command: ExecuteCommandSessionConfigurationCommandString,
        arguments: js.UndefOr[ExecuteCommandSessionConfigurationArguments] = js.undefined
    ): ExecuteCommandSessionConfiguration = {
      val __obj = js.Dynamic.literal(
        "command" -> command.asInstanceOf[js.Any]
      )

      arguments.foreach(__v => __obj.updateDynamic("arguments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteCommandSessionConfiguration]
    }
  }

  /** <p/>
    */
  @js.native
  trait Filter extends js.Object {
    var key: String
    var values: StringList
    var comparisonOperator: js.UndefOr[String]
  }

  object Filter {
    @inline
    def apply(
        key: String,
        values: StringList,
        comparisonOperator: js.UndefOr[String] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )

      comparisonOperator.foreach(__v => __obj.updateDynamic("comparisonOperator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetDevEnvironmentRequest extends js.Object {
    var id: Uuid
    var projectName: NameString
    var spaceName: NameString
  }

  object GetDevEnvironmentRequest {
    @inline
    def apply(
        id: Uuid,
        projectName: NameString,
        spaceName: NameString
    ): GetDevEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDevEnvironmentRequest]
    }
  }

  @js.native
  trait GetDevEnvironmentResponse extends js.Object {
    var creatorId: GetDevEnvironmentResponseCreatorIdString
    var id: Uuid
    var inactivityTimeoutMinutes: InactivityTimeoutMinutes
    var instanceType: InstanceType
    var lastUpdatedTime: SyntheticTimestamp_date_time
    var persistentStorage: PersistentStorage
    var projectName: NameString
    var repositories: DevEnvironmentRepositorySummaries
    var spaceName: NameString
    var status: DevEnvironmentStatus
    var alias: js.UndefOr[GetDevEnvironmentResponseAliasString]
    var ides: js.UndefOr[Ides]
    var statusReason: js.UndefOr[StatusReason]
  }

  object GetDevEnvironmentResponse {
    @inline
    def apply(
        creatorId: GetDevEnvironmentResponseCreatorIdString,
        id: Uuid,
        inactivityTimeoutMinutes: InactivityTimeoutMinutes,
        instanceType: InstanceType,
        lastUpdatedTime: SyntheticTimestamp_date_time,
        persistentStorage: PersistentStorage,
        projectName: NameString,
        repositories: DevEnvironmentRepositorySummaries,
        spaceName: NameString,
        status: DevEnvironmentStatus,
        alias: js.UndefOr[GetDevEnvironmentResponseAliasString] = js.undefined,
        ides: js.UndefOr[Ides] = js.undefined,
        statusReason: js.UndefOr[StatusReason] = js.undefined
    ): GetDevEnvironmentResponse = {
      val __obj = js.Dynamic.literal(
        "creatorId" -> creatorId.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "inactivityTimeoutMinutes" -> inactivityTimeoutMinutes.asInstanceOf[js.Any],
        "instanceType" -> instanceType.asInstanceOf[js.Any],
        "lastUpdatedTime" -> lastUpdatedTime.asInstanceOf[js.Any],
        "persistentStorage" -> persistentStorage.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "repositories" -> repositories.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      ides.foreach(__v => __obj.updateDynamic("ides")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevEnvironmentResponse]
    }
  }

  @js.native
  trait GetProjectRequest extends js.Object {
    var name: NameString
    var spaceName: NameString
  }

  object GetProjectRequest {
    @inline
    def apply(
        name: NameString,
        spaceName: NameString
    ): GetProjectRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetProjectRequest]
    }
  }

  @js.native
  trait GetProjectResponse extends js.Object {
    var name: String
    var description: js.UndefOr[String]
    var displayName: js.UndefOr[String]
    var spaceName: js.UndefOr[NameString]
  }

  object GetProjectResponse {
    @inline
    def apply(
        name: String,
        description: js.UndefOr[String] = js.undefined,
        displayName: js.UndefOr[String] = js.undefined,
        spaceName: js.UndefOr[NameString] = js.undefined
    ): GetProjectResponse = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      spaceName.foreach(__v => __obj.updateDynamic("spaceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProjectResponse]
    }
  }

  @js.native
  trait GetSourceRepositoryCloneUrlsRequest extends js.Object {
    var projectName: NameString
    var sourceRepositoryName: SourceRepositoryNameString
    var spaceName: NameString
  }

  object GetSourceRepositoryCloneUrlsRequest {
    @inline
    def apply(
        projectName: NameString,
        sourceRepositoryName: SourceRepositoryNameString,
        spaceName: NameString
    ): GetSourceRepositoryCloneUrlsRequest = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any],
        "sourceRepositoryName" -> sourceRepositoryName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSourceRepositoryCloneUrlsRequest]
    }
  }

  @js.native
  trait GetSourceRepositoryCloneUrlsResponse extends js.Object {
    var https: String
  }

  object GetSourceRepositoryCloneUrlsResponse {
    @inline
    def apply(
        https: String
    ): GetSourceRepositoryCloneUrlsResponse = {
      val __obj = js.Dynamic.literal(
        "https" -> https.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSourceRepositoryCloneUrlsResponse]
    }
  }

  @js.native
  trait GetSpaceRequest extends js.Object {
    var name: NameString
  }

  object GetSpaceRequest {
    @inline
    def apply(
        name: NameString
    ): GetSpaceRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSpaceRequest]
    }
  }

  @js.native
  trait GetSpaceResponse extends js.Object {
    var name: NameString
    var regionName: RegionString
    var description: js.UndefOr[String]
    var displayName: js.UndefOr[String]
  }

  object GetSpaceResponse {
    @inline
    def apply(
        name: NameString,
        regionName: RegionString,
        description: js.UndefOr[String] = js.undefined,
        displayName: js.UndefOr[String] = js.undefined
    ): GetSpaceResponse = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "regionName" -> regionName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSpaceResponse]
    }
  }

  @js.native
  trait GetSubscriptionRequest extends js.Object {
    var spaceName: NameString
  }

  object GetSubscriptionRequest {
    @inline
    def apply(
        spaceName: NameString
    ): GetSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSubscriptionRequest]
    }
  }

  @js.native
  trait GetSubscriptionResponse extends js.Object {
    var awsAccountName: js.UndefOr[NameString]
    var subscriptionType: js.UndefOr[String]
  }

  object GetSubscriptionResponse {
    @inline
    def apply(
        awsAccountName: js.UndefOr[NameString] = js.undefined,
        subscriptionType: js.UndefOr[String] = js.undefined
    ): GetSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      awsAccountName.foreach(__v => __obj.updateDynamic("awsAccountName")(__v.asInstanceOf[js.Any]))
      subscriptionType.foreach(__v => __obj.updateDynamic("subscriptionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSubscriptionResponse]
    }
  }

  @js.native
  trait GetUserDetailsRequest extends js.Object {
    var id: js.UndefOr[GetUserDetailsRequestIdString]
    var userName: js.UndefOr[GetUserDetailsRequestUserNameString]
  }

  object GetUserDetailsRequest {
    @inline
    def apply(
        id: js.UndefOr[GetUserDetailsRequestIdString] = js.undefined,
        userName: js.UndefOr[GetUserDetailsRequestUserNameString] = js.undefined
    ): GetUserDetailsRequest = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      userName.foreach(__v => __obj.updateDynamic("userName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserDetailsRequest]
    }
  }

  @js.native
  trait GetUserDetailsResponse extends js.Object {
    var displayName: js.UndefOr[String]
    var primaryEmail: js.UndefOr[EmailAddress]
    var userId: js.UndefOr[String]
    var userName: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  object GetUserDetailsResponse {
    @inline
    def apply(
        displayName: js.UndefOr[String] = js.undefined,
        primaryEmail: js.UndefOr[EmailAddress] = js.undefined,
        userId: js.UndefOr[String] = js.undefined,
        userName: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): GetUserDetailsResponse = {
      val __obj = js.Dynamic.literal()
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      primaryEmail.foreach(__v => __obj.updateDynamic("primaryEmail")(__v.asInstanceOf[js.Any]))
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      userName.foreach(__v => __obj.updateDynamic("userName")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserDetailsResponse]
    }
  }

  /** Information about an integrated development environment (IDE) used in a Dev Environment.
    */
  @js.native
  trait Ide extends js.Object {
    var name: js.UndefOr[IdeNameString]
    var runtime: js.UndefOr[IdeRuntimeString]
  }

  object Ide {
    @inline
    def apply(
        name: js.UndefOr[IdeNameString] = js.undefined,
        runtime: js.UndefOr[IdeRuntimeString] = js.undefined
    ): Ide = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      runtime.foreach(__v => __obj.updateDynamic("runtime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ide]
    }
  }

  /** Information about the configuration of an integrated development environment (IDE) for a Dev Environment.
    */
  @js.native
  trait IdeConfiguration extends js.Object {
    var name: js.UndefOr[IdeConfigurationNameString]
    var runtime: js.UndefOr[IdeConfigurationRuntimeString]
  }

  object IdeConfiguration {
    @inline
    def apply(
        name: js.UndefOr[IdeConfigurationNameString] = js.undefined,
        runtime: js.UndefOr[IdeConfigurationRuntimeString] = js.undefined
    ): IdeConfiguration = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      runtime.foreach(__v => __obj.updateDynamic("runtime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdeConfiguration]
    }
  }

  @js.native
  trait ListAccessTokensRequest extends js.Object {
    var maxResults: js.UndefOr[ListAccessTokensRequestMaxResultsInteger]
    var nextToken: js.UndefOr[ListAccessTokensRequestNextTokenString]
  }

  object ListAccessTokensRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListAccessTokensRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[ListAccessTokensRequestNextTokenString] = js.undefined
    ): ListAccessTokensRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessTokensRequest]
    }
  }

  @js.native
  trait ListAccessTokensResponse extends js.Object {
    var items: AccessTokenSummaries
    var nextToken: js.UndefOr[String]
  }

  object ListAccessTokensResponse {
    @inline
    def apply(
        items: AccessTokenSummaries,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListAccessTokensResponse = {
      val __obj = js.Dynamic.literal(
        "items" -> items.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessTokensResponse]
    }
  }

  @js.native
  trait ListDevEnvironmentsRequest extends js.Object {
    var projectName: NameString
    var spaceName: NameString
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[ListDevEnvironmentsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[ListDevEnvironmentsRequestNextTokenString]
  }

  object ListDevEnvironmentsRequest {
    @inline
    def apply(
        projectName: NameString,
        spaceName: NameString,
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[ListDevEnvironmentsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[ListDevEnvironmentsRequestNextTokenString] = js.undefined
    ): ListDevEnvironmentsRequest = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevEnvironmentsRequest]
    }
  }

  @js.native
  trait ListDevEnvironmentsResponse extends js.Object {
    var items: DevEnvironmentSummaryList
    var nextToken: js.UndefOr[String]
  }

  object ListDevEnvironmentsResponse {
    @inline
    def apply(
        items: DevEnvironmentSummaryList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListDevEnvironmentsResponse = {
      val __obj = js.Dynamic.literal(
        "items" -> items.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevEnvironmentsResponse]
    }
  }

  @js.native
  trait ListEventLogsRequest extends js.Object {
    var endTime: SyntheticTimestamp_date_time
    var spaceName: NameString
    var startTime: SyntheticTimestamp_date_time
    var eventName: js.UndefOr[String]
    var maxResults: js.UndefOr[ListEventLogsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[ListEventLogsRequestNextTokenString]
  }

  object ListEventLogsRequest {
    @inline
    def apply(
        endTime: SyntheticTimestamp_date_time,
        spaceName: NameString,
        startTime: SyntheticTimestamp_date_time,
        eventName: js.UndefOr[String] = js.undefined,
        maxResults: js.UndefOr[ListEventLogsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[ListEventLogsRequestNextTokenString] = js.undefined
    ): ListEventLogsRequest = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

      eventName.foreach(__v => __obj.updateDynamic("eventName")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventLogsRequest]
    }
  }

  @js.native
  trait ListEventLogsResponse extends js.Object {
    var items: EventLogEntries
    var nextToken: js.UndefOr[String]
  }

  object ListEventLogsResponse {
    @inline
    def apply(
        items: EventLogEntries,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListEventLogsResponse = {
      val __obj = js.Dynamic.literal(
        "items" -> items.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventLogsResponse]
    }
  }

  @js.native
  trait ListProjectsRequest extends js.Object {
    var spaceName: NameString
    var filters: js.UndefOr[ProjectListFilters]
    var maxResults: js.UndefOr[ListProjectsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[ListProjectsRequestNextTokenString]
  }

  object ListProjectsRequest {
    @inline
    def apply(
        spaceName: NameString,
        filters: js.UndefOr[ProjectListFilters] = js.undefined,
        maxResults: js.UndefOr[ListProjectsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[ListProjectsRequestNextTokenString] = js.undefined
    ): ListProjectsRequest = {
      val __obj = js.Dynamic.literal(
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsRequest]
    }
  }

  @js.native
  trait ListProjectsResponse extends js.Object {
    var items: js.UndefOr[ProjectSummaries]
    var nextToken: js.UndefOr[String]
  }

  object ListProjectsResponse {
    @inline
    def apply(
        items: js.UndefOr[ProjectSummaries] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListProjectsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsResponse]
    }
  }

  /** Information about a source repository returned in a list of source repositories.
    */
  @js.native
  trait ListSourceRepositoriesItem extends js.Object {
    var createdTime: Timestamp
    var id: SourceRepositoryIdString
    var lastUpdatedTime: Timestamp
    var name: SourceRepositoryNameString
    var description: js.UndefOr[SourceRepositoryDescriptionString]
  }

  object ListSourceRepositoriesItem {
    @inline
    def apply(
        createdTime: Timestamp,
        id: SourceRepositoryIdString,
        lastUpdatedTime: Timestamp,
        name: SourceRepositoryNameString,
        description: js.UndefOr[SourceRepositoryDescriptionString] = js.undefined
    ): ListSourceRepositoriesItem = {
      val __obj = js.Dynamic.literal(
        "createdTime" -> createdTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "lastUpdatedTime" -> lastUpdatedTime.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSourceRepositoriesItem]
    }
  }

  @js.native
  trait ListSourceRepositoriesRequest extends js.Object {
    var projectName: NameString
    var spaceName: NameString
    var maxResults: js.UndefOr[ListSourceRepositoriesRequestMaxResultsInteger]
    var nextToken: js.UndefOr[ListSourceRepositoriesRequestNextTokenString]
  }

  object ListSourceRepositoriesRequest {
    @inline
    def apply(
        projectName: NameString,
        spaceName: NameString,
        maxResults: js.UndefOr[ListSourceRepositoriesRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[ListSourceRepositoriesRequestNextTokenString] = js.undefined
    ): ListSourceRepositoriesRequest = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSourceRepositoriesRequest]
    }
  }

  @js.native
  trait ListSourceRepositoriesResponse extends js.Object {
    var items: js.UndefOr[ListSourceRepositoriesItems]
    var nextToken: js.UndefOr[String]
  }

  object ListSourceRepositoriesResponse {
    @inline
    def apply(
        items: js.UndefOr[ListSourceRepositoriesItems] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListSourceRepositoriesResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSourceRepositoriesResponse]
    }
  }

  /** Information about a branch of a source repository returned in a list of branches.
    */
  @js.native
  trait ListSourceRepositoryBranchesItem extends js.Object {
    var headCommitId: js.UndefOr[String]
    var lastUpdatedTime: js.UndefOr[SyntheticTimestamp_date_time]
    var name: js.UndefOr[SourceRepositoryBranchString]
    var ref: js.UndefOr[SourceRepositoryBranchRefString]
  }

  object ListSourceRepositoryBranchesItem {
    @inline
    def apply(
        headCommitId: js.UndefOr[String] = js.undefined,
        lastUpdatedTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        name: js.UndefOr[SourceRepositoryBranchString] = js.undefined,
        ref: js.UndefOr[SourceRepositoryBranchRefString] = js.undefined
    ): ListSourceRepositoryBranchesItem = {
      val __obj = js.Dynamic.literal()
      headCommitId.foreach(__v => __obj.updateDynamic("headCommitId")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      ref.foreach(__v => __obj.updateDynamic("ref")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSourceRepositoryBranchesItem]
    }
  }

  @js.native
  trait ListSourceRepositoryBranchesRequest extends js.Object {
    var projectName: NameString
    var sourceRepositoryName: SourceRepositoryNameString
    var spaceName: NameString
    var maxResults: js.UndefOr[ListSourceRepositoryBranchesRequestMaxResultsInteger]
    var nextToken: js.UndefOr[ListSourceRepositoryBranchesRequestNextTokenString]
  }

  object ListSourceRepositoryBranchesRequest {
    @inline
    def apply(
        projectName: NameString,
        sourceRepositoryName: SourceRepositoryNameString,
        spaceName: NameString,
        maxResults: js.UndefOr[ListSourceRepositoryBranchesRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[ListSourceRepositoryBranchesRequestNextTokenString] = js.undefined
    ): ListSourceRepositoryBranchesRequest = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any],
        "sourceRepositoryName" -> sourceRepositoryName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSourceRepositoryBranchesRequest]
    }
  }

  @js.native
  trait ListSourceRepositoryBranchesResponse extends js.Object {
    var items: js.UndefOr[ListSourceRepositoryBranchesItems]
    var nextToken: js.UndefOr[String]
  }

  object ListSourceRepositoryBranchesResponse {
    @inline
    def apply(
        items: js.UndefOr[ListSourceRepositoryBranchesItems] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListSourceRepositoryBranchesResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSourceRepositoryBranchesResponse]
    }
  }

  @js.native
  trait ListSpacesRequest extends js.Object {
    var nextToken: js.UndefOr[ListSpacesRequestNextTokenString]
  }

  object ListSpacesRequest {
    @inline
    def apply(
        nextToken: js.UndefOr[ListSpacesRequestNextTokenString] = js.undefined
    ): ListSpacesRequest = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSpacesRequest]
    }
  }

  @js.native
  trait ListSpacesResponse extends js.Object {
    var items: js.UndefOr[SpaceSummaries]
    var nextToken: js.UndefOr[String]
  }

  object ListSpacesResponse {
    @inline
    def apply(
        items: js.UndefOr[SpaceSummaries] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListSpacesResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSpacesResponse]
    }
  }

  /** Information about the persistent storage for a Dev Environment.
    */
  @js.native
  trait PersistentStorage extends js.Object {
    var sizeInGiB: PersistentStorageSizeInGiBInteger
  }

  object PersistentStorage {
    @inline
    def apply(
        sizeInGiB: PersistentStorageSizeInGiBInteger
    ): PersistentStorage = {
      val __obj = js.Dynamic.literal(
        "sizeInGiB" -> sizeInGiB.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PersistentStorage]
    }
  }

  /** Information about the configuration of persistent storage for a Dev Environment.
    */
  @js.native
  trait PersistentStorageConfiguration extends js.Object {
    var sizeInGiB: PersistentStorageConfigurationSizeInGiBInteger
  }

  object PersistentStorageConfiguration {
    @inline
    def apply(
        sizeInGiB: PersistentStorageConfigurationSizeInGiBInteger
    ): PersistentStorageConfiguration = {
      val __obj = js.Dynamic.literal(
        "sizeInGiB" -> sizeInGiB.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PersistentStorageConfiguration]
    }
  }

  /** Information about a project in a space.
    */
  @js.native
  trait ProjectInformation extends js.Object {
    var name: js.UndefOr[String]
    var projectId: js.UndefOr[String]
  }

  object ProjectInformation {
    @inline
    def apply(
        name: js.UndefOr[String] = js.undefined,
        projectId: js.UndefOr[String] = js.undefined
    ): ProjectInformation = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      projectId.foreach(__v => __obj.updateDynamic("projectId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectInformation]
    }
  }

  /** nformation about the filter used to narrow the results returned in a list of projects.
    */
  @js.native
  trait ProjectListFilter extends js.Object {
    var key: FilterKey
    var values: StringList
    var comparisonOperator: js.UndefOr[ComparisonOperator]
  }

  object ProjectListFilter {
    @inline
    def apply(
        key: FilterKey,
        values: StringList,
        comparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined
    ): ProjectListFilter = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )

      comparisonOperator.foreach(__v => __obj.updateDynamic("comparisonOperator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectListFilter]
    }
  }

  /** Information about a project.
    */
  @js.native
  trait ProjectSummary extends js.Object {
    var name: String
    var description: js.UndefOr[String]
    var displayName: js.UndefOr[String]
  }

  object ProjectSummary {
    @inline
    def apply(
        name: String,
        description: js.UndefOr[String] = js.undefined,
        displayName: js.UndefOr[String] = js.undefined
    ): ProjectSummary = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectSummary]
    }
  }

  /** Information about a repository that will be cloned to a Dev Environment.
    */
  @js.native
  trait RepositoryInput extends js.Object {
    var repositoryName: SourceRepositoryNameString
    var branchName: js.UndefOr[SourceRepositoryBranchString]
  }

  object RepositoryInput {
    @inline
    def apply(
        repositoryName: SourceRepositoryNameString,
        branchName: js.UndefOr[SourceRepositoryBranchString] = js.undefined
    ): RepositoryInput = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      branchName.foreach(__v => __obj.updateDynamic("branchName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryInput]
    }
  }

  /** Information about an space.
    */
  @js.native
  trait SpaceSummary extends js.Object {
    var name: NameString
    var regionName: RegionString
    var description: js.UndefOr[String]
    var displayName: js.UndefOr[String]
  }

  object SpaceSummary {
    @inline
    def apply(
        name: NameString,
        regionName: RegionString,
        description: js.UndefOr[String] = js.undefined,
        displayName: js.UndefOr[String] = js.undefined
    ): SpaceSummary = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "regionName" -> regionName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpaceSummary]
    }
  }

  @js.native
  trait StartDevEnvironmentRequest extends js.Object {
    var id: Uuid
    var projectName: NameString
    var spaceName: NameString
    var ides: js.UndefOr[IdeConfigurationList]
    var inactivityTimeoutMinutes: js.UndefOr[InactivityTimeoutMinutes]
    var instanceType: js.UndefOr[InstanceType]
  }

  object StartDevEnvironmentRequest {
    @inline
    def apply(
        id: Uuid,
        projectName: NameString,
        spaceName: NameString,
        ides: js.UndefOr[IdeConfigurationList] = js.undefined,
        inactivityTimeoutMinutes: js.UndefOr[InactivityTimeoutMinutes] = js.undefined,
        instanceType: js.UndefOr[InstanceType] = js.undefined
    ): StartDevEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )

      ides.foreach(__v => __obj.updateDynamic("ides")(__v.asInstanceOf[js.Any]))
      inactivityTimeoutMinutes.foreach(__v => __obj.updateDynamic("inactivityTimeoutMinutes")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDevEnvironmentRequest]
    }
  }

  @js.native
  trait StartDevEnvironmentResponse extends js.Object {
    var id: Uuid
    var projectName: NameString
    var spaceName: NameString
    var status: DevEnvironmentStatus
  }

  object StartDevEnvironmentResponse {
    @inline
    def apply(
        id: Uuid,
        projectName: NameString,
        spaceName: NameString,
        status: DevEnvironmentStatus
    ): StartDevEnvironmentResponse = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartDevEnvironmentResponse]
    }
  }

  @js.native
  trait StartDevEnvironmentSessionRequest extends js.Object {
    var id: Uuid
    var projectName: NameString
    var sessionConfiguration: DevEnvironmentSessionConfiguration
    var spaceName: NameString
  }

  object StartDevEnvironmentSessionRequest {
    @inline
    def apply(
        id: Uuid,
        projectName: NameString,
        sessionConfiguration: DevEnvironmentSessionConfiguration,
        spaceName: NameString
    ): StartDevEnvironmentSessionRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "sessionConfiguration" -> sessionConfiguration.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartDevEnvironmentSessionRequest]
    }
  }

  @js.native
  trait StartDevEnvironmentSessionResponse extends js.Object {
    var accessDetails: DevEnvironmentAccessDetails
    var id: Uuid
    var projectName: NameString
    var spaceName: NameString
    var sessionId: js.UndefOr[StartDevEnvironmentSessionResponseSessionIdString]
  }

  object StartDevEnvironmentSessionResponse {
    @inline
    def apply(
        accessDetails: DevEnvironmentAccessDetails,
        id: Uuid,
        projectName: NameString,
        spaceName: NameString,
        sessionId: js.UndefOr[StartDevEnvironmentSessionResponseSessionIdString] = js.undefined
    ): StartDevEnvironmentSessionResponse = {
      val __obj = js.Dynamic.literal(
        "accessDetails" -> accessDetails.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )

      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDevEnvironmentSessionResponse]
    }
  }

  @js.native
  trait StopDevEnvironmentRequest extends js.Object {
    var id: Uuid
    var projectName: NameString
    var spaceName: NameString
  }

  object StopDevEnvironmentRequest {
    @inline
    def apply(
        id: Uuid,
        projectName: NameString,
        spaceName: NameString
    ): StopDevEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopDevEnvironmentRequest]
    }
  }

  @js.native
  trait StopDevEnvironmentResponse extends js.Object {
    var id: Uuid
    var projectName: NameString
    var spaceName: NameString
    var status: DevEnvironmentStatus
  }

  object StopDevEnvironmentResponse {
    @inline
    def apply(
        id: Uuid,
        projectName: NameString,
        spaceName: NameString,
        status: DevEnvironmentStatus
    ): StopDevEnvironmentResponse = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopDevEnvironmentResponse]
    }
  }

  @js.native
  trait UpdateDevEnvironmentRequest extends js.Object {
    var id: Uuid
    var projectName: NameString
    var spaceName: NameString
    var alias: js.UndefOr[UpdateDevEnvironmentRequestAliasString]
    var clientToken: js.UndefOr[ClientToken]
    var ides: js.UndefOr[IdeConfigurationList]
    var inactivityTimeoutMinutes: js.UndefOr[InactivityTimeoutMinutes]
    var instanceType: js.UndefOr[InstanceType]
  }

  object UpdateDevEnvironmentRequest {
    @inline
    def apply(
        id: Uuid,
        projectName: NameString,
        spaceName: NameString,
        alias: js.UndefOr[UpdateDevEnvironmentRequestAliasString] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        ides: js.UndefOr[IdeConfigurationList] = js.undefined,
        inactivityTimeoutMinutes: js.UndefOr[InactivityTimeoutMinutes] = js.undefined,
        instanceType: js.UndefOr[InstanceType] = js.undefined
    ): UpdateDevEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      ides.foreach(__v => __obj.updateDynamic("ides")(__v.asInstanceOf[js.Any]))
      inactivityTimeoutMinutes.foreach(__v => __obj.updateDynamic("inactivityTimeoutMinutes")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDevEnvironmentRequest]
    }
  }

  @js.native
  trait UpdateDevEnvironmentResponse extends js.Object {
    var id: Uuid
    var projectName: NameString
    var spaceName: NameString
    var alias: js.UndefOr[UpdateDevEnvironmentResponseAliasString]
    var clientToken: js.UndefOr[ClientToken]
    var ides: js.UndefOr[IdeConfigurationList]
    var inactivityTimeoutMinutes: js.UndefOr[InactivityTimeoutMinutes]
    var instanceType: js.UndefOr[InstanceType]
  }

  object UpdateDevEnvironmentResponse {
    @inline
    def apply(
        id: Uuid,
        projectName: NameString,
        spaceName: NameString,
        alias: js.UndefOr[UpdateDevEnvironmentResponseAliasString] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        ides: js.UndefOr[IdeConfigurationList] = js.undefined,
        inactivityTimeoutMinutes: js.UndefOr[InactivityTimeoutMinutes] = js.undefined,
        instanceType: js.UndefOr[InstanceType] = js.undefined
    ): UpdateDevEnvironmentResponse = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "spaceName" -> spaceName.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      ides.foreach(__v => __obj.updateDynamic("ides")(__v.asInstanceOf[js.Any]))
      inactivityTimeoutMinutes.foreach(__v => __obj.updateDynamic("inactivityTimeoutMinutes")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDevEnvironmentResponse]
    }
  }

  /** Information about a user whose activity is recorded in an event for a space.
    */
  @js.native
  trait UserIdentity extends js.Object {
    var principalId: String
    var userType: UserType
    var awsAccountId: js.UndefOr[String]
    var userName: js.UndefOr[String]
  }

  object UserIdentity {
    @inline
    def apply(
        principalId: String,
        userType: UserType,
        awsAccountId: js.UndefOr[String] = js.undefined,
        userName: js.UndefOr[String] = js.undefined
    ): UserIdentity = {
      val __obj = js.Dynamic.literal(
        "principalId" -> principalId.asInstanceOf[js.Any],
        "userType" -> userType.asInstanceOf[js.Any]
      )

      awsAccountId.foreach(__v => __obj.updateDynamic("awsAccountId")(__v.asInstanceOf[js.Any]))
      userName.foreach(__v => __obj.updateDynamic("userName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserIdentity]
    }
  }

  @js.native
  trait VerifySessionResponse extends js.Object {
    var identity: js.UndefOr[VerifySessionResponseIdentityString]
  }

  object VerifySessionResponse {
    @inline
    def apply(
        identity: js.UndefOr[VerifySessionResponseIdentityString] = js.undefined
    ): VerifySessionResponse = {
      val __obj = js.Dynamic.literal()
      identity.foreach(__v => __obj.updateDynamic("identity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VerifySessionResponse]
    }
  }
}
