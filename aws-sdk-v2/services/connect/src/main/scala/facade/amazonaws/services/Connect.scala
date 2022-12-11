package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object connect {
  type ARN = String
  type ActionSummaries = js.Array[ActionSummary]
  type AfterContactWorkTimeLimit = Int
  type AgentContactReferenceList = js.Array[AgentContactReference]
  type AgentFirstName = String
  type AgentLastName = String
  type AgentResourceId = String
  type AgentStatusDescription = String
  type AgentStatusId = String
  type AgentStatusName = String
  type AgentStatusOrderNumber = Int
  type AgentStatusSummaryList = js.Array[AgentStatusSummary]
  type AgentStatusTypes = js.Array[AgentStatusType]
  type AgentUsername = String
  type AliasArn = String
  type AllowedAccessControlTags = js.Dictionary[SecurityProfilePolicyValue]
  type AllowedMonitorCapabilities = js.Array[MonitorCapability]
  type ApproximateTotalCount = Double
  type AssociationId = String
  type AttributeName = String
  type AttributeValue = String
  type Attributes = js.Dictionary[AttributeValue]
  type AttributesList = js.Array[Attribute]
  type AutoAccept = Boolean
  type AvailableNumbersList = js.Array[AvailableNumberSummary]
  type AwsRegion = String
  type BotName = String
  type BucketName = String
  type CampaignId = String
  type ChannelToCountMap = js.Dictionary[IntegerCount]
  type Channels = js.Array[Channel]
  type ChatContent = String
  type ChatContentType = String
  type ChatDurationInMinutes = Int
  type ChatStreamingEndpointARN = String
  type ClientToken = String
  type CommonNameLength127 = String
  type Concurrency = Int
  type ContactFlowContent = String
  type ContactFlowDescription = String
  type ContactFlowId = String
  type ContactFlowModuleContent = String
  type ContactFlowModuleDescription = String
  type ContactFlowModuleId = String
  type ContactFlowModuleName = String
  type ContactFlowModulesSummaryList = js.Array[ContactFlowModuleSummary]
  type ContactFlowName = String
  type ContactFlowSummaryList = js.Array[ContactFlowSummary]
  type ContactFlowTypes = js.Array[ContactFlowType]
  type ContactId = String
  type ContactReferences = js.Dictionary[Reference]
  type ContactStates = js.Array[ContactState]
  type Content = String
  type CreateSecurityProfileName = String
  type CurrentMetricDataCollections = js.Array[CurrentMetricData]
  type CurrentMetricResults = js.Array[CurrentMetricResult]
  type CurrentMetrics = js.Array[CurrentMetric]
  type DefaultVocabularyList = js.Array[DefaultVocabulary]
  type Delay = Int
  type Description = String
  type Description250 = String
  type DirectoryAlias = String
  type DirectoryId = String
  type DirectoryUserId = String
  type DisplayName = String
  type DistributionList = js.Array[Distribution]
  type Email = String
  type EventBridgeActionName = String
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
  type HoursOfOperationDescription = String
  type HoursOfOperationId = String
  type HoursOfOperationName = String
  type HoursOfOperationSummaryList = js.Array[HoursOfOperationSummary]
  type InboundCallsEnabled = Boolean
  type InstanceArn = String
  type InstanceAttributeValue = String
  type InstanceId = String
  type InstanceIdOrArn = String
  type InstanceStorageConfigs = js.Array[InstanceStorageConfig]
  type InstanceSummaryList = js.Array[InstanceSummary]
  type IntegerCount = Int
  type IntegrationAssociationId = String
  type IntegrationAssociationSummaryList = js.Array[IntegrationAssociationSummary]
  type InvisibleTaskTemplateFields = js.Array[InvisibleFieldInfo]
  type KeyId = String
  type LargeNextToken = String
  type LexBotConfigList = js.Array[LexBotConfig]
  type LexBotsList = js.Array[LexBot]
  type LexRegion = String
  type ListPhoneNumbersSummaryList = js.Array[ListPhoneNumbersSummary]
  type MaxResult10 = Int
  type MaxResult100 = Int
  type MaxResult1000 = Int
  type MaxResult2 = Int
  type MaxResult200 = Int
  type MaxResult25 = Int
  type MaxResult7 = Int
  type MediaConcurrencies = js.Array[MediaConcurrency]
  type MinutesLimit60 = Int
  type Name = String
  type Name128 = String
  type NextToken = String
  type NextToken2500 = String
  type Origin = String
  type OriginsList = js.Array[Origin]
  type OutboundCallerIdName = String
  type OutboundCallsEnabled = Boolean
  type PEM = String
  type ParticipantId = String
  type ParticipantToken = String
  type Password = String
  type Percentage = Int
  type PermissionsList = js.Array[SecurityProfilePermission]
  type PhoneNumber = String
  type PhoneNumberCountryCodes = js.Array[PhoneNumberCountryCode]
  type PhoneNumberDescription = String
  type PhoneNumberId = String
  type PhoneNumberPrefix = String
  type PhoneNumberSummaryList = js.Array[PhoneNumberSummary]
  type PhoneNumberTypes = js.Array[PhoneNumberType]
  type PhoneNumberWorkflowMessage = String
  type Prefix = String
  type Priority = Int
  type PromptId = String
  type PromptName = String
  type PromptSummaryList = js.Array[PromptSummary]
  type QueueDescription = String
  type QueueId = String
  type QueueMaxContacts = Int
  type QueueName = String
  type QueueSearchConditionList = js.Array[QueueSearchCriteria]
  type QueueSearchSummaryList = js.Array[Queue]
  type QueueSummaryList = js.Array[QueueSummary]
  type QueueTypes = js.Array[QueueType]
  type Queues = js.Array[QueueId]
  type QuickConnectDescription = String
  type QuickConnectId = String
  type QuickConnectName = String
  type QuickConnectSummaryList = js.Array[QuickConnectSummary]
  type QuickConnectTypes = js.Array[QuickConnectType]
  type QuickConnectsList = js.Array[QuickConnectId]
  type ReadOnlyTaskTemplateFields = js.Array[ReadOnlyFieldInfo]
  type ReferenceKey = String
  type ReferenceSummaryList = js.Array[ReferenceSummary]
  type ReferenceTypes = js.Array[ReferenceType]
  type ReferenceValue = String
  type RequiredTaskTemplateFields = js.Array[RequiredFieldInfo]
  type RoutingProfileDescription = String
  type RoutingProfileId = String
  type RoutingProfileList = js.Array[RoutingProfile]
  type RoutingProfileName = String
  type RoutingProfileQueueConfigList = js.Array[RoutingProfileQueueConfig]
  type RoutingProfileQueueConfigSummaryList = js.Array[RoutingProfileQueueConfigSummary]
  type RoutingProfileQueueReferenceList = js.Array[RoutingProfileQueueReference]
  type RoutingProfileSearchConditionList = js.Array[RoutingProfileSearchCriteria]
  type RoutingProfileSummaryList = js.Array[RoutingProfileSummary]
  type RuleActions = js.Array[RuleAction]
  type RuleFunction = String
  type RuleId = String
  type RuleName = String
  type RuleSummaryList = js.Array[RuleSummary]
  type SecurityKeysList = js.Array[SecurityKey]
  type SecurityProfileDescription = String
  type SecurityProfileId = String
  type SecurityProfileIds = js.Array[SecurityProfileId]
  type SecurityProfileName = String
  type SecurityProfilePermission = String
  type SecurityProfilePolicyKey = String
  type SecurityProfilePolicyValue = String
  type SecurityProfileSearchConditionList = js.Array[SecurityProfileSearchCriteria]
  type SecurityProfileSummaryList = js.Array[SecurityProfileSummary]
  type SecurityProfilesSearchSummaryList = js.Array[SecurityProfileSearchSummary]
  type SecurityToken = String
  type SingleSelectOptions = js.Array[TaskTemplateSingleSelectOption]
  type SnapshotVersion = String
  type SourceApplicationName = String
  type StreamingId = String
  type Subject = String
  type SupportedMessagingContentType = String
  type SupportedMessagingContentTypes = js.Array[SupportedMessagingContentType]
  type TagAndConditionList = js.Array[TagCondition]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagOrConditionList = js.Array[TagAndConditionList]
  type TagRestrictedResourceList = js.Array[TagRestrictedResourceName]
  type TagRestrictedResourceName = String
  type TagValue = String
  type TaskDescriptionExpression = String
  type TaskNameExpression = String
  type TaskTemplateArn = String
  type TaskTemplateDefaultFieldValueList = js.Array[TaskTemplateDefaultFieldValue]
  type TaskTemplateDescription = String
  type TaskTemplateFieldDescription = String
  type TaskTemplateFieldName = String
  type TaskTemplateFieldValue = String
  type TaskTemplateFields = js.Array[TaskTemplateField]
  type TaskTemplateId = String
  type TaskTemplateList = js.Array[TaskTemplateMetadata]
  type TaskTemplateName = String
  type TaskTemplateSingleSelectOption = String
  type ThresholdValue = Double
  type TimeZone = String
  type Timestamp = js.Date
  type TrafficDistributionGroupArn = String
  type TrafficDistributionGroupId = String
  type TrafficDistributionGroupIdOrArn = String
  type TrafficDistributionGroupSummaryList = js.Array[TrafficDistributionGroupSummary]
  type URI = String
  type UpdateAgentStatusDescription = String
  type UpdateHoursOfOperationDescription = String
  type UpdateQuickConnectDescription = String
  type Url = String
  type UseCaseId = String
  type UseCaseSummaryList = js.Array[UseCase]
  type UserDataList = js.Array[UserData]
  type UserId = String
  type UserIdList = js.Array[UserId]
  type UserSearchConditionList = js.Array[UserSearchCriteria]
  type UserSearchSummaryList = js.Array[UserSearchSummary]
  type UserSummaryList = js.Array[UserSummary]
  type UserTagMap = js.Dictionary[String]
  type Value = Double
  type VocabularyContent = String
  type VocabularyFailureReason = String
  type VocabularyId = String
  type VocabularyLastModifiedTime = js.Date
  type VocabularyName = String
  type VocabularyNextToken = String
  type VocabularySummaryList = js.Array[VocabularySummary]
  type timestamp = js.Date

  final class ConnectOps(private val service: Connect) extends AnyVal {

    @inline def associateApprovedOriginFuture(params: AssociateApprovedOriginRequest): Future[js.Object] = service.associateApprovedOrigin(params).promise().toFuture
    @inline def associateBotFuture(params: AssociateBotRequest): Future[js.Object] = service.associateBot(params).promise().toFuture
    @inline def associateDefaultVocabularyFuture(params: AssociateDefaultVocabularyRequest): Future[AssociateDefaultVocabularyResponse] = service.associateDefaultVocabulary(params).promise().toFuture
    @inline def associateInstanceStorageConfigFuture(params: AssociateInstanceStorageConfigRequest): Future[AssociateInstanceStorageConfigResponse] = service.associateInstanceStorageConfig(params).promise().toFuture
    @inline def associateLambdaFunctionFuture(params: AssociateLambdaFunctionRequest): Future[js.Object] = service.associateLambdaFunction(params).promise().toFuture
    @inline def associateLexBotFuture(params: AssociateLexBotRequest): Future[js.Object] = service.associateLexBot(params).promise().toFuture
    @inline def associatePhoneNumberContactFlowFuture(params: AssociatePhoneNumberContactFlowRequest): Future[js.Object] = service.associatePhoneNumberContactFlow(params).promise().toFuture
    @inline def associateQueueQuickConnectsFuture(params: AssociateQueueQuickConnectsRequest): Future[js.Object] = service.associateQueueQuickConnects(params).promise().toFuture
    @inline def associateRoutingProfileQueuesFuture(params: AssociateRoutingProfileQueuesRequest): Future[js.Object] = service.associateRoutingProfileQueues(params).promise().toFuture
    @inline def associateSecurityKeyFuture(params: AssociateSecurityKeyRequest): Future[AssociateSecurityKeyResponse] = service.associateSecurityKey(params).promise().toFuture
    @inline def claimPhoneNumberFuture(params: ClaimPhoneNumberRequest): Future[ClaimPhoneNumberResponse] = service.claimPhoneNumber(params).promise().toFuture
    @inline def createAgentStatusFuture(params: CreateAgentStatusRequest): Future[CreateAgentStatusResponse] = service.createAgentStatus(params).promise().toFuture
    @inline def createContactFlowFuture(params: CreateContactFlowRequest): Future[CreateContactFlowResponse] = service.createContactFlow(params).promise().toFuture
    @inline def createContactFlowModuleFuture(params: CreateContactFlowModuleRequest): Future[CreateContactFlowModuleResponse] = service.createContactFlowModule(params).promise().toFuture
    @inline def createHoursOfOperationFuture(params: CreateHoursOfOperationRequest): Future[CreateHoursOfOperationResponse] = service.createHoursOfOperation(params).promise().toFuture
    @inline def createInstanceFuture(params: CreateInstanceRequest): Future[CreateInstanceResponse] = service.createInstance(params).promise().toFuture
    @inline def createIntegrationAssociationFuture(params: CreateIntegrationAssociationRequest): Future[CreateIntegrationAssociationResponse] = service.createIntegrationAssociation(params).promise().toFuture
    @inline def createQueueFuture(params: CreateQueueRequest): Future[CreateQueueResponse] = service.createQueue(params).promise().toFuture
    @inline def createQuickConnectFuture(params: CreateQuickConnectRequest): Future[CreateQuickConnectResponse] = service.createQuickConnect(params).promise().toFuture
    @inline def createRoutingProfileFuture(params: CreateRoutingProfileRequest): Future[CreateRoutingProfileResponse] = service.createRoutingProfile(params).promise().toFuture
    @inline def createRuleFuture(params: CreateRuleRequest): Future[CreateRuleResponse] = service.createRule(params).promise().toFuture
    @inline def createSecurityProfileFuture(params: CreateSecurityProfileRequest): Future[CreateSecurityProfileResponse] = service.createSecurityProfile(params).promise().toFuture
    @inline def createTaskTemplateFuture(params: CreateTaskTemplateRequest): Future[CreateTaskTemplateResponse] = service.createTaskTemplate(params).promise().toFuture
    @inline def createTrafficDistributionGroupFuture(params: CreateTrafficDistributionGroupRequest): Future[CreateTrafficDistributionGroupResponse] = service.createTrafficDistributionGroup(params).promise().toFuture
    @inline def createUseCaseFuture(params: CreateUseCaseRequest): Future[CreateUseCaseResponse] = service.createUseCase(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] = service.createUser(params).promise().toFuture
    @inline def createUserHierarchyGroupFuture(params: CreateUserHierarchyGroupRequest): Future[CreateUserHierarchyGroupResponse] = service.createUserHierarchyGroup(params).promise().toFuture
    @inline def createVocabularyFuture(params: CreateVocabularyRequest): Future[CreateVocabularyResponse] = service.createVocabulary(params).promise().toFuture
    @inline def deleteContactFlowFuture(params: DeleteContactFlowRequest): Future[js.Object] = service.deleteContactFlow(params).promise().toFuture
    @inline def deleteContactFlowModuleFuture(params: DeleteContactFlowModuleRequest): Future[DeleteContactFlowModuleResponse] = service.deleteContactFlowModule(params).promise().toFuture
    @inline def deleteHoursOfOperationFuture(params: DeleteHoursOfOperationRequest): Future[js.Object] = service.deleteHoursOfOperation(params).promise().toFuture
    @inline def deleteInstanceFuture(params: DeleteInstanceRequest): Future[js.Object] = service.deleteInstance(params).promise().toFuture
    @inline def deleteIntegrationAssociationFuture(params: DeleteIntegrationAssociationRequest): Future[js.Object] = service.deleteIntegrationAssociation(params).promise().toFuture
    @inline def deleteQuickConnectFuture(params: DeleteQuickConnectRequest): Future[js.Object] = service.deleteQuickConnect(params).promise().toFuture
    @inline def deleteRuleFuture(params: DeleteRuleRequest): Future[js.Object] = service.deleteRule(params).promise().toFuture
    @inline def deleteSecurityProfileFuture(params: DeleteSecurityProfileRequest): Future[js.Object] = service.deleteSecurityProfile(params).promise().toFuture
    @inline def deleteTaskTemplateFuture(params: DeleteTaskTemplateRequest): Future[DeleteTaskTemplateResponse] = service.deleteTaskTemplate(params).promise().toFuture
    @inline def deleteTrafficDistributionGroupFuture(params: DeleteTrafficDistributionGroupRequest): Future[DeleteTrafficDistributionGroupResponse] = service.deleteTrafficDistributionGroup(params).promise().toFuture
    @inline def deleteUseCaseFuture(params: DeleteUseCaseRequest): Future[js.Object] = service.deleteUseCase(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] = service.deleteUser(params).promise().toFuture
    @inline def deleteUserHierarchyGroupFuture(params: DeleteUserHierarchyGroupRequest): Future[js.Object] = service.deleteUserHierarchyGroup(params).promise().toFuture
    @inline def deleteVocabularyFuture(params: DeleteVocabularyRequest): Future[DeleteVocabularyResponse] = service.deleteVocabulary(params).promise().toFuture
    @inline def describeAgentStatusFuture(params: DescribeAgentStatusRequest): Future[DescribeAgentStatusResponse] = service.describeAgentStatus(params).promise().toFuture
    @inline def describeContactFlowFuture(params: DescribeContactFlowRequest): Future[DescribeContactFlowResponse] = service.describeContactFlow(params).promise().toFuture
    @inline def describeContactFlowModuleFuture(params: DescribeContactFlowModuleRequest): Future[DescribeContactFlowModuleResponse] = service.describeContactFlowModule(params).promise().toFuture
    @inline def describeContactFuture(params: DescribeContactRequest): Future[DescribeContactResponse] = service.describeContact(params).promise().toFuture
    @inline def describeHoursOfOperationFuture(params: DescribeHoursOfOperationRequest): Future[DescribeHoursOfOperationResponse] = service.describeHoursOfOperation(params).promise().toFuture
    @inline def describeInstanceAttributeFuture(params: DescribeInstanceAttributeRequest): Future[DescribeInstanceAttributeResponse] = service.describeInstanceAttribute(params).promise().toFuture
    @inline def describeInstanceFuture(params: DescribeInstanceRequest): Future[DescribeInstanceResponse] = service.describeInstance(params).promise().toFuture
    @inline def describeInstanceStorageConfigFuture(params: DescribeInstanceStorageConfigRequest): Future[DescribeInstanceStorageConfigResponse] = service.describeInstanceStorageConfig(params).promise().toFuture
    @inline def describePhoneNumberFuture(params: DescribePhoneNumberRequest): Future[DescribePhoneNumberResponse] = service.describePhoneNumber(params).promise().toFuture
    @inline def describeQueueFuture(params: DescribeQueueRequest): Future[DescribeQueueResponse] = service.describeQueue(params).promise().toFuture
    @inline def describeQuickConnectFuture(params: DescribeQuickConnectRequest): Future[DescribeQuickConnectResponse] = service.describeQuickConnect(params).promise().toFuture
    @inline def describeRoutingProfileFuture(params: DescribeRoutingProfileRequest): Future[DescribeRoutingProfileResponse] = service.describeRoutingProfile(params).promise().toFuture
    @inline def describeRuleFuture(params: DescribeRuleRequest): Future[DescribeRuleResponse] = service.describeRule(params).promise().toFuture
    @inline def describeSecurityProfileFuture(params: DescribeSecurityProfileRequest): Future[DescribeSecurityProfileResponse] = service.describeSecurityProfile(params).promise().toFuture
    @inline def describeTrafficDistributionGroupFuture(params: DescribeTrafficDistributionGroupRequest): Future[DescribeTrafficDistributionGroupResponse] = service.describeTrafficDistributionGroup(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] = service.describeUser(params).promise().toFuture
    @inline def describeUserHierarchyGroupFuture(params: DescribeUserHierarchyGroupRequest): Future[DescribeUserHierarchyGroupResponse] = service.describeUserHierarchyGroup(params).promise().toFuture
    @inline def describeUserHierarchyStructureFuture(params: DescribeUserHierarchyStructureRequest): Future[DescribeUserHierarchyStructureResponse] = service.describeUserHierarchyStructure(params).promise().toFuture
    @inline def describeVocabularyFuture(params: DescribeVocabularyRequest): Future[DescribeVocabularyResponse] = service.describeVocabulary(params).promise().toFuture
    @inline def disassociateApprovedOriginFuture(params: DisassociateApprovedOriginRequest): Future[js.Object] = service.disassociateApprovedOrigin(params).promise().toFuture
    @inline def disassociateBotFuture(params: DisassociateBotRequest): Future[js.Object] = service.disassociateBot(params).promise().toFuture
    @inline def disassociateInstanceStorageConfigFuture(params: DisassociateInstanceStorageConfigRequest): Future[js.Object] = service.disassociateInstanceStorageConfig(params).promise().toFuture
    @inline def disassociateLambdaFunctionFuture(params: DisassociateLambdaFunctionRequest): Future[js.Object] = service.disassociateLambdaFunction(params).promise().toFuture
    @inline def disassociateLexBotFuture(params: DisassociateLexBotRequest): Future[js.Object] = service.disassociateLexBot(params).promise().toFuture
    @inline def disassociatePhoneNumberContactFlowFuture(params: DisassociatePhoneNumberContactFlowRequest): Future[js.Object] = service.disassociatePhoneNumberContactFlow(params).promise().toFuture
    @inline def disassociateQueueQuickConnectsFuture(params: DisassociateQueueQuickConnectsRequest): Future[js.Object] = service.disassociateQueueQuickConnects(params).promise().toFuture
    @inline def disassociateRoutingProfileQueuesFuture(params: DisassociateRoutingProfileQueuesRequest): Future[js.Object] = service.disassociateRoutingProfileQueues(params).promise().toFuture
    @inline def disassociateSecurityKeyFuture(params: DisassociateSecurityKeyRequest): Future[js.Object] = service.disassociateSecurityKey(params).promise().toFuture
    @inline def dismissUserContactFuture(params: DismissUserContactRequest): Future[DismissUserContactResponse] = service.dismissUserContact(params).promise().toFuture
    @inline def getContactAttributesFuture(params: GetContactAttributesRequest): Future[GetContactAttributesResponse] = service.getContactAttributes(params).promise().toFuture
    @inline def getCurrentMetricDataFuture(params: GetCurrentMetricDataRequest): Future[GetCurrentMetricDataResponse] = service.getCurrentMetricData(params).promise().toFuture
    @inline def getCurrentUserDataFuture(params: GetCurrentUserDataRequest): Future[GetCurrentUserDataResponse] = service.getCurrentUserData(params).promise().toFuture
    @inline def getFederationTokenFuture(params: GetFederationTokenRequest): Future[GetFederationTokenResponse] = service.getFederationToken(params).promise().toFuture
    @inline def getMetricDataFuture(params: GetMetricDataRequest): Future[GetMetricDataResponse] = service.getMetricData(params).promise().toFuture
    @inline def getTaskTemplateFuture(params: GetTaskTemplateRequest): Future[GetTaskTemplateResponse] = service.getTaskTemplate(params).promise().toFuture
    @inline def getTrafficDistributionFuture(params: GetTrafficDistributionRequest): Future[GetTrafficDistributionResponse] = service.getTrafficDistribution(params).promise().toFuture
    @inline def listAgentStatusesFuture(params: ListAgentStatusRequest): Future[ListAgentStatusResponse] = service.listAgentStatuses(params).promise().toFuture
    @inline def listApprovedOriginsFuture(params: ListApprovedOriginsRequest): Future[ListApprovedOriginsResponse] = service.listApprovedOrigins(params).promise().toFuture
    @inline def listBotsFuture(params: ListBotsRequest): Future[ListBotsResponse] = service.listBots(params).promise().toFuture
    @inline def listContactFlowModulesFuture(params: ListContactFlowModulesRequest): Future[ListContactFlowModulesResponse] = service.listContactFlowModules(params).promise().toFuture
    @inline def listContactFlowsFuture(params: ListContactFlowsRequest): Future[ListContactFlowsResponse] = service.listContactFlows(params).promise().toFuture
    @inline def listContactReferencesFuture(params: ListContactReferencesRequest): Future[ListContactReferencesResponse] = service.listContactReferences(params).promise().toFuture
    @inline def listDefaultVocabulariesFuture(params: ListDefaultVocabulariesRequest): Future[ListDefaultVocabulariesResponse] = service.listDefaultVocabularies(params).promise().toFuture
    @inline def listHoursOfOperationsFuture(params: ListHoursOfOperationsRequest): Future[ListHoursOfOperationsResponse] = service.listHoursOfOperations(params).promise().toFuture
    @inline def listInstanceAttributesFuture(params: ListInstanceAttributesRequest): Future[ListInstanceAttributesResponse] = service.listInstanceAttributes(params).promise().toFuture
    @inline def listInstanceStorageConfigsFuture(params: ListInstanceStorageConfigsRequest): Future[ListInstanceStorageConfigsResponse] = service.listInstanceStorageConfigs(params).promise().toFuture
    @inline def listInstancesFuture(params: ListInstancesRequest): Future[ListInstancesResponse] = service.listInstances(params).promise().toFuture
    @inline def listIntegrationAssociationsFuture(params: ListIntegrationAssociationsRequest): Future[ListIntegrationAssociationsResponse] = service.listIntegrationAssociations(params).promise().toFuture
    @inline def listLambdaFunctionsFuture(params: ListLambdaFunctionsRequest): Future[ListLambdaFunctionsResponse] = service.listLambdaFunctions(params).promise().toFuture
    @inline def listLexBotsFuture(params: ListLexBotsRequest): Future[ListLexBotsResponse] = service.listLexBots(params).promise().toFuture
    @inline def listPhoneNumbersFuture(params: ListPhoneNumbersRequest): Future[ListPhoneNumbersResponse] = service.listPhoneNumbers(params).promise().toFuture
    @inline def listPhoneNumbersV2Future(params: ListPhoneNumbersV2Request): Future[ListPhoneNumbersV2Response] = service.listPhoneNumbersV2(params).promise().toFuture
    @inline def listPromptsFuture(params: ListPromptsRequest): Future[ListPromptsResponse] = service.listPrompts(params).promise().toFuture
    @inline def listQueueQuickConnectsFuture(params: ListQueueQuickConnectsRequest): Future[ListQueueQuickConnectsResponse] = service.listQueueQuickConnects(params).promise().toFuture
    @inline def listQueuesFuture(params: ListQueuesRequest): Future[ListQueuesResponse] = service.listQueues(params).promise().toFuture
    @inline def listQuickConnectsFuture(params: ListQuickConnectsRequest): Future[ListQuickConnectsResponse] = service.listQuickConnects(params).promise().toFuture
    @inline def listRoutingProfileQueuesFuture(params: ListRoutingProfileQueuesRequest): Future[ListRoutingProfileQueuesResponse] = service.listRoutingProfileQueues(params).promise().toFuture
    @inline def listRoutingProfilesFuture(params: ListRoutingProfilesRequest): Future[ListRoutingProfilesResponse] = service.listRoutingProfiles(params).promise().toFuture
    @inline def listRulesFuture(params: ListRulesRequest): Future[ListRulesResponse] = service.listRules(params).promise().toFuture
    @inline def listSecurityKeysFuture(params: ListSecurityKeysRequest): Future[ListSecurityKeysResponse] = service.listSecurityKeys(params).promise().toFuture
    @inline def listSecurityProfilePermissionsFuture(params: ListSecurityProfilePermissionsRequest): Future[ListSecurityProfilePermissionsResponse] = service.listSecurityProfilePermissions(params).promise().toFuture
    @inline def listSecurityProfilesFuture(params: ListSecurityProfilesRequest): Future[ListSecurityProfilesResponse] = service.listSecurityProfiles(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTaskTemplatesFuture(params: ListTaskTemplatesRequest): Future[ListTaskTemplatesResponse] = service.listTaskTemplates(params).promise().toFuture
    @inline def listTrafficDistributionGroupsFuture(params: ListTrafficDistributionGroupsRequest): Future[ListTrafficDistributionGroupsResponse] = service.listTrafficDistributionGroups(params).promise().toFuture
    @inline def listUseCasesFuture(params: ListUseCasesRequest): Future[ListUseCasesResponse] = service.listUseCases(params).promise().toFuture
    @inline def listUserHierarchyGroupsFuture(params: ListUserHierarchyGroupsRequest): Future[ListUserHierarchyGroupsResponse] = service.listUserHierarchyGroups(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture
    @inline def monitorContactFuture(params: MonitorContactRequest): Future[MonitorContactResponse] = service.monitorContact(params).promise().toFuture
    @inline def putUserStatusFuture(params: PutUserStatusRequest): Future[PutUserStatusResponse] = service.putUserStatus(params).promise().toFuture
    @inline def releasePhoneNumberFuture(params: ReleasePhoneNumberRequest): Future[js.Object] = service.releasePhoneNumber(params).promise().toFuture
    @inline def replicateInstanceFuture(params: ReplicateInstanceRequest): Future[ReplicateInstanceResponse] = service.replicateInstance(params).promise().toFuture
    @inline def resumeContactRecordingFuture(params: ResumeContactRecordingRequest): Future[ResumeContactRecordingResponse] = service.resumeContactRecording(params).promise().toFuture
    @inline def searchAvailablePhoneNumbersFuture(params: SearchAvailablePhoneNumbersRequest): Future[SearchAvailablePhoneNumbersResponse] = service.searchAvailablePhoneNumbers(params).promise().toFuture
    @inline def searchQueuesFuture(params: SearchQueuesRequest): Future[SearchQueuesResponse] = service.searchQueues(params).promise().toFuture
    @inline def searchRoutingProfilesFuture(params: SearchRoutingProfilesRequest): Future[SearchRoutingProfilesResponse] = service.searchRoutingProfiles(params).promise().toFuture
    @inline def searchSecurityProfilesFuture(params: SearchSecurityProfilesRequest): Future[SearchSecurityProfilesResponse] = service.searchSecurityProfiles(params).promise().toFuture
    @inline def searchUsersFuture(params: SearchUsersRequest): Future[SearchUsersResponse] = service.searchUsers(params).promise().toFuture
    @inline def searchVocabulariesFuture(params: SearchVocabulariesRequest): Future[SearchVocabulariesResponse] = service.searchVocabularies(params).promise().toFuture
    @inline def startChatContactFuture(params: StartChatContactRequest): Future[StartChatContactResponse] = service.startChatContact(params).promise().toFuture
    @inline def startContactRecordingFuture(params: StartContactRecordingRequest): Future[StartContactRecordingResponse] = service.startContactRecording(params).promise().toFuture
    @inline def startContactStreamingFuture(params: StartContactStreamingRequest): Future[StartContactStreamingResponse] = service.startContactStreaming(params).promise().toFuture
    @inline def startOutboundVoiceContactFuture(params: StartOutboundVoiceContactRequest): Future[StartOutboundVoiceContactResponse] = service.startOutboundVoiceContact(params).promise().toFuture
    @inline def startTaskContactFuture(params: StartTaskContactRequest): Future[StartTaskContactResponse] = service.startTaskContact(params).promise().toFuture
    @inline def stopContactFuture(params: StopContactRequest): Future[StopContactResponse] = service.stopContact(params).promise().toFuture
    @inline def stopContactRecordingFuture(params: StopContactRecordingRequest): Future[StopContactRecordingResponse] = service.stopContactRecording(params).promise().toFuture
    @inline def stopContactStreamingFuture(params: StopContactStreamingRequest): Future[StopContactStreamingResponse] = service.stopContactStreaming(params).promise().toFuture
    @inline def suspendContactRecordingFuture(params: SuspendContactRecordingRequest): Future[SuspendContactRecordingResponse] = service.suspendContactRecording(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def transferContactFuture(params: TransferContactRequest): Future[TransferContactResponse] = service.transferContact(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateAgentStatusFuture(params: UpdateAgentStatusRequest): Future[js.Object] = service.updateAgentStatus(params).promise().toFuture
    @inline def updateContactAttributesFuture(params: UpdateContactAttributesRequest): Future[UpdateContactAttributesResponse] = service.updateContactAttributes(params).promise().toFuture
    @inline def updateContactFlowContentFuture(params: UpdateContactFlowContentRequest): Future[js.Object] = service.updateContactFlowContent(params).promise().toFuture
    @inline def updateContactFlowMetadataFuture(params: UpdateContactFlowMetadataRequest): Future[js.Object] = service.updateContactFlowMetadata(params).promise().toFuture
    @inline def updateContactFlowModuleContentFuture(params: UpdateContactFlowModuleContentRequest): Future[UpdateContactFlowModuleContentResponse] = service.updateContactFlowModuleContent(params).promise().toFuture
    @inline def updateContactFlowModuleMetadataFuture(params: UpdateContactFlowModuleMetadataRequest): Future[UpdateContactFlowModuleMetadataResponse] = service.updateContactFlowModuleMetadata(params).promise().toFuture
    @inline def updateContactFlowNameFuture(params: UpdateContactFlowNameRequest): Future[js.Object] = service.updateContactFlowName(params).promise().toFuture
    @inline def updateContactFuture(params: UpdateContactRequest): Future[UpdateContactResponse] = service.updateContact(params).promise().toFuture
    @inline def updateContactScheduleFuture(params: UpdateContactScheduleRequest): Future[UpdateContactScheduleResponse] = service.updateContactSchedule(params).promise().toFuture
    @inline def updateHoursOfOperationFuture(params: UpdateHoursOfOperationRequest): Future[js.Object] = service.updateHoursOfOperation(params).promise().toFuture
    @inline def updateInstanceAttributeFuture(params: UpdateInstanceAttributeRequest): Future[js.Object] = service.updateInstanceAttribute(params).promise().toFuture
    @inline def updateInstanceStorageConfigFuture(params: UpdateInstanceStorageConfigRequest): Future[js.Object] = service.updateInstanceStorageConfig(params).promise().toFuture
    @inline def updatePhoneNumberFuture(params: UpdatePhoneNumberRequest): Future[UpdatePhoneNumberResponse] = service.updatePhoneNumber(params).promise().toFuture
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
    @inline def updateRuleFuture(params: UpdateRuleRequest): Future[js.Object] = service.updateRule(params).promise().toFuture
    @inline def updateSecurityProfileFuture(params: UpdateSecurityProfileRequest): Future[js.Object] = service.updateSecurityProfile(params).promise().toFuture
    @inline def updateTaskTemplateFuture(params: UpdateTaskTemplateRequest): Future[UpdateTaskTemplateResponse] = service.updateTaskTemplate(params).promise().toFuture
    @inline def updateTrafficDistributionFuture(params: UpdateTrafficDistributionRequest): Future[UpdateTrafficDistributionResponse] = service.updateTrafficDistribution(params).promise().toFuture
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
    def associateBot(params: AssociateBotRequest): Request[js.Object] = js.native
    def associateDefaultVocabulary(params: AssociateDefaultVocabularyRequest): Request[AssociateDefaultVocabularyResponse] = js.native
    def associateInstanceStorageConfig(params: AssociateInstanceStorageConfigRequest): Request[AssociateInstanceStorageConfigResponse] = js.native
    def associateLambdaFunction(params: AssociateLambdaFunctionRequest): Request[js.Object] = js.native
    def associateLexBot(params: AssociateLexBotRequest): Request[js.Object] = js.native
    def associatePhoneNumberContactFlow(params: AssociatePhoneNumberContactFlowRequest): Request[js.Object] = js.native
    def associateQueueQuickConnects(params: AssociateQueueQuickConnectsRequest): Request[js.Object] = js.native
    def associateRoutingProfileQueues(params: AssociateRoutingProfileQueuesRequest): Request[js.Object] = js.native
    def associateSecurityKey(params: AssociateSecurityKeyRequest): Request[AssociateSecurityKeyResponse] = js.native
    def claimPhoneNumber(params: ClaimPhoneNumberRequest): Request[ClaimPhoneNumberResponse] = js.native
    def createAgentStatus(params: CreateAgentStatusRequest): Request[CreateAgentStatusResponse] = js.native
    def createContactFlow(params: CreateContactFlowRequest): Request[CreateContactFlowResponse] = js.native
    def createContactFlowModule(params: CreateContactFlowModuleRequest): Request[CreateContactFlowModuleResponse] = js.native
    def createHoursOfOperation(params: CreateHoursOfOperationRequest): Request[CreateHoursOfOperationResponse] = js.native
    def createInstance(params: CreateInstanceRequest): Request[CreateInstanceResponse] = js.native
    def createIntegrationAssociation(params: CreateIntegrationAssociationRequest): Request[CreateIntegrationAssociationResponse] = js.native
    def createQueue(params: CreateQueueRequest): Request[CreateQueueResponse] = js.native
    def createQuickConnect(params: CreateQuickConnectRequest): Request[CreateQuickConnectResponse] = js.native
    def createRoutingProfile(params: CreateRoutingProfileRequest): Request[CreateRoutingProfileResponse] = js.native
    def createRule(params: CreateRuleRequest): Request[CreateRuleResponse] = js.native
    def createSecurityProfile(params: CreateSecurityProfileRequest): Request[CreateSecurityProfileResponse] = js.native
    def createTaskTemplate(params: CreateTaskTemplateRequest): Request[CreateTaskTemplateResponse] = js.native
    def createTrafficDistributionGroup(params: CreateTrafficDistributionGroupRequest): Request[CreateTrafficDistributionGroupResponse] = js.native
    def createUseCase(params: CreateUseCaseRequest): Request[CreateUseCaseResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def createUserHierarchyGroup(params: CreateUserHierarchyGroupRequest): Request[CreateUserHierarchyGroupResponse] = js.native
    def createVocabulary(params: CreateVocabularyRequest): Request[CreateVocabularyResponse] = js.native
    def deleteContactFlow(params: DeleteContactFlowRequest): Request[js.Object] = js.native
    def deleteContactFlowModule(params: DeleteContactFlowModuleRequest): Request[DeleteContactFlowModuleResponse] = js.native
    def deleteHoursOfOperation(params: DeleteHoursOfOperationRequest): Request[js.Object] = js.native
    def deleteInstance(params: DeleteInstanceRequest): Request[js.Object] = js.native
    def deleteIntegrationAssociation(params: DeleteIntegrationAssociationRequest): Request[js.Object] = js.native
    def deleteQuickConnect(params: DeleteQuickConnectRequest): Request[js.Object] = js.native
    def deleteRule(params: DeleteRuleRequest): Request[js.Object] = js.native
    def deleteSecurityProfile(params: DeleteSecurityProfileRequest): Request[js.Object] = js.native
    def deleteTaskTemplate(params: DeleteTaskTemplateRequest): Request[DeleteTaskTemplateResponse] = js.native
    def deleteTrafficDistributionGroup(params: DeleteTrafficDistributionGroupRequest): Request[DeleteTrafficDistributionGroupResponse] = js.native
    def deleteUseCase(params: DeleteUseCaseRequest): Request[js.Object] = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object] = js.native
    def deleteUserHierarchyGroup(params: DeleteUserHierarchyGroupRequest): Request[js.Object] = js.native
    def deleteVocabulary(params: DeleteVocabularyRequest): Request[DeleteVocabularyResponse] = js.native
    def describeAgentStatus(params: DescribeAgentStatusRequest): Request[DescribeAgentStatusResponse] = js.native
    def describeContact(params: DescribeContactRequest): Request[DescribeContactResponse] = js.native
    def describeContactFlow(params: DescribeContactFlowRequest): Request[DescribeContactFlowResponse] = js.native
    def describeContactFlowModule(params: DescribeContactFlowModuleRequest): Request[DescribeContactFlowModuleResponse] = js.native
    def describeHoursOfOperation(params: DescribeHoursOfOperationRequest): Request[DescribeHoursOfOperationResponse] = js.native
    def describeInstance(params: DescribeInstanceRequest): Request[DescribeInstanceResponse] = js.native
    def describeInstanceAttribute(params: DescribeInstanceAttributeRequest): Request[DescribeInstanceAttributeResponse] = js.native
    def describeInstanceStorageConfig(params: DescribeInstanceStorageConfigRequest): Request[DescribeInstanceStorageConfigResponse] = js.native
    def describePhoneNumber(params: DescribePhoneNumberRequest): Request[DescribePhoneNumberResponse] = js.native
    def describeQueue(params: DescribeQueueRequest): Request[DescribeQueueResponse] = js.native
    def describeQuickConnect(params: DescribeQuickConnectRequest): Request[DescribeQuickConnectResponse] = js.native
    def describeRoutingProfile(params: DescribeRoutingProfileRequest): Request[DescribeRoutingProfileResponse] = js.native
    def describeRule(params: DescribeRuleRequest): Request[DescribeRuleResponse] = js.native
    def describeSecurityProfile(params: DescribeSecurityProfileRequest): Request[DescribeSecurityProfileResponse] = js.native
    def describeTrafficDistributionGroup(params: DescribeTrafficDistributionGroupRequest): Request[DescribeTrafficDistributionGroupResponse] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def describeUserHierarchyGroup(params: DescribeUserHierarchyGroupRequest): Request[DescribeUserHierarchyGroupResponse] = js.native
    def describeUserHierarchyStructure(params: DescribeUserHierarchyStructureRequest): Request[DescribeUserHierarchyStructureResponse] = js.native
    def describeVocabulary(params: DescribeVocabularyRequest): Request[DescribeVocabularyResponse] = js.native
    def disassociateApprovedOrigin(params: DisassociateApprovedOriginRequest): Request[js.Object] = js.native
    def disassociateBot(params: DisassociateBotRequest): Request[js.Object] = js.native
    def disassociateInstanceStorageConfig(params: DisassociateInstanceStorageConfigRequest): Request[js.Object] = js.native
    def disassociateLambdaFunction(params: DisassociateLambdaFunctionRequest): Request[js.Object] = js.native
    def disassociateLexBot(params: DisassociateLexBotRequest): Request[js.Object] = js.native
    def disassociatePhoneNumberContactFlow(params: DisassociatePhoneNumberContactFlowRequest): Request[js.Object] = js.native
    def disassociateQueueQuickConnects(params: DisassociateQueueQuickConnectsRequest): Request[js.Object] = js.native
    def disassociateRoutingProfileQueues(params: DisassociateRoutingProfileQueuesRequest): Request[js.Object] = js.native
    def disassociateSecurityKey(params: DisassociateSecurityKeyRequest): Request[js.Object] = js.native
    def dismissUserContact(params: DismissUserContactRequest): Request[DismissUserContactResponse] = js.native
    def getContactAttributes(params: GetContactAttributesRequest): Request[GetContactAttributesResponse] = js.native
    def getCurrentMetricData(params: GetCurrentMetricDataRequest): Request[GetCurrentMetricDataResponse] = js.native
    def getCurrentUserData(params: GetCurrentUserDataRequest): Request[GetCurrentUserDataResponse] = js.native
    def getFederationToken(params: GetFederationTokenRequest): Request[GetFederationTokenResponse] = js.native
    def getMetricData(params: GetMetricDataRequest): Request[GetMetricDataResponse] = js.native
    def getTaskTemplate(params: GetTaskTemplateRequest): Request[GetTaskTemplateResponse] = js.native
    def getTrafficDistribution(params: GetTrafficDistributionRequest): Request[GetTrafficDistributionResponse] = js.native
    def listAgentStatuses(params: ListAgentStatusRequest): Request[ListAgentStatusResponse] = js.native
    def listApprovedOrigins(params: ListApprovedOriginsRequest): Request[ListApprovedOriginsResponse] = js.native
    def listBots(params: ListBotsRequest): Request[ListBotsResponse] = js.native
    def listContactFlowModules(params: ListContactFlowModulesRequest): Request[ListContactFlowModulesResponse] = js.native
    def listContactFlows(params: ListContactFlowsRequest): Request[ListContactFlowsResponse] = js.native
    def listContactReferences(params: ListContactReferencesRequest): Request[ListContactReferencesResponse] = js.native
    def listDefaultVocabularies(params: ListDefaultVocabulariesRequest): Request[ListDefaultVocabulariesResponse] = js.native
    def listHoursOfOperations(params: ListHoursOfOperationsRequest): Request[ListHoursOfOperationsResponse] = js.native
    def listInstanceAttributes(params: ListInstanceAttributesRequest): Request[ListInstanceAttributesResponse] = js.native
    def listInstanceStorageConfigs(params: ListInstanceStorageConfigsRequest): Request[ListInstanceStorageConfigsResponse] = js.native
    def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse] = js.native
    def listIntegrationAssociations(params: ListIntegrationAssociationsRequest): Request[ListIntegrationAssociationsResponse] = js.native
    def listLambdaFunctions(params: ListLambdaFunctionsRequest): Request[ListLambdaFunctionsResponse] = js.native
    def listLexBots(params: ListLexBotsRequest): Request[ListLexBotsResponse] = js.native
    def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse] = js.native
    def listPhoneNumbersV2(params: ListPhoneNumbersV2Request): Request[ListPhoneNumbersV2Response] = js.native
    def listPrompts(params: ListPromptsRequest): Request[ListPromptsResponse] = js.native
    def listQueueQuickConnects(params: ListQueueQuickConnectsRequest): Request[ListQueueQuickConnectsResponse] = js.native
    def listQueues(params: ListQueuesRequest): Request[ListQueuesResponse] = js.native
    def listQuickConnects(params: ListQuickConnectsRequest): Request[ListQuickConnectsResponse] = js.native
    def listRoutingProfileQueues(params: ListRoutingProfileQueuesRequest): Request[ListRoutingProfileQueuesResponse] = js.native
    def listRoutingProfiles(params: ListRoutingProfilesRequest): Request[ListRoutingProfilesResponse] = js.native
    def listRules(params: ListRulesRequest): Request[ListRulesResponse] = js.native
    def listSecurityKeys(params: ListSecurityKeysRequest): Request[ListSecurityKeysResponse] = js.native
    def listSecurityProfilePermissions(params: ListSecurityProfilePermissionsRequest): Request[ListSecurityProfilePermissionsResponse] = js.native
    def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTaskTemplates(params: ListTaskTemplatesRequest): Request[ListTaskTemplatesResponse] = js.native
    def listTrafficDistributionGroups(params: ListTrafficDistributionGroupsRequest): Request[ListTrafficDistributionGroupsResponse] = js.native
    def listUseCases(params: ListUseCasesRequest): Request[ListUseCasesResponse] = js.native
    def listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest): Request[ListUserHierarchyGroupsResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def monitorContact(params: MonitorContactRequest): Request[MonitorContactResponse] = js.native
    def putUserStatus(params: PutUserStatusRequest): Request[PutUserStatusResponse] = js.native
    def releasePhoneNumber(params: ReleasePhoneNumberRequest): Request[js.Object] = js.native
    def replicateInstance(params: ReplicateInstanceRequest): Request[ReplicateInstanceResponse] = js.native
    def resumeContactRecording(params: ResumeContactRecordingRequest): Request[ResumeContactRecordingResponse] = js.native
    def searchAvailablePhoneNumbers(params: SearchAvailablePhoneNumbersRequest): Request[SearchAvailablePhoneNumbersResponse] = js.native
    def searchQueues(params: SearchQueuesRequest): Request[SearchQueuesResponse] = js.native
    def searchRoutingProfiles(params: SearchRoutingProfilesRequest): Request[SearchRoutingProfilesResponse] = js.native
    def searchSecurityProfiles(params: SearchSecurityProfilesRequest): Request[SearchSecurityProfilesResponse] = js.native
    def searchUsers(params: SearchUsersRequest): Request[SearchUsersResponse] = js.native
    def searchVocabularies(params: SearchVocabulariesRequest): Request[SearchVocabulariesResponse] = js.native
    def startChatContact(params: StartChatContactRequest): Request[StartChatContactResponse] = js.native
    def startContactRecording(params: StartContactRecordingRequest): Request[StartContactRecordingResponse] = js.native
    def startContactStreaming(params: StartContactStreamingRequest): Request[StartContactStreamingResponse] = js.native
    def startOutboundVoiceContact(params: StartOutboundVoiceContactRequest): Request[StartOutboundVoiceContactResponse] = js.native
    def startTaskContact(params: StartTaskContactRequest): Request[StartTaskContactResponse] = js.native
    def stopContact(params: StopContactRequest): Request[StopContactResponse] = js.native
    def stopContactRecording(params: StopContactRecordingRequest): Request[StopContactRecordingResponse] = js.native
    def stopContactStreaming(params: StopContactStreamingRequest): Request[StopContactStreamingResponse] = js.native
    def suspendContactRecording(params: SuspendContactRecordingRequest): Request[SuspendContactRecordingResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def transferContact(params: TransferContactRequest): Request[TransferContactResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateAgentStatus(params: UpdateAgentStatusRequest): Request[js.Object] = js.native
    def updateContact(params: UpdateContactRequest): Request[UpdateContactResponse] = js.native
    def updateContactAttributes(params: UpdateContactAttributesRequest): Request[UpdateContactAttributesResponse] = js.native
    def updateContactFlowContent(params: UpdateContactFlowContentRequest): Request[js.Object] = js.native
    def updateContactFlowMetadata(params: UpdateContactFlowMetadataRequest): Request[js.Object] = js.native
    def updateContactFlowModuleContent(params: UpdateContactFlowModuleContentRequest): Request[UpdateContactFlowModuleContentResponse] = js.native
    def updateContactFlowModuleMetadata(params: UpdateContactFlowModuleMetadataRequest): Request[UpdateContactFlowModuleMetadataResponse] = js.native
    def updateContactFlowName(params: UpdateContactFlowNameRequest): Request[js.Object] = js.native
    def updateContactSchedule(params: UpdateContactScheduleRequest): Request[UpdateContactScheduleResponse] = js.native
    def updateHoursOfOperation(params: UpdateHoursOfOperationRequest): Request[js.Object] = js.native
    def updateInstanceAttribute(params: UpdateInstanceAttributeRequest): Request[js.Object] = js.native
    def updateInstanceStorageConfig(params: UpdateInstanceStorageConfigRequest): Request[js.Object] = js.native
    def updatePhoneNumber(params: UpdatePhoneNumberRequest): Request[UpdatePhoneNumberResponse] = js.native
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
    def updateRule(params: UpdateRuleRequest): Request[js.Object] = js.native
    def updateSecurityProfile(params: UpdateSecurityProfileRequest): Request[js.Object] = js.native
    def updateTaskTemplate(params: UpdateTaskTemplateRequest): Request[UpdateTaskTemplateResponse] = js.native
    def updateTrafficDistribution(params: UpdateTrafficDistributionRequest): Request[UpdateTrafficDistributionResponse] = js.native
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

  /** Information about an action.
    */
  @js.native
  trait ActionSummary extends js.Object {
    var ActionType: ActionType
  }

  object ActionSummary {
    @inline
    def apply(
        ActionType: ActionType
    ): ActionSummary = {
      val __obj = js.Dynamic.literal(
        "ActionType" -> ActionType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActionSummary]
    }
  }

  /** Information about the [[https://docs.aws.amazon.com/connect/latest/APIReference/API_Contact.html|contact]] associated to the user.
    */
  @js.native
  trait AgentContactReference extends js.Object {
    var AgentContactState: js.UndefOr[ContactState]
    var Channel: js.UndefOr[Channel]
    var ConnectedToAgentTimestamp: js.UndefOr[Timestamp]
    var ContactId: js.UndefOr[ContactId]
    var InitiationMethod: js.UndefOr[ContactInitiationMethod]
    var Queue: js.UndefOr[QueueReference]
    var StateStartTimestamp: js.UndefOr[Timestamp]
  }

  object AgentContactReference {
    @inline
    def apply(
        AgentContactState: js.UndefOr[ContactState] = js.undefined,
        Channel: js.UndefOr[Channel] = js.undefined,
        ConnectedToAgentTimestamp: js.UndefOr[Timestamp] = js.undefined,
        ContactId: js.UndefOr[ContactId] = js.undefined,
        InitiationMethod: js.UndefOr[ContactInitiationMethod] = js.undefined,
        Queue: js.UndefOr[QueueReference] = js.undefined,
        StateStartTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): AgentContactReference = {
      val __obj = js.Dynamic.literal()
      AgentContactState.foreach(__v => __obj.updateDynamic("AgentContactState")(__v.asInstanceOf[js.Any]))
      Channel.foreach(__v => __obj.updateDynamic("Channel")(__v.asInstanceOf[js.Any]))
      ConnectedToAgentTimestamp.foreach(__v => __obj.updateDynamic("ConnectedToAgentTimestamp")(__v.asInstanceOf[js.Any]))
      ContactId.foreach(__v => __obj.updateDynamic("ContactId")(__v.asInstanceOf[js.Any]))
      InitiationMethod.foreach(__v => __obj.updateDynamic("InitiationMethod")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      StateStartTimestamp.foreach(__v => __obj.updateDynamic("StateStartTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgentContactReference]
    }
  }

  /** Information about the agent who accepted the contact.
    */
  @js.native
  trait AgentInfo extends js.Object {
    var ConnectedToAgentTimestamp: js.UndefOr[timestamp]
    var Id: js.UndefOr[AgentResourceId]
  }

  object AgentInfo {
    @inline
    def apply(
        ConnectedToAgentTimestamp: js.UndefOr[timestamp] = js.undefined,
        Id: js.UndefOr[AgentResourceId] = js.undefined
    ): AgentInfo = {
      val __obj = js.Dynamic.literal()
      ConnectedToAgentTimestamp.foreach(__v => __obj.updateDynamic("ConnectedToAgentTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgentInfo]
    }
  }

  /** Contains information about an agent status.
    */
  @js.native
  trait AgentStatus extends js.Object {
    var AgentStatusARN: js.UndefOr[ARN]
    var AgentStatusId: js.UndefOr[AgentStatusId]
    var Description: js.UndefOr[AgentStatusDescription]
    var DisplayOrder: js.UndefOr[AgentStatusOrderNumber]
    var Name: js.UndefOr[AgentStatusName]
    var State: js.UndefOr[AgentStatusState]
    var Tags: js.UndefOr[TagMap]
    var Type: js.UndefOr[AgentStatusType]
  }

  object AgentStatus {
    @inline
    def apply(
        AgentStatusARN: js.UndefOr[ARN] = js.undefined,
        AgentStatusId: js.UndefOr[AgentStatusId] = js.undefined,
        Description: js.UndefOr[AgentStatusDescription] = js.undefined,
        DisplayOrder: js.UndefOr[AgentStatusOrderNumber] = js.undefined,
        Name: js.UndefOr[AgentStatusName] = js.undefined,
        State: js.UndefOr[AgentStatusState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Type: js.UndefOr[AgentStatusType] = js.undefined
    ): AgentStatus = {
      val __obj = js.Dynamic.literal()
      AgentStatusARN.foreach(__v => __obj.updateDynamic("AgentStatusARN")(__v.asInstanceOf[js.Any]))
      AgentStatusId.foreach(__v => __obj.updateDynamic("AgentStatusId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayOrder.foreach(__v => __obj.updateDynamic("DisplayOrder")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgentStatus]
    }
  }

  /** Information about the agent's status.
    */
  @js.native
  trait AgentStatusReference extends js.Object {
    var StatusArn: js.UndefOr[ARN]
    var StatusStartTimestamp: js.UndefOr[Timestamp]
  }

  object AgentStatusReference {
    @inline
    def apply(
        StatusArn: js.UndefOr[ARN] = js.undefined,
        StatusStartTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): AgentStatusReference = {
      val __obj = js.Dynamic.literal()
      StatusArn.foreach(__v => __obj.updateDynamic("StatusArn")(__v.asInstanceOf[js.Any]))
      StatusStartTimestamp.foreach(__v => __obj.updateDynamic("StatusStartTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgentStatusReference]
    }
  }

  /** Summary information for an agent status.
    */
  @js.native
  trait AgentStatusSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[AgentStatusId]
    var Name: js.UndefOr[AgentStatusName]
    var Type: js.UndefOr[AgentStatusType]
  }

  object AgentStatusSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[AgentStatusId] = js.undefined,
        Name: js.UndefOr[AgentStatusName] = js.undefined,
        Type: js.UndefOr[AgentStatusType] = js.undefined
    ): AgentStatusSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgentStatusSummary]
    }
  }

  /** Configuration of the answering machine detection.
    */
  @js.native
  trait AnswerMachineDetectionConfig extends js.Object {
    var AwaitAnswerMachinePrompt: js.UndefOr[Boolean]
    var EnableAnswerMachineDetection: js.UndefOr[Boolean]
  }

  object AnswerMachineDetectionConfig {
    @inline
    def apply(
        AwaitAnswerMachinePrompt: js.UndefOr[Boolean] = js.undefined,
        EnableAnswerMachineDetection: js.UndefOr[Boolean] = js.undefined
    ): AnswerMachineDetectionConfig = {
      val __obj = js.Dynamic.literal()
      AwaitAnswerMachinePrompt.foreach(__v => __obj.updateDynamic("AwaitAnswerMachinePrompt")(__v.asInstanceOf[js.Any]))
      EnableAnswerMachineDetection.foreach(__v => __obj.updateDynamic("EnableAnswerMachineDetection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnswerMachineDetectionConfig]
    }
  }

  /** This action must be set if <code>TriggerEventSource</code> is one of the following values: <code>OnPostCallAnalysisAvailable</code> | <code>OnRealTimeCallAnalysisAvailable</code> | <code>OnPostChatAnalysisAvailable</code>. Contact is categorized using the rule name. <code>RuleName</code> is used as <code>ContactCategory</code>.
    */
  @js.native
  trait AssignContactCategoryActionDefinition extends js.Object

  object AssignContactCategoryActionDefinition {
    @inline
    def apply(): AssignContactCategoryActionDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssignContactCategoryActionDefinition]
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
  trait AssociateBotRequest extends js.Object {
    var InstanceId: InstanceId
    var LexBot: js.UndefOr[LexBot]
    var LexV2Bot: js.UndefOr[LexV2Bot]
  }

  object AssociateBotRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        LexBot: js.UndefOr[LexBot] = js.undefined,
        LexV2Bot: js.UndefOr[LexV2Bot] = js.undefined
    ): AssociateBotRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      LexBot.foreach(__v => __obj.updateDynamic("LexBot")(__v.asInstanceOf[js.Any]))
      LexV2Bot.foreach(__v => __obj.updateDynamic("LexV2Bot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateBotRequest]
    }
  }

  @js.native
  trait AssociateDefaultVocabularyRequest extends js.Object {
    var InstanceId: InstanceId
    var LanguageCode: VocabularyLanguageCode
    var VocabularyId: js.UndefOr[VocabularyId]
  }

  object AssociateDefaultVocabularyRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        LanguageCode: VocabularyLanguageCode,
        VocabularyId: js.UndefOr[VocabularyId] = js.undefined
    ): AssociateDefaultVocabularyRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any]
      )

      VocabularyId.foreach(__v => __obj.updateDynamic("VocabularyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateDefaultVocabularyRequest]
    }
  }

  @js.native
  trait AssociateDefaultVocabularyResponse extends js.Object

  object AssociateDefaultVocabularyResponse {
    @inline
    def apply(): AssociateDefaultVocabularyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateDefaultVocabularyResponse]
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
  trait AssociatePhoneNumberContactFlowRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var InstanceId: InstanceId
    var PhoneNumberId: PhoneNumberId
  }

  object AssociatePhoneNumberContactFlowRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        InstanceId: InstanceId,
        PhoneNumberId: PhoneNumberId
    ): AssociatePhoneNumberContactFlowRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociatePhoneNumberContactFlowRequest]
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

  /** Information about a reference when the <code>referenceType</code> is <code>ATTACHMENT</code>. Otherwise, null.
    */
  @js.native
  trait AttachmentReference extends js.Object {
    var Name: js.UndefOr[ReferenceKey]
    var Status: js.UndefOr[ReferenceStatus]
    var Value: js.UndefOr[ReferenceValue]
  }

  object AttachmentReference {
    @inline
    def apply(
        Name: js.UndefOr[ReferenceKey] = js.undefined,
        Status: js.UndefOr[ReferenceStatus] = js.undefined,
        Value: js.UndefOr[ReferenceValue] = js.undefined
    ): AttachmentReference = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachmentReference]
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

  /** Information about available phone numbers.
    */
  @js.native
  trait AvailableNumberSummary extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
    var PhoneNumberCountryCode: js.UndefOr[PhoneNumberCountryCode]
    var PhoneNumberType: js.UndefOr[PhoneNumberType]
  }

  object AvailableNumberSummary {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined,
        PhoneNumberCountryCode: js.UndefOr[PhoneNumberCountryCode] = js.undefined,
        PhoneNumberType: js.UndefOr[PhoneNumberType] = js.undefined
    ): AvailableNumberSummary = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumberCountryCode.foreach(__v => __obj.updateDynamic("PhoneNumberCountryCode")(__v.asInstanceOf[js.Any]))
      PhoneNumberType.foreach(__v => __obj.updateDynamic("PhoneNumberType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailableNumberSummary]
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

  /** The streaming configuration, such as the Amazon SNS streaming endpoint.
    */
  @js.native
  trait ChatStreamingConfiguration extends js.Object {
    var StreamingEndpointArn: ChatStreamingEndpointARN
  }

  object ChatStreamingConfiguration {
    @inline
    def apply(
        StreamingEndpointArn: ChatStreamingEndpointARN
    ): ChatStreamingConfiguration = {
      val __obj = js.Dynamic.literal(
        "StreamingEndpointArn" -> StreamingEndpointArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ChatStreamingConfiguration]
    }
  }

  @js.native
  trait ClaimPhoneNumberRequest extends js.Object {
    var PhoneNumber: PhoneNumber
    var TargetArn: ARN
    var ClientToken: js.UndefOr[ClientToken]
    var PhoneNumberDescription: js.UndefOr[PhoneNumberDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object ClaimPhoneNumberRequest {
    @inline
    def apply(
        PhoneNumber: PhoneNumber,
        TargetArn: ARN,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        PhoneNumberDescription: js.UndefOr[PhoneNumberDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ClaimPhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumber" -> PhoneNumber.asInstanceOf[js.Any],
        "TargetArn" -> TargetArn.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberDescription.foreach(__v => __obj.updateDynamic("PhoneNumberDescription")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClaimPhoneNumberRequest]
    }
  }

  @js.native
  trait ClaimPhoneNumberResponse extends js.Object {
    var PhoneNumberArn: js.UndefOr[ARN]
    var PhoneNumberId: js.UndefOr[PhoneNumberId]
  }

  object ClaimPhoneNumberResponse {
    @inline
    def apply(
        PhoneNumberArn: js.UndefOr[ARN] = js.undefined,
        PhoneNumberId: js.UndefOr[PhoneNumberId] = js.undefined
    ): ClaimPhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberArn.foreach(__v => __obj.updateDynamic("PhoneNumberArn")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClaimPhoneNumberResponse]
    }
  }

  /** Information about a phone number that has been claimed to your Amazon Connect instance or traffic distribution group.
    */
  @js.native
  trait ClaimedPhoneNumberSummary extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
    var PhoneNumberArn: js.UndefOr[ARN]
    var PhoneNumberCountryCode: js.UndefOr[PhoneNumberCountryCode]
    var PhoneNumberDescription: js.UndefOr[PhoneNumberDescription]
    var PhoneNumberId: js.UndefOr[PhoneNumberId]
    var PhoneNumberStatus: js.UndefOr[PhoneNumberStatus]
    var PhoneNumberType: js.UndefOr[PhoneNumberType]
    var Tags: js.UndefOr[TagMap]
    var TargetArn: js.UndefOr[ARN]
  }

  object ClaimedPhoneNumberSummary {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined,
        PhoneNumberArn: js.UndefOr[ARN] = js.undefined,
        PhoneNumberCountryCode: js.UndefOr[PhoneNumberCountryCode] = js.undefined,
        PhoneNumberDescription: js.UndefOr[PhoneNumberDescription] = js.undefined,
        PhoneNumberId: js.UndefOr[PhoneNumberId] = js.undefined,
        PhoneNumberStatus: js.UndefOr[PhoneNumberStatus] = js.undefined,
        PhoneNumberType: js.UndefOr[PhoneNumberType] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        TargetArn: js.UndefOr[ARN] = js.undefined
    ): ClaimedPhoneNumberSummary = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumberArn.foreach(__v => __obj.updateDynamic("PhoneNumberArn")(__v.asInstanceOf[js.Any]))
      PhoneNumberCountryCode.foreach(__v => __obj.updateDynamic("PhoneNumberCountryCode")(__v.asInstanceOf[js.Any]))
      PhoneNumberDescription.foreach(__v => __obj.updateDynamic("PhoneNumberDescription")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      PhoneNumberStatus.foreach(__v => __obj.updateDynamic("PhoneNumberStatus")(__v.asInstanceOf[js.Any]))
      PhoneNumberType.foreach(__v => __obj.updateDynamic("PhoneNumberType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TargetArn.foreach(__v => __obj.updateDynamic("TargetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClaimedPhoneNumberSummary]
    }
  }

  /** Contains information about a contact.
    */
  @js.native
  trait Contact extends js.Object {
    var AgentInfo: js.UndefOr[AgentInfo]
    var Arn: js.UndefOr[ARN]
    var Channel: js.UndefOr[Channel]
    var Description: js.UndefOr[Description]
    var DisconnectTimestamp: js.UndefOr[timestamp]
    var Id: js.UndefOr[ContactId]
    var InitialContactId: js.UndefOr[ContactId]
    var InitiationMethod: js.UndefOr[ContactInitiationMethod]
    var InitiationTimestamp: js.UndefOr[timestamp]
    var LastUpdateTimestamp: js.UndefOr[timestamp]
    var Name: js.UndefOr[Name]
    var PreviousContactId: js.UndefOr[ContactId]
    var QueueInfo: js.UndefOr[QueueInfo]
    var ScheduledTimestamp: js.UndefOr[timestamp]
  }

  object Contact {
    @inline
    def apply(
        AgentInfo: js.UndefOr[AgentInfo] = js.undefined,
        Arn: js.UndefOr[ARN] = js.undefined,
        Channel: js.UndefOr[Channel] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DisconnectTimestamp: js.UndefOr[timestamp] = js.undefined,
        Id: js.UndefOr[ContactId] = js.undefined,
        InitialContactId: js.UndefOr[ContactId] = js.undefined,
        InitiationMethod: js.UndefOr[ContactInitiationMethod] = js.undefined,
        InitiationTimestamp: js.UndefOr[timestamp] = js.undefined,
        LastUpdateTimestamp: js.UndefOr[timestamp] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        PreviousContactId: js.UndefOr[ContactId] = js.undefined,
        QueueInfo: js.UndefOr[QueueInfo] = js.undefined,
        ScheduledTimestamp: js.UndefOr[timestamp] = js.undefined
    ): Contact = {
      val __obj = js.Dynamic.literal()
      AgentInfo.foreach(__v => __obj.updateDynamic("AgentInfo")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Channel.foreach(__v => __obj.updateDynamic("Channel")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisconnectTimestamp.foreach(__v => __obj.updateDynamic("DisconnectTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InitialContactId.foreach(__v => __obj.updateDynamic("InitialContactId")(__v.asInstanceOf[js.Any]))
      InitiationMethod.foreach(__v => __obj.updateDynamic("InitiationMethod")(__v.asInstanceOf[js.Any]))
      InitiationTimestamp.foreach(__v => __obj.updateDynamic("InitiationTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdateTimestamp.foreach(__v => __obj.updateDynamic("LastUpdateTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PreviousContactId.foreach(__v => __obj.updateDynamic("PreviousContactId")(__v.asInstanceOf[js.Any]))
      QueueInfo.foreach(__v => __obj.updateDynamic("QueueInfo")(__v.asInstanceOf[js.Any]))
      ScheduledTimestamp.foreach(__v => __obj.updateDynamic("ScheduledTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Contact]
    }
  }

  /** Filters user data based on the contact information that is associated to the users. It contains a list of [[https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html|contact states]].
    */
  @js.native
  trait ContactFilter extends js.Object {
    var ContactStates: js.UndefOr[ContactStates]
  }

  object ContactFilter {
    @inline
    def apply(
        ContactStates: js.UndefOr[ContactStates] = js.undefined
    ): ContactFilter = {
      val __obj = js.Dynamic.literal()
      ContactStates.foreach(__v => __obj.updateDynamic("ContactStates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactFilter]
    }
  }

  /** Contains information about a flow.
    */
  @js.native
  trait ContactFlow extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Content: js.UndefOr[ContactFlowContent]
    var Description: js.UndefOr[ContactFlowDescription]
    var Id: js.UndefOr[ContactFlowId]
    var Name: js.UndefOr[ContactFlowName]
    var State: js.UndefOr[ContactFlowState]
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
        State: js.UndefOr[ContactFlowState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Type: js.UndefOr[ContactFlowType] = js.undefined
    ): ContactFlow = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactFlow]
    }
  }

  /** Contains information about a flow module.
    */
  @js.native
  trait ContactFlowModule extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Content: js.UndefOr[ContactFlowModuleContent]
    var Description: js.UndefOr[ContactFlowModuleDescription]
    var Id: js.UndefOr[ContactFlowModuleId]
    var Name: js.UndefOr[ContactFlowModuleName]
    var State: js.UndefOr[ContactFlowModuleState]
    var Status: js.UndefOr[ContactFlowModuleStatus]
    var Tags: js.UndefOr[TagMap]
  }

  object ContactFlowModule {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Content: js.UndefOr[ContactFlowModuleContent] = js.undefined,
        Description: js.UndefOr[ContactFlowModuleDescription] = js.undefined,
        Id: js.UndefOr[ContactFlowModuleId] = js.undefined,
        Name: js.UndefOr[ContactFlowModuleName] = js.undefined,
        State: js.UndefOr[ContactFlowModuleState] = js.undefined,
        Status: js.UndefOr[ContactFlowModuleStatus] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ContactFlowModule = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactFlowModule]
    }
  }

  /** Contains summary information about a flow.
    */
  @js.native
  trait ContactFlowModuleSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[ContactFlowModuleId]
    var Name: js.UndefOr[ContactFlowModuleName]
    var State: js.UndefOr[ContactFlowModuleState]
  }

  object ContactFlowModuleSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[ContactFlowModuleId] = js.undefined,
        Name: js.UndefOr[ContactFlowModuleName] = js.undefined,
        State: js.UndefOr[ContactFlowModuleState] = js.undefined
    ): ContactFlowModuleSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactFlowModuleSummary]
    }
  }

  /** Contains summary information about a flow. You can also create and update flows using the [[https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html|Amazon Connect Flow language]].
    */
  @js.native
  trait ContactFlowSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var ContactFlowState: js.UndefOr[ContactFlowState]
    var ContactFlowType: js.UndefOr[ContactFlowType]
    var Id: js.UndefOr[ContactFlowId]
    var Name: js.UndefOr[ContactFlowName]
  }

  object ContactFlowSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        ContactFlowState: js.UndefOr[ContactFlowState] = js.undefined,
        ContactFlowType: js.UndefOr[ContactFlowType] = js.undefined,
        Id: js.UndefOr[ContactFlowId] = js.undefined,
        Name: js.UndefOr[ContactFlowName] = js.undefined
    ): ContactFlowSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ContactFlowState.foreach(__v => __obj.updateDynamic("ContactFlowState")(__v.asInstanceOf[js.Any]))
      ContactFlowType.foreach(__v => __obj.updateDynamic("ContactFlowType")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactFlowSummary]
    }
  }

  /** An object that can be used to specify Tag conditions inside the <code>SearchFilter</code>. This accepts an <code>OR</code> of <code>AND</code> (List of List) input where: * Top level list specifies conditions that need to be applied with <code>OR</code> operator * Inner list specifies conditions that need to be applied with <code>AND</code> operator.
    */
  @js.native
  trait ControlPlaneTagFilter extends js.Object {
    var AndConditions: js.UndefOr[TagAndConditionList]
    var OrConditions: js.UndefOr[TagOrConditionList]
    var TagCondition: js.UndefOr[TagCondition]
  }

  object ControlPlaneTagFilter {
    @inline
    def apply(
        AndConditions: js.UndefOr[TagAndConditionList] = js.undefined,
        OrConditions: js.UndefOr[TagOrConditionList] = js.undefined,
        TagCondition: js.UndefOr[TagCondition] = js.undefined
    ): ControlPlaneTagFilter = {
      val __obj = js.Dynamic.literal()
      AndConditions.foreach(__v => __obj.updateDynamic("AndConditions")(__v.asInstanceOf[js.Any]))
      OrConditions.foreach(__v => __obj.updateDynamic("OrConditions")(__v.asInstanceOf[js.Any]))
      TagCondition.foreach(__v => __obj.updateDynamic("TagCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ControlPlaneTagFilter]
    }
  }

  @js.native
  trait CreateAgentStatusRequest extends js.Object {
    var InstanceId: InstanceId
    var Name: AgentStatusName
    var State: AgentStatusState
    var Description: js.UndefOr[AgentStatusDescription]
    var DisplayOrder: js.UndefOr[AgentStatusOrderNumber]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateAgentStatusRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        Name: AgentStatusName,
        State: AgentStatusState,
        Description: js.UndefOr[AgentStatusDescription] = js.undefined,
        DisplayOrder: js.UndefOr[AgentStatusOrderNumber] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAgentStatusRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayOrder.foreach(__v => __obj.updateDynamic("DisplayOrder")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAgentStatusRequest]
    }
  }

  @js.native
  trait CreateAgentStatusResponse extends js.Object {
    var AgentStatusARN: js.UndefOr[ARN]
    var AgentStatusId: js.UndefOr[AgentStatusId]
  }

  object CreateAgentStatusResponse {
    @inline
    def apply(
        AgentStatusARN: js.UndefOr[ARN] = js.undefined,
        AgentStatusId: js.UndefOr[AgentStatusId] = js.undefined
    ): CreateAgentStatusResponse = {
      val __obj = js.Dynamic.literal()
      AgentStatusARN.foreach(__v => __obj.updateDynamic("AgentStatusARN")(__v.asInstanceOf[js.Any]))
      AgentStatusId.foreach(__v => __obj.updateDynamic("AgentStatusId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAgentStatusResponse]
    }
  }

  @js.native
  trait CreateContactFlowModuleRequest extends js.Object {
    var Content: ContactFlowModuleContent
    var InstanceId: InstanceId
    var Name: ContactFlowModuleName
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[ContactFlowModuleDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateContactFlowModuleRequest {
    @inline
    def apply(
        Content: ContactFlowModuleContent,
        InstanceId: InstanceId,
        Name: ContactFlowModuleName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[ContactFlowModuleDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateContactFlowModuleRequest = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContactFlowModuleRequest]
    }
  }

  @js.native
  trait CreateContactFlowModuleResponse extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[ContactFlowModuleId]
  }

  object CreateContactFlowModuleResponse {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[ContactFlowModuleId] = js.undefined
    ): CreateContactFlowModuleResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContactFlowModuleResponse]
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
  trait CreateHoursOfOperationRequest extends js.Object {
    var Config: HoursOfOperationConfigList
    var InstanceId: InstanceId
    var Name: CommonNameLength127
    var TimeZone: TimeZone
    var Description: js.UndefOr[HoursOfOperationDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateHoursOfOperationRequest {
    @inline
    def apply(
        Config: HoursOfOperationConfigList,
        InstanceId: InstanceId,
        Name: CommonNameLength127,
        TimeZone: TimeZone,
        Description: js.UndefOr[HoursOfOperationDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateHoursOfOperationRequest = {
      val __obj = js.Dynamic.literal(
        "Config" -> Config.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "TimeZone" -> TimeZone.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHoursOfOperationRequest]
    }
  }

  @js.native
  trait CreateHoursOfOperationResponse extends js.Object {
    var HoursOfOperationArn: js.UndefOr[ARN]
    var HoursOfOperationId: js.UndefOr[HoursOfOperationId]
  }

  object CreateHoursOfOperationResponse {
    @inline
    def apply(
        HoursOfOperationArn: js.UndefOr[ARN] = js.undefined,
        HoursOfOperationId: js.UndefOr[HoursOfOperationId] = js.undefined
    ): CreateHoursOfOperationResponse = {
      val __obj = js.Dynamic.literal()
      HoursOfOperationArn.foreach(__v => __obj.updateDynamic("HoursOfOperationArn")(__v.asInstanceOf[js.Any]))
      HoursOfOperationId.foreach(__v => __obj.updateDynamic("HoursOfOperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHoursOfOperationResponse]
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
    var SourceApplicationName: js.UndefOr[SourceApplicationName]
    var SourceApplicationUrl: js.UndefOr[URI]
    var SourceType: js.UndefOr[SourceType]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateIntegrationAssociationRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        IntegrationArn: ARN,
        IntegrationType: IntegrationType,
        SourceApplicationName: js.UndefOr[SourceApplicationName] = js.undefined,
        SourceApplicationUrl: js.UndefOr[URI] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateIntegrationAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "IntegrationArn" -> IntegrationArn.asInstanceOf[js.Any],
        "IntegrationType" -> IntegrationType.asInstanceOf[js.Any]
      )

      SourceApplicationName.foreach(__v => __obj.updateDynamic("SourceApplicationName")(__v.asInstanceOf[js.Any]))
      SourceApplicationUrl.foreach(__v => __obj.updateDynamic("SourceApplicationUrl")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
  trait CreateRuleRequest extends js.Object {
    var Actions: RuleActions
    var Function: RuleFunction
    var InstanceId: InstanceId
    var Name: RuleName
    var PublishStatus: RulePublishStatus
    var TriggerEventSource: RuleTriggerEventSource
    var ClientToken: js.UndefOr[ClientToken]
  }

  object CreateRuleRequest {
    @inline
    def apply(
        Actions: RuleActions,
        Function: RuleFunction,
        InstanceId: InstanceId,
        Name: RuleName,
        PublishStatus: RulePublishStatus,
        TriggerEventSource: RuleTriggerEventSource,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): CreateRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any],
        "Function" -> Function.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "PublishStatus" -> PublishStatus.asInstanceOf[js.Any],
        "TriggerEventSource" -> TriggerEventSource.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleRequest]
    }
  }

  @js.native
  trait CreateRuleResponse extends js.Object {
    var RuleArn: ARN
    var RuleId: RuleId
  }

  object CreateRuleResponse {
    @inline
    def apply(
        RuleArn: ARN,
        RuleId: RuleId
    ): CreateRuleResponse = {
      val __obj = js.Dynamic.literal(
        "RuleArn" -> RuleArn.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRuleResponse]
    }
  }

  @js.native
  trait CreateSecurityProfileRequest extends js.Object {
    var InstanceId: InstanceId
    var SecurityProfileName: CreateSecurityProfileName
    var AllowedAccessControlTags: js.UndefOr[AllowedAccessControlTags]
    var Description: js.UndefOr[SecurityProfileDescription]
    var Permissions: js.UndefOr[PermissionsList]
    var TagRestrictedResources: js.UndefOr[TagRestrictedResourceList]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateSecurityProfileRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        SecurityProfileName: CreateSecurityProfileName,
        AllowedAccessControlTags: js.UndefOr[AllowedAccessControlTags] = js.undefined,
        Description: js.UndefOr[SecurityProfileDescription] = js.undefined,
        Permissions: js.UndefOr[PermissionsList] = js.undefined,
        TagRestrictedResources: js.UndefOr[TagRestrictedResourceList] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateSecurityProfileRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "SecurityProfileName" -> SecurityProfileName.asInstanceOf[js.Any]
      )

      AllowedAccessControlTags.foreach(__v => __obj.updateDynamic("AllowedAccessControlTags")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      TagRestrictedResources.foreach(__v => __obj.updateDynamic("TagRestrictedResources")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSecurityProfileRequest]
    }
  }

  @js.native
  trait CreateSecurityProfileResponse extends js.Object {
    var SecurityProfileArn: js.UndefOr[ARN]
    var SecurityProfileId: js.UndefOr[SecurityProfileId]
  }

  object CreateSecurityProfileResponse {
    @inline
    def apply(
        SecurityProfileArn: js.UndefOr[ARN] = js.undefined,
        SecurityProfileId: js.UndefOr[SecurityProfileId] = js.undefined
    ): CreateSecurityProfileResponse = {
      val __obj = js.Dynamic.literal()
      SecurityProfileArn.foreach(__v => __obj.updateDynamic("SecurityProfileArn")(__v.asInstanceOf[js.Any]))
      SecurityProfileId.foreach(__v => __obj.updateDynamic("SecurityProfileId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSecurityProfileResponse]
    }
  }

  @js.native
  trait CreateTaskTemplateRequest extends js.Object {
    var Fields: TaskTemplateFields
    var InstanceId: InstanceId
    var Name: TaskTemplateName
    var ClientToken: js.UndefOr[ClientToken]
    var Constraints: js.UndefOr[TaskTemplateConstraints]
    var ContactFlowId: js.UndefOr[ContactFlowId]
    var Defaults: js.UndefOr[TaskTemplateDefaults]
    var Description: js.UndefOr[TaskTemplateDescription]
    var Status: js.UndefOr[TaskTemplateStatus]
  }

  object CreateTaskTemplateRequest {
    @inline
    def apply(
        Fields: TaskTemplateFields,
        InstanceId: InstanceId,
        Name: TaskTemplateName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Constraints: js.UndefOr[TaskTemplateConstraints] = js.undefined,
        ContactFlowId: js.UndefOr[ContactFlowId] = js.undefined,
        Defaults: js.UndefOr[TaskTemplateDefaults] = js.undefined,
        Description: js.UndefOr[TaskTemplateDescription] = js.undefined,
        Status: js.UndefOr[TaskTemplateStatus] = js.undefined
    ): CreateTaskTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "Fields" -> Fields.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Constraints.foreach(__v => __obj.updateDynamic("Constraints")(__v.asInstanceOf[js.Any]))
      ContactFlowId.foreach(__v => __obj.updateDynamic("ContactFlowId")(__v.asInstanceOf[js.Any]))
      Defaults.foreach(__v => __obj.updateDynamic("Defaults")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTaskTemplateRequest]
    }
  }

  @js.native
  trait CreateTaskTemplateResponse extends js.Object {
    var Arn: TaskTemplateArn
    var Id: TaskTemplateId
  }

  object CreateTaskTemplateResponse {
    @inline
    def apply(
        Arn: TaskTemplateArn,
        Id: TaskTemplateId
    ): CreateTaskTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateTaskTemplateResponse]
    }
  }

  @js.native
  trait CreateTrafficDistributionGroupRequest extends js.Object {
    var InstanceId: InstanceIdOrArn
    var Name: Name128
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[Description250]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateTrafficDistributionGroupRequest {
    @inline
    def apply(
        InstanceId: InstanceIdOrArn,
        Name: Name128,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[Description250] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateTrafficDistributionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrafficDistributionGroupRequest]
    }
  }

  @js.native
  trait CreateTrafficDistributionGroupResponse extends js.Object {
    var Arn: js.UndefOr[TrafficDistributionGroupArn]
    var Id: js.UndefOr[TrafficDistributionGroupId]
  }

  object CreateTrafficDistributionGroupResponse {
    @inline
    def apply(
        Arn: js.UndefOr[TrafficDistributionGroupArn] = js.undefined,
        Id: js.UndefOr[TrafficDistributionGroupId] = js.undefined
    ): CreateTrafficDistributionGroupResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrafficDistributionGroupResponse]
    }
  }

  @js.native
  trait CreateUseCaseRequest extends js.Object {
    var InstanceId: InstanceId
    var IntegrationAssociationId: IntegrationAssociationId
    var UseCaseType: UseCaseType
    var Tags: js.UndefOr[TagMap]
  }

  object CreateUseCaseRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        IntegrationAssociationId: IntegrationAssociationId,
        UseCaseType: UseCaseType,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateUseCaseRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "IntegrationAssociationId" -> IntegrationAssociationId.asInstanceOf[js.Any],
        "UseCaseType" -> UseCaseType.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    var Tags: js.UndefOr[TagMap]
  }

  object CreateUserHierarchyGroupRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        Name: HierarchyGroupName,
        ParentGroupId: js.UndefOr[HierarchyGroupId] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateUserHierarchyGroupRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ParentGroupId.foreach(__v => __obj.updateDynamic("ParentGroupId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait CreateVocabularyRequest extends js.Object {
    var Content: VocabularyContent
    var InstanceId: InstanceId
    var LanguageCode: VocabularyLanguageCode
    var VocabularyName: VocabularyName
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateVocabularyRequest {
    @inline
    def apply(
        Content: VocabularyContent,
        InstanceId: InstanceId,
        LanguageCode: VocabularyLanguageCode,
        VocabularyName: VocabularyName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateVocabularyRequest = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVocabularyRequest]
    }
  }

  @js.native
  trait CreateVocabularyResponse extends js.Object {
    var State: VocabularyState
    var VocabularyArn: ARN
    var VocabularyId: VocabularyId
  }

  object CreateVocabularyResponse {
    @inline
    def apply(
        State: VocabularyState,
        VocabularyArn: ARN,
        VocabularyId: VocabularyId
    ): CreateVocabularyResponse = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any],
        "VocabularyArn" -> VocabularyArn.asInstanceOf[js.Any],
        "VocabularyId" -> VocabularyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateVocabularyResponse]
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

  /** Information about a reference when the <code>referenceType</code> is <code>DATE</code>. Otherwise, null.
    */
  @js.native
  trait DateReference extends js.Object {
    var Name: js.UndefOr[ReferenceKey]
    var Value: js.UndefOr[ReferenceValue]
  }

  object DateReference {
    @inline
    def apply(
        Name: js.UndefOr[ReferenceKey] = js.undefined,
        Value: js.UndefOr[ReferenceValue] = js.undefined
    ): DateReference = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateReference]
    }
  }

  /** Contains information about a default vocabulary.
    */
  @js.native
  trait DefaultVocabulary extends js.Object {
    var InstanceId: InstanceId
    var LanguageCode: VocabularyLanguageCode
    var VocabularyId: VocabularyId
    var VocabularyName: VocabularyName
  }

  object DefaultVocabulary {
    @inline
    def apply(
        InstanceId: InstanceId,
        LanguageCode: VocabularyLanguageCode,
        VocabularyId: VocabularyId,
        VocabularyName: VocabularyName
    ): DefaultVocabulary = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "VocabularyId" -> VocabularyId.asInstanceOf[js.Any],
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefaultVocabulary]
    }
  }

  @js.native
  trait DeleteContactFlowModuleRequest extends js.Object {
    var ContactFlowModuleId: ContactFlowModuleId
    var InstanceId: InstanceId
  }

  object DeleteContactFlowModuleRequest {
    @inline
    def apply(
        ContactFlowModuleId: ContactFlowModuleId,
        InstanceId: InstanceId
    ): DeleteContactFlowModuleRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowModuleId" -> ContactFlowModuleId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteContactFlowModuleRequest]
    }
  }

  @js.native
  trait DeleteContactFlowModuleResponse extends js.Object

  object DeleteContactFlowModuleResponse {
    @inline
    def apply(): DeleteContactFlowModuleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteContactFlowModuleResponse]
    }
  }

  @js.native
  trait DeleteContactFlowRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var InstanceId: InstanceId
  }

  object DeleteContactFlowRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        InstanceId: InstanceId
    ): DeleteContactFlowRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteContactFlowRequest]
    }
  }

  @js.native
  trait DeleteHoursOfOperationRequest extends js.Object {
    var HoursOfOperationId: HoursOfOperationId
    var InstanceId: InstanceId
  }

  object DeleteHoursOfOperationRequest {
    @inline
    def apply(
        HoursOfOperationId: HoursOfOperationId,
        InstanceId: InstanceId
    ): DeleteHoursOfOperationRequest = {
      val __obj = js.Dynamic.literal(
        "HoursOfOperationId" -> HoursOfOperationId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteHoursOfOperationRequest]
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
  trait DeleteRuleRequest extends js.Object {
    var InstanceId: InstanceId
    var RuleId: RuleId
  }

  object DeleteRuleRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        RuleId: RuleId
    ): DeleteRuleRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRuleRequest]
    }
  }

  @js.native
  trait DeleteSecurityProfileRequest extends js.Object {
    var InstanceId: InstanceId
    var SecurityProfileId: SecurityProfileId
  }

  object DeleteSecurityProfileRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        SecurityProfileId: SecurityProfileId
    ): DeleteSecurityProfileRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "SecurityProfileId" -> SecurityProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSecurityProfileRequest]
    }
  }

  @js.native
  trait DeleteTaskTemplateRequest extends js.Object {
    var InstanceId: InstanceId
    var TaskTemplateId: TaskTemplateId
  }

  object DeleteTaskTemplateRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        TaskTemplateId: TaskTemplateId
    ): DeleteTaskTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "TaskTemplateId" -> TaskTemplateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTaskTemplateRequest]
    }
  }

  @js.native
  trait DeleteTaskTemplateResponse extends js.Object

  object DeleteTaskTemplateResponse {
    @inline
    def apply(): DeleteTaskTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTaskTemplateResponse]
    }
  }

  @js.native
  trait DeleteTrafficDistributionGroupRequest extends js.Object {
    var TrafficDistributionGroupId: TrafficDistributionGroupIdOrArn
  }

  object DeleteTrafficDistributionGroupRequest {
    @inline
    def apply(
        TrafficDistributionGroupId: TrafficDistributionGroupIdOrArn
    ): DeleteTrafficDistributionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "TrafficDistributionGroupId" -> TrafficDistributionGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTrafficDistributionGroupRequest]
    }
  }

  @js.native
  trait DeleteTrafficDistributionGroupResponse extends js.Object

  object DeleteTrafficDistributionGroupResponse {
    @inline
    def apply(): DeleteTrafficDistributionGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTrafficDistributionGroupResponse]
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
  trait DeleteVocabularyRequest extends js.Object {
    var InstanceId: InstanceId
    var VocabularyId: VocabularyId
  }

  object DeleteVocabularyRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        VocabularyId: VocabularyId
    ): DeleteVocabularyRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "VocabularyId" -> VocabularyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVocabularyRequest]
    }
  }

  @js.native
  trait DeleteVocabularyResponse extends js.Object {
    var State: VocabularyState
    var VocabularyArn: ARN
    var VocabularyId: VocabularyId
  }

  object DeleteVocabularyResponse {
    @inline
    def apply(
        State: VocabularyState,
        VocabularyArn: ARN,
        VocabularyId: VocabularyId
    ): DeleteVocabularyResponse = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any],
        "VocabularyArn" -> VocabularyArn.asInstanceOf[js.Any],
        "VocabularyId" -> VocabularyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVocabularyResponse]
    }
  }

  @js.native
  trait DescribeAgentStatusRequest extends js.Object {
    var AgentStatusId: AgentStatusId
    var InstanceId: InstanceId
  }

  object DescribeAgentStatusRequest {
    @inline
    def apply(
        AgentStatusId: AgentStatusId,
        InstanceId: InstanceId
    ): DescribeAgentStatusRequest = {
      val __obj = js.Dynamic.literal(
        "AgentStatusId" -> AgentStatusId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAgentStatusRequest]
    }
  }

  @js.native
  trait DescribeAgentStatusResponse extends js.Object {
    var AgentStatus: js.UndefOr[AgentStatus]
  }

  object DescribeAgentStatusResponse {
    @inline
    def apply(
        AgentStatus: js.UndefOr[AgentStatus] = js.undefined
    ): DescribeAgentStatusResponse = {
      val __obj = js.Dynamic.literal()
      AgentStatus.foreach(__v => __obj.updateDynamic("AgentStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAgentStatusResponse]
    }
  }

  @js.native
  trait DescribeContactFlowModuleRequest extends js.Object {
    var ContactFlowModuleId: ContactFlowModuleId
    var InstanceId: InstanceId
  }

  object DescribeContactFlowModuleRequest {
    @inline
    def apply(
        ContactFlowModuleId: ContactFlowModuleId,
        InstanceId: InstanceId
    ): DescribeContactFlowModuleRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowModuleId" -> ContactFlowModuleId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeContactFlowModuleRequest]
    }
  }

  @js.native
  trait DescribeContactFlowModuleResponse extends js.Object {
    var ContactFlowModule: js.UndefOr[ContactFlowModule]
  }

  object DescribeContactFlowModuleResponse {
    @inline
    def apply(
        ContactFlowModule: js.UndefOr[ContactFlowModule] = js.undefined
    ): DescribeContactFlowModuleResponse = {
      val __obj = js.Dynamic.literal()
      ContactFlowModule.foreach(__v => __obj.updateDynamic("ContactFlowModule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContactFlowModuleResponse]
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
  trait DescribeContactRequest extends js.Object {
    var ContactId: ContactId
    var InstanceId: InstanceId
  }

  object DescribeContactRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InstanceId: InstanceId
    ): DescribeContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeContactRequest]
    }
  }

  @js.native
  trait DescribeContactResponse extends js.Object {
    var Contact: js.UndefOr[Contact]
  }

  object DescribeContactResponse {
    @inline
    def apply(
        Contact: js.UndefOr[Contact] = js.undefined
    ): DescribeContactResponse = {
      val __obj = js.Dynamic.literal()
      Contact.foreach(__v => __obj.updateDynamic("Contact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContactResponse]
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
  trait DescribePhoneNumberRequest extends js.Object {
    var PhoneNumberId: PhoneNumberId
  }

  object DescribePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: PhoneNumberId
    ): DescribePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePhoneNumberRequest]
    }
  }

  @js.native
  trait DescribePhoneNumberResponse extends js.Object {
    var ClaimedPhoneNumberSummary: js.UndefOr[ClaimedPhoneNumberSummary]
  }

  object DescribePhoneNumberResponse {
    @inline
    def apply(
        ClaimedPhoneNumberSummary: js.UndefOr[ClaimedPhoneNumberSummary] = js.undefined
    ): DescribePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      ClaimedPhoneNumberSummary.foreach(__v => __obj.updateDynamic("ClaimedPhoneNumberSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePhoneNumberResponse]
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
  trait DescribeRuleRequest extends js.Object {
    var InstanceId: InstanceId
    var RuleId: RuleId
  }

  object DescribeRuleRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        RuleId: RuleId
    ): DescribeRuleRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRuleRequest]
    }
  }

  @js.native
  trait DescribeRuleResponse extends js.Object {
    var Rule: Rule
  }

  object DescribeRuleResponse {
    @inline
    def apply(
        Rule: Rule
    ): DescribeRuleResponse = {
      val __obj = js.Dynamic.literal(
        "Rule" -> Rule.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRuleResponse]
    }
  }

  @js.native
  trait DescribeSecurityProfileRequest extends js.Object {
    var InstanceId: InstanceId
    var SecurityProfileId: SecurityProfileId
  }

  object DescribeSecurityProfileRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        SecurityProfileId: SecurityProfileId
    ): DescribeSecurityProfileRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "SecurityProfileId" -> SecurityProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSecurityProfileRequest]
    }
  }

  @js.native
  trait DescribeSecurityProfileResponse extends js.Object {
    var SecurityProfile: js.UndefOr[SecurityProfile]
  }

  object DescribeSecurityProfileResponse {
    @inline
    def apply(
        SecurityProfile: js.UndefOr[SecurityProfile] = js.undefined
    ): DescribeSecurityProfileResponse = {
      val __obj = js.Dynamic.literal()
      SecurityProfile.foreach(__v => __obj.updateDynamic("SecurityProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSecurityProfileResponse]
    }
  }

  @js.native
  trait DescribeTrafficDistributionGroupRequest extends js.Object {
    var TrafficDistributionGroupId: TrafficDistributionGroupIdOrArn
  }

  object DescribeTrafficDistributionGroupRequest {
    @inline
    def apply(
        TrafficDistributionGroupId: TrafficDistributionGroupIdOrArn
    ): DescribeTrafficDistributionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "TrafficDistributionGroupId" -> TrafficDistributionGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTrafficDistributionGroupRequest]
    }
  }

  @js.native
  trait DescribeTrafficDistributionGroupResponse extends js.Object {
    var TrafficDistributionGroup: js.UndefOr[TrafficDistributionGroup]
  }

  object DescribeTrafficDistributionGroupResponse {
    @inline
    def apply(
        TrafficDistributionGroup: js.UndefOr[TrafficDistributionGroup] = js.undefined
    ): DescribeTrafficDistributionGroupResponse = {
      val __obj = js.Dynamic.literal()
      TrafficDistributionGroup.foreach(__v => __obj.updateDynamic("TrafficDistributionGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrafficDistributionGroupResponse]
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

  @js.native
  trait DescribeVocabularyRequest extends js.Object {
    var InstanceId: InstanceId
    var VocabularyId: VocabularyId
  }

  object DescribeVocabularyRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        VocabularyId: VocabularyId
    ): DescribeVocabularyRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "VocabularyId" -> VocabularyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeVocabularyRequest]
    }
  }

  @js.native
  trait DescribeVocabularyResponse extends js.Object {
    var Vocabulary: Vocabulary
  }

  object DescribeVocabularyResponse {
    @inline
    def apply(
        Vocabulary: Vocabulary
    ): DescribeVocabularyResponse = {
      val __obj = js.Dynamic.literal(
        "Vocabulary" -> Vocabulary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeVocabularyResponse]
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
  trait DisassociateBotRequest extends js.Object {
    var InstanceId: InstanceId
    var LexBot: js.UndefOr[LexBot]
    var LexV2Bot: js.UndefOr[LexV2Bot]
  }

  object DisassociateBotRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        LexBot: js.UndefOr[LexBot] = js.undefined,
        LexV2Bot: js.UndefOr[LexV2Bot] = js.undefined
    ): DisassociateBotRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      LexBot.foreach(__v => __obj.updateDynamic("LexBot")(__v.asInstanceOf[js.Any]))
      LexV2Bot.foreach(__v => __obj.updateDynamic("LexV2Bot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateBotRequest]
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
  trait DisassociatePhoneNumberContactFlowRequest extends js.Object {
    var InstanceId: InstanceId
    var PhoneNumberId: PhoneNumberId
  }

  object DisassociatePhoneNumberContactFlowRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        PhoneNumberId: PhoneNumberId
    ): DisassociatePhoneNumberContactFlowRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociatePhoneNumberContactFlowRequest]
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

  @js.native
  trait DismissUserContactRequest extends js.Object {
    var ContactId: ContactId
    var InstanceId: InstanceId
    var UserId: UserId
  }

  object DismissUserContactRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InstanceId: InstanceId,
        UserId: UserId
    ): DismissUserContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DismissUserContactRequest]
    }
  }

  @js.native
  trait DismissUserContactResponse extends js.Object

  object DismissUserContactResponse {
    @inline
    def apply(): DismissUserContactResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DismissUserContactResponse]
    }
  }

  /** Information about a traffic distribution.
    */
  @js.native
  trait Distribution extends js.Object {
    var Percentage: Percentage
    var Region: AwsRegion
  }

  object Distribution {
    @inline
    def apply(
        Percentage: Percentage,
        Region: AwsRegion
    ): Distribution = {
      val __obj = js.Dynamic.literal(
        "Percentage" -> Percentage.asInstanceOf[js.Any],
        "Region" -> Region.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Distribution]
    }
  }

  /** Information about a reference when the <code>referenceType</code> is <code>EMAIL</code>. Otherwise, null.
    */
  @js.native
  trait EmailReference extends js.Object {
    var Name: js.UndefOr[ReferenceKey]
    var Value: js.UndefOr[ReferenceValue]
  }

  object EmailReference {
    @inline
    def apply(
        Name: js.UndefOr[ReferenceKey] = js.undefined,
        Value: js.UndefOr[ReferenceValue] = js.undefined
    ): EmailReference = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailReference]
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

  /** The EventBridge action definition.
    */
  @js.native
  trait EventBridgeActionDefinition extends js.Object {
    var Name: EventBridgeActionName
  }

  object EventBridgeActionDefinition {
    @inline
    def apply(
        Name: EventBridgeActionName
    ): EventBridgeActionDefinition = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EventBridgeActionDefinition]
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
  trait GetCurrentUserDataRequest extends js.Object {
    var Filters: UserDataFilters
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCurrentUserDataRequest {
    @inline
    def apply(
        Filters: UserDataFilters,
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCurrentUserDataRequest = {
      val __obj = js.Dynamic.literal(
        "Filters" -> Filters.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCurrentUserDataRequest]
    }
  }

  @js.native
  trait GetCurrentUserDataResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var UserDataList: js.UndefOr[UserDataList]
  }

  object GetCurrentUserDataResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        UserDataList: js.UndefOr[UserDataList] = js.undefined
    ): GetCurrentUserDataResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserDataList.foreach(__v => __obj.updateDynamic("UserDataList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCurrentUserDataResponse]
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
    var SignInUrl: js.UndefOr[Url]
    var UserArn: js.UndefOr[ARN]
    var UserId: js.UndefOr[AgentResourceId]
  }

  object GetFederationTokenResponse {
    @inline
    def apply(
        Credentials: js.UndefOr[Credentials] = js.undefined,
        SignInUrl: js.UndefOr[Url] = js.undefined,
        UserArn: js.UndefOr[ARN] = js.undefined,
        UserId: js.UndefOr[AgentResourceId] = js.undefined
    ): GetFederationTokenResponse = {
      val __obj = js.Dynamic.literal()
      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      SignInUrl.foreach(__v => __obj.updateDynamic("SignInUrl")(__v.asInstanceOf[js.Any]))
      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait GetTaskTemplateRequest extends js.Object {
    var InstanceId: InstanceId
    var TaskTemplateId: TaskTemplateId
    var SnapshotVersion: js.UndefOr[SnapshotVersion]
  }

  object GetTaskTemplateRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        TaskTemplateId: TaskTemplateId,
        SnapshotVersion: js.UndefOr[SnapshotVersion] = js.undefined
    ): GetTaskTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "TaskTemplateId" -> TaskTemplateId.asInstanceOf[js.Any]
      )

      SnapshotVersion.foreach(__v => __obj.updateDynamic("SnapshotVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTaskTemplateRequest]
    }
  }

  @js.native
  trait GetTaskTemplateResponse extends js.Object {
    var Arn: TaskTemplateArn
    var Id: TaskTemplateId
    var Name: TaskTemplateName
    var Constraints: js.UndefOr[TaskTemplateConstraints]
    var ContactFlowId: js.UndefOr[ContactFlowId]
    var CreatedTime: js.UndefOr[timestamp]
    var Defaults: js.UndefOr[TaskTemplateDefaults]
    var Description: js.UndefOr[TaskTemplateDescription]
    var Fields: js.UndefOr[TaskTemplateFields]
    var InstanceId: js.UndefOr[InstanceId]
    var LastModifiedTime: js.UndefOr[timestamp]
    var Status: js.UndefOr[TaskTemplateStatus]
    var Tags: js.UndefOr[TagMap]
  }

  object GetTaskTemplateResponse {
    @inline
    def apply(
        Arn: TaskTemplateArn,
        Id: TaskTemplateId,
        Name: TaskTemplateName,
        Constraints: js.UndefOr[TaskTemplateConstraints] = js.undefined,
        ContactFlowId: js.UndefOr[ContactFlowId] = js.undefined,
        CreatedTime: js.UndefOr[timestamp] = js.undefined,
        Defaults: js.UndefOr[TaskTemplateDefaults] = js.undefined,
        Description: js.UndefOr[TaskTemplateDescription] = js.undefined,
        Fields: js.UndefOr[TaskTemplateFields] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        LastModifiedTime: js.UndefOr[timestamp] = js.undefined,
        Status: js.UndefOr[TaskTemplateStatus] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetTaskTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Constraints.foreach(__v => __obj.updateDynamic("Constraints")(__v.asInstanceOf[js.Any]))
      ContactFlowId.foreach(__v => __obj.updateDynamic("ContactFlowId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Defaults.foreach(__v => __obj.updateDynamic("Defaults")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTaskTemplateResponse]
    }
  }

  @js.native
  trait GetTrafficDistributionRequest extends js.Object {
    var Id: TrafficDistributionGroupIdOrArn
  }

  object GetTrafficDistributionRequest {
    @inline
    def apply(
        Id: TrafficDistributionGroupIdOrArn
    ): GetTrafficDistributionRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTrafficDistributionRequest]
    }
  }

  @js.native
  trait GetTrafficDistributionResponse extends js.Object {
    var Arn: js.UndefOr[TrafficDistributionGroupArn]
    var Id: js.UndefOr[TrafficDistributionGroupId]
    var TelephonyConfig: js.UndefOr[TelephonyConfig]
  }

  object GetTrafficDistributionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[TrafficDistributionGroupArn] = js.undefined,
        Id: js.UndefOr[TrafficDistributionGroupId] = js.undefined,
        TelephonyConfig: js.UndefOr[TelephonyConfig] = js.undefined
    ): GetTrafficDistributionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      TelephonyConfig.foreach(__v => __obj.updateDynamic("TelephonyConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTrafficDistributionResponse]
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
    var Tags: js.UndefOr[TagMap]
  }

  object HierarchyGroup {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        HierarchyPath: js.UndefOr[HierarchyPath] = js.undefined,
        Id: js.UndefOr[HierarchyGroupId] = js.undefined,
        LevelId: js.UndefOr[HierarchyLevelId] = js.undefined,
        Name: js.UndefOr[HierarchyGroupName] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): HierarchyGroup = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      HierarchyPath.foreach(__v => __obj.updateDynamic("HierarchyPath")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LevelId.foreach(__v => __obj.updateDynamic("LevelId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyGroup]
    }
  }

  /** A leaf node condition which can be used to specify a hierarchy group condition.
    */
  @js.native
  trait HierarchyGroupCondition extends js.Object {
    var HierarchyGroupMatchType: js.UndefOr[HierarchyGroupMatchType]
    var Value: js.UndefOr[String]
  }

  object HierarchyGroupCondition {
    @inline
    def apply(
        HierarchyGroupMatchType: js.UndefOr[HierarchyGroupMatchType] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): HierarchyGroupCondition = {
      val __obj = js.Dynamic.literal()
      HierarchyGroupMatchType.foreach(__v => __obj.updateDynamic("HierarchyGroupMatchType")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyGroupCondition]
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

  /** Information about the hierarchy group.
    */
  @js.native
  trait HierarchyGroupSummaryReference extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[HierarchyGroupId]
  }

  object HierarchyGroupSummaryReference {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[HierarchyGroupId] = js.undefined
    ): HierarchyGroupSummaryReference = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyGroupSummaryReference]
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

  /** Information about the levels in the hierarchy group.
    */
  @js.native
  trait HierarchyPathReference extends js.Object {
    var LevelFive: js.UndefOr[HierarchyGroupSummaryReference]
    var LevelFour: js.UndefOr[HierarchyGroupSummaryReference]
    var LevelOne: js.UndefOr[HierarchyGroupSummaryReference]
    var LevelThree: js.UndefOr[HierarchyGroupSummaryReference]
    var LevelTwo: js.UndefOr[HierarchyGroupSummaryReference]
  }

  object HierarchyPathReference {
    @inline
    def apply(
        LevelFive: js.UndefOr[HierarchyGroupSummaryReference] = js.undefined,
        LevelFour: js.UndefOr[HierarchyGroupSummaryReference] = js.undefined,
        LevelOne: js.UndefOr[HierarchyGroupSummaryReference] = js.undefined,
        LevelThree: js.UndefOr[HierarchyGroupSummaryReference] = js.undefined,
        LevelTwo: js.UndefOr[HierarchyGroupSummaryReference] = js.undefined
    ): HierarchyPathReference = {
      val __obj = js.Dynamic.literal()
      LevelFive.foreach(__v => __obj.updateDynamic("LevelFive")(__v.asInstanceOf[js.Any]))
      LevelFour.foreach(__v => __obj.updateDynamic("LevelFour")(__v.asInstanceOf[js.Any]))
      LevelOne.foreach(__v => __obj.updateDynamic("LevelOne")(__v.asInstanceOf[js.Any]))
      LevelThree.foreach(__v => __obj.updateDynamic("LevelThree")(__v.asInstanceOf[js.Any]))
      LevelTwo.foreach(__v => __obj.updateDynamic("LevelTwo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyPathReference]
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
    var Description: js.UndefOr[HoursOfOperationDescription]
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
        Description: js.UndefOr[HoursOfOperationDescription] = js.undefined,
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
    var Day: HoursOfOperationDays
    var EndTime: HoursOfOperationTimeSlice
    var StartTime: HoursOfOperationTimeSlice
  }

  object HoursOfOperationConfig {
    @inline
    def apply(
        Day: HoursOfOperationDays,
        EndTime: HoursOfOperationTimeSlice,
        StartTime: HoursOfOperationTimeSlice
    ): HoursOfOperationConfig = {
      val __obj = js.Dynamic.literal(
        "Day" -> Day.asInstanceOf[js.Any],
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )
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
    var Hours: Hours24Format
    var Minutes: MinutesLimit60
  }

  object HoursOfOperationTimeSlice {
    @inline
    def apply(
        Hours: Hours24Format,
        Minutes: MinutesLimit60
    ): HoursOfOperationTimeSlice = {
      val __obj = js.Dynamic.literal(
        "Hours" -> Hours.asInstanceOf[js.Any],
        "Minutes" -> Minutes.asInstanceOf[js.Any]
      )
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

  /** A field that is invisible to an agent.
    */
  @js.native
  trait InvisibleFieldInfo extends js.Object {
    var Id: js.UndefOr[TaskTemplateFieldIdentifier]
  }

  object InvisibleFieldInfo {
    @inline
    def apply(
        Id: js.UndefOr[TaskTemplateFieldIdentifier] = js.undefined
    ): InvisibleFieldInfo = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InvisibleFieldInfo]
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

  /** Configuration information of an Amazon Lex or Amazon Lex V2 bot.
    */
  @js.native
  trait LexBotConfig extends js.Object {
    var LexBot: js.UndefOr[LexBot]
    var LexV2Bot: js.UndefOr[LexV2Bot]
  }

  object LexBotConfig {
    @inline
    def apply(
        LexBot: js.UndefOr[LexBot] = js.undefined,
        LexV2Bot: js.UndefOr[LexV2Bot] = js.undefined
    ): LexBotConfig = {
      val __obj = js.Dynamic.literal()
      LexBot.foreach(__v => __obj.updateDynamic("LexBot")(__v.asInstanceOf[js.Any]))
      LexV2Bot.foreach(__v => __obj.updateDynamic("LexV2Bot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LexBotConfig]
    }
  }

  /** Configuration information of an Amazon Lex V2 bot.
    */
  @js.native
  trait LexV2Bot extends js.Object {
    var AliasArn: js.UndefOr[AliasArn]
  }

  object LexV2Bot {
    @inline
    def apply(
        AliasArn: js.UndefOr[AliasArn] = js.undefined
    ): LexV2Bot = {
      val __obj = js.Dynamic.literal()
      AliasArn.foreach(__v => __obj.updateDynamic("AliasArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LexV2Bot]
    }
  }

  @js.native
  trait ListAgentStatusRequest extends js.Object {
    var InstanceId: InstanceId
    var AgentStatusTypes: js.UndefOr[AgentStatusTypes]
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAgentStatusRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        AgentStatusTypes: js.UndefOr[AgentStatusTypes] = js.undefined,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAgentStatusRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      AgentStatusTypes.foreach(__v => __obj.updateDynamic("AgentStatusTypes")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAgentStatusRequest]
    }
  }

  @js.native
  trait ListAgentStatusResponse extends js.Object {
    var AgentStatusSummaryList: js.UndefOr[AgentStatusSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAgentStatusResponse {
    @inline
    def apply(
        AgentStatusSummaryList: js.UndefOr[AgentStatusSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAgentStatusResponse = {
      val __obj = js.Dynamic.literal()
      AgentStatusSummaryList.foreach(__v => __obj.updateDynamic("AgentStatusSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAgentStatusResponse]
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
  trait ListBotsRequest extends js.Object {
    var InstanceId: InstanceId
    var LexVersion: LexVersion
    var MaxResults: js.UndefOr[MaxResult25]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListBotsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        LexVersion: LexVersion,
        MaxResults: js.UndefOr[MaxResult25] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBotsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "LexVersion" -> LexVersion.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotsRequest]
    }
  }

  @js.native
  trait ListBotsResponse extends js.Object {
    var LexBots: js.UndefOr[LexBotConfigList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListBotsResponse {
    @inline
    def apply(
        LexBots: js.UndefOr[LexBotConfigList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBotsResponse = {
      val __obj = js.Dynamic.literal()
      LexBots.foreach(__v => __obj.updateDynamic("LexBots")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotsResponse]
    }
  }

  @js.native
  trait ListContactFlowModulesRequest extends js.Object {
    var InstanceId: InstanceId
    var ContactFlowModuleState: js.UndefOr[ContactFlowModuleState]
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListContactFlowModulesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        ContactFlowModuleState: js.UndefOr[ContactFlowModuleState] = js.undefined,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListContactFlowModulesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      ContactFlowModuleState.foreach(__v => __obj.updateDynamic("ContactFlowModuleState")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactFlowModulesRequest]
    }
  }

  @js.native
  trait ListContactFlowModulesResponse extends js.Object {
    var ContactFlowModulesSummaryList: js.UndefOr[ContactFlowModulesSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListContactFlowModulesResponse {
    @inline
    def apply(
        ContactFlowModulesSummaryList: js.UndefOr[ContactFlowModulesSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListContactFlowModulesResponse = {
      val __obj = js.Dynamic.literal()
      ContactFlowModulesSummaryList.foreach(__v => __obj.updateDynamic("ContactFlowModulesSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactFlowModulesResponse]
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
  trait ListContactReferencesRequest extends js.Object {
    var ContactId: ContactId
    var InstanceId: InstanceId
    var ReferenceTypes: ReferenceTypes
    var NextToken: js.UndefOr[NextToken]
  }

  object ListContactReferencesRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InstanceId: InstanceId,
        ReferenceTypes: ReferenceTypes,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListContactReferencesRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ReferenceTypes" -> ReferenceTypes.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactReferencesRequest]
    }
  }

  @js.native
  trait ListContactReferencesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ReferenceSummaryList: js.UndefOr[ReferenceSummaryList]
  }

  object ListContactReferencesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ReferenceSummaryList: js.UndefOr[ReferenceSummaryList] = js.undefined
    ): ListContactReferencesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ReferenceSummaryList.foreach(__v => __obj.updateDynamic("ReferenceSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactReferencesResponse]
    }
  }

  @js.native
  trait ListDefaultVocabulariesRequest extends js.Object {
    var InstanceId: InstanceId
    var LanguageCode: js.UndefOr[VocabularyLanguageCode]
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[VocabularyNextToken]
  }

  object ListDefaultVocabulariesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        LanguageCode: js.UndefOr[VocabularyLanguageCode] = js.undefined,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[VocabularyNextToken] = js.undefined
    ): ListDefaultVocabulariesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDefaultVocabulariesRequest]
    }
  }

  @js.native
  trait ListDefaultVocabulariesResponse extends js.Object {
    var DefaultVocabularyList: DefaultVocabularyList
    var NextToken: js.UndefOr[VocabularyNextToken]
  }

  object ListDefaultVocabulariesResponse {
    @inline
    def apply(
        DefaultVocabularyList: DefaultVocabularyList,
        NextToken: js.UndefOr[VocabularyNextToken] = js.undefined
    ): ListDefaultVocabulariesResponse = {
      val __obj = js.Dynamic.literal(
        "DefaultVocabularyList" -> DefaultVocabularyList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDefaultVocabulariesResponse]
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
    var IntegrationType: js.UndefOr[IntegrationType]
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIntegrationAssociationsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        IntegrationType: js.UndefOr[IntegrationType] = js.undefined,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIntegrationAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      IntegrationType.foreach(__v => __obj.updateDynamic("IntegrationType")(__v.asInstanceOf[js.Any]))
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

  /** Information about phone numbers that have been claimed to your Amazon Connect instance or traffic distribution group.
    */
  @js.native
  trait ListPhoneNumbersSummary extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
    var PhoneNumberArn: js.UndefOr[ARN]
    var PhoneNumberCountryCode: js.UndefOr[PhoneNumberCountryCode]
    var PhoneNumberId: js.UndefOr[PhoneNumberId]
    var PhoneNumberType: js.UndefOr[PhoneNumberType]
    var TargetArn: js.UndefOr[ARN]
  }

  object ListPhoneNumbersSummary {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined,
        PhoneNumberArn: js.UndefOr[ARN] = js.undefined,
        PhoneNumberCountryCode: js.UndefOr[PhoneNumberCountryCode] = js.undefined,
        PhoneNumberId: js.UndefOr[PhoneNumberId] = js.undefined,
        PhoneNumberType: js.UndefOr[PhoneNumberType] = js.undefined,
        TargetArn: js.UndefOr[ARN] = js.undefined
    ): ListPhoneNumbersSummary = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumberArn.foreach(__v => __obj.updateDynamic("PhoneNumberArn")(__v.asInstanceOf[js.Any]))
      PhoneNumberCountryCode.foreach(__v => __obj.updateDynamic("PhoneNumberCountryCode")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      PhoneNumberType.foreach(__v => __obj.updateDynamic("PhoneNumberType")(__v.asInstanceOf[js.Any]))
      TargetArn.foreach(__v => __obj.updateDynamic("TargetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersSummary]
    }
  }

  @js.native
  trait ListPhoneNumbersV2Request extends js.Object {
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[LargeNextToken]
    var PhoneNumberCountryCodes: js.UndefOr[PhoneNumberCountryCodes]
    var PhoneNumberPrefix: js.UndefOr[PhoneNumberPrefix]
    var PhoneNumberTypes: js.UndefOr[PhoneNumberTypes]
    var TargetArn: js.UndefOr[ARN]
  }

  object ListPhoneNumbersV2Request {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[LargeNextToken] = js.undefined,
        PhoneNumberCountryCodes: js.UndefOr[PhoneNumberCountryCodes] = js.undefined,
        PhoneNumberPrefix: js.UndefOr[PhoneNumberPrefix] = js.undefined,
        PhoneNumberTypes: js.UndefOr[PhoneNumberTypes] = js.undefined,
        TargetArn: js.UndefOr[ARN] = js.undefined
    ): ListPhoneNumbersV2Request = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberCountryCodes.foreach(__v => __obj.updateDynamic("PhoneNumberCountryCodes")(__v.asInstanceOf[js.Any]))
      PhoneNumberPrefix.foreach(__v => __obj.updateDynamic("PhoneNumberPrefix")(__v.asInstanceOf[js.Any]))
      PhoneNumberTypes.foreach(__v => __obj.updateDynamic("PhoneNumberTypes")(__v.asInstanceOf[js.Any]))
      TargetArn.foreach(__v => __obj.updateDynamic("TargetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersV2Request]
    }
  }

  @js.native
  trait ListPhoneNumbersV2Response extends js.Object {
    var ListPhoneNumbersSummaryList: js.UndefOr[ListPhoneNumbersSummaryList]
    var NextToken: js.UndefOr[LargeNextToken]
  }

  object ListPhoneNumbersV2Response {
    @inline
    def apply(
        ListPhoneNumbersSummaryList: js.UndefOr[ListPhoneNumbersSummaryList] = js.undefined,
        NextToken: js.UndefOr[LargeNextToken] = js.undefined
    ): ListPhoneNumbersV2Response = {
      val __obj = js.Dynamic.literal()
      ListPhoneNumbersSummaryList.foreach(__v => __obj.updateDynamic("ListPhoneNumbersSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersV2Response]
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
  trait ListRulesRequest extends js.Object {
    var InstanceId: InstanceId
    var EventSourceName: js.UndefOr[EventSourceName]
    var MaxResults: js.UndefOr[MaxResult200]
    var NextToken: js.UndefOr[NextToken]
    var PublishStatus: js.UndefOr[RulePublishStatus]
  }

  object ListRulesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        EventSourceName: js.UndefOr[EventSourceName] = js.undefined,
        MaxResults: js.UndefOr[MaxResult200] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PublishStatus: js.UndefOr[RulePublishStatus] = js.undefined
    ): ListRulesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      EventSourceName.foreach(__v => __obj.updateDynamic("EventSourceName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PublishStatus.foreach(__v => __obj.updateDynamic("PublishStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesRequest]
    }
  }

  @js.native
  trait ListRulesResponse extends js.Object {
    var RuleSummaryList: RuleSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRulesResponse {
    @inline
    def apply(
        RuleSummaryList: RuleSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRulesResponse = {
      val __obj = js.Dynamic.literal(
        "RuleSummaryList" -> RuleSummaryList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesResponse]
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
  trait ListSecurityProfilePermissionsRequest extends js.Object {
    var InstanceId: InstanceId
    var SecurityProfileId: SecurityProfileId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSecurityProfilePermissionsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        SecurityProfileId: SecurityProfileId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSecurityProfilePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "SecurityProfileId" -> SecurityProfileId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityProfilePermissionsRequest]
    }
  }

  @js.native
  trait ListSecurityProfilePermissionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Permissions: js.UndefOr[PermissionsList]
  }

  object ListSecurityProfilePermissionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Permissions: js.UndefOr[PermissionsList] = js.undefined
    ): ListSecurityProfilePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityProfilePermissionsResponse]
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

  @js.native
  trait ListTaskTemplatesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult100]
    var Name: js.UndefOr[TaskTemplateName]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TaskTemplateStatus]
  }

  object ListTaskTemplatesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        Name: js.UndefOr[TaskTemplateName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[TaskTemplateStatus] = js.undefined
    ): ListTaskTemplatesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTaskTemplatesRequest]
    }
  }

  @js.native
  trait ListTaskTemplatesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TaskTemplates: js.UndefOr[TaskTemplateList]
  }

  object ListTaskTemplatesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TaskTemplates: js.UndefOr[TaskTemplateList] = js.undefined
    ): ListTaskTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TaskTemplates.foreach(__v => __obj.updateDynamic("TaskTemplates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTaskTemplatesResponse]
    }
  }

  @js.native
  trait ListTrafficDistributionGroupsRequest extends js.Object {
    var InstanceId: js.UndefOr[InstanceIdOrArn]
    var MaxResults: js.UndefOr[MaxResult10]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTrafficDistributionGroupsRequest {
    @inline
    def apply(
        InstanceId: js.UndefOr[InstanceIdOrArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResult10] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTrafficDistributionGroupsRequest = {
      val __obj = js.Dynamic.literal()
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrafficDistributionGroupsRequest]
    }
  }

  @js.native
  trait ListTrafficDistributionGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TrafficDistributionGroupSummaryList: js.UndefOr[TrafficDistributionGroupSummaryList]
  }

  object ListTrafficDistributionGroupsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TrafficDistributionGroupSummaryList: js.UndefOr[TrafficDistributionGroupSummaryList] = js.undefined
    ): ListTrafficDistributionGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TrafficDistributionGroupSummaryList.foreach(__v => __obj.updateDynamic("TrafficDistributionGroupSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrafficDistributionGroupsResponse]
    }
  }

  /** Provides summary information about the use cases for the specified integration association.
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

  @js.native
  trait MonitorContactRequest extends js.Object {
    var ContactId: ContactId
    var InstanceId: InstanceId
    var UserId: AgentResourceId
    var AllowedMonitorCapabilities: js.UndefOr[AllowedMonitorCapabilities]
    var ClientToken: js.UndefOr[ClientToken]
  }

  object MonitorContactRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InstanceId: InstanceId,
        UserId: AgentResourceId,
        AllowedMonitorCapabilities: js.UndefOr[AllowedMonitorCapabilities] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): MonitorContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      AllowedMonitorCapabilities.foreach(__v => __obj.updateDynamic("AllowedMonitorCapabilities")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitorContactRequest]
    }
  }

  @js.native
  trait MonitorContactResponse extends js.Object {
    var ContactArn: js.UndefOr[ARN]
    var ContactId: js.UndefOr[ContactId]
  }

  object MonitorContactResponse {
    @inline
    def apply(
        ContactArn: js.UndefOr[ARN] = js.undefined,
        ContactId: js.UndefOr[ContactId] = js.undefined
    ): MonitorContactResponse = {
      val __obj = js.Dynamic.literal()
      ContactArn.foreach(__v => __obj.updateDynamic("ContactArn")(__v.asInstanceOf[js.Any]))
      ContactId.foreach(__v => __obj.updateDynamic("ContactId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitorContactResponse]
    }
  }

  /** The type of notification recipient.
    */
  @js.native
  trait NotificationRecipientType extends js.Object {
    var UserIds: js.UndefOr[UserIdList]
    var UserTags: js.UndefOr[UserTagMap]
  }

  object NotificationRecipientType {
    @inline
    def apply(
        UserIds: js.UndefOr[UserIdList] = js.undefined,
        UserTags: js.UndefOr[UserTagMap] = js.undefined
    ): NotificationRecipientType = {
      val __obj = js.Dynamic.literal()
      UserIds.foreach(__v => __obj.updateDynamic("UserIds")(__v.asInstanceOf[js.Any]))
      UserTags.foreach(__v => __obj.updateDynamic("UserTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationRecipientType]
    }
  }

  /** Information about a reference when the <code>referenceType</code> is <code>NUMBER</code>. Otherwise, null.
    */
  @js.native
  trait NumberReference extends js.Object {
    var Name: js.UndefOr[ReferenceKey]
    var Value: js.UndefOr[ReferenceValue]
  }

  object NumberReference {
    @inline
    def apply(
        Name: js.UndefOr[ReferenceKey] = js.undefined,
        Value: js.UndefOr[ReferenceValue] = js.undefined
    ): NumberReference = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumberReference]
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

  /** The status of the phone number. * <code>CLAIMED</code> means the previous [[https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html|ClaimedPhoneNumber]] or [[https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html|UpdatePhoneNumber]] operation succeeded. * <code>IN_PROGRESS</code> means a [[https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html|ClaimedPhoneNumber]] or [[https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html|UpdatePhoneNumber]] operation is still in progress and has not yet completed. You can call [[https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html|DescribePhoneNumber]] at a later time to verify if the previous operation has completed. * <code>FAILED</code> indicates that the previous [[https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html|ClaimedPhoneNumber]] or
    * [[https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html|UpdatePhoneNumber]] operation has failed. It will include a message indicating the failure reason. A common reason for a failure may be that the <code>TargetArn</code> value you are claiming or updating a phone number to has reached its limit of total claimed numbers. If you received a <code>FAILED</code> status from a <code>ClaimPhoneNumber</code> API call, you have one day to retry claiming the phone number before the number is released back to the inventory for other customers to claim.
    */
  @js.native
  trait PhoneNumberStatus extends js.Object {
    var Message: js.UndefOr[PhoneNumberWorkflowMessage]
    var Status: js.UndefOr[PhoneNumberWorkflowStatus]
  }

  object PhoneNumberStatus {
    @inline
    def apply(
        Message: js.UndefOr[PhoneNumberWorkflowMessage] = js.undefined,
        Status: js.UndefOr[PhoneNumberWorkflowStatus] = js.undefined
    ): PhoneNumberStatus = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberStatus]
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

  @js.native
  trait PutUserStatusRequest extends js.Object {
    var AgentStatusId: AgentStatusId
    var InstanceId: InstanceId
    var UserId: UserId
  }

  object PutUserStatusRequest {
    @inline
    def apply(
        AgentStatusId: AgentStatusId,
        InstanceId: InstanceId,
        UserId: UserId
    ): PutUserStatusRequest = {
      val __obj = js.Dynamic.literal(
        "AgentStatusId" -> AgentStatusId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutUserStatusRequest]
    }
  }

  @js.native
  trait PutUserStatusResponse extends js.Object

  object PutUserStatusResponse {
    @inline
    def apply(): PutUserStatusResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutUserStatusResponse]
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

  /** If this contact was queued, this contains information about the queue.
    */
  @js.native
  trait QueueInfo extends js.Object {
    var EnqueueTimestamp: js.UndefOr[timestamp]
    var Id: js.UndefOr[QueueId]
  }

  object QueueInfo {
    @inline
    def apply(
        EnqueueTimestamp: js.UndefOr[timestamp] = js.undefined,
        Id: js.UndefOr[QueueId] = js.undefined
    ): QueueInfo = {
      val __obj = js.Dynamic.literal()
      EnqueueTimestamp.foreach(__v => __obj.updateDynamic("EnqueueTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueueInfo]
    }
  }

  /** Contains information about a queue for a quick connect. The flow must be of type Transfer to Queue.
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

  /** The search criteria to be used to return queues.
    *
    * '''Note:'''The <code>name</code> and <code>description</code> fields support "contains" queries with a minimum of 2 characters and a maximum of 25 characters. Any queries with character lengths outside of this range will throw invalid results.
    */
  @js.native
  trait QueueSearchCriteria extends js.Object {
    var AndConditions: js.UndefOr[QueueSearchConditionList]
    var OrConditions: js.UndefOr[QueueSearchConditionList]
    var QueueTypeCondition: js.UndefOr[SearchableQueueType]
    var StringCondition: js.UndefOr[StringCondition]
  }

  object QueueSearchCriteria {
    @inline
    def apply(
        AndConditions: js.UndefOr[QueueSearchConditionList] = js.undefined,
        OrConditions: js.UndefOr[QueueSearchConditionList] = js.undefined,
        QueueTypeCondition: js.UndefOr[SearchableQueueType] = js.undefined,
        StringCondition: js.UndefOr[StringCondition] = js.undefined
    ): QueueSearchCriteria = {
      val __obj = js.Dynamic.literal()
      AndConditions.foreach(__v => __obj.updateDynamic("AndConditions")(__v.asInstanceOf[js.Any]))
      OrConditions.foreach(__v => __obj.updateDynamic("OrConditions")(__v.asInstanceOf[js.Any]))
      QueueTypeCondition.foreach(__v => __obj.updateDynamic("QueueTypeCondition")(__v.asInstanceOf[js.Any]))
      StringCondition.foreach(__v => __obj.updateDynamic("StringCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueueSearchCriteria]
    }
  }

  /** Filters to be applied to search results.
    */
  @js.native
  trait QueueSearchFilter extends js.Object {
    var TagFilter: js.UndefOr[ControlPlaneTagFilter]
  }

  object QueueSearchFilter {
    @inline
    def apply(
        TagFilter: js.UndefOr[ControlPlaneTagFilter] = js.undefined
    ): QueueSearchFilter = {
      val __obj = js.Dynamic.literal()
      TagFilter.foreach(__v => __obj.updateDynamic("TagFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueueSearchFilter]
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

  /** Indicates a field that is read-only to an agent.
    */
  @js.native
  trait ReadOnlyFieldInfo extends js.Object {
    var Id: js.UndefOr[TaskTemplateFieldIdentifier]
  }

  object ReadOnlyFieldInfo {
    @inline
    def apply(
        Id: js.UndefOr[TaskTemplateFieldIdentifier] = js.undefined
    ): ReadOnlyFieldInfo = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReadOnlyFieldInfo]
    }
  }

  /** Well-formed data on a contact, used by agents to complete a contact request. You can have up to 4,096 UTF-8 bytes across all references for a contact.
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

  /** Contains summary information about a reference. <code>ReferenceSummary</code> contains only one non null field between the URL and attachment based on the reference type.
    */
  @js.native
  trait ReferenceSummary extends js.Object {
    var Attachment: js.UndefOr[AttachmentReference]
    var Date: js.UndefOr[DateReference]
    var Email: js.UndefOr[EmailReference]
    var Number: js.UndefOr[NumberReference]
    var String: js.UndefOr[StringReference]
    var Url: js.UndefOr[UrlReference]
  }

  object ReferenceSummary {
    @inline
    def apply(
        Attachment: js.UndefOr[AttachmentReference] = js.undefined,
        Date: js.UndefOr[DateReference] = js.undefined,
        Email: js.UndefOr[EmailReference] = js.undefined,
        Number: js.UndefOr[NumberReference] = js.undefined,
        String: js.UndefOr[StringReference] = js.undefined,
        Url: js.UndefOr[UrlReference] = js.undefined
    ): ReferenceSummary = {
      val __obj = js.Dynamic.literal()
      Attachment.foreach(__v => __obj.updateDynamic("Attachment")(__v.asInstanceOf[js.Any]))
      Date.foreach(__v => __obj.updateDynamic("Date")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      Number.foreach(__v => __obj.updateDynamic("Number")(__v.asInstanceOf[js.Any]))
      String.foreach(__v => __obj.updateDynamic("String")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceSummary]
    }
  }

  @js.native
  trait ReleasePhoneNumberRequest extends js.Object {
    var PhoneNumberId: PhoneNumberId
    var ClientToken: js.UndefOr[ClientToken]
  }

  object ReleasePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: PhoneNumberId,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): ReleasePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReleasePhoneNumberRequest]
    }
  }

  @js.native
  trait ReplicateInstanceRequest extends js.Object {
    var InstanceId: InstanceIdOrArn
    var ReplicaAlias: DirectoryAlias
    var ReplicaRegion: AwsRegion
    var ClientToken: js.UndefOr[ClientToken]
  }

  object ReplicateInstanceRequest {
    @inline
    def apply(
        InstanceId: InstanceIdOrArn,
        ReplicaAlias: DirectoryAlias,
        ReplicaRegion: AwsRegion,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): ReplicateInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ReplicaAlias" -> ReplicaAlias.asInstanceOf[js.Any],
        "ReplicaRegion" -> ReplicaRegion.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicateInstanceRequest]
    }
  }

  @js.native
  trait ReplicateInstanceResponse extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[InstanceId]
  }

  object ReplicateInstanceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[InstanceId] = js.undefined
    ): ReplicateInstanceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicateInstanceResponse]
    }
  }

  /** Information about a required field.
    */
  @js.native
  trait RequiredFieldInfo extends js.Object {
    var Id: js.UndefOr[TaskTemplateFieldIdentifier]
  }

  object RequiredFieldInfo {
    @inline
    def apply(
        Id: js.UndefOr[TaskTemplateFieldIdentifier] = js.undefined
    ): RequiredFieldInfo = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequiredFieldInfo]
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
    var NumberOfAssociatedQueues: js.UndefOr[Double]
    var NumberOfAssociatedUsers: js.UndefOr[Double]
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
        NumberOfAssociatedQueues: js.UndefOr[Double] = js.undefined,
        NumberOfAssociatedUsers: js.UndefOr[Double] = js.undefined,
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
      NumberOfAssociatedQueues.foreach(__v => __obj.updateDynamic("NumberOfAssociatedQueues")(__v.asInstanceOf[js.Any]))
      NumberOfAssociatedUsers.foreach(__v => __obj.updateDynamic("NumberOfAssociatedUsers")(__v.asInstanceOf[js.Any]))
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

  /** Information about the routing profile assigned to the user.
    */
  @js.native
  trait RoutingProfileReference extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[RoutingProfileId]
  }

  object RoutingProfileReference {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[RoutingProfileId] = js.undefined
    ): RoutingProfileReference = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoutingProfileReference]
    }
  }

  /** The search criteria to be used to return routing profiles.
    *
    * '''Note:'''The <code>name</code> and <code>description</code> fields support "contains" queries with a minimum of 2 characters and a maximum of 25 characters. Any queries with character lengths outside of this range will throw invalid results.
    */
  @js.native
  trait RoutingProfileSearchCriteria extends js.Object {
    var AndConditions: js.UndefOr[RoutingProfileSearchConditionList]
    var OrConditions: js.UndefOr[RoutingProfileSearchConditionList]
    var StringCondition: js.UndefOr[StringCondition]
  }

  object RoutingProfileSearchCriteria {
    @inline
    def apply(
        AndConditions: js.UndefOr[RoutingProfileSearchConditionList] = js.undefined,
        OrConditions: js.UndefOr[RoutingProfileSearchConditionList] = js.undefined,
        StringCondition: js.UndefOr[StringCondition] = js.undefined
    ): RoutingProfileSearchCriteria = {
      val __obj = js.Dynamic.literal()
      AndConditions.foreach(__v => __obj.updateDynamic("AndConditions")(__v.asInstanceOf[js.Any]))
      OrConditions.foreach(__v => __obj.updateDynamic("OrConditions")(__v.asInstanceOf[js.Any]))
      StringCondition.foreach(__v => __obj.updateDynamic("StringCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoutingProfileSearchCriteria]
    }
  }

  /** Filters to be applied to search results.
    */
  @js.native
  trait RoutingProfileSearchFilter extends js.Object {
    var TagFilter: js.UndefOr[ControlPlaneTagFilter]
  }

  object RoutingProfileSearchFilter {
    @inline
    def apply(
        TagFilter: js.UndefOr[ControlPlaneTagFilter] = js.undefined
    ): RoutingProfileSearchFilter = {
      val __obj = js.Dynamic.literal()
      TagFilter.foreach(__v => __obj.updateDynamic("TagFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoutingProfileSearchFilter]
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

  /** Information about a rule.
    */
  @js.native
  trait Rule extends js.Object {
    var Actions: RuleActions
    var CreatedTime: Timestamp
    var Function: RuleFunction
    var LastUpdatedBy: ARN
    var LastUpdatedTime: Timestamp
    var Name: RuleName
    var PublishStatus: RulePublishStatus
    var RuleArn: ARN
    var RuleId: RuleId
    var TriggerEventSource: RuleTriggerEventSource
    var Tags: js.UndefOr[TagMap]
  }

  object Rule {
    @inline
    def apply(
        Actions: RuleActions,
        CreatedTime: Timestamp,
        Function: RuleFunction,
        LastUpdatedBy: ARN,
        LastUpdatedTime: Timestamp,
        Name: RuleName,
        PublishStatus: RulePublishStatus,
        RuleArn: ARN,
        RuleId: RuleId,
        TriggerEventSource: RuleTriggerEventSource,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): Rule = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any],
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "Function" -> Function.asInstanceOf[js.Any],
        "LastUpdatedBy" -> LastUpdatedBy.asInstanceOf[js.Any],
        "LastUpdatedTime" -> LastUpdatedTime.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "PublishStatus" -> PublishStatus.asInstanceOf[js.Any],
        "RuleArn" -> RuleArn.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any],
        "TriggerEventSource" -> TriggerEventSource.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rule]
    }
  }

  /** Information about the action to be performed when a rule is triggered.
    */
  @js.native
  trait RuleAction extends js.Object {
    var ActionType: ActionType
    var AssignContactCategoryAction: js.UndefOr[AssignContactCategoryActionDefinition]
    var EventBridgeAction: js.UndefOr[EventBridgeActionDefinition]
    var SendNotificationAction: js.UndefOr[SendNotificationActionDefinition]
    var TaskAction: js.UndefOr[TaskActionDefinition]
  }

  object RuleAction {
    @inline
    def apply(
        ActionType: ActionType,
        AssignContactCategoryAction: js.UndefOr[AssignContactCategoryActionDefinition] = js.undefined,
        EventBridgeAction: js.UndefOr[EventBridgeActionDefinition] = js.undefined,
        SendNotificationAction: js.UndefOr[SendNotificationActionDefinition] = js.undefined,
        TaskAction: js.UndefOr[TaskActionDefinition] = js.undefined
    ): RuleAction = {
      val __obj = js.Dynamic.literal(
        "ActionType" -> ActionType.asInstanceOf[js.Any]
      )

      AssignContactCategoryAction.foreach(__v => __obj.updateDynamic("AssignContactCategoryAction")(__v.asInstanceOf[js.Any]))
      EventBridgeAction.foreach(__v => __obj.updateDynamic("EventBridgeAction")(__v.asInstanceOf[js.Any]))
      SendNotificationAction.foreach(__v => __obj.updateDynamic("SendNotificationAction")(__v.asInstanceOf[js.Any]))
      TaskAction.foreach(__v => __obj.updateDynamic("TaskAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleAction]
    }
  }

  /** A list of <code>ActionTypes</code> associated with a rule.
    */
  @js.native
  trait RuleSummary extends js.Object {
    var ActionSummaries: ActionSummaries
    var CreatedTime: Timestamp
    var EventSourceName: EventSourceName
    var LastUpdatedTime: Timestamp
    var Name: RuleName
    var PublishStatus: RulePublishStatus
    var RuleArn: ARN
    var RuleId: RuleId
  }

  object RuleSummary {
    @inline
    def apply(
        ActionSummaries: ActionSummaries,
        CreatedTime: Timestamp,
        EventSourceName: EventSourceName,
        LastUpdatedTime: Timestamp,
        Name: RuleName,
        PublishStatus: RulePublishStatus,
        RuleArn: ARN,
        RuleId: RuleId
    ): RuleSummary = {
      val __obj = js.Dynamic.literal(
        "ActionSummaries" -> ActionSummaries.asInstanceOf[js.Any],
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "EventSourceName" -> EventSourceName.asInstanceOf[js.Any],
        "LastUpdatedTime" -> LastUpdatedTime.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "PublishStatus" -> PublishStatus.asInstanceOf[js.Any],
        "RuleArn" -> RuleArn.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RuleSummary]
    }
  }

  /** The name of the event source. This field is required if <code>TriggerEventSource</code> is one of the following values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> | <code>OnSalesforceCaseCreate</code>
    */
  @js.native
  trait RuleTriggerEventSource extends js.Object {
    var EventSourceName: EventSourceName
    var IntegrationAssociationId: js.UndefOr[IntegrationAssociationId]
  }

  object RuleTriggerEventSource {
    @inline
    def apply(
        EventSourceName: EventSourceName,
        IntegrationAssociationId: js.UndefOr[IntegrationAssociationId] = js.undefined
    ): RuleTriggerEventSource = {
      val __obj = js.Dynamic.literal(
        "EventSourceName" -> EventSourceName.asInstanceOf[js.Any]
      )

      IntegrationAssociationId.foreach(__v => __obj.updateDynamic("IntegrationAssociationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleTriggerEventSource]
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

  @js.native
  trait SearchAvailablePhoneNumbersRequest extends js.Object {
    var PhoneNumberCountryCode: PhoneNumberCountryCode
    var PhoneNumberType: PhoneNumberType
    var TargetArn: ARN
    var MaxResults: js.UndefOr[MaxResult10]
    var NextToken: js.UndefOr[LargeNextToken]
    var PhoneNumberPrefix: js.UndefOr[PhoneNumberPrefix]
  }

  object SearchAvailablePhoneNumbersRequest {
    @inline
    def apply(
        PhoneNumberCountryCode: PhoneNumberCountryCode,
        PhoneNumberType: PhoneNumberType,
        TargetArn: ARN,
        MaxResults: js.UndefOr[MaxResult10] = js.undefined,
        NextToken: js.UndefOr[LargeNextToken] = js.undefined,
        PhoneNumberPrefix: js.UndefOr[PhoneNumberPrefix] = js.undefined
    ): SearchAvailablePhoneNumbersRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberCountryCode" -> PhoneNumberCountryCode.asInstanceOf[js.Any],
        "PhoneNumberType" -> PhoneNumberType.asInstanceOf[js.Any],
        "TargetArn" -> TargetArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberPrefix.foreach(__v => __obj.updateDynamic("PhoneNumberPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchAvailablePhoneNumbersRequest]
    }
  }

  @js.native
  trait SearchAvailablePhoneNumbersResponse extends js.Object {
    var AvailableNumbersList: js.UndefOr[AvailableNumbersList]
    var NextToken: js.UndefOr[LargeNextToken]
  }

  object SearchAvailablePhoneNumbersResponse {
    @inline
    def apply(
        AvailableNumbersList: js.UndefOr[AvailableNumbersList] = js.undefined,
        NextToken: js.UndefOr[LargeNextToken] = js.undefined
    ): SearchAvailablePhoneNumbersResponse = {
      val __obj = js.Dynamic.literal()
      AvailableNumbersList.foreach(__v => __obj.updateDynamic("AvailableNumbersList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchAvailablePhoneNumbersResponse]
    }
  }

  @js.native
  trait SearchQueuesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken2500]
    var SearchCriteria: js.UndefOr[QueueSearchCriteria]
    var SearchFilter: js.UndefOr[QueueSearchFilter]
  }

  object SearchQueuesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken2500] = js.undefined,
        SearchCriteria: js.UndefOr[QueueSearchCriteria] = js.undefined,
        SearchFilter: js.UndefOr[QueueSearchFilter] = js.undefined
    ): SearchQueuesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SearchCriteria.foreach(__v => __obj.updateDynamic("SearchCriteria")(__v.asInstanceOf[js.Any]))
      SearchFilter.foreach(__v => __obj.updateDynamic("SearchFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchQueuesRequest]
    }
  }

  @js.native
  trait SearchQueuesResponse extends js.Object {
    var ApproximateTotalCount: js.UndefOr[ApproximateTotalCount]
    var NextToken: js.UndefOr[NextToken2500]
    var Queues: js.UndefOr[QueueSearchSummaryList]
  }

  object SearchQueuesResponse {
    @inline
    def apply(
        ApproximateTotalCount: js.UndefOr[ApproximateTotalCount] = js.undefined,
        NextToken: js.UndefOr[NextToken2500] = js.undefined,
        Queues: js.UndefOr[QueueSearchSummaryList] = js.undefined
    ): SearchQueuesResponse = {
      val __obj = js.Dynamic.literal()
      ApproximateTotalCount.foreach(__v => __obj.updateDynamic("ApproximateTotalCount")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Queues.foreach(__v => __obj.updateDynamic("Queues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchQueuesResponse]
    }
  }

  @js.native
  trait SearchRoutingProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken2500]
    var SearchCriteria: js.UndefOr[RoutingProfileSearchCriteria]
    var SearchFilter: js.UndefOr[RoutingProfileSearchFilter]
  }

  object SearchRoutingProfilesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken2500] = js.undefined,
        SearchCriteria: js.UndefOr[RoutingProfileSearchCriteria] = js.undefined,
        SearchFilter: js.UndefOr[RoutingProfileSearchFilter] = js.undefined
    ): SearchRoutingProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SearchCriteria.foreach(__v => __obj.updateDynamic("SearchCriteria")(__v.asInstanceOf[js.Any]))
      SearchFilter.foreach(__v => __obj.updateDynamic("SearchFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchRoutingProfilesRequest]
    }
  }

  @js.native
  trait SearchRoutingProfilesResponse extends js.Object {
    var ApproximateTotalCount: js.UndefOr[ApproximateTotalCount]
    var NextToken: js.UndefOr[NextToken2500]
    var RoutingProfiles: js.UndefOr[RoutingProfileList]
  }

  object SearchRoutingProfilesResponse {
    @inline
    def apply(
        ApproximateTotalCount: js.UndefOr[ApproximateTotalCount] = js.undefined,
        NextToken: js.UndefOr[NextToken2500] = js.undefined,
        RoutingProfiles: js.UndefOr[RoutingProfileList] = js.undefined
    ): SearchRoutingProfilesResponse = {
      val __obj = js.Dynamic.literal()
      ApproximateTotalCount.foreach(__v => __obj.updateDynamic("ApproximateTotalCount")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RoutingProfiles.foreach(__v => __obj.updateDynamic("RoutingProfiles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchRoutingProfilesResponse]
    }
  }

  @js.native
  trait SearchSecurityProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken2500]
    var SearchCriteria: js.UndefOr[SecurityProfileSearchCriteria]
    var SearchFilter: js.UndefOr[SecurityProfilesSearchFilter]
  }

  object SearchSecurityProfilesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken2500] = js.undefined,
        SearchCriteria: js.UndefOr[SecurityProfileSearchCriteria] = js.undefined,
        SearchFilter: js.UndefOr[SecurityProfilesSearchFilter] = js.undefined
    ): SearchSecurityProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SearchCriteria.foreach(__v => __obj.updateDynamic("SearchCriteria")(__v.asInstanceOf[js.Any]))
      SearchFilter.foreach(__v => __obj.updateDynamic("SearchFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSecurityProfilesRequest]
    }
  }

  @js.native
  trait SearchSecurityProfilesResponse extends js.Object {
    var ApproximateTotalCount: js.UndefOr[ApproximateTotalCount]
    var NextToken: js.UndefOr[NextToken2500]
    var SecurityProfiles: js.UndefOr[SecurityProfilesSearchSummaryList]
  }

  object SearchSecurityProfilesResponse {
    @inline
    def apply(
        ApproximateTotalCount: js.UndefOr[ApproximateTotalCount] = js.undefined,
        NextToken: js.UndefOr[NextToken2500] = js.undefined,
        SecurityProfiles: js.UndefOr[SecurityProfilesSearchSummaryList] = js.undefined
    ): SearchSecurityProfilesResponse = {
      val __obj = js.Dynamic.literal()
      ApproximateTotalCount.foreach(__v => __obj.updateDynamic("ApproximateTotalCount")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SecurityProfiles.foreach(__v => __obj.updateDynamic("SecurityProfiles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSecurityProfilesResponse]
    }
  }

  @js.native
  trait SearchUsersRequest extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken2500]
    var SearchCriteria: js.UndefOr[UserSearchCriteria]
    var SearchFilter: js.UndefOr[UserSearchFilter]
  }

  object SearchUsersRequest {
    @inline
    def apply(
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken2500] = js.undefined,
        SearchCriteria: js.UndefOr[UserSearchCriteria] = js.undefined,
        SearchFilter: js.UndefOr[UserSearchFilter] = js.undefined
    ): SearchUsersRequest = {
      val __obj = js.Dynamic.literal()
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SearchCriteria.foreach(__v => __obj.updateDynamic("SearchCriteria")(__v.asInstanceOf[js.Any]))
      SearchFilter.foreach(__v => __obj.updateDynamic("SearchFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchUsersRequest]
    }
  }

  @js.native
  trait SearchUsersResponse extends js.Object {
    var ApproximateTotalCount: js.UndefOr[ApproximateTotalCount]
    var NextToken: js.UndefOr[NextToken2500]
    var Users: js.UndefOr[UserSearchSummaryList]
  }

  object SearchUsersResponse {
    @inline
    def apply(
        ApproximateTotalCount: js.UndefOr[ApproximateTotalCount] = js.undefined,
        NextToken: js.UndefOr[NextToken2500] = js.undefined,
        Users: js.UndefOr[UserSearchSummaryList] = js.undefined
    ): SearchUsersResponse = {
      val __obj = js.Dynamic.literal()
      ApproximateTotalCount.foreach(__v => __obj.updateDynamic("ApproximateTotalCount")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchUsersResponse]
    }
  }

  @js.native
  trait SearchVocabulariesRequest extends js.Object {
    var InstanceId: InstanceId
    var LanguageCode: js.UndefOr[VocabularyLanguageCode]
    var MaxResults: js.UndefOr[MaxResult100]
    var NameStartsWith: js.UndefOr[VocabularyName]
    var NextToken: js.UndefOr[VocabularyNextToken]
    var State: js.UndefOr[VocabularyState]
  }

  object SearchVocabulariesRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        LanguageCode: js.UndefOr[VocabularyLanguageCode] = js.undefined,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NameStartsWith: js.UndefOr[VocabularyName] = js.undefined,
        NextToken: js.UndefOr[VocabularyNextToken] = js.undefined,
        State: js.UndefOr[VocabularyState] = js.undefined
    ): SearchVocabulariesRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameStartsWith.foreach(__v => __obj.updateDynamic("NameStartsWith")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchVocabulariesRequest]
    }
  }

  @js.native
  trait SearchVocabulariesResponse extends js.Object {
    var NextToken: js.UndefOr[VocabularyNextToken]
    var VocabularySummaryList: js.UndefOr[VocabularySummaryList]
  }

  object SearchVocabulariesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[VocabularyNextToken] = js.undefined,
        VocabularySummaryList: js.UndefOr[VocabularySummaryList] = js.undefined
    ): SearchVocabulariesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VocabularySummaryList.foreach(__v => __obj.updateDynamic("VocabularySummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchVocabulariesResponse]
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
  trait SecurityProfile extends js.Object {
    var AllowedAccessControlTags: js.UndefOr[AllowedAccessControlTags]
    var Arn: js.UndefOr[ARN]
    var Description: js.UndefOr[SecurityProfileDescription]
    var Id: js.UndefOr[SecurityProfileId]
    var OrganizationResourceId: js.UndefOr[InstanceId]
    var SecurityProfileName: js.UndefOr[SecurityProfileName]
    var TagRestrictedResources: js.UndefOr[TagRestrictedResourceList]
    var Tags: js.UndefOr[TagMap]
  }

  object SecurityProfile {
    @inline
    def apply(
        AllowedAccessControlTags: js.UndefOr[AllowedAccessControlTags] = js.undefined,
        Arn: js.UndefOr[ARN] = js.undefined,
        Description: js.UndefOr[SecurityProfileDescription] = js.undefined,
        Id: js.UndefOr[SecurityProfileId] = js.undefined,
        OrganizationResourceId: js.UndefOr[InstanceId] = js.undefined,
        SecurityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        TagRestrictedResources: js.UndefOr[TagRestrictedResourceList] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): SecurityProfile = {
      val __obj = js.Dynamic.literal()
      AllowedAccessControlTags.foreach(__v => __obj.updateDynamic("AllowedAccessControlTags")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      OrganizationResourceId.foreach(__v => __obj.updateDynamic("OrganizationResourceId")(__v.asInstanceOf[js.Any]))
      SecurityProfileName.foreach(__v => __obj.updateDynamic("SecurityProfileName")(__v.asInstanceOf[js.Any]))
      TagRestrictedResources.foreach(__v => __obj.updateDynamic("TagRestrictedResources")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityProfile]
    }
  }

  /** The search criteria to be used to return security profiles.
    *
    * '''Note:'''The <code>name</code> field support "contains" queries with a minimum of 2 characters and maximum of 25 characters. Any queries with character lengths outside of this range will throw invalid results.
    */
  @js.native
  trait SecurityProfileSearchCriteria extends js.Object {
    var AndConditions: js.UndefOr[SecurityProfileSearchConditionList]
    var OrConditions: js.UndefOr[SecurityProfileSearchConditionList]
    var StringCondition: js.UndefOr[StringCondition]
  }

  object SecurityProfileSearchCriteria {
    @inline
    def apply(
        AndConditions: js.UndefOr[SecurityProfileSearchConditionList] = js.undefined,
        OrConditions: js.UndefOr[SecurityProfileSearchConditionList] = js.undefined,
        StringCondition: js.UndefOr[StringCondition] = js.undefined
    ): SecurityProfileSearchCriteria = {
      val __obj = js.Dynamic.literal()
      AndConditions.foreach(__v => __obj.updateDynamic("AndConditions")(__v.asInstanceOf[js.Any]))
      OrConditions.foreach(__v => __obj.updateDynamic("OrConditions")(__v.asInstanceOf[js.Any]))
      StringCondition.foreach(__v => __obj.updateDynamic("StringCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityProfileSearchCriteria]
    }
  }

  /** Information about the returned security profiles.
    */
  @js.native
  trait SecurityProfileSearchSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Description: js.UndefOr[SecurityProfileDescription]
    var Id: js.UndefOr[SecurityProfileId]
    var OrganizationResourceId: js.UndefOr[InstanceId]
    var SecurityProfileName: js.UndefOr[SecurityProfileName]
    var Tags: js.UndefOr[TagMap]
  }

  object SecurityProfileSearchSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Description: js.UndefOr[SecurityProfileDescription] = js.undefined,
        Id: js.UndefOr[SecurityProfileId] = js.undefined,
        OrganizationResourceId: js.UndefOr[InstanceId] = js.undefined,
        SecurityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): SecurityProfileSearchSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      OrganizationResourceId.foreach(__v => __obj.updateDynamic("OrganizationResourceId")(__v.asInstanceOf[js.Any]))
      SecurityProfileName.foreach(__v => __obj.updateDynamic("SecurityProfileName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityProfileSearchSummary]
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

  /** Filters to be applied to search results.
    */
  @js.native
  trait SecurityProfilesSearchFilter extends js.Object {
    var TagFilter: js.UndefOr[ControlPlaneTagFilter]
  }

  object SecurityProfilesSearchFilter {
    @inline
    def apply(
        TagFilter: js.UndefOr[ControlPlaneTagFilter] = js.undefined
    ): SecurityProfilesSearchFilter = {
      val __obj = js.Dynamic.literal()
      TagFilter.foreach(__v => __obj.updateDynamic("TagFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityProfilesSearchFilter]
    }
  }

  /** Information about the send notification action.
    */
  @js.native
  trait SendNotificationActionDefinition extends js.Object {
    var Content: Content
    var ContentType: NotificationContentType
    var DeliveryMethod: NotificationDeliveryType
    var Recipient: NotificationRecipientType
    var Subject: js.UndefOr[Subject]
  }

  object SendNotificationActionDefinition {
    @inline
    def apply(
        Content: Content,
        ContentType: NotificationContentType,
        DeliveryMethod: NotificationDeliveryType,
        Recipient: NotificationRecipientType,
        Subject: js.UndefOr[Subject] = js.undefined
    ): SendNotificationActionDefinition = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "ContentType" -> ContentType.asInstanceOf[js.Any],
        "DeliveryMethod" -> DeliveryMethod.asInstanceOf[js.Any],
        "Recipient" -> Recipient.asInstanceOf[js.Any]
      )

      Subject.foreach(__v => __obj.updateDynamic("Subject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendNotificationActionDefinition]
    }
  }

  @js.native
  trait StartChatContactRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var InstanceId: InstanceId
    var ParticipantDetails: ParticipantDetails
    var Attributes: js.UndefOr[Attributes]
    var ChatDurationInMinutes: js.UndefOr[ChatDurationInMinutes]
    var ClientToken: js.UndefOr[ClientToken]
    var InitialMessage: js.UndefOr[ChatMessage]
    var SupportedMessagingContentTypes: js.UndefOr[SupportedMessagingContentTypes]
  }

  object StartChatContactRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        InstanceId: InstanceId,
        ParticipantDetails: ParticipantDetails,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        ChatDurationInMinutes: js.UndefOr[ChatDurationInMinutes] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        InitialMessage: js.UndefOr[ChatMessage] = js.undefined,
        SupportedMessagingContentTypes: js.UndefOr[SupportedMessagingContentTypes] = js.undefined
    ): StartChatContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ParticipantDetails" -> ParticipantDetails.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ChatDurationInMinutes.foreach(__v => __obj.updateDynamic("ChatDurationInMinutes")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      InitialMessage.foreach(__v => __obj.updateDynamic("InitialMessage")(__v.asInstanceOf[js.Any]))
      SupportedMessagingContentTypes.foreach(__v => __obj.updateDynamic("SupportedMessagingContentTypes")(__v.asInstanceOf[js.Any]))
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
  trait StartContactStreamingRequest extends js.Object {
    var ChatStreamingConfiguration: ChatStreamingConfiguration
    var ClientToken: ClientToken
    var ContactId: ContactId
    var InstanceId: InstanceId
  }

  object StartContactStreamingRequest {
    @inline
    def apply(
        ChatStreamingConfiguration: ChatStreamingConfiguration,
        ClientToken: ClientToken,
        ContactId: ContactId,
        InstanceId: InstanceId
    ): StartContactStreamingRequest = {
      val __obj = js.Dynamic.literal(
        "ChatStreamingConfiguration" -> ChatStreamingConfiguration.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartContactStreamingRequest]
    }
  }

  @js.native
  trait StartContactStreamingResponse extends js.Object {
    var StreamingId: StreamingId
  }

  object StartContactStreamingResponse {
    @inline
    def apply(
        StreamingId: StreamingId
    ): StartContactStreamingResponse = {
      val __obj = js.Dynamic.literal(
        "StreamingId" -> StreamingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartContactStreamingResponse]
    }
  }

  @js.native
  trait StartOutboundVoiceContactRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var DestinationPhoneNumber: PhoneNumber
    var InstanceId: InstanceId
    var AnswerMachineDetectionConfig: js.UndefOr[AnswerMachineDetectionConfig]
    var Attributes: js.UndefOr[Attributes]
    var CampaignId: js.UndefOr[CampaignId]
    var ClientToken: js.UndefOr[ClientToken]
    var QueueId: js.UndefOr[QueueId]
    var SourcePhoneNumber: js.UndefOr[PhoneNumber]
    var TrafficType: js.UndefOr[TrafficType]
  }

  object StartOutboundVoiceContactRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        DestinationPhoneNumber: PhoneNumber,
        InstanceId: InstanceId,
        AnswerMachineDetectionConfig: js.UndefOr[AnswerMachineDetectionConfig] = js.undefined,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        CampaignId: js.UndefOr[CampaignId] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        QueueId: js.UndefOr[QueueId] = js.undefined,
        SourcePhoneNumber: js.UndefOr[PhoneNumber] = js.undefined,
        TrafficType: js.UndefOr[TrafficType] = js.undefined
    ): StartOutboundVoiceContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "DestinationPhoneNumber" -> DestinationPhoneNumber.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      AnswerMachineDetectionConfig.foreach(__v => __obj.updateDynamic("AnswerMachineDetectionConfig")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      CampaignId.foreach(__v => __obj.updateDynamic("CampaignId")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      QueueId.foreach(__v => __obj.updateDynamic("QueueId")(__v.asInstanceOf[js.Any]))
      SourcePhoneNumber.foreach(__v => __obj.updateDynamic("SourcePhoneNumber")(__v.asInstanceOf[js.Any]))
      TrafficType.foreach(__v => __obj.updateDynamic("TrafficType")(__v.asInstanceOf[js.Any]))
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
    var InstanceId: InstanceId
    var Name: Name
    var Attributes: js.UndefOr[Attributes]
    var ClientToken: js.UndefOr[ClientToken]
    var ContactFlowId: js.UndefOr[ContactFlowId]
    var Description: js.UndefOr[Description]
    var PreviousContactId: js.UndefOr[ContactId]
    var QuickConnectId: js.UndefOr[QuickConnectId]
    var References: js.UndefOr[ContactReferences]
    var ScheduledTime: js.UndefOr[Timestamp]
    var TaskTemplateId: js.UndefOr[TaskTemplateId]
  }

  object StartTaskContactRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        Name: Name,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        ContactFlowId: js.UndefOr[ContactFlowId] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        PreviousContactId: js.UndefOr[ContactId] = js.undefined,
        QuickConnectId: js.UndefOr[QuickConnectId] = js.undefined,
        References: js.UndefOr[ContactReferences] = js.undefined,
        ScheduledTime: js.UndefOr[Timestamp] = js.undefined,
        TaskTemplateId: js.UndefOr[TaskTemplateId] = js.undefined
    ): StartTaskContactRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      ContactFlowId.foreach(__v => __obj.updateDynamic("ContactFlowId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PreviousContactId.foreach(__v => __obj.updateDynamic("PreviousContactId")(__v.asInstanceOf[js.Any]))
      QuickConnectId.foreach(__v => __obj.updateDynamic("QuickConnectId")(__v.asInstanceOf[js.Any]))
      References.foreach(__v => __obj.updateDynamic("References")(__v.asInstanceOf[js.Any]))
      ScheduledTime.foreach(__v => __obj.updateDynamic("ScheduledTime")(__v.asInstanceOf[js.Any]))
      TaskTemplateId.foreach(__v => __obj.updateDynamic("TaskTemplateId")(__v.asInstanceOf[js.Any]))
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
  trait StopContactStreamingRequest extends js.Object {
    var ContactId: ContactId
    var InstanceId: InstanceId
    var StreamingId: StreamingId
  }

  object StopContactStreamingRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InstanceId: InstanceId,
        StreamingId: StreamingId
    ): StopContactStreamingRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "StreamingId" -> StreamingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopContactStreamingRequest]
    }
  }

  @js.native
  trait StopContactStreamingResponse extends js.Object

  object StopContactStreamingResponse {
    @inline
    def apply(): StopContactStreamingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopContactStreamingResponse]
    }
  }

  /** A leaf node condition which can be used to specify a string condition.
    *
    * '''Note:'''The currently supported value for <code>FieldName</code>: <code>name</code>
    */
  @js.native
  trait StringCondition extends js.Object {
    var ComparisonType: js.UndefOr[StringComparisonType]
    var FieldName: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object StringCondition {
    @inline
    def apply(
        ComparisonType: js.UndefOr[StringComparisonType] = js.undefined,
        FieldName: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): StringCondition = {
      val __obj = js.Dynamic.literal()
      ComparisonType.foreach(__v => __obj.updateDynamic("ComparisonType")(__v.asInstanceOf[js.Any]))
      FieldName.foreach(__v => __obj.updateDynamic("FieldName")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StringCondition]
    }
  }

  /** Information about a reference when the <code>referenceType</code> is <code>STRING</code>. Otherwise, null.
    */
  @js.native
  trait StringReference extends js.Object {
    var Name: js.UndefOr[ReferenceKey]
    var Value: js.UndefOr[ReferenceValue]
  }

  object StringReference {
    @inline
    def apply(
        Name: js.UndefOr[ReferenceKey] = js.undefined,
        Value: js.UndefOr[ReferenceValue] = js.undefined
    ): StringReference = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StringReference]
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

  /** A leaf node condition which can be used to specify a tag condition, for example, <code>HAVE BPO = 123</code>.
    */
  @js.native
  trait TagCondition extends js.Object {
    var TagKey: js.UndefOr[String]
    var TagValue: js.UndefOr[String]
  }

  object TagCondition {
    @inline
    def apply(
        TagKey: js.UndefOr[String] = js.undefined,
        TagValue: js.UndefOr[String] = js.undefined
    ): TagCondition = {
      val __obj = js.Dynamic.literal()
      TagKey.foreach(__v => __obj.updateDynamic("TagKey")(__v.asInstanceOf[js.Any]))
      TagValue.foreach(__v => __obj.updateDynamic("TagValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagCondition]
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

  /** Information about the task action.
    */
  @js.native
  trait TaskActionDefinition extends js.Object {
    var ContactFlowId: ContactFlowId
    var Name: TaskNameExpression
    var Description: js.UndefOr[TaskDescriptionExpression]
    var References: js.UndefOr[ContactReferences]
  }

  object TaskActionDefinition {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        Name: TaskNameExpression,
        Description: js.UndefOr[TaskDescriptionExpression] = js.undefined,
        References: js.UndefOr[ContactReferences] = js.undefined
    ): TaskActionDefinition = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      References.foreach(__v => __obj.updateDynamic("References")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskActionDefinition]
    }
  }

  /** Describes constraints that apply to the template fields.
    */
  @js.native
  trait TaskTemplateConstraints extends js.Object {
    var InvisibleFields: js.UndefOr[InvisibleTaskTemplateFields]
    var ReadOnlyFields: js.UndefOr[ReadOnlyTaskTemplateFields]
    var RequiredFields: js.UndefOr[RequiredTaskTemplateFields]
  }

  object TaskTemplateConstraints {
    @inline
    def apply(
        InvisibleFields: js.UndefOr[InvisibleTaskTemplateFields] = js.undefined,
        ReadOnlyFields: js.UndefOr[ReadOnlyTaskTemplateFields] = js.undefined,
        RequiredFields: js.UndefOr[RequiredTaskTemplateFields] = js.undefined
    ): TaskTemplateConstraints = {
      val __obj = js.Dynamic.literal()
      InvisibleFields.foreach(__v => __obj.updateDynamic("InvisibleFields")(__v.asInstanceOf[js.Any]))
      ReadOnlyFields.foreach(__v => __obj.updateDynamic("ReadOnlyFields")(__v.asInstanceOf[js.Any]))
      RequiredFields.foreach(__v => __obj.updateDynamic("RequiredFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskTemplateConstraints]
    }
  }

  /** Describes a default field and its corresponding value.
    */
  @js.native
  trait TaskTemplateDefaultFieldValue extends js.Object {
    var DefaultValue: js.UndefOr[TaskTemplateFieldValue]
    var Id: js.UndefOr[TaskTemplateFieldIdentifier]
  }

  object TaskTemplateDefaultFieldValue {
    @inline
    def apply(
        DefaultValue: js.UndefOr[TaskTemplateFieldValue] = js.undefined,
        Id: js.UndefOr[TaskTemplateFieldIdentifier] = js.undefined
    ): TaskTemplateDefaultFieldValue = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskTemplateDefaultFieldValue]
    }
  }

  /** Describes default values for fields on a template.
    */
  @js.native
  trait TaskTemplateDefaults extends js.Object {
    var DefaultFieldValues: js.UndefOr[TaskTemplateDefaultFieldValueList]
  }

  object TaskTemplateDefaults {
    @inline
    def apply(
        DefaultFieldValues: js.UndefOr[TaskTemplateDefaultFieldValueList] = js.undefined
    ): TaskTemplateDefaults = {
      val __obj = js.Dynamic.literal()
      DefaultFieldValues.foreach(__v => __obj.updateDynamic("DefaultFieldValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskTemplateDefaults]
    }
  }

  /** Describes a single task template field.
    */
  @js.native
  trait TaskTemplateField extends js.Object {
    var Id: TaskTemplateFieldIdentifier
    var Description: js.UndefOr[TaskTemplateFieldDescription]
    var SingleSelectOptions: js.UndefOr[SingleSelectOptions]
    var Type: js.UndefOr[TaskTemplateFieldType]
  }

  object TaskTemplateField {
    @inline
    def apply(
        Id: TaskTemplateFieldIdentifier,
        Description: js.UndefOr[TaskTemplateFieldDescription] = js.undefined,
        SingleSelectOptions: js.UndefOr[SingleSelectOptions] = js.undefined,
        Type: js.UndefOr[TaskTemplateFieldType] = js.undefined
    ): TaskTemplateField = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      SingleSelectOptions.foreach(__v => __obj.updateDynamic("SingleSelectOptions")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskTemplateField]
    }
  }

  /** The identifier of the task template field.
    */
  @js.native
  trait TaskTemplateFieldIdentifier extends js.Object {
    var Name: js.UndefOr[TaskTemplateFieldName]
  }

  object TaskTemplateFieldIdentifier {
    @inline
    def apply(
        Name: js.UndefOr[TaskTemplateFieldName] = js.undefined
    ): TaskTemplateFieldIdentifier = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskTemplateFieldIdentifier]
    }
  }

  /** Contains summary information about the task template.
    */
  @js.native
  trait TaskTemplateMetadata extends js.Object {
    var Arn: js.UndefOr[TaskTemplateArn]
    var CreatedTime: js.UndefOr[timestamp]
    var Description: js.UndefOr[TaskTemplateDescription]
    var Id: js.UndefOr[TaskTemplateId]
    var LastModifiedTime: js.UndefOr[timestamp]
    var Name: js.UndefOr[TaskTemplateName]
    var Status: js.UndefOr[TaskTemplateStatus]
  }

  object TaskTemplateMetadata {
    @inline
    def apply(
        Arn: js.UndefOr[TaskTemplateArn] = js.undefined,
        CreatedTime: js.UndefOr[timestamp] = js.undefined,
        Description: js.UndefOr[TaskTemplateDescription] = js.undefined,
        Id: js.UndefOr[TaskTemplateId] = js.undefined,
        LastModifiedTime: js.UndefOr[timestamp] = js.undefined,
        Name: js.UndefOr[TaskTemplateName] = js.undefined,
        Status: js.UndefOr[TaskTemplateStatus] = js.undefined
    ): TaskTemplateMetadata = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskTemplateMetadata]
    }
  }

  /** The distribution of traffic between the instance and its replicas.
    */
  @js.native
  trait TelephonyConfig extends js.Object {
    var Distributions: DistributionList
  }

  object TelephonyConfig {
    @inline
    def apply(
        Distributions: DistributionList
    ): TelephonyConfig = {
      val __obj = js.Dynamic.literal(
        "Distributions" -> Distributions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TelephonyConfig]
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

  /** Information about a traffic distribution group.
    */
  @js.native
  trait TrafficDistributionGroup extends js.Object {
    var Arn: js.UndefOr[TrafficDistributionGroupArn]
    var Description: js.UndefOr[Description250]
    var Id: js.UndefOr[TrafficDistributionGroupId]
    var InstanceArn: js.UndefOr[InstanceArn]
    var Name: js.UndefOr[Name128]
    var Status: js.UndefOr[TrafficDistributionGroupStatus]
    var Tags: js.UndefOr[TagMap]
  }

  object TrafficDistributionGroup {
    @inline
    def apply(
        Arn: js.UndefOr[TrafficDistributionGroupArn] = js.undefined,
        Description: js.UndefOr[Description250] = js.undefined,
        Id: js.UndefOr[TrafficDistributionGroupId] = js.undefined,
        InstanceArn: js.UndefOr[InstanceArn] = js.undefined,
        Name: js.UndefOr[Name128] = js.undefined,
        Status: js.UndefOr[TrafficDistributionGroupStatus] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): TrafficDistributionGroup = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InstanceArn.foreach(__v => __obj.updateDynamic("InstanceArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrafficDistributionGroup]
    }
  }

  /** Information about traffic distribution groups.
    */
  @js.native
  trait TrafficDistributionGroupSummary extends js.Object {
    var Arn: js.UndefOr[TrafficDistributionGroupArn]
    var Id: js.UndefOr[TrafficDistributionGroupId]
    var InstanceArn: js.UndefOr[InstanceArn]
    var Name: js.UndefOr[Name128]
    var Status: js.UndefOr[TrafficDistributionGroupStatus]
  }

  object TrafficDistributionGroupSummary {
    @inline
    def apply(
        Arn: js.UndefOr[TrafficDistributionGroupArn] = js.undefined,
        Id: js.UndefOr[TrafficDistributionGroupId] = js.undefined,
        InstanceArn: js.UndefOr[InstanceArn] = js.undefined,
        Name: js.UndefOr[Name128] = js.undefined,
        Status: js.UndefOr[TrafficDistributionGroupStatus] = js.undefined
    ): TrafficDistributionGroupSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InstanceArn.foreach(__v => __obj.updateDynamic("InstanceArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrafficDistributionGroupSummary]
    }
  }

  @js.native
  trait TransferContactRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var ContactId: ContactId
    var InstanceId: InstanceId
    var ClientToken: js.UndefOr[ClientToken]
    var QueueId: js.UndefOr[QueueId]
    var UserId: js.UndefOr[AgentResourceId]
  }

  object TransferContactRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        ContactId: ContactId,
        InstanceId: InstanceId,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        QueueId: js.UndefOr[QueueId] = js.undefined,
        UserId: js.UndefOr[AgentResourceId] = js.undefined
    ): TransferContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      QueueId.foreach(__v => __obj.updateDynamic("QueueId")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransferContactRequest]
    }
  }

  @js.native
  trait TransferContactResponse extends js.Object {
    var ContactArn: js.UndefOr[ARN]
    var ContactId: js.UndefOr[ContactId]
  }

  object TransferContactResponse {
    @inline
    def apply(
        ContactArn: js.UndefOr[ARN] = js.undefined,
        ContactId: js.UndefOr[ContactId] = js.undefined
    ): TransferContactResponse = {
      val __obj = js.Dynamic.literal()
      ContactArn.foreach(__v => __obj.updateDynamic("ContactArn")(__v.asInstanceOf[js.Any]))
      ContactId.foreach(__v => __obj.updateDynamic("ContactId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransferContactResponse]
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
  trait UpdateAgentStatusRequest extends js.Object {
    var AgentStatusId: AgentStatusId
    var InstanceId: InstanceId
    var Description: js.UndefOr[UpdateAgentStatusDescription]
    var DisplayOrder: js.UndefOr[AgentStatusOrderNumber]
    var Name: js.UndefOr[AgentStatusName]
    var ResetOrderNumber: js.UndefOr[Boolean]
    var State: js.UndefOr[AgentStatusState]
  }

  object UpdateAgentStatusRequest {
    @inline
    def apply(
        AgentStatusId: AgentStatusId,
        InstanceId: InstanceId,
        Description: js.UndefOr[UpdateAgentStatusDescription] = js.undefined,
        DisplayOrder: js.UndefOr[AgentStatusOrderNumber] = js.undefined,
        Name: js.UndefOr[AgentStatusName] = js.undefined,
        ResetOrderNumber: js.UndefOr[Boolean] = js.undefined,
        State: js.UndefOr[AgentStatusState] = js.undefined
    ): UpdateAgentStatusRequest = {
      val __obj = js.Dynamic.literal(
        "AgentStatusId" -> AgentStatusId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayOrder.foreach(__v => __obj.updateDynamic("DisplayOrder")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResetOrderNumber.foreach(__v => __obj.updateDynamic("ResetOrderNumber")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAgentStatusRequest]
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
  trait UpdateContactFlowMetadataRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var InstanceId: InstanceId
    var ContactFlowState: js.UndefOr[ContactFlowState]
    var Description: js.UndefOr[ContactFlowDescription]
    var Name: js.UndefOr[ContactFlowName]
  }

  object UpdateContactFlowMetadataRequest {
    @inline
    def apply(
        ContactFlowId: ContactFlowId,
        InstanceId: InstanceId,
        ContactFlowState: js.UndefOr[ContactFlowState] = js.undefined,
        Description: js.UndefOr[ContactFlowDescription] = js.undefined,
        Name: js.UndefOr[ContactFlowName] = js.undefined
    ): UpdateContactFlowMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowId" -> ContactFlowId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      ContactFlowState.foreach(__v => __obj.updateDynamic("ContactFlowState")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContactFlowMetadataRequest]
    }
  }

  @js.native
  trait UpdateContactFlowModuleContentRequest extends js.Object {
    var ContactFlowModuleId: ContactFlowModuleId
    var Content: ContactFlowModuleContent
    var InstanceId: InstanceId
  }

  object UpdateContactFlowModuleContentRequest {
    @inline
    def apply(
        ContactFlowModuleId: ContactFlowModuleId,
        Content: ContactFlowModuleContent,
        InstanceId: InstanceId
    ): UpdateContactFlowModuleContentRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowModuleId" -> ContactFlowModuleId.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateContactFlowModuleContentRequest]
    }
  }

  @js.native
  trait UpdateContactFlowModuleContentResponse extends js.Object

  object UpdateContactFlowModuleContentResponse {
    @inline
    def apply(): UpdateContactFlowModuleContentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContactFlowModuleContentResponse]
    }
  }

  @js.native
  trait UpdateContactFlowModuleMetadataRequest extends js.Object {
    var ContactFlowModuleId: ContactFlowModuleId
    var InstanceId: InstanceId
    var Description: js.UndefOr[ContactFlowModuleDescription]
    var Name: js.UndefOr[ContactFlowModuleName]
    var State: js.UndefOr[ContactFlowModuleState]
  }

  object UpdateContactFlowModuleMetadataRequest {
    @inline
    def apply(
        ContactFlowModuleId: ContactFlowModuleId,
        InstanceId: InstanceId,
        Description: js.UndefOr[ContactFlowModuleDescription] = js.undefined,
        Name: js.UndefOr[ContactFlowModuleName] = js.undefined,
        State: js.UndefOr[ContactFlowModuleState] = js.undefined
    ): UpdateContactFlowModuleMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "ContactFlowModuleId" -> ContactFlowModuleId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContactFlowModuleMetadataRequest]
    }
  }

  @js.native
  trait UpdateContactFlowModuleMetadataResponse extends js.Object

  object UpdateContactFlowModuleMetadataResponse {
    @inline
    def apply(): UpdateContactFlowModuleMetadataResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContactFlowModuleMetadataResponse]
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
  trait UpdateContactRequest extends js.Object {
    var ContactId: ContactId
    var InstanceId: InstanceId
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[Name]
    var References: js.UndefOr[ContactReferences]
  }

  object UpdateContactRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InstanceId: InstanceId,
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        References: js.UndefOr[ContactReferences] = js.undefined
    ): UpdateContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      References.foreach(__v => __obj.updateDynamic("References")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContactRequest]
    }
  }

  @js.native
  trait UpdateContactResponse extends js.Object

  object UpdateContactResponse {
    @inline
    def apply(): UpdateContactResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContactResponse]
    }
  }

  @js.native
  trait UpdateContactScheduleRequest extends js.Object {
    var ContactId: ContactId
    var InstanceId: InstanceId
    var ScheduledTime: Timestamp
  }

  object UpdateContactScheduleRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InstanceId: InstanceId,
        ScheduledTime: Timestamp
    ): UpdateContactScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ScheduledTime" -> ScheduledTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateContactScheduleRequest]
    }
  }

  @js.native
  trait UpdateContactScheduleResponse extends js.Object

  object UpdateContactScheduleResponse {
    @inline
    def apply(): UpdateContactScheduleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContactScheduleResponse]
    }
  }

  @js.native
  trait UpdateHoursOfOperationRequest extends js.Object {
    var HoursOfOperationId: HoursOfOperationId
    var InstanceId: InstanceId
    var Config: js.UndefOr[HoursOfOperationConfigList]
    var Description: js.UndefOr[UpdateHoursOfOperationDescription]
    var Name: js.UndefOr[CommonNameLength127]
    var TimeZone: js.UndefOr[TimeZone]
  }

  object UpdateHoursOfOperationRequest {
    @inline
    def apply(
        HoursOfOperationId: HoursOfOperationId,
        InstanceId: InstanceId,
        Config: js.UndefOr[HoursOfOperationConfigList] = js.undefined,
        Description: js.UndefOr[UpdateHoursOfOperationDescription] = js.undefined,
        Name: js.UndefOr[CommonNameLength127] = js.undefined,
        TimeZone: js.UndefOr[TimeZone] = js.undefined
    ): UpdateHoursOfOperationRequest = {
      val __obj = js.Dynamic.literal(
        "HoursOfOperationId" -> HoursOfOperationId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      Config.foreach(__v => __obj.updateDynamic("Config")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TimeZone.foreach(__v => __obj.updateDynamic("TimeZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateHoursOfOperationRequest]
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
  trait UpdatePhoneNumberRequest extends js.Object {
    var PhoneNumberId: PhoneNumberId
    var TargetArn: ARN
    var ClientToken: js.UndefOr[ClientToken]
  }

  object UpdatePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: PhoneNumberId,
        TargetArn: ARN,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdatePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any],
        "TargetArn" -> TargetArn.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberRequest]
    }
  }

  @js.native
  trait UpdatePhoneNumberResponse extends js.Object {
    var PhoneNumberArn: js.UndefOr[ARN]
    var PhoneNumberId: js.UndefOr[PhoneNumberId]
  }

  object UpdatePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumberArn: js.UndefOr[ARN] = js.undefined,
        PhoneNumberId: js.UndefOr[PhoneNumberId] = js.undefined
    ): UpdatePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberArn.foreach(__v => __obj.updateDynamic("PhoneNumberArn")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberResponse]
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
    var QueueId: QueueId
    var MaxContacts: js.UndefOr[QueueMaxContacts]
  }

  object UpdateQueueMaxContactsRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QueueId: QueueId,
        MaxContacts: js.UndefOr[QueueMaxContacts] = js.undefined
    ): UpdateQueueMaxContactsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "QueueId" -> QueueId.asInstanceOf[js.Any]
      )

      MaxContacts.foreach(__v => __obj.updateDynamic("MaxContacts")(__v.asInstanceOf[js.Any]))
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
    var Description: js.UndefOr[UpdateQuickConnectDescription]
    var Name: js.UndefOr[QuickConnectName]
  }

  object UpdateQuickConnectNameRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        QuickConnectId: QuickConnectId,
        Description: js.UndefOr[UpdateQuickConnectDescription] = js.undefined,
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
  trait UpdateRuleRequest extends js.Object {
    var Actions: RuleActions
    var Function: RuleFunction
    var InstanceId: InstanceId
    var Name: RuleName
    var PublishStatus: RulePublishStatus
    var RuleId: RuleId
  }

  object UpdateRuleRequest {
    @inline
    def apply(
        Actions: RuleActions,
        Function: RuleFunction,
        InstanceId: InstanceId,
        Name: RuleName,
        PublishStatus: RulePublishStatus,
        RuleId: RuleId
    ): UpdateRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any],
        "Function" -> Function.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "PublishStatus" -> PublishStatus.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRuleRequest]
    }
  }

  @js.native
  trait UpdateSecurityProfileRequest extends js.Object {
    var InstanceId: InstanceId
    var SecurityProfileId: SecurityProfileId
    var AllowedAccessControlTags: js.UndefOr[AllowedAccessControlTags]
    var Description: js.UndefOr[SecurityProfileDescription]
    var Permissions: js.UndefOr[PermissionsList]
    var TagRestrictedResources: js.UndefOr[TagRestrictedResourceList]
  }

  object UpdateSecurityProfileRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        SecurityProfileId: SecurityProfileId,
        AllowedAccessControlTags: js.UndefOr[AllowedAccessControlTags] = js.undefined,
        Description: js.UndefOr[SecurityProfileDescription] = js.undefined,
        Permissions: js.UndefOr[PermissionsList] = js.undefined,
        TagRestrictedResources: js.UndefOr[TagRestrictedResourceList] = js.undefined
    ): UpdateSecurityProfileRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "SecurityProfileId" -> SecurityProfileId.asInstanceOf[js.Any]
      )

      AllowedAccessControlTags.foreach(__v => __obj.updateDynamic("AllowedAccessControlTags")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      TagRestrictedResources.foreach(__v => __obj.updateDynamic("TagRestrictedResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecurityProfileRequest]
    }
  }

  @js.native
  trait UpdateTaskTemplateRequest extends js.Object {
    var InstanceId: InstanceId
    var TaskTemplateId: TaskTemplateId
    var Constraints: js.UndefOr[TaskTemplateConstraints]
    var ContactFlowId: js.UndefOr[ContactFlowId]
    var Defaults: js.UndefOr[TaskTemplateDefaults]
    var Description: js.UndefOr[TaskTemplateDescription]
    var Fields: js.UndefOr[TaskTemplateFields]
    var Name: js.UndefOr[TaskTemplateName]
    var Status: js.UndefOr[TaskTemplateStatus]
  }

  object UpdateTaskTemplateRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        TaskTemplateId: TaskTemplateId,
        Constraints: js.UndefOr[TaskTemplateConstraints] = js.undefined,
        ContactFlowId: js.UndefOr[ContactFlowId] = js.undefined,
        Defaults: js.UndefOr[TaskTemplateDefaults] = js.undefined,
        Description: js.UndefOr[TaskTemplateDescription] = js.undefined,
        Fields: js.UndefOr[TaskTemplateFields] = js.undefined,
        Name: js.UndefOr[TaskTemplateName] = js.undefined,
        Status: js.UndefOr[TaskTemplateStatus] = js.undefined
    ): UpdateTaskTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "TaskTemplateId" -> TaskTemplateId.asInstanceOf[js.Any]
      )

      Constraints.foreach(__v => __obj.updateDynamic("Constraints")(__v.asInstanceOf[js.Any]))
      ContactFlowId.foreach(__v => __obj.updateDynamic("ContactFlowId")(__v.asInstanceOf[js.Any]))
      Defaults.foreach(__v => __obj.updateDynamic("Defaults")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTaskTemplateRequest]
    }
  }

  @js.native
  trait UpdateTaskTemplateResponse extends js.Object {
    var Arn: js.UndefOr[TaskTemplateArn]
    var Constraints: js.UndefOr[TaskTemplateConstraints]
    var ContactFlowId: js.UndefOr[ContactFlowId]
    var CreatedTime: js.UndefOr[timestamp]
    var Defaults: js.UndefOr[TaskTemplateDefaults]
    var Description: js.UndefOr[TaskTemplateDescription]
    var Fields: js.UndefOr[TaskTemplateFields]
    var Id: js.UndefOr[TaskTemplateId]
    var InstanceId: js.UndefOr[InstanceId]
    var LastModifiedTime: js.UndefOr[timestamp]
    var Name: js.UndefOr[TaskTemplateName]
    var Status: js.UndefOr[TaskTemplateStatus]
  }

  object UpdateTaskTemplateResponse {
    @inline
    def apply(
        Arn: js.UndefOr[TaskTemplateArn] = js.undefined,
        Constraints: js.UndefOr[TaskTemplateConstraints] = js.undefined,
        ContactFlowId: js.UndefOr[ContactFlowId] = js.undefined,
        CreatedTime: js.UndefOr[timestamp] = js.undefined,
        Defaults: js.UndefOr[TaskTemplateDefaults] = js.undefined,
        Description: js.UndefOr[TaskTemplateDescription] = js.undefined,
        Fields: js.UndefOr[TaskTemplateFields] = js.undefined,
        Id: js.UndefOr[TaskTemplateId] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        LastModifiedTime: js.UndefOr[timestamp] = js.undefined,
        Name: js.UndefOr[TaskTemplateName] = js.undefined,
        Status: js.UndefOr[TaskTemplateStatus] = js.undefined
    ): UpdateTaskTemplateResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Constraints.foreach(__v => __obj.updateDynamic("Constraints")(__v.asInstanceOf[js.Any]))
      ContactFlowId.foreach(__v => __obj.updateDynamic("ContactFlowId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Defaults.foreach(__v => __obj.updateDynamic("Defaults")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTaskTemplateResponse]
    }
  }

  @js.native
  trait UpdateTrafficDistributionRequest extends js.Object {
    var Id: TrafficDistributionGroupIdOrArn
    var TelephonyConfig: js.UndefOr[TelephonyConfig]
  }

  object UpdateTrafficDistributionRequest {
    @inline
    def apply(
        Id: TrafficDistributionGroupIdOrArn,
        TelephonyConfig: js.UndefOr[TelephonyConfig] = js.undefined
    ): UpdateTrafficDistributionRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      TelephonyConfig.foreach(__v => __obj.updateDynamic("TelephonyConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrafficDistributionRequest]
    }
  }

  @js.native
  trait UpdateTrafficDistributionResponse extends js.Object

  object UpdateTrafficDistributionResponse {
    @inline
    def apply(): UpdateTrafficDistributionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTrafficDistributionResponse]
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

  /** The URL reference.
    */
  @js.native
  trait UrlReference extends js.Object {
    var Name: js.UndefOr[ReferenceKey]
    var Value: js.UndefOr[ReferenceValue]
  }

  object UrlReference {
    @inline
    def apply(
        Name: js.UndefOr[ReferenceKey] = js.undefined,
        Value: js.UndefOr[ReferenceValue] = js.undefined
    ): UrlReference = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UrlReference]
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

  /** Contains information about a user account for an Amazon Connect instance.
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

  /** Data for a user.
    */
  @js.native
  trait UserData extends js.Object {
    var ActiveSlotsByChannel: js.UndefOr[ChannelToCountMap]
    var AvailableSlotsByChannel: js.UndefOr[ChannelToCountMap]
    var Contacts: js.UndefOr[AgentContactReferenceList]
    var HierarchyPath: js.UndefOr[HierarchyPathReference]
    var MaxSlotsByChannel: js.UndefOr[ChannelToCountMap]
    var RoutingProfile: js.UndefOr[RoutingProfileReference]
    var Status: js.UndefOr[AgentStatusReference]
    var User: js.UndefOr[UserReference]
  }

  object UserData {
    @inline
    def apply(
        ActiveSlotsByChannel: js.UndefOr[ChannelToCountMap] = js.undefined,
        AvailableSlotsByChannel: js.UndefOr[ChannelToCountMap] = js.undefined,
        Contacts: js.UndefOr[AgentContactReferenceList] = js.undefined,
        HierarchyPath: js.UndefOr[HierarchyPathReference] = js.undefined,
        MaxSlotsByChannel: js.UndefOr[ChannelToCountMap] = js.undefined,
        RoutingProfile: js.UndefOr[RoutingProfileReference] = js.undefined,
        Status: js.UndefOr[AgentStatusReference] = js.undefined,
        User: js.UndefOr[UserReference] = js.undefined
    ): UserData = {
      val __obj = js.Dynamic.literal()
      ActiveSlotsByChannel.foreach(__v => __obj.updateDynamic("ActiveSlotsByChannel")(__v.asInstanceOf[js.Any]))
      AvailableSlotsByChannel.foreach(__v => __obj.updateDynamic("AvailableSlotsByChannel")(__v.asInstanceOf[js.Any]))
      Contacts.foreach(__v => __obj.updateDynamic("Contacts")(__v.asInstanceOf[js.Any]))
      HierarchyPath.foreach(__v => __obj.updateDynamic("HierarchyPath")(__v.asInstanceOf[js.Any]))
      MaxSlotsByChannel.foreach(__v => __obj.updateDynamic("MaxSlotsByChannel")(__v.asInstanceOf[js.Any]))
      RoutingProfile.foreach(__v => __obj.updateDynamic("RoutingProfile")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserData]
    }
  }

  /** A filter for the user data.
    */
  @js.native
  trait UserDataFilters extends js.Object {
    var ContactFilter: js.UndefOr[ContactFilter]
    var Queues: js.UndefOr[Queues]
  }

  object UserDataFilters {
    @inline
    def apply(
        ContactFilter: js.UndefOr[ContactFilter] = js.undefined,
        Queues: js.UndefOr[Queues] = js.undefined
    ): UserDataFilters = {
      val __obj = js.Dynamic.literal()
      ContactFilter.foreach(__v => __obj.updateDynamic("ContactFilter")(__v.asInstanceOf[js.Any]))
      Queues.foreach(__v => __obj.updateDynamic("Queues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserDataFilters]
    }
  }

  /** Contains information about the identity of a user.
    */
  @js.native
  trait UserIdentityInfo extends js.Object {
    var Email: js.UndefOr[Email]
    var FirstName: js.UndefOr[AgentFirstName]
    var LastName: js.UndefOr[AgentLastName]
    var Mobile: js.UndefOr[PhoneNumber]
    var SecondaryEmail: js.UndefOr[Email]
  }

  object UserIdentityInfo {
    @inline
    def apply(
        Email: js.UndefOr[Email] = js.undefined,
        FirstName: js.UndefOr[AgentFirstName] = js.undefined,
        LastName: js.UndefOr[AgentLastName] = js.undefined,
        Mobile: js.UndefOr[PhoneNumber] = js.undefined,
        SecondaryEmail: js.UndefOr[Email] = js.undefined
    ): UserIdentityInfo = {
      val __obj = js.Dynamic.literal()
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      Mobile.foreach(__v => __obj.updateDynamic("Mobile")(__v.asInstanceOf[js.Any]))
      SecondaryEmail.foreach(__v => __obj.updateDynamic("SecondaryEmail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserIdentityInfo]
    }
  }

  /** The user's first name and last name.
    */
  @js.native
  trait UserIdentityInfoLite extends js.Object {
    var FirstName: js.UndefOr[AgentFirstName]
    var LastName: js.UndefOr[AgentLastName]
  }

  object UserIdentityInfoLite {
    @inline
    def apply(
        FirstName: js.UndefOr[AgentFirstName] = js.undefined,
        LastName: js.UndefOr[AgentLastName] = js.undefined
    ): UserIdentityInfoLite = {
      val __obj = js.Dynamic.literal()
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserIdentityInfoLite]
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

  /** Information about the user.
    */
  @js.native
  trait UserReference extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[UserId]
  }

  object UserReference {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[UserId] = js.undefined
    ): UserReference = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserReference]
    }
  }

  /** The search criteria to be used to return users.
    *
    * '''Note:'''The <code>name</code> and <code>description</code> fields support "contains" queries with a minimum of 2 characters and a maximum of 25 characters. Any queries with character lengths outside of this range will throw invalid results.
    */
  @js.native
  trait UserSearchCriteria extends js.Object {
    var AndConditions: js.UndefOr[UserSearchConditionList]
    var HierarchyGroupCondition: js.UndefOr[HierarchyGroupCondition]
    var OrConditions: js.UndefOr[UserSearchConditionList]
    var StringCondition: js.UndefOr[StringCondition]
  }

  object UserSearchCriteria {
    @inline
    def apply(
        AndConditions: js.UndefOr[UserSearchConditionList] = js.undefined,
        HierarchyGroupCondition: js.UndefOr[HierarchyGroupCondition] = js.undefined,
        OrConditions: js.UndefOr[UserSearchConditionList] = js.undefined,
        StringCondition: js.UndefOr[StringCondition] = js.undefined
    ): UserSearchCriteria = {
      val __obj = js.Dynamic.literal()
      AndConditions.foreach(__v => __obj.updateDynamic("AndConditions")(__v.asInstanceOf[js.Any]))
      HierarchyGroupCondition.foreach(__v => __obj.updateDynamic("HierarchyGroupCondition")(__v.asInstanceOf[js.Any]))
      OrConditions.foreach(__v => __obj.updateDynamic("OrConditions")(__v.asInstanceOf[js.Any]))
      StringCondition.foreach(__v => __obj.updateDynamic("StringCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserSearchCriteria]
    }
  }

  /** Filters to be applied to search results.
    */
  @js.native
  trait UserSearchFilter extends js.Object {
    var TagFilter: js.UndefOr[ControlPlaneTagFilter]
  }

  object UserSearchFilter {
    @inline
    def apply(
        TagFilter: js.UndefOr[ControlPlaneTagFilter] = js.undefined
    ): UserSearchFilter = {
      val __obj = js.Dynamic.literal()
      TagFilter.foreach(__v => __obj.updateDynamic("TagFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserSearchFilter]
    }
  }

  /** Information about the returned users.
    */
  @js.native
  trait UserSearchSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var DirectoryUserId: js.UndefOr[DirectoryUserId]
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
    var Id: js.UndefOr[UserId]
    var IdentityInfo: js.UndefOr[UserIdentityInfoLite]
    var PhoneConfig: js.UndefOr[UserPhoneConfig]
    var RoutingProfileId: js.UndefOr[RoutingProfileId]
    var SecurityProfileIds: js.UndefOr[SecurityProfileIds]
    var Tags: js.UndefOr[TagMap]
    var Username: js.UndefOr[AgentUsername]
  }

  object UserSearchSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        DirectoryUserId: js.UndefOr[DirectoryUserId] = js.undefined,
        HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined,
        Id: js.UndefOr[UserId] = js.undefined,
        IdentityInfo: js.UndefOr[UserIdentityInfoLite] = js.undefined,
        PhoneConfig: js.UndefOr[UserPhoneConfig] = js.undefined,
        RoutingProfileId: js.UndefOr[RoutingProfileId] = js.undefined,
        SecurityProfileIds: js.UndefOr[SecurityProfileIds] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Username: js.UndefOr[AgentUsername] = js.undefined
    ): UserSearchSummary = {
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
      __obj.asInstanceOf[UserSearchSummary]
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

  /** Contains information about a custom vocabulary.
    */
  @js.native
  trait Vocabulary extends js.Object {
    var Arn: ARN
    var Id: VocabularyId
    var LanguageCode: VocabularyLanguageCode
    var LastModifiedTime: VocabularyLastModifiedTime
    var Name: VocabularyName
    var State: VocabularyState
    var Content: js.UndefOr[VocabularyContent]
    var FailureReason: js.UndefOr[VocabularyFailureReason]
    var Tags: js.UndefOr[TagMap]
  }

  object Vocabulary {
    @inline
    def apply(
        Arn: ARN,
        Id: VocabularyId,
        LanguageCode: VocabularyLanguageCode,
        LastModifiedTime: VocabularyLastModifiedTime,
        Name: VocabularyName,
        State: VocabularyState,
        Content: js.UndefOr[VocabularyContent] = js.undefined,
        FailureReason: js.UndefOr[VocabularyFailureReason] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): Vocabulary = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )

      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Vocabulary]
    }
  }

  /** Contains summary information about the custom vocabulary.
    */
  @js.native
  trait VocabularySummary extends js.Object {
    var Arn: ARN
    var Id: VocabularyId
    var LanguageCode: VocabularyLanguageCode
    var LastModifiedTime: VocabularyLastModifiedTime
    var Name: VocabularyName
    var State: VocabularyState
    var FailureReason: js.UndefOr[VocabularyFailureReason]
  }

  object VocabularySummary {
    @inline
    def apply(
        Arn: ARN,
        Id: VocabularyId,
        LanguageCode: VocabularyLanguageCode,
        LastModifiedTime: VocabularyLastModifiedTime,
        Name: VocabularyName,
        State: VocabularyState,
        FailureReason: js.UndefOr[VocabularyFailureReason] = js.undefined
    ): VocabularySummary = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )

      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VocabularySummary]
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
