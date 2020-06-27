package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object iot {
  type AbortCriteriaList                          = js.Array[AbortCriteria]
  type AbortThresholdPercentage                   = Double
  type AcmCertificateArn                          = String
  type ActionList                                 = js.Array[Action]
  type ActiveViolations                           = js.Array[ActiveViolation]
  type AdditionalMetricsToRetainList              = js.Array[BehaviorMetric]
  type AdditionalParameterMap                     = js.Dictionary[Value]
  type AggregationField                           = String
  type AlarmName                                  = String
  type AlertTargetArn                             = String
  type AlertTargets                               = js.Dictionary[AlertTarget]
  type AllowAuthorizerOverride                    = Boolean
  type AllowAutoRegistration                      = Boolean
  type ApproximateSecondsBeforeTimedOut           = Double
  type AscendingOrder                             = Boolean
  type AssetId                                    = String
  type AssetPropertyAlias                         = String
  type AssetPropertyBooleanValue                  = String
  type AssetPropertyDoubleValue                   = String
  type AssetPropertyEntryId                       = String
  type AssetPropertyId                            = String
  type AssetPropertyIntegerValue                  = String
  type AssetPropertyOffsetInNanos                 = String
  type AssetPropertyQuality                       = String
  type AssetPropertyStringValue                   = String
  type AssetPropertyTimeInSeconds                 = String
  type AssetPropertyValueList                     = js.Array[AssetPropertyValue]
  type AttributeKey                               = String
  type AttributeName                              = String
  type AttributeValue                             = String
  type Attributes                                 = js.Dictionary[AttributeValue]
  type AttributesMap                              = js.Dictionary[Value]
  type AuditCheckConfigurations                   = js.Dictionary[AuditCheckConfiguration]
  type AuditCheckName                             = String
  type AuditCheckToActionsMapping                 = js.Dictionary[MitigationActionNameList]
  type AuditCheckToReasonCodeFilter               = js.Dictionary[ReasonForNonComplianceCodes]
  type AuditDetails                               = js.Dictionary[AuditCheckDetails]
  type AuditFindings                              = js.Array[AuditFinding]
  type AuditMitigationActionExecutionMetadataList = js.Array[AuditMitigationActionExecutionMetadata]
  type AuditMitigationActionsTaskId               = String
  type AuditMitigationActionsTaskMetadataList     = js.Array[AuditMitigationActionsTaskMetadata]
  type AuditMitigationActionsTaskStatistics       = js.Dictionary[TaskStatisticsForAuditCheck]
  type AuditNotificationTargetConfigurations      = js.Dictionary[AuditNotificationTarget]
  type AuditTaskId                                = String
  type AuditTaskMetadataList                      = js.Array[AuditTaskMetadata]
  type AuthInfos                                  = js.Array[AuthInfo]
  type AuthResults                                = js.Array[AuthResult]
  type AuthorizerArn                              = String
  type AuthorizerFunctionArn                      = String
  type AuthorizerName                             = String
  type Authorizers                                = js.Array[AuthorizerSummary]
  type Average                                    = Double
  type AwsAccountId                               = String
  type AwsArn                                     = String
  type AwsIotJobArn                               = String
  type AwsIotJobId                                = String
  type AwsIotSqlVersion                           = String
  type BehaviorMetric                             = String
  type BehaviorName                               = String
  type Behaviors                                  = js.Array[Behavior]
  type BillingGroupArn                            = String
  type BillingGroupDescription                    = String
  type BillingGroupId                             = String
  type BillingGroupName                           = String
  type BillingGroupNameAndArnList                 = js.Array[GroupNameAndArn]
  type BooleanKey                                 = Boolean
  type BucketName                                 = String
  type CACertificates                             = js.Array[CACertificate]
  type CanceledChecksCount                        = Int
  type CanceledFindingsCount                      = Double
  type CanceledThings                             = Int
  type CertificateArn                             = String
  type CertificateId                              = String
  type CertificateName                            = String
  type CertificatePathOnDevice                    = String
  type CertificatePem                             = String
  type CertificateSigningRequest                  = String
  type Certificates                               = js.Array[Certificate]
  type ChannelName                                = String
  type CheckCompliant                             = Boolean
  type Cidr                                       = String
  type Cidrs                                      = js.Array[Cidr]
  type ClientId                                   = String
  type ClientRequestToken                         = String
  type Code                                       = String
  type CognitoIdentityPoolId                      = String
  type Comment                                    = String
  type CompliantChecksCount                       = Int
  type ConfirmationToken                          = String
  type ConnectivityTimestamp                      = Double
  type ConsecutiveDatapointsToAlarm               = Int
  type ConsecutiveDatapointsToClear               = Int
  type Count                                      = Int
  type CreatedAtDate                              = js.Date
  type CreationDate                               = js.Date
  type CredentialDurationSeconds                  = Int
  type CustomerVersion                            = Int
  type DateType                                   = js.Date
  type DayOfMonth                                 = String
  type DeleteAdditionalMetricsToRetain            = Boolean
  type DeleteAlertTargets                         = Boolean
  type DeleteBehaviors                            = Boolean
  type DeleteScheduledAudits                      = Boolean
  type DeleteStream                               = Boolean
  type DeliveryStreamName                         = String
  type DeprecationDate                            = js.Date
  type Description                                = String
  type DetailsKey                                 = String
  type DetailsMap                                 = js.Dictionary[DetailsValue]
  type DetailsValue                               = String
  type DeviceDefenderThingName                    = String
  type DisableAllLogs                             = Boolean
  type DomainConfigurationArn                     = String
  type DomainConfigurationName                    = String
  type DomainConfigurations                       = js.Array[DomainConfigurationSummary]
  type DomainName                                 = String
  type DurationSeconds                            = Int
  type DynamoOperation                            = String
  type EffectivePolicies                          = js.Array[EffectivePolicy]
  type ElasticsearchEndpoint                      = String
  type ElasticsearchId                            = String
  type ElasticsearchIndex                         = String
  type ElasticsearchType                          = String
  type Enabled                                    = Boolean
  type EndpointAddress                            = String
  type EndpointType                               = String
  type ErrorCode                                  = String
  type ErrorMessage                               = String
  type EvaluationStatistic                        = String
  type EventConfigurations                        = js.Dictionary[Configuration]
  type ExecutionNamePrefix                        = String
  type ExecutionNumber                            = Double
  type ExpectedVersion                            = Double
  type ExpiresInSec                               = Double
  type ExpiresInSeconds                           = Double
  type FailedChecksCount                          = Int
  type FailedFindingsCount                        = Double
  type FailedThings                               = Int
  type FieldName                                  = String
  type Fields                                     = js.Array[Field]
  type FileId                                     = Int
  type FileName                                   = String
  type FindingId                                  = String
  type FindingIds                                 = js.Array[FindingId]
  type FirehoseSeparator                          = String
  type Flag                                       = Boolean
  type ForceDelete                                = Boolean
  type ForceDeleteAWSJob                          = Boolean
  type ForceFlag                                  = Boolean
  type Forced                                     = Boolean
  type FunctionArn                                = String
  type GenerationId                               = String
  type HashAlgorithm                              = String
  type HashKeyField                               = String
  type HashKeyValue                               = String
  type HeaderKey                                  = String
  type HeaderList                                 = js.Array[HttpActionHeader]
  type HeaderValue                                = String
  type HttpHeaderName                             = String
  type HttpHeaderValue                            = String
  type HttpHeaders                                = js.Dictionary[HttpHeaderValue]
  type HttpQueryString                            = String
  type InProgressChecksCount                      = Int
  type InProgressThings                           = Int
  type InProgressTimeoutInMinutes                 = Double
  type IncrementFactor                            = Double
  type IndexName                                  = String
  type IndexNamesList                             = js.Array[IndexName]
  type IndexSchema                                = String
  type InlineDocument                             = String
  type InputName                                  = String
  type IsAuthenticated                            = Boolean
  type IsDefaultVersion                           = Boolean
  type IsDisabled                                 = Boolean
  type JobArn                                     = String
  type JobDescription                             = String
  type JobDocument                                = String
  type JobDocumentSource                          = String
  type JobExecutionSummaryForJobList              = js.Array[JobExecutionSummaryForJob]
  type JobExecutionSummaryForThingList            = js.Array[JobExecutionSummaryForThing]
  type JobId                                      = String
  type JobSummaryList                             = js.Array[JobSummary]
  type JobTargets                                 = js.Array[TargetArn]
  type JsonDocument                               = String
  type Key                                        = String
  type KeyName                                    = String
  type KeyValue                                   = String
  type LaserMaxResults                            = Int
  type LastModifiedDate                           = js.Date
  type LogTargetConfigurations                    = js.Array[LogTargetConfiguration]
  type LogTargetName                              = String
  type Marker                                     = String
  type MaxJobExecutionsPerMin                     = Int
  type MaxResults                                 = Int
  type Maximum                                    = Double
  type MaximumPerMinute                           = Int
  type Message                                    = String
  type MessageId                                  = String
  type Minimum                                    = Double
  type MinimumNumberOfExecutedThings              = Int
  type MissingContextValue                        = String
  type MissingContextValues                       = js.Array[MissingContextValue]
  type MitigationActionArn                        = String
  type MitigationActionId                         = String
  type MitigationActionIdentifierList             = js.Array[MitigationActionIdentifier]
  type MitigationActionList                       = js.Array[MitigationAction]
  type MitigationActionName                       = String
  type MitigationActionNameList                   = js.Array[MitigationActionName]
  type MqttClientId                               = String
  type MqttPassword                               = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type MqttUsername                               = String
  type NextToken                                  = String
  type NonCompliantChecksCount                    = Int
  type NonCompliantResourcesCount                 = Double
  type NumberOfThings                             = Int
  type OTAUpdateArn                               = String
  type OTAUpdateDescription                       = String
  type OTAUpdateErrorMessage                      = String
  type OTAUpdateFileVersion                       = String
  type OTAUpdateFiles                             = js.Array[OTAUpdateFile]
  type OTAUpdateId                                = String
  type OTAUpdatesSummary                          = js.Array[OTAUpdateSummary]
  type OptionalVersion                            = Double
  type OutgoingCertificates                       = js.Array[OutgoingCertificate]
  type OverrideDynamicGroups                      = Boolean
  type PageSize                                   = Int
  type Parameter                                  = String
  type Parameters                                 = js.Dictionary[Value]
  type PartitionKey                               = String
  type PayloadField                               = String
  type Percent                                    = Double
  type PercentList                                = js.Array[Percent]
  type PercentValue                               = Double
  type Percentage                                 = Int
  type Percentiles                                = js.Array[PercentPair]
  type Platform                                   = String
  type Policies                                   = js.Array[Policy]
  type PolicyArn                                  = String
  type PolicyDocument                             = String
  type PolicyDocuments                            = js.Array[PolicyDocument]
  type PolicyName                                 = String
  type PolicyNames                                = js.Array[PolicyName]
  type PolicyTarget                               = String
  type PolicyTargets                              = js.Array[PolicyTarget]
  type PolicyVersionId                            = String
  type PolicyVersions                             = js.Array[PolicyVersion]
  type Port                                       = Int
  type Ports                                      = js.Array[Port]
  type Prefix                                     = String
  type Principal                                  = String
  type PrincipalArn                               = String
  type PrincipalId                                = String
  type Principals                                 = js.Array[PrincipalArn]
  type PrivateKey                                 = String
  type ProcessingTargetName                       = String
  type ProcessingTargetNameList                   = js.Array[ProcessingTargetName]
  type Protocols                                  = js.Array[Protocol]
  type ProvisioningTemplateListing                = js.Array[ProvisioningTemplateSummary]
  type ProvisioningTemplateVersionListing         = js.Array[ProvisioningTemplateVersionSummary]
  type PublicKey                                  = String
  type PublicKeyMap                               = js.Dictionary[KeyValue]
  type PutAssetPropertyValueEntryList             = js.Array[PutAssetPropertyValueEntry]
  type Qos                                        = Int
  type QueryMaxResults                            = Int
  type QueryString                                = String
  type QueryVersion                               = String
  type QueueUrl                                   = String
  type QueuedThings                               = Int
  type RangeKeyField                              = String
  type RangeKeyValue                              = String
  type ReasonCode                                 = String
  type ReasonForNonCompliance                     = String
  type ReasonForNonComplianceCode                 = String
  type ReasonForNonComplianceCodes                = js.Array[ReasonForNonComplianceCode]
  type Recursive                                  = Boolean
  type RecursiveWithoutDefault                    = Boolean
  type RegistrationCode                           = String
  type RegistryMaxResults                         = Int
  type RegistryS3BucketName                       = String
  type RegistryS3KeyName                          = String
  type RejectedThings                             = Int
  type RelatedResources                           = js.Array[RelatedResource]
  type RemoveAuthorizerConfig                     = Boolean
  type RemoveAutoRegistration                     = Boolean
  type RemoveThingType                            = Boolean
  type RemovedThings                              = Int
  type ReservedDomainConfigurationName            = String
  type Resource                                   = String
  type ResourceArn                                = String
  type ResourceArns                               = js.Dictionary[ResourceArn]
  type ResourceLogicalId                          = String
  type Resources                                  = js.Array[Resource]
  type RoleAlias                                  = String
  type RoleAliasArn                               = String
  type RoleAliases                                = js.Array[RoleAlias]
  type RoleArn                                    = String
  type RolloutRatePerMinute                       = Int
  type RuleArn                                    = String
  type RuleName                                   = String
  type S3Bucket                                   = String
  type S3FileUrl                                  = String
  type S3FileUrlList                              = js.Array[S3FileUrl]
  type S3Key                                      = String
  type S3Version                                  = String
  type SQL                                        = String
  type SalesforceEndpoint                         = String
  type SalesforceToken                            = String
  type ScheduledAuditArn                          = String
  type ScheduledAuditMetadataList                 = js.Array[ScheduledAuditMetadata]
  type ScheduledAuditName                         = String
  type SearchableAttributes                       = js.Array[AttributeName]
  type Seconds                                    = Int
  type SecurityProfileArn                         = String
  type SecurityProfileDescription                 = String
  type SecurityProfileIdentifiers                 = js.Array[SecurityProfileIdentifier]
  type SecurityProfileName                        = String
  type SecurityProfileTargetArn                   = String
  type SecurityProfileTargetMappings              = js.Array[SecurityProfileTargetMapping]
  type SecurityProfileTargets                     = js.Array[SecurityProfileTarget]
  type ServerCertificateArns                      = js.Array[AcmCertificateArn]
  type ServerCertificateStatusDetail              = String
  type ServerCertificates                         = js.Array[ServerCertificateSummary]
  type ServerName                                 = String
  type ServiceName                                = String
  type SetAsActive                                = Boolean
  type SetAsActiveFlag                            = Boolean
  type SetAsDefault                               = Boolean
  type Signature                                  = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SignatureAlgorithm                         = String
  type SigningJobId                               = String
  type SigningProfileName                         = String
  type SigningRegion                              = String
  type SkippedFindingsCount                       = Double
  type SkyfallMaxResults                          = Int
  type SnsTopicArn                                = String
  type StateMachineName                           = String
  type StateReason                                = String
  type StateValue                                 = String
  type StdDeviation                               = Double
  type StreamArn                                  = String
  type StreamDescription                          = String
  type StreamFiles                                = js.Array[StreamFile]
  type StreamId                                   = String
  type StreamName                                 = String
  type StreamVersion                              = Int
  type StreamsSummary                             = js.Array[StreamSummary]
  type StringMap                                  = js.Dictionary[String]
  type SucceededFindingsCount                     = Double
  type SucceededThings                            = Int
  type Sum                                        = Double
  type SumOfSquares                               = Double
  type TableName                                  = String
  type TagKey                                     = String
  type TagKeyList                                 = js.Array[TagKey]
  type TagList                                    = js.Array[Tag]
  type TagValue                                   = String
  type Target                                     = String
  type TargetArn                                  = String
  type TargetAuditCheckNames                      = js.Array[AuditCheckName]
  type Targets                                    = js.Array[Target]
  type TaskId                                     = String
  type TaskIdList                                 = js.Array[TaskId]
  type TemplateArn                                = String
  type TemplateBody                               = String
  type TemplateDescription                        = String
  type TemplateName                               = String
  type TemplateVersionId                          = Int
  type ThingArn                                   = String
  type ThingAttributeList                         = js.Array[ThingAttribute]
  type ThingDocumentList                          = js.Array[ThingDocument]
  type ThingGroupArn                              = String
  type ThingGroupDescription                      = String
  type ThingGroupDocumentList                     = js.Array[ThingGroupDocument]
  type ThingGroupId                               = String
  type ThingGroupList                             = js.Array[ThingGroupName]
  type ThingGroupName                             = String
  type ThingGroupNameAndArnList                   = js.Array[GroupNameAndArn]
  type ThingGroupNameList                         = js.Array[ThingGroupName]
  type ThingGroupNames                            = js.Array[ThingGroupName]
  type ThingId                                    = String
  type ThingName                                  = String
  type ThingNameList                              = js.Array[ThingName]
  type ThingTypeArn                               = String
  type ThingTypeDescription                       = String
  type ThingTypeId                                = String
  type ThingTypeList                              = js.Array[ThingTypeDefinition]
  type ThingTypeName                              = String
  type TimedOutThings                             = Int
  type Timestamp                                  = js.Date
  type Token                                      = String
  type TokenKeyName                               = String
  type TokenSignature                             = String
  type Topic                                      = String
  type TopicPattern                               = String
  type TopicRuleDestinationMaxResults             = Int
  type TopicRuleDestinationSummaries              = js.Array[TopicRuleDestinationSummary]
  type TopicRuleList                              = js.Array[TopicRuleListItem]
  type TopicRuleMaxResults                        = Int
  type TotalChecksCount                           = Int
  type TotalFindingsCount                         = Double
  type TotalResourcesCount                        = Double
  type UndoDeprecate                              = Boolean
  type UnsignedLong                               = Double
  type Url                                        = String
  type UseBase64                                  = Boolean
  type Valid                                      = Boolean
  type ValidationErrors                           = js.Array[ValidationError]
  type Value                                      = String
  type Variance                                   = Double
  type Version                                    = Double
  type VersionNumber                              = Double
  type ViolationEvents                            = js.Array[ViolationEvent]
  type ViolationId                                = String
  type WaitingForDataCollectionChecksCount        = Int

  implicit final class IotOps(private val service: Iot) extends AnyVal {

    @inline def acceptCertificateTransferFuture(params: AcceptCertificateTransferRequest): Future[js.Object] =
      service.acceptCertificateTransfer(params).promise().toFuture
    @inline def addThingToBillingGroupFuture(
        params: AddThingToBillingGroupRequest
    ): Future[AddThingToBillingGroupResponse] = service.addThingToBillingGroup(params).promise().toFuture
    @inline def addThingToThingGroupFuture(params: AddThingToThingGroupRequest): Future[AddThingToThingGroupResponse] =
      service.addThingToThingGroup(params).promise().toFuture
    @inline def associateTargetsWithJobFuture(
        params: AssociateTargetsWithJobRequest
    ): Future[AssociateTargetsWithJobResponse] = service.associateTargetsWithJob(params).promise().toFuture
    @inline def attachPolicyFuture(params: AttachPolicyRequest): Future[js.Object] =
      service.attachPolicy(params).promise().toFuture
    @inline def attachSecurityProfileFuture(
        params: AttachSecurityProfileRequest
    ): Future[AttachSecurityProfileResponse] = service.attachSecurityProfile(params).promise().toFuture
    @inline def attachThingPrincipalFuture(params: AttachThingPrincipalRequest): Future[AttachThingPrincipalResponse] =
      service.attachThingPrincipal(params).promise().toFuture
    @inline def cancelAuditMitigationActionsTaskFuture(
        params: CancelAuditMitigationActionsTaskRequest
    ): Future[CancelAuditMitigationActionsTaskResponse] =
      service.cancelAuditMitigationActionsTask(params).promise().toFuture
    @inline def cancelAuditTaskFuture(params: CancelAuditTaskRequest): Future[CancelAuditTaskResponse] =
      service.cancelAuditTask(params).promise().toFuture
    @inline def cancelCertificateTransferFuture(params: CancelCertificateTransferRequest): Future[js.Object] =
      service.cancelCertificateTransfer(params).promise().toFuture
    @inline def cancelJobExecutionFuture(params: CancelJobExecutionRequest): Future[js.Object] =
      service.cancelJobExecution(params).promise().toFuture
    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] =
      service.cancelJob(params).promise().toFuture
    @inline def clearDefaultAuthorizerFuture(
        params: ClearDefaultAuthorizerRequest
    ): Future[ClearDefaultAuthorizerResponse] = service.clearDefaultAuthorizer(params).promise().toFuture
    @inline def confirmTopicRuleDestinationFuture(
        params: ConfirmTopicRuleDestinationRequest
    ): Future[ConfirmTopicRuleDestinationResponse] = service.confirmTopicRuleDestination(params).promise().toFuture
    @inline def createAuthorizerFuture(params: CreateAuthorizerRequest): Future[CreateAuthorizerResponse] =
      service.createAuthorizer(params).promise().toFuture
    @inline def createBillingGroupFuture(params: CreateBillingGroupRequest): Future[CreateBillingGroupResponse] =
      service.createBillingGroup(params).promise().toFuture
    @inline def createCertificateFromCsrFuture(
        params: CreateCertificateFromCsrRequest
    ): Future[CreateCertificateFromCsrResponse] = service.createCertificateFromCsr(params).promise().toFuture
    @inline def createDomainConfigurationFuture(
        params: CreateDomainConfigurationRequest
    ): Future[CreateDomainConfigurationResponse] = service.createDomainConfiguration(params).promise().toFuture
    @inline def createDynamicThingGroupFuture(
        params: CreateDynamicThingGroupRequest
    ): Future[CreateDynamicThingGroupResponse] = service.createDynamicThingGroup(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] =
      service.createJob(params).promise().toFuture
    @inline def createKeysAndCertificateFuture(
        params: CreateKeysAndCertificateRequest
    ): Future[CreateKeysAndCertificateResponse] = service.createKeysAndCertificate(params).promise().toFuture
    @inline def createMitigationActionFuture(
        params: CreateMitigationActionRequest
    ): Future[CreateMitigationActionResponse] = service.createMitigationAction(params).promise().toFuture
    @inline def createOTAUpdateFuture(params: CreateOTAUpdateRequest): Future[CreateOTAUpdateResponse] =
      service.createOTAUpdate(params).promise().toFuture
    @inline def createPolicyFuture(params: CreatePolicyRequest): Future[CreatePolicyResponse] =
      service.createPolicy(params).promise().toFuture
    @inline def createPolicyVersionFuture(params: CreatePolicyVersionRequest): Future[CreatePolicyVersionResponse] =
      service.createPolicyVersion(params).promise().toFuture
    @inline def createProvisioningClaimFuture(
        params: CreateProvisioningClaimRequest
    ): Future[CreateProvisioningClaimResponse] = service.createProvisioningClaim(params).promise().toFuture
    @inline def createProvisioningTemplateFuture(
        params: CreateProvisioningTemplateRequest
    ): Future[CreateProvisioningTemplateResponse] = service.createProvisioningTemplate(params).promise().toFuture
    @inline def createProvisioningTemplateVersionFuture(
        params: CreateProvisioningTemplateVersionRequest
    ): Future[CreateProvisioningTemplateVersionResponse] =
      service.createProvisioningTemplateVersion(params).promise().toFuture
    @inline def createRoleAliasFuture(params: CreateRoleAliasRequest): Future[CreateRoleAliasResponse] =
      service.createRoleAlias(params).promise().toFuture
    @inline def createScheduledAuditFuture(params: CreateScheduledAuditRequest): Future[CreateScheduledAuditResponse] =
      service.createScheduledAudit(params).promise().toFuture
    @inline def createSecurityProfileFuture(
        params: CreateSecurityProfileRequest
    ): Future[CreateSecurityProfileResponse] = service.createSecurityProfile(params).promise().toFuture
    @inline def createStreamFuture(params: CreateStreamRequest): Future[CreateStreamResponse] =
      service.createStream(params).promise().toFuture
    @inline def createThingFuture(params: CreateThingRequest): Future[CreateThingResponse] =
      service.createThing(params).promise().toFuture
    @inline def createThingGroupFuture(params: CreateThingGroupRequest): Future[CreateThingGroupResponse] =
      service.createThingGroup(params).promise().toFuture
    @inline def createThingTypeFuture(params: CreateThingTypeRequest): Future[CreateThingTypeResponse] =
      service.createThingType(params).promise().toFuture
    @inline def createTopicRuleDestinationFuture(
        params: CreateTopicRuleDestinationRequest
    ): Future[CreateTopicRuleDestinationResponse] = service.createTopicRuleDestination(params).promise().toFuture
    @inline def createTopicRuleFuture(params: CreateTopicRuleRequest): Future[js.Object] =
      service.createTopicRule(params).promise().toFuture
    @inline def deleteAccountAuditConfigurationFuture(
        params: DeleteAccountAuditConfigurationRequest
    ): Future[DeleteAccountAuditConfigurationResponse] =
      service.deleteAccountAuditConfiguration(params).promise().toFuture
    @inline def deleteAuthorizerFuture(params: DeleteAuthorizerRequest): Future[DeleteAuthorizerResponse] =
      service.deleteAuthorizer(params).promise().toFuture
    @inline def deleteBillingGroupFuture(params: DeleteBillingGroupRequest): Future[DeleteBillingGroupResponse] =
      service.deleteBillingGroup(params).promise().toFuture
    @inline def deleteCACertificateFuture(params: DeleteCACertificateRequest): Future[DeleteCACertificateResponse] =
      service.deleteCACertificate(params).promise().toFuture
    @inline def deleteCertificateFuture(params: DeleteCertificateRequest): Future[js.Object] =
      service.deleteCertificate(params).promise().toFuture
    @inline def deleteDomainConfigurationFuture(
        params: DeleteDomainConfigurationRequest
    ): Future[DeleteDomainConfigurationResponse] = service.deleteDomainConfiguration(params).promise().toFuture
    @inline def deleteDynamicThingGroupFuture(
        params: DeleteDynamicThingGroupRequest
    ): Future[DeleteDynamicThingGroupResponse] = service.deleteDynamicThingGroup(params).promise().toFuture
    @inline def deleteJobExecutionFuture(params: DeleteJobExecutionRequest): Future[js.Object] =
      service.deleteJobExecution(params).promise().toFuture
    @inline def deleteJobFuture(params: DeleteJobRequest): Future[js.Object] =
      service.deleteJob(params).promise().toFuture
    @inline def deleteMitigationActionFuture(
        params: DeleteMitigationActionRequest
    ): Future[DeleteMitigationActionResponse] = service.deleteMitigationAction(params).promise().toFuture
    @inline def deleteOTAUpdateFuture(params: DeleteOTAUpdateRequest): Future[DeleteOTAUpdateResponse] =
      service.deleteOTAUpdate(params).promise().toFuture
    @inline def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] =
      service.deletePolicy(params).promise().toFuture
    @inline def deletePolicyVersionFuture(params: DeletePolicyVersionRequest): Future[js.Object] =
      service.deletePolicyVersion(params).promise().toFuture
    @inline def deleteProvisioningTemplateFuture(
        params: DeleteProvisioningTemplateRequest
    ): Future[DeleteProvisioningTemplateResponse] = service.deleteProvisioningTemplate(params).promise().toFuture
    @inline def deleteProvisioningTemplateVersionFuture(
        params: DeleteProvisioningTemplateVersionRequest
    ): Future[DeleteProvisioningTemplateVersionResponse] =
      service.deleteProvisioningTemplateVersion(params).promise().toFuture
    @inline def deleteRegistrationCodeFuture(
        params: DeleteRegistrationCodeRequest
    ): Future[DeleteRegistrationCodeResponse] = service.deleteRegistrationCode(params).promise().toFuture
    @inline def deleteRoleAliasFuture(params: DeleteRoleAliasRequest): Future[DeleteRoleAliasResponse] =
      service.deleteRoleAlias(params).promise().toFuture
    @inline def deleteScheduledAuditFuture(params: DeleteScheduledAuditRequest): Future[DeleteScheduledAuditResponse] =
      service.deleteScheduledAudit(params).promise().toFuture
    @inline def deleteSecurityProfileFuture(
        params: DeleteSecurityProfileRequest
    ): Future[DeleteSecurityProfileResponse] = service.deleteSecurityProfile(params).promise().toFuture
    @inline def deleteStreamFuture(params: DeleteStreamRequest): Future[DeleteStreamResponse] =
      service.deleteStream(params).promise().toFuture
    @inline def deleteThingFuture(params: DeleteThingRequest): Future[DeleteThingResponse] =
      service.deleteThing(params).promise().toFuture
    @inline def deleteThingGroupFuture(params: DeleteThingGroupRequest): Future[DeleteThingGroupResponse] =
      service.deleteThingGroup(params).promise().toFuture
    @inline def deleteThingTypeFuture(params: DeleteThingTypeRequest): Future[DeleteThingTypeResponse] =
      service.deleteThingType(params).promise().toFuture
    @inline def deleteTopicRuleDestinationFuture(
        params: DeleteTopicRuleDestinationRequest
    ): Future[DeleteTopicRuleDestinationResponse] = service.deleteTopicRuleDestination(params).promise().toFuture
    @inline def deleteTopicRuleFuture(params: DeleteTopicRuleRequest): Future[js.Object] =
      service.deleteTopicRule(params).promise().toFuture
    @inline def deleteV2LoggingLevelFuture(params: DeleteV2LoggingLevelRequest): Future[js.Object] =
      service.deleteV2LoggingLevel(params).promise().toFuture
    @inline def deprecateThingTypeFuture(params: DeprecateThingTypeRequest): Future[DeprecateThingTypeResponse] =
      service.deprecateThingType(params).promise().toFuture
    @inline def describeAccountAuditConfigurationFuture(
        params: DescribeAccountAuditConfigurationRequest
    ): Future[DescribeAccountAuditConfigurationResponse] =
      service.describeAccountAuditConfiguration(params).promise().toFuture
    @inline def describeAuditFindingFuture(params: DescribeAuditFindingRequest): Future[DescribeAuditFindingResponse] =
      service.describeAuditFinding(params).promise().toFuture
    @inline def describeAuditMitigationActionsTaskFuture(
        params: DescribeAuditMitigationActionsTaskRequest
    ): Future[DescribeAuditMitigationActionsTaskResponse] =
      service.describeAuditMitigationActionsTask(params).promise().toFuture
    @inline def describeAuditTaskFuture(params: DescribeAuditTaskRequest): Future[DescribeAuditTaskResponse] =
      service.describeAuditTask(params).promise().toFuture
    @inline def describeAuthorizerFuture(params: DescribeAuthorizerRequest): Future[DescribeAuthorizerResponse] =
      service.describeAuthorizer(params).promise().toFuture
    @inline def describeBillingGroupFuture(params: DescribeBillingGroupRequest): Future[DescribeBillingGroupResponse] =
      service.describeBillingGroup(params).promise().toFuture
    @inline def describeCACertificateFuture(
        params: DescribeCACertificateRequest
    ): Future[DescribeCACertificateResponse] = service.describeCACertificate(params).promise().toFuture
    @inline def describeCertificateFuture(params: DescribeCertificateRequest): Future[DescribeCertificateResponse] =
      service.describeCertificate(params).promise().toFuture
    @inline def describeDefaultAuthorizerFuture(
        params: DescribeDefaultAuthorizerRequest
    ): Future[DescribeDefaultAuthorizerResponse] = service.describeDefaultAuthorizer(params).promise().toFuture
    @inline def describeDomainConfigurationFuture(
        params: DescribeDomainConfigurationRequest
    ): Future[DescribeDomainConfigurationResponse] = service.describeDomainConfiguration(params).promise().toFuture
    @inline def describeEndpointFuture(params: DescribeEndpointRequest): Future[DescribeEndpointResponse] =
      service.describeEndpoint(params).promise().toFuture
    @inline def describeEventConfigurationsFuture(
        params: DescribeEventConfigurationsRequest
    ): Future[DescribeEventConfigurationsResponse] = service.describeEventConfigurations(params).promise().toFuture
    @inline def describeIndexFuture(params: DescribeIndexRequest): Future[DescribeIndexResponse] =
      service.describeIndex(params).promise().toFuture
    @inline def describeJobExecutionFuture(params: DescribeJobExecutionRequest): Future[DescribeJobExecutionResponse] =
      service.describeJobExecution(params).promise().toFuture
    @inline def describeJobFuture(params: DescribeJobRequest): Future[DescribeJobResponse] =
      service.describeJob(params).promise().toFuture
    @inline def describeMitigationActionFuture(
        params: DescribeMitigationActionRequest
    ): Future[DescribeMitigationActionResponse] = service.describeMitigationAction(params).promise().toFuture
    @inline def describeProvisioningTemplateFuture(
        params: DescribeProvisioningTemplateRequest
    ): Future[DescribeProvisioningTemplateResponse] = service.describeProvisioningTemplate(params).promise().toFuture
    @inline def describeProvisioningTemplateVersionFuture(
        params: DescribeProvisioningTemplateVersionRequest
    ): Future[DescribeProvisioningTemplateVersionResponse] =
      service.describeProvisioningTemplateVersion(params).promise().toFuture
    @inline def describeRoleAliasFuture(params: DescribeRoleAliasRequest): Future[DescribeRoleAliasResponse] =
      service.describeRoleAlias(params).promise().toFuture
    @inline def describeScheduledAuditFuture(
        params: DescribeScheduledAuditRequest
    ): Future[DescribeScheduledAuditResponse] = service.describeScheduledAudit(params).promise().toFuture
    @inline def describeSecurityProfileFuture(
        params: DescribeSecurityProfileRequest
    ): Future[DescribeSecurityProfileResponse] = service.describeSecurityProfile(params).promise().toFuture
    @inline def describeStreamFuture(params: DescribeStreamRequest): Future[DescribeStreamResponse] =
      service.describeStream(params).promise().toFuture
    @inline def describeThingFuture(params: DescribeThingRequest): Future[DescribeThingResponse] =
      service.describeThing(params).promise().toFuture
    @inline def describeThingGroupFuture(params: DescribeThingGroupRequest): Future[DescribeThingGroupResponse] =
      service.describeThingGroup(params).promise().toFuture
    @inline def describeThingRegistrationTaskFuture(
        params: DescribeThingRegistrationTaskRequest
    ): Future[DescribeThingRegistrationTaskResponse] = service.describeThingRegistrationTask(params).promise().toFuture
    @inline def describeThingTypeFuture(params: DescribeThingTypeRequest): Future[DescribeThingTypeResponse] =
      service.describeThingType(params).promise().toFuture
    @inline def detachPolicyFuture(params: DetachPolicyRequest): Future[js.Object] =
      service.detachPolicy(params).promise().toFuture
    @inline def detachSecurityProfileFuture(
        params: DetachSecurityProfileRequest
    ): Future[DetachSecurityProfileResponse] = service.detachSecurityProfile(params).promise().toFuture
    @inline def detachThingPrincipalFuture(params: DetachThingPrincipalRequest): Future[DetachThingPrincipalResponse] =
      service.detachThingPrincipal(params).promise().toFuture
    @inline def disableTopicRuleFuture(params: DisableTopicRuleRequest): Future[js.Object] =
      service.disableTopicRule(params).promise().toFuture
    @inline def enableTopicRuleFuture(params: EnableTopicRuleRequest): Future[js.Object] =
      service.enableTopicRule(params).promise().toFuture
    @inline def getCardinalityFuture(params: GetCardinalityRequest): Future[GetCardinalityResponse] =
      service.getCardinality(params).promise().toFuture
    @inline def getEffectivePoliciesFuture(params: GetEffectivePoliciesRequest): Future[GetEffectivePoliciesResponse] =
      service.getEffectivePolicies(params).promise().toFuture
    @inline def getIndexingConfigurationFuture(
        params: GetIndexingConfigurationRequest
    ): Future[GetIndexingConfigurationResponse] = service.getIndexingConfiguration(params).promise().toFuture
    @inline def getJobDocumentFuture(params: GetJobDocumentRequest): Future[GetJobDocumentResponse] =
      service.getJobDocument(params).promise().toFuture
    @inline def getLoggingOptionsFuture(params: GetLoggingOptionsRequest): Future[GetLoggingOptionsResponse] =
      service.getLoggingOptions(params).promise().toFuture
    @inline def getOTAUpdateFuture(params: GetOTAUpdateRequest): Future[GetOTAUpdateResponse] =
      service.getOTAUpdate(params).promise().toFuture
    @inline def getPercentilesFuture(params: GetPercentilesRequest): Future[GetPercentilesResponse] =
      service.getPercentiles(params).promise().toFuture
    @inline def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] =
      service.getPolicy(params).promise().toFuture
    @inline def getPolicyVersionFuture(params: GetPolicyVersionRequest): Future[GetPolicyVersionResponse] =
      service.getPolicyVersion(params).promise().toFuture
    @inline def getRegistrationCodeFuture(params: GetRegistrationCodeRequest): Future[GetRegistrationCodeResponse] =
      service.getRegistrationCode(params).promise().toFuture
    @inline def getStatisticsFuture(params: GetStatisticsRequest): Future[GetStatisticsResponse] =
      service.getStatistics(params).promise().toFuture
    @inline def getTopicRuleDestinationFuture(
        params: GetTopicRuleDestinationRequest
    ): Future[GetTopicRuleDestinationResponse] = service.getTopicRuleDestination(params).promise().toFuture
    @inline def getTopicRuleFuture(params: GetTopicRuleRequest): Future[GetTopicRuleResponse] =
      service.getTopicRule(params).promise().toFuture
    @inline def getV2LoggingOptionsFuture(params: GetV2LoggingOptionsRequest): Future[GetV2LoggingOptionsResponse] =
      service.getV2LoggingOptions(params).promise().toFuture
    @inline def listActiveViolationsFuture(params: ListActiveViolationsRequest): Future[ListActiveViolationsResponse] =
      service.listActiveViolations(params).promise().toFuture
    @inline def listAttachedPoliciesFuture(params: ListAttachedPoliciesRequest): Future[ListAttachedPoliciesResponse] =
      service.listAttachedPolicies(params).promise().toFuture
    @inline def listAuditFindingsFuture(params: ListAuditFindingsRequest): Future[ListAuditFindingsResponse] =
      service.listAuditFindings(params).promise().toFuture
    @inline def listAuditMitigationActionsExecutionsFuture(
        params: ListAuditMitigationActionsExecutionsRequest
    ): Future[ListAuditMitigationActionsExecutionsResponse] =
      service.listAuditMitigationActionsExecutions(params).promise().toFuture
    @inline def listAuditMitigationActionsTasksFuture(
        params: ListAuditMitigationActionsTasksRequest
    ): Future[ListAuditMitigationActionsTasksResponse] =
      service.listAuditMitigationActionsTasks(params).promise().toFuture
    @inline def listAuditTasksFuture(params: ListAuditTasksRequest): Future[ListAuditTasksResponse] =
      service.listAuditTasks(params).promise().toFuture
    @inline def listAuthorizersFuture(params: ListAuthorizersRequest): Future[ListAuthorizersResponse] =
      service.listAuthorizers(params).promise().toFuture
    @inline def listBillingGroupsFuture(params: ListBillingGroupsRequest): Future[ListBillingGroupsResponse] =
      service.listBillingGroups(params).promise().toFuture
    @inline def listCACertificatesFuture(params: ListCACertificatesRequest): Future[ListCACertificatesResponse] =
      service.listCACertificates(params).promise().toFuture
    @inline def listCertificatesByCAFuture(params: ListCertificatesByCARequest): Future[ListCertificatesByCAResponse] =
      service.listCertificatesByCA(params).promise().toFuture
    @inline def listCertificatesFuture(params: ListCertificatesRequest): Future[ListCertificatesResponse] =
      service.listCertificates(params).promise().toFuture
    @inline def listDomainConfigurationsFuture(
        params: ListDomainConfigurationsRequest
    ): Future[ListDomainConfigurationsResponse] = service.listDomainConfigurations(params).promise().toFuture
    @inline def listIndicesFuture(params: ListIndicesRequest): Future[ListIndicesResponse] =
      service.listIndices(params).promise().toFuture
    @inline def listJobExecutionsForJobFuture(
        params: ListJobExecutionsForJobRequest
    ): Future[ListJobExecutionsForJobResponse] = service.listJobExecutionsForJob(params).promise().toFuture
    @inline def listJobExecutionsForThingFuture(
        params: ListJobExecutionsForThingRequest
    ): Future[ListJobExecutionsForThingResponse] = service.listJobExecutionsForThing(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] =
      service.listJobs(params).promise().toFuture
    @inline def listMitigationActionsFuture(
        params: ListMitigationActionsRequest
    ): Future[ListMitigationActionsResponse] = service.listMitigationActions(params).promise().toFuture
    @inline def listOTAUpdatesFuture(params: ListOTAUpdatesRequest): Future[ListOTAUpdatesResponse] =
      service.listOTAUpdates(params).promise().toFuture
    @inline def listOutgoingCertificatesFuture(
        params: ListOutgoingCertificatesRequest
    ): Future[ListOutgoingCertificatesResponse] = service.listOutgoingCertificates(params).promise().toFuture
    @inline def listPoliciesFuture(params: ListPoliciesRequest): Future[ListPoliciesResponse] =
      service.listPolicies(params).promise().toFuture
    @inline def listPolicyVersionsFuture(params: ListPolicyVersionsRequest): Future[ListPolicyVersionsResponse] =
      service.listPolicyVersions(params).promise().toFuture
    @inline def listPrincipalThingsFuture(params: ListPrincipalThingsRequest): Future[ListPrincipalThingsResponse] =
      service.listPrincipalThings(params).promise().toFuture
    @inline def listProvisioningTemplateVersionsFuture(
        params: ListProvisioningTemplateVersionsRequest
    ): Future[ListProvisioningTemplateVersionsResponse] =
      service.listProvisioningTemplateVersions(params).promise().toFuture
    @inline def listProvisioningTemplatesFuture(
        params: ListProvisioningTemplatesRequest
    ): Future[ListProvisioningTemplatesResponse] = service.listProvisioningTemplates(params).promise().toFuture
    @inline def listRoleAliasesFuture(params: ListRoleAliasesRequest): Future[ListRoleAliasesResponse] =
      service.listRoleAliases(params).promise().toFuture
    @inline def listScheduledAuditsFuture(params: ListScheduledAuditsRequest): Future[ListScheduledAuditsResponse] =
      service.listScheduledAudits(params).promise().toFuture
    @inline def listSecurityProfilesForTargetFuture(
        params: ListSecurityProfilesForTargetRequest
    ): Future[ListSecurityProfilesForTargetResponse] = service.listSecurityProfilesForTarget(params).promise().toFuture
    @inline def listSecurityProfilesFuture(params: ListSecurityProfilesRequest): Future[ListSecurityProfilesResponse] =
      service.listSecurityProfiles(params).promise().toFuture
    @inline def listStreamsFuture(params: ListStreamsRequest): Future[ListStreamsResponse] =
      service.listStreams(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTargetsForPolicyFuture(params: ListTargetsForPolicyRequest): Future[ListTargetsForPolicyResponse] =
      service.listTargetsForPolicy(params).promise().toFuture
    @inline def listTargetsForSecurityProfileFuture(
        params: ListTargetsForSecurityProfileRequest
    ): Future[ListTargetsForSecurityProfileResponse] = service.listTargetsForSecurityProfile(params).promise().toFuture
    @inline def listThingGroupsForThingFuture(
        params: ListThingGroupsForThingRequest
    ): Future[ListThingGroupsForThingResponse] = service.listThingGroupsForThing(params).promise().toFuture
    @inline def listThingGroupsFuture(params: ListThingGroupsRequest): Future[ListThingGroupsResponse] =
      service.listThingGroups(params).promise().toFuture
    @inline def listThingPrincipalsFuture(params: ListThingPrincipalsRequest): Future[ListThingPrincipalsResponse] =
      service.listThingPrincipals(params).promise().toFuture
    @inline def listThingRegistrationTaskReportsFuture(
        params: ListThingRegistrationTaskReportsRequest
    ): Future[ListThingRegistrationTaskReportsResponse] =
      service.listThingRegistrationTaskReports(params).promise().toFuture
    @inline def listThingRegistrationTasksFuture(
        params: ListThingRegistrationTasksRequest
    ): Future[ListThingRegistrationTasksResponse] = service.listThingRegistrationTasks(params).promise().toFuture
    @inline def listThingTypesFuture(params: ListThingTypesRequest): Future[ListThingTypesResponse] =
      service.listThingTypes(params).promise().toFuture
    @inline def listThingsFuture(params: ListThingsRequest): Future[ListThingsResponse] =
      service.listThings(params).promise().toFuture
    @inline def listThingsInBillingGroupFuture(
        params: ListThingsInBillingGroupRequest
    ): Future[ListThingsInBillingGroupResponse] = service.listThingsInBillingGroup(params).promise().toFuture
    @inline def listThingsInThingGroupFuture(
        params: ListThingsInThingGroupRequest
    ): Future[ListThingsInThingGroupResponse] = service.listThingsInThingGroup(params).promise().toFuture
    @inline def listTopicRuleDestinationsFuture(
        params: ListTopicRuleDestinationsRequest
    ): Future[ListTopicRuleDestinationsResponse] = service.listTopicRuleDestinations(params).promise().toFuture
    @inline def listTopicRulesFuture(params: ListTopicRulesRequest): Future[ListTopicRulesResponse] =
      service.listTopicRules(params).promise().toFuture
    @inline def listV2LoggingLevelsFuture(params: ListV2LoggingLevelsRequest): Future[ListV2LoggingLevelsResponse] =
      service.listV2LoggingLevels(params).promise().toFuture
    @inline def listViolationEventsFuture(params: ListViolationEventsRequest): Future[ListViolationEventsResponse] =
      service.listViolationEvents(params).promise().toFuture
    @inline def registerCACertificateFuture(
        params: RegisterCACertificateRequest
    ): Future[RegisterCACertificateResponse] = service.registerCACertificate(params).promise().toFuture
    @inline def registerCertificateFuture(params: RegisterCertificateRequest): Future[RegisterCertificateResponse] =
      service.registerCertificate(params).promise().toFuture
    @inline def registerThingFuture(params: RegisterThingRequest): Future[RegisterThingResponse] =
      service.registerThing(params).promise().toFuture
    @inline def rejectCertificateTransferFuture(params: RejectCertificateTransferRequest): Future[js.Object] =
      service.rejectCertificateTransfer(params).promise().toFuture
    @inline def removeThingFromBillingGroupFuture(
        params: RemoveThingFromBillingGroupRequest
    ): Future[RemoveThingFromBillingGroupResponse] = service.removeThingFromBillingGroup(params).promise().toFuture
    @inline def removeThingFromThingGroupFuture(
        params: RemoveThingFromThingGroupRequest
    ): Future[RemoveThingFromThingGroupResponse] = service.removeThingFromThingGroup(params).promise().toFuture
    @inline def replaceTopicRuleFuture(params: ReplaceTopicRuleRequest): Future[js.Object] =
      service.replaceTopicRule(params).promise().toFuture
    @inline def searchIndexFuture(params: SearchIndexRequest): Future[SearchIndexResponse] =
      service.searchIndex(params).promise().toFuture
    @inline def setDefaultAuthorizerFuture(params: SetDefaultAuthorizerRequest): Future[SetDefaultAuthorizerResponse] =
      service.setDefaultAuthorizer(params).promise().toFuture
    @inline def setDefaultPolicyVersionFuture(params: SetDefaultPolicyVersionRequest): Future[js.Object] =
      service.setDefaultPolicyVersion(params).promise().toFuture
    @inline def setLoggingOptionsFuture(params: SetLoggingOptionsRequest): Future[js.Object] =
      service.setLoggingOptions(params).promise().toFuture
    @inline def setV2LoggingLevelFuture(params: SetV2LoggingLevelRequest): Future[js.Object] =
      service.setV2LoggingLevel(params).promise().toFuture
    @inline def setV2LoggingOptionsFuture(params: SetV2LoggingOptionsRequest): Future[js.Object] =
      service.setV2LoggingOptions(params).promise().toFuture
    @inline def startAuditMitigationActionsTaskFuture(
        params: StartAuditMitigationActionsTaskRequest
    ): Future[StartAuditMitigationActionsTaskResponse] =
      service.startAuditMitigationActionsTask(params).promise().toFuture
    @inline def startOnDemandAuditTaskFuture(
        params: StartOnDemandAuditTaskRequest
    ): Future[StartOnDemandAuditTaskResponse] = service.startOnDemandAuditTask(params).promise().toFuture
    @inline def startThingRegistrationTaskFuture(
        params: StartThingRegistrationTaskRequest
    ): Future[StartThingRegistrationTaskResponse] = service.startThingRegistrationTask(params).promise().toFuture
    @inline def stopThingRegistrationTaskFuture(
        params: StopThingRegistrationTaskRequest
    ): Future[StopThingRegistrationTaskResponse] = service.stopThingRegistrationTask(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def testAuthorizationFuture(params: TestAuthorizationRequest): Future[TestAuthorizationResponse] =
      service.testAuthorization(params).promise().toFuture
    @inline def testInvokeAuthorizerFuture(params: TestInvokeAuthorizerRequest): Future[TestInvokeAuthorizerResponse] =
      service.testInvokeAuthorizer(params).promise().toFuture
    @inline def transferCertificateFuture(params: TransferCertificateRequest): Future[TransferCertificateResponse] =
      service.transferCertificate(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateAccountAuditConfigurationFuture(
        params: UpdateAccountAuditConfigurationRequest
    ): Future[UpdateAccountAuditConfigurationResponse] =
      service.updateAccountAuditConfiguration(params).promise().toFuture
    @inline def updateAuthorizerFuture(params: UpdateAuthorizerRequest): Future[UpdateAuthorizerResponse] =
      service.updateAuthorizer(params).promise().toFuture
    @inline def updateBillingGroupFuture(params: UpdateBillingGroupRequest): Future[UpdateBillingGroupResponse] =
      service.updateBillingGroup(params).promise().toFuture
    @inline def updateCACertificateFuture(params: UpdateCACertificateRequest): Future[js.Object] =
      service.updateCACertificate(params).promise().toFuture
    @inline def updateCertificateFuture(params: UpdateCertificateRequest): Future[js.Object] =
      service.updateCertificate(params).promise().toFuture
    @inline def updateDomainConfigurationFuture(
        params: UpdateDomainConfigurationRequest
    ): Future[UpdateDomainConfigurationResponse] = service.updateDomainConfiguration(params).promise().toFuture
    @inline def updateDynamicThingGroupFuture(
        params: UpdateDynamicThingGroupRequest
    ): Future[UpdateDynamicThingGroupResponse] = service.updateDynamicThingGroup(params).promise().toFuture
    @inline def updateEventConfigurationsFuture(
        params: UpdateEventConfigurationsRequest
    ): Future[UpdateEventConfigurationsResponse] = service.updateEventConfigurations(params).promise().toFuture
    @inline def updateIndexingConfigurationFuture(
        params: UpdateIndexingConfigurationRequest
    ): Future[UpdateIndexingConfigurationResponse] = service.updateIndexingConfiguration(params).promise().toFuture
    @inline def updateJobFuture(params: UpdateJobRequest): Future[js.Object] =
      service.updateJob(params).promise().toFuture
    @inline def updateMitigationActionFuture(
        params: UpdateMitigationActionRequest
    ): Future[UpdateMitigationActionResponse] = service.updateMitigationAction(params).promise().toFuture
    @inline def updateProvisioningTemplateFuture(
        params: UpdateProvisioningTemplateRequest
    ): Future[UpdateProvisioningTemplateResponse] = service.updateProvisioningTemplate(params).promise().toFuture
    @inline def updateRoleAliasFuture(params: UpdateRoleAliasRequest): Future[UpdateRoleAliasResponse] =
      service.updateRoleAlias(params).promise().toFuture
    @inline def updateScheduledAuditFuture(params: UpdateScheduledAuditRequest): Future[UpdateScheduledAuditResponse] =
      service.updateScheduledAudit(params).promise().toFuture
    @inline def updateSecurityProfileFuture(
        params: UpdateSecurityProfileRequest
    ): Future[UpdateSecurityProfileResponse] = service.updateSecurityProfile(params).promise().toFuture
    @inline def updateStreamFuture(params: UpdateStreamRequest): Future[UpdateStreamResponse] =
      service.updateStream(params).promise().toFuture
    @inline def updateThingFuture(params: UpdateThingRequest): Future[UpdateThingResponse] =
      service.updateThing(params).promise().toFuture
    @inline def updateThingGroupFuture(params: UpdateThingGroupRequest): Future[UpdateThingGroupResponse] =
      service.updateThingGroup(params).promise().toFuture
    @inline def updateThingGroupsForThingFuture(
        params: UpdateThingGroupsForThingRequest
    ): Future[UpdateThingGroupsForThingResponse] = service.updateThingGroupsForThing(params).promise().toFuture
    @inline def updateTopicRuleDestinationFuture(
        params: UpdateTopicRuleDestinationRequest
    ): Future[UpdateTopicRuleDestinationResponse] = service.updateTopicRuleDestination(params).promise().toFuture
    @inline def validateSecurityProfileBehaviorsFuture(
        params: ValidateSecurityProfileBehaviorsRequest
    ): Future[ValidateSecurityProfileBehaviorsResponse] =
      service.validateSecurityProfileBehaviors(params).promise().toFuture
  }
}

package iot {
  @js.native
  @JSImport("aws-sdk", "Iot")
  class Iot() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptCertificateTransfer(params: AcceptCertificateTransferRequest): Request[js.Object] = js.native
    def addThingToBillingGroup(params: AddThingToBillingGroupRequest): Request[AddThingToBillingGroupResponse] =
      js.native
    def addThingToThingGroup(params: AddThingToThingGroupRequest): Request[AddThingToThingGroupResponse] = js.native
    def associateTargetsWithJob(params: AssociateTargetsWithJobRequest): Request[AssociateTargetsWithJobResponse] =
      js.native
    def attachPolicy(params: AttachPolicyRequest): Request[js.Object]                                       = js.native
    def attachSecurityProfile(params: AttachSecurityProfileRequest): Request[AttachSecurityProfileResponse] = js.native
    def attachThingPrincipal(params: AttachThingPrincipalRequest): Request[AttachThingPrincipalResponse]    = js.native
    def cancelAuditMitigationActionsTask(
        params: CancelAuditMitigationActionsTaskRequest
    ): Request[CancelAuditMitigationActionsTaskResponse]                                        = js.native
    def cancelAuditTask(params: CancelAuditTaskRequest): Request[CancelAuditTaskResponse]       = js.native
    def cancelCertificateTransfer(params: CancelCertificateTransferRequest): Request[js.Object] = js.native
    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse]                         = js.native
    def cancelJobExecution(params: CancelJobExecutionRequest): Request[js.Object]               = js.native
    def clearDefaultAuthorizer(params: ClearDefaultAuthorizerRequest): Request[ClearDefaultAuthorizerResponse] =
      js.native
    def confirmTopicRuleDestination(
        params: ConfirmTopicRuleDestinationRequest
    ): Request[ConfirmTopicRuleDestinationResponse]                                                = js.native
    def createAuthorizer(params: CreateAuthorizerRequest): Request[CreateAuthorizerResponse]       = js.native
    def createBillingGroup(params: CreateBillingGroupRequest): Request[CreateBillingGroupResponse] = js.native
    def createCertificateFromCsr(params: CreateCertificateFromCsrRequest): Request[CreateCertificateFromCsrResponse] =
      js.native
    def createDomainConfiguration(
        params: CreateDomainConfigurationRequest
    ): Request[CreateDomainConfigurationResponse] = js.native
    def createDynamicThingGroup(params: CreateDynamicThingGroupRequest): Request[CreateDynamicThingGroupResponse] =
      js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse] = js.native
    def createKeysAndCertificate(params: CreateKeysAndCertificateRequest): Request[CreateKeysAndCertificateResponse] =
      js.native
    def createMitigationAction(params: CreateMitigationActionRequest): Request[CreateMitigationActionResponse] =
      js.native
    def createOTAUpdate(params: CreateOTAUpdateRequest): Request[CreateOTAUpdateResponse]             = js.native
    def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse]                      = js.native
    def createPolicyVersion(params: CreatePolicyVersionRequest): Request[CreatePolicyVersionResponse] = js.native
    def createProvisioningClaim(params: CreateProvisioningClaimRequest): Request[CreateProvisioningClaimResponse] =
      js.native
    def createProvisioningTemplate(
        params: CreateProvisioningTemplateRequest
    ): Request[CreateProvisioningTemplateResponse] = js.native
    def createProvisioningTemplateVersion(
        params: CreateProvisioningTemplateVersionRequest
    ): Request[CreateProvisioningTemplateVersionResponse]                                                   = js.native
    def createRoleAlias(params: CreateRoleAliasRequest): Request[CreateRoleAliasResponse]                   = js.native
    def createScheduledAudit(params: CreateScheduledAuditRequest): Request[CreateScheduledAuditResponse]    = js.native
    def createSecurityProfile(params: CreateSecurityProfileRequest): Request[CreateSecurityProfileResponse] = js.native
    def createStream(params: CreateStreamRequest): Request[CreateStreamResponse]                            = js.native
    def createThing(params: CreateThingRequest): Request[CreateThingResponse]                               = js.native
    def createThingGroup(params: CreateThingGroupRequest): Request[CreateThingGroupResponse]                = js.native
    def createThingType(params: CreateThingTypeRequest): Request[CreateThingTypeResponse]                   = js.native
    def createTopicRule(params: CreateTopicRuleRequest): Request[js.Object]                                 = js.native
    def createTopicRuleDestination(
        params: CreateTopicRuleDestinationRequest
    ): Request[CreateTopicRuleDestinationResponse] = js.native
    def deleteAccountAuditConfiguration(
        params: DeleteAccountAuditConfigurationRequest
    ): Request[DeleteAccountAuditConfigurationResponse]                                               = js.native
    def deleteAuthorizer(params: DeleteAuthorizerRequest): Request[DeleteAuthorizerResponse]          = js.native
    def deleteBillingGroup(params: DeleteBillingGroupRequest): Request[DeleteBillingGroupResponse]    = js.native
    def deleteCACertificate(params: DeleteCACertificateRequest): Request[DeleteCACertificateResponse] = js.native
    def deleteCertificate(params: DeleteCertificateRequest): Request[js.Object]                       = js.native
    def deleteDomainConfiguration(
        params: DeleteDomainConfigurationRequest
    ): Request[DeleteDomainConfigurationResponse] = js.native
    def deleteDynamicThingGroup(params: DeleteDynamicThingGroupRequest): Request[DeleteDynamicThingGroupResponse] =
      js.native
    def deleteJob(params: DeleteJobRequest): Request[js.Object]                   = js.native
    def deleteJobExecution(params: DeleteJobExecutionRequest): Request[js.Object] = js.native
    def deleteMitigationAction(params: DeleteMitigationActionRequest): Request[DeleteMitigationActionResponse] =
      js.native
    def deleteOTAUpdate(params: DeleteOTAUpdateRequest): Request[DeleteOTAUpdateResponse] = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object]                     = js.native
    def deletePolicyVersion(params: DeletePolicyVersionRequest): Request[js.Object]       = js.native
    def deleteProvisioningTemplate(
        params: DeleteProvisioningTemplateRequest
    ): Request[DeleteProvisioningTemplateResponse] = js.native
    def deleteProvisioningTemplateVersion(
        params: DeleteProvisioningTemplateVersionRequest
    ): Request[DeleteProvisioningTemplateVersionResponse] = js.native
    def deleteRegistrationCode(params: DeleteRegistrationCodeRequest): Request[DeleteRegistrationCodeResponse] =
      js.native
    def deleteRoleAlias(params: DeleteRoleAliasRequest): Request[DeleteRoleAliasResponse]                   = js.native
    def deleteScheduledAudit(params: DeleteScheduledAuditRequest): Request[DeleteScheduledAuditResponse]    = js.native
    def deleteSecurityProfile(params: DeleteSecurityProfileRequest): Request[DeleteSecurityProfileResponse] = js.native
    def deleteStream(params: DeleteStreamRequest): Request[DeleteStreamResponse]                            = js.native
    def deleteThing(params: DeleteThingRequest): Request[DeleteThingResponse]                               = js.native
    def deleteThingGroup(params: DeleteThingGroupRequest): Request[DeleteThingGroupResponse]                = js.native
    def deleteThingType(params: DeleteThingTypeRequest): Request[DeleteThingTypeResponse]                   = js.native
    def deleteTopicRule(params: DeleteTopicRuleRequest): Request[js.Object]                                 = js.native
    def deleteTopicRuleDestination(
        params: DeleteTopicRuleDestinationRequest
    ): Request[DeleteTopicRuleDestinationResponse]                                                 = js.native
    def deleteV2LoggingLevel(params: DeleteV2LoggingLevelRequest): Request[js.Object]              = js.native
    def deprecateThingType(params: DeprecateThingTypeRequest): Request[DeprecateThingTypeResponse] = js.native
    def describeAccountAuditConfiguration(
        params: DescribeAccountAuditConfigurationRequest
    ): Request[DescribeAccountAuditConfigurationResponse]                                                = js.native
    def describeAuditFinding(params: DescribeAuditFindingRequest): Request[DescribeAuditFindingResponse] = js.native
    def describeAuditMitigationActionsTask(
        params: DescribeAuditMitigationActionsTaskRequest
    ): Request[DescribeAuditMitigationActionsTaskResponse]                                                  = js.native
    def describeAuditTask(params: DescribeAuditTaskRequest): Request[DescribeAuditTaskResponse]             = js.native
    def describeAuthorizer(params: DescribeAuthorizerRequest): Request[DescribeAuthorizerResponse]          = js.native
    def describeBillingGroup(params: DescribeBillingGroupRequest): Request[DescribeBillingGroupResponse]    = js.native
    def describeCACertificate(params: DescribeCACertificateRequest): Request[DescribeCACertificateResponse] = js.native
    def describeCertificate(params: DescribeCertificateRequest): Request[DescribeCertificateResponse]       = js.native
    def describeDefaultAuthorizer(
        params: DescribeDefaultAuthorizerRequest
    ): Request[DescribeDefaultAuthorizerResponse] = js.native
    def describeDomainConfiguration(
        params: DescribeDomainConfigurationRequest
    ): Request[DescribeDomainConfigurationResponse]                                          = js.native
    def describeEndpoint(params: DescribeEndpointRequest): Request[DescribeEndpointResponse] = js.native
    def describeEventConfigurations(
        params: DescribeEventConfigurationsRequest
    ): Request[DescribeEventConfigurationsResponse]                                                      = js.native
    def describeIndex(params: DescribeIndexRequest): Request[DescribeIndexResponse]                      = js.native
    def describeJob(params: DescribeJobRequest): Request[DescribeJobResponse]                            = js.native
    def describeJobExecution(params: DescribeJobExecutionRequest): Request[DescribeJobExecutionResponse] = js.native
    def describeMitigationAction(params: DescribeMitigationActionRequest): Request[DescribeMitigationActionResponse] =
      js.native
    def describeProvisioningTemplate(
        params: DescribeProvisioningTemplateRequest
    ): Request[DescribeProvisioningTemplateResponse] = js.native
    def describeProvisioningTemplateVersion(
        params: DescribeProvisioningTemplateVersionRequest
    ): Request[DescribeProvisioningTemplateVersionResponse]                                     = js.native
    def describeRoleAlias(params: DescribeRoleAliasRequest): Request[DescribeRoleAliasResponse] = js.native
    def describeScheduledAudit(params: DescribeScheduledAuditRequest): Request[DescribeScheduledAuditResponse] =
      js.native
    def describeSecurityProfile(params: DescribeSecurityProfileRequest): Request[DescribeSecurityProfileResponse] =
      js.native
    def describeStream(params: DescribeStreamRequest): Request[DescribeStreamResponse]             = js.native
    def describeThing(params: DescribeThingRequest): Request[DescribeThingResponse]                = js.native
    def describeThingGroup(params: DescribeThingGroupRequest): Request[DescribeThingGroupResponse] = js.native
    def describeThingRegistrationTask(
        params: DescribeThingRegistrationTaskRequest
    ): Request[DescribeThingRegistrationTaskResponse]                                                       = js.native
    def describeThingType(params: DescribeThingTypeRequest): Request[DescribeThingTypeResponse]             = js.native
    def detachPolicy(params: DetachPolicyRequest): Request[js.Object]                                       = js.native
    def detachSecurityProfile(params: DetachSecurityProfileRequest): Request[DetachSecurityProfileResponse] = js.native
    def detachThingPrincipal(params: DetachThingPrincipalRequest): Request[DetachThingPrincipalResponse]    = js.native
    def disableTopicRule(params: DisableTopicRuleRequest): Request[js.Object]                               = js.native
    def enableTopicRule(params: EnableTopicRuleRequest): Request[js.Object]                                 = js.native
    def getCardinality(params: GetCardinalityRequest): Request[GetCardinalityResponse]                      = js.native
    def getEffectivePolicies(params: GetEffectivePoliciesRequest): Request[GetEffectivePoliciesResponse]    = js.native
    def getIndexingConfiguration(params: GetIndexingConfigurationRequest): Request[GetIndexingConfigurationResponse] =
      js.native
    def getJobDocument(params: GetJobDocumentRequest): Request[GetJobDocumentResponse]                = js.native
    def getLoggingOptions(params: GetLoggingOptionsRequest): Request[GetLoggingOptionsResponse]       = js.native
    def getOTAUpdate(params: GetOTAUpdateRequest): Request[GetOTAUpdateResponse]                      = js.native
    def getPercentiles(params: GetPercentilesRequest): Request[GetPercentilesResponse]                = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse]                               = js.native
    def getPolicyVersion(params: GetPolicyVersionRequest): Request[GetPolicyVersionResponse]          = js.native
    def getRegistrationCode(params: GetRegistrationCodeRequest): Request[GetRegistrationCodeResponse] = js.native
    def getStatistics(params: GetStatisticsRequest): Request[GetStatisticsResponse]                   = js.native
    def getTopicRule(params: GetTopicRuleRequest): Request[GetTopicRuleResponse]                      = js.native
    def getTopicRuleDestination(params: GetTopicRuleDestinationRequest): Request[GetTopicRuleDestinationResponse] =
      js.native
    def getV2LoggingOptions(params: GetV2LoggingOptionsRequest): Request[GetV2LoggingOptionsResponse]    = js.native
    def listActiveViolations(params: ListActiveViolationsRequest): Request[ListActiveViolationsResponse] = js.native
    def listAttachedPolicies(params: ListAttachedPoliciesRequest): Request[ListAttachedPoliciesResponse] = js.native
    def listAuditFindings(params: ListAuditFindingsRequest): Request[ListAuditFindingsResponse]          = js.native
    def listAuditMitigationActionsExecutions(
        params: ListAuditMitigationActionsExecutionsRequest
    ): Request[ListAuditMitigationActionsExecutionsResponse] = js.native
    def listAuditMitigationActionsTasks(
        params: ListAuditMitigationActionsTasksRequest
    ): Request[ListAuditMitigationActionsTasksResponse]                                                  = js.native
    def listAuditTasks(params: ListAuditTasksRequest): Request[ListAuditTasksResponse]                   = js.native
    def listAuthorizers(params: ListAuthorizersRequest): Request[ListAuthorizersResponse]                = js.native
    def listBillingGroups(params: ListBillingGroupsRequest): Request[ListBillingGroupsResponse]          = js.native
    def listCACertificates(params: ListCACertificatesRequest): Request[ListCACertificatesResponse]       = js.native
    def listCertificates(params: ListCertificatesRequest): Request[ListCertificatesResponse]             = js.native
    def listCertificatesByCA(params: ListCertificatesByCARequest): Request[ListCertificatesByCAResponse] = js.native
    def listDomainConfigurations(params: ListDomainConfigurationsRequest): Request[ListDomainConfigurationsResponse] =
      js.native
    def listIndices(params: ListIndicesRequest): Request[ListIndicesResponse] = js.native
    def listJobExecutionsForJob(params: ListJobExecutionsForJobRequest): Request[ListJobExecutionsForJobResponse] =
      js.native
    def listJobExecutionsForThing(
        params: ListJobExecutionsForThingRequest
    ): Request[ListJobExecutionsForThingResponse]                                                           = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse]                                        = js.native
    def listMitigationActions(params: ListMitigationActionsRequest): Request[ListMitigationActionsResponse] = js.native
    def listOTAUpdates(params: ListOTAUpdatesRequest): Request[ListOTAUpdatesResponse]                      = js.native
    def listOutgoingCertificates(params: ListOutgoingCertificatesRequest): Request[ListOutgoingCertificatesResponse] =
      js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse]                      = js.native
    def listPolicyVersions(params: ListPolicyVersionsRequest): Request[ListPolicyVersionsResponse]    = js.native
    def listPrincipalThings(params: ListPrincipalThingsRequest): Request[ListPrincipalThingsResponse] = js.native
    def listProvisioningTemplateVersions(
        params: ListProvisioningTemplateVersionsRequest
    ): Request[ListProvisioningTemplateVersionsResponse] = js.native
    def listProvisioningTemplates(
        params: ListProvisioningTemplatesRequest
    ): Request[ListProvisioningTemplatesResponse]                                                        = js.native
    def listRoleAliases(params: ListRoleAliasesRequest): Request[ListRoleAliasesResponse]                = js.native
    def listScheduledAudits(params: ListScheduledAuditsRequest): Request[ListScheduledAuditsResponse]    = js.native
    def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse] = js.native
    def listSecurityProfilesForTarget(
        params: ListSecurityProfilesForTargetRequest
    ): Request[ListSecurityProfilesForTargetResponse]                                                    = js.native
    def listStreams(params: ListStreamsRequest): Request[ListStreamsResponse]                            = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def listTargetsForPolicy(params: ListTargetsForPolicyRequest): Request[ListTargetsForPolicyResponse] = js.native
    def listTargetsForSecurityProfile(
        params: ListTargetsForSecurityProfileRequest
    ): Request[ListTargetsForSecurityProfileResponse]                                     = js.native
    def listThingGroups(params: ListThingGroupsRequest): Request[ListThingGroupsResponse] = js.native
    def listThingGroupsForThing(params: ListThingGroupsForThingRequest): Request[ListThingGroupsForThingResponse] =
      js.native
    def listThingPrincipals(params: ListThingPrincipalsRequest): Request[ListThingPrincipalsResponse] = js.native
    def listThingRegistrationTaskReports(
        params: ListThingRegistrationTaskReportsRequest
    ): Request[ListThingRegistrationTaskReportsResponse] = js.native
    def listThingRegistrationTasks(
        params: ListThingRegistrationTasksRequest
    ): Request[ListThingRegistrationTasksResponse]                                     = js.native
    def listThingTypes(params: ListThingTypesRequest): Request[ListThingTypesResponse] = js.native
    def listThings(params: ListThingsRequest): Request[ListThingsResponse]             = js.native
    def listThingsInBillingGroup(params: ListThingsInBillingGroupRequest): Request[ListThingsInBillingGroupResponse] =
      js.native
    def listThingsInThingGroup(params: ListThingsInThingGroupRequest): Request[ListThingsInThingGroupResponse] =
      js.native
    def listTopicRuleDestinations(
        params: ListTopicRuleDestinationsRequest
    ): Request[ListTopicRuleDestinationsResponse]                                                           = js.native
    def listTopicRules(params: ListTopicRulesRequest): Request[ListTopicRulesResponse]                      = js.native
    def listV2LoggingLevels(params: ListV2LoggingLevelsRequest): Request[ListV2LoggingLevelsResponse]       = js.native
    def listViolationEvents(params: ListViolationEventsRequest): Request[ListViolationEventsResponse]       = js.native
    def registerCACertificate(params: RegisterCACertificateRequest): Request[RegisterCACertificateResponse] = js.native
    def registerCertificate(params: RegisterCertificateRequest): Request[RegisterCertificateResponse]       = js.native
    def registerThing(params: RegisterThingRequest): Request[RegisterThingResponse]                         = js.native
    def rejectCertificateTransfer(params: RejectCertificateTransferRequest): Request[js.Object]             = js.native
    def removeThingFromBillingGroup(
        params: RemoveThingFromBillingGroupRequest
    ): Request[RemoveThingFromBillingGroupResponse] = js.native
    def removeThingFromThingGroup(
        params: RemoveThingFromThingGroupRequest
    ): Request[RemoveThingFromThingGroupResponse]                                                        = js.native
    def replaceTopicRule(params: ReplaceTopicRuleRequest): Request[js.Object]                            = js.native
    def searchIndex(params: SearchIndexRequest): Request[SearchIndexResponse]                            = js.native
    def setDefaultAuthorizer(params: SetDefaultAuthorizerRequest): Request[SetDefaultAuthorizerResponse] = js.native
    def setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest): Request[js.Object]              = js.native
    def setLoggingOptions(params: SetLoggingOptionsRequest): Request[js.Object]                          = js.native
    def setV2LoggingLevel(params: SetV2LoggingLevelRequest): Request[js.Object]                          = js.native
    def setV2LoggingOptions(params: SetV2LoggingOptionsRequest): Request[js.Object]                      = js.native
    def startAuditMitigationActionsTask(
        params: StartAuditMitigationActionsTaskRequest
    ): Request[StartAuditMitigationActionsTaskResponse] = js.native
    def startOnDemandAuditTask(params: StartOnDemandAuditTaskRequest): Request[StartOnDemandAuditTaskResponse] =
      js.native
    def startThingRegistrationTask(
        params: StartThingRegistrationTaskRequest
    ): Request[StartThingRegistrationTaskResponse] = js.native
    def stopThingRegistrationTask(
        params: StopThingRegistrationTaskRequest
    ): Request[StopThingRegistrationTaskResponse]                                                        = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                            = js.native
    def testAuthorization(params: TestAuthorizationRequest): Request[TestAuthorizationResponse]          = js.native
    def testInvokeAuthorizer(params: TestInvokeAuthorizerRequest): Request[TestInvokeAuthorizerResponse] = js.native
    def transferCertificate(params: TransferCertificateRequest): Request[TransferCertificateResponse]    = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                      = js.native
    def updateAccountAuditConfiguration(
        params: UpdateAccountAuditConfigurationRequest
    ): Request[UpdateAccountAuditConfigurationResponse]                                            = js.native
    def updateAuthorizer(params: UpdateAuthorizerRequest): Request[UpdateAuthorizerResponse]       = js.native
    def updateBillingGroup(params: UpdateBillingGroupRequest): Request[UpdateBillingGroupResponse] = js.native
    def updateCACertificate(params: UpdateCACertificateRequest): Request[js.Object]                = js.native
    def updateCertificate(params: UpdateCertificateRequest): Request[js.Object]                    = js.native
    def updateDomainConfiguration(
        params: UpdateDomainConfigurationRequest
    ): Request[UpdateDomainConfigurationResponse] = js.native
    def updateDynamicThingGroup(params: UpdateDynamicThingGroupRequest): Request[UpdateDynamicThingGroupResponse] =
      js.native
    def updateEventConfigurations(
        params: UpdateEventConfigurationsRequest
    ): Request[UpdateEventConfigurationsResponse] = js.native
    def updateIndexingConfiguration(
        params: UpdateIndexingConfigurationRequest
    ): Request[UpdateIndexingConfigurationResponse]             = js.native
    def updateJob(params: UpdateJobRequest): Request[js.Object] = js.native
    def updateMitigationAction(params: UpdateMitigationActionRequest): Request[UpdateMitigationActionResponse] =
      js.native
    def updateProvisioningTemplate(
        params: UpdateProvisioningTemplateRequest
    ): Request[UpdateProvisioningTemplateResponse]                                                          = js.native
    def updateRoleAlias(params: UpdateRoleAliasRequest): Request[UpdateRoleAliasResponse]                   = js.native
    def updateScheduledAudit(params: UpdateScheduledAuditRequest): Request[UpdateScheduledAuditResponse]    = js.native
    def updateSecurityProfile(params: UpdateSecurityProfileRequest): Request[UpdateSecurityProfileResponse] = js.native
    def updateStream(params: UpdateStreamRequest): Request[UpdateStreamResponse]                            = js.native
    def updateThing(params: UpdateThingRequest): Request[UpdateThingResponse]                               = js.native
    def updateThingGroup(params: UpdateThingGroupRequest): Request[UpdateThingGroupResponse]                = js.native
    def updateThingGroupsForThing(
        params: UpdateThingGroupsForThingRequest
    ): Request[UpdateThingGroupsForThingResponse] = js.native
    def updateTopicRuleDestination(
        params: UpdateTopicRuleDestinationRequest
    ): Request[UpdateTopicRuleDestinationResponse] = js.native
    def validateSecurityProfileBehaviors(
        params: ValidateSecurityProfileBehaviorsRequest
    ): Request[ValidateSecurityProfileBehaviorsResponse] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def attachPrincipalPolicy(
        params: AttachPrincipalPolicyRequest
    ): Request[js.Object] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def detachPrincipalPolicy(
        params: DetachPrincipalPolicyRequest
    ): Request[js.Object] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def listPolicyPrincipals(
        params: ListPolicyPrincipalsRequest
    ): Request[ListPolicyPrincipalsResponse] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def listPrincipalPolicies(
        params: ListPrincipalPoliciesRequest
    ): Request[ListPrincipalPoliciesResponse] = js.native
  }

  @js.native
  sealed trait AbortAction extends js.Any
  object AbortAction extends js.Object {
    val CANCEL = "CANCEL".asInstanceOf[AbortAction]

    val values = js.Object.freeze(js.Array(CANCEL))
  }

  /**
    * Details of abort criteria to abort the job.
    */
  @js.native
  @Factory
  trait AbortConfig extends js.Object {
    var criteriaList: AbortCriteriaList
  }

  /**
    * Details of abort criteria to define rules to abort the job.
    */
  @js.native
  @Factory
  trait AbortCriteria extends js.Object {
    var action: AbortAction
    var failureType: JobExecutionFailureType
    var minNumberOfExecutedThings: MinimumNumberOfExecutedThings
    var thresholdPercentage: AbortThresholdPercentage
  }

  /**
    * The input for the AcceptCertificateTransfer operation.
    */
  @js.native
  @Factory
  trait AcceptCertificateTransferRequest extends js.Object {
    var certificateId: CertificateId
    var setAsActive: js.UndefOr[SetAsActive]
  }

  /**
    * Describes the actions associated with a rule.
    */
  @js.native
  @Factory
  trait Action extends js.Object {
    var cloudwatchAlarm: js.UndefOr[CloudwatchAlarmAction]
    var cloudwatchMetric: js.UndefOr[CloudwatchMetricAction]
    var dynamoDB: js.UndefOr[DynamoDBAction]
    var dynamoDBv2: js.UndefOr[DynamoDBv2Action]
    var elasticsearch: js.UndefOr[ElasticsearchAction]
    var firehose: js.UndefOr[FirehoseAction]
    var http: js.UndefOr[HttpAction]
    var iotAnalytics: js.UndefOr[IotAnalyticsAction]
    var iotEvents: js.UndefOr[IotEventsAction]
    var iotSiteWise: js.UndefOr[IotSiteWiseAction]
    var kinesis: js.UndefOr[KinesisAction]
    var lambda: js.UndefOr[LambdaAction]
    var republish: js.UndefOr[RepublishAction]
    var s3: js.UndefOr[S3Action]
    var salesforce: js.UndefOr[SalesforceAction]
    var sns: js.UndefOr[SnsAction]
    var sqs: js.UndefOr[SqsAction]
    var stepFunctions: js.UndefOr[StepFunctionsAction]
  }

  @js.native
  sealed trait ActionType extends js.Any
  object ActionType extends js.Object {
    val PUBLISH   = "PUBLISH".asInstanceOf[ActionType]
    val SUBSCRIBE = "SUBSCRIBE".asInstanceOf[ActionType]
    val RECEIVE   = "RECEIVE".asInstanceOf[ActionType]
    val CONNECT   = "CONNECT".asInstanceOf[ActionType]

    val values = js.Object.freeze(js.Array(PUBLISH, SUBSCRIBE, RECEIVE, CONNECT))
  }

  /**
    * Information about an active Device Defender security profile behavior violation.
    */
  @js.native
  @Factory
  trait ActiveViolation extends js.Object {
    var behavior: js.UndefOr[Behavior]
    var lastViolationTime: js.UndefOr[Timestamp]
    var lastViolationValue: js.UndefOr[MetricValue]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[DeviceDefenderThingName]
    var violationId: js.UndefOr[ViolationId]
    var violationStartTime: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait AddThingToBillingGroupRequest extends js.Object {
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var billingGroupName: js.UndefOr[BillingGroupName]
    var thingArn: js.UndefOr[ThingArn]
    var thingName: js.UndefOr[ThingName]
  }

  @js.native
  @Factory
  trait AddThingToBillingGroupResponse extends js.Object {}

  @js.native
  @Factory
  trait AddThingToThingGroupRequest extends js.Object {
    var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups]
    var thingArn: js.UndefOr[ThingArn]
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingGroupName: js.UndefOr[ThingGroupName]
    var thingName: js.UndefOr[ThingName]
  }

  @js.native
  @Factory
  trait AddThingToThingGroupResponse extends js.Object {}

  /**
    * Parameters used when defining a mitigation action that move a set of things to a thing group.
    */
  @js.native
  @Factory
  trait AddThingsToThingGroupParams extends js.Object {
    var thingGroupNames: ThingGroupNames
    var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups]
  }

  /**
    * A structure containing the alert target ARN and the role ARN.
    */
  @js.native
  @Factory
  trait AlertTarget extends js.Object {
    var alertTargetArn: AlertTargetArn
    var roleArn: RoleArn
  }

  /**
    * The type of alert target: one of "SNS".
    */
  @js.native
  sealed trait AlertTargetType extends js.Any
  object AlertTargetType extends js.Object {
    val SNS = "SNS".asInstanceOf[AlertTargetType]

    val values = js.Object.freeze(js.Array(SNS))
  }

  /**
    * Contains information that allowed the authorization.
    */
  @js.native
  @Factory
  trait Allowed extends js.Object {
    var policies: js.UndefOr[Policies]
  }

  /**
    * An asset property timestamp entry containing the following information.
    */
  @js.native
  @Factory
  trait AssetPropertyTimestamp extends js.Object {
    var timeInSeconds: AssetPropertyTimeInSeconds
    var offsetInNanos: js.UndefOr[AssetPropertyOffsetInNanos]
  }

  /**
    * An asset property value entry containing the following information.
    */
  @js.native
  @Factory
  trait AssetPropertyValue extends js.Object {
    var timestamp: AssetPropertyTimestamp
    var value: AssetPropertyVariant
    var quality: js.UndefOr[AssetPropertyQuality]
  }

  /**
    * Contains an asset property value (of a single type).
    */
  @js.native
  @Factory
  trait AssetPropertyVariant extends js.Object {
    var booleanValue: js.UndefOr[AssetPropertyBooleanValue]
    var doubleValue: js.UndefOr[AssetPropertyDoubleValue]
    var integerValue: js.UndefOr[AssetPropertyIntegerValue]
    var stringValue: js.UndefOr[AssetPropertyStringValue]
  }

  @js.native
  @Factory
  trait AssociateTargetsWithJobRequest extends js.Object {
    var jobId: JobId
    var targets: JobTargets
    var comment: js.UndefOr[Comment]
  }

  @js.native
  @Factory
  trait AssociateTargetsWithJobResponse extends js.Object {
    var description: js.UndefOr[JobDescription]
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait AttachPolicyRequest extends js.Object {
    var policyName: PolicyName
    var target: PolicyTarget
  }

  /**
    * The input for the AttachPrincipalPolicy operation.
    */
  @js.native
  @Factory
  trait AttachPrincipalPolicyRequest extends js.Object {
    var policyName: PolicyName
    var principal: Principal
  }

  @js.native
  @Factory
  trait AttachSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var securityProfileTargetArn: SecurityProfileTargetArn
  }

  @js.native
  @Factory
  trait AttachSecurityProfileResponse extends js.Object {}

  /**
    * The input for the AttachThingPrincipal operation.
    */
  @js.native
  @Factory
  trait AttachThingPrincipalRequest extends js.Object {
    var principal: Principal
    var thingName: ThingName
  }

  /**
    * The output from the AttachThingPrincipal operation.
    */
  @js.native
  @Factory
  trait AttachThingPrincipalResponse extends js.Object {}

  /**
    * The attribute payload.
    */
  @js.native
  @Factory
  trait AttributePayload extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var merge: js.UndefOr[Flag]
  }

  /**
    * Which audit checks are enabled and disabled for this account.
    */
  @js.native
  @Factory
  trait AuditCheckConfiguration extends js.Object {
    var enabled: js.UndefOr[Enabled]
  }

  /**
    * Information about the audit check.
    */
  @js.native
  @Factory
  trait AuditCheckDetails extends js.Object {
    var checkCompliant: js.UndefOr[CheckCompliant]
    var checkRunStatus: js.UndefOr[AuditCheckRunStatus]
    var errorCode: js.UndefOr[ErrorCode]
    var message: js.UndefOr[ErrorMessage]
    var nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount]
    var totalResourcesCount: js.UndefOr[TotalResourcesCount]
  }

  @js.native
  sealed trait AuditCheckRunStatus extends js.Any
  object AuditCheckRunStatus extends js.Object {
    val IN_PROGRESS                 = "IN_PROGRESS".asInstanceOf[AuditCheckRunStatus]
    val WAITING_FOR_DATA_COLLECTION = "WAITING_FOR_DATA_COLLECTION".asInstanceOf[AuditCheckRunStatus]
    val CANCELED                    = "CANCELED".asInstanceOf[AuditCheckRunStatus]
    val COMPLETED_COMPLIANT         = "COMPLETED_COMPLIANT".asInstanceOf[AuditCheckRunStatus]
    val COMPLETED_NON_COMPLIANT     = "COMPLETED_NON_COMPLIANT".asInstanceOf[AuditCheckRunStatus]
    val FAILED                      = "FAILED".asInstanceOf[AuditCheckRunStatus]

    val values = js.Object.freeze(
      js.Array(IN_PROGRESS, WAITING_FOR_DATA_COLLECTION, CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED)
    )
  }

  /**
    * The findings (results) of the audit.
    */
  @js.native
  @Factory
  trait AuditFinding extends js.Object {
    var checkName: js.UndefOr[AuditCheckName]
    var findingId: js.UndefOr[FindingId]
    var findingTime: js.UndefOr[Timestamp]
    var nonCompliantResource: js.UndefOr[NonCompliantResource]
    var reasonForNonCompliance: js.UndefOr[ReasonForNonCompliance]
    var reasonForNonComplianceCode: js.UndefOr[ReasonForNonComplianceCode]
    var relatedResources: js.UndefOr[RelatedResources]
    var severity: js.UndefOr[AuditFindingSeverity]
    var taskId: js.UndefOr[AuditTaskId]
    var taskStartTime: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait AuditFindingSeverity extends js.Any
  object AuditFindingSeverity extends js.Object {
    val CRITICAL = "CRITICAL".asInstanceOf[AuditFindingSeverity]
    val HIGH     = "HIGH".asInstanceOf[AuditFindingSeverity]
    val MEDIUM   = "MEDIUM".asInstanceOf[AuditFindingSeverity]
    val LOW      = "LOW".asInstanceOf[AuditFindingSeverity]

    val values = js.Object.freeze(js.Array(CRITICAL, HIGH, MEDIUM, LOW))
  }

  @js.native
  sealed trait AuditFrequency extends js.Any
  object AuditFrequency extends js.Object {
    val DAILY    = "DAILY".asInstanceOf[AuditFrequency]
    val WEEKLY   = "WEEKLY".asInstanceOf[AuditFrequency]
    val BIWEEKLY = "BIWEEKLY".asInstanceOf[AuditFrequency]
    val MONTHLY  = "MONTHLY".asInstanceOf[AuditFrequency]

    val values = js.Object.freeze(js.Array(DAILY, WEEKLY, BIWEEKLY, MONTHLY))
  }

  /**
    * Returned by ListAuditMitigationActionsTask, this object contains information that describes a mitigation action that has been started.
    */
  @js.native
  @Factory
  trait AuditMitigationActionExecutionMetadata extends js.Object {
    var actionId: js.UndefOr[MitigationActionId]
    var actionName: js.UndefOr[MitigationActionName]
    var endTime: js.UndefOr[Timestamp]
    var errorCode: js.UndefOr[ErrorCode]
    var findingId: js.UndefOr[FindingId]
    var message: js.UndefOr[ErrorMessage]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[AuditMitigationActionsExecutionStatus]
    var taskId: js.UndefOr[AuditMitigationActionsTaskId]
  }

  @js.native
  sealed trait AuditMitigationActionsExecutionStatus extends js.Any
  object AuditMitigationActionsExecutionStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AuditMitigationActionsExecutionStatus]
    val COMPLETED   = "COMPLETED".asInstanceOf[AuditMitigationActionsExecutionStatus]
    val FAILED      = "FAILED".asInstanceOf[AuditMitigationActionsExecutionStatus]
    val CANCELED    = "CANCELED".asInstanceOf[AuditMitigationActionsExecutionStatus]
    val SKIPPED     = "SKIPPED".asInstanceOf[AuditMitigationActionsExecutionStatus]
    val PENDING     = "PENDING".asInstanceOf[AuditMitigationActionsExecutionStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED, PENDING))
  }

  /**
    * Information about an audit mitigation actions task that is returned by <code>ListAuditMitigationActionsTasks</code>.
    */
  @js.native
  @Factory
  trait AuditMitigationActionsTaskMetadata extends js.Object {
    var startTime: js.UndefOr[Timestamp]
    var taskId: js.UndefOr[AuditMitigationActionsTaskId]
    var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus]
  }

  @js.native
  sealed trait AuditMitigationActionsTaskStatus extends js.Any
  object AuditMitigationActionsTaskStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AuditMitigationActionsTaskStatus]
    val COMPLETED   = "COMPLETED".asInstanceOf[AuditMitigationActionsTaskStatus]
    val FAILED      = "FAILED".asInstanceOf[AuditMitigationActionsTaskStatus]
    val CANCELED    = "CANCELED".asInstanceOf[AuditMitigationActionsTaskStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED))
  }

  /**
    * Used in MitigationActionParams, this information identifies the target findings to which the mitigation actions are applied. Only one entry appears.
    */
  @js.native
  @Factory
  trait AuditMitigationActionsTaskTarget extends js.Object {
    var auditCheckToReasonCodeFilter: js.UndefOr[AuditCheckToReasonCodeFilter]
    var auditTaskId: js.UndefOr[AuditTaskId]
    var findingIds: js.UndefOr[FindingIds]
  }

  /**
    * Information about the targets to which audit notifications are sent.
    */
  @js.native
  @Factory
  trait AuditNotificationTarget extends js.Object {
    var enabled: js.UndefOr[Enabled]
    var roleArn: js.UndefOr[RoleArn]
    var targetArn: js.UndefOr[TargetArn]
  }

  @js.native
  sealed trait AuditNotificationType extends js.Any
  object AuditNotificationType extends js.Object {
    val SNS = "SNS".asInstanceOf[AuditNotificationType]

    val values = js.Object.freeze(js.Array(SNS))
  }

  /**
    * The audits that were performed.
    */
  @js.native
  @Factory
  trait AuditTaskMetadata extends js.Object {
    var taskId: js.UndefOr[AuditTaskId]
    var taskStatus: js.UndefOr[AuditTaskStatus]
    var taskType: js.UndefOr[AuditTaskType]
  }

  @js.native
  sealed trait AuditTaskStatus extends js.Any
  object AuditTaskStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AuditTaskStatus]
    val COMPLETED   = "COMPLETED".asInstanceOf[AuditTaskStatus]
    val FAILED      = "FAILED".asInstanceOf[AuditTaskStatus]
    val CANCELED    = "CANCELED".asInstanceOf[AuditTaskStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED))
  }

  @js.native
  sealed trait AuditTaskType extends js.Any
  object AuditTaskType extends js.Object {
    val ON_DEMAND_AUDIT_TASK = "ON_DEMAND_AUDIT_TASK".asInstanceOf[AuditTaskType]
    val SCHEDULED_AUDIT_TASK = "SCHEDULED_AUDIT_TASK".asInstanceOf[AuditTaskType]

    val values = js.Object.freeze(js.Array(ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK))
  }

  @js.native
  sealed trait AuthDecision extends js.Any
  object AuthDecision extends js.Object {
    val ALLOWED       = "ALLOWED".asInstanceOf[AuthDecision]
    val EXPLICIT_DENY = "EXPLICIT_DENY".asInstanceOf[AuthDecision]
    val IMPLICIT_DENY = "IMPLICIT_DENY".asInstanceOf[AuthDecision]

    val values = js.Object.freeze(js.Array(ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY))
  }

  /**
    * A collection of authorization information.
    */
  @js.native
  @Factory
  trait AuthInfo extends js.Object {
    var actionType: js.UndefOr[ActionType]
    var resources: js.UndefOr[Resources]
  }

  /**
    * The authorizer result.
    */
  @js.native
  @Factory
  trait AuthResult extends js.Object {
    var allowed: js.UndefOr[Allowed]
    var authDecision: js.UndefOr[AuthDecision]
    var authInfo: js.UndefOr[AuthInfo]
    var denied: js.UndefOr[Denied]
    var missingContextValues: js.UndefOr[MissingContextValues]
  }

  /**
    * An object that specifies the authorization service for a domain.
    */
  @js.native
  @Factory
  trait AuthorizerConfig extends js.Object {
    var allowAuthorizerOverride: js.UndefOr[AllowAuthorizerOverride]
    var defaultAuthorizerName: js.UndefOr[AuthorizerName]
  }

  /**
    * The authorizer description.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait AuthorizerStatus extends js.Any
  object AuthorizerStatus extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[AuthorizerStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[AuthorizerStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, INACTIVE))
  }

  /**
    * The authorizer summary.
    */
  @js.native
  @Factory
  trait AuthorizerSummary extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  @js.native
  sealed trait AutoRegistrationStatus extends js.Any
  object AutoRegistrationStatus extends js.Object {
    val ENABLE  = "ENABLE".asInstanceOf[AutoRegistrationStatus]
    val DISABLE = "DISABLE".asInstanceOf[AutoRegistrationStatus]

    val values = js.Object.freeze(js.Array(ENABLE, DISABLE))
  }

  /**
    * Configuration for the rollout of OTA updates.
    */
  @js.native
  @Factory
  trait AwsJobExecutionsRolloutConfig extends js.Object {
    var maximumPerMinute: js.UndefOr[MaximumPerMinute]
  }

  /**
    * Configuration information for pre-signed URLs. Valid when <code>protocols</code> contains HTTP.
    */
  @js.native
  @Factory
  trait AwsJobPresignedUrlConfig extends js.Object {
    var expiresInSec: js.UndefOr[ExpiresInSeconds]
  }

  /**
    * A Device Defender security profile behavior.
    */
  @js.native
  @Factory
  trait Behavior extends js.Object {
    var name: BehaviorName
    var criteria: js.UndefOr[BehaviorCriteria]
    var metric: js.UndefOr[BehaviorMetric]
  }

  /**
    * The criteria by which the behavior is determined to be normal.
    */
  @js.native
  @Factory
  trait BehaviorCriteria extends js.Object {
    var comparisonOperator: js.UndefOr[ComparisonOperator]
    var consecutiveDatapointsToAlarm: js.UndefOr[ConsecutiveDatapointsToAlarm]
    var consecutiveDatapointsToClear: js.UndefOr[ConsecutiveDatapointsToClear]
    var durationSeconds: js.UndefOr[DurationSeconds]
    var statisticalThreshold: js.UndefOr[StatisticalThreshold]
    var value: js.UndefOr[MetricValue]
  }

  /**
    * Additional information about the billing group.
    */
  @js.native
  @Factory
  trait BillingGroupMetadata extends js.Object {
    var creationDate: js.UndefOr[CreationDate]
  }

  /**
    * The properties of a billing group.
    */
  @js.native
  @Factory
  trait BillingGroupProperties extends js.Object {
    var billingGroupDescription: js.UndefOr[BillingGroupDescription]
  }

  /**
    * A CA certificate.
    */
  @js.native
  @Factory
  trait CACertificate extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var creationDate: js.UndefOr[DateType]
    var status: js.UndefOr[CACertificateStatus]
  }

  /**
    * Describes a CA certificate.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait CACertificateStatus extends js.Any
  object CACertificateStatus extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[CACertificateStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[CACertificateStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, INACTIVE))
  }

  @js.native
  sealed trait CACertificateUpdateAction extends js.Any
  object CACertificateUpdateAction extends js.Object {
    val DEACTIVATE = "DEACTIVATE".asInstanceOf[CACertificateUpdateAction]

    val values = js.Object.freeze(js.Array(DEACTIVATE))
  }

  @js.native
  @Factory
  trait CancelAuditMitigationActionsTaskRequest extends js.Object {
    var taskId: AuditMitigationActionsTaskId
  }

  @js.native
  @Factory
  trait CancelAuditMitigationActionsTaskResponse extends js.Object {}

  @js.native
  @Factory
  trait CancelAuditTaskRequest extends js.Object {
    var taskId: AuditTaskId
  }

  @js.native
  @Factory
  trait CancelAuditTaskResponse extends js.Object {}

  /**
    * The input for the CancelCertificateTransfer operation.
    */
  @js.native
  @Factory
  trait CancelCertificateTransferRequest extends js.Object {
    var certificateId: CertificateId
  }

  @js.native
  @Factory
  trait CancelJobExecutionRequest extends js.Object {
    var jobId: JobId
    var thingName: ThingName
    var expectedVersion: js.UndefOr[ExpectedVersion]
    var force: js.UndefOr[ForceFlag]
    var statusDetails: js.UndefOr[DetailsMap]
  }

  @js.native
  @Factory
  trait CancelJobRequest extends js.Object {
    var jobId: JobId
    var comment: js.UndefOr[Comment]
    var force: js.UndefOr[ForceFlag]
    var reasonCode: js.UndefOr[ReasonCode]
  }

  @js.native
  @Factory
  trait CancelJobResponse extends js.Object {
    var description: js.UndefOr[JobDescription]
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
  }

  @js.native
  sealed trait CannedAccessControlList extends js.Any
  object CannedAccessControlList extends js.Object {
    val `private`                   = "private".asInstanceOf[CannedAccessControlList]
    val `public-read`               = "public-read".asInstanceOf[CannedAccessControlList]
    val `public-read-write`         = "public-read-write".asInstanceOf[CannedAccessControlList]
    val `aws-exec-read`             = "aws-exec-read".asInstanceOf[CannedAccessControlList]
    val `authenticated-read`        = "authenticated-read".asInstanceOf[CannedAccessControlList]
    val `bucket-owner-read`         = "bucket-owner-read".asInstanceOf[CannedAccessControlList]
    val `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[CannedAccessControlList]
    val `log-delivery-write`        = "log-delivery-write".asInstanceOf[CannedAccessControlList]

    val values = js.Object.freeze(
      js.Array(
        `private`,
        `public-read`,
        `public-read-write`,
        `aws-exec-read`,
        `authenticated-read`,
        `bucket-owner-read`,
        `bucket-owner-full-control`,
        `log-delivery-write`
      )
    )
  }

  /**
    * Information about a certificate.
    */
  @js.native
  @Factory
  trait Certificate extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var creationDate: js.UndefOr[DateType]
    var status: js.UndefOr[CertificateStatus]
  }

  /**
    * Describes a certificate.
    */
  @js.native
  @Factory
  trait CertificateDescription extends js.Object {
    var caCertificateId: js.UndefOr[CertificateId]
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
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

  @js.native
  sealed trait CertificateStatus extends js.Any
  object CertificateStatus extends js.Object {
    val ACTIVE             = "ACTIVE".asInstanceOf[CertificateStatus]
    val INACTIVE           = "INACTIVE".asInstanceOf[CertificateStatus]
    val REVOKED            = "REVOKED".asInstanceOf[CertificateStatus]
    val PENDING_TRANSFER   = "PENDING_TRANSFER".asInstanceOf[CertificateStatus]
    val REGISTER_INACTIVE  = "REGISTER_INACTIVE".asInstanceOf[CertificateStatus]
    val PENDING_ACTIVATION = "PENDING_ACTIVATION".asInstanceOf[CertificateStatus]

    val values =
      js.Object.freeze(js.Array(ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER, REGISTER_INACTIVE, PENDING_ACTIVATION))
  }

  /**
    * When the certificate is valid.
    */
  @js.native
  @Factory
  trait CertificateValidity extends js.Object {
    var notAfter: js.UndefOr[DateType]
    var notBefore: js.UndefOr[DateType]
  }

  @js.native
  @Factory
  trait ClearDefaultAuthorizerRequest extends js.Object {}

  @js.native
  @Factory
  trait ClearDefaultAuthorizerResponse extends js.Object {}

  /**
    * Describes an action that updates a CloudWatch alarm.
    */
  @js.native
  @Factory
  trait CloudwatchAlarmAction extends js.Object {
    var alarmName: AlarmName
    var roleArn: AwsArn
    var stateReason: StateReason
    var stateValue: StateValue
  }

  /**
    * Describes an action that captures a CloudWatch metric.
    */
  @js.native
  @Factory
  trait CloudwatchMetricAction extends js.Object {
    var metricName: String
    var metricNamespace: String
    var metricUnit: String
    var metricValue: String
    var roleArn: AwsArn
    var metricTimestamp: js.UndefOr[String]
  }

  /**
    * Describes the method to use when code signing a file.
    */
  @js.native
  @Factory
  trait CodeSigning extends js.Object {
    var awsSignerJobId: js.UndefOr[SigningJobId]
    var customCodeSigning: js.UndefOr[CustomCodeSigning]
    var startSigningJobParameter: js.UndefOr[StartSigningJobParameter]
  }

  /**
    * Describes the certificate chain being used when code signing a file.
    */
  @js.native
  @Factory
  trait CodeSigningCertificateChain extends js.Object {
    var certificateName: js.UndefOr[CertificateName]
    var inlineDocument: js.UndefOr[InlineDocument]
  }

  /**
    * Describes the signature for a file.
    */
  @js.native
  @Factory
  trait CodeSigningSignature extends js.Object {
    var inlineDocument: js.UndefOr[Signature]
  }

  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator extends js.Object {
    val `less-than`           = "less-than".asInstanceOf[ComparisonOperator]
    val `less-than-equals`    = "less-than-equals".asInstanceOf[ComparisonOperator]
    val `greater-than`        = "greater-than".asInstanceOf[ComparisonOperator]
    val `greater-than-equals` = "greater-than-equals".asInstanceOf[ComparisonOperator]
    val `in-cidr-set`         = "in-cidr-set".asInstanceOf[ComparisonOperator]
    val `not-in-cidr-set`     = "not-in-cidr-set".asInstanceOf[ComparisonOperator]
    val `in-port-set`         = "in-port-set".asInstanceOf[ComparisonOperator]
    val `not-in-port-set`     = "not-in-port-set".asInstanceOf[ComparisonOperator]

    val values = js.Object.freeze(
      js.Array(
        `less-than`,
        `less-than-equals`,
        `greater-than`,
        `greater-than-equals`,
        `in-cidr-set`,
        `not-in-cidr-set`,
        `in-port-set`,
        `not-in-port-set`
      )
    )
  }

  /**
    * Configuration.
    */
  @js.native
  @Factory
  trait Configuration extends js.Object {
    var Enabled: js.UndefOr[Enabled]
  }

  @js.native
  @Factory
  trait ConfirmTopicRuleDestinationRequest extends js.Object {
    var confirmationToken: ConfirmationToken
  }

  @js.native
  @Factory
  trait ConfirmTopicRuleDestinationResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateAuthorizerRequest extends js.Object {
    var authorizerFunctionArn: AuthorizerFunctionArn
    var authorizerName: AuthorizerName
    var signingDisabled: js.UndefOr[BooleanKey]
    var status: js.UndefOr[AuthorizerStatus]
    var tokenKeyName: js.UndefOr[TokenKeyName]
    var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap]
  }

  @js.native
  @Factory
  trait CreateAuthorizerResponse extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  @js.native
  @Factory
  trait CreateBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
    var billingGroupProperties: js.UndefOr[BillingGroupProperties]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateBillingGroupResponse extends js.Object {
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var billingGroupId: js.UndefOr[BillingGroupId]
    var billingGroupName: js.UndefOr[BillingGroupName]
  }

  /**
    * The input for the CreateCertificateFromCsr operation.
    */
  @js.native
  @Factory
  trait CreateCertificateFromCsrRequest extends js.Object {
    var certificateSigningRequest: CertificateSigningRequest
    var setAsActive: js.UndefOr[SetAsActive]
  }

  /**
    * The output from the CreateCertificateFromCsr operation.
    */
  @js.native
  @Factory
  trait CreateCertificateFromCsrResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var certificatePem: js.UndefOr[CertificatePem]
  }

  @js.native
  @Factory
  trait CreateDomainConfigurationRequest extends js.Object {
    var domainConfigurationName: DomainConfigurationName
    var authorizerConfig: js.UndefOr[AuthorizerConfig]
    var domainName: js.UndefOr[DomainName]
    var serverCertificateArns: js.UndefOr[ServerCertificateArns]
    var serviceType: js.UndefOr[ServiceType]
    var validationCertificateArn: js.UndefOr[AcmCertificateArn]
  }

  @js.native
  @Factory
  trait CreateDomainConfigurationResponse extends js.Object {
    var domainConfigurationArn: js.UndefOr[DomainConfigurationArn]
    var domainConfigurationName: js.UndefOr[DomainConfigurationName]
  }

  @js.native
  @Factory
  trait CreateDynamicThingGroupRequest extends js.Object {
    var queryString: QueryString
    var thingGroupName: ThingGroupName
    var indexName: js.UndefOr[IndexName]
    var queryVersion: js.UndefOr[QueryVersion]
    var tags: js.UndefOr[TagList]
    var thingGroupProperties: js.UndefOr[ThingGroupProperties]
  }

  @js.native
  @Factory
  trait CreateDynamicThingGroupResponse extends js.Object {
    var indexName: js.UndefOr[IndexName]
    var queryString: js.UndefOr[QueryString]
    var queryVersion: js.UndefOr[QueryVersion]
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var thingGroupName: js.UndefOr[ThingGroupName]
  }

  @js.native
  @Factory
  trait CreateJobRequest extends js.Object {
    var jobId: JobId
    var targets: JobTargets
    var abortConfig: js.UndefOr[AbortConfig]
    var description: js.UndefOr[JobDescription]
    var document: js.UndefOr[JobDocument]
    var documentSource: js.UndefOr[JobDocumentSource]
    var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig]
    var presignedUrlConfig: js.UndefOr[PresignedUrlConfig]
    var tags: js.UndefOr[TagList]
    var targetSelection: js.UndefOr[TargetSelection]
    var timeoutConfig: js.UndefOr[TimeoutConfig]
  }

  @js.native
  @Factory
  trait CreateJobResponse extends js.Object {
    var description: js.UndefOr[JobDescription]
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
  }

  /**
    * The input for the CreateKeysAndCertificate operation.
    */
  @js.native
  @Factory
  trait CreateKeysAndCertificateRequest extends js.Object {
    var setAsActive: js.UndefOr[SetAsActive]
  }

  /**
    * The output of the CreateKeysAndCertificate operation.
    */
  @js.native
  @Factory
  trait CreateKeysAndCertificateResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var certificatePem: js.UndefOr[CertificatePem]
    var keyPair: js.UndefOr[KeyPair]
  }

  @js.native
  @Factory
  trait CreateMitigationActionRequest extends js.Object {
    var actionName: MitigationActionName
    var actionParams: MitigationActionParams
    var roleArn: RoleArn
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateMitigationActionResponse extends js.Object {
    var actionArn: js.UndefOr[MitigationActionArn]
    var actionId: js.UndefOr[MitigationActionId]
  }

  @js.native
  @Factory
  trait CreateOTAUpdateRequest extends js.Object {
    var files: OTAUpdateFiles
    var otaUpdateId: OTAUpdateId
    var roleArn: RoleArn
    var targets: Targets
    var additionalParameters: js.UndefOr[AdditionalParameterMap]
    var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig]
    var awsJobPresignedUrlConfig: js.UndefOr[AwsJobPresignedUrlConfig]
    var description: js.UndefOr[OTAUpdateDescription]
    var protocols: js.UndefOr[Protocols]
    var tags: js.UndefOr[TagList]
    var targetSelection: js.UndefOr[TargetSelection]
  }

  @js.native
  @Factory
  trait CreateOTAUpdateResponse extends js.Object {
    var awsIotJobArn: js.UndefOr[AwsIotJobArn]
    var awsIotJobId: js.UndefOr[AwsIotJobId]
    var otaUpdateArn: js.UndefOr[OTAUpdateArn]
    var otaUpdateId: js.UndefOr[OTAUpdateId]
    var otaUpdateStatus: js.UndefOr[OTAUpdateStatus]
  }

  /**
    * The input for the CreatePolicy operation.
    */
  @js.native
  @Factory
  trait CreatePolicyRequest extends js.Object {
    var policyDocument: PolicyDocument
    var policyName: PolicyName
  }

  /**
    * The output from the CreatePolicy operation.
    */
  @js.native
  @Factory
  trait CreatePolicyResponse extends js.Object {
    var policyArn: js.UndefOr[PolicyArn]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
    var policyVersionId: js.UndefOr[PolicyVersionId]
  }

  /**
    * The input for the CreatePolicyVersion operation.
    */
  @js.native
  @Factory
  trait CreatePolicyVersionRequest extends js.Object {
    var policyDocument: PolicyDocument
    var policyName: PolicyName
    var setAsDefault: js.UndefOr[SetAsDefault]
  }

  /**
    * The output of the CreatePolicyVersion operation.
    */
  @js.native
  @Factory
  trait CreatePolicyVersionResponse extends js.Object {
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var policyArn: js.UndefOr[PolicyArn]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyVersionId: js.UndefOr[PolicyVersionId]
  }

  @js.native
  @Factory
  trait CreateProvisioningClaimRequest extends js.Object {
    var templateName: TemplateName
  }

  @js.native
  @Factory
  trait CreateProvisioningClaimResponse extends js.Object {
    var certificateId: js.UndefOr[CertificateId]
    var certificatePem: js.UndefOr[CertificatePem]
    var expiration: js.UndefOr[DateType]
    var keyPair: js.UndefOr[KeyPair]
  }

  @js.native
  @Factory
  trait CreateProvisioningTemplateRequest extends js.Object {
    var provisioningRoleArn: RoleArn
    var templateBody: TemplateBody
    var templateName: TemplateName
    var description: js.UndefOr[TemplateDescription]
    var enabled: js.UndefOr[Enabled]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateProvisioningTemplateResponse extends js.Object {
    var defaultVersionId: js.UndefOr[TemplateVersionId]
    var templateArn: js.UndefOr[TemplateArn]
    var templateName: js.UndefOr[TemplateName]
  }

  @js.native
  @Factory
  trait CreateProvisioningTemplateVersionRequest extends js.Object {
    var templateBody: TemplateBody
    var templateName: TemplateName
    var setAsDefault: js.UndefOr[SetAsDefault]
  }

  @js.native
  @Factory
  trait CreateProvisioningTemplateVersionResponse extends js.Object {
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var templateArn: js.UndefOr[TemplateArn]
    var templateName: js.UndefOr[TemplateName]
    var versionId: js.UndefOr[TemplateVersionId]
  }

  @js.native
  @Factory
  trait CreateRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
    var roleArn: RoleArn
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds]
  }

  @js.native
  @Factory
  trait CreateRoleAliasResponse extends js.Object {
    var roleAlias: js.UndefOr[RoleAlias]
    var roleAliasArn: js.UndefOr[RoleAliasArn]
  }

  @js.native
  @Factory
  trait CreateScheduledAuditRequest extends js.Object {
    var frequency: AuditFrequency
    var scheduledAuditName: ScheduledAuditName
    var targetCheckNames: TargetAuditCheckNames
    var dayOfMonth: js.UndefOr[DayOfMonth]
    var dayOfWeek: js.UndefOr[DayOfWeek]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateScheduledAuditResponse extends js.Object {
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
  }

  @js.native
  @Factory
  trait CreateSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList]
    var alertTargets: js.UndefOr[AlertTargets]
    var behaviors: js.UndefOr[Behaviors]
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateSecurityProfileResponse extends js.Object {
    var securityProfileArn: js.UndefOr[SecurityProfileArn]
    var securityProfileName: js.UndefOr[SecurityProfileName]
  }

  @js.native
  @Factory
  trait CreateStreamRequest extends js.Object {
    var files: StreamFiles
    var roleArn: RoleArn
    var streamId: StreamId
    var description: js.UndefOr[StreamDescription]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateStreamResponse extends js.Object {
    var description: js.UndefOr[StreamDescription]
    var streamArn: js.UndefOr[StreamArn]
    var streamId: js.UndefOr[StreamId]
    var streamVersion: js.UndefOr[StreamVersion]
  }

  @js.native
  @Factory
  trait CreateThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var parentGroupName: js.UndefOr[ThingGroupName]
    var tags: js.UndefOr[TagList]
    var thingGroupProperties: js.UndefOr[ThingGroupProperties]
  }

  @js.native
  @Factory
  trait CreateThingGroupResponse extends js.Object {
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var thingGroupName: js.UndefOr[ThingGroupName]
  }

  /**
    * The input for the CreateThing operation.
    */
  @js.native
  @Factory
  trait CreateThingRequest extends js.Object {
    var thingName: ThingName
    var attributePayload: js.UndefOr[AttributePayload]
    var billingGroupName: js.UndefOr[BillingGroupName]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  /**
    * The output of the CreateThing operation.
    */
  @js.native
  @Factory
  trait CreateThingResponse extends js.Object {
    var thingArn: js.UndefOr[ThingArn]
    var thingId: js.UndefOr[ThingId]
    var thingName: js.UndefOr[ThingName]
  }

  /**
    * The input for the CreateThingType operation.
    */
  @js.native
  @Factory
  trait CreateThingTypeRequest extends js.Object {
    var thingTypeName: ThingTypeName
    var tags: js.UndefOr[TagList]
    var thingTypeProperties: js.UndefOr[ThingTypeProperties]
  }

  /**
    * The output of the CreateThingType operation.
    */
  @js.native
  @Factory
  trait CreateThingTypeResponse extends js.Object {
    var thingTypeArn: js.UndefOr[ThingTypeArn]
    var thingTypeId: js.UndefOr[ThingTypeId]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  @js.native
  @Factory
  trait CreateTopicRuleDestinationRequest extends js.Object {
    var destinationConfiguration: TopicRuleDestinationConfiguration
  }

  @js.native
  @Factory
  trait CreateTopicRuleDestinationResponse extends js.Object {
    var topicRuleDestination: js.UndefOr[TopicRuleDestination]
  }

  /**
    * The input for the CreateTopicRule operation.
    */
  @js.native
  @Factory
  trait CreateTopicRuleRequest extends js.Object {
    var ruleName: RuleName
    var topicRulePayload: TopicRulePayload
    var tags: js.UndefOr[String]
  }

  /**
    * Describes a custom method used to code sign a file.
    */
  @js.native
  @Factory
  trait CustomCodeSigning extends js.Object {
    var certificateChain: js.UndefOr[CodeSigningCertificateChain]
    var hashAlgorithm: js.UndefOr[HashAlgorithm]
    var signature: js.UndefOr[CodeSigningSignature]
    var signatureAlgorithm: js.UndefOr[SignatureAlgorithm]
  }

  @js.native
  sealed trait DayOfWeek extends js.Any
  object DayOfWeek extends js.Object {
    val SUN = "SUN".asInstanceOf[DayOfWeek]
    val MON = "MON".asInstanceOf[DayOfWeek]
    val TUE = "TUE".asInstanceOf[DayOfWeek]
    val WED = "WED".asInstanceOf[DayOfWeek]
    val THU = "THU".asInstanceOf[DayOfWeek]
    val FRI = "FRI".asInstanceOf[DayOfWeek]
    val SAT = "SAT".asInstanceOf[DayOfWeek]

    val values = js.Object.freeze(js.Array(SUN, MON, TUE, WED, THU, FRI, SAT))
  }

  @js.native
  @Factory
  trait DeleteAccountAuditConfigurationRequest extends js.Object {
    var deleteScheduledAudits: js.UndefOr[DeleteScheduledAudits]
  }

  @js.native
  @Factory
  trait DeleteAccountAuditConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
  }

  @js.native
  @Factory
  trait DeleteAuthorizerResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  @js.native
  @Factory
  trait DeleteBillingGroupResponse extends js.Object {}

  /**
    * Input for the DeleteCACertificate operation.
    */
  @js.native
  @Factory
  trait DeleteCACertificateRequest extends js.Object {
    var certificateId: CertificateId
  }

  /**
    * The output for the DeleteCACertificate operation.
    */
  @js.native
  @Factory
  trait DeleteCACertificateResponse extends js.Object {}

  /**
    * The input for the DeleteCertificate operation.
    */
  @js.native
  @Factory
  trait DeleteCertificateRequest extends js.Object {
    var certificateId: CertificateId
    var forceDelete: js.UndefOr[ForceDelete]
  }

  @js.native
  @Factory
  trait DeleteDomainConfigurationRequest extends js.Object {
    var domainConfigurationName: DomainConfigurationName
  }

  @js.native
  @Factory
  trait DeleteDomainConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteDynamicThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  @js.native
  @Factory
  trait DeleteDynamicThingGroupResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteJobExecutionRequest extends js.Object {
    var executionNumber: ExecutionNumber
    var jobId: JobId
    var thingName: ThingName
    var force: js.UndefOr[ForceFlag]
  }

  @js.native
  @Factory
  trait DeleteJobRequest extends js.Object {
    var jobId: JobId
    var force: js.UndefOr[ForceFlag]
  }

  @js.native
  @Factory
  trait DeleteMitigationActionRequest extends js.Object {
    var actionName: MitigationActionName
  }

  @js.native
  @Factory
  trait DeleteMitigationActionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteOTAUpdateRequest extends js.Object {
    var otaUpdateId: OTAUpdateId
    var deleteStream: js.UndefOr[DeleteStream]
    var forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob]
  }

  @js.native
  @Factory
  trait DeleteOTAUpdateResponse extends js.Object {}

  /**
    * The input for the DeletePolicy operation.
    */
  @js.native
  @Factory
  trait DeletePolicyRequest extends js.Object {
    var policyName: PolicyName
  }

  /**
    * The input for the DeletePolicyVersion operation.
    */
  @js.native
  @Factory
  trait DeletePolicyVersionRequest extends js.Object {
    var policyName: PolicyName
    var policyVersionId: PolicyVersionId
  }

  @js.native
  @Factory
  trait DeleteProvisioningTemplateRequest extends js.Object {
    var templateName: TemplateName
  }

  @js.native
  @Factory
  trait DeleteProvisioningTemplateResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteProvisioningTemplateVersionRequest extends js.Object {
    var templateName: TemplateName
    var versionId: TemplateVersionId
  }

  @js.native
  @Factory
  trait DeleteProvisioningTemplateVersionResponse extends js.Object {}

  /**
    * The input for the DeleteRegistrationCode operation.
    */
  @js.native
  @Factory
  trait DeleteRegistrationCodeRequest extends js.Object {}

  /**
    * The output for the DeleteRegistrationCode operation.
    */
  @js.native
  @Factory
  trait DeleteRegistrationCodeResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
  }

  @js.native
  @Factory
  trait DeleteRoleAliasResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteScheduledAuditRequest extends js.Object {
    var scheduledAuditName: ScheduledAuditName
  }

  @js.native
  @Factory
  trait DeleteScheduledAuditResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  @js.native
  @Factory
  trait DeleteSecurityProfileResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteStreamRequest extends js.Object {
    var streamId: StreamId
  }

  @js.native
  @Factory
  trait DeleteStreamResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  @js.native
  @Factory
  trait DeleteThingGroupResponse extends js.Object {}

  /**
    * The input for the DeleteThing operation.
    */
  @js.native
  @Factory
  trait DeleteThingRequest extends js.Object {
    var thingName: ThingName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  /**
    * The output of the DeleteThing operation.
    */
  @js.native
  @Factory
  trait DeleteThingResponse extends js.Object {}

  /**
    * The input for the DeleteThingType operation.
    */
  @js.native
  @Factory
  trait DeleteThingTypeRequest extends js.Object {
    var thingTypeName: ThingTypeName
  }

  /**
    * The output for the DeleteThingType operation.
    */
  @js.native
  @Factory
  trait DeleteThingTypeResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteTopicRuleDestinationRequest extends js.Object {
    var arn: AwsArn
  }

  @js.native
  @Factory
  trait DeleteTopicRuleDestinationResponse extends js.Object {}

  /**
    * The input for the DeleteTopicRule operation.
    */
  @js.native
  @Factory
  trait DeleteTopicRuleRequest extends js.Object {
    var ruleName: RuleName
  }

  @js.native
  @Factory
  trait DeleteV2LoggingLevelRequest extends js.Object {
    var targetName: LogTargetName
    var targetType: LogTargetType
  }

  /**
    * Contains information that denied the authorization.
    */
  @js.native
  @Factory
  trait Denied extends js.Object {
    var explicitDeny: js.UndefOr[ExplicitDeny]
    var implicitDeny: js.UndefOr[ImplicitDeny]
  }

  /**
    * The input for the DeprecateThingType operation.
    */
  @js.native
  @Factory
  trait DeprecateThingTypeRequest extends js.Object {
    var thingTypeName: ThingTypeName
    var undoDeprecate: js.UndefOr[UndoDeprecate]
  }

  /**
    * The output for the DeprecateThingType operation.
    */
  @js.native
  @Factory
  trait DeprecateThingTypeResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeAccountAuditConfigurationRequest extends js.Object {}

  @js.native
  @Factory
  trait DescribeAccountAuditConfigurationResponse extends js.Object {
    var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations]
    var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations]
    var roleArn: js.UndefOr[RoleArn]
  }

  @js.native
  @Factory
  trait DescribeAuditFindingRequest extends js.Object {
    var findingId: FindingId
  }

  @js.native
  @Factory
  trait DescribeAuditFindingResponse extends js.Object {
    var finding: js.UndefOr[AuditFinding]
  }

  @js.native
  @Factory
  trait DescribeAuditMitigationActionsTaskRequest extends js.Object {
    var taskId: AuditMitigationActionsTaskId
  }

  @js.native
  @Factory
  trait DescribeAuditMitigationActionsTaskResponse extends js.Object {
    var actionsDefinition: js.UndefOr[MitigationActionList]
    var auditCheckToActionsMapping: js.UndefOr[AuditCheckToActionsMapping]
    var endTime: js.UndefOr[Timestamp]
    var startTime: js.UndefOr[Timestamp]
    var target: js.UndefOr[AuditMitigationActionsTaskTarget]
    var taskStatistics: js.UndefOr[AuditMitigationActionsTaskStatistics]
    var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus]
  }

  @js.native
  @Factory
  trait DescribeAuditTaskRequest extends js.Object {
    var taskId: AuditTaskId
  }

  @js.native
  @Factory
  trait DescribeAuditTaskResponse extends js.Object {
    var auditDetails: js.UndefOr[AuditDetails]
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
    var taskStartTime: js.UndefOr[Timestamp]
    var taskStatistics: js.UndefOr[TaskStatistics]
    var taskStatus: js.UndefOr[AuditTaskStatus]
    var taskType: js.UndefOr[AuditTaskType]
  }

  @js.native
  @Factory
  trait DescribeAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
  }

  @js.native
  @Factory
  trait DescribeAuthorizerResponse extends js.Object {
    var authorizerDescription: js.UndefOr[AuthorizerDescription]
  }

  @js.native
  @Factory
  trait DescribeBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
  }

  @js.native
  @Factory
  trait DescribeBillingGroupResponse extends js.Object {
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var billingGroupId: js.UndefOr[BillingGroupId]
    var billingGroupMetadata: js.UndefOr[BillingGroupMetadata]
    var billingGroupName: js.UndefOr[BillingGroupName]
    var billingGroupProperties: js.UndefOr[BillingGroupProperties]
    var version: js.UndefOr[Version]
  }

  /**
    * The input for the DescribeCACertificate operation.
    */
  @js.native
  @Factory
  trait DescribeCACertificateRequest extends js.Object {
    var certificateId: CertificateId
  }

  /**
    * The output from the DescribeCACertificate operation.
    */
  @js.native
  @Factory
  trait DescribeCACertificateResponse extends js.Object {
    var certificateDescription: js.UndefOr[CACertificateDescription]
    var registrationConfig: js.UndefOr[RegistrationConfig]
  }

  /**
    * The input for the DescribeCertificate operation.
    */
  @js.native
  @Factory
  trait DescribeCertificateRequest extends js.Object {
    var certificateId: CertificateId
  }

  /**
    * The output of the DescribeCertificate operation.
    */
  @js.native
  @Factory
  trait DescribeCertificateResponse extends js.Object {
    var certificateDescription: js.UndefOr[CertificateDescription]
  }

  @js.native
  @Factory
  trait DescribeDefaultAuthorizerRequest extends js.Object {}

  @js.native
  @Factory
  trait DescribeDefaultAuthorizerResponse extends js.Object {
    var authorizerDescription: js.UndefOr[AuthorizerDescription]
  }

  @js.native
  @Factory
  trait DescribeDomainConfigurationRequest extends js.Object {
    var domainConfigurationName: ReservedDomainConfigurationName
  }

  @js.native
  @Factory
  trait DescribeDomainConfigurationResponse extends js.Object {
    var authorizerConfig: js.UndefOr[AuthorizerConfig]
    var domainConfigurationArn: js.UndefOr[DomainConfigurationArn]
    var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName]
    var domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus]
    var domainName: js.UndefOr[DomainName]
    var domainType: js.UndefOr[DomainType]
    var serverCertificates: js.UndefOr[ServerCertificates]
    var serviceType: js.UndefOr[ServiceType]
  }

  /**
    * The input for the DescribeEndpoint operation.
    */
  @js.native
  @Factory
  trait DescribeEndpointRequest extends js.Object {
    var endpointType: js.UndefOr[EndpointType]
  }

  /**
    * The output from the DescribeEndpoint operation.
    */
  @js.native
  @Factory
  trait DescribeEndpointResponse extends js.Object {
    var endpointAddress: js.UndefOr[EndpointAddress]
  }

  @js.native
  @Factory
  trait DescribeEventConfigurationsRequest extends js.Object {}

  @js.native
  @Factory
  trait DescribeEventConfigurationsResponse extends js.Object {
    var creationDate: js.UndefOr[CreationDate]
    var eventConfigurations: js.UndefOr[EventConfigurations]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
  }

  @js.native
  @Factory
  trait DescribeIndexRequest extends js.Object {
    var indexName: IndexName
  }

  @js.native
  @Factory
  trait DescribeIndexResponse extends js.Object {
    var indexName: js.UndefOr[IndexName]
    var indexStatus: js.UndefOr[IndexStatus]
    var schema: js.UndefOr[IndexSchema]
  }

  @js.native
  @Factory
  trait DescribeJobExecutionRequest extends js.Object {
    var jobId: JobId
    var thingName: ThingName
    var executionNumber: js.UndefOr[ExecutionNumber]
  }

  @js.native
  @Factory
  trait DescribeJobExecutionResponse extends js.Object {
    var execution: js.UndefOr[JobExecution]
  }

  @js.native
  @Factory
  trait DescribeJobRequest extends js.Object {
    var jobId: JobId
  }

  @js.native
  @Factory
  trait DescribeJobResponse extends js.Object {
    var documentSource: js.UndefOr[JobDocumentSource]
    var job: js.UndefOr[Job]
  }

  @js.native
  @Factory
  trait DescribeMitigationActionRequest extends js.Object {
    var actionName: MitigationActionName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeProvisioningTemplateRequest extends js.Object {
    var templateName: TemplateName
  }

  @js.native
  @Factory
  trait DescribeProvisioningTemplateResponse extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var defaultVersionId: js.UndefOr[TemplateVersionId]
    var description: js.UndefOr[TemplateDescription]
    var enabled: js.UndefOr[Enabled]
    var lastModifiedDate: js.UndefOr[DateType]
    var provisioningRoleArn: js.UndefOr[RoleArn]
    var templateArn: js.UndefOr[TemplateArn]
    var templateBody: js.UndefOr[TemplateBody]
    var templateName: js.UndefOr[TemplateName]
  }

  @js.native
  @Factory
  trait DescribeProvisioningTemplateVersionRequest extends js.Object {
    var templateName: TemplateName
    var versionId: TemplateVersionId
  }

  @js.native
  @Factory
  trait DescribeProvisioningTemplateVersionResponse extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var templateBody: js.UndefOr[TemplateBody]
    var versionId: js.UndefOr[TemplateVersionId]
  }

  @js.native
  @Factory
  trait DescribeRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
  }

  @js.native
  @Factory
  trait DescribeRoleAliasResponse extends js.Object {
    var roleAliasDescription: js.UndefOr[RoleAliasDescription]
  }

  @js.native
  @Factory
  trait DescribeScheduledAuditRequest extends js.Object {
    var scheduledAuditName: ScheduledAuditName
  }

  @js.native
  @Factory
  trait DescribeScheduledAuditResponse extends js.Object {
    var dayOfMonth: js.UndefOr[DayOfMonth]
    var dayOfWeek: js.UndefOr[DayOfWeek]
    var frequency: js.UndefOr[AuditFrequency]
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
    var targetCheckNames: js.UndefOr[TargetAuditCheckNames]
  }

  @js.native
  @Factory
  trait DescribeSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
  }

  @js.native
  @Factory
  trait DescribeSecurityProfileResponse extends js.Object {
    var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList]
    var alertTargets: js.UndefOr[AlertTargets]
    var behaviors: js.UndefOr[Behaviors]
    var creationDate: js.UndefOr[Timestamp]
    var lastModifiedDate: js.UndefOr[Timestamp]
    var securityProfileArn: js.UndefOr[SecurityProfileArn]
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait DescribeStreamRequest extends js.Object {
    var streamId: StreamId
  }

  @js.native
  @Factory
  trait DescribeStreamResponse extends js.Object {
    var streamInfo: js.UndefOr[StreamInfo]
  }

  @js.native
  @Factory
  trait DescribeThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeThingRegistrationTaskRequest extends js.Object {
    var taskId: TaskId
  }

  @js.native
  @Factory
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

  /**
    * The input for the DescribeThing operation.
    */
  @js.native
  @Factory
  trait DescribeThingRequest extends js.Object {
    var thingName: ThingName
  }

  /**
    * The output from the DescribeThing operation.
    */
  @js.native
  @Factory
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

  /**
    * The input for the DescribeThingType operation.
    */
  @js.native
  @Factory
  trait DescribeThingTypeRequest extends js.Object {
    var thingTypeName: ThingTypeName
  }

  /**
    * The output for the DescribeThingType operation.
    */
  @js.native
  @Factory
  trait DescribeThingTypeResponse extends js.Object {
    var thingTypeArn: js.UndefOr[ThingTypeArn]
    var thingTypeId: js.UndefOr[ThingTypeId]
    var thingTypeMetadata: js.UndefOr[ThingTypeMetadata]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var thingTypeProperties: js.UndefOr[ThingTypeProperties]
  }

  /**
    * Describes the location of the updated firmware.
    */
  @js.native
  @Factory
  trait Destination extends js.Object {
    var s3Destination: js.UndefOr[S3Destination]
  }

  @js.native
  @Factory
  trait DetachPolicyRequest extends js.Object {
    var policyName: PolicyName
    var target: PolicyTarget
  }

  /**
    * The input for the DetachPrincipalPolicy operation.
    */
  @js.native
  @Factory
  trait DetachPrincipalPolicyRequest extends js.Object {
    var policyName: PolicyName
    var principal: Principal
  }

  @js.native
  @Factory
  trait DetachSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var securityProfileTargetArn: SecurityProfileTargetArn
  }

  @js.native
  @Factory
  trait DetachSecurityProfileResponse extends js.Object {}

  /**
    * The input for the DetachThingPrincipal operation.
    */
  @js.native
  @Factory
  trait DetachThingPrincipalRequest extends js.Object {
    var principal: Principal
    var thingName: ThingName
  }

  /**
    * The output from the DetachThingPrincipal operation.
    */
  @js.native
  @Factory
  trait DetachThingPrincipalResponse extends js.Object {}

  @js.native
  sealed trait DeviceCertificateUpdateAction extends js.Any
  object DeviceCertificateUpdateAction extends js.Object {
    val DEACTIVATE = "DEACTIVATE".asInstanceOf[DeviceCertificateUpdateAction]

    val values = js.Object.freeze(js.Array(DEACTIVATE))
  }

  /**
    * The input for the DisableTopicRuleRequest operation.
    */
  @js.native
  @Factory
  trait DisableTopicRuleRequest extends js.Object {
    var ruleName: RuleName
  }

  @js.native
  sealed trait DomainConfigurationStatus extends js.Any
  object DomainConfigurationStatus extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[DomainConfigurationStatus]
    val DISABLED = "DISABLED".asInstanceOf[DomainConfigurationStatus]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * The summary of a domain configuration. A domain configuration specifies custom IoT-specific information about a domain. A domain configuration can be associated with an AWS-managed domain (for example, dbc123defghijk.iot.us-west-2.amazonaws.com), a customer managed domain, or a default endpoint.
    * * Data
    *  * Jobs
    *  * CredentialProvider
    * '''Note:'''The domain configuration feature is in public preview and is subject to change.
    */
  @js.native
  @Factory
  trait DomainConfigurationSummary extends js.Object {
    var domainConfigurationArn: js.UndefOr[DomainConfigurationArn]
    var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName]
    var serviceType: js.UndefOr[ServiceType]
  }

  @js.native
  sealed trait DomainType extends js.Any
  object DomainType extends js.Object {
    val ENDPOINT         = "ENDPOINT".asInstanceOf[DomainType]
    val AWS_MANAGED      = "AWS_MANAGED".asInstanceOf[DomainType]
    val CUSTOMER_MANAGED = "CUSTOMER_MANAGED".asInstanceOf[DomainType]

    val values = js.Object.freeze(js.Array(ENDPOINT, AWS_MANAGED, CUSTOMER_MANAGED))
  }

  @js.native
  sealed trait DynamicGroupStatus extends js.Any
  object DynamicGroupStatus extends js.Object {
    val ACTIVE     = "ACTIVE".asInstanceOf[DynamicGroupStatus]
    val BUILDING   = "BUILDING".asInstanceOf[DynamicGroupStatus]
    val REBUILDING = "REBUILDING".asInstanceOf[DynamicGroupStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, BUILDING, REBUILDING))
  }

  /**
    * Describes an action to write to a DynamoDB table.
    *  The <code>tableName</code>, <code>hashKeyField</code>, and <code>rangeKeyField</code> values must match the values used when you created the table.
    *  The <code>hashKeyValue</code> and <code>rangeKeyvalue</code> fields use a substitution template syntax. These templates provide data at runtime. The syntax is as follows: {<i>sql-expression</i>}.
    *  You can specify any valid expression in a WHERE or SELECT clause, including JSON properties, comparisons, calculations, and functions. For example, the following field uses the third level of the topic:
    *  <code>"hashKeyValue": "{topic(3)}"</code>
    *  The following field uses the timestamp:
    *  <code>"rangeKeyValue": "{timestamp()}"</code>
    */
  @js.native
  @Factory
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

  /**
    * Describes an action to write to a DynamoDB table.
    *  This DynamoDB action writes each attribute in the message payload into it's own column in the DynamoDB table.
    */
  @js.native
  @Factory
  trait DynamoDBv2Action extends js.Object {
    var putItem: PutItemInput
    var roleArn: AwsArn
  }

  @js.native
  sealed trait DynamoKeyType extends js.Any
  object DynamoKeyType extends js.Object {
    val STRING = "STRING".asInstanceOf[DynamoKeyType]
    val NUMBER = "NUMBER".asInstanceOf[DynamoKeyType]

    val values = js.Object.freeze(js.Array(STRING, NUMBER))
  }

  /**
    * The policy that has the effect on the authorization results.
    */
  @js.native
  @Factory
  trait EffectivePolicy extends js.Object {
    var policyArn: js.UndefOr[PolicyArn]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
  }

  /**
    * Describes an action that writes data to an Amazon Elasticsearch Service domain.
    */
  @js.native
  @Factory
  trait ElasticsearchAction extends js.Object {
    var endpoint: ElasticsearchEndpoint
    var id: ElasticsearchId
    var index: ElasticsearchIndex
    var roleArn: AwsArn
    var `type`: ElasticsearchType
  }

  /**
    * Parameters used when defining a mitigation action that enable AWS IoT logging.
    */
  @js.native
  @Factory
  trait EnableIoTLoggingParams extends js.Object {
    var logLevel: LogLevel
    var roleArnForLogging: RoleArn
  }

  /**
    * The input for the EnableTopicRuleRequest operation.
    */
  @js.native
  @Factory
  trait EnableTopicRuleRequest extends js.Object {
    var ruleName: RuleName
  }

  /**
    * Error information.
    */
  @js.native
  @Factory
  trait ErrorInfo extends js.Object {
    var code: js.UndefOr[Code]
    var message: js.UndefOr[OTAUpdateErrorMessage]
  }

  @js.native
  sealed trait EventType extends js.Any
  object EventType extends js.Object {
    val THING                  = "THING".asInstanceOf[EventType]
    val THING_GROUP            = "THING_GROUP".asInstanceOf[EventType]
    val THING_TYPE             = "THING_TYPE".asInstanceOf[EventType]
    val THING_GROUP_MEMBERSHIP = "THING_GROUP_MEMBERSHIP".asInstanceOf[EventType]
    val THING_GROUP_HIERARCHY  = "THING_GROUP_HIERARCHY".asInstanceOf[EventType]
    val THING_TYPE_ASSOCIATION = "THING_TYPE_ASSOCIATION".asInstanceOf[EventType]
    val JOB                    = "JOB".asInstanceOf[EventType]
    val JOB_EXECUTION          = "JOB_EXECUTION".asInstanceOf[EventType]
    val POLICY                 = "POLICY".asInstanceOf[EventType]
    val CERTIFICATE            = "CERTIFICATE".asInstanceOf[EventType]
    val CA_CERTIFICATE         = "CA_CERTIFICATE".asInstanceOf[EventType]

    val values = js.Object.freeze(
      js.Array(
        THING,
        THING_GROUP,
        THING_TYPE,
        THING_GROUP_MEMBERSHIP,
        THING_GROUP_HIERARCHY,
        THING_TYPE_ASSOCIATION,
        JOB,
        JOB_EXECUTION,
        POLICY,
        CERTIFICATE,
        CA_CERTIFICATE
      )
    )
  }

  /**
    * Information that explicitly denies authorization.
    */
  @js.native
  @Factory
  trait ExplicitDeny extends js.Object {
    var policies: js.UndefOr[Policies]
  }

  /**
    * Allows you to create an exponential rate of rollout for a job.
    */
  @js.native
  @Factory
  trait ExponentialRolloutRate extends js.Object {
    var baseRatePerMinute: RolloutRatePerMinute
    var incrementFactor: IncrementFactor
    var rateIncreaseCriteria: RateIncreaseCriteria
  }

  /**
    * Describes the name and data type at a field.
    */
  @js.native
  @Factory
  trait Field extends js.Object {
    var name: js.UndefOr[FieldName]
    var `type`: js.UndefOr[FieldType]
  }

  @js.native
  sealed trait FieldType extends js.Any
  object FieldType extends js.Object {
    val Number  = "Number".asInstanceOf[FieldType]
    val String  = "String".asInstanceOf[FieldType]
    val Boolean = "Boolean".asInstanceOf[FieldType]

    val values = js.Object.freeze(js.Array(Number, String, Boolean))
  }

  /**
    * The location of the OTA update.
    */
  @js.native
  @Factory
  trait FileLocation extends js.Object {
    var s3Location: js.UndefOr[S3Location]
    var stream: js.UndefOr[Stream]
  }

  /**
    * Describes an action that writes data to an Amazon Kinesis Firehose stream.
    */
  @js.native
  @Factory
  trait FirehoseAction extends js.Object {
    var deliveryStreamName: DeliveryStreamName
    var roleArn: AwsArn
    var separator: js.UndefOr[FirehoseSeparator]
  }

  @js.native
  @Factory
  trait GetCardinalityRequest extends js.Object {
    var queryString: QueryString
    var aggregationField: js.UndefOr[AggregationField]
    var indexName: js.UndefOr[IndexName]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  @js.native
  @Factory
  trait GetCardinalityResponse extends js.Object {
    var cardinality: js.UndefOr[Count]
  }

  @js.native
  @Factory
  trait GetEffectivePoliciesRequest extends js.Object {
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId]
    var principal: js.UndefOr[Principal]
    var thingName: js.UndefOr[ThingName]
  }

  @js.native
  @Factory
  trait GetEffectivePoliciesResponse extends js.Object {
    var effectivePolicies: js.UndefOr[EffectivePolicies]
  }

  @js.native
  @Factory
  trait GetIndexingConfigurationRequest extends js.Object {}

  @js.native
  @Factory
  trait GetIndexingConfigurationResponse extends js.Object {
    var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration]
    var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration]
  }

  @js.native
  @Factory
  trait GetJobDocumentRequest extends js.Object {
    var jobId: JobId
  }

  @js.native
  @Factory
  trait GetJobDocumentResponse extends js.Object {
    var document: js.UndefOr[JobDocument]
  }

  /**
    * The input for the GetLoggingOptions operation.
    */
  @js.native
  @Factory
  trait GetLoggingOptionsRequest extends js.Object {}

  /**
    * The output from the GetLoggingOptions operation.
    */
  @js.native
  @Factory
  trait GetLoggingOptionsResponse extends js.Object {
    var logLevel: js.UndefOr[LogLevel]
    var roleArn: js.UndefOr[AwsArn]
  }

  @js.native
  @Factory
  trait GetOTAUpdateRequest extends js.Object {
    var otaUpdateId: OTAUpdateId
  }

  @js.native
  @Factory
  trait GetOTAUpdateResponse extends js.Object {
    var otaUpdateInfo: js.UndefOr[OTAUpdateInfo]
  }

  @js.native
  @Factory
  trait GetPercentilesRequest extends js.Object {
    var queryString: QueryString
    var aggregationField: js.UndefOr[AggregationField]
    var indexName: js.UndefOr[IndexName]
    var percents: js.UndefOr[PercentList]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  @js.native
  @Factory
  trait GetPercentilesResponse extends js.Object {
    var percentiles: js.UndefOr[Percentiles]
  }

  /**
    * The input for the GetPolicy operation.
    */
  @js.native
  @Factory
  trait GetPolicyRequest extends js.Object {
    var policyName: PolicyName
  }

  /**
    * The output from the GetPolicy operation.
    */
  @js.native
  @Factory
  trait GetPolicyResponse extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var defaultVersionId: js.UndefOr[PolicyVersionId]
    var generationId: js.UndefOr[GenerationId]
    var lastModifiedDate: js.UndefOr[DateType]
    var policyArn: js.UndefOr[PolicyArn]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
  }

  /**
    * The input for the GetPolicyVersion operation.
    */
  @js.native
  @Factory
  trait GetPolicyVersionRequest extends js.Object {
    var policyName: PolicyName
    var policyVersionId: PolicyVersionId
  }

  /**
    * The output from the GetPolicyVersion operation.
    */
  @js.native
  @Factory
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

  /**
    * The input to the GetRegistrationCode operation.
    */
  @js.native
  @Factory
  trait GetRegistrationCodeRequest extends js.Object {}

  /**
    * The output from the GetRegistrationCode operation.
    */
  @js.native
  @Factory
  trait GetRegistrationCodeResponse extends js.Object {
    var registrationCode: js.UndefOr[RegistrationCode]
  }

  @js.native
  @Factory
  trait GetStatisticsRequest extends js.Object {
    var queryString: QueryString
    var aggregationField: js.UndefOr[AggregationField]
    var indexName: js.UndefOr[IndexName]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  @js.native
  @Factory
  trait GetStatisticsResponse extends js.Object {
    var statistics: js.UndefOr[Statistics]
  }

  @js.native
  @Factory
  trait GetTopicRuleDestinationRequest extends js.Object {
    var arn: AwsArn
  }

  @js.native
  @Factory
  trait GetTopicRuleDestinationResponse extends js.Object {
    var topicRuleDestination: js.UndefOr[TopicRuleDestination]
  }

  /**
    * The input for the GetTopicRule operation.
    */
  @js.native
  @Factory
  trait GetTopicRuleRequest extends js.Object {
    var ruleName: RuleName
  }

  /**
    * The output from the GetTopicRule operation.
    */
  @js.native
  @Factory
  trait GetTopicRuleResponse extends js.Object {
    var rule: js.UndefOr[TopicRule]
    var ruleArn: js.UndefOr[RuleArn]
  }

  @js.native
  @Factory
  trait GetV2LoggingOptionsRequest extends js.Object {}

  @js.native
  @Factory
  trait GetV2LoggingOptionsResponse extends js.Object {
    var defaultLogLevel: js.UndefOr[LogLevel]
    var disableAllLogs: js.UndefOr[DisableAllLogs]
    var roleArn: js.UndefOr[AwsArn]
  }

  /**
    * The name and ARN of a group.
    */
  @js.native
  @Factory
  trait GroupNameAndArn extends js.Object {
    var groupArn: js.UndefOr[ThingGroupArn]
    var groupName: js.UndefOr[ThingGroupName]
  }

  /**
    * Send data to an HTTPS endpoint.
    */
  @js.native
  @Factory
  trait HttpAction extends js.Object {
    var url: Url
    var auth: js.UndefOr[HttpAuthorization]
    var confirmationUrl: js.UndefOr[Url]
    var headers: js.UndefOr[HeaderList]
  }

  /**
    * The HTTP action header.
    */
  @js.native
  @Factory
  trait HttpActionHeader extends js.Object {
    var key: HeaderKey
    var value: HeaderValue
  }

  /**
    * The authorization method used to send messages.
    */
  @js.native
  @Factory
  trait HttpAuthorization extends js.Object {
    var sigv4: js.UndefOr[SigV4Authorization]
  }

  /**
    * Specifies the HTTP context to use for the test authorizer request.
    */
  @js.native
  @Factory
  trait HttpContext extends js.Object {
    var headers: js.UndefOr[HttpHeaders]
    var queryString: js.UndefOr[HttpQueryString]
  }

  /**
    * HTTP URL destination configuration used by the topic rule's HTTP action.
    */
  @js.native
  @Factory
  trait HttpUrlDestinationConfiguration extends js.Object {
    var confirmationUrl: Url
  }

  /**
    * HTTP URL destination properties.
    */
  @js.native
  @Factory
  trait HttpUrlDestinationProperties extends js.Object {
    var confirmationUrl: js.UndefOr[Url]
  }

  /**
    * Information about an HTTP URL destination.
    */
  @js.native
  @Factory
  trait HttpUrlDestinationSummary extends js.Object {
    var confirmationUrl: js.UndefOr[Url]
  }

  /**
    * Information that implicitly denies authorization. When policy doesn't explicitly deny or allow an action on a resource it is considered an implicit deny.
    */
  @js.native
  @Factory
  trait ImplicitDeny extends js.Object {
    var policies: js.UndefOr[Policies]
  }

  @js.native
  sealed trait IndexStatus extends js.Any
  object IndexStatus extends js.Object {
    val ACTIVE     = "ACTIVE".asInstanceOf[IndexStatus]
    val BUILDING   = "BUILDING".asInstanceOf[IndexStatus]
    val REBUILDING = "REBUILDING".asInstanceOf[IndexStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, BUILDING, REBUILDING))
  }

  /**
    * Sends message data to an AWS IoT Analytics channel.
    */
  @js.native
  @Factory
  trait IotAnalyticsAction extends js.Object {
    var channelArn: js.UndefOr[AwsArn]
    var channelName: js.UndefOr[ChannelName]
    var roleArn: js.UndefOr[AwsArn]
  }

  /**
    * Sends an input to an AWS IoT Events detector.
    */
  @js.native
  @Factory
  trait IotEventsAction extends js.Object {
    var inputName: InputName
    var roleArn: AwsArn
    var messageId: js.UndefOr[MessageId]
  }

  /**
    * Describes an action to send data from an MQTT message that triggered the rule to AWS IoT SiteWise asset properties.
    */
  @js.native
  @Factory
  trait IotSiteWiseAction extends js.Object {
    var putAssetPropertyValueEntries: PutAssetPropertyValueEntryList
    var roleArn: AwsArn
  }

  /**
    * The <code>Job</code> object contains details about a job.
    */
  @js.native
  @Factory
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
    var presignedUrlConfig: js.UndefOr[PresignedUrlConfig]
    var reasonCode: js.UndefOr[ReasonCode]
    var status: js.UndefOr[JobStatus]
    var targetSelection: js.UndefOr[TargetSelection]
    var targets: js.UndefOr[JobTargets]
    var timeoutConfig: js.UndefOr[TimeoutConfig]
  }

  /**
    * The job execution object represents the execution of a job on a particular device.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait JobExecutionFailureType extends js.Any
  object JobExecutionFailureType extends js.Object {
    val FAILED    = "FAILED".asInstanceOf[JobExecutionFailureType]
    val REJECTED  = "REJECTED".asInstanceOf[JobExecutionFailureType]
    val TIMED_OUT = "TIMED_OUT".asInstanceOf[JobExecutionFailureType]
    val ALL       = "ALL".asInstanceOf[JobExecutionFailureType]

    val values = js.Object.freeze(js.Array(FAILED, REJECTED, TIMED_OUT, ALL))
  }

  @js.native
  sealed trait JobExecutionStatus extends js.Any
  object JobExecutionStatus extends js.Object {
    val QUEUED      = "QUEUED".asInstanceOf[JobExecutionStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobExecutionStatus]
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[JobExecutionStatus]
    val FAILED      = "FAILED".asInstanceOf[JobExecutionStatus]
    val TIMED_OUT   = "TIMED_OUT".asInstanceOf[JobExecutionStatus]
    val REJECTED    = "REJECTED".asInstanceOf[JobExecutionStatus]
    val REMOVED     = "REMOVED".asInstanceOf[JobExecutionStatus]
    val CANCELED    = "CANCELED".asInstanceOf[JobExecutionStatus]

    val values =
      js.Object.freeze(js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED))
  }

  /**
    * Details of the job execution status.
    */
  @js.native
  @Factory
  trait JobExecutionStatusDetails extends js.Object {
    var detailsMap: js.UndefOr[DetailsMap]
  }

  /**
    * The job execution summary.
    */
  @js.native
  @Factory
  trait JobExecutionSummary extends js.Object {
    var executionNumber: js.UndefOr[ExecutionNumber]
    var lastUpdatedAt: js.UndefOr[DateType]
    var queuedAt: js.UndefOr[DateType]
    var startedAt: js.UndefOr[DateType]
    var status: js.UndefOr[JobExecutionStatus]
  }

  /**
    * Contains a summary of information about job executions for a specific job.
    */
  @js.native
  @Factory
  trait JobExecutionSummaryForJob extends js.Object {
    var jobExecutionSummary: js.UndefOr[JobExecutionSummary]
    var thingArn: js.UndefOr[ThingArn]
  }

  /**
    * The job execution summary for a thing.
    */
  @js.native
  @Factory
  trait JobExecutionSummaryForThing extends js.Object {
    var jobExecutionSummary: js.UndefOr[JobExecutionSummary]
    var jobId: js.UndefOr[JobId]
  }

  /**
    * Allows you to create a staged rollout of a job.
    */
  @js.native
  @Factory
  trait JobExecutionsRolloutConfig extends js.Object {
    var exponentialRate: js.UndefOr[ExponentialRolloutRate]
    var maximumPerMinute: js.UndefOr[MaxJobExecutionsPerMin]
  }

  /**
    * The job process details.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus extends js.Object {
    val IN_PROGRESS          = "IN_PROGRESS".asInstanceOf[JobStatus]
    val CANCELED             = "CANCELED".asInstanceOf[JobStatus]
    val COMPLETED            = "COMPLETED".asInstanceOf[JobStatus]
    val DELETION_IN_PROGRESS = "DELETION_IN_PROGRESS".asInstanceOf[JobStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, CANCELED, COMPLETED, DELETION_IN_PROGRESS))
  }

  /**
    * The job summary.
    */
  @js.native
  @Factory
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

  /**
    * Describes a key pair.
    */
  @js.native
  @Factory
  trait KeyPair extends js.Object {
    var PrivateKey: js.UndefOr[PrivateKey]
    var PublicKey: js.UndefOr[PublicKey]
  }

  /**
    * Describes an action to write data to an Amazon Kinesis stream.
    */
  @js.native
  @Factory
  trait KinesisAction extends js.Object {
    var roleArn: AwsArn
    var streamName: StreamName
    var partitionKey: js.UndefOr[PartitionKey]
  }

  /**
    * Describes an action to invoke a Lambda function.
    */
  @js.native
  @Factory
  trait LambdaAction extends js.Object {
    var functionArn: FunctionArn
  }

  @js.native
  @Factory
  trait ListActiveViolationsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[DeviceDefenderThingName]
  }

  @js.native
  @Factory
  trait ListActiveViolationsResponse extends js.Object {
    var activeViolations: js.UndefOr[ActiveViolations]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAttachedPoliciesRequest extends js.Object {
    var target: PolicyTarget
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
    var recursive: js.UndefOr[Recursive]
  }

  @js.native
  @Factory
  trait ListAttachedPoliciesResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var policies: js.UndefOr[Policies]
  }

  @js.native
  @Factory
  trait ListAuditFindingsRequest extends js.Object {
    var checkName: js.UndefOr[AuditCheckName]
    var endTime: js.UndefOr[Timestamp]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var resourceIdentifier: js.UndefOr[ResourceIdentifier]
    var startTime: js.UndefOr[Timestamp]
    var taskId: js.UndefOr[AuditTaskId]
  }

  @js.native
  @Factory
  trait ListAuditFindingsResponse extends js.Object {
    var findings: js.UndefOr[AuditFindings]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAuditMitigationActionsExecutionsRequest extends js.Object {
    var findingId: FindingId
    var taskId: AuditMitigationActionsTaskId
    var actionStatus: js.UndefOr[AuditMitigationActionsExecutionStatus]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAuditMitigationActionsExecutionsResponse extends js.Object {
    var actionsExecutions: js.UndefOr[AuditMitigationActionExecutionMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAuditMitigationActionsTasksRequest extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
    var auditTaskId: js.UndefOr[AuditTaskId]
    var findingId: js.UndefOr[FindingId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus]
  }

  @js.native
  @Factory
  trait ListAuditMitigationActionsTasksResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tasks: js.UndefOr[AuditMitigationActionsTaskMetadataList]
  }

  @js.native
  @Factory
  trait ListAuditTasksRequest extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var taskStatus: js.UndefOr[AuditTaskStatus]
    var taskType: js.UndefOr[AuditTaskType]
  }

  @js.native
  @Factory
  trait ListAuditTasksResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tasks: js.UndefOr[AuditTaskMetadataList]
  }

  @js.native
  @Factory
  trait ListAuthorizersRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
    var status: js.UndefOr[AuthorizerStatus]
  }

  @js.native
  @Factory
  trait ListAuthorizersResponse extends js.Object {
    var authorizers: js.UndefOr[Authorizers]
    var nextMarker: js.UndefOr[Marker]
  }

  @js.native
  @Factory
  trait ListBillingGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[RegistryMaxResults]
    var namePrefixFilter: js.UndefOr[BillingGroupName]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListBillingGroupsResponse extends js.Object {
    var billingGroups: js.UndefOr[BillingGroupNameAndArnList]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Input for the ListCACertificates operation.
    */
  @js.native
  @Factory
  trait ListCACertificatesRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  /**
    * The output from the ListCACertificates operation.
    */
  @js.native
  @Factory
  trait ListCACertificatesResponse extends js.Object {
    var certificates: js.UndefOr[CACertificates]
    var nextMarker: js.UndefOr[Marker]
  }

  /**
    * The input to the ListCertificatesByCA operation.
    */
  @js.native
  @Factory
  trait ListCertificatesByCARequest extends js.Object {
    var caCertificateId: CertificateId
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  /**
    * The output of the ListCertificatesByCA operation.
    */
  @js.native
  @Factory
  trait ListCertificatesByCAResponse extends js.Object {
    var certificates: js.UndefOr[Certificates]
    var nextMarker: js.UndefOr[Marker]
  }

  /**
    * The input for the ListCertificates operation.
    */
  @js.native
  @Factory
  trait ListCertificatesRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  /**
    * The output of the ListCertificates operation.
    */
  @js.native
  @Factory
  trait ListCertificatesResponse extends js.Object {
    var certificates: js.UndefOr[Certificates]
    var nextMarker: js.UndefOr[Marker]
  }

  @js.native
  @Factory
  trait ListDomainConfigurationsRequest extends js.Object {
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
    var serviceType: js.UndefOr[ServiceType]
  }

  @js.native
  @Factory
  trait ListDomainConfigurationsResponse extends js.Object {
    var domainConfigurations: js.UndefOr[DomainConfigurations]
    var nextMarker: js.UndefOr[Marker]
  }

  @js.native
  @Factory
  trait ListIndicesRequest extends js.Object {
    var maxResults: js.UndefOr[QueryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListIndicesResponse extends js.Object {
    var indexNames: js.UndefOr[IndexNamesList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListJobExecutionsForJobRequest extends js.Object {
    var jobId: JobId
    var maxResults: js.UndefOr[LaserMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[JobExecutionStatus]
  }

  @js.native
  @Factory
  trait ListJobExecutionsForJobResponse extends js.Object {
    var executionSummaries: js.UndefOr[JobExecutionSummaryForJobList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListJobExecutionsForThingRequest extends js.Object {
    var thingName: ThingName
    var maxResults: js.UndefOr[LaserMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[JobExecutionStatus]
  }

  @js.native
  @Factory
  trait ListJobExecutionsForThingResponse extends js.Object {
    var executionSummaries: js.UndefOr[JobExecutionSummaryForThingList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListJobsRequest extends js.Object {
    var maxResults: js.UndefOr[LaserMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[JobStatus]
    var targetSelection: js.UndefOr[TargetSelection]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var thingGroupName: js.UndefOr[ThingGroupName]
  }

  @js.native
  @Factory
  trait ListJobsResponse extends js.Object {
    var jobs: js.UndefOr[JobSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListMitigationActionsRequest extends js.Object {
    var actionType: js.UndefOr[MitigationActionType]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListMitigationActionsResponse extends js.Object {
    var actionIdentifiers: js.UndefOr[MitigationActionIdentifierList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListOTAUpdatesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var otaUpdateStatus: js.UndefOr[OTAUpdateStatus]
  }

  @js.native
  @Factory
  trait ListOTAUpdatesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var otaUpdates: js.UndefOr[OTAUpdatesSummary]
  }

  /**
    * The input to the ListOutgoingCertificates operation.
    */
  @js.native
  @Factory
  trait ListOutgoingCertificatesRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  /**
    * The output from the ListOutgoingCertificates operation.
    */
  @js.native
  @Factory
  trait ListOutgoingCertificatesResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var outgoingCertificates: js.UndefOr[OutgoingCertificates]
  }

  /**
    * The input for the ListPolicies operation.
    */
  @js.native
  @Factory
  trait ListPoliciesRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  /**
    * The output from the ListPolicies operation.
    */
  @js.native
  @Factory
  trait ListPoliciesResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var policies: js.UndefOr[Policies]
  }

  /**
    * The input for the ListPolicyPrincipals operation.
    */
  @js.native
  @Factory
  trait ListPolicyPrincipalsRequest extends js.Object {
    var policyName: PolicyName
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  /**
    * The output from the ListPolicyPrincipals operation.
    */
  @js.native
  @Factory
  trait ListPolicyPrincipalsResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var principals: js.UndefOr[Principals]
  }

  /**
    * The input for the ListPolicyVersions operation.
    */
  @js.native
  @Factory
  trait ListPolicyVersionsRequest extends js.Object {
    var policyName: PolicyName
  }

  /**
    * The output from the ListPolicyVersions operation.
    */
  @js.native
  @Factory
  trait ListPolicyVersionsResponse extends js.Object {
    var policyVersions: js.UndefOr[PolicyVersions]
  }

  /**
    * The input for the ListPrincipalPolicies operation.
    */
  @js.native
  @Factory
  trait ListPrincipalPoliciesRequest extends js.Object {
    var principal: Principal
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  /**
    * The output from the ListPrincipalPolicies operation.
    */
  @js.native
  @Factory
  trait ListPrincipalPoliciesResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var policies: js.UndefOr[Policies]
  }

  /**
    * The input for the ListPrincipalThings operation.
    */
  @js.native
  @Factory
  trait ListPrincipalThingsRequest extends js.Object {
    var principal: Principal
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * The output from the ListPrincipalThings operation.
    */
  @js.native
  @Factory
  trait ListPrincipalThingsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[ThingNameList]
  }

  @js.native
  @Factory
  trait ListProvisioningTemplateVersionsRequest extends js.Object {
    var templateName: TemplateName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListProvisioningTemplateVersionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var versions: js.UndefOr[ProvisioningTemplateVersionListing]
  }

  @js.native
  @Factory
  trait ListProvisioningTemplatesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListProvisioningTemplatesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var templates: js.UndefOr[ProvisioningTemplateListing]
  }

  @js.native
  @Factory
  trait ListRoleAliasesRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  @js.native
  @Factory
  trait ListRoleAliasesResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var roleAliases: js.UndefOr[RoleAliases]
  }

  @js.native
  @Factory
  trait ListScheduledAuditsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListScheduledAuditsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var scheduledAudits: js.UndefOr[ScheduledAuditMetadataList]
  }

  @js.native
  @Factory
  trait ListSecurityProfilesForTargetRequest extends js.Object {
    var securityProfileTargetArn: SecurityProfileTargetArn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var recursive: js.UndefOr[Recursive]
  }

  @js.native
  @Factory
  trait ListSecurityProfilesForTargetResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings]
  }

  @js.native
  @Factory
  trait ListSecurityProfilesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSecurityProfilesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var securityProfileIdentifiers: js.UndefOr[SecurityProfileIdentifiers]
  }

  @js.native
  @Factory
  trait ListStreamsRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListStreamsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var streams: js.UndefOr[StreamsSummary]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListTargetsForPolicyRequest extends js.Object {
    var policyName: PolicyName
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  @js.native
  @Factory
  trait ListTargetsForPolicyResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var targets: js.UndefOr[PolicyTargets]
  }

  @js.native
  @Factory
  trait ListTargetsForSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTargetsForSecurityProfileResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var securityProfileTargets: js.UndefOr[SecurityProfileTargets]
  }

  @js.native
  @Factory
  trait ListThingGroupsForThingRequest extends js.Object {
    var thingName: ThingName
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListThingGroupsForThingResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var thingGroups: js.UndefOr[ThingGroupNameAndArnList]
  }

  @js.native
  @Factory
  trait ListThingGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[RegistryMaxResults]
    var namePrefixFilter: js.UndefOr[ThingGroupName]
    var nextToken: js.UndefOr[NextToken]
    var parentGroup: js.UndefOr[ThingGroupName]
    var recursive: js.UndefOr[RecursiveWithoutDefault]
  }

  @js.native
  @Factory
  trait ListThingGroupsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var thingGroups: js.UndefOr[ThingGroupNameAndArnList]
  }

  /**
    * The input for the ListThingPrincipal operation.
    */
  @js.native
  @Factory
  trait ListThingPrincipalsRequest extends js.Object {
    var thingName: ThingName
  }

  /**
    * The output from the ListThingPrincipals operation.
    */
  @js.native
  @Factory
  trait ListThingPrincipalsResponse extends js.Object {
    var principals: js.UndefOr[Principals]
  }

  @js.native
  @Factory
  trait ListThingRegistrationTaskReportsRequest extends js.Object {
    var reportType: ReportType
    var taskId: TaskId
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListThingRegistrationTaskReportsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var reportType: js.UndefOr[ReportType]
    var resourceLinks: js.UndefOr[S3FileUrlList]
  }

  @js.native
  @Factory
  trait ListThingRegistrationTasksRequest extends js.Object {
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[Status]
  }

  @js.native
  @Factory
  trait ListThingRegistrationTasksResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var taskIds: js.UndefOr[TaskIdList]
  }

  /**
    * The input for the ListThingTypes operation.
    */
  @js.native
  @Factory
  trait ListThingTypesRequest extends js.Object {
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  /**
    * The output for the ListThingTypes operation.
    */
  @js.native
  @Factory
  trait ListThingTypesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var thingTypes: js.UndefOr[ThingTypeList]
  }

  @js.native
  @Factory
  trait ListThingsInBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListThingsInBillingGroupResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[ThingNameList]
  }

  @js.native
  @Factory
  trait ListThingsInThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var recursive: js.UndefOr[Recursive]
  }

  @js.native
  @Factory
  trait ListThingsInThingGroupResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[ThingNameList]
  }

  /**
    * The input for the ListThings operation.
    */
  @js.native
  @Factory
  trait ListThingsRequest extends js.Object {
    var attributeName: js.UndefOr[AttributeName]
    var attributeValue: js.UndefOr[AttributeValue]
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  /**
    * The output from the ListThings operation.
    */
  @js.native
  @Factory
  trait ListThingsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[ThingAttributeList]
  }

  @js.native
  @Factory
  trait ListTopicRuleDestinationsRequest extends js.Object {
    var maxResults: js.UndefOr[TopicRuleDestinationMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTopicRuleDestinationsResponse extends js.Object {
    var destinationSummaries: js.UndefOr[TopicRuleDestinationSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * The input for the ListTopicRules operation.
    */
  @js.native
  @Factory
  trait ListTopicRulesRequest extends js.Object {
    var maxResults: js.UndefOr[TopicRuleMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var ruleDisabled: js.UndefOr[IsDisabled]
    var topic: js.UndefOr[Topic]
  }

  /**
    * The output from the ListTopicRules operation.
    */
  @js.native
  @Factory
  trait ListTopicRulesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var rules: js.UndefOr[TopicRuleList]
  }

  @js.native
  @Factory
  trait ListV2LoggingLevelsRequest extends js.Object {
    var maxResults: js.UndefOr[SkyfallMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var targetType: js.UndefOr[LogTargetType]
  }

  @js.native
  @Factory
  trait ListV2LoggingLevelsResponse extends js.Object {
    var logTargetConfigurations: js.UndefOr[LogTargetConfigurations]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListViolationEventsRequest extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[DeviceDefenderThingName]
  }

  @js.native
  @Factory
  trait ListViolationEventsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var violationEvents: js.UndefOr[ViolationEvents]
  }

  @js.native
  sealed trait LogLevel extends js.Any
  object LogLevel extends js.Object {
    val DEBUG    = "DEBUG".asInstanceOf[LogLevel]
    val INFO     = "INFO".asInstanceOf[LogLevel]
    val ERROR    = "ERROR".asInstanceOf[LogLevel]
    val WARN     = "WARN".asInstanceOf[LogLevel]
    val DISABLED = "DISABLED".asInstanceOf[LogLevel]

    val values = js.Object.freeze(js.Array(DEBUG, INFO, ERROR, WARN, DISABLED))
  }

  /**
    * A log target.
    */
  @js.native
  @Factory
  trait LogTarget extends js.Object {
    var targetType: LogTargetType
    var targetName: js.UndefOr[LogTargetName]
  }

  /**
    * The target configuration.
    */
  @js.native
  @Factory
  trait LogTargetConfiguration extends js.Object {
    var logLevel: js.UndefOr[LogLevel]
    var logTarget: js.UndefOr[LogTarget]
  }

  @js.native
  sealed trait LogTargetType extends js.Any
  object LogTargetType extends js.Object {
    val DEFAULT     = "DEFAULT".asInstanceOf[LogTargetType]
    val THING_GROUP = "THING_GROUP".asInstanceOf[LogTargetType]

    val values = js.Object.freeze(js.Array(DEFAULT, THING_GROUP))
  }

  /**
    * Describes the logging options payload.
    */
  @js.native
  @Factory
  trait LoggingOptionsPayload extends js.Object {
    var roleArn: AwsArn
    var logLevel: js.UndefOr[LogLevel]
  }

  @js.native
  sealed trait MessageFormat extends js.Any
  object MessageFormat extends js.Object {
    val RAW  = "RAW".asInstanceOf[MessageFormat]
    val JSON = "JSON".asInstanceOf[MessageFormat]

    val values = js.Object.freeze(js.Array(RAW, JSON))
  }

  /**
    * The value to be compared with the <code>metric</code>.
    */
  @js.native
  @Factory
  trait MetricValue extends js.Object {
    var cidrs: js.UndefOr[Cidrs]
    var count: js.UndefOr[UnsignedLong]
    var ports: js.UndefOr[Ports]
  }

  /**
    * Describes which changes should be applied as part of a mitigation action.
    */
  @js.native
  @Factory
  trait MitigationAction extends js.Object {
    var actionParams: js.UndefOr[MitigationActionParams]
    var id: js.UndefOr[MitigationActionId]
    var name: js.UndefOr[MitigationActionName]
    var roleArn: js.UndefOr[RoleArn]
  }

  /**
    * Information that identifies a mitigation action. This information is returned by ListMitigationActions.
    */
  @js.native
  @Factory
  trait MitigationActionIdentifier extends js.Object {
    var actionArn: js.UndefOr[MitigationActionArn]
    var actionName: js.UndefOr[MitigationActionName]
    var creationDate: js.UndefOr[Timestamp]
  }

  /**
    * The set of parameters for this mitigation action. You can specify only one type of parameter (in other words, you can apply only one action for each defined mitigation action).
    */
  @js.native
  @Factory
  trait MitigationActionParams extends js.Object {
    var addThingsToThingGroupParams: js.UndefOr[AddThingsToThingGroupParams]
    var enableIoTLoggingParams: js.UndefOr[EnableIoTLoggingParams]
    var publishFindingToSnsParams: js.UndefOr[PublishFindingToSnsParams]
    var replaceDefaultPolicyVersionParams: js.UndefOr[ReplaceDefaultPolicyVersionParams]
    var updateCACertificateParams: js.UndefOr[UpdateCACertificateParams]
    var updateDeviceCertificateParams: js.UndefOr[UpdateDeviceCertificateParams]
  }

  @js.native
  sealed trait MitigationActionType extends js.Any
  object MitigationActionType extends js.Object {
    val UPDATE_DEVICE_CERTIFICATE      = "UPDATE_DEVICE_CERTIFICATE".asInstanceOf[MitigationActionType]
    val UPDATE_CA_CERTIFICATE          = "UPDATE_CA_CERTIFICATE".asInstanceOf[MitigationActionType]
    val ADD_THINGS_TO_THING_GROUP      = "ADD_THINGS_TO_THING_GROUP".asInstanceOf[MitigationActionType]
    val REPLACE_DEFAULT_POLICY_VERSION = "REPLACE_DEFAULT_POLICY_VERSION".asInstanceOf[MitigationActionType]
    val ENABLE_IOT_LOGGING             = "ENABLE_IOT_LOGGING".asInstanceOf[MitigationActionType]
    val PUBLISH_FINDING_TO_SNS         = "PUBLISH_FINDING_TO_SNS".asInstanceOf[MitigationActionType]

    val values = js.Object.freeze(
      js.Array(
        UPDATE_DEVICE_CERTIFICATE,
        UPDATE_CA_CERTIFICATE,
        ADD_THINGS_TO_THING_GROUP,
        REPLACE_DEFAULT_POLICY_VERSION,
        ENABLE_IOT_LOGGING,
        PUBLISH_FINDING_TO_SNS
      )
    )
  }

  /**
    * Specifies the MQTT context to use for the test authorizer request
    */
  @js.native
  @Factory
  trait MqttContext extends js.Object {
    var clientId: js.UndefOr[MqttClientId]
    var password: js.UndefOr[MqttPassword]
    var username: js.UndefOr[MqttUsername]
  }

  /**
    * Information about the resource that was noncompliant with the audit check.
    */
  @js.native
  @Factory
  trait NonCompliantResource extends js.Object {
    var additionalInfo: js.UndefOr[StringMap]
    var resourceIdentifier: js.UndefOr[ResourceIdentifier]
    var resourceType: js.UndefOr[ResourceType]
  }

  /**
    * Describes a file to be associated with an OTA update.
    */
  @js.native
  @Factory
  trait OTAUpdateFile extends js.Object {
    var attributes: js.UndefOr[AttributesMap]
    var codeSigning: js.UndefOr[CodeSigning]
    var fileLocation: js.UndefOr[FileLocation]
    var fileName: js.UndefOr[FileName]
    var fileVersion: js.UndefOr[OTAUpdateFileVersion]
  }

  /**
    * Information about an OTA update.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait OTAUpdateStatus extends js.Any
  object OTAUpdateStatus extends js.Object {
    val CREATE_PENDING     = "CREATE_PENDING".asInstanceOf[OTAUpdateStatus]
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[OTAUpdateStatus]
    val CREATE_COMPLETE    = "CREATE_COMPLETE".asInstanceOf[OTAUpdateStatus]
    val CREATE_FAILED      = "CREATE_FAILED".asInstanceOf[OTAUpdateStatus]

    val values = js.Object.freeze(js.Array(CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED))
  }

  /**
    * An OTA update summary.
    */
  @js.native
  @Factory
  trait OTAUpdateSummary extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var otaUpdateArn: js.UndefOr[OTAUpdateArn]
    var otaUpdateId: js.UndefOr[OTAUpdateId]
  }

  /**
    * A certificate that has been transferred but not yet accepted.
    */
  @js.native
  @Factory
  trait OutgoingCertificate extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var creationDate: js.UndefOr[DateType]
    var transferDate: js.UndefOr[DateType]
    var transferMessage: js.UndefOr[Message]
    var transferredTo: js.UndefOr[AwsAccountId]
  }

  /**
    * Describes the percentile and percentile value.
    */
  @js.native
  @Factory
  trait PercentPair extends js.Object {
    var percent: js.UndefOr[Percent]
    var value: js.UndefOr[PercentValue]
  }

  /**
    * Describes an AWS IoT policy.
    */
  @js.native
  @Factory
  trait Policy extends js.Object {
    var policyArn: js.UndefOr[PolicyArn]
    var policyName: js.UndefOr[PolicyName]
  }

  @js.native
  sealed trait PolicyTemplateName extends js.Any
  object PolicyTemplateName extends js.Object {
    val BLANK_POLICY = "BLANK_POLICY".asInstanceOf[PolicyTemplateName]

    val values = js.Object.freeze(js.Array(BLANK_POLICY))
  }

  /**
    * Describes a policy version.
    */
  @js.native
  @Factory
  trait PolicyVersion extends js.Object {
    var createDate: js.UndefOr[DateType]
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var versionId: js.UndefOr[PolicyVersionId]
  }

  /**
    * Information about the version of the policy associated with the resource.
    */
  @js.native
  @Factory
  trait PolicyVersionIdentifier extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyVersionId: js.UndefOr[PolicyVersionId]
  }

  /**
    * Configuration for pre-signed S3 URLs.
    */
  @js.native
  @Factory
  trait PresignedUrlConfig extends js.Object {
    var expiresInSec: js.UndefOr[ExpiresInSec]
    var roleArn: js.UndefOr[RoleArn]
  }

  @js.native
  sealed trait Protocol extends js.Any
  object Protocol extends js.Object {
    val MQTT = "MQTT".asInstanceOf[Protocol]
    val HTTP = "HTTP".asInstanceOf[Protocol]

    val values = js.Object.freeze(js.Array(MQTT, HTTP))
  }

  /**
    * A summary of information about a fleet provisioning template.
    */
  @js.native
  @Factory
  trait ProvisioningTemplateSummary extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var description: js.UndefOr[TemplateDescription]
    var enabled: js.UndefOr[Enabled]
    var lastModifiedDate: js.UndefOr[DateType]
    var templateArn: js.UndefOr[TemplateArn]
    var templateName: js.UndefOr[TemplateName]
  }

  /**
    * A summary of information about a fleet provision template version.
    */
  @js.native
  @Factory
  trait ProvisioningTemplateVersionSummary extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var isDefaultVersion: js.UndefOr[IsDefaultVersion]
    var versionId: js.UndefOr[TemplateVersionId]
  }

  /**
    * Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom actions in response to the Amazon SNS messages.
    */
  @js.native
  @Factory
  trait PublishFindingToSnsParams extends js.Object {
    var topicArn: SnsTopicArn
  }

  /**
    * An asset property value entry containing the following information.
    */
  @js.native
  @Factory
  trait PutAssetPropertyValueEntry extends js.Object {
    var propertyValues: AssetPropertyValueList
    var assetId: js.UndefOr[AssetId]
    var entryId: js.UndefOr[AssetPropertyEntryId]
    var propertyAlias: js.UndefOr[AssetPropertyAlias]
    var propertyId: js.UndefOr[AssetPropertyId]
  }

  /**
    * The input for the DynamoActionVS action that specifies the DynamoDB table to which the message data will be written.
    */
  @js.native
  @Factory
  trait PutItemInput extends js.Object {
    var tableName: TableName
  }

  /**
    * Allows you to define a criteria to initiate the increase in rate of rollout for a job.
    */
  @js.native
  @Factory
  trait RateIncreaseCriteria extends js.Object {
    var numberOfNotifiedThings: js.UndefOr[NumberOfThings]
    var numberOfSucceededThings: js.UndefOr[NumberOfThings]
  }

  /**
    * The input to the RegisterCACertificate operation.
    */
  @js.native
  @Factory
  trait RegisterCACertificateRequest extends js.Object {
    var caCertificate: CertificatePem
    var verificationCertificate: CertificatePem
    var allowAutoRegistration: js.UndefOr[AllowAutoRegistration]
    var registrationConfig: js.UndefOr[RegistrationConfig]
    var setAsActive: js.UndefOr[SetAsActive]
  }

  /**
    * The output from the RegisterCACertificateResponse operation.
    */
  @js.native
  @Factory
  trait RegisterCACertificateResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
  }

  /**
    * The input to the RegisterCertificate operation.
    */
  @js.native
  @Factory
  trait RegisterCertificateRequest extends js.Object {
    var certificatePem: CertificatePem
    var caCertificatePem: js.UndefOr[CertificatePem]
    var setAsActive: js.UndefOr[SetAsActiveFlag]
    var status: js.UndefOr[CertificateStatus]
  }

  /**
    * The output from the RegisterCertificate operation.
    */
  @js.native
  @Factory
  trait RegisterCertificateResponse extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
  }

  @js.native
  @Factory
  trait RegisterThingRequest extends js.Object {
    var templateBody: TemplateBody
    var parameters: js.UndefOr[Parameters]
  }

  @js.native
  @Factory
  trait RegisterThingResponse extends js.Object {
    var certificatePem: js.UndefOr[CertificatePem]
    var resourceArns: js.UndefOr[ResourceArns]
  }

  /**
    * The registration configuration.
    */
  @js.native
  @Factory
  trait RegistrationConfig extends js.Object {
    var roleArn: js.UndefOr[RoleArn]
    var templateBody: js.UndefOr[TemplateBody]
  }

  /**
    * The input for the RejectCertificateTransfer operation.
    */
  @js.native
  @Factory
  trait RejectCertificateTransferRequest extends js.Object {
    var certificateId: CertificateId
    var rejectReason: js.UndefOr[Message]
  }

  /**
    * Information about a related resource.
    */
  @js.native
  @Factory
  trait RelatedResource extends js.Object {
    var additionalInfo: js.UndefOr[StringMap]
    var resourceIdentifier: js.UndefOr[ResourceIdentifier]
    var resourceType: js.UndefOr[ResourceType]
  }

  @js.native
  @Factory
  trait RemoveThingFromBillingGroupRequest extends js.Object {
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var billingGroupName: js.UndefOr[BillingGroupName]
    var thingArn: js.UndefOr[ThingArn]
    var thingName: js.UndefOr[ThingName]
  }

  @js.native
  @Factory
  trait RemoveThingFromBillingGroupResponse extends js.Object {}

  @js.native
  @Factory
  trait RemoveThingFromThingGroupRequest extends js.Object {
    var thingArn: js.UndefOr[ThingArn]
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingGroupName: js.UndefOr[ThingGroupName]
    var thingName: js.UndefOr[ThingName]
  }

  @js.native
  @Factory
  trait RemoveThingFromThingGroupResponse extends js.Object {}

  /**
    * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
    */
  @js.native
  @Factory
  trait ReplaceDefaultPolicyVersionParams extends js.Object {
    var templateName: PolicyTemplateName
  }

  /**
    * The input for the ReplaceTopicRule operation.
    */
  @js.native
  @Factory
  trait ReplaceTopicRuleRequest extends js.Object {
    var ruleName: RuleName
    var topicRulePayload: TopicRulePayload
  }

  @js.native
  sealed trait ReportType extends js.Any
  object ReportType extends js.Object {
    val ERRORS  = "ERRORS".asInstanceOf[ReportType]
    val RESULTS = "RESULTS".asInstanceOf[ReportType]

    val values = js.Object.freeze(js.Array(ERRORS, RESULTS))
  }

  /**
    * Describes an action to republish to another topic.
    */
  @js.native
  @Factory
  trait RepublishAction extends js.Object {
    var roleArn: AwsArn
    var topic: TopicPattern
    var qos: js.UndefOr[Qos]
  }

  /**
    * Information that identifies the noncompliant resource.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val DEVICE_CERTIFICATE    = "DEVICE_CERTIFICATE".asInstanceOf[ResourceType]
    val CA_CERTIFICATE        = "CA_CERTIFICATE".asInstanceOf[ResourceType]
    val IOT_POLICY            = "IOT_POLICY".asInstanceOf[ResourceType]
    val COGNITO_IDENTITY_POOL = "COGNITO_IDENTITY_POOL".asInstanceOf[ResourceType]
    val CLIENT_ID             = "CLIENT_ID".asInstanceOf[ResourceType]
    val ACCOUNT_SETTINGS      = "ACCOUNT_SETTINGS".asInstanceOf[ResourceType]
    val ROLE_ALIAS            = "ROLE_ALIAS".asInstanceOf[ResourceType]
    val IAM_ROLE              = "IAM_ROLE".asInstanceOf[ResourceType]

    val values = js.Object.freeze(
      js.Array(
        DEVICE_CERTIFICATE,
        CA_CERTIFICATE,
        IOT_POLICY,
        COGNITO_IDENTITY_POOL,
        CLIENT_ID,
        ACCOUNT_SETTINGS,
        ROLE_ALIAS,
        IAM_ROLE
      )
    )
  }

  /**
    * Role alias description.
    */
  @js.native
  @Factory
  trait RoleAliasDescription extends js.Object {
    var creationDate: js.UndefOr[DateType]
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds]
    var lastModifiedDate: js.UndefOr[DateType]
    var owner: js.UndefOr[AwsAccountId]
    var roleAlias: js.UndefOr[RoleAlias]
    var roleAliasArn: js.UndefOr[RoleAliasArn]
    var roleArn: js.UndefOr[RoleArn]
  }

  /**
    * Describes an action to write data to an Amazon S3 bucket.
    */
  @js.native
  @Factory
  trait S3Action extends js.Object {
    var bucketName: BucketName
    var key: Key
    var roleArn: AwsArn
    var cannedAcl: js.UndefOr[CannedAccessControlList]
  }

  /**
    * Describes the location of updated firmware in S3.
    */
  @js.native
  @Factory
  trait S3Destination extends js.Object {
    var bucket: js.UndefOr[S3Bucket]
    var prefix: js.UndefOr[Prefix]
  }

  /**
    * The S3 location.
    */
  @js.native
  @Factory
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[S3Bucket]
    var key: js.UndefOr[S3Key]
    var version: js.UndefOr[S3Version]
  }

  /**
    * Describes an action to write a message to a Salesforce IoT Cloud Input Stream.
    */
  @js.native
  @Factory
  trait SalesforceAction extends js.Object {
    var token: SalesforceToken
    var url: SalesforceEndpoint
  }

  /**
    * Information about the scheduled audit.
    */
  @js.native
  @Factory
  trait ScheduledAuditMetadata extends js.Object {
    var dayOfMonth: js.UndefOr[DayOfMonth]
    var dayOfWeek: js.UndefOr[DayOfWeek]
    var frequency: js.UndefOr[AuditFrequency]
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
    var scheduledAuditName: js.UndefOr[ScheduledAuditName]
  }

  @js.native
  @Factory
  trait SearchIndexRequest extends js.Object {
    var queryString: QueryString
    var indexName: js.UndefOr[IndexName]
    var maxResults: js.UndefOr[QueryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  @js.native
  @Factory
  trait SearchIndexResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var thingGroups: js.UndefOr[ThingGroupDocumentList]
    var things: js.UndefOr[ThingDocumentList]
  }

  /**
    * Identifying information for a Device Defender security profile.
    */
  @js.native
  @Factory
  trait SecurityProfileIdentifier extends js.Object {
    var arn: SecurityProfileArn
    var name: SecurityProfileName
  }

  /**
    * A target to which an alert is sent when a security profile behavior is violated.
    */
  @js.native
  @Factory
  trait SecurityProfileTarget extends js.Object {
    var arn: SecurityProfileTargetArn
  }

  /**
    * Information about a security profile and the target associated with it.
    */
  @js.native
  @Factory
  trait SecurityProfileTargetMapping extends js.Object {
    var securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier]
    var target: js.UndefOr[SecurityProfileTarget]
  }

  @js.native
  sealed trait ServerCertificateStatus extends js.Any
  object ServerCertificateStatus extends js.Object {
    val INVALID = "INVALID".asInstanceOf[ServerCertificateStatus]
    val VALID   = "VALID".asInstanceOf[ServerCertificateStatus]

    val values = js.Object.freeze(js.Array(INVALID, VALID))
  }

  /**
    * An object that contains information about a server certificate.
    */
  @js.native
  @Factory
  trait ServerCertificateSummary extends js.Object {
    var serverCertificateArn: js.UndefOr[AcmCertificateArn]
    var serverCertificateStatus: js.UndefOr[ServerCertificateStatus]
    var serverCertificateStatusDetail: js.UndefOr[ServerCertificateStatusDetail]
  }

  @js.native
  sealed trait ServiceType extends js.Any
  object ServiceType extends js.Object {
    val DATA                = "DATA".asInstanceOf[ServiceType]
    val CREDENTIAL_PROVIDER = "CREDENTIAL_PROVIDER".asInstanceOf[ServiceType]
    val JOBS                = "JOBS".asInstanceOf[ServiceType]

    val values = js.Object.freeze(js.Array(DATA, CREDENTIAL_PROVIDER, JOBS))
  }

  @js.native
  @Factory
  trait SetDefaultAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
  }

  @js.native
  @Factory
  trait SetDefaultAuthorizerResponse extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  /**
    * The input for the SetDefaultPolicyVersion operation.
    */
  @js.native
  @Factory
  trait SetDefaultPolicyVersionRequest extends js.Object {
    var policyName: PolicyName
    var policyVersionId: PolicyVersionId
  }

  /**
    * The input for the SetLoggingOptions operation.
    */
  @js.native
  @Factory
  trait SetLoggingOptionsRequest extends js.Object {
    var loggingOptionsPayload: LoggingOptionsPayload
  }

  @js.native
  @Factory
  trait SetV2LoggingLevelRequest extends js.Object {
    var logLevel: LogLevel
    var logTarget: LogTarget
  }

  @js.native
  @Factory
  trait SetV2LoggingOptionsRequest extends js.Object {
    var defaultLogLevel: js.UndefOr[LogLevel]
    var disableAllLogs: js.UndefOr[DisableAllLogs]
    var roleArn: js.UndefOr[AwsArn]
  }

  /**
    * Use Sig V4 authorization.
    */
  @js.native
  @Factory
  trait SigV4Authorization extends js.Object {
    var roleArn: AwsArn
    var serviceName: ServiceName
    var signingRegion: SigningRegion
  }

  /**
    * Describes the code-signing profile.
    */
  @js.native
  @Factory
  trait SigningProfileParameter extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificatePathOnDevice: js.UndefOr[CertificatePathOnDevice]
    var platform: js.UndefOr[Platform]
  }

  /**
    * Describes an action to publish to an Amazon SNS topic.
    */
  @js.native
  @Factory
  trait SnsAction extends js.Object {
    var roleArn: AwsArn
    var targetArn: AwsArn
    var messageFormat: js.UndefOr[MessageFormat]
  }

  /**
    * Describes an action to publish data to an Amazon SQS queue.
    */
  @js.native
  @Factory
  trait SqsAction extends js.Object {
    var queueUrl: QueueUrl
    var roleArn: AwsArn
    var useBase64: js.UndefOr[UseBase64]
  }

  @js.native
  @Factory
  trait StartAuditMitigationActionsTaskRequest extends js.Object {
    var auditCheckToActionsMapping: AuditCheckToActionsMapping
    var clientRequestToken: ClientRequestToken
    var target: AuditMitigationActionsTaskTarget
    var taskId: AuditMitigationActionsTaskId
  }

  @js.native
  @Factory
  trait StartAuditMitigationActionsTaskResponse extends js.Object {
    var taskId: js.UndefOr[AuditMitigationActionsTaskId]
  }

  @js.native
  @Factory
  trait StartOnDemandAuditTaskRequest extends js.Object {
    var targetCheckNames: TargetAuditCheckNames
  }

  @js.native
  @Factory
  trait StartOnDemandAuditTaskResponse extends js.Object {
    var taskId: js.UndefOr[AuditTaskId]
  }

  /**
    * Information required to start a signing job.
    */
  @js.native
  @Factory
  trait StartSigningJobParameter extends js.Object {
    var destination: js.UndefOr[Destination]
    var signingProfileName: js.UndefOr[SigningProfileName]
    var signingProfileParameter: js.UndefOr[SigningProfileParameter]
  }

  @js.native
  @Factory
  trait StartThingRegistrationTaskRequest extends js.Object {
    var inputFileBucket: RegistryS3BucketName
    var inputFileKey: RegistryS3KeyName
    var roleArn: RoleArn
    var templateBody: TemplateBody
  }

  @js.native
  @Factory
  trait StartThingRegistrationTaskResponse extends js.Object {
    var taskId: js.UndefOr[TaskId]
  }

  /**
    * A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to be in compliance or in violation of the behavior.
    */
  @js.native
  @Factory
  trait StatisticalThreshold extends js.Object {
    var statistic: js.UndefOr[EvaluationStatistic]
  }

  /**
    * A map of key-value pairs for all supported statistics. Currently, only count is supported.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val InProgress = "InProgress".asInstanceOf[Status]
    val Completed  = "Completed".asInstanceOf[Status]
    val Failed     = "Failed".asInstanceOf[Status]
    val Cancelled  = "Cancelled".asInstanceOf[Status]
    val Cancelling = "Cancelling".asInstanceOf[Status]

    val values = js.Object.freeze(js.Array(InProgress, Completed, Failed, Cancelled, Cancelling))
  }

  /**
    * Starts execution of a Step Functions state machine.
    */
  @js.native
  @Factory
  trait StepFunctionsAction extends js.Object {
    var roleArn: AwsArn
    var stateMachineName: StateMachineName
    var executionNamePrefix: js.UndefOr[ExecutionNamePrefix]
  }

  @js.native
  @Factory
  trait StopThingRegistrationTaskRequest extends js.Object {
    var taskId: TaskId
  }

  @js.native
  @Factory
  trait StopThingRegistrationTaskResponse extends js.Object {}

  /**
    * Describes a group of files that can be streamed.
    */
  @js.native
  @Factory
  trait Stream extends js.Object {
    var fileId: js.UndefOr[FileId]
    var streamId: js.UndefOr[StreamId]
  }

  /**
    * Represents a file to stream.
    */
  @js.native
  @Factory
  trait StreamFile extends js.Object {
    var fileId: js.UndefOr[FileId]
    var s3Location: js.UndefOr[S3Location]
  }

  /**
    * Information about a stream.
    */
  @js.native
  @Factory
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

  /**
    * A summary of a stream.
    */
  @js.native
  @Factory
  trait StreamSummary extends js.Object {
    var description: js.UndefOr[StreamDescription]
    var streamArn: js.UndefOr[StreamArn]
    var streamId: js.UndefOr[StreamId]
    var streamVersion: js.UndefOr[StreamVersion]
  }

  /**
    * A set of key/value pairs that are used to manage the resource.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  sealed trait TargetSelection extends js.Any
  object TargetSelection extends js.Object {
    val CONTINUOUS = "CONTINUOUS".asInstanceOf[TargetSelection]
    val SNAPSHOT   = "SNAPSHOT".asInstanceOf[TargetSelection]

    val values = js.Object.freeze(js.Array(CONTINUOUS, SNAPSHOT))
  }

  /**
    * Statistics for the checks performed during the audit.
    */
  @js.native
  @Factory
  trait TaskStatistics extends js.Object {
    var canceledChecks: js.UndefOr[CanceledChecksCount]
    var compliantChecks: js.UndefOr[CompliantChecksCount]
    var failedChecks: js.UndefOr[FailedChecksCount]
    var inProgressChecks: js.UndefOr[InProgressChecksCount]
    var nonCompliantChecks: js.UndefOr[NonCompliantChecksCount]
    var totalChecks: js.UndefOr[TotalChecksCount]
    var waitingForDataCollectionChecks: js.UndefOr[WaitingForDataCollectionChecksCount]
  }

  /**
    * Provides summary counts of how many tasks for findings are in a particular state. This information is included in the response from DescribeAuditMitigationActionsTask.
    */
  @js.native
  @Factory
  trait TaskStatisticsForAuditCheck extends js.Object {
    var canceledFindingsCount: js.UndefOr[CanceledFindingsCount]
    var failedFindingsCount: js.UndefOr[FailedFindingsCount]
    var skippedFindingsCount: js.UndefOr[SkippedFindingsCount]
    var succeededFindingsCount: js.UndefOr[SucceededFindingsCount]
    var totalFindingsCount: js.UndefOr[TotalFindingsCount]
  }

  @js.native
  @Factory
  trait TestAuthorizationRequest extends js.Object {
    var authInfos: AuthInfos
    var clientId: js.UndefOr[ClientId]
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId]
    var policyNamesToAdd: js.UndefOr[PolicyNames]
    var policyNamesToSkip: js.UndefOr[PolicyNames]
    var principal: js.UndefOr[Principal]
  }

  @js.native
  @Factory
  trait TestAuthorizationResponse extends js.Object {
    var authResults: js.UndefOr[AuthResults]
  }

  @js.native
  @Factory
  trait TestInvokeAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
    var httpContext: js.UndefOr[HttpContext]
    var mqttContext: js.UndefOr[MqttContext]
    var tlsContext: js.UndefOr[TlsContext]
    var token: js.UndefOr[Token]
    var tokenSignature: js.UndefOr[TokenSignature]
  }

  @js.native
  @Factory
  trait TestInvokeAuthorizerResponse extends js.Object {
    var disconnectAfterInSeconds: js.UndefOr[Seconds]
    var isAuthenticated: js.UndefOr[IsAuthenticated]
    var policyDocuments: js.UndefOr[PolicyDocuments]
    var principalId: js.UndefOr[PrincipalId]
    var refreshAfterInSeconds: js.UndefOr[Seconds]
  }

  /**
    * The properties of the thing, including thing name, thing type name, and a list of thing attributes.
    */
  @js.native
  @Factory
  trait ThingAttribute extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var thingArn: js.UndefOr[ThingArn]
    var thingName: js.UndefOr[ThingName]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var version: js.UndefOr[Version]
  }

  /**
    * The connectivity status of the thing.
    */
  @js.native
  @Factory
  trait ThingConnectivity extends js.Object {
    var connected: js.UndefOr[Boolean]
    var timestamp: js.UndefOr[ConnectivityTimestamp]
  }

  @js.native
  sealed trait ThingConnectivityIndexingMode extends js.Any
  object ThingConnectivityIndexingMode extends js.Object {
    val OFF    = "OFF".asInstanceOf[ThingConnectivityIndexingMode]
    val STATUS = "STATUS".asInstanceOf[ThingConnectivityIndexingMode]

    val values = js.Object.freeze(js.Array(OFF, STATUS))
  }

  /**
    * The thing search index document.
    */
  @js.native
  @Factory
  trait ThingDocument extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var connectivity: js.UndefOr[ThingConnectivity]
    var shadow: js.UndefOr[JsonDocument]
    var thingGroupNames: js.UndefOr[ThingGroupNameList]
    var thingId: js.UndefOr[ThingId]
    var thingName: js.UndefOr[ThingName]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  /**
    * The thing group search index document.
    */
  @js.native
  @Factory
  trait ThingGroupDocument extends js.Object {
    var attributes: js.UndefOr[Attributes]
    var parentGroupNames: js.UndefOr[ThingGroupNameList]
    var thingGroupDescription: js.UndefOr[ThingGroupDescription]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var thingGroupName: js.UndefOr[ThingGroupName]
  }

  /**
    * Thing group indexing configuration.
    */
  @js.native
  @Factory
  trait ThingGroupIndexingConfiguration extends js.Object {
    var thingGroupIndexingMode: ThingGroupIndexingMode
    var customFields: js.UndefOr[Fields]
    var managedFields: js.UndefOr[Fields]
  }

  @js.native
  sealed trait ThingGroupIndexingMode extends js.Any
  object ThingGroupIndexingMode extends js.Object {
    val OFF = "OFF".asInstanceOf[ThingGroupIndexingMode]
    val ON  = "ON".asInstanceOf[ThingGroupIndexingMode]

    val values = js.Object.freeze(js.Array(OFF, ON))
  }

  /**
    * Thing group metadata.
    */
  @js.native
  @Factory
  trait ThingGroupMetadata extends js.Object {
    var creationDate: js.UndefOr[CreationDate]
    var parentGroupName: js.UndefOr[ThingGroupName]
    var rootToParentThingGroups: js.UndefOr[ThingGroupNameAndArnList]
  }

  /**
    * Thing group properties.
    */
  @js.native
  @Factory
  trait ThingGroupProperties extends js.Object {
    var attributePayload: js.UndefOr[AttributePayload]
    var thingGroupDescription: js.UndefOr[ThingGroupDescription]
  }

  /**
    * The thing indexing configuration. For more information, see [[https://docs.aws.amazon.com/iot/latest/developerguide/managing-index.html|Managing Thing Indexing]].
    */
  @js.native
  @Factory
  trait ThingIndexingConfiguration extends js.Object {
    var thingIndexingMode: ThingIndexingMode
    var customFields: js.UndefOr[Fields]
    var managedFields: js.UndefOr[Fields]
    var thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode]
  }

  @js.native
  sealed trait ThingIndexingMode extends js.Any
  object ThingIndexingMode extends js.Object {
    val OFF                 = "OFF".asInstanceOf[ThingIndexingMode]
    val REGISTRY            = "REGISTRY".asInstanceOf[ThingIndexingMode]
    val REGISTRY_AND_SHADOW = "REGISTRY_AND_SHADOW".asInstanceOf[ThingIndexingMode]

    val values = js.Object.freeze(js.Array(OFF, REGISTRY, REGISTRY_AND_SHADOW))
  }

  /**
    * The definition of the thing type, including thing type name and description.
    */
  @js.native
  @Factory
  trait ThingTypeDefinition extends js.Object {
    var thingTypeArn: js.UndefOr[ThingTypeArn]
    var thingTypeMetadata: js.UndefOr[ThingTypeMetadata]
    var thingTypeName: js.UndefOr[ThingTypeName]
    var thingTypeProperties: js.UndefOr[ThingTypeProperties]
  }

  /**
    * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when time was deprecated.
    */
  @js.native
  @Factory
  trait ThingTypeMetadata extends js.Object {
    var creationDate: js.UndefOr[CreationDate]
    var deprecated: js.UndefOr[Boolean]
    var deprecationDate: js.UndefOr[DeprecationDate]
  }

  /**
    * The ThingTypeProperties contains information about the thing type including: a thing type description, and a list of searchable thing attribute names.
    */
  @js.native
  @Factory
  trait ThingTypeProperties extends js.Object {
    var searchableAttributes: js.UndefOr[SearchableAttributes]
    var thingTypeDescription: js.UndefOr[ThingTypeDescription]
  }

  /**
    * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another terminal state before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.
    */
  @js.native
  @Factory
  trait TimeoutConfig extends js.Object {
    var inProgressTimeoutInMinutes: js.UndefOr[InProgressTimeoutInMinutes]
  }

  /**
    * Specifies the TLS context to use for the test authorizer request.
    */
  @js.native
  @Factory
  trait TlsContext extends js.Object {
    var serverName: js.UndefOr[ServerName]
  }

  /**
    * Describes a rule.
    */
  @js.native
  @Factory
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

  /**
    * A topic rule destination.
    */
  @js.native
  @Factory
  trait TopicRuleDestination extends js.Object {
    var arn: js.UndefOr[AwsArn]
    var httpUrlProperties: js.UndefOr[HttpUrlDestinationProperties]
    var status: js.UndefOr[TopicRuleDestinationStatus]
    var statusReason: js.UndefOr[String]
  }

  /**
    * Configuration of the topic rule destination.
    */
  @js.native
  @Factory
  trait TopicRuleDestinationConfiguration extends js.Object {
    var httpUrlConfiguration: js.UndefOr[HttpUrlDestinationConfiguration]
  }

  @js.native
  sealed trait TopicRuleDestinationStatus extends js.Any
  object TopicRuleDestinationStatus extends js.Object {
    val ENABLED     = "ENABLED".asInstanceOf[TopicRuleDestinationStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[TopicRuleDestinationStatus]
    val DISABLED    = "DISABLED".asInstanceOf[TopicRuleDestinationStatus]
    val ERROR       = "ERROR".asInstanceOf[TopicRuleDestinationStatus]

    val values = js.Object.freeze(js.Array(ENABLED, IN_PROGRESS, DISABLED, ERROR))
  }

  /**
    * Information about the topic rule destination.
    */
  @js.native
  @Factory
  trait TopicRuleDestinationSummary extends js.Object {
    var arn: js.UndefOr[AwsArn]
    var httpUrlSummary: js.UndefOr[HttpUrlDestinationSummary]
    var status: js.UndefOr[TopicRuleDestinationStatus]
    var statusReason: js.UndefOr[String]
  }

  /**
    * Describes a rule.
    */
  @js.native
  @Factory
  trait TopicRuleListItem extends js.Object {
    var createdAt: js.UndefOr[CreatedAtDate]
    var ruleArn: js.UndefOr[RuleArn]
    var ruleDisabled: js.UndefOr[IsDisabled]
    var ruleName: js.UndefOr[RuleName]
    var topicPattern: js.UndefOr[TopicPattern]
  }

  /**
    * Describes a rule.
    */
  @js.native
  @Factory
  trait TopicRulePayload extends js.Object {
    var actions: ActionList
    var sql: SQL
    var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion]
    var description: js.UndefOr[Description]
    var errorAction: js.UndefOr[Action]
    var ruleDisabled: js.UndefOr[IsDisabled]
  }

  /**
    * The input for the TransferCertificate operation.
    */
  @js.native
  @Factory
  trait TransferCertificateRequest extends js.Object {
    var certificateId: CertificateId
    var targetAwsAccount: AwsAccountId
    var transferMessage: js.UndefOr[Message]
  }

  /**
    * The output from the TransferCertificate operation.
    */
  @js.native
  @Factory
  trait TransferCertificateResponse extends js.Object {
    var transferredCertificateArn: js.UndefOr[CertificateArn]
  }

  /**
    * Data used to transfer a certificate to an AWS account.
    */
  @js.native
  @Factory
  trait TransferData extends js.Object {
    var acceptDate: js.UndefOr[DateType]
    var rejectDate: js.UndefOr[DateType]
    var rejectReason: js.UndefOr[Message]
    var transferDate: js.UndefOr[DateType]
    var transferMessage: js.UndefOr[Message]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateAccountAuditConfigurationRequest extends js.Object {
    var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations]
    var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations]
    var roleArn: js.UndefOr[RoleArn]
  }

  @js.native
  @Factory
  trait UpdateAccountAuditConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
    var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn]
    var status: js.UndefOr[AuthorizerStatus]
    var tokenKeyName: js.UndefOr[TokenKeyName]
    var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap]
  }

  @js.native
  @Factory
  trait UpdateAuthorizerResponse extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  @js.native
  @Factory
  trait UpdateBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
    var billingGroupProperties: BillingGroupProperties
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  @js.native
  @Factory
  trait UpdateBillingGroupResponse extends js.Object {
    var version: js.UndefOr[Version]
  }

  /**
    * Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
    */
  @js.native
  @Factory
  trait UpdateCACertificateParams extends js.Object {
    var action: CACertificateUpdateAction
  }

  /**
    * The input to the UpdateCACertificate operation.
    */
  @js.native
  @Factory
  trait UpdateCACertificateRequest extends js.Object {
    var certificateId: CertificateId
    var newAutoRegistrationStatus: js.UndefOr[AutoRegistrationStatus]
    var newStatus: js.UndefOr[CACertificateStatus]
    var registrationConfig: js.UndefOr[RegistrationConfig]
    var removeAutoRegistration: js.UndefOr[RemoveAutoRegistration]
  }

  /**
    * The input for the UpdateCertificate operation.
    */
  @js.native
  @Factory
  trait UpdateCertificateRequest extends js.Object {
    var certificateId: CertificateId
    var newStatus: CertificateStatus
  }

  /**
    * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
    */
  @js.native
  @Factory
  trait UpdateDeviceCertificateParams extends js.Object {
    var action: DeviceCertificateUpdateAction
  }

  @js.native
  @Factory
  trait UpdateDomainConfigurationRequest extends js.Object {
    var domainConfigurationName: ReservedDomainConfigurationName
    var authorizerConfig: js.UndefOr[AuthorizerConfig]
    var domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus]
    var removeAuthorizerConfig: js.UndefOr[RemoveAuthorizerConfig]
  }

  @js.native
  @Factory
  trait UpdateDomainConfigurationResponse extends js.Object {
    var domainConfigurationArn: js.UndefOr[DomainConfigurationArn]
    var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName]
  }

  @js.native
  @Factory
  trait UpdateDynamicThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var thingGroupProperties: ThingGroupProperties
    var expectedVersion: js.UndefOr[OptionalVersion]
    var indexName: js.UndefOr[IndexName]
    var queryString: js.UndefOr[QueryString]
    var queryVersion: js.UndefOr[QueryVersion]
  }

  @js.native
  @Factory
  trait UpdateDynamicThingGroupResponse extends js.Object {
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait UpdateEventConfigurationsRequest extends js.Object {
    var eventConfigurations: js.UndefOr[EventConfigurations]
  }

  @js.native
  @Factory
  trait UpdateEventConfigurationsResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateIndexingConfigurationRequest extends js.Object {
    var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration]
    var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration]
  }

  @js.native
  @Factory
  trait UpdateIndexingConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateJobRequest extends js.Object {
    var jobId: JobId
    var abortConfig: js.UndefOr[AbortConfig]
    var description: js.UndefOr[JobDescription]
    var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig]
    var presignedUrlConfig: js.UndefOr[PresignedUrlConfig]
    var timeoutConfig: js.UndefOr[TimeoutConfig]
  }

  @js.native
  @Factory
  trait UpdateMitigationActionRequest extends js.Object {
    var actionName: MitigationActionName
    var actionParams: js.UndefOr[MitigationActionParams]
    var roleArn: js.UndefOr[RoleArn]
  }

  @js.native
  @Factory
  trait UpdateMitigationActionResponse extends js.Object {
    var actionArn: js.UndefOr[MitigationActionArn]
    var actionId: js.UndefOr[MitigationActionId]
  }

  @js.native
  @Factory
  trait UpdateProvisioningTemplateRequest extends js.Object {
    var templateName: TemplateName
    var defaultVersionId: js.UndefOr[TemplateVersionId]
    var description: js.UndefOr[TemplateDescription]
    var enabled: js.UndefOr[Enabled]
    var provisioningRoleArn: js.UndefOr[RoleArn]
  }

  @js.native
  @Factory
  trait UpdateProvisioningTemplateResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds]
    var roleArn: js.UndefOr[RoleArn]
  }

  @js.native
  @Factory
  trait UpdateRoleAliasResponse extends js.Object {
    var roleAlias: js.UndefOr[RoleAlias]
    var roleAliasArn: js.UndefOr[RoleAliasArn]
  }

  @js.native
  @Factory
  trait UpdateScheduledAuditRequest extends js.Object {
    var scheduledAuditName: ScheduledAuditName
    var dayOfMonth: js.UndefOr[DayOfMonth]
    var dayOfWeek: js.UndefOr[DayOfWeek]
    var frequency: js.UndefOr[AuditFrequency]
    var targetCheckNames: js.UndefOr[TargetAuditCheckNames]
  }

  @js.native
  @Factory
  trait UpdateScheduledAuditResponse extends js.Object {
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
  }

  @js.native
  @Factory
  trait UpdateSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList]
    var alertTargets: js.UndefOr[AlertTargets]
    var behaviors: js.UndefOr[Behaviors]
    var deleteAdditionalMetricsToRetain: js.UndefOr[DeleteAdditionalMetricsToRetain]
    var deleteAlertTargets: js.UndefOr[DeleteAlertTargets]
    var deleteBehaviors: js.UndefOr[DeleteBehaviors]
    var expectedVersion: js.UndefOr[OptionalVersion]
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription]
  }

  @js.native
  @Factory
  trait UpdateSecurityProfileResponse extends js.Object {
    var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList]
    var alertTargets: js.UndefOr[AlertTargets]
    var behaviors: js.UndefOr[Behaviors]
    var creationDate: js.UndefOr[Timestamp]
    var lastModifiedDate: js.UndefOr[Timestamp]
    var securityProfileArn: js.UndefOr[SecurityProfileArn]
    var securityProfileDescription: js.UndefOr[SecurityProfileDescription]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait UpdateStreamRequest extends js.Object {
    var streamId: StreamId
    var description: js.UndefOr[StreamDescription]
    var files: js.UndefOr[StreamFiles]
    var roleArn: js.UndefOr[RoleArn]
  }

  @js.native
  @Factory
  trait UpdateStreamResponse extends js.Object {
    var description: js.UndefOr[StreamDescription]
    var streamArn: js.UndefOr[StreamArn]
    var streamId: js.UndefOr[StreamId]
    var streamVersion: js.UndefOr[StreamVersion]
  }

  @js.native
  @Factory
  trait UpdateThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var thingGroupProperties: ThingGroupProperties
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  @js.native
  @Factory
  trait UpdateThingGroupResponse extends js.Object {
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait UpdateThingGroupsForThingRequest extends js.Object {
    var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups]
    var thingGroupsToAdd: js.UndefOr[ThingGroupList]
    var thingGroupsToRemove: js.UndefOr[ThingGroupList]
    var thingName: js.UndefOr[ThingName]
  }

  @js.native
  @Factory
  trait UpdateThingGroupsForThingResponse extends js.Object {}

  /**
    * The input for the UpdateThing operation.
    */
  @js.native
  @Factory
  trait UpdateThingRequest extends js.Object {
    var thingName: ThingName
    var attributePayload: js.UndefOr[AttributePayload]
    var expectedVersion: js.UndefOr[OptionalVersion]
    var removeThingType: js.UndefOr[RemoveThingType]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  /**
    * The output from the UpdateThing operation.
    */
  @js.native
  @Factory
  trait UpdateThingResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateTopicRuleDestinationRequest extends js.Object {
    var arn: AwsArn
    var status: TopicRuleDestinationStatus
  }

  @js.native
  @Factory
  trait UpdateTopicRuleDestinationResponse extends js.Object {}

  @js.native
  @Factory
  trait ValidateSecurityProfileBehaviorsRequest extends js.Object {
    var behaviors: Behaviors
  }

  @js.native
  @Factory
  trait ValidateSecurityProfileBehaviorsResponse extends js.Object {
    var valid: js.UndefOr[Valid]
    var validationErrors: js.UndefOr[ValidationErrors]
  }

  /**
    * Information about an error found in a behavior specification.
    */
  @js.native
  @Factory
  trait ValidationError extends js.Object {
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  /**
    * Information about a Device Defender security profile behavior violation.
    */
  @js.native
  @Factory
  trait ViolationEvent extends js.Object {
    var behavior: js.UndefOr[Behavior]
    var metricValue: js.UndefOr[MetricValue]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[DeviceDefenderThingName]
    var violationEventTime: js.UndefOr[Timestamp]
    var violationEventType: js.UndefOr[ViolationEventType]
    var violationId: js.UndefOr[ViolationId]
  }

  @js.native
  sealed trait ViolationEventType extends js.Any
  object ViolationEventType extends js.Object {
    val `in-alarm`          = "in-alarm".asInstanceOf[ViolationEventType]
    val `alarm-cleared`     = "alarm-cleared".asInstanceOf[ViolationEventType]
    val `alarm-invalidated` = "alarm-invalidated".asInstanceOf[ViolationEventType]

    val values = js.Object.freeze(js.Array(`in-alarm`, `alarm-cleared`, `alarm-invalidated`))
  }
}
