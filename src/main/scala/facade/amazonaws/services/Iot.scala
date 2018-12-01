package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object iot {
  type AbortAction = String
  type AbortCriteriaList = js.Array[AbortCriteria]
  type AbortThresholdPercentage = Double
  type ActionList = js.Array[Action]
  type ActionType = String
  type ActiveViolations = js.Array[ActiveViolation]
  type AdditionalParameterMap = js.Dictionary[Value]
  type AlarmName = String
  type AlertTargetArn = String
  type AlertTargetType = String
  type AlertTargets = js.Dictionary[AlertTarget]
  type AllowAutoRegistration = Boolean
  type ApproximateSecondsBeforeTimedOut = Double
  type AscendingOrder = Boolean
  type AttributeKey = String
  type AttributeName = String
  type AttributeValue = String
  type Attributes = js.Dictionary[AttributeValue]
  type AttributesMap = js.Dictionary[Value]
  type AuditCheckConfigurations = js.Dictionary[AuditCheckConfiguration]
  type AuditCheckName = String
  type AuditCheckRunStatus = String
  type AuditDetails = js.Dictionary[AuditCheckDetails]
  type AuditFindingSeverity = String
  type AuditFindings = js.Array[AuditFinding]
  type AuditFrequency = String
  type AuditNotificationTargetConfigurations = js.Dictionary[AuditNotificationTarget]
  type AuditNotificationType = String
  type AuditTaskId = String
  type AuditTaskMetadataList = js.Array[AuditTaskMetadata]
  type AuditTaskStatus = String
  type AuditTaskType = String
  type AuthDecision = String
  type AuthInfos = js.Array[AuthInfo]
  type AuthResults = js.Array[AuthResult]
  type AuthorizerArn = String
  type AuthorizerFunctionArn = String
  type AuthorizerName = String
  type AuthorizerStatus = String
  type Authorizers = js.Array[AuthorizerSummary]
  type AutoRegistrationStatus = String
  type AwsAccountId = String
  type AwsArn = String
  type AwsIotJobArn = String
  type AwsIotJobId = String
  type AwsIotSqlVersion = String
  type BehaviorMetric = String
  type BehaviorName = String
  type Behaviors = js.Array[Behavior]
  type BillingGroupArn = String
  type BillingGroupDescription = String
  type BillingGroupId = String
  type BillingGroupName = String
  type BillingGroupNameAndArnList = js.Array[GroupNameAndArn]
  type BucketName = String
  type CACertificateStatus = String
  type CACertificates = js.Array[CACertificate]
  type CanceledChecksCount = Int
  type CanceledThings = Int
  type CannedAccessControlList = String
  type CertificateArn = String
  type CertificateId = String
  type CertificateName = String
  type CertificatePathOnDevice = String
  type CertificatePem = String
  type CertificateSigningRequest = String
  type CertificateStatus = String
  type Certificates = js.Array[Certificate]
  type ChannelName = String
  type CheckCompliant = Boolean
  type Cidr = String
  type Cidrs = js.Array[Cidr]
  type ClientId = String
  type Code = String
  type CognitoIdentityPoolId = String
  type Comment = String
  type ComparisonOperator = String
  type CompliantChecksCount = Int
  type ConnectivityTimestamp = Double
  type Count = Int
  type CreatedAtDate = js.Date
  type CreationDate = js.Date
  type CredentialDurationSeconds = Int
  type CustomerVersion = Int
  type DateType = js.Date
  type DayOfMonth = String
  type DayOfWeek = String
  type DeleteScheduledAudits = Boolean
  type DeleteStream = Boolean
  type DeliveryStreamName = String
  type DeprecationDate = js.Date
  type Description = String
  type DetailsKey = String
  type DetailsMap = js.Dictionary[DetailsValue]
  type DetailsValue = String
  type DisableAllLogs = Boolean
  type DurationSeconds = Int
  type DynamicGroupStatus = String
  type DynamoKeyType = String
  type DynamoOperation = String
  type EffectivePolicies = js.Array[EffectivePolicy]
  type ElasticsearchEndpoint = String
  type ElasticsearchId = String
  type ElasticsearchIndex = String
  type ElasticsearchType = String
  type Enabled = Boolean
  type EndpointAddress = String
  type EndpointType = String
  type ErrorCode = String
  type ErrorMessage = String
  type EventConfigurations = js.Dictionary[Configuration]
  type EventType = String
  type ExecutionNamePrefix = String
  type ExecutionNumber = Double
  type ExpectedVersion = Double
  type ExpiresInSec = Double
  type FailedChecksCount = Int
  type FailedThings = Int
  type FileId = Int
  type FileName = String
  type FirehoseSeparator = String
  type Flag = Boolean
  type ForceDelete = Boolean
  type ForceDeleteAWSJob = Boolean
  type ForceFlag = Boolean
  type Forced = Boolean
  type FunctionArn = String
  type GEMaxResults = Int
  type GenerationId = String
  type HashAlgorithm = String
  type HashKeyField = String
  type HashKeyValue = String
  type InProgressChecksCount = Int
  type InProgressThings = Int
  type InProgressTimeoutInMinutes = Double
  type IncrementFactor = Double
  type IndexName = String
  type IndexNamesList = js.Array[IndexName]
  type IndexSchema = String
  type IndexStatus = String
  type InlineDocument = String
  type InputName = String
  type IsAuthenticated = Boolean
  type IsDefaultVersion = Boolean
  type IsDisabled = Boolean
  type JobArn = String
  type JobDescription = String
  type JobDocument = String
  type JobDocumentSource = String
  type JobExecutionFailureType = String
  type JobExecutionStatus = String
  type JobExecutionSummaryForJobList = js.Array[JobExecutionSummaryForJob]
  type JobExecutionSummaryForThingList = js.Array[JobExecutionSummaryForThing]
  type JobId = String
  type JobStatus = String
  type JobSummaryList = js.Array[JobSummary]
  type JobTargets = js.Array[TargetArn]
  type JsonDocument = String
  type Key = String
  type KeyName = String
  type KeyValue = String
  type LaserMaxResults = Int
  type LastModifiedDate = js.Date
  type LogLevel = String
  type LogTargetConfigurations = js.Array[LogTargetConfiguration]
  type LogTargetName = String
  type LogTargetType = String
  type Marker = String
  type MaxJobExecutionsPerMin = Int
  type MaxResults = Int
  type MaximumPerMinute = Int
  type Message = String
  type MessageFormat = String
  type MessageId = String
  type MinimumNumberOfExecutedThings = Int
  type MissingContextValue = String
  type MissingContextValues = js.Array[MissingContextValue]
  type NextToken = String
  type NonCompliantChecksCount = Int
  type NonCompliantResourcesCount = Double
  type NumberOfThings = Int
  type OTAUpdateArn = String
  type OTAUpdateDescription = String
  type OTAUpdateErrorMessage = String
  type OTAUpdateFileVersion = String
  type OTAUpdateFiles = js.Array[OTAUpdateFile]
  type OTAUpdateId = String
  type OTAUpdateStatus = String
  type OTAUpdatesSummary = js.Array[OTAUpdateSummary]
  type OptionalVersion = Double
  type OutgoingCertificates = js.Array[OutgoingCertificate]
  type OverrideDynamicGroups = Boolean
  type PageSize = Int
  type Parameter = String
  type Parameters = js.Dictionary[Value]
  type PartitionKey = String
  type PayloadField = String
  type Percentage = Int
  type Platform = String
  type Policies = js.Array[Policy]
  type PolicyArn = String
  type PolicyDocument = String
  type PolicyDocuments = js.Array[PolicyDocument]
  type PolicyName = String
  type PolicyNames = js.Array[PolicyName]
  type PolicyTarget = String
  type PolicyTargets = js.Array[PolicyTarget]
  type PolicyVersionId = String
  type PolicyVersions = js.Array[PolicyVersion]
  type Port = Int
  type Ports = js.Array[Port]
  type Prefix = String
  type Principal = String
  type PrincipalArn = String
  type PrincipalId = String
  type Principals = js.Array[PrincipalArn]
  type PrivateKey = String
  type ProcessingTargetName = String
  type ProcessingTargetNameList = js.Array[ProcessingTargetName]
  type PublicKey = String
  type PublicKeyMap = js.Dictionary[KeyValue]
  type QueryMaxResults = Int
  type QueryString = String
  type QueryVersion = String
  type QueueUrl = String
  type QueuedThings = Int
  type RangeKeyField = String
  type RangeKeyValue = String
  type ReasonCode = String
  type ReasonForNonCompliance = String
  type ReasonForNonComplianceCode = String
  type Recursive = Boolean
  type RecursiveWithoutDefault = Boolean
  type RegistrationCode = String
  type RegistryMaxResults = Int
  type RegistryS3BucketName = String
  type RegistryS3KeyName = String
  type RejectedThings = Int
  type RelatedResources = js.Array[RelatedResource]
  type RemoveAutoRegistration = Boolean
  type RemoveThingType = Boolean
  type RemovedThings = Int
  type ReportType = String
  type Resource = String
  type ResourceArn = String
  type ResourceArns = js.Dictionary[ResourceArn]
  type ResourceLogicalId = String
  type ResourceType = String
  type Resources = js.Array[Resource]
  type RoleAlias = String
  type RoleAliasArn = String
  type RoleAliases = js.Array[RoleAlias]
  type RoleArn = String
  type RolloutRatePerMinute = Int
  type RuleArn = String
  type RuleName = String
  type S3Bucket = String
  type S3FileUrl = String
  type S3FileUrlList = js.Array[S3FileUrl]
  type S3Key = String
  type S3Version = String
  type SQL = String
  type SalesforceEndpoint = String
  type SalesforceToken = String
  type ScheduledAuditArn = String
  type ScheduledAuditMetadataList = js.Array[ScheduledAuditMetadata]
  type ScheduledAuditName = String
  type SearchableAttributes = js.Array[AttributeName]
  type Seconds = Int
  type SecurityProfileArn = String
  type SecurityProfileDescription = String
  type SecurityProfileIdentifiers = js.Array[SecurityProfileIdentifier]
  type SecurityProfileName = String
  type SecurityProfileTargetArn = String
  type SecurityProfileTargetMappings = js.Array[SecurityProfileTargetMapping]
  type SecurityProfileTargets = js.Array[SecurityProfileTarget]
  type SetAsActive = Boolean
  type SetAsActiveFlag = Boolean
  type SetAsDefault = Boolean
  type Signature = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SignatureAlgorithm = String
  type SigningJobId = String
  type SigningProfileName = String
  type SkyfallMaxResults = Int
  type StateMachineName = String
  type StateReason = String
  type StateValue = String
  type Status = String
  type StreamArn = String
  type StreamDescription = String
  type StreamFiles = js.Array[StreamFile]
  type StreamId = String
  type StreamName = String
  type StreamVersion = Int
  type StreamsSummary = js.Array[StreamSummary]
  type StringMap = js.Dictionary[String]
  type SucceededThings = Int
  type TableName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Target = String
  type TargetArn = String
  type TargetAuditCheckNames = js.Array[AuditCheckName]
  type TargetSelection = String
  type Targets = js.Array[Target]
  type TaskId = String
  type TaskIdList = js.Array[TaskId]
  type TemplateBody = String
  type ThingArn = String
  type ThingAttributeList = js.Array[ThingAttribute]
  type ThingConnectivityIndexingMode = String
  type ThingDocumentList = js.Array[ThingDocument]
  type ThingGroupArn = String
  type ThingGroupDescription = String
  type ThingGroupDocumentList = js.Array[ThingGroupDocument]
  type ThingGroupId = String
  type ThingGroupIndexingMode = String
  type ThingGroupList = js.Array[ThingGroupName]
  type ThingGroupName = String
  type ThingGroupNameAndArnList = js.Array[GroupNameAndArn]
  type ThingGroupNameList = js.Array[ThingGroupName]
  type ThingId = String
  type ThingIndexingMode = String
  type ThingName = String
  type ThingNameList = js.Array[ThingName]
  type ThingTypeArn = String
  type ThingTypeDescription = String
  type ThingTypeId = String
  type ThingTypeList = js.Array[ThingTypeDefinition]
  type ThingTypeName = String
  type TimedOutThings = Int
  type Timestamp = js.Date
  type Token = String
  type TokenKeyName = String
  type TokenSignature = String
  type Topic = String
  type TopicPattern = String
  type TopicRuleList = js.Array[TopicRuleListItem]
  type TotalChecksCount = Int
  type TotalResourcesCount = Double
  type UndoDeprecate = Boolean
  type UnsignedLong = Double
  type UseBase64 = Boolean
  type Valid = Boolean
  type ValidationErrors = js.Array[ValidationError]
  type Value = String
  type Version = Double
  type VersionNumber = Double
  type ViolationEventType = String
  type ViolationEvents = js.Array[ViolationEvent]
  type ViolationId = String
  type WaitingForDataCollectionChecksCount = Int
}

package iot {
  @js.native
  @JSImport("aws-sdk", "Iot")
  class Iot(config: AWSConfig) extends js.Object {
    def acceptCertificateTransfer(params: AcceptCertificateTransferRequest): Request[js.Object] = js.native
    def addThingToBillingGroup(params: AddThingToBillingGroupRequest): Request[AddThingToBillingGroupResponse] = js.native
    def addThingToThingGroup(params: AddThingToThingGroupRequest): Request[AddThingToThingGroupResponse] = js.native
    def associateTargetsWithJob(params: AssociateTargetsWithJobRequest): Request[AssociateTargetsWithJobResponse] = js.native
    def attachPolicy(params: AttachPolicyRequest): Request[js.Object] = js.native
    def attachPrincipalPolicy(params: AttachPrincipalPolicyRequest): Request[js.Object] = js.native
    def attachSecurityProfile(params: AttachSecurityProfileRequest): Request[AttachSecurityProfileResponse] = js.native
    def attachThingPrincipal(params: AttachThingPrincipalRequest): Request[AttachThingPrincipalResponse] = js.native
    def cancelAuditTask(params: CancelAuditTaskRequest): Request[CancelAuditTaskResponse] = js.native
    def cancelCertificateTransfer(params: CancelCertificateTransferRequest): Request[js.Object] = js.native
    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse] = js.native
    def cancelJobExecution(params: CancelJobExecutionRequest): Request[js.Object] = js.native
    def clearDefaultAuthorizer(params: ClearDefaultAuthorizerRequest): Request[ClearDefaultAuthorizerResponse] = js.native
    def createAuthorizer(params: CreateAuthorizerRequest): Request[CreateAuthorizerResponse] = js.native
    def createBillingGroup(params: CreateBillingGroupRequest): Request[CreateBillingGroupResponse] = js.native
    def createCertificateFromCsr(params: CreateCertificateFromCsrRequest): Request[CreateCertificateFromCsrResponse] = js.native
    def createDynamicThingGroup(params: CreateDynamicThingGroupRequest): Request[CreateDynamicThingGroupResponse] = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse] = js.native
    def createKeysAndCertificate(params: CreateKeysAndCertificateRequest): Request[CreateKeysAndCertificateResponse] = js.native
    def createOTAUpdate(params: CreateOTAUpdateRequest): Request[CreateOTAUpdateResponse] = js.native
    def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse] = js.native
    def createPolicyVersion(params: CreatePolicyVersionRequest): Request[CreatePolicyVersionResponse] = js.native
    def createRoleAlias(params: CreateRoleAliasRequest): Request[CreateRoleAliasResponse] = js.native
    def createScheduledAudit(params: CreateScheduledAuditRequest): Request[CreateScheduledAuditResponse] = js.native
    def createSecurityProfile(params: CreateSecurityProfileRequest): Request[CreateSecurityProfileResponse] = js.native
    def createStream(params: CreateStreamRequest): Request[CreateStreamResponse] = js.native
    def createThing(params: CreateThingRequest): Request[CreateThingResponse] = js.native
    def createThingGroup(params: CreateThingGroupRequest): Request[CreateThingGroupResponse] = js.native
    def createThingType(params: CreateThingTypeRequest): Request[CreateThingTypeResponse] = js.native
    def createTopicRule(params: CreateTopicRuleRequest): Request[js.Object] = js.native
    def deleteAccountAuditConfiguration(params: DeleteAccountAuditConfigurationRequest): Request[DeleteAccountAuditConfigurationResponse] = js.native
    def deleteAuthorizer(params: DeleteAuthorizerRequest): Request[DeleteAuthorizerResponse] = js.native
    def deleteBillingGroup(params: DeleteBillingGroupRequest): Request[DeleteBillingGroupResponse] = js.native
    def deleteCACertificate(params: DeleteCACertificateRequest): Request[DeleteCACertificateResponse] = js.native
    def deleteCertificate(params: DeleteCertificateRequest): Request[js.Object] = js.native
    def deleteDynamicThingGroup(params: DeleteDynamicThingGroupRequest): Request[DeleteDynamicThingGroupResponse] = js.native
    def deleteJob(params: DeleteJobRequest): Request[js.Object] = js.native
    def deleteJobExecution(params: DeleteJobExecutionRequest): Request[js.Object] = js.native
    def deleteOTAUpdate(params: DeleteOTAUpdateRequest): Request[DeleteOTAUpdateResponse] = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object] = js.native
    def deletePolicyVersion(params: DeletePolicyVersionRequest): Request[js.Object] = js.native
    def deleteRegistrationCode(params: DeleteRegistrationCodeRequest): Request[DeleteRegistrationCodeResponse] = js.native
    def deleteRoleAlias(params: DeleteRoleAliasRequest): Request[DeleteRoleAliasResponse] = js.native
    def deleteScheduledAudit(params: DeleteScheduledAuditRequest): Request[DeleteScheduledAuditResponse] = js.native
    def deleteSecurityProfile(params: DeleteSecurityProfileRequest): Request[DeleteSecurityProfileResponse] = js.native
    def deleteStream(params: DeleteStreamRequest): Request[DeleteStreamResponse] = js.native
    def deleteThing(params: DeleteThingRequest): Request[DeleteThingResponse] = js.native
    def deleteThingGroup(params: DeleteThingGroupRequest): Request[DeleteThingGroupResponse] = js.native
    def deleteThingType(params: DeleteThingTypeRequest): Request[DeleteThingTypeResponse] = js.native
    def deleteTopicRule(params: DeleteTopicRuleRequest): Request[js.Object] = js.native
    def deleteV2LoggingLevel(params: DeleteV2LoggingLevelRequest): Request[js.Object] = js.native
    def deprecateThingType(params: DeprecateThingTypeRequest): Request[DeprecateThingTypeResponse] = js.native
    def describeAccountAuditConfiguration(params: DescribeAccountAuditConfigurationRequest): Request[DescribeAccountAuditConfigurationResponse] = js.native
    def describeAuditTask(params: DescribeAuditTaskRequest): Request[DescribeAuditTaskResponse] = js.native
    def describeAuthorizer(params: DescribeAuthorizerRequest): Request[DescribeAuthorizerResponse] = js.native
    def describeBillingGroup(params: DescribeBillingGroupRequest): Request[DescribeBillingGroupResponse] = js.native
    def describeCACertificate(params: DescribeCACertificateRequest): Request[DescribeCACertificateResponse] = js.native
    def describeCertificate(params: DescribeCertificateRequest): Request[DescribeCertificateResponse] = js.native
    def describeDefaultAuthorizer(params: DescribeDefaultAuthorizerRequest): Request[DescribeDefaultAuthorizerResponse] = js.native
    def describeEndpoint(params: DescribeEndpointRequest): Request[DescribeEndpointResponse] = js.native
    def describeEventConfigurations(params: DescribeEventConfigurationsRequest): Request[DescribeEventConfigurationsResponse] = js.native
    def describeIndex(params: DescribeIndexRequest): Request[DescribeIndexResponse] = js.native
    def describeJob(params: DescribeJobRequest): Request[DescribeJobResponse] = js.native
    def describeJobExecution(params: DescribeJobExecutionRequest): Request[DescribeJobExecutionResponse] = js.native
    def describeRoleAlias(params: DescribeRoleAliasRequest): Request[DescribeRoleAliasResponse] = js.native
    def describeScheduledAudit(params: DescribeScheduledAuditRequest): Request[DescribeScheduledAuditResponse] = js.native
    def describeSecurityProfile(params: DescribeSecurityProfileRequest): Request[DescribeSecurityProfileResponse] = js.native
    def describeStream(params: DescribeStreamRequest): Request[DescribeStreamResponse] = js.native
    def describeThing(params: DescribeThingRequest): Request[DescribeThingResponse] = js.native
    def describeThingGroup(params: DescribeThingGroupRequest): Request[DescribeThingGroupResponse] = js.native
    def describeThingRegistrationTask(params: DescribeThingRegistrationTaskRequest): Request[DescribeThingRegistrationTaskResponse] = js.native
    def describeThingType(params: DescribeThingTypeRequest): Request[DescribeThingTypeResponse] = js.native
    def detachPolicy(params: DetachPolicyRequest): Request[js.Object] = js.native
    def detachPrincipalPolicy(params: DetachPrincipalPolicyRequest): Request[js.Object] = js.native
    def detachSecurityProfile(params: DetachSecurityProfileRequest): Request[DetachSecurityProfileResponse] = js.native
    def detachThingPrincipal(params: DetachThingPrincipalRequest): Request[DetachThingPrincipalResponse] = js.native
    def disableTopicRule(params: DisableTopicRuleRequest): Request[js.Object] = js.native
    def enableTopicRule(params: EnableTopicRuleRequest): Request[js.Object] = js.native
    def getEffectivePolicies(params: GetEffectivePoliciesRequest): Request[GetEffectivePoliciesResponse] = js.native
    def getIndexingConfiguration(params: GetIndexingConfigurationRequest): Request[GetIndexingConfigurationResponse] = js.native
    def getJobDocument(params: GetJobDocumentRequest): Request[GetJobDocumentResponse] = js.native
    def getLoggingOptions(params: GetLoggingOptionsRequest): Request[GetLoggingOptionsResponse] = js.native
    def getOTAUpdate(params: GetOTAUpdateRequest): Request[GetOTAUpdateResponse] = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse] = js.native
    def getPolicyVersion(params: GetPolicyVersionRequest): Request[GetPolicyVersionResponse] = js.native
    def getRegistrationCode(params: GetRegistrationCodeRequest): Request[GetRegistrationCodeResponse] = js.native
    def getTopicRule(params: GetTopicRuleRequest): Request[GetTopicRuleResponse] = js.native
    def getV2LoggingOptions(params: GetV2LoggingOptionsRequest): Request[GetV2LoggingOptionsResponse] = js.native
    def listActiveViolations(params: ListActiveViolationsRequest): Request[ListActiveViolationsResponse] = js.native
    def listAttachedPolicies(params: ListAttachedPoliciesRequest): Request[ListAttachedPoliciesResponse] = js.native
    def listAuditFindings(params: ListAuditFindingsRequest): Request[ListAuditFindingsResponse] = js.native
    def listAuditTasks(params: ListAuditTasksRequest): Request[ListAuditTasksResponse] = js.native
    def listAuthorizers(params: ListAuthorizersRequest): Request[ListAuthorizersResponse] = js.native
    def listBillingGroups(params: ListBillingGroupsRequest): Request[ListBillingGroupsResponse] = js.native
    def listCACertificates(params: ListCACertificatesRequest): Request[ListCACertificatesResponse] = js.native
    def listCertificates(params: ListCertificatesRequest): Request[ListCertificatesResponse] = js.native
    def listCertificatesByCA(params: ListCertificatesByCARequest): Request[ListCertificatesByCAResponse] = js.native
    def listIndices(params: ListIndicesRequest): Request[ListIndicesResponse] = js.native
    def listJobExecutionsForJob(params: ListJobExecutionsForJobRequest): Request[ListJobExecutionsForJobResponse] = js.native
    def listJobExecutionsForThing(params: ListJobExecutionsForThingRequest): Request[ListJobExecutionsForThingResponse] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse] = js.native
    def listOTAUpdates(params: ListOTAUpdatesRequest): Request[ListOTAUpdatesResponse] = js.native
    def listOutgoingCertificates(params: ListOutgoingCertificatesRequest): Request[ListOutgoingCertificatesResponse] = js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse] = js.native
    def listPolicyPrincipals(params: ListPolicyPrincipalsRequest): Request[ListPolicyPrincipalsResponse] = js.native
    def listPolicyVersions(params: ListPolicyVersionsRequest): Request[ListPolicyVersionsResponse] = js.native
    def listPrincipalPolicies(params: ListPrincipalPoliciesRequest): Request[ListPrincipalPoliciesResponse] = js.native
    def listPrincipalThings(params: ListPrincipalThingsRequest): Request[ListPrincipalThingsResponse] = js.native
    def listRoleAliases(params: ListRoleAliasesRequest): Request[ListRoleAliasesResponse] = js.native
    def listScheduledAudits(params: ListScheduledAuditsRequest): Request[ListScheduledAuditsResponse] = js.native
    def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse] = js.native
    def listSecurityProfilesForTarget(params: ListSecurityProfilesForTargetRequest): Request[ListSecurityProfilesForTargetResponse] = js.native
    def listStreams(params: ListStreamsRequest): Request[ListStreamsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTargetsForPolicy(params: ListTargetsForPolicyRequest): Request[ListTargetsForPolicyResponse] = js.native
    def listTargetsForSecurityProfile(params: ListTargetsForSecurityProfileRequest): Request[ListTargetsForSecurityProfileResponse] = js.native
    def listThingGroups(params: ListThingGroupsRequest): Request[ListThingGroupsResponse] = js.native
    def listThingGroupsForThing(params: ListThingGroupsForThingRequest): Request[ListThingGroupsForThingResponse] = js.native
    def listThingPrincipals(params: ListThingPrincipalsRequest): Request[ListThingPrincipalsResponse] = js.native
    def listThingRegistrationTaskReports(params: ListThingRegistrationTaskReportsRequest): Request[ListThingRegistrationTaskReportsResponse] = js.native
    def listThingRegistrationTasks(params: ListThingRegistrationTasksRequest): Request[ListThingRegistrationTasksResponse] = js.native
    def listThingTypes(params: ListThingTypesRequest): Request[ListThingTypesResponse] = js.native
    def listThings(params: ListThingsRequest): Request[ListThingsResponse] = js.native
    def listThingsInBillingGroup(params: ListThingsInBillingGroupRequest): Request[ListThingsInBillingGroupResponse] = js.native
    def listThingsInThingGroup(params: ListThingsInThingGroupRequest): Request[ListThingsInThingGroupResponse] = js.native
    def listTopicRules(params: ListTopicRulesRequest): Request[ListTopicRulesResponse] = js.native
    def listV2LoggingLevels(params: ListV2LoggingLevelsRequest): Request[ListV2LoggingLevelsResponse] = js.native
    def listViolationEvents(params: ListViolationEventsRequest): Request[ListViolationEventsResponse] = js.native
    def registerCACertificate(params: RegisterCACertificateRequest): Request[RegisterCACertificateResponse] = js.native
    def registerCertificate(params: RegisterCertificateRequest): Request[RegisterCertificateResponse] = js.native
    def registerThing(params: RegisterThingRequest): Request[RegisterThingResponse] = js.native
    def rejectCertificateTransfer(params: RejectCertificateTransferRequest): Request[js.Object] = js.native
    def removeThingFromBillingGroup(params: RemoveThingFromBillingGroupRequest): Request[RemoveThingFromBillingGroupResponse] = js.native
    def removeThingFromThingGroup(params: RemoveThingFromThingGroupRequest): Request[RemoveThingFromThingGroupResponse] = js.native
    def replaceTopicRule(params: ReplaceTopicRuleRequest): Request[js.Object] = js.native
    def searchIndex(params: SearchIndexRequest): Request[SearchIndexResponse] = js.native
    def setDefaultAuthorizer(params: SetDefaultAuthorizerRequest): Request[SetDefaultAuthorizerResponse] = js.native
    def setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest): Request[js.Object] = js.native
    def setLoggingOptions(params: SetLoggingOptionsRequest): Request[js.Object] = js.native
    def setV2LoggingLevel(params: SetV2LoggingLevelRequest): Request[js.Object] = js.native
    def setV2LoggingOptions(params: SetV2LoggingOptionsRequest): Request[js.Object] = js.native
    def startOnDemandAuditTask(params: StartOnDemandAuditTaskRequest): Request[StartOnDemandAuditTaskResponse] = js.native
    def startThingRegistrationTask(params: StartThingRegistrationTaskRequest): Request[StartThingRegistrationTaskResponse] = js.native
    def stopThingRegistrationTask(params: StopThingRegistrationTaskRequest): Request[StopThingRegistrationTaskResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def testAuthorization(params: TestAuthorizationRequest): Request[TestAuthorizationResponse] = js.native
    def testInvokeAuthorizer(params: TestInvokeAuthorizerRequest): Request[TestInvokeAuthorizerResponse] = js.native
    def transferCertificate(params: TransferCertificateRequest): Request[TransferCertificateResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAccountAuditConfiguration(params: UpdateAccountAuditConfigurationRequest): Request[UpdateAccountAuditConfigurationResponse] = js.native
    def updateAuthorizer(params: UpdateAuthorizerRequest): Request[UpdateAuthorizerResponse] = js.native
    def updateBillingGroup(params: UpdateBillingGroupRequest): Request[UpdateBillingGroupResponse] = js.native
    def updateCACertificate(params: UpdateCACertificateRequest): Request[js.Object] = js.native
    def updateCertificate(params: UpdateCertificateRequest): Request[js.Object] = js.native
    def updateDynamicThingGroup(params: UpdateDynamicThingGroupRequest): Request[UpdateDynamicThingGroupResponse] = js.native
    def updateEventConfigurations(params: UpdateEventConfigurationsRequest): Request[UpdateEventConfigurationsResponse] = js.native
    def updateIndexingConfiguration(params: UpdateIndexingConfigurationRequest): Request[UpdateIndexingConfigurationResponse] = js.native
    def updateJob(params: UpdateJobRequest): Request[js.Object] = js.native
    def updateRoleAlias(params: UpdateRoleAliasRequest): Request[UpdateRoleAliasResponse] = js.native
    def updateScheduledAudit(params: UpdateScheduledAuditRequest): Request[UpdateScheduledAuditResponse] = js.native
    def updateSecurityProfile(params: UpdateSecurityProfileRequest): Request[UpdateSecurityProfileResponse] = js.native
    def updateStream(params: UpdateStreamRequest): Request[UpdateStreamResponse] = js.native
    def updateThing(params: UpdateThingRequest): Request[UpdateThingResponse] = js.native
    def updateThingGroup(params: UpdateThingGroupRequest): Request[UpdateThingGroupResponse] = js.native
    def updateThingGroupsForThing(params: UpdateThingGroupsForThingRequest): Request[UpdateThingGroupsForThingResponse] = js.native
    def validateSecurityProfileBehaviors(params: ValidateSecurityProfileBehaviorsRequest): Request[ValidateSecurityProfileBehaviorsResponse] = js.native
  }

  object AbortActionEnum {
    val CANCEL = "CANCEL"

    val values = IndexedSeq(CANCEL)
  }

  /**
   * <p>Details of abort criteria to abort the job.</p>
   */
  @js.native
  trait AbortConfig extends js.Object {
    var criteriaList: js.UndefOr[AbortCriteriaList]
  }

  object AbortConfig {
    def apply(
      criteriaList: js.UndefOr[AbortCriteriaList] = js.undefined): AbortConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "criteriaList" -> criteriaList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortConfig]
    }
  }

  /**
   * <p>Details of abort criteria to define rules to abort the job.</p>
   */
  @js.native
  trait AbortCriteria extends js.Object {
    var failureType: js.UndefOr[JobExecutionFailureType]
    var action: js.UndefOr[AbortAction]
    var thresholdPercentage: js.UndefOr[AbortThresholdPercentage]
    var minNumberOfExecutedThings: js.UndefOr[MinimumNumberOfExecutedThings]
  }

  object AbortCriteria {
    def apply(
      failureType: js.UndefOr[JobExecutionFailureType] = js.undefined,
      action: js.UndefOr[AbortAction] = js.undefined,
      thresholdPercentage: js.UndefOr[AbortThresholdPercentage] = js.undefined,
      minNumberOfExecutedThings: js.UndefOr[MinimumNumberOfExecutedThings] = js.undefined): AbortCriteria = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failureType" -> failureType.map { x => x.asInstanceOf[js.Any] },
        "action" -> action.map { x => x.asInstanceOf[js.Any] },
        "thresholdPercentage" -> thresholdPercentage.map { x => x.asInstanceOf[js.Any] },
        "minNumberOfExecutedThings" -> minNumberOfExecutedThings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortCriteria]
    }
  }

  /**
   * <p>The input for the AcceptCertificateTransfer operation.</p>
   */
  @js.native
  trait AcceptCertificateTransferRequest extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
    var setAsActive: js.UndefOr[SetAsActive]
  }

  object AcceptCertificateTransferRequest {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      setAsActive: js.UndefOr[SetAsActive] = js.undefined): AcceptCertificateTransferRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "setAsActive" -> setAsActive.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptCertificateTransferRequest]
    }
  }

  /**
   * <p>Describes the actions associated with a rule.</p>
   */
  @js.native
  trait Action extends js.Object {
    var sns: js.UndefOr[SnsAction]
    var iotEvents: js.UndefOr[IotEventsAction]
    var s3: js.UndefOr[S3Action]
    var cloudwatchAlarm: js.UndefOr[CloudwatchAlarmAction]
    var dynamoDBv2: js.UndefOr[DynamoDBv2Action]
    var lambda: js.UndefOr[LambdaAction]
    var elasticsearch: js.UndefOr[ElasticsearchAction]
    var iotAnalytics: js.UndefOr[IotAnalyticsAction]
    var sqs: js.UndefOr[SqsAction]
    var cloudwatchMetric: js.UndefOr[CloudwatchMetricAction]
    var dynamoDB: js.UndefOr[DynamoDBAction]
    var republish: js.UndefOr[RepublishAction]
    var kinesis: js.UndefOr[KinesisAction]
    var firehose: js.UndefOr[FirehoseAction]
    var salesforce: js.UndefOr[SalesforceAction]
    var stepFunctions: js.UndefOr[StepFunctionsAction]
  }

  object Action {
    def apply(
      sns: js.UndefOr[SnsAction] = js.undefined,
      iotEvents: js.UndefOr[IotEventsAction] = js.undefined,
      s3: js.UndefOr[S3Action] = js.undefined,
      cloudwatchAlarm: js.UndefOr[CloudwatchAlarmAction] = js.undefined,
      dynamoDBv2: js.UndefOr[DynamoDBv2Action] = js.undefined,
      lambda: js.UndefOr[LambdaAction] = js.undefined,
      elasticsearch: js.UndefOr[ElasticsearchAction] = js.undefined,
      iotAnalytics: js.UndefOr[IotAnalyticsAction] = js.undefined,
      sqs: js.UndefOr[SqsAction] = js.undefined,
      cloudwatchMetric: js.UndefOr[CloudwatchMetricAction] = js.undefined,
      dynamoDB: js.UndefOr[DynamoDBAction] = js.undefined,
      republish: js.UndefOr[RepublishAction] = js.undefined,
      kinesis: js.UndefOr[KinesisAction] = js.undefined,
      firehose: js.UndefOr[FirehoseAction] = js.undefined,
      salesforce: js.UndefOr[SalesforceAction] = js.undefined,
      stepFunctions: js.UndefOr[StepFunctionsAction] = js.undefined): Action = {
      val _fields = IndexedSeq[(String, js.Any)](
        "sns" -> sns.map { x => x.asInstanceOf[js.Any] },
        "iotEvents" -> iotEvents.map { x => x.asInstanceOf[js.Any] },
        "s3" -> s3.map { x => x.asInstanceOf[js.Any] },
        "cloudwatchAlarm" -> cloudwatchAlarm.map { x => x.asInstanceOf[js.Any] },
        "dynamoDBv2" -> dynamoDBv2.map { x => x.asInstanceOf[js.Any] },
        "lambda" -> lambda.map { x => x.asInstanceOf[js.Any] },
        "elasticsearch" -> elasticsearch.map { x => x.asInstanceOf[js.Any] },
        "iotAnalytics" -> iotAnalytics.map { x => x.asInstanceOf[js.Any] },
        "sqs" -> sqs.map { x => x.asInstanceOf[js.Any] },
        "cloudwatchMetric" -> cloudwatchMetric.map { x => x.asInstanceOf[js.Any] },
        "dynamoDB" -> dynamoDB.map { x => x.asInstanceOf[js.Any] },
        "republish" -> republish.map { x => x.asInstanceOf[js.Any] },
        "kinesis" -> kinesis.map { x => x.asInstanceOf[js.Any] },
        "firehose" -> firehose.map { x => x.asInstanceOf[js.Any] },
        "salesforce" -> salesforce.map { x => x.asInstanceOf[js.Any] },
        "stepFunctions" -> stepFunctions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Action]
    }
  }

  object ActionTypeEnum {
    val PUBLISH = "PUBLISH"
    val SUBSCRIBE = "SUBSCRIBE"
    val RECEIVE = "RECEIVE"
    val CONNECT = "CONNECT"

    val values = IndexedSeq(PUBLISH, SUBSCRIBE, RECEIVE, CONNECT)
  }

  /**
   * <p>Information about an active Device Defender security profile behavior violation.</p>
   */
  @js.native
  trait ActiveViolation extends js.Object {
    var thingName: js.UndefOr[ThingName]
    var lastViolationTime: js.UndefOr[Timestamp]
    var lastViolationValue: js.UndefOr[MetricValue]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var behavior: js.UndefOr[Behavior]
    var violationStartTime: js.UndefOr[Timestamp]
    var violationId: js.UndefOr[ViolationId]
  }

  object ActiveViolation {
    def apply(
      thingName: js.UndefOr[ThingName] = js.undefined,
      lastViolationTime: js.UndefOr[Timestamp] = js.undefined,
      lastViolationValue: js.UndefOr[MetricValue] = js.undefined,
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
      behavior: js.UndefOr[Behavior] = js.undefined,
      violationStartTime: js.UndefOr[Timestamp] = js.undefined,
      violationId: js.UndefOr[ViolationId] = js.undefined): ActiveViolation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "lastViolationTime" -> lastViolationTime.map { x => x.asInstanceOf[js.Any] },
        "lastViolationValue" -> lastViolationValue.map { x => x.asInstanceOf[js.Any] },
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] },
        "behavior" -> behavior.map { x => x.asInstanceOf[js.Any] },
        "violationStartTime" -> violationStartTime.map { x => x.asInstanceOf[js.Any] },
        "violationId" -> violationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActiveViolation]
    }
  }

  @js.native
  trait AddThingToBillingGroupRequest extends js.Object {
    var billingGroupName: js.UndefOr[BillingGroupName]
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var thingName: js.UndefOr[ThingName]
    var thingArn: js.UndefOr[ThingArn]
  }

  object AddThingToBillingGroupRequest {
    def apply(
      billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
      billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      thingArn: js.UndefOr[ThingArn] = js.undefined): AddThingToBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName" -> billingGroupName.map { x => x.asInstanceOf[js.Any] },
        "billingGroupArn" -> billingGroupArn.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "thingArn" -> thingArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddThingToBillingGroupRequest]
    }
  }

  @js.native
  trait AddThingToBillingGroupResponse extends js.Object {

  }

  object AddThingToBillingGroupResponse {
    def apply(): AddThingToBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddThingToBillingGroupResponse]
    }
  }

  @js.native
  trait AddThingToThingGroupRequest extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var thingName: js.UndefOr[ThingName]
    var thingArn: js.UndefOr[ThingArn]
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups]
  }

  object AddThingToThingGroupRequest {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      thingArn: js.UndefOr[ThingArn] = js.undefined,
      thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
      overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined): AddThingToThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "thingArn" -> thingArn.map { x => x.asInstanceOf[js.Any] },
        "thingGroupArn" -> thingGroupArn.map { x => x.asInstanceOf[js.Any] },
        "overrideDynamicGroups" -> overrideDynamicGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddThingToThingGroupRequest]
    }
  }

  @js.native
  trait AddThingToThingGroupResponse extends js.Object {

  }

  object AddThingToThingGroupResponse {
    def apply(): AddThingToThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddThingToThingGroupResponse]
    }
  }

  /**
   * <p>A structure containing the alert target ARN and the role ARN.</p>
   */
  @js.native
  trait AlertTarget extends js.Object {
    var alertTargetArn: js.UndefOr[AlertTargetArn]
    var roleArn: js.UndefOr[RoleArn]
  }

  object AlertTarget {
    def apply(
      alertTargetArn: js.UndefOr[AlertTargetArn] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined): AlertTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "alertTargetArn" -> alertTargetArn.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlertTarget]
    }
  }

  /**
   * <p>The type of alert target: one of "SNS".</p>
   */
  object AlertTargetTypeEnum {
    val SNS = "SNS"

    val values = IndexedSeq(SNS)
  }

  /**
   * <p>Contains information that allowed the authorization.</p>
   */
  @js.native
  trait Allowed extends js.Object {
    var policies: js.UndefOr[Policies]
  }

  object Allowed {
    def apply(
      policies: js.UndefOr[Policies] = js.undefined): Allowed = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policies" -> policies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Allowed]
    }
  }

  @js.native
  trait AssociateTargetsWithJobRequest extends js.Object {
    var targets: js.UndefOr[JobTargets]
    var jobId: js.UndefOr[JobId]
    var comment: js.UndefOr[Comment]
  }

  object AssociateTargetsWithJobRequest {
    def apply(
      targets: js.UndefOr[JobTargets] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      comment: js.UndefOr[Comment] = js.undefined): AssociateTargetsWithJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targets" -> targets.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "comment" -> comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateTargetsWithJobRequest]
    }
  }

  @js.native
  trait AssociateTargetsWithJobResponse extends js.Object {
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
    var description: js.UndefOr[JobDescription]
  }

  object AssociateTargetsWithJobResponse {
    def apply(
      jobArn: js.UndefOr[JobArn] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      description: js.UndefOr[JobDescription] = js.undefined): AssociateTargetsWithJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobArn" -> jobArn.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateTargetsWithJobResponse]
    }
  }

  @js.native
  trait AttachPolicyRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var target: js.UndefOr[PolicyTarget]
  }

  object AttachPolicyRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      target: js.UndefOr[PolicyTarget] = js.undefined): AttachPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "target" -> target.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachPolicyRequest]
    }
  }

  /**
   * <p>The input for the AttachPrincipalPolicy operation.</p>
   */
  @js.native
  trait AttachPrincipalPolicyRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var principal: js.UndefOr[Principal]
  }

  object AttachPrincipalPolicyRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      principal: js.UndefOr[Principal] = js.undefined): AttachPrincipalPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "principal" -> principal.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachPrincipalPolicyRequest]
    }
  }

  @js.native
  trait AttachSecurityProfileRequest extends js.Object {
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var securityProfileTargetArn: js.UndefOr[SecurityProfileTargetArn]
  }

  object AttachSecurityProfileRequest {
    def apply(
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
      securityProfileTargetArn: js.UndefOr[SecurityProfileTargetArn] = js.undefined): AttachSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] },
        "securityProfileTargetArn" -> securityProfileTargetArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachSecurityProfileRequest]
    }
  }

  @js.native
  trait AttachSecurityProfileResponse extends js.Object {

  }

  object AttachSecurityProfileResponse {
    def apply(): AttachSecurityProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachSecurityProfileResponse]
    }
  }

  /**
   * <p>The input for the AttachThingPrincipal operation.</p>
   */
  @js.native
  trait AttachThingPrincipalRequest extends js.Object {
    var thingName: js.UndefOr[ThingName]
    var principal: js.UndefOr[Principal]
  }

  object AttachThingPrincipalRequest {
    def apply(
      thingName: js.UndefOr[ThingName] = js.undefined,
      principal: js.UndefOr[Principal] = js.undefined): AttachThingPrincipalRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "principal" -> principal.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachThingPrincipalRequest]
    }
  }

  /**
   * <p>The output from the AttachThingPrincipal operation.</p>
   */
  @js.native
  trait AttachThingPrincipalResponse extends js.Object {

  }

  object AttachThingPrincipalResponse {
    def apply(): AttachThingPrincipalResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachThingPrincipalResponse]
    }
  }

  /**
   * <p>The attribute payload.</p>
   */
  @js.native
  trait AttributePayload extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var merge: js.UndefOr[Flag]
  }

  object AttributePayload {
    def apply(
      attributes: js.UndefOr[Attributes] = js.undefined,
      merge: js.UndefOr[Flag] = js.undefined): AttributePayload = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "merge" -> merge.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributePayload]
    }
  }

  /**
   * <p>Which audit checks are enabled and disabled for this account.</p>
   */
  @js.native
  trait AuditCheckConfiguration extends js.Object {
    var enabled: js.UndefOr[Enabled]
  }

  object AuditCheckConfiguration {
    def apply(
      enabled: js.UndefOr[Enabled] = js.undefined): AuditCheckConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "enabled" -> enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuditCheckConfiguration]
    }
  }

  /**
   * <p>Information about the audit check.</p>
   */
  @js.native
  trait AuditCheckDetails extends js.Object {
    var checkRunStatus: js.UndefOr[AuditCheckRunStatus]
    var totalResourcesCount: js.UndefOr[TotalResourcesCount]
    var nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount]
    var errorCode: js.UndefOr[ErrorCode]
    var checkCompliant: js.UndefOr[CheckCompliant]
    var message: js.UndefOr[ErrorMessage]
  }

  object AuditCheckDetails {
    def apply(
      checkRunStatus: js.UndefOr[AuditCheckRunStatus] = js.undefined,
      totalResourcesCount: js.UndefOr[TotalResourcesCount] = js.undefined,
      nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount] = js.undefined,
      errorCode: js.UndefOr[ErrorCode] = js.undefined,
      checkCompliant: js.UndefOr[CheckCompliant] = js.undefined,
      message: js.UndefOr[ErrorMessage] = js.undefined): AuditCheckDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "checkRunStatus" -> checkRunStatus.map { x => x.asInstanceOf[js.Any] },
        "totalResourcesCount" -> totalResourcesCount.map { x => x.asInstanceOf[js.Any] },
        "nonCompliantResourcesCount" -> nonCompliantResourcesCount.map { x => x.asInstanceOf[js.Any] },
        "errorCode" -> errorCode.map { x => x.asInstanceOf[js.Any] },
        "checkCompliant" -> checkCompliant.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuditCheckDetails]
    }
  }

  object AuditCheckRunStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val WAITING_FOR_DATA_COLLECTION = "WAITING_FOR_DATA_COLLECTION"
    val CANCELED = "CANCELED"
    val COMPLETED_COMPLIANT = "COMPLETED_COMPLIANT"
    val COMPLETED_NON_COMPLIANT = "COMPLETED_NON_COMPLIANT"
    val FAILED = "FAILED"

    val values = IndexedSeq(IN_PROGRESS, WAITING_FOR_DATA_COLLECTION, CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED)
  }

  /**
   * <p>The findings (results) of the audit.</p>
   */
  @js.native
  trait AuditFinding extends js.Object {
    var findingTime: js.UndefOr[Timestamp]
    var relatedResources: js.UndefOr[RelatedResources]
    var nonCompliantResource: js.UndefOr[NonCompliantResource]
    var reasonForNonCompliance: js.UndefOr[ReasonForNonCompliance]
    var taskStartTime: js.UndefOr[Timestamp]
    var severity: js.UndefOr[AuditFindingSeverity]
    var reasonForNonComplianceCode: js.UndefOr[ReasonForNonComplianceCode]
    var taskId: js.UndefOr[AuditTaskId]
    var checkName: js.UndefOr[AuditCheckName]
  }

  object AuditFinding {
    def apply(
      findingTime: js.UndefOr[Timestamp] = js.undefined,
      relatedResources: js.UndefOr[RelatedResources] = js.undefined,
      nonCompliantResource: js.UndefOr[NonCompliantResource] = js.undefined,
      reasonForNonCompliance: js.UndefOr[ReasonForNonCompliance] = js.undefined,
      taskStartTime: js.UndefOr[Timestamp] = js.undefined,
      severity: js.UndefOr[AuditFindingSeverity] = js.undefined,
      reasonForNonComplianceCode: js.UndefOr[ReasonForNonComplianceCode] = js.undefined,
      taskId: js.UndefOr[AuditTaskId] = js.undefined,
      checkName: js.UndefOr[AuditCheckName] = js.undefined): AuditFinding = {
      val _fields = IndexedSeq[(String, js.Any)](
        "findingTime" -> findingTime.map { x => x.asInstanceOf[js.Any] },
        "relatedResources" -> relatedResources.map { x => x.asInstanceOf[js.Any] },
        "nonCompliantResource" -> nonCompliantResource.map { x => x.asInstanceOf[js.Any] },
        "reasonForNonCompliance" -> reasonForNonCompliance.map { x => x.asInstanceOf[js.Any] },
        "taskStartTime" -> taskStartTime.map { x => x.asInstanceOf[js.Any] },
        "severity" -> severity.map { x => x.asInstanceOf[js.Any] },
        "reasonForNonComplianceCode" -> reasonForNonComplianceCode.map { x => x.asInstanceOf[js.Any] },
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] },
        "checkName" -> checkName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuditFinding]
    }
  }

  object AuditFindingSeverityEnum {
    val CRITICAL = "CRITICAL"
    val HIGH = "HIGH"
    val MEDIUM = "MEDIUM"
    val LOW = "LOW"

    val values = IndexedSeq(CRITICAL, HIGH, MEDIUM, LOW)
  }

  object AuditFrequencyEnum {
    val DAILY = "DAILY"
    val WEEKLY = "WEEKLY"
    val BIWEEKLY = "BIWEEKLY"
    val MONTHLY = "MONTHLY"

    val values = IndexedSeq(DAILY, WEEKLY, BIWEEKLY, MONTHLY)
  }

  /**
   * <p>Information about the targets to which audit notifications are sent.</p>
   */
  @js.native
  trait AuditNotificationTarget extends js.Object {
    var targetArn: js.UndefOr[TargetArn]
    var roleArn: js.UndefOr[RoleArn]
    var enabled: js.UndefOr[Enabled]
  }

  object AuditNotificationTarget {
    def apply(
      targetArn: js.UndefOr[TargetArn] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      enabled: js.UndefOr[Enabled] = js.undefined): AuditNotificationTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetArn" -> targetArn.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "enabled" -> enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuditNotificationTarget]
    }
  }

  object AuditNotificationTypeEnum {
    val SNS = "SNS"

    val values = IndexedSeq(SNS)
  }

  /**
   * <p>The audits that were performed.</p>
   */
  @js.native
  trait AuditTaskMetadata extends js.Object {
    var taskId: js.UndefOr[AuditTaskId]
    var taskStatus: js.UndefOr[AuditTaskStatus]
    var taskType: js.UndefOr[AuditTaskType]
  }

  object AuditTaskMetadata {
    def apply(
      taskId: js.UndefOr[AuditTaskId] = js.undefined,
      taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined,
      taskType: js.UndefOr[AuditTaskType] = js.undefined): AuditTaskMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] },
        "taskStatus" -> taskStatus.map { x => x.asInstanceOf[js.Any] },
        "taskType" -> taskType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuditTaskMetadata]
    }
  }

  object AuditTaskStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETED = "COMPLETED"
    val FAILED = "FAILED"
    val CANCELED = "CANCELED"

    val values = IndexedSeq(IN_PROGRESS, COMPLETED, FAILED, CANCELED)
  }

  object AuditTaskTypeEnum {
    val ON_DEMAND_AUDIT_TASK = "ON_DEMAND_AUDIT_TASK"
    val SCHEDULED_AUDIT_TASK = "SCHEDULED_AUDIT_TASK"

    val values = IndexedSeq(ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK)
  }

  object AuthDecisionEnum {
    val ALLOWED = "ALLOWED"
    val EXPLICIT_DENY = "EXPLICIT_DENY"
    val IMPLICIT_DENY = "IMPLICIT_DENY"

    val values = IndexedSeq(ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY)
  }

  /**
   * <p>A collection of authorization information.</p>
   */
  @js.native
  trait AuthInfo extends js.Object {
    var actionType: js.UndefOr[ActionType]
    var resources: js.UndefOr[Resources]
  }

  object AuthInfo {
    def apply(
      actionType: js.UndefOr[ActionType] = js.undefined,
      resources: js.UndefOr[Resources] = js.undefined): AuthInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "actionType" -> actionType.map { x => x.asInstanceOf[js.Any] },
        "resources" -> resources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthInfo]
    }
  }

  /**
   * <p>The authorizer result.</p>
   */
  @js.native
  trait AuthResult extends js.Object {
    var allowed: js.UndefOr[Allowed]
    var missingContextValues: js.UndefOr[MissingContextValues]
    var authDecision: js.UndefOr[AuthDecision]
    var denied: js.UndefOr[Denied]
    var authInfo: js.UndefOr[AuthInfo]
  }

  object AuthResult {
    def apply(
      allowed: js.UndefOr[Allowed] = js.undefined,
      missingContextValues: js.UndefOr[MissingContextValues] = js.undefined,
      authDecision: js.UndefOr[AuthDecision] = js.undefined,
      denied: js.UndefOr[Denied] = js.undefined,
      authInfo: js.UndefOr[AuthInfo] = js.undefined): AuthResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "allowed" -> allowed.map { x => x.asInstanceOf[js.Any] },
        "missingContextValues" -> missingContextValues.map { x => x.asInstanceOf[js.Any] },
        "authDecision" -> authDecision.map { x => x.asInstanceOf[js.Any] },
        "denied" -> denied.map { x => x.asInstanceOf[js.Any] },
        "authInfo" -> authInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthResult]
    }
  }

  /**
   * <p>The authorizer description.</p>
   */
  @js.native
  trait AuthorizerDescription extends js.Object {
    var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap]
    var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn]
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var lastModifiedDate: js.UndefOr[DateType]
    var authorizerName: js.UndefOr[AuthorizerName]
    var status: js.UndefOr[AuthorizerStatus]
    var creationDate: js.UndefOr[DateType]
    var tokenKeyName: js.UndefOr[TokenKeyName]
  }

  object AuthorizerDescription {
    def apply(
      tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined,
      authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.undefined,
      authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined,
      lastModifiedDate: js.UndefOr[DateType] = js.undefined,
      authorizerName: js.UndefOr[AuthorizerName] = js.undefined,
      status: js.UndefOr[AuthorizerStatus] = js.undefined,
      creationDate: js.UndefOr[DateType] = js.undefined,
      tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined): AuthorizerDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tokenSigningPublicKeys" -> tokenSigningPublicKeys.map { x => x.asInstanceOf[js.Any] },
        "authorizerFunctionArn" -> authorizerFunctionArn.map { x => x.asInstanceOf[js.Any] },
        "authorizerArn" -> authorizerArn.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "authorizerName" -> authorizerName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "tokenKeyName" -> tokenKeyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizerDescription]
    }
  }

  object AuthorizerStatusEnum {
    val ACTIVE = "ACTIVE"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, INACTIVE)
  }

  /**
   * <p>The authorizer summary.</p>
   */
  @js.native
  trait AuthorizerSummary extends js.Object {
    var authorizerName: js.UndefOr[AuthorizerName]
    var authorizerArn: js.UndefOr[AuthorizerArn]
  }

  object AuthorizerSummary {
    def apply(
      authorizerName: js.UndefOr[AuthorizerName] = js.undefined,
      authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined): AuthorizerSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.map { x => x.asInstanceOf[js.Any] },
        "authorizerArn" -> authorizerArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizerSummary]
    }
  }

  object AutoRegistrationStatusEnum {
    val ENABLE = "ENABLE"
    val DISABLE = "DISABLE"

    val values = IndexedSeq(ENABLE, DISABLE)
  }

  /**
   * <p>Configuration for the rollout of OTA updates.</p>
   */
  @js.native
  trait AwsJobExecutionsRolloutConfig extends js.Object {
    var maximumPerMinute: js.UndefOr[MaximumPerMinute]
  }

  object AwsJobExecutionsRolloutConfig {
    def apply(
      maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.undefined): AwsJobExecutionsRolloutConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maximumPerMinute" -> maximumPerMinute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsJobExecutionsRolloutConfig]
    }
  }

  /**
   * <p>A Device Defender security profile behavior.</p>
   */
  @js.native
  trait Behavior extends js.Object {
    var name: js.UndefOr[BehaviorName]
    var metric: js.UndefOr[BehaviorMetric]
    var criteria: js.UndefOr[BehaviorCriteria]
  }

  object Behavior {
    def apply(
      name: js.UndefOr[BehaviorName] = js.undefined,
      metric: js.UndefOr[BehaviorMetric] = js.undefined,
      criteria: js.UndefOr[BehaviorCriteria] = js.undefined): Behavior = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "metric" -> metric.map { x => x.asInstanceOf[js.Any] },
        "criteria" -> criteria.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Behavior]
    }
  }

  /**
   * <p>The criteria by which the behavior is determined to be normal.</p>
   */
  @js.native
  trait BehaviorCriteria extends js.Object {
    var comparisonOperator: js.UndefOr[ComparisonOperator]
    var value: js.UndefOr[MetricValue]
    var durationSeconds: js.UndefOr[DurationSeconds]
  }

  object BehaviorCriteria {
    def apply(
      comparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
      value: js.UndefOr[MetricValue] = js.undefined,
      durationSeconds: js.UndefOr[DurationSeconds] = js.undefined): BehaviorCriteria = {
      val _fields = IndexedSeq[(String, js.Any)](
        "comparisonOperator" -> comparisonOperator.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] },
        "durationSeconds" -> durationSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BehaviorCriteria]
    }
  }

  /**
   * <p>Additional information about the billing group.</p>
   */
  @js.native
  trait BillingGroupMetadata extends js.Object {
    var creationDate: js.UndefOr[CreationDate]
  }

  object BillingGroupMetadata {
    def apply(
      creationDate: js.UndefOr[CreationDate] = js.undefined): BillingGroupMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BillingGroupMetadata]
    }
  }

  /**
   * <p>The properties of a billing group.</p>
   */
  @js.native
  trait BillingGroupProperties extends js.Object {
    var billingGroupDescription: js.UndefOr[BillingGroupDescription]
  }

  object BillingGroupProperties {
    def apply(
      billingGroupDescription: js.UndefOr[BillingGroupDescription] = js.undefined): BillingGroupProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupDescription" -> billingGroupDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BillingGroupProperties]
    }
  }

  /**
   * <p>A CA certificate.</p>
   */
  @js.native
  trait CACertificate extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var status: js.UndefOr[CACertificateStatus]
    var creationDate: js.UndefOr[DateType]
  }

  object CACertificate {
    def apply(
      certificateArn: js.UndefOr[CertificateArn] = js.undefined,
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      status: js.UndefOr[CACertificateStatus] = js.undefined,
      creationDate: js.UndefOr[DateType] = js.undefined): CACertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] },
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CACertificate]
    }
  }

  /**
   * <p>Describes a CA certificate.</p>
   */
  @js.native
  trait CACertificateDescription extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
    var lastModifiedDate: js.UndefOr[DateType]
    var ownedBy: js.UndefOr[AwsAccountId]
    var generationId: js.UndefOr[GenerationId]
    var customerVersion: js.UndefOr[CustomerVersion]
    var autoRegistrationStatus: js.UndefOr[AutoRegistrationStatus]
    var certificateArn: js.UndefOr[CertificateArn]
    var status: js.UndefOr[CACertificateStatus]
    var creationDate: js.UndefOr[DateType]
    var validity: js.UndefOr[CertificateValidity]
    var certificatePem: js.UndefOr[CertificatePem]
  }

  object CACertificateDescription {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      lastModifiedDate: js.UndefOr[DateType] = js.undefined,
      ownedBy: js.UndefOr[AwsAccountId] = js.undefined,
      generationId: js.UndefOr[GenerationId] = js.undefined,
      customerVersion: js.UndefOr[CustomerVersion] = js.undefined,
      autoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.undefined,
      certificateArn: js.UndefOr[CertificateArn] = js.undefined,
      status: js.UndefOr[CACertificateStatus] = js.undefined,
      creationDate: js.UndefOr[DateType] = js.undefined,
      validity: js.UndefOr[CertificateValidity] = js.undefined,
      certificatePem: js.UndefOr[CertificatePem] = js.undefined): CACertificateDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "ownedBy" -> ownedBy.map { x => x.asInstanceOf[js.Any] },
        "generationId" -> generationId.map { x => x.asInstanceOf[js.Any] },
        "customerVersion" -> customerVersion.map { x => x.asInstanceOf[js.Any] },
        "autoRegistrationStatus" -> autoRegistrationStatus.map { x => x.asInstanceOf[js.Any] },
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "validity" -> validity.map { x => x.asInstanceOf[js.Any] },
        "certificatePem" -> certificatePem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CACertificateDescription]
    }
  }

  object CACertificateStatusEnum {
    val ACTIVE = "ACTIVE"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, INACTIVE)
  }

  @js.native
  trait CancelAuditTaskRequest extends js.Object {
    var taskId: js.UndefOr[AuditTaskId]
  }

  object CancelAuditTaskRequest {
    def apply(
      taskId: js.UndefOr[AuditTaskId] = js.undefined): CancelAuditTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelAuditTaskRequest]
    }
  }

  @js.native
  trait CancelAuditTaskResponse extends js.Object {

  }

  object CancelAuditTaskResponse {
    def apply(): CancelAuditTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelAuditTaskResponse]
    }
  }

  /**
   * <p>The input for the CancelCertificateTransfer operation.</p>
   */
  @js.native
  trait CancelCertificateTransferRequest extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
  }

  object CancelCertificateTransferRequest {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined): CancelCertificateTransferRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelCertificateTransferRequest]
    }
  }

  @js.native
  trait CancelJobExecutionRequest extends js.Object {
    var expectedVersion: js.UndefOr[ExpectedVersion]
    var force: js.UndefOr[ForceFlag]
    var thingName: js.UndefOr[ThingName]
    var statusDetails: js.UndefOr[DetailsMap]
    var jobId: js.UndefOr[JobId]
  }

  object CancelJobExecutionRequest {
    def apply(
      expectedVersion: js.UndefOr[ExpectedVersion] = js.undefined,
      force: js.UndefOr[ForceFlag] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      statusDetails: js.UndefOr[DetailsMap] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined): CancelJobExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "expectedVersion" -> expectedVersion.map { x => x.asInstanceOf[js.Any] },
        "force" -> force.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "statusDetails" -> statusDetails.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobExecutionRequest]
    }
  }

  @js.native
  trait CancelJobRequest extends js.Object {
    var jobId: js.UndefOr[JobId]
    var reasonCode: js.UndefOr[ReasonCode]
    var comment: js.UndefOr[Comment]
    var force: js.UndefOr[ForceFlag]
  }

  object CancelJobRequest {
    def apply(
      jobId: js.UndefOr[JobId] = js.undefined,
      reasonCode: js.UndefOr[ReasonCode] = js.undefined,
      comment: js.UndefOr[Comment] = js.undefined,
      force: js.UndefOr[ForceFlag] = js.undefined): CancelJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "reasonCode" -> reasonCode.map { x => x.asInstanceOf[js.Any] },
        "comment" -> comment.map { x => x.asInstanceOf[js.Any] },
        "force" -> force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResponse extends js.Object {
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
    var description: js.UndefOr[JobDescription]
  }

  object CancelJobResponse {
    def apply(
      jobArn: js.UndefOr[JobArn] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      description: js.UndefOr[JobDescription] = js.undefined): CancelJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobArn" -> jobArn.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobResponse]
    }
  }

  object CannedAccessControlListEnum {
    val `private` = "private"
    val `public-read` = "public-read"
    val `public-read-write` = "public-read-write"
    val `aws-exec-read` = "aws-exec-read"
    val `authenticated-read` = "authenticated-read"
    val `bucket-owner-read` = "bucket-owner-read"
    val `bucket-owner-full-control` = "bucket-owner-full-control"
    val `log-delivery-write` = "log-delivery-write"

    val values = IndexedSeq(`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`, `log-delivery-write`)
  }

  /**
   * <p>Information about a certificate.</p>
   */
  @js.native
  trait Certificate extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var status: js.UndefOr[CertificateStatus]
    var creationDate: js.UndefOr[DateType]
  }

  object Certificate {
    def apply(
      certificateArn: js.UndefOr[CertificateArn] = js.undefined,
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      status: js.UndefOr[CertificateStatus] = js.undefined,
      creationDate: js.UndefOr[DateType] = js.undefined): Certificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] },
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Certificate]
    }
  }

  /**
   * <p>Describes a certificate.</p>
   */
  @js.native
  trait CertificateDescription extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
    var lastModifiedDate: js.UndefOr[DateType]
    var ownedBy: js.UndefOr[AwsAccountId]
    var generationId: js.UndefOr[GenerationId]
    var customerVersion: js.UndefOr[CustomerVersion]
    var certificateArn: js.UndefOr[CertificateArn]
    var caCertificateId: js.UndefOr[CertificateId]
    var status: js.UndefOr[CertificateStatus]
    var transferData: js.UndefOr[TransferData]
    var creationDate: js.UndefOr[DateType]
    var validity: js.UndefOr[CertificateValidity]
    var previousOwnedBy: js.UndefOr[AwsAccountId]
    var certificatePem: js.UndefOr[CertificatePem]
  }

  object CertificateDescription {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      lastModifiedDate: js.UndefOr[DateType] = js.undefined,
      ownedBy: js.UndefOr[AwsAccountId] = js.undefined,
      generationId: js.UndefOr[GenerationId] = js.undefined,
      customerVersion: js.UndefOr[CustomerVersion] = js.undefined,
      certificateArn: js.UndefOr[CertificateArn] = js.undefined,
      caCertificateId: js.UndefOr[CertificateId] = js.undefined,
      status: js.UndefOr[CertificateStatus] = js.undefined,
      transferData: js.UndefOr[TransferData] = js.undefined,
      creationDate: js.UndefOr[DateType] = js.undefined,
      validity: js.UndefOr[CertificateValidity] = js.undefined,
      previousOwnedBy: js.UndefOr[AwsAccountId] = js.undefined,
      certificatePem: js.UndefOr[CertificatePem] = js.undefined): CertificateDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "ownedBy" -> ownedBy.map { x => x.asInstanceOf[js.Any] },
        "generationId" -> generationId.map { x => x.asInstanceOf[js.Any] },
        "customerVersion" -> customerVersion.map { x => x.asInstanceOf[js.Any] },
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] },
        "caCertificateId" -> caCertificateId.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "transferData" -> transferData.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "validity" -> validity.map { x => x.asInstanceOf[js.Any] },
        "previousOwnedBy" -> previousOwnedBy.map { x => x.asInstanceOf[js.Any] },
        "certificatePem" -> certificatePem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CertificateDescription]
    }
  }

  object CertificateStatusEnum {
    val ACTIVE = "ACTIVE"
    val INACTIVE = "INACTIVE"
    val REVOKED = "REVOKED"
    val PENDING_TRANSFER = "PENDING_TRANSFER"
    val REGISTER_INACTIVE = "REGISTER_INACTIVE"
    val PENDING_ACTIVATION = "PENDING_ACTIVATION"

    val values = IndexedSeq(ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER, REGISTER_INACTIVE, PENDING_ACTIVATION)
  }

  /**
   * <p>When the certificate is valid.</p>
   */
  @js.native
  trait CertificateValidity extends js.Object {
    var notBefore: js.UndefOr[DateType]
    var notAfter: js.UndefOr[DateType]
  }

  object CertificateValidity {
    def apply(
      notBefore: js.UndefOr[DateType] = js.undefined,
      notAfter: js.UndefOr[DateType] = js.undefined): CertificateValidity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "notBefore" -> notBefore.map { x => x.asInstanceOf[js.Any] },
        "notAfter" -> notAfter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CertificateValidity]
    }
  }

  @js.native
  trait ClearDefaultAuthorizerRequest extends js.Object {

  }

  object ClearDefaultAuthorizerRequest {
    def apply(): ClearDefaultAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClearDefaultAuthorizerRequest]
    }
  }

  @js.native
  trait ClearDefaultAuthorizerResponse extends js.Object {

  }

  object ClearDefaultAuthorizerResponse {
    def apply(): ClearDefaultAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClearDefaultAuthorizerResponse]
    }
  }

  /**
   * <p>Describes an action that updates a CloudWatch alarm.</p>
   */
  @js.native
  trait CloudwatchAlarmAction extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var alarmName: js.UndefOr[AlarmName]
    var stateReason: js.UndefOr[StateReason]
    var stateValue: js.UndefOr[StateValue]
  }

  object CloudwatchAlarmAction {
    def apply(
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      alarmName: js.UndefOr[AlarmName] = js.undefined,
      stateReason: js.UndefOr[StateReason] = js.undefined,
      stateValue: js.UndefOr[StateValue] = js.undefined): CloudwatchAlarmAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "alarmName" -> alarmName.map { x => x.asInstanceOf[js.Any] },
        "stateReason" -> stateReason.map { x => x.asInstanceOf[js.Any] },
        "stateValue" -> stateValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudwatchAlarmAction]
    }
  }

  /**
   * <p>Describes an action that captures a CloudWatch metric.</p>
   */
  @js.native
  trait CloudwatchMetricAction extends js.Object {
    var metricUnit: js.UndefOr[String]
    var metricName: js.UndefOr[String]
    var roleArn: js.UndefOr[AwsArn]
    var metricNamespace: js.UndefOr[String]
    var metricValue: js.UndefOr[String]
    var metricTimestamp: js.UndefOr[String]
  }

  object CloudwatchMetricAction {
    def apply(
      metricUnit: js.UndefOr[String] = js.undefined,
      metricName: js.UndefOr[String] = js.undefined,
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      metricNamespace: js.UndefOr[String] = js.undefined,
      metricValue: js.UndefOr[String] = js.undefined,
      metricTimestamp: js.UndefOr[String] = js.undefined): CloudwatchMetricAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metricUnit" -> metricUnit.map { x => x.asInstanceOf[js.Any] },
        "metricName" -> metricName.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "metricNamespace" -> metricNamespace.map { x => x.asInstanceOf[js.Any] },
        "metricValue" -> metricValue.map { x => x.asInstanceOf[js.Any] },
        "metricTimestamp" -> metricTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudwatchMetricAction]
    }
  }

  /**
   * <p>Describes the method to use when code signing a file.</p>
   */
  @js.native
  trait CodeSigning extends js.Object {
    var awsSignerJobId: js.UndefOr[SigningJobId]
    var startSigningJobParameter: js.UndefOr[StartSigningJobParameter]
    var customCodeSigning: js.UndefOr[CustomCodeSigning]
  }

  object CodeSigning {
    def apply(
      awsSignerJobId: js.UndefOr[SigningJobId] = js.undefined,
      startSigningJobParameter: js.UndefOr[StartSigningJobParameter] = js.undefined,
      customCodeSigning: js.UndefOr[CustomCodeSigning] = js.undefined): CodeSigning = {
      val _fields = IndexedSeq[(String, js.Any)](
        "awsSignerJobId" -> awsSignerJobId.map { x => x.asInstanceOf[js.Any] },
        "startSigningJobParameter" -> startSigningJobParameter.map { x => x.asInstanceOf[js.Any] },
        "customCodeSigning" -> customCodeSigning.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeSigning]
    }
  }

  /**
   * <p>Describes the certificate chain being used when code signing a file.</p>
   */
  @js.native
  trait CodeSigningCertificateChain extends js.Object {
    var certificateName: js.UndefOr[CertificateName]
    var inlineDocument: js.UndefOr[InlineDocument]
  }

  object CodeSigningCertificateChain {
    def apply(
      certificateName: js.UndefOr[CertificateName] = js.undefined,
      inlineDocument: js.UndefOr[InlineDocument] = js.undefined): CodeSigningCertificateChain = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateName" -> certificateName.map { x => x.asInstanceOf[js.Any] },
        "inlineDocument" -> inlineDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeSigningCertificateChain]
    }
  }

  /**
   * <p>Describes the signature for a file.</p>
   */
  @js.native
  trait CodeSigningSignature extends js.Object {
    var inlineDocument: js.UndefOr[Signature]
  }

  object CodeSigningSignature {
    def apply(
      inlineDocument: js.UndefOr[Signature] = js.undefined): CodeSigningSignature = {
      val _fields = IndexedSeq[(String, js.Any)](
        "inlineDocument" -> inlineDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeSigningSignature]
    }
  }

  object ComparisonOperatorEnum {
    val `less-than` = "less-than"
    val `less-than-equals` = "less-than-equals"
    val `greater-than` = "greater-than"
    val `greater-than-equals` = "greater-than-equals"
    val `in-cidr-set` = "in-cidr-set"
    val `not-in-cidr-set` = "not-in-cidr-set"
    val `in-port-set` = "in-port-set"
    val `not-in-port-set` = "not-in-port-set"

    val values = IndexedSeq(`less-than`, `less-than-equals`, `greater-than`, `greater-than-equals`, `in-cidr-set`, `not-in-cidr-set`, `in-port-set`, `not-in-port-set`)
  }

  /**
   * <p>Configuration.</p>
   */
  @js.native
  trait Configuration extends js.Object {
    var Enabled: js.UndefOr[Enabled]
  }

  object Configuration {
    def apply(
      Enabled: js.UndefOr[Enabled] = js.undefined): Configuration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Configuration]
    }
  }

  @js.native
  trait CreateAuthorizerRequest extends js.Object {
    var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap]
    var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn]
    var authorizerName: js.UndefOr[AuthorizerName]
    var status: js.UndefOr[AuthorizerStatus]
    var tokenKeyName: js.UndefOr[TokenKeyName]
  }

  object CreateAuthorizerRequest {
    def apply(
      tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined,
      authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.undefined,
      authorizerName: js.UndefOr[AuthorizerName] = js.undefined,
      status: js.UndefOr[AuthorizerStatus] = js.undefined,
      tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined): CreateAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tokenSigningPublicKeys" -> tokenSigningPublicKeys.map { x => x.asInstanceOf[js.Any] },
        "authorizerFunctionArn" -> authorizerFunctionArn.map { x => x.asInstanceOf[js.Any] },
        "authorizerName" -> authorizerName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "tokenKeyName" -> tokenKeyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAuthorizerRequest]
    }
  }

  @js.native
  trait CreateAuthorizerResponse extends js.Object {
    var authorizerName: js.UndefOr[AuthorizerName]
    var authorizerArn: js.UndefOr[AuthorizerArn]
  }

  object CreateAuthorizerResponse {
    def apply(
      authorizerName: js.UndefOr[AuthorizerName] = js.undefined,
      authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined): CreateAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.map { x => x.asInstanceOf[js.Any] },
        "authorizerArn" -> authorizerArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAuthorizerResponse]
    }
  }

  @js.native
  trait CreateBillingGroupRequest extends js.Object {
    var billingGroupName: js.UndefOr[BillingGroupName]
    var billingGroupProperties: js.UndefOr[BillingGroupProperties]
    var tags: js.UndefOr[TagList]
  }

  object CreateBillingGroupRequest {
    def apply(
      billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
      billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): CreateBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName" -> billingGroupName.map { x => x.asInstanceOf[js.Any] },
        "billingGroupProperties" -> billingGroupProperties.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBillingGroupRequest]
    }
  }

  @js.native
  trait CreateBillingGroupResponse extends js.Object {
    var billingGroupName: js.UndefOr[BillingGroupName]
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var billingGroupId: js.UndefOr[BillingGroupId]
  }

  object CreateBillingGroupResponse {
    def apply(
      billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
      billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
      billingGroupId: js.UndefOr[BillingGroupId] = js.undefined): CreateBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName" -> billingGroupName.map { x => x.asInstanceOf[js.Any] },
        "billingGroupArn" -> billingGroupArn.map { x => x.asInstanceOf[js.Any] },
        "billingGroupId" -> billingGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBillingGroupResponse]
    }
  }

  /**
   * <p>The input for the CreateCertificateFromCsr operation.</p>
   */
  @js.native
  trait CreateCertificateFromCsrRequest extends js.Object {
    var certificateSigningRequest: js.UndefOr[CertificateSigningRequest]
    var setAsActive: js.UndefOr[SetAsActive]
  }

  object CreateCertificateFromCsrRequest {
    def apply(
      certificateSigningRequest: js.UndefOr[CertificateSigningRequest] = js.undefined,
      setAsActive: js.UndefOr[SetAsActive] = js.undefined): CreateCertificateFromCsrRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateSigningRequest" -> certificateSigningRequest.map { x => x.asInstanceOf[js.Any] },
        "setAsActive" -> setAsActive.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCertificateFromCsrRequest]
    }
  }

  /**
   * <p>The output from the CreateCertificateFromCsr operation.</p>
   */
  @js.native
  trait CreateCertificateFromCsrResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var certificatePem: js.UndefOr[CertificatePem]
  }

  object CreateCertificateFromCsrResponse {
    def apply(
      certificateArn: js.UndefOr[CertificateArn] = js.undefined,
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      certificatePem: js.UndefOr[CertificatePem] = js.undefined): CreateCertificateFromCsrResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] },
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "certificatePem" -> certificatePem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCertificateFromCsrResponse]
    }
  }

  @js.native
  trait CreateDynamicThingGroupRequest extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var tags: js.UndefOr[TagList]
    var queryString: js.UndefOr[QueryString]
    var indexName: js.UndefOr[IndexName]
    var thingGroupProperties: js.UndefOr[ThingGroupProperties]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  object CreateDynamicThingGroupRequest {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined,
      queryString: js.UndefOr[QueryString] = js.undefined,
      indexName: js.UndefOr[IndexName] = js.undefined,
      thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined,
      queryVersion: js.UndefOr[QueryVersion] = js.undefined): CreateDynamicThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "queryString" -> queryString.map { x => x.asInstanceOf[js.Any] },
        "indexName" -> indexName.map { x => x.asInstanceOf[js.Any] },
        "thingGroupProperties" -> thingGroupProperties.map { x => x.asInstanceOf[js.Any] },
        "queryVersion" -> queryVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDynamicThingGroupRequest]
    }
  }

  @js.native
  trait CreateDynamicThingGroupResponse extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var queryString: js.UndefOr[QueryString]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var indexName: js.UndefOr[IndexName]
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  object CreateDynamicThingGroupResponse {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      queryString: js.UndefOr[QueryString] = js.undefined,
      thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
      indexName: js.UndefOr[IndexName] = js.undefined,
      thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
      queryVersion: js.UndefOr[QueryVersion] = js.undefined): CreateDynamicThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "queryString" -> queryString.map { x => x.asInstanceOf[js.Any] },
        "thingGroupId" -> thingGroupId.map { x => x.asInstanceOf[js.Any] },
        "indexName" -> indexName.map { x => x.asInstanceOf[js.Any] },
        "thingGroupArn" -> thingGroupArn.map { x => x.asInstanceOf[js.Any] },
        "queryVersion" -> queryVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDynamicThingGroupResponse]
    }
  }

  @js.native
  trait CreateJobRequest extends js.Object {
    var targets: js.UndefOr[JobTargets]
    var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig]
    var description: js.UndefOr[JobDescription]
    var document: js.UndefOr[JobDocument]
    var tags: js.UndefOr[TagList]
    var presignedUrlConfig: js.UndefOr[PresignedUrlConfig]
    var jobId: js.UndefOr[JobId]
    var abortConfig: js.UndefOr[AbortConfig]
    var targetSelection: js.UndefOr[TargetSelection]
    var timeoutConfig: js.UndefOr[TimeoutConfig]
    var documentSource: js.UndefOr[JobDocumentSource]
  }

  object CreateJobRequest {
    def apply(
      targets: js.UndefOr[JobTargets] = js.undefined,
      jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined,
      description: js.UndefOr[JobDescription] = js.undefined,
      document: js.UndefOr[JobDocument] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined,
      presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      abortConfig: js.UndefOr[AbortConfig] = js.undefined,
      targetSelection: js.UndefOr[TargetSelection] = js.undefined,
      timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined,
      documentSource: js.UndefOr[JobDocumentSource] = js.undefined): CreateJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targets" -> targets.map { x => x.asInstanceOf[js.Any] },
        "jobExecutionsRolloutConfig" -> jobExecutionsRolloutConfig.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "document" -> document.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "presignedUrlConfig" -> presignedUrlConfig.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "abortConfig" -> abortConfig.map { x => x.asInstanceOf[js.Any] },
        "targetSelection" -> targetSelection.map { x => x.asInstanceOf[js.Any] },
        "timeoutConfig" -> timeoutConfig.map { x => x.asInstanceOf[js.Any] },
        "documentSource" -> documentSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResponse extends js.Object {
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
    var description: js.UndefOr[JobDescription]
  }

  object CreateJobResponse {
    def apply(
      jobArn: js.UndefOr[JobArn] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      description: js.UndefOr[JobDescription] = js.undefined): CreateJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobArn" -> jobArn.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobResponse]
    }
  }

  /**
   * <p>The input for the CreateKeysAndCertificate operation.</p>
   */
  @js.native
  trait CreateKeysAndCertificateRequest extends js.Object {
    var setAsActive: js.UndefOr[SetAsActive]
  }

  object CreateKeysAndCertificateRequest {
    def apply(
      setAsActive: js.UndefOr[SetAsActive] = js.undefined): CreateKeysAndCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "setAsActive" -> setAsActive.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeysAndCertificateRequest]
    }
  }

  /**
   * <p>The output of the CreateKeysAndCertificate operation.</p>
   */
  @js.native
  trait CreateKeysAndCertificateResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var certificatePem: js.UndefOr[CertificatePem]
    var keyPair: js.UndefOr[KeyPair]
  }

  object CreateKeysAndCertificateResponse {
    def apply(
      certificateArn: js.UndefOr[CertificateArn] = js.undefined,
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      certificatePem: js.UndefOr[CertificatePem] = js.undefined,
      keyPair: js.UndefOr[KeyPair] = js.undefined): CreateKeysAndCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] },
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "certificatePem" -> certificatePem.map { x => x.asInstanceOf[js.Any] },
        "keyPair" -> keyPair.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeysAndCertificateResponse]
    }
  }

  @js.native
  trait CreateOTAUpdateRequest extends js.Object {
    var targets: js.UndefOr[Targets]
    var description: js.UndefOr[OTAUpdateDescription]
    var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig]
    var files: js.UndefOr[OTAUpdateFiles]
    var roleArn: js.UndefOr[RoleArn]
    var targetSelection: js.UndefOr[TargetSelection]
    var otaUpdateId: js.UndefOr[OTAUpdateId]
    var additionalParameters: js.UndefOr[AdditionalParameterMap]
  }

  object CreateOTAUpdateRequest {
    def apply(
      targets: js.UndefOr[Targets] = js.undefined,
      description: js.UndefOr[OTAUpdateDescription] = js.undefined,
      awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.undefined,
      files: js.UndefOr[OTAUpdateFiles] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      targetSelection: js.UndefOr[TargetSelection] = js.undefined,
      otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined,
      additionalParameters: js.UndefOr[AdditionalParameterMap] = js.undefined): CreateOTAUpdateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targets" -> targets.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "awsJobExecutionsRolloutConfig" -> awsJobExecutionsRolloutConfig.map { x => x.asInstanceOf[js.Any] },
        "files" -> files.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "targetSelection" -> targetSelection.map { x => x.asInstanceOf[js.Any] },
        "otaUpdateId" -> otaUpdateId.map { x => x.asInstanceOf[js.Any] },
        "additionalParameters" -> additionalParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOTAUpdateRequest]
    }
  }

  @js.native
  trait CreateOTAUpdateResponse extends js.Object {
    var otaUpdateStatus: js.UndefOr[OTAUpdateStatus]
    var otaUpdateArn: js.UndefOr[OTAUpdateArn]
    var awsIotJobArn: js.UndefOr[AwsIotJobArn]
    var awsIotJobId: js.UndefOr[AwsIotJobId]
    var otaUpdateId: js.UndefOr[OTAUpdateId]
  }

  object CreateOTAUpdateResponse {
    def apply(
      otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined,
      otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined,
      awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.undefined,
      awsIotJobId: js.UndefOr[AwsIotJobId] = js.undefined,
      otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined): CreateOTAUpdateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "otaUpdateStatus" -> otaUpdateStatus.map { x => x.asInstanceOf[js.Any] },
        "otaUpdateArn" -> otaUpdateArn.map { x => x.asInstanceOf[js.Any] },
        "awsIotJobArn" -> awsIotJobArn.map { x => x.asInstanceOf[js.Any] },
        "awsIotJobId" -> awsIotJobId.map { x => x.asInstanceOf[js.Any] },
        "otaUpdateId" -> otaUpdateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOTAUpdateResponse]
    }
  }

  /**
   * <p>The input for the CreatePolicy operation.</p>
   */
  @js.native
  trait CreatePolicyRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyDocument: js.UndefOr[PolicyDocument]
  }

  object CreatePolicyRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      policyDocument: js.UndefOr[PolicyDocument] = js.undefined): CreatePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "policyDocument" -> policyDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyRequest]
    }
  }

  /**
   * <p>The output from the CreatePolicy operation.</p>
   */
  @js.native
  trait CreatePolicyResponse extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyArn: js.UndefOr[PolicyArn]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyVersionId: js.UndefOr[PolicyVersionId]
  }

  object CreatePolicyResponse {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      policyArn: js.UndefOr[PolicyArn] = js.undefined,
      policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
      policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined): CreatePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "policyArn" -> policyArn.map { x => x.asInstanceOf[js.Any] },
        "policyDocument" -> policyDocument.map { x => x.asInstanceOf[js.Any] },
        "policyVersionId" -> policyVersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyResponse]
    }
  }

  /**
   * <p>The input for the CreatePolicyVersion operation.</p>
   */
  @js.native
  trait CreatePolicyVersionRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyDocument: js.UndefOr[PolicyDocument]
    var setAsDefault: js.UndefOr[SetAsDefault]
  }

  object CreatePolicyVersionRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
      setAsDefault: js.UndefOr[SetAsDefault] = js.undefined): CreatePolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "policyDocument" -> policyDocument.map { x => x.asInstanceOf[js.Any] },
        "setAsDefault" -> setAsDefault.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyVersionRequest]
    }
  }

  /**
   * <p>The output of the CreatePolicyVersion operation.</p>
   */
  @js.native
  trait CreatePolicyVersionResponse extends js.Object {
    var policyArn: js.UndefOr[PolicyArn]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyVersionId: js.UndefOr[PolicyVersionId]
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
  }

  object CreatePolicyVersionResponse {
    def apply(
      policyArn: js.UndefOr[PolicyArn] = js.undefined,
      policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
      policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined,
      isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined): CreatePolicyVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyArn" -> policyArn.map { x => x.asInstanceOf[js.Any] },
        "policyDocument" -> policyDocument.map { x => x.asInstanceOf[js.Any] },
        "policyVersionId" -> policyVersionId.map { x => x.asInstanceOf[js.Any] },
        "isDefaultVersion" -> isDefaultVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyVersionResponse]
    }
  }

  @js.native
  trait CreateRoleAliasRequest extends js.Object {
    var roleAlias: js.UndefOr[RoleAlias]
    var roleArn: js.UndefOr[RoleArn]
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds]
  }

  object CreateRoleAliasRequest {
    def apply(
      roleAlias: js.UndefOr[RoleAlias] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined): CreateRoleAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAlias" -> roleAlias.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "credentialDurationSeconds" -> credentialDurationSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRoleAliasRequest]
    }
  }

  @js.native
  trait CreateRoleAliasResponse extends js.Object {
    var roleAlias: js.UndefOr[RoleAlias]
    var roleAliasArn: js.UndefOr[RoleAliasArn]
  }

  object CreateRoleAliasResponse {
    def apply(
      roleAlias: js.UndefOr[RoleAlias] = js.undefined,
      roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined): CreateRoleAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAlias" -> roleAlias.map { x => x.asInstanceOf[js.Any] },
        "roleAliasArn" -> roleAliasArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRoleAliasResponse]
    }
  }

  @js.native
  trait CreateScheduledAuditRequest extends js.Object {
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
    var dayOfWeek: js.UndefOr[DayOfWeek]
    var targetCheckNames: js.UndefOr[TargetAuditCheckNames]
    var dayOfMonth: js.UndefOr[DayOfMonth]
    var frequency: js.UndefOr[AuditFrequency]
  }

  object CreateScheduledAuditRequest {
    def apply(
      scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined,
      dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
      targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined,
      dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
      frequency: js.UndefOr[AuditFrequency] = js.undefined): CreateScheduledAuditRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditName" -> scheduledAuditName.map { x => x.asInstanceOf[js.Any] },
        "dayOfWeek" -> dayOfWeek.map { x => x.asInstanceOf[js.Any] },
        "targetCheckNames" -> targetCheckNames.map { x => x.asInstanceOf[js.Any] },
        "dayOfMonth" -> dayOfMonth.map { x => x.asInstanceOf[js.Any] },
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateScheduledAuditRequest]
    }
  }

  @js.native
  trait CreateScheduledAuditResponse extends js.Object {
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
  }

  object CreateScheduledAuditResponse {
    def apply(
      scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined): CreateScheduledAuditResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditArn" -> scheduledAuditArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateScheduledAuditResponse]
    }
  }

  @js.native
  trait CreateSecurityProfileRequest extends js.Object {
    var tags: js.UndefOr[TagList]
    var behaviors: js.UndefOr[Behaviors]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription]
    var alertTargets: js.UndefOr[AlertTargets]
  }

  object CreateSecurityProfileRequest {
    def apply(
      tags: js.UndefOr[TagList] = js.undefined,
      behaviors: js.UndefOr[Behaviors] = js.undefined,
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
      securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined,
      alertTargets: js.UndefOr[AlertTargets] = js.undefined): CreateSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "behaviors" -> behaviors.map { x => x.asInstanceOf[js.Any] },
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] },
        "securityProfileDescription" -> securityProfileDescription.map { x => x.asInstanceOf[js.Any] },
        "alertTargets" -> alertTargets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityProfileRequest]
    }
  }

  @js.native
  trait CreateSecurityProfileResponse extends js.Object {
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var securityProfileArn: js.UndefOr[SecurityProfileArn]
  }

  object CreateSecurityProfileResponse {
    def apply(
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
      securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined): CreateSecurityProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] },
        "securityProfileArn" -> securityProfileArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityProfileResponse]
    }
  }

  @js.native
  trait CreateStreamRequest extends js.Object {
    var streamId: js.UndefOr[StreamId]
    var description: js.UndefOr[StreamDescription]
    var files: js.UndefOr[StreamFiles]
    var roleArn: js.UndefOr[RoleArn]
  }

  object CreateStreamRequest {
    def apply(
      streamId: js.UndefOr[StreamId] = js.undefined,
      description: js.UndefOr[StreamDescription] = js.undefined,
      files: js.UndefOr[StreamFiles] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined): CreateStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamId" -> streamId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "files" -> files.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamRequest]
    }
  }

  @js.native
  trait CreateStreamResponse extends js.Object {
    var streamId: js.UndefOr[StreamId]
    var streamArn: js.UndefOr[StreamArn]
    var description: js.UndefOr[StreamDescription]
    var streamVersion: js.UndefOr[StreamVersion]
  }

  object CreateStreamResponse {
    def apply(
      streamId: js.UndefOr[StreamId] = js.undefined,
      streamArn: js.UndefOr[StreamArn] = js.undefined,
      description: js.UndefOr[StreamDescription] = js.undefined,
      streamVersion: js.UndefOr[StreamVersion] = js.undefined): CreateStreamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamId" -> streamId.map { x => x.asInstanceOf[js.Any] },
        "streamArn" -> streamArn.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "streamVersion" -> streamVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamResponse]
    }
  }

  @js.native
  trait CreateThingGroupRequest extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var parentGroupName: js.UndefOr[ThingGroupName]
    var thingGroupProperties: js.UndefOr[ThingGroupProperties]
    var tags: js.UndefOr[TagList]
  }

  object CreateThingGroupRequest {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      parentGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): CreateThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "parentGroupName" -> parentGroupName.map { x => x.asInstanceOf[js.Any] },
        "thingGroupProperties" -> thingGroupProperties.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThingGroupRequest]
    }
  }

  @js.native
  trait CreateThingGroupResponse extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingGroupId: js.UndefOr[ThingGroupId]
  }

  object CreateThingGroupResponse {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
      thingGroupId: js.UndefOr[ThingGroupId] = js.undefined): CreateThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "thingGroupArn" -> thingGroupArn.map { x => x.asInstanceOf[js.Any] },
        "thingGroupId" -> thingGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThingGroupResponse]
    }
  }

  /**
   * <p>The input for the CreateThing operation.</p>
   */
  @js.native
  trait CreateThingRequest extends js.Object {
    var thingName: js.UndefOr[ThingName]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var attributePayload: js.UndefOr[AttributePayload]
    var billingGroupName: js.UndefOr[BillingGroupName]
  }

  object CreateThingRequest {
    def apply(
      thingName: js.UndefOr[ThingName] = js.undefined,
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
      attributePayload: js.UndefOr[AttributePayload] = js.undefined,
      billingGroupName: js.UndefOr[BillingGroupName] = js.undefined): CreateThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] },
        "attributePayload" -> attributePayload.map { x => x.asInstanceOf[js.Any] },
        "billingGroupName" -> billingGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThingRequest]
    }
  }

  /**
   * <p>The output of the CreateThing operation.</p>
   */
  @js.native
  trait CreateThingResponse extends js.Object {
    var thingName: js.UndefOr[ThingName]
    var thingArn: js.UndefOr[ThingArn]
    var thingId: js.UndefOr[ThingId]
  }

  object CreateThingResponse {
    def apply(
      thingName: js.UndefOr[ThingName] = js.undefined,
      thingArn: js.UndefOr[ThingArn] = js.undefined,
      thingId: js.UndefOr[ThingId] = js.undefined): CreateThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "thingArn" -> thingArn.map { x => x.asInstanceOf[js.Any] },
        "thingId" -> thingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThingResponse]
    }
  }

  /**
   * <p>The input for the CreateThingType operation.</p>
   */
  @js.native
  trait CreateThingTypeRequest extends js.Object {
    var thingTypeName: js.UndefOr[ThingTypeName]
    var thingTypeProperties: js.UndefOr[ThingTypeProperties]
    var tags: js.UndefOr[TagList]
  }

  object CreateThingTypeRequest {
    def apply(
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
      thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): CreateThingTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] },
        "thingTypeProperties" -> thingTypeProperties.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThingTypeRequest]
    }
  }

  /**
   * <p>The output of the CreateThingType operation.</p>
   */
  @js.native
  trait CreateThingTypeResponse extends js.Object {
    var thingTypeName: js.UndefOr[ThingTypeName]
    var thingTypeArn: js.UndefOr[ThingTypeArn]
    var thingTypeId: js.UndefOr[ThingTypeId]
  }

  object CreateThingTypeResponse {
    def apply(
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
      thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined,
      thingTypeId: js.UndefOr[ThingTypeId] = js.undefined): CreateThingTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] },
        "thingTypeArn" -> thingTypeArn.map { x => x.asInstanceOf[js.Any] },
        "thingTypeId" -> thingTypeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThingTypeResponse]
    }
  }

  /**
   * <p>The input for the CreateTopicRule operation.</p>
   */
  @js.native
  trait CreateTopicRuleRequest extends js.Object {
    var ruleName: js.UndefOr[RuleName]
    var topicRulePayload: js.UndefOr[TopicRulePayload]
  }

  object CreateTopicRuleRequest {
    def apply(
      ruleName: js.UndefOr[RuleName] = js.undefined,
      topicRulePayload: js.UndefOr[TopicRulePayload] = js.undefined): CreateTopicRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName" -> ruleName.map { x => x.asInstanceOf[js.Any] },
        "topicRulePayload" -> topicRulePayload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTopicRuleRequest]
    }
  }

  /**
   * <p>Describes a custom method used to code sign a file.</p>
   */
  @js.native
  trait CustomCodeSigning extends js.Object {
    var signature: js.UndefOr[CodeSigningSignature]
    var certificateChain: js.UndefOr[CodeSigningCertificateChain]
    var hashAlgorithm: js.UndefOr[HashAlgorithm]
    var signatureAlgorithm: js.UndefOr[SignatureAlgorithm]
  }

  object CustomCodeSigning {
    def apply(
      signature: js.UndefOr[CodeSigningSignature] = js.undefined,
      certificateChain: js.UndefOr[CodeSigningCertificateChain] = js.undefined,
      hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined,
      signatureAlgorithm: js.UndefOr[SignatureAlgorithm] = js.undefined): CustomCodeSigning = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signature" -> signature.map { x => x.asInstanceOf[js.Any] },
        "certificateChain" -> certificateChain.map { x => x.asInstanceOf[js.Any] },
        "hashAlgorithm" -> hashAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "signatureAlgorithm" -> signatureAlgorithm.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomCodeSigning]
    }
  }

  object DayOfWeekEnum {
    val SUN = "SUN"
    val MON = "MON"
    val TUE = "TUE"
    val WED = "WED"
    val THU = "THU"
    val FRI = "FRI"
    val SAT = "SAT"

    val values = IndexedSeq(SUN, MON, TUE, WED, THU, FRI, SAT)
  }

  @js.native
  trait DeleteAccountAuditConfigurationRequest extends js.Object {
    var deleteScheduledAudits: js.UndefOr[DeleteScheduledAudits]
  }

  object DeleteAccountAuditConfigurationRequest {
    def apply(
      deleteScheduledAudits: js.UndefOr[DeleteScheduledAudits] = js.undefined): DeleteAccountAuditConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deleteScheduledAudits" -> deleteScheduledAudits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountAuditConfigurationRequest]
    }
  }

  @js.native
  trait DeleteAccountAuditConfigurationResponse extends js.Object {

  }

  object DeleteAccountAuditConfigurationResponse {
    def apply(): DeleteAccountAuditConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountAuditConfigurationResponse]
    }
  }

  @js.native
  trait DeleteAuthorizerRequest extends js.Object {
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  object DeleteAuthorizerRequest {
    def apply(
      authorizerName: js.UndefOr[AuthorizerName] = js.undefined): DeleteAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAuthorizerRequest]
    }
  }

  @js.native
  trait DeleteAuthorizerResponse extends js.Object {

  }

  object DeleteAuthorizerResponse {
    def apply(): DeleteAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAuthorizerResponse]
    }
  }

  @js.native
  trait DeleteBillingGroupRequest extends js.Object {
    var billingGroupName: js.UndefOr[BillingGroupName]
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteBillingGroupRequest {
    def apply(
      billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
      expectedVersion: js.UndefOr[OptionalVersion] = js.undefined): DeleteBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName" -> billingGroupName.map { x => x.asInstanceOf[js.Any] },
        "expectedVersion" -> expectedVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBillingGroupRequest]
    }
  }

  @js.native
  trait DeleteBillingGroupResponse extends js.Object {

  }

  object DeleteBillingGroupResponse {
    def apply(): DeleteBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBillingGroupResponse]
    }
  }

  /**
   * <p>Input for the DeleteCACertificate operation.</p>
   */
  @js.native
  trait DeleteCACertificateRequest extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
  }

  object DeleteCACertificateRequest {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined): DeleteCACertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCACertificateRequest]
    }
  }

  /**
   * <p>The output for the DeleteCACertificate operation.</p>
   */
  @js.native
  trait DeleteCACertificateResponse extends js.Object {

  }

  object DeleteCACertificateResponse {
    def apply(): DeleteCACertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCACertificateResponse]
    }
  }

  /**
   * <p>The input for the DeleteCertificate operation.</p>
   */
  @js.native
  trait DeleteCertificateRequest extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
    var forceDelete: js.UndefOr[ForceDelete]
  }

  object DeleteCertificateRequest {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      forceDelete: js.UndefOr[ForceDelete] = js.undefined): DeleteCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "forceDelete" -> forceDelete.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCertificateRequest]
    }
  }

  @js.native
  trait DeleteDynamicThingGroupRequest extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteDynamicThingGroupRequest {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      expectedVersion: js.UndefOr[OptionalVersion] = js.undefined): DeleteDynamicThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "expectedVersion" -> expectedVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDynamicThingGroupRequest]
    }
  }

  @js.native
  trait DeleteDynamicThingGroupResponse extends js.Object {

  }

  object DeleteDynamicThingGroupResponse {
    def apply(): DeleteDynamicThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDynamicThingGroupResponse]
    }
  }

  @js.native
  trait DeleteJobExecutionRequest extends js.Object {
    var jobId: js.UndefOr[JobId]
    var thingName: js.UndefOr[ThingName]
    var executionNumber: js.UndefOr[ExecutionNumber]
    var force: js.UndefOr[ForceFlag]
  }

  object DeleteJobExecutionRequest {
    def apply(
      jobId: js.UndefOr[JobId] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
      force: js.UndefOr[ForceFlag] = js.undefined): DeleteJobExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "executionNumber" -> executionNumber.map { x => x.asInstanceOf[js.Any] },
        "force" -> force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobExecutionRequest]
    }
  }

  @js.native
  trait DeleteJobRequest extends js.Object {
    var jobId: js.UndefOr[JobId]
    var force: js.UndefOr[ForceFlag]
  }

  object DeleteJobRequest {
    def apply(
      jobId: js.UndefOr[JobId] = js.undefined,
      force: js.UndefOr[ForceFlag] = js.undefined): DeleteJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "force" -> force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobRequest]
    }
  }

  @js.native
  trait DeleteOTAUpdateRequest extends js.Object {
    var otaUpdateId: js.UndefOr[OTAUpdateId]
    var deleteStream: js.UndefOr[DeleteStream]
    var forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob]
  }

  object DeleteOTAUpdateRequest {
    def apply(
      otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined,
      deleteStream: js.UndefOr[DeleteStream] = js.undefined,
      forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob] = js.undefined): DeleteOTAUpdateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "otaUpdateId" -> otaUpdateId.map { x => x.asInstanceOf[js.Any] },
        "deleteStream" -> deleteStream.map { x => x.asInstanceOf[js.Any] },
        "forceDeleteAWSJob" -> forceDeleteAWSJob.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOTAUpdateRequest]
    }
  }

  @js.native
  trait DeleteOTAUpdateResponse extends js.Object {

  }

  object DeleteOTAUpdateResponse {
    def apply(): DeleteOTAUpdateResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOTAUpdateResponse]
    }
  }

  /**
   * <p>The input for the DeletePolicy operation.</p>
   */
  @js.native
  trait DeletePolicyRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
  }

  object DeletePolicyRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined): DeletePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePolicyRequest]
    }
  }

  /**
   * <p>The input for the DeletePolicyVersion operation.</p>
   */
  @js.native
  trait DeletePolicyVersionRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyVersionId: js.UndefOr[PolicyVersionId]
  }

  object DeletePolicyVersionRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined): DeletePolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "policyVersionId" -> policyVersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePolicyVersionRequest]
    }
  }

  /**
   * <p>The input for the DeleteRegistrationCode operation.</p>
   */
  @js.native
  trait DeleteRegistrationCodeRequest extends js.Object {

  }

  object DeleteRegistrationCodeRequest {
    def apply(): DeleteRegistrationCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRegistrationCodeRequest]
    }
  }

  /**
   * <p>The output for the DeleteRegistrationCode operation.</p>
   */
  @js.native
  trait DeleteRegistrationCodeResponse extends js.Object {

  }

  object DeleteRegistrationCodeResponse {
    def apply(): DeleteRegistrationCodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRegistrationCodeResponse]
    }
  }

  @js.native
  trait DeleteRoleAliasRequest extends js.Object {
    var roleAlias: js.UndefOr[RoleAlias]
  }

  object DeleteRoleAliasRequest {
    def apply(
      roleAlias: js.UndefOr[RoleAlias] = js.undefined): DeleteRoleAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAlias" -> roleAlias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRoleAliasRequest]
    }
  }

  @js.native
  trait DeleteRoleAliasResponse extends js.Object {

  }

  object DeleteRoleAliasResponse {
    def apply(): DeleteRoleAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRoleAliasResponse]
    }
  }

  @js.native
  trait DeleteScheduledAuditRequest extends js.Object {
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
  }

  object DeleteScheduledAuditRequest {
    def apply(
      scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined): DeleteScheduledAuditRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditName" -> scheduledAuditName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteScheduledAuditRequest]
    }
  }

  @js.native
  trait DeleteScheduledAuditResponse extends js.Object {

  }

  object DeleteScheduledAuditResponse {
    def apply(): DeleteScheduledAuditResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteScheduledAuditResponse]
    }
  }

  @js.native
  trait DeleteSecurityProfileRequest extends js.Object {
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteSecurityProfileRequest {
    def apply(
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
      expectedVersion: js.UndefOr[OptionalVersion] = js.undefined): DeleteSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] },
        "expectedVersion" -> expectedVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecurityProfileRequest]
    }
  }

  @js.native
  trait DeleteSecurityProfileResponse extends js.Object {

  }

  object DeleteSecurityProfileResponse {
    def apply(): DeleteSecurityProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecurityProfileResponse]
    }
  }

  @js.native
  trait DeleteStreamRequest extends js.Object {
    var streamId: js.UndefOr[StreamId]
  }

  object DeleteStreamRequest {
    def apply(
      streamId: js.UndefOr[StreamId] = js.undefined): DeleteStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamId" -> streamId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamRequest]
    }
  }

  @js.native
  trait DeleteStreamResponse extends js.Object {

  }

  object DeleteStreamResponse {
    def apply(): DeleteStreamResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamResponse]
    }
  }

  @js.native
  trait DeleteThingGroupRequest extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteThingGroupRequest {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      expectedVersion: js.UndefOr[OptionalVersion] = js.undefined): DeleteThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "expectedVersion" -> expectedVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThingGroupRequest]
    }
  }

  @js.native
  trait DeleteThingGroupResponse extends js.Object {

  }

  object DeleteThingGroupResponse {
    def apply(): DeleteThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThingGroupResponse]
    }
  }

  /**
   * <p>The input for the DeleteThing operation.</p>
   */
  @js.native
  trait DeleteThingRequest extends js.Object {
    var thingName: js.UndefOr[ThingName]
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteThingRequest {
    def apply(
      thingName: js.UndefOr[ThingName] = js.undefined,
      expectedVersion: js.UndefOr[OptionalVersion] = js.undefined): DeleteThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "expectedVersion" -> expectedVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThingRequest]
    }
  }

  /**
   * <p>The output of the DeleteThing operation.</p>
   */
  @js.native
  trait DeleteThingResponse extends js.Object {

  }

  object DeleteThingResponse {
    def apply(): DeleteThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThingResponse]
    }
  }

  /**
   * <p>The input for the DeleteThingType operation.</p>
   */
  @js.native
  trait DeleteThingTypeRequest extends js.Object {
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  object DeleteThingTypeRequest {
    def apply(
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined): DeleteThingTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThingTypeRequest]
    }
  }

  /**
   * <p>The output for the DeleteThingType operation.</p>
   */
  @js.native
  trait DeleteThingTypeResponse extends js.Object {

  }

  object DeleteThingTypeResponse {
    def apply(): DeleteThingTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThingTypeResponse]
    }
  }

  /**
   * <p>The input for the DeleteTopicRule operation.</p>
   */
  @js.native
  trait DeleteTopicRuleRequest extends js.Object {
    var ruleName: js.UndefOr[RuleName]
  }

  object DeleteTopicRuleRequest {
    def apply(
      ruleName: js.UndefOr[RuleName] = js.undefined): DeleteTopicRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName" -> ruleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTopicRuleRequest]
    }
  }

  @js.native
  trait DeleteV2LoggingLevelRequest extends js.Object {
    var targetType: js.UndefOr[LogTargetType]
    var targetName: js.UndefOr[LogTargetName]
  }

  object DeleteV2LoggingLevelRequest {
    def apply(
      targetType: js.UndefOr[LogTargetType] = js.undefined,
      targetName: js.UndefOr[LogTargetName] = js.undefined): DeleteV2LoggingLevelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetType" -> targetType.map { x => x.asInstanceOf[js.Any] },
        "targetName" -> targetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteV2LoggingLevelRequest]
    }
  }

  /**
   * <p>Contains information that denied the authorization.</p>
   */
  @js.native
  trait Denied extends js.Object {
    var implicitDeny: js.UndefOr[ImplicitDeny]
    var explicitDeny: js.UndefOr[ExplicitDeny]
  }

  object Denied {
    def apply(
      implicitDeny: js.UndefOr[ImplicitDeny] = js.undefined,
      explicitDeny: js.UndefOr[ExplicitDeny] = js.undefined): Denied = {
      val _fields = IndexedSeq[(String, js.Any)](
        "implicitDeny" -> implicitDeny.map { x => x.asInstanceOf[js.Any] },
        "explicitDeny" -> explicitDeny.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Denied]
    }
  }

  /**
   * <p>The input for the DeprecateThingType operation.</p>
   */
  @js.native
  trait DeprecateThingTypeRequest extends js.Object {
    var thingTypeName: js.UndefOr[ThingTypeName]
    var undoDeprecate: js.UndefOr[UndoDeprecate]
  }

  object DeprecateThingTypeRequest {
    def apply(
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
      undoDeprecate: js.UndefOr[UndoDeprecate] = js.undefined): DeprecateThingTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] },
        "undoDeprecate" -> undoDeprecate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprecateThingTypeRequest]
    }
  }

  /**
   * <p>The output for the DeprecateThingType operation.</p>
   */
  @js.native
  trait DeprecateThingTypeResponse extends js.Object {

  }

  object DeprecateThingTypeResponse {
    def apply(): DeprecateThingTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprecateThingTypeResponse]
    }
  }

  @js.native
  trait DescribeAccountAuditConfigurationRequest extends js.Object {

  }

  object DescribeAccountAuditConfigurationRequest {
    def apply(): DescribeAccountAuditConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAuditConfigurationRequest]
    }
  }

  @js.native
  trait DescribeAccountAuditConfigurationResponse extends js.Object {
    var roleArn: js.UndefOr[RoleArn]
    var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations]
    var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations]
  }

  object DescribeAccountAuditConfigurationResponse {
    def apply(
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.undefined,
      auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.undefined): DescribeAccountAuditConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "auditNotificationTargetConfigurations" -> auditNotificationTargetConfigurations.map { x => x.asInstanceOf[js.Any] },
        "auditCheckConfigurations" -> auditCheckConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAuditConfigurationResponse]
    }
  }

  @js.native
  trait DescribeAuditTaskRequest extends js.Object {
    var taskId: js.UndefOr[AuditTaskId]
  }

  object DescribeAuditTaskRequest {
    def apply(
      taskId: js.UndefOr[AuditTaskId] = js.undefined): DescribeAuditTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAuditTaskRequest]
    }
  }

  @js.native
  trait DescribeAuditTaskResponse extends js.Object {
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
    var auditDetails: js.UndefOr[AuditDetails]
    var taskStatistics: js.UndefOr[TaskStatistics]
    var taskStatus: js.UndefOr[AuditTaskStatus]
    var taskStartTime: js.UndefOr[Timestamp]
    var taskType: js.UndefOr[AuditTaskType]
  }

  object DescribeAuditTaskResponse {
    def apply(
      scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined,
      auditDetails: js.UndefOr[AuditDetails] = js.undefined,
      taskStatistics: js.UndefOr[TaskStatistics] = js.undefined,
      taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined,
      taskStartTime: js.UndefOr[Timestamp] = js.undefined,
      taskType: js.UndefOr[AuditTaskType] = js.undefined): DescribeAuditTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditName" -> scheduledAuditName.map { x => x.asInstanceOf[js.Any] },
        "auditDetails" -> auditDetails.map { x => x.asInstanceOf[js.Any] },
        "taskStatistics" -> taskStatistics.map { x => x.asInstanceOf[js.Any] },
        "taskStatus" -> taskStatus.map { x => x.asInstanceOf[js.Any] },
        "taskStartTime" -> taskStartTime.map { x => x.asInstanceOf[js.Any] },
        "taskType" -> taskType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAuditTaskResponse]
    }
  }

  @js.native
  trait DescribeAuthorizerRequest extends js.Object {
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  object DescribeAuthorizerRequest {
    def apply(
      authorizerName: js.UndefOr[AuthorizerName] = js.undefined): DescribeAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAuthorizerRequest]
    }
  }

  @js.native
  trait DescribeAuthorizerResponse extends js.Object {
    var authorizerDescription: js.UndefOr[AuthorizerDescription]
  }

  object DescribeAuthorizerResponse {
    def apply(
      authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined): DescribeAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerDescription" -> authorizerDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAuthorizerResponse]
    }
  }

  @js.native
  trait DescribeBillingGroupRequest extends js.Object {
    var billingGroupName: js.UndefOr[BillingGroupName]
  }

  object DescribeBillingGroupRequest {
    def apply(
      billingGroupName: js.UndefOr[BillingGroupName] = js.undefined): DescribeBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName" -> billingGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBillingGroupRequest]
    }
  }

  @js.native
  trait DescribeBillingGroupResponse extends js.Object {
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var billingGroupId: js.UndefOr[BillingGroupId]
    var version: js.UndefOr[Version]
    var billingGroupProperties: js.UndefOr[BillingGroupProperties]
    var billingGroupMetadata: js.UndefOr[BillingGroupMetadata]
    var billingGroupName: js.UndefOr[BillingGroupName]
  }

  object DescribeBillingGroupResponse {
    def apply(
      billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
      billingGroupId: js.UndefOr[BillingGroupId] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined,
      billingGroupMetadata: js.UndefOr[BillingGroupMetadata] = js.undefined,
      billingGroupName: js.UndefOr[BillingGroupName] = js.undefined): DescribeBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupArn" -> billingGroupArn.map { x => x.asInstanceOf[js.Any] },
        "billingGroupId" -> billingGroupId.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "billingGroupProperties" -> billingGroupProperties.map { x => x.asInstanceOf[js.Any] },
        "billingGroupMetadata" -> billingGroupMetadata.map { x => x.asInstanceOf[js.Any] },
        "billingGroupName" -> billingGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBillingGroupResponse]
    }
  }

  /**
   * <p>The input for the DescribeCACertificate operation.</p>
   */
  @js.native
  trait DescribeCACertificateRequest extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
  }

  object DescribeCACertificateRequest {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined): DescribeCACertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCACertificateRequest]
    }
  }

  /**
   * <p>The output from the DescribeCACertificate operation.</p>
   */
  @js.native
  trait DescribeCACertificateResponse extends js.Object {
    var certificateDescription: js.UndefOr[CACertificateDescription]
    var registrationConfig: js.UndefOr[RegistrationConfig]
  }

  object DescribeCACertificateResponse {
    def apply(
      certificateDescription: js.UndefOr[CACertificateDescription] = js.undefined,
      registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined): DescribeCACertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateDescription" -> certificateDescription.map { x => x.asInstanceOf[js.Any] },
        "registrationConfig" -> registrationConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCACertificateResponse]
    }
  }

  /**
   * <p>The input for the DescribeCertificate operation.</p>
   */
  @js.native
  trait DescribeCertificateRequest extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
  }

  object DescribeCertificateRequest {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined): DescribeCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificateRequest]
    }
  }

  /**
   * <p>The output of the DescribeCertificate operation.</p>
   */
  @js.native
  trait DescribeCertificateResponse extends js.Object {
    var certificateDescription: js.UndefOr[CertificateDescription]
  }

  object DescribeCertificateResponse {
    def apply(
      certificateDescription: js.UndefOr[CertificateDescription] = js.undefined): DescribeCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateDescription" -> certificateDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificateResponse]
    }
  }

  @js.native
  trait DescribeDefaultAuthorizerRequest extends js.Object {

  }

  object DescribeDefaultAuthorizerRequest {
    def apply(): DescribeDefaultAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDefaultAuthorizerRequest]
    }
  }

  @js.native
  trait DescribeDefaultAuthorizerResponse extends js.Object {
    var authorizerDescription: js.UndefOr[AuthorizerDescription]
  }

  object DescribeDefaultAuthorizerResponse {
    def apply(
      authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined): DescribeDefaultAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerDescription" -> authorizerDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDefaultAuthorizerResponse]
    }
  }

  /**
   * <p>The input for the DescribeEndpoint operation.</p>
   */
  @js.native
  trait DescribeEndpointRequest extends js.Object {
    var endpointType: js.UndefOr[EndpointType]
  }

  object DescribeEndpointRequest {
    def apply(
      endpointType: js.UndefOr[EndpointType] = js.undefined): DescribeEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endpointType" -> endpointType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointRequest]
    }
  }

  /**
   * <p>The output from the DescribeEndpoint operation.</p>
   */
  @js.native
  trait DescribeEndpointResponse extends js.Object {
    var endpointAddress: js.UndefOr[EndpointAddress]
  }

  object DescribeEndpointResponse {
    def apply(
      endpointAddress: js.UndefOr[EndpointAddress] = js.undefined): DescribeEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endpointAddress" -> endpointAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointResponse]
    }
  }

  @js.native
  trait DescribeEventConfigurationsRequest extends js.Object {

  }

  object DescribeEventConfigurationsRequest {
    def apply(): DescribeEventConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeEventConfigurationsResponse extends js.Object {
    var eventConfigurations: js.UndefOr[EventConfigurations]
    var creationDate: js.UndefOr[CreationDate]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
  }

  object DescribeEventConfigurationsResponse {
    def apply(
      eventConfigurations: js.UndefOr[EventConfigurations] = js.undefined,
      creationDate: js.UndefOr[CreationDate] = js.undefined,
      lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined): DescribeEventConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventConfigurations" -> eventConfigurations.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventConfigurationsResponse]
    }
  }

  @js.native
  trait DescribeIndexRequest extends js.Object {
    var indexName: js.UndefOr[IndexName]
  }

  object DescribeIndexRequest {
    def apply(
      indexName: js.UndefOr[IndexName] = js.undefined): DescribeIndexRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "indexName" -> indexName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIndexRequest]
    }
  }

  @js.native
  trait DescribeIndexResponse extends js.Object {
    var indexName: js.UndefOr[IndexName]
    var indexStatus: js.UndefOr[IndexStatus]
    var schema: js.UndefOr[IndexSchema]
  }

  object DescribeIndexResponse {
    def apply(
      indexName: js.UndefOr[IndexName] = js.undefined,
      indexStatus: js.UndefOr[IndexStatus] = js.undefined,
      schema: js.UndefOr[IndexSchema] = js.undefined): DescribeIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "indexName" -> indexName.map { x => x.asInstanceOf[js.Any] },
        "indexStatus" -> indexStatus.map { x => x.asInstanceOf[js.Any] },
        "schema" -> schema.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIndexResponse]
    }
  }

  @js.native
  trait DescribeJobExecutionRequest extends js.Object {
    var jobId: js.UndefOr[JobId]
    var thingName: js.UndefOr[ThingName]
    var executionNumber: js.UndefOr[ExecutionNumber]
  }

  object DescribeJobExecutionRequest {
    def apply(
      jobId: js.UndefOr[JobId] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      executionNumber: js.UndefOr[ExecutionNumber] = js.undefined): DescribeJobExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "executionNumber" -> executionNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobExecutionRequest]
    }
  }

  @js.native
  trait DescribeJobExecutionResponse extends js.Object {
    var execution: js.UndefOr[JobExecution]
  }

  object DescribeJobExecutionResponse {
    def apply(
      execution: js.UndefOr[JobExecution] = js.undefined): DescribeJobExecutionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "execution" -> execution.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobExecutionResponse]
    }
  }

  @js.native
  trait DescribeJobRequest extends js.Object {
    var jobId: js.UndefOr[JobId]
  }

  object DescribeJobRequest {
    def apply(
      jobId: js.UndefOr[JobId] = js.undefined): DescribeJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobRequest]
    }
  }

  @js.native
  trait DescribeJobResponse extends js.Object {
    var documentSource: js.UndefOr[JobDocumentSource]
    var job: js.UndefOr[Job]
  }

  object DescribeJobResponse {
    def apply(
      documentSource: js.UndefOr[JobDocumentSource] = js.undefined,
      job: js.UndefOr[Job] = js.undefined): DescribeJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "documentSource" -> documentSource.map { x => x.asInstanceOf[js.Any] },
        "job" -> job.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobResponse]
    }
  }

  @js.native
  trait DescribeRoleAliasRequest extends js.Object {
    var roleAlias: js.UndefOr[RoleAlias]
  }

  object DescribeRoleAliasRequest {
    def apply(
      roleAlias: js.UndefOr[RoleAlias] = js.undefined): DescribeRoleAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAlias" -> roleAlias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRoleAliasRequest]
    }
  }

  @js.native
  trait DescribeRoleAliasResponse extends js.Object {
    var roleAliasDescription: js.UndefOr[RoleAliasDescription]
  }

  object DescribeRoleAliasResponse {
    def apply(
      roleAliasDescription: js.UndefOr[RoleAliasDescription] = js.undefined): DescribeRoleAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAliasDescription" -> roleAliasDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRoleAliasResponse]
    }
  }

  @js.native
  trait DescribeScheduledAuditRequest extends js.Object {
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
  }

  object DescribeScheduledAuditRequest {
    def apply(
      scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined): DescribeScheduledAuditRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditName" -> scheduledAuditName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledAuditRequest]
    }
  }

  @js.native
  trait DescribeScheduledAuditResponse extends js.Object {
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
    var dayOfWeek: js.UndefOr[DayOfWeek]
    var targetCheckNames: js.UndefOr[TargetAuditCheckNames]
    var dayOfMonth: js.UndefOr[DayOfMonth]
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
    var frequency: js.UndefOr[AuditFrequency]
  }

  object DescribeScheduledAuditResponse {
    def apply(
      scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined,
      dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
      targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined,
      dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
      scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined,
      frequency: js.UndefOr[AuditFrequency] = js.undefined): DescribeScheduledAuditResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditName" -> scheduledAuditName.map { x => x.asInstanceOf[js.Any] },
        "dayOfWeek" -> dayOfWeek.map { x => x.asInstanceOf[js.Any] },
        "targetCheckNames" -> targetCheckNames.map { x => x.asInstanceOf[js.Any] },
        "dayOfMonth" -> dayOfMonth.map { x => x.asInstanceOf[js.Any] },
        "scheduledAuditArn" -> scheduledAuditArn.map { x => x.asInstanceOf[js.Any] },
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledAuditResponse]
    }
  }

  @js.native
  trait DescribeSecurityProfileRequest extends js.Object {
    var securityProfileName: js.UndefOr[SecurityProfileName]
  }

  object DescribeSecurityProfileRequest {
    def apply(
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined): DescribeSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityProfileRequest]
    }
  }

  @js.native
  trait DescribeSecurityProfileResponse extends js.Object {
    var lastModifiedDate: js.UndefOr[Timestamp]
    var securityProfileArn: js.UndefOr[SecurityProfileArn]
    var version: js.UndefOr[Version]
    var behaviors: js.UndefOr[Behaviors]
    var creationDate: js.UndefOr[Timestamp]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription]
    var alertTargets: js.UndefOr[AlertTargets]
  }

  object DescribeSecurityProfileResponse {
    def apply(
      lastModifiedDate: js.UndefOr[Timestamp] = js.undefined,
      securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      behaviors: js.UndefOr[Behaviors] = js.undefined,
      creationDate: js.UndefOr[Timestamp] = js.undefined,
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
      securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined,
      alertTargets: js.UndefOr[AlertTargets] = js.undefined): DescribeSecurityProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "securityProfileArn" -> securityProfileArn.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "behaviors" -> behaviors.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] },
        "securityProfileDescription" -> securityProfileDescription.map { x => x.asInstanceOf[js.Any] },
        "alertTargets" -> alertTargets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityProfileResponse]
    }
  }

  @js.native
  trait DescribeStreamRequest extends js.Object {
    var streamId: js.UndefOr[StreamId]
  }

  object DescribeStreamRequest {
    def apply(
      streamId: js.UndefOr[StreamId] = js.undefined): DescribeStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamId" -> streamId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamRequest]
    }
  }

  @js.native
  trait DescribeStreamResponse extends js.Object {
    var streamInfo: js.UndefOr[StreamInfo]
  }

  object DescribeStreamResponse {
    def apply(
      streamInfo: js.UndefOr[StreamInfo] = js.undefined): DescribeStreamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamInfo" -> streamInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamResponse]
    }
  }

  @js.native
  trait DescribeThingGroupRequest extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
  }

  object DescribeThingGroupRequest {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined): DescribeThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingGroupRequest]
    }
  }

  @js.native
  trait DescribeThingGroupResponse extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var thingGroupMetadata: js.UndefOr[ThingGroupMetadata]
    var queryString: js.UndefOr[QueryString]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var version: js.UndefOr[Version]
    var status: js.UndefOr[DynamicGroupStatus]
    var indexName: js.UndefOr[IndexName]
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingGroupProperties: js.UndefOr[ThingGroupProperties]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  object DescribeThingGroupResponse {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      thingGroupMetadata: js.UndefOr[ThingGroupMetadata] = js.undefined,
      queryString: js.UndefOr[QueryString] = js.undefined,
      thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      status: js.UndefOr[DynamicGroupStatus] = js.undefined,
      indexName: js.UndefOr[IndexName] = js.undefined,
      thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
      thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined,
      queryVersion: js.UndefOr[QueryVersion] = js.undefined): DescribeThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "thingGroupMetadata" -> thingGroupMetadata.map { x => x.asInstanceOf[js.Any] },
        "queryString" -> queryString.map { x => x.asInstanceOf[js.Any] },
        "thingGroupId" -> thingGroupId.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "indexName" -> indexName.map { x => x.asInstanceOf[js.Any] },
        "thingGroupArn" -> thingGroupArn.map { x => x.asInstanceOf[js.Any] },
        "thingGroupProperties" -> thingGroupProperties.map { x => x.asInstanceOf[js.Any] },
        "queryVersion" -> queryVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingGroupResponse]
    }
  }

  @js.native
  trait DescribeThingRegistrationTaskRequest extends js.Object {
    var taskId: js.UndefOr[TaskId]
  }

  object DescribeThingRegistrationTaskRequest {
    def apply(
      taskId: js.UndefOr[TaskId] = js.undefined): DescribeThingRegistrationTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingRegistrationTaskRequest]
    }
  }

  @js.native
  trait DescribeThingRegistrationTaskResponse extends js.Object {
    var successCount: js.UndefOr[Count]
    var inputFileKey: js.UndefOr[RegistryS3KeyName]
    var inputFileBucket: js.UndefOr[RegistryS3BucketName]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
    var failureCount: js.UndefOr[Count]
    var roleArn: js.UndefOr[RoleArn]
    var status: js.UndefOr[Status]
    var creationDate: js.UndefOr[CreationDate]
    var message: js.UndefOr[ErrorMessage]
    var templateBody: js.UndefOr[TemplateBody]
    var taskId: js.UndefOr[TaskId]
    var percentageProgress: js.UndefOr[Percentage]
  }

  object DescribeThingRegistrationTaskResponse {
    def apply(
      successCount: js.UndefOr[Count] = js.undefined,
      inputFileKey: js.UndefOr[RegistryS3KeyName] = js.undefined,
      inputFileBucket: js.UndefOr[RegistryS3BucketName] = js.undefined,
      lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined,
      failureCount: js.UndefOr[Count] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      status: js.UndefOr[Status] = js.undefined,
      creationDate: js.UndefOr[CreationDate] = js.undefined,
      message: js.UndefOr[ErrorMessage] = js.undefined,
      templateBody: js.UndefOr[TemplateBody] = js.undefined,
      taskId: js.UndefOr[TaskId] = js.undefined,
      percentageProgress: js.UndefOr[Percentage] = js.undefined): DescribeThingRegistrationTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "successCount" -> successCount.map { x => x.asInstanceOf[js.Any] },
        "inputFileKey" -> inputFileKey.map { x => x.asInstanceOf[js.Any] },
        "inputFileBucket" -> inputFileBucket.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "failureCount" -> failureCount.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "templateBody" -> templateBody.map { x => x.asInstanceOf[js.Any] },
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] },
        "percentageProgress" -> percentageProgress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingRegistrationTaskResponse]
    }
  }

  /**
   * <p>The input for the DescribeThing operation.</p>
   */
  @js.native
  trait DescribeThingRequest extends js.Object {
    var thingName: js.UndefOr[ThingName]
  }

  object DescribeThingRequest {
    def apply(
      thingName: js.UndefOr[ThingName] = js.undefined): DescribeThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingRequest]
    }
  }

  /**
   * <p>The output from the DescribeThing operation.</p>
   */
  @js.native
  trait DescribeThingResponse extends js.Object {
    var thingId: js.UndefOr[ThingId]
    var attributes: js.UndefOr[Attributes]
    var thingName: js.UndefOr[ThingName]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var defaultClientId: js.UndefOr[ClientId]
    var version: js.UndefOr[Version]
    var thingArn: js.UndefOr[ThingArn]
    var billingGroupName: js.UndefOr[BillingGroupName]
  }

  object DescribeThingResponse {
    def apply(
      thingId: js.UndefOr[ThingId] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
      defaultClientId: js.UndefOr[ClientId] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      thingArn: js.UndefOr[ThingArn] = js.undefined,
      billingGroupName: js.UndefOr[BillingGroupName] = js.undefined): DescribeThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingId" -> thingId.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] },
        "defaultClientId" -> defaultClientId.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "thingArn" -> thingArn.map { x => x.asInstanceOf[js.Any] },
        "billingGroupName" -> billingGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingResponse]
    }
  }

  /**
   * <p>The input for the DescribeThingType operation.</p>
   */
  @js.native
  trait DescribeThingTypeRequest extends js.Object {
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  object DescribeThingTypeRequest {
    def apply(
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined): DescribeThingTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingTypeRequest]
    }
  }

  /**
   * <p>The output for the DescribeThingType operation.</p>
   */
  @js.native
  trait DescribeThingTypeResponse extends js.Object {
    var thingTypeMetadata: js.UndefOr[ThingTypeMetadata]
    var thingTypeProperties: js.UndefOr[ThingTypeProperties]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var thingTypeArn: js.UndefOr[ThingTypeArn]
    var thingTypeId: js.UndefOr[ThingTypeId]
  }

  object DescribeThingTypeResponse {
    def apply(
      thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.undefined,
      thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined,
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
      thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined,
      thingTypeId: js.UndefOr[ThingTypeId] = js.undefined): DescribeThingTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeMetadata" -> thingTypeMetadata.map { x => x.asInstanceOf[js.Any] },
        "thingTypeProperties" -> thingTypeProperties.map { x => x.asInstanceOf[js.Any] },
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] },
        "thingTypeArn" -> thingTypeArn.map { x => x.asInstanceOf[js.Any] },
        "thingTypeId" -> thingTypeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingTypeResponse]
    }
  }

  /**
   * <p>Describes the location of the updated firmware.</p>
   */
  @js.native
  trait Destination extends js.Object {
    var s3Destination: js.UndefOr[S3Destination]
  }

  object Destination {
    def apply(
      s3Destination: js.UndefOr[S3Destination] = js.undefined): Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3Destination" -> s3Destination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }

  @js.native
  trait DetachPolicyRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var target: js.UndefOr[PolicyTarget]
  }

  object DetachPolicyRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      target: js.UndefOr[PolicyTarget] = js.undefined): DetachPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "target" -> target.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachPolicyRequest]
    }
  }

  /**
   * <p>The input for the DetachPrincipalPolicy operation.</p>
   */
  @js.native
  trait DetachPrincipalPolicyRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var principal: js.UndefOr[Principal]
  }

  object DetachPrincipalPolicyRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      principal: js.UndefOr[Principal] = js.undefined): DetachPrincipalPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "principal" -> principal.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachPrincipalPolicyRequest]
    }
  }

  @js.native
  trait DetachSecurityProfileRequest extends js.Object {
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var securityProfileTargetArn: js.UndefOr[SecurityProfileTargetArn]
  }

  object DetachSecurityProfileRequest {
    def apply(
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
      securityProfileTargetArn: js.UndefOr[SecurityProfileTargetArn] = js.undefined): DetachSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] },
        "securityProfileTargetArn" -> securityProfileTargetArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachSecurityProfileRequest]
    }
  }

  @js.native
  trait DetachSecurityProfileResponse extends js.Object {

  }

  object DetachSecurityProfileResponse {
    def apply(): DetachSecurityProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachSecurityProfileResponse]
    }
  }

  /**
   * <p>The input for the DetachThingPrincipal operation.</p>
   */
  @js.native
  trait DetachThingPrincipalRequest extends js.Object {
    var thingName: js.UndefOr[ThingName]
    var principal: js.UndefOr[Principal]
  }

  object DetachThingPrincipalRequest {
    def apply(
      thingName: js.UndefOr[ThingName] = js.undefined,
      principal: js.UndefOr[Principal] = js.undefined): DetachThingPrincipalRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "principal" -> principal.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachThingPrincipalRequest]
    }
  }

  /**
   * <p>The output from the DetachThingPrincipal operation.</p>
   */
  @js.native
  trait DetachThingPrincipalResponse extends js.Object {

  }

  object DetachThingPrincipalResponse {
    def apply(): DetachThingPrincipalResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachThingPrincipalResponse]
    }
  }

  /**
   * <p>The input for the DisableTopicRuleRequest operation.</p>
   */
  @js.native
  trait DisableTopicRuleRequest extends js.Object {
    var ruleName: js.UndefOr[RuleName]
  }

  object DisableTopicRuleRequest {
    def apply(
      ruleName: js.UndefOr[RuleName] = js.undefined): DisableTopicRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName" -> ruleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableTopicRuleRequest]
    }
  }

  object DynamicGroupStatusEnum {
    val ACTIVE = "ACTIVE"
    val BUILDING = "BUILDING"
    val REBUILDING = "REBUILDING"

    val values = IndexedSeq(ACTIVE, BUILDING, REBUILDING)
  }

  /**
   * <p>Describes an action to write to a DynamoDB table.</p> <p>The <code>tableName</code>, <code>hashKeyField</code>, and <code>rangeKeyField</code> values must match the values used when you created the table.</p> <p>The <code>hashKeyValue</code> and <code>rangeKeyvalue</code> fields use a substitution template syntax. These templates provide data at runtime. The syntax is as follows: ${<i>sql-expression</i>}.</p> <p>You can specify any valid expression in a WHERE or SELECT clause, including JSON properties, comparisons, calculations, and functions. For example, the following field uses the third level of the topic:</p> <p> <code>"hashKeyValue": "${topic(3)}"</code> </p> <p>The following field uses the timestamp:</p> <p> <code>"rangeKeyValue": "${timestamp()}"</code> </p>
   */
  @js.native
  trait DynamoDBAction extends js.Object {
    var rangeKeyType: js.UndefOr[DynamoKeyType]
    var hashKeyValue: js.UndefOr[HashKeyValue]
    var hashKeyType: js.UndefOr[DynamoKeyType]
    var rangeKeyValue: js.UndefOr[RangeKeyValue]
    var hashKeyField: js.UndefOr[HashKeyField]
    var operation: js.UndefOr[DynamoOperation]
    var tableName: js.UndefOr[TableName]
    var roleArn: js.UndefOr[AwsArn]
    var payloadField: js.UndefOr[PayloadField]
    var rangeKeyField: js.UndefOr[RangeKeyField]
  }

  object DynamoDBAction {
    def apply(
      rangeKeyType: js.UndefOr[DynamoKeyType] = js.undefined,
      hashKeyValue: js.UndefOr[HashKeyValue] = js.undefined,
      hashKeyType: js.UndefOr[DynamoKeyType] = js.undefined,
      rangeKeyValue: js.UndefOr[RangeKeyValue] = js.undefined,
      hashKeyField: js.UndefOr[HashKeyField] = js.undefined,
      operation: js.UndefOr[DynamoOperation] = js.undefined,
      tableName: js.UndefOr[TableName] = js.undefined,
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      payloadField: js.UndefOr[PayloadField] = js.undefined,
      rangeKeyField: js.UndefOr[RangeKeyField] = js.undefined): DynamoDBAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rangeKeyType" -> rangeKeyType.map { x => x.asInstanceOf[js.Any] },
        "hashKeyValue" -> hashKeyValue.map { x => x.asInstanceOf[js.Any] },
        "hashKeyType" -> hashKeyType.map { x => x.asInstanceOf[js.Any] },
        "rangeKeyValue" -> rangeKeyValue.map { x => x.asInstanceOf[js.Any] },
        "hashKeyField" -> hashKeyField.map { x => x.asInstanceOf[js.Any] },
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] },
        "tableName" -> tableName.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "payloadField" -> payloadField.map { x => x.asInstanceOf[js.Any] },
        "rangeKeyField" -> rangeKeyField.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DynamoDBAction]
    }
  }

  /**
   * <p>Describes an action to write to a DynamoDB table.</p> <p>This DynamoDB action writes each attribute in the message payload into it's own column in the DynamoDB table.</p>
   */
  @js.native
  trait DynamoDBv2Action extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var putItem: js.UndefOr[PutItemInput]
  }

  object DynamoDBv2Action {
    def apply(
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      putItem: js.UndefOr[PutItemInput] = js.undefined): DynamoDBv2Action = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "putItem" -> putItem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DynamoDBv2Action]
    }
  }

  object DynamoKeyTypeEnum {
    val STRING = "STRING"
    val NUMBER = "NUMBER"

    val values = IndexedSeq(STRING, NUMBER)
  }

  /**
   * <p>The policy that has the effect on the authorization results.</p>
   */
  @js.native
  trait EffectivePolicy extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyArn: js.UndefOr[PolicyArn]
    var policyDocument: js.UndefOr[PolicyDocument]
  }

  object EffectivePolicy {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      policyArn: js.UndefOr[PolicyArn] = js.undefined,
      policyDocument: js.UndefOr[PolicyDocument] = js.undefined): EffectivePolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "policyArn" -> policyArn.map { x => x.asInstanceOf[js.Any] },
        "policyDocument" -> policyDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EffectivePolicy]
    }
  }

  /**
   * <p>Describes an action that writes data to an Amazon Elasticsearch Service domain.</p>
   */
  @js.native
  trait ElasticsearchAction extends js.Object {
    var id: js.UndefOr[ElasticsearchId]
    var roleArn: js.UndefOr[AwsArn]
    var endpoint: js.UndefOr[ElasticsearchEndpoint]
    var `type`: js.UndefOr[ElasticsearchType]
    var index: js.UndefOr[ElasticsearchIndex]
  }

  object ElasticsearchAction {
    def apply(
      id: js.UndefOr[ElasticsearchId] = js.undefined,
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      endpoint: js.UndefOr[ElasticsearchEndpoint] = js.undefined,
      `type`: js.UndefOr[ElasticsearchType] = js.undefined,
      index: js.UndefOr[ElasticsearchIndex] = js.undefined): ElasticsearchAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "endpoint" -> endpoint.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "index" -> index.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchAction]
    }
  }

  /**
   * <p>The input for the EnableTopicRuleRequest operation.</p>
   */
  @js.native
  trait EnableTopicRuleRequest extends js.Object {
    var ruleName: js.UndefOr[RuleName]
  }

  object EnableTopicRuleRequest {
    def apply(
      ruleName: js.UndefOr[RuleName] = js.undefined): EnableTopicRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName" -> ruleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableTopicRuleRequest]
    }
  }

  /**
   * <p>Error information.</p>
   */
  @js.native
  trait ErrorInfo extends js.Object {
    var code: js.UndefOr[Code]
    var message: js.UndefOr[OTAUpdateErrorMessage]
  }

  object ErrorInfo {
    def apply(
      code: js.UndefOr[Code] = js.undefined,
      message: js.UndefOr[OTAUpdateErrorMessage] = js.undefined): ErrorInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "code" -> code.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorInfo]
    }
  }

  object EventTypeEnum {
    val THING = "THING"
    val THING_GROUP = "THING_GROUP"
    val THING_TYPE = "THING_TYPE"
    val THING_GROUP_MEMBERSHIP = "THING_GROUP_MEMBERSHIP"
    val THING_GROUP_HIERARCHY = "THING_GROUP_HIERARCHY"
    val THING_TYPE_ASSOCIATION = "THING_TYPE_ASSOCIATION"
    val JOB = "JOB"
    val JOB_EXECUTION = "JOB_EXECUTION"
    val POLICY = "POLICY"
    val CERTIFICATE = "CERTIFICATE"
    val CA_CERTIFICATE = "CA_CERTIFICATE"

    val values = IndexedSeq(THING, THING_GROUP, THING_TYPE, THING_GROUP_MEMBERSHIP, THING_GROUP_HIERARCHY, THING_TYPE_ASSOCIATION, JOB, JOB_EXECUTION, POLICY, CERTIFICATE, CA_CERTIFICATE)
  }

  /**
   * <p>Information that explicitly denies authorization.</p>
   */
  @js.native
  trait ExplicitDeny extends js.Object {
    var policies: js.UndefOr[Policies]
  }

  object ExplicitDeny {
    def apply(
      policies: js.UndefOr[Policies] = js.undefined): ExplicitDeny = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policies" -> policies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExplicitDeny]
    }
  }

  /**
   * <p>Allows you to create an exponential rate of rollout for a job.</p>
   */
  @js.native
  trait ExponentialRolloutRate extends js.Object {
    var baseRatePerMinute: js.UndefOr[RolloutRatePerMinute]
    var incrementFactor: js.UndefOr[IncrementFactor]
    var rateIncreaseCriteria: js.UndefOr[RateIncreaseCriteria]
  }

  object ExponentialRolloutRate {
    def apply(
      baseRatePerMinute: js.UndefOr[RolloutRatePerMinute] = js.undefined,
      incrementFactor: js.UndefOr[IncrementFactor] = js.undefined,
      rateIncreaseCriteria: js.UndefOr[RateIncreaseCriteria] = js.undefined): ExponentialRolloutRate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "baseRatePerMinute" -> baseRatePerMinute.map { x => x.asInstanceOf[js.Any] },
        "incrementFactor" -> incrementFactor.map { x => x.asInstanceOf[js.Any] },
        "rateIncreaseCriteria" -> rateIncreaseCriteria.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExponentialRolloutRate]
    }
  }

  /**
   * <p>The location of the OTA update.</p>
   */
  @js.native
  trait FileLocation extends js.Object {
    var stream: js.UndefOr[Stream]
    var s3Location: js.UndefOr[S3Location]
  }

  object FileLocation {
    def apply(
      stream: js.UndefOr[Stream] = js.undefined,
      s3Location: js.UndefOr[S3Location] = js.undefined): FileLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stream" -> stream.map { x => x.asInstanceOf[js.Any] },
        "s3Location" -> s3Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileLocation]
    }
  }

  /**
   * <p>Describes an action that writes data to an Amazon Kinesis Firehose stream.</p>
   */
  @js.native
  trait FirehoseAction extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var deliveryStreamName: js.UndefOr[DeliveryStreamName]
    var separator: js.UndefOr[FirehoseSeparator]
  }

  object FirehoseAction {
    def apply(
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      deliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined,
      separator: js.UndefOr[FirehoseSeparator] = js.undefined): FirehoseAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "deliveryStreamName" -> deliveryStreamName.map { x => x.asInstanceOf[js.Any] },
        "separator" -> separator.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FirehoseAction]
    }
  }

  @js.native
  trait GetEffectivePoliciesRequest extends js.Object {
    var principal: js.UndefOr[Principal]
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId]
    var thingName: js.UndefOr[ThingName]
  }

  object GetEffectivePoliciesRequest {
    def apply(
      principal: js.UndefOr[Principal] = js.undefined,
      cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined): GetEffectivePoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "principal" -> principal.map { x => x.asInstanceOf[js.Any] },
        "cognitoIdentityPoolId" -> cognitoIdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEffectivePoliciesRequest]
    }
  }

  @js.native
  trait GetEffectivePoliciesResponse extends js.Object {
    var effectivePolicies: js.UndefOr[EffectivePolicies]
  }

  object GetEffectivePoliciesResponse {
    def apply(
      effectivePolicies: js.UndefOr[EffectivePolicies] = js.undefined): GetEffectivePoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "effectivePolicies" -> effectivePolicies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEffectivePoliciesResponse]
    }
  }

  @js.native
  trait GetIndexingConfigurationRequest extends js.Object {

  }

  object GetIndexingConfigurationRequest {
    def apply(): GetIndexingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIndexingConfigurationRequest]
    }
  }

  @js.native
  trait GetIndexingConfigurationResponse extends js.Object {
    var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration]
    var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration]
  }

  object GetIndexingConfigurationResponse {
    def apply(
      thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.undefined,
      thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.undefined): GetIndexingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingIndexingConfiguration" -> thingIndexingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "thingGroupIndexingConfiguration" -> thingGroupIndexingConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIndexingConfigurationResponse]
    }
  }

  @js.native
  trait GetJobDocumentRequest extends js.Object {
    var jobId: js.UndefOr[JobId]
  }

  object GetJobDocumentRequest {
    def apply(
      jobId: js.UndefOr[JobId] = js.undefined): GetJobDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobDocumentRequest]
    }
  }

  @js.native
  trait GetJobDocumentResponse extends js.Object {
    var document: js.UndefOr[JobDocument]
  }

  object GetJobDocumentResponse {
    def apply(
      document: js.UndefOr[JobDocument] = js.undefined): GetJobDocumentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "document" -> document.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobDocumentResponse]
    }
  }

  /**
   * <p>The input for the GetLoggingOptions operation.</p>
   */
  @js.native
  trait GetLoggingOptionsRequest extends js.Object {

  }

  object GetLoggingOptionsRequest {
    def apply(): GetLoggingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoggingOptionsRequest]
    }
  }

  /**
   * <p>The output from the GetLoggingOptions operation.</p>
   */
  @js.native
  trait GetLoggingOptionsResponse extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var logLevel: js.UndefOr[LogLevel]
  }

  object GetLoggingOptionsResponse {
    def apply(
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      logLevel: js.UndefOr[LogLevel] = js.undefined): GetLoggingOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "logLevel" -> logLevel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoggingOptionsResponse]
    }
  }

  @js.native
  trait GetOTAUpdateRequest extends js.Object {
    var otaUpdateId: js.UndefOr[OTAUpdateId]
  }

  object GetOTAUpdateRequest {
    def apply(
      otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined): GetOTAUpdateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "otaUpdateId" -> otaUpdateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOTAUpdateRequest]
    }
  }

  @js.native
  trait GetOTAUpdateResponse extends js.Object {
    var otaUpdateInfo: js.UndefOr[OTAUpdateInfo]
  }

  object GetOTAUpdateResponse {
    def apply(
      otaUpdateInfo: js.UndefOr[OTAUpdateInfo] = js.undefined): GetOTAUpdateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "otaUpdateInfo" -> otaUpdateInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOTAUpdateResponse]
    }
  }

  /**
   * <p>The input for the GetPolicy operation.</p>
   */
  @js.native
  trait GetPolicyRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
  }

  object GetPolicyRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined): GetPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyRequest]
    }
  }

  /**
   * <p>The output from the GetPolicy operation.</p>
   */
  @js.native
  trait GetPolicyResponse extends js.Object {
    var defaultVersionId: js.UndefOr[PolicyVersionId]
    var lastModifiedDate: js.UndefOr[DateType]
    var generationId: js.UndefOr[GenerationId]
    var policyName: js.UndefOr[PolicyName]
    var policyDocument: js.UndefOr[PolicyDocument]
    var creationDate: js.UndefOr[DateType]
    var policyArn: js.UndefOr[PolicyArn]
  }

  object GetPolicyResponse {
    def apply(
      defaultVersionId: js.UndefOr[PolicyVersionId] = js.undefined,
      lastModifiedDate: js.UndefOr[DateType] = js.undefined,
      generationId: js.UndefOr[GenerationId] = js.undefined,
      policyName: js.UndefOr[PolicyName] = js.undefined,
      policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
      creationDate: js.UndefOr[DateType] = js.undefined,
      policyArn: js.UndefOr[PolicyArn] = js.undefined): GetPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "defaultVersionId" -> defaultVersionId.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "generationId" -> generationId.map { x => x.asInstanceOf[js.Any] },
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "policyDocument" -> policyDocument.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "policyArn" -> policyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyResponse]
    }
  }

  /**
   * <p>The input for the GetPolicyVersion operation.</p>
   */
  @js.native
  trait GetPolicyVersionRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyVersionId: js.UndefOr[PolicyVersionId]
  }

  object GetPolicyVersionRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined): GetPolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "policyVersionId" -> policyVersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyVersionRequest]
    }
  }

  /**
   * <p>The output from the GetPolicyVersion operation.</p>
   */
  @js.native
  trait GetPolicyVersionResponse extends js.Object {
    var lastModifiedDate: js.UndefOr[DateType]
    var generationId: js.UndefOr[GenerationId]
    var policyVersionId: js.UndefOr[PolicyVersionId]
    var policyName: js.UndefOr[PolicyName]
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var policyDocument: js.UndefOr[PolicyDocument]
    var creationDate: js.UndefOr[DateType]
    var policyArn: js.UndefOr[PolicyArn]
  }

  object GetPolicyVersionResponse {
    def apply(
      lastModifiedDate: js.UndefOr[DateType] = js.undefined,
      generationId: js.UndefOr[GenerationId] = js.undefined,
      policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined,
      policyName: js.UndefOr[PolicyName] = js.undefined,
      isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
      policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
      creationDate: js.UndefOr[DateType] = js.undefined,
      policyArn: js.UndefOr[PolicyArn] = js.undefined): GetPolicyVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "generationId" -> generationId.map { x => x.asInstanceOf[js.Any] },
        "policyVersionId" -> policyVersionId.map { x => x.asInstanceOf[js.Any] },
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "isDefaultVersion" -> isDefaultVersion.map { x => x.asInstanceOf[js.Any] },
        "policyDocument" -> policyDocument.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "policyArn" -> policyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyVersionResponse]
    }
  }

  /**
   * <p>The input to the GetRegistrationCode operation.</p>
   */
  @js.native
  trait GetRegistrationCodeRequest extends js.Object {

  }

  object GetRegistrationCodeRequest {
    def apply(): GetRegistrationCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRegistrationCodeRequest]
    }
  }

  /**
   * <p>The output from the GetRegistrationCode operation.</p>
   */
  @js.native
  trait GetRegistrationCodeResponse extends js.Object {
    var registrationCode: js.UndefOr[RegistrationCode]
  }

  object GetRegistrationCodeResponse {
    def apply(
      registrationCode: js.UndefOr[RegistrationCode] = js.undefined): GetRegistrationCodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registrationCode" -> registrationCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRegistrationCodeResponse]
    }
  }

  /**
   * <p>The input for the GetTopicRule operation.</p>
   */
  @js.native
  trait GetTopicRuleRequest extends js.Object {
    var ruleName: js.UndefOr[RuleName]
  }

  object GetTopicRuleRequest {
    def apply(
      ruleName: js.UndefOr[RuleName] = js.undefined): GetTopicRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName" -> ruleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTopicRuleRequest]
    }
  }

  /**
   * <p>The output from the GetTopicRule operation.</p>
   */
  @js.native
  trait GetTopicRuleResponse extends js.Object {
    var ruleArn: js.UndefOr[RuleArn]
    var rule: js.UndefOr[TopicRule]
  }

  object GetTopicRuleResponse {
    def apply(
      ruleArn: js.UndefOr[RuleArn] = js.undefined,
      rule: js.UndefOr[TopicRule] = js.undefined): GetTopicRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleArn" -> ruleArn.map { x => x.asInstanceOf[js.Any] },
        "rule" -> rule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTopicRuleResponse]
    }
  }

  @js.native
  trait GetV2LoggingOptionsRequest extends js.Object {

  }

  object GetV2LoggingOptionsRequest {
    def apply(): GetV2LoggingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetV2LoggingOptionsRequest]
    }
  }

  @js.native
  trait GetV2LoggingOptionsResponse extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var defaultLogLevel: js.UndefOr[LogLevel]
    var disableAllLogs: js.UndefOr[DisableAllLogs]
  }

  object GetV2LoggingOptionsResponse {
    def apply(
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      defaultLogLevel: js.UndefOr[LogLevel] = js.undefined,
      disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined): GetV2LoggingOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "defaultLogLevel" -> defaultLogLevel.map { x => x.asInstanceOf[js.Any] },
        "disableAllLogs" -> disableAllLogs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetV2LoggingOptionsResponse]
    }
  }

  /**
   * <p>The name and ARN of a group.</p>
   */
  @js.native
  trait GroupNameAndArn extends js.Object {
    var groupName: js.UndefOr[ThingGroupName]
    var groupArn: js.UndefOr[ThingGroupArn]
  }

  object GroupNameAndArn {
    def apply(
      groupName: js.UndefOr[ThingGroupName] = js.undefined,
      groupArn: js.UndefOr[ThingGroupArn] = js.undefined): GroupNameAndArn = {
      val _fields = IndexedSeq[(String, js.Any)](
        "groupName" -> groupName.map { x => x.asInstanceOf[js.Any] },
        "groupArn" -> groupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupNameAndArn]
    }
  }

  /**
   * <p>Information that implicitly denies authorization. When policy doesn't explicitly deny or allow an action on a resource it is considered an implicit deny.</p>
   */
  @js.native
  trait ImplicitDeny extends js.Object {
    var policies: js.UndefOr[Policies]
  }

  object ImplicitDeny {
    def apply(
      policies: js.UndefOr[Policies] = js.undefined): ImplicitDeny = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policies" -> policies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImplicitDeny]
    }
  }

  object IndexStatusEnum {
    val ACTIVE = "ACTIVE"
    val BUILDING = "BUILDING"
    val REBUILDING = "REBUILDING"

    val values = IndexedSeq(ACTIVE, BUILDING, REBUILDING)
  }

  /**
   * <p>Sends messge data to an AWS IoT Analytics channel.</p>
   */
  @js.native
  trait IotAnalyticsAction extends js.Object {
    var channelArn: js.UndefOr[AwsArn]
    var channelName: js.UndefOr[ChannelName]
    var roleArn: js.UndefOr[AwsArn]
  }

  object IotAnalyticsAction {
    def apply(
      channelArn: js.UndefOr[AwsArn] = js.undefined,
      channelName: js.UndefOr[ChannelName] = js.undefined,
      roleArn: js.UndefOr[AwsArn] = js.undefined): IotAnalyticsAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channelArn" -> channelArn.map { x => x.asInstanceOf[js.Any] },
        "channelName" -> channelName.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IotAnalyticsAction]
    }
  }

  /**
   * <p>Sends an input to an AWS IoT Events detector.</p>
   */
  @js.native
  trait IotEventsAction extends js.Object {
    var inputName: js.UndefOr[InputName]
    var messageId: js.UndefOr[MessageId]
    var roleArn: js.UndefOr[AwsArn]
  }

  object IotEventsAction {
    def apply(
      inputName: js.UndefOr[InputName] = js.undefined,
      messageId: js.UndefOr[MessageId] = js.undefined,
      roleArn: js.UndefOr[AwsArn] = js.undefined): IotEventsAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "inputName" -> inputName.map { x => x.asInstanceOf[js.Any] },
        "messageId" -> messageId.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IotEventsAction]
    }
  }

  /**
   * <p>The <code>Job</code> object contains details about a job.</p>
   */
  @js.native
  trait Job extends js.Object {
    var targets: js.UndefOr[JobTargets]
    var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig]
    var completedAt: js.UndefOr[DateType]
    var forceCanceled: js.UndefOr[Forced]
    var description: js.UndefOr[JobDescription]
    var jobArn: js.UndefOr[JobArn]
    var reasonCode: js.UndefOr[ReasonCode]
    var presignedUrlConfig: js.UndefOr[PresignedUrlConfig]
    var status: js.UndefOr[JobStatus]
    var comment: js.UndefOr[Comment]
    var jobId: js.UndefOr[JobId]
    var createdAt: js.UndefOr[DateType]
    var abortConfig: js.UndefOr[AbortConfig]
    var targetSelection: js.UndefOr[TargetSelection]
    var timeoutConfig: js.UndefOr[TimeoutConfig]
    var lastUpdatedAt: js.UndefOr[DateType]
    var jobProcessDetails: js.UndefOr[JobProcessDetails]
  }

  object Job {
    def apply(
      targets: js.UndefOr[JobTargets] = js.undefined,
      jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined,
      completedAt: js.UndefOr[DateType] = js.undefined,
      forceCanceled: js.UndefOr[Forced] = js.undefined,
      description: js.UndefOr[JobDescription] = js.undefined,
      jobArn: js.UndefOr[JobArn] = js.undefined,
      reasonCode: js.UndefOr[ReasonCode] = js.undefined,
      presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined,
      status: js.UndefOr[JobStatus] = js.undefined,
      comment: js.UndefOr[Comment] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      createdAt: js.UndefOr[DateType] = js.undefined,
      abortConfig: js.UndefOr[AbortConfig] = js.undefined,
      targetSelection: js.UndefOr[TargetSelection] = js.undefined,
      timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined,
      lastUpdatedAt: js.UndefOr[DateType] = js.undefined,
      jobProcessDetails: js.UndefOr[JobProcessDetails] = js.undefined): Job = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targets" -> targets.map { x => x.asInstanceOf[js.Any] },
        "jobExecutionsRolloutConfig" -> jobExecutionsRolloutConfig.map { x => x.asInstanceOf[js.Any] },
        "completedAt" -> completedAt.map { x => x.asInstanceOf[js.Any] },
        "forceCanceled" -> forceCanceled.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "jobArn" -> jobArn.map { x => x.asInstanceOf[js.Any] },
        "reasonCode" -> reasonCode.map { x => x.asInstanceOf[js.Any] },
        "presignedUrlConfig" -> presignedUrlConfig.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "comment" -> comment.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "abortConfig" -> abortConfig.map { x => x.asInstanceOf[js.Any] },
        "targetSelection" -> targetSelection.map { x => x.asInstanceOf[js.Any] },
        "timeoutConfig" -> timeoutConfig.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "jobProcessDetails" -> jobProcessDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Job]
    }
  }

  /**
   * <p>The job execution object represents the execution of a job on a particular device.</p>
   */
  @js.native
  trait JobExecution extends js.Object {
    var versionNumber: js.UndefOr[VersionNumber]
    var executionNumber: js.UndefOr[ExecutionNumber]
    var forceCanceled: js.UndefOr[Forced]
    var statusDetails: js.UndefOr[JobExecutionStatusDetails]
    var thingArn: js.UndefOr[ThingArn]
    var status: js.UndefOr[JobExecutionStatus]
    var queuedAt: js.UndefOr[DateType]
    var jobId: js.UndefOr[JobId]
    var startedAt: js.UndefOr[DateType]
    var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut]
    var lastUpdatedAt: js.UndefOr[DateType]
  }

  object JobExecution {
    def apply(
      versionNumber: js.UndefOr[VersionNumber] = js.undefined,
      executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
      forceCanceled: js.UndefOr[Forced] = js.undefined,
      statusDetails: js.UndefOr[JobExecutionStatusDetails] = js.undefined,
      thingArn: js.UndefOr[ThingArn] = js.undefined,
      status: js.UndefOr[JobExecutionStatus] = js.undefined,
      queuedAt: js.UndefOr[DateType] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      startedAt: js.UndefOr[DateType] = js.undefined,
      approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.undefined,
      lastUpdatedAt: js.UndefOr[DateType] = js.undefined): JobExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "versionNumber" -> versionNumber.map { x => x.asInstanceOf[js.Any] },
        "executionNumber" -> executionNumber.map { x => x.asInstanceOf[js.Any] },
        "forceCanceled" -> forceCanceled.map { x => x.asInstanceOf[js.Any] },
        "statusDetails" -> statusDetails.map { x => x.asInstanceOf[js.Any] },
        "thingArn" -> thingArn.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "queuedAt" -> queuedAt.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "startedAt" -> startedAt.map { x => x.asInstanceOf[js.Any] },
        "approximateSecondsBeforeTimedOut" -> approximateSecondsBeforeTimedOut.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecution]
    }
  }

  object JobExecutionFailureTypeEnum {
    val FAILED = "FAILED"
    val REJECTED = "REJECTED"
    val TIMED_OUT = "TIMED_OUT"
    val ALL = "ALL"

    val values = IndexedSeq(FAILED, REJECTED, TIMED_OUT, ALL)
  }

  object JobExecutionStatusEnum {
    val QUEUED = "QUEUED"
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"
    val TIMED_OUT = "TIMED_OUT"
    val REJECTED = "REJECTED"
    val REMOVED = "REMOVED"
    val CANCELED = "CANCELED"

    val values = IndexedSeq(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED)
  }

  /**
   * <p>Details of the job execution status.</p>
   */
  @js.native
  trait JobExecutionStatusDetails extends js.Object {
    var detailsMap: js.UndefOr[DetailsMap]
  }

  object JobExecutionStatusDetails {
    def apply(
      detailsMap: js.UndefOr[DetailsMap] = js.undefined): JobExecutionStatusDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "detailsMap" -> detailsMap.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecutionStatusDetails]
    }
  }

  /**
   * <p>The job execution summary.</p>
   */
  @js.native
  trait JobExecutionSummary extends js.Object {
    var executionNumber: js.UndefOr[ExecutionNumber]
    var status: js.UndefOr[JobExecutionStatus]
    var queuedAt: js.UndefOr[DateType]
    var startedAt: js.UndefOr[DateType]
    var lastUpdatedAt: js.UndefOr[DateType]
  }

  object JobExecutionSummary {
    def apply(
      executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
      status: js.UndefOr[JobExecutionStatus] = js.undefined,
      queuedAt: js.UndefOr[DateType] = js.undefined,
      startedAt: js.UndefOr[DateType] = js.undefined,
      lastUpdatedAt: js.UndefOr[DateType] = js.undefined): JobExecutionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionNumber" -> executionNumber.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "queuedAt" -> queuedAt.map { x => x.asInstanceOf[js.Any] },
        "startedAt" -> startedAt.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecutionSummary]
    }
  }

  /**
   * <p>Contains a summary of information about job executions for a specific job.</p>
   */
  @js.native
  trait JobExecutionSummaryForJob extends js.Object {
    var thingArn: js.UndefOr[ThingArn]
    var jobExecutionSummary: js.UndefOr[JobExecutionSummary]
  }

  object JobExecutionSummaryForJob {
    def apply(
      thingArn: js.UndefOr[ThingArn] = js.undefined,
      jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.undefined): JobExecutionSummaryForJob = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingArn" -> thingArn.map { x => x.asInstanceOf[js.Any] },
        "jobExecutionSummary" -> jobExecutionSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecutionSummaryForJob]
    }
  }

  /**
   * <p>The job execution summary for a thing.</p>
   */
  @js.native
  trait JobExecutionSummaryForThing extends js.Object {
    var jobId: js.UndefOr[JobId]
    var jobExecutionSummary: js.UndefOr[JobExecutionSummary]
  }

  object JobExecutionSummaryForThing {
    def apply(
      jobId: js.UndefOr[JobId] = js.undefined,
      jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.undefined): JobExecutionSummaryForThing = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "jobExecutionSummary" -> jobExecutionSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecutionSummaryForThing]
    }
  }

  /**
   * <p>Allows you to create a staged rollout of a job.</p>
   */
  @js.native
  trait JobExecutionsRolloutConfig extends js.Object {
    var maximumPerMinute: js.UndefOr[MaxJobExecutionsPerMin]
    var exponentialRate: js.UndefOr[ExponentialRolloutRate]
  }

  object JobExecutionsRolloutConfig {
    def apply(
      maximumPerMinute: js.UndefOr[MaxJobExecutionsPerMin] = js.undefined,
      exponentialRate: js.UndefOr[ExponentialRolloutRate] = js.undefined): JobExecutionsRolloutConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maximumPerMinute" -> maximumPerMinute.map { x => x.asInstanceOf[js.Any] },
        "exponentialRate" -> exponentialRate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecutionsRolloutConfig]
    }
  }

  /**
   * <p>The job process details.</p>
   */
  @js.native
  trait JobProcessDetails extends js.Object {
    var numberOfCanceledThings: js.UndefOr[CanceledThings]
    var numberOfRemovedThings: js.UndefOr[RemovedThings]
    var numberOfRejectedThings: js.UndefOr[RejectedThings]
    var numberOfTimedOutThings: js.UndefOr[TimedOutThings]
    var processingTargets: js.UndefOr[ProcessingTargetNameList]
    var numberOfFailedThings: js.UndefOr[FailedThings]
    var numberOfSucceededThings: js.UndefOr[SucceededThings]
    var numberOfQueuedThings: js.UndefOr[QueuedThings]
    var numberOfInProgressThings: js.UndefOr[InProgressThings]
  }

  object JobProcessDetails {
    def apply(
      numberOfCanceledThings: js.UndefOr[CanceledThings] = js.undefined,
      numberOfRemovedThings: js.UndefOr[RemovedThings] = js.undefined,
      numberOfRejectedThings: js.UndefOr[RejectedThings] = js.undefined,
      numberOfTimedOutThings: js.UndefOr[TimedOutThings] = js.undefined,
      processingTargets: js.UndefOr[ProcessingTargetNameList] = js.undefined,
      numberOfFailedThings: js.UndefOr[FailedThings] = js.undefined,
      numberOfSucceededThings: js.UndefOr[SucceededThings] = js.undefined,
      numberOfQueuedThings: js.UndefOr[QueuedThings] = js.undefined,
      numberOfInProgressThings: js.UndefOr[InProgressThings] = js.undefined): JobProcessDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "numberOfCanceledThings" -> numberOfCanceledThings.map { x => x.asInstanceOf[js.Any] },
        "numberOfRemovedThings" -> numberOfRemovedThings.map { x => x.asInstanceOf[js.Any] },
        "numberOfRejectedThings" -> numberOfRejectedThings.map { x => x.asInstanceOf[js.Any] },
        "numberOfTimedOutThings" -> numberOfTimedOutThings.map { x => x.asInstanceOf[js.Any] },
        "processingTargets" -> processingTargets.map { x => x.asInstanceOf[js.Any] },
        "numberOfFailedThings" -> numberOfFailedThings.map { x => x.asInstanceOf[js.Any] },
        "numberOfSucceededThings" -> numberOfSucceededThings.map { x => x.asInstanceOf[js.Any] },
        "numberOfQueuedThings" -> numberOfQueuedThings.map { x => x.asInstanceOf[js.Any] },
        "numberOfInProgressThings" -> numberOfInProgressThings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobProcessDetails]
    }
  }

  object JobStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val CANCELED = "CANCELED"
    val COMPLETED = "COMPLETED"
    val DELETION_IN_PROGRESS = "DELETION_IN_PROGRESS"

    val values = IndexedSeq(IN_PROGRESS, CANCELED, COMPLETED, DELETION_IN_PROGRESS)
  }

  /**
   * <p>The job summary.</p>
   */
  @js.native
  trait JobSummary extends js.Object {
    var completedAt: js.UndefOr[DateType]
    var jobArn: js.UndefOr[JobArn]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var status: js.UndefOr[JobStatus]
    var jobId: js.UndefOr[JobId]
    var createdAt: js.UndefOr[DateType]
    var targetSelection: js.UndefOr[TargetSelection]
    var lastUpdatedAt: js.UndefOr[DateType]
  }

  object JobSummary {
    def apply(
      completedAt: js.UndefOr[DateType] = js.undefined,
      jobArn: js.UndefOr[JobArn] = js.undefined,
      thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
      status: js.UndefOr[JobStatus] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      createdAt: js.UndefOr[DateType] = js.undefined,
      targetSelection: js.UndefOr[TargetSelection] = js.undefined,
      lastUpdatedAt: js.UndefOr[DateType] = js.undefined): JobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "completedAt" -> completedAt.map { x => x.asInstanceOf[js.Any] },
        "jobArn" -> jobArn.map { x => x.asInstanceOf[js.Any] },
        "thingGroupId" -> thingGroupId.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "targetSelection" -> targetSelection.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobSummary]
    }
  }

  /**
   * <p>Describes a key pair.</p>
   */
  @js.native
  trait KeyPair extends js.Object {
    var PublicKey: js.UndefOr[PublicKey]
    var PrivateKey: js.UndefOr[PrivateKey]
  }

  object KeyPair {
    def apply(
      PublicKey: js.UndefOr[PublicKey] = js.undefined,
      PrivateKey: js.UndefOr[PrivateKey] = js.undefined): KeyPair = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublicKey" -> PublicKey.map { x => x.asInstanceOf[js.Any] },
        "PrivateKey" -> PrivateKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPair]
    }
  }

  /**
   * <p>Describes an action to write data to an Amazon Kinesis stream.</p>
   */
  @js.native
  trait KinesisAction extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var streamName: js.UndefOr[StreamName]
    var partitionKey: js.UndefOr[PartitionKey]
  }

  object KinesisAction {
    def apply(
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      streamName: js.UndefOr[StreamName] = js.undefined,
      partitionKey: js.UndefOr[PartitionKey] = js.undefined): KinesisAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "streamName" -> streamName.map { x => x.asInstanceOf[js.Any] },
        "partitionKey" -> partitionKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisAction]
    }
  }

  /**
   * <p>Describes an action to invoke a Lambda function.</p>
   */
  @js.native
  trait LambdaAction extends js.Object {
    var functionArn: js.UndefOr[FunctionArn]
  }

  object LambdaAction {
    def apply(
      functionArn: js.UndefOr[FunctionArn] = js.undefined): LambdaAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "functionArn" -> functionArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaAction]
    }
  }

  @js.native
  trait ListActiveViolationsRequest extends js.Object {
    var thingName: js.UndefOr[ThingName]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListActiveViolationsRequest {
    def apply(
      thingName: js.UndefOr[ThingName] = js.undefined,
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListActiveViolationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActiveViolationsRequest]
    }
  }

  @js.native
  trait ListActiveViolationsResponse extends js.Object {
    var activeViolations: js.UndefOr[ActiveViolations]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListActiveViolationsResponse {
    def apply(
      activeViolations: js.UndefOr[ActiveViolations] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListActiveViolationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activeViolations" -> activeViolations.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActiveViolationsResponse]
    }
  }

  @js.native
  trait ListAttachedPoliciesRequest extends js.Object {
    var target: js.UndefOr[PolicyTarget]
    var recursive: js.UndefOr[Recursive]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListAttachedPoliciesRequest {
    def apply(
      target: js.UndefOr[PolicyTarget] = js.undefined,
      recursive: js.UndefOr[Recursive] = js.undefined,
      marker: js.UndefOr[Marker] = js.undefined,
      pageSize: js.UndefOr[PageSize] = js.undefined): ListAttachedPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "target" -> target.map { x => x.asInstanceOf[js.Any] },
        "recursive" -> recursive.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] },
        "pageSize" -> pageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedPoliciesRequest]
    }
  }

  @js.native
  trait ListAttachedPoliciesResponse extends js.Object {
    var policies: js.UndefOr[Policies]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListAttachedPoliciesResponse {
    def apply(
      policies: js.UndefOr[Policies] = js.undefined,
      nextMarker: js.UndefOr[Marker] = js.undefined): ListAttachedPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policies" -> policies.map { x => x.asInstanceOf[js.Any] },
        "nextMarker" -> nextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedPoliciesResponse]
    }
  }

  @js.native
  trait ListAuditFindingsRequest extends js.Object {
    var startTime: js.UndefOr[Timestamp]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var endTime: js.UndefOr[Timestamp]
    var taskId: js.UndefOr[AuditTaskId]
    var resourceIdentifier: js.UndefOr[ResourceIdentifier]
    var checkName: js.UndefOr[AuditCheckName]
  }

  object ListAuditFindingsRequest {
    def apply(
      startTime: js.UndefOr[Timestamp] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      endTime: js.UndefOr[Timestamp] = js.undefined,
      taskId: js.UndefOr[AuditTaskId] = js.undefined,
      resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
      checkName: js.UndefOr[AuditCheckName] = js.undefined): ListAuditFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] },
        "resourceIdentifier" -> resourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "checkName" -> checkName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAuditFindingsRequest]
    }
  }

  @js.native
  trait ListAuditFindingsResponse extends js.Object {
    var findings: js.UndefOr[AuditFindings]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAuditFindingsResponse {
    def apply(
      findings: js.UndefOr[AuditFindings] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListAuditFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "findings" -> findings.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAuditFindingsResponse]
    }
  }

  @js.native
  trait ListAuditTasksRequest extends js.Object {
    var startTime: js.UndefOr[Timestamp]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var endTime: js.UndefOr[Timestamp]
    var taskStatus: js.UndefOr[AuditTaskStatus]
    var taskType: js.UndefOr[AuditTaskType]
  }

  object ListAuditTasksRequest {
    def apply(
      startTime: js.UndefOr[Timestamp] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      endTime: js.UndefOr[Timestamp] = js.undefined,
      taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined,
      taskType: js.UndefOr[AuditTaskType] = js.undefined): ListAuditTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "taskStatus" -> taskStatus.map { x => x.asInstanceOf[js.Any] },
        "taskType" -> taskType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAuditTasksRequest]
    }
  }

  @js.native
  trait ListAuditTasksResponse extends js.Object {
    var tasks: js.UndefOr[AuditTaskMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAuditTasksResponse {
    def apply(
      tasks: js.UndefOr[AuditTaskMetadataList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListAuditTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tasks" -> tasks.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAuditTasksResponse]
    }
  }

  @js.native
  trait ListAuthorizersRequest extends js.Object {
    var pageSize: js.UndefOr[PageSize]
    var marker: js.UndefOr[Marker]
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var status: js.UndefOr[AuthorizerStatus]
  }

  object ListAuthorizersRequest {
    def apply(
      pageSize: js.UndefOr[PageSize] = js.undefined,
      marker: js.UndefOr[Marker] = js.undefined,
      ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
      status: js.UndefOr[AuthorizerStatus] = js.undefined): ListAuthorizersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageSize" -> pageSize.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] },
        "ascendingOrder" -> ascendingOrder.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAuthorizersRequest]
    }
  }

  @js.native
  trait ListAuthorizersResponse extends js.Object {
    var authorizers: js.UndefOr[Authorizers]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListAuthorizersResponse {
    def apply(
      authorizers: js.UndefOr[Authorizers] = js.undefined,
      nextMarker: js.UndefOr[Marker] = js.undefined): ListAuthorizersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizers" -> authorizers.map { x => x.asInstanceOf[js.Any] },
        "nextMarker" -> nextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAuthorizersResponse]
    }
  }

  @js.native
  trait ListBillingGroupsRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[RegistryMaxResults]
    var namePrefixFilter: js.UndefOr[BillingGroupName]
  }

  object ListBillingGroupsRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
      namePrefixFilter: js.UndefOr[BillingGroupName] = js.undefined): ListBillingGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "namePrefixFilter" -> namePrefixFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBillingGroupsRequest]
    }
  }

  @js.native
  trait ListBillingGroupsResponse extends js.Object {
    var billingGroups: js.UndefOr[BillingGroupNameAndArnList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBillingGroupsResponse {
    def apply(
      billingGroups: js.UndefOr[BillingGroupNameAndArnList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListBillingGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroups" -> billingGroups.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBillingGroupsResponse]
    }
  }

  /**
   * <p>Input for the ListCACertificates operation.</p>
   */
  @js.native
  trait ListCACertificatesRequest extends js.Object {
    var pageSize: js.UndefOr[PageSize]
    var marker: js.UndefOr[Marker]
    var ascendingOrder: js.UndefOr[AscendingOrder]
  }

  object ListCACertificatesRequest {
    def apply(
      pageSize: js.UndefOr[PageSize] = js.undefined,
      marker: js.UndefOr[Marker] = js.undefined,
      ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined): ListCACertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageSize" -> pageSize.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] },
        "ascendingOrder" -> ascendingOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCACertificatesRequest]
    }
  }

  /**
   * <p>The output from the ListCACertificates operation.</p>
   */
  @js.native
  trait ListCACertificatesResponse extends js.Object {
    var certificates: js.UndefOr[CACertificates]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListCACertificatesResponse {
    def apply(
      certificates: js.UndefOr[CACertificates] = js.undefined,
      nextMarker: js.UndefOr[Marker] = js.undefined): ListCACertificatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificates" -> certificates.map { x => x.asInstanceOf[js.Any] },
        "nextMarker" -> nextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCACertificatesResponse]
    }
  }

  /**
   * <p>The input to the ListCertificatesByCA operation.</p>
   */
  @js.native
  trait ListCertificatesByCARequest extends js.Object {
    var caCertificateId: js.UndefOr[CertificateId]
    var pageSize: js.UndefOr[PageSize]
    var marker: js.UndefOr[Marker]
    var ascendingOrder: js.UndefOr[AscendingOrder]
  }

  object ListCertificatesByCARequest {
    def apply(
      caCertificateId: js.UndefOr[CertificateId] = js.undefined,
      pageSize: js.UndefOr[PageSize] = js.undefined,
      marker: js.UndefOr[Marker] = js.undefined,
      ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined): ListCertificatesByCARequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "caCertificateId" -> caCertificateId.map { x => x.asInstanceOf[js.Any] },
        "pageSize" -> pageSize.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] },
        "ascendingOrder" -> ascendingOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCertificatesByCARequest]
    }
  }

  /**
   * <p>The output of the ListCertificatesByCA operation.</p>
   */
  @js.native
  trait ListCertificatesByCAResponse extends js.Object {
    var certificates: js.UndefOr[Certificates]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListCertificatesByCAResponse {
    def apply(
      certificates: js.UndefOr[Certificates] = js.undefined,
      nextMarker: js.UndefOr[Marker] = js.undefined): ListCertificatesByCAResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificates" -> certificates.map { x => x.asInstanceOf[js.Any] },
        "nextMarker" -> nextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCertificatesByCAResponse]
    }
  }

  /**
   * <p>The input for the ListCertificates operation.</p>
   */
  @js.native
  trait ListCertificatesRequest extends js.Object {
    var pageSize: js.UndefOr[PageSize]
    var marker: js.UndefOr[Marker]
    var ascendingOrder: js.UndefOr[AscendingOrder]
  }

  object ListCertificatesRequest {
    def apply(
      pageSize: js.UndefOr[PageSize] = js.undefined,
      marker: js.UndefOr[Marker] = js.undefined,
      ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined): ListCertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageSize" -> pageSize.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] },
        "ascendingOrder" -> ascendingOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCertificatesRequest]
    }
  }

  /**
   * <p>The output of the ListCertificates operation.</p>
   */
  @js.native
  trait ListCertificatesResponse extends js.Object {
    var certificates: js.UndefOr[Certificates]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListCertificatesResponse {
    def apply(
      certificates: js.UndefOr[Certificates] = js.undefined,
      nextMarker: js.UndefOr[Marker] = js.undefined): ListCertificatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificates" -> certificates.map { x => x.asInstanceOf[js.Any] },
        "nextMarker" -> nextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCertificatesResponse]
    }
  }

  @js.native
  trait ListIndicesRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[QueryMaxResults]
  }

  object ListIndicesRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[QueryMaxResults] = js.undefined): ListIndicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIndicesRequest]
    }
  }

  @js.native
  trait ListIndicesResponse extends js.Object {
    var indexNames: js.UndefOr[IndexNamesList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListIndicesResponse {
    def apply(
      indexNames: js.UndefOr[IndexNamesList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListIndicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "indexNames" -> indexNames.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIndicesResponse]
    }
  }

  @js.native
  trait ListJobExecutionsForJobRequest extends js.Object {
    var jobId: js.UndefOr[JobId]
    var status: js.UndefOr[JobExecutionStatus]
    var maxResults: js.UndefOr[LaserMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobExecutionsForJobRequest {
    def apply(
      jobId: js.UndefOr[JobId] = js.undefined,
      status: js.UndefOr[JobExecutionStatus] = js.undefined,
      maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListJobExecutionsForJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobExecutionsForJobRequest]
    }
  }

  @js.native
  trait ListJobExecutionsForJobResponse extends js.Object {
    var executionSummaries: js.UndefOr[JobExecutionSummaryForJobList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobExecutionsForJobResponse {
    def apply(
      executionSummaries: js.UndefOr[JobExecutionSummaryForJobList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListJobExecutionsForJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionSummaries" -> executionSummaries.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobExecutionsForJobResponse]
    }
  }

  @js.native
  trait ListJobExecutionsForThingRequest extends js.Object {
    var thingName: js.UndefOr[ThingName]
    var status: js.UndefOr[JobExecutionStatus]
    var maxResults: js.UndefOr[LaserMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobExecutionsForThingRequest {
    def apply(
      thingName: js.UndefOr[ThingName] = js.undefined,
      status: js.UndefOr[JobExecutionStatus] = js.undefined,
      maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListJobExecutionsForThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobExecutionsForThingRequest]
    }
  }

  @js.native
  trait ListJobExecutionsForThingResponse extends js.Object {
    var executionSummaries: js.UndefOr[JobExecutionSummaryForThingList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobExecutionsForThingResponse {
    def apply(
      executionSummaries: js.UndefOr[JobExecutionSummaryForThingList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListJobExecutionsForThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionSummaries" -> executionSummaries.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobExecutionsForThingResponse]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var maxResults: js.UndefOr[LaserMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var status: js.UndefOr[JobStatus]
    var targetSelection: js.UndefOr[TargetSelection]
  }

  object ListJobsRequest {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
      status: js.UndefOr[JobStatus] = js.undefined,
      targetSelection: js.UndefOr[TargetSelection] = js.undefined): ListJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "thingGroupId" -> thingGroupId.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "targetSelection" -> targetSelection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResponse extends js.Object {
    var jobs: js.UndefOr[JobSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobsResponse {
    def apply(
      jobs: js.UndefOr[JobSummaryList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobs" -> jobs.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsResponse]
    }
  }

  @js.native
  trait ListOTAUpdatesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var otaUpdateStatus: js.UndefOr[OTAUpdateStatus]
  }

  object ListOTAUpdatesRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined): ListOTAUpdatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "otaUpdateStatus" -> otaUpdateStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOTAUpdatesRequest]
    }
  }

  @js.native
  trait ListOTAUpdatesResponse extends js.Object {
    var otaUpdates: js.UndefOr[OTAUpdatesSummary]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListOTAUpdatesResponse {
    def apply(
      otaUpdates: js.UndefOr[OTAUpdatesSummary] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListOTAUpdatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "otaUpdates" -> otaUpdates.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOTAUpdatesResponse]
    }
  }

  /**
   * <p>The input to the ListOutgoingCertificates operation.</p>
   */
  @js.native
  trait ListOutgoingCertificatesRequest extends js.Object {
    var pageSize: js.UndefOr[PageSize]
    var marker: js.UndefOr[Marker]
    var ascendingOrder: js.UndefOr[AscendingOrder]
  }

  object ListOutgoingCertificatesRequest {
    def apply(
      pageSize: js.UndefOr[PageSize] = js.undefined,
      marker: js.UndefOr[Marker] = js.undefined,
      ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined): ListOutgoingCertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageSize" -> pageSize.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] },
        "ascendingOrder" -> ascendingOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOutgoingCertificatesRequest]
    }
  }

  /**
   * <p>The output from the ListOutgoingCertificates operation.</p>
   */
  @js.native
  trait ListOutgoingCertificatesResponse extends js.Object {
    var outgoingCertificates: js.UndefOr[OutgoingCertificates]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListOutgoingCertificatesResponse {
    def apply(
      outgoingCertificates: js.UndefOr[OutgoingCertificates] = js.undefined,
      nextMarker: js.UndefOr[Marker] = js.undefined): ListOutgoingCertificatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "outgoingCertificates" -> outgoingCertificates.map { x => x.asInstanceOf[js.Any] },
        "nextMarker" -> nextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOutgoingCertificatesResponse]
    }
  }

  /**
   * <p>The input for the ListPolicies operation.</p>
   */
  @js.native
  trait ListPoliciesRequest extends js.Object {
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
    var ascendingOrder: js.UndefOr[AscendingOrder]
  }

  object ListPoliciesRequest {
    def apply(
      marker: js.UndefOr[Marker] = js.undefined,
      pageSize: js.UndefOr[PageSize] = js.undefined,
      ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined): ListPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] },
        "pageSize" -> pageSize.map { x => x.asInstanceOf[js.Any] },
        "ascendingOrder" -> ascendingOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesRequest]
    }
  }

  /**
   * <p>The output from the ListPolicies operation.</p>
   */
  @js.native
  trait ListPoliciesResponse extends js.Object {
    var policies: js.UndefOr[Policies]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListPoliciesResponse {
    def apply(
      policies: js.UndefOr[Policies] = js.undefined,
      nextMarker: js.UndefOr[Marker] = js.undefined): ListPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policies" -> policies.map { x => x.asInstanceOf[js.Any] },
        "nextMarker" -> nextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesResponse]
    }
  }

  /**
   * <p>The input for the ListPolicyPrincipals operation.</p>
   */
  @js.native
  trait ListPolicyPrincipalsRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
    var ascendingOrder: js.UndefOr[AscendingOrder]
  }

  object ListPolicyPrincipalsRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      marker: js.UndefOr[Marker] = js.undefined,
      pageSize: js.UndefOr[PageSize] = js.undefined,
      ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined): ListPolicyPrincipalsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] },
        "pageSize" -> pageSize.map { x => x.asInstanceOf[js.Any] },
        "ascendingOrder" -> ascendingOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyPrincipalsRequest]
    }
  }

  /**
   * <p>The output from the ListPolicyPrincipals operation.</p>
   */
  @js.native
  trait ListPolicyPrincipalsResponse extends js.Object {
    var principals: js.UndefOr[Principals]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListPolicyPrincipalsResponse {
    def apply(
      principals: js.UndefOr[Principals] = js.undefined,
      nextMarker: js.UndefOr[Marker] = js.undefined): ListPolicyPrincipalsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "principals" -> principals.map { x => x.asInstanceOf[js.Any] },
        "nextMarker" -> nextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyPrincipalsResponse]
    }
  }

  /**
   * <p>The input for the ListPolicyVersions operation.</p>
   */
  @js.native
  trait ListPolicyVersionsRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
  }

  object ListPolicyVersionsRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined): ListPolicyVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyVersionsRequest]
    }
  }

  /**
   * <p>The output from the ListPolicyVersions operation.</p>
   */
  @js.native
  trait ListPolicyVersionsResponse extends js.Object {
    var policyVersions: js.UndefOr[PolicyVersions]
  }

  object ListPolicyVersionsResponse {
    def apply(
      policyVersions: js.UndefOr[PolicyVersions] = js.undefined): ListPolicyVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyVersions" -> policyVersions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyVersionsResponse]
    }
  }

  /**
   * <p>The input for the ListPrincipalPolicies operation.</p>
   */
  @js.native
  trait ListPrincipalPoliciesRequest extends js.Object {
    var principal: js.UndefOr[Principal]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
    var ascendingOrder: js.UndefOr[AscendingOrder]
  }

  object ListPrincipalPoliciesRequest {
    def apply(
      principal: js.UndefOr[Principal] = js.undefined,
      marker: js.UndefOr[Marker] = js.undefined,
      pageSize: js.UndefOr[PageSize] = js.undefined,
      ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined): ListPrincipalPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "principal" -> principal.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] },
        "pageSize" -> pageSize.map { x => x.asInstanceOf[js.Any] },
        "ascendingOrder" -> ascendingOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalPoliciesRequest]
    }
  }

  /**
   * <p>The output from the ListPrincipalPolicies operation.</p>
   */
  @js.native
  trait ListPrincipalPoliciesResponse extends js.Object {
    var policies: js.UndefOr[Policies]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListPrincipalPoliciesResponse {
    def apply(
      policies: js.UndefOr[Policies] = js.undefined,
      nextMarker: js.UndefOr[Marker] = js.undefined): ListPrincipalPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policies" -> policies.map { x => x.asInstanceOf[js.Any] },
        "nextMarker" -> nextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalPoliciesResponse]
    }
  }

  /**
   * <p>The input for the ListPrincipalThings operation.</p>
   */
  @js.native
  trait ListPrincipalThingsRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[RegistryMaxResults]
    var principal: js.UndefOr[Principal]
  }

  object ListPrincipalThingsRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
      principal: js.UndefOr[Principal] = js.undefined): ListPrincipalThingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "principal" -> principal.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalThingsRequest]
    }
  }

  /**
   * <p>The output from the ListPrincipalThings operation.</p>
   */
  @js.native
  trait ListPrincipalThingsResponse extends js.Object {
    var things: js.UndefOr[ThingNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPrincipalThingsResponse {
    def apply(
      things: js.UndefOr[ThingNameList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListPrincipalThingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "things" -> things.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalThingsResponse]
    }
  }

  @js.native
  trait ListRoleAliasesRequest extends js.Object {
    var pageSize: js.UndefOr[PageSize]
    var marker: js.UndefOr[Marker]
    var ascendingOrder: js.UndefOr[AscendingOrder]
  }

  object ListRoleAliasesRequest {
    def apply(
      pageSize: js.UndefOr[PageSize] = js.undefined,
      marker: js.UndefOr[Marker] = js.undefined,
      ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined): ListRoleAliasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageSize" -> pageSize.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] },
        "ascendingOrder" -> ascendingOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRoleAliasesRequest]
    }
  }

  @js.native
  trait ListRoleAliasesResponse extends js.Object {
    var roleAliases: js.UndefOr[RoleAliases]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListRoleAliasesResponse {
    def apply(
      roleAliases: js.UndefOr[RoleAliases] = js.undefined,
      nextMarker: js.UndefOr[Marker] = js.undefined): ListRoleAliasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAliases" -> roleAliases.map { x => x.asInstanceOf[js.Any] },
        "nextMarker" -> nextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRoleAliasesResponse]
    }
  }

  @js.native
  trait ListScheduledAuditsRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListScheduledAuditsRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListScheduledAuditsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListScheduledAuditsRequest]
    }
  }

  @js.native
  trait ListScheduledAuditsResponse extends js.Object {
    var scheduledAudits: js.UndefOr[ScheduledAuditMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListScheduledAuditsResponse {
    def apply(
      scheduledAudits: js.UndefOr[ScheduledAuditMetadataList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListScheduledAuditsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAudits" -> scheduledAudits.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListScheduledAuditsResponse]
    }
  }

  @js.native
  trait ListSecurityProfilesForTargetRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
    var recursive: js.UndefOr[Recursive]
    var securityProfileTargetArn: js.UndefOr[SecurityProfileTargetArn]
  }

  object ListSecurityProfilesForTargetRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      recursive: js.UndefOr[Recursive] = js.undefined,
      securityProfileTargetArn: js.UndefOr[SecurityProfileTargetArn] = js.undefined): ListSecurityProfilesForTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "recursive" -> recursive.map { x => x.asInstanceOf[js.Any] },
        "securityProfileTargetArn" -> securityProfileTargetArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityProfilesForTargetRequest]
    }
  }

  @js.native
  trait ListSecurityProfilesForTargetResponse extends js.Object {
    var securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSecurityProfilesForTargetResponse {
    def apply(
      securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListSecurityProfilesForTargetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileTargetMappings" -> securityProfileTargetMappings.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityProfilesForTargetResponse]
    }
  }

  @js.native
  trait ListSecurityProfilesRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListSecurityProfilesRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListSecurityProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityProfilesRequest]
    }
  }

  @js.native
  trait ListSecurityProfilesResponse extends js.Object {
    var securityProfileIdentifiers: js.UndefOr[SecurityProfileIdentifiers]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSecurityProfilesResponse {
    def apply(
      securityProfileIdentifiers: js.UndefOr[SecurityProfileIdentifiers] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListSecurityProfilesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileIdentifiers" -> securityProfileIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityProfilesResponse]
    }
  }

  @js.native
  trait ListStreamsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var ascendingOrder: js.UndefOr[AscendingOrder]
  }

  object ListStreamsRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined): ListStreamsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "ascendingOrder" -> ascendingOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsRequest]
    }
  }

  @js.native
  trait ListStreamsResponse extends js.Object {
    var streams: js.UndefOr[StreamsSummary]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListStreamsResponse {
    def apply(
      streams: js.UndefOr[StreamsSummary] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListStreamsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streams" -> streams.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: js.UndefOr[ResourceArn]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    def apply(
      resourceArn: js.UndefOr[ResourceArn] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceResponse {
    def apply(
      tags: js.UndefOr[TagList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTargetsForPolicyRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListTargetsForPolicyRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      marker: js.UndefOr[Marker] = js.undefined,
      pageSize: js.UndefOr[PageSize] = js.undefined): ListTargetsForPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "marker" -> marker.map { x => x.asInstanceOf[js.Any] },
        "pageSize" -> pageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsForPolicyRequest]
    }
  }

  @js.native
  trait ListTargetsForPolicyResponse extends js.Object {
    var targets: js.UndefOr[PolicyTargets]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListTargetsForPolicyResponse {
    def apply(
      targets: js.UndefOr[PolicyTargets] = js.undefined,
      nextMarker: js.UndefOr[Marker] = js.undefined): ListTargetsForPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targets" -> targets.map { x => x.asInstanceOf[js.Any] },
        "nextMarker" -> nextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsForPolicyResponse]
    }
  }

  @js.native
  trait ListTargetsForSecurityProfileRequest extends js.Object {
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListTargetsForSecurityProfileRequest {
    def apply(
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListTargetsForSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsForSecurityProfileRequest]
    }
  }

  @js.native
  trait ListTargetsForSecurityProfileResponse extends js.Object {
    var securityProfileTargets: js.UndefOr[SecurityProfileTargets]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTargetsForSecurityProfileResponse {
    def apply(
      securityProfileTargets: js.UndefOr[SecurityProfileTargets] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListTargetsForSecurityProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileTargets" -> securityProfileTargets.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsForSecurityProfileResponse]
    }
  }

  @js.native
  trait ListThingGroupsForThingRequest extends js.Object {
    var thingName: js.UndefOr[ThingName]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[RegistryMaxResults]
  }

  object ListThingGroupsForThingRequest {
    def apply(
      thingName: js.UndefOr[ThingName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[RegistryMaxResults] = js.undefined): ListThingGroupsForThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingGroupsForThingRequest]
    }
  }

  @js.native
  trait ListThingGroupsForThingResponse extends js.Object {
    var thingGroups: js.UndefOr[ThingGroupNameAndArnList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingGroupsForThingResponse {
    def apply(
      thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListThingGroupsForThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroups" -> thingGroups.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingGroupsForThingResponse]
    }
  }

  @js.native
  trait ListThingGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[RegistryMaxResults]
    var recursive: js.UndefOr[RecursiveWithoutDefault]
    var nextToken: js.UndefOr[NextToken]
    var namePrefixFilter: js.UndefOr[ThingGroupName]
    var parentGroup: js.UndefOr[ThingGroupName]
  }

  object ListThingGroupsRequest {
    def apply(
      maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
      recursive: js.UndefOr[RecursiveWithoutDefault] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      namePrefixFilter: js.UndefOr[ThingGroupName] = js.undefined,
      parentGroup: js.UndefOr[ThingGroupName] = js.undefined): ListThingGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "recursive" -> recursive.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "namePrefixFilter" -> namePrefixFilter.map { x => x.asInstanceOf[js.Any] },
        "parentGroup" -> parentGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingGroupsRequest]
    }
  }

  @js.native
  trait ListThingGroupsResponse extends js.Object {
    var thingGroups: js.UndefOr[ThingGroupNameAndArnList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingGroupsResponse {
    def apply(
      thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListThingGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroups" -> thingGroups.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingGroupsResponse]
    }
  }

  /**
   * <p>The input for the ListThingPrincipal operation.</p>
   */
  @js.native
  trait ListThingPrincipalsRequest extends js.Object {
    var thingName: js.UndefOr[ThingName]
  }

  object ListThingPrincipalsRequest {
    def apply(
      thingName: js.UndefOr[ThingName] = js.undefined): ListThingPrincipalsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingPrincipalsRequest]
    }
  }

  /**
   * <p>The output from the ListThingPrincipals operation.</p>
   */
  @js.native
  trait ListThingPrincipalsResponse extends js.Object {
    var principals: js.UndefOr[Principals]
  }

  object ListThingPrincipalsResponse {
    def apply(
      principals: js.UndefOr[Principals] = js.undefined): ListThingPrincipalsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "principals" -> principals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingPrincipalsResponse]
    }
  }

  @js.native
  trait ListThingRegistrationTaskReportsRequest extends js.Object {
    var taskId: js.UndefOr[TaskId]
    var reportType: js.UndefOr[ReportType]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[RegistryMaxResults]
  }

  object ListThingRegistrationTaskReportsRequest {
    def apply(
      taskId: js.UndefOr[TaskId] = js.undefined,
      reportType: js.UndefOr[ReportType] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[RegistryMaxResults] = js.undefined): ListThingRegistrationTaskReportsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] },
        "reportType" -> reportType.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingRegistrationTaskReportsRequest]
    }
  }

  @js.native
  trait ListThingRegistrationTaskReportsResponse extends js.Object {
    var resourceLinks: js.UndefOr[S3FileUrlList]
    var reportType: js.UndefOr[ReportType]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingRegistrationTaskReportsResponse {
    def apply(
      resourceLinks: js.UndefOr[S3FileUrlList] = js.undefined,
      reportType: js.UndefOr[ReportType] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListThingRegistrationTaskReportsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceLinks" -> resourceLinks.map { x => x.asInstanceOf[js.Any] },
        "reportType" -> reportType.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingRegistrationTaskReportsResponse]
    }
  }

  @js.native
  trait ListThingRegistrationTasksRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[RegistryMaxResults]
    var status: js.UndefOr[Status]
  }

  object ListThingRegistrationTasksRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
      status: js.UndefOr[Status] = js.undefined): ListThingRegistrationTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingRegistrationTasksRequest]
    }
  }

  @js.native
  trait ListThingRegistrationTasksResponse extends js.Object {
    var taskIds: js.UndefOr[TaskIdList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingRegistrationTasksResponse {
    def apply(
      taskIds: js.UndefOr[TaskIdList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListThingRegistrationTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskIds" -> taskIds.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingRegistrationTasksResponse]
    }
  }

  /**
   * <p>The input for the ListThingTypes operation.</p>
   */
  @js.native
  trait ListThingTypesRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[RegistryMaxResults]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  object ListThingTypesRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined): ListThingTypesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingTypesRequest]
    }
  }

  /**
   * <p>The output for the ListThingTypes operation.</p>
   */
  @js.native
  trait ListThingTypesResponse extends js.Object {
    var thingTypes: js.UndefOr[ThingTypeList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingTypesResponse {
    def apply(
      thingTypes: js.UndefOr[ThingTypeList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListThingTypesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypes" -> thingTypes.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingTypesResponse]
    }
  }

  @js.native
  trait ListThingsInBillingGroupRequest extends js.Object {
    var billingGroupName: js.UndefOr[BillingGroupName]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[RegistryMaxResults]
  }

  object ListThingsInBillingGroupRequest {
    def apply(
      billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[RegistryMaxResults] = js.undefined): ListThingsInBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName" -> billingGroupName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingsInBillingGroupRequest]
    }
  }

  @js.native
  trait ListThingsInBillingGroupResponse extends js.Object {
    var things: js.UndefOr[ThingNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingsInBillingGroupResponse {
    def apply(
      things: js.UndefOr[ThingNameList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListThingsInBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "things" -> things.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingsInBillingGroupResponse]
    }
  }

  @js.native
  trait ListThingsInThingGroupRequest extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var recursive: js.UndefOr[Recursive]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[RegistryMaxResults]
  }

  object ListThingsInThingGroupRequest {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      recursive: js.UndefOr[Recursive] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[RegistryMaxResults] = js.undefined): ListThingsInThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "recursive" -> recursive.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingsInThingGroupRequest]
    }
  }

  @js.native
  trait ListThingsInThingGroupResponse extends js.Object {
    var things: js.UndefOr[ThingNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingsInThingGroupResponse {
    def apply(
      things: js.UndefOr[ThingNameList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListThingsInThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "things" -> things.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingsInThingGroupResponse]
    }
  }

  /**
   * <p>The input for the ListThings operation.</p>
   */
  @js.native
  trait ListThingsRequest extends js.Object {
    var maxResults: js.UndefOr[RegistryMaxResults]
    var attributeValue: js.UndefOr[AttributeValue]
    var nextToken: js.UndefOr[NextToken]
    var attributeName: js.UndefOr[AttributeName]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  object ListThingsRequest {
    def apply(
      maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
      attributeValue: js.UndefOr[AttributeValue] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      attributeName: js.UndefOr[AttributeName] = js.undefined,
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined): ListThingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "attributeValue" -> attributeValue.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "attributeName" -> attributeName.map { x => x.asInstanceOf[js.Any] },
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingsRequest]
    }
  }

  /**
   * <p>The output from the ListThings operation.</p>
   */
  @js.native
  trait ListThingsResponse extends js.Object {
    var things: js.UndefOr[ThingAttributeList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingsResponse {
    def apply(
      things: js.UndefOr[ThingAttributeList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListThingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "things" -> things.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingsResponse]
    }
  }

  /**
   * <p>The input for the ListTopicRules operation.</p>
   */
  @js.native
  trait ListTopicRulesRequest extends js.Object {
    var topic: js.UndefOr[Topic]
    var maxResults: js.UndefOr[GEMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var ruleDisabled: js.UndefOr[IsDisabled]
  }

  object ListTopicRulesRequest {
    def apply(
      topic: js.UndefOr[Topic] = js.undefined,
      maxResults: js.UndefOr[GEMaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      ruleDisabled: js.UndefOr[IsDisabled] = js.undefined): ListTopicRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "topic" -> topic.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "ruleDisabled" -> ruleDisabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTopicRulesRequest]
    }
  }

  /**
   * <p>The output from the ListTopicRules operation.</p>
   */
  @js.native
  trait ListTopicRulesResponse extends js.Object {
    var rules: js.UndefOr[TopicRuleList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTopicRulesResponse {
    def apply(
      rules: js.UndefOr[TopicRuleList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListTopicRulesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rules" -> rules.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTopicRulesResponse]
    }
  }

  @js.native
  trait ListV2LoggingLevelsRequest extends js.Object {
    var targetType: js.UndefOr[LogTargetType]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[SkyfallMaxResults]
  }

  object ListV2LoggingLevelsRequest {
    def apply(
      targetType: js.UndefOr[LogTargetType] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[SkyfallMaxResults] = js.undefined): ListV2LoggingLevelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetType" -> targetType.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListV2LoggingLevelsRequest]
    }
  }

  @js.native
  trait ListV2LoggingLevelsResponse extends js.Object {
    var logTargetConfigurations: js.UndefOr[LogTargetConfigurations]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListV2LoggingLevelsResponse {
    def apply(
      logTargetConfigurations: js.UndefOr[LogTargetConfigurations] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListV2LoggingLevelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logTargetConfigurations" -> logTargetConfigurations.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListV2LoggingLevelsResponse]
    }
  }

  @js.native
  trait ListViolationEventsRequest extends js.Object {
    var startTime: js.UndefOr[Timestamp]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var thingName: js.UndefOr[ThingName]
    var endTime: js.UndefOr[Timestamp]
    var securityProfileName: js.UndefOr[SecurityProfileName]
  }

  object ListViolationEventsRequest {
    def apply(
      startTime: js.UndefOr[Timestamp] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      endTime: js.UndefOr[Timestamp] = js.undefined,
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined): ListViolationEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListViolationEventsRequest]
    }
  }

  @js.native
  trait ListViolationEventsResponse extends js.Object {
    var violationEvents: js.UndefOr[ViolationEvents]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListViolationEventsResponse {
    def apply(
      violationEvents: js.UndefOr[ViolationEvents] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListViolationEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "violationEvents" -> violationEvents.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListViolationEventsResponse]
    }
  }

  object LogLevelEnum {
    val DEBUG = "DEBUG"
    val INFO = "INFO"
    val ERROR = "ERROR"
    val WARN = "WARN"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(DEBUG, INFO, ERROR, WARN, DISABLED)
  }

  /**
   * <p>A log target.</p>
   */
  @js.native
  trait LogTarget extends js.Object {
    var targetType: js.UndefOr[LogTargetType]
    var targetName: js.UndefOr[LogTargetName]
  }

  object LogTarget {
    def apply(
      targetType: js.UndefOr[LogTargetType] = js.undefined,
      targetName: js.UndefOr[LogTargetName] = js.undefined): LogTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetType" -> targetType.map { x => x.asInstanceOf[js.Any] },
        "targetName" -> targetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogTarget]
    }
  }

  /**
   * <p>The target configuration.</p>
   */
  @js.native
  trait LogTargetConfiguration extends js.Object {
    var logTarget: js.UndefOr[LogTarget]
    var logLevel: js.UndefOr[LogLevel]
  }

  object LogTargetConfiguration {
    def apply(
      logTarget: js.UndefOr[LogTarget] = js.undefined,
      logLevel: js.UndefOr[LogLevel] = js.undefined): LogTargetConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logTarget" -> logTarget.map { x => x.asInstanceOf[js.Any] },
        "logLevel" -> logLevel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogTargetConfiguration]
    }
  }

  object LogTargetTypeEnum {
    val DEFAULT = "DEFAULT"
    val THING_GROUP = "THING_GROUP"

    val values = IndexedSeq(DEFAULT, THING_GROUP)
  }

  /**
   * <p>Describes the logging options payload.</p>
   */
  @js.native
  trait LoggingOptionsPayload extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var logLevel: js.UndefOr[LogLevel]
  }

  object LoggingOptionsPayload {
    def apply(
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      logLevel: js.UndefOr[LogLevel] = js.undefined): LoggingOptionsPayload = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "logLevel" -> logLevel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggingOptionsPayload]
    }
  }

  object MessageFormatEnum {
    val RAW = "RAW"
    val JSON = "JSON"

    val values = IndexedSeq(RAW, JSON)
  }

  /**
   * <p>The value to be compared with the <code>metric</code>.</p>
   */
  @js.native
  trait MetricValue extends js.Object {
    var count: js.UndefOr[UnsignedLong]
    var cidrs: js.UndefOr[Cidrs]
    var ports: js.UndefOr[Ports]
  }

  object MetricValue {
    def apply(
      count: js.UndefOr[UnsignedLong] = js.undefined,
      cidrs: js.UndefOr[Cidrs] = js.undefined,
      ports: js.UndefOr[Ports] = js.undefined): MetricValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "count" -> count.map { x => x.asInstanceOf[js.Any] },
        "cidrs" -> cidrs.map { x => x.asInstanceOf[js.Any] },
        "ports" -> ports.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricValue]
    }
  }

  /**
   * <p>Information about the resource that was non-compliant with the audit check.</p>
   */
  @js.native
  trait NonCompliantResource extends js.Object {
    var resourceType: js.UndefOr[ResourceType]
    var resourceIdentifier: js.UndefOr[ResourceIdentifier]
    var additionalInfo: js.UndefOr[StringMap]
  }

  object NonCompliantResource {
    def apply(
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
      additionalInfo: js.UndefOr[StringMap] = js.undefined): NonCompliantResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "resourceIdentifier" -> resourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "additionalInfo" -> additionalInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NonCompliantResource]
    }
  }

  /**
   * <p>Describes a file to be associated with an OTA update.</p>
   */
  @js.native
  trait OTAUpdateFile extends js.Object {
    var codeSigning: js.UndefOr[CodeSigning]
    var fileName: js.UndefOr[FileName]
    var attributes: js.UndefOr[AttributesMap]
    var fileLocation: js.UndefOr[FileLocation]
    var fileVersion: js.UndefOr[OTAUpdateFileVersion]
  }

  object OTAUpdateFile {
    def apply(
      codeSigning: js.UndefOr[CodeSigning] = js.undefined,
      fileName: js.UndefOr[FileName] = js.undefined,
      attributes: js.UndefOr[AttributesMap] = js.undefined,
      fileLocation: js.UndefOr[FileLocation] = js.undefined,
      fileVersion: js.UndefOr[OTAUpdateFileVersion] = js.undefined): OTAUpdateFile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "codeSigning" -> codeSigning.map { x => x.asInstanceOf[js.Any] },
        "fileName" -> fileName.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "fileLocation" -> fileLocation.map { x => x.asInstanceOf[js.Any] },
        "fileVersion" -> fileVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OTAUpdateFile]
    }
  }

  /**
   * <p>Information about an OTA update.</p>
   */
  @js.native
  trait OTAUpdateInfo extends js.Object {
    var otaUpdateStatus: js.UndefOr[OTAUpdateStatus]
    var errorInfo: js.UndefOr[ErrorInfo]
    var targets: js.UndefOr[Targets]
    var otaUpdateFiles: js.UndefOr[OTAUpdateFiles]
    var description: js.UndefOr[OTAUpdateDescription]
    var otaUpdateArn: js.UndefOr[OTAUpdateArn]
    var lastModifiedDate: js.UndefOr[DateType]
    var awsIotJobArn: js.UndefOr[AwsIotJobArn]
    var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig]
    var awsIotJobId: js.UndefOr[AwsIotJobId]
    var creationDate: js.UndefOr[DateType]
    var targetSelection: js.UndefOr[TargetSelection]
    var otaUpdateId: js.UndefOr[OTAUpdateId]
    var additionalParameters: js.UndefOr[AdditionalParameterMap]
  }

  object OTAUpdateInfo {
    def apply(
      otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined,
      errorInfo: js.UndefOr[ErrorInfo] = js.undefined,
      targets: js.UndefOr[Targets] = js.undefined,
      otaUpdateFiles: js.UndefOr[OTAUpdateFiles] = js.undefined,
      description: js.UndefOr[OTAUpdateDescription] = js.undefined,
      otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined,
      lastModifiedDate: js.UndefOr[DateType] = js.undefined,
      awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.undefined,
      awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.undefined,
      awsIotJobId: js.UndefOr[AwsIotJobId] = js.undefined,
      creationDate: js.UndefOr[DateType] = js.undefined,
      targetSelection: js.UndefOr[TargetSelection] = js.undefined,
      otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined,
      additionalParameters: js.UndefOr[AdditionalParameterMap] = js.undefined): OTAUpdateInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "otaUpdateStatus" -> otaUpdateStatus.map { x => x.asInstanceOf[js.Any] },
        "errorInfo" -> errorInfo.map { x => x.asInstanceOf[js.Any] },
        "targets" -> targets.map { x => x.asInstanceOf[js.Any] },
        "otaUpdateFiles" -> otaUpdateFiles.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "otaUpdateArn" -> otaUpdateArn.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "awsIotJobArn" -> awsIotJobArn.map { x => x.asInstanceOf[js.Any] },
        "awsJobExecutionsRolloutConfig" -> awsJobExecutionsRolloutConfig.map { x => x.asInstanceOf[js.Any] },
        "awsIotJobId" -> awsIotJobId.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "targetSelection" -> targetSelection.map { x => x.asInstanceOf[js.Any] },
        "otaUpdateId" -> otaUpdateId.map { x => x.asInstanceOf[js.Any] },
        "additionalParameters" -> additionalParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OTAUpdateInfo]
    }
  }

  object OTAUpdateStatusEnum {
    val CREATE_PENDING = "CREATE_PENDING"
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val CREATE_COMPLETE = "CREATE_COMPLETE"
    val CREATE_FAILED = "CREATE_FAILED"

    val values = IndexedSeq(CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED)
  }

  /**
   * <p>An OTA update summary.</p>
   */
  @js.native
  trait OTAUpdateSummary extends js.Object {
    var otaUpdateId: js.UndefOr[OTAUpdateId]
    var otaUpdateArn: js.UndefOr[OTAUpdateArn]
    var creationDate: js.UndefOr[DateType]
  }

  object OTAUpdateSummary {
    def apply(
      otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined,
      otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined,
      creationDate: js.UndefOr[DateType] = js.undefined): OTAUpdateSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "otaUpdateId" -> otaUpdateId.map { x => x.asInstanceOf[js.Any] },
        "otaUpdateArn" -> otaUpdateArn.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OTAUpdateSummary]
    }
  }

  /**
   * <p>A certificate that has been transferred but not yet accepted.</p>
   */
  @js.native
  trait OutgoingCertificate extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
    var certificateArn: js.UndefOr[CertificateArn]
    var transferMessage: js.UndefOr[Message]
    var transferredTo: js.UndefOr[AwsAccountId]
    var transferDate: js.UndefOr[DateType]
    var creationDate: js.UndefOr[DateType]
  }

  object OutgoingCertificate {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      certificateArn: js.UndefOr[CertificateArn] = js.undefined,
      transferMessage: js.UndefOr[Message] = js.undefined,
      transferredTo: js.UndefOr[AwsAccountId] = js.undefined,
      transferDate: js.UndefOr[DateType] = js.undefined,
      creationDate: js.UndefOr[DateType] = js.undefined): OutgoingCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] },
        "transferMessage" -> transferMessage.map { x => x.asInstanceOf[js.Any] },
        "transferredTo" -> transferredTo.map { x => x.asInstanceOf[js.Any] },
        "transferDate" -> transferDate.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutgoingCertificate]
    }
  }

  /**
   * <p>Describes an AWS IoT policy.</p>
   */
  @js.native
  trait Policy extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyArn: js.UndefOr[PolicyArn]
  }

  object Policy {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      policyArn: js.UndefOr[PolicyArn] = js.undefined): Policy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "policyArn" -> policyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Policy]
    }
  }

  /**
   * <p>Describes a policy version.</p>
   */
  @js.native
  trait PolicyVersion extends js.Object {
    var versionId: js.UndefOr[PolicyVersionId]
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var createDate: js.UndefOr[DateType]
  }

  object PolicyVersion {
    def apply(
      versionId: js.UndefOr[PolicyVersionId] = js.undefined,
      isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
      createDate: js.UndefOr[DateType] = js.undefined): PolicyVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "versionId" -> versionId.map { x => x.asInstanceOf[js.Any] },
        "isDefaultVersion" -> isDefaultVersion.map { x => x.asInstanceOf[js.Any] },
        "createDate" -> createDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyVersion]
    }
  }

  /**
   * <p>Information about the version of the policy associated with the resource.</p>
   */
  @js.native
  trait PolicyVersionIdentifier extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyVersionId: js.UndefOr[PolicyVersionId]
  }

  object PolicyVersionIdentifier {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined): PolicyVersionIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "policyVersionId" -> policyVersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyVersionIdentifier]
    }
  }

  /**
   * <p>Configuration for pre-signed S3 URLs.</p>
   */
  @js.native
  trait PresignedUrlConfig extends js.Object {
    var roleArn: js.UndefOr[RoleArn]
    var expiresInSec: js.UndefOr[ExpiresInSec]
  }

  object PresignedUrlConfig {
    def apply(
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      expiresInSec: js.UndefOr[ExpiresInSec] = js.undefined): PresignedUrlConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "expiresInSec" -> expiresInSec.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PresignedUrlConfig]
    }
  }

  /**
   * <p>The input for the DynamoActionVS action that specifies the DynamoDB table to which the message data will be written.</p>
   */
  @js.native
  trait PutItemInput extends js.Object {
    var tableName: js.UndefOr[TableName]
  }

  object PutItemInput {
    def apply(
      tableName: js.UndefOr[TableName] = js.undefined): PutItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tableName" -> tableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutItemInput]
    }
  }

  /**
   * <p>Allows you to define a criteria to initiate the increase in rate of rollout for a job.</p>
   */
  @js.native
  trait RateIncreaseCriteria extends js.Object {
    var numberOfNotifiedThings: js.UndefOr[NumberOfThings]
    var numberOfSucceededThings: js.UndefOr[NumberOfThings]
  }

  object RateIncreaseCriteria {
    def apply(
      numberOfNotifiedThings: js.UndefOr[NumberOfThings] = js.undefined,
      numberOfSucceededThings: js.UndefOr[NumberOfThings] = js.undefined): RateIncreaseCriteria = {
      val _fields = IndexedSeq[(String, js.Any)](
        "numberOfNotifiedThings" -> numberOfNotifiedThings.map { x => x.asInstanceOf[js.Any] },
        "numberOfSucceededThings" -> numberOfSucceededThings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RateIncreaseCriteria]
    }
  }

  /**
   * <p>The input to the RegisterCACertificate operation.</p>
   */
  @js.native
  trait RegisterCACertificateRequest extends js.Object {
    var setAsActive: js.UndefOr[SetAsActive]
    var verificationCertificate: js.UndefOr[CertificatePem]
    var caCertificate: js.UndefOr[CertificatePem]
    var registrationConfig: js.UndefOr[RegistrationConfig]
    var allowAutoRegistration: js.UndefOr[AllowAutoRegistration]
  }

  object RegisterCACertificateRequest {
    def apply(
      setAsActive: js.UndefOr[SetAsActive] = js.undefined,
      verificationCertificate: js.UndefOr[CertificatePem] = js.undefined,
      caCertificate: js.UndefOr[CertificatePem] = js.undefined,
      registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined,
      allowAutoRegistration: js.UndefOr[AllowAutoRegistration] = js.undefined): RegisterCACertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "setAsActive" -> setAsActive.map { x => x.asInstanceOf[js.Any] },
        "verificationCertificate" -> verificationCertificate.map { x => x.asInstanceOf[js.Any] },
        "caCertificate" -> caCertificate.map { x => x.asInstanceOf[js.Any] },
        "registrationConfig" -> registrationConfig.map { x => x.asInstanceOf[js.Any] },
        "allowAutoRegistration" -> allowAutoRegistration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterCACertificateRequest]
    }
  }

  /**
   * <p>The output from the RegisterCACertificateResponse operation.</p>
   */
  @js.native
  trait RegisterCACertificateResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
  }

  object RegisterCACertificateResponse {
    def apply(
      certificateArn: js.UndefOr[CertificateArn] = js.undefined,
      certificateId: js.UndefOr[CertificateId] = js.undefined): RegisterCACertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] },
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterCACertificateResponse]
    }
  }

  /**
   * <p>The input to the RegisterCertificate operation.</p>
   */
  @js.native
  trait RegisterCertificateRequest extends js.Object {
    var certificatePem: js.UndefOr[CertificatePem]
    var caCertificatePem: js.UndefOr[CertificatePem]
    var setAsActive: js.UndefOr[SetAsActiveFlag]
    var status: js.UndefOr[CertificateStatus]
  }

  object RegisterCertificateRequest {
    def apply(
      certificatePem: js.UndefOr[CertificatePem] = js.undefined,
      caCertificatePem: js.UndefOr[CertificatePem] = js.undefined,
      setAsActive: js.UndefOr[SetAsActiveFlag] = js.undefined,
      status: js.UndefOr[CertificateStatus] = js.undefined): RegisterCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificatePem" -> certificatePem.map { x => x.asInstanceOf[js.Any] },
        "caCertificatePem" -> caCertificatePem.map { x => x.asInstanceOf[js.Any] },
        "setAsActive" -> setAsActive.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterCertificateRequest]
    }
  }

  /**
   * <p>The output from the RegisterCertificate operation.</p>
   */
  @js.native
  trait RegisterCertificateResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
  }

  object RegisterCertificateResponse {
    def apply(
      certificateArn: js.UndefOr[CertificateArn] = js.undefined,
      certificateId: js.UndefOr[CertificateId] = js.undefined): RegisterCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] },
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterCertificateResponse]
    }
  }

  @js.native
  trait RegisterThingRequest extends js.Object {
    var templateBody: js.UndefOr[TemplateBody]
    var parameters: js.UndefOr[Parameters]
  }

  object RegisterThingRequest {
    def apply(
      templateBody: js.UndefOr[TemplateBody] = js.undefined,
      parameters: js.UndefOr[Parameters] = js.undefined): RegisterThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "templateBody" -> templateBody.map { x => x.asInstanceOf[js.Any] },
        "parameters" -> parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterThingRequest]
    }
  }

  @js.native
  trait RegisterThingResponse extends js.Object {
    var certificatePem: js.UndefOr[CertificatePem]
    var resourceArns: js.UndefOr[ResourceArns]
  }

  object RegisterThingResponse {
    def apply(
      certificatePem: js.UndefOr[CertificatePem] = js.undefined,
      resourceArns: js.UndefOr[ResourceArns] = js.undefined): RegisterThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificatePem" -> certificatePem.map { x => x.asInstanceOf[js.Any] },
        "resourceArns" -> resourceArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterThingResponse]
    }
  }

  /**
   * <p>The registration configuration.</p>
   */
  @js.native
  trait RegistrationConfig extends js.Object {
    var templateBody: js.UndefOr[TemplateBody]
    var roleArn: js.UndefOr[RoleArn]
  }

  object RegistrationConfig {
    def apply(
      templateBody: js.UndefOr[TemplateBody] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined): RegistrationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "templateBody" -> templateBody.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegistrationConfig]
    }
  }

  /**
   * <p>The input for the RejectCertificateTransfer operation.</p>
   */
  @js.native
  trait RejectCertificateTransferRequest extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
    var rejectReason: js.UndefOr[Message]
  }

  object RejectCertificateTransferRequest {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      rejectReason: js.UndefOr[Message] = js.undefined): RejectCertificateTransferRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "rejectReason" -> rejectReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectCertificateTransferRequest]
    }
  }

  /**
   * <p>Information about a related resource.</p>
   */
  @js.native
  trait RelatedResource extends js.Object {
    var resourceType: js.UndefOr[ResourceType]
    var resourceIdentifier: js.UndefOr[ResourceIdentifier]
    var additionalInfo: js.UndefOr[StringMap]
  }

  object RelatedResource {
    def apply(
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
      additionalInfo: js.UndefOr[StringMap] = js.undefined): RelatedResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "resourceIdentifier" -> resourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "additionalInfo" -> additionalInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelatedResource]
    }
  }

  @js.native
  trait RemoveThingFromBillingGroupRequest extends js.Object {
    var billingGroupName: js.UndefOr[BillingGroupName]
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var thingName: js.UndefOr[ThingName]
    var thingArn: js.UndefOr[ThingArn]
  }

  object RemoveThingFromBillingGroupRequest {
    def apply(
      billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
      billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      thingArn: js.UndefOr[ThingArn] = js.undefined): RemoveThingFromBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName" -> billingGroupName.map { x => x.asInstanceOf[js.Any] },
        "billingGroupArn" -> billingGroupArn.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "thingArn" -> thingArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveThingFromBillingGroupRequest]
    }
  }

  @js.native
  trait RemoveThingFromBillingGroupResponse extends js.Object {

  }

  object RemoveThingFromBillingGroupResponse {
    def apply(): RemoveThingFromBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveThingFromBillingGroupResponse]
    }
  }

  @js.native
  trait RemoveThingFromThingGroupRequest extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingName: js.UndefOr[ThingName]
    var thingArn: js.UndefOr[ThingArn]
  }

  object RemoveThingFromThingGroupRequest {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      thingArn: js.UndefOr[ThingArn] = js.undefined): RemoveThingFromThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "thingGroupArn" -> thingGroupArn.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "thingArn" -> thingArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveThingFromThingGroupRequest]
    }
  }

  @js.native
  trait RemoveThingFromThingGroupResponse extends js.Object {

  }

  object RemoveThingFromThingGroupResponse {
    def apply(): RemoveThingFromThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveThingFromThingGroupResponse]
    }
  }

  /**
   * <p>The input for the ReplaceTopicRule operation.</p>
   */
  @js.native
  trait ReplaceTopicRuleRequest extends js.Object {
    var ruleName: js.UndefOr[RuleName]
    var topicRulePayload: js.UndefOr[TopicRulePayload]
  }

  object ReplaceTopicRuleRequest {
    def apply(
      ruleName: js.UndefOr[RuleName] = js.undefined,
      topicRulePayload: js.UndefOr[TopicRulePayload] = js.undefined): ReplaceTopicRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName" -> ruleName.map { x => x.asInstanceOf[js.Any] },
        "topicRulePayload" -> topicRulePayload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceTopicRuleRequest]
    }
  }

  object ReportTypeEnum {
    val ERRORS = "ERRORS"
    val RESULTS = "RESULTS"

    val values = IndexedSeq(ERRORS, RESULTS)
  }

  /**
   * <p>Describes an action to republish to another topic.</p>
   */
  @js.native
  trait RepublishAction extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var topic: js.UndefOr[TopicPattern]
  }

  object RepublishAction {
    def apply(
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      topic: js.UndefOr[TopicPattern] = js.undefined): RepublishAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "topic" -> topic.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RepublishAction]
    }
  }

  /**
   * <p>Information identifying the non-compliant resource.</p>
   */
  @js.native
  trait ResourceIdentifier extends js.Object {
    var clientId: js.UndefOr[ClientId]
    var policyVersionIdentifier: js.UndefOr[PolicyVersionIdentifier]
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId]
    var caCertificateId: js.UndefOr[CertificateId]
    var account: js.UndefOr[AwsAccountId]
    var deviceCertificateId: js.UndefOr[CertificateId]
  }

  object ResourceIdentifier {
    def apply(
      clientId: js.UndefOr[ClientId] = js.undefined,
      policyVersionIdentifier: js.UndefOr[PolicyVersionIdentifier] = js.undefined,
      cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined,
      caCertificateId: js.UndefOr[CertificateId] = js.undefined,
      account: js.UndefOr[AwsAccountId] = js.undefined,
      deviceCertificateId: js.UndefOr[CertificateId] = js.undefined): ResourceIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientId" -> clientId.map { x => x.asInstanceOf[js.Any] },
        "policyVersionIdentifier" -> policyVersionIdentifier.map { x => x.asInstanceOf[js.Any] },
        "cognitoIdentityPoolId" -> cognitoIdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "caCertificateId" -> caCertificateId.map { x => x.asInstanceOf[js.Any] },
        "account" -> account.map { x => x.asInstanceOf[js.Any] },
        "deviceCertificateId" -> deviceCertificateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceIdentifier]
    }
  }

  object ResourceTypeEnum {
    val DEVICE_CERTIFICATE = "DEVICE_CERTIFICATE"
    val CA_CERTIFICATE = "CA_CERTIFICATE"
    val IOT_POLICY = "IOT_POLICY"
    val COGNITO_IDENTITY_POOL = "COGNITO_IDENTITY_POOL"
    val CLIENT_ID = "CLIENT_ID"
    val ACCOUNT_SETTINGS = "ACCOUNT_SETTINGS"

    val values = IndexedSeq(DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY, COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS)
  }

  /**
   * <p>Role alias description.</p>
   */
  @js.native
  trait RoleAliasDescription extends js.Object {
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds]
    var lastModifiedDate: js.UndefOr[DateType]
    var roleAlias: js.UndefOr[RoleAlias]
    var roleArn: js.UndefOr[RoleArn]
    var roleAliasArn: js.UndefOr[RoleAliasArn]
    var creationDate: js.UndefOr[DateType]
    var owner: js.UndefOr[AwsAccountId]
  }

  object RoleAliasDescription {
    def apply(
      credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined,
      lastModifiedDate: js.UndefOr[DateType] = js.undefined,
      roleAlias: js.UndefOr[RoleAlias] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined,
      creationDate: js.UndefOr[DateType] = js.undefined,
      owner: js.UndefOr[AwsAccountId] = js.undefined): RoleAliasDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "credentialDurationSeconds" -> credentialDurationSeconds.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "roleAlias" -> roleAlias.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "roleAliasArn" -> roleAliasArn.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "owner" -> owner.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoleAliasDescription]
    }
  }

  /**
   * <p>Describes an action to write data to an Amazon S3 bucket.</p>
   */
  @js.native
  trait S3Action extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var bucketName: js.UndefOr[BucketName]
    var key: js.UndefOr[Key]
    var cannedAcl: js.UndefOr[CannedAccessControlList]
  }

  object S3Action {
    def apply(
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      bucketName: js.UndefOr[BucketName] = js.undefined,
      key: js.UndefOr[Key] = js.undefined,
      cannedAcl: js.UndefOr[CannedAccessControlList] = js.undefined): S3Action = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "bucketName" -> bucketName.map { x => x.asInstanceOf[js.Any] },
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "cannedAcl" -> cannedAcl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Action]
    }
  }

  /**
   * <p>Describes the location of updated firmware in S3.</p>
   */
  @js.native
  trait S3Destination extends js.Object {
    var bucket: js.UndefOr[S3Bucket]
    var prefix: js.UndefOr[Prefix]
  }

  object S3Destination {
    def apply(
      bucket: js.UndefOr[S3Bucket] = js.undefined,
      prefix: js.UndefOr[Prefix] = js.undefined): S3Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bucket" -> bucket.map { x => x.asInstanceOf[js.Any] },
        "prefix" -> prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Destination]
    }
  }

  /**
   * <p>The S3 location.</p>
   */
  @js.native
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[S3Bucket]
    var key: js.UndefOr[S3Key]
    var version: js.UndefOr[S3Version]
  }

  object S3Location {
    def apply(
      bucket: js.UndefOr[S3Bucket] = js.undefined,
      key: js.UndefOr[S3Key] = js.undefined,
      version: js.UndefOr[S3Version] = js.undefined): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bucket" -> bucket.map { x => x.asInstanceOf[js.Any] },
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
    }
  }

  /**
   * <p>Describes an action to write a message to a Salesforce IoT Cloud Input Stream.</p>
   */
  @js.native
  trait SalesforceAction extends js.Object {
    var token: js.UndefOr[SalesforceToken]
    var url: js.UndefOr[SalesforceEndpoint]
  }

  object SalesforceAction {
    def apply(
      token: js.UndefOr[SalesforceToken] = js.undefined,
      url: js.UndefOr[SalesforceEndpoint] = js.undefined): SalesforceAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "token" -> token.map { x => x.asInstanceOf[js.Any] },
        "url" -> url.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SalesforceAction]
    }
  }

  /**
   * <p>Information about the scheduled audit.</p>
   */
  @js.native
  trait ScheduledAuditMetadata extends js.Object {
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
    var dayOfWeek: js.UndefOr[DayOfWeek]
    var dayOfMonth: js.UndefOr[DayOfMonth]
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
    var frequency: js.UndefOr[AuditFrequency]
  }

  object ScheduledAuditMetadata {
    def apply(
      scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined,
      dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
      dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
      scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined,
      frequency: js.UndefOr[AuditFrequency] = js.undefined): ScheduledAuditMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditName" -> scheduledAuditName.map { x => x.asInstanceOf[js.Any] },
        "dayOfWeek" -> dayOfWeek.map { x => x.asInstanceOf[js.Any] },
        "dayOfMonth" -> dayOfMonth.map { x => x.asInstanceOf[js.Any] },
        "scheduledAuditArn" -> scheduledAuditArn.map { x => x.asInstanceOf[js.Any] },
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledAuditMetadata]
    }
  }

  @js.native
  trait SearchIndexRequest extends js.Object {
    var maxResults: js.UndefOr[QueryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var queryString: js.UndefOr[QueryString]
    var indexName: js.UndefOr[IndexName]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  object SearchIndexRequest {
    def apply(
      maxResults: js.UndefOr[QueryMaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      queryString: js.UndefOr[QueryString] = js.undefined,
      indexName: js.UndefOr[IndexName] = js.undefined,
      queryVersion: js.UndefOr[QueryVersion] = js.undefined): SearchIndexRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "queryString" -> queryString.map { x => x.asInstanceOf[js.Any] },
        "indexName" -> indexName.map { x => x.asInstanceOf[js.Any] },
        "queryVersion" -> queryVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchIndexRequest]
    }
  }

  @js.native
  trait SearchIndexResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[ThingDocumentList]
    var thingGroups: js.UndefOr[ThingGroupDocumentList]
  }

  object SearchIndexResponse {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      things: js.UndefOr[ThingDocumentList] = js.undefined,
      thingGroups: js.UndefOr[ThingGroupDocumentList] = js.undefined): SearchIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "things" -> things.map { x => x.asInstanceOf[js.Any] },
        "thingGroups" -> thingGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchIndexResponse]
    }
  }

  /**
   * <p>Identifying information for a Device Defender security profile.</p>
   */
  @js.native
  trait SecurityProfileIdentifier extends js.Object {
    var name: js.UndefOr[SecurityProfileName]
    var arn: js.UndefOr[SecurityProfileArn]
  }

  object SecurityProfileIdentifier {
    def apply(
      name: js.UndefOr[SecurityProfileName] = js.undefined,
      arn: js.UndefOr[SecurityProfileArn] = js.undefined): SecurityProfileIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityProfileIdentifier]
    }
  }

  /**
   * <p>A target to which an alert is sent when a security profile behavior is violated.</p>
   */
  @js.native
  trait SecurityProfileTarget extends js.Object {
    var arn: js.UndefOr[SecurityProfileTargetArn]
  }

  object SecurityProfileTarget {
    def apply(
      arn: js.UndefOr[SecurityProfileTargetArn] = js.undefined): SecurityProfileTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityProfileTarget]
    }
  }

  /**
   * <p>Information about a security profile and the target associated with it.</p>
   */
  @js.native
  trait SecurityProfileTargetMapping extends js.Object {
    var securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier]
    var target: js.UndefOr[SecurityProfileTarget]
  }

  object SecurityProfileTargetMapping {
    def apply(
      securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier] = js.undefined,
      target: js.UndefOr[SecurityProfileTarget] = js.undefined): SecurityProfileTargetMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileIdentifier" -> securityProfileIdentifier.map { x => x.asInstanceOf[js.Any] },
        "target" -> target.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityProfileTargetMapping]
    }
  }

  @js.native
  trait SetDefaultAuthorizerRequest extends js.Object {
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  object SetDefaultAuthorizerRequest {
    def apply(
      authorizerName: js.UndefOr[AuthorizerName] = js.undefined): SetDefaultAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDefaultAuthorizerRequest]
    }
  }

  @js.native
  trait SetDefaultAuthorizerResponse extends js.Object {
    var authorizerName: js.UndefOr[AuthorizerName]
    var authorizerArn: js.UndefOr[AuthorizerArn]
  }

  object SetDefaultAuthorizerResponse {
    def apply(
      authorizerName: js.UndefOr[AuthorizerName] = js.undefined,
      authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined): SetDefaultAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.map { x => x.asInstanceOf[js.Any] },
        "authorizerArn" -> authorizerArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDefaultAuthorizerResponse]
    }
  }

  /**
   * <p>The input for the SetDefaultPolicyVersion operation.</p>
   */
  @js.native
  trait SetDefaultPolicyVersionRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyVersionId: js.UndefOr[PolicyVersionId]
  }

  object SetDefaultPolicyVersionRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined): SetDefaultPolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "policyVersionId" -> policyVersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDefaultPolicyVersionRequest]
    }
  }

  /**
   * <p>The input for the SetLoggingOptions operation.</p>
   */
  @js.native
  trait SetLoggingOptionsRequest extends js.Object {
    var loggingOptionsPayload: js.UndefOr[LoggingOptionsPayload]
  }

  object SetLoggingOptionsRequest {
    def apply(
      loggingOptionsPayload: js.UndefOr[LoggingOptionsPayload] = js.undefined): SetLoggingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loggingOptionsPayload" -> loggingOptionsPayload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoggingOptionsRequest]
    }
  }

  @js.native
  trait SetV2LoggingLevelRequest extends js.Object {
    var logTarget: js.UndefOr[LogTarget]
    var logLevel: js.UndefOr[LogLevel]
  }

  object SetV2LoggingLevelRequest {
    def apply(
      logTarget: js.UndefOr[LogTarget] = js.undefined,
      logLevel: js.UndefOr[LogLevel] = js.undefined): SetV2LoggingLevelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logTarget" -> logTarget.map { x => x.asInstanceOf[js.Any] },
        "logLevel" -> logLevel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetV2LoggingLevelRequest]
    }
  }

  @js.native
  trait SetV2LoggingOptionsRequest extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var defaultLogLevel: js.UndefOr[LogLevel]
    var disableAllLogs: js.UndefOr[DisableAllLogs]
  }

  object SetV2LoggingOptionsRequest {
    def apply(
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      defaultLogLevel: js.UndefOr[LogLevel] = js.undefined,
      disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined): SetV2LoggingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "defaultLogLevel" -> defaultLogLevel.map { x => x.asInstanceOf[js.Any] },
        "disableAllLogs" -> disableAllLogs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetV2LoggingOptionsRequest]
    }
  }

  /**
   * <p>Describes the code-signing profile.</p>
   */
  @js.native
  trait SigningProfileParameter extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var platform: js.UndefOr[Platform]
    var certificatePathOnDevice: js.UndefOr[CertificatePathOnDevice]
  }

  object SigningProfileParameter {
    def apply(
      certificateArn: js.UndefOr[CertificateArn] = js.undefined,
      platform: js.UndefOr[Platform] = js.undefined,
      certificatePathOnDevice: js.UndefOr[CertificatePathOnDevice] = js.undefined): SigningProfileParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] },
        "platform" -> platform.map { x => x.asInstanceOf[js.Any] },
        "certificatePathOnDevice" -> certificatePathOnDevice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningProfileParameter]
    }
  }

  /**
   * <p>Describes an action to publish to an Amazon SNS topic.</p>
   */
  @js.native
  trait SnsAction extends js.Object {
    var targetArn: js.UndefOr[AwsArn]
    var roleArn: js.UndefOr[AwsArn]
    var messageFormat: js.UndefOr[MessageFormat]
  }

  object SnsAction {
    def apply(
      targetArn: js.UndefOr[AwsArn] = js.undefined,
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      messageFormat: js.UndefOr[MessageFormat] = js.undefined): SnsAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetArn" -> targetArn.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "messageFormat" -> messageFormat.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnsAction]
    }
  }

  /**
   * <p>Describes an action to publish data to an Amazon SQS queue.</p>
   */
  @js.native
  trait SqsAction extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var queueUrl: js.UndefOr[QueueUrl]
    var useBase64: js.UndefOr[UseBase64]
  }

  object SqsAction {
    def apply(
      roleArn: js.UndefOr[AwsArn] = js.undefined,
      queueUrl: js.UndefOr[QueueUrl] = js.undefined,
      useBase64: js.UndefOr[UseBase64] = js.undefined): SqsAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "queueUrl" -> queueUrl.map { x => x.asInstanceOf[js.Any] },
        "useBase64" -> useBase64.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqsAction]
    }
  }

  @js.native
  trait StartOnDemandAuditTaskRequest extends js.Object {
    var targetCheckNames: js.UndefOr[TargetAuditCheckNames]
  }

  object StartOnDemandAuditTaskRequest {
    def apply(
      targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined): StartOnDemandAuditTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetCheckNames" -> targetCheckNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartOnDemandAuditTaskRequest]
    }
  }

  @js.native
  trait StartOnDemandAuditTaskResponse extends js.Object {
    var taskId: js.UndefOr[AuditTaskId]
  }

  object StartOnDemandAuditTaskResponse {
    def apply(
      taskId: js.UndefOr[AuditTaskId] = js.undefined): StartOnDemandAuditTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartOnDemandAuditTaskResponse]
    }
  }

  /**
   * <p>Information required to start a signing job.</p>
   */
  @js.native
  trait StartSigningJobParameter extends js.Object {
    var signingProfileParameter: js.UndefOr[SigningProfileParameter]
    var signingProfileName: js.UndefOr[SigningProfileName]
    var destination: js.UndefOr[Destination]
  }

  object StartSigningJobParameter {
    def apply(
      signingProfileParameter: js.UndefOr[SigningProfileParameter] = js.undefined,
      signingProfileName: js.UndefOr[SigningProfileName] = js.undefined,
      destination: js.UndefOr[Destination] = js.undefined): StartSigningJobParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signingProfileParameter" -> signingProfileParameter.map { x => x.asInstanceOf[js.Any] },
        "signingProfileName" -> signingProfileName.map { x => x.asInstanceOf[js.Any] },
        "destination" -> destination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSigningJobParameter]
    }
  }

  @js.native
  trait StartThingRegistrationTaskRequest extends js.Object {
    var templateBody: js.UndefOr[TemplateBody]
    var inputFileBucket: js.UndefOr[RegistryS3BucketName]
    var inputFileKey: js.UndefOr[RegistryS3KeyName]
    var roleArn: js.UndefOr[RoleArn]
  }

  object StartThingRegistrationTaskRequest {
    def apply(
      templateBody: js.UndefOr[TemplateBody] = js.undefined,
      inputFileBucket: js.UndefOr[RegistryS3BucketName] = js.undefined,
      inputFileKey: js.UndefOr[RegistryS3KeyName] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined): StartThingRegistrationTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "templateBody" -> templateBody.map { x => x.asInstanceOf[js.Any] },
        "inputFileBucket" -> inputFileBucket.map { x => x.asInstanceOf[js.Any] },
        "inputFileKey" -> inputFileKey.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartThingRegistrationTaskRequest]
    }
  }

  @js.native
  trait StartThingRegistrationTaskResponse extends js.Object {
    var taskId: js.UndefOr[TaskId]
  }

  object StartThingRegistrationTaskResponse {
    def apply(
      taskId: js.UndefOr[TaskId] = js.undefined): StartThingRegistrationTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartThingRegistrationTaskResponse]
    }
  }

  object StatusEnum {
    val InProgress = "InProgress"
    val Completed = "Completed"
    val Failed = "Failed"
    val Cancelled = "Cancelled"
    val Cancelling = "Cancelling"

    val values = IndexedSeq(InProgress, Completed, Failed, Cancelled, Cancelling)
  }

  /**
   * <p>Starts execution of a Step Functions state machine.</p>
   */
  @js.native
  trait StepFunctionsAction extends js.Object {
    var executionNamePrefix: js.UndefOr[ExecutionNamePrefix]
    var stateMachineName: js.UndefOr[StateMachineName]
    var roleArn: js.UndefOr[AwsArn]
  }

  object StepFunctionsAction {
    def apply(
      executionNamePrefix: js.UndefOr[ExecutionNamePrefix] = js.undefined,
      stateMachineName: js.UndefOr[StateMachineName] = js.undefined,
      roleArn: js.UndefOr[AwsArn] = js.undefined): StepFunctionsAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionNamePrefix" -> executionNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "stateMachineName" -> stateMachineName.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepFunctionsAction]
    }
  }

  @js.native
  trait StopThingRegistrationTaskRequest extends js.Object {
    var taskId: js.UndefOr[TaskId]
  }

  object StopThingRegistrationTaskRequest {
    def apply(
      taskId: js.UndefOr[TaskId] = js.undefined): StopThingRegistrationTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopThingRegistrationTaskRequest]
    }
  }

  @js.native
  trait StopThingRegistrationTaskResponse extends js.Object {

  }

  object StopThingRegistrationTaskResponse {
    def apply(): StopThingRegistrationTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopThingRegistrationTaskResponse]
    }
  }

  /**
   * <p>Describes a group of files that can be streamed.</p>
   */
  @js.native
  trait Stream extends js.Object {
    var streamId: js.UndefOr[StreamId]
    var fileId: js.UndefOr[FileId]
  }

  object Stream {
    def apply(
      streamId: js.UndefOr[StreamId] = js.undefined,
      fileId: js.UndefOr[FileId] = js.undefined): Stream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamId" -> streamId.map { x => x.asInstanceOf[js.Any] },
        "fileId" -> fileId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Stream]
    }
  }

  /**
   * <p>Represents a file to stream.</p>
   */
  @js.native
  trait StreamFile extends js.Object {
    var fileId: js.UndefOr[FileId]
    var s3Location: js.UndefOr[S3Location]
  }

  object StreamFile {
    def apply(
      fileId: js.UndefOr[FileId] = js.undefined,
      s3Location: js.UndefOr[S3Location] = js.undefined): StreamFile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fileId" -> fileId.map { x => x.asInstanceOf[js.Any] },
        "s3Location" -> s3Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamFile]
    }
  }

  /**
   * <p>Information about a stream.</p>
   */
  @js.native
  trait StreamInfo extends js.Object {
    var streamId: js.UndefOr[StreamId]
    var description: js.UndefOr[StreamDescription]
    var files: js.UndefOr[StreamFiles]
    var roleArn: js.UndefOr[RoleArn]
    var createdAt: js.UndefOr[DateType]
    var streamVersion: js.UndefOr[StreamVersion]
    var streamArn: js.UndefOr[StreamArn]
    var lastUpdatedAt: js.UndefOr[DateType]
  }

  object StreamInfo {
    def apply(
      streamId: js.UndefOr[StreamId] = js.undefined,
      description: js.UndefOr[StreamDescription] = js.undefined,
      files: js.UndefOr[StreamFiles] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      createdAt: js.UndefOr[DateType] = js.undefined,
      streamVersion: js.UndefOr[StreamVersion] = js.undefined,
      streamArn: js.UndefOr[StreamArn] = js.undefined,
      lastUpdatedAt: js.UndefOr[DateType] = js.undefined): StreamInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamId" -> streamId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "files" -> files.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "streamVersion" -> streamVersion.map { x => x.asInstanceOf[js.Any] },
        "streamArn" -> streamArn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamInfo]
    }
  }

  /**
   * <p>A summary of a stream.</p>
   */
  @js.native
  trait StreamSummary extends js.Object {
    var streamId: js.UndefOr[StreamId]
    var streamArn: js.UndefOr[StreamArn]
    var streamVersion: js.UndefOr[StreamVersion]
    var description: js.UndefOr[StreamDescription]
  }

  object StreamSummary {
    def apply(
      streamId: js.UndefOr[StreamId] = js.undefined,
      streamArn: js.UndefOr[StreamArn] = js.undefined,
      streamVersion: js.UndefOr[StreamVersion] = js.undefined,
      description: js.UndefOr[StreamDescription] = js.undefined): StreamSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamId" -> streamId.map { x => x.asInstanceOf[js.Any] },
        "streamArn" -> streamArn.map { x => x.asInstanceOf[js.Any] },
        "streamVersion" -> streamVersion.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamSummary]
    }
  }

  /**
   * <p>A set of key/value pairs that are used to manage the resource.</p>
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
    var resourceArn: js.UndefOr[ResourceArn]
    var tags: js.UndefOr[TagList]
  }

  object TagResourceRequest {
    def apply(
      resourceArn: js.UndefOr[ResourceArn] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {

  }

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  object TargetSelectionEnum {
    val CONTINUOUS = "CONTINUOUS"
    val SNAPSHOT = "SNAPSHOT"

    val values = IndexedSeq(CONTINUOUS, SNAPSHOT)
  }

  /**
   * <p>Statistics for the checks performed during the audit.</p>
   */
  @js.native
  trait TaskStatistics extends js.Object {
    var waitingForDataCollectionChecks: js.UndefOr[WaitingForDataCollectionChecksCount]
    var nonCompliantChecks: js.UndefOr[NonCompliantChecksCount]
    var failedChecks: js.UndefOr[FailedChecksCount]
    var totalChecks: js.UndefOr[TotalChecksCount]
    var inProgressChecks: js.UndefOr[InProgressChecksCount]
    var canceledChecks: js.UndefOr[CanceledChecksCount]
    var compliantChecks: js.UndefOr[CompliantChecksCount]
  }

  object TaskStatistics {
    def apply(
      waitingForDataCollectionChecks: js.UndefOr[WaitingForDataCollectionChecksCount] = js.undefined,
      nonCompliantChecks: js.UndefOr[NonCompliantChecksCount] = js.undefined,
      failedChecks: js.UndefOr[FailedChecksCount] = js.undefined,
      totalChecks: js.UndefOr[TotalChecksCount] = js.undefined,
      inProgressChecks: js.UndefOr[InProgressChecksCount] = js.undefined,
      canceledChecks: js.UndefOr[CanceledChecksCount] = js.undefined,
      compliantChecks: js.UndefOr[CompliantChecksCount] = js.undefined): TaskStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "waitingForDataCollectionChecks" -> waitingForDataCollectionChecks.map { x => x.asInstanceOf[js.Any] },
        "nonCompliantChecks" -> nonCompliantChecks.map { x => x.asInstanceOf[js.Any] },
        "failedChecks" -> failedChecks.map { x => x.asInstanceOf[js.Any] },
        "totalChecks" -> totalChecks.map { x => x.asInstanceOf[js.Any] },
        "inProgressChecks" -> inProgressChecks.map { x => x.asInstanceOf[js.Any] },
        "canceledChecks" -> canceledChecks.map { x => x.asInstanceOf[js.Any] },
        "compliantChecks" -> compliantChecks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskStatistics]
    }
  }

  @js.native
  trait TestAuthorizationRequest extends js.Object {
    var policyNamesToAdd: js.UndefOr[PolicyNames]
    var clientId: js.UndefOr[ClientId]
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId]
    var principal: js.UndefOr[Principal]
    var authInfos: js.UndefOr[AuthInfos]
    var policyNamesToSkip: js.UndefOr[PolicyNames]
  }

  object TestAuthorizationRequest {
    def apply(
      policyNamesToAdd: js.UndefOr[PolicyNames] = js.undefined,
      clientId: js.UndefOr[ClientId] = js.undefined,
      cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined,
      principal: js.UndefOr[Principal] = js.undefined,
      authInfos: js.UndefOr[AuthInfos] = js.undefined,
      policyNamesToSkip: js.UndefOr[PolicyNames] = js.undefined): TestAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyNamesToAdd" -> policyNamesToAdd.map { x => x.asInstanceOf[js.Any] },
        "clientId" -> clientId.map { x => x.asInstanceOf[js.Any] },
        "cognitoIdentityPoolId" -> cognitoIdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "principal" -> principal.map { x => x.asInstanceOf[js.Any] },
        "authInfos" -> authInfos.map { x => x.asInstanceOf[js.Any] },
        "policyNamesToSkip" -> policyNamesToSkip.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestAuthorizationRequest]
    }
  }

  @js.native
  trait TestAuthorizationResponse extends js.Object {
    var authResults: js.UndefOr[AuthResults]
  }

  object TestAuthorizationResponse {
    def apply(
      authResults: js.UndefOr[AuthResults] = js.undefined): TestAuthorizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authResults" -> authResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestAuthorizationResponse]
    }
  }

  @js.native
  trait TestInvokeAuthorizerRequest extends js.Object {
    var authorizerName: js.UndefOr[AuthorizerName]
    var token: js.UndefOr[Token]
    var tokenSignature: js.UndefOr[TokenSignature]
  }

  object TestInvokeAuthorizerRequest {
    def apply(
      authorizerName: js.UndefOr[AuthorizerName] = js.undefined,
      token: js.UndefOr[Token] = js.undefined,
      tokenSignature: js.UndefOr[TokenSignature] = js.undefined): TestInvokeAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.map { x => x.asInstanceOf[js.Any] },
        "token" -> token.map { x => x.asInstanceOf[js.Any] },
        "tokenSignature" -> tokenSignature.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestInvokeAuthorizerRequest]
    }
  }

  @js.native
  trait TestInvokeAuthorizerResponse extends js.Object {
    var principalId: js.UndefOr[PrincipalId]
    var refreshAfterInSeconds: js.UndefOr[Seconds]
    var policyDocuments: js.UndefOr[PolicyDocuments]
    var isAuthenticated: js.UndefOr[IsAuthenticated]
    var disconnectAfterInSeconds: js.UndefOr[Seconds]
  }

  object TestInvokeAuthorizerResponse {
    def apply(
      principalId: js.UndefOr[PrincipalId] = js.undefined,
      refreshAfterInSeconds: js.UndefOr[Seconds] = js.undefined,
      policyDocuments: js.UndefOr[PolicyDocuments] = js.undefined,
      isAuthenticated: js.UndefOr[IsAuthenticated] = js.undefined,
      disconnectAfterInSeconds: js.UndefOr[Seconds] = js.undefined): TestInvokeAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "principalId" -> principalId.map { x => x.asInstanceOf[js.Any] },
        "refreshAfterInSeconds" -> refreshAfterInSeconds.map { x => x.asInstanceOf[js.Any] },
        "policyDocuments" -> policyDocuments.map { x => x.asInstanceOf[js.Any] },
        "isAuthenticated" -> isAuthenticated.map { x => x.asInstanceOf[js.Any] },
        "disconnectAfterInSeconds" -> disconnectAfterInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestInvokeAuthorizerResponse]
    }
  }

  /**
   * <p>The properties of the thing, including thing name, thing type name, and a list of thing attributes.</p>
   */
  @js.native
  trait ThingAttribute extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var thingName: js.UndefOr[ThingName]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var version: js.UndefOr[Version]
    var thingArn: js.UndefOr[ThingArn]
  }

  object ThingAttribute {
    def apply(
      attributes: js.UndefOr[Attributes] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      thingArn: js.UndefOr[ThingArn] = js.undefined): ThingAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "thingArn" -> thingArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingAttribute]
    }
  }

  /**
   * <p>The connectivity status of the thing.</p>
   */
  @js.native
  trait ThingConnectivity extends js.Object {
    var connected: js.UndefOr[Boolean]
    var timestamp: js.UndefOr[ConnectivityTimestamp]
  }

  object ThingConnectivity {
    def apply(
      connected: js.UndefOr[Boolean] = js.undefined,
      timestamp: js.UndefOr[ConnectivityTimestamp] = js.undefined): ThingConnectivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connected" -> connected.map { x => x.asInstanceOf[js.Any] },
        "timestamp" -> timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingConnectivity]
    }
  }

  object ThingConnectivityIndexingModeEnum {
    val OFF = "OFF"
    val STATUS = "STATUS"

    val values = IndexedSeq(OFF, STATUS)
  }

  /**
   * <p>The thing search index document.</p>
   */
  @js.native
  trait ThingDocument extends js.Object {
    var thingGroupNames: js.UndefOr[ThingGroupNameList]
    var shadow: js.UndefOr[JsonDocument]
    var thingId: js.UndefOr[ThingId]
    var attributes: js.UndefOr[Attributes]
    var thingName: js.UndefOr[ThingName]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var connectivity: js.UndefOr[ThingConnectivity]
  }

  object ThingDocument {
    def apply(
      thingGroupNames: js.UndefOr[ThingGroupNameList] = js.undefined,
      shadow: js.UndefOr[JsonDocument] = js.undefined,
      thingId: js.UndefOr[ThingId] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
      connectivity: js.UndefOr[ThingConnectivity] = js.undefined): ThingDocument = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupNames" -> thingGroupNames.map { x => x.asInstanceOf[js.Any] },
        "shadow" -> shadow.map { x => x.asInstanceOf[js.Any] },
        "thingId" -> thingId.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] },
        "connectivity" -> connectivity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingDocument]
    }
  }

  /**
   * <p>The thing group search index document.</p>
   */
  @js.native
  trait ThingGroupDocument extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var thingGroupDescription: js.UndefOr[ThingGroupDescription]
    var parentGroupNames: js.UndefOr[ThingGroupNameList]
    var attributes: js.UndefOr[Attributes]
    var thingGroupId: js.UndefOr[ThingGroupId]
  }

  object ThingGroupDocument {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.undefined,
      parentGroupNames: js.UndefOr[ThingGroupNameList] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined,
      thingGroupId: js.UndefOr[ThingGroupId] = js.undefined): ThingGroupDocument = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "thingGroupDescription" -> thingGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "parentGroupNames" -> parentGroupNames.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "thingGroupId" -> thingGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingGroupDocument]
    }
  }

  /**
   * <p>Thing group indexing configuration.</p>
   */
  @js.native
  trait ThingGroupIndexingConfiguration extends js.Object {
    var thingGroupIndexingMode: js.UndefOr[ThingGroupIndexingMode]
  }

  object ThingGroupIndexingConfiguration {
    def apply(
      thingGroupIndexingMode: js.UndefOr[ThingGroupIndexingMode] = js.undefined): ThingGroupIndexingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupIndexingMode" -> thingGroupIndexingMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingGroupIndexingConfiguration]
    }
  }

  object ThingGroupIndexingModeEnum {
    val OFF = "OFF"
    val ON = "ON"

    val values = IndexedSeq(OFF, ON)
  }

  /**
   * <p>Thing group metadata.</p>
   */
  @js.native
  trait ThingGroupMetadata extends js.Object {
    var parentGroupName: js.UndefOr[ThingGroupName]
    var rootToParentThingGroups: js.UndefOr[ThingGroupNameAndArnList]
    var creationDate: js.UndefOr[CreationDate]
  }

  object ThingGroupMetadata {
    def apply(
      parentGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      rootToParentThingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined,
      creationDate: js.UndefOr[CreationDate] = js.undefined): ThingGroupMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "parentGroupName" -> parentGroupName.map { x => x.asInstanceOf[js.Any] },
        "rootToParentThingGroups" -> rootToParentThingGroups.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingGroupMetadata]
    }
  }

  /**
   * <p>Thing group properties.</p>
   */
  @js.native
  trait ThingGroupProperties extends js.Object {
    var thingGroupDescription: js.UndefOr[ThingGroupDescription]
    var attributePayload: js.UndefOr[AttributePayload]
  }

  object ThingGroupProperties {
    def apply(
      thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.undefined,
      attributePayload: js.UndefOr[AttributePayload] = js.undefined): ThingGroupProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupDescription" -> thingGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "attributePayload" -> attributePayload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingGroupProperties]
    }
  }

  /**
   * <p>The thing indexing configuration. For more information, see <a href="https://docs.aws.amazon.com/iot/latest/developerguide/managing-index.html">Managing Thing Indexing</a>.</p>
   */
  @js.native
  trait ThingIndexingConfiguration extends js.Object {
    var thingIndexingMode: js.UndefOr[ThingIndexingMode]
    var thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode]
  }

  object ThingIndexingConfiguration {
    def apply(
      thingIndexingMode: js.UndefOr[ThingIndexingMode] = js.undefined,
      thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode] = js.undefined): ThingIndexingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingIndexingMode" -> thingIndexingMode.map { x => x.asInstanceOf[js.Any] },
        "thingConnectivityIndexingMode" -> thingConnectivityIndexingMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingIndexingConfiguration]
    }
  }

  object ThingIndexingModeEnum {
    val OFF = "OFF"
    val REGISTRY = "REGISTRY"
    val REGISTRY_AND_SHADOW = "REGISTRY_AND_SHADOW"

    val values = IndexedSeq(OFF, REGISTRY, REGISTRY_AND_SHADOW)
  }

  /**
   * <p>The definition of the thing type, including thing type name and description.</p>
   */
  @js.native
  trait ThingTypeDefinition extends js.Object {
    var thingTypeName: js.UndefOr[ThingTypeName]
    var thingTypeArn: js.UndefOr[ThingTypeArn]
    var thingTypeProperties: js.UndefOr[ThingTypeProperties]
    var thingTypeMetadata: js.UndefOr[ThingTypeMetadata]
  }

  object ThingTypeDefinition {
    def apply(
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
      thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined,
      thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined,
      thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.undefined): ThingTypeDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] },
        "thingTypeArn" -> thingTypeArn.map { x => x.asInstanceOf[js.Any] },
        "thingTypeProperties" -> thingTypeProperties.map { x => x.asInstanceOf[js.Any] },
        "thingTypeMetadata" -> thingTypeMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingTypeDefinition]
    }
  }

  /**
   * <p>The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when time was deprecated.</p>
   */
  @js.native
  trait ThingTypeMetadata extends js.Object {
    var deprecated: js.UndefOr[Boolean]
    var deprecationDate: js.UndefOr[DeprecationDate]
    var creationDate: js.UndefOr[CreationDate]
  }

  object ThingTypeMetadata {
    def apply(
      deprecated: js.UndefOr[Boolean] = js.undefined,
      deprecationDate: js.UndefOr[DeprecationDate] = js.undefined,
      creationDate: js.UndefOr[CreationDate] = js.undefined): ThingTypeMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deprecated" -> deprecated.map { x => x.asInstanceOf[js.Any] },
        "deprecationDate" -> deprecationDate.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingTypeMetadata]
    }
  }

  /**
   * <p>The ThingTypeProperties contains information about the thing type including: a thing type description, and a list of searchable thing attribute names.</p>
   */
  @js.native
  trait ThingTypeProperties extends js.Object {
    var thingTypeDescription: js.UndefOr[ThingTypeDescription]
    var searchableAttributes: js.UndefOr[SearchableAttributes]
  }

  object ThingTypeProperties {
    def apply(
      thingTypeDescription: js.UndefOr[ThingTypeDescription] = js.undefined,
      searchableAttributes: js.UndefOr[SearchableAttributes] = js.undefined): ThingTypeProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeDescription" -> thingTypeDescription.map { x => x.asInstanceOf[js.Any] },
        "searchableAttributes" -> searchableAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingTypeProperties]
    }
  }

  /**
   * <p>Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another terminal state before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.</p>
   */
  @js.native
  trait TimeoutConfig extends js.Object {
    var inProgressTimeoutInMinutes: js.UndefOr[InProgressTimeoutInMinutes]
  }

  object TimeoutConfig {
    def apply(
      inProgressTimeoutInMinutes: js.UndefOr[InProgressTimeoutInMinutes] = js.undefined): TimeoutConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "inProgressTimeoutInMinutes" -> inProgressTimeoutInMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeoutConfig]
    }
  }

  /**
   * <p>Describes a rule.</p>
   */
  @js.native
  trait TopicRule extends js.Object {
    var ruleName: js.UndefOr[RuleName]
    var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion]
    var sql: js.UndefOr[SQL]
    var ruleDisabled: js.UndefOr[IsDisabled]
    var description: js.UndefOr[Description]
    var errorAction: js.UndefOr[Action]
    var createdAt: js.UndefOr[CreatedAtDate]
    var actions: js.UndefOr[ActionList]
  }

  object TopicRule {
    def apply(
      ruleName: js.UndefOr[RuleName] = js.undefined,
      awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.undefined,
      sql: js.UndefOr[SQL] = js.undefined,
      ruleDisabled: js.UndefOr[IsDisabled] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      errorAction: js.UndefOr[Action] = js.undefined,
      createdAt: js.UndefOr[CreatedAtDate] = js.undefined,
      actions: js.UndefOr[ActionList] = js.undefined): TopicRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName" -> ruleName.map { x => x.asInstanceOf[js.Any] },
        "awsIotSqlVersion" -> awsIotSqlVersion.map { x => x.asInstanceOf[js.Any] },
        "sql" -> sql.map { x => x.asInstanceOf[js.Any] },
        "ruleDisabled" -> ruleDisabled.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "errorAction" -> errorAction.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "actions" -> actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TopicRule]
    }
  }

  /**
   * <p>Describes a rule.</p>
   */
  @js.native
  trait TopicRuleListItem extends js.Object {
    var ruleName: js.UndefOr[RuleName]
    var ruleDisabled: js.UndefOr[IsDisabled]
    var topicPattern: js.UndefOr[TopicPattern]
    var createdAt: js.UndefOr[CreatedAtDate]
    var ruleArn: js.UndefOr[RuleArn]
  }

  object TopicRuleListItem {
    def apply(
      ruleName: js.UndefOr[RuleName] = js.undefined,
      ruleDisabled: js.UndefOr[IsDisabled] = js.undefined,
      topicPattern: js.UndefOr[TopicPattern] = js.undefined,
      createdAt: js.UndefOr[CreatedAtDate] = js.undefined,
      ruleArn: js.UndefOr[RuleArn] = js.undefined): TopicRuleListItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName" -> ruleName.map { x => x.asInstanceOf[js.Any] },
        "ruleDisabled" -> ruleDisabled.map { x => x.asInstanceOf[js.Any] },
        "topicPattern" -> topicPattern.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "ruleArn" -> ruleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TopicRuleListItem]
    }
  }

  /**
   * <p>Describes a rule.</p>
   */
  @js.native
  trait TopicRulePayload extends js.Object {
    var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion]
    var sql: js.UndefOr[SQL]
    var ruleDisabled: js.UndefOr[IsDisabled]
    var description: js.UndefOr[Description]
    var errorAction: js.UndefOr[Action]
    var actions: js.UndefOr[ActionList]
  }

  object TopicRulePayload {
    def apply(
      awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.undefined,
      sql: js.UndefOr[SQL] = js.undefined,
      ruleDisabled: js.UndefOr[IsDisabled] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      errorAction: js.UndefOr[Action] = js.undefined,
      actions: js.UndefOr[ActionList] = js.undefined): TopicRulePayload = {
      val _fields = IndexedSeq[(String, js.Any)](
        "awsIotSqlVersion" -> awsIotSqlVersion.map { x => x.asInstanceOf[js.Any] },
        "sql" -> sql.map { x => x.asInstanceOf[js.Any] },
        "ruleDisabled" -> ruleDisabled.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "errorAction" -> errorAction.map { x => x.asInstanceOf[js.Any] },
        "actions" -> actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TopicRulePayload]
    }
  }

  /**
   * <p>The input for the TransferCertificate operation.</p>
   */
  @js.native
  trait TransferCertificateRequest extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
    var targetAwsAccount: js.UndefOr[AwsAccountId]
    var transferMessage: js.UndefOr[Message]
  }

  object TransferCertificateRequest {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      targetAwsAccount: js.UndefOr[AwsAccountId] = js.undefined,
      transferMessage: js.UndefOr[Message] = js.undefined): TransferCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "targetAwsAccount" -> targetAwsAccount.map { x => x.asInstanceOf[js.Any] },
        "transferMessage" -> transferMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransferCertificateRequest]
    }
  }

  /**
   * <p>The output from the TransferCertificate operation.</p>
   */
  @js.native
  trait TransferCertificateResponse extends js.Object {
    var transferredCertificateArn: js.UndefOr[CertificateArn]
  }

  object TransferCertificateResponse {
    def apply(
      transferredCertificateArn: js.UndefOr[CertificateArn] = js.undefined): TransferCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "transferredCertificateArn" -> transferredCertificateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransferCertificateResponse]
    }
  }

  /**
   * <p>Data used to transfer a certificate to an AWS account.</p>
   */
  @js.native
  trait TransferData extends js.Object {
    var rejectReason: js.UndefOr[Message]
    var rejectDate: js.UndefOr[DateType]
    var transferMessage: js.UndefOr[Message]
    var transferDate: js.UndefOr[DateType]
    var acceptDate: js.UndefOr[DateType]
  }

  object TransferData {
    def apply(
      rejectReason: js.UndefOr[Message] = js.undefined,
      rejectDate: js.UndefOr[DateType] = js.undefined,
      transferMessage: js.UndefOr[Message] = js.undefined,
      transferDate: js.UndefOr[DateType] = js.undefined,
      acceptDate: js.UndefOr[DateType] = js.undefined): TransferData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rejectReason" -> rejectReason.map { x => x.asInstanceOf[js.Any] },
        "rejectDate" -> rejectDate.map { x => x.asInstanceOf[js.Any] },
        "transferMessage" -> transferMessage.map { x => x.asInstanceOf[js.Any] },
        "transferDate" -> transferDate.map { x => x.asInstanceOf[js.Any] },
        "acceptDate" -> acceptDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransferData]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: js.UndefOr[ResourceArn]
    var tagKeys: js.UndefOr[TagKeyList]
  }

  object UntagResourceRequest {
    def apply(
      resourceArn: js.UndefOr[ResourceArn] = js.undefined,
      tagKeys: js.UndefOr[TagKeyList] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "tagKeys" -> tagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {

  }

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateAccountAuditConfigurationRequest extends js.Object {
    var roleArn: js.UndefOr[RoleArn]
    var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations]
    var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations]
  }

  object UpdateAccountAuditConfigurationRequest {
    def apply(
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.undefined,
      auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.undefined): UpdateAccountAuditConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "auditNotificationTargetConfigurations" -> auditNotificationTargetConfigurations.map { x => x.asInstanceOf[js.Any] },
        "auditCheckConfigurations" -> auditCheckConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountAuditConfigurationRequest]
    }
  }

  @js.native
  trait UpdateAccountAuditConfigurationResponse extends js.Object {

  }

  object UpdateAccountAuditConfigurationResponse {
    def apply(): UpdateAccountAuditConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountAuditConfigurationResponse]
    }
  }

  @js.native
  trait UpdateAuthorizerRequest extends js.Object {
    var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap]
    var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn]
    var authorizerName: js.UndefOr[AuthorizerName]
    var status: js.UndefOr[AuthorizerStatus]
    var tokenKeyName: js.UndefOr[TokenKeyName]
  }

  object UpdateAuthorizerRequest {
    def apply(
      tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined,
      authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.undefined,
      authorizerName: js.UndefOr[AuthorizerName] = js.undefined,
      status: js.UndefOr[AuthorizerStatus] = js.undefined,
      tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined): UpdateAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tokenSigningPublicKeys" -> tokenSigningPublicKeys.map { x => x.asInstanceOf[js.Any] },
        "authorizerFunctionArn" -> authorizerFunctionArn.map { x => x.asInstanceOf[js.Any] },
        "authorizerName" -> authorizerName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "tokenKeyName" -> tokenKeyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAuthorizerRequest]
    }
  }

  @js.native
  trait UpdateAuthorizerResponse extends js.Object {
    var authorizerName: js.UndefOr[AuthorizerName]
    var authorizerArn: js.UndefOr[AuthorizerArn]
  }

  object UpdateAuthorizerResponse {
    def apply(
      authorizerName: js.UndefOr[AuthorizerName] = js.undefined,
      authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined): UpdateAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.map { x => x.asInstanceOf[js.Any] },
        "authorizerArn" -> authorizerArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAuthorizerResponse]
    }
  }

  @js.native
  trait UpdateBillingGroupRequest extends js.Object {
    var billingGroupName: js.UndefOr[BillingGroupName]
    var billingGroupProperties: js.UndefOr[BillingGroupProperties]
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object UpdateBillingGroupRequest {
    def apply(
      billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
      billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined,
      expectedVersion: js.UndefOr[OptionalVersion] = js.undefined): UpdateBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName" -> billingGroupName.map { x => x.asInstanceOf[js.Any] },
        "billingGroupProperties" -> billingGroupProperties.map { x => x.asInstanceOf[js.Any] },
        "expectedVersion" -> expectedVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBillingGroupRequest]
    }
  }

  @js.native
  trait UpdateBillingGroupResponse extends js.Object {
    var version: js.UndefOr[Version]
  }

  object UpdateBillingGroupResponse {
    def apply(
      version: js.UndefOr[Version] = js.undefined): UpdateBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBillingGroupResponse]
    }
  }

  /**
   * <p>The input to the UpdateCACertificate operation.</p>
   */
  @js.native
  trait UpdateCACertificateRequest extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
    var newStatus: js.UndefOr[CACertificateStatus]
    var removeAutoRegistration: js.UndefOr[RemoveAutoRegistration]
    var newAutoRegistrationStatus: js.UndefOr[AutoRegistrationStatus]
    var registrationConfig: js.UndefOr[RegistrationConfig]
  }

  object UpdateCACertificateRequest {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      newStatus: js.UndefOr[CACertificateStatus] = js.undefined,
      removeAutoRegistration: js.UndefOr[RemoveAutoRegistration] = js.undefined,
      newAutoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.undefined,
      registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined): UpdateCACertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "newStatus" -> newStatus.map { x => x.asInstanceOf[js.Any] },
        "removeAutoRegistration" -> removeAutoRegistration.map { x => x.asInstanceOf[js.Any] },
        "newAutoRegistrationStatus" -> newAutoRegistrationStatus.map { x => x.asInstanceOf[js.Any] },
        "registrationConfig" -> registrationConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCACertificateRequest]
    }
  }

  /**
   * <p>The input for the UpdateCertificate operation.</p>
   */
  @js.native
  trait UpdateCertificateRequest extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
    var newStatus: js.UndefOr[CertificateStatus]
  }

  object UpdateCertificateRequest {
    def apply(
      certificateId: js.UndefOr[CertificateId] = js.undefined,
      newStatus: js.UndefOr[CertificateStatus] = js.undefined): UpdateCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.map { x => x.asInstanceOf[js.Any] },
        "newStatus" -> newStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCertificateRequest]
    }
  }

  @js.native
  trait UpdateDynamicThingGroupRequest extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var expectedVersion: js.UndefOr[OptionalVersion]
    var queryString: js.UndefOr[QueryString]
    var indexName: js.UndefOr[IndexName]
    var thingGroupProperties: js.UndefOr[ThingGroupProperties]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  object UpdateDynamicThingGroupRequest {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      expectedVersion: js.UndefOr[OptionalVersion] = js.undefined,
      queryString: js.UndefOr[QueryString] = js.undefined,
      indexName: js.UndefOr[IndexName] = js.undefined,
      thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined,
      queryVersion: js.UndefOr[QueryVersion] = js.undefined): UpdateDynamicThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "expectedVersion" -> expectedVersion.map { x => x.asInstanceOf[js.Any] },
        "queryString" -> queryString.map { x => x.asInstanceOf[js.Any] },
        "indexName" -> indexName.map { x => x.asInstanceOf[js.Any] },
        "thingGroupProperties" -> thingGroupProperties.map { x => x.asInstanceOf[js.Any] },
        "queryVersion" -> queryVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDynamicThingGroupRequest]
    }
  }

  @js.native
  trait UpdateDynamicThingGroupResponse extends js.Object {
    var version: js.UndefOr[Version]
  }

  object UpdateDynamicThingGroupResponse {
    def apply(
      version: js.UndefOr[Version] = js.undefined): UpdateDynamicThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDynamicThingGroupResponse]
    }
  }

  @js.native
  trait UpdateEventConfigurationsRequest extends js.Object {
    var eventConfigurations: js.UndefOr[EventConfigurations]
  }

  object UpdateEventConfigurationsRequest {
    def apply(
      eventConfigurations: js.UndefOr[EventConfigurations] = js.undefined): UpdateEventConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventConfigurations" -> eventConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEventConfigurationsRequest]
    }
  }

  @js.native
  trait UpdateEventConfigurationsResponse extends js.Object {

  }

  object UpdateEventConfigurationsResponse {
    def apply(): UpdateEventConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEventConfigurationsResponse]
    }
  }

  @js.native
  trait UpdateIndexingConfigurationRequest extends js.Object {
    var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration]
    var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration]
  }

  object UpdateIndexingConfigurationRequest {
    def apply(
      thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.undefined,
      thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.undefined): UpdateIndexingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingIndexingConfiguration" -> thingIndexingConfiguration.map { x => x.asInstanceOf[js.Any] },
        "thingGroupIndexingConfiguration" -> thingGroupIndexingConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIndexingConfigurationRequest]
    }
  }

  @js.native
  trait UpdateIndexingConfigurationResponse extends js.Object {

  }

  object UpdateIndexingConfigurationResponse {
    def apply(): UpdateIndexingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIndexingConfigurationResponse]
    }
  }

  @js.native
  trait UpdateJobRequest extends js.Object {
    var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig]
    var description: js.UndefOr[JobDescription]
    var presignedUrlConfig: js.UndefOr[PresignedUrlConfig]
    var jobId: js.UndefOr[JobId]
    var abortConfig: js.UndefOr[AbortConfig]
    var timeoutConfig: js.UndefOr[TimeoutConfig]
  }

  object UpdateJobRequest {
    def apply(
      jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined,
      description: js.UndefOr[JobDescription] = js.undefined,
      presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      abortConfig: js.UndefOr[AbortConfig] = js.undefined,
      timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined): UpdateJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobExecutionsRolloutConfig" -> jobExecutionsRolloutConfig.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "presignedUrlConfig" -> presignedUrlConfig.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "abortConfig" -> abortConfig.map { x => x.asInstanceOf[js.Any] },
        "timeoutConfig" -> timeoutConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobRequest]
    }
  }

  @js.native
  trait UpdateRoleAliasRequest extends js.Object {
    var roleAlias: js.UndefOr[RoleAlias]
    var roleArn: js.UndefOr[RoleArn]
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds]
  }

  object UpdateRoleAliasRequest {
    def apply(
      roleAlias: js.UndefOr[RoleAlias] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined): UpdateRoleAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAlias" -> roleAlias.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "credentialDurationSeconds" -> credentialDurationSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRoleAliasRequest]
    }
  }

  @js.native
  trait UpdateRoleAliasResponse extends js.Object {
    var roleAlias: js.UndefOr[RoleAlias]
    var roleAliasArn: js.UndefOr[RoleAliasArn]
  }

  object UpdateRoleAliasResponse {
    def apply(
      roleAlias: js.UndefOr[RoleAlias] = js.undefined,
      roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined): UpdateRoleAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAlias" -> roleAlias.map { x => x.asInstanceOf[js.Any] },
        "roleAliasArn" -> roleAliasArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRoleAliasResponse]
    }
  }

  @js.native
  trait UpdateScheduledAuditRequest extends js.Object {
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
    var dayOfWeek: js.UndefOr[DayOfWeek]
    var targetCheckNames: js.UndefOr[TargetAuditCheckNames]
    var dayOfMonth: js.UndefOr[DayOfMonth]
    var frequency: js.UndefOr[AuditFrequency]
  }

  object UpdateScheduledAuditRequest {
    def apply(
      scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined,
      dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
      targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined,
      dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
      frequency: js.UndefOr[AuditFrequency] = js.undefined): UpdateScheduledAuditRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditName" -> scheduledAuditName.map { x => x.asInstanceOf[js.Any] },
        "dayOfWeek" -> dayOfWeek.map { x => x.asInstanceOf[js.Any] },
        "targetCheckNames" -> targetCheckNames.map { x => x.asInstanceOf[js.Any] },
        "dayOfMonth" -> dayOfMonth.map { x => x.asInstanceOf[js.Any] },
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateScheduledAuditRequest]
    }
  }

  @js.native
  trait UpdateScheduledAuditResponse extends js.Object {
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
  }

  object UpdateScheduledAuditResponse {
    def apply(
      scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined): UpdateScheduledAuditResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditArn" -> scheduledAuditArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateScheduledAuditResponse]
    }
  }

  @js.native
  trait UpdateSecurityProfileRequest extends js.Object {
    var expectedVersion: js.UndefOr[OptionalVersion]
    var behaviors: js.UndefOr[Behaviors]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription]
    var alertTargets: js.UndefOr[AlertTargets]
  }

  object UpdateSecurityProfileRequest {
    def apply(
      expectedVersion: js.UndefOr[OptionalVersion] = js.undefined,
      behaviors: js.UndefOr[Behaviors] = js.undefined,
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
      securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined,
      alertTargets: js.UndefOr[AlertTargets] = js.undefined): UpdateSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "expectedVersion" -> expectedVersion.map { x => x.asInstanceOf[js.Any] },
        "behaviors" -> behaviors.map { x => x.asInstanceOf[js.Any] },
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] },
        "securityProfileDescription" -> securityProfileDescription.map { x => x.asInstanceOf[js.Any] },
        "alertTargets" -> alertTargets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecurityProfileRequest]
    }
  }

  @js.native
  trait UpdateSecurityProfileResponse extends js.Object {
    var lastModifiedDate: js.UndefOr[Timestamp]
    var securityProfileArn: js.UndefOr[SecurityProfileArn]
    var version: js.UndefOr[Version]
    var behaviors: js.UndefOr[Behaviors]
    var creationDate: js.UndefOr[Timestamp]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription]
    var alertTargets: js.UndefOr[AlertTargets]
  }

  object UpdateSecurityProfileResponse {
    def apply(
      lastModifiedDate: js.UndefOr[Timestamp] = js.undefined,
      securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      behaviors: js.UndefOr[Behaviors] = js.undefined,
      creationDate: js.UndefOr[Timestamp] = js.undefined,
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
      securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined,
      alertTargets: js.UndefOr[AlertTargets] = js.undefined): UpdateSecurityProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "securityProfileArn" -> securityProfileArn.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "behaviors" -> behaviors.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] },
        "securityProfileDescription" -> securityProfileDescription.map { x => x.asInstanceOf[js.Any] },
        "alertTargets" -> alertTargets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecurityProfileResponse]
    }
  }

  @js.native
  trait UpdateStreamRequest extends js.Object {
    var streamId: js.UndefOr[StreamId]
    var description: js.UndefOr[StreamDescription]
    var files: js.UndefOr[StreamFiles]
    var roleArn: js.UndefOr[RoleArn]
  }

  object UpdateStreamRequest {
    def apply(
      streamId: js.UndefOr[StreamId] = js.undefined,
      description: js.UndefOr[StreamDescription] = js.undefined,
      files: js.UndefOr[StreamFiles] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined): UpdateStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamId" -> streamId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "files" -> files.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStreamRequest]
    }
  }

  @js.native
  trait UpdateStreamResponse extends js.Object {
    var streamId: js.UndefOr[StreamId]
    var streamArn: js.UndefOr[StreamArn]
    var description: js.UndefOr[StreamDescription]
    var streamVersion: js.UndefOr[StreamVersion]
  }

  object UpdateStreamResponse {
    def apply(
      streamId: js.UndefOr[StreamId] = js.undefined,
      streamArn: js.UndefOr[StreamArn] = js.undefined,
      description: js.UndefOr[StreamDescription] = js.undefined,
      streamVersion: js.UndefOr[StreamVersion] = js.undefined): UpdateStreamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamId" -> streamId.map { x => x.asInstanceOf[js.Any] },
        "streamArn" -> streamArn.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "streamVersion" -> streamVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStreamResponse]
    }
  }

  @js.native
  trait UpdateThingGroupRequest extends js.Object {
    var thingGroupName: js.UndefOr[ThingGroupName]
    var thingGroupProperties: js.UndefOr[ThingGroupProperties]
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object UpdateThingGroupRequest {
    def apply(
      thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
      thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined,
      expectedVersion: js.UndefOr[OptionalVersion] = js.undefined): UpdateThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.map { x => x.asInstanceOf[js.Any] },
        "thingGroupProperties" -> thingGroupProperties.map { x => x.asInstanceOf[js.Any] },
        "expectedVersion" -> expectedVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThingGroupRequest]
    }
  }

  @js.native
  trait UpdateThingGroupResponse extends js.Object {
    var version: js.UndefOr[Version]
  }

  object UpdateThingGroupResponse {
    def apply(
      version: js.UndefOr[Version] = js.undefined): UpdateThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThingGroupResponse]
    }
  }

  @js.native
  trait UpdateThingGroupsForThingRequest extends js.Object {
    var thingName: js.UndefOr[ThingName]
    var thingGroupsToAdd: js.UndefOr[ThingGroupList]
    var thingGroupsToRemove: js.UndefOr[ThingGroupList]
    var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups]
  }

  object UpdateThingGroupsForThingRequest {
    def apply(
      thingName: js.UndefOr[ThingName] = js.undefined,
      thingGroupsToAdd: js.UndefOr[ThingGroupList] = js.undefined,
      thingGroupsToRemove: js.UndefOr[ThingGroupList] = js.undefined,
      overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined): UpdateThingGroupsForThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "thingGroupsToAdd" -> thingGroupsToAdd.map { x => x.asInstanceOf[js.Any] },
        "thingGroupsToRemove" -> thingGroupsToRemove.map { x => x.asInstanceOf[js.Any] },
        "overrideDynamicGroups" -> overrideDynamicGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThingGroupsForThingRequest]
    }
  }

  @js.native
  trait UpdateThingGroupsForThingResponse extends js.Object {

  }

  object UpdateThingGroupsForThingResponse {
    def apply(): UpdateThingGroupsForThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThingGroupsForThingResponse]
    }
  }

  /**
   * <p>The input for the UpdateThing operation.</p>
   */
  @js.native
  trait UpdateThingRequest extends js.Object {
    var expectedVersion: js.UndefOr[OptionalVersion]
    var attributePayload: js.UndefOr[AttributePayload]
    var removeThingType: js.UndefOr[RemoveThingType]
    var thingName: js.UndefOr[ThingName]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  object UpdateThingRequest {
    def apply(
      expectedVersion: js.UndefOr[OptionalVersion] = js.undefined,
      attributePayload: js.UndefOr[AttributePayload] = js.undefined,
      removeThingType: js.UndefOr[RemoveThingType] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      thingTypeName: js.UndefOr[ThingTypeName] = js.undefined): UpdateThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "expectedVersion" -> expectedVersion.map { x => x.asInstanceOf[js.Any] },
        "attributePayload" -> attributePayload.map { x => x.asInstanceOf[js.Any] },
        "removeThingType" -> removeThingType.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "thingTypeName" -> thingTypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThingRequest]
    }
  }

  /**
   * <p>The output from the UpdateThing operation.</p>
   */
  @js.native
  trait UpdateThingResponse extends js.Object {

  }

  object UpdateThingResponse {
    def apply(): UpdateThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThingResponse]
    }
  }

  @js.native
  trait ValidateSecurityProfileBehaviorsRequest extends js.Object {
    var behaviors: js.UndefOr[Behaviors]
  }

  object ValidateSecurityProfileBehaviorsRequest {
    def apply(
      behaviors: js.UndefOr[Behaviors] = js.undefined): ValidateSecurityProfileBehaviorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "behaviors" -> behaviors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateSecurityProfileBehaviorsRequest]
    }
  }

  @js.native
  trait ValidateSecurityProfileBehaviorsResponse extends js.Object {
    var valid: js.UndefOr[Valid]
    var validationErrors: js.UndefOr[ValidationErrors]
  }

  object ValidateSecurityProfileBehaviorsResponse {
    def apply(
      valid: js.UndefOr[Valid] = js.undefined,
      validationErrors: js.UndefOr[ValidationErrors] = js.undefined): ValidateSecurityProfileBehaviorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "valid" -> valid.map { x => x.asInstanceOf[js.Any] },
        "validationErrors" -> validationErrors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateSecurityProfileBehaviorsResponse]
    }
  }

  /**
   * <p>Information about an error found in a behavior specification.</p>
   */
  @js.native
  trait ValidationError extends js.Object {
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object ValidationError {
    def apply(
      errorMessage: js.UndefOr[ErrorMessage] = js.undefined): ValidationError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "errorMessage" -> errorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidationError]
    }
  }

  /**
   * <p>Information about a Device Defender security profile behavior violation.</p>
   */
  @js.native
  trait ViolationEvent extends js.Object {
    var violationEventTime: js.UndefOr[Timestamp]
    var thingName: js.UndefOr[ThingName]
    var violationEventType: js.UndefOr[ViolationEventType]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var metricValue: js.UndefOr[MetricValue]
    var behavior: js.UndefOr[Behavior]
    var violationId: js.UndefOr[ViolationId]
  }

  object ViolationEvent {
    def apply(
      violationEventTime: js.UndefOr[Timestamp] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      violationEventType: js.UndefOr[ViolationEventType] = js.undefined,
      securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
      metricValue: js.UndefOr[MetricValue] = js.undefined,
      behavior: js.UndefOr[Behavior] = js.undefined,
      violationId: js.UndefOr[ViolationId] = js.undefined): ViolationEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "violationEventTime" -> violationEventTime.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "violationEventType" -> violationEventType.map { x => x.asInstanceOf[js.Any] },
        "securityProfileName" -> securityProfileName.map { x => x.asInstanceOf[js.Any] },
        "metricValue" -> metricValue.map { x => x.asInstanceOf[js.Any] },
        "behavior" -> behavior.map { x => x.asInstanceOf[js.Any] },
        "violationId" -> violationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ViolationEvent]
    }
  }

  object ViolationEventTypeEnum {
    val `in-alarm` = "in-alarm"
    val `alarm-cleared` = "alarm-cleared"
    val `alarm-invalidated` = "alarm-invalidated"

    val values = IndexedSeq(`in-alarm`, `alarm-cleared`, `alarm-invalidated`)
  }
}
