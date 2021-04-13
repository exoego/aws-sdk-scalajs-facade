package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object iot {
  type AbortCriteriaList = js.Array[AbortCriteria]
  type AbortThresholdPercentage = Double
  type AcmCertificateArn = String
  type ActionList = js.Array[Action]
  type ActiveViolations = js.Array[ActiveViolation]
  type AdditionalMetricsToRetainList = js.Array[BehaviorMetric]
  type AdditionalMetricsToRetainV2List = js.Array[MetricToRetain]
  type AdditionalParameterMap = js.Dictionary[Value]
  type AggregationField = String
  type AlarmName = String
  type AlertTargetArn = String
  type AlertTargets = js.Dictionary[AlertTarget]
  type AllowAuthorizerOverride = Boolean
  type AllowAutoRegistration = Boolean
  type ApproximateSecondsBeforeTimedOut = Double
  type AscendingOrder = Boolean
  type AssetId = String
  type AssetPropertyAlias = String
  type AssetPropertyBooleanValue = String
  type AssetPropertyDoubleValue = String
  type AssetPropertyEntryId = String
  type AssetPropertyId = String
  type AssetPropertyIntegerValue = String
  type AssetPropertyOffsetInNanos = String
  type AssetPropertyQuality = String
  type AssetPropertyStringValue = String
  type AssetPropertyTimeInSeconds = String
  type AssetPropertyValueList = js.Array[AssetPropertyValue]
  type AttributeKey = String
  type AttributeName = String
  type AttributeValue = String
  type Attributes = js.Dictionary[AttributeValue]
  type AttributesMap = js.Dictionary[Value]
  type AuditCheckConfigurations = js.Dictionary[AuditCheckConfiguration]
  type AuditCheckName = String
  type AuditCheckToActionsMapping = js.Dictionary[MitigationActionNameList]
  type AuditCheckToReasonCodeFilter = js.Dictionary[ReasonForNonComplianceCodes]
  type AuditDescription = String
  type AuditDetails = js.Dictionary[AuditCheckDetails]
  type AuditFindings = js.Array[AuditFinding]
  type AuditMitigationActionExecutionMetadataList = js.Array[AuditMitigationActionExecutionMetadata]
  type AuditMitigationActionsTaskMetadataList = js.Array[AuditMitigationActionsTaskMetadata]
  type AuditMitigationActionsTaskStatistics = js.Dictionary[TaskStatisticsForAuditCheck]
  type AuditNotificationTargetConfigurations = js.Dictionary[AuditNotificationTarget]
  type AuditSuppressionList = js.Array[AuditSuppression]
  type AuditTaskId = String
  type AuditTaskMetadataList = js.Array[AuditTaskMetadata]
  type AuthInfos = js.Array[AuthInfo]
  type AuthResults = js.Array[AuthResult]
  type AuthorizerArn = String
  type AuthorizerFunctionArn = String
  type AuthorizerName = String
  type Authorizers = js.Array[AuthorizerSummary]
  type Average = Double
  type AwsAccountId = String
  type AwsArn = String
  type AwsIotJobArn = String
  type AwsIotJobId = String
  type AwsIotSqlVersion = String
  type AwsJobAbortCriteriaAbortThresholdPercentage = Double
  type AwsJobAbortCriteriaList = js.Array[AwsJobAbortCriteria]
  type AwsJobAbortCriteriaMinimumNumberOfExecutedThings = Int
  type AwsJobRateIncreaseCriteriaNumberOfThings = Int
  type AwsJobRolloutIncrementFactor = Double
  type AwsJobRolloutRatePerMinute = Int
  type AwsJobTimeoutInProgressTimeoutInMinutes = Double
  type BatchMode = Boolean
  type BehaviorMetric = String
  type BehaviorModelTrainingSummaries = js.Array[BehaviorModelTrainingSummary]
  type BehaviorName = String
  type Behaviors = js.Array[Behavior]
  type BillingGroupArn = String
  type BillingGroupDescription = String
  type BillingGroupId = String
  type BillingGroupName = String
  type BillingGroupNameAndArnList = js.Array[GroupNameAndArn]
  type BooleanKey = Boolean
  type BucketName = String
  type CACertificates = js.Array[CACertificate]
  type CanceledChecksCount = Int
  type CanceledFindingsCount = Double
  type CanceledThings = Int
  type CertificateArn = String
  type CertificateId = String
  type CertificateName = String
  type CertificatePathOnDevice = String
  type CertificatePem = String
  type CertificateSigningRequest = String
  type Certificates = js.Array[Certificate]
  type ChannelName = String
  type CheckCompliant = Boolean
  type Cidr = String
  type Cidrs = js.Array[Cidr]
  type ClientId = String
  type ClientProperties = js.Dictionary[String]
  type ClientRequestToken = String
  type Code = String
  type CognitoIdentityPoolId = String
  type Comment = String
  type CompliantChecksCount = Int
  type ConfirmationToken = String
  type ConnectivityTimestamp = Double
  type ConsecutiveDatapointsToAlarm = Int
  type ConsecutiveDatapointsToClear = Int
  type Count = Int
  type CreatedAtDate = js.Date
  type CreationDate = js.Date
  type CredentialDurationSeconds = Int
  type CustomMetricArn = String
  type CustomMetricDisplayName = String
  type CustomerVersion = Int
  type DataCollectionPercentage = Double
  type DateType = js.Date
  type DayOfMonth = String
  type DeleteAdditionalMetricsToRetain = Boolean
  type DeleteAlertTargets = Boolean
  type DeleteBehaviors = Boolean
  type DeleteScheduledAudits = Boolean
  type DeleteStream = Boolean
  type DeliveryStreamName = String
  type DeprecationDate = js.Date
  type Description = String
  type DetailsKey = String
  type DetailsMap = js.Dictionary[DetailsValue]
  type DetailsValue = String
  type DetectMitigationActionExecutionErrorCode = String
  type DetectMitigationActionExecutionList = js.Array[DetectMitigationActionExecution]
  type DetectMitigationActionsTaskSummaryList = js.Array[DetectMitigationActionsTaskSummary]
  type DetectMitigationActionsToExecuteList = js.Array[MitigationActionName]
  type DeviceDefenderThingName = String
  type DimensionArn = String
  type DimensionName = String
  type DimensionNames = js.Array[DimensionName]
  type DimensionStringValue = String
  type DimensionStringValues = js.Array[DimensionStringValue]
  type DisableAllLogs = Boolean
  type DomainConfigurationArn = String
  type DomainConfigurationName = String
  type DomainConfigurations = js.Array[DomainConfigurationSummary]
  type DomainName = String
  type DurationSeconds = Int
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
  type EvaluationStatistic = String
  type EventConfigurations = js.Dictionary[Configuration]
  type ExecutionNamePrefix = String
  type ExecutionNumber = Double
  type ExpectedVersion = Double
  type ExpiresInSec = Double
  type ExpiresInSeconds = Double
  type FailedChecksCount = Int
  type FailedFindingsCount = Double
  type FailedThings = Int
  type FieldName = String
  type Fields = js.Array[Field]
  type FileId = Int
  type FileName = String
  type FileType = Int
  type FindingId = String
  type FindingIds = js.Array[FindingId]
  type FirehoseSeparator = String
  type Flag = Boolean
  type ForceDelete = Boolean
  type ForceDeleteAWSJob = Boolean
  type ForceFlag = Boolean
  type Forced = Boolean
  type FunctionArn = String
  type GenerationId = String
  type GenericLongValue = Double
  type HashAlgorithm = String
  type HashKeyField = String
  type HashKeyValue = String
  type HeaderKey = String
  type HeaderList = js.Array[HttpActionHeader]
  type HeaderValue = String
  type HttpHeaderName = String
  type HttpHeaderValue = String
  type HttpHeaders = js.Dictionary[HttpHeaderValue]
  type HttpQueryString = String
  type InProgressChecksCount = Int
  type InProgressThings = Int
  type InProgressTimeoutInMinutes = Double
  type IncrementFactor = Double
  type IndexName = String
  type IndexNamesList = js.Array[IndexName]
  type IndexSchema = String
  type InlineDocument = String
  type InputName = String
  type IsAuthenticated = Boolean
  type IsDefaultVersion = Boolean
  type IsDisabled = Boolean
  type IsSuppressed = Boolean
  type JobArn = String
  type JobDescription = String
  type JobDocument = String
  type JobDocumentSource = String
  type JobExecutionSummaryForJobList = js.Array[JobExecutionSummaryForJob]
  type JobExecutionSummaryForThingList = js.Array[JobExecutionSummaryForThing]
  type JobId = String
  type JobSummaryList = js.Array[JobSummary]
  type JobTargets = js.Array[TargetArn]
  type JsonDocument = String
  type Key = String
  type KeyName = String
  type KeyValue = String
  type LaserMaxResults = Int
  type LastModifiedDate = js.Date
  type LastUpdatedAtDate = js.Date
  type ListSuppressedAlerts = Boolean
  type ListSuppressedFindings = Boolean
  type LogGroupName = String
  type LogTargetConfigurations = js.Array[LogTargetConfiguration]
  type LogTargetName = String
  type Marker = String
  type MaxJobExecutionsPerMin = Int
  type MaxResults = Int
  type Maximum = Double
  type MaximumPerMinute = Int
  type Message = String
  type MessageId = String
  type MetricName = String
  type MetricNames = js.Array[MetricName]
  type Minimum = Double
  type MinimumNumberOfExecutedThings = Int
  type MissingContextValue = String
  type MissingContextValues = js.Array[MissingContextValue]
  type MitigationActionArn = String
  type MitigationActionId = String
  type MitigationActionIdentifierList = js.Array[MitigationActionIdentifier]
  type MitigationActionList = js.Array[MitigationAction]
  type MitigationActionName = String
  type MitigationActionNameList = js.Array[MitigationActionName]
  type MitigationActionsTaskId = String
  type MqttClientId = String
  type MqttPassword = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type MqttUsername = String
  type NamespaceId = String
  type NextToken = String
  type NonCompliantChecksCount = Int
  type NonCompliantResourcesCount = Double
  type NullableBoolean = Boolean
  type Number = Double
  type NumberList = js.Array[Number]
  type NumberOfThings = Int
  type OTAUpdateArn = String
  type OTAUpdateDescription = String
  type OTAUpdateErrorMessage = String
  type OTAUpdateFileVersion = String
  type OTAUpdateFiles = js.Array[OTAUpdateFile]
  type OTAUpdateId = String
  type OTAUpdatesSummary = js.Array[OTAUpdateSummary]
  type OptionalVersion = Double
  type OutgoingCertificates = js.Array[OutgoingCertificate]
  type OverrideDynamicGroups = Boolean
  type PageSize = Int
  type Parameter = String
  type Parameters = js.Dictionary[Value]
  type PartitionKey = String
  type PayloadField = String
  type PayloadVersion = String
  type Percent = Double
  type PercentList = js.Array[Percent]
  type PercentValue = Double
  type Percentage = Int
  type Percentiles = js.Array[PercentPair]
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
  type PrimitiveBoolean = Boolean
  type Principal = String
  type PrincipalArn = String
  type PrincipalId = String
  type Principals = js.Array[PrincipalArn]
  type PrivateKey = String
  type ProcessingTargetName = String
  type ProcessingTargetNameList = js.Array[ProcessingTargetName]
  type Protocols = js.Array[Protocol]
  type ProvisioningTemplateListing = js.Array[ProvisioningTemplateSummary]
  type ProvisioningTemplateVersionListing = js.Array[ProvisioningTemplateVersionSummary]
  type PublicKey = String
  type PublicKeyMap = js.Dictionary[KeyValue]
  type PutAssetPropertyValueEntryList = js.Array[PutAssetPropertyValueEntry]
  type Qos = Int
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
  type ReasonForNonComplianceCodes = js.Array[ReasonForNonComplianceCode]
  type Recursive = Boolean
  type RecursiveWithoutDefault = Boolean
  type RegistrationCode = String
  type RegistryMaxResults = Int
  type RegistryS3BucketName = String
  type RegistryS3KeyName = String
  type RejectedThings = Int
  type RelatedResources = js.Array[RelatedResource]
  type RemoveAuthorizerConfig = Boolean
  type RemoveAutoRegistration = Boolean
  type RemoveHook = Boolean
  type RemoveThingType = Boolean
  type RemovedThings = Int
  type ReservedDomainConfigurationName = String
  type Resource = String
  type ResourceArn = String
  type ResourceArns = js.Dictionary[ResourceArn]
  type ResourceLogicalId = String
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
  type SecurityGroupId = String
  type SecurityGroupList = js.Array[SecurityGroupId]
  type SecurityProfileArn = String
  type SecurityProfileDescription = String
  type SecurityProfileIdentifiers = js.Array[SecurityProfileIdentifier]
  type SecurityProfileName = String
  type SecurityProfileTargetArn = String
  type SecurityProfileTargetMappings = js.Array[SecurityProfileTargetMapping]
  type SecurityProfileTargets = js.Array[SecurityProfileTarget]
  type ServerCertificateArns = js.Array[AcmCertificateArn]
  type ServerCertificateStatusDetail = String
  type ServerCertificates = js.Array[ServerCertificateSummary]
  type ServerName = String
  type ServiceName = String
  type SetAsActive = Boolean
  type SetAsActiveFlag = Boolean
  type SetAsDefault = Boolean
  type Signature = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SignatureAlgorithm = String
  type SigningJobId = String
  type SigningProfileName = String
  type SigningRegion = String
  type SkippedFindingsCount = Double
  type SkyfallMaxResults = Int
  type SnsTopicArn = String
  type StateMachineName = String
  type StateReason = String
  type StateValue = String
  type StdDeviation = Double
  type StreamArn = String
  type StreamDescription = String
  type StreamFiles = js.Array[StreamFile]
  type StreamId = String
  type StreamName = String
  type StreamVersion = Int
  type StreamsSummary = js.Array[StreamSummary]
  type StringList = js.Array[stringValue]
  type StringMap = js.Dictionary[String]
  type SubnetId = String
  type SubnetIdList = js.Array[SubnetId]
  type SucceededFindingsCount = Double
  type SucceededThings = Int
  type Sum = Double
  type SumOfSquares = Double
  type SuppressAlerts = Boolean
  type SuppressIndefinitely = Boolean
  type SuppressedNonCompliantResourcesCount = Double
  type TableName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Target = String
  type TargetArn = String
  type TargetAuditCheckNames = js.Array[AuditCheckName]
  type TargetViolationIdsForDetectMitigationActions = js.Array[ViolationId]
  type Targets = js.Array[Target]
  type TaskId = String
  type TaskIdList = js.Array[TaskId]
  type TemplateArn = String
  type TemplateBody = String
  type TemplateDescription = String
  type TemplateName = String
  type TemplateVersionId = Int
  type ThingArn = String
  type ThingAttributeList = js.Array[ThingAttribute]
  type ThingDocumentList = js.Array[ThingDocument]
  type ThingGroupArn = String
  type ThingGroupDescription = String
  type ThingGroupDocumentList = js.Array[ThingGroupDocument]
  type ThingGroupId = String
  type ThingGroupList = js.Array[ThingGroupName]
  type ThingGroupName = String
  type ThingGroupNameAndArnList = js.Array[GroupNameAndArn]
  type ThingGroupNameList = js.Array[ThingGroupName]
  type ThingGroupNames = js.Array[ThingGroupName]
  type ThingId = String
  type ThingName = String
  type ThingNameList = js.Array[ThingName]
  type ThingTypeArn = String
  type ThingTypeDescription = String
  type ThingTypeId = String
  type ThingTypeList = js.Array[ThingTypeDefinition]
  type ThingTypeName = String
  type TimedOutThings = Int
  type Timestamp = js.Date
  type TimestreamDatabaseName = String
  type TimestreamDimensionList = js.Array[TimestreamDimension]
  type TimestreamDimensionName = String
  type TimestreamDimensionValue = String
  type TimestreamTableName = String
  type TimestreamTimestampUnit = String
  type TimestreamTimestampValue = String
  type TinyMaxResults = Int
  type Token = String
  type TokenKeyName = String
  type TokenSignature = String
  type Topic = String
  type TopicPattern = String
  type TopicRuleDestinationMaxResults = Int
  type TopicRuleDestinationSummaries = js.Array[TopicRuleDestinationSummary]
  type TopicRuleList = js.Array[TopicRuleListItem]
  type TopicRuleMaxResults = Int
  type TotalChecksCount = Int
  type TotalFindingsCount = Double
  type TotalResourcesCount = Double
  type UndoDeprecate = Boolean
  type UnsignedLong = Double
  type Url = String
  type UseBase64 = Boolean
  type Valid = Boolean
  type ValidationErrors = js.Array[ValidationError]
  type Value = String
  type Variance = Double
  type Version = Double
  type VersionNumber = Double
  type ViolationEvents = js.Array[ViolationEvent]
  type ViolationId = String
  type VpcId = String
  type WaitingForDataCollectionChecksCount = Int
  type stringValue = String
  type usePrefixAttributeValue = Boolean

  implicit final class IotOps(private val service: Iot) extends AnyVal {

    @inline def acceptCertificateTransferFuture(params: AcceptCertificateTransferRequest): Future[js.Object] = service.acceptCertificateTransfer(params).promise().toFuture
    @inline def addThingToBillingGroupFuture(params: AddThingToBillingGroupRequest): Future[AddThingToBillingGroupResponse] = service.addThingToBillingGroup(params).promise().toFuture
    @inline def addThingToThingGroupFuture(params: AddThingToThingGroupRequest): Future[AddThingToThingGroupResponse] = service.addThingToThingGroup(params).promise().toFuture
    @inline def associateTargetsWithJobFuture(params: AssociateTargetsWithJobRequest): Future[AssociateTargetsWithJobResponse] = service.associateTargetsWithJob(params).promise().toFuture
    @inline def attachPolicyFuture(params: AttachPolicyRequest): Future[js.Object] = service.attachPolicy(params).promise().toFuture
    @inline def attachSecurityProfileFuture(params: AttachSecurityProfileRequest): Future[AttachSecurityProfileResponse] = service.attachSecurityProfile(params).promise().toFuture
    @inline def attachThingPrincipalFuture(params: AttachThingPrincipalRequest): Future[AttachThingPrincipalResponse] = service.attachThingPrincipal(params).promise().toFuture
    @inline def cancelAuditMitigationActionsTaskFuture(params: CancelAuditMitigationActionsTaskRequest): Future[CancelAuditMitigationActionsTaskResponse] = service.cancelAuditMitigationActionsTask(params).promise().toFuture
    @inline def cancelAuditTaskFuture(params: CancelAuditTaskRequest): Future[CancelAuditTaskResponse] = service.cancelAuditTask(params).promise().toFuture
    @inline def cancelCertificateTransferFuture(params: CancelCertificateTransferRequest): Future[js.Object] = service.cancelCertificateTransfer(params).promise().toFuture
    @inline def cancelDetectMitigationActionsTaskFuture(params: CancelDetectMitigationActionsTaskRequest): Future[CancelDetectMitigationActionsTaskResponse] = service.cancelDetectMitigationActionsTask(params).promise().toFuture
    @inline def cancelJobExecutionFuture(params: CancelJobExecutionRequest): Future[js.Object] = service.cancelJobExecution(params).promise().toFuture
    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] = service.cancelJob(params).promise().toFuture
    @inline def clearDefaultAuthorizerFuture(params: ClearDefaultAuthorizerRequest): Future[ClearDefaultAuthorizerResponse] = service.clearDefaultAuthorizer(params).promise().toFuture
    @inline def confirmTopicRuleDestinationFuture(params: ConfirmTopicRuleDestinationRequest): Future[ConfirmTopicRuleDestinationResponse] = service.confirmTopicRuleDestination(params).promise().toFuture
    @inline def createAuditSuppressionFuture(params: CreateAuditSuppressionRequest): Future[CreateAuditSuppressionResponse] = service.createAuditSuppression(params).promise().toFuture
    @inline def createAuthorizerFuture(params: CreateAuthorizerRequest): Future[CreateAuthorizerResponse] = service.createAuthorizer(params).promise().toFuture
    @inline def createBillingGroupFuture(params: CreateBillingGroupRequest): Future[CreateBillingGroupResponse] = service.createBillingGroup(params).promise().toFuture
    @inline def createCertificateFromCsrFuture(params: CreateCertificateFromCsrRequest): Future[CreateCertificateFromCsrResponse] = service.createCertificateFromCsr(params).promise().toFuture
    @inline def createCustomMetricFuture(params: CreateCustomMetricRequest): Future[CreateCustomMetricResponse] = service.createCustomMetric(params).promise().toFuture
    @inline def createDimensionFuture(params: CreateDimensionRequest): Future[CreateDimensionResponse] = service.createDimension(params).promise().toFuture
    @inline def createDomainConfigurationFuture(params: CreateDomainConfigurationRequest): Future[CreateDomainConfigurationResponse] = service.createDomainConfiguration(params).promise().toFuture
    @inline def createDynamicThingGroupFuture(params: CreateDynamicThingGroupRequest): Future[CreateDynamicThingGroupResponse] = service.createDynamicThingGroup(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] = service.createJob(params).promise().toFuture
    @inline def createKeysAndCertificateFuture(params: CreateKeysAndCertificateRequest): Future[CreateKeysAndCertificateResponse] = service.createKeysAndCertificate(params).promise().toFuture
    @inline def createMitigationActionFuture(params: CreateMitigationActionRequest): Future[CreateMitigationActionResponse] = service.createMitigationAction(params).promise().toFuture
    @inline def createOTAUpdateFuture(params: CreateOTAUpdateRequest): Future[CreateOTAUpdateResponse] = service.createOTAUpdate(params).promise().toFuture
    @inline def createPolicyFuture(params: CreatePolicyRequest): Future[CreatePolicyResponse] = service.createPolicy(params).promise().toFuture
    @inline def createPolicyVersionFuture(params: CreatePolicyVersionRequest): Future[CreatePolicyVersionResponse] = service.createPolicyVersion(params).promise().toFuture
    @inline def createProvisioningClaimFuture(params: CreateProvisioningClaimRequest): Future[CreateProvisioningClaimResponse] = service.createProvisioningClaim(params).promise().toFuture
    @inline def createProvisioningTemplateFuture(params: CreateProvisioningTemplateRequest): Future[CreateProvisioningTemplateResponse] = service.createProvisioningTemplate(params).promise().toFuture
    @inline def createProvisioningTemplateVersionFuture(params: CreateProvisioningTemplateVersionRequest): Future[CreateProvisioningTemplateVersionResponse] = service.createProvisioningTemplateVersion(params).promise().toFuture
    @inline def createRoleAliasFuture(params: CreateRoleAliasRequest): Future[CreateRoleAliasResponse] = service.createRoleAlias(params).promise().toFuture
    @inline def createScheduledAuditFuture(params: CreateScheduledAuditRequest): Future[CreateScheduledAuditResponse] = service.createScheduledAudit(params).promise().toFuture
    @inline def createSecurityProfileFuture(params: CreateSecurityProfileRequest): Future[CreateSecurityProfileResponse] = service.createSecurityProfile(params).promise().toFuture
    @inline def createStreamFuture(params: CreateStreamRequest): Future[CreateStreamResponse] = service.createStream(params).promise().toFuture
    @inline def createThingFuture(params: CreateThingRequest): Future[CreateThingResponse] = service.createThing(params).promise().toFuture
    @inline def createThingGroupFuture(params: CreateThingGroupRequest): Future[CreateThingGroupResponse] = service.createThingGroup(params).promise().toFuture
    @inline def createThingTypeFuture(params: CreateThingTypeRequest): Future[CreateThingTypeResponse] = service.createThingType(params).promise().toFuture
    @inline def createTopicRuleDestinationFuture(params: CreateTopicRuleDestinationRequest): Future[CreateTopicRuleDestinationResponse] = service.createTopicRuleDestination(params).promise().toFuture
    @inline def createTopicRuleFuture(params: CreateTopicRuleRequest): Future[js.Object] = service.createTopicRule(params).promise().toFuture
    @inline def deleteAccountAuditConfigurationFuture(params: DeleteAccountAuditConfigurationRequest): Future[DeleteAccountAuditConfigurationResponse] = service.deleteAccountAuditConfiguration(params).promise().toFuture
    @inline def deleteAuditSuppressionFuture(params: DeleteAuditSuppressionRequest): Future[DeleteAuditSuppressionResponse] = service.deleteAuditSuppression(params).promise().toFuture
    @inline def deleteAuthorizerFuture(params: DeleteAuthorizerRequest): Future[DeleteAuthorizerResponse] = service.deleteAuthorizer(params).promise().toFuture
    @inline def deleteBillingGroupFuture(params: DeleteBillingGroupRequest): Future[DeleteBillingGroupResponse] = service.deleteBillingGroup(params).promise().toFuture
    @inline def deleteCACertificateFuture(params: DeleteCACertificateRequest): Future[DeleteCACertificateResponse] = service.deleteCACertificate(params).promise().toFuture
    @inline def deleteCertificateFuture(params: DeleteCertificateRequest): Future[js.Object] = service.deleteCertificate(params).promise().toFuture
    @inline def deleteCustomMetricFuture(params: DeleteCustomMetricRequest): Future[DeleteCustomMetricResponse] = service.deleteCustomMetric(params).promise().toFuture
    @inline def deleteDimensionFuture(params: DeleteDimensionRequest): Future[DeleteDimensionResponse] = service.deleteDimension(params).promise().toFuture
    @inline def deleteDomainConfigurationFuture(params: DeleteDomainConfigurationRequest): Future[DeleteDomainConfigurationResponse] = service.deleteDomainConfiguration(params).promise().toFuture
    @inline def deleteDynamicThingGroupFuture(params: DeleteDynamicThingGroupRequest): Future[DeleteDynamicThingGroupResponse] = service.deleteDynamicThingGroup(params).promise().toFuture
    @inline def deleteJobExecutionFuture(params: DeleteJobExecutionRequest): Future[js.Object] = service.deleteJobExecution(params).promise().toFuture
    @inline def deleteJobFuture(params: DeleteJobRequest): Future[js.Object] = service.deleteJob(params).promise().toFuture
    @inline def deleteMitigationActionFuture(params: DeleteMitigationActionRequest): Future[DeleteMitigationActionResponse] = service.deleteMitigationAction(params).promise().toFuture
    @inline def deleteOTAUpdateFuture(params: DeleteOTAUpdateRequest): Future[DeleteOTAUpdateResponse] = service.deleteOTAUpdate(params).promise().toFuture
    @inline def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] = service.deletePolicy(params).promise().toFuture
    @inline def deletePolicyVersionFuture(params: DeletePolicyVersionRequest): Future[js.Object] = service.deletePolicyVersion(params).promise().toFuture
    @inline def deleteProvisioningTemplateFuture(params: DeleteProvisioningTemplateRequest): Future[DeleteProvisioningTemplateResponse] = service.deleteProvisioningTemplate(params).promise().toFuture
    @inline def deleteProvisioningTemplateVersionFuture(params: DeleteProvisioningTemplateVersionRequest): Future[DeleteProvisioningTemplateVersionResponse] = service.deleteProvisioningTemplateVersion(params).promise().toFuture
    @inline def deleteRegistrationCodeFuture(params: DeleteRegistrationCodeRequest): Future[DeleteRegistrationCodeResponse] = service.deleteRegistrationCode(params).promise().toFuture
    @inline def deleteRoleAliasFuture(params: DeleteRoleAliasRequest): Future[DeleteRoleAliasResponse] = service.deleteRoleAlias(params).promise().toFuture
    @inline def deleteScheduledAuditFuture(params: DeleteScheduledAuditRequest): Future[DeleteScheduledAuditResponse] = service.deleteScheduledAudit(params).promise().toFuture
    @inline def deleteSecurityProfileFuture(params: DeleteSecurityProfileRequest): Future[DeleteSecurityProfileResponse] = service.deleteSecurityProfile(params).promise().toFuture
    @inline def deleteStreamFuture(params: DeleteStreamRequest): Future[DeleteStreamResponse] = service.deleteStream(params).promise().toFuture
    @inline def deleteThingFuture(params: DeleteThingRequest): Future[DeleteThingResponse] = service.deleteThing(params).promise().toFuture
    @inline def deleteThingGroupFuture(params: DeleteThingGroupRequest): Future[DeleteThingGroupResponse] = service.deleteThingGroup(params).promise().toFuture
    @inline def deleteThingTypeFuture(params: DeleteThingTypeRequest): Future[DeleteThingTypeResponse] = service.deleteThingType(params).promise().toFuture
    @inline def deleteTopicRuleDestinationFuture(params: DeleteTopicRuleDestinationRequest): Future[DeleteTopicRuleDestinationResponse] = service.deleteTopicRuleDestination(params).promise().toFuture
    @inline def deleteTopicRuleFuture(params: DeleteTopicRuleRequest): Future[js.Object] = service.deleteTopicRule(params).promise().toFuture
    @inline def deleteV2LoggingLevelFuture(params: DeleteV2LoggingLevelRequest): Future[js.Object] = service.deleteV2LoggingLevel(params).promise().toFuture
    @inline def deprecateThingTypeFuture(params: DeprecateThingTypeRequest): Future[DeprecateThingTypeResponse] = service.deprecateThingType(params).promise().toFuture
    @inline def describeAccountAuditConfigurationFuture(params: DescribeAccountAuditConfigurationRequest): Future[DescribeAccountAuditConfigurationResponse] = service.describeAccountAuditConfiguration(params).promise().toFuture
    @inline def describeAuditFindingFuture(params: DescribeAuditFindingRequest): Future[DescribeAuditFindingResponse] = service.describeAuditFinding(params).promise().toFuture
    @inline def describeAuditMitigationActionsTaskFuture(params: DescribeAuditMitigationActionsTaskRequest): Future[DescribeAuditMitigationActionsTaskResponse] = service.describeAuditMitigationActionsTask(params).promise().toFuture
    @inline def describeAuditSuppressionFuture(params: DescribeAuditSuppressionRequest): Future[DescribeAuditSuppressionResponse] = service.describeAuditSuppression(params).promise().toFuture
    @inline def describeAuditTaskFuture(params: DescribeAuditTaskRequest): Future[DescribeAuditTaskResponse] = service.describeAuditTask(params).promise().toFuture
    @inline def describeAuthorizerFuture(params: DescribeAuthorizerRequest): Future[DescribeAuthorizerResponse] = service.describeAuthorizer(params).promise().toFuture
    @inline def describeBillingGroupFuture(params: DescribeBillingGroupRequest): Future[DescribeBillingGroupResponse] = service.describeBillingGroup(params).promise().toFuture
    @inline def describeCACertificateFuture(params: DescribeCACertificateRequest): Future[DescribeCACertificateResponse] = service.describeCACertificate(params).promise().toFuture
    @inline def describeCertificateFuture(params: DescribeCertificateRequest): Future[DescribeCertificateResponse] = service.describeCertificate(params).promise().toFuture
    @inline def describeCustomMetricFuture(params: DescribeCustomMetricRequest): Future[DescribeCustomMetricResponse] = service.describeCustomMetric(params).promise().toFuture
    @inline def describeDefaultAuthorizerFuture(params: DescribeDefaultAuthorizerRequest): Future[DescribeDefaultAuthorizerResponse] = service.describeDefaultAuthorizer(params).promise().toFuture
    @inline def describeDetectMitigationActionsTaskFuture(params: DescribeDetectMitigationActionsTaskRequest): Future[DescribeDetectMitigationActionsTaskResponse] = service.describeDetectMitigationActionsTask(params).promise().toFuture
    @inline def describeDimensionFuture(params: DescribeDimensionRequest): Future[DescribeDimensionResponse] = service.describeDimension(params).promise().toFuture
    @inline def describeDomainConfigurationFuture(params: DescribeDomainConfigurationRequest): Future[DescribeDomainConfigurationResponse] = service.describeDomainConfiguration(params).promise().toFuture
    @inline def describeEndpointFuture(params: DescribeEndpointRequest): Future[DescribeEndpointResponse] = service.describeEndpoint(params).promise().toFuture
    @inline def describeEventConfigurationsFuture(params: DescribeEventConfigurationsRequest): Future[DescribeEventConfigurationsResponse] = service.describeEventConfigurations(params).promise().toFuture
    @inline def describeIndexFuture(params: DescribeIndexRequest): Future[DescribeIndexResponse] = service.describeIndex(params).promise().toFuture
    @inline def describeJobExecutionFuture(params: DescribeJobExecutionRequest): Future[DescribeJobExecutionResponse] = service.describeJobExecution(params).promise().toFuture
    @inline def describeJobFuture(params: DescribeJobRequest): Future[DescribeJobResponse] = service.describeJob(params).promise().toFuture
    @inline def describeMitigationActionFuture(params: DescribeMitigationActionRequest): Future[DescribeMitigationActionResponse] = service.describeMitigationAction(params).promise().toFuture
    @inline def describeProvisioningTemplateFuture(params: DescribeProvisioningTemplateRequest): Future[DescribeProvisioningTemplateResponse] = service.describeProvisioningTemplate(params).promise().toFuture
    @inline def describeProvisioningTemplateVersionFuture(params: DescribeProvisioningTemplateVersionRequest): Future[DescribeProvisioningTemplateVersionResponse] = service.describeProvisioningTemplateVersion(params).promise().toFuture
    @inline def describeRoleAliasFuture(params: DescribeRoleAliasRequest): Future[DescribeRoleAliasResponse] = service.describeRoleAlias(params).promise().toFuture
    @inline def describeScheduledAuditFuture(params: DescribeScheduledAuditRequest): Future[DescribeScheduledAuditResponse] = service.describeScheduledAudit(params).promise().toFuture
    @inline def describeSecurityProfileFuture(params: DescribeSecurityProfileRequest): Future[DescribeSecurityProfileResponse] = service.describeSecurityProfile(params).promise().toFuture
    @inline def describeStreamFuture(params: DescribeStreamRequest): Future[DescribeStreamResponse] = service.describeStream(params).promise().toFuture
    @inline def describeThingFuture(params: DescribeThingRequest): Future[DescribeThingResponse] = service.describeThing(params).promise().toFuture
    @inline def describeThingGroupFuture(params: DescribeThingGroupRequest): Future[DescribeThingGroupResponse] = service.describeThingGroup(params).promise().toFuture
    @inline def describeThingRegistrationTaskFuture(params: DescribeThingRegistrationTaskRequest): Future[DescribeThingRegistrationTaskResponse] = service.describeThingRegistrationTask(params).promise().toFuture
    @inline def describeThingTypeFuture(params: DescribeThingTypeRequest): Future[DescribeThingTypeResponse] = service.describeThingType(params).promise().toFuture
    @inline def detachPolicyFuture(params: DetachPolicyRequest): Future[js.Object] = service.detachPolicy(params).promise().toFuture
    @inline def detachSecurityProfileFuture(params: DetachSecurityProfileRequest): Future[DetachSecurityProfileResponse] = service.detachSecurityProfile(params).promise().toFuture
    @inline def detachThingPrincipalFuture(params: DetachThingPrincipalRequest): Future[DetachThingPrincipalResponse] = service.detachThingPrincipal(params).promise().toFuture
    @inline def disableTopicRuleFuture(params: DisableTopicRuleRequest): Future[js.Object] = service.disableTopicRule(params).promise().toFuture
    @inline def enableTopicRuleFuture(params: EnableTopicRuleRequest): Future[js.Object] = service.enableTopicRule(params).promise().toFuture
    @inline def getBehaviorModelTrainingSummariesFuture(params: GetBehaviorModelTrainingSummariesRequest): Future[GetBehaviorModelTrainingSummariesResponse] = service.getBehaviorModelTrainingSummaries(params).promise().toFuture
    @inline def getCardinalityFuture(params: GetCardinalityRequest): Future[GetCardinalityResponse] = service.getCardinality(params).promise().toFuture
    @inline def getEffectivePoliciesFuture(params: GetEffectivePoliciesRequest): Future[GetEffectivePoliciesResponse] = service.getEffectivePolicies(params).promise().toFuture
    @inline def getIndexingConfigurationFuture(params: GetIndexingConfigurationRequest): Future[GetIndexingConfigurationResponse] = service.getIndexingConfiguration(params).promise().toFuture
    @inline def getJobDocumentFuture(params: GetJobDocumentRequest): Future[GetJobDocumentResponse] = service.getJobDocument(params).promise().toFuture
    @inline def getLoggingOptionsFuture(params: GetLoggingOptionsRequest): Future[GetLoggingOptionsResponse] = service.getLoggingOptions(params).promise().toFuture
    @inline def getOTAUpdateFuture(params: GetOTAUpdateRequest): Future[GetOTAUpdateResponse] = service.getOTAUpdate(params).promise().toFuture
    @inline def getPercentilesFuture(params: GetPercentilesRequest): Future[GetPercentilesResponse] = service.getPercentiles(params).promise().toFuture
    @inline def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] = service.getPolicy(params).promise().toFuture
    @inline def getPolicyVersionFuture(params: GetPolicyVersionRequest): Future[GetPolicyVersionResponse] = service.getPolicyVersion(params).promise().toFuture
    @inline def getRegistrationCodeFuture(params: GetRegistrationCodeRequest): Future[GetRegistrationCodeResponse] = service.getRegistrationCode(params).promise().toFuture
    @inline def getStatisticsFuture(params: GetStatisticsRequest): Future[GetStatisticsResponse] = service.getStatistics(params).promise().toFuture
    @inline def getTopicRuleDestinationFuture(params: GetTopicRuleDestinationRequest): Future[GetTopicRuleDestinationResponse] = service.getTopicRuleDestination(params).promise().toFuture
    @inline def getTopicRuleFuture(params: GetTopicRuleRequest): Future[GetTopicRuleResponse] = service.getTopicRule(params).promise().toFuture
    @inline def getV2LoggingOptionsFuture(params: GetV2LoggingOptionsRequest): Future[GetV2LoggingOptionsResponse] = service.getV2LoggingOptions(params).promise().toFuture
    @inline def listActiveViolationsFuture(params: ListActiveViolationsRequest): Future[ListActiveViolationsResponse] = service.listActiveViolations(params).promise().toFuture
    @inline def listAttachedPoliciesFuture(params: ListAttachedPoliciesRequest): Future[ListAttachedPoliciesResponse] = service.listAttachedPolicies(params).promise().toFuture
    @inline def listAuditFindingsFuture(params: ListAuditFindingsRequest): Future[ListAuditFindingsResponse] = service.listAuditFindings(params).promise().toFuture
    @inline def listAuditMitigationActionsExecutionsFuture(params: ListAuditMitigationActionsExecutionsRequest): Future[ListAuditMitigationActionsExecutionsResponse] = service.listAuditMitigationActionsExecutions(params).promise().toFuture
    @inline def listAuditMitigationActionsTasksFuture(params: ListAuditMitigationActionsTasksRequest): Future[ListAuditMitigationActionsTasksResponse] = service.listAuditMitigationActionsTasks(params).promise().toFuture
    @inline def listAuditSuppressionsFuture(params: ListAuditSuppressionsRequest): Future[ListAuditSuppressionsResponse] = service.listAuditSuppressions(params).promise().toFuture
    @inline def listAuditTasksFuture(params: ListAuditTasksRequest): Future[ListAuditTasksResponse] = service.listAuditTasks(params).promise().toFuture
    @inline def listAuthorizersFuture(params: ListAuthorizersRequest): Future[ListAuthorizersResponse] = service.listAuthorizers(params).promise().toFuture
    @inline def listBillingGroupsFuture(params: ListBillingGroupsRequest): Future[ListBillingGroupsResponse] = service.listBillingGroups(params).promise().toFuture
    @inline def listCACertificatesFuture(params: ListCACertificatesRequest): Future[ListCACertificatesResponse] = service.listCACertificates(params).promise().toFuture
    @inline def listCertificatesByCAFuture(params: ListCertificatesByCARequest): Future[ListCertificatesByCAResponse] = service.listCertificatesByCA(params).promise().toFuture
    @inline def listCertificatesFuture(params: ListCertificatesRequest): Future[ListCertificatesResponse] = service.listCertificates(params).promise().toFuture
    @inline def listCustomMetricsFuture(params: ListCustomMetricsRequest): Future[ListCustomMetricsResponse] = service.listCustomMetrics(params).promise().toFuture
    @inline def listDetectMitigationActionsExecutionsFuture(params: ListDetectMitigationActionsExecutionsRequest): Future[ListDetectMitigationActionsExecutionsResponse] = service.listDetectMitigationActionsExecutions(params).promise().toFuture
    @inline def listDetectMitigationActionsTasksFuture(params: ListDetectMitigationActionsTasksRequest): Future[ListDetectMitigationActionsTasksResponse] = service.listDetectMitigationActionsTasks(params).promise().toFuture
    @inline def listDimensionsFuture(params: ListDimensionsRequest): Future[ListDimensionsResponse] = service.listDimensions(params).promise().toFuture
    @inline def listDomainConfigurationsFuture(params: ListDomainConfigurationsRequest): Future[ListDomainConfigurationsResponse] = service.listDomainConfigurations(params).promise().toFuture
    @inline def listIndicesFuture(params: ListIndicesRequest): Future[ListIndicesResponse] = service.listIndices(params).promise().toFuture
    @inline def listJobExecutionsForJobFuture(params: ListJobExecutionsForJobRequest): Future[ListJobExecutionsForJobResponse] = service.listJobExecutionsForJob(params).promise().toFuture
    @inline def listJobExecutionsForThingFuture(params: ListJobExecutionsForThingRequest): Future[ListJobExecutionsForThingResponse] = service.listJobExecutionsForThing(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] = service.listJobs(params).promise().toFuture
    @inline def listMitigationActionsFuture(params: ListMitigationActionsRequest): Future[ListMitigationActionsResponse] = service.listMitigationActions(params).promise().toFuture
    @inline def listOTAUpdatesFuture(params: ListOTAUpdatesRequest): Future[ListOTAUpdatesResponse] = service.listOTAUpdates(params).promise().toFuture
    @inline def listOutgoingCertificatesFuture(params: ListOutgoingCertificatesRequest): Future[ListOutgoingCertificatesResponse] = service.listOutgoingCertificates(params).promise().toFuture
    @inline def listPoliciesFuture(params: ListPoliciesRequest): Future[ListPoliciesResponse] = service.listPolicies(params).promise().toFuture
    @inline def listPolicyVersionsFuture(params: ListPolicyVersionsRequest): Future[ListPolicyVersionsResponse] = service.listPolicyVersions(params).promise().toFuture
    @inline def listPrincipalThingsFuture(params: ListPrincipalThingsRequest): Future[ListPrincipalThingsResponse] = service.listPrincipalThings(params).promise().toFuture
    @inline def listProvisioningTemplateVersionsFuture(params: ListProvisioningTemplateVersionsRequest): Future[ListProvisioningTemplateVersionsResponse] = service.listProvisioningTemplateVersions(params).promise().toFuture
    @inline def listProvisioningTemplatesFuture(params: ListProvisioningTemplatesRequest): Future[ListProvisioningTemplatesResponse] = service.listProvisioningTemplates(params).promise().toFuture
    @inline def listRoleAliasesFuture(params: ListRoleAliasesRequest): Future[ListRoleAliasesResponse] = service.listRoleAliases(params).promise().toFuture
    @inline def listScheduledAuditsFuture(params: ListScheduledAuditsRequest): Future[ListScheduledAuditsResponse] = service.listScheduledAudits(params).promise().toFuture
    @inline def listSecurityProfilesForTargetFuture(params: ListSecurityProfilesForTargetRequest): Future[ListSecurityProfilesForTargetResponse] = service.listSecurityProfilesForTarget(params).promise().toFuture
    @inline def listSecurityProfilesFuture(params: ListSecurityProfilesRequest): Future[ListSecurityProfilesResponse] = service.listSecurityProfiles(params).promise().toFuture
    @inline def listStreamsFuture(params: ListStreamsRequest): Future[ListStreamsResponse] = service.listStreams(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTargetsForPolicyFuture(params: ListTargetsForPolicyRequest): Future[ListTargetsForPolicyResponse] = service.listTargetsForPolicy(params).promise().toFuture
    @inline def listTargetsForSecurityProfileFuture(params: ListTargetsForSecurityProfileRequest): Future[ListTargetsForSecurityProfileResponse] = service.listTargetsForSecurityProfile(params).promise().toFuture
    @inline def listThingGroupsForThingFuture(params: ListThingGroupsForThingRequest): Future[ListThingGroupsForThingResponse] = service.listThingGroupsForThing(params).promise().toFuture
    @inline def listThingGroupsFuture(params: ListThingGroupsRequest): Future[ListThingGroupsResponse] = service.listThingGroups(params).promise().toFuture
    @inline def listThingPrincipalsFuture(params: ListThingPrincipalsRequest): Future[ListThingPrincipalsResponse] = service.listThingPrincipals(params).promise().toFuture
    @inline def listThingRegistrationTaskReportsFuture(params: ListThingRegistrationTaskReportsRequest): Future[ListThingRegistrationTaskReportsResponse] = service.listThingRegistrationTaskReports(params).promise().toFuture
    @inline def listThingRegistrationTasksFuture(params: ListThingRegistrationTasksRequest): Future[ListThingRegistrationTasksResponse] = service.listThingRegistrationTasks(params).promise().toFuture
    @inline def listThingTypesFuture(params: ListThingTypesRequest): Future[ListThingTypesResponse] = service.listThingTypes(params).promise().toFuture
    @inline def listThingsFuture(params: ListThingsRequest): Future[ListThingsResponse] = service.listThings(params).promise().toFuture
    @inline def listThingsInBillingGroupFuture(params: ListThingsInBillingGroupRequest): Future[ListThingsInBillingGroupResponse] = service.listThingsInBillingGroup(params).promise().toFuture
    @inline def listThingsInThingGroupFuture(params: ListThingsInThingGroupRequest): Future[ListThingsInThingGroupResponse] = service.listThingsInThingGroup(params).promise().toFuture
    @inline def listTopicRuleDestinationsFuture(params: ListTopicRuleDestinationsRequest): Future[ListTopicRuleDestinationsResponse] = service.listTopicRuleDestinations(params).promise().toFuture
    @inline def listTopicRulesFuture(params: ListTopicRulesRequest): Future[ListTopicRulesResponse] = service.listTopicRules(params).promise().toFuture
    @inline def listV2LoggingLevelsFuture(params: ListV2LoggingLevelsRequest): Future[ListV2LoggingLevelsResponse] = service.listV2LoggingLevels(params).promise().toFuture
    @inline def listViolationEventsFuture(params: ListViolationEventsRequest): Future[ListViolationEventsResponse] = service.listViolationEvents(params).promise().toFuture
    @inline def registerCACertificateFuture(params: RegisterCACertificateRequest): Future[RegisterCACertificateResponse] = service.registerCACertificate(params).promise().toFuture
    @inline def registerCertificateFuture(params: RegisterCertificateRequest): Future[RegisterCertificateResponse] = service.registerCertificate(params).promise().toFuture
    @inline def registerCertificateWithoutCAFuture(params: RegisterCertificateWithoutCARequest): Future[RegisterCertificateWithoutCAResponse] = service.registerCertificateWithoutCA(params).promise().toFuture
    @inline def registerThingFuture(params: RegisterThingRequest): Future[RegisterThingResponse] = service.registerThing(params).promise().toFuture
    @inline def rejectCertificateTransferFuture(params: RejectCertificateTransferRequest): Future[js.Object] = service.rejectCertificateTransfer(params).promise().toFuture
    @inline def removeThingFromBillingGroupFuture(params: RemoveThingFromBillingGroupRequest): Future[RemoveThingFromBillingGroupResponse] = service.removeThingFromBillingGroup(params).promise().toFuture
    @inline def removeThingFromThingGroupFuture(params: RemoveThingFromThingGroupRequest): Future[RemoveThingFromThingGroupResponse] = service.removeThingFromThingGroup(params).promise().toFuture
    @inline def replaceTopicRuleFuture(params: ReplaceTopicRuleRequest): Future[js.Object] = service.replaceTopicRule(params).promise().toFuture
    @inline def searchIndexFuture(params: SearchIndexRequest): Future[SearchIndexResponse] = service.searchIndex(params).promise().toFuture
    @inline def setDefaultAuthorizerFuture(params: SetDefaultAuthorizerRequest): Future[SetDefaultAuthorizerResponse] = service.setDefaultAuthorizer(params).promise().toFuture
    @inline def setDefaultPolicyVersionFuture(params: SetDefaultPolicyVersionRequest): Future[js.Object] = service.setDefaultPolicyVersion(params).promise().toFuture
    @inline def setLoggingOptionsFuture(params: SetLoggingOptionsRequest): Future[js.Object] = service.setLoggingOptions(params).promise().toFuture
    @inline def setV2LoggingLevelFuture(params: SetV2LoggingLevelRequest): Future[js.Object] = service.setV2LoggingLevel(params).promise().toFuture
    @inline def setV2LoggingOptionsFuture(params: SetV2LoggingOptionsRequest): Future[js.Object] = service.setV2LoggingOptions(params).promise().toFuture
    @inline def startAuditMitigationActionsTaskFuture(params: StartAuditMitigationActionsTaskRequest): Future[StartAuditMitigationActionsTaskResponse] = service.startAuditMitigationActionsTask(params).promise().toFuture
    @inline def startDetectMitigationActionsTaskFuture(params: StartDetectMitigationActionsTaskRequest): Future[StartDetectMitigationActionsTaskResponse] = service.startDetectMitigationActionsTask(params).promise().toFuture
    @inline def startOnDemandAuditTaskFuture(params: StartOnDemandAuditTaskRequest): Future[StartOnDemandAuditTaskResponse] = service.startOnDemandAuditTask(params).promise().toFuture
    @inline def startThingRegistrationTaskFuture(params: StartThingRegistrationTaskRequest): Future[StartThingRegistrationTaskResponse] = service.startThingRegistrationTask(params).promise().toFuture
    @inline def stopThingRegistrationTaskFuture(params: StopThingRegistrationTaskRequest): Future[StopThingRegistrationTaskResponse] = service.stopThingRegistrationTask(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def testAuthorizationFuture(params: TestAuthorizationRequest): Future[TestAuthorizationResponse] = service.testAuthorization(params).promise().toFuture
    @inline def testInvokeAuthorizerFuture(params: TestInvokeAuthorizerRequest): Future[TestInvokeAuthorizerResponse] = service.testInvokeAuthorizer(params).promise().toFuture
    @inline def transferCertificateFuture(params: TransferCertificateRequest): Future[TransferCertificateResponse] = service.transferCertificate(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAccountAuditConfigurationFuture(params: UpdateAccountAuditConfigurationRequest): Future[UpdateAccountAuditConfigurationResponse] = service.updateAccountAuditConfiguration(params).promise().toFuture
    @inline def updateAuditSuppressionFuture(params: UpdateAuditSuppressionRequest): Future[UpdateAuditSuppressionResponse] = service.updateAuditSuppression(params).promise().toFuture
    @inline def updateAuthorizerFuture(params: UpdateAuthorizerRequest): Future[UpdateAuthorizerResponse] = service.updateAuthorizer(params).promise().toFuture
    @inline def updateBillingGroupFuture(params: UpdateBillingGroupRequest): Future[UpdateBillingGroupResponse] = service.updateBillingGroup(params).promise().toFuture
    @inline def updateCACertificateFuture(params: UpdateCACertificateRequest): Future[js.Object] = service.updateCACertificate(params).promise().toFuture
    @inline def updateCertificateFuture(params: UpdateCertificateRequest): Future[js.Object] = service.updateCertificate(params).promise().toFuture
    @inline def updateCustomMetricFuture(params: UpdateCustomMetricRequest): Future[UpdateCustomMetricResponse] = service.updateCustomMetric(params).promise().toFuture
    @inline def updateDimensionFuture(params: UpdateDimensionRequest): Future[UpdateDimensionResponse] = service.updateDimension(params).promise().toFuture
    @inline def updateDomainConfigurationFuture(params: UpdateDomainConfigurationRequest): Future[UpdateDomainConfigurationResponse] = service.updateDomainConfiguration(params).promise().toFuture
    @inline def updateDynamicThingGroupFuture(params: UpdateDynamicThingGroupRequest): Future[UpdateDynamicThingGroupResponse] = service.updateDynamicThingGroup(params).promise().toFuture
    @inline def updateEventConfigurationsFuture(params: UpdateEventConfigurationsRequest): Future[UpdateEventConfigurationsResponse] = service.updateEventConfigurations(params).promise().toFuture
    @inline def updateIndexingConfigurationFuture(params: UpdateIndexingConfigurationRequest): Future[UpdateIndexingConfigurationResponse] = service.updateIndexingConfiguration(params).promise().toFuture
    @inline def updateJobFuture(params: UpdateJobRequest): Future[js.Object] = service.updateJob(params).promise().toFuture
    @inline def updateMitigationActionFuture(params: UpdateMitigationActionRequest): Future[UpdateMitigationActionResponse] = service.updateMitigationAction(params).promise().toFuture
    @inline def updateProvisioningTemplateFuture(params: UpdateProvisioningTemplateRequest): Future[UpdateProvisioningTemplateResponse] = service.updateProvisioningTemplate(params).promise().toFuture
    @inline def updateRoleAliasFuture(params: UpdateRoleAliasRequest): Future[UpdateRoleAliasResponse] = service.updateRoleAlias(params).promise().toFuture
    @inline def updateScheduledAuditFuture(params: UpdateScheduledAuditRequest): Future[UpdateScheduledAuditResponse] = service.updateScheduledAudit(params).promise().toFuture
    @inline def updateSecurityProfileFuture(params: UpdateSecurityProfileRequest): Future[UpdateSecurityProfileResponse] = service.updateSecurityProfile(params).promise().toFuture
    @inline def updateStreamFuture(params: UpdateStreamRequest): Future[UpdateStreamResponse] = service.updateStream(params).promise().toFuture
    @inline def updateThingFuture(params: UpdateThingRequest): Future[UpdateThingResponse] = service.updateThing(params).promise().toFuture
    @inline def updateThingGroupFuture(params: UpdateThingGroupRequest): Future[UpdateThingGroupResponse] = service.updateThingGroup(params).promise().toFuture
    @inline def updateThingGroupsForThingFuture(params: UpdateThingGroupsForThingRequest): Future[UpdateThingGroupsForThingResponse] = service.updateThingGroupsForThing(params).promise().toFuture
    @inline def updateTopicRuleDestinationFuture(params: UpdateTopicRuleDestinationRequest): Future[UpdateTopicRuleDestinationResponse] = service.updateTopicRuleDestination(params).promise().toFuture
    @inline def validateSecurityProfileBehaviorsFuture(params: ValidateSecurityProfileBehaviorsRequest): Future[ValidateSecurityProfileBehaviorsResponse] = service.validateSecurityProfileBehaviors(params).promise().toFuture

  }
}

package iot {
  @js.native
  @JSImport("aws-sdk/clients/iot", JSImport.Namespace, "AWS.Iot")
  class Iot() extends js.Object {
    def this(config: AWSConfig) = this()

    @deprecated("Deprecated in AWS SDK", "forever") def attachPrincipalPolicy(params: AttachPrincipalPolicyRequest): Request[js.Object] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def detachPrincipalPolicy(params: DetachPrincipalPolicyRequest): Request[js.Object] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def listPolicyPrincipals(params: ListPolicyPrincipalsRequest): Request[ListPolicyPrincipalsResponse] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def listPrincipalPolicies(params: ListPrincipalPoliciesRequest): Request[ListPrincipalPoliciesResponse] = js.native
    def acceptCertificateTransfer(params: AcceptCertificateTransferRequest): Request[js.Object] = js.native
    def addThingToBillingGroup(params: AddThingToBillingGroupRequest): Request[AddThingToBillingGroupResponse] = js.native
    def addThingToThingGroup(params: AddThingToThingGroupRequest): Request[AddThingToThingGroupResponse] = js.native
    def associateTargetsWithJob(params: AssociateTargetsWithJobRequest): Request[AssociateTargetsWithJobResponse] = js.native
    def attachPolicy(params: AttachPolicyRequest): Request[js.Object] = js.native
    def attachSecurityProfile(params: AttachSecurityProfileRequest): Request[AttachSecurityProfileResponse] = js.native
    def attachThingPrincipal(params: AttachThingPrincipalRequest): Request[AttachThingPrincipalResponse] = js.native
    def cancelAuditMitigationActionsTask(params: CancelAuditMitigationActionsTaskRequest): Request[CancelAuditMitigationActionsTaskResponse] = js.native
    def cancelAuditTask(params: CancelAuditTaskRequest): Request[CancelAuditTaskResponse] = js.native
    def cancelCertificateTransfer(params: CancelCertificateTransferRequest): Request[js.Object] = js.native
    def cancelDetectMitigationActionsTask(params: CancelDetectMitigationActionsTaskRequest): Request[CancelDetectMitigationActionsTaskResponse] = js.native
    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse] = js.native
    def cancelJobExecution(params: CancelJobExecutionRequest): Request[js.Object] = js.native
    def clearDefaultAuthorizer(params: ClearDefaultAuthorizerRequest): Request[ClearDefaultAuthorizerResponse] = js.native
    def confirmTopicRuleDestination(params: ConfirmTopicRuleDestinationRequest): Request[ConfirmTopicRuleDestinationResponse] = js.native
    def createAuditSuppression(params: CreateAuditSuppressionRequest): Request[CreateAuditSuppressionResponse] = js.native
    def createAuthorizer(params: CreateAuthorizerRequest): Request[CreateAuthorizerResponse] = js.native
    def createBillingGroup(params: CreateBillingGroupRequest): Request[CreateBillingGroupResponse] = js.native
    def createCertificateFromCsr(params: CreateCertificateFromCsrRequest): Request[CreateCertificateFromCsrResponse] = js.native
    def createCustomMetric(params: CreateCustomMetricRequest): Request[CreateCustomMetricResponse] = js.native
    def createDimension(params: CreateDimensionRequest): Request[CreateDimensionResponse] = js.native
    def createDomainConfiguration(params: CreateDomainConfigurationRequest): Request[CreateDomainConfigurationResponse] = js.native
    def createDynamicThingGroup(params: CreateDynamicThingGroupRequest): Request[CreateDynamicThingGroupResponse] = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse] = js.native
    def createKeysAndCertificate(params: CreateKeysAndCertificateRequest): Request[CreateKeysAndCertificateResponse] = js.native
    def createMitigationAction(params: CreateMitigationActionRequest): Request[CreateMitigationActionResponse] = js.native
    def createOTAUpdate(params: CreateOTAUpdateRequest): Request[CreateOTAUpdateResponse] = js.native
    def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse] = js.native
    def createPolicyVersion(params: CreatePolicyVersionRequest): Request[CreatePolicyVersionResponse] = js.native
    def createProvisioningClaim(params: CreateProvisioningClaimRequest): Request[CreateProvisioningClaimResponse] = js.native
    def createProvisioningTemplate(params: CreateProvisioningTemplateRequest): Request[CreateProvisioningTemplateResponse] = js.native
    def createProvisioningTemplateVersion(params: CreateProvisioningTemplateVersionRequest): Request[CreateProvisioningTemplateVersionResponse] = js.native
    def createRoleAlias(params: CreateRoleAliasRequest): Request[CreateRoleAliasResponse] = js.native
    def createScheduledAudit(params: CreateScheduledAuditRequest): Request[CreateScheduledAuditResponse] = js.native
    def createSecurityProfile(params: CreateSecurityProfileRequest): Request[CreateSecurityProfileResponse] = js.native
    def createStream(params: CreateStreamRequest): Request[CreateStreamResponse] = js.native
    def createThing(params: CreateThingRequest): Request[CreateThingResponse] = js.native
    def createThingGroup(params: CreateThingGroupRequest): Request[CreateThingGroupResponse] = js.native
    def createThingType(params: CreateThingTypeRequest): Request[CreateThingTypeResponse] = js.native
    def createTopicRule(params: CreateTopicRuleRequest): Request[js.Object] = js.native
    def createTopicRuleDestination(params: CreateTopicRuleDestinationRequest): Request[CreateTopicRuleDestinationResponse] = js.native
    def deleteAccountAuditConfiguration(params: DeleteAccountAuditConfigurationRequest): Request[DeleteAccountAuditConfigurationResponse] = js.native
    def deleteAuditSuppression(params: DeleteAuditSuppressionRequest): Request[DeleteAuditSuppressionResponse] = js.native
    def deleteAuthorizer(params: DeleteAuthorizerRequest): Request[DeleteAuthorizerResponse] = js.native
    def deleteBillingGroup(params: DeleteBillingGroupRequest): Request[DeleteBillingGroupResponse] = js.native
    def deleteCACertificate(params: DeleteCACertificateRequest): Request[DeleteCACertificateResponse] = js.native
    def deleteCertificate(params: DeleteCertificateRequest): Request[js.Object] = js.native
    def deleteCustomMetric(params: DeleteCustomMetricRequest): Request[DeleteCustomMetricResponse] = js.native
    def deleteDimension(params: DeleteDimensionRequest): Request[DeleteDimensionResponse] = js.native
    def deleteDomainConfiguration(params: DeleteDomainConfigurationRequest): Request[DeleteDomainConfigurationResponse] = js.native
    def deleteDynamicThingGroup(params: DeleteDynamicThingGroupRequest): Request[DeleteDynamicThingGroupResponse] = js.native
    def deleteJob(params: DeleteJobRequest): Request[js.Object] = js.native
    def deleteJobExecution(params: DeleteJobExecutionRequest): Request[js.Object] = js.native
    def deleteMitigationAction(params: DeleteMitigationActionRequest): Request[DeleteMitigationActionResponse] = js.native
    def deleteOTAUpdate(params: DeleteOTAUpdateRequest): Request[DeleteOTAUpdateResponse] = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object] = js.native
    def deletePolicyVersion(params: DeletePolicyVersionRequest): Request[js.Object] = js.native
    def deleteProvisioningTemplate(params: DeleteProvisioningTemplateRequest): Request[DeleteProvisioningTemplateResponse] = js.native
    def deleteProvisioningTemplateVersion(params: DeleteProvisioningTemplateVersionRequest): Request[DeleteProvisioningTemplateVersionResponse] = js.native
    def deleteRegistrationCode(params: DeleteRegistrationCodeRequest): Request[DeleteRegistrationCodeResponse] = js.native
    def deleteRoleAlias(params: DeleteRoleAliasRequest): Request[DeleteRoleAliasResponse] = js.native
    def deleteScheduledAudit(params: DeleteScheduledAuditRequest): Request[DeleteScheduledAuditResponse] = js.native
    def deleteSecurityProfile(params: DeleteSecurityProfileRequest): Request[DeleteSecurityProfileResponse] = js.native
    def deleteStream(params: DeleteStreamRequest): Request[DeleteStreamResponse] = js.native
    def deleteThing(params: DeleteThingRequest): Request[DeleteThingResponse] = js.native
    def deleteThingGroup(params: DeleteThingGroupRequest): Request[DeleteThingGroupResponse] = js.native
    def deleteThingType(params: DeleteThingTypeRequest): Request[DeleteThingTypeResponse] = js.native
    def deleteTopicRule(params: DeleteTopicRuleRequest): Request[js.Object] = js.native
    def deleteTopicRuleDestination(params: DeleteTopicRuleDestinationRequest): Request[DeleteTopicRuleDestinationResponse] = js.native
    def deleteV2LoggingLevel(params: DeleteV2LoggingLevelRequest): Request[js.Object] = js.native
    def deprecateThingType(params: DeprecateThingTypeRequest): Request[DeprecateThingTypeResponse] = js.native
    def describeAccountAuditConfiguration(params: DescribeAccountAuditConfigurationRequest): Request[DescribeAccountAuditConfigurationResponse] = js.native
    def describeAuditFinding(params: DescribeAuditFindingRequest): Request[DescribeAuditFindingResponse] = js.native
    def describeAuditMitigationActionsTask(params: DescribeAuditMitigationActionsTaskRequest): Request[DescribeAuditMitigationActionsTaskResponse] = js.native
    def describeAuditSuppression(params: DescribeAuditSuppressionRequest): Request[DescribeAuditSuppressionResponse] = js.native
    def describeAuditTask(params: DescribeAuditTaskRequest): Request[DescribeAuditTaskResponse] = js.native
    def describeAuthorizer(params: DescribeAuthorizerRequest): Request[DescribeAuthorizerResponse] = js.native
    def describeBillingGroup(params: DescribeBillingGroupRequest): Request[DescribeBillingGroupResponse] = js.native
    def describeCACertificate(params: DescribeCACertificateRequest): Request[DescribeCACertificateResponse] = js.native
    def describeCertificate(params: DescribeCertificateRequest): Request[DescribeCertificateResponse] = js.native
    def describeCustomMetric(params: DescribeCustomMetricRequest): Request[DescribeCustomMetricResponse] = js.native
    def describeDefaultAuthorizer(params: DescribeDefaultAuthorizerRequest): Request[DescribeDefaultAuthorizerResponse] = js.native
    def describeDetectMitigationActionsTask(params: DescribeDetectMitigationActionsTaskRequest): Request[DescribeDetectMitigationActionsTaskResponse] = js.native
    def describeDimension(params: DescribeDimensionRequest): Request[DescribeDimensionResponse] = js.native
    def describeDomainConfiguration(params: DescribeDomainConfigurationRequest): Request[DescribeDomainConfigurationResponse] = js.native
    def describeEndpoint(params: DescribeEndpointRequest): Request[DescribeEndpointResponse] = js.native
    def describeEventConfigurations(params: DescribeEventConfigurationsRequest): Request[DescribeEventConfigurationsResponse] = js.native
    def describeIndex(params: DescribeIndexRequest): Request[DescribeIndexResponse] = js.native
    def describeJob(params: DescribeJobRequest): Request[DescribeJobResponse] = js.native
    def describeJobExecution(params: DescribeJobExecutionRequest): Request[DescribeJobExecutionResponse] = js.native
    def describeMitigationAction(params: DescribeMitigationActionRequest): Request[DescribeMitigationActionResponse] = js.native
    def describeProvisioningTemplate(params: DescribeProvisioningTemplateRequest): Request[DescribeProvisioningTemplateResponse] = js.native
    def describeProvisioningTemplateVersion(params: DescribeProvisioningTemplateVersionRequest): Request[DescribeProvisioningTemplateVersionResponse] = js.native
    def describeRoleAlias(params: DescribeRoleAliasRequest): Request[DescribeRoleAliasResponse] = js.native
    def describeScheduledAudit(params: DescribeScheduledAuditRequest): Request[DescribeScheduledAuditResponse] = js.native
    def describeSecurityProfile(params: DescribeSecurityProfileRequest): Request[DescribeSecurityProfileResponse] = js.native
    def describeStream(params: DescribeStreamRequest): Request[DescribeStreamResponse] = js.native
    def describeThing(params: DescribeThingRequest): Request[DescribeThingResponse] = js.native
    def describeThingGroup(params: DescribeThingGroupRequest): Request[DescribeThingGroupResponse] = js.native
    def describeThingRegistrationTask(params: DescribeThingRegistrationTaskRequest): Request[DescribeThingRegistrationTaskResponse] = js.native
    def describeThingType(params: DescribeThingTypeRequest): Request[DescribeThingTypeResponse] = js.native
    def detachPolicy(params: DetachPolicyRequest): Request[js.Object] = js.native
    def detachSecurityProfile(params: DetachSecurityProfileRequest): Request[DetachSecurityProfileResponse] = js.native
    def detachThingPrincipal(params: DetachThingPrincipalRequest): Request[DetachThingPrincipalResponse] = js.native
    def disableTopicRule(params: DisableTopicRuleRequest): Request[js.Object] = js.native
    def enableTopicRule(params: EnableTopicRuleRequest): Request[js.Object] = js.native
    def getBehaviorModelTrainingSummaries(params: GetBehaviorModelTrainingSummariesRequest): Request[GetBehaviorModelTrainingSummariesResponse] = js.native
    def getCardinality(params: GetCardinalityRequest): Request[GetCardinalityResponse] = js.native
    def getEffectivePolicies(params: GetEffectivePoliciesRequest): Request[GetEffectivePoliciesResponse] = js.native
    def getIndexingConfiguration(params: GetIndexingConfigurationRequest): Request[GetIndexingConfigurationResponse] = js.native
    def getJobDocument(params: GetJobDocumentRequest): Request[GetJobDocumentResponse] = js.native
    def getLoggingOptions(params: GetLoggingOptionsRequest): Request[GetLoggingOptionsResponse] = js.native
    def getOTAUpdate(params: GetOTAUpdateRequest): Request[GetOTAUpdateResponse] = js.native
    def getPercentiles(params: GetPercentilesRequest): Request[GetPercentilesResponse] = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse] = js.native
    def getPolicyVersion(params: GetPolicyVersionRequest): Request[GetPolicyVersionResponse] = js.native
    def getRegistrationCode(params: GetRegistrationCodeRequest): Request[GetRegistrationCodeResponse] = js.native
    def getStatistics(params: GetStatisticsRequest): Request[GetStatisticsResponse] = js.native
    def getTopicRule(params: GetTopicRuleRequest): Request[GetTopicRuleResponse] = js.native
    def getTopicRuleDestination(params: GetTopicRuleDestinationRequest): Request[GetTopicRuleDestinationResponse] = js.native
    def getV2LoggingOptions(params: GetV2LoggingOptionsRequest): Request[GetV2LoggingOptionsResponse] = js.native
    def listActiveViolations(params: ListActiveViolationsRequest): Request[ListActiveViolationsResponse] = js.native
    def listAttachedPolicies(params: ListAttachedPoliciesRequest): Request[ListAttachedPoliciesResponse] = js.native
    def listAuditFindings(params: ListAuditFindingsRequest): Request[ListAuditFindingsResponse] = js.native
    def listAuditMitigationActionsExecutions(params: ListAuditMitigationActionsExecutionsRequest): Request[ListAuditMitigationActionsExecutionsResponse] = js.native
    def listAuditMitigationActionsTasks(params: ListAuditMitigationActionsTasksRequest): Request[ListAuditMitigationActionsTasksResponse] = js.native
    def listAuditSuppressions(params: ListAuditSuppressionsRequest): Request[ListAuditSuppressionsResponse] = js.native
    def listAuditTasks(params: ListAuditTasksRequest): Request[ListAuditTasksResponse] = js.native
    def listAuthorizers(params: ListAuthorizersRequest): Request[ListAuthorizersResponse] = js.native
    def listBillingGroups(params: ListBillingGroupsRequest): Request[ListBillingGroupsResponse] = js.native
    def listCACertificates(params: ListCACertificatesRequest): Request[ListCACertificatesResponse] = js.native
    def listCertificates(params: ListCertificatesRequest): Request[ListCertificatesResponse] = js.native
    def listCertificatesByCA(params: ListCertificatesByCARequest): Request[ListCertificatesByCAResponse] = js.native
    def listCustomMetrics(params: ListCustomMetricsRequest): Request[ListCustomMetricsResponse] = js.native
    def listDetectMitigationActionsExecutions(params: ListDetectMitigationActionsExecutionsRequest): Request[ListDetectMitigationActionsExecutionsResponse] = js.native
    def listDetectMitigationActionsTasks(params: ListDetectMitigationActionsTasksRequest): Request[ListDetectMitigationActionsTasksResponse] = js.native
    def listDimensions(params: ListDimensionsRequest): Request[ListDimensionsResponse] = js.native
    def listDomainConfigurations(params: ListDomainConfigurationsRequest): Request[ListDomainConfigurationsResponse] = js.native
    def listIndices(params: ListIndicesRequest): Request[ListIndicesResponse] = js.native
    def listJobExecutionsForJob(params: ListJobExecutionsForJobRequest): Request[ListJobExecutionsForJobResponse] = js.native
    def listJobExecutionsForThing(params: ListJobExecutionsForThingRequest): Request[ListJobExecutionsForThingResponse] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse] = js.native
    def listMitigationActions(params: ListMitigationActionsRequest): Request[ListMitigationActionsResponse] = js.native
    def listOTAUpdates(params: ListOTAUpdatesRequest): Request[ListOTAUpdatesResponse] = js.native
    def listOutgoingCertificates(params: ListOutgoingCertificatesRequest): Request[ListOutgoingCertificatesResponse] = js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse] = js.native
    def listPolicyVersions(params: ListPolicyVersionsRequest): Request[ListPolicyVersionsResponse] = js.native
    def listPrincipalThings(params: ListPrincipalThingsRequest): Request[ListPrincipalThingsResponse] = js.native
    def listProvisioningTemplateVersions(params: ListProvisioningTemplateVersionsRequest): Request[ListProvisioningTemplateVersionsResponse] = js.native
    def listProvisioningTemplates(params: ListProvisioningTemplatesRequest): Request[ListProvisioningTemplatesResponse] = js.native
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
    def listTopicRuleDestinations(params: ListTopicRuleDestinationsRequest): Request[ListTopicRuleDestinationsResponse] = js.native
    def listTopicRules(params: ListTopicRulesRequest): Request[ListTopicRulesResponse] = js.native
    def listV2LoggingLevels(params: ListV2LoggingLevelsRequest): Request[ListV2LoggingLevelsResponse] = js.native
    def listViolationEvents(params: ListViolationEventsRequest): Request[ListViolationEventsResponse] = js.native
    def registerCACertificate(params: RegisterCACertificateRequest): Request[RegisterCACertificateResponse] = js.native
    def registerCertificate(params: RegisterCertificateRequest): Request[RegisterCertificateResponse] = js.native
    def registerCertificateWithoutCA(params: RegisterCertificateWithoutCARequest): Request[RegisterCertificateWithoutCAResponse] = js.native
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
    def startAuditMitigationActionsTask(params: StartAuditMitigationActionsTaskRequest): Request[StartAuditMitigationActionsTaskResponse] = js.native
    def startDetectMitigationActionsTask(params: StartDetectMitigationActionsTaskRequest): Request[StartDetectMitigationActionsTaskResponse] = js.native
    def startOnDemandAuditTask(params: StartOnDemandAuditTaskRequest): Request[StartOnDemandAuditTaskResponse] = js.native
    def startThingRegistrationTask(params: StartThingRegistrationTaskRequest): Request[StartThingRegistrationTaskResponse] = js.native
    def stopThingRegistrationTask(params: StopThingRegistrationTaskRequest): Request[StopThingRegistrationTaskResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def testAuthorization(params: TestAuthorizationRequest): Request[TestAuthorizationResponse] = js.native
    def testInvokeAuthorizer(params: TestInvokeAuthorizerRequest): Request[TestInvokeAuthorizerResponse] = js.native
    def transferCertificate(params: TransferCertificateRequest): Request[TransferCertificateResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAccountAuditConfiguration(params: UpdateAccountAuditConfigurationRequest): Request[UpdateAccountAuditConfigurationResponse] = js.native
    def updateAuditSuppression(params: UpdateAuditSuppressionRequest): Request[UpdateAuditSuppressionResponse] = js.native
    def updateAuthorizer(params: UpdateAuthorizerRequest): Request[UpdateAuthorizerResponse] = js.native
    def updateBillingGroup(params: UpdateBillingGroupRequest): Request[UpdateBillingGroupResponse] = js.native
    def updateCACertificate(params: UpdateCACertificateRequest): Request[js.Object] = js.native
    def updateCertificate(params: UpdateCertificateRequest): Request[js.Object] = js.native
    def updateCustomMetric(params: UpdateCustomMetricRequest): Request[UpdateCustomMetricResponse] = js.native
    def updateDimension(params: UpdateDimensionRequest): Request[UpdateDimensionResponse] = js.native
    def updateDomainConfiguration(params: UpdateDomainConfigurationRequest): Request[UpdateDomainConfigurationResponse] = js.native
    def updateDynamicThingGroup(params: UpdateDynamicThingGroupRequest): Request[UpdateDynamicThingGroupResponse] = js.native
    def updateEventConfigurations(params: UpdateEventConfigurationsRequest): Request[UpdateEventConfigurationsResponse] = js.native
    def updateIndexingConfiguration(params: UpdateIndexingConfigurationRequest): Request[UpdateIndexingConfigurationResponse] = js.native
    def updateJob(params: UpdateJobRequest): Request[js.Object] = js.native
    def updateMitigationAction(params: UpdateMitigationActionRequest): Request[UpdateMitigationActionResponse] = js.native
    def updateProvisioningTemplate(params: UpdateProvisioningTemplateRequest): Request[UpdateProvisioningTemplateResponse] = js.native
    def updateRoleAlias(params: UpdateRoleAliasRequest): Request[UpdateRoleAliasResponse] = js.native
    def updateScheduledAudit(params: UpdateScheduledAuditRequest): Request[UpdateScheduledAuditResponse] = js.native
    def updateSecurityProfile(params: UpdateSecurityProfileRequest): Request[UpdateSecurityProfileResponse] = js.native
    def updateStream(params: UpdateStreamRequest): Request[UpdateStreamResponse] = js.native
    def updateThing(params: UpdateThingRequest): Request[UpdateThingResponse] = js.native
    def updateThingGroup(params: UpdateThingGroupRequest): Request[UpdateThingGroupResponse] = js.native
    def updateThingGroupsForThing(params: UpdateThingGroupsForThingRequest): Request[UpdateThingGroupsForThingResponse] = js.native
    def updateTopicRuleDestination(params: UpdateTopicRuleDestinationRequest): Request[UpdateTopicRuleDestinationResponse] = js.native
    def validateSecurityProfileBehaviors(params: ValidateSecurityProfileBehaviorsRequest): Request[ValidateSecurityProfileBehaviorsResponse] = js.native
  }

  @js.native
  sealed trait AbortAction extends js.Any
  object AbortAction {
    val CANCEL = "CANCEL".asInstanceOf[AbortAction]

    @inline def values = js.Array(CANCEL)
  }

  /** The criteria that determine when and how a job abort takes place.
    */
  @js.native
  trait AbortConfig extends js.Object {
    var criteriaList: AbortCriteriaList
  }

  object AbortConfig {
    @inline
    def apply(
        criteriaList: AbortCriteriaList
    ): AbortConfig = {
      val __obj = js.Dynamic.literal(
        "criteriaList" -> criteriaList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AbortConfig]
    }
  }

  /** The criteria that determine when and how a job abort takes place.
    */
  @js.native
  trait AbortCriteria extends js.Object {
    var action: AbortAction
    var failureType: JobExecutionFailureType
    var minNumberOfExecutedThings: MinimumNumberOfExecutedThings
    var thresholdPercentage: AbortThresholdPercentage
  }

  object AbortCriteria {
    @inline
    def apply(
        action: AbortAction,
        failureType: JobExecutionFailureType,
        minNumberOfExecutedThings: MinimumNumberOfExecutedThings,
        thresholdPercentage: AbortThresholdPercentage
    ): AbortCriteria = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "failureType" -> failureType.asInstanceOf[js.Any],
        "minNumberOfExecutedThings" -> minNumberOfExecutedThings.asInstanceOf[js.Any],
        "thresholdPercentage" -> thresholdPercentage.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AbortCriteria]
    }
  }

  /** The input for the AcceptCertificateTransfer operation.
    */
  @js.native
  trait AcceptCertificateTransferRequest extends js.Object {
    var certificateId: CertificateId
    var setAsActive: js.UndefOr[SetAsActive]
  }

  object AcceptCertificateTransferRequest {
    @inline
    def apply(
        certificateId: CertificateId,
        setAsActive: js.UndefOr[SetAsActive] = js.undefined
    ): AcceptCertificateTransferRequest = {
      val __obj = js.Dynamic.literal(
        "certificateId" -> certificateId.asInstanceOf[js.Any]
      )

      setAsActive.foreach(__v => __obj.updateDynamic("setAsActive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptCertificateTransferRequest]
    }
  }

  /** Describes the actions associated with a rule.
    */
  @js.native
  trait Action extends js.Object {
    var cloudwatchAlarm: js.UndefOr[CloudwatchAlarmAction]
    var cloudwatchLogs: js.UndefOr[CloudwatchLogsAction]
    var cloudwatchMetric: js.UndefOr[CloudwatchMetricAction]
    var dynamoDB: js.UndefOr[DynamoDBAction]
    var dynamoDBv2: js.UndefOr[DynamoDBv2Action]
    var elasticsearch: js.UndefOr[ElasticsearchAction]
    var firehose: js.UndefOr[FirehoseAction]
    var http: js.UndefOr[HttpAction]
    var iotAnalytics: js.UndefOr[IotAnalyticsAction]
    var iotEvents: js.UndefOr[IotEventsAction]
    var iotSiteWise: js.UndefOr[IotSiteWiseAction]
    var kafka: js.UndefOr[KafkaAction]
    var kinesis: js.UndefOr[KinesisAction]
    var lambda: js.UndefOr[LambdaAction]
    var republish: js.UndefOr[RepublishAction]
    var s3: js.UndefOr[S3Action]
    var salesforce: js.UndefOr[SalesforceAction]
    var sns: js.UndefOr[SnsAction]
    var sqs: js.UndefOr[SqsAction]
    var stepFunctions: js.UndefOr[StepFunctionsAction]
    var timestream: js.UndefOr[TimestreamAction]
  }

  object Action {
    @inline
    def apply(
        cloudwatchAlarm: js.UndefOr[CloudwatchAlarmAction] = js.undefined,
        cloudwatchLogs: js.UndefOr[CloudwatchLogsAction] = js.undefined,
        cloudwatchMetric: js.UndefOr[CloudwatchMetricAction] = js.undefined,
        dynamoDB: js.UndefOr[DynamoDBAction] = js.undefined,
        dynamoDBv2: js.UndefOr[DynamoDBv2Action] = js.undefined,
        elasticsearch: js.UndefOr[ElasticsearchAction] = js.undefined,
        firehose: js.UndefOr[FirehoseAction] = js.undefined,
        http: js.UndefOr[HttpAction] = js.undefined,
        iotAnalytics: js.UndefOr[IotAnalyticsAction] = js.undefined,
        iotEvents: js.UndefOr[IotEventsAction] = js.undefined,
        iotSiteWise: js.UndefOr[IotSiteWiseAction] = js.undefined,
        kafka: js.UndefOr[KafkaAction] = js.undefined,
        kinesis: js.UndefOr[KinesisAction] = js.undefined,
        lambda: js.UndefOr[LambdaAction] = js.undefined,
        republish: js.UndefOr[RepublishAction] = js.undefined,
        s3: js.UndefOr[S3Action] = js.undefined,
        salesforce: js.UndefOr[SalesforceAction] = js.undefined,
        sns: js.UndefOr[SnsAction] = js.undefined,
        sqs: js.UndefOr[SqsAction] = js.undefined,
        stepFunctions: js.UndefOr[StepFunctionsAction] = js.undefined,
        timestream: js.UndefOr[TimestreamAction] = js.undefined
    ): Action = {
      val __obj = js.Dynamic.literal()
      cloudwatchAlarm.foreach(__v => __obj.updateDynamic("cloudwatchAlarm")(__v.asInstanceOf[js.Any]))
      cloudwatchLogs.foreach(__v => __obj.updateDynamic("cloudwatchLogs")(__v.asInstanceOf[js.Any]))
      cloudwatchMetric.foreach(__v => __obj.updateDynamic("cloudwatchMetric")(__v.asInstanceOf[js.Any]))
      dynamoDB.foreach(__v => __obj.updateDynamic("dynamoDB")(__v.asInstanceOf[js.Any]))
      dynamoDBv2.foreach(__v => __obj.updateDynamic("dynamoDBv2")(__v.asInstanceOf[js.Any]))
      elasticsearch.foreach(__v => __obj.updateDynamic("elasticsearch")(__v.asInstanceOf[js.Any]))
      firehose.foreach(__v => __obj.updateDynamic("firehose")(__v.asInstanceOf[js.Any]))
      http.foreach(__v => __obj.updateDynamic("http")(__v.asInstanceOf[js.Any]))
      iotAnalytics.foreach(__v => __obj.updateDynamic("iotAnalytics")(__v.asInstanceOf[js.Any]))
      iotEvents.foreach(__v => __obj.updateDynamic("iotEvents")(__v.asInstanceOf[js.Any]))
      iotSiteWise.foreach(__v => __obj.updateDynamic("iotSiteWise")(__v.asInstanceOf[js.Any]))
      kafka.foreach(__v => __obj.updateDynamic("kafka")(__v.asInstanceOf[js.Any]))
      kinesis.foreach(__v => __obj.updateDynamic("kinesis")(__v.asInstanceOf[js.Any]))
      lambda.foreach(__v => __obj.updateDynamic("lambda")(__v.asInstanceOf[js.Any]))
      republish.foreach(__v => __obj.updateDynamic("republish")(__v.asInstanceOf[js.Any]))
      s3.foreach(__v => __obj.updateDynamic("s3")(__v.asInstanceOf[js.Any]))
      salesforce.foreach(__v => __obj.updateDynamic("salesforce")(__v.asInstanceOf[js.Any]))
      sns.foreach(__v => __obj.updateDynamic("sns")(__v.asInstanceOf[js.Any]))
      sqs.foreach(__v => __obj.updateDynamic("sqs")(__v.asInstanceOf[js.Any]))
      stepFunctions.foreach(__v => __obj.updateDynamic("stepFunctions")(__v.asInstanceOf[js.Any]))
      timestream.foreach(__v => __obj.updateDynamic("timestream")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  @js.native
  sealed trait ActionType extends js.Any
  object ActionType {
    val PUBLISH = "PUBLISH".asInstanceOf[ActionType]
    val SUBSCRIBE = "SUBSCRIBE".asInstanceOf[ActionType]
    val RECEIVE = "RECEIVE".asInstanceOf[ActionType]
    val CONNECT = "CONNECT".asInstanceOf[ActionType]

    @inline def values = js.Array(PUBLISH, SUBSCRIBE, RECEIVE, CONNECT)
  }

  /** Information about an active Device Defender security profile behavior violation.
    */
  @js.native
  trait ActiveViolation extends js.Object {
    var behavior: js.UndefOr[Behavior]
    var lastViolationTime: js.UndefOr[Timestamp]
    var lastViolationValue: js.UndefOr[MetricValue]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[DeviceDefenderThingName]
    var violationEventAdditionalInfo: js.UndefOr[ViolationEventAdditionalInfo]
    var violationId: js.UndefOr[ViolationId]
    var violationStartTime: js.UndefOr[Timestamp]
  }

  object ActiveViolation {
    @inline
    def apply(
        behavior: js.UndefOr[Behavior] = js.undefined,
        lastViolationTime: js.UndefOr[Timestamp] = js.undefined,
        lastViolationValue: js.UndefOr[MetricValue] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined,
        violationEventAdditionalInfo: js.UndefOr[ViolationEventAdditionalInfo] = js.undefined,
        violationId: js.UndefOr[ViolationId] = js.undefined,
        violationStartTime: js.UndefOr[Timestamp] = js.undefined
    ): ActiveViolation = {
      val __obj = js.Dynamic.literal()
      behavior.foreach(__v => __obj.updateDynamic("behavior")(__v.asInstanceOf[js.Any]))
      lastViolationTime.foreach(__v => __obj.updateDynamic("lastViolationTime")(__v.asInstanceOf[js.Any]))
      lastViolationValue.foreach(__v => __obj.updateDynamic("lastViolationValue")(__v.asInstanceOf[js.Any]))
      securityProfileName.foreach(__v => __obj.updateDynamic("securityProfileName")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      violationEventAdditionalInfo.foreach(__v => __obj.updateDynamic("violationEventAdditionalInfo")(__v.asInstanceOf[js.Any]))
      violationId.foreach(__v => __obj.updateDynamic("violationId")(__v.asInstanceOf[js.Any]))
      violationStartTime.foreach(__v => __obj.updateDynamic("violationStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActiveViolation]
    }
  }

  @js.native
  trait AddThingToBillingGroupRequest extends js.Object {
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var billingGroupName: js.UndefOr[BillingGroupName]
    var thingArn: js.UndefOr[ThingArn]
    var thingName: js.UndefOr[ThingName]
  }

  object AddThingToBillingGroupRequest {
    @inline
    def apply(
        billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
        billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): AddThingToBillingGroupRequest = {
      val __obj = js.Dynamic.literal()
      billingGroupArn.foreach(__v => __obj.updateDynamic("billingGroupArn")(__v.asInstanceOf[js.Any]))
      billingGroupName.foreach(__v => __obj.updateDynamic("billingGroupName")(__v.asInstanceOf[js.Any]))
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddThingToBillingGroupRequest]
    }
  }

  @js.native
  trait AddThingToBillingGroupResponse extends js.Object

  object AddThingToBillingGroupResponse {
    @inline
    def apply(): AddThingToBillingGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddThingToBillingGroupResponse]
    }
  }

  @js.native
  trait AddThingToThingGroupRequest extends js.Object {
    var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups]
    var thingArn: js.UndefOr[ThingArn]
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingGroupName: js.UndefOr[ThingGroupName]
    var thingName: js.UndefOr[ThingName]
  }

  object AddThingToThingGroupRequest {
    @inline
    def apply(
        overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined,
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): AddThingToThingGroupRequest = {
      val __obj = js.Dynamic.literal()
      overrideDynamicGroups.foreach(__v => __obj.updateDynamic("overrideDynamicGroups")(__v.asInstanceOf[js.Any]))
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      thingGroupArn.foreach(__v => __obj.updateDynamic("thingGroupArn")(__v.asInstanceOf[js.Any]))
      thingGroupName.foreach(__v => __obj.updateDynamic("thingGroupName")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddThingToThingGroupRequest]
    }
  }

  @js.native
  trait AddThingToThingGroupResponse extends js.Object

  object AddThingToThingGroupResponse {
    @inline
    def apply(): AddThingToThingGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddThingToThingGroupResponse]
    }
  }

  /** Parameters used when defining a mitigation action that move a set of things to a thing group.
    */
  @js.native
  trait AddThingsToThingGroupParams extends js.Object {
    var thingGroupNames: ThingGroupNames
    var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups]
  }

  object AddThingsToThingGroupParams {
    @inline
    def apply(
        thingGroupNames: ThingGroupNames,
        overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined
    ): AddThingsToThingGroupParams = {
      val __obj = js.Dynamic.literal(
        "thingGroupNames" -> thingGroupNames.asInstanceOf[js.Any]
      )

      overrideDynamicGroups.foreach(__v => __obj.updateDynamic("overrideDynamicGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddThingsToThingGroupParams]
    }
  }

  /** A structure containing the alert target ARN and the role ARN.
    */
  @js.native
  trait AlertTarget extends js.Object {
    var alertTargetArn: AlertTargetArn
    var roleArn: RoleArn
  }

  object AlertTarget {
    @inline
    def apply(
        alertTargetArn: AlertTargetArn,
        roleArn: RoleArn
    ): AlertTarget = {
      val __obj = js.Dynamic.literal(
        "alertTargetArn" -> alertTargetArn.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AlertTarget]
    }
  }

  /** The type of alert target: one of "SNS".
    */
  @js.native
  sealed trait AlertTargetType extends js.Any
  object AlertTargetType {
    val SNS = "SNS".asInstanceOf[AlertTargetType]

    @inline def values = js.Array(SNS)
  }

  /** Contains information that allowed the authorization.
    */
  @js.native
  trait Allowed extends js.Object {
    var policies: js.UndefOr[Policies]
  }

  object Allowed {
    @inline
    def apply(
        policies: js.UndefOr[Policies] = js.undefined
    ): Allowed = {
      val __obj = js.Dynamic.literal()
      policies.foreach(__v => __obj.updateDynamic("policies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Allowed]
    }
  }

  /** An asset property timestamp entry containing the following information.
    */
  @js.native
  trait AssetPropertyTimestamp extends js.Object {
    var timeInSeconds: AssetPropertyTimeInSeconds
    var offsetInNanos: js.UndefOr[AssetPropertyOffsetInNanos]
  }

  object AssetPropertyTimestamp {
    @inline
    def apply(
        timeInSeconds: AssetPropertyTimeInSeconds,
        offsetInNanos: js.UndefOr[AssetPropertyOffsetInNanos] = js.undefined
    ): AssetPropertyTimestamp = {
      val __obj = js.Dynamic.literal(
        "timeInSeconds" -> timeInSeconds.asInstanceOf[js.Any]
      )

      offsetInNanos.foreach(__v => __obj.updateDynamic("offsetInNanos")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetPropertyTimestamp]
    }
  }

  /** An asset property value entry containing the following information.
    */
  @js.native
  trait AssetPropertyValue extends js.Object {
    var timestamp: AssetPropertyTimestamp
    var value: AssetPropertyVariant
    var quality: js.UndefOr[AssetPropertyQuality]
  }

  object AssetPropertyValue {
    @inline
    def apply(
        timestamp: AssetPropertyTimestamp,
        value: AssetPropertyVariant,
        quality: js.UndefOr[AssetPropertyQuality] = js.undefined
    ): AssetPropertyValue = {
      val __obj = js.Dynamic.literal(
        "timestamp" -> timestamp.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      quality.foreach(__v => __obj.updateDynamic("quality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetPropertyValue]
    }
  }

  /** Contains an asset property value (of a single type).
    */
  @js.native
  trait AssetPropertyVariant extends js.Object {
    var booleanValue: js.UndefOr[AssetPropertyBooleanValue]
    var doubleValue: js.UndefOr[AssetPropertyDoubleValue]
    var integerValue: js.UndefOr[AssetPropertyIntegerValue]
    var stringValue: js.UndefOr[AssetPropertyStringValue]
  }

  object AssetPropertyVariant {
    @inline
    def apply(
        booleanValue: js.UndefOr[AssetPropertyBooleanValue] = js.undefined,
        doubleValue: js.UndefOr[AssetPropertyDoubleValue] = js.undefined,
        integerValue: js.UndefOr[AssetPropertyIntegerValue] = js.undefined,
        stringValue: js.UndefOr[AssetPropertyStringValue] = js.undefined
    ): AssetPropertyVariant = {
      val __obj = js.Dynamic.literal()
      booleanValue.foreach(__v => __obj.updateDynamic("booleanValue")(__v.asInstanceOf[js.Any]))
      doubleValue.foreach(__v => __obj.updateDynamic("doubleValue")(__v.asInstanceOf[js.Any]))
      integerValue.foreach(__v => __obj.updateDynamic("integerValue")(__v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.updateDynamic("stringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetPropertyVariant]
    }
  }

  @js.native
  trait AssociateTargetsWithJobRequest extends js.Object {
    var jobId: JobId
    var targets: JobTargets
    var comment: js.UndefOr[Comment]
    var namespaceId: js.UndefOr[NamespaceId]
  }

  object AssociateTargetsWithJobRequest {
    @inline
    def apply(
        jobId: JobId,
        targets: JobTargets,
        comment: js.UndefOr[Comment] = js.undefined,
        namespaceId: js.UndefOr[NamespaceId] = js.undefined
    ): AssociateTargetsWithJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "targets" -> targets.asInstanceOf[js.Any]
      )

      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      namespaceId.foreach(__v => __obj.updateDynamic("namespaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateTargetsWithJobRequest]
    }
  }

  @js.native
  trait AssociateTargetsWithJobResponse extends js.Object {
    var description: js.UndefOr[JobDescription]
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
  }

  object AssociateTargetsWithJobResponse {
    @inline
    def apply(
        description: js.UndefOr[JobDescription] = js.undefined,
        jobArn: js.UndefOr[JobArn] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined
    ): AssociateTargetsWithJobResponse = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      jobArn.foreach(__v => __obj.updateDynamic("jobArn")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateTargetsWithJobResponse]
    }
  }

  @js.native
  trait AttachPolicyRequest extends js.Object {
    var policyName: PolicyName
    var target: PolicyTarget
  }

  object AttachPolicyRequest {
    @inline
    def apply(
        policyName: PolicyName,
        target: PolicyTarget
    ): AttachPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyName" -> policyName.asInstanceOf[js.Any],
        "target" -> target.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttachPolicyRequest]
    }
  }

  /** The input for the AttachPrincipalPolicy operation.
    */
  @js.native
  trait AttachPrincipalPolicyRequest extends js.Object {
    var policyName: PolicyName
    var principal: Principal
  }

  object AttachPrincipalPolicyRequest {
    @inline
    def apply(
        policyName: PolicyName,
        principal: Principal
    ): AttachPrincipalPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyName" -> policyName.asInstanceOf[js.Any],
        "principal" -> principal.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttachPrincipalPolicyRequest]
    }
  }

  @js.native
  trait AttachSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var securityProfileTargetArn: SecurityProfileTargetArn
  }

  object AttachSecurityProfileRequest {
    @inline
    def apply(
        securityProfileName: SecurityProfileName,
        securityProfileTargetArn: SecurityProfileTargetArn
    ): AttachSecurityProfileRequest = {
      val __obj = js.Dynamic.literal(
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any],
        "securityProfileTargetArn" -> securityProfileTargetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttachSecurityProfileRequest]
    }
  }

  @js.native
  trait AttachSecurityProfileResponse extends js.Object

  object AttachSecurityProfileResponse {
    @inline
    def apply(): AttachSecurityProfileResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachSecurityProfileResponse]
    }
  }

  /** The input for the AttachThingPrincipal operation.
    */
  @js.native
  trait AttachThingPrincipalRequest extends js.Object {
    var principal: Principal
    var thingName: ThingName
  }

  object AttachThingPrincipalRequest {
    @inline
    def apply(
        principal: Principal,
        thingName: ThingName
    ): AttachThingPrincipalRequest = {
      val __obj = js.Dynamic.literal(
        "principal" -> principal.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttachThingPrincipalRequest]
    }
  }

  /** The output from the AttachThingPrincipal operation.
    */
  @js.native
  trait AttachThingPrincipalResponse extends js.Object

  object AttachThingPrincipalResponse {
    @inline
    def apply(): AttachThingPrincipalResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachThingPrincipalResponse]
    }
  }

  /** The attribute payload.
    */
  @js.native
  trait AttributePayload extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var merge: js.UndefOr[Flag]
  }

  object AttributePayload {
    @inline
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined,
        merge: js.UndefOr[Flag] = js.undefined
    ): AttributePayload = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      merge.foreach(__v => __obj.updateDynamic("merge")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributePayload]
    }
  }

  /** Which audit checks are enabled and disabled for this account.
    */
  @js.native
  trait AuditCheckConfiguration extends js.Object {
    var enabled: js.UndefOr[Enabled]
  }

  object AuditCheckConfiguration {
    @inline
    def apply(
        enabled: js.UndefOr[Enabled] = js.undefined
    ): AuditCheckConfiguration = {
      val __obj = js.Dynamic.literal()
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditCheckConfiguration]
    }
  }

  /** Information about the audit check.
    */
  @js.native
  trait AuditCheckDetails extends js.Object {
    var checkCompliant: js.UndefOr[CheckCompliant]
    var checkRunStatus: js.UndefOr[AuditCheckRunStatus]
    var errorCode: js.UndefOr[ErrorCode]
    var message: js.UndefOr[ErrorMessage]
    var nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount]
    var suppressedNonCompliantResourcesCount: js.UndefOr[SuppressedNonCompliantResourcesCount]
    var totalResourcesCount: js.UndefOr[TotalResourcesCount]
  }

  object AuditCheckDetails {
    @inline
    def apply(
        checkCompliant: js.UndefOr[CheckCompliant] = js.undefined,
        checkRunStatus: js.UndefOr[AuditCheckRunStatus] = js.undefined,
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        message: js.UndefOr[ErrorMessage] = js.undefined,
        nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount] = js.undefined,
        suppressedNonCompliantResourcesCount: js.UndefOr[SuppressedNonCompliantResourcesCount] = js.undefined,
        totalResourcesCount: js.UndefOr[TotalResourcesCount] = js.undefined
    ): AuditCheckDetails = {
      val __obj = js.Dynamic.literal()
      checkCompliant.foreach(__v => __obj.updateDynamic("checkCompliant")(__v.asInstanceOf[js.Any]))
      checkRunStatus.foreach(__v => __obj.updateDynamic("checkRunStatus")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      nonCompliantResourcesCount.foreach(__v => __obj.updateDynamic("nonCompliantResourcesCount")(__v.asInstanceOf[js.Any]))
      suppressedNonCompliantResourcesCount.foreach(__v => __obj.updateDynamic("suppressedNonCompliantResourcesCount")(__v.asInstanceOf[js.Any]))
      totalResourcesCount.foreach(__v => __obj.updateDynamic("totalResourcesCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditCheckDetails]
    }
  }

  @js.native
  sealed trait AuditCheckRunStatus extends js.Any
  object AuditCheckRunStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AuditCheckRunStatus]
    val WAITING_FOR_DATA_COLLECTION = "WAITING_FOR_DATA_COLLECTION".asInstanceOf[AuditCheckRunStatus]
    val CANCELED = "CANCELED".asInstanceOf[AuditCheckRunStatus]
    val COMPLETED_COMPLIANT = "COMPLETED_COMPLIANT".asInstanceOf[AuditCheckRunStatus]
    val COMPLETED_NON_COMPLIANT = "COMPLETED_NON_COMPLIANT".asInstanceOf[AuditCheckRunStatus]
    val FAILED = "FAILED".asInstanceOf[AuditCheckRunStatus]

    @inline def values = js.Array(IN_PROGRESS, WAITING_FOR_DATA_COLLECTION, CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED)
  }

  /** The findings (results) of the audit.
    */
  @js.native
  trait AuditFinding extends js.Object {
    var checkName: js.UndefOr[AuditCheckName]
    var findingId: js.UndefOr[FindingId]
    var findingTime: js.UndefOr[Timestamp]
    var isSuppressed: js.UndefOr[IsSuppressed]
    var nonCompliantResource: js.UndefOr[NonCompliantResource]
    var reasonForNonCompliance: js.UndefOr[ReasonForNonCompliance]
    var reasonForNonComplianceCode: js.UndefOr[ReasonForNonComplianceCode]
    var relatedResources: js.UndefOr[RelatedResources]
    var severity: js.UndefOr[AuditFindingSeverity]
    var taskId: js.UndefOr[AuditTaskId]
    var taskStartTime: js.UndefOr[Timestamp]
  }

  object AuditFinding {
    @inline
    def apply(
        checkName: js.UndefOr[AuditCheckName] = js.undefined,
        findingId: js.UndefOr[FindingId] = js.undefined,
        findingTime: js.UndefOr[Timestamp] = js.undefined,
        isSuppressed: js.UndefOr[IsSuppressed] = js.undefined,
        nonCompliantResource: js.UndefOr[NonCompliantResource] = js.undefined,
        reasonForNonCompliance: js.UndefOr[ReasonForNonCompliance] = js.undefined,
        reasonForNonComplianceCode: js.UndefOr[ReasonForNonComplianceCode] = js.undefined,
        relatedResources: js.UndefOr[RelatedResources] = js.undefined,
        severity: js.UndefOr[AuditFindingSeverity] = js.undefined,
        taskId: js.UndefOr[AuditTaskId] = js.undefined,
        taskStartTime: js.UndefOr[Timestamp] = js.undefined
    ): AuditFinding = {
      val __obj = js.Dynamic.literal()
      checkName.foreach(__v => __obj.updateDynamic("checkName")(__v.asInstanceOf[js.Any]))
      findingId.foreach(__v => __obj.updateDynamic("findingId")(__v.asInstanceOf[js.Any]))
      findingTime.foreach(__v => __obj.updateDynamic("findingTime")(__v.asInstanceOf[js.Any]))
      isSuppressed.foreach(__v => __obj.updateDynamic("isSuppressed")(__v.asInstanceOf[js.Any]))
      nonCompliantResource.foreach(__v => __obj.updateDynamic("nonCompliantResource")(__v.asInstanceOf[js.Any]))
      reasonForNonCompliance.foreach(__v => __obj.updateDynamic("reasonForNonCompliance")(__v.asInstanceOf[js.Any]))
      reasonForNonComplianceCode.foreach(__v => __obj.updateDynamic("reasonForNonComplianceCode")(__v.asInstanceOf[js.Any]))
      relatedResources.foreach(__v => __obj.updateDynamic("relatedResources")(__v.asInstanceOf[js.Any]))
      severity.foreach(__v => __obj.updateDynamic("severity")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      taskStartTime.foreach(__v => __obj.updateDynamic("taskStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditFinding]
    }
  }

  @js.native
  sealed trait AuditFindingSeverity extends js.Any
  object AuditFindingSeverity {
    val CRITICAL = "CRITICAL".asInstanceOf[AuditFindingSeverity]
    val HIGH = "HIGH".asInstanceOf[AuditFindingSeverity]
    val MEDIUM = "MEDIUM".asInstanceOf[AuditFindingSeverity]
    val LOW = "LOW".asInstanceOf[AuditFindingSeverity]

    @inline def values = js.Array(CRITICAL, HIGH, MEDIUM, LOW)
  }

  @js.native
  sealed trait AuditFrequency extends js.Any
  object AuditFrequency {
    val DAILY = "DAILY".asInstanceOf[AuditFrequency]
    val WEEKLY = "WEEKLY".asInstanceOf[AuditFrequency]
    val BIWEEKLY = "BIWEEKLY".asInstanceOf[AuditFrequency]
    val MONTHLY = "MONTHLY".asInstanceOf[AuditFrequency]

    @inline def values = js.Array(DAILY, WEEKLY, BIWEEKLY, MONTHLY)
  }

  /** Returned by ListAuditMitigationActionsTask, this object contains information that describes a mitigation action that has been started.
    */
  @js.native
  trait AuditMitigationActionExecutionMetadata extends js.Object {
    var actionId: js.UndefOr[MitigationActionId]
    var actionName: js.UndefOr[MitigationActionName]
    var endTime: js.UndefOr[Timestamp]
    var errorCode: js.UndefOr[ErrorCode]
    var findingId: js.UndefOr[FindingId]
    var message: js.UndefOr[ErrorMessage]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[AuditMitigationActionsExecutionStatus]
    var taskId: js.UndefOr[MitigationActionsTaskId]
  }

  object AuditMitigationActionExecutionMetadata {
    @inline
    def apply(
        actionId: js.UndefOr[MitigationActionId] = js.undefined,
        actionName: js.UndefOr[MitigationActionName] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        findingId: js.UndefOr[FindingId] = js.undefined,
        message: js.UndefOr[ErrorMessage] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[AuditMitigationActionsExecutionStatus] = js.undefined,
        taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined
    ): AuditMitigationActionExecutionMetadata = {
      val __obj = js.Dynamic.literal()
      actionId.foreach(__v => __obj.updateDynamic("actionId")(__v.asInstanceOf[js.Any]))
      actionName.foreach(__v => __obj.updateDynamic("actionName")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      findingId.foreach(__v => __obj.updateDynamic("findingId")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditMitigationActionExecutionMetadata]
    }
  }

  @js.native
  sealed trait AuditMitigationActionsExecutionStatus extends js.Any
  object AuditMitigationActionsExecutionStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AuditMitigationActionsExecutionStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[AuditMitigationActionsExecutionStatus]
    val FAILED = "FAILED".asInstanceOf[AuditMitigationActionsExecutionStatus]
    val CANCELED = "CANCELED".asInstanceOf[AuditMitigationActionsExecutionStatus]
    val SKIPPED = "SKIPPED".asInstanceOf[AuditMitigationActionsExecutionStatus]
    val PENDING = "PENDING".asInstanceOf[AuditMitigationActionsExecutionStatus]

    @inline def values = js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED, PENDING)
  }

  /** Information about an audit mitigation actions task that is returned by <code>ListAuditMitigationActionsTasks</code>.
    */
  @js.native
  trait AuditMitigationActionsTaskMetadata extends js.Object {
    var startTime: js.UndefOr[Timestamp]
    var taskId: js.UndefOr[MitigationActionsTaskId]
    var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus]
  }

  object AuditMitigationActionsTaskMetadata {
    @inline
    def apply(
        startTime: js.UndefOr[Timestamp] = js.undefined,
        taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined,
        taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.undefined
    ): AuditMitigationActionsTaskMetadata = {
      val __obj = js.Dynamic.literal()
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      taskStatus.foreach(__v => __obj.updateDynamic("taskStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditMitigationActionsTaskMetadata]
    }
  }

  @js.native
  sealed trait AuditMitigationActionsTaskStatus extends js.Any
  object AuditMitigationActionsTaskStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AuditMitigationActionsTaskStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[AuditMitigationActionsTaskStatus]
    val FAILED = "FAILED".asInstanceOf[AuditMitigationActionsTaskStatus]
    val CANCELED = "CANCELED".asInstanceOf[AuditMitigationActionsTaskStatus]

    @inline def values = js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED)
  }

  /** Used in MitigationActionParams, this information identifies the target findings to which the mitigation actions are applied. Only one entry appears.
    */
  @js.native
  trait AuditMitigationActionsTaskTarget extends js.Object {
    var auditCheckToReasonCodeFilter: js.UndefOr[AuditCheckToReasonCodeFilter]
    var auditTaskId: js.UndefOr[AuditTaskId]
    var findingIds: js.UndefOr[FindingIds]
  }

  object AuditMitigationActionsTaskTarget {
    @inline
    def apply(
        auditCheckToReasonCodeFilter: js.UndefOr[AuditCheckToReasonCodeFilter] = js.undefined,
        auditTaskId: js.UndefOr[AuditTaskId] = js.undefined,
        findingIds: js.UndefOr[FindingIds] = js.undefined
    ): AuditMitigationActionsTaskTarget = {
      val __obj = js.Dynamic.literal()
      auditCheckToReasonCodeFilter.foreach(__v => __obj.updateDynamic("auditCheckToReasonCodeFilter")(__v.asInstanceOf[js.Any]))
      auditTaskId.foreach(__v => __obj.updateDynamic("auditTaskId")(__v.asInstanceOf[js.Any]))
      findingIds.foreach(__v => __obj.updateDynamic("findingIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditMitigationActionsTaskTarget]
    }
  }

  /** Information about the targets to which audit notifications are sent.
    */
  @js.native
  trait AuditNotificationTarget extends js.Object {
    var enabled: js.UndefOr[Enabled]
    var roleArn: js.UndefOr[RoleArn]
    var targetArn: js.UndefOr[TargetArn]
  }

  object AuditNotificationTarget {
    @inline
    def apply(
        enabled: js.UndefOr[Enabled] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        targetArn: js.UndefOr[TargetArn] = js.undefined
    ): AuditNotificationTarget = {
      val __obj = js.Dynamic.literal()
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      targetArn.foreach(__v => __obj.updateDynamic("targetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditNotificationTarget]
    }
  }

  @js.native
  sealed trait AuditNotificationType extends js.Any
  object AuditNotificationType {
    val SNS = "SNS".asInstanceOf[AuditNotificationType]

    @inline def values = js.Array(SNS)
  }

  /** Filters out specific findings of a Device Defender audit.
    */
  @js.native
  trait AuditSuppression extends js.Object {
    var checkName: AuditCheckName
    var resourceIdentifier: ResourceIdentifier
    var description: js.UndefOr[AuditDescription]
    var expirationDate: js.UndefOr[Timestamp]
    var suppressIndefinitely: js.UndefOr[SuppressIndefinitely]
  }

  object AuditSuppression {
    @inline
    def apply(
        checkName: AuditCheckName,
        resourceIdentifier: ResourceIdentifier,
        description: js.UndefOr[AuditDescription] = js.undefined,
        expirationDate: js.UndefOr[Timestamp] = js.undefined,
        suppressIndefinitely: js.UndefOr[SuppressIndefinitely] = js.undefined
    ): AuditSuppression = {
      val __obj = js.Dynamic.literal(
        "checkName" -> checkName.asInstanceOf[js.Any],
        "resourceIdentifier" -> resourceIdentifier.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      expirationDate.foreach(__v => __obj.updateDynamic("expirationDate")(__v.asInstanceOf[js.Any]))
      suppressIndefinitely.foreach(__v => __obj.updateDynamic("suppressIndefinitely")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditSuppression]
    }
  }

  /** The audits that were performed.
    */
  @js.native
  trait AuditTaskMetadata extends js.Object {
    var taskId: js.UndefOr[AuditTaskId]
    var taskStatus: js.UndefOr[AuditTaskStatus]
    var taskType: js.UndefOr[AuditTaskType]
  }

  object AuditTaskMetadata {
    @inline
    def apply(
        taskId: js.UndefOr[AuditTaskId] = js.undefined,
        taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined,
        taskType: js.UndefOr[AuditTaskType] = js.undefined
    ): AuditTaskMetadata = {
      val __obj = js.Dynamic.literal()
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      taskStatus.foreach(__v => __obj.updateDynamic("taskStatus")(__v.asInstanceOf[js.Any]))
      taskType.foreach(__v => __obj.updateDynamic("taskType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditTaskMetadata]
    }
  }

  @js.native
  sealed trait AuditTaskStatus extends js.Any
  object AuditTaskStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AuditTaskStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[AuditTaskStatus]
    val FAILED = "FAILED".asInstanceOf[AuditTaskStatus]
    val CANCELED = "CANCELED".asInstanceOf[AuditTaskStatus]

    @inline def values = js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED)
  }

  @js.native
  sealed trait AuditTaskType extends js.Any
  object AuditTaskType {
    val ON_DEMAND_AUDIT_TASK = "ON_DEMAND_AUDIT_TASK".asInstanceOf[AuditTaskType]
    val SCHEDULED_AUDIT_TASK = "SCHEDULED_AUDIT_TASK".asInstanceOf[AuditTaskType]

    @inline def values = js.Array(ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK)
  }

  @js.native
  sealed trait AuthDecision extends js.Any
  object AuthDecision {
    val ALLOWED = "ALLOWED".asInstanceOf[AuthDecision]
    val EXPLICIT_DENY = "EXPLICIT_DENY".asInstanceOf[AuthDecision]
    val IMPLICIT_DENY = "IMPLICIT_DENY".asInstanceOf[AuthDecision]

    @inline def values = js.Array(ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY)
  }

  /** A collection of authorization information.
    */
  @js.native
  trait AuthInfo extends js.Object {
    var resources: Resources
    var actionType: js.UndefOr[ActionType]
  }

  object AuthInfo {
    @inline
    def apply(
        resources: Resources,
        actionType: js.UndefOr[ActionType] = js.undefined
    ): AuthInfo = {
      val __obj = js.Dynamic.literal(
        "resources" -> resources.asInstanceOf[js.Any]
      )

      actionType.foreach(__v => __obj.updateDynamic("actionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthInfo]
    }
  }

  /** The authorizer result.
    */
  @js.native
  trait AuthResult extends js.Object {
    var allowed: js.UndefOr[Allowed]
    var authDecision: js.UndefOr[AuthDecision]
    var authInfo: js.UndefOr[AuthInfo]
    var denied: js.UndefOr[Denied]
    var missingContextValues: js.UndefOr[MissingContextValues]
  }

  object AuthResult {
    @inline
    def apply(
        allowed: js.UndefOr[Allowed] = js.undefined,
        authDecision: js.UndefOr[AuthDecision] = js.undefined,
        authInfo: js.UndefOr[AuthInfo] = js.undefined,
        denied: js.UndefOr[Denied] = js.undefined,
        missingContextValues: js.UndefOr[MissingContextValues] = js.undefined
    ): AuthResult = {
      val __obj = js.Dynamic.literal()
      allowed.foreach(__v => __obj.updateDynamic("allowed")(__v.asInstanceOf[js.Any]))
      authDecision.foreach(__v => __obj.updateDynamic("authDecision")(__v.asInstanceOf[js.Any]))
      authInfo.foreach(__v => __obj.updateDynamic("authInfo")(__v.asInstanceOf[js.Any]))
      denied.foreach(__v => __obj.updateDynamic("denied")(__v.asInstanceOf[js.Any]))
      missingContextValues.foreach(__v => __obj.updateDynamic("missingContextValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthResult]
    }
  }

  /** An object that specifies the authorization service for a domain.
    */
  @js.native
  trait AuthorizerConfig extends js.Object {
    var allowAuthorizerOverride: js.UndefOr[AllowAuthorizerOverride]
    var defaultAuthorizerName: js.UndefOr[AuthorizerName]
  }

  object AuthorizerConfig {
    @inline
    def apply(
        allowAuthorizerOverride: js.UndefOr[AllowAuthorizerOverride] = js.undefined,
        defaultAuthorizerName: js.UndefOr[AuthorizerName] = js.undefined
    ): AuthorizerConfig = {
      val __obj = js.Dynamic.literal()
      allowAuthorizerOverride.foreach(__v => __obj.updateDynamic("allowAuthorizerOverride")(__v.asInstanceOf[js.Any]))
      defaultAuthorizerName.foreach(__v => __obj.updateDynamic("defaultAuthorizerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizerConfig]
    }
  }

  /** The authorizer description.
    */
  @js.native
  trait AuthorizerDescription extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn]
    var authorizerName: js.UndefOr[AuthorizerName]
    var creationDate: js.UndefOr[DateType]
    var lastModifiedDate: js.UndefOr[DateType]
    var signingDisabled: js.UndefOr[BooleanKey]
    var status: js.UndefOr[AuthorizerStatus]
    var tokenKeyName: js.UndefOr[TokenKeyName]
    var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap]
  }

  object AuthorizerDescription {
    @inline
    def apply(
        authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined,
        authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.undefined,
        authorizerName: js.UndefOr[AuthorizerName] = js.undefined,
        creationDate: js.UndefOr[DateType] = js.undefined,
        lastModifiedDate: js.UndefOr[DateType] = js.undefined,
        signingDisabled: js.UndefOr[BooleanKey] = js.undefined,
        status: js.UndefOr[AuthorizerStatus] = js.undefined,
        tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined,
        tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined
    ): AuthorizerDescription = {
      val __obj = js.Dynamic.literal()
      authorizerArn.foreach(__v => __obj.updateDynamic("authorizerArn")(__v.asInstanceOf[js.Any]))
      authorizerFunctionArn.foreach(__v => __obj.updateDynamic("authorizerFunctionArn")(__v.asInstanceOf[js.Any]))
      authorizerName.foreach(__v => __obj.updateDynamic("authorizerName")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      signingDisabled.foreach(__v => __obj.updateDynamic("signingDisabled")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tokenKeyName.foreach(__v => __obj.updateDynamic("tokenKeyName")(__v.asInstanceOf[js.Any]))
      tokenSigningPublicKeys.foreach(__v => __obj.updateDynamic("tokenSigningPublicKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizerDescription]
    }
  }

  @js.native
  sealed trait AuthorizerStatus extends js.Any
  object AuthorizerStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[AuthorizerStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[AuthorizerStatus]

    @inline def values = js.Array(ACTIVE, INACTIVE)
  }

  /** The authorizer summary.
    */
  @js.native
  trait AuthorizerSummary extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  object AuthorizerSummary {
    @inline
    def apply(
        authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined,
        authorizerName: js.UndefOr[AuthorizerName] = js.undefined
    ): AuthorizerSummary = {
      val __obj = js.Dynamic.literal()
      authorizerArn.foreach(__v => __obj.updateDynamic("authorizerArn")(__v.asInstanceOf[js.Any]))
      authorizerName.foreach(__v => __obj.updateDynamic("authorizerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizerSummary]
    }
  }

  @js.native
  sealed trait AutoRegistrationStatus extends js.Any
  object AutoRegistrationStatus {
    val ENABLE = "ENABLE".asInstanceOf[AutoRegistrationStatus]
    val DISABLE = "DISABLE".asInstanceOf[AutoRegistrationStatus]

    @inline def values = js.Array(ENABLE, DISABLE)
  }

  /** The criteria that determine when and how a job abort takes place.
    */
  @js.native
  trait AwsJobAbortConfig extends js.Object {
    var abortCriteriaList: AwsJobAbortCriteriaList
  }

  object AwsJobAbortConfig {
    @inline
    def apply(
        abortCriteriaList: AwsJobAbortCriteriaList
    ): AwsJobAbortConfig = {
      val __obj = js.Dynamic.literal(
        "abortCriteriaList" -> abortCriteriaList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AwsJobAbortConfig]
    }
  }

  /** The criteria that determine when and how a job abort takes place.
    */
  @js.native
  trait AwsJobAbortCriteria extends js.Object {
    var action: AwsJobAbortCriteriaAbortAction
    var failureType: AwsJobAbortCriteriaFailureType
    var minNumberOfExecutedThings: AwsJobAbortCriteriaMinimumNumberOfExecutedThings
    var thresholdPercentage: AwsJobAbortCriteriaAbortThresholdPercentage
  }

  object AwsJobAbortCriteria {
    @inline
    def apply(
        action: AwsJobAbortCriteriaAbortAction,
        failureType: AwsJobAbortCriteriaFailureType,
        minNumberOfExecutedThings: AwsJobAbortCriteriaMinimumNumberOfExecutedThings,
        thresholdPercentage: AwsJobAbortCriteriaAbortThresholdPercentage
    ): AwsJobAbortCriteria = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "failureType" -> failureType.asInstanceOf[js.Any],
        "minNumberOfExecutedThings" -> minNumberOfExecutedThings.asInstanceOf[js.Any],
        "thresholdPercentage" -> thresholdPercentage.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AwsJobAbortCriteria]
    }
  }

  @js.native
  sealed trait AwsJobAbortCriteriaAbortAction extends js.Any
  object AwsJobAbortCriteriaAbortAction {
    val CANCEL = "CANCEL".asInstanceOf[AwsJobAbortCriteriaAbortAction]

    @inline def values = js.Array(CANCEL)
  }

  @js.native
  sealed trait AwsJobAbortCriteriaFailureType extends js.Any
  object AwsJobAbortCriteriaFailureType {
    val FAILED = "FAILED".asInstanceOf[AwsJobAbortCriteriaFailureType]
    val REJECTED = "REJECTED".asInstanceOf[AwsJobAbortCriteriaFailureType]
    val TIMED_OUT = "TIMED_OUT".asInstanceOf[AwsJobAbortCriteriaFailureType]
    val ALL = "ALL".asInstanceOf[AwsJobAbortCriteriaFailureType]

    @inline def values = js.Array(FAILED, REJECTED, TIMED_OUT, ALL)
  }

  /** Configuration for the rollout of OTA updates.
    */
  @js.native
  trait AwsJobExecutionsRolloutConfig extends js.Object {
    var exponentialRate: js.UndefOr[AwsJobExponentialRolloutRate]
    var maximumPerMinute: js.UndefOr[MaximumPerMinute]
  }

  object AwsJobExecutionsRolloutConfig {
    @inline
    def apply(
        exponentialRate: js.UndefOr[AwsJobExponentialRolloutRate] = js.undefined,
        maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.undefined
    ): AwsJobExecutionsRolloutConfig = {
      val __obj = js.Dynamic.literal()
      exponentialRate.foreach(__v => __obj.updateDynamic("exponentialRate")(__v.asInstanceOf[js.Any]))
      maximumPerMinute.foreach(__v => __obj.updateDynamic("maximumPerMinute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsJobExecutionsRolloutConfig]
    }
  }

  /** The rate of increase for a job rollout. This parameter allows you to define an exponential rate increase for a job rollout.
    */
  @js.native
  trait AwsJobExponentialRolloutRate extends js.Object {
    var baseRatePerMinute: AwsJobRolloutRatePerMinute
    var incrementFactor: AwsJobRolloutIncrementFactor
    var rateIncreaseCriteria: AwsJobRateIncreaseCriteria
  }

  object AwsJobExponentialRolloutRate {
    @inline
    def apply(
        baseRatePerMinute: AwsJobRolloutRatePerMinute,
        incrementFactor: AwsJobRolloutIncrementFactor,
        rateIncreaseCriteria: AwsJobRateIncreaseCriteria
    ): AwsJobExponentialRolloutRate = {
      val __obj = js.Dynamic.literal(
        "baseRatePerMinute" -> baseRatePerMinute.asInstanceOf[js.Any],
        "incrementFactor" -> incrementFactor.asInstanceOf[js.Any],
        "rateIncreaseCriteria" -> rateIncreaseCriteria.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AwsJobExponentialRolloutRate]
    }
  }

  /** Configuration information for pre-signed URLs. Valid when <code>protocols</code> contains HTTP.
    */
  @js.native
  trait AwsJobPresignedUrlConfig extends js.Object {
    var expiresInSec: js.UndefOr[ExpiresInSeconds]
  }

  object AwsJobPresignedUrlConfig {
    @inline
    def apply(
        expiresInSec: js.UndefOr[ExpiresInSeconds] = js.undefined
    ): AwsJobPresignedUrlConfig = {
      val __obj = js.Dynamic.literal()
      expiresInSec.foreach(__v => __obj.updateDynamic("expiresInSec")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsJobPresignedUrlConfig]
    }
  }

  /** The criteria to initiate the increase in rate of rollout for a job.
    */
  @js.native
  trait AwsJobRateIncreaseCriteria extends js.Object {
    var numberOfNotifiedThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings]
    var numberOfSucceededThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings]
  }

  object AwsJobRateIncreaseCriteria {
    @inline
    def apply(
        numberOfNotifiedThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings] = js.undefined,
        numberOfSucceededThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings] = js.undefined
    ): AwsJobRateIncreaseCriteria = {
      val __obj = js.Dynamic.literal()
      numberOfNotifiedThings.foreach(__v => __obj.updateDynamic("numberOfNotifiedThings")(__v.asInstanceOf[js.Any]))
      numberOfSucceededThings.foreach(__v => __obj.updateDynamic("numberOfSucceededThings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsJobRateIncreaseCriteria]
    }
  }

  /** Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another terminal state before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.
    */
  @js.native
  trait AwsJobTimeoutConfig extends js.Object {
    var inProgressTimeoutInMinutes: js.UndefOr[AwsJobTimeoutInProgressTimeoutInMinutes]
  }

  object AwsJobTimeoutConfig {
    @inline
    def apply(
        inProgressTimeoutInMinutes: js.UndefOr[AwsJobTimeoutInProgressTimeoutInMinutes] = js.undefined
    ): AwsJobTimeoutConfig = {
      val __obj = js.Dynamic.literal()
      inProgressTimeoutInMinutes.foreach(__v => __obj.updateDynamic("inProgressTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsJobTimeoutConfig]
    }
  }

  /** A Device Defender security profile behavior.
    */
  @js.native
  trait Behavior extends js.Object {
    var name: BehaviorName
    var criteria: js.UndefOr[BehaviorCriteria]
    var metric: js.UndefOr[BehaviorMetric]
    var metricDimension: js.UndefOr[MetricDimension]
    var suppressAlerts: js.UndefOr[SuppressAlerts]
  }

  object Behavior {
    @inline
    def apply(
        name: BehaviorName,
        criteria: js.UndefOr[BehaviorCriteria] = js.undefined,
        metric: js.UndefOr[BehaviorMetric] = js.undefined,
        metricDimension: js.UndefOr[MetricDimension] = js.undefined,
        suppressAlerts: js.UndefOr[SuppressAlerts] = js.undefined
    ): Behavior = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      criteria.foreach(__v => __obj.updateDynamic("criteria")(__v.asInstanceOf[js.Any]))
      metric.foreach(__v => __obj.updateDynamic("metric")(__v.asInstanceOf[js.Any]))
      metricDimension.foreach(__v => __obj.updateDynamic("metricDimension")(__v.asInstanceOf[js.Any]))
      suppressAlerts.foreach(__v => __obj.updateDynamic("suppressAlerts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Behavior]
    }
  }

  /** The criteria by which the behavior is determined to be normal.
    */
  @js.native
  trait BehaviorCriteria extends js.Object {
    var comparisonOperator: js.UndefOr[ComparisonOperator]
    var consecutiveDatapointsToAlarm: js.UndefOr[ConsecutiveDatapointsToAlarm]
    var consecutiveDatapointsToClear: js.UndefOr[ConsecutiveDatapointsToClear]
    var durationSeconds: js.UndefOr[DurationSeconds]
    var mlDetectionConfig: js.UndefOr[MachineLearningDetectionConfig]
    var statisticalThreshold: js.UndefOr[StatisticalThreshold]
    var value: js.UndefOr[MetricValue]
  }

  object BehaviorCriteria {
    @inline
    def apply(
        comparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
        consecutiveDatapointsToAlarm: js.UndefOr[ConsecutiveDatapointsToAlarm] = js.undefined,
        consecutiveDatapointsToClear: js.UndefOr[ConsecutiveDatapointsToClear] = js.undefined,
        durationSeconds: js.UndefOr[DurationSeconds] = js.undefined,
        mlDetectionConfig: js.UndefOr[MachineLearningDetectionConfig] = js.undefined,
        statisticalThreshold: js.UndefOr[StatisticalThreshold] = js.undefined,
        value: js.UndefOr[MetricValue] = js.undefined
    ): BehaviorCriteria = {
      val __obj = js.Dynamic.literal()
      comparisonOperator.foreach(__v => __obj.updateDynamic("comparisonOperator")(__v.asInstanceOf[js.Any]))
      consecutiveDatapointsToAlarm.foreach(__v => __obj.updateDynamic("consecutiveDatapointsToAlarm")(__v.asInstanceOf[js.Any]))
      consecutiveDatapointsToClear.foreach(__v => __obj.updateDynamic("consecutiveDatapointsToClear")(__v.asInstanceOf[js.Any]))
      durationSeconds.foreach(__v => __obj.updateDynamic("durationSeconds")(__v.asInstanceOf[js.Any]))
      mlDetectionConfig.foreach(__v => __obj.updateDynamic("mlDetectionConfig")(__v.asInstanceOf[js.Any]))
      statisticalThreshold.foreach(__v => __obj.updateDynamic("statisticalThreshold")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BehaviorCriteria]
    }
  }

  @js.native
  sealed trait BehaviorCriteriaType extends js.Any
  object BehaviorCriteriaType {
    val STATIC = "STATIC".asInstanceOf[BehaviorCriteriaType]
    val STATISTICAL = "STATISTICAL".asInstanceOf[BehaviorCriteriaType]
    val MACHINE_LEARNING = "MACHINE_LEARNING".asInstanceOf[BehaviorCriteriaType]

    @inline def values = js.Array(STATIC, STATISTICAL, MACHINE_LEARNING)
  }

  /** The summary of an ML Detect behavior model.
    */
  @js.native
  trait BehaviorModelTrainingSummary extends js.Object {
    var behaviorName: js.UndefOr[BehaviorName]
    var datapointsCollectionPercentage: js.UndefOr[DataCollectionPercentage]
    var lastModelRefreshDate: js.UndefOr[Timestamp]
    var modelStatus: js.UndefOr[ModelStatus]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var trainingDataCollectionStartDate: js.UndefOr[Timestamp]
  }

  object BehaviorModelTrainingSummary {
    @inline
    def apply(
        behaviorName: js.UndefOr[BehaviorName] = js.undefined,
        datapointsCollectionPercentage: js.UndefOr[DataCollectionPercentage] = js.undefined,
        lastModelRefreshDate: js.UndefOr[Timestamp] = js.undefined,
        modelStatus: js.UndefOr[ModelStatus] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        trainingDataCollectionStartDate: js.UndefOr[Timestamp] = js.undefined
    ): BehaviorModelTrainingSummary = {
      val __obj = js.Dynamic.literal()
      behaviorName.foreach(__v => __obj.updateDynamic("behaviorName")(__v.asInstanceOf[js.Any]))
      datapointsCollectionPercentage.foreach(__v => __obj.updateDynamic("datapointsCollectionPercentage")(__v.asInstanceOf[js.Any]))
      lastModelRefreshDate.foreach(__v => __obj.updateDynamic("lastModelRefreshDate")(__v.asInstanceOf[js.Any]))
      modelStatus.foreach(__v => __obj.updateDynamic("modelStatus")(__v.asInstanceOf[js.Any]))
      securityProfileName.foreach(__v => __obj.updateDynamic("securityProfileName")(__v.asInstanceOf[js.Any]))
      trainingDataCollectionStartDate.foreach(__v => __obj.updateDynamic("trainingDataCollectionStartDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BehaviorModelTrainingSummary]
    }
  }

  /** Additional information about the billing group.
    */
  @js.native
  trait BillingGroupMetadata extends js.Object {
    var creationDate: js.UndefOr[CreationDate]
  }

  object BillingGroupMetadata {
    @inline
    def apply(
        creationDate: js.UndefOr[CreationDate] = js.undefined
    ): BillingGroupMetadata = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BillingGroupMetadata]
    }
  }

  /** The properties of a billing group.
    */
  @js.native
  trait BillingGroupProperties extends js.Object {
    var billingGroupDescription: js.UndefOr[BillingGroupDescription]
  }

  object BillingGroupProperties {
    @inline
    def apply(
        billingGroupDescription: js.UndefOr[BillingGroupDescription] = js.undefined
    ): BillingGroupProperties = {
      val __obj = js.Dynamic.literal()
      billingGroupDescription.foreach(__v => __obj.updateDynamic("billingGroupDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BillingGroupProperties]
    }
  }

  /** A CA certificate.
    */
  @js.native
  trait CACertificate extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var creationDate: js.UndefOr[DateType]
    var status: js.UndefOr[CACertificateStatus]
  }

  object CACertificate {
    @inline
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        creationDate: js.UndefOr[DateType] = js.undefined,
        status: js.UndefOr[CACertificateStatus] = js.undefined
    ): CACertificate = {
      val __obj = js.Dynamic.literal()
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      certificateId.foreach(__v => __obj.updateDynamic("certificateId")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CACertificate]
    }
  }

  /** Describes a CA certificate.
    */
  @js.native
  trait CACertificateDescription extends js.Object {
    var autoRegistrationStatus: js.UndefOr[AutoRegistrationStatus]
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var certificatePem: js.UndefOr[CertificatePem]
    var creationDate: js.UndefOr[DateType]
    var customerVersion: js.UndefOr[CustomerVersion]
    var generationId: js.UndefOr[GenerationId]
    var lastModifiedDate: js.UndefOr[DateType]
    var ownedBy: js.UndefOr[AwsAccountId]
    var status: js.UndefOr[CACertificateStatus]
    var validity: js.UndefOr[CertificateValidity]
  }

  object CACertificateDescription {
    @inline
    def apply(
        autoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.undefined,
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        certificatePem: js.UndefOr[CertificatePem] = js.undefined,
        creationDate: js.UndefOr[DateType] = js.undefined,
        customerVersion: js.UndefOr[CustomerVersion] = js.undefined,
        generationId: js.UndefOr[GenerationId] = js.undefined,
        lastModifiedDate: js.UndefOr[DateType] = js.undefined,
        ownedBy: js.UndefOr[AwsAccountId] = js.undefined,
        status: js.UndefOr[CACertificateStatus] = js.undefined,
        validity: js.UndefOr[CertificateValidity] = js.undefined
    ): CACertificateDescription = {
      val __obj = js.Dynamic.literal()
      autoRegistrationStatus.foreach(__v => __obj.updateDynamic("autoRegistrationStatus")(__v.asInstanceOf[js.Any]))
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      certificateId.foreach(__v => __obj.updateDynamic("certificateId")(__v.asInstanceOf[js.Any]))
      certificatePem.foreach(__v => __obj.updateDynamic("certificatePem")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      customerVersion.foreach(__v => __obj.updateDynamic("customerVersion")(__v.asInstanceOf[js.Any]))
      generationId.foreach(__v => __obj.updateDynamic("generationId")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      ownedBy.foreach(__v => __obj.updateDynamic("ownedBy")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      validity.foreach(__v => __obj.updateDynamic("validity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CACertificateDescription]
    }
  }

  @js.native
  sealed trait CACertificateStatus extends js.Any
  object CACertificateStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[CACertificateStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[CACertificateStatus]

    @inline def values = js.Array(ACTIVE, INACTIVE)
  }

  @js.native
  sealed trait CACertificateUpdateAction extends js.Any
  object CACertificateUpdateAction {
    val DEACTIVATE = "DEACTIVATE".asInstanceOf[CACertificateUpdateAction]

    @inline def values = js.Array(DEACTIVATE)
  }

  @js.native
  trait CancelAuditMitigationActionsTaskRequest extends js.Object {
    var taskId: MitigationActionsTaskId
  }

  object CancelAuditMitigationActionsTaskRequest {
    @inline
    def apply(
        taskId: MitigationActionsTaskId
    ): CancelAuditMitigationActionsTaskRequest = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelAuditMitigationActionsTaskRequest]
    }
  }

  @js.native
  trait CancelAuditMitigationActionsTaskResponse extends js.Object

  object CancelAuditMitigationActionsTaskResponse {
    @inline
    def apply(): CancelAuditMitigationActionsTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelAuditMitigationActionsTaskResponse]
    }
  }

  @js.native
  trait CancelAuditTaskRequest extends js.Object {
    var taskId: AuditTaskId
  }

  object CancelAuditTaskRequest {
    @inline
    def apply(
        taskId: AuditTaskId
    ): CancelAuditTaskRequest = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelAuditTaskRequest]
    }
  }

  @js.native
  trait CancelAuditTaskResponse extends js.Object

  object CancelAuditTaskResponse {
    @inline
    def apply(): CancelAuditTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelAuditTaskResponse]
    }
  }

  /** The input for the CancelCertificateTransfer operation.
    */
  @js.native
  trait CancelCertificateTransferRequest extends js.Object {
    var certificateId: CertificateId
  }

  object CancelCertificateTransferRequest {
    @inline
    def apply(
        certificateId: CertificateId
    ): CancelCertificateTransferRequest = {
      val __obj = js.Dynamic.literal(
        "certificateId" -> certificateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelCertificateTransferRequest]
    }
  }

  @js.native
  trait CancelDetectMitigationActionsTaskRequest extends js.Object {
    var taskId: MitigationActionsTaskId
  }

  object CancelDetectMitigationActionsTaskRequest {
    @inline
    def apply(
        taskId: MitigationActionsTaskId
    ): CancelDetectMitigationActionsTaskRequest = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelDetectMitigationActionsTaskRequest]
    }
  }

  @js.native
  trait CancelDetectMitigationActionsTaskResponse extends js.Object

  object CancelDetectMitigationActionsTaskResponse {
    @inline
    def apply(): CancelDetectMitigationActionsTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelDetectMitigationActionsTaskResponse]
    }
  }

  @js.native
  trait CancelJobExecutionRequest extends js.Object {
    var jobId: JobId
    var thingName: ThingName
    var expectedVersion: js.UndefOr[ExpectedVersion]
    var force: js.UndefOr[ForceFlag]
    var statusDetails: js.UndefOr[DetailsMap]
  }

  object CancelJobExecutionRequest {
    @inline
    def apply(
        jobId: JobId,
        thingName: ThingName,
        expectedVersion: js.UndefOr[ExpectedVersion] = js.undefined,
        force: js.UndefOr[ForceFlag] = js.undefined,
        statusDetails: js.UndefOr[DetailsMap] = js.undefined
    ): CancelJobExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      statusDetails.foreach(__v => __obj.updateDynamic("statusDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelJobExecutionRequest]
    }
  }

  @js.native
  trait CancelJobRequest extends js.Object {
    var jobId: JobId
    var comment: js.UndefOr[Comment]
    var force: js.UndefOr[ForceFlag]
    var reasonCode: js.UndefOr[ReasonCode]
  }

  object CancelJobRequest {
    @inline
    def apply(
        jobId: JobId,
        comment: js.UndefOr[Comment] = js.undefined,
        force: js.UndefOr[ForceFlag] = js.undefined,
        reasonCode: js.UndefOr[ReasonCode] = js.undefined
    ): CancelJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      reasonCode.foreach(__v => __obj.updateDynamic("reasonCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResponse extends js.Object {
    var description: js.UndefOr[JobDescription]
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
  }

  object CancelJobResponse {
    @inline
    def apply(
        description: js.UndefOr[JobDescription] = js.undefined,
        jobArn: js.UndefOr[JobArn] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined
    ): CancelJobResponse = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      jobArn.foreach(__v => __obj.updateDynamic("jobArn")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelJobResponse]
    }
  }

  @js.native
  sealed trait CannedAccessControlList extends js.Any
  object CannedAccessControlList {
    val `private` = "private".asInstanceOf[CannedAccessControlList]
    val `public-read` = "public-read".asInstanceOf[CannedAccessControlList]
    val `public-read-write` = "public-read-write".asInstanceOf[CannedAccessControlList]
    val `aws-exec-read` = "aws-exec-read".asInstanceOf[CannedAccessControlList]
    val `authenticated-read` = "authenticated-read".asInstanceOf[CannedAccessControlList]
    val `bucket-owner-read` = "bucket-owner-read".asInstanceOf[CannedAccessControlList]
    val `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[CannedAccessControlList]
    val `log-delivery-write` = "log-delivery-write".asInstanceOf[CannedAccessControlList]

    @inline def values = js.Array(`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`, `log-delivery-write`)
  }

  /** Information about a certificate.
    */
  @js.native
  trait Certificate extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var certificateMode: js.UndefOr[CertificateMode]
    var creationDate: js.UndefOr[DateType]
    var status: js.UndefOr[CertificateStatus]
  }

  object Certificate {
    @inline
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        certificateMode: js.UndefOr[CertificateMode] = js.undefined,
        creationDate: js.UndefOr[DateType] = js.undefined,
        status: js.UndefOr[CertificateStatus] = js.undefined
    ): Certificate = {
      val __obj = js.Dynamic.literal()
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      certificateId.foreach(__v => __obj.updateDynamic("certificateId")(__v.asInstanceOf[js.Any]))
      certificateMode.foreach(__v => __obj.updateDynamic("certificateMode")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Certificate]
    }
  }

  /** Describes a certificate.
    */
  @js.native
  trait CertificateDescription extends js.Object {
    var caCertificateId: js.UndefOr[CertificateId]
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var certificateMode: js.UndefOr[CertificateMode]
    var certificatePem: js.UndefOr[CertificatePem]
    var creationDate: js.UndefOr[DateType]
    var customerVersion: js.UndefOr[CustomerVersion]
    var generationId: js.UndefOr[GenerationId]
    var lastModifiedDate: js.UndefOr[DateType]
    var ownedBy: js.UndefOr[AwsAccountId]
    var previousOwnedBy: js.UndefOr[AwsAccountId]
    var status: js.UndefOr[CertificateStatus]
    var transferData: js.UndefOr[TransferData]
    var validity: js.UndefOr[CertificateValidity]
  }

  object CertificateDescription {
    @inline
    def apply(
        caCertificateId: js.UndefOr[CertificateId] = js.undefined,
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        certificateMode: js.UndefOr[CertificateMode] = js.undefined,
        certificatePem: js.UndefOr[CertificatePem] = js.undefined,
        creationDate: js.UndefOr[DateType] = js.undefined,
        customerVersion: js.UndefOr[CustomerVersion] = js.undefined,
        generationId: js.UndefOr[GenerationId] = js.undefined,
        lastModifiedDate: js.UndefOr[DateType] = js.undefined,
        ownedBy: js.UndefOr[AwsAccountId] = js.undefined,
        previousOwnedBy: js.UndefOr[AwsAccountId] = js.undefined,
        status: js.UndefOr[CertificateStatus] = js.undefined,
        transferData: js.UndefOr[TransferData] = js.undefined,
        validity: js.UndefOr[CertificateValidity] = js.undefined
    ): CertificateDescription = {
      val __obj = js.Dynamic.literal()
      caCertificateId.foreach(__v => __obj.updateDynamic("caCertificateId")(__v.asInstanceOf[js.Any]))
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      certificateId.foreach(__v => __obj.updateDynamic("certificateId")(__v.asInstanceOf[js.Any]))
      certificateMode.foreach(__v => __obj.updateDynamic("certificateMode")(__v.asInstanceOf[js.Any]))
      certificatePem.foreach(__v => __obj.updateDynamic("certificatePem")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      customerVersion.foreach(__v => __obj.updateDynamic("customerVersion")(__v.asInstanceOf[js.Any]))
      generationId.foreach(__v => __obj.updateDynamic("generationId")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      ownedBy.foreach(__v => __obj.updateDynamic("ownedBy")(__v.asInstanceOf[js.Any]))
      previousOwnedBy.foreach(__v => __obj.updateDynamic("previousOwnedBy")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      transferData.foreach(__v => __obj.updateDynamic("transferData")(__v.asInstanceOf[js.Any]))
      validity.foreach(__v => __obj.updateDynamic("validity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CertificateDescription]
    }
  }

  @js.native
  sealed trait CertificateMode extends js.Any
  object CertificateMode {
    val DEFAULT = "DEFAULT".asInstanceOf[CertificateMode]
    val SNI_ONLY = "SNI_ONLY".asInstanceOf[CertificateMode]

    @inline def values = js.Array(DEFAULT, SNI_ONLY)
  }

  @js.native
  sealed trait CertificateStatus extends js.Any
  object CertificateStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[CertificateStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[CertificateStatus]
    val REVOKED = "REVOKED".asInstanceOf[CertificateStatus]
    val PENDING_TRANSFER = "PENDING_TRANSFER".asInstanceOf[CertificateStatus]
    val REGISTER_INACTIVE = "REGISTER_INACTIVE".asInstanceOf[CertificateStatus]
    val PENDING_ACTIVATION = "PENDING_ACTIVATION".asInstanceOf[CertificateStatus]

    @inline def values = js.Array(ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER, REGISTER_INACTIVE, PENDING_ACTIVATION)
  }

  /** When the certificate is valid.
    */
  @js.native
  trait CertificateValidity extends js.Object {
    var notAfter: js.UndefOr[DateType]
    var notBefore: js.UndefOr[DateType]
  }

  object CertificateValidity {
    @inline
    def apply(
        notAfter: js.UndefOr[DateType] = js.undefined,
        notBefore: js.UndefOr[DateType] = js.undefined
    ): CertificateValidity = {
      val __obj = js.Dynamic.literal()
      notAfter.foreach(__v => __obj.updateDynamic("notAfter")(__v.asInstanceOf[js.Any]))
      notBefore.foreach(__v => __obj.updateDynamic("notBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CertificateValidity]
    }
  }

  @js.native
  trait ClearDefaultAuthorizerRequest extends js.Object

  object ClearDefaultAuthorizerRequest {
    @inline
    def apply(): ClearDefaultAuthorizerRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearDefaultAuthorizerRequest]
    }
  }

  @js.native
  trait ClearDefaultAuthorizerResponse extends js.Object

  object ClearDefaultAuthorizerResponse {
    @inline
    def apply(): ClearDefaultAuthorizerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearDefaultAuthorizerResponse]
    }
  }

  /** Describes an action that updates a CloudWatch alarm.
    */
  @js.native
  trait CloudwatchAlarmAction extends js.Object {
    var alarmName: AlarmName
    var roleArn: AwsArn
    var stateReason: StateReason
    var stateValue: StateValue
  }

  object CloudwatchAlarmAction {
    @inline
    def apply(
        alarmName: AlarmName,
        roleArn: AwsArn,
        stateReason: StateReason,
        stateValue: StateValue
    ): CloudwatchAlarmAction = {
      val __obj = js.Dynamic.literal(
        "alarmName" -> alarmName.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "stateReason" -> stateReason.asInstanceOf[js.Any],
        "stateValue" -> stateValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CloudwatchAlarmAction]
    }
  }

  /** Describes an action that sends data to CloudWatch Logs.
    */
  @js.native
  trait CloudwatchLogsAction extends js.Object {
    var logGroupName: LogGroupName
    var roleArn: AwsArn
  }

  object CloudwatchLogsAction {
    @inline
    def apply(
        logGroupName: LogGroupName,
        roleArn: AwsArn
    ): CloudwatchLogsAction = {
      val __obj = js.Dynamic.literal(
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CloudwatchLogsAction]
    }
  }

  /** Describes an action that captures a CloudWatch metric.
    */
  @js.native
  trait CloudwatchMetricAction extends js.Object {
    var metricName: String
    var metricNamespace: String
    var metricUnit: String
    var metricValue: String
    var roleArn: AwsArn
    var metricTimestamp: js.UndefOr[String]
  }

  object CloudwatchMetricAction {
    @inline
    def apply(
        metricName: String,
        metricNamespace: String,
        metricUnit: String,
        metricValue: String,
        roleArn: AwsArn,
        metricTimestamp: js.UndefOr[String] = js.undefined
    ): CloudwatchMetricAction = {
      val __obj = js.Dynamic.literal(
        "metricName" -> metricName.asInstanceOf[js.Any],
        "metricNamespace" -> metricNamespace.asInstanceOf[js.Any],
        "metricUnit" -> metricUnit.asInstanceOf[js.Any],
        "metricValue" -> metricValue.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      metricTimestamp.foreach(__v => __obj.updateDynamic("metricTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudwatchMetricAction]
    }
  }

  /** Describes the method to use when code signing a file.
    */
  @js.native
  trait CodeSigning extends js.Object {
    var awsSignerJobId: js.UndefOr[SigningJobId]
    var customCodeSigning: js.UndefOr[CustomCodeSigning]
    var startSigningJobParameter: js.UndefOr[StartSigningJobParameter]
  }

  object CodeSigning {
    @inline
    def apply(
        awsSignerJobId: js.UndefOr[SigningJobId] = js.undefined,
        customCodeSigning: js.UndefOr[CustomCodeSigning] = js.undefined,
        startSigningJobParameter: js.UndefOr[StartSigningJobParameter] = js.undefined
    ): CodeSigning = {
      val __obj = js.Dynamic.literal()
      awsSignerJobId.foreach(__v => __obj.updateDynamic("awsSignerJobId")(__v.asInstanceOf[js.Any]))
      customCodeSigning.foreach(__v => __obj.updateDynamic("customCodeSigning")(__v.asInstanceOf[js.Any]))
      startSigningJobParameter.foreach(__v => __obj.updateDynamic("startSigningJobParameter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeSigning]
    }
  }

  /** Describes the certificate chain being used when code signing a file.
    */
  @js.native
  trait CodeSigningCertificateChain extends js.Object {
    var certificateName: js.UndefOr[CertificateName]
    var inlineDocument: js.UndefOr[InlineDocument]
  }

  object CodeSigningCertificateChain {
    @inline
    def apply(
        certificateName: js.UndefOr[CertificateName] = js.undefined,
        inlineDocument: js.UndefOr[InlineDocument] = js.undefined
    ): CodeSigningCertificateChain = {
      val __obj = js.Dynamic.literal()
      certificateName.foreach(__v => __obj.updateDynamic("certificateName")(__v.asInstanceOf[js.Any]))
      inlineDocument.foreach(__v => __obj.updateDynamic("inlineDocument")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeSigningCertificateChain]
    }
  }

  /** Describes the signature for a file.
    */
  @js.native
  trait CodeSigningSignature extends js.Object {
    var inlineDocument: js.UndefOr[Signature]
  }

  object CodeSigningSignature {
    @inline
    def apply(
        inlineDocument: js.UndefOr[Signature] = js.undefined
    ): CodeSigningSignature = {
      val __obj = js.Dynamic.literal()
      inlineDocument.foreach(__v => __obj.updateDynamic("inlineDocument")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeSigningSignature]
    }
  }

  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator {
    val `less-than` = "less-than".asInstanceOf[ComparisonOperator]
    val `less-than-equals` = "less-than-equals".asInstanceOf[ComparisonOperator]
    val `greater-than` = "greater-than".asInstanceOf[ComparisonOperator]
    val `greater-than-equals` = "greater-than-equals".asInstanceOf[ComparisonOperator]
    val `in-cidr-set` = "in-cidr-set".asInstanceOf[ComparisonOperator]
    val `not-in-cidr-set` = "not-in-cidr-set".asInstanceOf[ComparisonOperator]
    val `in-port-set` = "in-port-set".asInstanceOf[ComparisonOperator]
    val `not-in-port-set` = "not-in-port-set".asInstanceOf[ComparisonOperator]
    val `in-set` = "in-set".asInstanceOf[ComparisonOperator]
    val `not-in-set` = "not-in-set".asInstanceOf[ComparisonOperator]

    @inline def values = js.Array(
      `less-than`,
      `less-than-equals`,
      `greater-than`,
      `greater-than-equals`,
      `in-cidr-set`,
      `not-in-cidr-set`,
      `in-port-set`,
      `not-in-port-set`,
      `in-set`,
      `not-in-set`
    )
  }

  @js.native
  sealed trait ConfidenceLevel extends js.Any
  object ConfidenceLevel {
    val LOW = "LOW".asInstanceOf[ConfidenceLevel]
    val MEDIUM = "MEDIUM".asInstanceOf[ConfidenceLevel]
    val HIGH = "HIGH".asInstanceOf[ConfidenceLevel]

    @inline def values = js.Array(LOW, MEDIUM, HIGH)
  }

  /** Configuration.
    */
  @js.native
  trait Configuration extends js.Object {
    var Enabled: js.UndefOr[Enabled]
  }

  object Configuration {
    @inline
    def apply(
        Enabled: js.UndefOr[Enabled] = js.undefined
    ): Configuration = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Configuration]
    }
  }

  @js.native
  trait ConfirmTopicRuleDestinationRequest extends js.Object {
    var confirmationToken: ConfirmationToken
  }

  object ConfirmTopicRuleDestinationRequest {
    @inline
    def apply(
        confirmationToken: ConfirmationToken
    ): ConfirmTopicRuleDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "confirmationToken" -> confirmationToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ConfirmTopicRuleDestinationRequest]
    }
  }

  @js.native
  trait ConfirmTopicRuleDestinationResponse extends js.Object

  object ConfirmTopicRuleDestinationResponse {
    @inline
    def apply(): ConfirmTopicRuleDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmTopicRuleDestinationResponse]
    }
  }

  @js.native
  trait CreateAuditSuppressionRequest extends js.Object {
    var checkName: AuditCheckName
    var clientRequestToken: ClientRequestToken
    var resourceIdentifier: ResourceIdentifier
    var description: js.UndefOr[AuditDescription]
    var expirationDate: js.UndefOr[Timestamp]
    var suppressIndefinitely: js.UndefOr[SuppressIndefinitely]
  }

  object CreateAuditSuppressionRequest {
    @inline
    def apply(
        checkName: AuditCheckName,
        clientRequestToken: ClientRequestToken,
        resourceIdentifier: ResourceIdentifier,
        description: js.UndefOr[AuditDescription] = js.undefined,
        expirationDate: js.UndefOr[Timestamp] = js.undefined,
        suppressIndefinitely: js.UndefOr[SuppressIndefinitely] = js.undefined
    ): CreateAuditSuppressionRequest = {
      val __obj = js.Dynamic.literal(
        "checkName" -> checkName.asInstanceOf[js.Any],
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "resourceIdentifier" -> resourceIdentifier.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      expirationDate.foreach(__v => __obj.updateDynamic("expirationDate")(__v.asInstanceOf[js.Any]))
      suppressIndefinitely.foreach(__v => __obj.updateDynamic("suppressIndefinitely")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAuditSuppressionRequest]
    }
  }

  @js.native
  trait CreateAuditSuppressionResponse extends js.Object

  object CreateAuditSuppressionResponse {
    @inline
    def apply(): CreateAuditSuppressionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateAuditSuppressionResponse]
    }
  }

  @js.native
  trait CreateAuthorizerRequest extends js.Object {
    var authorizerFunctionArn: AuthorizerFunctionArn
    var authorizerName: AuthorizerName
    var signingDisabled: js.UndefOr[BooleanKey]
    var status: js.UndefOr[AuthorizerStatus]
    var tags: js.UndefOr[TagList]
    var tokenKeyName: js.UndefOr[TokenKeyName]
    var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap]
  }

  object CreateAuthorizerRequest {
    @inline
    def apply(
        authorizerFunctionArn: AuthorizerFunctionArn,
        authorizerName: AuthorizerName,
        signingDisabled: js.UndefOr[BooleanKey] = js.undefined,
        status: js.UndefOr[AuthorizerStatus] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined,
        tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined
    ): CreateAuthorizerRequest = {
      val __obj = js.Dynamic.literal(
        "authorizerFunctionArn" -> authorizerFunctionArn.asInstanceOf[js.Any],
        "authorizerName" -> authorizerName.asInstanceOf[js.Any]
      )

      signingDisabled.foreach(__v => __obj.updateDynamic("signingDisabled")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      tokenKeyName.foreach(__v => __obj.updateDynamic("tokenKeyName")(__v.asInstanceOf[js.Any]))
      tokenSigningPublicKeys.foreach(__v => __obj.updateDynamic("tokenSigningPublicKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAuthorizerRequest]
    }
  }

  @js.native
  trait CreateAuthorizerResponse extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  object CreateAuthorizerResponse {
    @inline
    def apply(
        authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined,
        authorizerName: js.UndefOr[AuthorizerName] = js.undefined
    ): CreateAuthorizerResponse = {
      val __obj = js.Dynamic.literal()
      authorizerArn.foreach(__v => __obj.updateDynamic("authorizerArn")(__v.asInstanceOf[js.Any]))
      authorizerName.foreach(__v => __obj.updateDynamic("authorizerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAuthorizerResponse]
    }
  }

  @js.native
  trait CreateBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
    var billingGroupProperties: js.UndefOr[BillingGroupProperties]
    var tags: js.UndefOr[TagList]
  }

  object CreateBillingGroupRequest {
    @inline
    def apply(
        billingGroupName: BillingGroupName,
        billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateBillingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "billingGroupName" -> billingGroupName.asInstanceOf[js.Any]
      )

      billingGroupProperties.foreach(__v => __obj.updateDynamic("billingGroupProperties")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBillingGroupRequest]
    }
  }

  @js.native
  trait CreateBillingGroupResponse extends js.Object {
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var billingGroupId: js.UndefOr[BillingGroupId]
    var billingGroupName: js.UndefOr[BillingGroupName]
  }

  object CreateBillingGroupResponse {
    @inline
    def apply(
        billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
        billingGroupId: js.UndefOr[BillingGroupId] = js.undefined,
        billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
    ): CreateBillingGroupResponse = {
      val __obj = js.Dynamic.literal()
      billingGroupArn.foreach(__v => __obj.updateDynamic("billingGroupArn")(__v.asInstanceOf[js.Any]))
      billingGroupId.foreach(__v => __obj.updateDynamic("billingGroupId")(__v.asInstanceOf[js.Any]))
      billingGroupName.foreach(__v => __obj.updateDynamic("billingGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBillingGroupResponse]
    }
  }

  /** The input for the CreateCertificateFromCsr operation.
    */
  @js.native
  trait CreateCertificateFromCsrRequest extends js.Object {
    var certificateSigningRequest: CertificateSigningRequest
    var setAsActive: js.UndefOr[SetAsActive]
  }

  object CreateCertificateFromCsrRequest {
    @inline
    def apply(
        certificateSigningRequest: CertificateSigningRequest,
        setAsActive: js.UndefOr[SetAsActive] = js.undefined
    ): CreateCertificateFromCsrRequest = {
      val __obj = js.Dynamic.literal(
        "certificateSigningRequest" -> certificateSigningRequest.asInstanceOf[js.Any]
      )

      setAsActive.foreach(__v => __obj.updateDynamic("setAsActive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCertificateFromCsrRequest]
    }
  }

  /** The output from the CreateCertificateFromCsr operation.
    */
  @js.native
  trait CreateCertificateFromCsrResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var certificatePem: js.UndefOr[CertificatePem]
  }

  object CreateCertificateFromCsrResponse {
    @inline
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        certificatePem: js.UndefOr[CertificatePem] = js.undefined
    ): CreateCertificateFromCsrResponse = {
      val __obj = js.Dynamic.literal()
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      certificateId.foreach(__v => __obj.updateDynamic("certificateId")(__v.asInstanceOf[js.Any]))
      certificatePem.foreach(__v => __obj.updateDynamic("certificatePem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCertificateFromCsrResponse]
    }
  }

  @js.native
  trait CreateCustomMetricRequest extends js.Object {
    var clientRequestToken: ClientRequestToken
    var metricName: MetricName
    var metricType: CustomMetricType
    var displayName: js.UndefOr[CustomMetricDisplayName]
    var tags: js.UndefOr[TagList]
  }

  object CreateCustomMetricRequest {
    @inline
    def apply(
        clientRequestToken: ClientRequestToken,
        metricName: MetricName,
        metricType: CustomMetricType,
        displayName: js.UndefOr[CustomMetricDisplayName] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateCustomMetricRequest = {
      val __obj = js.Dynamic.literal(
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "metricName" -> metricName.asInstanceOf[js.Any],
        "metricType" -> metricType.asInstanceOf[js.Any]
      )

      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomMetricRequest]
    }
  }

  @js.native
  trait CreateCustomMetricResponse extends js.Object {
    var metricArn: js.UndefOr[CustomMetricArn]
    var metricName: js.UndefOr[MetricName]
  }

  object CreateCustomMetricResponse {
    @inline
    def apply(
        metricArn: js.UndefOr[CustomMetricArn] = js.undefined,
        metricName: js.UndefOr[MetricName] = js.undefined
    ): CreateCustomMetricResponse = {
      val __obj = js.Dynamic.literal()
      metricArn.foreach(__v => __obj.updateDynamic("metricArn")(__v.asInstanceOf[js.Any]))
      metricName.foreach(__v => __obj.updateDynamic("metricName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomMetricResponse]
    }
  }

  @js.native
  trait CreateDimensionRequest extends js.Object {
    var clientRequestToken: ClientRequestToken
    var name: DimensionName
    var stringValues: DimensionStringValues
    var `type`: DimensionType
    var tags: js.UndefOr[TagList]
  }

  object CreateDimensionRequest {
    @inline
    def apply(
        clientRequestToken: ClientRequestToken,
        name: DimensionName,
        stringValues: DimensionStringValues,
        `type`: DimensionType,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateDimensionRequest = {
      val __obj = js.Dynamic.literal(
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "stringValues" -> stringValues.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDimensionRequest]
    }
  }

  @js.native
  trait CreateDimensionResponse extends js.Object {
    var arn: js.UndefOr[DimensionArn]
    var name: js.UndefOr[DimensionName]
  }

  object CreateDimensionResponse {
    @inline
    def apply(
        arn: js.UndefOr[DimensionArn] = js.undefined,
        name: js.UndefOr[DimensionName] = js.undefined
    ): CreateDimensionResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDimensionResponse]
    }
  }

  @js.native
  trait CreateDomainConfigurationRequest extends js.Object {
    var domainConfigurationName: DomainConfigurationName
    var authorizerConfig: js.UndefOr[AuthorizerConfig]
    var domainName: js.UndefOr[DomainName]
    var serverCertificateArns: js.UndefOr[ServerCertificateArns]
    var serviceType: js.UndefOr[ServiceType]
    var tags: js.UndefOr[TagList]
    var validationCertificateArn: js.UndefOr[AcmCertificateArn]
  }

  object CreateDomainConfigurationRequest {
    @inline
    def apply(
        domainConfigurationName: DomainConfigurationName,
        authorizerConfig: js.UndefOr[AuthorizerConfig] = js.undefined,
        domainName: js.UndefOr[DomainName] = js.undefined,
        serverCertificateArns: js.UndefOr[ServerCertificateArns] = js.undefined,
        serviceType: js.UndefOr[ServiceType] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        validationCertificateArn: js.UndefOr[AcmCertificateArn] = js.undefined
    ): CreateDomainConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "domainConfigurationName" -> domainConfigurationName.asInstanceOf[js.Any]
      )

      authorizerConfig.foreach(__v => __obj.updateDynamic("authorizerConfig")(__v.asInstanceOf[js.Any]))
      domainName.foreach(__v => __obj.updateDynamic("domainName")(__v.asInstanceOf[js.Any]))
      serverCertificateArns.foreach(__v => __obj.updateDynamic("serverCertificateArns")(__v.asInstanceOf[js.Any]))
      serviceType.foreach(__v => __obj.updateDynamic("serviceType")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      validationCertificateArn.foreach(__v => __obj.updateDynamic("validationCertificateArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainConfigurationRequest]
    }
  }

  @js.native
  trait CreateDomainConfigurationResponse extends js.Object {
    var domainConfigurationArn: js.UndefOr[DomainConfigurationArn]
    var domainConfigurationName: js.UndefOr[DomainConfigurationName]
  }

  object CreateDomainConfigurationResponse {
    @inline
    def apply(
        domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.undefined,
        domainConfigurationName: js.UndefOr[DomainConfigurationName] = js.undefined
    ): CreateDomainConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      domainConfigurationArn.foreach(__v => __obj.updateDynamic("domainConfigurationArn")(__v.asInstanceOf[js.Any]))
      domainConfigurationName.foreach(__v => __obj.updateDynamic("domainConfigurationName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainConfigurationResponse]
    }
  }

  @js.native
  trait CreateDynamicThingGroupRequest extends js.Object {
    var queryString: QueryString
    var thingGroupName: ThingGroupName
    var indexName: js.UndefOr[IndexName]
    var queryVersion: js.UndefOr[QueryVersion]
    var tags: js.UndefOr[TagList]
    var thingGroupProperties: js.UndefOr[ThingGroupProperties]
  }

  object CreateDynamicThingGroupRequest {
    @inline
    def apply(
        queryString: QueryString,
        thingGroupName: ThingGroupName,
        indexName: js.UndefOr[IndexName] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined
    ): CreateDynamicThingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "queryString" -> queryString.asInstanceOf[js.Any],
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any]
      )

      indexName.foreach(__v => __obj.updateDynamic("indexName")(__v.asInstanceOf[js.Any]))
      queryVersion.foreach(__v => __obj.updateDynamic("queryVersion")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      thingGroupProperties.foreach(__v => __obj.updateDynamic("thingGroupProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDynamicThingGroupRequest]
    }
  }

  @js.native
  trait CreateDynamicThingGroupResponse extends js.Object {
    var indexName: js.UndefOr[IndexName]
    var queryString: js.UndefOr[QueryString]
    var queryVersion: js.UndefOr[QueryVersion]
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var thingGroupName: js.UndefOr[ThingGroupName]
  }

  object CreateDynamicThingGroupResponse {
    @inline
    def apply(
        indexName: js.UndefOr[IndexName] = js.undefined,
        queryString: js.UndefOr[QueryString] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined,
        thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
        thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
    ): CreateDynamicThingGroupResponse = {
      val __obj = js.Dynamic.literal()
      indexName.foreach(__v => __obj.updateDynamic("indexName")(__v.asInstanceOf[js.Any]))
      queryString.foreach(__v => __obj.updateDynamic("queryString")(__v.asInstanceOf[js.Any]))
      queryVersion.foreach(__v => __obj.updateDynamic("queryVersion")(__v.asInstanceOf[js.Any]))
      thingGroupArn.foreach(__v => __obj.updateDynamic("thingGroupArn")(__v.asInstanceOf[js.Any]))
      thingGroupId.foreach(__v => __obj.updateDynamic("thingGroupId")(__v.asInstanceOf[js.Any]))
      thingGroupName.foreach(__v => __obj.updateDynamic("thingGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDynamicThingGroupResponse]
    }
  }

  @js.native
  trait CreateJobRequest extends js.Object {
    var jobId: JobId
    var targets: JobTargets
    var abortConfig: js.UndefOr[AbortConfig]
    var description: js.UndefOr[JobDescription]
    var document: js.UndefOr[JobDocument]
    var documentSource: js.UndefOr[JobDocumentSource]
    var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig]
    var namespaceId: js.UndefOr[NamespaceId]
    var presignedUrlConfig: js.UndefOr[PresignedUrlConfig]
    var tags: js.UndefOr[TagList]
    var targetSelection: js.UndefOr[TargetSelection]
    var timeoutConfig: js.UndefOr[TimeoutConfig]
  }

  object CreateJobRequest {
    @inline
    def apply(
        jobId: JobId,
        targets: JobTargets,
        abortConfig: js.UndefOr[AbortConfig] = js.undefined,
        description: js.UndefOr[JobDescription] = js.undefined,
        document: js.UndefOr[JobDocument] = js.undefined,
        documentSource: js.UndefOr[JobDocumentSource] = js.undefined,
        jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined,
        namespaceId: js.UndefOr[NamespaceId] = js.undefined,
        presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        targetSelection: js.UndefOr[TargetSelection] = js.undefined,
        timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
    ): CreateJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "targets" -> targets.asInstanceOf[js.Any]
      )

      abortConfig.foreach(__v => __obj.updateDynamic("abortConfig")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      document.foreach(__v => __obj.updateDynamic("document")(__v.asInstanceOf[js.Any]))
      documentSource.foreach(__v => __obj.updateDynamic("documentSource")(__v.asInstanceOf[js.Any]))
      jobExecutionsRolloutConfig.foreach(__v => __obj.updateDynamic("jobExecutionsRolloutConfig")(__v.asInstanceOf[js.Any]))
      namespaceId.foreach(__v => __obj.updateDynamic("namespaceId")(__v.asInstanceOf[js.Any]))
      presignedUrlConfig.foreach(__v => __obj.updateDynamic("presignedUrlConfig")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      targetSelection.foreach(__v => __obj.updateDynamic("targetSelection")(__v.asInstanceOf[js.Any]))
      timeoutConfig.foreach(__v => __obj.updateDynamic("timeoutConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResponse extends js.Object {
    var description: js.UndefOr[JobDescription]
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
  }

  object CreateJobResponse {
    @inline
    def apply(
        description: js.UndefOr[JobDescription] = js.undefined,
        jobArn: js.UndefOr[JobArn] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined
    ): CreateJobResponse = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      jobArn.foreach(__v => __obj.updateDynamic("jobArn")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobResponse]
    }
  }

  /** The input for the CreateKeysAndCertificate operation.
    */
  @js.native
  trait CreateKeysAndCertificateRequest extends js.Object {
    var setAsActive: js.UndefOr[SetAsActive]
  }

  object CreateKeysAndCertificateRequest {
    @inline
    def apply(
        setAsActive: js.UndefOr[SetAsActive] = js.undefined
    ): CreateKeysAndCertificateRequest = {
      val __obj = js.Dynamic.literal()
      setAsActive.foreach(__v => __obj.updateDynamic("setAsActive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateKeysAndCertificateRequest]
    }
  }

  /** The output of the CreateKeysAndCertificate operation.
    */
  @js.native
  trait CreateKeysAndCertificateResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var certificatePem: js.UndefOr[CertificatePem]
    var keyPair: js.UndefOr[KeyPair]
  }

  object CreateKeysAndCertificateResponse {
    @inline
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        certificatePem: js.UndefOr[CertificatePem] = js.undefined,
        keyPair: js.UndefOr[KeyPair] = js.undefined
    ): CreateKeysAndCertificateResponse = {
      val __obj = js.Dynamic.literal()
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      certificateId.foreach(__v => __obj.updateDynamic("certificateId")(__v.asInstanceOf[js.Any]))
      certificatePem.foreach(__v => __obj.updateDynamic("certificatePem")(__v.asInstanceOf[js.Any]))
      keyPair.foreach(__v => __obj.updateDynamic("keyPair")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateKeysAndCertificateResponse]
    }
  }

  @js.native
  trait CreateMitigationActionRequest extends js.Object {
    var actionName: MitigationActionName
    var actionParams: MitigationActionParams
    var roleArn: RoleArn
    var tags: js.UndefOr[TagList]
  }

  object CreateMitigationActionRequest {
    @inline
    def apply(
        actionName: MitigationActionName,
        actionParams: MitigationActionParams,
        roleArn: RoleArn,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateMitigationActionRequest = {
      val __obj = js.Dynamic.literal(
        "actionName" -> actionName.asInstanceOf[js.Any],
        "actionParams" -> actionParams.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMitigationActionRequest]
    }
  }

  @js.native
  trait CreateMitigationActionResponse extends js.Object {
    var actionArn: js.UndefOr[MitigationActionArn]
    var actionId: js.UndefOr[MitigationActionId]
  }

  object CreateMitigationActionResponse {
    @inline
    def apply(
        actionArn: js.UndefOr[MitigationActionArn] = js.undefined,
        actionId: js.UndefOr[MitigationActionId] = js.undefined
    ): CreateMitigationActionResponse = {
      val __obj = js.Dynamic.literal()
      actionArn.foreach(__v => __obj.updateDynamic("actionArn")(__v.asInstanceOf[js.Any]))
      actionId.foreach(__v => __obj.updateDynamic("actionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMitigationActionResponse]
    }
  }

  @js.native
  trait CreateOTAUpdateRequest extends js.Object {
    var files: OTAUpdateFiles
    var otaUpdateId: OTAUpdateId
    var roleArn: RoleArn
    var targets: Targets
    var additionalParameters: js.UndefOr[AdditionalParameterMap]
    var awsJobAbortConfig: js.UndefOr[AwsJobAbortConfig]
    var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig]
    var awsJobPresignedUrlConfig: js.UndefOr[AwsJobPresignedUrlConfig]
    var awsJobTimeoutConfig: js.UndefOr[AwsJobTimeoutConfig]
    var description: js.UndefOr[OTAUpdateDescription]
    var protocols: js.UndefOr[Protocols]
    var tags: js.UndefOr[TagList]
    var targetSelection: js.UndefOr[TargetSelection]
  }

  object CreateOTAUpdateRequest {
    @inline
    def apply(
        files: OTAUpdateFiles,
        otaUpdateId: OTAUpdateId,
        roleArn: RoleArn,
        targets: Targets,
        additionalParameters: js.UndefOr[AdditionalParameterMap] = js.undefined,
        awsJobAbortConfig: js.UndefOr[AwsJobAbortConfig] = js.undefined,
        awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.undefined,
        awsJobPresignedUrlConfig: js.UndefOr[AwsJobPresignedUrlConfig] = js.undefined,
        awsJobTimeoutConfig: js.UndefOr[AwsJobTimeoutConfig] = js.undefined,
        description: js.UndefOr[OTAUpdateDescription] = js.undefined,
        protocols: js.UndefOr[Protocols] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        targetSelection: js.UndefOr[TargetSelection] = js.undefined
    ): CreateOTAUpdateRequest = {
      val __obj = js.Dynamic.literal(
        "files" -> files.asInstanceOf[js.Any],
        "otaUpdateId" -> otaUpdateId.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "targets" -> targets.asInstanceOf[js.Any]
      )

      additionalParameters.foreach(__v => __obj.updateDynamic("additionalParameters")(__v.asInstanceOf[js.Any]))
      awsJobAbortConfig.foreach(__v => __obj.updateDynamic("awsJobAbortConfig")(__v.asInstanceOf[js.Any]))
      awsJobExecutionsRolloutConfig.foreach(__v => __obj.updateDynamic("awsJobExecutionsRolloutConfig")(__v.asInstanceOf[js.Any]))
      awsJobPresignedUrlConfig.foreach(__v => __obj.updateDynamic("awsJobPresignedUrlConfig")(__v.asInstanceOf[js.Any]))
      awsJobTimeoutConfig.foreach(__v => __obj.updateDynamic("awsJobTimeoutConfig")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      protocols.foreach(__v => __obj.updateDynamic("protocols")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      targetSelection.foreach(__v => __obj.updateDynamic("targetSelection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOTAUpdateRequest]
    }
  }

  @js.native
  trait CreateOTAUpdateResponse extends js.Object {
    var awsIotJobArn: js.UndefOr[AwsIotJobArn]
    var awsIotJobId: js.UndefOr[AwsIotJobId]
    var otaUpdateArn: js.UndefOr[OTAUpdateArn]
    var otaUpdateId: js.UndefOr[OTAUpdateId]
    var otaUpdateStatus: js.UndefOr[OTAUpdateStatus]
  }

  object CreateOTAUpdateResponse {
    @inline
    def apply(
        awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.undefined,
        awsIotJobId: js.UndefOr[AwsIotJobId] = js.undefined,
        otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined,
        otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined,
        otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
    ): CreateOTAUpdateResponse = {
      val __obj = js.Dynamic.literal()
      awsIotJobArn.foreach(__v => __obj.updateDynamic("awsIotJobArn")(__v.asInstanceOf[js.Any]))
      awsIotJobId.foreach(__v => __obj.updateDynamic("awsIotJobId")(__v.asInstanceOf[js.Any]))
      otaUpdateArn.foreach(__v => __obj.updateDynamic("otaUpdateArn")(__v.asInstanceOf[js.Any]))
      otaUpdateId.foreach(__v => __obj.updateDynamic("otaUpdateId")(__v.asInstanceOf[js.Any]))
      otaUpdateStatus.foreach(__v => __obj.updateDynamic("otaUpdateStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOTAUpdateResponse]
    }
  }

  /** The input for the CreatePolicy operation.
    */
  @js.native
  trait CreatePolicyRequest extends js.Object {
    var policyDocument: PolicyDocument
    var policyName: PolicyName
    var tags: js.UndefOr[TagList]
  }

  object CreatePolicyRequest {
    @inline
    def apply(
        policyDocument: PolicyDocument,
        policyName: PolicyName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreatePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyDocument" -> policyDocument.asInstanceOf[js.Any],
        "policyName" -> policyName.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePolicyRequest]
    }
  }

  /** The output from the CreatePolicy operation.
    */
  @js.native
  trait CreatePolicyResponse extends js.Object {
    var policyArn: js.UndefOr[PolicyArn]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
    var policyVersionId: js.UndefOr[PolicyVersionId]
  }

  object CreatePolicyResponse {
    @inline
    def apply(
        policyArn: js.UndefOr[PolicyArn] = js.undefined,
        policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
        policyName: js.UndefOr[PolicyName] = js.undefined,
        policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
    ): CreatePolicyResponse = {
      val __obj = js.Dynamic.literal()
      policyArn.foreach(__v => __obj.updateDynamic("policyArn")(__v.asInstanceOf[js.Any]))
      policyDocument.foreach(__v => __obj.updateDynamic("policyDocument")(__v.asInstanceOf[js.Any]))
      policyName.foreach(__v => __obj.updateDynamic("policyName")(__v.asInstanceOf[js.Any]))
      policyVersionId.foreach(__v => __obj.updateDynamic("policyVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePolicyResponse]
    }
  }

  /** The input for the CreatePolicyVersion operation.
    */
  @js.native
  trait CreatePolicyVersionRequest extends js.Object {
    var policyDocument: PolicyDocument
    var policyName: PolicyName
    var setAsDefault: js.UndefOr[SetAsDefault]
  }

  object CreatePolicyVersionRequest {
    @inline
    def apply(
        policyDocument: PolicyDocument,
        policyName: PolicyName,
        setAsDefault: js.UndefOr[SetAsDefault] = js.undefined
    ): CreatePolicyVersionRequest = {
      val __obj = js.Dynamic.literal(
        "policyDocument" -> policyDocument.asInstanceOf[js.Any],
        "policyName" -> policyName.asInstanceOf[js.Any]
      )

      setAsDefault.foreach(__v => __obj.updateDynamic("setAsDefault")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePolicyVersionRequest]
    }
  }

  /** The output of the CreatePolicyVersion operation.
    */
  @js.native
  trait CreatePolicyVersionResponse extends js.Object {
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var policyArn: js.UndefOr[PolicyArn]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyVersionId: js.UndefOr[PolicyVersionId]
  }

  object CreatePolicyVersionResponse {
    @inline
    def apply(
        isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
        policyArn: js.UndefOr[PolicyArn] = js.undefined,
        policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
        policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
    ): CreatePolicyVersionResponse = {
      val __obj = js.Dynamic.literal()
      isDefaultVersion.foreach(__v => __obj.updateDynamic("isDefaultVersion")(__v.asInstanceOf[js.Any]))
      policyArn.foreach(__v => __obj.updateDynamic("policyArn")(__v.asInstanceOf[js.Any]))
      policyDocument.foreach(__v => __obj.updateDynamic("policyDocument")(__v.asInstanceOf[js.Any]))
      policyVersionId.foreach(__v => __obj.updateDynamic("policyVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePolicyVersionResponse]
    }
  }

  @js.native
  trait CreateProvisioningClaimRequest extends js.Object {
    var templateName: TemplateName
  }

  object CreateProvisioningClaimRequest {
    @inline
    def apply(
        templateName: TemplateName
    ): CreateProvisioningClaimRequest = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateProvisioningClaimRequest]
    }
  }

  @js.native
  trait CreateProvisioningClaimResponse extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
    var certificatePem: js.UndefOr[CertificatePem]
    var expiration: js.UndefOr[DateType]
    var keyPair: js.UndefOr[KeyPair]
  }

  object CreateProvisioningClaimResponse {
    @inline
    def apply(
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        certificatePem: js.UndefOr[CertificatePem] = js.undefined,
        expiration: js.UndefOr[DateType] = js.undefined,
        keyPair: js.UndefOr[KeyPair] = js.undefined
    ): CreateProvisioningClaimResponse = {
      val __obj = js.Dynamic.literal()
      certificateId.foreach(__v => __obj.updateDynamic("certificateId")(__v.asInstanceOf[js.Any]))
      certificatePem.foreach(__v => __obj.updateDynamic("certificatePem")(__v.asInstanceOf[js.Any]))
      expiration.foreach(__v => __obj.updateDynamic("expiration")(__v.asInstanceOf[js.Any]))
      keyPair.foreach(__v => __obj.updateDynamic("keyPair")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisioningClaimResponse]
    }
  }

  @js.native
  trait CreateProvisioningTemplateRequest extends js.Object {
    var provisioningRoleArn: RoleArn
    var templateBody: TemplateBody
    var templateName: TemplateName
    var description: js.UndefOr[TemplateDescription]
    var enabled: js.UndefOr[Enabled]
    var preProvisioningHook: js.UndefOr[ProvisioningHook]
    var tags: js.UndefOr[TagList]
  }

  object CreateProvisioningTemplateRequest {
    @inline
    def apply(
        provisioningRoleArn: RoleArn,
        templateBody: TemplateBody,
        templateName: TemplateName,
        description: js.UndefOr[TemplateDescription] = js.undefined,
        enabled: js.UndefOr[Enabled] = js.undefined,
        preProvisioningHook: js.UndefOr[ProvisioningHook] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateProvisioningTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "provisioningRoleArn" -> provisioningRoleArn.asInstanceOf[js.Any],
        "templateBody" -> templateBody.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      preProvisioningHook.foreach(__v => __obj.updateDynamic("preProvisioningHook")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisioningTemplateRequest]
    }
  }

  @js.native
  trait CreateProvisioningTemplateResponse extends js.Object {
    var defaultVersionId: js.UndefOr[TemplateVersionId]
    var templateArn: js.UndefOr[TemplateArn]
    var templateName: js.UndefOr[TemplateName]
  }

  object CreateProvisioningTemplateResponse {
    @inline
    def apply(
        defaultVersionId: js.UndefOr[TemplateVersionId] = js.undefined,
        templateArn: js.UndefOr[TemplateArn] = js.undefined,
        templateName: js.UndefOr[TemplateName] = js.undefined
    ): CreateProvisioningTemplateResponse = {
      val __obj = js.Dynamic.literal()
      defaultVersionId.foreach(__v => __obj.updateDynamic("defaultVersionId")(__v.asInstanceOf[js.Any]))
      templateArn.foreach(__v => __obj.updateDynamic("templateArn")(__v.asInstanceOf[js.Any]))
      templateName.foreach(__v => __obj.updateDynamic("templateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisioningTemplateResponse]
    }
  }

  @js.native
  trait CreateProvisioningTemplateVersionRequest extends js.Object {
    var templateBody: TemplateBody
    var templateName: TemplateName
    var setAsDefault: js.UndefOr[SetAsDefault]
  }

  object CreateProvisioningTemplateVersionRequest {
    @inline
    def apply(
        templateBody: TemplateBody,
        templateName: TemplateName,
        setAsDefault: js.UndefOr[SetAsDefault] = js.undefined
    ): CreateProvisioningTemplateVersionRequest = {
      val __obj = js.Dynamic.literal(
        "templateBody" -> templateBody.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      setAsDefault.foreach(__v => __obj.updateDynamic("setAsDefault")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisioningTemplateVersionRequest]
    }
  }

  @js.native
  trait CreateProvisioningTemplateVersionResponse extends js.Object {
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var templateArn: js.UndefOr[TemplateArn]
    var templateName: js.UndefOr[TemplateName]
    var versionId: js.UndefOr[TemplateVersionId]
  }

  object CreateProvisioningTemplateVersionResponse {
    @inline
    def apply(
        isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
        templateArn: js.UndefOr[TemplateArn] = js.undefined,
        templateName: js.UndefOr[TemplateName] = js.undefined,
        versionId: js.UndefOr[TemplateVersionId] = js.undefined
    ): CreateProvisioningTemplateVersionResponse = {
      val __obj = js.Dynamic.literal()
      isDefaultVersion.foreach(__v => __obj.updateDynamic("isDefaultVersion")(__v.asInstanceOf[js.Any]))
      templateArn.foreach(__v => __obj.updateDynamic("templateArn")(__v.asInstanceOf[js.Any]))
      templateName.foreach(__v => __obj.updateDynamic("templateName")(__v.asInstanceOf[js.Any]))
      versionId.foreach(__v => __obj.updateDynamic("versionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisioningTemplateVersionResponse]
    }
  }

  @js.native
  trait CreateRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
    var roleArn: RoleArn
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds]
    var tags: js.UndefOr[TagList]
  }

  object CreateRoleAliasRequest {
    @inline
    def apply(
        roleAlias: RoleAlias,
        roleArn: RoleArn,
        credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateRoleAliasRequest = {
      val __obj = js.Dynamic.literal(
        "roleAlias" -> roleAlias.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      credentialDurationSeconds.foreach(__v => __obj.updateDynamic("credentialDurationSeconds")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoleAliasRequest]
    }
  }

  @js.native
  trait CreateRoleAliasResponse extends js.Object {
    var roleAlias: js.UndefOr[RoleAlias]
    var roleAliasArn: js.UndefOr[RoleAliasArn]
  }

  object CreateRoleAliasResponse {
    @inline
    def apply(
        roleAlias: js.UndefOr[RoleAlias] = js.undefined,
        roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
    ): CreateRoleAliasResponse = {
      val __obj = js.Dynamic.literal()
      roleAlias.foreach(__v => __obj.updateDynamic("roleAlias")(__v.asInstanceOf[js.Any]))
      roleAliasArn.foreach(__v => __obj.updateDynamic("roleAliasArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoleAliasResponse]
    }
  }

  @js.native
  trait CreateScheduledAuditRequest extends js.Object {
    var frequency: AuditFrequency
    var scheduledAuditName: ScheduledAuditName
    var targetCheckNames: TargetAuditCheckNames
    var dayOfMonth: js.UndefOr[DayOfMonth]
    var dayOfWeek: js.UndefOr[DayOfWeek]
    var tags: js.UndefOr[TagList]
  }

  object CreateScheduledAuditRequest {
    @inline
    def apply(
        frequency: AuditFrequency,
        scheduledAuditName: ScheduledAuditName,
        targetCheckNames: TargetAuditCheckNames,
        dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateScheduledAuditRequest = {
      val __obj = js.Dynamic.literal(
        "frequency" -> frequency.asInstanceOf[js.Any],
        "scheduledAuditName" -> scheduledAuditName.asInstanceOf[js.Any],
        "targetCheckNames" -> targetCheckNames.asInstanceOf[js.Any]
      )

      dayOfMonth.foreach(__v => __obj.updateDynamic("dayOfMonth")(__v.asInstanceOf[js.Any]))
      dayOfWeek.foreach(__v => __obj.updateDynamic("dayOfWeek")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScheduledAuditRequest]
    }
  }

  @js.native
  trait CreateScheduledAuditResponse extends js.Object {
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
  }

  object CreateScheduledAuditResponse {
    @inline
    def apply(
        scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined
    ): CreateScheduledAuditResponse = {
      val __obj = js.Dynamic.literal()
      scheduledAuditArn.foreach(__v => __obj.updateDynamic("scheduledAuditArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScheduledAuditResponse]
    }
  }

  @js.native
  trait CreateSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList]
    var additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List]
    var alertTargets: js.UndefOr[AlertTargets]
    var behaviors: js.UndefOr[Behaviors]
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription]
    var tags: js.UndefOr[TagList]
  }

  object CreateSecurityProfileRequest {
    @inline
    def apply(
        securityProfileName: SecurityProfileName,
        additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined,
        additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List] = js.undefined,
        alertTargets: js.UndefOr[AlertTargets] = js.undefined,
        behaviors: js.UndefOr[Behaviors] = js.undefined,
        securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateSecurityProfileRequest = {
      val __obj = js.Dynamic.literal(
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any]
      )

      additionalMetricsToRetain.foreach(__v => __obj.updateDynamic("additionalMetricsToRetain")(__v.asInstanceOf[js.Any]))
      additionalMetricsToRetainV2.foreach(__v => __obj.updateDynamic("additionalMetricsToRetainV2")(__v.asInstanceOf[js.Any]))
      alertTargets.foreach(__v => __obj.updateDynamic("alertTargets")(__v.asInstanceOf[js.Any]))
      behaviors.foreach(__v => __obj.updateDynamic("behaviors")(__v.asInstanceOf[js.Any]))
      securityProfileDescription.foreach(__v => __obj.updateDynamic("securityProfileDescription")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSecurityProfileRequest]
    }
  }

  @js.native
  trait CreateSecurityProfileResponse extends js.Object {
    var securityProfileArn: js.UndefOr[SecurityProfileArn]
    var securityProfileName: js.UndefOr[SecurityProfileName]
  }

  object CreateSecurityProfileResponse {
    @inline
    def apply(
        securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
    ): CreateSecurityProfileResponse = {
      val __obj = js.Dynamic.literal()
      securityProfileArn.foreach(__v => __obj.updateDynamic("securityProfileArn")(__v.asInstanceOf[js.Any]))
      securityProfileName.foreach(__v => __obj.updateDynamic("securityProfileName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSecurityProfileResponse]
    }
  }

  @js.native
  trait CreateStreamRequest extends js.Object {
    var files: StreamFiles
    var roleArn: RoleArn
    var streamId: StreamId
    var description: js.UndefOr[StreamDescription]
    var tags: js.UndefOr[TagList]
  }

  object CreateStreamRequest {
    @inline
    def apply(
        files: StreamFiles,
        roleArn: RoleArn,
        streamId: StreamId,
        description: js.UndefOr[StreamDescription] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateStreamRequest = {
      val __obj = js.Dynamic.literal(
        "files" -> files.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "streamId" -> streamId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamRequest]
    }
  }

  @js.native
  trait CreateStreamResponse extends js.Object {
    var description: js.UndefOr[StreamDescription]
    var streamArn: js.UndefOr[StreamArn]
    var streamId: js.UndefOr[StreamId]
    var streamVersion: js.UndefOr[StreamVersion]
  }

  object CreateStreamResponse {
    @inline
    def apply(
        description: js.UndefOr[StreamDescription] = js.undefined,
        streamArn: js.UndefOr[StreamArn] = js.undefined,
        streamId: js.UndefOr[StreamId] = js.undefined,
        streamVersion: js.UndefOr[StreamVersion] = js.undefined
    ): CreateStreamResponse = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      streamArn.foreach(__v => __obj.updateDynamic("streamArn")(__v.asInstanceOf[js.Any]))
      streamId.foreach(__v => __obj.updateDynamic("streamId")(__v.asInstanceOf[js.Any]))
      streamVersion.foreach(__v => __obj.updateDynamic("streamVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamResponse]
    }
  }

  @js.native
  trait CreateThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var parentGroupName: js.UndefOr[ThingGroupName]
    var tags: js.UndefOr[TagList]
    var thingGroupProperties: js.UndefOr[ThingGroupProperties]
  }

  object CreateThingGroupRequest {
    @inline
    def apply(
        thingGroupName: ThingGroupName,
        parentGroupName: js.UndefOr[ThingGroupName] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined
    ): CreateThingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any]
      )

      parentGroupName.foreach(__v => __obj.updateDynamic("parentGroupName")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      thingGroupProperties.foreach(__v => __obj.updateDynamic("thingGroupProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThingGroupRequest]
    }
  }

  @js.native
  trait CreateThingGroupResponse extends js.Object {
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var thingGroupName: js.UndefOr[ThingGroupName]
  }

  object CreateThingGroupResponse {
    @inline
    def apply(
        thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
        thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
    ): CreateThingGroupResponse = {
      val __obj = js.Dynamic.literal()
      thingGroupArn.foreach(__v => __obj.updateDynamic("thingGroupArn")(__v.asInstanceOf[js.Any]))
      thingGroupId.foreach(__v => __obj.updateDynamic("thingGroupId")(__v.asInstanceOf[js.Any]))
      thingGroupName.foreach(__v => __obj.updateDynamic("thingGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThingGroupResponse]
    }
  }

  /** The input for the CreateThing operation.
    */
  @js.native
  trait CreateThingRequest extends js.Object {
    var thingName: ThingName
    var attributePayload: js.UndefOr[AttributePayload]
    var billingGroupName: js.UndefOr[BillingGroupName]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  object CreateThingRequest {
    @inline
    def apply(
        thingName: ThingName,
        attributePayload: js.UndefOr[AttributePayload] = js.undefined,
        billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    ): CreateThingRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      attributePayload.foreach(__v => __obj.updateDynamic("attributePayload")(__v.asInstanceOf[js.Any]))
      billingGroupName.foreach(__v => __obj.updateDynamic("billingGroupName")(__v.asInstanceOf[js.Any]))
      thingTypeName.foreach(__v => __obj.updateDynamic("thingTypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThingRequest]
    }
  }

  /** The output of the CreateThing operation.
    */
  @js.native
  trait CreateThingResponse extends js.Object {
    var thingArn: js.UndefOr[ThingArn]
    var thingId: js.UndefOr[ThingId]
    var thingName: js.UndefOr[ThingName]
  }

  object CreateThingResponse {
    @inline
    def apply(
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingId: js.UndefOr[ThingId] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): CreateThingResponse = {
      val __obj = js.Dynamic.literal()
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      thingId.foreach(__v => __obj.updateDynamic("thingId")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThingResponse]
    }
  }

  /** The input for the CreateThingType operation.
    */
  @js.native
  trait CreateThingTypeRequest extends js.Object {
    var thingTypeName: ThingTypeName
    var tags: js.UndefOr[TagList]
    var thingTypeProperties: js.UndefOr[ThingTypeProperties]
  }

  object CreateThingTypeRequest {
    @inline
    def apply(
        thingTypeName: ThingTypeName,
        tags: js.UndefOr[TagList] = js.undefined,
        thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
    ): CreateThingTypeRequest = {
      val __obj = js.Dynamic.literal(
        "thingTypeName" -> thingTypeName.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      thingTypeProperties.foreach(__v => __obj.updateDynamic("thingTypeProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThingTypeRequest]
    }
  }

  /** The output of the CreateThingType operation.
    */
  @js.native
  trait CreateThingTypeResponse extends js.Object {
    var thingTypeArn: js.UndefOr[ThingTypeArn]
    var thingTypeId: js.UndefOr[ThingTypeId]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  object CreateThingTypeResponse {
    @inline
    def apply(
        thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined,
        thingTypeId: js.UndefOr[ThingTypeId] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    ): CreateThingTypeResponse = {
      val __obj = js.Dynamic.literal()
      thingTypeArn.foreach(__v => __obj.updateDynamic("thingTypeArn")(__v.asInstanceOf[js.Any]))
      thingTypeId.foreach(__v => __obj.updateDynamic("thingTypeId")(__v.asInstanceOf[js.Any]))
      thingTypeName.foreach(__v => __obj.updateDynamic("thingTypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThingTypeResponse]
    }
  }

  @js.native
  trait CreateTopicRuleDestinationRequest extends js.Object {
    var destinationConfiguration: TopicRuleDestinationConfiguration
  }

  object CreateTopicRuleDestinationRequest {
    @inline
    def apply(
        destinationConfiguration: TopicRuleDestinationConfiguration
    ): CreateTopicRuleDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "destinationConfiguration" -> destinationConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateTopicRuleDestinationRequest]
    }
  }

  @js.native
  trait CreateTopicRuleDestinationResponse extends js.Object {
    var topicRuleDestination: js.UndefOr[TopicRuleDestination]
  }

  object CreateTopicRuleDestinationResponse {
    @inline
    def apply(
        topicRuleDestination: js.UndefOr[TopicRuleDestination] = js.undefined
    ): CreateTopicRuleDestinationResponse = {
      val __obj = js.Dynamic.literal()
      topicRuleDestination.foreach(__v => __obj.updateDynamic("topicRuleDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTopicRuleDestinationResponse]
    }
  }

  /** The input for the CreateTopicRule operation.
    */
  @js.native
  trait CreateTopicRuleRequest extends js.Object {
    var ruleName: RuleName
    var topicRulePayload: TopicRulePayload
    var tags: js.UndefOr[String]
  }

  object CreateTopicRuleRequest {
    @inline
    def apply(
        ruleName: RuleName,
        topicRulePayload: TopicRulePayload,
        tags: js.UndefOr[String] = js.undefined
    ): CreateTopicRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ruleName" -> ruleName.asInstanceOf[js.Any],
        "topicRulePayload" -> topicRulePayload.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTopicRuleRequest]
    }
  }

  /** Describes a custom method used to code sign a file.
    */
  @js.native
  trait CustomCodeSigning extends js.Object {
    var certificateChain: js.UndefOr[CodeSigningCertificateChain]
    var hashAlgorithm: js.UndefOr[HashAlgorithm]
    var signature: js.UndefOr[CodeSigningSignature]
    var signatureAlgorithm: js.UndefOr[SignatureAlgorithm]
  }

  object CustomCodeSigning {
    @inline
    def apply(
        certificateChain: js.UndefOr[CodeSigningCertificateChain] = js.undefined,
        hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined,
        signature: js.UndefOr[CodeSigningSignature] = js.undefined,
        signatureAlgorithm: js.UndefOr[SignatureAlgorithm] = js.undefined
    ): CustomCodeSigning = {
      val __obj = js.Dynamic.literal()
      certificateChain.foreach(__v => __obj.updateDynamic("certificateChain")(__v.asInstanceOf[js.Any]))
      hashAlgorithm.foreach(__v => __obj.updateDynamic("hashAlgorithm")(__v.asInstanceOf[js.Any]))
      signature.foreach(__v => __obj.updateDynamic("signature")(__v.asInstanceOf[js.Any]))
      signatureAlgorithm.foreach(__v => __obj.updateDynamic("signatureAlgorithm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomCodeSigning]
    }
  }

  @js.native
  sealed trait CustomMetricType extends js.Any
  object CustomMetricType {
    val `string-list` = "string-list".asInstanceOf[CustomMetricType]
    val `ip-address-list` = "ip-address-list".asInstanceOf[CustomMetricType]
    val `number-list` = "number-list".asInstanceOf[CustomMetricType]
    val number = "number".asInstanceOf[CustomMetricType]

    @inline def values = js.Array(`string-list`, `ip-address-list`, `number-list`, number)
  }

  @js.native
  sealed trait DayOfWeek extends js.Any
  object DayOfWeek {
    val SUN = "SUN".asInstanceOf[DayOfWeek]
    val MON = "MON".asInstanceOf[DayOfWeek]
    val TUE = "TUE".asInstanceOf[DayOfWeek]
    val WED = "WED".asInstanceOf[DayOfWeek]
    val THU = "THU".asInstanceOf[DayOfWeek]
    val FRI = "FRI".asInstanceOf[DayOfWeek]
    val SAT = "SAT".asInstanceOf[DayOfWeek]

    @inline def values = js.Array(SUN, MON, TUE, WED, THU, FRI, SAT)
  }

  @js.native
  trait DeleteAccountAuditConfigurationRequest extends js.Object {
    var deleteScheduledAudits: js.UndefOr[DeleteScheduledAudits]
  }

  object DeleteAccountAuditConfigurationRequest {
    @inline
    def apply(
        deleteScheduledAudits: js.UndefOr[DeleteScheduledAudits] = js.undefined
    ): DeleteAccountAuditConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      deleteScheduledAudits.foreach(__v => __obj.updateDynamic("deleteScheduledAudits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAccountAuditConfigurationRequest]
    }
  }

  @js.native
  trait DeleteAccountAuditConfigurationResponse extends js.Object

  object DeleteAccountAuditConfigurationResponse {
    @inline
    def apply(): DeleteAccountAuditConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAccountAuditConfigurationResponse]
    }
  }

  @js.native
  trait DeleteAuditSuppressionRequest extends js.Object {
    var checkName: AuditCheckName
    var resourceIdentifier: ResourceIdentifier
  }

  object DeleteAuditSuppressionRequest {
    @inline
    def apply(
        checkName: AuditCheckName,
        resourceIdentifier: ResourceIdentifier
    ): DeleteAuditSuppressionRequest = {
      val __obj = js.Dynamic.literal(
        "checkName" -> checkName.asInstanceOf[js.Any],
        "resourceIdentifier" -> resourceIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAuditSuppressionRequest]
    }
  }

  @js.native
  trait DeleteAuditSuppressionResponse extends js.Object

  object DeleteAuditSuppressionResponse {
    @inline
    def apply(): DeleteAuditSuppressionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAuditSuppressionResponse]
    }
  }

  @js.native
  trait DeleteAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
  }

  object DeleteAuthorizerRequest {
    @inline
    def apply(
        authorizerName: AuthorizerName
    ): DeleteAuthorizerRequest = {
      val __obj = js.Dynamic.literal(
        "authorizerName" -> authorizerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAuthorizerRequest]
    }
  }

  @js.native
  trait DeleteAuthorizerResponse extends js.Object

  object DeleteAuthorizerResponse {
    @inline
    def apply(): DeleteAuthorizerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAuthorizerResponse]
    }
  }

  @js.native
  trait DeleteBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteBillingGroupRequest {
    @inline
    def apply(
        billingGroupName: BillingGroupName,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): DeleteBillingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "billingGroupName" -> billingGroupName.asInstanceOf[js.Any]
      )

      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBillingGroupRequest]
    }
  }

  @js.native
  trait DeleteBillingGroupResponse extends js.Object

  object DeleteBillingGroupResponse {
    @inline
    def apply(): DeleteBillingGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteBillingGroupResponse]
    }
  }

  /** Input for the DeleteCACertificate operation.
    */
  @js.native
  trait DeleteCACertificateRequest extends js.Object {
    var certificateId: CertificateId
  }

  object DeleteCACertificateRequest {
    @inline
    def apply(
        certificateId: CertificateId
    ): DeleteCACertificateRequest = {
      val __obj = js.Dynamic.literal(
        "certificateId" -> certificateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCACertificateRequest]
    }
  }

  /** The output for the DeleteCACertificate operation.
    */
  @js.native
  trait DeleteCACertificateResponse extends js.Object

  object DeleteCACertificateResponse {
    @inline
    def apply(): DeleteCACertificateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteCACertificateResponse]
    }
  }

  /** The input for the DeleteCertificate operation.
    */
  @js.native
  trait DeleteCertificateRequest extends js.Object {
    var certificateId: CertificateId
    var forceDelete: js.UndefOr[ForceDelete]
  }

  object DeleteCertificateRequest {
    @inline
    def apply(
        certificateId: CertificateId,
        forceDelete: js.UndefOr[ForceDelete] = js.undefined
    ): DeleteCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "certificateId" -> certificateId.asInstanceOf[js.Any]
      )

      forceDelete.foreach(__v => __obj.updateDynamic("forceDelete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCertificateRequest]
    }
  }

  @js.native
  trait DeleteCustomMetricRequest extends js.Object {
    var metricName: MetricName
  }

  object DeleteCustomMetricRequest {
    @inline
    def apply(
        metricName: MetricName
    ): DeleteCustomMetricRequest = {
      val __obj = js.Dynamic.literal(
        "metricName" -> metricName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCustomMetricRequest]
    }
  }

  @js.native
  trait DeleteCustomMetricResponse extends js.Object

  object DeleteCustomMetricResponse {
    @inline
    def apply(): DeleteCustomMetricResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteCustomMetricResponse]
    }
  }

  @js.native
  trait DeleteDimensionRequest extends js.Object {
    var name: DimensionName
  }

  object DeleteDimensionRequest {
    @inline
    def apply(
        name: DimensionName
    ): DeleteDimensionRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDimensionRequest]
    }
  }

  @js.native
  trait DeleteDimensionResponse extends js.Object

  object DeleteDimensionResponse {
    @inline
    def apply(): DeleteDimensionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDimensionResponse]
    }
  }

  @js.native
  trait DeleteDomainConfigurationRequest extends js.Object {
    var domainConfigurationName: DomainConfigurationName
  }

  object DeleteDomainConfigurationRequest {
    @inline
    def apply(
        domainConfigurationName: DomainConfigurationName
    ): DeleteDomainConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "domainConfigurationName" -> domainConfigurationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDomainConfigurationRequest]
    }
  }

  @js.native
  trait DeleteDomainConfigurationResponse extends js.Object

  object DeleteDomainConfigurationResponse {
    @inline
    def apply(): DeleteDomainConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDomainConfigurationResponse]
    }
  }

  @js.native
  trait DeleteDynamicThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteDynamicThingGroupRequest {
    @inline
    def apply(
        thingGroupName: ThingGroupName,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): DeleteDynamicThingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any]
      )

      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDynamicThingGroupRequest]
    }
  }

  @js.native
  trait DeleteDynamicThingGroupResponse extends js.Object

  object DeleteDynamicThingGroupResponse {
    @inline
    def apply(): DeleteDynamicThingGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDynamicThingGroupResponse]
    }
  }

  @js.native
  trait DeleteJobExecutionRequest extends js.Object {
    var executionNumber: ExecutionNumber
    var jobId: JobId
    var thingName: ThingName
    var force: js.UndefOr[ForceFlag]
    var namespaceId: js.UndefOr[NamespaceId]
  }

  object DeleteJobExecutionRequest {
    @inline
    def apply(
        executionNumber: ExecutionNumber,
        jobId: JobId,
        thingName: ThingName,
        force: js.UndefOr[ForceFlag] = js.undefined,
        namespaceId: js.UndefOr[NamespaceId] = js.undefined
    ): DeleteJobExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "executionNumber" -> executionNumber.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      namespaceId.foreach(__v => __obj.updateDynamic("namespaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteJobExecutionRequest]
    }
  }

  @js.native
  trait DeleteJobRequest extends js.Object {
    var jobId: JobId
    var force: js.UndefOr[ForceFlag]
    var namespaceId: js.UndefOr[NamespaceId]
  }

  object DeleteJobRequest {
    @inline
    def apply(
        jobId: JobId,
        force: js.UndefOr[ForceFlag] = js.undefined,
        namespaceId: js.UndefOr[NamespaceId] = js.undefined
    ): DeleteJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      namespaceId.foreach(__v => __obj.updateDynamic("namespaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteJobRequest]
    }
  }

  @js.native
  trait DeleteMitigationActionRequest extends js.Object {
    var actionName: MitigationActionName
  }

  object DeleteMitigationActionRequest {
    @inline
    def apply(
        actionName: MitigationActionName
    ): DeleteMitigationActionRequest = {
      val __obj = js.Dynamic.literal(
        "actionName" -> actionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMitigationActionRequest]
    }
  }

  @js.native
  trait DeleteMitigationActionResponse extends js.Object

  object DeleteMitigationActionResponse {
    @inline
    def apply(): DeleteMitigationActionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMitigationActionResponse]
    }
  }

  @js.native
  trait DeleteOTAUpdateRequest extends js.Object {
    var otaUpdateId: OTAUpdateId
    var deleteStream: js.UndefOr[DeleteStream]
    var forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob]
  }

  object DeleteOTAUpdateRequest {
    @inline
    def apply(
        otaUpdateId: OTAUpdateId,
        deleteStream: js.UndefOr[DeleteStream] = js.undefined,
        forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob] = js.undefined
    ): DeleteOTAUpdateRequest = {
      val __obj = js.Dynamic.literal(
        "otaUpdateId" -> otaUpdateId.asInstanceOf[js.Any]
      )

      deleteStream.foreach(__v => __obj.updateDynamic("deleteStream")(__v.asInstanceOf[js.Any]))
      forceDeleteAWSJob.foreach(__v => __obj.updateDynamic("forceDeleteAWSJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteOTAUpdateRequest]
    }
  }

  @js.native
  trait DeleteOTAUpdateResponse extends js.Object

  object DeleteOTAUpdateResponse {
    @inline
    def apply(): DeleteOTAUpdateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteOTAUpdateResponse]
    }
  }

  /** The input for the DeletePolicy operation.
    */
  @js.native
  trait DeletePolicyRequest extends js.Object {
    var policyName: PolicyName
  }

  object DeletePolicyRequest {
    @inline
    def apply(
        policyName: PolicyName
    ): DeletePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyName" -> policyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePolicyRequest]
    }
  }

  /** The input for the DeletePolicyVersion operation.
    */
  @js.native
  trait DeletePolicyVersionRequest extends js.Object {
    var policyName: PolicyName
    var policyVersionId: PolicyVersionId
  }

  object DeletePolicyVersionRequest {
    @inline
    def apply(
        policyName: PolicyName,
        policyVersionId: PolicyVersionId
    ): DeletePolicyVersionRequest = {
      val __obj = js.Dynamic.literal(
        "policyName" -> policyName.asInstanceOf[js.Any],
        "policyVersionId" -> policyVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePolicyVersionRequest]
    }
  }

  @js.native
  trait DeleteProvisioningTemplateRequest extends js.Object {
    var templateName: TemplateName
  }

  object DeleteProvisioningTemplateRequest {
    @inline
    def apply(
        templateName: TemplateName
    ): DeleteProvisioningTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProvisioningTemplateRequest]
    }
  }

  @js.native
  trait DeleteProvisioningTemplateResponse extends js.Object

  object DeleteProvisioningTemplateResponse {
    @inline
    def apply(): DeleteProvisioningTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteProvisioningTemplateResponse]
    }
  }

  @js.native
  trait DeleteProvisioningTemplateVersionRequest extends js.Object {
    var templateName: TemplateName
    var versionId: TemplateVersionId
  }

  object DeleteProvisioningTemplateVersionRequest {
    @inline
    def apply(
        templateName: TemplateName,
        versionId: TemplateVersionId
    ): DeleteProvisioningTemplateVersionRequest = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any],
        "versionId" -> versionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProvisioningTemplateVersionRequest]
    }
  }

  @js.native
  trait DeleteProvisioningTemplateVersionResponse extends js.Object

  object DeleteProvisioningTemplateVersionResponse {
    @inline
    def apply(): DeleteProvisioningTemplateVersionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteProvisioningTemplateVersionResponse]
    }
  }

  /** The input for the DeleteRegistrationCode operation.
    */
  @js.native
  trait DeleteRegistrationCodeRequest extends js.Object

  object DeleteRegistrationCodeRequest {
    @inline
    def apply(): DeleteRegistrationCodeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRegistrationCodeRequest]
    }
  }

  /** The output for the DeleteRegistrationCode operation.
    */
  @js.native
  trait DeleteRegistrationCodeResponse extends js.Object

  object DeleteRegistrationCodeResponse {
    @inline
    def apply(): DeleteRegistrationCodeResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRegistrationCodeResponse]
    }
  }

  @js.native
  trait DeleteRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
  }

  object DeleteRoleAliasRequest {
    @inline
    def apply(
        roleAlias: RoleAlias
    ): DeleteRoleAliasRequest = {
      val __obj = js.Dynamic.literal(
        "roleAlias" -> roleAlias.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRoleAliasRequest]
    }
  }

  @js.native
  trait DeleteRoleAliasResponse extends js.Object

  object DeleteRoleAliasResponse {
    @inline
    def apply(): DeleteRoleAliasResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRoleAliasResponse]
    }
  }

  @js.native
  trait DeleteScheduledAuditRequest extends js.Object {
    var scheduledAuditName: ScheduledAuditName
  }

  object DeleteScheduledAuditRequest {
    @inline
    def apply(
        scheduledAuditName: ScheduledAuditName
    ): DeleteScheduledAuditRequest = {
      val __obj = js.Dynamic.literal(
        "scheduledAuditName" -> scheduledAuditName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteScheduledAuditRequest]
    }
  }

  @js.native
  trait DeleteScheduledAuditResponse extends js.Object

  object DeleteScheduledAuditResponse {
    @inline
    def apply(): DeleteScheduledAuditResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteScheduledAuditResponse]
    }
  }

  @js.native
  trait DeleteSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteSecurityProfileRequest {
    @inline
    def apply(
        securityProfileName: SecurityProfileName,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): DeleteSecurityProfileRequest = {
      val __obj = js.Dynamic.literal(
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any]
      )

      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSecurityProfileRequest]
    }
  }

  @js.native
  trait DeleteSecurityProfileResponse extends js.Object

  object DeleteSecurityProfileResponse {
    @inline
    def apply(): DeleteSecurityProfileResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSecurityProfileResponse]
    }
  }

  @js.native
  trait DeleteStreamRequest extends js.Object {
    var streamId: StreamId
  }

  object DeleteStreamRequest {
    @inline
    def apply(
        streamId: StreamId
    ): DeleteStreamRequest = {
      val __obj = js.Dynamic.literal(
        "streamId" -> streamId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteStreamRequest]
    }
  }

  @js.native
  trait DeleteStreamResponse extends js.Object

  object DeleteStreamResponse {
    @inline
    def apply(): DeleteStreamResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteStreamResponse]
    }
  }

  @js.native
  trait DeleteThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteThingGroupRequest {
    @inline
    def apply(
        thingGroupName: ThingGroupName,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): DeleteThingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any]
      )

      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteThingGroupRequest]
    }
  }

  @js.native
  trait DeleteThingGroupResponse extends js.Object

  object DeleteThingGroupResponse {
    @inline
    def apply(): DeleteThingGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteThingGroupResponse]
    }
  }

  /** The input for the DeleteThing operation.
    */
  @js.native
  trait DeleteThingRequest extends js.Object {
    var thingName: ThingName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteThingRequest {
    @inline
    def apply(
        thingName: ThingName,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): DeleteThingRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteThingRequest]
    }
  }

  /** The output of the DeleteThing operation.
    */
  @js.native
  trait DeleteThingResponse extends js.Object

  object DeleteThingResponse {
    @inline
    def apply(): DeleteThingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteThingResponse]
    }
  }

  /** The input for the DeleteThingType operation.
    */
  @js.native
  trait DeleteThingTypeRequest extends js.Object {
    var thingTypeName: ThingTypeName
  }

  object DeleteThingTypeRequest {
    @inline
    def apply(
        thingTypeName: ThingTypeName
    ): DeleteThingTypeRequest = {
      val __obj = js.Dynamic.literal(
        "thingTypeName" -> thingTypeName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteThingTypeRequest]
    }
  }

  /** The output for the DeleteThingType operation.
    */
  @js.native
  trait DeleteThingTypeResponse extends js.Object

  object DeleteThingTypeResponse {
    @inline
    def apply(): DeleteThingTypeResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteThingTypeResponse]
    }
  }

  @js.native
  trait DeleteTopicRuleDestinationRequest extends js.Object {
    var arn: AwsArn
  }

  object DeleteTopicRuleDestinationRequest {
    @inline
    def apply(
        arn: AwsArn
    ): DeleteTopicRuleDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTopicRuleDestinationRequest]
    }
  }

  @js.native
  trait DeleteTopicRuleDestinationResponse extends js.Object

  object DeleteTopicRuleDestinationResponse {
    @inline
    def apply(): DeleteTopicRuleDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTopicRuleDestinationResponse]
    }
  }

  /** The input for the DeleteTopicRule operation.
    */
  @js.native
  trait DeleteTopicRuleRequest extends js.Object {
    var ruleName: RuleName
  }

  object DeleteTopicRuleRequest {
    @inline
    def apply(
        ruleName: RuleName
    ): DeleteTopicRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTopicRuleRequest]
    }
  }

  @js.native
  trait DeleteV2LoggingLevelRequest extends js.Object {
    var targetName: LogTargetName
    var targetType: LogTargetType
  }

  object DeleteV2LoggingLevelRequest {
    @inline
    def apply(
        targetName: LogTargetName,
        targetType: LogTargetType
    ): DeleteV2LoggingLevelRequest = {
      val __obj = js.Dynamic.literal(
        "targetName" -> targetName.asInstanceOf[js.Any],
        "targetType" -> targetType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteV2LoggingLevelRequest]
    }
  }

  /** Contains information that denied the authorization.
    */
  @js.native
  trait Denied extends js.Object {
    var explicitDeny: js.UndefOr[ExplicitDeny]
    var implicitDeny: js.UndefOr[ImplicitDeny]
  }

  object Denied {
    @inline
    def apply(
        explicitDeny: js.UndefOr[ExplicitDeny] = js.undefined,
        implicitDeny: js.UndefOr[ImplicitDeny] = js.undefined
    ): Denied = {
      val __obj = js.Dynamic.literal()
      explicitDeny.foreach(__v => __obj.updateDynamic("explicitDeny")(__v.asInstanceOf[js.Any]))
      implicitDeny.foreach(__v => __obj.updateDynamic("implicitDeny")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Denied]
    }
  }

  /** The input for the DeprecateThingType operation.
    */
  @js.native
  trait DeprecateThingTypeRequest extends js.Object {
    var thingTypeName: ThingTypeName
    var undoDeprecate: js.UndefOr[UndoDeprecate]
  }

  object DeprecateThingTypeRequest {
    @inline
    def apply(
        thingTypeName: ThingTypeName,
        undoDeprecate: js.UndefOr[UndoDeprecate] = js.undefined
    ): DeprecateThingTypeRequest = {
      val __obj = js.Dynamic.literal(
        "thingTypeName" -> thingTypeName.asInstanceOf[js.Any]
      )

      undoDeprecate.foreach(__v => __obj.updateDynamic("undoDeprecate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeprecateThingTypeRequest]
    }
  }

  /** The output for the DeprecateThingType operation.
    */
  @js.native
  trait DeprecateThingTypeResponse extends js.Object

  object DeprecateThingTypeResponse {
    @inline
    def apply(): DeprecateThingTypeResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecateThingTypeResponse]
    }
  }

  @js.native
  trait DescribeAccountAuditConfigurationRequest extends js.Object

  object DescribeAccountAuditConfigurationRequest {
    @inline
    def apply(): DescribeAccountAuditConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeAccountAuditConfigurationRequest]
    }
  }

  @js.native
  trait DescribeAccountAuditConfigurationResponse extends js.Object {
    var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations]
    var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations]
    var roleArn: js.UndefOr[RoleArn]
  }

  object DescribeAccountAuditConfigurationResponse {
    @inline
    def apply(
        auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.undefined,
        auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeAccountAuditConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      auditCheckConfigurations.foreach(__v => __obj.updateDynamic("auditCheckConfigurations")(__v.asInstanceOf[js.Any]))
      auditNotificationTargetConfigurations.foreach(__v => __obj.updateDynamic("auditNotificationTargetConfigurations")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountAuditConfigurationResponse]
    }
  }

  @js.native
  trait DescribeAuditFindingRequest extends js.Object {
    var findingId: FindingId
  }

  object DescribeAuditFindingRequest {
    @inline
    def apply(
        findingId: FindingId
    ): DescribeAuditFindingRequest = {
      val __obj = js.Dynamic.literal(
        "findingId" -> findingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAuditFindingRequest]
    }
  }

  @js.native
  trait DescribeAuditFindingResponse extends js.Object {
    var finding: js.UndefOr[AuditFinding]
  }

  object DescribeAuditFindingResponse {
    @inline
    def apply(
        finding: js.UndefOr[AuditFinding] = js.undefined
    ): DescribeAuditFindingResponse = {
      val __obj = js.Dynamic.literal()
      finding.foreach(__v => __obj.updateDynamic("finding")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAuditFindingResponse]
    }
  }

  @js.native
  trait DescribeAuditMitigationActionsTaskRequest extends js.Object {
    var taskId: MitigationActionsTaskId
  }

  object DescribeAuditMitigationActionsTaskRequest {
    @inline
    def apply(
        taskId: MitigationActionsTaskId
    ): DescribeAuditMitigationActionsTaskRequest = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAuditMitigationActionsTaskRequest]
    }
  }

  @js.native
  trait DescribeAuditMitigationActionsTaskResponse extends js.Object {
    var actionsDefinition: js.UndefOr[MitigationActionList]
    var auditCheckToActionsMapping: js.UndefOr[AuditCheckToActionsMapping]
    var endTime: js.UndefOr[Timestamp]
    var startTime: js.UndefOr[Timestamp]
    var target: js.UndefOr[AuditMitigationActionsTaskTarget]
    var taskStatistics: js.UndefOr[AuditMitigationActionsTaskStatistics]
    var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus]
  }

  object DescribeAuditMitigationActionsTaskResponse {
    @inline
    def apply(
        actionsDefinition: js.UndefOr[MitigationActionList] = js.undefined,
        auditCheckToActionsMapping: js.UndefOr[AuditCheckToActionsMapping] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        target: js.UndefOr[AuditMitigationActionsTaskTarget] = js.undefined,
        taskStatistics: js.UndefOr[AuditMitigationActionsTaskStatistics] = js.undefined,
        taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.undefined
    ): DescribeAuditMitigationActionsTaskResponse = {
      val __obj = js.Dynamic.literal()
      actionsDefinition.foreach(__v => __obj.updateDynamic("actionsDefinition")(__v.asInstanceOf[js.Any]))
      auditCheckToActionsMapping.foreach(__v => __obj.updateDynamic("auditCheckToActionsMapping")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      taskStatistics.foreach(__v => __obj.updateDynamic("taskStatistics")(__v.asInstanceOf[js.Any]))
      taskStatus.foreach(__v => __obj.updateDynamic("taskStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAuditMitigationActionsTaskResponse]
    }
  }

  @js.native
  trait DescribeAuditSuppressionRequest extends js.Object {
    var checkName: AuditCheckName
    var resourceIdentifier: ResourceIdentifier
  }

  object DescribeAuditSuppressionRequest {
    @inline
    def apply(
        checkName: AuditCheckName,
        resourceIdentifier: ResourceIdentifier
    ): DescribeAuditSuppressionRequest = {
      val __obj = js.Dynamic.literal(
        "checkName" -> checkName.asInstanceOf[js.Any],
        "resourceIdentifier" -> resourceIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAuditSuppressionRequest]
    }
  }

  @js.native
  trait DescribeAuditSuppressionResponse extends js.Object {
    var checkName: js.UndefOr[AuditCheckName]
    var description: js.UndefOr[AuditDescription]
    var expirationDate: js.UndefOr[Timestamp]
    var resourceIdentifier: js.UndefOr[ResourceIdentifier]
    var suppressIndefinitely: js.UndefOr[SuppressIndefinitely]
  }

  object DescribeAuditSuppressionResponse {
    @inline
    def apply(
        checkName: js.UndefOr[AuditCheckName] = js.undefined,
        description: js.UndefOr[AuditDescription] = js.undefined,
        expirationDate: js.UndefOr[Timestamp] = js.undefined,
        resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
        suppressIndefinitely: js.UndefOr[SuppressIndefinitely] = js.undefined
    ): DescribeAuditSuppressionResponse = {
      val __obj = js.Dynamic.literal()
      checkName.foreach(__v => __obj.updateDynamic("checkName")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      expirationDate.foreach(__v => __obj.updateDynamic("expirationDate")(__v.asInstanceOf[js.Any]))
      resourceIdentifier.foreach(__v => __obj.updateDynamic("resourceIdentifier")(__v.asInstanceOf[js.Any]))
      suppressIndefinitely.foreach(__v => __obj.updateDynamic("suppressIndefinitely")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAuditSuppressionResponse]
    }
  }

  @js.native
  trait DescribeAuditTaskRequest extends js.Object {
    var taskId: AuditTaskId
  }

  object DescribeAuditTaskRequest {
    @inline
    def apply(
        taskId: AuditTaskId
    ): DescribeAuditTaskRequest = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAuditTaskRequest]
    }
  }

  @js.native
  trait DescribeAuditTaskResponse extends js.Object {
    var auditDetails: js.UndefOr[AuditDetails]
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
    var taskStartTime: js.UndefOr[Timestamp]
    var taskStatistics: js.UndefOr[TaskStatistics]
    var taskStatus: js.UndefOr[AuditTaskStatus]
    var taskType: js.UndefOr[AuditTaskType]
  }

  object DescribeAuditTaskResponse {
    @inline
    def apply(
        auditDetails: js.UndefOr[AuditDetails] = js.undefined,
        scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined,
        taskStartTime: js.UndefOr[Timestamp] = js.undefined,
        taskStatistics: js.UndefOr[TaskStatistics] = js.undefined,
        taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined,
        taskType: js.UndefOr[AuditTaskType] = js.undefined
    ): DescribeAuditTaskResponse = {
      val __obj = js.Dynamic.literal()
      auditDetails.foreach(__v => __obj.updateDynamic("auditDetails")(__v.asInstanceOf[js.Any]))
      scheduledAuditName.foreach(__v => __obj.updateDynamic("scheduledAuditName")(__v.asInstanceOf[js.Any]))
      taskStartTime.foreach(__v => __obj.updateDynamic("taskStartTime")(__v.asInstanceOf[js.Any]))
      taskStatistics.foreach(__v => __obj.updateDynamic("taskStatistics")(__v.asInstanceOf[js.Any]))
      taskStatus.foreach(__v => __obj.updateDynamic("taskStatus")(__v.asInstanceOf[js.Any]))
      taskType.foreach(__v => __obj.updateDynamic("taskType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAuditTaskResponse]
    }
  }

  @js.native
  trait DescribeAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
  }

  object DescribeAuthorizerRequest {
    @inline
    def apply(
        authorizerName: AuthorizerName
    ): DescribeAuthorizerRequest = {
      val __obj = js.Dynamic.literal(
        "authorizerName" -> authorizerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAuthorizerRequest]
    }
  }

  @js.native
  trait DescribeAuthorizerResponse extends js.Object {
    var authorizerDescription: js.UndefOr[AuthorizerDescription]
  }

  object DescribeAuthorizerResponse {
    @inline
    def apply(
        authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined
    ): DescribeAuthorizerResponse = {
      val __obj = js.Dynamic.literal()
      authorizerDescription.foreach(__v => __obj.updateDynamic("authorizerDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAuthorizerResponse]
    }
  }

  @js.native
  trait DescribeBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
  }

  object DescribeBillingGroupRequest {
    @inline
    def apply(
        billingGroupName: BillingGroupName
    ): DescribeBillingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "billingGroupName" -> billingGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeBillingGroupRequest]
    }
  }

  @js.native
  trait DescribeBillingGroupResponse extends js.Object {
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var billingGroupId: js.UndefOr[BillingGroupId]
    var billingGroupMetadata: js.UndefOr[BillingGroupMetadata]
    var billingGroupName: js.UndefOr[BillingGroupName]
    var billingGroupProperties: js.UndefOr[BillingGroupProperties]
    var version: js.UndefOr[Version]
  }

  object DescribeBillingGroupResponse {
    @inline
    def apply(
        billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
        billingGroupId: js.UndefOr[BillingGroupId] = js.undefined,
        billingGroupMetadata: js.UndefOr[BillingGroupMetadata] = js.undefined,
        billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
        billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): DescribeBillingGroupResponse = {
      val __obj = js.Dynamic.literal()
      billingGroupArn.foreach(__v => __obj.updateDynamic("billingGroupArn")(__v.asInstanceOf[js.Any]))
      billingGroupId.foreach(__v => __obj.updateDynamic("billingGroupId")(__v.asInstanceOf[js.Any]))
      billingGroupMetadata.foreach(__v => __obj.updateDynamic("billingGroupMetadata")(__v.asInstanceOf[js.Any]))
      billingGroupName.foreach(__v => __obj.updateDynamic("billingGroupName")(__v.asInstanceOf[js.Any]))
      billingGroupProperties.foreach(__v => __obj.updateDynamic("billingGroupProperties")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBillingGroupResponse]
    }
  }

  /** The input for the DescribeCACertificate operation.
    */
  @js.native
  trait DescribeCACertificateRequest extends js.Object {
    var certificateId: CertificateId
  }

  object DescribeCACertificateRequest {
    @inline
    def apply(
        certificateId: CertificateId
    ): DescribeCACertificateRequest = {
      val __obj = js.Dynamic.literal(
        "certificateId" -> certificateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeCACertificateRequest]
    }
  }

  /** The output from the DescribeCACertificate operation.
    */
  @js.native
  trait DescribeCACertificateResponse extends js.Object {
    var certificateDescription: js.UndefOr[CACertificateDescription]
    var registrationConfig: js.UndefOr[RegistrationConfig]
  }

  object DescribeCACertificateResponse {
    @inline
    def apply(
        certificateDescription: js.UndefOr[CACertificateDescription] = js.undefined,
        registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
    ): DescribeCACertificateResponse = {
      val __obj = js.Dynamic.literal()
      certificateDescription.foreach(__v => __obj.updateDynamic("certificateDescription")(__v.asInstanceOf[js.Any]))
      registrationConfig.foreach(__v => __obj.updateDynamic("registrationConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCACertificateResponse]
    }
  }

  /** The input for the DescribeCertificate operation.
    */
  @js.native
  trait DescribeCertificateRequest extends js.Object {
    var certificateId: CertificateId
  }

  object DescribeCertificateRequest {
    @inline
    def apply(
        certificateId: CertificateId
    ): DescribeCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "certificateId" -> certificateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeCertificateRequest]
    }
  }

  /** The output of the DescribeCertificate operation.
    */
  @js.native
  trait DescribeCertificateResponse extends js.Object {
    var certificateDescription: js.UndefOr[CertificateDescription]
  }

  object DescribeCertificateResponse {
    @inline
    def apply(
        certificateDescription: js.UndefOr[CertificateDescription] = js.undefined
    ): DescribeCertificateResponse = {
      val __obj = js.Dynamic.literal()
      certificateDescription.foreach(__v => __obj.updateDynamic("certificateDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCertificateResponse]
    }
  }

  @js.native
  trait DescribeCustomMetricRequest extends js.Object {
    var metricName: MetricName
  }

  object DescribeCustomMetricRequest {
    @inline
    def apply(
        metricName: MetricName
    ): DescribeCustomMetricRequest = {
      val __obj = js.Dynamic.literal(
        "metricName" -> metricName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeCustomMetricRequest]
    }
  }

  @js.native
  trait DescribeCustomMetricResponse extends js.Object {
    var creationDate: js.UndefOr[Timestamp]
    var displayName: js.UndefOr[CustomMetricDisplayName]
    var lastModifiedDate: js.UndefOr[Timestamp]
    var metricArn: js.UndefOr[CustomMetricArn]
    var metricName: js.UndefOr[MetricName]
    var metricType: js.UndefOr[CustomMetricType]
  }

  object DescribeCustomMetricResponse {
    @inline
    def apply(
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        displayName: js.UndefOr[CustomMetricDisplayName] = js.undefined,
        lastModifiedDate: js.UndefOr[Timestamp] = js.undefined,
        metricArn: js.UndefOr[CustomMetricArn] = js.undefined,
        metricName: js.UndefOr[MetricName] = js.undefined,
        metricType: js.UndefOr[CustomMetricType] = js.undefined
    ): DescribeCustomMetricResponse = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      metricArn.foreach(__v => __obj.updateDynamic("metricArn")(__v.asInstanceOf[js.Any]))
      metricName.foreach(__v => __obj.updateDynamic("metricName")(__v.asInstanceOf[js.Any]))
      metricType.foreach(__v => __obj.updateDynamic("metricType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCustomMetricResponse]
    }
  }

  @js.native
  trait DescribeDefaultAuthorizerRequest extends js.Object

  object DescribeDefaultAuthorizerRequest {
    @inline
    def apply(): DescribeDefaultAuthorizerRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeDefaultAuthorizerRequest]
    }
  }

  @js.native
  trait DescribeDefaultAuthorizerResponse extends js.Object {
    var authorizerDescription: js.UndefOr[AuthorizerDescription]
  }

  object DescribeDefaultAuthorizerResponse {
    @inline
    def apply(
        authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined
    ): DescribeDefaultAuthorizerResponse = {
      val __obj = js.Dynamic.literal()
      authorizerDescription.foreach(__v => __obj.updateDynamic("authorizerDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDefaultAuthorizerResponse]
    }
  }

  @js.native
  trait DescribeDetectMitigationActionsTaskRequest extends js.Object {
    var taskId: MitigationActionsTaskId
  }

  object DescribeDetectMitigationActionsTaskRequest {
    @inline
    def apply(
        taskId: MitigationActionsTaskId
    ): DescribeDetectMitigationActionsTaskRequest = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDetectMitigationActionsTaskRequest]
    }
  }

  @js.native
  trait DescribeDetectMitigationActionsTaskResponse extends js.Object {
    var taskSummary: js.UndefOr[DetectMitigationActionsTaskSummary]
  }

  object DescribeDetectMitigationActionsTaskResponse {
    @inline
    def apply(
        taskSummary: js.UndefOr[DetectMitigationActionsTaskSummary] = js.undefined
    ): DescribeDetectMitigationActionsTaskResponse = {
      val __obj = js.Dynamic.literal()
      taskSummary.foreach(__v => __obj.updateDynamic("taskSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectMitigationActionsTaskResponse]
    }
  }

  @js.native
  trait DescribeDimensionRequest extends js.Object {
    var name: DimensionName
  }

  object DescribeDimensionRequest {
    @inline
    def apply(
        name: DimensionName
    ): DescribeDimensionRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDimensionRequest]
    }
  }

  @js.native
  trait DescribeDimensionResponse extends js.Object {
    var arn: js.UndefOr[DimensionArn]
    var creationDate: js.UndefOr[Timestamp]
    var lastModifiedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[DimensionName]
    var stringValues: js.UndefOr[DimensionStringValues]
    var `type`: js.UndefOr[DimensionType]
  }

  object DescribeDimensionResponse {
    @inline
    def apply(
        arn: js.UndefOr[DimensionArn] = js.undefined,
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        lastModifiedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[DimensionName] = js.undefined,
        stringValues: js.UndefOr[DimensionStringValues] = js.undefined,
        `type`: js.UndefOr[DimensionType] = js.undefined
    ): DescribeDimensionResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      stringValues.foreach(__v => __obj.updateDynamic("stringValues")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDimensionResponse]
    }
  }

  @js.native
  trait DescribeDomainConfigurationRequest extends js.Object {
    var domainConfigurationName: ReservedDomainConfigurationName
  }

  object DescribeDomainConfigurationRequest {
    @inline
    def apply(
        domainConfigurationName: ReservedDomainConfigurationName
    ): DescribeDomainConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "domainConfigurationName" -> domainConfigurationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDomainConfigurationRequest]
    }
  }

  @js.native
  trait DescribeDomainConfigurationResponse extends js.Object {
    var authorizerConfig: js.UndefOr[AuthorizerConfig]
    var domainConfigurationArn: js.UndefOr[DomainConfigurationArn]
    var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName]
    var domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus]
    var domainName: js.UndefOr[DomainName]
    var domainType: js.UndefOr[DomainType]
    var lastStatusChangeDate: js.UndefOr[DateType]
    var serverCertificates: js.UndefOr[ServerCertificates]
    var serviceType: js.UndefOr[ServiceType]
  }

  object DescribeDomainConfigurationResponse {
    @inline
    def apply(
        authorizerConfig: js.UndefOr[AuthorizerConfig] = js.undefined,
        domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.undefined,
        domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName] = js.undefined,
        domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus] = js.undefined,
        domainName: js.UndefOr[DomainName] = js.undefined,
        domainType: js.UndefOr[DomainType] = js.undefined,
        lastStatusChangeDate: js.UndefOr[DateType] = js.undefined,
        serverCertificates: js.UndefOr[ServerCertificates] = js.undefined,
        serviceType: js.UndefOr[ServiceType] = js.undefined
    ): DescribeDomainConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      authorizerConfig.foreach(__v => __obj.updateDynamic("authorizerConfig")(__v.asInstanceOf[js.Any]))
      domainConfigurationArn.foreach(__v => __obj.updateDynamic("domainConfigurationArn")(__v.asInstanceOf[js.Any]))
      domainConfigurationName.foreach(__v => __obj.updateDynamic("domainConfigurationName")(__v.asInstanceOf[js.Any]))
      domainConfigurationStatus.foreach(__v => __obj.updateDynamic("domainConfigurationStatus")(__v.asInstanceOf[js.Any]))
      domainName.foreach(__v => __obj.updateDynamic("domainName")(__v.asInstanceOf[js.Any]))
      domainType.foreach(__v => __obj.updateDynamic("domainType")(__v.asInstanceOf[js.Any]))
      lastStatusChangeDate.foreach(__v => __obj.updateDynamic("lastStatusChangeDate")(__v.asInstanceOf[js.Any]))
      serverCertificates.foreach(__v => __obj.updateDynamic("serverCertificates")(__v.asInstanceOf[js.Any]))
      serviceType.foreach(__v => __obj.updateDynamic("serviceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainConfigurationResponse]
    }
  }

  /** The input for the DescribeEndpoint operation.
    */
  @js.native
  trait DescribeEndpointRequest extends js.Object {
    var endpointType: js.UndefOr[EndpointType]
  }

  object DescribeEndpointRequest {
    @inline
    def apply(
        endpointType: js.UndefOr[EndpointType] = js.undefined
    ): DescribeEndpointRequest = {
      val __obj = js.Dynamic.literal()
      endpointType.foreach(__v => __obj.updateDynamic("endpointType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointRequest]
    }
  }

  /** The output from the DescribeEndpoint operation.
    */
  @js.native
  trait DescribeEndpointResponse extends js.Object {
    var endpointAddress: js.UndefOr[EndpointAddress]
  }

  object DescribeEndpointResponse {
    @inline
    def apply(
        endpointAddress: js.UndefOr[EndpointAddress] = js.undefined
    ): DescribeEndpointResponse = {
      val __obj = js.Dynamic.literal()
      endpointAddress.foreach(__v => __obj.updateDynamic("endpointAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointResponse]
    }
  }

  @js.native
  trait DescribeEventConfigurationsRequest extends js.Object

  object DescribeEventConfigurationsRequest {
    @inline
    def apply(): DescribeEventConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeEventConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeEventConfigurationsResponse extends js.Object {
    var creationDate: js.UndefOr[CreationDate]
    var eventConfigurations: js.UndefOr[EventConfigurations]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
  }

  object DescribeEventConfigurationsResponse {
    @inline
    def apply(
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        eventConfigurations: js.UndefOr[EventConfigurations] = js.undefined,
        lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined
    ): DescribeEventConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      eventConfigurations.foreach(__v => __obj.updateDynamic("eventConfigurations")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventConfigurationsResponse]
    }
  }

  @js.native
  trait DescribeIndexRequest extends js.Object {
    var indexName: IndexName
  }

  object DescribeIndexRequest {
    @inline
    def apply(
        indexName: IndexName
    ): DescribeIndexRequest = {
      val __obj = js.Dynamic.literal(
        "indexName" -> indexName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeIndexRequest]
    }
  }

  @js.native
  trait DescribeIndexResponse extends js.Object {
    var indexName: js.UndefOr[IndexName]
    var indexStatus: js.UndefOr[IndexStatus]
    var schema: js.UndefOr[IndexSchema]
  }

  object DescribeIndexResponse {
    @inline
    def apply(
        indexName: js.UndefOr[IndexName] = js.undefined,
        indexStatus: js.UndefOr[IndexStatus] = js.undefined,
        schema: js.UndefOr[IndexSchema] = js.undefined
    ): DescribeIndexResponse = {
      val __obj = js.Dynamic.literal()
      indexName.foreach(__v => __obj.updateDynamic("indexName")(__v.asInstanceOf[js.Any]))
      indexStatus.foreach(__v => __obj.updateDynamic("indexStatus")(__v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIndexResponse]
    }
  }

  @js.native
  trait DescribeJobExecutionRequest extends js.Object {
    var jobId: JobId
    var thingName: ThingName
    var executionNumber: js.UndefOr[ExecutionNumber]
  }

  object DescribeJobExecutionRequest {
    @inline
    def apply(
        jobId: JobId,
        thingName: ThingName,
        executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
    ): DescribeJobExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      executionNumber.foreach(__v => __obj.updateDynamic("executionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobExecutionRequest]
    }
  }

  @js.native
  trait DescribeJobExecutionResponse extends js.Object {
    var execution: js.UndefOr[JobExecution]
  }

  object DescribeJobExecutionResponse {
    @inline
    def apply(
        execution: js.UndefOr[JobExecution] = js.undefined
    ): DescribeJobExecutionResponse = {
      val __obj = js.Dynamic.literal()
      execution.foreach(__v => __obj.updateDynamic("execution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobExecutionResponse]
    }
  }

  @js.native
  trait DescribeJobRequest extends js.Object {
    var jobId: JobId
  }

  object DescribeJobRequest {
    @inline
    def apply(
        jobId: JobId
    ): DescribeJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeJobRequest]
    }
  }

  @js.native
  trait DescribeJobResponse extends js.Object {
    var documentSource: js.UndefOr[JobDocumentSource]
    var job: js.UndefOr[Job]
  }

  object DescribeJobResponse {
    @inline
    def apply(
        documentSource: js.UndefOr[JobDocumentSource] = js.undefined,
        job: js.UndefOr[Job] = js.undefined
    ): DescribeJobResponse = {
      val __obj = js.Dynamic.literal()
      documentSource.foreach(__v => __obj.updateDynamic("documentSource")(__v.asInstanceOf[js.Any]))
      job.foreach(__v => __obj.updateDynamic("job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobResponse]
    }
  }

  @js.native
  trait DescribeMitigationActionRequest extends js.Object {
    var actionName: MitigationActionName
  }

  object DescribeMitigationActionRequest {
    @inline
    def apply(
        actionName: MitigationActionName
    ): DescribeMitigationActionRequest = {
      val __obj = js.Dynamic.literal(
        "actionName" -> actionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeMitigationActionRequest]
    }
  }

  @js.native
  trait DescribeMitigationActionResponse extends js.Object {
    var actionArn: js.UndefOr[MitigationActionArn]
    var actionId: js.UndefOr[MitigationActionId]
    var actionName: js.UndefOr[MitigationActionName]
    var actionParams: js.UndefOr[MitigationActionParams]
    var actionType: js.UndefOr[MitigationActionType]
    var creationDate: js.UndefOr[Timestamp]
    var lastModifiedDate: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[RoleArn]
  }

  object DescribeMitigationActionResponse {
    @inline
    def apply(
        actionArn: js.UndefOr[MitigationActionArn] = js.undefined,
        actionId: js.UndefOr[MitigationActionId] = js.undefined,
        actionName: js.UndefOr[MitigationActionName] = js.undefined,
        actionParams: js.UndefOr[MitigationActionParams] = js.undefined,
        actionType: js.UndefOr[MitigationActionType] = js.undefined,
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        lastModifiedDate: js.UndefOr[Timestamp] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeMitigationActionResponse = {
      val __obj = js.Dynamic.literal()
      actionArn.foreach(__v => __obj.updateDynamic("actionArn")(__v.asInstanceOf[js.Any]))
      actionId.foreach(__v => __obj.updateDynamic("actionId")(__v.asInstanceOf[js.Any]))
      actionName.foreach(__v => __obj.updateDynamic("actionName")(__v.asInstanceOf[js.Any]))
      actionParams.foreach(__v => __obj.updateDynamic("actionParams")(__v.asInstanceOf[js.Any]))
      actionType.foreach(__v => __obj.updateDynamic("actionType")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMitigationActionResponse]
    }
  }

  @js.native
  trait DescribeProvisioningTemplateRequest extends js.Object {
    var templateName: TemplateName
  }

  object DescribeProvisioningTemplateRequest {
    @inline
    def apply(
        templateName: TemplateName
    ): DescribeProvisioningTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeProvisioningTemplateRequest]
    }
  }

  @js.native
  trait DescribeProvisioningTemplateResponse extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var defaultVersionId: js.UndefOr[TemplateVersionId]
    var description: js.UndefOr[TemplateDescription]
    var enabled: js.UndefOr[Enabled]
    var lastModifiedDate: js.UndefOr[DateType]
    var preProvisioningHook: js.UndefOr[ProvisioningHook]
    var provisioningRoleArn: js.UndefOr[RoleArn]
    var templateArn: js.UndefOr[TemplateArn]
    var templateBody: js.UndefOr[TemplateBody]
    var templateName: js.UndefOr[TemplateName]
  }

  object DescribeProvisioningTemplateResponse {
    @inline
    def apply(
        creationDate: js.UndefOr[DateType] = js.undefined,
        defaultVersionId: js.UndefOr[TemplateVersionId] = js.undefined,
        description: js.UndefOr[TemplateDescription] = js.undefined,
        enabled: js.UndefOr[Enabled] = js.undefined,
        lastModifiedDate: js.UndefOr[DateType] = js.undefined,
        preProvisioningHook: js.UndefOr[ProvisioningHook] = js.undefined,
        provisioningRoleArn: js.UndefOr[RoleArn] = js.undefined,
        templateArn: js.UndefOr[TemplateArn] = js.undefined,
        templateBody: js.UndefOr[TemplateBody] = js.undefined,
        templateName: js.UndefOr[TemplateName] = js.undefined
    ): DescribeProvisioningTemplateResponse = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      defaultVersionId.foreach(__v => __obj.updateDynamic("defaultVersionId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      preProvisioningHook.foreach(__v => __obj.updateDynamic("preProvisioningHook")(__v.asInstanceOf[js.Any]))
      provisioningRoleArn.foreach(__v => __obj.updateDynamic("provisioningRoleArn")(__v.asInstanceOf[js.Any]))
      templateArn.foreach(__v => __obj.updateDynamic("templateArn")(__v.asInstanceOf[js.Any]))
      templateBody.foreach(__v => __obj.updateDynamic("templateBody")(__v.asInstanceOf[js.Any]))
      templateName.foreach(__v => __obj.updateDynamic("templateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisioningTemplateResponse]
    }
  }

  @js.native
  trait DescribeProvisioningTemplateVersionRequest extends js.Object {
    var templateName: TemplateName
    var versionId: TemplateVersionId
  }

  object DescribeProvisioningTemplateVersionRequest {
    @inline
    def apply(
        templateName: TemplateName,
        versionId: TemplateVersionId
    ): DescribeProvisioningTemplateVersionRequest = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any],
        "versionId" -> versionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeProvisioningTemplateVersionRequest]
    }
  }

  @js.native
  trait DescribeProvisioningTemplateVersionResponse extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var templateBody: js.UndefOr[TemplateBody]
    var versionId: js.UndefOr[TemplateVersionId]
  }

  object DescribeProvisioningTemplateVersionResponse {
    @inline
    def apply(
        creationDate: js.UndefOr[DateType] = js.undefined,
        isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
        templateBody: js.UndefOr[TemplateBody] = js.undefined,
        versionId: js.UndefOr[TemplateVersionId] = js.undefined
    ): DescribeProvisioningTemplateVersionResponse = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      isDefaultVersion.foreach(__v => __obj.updateDynamic("isDefaultVersion")(__v.asInstanceOf[js.Any]))
      templateBody.foreach(__v => __obj.updateDynamic("templateBody")(__v.asInstanceOf[js.Any]))
      versionId.foreach(__v => __obj.updateDynamic("versionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisioningTemplateVersionResponse]
    }
  }

  @js.native
  trait DescribeRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
  }

  object DescribeRoleAliasRequest {
    @inline
    def apply(
        roleAlias: RoleAlias
    ): DescribeRoleAliasRequest = {
      val __obj = js.Dynamic.literal(
        "roleAlias" -> roleAlias.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRoleAliasRequest]
    }
  }

  @js.native
  trait DescribeRoleAliasResponse extends js.Object {
    var roleAliasDescription: js.UndefOr[RoleAliasDescription]
  }

  object DescribeRoleAliasResponse {
    @inline
    def apply(
        roleAliasDescription: js.UndefOr[RoleAliasDescription] = js.undefined
    ): DescribeRoleAliasResponse = {
      val __obj = js.Dynamic.literal()
      roleAliasDescription.foreach(__v => __obj.updateDynamic("roleAliasDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRoleAliasResponse]
    }
  }

  @js.native
  trait DescribeScheduledAuditRequest extends js.Object {
    var scheduledAuditName: ScheduledAuditName
  }

  object DescribeScheduledAuditRequest {
    @inline
    def apply(
        scheduledAuditName: ScheduledAuditName
    ): DescribeScheduledAuditRequest = {
      val __obj = js.Dynamic.literal(
        "scheduledAuditName" -> scheduledAuditName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeScheduledAuditRequest]
    }
  }

  @js.native
  trait DescribeScheduledAuditResponse extends js.Object {
    var dayOfMonth: js.UndefOr[DayOfMonth]
    var dayOfWeek: js.UndefOr[DayOfWeek]
    var frequency: js.UndefOr[AuditFrequency]
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
    var targetCheckNames: js.UndefOr[TargetAuditCheckNames]
  }

  object DescribeScheduledAuditResponse {
    @inline
    def apply(
        dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
        frequency: js.UndefOr[AuditFrequency] = js.undefined,
        scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined,
        scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined,
        targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined
    ): DescribeScheduledAuditResponse = {
      val __obj = js.Dynamic.literal()
      dayOfMonth.foreach(__v => __obj.updateDynamic("dayOfMonth")(__v.asInstanceOf[js.Any]))
      dayOfWeek.foreach(__v => __obj.updateDynamic("dayOfWeek")(__v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.updateDynamic("frequency")(__v.asInstanceOf[js.Any]))
      scheduledAuditArn.foreach(__v => __obj.updateDynamic("scheduledAuditArn")(__v.asInstanceOf[js.Any]))
      scheduledAuditName.foreach(__v => __obj.updateDynamic("scheduledAuditName")(__v.asInstanceOf[js.Any]))
      targetCheckNames.foreach(__v => __obj.updateDynamic("targetCheckNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScheduledAuditResponse]
    }
  }

  @js.native
  trait DescribeSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
  }

  object DescribeSecurityProfileRequest {
    @inline
    def apply(
        securityProfileName: SecurityProfileName
    ): DescribeSecurityProfileRequest = {
      val __obj = js.Dynamic.literal(
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSecurityProfileRequest]
    }
  }

  @js.native
  trait DescribeSecurityProfileResponse extends js.Object {
    var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList]
    var additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List]
    var alertTargets: js.UndefOr[AlertTargets]
    var behaviors: js.UndefOr[Behaviors]
    var creationDate: js.UndefOr[Timestamp]
    var lastModifiedDate: js.UndefOr[Timestamp]
    var securityProfileArn: js.UndefOr[SecurityProfileArn]
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var version: js.UndefOr[Version]
  }

  object DescribeSecurityProfileResponse {
    @inline
    def apply(
        additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined,
        additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List] = js.undefined,
        alertTargets: js.UndefOr[AlertTargets] = js.undefined,
        behaviors: js.UndefOr[Behaviors] = js.undefined,
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        lastModifiedDate: js.UndefOr[Timestamp] = js.undefined,
        securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined,
        securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): DescribeSecurityProfileResponse = {
      val __obj = js.Dynamic.literal()
      additionalMetricsToRetain.foreach(__v => __obj.updateDynamic("additionalMetricsToRetain")(__v.asInstanceOf[js.Any]))
      additionalMetricsToRetainV2.foreach(__v => __obj.updateDynamic("additionalMetricsToRetainV2")(__v.asInstanceOf[js.Any]))
      alertTargets.foreach(__v => __obj.updateDynamic("alertTargets")(__v.asInstanceOf[js.Any]))
      behaviors.foreach(__v => __obj.updateDynamic("behaviors")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      securityProfileArn.foreach(__v => __obj.updateDynamic("securityProfileArn")(__v.asInstanceOf[js.Any]))
      securityProfileDescription.foreach(__v => __obj.updateDynamic("securityProfileDescription")(__v.asInstanceOf[js.Any]))
      securityProfileName.foreach(__v => __obj.updateDynamic("securityProfileName")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSecurityProfileResponse]
    }
  }

  @js.native
  trait DescribeStreamRequest extends js.Object {
    var streamId: StreamId
  }

  object DescribeStreamRequest {
    @inline
    def apply(
        streamId: StreamId
    ): DescribeStreamRequest = {
      val __obj = js.Dynamic.literal(
        "streamId" -> streamId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeStreamRequest]
    }
  }

  @js.native
  trait DescribeStreamResponse extends js.Object {
    var streamInfo: js.UndefOr[StreamInfo]
  }

  object DescribeStreamResponse {
    @inline
    def apply(
        streamInfo: js.UndefOr[StreamInfo] = js.undefined
    ): DescribeStreamResponse = {
      val __obj = js.Dynamic.literal()
      streamInfo.foreach(__v => __obj.updateDynamic("streamInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStreamResponse]
    }
  }

  @js.native
  trait DescribeThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
  }

  object DescribeThingGroupRequest {
    @inline
    def apply(
        thingGroupName: ThingGroupName
    ): DescribeThingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeThingGroupRequest]
    }
  }

  @js.native
  trait DescribeThingGroupResponse extends js.Object {
    var indexName: js.UndefOr[IndexName]
    var queryString: js.UndefOr[QueryString]
    var queryVersion: js.UndefOr[QueryVersion]
    var status: js.UndefOr[DynamicGroupStatus]
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var thingGroupMetadata: js.UndefOr[ThingGroupMetadata]
    var thingGroupName: js.UndefOr[ThingGroupName]
    var thingGroupProperties: js.UndefOr[ThingGroupProperties]
    var version: js.UndefOr[Version]
  }

  object DescribeThingGroupResponse {
    @inline
    def apply(
        indexName: js.UndefOr[IndexName] = js.undefined,
        queryString: js.UndefOr[QueryString] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined,
        status: js.UndefOr[DynamicGroupStatus] = js.undefined,
        thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
        thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
        thingGroupMetadata: js.UndefOr[ThingGroupMetadata] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
        thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): DescribeThingGroupResponse = {
      val __obj = js.Dynamic.literal()
      indexName.foreach(__v => __obj.updateDynamic("indexName")(__v.asInstanceOf[js.Any]))
      queryString.foreach(__v => __obj.updateDynamic("queryString")(__v.asInstanceOf[js.Any]))
      queryVersion.foreach(__v => __obj.updateDynamic("queryVersion")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      thingGroupArn.foreach(__v => __obj.updateDynamic("thingGroupArn")(__v.asInstanceOf[js.Any]))
      thingGroupId.foreach(__v => __obj.updateDynamic("thingGroupId")(__v.asInstanceOf[js.Any]))
      thingGroupMetadata.foreach(__v => __obj.updateDynamic("thingGroupMetadata")(__v.asInstanceOf[js.Any]))
      thingGroupName.foreach(__v => __obj.updateDynamic("thingGroupName")(__v.asInstanceOf[js.Any]))
      thingGroupProperties.foreach(__v => __obj.updateDynamic("thingGroupProperties")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeThingGroupResponse]
    }
  }

  @js.native
  trait DescribeThingRegistrationTaskRequest extends js.Object {
    var taskId: TaskId
  }

  object DescribeThingRegistrationTaskRequest {
    @inline
    def apply(
        taskId: TaskId
    ): DescribeThingRegistrationTaskRequest = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeThingRegistrationTaskRequest]
    }
  }

  @js.native
  trait DescribeThingRegistrationTaskResponse extends js.Object {
    var creationDate: js.UndefOr[CreationDate]
    var failureCount: js.UndefOr[Count]
    var inputFileBucket: js.UndefOr[RegistryS3BucketName]
    var inputFileKey: js.UndefOr[RegistryS3KeyName]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
    var message: js.UndefOr[ErrorMessage]
    var percentageProgress: js.UndefOr[Percentage]
    var roleArn: js.UndefOr[RoleArn]
    var status: js.UndefOr[Status]
    var successCount: js.UndefOr[Count]
    var taskId: js.UndefOr[TaskId]
    var templateBody: js.UndefOr[TemplateBody]
  }

  object DescribeThingRegistrationTaskResponse {
    @inline
    def apply(
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        failureCount: js.UndefOr[Count] = js.undefined,
        inputFileBucket: js.UndefOr[RegistryS3BucketName] = js.undefined,
        inputFileKey: js.UndefOr[RegistryS3KeyName] = js.undefined,
        lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined,
        message: js.UndefOr[ErrorMessage] = js.undefined,
        percentageProgress: js.UndefOr[Percentage] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        successCount: js.UndefOr[Count] = js.undefined,
        taskId: js.UndefOr[TaskId] = js.undefined,
        templateBody: js.UndefOr[TemplateBody] = js.undefined
    ): DescribeThingRegistrationTaskResponse = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      failureCount.foreach(__v => __obj.updateDynamic("failureCount")(__v.asInstanceOf[js.Any]))
      inputFileBucket.foreach(__v => __obj.updateDynamic("inputFileBucket")(__v.asInstanceOf[js.Any]))
      inputFileKey.foreach(__v => __obj.updateDynamic("inputFileKey")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      percentageProgress.foreach(__v => __obj.updateDynamic("percentageProgress")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      successCount.foreach(__v => __obj.updateDynamic("successCount")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      templateBody.foreach(__v => __obj.updateDynamic("templateBody")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeThingRegistrationTaskResponse]
    }
  }

  /** The input for the DescribeThing operation.
    */
  @js.native
  trait DescribeThingRequest extends js.Object {
    var thingName: ThingName
  }

  object DescribeThingRequest {
    @inline
    def apply(
        thingName: ThingName
    ): DescribeThingRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeThingRequest]
    }
  }

  /** The output from the DescribeThing operation.
    */
  @js.native
  trait DescribeThingResponse extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var billingGroupName: js.UndefOr[BillingGroupName]
    var defaultClientId: js.UndefOr[ClientId]
    var thingArn: js.UndefOr[ThingArn]
    var thingId: js.UndefOr[ThingId]
    var thingName: js.UndefOr[ThingName]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var version: js.UndefOr[Version]
  }

  object DescribeThingResponse {
    @inline
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined,
        billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
        defaultClientId: js.UndefOr[ClientId] = js.undefined,
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingId: js.UndefOr[ThingId] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): DescribeThingResponse = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      billingGroupName.foreach(__v => __obj.updateDynamic("billingGroupName")(__v.asInstanceOf[js.Any]))
      defaultClientId.foreach(__v => __obj.updateDynamic("defaultClientId")(__v.asInstanceOf[js.Any]))
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      thingId.foreach(__v => __obj.updateDynamic("thingId")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      thingTypeName.foreach(__v => __obj.updateDynamic("thingTypeName")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeThingResponse]
    }
  }

  /** The input for the DescribeThingType operation.
    */
  @js.native
  trait DescribeThingTypeRequest extends js.Object {
    var thingTypeName: ThingTypeName
  }

  object DescribeThingTypeRequest {
    @inline
    def apply(
        thingTypeName: ThingTypeName
    ): DescribeThingTypeRequest = {
      val __obj = js.Dynamic.literal(
        "thingTypeName" -> thingTypeName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeThingTypeRequest]
    }
  }

  /** The output for the DescribeThingType operation.
    */
  @js.native
  trait DescribeThingTypeResponse extends js.Object {
    var thingTypeArn: js.UndefOr[ThingTypeArn]
    var thingTypeId: js.UndefOr[ThingTypeId]
    var thingTypeMetadata: js.UndefOr[ThingTypeMetadata]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var thingTypeProperties: js.UndefOr[ThingTypeProperties]
  }

  object DescribeThingTypeResponse {
    @inline
    def apply(
        thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined,
        thingTypeId: js.UndefOr[ThingTypeId] = js.undefined,
        thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
        thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
    ): DescribeThingTypeResponse = {
      val __obj = js.Dynamic.literal()
      thingTypeArn.foreach(__v => __obj.updateDynamic("thingTypeArn")(__v.asInstanceOf[js.Any]))
      thingTypeId.foreach(__v => __obj.updateDynamic("thingTypeId")(__v.asInstanceOf[js.Any]))
      thingTypeMetadata.foreach(__v => __obj.updateDynamic("thingTypeMetadata")(__v.asInstanceOf[js.Any]))
      thingTypeName.foreach(__v => __obj.updateDynamic("thingTypeName")(__v.asInstanceOf[js.Any]))
      thingTypeProperties.foreach(__v => __obj.updateDynamic("thingTypeProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeThingTypeResponse]
    }
  }

  /** Describes the location of the updated firmware.
    */
  @js.native
  trait Destination extends js.Object {
    var s3Destination: js.UndefOr[S3Destination]
  }

  object Destination {
    @inline
    def apply(
        s3Destination: js.UndefOr[S3Destination] = js.undefined
    ): Destination = {
      val __obj = js.Dynamic.literal()
      s3Destination.foreach(__v => __obj.updateDynamic("s3Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Destination]
    }
  }

  @js.native
  trait DetachPolicyRequest extends js.Object {
    var policyName: PolicyName
    var target: PolicyTarget
  }

  object DetachPolicyRequest {
    @inline
    def apply(
        policyName: PolicyName,
        target: PolicyTarget
    ): DetachPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyName" -> policyName.asInstanceOf[js.Any],
        "target" -> target.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetachPolicyRequest]
    }
  }

  /** The input for the DetachPrincipalPolicy operation.
    */
  @js.native
  trait DetachPrincipalPolicyRequest extends js.Object {
    var policyName: PolicyName
    var principal: Principal
  }

  object DetachPrincipalPolicyRequest {
    @inline
    def apply(
        policyName: PolicyName,
        principal: Principal
    ): DetachPrincipalPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyName" -> policyName.asInstanceOf[js.Any],
        "principal" -> principal.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetachPrincipalPolicyRequest]
    }
  }

  @js.native
  trait DetachSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var securityProfileTargetArn: SecurityProfileTargetArn
  }

  object DetachSecurityProfileRequest {
    @inline
    def apply(
        securityProfileName: SecurityProfileName,
        securityProfileTargetArn: SecurityProfileTargetArn
    ): DetachSecurityProfileRequest = {
      val __obj = js.Dynamic.literal(
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any],
        "securityProfileTargetArn" -> securityProfileTargetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetachSecurityProfileRequest]
    }
  }

  @js.native
  trait DetachSecurityProfileResponse extends js.Object

  object DetachSecurityProfileResponse {
    @inline
    def apply(): DetachSecurityProfileResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetachSecurityProfileResponse]
    }
  }

  /** The input for the DetachThingPrincipal operation.
    */
  @js.native
  trait DetachThingPrincipalRequest extends js.Object {
    var principal: Principal
    var thingName: ThingName
  }

  object DetachThingPrincipalRequest {
    @inline
    def apply(
        principal: Principal,
        thingName: ThingName
    ): DetachThingPrincipalRequest = {
      val __obj = js.Dynamic.literal(
        "principal" -> principal.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetachThingPrincipalRequest]
    }
  }

  /** The output from the DetachThingPrincipal operation.
    */
  @js.native
  trait DetachThingPrincipalResponse extends js.Object

  object DetachThingPrincipalResponse {
    @inline
    def apply(): DetachThingPrincipalResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetachThingPrincipalResponse]
    }
  }

  /** Describes which mitigation actions should be executed.
    */
  @js.native
  trait DetectMitigationActionExecution extends js.Object {
    var actionName: js.UndefOr[MitigationActionName]
    var errorCode: js.UndefOr[DetectMitigationActionExecutionErrorCode]
    var executionEndDate: js.UndefOr[Timestamp]
    var executionStartDate: js.UndefOr[Timestamp]
    var message: js.UndefOr[ErrorMessage]
    var status: js.UndefOr[DetectMitigationActionExecutionStatus]
    var taskId: js.UndefOr[MitigationActionsTaskId]
    var thingName: js.UndefOr[DeviceDefenderThingName]
    var violationId: js.UndefOr[ViolationId]
  }

  object DetectMitigationActionExecution {
    @inline
    def apply(
        actionName: js.UndefOr[MitigationActionName] = js.undefined,
        errorCode: js.UndefOr[DetectMitigationActionExecutionErrorCode] = js.undefined,
        executionEndDate: js.UndefOr[Timestamp] = js.undefined,
        executionStartDate: js.UndefOr[Timestamp] = js.undefined,
        message: js.UndefOr[ErrorMessage] = js.undefined,
        status: js.UndefOr[DetectMitigationActionExecutionStatus] = js.undefined,
        taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined,
        thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined,
        violationId: js.UndefOr[ViolationId] = js.undefined
    ): DetectMitigationActionExecution = {
      val __obj = js.Dynamic.literal()
      actionName.foreach(__v => __obj.updateDynamic("actionName")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      executionEndDate.foreach(__v => __obj.updateDynamic("executionEndDate")(__v.asInstanceOf[js.Any]))
      executionStartDate.foreach(__v => __obj.updateDynamic("executionStartDate")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      violationId.foreach(__v => __obj.updateDynamic("violationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectMitigationActionExecution]
    }
  }

  @js.native
  sealed trait DetectMitigationActionExecutionStatus extends js.Any
  object DetectMitigationActionExecutionStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DetectMitigationActionExecutionStatus]
    val SUCCESSFUL = "SUCCESSFUL".asInstanceOf[DetectMitigationActionExecutionStatus]
    val FAILED = "FAILED".asInstanceOf[DetectMitigationActionExecutionStatus]
    val SKIPPED = "SKIPPED".asInstanceOf[DetectMitigationActionExecutionStatus]

    @inline def values = js.Array(IN_PROGRESS, SUCCESSFUL, FAILED, SKIPPED)
  }

  /** The statistics of a mitigation action task.
    */
  @js.native
  trait DetectMitigationActionsTaskStatistics extends js.Object {
    var actionsExecuted: js.UndefOr[GenericLongValue]
    var actionsFailed: js.UndefOr[GenericLongValue]
    var actionsSkipped: js.UndefOr[GenericLongValue]
  }

  object DetectMitigationActionsTaskStatistics {
    @inline
    def apply(
        actionsExecuted: js.UndefOr[GenericLongValue] = js.undefined,
        actionsFailed: js.UndefOr[GenericLongValue] = js.undefined,
        actionsSkipped: js.UndefOr[GenericLongValue] = js.undefined
    ): DetectMitigationActionsTaskStatistics = {
      val __obj = js.Dynamic.literal()
      actionsExecuted.foreach(__v => __obj.updateDynamic("actionsExecuted")(__v.asInstanceOf[js.Any]))
      actionsFailed.foreach(__v => __obj.updateDynamic("actionsFailed")(__v.asInstanceOf[js.Any]))
      actionsSkipped.foreach(__v => __obj.updateDynamic("actionsSkipped")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectMitigationActionsTaskStatistics]
    }
  }

  @js.native
  sealed trait DetectMitigationActionsTaskStatus extends js.Any
  object DetectMitigationActionsTaskStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DetectMitigationActionsTaskStatus]
    val SUCCESSFUL = "SUCCESSFUL".asInstanceOf[DetectMitigationActionsTaskStatus]
    val FAILED = "FAILED".asInstanceOf[DetectMitigationActionsTaskStatus]
    val CANCELED = "CANCELED".asInstanceOf[DetectMitigationActionsTaskStatus]

    @inline def values = js.Array(IN_PROGRESS, SUCCESSFUL, FAILED, CANCELED)
  }

  /** The summary of the mitigation action tasks.
    */
  @js.native
  trait DetectMitigationActionsTaskSummary extends js.Object {
    var actionsDefinition: js.UndefOr[MitigationActionList]
    var onlyActiveViolationsIncluded: js.UndefOr[PrimitiveBoolean]
    var suppressedAlertsIncluded: js.UndefOr[PrimitiveBoolean]
    var target: js.UndefOr[DetectMitigationActionsTaskTarget]
    var taskEndTime: js.UndefOr[Timestamp]
    var taskId: js.UndefOr[MitigationActionsTaskId]
    var taskStartTime: js.UndefOr[Timestamp]
    var taskStatistics: js.UndefOr[DetectMitigationActionsTaskStatistics]
    var taskStatus: js.UndefOr[DetectMitigationActionsTaskStatus]
    var violationEventOccurrenceRange: js.UndefOr[ViolationEventOccurrenceRange]
  }

  object DetectMitigationActionsTaskSummary {
    @inline
    def apply(
        actionsDefinition: js.UndefOr[MitigationActionList] = js.undefined,
        onlyActiveViolationsIncluded: js.UndefOr[PrimitiveBoolean] = js.undefined,
        suppressedAlertsIncluded: js.UndefOr[PrimitiveBoolean] = js.undefined,
        target: js.UndefOr[DetectMitigationActionsTaskTarget] = js.undefined,
        taskEndTime: js.UndefOr[Timestamp] = js.undefined,
        taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined,
        taskStartTime: js.UndefOr[Timestamp] = js.undefined,
        taskStatistics: js.UndefOr[DetectMitigationActionsTaskStatistics] = js.undefined,
        taskStatus: js.UndefOr[DetectMitigationActionsTaskStatus] = js.undefined,
        violationEventOccurrenceRange: js.UndefOr[ViolationEventOccurrenceRange] = js.undefined
    ): DetectMitigationActionsTaskSummary = {
      val __obj = js.Dynamic.literal()
      actionsDefinition.foreach(__v => __obj.updateDynamic("actionsDefinition")(__v.asInstanceOf[js.Any]))
      onlyActiveViolationsIncluded.foreach(__v => __obj.updateDynamic("onlyActiveViolationsIncluded")(__v.asInstanceOf[js.Any]))
      suppressedAlertsIncluded.foreach(__v => __obj.updateDynamic("suppressedAlertsIncluded")(__v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      taskEndTime.foreach(__v => __obj.updateDynamic("taskEndTime")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      taskStartTime.foreach(__v => __obj.updateDynamic("taskStartTime")(__v.asInstanceOf[js.Any]))
      taskStatistics.foreach(__v => __obj.updateDynamic("taskStatistics")(__v.asInstanceOf[js.Any]))
      taskStatus.foreach(__v => __obj.updateDynamic("taskStatus")(__v.asInstanceOf[js.Any]))
      violationEventOccurrenceRange.foreach(__v => __obj.updateDynamic("violationEventOccurrenceRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectMitigationActionsTaskSummary]
    }
  }

  /** The target of a mitigation action task.
    */
  @js.native
  trait DetectMitigationActionsTaskTarget extends js.Object {
    var behaviorName: js.UndefOr[BehaviorName]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var violationIds: js.UndefOr[TargetViolationIdsForDetectMitigationActions]
  }

  object DetectMitigationActionsTaskTarget {
    @inline
    def apply(
        behaviorName: js.UndefOr[BehaviorName] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        violationIds: js.UndefOr[TargetViolationIdsForDetectMitigationActions] = js.undefined
    ): DetectMitigationActionsTaskTarget = {
      val __obj = js.Dynamic.literal()
      behaviorName.foreach(__v => __obj.updateDynamic("behaviorName")(__v.asInstanceOf[js.Any]))
      securityProfileName.foreach(__v => __obj.updateDynamic("securityProfileName")(__v.asInstanceOf[js.Any]))
      violationIds.foreach(__v => __obj.updateDynamic("violationIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectMitigationActionsTaskTarget]
    }
  }

  @js.native
  sealed trait DeviceCertificateUpdateAction extends js.Any
  object DeviceCertificateUpdateAction {
    val DEACTIVATE = "DEACTIVATE".asInstanceOf[DeviceCertificateUpdateAction]

    @inline def values = js.Array(DEACTIVATE)
  }

  @js.native
  sealed trait DimensionType extends js.Any
  object DimensionType {
    val TOPIC_FILTER = "TOPIC_FILTER".asInstanceOf[DimensionType]

    @inline def values = js.Array(TOPIC_FILTER)
  }

  @js.native
  sealed trait DimensionValueOperator extends js.Any
  object DimensionValueOperator {
    val IN = "IN".asInstanceOf[DimensionValueOperator]
    val NOT_IN = "NOT_IN".asInstanceOf[DimensionValueOperator]

    @inline def values = js.Array(IN, NOT_IN)
  }

  /** The input for the DisableTopicRuleRequest operation.
    */
  @js.native
  trait DisableTopicRuleRequest extends js.Object {
    var ruleName: RuleName
  }

  object DisableTopicRuleRequest {
    @inline
    def apply(
        ruleName: RuleName
    ): DisableTopicRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableTopicRuleRequest]
    }
  }

  @js.native
  sealed trait DomainConfigurationStatus extends js.Any
  object DomainConfigurationStatus {
    val ENABLED = "ENABLED".asInstanceOf[DomainConfigurationStatus]
    val DISABLED = "DISABLED".asInstanceOf[DomainConfigurationStatus]

    @inline def values = js.Array(ENABLED, DISABLED)
  }

  /** The summary of a domain configuration. A domain configuration specifies custom IoT-specific information about a domain. A domain configuration can be associated with an AWS-managed domain (for example, dbc123defghijk.iot.us-west-2.amazonaws.com), a customer managed domain, or a default endpoint.
    * * Data
    * * Jobs
    * * CredentialProvider
    * '''Note:'''The domain configuration feature is in public preview and is subject to change.
    */
  @js.native
  trait DomainConfigurationSummary extends js.Object {
    var domainConfigurationArn: js.UndefOr[DomainConfigurationArn]
    var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName]
    var serviceType: js.UndefOr[ServiceType]
  }

  object DomainConfigurationSummary {
    @inline
    def apply(
        domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.undefined,
        domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName] = js.undefined,
        serviceType: js.UndefOr[ServiceType] = js.undefined
    ): DomainConfigurationSummary = {
      val __obj = js.Dynamic.literal()
      domainConfigurationArn.foreach(__v => __obj.updateDynamic("domainConfigurationArn")(__v.asInstanceOf[js.Any]))
      domainConfigurationName.foreach(__v => __obj.updateDynamic("domainConfigurationName")(__v.asInstanceOf[js.Any]))
      serviceType.foreach(__v => __obj.updateDynamic("serviceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainConfigurationSummary]
    }
  }

  @js.native
  sealed trait DomainType extends js.Any
  object DomainType {
    val ENDPOINT = "ENDPOINT".asInstanceOf[DomainType]
    val AWS_MANAGED = "AWS_MANAGED".asInstanceOf[DomainType]
    val CUSTOMER_MANAGED = "CUSTOMER_MANAGED".asInstanceOf[DomainType]

    @inline def values = js.Array(ENDPOINT, AWS_MANAGED, CUSTOMER_MANAGED)
  }

  @js.native
  sealed trait DynamicGroupStatus extends js.Any
  object DynamicGroupStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[DynamicGroupStatus]
    val BUILDING = "BUILDING".asInstanceOf[DynamicGroupStatus]
    val REBUILDING = "REBUILDING".asInstanceOf[DynamicGroupStatus]

    @inline def values = js.Array(ACTIVE, BUILDING, REBUILDING)
  }

  /** Describes an action to write to a DynamoDB table.
    * The <code>tableName</code>, <code>hashKeyField</code>, and <code>rangeKeyField</code> values must match the values used when you created the table.
    * The <code>hashKeyValue</code> and <code>rangeKeyvalue</code> fields use a substitution template syntax. These templates provide data at runtime. The syntax is as follows: {<i>sql-expression</i>}.
    * You can specify any valid expression in a WHERE or SELECT clause, including JSON properties, comparisons, calculations, and functions. For example, the following field uses the third level of the topic:
    * <code>"hashKeyValue": "{topic(3)}"</code>
    * The following field uses the timestamp:
    * <code>"rangeKeyValue": "{timestamp()}"</code>
    */
  @js.native
  trait DynamoDBAction extends js.Object {
    var hashKeyField: HashKeyField
    var hashKeyValue: HashKeyValue
    var roleArn: AwsArn
    var tableName: TableName
    var hashKeyType: js.UndefOr[DynamoKeyType]
    var operation: js.UndefOr[DynamoOperation]
    var payloadField: js.UndefOr[PayloadField]
    var rangeKeyField: js.UndefOr[RangeKeyField]
    var rangeKeyType: js.UndefOr[DynamoKeyType]
    var rangeKeyValue: js.UndefOr[RangeKeyValue]
  }

  object DynamoDBAction {
    @inline
    def apply(
        hashKeyField: HashKeyField,
        hashKeyValue: HashKeyValue,
        roleArn: AwsArn,
        tableName: TableName,
        hashKeyType: js.UndefOr[DynamoKeyType] = js.undefined,
        operation: js.UndefOr[DynamoOperation] = js.undefined,
        payloadField: js.UndefOr[PayloadField] = js.undefined,
        rangeKeyField: js.UndefOr[RangeKeyField] = js.undefined,
        rangeKeyType: js.UndefOr[DynamoKeyType] = js.undefined,
        rangeKeyValue: js.UndefOr[RangeKeyValue] = js.undefined
    ): DynamoDBAction = {
      val __obj = js.Dynamic.literal(
        "hashKeyField" -> hashKeyField.asInstanceOf[js.Any],
        "hashKeyValue" -> hashKeyValue.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "tableName" -> tableName.asInstanceOf[js.Any]
      )

      hashKeyType.foreach(__v => __obj.updateDynamic("hashKeyType")(__v.asInstanceOf[js.Any]))
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      payloadField.foreach(__v => __obj.updateDynamic("payloadField")(__v.asInstanceOf[js.Any]))
      rangeKeyField.foreach(__v => __obj.updateDynamic("rangeKeyField")(__v.asInstanceOf[js.Any]))
      rangeKeyType.foreach(__v => __obj.updateDynamic("rangeKeyType")(__v.asInstanceOf[js.Any]))
      rangeKeyValue.foreach(__v => __obj.updateDynamic("rangeKeyValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DynamoDBAction]
    }
  }

  /** Describes an action to write to a DynamoDB table.
    * This DynamoDB action writes each attribute in the message payload into it's own column in the DynamoDB table.
    */
  @js.native
  trait DynamoDBv2Action extends js.Object {
    var putItem: PutItemInput
    var roleArn: AwsArn
  }

  object DynamoDBv2Action {
    @inline
    def apply(
        putItem: PutItemInput,
        roleArn: AwsArn
    ): DynamoDBv2Action = {
      val __obj = js.Dynamic.literal(
        "putItem" -> putItem.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DynamoDBv2Action]
    }
  }

  @js.native
  sealed trait DynamoKeyType extends js.Any
  object DynamoKeyType {
    val STRING = "STRING".asInstanceOf[DynamoKeyType]
    val NUMBER = "NUMBER".asInstanceOf[DynamoKeyType]

    @inline def values = js.Array(STRING, NUMBER)
  }

  /** The policy that has the effect on the authorization results.
    */
  @js.native
  trait EffectivePolicy extends js.Object {
    var policyArn: js.UndefOr[PolicyArn]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
  }

  object EffectivePolicy {
    @inline
    def apply(
        policyArn: js.UndefOr[PolicyArn] = js.undefined,
        policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
        policyName: js.UndefOr[PolicyName] = js.undefined
    ): EffectivePolicy = {
      val __obj = js.Dynamic.literal()
      policyArn.foreach(__v => __obj.updateDynamic("policyArn")(__v.asInstanceOf[js.Any]))
      policyDocument.foreach(__v => __obj.updateDynamic("policyDocument")(__v.asInstanceOf[js.Any]))
      policyName.foreach(__v => __obj.updateDynamic("policyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EffectivePolicy]
    }
  }

  /** Describes an action that writes data to an Amazon Elasticsearch Service domain.
    */
  @js.native
  trait ElasticsearchAction extends js.Object {
    var endpoint: ElasticsearchEndpoint
    var id: ElasticsearchId
    var index: ElasticsearchIndex
    var roleArn: AwsArn
    var `type`: ElasticsearchType
  }

  object ElasticsearchAction {
    @inline
    def apply(
        endpoint: ElasticsearchEndpoint,
        id: ElasticsearchId,
        index: ElasticsearchIndex,
        roleArn: AwsArn,
        `type`: ElasticsearchType
    ): ElasticsearchAction = {
      val __obj = js.Dynamic.literal(
        "endpoint" -> endpoint.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "index" -> index.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ElasticsearchAction]
    }
  }

  /** Parameters used when defining a mitigation action that enable AWS IoT logging.
    */
  @js.native
  trait EnableIoTLoggingParams extends js.Object {
    var logLevel: LogLevel
    var roleArnForLogging: RoleArn
  }

  object EnableIoTLoggingParams {
    @inline
    def apply(
        logLevel: LogLevel,
        roleArnForLogging: RoleArn
    ): EnableIoTLoggingParams = {
      val __obj = js.Dynamic.literal(
        "logLevel" -> logLevel.asInstanceOf[js.Any],
        "roleArnForLogging" -> roleArnForLogging.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableIoTLoggingParams]
    }
  }

  /** The input for the EnableTopicRuleRequest operation.
    */
  @js.native
  trait EnableTopicRuleRequest extends js.Object {
    var ruleName: RuleName
  }

  object EnableTopicRuleRequest {
    @inline
    def apply(
        ruleName: RuleName
    ): EnableTopicRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableTopicRuleRequest]
    }
  }

  /** Error information.
    */
  @js.native
  trait ErrorInfo extends js.Object {
    var code: js.UndefOr[Code]
    var message: js.UndefOr[OTAUpdateErrorMessage]
  }

  object ErrorInfo {
    @inline
    def apply(
        code: js.UndefOr[Code] = js.undefined,
        message: js.UndefOr[OTAUpdateErrorMessage] = js.undefined
    ): ErrorInfo = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorInfo]
    }
  }

  @js.native
  sealed trait EventType extends js.Any
  object EventType {
    val THING = "THING".asInstanceOf[EventType]
    val THING_GROUP = "THING_GROUP".asInstanceOf[EventType]
    val THING_TYPE = "THING_TYPE".asInstanceOf[EventType]
    val THING_GROUP_MEMBERSHIP = "THING_GROUP_MEMBERSHIP".asInstanceOf[EventType]
    val THING_GROUP_HIERARCHY = "THING_GROUP_HIERARCHY".asInstanceOf[EventType]
    val THING_TYPE_ASSOCIATION = "THING_TYPE_ASSOCIATION".asInstanceOf[EventType]
    val JOB = "JOB".asInstanceOf[EventType]
    val JOB_EXECUTION = "JOB_EXECUTION".asInstanceOf[EventType]
    val POLICY = "POLICY".asInstanceOf[EventType]
    val CERTIFICATE = "CERTIFICATE".asInstanceOf[EventType]
    val CA_CERTIFICATE = "CA_CERTIFICATE".asInstanceOf[EventType]

    @inline def values = js.Array(THING, THING_GROUP, THING_TYPE, THING_GROUP_MEMBERSHIP, THING_GROUP_HIERARCHY, THING_TYPE_ASSOCIATION, JOB, JOB_EXECUTION, POLICY, CERTIFICATE, CA_CERTIFICATE)
  }

  /** Information that explicitly denies authorization.
    */
  @js.native
  trait ExplicitDeny extends js.Object {
    var policies: js.UndefOr[Policies]
  }

  object ExplicitDeny {
    @inline
    def apply(
        policies: js.UndefOr[Policies] = js.undefined
    ): ExplicitDeny = {
      val __obj = js.Dynamic.literal()
      policies.foreach(__v => __obj.updateDynamic("policies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExplicitDeny]
    }
  }

  /** Allows you to create an exponential rate of rollout for a job.
    */
  @js.native
  trait ExponentialRolloutRate extends js.Object {
    var baseRatePerMinute: RolloutRatePerMinute
    var incrementFactor: IncrementFactor
    var rateIncreaseCriteria: RateIncreaseCriteria
  }

  object ExponentialRolloutRate {
    @inline
    def apply(
        baseRatePerMinute: RolloutRatePerMinute,
        incrementFactor: IncrementFactor,
        rateIncreaseCriteria: RateIncreaseCriteria
    ): ExponentialRolloutRate = {
      val __obj = js.Dynamic.literal(
        "baseRatePerMinute" -> baseRatePerMinute.asInstanceOf[js.Any],
        "incrementFactor" -> incrementFactor.asInstanceOf[js.Any],
        "rateIncreaseCriteria" -> rateIncreaseCriteria.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExponentialRolloutRate]
    }
  }

  /** Describes the name and data type at a field.
    */
  @js.native
  trait Field extends js.Object {
    var name: js.UndefOr[FieldName]
    var `type`: js.UndefOr[FieldType]
  }

  object Field {
    @inline
    def apply(
        name: js.UndefOr[FieldName] = js.undefined,
        `type`: js.UndefOr[FieldType] = js.undefined
    ): Field = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Field]
    }
  }

  @js.native
  sealed trait FieldType extends js.Any
  object FieldType {
    val Number = "Number".asInstanceOf[FieldType]
    val String = "String".asInstanceOf[FieldType]
    val Boolean = "Boolean".asInstanceOf[FieldType]

    @inline def values = js.Array(Number, String, Boolean)
  }

  /** The location of the OTA update.
    */
  @js.native
  trait FileLocation extends js.Object {
    var s3Location: js.UndefOr[S3Location]
    var stream: js.UndefOr[Stream]
  }

  object FileLocation {
    @inline
    def apply(
        s3Location: js.UndefOr[S3Location] = js.undefined,
        stream: js.UndefOr[Stream] = js.undefined
    ): FileLocation = {
      val __obj = js.Dynamic.literal()
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      stream.foreach(__v => __obj.updateDynamic("stream")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileLocation]
    }
  }

  /** Describes an action that writes data to an Amazon Kinesis Firehose stream.
    */
  @js.native
  trait FirehoseAction extends js.Object {
    var deliveryStreamName: DeliveryStreamName
    var roleArn: AwsArn
    var batchMode: js.UndefOr[BatchMode]
    var separator: js.UndefOr[FirehoseSeparator]
  }

  object FirehoseAction {
    @inline
    def apply(
        deliveryStreamName: DeliveryStreamName,
        roleArn: AwsArn,
        batchMode: js.UndefOr[BatchMode] = js.undefined,
        separator: js.UndefOr[FirehoseSeparator] = js.undefined
    ): FirehoseAction = {
      val __obj = js.Dynamic.literal(
        "deliveryStreamName" -> deliveryStreamName.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      batchMode.foreach(__v => __obj.updateDynamic("batchMode")(__v.asInstanceOf[js.Any]))
      separator.foreach(__v => __obj.updateDynamic("separator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirehoseAction]
    }
  }

  @js.native
  trait GetBehaviorModelTrainingSummariesRequest extends js.Object {
    var maxResults: js.UndefOr[TinyMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var securityProfileName: js.UndefOr[SecurityProfileName]
  }

  object GetBehaviorModelTrainingSummariesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[TinyMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
    ): GetBehaviorModelTrainingSummariesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      securityProfileName.foreach(__v => __obj.updateDynamic("securityProfileName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBehaviorModelTrainingSummariesRequest]
    }
  }

  @js.native
  trait GetBehaviorModelTrainingSummariesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[BehaviorModelTrainingSummaries]
  }

  object GetBehaviorModelTrainingSummariesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[BehaviorModelTrainingSummaries] = js.undefined
    ): GetBehaviorModelTrainingSummariesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.updateDynamic("summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBehaviorModelTrainingSummariesResponse]
    }
  }

  @js.native
  trait GetCardinalityRequest extends js.Object {
    var queryString: QueryString
    var aggregationField: js.UndefOr[AggregationField]
    var indexName: js.UndefOr[IndexName]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  object GetCardinalityRequest {
    @inline
    def apply(
        queryString: QueryString,
        aggregationField: js.UndefOr[AggregationField] = js.undefined,
        indexName: js.UndefOr[IndexName] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined
    ): GetCardinalityRequest = {
      val __obj = js.Dynamic.literal(
        "queryString" -> queryString.asInstanceOf[js.Any]
      )

      aggregationField.foreach(__v => __obj.updateDynamic("aggregationField")(__v.asInstanceOf[js.Any]))
      indexName.foreach(__v => __obj.updateDynamic("indexName")(__v.asInstanceOf[js.Any]))
      queryVersion.foreach(__v => __obj.updateDynamic("queryVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCardinalityRequest]
    }
  }

  @js.native
  trait GetCardinalityResponse extends js.Object {
    var cardinality: js.UndefOr[Count]
  }

  object GetCardinalityResponse {
    @inline
    def apply(
        cardinality: js.UndefOr[Count] = js.undefined
    ): GetCardinalityResponse = {
      val __obj = js.Dynamic.literal()
      cardinality.foreach(__v => __obj.updateDynamic("cardinality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCardinalityResponse]
    }
  }

  @js.native
  trait GetEffectivePoliciesRequest extends js.Object {
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId]
    var principal: js.UndefOr[Principal]
    var thingName: js.UndefOr[ThingName]
  }

  object GetEffectivePoliciesRequest {
    @inline
    def apply(
        cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined,
        principal: js.UndefOr[Principal] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): GetEffectivePoliciesRequest = {
      val __obj = js.Dynamic.literal()
      cognitoIdentityPoolId.foreach(__v => __obj.updateDynamic("cognitoIdentityPoolId")(__v.asInstanceOf[js.Any]))
      principal.foreach(__v => __obj.updateDynamic("principal")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEffectivePoliciesRequest]
    }
  }

  @js.native
  trait GetEffectivePoliciesResponse extends js.Object {
    var effectivePolicies: js.UndefOr[EffectivePolicies]
  }

  object GetEffectivePoliciesResponse {
    @inline
    def apply(
        effectivePolicies: js.UndefOr[EffectivePolicies] = js.undefined
    ): GetEffectivePoliciesResponse = {
      val __obj = js.Dynamic.literal()
      effectivePolicies.foreach(__v => __obj.updateDynamic("effectivePolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEffectivePoliciesResponse]
    }
  }

  @js.native
  trait GetIndexingConfigurationRequest extends js.Object

  object GetIndexingConfigurationRequest {
    @inline
    def apply(): GetIndexingConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetIndexingConfigurationRequest]
    }
  }

  @js.native
  trait GetIndexingConfigurationResponse extends js.Object {
    var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration]
    var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration]
  }

  object GetIndexingConfigurationResponse {
    @inline
    def apply(
        thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.undefined,
        thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.undefined
    ): GetIndexingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      thingGroupIndexingConfiguration.foreach(__v => __obj.updateDynamic("thingGroupIndexingConfiguration")(__v.asInstanceOf[js.Any]))
      thingIndexingConfiguration.foreach(__v => __obj.updateDynamic("thingIndexingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIndexingConfigurationResponse]
    }
  }

  @js.native
  trait GetJobDocumentRequest extends js.Object {
    var jobId: JobId
  }

  object GetJobDocumentRequest {
    @inline
    def apply(
        jobId: JobId
    ): GetJobDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJobDocumentRequest]
    }
  }

  @js.native
  trait GetJobDocumentResponse extends js.Object {
    var document: js.UndefOr[JobDocument]
  }

  object GetJobDocumentResponse {
    @inline
    def apply(
        document: js.UndefOr[JobDocument] = js.undefined
    ): GetJobDocumentResponse = {
      val __obj = js.Dynamic.literal()
      document.foreach(__v => __obj.updateDynamic("document")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobDocumentResponse]
    }
  }

  /** The input for the GetLoggingOptions operation.
    */
  @js.native
  trait GetLoggingOptionsRequest extends js.Object

  object GetLoggingOptionsRequest {
    @inline
    def apply(): GetLoggingOptionsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLoggingOptionsRequest]
    }
  }

  /** The output from the GetLoggingOptions operation.
    */
  @js.native
  trait GetLoggingOptionsResponse extends js.Object {
    var logLevel: js.UndefOr[LogLevel]
    var roleArn: js.UndefOr[AwsArn]
  }

  object GetLoggingOptionsResponse {
    @inline
    def apply(
        logLevel: js.UndefOr[LogLevel] = js.undefined,
        roleArn: js.UndefOr[AwsArn] = js.undefined
    ): GetLoggingOptionsResponse = {
      val __obj = js.Dynamic.literal()
      logLevel.foreach(__v => __obj.updateDynamic("logLevel")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLoggingOptionsResponse]
    }
  }

  @js.native
  trait GetOTAUpdateRequest extends js.Object {
    var otaUpdateId: OTAUpdateId
  }

  object GetOTAUpdateRequest {
    @inline
    def apply(
        otaUpdateId: OTAUpdateId
    ): GetOTAUpdateRequest = {
      val __obj = js.Dynamic.literal(
        "otaUpdateId" -> otaUpdateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetOTAUpdateRequest]
    }
  }

  @js.native
  trait GetOTAUpdateResponse extends js.Object {
    var otaUpdateInfo: js.UndefOr[OTAUpdateInfo]
  }

  object GetOTAUpdateResponse {
    @inline
    def apply(
        otaUpdateInfo: js.UndefOr[OTAUpdateInfo] = js.undefined
    ): GetOTAUpdateResponse = {
      val __obj = js.Dynamic.literal()
      otaUpdateInfo.foreach(__v => __obj.updateDynamic("otaUpdateInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOTAUpdateResponse]
    }
  }

  @js.native
  trait GetPercentilesRequest extends js.Object {
    var queryString: QueryString
    var aggregationField: js.UndefOr[AggregationField]
    var indexName: js.UndefOr[IndexName]
    var percents: js.UndefOr[PercentList]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  object GetPercentilesRequest {
    @inline
    def apply(
        queryString: QueryString,
        aggregationField: js.UndefOr[AggregationField] = js.undefined,
        indexName: js.UndefOr[IndexName] = js.undefined,
        percents: js.UndefOr[PercentList] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined
    ): GetPercentilesRequest = {
      val __obj = js.Dynamic.literal(
        "queryString" -> queryString.asInstanceOf[js.Any]
      )

      aggregationField.foreach(__v => __obj.updateDynamic("aggregationField")(__v.asInstanceOf[js.Any]))
      indexName.foreach(__v => __obj.updateDynamic("indexName")(__v.asInstanceOf[js.Any]))
      percents.foreach(__v => __obj.updateDynamic("percents")(__v.asInstanceOf[js.Any]))
      queryVersion.foreach(__v => __obj.updateDynamic("queryVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPercentilesRequest]
    }
  }

  @js.native
  trait GetPercentilesResponse extends js.Object {
    var percentiles: js.UndefOr[Percentiles]
  }

  object GetPercentilesResponse {
    @inline
    def apply(
        percentiles: js.UndefOr[Percentiles] = js.undefined
    ): GetPercentilesResponse = {
      val __obj = js.Dynamic.literal()
      percentiles.foreach(__v => __obj.updateDynamic("percentiles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPercentilesResponse]
    }
  }

  /** The input for the GetPolicy operation.
    */
  @js.native
  trait GetPolicyRequest extends js.Object {
    var policyName: PolicyName
  }

  object GetPolicyRequest {
    @inline
    def apply(
        policyName: PolicyName
    ): GetPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyName" -> policyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPolicyRequest]
    }
  }

  /** The output from the GetPolicy operation.
    */
  @js.native
  trait GetPolicyResponse extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var defaultVersionId: js.UndefOr[PolicyVersionId]
    var generationId: js.UndefOr[GenerationId]
    var lastModifiedDate: js.UndefOr[DateType]
    var policyArn: js.UndefOr[PolicyArn]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
  }

  object GetPolicyResponse {
    @inline
    def apply(
        creationDate: js.UndefOr[DateType] = js.undefined,
        defaultVersionId: js.UndefOr[PolicyVersionId] = js.undefined,
        generationId: js.UndefOr[GenerationId] = js.undefined,
        lastModifiedDate: js.UndefOr[DateType] = js.undefined,
        policyArn: js.UndefOr[PolicyArn] = js.undefined,
        policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
        policyName: js.UndefOr[PolicyName] = js.undefined
    ): GetPolicyResponse = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      defaultVersionId.foreach(__v => __obj.updateDynamic("defaultVersionId")(__v.asInstanceOf[js.Any]))
      generationId.foreach(__v => __obj.updateDynamic("generationId")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      policyArn.foreach(__v => __obj.updateDynamic("policyArn")(__v.asInstanceOf[js.Any]))
      policyDocument.foreach(__v => __obj.updateDynamic("policyDocument")(__v.asInstanceOf[js.Any]))
      policyName.foreach(__v => __obj.updateDynamic("policyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPolicyResponse]
    }
  }

  /** The input for the GetPolicyVersion operation.
    */
  @js.native
  trait GetPolicyVersionRequest extends js.Object {
    var policyName: PolicyName
    var policyVersionId: PolicyVersionId
  }

  object GetPolicyVersionRequest {
    @inline
    def apply(
        policyName: PolicyName,
        policyVersionId: PolicyVersionId
    ): GetPolicyVersionRequest = {
      val __obj = js.Dynamic.literal(
        "policyName" -> policyName.asInstanceOf[js.Any],
        "policyVersionId" -> policyVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPolicyVersionRequest]
    }
  }

  /** The output from the GetPolicyVersion operation.
    */
  @js.native
  trait GetPolicyVersionResponse extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var generationId: js.UndefOr[GenerationId]
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var lastModifiedDate: js.UndefOr[DateType]
    var policyArn: js.UndefOr[PolicyArn]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
    var policyVersionId: js.UndefOr[PolicyVersionId]
  }

  object GetPolicyVersionResponse {
    @inline
    def apply(
        creationDate: js.UndefOr[DateType] = js.undefined,
        generationId: js.UndefOr[GenerationId] = js.undefined,
        isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
        lastModifiedDate: js.UndefOr[DateType] = js.undefined,
        policyArn: js.UndefOr[PolicyArn] = js.undefined,
        policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
        policyName: js.UndefOr[PolicyName] = js.undefined,
        policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
    ): GetPolicyVersionResponse = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      generationId.foreach(__v => __obj.updateDynamic("generationId")(__v.asInstanceOf[js.Any]))
      isDefaultVersion.foreach(__v => __obj.updateDynamic("isDefaultVersion")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      policyArn.foreach(__v => __obj.updateDynamic("policyArn")(__v.asInstanceOf[js.Any]))
      policyDocument.foreach(__v => __obj.updateDynamic("policyDocument")(__v.asInstanceOf[js.Any]))
      policyName.foreach(__v => __obj.updateDynamic("policyName")(__v.asInstanceOf[js.Any]))
      policyVersionId.foreach(__v => __obj.updateDynamic("policyVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPolicyVersionResponse]
    }
  }

  /** The input to the GetRegistrationCode operation.
    */
  @js.native
  trait GetRegistrationCodeRequest extends js.Object

  object GetRegistrationCodeRequest {
    @inline
    def apply(): GetRegistrationCodeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRegistrationCodeRequest]
    }
  }

  /** The output from the GetRegistrationCode operation.
    */
  @js.native
  trait GetRegistrationCodeResponse extends js.Object {
    var registrationCode: js.UndefOr[RegistrationCode]
  }

  object GetRegistrationCodeResponse {
    @inline
    def apply(
        registrationCode: js.UndefOr[RegistrationCode] = js.undefined
    ): GetRegistrationCodeResponse = {
      val __obj = js.Dynamic.literal()
      registrationCode.foreach(__v => __obj.updateDynamic("registrationCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRegistrationCodeResponse]
    }
  }

  @js.native
  trait GetStatisticsRequest extends js.Object {
    var queryString: QueryString
    var aggregationField: js.UndefOr[AggregationField]
    var indexName: js.UndefOr[IndexName]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  object GetStatisticsRequest {
    @inline
    def apply(
        queryString: QueryString,
        aggregationField: js.UndefOr[AggregationField] = js.undefined,
        indexName: js.UndefOr[IndexName] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined
    ): GetStatisticsRequest = {
      val __obj = js.Dynamic.literal(
        "queryString" -> queryString.asInstanceOf[js.Any]
      )

      aggregationField.foreach(__v => __obj.updateDynamic("aggregationField")(__v.asInstanceOf[js.Any]))
      indexName.foreach(__v => __obj.updateDynamic("indexName")(__v.asInstanceOf[js.Any]))
      queryVersion.foreach(__v => __obj.updateDynamic("queryVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStatisticsRequest]
    }
  }

  @js.native
  trait GetStatisticsResponse extends js.Object {
    var statistics: js.UndefOr[Statistics]
  }

  object GetStatisticsResponse {
    @inline
    def apply(
        statistics: js.UndefOr[Statistics] = js.undefined
    ): GetStatisticsResponse = {
      val __obj = js.Dynamic.literal()
      statistics.foreach(__v => __obj.updateDynamic("statistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStatisticsResponse]
    }
  }

  @js.native
  trait GetTopicRuleDestinationRequest extends js.Object {
    var arn: AwsArn
  }

  object GetTopicRuleDestinationRequest {
    @inline
    def apply(
        arn: AwsArn
    ): GetTopicRuleDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTopicRuleDestinationRequest]
    }
  }

  @js.native
  trait GetTopicRuleDestinationResponse extends js.Object {
    var topicRuleDestination: js.UndefOr[TopicRuleDestination]
  }

  object GetTopicRuleDestinationResponse {
    @inline
    def apply(
        topicRuleDestination: js.UndefOr[TopicRuleDestination] = js.undefined
    ): GetTopicRuleDestinationResponse = {
      val __obj = js.Dynamic.literal()
      topicRuleDestination.foreach(__v => __obj.updateDynamic("topicRuleDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTopicRuleDestinationResponse]
    }
  }

  /** The input for the GetTopicRule operation.
    */
  @js.native
  trait GetTopicRuleRequest extends js.Object {
    var ruleName: RuleName
  }

  object GetTopicRuleRequest {
    @inline
    def apply(
        ruleName: RuleName
    ): GetTopicRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTopicRuleRequest]
    }
  }

  /** The output from the GetTopicRule operation.
    */
  @js.native
  trait GetTopicRuleResponse extends js.Object {
    var rule: js.UndefOr[TopicRule]
    var ruleArn: js.UndefOr[RuleArn]
  }

  object GetTopicRuleResponse {
    @inline
    def apply(
        rule: js.UndefOr[TopicRule] = js.undefined,
        ruleArn: js.UndefOr[RuleArn] = js.undefined
    ): GetTopicRuleResponse = {
      val __obj = js.Dynamic.literal()
      rule.foreach(__v => __obj.updateDynamic("rule")(__v.asInstanceOf[js.Any]))
      ruleArn.foreach(__v => __obj.updateDynamic("ruleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTopicRuleResponse]
    }
  }

  @js.native
  trait GetV2LoggingOptionsRequest extends js.Object

  object GetV2LoggingOptionsRequest {
    @inline
    def apply(): GetV2LoggingOptionsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetV2LoggingOptionsRequest]
    }
  }

  @js.native
  trait GetV2LoggingOptionsResponse extends js.Object {
    var defaultLogLevel: js.UndefOr[LogLevel]
    var disableAllLogs: js.UndefOr[DisableAllLogs]
    var roleArn: js.UndefOr[AwsArn]
  }

  object GetV2LoggingOptionsResponse {
    @inline
    def apply(
        defaultLogLevel: js.UndefOr[LogLevel] = js.undefined,
        disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined,
        roleArn: js.UndefOr[AwsArn] = js.undefined
    ): GetV2LoggingOptionsResponse = {
      val __obj = js.Dynamic.literal()
      defaultLogLevel.foreach(__v => __obj.updateDynamic("defaultLogLevel")(__v.asInstanceOf[js.Any]))
      disableAllLogs.foreach(__v => __obj.updateDynamic("disableAllLogs")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetV2LoggingOptionsResponse]
    }
  }

  /** The name and ARN of a group.
    */
  @js.native
  trait GroupNameAndArn extends js.Object {
    var groupArn: js.UndefOr[ThingGroupArn]
    var groupName: js.UndefOr[ThingGroupName]
  }

  object GroupNameAndArn {
    @inline
    def apply(
        groupArn: js.UndefOr[ThingGroupArn] = js.undefined,
        groupName: js.UndefOr[ThingGroupName] = js.undefined
    ): GroupNameAndArn = {
      val __obj = js.Dynamic.literal()
      groupArn.foreach(__v => __obj.updateDynamic("groupArn")(__v.asInstanceOf[js.Any]))
      groupName.foreach(__v => __obj.updateDynamic("groupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupNameAndArn]
    }
  }

  /** Send data to an HTTPS endpoint.
    */
  @js.native
  trait HttpAction extends js.Object {
    var url: Url
    var auth: js.UndefOr[HttpAuthorization]
    var confirmationUrl: js.UndefOr[Url]
    var headers: js.UndefOr[HeaderList]
  }

  object HttpAction {
    @inline
    def apply(
        url: Url,
        auth: js.UndefOr[HttpAuthorization] = js.undefined,
        confirmationUrl: js.UndefOr[Url] = js.undefined,
        headers: js.UndefOr[HeaderList] = js.undefined
    ): HttpAction = {
      val __obj = js.Dynamic.literal(
        "url" -> url.asInstanceOf[js.Any]
      )

      auth.foreach(__v => __obj.updateDynamic("auth")(__v.asInstanceOf[js.Any]))
      confirmationUrl.foreach(__v => __obj.updateDynamic("confirmationUrl")(__v.asInstanceOf[js.Any]))
      headers.foreach(__v => __obj.updateDynamic("headers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpAction]
    }
  }

  /** The HTTP action header.
    */
  @js.native
  trait HttpActionHeader extends js.Object {
    var key: HeaderKey
    var value: HeaderValue
  }

  object HttpActionHeader {
    @inline
    def apply(
        key: HeaderKey,
        value: HeaderValue
    ): HttpActionHeader = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HttpActionHeader]
    }
  }

  /** The authorization method used to send messages.
    */
  @js.native
  trait HttpAuthorization extends js.Object {
    var sigv4: js.UndefOr[SigV4Authorization]
  }

  object HttpAuthorization {
    @inline
    def apply(
        sigv4: js.UndefOr[SigV4Authorization] = js.undefined
    ): HttpAuthorization = {
      val __obj = js.Dynamic.literal()
      sigv4.foreach(__v => __obj.updateDynamic("sigv4")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpAuthorization]
    }
  }

  /** Specifies the HTTP context to use for the test authorizer request.
    */
  @js.native
  trait HttpContext extends js.Object {
    var headers: js.UndefOr[HttpHeaders]
    var queryString: js.UndefOr[HttpQueryString]
  }

  object HttpContext {
    @inline
    def apply(
        headers: js.UndefOr[HttpHeaders] = js.undefined,
        queryString: js.UndefOr[HttpQueryString] = js.undefined
    ): HttpContext = {
      val __obj = js.Dynamic.literal()
      headers.foreach(__v => __obj.updateDynamic("headers")(__v.asInstanceOf[js.Any]))
      queryString.foreach(__v => __obj.updateDynamic("queryString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpContext]
    }
  }

  /** HTTP URL destination configuration used by the topic rule's HTTP action.
    */
  @js.native
  trait HttpUrlDestinationConfiguration extends js.Object {
    var confirmationUrl: Url
  }

  object HttpUrlDestinationConfiguration {
    @inline
    def apply(
        confirmationUrl: Url
    ): HttpUrlDestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "confirmationUrl" -> confirmationUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HttpUrlDestinationConfiguration]
    }
  }

  /** HTTP URL destination properties.
    */
  @js.native
  trait HttpUrlDestinationProperties extends js.Object {
    var confirmationUrl: js.UndefOr[Url]
  }

  object HttpUrlDestinationProperties {
    @inline
    def apply(
        confirmationUrl: js.UndefOr[Url] = js.undefined
    ): HttpUrlDestinationProperties = {
      val __obj = js.Dynamic.literal()
      confirmationUrl.foreach(__v => __obj.updateDynamic("confirmationUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpUrlDestinationProperties]
    }
  }

  /** Information about an HTTP URL destination.
    */
  @js.native
  trait HttpUrlDestinationSummary extends js.Object {
    var confirmationUrl: js.UndefOr[Url]
  }

  object HttpUrlDestinationSummary {
    @inline
    def apply(
        confirmationUrl: js.UndefOr[Url] = js.undefined
    ): HttpUrlDestinationSummary = {
      val __obj = js.Dynamic.literal()
      confirmationUrl.foreach(__v => __obj.updateDynamic("confirmationUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpUrlDestinationSummary]
    }
  }

  /** Information that implicitly denies authorization. When policy doesn't explicitly deny or allow an action on a resource it is considered an implicit deny.
    */
  @js.native
  trait ImplicitDeny extends js.Object {
    var policies: js.UndefOr[Policies]
  }

  object ImplicitDeny {
    @inline
    def apply(
        policies: js.UndefOr[Policies] = js.undefined
    ): ImplicitDeny = {
      val __obj = js.Dynamic.literal()
      policies.foreach(__v => __obj.updateDynamic("policies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImplicitDeny]
    }
  }

  @js.native
  sealed trait IndexStatus extends js.Any
  object IndexStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[IndexStatus]
    val BUILDING = "BUILDING".asInstanceOf[IndexStatus]
    val REBUILDING = "REBUILDING".asInstanceOf[IndexStatus]

    @inline def values = js.Array(ACTIVE, BUILDING, REBUILDING)
  }

  /** Sends message data to an AWS IoT Analytics channel.
    */
  @js.native
  trait IotAnalyticsAction extends js.Object {
    var batchMode: js.UndefOr[BatchMode]
    var channelArn: js.UndefOr[AwsArn]
    var channelName: js.UndefOr[ChannelName]
    var roleArn: js.UndefOr[AwsArn]
  }

  object IotAnalyticsAction {
    @inline
    def apply(
        batchMode: js.UndefOr[BatchMode] = js.undefined,
        channelArn: js.UndefOr[AwsArn] = js.undefined,
        channelName: js.UndefOr[ChannelName] = js.undefined,
        roleArn: js.UndefOr[AwsArn] = js.undefined
    ): IotAnalyticsAction = {
      val __obj = js.Dynamic.literal()
      batchMode.foreach(__v => __obj.updateDynamic("batchMode")(__v.asInstanceOf[js.Any]))
      channelArn.foreach(__v => __obj.updateDynamic("channelArn")(__v.asInstanceOf[js.Any]))
      channelName.foreach(__v => __obj.updateDynamic("channelName")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IotAnalyticsAction]
    }
  }

  /** Sends an input to an AWS IoT Events detector.
    */
  @js.native
  trait IotEventsAction extends js.Object {
    var inputName: InputName
    var roleArn: AwsArn
    var batchMode: js.UndefOr[BatchMode]
    var messageId: js.UndefOr[MessageId]
  }

  object IotEventsAction {
    @inline
    def apply(
        inputName: InputName,
        roleArn: AwsArn,
        batchMode: js.UndefOr[BatchMode] = js.undefined,
        messageId: js.UndefOr[MessageId] = js.undefined
    ): IotEventsAction = {
      val __obj = js.Dynamic.literal(
        "inputName" -> inputName.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      batchMode.foreach(__v => __obj.updateDynamic("batchMode")(__v.asInstanceOf[js.Any]))
      messageId.foreach(__v => __obj.updateDynamic("messageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IotEventsAction]
    }
  }

  /** Describes an action to send data from an MQTT message that triggered the rule to AWS IoT SiteWise asset properties.
    */
  @js.native
  trait IotSiteWiseAction extends js.Object {
    var putAssetPropertyValueEntries: PutAssetPropertyValueEntryList
    var roleArn: AwsArn
  }

  object IotSiteWiseAction {
    @inline
    def apply(
        putAssetPropertyValueEntries: PutAssetPropertyValueEntryList,
        roleArn: AwsArn
    ): IotSiteWiseAction = {
      val __obj = js.Dynamic.literal(
        "putAssetPropertyValueEntries" -> putAssetPropertyValueEntries.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IotSiteWiseAction]
    }
  }

  /** The <code>Job</code> object contains details about a job.
    */
  @js.native
  trait Job extends js.Object {
    var abortConfig: js.UndefOr[AbortConfig]
    var comment: js.UndefOr[Comment]
    var completedAt: js.UndefOr[DateType]
    var createdAt: js.UndefOr[DateType]
    var description: js.UndefOr[JobDescription]
    var forceCanceled: js.UndefOr[Forced]
    var jobArn: js.UndefOr[JobArn]
    var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig]
    var jobId: js.UndefOr[JobId]
    var jobProcessDetails: js.UndefOr[JobProcessDetails]
    var lastUpdatedAt: js.UndefOr[DateType]
    var namespaceId: js.UndefOr[NamespaceId]
    var presignedUrlConfig: js.UndefOr[PresignedUrlConfig]
    var reasonCode: js.UndefOr[ReasonCode]
    var status: js.UndefOr[JobStatus]
    var targetSelection: js.UndefOr[TargetSelection]
    var targets: js.UndefOr[JobTargets]
    var timeoutConfig: js.UndefOr[TimeoutConfig]
  }

  object Job {
    @inline
    def apply(
        abortConfig: js.UndefOr[AbortConfig] = js.undefined,
        comment: js.UndefOr[Comment] = js.undefined,
        completedAt: js.UndefOr[DateType] = js.undefined,
        createdAt: js.UndefOr[DateType] = js.undefined,
        description: js.UndefOr[JobDescription] = js.undefined,
        forceCanceled: js.UndefOr[Forced] = js.undefined,
        jobArn: js.UndefOr[JobArn] = js.undefined,
        jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined,
        jobProcessDetails: js.UndefOr[JobProcessDetails] = js.undefined,
        lastUpdatedAt: js.UndefOr[DateType] = js.undefined,
        namespaceId: js.UndefOr[NamespaceId] = js.undefined,
        presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined,
        reasonCode: js.UndefOr[ReasonCode] = js.undefined,
        status: js.UndefOr[JobStatus] = js.undefined,
        targetSelection: js.UndefOr[TargetSelection] = js.undefined,
        targets: js.UndefOr[JobTargets] = js.undefined,
        timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
    ): Job = {
      val __obj = js.Dynamic.literal()
      abortConfig.foreach(__v => __obj.updateDynamic("abortConfig")(__v.asInstanceOf[js.Any]))
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      completedAt.foreach(__v => __obj.updateDynamic("completedAt")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      forceCanceled.foreach(__v => __obj.updateDynamic("forceCanceled")(__v.asInstanceOf[js.Any]))
      jobArn.foreach(__v => __obj.updateDynamic("jobArn")(__v.asInstanceOf[js.Any]))
      jobExecutionsRolloutConfig.foreach(__v => __obj.updateDynamic("jobExecutionsRolloutConfig")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      jobProcessDetails.foreach(__v => __obj.updateDynamic("jobProcessDetails")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      namespaceId.foreach(__v => __obj.updateDynamic("namespaceId")(__v.asInstanceOf[js.Any]))
      presignedUrlConfig.foreach(__v => __obj.updateDynamic("presignedUrlConfig")(__v.asInstanceOf[js.Any]))
      reasonCode.foreach(__v => __obj.updateDynamic("reasonCode")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      targetSelection.foreach(__v => __obj.updateDynamic("targetSelection")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      timeoutConfig.foreach(__v => __obj.updateDynamic("timeoutConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /** The job execution object represents the execution of a job on a particular device.
    */
  @js.native
  trait JobExecution extends js.Object {
    var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut]
    var executionNumber: js.UndefOr[ExecutionNumber]
    var forceCanceled: js.UndefOr[Forced]
    var jobId: js.UndefOr[JobId]
    var lastUpdatedAt: js.UndefOr[DateType]
    var queuedAt: js.UndefOr[DateType]
    var startedAt: js.UndefOr[DateType]
    var status: js.UndefOr[JobExecutionStatus]
    var statusDetails: js.UndefOr[JobExecutionStatusDetails]
    var thingArn: js.UndefOr[ThingArn]
    var versionNumber: js.UndefOr[VersionNumber]
  }

  object JobExecution {
    @inline
    def apply(
        approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.undefined,
        executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
        forceCanceled: js.UndefOr[Forced] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined,
        lastUpdatedAt: js.UndefOr[DateType] = js.undefined,
        queuedAt: js.UndefOr[DateType] = js.undefined,
        startedAt: js.UndefOr[DateType] = js.undefined,
        status: js.UndefOr[JobExecutionStatus] = js.undefined,
        statusDetails: js.UndefOr[JobExecutionStatusDetails] = js.undefined,
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        versionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): JobExecution = {
      val __obj = js.Dynamic.literal()
      approximateSecondsBeforeTimedOut.foreach(__v => __obj.updateDynamic("approximateSecondsBeforeTimedOut")(__v.asInstanceOf[js.Any]))
      executionNumber.foreach(__v => __obj.updateDynamic("executionNumber")(__v.asInstanceOf[js.Any]))
      forceCanceled.foreach(__v => __obj.updateDynamic("forceCanceled")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      queuedAt.foreach(__v => __obj.updateDynamic("queuedAt")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusDetails.foreach(__v => __obj.updateDynamic("statusDetails")(__v.asInstanceOf[js.Any]))
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      versionNumber.foreach(__v => __obj.updateDynamic("versionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobExecution]
    }
  }

  @js.native
  sealed trait JobExecutionFailureType extends js.Any
  object JobExecutionFailureType {
    val FAILED = "FAILED".asInstanceOf[JobExecutionFailureType]
    val REJECTED = "REJECTED".asInstanceOf[JobExecutionFailureType]
    val TIMED_OUT = "TIMED_OUT".asInstanceOf[JobExecutionFailureType]
    val ALL = "ALL".asInstanceOf[JobExecutionFailureType]

    @inline def values = js.Array(FAILED, REJECTED, TIMED_OUT, ALL)
  }

  @js.native
  sealed trait JobExecutionStatus extends js.Any
  object JobExecutionStatus {
    val QUEUED = "QUEUED".asInstanceOf[JobExecutionStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobExecutionStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobExecutionStatus]
    val FAILED = "FAILED".asInstanceOf[JobExecutionStatus]
    val TIMED_OUT = "TIMED_OUT".asInstanceOf[JobExecutionStatus]
    val REJECTED = "REJECTED".asInstanceOf[JobExecutionStatus]
    val REMOVED = "REMOVED".asInstanceOf[JobExecutionStatus]
    val CANCELED = "CANCELED".asInstanceOf[JobExecutionStatus]

    @inline def values = js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED)
  }

  /** Details of the job execution status.
    */
  @js.native
  trait JobExecutionStatusDetails extends js.Object {
    var detailsMap: js.UndefOr[DetailsMap]
  }

  object JobExecutionStatusDetails {
    @inline
    def apply(
        detailsMap: js.UndefOr[DetailsMap] = js.undefined
    ): JobExecutionStatusDetails = {
      val __obj = js.Dynamic.literal()
      detailsMap.foreach(__v => __obj.updateDynamic("detailsMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobExecutionStatusDetails]
    }
  }

  /** The job execution summary.
    */
  @js.native
  trait JobExecutionSummary extends js.Object {
    var executionNumber: js.UndefOr[ExecutionNumber]
    var lastUpdatedAt: js.UndefOr[DateType]
    var queuedAt: js.UndefOr[DateType]
    var startedAt: js.UndefOr[DateType]
    var status: js.UndefOr[JobExecutionStatus]
  }

  object JobExecutionSummary {
    @inline
    def apply(
        executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
        lastUpdatedAt: js.UndefOr[DateType] = js.undefined,
        queuedAt: js.UndefOr[DateType] = js.undefined,
        startedAt: js.UndefOr[DateType] = js.undefined,
        status: js.UndefOr[JobExecutionStatus] = js.undefined
    ): JobExecutionSummary = {
      val __obj = js.Dynamic.literal()
      executionNumber.foreach(__v => __obj.updateDynamic("executionNumber")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      queuedAt.foreach(__v => __obj.updateDynamic("queuedAt")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobExecutionSummary]
    }
  }

  /** Contains a summary of information about job executions for a specific job.
    */
  @js.native
  trait JobExecutionSummaryForJob extends js.Object {
    var jobExecutionSummary: js.UndefOr[JobExecutionSummary]
    var thingArn: js.UndefOr[ThingArn]
  }

  object JobExecutionSummaryForJob {
    @inline
    def apply(
        jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.undefined,
        thingArn: js.UndefOr[ThingArn] = js.undefined
    ): JobExecutionSummaryForJob = {
      val __obj = js.Dynamic.literal()
      jobExecutionSummary.foreach(__v => __obj.updateDynamic("jobExecutionSummary")(__v.asInstanceOf[js.Any]))
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobExecutionSummaryForJob]
    }
  }

  /** The job execution summary for a thing.
    */
  @js.native
  trait JobExecutionSummaryForThing extends js.Object {
    var jobExecutionSummary: js.UndefOr[JobExecutionSummary]
    var jobId: js.UndefOr[JobId]
  }

  object JobExecutionSummaryForThing {
    @inline
    def apply(
        jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined
    ): JobExecutionSummaryForThing = {
      val __obj = js.Dynamic.literal()
      jobExecutionSummary.foreach(__v => __obj.updateDynamic("jobExecutionSummary")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobExecutionSummaryForThing]
    }
  }

  /** Allows you to create a staged rollout of a job.
    */
  @js.native
  trait JobExecutionsRolloutConfig extends js.Object {
    var exponentialRate: js.UndefOr[ExponentialRolloutRate]
    var maximumPerMinute: js.UndefOr[MaxJobExecutionsPerMin]
  }

  object JobExecutionsRolloutConfig {
    @inline
    def apply(
        exponentialRate: js.UndefOr[ExponentialRolloutRate] = js.undefined,
        maximumPerMinute: js.UndefOr[MaxJobExecutionsPerMin] = js.undefined
    ): JobExecutionsRolloutConfig = {
      val __obj = js.Dynamic.literal()
      exponentialRate.foreach(__v => __obj.updateDynamic("exponentialRate")(__v.asInstanceOf[js.Any]))
      maximumPerMinute.foreach(__v => __obj.updateDynamic("maximumPerMinute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobExecutionsRolloutConfig]
    }
  }

  /** The job process details.
    */
  @js.native
  trait JobProcessDetails extends js.Object {
    var numberOfCanceledThings: js.UndefOr[CanceledThings]
    var numberOfFailedThings: js.UndefOr[FailedThings]
    var numberOfInProgressThings: js.UndefOr[InProgressThings]
    var numberOfQueuedThings: js.UndefOr[QueuedThings]
    var numberOfRejectedThings: js.UndefOr[RejectedThings]
    var numberOfRemovedThings: js.UndefOr[RemovedThings]
    var numberOfSucceededThings: js.UndefOr[SucceededThings]
    var numberOfTimedOutThings: js.UndefOr[TimedOutThings]
    var processingTargets: js.UndefOr[ProcessingTargetNameList]
  }

  object JobProcessDetails {
    @inline
    def apply(
        numberOfCanceledThings: js.UndefOr[CanceledThings] = js.undefined,
        numberOfFailedThings: js.UndefOr[FailedThings] = js.undefined,
        numberOfInProgressThings: js.UndefOr[InProgressThings] = js.undefined,
        numberOfQueuedThings: js.UndefOr[QueuedThings] = js.undefined,
        numberOfRejectedThings: js.UndefOr[RejectedThings] = js.undefined,
        numberOfRemovedThings: js.UndefOr[RemovedThings] = js.undefined,
        numberOfSucceededThings: js.UndefOr[SucceededThings] = js.undefined,
        numberOfTimedOutThings: js.UndefOr[TimedOutThings] = js.undefined,
        processingTargets: js.UndefOr[ProcessingTargetNameList] = js.undefined
    ): JobProcessDetails = {
      val __obj = js.Dynamic.literal()
      numberOfCanceledThings.foreach(__v => __obj.updateDynamic("numberOfCanceledThings")(__v.asInstanceOf[js.Any]))
      numberOfFailedThings.foreach(__v => __obj.updateDynamic("numberOfFailedThings")(__v.asInstanceOf[js.Any]))
      numberOfInProgressThings.foreach(__v => __obj.updateDynamic("numberOfInProgressThings")(__v.asInstanceOf[js.Any]))
      numberOfQueuedThings.foreach(__v => __obj.updateDynamic("numberOfQueuedThings")(__v.asInstanceOf[js.Any]))
      numberOfRejectedThings.foreach(__v => __obj.updateDynamic("numberOfRejectedThings")(__v.asInstanceOf[js.Any]))
      numberOfRemovedThings.foreach(__v => __obj.updateDynamic("numberOfRemovedThings")(__v.asInstanceOf[js.Any]))
      numberOfSucceededThings.foreach(__v => __obj.updateDynamic("numberOfSucceededThings")(__v.asInstanceOf[js.Any]))
      numberOfTimedOutThings.foreach(__v => __obj.updateDynamic("numberOfTimedOutThings")(__v.asInstanceOf[js.Any]))
      processingTargets.foreach(__v => __obj.updateDynamic("processingTargets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobProcessDetails]
    }
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
    val CANCELED = "CANCELED".asInstanceOf[JobStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
    val DELETION_IN_PROGRESS = "DELETION_IN_PROGRESS".asInstanceOf[JobStatus]

    @inline def values = js.Array(IN_PROGRESS, CANCELED, COMPLETED, DELETION_IN_PROGRESS)
  }

  /** The job summary.
    */
  @js.native
  trait JobSummary extends js.Object {
    var completedAt: js.UndefOr[DateType]
    var createdAt: js.UndefOr[DateType]
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
    var lastUpdatedAt: js.UndefOr[DateType]
    var status: js.UndefOr[JobStatus]
    var targetSelection: js.UndefOr[TargetSelection]
    var thingGroupId: js.UndefOr[ThingGroupId]
  }

  object JobSummary {
    @inline
    def apply(
        completedAt: js.UndefOr[DateType] = js.undefined,
        createdAt: js.UndefOr[DateType] = js.undefined,
        jobArn: js.UndefOr[JobArn] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined,
        lastUpdatedAt: js.UndefOr[DateType] = js.undefined,
        status: js.UndefOr[JobStatus] = js.undefined,
        targetSelection: js.UndefOr[TargetSelection] = js.undefined,
        thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
    ): JobSummary = {
      val __obj = js.Dynamic.literal()
      completedAt.foreach(__v => __obj.updateDynamic("completedAt")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      jobArn.foreach(__v => __obj.updateDynamic("jobArn")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      targetSelection.foreach(__v => __obj.updateDynamic("targetSelection")(__v.asInstanceOf[js.Any]))
      thingGroupId.foreach(__v => __obj.updateDynamic("thingGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobSummary]
    }
  }

  /** Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or self-managed Apache Kafka cluster.
    */
  @js.native
  trait KafkaAction extends js.Object {
    var clientProperties: ClientProperties
    var destinationArn: AwsArn
    var topic: String
    var key: js.UndefOr[String]
    var partition: js.UndefOr[String]
  }

  object KafkaAction {
    @inline
    def apply(
        clientProperties: ClientProperties,
        destinationArn: AwsArn,
        topic: String,
        key: js.UndefOr[String] = js.undefined,
        partition: js.UndefOr[String] = js.undefined
    ): KafkaAction = {
      val __obj = js.Dynamic.literal(
        "clientProperties" -> clientProperties.asInstanceOf[js.Any],
        "destinationArn" -> destinationArn.asInstanceOf[js.Any],
        "topic" -> topic.asInstanceOf[js.Any]
      )

      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      partition.foreach(__v => __obj.updateDynamic("partition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KafkaAction]
    }
  }

  /** Describes a key pair.
    */
  @js.native
  trait KeyPair extends js.Object {
    var PrivateKey: js.UndefOr[PrivateKey]
    var PublicKey: js.UndefOr[PublicKey]
  }

  object KeyPair {
    @inline
    def apply(
        PrivateKey: js.UndefOr[PrivateKey] = js.undefined,
        PublicKey: js.UndefOr[PublicKey] = js.undefined
    ): KeyPair = {
      val __obj = js.Dynamic.literal()
      PrivateKey.foreach(__v => __obj.updateDynamic("PrivateKey")(__v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.updateDynamic("PublicKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyPair]
    }
  }

  /** Describes an action to write data to an Amazon Kinesis stream.
    */
  @js.native
  trait KinesisAction extends js.Object {
    var roleArn: AwsArn
    var streamName: StreamName
    var partitionKey: js.UndefOr[PartitionKey]
  }

  object KinesisAction {
    @inline
    def apply(
        roleArn: AwsArn,
        streamName: StreamName,
        partitionKey: js.UndefOr[PartitionKey] = js.undefined
    ): KinesisAction = {
      val __obj = js.Dynamic.literal(
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "streamName" -> streamName.asInstanceOf[js.Any]
      )

      partitionKey.foreach(__v => __obj.updateDynamic("partitionKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisAction]
    }
  }

  /** Describes an action to invoke a Lambda function.
    */
  @js.native
  trait LambdaAction extends js.Object {
    var functionArn: FunctionArn
  }

  object LambdaAction {
    @inline
    def apply(
        functionArn: FunctionArn
    ): LambdaAction = {
      val __obj = js.Dynamic.literal(
        "functionArn" -> functionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LambdaAction]
    }
  }

  @js.native
  trait ListActiveViolationsRequest extends js.Object {
    var behaviorCriteriaType: js.UndefOr[BehaviorCriteriaType]
    var listSuppressedAlerts: js.UndefOr[ListSuppressedAlerts]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[DeviceDefenderThingName]
  }

  object ListActiveViolationsRequest {
    @inline
    def apply(
        behaviorCriteriaType: js.UndefOr[BehaviorCriteriaType] = js.undefined,
        listSuppressedAlerts: js.UndefOr[ListSuppressedAlerts] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined
    ): ListActiveViolationsRequest = {
      val __obj = js.Dynamic.literal()
      behaviorCriteriaType.foreach(__v => __obj.updateDynamic("behaviorCriteriaType")(__v.asInstanceOf[js.Any]))
      listSuppressedAlerts.foreach(__v => __obj.updateDynamic("listSuppressedAlerts")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      securityProfileName.foreach(__v => __obj.updateDynamic("securityProfileName")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActiveViolationsRequest]
    }
  }

  @js.native
  trait ListActiveViolationsResponse extends js.Object {
    var activeViolations: js.UndefOr[ActiveViolations]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListActiveViolationsResponse {
    @inline
    def apply(
        activeViolations: js.UndefOr[ActiveViolations] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActiveViolationsResponse = {
      val __obj = js.Dynamic.literal()
      activeViolations.foreach(__v => __obj.updateDynamic("activeViolations")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActiveViolationsResponse]
    }
  }

  @js.native
  trait ListAttachedPoliciesRequest extends js.Object {
    var target: PolicyTarget
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
    var recursive: js.UndefOr[Recursive]
  }

  object ListAttachedPoliciesRequest {
    @inline
    def apply(
        target: PolicyTarget,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined,
        recursive: js.UndefOr[Recursive] = js.undefined
    ): ListAttachedPoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "target" -> target.asInstanceOf[js.Any]
      )

      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      recursive.foreach(__v => __obj.updateDynamic("recursive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedPoliciesRequest]
    }
  }

  @js.native
  trait ListAttachedPoliciesResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var policies: js.UndefOr[Policies]
  }

  object ListAttachedPoliciesResponse {
    @inline
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        policies: js.UndefOr[Policies] = js.undefined
    ): ListAttachedPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      nextMarker.foreach(__v => __obj.updateDynamic("nextMarker")(__v.asInstanceOf[js.Any]))
      policies.foreach(__v => __obj.updateDynamic("policies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedPoliciesResponse]
    }
  }

  @js.native
  trait ListAuditFindingsRequest extends js.Object {
    var checkName: js.UndefOr[AuditCheckName]
    var endTime: js.UndefOr[Timestamp]
    var listSuppressedFindings: js.UndefOr[ListSuppressedFindings]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var resourceIdentifier: js.UndefOr[ResourceIdentifier]
    var startTime: js.UndefOr[Timestamp]
    var taskId: js.UndefOr[AuditTaskId]
  }

  object ListAuditFindingsRequest {
    @inline
    def apply(
        checkName: js.UndefOr[AuditCheckName] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        listSuppressedFindings: js.UndefOr[ListSuppressedFindings] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        taskId: js.UndefOr[AuditTaskId] = js.undefined
    ): ListAuditFindingsRequest = {
      val __obj = js.Dynamic.literal()
      checkName.foreach(__v => __obj.updateDynamic("checkName")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      listSuppressedFindings.foreach(__v => __obj.updateDynamic("listSuppressedFindings")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceIdentifier.foreach(__v => __obj.updateDynamic("resourceIdentifier")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAuditFindingsRequest]
    }
  }

  @js.native
  trait ListAuditFindingsResponse extends js.Object {
    var findings: js.UndefOr[AuditFindings]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAuditFindingsResponse {
    @inline
    def apply(
        findings: js.UndefOr[AuditFindings] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAuditFindingsResponse = {
      val __obj = js.Dynamic.literal()
      findings.foreach(__v => __obj.updateDynamic("findings")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAuditFindingsResponse]
    }
  }

  @js.native
  trait ListAuditMitigationActionsExecutionsRequest extends js.Object {
    var findingId: FindingId
    var taskId: MitigationActionsTaskId
    var actionStatus: js.UndefOr[AuditMitigationActionsExecutionStatus]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAuditMitigationActionsExecutionsRequest {
    @inline
    def apply(
        findingId: FindingId,
        taskId: MitigationActionsTaskId,
        actionStatus: js.UndefOr[AuditMitigationActionsExecutionStatus] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAuditMitigationActionsExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "findingId" -> findingId.asInstanceOf[js.Any],
        "taskId" -> taskId.asInstanceOf[js.Any]
      )

      actionStatus.foreach(__v => __obj.updateDynamic("actionStatus")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAuditMitigationActionsExecutionsRequest]
    }
  }

  @js.native
  trait ListAuditMitigationActionsExecutionsResponse extends js.Object {
    var actionsExecutions: js.UndefOr[AuditMitigationActionExecutionMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAuditMitigationActionsExecutionsResponse {
    @inline
    def apply(
        actionsExecutions: js.UndefOr[AuditMitigationActionExecutionMetadataList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAuditMitigationActionsExecutionsResponse = {
      val __obj = js.Dynamic.literal()
      actionsExecutions.foreach(__v => __obj.updateDynamic("actionsExecutions")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAuditMitigationActionsExecutionsResponse]
    }
  }

  @js.native
  trait ListAuditMitigationActionsTasksRequest extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
    var auditTaskId: js.UndefOr[AuditTaskId]
    var findingId: js.UndefOr[FindingId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus]
  }

  object ListAuditMitigationActionsTasksRequest {
    @inline
    def apply(
        endTime: Timestamp,
        startTime: Timestamp,
        auditTaskId: js.UndefOr[AuditTaskId] = js.undefined,
        findingId: js.UndefOr[FindingId] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.undefined
    ): ListAuditMitigationActionsTasksRequest = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

      auditTaskId.foreach(__v => __obj.updateDynamic("auditTaskId")(__v.asInstanceOf[js.Any]))
      findingId.foreach(__v => __obj.updateDynamic("findingId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      taskStatus.foreach(__v => __obj.updateDynamic("taskStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAuditMitigationActionsTasksRequest]
    }
  }

  @js.native
  trait ListAuditMitigationActionsTasksResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tasks: js.UndefOr[AuditMitigationActionsTaskMetadataList]
  }

  object ListAuditMitigationActionsTasksResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tasks: js.UndefOr[AuditMitigationActionsTaskMetadataList] = js.undefined
    ): ListAuditMitigationActionsTasksResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tasks.foreach(__v => __obj.updateDynamic("tasks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAuditMitigationActionsTasksResponse]
    }
  }

  @js.native
  trait ListAuditSuppressionsRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var checkName: js.UndefOr[AuditCheckName]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var resourceIdentifier: js.UndefOr[ResourceIdentifier]
  }

  object ListAuditSuppressionsRequest {
    @inline
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        checkName: js.UndefOr[AuditCheckName] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
    ): ListAuditSuppressionsRequest = {
      val __obj = js.Dynamic.literal()
      ascendingOrder.foreach(__v => __obj.updateDynamic("ascendingOrder")(__v.asInstanceOf[js.Any]))
      checkName.foreach(__v => __obj.updateDynamic("checkName")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceIdentifier.foreach(__v => __obj.updateDynamic("resourceIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAuditSuppressionsRequest]
    }
  }

  @js.native
  trait ListAuditSuppressionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var suppressions: js.UndefOr[AuditSuppressionList]
  }

  object ListAuditSuppressionsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        suppressions: js.UndefOr[AuditSuppressionList] = js.undefined
    ): ListAuditSuppressionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      suppressions.foreach(__v => __obj.updateDynamic("suppressions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAuditSuppressionsResponse]
    }
  }

  @js.native
  trait ListAuditTasksRequest extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var taskStatus: js.UndefOr[AuditTaskStatus]
    var taskType: js.UndefOr[AuditTaskType]
  }

  object ListAuditTasksRequest {
    @inline
    def apply(
        endTime: Timestamp,
        startTime: Timestamp,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined,
        taskType: js.UndefOr[AuditTaskType] = js.undefined
    ): ListAuditTasksRequest = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      taskStatus.foreach(__v => __obj.updateDynamic("taskStatus")(__v.asInstanceOf[js.Any]))
      taskType.foreach(__v => __obj.updateDynamic("taskType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAuditTasksRequest]
    }
  }

  @js.native
  trait ListAuditTasksResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tasks: js.UndefOr[AuditTaskMetadataList]
  }

  object ListAuditTasksResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tasks: js.UndefOr[AuditTaskMetadataList] = js.undefined
    ): ListAuditTasksResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tasks.foreach(__v => __obj.updateDynamic("tasks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAuditTasksResponse]
    }
  }

  @js.native
  trait ListAuthorizersRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
    var status: js.UndefOr[AuthorizerStatus]
  }

  object ListAuthorizersRequest {
    @inline
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined,
        status: js.UndefOr[AuthorizerStatus] = js.undefined
    ): ListAuthorizersRequest = {
      val __obj = js.Dynamic.literal()
      ascendingOrder.foreach(__v => __obj.updateDynamic("ascendingOrder")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAuthorizersRequest]
    }
  }

  @js.native
  trait ListAuthorizersResponse extends js.Object {
    var authorizers: js.UndefOr[Authorizers]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListAuthorizersResponse {
    @inline
    def apply(
        authorizers: js.UndefOr[Authorizers] = js.undefined,
        nextMarker: js.UndefOr[Marker] = js.undefined
    ): ListAuthorizersResponse = {
      val __obj = js.Dynamic.literal()
      authorizers.foreach(__v => __obj.updateDynamic("authorizers")(__v.asInstanceOf[js.Any]))
      nextMarker.foreach(__v => __obj.updateDynamic("nextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAuthorizersResponse]
    }
  }

  @js.native
  trait ListBillingGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[RegistryMaxResults]
    var namePrefixFilter: js.UndefOr[BillingGroupName]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBillingGroupsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        namePrefixFilter: js.UndefOr[BillingGroupName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBillingGroupsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      namePrefixFilter.foreach(__v => __obj.updateDynamic("namePrefixFilter")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBillingGroupsRequest]
    }
  }

  @js.native
  trait ListBillingGroupsResponse extends js.Object {
    var billingGroups: js.UndefOr[BillingGroupNameAndArnList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBillingGroupsResponse {
    @inline
    def apply(
        billingGroups: js.UndefOr[BillingGroupNameAndArnList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBillingGroupsResponse = {
      val __obj = js.Dynamic.literal()
      billingGroups.foreach(__v => __obj.updateDynamic("billingGroups")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBillingGroupsResponse]
    }
  }

  /** Input for the ListCACertificates operation.
    */
  @js.native
  trait ListCACertificatesRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListCACertificatesRequest {
    @inline
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListCACertificatesRequest = {
      val __obj = js.Dynamic.literal()
      ascendingOrder.foreach(__v => __obj.updateDynamic("ascendingOrder")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCACertificatesRequest]
    }
  }

  /** The output from the ListCACertificates operation.
    */
  @js.native
  trait ListCACertificatesResponse extends js.Object {
    var certificates: js.UndefOr[CACertificates]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListCACertificatesResponse {
    @inline
    def apply(
        certificates: js.UndefOr[CACertificates] = js.undefined,
        nextMarker: js.UndefOr[Marker] = js.undefined
    ): ListCACertificatesResponse = {
      val __obj = js.Dynamic.literal()
      certificates.foreach(__v => __obj.updateDynamic("certificates")(__v.asInstanceOf[js.Any]))
      nextMarker.foreach(__v => __obj.updateDynamic("nextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCACertificatesResponse]
    }
  }

  /** The input to the ListCertificatesByCA operation.
    */
  @js.native
  trait ListCertificatesByCARequest extends js.Object {
    var caCertificateId: CertificateId
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListCertificatesByCARequest {
    @inline
    def apply(
        caCertificateId: CertificateId,
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListCertificatesByCARequest = {
      val __obj = js.Dynamic.literal(
        "caCertificateId" -> caCertificateId.asInstanceOf[js.Any]
      )

      ascendingOrder.foreach(__v => __obj.updateDynamic("ascendingOrder")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCertificatesByCARequest]
    }
  }

  /** The output of the ListCertificatesByCA operation.
    */
  @js.native
  trait ListCertificatesByCAResponse extends js.Object {
    var certificates: js.UndefOr[Certificates]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListCertificatesByCAResponse {
    @inline
    def apply(
        certificates: js.UndefOr[Certificates] = js.undefined,
        nextMarker: js.UndefOr[Marker] = js.undefined
    ): ListCertificatesByCAResponse = {
      val __obj = js.Dynamic.literal()
      certificates.foreach(__v => __obj.updateDynamic("certificates")(__v.asInstanceOf[js.Any]))
      nextMarker.foreach(__v => __obj.updateDynamic("nextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCertificatesByCAResponse]
    }
  }

  /** The input for the ListCertificates operation.
    */
  @js.native
  trait ListCertificatesRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListCertificatesRequest {
    @inline
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListCertificatesRequest = {
      val __obj = js.Dynamic.literal()
      ascendingOrder.foreach(__v => __obj.updateDynamic("ascendingOrder")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCertificatesRequest]
    }
  }

  /** The output of the ListCertificates operation.
    */
  @js.native
  trait ListCertificatesResponse extends js.Object {
    var certificates: js.UndefOr[Certificates]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListCertificatesResponse {
    @inline
    def apply(
        certificates: js.UndefOr[Certificates] = js.undefined,
        nextMarker: js.UndefOr[Marker] = js.undefined
    ): ListCertificatesResponse = {
      val __obj = js.Dynamic.literal()
      certificates.foreach(__v => __obj.updateDynamic("certificates")(__v.asInstanceOf[js.Any]))
      nextMarker.foreach(__v => __obj.updateDynamic("nextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCertificatesResponse]
    }
  }

  @js.native
  trait ListCustomMetricsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCustomMetricsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCustomMetricsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomMetricsRequest]
    }
  }

  @js.native
  trait ListCustomMetricsResponse extends js.Object {
    var metricNames: js.UndefOr[MetricNames]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCustomMetricsResponse {
    @inline
    def apply(
        metricNames: js.UndefOr[MetricNames] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCustomMetricsResponse = {
      val __obj = js.Dynamic.literal()
      metricNames.foreach(__v => __obj.updateDynamic("metricNames")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomMetricsResponse]
    }
  }

  @js.native
  trait ListDetectMitigationActionsExecutionsRequest extends js.Object {
    var endTime: js.UndefOr[Timestamp]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var startTime: js.UndefOr[Timestamp]
    var taskId: js.UndefOr[MitigationActionsTaskId]
    var thingName: js.UndefOr[DeviceDefenderThingName]
    var violationId: js.UndefOr[ViolationId]
  }

  object ListDetectMitigationActionsExecutionsRequest {
    @inline
    def apply(
        endTime: js.UndefOr[Timestamp] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined,
        thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined,
        violationId: js.UndefOr[ViolationId] = js.undefined
    ): ListDetectMitigationActionsExecutionsRequest = {
      val __obj = js.Dynamic.literal()
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      violationId.foreach(__v => __obj.updateDynamic("violationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectMitigationActionsExecutionsRequest]
    }
  }

  @js.native
  trait ListDetectMitigationActionsExecutionsResponse extends js.Object {
    var actionsExecutions: js.UndefOr[DetectMitigationActionExecutionList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDetectMitigationActionsExecutionsResponse {
    @inline
    def apply(
        actionsExecutions: js.UndefOr[DetectMitigationActionExecutionList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectMitigationActionsExecutionsResponse = {
      val __obj = js.Dynamic.literal()
      actionsExecutions.foreach(__v => __obj.updateDynamic("actionsExecutions")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectMitigationActionsExecutionsResponse]
    }
  }

  @js.native
  trait ListDetectMitigationActionsTasksRequest extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDetectMitigationActionsTasksRequest {
    @inline
    def apply(
        endTime: Timestamp,
        startTime: Timestamp,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectMitigationActionsTasksRequest = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectMitigationActionsTasksRequest]
    }
  }

  @js.native
  trait ListDetectMitigationActionsTasksResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tasks: js.UndefOr[DetectMitigationActionsTaskSummaryList]
  }

  object ListDetectMitigationActionsTasksResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tasks: js.UndefOr[DetectMitigationActionsTaskSummaryList] = js.undefined
    ): ListDetectMitigationActionsTasksResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tasks.foreach(__v => __obj.updateDynamic("tasks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectMitigationActionsTasksResponse]
    }
  }

  @js.native
  trait ListDimensionsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDimensionsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDimensionsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDimensionsRequest]
    }
  }

  @js.native
  trait ListDimensionsResponse extends js.Object {
    var dimensionNames: js.UndefOr[DimensionNames]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDimensionsResponse {
    @inline
    def apply(
        dimensionNames: js.UndefOr[DimensionNames] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDimensionsResponse = {
      val __obj = js.Dynamic.literal()
      dimensionNames.foreach(__v => __obj.updateDynamic("dimensionNames")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDimensionsResponse]
    }
  }

  @js.native
  trait ListDomainConfigurationsRequest extends js.Object {
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
    var serviceType: js.UndefOr[ServiceType]
  }

  object ListDomainConfigurationsRequest {
    @inline
    def apply(
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined,
        serviceType: js.UndefOr[ServiceType] = js.undefined
    ): ListDomainConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      serviceType.foreach(__v => __obj.updateDynamic("serviceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainConfigurationsRequest]
    }
  }

  @js.native
  trait ListDomainConfigurationsResponse extends js.Object {
    var domainConfigurations: js.UndefOr[DomainConfigurations]
    var nextMarker: js.UndefOr[Marker]
  }

  object ListDomainConfigurationsResponse {
    @inline
    def apply(
        domainConfigurations: js.UndefOr[DomainConfigurations] = js.undefined,
        nextMarker: js.UndefOr[Marker] = js.undefined
    ): ListDomainConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      domainConfigurations.foreach(__v => __obj.updateDynamic("domainConfigurations")(__v.asInstanceOf[js.Any]))
      nextMarker.foreach(__v => __obj.updateDynamic("nextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainConfigurationsResponse]
    }
  }

  @js.native
  trait ListIndicesRequest extends js.Object {
    var maxResults: js.UndefOr[QueryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListIndicesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[QueryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIndicesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIndicesRequest]
    }
  }

  @js.native
  trait ListIndicesResponse extends js.Object {
    var indexNames: js.UndefOr[IndexNamesList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListIndicesResponse {
    @inline
    def apply(
        indexNames: js.UndefOr[IndexNamesList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIndicesResponse = {
      val __obj = js.Dynamic.literal()
      indexNames.foreach(__v => __obj.updateDynamic("indexNames")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIndicesResponse]
    }
  }

  @js.native
  trait ListJobExecutionsForJobRequest extends js.Object {
    var jobId: JobId
    var maxResults: js.UndefOr[LaserMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[JobExecutionStatus]
  }

  object ListJobExecutionsForJobRequest {
    @inline
    def apply(
        jobId: JobId,
        maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[JobExecutionStatus] = js.undefined
    ): ListJobExecutionsForJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobExecutionsForJobRequest]
    }
  }

  @js.native
  trait ListJobExecutionsForJobResponse extends js.Object {
    var executionSummaries: js.UndefOr[JobExecutionSummaryForJobList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobExecutionsForJobResponse {
    @inline
    def apply(
        executionSummaries: js.UndefOr[JobExecutionSummaryForJobList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobExecutionsForJobResponse = {
      val __obj = js.Dynamic.literal()
      executionSummaries.foreach(__v => __obj.updateDynamic("executionSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobExecutionsForJobResponse]
    }
  }

  @js.native
  trait ListJobExecutionsForThingRequest extends js.Object {
    var thingName: ThingName
    var maxResults: js.UndefOr[LaserMaxResults]
    var namespaceId: js.UndefOr[NamespaceId]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[JobExecutionStatus]
  }

  object ListJobExecutionsForThingRequest {
    @inline
    def apply(
        thingName: ThingName,
        maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
        namespaceId: js.UndefOr[NamespaceId] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[JobExecutionStatus] = js.undefined
    ): ListJobExecutionsForThingRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      namespaceId.foreach(__v => __obj.updateDynamic("namespaceId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobExecutionsForThingRequest]
    }
  }

  @js.native
  trait ListJobExecutionsForThingResponse extends js.Object {
    var executionSummaries: js.UndefOr[JobExecutionSummaryForThingList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobExecutionsForThingResponse {
    @inline
    def apply(
        executionSummaries: js.UndefOr[JobExecutionSummaryForThingList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobExecutionsForThingResponse = {
      val __obj = js.Dynamic.literal()
      executionSummaries.foreach(__v => __obj.updateDynamic("executionSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobExecutionsForThingResponse]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var maxResults: js.UndefOr[LaserMaxResults]
    var namespaceId: js.UndefOr[NamespaceId]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[JobStatus]
    var targetSelection: js.UndefOr[TargetSelection]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var thingGroupName: js.UndefOr[ThingGroupName]
  }

  object ListJobsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
        namespaceId: js.UndefOr[NamespaceId] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[JobStatus] = js.undefined,
        targetSelection: js.UndefOr[TargetSelection] = js.undefined,
        thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      namespaceId.foreach(__v => __obj.updateDynamic("namespaceId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      targetSelection.foreach(__v => __obj.updateDynamic("targetSelection")(__v.asInstanceOf[js.Any]))
      thingGroupId.foreach(__v => __obj.updateDynamic("thingGroupId")(__v.asInstanceOf[js.Any]))
      thingGroupName.foreach(__v => __obj.updateDynamic("thingGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResponse extends js.Object {
    var jobs: js.UndefOr[JobSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobsResponse {
    @inline
    def apply(
        jobs: js.UndefOr[JobSummaryList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobsResponse = {
      val __obj = js.Dynamic.literal()
      jobs.foreach(__v => __obj.updateDynamic("jobs")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResponse]
    }
  }

  @js.native
  trait ListMitigationActionsRequest extends js.Object {
    var actionType: js.UndefOr[MitigationActionType]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListMitigationActionsRequest {
    @inline
    def apply(
        actionType: js.UndefOr[MitigationActionType] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMitigationActionsRequest = {
      val __obj = js.Dynamic.literal()
      actionType.foreach(__v => __obj.updateDynamic("actionType")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMitigationActionsRequest]
    }
  }

  @js.native
  trait ListMitigationActionsResponse extends js.Object {
    var actionIdentifiers: js.UndefOr[MitigationActionIdentifierList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListMitigationActionsResponse {
    @inline
    def apply(
        actionIdentifiers: js.UndefOr[MitigationActionIdentifierList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMitigationActionsResponse = {
      val __obj = js.Dynamic.literal()
      actionIdentifiers.foreach(__v => __obj.updateDynamic("actionIdentifiers")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMitigationActionsResponse]
    }
  }

  @js.native
  trait ListOTAUpdatesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var otaUpdateStatus: js.UndefOr[OTAUpdateStatus]
  }

  object ListOTAUpdatesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
    ): ListOTAUpdatesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      otaUpdateStatus.foreach(__v => __obj.updateDynamic("otaUpdateStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOTAUpdatesRequest]
    }
  }

  @js.native
  trait ListOTAUpdatesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var otaUpdates: js.UndefOr[OTAUpdatesSummary]
  }

  object ListOTAUpdatesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        otaUpdates: js.UndefOr[OTAUpdatesSummary] = js.undefined
    ): ListOTAUpdatesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      otaUpdates.foreach(__v => __obj.updateDynamic("otaUpdates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOTAUpdatesResponse]
    }
  }

  /** The input to the ListOutgoingCertificates operation.
    */
  @js.native
  trait ListOutgoingCertificatesRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListOutgoingCertificatesRequest {
    @inline
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListOutgoingCertificatesRequest = {
      val __obj = js.Dynamic.literal()
      ascendingOrder.foreach(__v => __obj.updateDynamic("ascendingOrder")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOutgoingCertificatesRequest]
    }
  }

  /** The output from the ListOutgoingCertificates operation.
    */
  @js.native
  trait ListOutgoingCertificatesResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var outgoingCertificates: js.UndefOr[OutgoingCertificates]
  }

  object ListOutgoingCertificatesResponse {
    @inline
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        outgoingCertificates: js.UndefOr[OutgoingCertificates] = js.undefined
    ): ListOutgoingCertificatesResponse = {
      val __obj = js.Dynamic.literal()
      nextMarker.foreach(__v => __obj.updateDynamic("nextMarker")(__v.asInstanceOf[js.Any]))
      outgoingCertificates.foreach(__v => __obj.updateDynamic("outgoingCertificates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOutgoingCertificatesResponse]
    }
  }

  /** The input for the ListPolicies operation.
    */
  @js.native
  trait ListPoliciesRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListPoliciesRequest {
    @inline
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListPoliciesRequest = {
      val __obj = js.Dynamic.literal()
      ascendingOrder.foreach(__v => __obj.updateDynamic("ascendingOrder")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesRequest]
    }
  }

  /** The output from the ListPolicies operation.
    */
  @js.native
  trait ListPoliciesResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var policies: js.UndefOr[Policies]
  }

  object ListPoliciesResponse {
    @inline
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        policies: js.UndefOr[Policies] = js.undefined
    ): ListPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      nextMarker.foreach(__v => __obj.updateDynamic("nextMarker")(__v.asInstanceOf[js.Any]))
      policies.foreach(__v => __obj.updateDynamic("policies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoliciesResponse]
    }
  }

  /** The input for the ListPolicyPrincipals operation.
    */
  @js.native
  trait ListPolicyPrincipalsRequest extends js.Object {
    var policyName: PolicyName
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListPolicyPrincipalsRequest {
    @inline
    def apply(
        policyName: PolicyName,
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListPolicyPrincipalsRequest = {
      val __obj = js.Dynamic.literal(
        "policyName" -> policyName.asInstanceOf[js.Any]
      )

      ascendingOrder.foreach(__v => __obj.updateDynamic("ascendingOrder")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPolicyPrincipalsRequest]
    }
  }

  /** The output from the ListPolicyPrincipals operation.
    */
  @js.native
  trait ListPolicyPrincipalsResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var principals: js.UndefOr[Principals]
  }

  object ListPolicyPrincipalsResponse {
    @inline
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        principals: js.UndefOr[Principals] = js.undefined
    ): ListPolicyPrincipalsResponse = {
      val __obj = js.Dynamic.literal()
      nextMarker.foreach(__v => __obj.updateDynamic("nextMarker")(__v.asInstanceOf[js.Any]))
      principals.foreach(__v => __obj.updateDynamic("principals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPolicyPrincipalsResponse]
    }
  }

  /** The input for the ListPolicyVersions operation.
    */
  @js.native
  trait ListPolicyVersionsRequest extends js.Object {
    var policyName: PolicyName
  }

  object ListPolicyVersionsRequest {
    @inline
    def apply(
        policyName: PolicyName
    ): ListPolicyVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "policyName" -> policyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListPolicyVersionsRequest]
    }
  }

  /** The output from the ListPolicyVersions operation.
    */
  @js.native
  trait ListPolicyVersionsResponse extends js.Object {
    var policyVersions: js.UndefOr[PolicyVersions]
  }

  object ListPolicyVersionsResponse {
    @inline
    def apply(
        policyVersions: js.UndefOr[PolicyVersions] = js.undefined
    ): ListPolicyVersionsResponse = {
      val __obj = js.Dynamic.literal()
      policyVersions.foreach(__v => __obj.updateDynamic("policyVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPolicyVersionsResponse]
    }
  }

  /** The input for the ListPrincipalPolicies operation.
    */
  @js.native
  trait ListPrincipalPoliciesRequest extends js.Object {
    var principal: Principal
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListPrincipalPoliciesRequest {
    @inline
    def apply(
        principal: Principal,
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListPrincipalPoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "principal" -> principal.asInstanceOf[js.Any]
      )

      ascendingOrder.foreach(__v => __obj.updateDynamic("ascendingOrder")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPrincipalPoliciesRequest]
    }
  }

  /** The output from the ListPrincipalPolicies operation.
    */
  @js.native
  trait ListPrincipalPoliciesResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var policies: js.UndefOr[Policies]
  }

  object ListPrincipalPoliciesResponse {
    @inline
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        policies: js.UndefOr[Policies] = js.undefined
    ): ListPrincipalPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      nextMarker.foreach(__v => __obj.updateDynamic("nextMarker")(__v.asInstanceOf[js.Any]))
      policies.foreach(__v => __obj.updateDynamic("policies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPrincipalPoliciesResponse]
    }
  }

  /** The input for the ListPrincipalThings operation.
    */
  @js.native
  trait ListPrincipalThingsRequest extends js.Object {
    var principal: Principal
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPrincipalThingsRequest {
    @inline
    def apply(
        principal: Principal,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPrincipalThingsRequest = {
      val __obj = js.Dynamic.literal(
        "principal" -> principal.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPrincipalThingsRequest]
    }
  }

  /** The output from the ListPrincipalThings operation.
    */
  @js.native
  trait ListPrincipalThingsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[ThingNameList]
  }

  object ListPrincipalThingsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        things: js.UndefOr[ThingNameList] = js.undefined
    ): ListPrincipalThingsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      things.foreach(__v => __obj.updateDynamic("things")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPrincipalThingsResponse]
    }
  }

  @js.native
  trait ListProvisioningTemplateVersionsRequest extends js.Object {
    var templateName: TemplateName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListProvisioningTemplateVersionsRequest {
    @inline
    def apply(
        templateName: TemplateName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProvisioningTemplateVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisioningTemplateVersionsRequest]
    }
  }

  @js.native
  trait ListProvisioningTemplateVersionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var versions: js.UndefOr[ProvisioningTemplateVersionListing]
  }

  object ListProvisioningTemplateVersionsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        versions: js.UndefOr[ProvisioningTemplateVersionListing] = js.undefined
    ): ListProvisioningTemplateVersionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      versions.foreach(__v => __obj.updateDynamic("versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisioningTemplateVersionsResponse]
    }
  }

  @js.native
  trait ListProvisioningTemplatesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListProvisioningTemplatesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProvisioningTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisioningTemplatesRequest]
    }
  }

  @js.native
  trait ListProvisioningTemplatesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var templates: js.UndefOr[ProvisioningTemplateListing]
  }

  object ListProvisioningTemplatesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        templates: js.UndefOr[ProvisioningTemplateListing] = js.undefined
    ): ListProvisioningTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      templates.foreach(__v => __obj.updateDynamic("templates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisioningTemplatesResponse]
    }
  }

  @js.native
  trait ListRoleAliasesRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListRoleAliasesRequest {
    @inline
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListRoleAliasesRequest = {
      val __obj = js.Dynamic.literal()
      ascendingOrder.foreach(__v => __obj.updateDynamic("ascendingOrder")(__v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoleAliasesRequest]
    }
  }

  @js.native
  trait ListRoleAliasesResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var roleAliases: js.UndefOr[RoleAliases]
  }

  object ListRoleAliasesResponse {
    @inline
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        roleAliases: js.UndefOr[RoleAliases] = js.undefined
    ): ListRoleAliasesResponse = {
      val __obj = js.Dynamic.literal()
      nextMarker.foreach(__v => __obj.updateDynamic("nextMarker")(__v.asInstanceOf[js.Any]))
      roleAliases.foreach(__v => __obj.updateDynamic("roleAliases")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoleAliasesResponse]
    }
  }

  @js.native
  trait ListScheduledAuditsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListScheduledAuditsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListScheduledAuditsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListScheduledAuditsRequest]
    }
  }

  @js.native
  trait ListScheduledAuditsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var scheduledAudits: js.UndefOr[ScheduledAuditMetadataList]
  }

  object ListScheduledAuditsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        scheduledAudits: js.UndefOr[ScheduledAuditMetadataList] = js.undefined
    ): ListScheduledAuditsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      scheduledAudits.foreach(__v => __obj.updateDynamic("scheduledAudits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListScheduledAuditsResponse]
    }
  }

  @js.native
  trait ListSecurityProfilesForTargetRequest extends js.Object {
    var securityProfileTargetArn: SecurityProfileTargetArn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var recursive: js.UndefOr[Recursive]
  }

  object ListSecurityProfilesForTargetRequest {
    @inline
    def apply(
        securityProfileTargetArn: SecurityProfileTargetArn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recursive: js.UndefOr[Recursive] = js.undefined
    ): ListSecurityProfilesForTargetRequest = {
      val __obj = js.Dynamic.literal(
        "securityProfileTargetArn" -> securityProfileTargetArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      recursive.foreach(__v => __obj.updateDynamic("recursive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityProfilesForTargetRequest]
    }
  }

  @js.native
  trait ListSecurityProfilesForTargetResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings]
  }

  object ListSecurityProfilesForTargetResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings] = js.undefined
    ): ListSecurityProfilesForTargetResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      securityProfileTargetMappings.foreach(__v => __obj.updateDynamic("securityProfileTargetMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityProfilesForTargetResponse]
    }
  }

  @js.native
  trait ListSecurityProfilesRequest extends js.Object {
    var dimensionName: js.UndefOr[DimensionName]
    var maxResults: js.UndefOr[MaxResults]
    var metricName: js.UndefOr[MetricName]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSecurityProfilesRequest {
    @inline
    def apply(
        dimensionName: js.UndefOr[DimensionName] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        metricName: js.UndefOr[MetricName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSecurityProfilesRequest = {
      val __obj = js.Dynamic.literal()
      dimensionName.foreach(__v => __obj.updateDynamic("dimensionName")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      metricName.foreach(__v => __obj.updateDynamic("metricName")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityProfilesRequest]
    }
  }

  @js.native
  trait ListSecurityProfilesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var securityProfileIdentifiers: js.UndefOr[SecurityProfileIdentifiers]
  }

  object ListSecurityProfilesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileIdentifiers: js.UndefOr[SecurityProfileIdentifiers] = js.undefined
    ): ListSecurityProfilesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      securityProfileIdentifiers.foreach(__v => __obj.updateDynamic("securityProfileIdentifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityProfilesResponse]
    }
  }

  @js.native
  trait ListStreamsRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListStreamsRequest {
    @inline
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListStreamsRequest = {
      val __obj = js.Dynamic.literal()
      ascendingOrder.foreach(__v => __obj.updateDynamic("ascendingOrder")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamsRequest]
    }
  }

  @js.native
  trait ListStreamsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var streams: js.UndefOr[StreamsSummary]
  }

  object ListStreamsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        streams: js.UndefOr[StreamsSummary] = js.undefined
    ): ListStreamsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      streams.foreach(__v => __obj.updateDynamic("streams")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTargetsForPolicyRequest extends js.Object {
    var policyName: PolicyName
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListTargetsForPolicyRequest {
    @inline
    def apply(
        policyName: PolicyName,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListTargetsForPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyName" -> policyName.asInstanceOf[js.Any]
      )

      marker.foreach(__v => __obj.updateDynamic("marker")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetsForPolicyRequest]
    }
  }

  @js.native
  trait ListTargetsForPolicyResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var targets: js.UndefOr[PolicyTargets]
  }

  object ListTargetsForPolicyResponse {
    @inline
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        targets: js.UndefOr[PolicyTargets] = js.undefined
    ): ListTargetsForPolicyResponse = {
      val __obj = js.Dynamic.literal()
      nextMarker.foreach(__v => __obj.updateDynamic("nextMarker")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetsForPolicyResponse]
    }
  }

  @js.native
  trait ListTargetsForSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTargetsForSecurityProfileRequest {
    @inline
    def apply(
        securityProfileName: SecurityProfileName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTargetsForSecurityProfileRequest = {
      val __obj = js.Dynamic.literal(
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetsForSecurityProfileRequest]
    }
  }

  @js.native
  trait ListTargetsForSecurityProfileResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var securityProfileTargets: js.UndefOr[SecurityProfileTargets]
  }

  object ListTargetsForSecurityProfileResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileTargets: js.UndefOr[SecurityProfileTargets] = js.undefined
    ): ListTargetsForSecurityProfileResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      securityProfileTargets.foreach(__v => __obj.updateDynamic("securityProfileTargets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetsForSecurityProfileResponse]
    }
  }

  @js.native
  trait ListThingGroupsForThingRequest extends js.Object {
    var thingName: ThingName
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingGroupsForThingRequest {
    @inline
    def apply(
        thingName: ThingName,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListThingGroupsForThingRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingGroupsForThingRequest]
    }
  }

  @js.native
  trait ListThingGroupsForThingResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var thingGroups: js.UndefOr[ThingGroupNameAndArnList]
  }

  object ListThingGroupsForThingResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
    ): ListThingGroupsForThingResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      thingGroups.foreach(__v => __obj.updateDynamic("thingGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingGroupsForThingResponse]
    }
  }

  @js.native
  trait ListThingGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[RegistryMaxResults]
    var namePrefixFilter: js.UndefOr[ThingGroupName]
    var nextToken: js.UndefOr[NextToken]
    var parentGroup: js.UndefOr[ThingGroupName]
    var recursive: js.UndefOr[RecursiveWithoutDefault]
  }

  object ListThingGroupsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        namePrefixFilter: js.UndefOr[ThingGroupName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        parentGroup: js.UndefOr[ThingGroupName] = js.undefined,
        recursive: js.UndefOr[RecursiveWithoutDefault] = js.undefined
    ): ListThingGroupsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      namePrefixFilter.foreach(__v => __obj.updateDynamic("namePrefixFilter")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      parentGroup.foreach(__v => __obj.updateDynamic("parentGroup")(__v.asInstanceOf[js.Any]))
      recursive.foreach(__v => __obj.updateDynamic("recursive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingGroupsRequest]
    }
  }

  @js.native
  trait ListThingGroupsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var thingGroups: js.UndefOr[ThingGroupNameAndArnList]
  }

  object ListThingGroupsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
    ): ListThingGroupsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      thingGroups.foreach(__v => __obj.updateDynamic("thingGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingGroupsResponse]
    }
  }

  /** The input for the ListThingPrincipal operation.
    */
  @js.native
  trait ListThingPrincipalsRequest extends js.Object {
    var thingName: ThingName
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingPrincipalsRequest {
    @inline
    def apply(
        thingName: ThingName,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListThingPrincipalsRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingPrincipalsRequest]
    }
  }

  /** The output from the ListThingPrincipals operation.
    */
  @js.native
  trait ListThingPrincipalsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var principals: js.UndefOr[Principals]
  }

  object ListThingPrincipalsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        principals: js.UndefOr[Principals] = js.undefined
    ): ListThingPrincipalsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      principals.foreach(__v => __obj.updateDynamic("principals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingPrincipalsResponse]
    }
  }

  @js.native
  trait ListThingRegistrationTaskReportsRequest extends js.Object {
    var reportType: ReportType
    var taskId: TaskId
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingRegistrationTaskReportsRequest {
    @inline
    def apply(
        reportType: ReportType,
        taskId: TaskId,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListThingRegistrationTaskReportsRequest = {
      val __obj = js.Dynamic.literal(
        "reportType" -> reportType.asInstanceOf[js.Any],
        "taskId" -> taskId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingRegistrationTaskReportsRequest]
    }
  }

  @js.native
  trait ListThingRegistrationTaskReportsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var reportType: js.UndefOr[ReportType]
    var resourceLinks: js.UndefOr[S3FileUrlList]
  }

  object ListThingRegistrationTaskReportsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        reportType: js.UndefOr[ReportType] = js.undefined,
        resourceLinks: js.UndefOr[S3FileUrlList] = js.undefined
    ): ListThingRegistrationTaskReportsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      reportType.foreach(__v => __obj.updateDynamic("reportType")(__v.asInstanceOf[js.Any]))
      resourceLinks.foreach(__v => __obj.updateDynamic("resourceLinks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingRegistrationTaskReportsResponse]
    }
  }

  @js.native
  trait ListThingRegistrationTasksRequest extends js.Object {
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[Status]
  }

  object ListThingRegistrationTasksRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): ListThingRegistrationTasksRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingRegistrationTasksRequest]
    }
  }

  @js.native
  trait ListThingRegistrationTasksResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var taskIds: js.UndefOr[TaskIdList]
  }

  object ListThingRegistrationTasksResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        taskIds: js.UndefOr[TaskIdList] = js.undefined
    ): ListThingRegistrationTasksResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      taskIds.foreach(__v => __obj.updateDynamic("taskIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingRegistrationTasksResponse]
    }
  }

  /** The input for the ListThingTypes operation.
    */
  @js.native
  trait ListThingTypesRequest extends js.Object {
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  object ListThingTypesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    ): ListThingTypesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      thingTypeName.foreach(__v => __obj.updateDynamic("thingTypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingTypesRequest]
    }
  }

  /** The output for the ListThingTypes operation.
    */
  @js.native
  trait ListThingTypesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var thingTypes: js.UndefOr[ThingTypeList]
  }

  object ListThingTypesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingTypes: js.UndefOr[ThingTypeList] = js.undefined
    ): ListThingTypesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      thingTypes.foreach(__v => __obj.updateDynamic("thingTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingTypesResponse]
    }
  }

  @js.native
  trait ListThingsInBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingsInBillingGroupRequest {
    @inline
    def apply(
        billingGroupName: BillingGroupName,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListThingsInBillingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "billingGroupName" -> billingGroupName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingsInBillingGroupRequest]
    }
  }

  @js.native
  trait ListThingsInBillingGroupResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[ThingNameList]
  }

  object ListThingsInBillingGroupResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        things: js.UndefOr[ThingNameList] = js.undefined
    ): ListThingsInBillingGroupResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      things.foreach(__v => __obj.updateDynamic("things")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingsInBillingGroupResponse]
    }
  }

  @js.native
  trait ListThingsInThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var recursive: js.UndefOr[Recursive]
  }

  object ListThingsInThingGroupRequest {
    @inline
    def apply(
        thingGroupName: ThingGroupName,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recursive: js.UndefOr[Recursive] = js.undefined
    ): ListThingsInThingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      recursive.foreach(__v => __obj.updateDynamic("recursive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingsInThingGroupRequest]
    }
  }

  @js.native
  trait ListThingsInThingGroupResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[ThingNameList]
  }

  object ListThingsInThingGroupResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        things: js.UndefOr[ThingNameList] = js.undefined
    ): ListThingsInThingGroupResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      things.foreach(__v => __obj.updateDynamic("things")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingsInThingGroupResponse]
    }
  }

  /** The input for the ListThings operation.
    */
  @js.native
  trait ListThingsRequest extends js.Object {
    var attributeName: js.UndefOr[AttributeName]
    var attributeValue: js.UndefOr[AttributeValue]
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var usePrefixAttributeValue: js.UndefOr[usePrefixAttributeValue]
  }

  object ListThingsRequest {
    @inline
    def apply(
        attributeName: js.UndefOr[AttributeName] = js.undefined,
        attributeValue: js.UndefOr[AttributeValue] = js.undefined,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
        usePrefixAttributeValue: js.UndefOr[usePrefixAttributeValue] = js.undefined
    ): ListThingsRequest = {
      val __obj = js.Dynamic.literal()
      attributeName.foreach(__v => __obj.updateDynamic("attributeName")(__v.asInstanceOf[js.Any]))
      attributeValue.foreach(__v => __obj.updateDynamic("attributeValue")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      thingTypeName.foreach(__v => __obj.updateDynamic("thingTypeName")(__v.asInstanceOf[js.Any]))
      usePrefixAttributeValue.foreach(__v => __obj.updateDynamic("usePrefixAttributeValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingsRequest]
    }
  }

  /** The output from the ListThings operation.
    */
  @js.native
  trait ListThingsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[ThingAttributeList]
  }

  object ListThingsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        things: js.UndefOr[ThingAttributeList] = js.undefined
    ): ListThingsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      things.foreach(__v => __obj.updateDynamic("things")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingsResponse]
    }
  }

  @js.native
  trait ListTopicRuleDestinationsRequest extends js.Object {
    var maxResults: js.UndefOr[TopicRuleDestinationMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTopicRuleDestinationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[TopicRuleDestinationMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTopicRuleDestinationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTopicRuleDestinationsRequest]
    }
  }

  @js.native
  trait ListTopicRuleDestinationsResponse extends js.Object {
    var destinationSummaries: js.UndefOr[TopicRuleDestinationSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTopicRuleDestinationsResponse {
    @inline
    def apply(
        destinationSummaries: js.UndefOr[TopicRuleDestinationSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTopicRuleDestinationsResponse = {
      val __obj = js.Dynamic.literal()
      destinationSummaries.foreach(__v => __obj.updateDynamic("destinationSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTopicRuleDestinationsResponse]
    }
  }

  /** The input for the ListTopicRules operation.
    */
  @js.native
  trait ListTopicRulesRequest extends js.Object {
    var maxResults: js.UndefOr[TopicRuleMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var ruleDisabled: js.UndefOr[IsDisabled]
    var topic: js.UndefOr[Topic]
  }

  object ListTopicRulesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[TopicRuleMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        ruleDisabled: js.UndefOr[IsDisabled] = js.undefined,
        topic: js.UndefOr[Topic] = js.undefined
    ): ListTopicRulesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      ruleDisabled.foreach(__v => __obj.updateDynamic("ruleDisabled")(__v.asInstanceOf[js.Any]))
      topic.foreach(__v => __obj.updateDynamic("topic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTopicRulesRequest]
    }
  }

  /** The output from the ListTopicRules operation.
    */
  @js.native
  trait ListTopicRulesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var rules: js.UndefOr[TopicRuleList]
  }

  object ListTopicRulesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        rules: js.UndefOr[TopicRuleList] = js.undefined
    ): ListTopicRulesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      rules.foreach(__v => __obj.updateDynamic("rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTopicRulesResponse]
    }
  }

  @js.native
  trait ListV2LoggingLevelsRequest extends js.Object {
    var maxResults: js.UndefOr[SkyfallMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var targetType: js.UndefOr[LogTargetType]
  }

  object ListV2LoggingLevelsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[SkyfallMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        targetType: js.UndefOr[LogTargetType] = js.undefined
    ): ListV2LoggingLevelsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      targetType.foreach(__v => __obj.updateDynamic("targetType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListV2LoggingLevelsRequest]
    }
  }

  @js.native
  trait ListV2LoggingLevelsResponse extends js.Object {
    var logTargetConfigurations: js.UndefOr[LogTargetConfigurations]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListV2LoggingLevelsResponse {
    @inline
    def apply(
        logTargetConfigurations: js.UndefOr[LogTargetConfigurations] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListV2LoggingLevelsResponse = {
      val __obj = js.Dynamic.literal()
      logTargetConfigurations.foreach(__v => __obj.updateDynamic("logTargetConfigurations")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListV2LoggingLevelsResponse]
    }
  }

  @js.native
  trait ListViolationEventsRequest extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
    var behaviorCriteriaType: js.UndefOr[BehaviorCriteriaType]
    var listSuppressedAlerts: js.UndefOr[ListSuppressedAlerts]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[DeviceDefenderThingName]
  }

  object ListViolationEventsRequest {
    @inline
    def apply(
        endTime: Timestamp,
        startTime: Timestamp,
        behaviorCriteriaType: js.UndefOr[BehaviorCriteriaType] = js.undefined,
        listSuppressedAlerts: js.UndefOr[ListSuppressedAlerts] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined
    ): ListViolationEventsRequest = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

      behaviorCriteriaType.foreach(__v => __obj.updateDynamic("behaviorCriteriaType")(__v.asInstanceOf[js.Any]))
      listSuppressedAlerts.foreach(__v => __obj.updateDynamic("listSuppressedAlerts")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      securityProfileName.foreach(__v => __obj.updateDynamic("securityProfileName")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListViolationEventsRequest]
    }
  }

  @js.native
  trait ListViolationEventsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var violationEvents: js.UndefOr[ViolationEvents]
  }

  object ListViolationEventsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        violationEvents: js.UndefOr[ViolationEvents] = js.undefined
    ): ListViolationEventsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      violationEvents.foreach(__v => __obj.updateDynamic("violationEvents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListViolationEventsResponse]
    }
  }

  @js.native
  sealed trait LogLevel extends js.Any
  object LogLevel {
    val DEBUG = "DEBUG".asInstanceOf[LogLevel]
    val INFO = "INFO".asInstanceOf[LogLevel]
    val ERROR = "ERROR".asInstanceOf[LogLevel]
    val WARN = "WARN".asInstanceOf[LogLevel]
    val DISABLED = "DISABLED".asInstanceOf[LogLevel]

    @inline def values = js.Array(DEBUG, INFO, ERROR, WARN, DISABLED)
  }

  /** A log target.
    */
  @js.native
  trait LogTarget extends js.Object {
    var targetType: LogTargetType
    var targetName: js.UndefOr[LogTargetName]
  }

  object LogTarget {
    @inline
    def apply(
        targetType: LogTargetType,
        targetName: js.UndefOr[LogTargetName] = js.undefined
    ): LogTarget = {
      val __obj = js.Dynamic.literal(
        "targetType" -> targetType.asInstanceOf[js.Any]
      )

      targetName.foreach(__v => __obj.updateDynamic("targetName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogTarget]
    }
  }

  /** The target configuration.
    */
  @js.native
  trait LogTargetConfiguration extends js.Object {
    var logLevel: js.UndefOr[LogLevel]
    var logTarget: js.UndefOr[LogTarget]
  }

  object LogTargetConfiguration {
    @inline
    def apply(
        logLevel: js.UndefOr[LogLevel] = js.undefined,
        logTarget: js.UndefOr[LogTarget] = js.undefined
    ): LogTargetConfiguration = {
      val __obj = js.Dynamic.literal()
      logLevel.foreach(__v => __obj.updateDynamic("logLevel")(__v.asInstanceOf[js.Any]))
      logTarget.foreach(__v => __obj.updateDynamic("logTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogTargetConfiguration]
    }
  }

  @js.native
  sealed trait LogTargetType extends js.Any
  object LogTargetType {
    val DEFAULT = "DEFAULT".asInstanceOf[LogTargetType]
    val THING_GROUP = "THING_GROUP".asInstanceOf[LogTargetType]

    @inline def values = js.Array(DEFAULT, THING_GROUP)
  }

  /** Describes the logging options payload.
    */
  @js.native
  trait LoggingOptionsPayload extends js.Object {
    var roleArn: AwsArn
    var logLevel: js.UndefOr[LogLevel]
  }

  object LoggingOptionsPayload {
    @inline
    def apply(
        roleArn: AwsArn,
        logLevel: js.UndefOr[LogLevel] = js.undefined
    ): LoggingOptionsPayload = {
      val __obj = js.Dynamic.literal(
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      logLevel.foreach(__v => __obj.updateDynamic("logLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingOptionsPayload]
    }
  }

  /** The configuration of an ML Detect Security Profile.
    */
  @js.native
  trait MachineLearningDetectionConfig extends js.Object {
    var confidenceLevel: ConfidenceLevel
  }

  object MachineLearningDetectionConfig {
    @inline
    def apply(
        confidenceLevel: ConfidenceLevel
    ): MachineLearningDetectionConfig = {
      val __obj = js.Dynamic.literal(
        "confidenceLevel" -> confidenceLevel.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MachineLearningDetectionConfig]
    }
  }

  @js.native
  sealed trait MessageFormat extends js.Any
  object MessageFormat {
    val RAW = "RAW".asInstanceOf[MessageFormat]
    val JSON = "JSON".asInstanceOf[MessageFormat]

    @inline def values = js.Array(RAW, JSON)
  }

  /** The dimension of a metric.
    */
  @js.native
  trait MetricDimension extends js.Object {
    var dimensionName: DimensionName
    var operator: js.UndefOr[DimensionValueOperator]
  }

  object MetricDimension {
    @inline
    def apply(
        dimensionName: DimensionName,
        operator: js.UndefOr[DimensionValueOperator] = js.undefined
    ): MetricDimension = {
      val __obj = js.Dynamic.literal(
        "dimensionName" -> dimensionName.asInstanceOf[js.Any]
      )

      operator.foreach(__v => __obj.updateDynamic("operator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDimension]
    }
  }

  /** The metric you want to retain. Dimensions are optional.
    */
  @js.native
  trait MetricToRetain extends js.Object {
    var metric: BehaviorMetric
    var metricDimension: js.UndefOr[MetricDimension]
  }

  object MetricToRetain {
    @inline
    def apply(
        metric: BehaviorMetric,
        metricDimension: js.UndefOr[MetricDimension] = js.undefined
    ): MetricToRetain = {
      val __obj = js.Dynamic.literal(
        "metric" -> metric.asInstanceOf[js.Any]
      )

      metricDimension.foreach(__v => __obj.updateDynamic("metricDimension")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricToRetain]
    }
  }

  /** The value to be compared with the <code>metric</code>.
    */
  @js.native
  trait MetricValue extends js.Object {
    var cidrs: js.UndefOr[Cidrs]
    var count: js.UndefOr[UnsignedLong]
    var number: js.UndefOr[Number]
    var numbers: js.UndefOr[NumberList]
    var ports: js.UndefOr[Ports]
    var strings: js.UndefOr[StringList]
  }

  object MetricValue {
    @inline
    def apply(
        cidrs: js.UndefOr[Cidrs] = js.undefined,
        count: js.UndefOr[UnsignedLong] = js.undefined,
        number: js.UndefOr[Number] = js.undefined,
        numbers: js.UndefOr[NumberList] = js.undefined,
        ports: js.UndefOr[Ports] = js.undefined,
        strings: js.UndefOr[StringList] = js.undefined
    ): MetricValue = {
      val __obj = js.Dynamic.literal()
      cidrs.foreach(__v => __obj.updateDynamic("cidrs")(__v.asInstanceOf[js.Any]))
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      number.foreach(__v => __obj.updateDynamic("number")(__v.asInstanceOf[js.Any]))
      numbers.foreach(__v => __obj.updateDynamic("numbers")(__v.asInstanceOf[js.Any]))
      ports.foreach(__v => __obj.updateDynamic("ports")(__v.asInstanceOf[js.Any]))
      strings.foreach(__v => __obj.updateDynamic("strings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricValue]
    }
  }

  /** Describes which changes should be applied as part of a mitigation action.
    */
  @js.native
  trait MitigationAction extends js.Object {
    var actionParams: js.UndefOr[MitigationActionParams]
    var id: js.UndefOr[MitigationActionId]
    var name: js.UndefOr[MitigationActionName]
    var roleArn: js.UndefOr[RoleArn]
  }

  object MitigationAction {
    @inline
    def apply(
        actionParams: js.UndefOr[MitigationActionParams] = js.undefined,
        id: js.UndefOr[MitigationActionId] = js.undefined,
        name: js.UndefOr[MitigationActionName] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): MitigationAction = {
      val __obj = js.Dynamic.literal()
      actionParams.foreach(__v => __obj.updateDynamic("actionParams")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MitigationAction]
    }
  }

  /** Information that identifies a mitigation action. This information is returned by ListMitigationActions.
    */
  @js.native
  trait MitigationActionIdentifier extends js.Object {
    var actionArn: js.UndefOr[MitigationActionArn]
    var actionName: js.UndefOr[MitigationActionName]
    var creationDate: js.UndefOr[Timestamp]
  }

  object MitigationActionIdentifier {
    @inline
    def apply(
        actionArn: js.UndefOr[MitigationActionArn] = js.undefined,
        actionName: js.UndefOr[MitigationActionName] = js.undefined,
        creationDate: js.UndefOr[Timestamp] = js.undefined
    ): MitigationActionIdentifier = {
      val __obj = js.Dynamic.literal()
      actionArn.foreach(__v => __obj.updateDynamic("actionArn")(__v.asInstanceOf[js.Any]))
      actionName.foreach(__v => __obj.updateDynamic("actionName")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MitigationActionIdentifier]
    }
  }

  /** The set of parameters for this mitigation action. You can specify only one type of parameter (in other words, you can apply only one action for each defined mitigation action).
    */
  @js.native
  trait MitigationActionParams extends js.Object {
    var addThingsToThingGroupParams: js.UndefOr[AddThingsToThingGroupParams]
    var enableIoTLoggingParams: js.UndefOr[EnableIoTLoggingParams]
    var publishFindingToSnsParams: js.UndefOr[PublishFindingToSnsParams]
    var replaceDefaultPolicyVersionParams: js.UndefOr[ReplaceDefaultPolicyVersionParams]
    var updateCACertificateParams: js.UndefOr[UpdateCACertificateParams]
    var updateDeviceCertificateParams: js.UndefOr[UpdateDeviceCertificateParams]
  }

  object MitigationActionParams {
    @inline
    def apply(
        addThingsToThingGroupParams: js.UndefOr[AddThingsToThingGroupParams] = js.undefined,
        enableIoTLoggingParams: js.UndefOr[EnableIoTLoggingParams] = js.undefined,
        publishFindingToSnsParams: js.UndefOr[PublishFindingToSnsParams] = js.undefined,
        replaceDefaultPolicyVersionParams: js.UndefOr[ReplaceDefaultPolicyVersionParams] = js.undefined,
        updateCACertificateParams: js.UndefOr[UpdateCACertificateParams] = js.undefined,
        updateDeviceCertificateParams: js.UndefOr[UpdateDeviceCertificateParams] = js.undefined
    ): MitigationActionParams = {
      val __obj = js.Dynamic.literal()
      addThingsToThingGroupParams.foreach(__v => __obj.updateDynamic("addThingsToThingGroupParams")(__v.asInstanceOf[js.Any]))
      enableIoTLoggingParams.foreach(__v => __obj.updateDynamic("enableIoTLoggingParams")(__v.asInstanceOf[js.Any]))
      publishFindingToSnsParams.foreach(__v => __obj.updateDynamic("publishFindingToSnsParams")(__v.asInstanceOf[js.Any]))
      replaceDefaultPolicyVersionParams.foreach(__v => __obj.updateDynamic("replaceDefaultPolicyVersionParams")(__v.asInstanceOf[js.Any]))
      updateCACertificateParams.foreach(__v => __obj.updateDynamic("updateCACertificateParams")(__v.asInstanceOf[js.Any]))
      updateDeviceCertificateParams.foreach(__v => __obj.updateDynamic("updateDeviceCertificateParams")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MitigationActionParams]
    }
  }

  @js.native
  sealed trait MitigationActionType extends js.Any
  object MitigationActionType {
    val UPDATE_DEVICE_CERTIFICATE = "UPDATE_DEVICE_CERTIFICATE".asInstanceOf[MitigationActionType]
    val UPDATE_CA_CERTIFICATE = "UPDATE_CA_CERTIFICATE".asInstanceOf[MitigationActionType]
    val ADD_THINGS_TO_THING_GROUP = "ADD_THINGS_TO_THING_GROUP".asInstanceOf[MitigationActionType]
    val REPLACE_DEFAULT_POLICY_VERSION = "REPLACE_DEFAULT_POLICY_VERSION".asInstanceOf[MitigationActionType]
    val ENABLE_IOT_LOGGING = "ENABLE_IOT_LOGGING".asInstanceOf[MitigationActionType]
    val PUBLISH_FINDING_TO_SNS = "PUBLISH_FINDING_TO_SNS".asInstanceOf[MitigationActionType]

    @inline def values = js.Array(UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE, ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION, ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS)
  }

  @js.native
  sealed trait ModelStatus extends js.Any
  object ModelStatus {
    val PENDING_BUILD = "PENDING_BUILD".asInstanceOf[ModelStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[ModelStatus]
    val EXPIRED = "EXPIRED".asInstanceOf[ModelStatus]

    @inline def values = js.Array(PENDING_BUILD, ACTIVE, EXPIRED)
  }

  /** Specifies the MQTT context to use for the test authorizer request
    */
  @js.native
  trait MqttContext extends js.Object {
    var clientId: js.UndefOr[MqttClientId]
    var password: js.UndefOr[MqttPassword]
    var username: js.UndefOr[MqttUsername]
  }

  object MqttContext {
    @inline
    def apply(
        clientId: js.UndefOr[MqttClientId] = js.undefined,
        password: js.UndefOr[MqttPassword] = js.undefined,
        username: js.UndefOr[MqttUsername] = js.undefined
    ): MqttContext = {
      val __obj = js.Dynamic.literal()
      clientId.foreach(__v => __obj.updateDynamic("clientId")(__v.asInstanceOf[js.Any]))
      password.foreach(__v => __obj.updateDynamic("password")(__v.asInstanceOf[js.Any]))
      username.foreach(__v => __obj.updateDynamic("username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MqttContext]
    }
  }

  /** Information about the resource that was noncompliant with the audit check.
    */
  @js.native
  trait NonCompliantResource extends js.Object {
    var additionalInfo: js.UndefOr[StringMap]
    var resourceIdentifier: js.UndefOr[ResourceIdentifier]
    var resourceType: js.UndefOr[ResourceType]
  }

  object NonCompliantResource {
    @inline
    def apply(
        additionalInfo: js.UndefOr[StringMap] = js.undefined,
        resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): NonCompliantResource = {
      val __obj = js.Dynamic.literal()
      additionalInfo.foreach(__v => __obj.updateDynamic("additionalInfo")(__v.asInstanceOf[js.Any]))
      resourceIdentifier.foreach(__v => __obj.updateDynamic("resourceIdentifier")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NonCompliantResource]
    }
  }

  /** Describes a file to be associated with an OTA update.
    */
  @js.native
  trait OTAUpdateFile extends js.Object {
    var attributes: js.UndefOr[AttributesMap]
    var codeSigning: js.UndefOr[CodeSigning]
    var fileLocation: js.UndefOr[FileLocation]
    var fileName: js.UndefOr[FileName]
    var fileType: js.UndefOr[FileType]
    var fileVersion: js.UndefOr[OTAUpdateFileVersion]
  }

  object OTAUpdateFile {
    @inline
    def apply(
        attributes: js.UndefOr[AttributesMap] = js.undefined,
        codeSigning: js.UndefOr[CodeSigning] = js.undefined,
        fileLocation: js.UndefOr[FileLocation] = js.undefined,
        fileName: js.UndefOr[FileName] = js.undefined,
        fileType: js.UndefOr[FileType] = js.undefined,
        fileVersion: js.UndefOr[OTAUpdateFileVersion] = js.undefined
    ): OTAUpdateFile = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      codeSigning.foreach(__v => __obj.updateDynamic("codeSigning")(__v.asInstanceOf[js.Any]))
      fileLocation.foreach(__v => __obj.updateDynamic("fileLocation")(__v.asInstanceOf[js.Any]))
      fileName.foreach(__v => __obj.updateDynamic("fileName")(__v.asInstanceOf[js.Any]))
      fileType.foreach(__v => __obj.updateDynamic("fileType")(__v.asInstanceOf[js.Any]))
      fileVersion.foreach(__v => __obj.updateDynamic("fileVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OTAUpdateFile]
    }
  }

  /** Information about an OTA update.
    */
  @js.native
  trait OTAUpdateInfo extends js.Object {
    var additionalParameters: js.UndefOr[AdditionalParameterMap]
    var awsIotJobArn: js.UndefOr[AwsIotJobArn]
    var awsIotJobId: js.UndefOr[AwsIotJobId]
    var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig]
    var awsJobPresignedUrlConfig: js.UndefOr[AwsJobPresignedUrlConfig]
    var creationDate: js.UndefOr[DateType]
    var description: js.UndefOr[OTAUpdateDescription]
    var errorInfo: js.UndefOr[ErrorInfo]
    var lastModifiedDate: js.UndefOr[DateType]
    var otaUpdateArn: js.UndefOr[OTAUpdateArn]
    var otaUpdateFiles: js.UndefOr[OTAUpdateFiles]
    var otaUpdateId: js.UndefOr[OTAUpdateId]
    var otaUpdateStatus: js.UndefOr[OTAUpdateStatus]
    var protocols: js.UndefOr[Protocols]
    var targetSelection: js.UndefOr[TargetSelection]
    var targets: js.UndefOr[Targets]
  }

  object OTAUpdateInfo {
    @inline
    def apply(
        additionalParameters: js.UndefOr[AdditionalParameterMap] = js.undefined,
        awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.undefined,
        awsIotJobId: js.UndefOr[AwsIotJobId] = js.undefined,
        awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.undefined,
        awsJobPresignedUrlConfig: js.UndefOr[AwsJobPresignedUrlConfig] = js.undefined,
        creationDate: js.UndefOr[DateType] = js.undefined,
        description: js.UndefOr[OTAUpdateDescription] = js.undefined,
        errorInfo: js.UndefOr[ErrorInfo] = js.undefined,
        lastModifiedDate: js.UndefOr[DateType] = js.undefined,
        otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined,
        otaUpdateFiles: js.UndefOr[OTAUpdateFiles] = js.undefined,
        otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined,
        otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined,
        protocols: js.UndefOr[Protocols] = js.undefined,
        targetSelection: js.UndefOr[TargetSelection] = js.undefined,
        targets: js.UndefOr[Targets] = js.undefined
    ): OTAUpdateInfo = {
      val __obj = js.Dynamic.literal()
      additionalParameters.foreach(__v => __obj.updateDynamic("additionalParameters")(__v.asInstanceOf[js.Any]))
      awsIotJobArn.foreach(__v => __obj.updateDynamic("awsIotJobArn")(__v.asInstanceOf[js.Any]))
      awsIotJobId.foreach(__v => __obj.updateDynamic("awsIotJobId")(__v.asInstanceOf[js.Any]))
      awsJobExecutionsRolloutConfig.foreach(__v => __obj.updateDynamic("awsJobExecutionsRolloutConfig")(__v.asInstanceOf[js.Any]))
      awsJobPresignedUrlConfig.foreach(__v => __obj.updateDynamic("awsJobPresignedUrlConfig")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      errorInfo.foreach(__v => __obj.updateDynamic("errorInfo")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      otaUpdateArn.foreach(__v => __obj.updateDynamic("otaUpdateArn")(__v.asInstanceOf[js.Any]))
      otaUpdateFiles.foreach(__v => __obj.updateDynamic("otaUpdateFiles")(__v.asInstanceOf[js.Any]))
      otaUpdateId.foreach(__v => __obj.updateDynamic("otaUpdateId")(__v.asInstanceOf[js.Any]))
      otaUpdateStatus.foreach(__v => __obj.updateDynamic("otaUpdateStatus")(__v.asInstanceOf[js.Any]))
      protocols.foreach(__v => __obj.updateDynamic("protocols")(__v.asInstanceOf[js.Any]))
      targetSelection.foreach(__v => __obj.updateDynamic("targetSelection")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OTAUpdateInfo]
    }
  }

  @js.native
  sealed trait OTAUpdateStatus extends js.Any
  object OTAUpdateStatus {
    val CREATE_PENDING = "CREATE_PENDING".asInstanceOf[OTAUpdateStatus]
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[OTAUpdateStatus]
    val CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[OTAUpdateStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[OTAUpdateStatus]

    @inline def values = js.Array(CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED)
  }

  /** An OTA update summary.
    */
  @js.native
  trait OTAUpdateSummary extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var otaUpdateArn: js.UndefOr[OTAUpdateArn]
    var otaUpdateId: js.UndefOr[OTAUpdateId]
  }

  object OTAUpdateSummary {
    @inline
    def apply(
        creationDate: js.UndefOr[DateType] = js.undefined,
        otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined,
        otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined
    ): OTAUpdateSummary = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      otaUpdateArn.foreach(__v => __obj.updateDynamic("otaUpdateArn")(__v.asInstanceOf[js.Any]))
      otaUpdateId.foreach(__v => __obj.updateDynamic("otaUpdateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OTAUpdateSummary]
    }
  }

  /** A certificate that has been transferred but not yet accepted.
    */
  @js.native
  trait OutgoingCertificate extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var creationDate: js.UndefOr[DateType]
    var transferDate: js.UndefOr[DateType]
    var transferMessage: js.UndefOr[Message]
    var transferredTo: js.UndefOr[AwsAccountId]
  }

  object OutgoingCertificate {
    @inline
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        creationDate: js.UndefOr[DateType] = js.undefined,
        transferDate: js.UndefOr[DateType] = js.undefined,
        transferMessage: js.UndefOr[Message] = js.undefined,
        transferredTo: js.UndefOr[AwsAccountId] = js.undefined
    ): OutgoingCertificate = {
      val __obj = js.Dynamic.literal()
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      certificateId.foreach(__v => __obj.updateDynamic("certificateId")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      transferDate.foreach(__v => __obj.updateDynamic("transferDate")(__v.asInstanceOf[js.Any]))
      transferMessage.foreach(__v => __obj.updateDynamic("transferMessage")(__v.asInstanceOf[js.Any]))
      transferredTo.foreach(__v => __obj.updateDynamic("transferredTo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutgoingCertificate]
    }
  }

  /** Describes the percentile and percentile value.
    */
  @js.native
  trait PercentPair extends js.Object {
    var percent: js.UndefOr[Percent]
    var value: js.UndefOr[PercentValue]
  }

  object PercentPair {
    @inline
    def apply(
        percent: js.UndefOr[Percent] = js.undefined,
        value: js.UndefOr[PercentValue] = js.undefined
    ): PercentPair = {
      val __obj = js.Dynamic.literal()
      percent.foreach(__v => __obj.updateDynamic("percent")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PercentPair]
    }
  }

  /** Describes an AWS IoT policy.
    */
  @js.native
  trait Policy extends js.Object {
    var policyArn: js.UndefOr[PolicyArn]
    var policyName: js.UndefOr[PolicyName]
  }

  object Policy {
    @inline
    def apply(
        policyArn: js.UndefOr[PolicyArn] = js.undefined,
        policyName: js.UndefOr[PolicyName] = js.undefined
    ): Policy = {
      val __obj = js.Dynamic.literal()
      policyArn.foreach(__v => __obj.updateDynamic("policyArn")(__v.asInstanceOf[js.Any]))
      policyName.foreach(__v => __obj.updateDynamic("policyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Policy]
    }
  }

  @js.native
  sealed trait PolicyTemplateName extends js.Any
  object PolicyTemplateName {
    val BLANK_POLICY = "BLANK_POLICY".asInstanceOf[PolicyTemplateName]

    @inline def values = js.Array(BLANK_POLICY)
  }

  /** Describes a policy version.
    */
  @js.native
  trait PolicyVersion extends js.Object {
    var createDate: js.UndefOr[DateType]
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var versionId: js.UndefOr[PolicyVersionId]
  }

  object PolicyVersion {
    @inline
    def apply(
        createDate: js.UndefOr[DateType] = js.undefined,
        isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
        versionId: js.UndefOr[PolicyVersionId] = js.undefined
    ): PolicyVersion = {
      val __obj = js.Dynamic.literal()
      createDate.foreach(__v => __obj.updateDynamic("createDate")(__v.asInstanceOf[js.Any]))
      isDefaultVersion.foreach(__v => __obj.updateDynamic("isDefaultVersion")(__v.asInstanceOf[js.Any]))
      versionId.foreach(__v => __obj.updateDynamic("versionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyVersion]
    }
  }

  /** Information about the version of the policy associated with the resource.
    */
  @js.native
  trait PolicyVersionIdentifier extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyVersionId: js.UndefOr[PolicyVersionId]
  }

  object PolicyVersionIdentifier {
    @inline
    def apply(
        policyName: js.UndefOr[PolicyName] = js.undefined,
        policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
    ): PolicyVersionIdentifier = {
      val __obj = js.Dynamic.literal()
      policyName.foreach(__v => __obj.updateDynamic("policyName")(__v.asInstanceOf[js.Any]))
      policyVersionId.foreach(__v => __obj.updateDynamic("policyVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyVersionIdentifier]
    }
  }

  /** Configuration for pre-signed S3 URLs.
    */
  @js.native
  trait PresignedUrlConfig extends js.Object {
    var expiresInSec: js.UndefOr[ExpiresInSec]
    var roleArn: js.UndefOr[RoleArn]
  }

  object PresignedUrlConfig {
    @inline
    def apply(
        expiresInSec: js.UndefOr[ExpiresInSec] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): PresignedUrlConfig = {
      val __obj = js.Dynamic.literal()
      expiresInSec.foreach(__v => __obj.updateDynamic("expiresInSec")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PresignedUrlConfig]
    }
  }

  @js.native
  sealed trait Protocol extends js.Any
  object Protocol {
    val MQTT = "MQTT".asInstanceOf[Protocol]
    val HTTP = "HTTP".asInstanceOf[Protocol]

    @inline def values = js.Array(MQTT, HTTP)
  }

  /** Structure that contains <code>payloadVersion</code> and <code>targetArn</code>.
    */
  @js.native
  trait ProvisioningHook extends js.Object {
    var targetArn: TargetArn
    var payloadVersion: js.UndefOr[PayloadVersion]
  }

  object ProvisioningHook {
    @inline
    def apply(
        targetArn: TargetArn,
        payloadVersion: js.UndefOr[PayloadVersion] = js.undefined
    ): ProvisioningHook = {
      val __obj = js.Dynamic.literal(
        "targetArn" -> targetArn.asInstanceOf[js.Any]
      )

      payloadVersion.foreach(__v => __obj.updateDynamic("payloadVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningHook]
    }
  }

  /** A summary of information about a fleet provisioning template.
    */
  @js.native
  trait ProvisioningTemplateSummary extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var description: js.UndefOr[TemplateDescription]
    var enabled: js.UndefOr[Enabled]
    var lastModifiedDate: js.UndefOr[DateType]
    var templateArn: js.UndefOr[TemplateArn]
    var templateName: js.UndefOr[TemplateName]
  }

  object ProvisioningTemplateSummary {
    @inline
    def apply(
        creationDate: js.UndefOr[DateType] = js.undefined,
        description: js.UndefOr[TemplateDescription] = js.undefined,
        enabled: js.UndefOr[Enabled] = js.undefined,
        lastModifiedDate: js.UndefOr[DateType] = js.undefined,
        templateArn: js.UndefOr[TemplateArn] = js.undefined,
        templateName: js.UndefOr[TemplateName] = js.undefined
    ): ProvisioningTemplateSummary = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      templateArn.foreach(__v => __obj.updateDynamic("templateArn")(__v.asInstanceOf[js.Any]))
      templateName.foreach(__v => __obj.updateDynamic("templateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningTemplateSummary]
    }
  }

  /** A summary of information about a fleet provision template version.
    */
  @js.native
  trait ProvisioningTemplateVersionSummary extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var versionId: js.UndefOr[TemplateVersionId]
  }

  object ProvisioningTemplateVersionSummary {
    @inline
    def apply(
        creationDate: js.UndefOr[DateType] = js.undefined,
        isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
        versionId: js.UndefOr[TemplateVersionId] = js.undefined
    ): ProvisioningTemplateVersionSummary = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      isDefaultVersion.foreach(__v => __obj.updateDynamic("isDefaultVersion")(__v.asInstanceOf[js.Any]))
      versionId.foreach(__v => __obj.updateDynamic("versionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningTemplateVersionSummary]
    }
  }

  /** Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom actions in response to the Amazon SNS messages.
    */
  @js.native
  trait PublishFindingToSnsParams extends js.Object {
    var topicArn: SnsTopicArn
  }

  object PublishFindingToSnsParams {
    @inline
    def apply(
        topicArn: SnsTopicArn
    ): PublishFindingToSnsParams = {
      val __obj = js.Dynamic.literal(
        "topicArn" -> topicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PublishFindingToSnsParams]
    }
  }

  /** An asset property value entry containing the following information.
    */
  @js.native
  trait PutAssetPropertyValueEntry extends js.Object {
    var propertyValues: AssetPropertyValueList
    var assetId: js.UndefOr[AssetId]
    var entryId: js.UndefOr[AssetPropertyEntryId]
    var propertyAlias: js.UndefOr[AssetPropertyAlias]
    var propertyId: js.UndefOr[AssetPropertyId]
  }

  object PutAssetPropertyValueEntry {
    @inline
    def apply(
        propertyValues: AssetPropertyValueList,
        assetId: js.UndefOr[AssetId] = js.undefined,
        entryId: js.UndefOr[AssetPropertyEntryId] = js.undefined,
        propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined,
        propertyId: js.UndefOr[AssetPropertyId] = js.undefined
    ): PutAssetPropertyValueEntry = {
      val __obj = js.Dynamic.literal(
        "propertyValues" -> propertyValues.asInstanceOf[js.Any]
      )

      assetId.foreach(__v => __obj.updateDynamic("assetId")(__v.asInstanceOf[js.Any]))
      entryId.foreach(__v => __obj.updateDynamic("entryId")(__v.asInstanceOf[js.Any]))
      propertyAlias.foreach(__v => __obj.updateDynamic("propertyAlias")(__v.asInstanceOf[js.Any]))
      propertyId.foreach(__v => __obj.updateDynamic("propertyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAssetPropertyValueEntry]
    }
  }

  /** The input for the DynamoActionVS action that specifies the DynamoDB table to which the message data will be written.
    */
  @js.native
  trait PutItemInput extends js.Object {
    var tableName: TableName
  }

  object PutItemInput {
    @inline
    def apply(
        tableName: TableName
    ): PutItemInput = {
      val __obj = js.Dynamic.literal(
        "tableName" -> tableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutItemInput]
    }
  }

  /** Allows you to define a criteria to initiate the increase in rate of rollout for a job.
    */
  @js.native
  trait RateIncreaseCriteria extends js.Object {
    var numberOfNotifiedThings: js.UndefOr[NumberOfThings]
    var numberOfSucceededThings: js.UndefOr[NumberOfThings]
  }

  object RateIncreaseCriteria {
    @inline
    def apply(
        numberOfNotifiedThings: js.UndefOr[NumberOfThings] = js.undefined,
        numberOfSucceededThings: js.UndefOr[NumberOfThings] = js.undefined
    ): RateIncreaseCriteria = {
      val __obj = js.Dynamic.literal()
      numberOfNotifiedThings.foreach(__v => __obj.updateDynamic("numberOfNotifiedThings")(__v.asInstanceOf[js.Any]))
      numberOfSucceededThings.foreach(__v => __obj.updateDynamic("numberOfSucceededThings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RateIncreaseCriteria]
    }
  }

  /** The input to the RegisterCACertificate operation.
    */
  @js.native
  trait RegisterCACertificateRequest extends js.Object {
    var caCertificate: CertificatePem
    var verificationCertificate: CertificatePem
    var allowAutoRegistration: js.UndefOr[AllowAutoRegistration]
    var registrationConfig: js.UndefOr[RegistrationConfig]
    var setAsActive: js.UndefOr[SetAsActive]
    var tags: js.UndefOr[TagList]
  }

  object RegisterCACertificateRequest {
    @inline
    def apply(
        caCertificate: CertificatePem,
        verificationCertificate: CertificatePem,
        allowAutoRegistration: js.UndefOr[AllowAutoRegistration] = js.undefined,
        registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined,
        setAsActive: js.UndefOr[SetAsActive] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): RegisterCACertificateRequest = {
      val __obj = js.Dynamic.literal(
        "caCertificate" -> caCertificate.asInstanceOf[js.Any],
        "verificationCertificate" -> verificationCertificate.asInstanceOf[js.Any]
      )

      allowAutoRegistration.foreach(__v => __obj.updateDynamic("allowAutoRegistration")(__v.asInstanceOf[js.Any]))
      registrationConfig.foreach(__v => __obj.updateDynamic("registrationConfig")(__v.asInstanceOf[js.Any]))
      setAsActive.foreach(__v => __obj.updateDynamic("setAsActive")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterCACertificateRequest]
    }
  }

  /** The output from the RegisterCACertificateResponse operation.
    */
  @js.native
  trait RegisterCACertificateResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
  }

  object RegisterCACertificateResponse {
    @inline
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined
    ): RegisterCACertificateResponse = {
      val __obj = js.Dynamic.literal()
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      certificateId.foreach(__v => __obj.updateDynamic("certificateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterCACertificateResponse]
    }
  }

  /** The input to the RegisterCertificate operation.
    */
  @js.native
  trait RegisterCertificateRequest extends js.Object {
    var certificatePem: CertificatePem
    var caCertificatePem: js.UndefOr[CertificatePem]
    var setAsActive: js.UndefOr[SetAsActiveFlag]
    var status: js.UndefOr[CertificateStatus]
  }

  object RegisterCertificateRequest {
    @inline
    def apply(
        certificatePem: CertificatePem,
        caCertificatePem: js.UndefOr[CertificatePem] = js.undefined,
        setAsActive: js.UndefOr[SetAsActiveFlag] = js.undefined,
        status: js.UndefOr[CertificateStatus] = js.undefined
    ): RegisterCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "certificatePem" -> certificatePem.asInstanceOf[js.Any]
      )

      caCertificatePem.foreach(__v => __obj.updateDynamic("caCertificatePem")(__v.asInstanceOf[js.Any]))
      setAsActive.foreach(__v => __obj.updateDynamic("setAsActive")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterCertificateRequest]
    }
  }

  /** The output from the RegisterCertificate operation.
    */
  @js.native
  trait RegisterCertificateResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
  }

  object RegisterCertificateResponse {
    @inline
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined
    ): RegisterCertificateResponse = {
      val __obj = js.Dynamic.literal()
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      certificateId.foreach(__v => __obj.updateDynamic("certificateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterCertificateResponse]
    }
  }

  @js.native
  trait RegisterCertificateWithoutCARequest extends js.Object {
    var certificatePem: CertificatePem
    var status: js.UndefOr[CertificateStatus]
  }

  object RegisterCertificateWithoutCARequest {
    @inline
    def apply(
        certificatePem: CertificatePem,
        status: js.UndefOr[CertificateStatus] = js.undefined
    ): RegisterCertificateWithoutCARequest = {
      val __obj = js.Dynamic.literal(
        "certificatePem" -> certificatePem.asInstanceOf[js.Any]
      )

      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterCertificateWithoutCARequest]
    }
  }

  @js.native
  trait RegisterCertificateWithoutCAResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
  }

  object RegisterCertificateWithoutCAResponse {
    @inline
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined
    ): RegisterCertificateWithoutCAResponse = {
      val __obj = js.Dynamic.literal()
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      certificateId.foreach(__v => __obj.updateDynamic("certificateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterCertificateWithoutCAResponse]
    }
  }

  @js.native
  trait RegisterThingRequest extends js.Object {
    var templateBody: TemplateBody
    var parameters: js.UndefOr[Parameters]
  }

  object RegisterThingRequest {
    @inline
    def apply(
        templateBody: TemplateBody,
        parameters: js.UndefOr[Parameters] = js.undefined
    ): RegisterThingRequest = {
      val __obj = js.Dynamic.literal(
        "templateBody" -> templateBody.asInstanceOf[js.Any]
      )

      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterThingRequest]
    }
  }

  @js.native
  trait RegisterThingResponse extends js.Object {
    var certificatePem: js.UndefOr[CertificatePem]
    var resourceArns: js.UndefOr[ResourceArns]
  }

  object RegisterThingResponse {
    @inline
    def apply(
        certificatePem: js.UndefOr[CertificatePem] = js.undefined,
        resourceArns: js.UndefOr[ResourceArns] = js.undefined
    ): RegisterThingResponse = {
      val __obj = js.Dynamic.literal()
      certificatePem.foreach(__v => __obj.updateDynamic("certificatePem")(__v.asInstanceOf[js.Any]))
      resourceArns.foreach(__v => __obj.updateDynamic("resourceArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterThingResponse]
    }
  }

  /** The registration configuration.
    */
  @js.native
  trait RegistrationConfig extends js.Object {
    var roleArn: js.UndefOr[RoleArn]
    var templateBody: js.UndefOr[TemplateBody]
  }

  object RegistrationConfig {
    @inline
    def apply(
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        templateBody: js.UndefOr[TemplateBody] = js.undefined
    ): RegistrationConfig = {
      val __obj = js.Dynamic.literal()
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      templateBody.foreach(__v => __obj.updateDynamic("templateBody")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegistrationConfig]
    }
  }

  /** The input for the RejectCertificateTransfer operation.
    */
  @js.native
  trait RejectCertificateTransferRequest extends js.Object {
    var certificateId: CertificateId
    var rejectReason: js.UndefOr[Message]
  }

  object RejectCertificateTransferRequest {
    @inline
    def apply(
        certificateId: CertificateId,
        rejectReason: js.UndefOr[Message] = js.undefined
    ): RejectCertificateTransferRequest = {
      val __obj = js.Dynamic.literal(
        "certificateId" -> certificateId.asInstanceOf[js.Any]
      )

      rejectReason.foreach(__v => __obj.updateDynamic("rejectReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RejectCertificateTransferRequest]
    }
  }

  /** Information about a related resource.
    */
  @js.native
  trait RelatedResource extends js.Object {
    var additionalInfo: js.UndefOr[StringMap]
    var resourceIdentifier: js.UndefOr[ResourceIdentifier]
    var resourceType: js.UndefOr[ResourceType]
  }

  object RelatedResource {
    @inline
    def apply(
        additionalInfo: js.UndefOr[StringMap] = js.undefined,
        resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): RelatedResource = {
      val __obj = js.Dynamic.literal()
      additionalInfo.foreach(__v => __obj.updateDynamic("additionalInfo")(__v.asInstanceOf[js.Any]))
      resourceIdentifier.foreach(__v => __obj.updateDynamic("resourceIdentifier")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelatedResource]
    }
  }

  @js.native
  trait RemoveThingFromBillingGroupRequest extends js.Object {
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var billingGroupName: js.UndefOr[BillingGroupName]
    var thingArn: js.UndefOr[ThingArn]
    var thingName: js.UndefOr[ThingName]
  }

  object RemoveThingFromBillingGroupRequest {
    @inline
    def apply(
        billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
        billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): RemoveThingFromBillingGroupRequest = {
      val __obj = js.Dynamic.literal()
      billingGroupArn.foreach(__v => __obj.updateDynamic("billingGroupArn")(__v.asInstanceOf[js.Any]))
      billingGroupName.foreach(__v => __obj.updateDynamic("billingGroupName")(__v.asInstanceOf[js.Any]))
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveThingFromBillingGroupRequest]
    }
  }

  @js.native
  trait RemoveThingFromBillingGroupResponse extends js.Object

  object RemoveThingFromBillingGroupResponse {
    @inline
    def apply(): RemoveThingFromBillingGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveThingFromBillingGroupResponse]
    }
  }

  @js.native
  trait RemoveThingFromThingGroupRequest extends js.Object {
    var thingArn: js.UndefOr[ThingArn]
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingGroupName: js.UndefOr[ThingGroupName]
    var thingName: js.UndefOr[ThingName]
  }

  object RemoveThingFromThingGroupRequest {
    @inline
    def apply(
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): RemoveThingFromThingGroupRequest = {
      val __obj = js.Dynamic.literal()
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      thingGroupArn.foreach(__v => __obj.updateDynamic("thingGroupArn")(__v.asInstanceOf[js.Any]))
      thingGroupName.foreach(__v => __obj.updateDynamic("thingGroupName")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveThingFromThingGroupRequest]
    }
  }

  @js.native
  trait RemoveThingFromThingGroupResponse extends js.Object

  object RemoveThingFromThingGroupResponse {
    @inline
    def apply(): RemoveThingFromThingGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveThingFromThingGroupResponse]
    }
  }

  /** Parameters to define a mitigation action that adds a blank policy to restrict permissions.
    */
  @js.native
  trait ReplaceDefaultPolicyVersionParams extends js.Object {
    var templateName: PolicyTemplateName
  }

  object ReplaceDefaultPolicyVersionParams {
    @inline
    def apply(
        templateName: PolicyTemplateName
    ): ReplaceDefaultPolicyVersionParams = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ReplaceDefaultPolicyVersionParams]
    }
  }

  /** The input for the ReplaceTopicRule operation.
    */
  @js.native
  trait ReplaceTopicRuleRequest extends js.Object {
    var ruleName: RuleName
    var topicRulePayload: TopicRulePayload
  }

  object ReplaceTopicRuleRequest {
    @inline
    def apply(
        ruleName: RuleName,
        topicRulePayload: TopicRulePayload
    ): ReplaceTopicRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ruleName" -> ruleName.asInstanceOf[js.Any],
        "topicRulePayload" -> topicRulePayload.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ReplaceTopicRuleRequest]
    }
  }

  @js.native
  sealed trait ReportType extends js.Any
  object ReportType {
    val ERRORS = "ERRORS".asInstanceOf[ReportType]
    val RESULTS = "RESULTS".asInstanceOf[ReportType]

    @inline def values = js.Array(ERRORS, RESULTS)
  }

  /** Describes an action to republish to another topic.
    */
  @js.native
  trait RepublishAction extends js.Object {
    var roleArn: AwsArn
    var topic: TopicPattern
    var qos: js.UndefOr[Qos]
  }

  object RepublishAction {
    @inline
    def apply(
        roleArn: AwsArn,
        topic: TopicPattern,
        qos: js.UndefOr[Qos] = js.undefined
    ): RepublishAction = {
      val __obj = js.Dynamic.literal(
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "topic" -> topic.asInstanceOf[js.Any]
      )

      qos.foreach(__v => __obj.updateDynamic("qos")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepublishAction]
    }
  }

  /** Information that identifies the noncompliant resource.
    */
  @js.native
  trait ResourceIdentifier extends js.Object {
    var account: js.UndefOr[AwsAccountId]
    var caCertificateId: js.UndefOr[CertificateId]
    var clientId: js.UndefOr[ClientId]
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId]
    var deviceCertificateId: js.UndefOr[CertificateId]
    var iamRoleArn: js.UndefOr[RoleArn]
    var policyVersionIdentifier: js.UndefOr[PolicyVersionIdentifier]
    var roleAliasArn: js.UndefOr[RoleAliasArn]
  }

  object ResourceIdentifier {
    @inline
    def apply(
        account: js.UndefOr[AwsAccountId] = js.undefined,
        caCertificateId: js.UndefOr[CertificateId] = js.undefined,
        clientId: js.UndefOr[ClientId] = js.undefined,
        cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined,
        deviceCertificateId: js.UndefOr[CertificateId] = js.undefined,
        iamRoleArn: js.UndefOr[RoleArn] = js.undefined,
        policyVersionIdentifier: js.UndefOr[PolicyVersionIdentifier] = js.undefined,
        roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
    ): ResourceIdentifier = {
      val __obj = js.Dynamic.literal()
      account.foreach(__v => __obj.updateDynamic("account")(__v.asInstanceOf[js.Any]))
      caCertificateId.foreach(__v => __obj.updateDynamic("caCertificateId")(__v.asInstanceOf[js.Any]))
      clientId.foreach(__v => __obj.updateDynamic("clientId")(__v.asInstanceOf[js.Any]))
      cognitoIdentityPoolId.foreach(__v => __obj.updateDynamic("cognitoIdentityPoolId")(__v.asInstanceOf[js.Any]))
      deviceCertificateId.foreach(__v => __obj.updateDynamic("deviceCertificateId")(__v.asInstanceOf[js.Any]))
      iamRoleArn.foreach(__v => __obj.updateDynamic("iamRoleArn")(__v.asInstanceOf[js.Any]))
      policyVersionIdentifier.foreach(__v => __obj.updateDynamic("policyVersionIdentifier")(__v.asInstanceOf[js.Any]))
      roleAliasArn.foreach(__v => __obj.updateDynamic("roleAliasArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceIdentifier]
    }
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType {
    val DEVICE_CERTIFICATE = "DEVICE_CERTIFICATE".asInstanceOf[ResourceType]
    val CA_CERTIFICATE = "CA_CERTIFICATE".asInstanceOf[ResourceType]
    val IOT_POLICY = "IOT_POLICY".asInstanceOf[ResourceType]
    val COGNITO_IDENTITY_POOL = "COGNITO_IDENTITY_POOL".asInstanceOf[ResourceType]
    val CLIENT_ID = "CLIENT_ID".asInstanceOf[ResourceType]
    val ACCOUNT_SETTINGS = "ACCOUNT_SETTINGS".asInstanceOf[ResourceType]
    val ROLE_ALIAS = "ROLE_ALIAS".asInstanceOf[ResourceType]
    val IAM_ROLE = "IAM_ROLE".asInstanceOf[ResourceType]

    @inline def values = js.Array(DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY, COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS, ROLE_ALIAS, IAM_ROLE)
  }

  /** Role alias description.
    */
  @js.native
  trait RoleAliasDescription extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds]
    var lastModifiedDate: js.UndefOr[DateType]
    var owner: js.UndefOr[AwsAccountId]
    var roleAlias: js.UndefOr[RoleAlias]
    var roleAliasArn: js.UndefOr[RoleAliasArn]
    var roleArn: js.UndefOr[RoleArn]
  }

  object RoleAliasDescription {
    @inline
    def apply(
        creationDate: js.UndefOr[DateType] = js.undefined,
        credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined,
        lastModifiedDate: js.UndefOr[DateType] = js.undefined,
        owner: js.UndefOr[AwsAccountId] = js.undefined,
        roleAlias: js.UndefOr[RoleAlias] = js.undefined,
        roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): RoleAliasDescription = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      credentialDurationSeconds.foreach(__v => __obj.updateDynamic("credentialDurationSeconds")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      roleAlias.foreach(__v => __obj.updateDynamic("roleAlias")(__v.asInstanceOf[js.Any]))
      roleAliasArn.foreach(__v => __obj.updateDynamic("roleAliasArn")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoleAliasDescription]
    }
  }

  /** Describes an action to write data to an Amazon S3 bucket.
    */
  @js.native
  trait S3Action extends js.Object {
    var bucketName: BucketName
    var key: Key
    var roleArn: AwsArn
    var cannedAcl: js.UndefOr[CannedAccessControlList]
  }

  object S3Action {
    @inline
    def apply(
        bucketName: BucketName,
        key: Key,
        roleArn: AwsArn,
        cannedAcl: js.UndefOr[CannedAccessControlList] = js.undefined
    ): S3Action = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "key" -> key.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      cannedAcl.foreach(__v => __obj.updateDynamic("cannedAcl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Action]
    }
  }

  /** Describes the location of updated firmware in S3.
    */
  @js.native
  trait S3Destination extends js.Object {
    var bucket: js.UndefOr[S3Bucket]
    var prefix: js.UndefOr[Prefix]
  }

  object S3Destination {
    @inline
    def apply(
        bucket: js.UndefOr[S3Bucket] = js.undefined,
        prefix: js.UndefOr[Prefix] = js.undefined
    ): S3Destination = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Destination]
    }
  }

  /** The S3 location.
    */
  @js.native
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[S3Bucket]
    var key: js.UndefOr[S3Key]
    var version: js.UndefOr[S3Version]
  }

  object S3Location {
    @inline
    def apply(
        bucket: js.UndefOr[S3Bucket] = js.undefined,
        key: js.UndefOr[S3Key] = js.undefined,
        version: js.UndefOr[S3Version] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /** Describes an action to write a message to a Salesforce IoT Cloud Input Stream.
    */
  @js.native
  trait SalesforceAction extends js.Object {
    var token: SalesforceToken
    var url: SalesforceEndpoint
  }

  object SalesforceAction {
    @inline
    def apply(
        token: SalesforceToken,
        url: SalesforceEndpoint
    ): SalesforceAction = {
      val __obj = js.Dynamic.literal(
        "token" -> token.asInstanceOf[js.Any],
        "url" -> url.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SalesforceAction]
    }
  }

  /** Information about the scheduled audit.
    */
  @js.native
  trait ScheduledAuditMetadata extends js.Object {
    var dayOfMonth: js.UndefOr[DayOfMonth]
    var dayOfWeek: js.UndefOr[DayOfWeek]
    var frequency: js.UndefOr[AuditFrequency]
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
  }

  object ScheduledAuditMetadata {
    @inline
    def apply(
        dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
        frequency: js.UndefOr[AuditFrequency] = js.undefined,
        scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined,
        scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined
    ): ScheduledAuditMetadata = {
      val __obj = js.Dynamic.literal()
      dayOfMonth.foreach(__v => __obj.updateDynamic("dayOfMonth")(__v.asInstanceOf[js.Any]))
      dayOfWeek.foreach(__v => __obj.updateDynamic("dayOfWeek")(__v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.updateDynamic("frequency")(__v.asInstanceOf[js.Any]))
      scheduledAuditArn.foreach(__v => __obj.updateDynamic("scheduledAuditArn")(__v.asInstanceOf[js.Any]))
      scheduledAuditName.foreach(__v => __obj.updateDynamic("scheduledAuditName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledAuditMetadata]
    }
  }

  @js.native
  trait SearchIndexRequest extends js.Object {
    var queryString: QueryString
    var indexName: js.UndefOr[IndexName]
    var maxResults: js.UndefOr[QueryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  object SearchIndexRequest {
    @inline
    def apply(
        queryString: QueryString,
        indexName: js.UndefOr[IndexName] = js.undefined,
        maxResults: js.UndefOr[QueryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined
    ): SearchIndexRequest = {
      val __obj = js.Dynamic.literal(
        "queryString" -> queryString.asInstanceOf[js.Any]
      )

      indexName.foreach(__v => __obj.updateDynamic("indexName")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      queryVersion.foreach(__v => __obj.updateDynamic("queryVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchIndexRequest]
    }
  }

  @js.native
  trait SearchIndexResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var thingGroups: js.UndefOr[ThingGroupDocumentList]
    var things: js.UndefOr[ThingDocumentList]
  }

  object SearchIndexResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingGroups: js.UndefOr[ThingGroupDocumentList] = js.undefined,
        things: js.UndefOr[ThingDocumentList] = js.undefined
    ): SearchIndexResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      thingGroups.foreach(__v => __obj.updateDynamic("thingGroups")(__v.asInstanceOf[js.Any]))
      things.foreach(__v => __obj.updateDynamic("things")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchIndexResponse]
    }
  }

  /** Identifying information for a Device Defender security profile.
    */
  @js.native
  trait SecurityProfileIdentifier extends js.Object {
    var arn: SecurityProfileArn
    var name: SecurityProfileName
  }

  object SecurityProfileIdentifier {
    @inline
    def apply(
        arn: SecurityProfileArn,
        name: SecurityProfileName
    ): SecurityProfileIdentifier = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SecurityProfileIdentifier]
    }
  }

  /** A target to which an alert is sent when a security profile behavior is violated.
    */
  @js.native
  trait SecurityProfileTarget extends js.Object {
    var arn: SecurityProfileTargetArn
  }

  object SecurityProfileTarget {
    @inline
    def apply(
        arn: SecurityProfileTargetArn
    ): SecurityProfileTarget = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SecurityProfileTarget]
    }
  }

  /** Information about a security profile and the target associated with it.
    */
  @js.native
  trait SecurityProfileTargetMapping extends js.Object {
    var securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier]
    var target: js.UndefOr[SecurityProfileTarget]
  }

  object SecurityProfileTargetMapping {
    @inline
    def apply(
        securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier] = js.undefined,
        target: js.UndefOr[SecurityProfileTarget] = js.undefined
    ): SecurityProfileTargetMapping = {
      val __obj = js.Dynamic.literal()
      securityProfileIdentifier.foreach(__v => __obj.updateDynamic("securityProfileIdentifier")(__v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityProfileTargetMapping]
    }
  }

  @js.native
  sealed trait ServerCertificateStatus extends js.Any
  object ServerCertificateStatus {
    val INVALID = "INVALID".asInstanceOf[ServerCertificateStatus]
    val VALID = "VALID".asInstanceOf[ServerCertificateStatus]

    @inline def values = js.Array(INVALID, VALID)
  }

  /** An object that contains information about a server certificate.
    */
  @js.native
  trait ServerCertificateSummary extends js.Object {
    var serverCertificateArn: js.UndefOr[AcmCertificateArn]
    var serverCertificateStatus: js.UndefOr[ServerCertificateStatus]
    var serverCertificateStatusDetail: js.UndefOr[ServerCertificateStatusDetail]
  }

  object ServerCertificateSummary {
    @inline
    def apply(
        serverCertificateArn: js.UndefOr[AcmCertificateArn] = js.undefined,
        serverCertificateStatus: js.UndefOr[ServerCertificateStatus] = js.undefined,
        serverCertificateStatusDetail: js.UndefOr[ServerCertificateStatusDetail] = js.undefined
    ): ServerCertificateSummary = {
      val __obj = js.Dynamic.literal()
      serverCertificateArn.foreach(__v => __obj.updateDynamic("serverCertificateArn")(__v.asInstanceOf[js.Any]))
      serverCertificateStatus.foreach(__v => __obj.updateDynamic("serverCertificateStatus")(__v.asInstanceOf[js.Any]))
      serverCertificateStatusDetail.foreach(__v => __obj.updateDynamic("serverCertificateStatusDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerCertificateSummary]
    }
  }

  @js.native
  sealed trait ServiceType extends js.Any
  object ServiceType {
    val DATA = "DATA".asInstanceOf[ServiceType]
    val CREDENTIAL_PROVIDER = "CREDENTIAL_PROVIDER".asInstanceOf[ServiceType]
    val JOBS = "JOBS".asInstanceOf[ServiceType]

    @inline def values = js.Array(DATA, CREDENTIAL_PROVIDER, JOBS)
  }

  @js.native
  trait SetDefaultAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
  }

  object SetDefaultAuthorizerRequest {
    @inline
    def apply(
        authorizerName: AuthorizerName
    ): SetDefaultAuthorizerRequest = {
      val __obj = js.Dynamic.literal(
        "authorizerName" -> authorizerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetDefaultAuthorizerRequest]
    }
  }

  @js.native
  trait SetDefaultAuthorizerResponse extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  object SetDefaultAuthorizerResponse {
    @inline
    def apply(
        authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined,
        authorizerName: js.UndefOr[AuthorizerName] = js.undefined
    ): SetDefaultAuthorizerResponse = {
      val __obj = js.Dynamic.literal()
      authorizerArn.foreach(__v => __obj.updateDynamic("authorizerArn")(__v.asInstanceOf[js.Any]))
      authorizerName.foreach(__v => __obj.updateDynamic("authorizerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetDefaultAuthorizerResponse]
    }
  }

  /** The input for the SetDefaultPolicyVersion operation.
    */
  @js.native
  trait SetDefaultPolicyVersionRequest extends js.Object {
    var policyName: PolicyName
    var policyVersionId: PolicyVersionId
  }

  object SetDefaultPolicyVersionRequest {
    @inline
    def apply(
        policyName: PolicyName,
        policyVersionId: PolicyVersionId
    ): SetDefaultPolicyVersionRequest = {
      val __obj = js.Dynamic.literal(
        "policyName" -> policyName.asInstanceOf[js.Any],
        "policyVersionId" -> policyVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetDefaultPolicyVersionRequest]
    }
  }

  /** The input for the SetLoggingOptions operation.
    */
  @js.native
  trait SetLoggingOptionsRequest extends js.Object {
    var loggingOptionsPayload: LoggingOptionsPayload
  }

  object SetLoggingOptionsRequest {
    @inline
    def apply(
        loggingOptionsPayload: LoggingOptionsPayload
    ): SetLoggingOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "loggingOptionsPayload" -> loggingOptionsPayload.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetLoggingOptionsRequest]
    }
  }

  @js.native
  trait SetV2LoggingLevelRequest extends js.Object {
    var logLevel: LogLevel
    var logTarget: LogTarget
  }

  object SetV2LoggingLevelRequest {
    @inline
    def apply(
        logLevel: LogLevel,
        logTarget: LogTarget
    ): SetV2LoggingLevelRequest = {
      val __obj = js.Dynamic.literal(
        "logLevel" -> logLevel.asInstanceOf[js.Any],
        "logTarget" -> logTarget.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetV2LoggingLevelRequest]
    }
  }

  @js.native
  trait SetV2LoggingOptionsRequest extends js.Object {
    var defaultLogLevel: js.UndefOr[LogLevel]
    var disableAllLogs: js.UndefOr[DisableAllLogs]
    var roleArn: js.UndefOr[AwsArn]
  }

  object SetV2LoggingOptionsRequest {
    @inline
    def apply(
        defaultLogLevel: js.UndefOr[LogLevel] = js.undefined,
        disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined,
        roleArn: js.UndefOr[AwsArn] = js.undefined
    ): SetV2LoggingOptionsRequest = {
      val __obj = js.Dynamic.literal()
      defaultLogLevel.foreach(__v => __obj.updateDynamic("defaultLogLevel")(__v.asInstanceOf[js.Any]))
      disableAllLogs.foreach(__v => __obj.updateDynamic("disableAllLogs")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetV2LoggingOptionsRequest]
    }
  }

  /** For more information, see [[https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html|Signature Version 4 signing process]].
    */
  @js.native
  trait SigV4Authorization extends js.Object {
    var roleArn: AwsArn
    var serviceName: ServiceName
    var signingRegion: SigningRegion
  }

  object SigV4Authorization {
    @inline
    def apply(
        roleArn: AwsArn,
        serviceName: ServiceName,
        signingRegion: SigningRegion
    ): SigV4Authorization = {
      val __obj = js.Dynamic.literal(
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "serviceName" -> serviceName.asInstanceOf[js.Any],
        "signingRegion" -> signingRegion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SigV4Authorization]
    }
  }

  /** Describes the code-signing profile.
    */
  @js.native
  trait SigningProfileParameter extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificatePathOnDevice: js.UndefOr[CertificatePathOnDevice]
    var platform: js.UndefOr[Platform]
  }

  object SigningProfileParameter {
    @inline
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificatePathOnDevice: js.UndefOr[CertificatePathOnDevice] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined
    ): SigningProfileParameter = {
      val __obj = js.Dynamic.literal()
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      certificatePathOnDevice.foreach(__v => __obj.updateDynamic("certificatePathOnDevice")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigningProfileParameter]
    }
  }

  /** Describes an action to publish to an Amazon SNS topic.
    */
  @js.native
  trait SnsAction extends js.Object {
    var roleArn: AwsArn
    var targetArn: AwsArn
    var messageFormat: js.UndefOr[MessageFormat]
  }

  object SnsAction {
    @inline
    def apply(
        roleArn: AwsArn,
        targetArn: AwsArn,
        messageFormat: js.UndefOr[MessageFormat] = js.undefined
    ): SnsAction = {
      val __obj = js.Dynamic.literal(
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "targetArn" -> targetArn.asInstanceOf[js.Any]
      )

      messageFormat.foreach(__v => __obj.updateDynamic("messageFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnsAction]
    }
  }

  /** Describes an action to publish data to an Amazon SQS queue.
    */
  @js.native
  trait SqsAction extends js.Object {
    var queueUrl: QueueUrl
    var roleArn: AwsArn
    var useBase64: js.UndefOr[UseBase64]
  }

  object SqsAction {
    @inline
    def apply(
        queueUrl: QueueUrl,
        roleArn: AwsArn,
        useBase64: js.UndefOr[UseBase64] = js.undefined
    ): SqsAction = {
      val __obj = js.Dynamic.literal(
        "queueUrl" -> queueUrl.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      useBase64.foreach(__v => __obj.updateDynamic("useBase64")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqsAction]
    }
  }

  @js.native
  trait StartAuditMitigationActionsTaskRequest extends js.Object {
    var auditCheckToActionsMapping: AuditCheckToActionsMapping
    var clientRequestToken: ClientRequestToken
    var target: AuditMitigationActionsTaskTarget
    var taskId: MitigationActionsTaskId
  }

  object StartAuditMitigationActionsTaskRequest {
    @inline
    def apply(
        auditCheckToActionsMapping: AuditCheckToActionsMapping,
        clientRequestToken: ClientRequestToken,
        target: AuditMitigationActionsTaskTarget,
        taskId: MitigationActionsTaskId
    ): StartAuditMitigationActionsTaskRequest = {
      val __obj = js.Dynamic.literal(
        "auditCheckToActionsMapping" -> auditCheckToActionsMapping.asInstanceOf[js.Any],
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "target" -> target.asInstanceOf[js.Any],
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartAuditMitigationActionsTaskRequest]
    }
  }

  @js.native
  trait StartAuditMitigationActionsTaskResponse extends js.Object {
    var taskId: js.UndefOr[MitigationActionsTaskId]
  }

  object StartAuditMitigationActionsTaskResponse {
    @inline
    def apply(
        taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined
    ): StartAuditMitigationActionsTaskResponse = {
      val __obj = js.Dynamic.literal()
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAuditMitigationActionsTaskResponse]
    }
  }

  @js.native
  trait StartDetectMitigationActionsTaskRequest extends js.Object {
    var actions: DetectMitigationActionsToExecuteList
    var clientRequestToken: ClientRequestToken
    var target: DetectMitigationActionsTaskTarget
    var taskId: MitigationActionsTaskId
    var includeOnlyActiveViolations: js.UndefOr[NullableBoolean]
    var includeSuppressedAlerts: js.UndefOr[NullableBoolean]
    var violationEventOccurrenceRange: js.UndefOr[ViolationEventOccurrenceRange]
  }

  object StartDetectMitigationActionsTaskRequest {
    @inline
    def apply(
        actions: DetectMitigationActionsToExecuteList,
        clientRequestToken: ClientRequestToken,
        target: DetectMitigationActionsTaskTarget,
        taskId: MitigationActionsTaskId,
        includeOnlyActiveViolations: js.UndefOr[NullableBoolean] = js.undefined,
        includeSuppressedAlerts: js.UndefOr[NullableBoolean] = js.undefined,
        violationEventOccurrenceRange: js.UndefOr[ViolationEventOccurrenceRange] = js.undefined
    ): StartDetectMitigationActionsTaskRequest = {
      val __obj = js.Dynamic.literal(
        "actions" -> actions.asInstanceOf[js.Any],
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "target" -> target.asInstanceOf[js.Any],
        "taskId" -> taskId.asInstanceOf[js.Any]
      )

      includeOnlyActiveViolations.foreach(__v => __obj.updateDynamic("includeOnlyActiveViolations")(__v.asInstanceOf[js.Any]))
      includeSuppressedAlerts.foreach(__v => __obj.updateDynamic("includeSuppressedAlerts")(__v.asInstanceOf[js.Any]))
      violationEventOccurrenceRange.foreach(__v => __obj.updateDynamic("violationEventOccurrenceRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDetectMitigationActionsTaskRequest]
    }
  }

  @js.native
  trait StartDetectMitigationActionsTaskResponse extends js.Object {
    var taskId: js.UndefOr[MitigationActionsTaskId]
  }

  object StartDetectMitigationActionsTaskResponse {
    @inline
    def apply(
        taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined
    ): StartDetectMitigationActionsTaskResponse = {
      val __obj = js.Dynamic.literal()
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDetectMitigationActionsTaskResponse]
    }
  }

  @js.native
  trait StartOnDemandAuditTaskRequest extends js.Object {
    var targetCheckNames: TargetAuditCheckNames
  }

  object StartOnDemandAuditTaskRequest {
    @inline
    def apply(
        targetCheckNames: TargetAuditCheckNames
    ): StartOnDemandAuditTaskRequest = {
      val __obj = js.Dynamic.literal(
        "targetCheckNames" -> targetCheckNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartOnDemandAuditTaskRequest]
    }
  }

  @js.native
  trait StartOnDemandAuditTaskResponse extends js.Object {
    var taskId: js.UndefOr[AuditTaskId]
  }

  object StartOnDemandAuditTaskResponse {
    @inline
    def apply(
        taskId: js.UndefOr[AuditTaskId] = js.undefined
    ): StartOnDemandAuditTaskResponse = {
      val __obj = js.Dynamic.literal()
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOnDemandAuditTaskResponse]
    }
  }

  /** Information required to start a signing job.
    */
  @js.native
  trait StartSigningJobParameter extends js.Object {
    var destination: js.UndefOr[Destination]
    var signingProfileName: js.UndefOr[SigningProfileName]
    var signingProfileParameter: js.UndefOr[SigningProfileParameter]
  }

  object StartSigningJobParameter {
    @inline
    def apply(
        destination: js.UndefOr[Destination] = js.undefined,
        signingProfileName: js.UndefOr[SigningProfileName] = js.undefined,
        signingProfileParameter: js.UndefOr[SigningProfileParameter] = js.undefined
    ): StartSigningJobParameter = {
      val __obj = js.Dynamic.literal()
      destination.foreach(__v => __obj.updateDynamic("destination")(__v.asInstanceOf[js.Any]))
      signingProfileName.foreach(__v => __obj.updateDynamic("signingProfileName")(__v.asInstanceOf[js.Any]))
      signingProfileParameter.foreach(__v => __obj.updateDynamic("signingProfileParameter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSigningJobParameter]
    }
  }

  @js.native
  trait StartThingRegistrationTaskRequest extends js.Object {
    var inputFileBucket: RegistryS3BucketName
    var inputFileKey: RegistryS3KeyName
    var roleArn: RoleArn
    var templateBody: TemplateBody
  }

  object StartThingRegistrationTaskRequest {
    @inline
    def apply(
        inputFileBucket: RegistryS3BucketName,
        inputFileKey: RegistryS3KeyName,
        roleArn: RoleArn,
        templateBody: TemplateBody
    ): StartThingRegistrationTaskRequest = {
      val __obj = js.Dynamic.literal(
        "inputFileBucket" -> inputFileBucket.asInstanceOf[js.Any],
        "inputFileKey" -> inputFileKey.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "templateBody" -> templateBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartThingRegistrationTaskRequest]
    }
  }

  @js.native
  trait StartThingRegistrationTaskResponse extends js.Object {
    var taskId: js.UndefOr[TaskId]
  }

  object StartThingRegistrationTaskResponse {
    @inline
    def apply(
        taskId: js.UndefOr[TaskId] = js.undefined
    ): StartThingRegistrationTaskResponse = {
      val __obj = js.Dynamic.literal()
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartThingRegistrationTaskResponse]
    }
  }

  /** A statistical ranking (percentile) that indicates a threshold value by which a behavior is determined to be in compliance or in violation of the behavior.
    */
  @js.native
  trait StatisticalThreshold extends js.Object {
    var statistic: js.UndefOr[EvaluationStatistic]
  }

  object StatisticalThreshold {
    @inline
    def apply(
        statistic: js.UndefOr[EvaluationStatistic] = js.undefined
    ): StatisticalThreshold = {
      val __obj = js.Dynamic.literal()
      statistic.foreach(__v => __obj.updateDynamic("statistic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatisticalThreshold]
    }
  }

  /** A map of key-value pairs for all supported statistics. Currently, only count is supported.
    */
  @js.native
  trait Statistics extends js.Object {
    var average: js.UndefOr[Average]
    var count: js.UndefOr[Count]
    var maximum: js.UndefOr[Maximum]
    var minimum: js.UndefOr[Minimum]
    var stdDeviation: js.UndefOr[StdDeviation]
    var sum: js.UndefOr[Sum]
    var sumOfSquares: js.UndefOr[SumOfSquares]
    var variance: js.UndefOr[Variance]
  }

  object Statistics {
    @inline
    def apply(
        average: js.UndefOr[Average] = js.undefined,
        count: js.UndefOr[Count] = js.undefined,
        maximum: js.UndefOr[Maximum] = js.undefined,
        minimum: js.UndefOr[Minimum] = js.undefined,
        stdDeviation: js.UndefOr[StdDeviation] = js.undefined,
        sum: js.UndefOr[Sum] = js.undefined,
        sumOfSquares: js.UndefOr[SumOfSquares] = js.undefined,
        variance: js.UndefOr[Variance] = js.undefined
    ): Statistics = {
      val __obj = js.Dynamic.literal()
      average.foreach(__v => __obj.updateDynamic("average")(__v.asInstanceOf[js.Any]))
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      maximum.foreach(__v => __obj.updateDynamic("maximum")(__v.asInstanceOf[js.Any]))
      minimum.foreach(__v => __obj.updateDynamic("minimum")(__v.asInstanceOf[js.Any]))
      stdDeviation.foreach(__v => __obj.updateDynamic("stdDeviation")(__v.asInstanceOf[js.Any]))
      sum.foreach(__v => __obj.updateDynamic("sum")(__v.asInstanceOf[js.Any]))
      sumOfSquares.foreach(__v => __obj.updateDynamic("sumOfSquares")(__v.asInstanceOf[js.Any]))
      variance.foreach(__v => __obj.updateDynamic("variance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Statistics]
    }
  }

  @js.native
  sealed trait Status extends js.Any
  object Status {
    val InProgress = "InProgress".asInstanceOf[Status]
    val Completed = "Completed".asInstanceOf[Status]
    val Failed = "Failed".asInstanceOf[Status]
    val Cancelled = "Cancelled".asInstanceOf[Status]
    val Cancelling = "Cancelling".asInstanceOf[Status]

    @inline def values = js.Array(InProgress, Completed, Failed, Cancelled, Cancelling)
  }

  /** Starts execution of a Step Functions state machine.
    */
  @js.native
  trait StepFunctionsAction extends js.Object {
    var roleArn: AwsArn
    var stateMachineName: StateMachineName
    var executionNamePrefix: js.UndefOr[ExecutionNamePrefix]
  }

  object StepFunctionsAction {
    @inline
    def apply(
        roleArn: AwsArn,
        stateMachineName: StateMachineName,
        executionNamePrefix: js.UndefOr[ExecutionNamePrefix] = js.undefined
    ): StepFunctionsAction = {
      val __obj = js.Dynamic.literal(
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "stateMachineName" -> stateMachineName.asInstanceOf[js.Any]
      )

      executionNamePrefix.foreach(__v => __obj.updateDynamic("executionNamePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepFunctionsAction]
    }
  }

  @js.native
  trait StopThingRegistrationTaskRequest extends js.Object {
    var taskId: TaskId
  }

  object StopThingRegistrationTaskRequest {
    @inline
    def apply(
        taskId: TaskId
    ): StopThingRegistrationTaskRequest = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopThingRegistrationTaskRequest]
    }
  }

  @js.native
  trait StopThingRegistrationTaskResponse extends js.Object

  object StopThingRegistrationTaskResponse {
    @inline
    def apply(): StopThingRegistrationTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopThingRegistrationTaskResponse]
    }
  }

  /** Describes a group of files that can be streamed.
    */
  @js.native
  trait Stream extends js.Object {
    var fileId: js.UndefOr[FileId]
    var streamId: js.UndefOr[StreamId]
  }

  object Stream {
    @inline
    def apply(
        fileId: js.UndefOr[FileId] = js.undefined,
        streamId: js.UndefOr[StreamId] = js.undefined
    ): Stream = {
      val __obj = js.Dynamic.literal()
      fileId.foreach(__v => __obj.updateDynamic("fileId")(__v.asInstanceOf[js.Any]))
      streamId.foreach(__v => __obj.updateDynamic("streamId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Stream]
    }
  }

  /** Represents a file to stream.
    */
  @js.native
  trait StreamFile extends js.Object {
    var fileId: js.UndefOr[FileId]
    var s3Location: js.UndefOr[S3Location]
  }

  object StreamFile {
    @inline
    def apply(
        fileId: js.UndefOr[FileId] = js.undefined,
        s3Location: js.UndefOr[S3Location] = js.undefined
    ): StreamFile = {
      val __obj = js.Dynamic.literal()
      fileId.foreach(__v => __obj.updateDynamic("fileId")(__v.asInstanceOf[js.Any]))
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamFile]
    }
  }

  /** Information about a stream.
    */
  @js.native
  trait StreamInfo extends js.Object {
    var createdAt: js.UndefOr[DateType]
    var description: js.UndefOr[StreamDescription]
    var files: js.UndefOr[StreamFiles]
    var lastUpdatedAt: js.UndefOr[DateType]
    var roleArn: js.UndefOr[RoleArn]
    var streamArn: js.UndefOr[StreamArn]
    var streamId: js.UndefOr[StreamId]
    var streamVersion: js.UndefOr[StreamVersion]
  }

  object StreamInfo {
    @inline
    def apply(
        createdAt: js.UndefOr[DateType] = js.undefined,
        description: js.UndefOr[StreamDescription] = js.undefined,
        files: js.UndefOr[StreamFiles] = js.undefined,
        lastUpdatedAt: js.UndefOr[DateType] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        streamArn: js.UndefOr[StreamArn] = js.undefined,
        streamId: js.UndefOr[StreamId] = js.undefined,
        streamVersion: js.UndefOr[StreamVersion] = js.undefined
    ): StreamInfo = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      files.foreach(__v => __obj.updateDynamic("files")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      streamArn.foreach(__v => __obj.updateDynamic("streamArn")(__v.asInstanceOf[js.Any]))
      streamId.foreach(__v => __obj.updateDynamic("streamId")(__v.asInstanceOf[js.Any]))
      streamVersion.foreach(__v => __obj.updateDynamic("streamVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamInfo]
    }
  }

  /** A summary of a stream.
    */
  @js.native
  trait StreamSummary extends js.Object {
    var description: js.UndefOr[StreamDescription]
    var streamArn: js.UndefOr[StreamArn]
    var streamId: js.UndefOr[StreamId]
    var streamVersion: js.UndefOr[StreamVersion]
  }

  object StreamSummary {
    @inline
    def apply(
        description: js.UndefOr[StreamDescription] = js.undefined,
        streamArn: js.UndefOr[StreamArn] = js.undefined,
        streamId: js.UndefOr[StreamId] = js.undefined,
        streamVersion: js.UndefOr[StreamVersion] = js.undefined
    ): StreamSummary = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      streamArn.foreach(__v => __obj.updateDynamic("streamArn")(__v.asInstanceOf[js.Any]))
      streamId.foreach(__v => __obj.updateDynamic("streamId")(__v.asInstanceOf[js.Any]))
      streamVersion.foreach(__v => __obj.updateDynamic("streamVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamSummary]
    }
  }

  /** A set of key/value pairs that are used to manage the resource.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  sealed trait TargetSelection extends js.Any
  object TargetSelection {
    val CONTINUOUS = "CONTINUOUS".asInstanceOf[TargetSelection]
    val SNAPSHOT = "SNAPSHOT".asInstanceOf[TargetSelection]

    @inline def values = js.Array(CONTINUOUS, SNAPSHOT)
  }

  /** Statistics for the checks performed during the audit.
    */
  @js.native
  trait TaskStatistics extends js.Object {
    var canceledChecks: js.UndefOr[CanceledChecksCount]
    var compliantChecks: js.UndefOr[CompliantChecksCount]
    var failedChecks: js.UndefOr[FailedChecksCount]
    var inProgressChecks: js.UndefOr[InProgressChecksCount]
    var nonCompliantChecks: js.UndefOr[NonCompliantChecksCount]
    var totalChecks: js.UndefOr[TotalChecksCount]
    var waitingForDataCollectionChecks: js.UndefOr[WaitingForDataCollectionChecksCount]
  }

  object TaskStatistics {
    @inline
    def apply(
        canceledChecks: js.UndefOr[CanceledChecksCount] = js.undefined,
        compliantChecks: js.UndefOr[CompliantChecksCount] = js.undefined,
        failedChecks: js.UndefOr[FailedChecksCount] = js.undefined,
        inProgressChecks: js.UndefOr[InProgressChecksCount] = js.undefined,
        nonCompliantChecks: js.UndefOr[NonCompliantChecksCount] = js.undefined,
        totalChecks: js.UndefOr[TotalChecksCount] = js.undefined,
        waitingForDataCollectionChecks: js.UndefOr[WaitingForDataCollectionChecksCount] = js.undefined
    ): TaskStatistics = {
      val __obj = js.Dynamic.literal()
      canceledChecks.foreach(__v => __obj.updateDynamic("canceledChecks")(__v.asInstanceOf[js.Any]))
      compliantChecks.foreach(__v => __obj.updateDynamic("compliantChecks")(__v.asInstanceOf[js.Any]))
      failedChecks.foreach(__v => __obj.updateDynamic("failedChecks")(__v.asInstanceOf[js.Any]))
      inProgressChecks.foreach(__v => __obj.updateDynamic("inProgressChecks")(__v.asInstanceOf[js.Any]))
      nonCompliantChecks.foreach(__v => __obj.updateDynamic("nonCompliantChecks")(__v.asInstanceOf[js.Any]))
      totalChecks.foreach(__v => __obj.updateDynamic("totalChecks")(__v.asInstanceOf[js.Any]))
      waitingForDataCollectionChecks.foreach(__v => __obj.updateDynamic("waitingForDataCollectionChecks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskStatistics]
    }
  }

  /** Provides summary counts of how many tasks for findings are in a particular state. This information is included in the response from DescribeAuditMitigationActionsTask.
    */
  @js.native
  trait TaskStatisticsForAuditCheck extends js.Object {
    var canceledFindingsCount: js.UndefOr[CanceledFindingsCount]
    var failedFindingsCount: js.UndefOr[FailedFindingsCount]
    var skippedFindingsCount: js.UndefOr[SkippedFindingsCount]
    var succeededFindingsCount: js.UndefOr[SucceededFindingsCount]
    var totalFindingsCount: js.UndefOr[TotalFindingsCount]
  }

  object TaskStatisticsForAuditCheck {
    @inline
    def apply(
        canceledFindingsCount: js.UndefOr[CanceledFindingsCount] = js.undefined,
        failedFindingsCount: js.UndefOr[FailedFindingsCount] = js.undefined,
        skippedFindingsCount: js.UndefOr[SkippedFindingsCount] = js.undefined,
        succeededFindingsCount: js.UndefOr[SucceededFindingsCount] = js.undefined,
        totalFindingsCount: js.UndefOr[TotalFindingsCount] = js.undefined
    ): TaskStatisticsForAuditCheck = {
      val __obj = js.Dynamic.literal()
      canceledFindingsCount.foreach(__v => __obj.updateDynamic("canceledFindingsCount")(__v.asInstanceOf[js.Any]))
      failedFindingsCount.foreach(__v => __obj.updateDynamic("failedFindingsCount")(__v.asInstanceOf[js.Any]))
      skippedFindingsCount.foreach(__v => __obj.updateDynamic("skippedFindingsCount")(__v.asInstanceOf[js.Any]))
      succeededFindingsCount.foreach(__v => __obj.updateDynamic("succeededFindingsCount")(__v.asInstanceOf[js.Any]))
      totalFindingsCount.foreach(__v => __obj.updateDynamic("totalFindingsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskStatisticsForAuditCheck]
    }
  }

  @js.native
  trait TestAuthorizationRequest extends js.Object {
    var authInfos: AuthInfos
    var clientId: js.UndefOr[ClientId]
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId]
    var policyNamesToAdd: js.UndefOr[PolicyNames]
    var policyNamesToSkip: js.UndefOr[PolicyNames]
    var principal: js.UndefOr[Principal]
  }

  object TestAuthorizationRequest {
    @inline
    def apply(
        authInfos: AuthInfos,
        clientId: js.UndefOr[ClientId] = js.undefined,
        cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined,
        policyNamesToAdd: js.UndefOr[PolicyNames] = js.undefined,
        policyNamesToSkip: js.UndefOr[PolicyNames] = js.undefined,
        principal: js.UndefOr[Principal] = js.undefined
    ): TestAuthorizationRequest = {
      val __obj = js.Dynamic.literal(
        "authInfos" -> authInfos.asInstanceOf[js.Any]
      )

      clientId.foreach(__v => __obj.updateDynamic("clientId")(__v.asInstanceOf[js.Any]))
      cognitoIdentityPoolId.foreach(__v => __obj.updateDynamic("cognitoIdentityPoolId")(__v.asInstanceOf[js.Any]))
      policyNamesToAdd.foreach(__v => __obj.updateDynamic("policyNamesToAdd")(__v.asInstanceOf[js.Any]))
      policyNamesToSkip.foreach(__v => __obj.updateDynamic("policyNamesToSkip")(__v.asInstanceOf[js.Any]))
      principal.foreach(__v => __obj.updateDynamic("principal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestAuthorizationRequest]
    }
  }

  @js.native
  trait TestAuthorizationResponse extends js.Object {
    var authResults: js.UndefOr[AuthResults]
  }

  object TestAuthorizationResponse {
    @inline
    def apply(
        authResults: js.UndefOr[AuthResults] = js.undefined
    ): TestAuthorizationResponse = {
      val __obj = js.Dynamic.literal()
      authResults.foreach(__v => __obj.updateDynamic("authResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestAuthorizationResponse]
    }
  }

  @js.native
  trait TestInvokeAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
    var httpContext: js.UndefOr[HttpContext]
    var mqttContext: js.UndefOr[MqttContext]
    var tlsContext: js.UndefOr[TlsContext]
    var token: js.UndefOr[Token]
    var tokenSignature: js.UndefOr[TokenSignature]
  }

  object TestInvokeAuthorizerRequest {
    @inline
    def apply(
        authorizerName: AuthorizerName,
        httpContext: js.UndefOr[HttpContext] = js.undefined,
        mqttContext: js.UndefOr[MqttContext] = js.undefined,
        tlsContext: js.UndefOr[TlsContext] = js.undefined,
        token: js.UndefOr[Token] = js.undefined,
        tokenSignature: js.UndefOr[TokenSignature] = js.undefined
    ): TestInvokeAuthorizerRequest = {
      val __obj = js.Dynamic.literal(
        "authorizerName" -> authorizerName.asInstanceOf[js.Any]
      )

      httpContext.foreach(__v => __obj.updateDynamic("httpContext")(__v.asInstanceOf[js.Any]))
      mqttContext.foreach(__v => __obj.updateDynamic("mqttContext")(__v.asInstanceOf[js.Any]))
      tlsContext.foreach(__v => __obj.updateDynamic("tlsContext")(__v.asInstanceOf[js.Any]))
      token.foreach(__v => __obj.updateDynamic("token")(__v.asInstanceOf[js.Any]))
      tokenSignature.foreach(__v => __obj.updateDynamic("tokenSignature")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestInvokeAuthorizerRequest]
    }
  }

  @js.native
  trait TestInvokeAuthorizerResponse extends js.Object {
    var disconnectAfterInSeconds: js.UndefOr[Seconds]
    var isAuthenticated: js.UndefOr[IsAuthenticated]
    var policyDocuments: js.UndefOr[PolicyDocuments]
    var principalId: js.UndefOr[PrincipalId]
    var refreshAfterInSeconds: js.UndefOr[Seconds]
  }

  object TestInvokeAuthorizerResponse {
    @inline
    def apply(
        disconnectAfterInSeconds: js.UndefOr[Seconds] = js.undefined,
        isAuthenticated: js.UndefOr[IsAuthenticated] = js.undefined,
        policyDocuments: js.UndefOr[PolicyDocuments] = js.undefined,
        principalId: js.UndefOr[PrincipalId] = js.undefined,
        refreshAfterInSeconds: js.UndefOr[Seconds] = js.undefined
    ): TestInvokeAuthorizerResponse = {
      val __obj = js.Dynamic.literal()
      disconnectAfterInSeconds.foreach(__v => __obj.updateDynamic("disconnectAfterInSeconds")(__v.asInstanceOf[js.Any]))
      isAuthenticated.foreach(__v => __obj.updateDynamic("isAuthenticated")(__v.asInstanceOf[js.Any]))
      policyDocuments.foreach(__v => __obj.updateDynamic("policyDocuments")(__v.asInstanceOf[js.Any]))
      principalId.foreach(__v => __obj.updateDynamic("principalId")(__v.asInstanceOf[js.Any]))
      refreshAfterInSeconds.foreach(__v => __obj.updateDynamic("refreshAfterInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestInvokeAuthorizerResponse]
    }
  }

  /** The properties of the thing, including thing name, thing type name, and a list of thing attributes.
    */
  @js.native
  trait ThingAttribute extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var thingArn: js.UndefOr[ThingArn]
    var thingName: js.UndefOr[ThingName]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var version: js.UndefOr[Version]
  }

  object ThingAttribute {
    @inline
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined,
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): ThingAttribute = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      thingTypeName.foreach(__v => __obj.updateDynamic("thingTypeName")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThingAttribute]
    }
  }

  /** The connectivity status of the thing.
    */
  @js.native
  trait ThingConnectivity extends js.Object {
    var connected: js.UndefOr[Boolean]
    var timestamp: js.UndefOr[ConnectivityTimestamp]
  }

  object ThingConnectivity {
    @inline
    def apply(
        connected: js.UndefOr[Boolean] = js.undefined,
        timestamp: js.UndefOr[ConnectivityTimestamp] = js.undefined
    ): ThingConnectivity = {
      val __obj = js.Dynamic.literal()
      connected.foreach(__v => __obj.updateDynamic("connected")(__v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.updateDynamic("timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThingConnectivity]
    }
  }

  @js.native
  sealed trait ThingConnectivityIndexingMode extends js.Any
  object ThingConnectivityIndexingMode {
    val OFF = "OFF".asInstanceOf[ThingConnectivityIndexingMode]
    val STATUS = "STATUS".asInstanceOf[ThingConnectivityIndexingMode]

    @inline def values = js.Array(OFF, STATUS)
  }

  /** The thing search index document.
    */
  @js.native
  trait ThingDocument extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var connectivity: js.UndefOr[ThingConnectivity]
    var shadow: js.UndefOr[JsonDocument]
    var thingGroupNames: js.UndefOr[ThingGroupNameList]
    var thingId: js.UndefOr[ThingId]
    var thingName: js.UndefOr[ThingName]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  object ThingDocument {
    @inline
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined,
        connectivity: js.UndefOr[ThingConnectivity] = js.undefined,
        shadow: js.UndefOr[JsonDocument] = js.undefined,
        thingGroupNames: js.UndefOr[ThingGroupNameList] = js.undefined,
        thingId: js.UndefOr[ThingId] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    ): ThingDocument = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      connectivity.foreach(__v => __obj.updateDynamic("connectivity")(__v.asInstanceOf[js.Any]))
      shadow.foreach(__v => __obj.updateDynamic("shadow")(__v.asInstanceOf[js.Any]))
      thingGroupNames.foreach(__v => __obj.updateDynamic("thingGroupNames")(__v.asInstanceOf[js.Any]))
      thingId.foreach(__v => __obj.updateDynamic("thingId")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      thingTypeName.foreach(__v => __obj.updateDynamic("thingTypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThingDocument]
    }
  }

  /** The thing group search index document.
    */
  @js.native
  trait ThingGroupDocument extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var parentGroupNames: js.UndefOr[ThingGroupNameList]
    var thingGroupDescription: js.UndefOr[ThingGroupDescription]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var thingGroupName: js.UndefOr[ThingGroupName]
  }

  object ThingGroupDocument {
    @inline
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined,
        parentGroupNames: js.UndefOr[ThingGroupNameList] = js.undefined,
        thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.undefined,
        thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
    ): ThingGroupDocument = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      parentGroupNames.foreach(__v => __obj.updateDynamic("parentGroupNames")(__v.asInstanceOf[js.Any]))
      thingGroupDescription.foreach(__v => __obj.updateDynamic("thingGroupDescription")(__v.asInstanceOf[js.Any]))
      thingGroupId.foreach(__v => __obj.updateDynamic("thingGroupId")(__v.asInstanceOf[js.Any]))
      thingGroupName.foreach(__v => __obj.updateDynamic("thingGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThingGroupDocument]
    }
  }

  /** Thing group indexing configuration.
    */
  @js.native
  trait ThingGroupIndexingConfiguration extends js.Object {
    var thingGroupIndexingMode: ThingGroupIndexingMode
    var customFields: js.UndefOr[Fields]
    var managedFields: js.UndefOr[Fields]
  }

  object ThingGroupIndexingConfiguration {
    @inline
    def apply(
        thingGroupIndexingMode: ThingGroupIndexingMode,
        customFields: js.UndefOr[Fields] = js.undefined,
        managedFields: js.UndefOr[Fields] = js.undefined
    ): ThingGroupIndexingConfiguration = {
      val __obj = js.Dynamic.literal(
        "thingGroupIndexingMode" -> thingGroupIndexingMode.asInstanceOf[js.Any]
      )

      customFields.foreach(__v => __obj.updateDynamic("customFields")(__v.asInstanceOf[js.Any]))
      managedFields.foreach(__v => __obj.updateDynamic("managedFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThingGroupIndexingConfiguration]
    }
  }

  @js.native
  sealed trait ThingGroupIndexingMode extends js.Any
  object ThingGroupIndexingMode {
    val OFF = "OFF".asInstanceOf[ThingGroupIndexingMode]
    val ON = "ON".asInstanceOf[ThingGroupIndexingMode]

    @inline def values = js.Array(OFF, ON)
  }

  /** Thing group metadata.
    */
  @js.native
  trait ThingGroupMetadata extends js.Object {
    var creationDate: js.UndefOr[CreationDate]
    var parentGroupName: js.UndefOr[ThingGroupName]
    var rootToParentThingGroups: js.UndefOr[ThingGroupNameAndArnList]
  }

  object ThingGroupMetadata {
    @inline
    def apply(
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        parentGroupName: js.UndefOr[ThingGroupName] = js.undefined,
        rootToParentThingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
    ): ThingGroupMetadata = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      parentGroupName.foreach(__v => __obj.updateDynamic("parentGroupName")(__v.asInstanceOf[js.Any]))
      rootToParentThingGroups.foreach(__v => __obj.updateDynamic("rootToParentThingGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThingGroupMetadata]
    }
  }

  /** Thing group properties.
    */
  @js.native
  trait ThingGroupProperties extends js.Object {
    var attributePayload: js.UndefOr[AttributePayload]
    var thingGroupDescription: js.UndefOr[ThingGroupDescription]
  }

  object ThingGroupProperties {
    @inline
    def apply(
        attributePayload: js.UndefOr[AttributePayload] = js.undefined,
        thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.undefined
    ): ThingGroupProperties = {
      val __obj = js.Dynamic.literal()
      attributePayload.foreach(__v => __obj.updateDynamic("attributePayload")(__v.asInstanceOf[js.Any]))
      thingGroupDescription.foreach(__v => __obj.updateDynamic("thingGroupDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThingGroupProperties]
    }
  }

  /** The thing indexing configuration. For more information, see [[https://docs.aws.amazon.com/iot/latest/developerguide/managing-index.html|Managing Thing Indexing]].
    */
  @js.native
  trait ThingIndexingConfiguration extends js.Object {
    var thingIndexingMode: ThingIndexingMode
    var customFields: js.UndefOr[Fields]
    var managedFields: js.UndefOr[Fields]
    var thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode]
  }

  object ThingIndexingConfiguration {
    @inline
    def apply(
        thingIndexingMode: ThingIndexingMode,
        customFields: js.UndefOr[Fields] = js.undefined,
        managedFields: js.UndefOr[Fields] = js.undefined,
        thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode] = js.undefined
    ): ThingIndexingConfiguration = {
      val __obj = js.Dynamic.literal(
        "thingIndexingMode" -> thingIndexingMode.asInstanceOf[js.Any]
      )

      customFields.foreach(__v => __obj.updateDynamic("customFields")(__v.asInstanceOf[js.Any]))
      managedFields.foreach(__v => __obj.updateDynamic("managedFields")(__v.asInstanceOf[js.Any]))
      thingConnectivityIndexingMode.foreach(__v => __obj.updateDynamic("thingConnectivityIndexingMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThingIndexingConfiguration]
    }
  }

  @js.native
  sealed trait ThingIndexingMode extends js.Any
  object ThingIndexingMode {
    val OFF = "OFF".asInstanceOf[ThingIndexingMode]
    val REGISTRY = "REGISTRY".asInstanceOf[ThingIndexingMode]
    val REGISTRY_AND_SHADOW = "REGISTRY_AND_SHADOW".asInstanceOf[ThingIndexingMode]

    @inline def values = js.Array(OFF, REGISTRY, REGISTRY_AND_SHADOW)
  }

  /** The definition of the thing type, including thing type name and description.
    */
  @js.native
  trait ThingTypeDefinition extends js.Object {
    var thingTypeArn: js.UndefOr[ThingTypeArn]
    var thingTypeMetadata: js.UndefOr[ThingTypeMetadata]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var thingTypeProperties: js.UndefOr[ThingTypeProperties]
  }

  object ThingTypeDefinition {
    @inline
    def apply(
        thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined,
        thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
        thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
    ): ThingTypeDefinition = {
      val __obj = js.Dynamic.literal()
      thingTypeArn.foreach(__v => __obj.updateDynamic("thingTypeArn")(__v.asInstanceOf[js.Any]))
      thingTypeMetadata.foreach(__v => __obj.updateDynamic("thingTypeMetadata")(__v.asInstanceOf[js.Any]))
      thingTypeName.foreach(__v => __obj.updateDynamic("thingTypeName")(__v.asInstanceOf[js.Any]))
      thingTypeProperties.foreach(__v => __obj.updateDynamic("thingTypeProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThingTypeDefinition]
    }
  }

  /** The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when time was deprecated.
    */
  @js.native
  trait ThingTypeMetadata extends js.Object {
    var creationDate: js.UndefOr[CreationDate]
    var deprecated: js.UndefOr[Boolean]
    var deprecationDate: js.UndefOr[DeprecationDate]
  }

  object ThingTypeMetadata {
    @inline
    def apply(
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        deprecated: js.UndefOr[Boolean] = js.undefined,
        deprecationDate: js.UndefOr[DeprecationDate] = js.undefined
    ): ThingTypeMetadata = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      deprecated.foreach(__v => __obj.updateDynamic("deprecated")(__v.asInstanceOf[js.Any]))
      deprecationDate.foreach(__v => __obj.updateDynamic("deprecationDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThingTypeMetadata]
    }
  }

  /** The ThingTypeProperties contains information about the thing type including: a thing type description, and a list of searchable thing attribute names.
    */
  @js.native
  trait ThingTypeProperties extends js.Object {
    var searchableAttributes: js.UndefOr[SearchableAttributes]
    var thingTypeDescription: js.UndefOr[ThingTypeDescription]
  }

  object ThingTypeProperties {
    @inline
    def apply(
        searchableAttributes: js.UndefOr[SearchableAttributes] = js.undefined,
        thingTypeDescription: js.UndefOr[ThingTypeDescription] = js.undefined
    ): ThingTypeProperties = {
      val __obj = js.Dynamic.literal()
      searchableAttributes.foreach(__v => __obj.updateDynamic("searchableAttributes")(__v.asInstanceOf[js.Any]))
      thingTypeDescription.foreach(__v => __obj.updateDynamic("thingTypeDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThingTypeProperties]
    }
  }

  /** Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another terminal state before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.
    */
  @js.native
  trait TimeoutConfig extends js.Object {
    var inProgressTimeoutInMinutes: js.UndefOr[InProgressTimeoutInMinutes]
  }

  object TimeoutConfig {
    @inline
    def apply(
        inProgressTimeoutInMinutes: js.UndefOr[InProgressTimeoutInMinutes] = js.undefined
    ): TimeoutConfig = {
      val __obj = js.Dynamic.literal()
      inProgressTimeoutInMinutes.foreach(__v => __obj.updateDynamic("inProgressTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeoutConfig]
    }
  }

  /** The Timestream rule action writes attributes (measures) from an MQTT message into an Amazon Timestream table. For more information, see the [[https://docs.aws.amazon.com/iot/latest/developerguide/timestream-rule-action.html|Timestream]] topic rule action documentation.
    */
  @js.native
  trait TimestreamAction extends js.Object {
    var databaseName: TimestreamDatabaseName
    var dimensions: TimestreamDimensionList
    var roleArn: AwsArn
    var tableName: TimestreamTableName
    var timestamp: js.UndefOr[TimestreamTimestamp]
  }

  object TimestreamAction {
    @inline
    def apply(
        databaseName: TimestreamDatabaseName,
        dimensions: TimestreamDimensionList,
        roleArn: AwsArn,
        tableName: TimestreamTableName,
        timestamp: js.UndefOr[TimestreamTimestamp] = js.undefined
    ): TimestreamAction = {
      val __obj = js.Dynamic.literal(
        "databaseName" -> databaseName.asInstanceOf[js.Any],
        "dimensions" -> dimensions.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "tableName" -> tableName.asInstanceOf[js.Any]
      )

      timestamp.foreach(__v => __obj.updateDynamic("timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimestreamAction]
    }
  }

  /** Metadata attributes of the time series that are written in each measure record.
    */
  @js.native
  trait TimestreamDimension extends js.Object {
    var name: TimestreamDimensionName
    var value: TimestreamDimensionValue
  }

  object TimestreamDimension {
    @inline
    def apply(
        name: TimestreamDimensionName,
        value: TimestreamDimensionValue
    ): TimestreamDimension = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimestreamDimension]
    }
  }

  /** Describes how to interpret an application-defined timestamp value from an MQTT message payload and the precision of that value.
    */
  @js.native
  trait TimestreamTimestamp extends js.Object {
    var unit: TimestreamTimestampUnit
    var value: TimestreamTimestampValue
  }

  object TimestreamTimestamp {
    @inline
    def apply(
        unit: TimestreamTimestampUnit,
        value: TimestreamTimestampValue
    ): TimestreamTimestamp = {
      val __obj = js.Dynamic.literal(
        "unit" -> unit.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimestreamTimestamp]
    }
  }

  /** Specifies the TLS context to use for the test authorizer request.
    */
  @js.native
  trait TlsContext extends js.Object {
    var serverName: js.UndefOr[ServerName]
  }

  object TlsContext {
    @inline
    def apply(
        serverName: js.UndefOr[ServerName] = js.undefined
    ): TlsContext = {
      val __obj = js.Dynamic.literal()
      serverName.foreach(__v => __obj.updateDynamic("serverName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TlsContext]
    }
  }

  /** Describes a rule.
    */
  @js.native
  trait TopicRule extends js.Object {
    var actions: js.UndefOr[ActionList]
    var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion]
    var createdAt: js.UndefOr[CreatedAtDate]
    var description: js.UndefOr[Description]
    var errorAction: js.UndefOr[Action]
    var ruleDisabled: js.UndefOr[IsDisabled]
    var ruleName: js.UndefOr[RuleName]
    var sql: js.UndefOr[SQL]
  }

  object TopicRule {
    @inline
    def apply(
        actions: js.UndefOr[ActionList] = js.undefined,
        awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.undefined,
        createdAt: js.UndefOr[CreatedAtDate] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        errorAction: js.UndefOr[Action] = js.undefined,
        ruleDisabled: js.UndefOr[IsDisabled] = js.undefined,
        ruleName: js.UndefOr[RuleName] = js.undefined,
        sql: js.UndefOr[SQL] = js.undefined
    ): TopicRule = {
      val __obj = js.Dynamic.literal()
      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      awsIotSqlVersion.foreach(__v => __obj.updateDynamic("awsIotSqlVersion")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      errorAction.foreach(__v => __obj.updateDynamic("errorAction")(__v.asInstanceOf[js.Any]))
      ruleDisabled.foreach(__v => __obj.updateDynamic("ruleDisabled")(__v.asInstanceOf[js.Any]))
      ruleName.foreach(__v => __obj.updateDynamic("ruleName")(__v.asInstanceOf[js.Any]))
      sql.foreach(__v => __obj.updateDynamic("sql")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicRule]
    }
  }

  /** A topic rule destination.
    */
  @js.native
  trait TopicRuleDestination extends js.Object {
    var arn: js.UndefOr[AwsArn]
    var createdAt: js.UndefOr[CreatedAtDate]
    var httpUrlProperties: js.UndefOr[HttpUrlDestinationProperties]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAtDate]
    var status: js.UndefOr[TopicRuleDestinationStatus]
    var statusReason: js.UndefOr[String]
    var vpcProperties: js.UndefOr[VpcDestinationProperties]
  }

  object TopicRuleDestination {
    @inline
    def apply(
        arn: js.UndefOr[AwsArn] = js.undefined,
        createdAt: js.UndefOr[CreatedAtDate] = js.undefined,
        httpUrlProperties: js.UndefOr[HttpUrlDestinationProperties] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAtDate] = js.undefined,
        status: js.UndefOr[TopicRuleDestinationStatus] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        vpcProperties: js.UndefOr[VpcDestinationProperties] = js.undefined
    ): TopicRuleDestination = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      httpUrlProperties.foreach(__v => __obj.updateDynamic("httpUrlProperties")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      vpcProperties.foreach(__v => __obj.updateDynamic("vpcProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicRuleDestination]
    }
  }

  /** Configuration of the topic rule destination.
    */
  @js.native
  trait TopicRuleDestinationConfiguration extends js.Object {
    var httpUrlConfiguration: js.UndefOr[HttpUrlDestinationConfiguration]
    var vpcConfiguration: js.UndefOr[VpcDestinationConfiguration]
  }

  object TopicRuleDestinationConfiguration {
    @inline
    def apply(
        httpUrlConfiguration: js.UndefOr[HttpUrlDestinationConfiguration] = js.undefined,
        vpcConfiguration: js.UndefOr[VpcDestinationConfiguration] = js.undefined
    ): TopicRuleDestinationConfiguration = {
      val __obj = js.Dynamic.literal()
      httpUrlConfiguration.foreach(__v => __obj.updateDynamic("httpUrlConfiguration")(__v.asInstanceOf[js.Any]))
      vpcConfiguration.foreach(__v => __obj.updateDynamic("vpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicRuleDestinationConfiguration]
    }
  }

  @js.native
  sealed trait TopicRuleDestinationStatus extends js.Any
  object TopicRuleDestinationStatus {
    val ENABLED = "ENABLED".asInstanceOf[TopicRuleDestinationStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[TopicRuleDestinationStatus]
    val DISABLED = "DISABLED".asInstanceOf[TopicRuleDestinationStatus]
    val ERROR = "ERROR".asInstanceOf[TopicRuleDestinationStatus]
    val DELETING = "DELETING".asInstanceOf[TopicRuleDestinationStatus]

    @inline def values = js.Array(ENABLED, IN_PROGRESS, DISABLED, ERROR, DELETING)
  }

  /** Information about the topic rule destination.
    */
  @js.native
  trait TopicRuleDestinationSummary extends js.Object {
    var arn: js.UndefOr[AwsArn]
    var createdAt: js.UndefOr[CreatedAtDate]
    var httpUrlSummary: js.UndefOr[HttpUrlDestinationSummary]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAtDate]
    var status: js.UndefOr[TopicRuleDestinationStatus]
    var statusReason: js.UndefOr[String]
    var vpcDestinationSummary: js.UndefOr[VpcDestinationSummary]
  }

  object TopicRuleDestinationSummary {
    @inline
    def apply(
        arn: js.UndefOr[AwsArn] = js.undefined,
        createdAt: js.UndefOr[CreatedAtDate] = js.undefined,
        httpUrlSummary: js.UndefOr[HttpUrlDestinationSummary] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAtDate] = js.undefined,
        status: js.UndefOr[TopicRuleDestinationStatus] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        vpcDestinationSummary: js.UndefOr[VpcDestinationSummary] = js.undefined
    ): TopicRuleDestinationSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      httpUrlSummary.foreach(__v => __obj.updateDynamic("httpUrlSummary")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      vpcDestinationSummary.foreach(__v => __obj.updateDynamic("vpcDestinationSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicRuleDestinationSummary]
    }
  }

  /** Describes a rule.
    */
  @js.native
  trait TopicRuleListItem extends js.Object {
    var createdAt: js.UndefOr[CreatedAtDate]
    var ruleArn: js.UndefOr[RuleArn]
    var ruleDisabled: js.UndefOr[IsDisabled]
    var ruleName: js.UndefOr[RuleName]
    var topicPattern: js.UndefOr[TopicPattern]
  }

  object TopicRuleListItem {
    @inline
    def apply(
        createdAt: js.UndefOr[CreatedAtDate] = js.undefined,
        ruleArn: js.UndefOr[RuleArn] = js.undefined,
        ruleDisabled: js.UndefOr[IsDisabled] = js.undefined,
        ruleName: js.UndefOr[RuleName] = js.undefined,
        topicPattern: js.UndefOr[TopicPattern] = js.undefined
    ): TopicRuleListItem = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      ruleArn.foreach(__v => __obj.updateDynamic("ruleArn")(__v.asInstanceOf[js.Any]))
      ruleDisabled.foreach(__v => __obj.updateDynamic("ruleDisabled")(__v.asInstanceOf[js.Any]))
      ruleName.foreach(__v => __obj.updateDynamic("ruleName")(__v.asInstanceOf[js.Any]))
      topicPattern.foreach(__v => __obj.updateDynamic("topicPattern")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicRuleListItem]
    }
  }

  /** Describes a rule.
    */
  @js.native
  trait TopicRulePayload extends js.Object {
    var actions: ActionList
    var sql: SQL
    var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion]
    var description: js.UndefOr[Description]
    var errorAction: js.UndefOr[Action]
    var ruleDisabled: js.UndefOr[IsDisabled]
  }

  object TopicRulePayload {
    @inline
    def apply(
        actions: ActionList,
        sql: SQL,
        awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        errorAction: js.UndefOr[Action] = js.undefined,
        ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
    ): TopicRulePayload = {
      val __obj = js.Dynamic.literal(
        "actions" -> actions.asInstanceOf[js.Any],
        "sql" -> sql.asInstanceOf[js.Any]
      )

      awsIotSqlVersion.foreach(__v => __obj.updateDynamic("awsIotSqlVersion")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      errorAction.foreach(__v => __obj.updateDynamic("errorAction")(__v.asInstanceOf[js.Any]))
      ruleDisabled.foreach(__v => __obj.updateDynamic("ruleDisabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicRulePayload]
    }
  }

  /** The input for the TransferCertificate operation.
    */
  @js.native
  trait TransferCertificateRequest extends js.Object {
    var certificateId: CertificateId
    var targetAwsAccount: AwsAccountId
    var transferMessage: js.UndefOr[Message]
  }

  object TransferCertificateRequest {
    @inline
    def apply(
        certificateId: CertificateId,
        targetAwsAccount: AwsAccountId,
        transferMessage: js.UndefOr[Message] = js.undefined
    ): TransferCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "certificateId" -> certificateId.asInstanceOf[js.Any],
        "targetAwsAccount" -> targetAwsAccount.asInstanceOf[js.Any]
      )

      transferMessage.foreach(__v => __obj.updateDynamic("transferMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransferCertificateRequest]
    }
  }

  /** The output from the TransferCertificate operation.
    */
  @js.native
  trait TransferCertificateResponse extends js.Object {
    var transferredCertificateArn: js.UndefOr[CertificateArn]
  }

  object TransferCertificateResponse {
    @inline
    def apply(
        transferredCertificateArn: js.UndefOr[CertificateArn] = js.undefined
    ): TransferCertificateResponse = {
      val __obj = js.Dynamic.literal()
      transferredCertificateArn.foreach(__v => __obj.updateDynamic("transferredCertificateArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransferCertificateResponse]
    }
  }

  /** Data used to transfer a certificate to an AWS account.
    */
  @js.native
  trait TransferData extends js.Object {
    var acceptDate: js.UndefOr[DateType]
    var rejectDate: js.UndefOr[DateType]
    var rejectReason: js.UndefOr[Message]
    var transferDate: js.UndefOr[DateType]
    var transferMessage: js.UndefOr[Message]
  }

  object TransferData {
    @inline
    def apply(
        acceptDate: js.UndefOr[DateType] = js.undefined,
        rejectDate: js.UndefOr[DateType] = js.undefined,
        rejectReason: js.UndefOr[Message] = js.undefined,
        transferDate: js.UndefOr[DateType] = js.undefined,
        transferMessage: js.UndefOr[Message] = js.undefined
    ): TransferData = {
      val __obj = js.Dynamic.literal()
      acceptDate.foreach(__v => __obj.updateDynamic("acceptDate")(__v.asInstanceOf[js.Any]))
      rejectDate.foreach(__v => __obj.updateDynamic("rejectDate")(__v.asInstanceOf[js.Any]))
      rejectReason.foreach(__v => __obj.updateDynamic("rejectReason")(__v.asInstanceOf[js.Any]))
      transferDate.foreach(__v => __obj.updateDynamic("transferDate")(__v.asInstanceOf[js.Any]))
      transferMessage.foreach(__v => __obj.updateDynamic("transferMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransferData]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
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
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateAccountAuditConfigurationRequest extends js.Object {
    var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations]
    var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations]
    var roleArn: js.UndefOr[RoleArn]
  }

  object UpdateAccountAuditConfigurationRequest {
    @inline
    def apply(
        auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.undefined,
        auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateAccountAuditConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      auditCheckConfigurations.foreach(__v => __obj.updateDynamic("auditCheckConfigurations")(__v.asInstanceOf[js.Any]))
      auditNotificationTargetConfigurations.foreach(__v => __obj.updateDynamic("auditNotificationTargetConfigurations")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountAuditConfigurationRequest]
    }
  }

  @js.native
  trait UpdateAccountAuditConfigurationResponse extends js.Object

  object UpdateAccountAuditConfigurationResponse {
    @inline
    def apply(): UpdateAccountAuditConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAccountAuditConfigurationResponse]
    }
  }

  @js.native
  trait UpdateAuditSuppressionRequest extends js.Object {
    var checkName: AuditCheckName
    var resourceIdentifier: ResourceIdentifier
    var description: js.UndefOr[AuditDescription]
    var expirationDate: js.UndefOr[Timestamp]
    var suppressIndefinitely: js.UndefOr[SuppressIndefinitely]
  }

  object UpdateAuditSuppressionRequest {
    @inline
    def apply(
        checkName: AuditCheckName,
        resourceIdentifier: ResourceIdentifier,
        description: js.UndefOr[AuditDescription] = js.undefined,
        expirationDate: js.UndefOr[Timestamp] = js.undefined,
        suppressIndefinitely: js.UndefOr[SuppressIndefinitely] = js.undefined
    ): UpdateAuditSuppressionRequest = {
      val __obj = js.Dynamic.literal(
        "checkName" -> checkName.asInstanceOf[js.Any],
        "resourceIdentifier" -> resourceIdentifier.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      expirationDate.foreach(__v => __obj.updateDynamic("expirationDate")(__v.asInstanceOf[js.Any]))
      suppressIndefinitely.foreach(__v => __obj.updateDynamic("suppressIndefinitely")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAuditSuppressionRequest]
    }
  }

  @js.native
  trait UpdateAuditSuppressionResponse extends js.Object

  object UpdateAuditSuppressionResponse {
    @inline
    def apply(): UpdateAuditSuppressionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAuditSuppressionResponse]
    }
  }

  @js.native
  trait UpdateAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
    var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn]
    var status: js.UndefOr[AuthorizerStatus]
    var tokenKeyName: js.UndefOr[TokenKeyName]
    var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap]
  }

  object UpdateAuthorizerRequest {
    @inline
    def apply(
        authorizerName: AuthorizerName,
        authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.undefined,
        status: js.UndefOr[AuthorizerStatus] = js.undefined,
        tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined,
        tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined
    ): UpdateAuthorizerRequest = {
      val __obj = js.Dynamic.literal(
        "authorizerName" -> authorizerName.asInstanceOf[js.Any]
      )

      authorizerFunctionArn.foreach(__v => __obj.updateDynamic("authorizerFunctionArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tokenKeyName.foreach(__v => __obj.updateDynamic("tokenKeyName")(__v.asInstanceOf[js.Any]))
      tokenSigningPublicKeys.foreach(__v => __obj.updateDynamic("tokenSigningPublicKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAuthorizerRequest]
    }
  }

  @js.native
  trait UpdateAuthorizerResponse extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  object UpdateAuthorizerResponse {
    @inline
    def apply(
        authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined,
        authorizerName: js.UndefOr[AuthorizerName] = js.undefined
    ): UpdateAuthorizerResponse = {
      val __obj = js.Dynamic.literal()
      authorizerArn.foreach(__v => __obj.updateDynamic("authorizerArn")(__v.asInstanceOf[js.Any]))
      authorizerName.foreach(__v => __obj.updateDynamic("authorizerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAuthorizerResponse]
    }
  }

  @js.native
  trait UpdateBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
    var billingGroupProperties: BillingGroupProperties
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object UpdateBillingGroupRequest {
    @inline
    def apply(
        billingGroupName: BillingGroupName,
        billingGroupProperties: BillingGroupProperties,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): UpdateBillingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "billingGroupName" -> billingGroupName.asInstanceOf[js.Any],
        "billingGroupProperties" -> billingGroupProperties.asInstanceOf[js.Any]
      )

      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBillingGroupRequest]
    }
  }

  @js.native
  trait UpdateBillingGroupResponse extends js.Object {
    var version: js.UndefOr[Version]
  }

  object UpdateBillingGroupResponse {
    @inline
    def apply(
        version: js.UndefOr[Version] = js.undefined
    ): UpdateBillingGroupResponse = {
      val __obj = js.Dynamic.literal()
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBillingGroupResponse]
    }
  }

  /** Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
    */
  @js.native
  trait UpdateCACertificateParams extends js.Object {
    var action: CACertificateUpdateAction
  }

  object UpdateCACertificateParams {
    @inline
    def apply(
        action: CACertificateUpdateAction
    ): UpdateCACertificateParams = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCACertificateParams]
    }
  }

  /** The input to the UpdateCACertificate operation.
    */
  @js.native
  trait UpdateCACertificateRequest extends js.Object {
    var certificateId: CertificateId
    var newAutoRegistrationStatus: js.UndefOr[AutoRegistrationStatus]
    var newStatus: js.UndefOr[CACertificateStatus]
    var registrationConfig: js.UndefOr[RegistrationConfig]
    var removeAutoRegistration: js.UndefOr[RemoveAutoRegistration]
  }

  object UpdateCACertificateRequest {
    @inline
    def apply(
        certificateId: CertificateId,
        newAutoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.undefined,
        newStatus: js.UndefOr[CACertificateStatus] = js.undefined,
        registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined,
        removeAutoRegistration: js.UndefOr[RemoveAutoRegistration] = js.undefined
    ): UpdateCACertificateRequest = {
      val __obj = js.Dynamic.literal(
        "certificateId" -> certificateId.asInstanceOf[js.Any]
      )

      newAutoRegistrationStatus.foreach(__v => __obj.updateDynamic("newAutoRegistrationStatus")(__v.asInstanceOf[js.Any]))
      newStatus.foreach(__v => __obj.updateDynamic("newStatus")(__v.asInstanceOf[js.Any]))
      registrationConfig.foreach(__v => __obj.updateDynamic("registrationConfig")(__v.asInstanceOf[js.Any]))
      removeAutoRegistration.foreach(__v => __obj.updateDynamic("removeAutoRegistration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCACertificateRequest]
    }
  }

  /** The input for the UpdateCertificate operation.
    */
  @js.native
  trait UpdateCertificateRequest extends js.Object {
    var certificateId: CertificateId
    var newStatus: CertificateStatus
  }

  object UpdateCertificateRequest {
    @inline
    def apply(
        certificateId: CertificateId,
        newStatus: CertificateStatus
    ): UpdateCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "certificateId" -> certificateId.asInstanceOf[js.Any],
        "newStatus" -> newStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCertificateRequest]
    }
  }

  @js.native
  trait UpdateCustomMetricRequest extends js.Object {
    var displayName: CustomMetricDisplayName
    var metricName: MetricName
  }

  object UpdateCustomMetricRequest {
    @inline
    def apply(
        displayName: CustomMetricDisplayName,
        metricName: MetricName
    ): UpdateCustomMetricRequest = {
      val __obj = js.Dynamic.literal(
        "displayName" -> displayName.asInstanceOf[js.Any],
        "metricName" -> metricName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCustomMetricRequest]
    }
  }

  @js.native
  trait UpdateCustomMetricResponse extends js.Object {
    var creationDate: js.UndefOr[Timestamp]
    var displayName: js.UndefOr[CustomMetricDisplayName]
    var lastModifiedDate: js.UndefOr[Timestamp]
    var metricArn: js.UndefOr[CustomMetricArn]
    var metricName: js.UndefOr[MetricName]
    var metricType: js.UndefOr[CustomMetricType]
  }

  object UpdateCustomMetricResponse {
    @inline
    def apply(
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        displayName: js.UndefOr[CustomMetricDisplayName] = js.undefined,
        lastModifiedDate: js.UndefOr[Timestamp] = js.undefined,
        metricArn: js.UndefOr[CustomMetricArn] = js.undefined,
        metricName: js.UndefOr[MetricName] = js.undefined,
        metricType: js.UndefOr[CustomMetricType] = js.undefined
    ): UpdateCustomMetricResponse = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      metricArn.foreach(__v => __obj.updateDynamic("metricArn")(__v.asInstanceOf[js.Any]))
      metricName.foreach(__v => __obj.updateDynamic("metricName")(__v.asInstanceOf[js.Any]))
      metricType.foreach(__v => __obj.updateDynamic("metricType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCustomMetricResponse]
    }
  }

  /** Parameters to define a mitigation action that changes the state of the device certificate to inactive.
    */
  @js.native
  trait UpdateDeviceCertificateParams extends js.Object {
    var action: DeviceCertificateUpdateAction
  }

  object UpdateDeviceCertificateParams {
    @inline
    def apply(
        action: DeviceCertificateUpdateAction
    ): UpdateDeviceCertificateParams = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDeviceCertificateParams]
    }
  }

  @js.native
  trait UpdateDimensionRequest extends js.Object {
    var name: DimensionName
    var stringValues: DimensionStringValues
  }

  object UpdateDimensionRequest {
    @inline
    def apply(
        name: DimensionName,
        stringValues: DimensionStringValues
    ): UpdateDimensionRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "stringValues" -> stringValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDimensionRequest]
    }
  }

  @js.native
  trait UpdateDimensionResponse extends js.Object {
    var arn: js.UndefOr[DimensionArn]
    var creationDate: js.UndefOr[Timestamp]
    var lastModifiedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[DimensionName]
    var stringValues: js.UndefOr[DimensionStringValues]
    var `type`: js.UndefOr[DimensionType]
  }

  object UpdateDimensionResponse {
    @inline
    def apply(
        arn: js.UndefOr[DimensionArn] = js.undefined,
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        lastModifiedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[DimensionName] = js.undefined,
        stringValues: js.UndefOr[DimensionStringValues] = js.undefined,
        `type`: js.UndefOr[DimensionType] = js.undefined
    ): UpdateDimensionResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      stringValues.foreach(__v => __obj.updateDynamic("stringValues")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDimensionResponse]
    }
  }

  @js.native
  trait UpdateDomainConfigurationRequest extends js.Object {
    var domainConfigurationName: ReservedDomainConfigurationName
    var authorizerConfig: js.UndefOr[AuthorizerConfig]
    var domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus]
    var removeAuthorizerConfig: js.UndefOr[RemoveAuthorizerConfig]
  }

  object UpdateDomainConfigurationRequest {
    @inline
    def apply(
        domainConfigurationName: ReservedDomainConfigurationName,
        authorizerConfig: js.UndefOr[AuthorizerConfig] = js.undefined,
        domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus] = js.undefined,
        removeAuthorizerConfig: js.UndefOr[RemoveAuthorizerConfig] = js.undefined
    ): UpdateDomainConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "domainConfigurationName" -> domainConfigurationName.asInstanceOf[js.Any]
      )

      authorizerConfig.foreach(__v => __obj.updateDynamic("authorizerConfig")(__v.asInstanceOf[js.Any]))
      domainConfigurationStatus.foreach(__v => __obj.updateDynamic("domainConfigurationStatus")(__v.asInstanceOf[js.Any]))
      removeAuthorizerConfig.foreach(__v => __obj.updateDynamic("removeAuthorizerConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainConfigurationRequest]
    }
  }

  @js.native
  trait UpdateDomainConfigurationResponse extends js.Object {
    var domainConfigurationArn: js.UndefOr[DomainConfigurationArn]
    var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName]
  }

  object UpdateDomainConfigurationResponse {
    @inline
    def apply(
        domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.undefined,
        domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName] = js.undefined
    ): UpdateDomainConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      domainConfigurationArn.foreach(__v => __obj.updateDynamic("domainConfigurationArn")(__v.asInstanceOf[js.Any]))
      domainConfigurationName.foreach(__v => __obj.updateDynamic("domainConfigurationName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainConfigurationResponse]
    }
  }

  @js.native
  trait UpdateDynamicThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var thingGroupProperties: ThingGroupProperties
    var expectedVersion: js.UndefOr[OptionalVersion]
    var indexName: js.UndefOr[IndexName]
    var queryString: js.UndefOr[QueryString]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  object UpdateDynamicThingGroupRequest {
    @inline
    def apply(
        thingGroupName: ThingGroupName,
        thingGroupProperties: ThingGroupProperties,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined,
        indexName: js.UndefOr[IndexName] = js.undefined,
        queryString: js.UndefOr[QueryString] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined
    ): UpdateDynamicThingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any],
        "thingGroupProperties" -> thingGroupProperties.asInstanceOf[js.Any]
      )

      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      indexName.foreach(__v => __obj.updateDynamic("indexName")(__v.asInstanceOf[js.Any]))
      queryString.foreach(__v => __obj.updateDynamic("queryString")(__v.asInstanceOf[js.Any]))
      queryVersion.foreach(__v => __obj.updateDynamic("queryVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDynamicThingGroupRequest]
    }
  }

  @js.native
  trait UpdateDynamicThingGroupResponse extends js.Object {
    var version: js.UndefOr[Version]
  }

  object UpdateDynamicThingGroupResponse {
    @inline
    def apply(
        version: js.UndefOr[Version] = js.undefined
    ): UpdateDynamicThingGroupResponse = {
      val __obj = js.Dynamic.literal()
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDynamicThingGroupResponse]
    }
  }

  @js.native
  trait UpdateEventConfigurationsRequest extends js.Object {
    var eventConfigurations: js.UndefOr[EventConfigurations]
  }

  object UpdateEventConfigurationsRequest {
    @inline
    def apply(
        eventConfigurations: js.UndefOr[EventConfigurations] = js.undefined
    ): UpdateEventConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      eventConfigurations.foreach(__v => __obj.updateDynamic("eventConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEventConfigurationsRequest]
    }
  }

  @js.native
  trait UpdateEventConfigurationsResponse extends js.Object

  object UpdateEventConfigurationsResponse {
    @inline
    def apply(): UpdateEventConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateEventConfigurationsResponse]
    }
  }

  @js.native
  trait UpdateIndexingConfigurationRequest extends js.Object {
    var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration]
    var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration]
  }

  object UpdateIndexingConfigurationRequest {
    @inline
    def apply(
        thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.undefined,
        thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.undefined
    ): UpdateIndexingConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      thingGroupIndexingConfiguration.foreach(__v => __obj.updateDynamic("thingGroupIndexingConfiguration")(__v.asInstanceOf[js.Any]))
      thingIndexingConfiguration.foreach(__v => __obj.updateDynamic("thingIndexingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIndexingConfigurationRequest]
    }
  }

  @js.native
  trait UpdateIndexingConfigurationResponse extends js.Object

  object UpdateIndexingConfigurationResponse {
    @inline
    def apply(): UpdateIndexingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateIndexingConfigurationResponse]
    }
  }

  @js.native
  trait UpdateJobRequest extends js.Object {
    var jobId: JobId
    var abortConfig: js.UndefOr[AbortConfig]
    var description: js.UndefOr[JobDescription]
    var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig]
    var namespaceId: js.UndefOr[NamespaceId]
    var presignedUrlConfig: js.UndefOr[PresignedUrlConfig]
    var timeoutConfig: js.UndefOr[TimeoutConfig]
  }

  object UpdateJobRequest {
    @inline
    def apply(
        jobId: JobId,
        abortConfig: js.UndefOr[AbortConfig] = js.undefined,
        description: js.UndefOr[JobDescription] = js.undefined,
        jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined,
        namespaceId: js.UndefOr[NamespaceId] = js.undefined,
        presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined,
        timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
    ): UpdateJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      abortConfig.foreach(__v => __obj.updateDynamic("abortConfig")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      jobExecutionsRolloutConfig.foreach(__v => __obj.updateDynamic("jobExecutionsRolloutConfig")(__v.asInstanceOf[js.Any]))
      namespaceId.foreach(__v => __obj.updateDynamic("namespaceId")(__v.asInstanceOf[js.Any]))
      presignedUrlConfig.foreach(__v => __obj.updateDynamic("presignedUrlConfig")(__v.asInstanceOf[js.Any]))
      timeoutConfig.foreach(__v => __obj.updateDynamic("timeoutConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobRequest]
    }
  }

  @js.native
  trait UpdateMitigationActionRequest extends js.Object {
    var actionName: MitigationActionName
    var actionParams: js.UndefOr[MitigationActionParams]
    var roleArn: js.UndefOr[RoleArn]
  }

  object UpdateMitigationActionRequest {
    @inline
    def apply(
        actionName: MitigationActionName,
        actionParams: js.UndefOr[MitigationActionParams] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateMitigationActionRequest = {
      val __obj = js.Dynamic.literal(
        "actionName" -> actionName.asInstanceOf[js.Any]
      )

      actionParams.foreach(__v => __obj.updateDynamic("actionParams")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMitigationActionRequest]
    }
  }

  @js.native
  trait UpdateMitigationActionResponse extends js.Object {
    var actionArn: js.UndefOr[MitigationActionArn]
    var actionId: js.UndefOr[MitigationActionId]
  }

  object UpdateMitigationActionResponse {
    @inline
    def apply(
        actionArn: js.UndefOr[MitigationActionArn] = js.undefined,
        actionId: js.UndefOr[MitigationActionId] = js.undefined
    ): UpdateMitigationActionResponse = {
      val __obj = js.Dynamic.literal()
      actionArn.foreach(__v => __obj.updateDynamic("actionArn")(__v.asInstanceOf[js.Any]))
      actionId.foreach(__v => __obj.updateDynamic("actionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMitigationActionResponse]
    }
  }

  @js.native
  trait UpdateProvisioningTemplateRequest extends js.Object {
    var templateName: TemplateName
    var defaultVersionId: js.UndefOr[TemplateVersionId]
    var description: js.UndefOr[TemplateDescription]
    var enabled: js.UndefOr[Enabled]
    var preProvisioningHook: js.UndefOr[ProvisioningHook]
    var provisioningRoleArn: js.UndefOr[RoleArn]
    var removePreProvisioningHook: js.UndefOr[RemoveHook]
  }

  object UpdateProvisioningTemplateRequest {
    @inline
    def apply(
        templateName: TemplateName,
        defaultVersionId: js.UndefOr[TemplateVersionId] = js.undefined,
        description: js.UndefOr[TemplateDescription] = js.undefined,
        enabled: js.UndefOr[Enabled] = js.undefined,
        preProvisioningHook: js.UndefOr[ProvisioningHook] = js.undefined,
        provisioningRoleArn: js.UndefOr[RoleArn] = js.undefined,
        removePreProvisioningHook: js.UndefOr[RemoveHook] = js.undefined
    ): UpdateProvisioningTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      defaultVersionId.foreach(__v => __obj.updateDynamic("defaultVersionId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      preProvisioningHook.foreach(__v => __obj.updateDynamic("preProvisioningHook")(__v.asInstanceOf[js.Any]))
      provisioningRoleArn.foreach(__v => __obj.updateDynamic("provisioningRoleArn")(__v.asInstanceOf[js.Any]))
      removePreProvisioningHook.foreach(__v => __obj.updateDynamic("removePreProvisioningHook")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisioningTemplateRequest]
    }
  }

  @js.native
  trait UpdateProvisioningTemplateResponse extends js.Object

  object UpdateProvisioningTemplateResponse {
    @inline
    def apply(): UpdateProvisioningTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateProvisioningTemplateResponse]
    }
  }

  @js.native
  trait UpdateRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds]
    var roleArn: js.UndefOr[RoleArn]
  }

  object UpdateRoleAliasRequest {
    @inline
    def apply(
        roleAlias: RoleAlias,
        credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateRoleAliasRequest = {
      val __obj = js.Dynamic.literal(
        "roleAlias" -> roleAlias.asInstanceOf[js.Any]
      )

      credentialDurationSeconds.foreach(__v => __obj.updateDynamic("credentialDurationSeconds")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoleAliasRequest]
    }
  }

  @js.native
  trait UpdateRoleAliasResponse extends js.Object {
    var roleAlias: js.UndefOr[RoleAlias]
    var roleAliasArn: js.UndefOr[RoleAliasArn]
  }

  object UpdateRoleAliasResponse {
    @inline
    def apply(
        roleAlias: js.UndefOr[RoleAlias] = js.undefined,
        roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
    ): UpdateRoleAliasResponse = {
      val __obj = js.Dynamic.literal()
      roleAlias.foreach(__v => __obj.updateDynamic("roleAlias")(__v.asInstanceOf[js.Any]))
      roleAliasArn.foreach(__v => __obj.updateDynamic("roleAliasArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoleAliasResponse]
    }
  }

  @js.native
  trait UpdateScheduledAuditRequest extends js.Object {
    var scheduledAuditName: ScheduledAuditName
    var dayOfMonth: js.UndefOr[DayOfMonth]
    var dayOfWeek: js.UndefOr[DayOfWeek]
    var frequency: js.UndefOr[AuditFrequency]
    var targetCheckNames: js.UndefOr[TargetAuditCheckNames]
  }

  object UpdateScheduledAuditRequest {
    @inline
    def apply(
        scheduledAuditName: ScheduledAuditName,
        dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
        frequency: js.UndefOr[AuditFrequency] = js.undefined,
        targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined
    ): UpdateScheduledAuditRequest = {
      val __obj = js.Dynamic.literal(
        "scheduledAuditName" -> scheduledAuditName.asInstanceOf[js.Any]
      )

      dayOfMonth.foreach(__v => __obj.updateDynamic("dayOfMonth")(__v.asInstanceOf[js.Any]))
      dayOfWeek.foreach(__v => __obj.updateDynamic("dayOfWeek")(__v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.updateDynamic("frequency")(__v.asInstanceOf[js.Any]))
      targetCheckNames.foreach(__v => __obj.updateDynamic("targetCheckNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateScheduledAuditRequest]
    }
  }

  @js.native
  trait UpdateScheduledAuditResponse extends js.Object {
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
  }

  object UpdateScheduledAuditResponse {
    @inline
    def apply(
        scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined
    ): UpdateScheduledAuditResponse = {
      val __obj = js.Dynamic.literal()
      scheduledAuditArn.foreach(__v => __obj.updateDynamic("scheduledAuditArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateScheduledAuditResponse]
    }
  }

  @js.native
  trait UpdateSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList]
    var additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List]
    var alertTargets: js.UndefOr[AlertTargets]
    var behaviors: js.UndefOr[Behaviors]
    var deleteAdditionalMetricsToRetain: js.UndefOr[DeleteAdditionalMetricsToRetain]
    var deleteAlertTargets: js.UndefOr[DeleteAlertTargets]
    var deleteBehaviors: js.UndefOr[DeleteBehaviors]
    var expectedVersion: js.UndefOr[OptionalVersion]
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription]
  }

  object UpdateSecurityProfileRequest {
    @inline
    def apply(
        securityProfileName: SecurityProfileName,
        additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined,
        additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List] = js.undefined,
        alertTargets: js.UndefOr[AlertTargets] = js.undefined,
        behaviors: js.UndefOr[Behaviors] = js.undefined,
        deleteAdditionalMetricsToRetain: js.UndefOr[DeleteAdditionalMetricsToRetain] = js.undefined,
        deleteAlertTargets: js.UndefOr[DeleteAlertTargets] = js.undefined,
        deleteBehaviors: js.UndefOr[DeleteBehaviors] = js.undefined,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined,
        securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined
    ): UpdateSecurityProfileRequest = {
      val __obj = js.Dynamic.literal(
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any]
      )

      additionalMetricsToRetain.foreach(__v => __obj.updateDynamic("additionalMetricsToRetain")(__v.asInstanceOf[js.Any]))
      additionalMetricsToRetainV2.foreach(__v => __obj.updateDynamic("additionalMetricsToRetainV2")(__v.asInstanceOf[js.Any]))
      alertTargets.foreach(__v => __obj.updateDynamic("alertTargets")(__v.asInstanceOf[js.Any]))
      behaviors.foreach(__v => __obj.updateDynamic("behaviors")(__v.asInstanceOf[js.Any]))
      deleteAdditionalMetricsToRetain.foreach(__v => __obj.updateDynamic("deleteAdditionalMetricsToRetain")(__v.asInstanceOf[js.Any]))
      deleteAlertTargets.foreach(__v => __obj.updateDynamic("deleteAlertTargets")(__v.asInstanceOf[js.Any]))
      deleteBehaviors.foreach(__v => __obj.updateDynamic("deleteBehaviors")(__v.asInstanceOf[js.Any]))
      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      securityProfileDescription.foreach(__v => __obj.updateDynamic("securityProfileDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecurityProfileRequest]
    }
  }

  @js.native
  trait UpdateSecurityProfileResponse extends js.Object {
    var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList]
    var additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List]
    var alertTargets: js.UndefOr[AlertTargets]
    var behaviors: js.UndefOr[Behaviors]
    var creationDate: js.UndefOr[Timestamp]
    var lastModifiedDate: js.UndefOr[Timestamp]
    var securityProfileArn: js.UndefOr[SecurityProfileArn]
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var version: js.UndefOr[Version]
  }

  object UpdateSecurityProfileResponse {
    @inline
    def apply(
        additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined,
        additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List] = js.undefined,
        alertTargets: js.UndefOr[AlertTargets] = js.undefined,
        behaviors: js.UndefOr[Behaviors] = js.undefined,
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        lastModifiedDate: js.UndefOr[Timestamp] = js.undefined,
        securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined,
        securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): UpdateSecurityProfileResponse = {
      val __obj = js.Dynamic.literal()
      additionalMetricsToRetain.foreach(__v => __obj.updateDynamic("additionalMetricsToRetain")(__v.asInstanceOf[js.Any]))
      additionalMetricsToRetainV2.foreach(__v => __obj.updateDynamic("additionalMetricsToRetainV2")(__v.asInstanceOf[js.Any]))
      alertTargets.foreach(__v => __obj.updateDynamic("alertTargets")(__v.asInstanceOf[js.Any]))
      behaviors.foreach(__v => __obj.updateDynamic("behaviors")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      securityProfileArn.foreach(__v => __obj.updateDynamic("securityProfileArn")(__v.asInstanceOf[js.Any]))
      securityProfileDescription.foreach(__v => __obj.updateDynamic("securityProfileDescription")(__v.asInstanceOf[js.Any]))
      securityProfileName.foreach(__v => __obj.updateDynamic("securityProfileName")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecurityProfileResponse]
    }
  }

  @js.native
  trait UpdateStreamRequest extends js.Object {
    var streamId: StreamId
    var description: js.UndefOr[StreamDescription]
    var files: js.UndefOr[StreamFiles]
    var roleArn: js.UndefOr[RoleArn]
  }

  object UpdateStreamRequest {
    @inline
    def apply(
        streamId: StreamId,
        description: js.UndefOr[StreamDescription] = js.undefined,
        files: js.UndefOr[StreamFiles] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateStreamRequest = {
      val __obj = js.Dynamic.literal(
        "streamId" -> streamId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      files.foreach(__v => __obj.updateDynamic("files")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStreamRequest]
    }
  }

  @js.native
  trait UpdateStreamResponse extends js.Object {
    var description: js.UndefOr[StreamDescription]
    var streamArn: js.UndefOr[StreamArn]
    var streamId: js.UndefOr[StreamId]
    var streamVersion: js.UndefOr[StreamVersion]
  }

  object UpdateStreamResponse {
    @inline
    def apply(
        description: js.UndefOr[StreamDescription] = js.undefined,
        streamArn: js.UndefOr[StreamArn] = js.undefined,
        streamId: js.UndefOr[StreamId] = js.undefined,
        streamVersion: js.UndefOr[StreamVersion] = js.undefined
    ): UpdateStreamResponse = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      streamArn.foreach(__v => __obj.updateDynamic("streamArn")(__v.asInstanceOf[js.Any]))
      streamId.foreach(__v => __obj.updateDynamic("streamId")(__v.asInstanceOf[js.Any]))
      streamVersion.foreach(__v => __obj.updateDynamic("streamVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStreamResponse]
    }
  }

  @js.native
  trait UpdateThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var thingGroupProperties: ThingGroupProperties
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object UpdateThingGroupRequest {
    @inline
    def apply(
        thingGroupName: ThingGroupName,
        thingGroupProperties: ThingGroupProperties,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): UpdateThingGroupRequest = {
      val __obj = js.Dynamic.literal(
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any],
        "thingGroupProperties" -> thingGroupProperties.asInstanceOf[js.Any]
      )

      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThingGroupRequest]
    }
  }

  @js.native
  trait UpdateThingGroupResponse extends js.Object {
    var version: js.UndefOr[Version]
  }

  object UpdateThingGroupResponse {
    @inline
    def apply(
        version: js.UndefOr[Version] = js.undefined
    ): UpdateThingGroupResponse = {
      val __obj = js.Dynamic.literal()
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThingGroupResponse]
    }
  }

  @js.native
  trait UpdateThingGroupsForThingRequest extends js.Object {
    var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups]
    var thingGroupsToAdd: js.UndefOr[ThingGroupList]
    var thingGroupsToRemove: js.UndefOr[ThingGroupList]
    var thingName: js.UndefOr[ThingName]
  }

  object UpdateThingGroupsForThingRequest {
    @inline
    def apply(
        overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined,
        thingGroupsToAdd: js.UndefOr[ThingGroupList] = js.undefined,
        thingGroupsToRemove: js.UndefOr[ThingGroupList] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): UpdateThingGroupsForThingRequest = {
      val __obj = js.Dynamic.literal()
      overrideDynamicGroups.foreach(__v => __obj.updateDynamic("overrideDynamicGroups")(__v.asInstanceOf[js.Any]))
      thingGroupsToAdd.foreach(__v => __obj.updateDynamic("thingGroupsToAdd")(__v.asInstanceOf[js.Any]))
      thingGroupsToRemove.foreach(__v => __obj.updateDynamic("thingGroupsToRemove")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThingGroupsForThingRequest]
    }
  }

  @js.native
  trait UpdateThingGroupsForThingResponse extends js.Object

  object UpdateThingGroupsForThingResponse {
    @inline
    def apply(): UpdateThingGroupsForThingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateThingGroupsForThingResponse]
    }
  }

  /** The input for the UpdateThing operation.
    */
  @js.native
  trait UpdateThingRequest extends js.Object {
    var thingName: ThingName
    var attributePayload: js.UndefOr[AttributePayload]
    var expectedVersion: js.UndefOr[OptionalVersion]
    var removeThingType: js.UndefOr[RemoveThingType]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  object UpdateThingRequest {
    @inline
    def apply(
        thingName: ThingName,
        attributePayload: js.UndefOr[AttributePayload] = js.undefined,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined,
        removeThingType: js.UndefOr[RemoveThingType] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    ): UpdateThingRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      attributePayload.foreach(__v => __obj.updateDynamic("attributePayload")(__v.asInstanceOf[js.Any]))
      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      removeThingType.foreach(__v => __obj.updateDynamic("removeThingType")(__v.asInstanceOf[js.Any]))
      thingTypeName.foreach(__v => __obj.updateDynamic("thingTypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThingRequest]
    }
  }

  /** The output from the UpdateThing operation.
    */
  @js.native
  trait UpdateThingResponse extends js.Object

  object UpdateThingResponse {
    @inline
    def apply(): UpdateThingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateThingResponse]
    }
  }

  @js.native
  trait UpdateTopicRuleDestinationRequest extends js.Object {
    var arn: AwsArn
    var status: TopicRuleDestinationStatus
  }

  object UpdateTopicRuleDestinationRequest {
    @inline
    def apply(
        arn: AwsArn,
        status: TopicRuleDestinationStatus
    ): UpdateTopicRuleDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateTopicRuleDestinationRequest]
    }
  }

  @js.native
  trait UpdateTopicRuleDestinationResponse extends js.Object

  object UpdateTopicRuleDestinationResponse {
    @inline
    def apply(): UpdateTopicRuleDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTopicRuleDestinationResponse]
    }
  }

  @js.native
  trait ValidateSecurityProfileBehaviorsRequest extends js.Object {
    var behaviors: Behaviors
  }

  object ValidateSecurityProfileBehaviorsRequest {
    @inline
    def apply(
        behaviors: Behaviors
    ): ValidateSecurityProfileBehaviorsRequest = {
      val __obj = js.Dynamic.literal(
        "behaviors" -> behaviors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ValidateSecurityProfileBehaviorsRequest]
    }
  }

  @js.native
  trait ValidateSecurityProfileBehaviorsResponse extends js.Object {
    var valid: js.UndefOr[Valid]
    var validationErrors: js.UndefOr[ValidationErrors]
  }

  object ValidateSecurityProfileBehaviorsResponse {
    @inline
    def apply(
        valid: js.UndefOr[Valid] = js.undefined,
        validationErrors: js.UndefOr[ValidationErrors] = js.undefined
    ): ValidateSecurityProfileBehaviorsResponse = {
      val __obj = js.Dynamic.literal()
      valid.foreach(__v => __obj.updateDynamic("valid")(__v.asInstanceOf[js.Any]))
      validationErrors.foreach(__v => __obj.updateDynamic("validationErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidateSecurityProfileBehaviorsResponse]
    }
  }

  /** Information about an error found in a behavior specification.
    */
  @js.native
  trait ValidationError extends js.Object {
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object ValidationError {
    @inline
    def apply(
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): ValidationError = {
      val __obj = js.Dynamic.literal()
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidationError]
    }
  }

  /** Information about a Device Defender security profile behavior violation.
    */
  @js.native
  trait ViolationEvent extends js.Object {
    var behavior: js.UndefOr[Behavior]
    var metricValue: js.UndefOr[MetricValue]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[DeviceDefenderThingName]
    var violationEventAdditionalInfo: js.UndefOr[ViolationEventAdditionalInfo]
    var violationEventTime: js.UndefOr[Timestamp]
    var violationEventType: js.UndefOr[ViolationEventType]
    var violationId: js.UndefOr[ViolationId]
  }

  object ViolationEvent {
    @inline
    def apply(
        behavior: js.UndefOr[Behavior] = js.undefined,
        metricValue: js.UndefOr[MetricValue] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined,
        violationEventAdditionalInfo: js.UndefOr[ViolationEventAdditionalInfo] = js.undefined,
        violationEventTime: js.UndefOr[Timestamp] = js.undefined,
        violationEventType: js.UndefOr[ViolationEventType] = js.undefined,
        violationId: js.UndefOr[ViolationId] = js.undefined
    ): ViolationEvent = {
      val __obj = js.Dynamic.literal()
      behavior.foreach(__v => __obj.updateDynamic("behavior")(__v.asInstanceOf[js.Any]))
      metricValue.foreach(__v => __obj.updateDynamic("metricValue")(__v.asInstanceOf[js.Any]))
      securityProfileName.foreach(__v => __obj.updateDynamic("securityProfileName")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      violationEventAdditionalInfo.foreach(__v => __obj.updateDynamic("violationEventAdditionalInfo")(__v.asInstanceOf[js.Any]))
      violationEventTime.foreach(__v => __obj.updateDynamic("violationEventTime")(__v.asInstanceOf[js.Any]))
      violationEventType.foreach(__v => __obj.updateDynamic("violationEventType")(__v.asInstanceOf[js.Any]))
      violationId.foreach(__v => __obj.updateDynamic("violationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ViolationEvent]
    }
  }

  /** The details of a violation event.
    */
  @js.native
  trait ViolationEventAdditionalInfo extends js.Object {
    var confidenceLevel: js.UndefOr[ConfidenceLevel]
  }

  object ViolationEventAdditionalInfo {
    @inline
    def apply(
        confidenceLevel: js.UndefOr[ConfidenceLevel] = js.undefined
    ): ViolationEventAdditionalInfo = {
      val __obj = js.Dynamic.literal()
      confidenceLevel.foreach(__v => __obj.updateDynamic("confidenceLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ViolationEventAdditionalInfo]
    }
  }

  /** Specifies the time period of which violation events occurred between.
    */
  @js.native
  trait ViolationEventOccurrenceRange extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
  }

  object ViolationEventOccurrenceRange {
    @inline
    def apply(
        endTime: Timestamp,
        startTime: Timestamp
    ): ViolationEventOccurrenceRange = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ViolationEventOccurrenceRange]
    }
  }

  @js.native
  sealed trait ViolationEventType extends js.Any
  object ViolationEventType {
    val `in-alarm` = "in-alarm".asInstanceOf[ViolationEventType]
    val `alarm-cleared` = "alarm-cleared".asInstanceOf[ViolationEventType]
    val `alarm-invalidated` = "alarm-invalidated".asInstanceOf[ViolationEventType]

    @inline def values = js.Array(`in-alarm`, `alarm-cleared`, `alarm-invalidated`)
  }

  /** The configuration information for a virtual private cloud (VPC) destination.
    */
  @js.native
  trait VpcDestinationConfiguration extends js.Object {
    var roleArn: AwsArn
    var subnetIds: SubnetIdList
    var vpcId: VpcId
    var securityGroups: js.UndefOr[SecurityGroupList]
  }

  object VpcDestinationConfiguration {
    @inline
    def apply(
        roleArn: AwsArn,
        subnetIds: SubnetIdList,
        vpcId: VpcId,
        securityGroups: js.UndefOr[SecurityGroupList] = js.undefined
    ): VpcDestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "subnetIds" -> subnetIds.asInstanceOf[js.Any],
        "vpcId" -> vpcId.asInstanceOf[js.Any]
      )

      securityGroups.foreach(__v => __obj.updateDynamic("securityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcDestinationConfiguration]
    }
  }

  /** The properties of a virtual private cloud (VPC) destination.
    */
  @js.native
  trait VpcDestinationProperties extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var securityGroups: js.UndefOr[SecurityGroupList]
    var subnetIds: js.UndefOr[SubnetIdList]
    var vpcId: js.UndefOr[VpcId]
  }

  object VpcDestinationProperties {
    @inline
    def apply(
        roleArn: js.UndefOr[AwsArn] = js.undefined,
        securityGroups: js.UndefOr[SecurityGroupList] = js.undefined,
        subnetIds: js.UndefOr[SubnetIdList] = js.undefined,
        vpcId: js.UndefOr[VpcId] = js.undefined
    ): VpcDestinationProperties = {
      val __obj = js.Dynamic.literal()
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      securityGroups.foreach(__v => __obj.updateDynamic("securityGroups")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcDestinationProperties]
    }
  }

  /** The summary of a virtual private cloud (VPC) destination.
    */
  @js.native
  trait VpcDestinationSummary extends js.Object {
    var roleArn: js.UndefOr[AwsArn]
    var securityGroups: js.UndefOr[SecurityGroupList]
    var subnetIds: js.UndefOr[SubnetIdList]
    var vpcId: js.UndefOr[VpcId]
  }

  object VpcDestinationSummary {
    @inline
    def apply(
        roleArn: js.UndefOr[AwsArn] = js.undefined,
        securityGroups: js.UndefOr[SecurityGroupList] = js.undefined,
        subnetIds: js.UndefOr[SubnetIdList] = js.undefined,
        vpcId: js.UndefOr[VpcId] = js.undefined
    ): VpcDestinationSummary = {
      val __obj = js.Dynamic.literal()
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      securityGroups.foreach(__v => __obj.updateDynamic("securityGroups")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcDestinationSummary]
    }
  }
}
