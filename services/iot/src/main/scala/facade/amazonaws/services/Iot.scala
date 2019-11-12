package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object iot {
  type AbortAction                                = String
  type AbortCriteriaList                          = js.Array[AbortCriteria]
  type AbortThresholdPercentage                   = Double
  type ActionList                                 = js.Array[Action]
  type ActionType                                 = String
  type ActiveViolations                           = js.Array[ActiveViolation]
  type AdditionalMetricsToRetainList              = js.Array[BehaviorMetric]
  type AdditionalParameterMap                     = js.Dictionary[Value]
  type AggregationField                           = String
  type AlarmName                                  = String
  type AlertTargetArn                             = String
  type AlertTargetType                            = String
  type AlertTargets                               = js.Dictionary[AlertTarget]
  type AllowAutoRegistration                      = Boolean
  type ApproximateSecondsBeforeTimedOut           = Double
  type AscendingOrder                             = Boolean
  type AttributeKey                               = String
  type AttributeName                              = String
  type AttributeValue                             = String
  type Attributes                                 = js.Dictionary[AttributeValue]
  type AttributesMap                              = js.Dictionary[Value]
  type AuditCheckConfigurations                   = js.Dictionary[AuditCheckConfiguration]
  type AuditCheckName                             = String
  type AuditCheckRunStatus                        = String
  type AuditCheckToActionsMapping                 = js.Dictionary[MitigationActionNameList]
  type AuditCheckToReasonCodeFilter               = js.Dictionary[ReasonForNonComplianceCodes]
  type AuditDetails                               = js.Dictionary[AuditCheckDetails]
  type AuditFindingSeverity                       = String
  type AuditFindings                              = js.Array[AuditFinding]
  type AuditFrequency                             = String
  type AuditMitigationActionExecutionMetadataList = js.Array[AuditMitigationActionExecutionMetadata]
  type AuditMitigationActionsExecutionStatus      = String
  type AuditMitigationActionsTaskId               = String
  type AuditMitigationActionsTaskMetadataList     = js.Array[AuditMitigationActionsTaskMetadata]
  type AuditMitigationActionsTaskStatistics       = js.Dictionary[TaskStatisticsForAuditCheck]
  type AuditMitigationActionsTaskStatus           = String
  type AuditNotificationTargetConfigurations      = js.Dictionary[AuditNotificationTarget]
  type AuditNotificationType                      = String
  type AuditTaskId                                = String
  type AuditTaskMetadataList                      = js.Array[AuditTaskMetadata]
  type AuditTaskStatus                            = String
  type AuditTaskType                              = String
  type AuthDecision                               = String
  type AuthInfos                                  = js.Array[AuthInfo]
  type AuthResults                                = js.Array[AuthResult]
  type AuthorizerArn                              = String
  type AuthorizerFunctionArn                      = String
  type AuthorizerName                             = String
  type AuthorizerStatus                           = String
  type Authorizers                                = js.Array[AuthorizerSummary]
  type AutoRegistrationStatus                     = String
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
  type BucketName                                 = String
  type CACertificateStatus                        = String
  type CACertificateUpdateAction                  = String
  type CACertificates                             = js.Array[CACertificate]
  type CanceledChecksCount                        = Int
  type CanceledFindingsCount                      = Double
  type CanceledThings                             = Int
  type CannedAccessControlList                    = String
  type CertificateArn                             = String
  type CertificateId                              = String
  type CertificateName                            = String
  type CertificatePathOnDevice                    = String
  type CertificatePem                             = String
  type CertificateSigningRequest                  = String
  type CertificateStatus                          = String
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
  type ComparisonOperator                         = String
  type CompliantChecksCount                       = Int
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
  type DayOfWeek                                  = String
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
  type DeviceCertificateUpdateAction              = String
  type DeviceDefenderThingName                    = String
  type DisableAllLogs                             = Boolean
  type DurationSeconds                            = Int
  type DynamicGroupStatus                         = String
  type DynamoKeyType                              = String
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
  type EventType                                  = String
  type ExecutionNamePrefix                        = String
  type ExecutionNumber                            = Double
  type ExpectedVersion                            = Double
  type ExpiresInSec                               = Double
  type FailedChecksCount                          = Int
  type FailedFindingsCount                        = Double
  type FailedThings                               = Int
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
  type GEMaxResults                               = Int
  type GenerationId                               = String
  type HashAlgorithm                              = String
  type HashKeyField                               = String
  type HashKeyValue                               = String
  type InProgressChecksCount                      = Int
  type InProgressThings                           = Int
  type InProgressTimeoutInMinutes                 = Double
  type IncrementFactor                            = Double
  type IndexName                                  = String
  type IndexNamesList                             = js.Array[IndexName]
  type IndexSchema                                = String
  type IndexStatus                                = String
  type InlineDocument                             = String
  type InputName                                  = String
  type IsAuthenticated                            = Boolean
  type IsDefaultVersion                           = Boolean
  type IsDisabled                                 = Boolean
  type JobArn                                     = String
  type JobDescription                             = String
  type JobDocument                                = String
  type JobDocumentSource                          = String
  type JobExecutionFailureType                    = String
  type JobExecutionStatus                         = String
  type JobExecutionSummaryForJobList              = js.Array[JobExecutionSummaryForJob]
  type JobExecutionSummaryForThingList            = js.Array[JobExecutionSummaryForThing]
  type JobId                                      = String
  type JobStatus                                  = String
  type JobSummaryList                             = js.Array[JobSummary]
  type JobTargets                                 = js.Array[TargetArn]
  type JsonDocument                               = String
  type Key                                        = String
  type KeyName                                    = String
  type KeyValue                                   = String
  type LaserMaxResults                            = Int
  type LastModifiedDate                           = js.Date
  type LogLevel                                   = String
  type LogTargetConfigurations                    = js.Array[LogTargetConfiguration]
  type LogTargetName                              = String
  type LogTargetType                              = String
  type Marker                                     = String
  type MaxJobExecutionsPerMin                     = Int
  type MaxResults                                 = Int
  type MaximumPerMinute                           = Int
  type Message                                    = String
  type MessageFormat                              = String
  type MessageId                                  = String
  type MinimumNumberOfExecutedThings              = Int
  type MissingContextValue                        = String
  type MissingContextValues                       = js.Array[MissingContextValue]
  type MitigationActionArn                        = String
  type MitigationActionId                         = String
  type MitigationActionIdentifierList             = js.Array[MitigationActionIdentifier]
  type MitigationActionList                       = js.Array[MitigationAction]
  type MitigationActionName                       = String
  type MitigationActionNameList                   = js.Array[MitigationActionName]
  type MitigationActionType                       = String
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
  type OTAUpdateStatus                            = String
  type OTAUpdatesSummary                          = js.Array[OTAUpdateSummary]
  type OptionalVersion                            = Double
  type OutgoingCertificates                       = js.Array[OutgoingCertificate]
  type OverrideDynamicGroups                      = Boolean
  type PageSize                                   = Int
  type Parameter                                  = String
  type Parameters                                 = js.Dictionary[Value]
  type PartitionKey                               = String
  type PayloadField                               = String
  type Percentage                                 = Int
  type Platform                                   = String
  type Policies                                   = js.Array[Policy]
  type PolicyArn                                  = String
  type PolicyDocument                             = String
  type PolicyDocuments                            = js.Array[PolicyDocument]
  type PolicyName                                 = String
  type PolicyNames                                = js.Array[PolicyName]
  type PolicyTarget                               = String
  type PolicyTargets                              = js.Array[PolicyTarget]
  type PolicyTemplateName                         = String
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
  type PublicKey                                  = String
  type PublicKeyMap                               = js.Dictionary[KeyValue]
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
  type RemoveAutoRegistration                     = Boolean
  type RemoveThingType                            = Boolean
  type RemovedThings                              = Int
  type ReportType                                 = String
  type Resource                                   = String
  type ResourceArn                                = String
  type ResourceArns                               = js.Dictionary[ResourceArn]
  type ResourceLogicalId                          = String
  type ResourceType                               = String
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
  type SetAsActive                                = Boolean
  type SetAsActiveFlag                            = Boolean
  type SetAsDefault                               = Boolean
  type Signature =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SignatureAlgorithm                  = String
  type SigningJobId                        = String
  type SigningProfileName                  = String
  type SkippedFindingsCount                = Double
  type SkyfallMaxResults                   = Int
  type SnsTopicArn                         = String
  type StateMachineName                    = String
  type StateReason                         = String
  type StateValue                          = String
  type Status                              = String
  type StreamArn                           = String
  type StreamDescription                   = String
  type StreamFiles                         = js.Array[StreamFile]
  type StreamId                            = String
  type StreamName                          = String
  type StreamVersion                       = Int
  type StreamsSummary                      = js.Array[StreamSummary]
  type StringMap                           = js.Dictionary[String]
  type SucceededFindingsCount              = Double
  type SucceededThings                     = Int
  type TableName                           = String
  type TagKey                              = String
  type TagKeyList                          = js.Array[TagKey]
  type TagList                             = js.Array[Tag]
  type TagValue                            = String
  type Target                              = String
  type TargetArn                           = String
  type TargetAuditCheckNames               = js.Array[AuditCheckName]
  type TargetSelection                     = String
  type Targets                             = js.Array[Target]
  type TaskId                              = String
  type TaskIdList                          = js.Array[TaskId]
  type TemplateBody                        = String
  type ThingArn                            = String
  type ThingAttributeList                  = js.Array[ThingAttribute]
  type ThingConnectivityIndexingMode       = String
  type ThingDocumentList                   = js.Array[ThingDocument]
  type ThingGroupArn                       = String
  type ThingGroupDescription               = String
  type ThingGroupDocumentList              = js.Array[ThingGroupDocument]
  type ThingGroupId                        = String
  type ThingGroupIndexingMode              = String
  type ThingGroupList                      = js.Array[ThingGroupName]
  type ThingGroupName                      = String
  type ThingGroupNameAndArnList            = js.Array[GroupNameAndArn]
  type ThingGroupNameList                  = js.Array[ThingGroupName]
  type ThingGroupNames                     = js.Array[ThingGroupName]
  type ThingId                             = String
  type ThingIndexingMode                   = String
  type ThingName                           = String
  type ThingNameList                       = js.Array[ThingName]
  type ThingTypeArn                        = String
  type ThingTypeDescription                = String
  type ThingTypeId                         = String
  type ThingTypeList                       = js.Array[ThingTypeDefinition]
  type ThingTypeName                       = String
  type TimedOutThings                      = Int
  type Timestamp                           = js.Date
  type Token                               = String
  type TokenKeyName                        = String
  type TokenSignature                      = String
  type Topic                               = String
  type TopicPattern                        = String
  type TopicRuleList                       = js.Array[TopicRuleListItem]
  type TotalChecksCount                    = Int
  type TotalFindingsCount                  = Double
  type TotalResourcesCount                 = Double
  type UndoDeprecate                       = Boolean
  type UnsignedLong                        = Double
  type UseBase64                           = Boolean
  type Valid                               = Boolean
  type ValidationErrors                    = js.Array[ValidationError]
  type Value                               = String
  type Version                             = Double
  type VersionNumber                       = Double
  type ViolationEventType                  = String
  type ViolationEvents                     = js.Array[ViolationEvent]
  type ViolationId                         = String
  type WaitingForDataCollectionChecksCount = Int

  implicit final class IotOps(private val service: Iot) extends AnyVal {
    @inline def acceptCertificateTransferFuture(params: AcceptCertificateTransferRequest): Future[js.Object] =
      service.acceptCertificateTransfer(params).promise.toFuture
    @inline def addThingToBillingGroupFuture(
        params: AddThingToBillingGroupRequest
    ): Future[AddThingToBillingGroupResponse] = service.addThingToBillingGroup(params).promise.toFuture
    @inline def addThingToThingGroupFuture(params: AddThingToThingGroupRequest): Future[AddThingToThingGroupResponse] =
      service.addThingToThingGroup(params).promise.toFuture
    @inline def associateTargetsWithJobFuture(
        params: AssociateTargetsWithJobRequest
    ): Future[AssociateTargetsWithJobResponse] = service.associateTargetsWithJob(params).promise.toFuture
    @inline def attachPolicyFuture(params: AttachPolicyRequest): Future[js.Object] =
      service.attachPolicy(params).promise.toFuture
    @inline def attachSecurityProfileFuture(
        params: AttachSecurityProfileRequest
    ): Future[AttachSecurityProfileResponse] = service.attachSecurityProfile(params).promise.toFuture
    @inline def attachThingPrincipalFuture(params: AttachThingPrincipalRequest): Future[AttachThingPrincipalResponse] =
      service.attachThingPrincipal(params).promise.toFuture
    @inline def cancelAuditMitigationActionsTaskFuture(
        params: CancelAuditMitigationActionsTaskRequest
    ): Future[CancelAuditMitigationActionsTaskResponse] =
      service.cancelAuditMitigationActionsTask(params).promise.toFuture
    @inline def cancelAuditTaskFuture(params: CancelAuditTaskRequest): Future[CancelAuditTaskResponse] =
      service.cancelAuditTask(params).promise.toFuture
    @inline def cancelCertificateTransferFuture(params: CancelCertificateTransferRequest): Future[js.Object] =
      service.cancelCertificateTransfer(params).promise.toFuture
    @inline def cancelJobExecutionFuture(params: CancelJobExecutionRequest): Future[js.Object] =
      service.cancelJobExecution(params).promise.toFuture
    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] =
      service.cancelJob(params).promise.toFuture
    @inline def clearDefaultAuthorizerFuture(
        params: ClearDefaultAuthorizerRequest
    ): Future[ClearDefaultAuthorizerResponse] = service.clearDefaultAuthorizer(params).promise.toFuture
    @inline def createAuthorizerFuture(params: CreateAuthorizerRequest): Future[CreateAuthorizerResponse] =
      service.createAuthorizer(params).promise.toFuture
    @inline def createBillingGroupFuture(params: CreateBillingGroupRequest): Future[CreateBillingGroupResponse] =
      service.createBillingGroup(params).promise.toFuture
    @inline def createCertificateFromCsrFuture(
        params: CreateCertificateFromCsrRequest
    ): Future[CreateCertificateFromCsrResponse] = service.createCertificateFromCsr(params).promise.toFuture
    @inline def createDynamicThingGroupFuture(
        params: CreateDynamicThingGroupRequest
    ): Future[CreateDynamicThingGroupResponse] = service.createDynamicThingGroup(params).promise.toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] =
      service.createJob(params).promise.toFuture
    @inline def createKeysAndCertificateFuture(
        params: CreateKeysAndCertificateRequest
    ): Future[CreateKeysAndCertificateResponse] = service.createKeysAndCertificate(params).promise.toFuture
    @inline def createMitigationActionFuture(
        params: CreateMitigationActionRequest
    ): Future[CreateMitigationActionResponse] = service.createMitigationAction(params).promise.toFuture
    @inline def createOTAUpdateFuture(params: CreateOTAUpdateRequest): Future[CreateOTAUpdateResponse] =
      service.createOTAUpdate(params).promise.toFuture
    @inline def createPolicyFuture(params: CreatePolicyRequest): Future[CreatePolicyResponse] =
      service.createPolicy(params).promise.toFuture
    @inline def createPolicyVersionFuture(params: CreatePolicyVersionRequest): Future[CreatePolicyVersionResponse] =
      service.createPolicyVersion(params).promise.toFuture
    @inline def createRoleAliasFuture(params: CreateRoleAliasRequest): Future[CreateRoleAliasResponse] =
      service.createRoleAlias(params).promise.toFuture
    @inline def createScheduledAuditFuture(params: CreateScheduledAuditRequest): Future[CreateScheduledAuditResponse] =
      service.createScheduledAudit(params).promise.toFuture
    @inline def createSecurityProfileFuture(
        params: CreateSecurityProfileRequest
    ): Future[CreateSecurityProfileResponse] = service.createSecurityProfile(params).promise.toFuture
    @inline def createStreamFuture(params: CreateStreamRequest): Future[CreateStreamResponse] =
      service.createStream(params).promise.toFuture
    @inline def createThingFuture(params: CreateThingRequest): Future[CreateThingResponse] =
      service.createThing(params).promise.toFuture
    @inline def createThingGroupFuture(params: CreateThingGroupRequest): Future[CreateThingGroupResponse] =
      service.createThingGroup(params).promise.toFuture
    @inline def createThingTypeFuture(params: CreateThingTypeRequest): Future[CreateThingTypeResponse] =
      service.createThingType(params).promise.toFuture
    @inline def createTopicRuleFuture(params: CreateTopicRuleRequest): Future[js.Object] =
      service.createTopicRule(params).promise.toFuture
    @inline def deleteAccountAuditConfigurationFuture(
        params: DeleteAccountAuditConfigurationRequest
    ): Future[DeleteAccountAuditConfigurationResponse] =
      service.deleteAccountAuditConfiguration(params).promise.toFuture
    @inline def deleteAuthorizerFuture(params: DeleteAuthorizerRequest): Future[DeleteAuthorizerResponse] =
      service.deleteAuthorizer(params).promise.toFuture
    @inline def deleteBillingGroupFuture(params: DeleteBillingGroupRequest): Future[DeleteBillingGroupResponse] =
      service.deleteBillingGroup(params).promise.toFuture
    @inline def deleteCACertificateFuture(params: DeleteCACertificateRequest): Future[DeleteCACertificateResponse] =
      service.deleteCACertificate(params).promise.toFuture
    @inline def deleteCertificateFuture(params: DeleteCertificateRequest): Future[js.Object] =
      service.deleteCertificate(params).promise.toFuture
    @inline def deleteDynamicThingGroupFuture(
        params: DeleteDynamicThingGroupRequest
    ): Future[DeleteDynamicThingGroupResponse] = service.deleteDynamicThingGroup(params).promise.toFuture
    @inline def deleteJobExecutionFuture(params: DeleteJobExecutionRequest): Future[js.Object] =
      service.deleteJobExecution(params).promise.toFuture
    @inline def deleteJobFuture(params: DeleteJobRequest): Future[js.Object] =
      service.deleteJob(params).promise.toFuture
    @inline def deleteMitigationActionFuture(
        params: DeleteMitigationActionRequest
    ): Future[DeleteMitigationActionResponse] = service.deleteMitigationAction(params).promise.toFuture
    @inline def deleteOTAUpdateFuture(params: DeleteOTAUpdateRequest): Future[DeleteOTAUpdateResponse] =
      service.deleteOTAUpdate(params).promise.toFuture
    @inline def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] =
      service.deletePolicy(params).promise.toFuture
    @inline def deletePolicyVersionFuture(params: DeletePolicyVersionRequest): Future[js.Object] =
      service.deletePolicyVersion(params).promise.toFuture
    @inline def deleteRegistrationCodeFuture(
        params: DeleteRegistrationCodeRequest
    ): Future[DeleteRegistrationCodeResponse] = service.deleteRegistrationCode(params).promise.toFuture
    @inline def deleteRoleAliasFuture(params: DeleteRoleAliasRequest): Future[DeleteRoleAliasResponse] =
      service.deleteRoleAlias(params).promise.toFuture
    @inline def deleteScheduledAuditFuture(params: DeleteScheduledAuditRequest): Future[DeleteScheduledAuditResponse] =
      service.deleteScheduledAudit(params).promise.toFuture
    @inline def deleteSecurityProfileFuture(
        params: DeleteSecurityProfileRequest
    ): Future[DeleteSecurityProfileResponse] = service.deleteSecurityProfile(params).promise.toFuture
    @inline def deleteStreamFuture(params: DeleteStreamRequest): Future[DeleteStreamResponse] =
      service.deleteStream(params).promise.toFuture
    @inline def deleteThingFuture(params: DeleteThingRequest): Future[DeleteThingResponse] =
      service.deleteThing(params).promise.toFuture
    @inline def deleteThingGroupFuture(params: DeleteThingGroupRequest): Future[DeleteThingGroupResponse] =
      service.deleteThingGroup(params).promise.toFuture
    @inline def deleteThingTypeFuture(params: DeleteThingTypeRequest): Future[DeleteThingTypeResponse] =
      service.deleteThingType(params).promise.toFuture
    @inline def deleteTopicRuleFuture(params: DeleteTopicRuleRequest): Future[js.Object] =
      service.deleteTopicRule(params).promise.toFuture
    @inline def deleteV2LoggingLevelFuture(params: DeleteV2LoggingLevelRequest): Future[js.Object] =
      service.deleteV2LoggingLevel(params).promise.toFuture
    @inline def deprecateThingTypeFuture(params: DeprecateThingTypeRequest): Future[DeprecateThingTypeResponse] =
      service.deprecateThingType(params).promise.toFuture
    @inline def describeAccountAuditConfigurationFuture(
        params: DescribeAccountAuditConfigurationRequest
    ): Future[DescribeAccountAuditConfigurationResponse] =
      service.describeAccountAuditConfiguration(params).promise.toFuture
    @inline def describeAuditFindingFuture(params: DescribeAuditFindingRequest): Future[DescribeAuditFindingResponse] =
      service.describeAuditFinding(params).promise.toFuture
    @inline def describeAuditMitigationActionsTaskFuture(
        params: DescribeAuditMitigationActionsTaskRequest
    ): Future[DescribeAuditMitigationActionsTaskResponse] =
      service.describeAuditMitigationActionsTask(params).promise.toFuture
    @inline def describeAuditTaskFuture(params: DescribeAuditTaskRequest): Future[DescribeAuditTaskResponse] =
      service.describeAuditTask(params).promise.toFuture
    @inline def describeAuthorizerFuture(params: DescribeAuthorizerRequest): Future[DescribeAuthorizerResponse] =
      service.describeAuthorizer(params).promise.toFuture
    @inline def describeBillingGroupFuture(params: DescribeBillingGroupRequest): Future[DescribeBillingGroupResponse] =
      service.describeBillingGroup(params).promise.toFuture
    @inline def describeCACertificateFuture(
        params: DescribeCACertificateRequest
    ): Future[DescribeCACertificateResponse] = service.describeCACertificate(params).promise.toFuture
    @inline def describeCertificateFuture(params: DescribeCertificateRequest): Future[DescribeCertificateResponse] =
      service.describeCertificate(params).promise.toFuture
    @inline def describeDefaultAuthorizerFuture(
        params: DescribeDefaultAuthorizerRequest
    ): Future[DescribeDefaultAuthorizerResponse] = service.describeDefaultAuthorizer(params).promise.toFuture
    @inline def describeEndpointFuture(params: DescribeEndpointRequest): Future[DescribeEndpointResponse] =
      service.describeEndpoint(params).promise.toFuture
    @inline def describeEventConfigurationsFuture(
        params: DescribeEventConfigurationsRequest
    ): Future[DescribeEventConfigurationsResponse] = service.describeEventConfigurations(params).promise.toFuture
    @inline def describeIndexFuture(params: DescribeIndexRequest): Future[DescribeIndexResponse] =
      service.describeIndex(params).promise.toFuture
    @inline def describeJobExecutionFuture(params: DescribeJobExecutionRequest): Future[DescribeJobExecutionResponse] =
      service.describeJobExecution(params).promise.toFuture
    @inline def describeJobFuture(params: DescribeJobRequest): Future[DescribeJobResponse] =
      service.describeJob(params).promise.toFuture
    @inline def describeMitigationActionFuture(
        params: DescribeMitigationActionRequest
    ): Future[DescribeMitigationActionResponse] = service.describeMitigationAction(params).promise.toFuture
    @inline def describeRoleAliasFuture(params: DescribeRoleAliasRequest): Future[DescribeRoleAliasResponse] =
      service.describeRoleAlias(params).promise.toFuture
    @inline def describeScheduledAuditFuture(
        params: DescribeScheduledAuditRequest
    ): Future[DescribeScheduledAuditResponse] = service.describeScheduledAudit(params).promise.toFuture
    @inline def describeSecurityProfileFuture(
        params: DescribeSecurityProfileRequest
    ): Future[DescribeSecurityProfileResponse] = service.describeSecurityProfile(params).promise.toFuture
    @inline def describeStreamFuture(params: DescribeStreamRequest): Future[DescribeStreamResponse] =
      service.describeStream(params).promise.toFuture
    @inline def describeThingFuture(params: DescribeThingRequest): Future[DescribeThingResponse] =
      service.describeThing(params).promise.toFuture
    @inline def describeThingGroupFuture(params: DescribeThingGroupRequest): Future[DescribeThingGroupResponse] =
      service.describeThingGroup(params).promise.toFuture
    @inline def describeThingRegistrationTaskFuture(
        params: DescribeThingRegistrationTaskRequest
    ): Future[DescribeThingRegistrationTaskResponse] = service.describeThingRegistrationTask(params).promise.toFuture
    @inline def describeThingTypeFuture(params: DescribeThingTypeRequest): Future[DescribeThingTypeResponse] =
      service.describeThingType(params).promise.toFuture
    @inline def detachPolicyFuture(params: DetachPolicyRequest): Future[js.Object] =
      service.detachPolicy(params).promise.toFuture
    @inline def detachSecurityProfileFuture(
        params: DetachSecurityProfileRequest
    ): Future[DetachSecurityProfileResponse] = service.detachSecurityProfile(params).promise.toFuture
    @inline def detachThingPrincipalFuture(params: DetachThingPrincipalRequest): Future[DetachThingPrincipalResponse] =
      service.detachThingPrincipal(params).promise.toFuture
    @inline def disableTopicRuleFuture(params: DisableTopicRuleRequest): Future[js.Object] =
      service.disableTopicRule(params).promise.toFuture
    @inline def enableTopicRuleFuture(params: EnableTopicRuleRequest): Future[js.Object] =
      service.enableTopicRule(params).promise.toFuture
    @inline def getEffectivePoliciesFuture(params: GetEffectivePoliciesRequest): Future[GetEffectivePoliciesResponse] =
      service.getEffectivePolicies(params).promise.toFuture
    @inline def getIndexingConfigurationFuture(
        params: GetIndexingConfigurationRequest
    ): Future[GetIndexingConfigurationResponse] = service.getIndexingConfiguration(params).promise.toFuture
    @inline def getJobDocumentFuture(params: GetJobDocumentRequest): Future[GetJobDocumentResponse] =
      service.getJobDocument(params).promise.toFuture
    @inline def getLoggingOptionsFuture(params: GetLoggingOptionsRequest): Future[GetLoggingOptionsResponse] =
      service.getLoggingOptions(params).promise.toFuture
    @inline def getOTAUpdateFuture(params: GetOTAUpdateRequest): Future[GetOTAUpdateResponse] =
      service.getOTAUpdate(params).promise.toFuture
    @inline def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] =
      service.getPolicy(params).promise.toFuture
    @inline def getPolicyVersionFuture(params: GetPolicyVersionRequest): Future[GetPolicyVersionResponse] =
      service.getPolicyVersion(params).promise.toFuture
    @inline def getRegistrationCodeFuture(params: GetRegistrationCodeRequest): Future[GetRegistrationCodeResponse] =
      service.getRegistrationCode(params).promise.toFuture
    @inline def getStatisticsFuture(params: GetStatisticsRequest): Future[GetStatisticsResponse] =
      service.getStatistics(params).promise.toFuture
    @inline def getTopicRuleFuture(params: GetTopicRuleRequest): Future[GetTopicRuleResponse] =
      service.getTopicRule(params).promise.toFuture
    @inline def getV2LoggingOptionsFuture(params: GetV2LoggingOptionsRequest): Future[GetV2LoggingOptionsResponse] =
      service.getV2LoggingOptions(params).promise.toFuture
    @inline def listActiveViolationsFuture(params: ListActiveViolationsRequest): Future[ListActiveViolationsResponse] =
      service.listActiveViolations(params).promise.toFuture
    @inline def listAttachedPoliciesFuture(params: ListAttachedPoliciesRequest): Future[ListAttachedPoliciesResponse] =
      service.listAttachedPolicies(params).promise.toFuture
    @inline def listAuditFindingsFuture(params: ListAuditFindingsRequest): Future[ListAuditFindingsResponse] =
      service.listAuditFindings(params).promise.toFuture
    @inline def listAuditMitigationActionsExecutionsFuture(
        params: ListAuditMitigationActionsExecutionsRequest
    ): Future[ListAuditMitigationActionsExecutionsResponse] =
      service.listAuditMitigationActionsExecutions(params).promise.toFuture
    @inline def listAuditMitigationActionsTasksFuture(
        params: ListAuditMitigationActionsTasksRequest
    ): Future[ListAuditMitigationActionsTasksResponse] =
      service.listAuditMitigationActionsTasks(params).promise.toFuture
    @inline def listAuditTasksFuture(params: ListAuditTasksRequest): Future[ListAuditTasksResponse] =
      service.listAuditTasks(params).promise.toFuture
    @inline def listAuthorizersFuture(params: ListAuthorizersRequest): Future[ListAuthorizersResponse] =
      service.listAuthorizers(params).promise.toFuture
    @inline def listBillingGroupsFuture(params: ListBillingGroupsRequest): Future[ListBillingGroupsResponse] =
      service.listBillingGroups(params).promise.toFuture
    @inline def listCACertificatesFuture(params: ListCACertificatesRequest): Future[ListCACertificatesResponse] =
      service.listCACertificates(params).promise.toFuture
    @inline def listCertificatesByCAFuture(params: ListCertificatesByCARequest): Future[ListCertificatesByCAResponse] =
      service.listCertificatesByCA(params).promise.toFuture
    @inline def listCertificatesFuture(params: ListCertificatesRequest): Future[ListCertificatesResponse] =
      service.listCertificates(params).promise.toFuture
    @inline def listIndicesFuture(params: ListIndicesRequest): Future[ListIndicesResponse] =
      service.listIndices(params).promise.toFuture
    @inline def listJobExecutionsForJobFuture(
        params: ListJobExecutionsForJobRequest
    ): Future[ListJobExecutionsForJobResponse] = service.listJobExecutionsForJob(params).promise.toFuture
    @inline def listJobExecutionsForThingFuture(
        params: ListJobExecutionsForThingRequest
    ): Future[ListJobExecutionsForThingResponse] = service.listJobExecutionsForThing(params).promise.toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] =
      service.listJobs(params).promise.toFuture
    @inline def listMitigationActionsFuture(
        params: ListMitigationActionsRequest
    ): Future[ListMitigationActionsResponse] = service.listMitigationActions(params).promise.toFuture
    @inline def listOTAUpdatesFuture(params: ListOTAUpdatesRequest): Future[ListOTAUpdatesResponse] =
      service.listOTAUpdates(params).promise.toFuture
    @inline def listOutgoingCertificatesFuture(
        params: ListOutgoingCertificatesRequest
    ): Future[ListOutgoingCertificatesResponse] = service.listOutgoingCertificates(params).promise.toFuture
    @inline def listPoliciesFuture(params: ListPoliciesRequest): Future[ListPoliciesResponse] =
      service.listPolicies(params).promise.toFuture
    @inline def listPolicyVersionsFuture(params: ListPolicyVersionsRequest): Future[ListPolicyVersionsResponse] =
      service.listPolicyVersions(params).promise.toFuture
    @inline def listPrincipalThingsFuture(params: ListPrincipalThingsRequest): Future[ListPrincipalThingsResponse] =
      service.listPrincipalThings(params).promise.toFuture
    @inline def listRoleAliasesFuture(params: ListRoleAliasesRequest): Future[ListRoleAliasesResponse] =
      service.listRoleAliases(params).promise.toFuture
    @inline def listScheduledAuditsFuture(params: ListScheduledAuditsRequest): Future[ListScheduledAuditsResponse] =
      service.listScheduledAudits(params).promise.toFuture
    @inline def listSecurityProfilesForTargetFuture(
        params: ListSecurityProfilesForTargetRequest
    ): Future[ListSecurityProfilesForTargetResponse] = service.listSecurityProfilesForTarget(params).promise.toFuture
    @inline def listSecurityProfilesFuture(params: ListSecurityProfilesRequest): Future[ListSecurityProfilesResponse] =
      service.listSecurityProfiles(params).promise.toFuture
    @inline def listStreamsFuture(params: ListStreamsRequest): Future[ListStreamsResponse] =
      service.listStreams(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    @inline def listTargetsForPolicyFuture(params: ListTargetsForPolicyRequest): Future[ListTargetsForPolicyResponse] =
      service.listTargetsForPolicy(params).promise.toFuture
    @inline def listTargetsForSecurityProfileFuture(
        params: ListTargetsForSecurityProfileRequest
    ): Future[ListTargetsForSecurityProfileResponse] = service.listTargetsForSecurityProfile(params).promise.toFuture
    @inline def listThingGroupsForThingFuture(
        params: ListThingGroupsForThingRequest
    ): Future[ListThingGroupsForThingResponse] = service.listThingGroupsForThing(params).promise.toFuture
    @inline def listThingGroupsFuture(params: ListThingGroupsRequest): Future[ListThingGroupsResponse] =
      service.listThingGroups(params).promise.toFuture
    @inline def listThingPrincipalsFuture(params: ListThingPrincipalsRequest): Future[ListThingPrincipalsResponse] =
      service.listThingPrincipals(params).promise.toFuture
    @inline def listThingRegistrationTaskReportsFuture(
        params: ListThingRegistrationTaskReportsRequest
    ): Future[ListThingRegistrationTaskReportsResponse] =
      service.listThingRegistrationTaskReports(params).promise.toFuture
    @inline def listThingRegistrationTasksFuture(
        params: ListThingRegistrationTasksRequest
    ): Future[ListThingRegistrationTasksResponse] = service.listThingRegistrationTasks(params).promise.toFuture
    @inline def listThingTypesFuture(params: ListThingTypesRequest): Future[ListThingTypesResponse] =
      service.listThingTypes(params).promise.toFuture
    @inline def listThingsFuture(params: ListThingsRequest): Future[ListThingsResponse] =
      service.listThings(params).promise.toFuture
    @inline def listThingsInBillingGroupFuture(
        params: ListThingsInBillingGroupRequest
    ): Future[ListThingsInBillingGroupResponse] = service.listThingsInBillingGroup(params).promise.toFuture
    @inline def listThingsInThingGroupFuture(
        params: ListThingsInThingGroupRequest
    ): Future[ListThingsInThingGroupResponse] = service.listThingsInThingGroup(params).promise.toFuture
    @inline def listTopicRulesFuture(params: ListTopicRulesRequest): Future[ListTopicRulesResponse] =
      service.listTopicRules(params).promise.toFuture
    @inline def listV2LoggingLevelsFuture(params: ListV2LoggingLevelsRequest): Future[ListV2LoggingLevelsResponse] =
      service.listV2LoggingLevels(params).promise.toFuture
    @inline def listViolationEventsFuture(params: ListViolationEventsRequest): Future[ListViolationEventsResponse] =
      service.listViolationEvents(params).promise.toFuture
    @inline def registerCACertificateFuture(
        params: RegisterCACertificateRequest
    ): Future[RegisterCACertificateResponse] = service.registerCACertificate(params).promise.toFuture
    @inline def registerCertificateFuture(params: RegisterCertificateRequest): Future[RegisterCertificateResponse] =
      service.registerCertificate(params).promise.toFuture
    @inline def registerThingFuture(params: RegisterThingRequest): Future[RegisterThingResponse] =
      service.registerThing(params).promise.toFuture
    @inline def rejectCertificateTransferFuture(params: RejectCertificateTransferRequest): Future[js.Object] =
      service.rejectCertificateTransfer(params).promise.toFuture
    @inline def removeThingFromBillingGroupFuture(
        params: RemoveThingFromBillingGroupRequest
    ): Future[RemoveThingFromBillingGroupResponse] = service.removeThingFromBillingGroup(params).promise.toFuture
    @inline def removeThingFromThingGroupFuture(
        params: RemoveThingFromThingGroupRequest
    ): Future[RemoveThingFromThingGroupResponse] = service.removeThingFromThingGroup(params).promise.toFuture
    @inline def replaceTopicRuleFuture(params: ReplaceTopicRuleRequest): Future[js.Object] =
      service.replaceTopicRule(params).promise.toFuture
    @inline def searchIndexFuture(params: SearchIndexRequest): Future[SearchIndexResponse] =
      service.searchIndex(params).promise.toFuture
    @inline def setDefaultAuthorizerFuture(params: SetDefaultAuthorizerRequest): Future[SetDefaultAuthorizerResponse] =
      service.setDefaultAuthorizer(params).promise.toFuture
    @inline def setDefaultPolicyVersionFuture(params: SetDefaultPolicyVersionRequest): Future[js.Object] =
      service.setDefaultPolicyVersion(params).promise.toFuture
    @inline def setLoggingOptionsFuture(params: SetLoggingOptionsRequest): Future[js.Object] =
      service.setLoggingOptions(params).promise.toFuture
    @inline def setV2LoggingLevelFuture(params: SetV2LoggingLevelRequest): Future[js.Object] =
      service.setV2LoggingLevel(params).promise.toFuture
    @inline def setV2LoggingOptionsFuture(params: SetV2LoggingOptionsRequest): Future[js.Object] =
      service.setV2LoggingOptions(params).promise.toFuture
    @inline def startAuditMitigationActionsTaskFuture(
        params: StartAuditMitigationActionsTaskRequest
    ): Future[StartAuditMitigationActionsTaskResponse] =
      service.startAuditMitigationActionsTask(params).promise.toFuture
    @inline def startOnDemandAuditTaskFuture(
        params: StartOnDemandAuditTaskRequest
    ): Future[StartOnDemandAuditTaskResponse] = service.startOnDemandAuditTask(params).promise.toFuture
    @inline def startThingRegistrationTaskFuture(
        params: StartThingRegistrationTaskRequest
    ): Future[StartThingRegistrationTaskResponse] = service.startThingRegistrationTask(params).promise.toFuture
    @inline def stopThingRegistrationTaskFuture(
        params: StopThingRegistrationTaskRequest
    ): Future[StopThingRegistrationTaskResponse] = service.stopThingRegistrationTask(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    @inline def testAuthorizationFuture(params: TestAuthorizationRequest): Future[TestAuthorizationResponse] =
      service.testAuthorization(params).promise.toFuture
    @inline def testInvokeAuthorizerFuture(params: TestInvokeAuthorizerRequest): Future[TestInvokeAuthorizerResponse] =
      service.testInvokeAuthorizer(params).promise.toFuture
    @inline def transferCertificateFuture(params: TransferCertificateRequest): Future[TransferCertificateResponse] =
      service.transferCertificate(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    @inline def updateAccountAuditConfigurationFuture(
        params: UpdateAccountAuditConfigurationRequest
    ): Future[UpdateAccountAuditConfigurationResponse] =
      service.updateAccountAuditConfiguration(params).promise.toFuture
    @inline def updateAuthorizerFuture(params: UpdateAuthorizerRequest): Future[UpdateAuthorizerResponse] =
      service.updateAuthorizer(params).promise.toFuture
    @inline def updateBillingGroupFuture(params: UpdateBillingGroupRequest): Future[UpdateBillingGroupResponse] =
      service.updateBillingGroup(params).promise.toFuture
    @inline def updateCACertificateFuture(params: UpdateCACertificateRequest): Future[js.Object] =
      service.updateCACertificate(params).promise.toFuture
    @inline def updateCertificateFuture(params: UpdateCertificateRequest): Future[js.Object] =
      service.updateCertificate(params).promise.toFuture
    @inline def updateDynamicThingGroupFuture(
        params: UpdateDynamicThingGroupRequest
    ): Future[UpdateDynamicThingGroupResponse] = service.updateDynamicThingGroup(params).promise.toFuture
    @inline def updateEventConfigurationsFuture(
        params: UpdateEventConfigurationsRequest
    ): Future[UpdateEventConfigurationsResponse] = service.updateEventConfigurations(params).promise.toFuture
    @inline def updateIndexingConfigurationFuture(
        params: UpdateIndexingConfigurationRequest
    ): Future[UpdateIndexingConfigurationResponse] = service.updateIndexingConfiguration(params).promise.toFuture
    @inline def updateJobFuture(params: UpdateJobRequest): Future[js.Object] =
      service.updateJob(params).promise.toFuture
    @inline def updateMitigationActionFuture(
        params: UpdateMitigationActionRequest
    ): Future[UpdateMitigationActionResponse] = service.updateMitigationAction(params).promise.toFuture
    @inline def updateRoleAliasFuture(params: UpdateRoleAliasRequest): Future[UpdateRoleAliasResponse] =
      service.updateRoleAlias(params).promise.toFuture
    @inline def updateScheduledAuditFuture(params: UpdateScheduledAuditRequest): Future[UpdateScheduledAuditResponse] =
      service.updateScheduledAudit(params).promise.toFuture
    @inline def updateSecurityProfileFuture(
        params: UpdateSecurityProfileRequest
    ): Future[UpdateSecurityProfileResponse] = service.updateSecurityProfile(params).promise.toFuture
    @inline def updateStreamFuture(params: UpdateStreamRequest): Future[UpdateStreamResponse] =
      service.updateStream(params).promise.toFuture
    @inline def updateThingFuture(params: UpdateThingRequest): Future[UpdateThingResponse] =
      service.updateThing(params).promise.toFuture
    @inline def updateThingGroupFuture(params: UpdateThingGroupRequest): Future[UpdateThingGroupResponse] =
      service.updateThingGroup(params).promise.toFuture
    @inline def updateThingGroupsForThingFuture(
        params: UpdateThingGroupsForThingRequest
    ): Future[UpdateThingGroupsForThingResponse] = service.updateThingGroupsForThing(params).promise.toFuture
    @inline def validateSecurityProfileBehaviorsFuture(
        params: ValidateSecurityProfileBehaviorsRequest
    ): Future[ValidateSecurityProfileBehaviorsResponse] =
      service.validateSecurityProfileBehaviors(params).promise.toFuture
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
    def createAuthorizer(params: CreateAuthorizerRequest): Request[CreateAuthorizerResponse]       = js.native
    def createBillingGroup(params: CreateBillingGroupRequest): Request[CreateBillingGroupResponse] = js.native
    def createCertificateFromCsr(params: CreateCertificateFromCsrRequest): Request[CreateCertificateFromCsrResponse] =
      js.native
    def createDynamicThingGroup(params: CreateDynamicThingGroupRequest): Request[CreateDynamicThingGroupResponse] =
      js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse] = js.native
    def createKeysAndCertificate(params: CreateKeysAndCertificateRequest): Request[CreateKeysAndCertificateResponse] =
      js.native
    def createMitigationAction(params: CreateMitigationActionRequest): Request[CreateMitigationActionResponse] =
      js.native
    def createOTAUpdate(params: CreateOTAUpdateRequest): Request[CreateOTAUpdateResponse]                   = js.native
    def createPolicy(params: CreatePolicyRequest): Request[CreatePolicyResponse]                            = js.native
    def createPolicyVersion(params: CreatePolicyVersionRequest): Request[CreatePolicyVersionResponse]       = js.native
    def createRoleAlias(params: CreateRoleAliasRequest): Request[CreateRoleAliasResponse]                   = js.native
    def createScheduledAudit(params: CreateScheduledAuditRequest): Request[CreateScheduledAuditResponse]    = js.native
    def createSecurityProfile(params: CreateSecurityProfileRequest): Request[CreateSecurityProfileResponse] = js.native
    def createStream(params: CreateStreamRequest): Request[CreateStreamResponse]                            = js.native
    def createThing(params: CreateThingRequest): Request[CreateThingResponse]                               = js.native
    def createThingGroup(params: CreateThingGroupRequest): Request[CreateThingGroupResponse]                = js.native
    def createThingType(params: CreateThingTypeRequest): Request[CreateThingTypeResponse]                   = js.native
    def createTopicRule(params: CreateTopicRuleRequest): Request[js.Object]                                 = js.native
    def deleteAccountAuditConfiguration(
        params: DeleteAccountAuditConfigurationRequest
    ): Request[DeleteAccountAuditConfigurationResponse]                                               = js.native
    def deleteAuthorizer(params: DeleteAuthorizerRequest): Request[DeleteAuthorizerResponse]          = js.native
    def deleteBillingGroup(params: DeleteBillingGroupRequest): Request[DeleteBillingGroupResponse]    = js.native
    def deleteCACertificate(params: DeleteCACertificateRequest): Request[DeleteCACertificateResponse] = js.native
    def deleteCertificate(params: DeleteCertificateRequest): Request[js.Object]                       = js.native
    def deleteDynamicThingGroup(params: DeleteDynamicThingGroupRequest): Request[DeleteDynamicThingGroupResponse] =
      js.native
    def deleteJob(params: DeleteJobRequest): Request[js.Object]                   = js.native
    def deleteJobExecution(params: DeleteJobExecutionRequest): Request[js.Object] = js.native
    def deleteMitigationAction(params: DeleteMitigationActionRequest): Request[DeleteMitigationActionResponse] =
      js.native
    def deleteOTAUpdate(params: DeleteOTAUpdateRequest): Request[DeleteOTAUpdateResponse] = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[js.Object]                     = js.native
    def deletePolicyVersion(params: DeletePolicyVersionRequest): Request[js.Object]       = js.native
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
    def deleteV2LoggingLevel(params: DeleteV2LoggingLevelRequest): Request[js.Object]                       = js.native
    def deprecateThingType(params: DeprecateThingTypeRequest): Request[DeprecateThingTypeResponse]          = js.native
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
    ): Request[DescribeDefaultAuthorizerResponse]                                            = js.native
    def describeEndpoint(params: DescribeEndpointRequest): Request[DescribeEndpointResponse] = js.native
    def describeEventConfigurations(
        params: DescribeEventConfigurationsRequest
    ): Request[DescribeEventConfigurationsResponse]                                                      = js.native
    def describeIndex(params: DescribeIndexRequest): Request[DescribeIndexResponse]                      = js.native
    def describeJob(params: DescribeJobRequest): Request[DescribeJobResponse]                            = js.native
    def describeJobExecution(params: DescribeJobExecutionRequest): Request[DescribeJobExecutionResponse] = js.native
    def describeMitigationAction(params: DescribeMitigationActionRequest): Request[DescribeMitigationActionResponse] =
      js.native
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
    def getEffectivePolicies(params: GetEffectivePoliciesRequest): Request[GetEffectivePoliciesResponse]    = js.native
    def getIndexingConfiguration(params: GetIndexingConfigurationRequest): Request[GetIndexingConfigurationResponse] =
      js.native
    def getJobDocument(params: GetJobDocumentRequest): Request[GetJobDocumentResponse]                   = js.native
    def getLoggingOptions(params: GetLoggingOptionsRequest): Request[GetLoggingOptionsResponse]          = js.native
    def getOTAUpdate(params: GetOTAUpdateRequest): Request[GetOTAUpdateResponse]                         = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse]                                  = js.native
    def getPolicyVersion(params: GetPolicyVersionRequest): Request[GetPolicyVersionResponse]             = js.native
    def getRegistrationCode(params: GetRegistrationCodeRequest): Request[GetRegistrationCodeResponse]    = js.native
    def getStatistics(params: GetStatisticsRequest): Request[GetStatisticsResponse]                      = js.native
    def getTopicRule(params: GetTopicRuleRequest): Request[GetTopicRuleResponse]                         = js.native
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
    def listIndices(params: ListIndicesRequest): Request[ListIndicesResponse]                            = js.native
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
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse]                         = js.native
    def listPolicyVersions(params: ListPolicyVersionsRequest): Request[ListPolicyVersionsResponse]       = js.native
    def listPrincipalThings(params: ListPrincipalThingsRequest): Request[ListPrincipalThingsResponse]    = js.native
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
    def updateRoleAlias(params: UpdateRoleAliasRequest): Request[UpdateRoleAliasResponse]                   = js.native
    def updateScheduledAudit(params: UpdateScheduledAuditRequest): Request[UpdateScheduledAuditResponse]    = js.native
    def updateSecurityProfile(params: UpdateSecurityProfileRequest): Request[UpdateSecurityProfileResponse] = js.native
    def updateStream(params: UpdateStreamRequest): Request[UpdateStreamResponse]                            = js.native
    def updateThing(params: UpdateThingRequest): Request[UpdateThingResponse]                               = js.native
    def updateThingGroup(params: UpdateThingGroupRequest): Request[UpdateThingGroupResponse]                = js.native
    def updateThingGroupsForThing(
        params: UpdateThingGroupsForThingRequest
    ): Request[UpdateThingGroupsForThingResponse] = js.native
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

  object AbortActionEnum {
    val CANCEL = "CANCEL"

    val values = js.Object.freeze(js.Array(CANCEL))
  }

  /**
    * Details of abort criteria to abort the job.
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

  /**
    * Details of abort criteria to define rules to abort the job.
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
        "action"                    -> action.asInstanceOf[js.Any],
        "failureType"               -> failureType.asInstanceOf[js.Any],
        "minNumberOfExecutedThings" -> minNumberOfExecutedThings.asInstanceOf[js.Any],
        "thresholdPercentage"       -> thresholdPercentage.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AbortCriteria]
    }
  }

  /**
    * The input for the AcceptCertificateTransfer operation.
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

  /**
    * Describes the actions associated with a rule.
    */
  @js.native
  trait Action extends js.Object {
    var cloudwatchAlarm: js.UndefOr[CloudwatchAlarmAction]
    var cloudwatchMetric: js.UndefOr[CloudwatchMetricAction]
    var dynamoDB: js.UndefOr[DynamoDBAction]
    var dynamoDBv2: js.UndefOr[DynamoDBv2Action]
    var elasticsearch: js.UndefOr[ElasticsearchAction]
    var firehose: js.UndefOr[FirehoseAction]
    var iotAnalytics: js.UndefOr[IotAnalyticsAction]
    var iotEvents: js.UndefOr[IotEventsAction]
    var kinesis: js.UndefOr[KinesisAction]
    var lambda: js.UndefOr[LambdaAction]
    var republish: js.UndefOr[RepublishAction]
    var s3: js.UndefOr[S3Action]
    var salesforce: js.UndefOr[SalesforceAction]
    var sns: js.UndefOr[SnsAction]
    var sqs: js.UndefOr[SqsAction]
    var stepFunctions: js.UndefOr[StepFunctionsAction]
  }

  object Action {
    @inline
    def apply(
        cloudwatchAlarm: js.UndefOr[CloudwatchAlarmAction] = js.undefined,
        cloudwatchMetric: js.UndefOr[CloudwatchMetricAction] = js.undefined,
        dynamoDB: js.UndefOr[DynamoDBAction] = js.undefined,
        dynamoDBv2: js.UndefOr[DynamoDBv2Action] = js.undefined,
        elasticsearch: js.UndefOr[ElasticsearchAction] = js.undefined,
        firehose: js.UndefOr[FirehoseAction] = js.undefined,
        iotAnalytics: js.UndefOr[IotAnalyticsAction] = js.undefined,
        iotEvents: js.UndefOr[IotEventsAction] = js.undefined,
        kinesis: js.UndefOr[KinesisAction] = js.undefined,
        lambda: js.UndefOr[LambdaAction] = js.undefined,
        republish: js.UndefOr[RepublishAction] = js.undefined,
        s3: js.UndefOr[S3Action] = js.undefined,
        salesforce: js.UndefOr[SalesforceAction] = js.undefined,
        sns: js.UndefOr[SnsAction] = js.undefined,
        sqs: js.UndefOr[SqsAction] = js.undefined,
        stepFunctions: js.UndefOr[StepFunctionsAction] = js.undefined
    ): Action = {
      val __obj = js.Dynamic.literal()
      cloudwatchAlarm.foreach(__v => __obj.updateDynamic("cloudwatchAlarm")(__v.asInstanceOf[js.Any]))
      cloudwatchMetric.foreach(__v => __obj.updateDynamic("cloudwatchMetric")(__v.asInstanceOf[js.Any]))
      dynamoDB.foreach(__v => __obj.updateDynamic("dynamoDB")(__v.asInstanceOf[js.Any]))
      dynamoDBv2.foreach(__v => __obj.updateDynamic("dynamoDBv2")(__v.asInstanceOf[js.Any]))
      elasticsearch.foreach(__v => __obj.updateDynamic("elasticsearch")(__v.asInstanceOf[js.Any]))
      firehose.foreach(__v => __obj.updateDynamic("firehose")(__v.asInstanceOf[js.Any]))
      iotAnalytics.foreach(__v => __obj.updateDynamic("iotAnalytics")(__v.asInstanceOf[js.Any]))
      iotEvents.foreach(__v => __obj.updateDynamic("iotEvents")(__v.asInstanceOf[js.Any]))
      kinesis.foreach(__v => __obj.updateDynamic("kinesis")(__v.asInstanceOf[js.Any]))
      lambda.foreach(__v => __obj.updateDynamic("lambda")(__v.asInstanceOf[js.Any]))
      republish.foreach(__v => __obj.updateDynamic("republish")(__v.asInstanceOf[js.Any]))
      s3.foreach(__v => __obj.updateDynamic("s3")(__v.asInstanceOf[js.Any]))
      salesforce.foreach(__v => __obj.updateDynamic("salesforce")(__v.asInstanceOf[js.Any]))
      sns.foreach(__v => __obj.updateDynamic("sns")(__v.asInstanceOf[js.Any]))
      sqs.foreach(__v => __obj.updateDynamic("sqs")(__v.asInstanceOf[js.Any]))
      stepFunctions.foreach(__v => __obj.updateDynamic("stepFunctions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  object ActionTypeEnum {
    val PUBLISH   = "PUBLISH"
    val SUBSCRIBE = "SUBSCRIBE"
    val RECEIVE   = "RECEIVE"
    val CONNECT   = "CONNECT"

    val values = js.Object.freeze(js.Array(PUBLISH, SUBSCRIBE, RECEIVE, CONNECT))
  }

  /**
    * Information about an active Device Defender security profile behavior violation.
    */
  @js.native
  trait ActiveViolation extends js.Object {
    var behavior: js.UndefOr[Behavior]
    var lastViolationTime: js.UndefOr[Timestamp]
    var lastViolationValue: js.UndefOr[MetricValue]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[DeviceDefenderThingName]
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
        violationId: js.UndefOr[ViolationId] = js.undefined,
        violationStartTime: js.UndefOr[Timestamp] = js.undefined
    ): ActiveViolation = {
      val __obj = js.Dynamic.literal()
      behavior.foreach(__v => __obj.updateDynamic("behavior")(__v.asInstanceOf[js.Any]))
      lastViolationTime.foreach(__v => __obj.updateDynamic("lastViolationTime")(__v.asInstanceOf[js.Any]))
      lastViolationValue.foreach(__v => __obj.updateDynamic("lastViolationValue")(__v.asInstanceOf[js.Any]))
      securityProfileName.foreach(__v => __obj.updateDynamic("securityProfileName")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
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
  trait AddThingToBillingGroupResponse extends js.Object {}

  object AddThingToBillingGroupResponse {
    @inline
    def apply(
        ): AddThingToBillingGroupResponse = {
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
  trait AddThingToThingGroupResponse extends js.Object {}

  object AddThingToThingGroupResponse {
    @inline
    def apply(
        ): AddThingToThingGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AddThingToThingGroupResponse]
    }
  }

  /**
    * Parameters used when defining a mitigation action that move a set of things to a thing group.
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

  /**
    * A structure containing the alert target ARN and the role ARN.
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
        "roleArn"        -> roleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AlertTarget]
    }
  }

  /**
    * The type of alert target: one of "SNS".
    */
  object AlertTargetTypeEnum {
    val SNS = "SNS"

    val values = js.Object.freeze(js.Array(SNS))
  }

  /**
    * Contains information that allowed the authorization.
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

  @js.native
  trait AssociateTargetsWithJobRequest extends js.Object {
    var jobId: JobId
    var targets: JobTargets
    var comment: js.UndefOr[Comment]
  }

  object AssociateTargetsWithJobRequest {
    @inline
    def apply(
        jobId: JobId,
        targets: JobTargets,
        comment: js.UndefOr[Comment] = js.undefined
    ): AssociateTargetsWithJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId"   -> jobId.asInstanceOf[js.Any],
        "targets" -> targets.asInstanceOf[js.Any]
      )

      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
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
        "target"     -> target.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachPolicyRequest]
    }
  }

  /**
    * The input for the AttachPrincipalPolicy operation.
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
        "principal"  -> principal.asInstanceOf[js.Any]
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
        "securityProfileName"      -> securityProfileName.asInstanceOf[js.Any],
        "securityProfileTargetArn" -> securityProfileTargetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachSecurityProfileRequest]
    }
  }

  @js.native
  trait AttachSecurityProfileResponse extends js.Object {}

  object AttachSecurityProfileResponse {
    @inline
    def apply(
        ): AttachSecurityProfileResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AttachSecurityProfileResponse]
    }
  }

  /**
    * The input for the AttachThingPrincipal operation.
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

  /**
    * The output from the AttachThingPrincipal operation.
    */
  @js.native
  trait AttachThingPrincipalResponse extends js.Object {}

  object AttachThingPrincipalResponse {
    @inline
    def apply(
        ): AttachThingPrincipalResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AttachThingPrincipalResponse]
    }
  }

  /**
    * The attribute payload.
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

  /**
    * Which audit checks are enabled and disabled for this account.
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

  /**
    * Information about the audit check.
    */
  @js.native
  trait AuditCheckDetails extends js.Object {
    var checkCompliant: js.UndefOr[CheckCompliant]
    var checkRunStatus: js.UndefOr[AuditCheckRunStatus]
    var errorCode: js.UndefOr[ErrorCode]
    var message: js.UndefOr[ErrorMessage]
    var nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount]
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
        totalResourcesCount: js.UndefOr[TotalResourcesCount] = js.undefined
    ): AuditCheckDetails = {
      val __obj = js.Dynamic.literal()
      checkCompliant.foreach(__v => __obj.updateDynamic("checkCompliant")(__v.asInstanceOf[js.Any]))
      checkRunStatus.foreach(__v => __obj.updateDynamic("checkRunStatus")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      nonCompliantResourcesCount.foreach(
        __v => __obj.updateDynamic("nonCompliantResourcesCount")(__v.asInstanceOf[js.Any])
      )
      totalResourcesCount.foreach(__v => __obj.updateDynamic("totalResourcesCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditCheckDetails]
    }
  }

  object AuditCheckRunStatusEnum {
    val IN_PROGRESS                 = "IN_PROGRESS"
    val WAITING_FOR_DATA_COLLECTION = "WAITING_FOR_DATA_COLLECTION"
    val CANCELED                    = "CANCELED"
    val COMPLETED_COMPLIANT         = "COMPLETED_COMPLIANT"
    val COMPLETED_NON_COMPLIANT     = "COMPLETED_NON_COMPLIANT"
    val FAILED                      = "FAILED"

    val values = js.Object.freeze(
      js.Array(IN_PROGRESS, WAITING_FOR_DATA_COLLECTION, CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED)
    )
  }

  /**
    * The findings (results) of the audit.
    */
  @js.native
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

  object AuditFinding {
    @inline
    def apply(
        checkName: js.UndefOr[AuditCheckName] = js.undefined,
        findingId: js.UndefOr[FindingId] = js.undefined,
        findingTime: js.UndefOr[Timestamp] = js.undefined,
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
      nonCompliantResource.foreach(__v => __obj.updateDynamic("nonCompliantResource")(__v.asInstanceOf[js.Any]))
      reasonForNonCompliance.foreach(__v => __obj.updateDynamic("reasonForNonCompliance")(__v.asInstanceOf[js.Any]))
      reasonForNonComplianceCode.foreach(
        __v => __obj.updateDynamic("reasonForNonComplianceCode")(__v.asInstanceOf[js.Any])
      )
      relatedResources.foreach(__v => __obj.updateDynamic("relatedResources")(__v.asInstanceOf[js.Any]))
      severity.foreach(__v => __obj.updateDynamic("severity")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      taskStartTime.foreach(__v => __obj.updateDynamic("taskStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditFinding]
    }
  }

  object AuditFindingSeverityEnum {
    val CRITICAL = "CRITICAL"
    val HIGH     = "HIGH"
    val MEDIUM   = "MEDIUM"
    val LOW      = "LOW"

    val values = js.Object.freeze(js.Array(CRITICAL, HIGH, MEDIUM, LOW))
  }

  object AuditFrequencyEnum {
    val DAILY    = "DAILY"
    val WEEKLY   = "WEEKLY"
    val BIWEEKLY = "BIWEEKLY"
    val MONTHLY  = "MONTHLY"

    val values = js.Object.freeze(js.Array(DAILY, WEEKLY, BIWEEKLY, MONTHLY))
  }

  /**
    * Returned by ListAuditMitigationActionsTask, this object contains information that describes a mitigation action that has been started.
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
    var taskId: js.UndefOr[AuditMitigationActionsTaskId]
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
        taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.undefined
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

  object AuditMitigationActionsExecutionStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETED   = "COMPLETED"
    val FAILED      = "FAILED"
    val CANCELED    = "CANCELED"
    val SKIPPED     = "SKIPPED"
    val PENDING     = "PENDING"

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED, PENDING))
  }

  /**
    * Information about an audit mitigation actions task that is returned by <code>ListAuditMitigationActionsTasks</code>.
    */
  @js.native
  trait AuditMitigationActionsTaskMetadata extends js.Object {
    var startTime: js.UndefOr[Timestamp]
    var taskId: js.UndefOr[AuditMitigationActionsTaskId]
    var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus]
  }

  object AuditMitigationActionsTaskMetadata {
    @inline
    def apply(
        startTime: js.UndefOr[Timestamp] = js.undefined,
        taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.undefined,
        taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.undefined
    ): AuditMitigationActionsTaskMetadata = {
      val __obj = js.Dynamic.literal()
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      taskStatus.foreach(__v => __obj.updateDynamic("taskStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditMitigationActionsTaskMetadata]
    }
  }

  object AuditMitigationActionsTaskStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETED   = "COMPLETED"
    val FAILED      = "FAILED"
    val CANCELED    = "CANCELED"

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED))
  }

  /**
    * Used in MitigationActionParams, this information identifies the target findings to which the mitigation actions are applied. Only one entry appears.
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
      auditCheckToReasonCodeFilter.foreach(
        __v => __obj.updateDynamic("auditCheckToReasonCodeFilter")(__v.asInstanceOf[js.Any])
      )
      auditTaskId.foreach(__v => __obj.updateDynamic("auditTaskId")(__v.asInstanceOf[js.Any]))
      findingIds.foreach(__v => __obj.updateDynamic("findingIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuditMitigationActionsTaskTarget]
    }
  }

  /**
    * Information about the targets to which audit notifications are sent.
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

  object AuditNotificationTypeEnum {
    val SNS = "SNS"

    val values = js.Object.freeze(js.Array(SNS))
  }

  /**
    * The audits that were performed.
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

  object AuditTaskStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETED   = "COMPLETED"
    val FAILED      = "FAILED"
    val CANCELED    = "CANCELED"

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED))
  }

  object AuditTaskTypeEnum {
    val ON_DEMAND_AUDIT_TASK = "ON_DEMAND_AUDIT_TASK"
    val SCHEDULED_AUDIT_TASK = "SCHEDULED_AUDIT_TASK"

    val values = js.Object.freeze(js.Array(ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK))
  }

  object AuthDecisionEnum {
    val ALLOWED       = "ALLOWED"
    val EXPLICIT_DENY = "EXPLICIT_DENY"
    val IMPLICIT_DENY = "IMPLICIT_DENY"

    val values = js.Object.freeze(js.Array(ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY))
  }

  /**
    * A collection of authorization information.
    */
  @js.native
  trait AuthInfo extends js.Object {
    var actionType: js.UndefOr[ActionType]
    var resources: js.UndefOr[Resources]
  }

  object AuthInfo {
    @inline
    def apply(
        actionType: js.UndefOr[ActionType] = js.undefined,
        resources: js.UndefOr[Resources] = js.undefined
    ): AuthInfo = {
      val __obj = js.Dynamic.literal()
      actionType.foreach(__v => __obj.updateDynamic("actionType")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthInfo]
    }
  }

  /**
    * The authorizer result.
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

  /**
    * The authorizer description.
    */
  @js.native
  trait AuthorizerDescription extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn]
    var authorizerName: js.UndefOr[AuthorizerName]
    var creationDate: js.UndefOr[DateType]
    var lastModifiedDate: js.UndefOr[DateType]
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
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tokenKeyName.foreach(__v => __obj.updateDynamic("tokenKeyName")(__v.asInstanceOf[js.Any]))
      tokenSigningPublicKeys.foreach(__v => __obj.updateDynamic("tokenSigningPublicKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizerDescription]
    }
  }

  object AuthorizerStatusEnum {
    val ACTIVE   = "ACTIVE"
    val INACTIVE = "INACTIVE"

    val values = js.Object.freeze(js.Array(ACTIVE, INACTIVE))
  }

  /**
    * The authorizer summary.
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

  object AutoRegistrationStatusEnum {
    val ENABLE  = "ENABLE"
    val DISABLE = "DISABLE"

    val values = js.Object.freeze(js.Array(ENABLE, DISABLE))
  }

  /**
    * Configuration for the rollout of OTA updates.
    */
  @js.native
  trait AwsJobExecutionsRolloutConfig extends js.Object {
    var maximumPerMinute: js.UndefOr[MaximumPerMinute]
  }

  object AwsJobExecutionsRolloutConfig {
    @inline
    def apply(
        maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.undefined
    ): AwsJobExecutionsRolloutConfig = {
      val __obj = js.Dynamic.literal()
      maximumPerMinute.foreach(__v => __obj.updateDynamic("maximumPerMinute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsJobExecutionsRolloutConfig]
    }
  }

  /**
    * A Device Defender security profile behavior.
    */
  @js.native
  trait Behavior extends js.Object {
    var name: BehaviorName
    var criteria: js.UndefOr[BehaviorCriteria]
    var metric: js.UndefOr[BehaviorMetric]
  }

  object Behavior {
    @inline
    def apply(
        name: BehaviorName,
        criteria: js.UndefOr[BehaviorCriteria] = js.undefined,
        metric: js.UndefOr[BehaviorMetric] = js.undefined
    ): Behavior = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      criteria.foreach(__v => __obj.updateDynamic("criteria")(__v.asInstanceOf[js.Any]))
      metric.foreach(__v => __obj.updateDynamic("metric")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Behavior]
    }
  }

  /**
    * The criteria by which the behavior is determined to be normal.
    */
  @js.native
  trait BehaviorCriteria extends js.Object {
    var comparisonOperator: js.UndefOr[ComparisonOperator]
    var consecutiveDatapointsToAlarm: js.UndefOr[ConsecutiveDatapointsToAlarm]
    var consecutiveDatapointsToClear: js.UndefOr[ConsecutiveDatapointsToClear]
    var durationSeconds: js.UndefOr[DurationSeconds]
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
        statisticalThreshold: js.UndefOr[StatisticalThreshold] = js.undefined,
        value: js.UndefOr[MetricValue] = js.undefined
    ): BehaviorCriteria = {
      val __obj = js.Dynamic.literal()
      comparisonOperator.foreach(__v => __obj.updateDynamic("comparisonOperator")(__v.asInstanceOf[js.Any]))
      consecutiveDatapointsToAlarm.foreach(
        __v => __obj.updateDynamic("consecutiveDatapointsToAlarm")(__v.asInstanceOf[js.Any])
      )
      consecutiveDatapointsToClear.foreach(
        __v => __obj.updateDynamic("consecutiveDatapointsToClear")(__v.asInstanceOf[js.Any])
      )
      durationSeconds.foreach(__v => __obj.updateDynamic("durationSeconds")(__v.asInstanceOf[js.Any]))
      statisticalThreshold.foreach(__v => __obj.updateDynamic("statisticalThreshold")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BehaviorCriteria]
    }
  }

  /**
    * Additional information about the billing group.
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

  /**
    * The properties of a billing group.
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

  /**
    * A CA certificate.
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

  /**
    * Describes a CA certificate.
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

  object CACertificateStatusEnum {
    val ACTIVE   = "ACTIVE"
    val INACTIVE = "INACTIVE"

    val values = js.Object.freeze(js.Array(ACTIVE, INACTIVE))
  }

  object CACertificateUpdateActionEnum {
    val DEACTIVATE = "DEACTIVATE"

    val values = js.Object.freeze(js.Array(DEACTIVATE))
  }

  @js.native
  trait CancelAuditMitigationActionsTaskRequest extends js.Object {
    var taskId: AuditMitigationActionsTaskId
  }

  object CancelAuditMitigationActionsTaskRequest {
    @inline
    def apply(
        taskId: AuditMitigationActionsTaskId
    ): CancelAuditMitigationActionsTaskRequest = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelAuditMitigationActionsTaskRequest]
    }
  }

  @js.native
  trait CancelAuditMitigationActionsTaskResponse extends js.Object {}

  object CancelAuditMitigationActionsTaskResponse {
    @inline
    def apply(
        ): CancelAuditMitigationActionsTaskResponse = {
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
  trait CancelAuditTaskResponse extends js.Object {}

  object CancelAuditTaskResponse {
    @inline
    def apply(
        ): CancelAuditTaskResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CancelAuditTaskResponse]
    }
  }

  /**
    * The input for the CancelCertificateTransfer operation.
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
        "jobId"     -> jobId.asInstanceOf[js.Any],
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

  object CannedAccessControlListEnum {
    val `private`                   = "private"
    val `public-read`               = "public-read"
    val `public-read-write`         = "public-read-write"
    val `aws-exec-read`             = "aws-exec-read"
    val `authenticated-read`        = "authenticated-read"
    val `bucket-owner-read`         = "bucket-owner-read"
    val `bucket-owner-full-control` = "bucket-owner-full-control"
    val `log-delivery-write`        = "log-delivery-write"

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
  trait Certificate extends js.Object {
    var certificateArn: js.UndefOr[CertificateArn]
    var certificateId: js.UndefOr[CertificateId]
    var creationDate: js.UndefOr[DateType]
    var status: js.UndefOr[CertificateStatus]
  }

  object Certificate {
    @inline
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        creationDate: js.UndefOr[DateType] = js.undefined,
        status: js.UndefOr[CertificateStatus] = js.undefined
    ): Certificate = {
      val __obj = js.Dynamic.literal()
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      certificateId.foreach(__v => __obj.updateDynamic("certificateId")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Certificate]
    }
  }

  /**
    * Describes a certificate.
    */
  @js.native
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

  object CertificateDescription {
    @inline
    def apply(
        caCertificateId: js.UndefOr[CertificateId] = js.undefined,
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
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

  object CertificateStatusEnum {
    val ACTIVE             = "ACTIVE"
    val INACTIVE           = "INACTIVE"
    val REVOKED            = "REVOKED"
    val PENDING_TRANSFER   = "PENDING_TRANSFER"
    val REGISTER_INACTIVE  = "REGISTER_INACTIVE"
    val PENDING_ACTIVATION = "PENDING_ACTIVATION"

    val values =
      js.Object.freeze(js.Array(ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER, REGISTER_INACTIVE, PENDING_ACTIVATION))
  }

  /**
    * When the certificate is valid.
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
  trait ClearDefaultAuthorizerRequest extends js.Object {}

  object ClearDefaultAuthorizerRequest {
    @inline
    def apply(
        ): ClearDefaultAuthorizerRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ClearDefaultAuthorizerRequest]
    }
  }

  @js.native
  trait ClearDefaultAuthorizerResponse extends js.Object {}

  object ClearDefaultAuthorizerResponse {
    @inline
    def apply(
        ): ClearDefaultAuthorizerResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ClearDefaultAuthorizerResponse]
    }
  }

  /**
    * Describes an action that updates a CloudWatch alarm.
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
        "alarmName"   -> alarmName.asInstanceOf[js.Any],
        "roleArn"     -> roleArn.asInstanceOf[js.Any],
        "stateReason" -> stateReason.asInstanceOf[js.Any],
        "stateValue"  -> stateValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CloudwatchAlarmAction]
    }
  }

  /**
    * Describes an action that captures a CloudWatch metric.
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
        "metricName"      -> metricName.asInstanceOf[js.Any],
        "metricNamespace" -> metricNamespace.asInstanceOf[js.Any],
        "metricUnit"      -> metricUnit.asInstanceOf[js.Any],
        "metricValue"     -> metricValue.asInstanceOf[js.Any],
        "roleArn"         -> roleArn.asInstanceOf[js.Any]
      )

      metricTimestamp.foreach(__v => __obj.updateDynamic("metricTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudwatchMetricAction]
    }
  }

  /**
    * Describes the method to use when code signing a file.
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

  /**
    * Describes the certificate chain being used when code signing a file.
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

  /**
    * Describes the signature for a file.
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

  object ComparisonOperatorEnum {
    val `less-than`           = "less-than"
    val `less-than-equals`    = "less-than-equals"
    val `greater-than`        = "greater-than"
    val `greater-than-equals` = "greater-than-equals"
    val `in-cidr-set`         = "in-cidr-set"
    val `not-in-cidr-set`     = "not-in-cidr-set"
    val `in-port-set`         = "in-port-set"
    val `not-in-port-set`     = "not-in-port-set"

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
  trait CreateAuthorizerRequest extends js.Object {
    var authorizerFunctionArn: AuthorizerFunctionArn
    var authorizerName: AuthorizerName
    var tokenKeyName: TokenKeyName
    var tokenSigningPublicKeys: PublicKeyMap
    var status: js.UndefOr[AuthorizerStatus]
  }

  object CreateAuthorizerRequest {
    @inline
    def apply(
        authorizerFunctionArn: AuthorizerFunctionArn,
        authorizerName: AuthorizerName,
        tokenKeyName: TokenKeyName,
        tokenSigningPublicKeys: PublicKeyMap,
        status: js.UndefOr[AuthorizerStatus] = js.undefined
    ): CreateAuthorizerRequest = {
      val __obj = js.Dynamic.literal(
        "authorizerFunctionArn"  -> authorizerFunctionArn.asInstanceOf[js.Any],
        "authorizerName"         -> authorizerName.asInstanceOf[js.Any],
        "tokenKeyName"           -> tokenKeyName.asInstanceOf[js.Any],
        "tokenSigningPublicKeys" -> tokenSigningPublicKeys.asInstanceOf[js.Any]
      )

      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
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

  /**
    * The input for the CreateCertificateFromCsr operation.
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

  /**
    * The output from the CreateCertificateFromCsr operation.
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
        "queryString"    -> queryString.asInstanceOf[js.Any],
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
        presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        targetSelection: js.UndefOr[TargetSelection] = js.undefined,
        timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
    ): CreateJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId"   -> jobId.asInstanceOf[js.Any],
        "targets" -> targets.asInstanceOf[js.Any]
      )

      abortConfig.foreach(__v => __obj.updateDynamic("abortConfig")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      document.foreach(__v => __obj.updateDynamic("document")(__v.asInstanceOf[js.Any]))
      documentSource.foreach(__v => __obj.updateDynamic("documentSource")(__v.asInstanceOf[js.Any]))
      jobExecutionsRolloutConfig.foreach(
        __v => __obj.updateDynamic("jobExecutionsRolloutConfig")(__v.asInstanceOf[js.Any])
      )
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

  /**
    * The input for the CreateKeysAndCertificate operation.
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

  /**
    * The output of the CreateKeysAndCertificate operation.
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
        "actionName"   -> actionName.asInstanceOf[js.Any],
        "actionParams" -> actionParams.asInstanceOf[js.Any],
        "roleArn"      -> roleArn.asInstanceOf[js.Any]
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
    var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig]
    var description: js.UndefOr[OTAUpdateDescription]
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
        awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.undefined,
        description: js.UndefOr[OTAUpdateDescription] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        targetSelection: js.UndefOr[TargetSelection] = js.undefined
    ): CreateOTAUpdateRequest = {
      val __obj = js.Dynamic.literal(
        "files"       -> files.asInstanceOf[js.Any],
        "otaUpdateId" -> otaUpdateId.asInstanceOf[js.Any],
        "roleArn"     -> roleArn.asInstanceOf[js.Any],
        "targets"     -> targets.asInstanceOf[js.Any]
      )

      additionalParameters.foreach(__v => __obj.updateDynamic("additionalParameters")(__v.asInstanceOf[js.Any]))
      awsJobExecutionsRolloutConfig.foreach(
        __v => __obj.updateDynamic("awsJobExecutionsRolloutConfig")(__v.asInstanceOf[js.Any])
      )
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
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

  /**
    * The input for the CreatePolicy operation.
    */
  @js.native
  trait CreatePolicyRequest extends js.Object {
    var policyDocument: PolicyDocument
    var policyName: PolicyName
  }

  object CreatePolicyRequest {
    @inline
    def apply(
        policyDocument: PolicyDocument,
        policyName: PolicyName
    ): CreatePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyDocument" -> policyDocument.asInstanceOf[js.Any],
        "policyName"     -> policyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreatePolicyRequest]
    }
  }

  /**
    * The output from the CreatePolicy operation.
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

  /**
    * The input for the CreatePolicyVersion operation.
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
        "policyName"     -> policyName.asInstanceOf[js.Any]
      )

      setAsDefault.foreach(__v => __obj.updateDynamic("setAsDefault")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePolicyVersionRequest]
    }
  }

  /**
    * The output of the CreatePolicyVersion operation.
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
  trait CreateRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
    var roleArn: RoleArn
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds]
  }

  object CreateRoleAliasRequest {
    @inline
    def apply(
        roleAlias: RoleAlias,
        roleArn: RoleArn,
        credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined
    ): CreateRoleAliasRequest = {
      val __obj = js.Dynamic.literal(
        "roleAlias" -> roleAlias.asInstanceOf[js.Any],
        "roleArn"   -> roleArn.asInstanceOf[js.Any]
      )

      credentialDurationSeconds.foreach(
        __v => __obj.updateDynamic("credentialDurationSeconds")(__v.asInstanceOf[js.Any])
      )
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
        "frequency"          -> frequency.asInstanceOf[js.Any],
        "scheduledAuditName" -> scheduledAuditName.asInstanceOf[js.Any],
        "targetCheckNames"   -> targetCheckNames.asInstanceOf[js.Any]
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
        alertTargets: js.UndefOr[AlertTargets] = js.undefined,
        behaviors: js.UndefOr[Behaviors] = js.undefined,
        securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateSecurityProfileRequest = {
      val __obj = js.Dynamic.literal(
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any]
      )

      additionalMetricsToRetain.foreach(
        __v => __obj.updateDynamic("additionalMetricsToRetain")(__v.asInstanceOf[js.Any])
      )
      alertTargets.foreach(__v => __obj.updateDynamic("alertTargets")(__v.asInstanceOf[js.Any]))
      behaviors.foreach(__v => __obj.updateDynamic("behaviors")(__v.asInstanceOf[js.Any]))
      securityProfileDescription.foreach(
        __v => __obj.updateDynamic("securityProfileDescription")(__v.asInstanceOf[js.Any])
      )
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
        "files"    -> files.asInstanceOf[js.Any],
        "roleArn"  -> roleArn.asInstanceOf[js.Any],
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

  /**
    * The input for the CreateThing operation.
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

  /**
    * The output of the CreateThing operation.
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

  /**
    * The input for the CreateThingType operation.
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

  /**
    * The output of the CreateThingType operation.
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

  /**
    * The input for the CreateTopicRule operation.
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
        "ruleName"         -> ruleName.asInstanceOf[js.Any],
        "topicRulePayload" -> topicRulePayload.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTopicRuleRequest]
    }
  }

  /**
    * Describes a custom method used to code sign a file.
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

  object DayOfWeekEnum {
    val SUN = "SUN"
    val MON = "MON"
    val TUE = "TUE"
    val WED = "WED"
    val THU = "THU"
    val FRI = "FRI"
    val SAT = "SAT"

    val values = js.Object.freeze(js.Array(SUN, MON, TUE, WED, THU, FRI, SAT))
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
  trait DeleteAccountAuditConfigurationResponse extends js.Object {}

  object DeleteAccountAuditConfigurationResponse {
    @inline
    def apply(
        ): DeleteAccountAuditConfigurationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteAccountAuditConfigurationResponse]
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
  trait DeleteAuthorizerResponse extends js.Object {}

  object DeleteAuthorizerResponse {
    @inline
    def apply(
        ): DeleteAuthorizerResponse = {
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
  trait DeleteBillingGroupResponse extends js.Object {}

  object DeleteBillingGroupResponse {
    @inline
    def apply(
        ): DeleteBillingGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteBillingGroupResponse]
    }
  }

  /**
    * Input for the DeleteCACertificate operation.
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

  /**
    * The output for the DeleteCACertificate operation.
    */
  @js.native
  trait DeleteCACertificateResponse extends js.Object {}

  object DeleteCACertificateResponse {
    @inline
    def apply(
        ): DeleteCACertificateResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteCACertificateResponse]
    }
  }

  /**
    * The input for the DeleteCertificate operation.
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
  trait DeleteDynamicThingGroupResponse extends js.Object {}

  object DeleteDynamicThingGroupResponse {
    @inline
    def apply(
        ): DeleteDynamicThingGroupResponse = {
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
  }

  object DeleteJobExecutionRequest {
    @inline
    def apply(
        executionNumber: ExecutionNumber,
        jobId: JobId,
        thingName: ThingName,
        force: js.UndefOr[ForceFlag] = js.undefined
    ): DeleteJobExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "executionNumber" -> executionNumber.asInstanceOf[js.Any],
        "jobId"           -> jobId.asInstanceOf[js.Any],
        "thingName"       -> thingName.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteJobExecutionRequest]
    }
  }

  @js.native
  trait DeleteJobRequest extends js.Object {
    var jobId: JobId
    var force: js.UndefOr[ForceFlag]
  }

  object DeleteJobRequest {
    @inline
    def apply(
        jobId: JobId,
        force: js.UndefOr[ForceFlag] = js.undefined
    ): DeleteJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
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
  trait DeleteMitigationActionResponse extends js.Object {}

  object DeleteMitigationActionResponse {
    @inline
    def apply(
        ): DeleteMitigationActionResponse = {
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
  trait DeleteOTAUpdateResponse extends js.Object {}

  object DeleteOTAUpdateResponse {
    @inline
    def apply(
        ): DeleteOTAUpdateResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteOTAUpdateResponse]
    }
  }

  /**
    * The input for the DeletePolicy operation.
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

  /**
    * The input for the DeletePolicyVersion operation.
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
        "policyName"      -> policyName.asInstanceOf[js.Any],
        "policyVersionId" -> policyVersionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePolicyVersionRequest]
    }
  }

  /**
    * The input for the DeleteRegistrationCode operation.
    */
  @js.native
  trait DeleteRegistrationCodeRequest extends js.Object {}

  object DeleteRegistrationCodeRequest {
    @inline
    def apply(
        ): DeleteRegistrationCodeRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteRegistrationCodeRequest]
    }
  }

  /**
    * The output for the DeleteRegistrationCode operation.
    */
  @js.native
  trait DeleteRegistrationCodeResponse extends js.Object {}

  object DeleteRegistrationCodeResponse {
    @inline
    def apply(
        ): DeleteRegistrationCodeResponse = {
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
  trait DeleteRoleAliasResponse extends js.Object {}

  object DeleteRoleAliasResponse {
    @inline
    def apply(
        ): DeleteRoleAliasResponse = {
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
  trait DeleteScheduledAuditResponse extends js.Object {}

  object DeleteScheduledAuditResponse {
    @inline
    def apply(
        ): DeleteScheduledAuditResponse = {
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
  trait DeleteSecurityProfileResponse extends js.Object {}

  object DeleteSecurityProfileResponse {
    @inline
    def apply(
        ): DeleteSecurityProfileResponse = {
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
  trait DeleteStreamResponse extends js.Object {}

  object DeleteStreamResponse {
    @inline
    def apply(
        ): DeleteStreamResponse = {
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
  trait DeleteThingGroupResponse extends js.Object {}

  object DeleteThingGroupResponse {
    @inline
    def apply(
        ): DeleteThingGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteThingGroupResponse]
    }
  }

  /**
    * The input for the DeleteThing operation.
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

  /**
    * The output of the DeleteThing operation.
    */
  @js.native
  trait DeleteThingResponse extends js.Object {}

  object DeleteThingResponse {
    @inline
    def apply(
        ): DeleteThingResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteThingResponse]
    }
  }

  /**
    * The input for the DeleteThingType operation.
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

  /**
    * The output for the DeleteThingType operation.
    */
  @js.native
  trait DeleteThingTypeResponse extends js.Object {}

  object DeleteThingTypeResponse {
    @inline
    def apply(
        ): DeleteThingTypeResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteThingTypeResponse]
    }
  }

  /**
    * The input for the DeleteTopicRule operation.
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

  /**
    * Contains information that denied the authorization.
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

  /**
    * The input for the DeprecateThingType operation.
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

  /**
    * The output for the DeprecateThingType operation.
    */
  @js.native
  trait DeprecateThingTypeResponse extends js.Object {}

  object DeprecateThingTypeResponse {
    @inline
    def apply(
        ): DeprecateThingTypeResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeprecateThingTypeResponse]
    }
  }

  @js.native
  trait DescribeAccountAuditConfigurationRequest extends js.Object {}

  object DescribeAccountAuditConfigurationRequest {
    @inline
    def apply(
        ): DescribeAccountAuditConfigurationRequest = {
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
      auditNotificationTargetConfigurations.foreach(
        __v => __obj.updateDynamic("auditNotificationTargetConfigurations")(__v.asInstanceOf[js.Any])
      )
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
    var taskId: AuditMitigationActionsTaskId
  }

  object DescribeAuditMitigationActionsTaskRequest {
    @inline
    def apply(
        taskId: AuditMitigationActionsTaskId
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
      auditCheckToActionsMapping.foreach(
        __v => __obj.updateDynamic("auditCheckToActionsMapping")(__v.asInstanceOf[js.Any])
      )
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      taskStatistics.foreach(__v => __obj.updateDynamic("taskStatistics")(__v.asInstanceOf[js.Any]))
      taskStatus.foreach(__v => __obj.updateDynamic("taskStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAuditMitigationActionsTaskResponse]
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

  /**
    * The input for the DescribeCACertificate operation.
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

  /**
    * The output from the DescribeCACertificate operation.
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

  /**
    * The input for the DescribeCertificate operation.
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

  /**
    * The output of the DescribeCertificate operation.
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
  trait DescribeDefaultAuthorizerRequest extends js.Object {}

  object DescribeDefaultAuthorizerRequest {
    @inline
    def apply(
        ): DescribeDefaultAuthorizerRequest = {
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

  /**
    * The input for the DescribeEndpoint operation.
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

  /**
    * The output from the DescribeEndpoint operation.
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
  trait DescribeEventConfigurationsRequest extends js.Object {}

  object DescribeEventConfigurationsRequest {
    @inline
    def apply(
        ): DescribeEventConfigurationsRequest = {
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
        "jobId"     -> jobId.asInstanceOf[js.Any],
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
      additionalMetricsToRetain.foreach(
        __v => __obj.updateDynamic("additionalMetricsToRetain")(__v.asInstanceOf[js.Any])
      )
      alertTargets.foreach(__v => __obj.updateDynamic("alertTargets")(__v.asInstanceOf[js.Any]))
      behaviors.foreach(__v => __obj.updateDynamic("behaviors")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      securityProfileArn.foreach(__v => __obj.updateDynamic("securityProfileArn")(__v.asInstanceOf[js.Any]))
      securityProfileDescription.foreach(
        __v => __obj.updateDynamic("securityProfileDescription")(__v.asInstanceOf[js.Any])
      )
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

  /**
    * The input for the DescribeThing operation.
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

  /**
    * The output from the DescribeThing operation.
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

  /**
    * The input for the DescribeThingType operation.
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

  /**
    * The output for the DescribeThingType operation.
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

  /**
    * Describes the location of the updated firmware.
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
        "target"     -> target.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachPolicyRequest]
    }
  }

  /**
    * The input for the DetachPrincipalPolicy operation.
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
        "principal"  -> principal.asInstanceOf[js.Any]
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
        "securityProfileName"      -> securityProfileName.asInstanceOf[js.Any],
        "securityProfileTargetArn" -> securityProfileTargetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachSecurityProfileRequest]
    }
  }

  @js.native
  trait DetachSecurityProfileResponse extends js.Object {}

  object DetachSecurityProfileResponse {
    @inline
    def apply(
        ): DetachSecurityProfileResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DetachSecurityProfileResponse]
    }
  }

  /**
    * The input for the DetachThingPrincipal operation.
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

  /**
    * The output from the DetachThingPrincipal operation.
    */
  @js.native
  trait DetachThingPrincipalResponse extends js.Object {}

  object DetachThingPrincipalResponse {
    @inline
    def apply(
        ): DetachThingPrincipalResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DetachThingPrincipalResponse]
    }
  }

  object DeviceCertificateUpdateActionEnum {
    val DEACTIVATE = "DEACTIVATE"

    val values = js.Object.freeze(js.Array(DEACTIVATE))
  }

  /**
    * The input for the DisableTopicRuleRequest operation.
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

  object DynamicGroupStatusEnum {
    val ACTIVE     = "ACTIVE"
    val BUILDING   = "BUILDING"
    val REBUILDING = "REBUILDING"

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
        "roleArn"      -> roleArn.asInstanceOf[js.Any],
        "tableName"    -> tableName.asInstanceOf[js.Any]
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

  /**
    * Describes an action to write to a DynamoDB table.
    *  This DynamoDB action writes each attribute in the message payload into it's own column in the DynamoDB table.
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

  object DynamoKeyTypeEnum {
    val STRING = "STRING"
    val NUMBER = "NUMBER"

    val values = js.Object.freeze(js.Array(STRING, NUMBER))
  }

  /**
    * The policy that has the effect on the authorization results.
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

  /**
    * Describes an action that writes data to an Amazon Elasticsearch Service domain.
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
        "id"       -> id.asInstanceOf[js.Any],
        "index"    -> index.asInstanceOf[js.Any],
        "roleArn"  -> roleArn.asInstanceOf[js.Any],
        "type"     -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ElasticsearchAction]
    }
  }

  /**
    * Parameters used when defining a mitigation action that enable AWS IoT logging.
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
        "logLevel"          -> logLevel.asInstanceOf[js.Any],
        "roleArnForLogging" -> roleArnForLogging.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableIoTLoggingParams]
    }
  }

  /**
    * The input for the EnableTopicRuleRequest operation.
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

  /**
    * Error information.
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

  object EventTypeEnum {
    val THING                  = "THING"
    val THING_GROUP            = "THING_GROUP"
    val THING_TYPE             = "THING_TYPE"
    val THING_GROUP_MEMBERSHIP = "THING_GROUP_MEMBERSHIP"
    val THING_GROUP_HIERARCHY  = "THING_GROUP_HIERARCHY"
    val THING_TYPE_ASSOCIATION = "THING_TYPE_ASSOCIATION"
    val JOB                    = "JOB"
    val JOB_EXECUTION          = "JOB_EXECUTION"
    val POLICY                 = "POLICY"
    val CERTIFICATE            = "CERTIFICATE"
    val CA_CERTIFICATE         = "CA_CERTIFICATE"

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

  /**
    * Allows you to create an exponential rate of rollout for a job.
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
        "baseRatePerMinute"    -> baseRatePerMinute.asInstanceOf[js.Any],
        "incrementFactor"      -> incrementFactor.asInstanceOf[js.Any],
        "rateIncreaseCriteria" -> rateIncreaseCriteria.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExponentialRolloutRate]
    }
  }

  /**
    * The location of the OTA update.
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

  /**
    * Describes an action that writes data to an Amazon Kinesis Firehose stream.
    */
  @js.native
  trait FirehoseAction extends js.Object {
    var deliveryStreamName: DeliveryStreamName
    var roleArn: AwsArn
    var separator: js.UndefOr[FirehoseSeparator]
  }

  object FirehoseAction {
    @inline
    def apply(
        deliveryStreamName: DeliveryStreamName,
        roleArn: AwsArn,
        separator: js.UndefOr[FirehoseSeparator] = js.undefined
    ): FirehoseAction = {
      val __obj = js.Dynamic.literal(
        "deliveryStreamName" -> deliveryStreamName.asInstanceOf[js.Any],
        "roleArn"            -> roleArn.asInstanceOf[js.Any]
      )

      separator.foreach(__v => __obj.updateDynamic("separator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirehoseAction]
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
  trait GetIndexingConfigurationRequest extends js.Object {}

  object GetIndexingConfigurationRequest {
    @inline
    def apply(
        ): GetIndexingConfigurationRequest = {
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
      thingGroupIndexingConfiguration.foreach(
        __v => __obj.updateDynamic("thingGroupIndexingConfiguration")(__v.asInstanceOf[js.Any])
      )
      thingIndexingConfiguration.foreach(
        __v => __obj.updateDynamic("thingIndexingConfiguration")(__v.asInstanceOf[js.Any])
      )
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

  /**
    * The input for the GetLoggingOptions operation.
    */
  @js.native
  trait GetLoggingOptionsRequest extends js.Object {}

  object GetLoggingOptionsRequest {
    @inline
    def apply(
        ): GetLoggingOptionsRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetLoggingOptionsRequest]
    }
  }

  /**
    * The output from the GetLoggingOptions operation.
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

  /**
    * The input for the GetPolicy operation.
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

  /**
    * The output from the GetPolicy operation.
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

  /**
    * The input for the GetPolicyVersion operation.
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
        "policyName"      -> policyName.asInstanceOf[js.Any],
        "policyVersionId" -> policyVersionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPolicyVersionRequest]
    }
  }

  /**
    * The output from the GetPolicyVersion operation.
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

  /**
    * The input to the GetRegistrationCode operation.
    */
  @js.native
  trait GetRegistrationCodeRequest extends js.Object {}

  object GetRegistrationCodeRequest {
    @inline
    def apply(
        ): GetRegistrationCodeRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetRegistrationCodeRequest]
    }
  }

  /**
    * The output from the GetRegistrationCode operation.
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

  /**
    * The input for the GetTopicRule operation.
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

  /**
    * The output from the GetTopicRule operation.
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
  trait GetV2LoggingOptionsRequest extends js.Object {}

  object GetV2LoggingOptionsRequest {
    @inline
    def apply(
        ): GetV2LoggingOptionsRequest = {
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

  /**
    * The name and ARN of a group.
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

  /**
    * Information that implicitly denies authorization. When policy doesn't explicitly deny or allow an action on a resource it is considered an implicit deny.
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

  object IndexStatusEnum {
    val ACTIVE     = "ACTIVE"
    val BUILDING   = "BUILDING"
    val REBUILDING = "REBUILDING"

    val values = js.Object.freeze(js.Array(ACTIVE, BUILDING, REBUILDING))
  }

  /**
    * Sends message data to an AWS IoT Analytics channel.
    */
  @js.native
  trait IotAnalyticsAction extends js.Object {
    var channelArn: js.UndefOr[AwsArn]
    var channelName: js.UndefOr[ChannelName]
    var roleArn: js.UndefOr[AwsArn]
  }

  object IotAnalyticsAction {
    @inline
    def apply(
        channelArn: js.UndefOr[AwsArn] = js.undefined,
        channelName: js.UndefOr[ChannelName] = js.undefined,
        roleArn: js.UndefOr[AwsArn] = js.undefined
    ): IotAnalyticsAction = {
      val __obj = js.Dynamic.literal()
      channelArn.foreach(__v => __obj.updateDynamic("channelArn")(__v.asInstanceOf[js.Any]))
      channelName.foreach(__v => __obj.updateDynamic("channelName")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IotAnalyticsAction]
    }
  }

  /**
    * Sends an input to an AWS IoT Events detector.
    */
  @js.native
  trait IotEventsAction extends js.Object {
    var inputName: InputName
    var roleArn: AwsArn
    var messageId: js.UndefOr[MessageId]
  }

  object IotEventsAction {
    @inline
    def apply(
        inputName: InputName,
        roleArn: AwsArn,
        messageId: js.UndefOr[MessageId] = js.undefined
    ): IotEventsAction = {
      val __obj = js.Dynamic.literal(
        "inputName" -> inputName.asInstanceOf[js.Any],
        "roleArn"   -> roleArn.asInstanceOf[js.Any]
      )

      messageId.foreach(__v => __obj.updateDynamic("messageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IotEventsAction]
    }
  }

  /**
    * The <code>Job</code> object contains details about a job.
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
      jobExecutionsRolloutConfig.foreach(
        __v => __obj.updateDynamic("jobExecutionsRolloutConfig")(__v.asInstanceOf[js.Any])
      )
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      jobProcessDetails.foreach(__v => __obj.updateDynamic("jobProcessDetails")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      presignedUrlConfig.foreach(__v => __obj.updateDynamic("presignedUrlConfig")(__v.asInstanceOf[js.Any]))
      reasonCode.foreach(__v => __obj.updateDynamic("reasonCode")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      targetSelection.foreach(__v => __obj.updateDynamic("targetSelection")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      timeoutConfig.foreach(__v => __obj.updateDynamic("timeoutConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /**
    * The job execution object represents the execution of a job on a particular device.
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
      approximateSecondsBeforeTimedOut.foreach(
        __v => __obj.updateDynamic("approximateSecondsBeforeTimedOut")(__v.asInstanceOf[js.Any])
      )
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

  object JobExecutionFailureTypeEnum {
    val FAILED    = "FAILED"
    val REJECTED  = "REJECTED"
    val TIMED_OUT = "TIMED_OUT"
    val ALL       = "ALL"

    val values = js.Object.freeze(js.Array(FAILED, REJECTED, TIMED_OUT, ALL))
  }

  object JobExecutionStatusEnum {
    val QUEUED      = "QUEUED"
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED   = "SUCCEEDED"
    val FAILED      = "FAILED"
    val TIMED_OUT   = "TIMED_OUT"
    val REJECTED    = "REJECTED"
    val REMOVED     = "REMOVED"
    val CANCELED    = "CANCELED"

    val values =
      js.Object.freeze(js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED))
  }

  /**
    * Details of the job execution status.
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

  /**
    * The job execution summary.
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

  /**
    * Contains a summary of information about job executions for a specific job.
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

  /**
    * The job execution summary for a thing.
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

  /**
    * Allows you to create a staged rollout of a job.
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

  /**
    * The job process details.
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

  object JobStatusEnum {
    val IN_PROGRESS          = "IN_PROGRESS"
    val CANCELED             = "CANCELED"
    val COMPLETED            = "COMPLETED"
    val DELETION_IN_PROGRESS = "DELETION_IN_PROGRESS"

    val values = js.Object.freeze(js.Array(IN_PROGRESS, CANCELED, COMPLETED, DELETION_IN_PROGRESS))
  }

  /**
    * The job summary.
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

  /**
    * Describes a key pair.
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

  /**
    * Describes an action to write data to an Amazon Kinesis stream.
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
        "roleArn"    -> roleArn.asInstanceOf[js.Any],
        "streamName" -> streamName.asInstanceOf[js.Any]
      )

      partitionKey.foreach(__v => __obj.updateDynamic("partitionKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisAction]
    }
  }

  /**
    * Describes an action to invoke a Lambda function.
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
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[DeviceDefenderThingName]
  }

  object ListActiveViolationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined
    ): ListActiveViolationsRequest = {
      val __obj = js.Dynamic.literal()
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
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        taskId: js.UndefOr[AuditTaskId] = js.undefined
    ): ListAuditFindingsRequest = {
      val __obj = js.Dynamic.literal()
      checkName.foreach(__v => __obj.updateDynamic("checkName")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
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
    var taskId: AuditMitigationActionsTaskId
    var actionStatus: js.UndefOr[AuditMitigationActionsExecutionStatus]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAuditMitigationActionsExecutionsRequest {
    @inline
    def apply(
        findingId: FindingId,
        taskId: AuditMitigationActionsTaskId,
        actionStatus: js.UndefOr[AuditMitigationActionsExecutionStatus] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAuditMitigationActionsExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "findingId" -> findingId.asInstanceOf[js.Any],
        "taskId"    -> taskId.asInstanceOf[js.Any]
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
        "endTime"   -> endTime.asInstanceOf[js.Any],
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
        "endTime"   -> endTime.asInstanceOf[js.Any],
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

  /**
    * Input for the ListCACertificates operation.
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

  /**
    * The output from the ListCACertificates operation.
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

  /**
    * The input to the ListCertificatesByCA operation.
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

  /**
    * The output of the ListCertificatesByCA operation.
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

  /**
    * The input for the ListCertificates operation.
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

  /**
    * The output of the ListCertificates operation.
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
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[JobExecutionStatus]
  }

  object ListJobExecutionsForThingRequest {
    @inline
    def apply(
        thingName: ThingName,
        maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[JobExecutionStatus] = js.undefined
    ): ListJobExecutionsForThingRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
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
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[JobStatus] = js.undefined,
        targetSelection: js.UndefOr[TargetSelection] = js.undefined,
        thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
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

  /**
    * The input to the ListOutgoingCertificates operation.
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

  /**
    * The output from the ListOutgoingCertificates operation.
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

  /**
    * The input for the ListPolicies operation.
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

  /**
    * The output from the ListPolicies operation.
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

  /**
    * The input for the ListPolicyPrincipals operation.
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

  /**
    * The output from the ListPolicyPrincipals operation.
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

  /**
    * The input for the ListPolicyVersions operation.
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

  /**
    * The output from the ListPolicyVersions operation.
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

  /**
    * The input for the ListPrincipalPolicies operation.
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

  /**
    * The output from the ListPrincipalPolicies operation.
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

  /**
    * The input for the ListPrincipalThings operation.
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

  /**
    * The output from the ListPrincipalThings operation.
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
      securityProfileTargetMappings.foreach(
        __v => __obj.updateDynamic("securityProfileTargetMappings")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListSecurityProfilesForTargetResponse]
    }
  }

  @js.native
  trait ListSecurityProfilesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSecurityProfilesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSecurityProfilesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
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
      securityProfileIdentifiers.foreach(
        __v => __obj.updateDynamic("securityProfileIdentifiers")(__v.asInstanceOf[js.Any])
      )
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

  /**
    * The input for the ListThingPrincipal operation.
    */
  @js.native
  trait ListThingPrincipalsRequest extends js.Object {
    var thingName: ThingName
  }

  object ListThingPrincipalsRequest {
    @inline
    def apply(
        thingName: ThingName
    ): ListThingPrincipalsRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListThingPrincipalsRequest]
    }
  }

  /**
    * The output from the ListThingPrincipals operation.
    */
  @js.native
  trait ListThingPrincipalsResponse extends js.Object {
    var principals: js.UndefOr[Principals]
  }

  object ListThingPrincipalsResponse {
    @inline
    def apply(
        principals: js.UndefOr[Principals] = js.undefined
    ): ListThingPrincipalsResponse = {
      val __obj = js.Dynamic.literal()
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
        "taskId"     -> taskId.asInstanceOf[js.Any]
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

  /**
    * The input for the ListThingTypes operation.
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

  /**
    * The output for the ListThingTypes operation.
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

  /**
    * The input for the ListThings operation.
    */
  @js.native
  trait ListThingsRequest extends js.Object {
    var attributeName: js.UndefOr[AttributeName]
    var attributeValue: js.UndefOr[AttributeValue]
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var thingTypeName: js.UndefOr[ThingTypeName]
  }

  object ListThingsRequest {
    @inline
    def apply(
        attributeName: js.UndefOr[AttributeName] = js.undefined,
        attributeValue: js.UndefOr[AttributeValue] = js.undefined,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    ): ListThingsRequest = {
      val __obj = js.Dynamic.literal()
      attributeName.foreach(__v => __obj.updateDynamic("attributeName")(__v.asInstanceOf[js.Any]))
      attributeValue.foreach(__v => __obj.updateDynamic("attributeValue")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      thingTypeName.foreach(__v => __obj.updateDynamic("thingTypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThingsRequest]
    }
  }

  /**
    * The output from the ListThings operation.
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

  /**
    * The input for the ListTopicRules operation.
    */
  @js.native
  trait ListTopicRulesRequest extends js.Object {
    var maxResults: js.UndefOr[GEMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var ruleDisabled: js.UndefOr[IsDisabled]
    var topic: js.UndefOr[Topic]
  }

  object ListTopicRulesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[GEMaxResults] = js.undefined,
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

  /**
    * The output from the ListTopicRules operation.
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
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined
    ): ListViolationEventsRequest = {
      val __obj = js.Dynamic.literal(
        "endTime"   -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

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

  object LogLevelEnum {
    val DEBUG    = "DEBUG"
    val INFO     = "INFO"
    val ERROR    = "ERROR"
    val WARN     = "WARN"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(DEBUG, INFO, ERROR, WARN, DISABLED))
  }

  /**
    * A log target.
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

  /**
    * The target configuration.
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

  object LogTargetTypeEnum {
    val DEFAULT     = "DEFAULT"
    val THING_GROUP = "THING_GROUP"

    val values = js.Object.freeze(js.Array(DEFAULT, THING_GROUP))
  }

  /**
    * Describes the logging options payload.
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

  object MessageFormatEnum {
    val RAW  = "RAW"
    val JSON = "JSON"

    val values = js.Object.freeze(js.Array(RAW, JSON))
  }

  /**
    * The value to be compared with the <code>metric</code>.
    */
  @js.native
  trait MetricValue extends js.Object {
    var cidrs: js.UndefOr[Cidrs]
    var count: js.UndefOr[UnsignedLong]
    var ports: js.UndefOr[Ports]
  }

  object MetricValue {
    @inline
    def apply(
        cidrs: js.UndefOr[Cidrs] = js.undefined,
        count: js.UndefOr[UnsignedLong] = js.undefined,
        ports: js.UndefOr[Ports] = js.undefined
    ): MetricValue = {
      val __obj = js.Dynamic.literal()
      cidrs.foreach(__v => __obj.updateDynamic("cidrs")(__v.asInstanceOf[js.Any]))
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      ports.foreach(__v => __obj.updateDynamic("ports")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricValue]
    }
  }

  /**
    * Describes which changes should be applied as part of a mitigation action.
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

  /**
    * Information that identifies a mitigation action. This information is returned by ListMitigationActions.
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

  /**
    * The set of parameters for this mitigation action. You can specify only one type of parameter (in other words, you can apply only one action for each defined mitigation action).
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
      addThingsToThingGroupParams.foreach(
        __v => __obj.updateDynamic("addThingsToThingGroupParams")(__v.asInstanceOf[js.Any])
      )
      enableIoTLoggingParams.foreach(__v => __obj.updateDynamic("enableIoTLoggingParams")(__v.asInstanceOf[js.Any]))
      publishFindingToSnsParams.foreach(
        __v => __obj.updateDynamic("publishFindingToSnsParams")(__v.asInstanceOf[js.Any])
      )
      replaceDefaultPolicyVersionParams.foreach(
        __v => __obj.updateDynamic("replaceDefaultPolicyVersionParams")(__v.asInstanceOf[js.Any])
      )
      updateCACertificateParams.foreach(
        __v => __obj.updateDynamic("updateCACertificateParams")(__v.asInstanceOf[js.Any])
      )
      updateDeviceCertificateParams.foreach(
        __v => __obj.updateDynamic("updateDeviceCertificateParams")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[MitigationActionParams]
    }
  }

  object MitigationActionTypeEnum {
    val UPDATE_DEVICE_CERTIFICATE      = "UPDATE_DEVICE_CERTIFICATE"
    val UPDATE_CA_CERTIFICATE          = "UPDATE_CA_CERTIFICATE"
    val ADD_THINGS_TO_THING_GROUP      = "ADD_THINGS_TO_THING_GROUP"
    val REPLACE_DEFAULT_POLICY_VERSION = "REPLACE_DEFAULT_POLICY_VERSION"
    val ENABLE_IOT_LOGGING             = "ENABLE_IOT_LOGGING"
    val PUBLISH_FINDING_TO_SNS         = "PUBLISH_FINDING_TO_SNS"

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
    * Information about the resource that was noncompliant with the audit check.
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

  /**
    * Describes a file to be associated with an OTA update.
    */
  @js.native
  trait OTAUpdateFile extends js.Object {
    var attributes: js.UndefOr[AttributesMap]
    var codeSigning: js.UndefOr[CodeSigning]
    var fileLocation: js.UndefOr[FileLocation]
    var fileName: js.UndefOr[FileName]
    var fileVersion: js.UndefOr[OTAUpdateFileVersion]
  }

  object OTAUpdateFile {
    @inline
    def apply(
        attributes: js.UndefOr[AttributesMap] = js.undefined,
        codeSigning: js.UndefOr[CodeSigning] = js.undefined,
        fileLocation: js.UndefOr[FileLocation] = js.undefined,
        fileName: js.UndefOr[FileName] = js.undefined,
        fileVersion: js.UndefOr[OTAUpdateFileVersion] = js.undefined
    ): OTAUpdateFile = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      codeSigning.foreach(__v => __obj.updateDynamic("codeSigning")(__v.asInstanceOf[js.Any]))
      fileLocation.foreach(__v => __obj.updateDynamic("fileLocation")(__v.asInstanceOf[js.Any]))
      fileName.foreach(__v => __obj.updateDynamic("fileName")(__v.asInstanceOf[js.Any]))
      fileVersion.foreach(__v => __obj.updateDynamic("fileVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OTAUpdateFile]
    }
  }

  /**
    * Information about an OTA update.
    */
  @js.native
  trait OTAUpdateInfo extends js.Object {
    var additionalParameters: js.UndefOr[AdditionalParameterMap]
    var awsIotJobArn: js.UndefOr[AwsIotJobArn]
    var awsIotJobId: js.UndefOr[AwsIotJobId]
    var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig]
    var creationDate: js.UndefOr[DateType]
    var description: js.UndefOr[OTAUpdateDescription]
    var errorInfo: js.UndefOr[ErrorInfo]
    var lastModifiedDate: js.UndefOr[DateType]
    var otaUpdateArn: js.UndefOr[OTAUpdateArn]
    var otaUpdateFiles: js.UndefOr[OTAUpdateFiles]
    var otaUpdateId: js.UndefOr[OTAUpdateId]
    var otaUpdateStatus: js.UndefOr[OTAUpdateStatus]
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
        creationDate: js.UndefOr[DateType] = js.undefined,
        description: js.UndefOr[OTAUpdateDescription] = js.undefined,
        errorInfo: js.UndefOr[ErrorInfo] = js.undefined,
        lastModifiedDate: js.UndefOr[DateType] = js.undefined,
        otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined,
        otaUpdateFiles: js.UndefOr[OTAUpdateFiles] = js.undefined,
        otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined,
        otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined,
        targetSelection: js.UndefOr[TargetSelection] = js.undefined,
        targets: js.UndefOr[Targets] = js.undefined
    ): OTAUpdateInfo = {
      val __obj = js.Dynamic.literal()
      additionalParameters.foreach(__v => __obj.updateDynamic("additionalParameters")(__v.asInstanceOf[js.Any]))
      awsIotJobArn.foreach(__v => __obj.updateDynamic("awsIotJobArn")(__v.asInstanceOf[js.Any]))
      awsIotJobId.foreach(__v => __obj.updateDynamic("awsIotJobId")(__v.asInstanceOf[js.Any]))
      awsJobExecutionsRolloutConfig.foreach(
        __v => __obj.updateDynamic("awsJobExecutionsRolloutConfig")(__v.asInstanceOf[js.Any])
      )
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      errorInfo.foreach(__v => __obj.updateDynamic("errorInfo")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      otaUpdateArn.foreach(__v => __obj.updateDynamic("otaUpdateArn")(__v.asInstanceOf[js.Any]))
      otaUpdateFiles.foreach(__v => __obj.updateDynamic("otaUpdateFiles")(__v.asInstanceOf[js.Any]))
      otaUpdateId.foreach(__v => __obj.updateDynamic("otaUpdateId")(__v.asInstanceOf[js.Any]))
      otaUpdateStatus.foreach(__v => __obj.updateDynamic("otaUpdateStatus")(__v.asInstanceOf[js.Any]))
      targetSelection.foreach(__v => __obj.updateDynamic("targetSelection")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OTAUpdateInfo]
    }
  }

  object OTAUpdateStatusEnum {
    val CREATE_PENDING     = "CREATE_PENDING"
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val CREATE_COMPLETE    = "CREATE_COMPLETE"
    val CREATE_FAILED      = "CREATE_FAILED"

    val values = js.Object.freeze(js.Array(CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED))
  }

  /**
    * An OTA update summary.
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

  /**
    * A certificate that has been transferred but not yet accepted.
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

  /**
    * Describes an AWS IoT policy.
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

  object PolicyTemplateNameEnum {
    val BLANK_POLICY = "BLANK_POLICY"

    val values = js.Object.freeze(js.Array(BLANK_POLICY))
  }

  /**
    * Describes a policy version.
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

  /**
    * Information about the version of the policy associated with the resource.
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

  /**
    * Configuration for pre-signed S3 URLs.
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

  /**
    * Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom actions in response to the Amazon SNS messages.
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

  /**
    * The input for the DynamoActionVS action that specifies the DynamoDB table to which the message data will be written.
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

  /**
    * Allows you to define a criteria to initiate the increase in rate of rollout for a job.
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

  /**
    * The input to the RegisterCACertificate operation.
    */
  @js.native
  trait RegisterCACertificateRequest extends js.Object {
    var caCertificate: CertificatePem
    var verificationCertificate: CertificatePem
    var allowAutoRegistration: js.UndefOr[AllowAutoRegistration]
    var registrationConfig: js.UndefOr[RegistrationConfig]
    var setAsActive: js.UndefOr[SetAsActive]
  }

  object RegisterCACertificateRequest {
    @inline
    def apply(
        caCertificate: CertificatePem,
        verificationCertificate: CertificatePem,
        allowAutoRegistration: js.UndefOr[AllowAutoRegistration] = js.undefined,
        registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined,
        setAsActive: js.UndefOr[SetAsActive] = js.undefined
    ): RegisterCACertificateRequest = {
      val __obj = js.Dynamic.literal(
        "caCertificate"           -> caCertificate.asInstanceOf[js.Any],
        "verificationCertificate" -> verificationCertificate.asInstanceOf[js.Any]
      )

      allowAutoRegistration.foreach(__v => __obj.updateDynamic("allowAutoRegistration")(__v.asInstanceOf[js.Any]))
      registrationConfig.foreach(__v => __obj.updateDynamic("registrationConfig")(__v.asInstanceOf[js.Any]))
      setAsActive.foreach(__v => __obj.updateDynamic("setAsActive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterCACertificateRequest]
    }
  }

  /**
    * The output from the RegisterCACertificateResponse operation.
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

  /**
    * The input to the RegisterCertificate operation.
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

  /**
    * The output from the RegisterCertificate operation.
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

  /**
    * The registration configuration.
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

  /**
    * The input for the RejectCertificateTransfer operation.
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

  /**
    * Information about a related resource.
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
  trait RemoveThingFromBillingGroupResponse extends js.Object {}

  object RemoveThingFromBillingGroupResponse {
    @inline
    def apply(
        ): RemoveThingFromBillingGroupResponse = {
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
  trait RemoveThingFromThingGroupResponse extends js.Object {}

  object RemoveThingFromThingGroupResponse {
    @inline
    def apply(
        ): RemoveThingFromThingGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RemoveThingFromThingGroupResponse]
    }
  }

  /**
    * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
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

  /**
    * The input for the ReplaceTopicRule operation.
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
        "ruleName"         -> ruleName.asInstanceOf[js.Any],
        "topicRulePayload" -> topicRulePayload.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReplaceTopicRuleRequest]
    }
  }

  object ReportTypeEnum {
    val ERRORS  = "ERRORS"
    val RESULTS = "RESULTS"

    val values = js.Object.freeze(js.Array(ERRORS, RESULTS))
  }

  /**
    * Describes an action to republish to another topic.
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
        "topic"   -> topic.asInstanceOf[js.Any]
      )

      qos.foreach(__v => __obj.updateDynamic("qos")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepublishAction]
    }
  }

  /**
    * Information that identifies the noncompliant resource.
    */
  @js.native
  trait ResourceIdentifier extends js.Object {
    var account: js.UndefOr[AwsAccountId]
    var caCertificateId: js.UndefOr[CertificateId]
    var clientId: js.UndefOr[ClientId]
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId]
    var deviceCertificateId: js.UndefOr[CertificateId]
    var policyVersionIdentifier: js.UndefOr[PolicyVersionIdentifier]
  }

  object ResourceIdentifier {
    @inline
    def apply(
        account: js.UndefOr[AwsAccountId] = js.undefined,
        caCertificateId: js.UndefOr[CertificateId] = js.undefined,
        clientId: js.UndefOr[ClientId] = js.undefined,
        cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined,
        deviceCertificateId: js.UndefOr[CertificateId] = js.undefined,
        policyVersionIdentifier: js.UndefOr[PolicyVersionIdentifier] = js.undefined
    ): ResourceIdentifier = {
      val __obj = js.Dynamic.literal()
      account.foreach(__v => __obj.updateDynamic("account")(__v.asInstanceOf[js.Any]))
      caCertificateId.foreach(__v => __obj.updateDynamic("caCertificateId")(__v.asInstanceOf[js.Any]))
      clientId.foreach(__v => __obj.updateDynamic("clientId")(__v.asInstanceOf[js.Any]))
      cognitoIdentityPoolId.foreach(__v => __obj.updateDynamic("cognitoIdentityPoolId")(__v.asInstanceOf[js.Any]))
      deviceCertificateId.foreach(__v => __obj.updateDynamic("deviceCertificateId")(__v.asInstanceOf[js.Any]))
      policyVersionIdentifier.foreach(__v => __obj.updateDynamic("policyVersionIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceIdentifier]
    }
  }

  object ResourceTypeEnum {
    val DEVICE_CERTIFICATE    = "DEVICE_CERTIFICATE"
    val CA_CERTIFICATE        = "CA_CERTIFICATE"
    val IOT_POLICY            = "IOT_POLICY"
    val COGNITO_IDENTITY_POOL = "COGNITO_IDENTITY_POOL"
    val CLIENT_ID             = "CLIENT_ID"
    val ACCOUNT_SETTINGS      = "ACCOUNT_SETTINGS"

    val values = js.Object.freeze(
      js.Array(DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY, COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS)
    )
  }

  /**
    * Role alias description.
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
      credentialDurationSeconds.foreach(
        __v => __obj.updateDynamic("credentialDurationSeconds")(__v.asInstanceOf[js.Any])
      )
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      roleAlias.foreach(__v => __obj.updateDynamic("roleAlias")(__v.asInstanceOf[js.Any]))
      roleAliasArn.foreach(__v => __obj.updateDynamic("roleAliasArn")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoleAliasDescription]
    }
  }

  /**
    * Describes an action to write data to an Amazon S3 bucket.
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
        "key"        -> key.asInstanceOf[js.Any],
        "roleArn"    -> roleArn.asInstanceOf[js.Any]
      )

      cannedAcl.foreach(__v => __obj.updateDynamic("cannedAcl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Action]
    }
  }

  /**
    * Describes the location of updated firmware in S3.
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

  /**
    * The S3 location.
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

  /**
    * Describes an action to write a message to a Salesforce IoT Cloud Input Stream.
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
        "url"   -> url.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SalesforceAction]
    }
  }

  /**
    * Information about the scheduled audit.
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

  /**
    * Identifying information for a Device Defender security profile.
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
        "arn"  -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SecurityProfileIdentifier]
    }
  }

  /**
    * A target to which an alert is sent when a security profile behavior is violated.
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

  /**
    * Information about a security profile and the target associated with it.
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
      securityProfileIdentifier.foreach(
        __v => __obj.updateDynamic("securityProfileIdentifier")(__v.asInstanceOf[js.Any])
      )
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityProfileTargetMapping]
    }
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

  /**
    * The input for the SetDefaultPolicyVersion operation.
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
        "policyName"      -> policyName.asInstanceOf[js.Any],
        "policyVersionId" -> policyVersionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetDefaultPolicyVersionRequest]
    }
  }

  /**
    * The input for the SetLoggingOptions operation.
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
        "logLevel"  -> logLevel.asInstanceOf[js.Any],
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

  /**
    * Describes the code-signing profile.
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

  /**
    * Describes an action to publish to an Amazon SNS topic.
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
        "roleArn"   -> roleArn.asInstanceOf[js.Any],
        "targetArn" -> targetArn.asInstanceOf[js.Any]
      )

      messageFormat.foreach(__v => __obj.updateDynamic("messageFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnsAction]
    }
  }

  /**
    * Describes an action to publish data to an Amazon SQS queue.
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
        "roleArn"  -> roleArn.asInstanceOf[js.Any]
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
    var taskId: AuditMitigationActionsTaskId
  }

  object StartAuditMitigationActionsTaskRequest {
    @inline
    def apply(
        auditCheckToActionsMapping: AuditCheckToActionsMapping,
        clientRequestToken: ClientRequestToken,
        target: AuditMitigationActionsTaskTarget,
        taskId: AuditMitigationActionsTaskId
    ): StartAuditMitigationActionsTaskRequest = {
      val __obj = js.Dynamic.literal(
        "auditCheckToActionsMapping" -> auditCheckToActionsMapping.asInstanceOf[js.Any],
        "clientRequestToken"         -> clientRequestToken.asInstanceOf[js.Any],
        "target"                     -> target.asInstanceOf[js.Any],
        "taskId"                     -> taskId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartAuditMitigationActionsTaskRequest]
    }
  }

  @js.native
  trait StartAuditMitigationActionsTaskResponse extends js.Object {
    var taskId: js.UndefOr[AuditMitigationActionsTaskId]
  }

  object StartAuditMitigationActionsTaskResponse {
    @inline
    def apply(
        taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.undefined
    ): StartAuditMitigationActionsTaskResponse = {
      val __obj = js.Dynamic.literal()
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAuditMitigationActionsTaskResponse]
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

  /**
    * Information required to start a signing job.
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
        "inputFileKey"    -> inputFileKey.asInstanceOf[js.Any],
        "roleArn"         -> roleArn.asInstanceOf[js.Any],
        "templateBody"    -> templateBody.asInstanceOf[js.Any]
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

  /**
    * A statistical ranking (percentile) which indicates a threshold value by which a behavior is determined to be in compliance or in violation of the behavior.
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

  /**
    * A map of key-value pairs for all supported statistics. Currently, only count is supported.
    */
  @js.native
  trait Statistics extends js.Object {
    var count: js.UndefOr[Count]
  }

  object Statistics {
    @inline
    def apply(
        count: js.UndefOr[Count] = js.undefined
    ): Statistics = {
      val __obj = js.Dynamic.literal()
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Statistics]
    }
  }

  object StatusEnum {
    val InProgress = "InProgress"
    val Completed  = "Completed"
    val Failed     = "Failed"
    val Cancelled  = "Cancelled"
    val Cancelling = "Cancelling"

    val values = js.Object.freeze(js.Array(InProgress, Completed, Failed, Cancelled, Cancelling))
  }

  /**
    * Starts execution of a Step Functions state machine.
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
        "roleArn"          -> roleArn.asInstanceOf[js.Any],
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
  trait StopThingRegistrationTaskResponse extends js.Object {}

  object StopThingRegistrationTaskResponse {
    @inline
    def apply(
        ): StopThingRegistrationTaskResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StopThingRegistrationTaskResponse]
    }
  }

  /**
    * Describes a group of files that can be streamed.
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

  /**
    * Represents a file to stream.
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

  /**
    * Information about a stream.
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

  /**
    * A summary of a stream.
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

  /**
    * A set of key/value pairs that are used to manage the resource.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
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
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  object TargetSelectionEnum {
    val CONTINUOUS = "CONTINUOUS"
    val SNAPSHOT   = "SNAPSHOT"

    val values = js.Object.freeze(js.Array(CONTINUOUS, SNAPSHOT))
  }

  /**
    * Statistics for the checks performed during the audit.
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
      waitingForDataCollectionChecks.foreach(
        __v => __obj.updateDynamic("waitingForDataCollectionChecks")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[TaskStatistics]
    }
  }

  /**
    * Provides summary counts of how many tasks for findings are in a particular state. This information is included in the response from DescribeAuditMitigationActionsTask.
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
    var token: Token
    var tokenSignature: TokenSignature
  }

  object TestInvokeAuthorizerRequest {
    @inline
    def apply(
        authorizerName: AuthorizerName,
        token: Token,
        tokenSignature: TokenSignature
    ): TestInvokeAuthorizerRequest = {
      val __obj = js.Dynamic.literal(
        "authorizerName" -> authorizerName.asInstanceOf[js.Any],
        "token"          -> token.asInstanceOf[js.Any],
        "tokenSignature" -> tokenSignature.asInstanceOf[js.Any]
      )

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

  /**
    * The properties of the thing, including thing name, thing type name, and a list of thing attributes.
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

  /**
    * The connectivity status of the thing.
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

  object ThingConnectivityIndexingModeEnum {
    val OFF    = "OFF"
    val STATUS = "STATUS"

    val values = js.Object.freeze(js.Array(OFF, STATUS))
  }

  /**
    * The thing search index document.
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

  /**
    * The thing group search index document.
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

  /**
    * Thing group indexing configuration.
    */
  @js.native
  trait ThingGroupIndexingConfiguration extends js.Object {
    var thingGroupIndexingMode: ThingGroupIndexingMode
  }

  object ThingGroupIndexingConfiguration {
    @inline
    def apply(
        thingGroupIndexingMode: ThingGroupIndexingMode
    ): ThingGroupIndexingConfiguration = {
      val __obj = js.Dynamic.literal(
        "thingGroupIndexingMode" -> thingGroupIndexingMode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ThingGroupIndexingConfiguration]
    }
  }

  object ThingGroupIndexingModeEnum {
    val OFF = "OFF"
    val ON  = "ON"

    val values = js.Object.freeze(js.Array(OFF, ON))
  }

  /**
    * Thing group metadata.
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

  /**
    * Thing group properties.
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

  /**
    * The thing indexing configuration. For more information, see [[https://docs.aws.amazon.com/iot/latest/developerguide/managing-index.html|Managing Thing Indexing]].
    */
  @js.native
  trait ThingIndexingConfiguration extends js.Object {
    var thingIndexingMode: ThingIndexingMode
    var thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode]
  }

  object ThingIndexingConfiguration {
    @inline
    def apply(
        thingIndexingMode: ThingIndexingMode,
        thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode] = js.undefined
    ): ThingIndexingConfiguration = {
      val __obj = js.Dynamic.literal(
        "thingIndexingMode" -> thingIndexingMode.asInstanceOf[js.Any]
      )

      thingConnectivityIndexingMode.foreach(
        __v => __obj.updateDynamic("thingConnectivityIndexingMode")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ThingIndexingConfiguration]
    }
  }

  object ThingIndexingModeEnum {
    val OFF                 = "OFF"
    val REGISTRY            = "REGISTRY"
    val REGISTRY_AND_SHADOW = "REGISTRY_AND_SHADOW"

    val values = js.Object.freeze(js.Array(OFF, REGISTRY, REGISTRY_AND_SHADOW))
  }

  /**
    * The definition of the thing type, including thing type name and description.
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

  /**
    * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when time was deprecated.
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

  /**
    * The ThingTypeProperties contains information about the thing type including: a thing type description, and a list of searchable thing attribute names.
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

  /**
    * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another terminal state before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.
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
      inProgressTimeoutInMinutes.foreach(
        __v => __obj.updateDynamic("inProgressTimeoutInMinutes")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[TimeoutConfig]
    }
  }

  /**
    * Describes a rule.
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

  /**
    * Describes a rule.
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

  /**
    * Describes a rule.
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
        "sql"     -> sql.asInstanceOf[js.Any]
      )

      awsIotSqlVersion.foreach(__v => __obj.updateDynamic("awsIotSqlVersion")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      errorAction.foreach(__v => __obj.updateDynamic("errorAction")(__v.asInstanceOf[js.Any]))
      ruleDisabled.foreach(__v => __obj.updateDynamic("ruleDisabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopicRulePayload]
    }
  }

  /**
    * The input for the TransferCertificate operation.
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
        "certificateId"    -> certificateId.asInstanceOf[js.Any],
        "targetAwsAccount" -> targetAwsAccount.asInstanceOf[js.Any]
      )

      transferMessage.foreach(__v => __obj.updateDynamic("transferMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransferCertificateRequest]
    }
  }

  /**
    * The output from the TransferCertificate operation.
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
      transferredCertificateArn.foreach(
        __v => __obj.updateDynamic("transferredCertificateArn")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[TransferCertificateResponse]
    }
  }

  /**
    * Data used to transfer a certificate to an AWS account.
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
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
        ): UntagResourceResponse = {
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
      auditNotificationTargetConfigurations.foreach(
        __v => __obj.updateDynamic("auditNotificationTargetConfigurations")(__v.asInstanceOf[js.Any])
      )
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountAuditConfigurationRequest]
    }
  }

  @js.native
  trait UpdateAccountAuditConfigurationResponse extends js.Object {}

  object UpdateAccountAuditConfigurationResponse {
    @inline
    def apply(
        ): UpdateAccountAuditConfigurationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateAccountAuditConfigurationResponse]
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
        "billingGroupName"       -> billingGroupName.asInstanceOf[js.Any],
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

  /**
    * Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
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

  /**
    * The input to the UpdateCACertificate operation.
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

      newAutoRegistrationStatus.foreach(
        __v => __obj.updateDynamic("newAutoRegistrationStatus")(__v.asInstanceOf[js.Any])
      )
      newStatus.foreach(__v => __obj.updateDynamic("newStatus")(__v.asInstanceOf[js.Any]))
      registrationConfig.foreach(__v => __obj.updateDynamic("registrationConfig")(__v.asInstanceOf[js.Any]))
      removeAutoRegistration.foreach(__v => __obj.updateDynamic("removeAutoRegistration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCACertificateRequest]
    }
  }

  /**
    * The input for the UpdateCertificate operation.
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
        "newStatus"     -> newStatus.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateCertificateRequest]
    }
  }

  /**
    * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
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
        "thingGroupName"       -> thingGroupName.asInstanceOf[js.Any],
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
  trait UpdateEventConfigurationsResponse extends js.Object {}

  object UpdateEventConfigurationsResponse {
    @inline
    def apply(
        ): UpdateEventConfigurationsResponse = {
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
      thingGroupIndexingConfiguration.foreach(
        __v => __obj.updateDynamic("thingGroupIndexingConfiguration")(__v.asInstanceOf[js.Any])
      )
      thingIndexingConfiguration.foreach(
        __v => __obj.updateDynamic("thingIndexingConfiguration")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[UpdateIndexingConfigurationRequest]
    }
  }

  @js.native
  trait UpdateIndexingConfigurationResponse extends js.Object {}

  object UpdateIndexingConfigurationResponse {
    @inline
    def apply(
        ): UpdateIndexingConfigurationResponse = {
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
        presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined,
        timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
    ): UpdateJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      abortConfig.foreach(__v => __obj.updateDynamic("abortConfig")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      jobExecutionsRolloutConfig.foreach(
        __v => __obj.updateDynamic("jobExecutionsRolloutConfig")(__v.asInstanceOf[js.Any])
      )
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

      credentialDurationSeconds.foreach(
        __v => __obj.updateDynamic("credentialDurationSeconds")(__v.asInstanceOf[js.Any])
      )
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

      additionalMetricsToRetain.foreach(
        __v => __obj.updateDynamic("additionalMetricsToRetain")(__v.asInstanceOf[js.Any])
      )
      alertTargets.foreach(__v => __obj.updateDynamic("alertTargets")(__v.asInstanceOf[js.Any]))
      behaviors.foreach(__v => __obj.updateDynamic("behaviors")(__v.asInstanceOf[js.Any]))
      deleteAdditionalMetricsToRetain.foreach(
        __v => __obj.updateDynamic("deleteAdditionalMetricsToRetain")(__v.asInstanceOf[js.Any])
      )
      deleteAlertTargets.foreach(__v => __obj.updateDynamic("deleteAlertTargets")(__v.asInstanceOf[js.Any]))
      deleteBehaviors.foreach(__v => __obj.updateDynamic("deleteBehaviors")(__v.asInstanceOf[js.Any]))
      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      securityProfileDescription.foreach(
        __v => __obj.updateDynamic("securityProfileDescription")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[UpdateSecurityProfileRequest]
    }
  }

  @js.native
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

  object UpdateSecurityProfileResponse {
    @inline
    def apply(
        additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined,
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
      additionalMetricsToRetain.foreach(
        __v => __obj.updateDynamic("additionalMetricsToRetain")(__v.asInstanceOf[js.Any])
      )
      alertTargets.foreach(__v => __obj.updateDynamic("alertTargets")(__v.asInstanceOf[js.Any]))
      behaviors.foreach(__v => __obj.updateDynamic("behaviors")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      securityProfileArn.foreach(__v => __obj.updateDynamic("securityProfileArn")(__v.asInstanceOf[js.Any]))
      securityProfileDescription.foreach(
        __v => __obj.updateDynamic("securityProfileDescription")(__v.asInstanceOf[js.Any])
      )
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
        "thingGroupName"       -> thingGroupName.asInstanceOf[js.Any],
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
  trait UpdateThingGroupsForThingResponse extends js.Object {}

  object UpdateThingGroupsForThingResponse {
    @inline
    def apply(
        ): UpdateThingGroupsForThingResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateThingGroupsForThingResponse]
    }
  }

  /**
    * The input for the UpdateThing operation.
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

  /**
    * The output from the UpdateThing operation.
    */
  @js.native
  trait UpdateThingResponse extends js.Object {}

  object UpdateThingResponse {
    @inline
    def apply(
        ): UpdateThingResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateThingResponse]
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

  /**
    * Information about an error found in a behavior specification.
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

  /**
    * Information about a Device Defender security profile behavior violation.
    */
  @js.native
  trait ViolationEvent extends js.Object {
    var behavior: js.UndefOr[Behavior]
    var metricValue: js.UndefOr[MetricValue]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[DeviceDefenderThingName]
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
        violationEventTime: js.UndefOr[Timestamp] = js.undefined,
        violationEventType: js.UndefOr[ViolationEventType] = js.undefined,
        violationId: js.UndefOr[ViolationId] = js.undefined
    ): ViolationEvent = {
      val __obj = js.Dynamic.literal()
      behavior.foreach(__v => __obj.updateDynamic("behavior")(__v.asInstanceOf[js.Any]))
      metricValue.foreach(__v => __obj.updateDynamic("metricValue")(__v.asInstanceOf[js.Any]))
      securityProfileName.foreach(__v => __obj.updateDynamic("securityProfileName")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      violationEventTime.foreach(__v => __obj.updateDynamic("violationEventTime")(__v.asInstanceOf[js.Any]))
      violationEventType.foreach(__v => __obj.updateDynamic("violationEventType")(__v.asInstanceOf[js.Any]))
      violationId.foreach(__v => __obj.updateDynamic("violationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ViolationEvent]
    }
  }

  object ViolationEventTypeEnum {
    val `in-alarm`          = "in-alarm"
    val `alarm-cleared`     = "alarm-cleared"
    val `alarm-invalidated` = "alarm-invalidated"

    val values = js.Object.freeze(js.Array(`in-alarm`, `alarm-cleared`, `alarm-invalidated`))
  }
}
