package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object iot {
  type AbortAction                           = String
  type AbortCriteriaList                     = js.Array[AbortCriteria]
  type AbortThresholdPercentage              = Double
  type ActionList                            = js.Array[Action]
  type ActionType                            = String
  type ActiveViolations                      = js.Array[ActiveViolation]
  type AdditionalMetricsToRetainList         = js.Array[BehaviorMetric]
  type AdditionalParameterMap                = js.Dictionary[Value]
  type AggregationField                      = String
  type AlarmName                             = String
  type AlertTargetArn                        = String
  type AlertTargetType                       = String
  type AlertTargets                          = js.Dictionary[AlertTarget]
  type AllowAutoRegistration                 = Boolean
  type ApproximateSecondsBeforeTimedOut      = Double
  type AscendingOrder                        = Boolean
  type AttributeKey                          = String
  type AttributeName                         = String
  type AttributeValue                        = String
  type Attributes                            = js.Dictionary[AttributeValue]
  type AttributesMap                         = js.Dictionary[Value]
  type AuditCheckConfigurations              = js.Dictionary[AuditCheckConfiguration]
  type AuditCheckName                        = String
  type AuditCheckRunStatus                   = String
  type AuditDetails                          = js.Dictionary[AuditCheckDetails]
  type AuditFindingSeverity                  = String
  type AuditFindings                         = js.Array[AuditFinding]
  type AuditFrequency                        = String
  type AuditNotificationTargetConfigurations = js.Dictionary[AuditNotificationTarget]
  type AuditNotificationType                 = String
  type AuditTaskId                           = String
  type AuditTaskMetadataList                 = js.Array[AuditTaskMetadata]
  type AuditTaskStatus                       = String
  type AuditTaskType                         = String
  type AuthDecision                          = String
  type AuthInfos                             = js.Array[AuthInfo]
  type AuthResults                           = js.Array[AuthResult]
  type AuthorizerArn                         = String
  type AuthorizerFunctionArn                 = String
  type AuthorizerName                        = String
  type AuthorizerStatus                      = String
  type Authorizers                           = js.Array[AuthorizerSummary]
  type AutoRegistrationStatus                = String
  type AwsAccountId                          = String
  type AwsArn                                = String
  type AwsIotJobArn                          = String
  type AwsIotJobId                           = String
  type AwsIotSqlVersion                      = String
  type BehaviorMetric                        = String
  type BehaviorName                          = String
  type Behaviors                             = js.Array[Behavior]
  type BillingGroupArn                       = String
  type BillingGroupDescription               = String
  type BillingGroupId                        = String
  type BillingGroupName                      = String
  type BillingGroupNameAndArnList            = js.Array[GroupNameAndArn]
  type BucketName                            = String
  type CACertificateStatus                   = String
  type CACertificates                        = js.Array[CACertificate]
  type CanceledChecksCount                   = Int
  type CanceledThings                        = Int
  type CannedAccessControlList               = String
  type CertificateArn                        = String
  type CertificateId                         = String
  type CertificateName                       = String
  type CertificatePathOnDevice               = String
  type CertificatePem                        = String
  type CertificateSigningRequest             = String
  type CertificateStatus                     = String
  type Certificates                          = js.Array[Certificate]
  type ChannelName                           = String
  type CheckCompliant                        = Boolean
  type Cidr                                  = String
  type Cidrs                                 = js.Array[Cidr]
  type ClientId                              = String
  type Code                                  = String
  type CognitoIdentityPoolId                 = String
  type Comment                               = String
  type ComparisonOperator                    = String
  type CompliantChecksCount                  = Int
  type ConnectivityTimestamp                 = Double
  type ConsecutiveDatapointsToAlarm          = Int
  type ConsecutiveDatapointsToClear          = Int
  type Count                                 = Int
  type CreatedAtDate                         = js.Date
  type CreationDate                          = js.Date
  type CredentialDurationSeconds             = Int
  type CustomerVersion                       = Int
  type DateType                              = js.Date
  type DayOfMonth                            = String
  type DayOfWeek                             = String
  type DeleteAdditionalMetricsToRetain       = Boolean
  type DeleteAlertTargets                    = Boolean
  type DeleteBehaviors                       = Boolean
  type DeleteScheduledAudits                 = Boolean
  type DeleteStream                          = Boolean
  type DeliveryStreamName                    = String
  type DeprecationDate                       = js.Date
  type Description                           = String
  type DetailsKey                            = String
  type DetailsMap                            = js.Dictionary[DetailsValue]
  type DetailsValue                          = String
  type DisableAllLogs                        = Boolean
  type DurationSeconds                       = Int
  type DynamicGroupStatus                    = String
  type DynamoKeyType                         = String
  type DynamoOperation                       = String
  type EffectivePolicies                     = js.Array[EffectivePolicy]
  type ElasticsearchEndpoint                 = String
  type ElasticsearchId                       = String
  type ElasticsearchIndex                    = String
  type ElasticsearchType                     = String
  type Enabled                               = Boolean
  type EndpointAddress                       = String
  type EndpointType                          = String
  type ErrorCode                             = String
  type ErrorMessage                          = String
  type EvaluationStatistic                   = String
  type EventConfigurations                   = js.Dictionary[Configuration]
  type EventType                             = String
  type ExecutionNamePrefix                   = String
  type ExecutionNumber                       = Double
  type ExpectedVersion                       = Double
  type ExpiresInSec                          = Double
  type FailedChecksCount                     = Int
  type FailedThings                          = Int
  type FileId                                = Int
  type FileName                              = String
  type FirehoseSeparator                     = String
  type Flag                                  = Boolean
  type ForceDelete                           = Boolean
  type ForceDeleteAWSJob                     = Boolean
  type ForceFlag                             = Boolean
  type Forced                                = Boolean
  type FunctionArn                           = String
  type GEMaxResults                          = Int
  type GenerationId                          = String
  type HashAlgorithm                         = String
  type HashKeyField                          = String
  type HashKeyValue                          = String
  type InProgressChecksCount                 = Int
  type InProgressThings                      = Int
  type InProgressTimeoutInMinutes            = Double
  type IncrementFactor                       = Double
  type IndexName                             = String
  type IndexNamesList                        = js.Array[IndexName]
  type IndexSchema                           = String
  type IndexStatus                           = String
  type InlineDocument                        = String
  type InputName                             = String
  type IsAuthenticated                       = Boolean
  type IsDefaultVersion                      = Boolean
  type IsDisabled                            = Boolean
  type JobArn                                = String
  type JobDescription                        = String
  type JobDocument                           = String
  type JobDocumentSource                     = String
  type JobExecutionFailureType               = String
  type JobExecutionStatus                    = String
  type JobExecutionSummaryForJobList         = js.Array[JobExecutionSummaryForJob]
  type JobExecutionSummaryForThingList       = js.Array[JobExecutionSummaryForThing]
  type JobId                                 = String
  type JobStatus                             = String
  type JobSummaryList                        = js.Array[JobSummary]
  type JobTargets                            = js.Array[TargetArn]
  type JsonDocument                          = String
  type Key                                   = String
  type KeyName                               = String
  type KeyValue                              = String
  type LaserMaxResults                       = Int
  type LastModifiedDate                      = js.Date
  type LogLevel                              = String
  type LogTargetConfigurations               = js.Array[LogTargetConfiguration]
  type LogTargetName                         = String
  type LogTargetType                         = String
  type Marker                                = String
  type MaxJobExecutionsPerMin                = Int
  type MaxResults                            = Int
  type MaximumPerMinute                      = Int
  type Message                               = String
  type MessageFormat                         = String
  type MessageId                             = String
  type MinimumNumberOfExecutedThings         = Int
  type MissingContextValue                   = String
  type MissingContextValues                  = js.Array[MissingContextValue]
  type NextToken                             = String
  type NonCompliantChecksCount               = Int
  type NonCompliantResourcesCount            = Double
  type NumberOfThings                        = Int
  type OTAUpdateArn                          = String
  type OTAUpdateDescription                  = String
  type OTAUpdateErrorMessage                 = String
  type OTAUpdateFileVersion                  = String
  type OTAUpdateFiles                        = js.Array[OTAUpdateFile]
  type OTAUpdateId                           = String
  type OTAUpdateStatus                       = String
  type OTAUpdatesSummary                     = js.Array[OTAUpdateSummary]
  type OptionalVersion                       = Double
  type OutgoingCertificates                  = js.Array[OutgoingCertificate]
  type OverrideDynamicGroups                 = Boolean
  type PageSize                              = Int
  type Parameter                             = String
  type Parameters                            = js.Dictionary[Value]
  type PartitionKey                          = String
  type PayloadField                          = String
  type Percentage                            = Int
  type Platform                              = String
  type Policies                              = js.Array[Policy]
  type PolicyArn                             = String
  type PolicyDocument                        = String
  type PolicyDocuments                       = js.Array[PolicyDocument]
  type PolicyName                            = String
  type PolicyNames                           = js.Array[PolicyName]
  type PolicyTarget                          = String
  type PolicyTargets                         = js.Array[PolicyTarget]
  type PolicyVersionId                       = String
  type PolicyVersions                        = js.Array[PolicyVersion]
  type Port                                  = Int
  type Ports                                 = js.Array[Port]
  type Prefix                                = String
  type Principal                             = String
  type PrincipalArn                          = String
  type PrincipalId                           = String
  type Principals                            = js.Array[PrincipalArn]
  type PrivateKey                            = String
  type ProcessingTargetName                  = String
  type ProcessingTargetNameList              = js.Array[ProcessingTargetName]
  type PublicKey                             = String
  type PublicKeyMap                          = js.Dictionary[KeyValue]
  type QueryMaxResults                       = Int
  type QueryString                           = String
  type QueryVersion                          = String
  type QueueUrl                              = String
  type QueuedThings                          = Int
  type RangeKeyField                         = String
  type RangeKeyValue                         = String
  type ReasonCode                            = String
  type ReasonForNonCompliance                = String
  type ReasonForNonComplianceCode            = String
  type Recursive                             = Boolean
  type RecursiveWithoutDefault               = Boolean
  type RegistrationCode                      = String
  type RegistryMaxResults                    = Int
  type RegistryS3BucketName                  = String
  type RegistryS3KeyName                     = String
  type RejectedThings                        = Int
  type RelatedResources                      = js.Array[RelatedResource]
  type RemoveAutoRegistration                = Boolean
  type RemoveThingType                       = Boolean
  type RemovedThings                         = Int
  type ReportType                            = String
  type Resource                              = String
  type ResourceArn                           = String
  type ResourceArns                          = js.Dictionary[ResourceArn]
  type ResourceLogicalId                     = String
  type ResourceType                          = String
  type Resources                             = js.Array[Resource]
  type RoleAlias                             = String
  type RoleAliasArn                          = String
  type RoleAliases                           = js.Array[RoleAlias]
  type RoleArn                               = String
  type RolloutRatePerMinute                  = Int
  type RuleArn                               = String
  type RuleName                              = String
  type S3Bucket                              = String
  type S3FileUrl                             = String
  type S3FileUrlList                         = js.Array[S3FileUrl]
  type S3Key                                 = String
  type S3Version                             = String
  type SQL                                   = String
  type SalesforceEndpoint                    = String
  type SalesforceToken                       = String
  type ScheduledAuditArn                     = String
  type ScheduledAuditMetadataList            = js.Array[ScheduledAuditMetadata]
  type ScheduledAuditName                    = String
  type SearchableAttributes                  = js.Array[AttributeName]
  type Seconds                               = Int
  type SecurityProfileArn                    = String
  type SecurityProfileDescription            = String
  type SecurityProfileIdentifiers            = js.Array[SecurityProfileIdentifier]
  type SecurityProfileName                   = String
  type SecurityProfileTargetArn              = String
  type SecurityProfileTargetMappings         = js.Array[SecurityProfileTargetMapping]
  type SecurityProfileTargets                = js.Array[SecurityProfileTarget]
  type SetAsActive                           = Boolean
  type SetAsActiveFlag                       = Boolean
  type SetAsDefault                          = Boolean
  type Signature =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SignatureAlgorithm                  = String
  type SigningJobId                        = String
  type SigningProfileName                  = String
  type SkyfallMaxResults                   = Int
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

  implicit final class IotOps(val service: Iot) extends AnyVal {

    def acceptCertificateTransferFuture(params: AcceptCertificateTransferRequest): Future[js.Object] =
      service.acceptCertificateTransfer(params).promise.toFuture
    def addThingToBillingGroupFuture(params: AddThingToBillingGroupRequest): Future[AddThingToBillingGroupResponse] =
      service.addThingToBillingGroup(params).promise.toFuture
    def addThingToThingGroupFuture(params: AddThingToThingGroupRequest): Future[AddThingToThingGroupResponse] =
      service.addThingToThingGroup(params).promise.toFuture
    def associateTargetsWithJobFuture(params: AssociateTargetsWithJobRequest): Future[AssociateTargetsWithJobResponse] =
      service.associateTargetsWithJob(params).promise.toFuture
    def attachPolicyFuture(params: AttachPolicyRequest): Future[js.Object] =
      service.attachPolicy(params).promise.toFuture
    def attachPrincipalPolicyFuture(params: AttachPrincipalPolicyRequest): Future[js.Object] =
      service.attachPrincipalPolicy(params).promise.toFuture
    def attachSecurityProfileFuture(params: AttachSecurityProfileRequest): Future[AttachSecurityProfileResponse] =
      service.attachSecurityProfile(params).promise.toFuture
    def attachThingPrincipalFuture(params: AttachThingPrincipalRequest): Future[AttachThingPrincipalResponse] =
      service.attachThingPrincipal(params).promise.toFuture
    def cancelAuditTaskFuture(params: CancelAuditTaskRequest): Future[CancelAuditTaskResponse] =
      service.cancelAuditTask(params).promise.toFuture
    def cancelCertificateTransferFuture(params: CancelCertificateTransferRequest): Future[js.Object] =
      service.cancelCertificateTransfer(params).promise.toFuture
    def cancelJobExecutionFuture(params: CancelJobExecutionRequest): Future[js.Object] =
      service.cancelJobExecution(params).promise.toFuture
    def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] =
      service.cancelJob(params).promise.toFuture
    def clearDefaultAuthorizerFuture(params: ClearDefaultAuthorizerRequest): Future[ClearDefaultAuthorizerResponse] =
      service.clearDefaultAuthorizer(params).promise.toFuture
    def createAuthorizerFuture(params: CreateAuthorizerRequest): Future[CreateAuthorizerResponse] =
      service.createAuthorizer(params).promise.toFuture
    def createBillingGroupFuture(params: CreateBillingGroupRequest): Future[CreateBillingGroupResponse] =
      service.createBillingGroup(params).promise.toFuture
    def createCertificateFromCsrFuture(
        params: CreateCertificateFromCsrRequest
    ): Future[CreateCertificateFromCsrResponse] = service.createCertificateFromCsr(params).promise.toFuture
    def createDynamicThingGroupFuture(params: CreateDynamicThingGroupRequest): Future[CreateDynamicThingGroupResponse] =
      service.createDynamicThingGroup(params).promise.toFuture
    def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] =
      service.createJob(params).promise.toFuture
    def createKeysAndCertificateFuture(
        params: CreateKeysAndCertificateRequest
    ): Future[CreateKeysAndCertificateResponse] = service.createKeysAndCertificate(params).promise.toFuture
    def createOTAUpdateFuture(params: CreateOTAUpdateRequest): Future[CreateOTAUpdateResponse] =
      service.createOTAUpdate(params).promise.toFuture
    def createPolicyFuture(params: CreatePolicyRequest): Future[CreatePolicyResponse] =
      service.createPolicy(params).promise.toFuture
    def createPolicyVersionFuture(params: CreatePolicyVersionRequest): Future[CreatePolicyVersionResponse] =
      service.createPolicyVersion(params).promise.toFuture
    def createRoleAliasFuture(params: CreateRoleAliasRequest): Future[CreateRoleAliasResponse] =
      service.createRoleAlias(params).promise.toFuture
    def createScheduledAuditFuture(params: CreateScheduledAuditRequest): Future[CreateScheduledAuditResponse] =
      service.createScheduledAudit(params).promise.toFuture
    def createSecurityProfileFuture(params: CreateSecurityProfileRequest): Future[CreateSecurityProfileResponse] =
      service.createSecurityProfile(params).promise.toFuture
    def createStreamFuture(params: CreateStreamRequest): Future[CreateStreamResponse] =
      service.createStream(params).promise.toFuture
    def createThingFuture(params: CreateThingRequest): Future[CreateThingResponse] =
      service.createThing(params).promise.toFuture
    def createThingGroupFuture(params: CreateThingGroupRequest): Future[CreateThingGroupResponse] =
      service.createThingGroup(params).promise.toFuture
    def createThingTypeFuture(params: CreateThingTypeRequest): Future[CreateThingTypeResponse] =
      service.createThingType(params).promise.toFuture
    def createTopicRuleFuture(params: CreateTopicRuleRequest): Future[js.Object] =
      service.createTopicRule(params).promise.toFuture
    def deleteAccountAuditConfigurationFuture(
        params: DeleteAccountAuditConfigurationRequest
    ): Future[DeleteAccountAuditConfigurationResponse] =
      service.deleteAccountAuditConfiguration(params).promise.toFuture
    def deleteAuthorizerFuture(params: DeleteAuthorizerRequest): Future[DeleteAuthorizerResponse] =
      service.deleteAuthorizer(params).promise.toFuture
    def deleteBillingGroupFuture(params: DeleteBillingGroupRequest): Future[DeleteBillingGroupResponse] =
      service.deleteBillingGroup(params).promise.toFuture
    def deleteCACertificateFuture(params: DeleteCACertificateRequest): Future[DeleteCACertificateResponse] =
      service.deleteCACertificate(params).promise.toFuture
    def deleteCertificateFuture(params: DeleteCertificateRequest): Future[js.Object] =
      service.deleteCertificate(params).promise.toFuture
    def deleteDynamicThingGroupFuture(params: DeleteDynamicThingGroupRequest): Future[DeleteDynamicThingGroupResponse] =
      service.deleteDynamicThingGroup(params).promise.toFuture
    def deleteJobExecutionFuture(params: DeleteJobExecutionRequest): Future[js.Object] =
      service.deleteJobExecution(params).promise.toFuture
    def deleteJobFuture(params: DeleteJobRequest): Future[js.Object] = service.deleteJob(params).promise.toFuture
    def deleteOTAUpdateFuture(params: DeleteOTAUpdateRequest): Future[DeleteOTAUpdateResponse] =
      service.deleteOTAUpdate(params).promise.toFuture
    def deletePolicyFuture(params: DeletePolicyRequest): Future[js.Object] =
      service.deletePolicy(params).promise.toFuture
    def deletePolicyVersionFuture(params: DeletePolicyVersionRequest): Future[js.Object] =
      service.deletePolicyVersion(params).promise.toFuture
    def deleteRegistrationCodeFuture(params: DeleteRegistrationCodeRequest): Future[DeleteRegistrationCodeResponse] =
      service.deleteRegistrationCode(params).promise.toFuture
    def deleteRoleAliasFuture(params: DeleteRoleAliasRequest): Future[DeleteRoleAliasResponse] =
      service.deleteRoleAlias(params).promise.toFuture
    def deleteScheduledAuditFuture(params: DeleteScheduledAuditRequest): Future[DeleteScheduledAuditResponse] =
      service.deleteScheduledAudit(params).promise.toFuture
    def deleteSecurityProfileFuture(params: DeleteSecurityProfileRequest): Future[DeleteSecurityProfileResponse] =
      service.deleteSecurityProfile(params).promise.toFuture
    def deleteStreamFuture(params: DeleteStreamRequest): Future[DeleteStreamResponse] =
      service.deleteStream(params).promise.toFuture
    def deleteThingFuture(params: DeleteThingRequest): Future[DeleteThingResponse] =
      service.deleteThing(params).promise.toFuture
    def deleteThingGroupFuture(params: DeleteThingGroupRequest): Future[DeleteThingGroupResponse] =
      service.deleteThingGroup(params).promise.toFuture
    def deleteThingTypeFuture(params: DeleteThingTypeRequest): Future[DeleteThingTypeResponse] =
      service.deleteThingType(params).promise.toFuture
    def deleteTopicRuleFuture(params: DeleteTopicRuleRequest): Future[js.Object] =
      service.deleteTopicRule(params).promise.toFuture
    def deleteV2LoggingLevelFuture(params: DeleteV2LoggingLevelRequest): Future[js.Object] =
      service.deleteV2LoggingLevel(params).promise.toFuture
    def deprecateThingTypeFuture(params: DeprecateThingTypeRequest): Future[DeprecateThingTypeResponse] =
      service.deprecateThingType(params).promise.toFuture
    def describeAccountAuditConfigurationFuture(
        params: DescribeAccountAuditConfigurationRequest
    ): Future[DescribeAccountAuditConfigurationResponse] =
      service.describeAccountAuditConfiguration(params).promise.toFuture
    def describeAuditTaskFuture(params: DescribeAuditTaskRequest): Future[DescribeAuditTaskResponse] =
      service.describeAuditTask(params).promise.toFuture
    def describeAuthorizerFuture(params: DescribeAuthorizerRequest): Future[DescribeAuthorizerResponse] =
      service.describeAuthorizer(params).promise.toFuture
    def describeBillingGroupFuture(params: DescribeBillingGroupRequest): Future[DescribeBillingGroupResponse] =
      service.describeBillingGroup(params).promise.toFuture
    def describeCACertificateFuture(params: DescribeCACertificateRequest): Future[DescribeCACertificateResponse] =
      service.describeCACertificate(params).promise.toFuture
    def describeCertificateFuture(params: DescribeCertificateRequest): Future[DescribeCertificateResponse] =
      service.describeCertificate(params).promise.toFuture
    def describeDefaultAuthorizerFuture(
        params: DescribeDefaultAuthorizerRequest
    ): Future[DescribeDefaultAuthorizerResponse] = service.describeDefaultAuthorizer(params).promise.toFuture
    def describeEndpointFuture(params: DescribeEndpointRequest): Future[DescribeEndpointResponse] =
      service.describeEndpoint(params).promise.toFuture
    def describeEventConfigurationsFuture(
        params: DescribeEventConfigurationsRequest
    ): Future[DescribeEventConfigurationsResponse] = service.describeEventConfigurations(params).promise.toFuture
    def describeIndexFuture(params: DescribeIndexRequest): Future[DescribeIndexResponse] =
      service.describeIndex(params).promise.toFuture
    def describeJobExecutionFuture(params: DescribeJobExecutionRequest): Future[DescribeJobExecutionResponse] =
      service.describeJobExecution(params).promise.toFuture
    def describeJobFuture(params: DescribeJobRequest): Future[DescribeJobResponse] =
      service.describeJob(params).promise.toFuture
    def describeRoleAliasFuture(params: DescribeRoleAliasRequest): Future[DescribeRoleAliasResponse] =
      service.describeRoleAlias(params).promise.toFuture
    def describeScheduledAuditFuture(params: DescribeScheduledAuditRequest): Future[DescribeScheduledAuditResponse] =
      service.describeScheduledAudit(params).promise.toFuture
    def describeSecurityProfileFuture(params: DescribeSecurityProfileRequest): Future[DescribeSecurityProfileResponse] =
      service.describeSecurityProfile(params).promise.toFuture
    def describeStreamFuture(params: DescribeStreamRequest): Future[DescribeStreamResponse] =
      service.describeStream(params).promise.toFuture
    def describeThingFuture(params: DescribeThingRequest): Future[DescribeThingResponse] =
      service.describeThing(params).promise.toFuture
    def describeThingGroupFuture(params: DescribeThingGroupRequest): Future[DescribeThingGroupResponse] =
      service.describeThingGroup(params).promise.toFuture
    def describeThingRegistrationTaskFuture(
        params: DescribeThingRegistrationTaskRequest
    ): Future[DescribeThingRegistrationTaskResponse] = service.describeThingRegistrationTask(params).promise.toFuture
    def describeThingTypeFuture(params: DescribeThingTypeRequest): Future[DescribeThingTypeResponse] =
      service.describeThingType(params).promise.toFuture
    def detachPolicyFuture(params: DetachPolicyRequest): Future[js.Object] =
      service.detachPolicy(params).promise.toFuture
    def detachPrincipalPolicyFuture(params: DetachPrincipalPolicyRequest): Future[js.Object] =
      service.detachPrincipalPolicy(params).promise.toFuture
    def detachSecurityProfileFuture(params: DetachSecurityProfileRequest): Future[DetachSecurityProfileResponse] =
      service.detachSecurityProfile(params).promise.toFuture
    def detachThingPrincipalFuture(params: DetachThingPrincipalRequest): Future[DetachThingPrincipalResponse] =
      service.detachThingPrincipal(params).promise.toFuture
    def disableTopicRuleFuture(params: DisableTopicRuleRequest): Future[js.Object] =
      service.disableTopicRule(params).promise.toFuture
    def enableTopicRuleFuture(params: EnableTopicRuleRequest): Future[js.Object] =
      service.enableTopicRule(params).promise.toFuture
    def getEffectivePoliciesFuture(params: GetEffectivePoliciesRequest): Future[GetEffectivePoliciesResponse] =
      service.getEffectivePolicies(params).promise.toFuture
    def getIndexingConfigurationFuture(
        params: GetIndexingConfigurationRequest
    ): Future[GetIndexingConfigurationResponse] = service.getIndexingConfiguration(params).promise.toFuture
    def getJobDocumentFuture(params: GetJobDocumentRequest): Future[GetJobDocumentResponse] =
      service.getJobDocument(params).promise.toFuture
    def getLoggingOptionsFuture(params: GetLoggingOptionsRequest): Future[GetLoggingOptionsResponse] =
      service.getLoggingOptions(params).promise.toFuture
    def getOTAUpdateFuture(params: GetOTAUpdateRequest): Future[GetOTAUpdateResponse] =
      service.getOTAUpdate(params).promise.toFuture
    def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] =
      service.getPolicy(params).promise.toFuture
    def getPolicyVersionFuture(params: GetPolicyVersionRequest): Future[GetPolicyVersionResponse] =
      service.getPolicyVersion(params).promise.toFuture
    def getRegistrationCodeFuture(params: GetRegistrationCodeRequest): Future[GetRegistrationCodeResponse] =
      service.getRegistrationCode(params).promise.toFuture
    def getStatisticsFuture(params: GetStatisticsRequest): Future[GetStatisticsResponse] =
      service.getStatistics(params).promise.toFuture
    def getTopicRuleFuture(params: GetTopicRuleRequest): Future[GetTopicRuleResponse] =
      service.getTopicRule(params).promise.toFuture
    def getV2LoggingOptionsFuture(params: GetV2LoggingOptionsRequest): Future[GetV2LoggingOptionsResponse] =
      service.getV2LoggingOptions(params).promise.toFuture
    def listActiveViolationsFuture(params: ListActiveViolationsRequest): Future[ListActiveViolationsResponse] =
      service.listActiveViolations(params).promise.toFuture
    def listAttachedPoliciesFuture(params: ListAttachedPoliciesRequest): Future[ListAttachedPoliciesResponse] =
      service.listAttachedPolicies(params).promise.toFuture
    def listAuditFindingsFuture(params: ListAuditFindingsRequest): Future[ListAuditFindingsResponse] =
      service.listAuditFindings(params).promise.toFuture
    def listAuditTasksFuture(params: ListAuditTasksRequest): Future[ListAuditTasksResponse] =
      service.listAuditTasks(params).promise.toFuture
    def listAuthorizersFuture(params: ListAuthorizersRequest): Future[ListAuthorizersResponse] =
      service.listAuthorizers(params).promise.toFuture
    def listBillingGroupsFuture(params: ListBillingGroupsRequest): Future[ListBillingGroupsResponse] =
      service.listBillingGroups(params).promise.toFuture
    def listCACertificatesFuture(params: ListCACertificatesRequest): Future[ListCACertificatesResponse] =
      service.listCACertificates(params).promise.toFuture
    def listCertificatesByCAFuture(params: ListCertificatesByCARequest): Future[ListCertificatesByCAResponse] =
      service.listCertificatesByCA(params).promise.toFuture
    def listCertificatesFuture(params: ListCertificatesRequest): Future[ListCertificatesResponse] =
      service.listCertificates(params).promise.toFuture
    def listIndicesFuture(params: ListIndicesRequest): Future[ListIndicesResponse] =
      service.listIndices(params).promise.toFuture
    def listJobExecutionsForJobFuture(params: ListJobExecutionsForJobRequest): Future[ListJobExecutionsForJobResponse] =
      service.listJobExecutionsForJob(params).promise.toFuture
    def listJobExecutionsForThingFuture(
        params: ListJobExecutionsForThingRequest
    ): Future[ListJobExecutionsForThingResponse]                          = service.listJobExecutionsForThing(params).promise.toFuture
    def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] = service.listJobs(params).promise.toFuture
    def listOTAUpdatesFuture(params: ListOTAUpdatesRequest): Future[ListOTAUpdatesResponse] =
      service.listOTAUpdates(params).promise.toFuture
    def listOutgoingCertificatesFuture(
        params: ListOutgoingCertificatesRequest
    ): Future[ListOutgoingCertificatesResponse] = service.listOutgoingCertificates(params).promise.toFuture
    def listPoliciesFuture(params: ListPoliciesRequest): Future[ListPoliciesResponse] =
      service.listPolicies(params).promise.toFuture
    def listPolicyPrincipalsFuture(params: ListPolicyPrincipalsRequest): Future[ListPolicyPrincipalsResponse] =
      service.listPolicyPrincipals(params).promise.toFuture
    def listPolicyVersionsFuture(params: ListPolicyVersionsRequest): Future[ListPolicyVersionsResponse] =
      service.listPolicyVersions(params).promise.toFuture
    def listPrincipalPoliciesFuture(params: ListPrincipalPoliciesRequest): Future[ListPrincipalPoliciesResponse] =
      service.listPrincipalPolicies(params).promise.toFuture
    def listPrincipalThingsFuture(params: ListPrincipalThingsRequest): Future[ListPrincipalThingsResponse] =
      service.listPrincipalThings(params).promise.toFuture
    def listRoleAliasesFuture(params: ListRoleAliasesRequest): Future[ListRoleAliasesResponse] =
      service.listRoleAliases(params).promise.toFuture
    def listScheduledAuditsFuture(params: ListScheduledAuditsRequest): Future[ListScheduledAuditsResponse] =
      service.listScheduledAudits(params).promise.toFuture
    def listSecurityProfilesForTargetFuture(
        params: ListSecurityProfilesForTargetRequest
    ): Future[ListSecurityProfilesForTargetResponse] = service.listSecurityProfilesForTarget(params).promise.toFuture
    def listSecurityProfilesFuture(params: ListSecurityProfilesRequest): Future[ListSecurityProfilesResponse] =
      service.listSecurityProfiles(params).promise.toFuture
    def listStreamsFuture(params: ListStreamsRequest): Future[ListStreamsResponse] =
      service.listStreams(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def listTargetsForPolicyFuture(params: ListTargetsForPolicyRequest): Future[ListTargetsForPolicyResponse] =
      service.listTargetsForPolicy(params).promise.toFuture
    def listTargetsForSecurityProfileFuture(
        params: ListTargetsForSecurityProfileRequest
    ): Future[ListTargetsForSecurityProfileResponse] = service.listTargetsForSecurityProfile(params).promise.toFuture
    def listThingGroupsForThingFuture(params: ListThingGroupsForThingRequest): Future[ListThingGroupsForThingResponse] =
      service.listThingGroupsForThing(params).promise.toFuture
    def listThingGroupsFuture(params: ListThingGroupsRequest): Future[ListThingGroupsResponse] =
      service.listThingGroups(params).promise.toFuture
    def listThingPrincipalsFuture(params: ListThingPrincipalsRequest): Future[ListThingPrincipalsResponse] =
      service.listThingPrincipals(params).promise.toFuture
    def listThingRegistrationTaskReportsFuture(
        params: ListThingRegistrationTaskReportsRequest
    ): Future[ListThingRegistrationTaskReportsResponse] =
      service.listThingRegistrationTaskReports(params).promise.toFuture
    def listThingRegistrationTasksFuture(
        params: ListThingRegistrationTasksRequest
    ): Future[ListThingRegistrationTasksResponse] = service.listThingRegistrationTasks(params).promise.toFuture
    def listThingTypesFuture(params: ListThingTypesRequest): Future[ListThingTypesResponse] =
      service.listThingTypes(params).promise.toFuture
    def listThingsFuture(params: ListThingsRequest): Future[ListThingsResponse] =
      service.listThings(params).promise.toFuture
    def listThingsInBillingGroupFuture(
        params: ListThingsInBillingGroupRequest
    ): Future[ListThingsInBillingGroupResponse] = service.listThingsInBillingGroup(params).promise.toFuture
    def listThingsInThingGroupFuture(params: ListThingsInThingGroupRequest): Future[ListThingsInThingGroupResponse] =
      service.listThingsInThingGroup(params).promise.toFuture
    def listTopicRulesFuture(params: ListTopicRulesRequest): Future[ListTopicRulesResponse] =
      service.listTopicRules(params).promise.toFuture
    def listV2LoggingLevelsFuture(params: ListV2LoggingLevelsRequest): Future[ListV2LoggingLevelsResponse] =
      service.listV2LoggingLevels(params).promise.toFuture
    def listViolationEventsFuture(params: ListViolationEventsRequest): Future[ListViolationEventsResponse] =
      service.listViolationEvents(params).promise.toFuture
    def registerCACertificateFuture(params: RegisterCACertificateRequest): Future[RegisterCACertificateResponse] =
      service.registerCACertificate(params).promise.toFuture
    def registerCertificateFuture(params: RegisterCertificateRequest): Future[RegisterCertificateResponse] =
      service.registerCertificate(params).promise.toFuture
    def registerThingFuture(params: RegisterThingRequest): Future[RegisterThingResponse] =
      service.registerThing(params).promise.toFuture
    def rejectCertificateTransferFuture(params: RejectCertificateTransferRequest): Future[js.Object] =
      service.rejectCertificateTransfer(params).promise.toFuture
    def removeThingFromBillingGroupFuture(
        params: RemoveThingFromBillingGroupRequest
    ): Future[RemoveThingFromBillingGroupResponse] = service.removeThingFromBillingGroup(params).promise.toFuture
    def removeThingFromThingGroupFuture(
        params: RemoveThingFromThingGroupRequest
    ): Future[RemoveThingFromThingGroupResponse] = service.removeThingFromThingGroup(params).promise.toFuture
    def replaceTopicRuleFuture(params: ReplaceTopicRuleRequest): Future[js.Object] =
      service.replaceTopicRule(params).promise.toFuture
    def searchIndexFuture(params: SearchIndexRequest): Future[SearchIndexResponse] =
      service.searchIndex(params).promise.toFuture
    def setDefaultAuthorizerFuture(params: SetDefaultAuthorizerRequest): Future[SetDefaultAuthorizerResponse] =
      service.setDefaultAuthorizer(params).promise.toFuture
    def setDefaultPolicyVersionFuture(params: SetDefaultPolicyVersionRequest): Future[js.Object] =
      service.setDefaultPolicyVersion(params).promise.toFuture
    def setLoggingOptionsFuture(params: SetLoggingOptionsRequest): Future[js.Object] =
      service.setLoggingOptions(params).promise.toFuture
    def setV2LoggingLevelFuture(params: SetV2LoggingLevelRequest): Future[js.Object] =
      service.setV2LoggingLevel(params).promise.toFuture
    def setV2LoggingOptionsFuture(params: SetV2LoggingOptionsRequest): Future[js.Object] =
      service.setV2LoggingOptions(params).promise.toFuture
    def startOnDemandAuditTaskFuture(params: StartOnDemandAuditTaskRequest): Future[StartOnDemandAuditTaskResponse] =
      service.startOnDemandAuditTask(params).promise.toFuture
    def startThingRegistrationTaskFuture(
        params: StartThingRegistrationTaskRequest
    ): Future[StartThingRegistrationTaskResponse] = service.startThingRegistrationTask(params).promise.toFuture
    def stopThingRegistrationTaskFuture(
        params: StopThingRegistrationTaskRequest
    ): Future[StopThingRegistrationTaskResponse] = service.stopThingRegistrationTask(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def testAuthorizationFuture(params: TestAuthorizationRequest): Future[TestAuthorizationResponse] =
      service.testAuthorization(params).promise.toFuture
    def testInvokeAuthorizerFuture(params: TestInvokeAuthorizerRequest): Future[TestInvokeAuthorizerResponse] =
      service.testInvokeAuthorizer(params).promise.toFuture
    def transferCertificateFuture(params: TransferCertificateRequest): Future[TransferCertificateResponse] =
      service.transferCertificate(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateAccountAuditConfigurationFuture(
        params: UpdateAccountAuditConfigurationRequest
    ): Future[UpdateAccountAuditConfigurationResponse] =
      service.updateAccountAuditConfiguration(params).promise.toFuture
    def updateAuthorizerFuture(params: UpdateAuthorizerRequest): Future[UpdateAuthorizerResponse] =
      service.updateAuthorizer(params).promise.toFuture
    def updateBillingGroupFuture(params: UpdateBillingGroupRequest): Future[UpdateBillingGroupResponse] =
      service.updateBillingGroup(params).promise.toFuture
    def updateCACertificateFuture(params: UpdateCACertificateRequest): Future[js.Object] =
      service.updateCACertificate(params).promise.toFuture
    def updateCertificateFuture(params: UpdateCertificateRequest): Future[js.Object] =
      service.updateCertificate(params).promise.toFuture
    def updateDynamicThingGroupFuture(params: UpdateDynamicThingGroupRequest): Future[UpdateDynamicThingGroupResponse] =
      service.updateDynamicThingGroup(params).promise.toFuture
    def updateEventConfigurationsFuture(
        params: UpdateEventConfigurationsRequest
    ): Future[UpdateEventConfigurationsResponse] = service.updateEventConfigurations(params).promise.toFuture
    def updateIndexingConfigurationFuture(
        params: UpdateIndexingConfigurationRequest
    ): Future[UpdateIndexingConfigurationResponse]                   = service.updateIndexingConfiguration(params).promise.toFuture
    def updateJobFuture(params: UpdateJobRequest): Future[js.Object] = service.updateJob(params).promise.toFuture
    def updateRoleAliasFuture(params: UpdateRoleAliasRequest): Future[UpdateRoleAliasResponse] =
      service.updateRoleAlias(params).promise.toFuture
    def updateScheduledAuditFuture(params: UpdateScheduledAuditRequest): Future[UpdateScheduledAuditResponse] =
      service.updateScheduledAudit(params).promise.toFuture
    def updateSecurityProfileFuture(params: UpdateSecurityProfileRequest): Future[UpdateSecurityProfileResponse] =
      service.updateSecurityProfile(params).promise.toFuture
    def updateStreamFuture(params: UpdateStreamRequest): Future[UpdateStreamResponse] =
      service.updateStream(params).promise.toFuture
    def updateThingFuture(params: UpdateThingRequest): Future[UpdateThingResponse] =
      service.updateThing(params).promise.toFuture
    def updateThingGroupFuture(params: UpdateThingGroupRequest): Future[UpdateThingGroupResponse] =
      service.updateThingGroup(params).promise.toFuture
    def updateThingGroupsForThingFuture(
        params: UpdateThingGroupsForThingRequest
    ): Future[UpdateThingGroupsForThingResponse] = service.updateThingGroupsForThing(params).promise.toFuture
    def validateSecurityProfileBehaviorsFuture(
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
    def attachPrincipalPolicy(params: AttachPrincipalPolicyRequest): Request[js.Object]                     = js.native
    def attachSecurityProfile(params: AttachSecurityProfileRequest): Request[AttachSecurityProfileResponse] = js.native
    def attachThingPrincipal(params: AttachThingPrincipalRequest): Request[AttachThingPrincipalResponse]    = js.native
    def cancelAuditTask(params: CancelAuditTaskRequest): Request[CancelAuditTaskResponse]                   = js.native
    def cancelCertificateTransfer(params: CancelCertificateTransferRequest): Request[js.Object]             = js.native
    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse]                                     = js.native
    def cancelJobExecution(params: CancelJobExecutionRequest): Request[js.Object]                           = js.native
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
    def deleteJob(params: DeleteJobRequest): Request[js.Object]                           = js.native
    def deleteJobExecution(params: DeleteJobExecutionRequest): Request[js.Object]         = js.native
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
    ): Request[DescribeAccountAuditConfigurationResponse]                                                   = js.native
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
    def describeRoleAlias(params: DescribeRoleAliasRequest): Request[DescribeRoleAliasResponse]          = js.native
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
    def detachPrincipalPolicy(params: DetachPrincipalPolicyRequest): Request[js.Object]                     = js.native
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
    ): Request[ListJobExecutionsForThingResponse]                                      = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse]                   = js.native
    def listOTAUpdates(params: ListOTAUpdatesRequest): Request[ListOTAUpdatesResponse] = js.native
    def listOutgoingCertificates(params: ListOutgoingCertificatesRequest): Request[ListOutgoingCertificatesResponse] =
      js.native
    def listPolicies(params: ListPoliciesRequest): Request[ListPoliciesResponse]                            = js.native
    def listPolicyPrincipals(params: ListPolicyPrincipalsRequest): Request[ListPolicyPrincipalsResponse]    = js.native
    def listPolicyVersions(params: ListPolicyVersionsRequest): Request[ListPolicyVersionsResponse]          = js.native
    def listPrincipalPolicies(params: ListPrincipalPoliciesRequest): Request[ListPrincipalPoliciesResponse] = js.native
    def listPrincipalThings(params: ListPrincipalThingsRequest): Request[ListPrincipalThingsResponse]       = js.native
    def listRoleAliases(params: ListRoleAliasesRequest): Request[ListRoleAliasesResponse]                   = js.native
    def listScheduledAudits(params: ListScheduledAuditsRequest): Request[ListScheduledAuditsResponse]       = js.native
    def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse]    = js.native
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
    ): Request[UpdateIndexingConfigurationResponse]                                                         = js.native
    def updateJob(params: UpdateJobRequest): Request[js.Object]                                             = js.native
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
  }

  object AbortActionEnum {
    val CANCEL = "CANCEL"

    val values = IndexedSeq(CANCEL)
  }

  /**
    * Details of abort criteria to abort the job.
    */
  @js.native
  trait AbortConfig extends js.Object {
    var criteriaList: AbortCriteriaList
  }

  object AbortConfig {
    def apply(
        criteriaList: AbortCriteriaList
    ): AbortConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "criteriaList" -> criteriaList.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortConfig]
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
    def apply(
        action: AbortAction,
        failureType: JobExecutionFailureType,
        minNumberOfExecutedThings: MinimumNumberOfExecutedThings,
        thresholdPercentage: AbortThresholdPercentage
    ): AbortCriteria = {
      val _fields = IndexedSeq[(String, js.Any)](
        "action"                    -> action.asInstanceOf[js.Any],
        "failureType"               -> failureType.asInstanceOf[js.Any],
        "minNumberOfExecutedThings" -> minNumberOfExecutedThings.asInstanceOf[js.Any],
        "thresholdPercentage"       -> thresholdPercentage.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortCriteria]
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
    def apply(
        certificateId: CertificateId,
        setAsActive: js.UndefOr[SetAsActive] = js.undefined
    ): AcceptCertificateTransferRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.asInstanceOf[js.Any],
        "setAsActive" -> setAsActive.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptCertificateTransferRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "cloudwatchAlarm" -> cloudwatchAlarm.map { x =>
          x.asInstanceOf[js.Any]
        },
        "cloudwatchMetric" -> cloudwatchMetric.map { x =>
          x.asInstanceOf[js.Any]
        },
        "dynamoDB" -> dynamoDB.map { x =>
          x.asInstanceOf[js.Any]
        },
        "dynamoDBv2" -> dynamoDBv2.map { x =>
          x.asInstanceOf[js.Any]
        },
        "elasticsearch" -> elasticsearch.map { x =>
          x.asInstanceOf[js.Any]
        },
        "firehose" -> firehose.map { x =>
          x.asInstanceOf[js.Any]
        },
        "iotAnalytics" -> iotAnalytics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "iotEvents" -> iotEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "kinesis" -> kinesis.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lambda" -> lambda.map { x =>
          x.asInstanceOf[js.Any]
        },
        "republish" -> republish.map { x =>
          x.asInstanceOf[js.Any]
        },
        "s3" -> s3.map { x =>
          x.asInstanceOf[js.Any]
        },
        "salesforce" -> salesforce.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sns" -> sns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sqs" -> sqs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stepFunctions" -> stepFunctions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Action]
    }
  }

  object ActionTypeEnum {
    val PUBLISH   = "PUBLISH"
    val SUBSCRIBE = "SUBSCRIBE"
    val RECEIVE   = "RECEIVE"
    val CONNECT   = "CONNECT"

    val values = IndexedSeq(PUBLISH, SUBSCRIBE, RECEIVE, CONNECT)
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
    var thingName: js.UndefOr[ThingName]
    var violationId: js.UndefOr[ViolationId]
    var violationStartTime: js.UndefOr[Timestamp]
  }

  object ActiveViolation {
    def apply(
        behavior: js.UndefOr[Behavior] = js.undefined,
        lastViolationTime: js.UndefOr[Timestamp] = js.undefined,
        lastViolationValue: js.UndefOr[MetricValue] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined,
        violationId: js.UndefOr[ViolationId] = js.undefined,
        violationStartTime: js.UndefOr[Timestamp] = js.undefined
    ): ActiveViolation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "behavior" -> behavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastViolationTime" -> lastViolationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastViolationValue" -> lastViolationValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileName" -> securityProfileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "violationId" -> violationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "violationStartTime" -> violationStartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActiveViolation]
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
    def apply(
        billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
        billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): AddThingToBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupArn" -> billingGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "billingGroupName" -> billingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingArn" -> thingArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddThingToBillingGroupRequest]
    }
  }

  @js.native
  trait AddThingToBillingGroupResponse extends js.Object {}

  object AddThingToBillingGroupResponse {
    def apply(
        ): AddThingToBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddThingToBillingGroupResponse]
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
    def apply(
        overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined,
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): AddThingToThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "overrideDynamicGroups" -> overrideDynamicGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingArn" -> thingArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupArn" -> thingGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupName" -> thingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddThingToThingGroupRequest]
    }
  }

  @js.native
  trait AddThingToThingGroupResponse extends js.Object {}

  object AddThingToThingGroupResponse {
    def apply(
        ): AddThingToThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddThingToThingGroupResponse]
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
    def apply(
        alertTargetArn: AlertTargetArn,
        roleArn: RoleArn
    ): AlertTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "alertTargetArn" -> alertTargetArn.asInstanceOf[js.Any],
        "roleArn"        -> roleArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlertTarget]
    }
  }

  /**
    * The type of alert target: one of "SNS".
    */
  object AlertTargetTypeEnum {
    val SNS = "SNS"

    val values = IndexedSeq(SNS)
  }

  /**
    * Contains information that allowed the authorization.
    */
  @js.native
  trait Allowed extends js.Object {
    var policies: js.UndefOr[Policies]
  }

  object Allowed {
    def apply(
        policies: js.UndefOr[Policies] = js.undefined
    ): Allowed = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policies" -> policies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Allowed]
    }
  }

  @js.native
  trait AssociateTargetsWithJobRequest extends js.Object {
    var jobId: JobId
    var targets: JobTargets
    var comment: js.UndefOr[Comment]
  }

  object AssociateTargetsWithJobRequest {
    def apply(
        jobId: JobId,
        targets: JobTargets,
        comment: js.UndefOr[Comment] = js.undefined
    ): AssociateTargetsWithJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId"   -> jobId.asInstanceOf[js.Any],
        "targets" -> targets.asInstanceOf[js.Any],
        "comment" -> comment.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateTargetsWithJobRequest]
    }
  }

  @js.native
  trait AssociateTargetsWithJobResponse extends js.Object {
    var description: js.UndefOr[JobDescription]
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
  }

  object AssociateTargetsWithJobResponse {
    def apply(
        description: js.UndefOr[JobDescription] = js.undefined,
        jobArn: js.UndefOr[JobArn] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined
    ): AssociateTargetsWithJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobArn" -> jobArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobId" -> jobId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateTargetsWithJobResponse]
    }
  }

  @js.native
  trait AttachPolicyRequest extends js.Object {
    var policyName: PolicyName
    var target: PolicyTarget
  }

  object AttachPolicyRequest {
    def apply(
        policyName: PolicyName,
        target: PolicyTarget
    ): AttachPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.asInstanceOf[js.Any],
        "target"     -> target.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachPolicyRequest]
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
    def apply(
        policyName: PolicyName,
        principal: Principal
    ): AttachPrincipalPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.asInstanceOf[js.Any],
        "principal"  -> principal.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachPrincipalPolicyRequest]
    }
  }

  @js.native
  trait AttachSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var securityProfileTargetArn: SecurityProfileTargetArn
  }

  object AttachSecurityProfileRequest {
    def apply(
        securityProfileName: SecurityProfileName,
        securityProfileTargetArn: SecurityProfileTargetArn
    ): AttachSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName"      -> securityProfileName.asInstanceOf[js.Any],
        "securityProfileTargetArn" -> securityProfileTargetArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachSecurityProfileRequest]
    }
  }

  @js.native
  trait AttachSecurityProfileResponse extends js.Object {}

  object AttachSecurityProfileResponse {
    def apply(
        ): AttachSecurityProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachSecurityProfileResponse]
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
    def apply(
        principal: Principal,
        thingName: ThingName
    ): AttachThingPrincipalRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "principal" -> principal.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachThingPrincipalRequest]
    }
  }

  /**
    * The output from the AttachThingPrincipal operation.
    */
  @js.native
  trait AttachThingPrincipalResponse extends js.Object {}

  object AttachThingPrincipalResponse {
    def apply(
        ): AttachThingPrincipalResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachThingPrincipalResponse]
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
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined,
        merge: js.UndefOr[Flag] = js.undefined
    ): AttributePayload = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "merge" -> merge.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributePayload]
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
    def apply(
        enabled: js.UndefOr[Enabled] = js.undefined
    ): AuditCheckConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "enabled" -> enabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuditCheckConfiguration]
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
    def apply(
        checkCompliant: js.UndefOr[CheckCompliant] = js.undefined,
        checkRunStatus: js.UndefOr[AuditCheckRunStatus] = js.undefined,
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        message: js.UndefOr[ErrorMessage] = js.undefined,
        nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount] = js.undefined,
        totalResourcesCount: js.UndefOr[TotalResourcesCount] = js.undefined
    ): AuditCheckDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "checkCompliant" -> checkCompliant.map { x =>
          x.asInstanceOf[js.Any]
        },
        "checkRunStatus" -> checkRunStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorCode" -> errorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "message" -> message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nonCompliantResourcesCount" -> nonCompliantResourcesCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "totalResourcesCount" -> totalResourcesCount.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuditCheckDetails]
    }
  }

  object AuditCheckRunStatusEnum {
    val IN_PROGRESS                 = "IN_PROGRESS"
    val WAITING_FOR_DATA_COLLECTION = "WAITING_FOR_DATA_COLLECTION"
    val CANCELED                    = "CANCELED"
    val COMPLETED_COMPLIANT         = "COMPLETED_COMPLIANT"
    val COMPLETED_NON_COMPLIANT     = "COMPLETED_NON_COMPLIANT"
    val FAILED                      = "FAILED"

    val values = IndexedSeq(
      IN_PROGRESS,
      WAITING_FOR_DATA_COLLECTION,
      CANCELED,
      COMPLETED_COMPLIANT,
      COMPLETED_NON_COMPLIANT,
      FAILED
    )
  }

  /**
    * The findings (results) of the audit.
    */
  @js.native
  trait AuditFinding extends js.Object {
    var checkName: js.UndefOr[AuditCheckName]
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
    def apply(
        checkName: js.UndefOr[AuditCheckName] = js.undefined,
        findingTime: js.UndefOr[Timestamp] = js.undefined,
        nonCompliantResource: js.UndefOr[NonCompliantResource] = js.undefined,
        reasonForNonCompliance: js.UndefOr[ReasonForNonCompliance] = js.undefined,
        reasonForNonComplianceCode: js.UndefOr[ReasonForNonComplianceCode] = js.undefined,
        relatedResources: js.UndefOr[RelatedResources] = js.undefined,
        severity: js.UndefOr[AuditFindingSeverity] = js.undefined,
        taskId: js.UndefOr[AuditTaskId] = js.undefined,
        taskStartTime: js.UndefOr[Timestamp] = js.undefined
    ): AuditFinding = {
      val _fields = IndexedSeq[(String, js.Any)](
        "checkName" -> checkName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "findingTime" -> findingTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nonCompliantResource" -> nonCompliantResource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "reasonForNonCompliance" -> reasonForNonCompliance.map { x =>
          x.asInstanceOf[js.Any]
        },
        "reasonForNonComplianceCode" -> reasonForNonComplianceCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "relatedResources" -> relatedResources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "severity" -> severity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskId" -> taskId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskStartTime" -> taskStartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuditFinding]
    }
  }

  object AuditFindingSeverityEnum {
    val CRITICAL = "CRITICAL"
    val HIGH     = "HIGH"
    val MEDIUM   = "MEDIUM"
    val LOW      = "LOW"

    val values = IndexedSeq(CRITICAL, HIGH, MEDIUM, LOW)
  }

  object AuditFrequencyEnum {
    val DAILY    = "DAILY"
    val WEEKLY   = "WEEKLY"
    val BIWEEKLY = "BIWEEKLY"
    val MONTHLY  = "MONTHLY"

    val values = IndexedSeq(DAILY, WEEKLY, BIWEEKLY, MONTHLY)
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
    def apply(
        enabled: js.UndefOr[Enabled] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        targetArn: js.UndefOr[TargetArn] = js.undefined
    ): AuditNotificationTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "enabled" -> enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetArn" -> targetArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuditNotificationTarget]
    }
  }

  object AuditNotificationTypeEnum {
    val SNS = "SNS"

    val values = IndexedSeq(SNS)
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
    def apply(
        taskId: js.UndefOr[AuditTaskId] = js.undefined,
        taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined,
        taskType: js.UndefOr[AuditTaskType] = js.undefined
    ): AuditTaskMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskStatus" -> taskStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskType" -> taskType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuditTaskMetadata]
    }
  }

  object AuditTaskStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETED   = "COMPLETED"
    val FAILED      = "FAILED"
    val CANCELED    = "CANCELED"

    val values = IndexedSeq(IN_PROGRESS, COMPLETED, FAILED, CANCELED)
  }

  object AuditTaskTypeEnum {
    val ON_DEMAND_AUDIT_TASK = "ON_DEMAND_AUDIT_TASK"
    val SCHEDULED_AUDIT_TASK = "SCHEDULED_AUDIT_TASK"

    val values = IndexedSeq(ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK)
  }

  object AuthDecisionEnum {
    val ALLOWED       = "ALLOWED"
    val EXPLICIT_DENY = "EXPLICIT_DENY"
    val IMPLICIT_DENY = "IMPLICIT_DENY"

    val values = IndexedSeq(ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY)
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
    def apply(
        actionType: js.UndefOr[ActionType] = js.undefined,
        resources: js.UndefOr[Resources] = js.undefined
    ): AuthInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "actionType" -> actionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resources" -> resources.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthInfo]
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
    def apply(
        allowed: js.UndefOr[Allowed] = js.undefined,
        authDecision: js.UndefOr[AuthDecision] = js.undefined,
        authInfo: js.UndefOr[AuthInfo] = js.undefined,
        denied: js.UndefOr[Denied] = js.undefined,
        missingContextValues: js.UndefOr[MissingContextValues] = js.undefined
    ): AuthResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "allowed" -> allowed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "authDecision" -> authDecision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "authInfo" -> authInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "denied" -> denied.map { x =>
          x.asInstanceOf[js.Any]
        },
        "missingContextValues" -> missingContextValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerArn" -> authorizerArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "authorizerFunctionArn" -> authorizerFunctionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "authorizerName" -> authorizerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastModifiedDate" -> lastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tokenKeyName" -> tokenKeyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tokenSigningPublicKeys" -> tokenSigningPublicKeys.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizerDescription]
    }
  }

  object AuthorizerStatusEnum {
    val ACTIVE   = "ACTIVE"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, INACTIVE)
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
    def apply(
        authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined,
        authorizerName: js.UndefOr[AuthorizerName] = js.undefined
    ): AuthorizerSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerArn" -> authorizerArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "authorizerName" -> authorizerName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizerSummary]
    }
  }

  object AutoRegistrationStatusEnum {
    val ENABLE  = "ENABLE"
    val DISABLE = "DISABLE"

    val values = IndexedSeq(ENABLE, DISABLE)
  }

  /**
    * Configuration for the rollout of OTA updates.
    */
  @js.native
  trait AwsJobExecutionsRolloutConfig extends js.Object {
    var maximumPerMinute: js.UndefOr[MaximumPerMinute]
  }

  object AwsJobExecutionsRolloutConfig {
    def apply(
        maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.undefined
    ): AwsJobExecutionsRolloutConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maximumPerMinute" -> maximumPerMinute.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsJobExecutionsRolloutConfig]
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
    def apply(
        name: BehaviorName,
        criteria: js.UndefOr[BehaviorCriteria] = js.undefined,
        metric: js.UndefOr[BehaviorMetric] = js.undefined
    ): Behavior = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "criteria" -> criteria.map { x =>
          x.asInstanceOf[js.Any]
        },
        "metric" -> metric.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Behavior]
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
    def apply(
        comparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
        consecutiveDatapointsToAlarm: js.UndefOr[ConsecutiveDatapointsToAlarm] = js.undefined,
        consecutiveDatapointsToClear: js.UndefOr[ConsecutiveDatapointsToClear] = js.undefined,
        durationSeconds: js.UndefOr[DurationSeconds] = js.undefined,
        statisticalThreshold: js.UndefOr[StatisticalThreshold] = js.undefined,
        value: js.UndefOr[MetricValue] = js.undefined
    ): BehaviorCriteria = {
      val _fields = IndexedSeq[(String, js.Any)](
        "comparisonOperator" -> comparisonOperator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "consecutiveDatapointsToAlarm" -> consecutiveDatapointsToAlarm.map { x =>
          x.asInstanceOf[js.Any]
        },
        "consecutiveDatapointsToClear" -> consecutiveDatapointsToClear.map { x =>
          x.asInstanceOf[js.Any]
        },
        "durationSeconds" -> durationSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statisticalThreshold" -> statisticalThreshold.map { x =>
          x.asInstanceOf[js.Any]
        },
        "value" -> value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BehaviorCriteria]
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
    def apply(
        creationDate: js.UndefOr[CreationDate] = js.undefined
    ): BillingGroupMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BillingGroupMetadata]
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
    def apply(
        billingGroupDescription: js.UndefOr[BillingGroupDescription] = js.undefined
    ): BillingGroupProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupDescription" -> billingGroupDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BillingGroupProperties]
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
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        creationDate: js.UndefOr[DateType] = js.undefined,
        status: js.UndefOr[CACertificateStatus] = js.undefined
    ): CACertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateId" -> certificateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CACertificate]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "autoRegistrationStatus" -> autoRegistrationStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateArn" -> certificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateId" -> certificateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificatePem" -> certificatePem.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "customerVersion" -> customerVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "generationId" -> generationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastModifiedDate" -> lastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ownedBy" -> ownedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "validity" -> validity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CACertificateDescription]
    }
  }

  object CACertificateStatusEnum {
    val ACTIVE   = "ACTIVE"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, INACTIVE)
  }

  @js.native
  trait CancelAuditTaskRequest extends js.Object {
    var taskId: AuditTaskId
  }

  object CancelAuditTaskRequest {
    def apply(
        taskId: AuditTaskId
    ): CancelAuditTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelAuditTaskRequest]
    }
  }

  @js.native
  trait CancelAuditTaskResponse extends js.Object {}

  object CancelAuditTaskResponse {
    def apply(
        ): CancelAuditTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelAuditTaskResponse]
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
    def apply(
        certificateId: CertificateId
    ): CancelCertificateTransferRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelCertificateTransferRequest]
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
    def apply(
        jobId: JobId,
        thingName: ThingName,
        expectedVersion: js.UndefOr[ExpectedVersion] = js.undefined,
        force: js.UndefOr[ForceFlag] = js.undefined,
        statusDetails: js.UndefOr[DetailsMap] = js.undefined
    ): CancelJobExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId"     -> jobId.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any],
        "expectedVersion" -> expectedVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "force" -> force.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusDetails" -> statusDetails.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobExecutionRequest]
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
    def apply(
        jobId: JobId,
        comment: js.UndefOr[Comment] = js.undefined,
        force: js.UndefOr[ForceFlag] = js.undefined,
        reasonCode: js.UndefOr[ReasonCode] = js.undefined
    ): CancelJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.asInstanceOf[js.Any],
        "comment" -> comment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "force" -> force.map { x =>
          x.asInstanceOf[js.Any]
        },
        "reasonCode" -> reasonCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResponse extends js.Object {
    var description: js.UndefOr[JobDescription]
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
  }

  object CancelJobResponse {
    def apply(
        description: js.UndefOr[JobDescription] = js.undefined,
        jobArn: js.UndefOr[JobArn] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined
    ): CancelJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobArn" -> jobArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobId" -> jobId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobResponse]
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

    val values = IndexedSeq(
      `private`,
      `public-read`,
      `public-read-write`,
      `aws-exec-read`,
      `authenticated-read`,
      `bucket-owner-read`,
      `bucket-owner-full-control`,
      `log-delivery-write`
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
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        creationDate: js.UndefOr[DateType] = js.undefined,
        status: js.UndefOr[CertificateStatus] = js.undefined
    ): Certificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateId" -> certificateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Certificate]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "caCertificateId" -> caCertificateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateArn" -> certificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateId" -> certificateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificatePem" -> certificatePem.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "customerVersion" -> customerVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "generationId" -> generationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastModifiedDate" -> lastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ownedBy" -> ownedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "previousOwnedBy" -> previousOwnedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "transferData" -> transferData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "validity" -> validity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CertificateDescription]
    }
  }

  object CertificateStatusEnum {
    val ACTIVE             = "ACTIVE"
    val INACTIVE           = "INACTIVE"
    val REVOKED            = "REVOKED"
    val PENDING_TRANSFER   = "PENDING_TRANSFER"
    val REGISTER_INACTIVE  = "REGISTER_INACTIVE"
    val PENDING_ACTIVATION = "PENDING_ACTIVATION"

    val values = IndexedSeq(ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER, REGISTER_INACTIVE, PENDING_ACTIVATION)
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
    def apply(
        notAfter: js.UndefOr[DateType] = js.undefined,
        notBefore: js.UndefOr[DateType] = js.undefined
    ): CertificateValidity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "notAfter" -> notAfter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "notBefore" -> notBefore.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CertificateValidity]
    }
  }

  @js.native
  trait ClearDefaultAuthorizerRequest extends js.Object {}

  object ClearDefaultAuthorizerRequest {
    def apply(
        ): ClearDefaultAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClearDefaultAuthorizerRequest]
    }
  }

  @js.native
  trait ClearDefaultAuthorizerResponse extends js.Object {}

  object ClearDefaultAuthorizerResponse {
    def apply(
        ): ClearDefaultAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClearDefaultAuthorizerResponse]
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
    def apply(
        alarmName: AlarmName,
        roleArn: AwsArn,
        stateReason: StateReason,
        stateValue: StateValue
    ): CloudwatchAlarmAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "alarmName"   -> alarmName.asInstanceOf[js.Any],
        "roleArn"     -> roleArn.asInstanceOf[js.Any],
        "stateReason" -> stateReason.asInstanceOf[js.Any],
        "stateValue"  -> stateValue.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudwatchAlarmAction]
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
    def apply(
        metricName: String,
        metricNamespace: String,
        metricUnit: String,
        metricValue: String,
        roleArn: AwsArn,
        metricTimestamp: js.UndefOr[String] = js.undefined
    ): CloudwatchMetricAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metricName"      -> metricName.asInstanceOf[js.Any],
        "metricNamespace" -> metricNamespace.asInstanceOf[js.Any],
        "metricUnit"      -> metricUnit.asInstanceOf[js.Any],
        "metricValue"     -> metricValue.asInstanceOf[js.Any],
        "roleArn"         -> roleArn.asInstanceOf[js.Any],
        "metricTimestamp" -> metricTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudwatchMetricAction]
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
    def apply(
        awsSignerJobId: js.UndefOr[SigningJobId] = js.undefined,
        customCodeSigning: js.UndefOr[CustomCodeSigning] = js.undefined,
        startSigningJobParameter: js.UndefOr[StartSigningJobParameter] = js.undefined
    ): CodeSigning = {
      val _fields = IndexedSeq[(String, js.Any)](
        "awsSignerJobId" -> awsSignerJobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "customCodeSigning" -> customCodeSigning.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startSigningJobParameter" -> startSigningJobParameter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeSigning]
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
    def apply(
        certificateName: js.UndefOr[CertificateName] = js.undefined,
        inlineDocument: js.UndefOr[InlineDocument] = js.undefined
    ): CodeSigningCertificateChain = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateName" -> certificateName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "inlineDocument" -> inlineDocument.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeSigningCertificateChain]
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
    def apply(
        inlineDocument: js.UndefOr[Signature] = js.undefined
    ): CodeSigningSignature = {
      val _fields = IndexedSeq[(String, js.Any)](
        "inlineDocument" -> inlineDocument.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeSigningSignature]
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

    val values = IndexedSeq(
      `less-than`,
      `less-than-equals`,
      `greater-than`,
      `greater-than-equals`,
      `in-cidr-set`,
      `not-in-cidr-set`,
      `in-port-set`,
      `not-in-port-set`
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
    def apply(
        Enabled: js.UndefOr[Enabled] = js.undefined
    ): Configuration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Configuration]
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
    def apply(
        authorizerFunctionArn: AuthorizerFunctionArn,
        authorizerName: AuthorizerName,
        tokenKeyName: TokenKeyName,
        tokenSigningPublicKeys: PublicKeyMap,
        status: js.UndefOr[AuthorizerStatus] = js.undefined
    ): CreateAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerFunctionArn"  -> authorizerFunctionArn.asInstanceOf[js.Any],
        "authorizerName"         -> authorizerName.asInstanceOf[js.Any],
        "tokenKeyName"           -> tokenKeyName.asInstanceOf[js.Any],
        "tokenSigningPublicKeys" -> tokenSigningPublicKeys.asInstanceOf[js.Any],
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAuthorizerRequest]
    }
  }

  @js.native
  trait CreateAuthorizerResponse extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  object CreateAuthorizerResponse {
    def apply(
        authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined,
        authorizerName: js.UndefOr[AuthorizerName] = js.undefined
    ): CreateAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerArn" -> authorizerArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "authorizerName" -> authorizerName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAuthorizerResponse]
    }
  }

  @js.native
  trait CreateBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
    var billingGroupProperties: js.UndefOr[BillingGroupProperties]
    var tags: js.UndefOr[TagList]
  }

  object CreateBillingGroupRequest {
    def apply(
        billingGroupName: BillingGroupName,
        billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName" -> billingGroupName.asInstanceOf[js.Any],
        "billingGroupProperties" -> billingGroupProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBillingGroupRequest]
    }
  }

  @js.native
  trait CreateBillingGroupResponse extends js.Object {
    var billingGroupArn: js.UndefOr[BillingGroupArn]
    var billingGroupId: js.UndefOr[BillingGroupId]
    var billingGroupName: js.UndefOr[BillingGroupName]
  }

  object CreateBillingGroupResponse {
    def apply(
        billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
        billingGroupId: js.UndefOr[BillingGroupId] = js.undefined,
        billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
    ): CreateBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupArn" -> billingGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "billingGroupId" -> billingGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "billingGroupName" -> billingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBillingGroupResponse]
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
    def apply(
        certificateSigningRequest: CertificateSigningRequest,
        setAsActive: js.UndefOr[SetAsActive] = js.undefined
    ): CreateCertificateFromCsrRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateSigningRequest" -> certificateSigningRequest.asInstanceOf[js.Any],
        "setAsActive" -> setAsActive.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCertificateFromCsrRequest]
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
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        certificatePem: js.UndefOr[CertificatePem] = js.undefined
    ): CreateCertificateFromCsrResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateId" -> certificateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificatePem" -> certificatePem.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCertificateFromCsrResponse]
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
    def apply(
        queryString: QueryString,
        thingGroupName: ThingGroupName,
        indexName: js.UndefOr[IndexName] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined
    ): CreateDynamicThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "queryString"    -> queryString.asInstanceOf[js.Any],
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any],
        "indexName" -> indexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "queryVersion" -> queryVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupProperties" -> thingGroupProperties.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDynamicThingGroupRequest]
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
    def apply(
        indexName: js.UndefOr[IndexName] = js.undefined,
        queryString: js.UndefOr[QueryString] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined,
        thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
        thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
    ): CreateDynamicThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "indexName" -> indexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "queryString" -> queryString.map { x =>
          x.asInstanceOf[js.Any]
        },
        "queryVersion" -> queryVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupArn" -> thingGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupId" -> thingGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupName" -> thingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDynamicThingGroupResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId"   -> jobId.asInstanceOf[js.Any],
        "targets" -> targets.asInstanceOf[js.Any],
        "abortConfig" -> abortConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "document" -> document.map { x =>
          x.asInstanceOf[js.Any]
        },
        "documentSource" -> documentSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobExecutionsRolloutConfig" -> jobExecutionsRolloutConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "presignedUrlConfig" -> presignedUrlConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetSelection" -> targetSelection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeoutConfig" -> timeoutConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResponse extends js.Object {
    var description: js.UndefOr[JobDescription]
    var jobArn: js.UndefOr[JobArn]
    var jobId: js.UndefOr[JobId]
  }

  object CreateJobResponse {
    def apply(
        description: js.UndefOr[JobDescription] = js.undefined,
        jobArn: js.UndefOr[JobArn] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined
    ): CreateJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobArn" -> jobArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobId" -> jobId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobResponse]
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
    def apply(
        setAsActive: js.UndefOr[SetAsActive] = js.undefined
    ): CreateKeysAndCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "setAsActive" -> setAsActive.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeysAndCertificateRequest]
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
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        certificatePem: js.UndefOr[CertificatePem] = js.undefined,
        keyPair: js.UndefOr[KeyPair] = js.undefined
    ): CreateKeysAndCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateId" -> certificateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificatePem" -> certificatePem.map { x =>
          x.asInstanceOf[js.Any]
        },
        "keyPair" -> keyPair.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeysAndCertificateResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "files"       -> files.asInstanceOf[js.Any],
        "otaUpdateId" -> otaUpdateId.asInstanceOf[js.Any],
        "roleArn"     -> roleArn.asInstanceOf[js.Any],
        "targets"     -> targets.asInstanceOf[js.Any],
        "additionalParameters" -> additionalParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "awsJobExecutionsRolloutConfig" -> awsJobExecutionsRolloutConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetSelection" -> targetSelection.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOTAUpdateRequest]
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
    def apply(
        awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.undefined,
        awsIotJobId: js.UndefOr[AwsIotJobId] = js.undefined,
        otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined,
        otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined,
        otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
    ): CreateOTAUpdateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "awsIotJobArn" -> awsIotJobArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "awsIotJobId" -> awsIotJobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "otaUpdateArn" -> otaUpdateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "otaUpdateId" -> otaUpdateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "otaUpdateStatus" -> otaUpdateStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOTAUpdateResponse]
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
    def apply(
        policyDocument: PolicyDocument,
        policyName: PolicyName
    ): CreatePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyDocument" -> policyDocument.asInstanceOf[js.Any],
        "policyName"     -> policyName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyRequest]
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
    def apply(
        policyArn: js.UndefOr[PolicyArn] = js.undefined,
        policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
        policyName: js.UndefOr[PolicyName] = js.undefined,
        policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
    ): CreatePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyArn" -> policyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyDocument" -> policyDocument.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyName" -> policyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyVersionId" -> policyVersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyResponse]
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
    def apply(
        policyDocument: PolicyDocument,
        policyName: PolicyName,
        setAsDefault: js.UndefOr[SetAsDefault] = js.undefined
    ): CreatePolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyDocument" -> policyDocument.asInstanceOf[js.Any],
        "policyName"     -> policyName.asInstanceOf[js.Any],
        "setAsDefault" -> setAsDefault.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyVersionRequest]
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
    def apply(
        isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
        policyArn: js.UndefOr[PolicyArn] = js.undefined,
        policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
        policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
    ): CreatePolicyVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "isDefaultVersion" -> isDefaultVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyArn" -> policyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyDocument" -> policyDocument.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyVersionId" -> policyVersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePolicyVersionResponse]
    }
  }

  @js.native
  trait CreateRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
    var roleArn: RoleArn
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds]
  }

  object CreateRoleAliasRequest {
    def apply(
        roleAlias: RoleAlias,
        roleArn: RoleArn,
        credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined
    ): CreateRoleAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAlias" -> roleAlias.asInstanceOf[js.Any],
        "roleArn"   -> roleArn.asInstanceOf[js.Any],
        "credentialDurationSeconds" -> credentialDurationSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
    ): CreateRoleAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAlias" -> roleAlias.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleAliasArn" -> roleAliasArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRoleAliasResponse]
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
    def apply(
        frequency: AuditFrequency,
        scheduledAuditName: ScheduledAuditName,
        targetCheckNames: TargetAuditCheckNames,
        dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateScheduledAuditRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "frequency"          -> frequency.asInstanceOf[js.Any],
        "scheduledAuditName" -> scheduledAuditName.asInstanceOf[js.Any],
        "targetCheckNames"   -> targetCheckNames.asInstanceOf[js.Any],
        "dayOfMonth" -> dayOfMonth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "dayOfWeek" -> dayOfWeek.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateScheduledAuditRequest]
    }
  }

  @js.native
  trait CreateScheduledAuditResponse extends js.Object {
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
  }

  object CreateScheduledAuditResponse {
    def apply(
        scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined
    ): CreateScheduledAuditResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditArn" -> scheduledAuditArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateScheduledAuditResponse]
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
    def apply(
        securityProfileName: SecurityProfileName,
        additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined,
        alertTargets: js.UndefOr[AlertTargets] = js.undefined,
        behaviors: js.UndefOr[Behaviors] = js.undefined,
        securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any],
        "additionalMetricsToRetain" -> additionalMetricsToRetain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "alertTargets" -> alertTargets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "behaviors" -> behaviors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileDescription" -> securityProfileDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityProfileRequest]
    }
  }

  @js.native
  trait CreateSecurityProfileResponse extends js.Object {
    var securityProfileArn: js.UndefOr[SecurityProfileArn]
    var securityProfileName: js.UndefOr[SecurityProfileName]
  }

  object CreateSecurityProfileResponse {
    def apply(
        securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
    ): CreateSecurityProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileArn" -> securityProfileArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileName" -> securityProfileName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityProfileResponse]
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
    def apply(
        files: StreamFiles,
        roleArn: RoleArn,
        streamId: StreamId,
        description: js.UndefOr[StreamDescription] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "files"    -> files.asInstanceOf[js.Any],
        "roleArn"  -> roleArn.asInstanceOf[js.Any],
        "streamId" -> streamId.asInstanceOf[js.Any],
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamRequest]
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
    def apply(
        description: js.UndefOr[StreamDescription] = js.undefined,
        streamArn: js.UndefOr[StreamArn] = js.undefined,
        streamId: js.UndefOr[StreamId] = js.undefined,
        streamVersion: js.UndefOr[StreamVersion] = js.undefined
    ): CreateStreamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamArn" -> streamArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamId" -> streamId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamVersion" -> streamVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamResponse]
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
    def apply(
        thingGroupName: ThingGroupName,
        parentGroupName: js.UndefOr[ThingGroupName] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined
    ): CreateThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any],
        "parentGroupName" -> parentGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupProperties" -> thingGroupProperties.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThingGroupRequest]
    }
  }

  @js.native
  trait CreateThingGroupResponse extends js.Object {
    var thingGroupArn: js.UndefOr[ThingGroupArn]
    var thingGroupId: js.UndefOr[ThingGroupId]
    var thingGroupName: js.UndefOr[ThingGroupName]
  }

  object CreateThingGroupResponse {
    def apply(
        thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
        thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
    ): CreateThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupArn" -> thingGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupId" -> thingGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupName" -> thingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThingGroupResponse]
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
    def apply(
        thingName: ThingName,
        attributePayload: js.UndefOr[AttributePayload] = js.undefined,
        billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    ): CreateThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.asInstanceOf[js.Any],
        "attributePayload" -> attributePayload.map { x =>
          x.asInstanceOf[js.Any]
        },
        "billingGroupName" -> billingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeName" -> thingTypeName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThingRequest]
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
    def apply(
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingId: js.UndefOr[ThingId] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): CreateThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingArn" -> thingArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingId" -> thingId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThingResponse]
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
    def apply(
        thingTypeName: ThingTypeName,
        tags: js.UndefOr[TagList] = js.undefined,
        thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
    ): CreateThingTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeName" -> thingTypeName.asInstanceOf[js.Any],
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeProperties" -> thingTypeProperties.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThingTypeRequest]
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
    def apply(
        thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined,
        thingTypeId: js.UndefOr[ThingTypeId] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    ): CreateThingTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeArn" -> thingTypeArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeId" -> thingTypeId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeName" -> thingTypeName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThingTypeResponse]
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
    def apply(
        ruleName: RuleName,
        topicRulePayload: TopicRulePayload,
        tags: js.UndefOr[String] = js.undefined
    ): CreateTopicRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName"         -> ruleName.asInstanceOf[js.Any],
        "topicRulePayload" -> topicRulePayload.asInstanceOf[js.Any],
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTopicRuleRequest]
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
    def apply(
        certificateChain: js.UndefOr[CodeSigningCertificateChain] = js.undefined,
        hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined,
        signature: js.UndefOr[CodeSigningSignature] = js.undefined,
        signatureAlgorithm: js.UndefOr[SignatureAlgorithm] = js.undefined
    ): CustomCodeSigning = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateChain" -> certificateChain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "hashAlgorithm" -> hashAlgorithm.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signature" -> signature.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signatureAlgorithm" -> signatureAlgorithm.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        deleteScheduledAudits: js.UndefOr[DeleteScheduledAudits] = js.undefined
    ): DeleteAccountAuditConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deleteScheduledAudits" -> deleteScheduledAudits.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountAuditConfigurationRequest]
    }
  }

  @js.native
  trait DeleteAccountAuditConfigurationResponse extends js.Object {}

  object DeleteAccountAuditConfigurationResponse {
    def apply(
        ): DeleteAccountAuditConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccountAuditConfigurationResponse]
    }
  }

  @js.native
  trait DeleteAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
  }

  object DeleteAuthorizerRequest {
    def apply(
        authorizerName: AuthorizerName
    ): DeleteAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAuthorizerRequest]
    }
  }

  @js.native
  trait DeleteAuthorizerResponse extends js.Object {}

  object DeleteAuthorizerResponse {
    def apply(
        ): DeleteAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAuthorizerResponse]
    }
  }

  @js.native
  trait DeleteBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteBillingGroupRequest {
    def apply(
        billingGroupName: BillingGroupName,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): DeleteBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName" -> billingGroupName.asInstanceOf[js.Any],
        "expectedVersion" -> expectedVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBillingGroupRequest]
    }
  }

  @js.native
  trait DeleteBillingGroupResponse extends js.Object {}

  object DeleteBillingGroupResponse {
    def apply(
        ): DeleteBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBillingGroupResponse]
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
    def apply(
        certificateId: CertificateId
    ): DeleteCACertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCACertificateRequest]
    }
  }

  /**
    * The output for the DeleteCACertificate operation.
    */
  @js.native
  trait DeleteCACertificateResponse extends js.Object {}

  object DeleteCACertificateResponse {
    def apply(
        ): DeleteCACertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCACertificateResponse]
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
    def apply(
        certificateId: CertificateId,
        forceDelete: js.UndefOr[ForceDelete] = js.undefined
    ): DeleteCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.asInstanceOf[js.Any],
        "forceDelete" -> forceDelete.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCertificateRequest]
    }
  }

  @js.native
  trait DeleteDynamicThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteDynamicThingGroupRequest {
    def apply(
        thingGroupName: ThingGroupName,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): DeleteDynamicThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any],
        "expectedVersion" -> expectedVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDynamicThingGroupRequest]
    }
  }

  @js.native
  trait DeleteDynamicThingGroupResponse extends js.Object {}

  object DeleteDynamicThingGroupResponse {
    def apply(
        ): DeleteDynamicThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDynamicThingGroupResponse]
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
    def apply(
        executionNumber: ExecutionNumber,
        jobId: JobId,
        thingName: ThingName,
        force: js.UndefOr[ForceFlag] = js.undefined
    ): DeleteJobExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionNumber" -> executionNumber.asInstanceOf[js.Any],
        "jobId"           -> jobId.asInstanceOf[js.Any],
        "thingName"       -> thingName.asInstanceOf[js.Any],
        "force" -> force.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobExecutionRequest]
    }
  }

  @js.native
  trait DeleteJobRequest extends js.Object {
    var jobId: JobId
    var force: js.UndefOr[ForceFlag]
  }

  object DeleteJobRequest {
    def apply(
        jobId: JobId,
        force: js.UndefOr[ForceFlag] = js.undefined
    ): DeleteJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.asInstanceOf[js.Any],
        "force" -> force.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobRequest]
    }
  }

  @js.native
  trait DeleteOTAUpdateRequest extends js.Object {
    var otaUpdateId: OTAUpdateId
    var deleteStream: js.UndefOr[DeleteStream]
    var forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob]
  }

  object DeleteOTAUpdateRequest {
    def apply(
        otaUpdateId: OTAUpdateId,
        deleteStream: js.UndefOr[DeleteStream] = js.undefined,
        forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob] = js.undefined
    ): DeleteOTAUpdateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "otaUpdateId" -> otaUpdateId.asInstanceOf[js.Any],
        "deleteStream" -> deleteStream.map { x =>
          x.asInstanceOf[js.Any]
        },
        "forceDeleteAWSJob" -> forceDeleteAWSJob.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOTAUpdateRequest]
    }
  }

  @js.native
  trait DeleteOTAUpdateResponse extends js.Object {}

  object DeleteOTAUpdateResponse {
    def apply(
        ): DeleteOTAUpdateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOTAUpdateResponse]
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
    def apply(
        policyName: PolicyName
    ): DeletePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePolicyRequest]
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
    def apply(
        policyName: PolicyName,
        policyVersionId: PolicyVersionId
    ): DeletePolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName"      -> policyName.asInstanceOf[js.Any],
        "policyVersionId" -> policyVersionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePolicyVersionRequest]
    }
  }

  /**
    * The input for the DeleteRegistrationCode operation.
    */
  @js.native
  trait DeleteRegistrationCodeRequest extends js.Object {}

  object DeleteRegistrationCodeRequest {
    def apply(
        ): DeleteRegistrationCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRegistrationCodeRequest]
    }
  }

  /**
    * The output for the DeleteRegistrationCode operation.
    */
  @js.native
  trait DeleteRegistrationCodeResponse extends js.Object {}

  object DeleteRegistrationCodeResponse {
    def apply(
        ): DeleteRegistrationCodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRegistrationCodeResponse]
    }
  }

  @js.native
  trait DeleteRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
  }

  object DeleteRoleAliasRequest {
    def apply(
        roleAlias: RoleAlias
    ): DeleteRoleAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAlias" -> roleAlias.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRoleAliasRequest]
    }
  }

  @js.native
  trait DeleteRoleAliasResponse extends js.Object {}

  object DeleteRoleAliasResponse {
    def apply(
        ): DeleteRoleAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRoleAliasResponse]
    }
  }

  @js.native
  trait DeleteScheduledAuditRequest extends js.Object {
    var scheduledAuditName: ScheduledAuditName
  }

  object DeleteScheduledAuditRequest {
    def apply(
        scheduledAuditName: ScheduledAuditName
    ): DeleteScheduledAuditRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditName" -> scheduledAuditName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteScheduledAuditRequest]
    }
  }

  @js.native
  trait DeleteScheduledAuditResponse extends js.Object {}

  object DeleteScheduledAuditResponse {
    def apply(
        ): DeleteScheduledAuditResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteScheduledAuditResponse]
    }
  }

  @js.native
  trait DeleteSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteSecurityProfileRequest {
    def apply(
        securityProfileName: SecurityProfileName,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): DeleteSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any],
        "expectedVersion" -> expectedVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecurityProfileRequest]
    }
  }

  @js.native
  trait DeleteSecurityProfileResponse extends js.Object {}

  object DeleteSecurityProfileResponse {
    def apply(
        ): DeleteSecurityProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecurityProfileResponse]
    }
  }

  @js.native
  trait DeleteStreamRequest extends js.Object {
    var streamId: StreamId
  }

  object DeleteStreamRequest {
    def apply(
        streamId: StreamId
    ): DeleteStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamId" -> streamId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamRequest]
    }
  }

  @js.native
  trait DeleteStreamResponse extends js.Object {}

  object DeleteStreamResponse {
    def apply(
        ): DeleteStreamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamResponse]
    }
  }

  @js.native
  trait DeleteThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object DeleteThingGroupRequest {
    def apply(
        thingGroupName: ThingGroupName,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): DeleteThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any],
        "expectedVersion" -> expectedVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThingGroupRequest]
    }
  }

  @js.native
  trait DeleteThingGroupResponse extends js.Object {}

  object DeleteThingGroupResponse {
    def apply(
        ): DeleteThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThingGroupResponse]
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
    def apply(
        thingName: ThingName,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): DeleteThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.asInstanceOf[js.Any],
        "expectedVersion" -> expectedVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThingRequest]
    }
  }

  /**
    * The output of the DeleteThing operation.
    */
  @js.native
  trait DeleteThingResponse extends js.Object {}

  object DeleteThingResponse {
    def apply(
        ): DeleteThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThingResponse]
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
    def apply(
        thingTypeName: ThingTypeName
    ): DeleteThingTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeName" -> thingTypeName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThingTypeRequest]
    }
  }

  /**
    * The output for the DeleteThingType operation.
    */
  @js.native
  trait DeleteThingTypeResponse extends js.Object {}

  object DeleteThingTypeResponse {
    def apply(
        ): DeleteThingTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThingTypeResponse]
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
    def apply(
        ruleName: RuleName
    ): DeleteTopicRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTopicRuleRequest]
    }
  }

  @js.native
  trait DeleteV2LoggingLevelRequest extends js.Object {
    var targetName: LogTargetName
    var targetType: LogTargetType
  }

  object DeleteV2LoggingLevelRequest {
    def apply(
        targetName: LogTargetName,
        targetType: LogTargetType
    ): DeleteV2LoggingLevelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetName" -> targetName.asInstanceOf[js.Any],
        "targetType" -> targetType.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteV2LoggingLevelRequest]
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
    def apply(
        explicitDeny: js.UndefOr[ExplicitDeny] = js.undefined,
        implicitDeny: js.UndefOr[ImplicitDeny] = js.undefined
    ): Denied = {
      val _fields = IndexedSeq[(String, js.Any)](
        "explicitDeny" -> explicitDeny.map { x =>
          x.asInstanceOf[js.Any]
        },
        "implicitDeny" -> implicitDeny.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Denied]
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
    def apply(
        thingTypeName: ThingTypeName,
        undoDeprecate: js.UndefOr[UndoDeprecate] = js.undefined
    ): DeprecateThingTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeName" -> thingTypeName.asInstanceOf[js.Any],
        "undoDeprecate" -> undoDeprecate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprecateThingTypeRequest]
    }
  }

  /**
    * The output for the DeprecateThingType operation.
    */
  @js.native
  trait DeprecateThingTypeResponse extends js.Object {}

  object DeprecateThingTypeResponse {
    def apply(
        ): DeprecateThingTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprecateThingTypeResponse]
    }
  }

  @js.native
  trait DescribeAccountAuditConfigurationRequest extends js.Object {}

  object DescribeAccountAuditConfigurationRequest {
    def apply(
        ): DescribeAccountAuditConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAuditConfigurationRequest]
    }
  }

  @js.native
  trait DescribeAccountAuditConfigurationResponse extends js.Object {
    var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations]
    var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations]
    var roleArn: js.UndefOr[RoleArn]
  }

  object DescribeAccountAuditConfigurationResponse {
    def apply(
        auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.undefined,
        auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeAccountAuditConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "auditCheckConfigurations" -> auditCheckConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "auditNotificationTargetConfigurations" -> auditNotificationTargetConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAuditConfigurationResponse]
    }
  }

  @js.native
  trait DescribeAuditTaskRequest extends js.Object {
    var taskId: AuditTaskId
  }

  object DescribeAuditTaskRequest {
    def apply(
        taskId: AuditTaskId
    ): DescribeAuditTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAuditTaskRequest]
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
    def apply(
        auditDetails: js.UndefOr[AuditDetails] = js.undefined,
        scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined,
        taskStartTime: js.UndefOr[Timestamp] = js.undefined,
        taskStatistics: js.UndefOr[TaskStatistics] = js.undefined,
        taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined,
        taskType: js.UndefOr[AuditTaskType] = js.undefined
    ): DescribeAuditTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "auditDetails" -> auditDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "scheduledAuditName" -> scheduledAuditName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskStartTime" -> taskStartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskStatistics" -> taskStatistics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskStatus" -> taskStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskType" -> taskType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAuditTaskResponse]
    }
  }

  @js.native
  trait DescribeAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
  }

  object DescribeAuthorizerRequest {
    def apply(
        authorizerName: AuthorizerName
    ): DescribeAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAuthorizerRequest]
    }
  }

  @js.native
  trait DescribeAuthorizerResponse extends js.Object {
    var authorizerDescription: js.UndefOr[AuthorizerDescription]
  }

  object DescribeAuthorizerResponse {
    def apply(
        authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined
    ): DescribeAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerDescription" -> authorizerDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAuthorizerResponse]
    }
  }

  @js.native
  trait DescribeBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
  }

  object DescribeBillingGroupRequest {
    def apply(
        billingGroupName: BillingGroupName
    ): DescribeBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName" -> billingGroupName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBillingGroupRequest]
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
    def apply(
        billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
        billingGroupId: js.UndefOr[BillingGroupId] = js.undefined,
        billingGroupMetadata: js.UndefOr[BillingGroupMetadata] = js.undefined,
        billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
        billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): DescribeBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupArn" -> billingGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "billingGroupId" -> billingGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "billingGroupMetadata" -> billingGroupMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "billingGroupName" -> billingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "billingGroupProperties" -> billingGroupProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBillingGroupResponse]
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
    def apply(
        certificateId: CertificateId
    ): DescribeCACertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCACertificateRequest]
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
    def apply(
        certificateDescription: js.UndefOr[CACertificateDescription] = js.undefined,
        registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
    ): DescribeCACertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateDescription" -> certificateDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "registrationConfig" -> registrationConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCACertificateResponse]
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
    def apply(
        certificateId: CertificateId
    ): DescribeCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificateRequest]
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
    def apply(
        certificateDescription: js.UndefOr[CertificateDescription] = js.undefined
    ): DescribeCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateDescription" -> certificateDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificateResponse]
    }
  }

  @js.native
  trait DescribeDefaultAuthorizerRequest extends js.Object {}

  object DescribeDefaultAuthorizerRequest {
    def apply(
        ): DescribeDefaultAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDefaultAuthorizerRequest]
    }
  }

  @js.native
  trait DescribeDefaultAuthorizerResponse extends js.Object {
    var authorizerDescription: js.UndefOr[AuthorizerDescription]
  }

  object DescribeDefaultAuthorizerResponse {
    def apply(
        authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined
    ): DescribeDefaultAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerDescription" -> authorizerDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDefaultAuthorizerResponse]
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
    def apply(
        endpointType: js.UndefOr[EndpointType] = js.undefined
    ): DescribeEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endpointType" -> endpointType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointRequest]
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
    def apply(
        endpointAddress: js.UndefOr[EndpointAddress] = js.undefined
    ): DescribeEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endpointAddress" -> endpointAddress.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointResponse]
    }
  }

  @js.native
  trait DescribeEventConfigurationsRequest extends js.Object {}

  object DescribeEventConfigurationsRequest {
    def apply(
        ): DescribeEventConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeEventConfigurationsResponse extends js.Object {
    var creationDate: js.UndefOr[CreationDate]
    var eventConfigurations: js.UndefOr[EventConfigurations]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
  }

  object DescribeEventConfigurationsResponse {
    def apply(
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        eventConfigurations: js.UndefOr[EventConfigurations] = js.undefined,
        lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined
    ): DescribeEventConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "eventConfigurations" -> eventConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastModifiedDate" -> lastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventConfigurationsResponse]
    }
  }

  @js.native
  trait DescribeIndexRequest extends js.Object {
    var indexName: IndexName
  }

  object DescribeIndexRequest {
    def apply(
        indexName: IndexName
    ): DescribeIndexRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "indexName" -> indexName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        schema: js.UndefOr[IndexSchema] = js.undefined
    ): DescribeIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "indexName" -> indexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "indexStatus" -> indexStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "schema" -> schema.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIndexResponse]
    }
  }

  @js.native
  trait DescribeJobExecutionRequest extends js.Object {
    var jobId: JobId
    var thingName: ThingName
    var executionNumber: js.UndefOr[ExecutionNumber]
  }

  object DescribeJobExecutionRequest {
    def apply(
        jobId: JobId,
        thingName: ThingName,
        executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
    ): DescribeJobExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId"     -> jobId.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any],
        "executionNumber" -> executionNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobExecutionRequest]
    }
  }

  @js.native
  trait DescribeJobExecutionResponse extends js.Object {
    var execution: js.UndefOr[JobExecution]
  }

  object DescribeJobExecutionResponse {
    def apply(
        execution: js.UndefOr[JobExecution] = js.undefined
    ): DescribeJobExecutionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "execution" -> execution.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobExecutionResponse]
    }
  }

  @js.native
  trait DescribeJobRequest extends js.Object {
    var jobId: JobId
  }

  object DescribeJobRequest {
    def apply(
        jobId: JobId
    ): DescribeJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        job: js.UndefOr[Job] = js.undefined
    ): DescribeJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "documentSource" -> documentSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "job" -> job.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobResponse]
    }
  }

  @js.native
  trait DescribeRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
  }

  object DescribeRoleAliasRequest {
    def apply(
        roleAlias: RoleAlias
    ): DescribeRoleAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAlias" -> roleAlias.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRoleAliasRequest]
    }
  }

  @js.native
  trait DescribeRoleAliasResponse extends js.Object {
    var roleAliasDescription: js.UndefOr[RoleAliasDescription]
  }

  object DescribeRoleAliasResponse {
    def apply(
        roleAliasDescription: js.UndefOr[RoleAliasDescription] = js.undefined
    ): DescribeRoleAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAliasDescription" -> roleAliasDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRoleAliasResponse]
    }
  }

  @js.native
  trait DescribeScheduledAuditRequest extends js.Object {
    var scheduledAuditName: ScheduledAuditName
  }

  object DescribeScheduledAuditRequest {
    def apply(
        scheduledAuditName: ScheduledAuditName
    ): DescribeScheduledAuditRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditName" -> scheduledAuditName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledAuditRequest]
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
    def apply(
        dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
        frequency: js.UndefOr[AuditFrequency] = js.undefined,
        scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined,
        scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined,
        targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined
    ): DescribeScheduledAuditResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dayOfMonth" -> dayOfMonth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "dayOfWeek" -> dayOfWeek.map { x =>
          x.asInstanceOf[js.Any]
        },
        "frequency" -> frequency.map { x =>
          x.asInstanceOf[js.Any]
        },
        "scheduledAuditArn" -> scheduledAuditArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "scheduledAuditName" -> scheduledAuditName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetCheckNames" -> targetCheckNames.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledAuditResponse]
    }
  }

  @js.native
  trait DescribeSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
  }

  object DescribeSecurityProfileRequest {
    def apply(
        securityProfileName: SecurityProfileName
    ): DescribeSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityProfileRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "additionalMetricsToRetain" -> additionalMetricsToRetain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "alertTargets" -> alertTargets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "behaviors" -> behaviors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastModifiedDate" -> lastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileArn" -> securityProfileArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileDescription" -> securityProfileDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileName" -> securityProfileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityProfileResponse]
    }
  }

  @js.native
  trait DescribeStreamRequest extends js.Object {
    var streamId: StreamId
  }

  object DescribeStreamRequest {
    def apply(
        streamId: StreamId
    ): DescribeStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamId" -> streamId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamRequest]
    }
  }

  @js.native
  trait DescribeStreamResponse extends js.Object {
    var streamInfo: js.UndefOr[StreamInfo]
  }

  object DescribeStreamResponse {
    def apply(
        streamInfo: js.UndefOr[StreamInfo] = js.undefined
    ): DescribeStreamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamInfo" -> streamInfo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamResponse]
    }
  }

  @js.native
  trait DescribeThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
  }

  object DescribeThingGroupRequest {
    def apply(
        thingGroupName: ThingGroupName
    ): DescribeThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingGroupRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "indexName" -> indexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "queryString" -> queryString.map { x =>
          x.asInstanceOf[js.Any]
        },
        "queryVersion" -> queryVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupArn" -> thingGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupId" -> thingGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupMetadata" -> thingGroupMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupName" -> thingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupProperties" -> thingGroupProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingGroupResponse]
    }
  }

  @js.native
  trait DescribeThingRegistrationTaskRequest extends js.Object {
    var taskId: TaskId
  }

  object DescribeThingRegistrationTaskRequest {
    def apply(
        taskId: TaskId
    ): DescribeThingRegistrationTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingRegistrationTaskRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "failureCount" -> failureCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "inputFileBucket" -> inputFileBucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "inputFileKey" -> inputFileKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastModifiedDate" -> lastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "message" -> message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "percentageProgress" -> percentageProgress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "successCount" -> successCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskId" -> taskId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "templateBody" -> templateBody.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingRegistrationTaskResponse]
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
    def apply(
        thingName: ThingName
    ): DescribeThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "billingGroupName" -> billingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "defaultClientId" -> defaultClientId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingArn" -> thingArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingId" -> thingId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeName" -> thingTypeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingResponse]
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
    def apply(
        thingTypeName: ThingTypeName
    ): DescribeThingTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeName" -> thingTypeName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingTypeRequest]
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
    def apply(
        thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined,
        thingTypeId: js.UndefOr[ThingTypeId] = js.undefined,
        thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
        thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
    ): DescribeThingTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeArn" -> thingTypeArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeId" -> thingTypeId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeMetadata" -> thingTypeMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeName" -> thingTypeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeProperties" -> thingTypeProperties.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeThingTypeResponse]
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
    def apply(
        s3Destination: js.UndefOr[S3Destination] = js.undefined
    ): Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3Destination" -> s3Destination.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }

  @js.native
  trait DetachPolicyRequest extends js.Object {
    var policyName: PolicyName
    var target: PolicyTarget
  }

  object DetachPolicyRequest {
    def apply(
        policyName: PolicyName,
        target: PolicyTarget
    ): DetachPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.asInstanceOf[js.Any],
        "target"     -> target.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachPolicyRequest]
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
    def apply(
        policyName: PolicyName,
        principal: Principal
    ): DetachPrincipalPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.asInstanceOf[js.Any],
        "principal"  -> principal.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachPrincipalPolicyRequest]
    }
  }

  @js.native
  trait DetachSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var securityProfileTargetArn: SecurityProfileTargetArn
  }

  object DetachSecurityProfileRequest {
    def apply(
        securityProfileName: SecurityProfileName,
        securityProfileTargetArn: SecurityProfileTargetArn
    ): DetachSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName"      -> securityProfileName.asInstanceOf[js.Any],
        "securityProfileTargetArn" -> securityProfileTargetArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachSecurityProfileRequest]
    }
  }

  @js.native
  trait DetachSecurityProfileResponse extends js.Object {}

  object DetachSecurityProfileResponse {
    def apply(
        ): DetachSecurityProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachSecurityProfileResponse]
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
    def apply(
        principal: Principal,
        thingName: ThingName
    ): DetachThingPrincipalRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "principal" -> principal.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachThingPrincipalRequest]
    }
  }

  /**
    * The output from the DetachThingPrincipal operation.
    */
  @js.native
  trait DetachThingPrincipalResponse extends js.Object {}

  object DetachThingPrincipalResponse {
    def apply(
        ): DetachThingPrincipalResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachThingPrincipalResponse]
    }
  }

  /**
    * The input for the DisableTopicRuleRequest operation.
    */
  @js.native
  trait DisableTopicRuleRequest extends js.Object {
    var ruleName: RuleName
  }

  object DisableTopicRuleRequest {
    def apply(
        ruleName: RuleName
    ): DisableTopicRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableTopicRuleRequest]
    }
  }

  object DynamicGroupStatusEnum {
    val ACTIVE     = "ACTIVE"
    val BUILDING   = "BUILDING"
    val REBUILDING = "REBUILDING"

    val values = IndexedSeq(ACTIVE, BUILDING, REBUILDING)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "hashKeyField" -> hashKeyField.asInstanceOf[js.Any],
        "hashKeyValue" -> hashKeyValue.asInstanceOf[js.Any],
        "roleArn"      -> roleArn.asInstanceOf[js.Any],
        "tableName"    -> tableName.asInstanceOf[js.Any],
        "hashKeyType" -> hashKeyType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "payloadField" -> payloadField.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rangeKeyField" -> rangeKeyField.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rangeKeyType" -> rangeKeyType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rangeKeyValue" -> rangeKeyValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DynamoDBAction]
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
    def apply(
        putItem: PutItemInput,
        roleArn: AwsArn
    ): DynamoDBv2Action = {
      val _fields = IndexedSeq[(String, js.Any)](
        "putItem" -> putItem.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DynamoDBv2Action]
    }
  }

  object DynamoKeyTypeEnum {
    val STRING = "STRING"
    val NUMBER = "NUMBER"

    val values = IndexedSeq(STRING, NUMBER)
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
    def apply(
        policyArn: js.UndefOr[PolicyArn] = js.undefined,
        policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
        policyName: js.UndefOr[PolicyName] = js.undefined
    ): EffectivePolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyArn" -> policyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyDocument" -> policyDocument.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyName" -> policyName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EffectivePolicy]
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
    def apply(
        endpoint: ElasticsearchEndpoint,
        id: ElasticsearchId,
        index: ElasticsearchIndex,
        roleArn: AwsArn,
        `type`: ElasticsearchType
    ): ElasticsearchAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endpoint" -> endpoint.asInstanceOf[js.Any],
        "id"       -> id.asInstanceOf[js.Any],
        "index"    -> index.asInstanceOf[js.Any],
        "roleArn"  -> roleArn.asInstanceOf[js.Any],
        "`type`"   -> `type`.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchAction]
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
    def apply(
        ruleName: RuleName
    ): EnableTopicRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableTopicRuleRequest]
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
    def apply(
        code: js.UndefOr[Code] = js.undefined,
        message: js.UndefOr[OTAUpdateErrorMessage] = js.undefined
    ): ErrorInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "code" -> code.map { x =>
          x.asInstanceOf[js.Any]
        },
        "message" -> message.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorInfo]
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

    val values = IndexedSeq(
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
  }

  /**
    * Information that explicitly denies authorization.
    */
  @js.native
  trait ExplicitDeny extends js.Object {
    var policies: js.UndefOr[Policies]
  }

  object ExplicitDeny {
    def apply(
        policies: js.UndefOr[Policies] = js.undefined
    ): ExplicitDeny = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policies" -> policies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExplicitDeny]
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
    def apply(
        baseRatePerMinute: RolloutRatePerMinute,
        incrementFactor: IncrementFactor,
        rateIncreaseCriteria: RateIncreaseCriteria
    ): ExponentialRolloutRate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "baseRatePerMinute"    -> baseRatePerMinute.asInstanceOf[js.Any],
        "incrementFactor"      -> incrementFactor.asInstanceOf[js.Any],
        "rateIncreaseCriteria" -> rateIncreaseCriteria.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExponentialRolloutRate]
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
    def apply(
        s3Location: js.UndefOr[S3Location] = js.undefined,
        stream: js.UndefOr[Stream] = js.undefined
    ): FileLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3Location" -> s3Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stream" -> stream.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileLocation]
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
    def apply(
        deliveryStreamName: DeliveryStreamName,
        roleArn: AwsArn,
        separator: js.UndefOr[FirehoseSeparator] = js.undefined
    ): FirehoseAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deliveryStreamName" -> deliveryStreamName.asInstanceOf[js.Any],
        "roleArn"            -> roleArn.asInstanceOf[js.Any],
        "separator" -> separator.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FirehoseAction]
    }
  }

  @js.native
  trait GetEffectivePoliciesRequest extends js.Object {
    var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId]
    var principal: js.UndefOr[Principal]
    var thingName: js.UndefOr[ThingName]
  }

  object GetEffectivePoliciesRequest {
    def apply(
        cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined,
        principal: js.UndefOr[Principal] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): GetEffectivePoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cognitoIdentityPoolId" -> cognitoIdentityPoolId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "principal" -> principal.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEffectivePoliciesRequest]
    }
  }

  @js.native
  trait GetEffectivePoliciesResponse extends js.Object {
    var effectivePolicies: js.UndefOr[EffectivePolicies]
  }

  object GetEffectivePoliciesResponse {
    def apply(
        effectivePolicies: js.UndefOr[EffectivePolicies] = js.undefined
    ): GetEffectivePoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "effectivePolicies" -> effectivePolicies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEffectivePoliciesResponse]
    }
  }

  @js.native
  trait GetIndexingConfigurationRequest extends js.Object {}

  object GetIndexingConfigurationRequest {
    def apply(
        ): GetIndexingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIndexingConfigurationRequest]
    }
  }

  @js.native
  trait GetIndexingConfigurationResponse extends js.Object {
    var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration]
    var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration]
  }

  object GetIndexingConfigurationResponse {
    def apply(
        thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.undefined,
        thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.undefined
    ): GetIndexingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupIndexingConfiguration" -> thingGroupIndexingConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingIndexingConfiguration" -> thingIndexingConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIndexingConfigurationResponse]
    }
  }

  @js.native
  trait GetJobDocumentRequest extends js.Object {
    var jobId: JobId
  }

  object GetJobDocumentRequest {
    def apply(
        jobId: JobId
    ): GetJobDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobDocumentRequest]
    }
  }

  @js.native
  trait GetJobDocumentResponse extends js.Object {
    var document: js.UndefOr[JobDocument]
  }

  object GetJobDocumentResponse {
    def apply(
        document: js.UndefOr[JobDocument] = js.undefined
    ): GetJobDocumentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "document" -> document.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobDocumentResponse]
    }
  }

  /**
    * The input for the GetLoggingOptions operation.
    */
  @js.native
  trait GetLoggingOptionsRequest extends js.Object {}

  object GetLoggingOptionsRequest {
    def apply(
        ): GetLoggingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoggingOptionsRequest]
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
    def apply(
        logLevel: js.UndefOr[LogLevel] = js.undefined,
        roleArn: js.UndefOr[AwsArn] = js.undefined
    ): GetLoggingOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logLevel" -> logLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoggingOptionsResponse]
    }
  }

  @js.native
  trait GetOTAUpdateRequest extends js.Object {
    var otaUpdateId: OTAUpdateId
  }

  object GetOTAUpdateRequest {
    def apply(
        otaUpdateId: OTAUpdateId
    ): GetOTAUpdateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "otaUpdateId" -> otaUpdateId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOTAUpdateRequest]
    }
  }

  @js.native
  trait GetOTAUpdateResponse extends js.Object {
    var otaUpdateInfo: js.UndefOr[OTAUpdateInfo]
  }

  object GetOTAUpdateResponse {
    def apply(
        otaUpdateInfo: js.UndefOr[OTAUpdateInfo] = js.undefined
    ): GetOTAUpdateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "otaUpdateInfo" -> otaUpdateInfo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOTAUpdateResponse]
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
    def apply(
        policyName: PolicyName
    ): GetPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyRequest]
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
    def apply(
        creationDate: js.UndefOr[DateType] = js.undefined,
        defaultVersionId: js.UndefOr[PolicyVersionId] = js.undefined,
        generationId: js.UndefOr[GenerationId] = js.undefined,
        lastModifiedDate: js.UndefOr[DateType] = js.undefined,
        policyArn: js.UndefOr[PolicyArn] = js.undefined,
        policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
        policyName: js.UndefOr[PolicyName] = js.undefined
    ): GetPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "defaultVersionId" -> defaultVersionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "generationId" -> generationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastModifiedDate" -> lastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyArn" -> policyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyDocument" -> policyDocument.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyName" -> policyName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyResponse]
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
    def apply(
        policyName: PolicyName,
        policyVersionId: PolicyVersionId
    ): GetPolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName"      -> policyName.asInstanceOf[js.Any],
        "policyVersionId" -> policyVersionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyVersionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "generationId" -> generationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isDefaultVersion" -> isDefaultVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastModifiedDate" -> lastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyArn" -> policyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyDocument" -> policyDocument.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyName" -> policyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyVersionId" -> policyVersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyVersionResponse]
    }
  }

  /**
    * The input to the GetRegistrationCode operation.
    */
  @js.native
  trait GetRegistrationCodeRequest extends js.Object {}

  object GetRegistrationCodeRequest {
    def apply(
        ): GetRegistrationCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRegistrationCodeRequest]
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
    def apply(
        registrationCode: js.UndefOr[RegistrationCode] = js.undefined
    ): GetRegistrationCodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registrationCode" -> registrationCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRegistrationCodeResponse]
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
    def apply(
        queryString: QueryString,
        aggregationField: js.UndefOr[AggregationField] = js.undefined,
        indexName: js.UndefOr[IndexName] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined
    ): GetStatisticsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "queryString" -> queryString.asInstanceOf[js.Any],
        "aggregationField" -> aggregationField.map { x =>
          x.asInstanceOf[js.Any]
        },
        "indexName" -> indexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "queryVersion" -> queryVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStatisticsRequest]
    }
  }

  @js.native
  trait GetStatisticsResponse extends js.Object {
    var statistics: js.UndefOr[Statistics]
  }

  object GetStatisticsResponse {
    def apply(
        statistics: js.UndefOr[Statistics] = js.undefined
    ): GetStatisticsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statistics" -> statistics.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStatisticsResponse]
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
    def apply(
        ruleName: RuleName
    ): GetTopicRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTopicRuleRequest]
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
    def apply(
        rule: js.UndefOr[TopicRule] = js.undefined,
        ruleArn: js.UndefOr[RuleArn] = js.undefined
    ): GetTopicRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rule" -> rule.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ruleArn" -> ruleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTopicRuleResponse]
    }
  }

  @js.native
  trait GetV2LoggingOptionsRequest extends js.Object {}

  object GetV2LoggingOptionsRequest {
    def apply(
        ): GetV2LoggingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetV2LoggingOptionsRequest]
    }
  }

  @js.native
  trait GetV2LoggingOptionsResponse extends js.Object {
    var defaultLogLevel: js.UndefOr[LogLevel]
    var disableAllLogs: js.UndefOr[DisableAllLogs]
    var roleArn: js.UndefOr[AwsArn]
  }

  object GetV2LoggingOptionsResponse {
    def apply(
        defaultLogLevel: js.UndefOr[LogLevel] = js.undefined,
        disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined,
        roleArn: js.UndefOr[AwsArn] = js.undefined
    ): GetV2LoggingOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "defaultLogLevel" -> defaultLogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "disableAllLogs" -> disableAllLogs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetV2LoggingOptionsResponse]
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
    def apply(
        groupArn: js.UndefOr[ThingGroupArn] = js.undefined,
        groupName: js.UndefOr[ThingGroupName] = js.undefined
    ): GroupNameAndArn = {
      val _fields = IndexedSeq[(String, js.Any)](
        "groupArn" -> groupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "groupName" -> groupName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupNameAndArn]
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
    def apply(
        policies: js.UndefOr[Policies] = js.undefined
    ): ImplicitDeny = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policies" -> policies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImplicitDeny]
    }
  }

  object IndexStatusEnum {
    val ACTIVE     = "ACTIVE"
    val BUILDING   = "BUILDING"
    val REBUILDING = "REBUILDING"

    val values = IndexedSeq(ACTIVE, BUILDING, REBUILDING)
  }

  /**
    * Sends messge data to an AWS IoT Analytics channel.
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
        roleArn: js.UndefOr[AwsArn] = js.undefined
    ): IotAnalyticsAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "channelArn" -> channelArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "channelName" -> channelName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IotAnalyticsAction]
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
    def apply(
        inputName: InputName,
        roleArn: AwsArn,
        messageId: js.UndefOr[MessageId] = js.undefined
    ): IotEventsAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "inputName" -> inputName.asInstanceOf[js.Any],
        "roleArn"   -> roleArn.asInstanceOf[js.Any],
        "messageId" -> messageId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IotEventsAction]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "abortConfig" -> abortConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "comment" -> comment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "completedAt" -> completedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "forceCanceled" -> forceCanceled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobArn" -> jobArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobExecutionsRolloutConfig" -> jobExecutionsRolloutConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobId" -> jobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobProcessDetails" -> jobProcessDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedAt" -> lastUpdatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "presignedUrlConfig" -> presignedUrlConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "reasonCode" -> reasonCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetSelection" -> targetSelection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targets" -> targets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeoutConfig" -> timeoutConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Job]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "approximateSecondsBeforeTimedOut" -> approximateSecondsBeforeTimedOut.map { x =>
          x.asInstanceOf[js.Any]
        },
        "executionNumber" -> executionNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "forceCanceled" -> forceCanceled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobId" -> jobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedAt" -> lastUpdatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "queuedAt" -> queuedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startedAt" -> startedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusDetails" -> statusDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingArn" -> thingArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "versionNumber" -> versionNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecution]
    }
  }

  object JobExecutionFailureTypeEnum {
    val FAILED    = "FAILED"
    val REJECTED  = "REJECTED"
    val TIMED_OUT = "TIMED_OUT"
    val ALL       = "ALL"

    val values = IndexedSeq(FAILED, REJECTED, TIMED_OUT, ALL)
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

    val values = IndexedSeq(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED)
  }

  /**
    * Details of the job execution status.
    */
  @js.native
  trait JobExecutionStatusDetails extends js.Object {
    var detailsMap: js.UndefOr[DetailsMap]
  }

  object JobExecutionStatusDetails {
    def apply(
        detailsMap: js.UndefOr[DetailsMap] = js.undefined
    ): JobExecutionStatusDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "detailsMap" -> detailsMap.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecutionStatusDetails]
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
    def apply(
        executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
        lastUpdatedAt: js.UndefOr[DateType] = js.undefined,
        queuedAt: js.UndefOr[DateType] = js.undefined,
        startedAt: js.UndefOr[DateType] = js.undefined,
        status: js.UndefOr[JobExecutionStatus] = js.undefined
    ): JobExecutionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionNumber" -> executionNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedAt" -> lastUpdatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "queuedAt" -> queuedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startedAt" -> startedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecutionSummary]
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
    def apply(
        jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.undefined,
        thingArn: js.UndefOr[ThingArn] = js.undefined
    ): JobExecutionSummaryForJob = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobExecutionSummary" -> jobExecutionSummary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingArn" -> thingArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecutionSummaryForJob]
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
    def apply(
        jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined
    ): JobExecutionSummaryForThing = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobExecutionSummary" -> jobExecutionSummary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobId" -> jobId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecutionSummaryForThing]
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
    def apply(
        exponentialRate: js.UndefOr[ExponentialRolloutRate] = js.undefined,
        maximumPerMinute: js.UndefOr[MaxJobExecutionsPerMin] = js.undefined
    ): JobExecutionsRolloutConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exponentialRate" -> exponentialRate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maximumPerMinute" -> maximumPerMinute.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecutionsRolloutConfig]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "numberOfCanceledThings" -> numberOfCanceledThings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "numberOfFailedThings" -> numberOfFailedThings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "numberOfInProgressThings" -> numberOfInProgressThings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "numberOfQueuedThings" -> numberOfQueuedThings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "numberOfRejectedThings" -> numberOfRejectedThings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "numberOfRemovedThings" -> numberOfRemovedThings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "numberOfSucceededThings" -> numberOfSucceededThings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "numberOfTimedOutThings" -> numberOfTimedOutThings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "processingTargets" -> processingTargets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobProcessDetails]
    }
  }

  object JobStatusEnum {
    val IN_PROGRESS          = "IN_PROGRESS"
    val CANCELED             = "CANCELED"
    val COMPLETED            = "COMPLETED"
    val DELETION_IN_PROGRESS = "DELETION_IN_PROGRESS"

    val values = IndexedSeq(IN_PROGRESS, CANCELED, COMPLETED, DELETION_IN_PROGRESS)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "completedAt" -> completedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobArn" -> jobArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobId" -> jobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedAt" -> lastUpdatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetSelection" -> targetSelection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupId" -> thingGroupId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobSummary]
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
    def apply(
        PrivateKey: js.UndefOr[PrivateKey] = js.undefined,
        PublicKey: js.UndefOr[PublicKey] = js.undefined
    ): KeyPair = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrivateKey" -> PrivateKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicKey" -> PublicKey.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPair]
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
    def apply(
        roleArn: AwsArn,
        streamName: StreamName,
        partitionKey: js.UndefOr[PartitionKey] = js.undefined
    ): KinesisAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn"    -> roleArn.asInstanceOf[js.Any],
        "streamName" -> streamName.asInstanceOf[js.Any],
        "partitionKey" -> partitionKey.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisAction]
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
    def apply(
        functionArn: FunctionArn
    ): LambdaAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "functionArn" -> functionArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaAction]
    }
  }

  @js.native
  trait ListActiveViolationsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[ThingName]
  }

  object ListActiveViolationsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): ListActiveViolationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileName" -> securityProfileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActiveViolationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activeViolations" -> activeViolations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActiveViolationsResponse]
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
    def apply(
        target: PolicyTarget,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined,
        recursive: js.UndefOr[Recursive] = js.undefined
    ): ListAttachedPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "target" -> target.asInstanceOf[js.Any],
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageSize" -> pageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "recursive" -> recursive.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedPoliciesRequest]
    }
  }

  @js.native
  trait ListAttachedPoliciesResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var policies: js.UndefOr[Policies]
  }

  object ListAttachedPoliciesResponse {
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        policies: js.UndefOr[Policies] = js.undefined
    ): ListAttachedPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextMarker" -> nextMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policies" -> policies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedPoliciesResponse]
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
    def apply(
        checkName: js.UndefOr[AuditCheckName] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        taskId: js.UndefOr[AuditTaskId] = js.undefined
    ): ListAuditFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "checkName" -> checkName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "endTime" -> endTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceIdentifier" -> resourceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startTime" -> startTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskId" -> taskId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAuditFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "findings" -> findings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAuditFindingsResponse]
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
    def apply(
        endTime: Timestamp,
        startTime: Timestamp,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined,
        taskType: js.UndefOr[AuditTaskType] = js.undefined
    ): ListAuditTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endTime"   -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskStatus" -> taskStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskType" -> taskType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAuditTasksRequest]
    }
  }

  @js.native
  trait ListAuditTasksResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tasks: js.UndefOr[AuditTaskMetadataList]
  }

  object ListAuditTasksResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tasks: js.UndefOr[AuditTaskMetadataList] = js.undefined
    ): ListAuditTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tasks" -> tasks.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAuditTasksResponse]
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
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined,
        status: js.UndefOr[AuthorizerStatus] = js.undefined
    ): ListAuthorizersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ascendingOrder" -> ascendingOrder.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageSize" -> pageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextMarker: js.UndefOr[Marker] = js.undefined
    ): ListAuthorizersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizers" -> authorizers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextMarker" -> nextMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAuthorizersResponse]
    }
  }

  @js.native
  trait ListBillingGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[RegistryMaxResults]
    var namePrefixFilter: js.UndefOr[BillingGroupName]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBillingGroupsRequest {
    def apply(
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        namePrefixFilter: js.UndefOr[BillingGroupName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBillingGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "namePrefixFilter" -> namePrefixFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBillingGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroups" -> billingGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBillingGroupsResponse]
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
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListCACertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ascendingOrder" -> ascendingOrder.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageSize" -> pageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCACertificatesRequest]
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
    def apply(
        certificates: js.UndefOr[CACertificates] = js.undefined,
        nextMarker: js.UndefOr[Marker] = js.undefined
    ): ListCACertificatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificates" -> certificates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextMarker" -> nextMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCACertificatesResponse]
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
    def apply(
        caCertificateId: CertificateId,
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListCertificatesByCARequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "caCertificateId" -> caCertificateId.asInstanceOf[js.Any],
        "ascendingOrder" -> ascendingOrder.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageSize" -> pageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCertificatesByCARequest]
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
    def apply(
        certificates: js.UndefOr[Certificates] = js.undefined,
        nextMarker: js.UndefOr[Marker] = js.undefined
    ): ListCertificatesByCAResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificates" -> certificates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextMarker" -> nextMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCertificatesByCAResponse]
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
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListCertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ascendingOrder" -> ascendingOrder.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageSize" -> pageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCertificatesRequest]
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
    def apply(
        certificates: js.UndefOr[Certificates] = js.undefined,
        nextMarker: js.UndefOr[Marker] = js.undefined
    ): ListCertificatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificates" -> certificates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextMarker" -> nextMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCertificatesResponse]
    }
  }

  @js.native
  trait ListIndicesRequest extends js.Object {
    var maxResults: js.UndefOr[QueryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListIndicesRequest {
    def apply(
        maxResults: js.UndefOr[QueryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIndicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIndicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "indexNames" -> indexNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIndicesResponse]
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
    def apply(
        jobId: JobId,
        maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[JobExecutionStatus] = js.undefined
    ): ListJobExecutionsForJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobExecutionsForJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionSummaries" -> executionSummaries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobExecutionsForJobResponse]
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
    def apply(
        thingName: ThingName,
        maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[JobExecutionStatus] = js.undefined
    ): ListJobExecutionsForThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobExecutionsForThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionSummaries" -> executionSummaries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobExecutionsForThingResponse]
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
    def apply(
        maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[JobStatus] = js.undefined,
        targetSelection: js.UndefOr[TargetSelection] = js.undefined,
        thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
    ): ListJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetSelection" -> targetSelection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupId" -> thingGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupName" -> thingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobs" -> jobs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
    ): ListOTAUpdatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "otaUpdateStatus" -> otaUpdateStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOTAUpdatesRequest]
    }
  }

  @js.native
  trait ListOTAUpdatesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var otaUpdates: js.UndefOr[OTAUpdatesSummary]
  }

  object ListOTAUpdatesResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        otaUpdates: js.UndefOr[OTAUpdatesSummary] = js.undefined
    ): ListOTAUpdatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "otaUpdates" -> otaUpdates.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOTAUpdatesResponse]
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
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListOutgoingCertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ascendingOrder" -> ascendingOrder.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageSize" -> pageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOutgoingCertificatesRequest]
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
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        outgoingCertificates: js.UndefOr[OutgoingCertificates] = js.undefined
    ): ListOutgoingCertificatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextMarker" -> nextMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "outgoingCertificates" -> outgoingCertificates.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOutgoingCertificatesResponse]
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
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ascendingOrder" -> ascendingOrder.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageSize" -> pageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesRequest]
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
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        policies: js.UndefOr[Policies] = js.undefined
    ): ListPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextMarker" -> nextMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policies" -> policies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPoliciesResponse]
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
    def apply(
        policyName: PolicyName,
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListPolicyPrincipalsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.asInstanceOf[js.Any],
        "ascendingOrder" -> ascendingOrder.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageSize" -> pageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyPrincipalsRequest]
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
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        principals: js.UndefOr[Principals] = js.undefined
    ): ListPolicyPrincipalsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextMarker" -> nextMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "principals" -> principals.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyPrincipalsResponse]
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
    def apply(
        policyName: PolicyName
    ): ListPolicyVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyVersionsRequest]
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
    def apply(
        policyVersions: js.UndefOr[PolicyVersions] = js.undefined
    ): ListPolicyVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyVersions" -> policyVersions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyVersionsResponse]
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
    def apply(
        principal: Principal,
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListPrincipalPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "principal" -> principal.asInstanceOf[js.Any],
        "ascendingOrder" -> ascendingOrder.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageSize" -> pageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalPoliciesRequest]
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
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        policies: js.UndefOr[Policies] = js.undefined
    ): ListPrincipalPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextMarker" -> nextMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policies" -> policies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalPoliciesResponse]
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
    def apply(
        principal: Principal,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPrincipalThingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "principal" -> principal.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalThingsRequest]
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
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        things: js.UndefOr[ThingNameList] = js.undefined
    ): ListPrincipalThingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "things" -> things.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalThingsResponse]
    }
  }

  @js.native
  trait ListRoleAliasesRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListRoleAliasesRequest {
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListRoleAliasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ascendingOrder" -> ascendingOrder.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageSize" -> pageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRoleAliasesRequest]
    }
  }

  @js.native
  trait ListRoleAliasesResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var roleAliases: js.UndefOr[RoleAliases]
  }

  object ListRoleAliasesResponse {
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        roleAliases: js.UndefOr[RoleAliases] = js.undefined
    ): ListRoleAliasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextMarker" -> nextMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleAliases" -> roleAliases.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRoleAliasesResponse]
    }
  }

  @js.native
  trait ListScheduledAuditsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListScheduledAuditsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListScheduledAuditsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListScheduledAuditsRequest]
    }
  }

  @js.native
  trait ListScheduledAuditsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var scheduledAudits: js.UndefOr[ScheduledAuditMetadataList]
  }

  object ListScheduledAuditsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        scheduledAudits: js.UndefOr[ScheduledAuditMetadataList] = js.undefined
    ): ListScheduledAuditsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "scheduledAudits" -> scheduledAudits.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListScheduledAuditsResponse]
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
    def apply(
        securityProfileTargetArn: SecurityProfileTargetArn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recursive: js.UndefOr[Recursive] = js.undefined
    ): ListSecurityProfilesForTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileTargetArn" -> securityProfileTargetArn.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "recursive" -> recursive.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityProfilesForTargetRequest]
    }
  }

  @js.native
  trait ListSecurityProfilesForTargetResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings]
  }

  object ListSecurityProfilesForTargetResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings] = js.undefined
    ): ListSecurityProfilesForTargetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileTargetMappings" -> securityProfileTargetMappings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityProfilesForTargetResponse]
    }
  }

  @js.native
  trait ListSecurityProfilesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSecurityProfilesRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSecurityProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityProfilesRequest]
    }
  }

  @js.native
  trait ListSecurityProfilesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var securityProfileIdentifiers: js.UndefOr[SecurityProfileIdentifiers]
  }

  object ListSecurityProfilesResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileIdentifiers: js.UndefOr[SecurityProfileIdentifiers] = js.undefined
    ): ListSecurityProfilesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileIdentifiers" -> securityProfileIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityProfilesResponse]
    }
  }

  @js.native
  trait ListStreamsRequest extends js.Object {
    var ascendingOrder: js.UndefOr[AscendingOrder]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListStreamsRequest {
    def apply(
        ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListStreamsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ascendingOrder" -> ascendingOrder.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsRequest]
    }
  }

  @js.native
  trait ListStreamsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var streams: js.UndefOr[StreamsSummary]
  }

  object ListStreamsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        streams: js.UndefOr[StreamsSummary] = js.undefined
    ): ListStreamsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streams" -> streams.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    def apply(
        resourceArn: ResourceArn,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTargetsForPolicyRequest extends js.Object {
    var policyName: PolicyName
    var marker: js.UndefOr[Marker]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListTargetsForPolicyRequest {
    def apply(
        policyName: PolicyName,
        marker: js.UndefOr[Marker] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListTargetsForPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.asInstanceOf[js.Any],
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageSize" -> pageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsForPolicyRequest]
    }
  }

  @js.native
  trait ListTargetsForPolicyResponse extends js.Object {
    var nextMarker: js.UndefOr[Marker]
    var targets: js.UndefOr[PolicyTargets]
  }

  object ListTargetsForPolicyResponse {
    def apply(
        nextMarker: js.UndefOr[Marker] = js.undefined,
        targets: js.UndefOr[PolicyTargets] = js.undefined
    ): ListTargetsForPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextMarker" -> nextMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targets" -> targets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsForPolicyResponse]
    }
  }

  @js.native
  trait ListTargetsForSecurityProfileRequest extends js.Object {
    var securityProfileName: SecurityProfileName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTargetsForSecurityProfileRequest {
    def apply(
        securityProfileName: SecurityProfileName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTargetsForSecurityProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsForSecurityProfileRequest]
    }
  }

  @js.native
  trait ListTargetsForSecurityProfileResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var securityProfileTargets: js.UndefOr[SecurityProfileTargets]
  }

  object ListTargetsForSecurityProfileResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileTargets: js.UndefOr[SecurityProfileTargets] = js.undefined
    ): ListTargetsForSecurityProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileTargets" -> securityProfileTargets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTargetsForSecurityProfileResponse]
    }
  }

  @js.native
  trait ListThingGroupsForThingRequest extends js.Object {
    var thingName: ThingName
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingGroupsForThingRequest {
    def apply(
        thingName: ThingName,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListThingGroupsForThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingGroupsForThingRequest]
    }
  }

  @js.native
  trait ListThingGroupsForThingResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var thingGroups: js.UndefOr[ThingGroupNameAndArnList]
  }

  object ListThingGroupsForThingResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
    ): ListThingGroupsForThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroups" -> thingGroups.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingGroupsForThingResponse]
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
    def apply(
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        namePrefixFilter: js.UndefOr[ThingGroupName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        parentGroup: js.UndefOr[ThingGroupName] = js.undefined,
        recursive: js.UndefOr[RecursiveWithoutDefault] = js.undefined
    ): ListThingGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "namePrefixFilter" -> namePrefixFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parentGroup" -> parentGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "recursive" -> recursive.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingGroupsRequest]
    }
  }

  @js.native
  trait ListThingGroupsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var thingGroups: js.UndefOr[ThingGroupNameAndArnList]
  }

  object ListThingGroupsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
    ): ListThingGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroups" -> thingGroups.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingGroupsResponse]
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
    def apply(
        thingName: ThingName
    ): ListThingPrincipalsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingPrincipalsRequest]
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
    def apply(
        principals: js.UndefOr[Principals] = js.undefined
    ): ListThingPrincipalsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "principals" -> principals.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingPrincipalsResponse]
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
    def apply(
        reportType: ReportType,
        taskId: TaskId,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListThingRegistrationTaskReportsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "reportType" -> reportType.asInstanceOf[js.Any],
        "taskId"     -> taskId.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingRegistrationTaskReportsRequest]
    }
  }

  @js.native
  trait ListThingRegistrationTaskReportsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var reportType: js.UndefOr[ReportType]
    var resourceLinks: js.UndefOr[S3FileUrlList]
  }

  object ListThingRegistrationTaskReportsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        reportType: js.UndefOr[ReportType] = js.undefined,
        resourceLinks: js.UndefOr[S3FileUrlList] = js.undefined
    ): ListThingRegistrationTaskReportsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "reportType" -> reportType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceLinks" -> resourceLinks.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingRegistrationTaskReportsResponse]
    }
  }

  @js.native
  trait ListThingRegistrationTasksRequest extends js.Object {
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[Status]
  }

  object ListThingRegistrationTasksRequest {
    def apply(
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): ListThingRegistrationTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingRegistrationTasksRequest]
    }
  }

  @js.native
  trait ListThingRegistrationTasksResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var taskIds: js.UndefOr[TaskIdList]
  }

  object ListThingRegistrationTasksResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        taskIds: js.UndefOr[TaskIdList] = js.undefined
    ): ListThingRegistrationTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskIds" -> taskIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingRegistrationTasksResponse]
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
    def apply(
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    ): ListThingTypesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeName" -> thingTypeName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingTypesRequest]
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
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingTypes: js.UndefOr[ThingTypeList] = js.undefined
    ): ListThingTypesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypes" -> thingTypes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingTypesResponse]
    }
  }

  @js.native
  trait ListThingsInBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
    var maxResults: js.UndefOr[RegistryMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListThingsInBillingGroupRequest {
    def apply(
        billingGroupName: BillingGroupName,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListThingsInBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName" -> billingGroupName.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingsInBillingGroupRequest]
    }
  }

  @js.native
  trait ListThingsInBillingGroupResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[ThingNameList]
  }

  object ListThingsInBillingGroupResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        things: js.UndefOr[ThingNameList] = js.undefined
    ): ListThingsInBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "things" -> things.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingsInBillingGroupResponse]
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
    def apply(
        thingGroupName: ThingGroupName,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recursive: js.UndefOr[Recursive] = js.undefined
    ): ListThingsInThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName" -> thingGroupName.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "recursive" -> recursive.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingsInThingGroupRequest]
    }
  }

  @js.native
  trait ListThingsInThingGroupResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[ThingNameList]
  }

  object ListThingsInThingGroupResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        things: js.UndefOr[ThingNameList] = js.undefined
    ): ListThingsInThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "things" -> things.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingsInThingGroupResponse]
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
    def apply(
        attributeName: js.UndefOr[AttributeName] = js.undefined,
        attributeValue: js.UndefOr[AttributeValue] = js.undefined,
        maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    ): ListThingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributeName" -> attributeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "attributeValue" -> attributeValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeName" -> thingTypeName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingsRequest]
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
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        things: js.UndefOr[ThingAttributeList] = js.undefined
    ): ListThingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "things" -> things.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThingsResponse]
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
    def apply(
        maxResults: js.UndefOr[GEMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        ruleDisabled: js.UndefOr[IsDisabled] = js.undefined,
        topic: js.UndefOr[Topic] = js.undefined
    ): ListTopicRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ruleDisabled" -> ruleDisabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "topic" -> topic.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTopicRulesRequest]
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
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        rules: js.UndefOr[TopicRuleList] = js.undefined
    ): ListTopicRulesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rules" -> rules.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTopicRulesResponse]
    }
  }

  @js.native
  trait ListV2LoggingLevelsRequest extends js.Object {
    var maxResults: js.UndefOr[SkyfallMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var targetType: js.UndefOr[LogTargetType]
  }

  object ListV2LoggingLevelsRequest {
    def apply(
        maxResults: js.UndefOr[SkyfallMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        targetType: js.UndefOr[LogTargetType] = js.undefined
    ): ListV2LoggingLevelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetType" -> targetType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListV2LoggingLevelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logTargetConfigurations" -> logTargetConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListV2LoggingLevelsResponse]
    }
  }

  @js.native
  trait ListViolationEventsRequest extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var securityProfileName: js.UndefOr[SecurityProfileName]
    var thingName: js.UndefOr[ThingName]
  }

  object ListViolationEventsRequest {
    def apply(
        endTime: Timestamp,
        startTime: Timestamp,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): ListViolationEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endTime"   -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileName" -> securityProfileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListViolationEventsRequest]
    }
  }

  @js.native
  trait ListViolationEventsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var violationEvents: js.UndefOr[ViolationEvents]
  }

  object ListViolationEventsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        violationEvents: js.UndefOr[ViolationEvents] = js.undefined
    ): ListViolationEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "violationEvents" -> violationEvents.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListViolationEventsResponse]
    }
  }

  object LogLevelEnum {
    val DEBUG    = "DEBUG"
    val INFO     = "INFO"
    val ERROR    = "ERROR"
    val WARN     = "WARN"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(DEBUG, INFO, ERROR, WARN, DISABLED)
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
    def apply(
        targetType: LogTargetType,
        targetName: js.UndefOr[LogTargetName] = js.undefined
    ): LogTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetType" -> targetType.asInstanceOf[js.Any],
        "targetName" -> targetName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogTarget]
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
    def apply(
        logLevel: js.UndefOr[LogLevel] = js.undefined,
        logTarget: js.UndefOr[LogTarget] = js.undefined
    ): LogTargetConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logLevel" -> logLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "logTarget" -> logTarget.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogTargetConfiguration]
    }
  }

  object LogTargetTypeEnum {
    val DEFAULT     = "DEFAULT"
    val THING_GROUP = "THING_GROUP"

    val values = IndexedSeq(DEFAULT, THING_GROUP)
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
    def apply(
        roleArn: AwsArn,
        logLevel: js.UndefOr[LogLevel] = js.undefined
    ): LoggingOptionsPayload = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "logLevel" -> logLevel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggingOptionsPayload]
    }
  }

  object MessageFormatEnum {
    val RAW  = "RAW"
    val JSON = "JSON"

    val values = IndexedSeq(RAW, JSON)
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
    def apply(
        cidrs: js.UndefOr[Cidrs] = js.undefined,
        count: js.UndefOr[UnsignedLong] = js.undefined,
        ports: js.UndefOr[Ports] = js.undefined
    ): MetricValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cidrs" -> cidrs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "count" -> count.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ports" -> ports.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricValue]
    }
  }

  /**
    * Information about the resource that was non-compliant with the audit check.
    */
  @js.native
  trait NonCompliantResource extends js.Object {
    var additionalInfo: js.UndefOr[StringMap]
    var resourceIdentifier: js.UndefOr[ResourceIdentifier]
    var resourceType: js.UndefOr[ResourceType]
  }

  object NonCompliantResource {
    def apply(
        additionalInfo: js.UndefOr[StringMap] = js.undefined,
        resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): NonCompliantResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "additionalInfo" -> additionalInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceIdentifier" -> resourceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NonCompliantResource]
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
    def apply(
        attributes: js.UndefOr[AttributesMap] = js.undefined,
        codeSigning: js.UndefOr[CodeSigning] = js.undefined,
        fileLocation: js.UndefOr[FileLocation] = js.undefined,
        fileName: js.UndefOr[FileName] = js.undefined,
        fileVersion: js.UndefOr[OTAUpdateFileVersion] = js.undefined
    ): OTAUpdateFile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "codeSigning" -> codeSigning.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fileLocation" -> fileLocation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fileName" -> fileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fileVersion" -> fileVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OTAUpdateFile]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "additionalParameters" -> additionalParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "awsIotJobArn" -> awsIotJobArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "awsIotJobId" -> awsIotJobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "awsJobExecutionsRolloutConfig" -> awsJobExecutionsRolloutConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorInfo" -> errorInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastModifiedDate" -> lastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "otaUpdateArn" -> otaUpdateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "otaUpdateFiles" -> otaUpdateFiles.map { x =>
          x.asInstanceOf[js.Any]
        },
        "otaUpdateId" -> otaUpdateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "otaUpdateStatus" -> otaUpdateStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetSelection" -> targetSelection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targets" -> targets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OTAUpdateInfo]
    }
  }

  object OTAUpdateStatusEnum {
    val CREATE_PENDING     = "CREATE_PENDING"
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val CREATE_COMPLETE    = "CREATE_COMPLETE"
    val CREATE_FAILED      = "CREATE_FAILED"

    val values = IndexedSeq(CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED)
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
    def apply(
        creationDate: js.UndefOr[DateType] = js.undefined,
        otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined,
        otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined
    ): OTAUpdateSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "otaUpdateArn" -> otaUpdateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "otaUpdateId" -> otaUpdateId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OTAUpdateSummary]
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
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined,
        creationDate: js.UndefOr[DateType] = js.undefined,
        transferDate: js.UndefOr[DateType] = js.undefined,
        transferMessage: js.UndefOr[Message] = js.undefined,
        transferredTo: js.UndefOr[AwsAccountId] = js.undefined
    ): OutgoingCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateId" -> certificateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "transferDate" -> transferDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "transferMessage" -> transferMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "transferredTo" -> transferredTo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutgoingCertificate]
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
    def apply(
        policyArn: js.UndefOr[PolicyArn] = js.undefined,
        policyName: js.UndefOr[PolicyName] = js.undefined
    ): Policy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyArn" -> policyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyName" -> policyName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Policy]
    }
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
    def apply(
        createDate: js.UndefOr[DateType] = js.undefined,
        isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined,
        versionId: js.UndefOr[PolicyVersionId] = js.undefined
    ): PolicyVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createDate" -> createDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isDefaultVersion" -> isDefaultVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "versionId" -> versionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyVersion]
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
    def apply(
        policyName: js.UndefOr[PolicyName] = js.undefined,
        policyVersionId: js.UndefOr[PolicyVersionId] = js.undefined
    ): PolicyVersionIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyVersionId" -> policyVersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyVersionIdentifier]
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
    def apply(
        expiresInSec: js.UndefOr[ExpiresInSec] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): PresignedUrlConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "expiresInSec" -> expiresInSec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PresignedUrlConfig]
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
    def apply(
        tableName: TableName
    ): PutItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tableName" -> tableName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutItemInput]
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
    def apply(
        numberOfNotifiedThings: js.UndefOr[NumberOfThings] = js.undefined,
        numberOfSucceededThings: js.UndefOr[NumberOfThings] = js.undefined
    ): RateIncreaseCriteria = {
      val _fields = IndexedSeq[(String, js.Any)](
        "numberOfNotifiedThings" -> numberOfNotifiedThings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "numberOfSucceededThings" -> numberOfSucceededThings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RateIncreaseCriteria]
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
    def apply(
        caCertificate: CertificatePem,
        verificationCertificate: CertificatePem,
        allowAutoRegistration: js.UndefOr[AllowAutoRegistration] = js.undefined,
        registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined,
        setAsActive: js.UndefOr[SetAsActive] = js.undefined
    ): RegisterCACertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "caCertificate"           -> caCertificate.asInstanceOf[js.Any],
        "verificationCertificate" -> verificationCertificate.asInstanceOf[js.Any],
        "allowAutoRegistration" -> allowAutoRegistration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "registrationConfig" -> registrationConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "setAsActive" -> setAsActive.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterCACertificateRequest]
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
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined
    ): RegisterCACertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateId" -> certificateId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterCACertificateResponse]
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
    def apply(
        certificatePem: CertificatePem,
        caCertificatePem: js.UndefOr[CertificatePem] = js.undefined,
        setAsActive: js.UndefOr[SetAsActiveFlag] = js.undefined,
        status: js.UndefOr[CertificateStatus] = js.undefined
    ): RegisterCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificatePem" -> certificatePem.asInstanceOf[js.Any],
        "caCertificatePem" -> caCertificatePem.map { x =>
          x.asInstanceOf[js.Any]
        },
        "setAsActive" -> setAsActive.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterCertificateRequest]
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
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificateId: js.UndefOr[CertificateId] = js.undefined
    ): RegisterCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateId" -> certificateId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterCertificateResponse]
    }
  }

  @js.native
  trait RegisterThingRequest extends js.Object {
    var templateBody: TemplateBody
    var parameters: js.UndefOr[Parameters]
  }

  object RegisterThingRequest {
    def apply(
        templateBody: TemplateBody,
        parameters: js.UndefOr[Parameters] = js.undefined
    ): RegisterThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "templateBody" -> templateBody.asInstanceOf[js.Any],
        "parameters" -> parameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        resourceArns: js.UndefOr[ResourceArns] = js.undefined
    ): RegisterThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificatePem" -> certificatePem.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceArns" -> resourceArns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterThingResponse]
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
    def apply(
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        templateBody: js.UndefOr[TemplateBody] = js.undefined
    ): RegistrationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "templateBody" -> templateBody.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegistrationConfig]
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
    def apply(
        certificateId: CertificateId,
        rejectReason: js.UndefOr[Message] = js.undefined
    ): RejectCertificateTransferRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.asInstanceOf[js.Any],
        "rejectReason" -> rejectReason.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectCertificateTransferRequest]
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
    def apply(
        additionalInfo: js.UndefOr[StringMap] = js.undefined,
        resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): RelatedResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "additionalInfo" -> additionalInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceIdentifier" -> resourceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelatedResource]
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
    def apply(
        billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
        billingGroupName: js.UndefOr[BillingGroupName] = js.undefined,
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): RemoveThingFromBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupArn" -> billingGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "billingGroupName" -> billingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingArn" -> thingArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveThingFromBillingGroupRequest]
    }
  }

  @js.native
  trait RemoveThingFromBillingGroupResponse extends js.Object {}

  object RemoveThingFromBillingGroupResponse {
    def apply(
        ): RemoveThingFromBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveThingFromBillingGroupResponse]
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
    def apply(
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): RemoveThingFromThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingArn" -> thingArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupArn" -> thingGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupName" -> thingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveThingFromThingGroupRequest]
    }
  }

  @js.native
  trait RemoveThingFromThingGroupResponse extends js.Object {}

  object RemoveThingFromThingGroupResponse {
    def apply(
        ): RemoveThingFromThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveThingFromThingGroupResponse]
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
    def apply(
        ruleName: RuleName,
        topicRulePayload: TopicRulePayload
    ): ReplaceTopicRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ruleName"         -> ruleName.asInstanceOf[js.Any],
        "topicRulePayload" -> topicRulePayload.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceTopicRuleRequest]
    }
  }

  object ReportTypeEnum {
    val ERRORS  = "ERRORS"
    val RESULTS = "RESULTS"

    val values = IndexedSeq(ERRORS, RESULTS)
  }

  /**
    * Describes an action to republish to another topic.
    */
  @js.native
  trait RepublishAction extends js.Object {
    var roleArn: AwsArn
    var topic: TopicPattern
  }

  object RepublishAction {
    def apply(
        roleArn: AwsArn,
        topic: TopicPattern
    ): RepublishAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "topic"   -> topic.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RepublishAction]
    }
  }

  /**
    * Information identifying the non-compliant resource.
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
    def apply(
        account: js.UndefOr[AwsAccountId] = js.undefined,
        caCertificateId: js.UndefOr[CertificateId] = js.undefined,
        clientId: js.UndefOr[ClientId] = js.undefined,
        cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined,
        deviceCertificateId: js.UndefOr[CertificateId] = js.undefined,
        policyVersionIdentifier: js.UndefOr[PolicyVersionIdentifier] = js.undefined
    ): ResourceIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "account" -> account.map { x =>
          x.asInstanceOf[js.Any]
        },
        "caCertificateId" -> caCertificateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "clientId" -> clientId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "cognitoIdentityPoolId" -> cognitoIdentityPoolId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deviceCertificateId" -> deviceCertificateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyVersionIdentifier" -> policyVersionIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceIdentifier]
    }
  }

  object ResourceTypeEnum {
    val DEVICE_CERTIFICATE    = "DEVICE_CERTIFICATE"
    val CA_CERTIFICATE        = "CA_CERTIFICATE"
    val IOT_POLICY            = "IOT_POLICY"
    val COGNITO_IDENTITY_POOL = "COGNITO_IDENTITY_POOL"
    val CLIENT_ID             = "CLIENT_ID"
    val ACCOUNT_SETTINGS      = "ACCOUNT_SETTINGS"

    val values =
      IndexedSeq(DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY, COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS)
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
    def apply(
        creationDate: js.UndefOr[DateType] = js.undefined,
        credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined,
        lastModifiedDate: js.UndefOr[DateType] = js.undefined,
        owner: js.UndefOr[AwsAccountId] = js.undefined,
        roleAlias: js.UndefOr[RoleAlias] = js.undefined,
        roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): RoleAliasDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "credentialDurationSeconds" -> credentialDurationSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastModifiedDate" -> lastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "owner" -> owner.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleAlias" -> roleAlias.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleAliasArn" -> roleAliasArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoleAliasDescription]
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
    def apply(
        bucketName: BucketName,
        key: Key,
        roleArn: AwsArn,
        cannedAcl: js.UndefOr[CannedAccessControlList] = js.undefined
    ): S3Action = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "key"        -> key.asInstanceOf[js.Any],
        "roleArn"    -> roleArn.asInstanceOf[js.Any],
        "cannedAcl" -> cannedAcl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Action]
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
    def apply(
        bucket: js.UndefOr[S3Bucket] = js.undefined,
        prefix: js.UndefOr[Prefix] = js.undefined
    ): S3Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bucket" -> bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "prefix" -> prefix.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Destination]
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
    def apply(
        bucket: js.UndefOr[S3Bucket] = js.undefined,
        key: js.UndefOr[S3Key] = js.undefined,
        version: js.UndefOr[S3Version] = js.undefined
    ): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bucket" -> bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "key" -> key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
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
    def apply(
        token: SalesforceToken,
        url: SalesforceEndpoint
    ): SalesforceAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "token" -> token.asInstanceOf[js.Any],
        "url"   -> url.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SalesforceAction]
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
    def apply(
        dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
        frequency: js.UndefOr[AuditFrequency] = js.undefined,
        scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined,
        scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined
    ): ScheduledAuditMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dayOfMonth" -> dayOfMonth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "dayOfWeek" -> dayOfWeek.map { x =>
          x.asInstanceOf[js.Any]
        },
        "frequency" -> frequency.map { x =>
          x.asInstanceOf[js.Any]
        },
        "scheduledAuditArn" -> scheduledAuditArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "scheduledAuditName" -> scheduledAuditName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledAuditMetadata]
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
    def apply(
        queryString: QueryString,
        indexName: js.UndefOr[IndexName] = js.undefined,
        maxResults: js.UndefOr[QueryMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined
    ): SearchIndexRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "queryString" -> queryString.asInstanceOf[js.Any],
        "indexName" -> indexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "queryVersion" -> queryVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchIndexRequest]
    }
  }

  @js.native
  trait SearchIndexResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var thingGroups: js.UndefOr[ThingGroupDocumentList]
    var things: js.UndefOr[ThingDocumentList]
  }

  object SearchIndexResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingGroups: js.UndefOr[ThingGroupDocumentList] = js.undefined,
        things: js.UndefOr[ThingDocumentList] = js.undefined
    ): SearchIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroups" -> thingGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "things" -> things.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchIndexResponse]
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
    def apply(
        arn: SecurityProfileArn,
        name: SecurityProfileName
    ): SecurityProfileIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn"  -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityProfileIdentifier]
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
    def apply(
        arn: SecurityProfileTargetArn
    ): SecurityProfileTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityProfileTarget]
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
    def apply(
        securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier] = js.undefined,
        target: js.UndefOr[SecurityProfileTarget] = js.undefined
    ): SecurityProfileTargetMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileIdentifier" -> securityProfileIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "target" -> target.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityProfileTargetMapping]
    }
  }

  @js.native
  trait SetDefaultAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
  }

  object SetDefaultAuthorizerRequest {
    def apply(
        authorizerName: AuthorizerName
    ): SetDefaultAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDefaultAuthorizerRequest]
    }
  }

  @js.native
  trait SetDefaultAuthorizerResponse extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  object SetDefaultAuthorizerResponse {
    def apply(
        authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined,
        authorizerName: js.UndefOr[AuthorizerName] = js.undefined
    ): SetDefaultAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerArn" -> authorizerArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "authorizerName" -> authorizerName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDefaultAuthorizerResponse]
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
    def apply(
        policyName: PolicyName,
        policyVersionId: PolicyVersionId
    ): SetDefaultPolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName"      -> policyName.asInstanceOf[js.Any],
        "policyVersionId" -> policyVersionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetDefaultPolicyVersionRequest]
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
    def apply(
        loggingOptionsPayload: LoggingOptionsPayload
    ): SetLoggingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loggingOptionsPayload" -> loggingOptionsPayload.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoggingOptionsRequest]
    }
  }

  @js.native
  trait SetV2LoggingLevelRequest extends js.Object {
    var logLevel: LogLevel
    var logTarget: LogTarget
  }

  object SetV2LoggingLevelRequest {
    def apply(
        logLevel: LogLevel,
        logTarget: LogTarget
    ): SetV2LoggingLevelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logLevel"  -> logLevel.asInstanceOf[js.Any],
        "logTarget" -> logTarget.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetV2LoggingLevelRequest]
    }
  }

  @js.native
  trait SetV2LoggingOptionsRequest extends js.Object {
    var defaultLogLevel: js.UndefOr[LogLevel]
    var disableAllLogs: js.UndefOr[DisableAllLogs]
    var roleArn: js.UndefOr[AwsArn]
  }

  object SetV2LoggingOptionsRequest {
    def apply(
        defaultLogLevel: js.UndefOr[LogLevel] = js.undefined,
        disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined,
        roleArn: js.UndefOr[AwsArn] = js.undefined
    ): SetV2LoggingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "defaultLogLevel" -> defaultLogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "disableAllLogs" -> disableAllLogs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetV2LoggingOptionsRequest]
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
    def apply(
        certificateArn: js.UndefOr[CertificateArn] = js.undefined,
        certificatePathOnDevice: js.UndefOr[CertificatePathOnDevice] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined
    ): SigningProfileParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateArn" -> certificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificatePathOnDevice" -> certificatePathOnDevice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "platform" -> platform.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SigningProfileParameter]
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
    def apply(
        roleArn: AwsArn,
        targetArn: AwsArn,
        messageFormat: js.UndefOr[MessageFormat] = js.undefined
    ): SnsAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn"   -> roleArn.asInstanceOf[js.Any],
        "targetArn" -> targetArn.asInstanceOf[js.Any],
        "messageFormat" -> messageFormat.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnsAction]
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
    def apply(
        queueUrl: QueueUrl,
        roleArn: AwsArn,
        useBase64: js.UndefOr[UseBase64] = js.undefined
    ): SqsAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "queueUrl" -> queueUrl.asInstanceOf[js.Any],
        "roleArn"  -> roleArn.asInstanceOf[js.Any],
        "useBase64" -> useBase64.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqsAction]
    }
  }

  @js.native
  trait StartOnDemandAuditTaskRequest extends js.Object {
    var targetCheckNames: TargetAuditCheckNames
  }

  object StartOnDemandAuditTaskRequest {
    def apply(
        targetCheckNames: TargetAuditCheckNames
    ): StartOnDemandAuditTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetCheckNames" -> targetCheckNames.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartOnDemandAuditTaskRequest]
    }
  }

  @js.native
  trait StartOnDemandAuditTaskResponse extends js.Object {
    var taskId: js.UndefOr[AuditTaskId]
  }

  object StartOnDemandAuditTaskResponse {
    def apply(
        taskId: js.UndefOr[AuditTaskId] = js.undefined
    ): StartOnDemandAuditTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartOnDemandAuditTaskResponse]
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
    def apply(
        destination: js.UndefOr[Destination] = js.undefined,
        signingProfileName: js.UndefOr[SigningProfileName] = js.undefined,
        signingProfileParameter: js.UndefOr[SigningProfileParameter] = js.undefined
    ): StartSigningJobParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destination" -> destination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingProfileName" -> signingProfileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signingProfileParameter" -> signingProfileParameter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSigningJobParameter]
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
    def apply(
        inputFileBucket: RegistryS3BucketName,
        inputFileKey: RegistryS3KeyName,
        roleArn: RoleArn,
        templateBody: TemplateBody
    ): StartThingRegistrationTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "inputFileBucket" -> inputFileBucket.asInstanceOf[js.Any],
        "inputFileKey"    -> inputFileKey.asInstanceOf[js.Any],
        "roleArn"         -> roleArn.asInstanceOf[js.Any],
        "templateBody"    -> templateBody.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartThingRegistrationTaskRequest]
    }
  }

  @js.native
  trait StartThingRegistrationTaskResponse extends js.Object {
    var taskId: js.UndefOr[TaskId]
  }

  object StartThingRegistrationTaskResponse {
    def apply(
        taskId: js.UndefOr[TaskId] = js.undefined
    ): StartThingRegistrationTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartThingRegistrationTaskResponse]
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
    def apply(
        statistic: js.UndefOr[EvaluationStatistic] = js.undefined
    ): StatisticalThreshold = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statistic" -> statistic.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StatisticalThreshold]
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
    def apply(
        count: js.UndefOr[Count] = js.undefined
    ): Statistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "count" -> count.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Statistics]
    }
  }

  object StatusEnum {
    val InProgress = "InProgress"
    val Completed  = "Completed"
    val Failed     = "Failed"
    val Cancelled  = "Cancelled"
    val Cancelling = "Cancelling"

    val values = IndexedSeq(InProgress, Completed, Failed, Cancelled, Cancelling)
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
    def apply(
        roleArn: AwsArn,
        stateMachineName: StateMachineName,
        executionNamePrefix: js.UndefOr[ExecutionNamePrefix] = js.undefined
    ): StepFunctionsAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleArn"          -> roleArn.asInstanceOf[js.Any],
        "stateMachineName" -> stateMachineName.asInstanceOf[js.Any],
        "executionNamePrefix" -> executionNamePrefix.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StepFunctionsAction]
    }
  }

  @js.native
  trait StopThingRegistrationTaskRequest extends js.Object {
    var taskId: TaskId
  }

  object StopThingRegistrationTaskRequest {
    def apply(
        taskId: TaskId
    ): StopThingRegistrationTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopThingRegistrationTaskRequest]
    }
  }

  @js.native
  trait StopThingRegistrationTaskResponse extends js.Object {}

  object StopThingRegistrationTaskResponse {
    def apply(
        ): StopThingRegistrationTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopThingRegistrationTaskResponse]
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
    def apply(
        fileId: js.UndefOr[FileId] = js.undefined,
        streamId: js.UndefOr[StreamId] = js.undefined
    ): Stream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fileId" -> fileId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamId" -> streamId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Stream]
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
    def apply(
        fileId: js.UndefOr[FileId] = js.undefined,
        s3Location: js.UndefOr[S3Location] = js.undefined
    ): StreamFile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fileId" -> fileId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "s3Location" -> s3Location.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamFile]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "files" -> files.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastUpdatedAt" -> lastUpdatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamArn" -> streamArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamId" -> streamId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamVersion" -> streamVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamInfo]
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
    def apply(
        description: js.UndefOr[StreamDescription] = js.undefined,
        streamArn: js.UndefOr[StreamArn] = js.undefined,
        streamId: js.UndefOr[StreamId] = js.undefined,
        streamVersion: js.UndefOr[StreamVersion] = js.undefined
    ): StreamSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamArn" -> streamArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamId" -> streamId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamVersion" -> streamVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamSummary]
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
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  object TagResourceRequest {
    def apply(
        resourceArn: ResourceArn,
        tags: TagList
    ): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  object TargetSelectionEnum {
    val CONTINUOUS = "CONTINUOUS"
    val SNAPSHOT   = "SNAPSHOT"

    val values = IndexedSeq(CONTINUOUS, SNAPSHOT)
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
    def apply(
        canceledChecks: js.UndefOr[CanceledChecksCount] = js.undefined,
        compliantChecks: js.UndefOr[CompliantChecksCount] = js.undefined,
        failedChecks: js.UndefOr[FailedChecksCount] = js.undefined,
        inProgressChecks: js.UndefOr[InProgressChecksCount] = js.undefined,
        nonCompliantChecks: js.UndefOr[NonCompliantChecksCount] = js.undefined,
        totalChecks: js.UndefOr[TotalChecksCount] = js.undefined,
        waitingForDataCollectionChecks: js.UndefOr[WaitingForDataCollectionChecksCount] = js.undefined
    ): TaskStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "canceledChecks" -> canceledChecks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "compliantChecks" -> compliantChecks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "failedChecks" -> failedChecks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "inProgressChecks" -> inProgressChecks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nonCompliantChecks" -> nonCompliantChecks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "totalChecks" -> totalChecks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "waitingForDataCollectionChecks" -> waitingForDataCollectionChecks.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskStatistics]
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
    def apply(
        authInfos: AuthInfos,
        clientId: js.UndefOr[ClientId] = js.undefined,
        cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined,
        policyNamesToAdd: js.UndefOr[PolicyNames] = js.undefined,
        policyNamesToSkip: js.UndefOr[PolicyNames] = js.undefined,
        principal: js.UndefOr[Principal] = js.undefined
    ): TestAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authInfos" -> authInfos.asInstanceOf[js.Any],
        "clientId" -> clientId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "cognitoIdentityPoolId" -> cognitoIdentityPoolId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyNamesToAdd" -> policyNamesToAdd.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyNamesToSkip" -> policyNamesToSkip.map { x =>
          x.asInstanceOf[js.Any]
        },
        "principal" -> principal.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestAuthorizationRequest]
    }
  }

  @js.native
  trait TestAuthorizationResponse extends js.Object {
    var authResults: js.UndefOr[AuthResults]
  }

  object TestAuthorizationResponse {
    def apply(
        authResults: js.UndefOr[AuthResults] = js.undefined
    ): TestAuthorizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authResults" -> authResults.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestAuthorizationResponse]
    }
  }

  @js.native
  trait TestInvokeAuthorizerRequest extends js.Object {
    var authorizerName: AuthorizerName
    var token: Token
    var tokenSignature: TokenSignature
  }

  object TestInvokeAuthorizerRequest {
    def apply(
        authorizerName: AuthorizerName,
        token: Token,
        tokenSignature: TokenSignature
    ): TestInvokeAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.asInstanceOf[js.Any],
        "token"          -> token.asInstanceOf[js.Any],
        "tokenSignature" -> tokenSignature.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestInvokeAuthorizerRequest]
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
    def apply(
        disconnectAfterInSeconds: js.UndefOr[Seconds] = js.undefined,
        isAuthenticated: js.UndefOr[IsAuthenticated] = js.undefined,
        policyDocuments: js.UndefOr[PolicyDocuments] = js.undefined,
        principalId: js.UndefOr[PrincipalId] = js.undefined,
        refreshAfterInSeconds: js.UndefOr[Seconds] = js.undefined
    ): TestInvokeAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "disconnectAfterInSeconds" -> disconnectAfterInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isAuthenticated" -> isAuthenticated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "policyDocuments" -> policyDocuments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "principalId" -> principalId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "refreshAfterInSeconds" -> refreshAfterInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestInvokeAuthorizerResponse]
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
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined,
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): ThingAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingArn" -> thingArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeName" -> thingTypeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingAttribute]
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
    def apply(
        connected: js.UndefOr[Boolean] = js.undefined,
        timestamp: js.UndefOr[ConnectivityTimestamp] = js.undefined
    ): ThingConnectivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connected" -> connected.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timestamp" -> timestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingConnectivity]
    }
  }

  object ThingConnectivityIndexingModeEnum {
    val OFF    = "OFF"
    val STATUS = "STATUS"

    val values = IndexedSeq(OFF, STATUS)
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
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined,
        connectivity: js.UndefOr[ThingConnectivity] = js.undefined,
        shadow: js.UndefOr[JsonDocument] = js.undefined,
        thingGroupNames: js.UndefOr[ThingGroupNameList] = js.undefined,
        thingId: js.UndefOr[ThingId] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    ): ThingDocument = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "connectivity" -> connectivity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "shadow" -> shadow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupNames" -> thingGroupNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingId" -> thingId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeName" -> thingTypeName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingDocument]
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
    def apply(
        attributes: js.UndefOr[Attributes] = js.undefined,
        parentGroupNames: js.UndefOr[ThingGroupNameList] = js.undefined,
        thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.undefined,
        thingGroupId: js.UndefOr[ThingGroupId] = js.undefined,
        thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
    ): ThingGroupDocument = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parentGroupNames" -> parentGroupNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupDescription" -> thingGroupDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupId" -> thingGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupName" -> thingGroupName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingGroupDocument]
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
    def apply(
        thingGroupIndexingMode: ThingGroupIndexingMode
    ): ThingGroupIndexingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupIndexingMode" -> thingGroupIndexingMode.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingGroupIndexingConfiguration]
    }
  }

  object ThingGroupIndexingModeEnum {
    val OFF = "OFF"
    val ON  = "ON"

    val values = IndexedSeq(OFF, ON)
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
    def apply(
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        parentGroupName: js.UndefOr[ThingGroupName] = js.undefined,
        rootToParentThingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
    ): ThingGroupMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parentGroupName" -> parentGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rootToParentThingGroups" -> rootToParentThingGroups.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingGroupMetadata]
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
    def apply(
        attributePayload: js.UndefOr[AttributePayload] = js.undefined,
        thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.undefined
    ): ThingGroupProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributePayload" -> attributePayload.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupDescription" -> thingGroupDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingGroupProperties]
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
    def apply(
        thingIndexingMode: ThingIndexingMode,
        thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode] = js.undefined
    ): ThingIndexingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingIndexingMode" -> thingIndexingMode.asInstanceOf[js.Any],
        "thingConnectivityIndexingMode" -> thingConnectivityIndexingMode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingIndexingConfiguration]
    }
  }

  object ThingIndexingModeEnum {
    val OFF                 = "OFF"
    val REGISTRY            = "REGISTRY"
    val REGISTRY_AND_SHADOW = "REGISTRY_AND_SHADOW"

    val values = IndexedSeq(OFF, REGISTRY, REGISTRY_AND_SHADOW)
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
    def apply(
        thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined,
        thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined,
        thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
    ): ThingTypeDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingTypeArn" -> thingTypeArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeMetadata" -> thingTypeMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeName" -> thingTypeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeProperties" -> thingTypeProperties.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingTypeDefinition]
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
    def apply(
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        deprecated: js.UndefOr[Boolean] = js.undefined,
        deprecationDate: js.UndefOr[DeprecationDate] = js.undefined
    ): ThingTypeMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deprecated" -> deprecated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deprecationDate" -> deprecationDate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingTypeMetadata]
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
    def apply(
        searchableAttributes: js.UndefOr[SearchableAttributes] = js.undefined,
        thingTypeDescription: js.UndefOr[ThingTypeDescription] = js.undefined
    ): ThingTypeProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "searchableAttributes" -> searchableAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeDescription" -> thingTypeDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThingTypeProperties]
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
    def apply(
        inProgressTimeoutInMinutes: js.UndefOr[InProgressTimeoutInMinutes] = js.undefined
    ): TimeoutConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "inProgressTimeoutInMinutes" -> inProgressTimeoutInMinutes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeoutConfig]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "actions" -> actions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "awsIotSqlVersion" -> awsIotSqlVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorAction" -> errorAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ruleDisabled" -> ruleDisabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ruleName" -> ruleName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sql" -> sql.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TopicRule]
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
    def apply(
        createdAt: js.UndefOr[CreatedAtDate] = js.undefined,
        ruleArn: js.UndefOr[RuleArn] = js.undefined,
        ruleDisabled: js.UndefOr[IsDisabled] = js.undefined,
        ruleName: js.UndefOr[RuleName] = js.undefined,
        topicPattern: js.UndefOr[TopicPattern] = js.undefined
    ): TopicRuleListItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ruleArn" -> ruleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ruleDisabled" -> ruleDisabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ruleName" -> ruleName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "topicPattern" -> topicPattern.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TopicRuleListItem]
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
    def apply(
        actions: ActionList,
        sql: SQL,
        awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        errorAction: js.UndefOr[Action] = js.undefined,
        ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
    ): TopicRulePayload = {
      val _fields = IndexedSeq[(String, js.Any)](
        "actions" -> actions.asInstanceOf[js.Any],
        "sql"     -> sql.asInstanceOf[js.Any],
        "awsIotSqlVersion" -> awsIotSqlVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorAction" -> errorAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ruleDisabled" -> ruleDisabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TopicRulePayload]
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
    def apply(
        certificateId: CertificateId,
        targetAwsAccount: AwsAccountId,
        transferMessage: js.UndefOr[Message] = js.undefined
    ): TransferCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId"    -> certificateId.asInstanceOf[js.Any],
        "targetAwsAccount" -> targetAwsAccount.asInstanceOf[js.Any],
        "transferMessage" -> transferMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransferCertificateRequest]
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
    def apply(
        transferredCertificateArn: js.UndefOr[CertificateArn] = js.undefined
    ): TransferCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "transferredCertificateArn" -> transferredCertificateArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransferCertificateResponse]
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
    def apply(
        acceptDate: js.UndefOr[DateType] = js.undefined,
        rejectDate: js.UndefOr[DateType] = js.undefined,
        rejectReason: js.UndefOr[Message] = js.undefined,
        transferDate: js.UndefOr[DateType] = js.undefined,
        transferMessage: js.UndefOr[Message] = js.undefined
    ): TransferData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "acceptDate" -> acceptDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rejectDate" -> rejectDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rejectReason" -> rejectReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "transferDate" -> transferDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "transferMessage" -> transferMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransferData]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateAccountAuditConfigurationRequest extends js.Object {
    var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations]
    var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations]
    var roleArn: js.UndefOr[RoleArn]
  }

  object UpdateAccountAuditConfigurationRequest {
    def apply(
        auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.undefined,
        auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateAccountAuditConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "auditCheckConfigurations" -> auditCheckConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "auditNotificationTargetConfigurations" -> auditNotificationTargetConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountAuditConfigurationRequest]
    }
  }

  @js.native
  trait UpdateAccountAuditConfigurationResponse extends js.Object {}

  object UpdateAccountAuditConfigurationResponse {
    def apply(
        ): UpdateAccountAuditConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountAuditConfigurationResponse]
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
    def apply(
        authorizerName: AuthorizerName,
        authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.undefined,
        status: js.UndefOr[AuthorizerStatus] = js.undefined,
        tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined,
        tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined
    ): UpdateAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerName" -> authorizerName.asInstanceOf[js.Any],
        "authorizerFunctionArn" -> authorizerFunctionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tokenKeyName" -> tokenKeyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tokenSigningPublicKeys" -> tokenSigningPublicKeys.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAuthorizerRequest]
    }
  }

  @js.native
  trait UpdateAuthorizerResponse extends js.Object {
    var authorizerArn: js.UndefOr[AuthorizerArn]
    var authorizerName: js.UndefOr[AuthorizerName]
  }

  object UpdateAuthorizerResponse {
    def apply(
        authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined,
        authorizerName: js.UndefOr[AuthorizerName] = js.undefined
    ): UpdateAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizerArn" -> authorizerArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "authorizerName" -> authorizerName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAuthorizerResponse]
    }
  }

  @js.native
  trait UpdateBillingGroupRequest extends js.Object {
    var billingGroupName: BillingGroupName
    var billingGroupProperties: BillingGroupProperties
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object UpdateBillingGroupRequest {
    def apply(
        billingGroupName: BillingGroupName,
        billingGroupProperties: BillingGroupProperties,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): UpdateBillingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingGroupName"       -> billingGroupName.asInstanceOf[js.Any],
        "billingGroupProperties" -> billingGroupProperties.asInstanceOf[js.Any],
        "expectedVersion" -> expectedVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBillingGroupRequest]
    }
  }

  @js.native
  trait UpdateBillingGroupResponse extends js.Object {
    var version: js.UndefOr[Version]
  }

  object UpdateBillingGroupResponse {
    def apply(
        version: js.UndefOr[Version] = js.undefined
    ): UpdateBillingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBillingGroupResponse]
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
    def apply(
        certificateId: CertificateId,
        newAutoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.undefined,
        newStatus: js.UndefOr[CACertificateStatus] = js.undefined,
        registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined,
        removeAutoRegistration: js.UndefOr[RemoveAutoRegistration] = js.undefined
    ): UpdateCACertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.asInstanceOf[js.Any],
        "newAutoRegistrationStatus" -> newAutoRegistrationStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "newStatus" -> newStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "registrationConfig" -> registrationConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "removeAutoRegistration" -> removeAutoRegistration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCACertificateRequest]
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
    def apply(
        certificateId: CertificateId,
        newStatus: CertificateStatus
    ): UpdateCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateId" -> certificateId.asInstanceOf[js.Any],
        "newStatus"     -> newStatus.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCertificateRequest]
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
    def apply(
        thingGroupName: ThingGroupName,
        thingGroupProperties: ThingGroupProperties,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined,
        indexName: js.UndefOr[IndexName] = js.undefined,
        queryString: js.UndefOr[QueryString] = js.undefined,
        queryVersion: js.UndefOr[QueryVersion] = js.undefined
    ): UpdateDynamicThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName"       -> thingGroupName.asInstanceOf[js.Any],
        "thingGroupProperties" -> thingGroupProperties.asInstanceOf[js.Any],
        "expectedVersion" -> expectedVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "indexName" -> indexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "queryString" -> queryString.map { x =>
          x.asInstanceOf[js.Any]
        },
        "queryVersion" -> queryVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDynamicThingGroupRequest]
    }
  }

  @js.native
  trait UpdateDynamicThingGroupResponse extends js.Object {
    var version: js.UndefOr[Version]
  }

  object UpdateDynamicThingGroupResponse {
    def apply(
        version: js.UndefOr[Version] = js.undefined
    ): UpdateDynamicThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDynamicThingGroupResponse]
    }
  }

  @js.native
  trait UpdateEventConfigurationsRequest extends js.Object {
    var eventConfigurations: js.UndefOr[EventConfigurations]
  }

  object UpdateEventConfigurationsRequest {
    def apply(
        eventConfigurations: js.UndefOr[EventConfigurations] = js.undefined
    ): UpdateEventConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventConfigurations" -> eventConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEventConfigurationsRequest]
    }
  }

  @js.native
  trait UpdateEventConfigurationsResponse extends js.Object {}

  object UpdateEventConfigurationsResponse {
    def apply(
        ): UpdateEventConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEventConfigurationsResponse]
    }
  }

  @js.native
  trait UpdateIndexingConfigurationRequest extends js.Object {
    var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration]
    var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration]
  }

  object UpdateIndexingConfigurationRequest {
    def apply(
        thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.undefined,
        thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.undefined
    ): UpdateIndexingConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupIndexingConfiguration" -> thingGroupIndexingConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingIndexingConfiguration" -> thingIndexingConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIndexingConfigurationRequest]
    }
  }

  @js.native
  trait UpdateIndexingConfigurationResponse extends js.Object {}

  object UpdateIndexingConfigurationResponse {
    def apply(
        ): UpdateIndexingConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIndexingConfigurationResponse]
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
    def apply(
        jobId: JobId,
        abortConfig: js.UndefOr[AbortConfig] = js.undefined,
        description: js.UndefOr[JobDescription] = js.undefined,
        jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined,
        presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined,
        timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
    ): UpdateJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.asInstanceOf[js.Any],
        "abortConfig" -> abortConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobExecutionsRolloutConfig" -> jobExecutionsRolloutConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "presignedUrlConfig" -> presignedUrlConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeoutConfig" -> timeoutConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobRequest]
    }
  }

  @js.native
  trait UpdateRoleAliasRequest extends js.Object {
    var roleAlias: RoleAlias
    var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds]
    var roleArn: js.UndefOr[RoleArn]
  }

  object UpdateRoleAliasRequest {
    def apply(
        roleAlias: RoleAlias,
        credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateRoleAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAlias" -> roleAlias.asInstanceOf[js.Any],
        "credentialDurationSeconds" -> credentialDurationSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
    ): UpdateRoleAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "roleAlias" -> roleAlias.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleAliasArn" -> roleAliasArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRoleAliasResponse]
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
    def apply(
        scheduledAuditName: ScheduledAuditName,
        dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
        frequency: js.UndefOr[AuditFrequency] = js.undefined,
        targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined
    ): UpdateScheduledAuditRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditName" -> scheduledAuditName.asInstanceOf[js.Any],
        "dayOfMonth" -> dayOfMonth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "dayOfWeek" -> dayOfWeek.map { x =>
          x.asInstanceOf[js.Any]
        },
        "frequency" -> frequency.map { x =>
          x.asInstanceOf[js.Any]
        },
        "targetCheckNames" -> targetCheckNames.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateScheduledAuditRequest]
    }
  }

  @js.native
  trait UpdateScheduledAuditResponse extends js.Object {
    var scheduledAuditArn: js.UndefOr[ScheduledAuditArn]
  }

  object UpdateScheduledAuditResponse {
    def apply(
        scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined
    ): UpdateScheduledAuditResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledAuditArn" -> scheduledAuditArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateScheduledAuditResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "securityProfileName" -> securityProfileName.asInstanceOf[js.Any],
        "additionalMetricsToRetain" -> additionalMetricsToRetain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "alertTargets" -> alertTargets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "behaviors" -> behaviors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deleteAdditionalMetricsToRetain" -> deleteAdditionalMetricsToRetain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deleteAlertTargets" -> deleteAlertTargets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "deleteBehaviors" -> deleteBehaviors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "expectedVersion" -> expectedVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileDescription" -> securityProfileDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecurityProfileRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "additionalMetricsToRetain" -> additionalMetricsToRetain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "alertTargets" -> alertTargets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "behaviors" -> behaviors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "creationDate" -> creationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastModifiedDate" -> lastModifiedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileArn" -> securityProfileArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileDescription" -> securityProfileDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileName" -> securityProfileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSecurityProfileResponse]
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
    def apply(
        streamId: StreamId,
        description: js.UndefOr[StreamDescription] = js.undefined,
        files: js.UndefOr[StreamFiles] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "streamId" -> streamId.asInstanceOf[js.Any],
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "files" -> files.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStreamRequest]
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
    def apply(
        description: js.UndefOr[StreamDescription] = js.undefined,
        streamArn: js.UndefOr[StreamArn] = js.undefined,
        streamId: js.UndefOr[StreamId] = js.undefined,
        streamVersion: js.UndefOr[StreamVersion] = js.undefined
    ): UpdateStreamResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamArn" -> streamArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamId" -> streamId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "streamVersion" -> streamVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStreamResponse]
    }
  }

  @js.native
  trait UpdateThingGroupRequest extends js.Object {
    var thingGroupName: ThingGroupName
    var thingGroupProperties: ThingGroupProperties
    var expectedVersion: js.UndefOr[OptionalVersion]
  }

  object UpdateThingGroupRequest {
    def apply(
        thingGroupName: ThingGroupName,
        thingGroupProperties: ThingGroupProperties,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
    ): UpdateThingGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingGroupName"       -> thingGroupName.asInstanceOf[js.Any],
        "thingGroupProperties" -> thingGroupProperties.asInstanceOf[js.Any],
        "expectedVersion" -> expectedVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThingGroupRequest]
    }
  }

  @js.native
  trait UpdateThingGroupResponse extends js.Object {
    var version: js.UndefOr[Version]
  }

  object UpdateThingGroupResponse {
    def apply(
        version: js.UndefOr[Version] = js.undefined
    ): UpdateThingGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThingGroupResponse]
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
    def apply(
        overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined,
        thingGroupsToAdd: js.UndefOr[ThingGroupList] = js.undefined,
        thingGroupsToRemove: js.UndefOr[ThingGroupList] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): UpdateThingGroupsForThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "overrideDynamicGroups" -> overrideDynamicGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupsToAdd" -> thingGroupsToAdd.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingGroupsToRemove" -> thingGroupsToRemove.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThingGroupsForThingRequest]
    }
  }

  @js.native
  trait UpdateThingGroupsForThingResponse extends js.Object {}

  object UpdateThingGroupsForThingResponse {
    def apply(
        ): UpdateThingGroupsForThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThingGroupsForThingResponse]
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
    def apply(
        thingName: ThingName,
        attributePayload: js.UndefOr[AttributePayload] = js.undefined,
        expectedVersion: js.UndefOr[OptionalVersion] = js.undefined,
        removeThingType: js.UndefOr[RemoveThingType] = js.undefined,
        thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
    ): UpdateThingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.asInstanceOf[js.Any],
        "attributePayload" -> attributePayload.map { x =>
          x.asInstanceOf[js.Any]
        },
        "expectedVersion" -> expectedVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "removeThingType" -> removeThingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingTypeName" -> thingTypeName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThingRequest]
    }
  }

  /**
    * The output from the UpdateThing operation.
    */
  @js.native
  trait UpdateThingResponse extends js.Object {}

  object UpdateThingResponse {
    def apply(
        ): UpdateThingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThingResponse]
    }
  }

  @js.native
  trait ValidateSecurityProfileBehaviorsRequest extends js.Object {
    var behaviors: Behaviors
  }

  object ValidateSecurityProfileBehaviorsRequest {
    def apply(
        behaviors: Behaviors
    ): ValidateSecurityProfileBehaviorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "behaviors" -> behaviors.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        validationErrors: js.UndefOr[ValidationErrors] = js.undefined
    ): ValidateSecurityProfileBehaviorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "valid" -> valid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "validationErrors" -> validationErrors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateSecurityProfileBehaviorsResponse]
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
    def apply(
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): ValidationError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "errorMessage" -> errorMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidationError]
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
    var thingName: js.UndefOr[ThingName]
    var violationEventTime: js.UndefOr[Timestamp]
    var violationEventType: js.UndefOr[ViolationEventType]
    var violationId: js.UndefOr[ViolationId]
  }

  object ViolationEvent {
    def apply(
        behavior: js.UndefOr[Behavior] = js.undefined,
        metricValue: js.UndefOr[MetricValue] = js.undefined,
        securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined,
        violationEventTime: js.UndefOr[Timestamp] = js.undefined,
        violationEventType: js.UndefOr[ViolationEventType] = js.undefined,
        violationId: js.UndefOr[ViolationId] = js.undefined
    ): ViolationEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "behavior" -> behavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "metricValue" -> metricValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityProfileName" -> securityProfileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thingName" -> thingName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "violationEventTime" -> violationEventTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "violationEventType" -> violationEventType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "violationId" -> violationId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ViolationEvent]
    }
  }

  object ViolationEventTypeEnum {
    val `in-alarm`          = "in-alarm"
    val `alarm-cleared`     = "alarm-cleared"
    val `alarm-invalidated` = "alarm-invalidated"

    val values = IndexedSeq(`in-alarm`, `alarm-cleared`, `alarm-invalidated`)
  }
}
