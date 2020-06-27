package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object codepipeline {
  type AWSRegionName                          = String
  type AccessKeyId                            = String
  type AccountId                              = String
  type ActionConfigurationKey                 = String
  type ActionConfigurationMap                 = js.Dictionary[ActionConfigurationValue]
  type ActionConfigurationPropertyList        = js.Array[ActionConfigurationProperty]
  type ActionConfigurationQueryableValue      = String
  type ActionConfigurationValue               = String
  type ActionExecutionDetailList              = js.Array[ActionExecutionDetail]
  type ActionExecutionId                      = String
  type ActionExecutionToken                   = String
  type ActionName                             = String
  type ActionNamespace                        = String
  type ActionProvider                         = String
  type ActionRunOrder                         = Int
  type ActionStateList                        = js.Array[ActionState]
  type ActionTypeList                         = js.Array[ActionType]
  type ApprovalSummary                        = String
  type ApprovalToken                          = String
  type ArtifactDetailList                     = js.Array[ArtifactDetail]
  type ArtifactList                           = js.Array[Artifact]
  type ArtifactName                           = String
  type ArtifactRevisionList                   = js.Array[ArtifactRevision]
  type ArtifactStoreLocation                  = String
  type ArtifactStoreMap                       = js.Dictionary[ArtifactStore]
  type BlockerName                            = String
  type ClientId                               = String
  type ClientRequestToken                     = String
  type ClientToken                            = String
  type Code                                   = String
  type ContinuationToken                      = String
  type Description                            = String
  type DisabledReason                         = String
  type Enabled                                = Boolean
  type EncryptionKeyId                        = String
  type ExecutionId                            = String
  type ExecutionSummary                       = String
  type ExternalExecutionId                    = String
  type ExternalExecutionSummary               = String
  type InputArtifactList                      = js.Array[InputArtifact]
  type JobId                                  = String
  type JobList                                = js.Array[Job]
  type JsonPath                               = String
  type LastChangedAt                          = js.Date
  type LastChangedBy                          = String
  type LastUpdatedBy                          = String
  type MatchEquals                            = String
  type MaxBatchSize                           = Int
  type MaxResults                             = Int
  type MaximumArtifactCount                   = Int
  type Message                                = String
  type MinimumArtifactCount                   = Int
  type NextToken                              = String
  type Nonce                                  = String
  type OutputArtifactList                     = js.Array[OutputArtifact]
  type OutputVariablesKey                     = String
  type OutputVariablesMap                     = js.Dictionary[OutputVariablesValue]
  type OutputVariablesValue                   = String
  type Percentage                             = Int
  type PipelineArn                            = String
  type PipelineExecutionId                    = String
  type PipelineExecutionSummaryList           = js.Array[PipelineExecutionSummary]
  type PipelineList                           = js.Array[PipelineSummary]
  type PipelineName                           = String
  type PipelineStageDeclarationList           = js.Array[StageDeclaration]
  type PipelineVersion                        = Int
  type QueryParamMap                          = js.Dictionary[ActionConfigurationQueryableValue]
  type ResolvedActionConfigurationMap         = js.Dictionary[String]
  type ResourceArn                            = String
  type Revision                               = String
  type RevisionChangeIdentifier               = String
  type RevisionSummary                        = String
  type RoleArn                                = String
  type S3Bucket                               = String
  type S3BucketName                           = String
  type S3Key                                  = String
  type S3ObjectKey                            = String
  type SecretAccessKey                        = String
  type SessionToken                           = String
  type SourceRevisionList                     = js.Array[SourceRevision]
  type StageActionDeclarationList             = js.Array[ActionDeclaration]
  type StageBlockerDeclarationList            = js.Array[BlockerDeclaration]
  type StageName                              = String
  type StageStateList                         = js.Array[StageState]
  type StopPipelineExecutionReason            = String
  type TagKey                                 = String
  type TagKeyList                             = js.Array[TagKey]
  type TagList                                = js.Array[Tag]
  type TagValue                               = String
  type ThirdPartyJobId                        = String
  type ThirdPartyJobList                      = js.Array[ThirdPartyJob]
  type Time                                   = js.Date
  type Timestamp                              = js.Date
  type TriggerDetail                          = String
  type Url                                    = String
  type UrlTemplate                            = String
  type Version                                = String
  type WebhookArn                             = String
  type WebhookAuthConfigurationAllowedIPRange = String
  type WebhookAuthConfigurationSecretToken    = String
  type WebhookErrorCode                       = String
  type WebhookErrorMessage                    = String
  type WebhookFilters                         = js.Array[WebhookFilterRule]
  type WebhookLastTriggered                   = js.Date
  type WebhookList                            = js.Array[ListWebhookItem]
  type WebhookName                            = String
  type WebhookUrl                             = String

  implicit final class CodePipelineOps(private val service: CodePipeline) extends AnyVal {

    @inline def acknowledgeJobFuture(params: AcknowledgeJobInput): Future[AcknowledgeJobOutput] =
      service.acknowledgeJob(params).promise().toFuture
    @inline def acknowledgeThirdPartyJobFuture(
        params: AcknowledgeThirdPartyJobInput
    ): Future[AcknowledgeThirdPartyJobOutput] = service.acknowledgeThirdPartyJob(params).promise().toFuture
    @inline def createCustomActionTypeFuture(
        params: CreateCustomActionTypeInput
    ): Future[CreateCustomActionTypeOutput] = service.createCustomActionType(params).promise().toFuture
    @inline def createPipelineFuture(params: CreatePipelineInput): Future[CreatePipelineOutput] =
      service.createPipeline(params).promise().toFuture
    @inline def deleteCustomActionTypeFuture(params: DeleteCustomActionTypeInput): Future[js.Object] =
      service.deleteCustomActionType(params).promise().toFuture
    @inline def deletePipelineFuture(params: DeletePipelineInput): Future[js.Object] =
      service.deletePipeline(params).promise().toFuture
    @inline def deleteWebhookFuture(params: DeleteWebhookInput): Future[DeleteWebhookOutput] =
      service.deleteWebhook(params).promise().toFuture
    @inline def deregisterWebhookWithThirdPartyFuture(
        params: DeregisterWebhookWithThirdPartyInput
    ): Future[DeregisterWebhookWithThirdPartyOutput] =
      service.deregisterWebhookWithThirdParty(params).promise().toFuture
    @inline def disableStageTransitionFuture(params: DisableStageTransitionInput): Future[js.Object] =
      service.disableStageTransition(params).promise().toFuture
    @inline def enableStageTransitionFuture(params: EnableStageTransitionInput): Future[js.Object] =
      service.enableStageTransition(params).promise().toFuture
    @inline def getJobDetailsFuture(params: GetJobDetailsInput): Future[GetJobDetailsOutput] =
      service.getJobDetails(params).promise().toFuture
    @inline def getPipelineExecutionFuture(params: GetPipelineExecutionInput): Future[GetPipelineExecutionOutput] =
      service.getPipelineExecution(params).promise().toFuture
    @inline def getPipelineFuture(params: GetPipelineInput): Future[GetPipelineOutput] =
      service.getPipeline(params).promise().toFuture
    @inline def getPipelineStateFuture(params: GetPipelineStateInput): Future[GetPipelineStateOutput] =
      service.getPipelineState(params).promise().toFuture
    @inline def getThirdPartyJobDetailsFuture(
        params: GetThirdPartyJobDetailsInput
    ): Future[GetThirdPartyJobDetailsOutput] = service.getThirdPartyJobDetails(params).promise().toFuture
    @inline def listActionExecutionsFuture(params: ListActionExecutionsInput): Future[ListActionExecutionsOutput] =
      service.listActionExecutions(params).promise().toFuture
    @inline def listActionTypesFuture(params: ListActionTypesInput): Future[ListActionTypesOutput] =
      service.listActionTypes(params).promise().toFuture
    @inline def listPipelineExecutionsFuture(
        params: ListPipelineExecutionsInput
    ): Future[ListPipelineExecutionsOutput] = service.listPipelineExecutions(params).promise().toFuture
    @inline def listPipelinesFuture(params: ListPipelinesInput): Future[ListPipelinesOutput] =
      service.listPipelines(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listWebhooksFuture(params: ListWebhooksInput): Future[ListWebhooksOutput] =
      service.listWebhooks(params).promise().toFuture
    @inline def pollForJobsFuture(params: PollForJobsInput): Future[PollForJobsOutput] =
      service.pollForJobs(params).promise().toFuture
    @inline def pollForThirdPartyJobsFuture(params: PollForThirdPartyJobsInput): Future[PollForThirdPartyJobsOutput] =
      service.pollForThirdPartyJobs(params).promise().toFuture
    @inline def putActionRevisionFuture(params: PutActionRevisionInput): Future[PutActionRevisionOutput] =
      service.putActionRevision(params).promise().toFuture
    @inline def putApprovalResultFuture(params: PutApprovalResultInput): Future[PutApprovalResultOutput] =
      service.putApprovalResult(params).promise().toFuture
    @inline def putJobFailureResultFuture(params: PutJobFailureResultInput): Future[js.Object] =
      service.putJobFailureResult(params).promise().toFuture
    @inline def putJobSuccessResultFuture(params: PutJobSuccessResultInput): Future[js.Object] =
      service.putJobSuccessResult(params).promise().toFuture
    @inline def putThirdPartyJobFailureResultFuture(params: PutThirdPartyJobFailureResultInput): Future[js.Object] =
      service.putThirdPartyJobFailureResult(params).promise().toFuture
    @inline def putThirdPartyJobSuccessResultFuture(params: PutThirdPartyJobSuccessResultInput): Future[js.Object] =
      service.putThirdPartyJobSuccessResult(params).promise().toFuture
    @inline def putWebhookFuture(params: PutWebhookInput): Future[PutWebhookOutput] =
      service.putWebhook(params).promise().toFuture
    @inline def registerWebhookWithThirdPartyFuture(
        params: RegisterWebhookWithThirdPartyInput
    ): Future[RegisterWebhookWithThirdPartyOutput] = service.registerWebhookWithThirdParty(params).promise().toFuture
    @inline def retryStageExecutionFuture(params: RetryStageExecutionInput): Future[RetryStageExecutionOutput] =
      service.retryStageExecution(params).promise().toFuture
    @inline def startPipelineExecutionFuture(
        params: StartPipelineExecutionInput
    ): Future[StartPipelineExecutionOutput] = service.startPipelineExecution(params).promise().toFuture
    @inline def stopPipelineExecutionFuture(params: StopPipelineExecutionInput): Future[StopPipelineExecutionOutput] =
      service.stopPipelineExecution(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise().toFuture
    @inline def updatePipelineFuture(params: UpdatePipelineInput): Future[UpdatePipelineOutput] =
      service.updatePipeline(params).promise().toFuture
  }
}

package codepipeline {
  @js.native
  @JSImport("aws-sdk", "CodePipeline")
  class CodePipeline() extends js.Object {
    def this(config: AWSConfig) = this()

    def acknowledgeJob(params: AcknowledgeJobInput): Request[AcknowledgeJobOutput] = js.native
    def acknowledgeThirdPartyJob(params: AcknowledgeThirdPartyJobInput): Request[AcknowledgeThirdPartyJobOutput] =
      js.native
    def createCustomActionType(params: CreateCustomActionTypeInput): Request[CreateCustomActionTypeOutput] = js.native
    def createPipeline(params: CreatePipelineInput): Request[CreatePipelineOutput]                         = js.native
    def deleteCustomActionType(params: DeleteCustomActionTypeInput): Request[js.Object]                    = js.native
    def deletePipeline(params: DeletePipelineInput): Request[js.Object]                                    = js.native
    def deleteWebhook(params: DeleteWebhookInput): Request[DeleteWebhookOutput]                            = js.native
    def deregisterWebhookWithThirdParty(
        params: DeregisterWebhookWithThirdPartyInput
    ): Request[DeregisterWebhookWithThirdPartyOutput]                                                = js.native
    def disableStageTransition(params: DisableStageTransitionInput): Request[js.Object]              = js.native
    def enableStageTransition(params: EnableStageTransitionInput): Request[js.Object]                = js.native
    def getJobDetails(params: GetJobDetailsInput): Request[GetJobDetailsOutput]                      = js.native
    def getPipeline(params: GetPipelineInput): Request[GetPipelineOutput]                            = js.native
    def getPipelineExecution(params: GetPipelineExecutionInput): Request[GetPipelineExecutionOutput] = js.native
    def getPipelineState(params: GetPipelineStateInput): Request[GetPipelineStateOutput]             = js.native
    def getThirdPartyJobDetails(params: GetThirdPartyJobDetailsInput): Request[GetThirdPartyJobDetailsOutput] =
      js.native
    def listActionExecutions(params: ListActionExecutionsInput): Request[ListActionExecutionsOutput]       = js.native
    def listActionTypes(params: ListActionTypesInput): Request[ListActionTypesOutput]                      = js.native
    def listPipelineExecutions(params: ListPipelineExecutionsInput): Request[ListPipelineExecutionsOutput] = js.native
    def listPipelines(params: ListPipelinesInput): Request[ListPipelinesOutput]                            = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput]          = js.native
    def listWebhooks(params: ListWebhooksInput): Request[ListWebhooksOutput]                               = js.native
    def pollForJobs(params: PollForJobsInput): Request[PollForJobsOutput]                                  = js.native
    def pollForThirdPartyJobs(params: PollForThirdPartyJobsInput): Request[PollForThirdPartyJobsOutput]    = js.native
    def putActionRevision(params: PutActionRevisionInput): Request[PutActionRevisionOutput]                = js.native
    def putApprovalResult(params: PutApprovalResultInput): Request[PutApprovalResultOutput]                = js.native
    def putJobFailureResult(params: PutJobFailureResultInput): Request[js.Object]                          = js.native
    def putJobSuccessResult(params: PutJobSuccessResultInput): Request[js.Object]                          = js.native
    def putThirdPartyJobFailureResult(params: PutThirdPartyJobFailureResultInput): Request[js.Object]      = js.native
    def putThirdPartyJobSuccessResult(params: PutThirdPartyJobSuccessResultInput): Request[js.Object]      = js.native
    def putWebhook(params: PutWebhookInput): Request[PutWebhookOutput]                                     = js.native
    def registerWebhookWithThirdParty(
        params: RegisterWebhookWithThirdPartyInput
    ): Request[RegisterWebhookWithThirdPartyOutput]                                                        = js.native
    def retryStageExecution(params: RetryStageExecutionInput): Request[RetryStageExecutionOutput]          = js.native
    def startPipelineExecution(params: StartPipelineExecutionInput): Request[StartPipelineExecutionOutput] = js.native
    def stopPipelineExecution(params: StopPipelineExecutionInput): Request[StopPipelineExecutionOutput]    = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput]                                  = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput]                            = js.native
    def updatePipeline(params: UpdatePipelineInput): Request[UpdatePipelineOutput]                         = js.native
  }

  /**
    * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS Secure Token Service (STS). They can be used to access input and output artifacts in the S3 bucket used to store artifact for the pipeline in AWS CodePipeline.
    */
  @js.native
  @Factory
  trait AWSSessionCredentials extends js.Object {
    var accessKeyId: AccessKeyId
    var secretAccessKey: SecretAccessKey
    var sessionToken: SessionToken
  }

  /**
    * Represents the input of an AcknowledgeJob action.
    */
  @js.native
  @Factory
  trait AcknowledgeJobInput extends js.Object {
    var jobId: JobId
    var nonce: Nonce
  }

  /**
    * Represents the output of an AcknowledgeJob action.
    */
  @js.native
  @Factory
  trait AcknowledgeJobOutput extends js.Object {
    var status: js.UndefOr[JobStatus]
  }

  /**
    * Represents the input of an AcknowledgeThirdPartyJob action.
    */
  @js.native
  @Factory
  trait AcknowledgeThirdPartyJobInput extends js.Object {
    var clientToken: ClientToken
    var jobId: ThirdPartyJobId
    var nonce: Nonce
  }

  /**
    * Represents the output of an AcknowledgeThirdPartyJob action.
    */
  @js.native
  @Factory
  trait AcknowledgeThirdPartyJobOutput extends js.Object {
    var status: js.UndefOr[JobStatus]
  }

  @js.native
  sealed trait ActionCategory extends js.Any
  object ActionCategory extends js.Object {
    val Source   = "Source".asInstanceOf[ActionCategory]
    val Build    = "Build".asInstanceOf[ActionCategory]
    val Deploy   = "Deploy".asInstanceOf[ActionCategory]
    val Test     = "Test".asInstanceOf[ActionCategory]
    val Invoke   = "Invoke".asInstanceOf[ActionCategory]
    val Approval = "Approval".asInstanceOf[ActionCategory]

    val values = js.Object.freeze(js.Array(Source, Build, Deploy, Test, Invoke, Approval))
  }

  /**
    * Represents information about an action configuration.
    */
  @js.native
  @Factory
  trait ActionConfiguration extends js.Object {
    var configuration: js.UndefOr[ActionConfigurationMap]
  }

  /**
    * Represents information about an action configuration property.
    */
  @js.native
  @Factory
  trait ActionConfigurationProperty extends js.Object {
    var key: Boolean
    var name: ActionConfigurationKey
    var required: Boolean
    var secret: Boolean
    var description: js.UndefOr[Description]
    var queryable: js.UndefOr[Boolean]
    var `type`: js.UndefOr[ActionConfigurationPropertyType]
  }

  @js.native
  sealed trait ActionConfigurationPropertyType extends js.Any
  object ActionConfigurationPropertyType extends js.Object {
    val String  = "String".asInstanceOf[ActionConfigurationPropertyType]
    val Number  = "Number".asInstanceOf[ActionConfigurationPropertyType]
    val Boolean = "Boolean".asInstanceOf[ActionConfigurationPropertyType]

    val values = js.Object.freeze(js.Array(String, Number, Boolean))
  }

  /**
    * Represents the context of an action in the stage of a pipeline to a job worker.
    */
  @js.native
  @Factory
  trait ActionContext extends js.Object {
    var actionExecutionId: js.UndefOr[ActionExecutionId]
    var name: js.UndefOr[ActionName]
  }

  /**
    * Represents information about an action declaration.
    */
  @js.native
  @Factory
  trait ActionDeclaration extends js.Object {
    var actionTypeId: ActionTypeId
    var name: ActionName
    var configuration: js.UndefOr[ActionConfigurationMap]
    var inputArtifacts: js.UndefOr[InputArtifactList]
    var namespace: js.UndefOr[ActionNamespace]
    var outputArtifacts: js.UndefOr[OutputArtifactList]
    var region: js.UndefOr[AWSRegionName]
    var roleArn: js.UndefOr[RoleArn]
    var runOrder: js.UndefOr[ActionRunOrder]
  }

  /**
    * Represents information about the run of an action.
    */
  @js.native
  @Factory
  trait ActionExecution extends js.Object {
    var errorDetails: js.UndefOr[ErrorDetails]
    var externalExecutionId: js.UndefOr[ExecutionId]
    var externalExecutionUrl: js.UndefOr[Url]
    var lastStatusChange: js.UndefOr[Timestamp]
    var lastUpdatedBy: js.UndefOr[LastUpdatedBy]
    var percentComplete: js.UndefOr[Percentage]
    var status: js.UndefOr[ActionExecutionStatus]
    var summary: js.UndefOr[ExecutionSummary]
    var token: js.UndefOr[ActionExecutionToken]
  }

  /**
    * Returns information about an execution of an action, including the action execution ID, and the name, version, and timing of the action.
    */
  @js.native
  @Factory
  trait ActionExecutionDetail extends js.Object {
    var actionExecutionId: js.UndefOr[ActionExecutionId]
    var actionName: js.UndefOr[ActionName]
    var input: js.UndefOr[ActionExecutionInput]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var output: js.UndefOr[ActionExecutionOutput]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
    var pipelineVersion: js.UndefOr[PipelineVersion]
    var stageName: js.UndefOr[StageName]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[ActionExecutionStatus]
  }

  /**
    * Filter values for the action execution.
    */
  @js.native
  @Factory
  trait ActionExecutionFilter extends js.Object {
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  /**
    * Input information used for an action execution.
    */
  @js.native
  @Factory
  trait ActionExecutionInput extends js.Object {
    var actionTypeId: js.UndefOr[ActionTypeId]
    var configuration: js.UndefOr[ActionConfigurationMap]
    var inputArtifacts: js.UndefOr[ArtifactDetailList]
    var namespace: js.UndefOr[ActionNamespace]
    var region: js.UndefOr[AWSRegionName]
    var resolvedConfiguration: js.UndefOr[ResolvedActionConfigurationMap]
    var roleArn: js.UndefOr[RoleArn]
  }

  /**
    * Output details listed for an action execution, such as the action execution result.
    */
  @js.native
  @Factory
  trait ActionExecutionOutput extends js.Object {
    var executionResult: js.UndefOr[ActionExecutionResult]
    var outputArtifacts: js.UndefOr[ArtifactDetailList]
    var outputVariables: js.UndefOr[OutputVariablesMap]
  }

  /**
    * Execution result information, such as the external execution ID.
    */
  @js.native
  @Factory
  trait ActionExecutionResult extends js.Object {
    var externalExecutionId: js.UndefOr[ExternalExecutionId]
    var externalExecutionSummary: js.UndefOr[ExternalExecutionSummary]
    var externalExecutionUrl: js.UndefOr[Url]
  }

  @js.native
  sealed trait ActionExecutionStatus extends js.Any
  object ActionExecutionStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[ActionExecutionStatus]
    val Abandoned  = "Abandoned".asInstanceOf[ActionExecutionStatus]
    val Succeeded  = "Succeeded".asInstanceOf[ActionExecutionStatus]
    val Failed     = "Failed".asInstanceOf[ActionExecutionStatus]

    val values = js.Object.freeze(js.Array(InProgress, Abandoned, Succeeded, Failed))
  }

  @js.native
  sealed trait ActionOwner extends js.Any
  object ActionOwner extends js.Object {
    val AWS        = "AWS".asInstanceOf[ActionOwner]
    val ThirdParty = "ThirdParty".asInstanceOf[ActionOwner]
    val Custom     = "Custom".asInstanceOf[ActionOwner]

    val values = js.Object.freeze(js.Array(AWS, ThirdParty, Custom))
  }

  /**
    * Represents information about the version (or revision) of an action.
    */
  @js.native
  @Factory
  trait ActionRevision extends js.Object {
    var created: Timestamp
    var revisionChangeId: RevisionChangeIdentifier
    var revisionId: Revision
  }

  /**
    * Represents information about the state of an action.
    */
  @js.native
  @Factory
  trait ActionState extends js.Object {
    var actionName: js.UndefOr[ActionName]
    var currentRevision: js.UndefOr[ActionRevision]
    var entityUrl: js.UndefOr[Url]
    var latestExecution: js.UndefOr[ActionExecution]
    var revisionUrl: js.UndefOr[Url]
  }

  /**
    * Returns information about the details of an action type.
    */
  @js.native
  @Factory
  trait ActionType extends js.Object {
    var id: ActionTypeId
    var inputArtifactDetails: ArtifactDetails
    var outputArtifactDetails: ArtifactDetails
    var actionConfigurationProperties: js.UndefOr[ActionConfigurationPropertyList]
    var settings: js.UndefOr[ActionTypeSettings]
  }

  /**
    * Represents information about an action type.
    */
  @js.native
  @Factory
  trait ActionTypeId extends js.Object {
    var category: ActionCategory
    var owner: ActionOwner
    var provider: ActionProvider
    var version: Version
  }

  /**
    * Returns information about the settings for an action type.
    */
  @js.native
  @Factory
  trait ActionTypeSettings extends js.Object {
    var entityUrlTemplate: js.UndefOr[UrlTemplate]
    var executionUrlTemplate: js.UndefOr[UrlTemplate]
    var revisionUrlTemplate: js.UndefOr[UrlTemplate]
    var thirdPartyConfigurationUrl: js.UndefOr[Url]
  }

  /**
    * Represents information about the result of an approval request.
    */
  @js.native
  @Factory
  trait ApprovalResult extends js.Object {
    var status: ApprovalStatus
    var summary: ApprovalSummary
  }

  @js.native
  sealed trait ApprovalStatus extends js.Any
  object ApprovalStatus extends js.Object {
    val Approved = "Approved".asInstanceOf[ApprovalStatus]
    val Rejected = "Rejected".asInstanceOf[ApprovalStatus]

    val values = js.Object.freeze(js.Array(Approved, Rejected))
  }

  /**
    * Represents information about an artifact that is worked on by actions in the pipeline.
    */
  @js.native
  @Factory
  trait Artifact extends js.Object {
    var location: js.UndefOr[ArtifactLocation]
    var name: js.UndefOr[ArtifactName]
    var revision: js.UndefOr[Revision]
  }

  /**
    * Artifact details for the action execution, such as the artifact location.
    */
  @js.native
  @Factory
  trait ArtifactDetail extends js.Object {
    var name: js.UndefOr[ArtifactName]
    var s3location: js.UndefOr[S3Location]
  }

  /**
    * Returns information about the details of an artifact.
    */
  @js.native
  @Factory
  trait ArtifactDetails extends js.Object {
    var maximumCount: MaximumArtifactCount
    var minimumCount: MinimumArtifactCount
  }

  /**
    * Represents information about the location of an artifact.
    */
  @js.native
  @Factory
  trait ArtifactLocation extends js.Object {
    var s3Location: js.UndefOr[S3ArtifactLocation]
    var `type`: js.UndefOr[ArtifactLocationType]
  }

  @js.native
  sealed trait ArtifactLocationType extends js.Any
  object ArtifactLocationType extends js.Object {
    val S3 = "S3".asInstanceOf[ArtifactLocationType]

    val values = js.Object.freeze(js.Array(S3))
  }

  /**
    * Represents revision details of an artifact.
    */
  @js.native
  @Factory
  trait ArtifactRevision extends js.Object {
    var created: js.UndefOr[Timestamp]
    var name: js.UndefOr[ArtifactName]
    var revisionChangeIdentifier: js.UndefOr[RevisionChangeIdentifier]
    var revisionId: js.UndefOr[Revision]
    var revisionSummary: js.UndefOr[RevisionSummary]
    var revisionUrl: js.UndefOr[Url]
  }

  /**
    * The S3 bucket where artifacts for the pipeline are stored.
    *
    * '''Note:'''You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use <code>artifactStores</code>.
    */
  @js.native
  @Factory
  trait ArtifactStore extends js.Object {
    var location: ArtifactStoreLocation
    var `type`: ArtifactStoreType
    var encryptionKey: js.UndefOr[EncryptionKey]
  }

  @js.native
  sealed trait ArtifactStoreType extends js.Any
  object ArtifactStoreType extends js.Object {
    val S3 = "S3".asInstanceOf[ArtifactStoreType]

    val values = js.Object.freeze(js.Array(S3))
  }

  /**
    * Reserved for future use.
    */
  @js.native
  @Factory
  trait BlockerDeclaration extends js.Object {
    var name: BlockerName
    var `type`: BlockerType
  }

  @js.native
  sealed trait BlockerType extends js.Any
  object BlockerType extends js.Object {
    val Schedule = "Schedule".asInstanceOf[BlockerType]

    val values = js.Object.freeze(js.Array(Schedule))
  }

  /**
    * Represents the input of a CreateCustomActionType operation.
    */
  @js.native
  @Factory
  trait CreateCustomActionTypeInput extends js.Object {
    var category: ActionCategory
    var inputArtifactDetails: ArtifactDetails
    var outputArtifactDetails: ArtifactDetails
    var provider: ActionProvider
    var version: Version
    var configurationProperties: js.UndefOr[ActionConfigurationPropertyList]
    var settings: js.UndefOr[ActionTypeSettings]
    var tags: js.UndefOr[TagList]
  }

  /**
    * Represents the output of a <code>CreateCustomActionType</code> operation.
    */
  @js.native
  @Factory
  trait CreateCustomActionTypeOutput extends js.Object {
    var actionType: ActionType
    var tags: js.UndefOr[TagList]
  }

  /**
    * Represents the input of a <code>CreatePipeline</code> action.
    */
  @js.native
  @Factory
  trait CreatePipelineInput extends js.Object {
    var pipeline: PipelineDeclaration
    var tags: js.UndefOr[TagList]
  }

  /**
    * Represents the output of a <code>CreatePipeline</code> action.
    */
  @js.native
  @Factory
  trait CreatePipelineOutput extends js.Object {
    var pipeline: js.UndefOr[PipelineDeclaration]
    var tags: js.UndefOr[TagList]
  }

  /**
    * Represents information about a current revision.
    */
  @js.native
  @Factory
  trait CurrentRevision extends js.Object {
    var changeIdentifier: RevisionChangeIdentifier
    var revision: Revision
    var created: js.UndefOr[Time]
    var revisionSummary: js.UndefOr[RevisionSummary]
  }

  /**
    * Represents the input of a <code>DeleteCustomActionType</code> operation. The custom action will be marked as deleted.
    */
  @js.native
  @Factory
  trait DeleteCustomActionTypeInput extends js.Object {
    var category: ActionCategory
    var provider: ActionProvider
    var version: Version
  }

  /**
    * Represents the input of a <code>DeletePipeline</code> action.
    */
  @js.native
  @Factory
  trait DeletePipelineInput extends js.Object {
    var name: PipelineName
  }

  @js.native
  @Factory
  trait DeleteWebhookInput extends js.Object {
    var name: WebhookName
  }

  @js.native
  @Factory
  trait DeleteWebhookOutput extends js.Object {}

  @js.native
  @Factory
  trait DeregisterWebhookWithThirdPartyInput extends js.Object {
    var webhookName: js.UndefOr[WebhookName]
  }

  @js.native
  @Factory
  trait DeregisterWebhookWithThirdPartyOutput extends js.Object {}

  /**
    * Represents the input of a <code>DisableStageTransition</code> action.
    */
  @js.native
  @Factory
  trait DisableStageTransitionInput extends js.Object {
    var pipelineName: PipelineName
    var reason: DisabledReason
    var stageName: StageName
    var transitionType: StageTransitionType
  }

  /**
    * Represents the input of an <code>EnableStageTransition</code> action.
    */
  @js.native
  @Factory
  trait EnableStageTransitionInput extends js.Object {
    var pipelineName: PipelineName
    var stageName: StageName
    var transitionType: StageTransitionType
  }

  /**
    * Represents information about the key used to encrypt data in the artifact store, such as an AWS Key Management Service (AWS KMS) key.
    */
  @js.native
  @Factory
  trait EncryptionKey extends js.Object {
    var id: EncryptionKeyId
    var `type`: EncryptionKeyType
  }

  @js.native
  sealed trait EncryptionKeyType extends js.Any
  object EncryptionKeyType extends js.Object {
    val KMS = "KMS".asInstanceOf[EncryptionKeyType]

    val values = js.Object.freeze(js.Array(KMS))
  }

  /**
    * Represents information about an error in AWS CodePipeline.
    */
  @js.native
  @Factory
  trait ErrorDetails extends js.Object {
    var code: js.UndefOr[Code]
    var message: js.UndefOr[Message]
  }

  /**
    * The details of the actions taken and results produced on an artifact as it passes through stages in the pipeline.
    */
  @js.native
  @Factory
  trait ExecutionDetails extends js.Object {
    var externalExecutionId: js.UndefOr[ExecutionId]
    var percentComplete: js.UndefOr[Percentage]
    var summary: js.UndefOr[ExecutionSummary]
  }

  /**
    * The interaction or event that started a pipeline execution.
    */
  @js.native
  @Factory
  trait ExecutionTrigger extends js.Object {
    var triggerDetail: js.UndefOr[TriggerDetail]
    var triggerType: js.UndefOr[TriggerType]
  }

  /**
    * Represents information about failure details.
    */
  @js.native
  @Factory
  trait FailureDetails extends js.Object {
    var message: Message
    var `type`: FailureType
    var externalExecutionId: js.UndefOr[ExecutionId]
  }

  @js.native
  sealed trait FailureType extends js.Any
  object FailureType extends js.Object {
    val JobFailed           = "JobFailed".asInstanceOf[FailureType]
    val ConfigurationError  = "ConfigurationError".asInstanceOf[FailureType]
    val PermissionError     = "PermissionError".asInstanceOf[FailureType]
    val RevisionOutOfSync   = "RevisionOutOfSync".asInstanceOf[FailureType]
    val RevisionUnavailable = "RevisionUnavailable".asInstanceOf[FailureType]
    val SystemUnavailable   = "SystemUnavailable".asInstanceOf[FailureType]

    val values = js.Object.freeze(
      js.Array(
        JobFailed,
        ConfigurationError,
        PermissionError,
        RevisionOutOfSync,
        RevisionUnavailable,
        SystemUnavailable
      )
    )
  }

  /**
    * Represents the input of a <code>GetJobDetails</code> action.
    */
  @js.native
  @Factory
  trait GetJobDetailsInput extends js.Object {
    var jobId: JobId
  }

  /**
    * Represents the output of a <code>GetJobDetails</code> action.
    */
  @js.native
  @Factory
  trait GetJobDetailsOutput extends js.Object {
    var jobDetails: js.UndefOr[JobDetails]
  }

  /**
    * Represents the input of a <code>GetPipelineExecution</code> action.
    */
  @js.native
  @Factory
  trait GetPipelineExecutionInput extends js.Object {
    var pipelineExecutionId: PipelineExecutionId
    var pipelineName: PipelineName
  }

  /**
    * Represents the output of a <code>GetPipelineExecution</code> action.
    */
  @js.native
  @Factory
  trait GetPipelineExecutionOutput extends js.Object {
    var pipelineExecution: js.UndefOr[PipelineExecution]
  }

  /**
    * Represents the input of a <code>GetPipeline</code> action.
    */
  @js.native
  @Factory
  trait GetPipelineInput extends js.Object {
    var name: PipelineName
    var version: js.UndefOr[PipelineVersion]
  }

  /**
    * Represents the output of a <code>GetPipeline</code> action.
    */
  @js.native
  @Factory
  trait GetPipelineOutput extends js.Object {
    var metadata: js.UndefOr[PipelineMetadata]
    var pipeline: js.UndefOr[PipelineDeclaration]
  }

  /**
    * Represents the input of a <code>GetPipelineState</code> action.
    */
  @js.native
  @Factory
  trait GetPipelineStateInput extends js.Object {
    var name: PipelineName
  }

  /**
    * Represents the output of a <code>GetPipelineState</code> action.
    */
  @js.native
  @Factory
  trait GetPipelineStateOutput extends js.Object {
    var created: js.UndefOr[Timestamp]
    var pipelineName: js.UndefOr[PipelineName]
    var pipelineVersion: js.UndefOr[PipelineVersion]
    var stageStates: js.UndefOr[StageStateList]
    var updated: js.UndefOr[Timestamp]
  }

  /**
    * Represents the input of a <code>GetThirdPartyJobDetails</code> action.
    */
  @js.native
  @Factory
  trait GetThirdPartyJobDetailsInput extends js.Object {
    var clientToken: ClientToken
    var jobId: ThirdPartyJobId
  }

  /**
    * Represents the output of a <code>GetThirdPartyJobDetails</code> action.
    */
  @js.native
  @Factory
  trait GetThirdPartyJobDetailsOutput extends js.Object {
    var jobDetails: js.UndefOr[ThirdPartyJobDetails]
  }

  /**
    * Represents information about an artifact to be worked on, such as a test or build artifact.
    */
  @js.native
  @Factory
  trait InputArtifact extends js.Object {
    var name: ArtifactName
  }

  /**
    * Represents information about a job.
    */
  @js.native
  @Factory
  trait Job extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var data: js.UndefOr[JobData]
    var id: js.UndefOr[JobId]
    var nonce: js.UndefOr[Nonce]
  }

  /**
    * Represents other information about a job required for a job worker to complete the job.
    */
  @js.native
  @Factory
  trait JobData extends js.Object {
    var actionConfiguration: js.UndefOr[ActionConfiguration]
    var actionTypeId: js.UndefOr[ActionTypeId]
    var artifactCredentials: js.UndefOr[AWSSessionCredentials]
    var continuationToken: js.UndefOr[ContinuationToken]
    var encryptionKey: js.UndefOr[EncryptionKey]
    var inputArtifacts: js.UndefOr[ArtifactList]
    var outputArtifacts: js.UndefOr[ArtifactList]
    var pipelineContext: js.UndefOr[PipelineContext]
  }

  /**
    * Represents information about the details of a job.
    */
  @js.native
  @Factory
  trait JobDetails extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var data: js.UndefOr[JobData]
    var id: js.UndefOr[JobId]
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus extends js.Object {
    val Created    = "Created".asInstanceOf[JobStatus]
    val Queued     = "Queued".asInstanceOf[JobStatus]
    val Dispatched = "Dispatched".asInstanceOf[JobStatus]
    val InProgress = "InProgress".asInstanceOf[JobStatus]
    val TimedOut   = "TimedOut".asInstanceOf[JobStatus]
    val Succeeded  = "Succeeded".asInstanceOf[JobStatus]
    val Failed     = "Failed".asInstanceOf[JobStatus]

    val values = js.Object.freeze(js.Array(Created, Queued, Dispatched, InProgress, TimedOut, Succeeded, Failed))
  }

  @js.native
  @Factory
  trait ListActionExecutionsInput extends js.Object {
    var pipelineName: PipelineName
    var filter: js.UndefOr[ActionExecutionFilter]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListActionExecutionsOutput extends js.Object {
    var actionExecutionDetails: js.UndefOr[ActionExecutionDetailList]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the input of a <code>ListActionTypes</code> action.
    */
  @js.native
  @Factory
  trait ListActionTypesInput extends js.Object {
    var actionOwnerFilter: js.UndefOr[ActionOwner]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <code>ListActionTypes</code> action.
    */
  @js.native
  @Factory
  trait ListActionTypesOutput extends js.Object {
    var actionTypes: ActionTypeList
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the input of a <code>ListPipelineExecutions</code> action.
    */
  @js.native
  @Factory
  trait ListPipelineExecutionsInput extends js.Object {
    var pipelineName: PipelineName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <code>ListPipelineExecutions</code> action.
    */
  @js.native
  @Factory
  trait ListPipelineExecutionsOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var pipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList]
  }

  /**
    * Represents the input of a <code>ListPipelines</code> action.
    */
  @js.native
  @Factory
  trait ListPipelinesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <code>ListPipelines</code> action.
    */
  @js.native
  @Factory
  trait ListPipelinesOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var pipelines: js.UndefOr[PipelineList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagList]
  }

  /**
    * The detail returned for each webhook after listing webhooks, such as the webhook URL, the webhook name, and the webhook ARN.
    */
  @js.native
  @Factory
  trait ListWebhookItem extends js.Object {
    var definition: WebhookDefinition
    var url: WebhookUrl
    var arn: js.UndefOr[WebhookArn]
    var errorCode: js.UndefOr[WebhookErrorCode]
    var errorMessage: js.UndefOr[WebhookErrorMessage]
    var lastTriggered: js.UndefOr[WebhookLastTriggered]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListWebhooksInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListWebhooksOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var webhooks: js.UndefOr[WebhookList]
  }

  /**
    * Represents information about the output of an action.
    */
  @js.native
  @Factory
  trait OutputArtifact extends js.Object {
    var name: ArtifactName
  }

  /**
    * Represents information about a pipeline to a job worker.
    *
    * '''Note:'''PipelineContext contains <code>pipelineArn</code> and <code>pipelineExecutionId</code> for custom action jobs. The <code>pipelineArn</code> and <code>pipelineExecutionId</code> fields are not populated for ThirdParty action jobs.
    */
  @js.native
  @Factory
  trait PipelineContext extends js.Object {
    var action: js.UndefOr[ActionContext]
    var pipelineArn: js.UndefOr[PipelineArn]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
    var pipelineName: js.UndefOr[PipelineName]
    var stage: js.UndefOr[StageContext]
  }

  /**
    * Represents the structure of actions and stages to be performed in the pipeline.
    */
  @js.native
  @Factory
  trait PipelineDeclaration extends js.Object {
    var name: PipelineName
    var roleArn: RoleArn
    var stages: PipelineStageDeclarationList
    var artifactStore: js.UndefOr[ArtifactStore]
    var artifactStores: js.UndefOr[ArtifactStoreMap]
    var version: js.UndefOr[PipelineVersion]
  }

  /**
    * Represents information about an execution of a pipeline.
    */
  @js.native
  @Factory
  trait PipelineExecution extends js.Object {
    var artifactRevisions: js.UndefOr[ArtifactRevisionList]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
    var pipelineName: js.UndefOr[PipelineName]
    var pipelineVersion: js.UndefOr[PipelineVersion]
    var status: js.UndefOr[PipelineExecutionStatus]
  }

  @js.native
  sealed trait PipelineExecutionStatus extends js.Any
  object PipelineExecutionStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[PipelineExecutionStatus]
    val Stopped    = "Stopped".asInstanceOf[PipelineExecutionStatus]
    val Stopping   = "Stopping".asInstanceOf[PipelineExecutionStatus]
    val Succeeded  = "Succeeded".asInstanceOf[PipelineExecutionStatus]
    val Superseded = "Superseded".asInstanceOf[PipelineExecutionStatus]
    val Failed     = "Failed".asInstanceOf[PipelineExecutionStatus]

    val values = js.Object.freeze(js.Array(InProgress, Stopped, Stopping, Succeeded, Superseded, Failed))
  }

  /**
    * Summary information about a pipeline execution.
    */
  @js.native
  @Factory
  trait PipelineExecutionSummary extends js.Object {
    var lastUpdateTime: js.UndefOr[Timestamp]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
    var sourceRevisions: js.UndefOr[SourceRevisionList]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[PipelineExecutionStatus]
    var stopTrigger: js.UndefOr[StopExecutionTrigger]
    var trigger: js.UndefOr[ExecutionTrigger]
  }

  /**
    * Information about a pipeline.
    */
  @js.native
  @Factory
  trait PipelineMetadata extends js.Object {
    var created: js.UndefOr[Timestamp]
    var pipelineArn: js.UndefOr[PipelineArn]
    var updated: js.UndefOr[Timestamp]
  }

  /**
    * Returns a summary of a pipeline.
    */
  @js.native
  @Factory
  trait PipelineSummary extends js.Object {
    var created: js.UndefOr[Timestamp]
    var name: js.UndefOr[PipelineName]
    var updated: js.UndefOr[Timestamp]
    var version: js.UndefOr[PipelineVersion]
  }

  /**
    * Represents the input of a <code>PollForJobs</code> action.
    */
  @js.native
  @Factory
  trait PollForJobsInput extends js.Object {
    var actionTypeId: ActionTypeId
    var maxBatchSize: js.UndefOr[MaxBatchSize]
    var queryParam: js.UndefOr[QueryParamMap]
  }

  /**
    * Represents the output of a <code>PollForJobs</code> action.
    */
  @js.native
  @Factory
  trait PollForJobsOutput extends js.Object {
    var jobs: js.UndefOr[JobList]
  }

  /**
    * Represents the input of a <code>PollForThirdPartyJobs</code> action.
    */
  @js.native
  @Factory
  trait PollForThirdPartyJobsInput extends js.Object {
    var actionTypeId: ActionTypeId
    var maxBatchSize: js.UndefOr[MaxBatchSize]
  }

  /**
    * Represents the output of a <code>PollForThirdPartyJobs</code> action.
    */
  @js.native
  @Factory
  trait PollForThirdPartyJobsOutput extends js.Object {
    var jobs: js.UndefOr[ThirdPartyJobList]
  }

  /**
    * Represents the input of a <code>PutActionRevision</code> action.
    */
  @js.native
  @Factory
  trait PutActionRevisionInput extends js.Object {
    var actionName: ActionName
    var actionRevision: ActionRevision
    var pipelineName: PipelineName
    var stageName: StageName
  }

  /**
    * Represents the output of a <code>PutActionRevision</code> action.
    */
  @js.native
  @Factory
  trait PutActionRevisionOutput extends js.Object {
    var newRevision: js.UndefOr[Boolean]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  /**
    * Represents the input of a <code>PutApprovalResult</code> action.
    */
  @js.native
  @Factory
  trait PutApprovalResultInput extends js.Object {
    var actionName: ActionName
    var pipelineName: PipelineName
    var result: ApprovalResult
    var stageName: StageName
    var token: ApprovalToken
  }

  /**
    * Represents the output of a <code>PutApprovalResult</code> action.
    */
  @js.native
  @Factory
  trait PutApprovalResultOutput extends js.Object {
    var approvedAt: js.UndefOr[Timestamp]
  }

  /**
    * Represents the input of a <code>PutJobFailureResult</code> action.
    */
  @js.native
  @Factory
  trait PutJobFailureResultInput extends js.Object {
    var failureDetails: FailureDetails
    var jobId: JobId
  }

  /**
    * Represents the input of a <code>PutJobSuccessResult</code> action.
    */
  @js.native
  @Factory
  trait PutJobSuccessResultInput extends js.Object {
    var jobId: JobId
    var continuationToken: js.UndefOr[ContinuationToken]
    var currentRevision: js.UndefOr[CurrentRevision]
    var executionDetails: js.UndefOr[ExecutionDetails]
    var outputVariables: js.UndefOr[OutputVariablesMap]
  }

  /**
    * Represents the input of a <code>PutThirdPartyJobFailureResult</code> action.
    */
  @js.native
  @Factory
  trait PutThirdPartyJobFailureResultInput extends js.Object {
    var clientToken: ClientToken
    var failureDetails: FailureDetails
    var jobId: ThirdPartyJobId
  }

  /**
    * Represents the input of a <code>PutThirdPartyJobSuccessResult</code> action.
    */
  @js.native
  @Factory
  trait PutThirdPartyJobSuccessResultInput extends js.Object {
    var clientToken: ClientToken
    var jobId: ThirdPartyJobId
    var continuationToken: js.UndefOr[ContinuationToken]
    var currentRevision: js.UndefOr[CurrentRevision]
    var executionDetails: js.UndefOr[ExecutionDetails]
  }

  @js.native
  @Factory
  trait PutWebhookInput extends js.Object {
    var webhook: WebhookDefinition
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait PutWebhookOutput extends js.Object {
    var webhook: js.UndefOr[ListWebhookItem]
  }

  @js.native
  @Factory
  trait RegisterWebhookWithThirdPartyInput extends js.Object {
    var webhookName: js.UndefOr[WebhookName]
  }

  @js.native
  @Factory
  trait RegisterWebhookWithThirdPartyOutput extends js.Object {}

  /**
    * Represents the input of a <code>RetryStageExecution</code> action.
    */
  @js.native
  @Factory
  trait RetryStageExecutionInput extends js.Object {
    var pipelineExecutionId: PipelineExecutionId
    var pipelineName: PipelineName
    var retryMode: StageRetryMode
    var stageName: StageName
  }

  /**
    * Represents the output of a <code>RetryStageExecution</code> action.
    */
  @js.native
  @Factory
  trait RetryStageExecutionOutput extends js.Object {
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  /**
    * The location of the S3 bucket that contains a revision.
    */
  @js.native
  @Factory
  trait S3ArtifactLocation extends js.Object {
    var bucketName: S3BucketName
    var objectKey: S3ObjectKey
  }

  /**
    * The Amazon S3 artifact location for an action's artifacts.
    */
  @js.native
  @Factory
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[S3Bucket]
    var key: js.UndefOr[S3Key]
  }

  /**
    * Information about the version (or revision) of a source artifact that initiated a pipeline execution.
    */
  @js.native
  @Factory
  trait SourceRevision extends js.Object {
    var actionName: ActionName
    var revisionId: js.UndefOr[Revision]
    var revisionSummary: js.UndefOr[RevisionSummary]
    var revisionUrl: js.UndefOr[Url]
  }

  /**
    * Represents information about a stage to a job worker.
    */
  @js.native
  @Factory
  trait StageContext extends js.Object {
    var name: js.UndefOr[StageName]
  }

  /**
    * Represents information about a stage and its definition.
    */
  @js.native
  @Factory
  trait StageDeclaration extends js.Object {
    var actions: StageActionDeclarationList
    var name: StageName
    var blockers: js.UndefOr[StageBlockerDeclarationList]
  }

  /**
    * Represents information about the run of a stage.
    */
  @js.native
  @Factory
  trait StageExecution extends js.Object {
    var pipelineExecutionId: PipelineExecutionId
    var status: StageExecutionStatus
  }

  @js.native
  sealed trait StageExecutionStatus extends js.Any
  object StageExecutionStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[StageExecutionStatus]
    val Failed     = "Failed".asInstanceOf[StageExecutionStatus]
    val Stopped    = "Stopped".asInstanceOf[StageExecutionStatus]
    val Stopping   = "Stopping".asInstanceOf[StageExecutionStatus]
    val Succeeded  = "Succeeded".asInstanceOf[StageExecutionStatus]

    val values = js.Object.freeze(js.Array(InProgress, Failed, Stopped, Stopping, Succeeded))
  }

  @js.native
  sealed trait StageRetryMode extends js.Any
  object StageRetryMode extends js.Object {
    val FAILED_ACTIONS = "FAILED_ACTIONS".asInstanceOf[StageRetryMode]

    val values = js.Object.freeze(js.Array(FAILED_ACTIONS))
  }

  /**
    * Represents information about the state of the stage.
    */
  @js.native
  @Factory
  trait StageState extends js.Object {
    var actionStates: js.UndefOr[ActionStateList]
    var inboundTransitionState: js.UndefOr[TransitionState]
    var latestExecution: js.UndefOr[StageExecution]
    var stageName: js.UndefOr[StageName]
  }

  @js.native
  sealed trait StageTransitionType extends js.Any
  object StageTransitionType extends js.Object {
    val Inbound  = "Inbound".asInstanceOf[StageTransitionType]
    val Outbound = "Outbound".asInstanceOf[StageTransitionType]

    val values = js.Object.freeze(js.Array(Inbound, Outbound))
  }

  /**
    * Represents the input of a <code>StartPipelineExecution</code> action.
    */
  @js.native
  @Factory
  trait StartPipelineExecutionInput extends js.Object {
    var name: PipelineName
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  /**
    * Represents the output of a <code>StartPipelineExecution</code> action.
    */
  @js.native
  @Factory
  trait StartPipelineExecutionOutput extends js.Object {
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  /**
    * The interaction that stopped a pipeline execution.
    */
  @js.native
  @Factory
  trait StopExecutionTrigger extends js.Object {
    var reason: js.UndefOr[StopPipelineExecutionReason]
  }

  @js.native
  @Factory
  trait StopPipelineExecutionInput extends js.Object {
    var pipelineExecutionId: PipelineExecutionId
    var pipelineName: PipelineName
    var abandon: js.UndefOr[Boolean]
    var reason: js.UndefOr[StopPipelineExecutionReason]
  }

  @js.native
  @Factory
  trait StopPipelineExecutionOutput extends js.Object {
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  /**
    * A tag is a key-value pair that is used to manage the resource.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceOutput extends js.Object {}

  /**
    * A response to a <code>PollForThirdPartyJobs</code> request returned by AWS CodePipeline when there is a job to be worked on by a partner action.
    */
  @js.native
  @Factory
  trait ThirdPartyJob extends js.Object {
    var clientId: js.UndefOr[ClientId]
    var jobId: js.UndefOr[JobId]
  }

  /**
    * Represents information about the job data for a partner action.
    */
  @js.native
  @Factory
  trait ThirdPartyJobData extends js.Object {
    var actionConfiguration: js.UndefOr[ActionConfiguration]
    var actionTypeId: js.UndefOr[ActionTypeId]
    var artifactCredentials: js.UndefOr[AWSSessionCredentials]
    var continuationToken: js.UndefOr[ContinuationToken]
    var encryptionKey: js.UndefOr[EncryptionKey]
    var inputArtifacts: js.UndefOr[ArtifactList]
    var outputArtifacts: js.UndefOr[ArtifactList]
    var pipelineContext: js.UndefOr[PipelineContext]
  }

  /**
    * The details of a job sent in response to a <code>GetThirdPartyJobDetails</code> request.
    */
  @js.native
  @Factory
  trait ThirdPartyJobDetails extends js.Object {
    var data: js.UndefOr[ThirdPartyJobData]
    var id: js.UndefOr[ThirdPartyJobId]
    var nonce: js.UndefOr[Nonce]
  }

  /**
    * Represents information about the state of transitions between one stage and another stage.
    */
  @js.native
  @Factory
  trait TransitionState extends js.Object {
    var disabledReason: js.UndefOr[DisabledReason]
    var enabled: js.UndefOr[Enabled]
    var lastChangedAt: js.UndefOr[LastChangedAt]
    var lastChangedBy: js.UndefOr[LastChangedBy]
  }

  @js.native
  sealed trait TriggerType extends js.Any
  object TriggerType extends js.Object {
    val CreatePipeline         = "CreatePipeline".asInstanceOf[TriggerType]
    val StartPipelineExecution = "StartPipelineExecution".asInstanceOf[TriggerType]
    val PollForSourceChanges   = "PollForSourceChanges".asInstanceOf[TriggerType]
    val Webhook                = "Webhook".asInstanceOf[TriggerType]
    val CloudWatchEvent        = "CloudWatchEvent".asInstanceOf[TriggerType]
    val PutActionRevision      = "PutActionRevision".asInstanceOf[TriggerType]

    val values = js.Object.freeze(
      js.Array(
        CreatePipeline,
        StartPipelineExecution,
        PollForSourceChanges,
        Webhook,
        CloudWatchEvent,
        PutActionRevision
      )
    )
  }

  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceOutput extends js.Object {}

  /**
    * Represents the input of an <code>UpdatePipeline</code> action.
    */
  @js.native
  @Factory
  trait UpdatePipelineInput extends js.Object {
    var pipeline: PipelineDeclaration
  }

  /**
    * Represents the output of an <code>UpdatePipeline</code> action.
    */
  @js.native
  @Factory
  trait UpdatePipelineOutput extends js.Object {
    var pipeline: js.UndefOr[PipelineDeclaration]
  }

  /**
    * The authentication applied to incoming webhook trigger requests.
    */
  @js.native
  @Factory
  trait WebhookAuthConfiguration extends js.Object {
    var AllowedIPRange: js.UndefOr[WebhookAuthConfigurationAllowedIPRange]
    var SecretToken: js.UndefOr[WebhookAuthConfigurationSecretToken]
  }

  @js.native
  sealed trait WebhookAuthenticationType extends js.Any
  object WebhookAuthenticationType extends js.Object {
    val GITHUB_HMAC     = "GITHUB_HMAC".asInstanceOf[WebhookAuthenticationType]
    val IP              = "IP".asInstanceOf[WebhookAuthenticationType]
    val UNAUTHENTICATED = "UNAUTHENTICATED".asInstanceOf[WebhookAuthenticationType]

    val values = js.Object.freeze(js.Array(GITHUB_HMAC, IP, UNAUTHENTICATED))
  }

  /**
    * Represents information about a webhook and its definition.
    */
  @js.native
  @Factory
  trait WebhookDefinition extends js.Object {
    var authentication: WebhookAuthenticationType
    var authenticationConfiguration: WebhookAuthConfiguration
    var filters: WebhookFilters
    var name: WebhookName
    var targetAction: ActionName
    var targetPipeline: PipelineName
  }

  /**
    * The event criteria that specify when a webhook notification is sent to your URL.
    */
  @js.native
  @Factory
  trait WebhookFilterRule extends js.Object {
    var jsonPath: JsonPath
    var matchEquals: js.UndefOr[MatchEquals]
  }
}
