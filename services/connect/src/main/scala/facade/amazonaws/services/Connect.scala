package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object connect {
  type ARN = String
  type AfterContactWorkTimeLimit = Int
  type AgentFirstName = String
  type AgentLastName = String
  type AgentUsername = String
  type AssociationId = String
  type AttributeName = String
  type AttributeValue = String
  type Attributes = js.Dictionary[AttributeValue]
  type AttributesList = js.Array[Attribute]
  type AutoAccept = Boolean
  type BotName = String
  type BucketName = String
  type Channels = js.Array[Channel]
  type ChatContent = String
  type ChatContentType = String
  type ClientToken = String
  type CommonDescriptionLength250 = String
  type CommonNameLength127 = String
  type Concurrency = Int
  type ContactFlowContent = String
  type ContactFlowDescription = String
  type ContactFlowId = String
  type ContactFlowName = String
  type ContactFlowSummaryList = js.Array[ContactFlowSummary]
  type ContactFlowTypes = js.Array[ContactFlowType]
  type ContactId = String
  type ContactReferences = js.Dictionary[Reference]
  type CurrentMetricDataCollections = js.Array[CurrentMetricData]
  type CurrentMetricResults = js.Array[CurrentMetricResult]
  type CurrentMetrics = js.Array[CurrentMetric]
  type Delay = Int
  type Description = String
  type DirectoryAlias = String
  type DirectoryId = String
  type DirectoryUserId = String
  type DisplayName = String
  type Email = String
  type FunctionArn = String
  type FunctionArnsList = js.Array[FunctionArn]
  type Groupings = js.Array[Grouping]
  type HierarchyGroupId = String
  type HierarchyGroupName = String
  type HierarchyGroupSummaryList = js.Array[HierarchyGroupSummary]
  type HierarchyLevelId = String
  type HierarchyLevelName = String
  type HistoricalMetricDataCollections = js.Array[HistoricalMetricData]
  type HistoricalMetricResults = js.Array[HistoricalMetricResult]
  type HistoricalMetrics = js.Array[HistoricalMetric]
  type Hours = Int
  type Hours24Format = Int
  type HoursOfOperationConfigList = js.Array[HoursOfOperationConfig]
  type HoursOfOperationId = String
  type HoursOfOperationName = String
  type HoursOfOperationSummaryList = js.Array[HoursOfOperationSummary]
  type InboundCallsEnabled = Boolean
  type InstanceAttributeValue = String
  type InstanceId = String
  type InstanceStorageConfigs = js.Array[InstanceStorageConfig]
  type InstanceSummaryList = js.Array[InstanceSummary]
  type IntegrationAssociationId = String
  type IntegrationAssociationSummaryList = js.Array[IntegrationAssociationSummary]
  type KeyId = String
  type LexBotsList = js.Array[LexBot]
  type LexRegion = String
  type MaxResult10 = Int
  type MaxResult100 = Int
  type MaxResult1000 = Int
  type MaxResult2 = Int
  type MaxResult25 = Int
  type MaxResult7 = Int
  type MediaConcurrencies = js.Array[MediaConcurrency]
  type MinutesLimit60 = Int
  type Name = String
  type NextToken = String
  type Origin = String
  type OriginsList = js.Array[Origin]
  type OutboundCallerIdName = String
  type OutboundCallsEnabled = Boolean
  type PEM = String
  type ParticipantId = String
  type ParticipantToken = String
  type Password = String
  type PhoneNumber = String
  type PhoneNumberCountryCodes = js.Array[PhoneNumberCountryCode]
  type PhoneNumberId = String
  type PhoneNumberSummaryList = js.Array[PhoneNumberSummary]
  type PhoneNumberTypes = js.Array[PhoneNumberType]
  type Prefix = String
  type Priority = Int
  type PromptId = String
  type PromptName = String
  type PromptSummaryList = js.Array[PromptSummary]
  type QueueDescription = String
  type QueueId = String
  type QueueMaxContacts = Int
  type QueueName = String
  type QueueSummaryList = js.Array[QueueSummary]
  type QueueTypes = js.Array[QueueType]
  type Queues = js.Array[QueueId]
  type QuickConnectDescription = String
  type QuickConnectId = String
  type QuickConnectName = String
  type QuickConnectSummaryList = js.Array[QuickConnectSummary]
  type QuickConnectTypes = js.Array[QuickConnectType]
  type QuickConnectsList = js.Array[QuickConnectId]
  type ReferenceKey = String
  type ReferenceValue = String
  type RoutingProfileDescription = String
  type RoutingProfileId = String
  type RoutingProfileName = String
  type RoutingProfileQueueConfigList = js.Array[RoutingProfileQueueConfig]
  type RoutingProfileQueueConfigSummaryList = js.Array[RoutingProfileQueueConfigSummary]
  type RoutingProfileQueueReferenceList = js.Array[RoutingProfileQueueReference]
  type RoutingProfileSummaryList = js.Array[RoutingProfileSummary]
  type SecurityKeysList = js.Array[SecurityKey]
  type SecurityProfileId = String
  type SecurityProfileIds = js.Array[SecurityProfileId]
  type SecurityProfileName = String
  type SecurityProfileSummaryList = js.Array[SecurityProfileSummary]
  type SecurityToken = String
  type SourceApplicationName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type ThresholdValue = Double
  type TimeZone = String
  type Timestamp = js.Date
  type URI = String
  type UseCaseId = String
  type UseCaseSummaryList = js.Array[UseCase]
  type UserId = String
  type UserSummaryList = js.Array[UserSummary]
  type Value = Double
  type timestamp = js.Date

  final class ConnectOps(private val service: Connect) extends AnyVal {

    @inline def associateApprovedOriginFuture(params: AssociateApprovedOriginRequest): Future[js.Object] = service.associateApprovedOrigin(params).promise().toFuture
    @inline def associateInstanceStorageConfigFuture(params: AssociateInstanceStorageConfigRequest): Future[AssociateInstanceStorageConfigResponse] = service.associateInstanceStorageConfig(params).promise().toFuture
    @inline def associateLambdaFunctionFuture(params: AssociateLambdaFunctionRequest): Future[js.Object] = service.associateLambdaFunction(params).promise().toFuture
    @inline def associateLexBotFuture(params: AssociateLexBotRequest): Future[js.Object] = service.associateLexBot(params).promise().toFuture
    @inline def associateQueueQuickConnectsFuture(params: AssociateQueueQuickConnectsRequest): Future[js.Object] = service.associateQueueQuickConnects(params).promise().toFuture
    @inline def associateRoutingProfileQueuesFuture(params: AssociateRoutingProfileQueuesRequest): Future[js.Object] = service.associateRoutingProfileQueues(params).promise().toFuture
    @inline def associateSecurityKeyFuture(params: AssociateSecurityKeyRequest): Future[AssociateSecurityKeyResponse] = service.associateSecurityKey(params).promise().toFuture
    @inline def createContactFlowFuture(params: CreateContactFlowRequest): Future[CreateContactFlowResponse] = service.createContactFlow(params).promise().toFuture
    @inline def createInstanceFuture(params: CreateInstanceRequest): Future[CreateInstanceResponse] = service.createInstance(params).promise().toFuture
    @inline def createIntegrationAssociationFuture(params: CreateIntegrationAssociationRequest): Future[CreateIntegrationAssociationResponse] = service.createIntegrationAssociation(params).promise().toFuture
    @inline def createQueueFuture(params: CreateQueueRequest): Future[CreateQueueResponse] = service.createQueue(params).promise().toFuture
    @inline def createQuickConnectFuture(params: CreateQuickConnectRequest): Future[CreateQuickConnectResponse] = service.createQuickConnect(params).promise().toFuture
    @inline def createRoutingProfileFuture(params: CreateRoutingProfileRequest): Future[CreateRoutingProfileResponse] = service.createRoutingProfile(params).promise().toFuture
    @inline def createUseCaseFuture(params: CreateUseCaseRequest): Future[CreateUseCaseResponse] = service.createUseCase(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] = service.createUser(params).promise().toFuture
    @inline def createUserHierarchyGroupFuture(params: CreateUserHierarchyGroupRequest): Future[CreateUserHierarchyGroupResponse] = service.createUserHierarchyGroup(params).promise().toFuture
    @inline def deleteInstanceFuture(params: DeleteInstanceRequest): Future[js.Object] = service.deleteInstance(params).promise().toFuture
    @inline def deleteIntegrationAssociationFuture(params: DeleteIntegrationAssociationRequest): Future[js.Object] = service.deleteIntegrationAssociation(params).promise().toFuture
    @inline def deleteQuickConnectFuture(params: DeleteQuickConnectRequest): Future[js.Object] = service.deleteQuickConnect(params).promise().toFuture
    @inline def deleteUseCaseFuture(params: DeleteUseCaseRequest): Future[js.Object] = service.deleteUseCase(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] = service.deleteUser(params).promise().toFuture
    @inline def deleteUserHierarchyGroupFuture(params: DeleteUserHierarchyGroupRequest): Future[js.Object] = service.deleteUserHierarchyGroup(params).promise().toFuture
    @inline def describeContactFlowFuture(params: DescribeContactFlowRequest): Future[DescribeContactFlowResponse] = service.describeContactFlow(params).promise().toFuture
    @inline def describeHoursOfOperationFuture(params: DescribeHoursOfOperationRequest): Future[DescribeHoursOfOperationResponse] = service.describeHoursOfOperation(params).promise().toFuture
    @inline def describeInstanceAttributeFuture(params: DescribeInstanceAttributeRequest): Future[DescribeInstanceAttributeResponse] = service.describeInstanceAttribute(params).promise().toFuture
    @inline def describeInstanceFuture(params: DescribeInstanceRequest): Future[DescribeInstanceResponse] = service.describeInstance(params).promise().toFuture
    @inline def describeInstanceStorageConfigFuture(params: DescribeInstanceStorageConfigRequest): Future[DescribeInstanceStorageConfigResponse] = service.describeInstanceStorageConfig(params).promise().toFuture
    @inline def describeQueueFuture(params: DescribeQueueRequest): Future[DescribeQueueResponse] = service.describeQueue(params).promise().toFuture
    @inline def describeQuickConnectFuture(params: DescribeQuickConnectRequest): Future[DescribeQuickConnectResponse] = service.describeQuickConnect(params).promise().toFuture
    @inline def describeRoutingProfileFuture(params: DescribeRoutingProfileRequest): Future[DescribeRoutingProfileResponse] = service.describeRoutingProfile(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] = service.describeUser(params).promise().toFuture
    @inline def describeUserHierarchyGroupFuture(params: DescribeUserHierarchyGroupRequest): Future[DescribeUserHierarchyGroupResponse] = service.describeUserHierarchyGroup(params).promise().toFuture
    @inline def describeUserHierarchyStructureFuture(params: DescribeUserHierarchyStructureRequest): Future[DescribeUserHierarchyStructureResponse] = service.describeUserHierarchyStructure(params).promise().toFuture
    @inline def disassociateApprovedOriginFuture(params: DisassociateApprovedOriginRequest): Future[js.Object] = service.disassociateApprovedOrigin(params).promise().toFuture
    @inline def disassociateInstanceStorageConfigFuture(params: DisassociateInstanceStorageConfigRequest): Future[js.Object] = service.disassociateInstanceStorageConfig(params).promise().toFuture
    @inline def disassociateLambdaFunctionFuture(params: DisassociateLambdaFunctionRequest): Future[js.Object] = service.disassociateLambdaFunction(params).promise().toFuture
    @inline def disassociateLexBotFuture(params: DisassociateLexBotRequest): Future[js.Object] = service.disassociateLexBot(params).promise().toFuture
    @inline def disassociateQueueQuickConnectsFuture(params: DisassociateQueueQuickConnectsRequest): Future[js.Object] = service.disassociateQueueQuickConnects(params).promise().toFuture
    @inline def disassociateRoutingProfileQueuesFuture(params: DisassociateRoutingProfileQueuesRequest): Future[js.Object] = service.disassociateRoutingProfileQueues(params).promise().toFuture
    @inline def disassociateSecurityKeyFuture(params: DisassociateSecurityKeyRequest): Future[js.Object] = service.disassociateSecurityKey(params).promise().toFuture
    @inline def getContactAttributesFuture(params: GetContactAttributesRequest): Future[GetContactAttributesResponse] = service.getContactAttributes(params).promise().toFuture
    @inline def getCurrentMetricDataFuture(params: GetCurrentMetricDataRequest): Future[GetCurrentMetricDataResponse] = service.getCurrentMetricData(params).promise().toFuture
    @inline def getFederationTokenFuture(params: GetFederationTokenRequest): Future[GetFederationTokenResponse] = service.getFederationToken(params).promise().toFuture
    @inline def getMetricDataFuture(params: GetMetricDataRequest): Future[GetMetricDataResponse] = service.getMetricData(params).promise().toFuture
    @inline def listApprovedOriginsFuture(params: ListApprovedOriginsRequest): Future[ListApprovedOriginsResponse] = service.listApprovedOrigins(params).promise().toFuture
    @inline def listContactFlowsFuture(params: ListContactFlowsRequest): Future[ListContactFlowsResponse] = service.listContactFlows(params).promise().toFuture
    @inline def listHoursOfOperationsFuture(params: ListHoursOfOperationsRequest): Future[ListHoursOfOperationsResponse] = service.listHoursOfOperations(params).promise().toFuture
    @inline def listInstanceAttributesFuture(params: ListInstanceAttributesRequest): Future[ListInstanceAttributesResponse] = service.listInstanceAttributes(params).promise().toFuture
    @inline def listInstanceStorageConfigsFuture(params: ListInstanceStorageConfigsRequest): Future[ListInstanceStorageConfigsResponse] = service.listInstanceStorageConfigs(params).promise().toFuture
    @inline def listInstancesFuture(params: ListInstancesRequest): Future[ListInstancesResponse] = service.listInstances(params).promise().toFuture
    @inline def listIntegrationAssociationsFuture(params: ListIntegrationAssociationsRequest): Future[ListIntegrationAssociationsResponse] = service.listIntegrationAssociations(params).promise().toFuture
    @inline def listLambdaFunctionsFuture(params: ListLambdaFunctionsRequest): Future[ListLambdaFunctionsResponse] = service.listLambdaFunctions(params).promise().toFuture
    @inline def listLexBotsFuture(params: ListLexBotsRequest): Future[ListLexBotsResponse] = service.listLexBots(params).promise().toFuture
    @inline def listPhoneNumbersFuture(params: ListPhoneNumbersRequest): Future[ListPhoneNumbersResponse] = service.listPhoneNumbers(params).promise().toFuture
    @inline def listPromptsFuture(params: ListPromptsRequest): Future[ListPromptsResponse] = service.listPrompts(params).promise().toFuture
    @inline def listQueueQuickConnectsFuture(params: ListQueueQuickConnectsRequest): Future[ListQueueQuickConnectsResponse] = service.listQueueQuickConnects(params).promise().toFuture
    @inline def listQueuesFuture(params: ListQueuesRequest): Future[ListQueuesResponse] = service.listQueues(params).promise().toFuture
    @inline def listQuickConnectsFuture(params: ListQuickConnectsRequest): Future[ListQuickConnectsResponse] = service.listQuickConnects(params).promise().toFuture
    @inline def listRoutingProfileQueuesFuture(params: ListRoutingProfileQueuesRequest): Future[ListRoutingProfileQueuesResponse] = service.listRoutingProfileQueues(params).promise().toFuture
    @inline def listRoutingProfilesFuture(params: ListRoutingProfilesRequest): Future[ListRoutingProfilesResponse] = service.listRoutingProfiles(params).promise().toFuture
    @inline def listSecurityKeysFuture(params: ListSecurityKeysRequest): Future[ListSecurityKeysResponse] = service.listSecurityKeys(params).promise().toFuture
    @inline def listSecurityProfilesFuture(params: ListSecurityProfilesRequest): Future[ListSecurityProfilesResponse] = service.listSecurityProfiles(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listUseCasesFuture(params: ListUseCasesRequest): Future[ListUseCasesResponse] = service.listUseCases(params).promise().toFuture
    @inline def listUserHierarchyGroupsFuture(params: ListUserHierarchyGroupsRequest): Future[ListUserHierarchyGroupsResponse] = service.listUserHierarchyGroups(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture
    @inline def resumeContactRecordingFuture(params: ResumeContactRecordingRequest): Future[ResumeContactRecordingResponse] = service.resumeContactRecording(params).promise().toFuture
    @inline def startChatContactFuture(params: StartChatContactRequest): Future[StartChatContactResponse] = service.startChatContact(params).promise().toFuture
    @inline def startContactRecordingFuture(params: StartContactRecordingRequest): Future[StartContactRecordingResponse] = service.startContactRecording(params).promise().toFuture
    @inline def startOutboundVoiceContactFuture(params: StartOutboundVoiceContactRequest): Future[StartOutboundVoiceContactResponse] = service.startOutboundVoiceContact(params).promise().toFuture
    @inline def startTaskContactFuture(params: StartTaskContactRequest): Future[StartTaskContactResponse] = service.startTaskContact(params).promise().toFuture
    @inline def stopContactFuture(params: StopContactRequest): Future[StopContactResponse] = service.stopContact(params).promise().toFuture
    @inline def stopContactRecordingFuture(params: StopContactRecordingRequest): Future[StopContactRecordingResponse] = service.stopContactRecording(params).promise().toFuture
    @inline def suspendContactRecordingFuture(params: SuspendContactRecordingRequest): Future[SuspendContactRecordingResponse] = service.suspendContactRecording(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateContactAttributesFuture(params: UpdateContactAttributesRequest): Future[UpdateContactAttributesResponse] = service.updateContactAttributes(params).promise().toFuture
    @inline def updateContactFlowContentFuture(params: UpdateContactFlowContentRequest): Future[js.Object] = service.updateContactFlowContent(params).promise().toFuture
    @inline def updateContactFlowNameFuture(params: UpdateContactFlowNameRequest): Future[js.Object] = service.updateContactFlowName(params).promise().toFuture
    @inline def updateInstanceAttributeFuture(params: UpdateInstanceAttributeRequest): Future[js.Object] = service.updateInstanceAttribute(params).promise().toFuture
    @inline def updateInstanceStorageConfigFuture(params: UpdateInstanceStorageConfigRequest): Future[js.Object] = service.updateInstanceStorageConfig(params).promise().toFuture
    @inline def updateQueueHoursOfOperationFuture(params: UpdateQueueHoursOfOperationRequest): Future[js.Object] = service.updateQueueHoursOfOperation(params).promise().toFuture
    @inline def updateQueueMaxContactsFuture(params: UpdateQueueMaxContactsRequest): Future[js.Object] = service.updateQueueMaxContacts(params).promise().toFuture
    @inline def updateQueueNameFuture(params: UpdateQueueNameRequest): Future[js.Object] = service.updateQueueName(params).promise().toFuture
    @inline def updateQueueOutboundCallerConfigFuture(params: UpdateQueueOutboundCallerConfigRequest): Future[js.Object] = service.updateQueueOutboundCallerConfig(params).promise().toFuture
    @inline def updateQueueStatusFuture(params: UpdateQueueStatusRequest): Future[js.Object] = service.updateQueueStatus(params).promise().toFuture
    @inline def updateQuickConnectConfigFuture(params: UpdateQuickConnectConfigRequest): Future[js.Object] = service.updateQuickConnectConfig(params).promise().toFuture
    @inline def updateQuickConnectNameFuture(params: UpdateQuickConnectNameRequest): Future[js.Object] = service.updateQuickConnectName(params).promise().toFuture
    @inline def updateRoutingProfileConcurrencyFuture(params: UpdateRoutingProfileConcurrencyRequest): Future[js.Object] = service.updateRoutingProfileConcurrency(params).promise().toFuture
    @inline def updateRoutingProfileDefaultOutboundQueueFuture(params: UpdateRoutingProfileDefaultOutboundQueueRequest): Future[js.Object] = service.updateRoutingProfileDefaultOutboundQueue(params).promise().toFuture
    @inline def updateRoutingProfileNameFuture(params: UpdateRoutingProfileNameRequest): Future[js.Object] = service.updateRoutingProfileName(params).promise().toFuture
    @inline def updateRoutingProfileQueuesFuture(params: UpdateRoutingProfileQueuesRequest): Future[js.Object] = service.updateRoutingProfileQueues(params).promise().toFuture
    @inline def updateUserHierarchyFuture(params: UpdateUserHierarchyRequest): Future[js.Object] = service.updateUserHierarchy(params).promise().toFuture
    @inline def updateUserHierarchyGroupNameFuture(params: UpdateUserHierarchyGroupNameRequest): Future[js.Object] = service.updateUserHierarchyGroupName(params).promise().toFuture
    @inline def updateUserHierarchyStructureFuture(params: UpdateUserHierarchyStructureRequest): Future[js.Object] = service.updateUserHierarchyStructure(params).promise().toFuture
    @inline def updateUserIdentityInfoFuture(params: UpdateUserIdentityInfoRequest): Future[js.Object] = service.updateUserIdentityInfo(params).promise().toFuture
    @inline def updateUserPhoneConfigFuture(params: UpdateUserPhoneConfigRequest): Future[js.Object] = service.updateUserPhoneConfig(params).promise().toFuture
    @inline def updateUserRoutingProfileFuture(params: UpdateUserRoutingProfileRequest): Future[js.Object] = service.updateUserRoutingProfile(params).promise().toFuture
    @inline def updateUserSecurityProfilesFuture(params: UpdateUserSecurityProfilesRequest): Future[js.Object] = service.updateUserSecurityProfiles(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/connect", JSImport.Namespace, "AWS.Connect")
  class Connect() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateApprovedOrigin(params: AssociateApprovedOriginRequest): Request[js.Object] = js.native
    def associateInstanceStorageConfig(params: AssociateInstanceStorageConfigRequest): Request[AssociateInstanceStorageConfigResponse] = js.native
    def associateLambdaFunction(params: AssociateLambdaFunctionRequest): Request[js.Object] = js.native
    def associateLexBot(params: AssociateLexBotRequest): Request[js.Object] = js.native
    def associateQueueQuickConnects(params: AssociateQueueQuickConnectsRequest): Request[js.Object] = js.native
    def associateRoutingProfileQueues(params: AssociateRoutingProfileQueuesRequest): Request[js.Object] = js.native
    def associateSecurityKey(params: AssociateSecurityKeyRequest): Request[AssociateSecurityKeyResponse] = js.native
    def createContactFlow(params: CreateContactFlowRequest): Request[CreateContactFlowResponse] = js.native
    def createInstance(params: CreateInstanceRequest): Request[CreateInstanceResponse] = js.native
    def createIntegrationAssociation(params: CreateIntegrationAssociationRequest): Request[CreateIntegrationAssociationResponse] = js.native
    def createQueue(params: CreateQueueRequest): Request[CreateQueueResponse] = js.native
    def createQuickConnect(params: CreateQuickConnectRequest): Request[CreateQuickConnectResponse] = js.native
    def createRoutingProfile(params: CreateRoutingProfileRequest): Request[CreateRoutingProfileResponse] = js.native
    def createUseCase(params: CreateUseCaseRequest): Request[CreateUseCaseResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def createUserHierarchyGroup(params: CreateUserHierarchyGroupRequest): Request[CreateUserHierarchyGroupResponse] = js.native
    def deleteInstance(params: DeleteInstanceRequest): Request[js.Object] = js.native
    def deleteIntegrationAssociation(params: DeleteIntegrationAssociationRequest): Request[js.Object] = js.native
    def deleteQuickConnect(params: DeleteQuickConnectRequest): Request[js.Object] = js.native
    def deleteUseCase(params: DeleteUseCaseRequest): Request[js.Object] = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object] = js.native
    def deleteUserHierarchyGroup(params: DeleteUserHierarchyGroupRequest): Request[js.Object] = js.native
    def describeContactFlow(params: DescribeContactFlowRequest): Request[DescribeContactFlowResponse] = js.native
    def describeHoursOfOperation(params: DescribeHoursOfOperationRequest): Request[DescribeHoursOfOperationResponse] = js.native
    def describeInstance(params: DescribeInstanceRequest): Request[DescribeInstanceResponse] = js.native
    def describeInstanceAttribute(params: DescribeInstanceAttributeRequest): Request[DescribeInstanceAttributeResponse] = js.native
    def describeInstanceStorageConfig(params: DescribeInstanceStorageConfigRequest): Request[DescribeInstanceStorageConfigResponse] = js.native
    def describeQueue(params: DescribeQueueRequest): Request[DescribeQueueResponse] = js.native
    def describeQuickConnect(params: DescribeQuickConnectRequest): Request[DescribeQuickConnectResponse] = js.native
    def describeRoutingProfile(params: DescribeRoutingProfileRequest): Request[DescribeRoutingProfileResponse] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def describeUserHierarchyGroup(params: DescribeUserHierarchyGroupRequest): Request[DescribeUserHierarchyGroupResponse] = js.native
    def describeUserHierarchyStructure(params: DescribeUserHierarchyStructureRequest): Request[DescribeUserHierarchyStructureResponse] = js.native
    def disassociateApprovedOrigin(params: DisassociateApprovedOriginRequest): Request[js.Object] = js.native
    def disassociateInstanceStorageConfig(params: DisassociateInstanceStorageConfigRequest): Request[js.Object] = js.native
    def disassociateLambdaFunction(params: DisassociateLambdaFunctionRequest): Request[js.Object] = js.native
    def disassociateLexBot(params: DisassociateLexBotRequest): Request[js.Object] = js.native
    def disassociateQueueQuickConnects(params: DisassociateQueueQuickConnectsRequest): Request[js.Object] = js.native
    def disassociateRoutingProfileQueues(params: DisassociateRoutingProfileQueuesRequest): Request[js.Object] = js.native
    def disassociateSecurityKey(params: DisassociateSecurityKeyRequest): Request[js.Object] = js.native
    def getContactAttributes(params: GetContactAttributesRequest): Request[GetContactAttributesResponse] = js.native
    def getCurrentMetricData(params: GetCurrentMetricDataRequest): Request[GetCurrentMetricDataResponse] = js.native
    def getFederationToken(params: GetFederationTokenRequest): Request[GetFederationTokenResponse] = js.native
    def getMetricData(params: GetMetricDataRequest): Request[GetMetricDataResponse] = js.native
    def listApprovedOrigins(params: ListApprovedOriginsRequest): Request[ListApprovedOriginsResponse] = js.native
    def listContactFlows(params: ListContactFlowsRequest): Request[ListContactFlowsResponse] = js.native
    def listHoursOfOperations(params: ListHoursOfOperationsRequest): Request[ListHoursOfOperationsResponse] = js.native
    def listInstanceAttributes(params: ListInstanceAttributesRequest): Request[ListInstanceAttributesResponse] = js.native
    def listInstanceStorageConfigs(params: ListInstanceStorageConfigsRequest): Request[ListInstanceStorageConfigsResponse] = js.native
    def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse] = js.native
    def listIntegrationAssociations(params: ListIntegrationAssociationsRequest): Request[ListIntegrationAssociationsResponse] = js.native
    def listLambdaFunctions(params: ListLambdaFunctionsRequest): Request[ListLambdaFunctionsResponse] = js.native
    def listLexBots(params: ListLexBotsRequest): Request[ListLexBotsResponse] = js.native
    def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse] = js.native
    def listPrompts(params: ListPromptsRequest): Request[ListPromptsResponse] = js.native
    def listQueueQuickConnects(params: ListQueueQuickConnectsRequest): Request[ListQueueQuickConnectsResponse] = js.native
    def listQueues(params: ListQueuesRequest): Request[ListQueuesResponse] = js.native
    def listQuickConnects(params: ListQuickConnectsRequest): Request[ListQuickConnectsResponse] = js.native
    def listRoutingProfileQueues(params: ListRoutingProfileQueuesRequest): Request[ListRoutingProfileQueuesResponse] = js.native
    def listRoutingProfiles(params: ListRoutingProfilesRequest): Request[ListRoutingProfilesResponse] = js.native
    def listSecurityKeys(params: ListSecurityKeysRequest): Request[ListSecurityKeysResponse] = js.native
    def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listUseCases(params: ListUseCasesRequest): Request[ListUseCasesResponse] = js.native
    def listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest): Request[ListUserHierarchyGroupsResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def resumeContactRecording(params: ResumeContactRecordingRequest): Request[ResumeContactRecordingResponse] = js.native
    def startChatContact(params: StartChatContactRequest): Request[StartChatContactResponse] = js.native
    def startContactRecording(params: StartContactRecordingRequest): Request[StartContactRecordingResponse] = js.native
    def startOutboundVoiceContact(params: StartOutboundVoiceContactRequest): Request[StartOutboundVoiceContactResponse] = js.native
    def startTaskContact(params: StartTaskContactRequest): Request[StartTaskContactResponse] = js.native
    def stopContact(params: StopContactRequest): Request[StopContactResponse] = js.native
    def stopContactRecording(params: StopContactRecordingRequest): Request[StopContactRecordingResponse] = js.native
    def suspendContactRecording(params: SuspendContactRecordingRequest): Request[SuspendContactRecordingResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateContactAttributes(params: UpdateContactAttributesRequest): Request[UpdateContactAttributesResponse] = js.native
    def updateContactFlowContent(params: UpdateContactFlowContentRequest): Request[js.Object] = js.native
    def updateContactFlowName(params: UpdateContactFlowNameRequest): Request[js.Object] = js.native
    def updateInstanceAttribute(params: UpdateInstanceAttributeRequest): Request[js.Object] = js.native
    def updateInstanceStorageConfig(params: UpdateInstanceStorageConfigRequest): Request[js.Object] = js.native
    def updateQueueHoursOfOperation(params: UpdateQueueHoursOfOperationRequest): Request[js.Object] = js.native
    def updateQueueMaxContacts(params: UpdateQueueMaxContactsRequest): Request[js.Object] = js.native
    def updateQueueName(params: UpdateQueueNameRequest): Request[js.Object] = js.native
    def updateQueueOutboundCallerConfig(params: UpdateQueueOutboundCallerConfigRequest): Request[js.Object] = js.native
    def updateQueueStatus(params: UpdateQueueStatusRequest): Request[js.Object] = js.native
    def updateQuickConnectConfig(params: UpdateQuickConnectConfigRequest): Request[js.Object] = js.native
    def updateQuickConnectName(params: UpdateQuickConnectNameRequest): Request[js.Object] = js.native
    def updateRoutingProfileConcurrency(params: UpdateRoutingProfileConcurrencyRequest): Request[js.Object] = js.native
    def updateRoutingProfileDefaultOutboundQueue(params: UpdateRoutingProfileDefaultOutboundQueueRequest): Request[js.Object] = js.native
    def updateRoutingProfileName(params: UpdateRoutingProfileNameRequest): Request[js.Object] = js.native
    def updateRoutingProfileQueues(params: UpdateRoutingProfileQueuesRequest): Request[js.Object] = js.native
    def updateUserHierarchy(params: UpdateUserHierarchyRequest): Request[js.Object] = js.native
    def updateUserHierarchyGroupName(params: UpdateUserHierarchyGroupNameRequest): Request[js.Object] = js.native
    def updateUserHierarchyStructure(params: UpdateUserHierarchyStructureRequest): Request[js.Object] = js.native
    def updateUserIdentityInfo(params: UpdateUserIdentityInfoRequest): Request[js.Object] = js.native
    def updateUserPhoneConfig(params: UpdateUserPhoneConfigRequest): Request[js.Object] = js.native
    def updateUserRoutingProfile(params: UpdateUserRoutingProfileRequest): Request[js.Object] = js.native
    def updateUserSecurityProfiles(params: UpdateUserSecurityProfilesRequest): Request[js.Object] = js.native
  }
  object Connect {
    @inline implicit def toOps(service: Connect): ConnectOps = {
      new ConnectOps(service)
    }
  }

  @js.native
  trait AssociateApprovedOriginRequest extends js.Object {
    var InstanceId: InstanceId
    var Origin: Origin
  }

  object AssociateApprovedOriginRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        Origin: Origin
    ): AssociateApprovedOriginRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Origin" -> Origin.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateApprovedOriginRequest]
    }
  }

  @js.native
  trait AssociateInstanceStorageConfigRequest extends js.Object {
    var InstanceId: InstanceId
    var ResourceType: InstanceStorageResourceType
    var StorageConfig: InstanceStorageConfig
  }

  object AssociateInstanceStorageConfigRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        ResourceType: InstanceStorageResourceType,
        StorageConfig: InstanceStorageConfig
    ): AssociateInstanceStorageConfigRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "StorageConfig" -> StorageConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateInstanceStorageConfigRequest]
    }
  }

  @js.native
  trait AssociateInstanceStorageConfigResponse extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
  }

  object AssociateInstanceStorageConfigResponse {
    @inline
    def apply(
        AssociationId: js.UndefOr[AssociationId] = js.undefined
    ): AssociateInstanceStorageConfigResponse = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateInstanceStorageConfigResponse]
    }
  }

  @js.native
  trait AssociateLambdaFunctionRequest extends js.Object {
    var FunctionArn: FunctionArn
    var InstanceId: InstanceId
  }

  object AssociateLambdaFunctionRequest {
    @inline
    def apply(
        FunctionArn: FunctionArn,
        InstanceId: InstanceId
    ): AssociateLambdaFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionArn" -> FunctionArn.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateLambdaFunctionRequest]
    }
  }

  @js.native
  trait AssociateLexBotRequest extends js.Object {
    var InstanceId: InstanceId
    var LexBot: LexBot
  }

  object AssociateLexBotRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        LexBot: LexBot
    ): AssociateLexBotRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "LexBot" -> LexBot.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateLexBotRequest]
    }
  }

  @js.native
  trait AssociateQueueQuickConnectsRequest extends js.Object {
    var InstanceId: InstanceId
    var QueueId: QueueId
    var QuickConnectIds: QuickConnectsList
  }

  object AssociateQueueQuickConnectsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QueueId: QueueId,
        QuickConnectIds: QuickConnectsList
    ): AssociateQueueQuickConnectsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any],
        "QuickConnectIds" -> QuickConnectIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateQueueQuickConnectsRequest]
    }
  }

  @js.native
  trait AssociateRoutingProfileQueuesRequest extends js.Object {
    var InstanceId: InstanceId
    var QueueConfigs: RoutingProfileQueueConfigList
    var RoutingProfileId: RoutingProfileId
  }

  object AssociateRoutingProfileQueuesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QueueConfigs: RoutingProfileQueueConfigList,
        RoutingProfileId: RoutingProfileId
    ): AssociateRoutingProfileQueuesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QueueConfigs" -> QueueConfigs.asInstanceOf[js.Any],
        "RoutingProfileId" -> RoutingProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateRoutingProfileQueuesRequest]
    }
  }

  @js.native
  trait AssociateSecurityKeyRequest extends js.Object {
    var InstanceId: InstanceId
    var Key: PEM
  }

  object AssociateSecurityKeyRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        Key: PEM
    ): AssociateSecurityKeyRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Key" -> Key.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateSecurityKeyRequest]
    }
  }

  @js.native
  trait AssociateSecurityKeyResponse extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
  }

  object AssociateSecurityKeyResponse {
    @inline
    def apply(
        AssociationId: js.UndefOr[AssociationId] = js.undefined
    ): AssociateSecurityKeyResponse = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateSecurityKeyResponse]
    }
  }

  /** A toggle for an individual feature at the instance level.
    */
  @js.native
  trait Attribute extends js.Object {
    var AttributeType: js.UndefOr[InstanceAttributeType]
    var Value: js.UndefOr[InstanceAttributeValue]
  }

  object Attribute {
    @inline
    def apply(
        AttributeType: js.UndefOr[InstanceAttributeType] = js.undefined,
        Value: js.UndefOr[InstanceAttributeValue] = js.undefined
    ): Attribute = {
      val __obj = js.Dynamic.literal()
      AttributeType.foreach(__v => __obj.updateDynamic("AttributeType")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attribute]
    }
  }

  /** A chat message.
    */
  @js.native
  trait ChatMessage extends js.Object {
    var Content: ChatContent
    var ContentType: ChatContentType
  }

  object ChatMessage {
    @inline
    def apply(
        Content: ChatContent,
        ContentType: ChatContentType
    ): ChatMessage = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "ContentType" -> ContentType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ChatMessage]
    }
  }

  /** Contains information about a contact flow.
    */
  @js.native
  trait ContactFlow extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Content: js.UndefOr[ContactFlowContent]
    var Description: js.UndefOr[ContactFlowDescription]
    var Id: js.UndefOr[ContactFlowId]
    var Name: js.UndefOr[ContactFlowName]
    var Tags: js.UndefOr[TagMap]
    var Type: js.UndefOr[ContactFlowType]
  }

  object ContactFlow {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Content: js.UndefOr[ContactFlowContent] = js.undefined,
        Description: js.UndefOr[ContactFlowDescription] = js.undefined,
        Id: js.UndefOr[ContactFlowId] = js.undefined,
        Name: js.UndefOr[ContactFlowName] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Type: js.UndefOr[ContactFlowType] = js.undefined
    ): ContactFlow = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactFlow]
    }
  }

  /** Contains summary information about a contact flow. You can also create and update contact flows using the [[https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html|Amazon Connect Flow language]].
    */
  @js.native
  trait ContactFlowSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var ContactFlowType: js.UndefOr[ContactFlowType]
    var Id: js.UndefOr[ContactFlowId]
    var Name: js.UndefOr[ContactFlowName]
  }

  object ContactFlowSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        ContactFlowType: js.UndefOr[ContactFlowType] = js.undefined,
        Id: js.UndefOr[ContactFlowId] = js.undefined,
        Name: js.UndefOr[ContactFlowName] = js.undefined
    ): ContactFlowSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ContactFlowType.foreach(__v => __obj.updateDynamic("ContactFlowType")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactFlowSummary]
    }
  }

  @js.native
  trait CreateContactFlowRequest extends js.Object {
    var Content: ContactFlowContent
    var InstanceId: InstanceId
    var Name: ContactFlowName
    var Type: ContactFlowType
    var Description: js.UndefOr[ContactFlowDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateContactFlowRequest {
    @inline
    def apply(
        Content: ContactFlowContent,
        InstanceId: InstanceId,
        Name: ContactFlowName,
        Type: ContactFlowType,
        Description: js.UndefOr[ContactFlowDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateContactFlowRequest = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContactFlowRequest]
    }
  }

  @js.native
  trait CreateContactFlowResponse extends js.Object {
    var ContactFlowArn: js.UndefOr[ARN]
    var ContactFlowId: js.UndefOr[ContactFlowId]
  }

  object CreateContactFlowResponse {
    @inline
    def apply(
        ContactFlowArn: js.UndefOr[ARN] = js.undefined,
        ContactFlowId: js.UndefOr[ContactFlowId] = js.undefined
    ): CreateContactFlowResponse = {
      val __obj = js.Dynamic.literal()
      ContactFlowArn.foreach(__v => __obj.updateDynamic("ContactFlowArn")(__v.asInstanceOf[js.Any]))
      ContactFlowId.foreach(__v => __obj.updateDynamic("ContactFlowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContactFlowResponse]
    }
  }

  @js.native
  trait CreateInstanceRequest extends js.Object {
    var IdentityManagementType: DirectoryType
    var InboundCallsEnabled: InboundCallsEnabled
    var OutboundCallsEnabled: OutboundCallsEnabled
    var ClientToken: js.UndefOr[ClientToken]
    var DirectoryId: js.UndefOr[DirectoryId]
    var InstanceAlias: js.UndefOr[DirectoryAlias]
  }

  object CreateInstanceRequest {
    @inline
    def apply(
        IdentityManagementType: DirectoryType,
        InboundCallsEnabled: InboundCallsEnabled,
        OutboundCallsEnabled: OutboundCallsEnabled,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        InstanceAlias: js.UndefOr[DirectoryAlias] = js.undefined
    ): CreateInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityManagementType" -> IdentityManagementType.asInstanceOf[js.Any],
        "InboundCallsEnabled" -> InboundCallsEnabled.asInstanceOf[js.Any],
        "OutboundCallsEnabled" -> OutboundCallsEnabled.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      InstanceAlias.foreach(__v => __obj.updateDynamic("InstanceAlias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstanceRequest]
    }
  }

  @js.native
  trait CreateInstanceResponse extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[InstanceId]
  }

  object CreateInstanceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[InstanceId] = js.undefined
    ): CreateInstanceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstanceResponse]
    }
  }

  @js.native
  trait CreateIntegrationAssociationRequest extends js.Object {
    var InstanceId: InstanceId
    var IntegrationArn: ARN
    var IntegrationType: IntegrationType
    var SourceApplicationName: SourceApplicationName
    var SourceApplicationUrl: URI
    var SourceType: SourceType
  }

  object CreateIntegrationAssociationRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        IntegrationArn: ARN,
        IntegrationType: IntegrationType,
        SourceApplicationName: SourceApplicationName,
        SourceApplicationUrl: URI,
        SourceType: SourceType
    ): CreateIntegrationAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "IntegrationArn" -> IntegrationArn.asInstanceOf[js.Any],
        "IntegrationType" -> IntegrationType.asInstanceOf[js.Any],
        "SourceApplicationName" -> SourceApplicationName.asInstanceOf[js.Any],
        "SourceApplicationUrl" -> SourceApplicationUrl.asInstanceOf[js.Any],
        "SourceType" -> SourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateIntegrationAssociationRequest]
    }
  }

  @js.native
  trait CreateIntegrationAssociationResponse extends js.Object {
    var IntegrationAssociationArn: js.UndefOr[ARN]
    var IntegrationAssociationId: js.UndefOr[IntegrationAssociationId]
  }

  object CreateIntegrationAssociationResponse {
    @inline
    def apply(
        IntegrationAssociationArn: js.UndefOr[ARN] = js.undefined,
        IntegrationAssociationId: js.UndefOr[IntegrationAssociationId] = js.undefined
    ): CreateIntegrationAssociationResponse = {
      val __obj = js.Dynamic.literal()
      IntegrationAssociationArn.foreach(__v => __obj.updateDynamic("IntegrationAssociationArn")(__v.asInstanceOf[js.Any]))
      IntegrationAssociationId.foreach(__v => __obj.updateDynamic("IntegrationAssociationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIntegrationAssociationResponse]
    }
  }

  @js.native
  trait CreateQueueRequest extends js.Object {
    var HoursOfOperationId: HoursOfOperationId
    var InstanceId: InstanceId
    var Name: CommonNameLength127
    var Description: js.UndefOr[QueueDescription]
    var MaxContacts: js.UndefOr[QueueMaxContacts]
    var OutboundCallerConfig: js.UndefOr[OutboundCallerConfig]
    var QuickConnectIds: js.UndefOr[QuickConnectsList]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateQueueRequest {
    @inline
    def apply(
        HoursOfOperationId: HoursOfOperationId,
        InstanceId: InstanceId,
        Name: CommonNameLength127,
        Description: js.UndefOr[QueueDescription] = js.undefined,
        MaxContacts: js.UndefOr[QueueMaxContacts] = js.undefined,
        OutboundCallerConfig: js.UndefOr[OutboundCallerConfig] = js.undefined,
        QuickConnectIds: js.UndefOr[QuickConnectsList] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateQueueRequest = {
      val __obj = js.Dynamic.literal(
        "HoursOfOperationId" -> HoursOfOperationId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MaxContacts.foreach(__v => __obj.updateDynamic("MaxContacts")(__v.asInstanceOf[js.Any]))
      OutboundCallerConfig.foreach(__v => __obj.updateDynamic("OutboundCallerConfig")(__v.asInstanceOf[js.Any]))
      QuickConnectIds.foreach(__v => __obj.updateDynamic("QuickConnectIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQueueRequest]
    }
  }

  @js.native
  trait CreateQueueResponse extends js.Object {
    var QueueArn: js.UndefOr[ARN]
    var QueueId: js.UndefOr[QueueId]
  }

  object CreateQueueResponse {
    @inline
    def apply(
        QueueArn: js.UndefOr[ARN] = js.undefined,
        QueueId: js.UndefOr[QueueId] = js.undefined
    ): CreateQueueResponse = {
      val __obj = js.Dynamic.literal()
      QueueArn.foreach(__v => __obj.updateDynamic("QueueArn")(__v.asInstanceOf[js.Any]))
      QueueId.foreach(__v => __obj.updateDynamic("QueueId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQueueResponse]
    }
  }

  @js.native
  trait CreateQuickConnectRequest extends js.Object {
    var InstanceId: InstanceId
    var Name: QuickConnectName
    var QuickConnectConfig: QuickConnectConfig
    var Description: js.UndefOr[QuickConnectDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateQuickConnectRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        Name: QuickConnectName,
        QuickConnectConfig: QuickConnectConfig,
        Description: js.UndefOr[QuickConnectDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateQuickConnectRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "QuickConnectConfig" -> QuickConnectConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQuickConnectRequest]
    }
  }

  @js.native
  trait CreateQuickConnectResponse extends js.Object {
    var QuickConnectARN: js.UndefOr[ARN]
    var QuickConnectId: js.UndefOr[QuickConnectId]
  }

  object CreateQuickConnectResponse {
    @inline
    def apply(
        QuickConnectARN: js.UndefOr[ARN] = js.undefined,
        QuickConnectId: js.UndefOr[QuickConnectId] = js.undefined
    ): CreateQuickConnectResponse = {
      val __obj = js.Dynamic.literal()
      QuickConnectARN.foreach(__v => __obj.updateDynamic("QuickConnectARN")(__v.asInstanceOf[js.Any]))
      QuickConnectId.foreach(__v => __obj.updateDynamic("QuickConnectId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQuickConnectResponse]
    }
  }

  @js.native
  trait CreateRoutingProfileRequest extends js.Object {
    var DefaultOutboundQueueId: QueueId
    var Description: RoutingProfileDescription
    var InstanceId: InstanceId
    var MediaConcurrencies: MediaConcurrencies
    var Name: RoutingProfileName
    var QueueConfigs: js.UndefOr[RoutingProfileQueueConfigList]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateRoutingProfileRequest {
    @inline
    def apply(
        DefaultOutboundQueueId: QueueId,
        Description: RoutingProfileDescription,
        InstanceId: InstanceId,
        MediaConcurrencies: MediaConcurrencies,
        Name: RoutingProfileName,
        QueueConfigs: js.UndefOr[RoutingProfileQueueConfigList] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateRoutingProfileRequest = {
      val __obj = js.Dynamic.literal(
        "DefaultOutboundQueueId" -> DefaultOutboundQueueId.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "MediaConcurrencies" -> MediaConcurrencies.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      QueueConfigs.foreach(__v => __obj.updateDynamic("QueueConfigs")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoutingProfileRequest]
    }
  }

  @js.native
  trait CreateRoutingProfileResponse extends js.Object {
    var RoutingProfileArn: js.UndefOr[ARN]
    var RoutingProfileId: js.UndefOr[RoutingProfileId]
  }

  object CreateRoutingProfileResponse {
    @inline
    def apply(
        RoutingProfileArn: js.UndefOr[ARN] = js.undefined,
        RoutingProfileId: js.UndefOr[RoutingProfileId] = js.undefined
    ): CreateRoutingProfileResponse = {
      val __obj = js.Dynamic.literal()
      RoutingProfileArn.foreach(__v => __obj.updateDynamic("RoutingProfileArn")(__v.asInstanceOf[js.Any]))
      RoutingProfileId.foreach(__v => __obj.updateDynamic("RoutingProfileId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoutingProfileResponse]
    }
  }

  @js.native
  trait CreateUseCaseRequest extends js.Object {
    var InstanceId: InstanceId
    var IntegrationAssociationId: IntegrationAssociationId
    var UseCaseType: UseCaseType
  }

  object CreateUseCaseRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        IntegrationAssociationId: IntegrationAssociationId,
        UseCaseType: UseCaseType
    ): CreateUseCaseRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "IntegrationAssociationId" -> IntegrationAssociationId.asInstanceOf[js.Any],
        "UseCaseType" -> UseCaseType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateUseCaseRequest]
    }
  }

  @js.native
  trait CreateUseCaseResponse extends js.Object {
    var UseCaseArn: js.UndefOr[ARN]
    var UseCaseId: js.UndefOr[UseCaseId]
  }

  object CreateUseCaseResponse {
    @inline
    def apply(
        UseCaseArn: js.UndefOr[ARN] = js.undefined,
        UseCaseId: js.UndefOr[UseCaseId] = js.undefined
    ): CreateUseCaseResponse = {
      val __obj = js.Dynamic.literal()
      UseCaseArn.foreach(__v => __obj.updateDynamic("UseCaseArn")(__v.asInstanceOf[js.Any]))
      UseCaseId.foreach(__v => __obj.updateDynamic("UseCaseId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUseCaseResponse]
    }
  }

  @js.native
  trait CreateUserHierarchyGroupRequest extends js.Object {
    var InstanceId: InstanceId
    var Name: HierarchyGroupName
    var ParentGroupId: js.UndefOr[HierarchyGroupId]
  }

  object CreateUserHierarchyGroupRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        Name: HierarchyGroupName,
        ParentGroupId: js.UndefOr[HierarchyGroupId] = js.undefined
    ): CreateUserHierarchyGroupRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ParentGroupId.foreach(__v => __obj.updateDynamic("ParentGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserHierarchyGroupRequest]
    }
  }

  @js.native
  trait CreateUserHierarchyGroupResponse extends js.Object {
    var HierarchyGroupArn: js.UndefOr[ARN]
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
  }

  object CreateUserHierarchyGroupResponse {
    @inline
    def apply(
        HierarchyGroupArn: js.UndefOr[ARN] = js.undefined,
        HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined
    ): CreateUserHierarchyGroupResponse = {
      val __obj = js.Dynamic.literal()
      HierarchyGroupArn.foreach(__v => __obj.updateDynamic("HierarchyGroupArn")(__v.asInstanceOf[js.Any]))
      HierarchyGroupId.foreach(__v => __obj.updateDynamic("HierarchyGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserHierarchyGroupResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var InstanceId: InstanceId
    var PhoneConfig: UserPhoneConfig
    var RoutingProfileId: RoutingProfileId
    var SecurityProfileIds: SecurityProfileIds
    var Username: AgentUsername
    var DirectoryUserId: js.UndefOr[DirectoryUserId]
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
    var IdentityInfo: js.UndefOr[UserIdentityInfo]
    var Password: js.UndefOr[Password]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateUserRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        PhoneConfig: UserPhoneConfig,
        RoutingProfileId: RoutingProfileId,
        SecurityProfileIds: SecurityProfileIds,
        Username: AgentUsername,
        DirectoryUserId: js.UndefOr[DirectoryUserId] = js.undefined,
        HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined,
        IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined,
        Password: js.UndefOr[Password] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "PhoneConfig" -> PhoneConfig.asInstanceOf[js.Any],
        "RoutingProfileId" -> RoutingProfileId.asInstanceOf[js.Any],
        "SecurityProfileIds" -> SecurityProfileIds.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      DirectoryUserId.foreach(__v => __obj.updateDynamic("DirectoryUserId")(__v.asInstanceOf[js.Any]))
      HierarchyGroupId.foreach(__v => __obj.updateDynamic("HierarchyGroupId")(__v.asInstanceOf[js.Any]))
      IdentityInfo.foreach(__v => __obj.updateDynamic("IdentityInfo")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var UserArn: js.UndefOr[ARN]
    var UserId: js.UndefOr[UserId]
  }

  object CreateUserResponse {
    @inline
    def apply(
        UserArn: js.UndefOr[ARN] = js.undefined,
        UserId: js.UndefOr[UserId] = js.undefined
    ): CreateUserResponse = {
      val __obj = js.Dynamic.literal()
      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  /** Contains credentials to use for federation.
    */
  @js.native
  trait Credentials extends js.Object {
    var AccessToken: js.UndefOr[SecurityToken]
    var AccessTokenExpiration: js.UndefOr[timestamp]
    var RefreshToken: js.UndefOr[SecurityToken]
    var RefreshTokenExpiration: js.UndefOr[timestamp]
  }

  object Credentials {
    @inline
    def apply(
        AccessToken: js.UndefOr[SecurityToken] = js.undefined,
        AccessTokenExpiration: js.UndefOr[timestamp] = js.undefined,
        RefreshToken: js.UndefOr[SecurityToken] = js.undefined,
        RefreshTokenExpiration: js.UndefOr[timestamp] = js.undefined
    ): Credentials = {
      val __obj = js.Dynamic.literal()
      AccessToken.foreach(__v => __obj.updateDynamic("AccessToken")(__v.asInstanceOf[js.Any]))
      AccessTokenExpiration.foreach(__v => __obj.updateDynamic("AccessTokenExpiration")(__v.asInstanceOf[js.Any]))
      RefreshToken.foreach(__v => __obj.updateDynamic("RefreshToken")(__v.asInstanceOf[js.Any]))
      RefreshTokenExpiration.foreach(__v => __obj.updateDynamic("RefreshTokenExpiration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Credentials]
    }
  }

  /** Contains information about a real-time metric. For a description of each metric, see [[https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html|Real-time Metrics Definitions]] in the <i>Amazon Connect Administrator Guide</i>.
    */
  @js.native
  trait CurrentMetric extends js.Object {
    var Name: js.UndefOr[CurrentMetricName]
    var Unit: js.UndefOr[Unit]
  }

  object CurrentMetric {
    @inline
    def apply(
        Name: js.UndefOr[CurrentMetricName] = js.undefined,
        Unit: js.UndefOr[Unit] = js.undefined
    ): CurrentMetric = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentMetric]
    }
  }

  /** Contains the data for a real-time metric.
    */
  @js.native
  trait CurrentMetricData extends js.Object {
    var Metric: js.UndefOr[CurrentMetric]
    var Value: js.UndefOr[Value]
  }

  object CurrentMetricData {
    @inline
    def apply(
        Metric: js.UndefOr[CurrentMetric] = js.undefined,
        Value: js.UndefOr[Value] = js.undefined
    ): CurrentMetricData = {
      val __obj = js.Dynamic.literal()
      Metric.foreach(__v => __obj.updateDynamic("Metric")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentMetricData]
    }
  }

  /** Contains information about a set of real-time metrics.
    */
  @js.native
  trait CurrentMetricResult extends js.Object {
    var Collections: js.UndefOr[CurrentMetricDataCollections]
    var Dimensions: js.UndefOr[Dimensions]
  }

  object CurrentMetricResult {
    @inline
    def apply(
        Collections: js.UndefOr[CurrentMetricDataCollections] = js.undefined,
        Dimensions: js.UndefOr[Dimensions] = js.undefined
    ): CurrentMetricResult = {
      val __obj = js.Dynamic.literal()
      Collections.foreach(__v => __obj.updateDynamic("Collections")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentMetricResult]
    }
  }

  @js.native
  trait DeleteInstanceRequest extends js.Object {
    var InstanceId: InstanceId
  }

  object DeleteInstanceRequest {
    @inline
    def apply(
        InstanceId: InstanceId
    ): DeleteInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteInstanceRequest]
    }
  }

  @js.native
  trait DeleteIntegrationAssociationRequest extends js.Object {
    var InstanceId: InstanceId
    var IntegrationAssociationId: IntegrationAssociationId
  }

  object DeleteIntegrationAssociationRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        IntegrationAssociationId: IntegrationAssociationId
    ): DeleteIntegrationAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "IntegrationAssociationId" -> IntegrationAssociationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIntegrationAssociationRequest]
    }
  }

  @js.native
  trait DeleteQuickConnectRequest extends js.Object {
    var InstanceId: InstanceId
    var QuickConnectId: QuickConnectId
  }

  object DeleteQuickConnectRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QuickConnectId: QuickConnectId
    ): DeleteQuickConnectRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QuickConnectId" -> QuickConnectId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteQuickConnectRequest]
    }
  }

  @js.native
  trait DeleteUseCaseRequest extends js.Object {
    var InstanceId: InstanceId
    var IntegrationAssociationId: IntegrationAssociationId
    var UseCaseId: UseCaseId
  }

  object DeleteUseCaseRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        IntegrationAssociationId: IntegrationAssociationId,
        UseCaseId: UseCaseId
    ): DeleteUseCaseRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "IntegrationAssociationId" -> IntegrationAssociationId.asInstanceOf[js.Any],
        "UseCaseId" -> UseCaseId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUseCaseRequest]
    }
  }

  @js.native
  trait DeleteUserHierarchyGroupRequest extends js.Object {
    var HierarchyGroupId: HierarchyGroupId
    var InstanceId: InstanceId
  }

  object DeleteUserHierarchyGroupRequest {
    @inline
    def apply(
        HierarchyGroupId: HierarchyGroupId,
        InstanceId: InstanceId
    ): DeleteUserHierarchyGroupRequest = {
      val __obj = js.Dynamic.literal(
        "HierarchyGroupId" -> HierarchyGroupId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserHierarchyGroupRequest]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var InstanceId: InstanceId
    var UserId: UserId
  }

  object DeleteUserRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        UserId: UserId
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DescribeContactFlowRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var InstanceId: InstanceId
  }

  object DescribeContactFlowRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        InstanceId: InstanceId
    ): DescribeContactFlowRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeContactFlowRequest]
    }
  }

  @js.native
  trait DescribeContactFlowResponse extends js.Object {
    var ContactFlow: js.UndefOr[ContactFlow]
  }

  object DescribeContactFlowResponse {
    @inline
    def apply(
        ContactFlow: js.UndefOr[ContactFlow] = js.undefined
    ): DescribeContactFlowResponse = {
      val __obj = js.Dynamic.literal()
      ContactFlow.foreach(__v => __obj.updateDynamic("ContactFlow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContactFlowResponse]
    }
  }

  @js.native
  trait DescribeHoursOfOperationRequest extends js.Object {
    var HoursOfOperationId: HoursOfOperationId
    var InstanceId: InstanceId
  }

  object DescribeHoursOfOperationRequest {
    @inline
    def apply(
        HoursOfOperationId: HoursOfOperationId,
        InstanceId: InstanceId
    ): DescribeHoursOfOperationRequest = {
      val __obj = js.Dynamic.literal(
        "HoursOfOperationId" -> HoursOfOperationId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeHoursOfOperationRequest]
    }
  }

  @js.native
  trait DescribeHoursOfOperationResponse extends js.Object {
    var HoursOfOperation: js.UndefOr[HoursOfOperation]
  }

  object DescribeHoursOfOperationResponse {
    @inline
    def apply(
        HoursOfOperation: js.UndefOr[HoursOfOperation] = js.undefined
    ): DescribeHoursOfOperationResponse = {
      val __obj = js.Dynamic.literal()
      HoursOfOperation.foreach(__v => __obj.updateDynamic("HoursOfOperation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHoursOfOperationResponse]
    }
  }

  @js.native
  trait DescribeInstanceAttributeRequest extends js.Object {
    var AttributeType: InstanceAttributeType
    var InstanceId: InstanceId
  }

  object DescribeInstanceAttributeRequest {
    @inline
    def apply(
        AttributeType: InstanceAttributeType,
        InstanceId: InstanceId
    ): DescribeInstanceAttributeRequest = {
      val __obj = js.Dynamic.literal(
        "AttributeType" -> AttributeType.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeInstanceAttributeRequest]
    }
  }

  @js.native
  trait DescribeInstanceAttributeResponse extends js.Object {
    var Attribute: js.UndefOr[Attribute]
  }

  object DescribeInstanceAttributeResponse {
    @inline
    def apply(
        Attribute: js.UndefOr[Attribute] = js.undefined
    ): DescribeInstanceAttributeResponse = {
      val __obj = js.Dynamic.literal()
      Attribute.foreach(__v => __obj.updateDynamic("Attribute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceAttributeResponse]
    }
  }

  @js.native
  trait DescribeInstanceRequest extends js.Object {
    var InstanceId: InstanceId
  }

  object DescribeInstanceRequest {
    @inline
    def apply(
        InstanceId: InstanceId
    ): DescribeInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeInstanceRequest]
    }
  }

  @js.native
  trait DescribeInstanceResponse extends js.Object {
    var Instance: js.UndefOr[Instance]
  }

  object DescribeInstanceResponse {
    @inline
    def apply(
        Instance: js.UndefOr[Instance] = js.undefined
    ): DescribeInstanceResponse = {
      val __obj = js.Dynamic.literal()
      Instance.foreach(__v => __obj.updateDynamic("Instance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceResponse]
    }
  }

  @js.native
  trait DescribeInstanceStorageConfigRequest extends js.Object {
    var AssociationId: AssociationId
    var InstanceId: InstanceId
    var ResourceType: InstanceStorageResourceType
  }

  object DescribeInstanceStorageConfigRequest {
    @inline
    def apply(
        AssociationId: AssociationId,
        InstanceId: InstanceId,
        ResourceType: InstanceStorageResourceType
    ): DescribeInstanceStorageConfigRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeInstanceStorageConfigRequest]
    }
  }

  @js.native
  trait DescribeInstanceStorageConfigResponse extends js.Object {
    var StorageConfig: js.UndefOr[InstanceStorageConfig]
  }

  object DescribeInstanceStorageConfigResponse {
    @inline
    def apply(
        StorageConfig: js.UndefOr[InstanceStorageConfig] = js.undefined
    ): DescribeInstanceStorageConfigResponse = {
      val __obj = js.Dynamic.literal()
      StorageConfig.foreach(__v => __obj.updateDynamic("StorageConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceStorageConfigResponse]
    }
  }

  @js.native
  trait DescribeQueueRequest extends js.Object {
    var InstanceId: InstanceId
    var QueueId: QueueId
  }

  object DescribeQueueRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QueueId: QueueId
    ): DescribeQueueRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeQueueRequest]
    }
  }

  @js.native
  trait DescribeQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  object DescribeQueueResponse {
    @inline
    def apply(
        Queue: js.UndefOr[Queue] = js.undefined
    ): DescribeQueueResponse = {
      val __obj = js.Dynamic.literal()
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeQueueResponse]
    }
  }

  @js.native
  trait DescribeQuickConnectRequest extends js.Object {
    var InstanceId: InstanceId
    var QuickConnectId: QuickConnectId
  }

  object DescribeQuickConnectRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QuickConnectId: QuickConnectId
    ): DescribeQuickConnectRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QuickConnectId" -> QuickConnectId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeQuickConnectRequest]
    }
  }

  @js.native
  trait DescribeQuickConnectResponse extends js.Object {
    var QuickConnect: js.UndefOr[QuickConnect]
  }

  object DescribeQuickConnectResponse {
    @inline
    def apply(
        QuickConnect: js.UndefOr[QuickConnect] = js.undefined
    ): DescribeQuickConnectResponse = {
      val __obj = js.Dynamic.literal()
      QuickConnect.foreach(__v => __obj.updateDynamic("QuickConnect")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeQuickConnectResponse]
    }
  }

  @js.native
  trait DescribeRoutingProfileRequest extends js.Object {
    var InstanceId: InstanceId
    var RoutingProfileId: RoutingProfileId
  }

  object DescribeRoutingProfileRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        RoutingProfileId: RoutingProfileId
    ): DescribeRoutingProfileRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "RoutingProfileId" -> RoutingProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRoutingProfileRequest]
    }
  }

  @js.native
  trait DescribeRoutingProfileResponse extends js.Object {
    var RoutingProfile: js.UndefOr[RoutingProfile]
  }

  object DescribeRoutingProfileResponse {
    @inline
    def apply(
        RoutingProfile: js.UndefOr[RoutingProfile] = js.undefined
    ): DescribeRoutingProfileResponse = {
      val __obj = js.Dynamic.literal()
      RoutingProfile.foreach(__v => __obj.updateDynamic("RoutingProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRoutingProfileResponse]
    }
  }

  @js.native
  trait DescribeUserHierarchyGroupRequest extends js.Object {
    var HierarchyGroupId: HierarchyGroupId
    var InstanceId: InstanceId
  }

  object DescribeUserHierarchyGroupRequest {
    @inline
    def apply(
        HierarchyGroupId: HierarchyGroupId,
        InstanceId: InstanceId
    ): DescribeUserHierarchyGroupRequest = {
      val __obj = js.Dynamic.literal(
        "HierarchyGroupId" -> HierarchyGroupId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserHierarchyGroupRequest]
    }
  }

  @js.native
  trait DescribeUserHierarchyGroupResponse extends js.Object {
    var HierarchyGroup: js.UndefOr[HierarchyGroup]
  }

  object DescribeUserHierarchyGroupResponse {
    @inline
    def apply(
        HierarchyGroup: js.UndefOr[HierarchyGroup] = js.undefined
    ): DescribeUserHierarchyGroupResponse = {
      val __obj = js.Dynamic.literal()
      HierarchyGroup.foreach(__v => __obj.updateDynamic("HierarchyGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserHierarchyGroupResponse]
    }
  }

  @js.native
  trait DescribeUserHierarchyStructureRequest extends js.Object {
    var InstanceId: InstanceId
  }

  object DescribeUserHierarchyStructureRequest {
    @inline
    def apply(
        InstanceId: InstanceId
    ): DescribeUserHierarchyStructureRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserHierarchyStructureRequest]
    }
  }

  @js.native
  trait DescribeUserHierarchyStructureResponse extends js.Object {
    var HierarchyStructure: js.UndefOr[HierarchyStructure]
  }

  object DescribeUserHierarchyStructureResponse {
    @inline
    def apply(
        HierarchyStructure: js.UndefOr[HierarchyStructure] = js.undefined
    ): DescribeUserHierarchyStructureResponse = {
      val __obj = js.Dynamic.literal()
      HierarchyStructure.foreach(__v => __obj.updateDynamic("HierarchyStructure")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserHierarchyStructureResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var InstanceId: InstanceId
    var UserId: UserId
  }

  object DescribeUserRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        UserId: UserId
    ): DescribeUserRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object DescribeUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): DescribeUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserResponse]
    }
  }

  /** Contains information about the dimensions for a set of metrics.
    */
  @js.native
  trait Dimensions extends js.Object {
    var Channel: js.UndefOr[Channel]
    var Queue: js.UndefOr[QueueReference]
  }

  object Dimensions {
    @inline
    def apply(
        Channel: js.UndefOr[Channel] = js.undefined,
        Queue: js.UndefOr[QueueReference] = js.undefined
    ): Dimensions = {
      val __obj = js.Dynamic.literal()
      Channel.foreach(__v => __obj.updateDynamic("Channel")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Dimensions]
    }
  }

  @js.native
  trait DisassociateApprovedOriginRequest extends js.Object {
    var InstanceId: InstanceId
    var Origin: Origin
  }

  object DisassociateApprovedOriginRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        Origin: Origin
    ): DisassociateApprovedOriginRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Origin" -> Origin.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateApprovedOriginRequest]
    }
  }

  @js.native
  trait DisassociateInstanceStorageConfigRequest extends js.Object {
    var AssociationId: AssociationId
    var InstanceId: InstanceId
    var ResourceType: InstanceStorageResourceType
  }

  object DisassociateInstanceStorageConfigRequest {
    @inline
    def apply(
        AssociationId: AssociationId,
        InstanceId: InstanceId,
        ResourceType: InstanceStorageResourceType
    ): DisassociateInstanceStorageConfigRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateInstanceStorageConfigRequest]
    }
  }

  @js.native
  trait DisassociateLambdaFunctionRequest extends js.Object {
    var FunctionArn: FunctionArn
    var InstanceId: InstanceId
  }

  object DisassociateLambdaFunctionRequest {
    @inline
    def apply(
        FunctionArn: FunctionArn,
        InstanceId: InstanceId
    ): DisassociateLambdaFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionArn" -> FunctionArn.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateLambdaFunctionRequest]
    }
  }

  @js.native
  trait DisassociateLexBotRequest extends js.Object {
    var BotName: BotName
    var InstanceId: InstanceId
    var LexRegion: LexRegion
  }

  object DisassociateLexBotRequest {
    @inline
    def apply(
        BotName: BotName,
        InstanceId: InstanceId,
        LexRegion: LexRegion
    ): DisassociateLexBotRequest = {
      val __obj = js.Dynamic.literal(
        "BotName" -> BotName.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "LexRegion" -> LexRegion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateLexBotRequest]
    }
  }

  @js.native
  trait DisassociateQueueQuickConnectsRequest extends js.Object {
    var InstanceId: InstanceId
    var QueueId: QueueId
    var QuickConnectIds: QuickConnectsList
  }

  object DisassociateQueueQuickConnectsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QueueId: QueueId,
        QuickConnectIds: QuickConnectsList
    ): DisassociateQueueQuickConnectsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any],
        "QuickConnectIds" -> QuickConnectIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateQueueQuickConnectsRequest]
    }
  }

  @js.native
  trait DisassociateRoutingProfileQueuesRequest extends js.Object {
    var InstanceId: InstanceId
    var QueueReferences: RoutingProfileQueueReferenceList
    var RoutingProfileId: RoutingProfileId
  }

  object DisassociateRoutingProfileQueuesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QueueReferences: RoutingProfileQueueReferenceList,
        RoutingProfileId: RoutingProfileId
    ): DisassociateRoutingProfileQueuesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QueueReferences" -> QueueReferences.asInstanceOf[js.Any],
        "RoutingProfileId" -> RoutingProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateRoutingProfileQueuesRequest]
    }
  }

  @js.native
  trait DisassociateSecurityKeyRequest extends js.Object {
    var AssociationId: AssociationId
    var InstanceId: InstanceId
  }

  object DisassociateSecurityKeyRequest {
    @inline
    def apply(
        AssociationId: AssociationId,
        InstanceId: InstanceId
    ): DisassociateSecurityKeyRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateSecurityKeyRequest]
    }
  }

  /** The encryption configuration.
    */
  @js.native
  trait EncryptionConfig extends js.Object {
    var EncryptionType: EncryptionType
    var KeyId: KeyId
  }

  object EncryptionConfig {
    @inline
    def apply(
        EncryptionType: EncryptionType,
        KeyId: KeyId
    ): EncryptionConfig = {
      val __obj = js.Dynamic.literal(
        "EncryptionType" -> EncryptionType.asInstanceOf[js.Any],
        "KeyId" -> KeyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EncryptionConfig]
    }
  }

  /** Contains the filter to apply when retrieving metrics.
    */
  @js.native
  trait Filters extends js.Object {
    var Channels: js.UndefOr[Channels]
    var Queues: js.UndefOr[Queues]
  }

  object Filters {
    @inline
    def apply(
        Channels: js.UndefOr[Channels] = js.undefined,
        Queues: js.UndefOr[Queues] = js.undefined
    ): Filters = {
      val __obj = js.Dynamic.literal()
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      Queues.foreach(__v => __obj.updateDynamic("Queues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filters]
    }
  }

  @js.native
  trait GetContactAttributesRequest extends js.Object {
    var InitialContactId: ContactId
    var InstanceId: InstanceId
  }

  object GetContactAttributesRequest {
    @inline
    def apply(
        InitialContactId: ContactId,
        InstanceId: InstanceId
    ): GetContactAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "InitialContactId" -> InitialContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetContactAttributesRequest]
    }
  }

  @js.native
  trait GetContactAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[Attributes]
  }

  object GetContactAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[Attributes] = js.undefined
    ): GetContactAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactAttributesResponse]
    }
  }

  @js.native
  trait GetCurrentMetricDataRequest extends js.Object {
    var CurrentMetrics: CurrentMetrics
    var Filters: Filters
    var InstanceId: InstanceId
    var Groupings: js.UndefOr[Groupings]
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCurrentMetricDataRequest {
    @inline
    def apply(
        CurrentMetrics: CurrentMetrics,
        Filters: Filters,
        InstanceId: InstanceId,
        Groupings: js.UndefOr[Groupings] = js.undefined,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCurrentMetricDataRequest = {
      val __obj = js.Dynamic.literal(
        "CurrentMetrics" -> CurrentMetrics.asInstanceOf[js.Any],
        "Filters" -> Filters.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      Groupings.foreach(__v => __obj.updateDynamic("Groupings")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCurrentMetricDataRequest]
    }
  }

  @js.native
  trait GetCurrentMetricDataResponse extends js.Object {
    var DataSnapshotTime: js.UndefOr[timestamp]
    var MetricResults: js.UndefOr[CurrentMetricResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCurrentMetricDataResponse {
    @inline
    def apply(
        DataSnapshotTime: js.UndefOr[timestamp] = js.undefined,
        MetricResults: js.UndefOr[CurrentMetricResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCurrentMetricDataResponse = {
      val __obj = js.Dynamic.literal()
      DataSnapshotTime.foreach(__v => __obj.updateDynamic("DataSnapshotTime")(__v.asInstanceOf[js.Any]))
      MetricResults.foreach(__v => __obj.updateDynamic("MetricResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCurrentMetricDataResponse]
    }
  }

  @js.native
  trait GetFederationTokenRequest extends js.Object {
    var InstanceId: InstanceId
  }

  object GetFederationTokenRequest {
    @inline
    def apply(
        InstanceId: InstanceId
    ): GetFederationTokenRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFederationTokenRequest]
    }
  }

  @js.native
  trait GetFederationTokenResponse extends js.Object {
    var Credentials: js.UndefOr[Credentials]
  }

  object GetFederationTokenResponse {
    @inline
    def apply(
        Credentials: js.UndefOr[Credentials] = js.undefined
    ): GetFederationTokenResponse = {
      val __obj = js.Dynamic.literal()
      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFederationTokenResponse]
    }
  }

  @js.native
  trait GetMetricDataRequest extends js.Object {
    var EndTime: timestamp
    var Filters: Filters
    var HistoricalMetrics: HistoricalMetrics
    var InstanceId: InstanceId
    var StartTime: timestamp
    var Groupings: js.UndefOr[Groupings]
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetMetricDataRequest {
    @inline
    def apply(
        EndTime: timestamp,
        Filters: Filters,
        HistoricalMetrics: HistoricalMetrics,
        InstanceId: InstanceId,
        StartTime: timestamp,
        Groupings: js.UndefOr[Groupings] = js.undefined,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetMetricDataRequest = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "Filters" -> Filters.asInstanceOf[js.Any],
        "HistoricalMetrics" -> HistoricalMetrics.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      Groupings.foreach(__v => __obj.updateDynamic("Groupings")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricDataRequest]
    }
  }

  @js.native
  trait GetMetricDataResponse extends js.Object {
    var MetricResults: js.UndefOr[HistoricalMetricResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetMetricDataResponse {
    @inline
    def apply(
        MetricResults: js.UndefOr[HistoricalMetricResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetMetricDataResponse = {
      val __obj = js.Dynamic.literal()
      MetricResults.foreach(__v => __obj.updateDynamic("MetricResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricDataResponse]
    }
  }

  /** Contains information about a hierarchy group.
    */
  @js.native
  trait HierarchyGroup extends js.Object {
    var Arn: js.UndefOr[ARN]
    var HierarchyPath: js.UndefOr[HierarchyPath]
    var Id: js.UndefOr[HierarchyGroupId]
    var LevelId: js.UndefOr[HierarchyLevelId]
    var Name: js.UndefOr[HierarchyGroupName]
  }

  object HierarchyGroup {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        HierarchyPath: js.UndefOr[HierarchyPath] = js.undefined,
        Id: js.UndefOr[HierarchyGroupId] = js.undefined,
        LevelId: js.UndefOr[HierarchyLevelId] = js.undefined,
        Name: js.UndefOr[HierarchyGroupName] = js.undefined
    ): HierarchyGroup = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      HierarchyPath.foreach(__v => __obj.updateDynamic("HierarchyPath")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LevelId.foreach(__v => __obj.updateDynamic("LevelId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyGroup]
    }
  }

  /** Contains summary information about a hierarchy group.
    */
  @js.native
  trait HierarchyGroupSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[HierarchyGroupId]
    var Name: js.UndefOr[HierarchyGroupName]
  }

  object HierarchyGroupSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[HierarchyGroupId] = js.undefined,
        Name: js.UndefOr[HierarchyGroupName] = js.undefined
    ): HierarchyGroupSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyGroupSummary]
    }
  }

  /** Contains information about a hierarchy level.
    */
  @js.native
  trait HierarchyLevel extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[HierarchyLevelId]
    var Name: js.UndefOr[HierarchyLevelName]
  }

  object HierarchyLevel {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[HierarchyLevelId] = js.undefined,
        Name: js.UndefOr[HierarchyLevelName] = js.undefined
    ): HierarchyLevel = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyLevel]
    }
  }

  /** Contains information about the hierarchy level to update.
    */
  @js.native
  trait HierarchyLevelUpdate extends js.Object {
    var Name: HierarchyLevelName
  }

  object HierarchyLevelUpdate {
    @inline
    def apply(
        Name: HierarchyLevelName
    ): HierarchyLevelUpdate = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HierarchyLevelUpdate]
    }
  }

  /** Contains information about the levels of a hierarchy group.
    */
  @js.native
  trait HierarchyPath extends js.Object {
    var LevelFive: js.UndefOr[HierarchyGroupSummary]
    var LevelFour: js.UndefOr[HierarchyGroupSummary]
    var LevelOne: js.UndefOr[HierarchyGroupSummary]
    var LevelThree: js.UndefOr[HierarchyGroupSummary]
    var LevelTwo: js.UndefOr[HierarchyGroupSummary]
  }

  object HierarchyPath {
    @inline
    def apply(
        LevelFive: js.UndefOr[HierarchyGroupSummary] = js.undefined,
        LevelFour: js.UndefOr[HierarchyGroupSummary] = js.undefined,
        LevelOne: js.UndefOr[HierarchyGroupSummary] = js.undefined,
        LevelThree: js.UndefOr[HierarchyGroupSummary] = js.undefined,
        LevelTwo: js.UndefOr[HierarchyGroupSummary] = js.undefined
    ): HierarchyPath = {
      val __obj = js.Dynamic.literal()
      LevelFive.foreach(__v => __obj.updateDynamic("LevelFive")(__v.asInstanceOf[js.Any]))
      LevelFour.foreach(__v => __obj.updateDynamic("LevelFour")(__v.asInstanceOf[js.Any]))
      LevelOne.foreach(__v => __obj.updateDynamic("LevelOne")(__v.asInstanceOf[js.Any]))
      LevelThree.foreach(__v => __obj.updateDynamic("LevelThree")(__v.asInstanceOf[js.Any]))
      LevelTwo.foreach(__v => __obj.updateDynamic("LevelTwo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyPath]
    }
  }

  /** Contains information about a hierarchy structure.
    */
  @js.native
  trait HierarchyStructure extends js.Object {
    var LevelFive: js.UndefOr[HierarchyLevel]
    var LevelFour: js.UndefOr[HierarchyLevel]
    var LevelOne: js.UndefOr[HierarchyLevel]
    var LevelThree: js.UndefOr[HierarchyLevel]
    var LevelTwo: js.UndefOr[HierarchyLevel]
  }

  object HierarchyStructure {
    @inline
    def apply(
        LevelFive: js.UndefOr[HierarchyLevel] = js.undefined,
        LevelFour: js.UndefOr[HierarchyLevel] = js.undefined,
        LevelOne: js.UndefOr[HierarchyLevel] = js.undefined,
        LevelThree: js.UndefOr[HierarchyLevel] = js.undefined,
        LevelTwo: js.UndefOr[HierarchyLevel] = js.undefined
    ): HierarchyStructure = {
      val __obj = js.Dynamic.literal()
      LevelFive.foreach(__v => __obj.updateDynamic("LevelFive")(__v.asInstanceOf[js.Any]))
      LevelFour.foreach(__v => __obj.updateDynamic("LevelFour")(__v.asInstanceOf[js.Any]))
      LevelOne.foreach(__v => __obj.updateDynamic("LevelOne")(__v.asInstanceOf[js.Any]))
      LevelThree.foreach(__v => __obj.updateDynamic("LevelThree")(__v.asInstanceOf[js.Any]))
      LevelTwo.foreach(__v => __obj.updateDynamic("LevelTwo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyStructure]
    }
  }

  /** Contains information about the level hierarchy to update.
    */
  @js.native
  trait HierarchyStructureUpdate extends js.Object {
    var LevelFive: js.UndefOr[HierarchyLevelUpdate]
    var LevelFour: js.UndefOr[HierarchyLevelUpdate]
    var LevelOne: js.UndefOr[HierarchyLevelUpdate]
    var LevelThree: js.UndefOr[HierarchyLevelUpdate]
    var LevelTwo: js.UndefOr[HierarchyLevelUpdate]
  }

  object HierarchyStructureUpdate {
    @inline
    def apply(
        LevelFive: js.UndefOr[HierarchyLevelUpdate] = js.undefined,
        LevelFour: js.UndefOr[HierarchyLevelUpdate] = js.undefined,
        LevelOne: js.UndefOr[HierarchyLevelUpdate] = js.undefined,
        LevelThree: js.UndefOr[HierarchyLevelUpdate] = js.undefined,
        LevelTwo: js.UndefOr[HierarchyLevelUpdate] = js.undefined
    ): HierarchyStructureUpdate = {
      val __obj = js.Dynamic.literal()
      LevelFive.foreach(__v => __obj.updateDynamic("LevelFive")(__v.asInstanceOf[js.Any]))
      LevelFour.foreach(__v => __obj.updateDynamic("LevelFour")(__v.asInstanceOf[js.Any]))
      LevelOne.foreach(__v => __obj.updateDynamic("LevelOne")(__v.asInstanceOf[js.Any]))
      LevelThree.foreach(__v => __obj.updateDynamic("LevelThree")(__v.asInstanceOf[js.Any]))
      LevelTwo.foreach(__v => __obj.updateDynamic("LevelTwo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyStructureUpdate]
    }
  }

  /** Contains information about a historical metric. For a description of each metric, see [[https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html|Historical Metrics Definitions]] in the <i>Amazon Connect Administrator Guide</i>.
    */
  @js.native
  trait HistoricalMetric extends js.Object {
    var Name: js.UndefOr[HistoricalMetricName]
    var Statistic: js.UndefOr[Statistic]
    var Threshold: js.UndefOr[Threshold]
    var Unit: js.UndefOr[Unit]
  }

  object HistoricalMetric {
    @inline
    def apply(
        Name: js.UndefOr[HistoricalMetricName] = js.undefined,
        Statistic: js.UndefOr[Statistic] = js.undefined,
        Threshold: js.UndefOr[Threshold] = js.undefined,
        Unit: js.UndefOr[Unit] = js.undefined
    ): HistoricalMetric = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Statistic.foreach(__v => __obj.updateDynamic("Statistic")(__v.asInstanceOf[js.Any]))
      Threshold.foreach(__v => __obj.updateDynamic("Threshold")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistoricalMetric]
    }
  }

  /** Contains the data for a historical metric.
    */
  @js.native
  trait HistoricalMetricData extends js.Object {
    var Metric: js.UndefOr[HistoricalMetric]
    var Value: js.UndefOr[Value]
  }

  object HistoricalMetricData {
    @inline
    def apply(
        Metric: js.UndefOr[HistoricalMetric] = js.undefined,
        Value: js.UndefOr[Value] = js.undefined
    ): HistoricalMetricData = {
      val __obj = js.Dynamic.literal()
      Metric.foreach(__v => __obj.updateDynamic("Metric")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistoricalMetricData]
    }
  }

  /** Contains information about the historical metrics retrieved.
    */
  @js.native
  trait HistoricalMetricResult extends js.Object {
    var Collections: js.UndefOr[HistoricalMetricDataCollections]
    var Dimensions: js.UndefOr[Dimensions]
  }

  object HistoricalMetricResult {
    @inline
    def apply(
        Collections: js.UndefOr[HistoricalMetricDataCollections] = js.undefined,
        Dimensions: js.UndefOr[Dimensions] = js.undefined
    ): HistoricalMetricResult = {
      val __obj = js.Dynamic.literal()
      Collections.foreach(__v => __obj.updateDynamic("Collections")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistoricalMetricResult]
    }
  }

  /** Information about of the hours of operation.
    */
  @js.native
  trait HoursOfOperation extends js.Object {
    var Config: js.UndefOr[HoursOfOperationConfigList]
    var Description: js.UndefOr[CommonDescriptionLength250]
    var HoursOfOperationArn: js.UndefOr[ARN]
    var HoursOfOperationId: js.UndefOr[HoursOfOperationId]
    var Name: js.UndefOr[CommonNameLength127]
    var Tags: js.UndefOr[TagMap]
    var TimeZone: js.UndefOr[TimeZone]
  }

  object HoursOfOperation {
    @inline
    def apply(
        Config: js.UndefOr[HoursOfOperationConfigList] = js.undefined,
        Description: js.UndefOr[CommonDescriptionLength250] = js.undefined,
        HoursOfOperationArn: js.UndefOr[ARN] = js.undefined,
        HoursOfOperationId: js.UndefOr[HoursOfOperationId] = js.undefined,
        Name: js.UndefOr[CommonNameLength127] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        TimeZone: js.UndefOr[TimeZone] = js.undefined
    ): HoursOfOperation = {
      val __obj = js.Dynamic.literal()
      Config.foreach(__v => __obj.updateDynamic("Config")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HoursOfOperationArn.foreach(__v => __obj.updateDynamic("HoursOfOperationArn")(__v.asInstanceOf[js.Any]))
      HoursOfOperationId.foreach(__v => __obj.updateDynamic("HoursOfOperationId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeZone.foreach(__v => __obj.updateDynamic("TimeZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HoursOfOperation]
    }
  }

  /** Contains information about the hours of operation.
    */
  @js.native
  trait HoursOfOperationConfig extends js.Object {
    var Day: js.UndefOr[HoursOfOperationDays]
    var EndTime: js.UndefOr[HoursOfOperationTimeSlice]
    var StartTime: js.UndefOr[HoursOfOperationTimeSlice]
  }

  object HoursOfOperationConfig {
    @inline
    def apply(
        Day: js.UndefOr[HoursOfOperationDays] = js.undefined,
        EndTime: js.UndefOr[HoursOfOperationTimeSlice] = js.undefined,
        StartTime: js.UndefOr[HoursOfOperationTimeSlice] = js.undefined
    ): HoursOfOperationConfig = {
      val __obj = js.Dynamic.literal()
      Day.foreach(__v => __obj.updateDynamic("Day")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HoursOfOperationConfig]
    }
  }

  /** Contains summary information about hours of operation for a contact center.
    */
  @js.native
  trait HoursOfOperationSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[HoursOfOperationId]
    var Name: js.UndefOr[HoursOfOperationName]
  }

  object HoursOfOperationSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[HoursOfOperationId] = js.undefined,
        Name: js.UndefOr[HoursOfOperationName] = js.undefined
    ): HoursOfOperationSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HoursOfOperationSummary]
    }
  }

  /** The start time or end time for an hours of operation.
    */
  @js.native
  trait HoursOfOperationTimeSlice extends js.Object {
    var Hours: js.UndefOr[Hours24Format]
    var Minutes: js.UndefOr[MinutesLimit60]
  }

  object HoursOfOperationTimeSlice {
    @inline
    def apply(
        Hours: js.UndefOr[Hours24Format] = js.undefined,
        Minutes: js.UndefOr[MinutesLimit60] = js.undefined
    ): HoursOfOperationTimeSlice = {
      val __obj = js.Dynamic.literal()
      Hours.foreach(__v => __obj.updateDynamic("Hours")(__v.asInstanceOf[js.Any]))
      Minutes.foreach(__v => __obj.updateDynamic("Minutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HoursOfOperationTimeSlice]
    }
  }

  /** The Amazon Connect instance.
    */
  @js.native
  trait Instance extends js.Object {
    var Arn: js.UndefOr[ARN]
    var CreatedTime: js.UndefOr[Timestamp]
    var Id: js.UndefOr[InstanceId]
    var IdentityManagementType: js.UndefOr[DirectoryType]
    var InboundCallsEnabled: js.UndefOr[InboundCallsEnabled]
    var InstanceAlias: js.UndefOr[DirectoryAlias]
    var InstanceStatus: js.UndefOr[InstanceStatus]
    var OutboundCallsEnabled: js.UndefOr[OutboundCallsEnabled]
    var ServiceRole: js.UndefOr[ARN]
    var StatusReason: js.UndefOr[InstanceStatusReason]
  }

  object Instance {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[InstanceId] = js.undefined,
        IdentityManagementType: js.UndefOr[DirectoryType] = js.undefined,
        InboundCallsEnabled: js.UndefOr[InboundCallsEnabled] = js.undefined,
        InstanceAlias: js.UndefOr[DirectoryAlias] = js.undefined,
        InstanceStatus: js.UndefOr[InstanceStatus] = js.undefined,
        OutboundCallsEnabled: js.UndefOr[OutboundCallsEnabled] = js.undefined,
        ServiceRole: js.UndefOr[ARN] = js.undefined,
        StatusReason: js.UndefOr[InstanceStatusReason] = js.undefined
    ): Instance = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IdentityManagementType.foreach(__v => __obj.updateDynamic("IdentityManagementType")(__v.asInstanceOf[js.Any]))
      InboundCallsEnabled.foreach(__v => __obj.updateDynamic("InboundCallsEnabled")(__v.asInstanceOf[js.Any]))
      InstanceAlias.foreach(__v => __obj.updateDynamic("InstanceAlias")(__v.asInstanceOf[js.Any]))
      InstanceStatus.foreach(__v => __obj.updateDynamic("InstanceStatus")(__v.asInstanceOf[js.Any]))
      OutboundCallsEnabled.foreach(__v => __obj.updateDynamic("OutboundCallsEnabled")(__v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.updateDynamic("ServiceRole")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
    }
  }

  /** Relevant details why the instance was not successfully created.
    */
  @js.native
  trait InstanceStatusReason extends js.Object {
    var Message: js.UndefOr[String]
  }

  object InstanceStatusReason {
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined
    ): InstanceStatusReason = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceStatusReason]
    }
  }

  /** The storage configuration for the instance.
    */
  @js.native
  trait InstanceStorageConfig extends js.Object {
    var StorageType: StorageType
    var AssociationId: js.UndefOr[AssociationId]
    var KinesisFirehoseConfig: js.UndefOr[KinesisFirehoseConfig]
    var KinesisStreamConfig: js.UndefOr[KinesisStreamConfig]
    var KinesisVideoStreamConfig: js.UndefOr[KinesisVideoStreamConfig]
    var S3Config: js.UndefOr[S3Config]
  }

  object InstanceStorageConfig {
    @inline
    def apply(
        StorageType: StorageType,
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        KinesisFirehoseConfig: js.UndefOr[KinesisFirehoseConfig] = js.undefined,
        KinesisStreamConfig: js.UndefOr[KinesisStreamConfig] = js.undefined,
        KinesisVideoStreamConfig: js.UndefOr[KinesisVideoStreamConfig] = js.undefined,
        S3Config: js.UndefOr[S3Config] = js.undefined
    ): InstanceStorageConfig = {
      val __obj = js.Dynamic.literal(
        "StorageType" -> StorageType.asInstanceOf[js.Any]
      )

      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseConfig.foreach(__v => __obj.updateDynamic("KinesisFirehoseConfig")(__v.asInstanceOf[js.Any]))
      KinesisStreamConfig.foreach(__v => __obj.updateDynamic("KinesisStreamConfig")(__v.asInstanceOf[js.Any]))
      KinesisVideoStreamConfig.foreach(__v => __obj.updateDynamic("KinesisVideoStreamConfig")(__v.asInstanceOf[js.Any]))
      S3Config.foreach(__v => __obj.updateDynamic("S3Config")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceStorageConfig]
    }
  }

  /** Information about the instance.
    */
  @js.native
  trait InstanceSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var CreatedTime: js.UndefOr[Timestamp]
    var Id: js.UndefOr[InstanceId]
    var IdentityManagementType: js.UndefOr[DirectoryType]
    var InboundCallsEnabled: js.UndefOr[InboundCallsEnabled]
    var InstanceAlias: js.UndefOr[DirectoryAlias]
    var InstanceStatus: js.UndefOr[InstanceStatus]
    var OutboundCallsEnabled: js.UndefOr[OutboundCallsEnabled]
    var ServiceRole: js.UndefOr[ARN]
  }

  object InstanceSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[InstanceId] = js.undefined,
        IdentityManagementType: js.UndefOr[DirectoryType] = js.undefined,
        InboundCallsEnabled: js.UndefOr[InboundCallsEnabled] = js.undefined,
        InstanceAlias: js.UndefOr[DirectoryAlias] = js.undefined,
        InstanceStatus: js.UndefOr[InstanceStatus] = js.undefined,
        OutboundCallsEnabled: js.UndefOr[OutboundCallsEnabled] = js.undefined,
        ServiceRole: js.UndefOr[ARN] = js.undefined
    ): InstanceSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IdentityManagementType.foreach(__v => __obj.updateDynamic("IdentityManagementType")(__v.asInstanceOf[js.Any]))
      InboundCallsEnabled.foreach(__v => __obj.updateDynamic("InboundCallsEnabled")(__v.asInstanceOf[js.Any]))
      InstanceAlias.foreach(__v => __obj.updateDynamic("InstanceAlias")(__v.asInstanceOf[js.Any]))
      InstanceStatus.foreach(__v => __obj.updateDynamic("InstanceStatus")(__v.asInstanceOf[js.Any]))
      OutboundCallsEnabled.foreach(__v => __obj.updateDynamic("OutboundCallsEnabled")(__v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.updateDynamic("ServiceRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceSummary]
    }
  }

  /** Contains summary information about the associated AppIntegrations.
    */
  @js.native
  trait IntegrationAssociationSummary extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
    var IntegrationArn: js.UndefOr[ARN]
    var IntegrationAssociationArn: js.UndefOr[ARN]
    var IntegrationAssociationId: js.UndefOr[IntegrationAssociationId]
    var IntegrationType: js.UndefOr[IntegrationType]
    var SourceApplicationName: js.UndefOr[SourceApplicationName]
    var SourceApplicationUrl: js.UndefOr[URI]
    var SourceType: js.UndefOr[SourceType]
  }

  object IntegrationAssociationSummary {
    @inline
    def apply(
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        IntegrationArn: js.UndefOr[ARN] = js.undefined,
        IntegrationAssociationArn: js.UndefOr[ARN] = js.undefined,
        IntegrationAssociationId: js.UndefOr[IntegrationAssociationId] = js.undefined,
        IntegrationType: js.UndefOr[IntegrationType] = js.undefined,
        SourceApplicationName: js.UndefOr[SourceApplicationName] = js.undefined,
        SourceApplicationUrl: js.UndefOr[URI] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): IntegrationAssociationSummary = {
      val __obj = js.Dynamic.literal()
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      IntegrationArn.foreach(__v => __obj.updateDynamic("IntegrationArn")(__v.asInstanceOf[js.Any]))
      IntegrationAssociationArn.foreach(__v => __obj.updateDynamic("IntegrationAssociationArn")(__v.asInstanceOf[js.Any]))
      IntegrationAssociationId.foreach(__v => __obj.updateDynamic("IntegrationAssociationId")(__v.asInstanceOf[js.Any]))
      IntegrationType.foreach(__v => __obj.updateDynamic("IntegrationType")(__v.asInstanceOf[js.Any]))
      SourceApplicationName.foreach(__v => __obj.updateDynamic("SourceApplicationName")(__v.asInstanceOf[js.Any]))
      SourceApplicationUrl.foreach(__v => __obj.updateDynamic("SourceApplicationUrl")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntegrationAssociationSummary]
    }
  }

  /** Configuration information of a Kinesis Data Firehose delivery stream.
    */
  @js.native
  trait KinesisFirehoseConfig extends js.Object {
    var FirehoseArn: ARN
  }

  object KinesisFirehoseConfig {
    @inline
    def apply(
        FirehoseArn: ARN
    ): KinesisFirehoseConfig = {
      val __obj = js.Dynamic.literal(
        "FirehoseArn" -> FirehoseArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KinesisFirehoseConfig]
    }
  }

  /** Configuration information of a Kinesis data stream.
    */
  @js.native
  trait KinesisStreamConfig extends js.Object {
    var StreamArn: ARN
  }

  object KinesisStreamConfig {
    @inline
    def apply(
        StreamArn: ARN
    ): KinesisStreamConfig = {
      val __obj = js.Dynamic.literal(
        "StreamArn" -> StreamArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KinesisStreamConfig]
    }
  }

  /** Configuration information of a Kinesis video stream.
    */
  @js.native
  trait KinesisVideoStreamConfig extends js.Object {
    var EncryptionConfig: EncryptionConfig
    var Prefix: Prefix
    var RetentionPeriodHours: Hours
  }

  object KinesisVideoStreamConfig {
    @inline
    def apply(
        EncryptionConfig: EncryptionConfig,
        Prefix: Prefix,
        RetentionPeriodHours: Hours
    ): KinesisVideoStreamConfig = {
      val __obj = js.Dynamic.literal(
        "EncryptionConfig" -> EncryptionConfig.asInstanceOf[js.Any],
        "Prefix" -> Prefix.asInstanceOf[js.Any],
        "RetentionPeriodHours" -> RetentionPeriodHours.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KinesisVideoStreamConfig]
    }
  }

  /** Configuration information of an Amazon Lex bot.
    */
  @js.native
  trait LexBot extends js.Object {
    var LexRegion: js.UndefOr[LexRegion]
    var Name: js.UndefOr[BotName]
  }

  object LexBot {
    @inline
    def apply(
        LexRegion: js.UndefOr[LexRegion] = js.undefined,
        Name: js.UndefOr[BotName] = js.undefined
    ): LexBot = {
      val __obj = js.Dynamic.literal()
      LexRegion.foreach(__v => __obj.updateDynamic("LexRegion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LexBot]
    }
  }

  @js.native
  trait ListApprovedOriginsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult25]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApprovedOriginsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult25] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApprovedOriginsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApprovedOriginsRequest]
    }
  }

  @js.native
  trait ListApprovedOriginsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Origins: js.UndefOr[OriginsList]
  }

  object ListApprovedOriginsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Origins: js.UndefOr[OriginsList] = js.undefined
    ): ListApprovedOriginsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Origins.foreach(__v => __obj.updateDynamic("Origins")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApprovedOriginsResponse]
    }
  }

  @js.native
  trait ListContactFlowsRequest extends js.Object {
    var InstanceId: InstanceId
    var ContactFlowTypes: js.UndefOr[ContactFlowTypes]
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListContactFlowsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        ContactFlowTypes: js.UndefOr[ContactFlowTypes] = js.undefined,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListContactFlowsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      ContactFlowTypes.foreach(__v => __obj.updateDynamic("ContactFlowTypes")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactFlowsRequest]
    }
  }

  @js.native
  trait ListContactFlowsResponse extends js.Object {
    var ContactFlowSummaryList: js.UndefOr[ContactFlowSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListContactFlowsResponse {
    @inline
    def apply(
        ContactFlowSummaryList: js.UndefOr[ContactFlowSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListContactFlowsResponse = {
      val __obj = js.Dynamic.literal()
      ContactFlowSummaryList.foreach(__v => __obj.updateDynamic("ContactFlowSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactFlowsResponse]
    }
  }

  @js.native
  trait ListHoursOfOperationsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHoursOfOperationsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHoursOfOperationsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHoursOfOperationsRequest]
    }
  }

  @js.native
  trait ListHoursOfOperationsResponse extends js.Object {
    var HoursOfOperationSummaryList: js.UndefOr[HoursOfOperationSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHoursOfOperationsResponse {
    @inline
    def apply(
        HoursOfOperationSummaryList: js.UndefOr[HoursOfOperationSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHoursOfOperationsResponse = {
      val __obj = js.Dynamic.literal()
      HoursOfOperationSummaryList.foreach(__v => __obj.updateDynamic("HoursOfOperationSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHoursOfOperationsResponse]
    }
  }

  @js.native
  trait ListInstanceAttributesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult7]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInstanceAttributesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult7] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInstanceAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceAttributesRequest]
    }
  }

  @js.native
  trait ListInstanceAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributesList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInstanceAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[AttributesList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInstanceAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceAttributesResponse]
    }
  }

  @js.native
  trait ListInstanceStorageConfigsRequest extends js.Object {
    var InstanceId: InstanceId
    var ResourceType: InstanceStorageResourceType
    var MaxResults: js.UndefOr[MaxResult10]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInstanceStorageConfigsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        ResourceType: InstanceStorageResourceType,
        MaxResults: js.UndefOr[MaxResult10] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInstanceStorageConfigsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceStorageConfigsRequest]
    }
  }

  @js.native
  trait ListInstanceStorageConfigsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StorageConfigs: js.UndefOr[InstanceStorageConfigs]
  }

  object ListInstanceStorageConfigsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StorageConfigs: js.UndefOr[InstanceStorageConfigs] = js.undefined
    ): ListInstanceStorageConfigsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StorageConfigs.foreach(__v => __obj.updateDynamic("StorageConfigs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceStorageConfigsResponse]
    }
  }

  @js.native
  trait ListInstancesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResult10]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInstancesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResult10] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInstancesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstancesRequest]
    }
  }

  @js.native
  trait ListInstancesResponse extends js.Object {
    var InstanceSummaryList: js.UndefOr[InstanceSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInstancesResponse {
    @inline
    def apply(
        InstanceSummaryList: js.UndefOr[InstanceSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInstancesResponse = {
      val __obj = js.Dynamic.literal()
      InstanceSummaryList.foreach(__v => __obj.updateDynamic("InstanceSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstancesResponse]
    }
  }

  @js.native
  trait ListIntegrationAssociationsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIntegrationAssociationsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIntegrationAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIntegrationAssociationsRequest]
    }
  }

  @js.native
  trait ListIntegrationAssociationsResponse extends js.Object {
    var IntegrationAssociationSummaryList: js.UndefOr[IntegrationAssociationSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIntegrationAssociationsResponse {
    @inline
    def apply(
        IntegrationAssociationSummaryList: js.UndefOr[IntegrationAssociationSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIntegrationAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      IntegrationAssociationSummaryList.foreach(__v => __obj.updateDynamic("IntegrationAssociationSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIntegrationAssociationsResponse]
    }
  }

  @js.native
  trait ListLambdaFunctionsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult25]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLambdaFunctionsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult25] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLambdaFunctionsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLambdaFunctionsRequest]
    }
  }

  @js.native
  trait ListLambdaFunctionsResponse extends js.Object {
    var LambdaFunctions: js.UndefOr[FunctionArnsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLambdaFunctionsResponse {
    @inline
    def apply(
        LambdaFunctions: js.UndefOr[FunctionArnsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLambdaFunctionsResponse = {
      val __obj = js.Dynamic.literal()
      LambdaFunctions.foreach(__v => __obj.updateDynamic("LambdaFunctions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLambdaFunctionsResponse]
    }
  }

  @js.native
  trait ListLexBotsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult25]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLexBotsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult25] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLexBotsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLexBotsRequest]
    }
  }

  @js.native
  trait ListLexBotsResponse extends js.Object {
    var LexBots: js.UndefOr[LexBotsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLexBotsResponse {
    @inline
    def apply(
        LexBots: js.UndefOr[LexBotsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLexBotsResponse = {
      val __obj = js.Dynamic.literal()
      LexBots.foreach(__v => __obj.updateDynamic("LexBots")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLexBotsResponse]
    }
  }

  @js.native
  trait ListPhoneNumbersRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
    var PhoneNumberCountryCodes: js.UndefOr[PhoneNumberCountryCodes]
    var PhoneNumberTypes: js.UndefOr[PhoneNumberTypes]
  }

  object ListPhoneNumbersRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PhoneNumberCountryCodes: js.UndefOr[PhoneNumberCountryCodes] = js.undefined,
        PhoneNumberTypes: js.UndefOr[PhoneNumberTypes] = js.undefined
    ): ListPhoneNumbersRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberCountryCodes.foreach(__v => __obj.updateDynamic("PhoneNumberCountryCodes")(__v.asInstanceOf[js.Any]))
      PhoneNumberTypes.foreach(__v => __obj.updateDynamic("PhoneNumberTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersRequest]
    }
  }

  @js.native
  trait ListPhoneNumbersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PhoneNumberSummaryList: js.UndefOr[PhoneNumberSummaryList]
  }

  object ListPhoneNumbersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PhoneNumberSummaryList: js.UndefOr[PhoneNumberSummaryList] = js.undefined
    ): ListPhoneNumbersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberSummaryList.foreach(__v => __obj.updateDynamic("PhoneNumberSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersResponse]
    }
  }

  @js.native
  trait ListPromptsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPromptsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPromptsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPromptsRequest]
    }
  }

  @js.native
  trait ListPromptsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PromptSummaryList: js.UndefOr[PromptSummaryList]
  }

  object ListPromptsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PromptSummaryList: js.UndefOr[PromptSummaryList] = js.undefined
    ): ListPromptsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PromptSummaryList.foreach(__v => __obj.updateDynamic("PromptSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPromptsResponse]
    }
  }

  @js.native
  trait ListQueueQuickConnectsRequest extends js.Object {
    var InstanceId: InstanceId
    var QueueId: QueueId
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListQueueQuickConnectsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QueueId: QueueId,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListQueueQuickConnectsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueueQuickConnectsRequest]
    }
  }

  @js.native
  trait ListQueueQuickConnectsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QuickConnectSummaryList: js.UndefOr[QuickConnectSummaryList]
  }

  object ListQueueQuickConnectsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QuickConnectSummaryList: js.UndefOr[QuickConnectSummaryList] = js.undefined
    ): ListQueueQuickConnectsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QuickConnectSummaryList.foreach(__v => __obj.updateDynamic("QuickConnectSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueueQuickConnectsResponse]
    }
  }

  @js.native
  trait ListQueuesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
    var QueueTypes: js.UndefOr[QueueTypes]
  }

  object ListQueuesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QueueTypes: js.UndefOr[QueueTypes] = js.undefined
    ): ListQueuesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueueTypes.foreach(__v => __obj.updateDynamic("QueueTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueuesRequest]
    }
  }

  @js.native
  trait ListQueuesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueueSummaryList: js.UndefOr[QueueSummaryList]
  }

  object ListQueuesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QueueSummaryList: js.UndefOr[QueueSummaryList] = js.undefined
    ): ListQueuesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueueSummaryList.foreach(__v => __obj.updateDynamic("QueueSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueuesResponse]
    }
  }

  @js.native
  trait ListQuickConnectsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
    var QuickConnectTypes: js.UndefOr[QuickConnectTypes]
  }

  object ListQuickConnectsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QuickConnectTypes: js.UndefOr[QuickConnectTypes] = js.undefined
    ): ListQuickConnectsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QuickConnectTypes.foreach(__v => __obj.updateDynamic("QuickConnectTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQuickConnectsRequest]
    }
  }

  @js.native
  trait ListQuickConnectsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QuickConnectSummaryList: js.UndefOr[QuickConnectSummaryList]
  }

  object ListQuickConnectsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QuickConnectSummaryList: js.UndefOr[QuickConnectSummaryList] = js.undefined
    ): ListQuickConnectsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QuickConnectSummaryList.foreach(__v => __obj.updateDynamic("QuickConnectSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQuickConnectsResponse]
    }
  }

  @js.native
  trait ListRoutingProfileQueuesRequest extends js.Object {
    var InstanceId: InstanceId
    var RoutingProfileId: RoutingProfileId
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRoutingProfileQueuesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        RoutingProfileId: RoutingProfileId,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRoutingProfileQueuesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "RoutingProfileId" -> RoutingProfileId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutingProfileQueuesRequest]
    }
  }

  @js.native
  trait ListRoutingProfileQueuesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RoutingProfileQueueConfigSummaryList: js.UndefOr[RoutingProfileQueueConfigSummaryList]
  }

  object ListRoutingProfileQueuesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RoutingProfileQueueConfigSummaryList: js.UndefOr[RoutingProfileQueueConfigSummaryList] = js.undefined
    ): ListRoutingProfileQueuesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RoutingProfileQueueConfigSummaryList.foreach(__v => __obj.updateDynamic("RoutingProfileQueueConfigSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutingProfileQueuesResponse]
    }
  }

  @js.native
  trait ListRoutingProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRoutingProfilesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRoutingProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutingProfilesRequest]
    }
  }

  @js.native
  trait ListRoutingProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RoutingProfileSummaryList: js.UndefOr[RoutingProfileSummaryList]
  }

  object ListRoutingProfilesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RoutingProfileSummaryList: js.UndefOr[RoutingProfileSummaryList] = js.undefined
    ): ListRoutingProfilesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RoutingProfileSummaryList.foreach(__v => __obj.updateDynamic("RoutingProfileSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutingProfilesResponse]
    }
  }

  @js.native
  trait ListSecurityKeysRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult2]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSecurityKeysRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult2] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSecurityKeysRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityKeysRequest]
    }
  }

  @js.native
  trait ListSecurityKeysResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SecurityKeys: js.UndefOr[SecurityKeysList]
  }

  object ListSecurityKeysResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SecurityKeys: js.UndefOr[SecurityKeysList] = js.undefined
    ): ListSecurityKeysResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SecurityKeys.foreach(__v => __obj.updateDynamic("SecurityKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityKeysResponse]
    }
  }

  @js.native
  trait ListSecurityProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSecurityProfilesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSecurityProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityProfilesRequest]
    }
  }

  @js.native
  trait ListSecurityProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SecurityProfileSummaryList: js.UndefOr[SecurityProfileSummaryList]
  }

  object ListSecurityProfilesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SecurityProfileSummaryList: js.UndefOr[SecurityProfileSummaryList] = js.undefined
    ): ListSecurityProfilesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SecurityProfileSummaryList.foreach(__v => __obj.updateDynamic("SecurityProfileSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityProfilesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ARN
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ARN
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Provides summary information about the use cases for the specified Amazon Connect AppIntegration association.
    */
  @js.native
  trait ListUseCasesRequest extends js.Object {
    var InstanceId: InstanceId
    var IntegrationAssociationId: IntegrationAssociationId
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUseCasesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        IntegrationAssociationId: IntegrationAssociationId,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUseCasesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "IntegrationAssociationId" -> IntegrationAssociationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUseCasesRequest]
    }
  }

  @js.native
  trait ListUseCasesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var UseCaseSummaryList: js.UndefOr[UseCaseSummaryList]
  }

  object ListUseCasesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        UseCaseSummaryList: js.UndefOr[UseCaseSummaryList] = js.undefined
    ): ListUseCasesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UseCaseSummaryList.foreach(__v => __obj.updateDynamic("UseCaseSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUseCasesResponse]
    }
  }

  @js.native
  trait ListUserHierarchyGroupsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUserHierarchyGroupsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUserHierarchyGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserHierarchyGroupsRequest]
    }
  }

  @js.native
  trait ListUserHierarchyGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList]
  }

  object ListUserHierarchyGroupsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList] = js.undefined
    ): ListUserHierarchyGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserHierarchyGroupSummaryList.foreach(__v => __obj.updateDynamic("UserHierarchyGroupSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserHierarchyGroupsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var UserSummaryList: js.UndefOr[UserSummaryList]
  }

  object ListUsersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        UserSummaryList: js.UndefOr[UserSummaryList] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserSummaryList.foreach(__v => __obj.updateDynamic("UserSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  /** Contains information about which channels are supported, and how many contacts an agent can have on a channel simultaneously.
    */
  @js.native
  trait MediaConcurrency extends js.Object {
    var Channel: Channel
    var Concurrency: Concurrency
  }

  object MediaConcurrency {
    @inline
    def apply(
        Channel: Channel,
        Concurrency: Concurrency
    ): MediaConcurrency = {
      val __obj = js.Dynamic.literal(
        "Channel" -> Channel.asInstanceOf[js.Any],
        "Concurrency" -> Concurrency.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MediaConcurrency]
    }
  }

  /** The outbound caller ID name, number, and outbound whisper flow.
    */
  @js.native
  trait OutboundCallerConfig extends js.Object {
    var OutboundCallerIdName: js.UndefOr[OutboundCallerIdName]
    var OutboundCallerIdNumberId: js.UndefOr[PhoneNumberId]
    var OutboundFlowId: js.UndefOr[ContactFlowId]
  }

  object OutboundCallerConfig {
    @inline
    def apply(
        OutboundCallerIdName: js.UndefOr[OutboundCallerIdName] = js.undefined,
        OutboundCallerIdNumberId: js.UndefOr[PhoneNumberId] = js.undefined,
        OutboundFlowId: js.UndefOr[ContactFlowId] = js.undefined
    ): OutboundCallerConfig = {
      val __obj = js.Dynamic.literal()
      OutboundCallerIdName.foreach(__v => __obj.updateDynamic("OutboundCallerIdName")(__v.asInstanceOf[js.Any]))
      OutboundCallerIdNumberId.foreach(__v => __obj.updateDynamic("OutboundCallerIdNumberId")(__v.asInstanceOf[js.Any]))
      OutboundFlowId.foreach(__v => __obj.updateDynamic("OutboundFlowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutboundCallerConfig]
    }
  }

  /** The customer's details.
    */
  @js.native
  trait ParticipantDetails extends js.Object {
    var DisplayName: DisplayName
  }

  object ParticipantDetails {
    @inline
    def apply(
        DisplayName: DisplayName
    ): ParticipantDetails = {
      val __obj = js.Dynamic.literal(
        "DisplayName" -> DisplayName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ParticipantDetails]
    }
  }

  /** Contains information about a phone number for a quick connect.
    */
  @js.native
  trait PhoneNumberQuickConnectConfig extends js.Object {
    var PhoneNumber: PhoneNumber
  }

  object PhoneNumberQuickConnectConfig {
    @inline
    def apply(
        PhoneNumber: PhoneNumber
    ): PhoneNumberQuickConnectConfig = {
      val __obj = js.Dynamic.literal(
        "PhoneNumber" -> PhoneNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PhoneNumberQuickConnectConfig]
    }
  }

  /** Contains summary information about a phone number for a contact center.
    */
  @js.native
  trait PhoneNumberSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[PhoneNumberId]
    var PhoneNumber: js.UndefOr[PhoneNumber]
    var PhoneNumberCountryCode: js.UndefOr[PhoneNumberCountryCode]
    var PhoneNumberType: js.UndefOr[PhoneNumberType]
  }

  object PhoneNumberSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[PhoneNumberId] = js.undefined,
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined,
        PhoneNumberCountryCode: js.UndefOr[PhoneNumberCountryCode] = js.undefined,
        PhoneNumberType: js.UndefOr[PhoneNumberType] = js.undefined
    ): PhoneNumberSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumberCountryCode.foreach(__v => __obj.updateDynamic("PhoneNumberCountryCode")(__v.asInstanceOf[js.Any]))
      PhoneNumberType.foreach(__v => __obj.updateDynamic("PhoneNumberType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberSummary]
    }
  }

  /** Contains information about the prompt.
    */
  @js.native
  trait PromptSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[PromptId]
    var Name: js.UndefOr[PromptName]
  }

  object PromptSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[PromptId] = js.undefined,
        Name: js.UndefOr[PromptName] = js.undefined
    ): PromptSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PromptSummary]
    }
  }

  /** Contains information about a queue.
    */
  @js.native
  trait Queue extends js.Object {
    var Description: js.UndefOr[QueueDescription]
    var HoursOfOperationId: js.UndefOr[HoursOfOperationId]
    var MaxContacts: js.UndefOr[QueueMaxContacts]
    var Name: js.UndefOr[CommonNameLength127]
    var OutboundCallerConfig: js.UndefOr[OutboundCallerConfig]
    var QueueArn: js.UndefOr[ARN]
    var QueueId: js.UndefOr[QueueId]
    var Status: js.UndefOr[QueueStatus]
    var Tags: js.UndefOr[TagMap]
  }

  object Queue {
    @inline
    def apply(
        Description: js.UndefOr[QueueDescription] = js.undefined,
        HoursOfOperationId: js.UndefOr[HoursOfOperationId] = js.undefined,
        MaxContacts: js.UndefOr[QueueMaxContacts] = js.undefined,
        Name: js.UndefOr[CommonNameLength127] = js.undefined,
        OutboundCallerConfig: js.UndefOr[OutboundCallerConfig] = js.undefined,
        QueueArn: js.UndefOr[ARN] = js.undefined,
        QueueId: js.UndefOr[QueueId] = js.undefined,
        Status: js.UndefOr[QueueStatus] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): Queue = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HoursOfOperationId.foreach(__v => __obj.updateDynamic("HoursOfOperationId")(__v.asInstanceOf[js.Any]))
      MaxContacts.foreach(__v => __obj.updateDynamic("MaxContacts")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutboundCallerConfig.foreach(__v => __obj.updateDynamic("OutboundCallerConfig")(__v.asInstanceOf[js.Any]))
      QueueArn.foreach(__v => __obj.updateDynamic("QueueArn")(__v.asInstanceOf[js.Any]))
      QueueId.foreach(__v => __obj.updateDynamic("QueueId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Queue]
    }
  }

  /** Contains information about a queue for a quick connect. The contact flow must be of type Transfer to Queue.
    */
  @js.native
  trait QueueQuickConnectConfig extends js.Object {
    var ContactFlowId: ContactFlowId
    var QueueId: QueueId
  }

  object QueueQuickConnectConfig {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        QueueId: QueueId
    ): QueueQuickConnectConfig = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[QueueQuickConnectConfig]
    }
  }

  /** Contains information about a queue resource for which metrics are returned.
    */
  @js.native
  trait QueueReference extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[QueueId]
  }

  object QueueReference {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[QueueId] = js.undefined
    ): QueueReference = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueueReference]
    }
  }

  /** Contains summary information about a queue.
    */
  @js.native
  trait QueueSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[QueueId]
    var Name: js.UndefOr[QueueName]
    var QueueType: js.UndefOr[QueueType]
  }

  object QueueSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[QueueId] = js.undefined,
        Name: js.UndefOr[QueueName] = js.undefined,
        QueueType: js.UndefOr[QueueType] = js.undefined
    ): QueueSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      QueueType.foreach(__v => __obj.updateDynamic("QueueType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueueSummary]
    }
  }

  /** Contains information about a quick connect.
    */
  @js.native
  trait QuickConnect extends js.Object {
    var Description: js.UndefOr[QuickConnectDescription]
    var Name: js.UndefOr[QuickConnectName]
    var QuickConnectARN: js.UndefOr[ARN]
    var QuickConnectConfig: js.UndefOr[QuickConnectConfig]
    var QuickConnectId: js.UndefOr[QuickConnectId]
    var Tags: js.UndefOr[TagMap]
  }

  object QuickConnect {
    @inline
    def apply(
        Description: js.UndefOr[QuickConnectDescription] = js.undefined,
        Name: js.UndefOr[QuickConnectName] = js.undefined,
        QuickConnectARN: js.UndefOr[ARN] = js.undefined,
        QuickConnectConfig: js.UndefOr[QuickConnectConfig] = js.undefined,
        QuickConnectId: js.UndefOr[QuickConnectId] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): QuickConnect = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      QuickConnectARN.foreach(__v => __obj.updateDynamic("QuickConnectARN")(__v.asInstanceOf[js.Any]))
      QuickConnectConfig.foreach(__v => __obj.updateDynamic("QuickConnectConfig")(__v.asInstanceOf[js.Any]))
      QuickConnectId.foreach(__v => __obj.updateDynamic("QuickConnectId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuickConnect]
    }
  }

  /** Contains configuration settings for a quick connect.
    */
  @js.native
  trait QuickConnectConfig extends js.Object {
    var QuickConnectType: QuickConnectType
    var PhoneConfig: js.UndefOr[PhoneNumberQuickConnectConfig]
    var QueueConfig: js.UndefOr[QueueQuickConnectConfig]
    var UserConfig: js.UndefOr[UserQuickConnectConfig]
  }

  object QuickConnectConfig {
    @inline
    def apply(
        QuickConnectType: QuickConnectType,
        PhoneConfig: js.UndefOr[PhoneNumberQuickConnectConfig] = js.undefined,
        QueueConfig: js.UndefOr[QueueQuickConnectConfig] = js.undefined,
        UserConfig: js.UndefOr[UserQuickConnectConfig] = js.undefined
    ): QuickConnectConfig = {
      val __obj = js.Dynamic.literal(
        "QuickConnectType" -> QuickConnectType.asInstanceOf[js.Any]
      )

      PhoneConfig.foreach(__v => __obj.updateDynamic("PhoneConfig")(__v.asInstanceOf[js.Any]))
      QueueConfig.foreach(__v => __obj.updateDynamic("QueueConfig")(__v.asInstanceOf[js.Any]))
      UserConfig.foreach(__v => __obj.updateDynamic("UserConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuickConnectConfig]
    }
  }

  /** Contains summary information about a quick connect.
    */
  @js.native
  trait QuickConnectSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[QuickConnectId]
    var Name: js.UndefOr[QuickConnectName]
    var QuickConnectType: js.UndefOr[QuickConnectType]
  }

  object QuickConnectSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[QuickConnectId] = js.undefined,
        Name: js.UndefOr[QuickConnectName] = js.undefined,
        QuickConnectType: js.UndefOr[QuickConnectType] = js.undefined
    ): QuickConnectSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      QuickConnectType.foreach(__v => __obj.updateDynamic("QuickConnectType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuickConnectSummary]
    }
  }

  /** A link that an agent selects to complete a given task. You can have up to 4,096 UTF-8 bytes across all references for a contact.
    */
  @js.native
  trait Reference extends js.Object {
    var Type: ReferenceType
    var Value: ReferenceValue
  }

  object Reference {
    @inline
    def apply(
        Type: ReferenceType,
        Value: ReferenceValue
    ): Reference = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Reference]
    }
  }

  @js.native
  trait ResumeContactRecordingRequest extends js.Object {
    var ContactId: ContactId
    var InitialContactId: ContactId
    var InstanceId: InstanceId
  }

  object ResumeContactRecordingRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InitialContactId: ContactId,
        InstanceId: InstanceId
    ): ResumeContactRecordingRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InitialContactId" -> InitialContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResumeContactRecordingRequest]
    }
  }

  @js.native
  trait ResumeContactRecordingResponse extends js.Object

  object ResumeContactRecordingResponse {
    @inline
    def apply(): ResumeContactRecordingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResumeContactRecordingResponse]
    }
  }

  /** Contains information about a routing profile.
    */
  @js.native
  trait RoutingProfile extends js.Object {
    var DefaultOutboundQueueId: js.UndefOr[QueueId]
    var Description: js.UndefOr[RoutingProfileDescription]
    var InstanceId: js.UndefOr[InstanceId]
    var MediaConcurrencies: js.UndefOr[MediaConcurrencies]
    var Name: js.UndefOr[RoutingProfileName]
    var RoutingProfileArn: js.UndefOr[ARN]
    var RoutingProfileId: js.UndefOr[RoutingProfileId]
    var Tags: js.UndefOr[TagMap]
  }

  object RoutingProfile {
    @inline
    def apply(
        DefaultOutboundQueueId: js.UndefOr[QueueId] = js.undefined,
        Description: js.UndefOr[RoutingProfileDescription] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        MediaConcurrencies: js.UndefOr[MediaConcurrencies] = js.undefined,
        Name: js.UndefOr[RoutingProfileName] = js.undefined,
        RoutingProfileArn: js.UndefOr[ARN] = js.undefined,
        RoutingProfileId: js.UndefOr[RoutingProfileId] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): RoutingProfile = {
      val __obj = js.Dynamic.literal()
      DefaultOutboundQueueId.foreach(__v => __obj.updateDynamic("DefaultOutboundQueueId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      MediaConcurrencies.foreach(__v => __obj.updateDynamic("MediaConcurrencies")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoutingProfileArn.foreach(__v => __obj.updateDynamic("RoutingProfileArn")(__v.asInstanceOf[js.Any]))
      RoutingProfileId.foreach(__v => __obj.updateDynamic("RoutingProfileId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoutingProfile]
    }
  }

  /** Contains information about the queue and channel for which priority and delay can be set.
    */
  @js.native
  trait RoutingProfileQueueConfig extends js.Object {
    var Delay: Delay
    var Priority: Priority
    var QueueReference: RoutingProfileQueueReference
  }

  object RoutingProfileQueueConfig {
    @inline
    def apply(
        Delay: Delay,
        Priority: Priority,
        QueueReference: RoutingProfileQueueReference
    ): RoutingProfileQueueConfig = {
      val __obj = js.Dynamic.literal(
        "Delay" -> Delay.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any],
        "QueueReference" -> QueueReference.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RoutingProfileQueueConfig]
    }
  }

  /** Contains summary information about a routing profile queue.
    */
  @js.native
  trait RoutingProfileQueueConfigSummary extends js.Object {
    var Channel: Channel
    var Delay: Delay
    var Priority: Priority
    var QueueArn: ARN
    var QueueId: QueueId
    var QueueName: QueueName
  }

  object RoutingProfileQueueConfigSummary {
    @inline
    def apply(
        Channel: Channel,
        Delay: Delay,
        Priority: Priority,
        QueueArn: ARN,
        QueueId: QueueId,
        QueueName: QueueName
    ): RoutingProfileQueueConfigSummary = {
      val __obj = js.Dynamic.literal(
        "Channel" -> Channel.asInstanceOf[js.Any],
        "Delay" -> Delay.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any],
        "QueueArn" -> QueueArn.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any],
        "QueueName" -> QueueName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RoutingProfileQueueConfigSummary]
    }
  }

  /** Contains the channel and queue identifier for a routing profile.
    */
  @js.native
  trait RoutingProfileQueueReference extends js.Object {
    var Channel: Channel
    var QueueId: QueueId
  }

  object RoutingProfileQueueReference {
    @inline
    def apply(
        Channel: Channel,
        QueueId: QueueId
    ): RoutingProfileQueueReference = {
      val __obj = js.Dynamic.literal(
        "Channel" -> Channel.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RoutingProfileQueueReference]
    }
  }

  /** Contains summary information about a routing profile.
    */
  @js.native
  trait RoutingProfileSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[RoutingProfileId]
    var Name: js.UndefOr[RoutingProfileName]
  }

  object RoutingProfileSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[RoutingProfileId] = js.undefined,
        Name: js.UndefOr[RoutingProfileName] = js.undefined
    ): RoutingProfileSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoutingProfileSummary]
    }
  }

  /** Information about the Amazon Simple Storage Service (Amazon S3) storage type.
    */
  @js.native
  trait S3Config extends js.Object {
    var BucketName: BucketName
    var BucketPrefix: Prefix
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
  }

  object S3Config {
    @inline
    def apply(
        BucketName: BucketName,
        BucketPrefix: Prefix,
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
    ): S3Config = {
      val __obj = js.Dynamic.literal(
        "BucketName" -> BucketName.asInstanceOf[js.Any],
        "BucketPrefix" -> BucketPrefix.asInstanceOf[js.Any]
      )

      EncryptionConfig.foreach(__v => __obj.updateDynamic("EncryptionConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Config]
    }
  }

  /** Configuration information of the security key.
    */
  @js.native
  trait SecurityKey extends js.Object {
    var AssociationId: js.UndefOr[AssociationId]
    var CreationTime: js.UndefOr[timestamp]
    var Key: js.UndefOr[PEM]
  }

  object SecurityKey {
    @inline
    def apply(
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        CreationTime: js.UndefOr[timestamp] = js.undefined,
        Key: js.UndefOr[PEM] = js.undefined
    ): SecurityKey = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityKey]
    }
  }

  /** Contains information about a security profile.
    */
  @js.native
  trait SecurityProfileSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[SecurityProfileId]
    var Name: js.UndefOr[SecurityProfileName]
  }

  object SecurityProfileSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[SecurityProfileId] = js.undefined,
        Name: js.UndefOr[SecurityProfileName] = js.undefined
    ): SecurityProfileSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityProfileSummary]
    }
  }

  @js.native
  trait StartChatContactRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var InstanceId: InstanceId
    var ParticipantDetails: ParticipantDetails
    var Attributes: js.UndefOr[Attributes]
    var ClientToken: js.UndefOr[ClientToken]
    var InitialMessage: js.UndefOr[ChatMessage]
  }

  object StartChatContactRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        InstanceId: InstanceId,
        ParticipantDetails: ParticipantDetails,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        InitialMessage: js.UndefOr[ChatMessage] = js.undefined
    ): StartChatContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ParticipantDetails" -> ParticipantDetails.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      InitialMessage.foreach(__v => __obj.updateDynamic("InitialMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartChatContactRequest]
    }
  }

  @js.native
  trait StartChatContactResponse extends js.Object {
    var ContactId: js.UndefOr[ContactId]
    var ParticipantId: js.UndefOr[ParticipantId]
    var ParticipantToken: js.UndefOr[ParticipantToken]
  }

  object StartChatContactResponse {
    @inline
    def apply(
        ContactId: js.UndefOr[ContactId] = js.undefined,
        ParticipantId: js.UndefOr[ParticipantId] = js.undefined,
        ParticipantToken: js.UndefOr[ParticipantToken] = js.undefined
    ): StartChatContactResponse = {
      val __obj = js.Dynamic.literal()
      ContactId.foreach(__v => __obj.updateDynamic("ContactId")(__v.asInstanceOf[js.Any]))
      ParticipantId.foreach(__v => __obj.updateDynamic("ParticipantId")(__v.asInstanceOf[js.Any]))
      ParticipantToken.foreach(__v => __obj.updateDynamic("ParticipantToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartChatContactResponse]
    }
  }

  @js.native
  trait StartContactRecordingRequest extends js.Object {
    var ContactId: ContactId
    var InitialContactId: ContactId
    var InstanceId: InstanceId
    var VoiceRecordingConfiguration: VoiceRecordingConfiguration
  }

  object StartContactRecordingRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InitialContactId: ContactId,
        InstanceId: InstanceId,
        VoiceRecordingConfiguration: VoiceRecordingConfiguration
    ): StartContactRecordingRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InitialContactId" -> InitialContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "VoiceRecordingConfiguration" -> VoiceRecordingConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartContactRecordingRequest]
    }
  }

  @js.native
  trait StartContactRecordingResponse extends js.Object

  object StartContactRecordingResponse {
    @inline
    def apply(): StartContactRecordingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartContactRecordingResponse]
    }
  }

  @js.native
  trait StartOutboundVoiceContactRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var DestinationPhoneNumber: PhoneNumber
    var InstanceId: InstanceId
    var Attributes: js.UndefOr[Attributes]
    var ClientToken: js.UndefOr[ClientToken]
    var QueueId: js.UndefOr[QueueId]
    var SourcePhoneNumber: js.UndefOr[PhoneNumber]
  }

  object StartOutboundVoiceContactRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        DestinationPhoneNumber: PhoneNumber,
        InstanceId: InstanceId,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        QueueId: js.UndefOr[QueueId] = js.undefined,
        SourcePhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): StartOutboundVoiceContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "DestinationPhoneNumber" -> DestinationPhoneNumber.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      QueueId.foreach(__v => __obj.updateDynamic("QueueId")(__v.asInstanceOf[js.Any]))
      SourcePhoneNumber.foreach(__v => __obj.updateDynamic("SourcePhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOutboundVoiceContactRequest]
    }
  }

  @js.native
  trait StartOutboundVoiceContactResponse extends js.Object {
    var ContactId: js.UndefOr[ContactId]
  }

  object StartOutboundVoiceContactResponse {
    @inline
    def apply(
        ContactId: js.UndefOr[ContactId] = js.undefined
    ): StartOutboundVoiceContactResponse = {
      val __obj = js.Dynamic.literal()
      ContactId.foreach(__v => __obj.updateDynamic("ContactId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOutboundVoiceContactResponse]
    }
  }

  @js.native
  trait StartTaskContactRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var InstanceId: InstanceId
    var Name: Name
    var Attributes: js.UndefOr[Attributes]
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[Description]
    var PreviousContactId: js.UndefOr[ContactId]
    var References: js.UndefOr[ContactReferences]
  }

  object StartTaskContactRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        InstanceId: InstanceId,
        Name: Name,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        PreviousContactId: js.UndefOr[ContactId] = js.undefined,
        References: js.UndefOr[ContactReferences] = js.undefined
    ): StartTaskContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PreviousContactId.foreach(__v => __obj.updateDynamic("PreviousContactId")(__v.asInstanceOf[js.Any]))
      References.foreach(__v => __obj.updateDynamic("References")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTaskContactRequest]
    }
  }

  @js.native
  trait StartTaskContactResponse extends js.Object {
    var ContactId: js.UndefOr[ContactId]
  }

  object StartTaskContactResponse {
    @inline
    def apply(
        ContactId: js.UndefOr[ContactId] = js.undefined
    ): StartTaskContactResponse = {
      val __obj = js.Dynamic.literal()
      ContactId.foreach(__v => __obj.updateDynamic("ContactId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTaskContactResponse]
    }
  }

  @js.native
  trait StopContactRecordingRequest extends js.Object {
    var ContactId: ContactId
    var InitialContactId: ContactId
    var InstanceId: InstanceId
  }

  object StopContactRecordingRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InitialContactId: ContactId,
        InstanceId: InstanceId
    ): StopContactRecordingRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InitialContactId" -> InitialContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopContactRecordingRequest]
    }
  }

  @js.native
  trait StopContactRecordingResponse extends js.Object

  object StopContactRecordingResponse {
    @inline
    def apply(): StopContactRecordingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopContactRecordingResponse]
    }
  }

  @js.native
  trait StopContactRequest extends js.Object {
    var ContactId: ContactId
    var InstanceId: InstanceId
  }

  object StopContactRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InstanceId: InstanceId
    ): StopContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopContactRequest]
    }
  }

  @js.native
  trait StopContactResponse extends js.Object

  object StopContactResponse {
    @inline
    def apply(): StopContactResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopContactResponse]
    }
  }

  @js.native
  trait SuspendContactRecordingRequest extends js.Object {
    var ContactId: ContactId
    var InitialContactId: ContactId
    var InstanceId: InstanceId
  }

  object SuspendContactRecordingRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InitialContactId: ContactId,
        InstanceId: InstanceId
    ): SuspendContactRecordingRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InitialContactId" -> InitialContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SuspendContactRecordingRequest]
    }
  }

  @js.native
  trait SuspendContactRecordingResponse extends js.Object

  object SuspendContactRecordingResponse {
    @inline
    def apply(): SuspendContactRecordingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuspendContactRecordingResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /** Contains information about the threshold for service level metrics.
    */
  @js.native
  trait Threshold extends js.Object {
    var Comparison: js.UndefOr[Comparison]
    var ThresholdValue: js.UndefOr[ThresholdValue]
  }

  object Threshold {
    @inline
    def apply(
        Comparison: js.UndefOr[Comparison] = js.undefined,
        ThresholdValue: js.UndefOr[ThresholdValue] = js.undefined
    ): Threshold = {
      val __obj = js.Dynamic.literal()
      Comparison.foreach(__v => __obj.updateDynamic("Comparison")(__v.asInstanceOf[js.Any]))
      ThresholdValue.foreach(__v => __obj.updateDynamic("ThresholdValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Threshold]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateContactAttributesRequest extends js.Object {
    var Attributes: Attributes
    var InitialContactId: ContactId
    var InstanceId: InstanceId
  }

  object UpdateContactAttributesRequest {
    @inline
    def apply(
        Attributes: Attributes,
        InitialContactId: ContactId,
        InstanceId: InstanceId
    ): UpdateContactAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "InitialContactId" -> InitialContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateContactAttributesRequest]
    }
  }

  @js.native
  trait UpdateContactAttributesResponse extends js.Object

  object UpdateContactAttributesResponse {
    @inline
    def apply(): UpdateContactAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContactAttributesResponse]
    }
  }

  @js.native
  trait UpdateContactFlowContentRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var Content: ContactFlowContent
    var InstanceId: InstanceId
  }

  object UpdateContactFlowContentRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        Content: ContactFlowContent,
        InstanceId: InstanceId
    ): UpdateContactFlowContentRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateContactFlowContentRequest]
    }
  }

  @js.native
  trait UpdateContactFlowNameRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var InstanceId: InstanceId
    var Description: js.UndefOr[ContactFlowDescription]
    var Name: js.UndefOr[ContactFlowName]
  }

  object UpdateContactFlowNameRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        InstanceId: InstanceId,
        Description: js.UndefOr[ContactFlowDescription] = js.undefined,
        Name: js.UndefOr[ContactFlowName] = js.undefined
    ): UpdateContactFlowNameRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContactFlowNameRequest]
    }
  }

  @js.native
  trait UpdateInstanceAttributeRequest extends js.Object {
    var AttributeType: InstanceAttributeType
    var InstanceId: InstanceId
    var Value: InstanceAttributeValue
  }

  object UpdateInstanceAttributeRequest {
    @inline
    def apply(
        AttributeType: InstanceAttributeType,
        InstanceId: InstanceId,
        Value: InstanceAttributeValue
    ): UpdateInstanceAttributeRequest = {
      val __obj = js.Dynamic.literal(
        "AttributeType" -> AttributeType.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateInstanceAttributeRequest]
    }
  }

  @js.native
  trait UpdateInstanceStorageConfigRequest extends js.Object {
    var AssociationId: AssociationId
    var InstanceId: InstanceId
    var ResourceType: InstanceStorageResourceType
    var StorageConfig: InstanceStorageConfig
  }

  object UpdateInstanceStorageConfigRequest {
    @inline
    def apply(
        AssociationId: AssociationId,
        InstanceId: InstanceId,
        ResourceType: InstanceStorageResourceType,
        StorageConfig: InstanceStorageConfig
    ): UpdateInstanceStorageConfigRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "StorageConfig" -> StorageConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateInstanceStorageConfigRequest]
    }
  }

  @js.native
  trait UpdateQueueHoursOfOperationRequest extends js.Object {
    var HoursOfOperationId: HoursOfOperationId
    var InstanceId: InstanceId
    var QueueId: QueueId
  }

  object UpdateQueueHoursOfOperationRequest {
    @inline
    def apply(
        HoursOfOperationId: HoursOfOperationId,
        InstanceId: InstanceId,
        QueueId: QueueId
    ): UpdateQueueHoursOfOperationRequest = {
      val __obj = js.Dynamic.literal(
        "HoursOfOperationId" -> HoursOfOperationId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateQueueHoursOfOperationRequest]
    }
  }

  @js.native
  trait UpdateQueueMaxContactsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxContacts: QueueMaxContacts
    var QueueId: QueueId
  }

  object UpdateQueueMaxContactsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxContacts: QueueMaxContacts,
        QueueId: QueueId
    ): UpdateQueueMaxContactsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "MaxContacts" -> MaxContacts.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateQueueMaxContactsRequest]
    }
  }

  @js.native
  trait UpdateQueueNameRequest extends js.Object {
    var InstanceId: InstanceId
    var QueueId: QueueId
    var Description: js.UndefOr[QueueDescription]
    var Name: js.UndefOr[CommonNameLength127]
  }

  object UpdateQueueNameRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QueueId: QueueId,
        Description: js.UndefOr[QueueDescription] = js.undefined,
        Name: js.UndefOr[CommonNameLength127] = js.undefined
    ): UpdateQueueNameRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateQueueNameRequest]
    }
  }

  @js.native
  trait UpdateQueueOutboundCallerConfigRequest extends js.Object {
    var InstanceId: InstanceId
    var OutboundCallerConfig: OutboundCallerConfig
    var QueueId: QueueId
  }

  object UpdateQueueOutboundCallerConfigRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        OutboundCallerConfig: OutboundCallerConfig,
        QueueId: QueueId
    ): UpdateQueueOutboundCallerConfigRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "OutboundCallerConfig" -> OutboundCallerConfig.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateQueueOutboundCallerConfigRequest]
    }
  }

  @js.native
  trait UpdateQueueStatusRequest extends js.Object {
    var InstanceId: InstanceId
    var QueueId: QueueId
    var Status: QueueStatus
  }

  object UpdateQueueStatusRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QueueId: QueueId,
        Status: QueueStatus
    ): UpdateQueueStatusRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateQueueStatusRequest]
    }
  }

  @js.native
  trait UpdateQuickConnectConfigRequest extends js.Object {
    var InstanceId: InstanceId
    var QuickConnectConfig: QuickConnectConfig
    var QuickConnectId: QuickConnectId
  }

  object UpdateQuickConnectConfigRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QuickConnectConfig: QuickConnectConfig,
        QuickConnectId: QuickConnectId
    ): UpdateQuickConnectConfigRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QuickConnectConfig" -> QuickConnectConfig.asInstanceOf[js.Any],
        "QuickConnectId" -> QuickConnectId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateQuickConnectConfigRequest]
    }
  }

  @js.native
  trait UpdateQuickConnectNameRequest extends js.Object {
    var InstanceId: InstanceId
    var QuickConnectId: QuickConnectId
    var Description: js.UndefOr[QuickConnectDescription]
    var Name: js.UndefOr[QuickConnectName]
  }

  object UpdateQuickConnectNameRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QuickConnectId: QuickConnectId,
        Description: js.UndefOr[QuickConnectDescription] = js.undefined,
        Name: js.UndefOr[QuickConnectName] = js.undefined
    ): UpdateQuickConnectNameRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QuickConnectId" -> QuickConnectId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateQuickConnectNameRequest]
    }
  }

  @js.native
  trait UpdateRoutingProfileConcurrencyRequest extends js.Object {
    var InstanceId: InstanceId
    var MediaConcurrencies: MediaConcurrencies
    var RoutingProfileId: RoutingProfileId
  }

  object UpdateRoutingProfileConcurrencyRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MediaConcurrencies: MediaConcurrencies,
        RoutingProfileId: RoutingProfileId
    ): UpdateRoutingProfileConcurrencyRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "MediaConcurrencies" -> MediaConcurrencies.asInstanceOf[js.Any],
        "RoutingProfileId" -> RoutingProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRoutingProfileConcurrencyRequest]
    }
  }

  @js.native
  trait UpdateRoutingProfileDefaultOutboundQueueRequest extends js.Object {
    var DefaultOutboundQueueId: QueueId
    var InstanceId: InstanceId
    var RoutingProfileId: RoutingProfileId
  }

  object UpdateRoutingProfileDefaultOutboundQueueRequest {
    @inline
    def apply(
        DefaultOutboundQueueId: QueueId,
        InstanceId: InstanceId,
        RoutingProfileId: RoutingProfileId
    ): UpdateRoutingProfileDefaultOutboundQueueRequest = {
      val __obj = js.Dynamic.literal(
        "DefaultOutboundQueueId" -> DefaultOutboundQueueId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "RoutingProfileId" -> RoutingProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRoutingProfileDefaultOutboundQueueRequest]
    }
  }

  @js.native
  trait UpdateRoutingProfileNameRequest extends js.Object {
    var InstanceId: InstanceId
    var RoutingProfileId: RoutingProfileId
    var Description: js.UndefOr[RoutingProfileDescription]
    var Name: js.UndefOr[RoutingProfileName]
  }

  object UpdateRoutingProfileNameRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        RoutingProfileId: RoutingProfileId,
        Description: js.UndefOr[RoutingProfileDescription] = js.undefined,
        Name: js.UndefOr[RoutingProfileName] = js.undefined
    ): UpdateRoutingProfileNameRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "RoutingProfileId" -> RoutingProfileId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoutingProfileNameRequest]
    }
  }

  @js.native
  trait UpdateRoutingProfileQueuesRequest extends js.Object {
    var InstanceId: InstanceId
    var QueueConfigs: RoutingProfileQueueConfigList
    var RoutingProfileId: RoutingProfileId
  }

  object UpdateRoutingProfileQueuesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QueueConfigs: RoutingProfileQueueConfigList,
        RoutingProfileId: RoutingProfileId
    ): UpdateRoutingProfileQueuesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QueueConfigs" -> QueueConfigs.asInstanceOf[js.Any],
        "RoutingProfileId" -> RoutingProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRoutingProfileQueuesRequest]
    }
  }

  @js.native
  trait UpdateUserHierarchyGroupNameRequest extends js.Object {
    var HierarchyGroupId: HierarchyGroupId
    var InstanceId: InstanceId
    var Name: HierarchyGroupName
  }

  object UpdateUserHierarchyGroupNameRequest {
    @inline
    def apply(
        HierarchyGroupId: HierarchyGroupId,
        InstanceId: InstanceId,
        Name: HierarchyGroupName
    ): UpdateUserHierarchyGroupNameRequest = {
      val __obj = js.Dynamic.literal(
        "HierarchyGroupId" -> HierarchyGroupId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateUserHierarchyGroupNameRequest]
    }
  }

  @js.native
  trait UpdateUserHierarchyRequest extends js.Object {
    var InstanceId: InstanceId
    var UserId: UserId
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
  }

  object UpdateUserHierarchyRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        UserId: UserId,
        HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined
    ): UpdateUserHierarchyRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      HierarchyGroupId.foreach(__v => __obj.updateDynamic("HierarchyGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserHierarchyRequest]
    }
  }

  @js.native
  trait UpdateUserHierarchyStructureRequest extends js.Object {
    var HierarchyStructure: HierarchyStructureUpdate
    var InstanceId: InstanceId
  }

  object UpdateUserHierarchyStructureRequest {
    @inline
    def apply(
        HierarchyStructure: HierarchyStructureUpdate,
        InstanceId: InstanceId
    ): UpdateUserHierarchyStructureRequest = {
      val __obj = js.Dynamic.literal(
        "HierarchyStructure" -> HierarchyStructure.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateUserHierarchyStructureRequest]
    }
  }

  @js.native
  trait UpdateUserIdentityInfoRequest extends js.Object {
    var IdentityInfo: UserIdentityInfo
    var InstanceId: InstanceId
    var UserId: UserId
  }

  object UpdateUserIdentityInfoRequest {
    @inline
    def apply(
        IdentityInfo: UserIdentityInfo,
        InstanceId: InstanceId,
        UserId: UserId
    ): UpdateUserIdentityInfoRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityInfo" -> IdentityInfo.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateUserIdentityInfoRequest]
    }
  }

  @js.native
  trait UpdateUserPhoneConfigRequest extends js.Object {
    var InstanceId: InstanceId
    var PhoneConfig: UserPhoneConfig
    var UserId: UserId
  }

  object UpdateUserPhoneConfigRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        PhoneConfig: UserPhoneConfig,
        UserId: UserId
    ): UpdateUserPhoneConfigRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "PhoneConfig" -> PhoneConfig.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateUserPhoneConfigRequest]
    }
  }

  @js.native
  trait UpdateUserRoutingProfileRequest extends js.Object {
    var InstanceId: InstanceId
    var RoutingProfileId: RoutingProfileId
    var UserId: UserId
  }

  object UpdateUserRoutingProfileRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        RoutingProfileId: RoutingProfileId,
        UserId: UserId
    ): UpdateUserRoutingProfileRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "RoutingProfileId" -> RoutingProfileId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateUserRoutingProfileRequest]
    }
  }

  @js.native
  trait UpdateUserSecurityProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var SecurityProfileIds: SecurityProfileIds
    var UserId: UserId
  }

  object UpdateUserSecurityProfilesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        SecurityProfileIds: SecurityProfileIds,
        UserId: UserId
    ): UpdateUserSecurityProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "SecurityProfileIds" -> SecurityProfileIds.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateUserSecurityProfilesRequest]
    }
  }

  /** Contains the use case.
    */
  @js.native
  trait UseCase extends js.Object {
    var UseCaseArn: js.UndefOr[ARN]
    var UseCaseId: js.UndefOr[UseCaseId]
    var UseCaseType: js.UndefOr[UseCaseType]
  }

  object UseCase {
    @inline
    def apply(
        UseCaseArn: js.UndefOr[ARN] = js.undefined,
        UseCaseId: js.UndefOr[UseCaseId] = js.undefined,
        UseCaseType: js.UndefOr[UseCaseType] = js.undefined
    ): UseCase = {
      val __obj = js.Dynamic.literal()
      UseCaseArn.foreach(__v => __obj.updateDynamic("UseCaseArn")(__v.asInstanceOf[js.Any]))
      UseCaseId.foreach(__v => __obj.updateDynamic("UseCaseId")(__v.asInstanceOf[js.Any]))
      UseCaseType.foreach(__v => __obj.updateDynamic("UseCaseType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UseCase]
    }
  }

  /** Contains information about a user account for a Amazon Connect instance.
    */
  @js.native
  trait User extends js.Object {
    var Arn: js.UndefOr[ARN]
    var DirectoryUserId: js.UndefOr[DirectoryUserId]
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
    var Id: js.UndefOr[UserId]
    var IdentityInfo: js.UndefOr[UserIdentityInfo]
    var PhoneConfig: js.UndefOr[UserPhoneConfig]
    var RoutingProfileId: js.UndefOr[RoutingProfileId]
    var SecurityProfileIds: js.UndefOr[SecurityProfileIds]
    var Tags: js.UndefOr[TagMap]
    var Username: js.UndefOr[AgentUsername]
  }

  object User {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        DirectoryUserId: js.UndefOr[DirectoryUserId] = js.undefined,
        HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined,
        Id: js.UndefOr[UserId] = js.undefined,
        IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined,
        PhoneConfig: js.UndefOr[UserPhoneConfig] = js.undefined,
        RoutingProfileId: js.UndefOr[RoutingProfileId] = js.undefined,
        SecurityProfileIds: js.UndefOr[SecurityProfileIds] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Username: js.UndefOr[AgentUsername] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DirectoryUserId.foreach(__v => __obj.updateDynamic("DirectoryUserId")(__v.asInstanceOf[js.Any]))
      HierarchyGroupId.foreach(__v => __obj.updateDynamic("HierarchyGroupId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IdentityInfo.foreach(__v => __obj.updateDynamic("IdentityInfo")(__v.asInstanceOf[js.Any]))
      PhoneConfig.foreach(__v => __obj.updateDynamic("PhoneConfig")(__v.asInstanceOf[js.Any]))
      RoutingProfileId.foreach(__v => __obj.updateDynamic("RoutingProfileId")(__v.asInstanceOf[js.Any]))
      SecurityProfileIds.foreach(__v => __obj.updateDynamic("SecurityProfileIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  /** Contains information about the identity of a user.
    */
  @js.native
  trait UserIdentityInfo extends js.Object {
    var Email: js.UndefOr[Email]
    var FirstName: js.UndefOr[AgentFirstName]
    var LastName: js.UndefOr[AgentLastName]
  }

  object UserIdentityInfo {
    @inline
    def apply(
        Email: js.UndefOr[Email] = js.undefined,
        FirstName: js.UndefOr[AgentFirstName] = js.undefined,
        LastName: js.UndefOr[AgentLastName] = js.undefined
    ): UserIdentityInfo = {
      val __obj = js.Dynamic.literal()
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserIdentityInfo]
    }
  }

  /** Contains information about the phone configuration settings for a user.
    */
  @js.native
  trait UserPhoneConfig extends js.Object {
    var PhoneType: PhoneType
    var AfterContactWorkTimeLimit: js.UndefOr[AfterContactWorkTimeLimit]
    var AutoAccept: js.UndefOr[AutoAccept]
    var DeskPhoneNumber: js.UndefOr[PhoneNumber]
  }

  object UserPhoneConfig {
    @inline
    def apply(
        PhoneType: PhoneType,
        AfterContactWorkTimeLimit: js.UndefOr[AfterContactWorkTimeLimit] = js.undefined,
        AutoAccept: js.UndefOr[AutoAccept] = js.undefined,
        DeskPhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): UserPhoneConfig = {
      val __obj = js.Dynamic.literal(
        "PhoneType" -> PhoneType.asInstanceOf[js.Any]
      )

      AfterContactWorkTimeLimit.foreach(__v => __obj.updateDynamic("AfterContactWorkTimeLimit")(__v.asInstanceOf[js.Any]))
      AutoAccept.foreach(__v => __obj.updateDynamic("AutoAccept")(__v.asInstanceOf[js.Any]))
      DeskPhoneNumber.foreach(__v => __obj.updateDynamic("DeskPhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPhoneConfig]
    }
  }

  /** Contains information about the quick connect configuration settings for a user. The contact flow must be of type Transfer to Agent.
    */
  @js.native
  trait UserQuickConnectConfig extends js.Object {
    var ContactFlowId: ContactFlowId
    var UserId: UserId
  }

  object UserQuickConnectConfig {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        UserId: UserId
    ): UserQuickConnectConfig = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UserQuickConnectConfig]
    }
  }

  /** Contains summary information about a user.
    */
  @js.native
  trait UserSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[UserId]
    var Username: js.UndefOr[AgentUsername]
  }

  object UserSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[UserId] = js.undefined,
        Username: js.UndefOr[AgentUsername] = js.undefined
    ): UserSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserSummary]
    }
  }

  /** Contains information about the recording configuration settings.
    */
  @js.native
  trait VoiceRecordingConfiguration extends js.Object {
    var VoiceRecordingTrack: js.UndefOr[VoiceRecordingTrack]
  }

  object VoiceRecordingConfiguration {
    @inline
    def apply(
        VoiceRecordingTrack: js.UndefOr[VoiceRecordingTrack] = js.undefined
    ): VoiceRecordingConfiguration = {
      val __obj = js.Dynamic.literal()
      VoiceRecordingTrack.foreach(__v => __obj.updateDynamic("VoiceRecordingTrack")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceRecordingConfiguration]
    }
  }
}
