package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object codepipeline {
  type AWSRegionName = String
  type AccessKeyId = String
  type AccountId = String
  type ActionConfigurationKey = String
  type ActionConfigurationMap = js.Dictionary[ActionConfigurationValue]
  type ActionConfigurationPropertyList = js.Array[ActionConfigurationProperty]
  type ActionConfigurationQueryableValue = String
  type ActionConfigurationValue = String
  type ActionExecutionDetailList = js.Array[ActionExecutionDetail]
  type ActionExecutionId = String
  type ActionExecutionToken = String
  type ActionName = String
  type ActionNamespace = String
  type ActionProvider = String
  type ActionRunOrder = Int
  type ActionStateList = js.Array[ActionState]
  type ActionTypeList = js.Array[ActionType]
  type ApprovalSummary = String
  type ApprovalToken = String
  type ArtifactDetailList = js.Array[ArtifactDetail]
  type ArtifactList = js.Array[Artifact]
  type ArtifactName = String
  type ArtifactRevisionList = js.Array[ArtifactRevision]
  type ArtifactStoreLocation = String
  type ArtifactStoreMap = js.Dictionary[ArtifactStore]
  type BlockerName = String
  type ClientId = String
  type ClientRequestToken = String
  type ClientToken = String
  type Code = String
  type ContinuationToken = String
  type Description = String
  type DisabledReason = String
  type Enabled = Boolean
  type EncryptionKeyId = String
  type ExecutionId = String
  type ExecutionSummary = String
  type ExternalExecutionId = String
  type ExternalExecutionSummary = String
  type InputArtifactList = js.Array[InputArtifact]
  type JobId = String
  type JobList = js.Array[Job]
  type JsonPath = String
  type LastChangedAt = js.Date
  type LastChangedBy = String
  type LastUpdatedBy = String
  type MatchEquals = String
  type MaxBatchSize = Int
  type MaxResults = Int
  type MaximumArtifactCount = Int
  type Message = String
  type MinimumArtifactCount = Int
  type NextToken = String
  type Nonce = String
  type OutputArtifactList = js.Array[OutputArtifact]
  type OutputVariablesKey = String
  type OutputVariablesMap = js.Dictionary[OutputVariablesValue]
  type OutputVariablesValue = String
  type Percentage = Int
  type PipelineArn = String
  type PipelineExecutionId = String
  type PipelineExecutionSummaryList = js.Array[PipelineExecutionSummary]
  type PipelineList = js.Array[PipelineSummary]
  type PipelineName = String
  type PipelineStageDeclarationList = js.Array[StageDeclaration]
  type PipelineVersion = Int
  type QueryParamMap = js.Dictionary[ActionConfigurationQueryableValue]
  type ResolvedActionConfigurationMap = js.Dictionary[String]
  type ResourceArn = String
  type Revision = String
  type RevisionChangeIdentifier = String
  type RevisionSummary = String
  type RoleArn = String
  type S3Bucket = String
  type S3BucketName = String
  type S3Key = String
  type S3ObjectKey = String
  type SecretAccessKey = String
  type SessionToken = String
  type SourceRevisionList = js.Array[SourceRevision]
  type StageActionDeclarationList = js.Array[ActionDeclaration]
  type StageBlockerDeclarationList = js.Array[BlockerDeclaration]
  type StageName = String
  type StageStateList = js.Array[StageState]
  type StopPipelineExecutionReason = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type ThirdPartyJobId = String
  type ThirdPartyJobList = js.Array[ThirdPartyJob]
  type Time = js.Date
  type Timestamp = js.Date
  type TriggerDetail = String
  type Url = String
  type UrlTemplate = String
  type Version = String
  type WebhookArn = String
  type WebhookAuthConfigurationAllowedIPRange = String
  type WebhookAuthConfigurationSecretToken = String
  type WebhookErrorCode = String
  type WebhookErrorMessage = String
  type WebhookFilters = js.Array[WebhookFilterRule]
  type WebhookLastTriggered = js.Date
  type WebhookList = js.Array[ListWebhookItem]
  type WebhookName = String
  type WebhookUrl = String

  implicit final class CodePipelineOps(private val service: CodePipeline) extends AnyVal {

    @inline def acknowledgeJobFuture(params: AcknowledgeJobInput): Future[AcknowledgeJobOutput] = service.acknowledgeJob(params).promise().toFuture
    @inline def acknowledgeThirdPartyJobFuture(params: AcknowledgeThirdPartyJobInput): Future[AcknowledgeThirdPartyJobOutput] = service.acknowledgeThirdPartyJob(params).promise().toFuture
    @inline def createCustomActionTypeFuture(params: CreateCustomActionTypeInput): Future[CreateCustomActionTypeOutput] = service.createCustomActionType(params).promise().toFuture
    @inline def createPipelineFuture(params: CreatePipelineInput): Future[CreatePipelineOutput] = service.createPipeline(params).promise().toFuture
    @inline def deleteCustomActionTypeFuture(params: DeleteCustomActionTypeInput): Future[js.Object] = service.deleteCustomActionType(params).promise().toFuture
    @inline def deletePipelineFuture(params: DeletePipelineInput): Future[js.Object] = service.deletePipeline(params).promise().toFuture
    @inline def deleteWebhookFuture(params: DeleteWebhookInput): Future[DeleteWebhookOutput] = service.deleteWebhook(params).promise().toFuture
    @inline def deregisterWebhookWithThirdPartyFuture(params: DeregisterWebhookWithThirdPartyInput): Future[DeregisterWebhookWithThirdPartyOutput] = service.deregisterWebhookWithThirdParty(params).promise().toFuture
    @inline def disableStageTransitionFuture(params: DisableStageTransitionInput): Future[js.Object] = service.disableStageTransition(params).promise().toFuture
    @inline def enableStageTransitionFuture(params: EnableStageTransitionInput): Future[js.Object] = service.enableStageTransition(params).promise().toFuture
    @inline def getJobDetailsFuture(params: GetJobDetailsInput): Future[GetJobDetailsOutput] = service.getJobDetails(params).promise().toFuture
    @inline def getPipelineExecutionFuture(params: GetPipelineExecutionInput): Future[GetPipelineExecutionOutput] = service.getPipelineExecution(params).promise().toFuture
    @inline def getPipelineFuture(params: GetPipelineInput): Future[GetPipelineOutput] = service.getPipeline(params).promise().toFuture
    @inline def getPipelineStateFuture(params: GetPipelineStateInput): Future[GetPipelineStateOutput] = service.getPipelineState(params).promise().toFuture
    @inline def getThirdPartyJobDetailsFuture(params: GetThirdPartyJobDetailsInput): Future[GetThirdPartyJobDetailsOutput] = service.getThirdPartyJobDetails(params).promise().toFuture
    @inline def listActionExecutionsFuture(params: ListActionExecutionsInput): Future[ListActionExecutionsOutput] = service.listActionExecutions(params).promise().toFuture
    @inline def listActionTypesFuture(params: ListActionTypesInput): Future[ListActionTypesOutput] = service.listActionTypes(params).promise().toFuture
    @inline def listPipelineExecutionsFuture(params: ListPipelineExecutionsInput): Future[ListPipelineExecutionsOutput] = service.listPipelineExecutions(params).promise().toFuture
    @inline def listPipelinesFuture(params: ListPipelinesInput): Future[ListPipelinesOutput] = service.listPipelines(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def listWebhooksFuture(params: ListWebhooksInput): Future[ListWebhooksOutput] = service.listWebhooks(params).promise().toFuture
    @inline def pollForJobsFuture(params: PollForJobsInput): Future[PollForJobsOutput] = service.pollForJobs(params).promise().toFuture
    @inline def pollForThirdPartyJobsFuture(params: PollForThirdPartyJobsInput): Future[PollForThirdPartyJobsOutput] = service.pollForThirdPartyJobs(params).promise().toFuture
    @inline def putActionRevisionFuture(params: PutActionRevisionInput): Future[PutActionRevisionOutput] = service.putActionRevision(params).promise().toFuture
    @inline def putApprovalResultFuture(params: PutApprovalResultInput): Future[PutApprovalResultOutput] = service.putApprovalResult(params).promise().toFuture
    @inline def putJobFailureResultFuture(params: PutJobFailureResultInput): Future[js.Object] = service.putJobFailureResult(params).promise().toFuture
    @inline def putJobSuccessResultFuture(params: PutJobSuccessResultInput): Future[js.Object] = service.putJobSuccessResult(params).promise().toFuture
    @inline def putThirdPartyJobFailureResultFuture(params: PutThirdPartyJobFailureResultInput): Future[js.Object] = service.putThirdPartyJobFailureResult(params).promise().toFuture
    @inline def putThirdPartyJobSuccessResultFuture(params: PutThirdPartyJobSuccessResultInput): Future[js.Object] = service.putThirdPartyJobSuccessResult(params).promise().toFuture
    @inline def putWebhookFuture(params: PutWebhookInput): Future[PutWebhookOutput] = service.putWebhook(params).promise().toFuture
    @inline def registerWebhookWithThirdPartyFuture(params: RegisterWebhookWithThirdPartyInput): Future[RegisterWebhookWithThirdPartyOutput] = service.registerWebhookWithThirdParty(params).promise().toFuture
    @inline def retryStageExecutionFuture(params: RetryStageExecutionInput): Future[RetryStageExecutionOutput] = service.retryStageExecution(params).promise().toFuture
    @inline def startPipelineExecutionFuture(params: StartPipelineExecutionInput): Future[StartPipelineExecutionOutput] = service.startPipelineExecution(params).promise().toFuture
    @inline def stopPipelineExecutionFuture(params: StopPipelineExecutionInput): Future[StopPipelineExecutionOutput] = service.stopPipelineExecution(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def updatePipelineFuture(params: UpdatePipelineInput): Future[UpdatePipelineOutput] = service.updatePipeline(params).promise().toFuture

  }
}

package codepipeline {
  @js.native
  @JSImport("aws-sdk/clients/codepipeline", JSImport.Namespace, "AWS.CodePipeline")
  class CodePipeline() extends js.Object {
    def this(config: AWSConfig) = this()

    def acknowledgeJob(params: AcknowledgeJobInput): Request[AcknowledgeJobOutput] = js.native
    def acknowledgeThirdPartyJob(params: AcknowledgeThirdPartyJobInput): Request[AcknowledgeThirdPartyJobOutput] = js.native
    def createCustomActionType(params: CreateCustomActionTypeInput): Request[CreateCustomActionTypeOutput] = js.native
    def createPipeline(params: CreatePipelineInput): Request[CreatePipelineOutput] = js.native
    def deleteCustomActionType(params: DeleteCustomActionTypeInput): Request[js.Object] = js.native
    def deletePipeline(params: DeletePipelineInput): Request[js.Object] = js.native
    def deleteWebhook(params: DeleteWebhookInput): Request[DeleteWebhookOutput] = js.native
    def deregisterWebhookWithThirdParty(params: DeregisterWebhookWithThirdPartyInput): Request[DeregisterWebhookWithThirdPartyOutput] = js.native
    def disableStageTransition(params: DisableStageTransitionInput): Request[js.Object] = js.native
    def enableStageTransition(params: EnableStageTransitionInput): Request[js.Object] = js.native
    def getJobDetails(params: GetJobDetailsInput): Request[GetJobDetailsOutput] = js.native
    def getPipeline(params: GetPipelineInput): Request[GetPipelineOutput] = js.native
    def getPipelineExecution(params: GetPipelineExecutionInput): Request[GetPipelineExecutionOutput] = js.native
    def getPipelineState(params: GetPipelineStateInput): Request[GetPipelineStateOutput] = js.native
    def getThirdPartyJobDetails(params: GetThirdPartyJobDetailsInput): Request[GetThirdPartyJobDetailsOutput] = js.native
    def listActionExecutions(params: ListActionExecutionsInput): Request[ListActionExecutionsOutput] = js.native
    def listActionTypes(params: ListActionTypesInput): Request[ListActionTypesOutput] = js.native
    def listPipelineExecutions(params: ListPipelineExecutionsInput): Request[ListPipelineExecutionsOutput] = js.native
    def listPipelines(params: ListPipelinesInput): Request[ListPipelinesOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def listWebhooks(params: ListWebhooksInput): Request[ListWebhooksOutput] = js.native
    def pollForJobs(params: PollForJobsInput): Request[PollForJobsOutput] = js.native
    def pollForThirdPartyJobs(params: PollForThirdPartyJobsInput): Request[PollForThirdPartyJobsOutput] = js.native
    def putActionRevision(params: PutActionRevisionInput): Request[PutActionRevisionOutput] = js.native
    def putApprovalResult(params: PutApprovalResultInput): Request[PutApprovalResultOutput] = js.native
    def putJobFailureResult(params: PutJobFailureResultInput): Request[js.Object] = js.native
    def putJobSuccessResult(params: PutJobSuccessResultInput): Request[js.Object] = js.native
    def putThirdPartyJobFailureResult(params: PutThirdPartyJobFailureResultInput): Request[js.Object] = js.native
    def putThirdPartyJobSuccessResult(params: PutThirdPartyJobSuccessResultInput): Request[js.Object] = js.native
    def putWebhook(params: PutWebhookInput): Request[PutWebhookOutput] = js.native
    def registerWebhookWithThirdParty(params: RegisterWebhookWithThirdPartyInput): Request[RegisterWebhookWithThirdPartyOutput] = js.native
    def retryStageExecution(params: RetryStageExecutionInput): Request[RetryStageExecutionOutput] = js.native
    def startPipelineExecution(params: StartPipelineExecutionInput): Request[StartPipelineExecutionOutput] = js.native
    def stopPipelineExecution(params: StopPipelineExecutionInput): Request[StopPipelineExecutionOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updatePipeline(params: UpdatePipelineInput): Request[UpdatePipelineOutput] = js.native
  }

  /** Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS Secure Token Service (STS). They can be used to access input and output artifacts in the S3 bucket used to store artifact for the pipeline in AWS CodePipeline.
    */
  @js.native
  trait AWSSessionCredentials extends js.Object {
    var accessKeyId: AccessKeyId
    var secretAccessKey: SecretAccessKey
    var sessionToken: SessionToken
  }

  object AWSSessionCredentials {
    @inline
    def apply(
        accessKeyId: AccessKeyId,
        secretAccessKey: SecretAccessKey,
        sessionToken: SessionToken
    ): AWSSessionCredentials = {
      val __obj = js.Dynamic.literal(
        "accessKeyId" -> accessKeyId.asInstanceOf[js.Any],
        "secretAccessKey" -> secretAccessKey.asInstanceOf[js.Any],
        "sessionToken" -> sessionToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AWSSessionCredentials]
    }
  }

  /** Represents the input of an AcknowledgeJob action.
    */
  @js.native
  trait AcknowledgeJobInput extends js.Object {
    var jobId: JobId
    var nonce: Nonce
  }

  object AcknowledgeJobInput {
    @inline
    def apply(
        jobId: JobId,
        nonce: Nonce
    ): AcknowledgeJobInput = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "nonce" -> nonce.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcknowledgeJobInput]
    }
  }

  /** Represents the output of an AcknowledgeJob action.
    */
  @js.native
  trait AcknowledgeJobOutput extends js.Object {
    var status: js.UndefOr[JobStatus]
  }

  object AcknowledgeJobOutput {
    @inline
    def apply(
        status: js.UndefOr[JobStatus] = js.undefined
    ): AcknowledgeJobOutput = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcknowledgeJobOutput]
    }
  }

  /** Represents the input of an AcknowledgeThirdPartyJob action.
    */
  @js.native
  trait AcknowledgeThirdPartyJobInput extends js.Object {
    var clientToken: ClientToken
    var jobId: ThirdPartyJobId
    var nonce: Nonce
  }

  object AcknowledgeThirdPartyJobInput {
    @inline
    def apply(
        clientToken: ClientToken,
        jobId: ThirdPartyJobId,
        nonce: Nonce
    ): AcknowledgeThirdPartyJobInput = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any],
        "nonce" -> nonce.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcknowledgeThirdPartyJobInput]
    }
  }

  /** Represents the output of an AcknowledgeThirdPartyJob action.
    */
  @js.native
  trait AcknowledgeThirdPartyJobOutput extends js.Object {
    var status: js.UndefOr[JobStatus]
  }

  object AcknowledgeThirdPartyJobOutput {
    @inline
    def apply(
        status: js.UndefOr[JobStatus] = js.undefined
    ): AcknowledgeThirdPartyJobOutput = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcknowledgeThirdPartyJobOutput]
    }
  }

  @js.native
  sealed trait ActionCategory extends js.Any
  object ActionCategory {
    val Source = "Source".asInstanceOf[ActionCategory]
    val Build = "Build".asInstanceOf[ActionCategory]
    val Deploy = "Deploy".asInstanceOf[ActionCategory]
    val Test = "Test".asInstanceOf[ActionCategory]
    val Invoke = "Invoke".asInstanceOf[ActionCategory]
    val Approval = "Approval".asInstanceOf[ActionCategory]

    @inline def values = js.Array(Source, Build, Deploy, Test, Invoke, Approval)
  }

  /** Represents information about an action configuration.
    */
  @js.native
  trait ActionConfiguration extends js.Object {
    var configuration: js.UndefOr[ActionConfigurationMap]
  }

  object ActionConfiguration {
    @inline
    def apply(
        configuration: js.UndefOr[ActionConfigurationMap] = js.undefined
    ): ActionConfiguration = {
      val __obj = js.Dynamic.literal()
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionConfiguration]
    }
  }

  /** Represents information about an action configuration property.
    */
  @js.native
  trait ActionConfigurationProperty extends js.Object {
    var key: Boolean
    var name: ActionConfigurationKey
    var required: Boolean
    var secret: Boolean
    var description: js.UndefOr[Description]
    var queryable: js.UndefOr[Boolean]
    var `type`: js.UndefOr[ActionConfigurationPropertyType]
  }

  object ActionConfigurationProperty {
    @inline
    def apply(
        key: Boolean,
        name: ActionConfigurationKey,
        required: Boolean,
        secret: Boolean,
        description: js.UndefOr[Description] = js.undefined,
        queryable: js.UndefOr[Boolean] = js.undefined,
        `type`: js.UndefOr[ActionConfigurationPropertyType] = js.undefined
    ): ActionConfigurationProperty = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "required" -> required.asInstanceOf[js.Any],
        "secret" -> secret.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      queryable.foreach(__v => __obj.updateDynamic("queryable")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionConfigurationProperty]
    }
  }

  @js.native
  sealed trait ActionConfigurationPropertyType extends js.Any
  object ActionConfigurationPropertyType {
    val String = "String".asInstanceOf[ActionConfigurationPropertyType]
    val Number = "Number".asInstanceOf[ActionConfigurationPropertyType]
    val Boolean = "Boolean".asInstanceOf[ActionConfigurationPropertyType]

    @inline def values = js.Array(String, Number, Boolean)
  }

  /** Represents the context of an action in the stage of a pipeline to a job worker.
    */
  @js.native
  trait ActionContext extends js.Object {
    var actionExecutionId: js.UndefOr[ActionExecutionId]
    var name: js.UndefOr[ActionName]
  }

  object ActionContext {
    @inline
    def apply(
        actionExecutionId: js.UndefOr[ActionExecutionId] = js.undefined,
        name: js.UndefOr[ActionName] = js.undefined
    ): ActionContext = {
      val __obj = js.Dynamic.literal()
      actionExecutionId.foreach(__v => __obj.updateDynamic("actionExecutionId")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionContext]
    }
  }

  /** Represents information about an action declaration.
    */
  @js.native
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

  object ActionDeclaration {
    @inline
    def apply(
        actionTypeId: ActionTypeId,
        name: ActionName,
        configuration: js.UndefOr[ActionConfigurationMap] = js.undefined,
        inputArtifacts: js.UndefOr[InputArtifactList] = js.undefined,
        namespace: js.UndefOr[ActionNamespace] = js.undefined,
        outputArtifacts: js.UndefOr[OutputArtifactList] = js.undefined,
        region: js.UndefOr[AWSRegionName] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        runOrder: js.UndefOr[ActionRunOrder] = js.undefined
    ): ActionDeclaration = {
      val __obj = js.Dynamic.literal(
        "actionTypeId" -> actionTypeId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      inputArtifacts.foreach(__v => __obj.updateDynamic("inputArtifacts")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      outputArtifacts.foreach(__v => __obj.updateDynamic("outputArtifacts")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      runOrder.foreach(__v => __obj.updateDynamic("runOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionDeclaration]
    }
  }

  /** Represents information about the run of an action.
    */
  @js.native
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

  object ActionExecution {
    @inline
    def apply(
        errorDetails: js.UndefOr[ErrorDetails] = js.undefined,
        externalExecutionId: js.UndefOr[ExecutionId] = js.undefined,
        externalExecutionUrl: js.UndefOr[Url] = js.undefined,
        lastStatusChange: js.UndefOr[Timestamp] = js.undefined,
        lastUpdatedBy: js.UndefOr[LastUpdatedBy] = js.undefined,
        percentComplete: js.UndefOr[Percentage] = js.undefined,
        status: js.UndefOr[ActionExecutionStatus] = js.undefined,
        summary: js.UndefOr[ExecutionSummary] = js.undefined,
        token: js.UndefOr[ActionExecutionToken] = js.undefined
    ): ActionExecution = {
      val __obj = js.Dynamic.literal()
      errorDetails.foreach(__v => __obj.updateDynamic("errorDetails")(__v.asInstanceOf[js.Any]))
      externalExecutionId.foreach(__v => __obj.updateDynamic("externalExecutionId")(__v.asInstanceOf[js.Any]))
      externalExecutionUrl.foreach(__v => __obj.updateDynamic("externalExecutionUrl")(__v.asInstanceOf[js.Any]))
      lastStatusChange.foreach(__v => __obj.updateDynamic("lastStatusChange")(__v.asInstanceOf[js.Any]))
      lastUpdatedBy.foreach(__v => __obj.updateDynamic("lastUpdatedBy")(__v.asInstanceOf[js.Any]))
      percentComplete.foreach(__v => __obj.updateDynamic("percentComplete")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      token.foreach(__v => __obj.updateDynamic("token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionExecution]
    }
  }

  /** Returns information about an execution of an action, including the action execution ID, and the name, version, and timing of the action.
    */
  @js.native
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

  object ActionExecutionDetail {
    @inline
    def apply(
        actionExecutionId: js.UndefOr[ActionExecutionId] = js.undefined,
        actionName: js.UndefOr[ActionName] = js.undefined,
        input: js.UndefOr[ActionExecutionInput] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        output: js.UndefOr[ActionExecutionOutput] = js.undefined,
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined,
        pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined,
        stageName: js.UndefOr[StageName] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[ActionExecutionStatus] = js.undefined
    ): ActionExecutionDetail = {
      val __obj = js.Dynamic.literal()
      actionExecutionId.foreach(__v => __obj.updateDynamic("actionExecutionId")(__v.asInstanceOf[js.Any]))
      actionName.foreach(__v => __obj.updateDynamic("actionName")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      output.foreach(__v => __obj.updateDynamic("output")(__v.asInstanceOf[js.Any]))
      pipelineExecutionId.foreach(__v => __obj.updateDynamic("pipelineExecutionId")(__v.asInstanceOf[js.Any]))
      pipelineVersion.foreach(__v => __obj.updateDynamic("pipelineVersion")(__v.asInstanceOf[js.Any]))
      stageName.foreach(__v => __obj.updateDynamic("stageName")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionExecutionDetail]
    }
  }

  /** Filter values for the action execution.
    */
  @js.native
  trait ActionExecutionFilter extends js.Object {
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  object ActionExecutionFilter {
    @inline
    def apply(
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
    ): ActionExecutionFilter = {
      val __obj = js.Dynamic.literal()
      pipelineExecutionId.foreach(__v => __obj.updateDynamic("pipelineExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionExecutionFilter]
    }
  }

  /** Input information used for an action execution.
    */
  @js.native
  trait ActionExecutionInput extends js.Object {
    var actionTypeId: js.UndefOr[ActionTypeId]
    var configuration: js.UndefOr[ActionConfigurationMap]
    var inputArtifacts: js.UndefOr[ArtifactDetailList]
    var namespace: js.UndefOr[ActionNamespace]
    var region: js.UndefOr[AWSRegionName]
    var resolvedConfiguration: js.UndefOr[ResolvedActionConfigurationMap]
    var roleArn: js.UndefOr[RoleArn]
  }

  object ActionExecutionInput {
    @inline
    def apply(
        actionTypeId: js.UndefOr[ActionTypeId] = js.undefined,
        configuration: js.UndefOr[ActionConfigurationMap] = js.undefined,
        inputArtifacts: js.UndefOr[ArtifactDetailList] = js.undefined,
        namespace: js.UndefOr[ActionNamespace] = js.undefined,
        region: js.UndefOr[AWSRegionName] = js.undefined,
        resolvedConfiguration: js.UndefOr[ResolvedActionConfigurationMap] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): ActionExecutionInput = {
      val __obj = js.Dynamic.literal()
      actionTypeId.foreach(__v => __obj.updateDynamic("actionTypeId")(__v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      inputArtifacts.foreach(__v => __obj.updateDynamic("inputArtifacts")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      resolvedConfiguration.foreach(__v => __obj.updateDynamic("resolvedConfiguration")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionExecutionInput]
    }
  }

  /** Output details listed for an action execution, such as the action execution result.
    */
  @js.native
  trait ActionExecutionOutput extends js.Object {
    var executionResult: js.UndefOr[ActionExecutionResult]
    var outputArtifacts: js.UndefOr[ArtifactDetailList]
    var outputVariables: js.UndefOr[OutputVariablesMap]
  }

  object ActionExecutionOutput {
    @inline
    def apply(
        executionResult: js.UndefOr[ActionExecutionResult] = js.undefined,
        outputArtifacts: js.UndefOr[ArtifactDetailList] = js.undefined,
        outputVariables: js.UndefOr[OutputVariablesMap] = js.undefined
    ): ActionExecutionOutput = {
      val __obj = js.Dynamic.literal()
      executionResult.foreach(__v => __obj.updateDynamic("executionResult")(__v.asInstanceOf[js.Any]))
      outputArtifacts.foreach(__v => __obj.updateDynamic("outputArtifacts")(__v.asInstanceOf[js.Any]))
      outputVariables.foreach(__v => __obj.updateDynamic("outputVariables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionExecutionOutput]
    }
  }

  /** Execution result information, such as the external execution ID.
    */
  @js.native
  trait ActionExecutionResult extends js.Object {
    var externalExecutionId: js.UndefOr[ExternalExecutionId]
    var externalExecutionSummary: js.UndefOr[ExternalExecutionSummary]
    var externalExecutionUrl: js.UndefOr[Url]
  }

  object ActionExecutionResult {
    @inline
    def apply(
        externalExecutionId: js.UndefOr[ExternalExecutionId] = js.undefined,
        externalExecutionSummary: js.UndefOr[ExternalExecutionSummary] = js.undefined,
        externalExecutionUrl: js.UndefOr[Url] = js.undefined
    ): ActionExecutionResult = {
      val __obj = js.Dynamic.literal()
      externalExecutionId.foreach(__v => __obj.updateDynamic("externalExecutionId")(__v.asInstanceOf[js.Any]))
      externalExecutionSummary.foreach(__v => __obj.updateDynamic("externalExecutionSummary")(__v.asInstanceOf[js.Any]))
      externalExecutionUrl.foreach(__v => __obj.updateDynamic("externalExecutionUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionExecutionResult]
    }
  }

  @js.native
  sealed trait ActionExecutionStatus extends js.Any
  object ActionExecutionStatus {
    val InProgress = "InProgress".asInstanceOf[ActionExecutionStatus]
    val Abandoned = "Abandoned".asInstanceOf[ActionExecutionStatus]
    val Succeeded = "Succeeded".asInstanceOf[ActionExecutionStatus]
    val Failed = "Failed".asInstanceOf[ActionExecutionStatus]

    @inline def values = js.Array(InProgress, Abandoned, Succeeded, Failed)
  }

  @js.native
  sealed trait ActionOwner extends js.Any
  object ActionOwner {
    val AWS = "AWS".asInstanceOf[ActionOwner]
    val ThirdParty = "ThirdParty".asInstanceOf[ActionOwner]
    val Custom = "Custom".asInstanceOf[ActionOwner]

    @inline def values = js.Array(AWS, ThirdParty, Custom)
  }

  /** Represents information about the version (or revision) of an action.
    */
  @js.native
  trait ActionRevision extends js.Object {
    var created: Timestamp
    var revisionChangeId: RevisionChangeIdentifier
    var revisionId: Revision
  }

  object ActionRevision {
    @inline
    def apply(
        created: Timestamp,
        revisionChangeId: RevisionChangeIdentifier,
        revisionId: Revision
    ): ActionRevision = {
      val __obj = js.Dynamic.literal(
        "created" -> created.asInstanceOf[js.Any],
        "revisionChangeId" -> revisionChangeId.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActionRevision]
    }
  }

  /** Represents information about the state of an action.
    */
  @js.native
  trait ActionState extends js.Object {
    var actionName: js.UndefOr[ActionName]
    var currentRevision: js.UndefOr[ActionRevision]
    var entityUrl: js.UndefOr[Url]
    var latestExecution: js.UndefOr[ActionExecution]
    var revisionUrl: js.UndefOr[Url]
  }

  object ActionState {
    @inline
    def apply(
        actionName: js.UndefOr[ActionName] = js.undefined,
        currentRevision: js.UndefOr[ActionRevision] = js.undefined,
        entityUrl: js.UndefOr[Url] = js.undefined,
        latestExecution: js.UndefOr[ActionExecution] = js.undefined,
        revisionUrl: js.UndefOr[Url] = js.undefined
    ): ActionState = {
      val __obj = js.Dynamic.literal()
      actionName.foreach(__v => __obj.updateDynamic("actionName")(__v.asInstanceOf[js.Any]))
      currentRevision.foreach(__v => __obj.updateDynamic("currentRevision")(__v.asInstanceOf[js.Any]))
      entityUrl.foreach(__v => __obj.updateDynamic("entityUrl")(__v.asInstanceOf[js.Any]))
      latestExecution.foreach(__v => __obj.updateDynamic("latestExecution")(__v.asInstanceOf[js.Any]))
      revisionUrl.foreach(__v => __obj.updateDynamic("revisionUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionState]
    }
  }

  /** Returns information about the details of an action type.
    */
  @js.native
  trait ActionType extends js.Object {
    var id: ActionTypeId
    var inputArtifactDetails: ArtifactDetails
    var outputArtifactDetails: ArtifactDetails
    var actionConfigurationProperties: js.UndefOr[ActionConfigurationPropertyList]
    var settings: js.UndefOr[ActionTypeSettings]
  }

  object ActionType {
    @inline
    def apply(
        id: ActionTypeId,
        inputArtifactDetails: ArtifactDetails,
        outputArtifactDetails: ArtifactDetails,
        actionConfigurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.undefined,
        settings: js.UndefOr[ActionTypeSettings] = js.undefined
    ): ActionType = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "inputArtifactDetails" -> inputArtifactDetails.asInstanceOf[js.Any],
        "outputArtifactDetails" -> outputArtifactDetails.asInstanceOf[js.Any]
      )

      actionConfigurationProperties.foreach(__v => __obj.updateDynamic("actionConfigurationProperties")(__v.asInstanceOf[js.Any]))
      settings.foreach(__v => __obj.updateDynamic("settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionType]
    }
  }

  /** Represents information about an action type.
    */
  @js.native
  trait ActionTypeId extends js.Object {
    var category: ActionCategory
    var owner: ActionOwner
    var provider: ActionProvider
    var version: Version
  }

  object ActionTypeId {
    @inline
    def apply(
        category: ActionCategory,
        owner: ActionOwner,
        provider: ActionProvider,
        version: Version
    ): ActionTypeId = {
      val __obj = js.Dynamic.literal(
        "category" -> category.asInstanceOf[js.Any],
        "owner" -> owner.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActionTypeId]
    }
  }

  /** Returns information about the settings for an action type.
    */
  @js.native
  trait ActionTypeSettings extends js.Object {
    var entityUrlTemplate: js.UndefOr[UrlTemplate]
    var executionUrlTemplate: js.UndefOr[UrlTemplate]
    var revisionUrlTemplate: js.UndefOr[UrlTemplate]
    var thirdPartyConfigurationUrl: js.UndefOr[Url]
  }

  object ActionTypeSettings {
    @inline
    def apply(
        entityUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined,
        executionUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined,
        revisionUrlTemplate: js.UndefOr[UrlTemplate] = js.undefined,
        thirdPartyConfigurationUrl: js.UndefOr[Url] = js.undefined
    ): ActionTypeSettings = {
      val __obj = js.Dynamic.literal()
      entityUrlTemplate.foreach(__v => __obj.updateDynamic("entityUrlTemplate")(__v.asInstanceOf[js.Any]))
      executionUrlTemplate.foreach(__v => __obj.updateDynamic("executionUrlTemplate")(__v.asInstanceOf[js.Any]))
      revisionUrlTemplate.foreach(__v => __obj.updateDynamic("revisionUrlTemplate")(__v.asInstanceOf[js.Any]))
      thirdPartyConfigurationUrl.foreach(__v => __obj.updateDynamic("thirdPartyConfigurationUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionTypeSettings]
    }
  }

  /** Represents information about the result of an approval request.
    */
  @js.native
  trait ApprovalResult extends js.Object {
    var status: ApprovalStatus
    var summary: ApprovalSummary
  }

  object ApprovalResult {
    @inline
    def apply(
        status: ApprovalStatus,
        summary: ApprovalSummary
    ): ApprovalResult = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any],
        "summary" -> summary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ApprovalResult]
    }
  }

  @js.native
  sealed trait ApprovalStatus extends js.Any
  object ApprovalStatus {
    val Approved = "Approved".asInstanceOf[ApprovalStatus]
    val Rejected = "Rejected".asInstanceOf[ApprovalStatus]

    @inline def values = js.Array(Approved, Rejected)
  }

  /** Represents information about an artifact that is worked on by actions in the pipeline.
    */
  @js.native
  trait Artifact extends js.Object {
    var location: js.UndefOr[ArtifactLocation]
    var name: js.UndefOr[ArtifactName]
    var revision: js.UndefOr[Revision]
  }

  object Artifact {
    @inline
    def apply(
        location: js.UndefOr[ArtifactLocation] = js.undefined,
        name: js.UndefOr[ArtifactName] = js.undefined,
        revision: js.UndefOr[Revision] = js.undefined
    ): Artifact = {
      val __obj = js.Dynamic.literal()
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Artifact]
    }
  }

  /** Artifact details for the action execution, such as the artifact location.
    */
  @js.native
  trait ArtifactDetail extends js.Object {
    var name: js.UndefOr[ArtifactName]
    var s3location: js.UndefOr[S3Location]
  }

  object ArtifactDetail {
    @inline
    def apply(
        name: js.UndefOr[ArtifactName] = js.undefined,
        s3location: js.UndefOr[S3Location] = js.undefined
    ): ArtifactDetail = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      s3location.foreach(__v => __obj.updateDynamic("s3location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactDetail]
    }
  }

  /** Returns information about the details of an artifact.
    */
  @js.native
  trait ArtifactDetails extends js.Object {
    var maximumCount: MaximumArtifactCount
    var minimumCount: MinimumArtifactCount
  }

  object ArtifactDetails {
    @inline
    def apply(
        maximumCount: MaximumArtifactCount,
        minimumCount: MinimumArtifactCount
    ): ArtifactDetails = {
      val __obj = js.Dynamic.literal(
        "maximumCount" -> maximumCount.asInstanceOf[js.Any],
        "minimumCount" -> minimumCount.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ArtifactDetails]
    }
  }

  /** Represents information about the location of an artifact.
    */
  @js.native
  trait ArtifactLocation extends js.Object {
    var s3Location: js.UndefOr[S3ArtifactLocation]
    var `type`: js.UndefOr[ArtifactLocationType]
  }

  object ArtifactLocation {
    @inline
    def apply(
        s3Location: js.UndefOr[S3ArtifactLocation] = js.undefined,
        `type`: js.UndefOr[ArtifactLocationType] = js.undefined
    ): ArtifactLocation = {
      val __obj = js.Dynamic.literal()
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactLocation]
    }
  }

  @js.native
  sealed trait ArtifactLocationType extends js.Any
  object ArtifactLocationType {
    val S3 = "S3".asInstanceOf[ArtifactLocationType]

    @inline def values = js.Array(S3)
  }

  /** Represents revision details of an artifact.
    */
  @js.native
  trait ArtifactRevision extends js.Object {
    var created: js.UndefOr[Timestamp]
    var name: js.UndefOr[ArtifactName]
    var revisionChangeIdentifier: js.UndefOr[RevisionChangeIdentifier]
    var revisionId: js.UndefOr[Revision]
    var revisionSummary: js.UndefOr[RevisionSummary]
    var revisionUrl: js.UndefOr[Url]
  }

  object ArtifactRevision {
    @inline
    def apply(
        created: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[ArtifactName] = js.undefined,
        revisionChangeIdentifier: js.UndefOr[RevisionChangeIdentifier] = js.undefined,
        revisionId: js.UndefOr[Revision] = js.undefined,
        revisionSummary: js.UndefOr[RevisionSummary] = js.undefined,
        revisionUrl: js.UndefOr[Url] = js.undefined
    ): ArtifactRevision = {
      val __obj = js.Dynamic.literal()
      created.foreach(__v => __obj.updateDynamic("created")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      revisionChangeIdentifier.foreach(__v => __obj.updateDynamic("revisionChangeIdentifier")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      revisionSummary.foreach(__v => __obj.updateDynamic("revisionSummary")(__v.asInstanceOf[js.Any]))
      revisionUrl.foreach(__v => __obj.updateDynamic("revisionUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactRevision]
    }
  }

  /** The S3 bucket where artifacts for the pipeline are stored.
    *
    * '''Note:'''You must include either <code>artifactStore</code> or <code>artifactStores</code> in your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use <code>artifactStores</code>.
    */
  @js.native
  trait ArtifactStore extends js.Object {
    var location: ArtifactStoreLocation
    var `type`: ArtifactStoreType
    var encryptionKey: js.UndefOr[EncryptionKey]
  }

  object ArtifactStore {
    @inline
    def apply(
        location: ArtifactStoreLocation,
        `type`: ArtifactStoreType,
        encryptionKey: js.UndefOr[EncryptionKey] = js.undefined
    ): ArtifactStore = {
      val __obj = js.Dynamic.literal(
        "location" -> location.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactStore]
    }
  }

  @js.native
  sealed trait ArtifactStoreType extends js.Any
  object ArtifactStoreType {
    val S3 = "S3".asInstanceOf[ArtifactStoreType]

    @inline def values = js.Array(S3)
  }

  /** Reserved for future use.
    */
  @js.native
  trait BlockerDeclaration extends js.Object {
    var name: BlockerName
    var `type`: BlockerType
  }

  object BlockerDeclaration {
    @inline
    def apply(
        name: BlockerName,
        `type`: BlockerType
    ): BlockerDeclaration = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BlockerDeclaration]
    }
  }

  @js.native
  sealed trait BlockerType extends js.Any
  object BlockerType {
    val Schedule = "Schedule".asInstanceOf[BlockerType]

    @inline def values = js.Array(Schedule)
  }

  /** Represents the input of a CreateCustomActionType operation.
    */
  @js.native
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

  object CreateCustomActionTypeInput {
    @inline
    def apply(
        category: ActionCategory,
        inputArtifactDetails: ArtifactDetails,
        outputArtifactDetails: ArtifactDetails,
        provider: ActionProvider,
        version: Version,
        configurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.undefined,
        settings: js.UndefOr[ActionTypeSettings] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateCustomActionTypeInput = {
      val __obj = js.Dynamic.literal(
        "category" -> category.asInstanceOf[js.Any],
        "inputArtifactDetails" -> inputArtifactDetails.asInstanceOf[js.Any],
        "outputArtifactDetails" -> outputArtifactDetails.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      configurationProperties.foreach(__v => __obj.updateDynamic("configurationProperties")(__v.asInstanceOf[js.Any]))
      settings.foreach(__v => __obj.updateDynamic("settings")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomActionTypeInput]
    }
  }

  /** Represents the output of a <code>CreateCustomActionType</code> operation.
    */
  @js.native
  trait CreateCustomActionTypeOutput extends js.Object {
    var actionType: ActionType
    var tags: js.UndefOr[TagList]
  }

  object CreateCustomActionTypeOutput {
    @inline
    def apply(
        actionType: ActionType,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateCustomActionTypeOutput = {
      val __obj = js.Dynamic.literal(
        "actionType" -> actionType.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomActionTypeOutput]
    }
  }

  /** Represents the input of a <code>CreatePipeline</code> action.
    */
  @js.native
  trait CreatePipelineInput extends js.Object {
    var pipeline: PipelineDeclaration
    var tags: js.UndefOr[TagList]
  }

  object CreatePipelineInput {
    @inline
    def apply(
        pipeline: PipelineDeclaration,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreatePipelineInput = {
      val __obj = js.Dynamic.literal(
        "pipeline" -> pipeline.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineInput]
    }
  }

  /** Represents the output of a <code>CreatePipeline</code> action.
    */
  @js.native
  trait CreatePipelineOutput extends js.Object {
    var pipeline: js.UndefOr[PipelineDeclaration]
    var tags: js.UndefOr[TagList]
  }

  object CreatePipelineOutput {
    @inline
    def apply(
        pipeline: js.UndefOr[PipelineDeclaration] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreatePipelineOutput = {
      val __obj = js.Dynamic.literal()
      pipeline.foreach(__v => __obj.updateDynamic("pipeline")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineOutput]
    }
  }

  /** Represents information about a current revision.
    */
  @js.native
  trait CurrentRevision extends js.Object {
    var changeIdentifier: RevisionChangeIdentifier
    var revision: Revision
    var created: js.UndefOr[Time]
    var revisionSummary: js.UndefOr[RevisionSummary]
  }

  object CurrentRevision {
    @inline
    def apply(
        changeIdentifier: RevisionChangeIdentifier,
        revision: Revision,
        created: js.UndefOr[Time] = js.undefined,
        revisionSummary: js.UndefOr[RevisionSummary] = js.undefined
    ): CurrentRevision = {
      val __obj = js.Dynamic.literal(
        "changeIdentifier" -> changeIdentifier.asInstanceOf[js.Any],
        "revision" -> revision.asInstanceOf[js.Any]
      )

      created.foreach(__v => __obj.updateDynamic("created")(__v.asInstanceOf[js.Any]))
      revisionSummary.foreach(__v => __obj.updateDynamic("revisionSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentRevision]
    }
  }

  /** Represents the input of a <code>DeleteCustomActionType</code> operation. The custom action will be marked as deleted.
    */
  @js.native
  trait DeleteCustomActionTypeInput extends js.Object {
    var category: ActionCategory
    var provider: ActionProvider
    var version: Version
  }

  object DeleteCustomActionTypeInput {
    @inline
    def apply(
        category: ActionCategory,
        provider: ActionProvider,
        version: Version
    ): DeleteCustomActionTypeInput = {
      val __obj = js.Dynamic.literal(
        "category" -> category.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCustomActionTypeInput]
    }
  }

  /** Represents the input of a <code>DeletePipeline</code> action.
    */
  @js.native
  trait DeletePipelineInput extends js.Object {
    var name: PipelineName
  }

  object DeletePipelineInput {
    @inline
    def apply(
        name: PipelineName
    ): DeletePipelineInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePipelineInput]
    }
  }

  @js.native
  trait DeleteWebhookInput extends js.Object {
    var name: WebhookName
  }

  object DeleteWebhookInput {
    @inline
    def apply(
        name: WebhookName
    ): DeleteWebhookInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWebhookInput]
    }
  }

  @js.native
  trait DeleteWebhookOutput extends js.Object

  object DeleteWebhookOutput {
    @inline
    def apply(): DeleteWebhookOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWebhookOutput]
    }
  }

  @js.native
  trait DeregisterWebhookWithThirdPartyInput extends js.Object {
    var webhookName: js.UndefOr[WebhookName]
  }

  object DeregisterWebhookWithThirdPartyInput {
    @inline
    def apply(
        webhookName: js.UndefOr[WebhookName] = js.undefined
    ): DeregisterWebhookWithThirdPartyInput = {
      val __obj = js.Dynamic.literal()
      webhookName.foreach(__v => __obj.updateDynamic("webhookName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterWebhookWithThirdPartyInput]
    }
  }

  @js.native
  trait DeregisterWebhookWithThirdPartyOutput extends js.Object

  object DeregisterWebhookWithThirdPartyOutput {
    @inline
    def apply(): DeregisterWebhookWithThirdPartyOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterWebhookWithThirdPartyOutput]
    }
  }

  /** Represents the input of a <code>DisableStageTransition</code> action.
    */
  @js.native
  trait DisableStageTransitionInput extends js.Object {
    var pipelineName: PipelineName
    var reason: DisabledReason
    var stageName: StageName
    var transitionType: StageTransitionType
  }

  object DisableStageTransitionInput {
    @inline
    def apply(
        pipelineName: PipelineName,
        reason: DisabledReason,
        stageName: StageName,
        transitionType: StageTransitionType
    ): DisableStageTransitionInput = {
      val __obj = js.Dynamic.literal(
        "pipelineName" -> pipelineName.asInstanceOf[js.Any],
        "reason" -> reason.asInstanceOf[js.Any],
        "stageName" -> stageName.asInstanceOf[js.Any],
        "transitionType" -> transitionType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableStageTransitionInput]
    }
  }

  /** Represents the input of an <code>EnableStageTransition</code> action.
    */
  @js.native
  trait EnableStageTransitionInput extends js.Object {
    var pipelineName: PipelineName
    var stageName: StageName
    var transitionType: StageTransitionType
  }

  object EnableStageTransitionInput {
    @inline
    def apply(
        pipelineName: PipelineName,
        stageName: StageName,
        transitionType: StageTransitionType
    ): EnableStageTransitionInput = {
      val __obj = js.Dynamic.literal(
        "pipelineName" -> pipelineName.asInstanceOf[js.Any],
        "stageName" -> stageName.asInstanceOf[js.Any],
        "transitionType" -> transitionType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableStageTransitionInput]
    }
  }

  /** Represents information about the key used to encrypt data in the artifact store, such as an AWS Key Management Service (AWS KMS) key.
    */
  @js.native
  trait EncryptionKey extends js.Object {
    var id: EncryptionKeyId
    var `type`: EncryptionKeyType
  }

  object EncryptionKey {
    @inline
    def apply(
        id: EncryptionKeyId,
        `type`: EncryptionKeyType
    ): EncryptionKey = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EncryptionKey]
    }
  }

  @js.native
  sealed trait EncryptionKeyType extends js.Any
  object EncryptionKeyType {
    val KMS = "KMS".asInstanceOf[EncryptionKeyType]

    @inline def values = js.Array(KMS)
  }

  /** Represents information about an error in AWS CodePipeline.
    */
  @js.native
  trait ErrorDetails extends js.Object {
    var code: js.UndefOr[Code]
    var message: js.UndefOr[Message]
  }

  object ErrorDetails {
    @inline
    def apply(
        code: js.UndefOr[Code] = js.undefined,
        message: js.UndefOr[Message] = js.undefined
    ): ErrorDetails = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorDetails]
    }
  }

  /** The details of the actions taken and results produced on an artifact as it passes through stages in the pipeline.
    */
  @js.native
  trait ExecutionDetails extends js.Object {
    var externalExecutionId: js.UndefOr[ExecutionId]
    var percentComplete: js.UndefOr[Percentage]
    var summary: js.UndefOr[ExecutionSummary]
  }

  object ExecutionDetails {
    @inline
    def apply(
        externalExecutionId: js.UndefOr[ExecutionId] = js.undefined,
        percentComplete: js.UndefOr[Percentage] = js.undefined,
        summary: js.UndefOr[ExecutionSummary] = js.undefined
    ): ExecutionDetails = {
      val __obj = js.Dynamic.literal()
      externalExecutionId.foreach(__v => __obj.updateDynamic("externalExecutionId")(__v.asInstanceOf[js.Any]))
      percentComplete.foreach(__v => __obj.updateDynamic("percentComplete")(__v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionDetails]
    }
  }

  /** The interaction or event that started a pipeline execution.
    */
  @js.native
  trait ExecutionTrigger extends js.Object {
    var triggerDetail: js.UndefOr[TriggerDetail]
    var triggerType: js.UndefOr[TriggerType]
  }

  object ExecutionTrigger {
    @inline
    def apply(
        triggerDetail: js.UndefOr[TriggerDetail] = js.undefined,
        triggerType: js.UndefOr[TriggerType] = js.undefined
    ): ExecutionTrigger = {
      val __obj = js.Dynamic.literal()
      triggerDetail.foreach(__v => __obj.updateDynamic("triggerDetail")(__v.asInstanceOf[js.Any]))
      triggerType.foreach(__v => __obj.updateDynamic("triggerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionTrigger]
    }
  }

  /** Represents information about failure details.
    */
  @js.native
  trait FailureDetails extends js.Object {
    var message: Message
    var `type`: FailureType
    var externalExecutionId: js.UndefOr[ExecutionId]
  }

  object FailureDetails {
    @inline
    def apply(
        message: Message,
        `type`: FailureType,
        externalExecutionId: js.UndefOr[ExecutionId] = js.undefined
    ): FailureDetails = {
      val __obj = js.Dynamic.literal(
        "message" -> message.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      externalExecutionId.foreach(__v => __obj.updateDynamic("externalExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailureDetails]
    }
  }

  @js.native
  sealed trait FailureType extends js.Any
  object FailureType {
    val JobFailed = "JobFailed".asInstanceOf[FailureType]
    val ConfigurationError = "ConfigurationError".asInstanceOf[FailureType]
    val PermissionError = "PermissionError".asInstanceOf[FailureType]
    val RevisionOutOfSync = "RevisionOutOfSync".asInstanceOf[FailureType]
    val RevisionUnavailable = "RevisionUnavailable".asInstanceOf[FailureType]
    val SystemUnavailable = "SystemUnavailable".asInstanceOf[FailureType]

    @inline def values = js.Array(JobFailed, ConfigurationError, PermissionError, RevisionOutOfSync, RevisionUnavailable, SystemUnavailable)
  }

  /** Represents the input of a <code>GetJobDetails</code> action.
    */
  @js.native
  trait GetJobDetailsInput extends js.Object {
    var jobId: JobId
  }

  object GetJobDetailsInput {
    @inline
    def apply(
        jobId: JobId
    ): GetJobDetailsInput = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJobDetailsInput]
    }
  }

  /** Represents the output of a <code>GetJobDetails</code> action.
    */
  @js.native
  trait GetJobDetailsOutput extends js.Object {
    var jobDetails: js.UndefOr[JobDetails]
  }

  object GetJobDetailsOutput {
    @inline
    def apply(
        jobDetails: js.UndefOr[JobDetails] = js.undefined
    ): GetJobDetailsOutput = {
      val __obj = js.Dynamic.literal()
      jobDetails.foreach(__v => __obj.updateDynamic("jobDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobDetailsOutput]
    }
  }

  /** Represents the input of a <code>GetPipelineExecution</code> action.
    */
  @js.native
  trait GetPipelineExecutionInput extends js.Object {
    var pipelineExecutionId: PipelineExecutionId
    var pipelineName: PipelineName
  }

  object GetPipelineExecutionInput {
    @inline
    def apply(
        pipelineExecutionId: PipelineExecutionId,
        pipelineName: PipelineName
    ): GetPipelineExecutionInput = {
      val __obj = js.Dynamic.literal(
        "pipelineExecutionId" -> pipelineExecutionId.asInstanceOf[js.Any],
        "pipelineName" -> pipelineName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPipelineExecutionInput]
    }
  }

  /** Represents the output of a <code>GetPipelineExecution</code> action.
    */
  @js.native
  trait GetPipelineExecutionOutput extends js.Object {
    var pipelineExecution: js.UndefOr[PipelineExecution]
  }

  object GetPipelineExecutionOutput {
    @inline
    def apply(
        pipelineExecution: js.UndefOr[PipelineExecution] = js.undefined
    ): GetPipelineExecutionOutput = {
      val __obj = js.Dynamic.literal()
      pipelineExecution.foreach(__v => __obj.updateDynamic("pipelineExecution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPipelineExecutionOutput]
    }
  }

  /** Represents the input of a <code>GetPipeline</code> action.
    */
  @js.native
  trait GetPipelineInput extends js.Object {
    var name: PipelineName
    var version: js.UndefOr[PipelineVersion]
  }

  object GetPipelineInput {
    @inline
    def apply(
        name: PipelineName,
        version: js.UndefOr[PipelineVersion] = js.undefined
    ): GetPipelineInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPipelineInput]
    }
  }

  /** Represents the output of a <code>GetPipeline</code> action.
    */
  @js.native
  trait GetPipelineOutput extends js.Object {
    var metadata: js.UndefOr[PipelineMetadata]
    var pipeline: js.UndefOr[PipelineDeclaration]
  }

  object GetPipelineOutput {
    @inline
    def apply(
        metadata: js.UndefOr[PipelineMetadata] = js.undefined,
        pipeline: js.UndefOr[PipelineDeclaration] = js.undefined
    ): GetPipelineOutput = {
      val __obj = js.Dynamic.literal()
      metadata.foreach(__v => __obj.updateDynamic("metadata")(__v.asInstanceOf[js.Any]))
      pipeline.foreach(__v => __obj.updateDynamic("pipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPipelineOutput]
    }
  }

  /** Represents the input of a <code>GetPipelineState</code> action.
    */
  @js.native
  trait GetPipelineStateInput extends js.Object {
    var name: PipelineName
  }

  object GetPipelineStateInput {
    @inline
    def apply(
        name: PipelineName
    ): GetPipelineStateInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPipelineStateInput]
    }
  }

  /** Represents the output of a <code>GetPipelineState</code> action.
    */
  @js.native
  trait GetPipelineStateOutput extends js.Object {
    var created: js.UndefOr[Timestamp]
    var pipelineName: js.UndefOr[PipelineName]
    var pipelineVersion: js.UndefOr[PipelineVersion]
    var stageStates: js.UndefOr[StageStateList]
    var updated: js.UndefOr[Timestamp]
  }

  object GetPipelineStateOutput {
    @inline
    def apply(
        created: js.UndefOr[Timestamp] = js.undefined,
        pipelineName: js.UndefOr[PipelineName] = js.undefined,
        pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined,
        stageStates: js.UndefOr[StageStateList] = js.undefined,
        updated: js.UndefOr[Timestamp] = js.undefined
    ): GetPipelineStateOutput = {
      val __obj = js.Dynamic.literal()
      created.foreach(__v => __obj.updateDynamic("created")(__v.asInstanceOf[js.Any]))
      pipelineName.foreach(__v => __obj.updateDynamic("pipelineName")(__v.asInstanceOf[js.Any]))
      pipelineVersion.foreach(__v => __obj.updateDynamic("pipelineVersion")(__v.asInstanceOf[js.Any]))
      stageStates.foreach(__v => __obj.updateDynamic("stageStates")(__v.asInstanceOf[js.Any]))
      updated.foreach(__v => __obj.updateDynamic("updated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPipelineStateOutput]
    }
  }

  /** Represents the input of a <code>GetThirdPartyJobDetails</code> action.
    */
  @js.native
  trait GetThirdPartyJobDetailsInput extends js.Object {
    var clientToken: ClientToken
    var jobId: ThirdPartyJobId
  }

  object GetThirdPartyJobDetailsInput {
    @inline
    def apply(
        clientToken: ClientToken,
        jobId: ThirdPartyJobId
    ): GetThirdPartyJobDetailsInput = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetThirdPartyJobDetailsInput]
    }
  }

  /** Represents the output of a <code>GetThirdPartyJobDetails</code> action.
    */
  @js.native
  trait GetThirdPartyJobDetailsOutput extends js.Object {
    var jobDetails: js.UndefOr[ThirdPartyJobDetails]
  }

  object GetThirdPartyJobDetailsOutput {
    @inline
    def apply(
        jobDetails: js.UndefOr[ThirdPartyJobDetails] = js.undefined
    ): GetThirdPartyJobDetailsOutput = {
      val __obj = js.Dynamic.literal()
      jobDetails.foreach(__v => __obj.updateDynamic("jobDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetThirdPartyJobDetailsOutput]
    }
  }

  /** Represents information about an artifact to be worked on, such as a test or build artifact.
    */
  @js.native
  trait InputArtifact extends js.Object {
    var name: ArtifactName
  }

  object InputArtifact {
    @inline
    def apply(
        name: ArtifactName
    ): InputArtifact = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InputArtifact]
    }
  }

  /** Represents information about a job.
    */
  @js.native
  trait Job extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var data: js.UndefOr[JobData]
    var id: js.UndefOr[JobId]
    var nonce: js.UndefOr[Nonce]
  }

  object Job {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        data: js.UndefOr[JobData] = js.undefined,
        id: js.UndefOr[JobId] = js.undefined,
        nonce: js.UndefOr[Nonce] = js.undefined
    ): Job = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      data.foreach(__v => __obj.updateDynamic("data")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      nonce.foreach(__v => __obj.updateDynamic("nonce")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /** Represents other information about a job required for a job worker to complete the job.
    */
  @js.native
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

  object JobData {
    @inline
    def apply(
        actionConfiguration: js.UndefOr[ActionConfiguration] = js.undefined,
        actionTypeId: js.UndefOr[ActionTypeId] = js.undefined,
        artifactCredentials: js.UndefOr[AWSSessionCredentials] = js.undefined,
        continuationToken: js.UndefOr[ContinuationToken] = js.undefined,
        encryptionKey: js.UndefOr[EncryptionKey] = js.undefined,
        inputArtifacts: js.UndefOr[ArtifactList] = js.undefined,
        outputArtifacts: js.UndefOr[ArtifactList] = js.undefined,
        pipelineContext: js.UndefOr[PipelineContext] = js.undefined
    ): JobData = {
      val __obj = js.Dynamic.literal()
      actionConfiguration.foreach(__v => __obj.updateDynamic("actionConfiguration")(__v.asInstanceOf[js.Any]))
      actionTypeId.foreach(__v => __obj.updateDynamic("actionTypeId")(__v.asInstanceOf[js.Any]))
      artifactCredentials.foreach(__v => __obj.updateDynamic("artifactCredentials")(__v.asInstanceOf[js.Any]))
      continuationToken.foreach(__v => __obj.updateDynamic("continuationToken")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      inputArtifacts.foreach(__v => __obj.updateDynamic("inputArtifacts")(__v.asInstanceOf[js.Any]))
      outputArtifacts.foreach(__v => __obj.updateDynamic("outputArtifacts")(__v.asInstanceOf[js.Any]))
      pipelineContext.foreach(__v => __obj.updateDynamic("pipelineContext")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobData]
    }
  }

  /** Represents information about the details of a job.
    */
  @js.native
  trait JobDetails extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var data: js.UndefOr[JobData]
    var id: js.UndefOr[JobId]
  }

  object JobDetails {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        data: js.UndefOr[JobData] = js.undefined,
        id: js.UndefOr[JobId] = js.undefined
    ): JobDetails = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      data.foreach(__v => __obj.updateDynamic("data")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDetails]
    }
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus {
    val Created = "Created".asInstanceOf[JobStatus]
    val Queued = "Queued".asInstanceOf[JobStatus]
    val Dispatched = "Dispatched".asInstanceOf[JobStatus]
    val InProgress = "InProgress".asInstanceOf[JobStatus]
    val TimedOut = "TimedOut".asInstanceOf[JobStatus]
    val Succeeded = "Succeeded".asInstanceOf[JobStatus]
    val Failed = "Failed".asInstanceOf[JobStatus]

    @inline def values = js.Array(Created, Queued, Dispatched, InProgress, TimedOut, Succeeded, Failed)
  }

  @js.native
  trait ListActionExecutionsInput extends js.Object {
    var pipelineName: PipelineName
    var filter: js.UndefOr[ActionExecutionFilter]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListActionExecutionsInput {
    @inline
    def apply(
        pipelineName: PipelineName,
        filter: js.UndefOr[ActionExecutionFilter] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActionExecutionsInput = {
      val __obj = js.Dynamic.literal(
        "pipelineName" -> pipelineName.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActionExecutionsInput]
    }
  }

  @js.native
  trait ListActionExecutionsOutput extends js.Object {
    var actionExecutionDetails: js.UndefOr[ActionExecutionDetailList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListActionExecutionsOutput {
    @inline
    def apply(
        actionExecutionDetails: js.UndefOr[ActionExecutionDetailList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActionExecutionsOutput = {
      val __obj = js.Dynamic.literal()
      actionExecutionDetails.foreach(__v => __obj.updateDynamic("actionExecutionDetails")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActionExecutionsOutput]
    }
  }

  /** Represents the input of a <code>ListActionTypes</code> action.
    */
  @js.native
  trait ListActionTypesInput extends js.Object {
    var actionOwnerFilter: js.UndefOr[ActionOwner]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListActionTypesInput {
    @inline
    def apply(
        actionOwnerFilter: js.UndefOr[ActionOwner] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActionTypesInput = {
      val __obj = js.Dynamic.literal()
      actionOwnerFilter.foreach(__v => __obj.updateDynamic("actionOwnerFilter")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActionTypesInput]
    }
  }

  /** Represents the output of a <code>ListActionTypes</code> action.
    */
  @js.native
  trait ListActionTypesOutput extends js.Object {
    var actionTypes: ActionTypeList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListActionTypesOutput {
    @inline
    def apply(
        actionTypes: ActionTypeList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActionTypesOutput = {
      val __obj = js.Dynamic.literal(
        "actionTypes" -> actionTypes.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActionTypesOutput]
    }
  }

  /** Represents the input of a <code>ListPipelineExecutions</code> action.
    */
  @js.native
  trait ListPipelineExecutionsInput extends js.Object {
    var pipelineName: PipelineName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPipelineExecutionsInput {
    @inline
    def apply(
        pipelineName: PipelineName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPipelineExecutionsInput = {
      val __obj = js.Dynamic.literal(
        "pipelineName" -> pipelineName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelineExecutionsInput]
    }
  }

  /** Represents the output of a <code>ListPipelineExecutions</code> action.
    */
  @js.native
  trait ListPipelineExecutionsOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var pipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList]
  }

  object ListPipelineExecutionsOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        pipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList] = js.undefined
    ): ListPipelineExecutionsOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      pipelineExecutionSummaries.foreach(__v => __obj.updateDynamic("pipelineExecutionSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelineExecutionsOutput]
    }
  }

  /** Represents the input of a <code>ListPipelines</code> action.
    */
  @js.native
  trait ListPipelinesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPipelinesInput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPipelinesInput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesInput]
    }
  }

  /** Represents the output of a <code>ListPipelines</code> action.
    */
  @js.native
  trait ListPipelinesOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var pipelines: js.UndefOr[PipelineList]
  }

  object ListPipelinesOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        pipelines: js.UndefOr[PipelineList] = js.undefined
    ): ListPipelinesOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      pipelines.foreach(__v => __obj.updateDynamic("pipelines")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        resourceArn: ResourceArn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /** The detail returned for each webhook after listing webhooks, such as the webhook URL, the webhook name, and the webhook ARN.
    */
  @js.native
  trait ListWebhookItem extends js.Object {
    var definition: WebhookDefinition
    var url: WebhookUrl
    var arn: js.UndefOr[WebhookArn]
    var errorCode: js.UndefOr[WebhookErrorCode]
    var errorMessage: js.UndefOr[WebhookErrorMessage]
    var lastTriggered: js.UndefOr[WebhookLastTriggered]
    var tags: js.UndefOr[TagList]
  }

  object ListWebhookItem {
    @inline
    def apply(
        definition: WebhookDefinition,
        url: WebhookUrl,
        arn: js.UndefOr[WebhookArn] = js.undefined,
        errorCode: js.UndefOr[WebhookErrorCode] = js.undefined,
        errorMessage: js.UndefOr[WebhookErrorMessage] = js.undefined,
        lastTriggered: js.UndefOr[WebhookLastTriggered] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ListWebhookItem = {
      val __obj = js.Dynamic.literal(
        "definition" -> definition.asInstanceOf[js.Any],
        "url" -> url.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      lastTriggered.foreach(__v => __obj.updateDynamic("lastTriggered")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebhookItem]
    }
  }

  @js.native
  trait ListWebhooksInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWebhooksInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWebhooksInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebhooksInput]
    }
  }

  @js.native
  trait ListWebhooksOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var webhooks: js.UndefOr[WebhookList]
  }

  object ListWebhooksOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        webhooks: js.UndefOr[WebhookList] = js.undefined
    ): ListWebhooksOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      webhooks.foreach(__v => __obj.updateDynamic("webhooks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebhooksOutput]
    }
  }

  /** Represents information about the output of an action.
    */
  @js.native
  trait OutputArtifact extends js.Object {
    var name: ArtifactName
  }

  object OutputArtifact {
    @inline
    def apply(
        name: ArtifactName
    ): OutputArtifact = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OutputArtifact]
    }
  }

  /** Represents information about a pipeline to a job worker.
    *
    * '''Note:'''PipelineContext contains <code>pipelineArn</code> and <code>pipelineExecutionId</code> for custom action jobs. The <code>pipelineArn</code> and <code>pipelineExecutionId</code> fields are not populated for ThirdParty action jobs.
    */
  @js.native
  trait PipelineContext extends js.Object {
    var action: js.UndefOr[ActionContext]
    var pipelineArn: js.UndefOr[PipelineArn]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
    var pipelineName: js.UndefOr[PipelineName]
    var stage: js.UndefOr[StageContext]
  }

  object PipelineContext {
    @inline
    def apply(
        action: js.UndefOr[ActionContext] = js.undefined,
        pipelineArn: js.UndefOr[PipelineArn] = js.undefined,
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined,
        pipelineName: js.UndefOr[PipelineName] = js.undefined,
        stage: js.UndefOr[StageContext] = js.undefined
    ): PipelineContext = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      pipelineArn.foreach(__v => __obj.updateDynamic("pipelineArn")(__v.asInstanceOf[js.Any]))
      pipelineExecutionId.foreach(__v => __obj.updateDynamic("pipelineExecutionId")(__v.asInstanceOf[js.Any]))
      pipelineName.foreach(__v => __obj.updateDynamic("pipelineName")(__v.asInstanceOf[js.Any]))
      stage.foreach(__v => __obj.updateDynamic("stage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineContext]
    }
  }

  /** Represents the structure of actions and stages to be performed in the pipeline.
    */
  @js.native
  trait PipelineDeclaration extends js.Object {
    var name: PipelineName
    var roleArn: RoleArn
    var stages: PipelineStageDeclarationList
    var artifactStore: js.UndefOr[ArtifactStore]
    var artifactStores: js.UndefOr[ArtifactStoreMap]
    var version: js.UndefOr[PipelineVersion]
  }

  object PipelineDeclaration {
    @inline
    def apply(
        name: PipelineName,
        roleArn: RoleArn,
        stages: PipelineStageDeclarationList,
        artifactStore: js.UndefOr[ArtifactStore] = js.undefined,
        artifactStores: js.UndefOr[ArtifactStoreMap] = js.undefined,
        version: js.UndefOr[PipelineVersion] = js.undefined
    ): PipelineDeclaration = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "stages" -> stages.asInstanceOf[js.Any]
      )

      artifactStore.foreach(__v => __obj.updateDynamic("artifactStore")(__v.asInstanceOf[js.Any]))
      artifactStores.foreach(__v => __obj.updateDynamic("artifactStores")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineDeclaration]
    }
  }

  /** Represents information about an execution of a pipeline.
    */
  @js.native
  trait PipelineExecution extends js.Object {
    var artifactRevisions: js.UndefOr[ArtifactRevisionList]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
    var pipelineName: js.UndefOr[PipelineName]
    var pipelineVersion: js.UndefOr[PipelineVersion]
    var status: js.UndefOr[PipelineExecutionStatus]
  }

  object PipelineExecution {
    @inline
    def apply(
        artifactRevisions: js.UndefOr[ArtifactRevisionList] = js.undefined,
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined,
        pipelineName: js.UndefOr[PipelineName] = js.undefined,
        pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined,
        status: js.UndefOr[PipelineExecutionStatus] = js.undefined
    ): PipelineExecution = {
      val __obj = js.Dynamic.literal()
      artifactRevisions.foreach(__v => __obj.updateDynamic("artifactRevisions")(__v.asInstanceOf[js.Any]))
      pipelineExecutionId.foreach(__v => __obj.updateDynamic("pipelineExecutionId")(__v.asInstanceOf[js.Any]))
      pipelineName.foreach(__v => __obj.updateDynamic("pipelineName")(__v.asInstanceOf[js.Any]))
      pipelineVersion.foreach(__v => __obj.updateDynamic("pipelineVersion")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineExecution]
    }
  }

  @js.native
  sealed trait PipelineExecutionStatus extends js.Any
  object PipelineExecutionStatus {
    val InProgress = "InProgress".asInstanceOf[PipelineExecutionStatus]
    val Stopped = "Stopped".asInstanceOf[PipelineExecutionStatus]
    val Stopping = "Stopping".asInstanceOf[PipelineExecutionStatus]
    val Succeeded = "Succeeded".asInstanceOf[PipelineExecutionStatus]
    val Superseded = "Superseded".asInstanceOf[PipelineExecutionStatus]
    val Failed = "Failed".asInstanceOf[PipelineExecutionStatus]

    @inline def values = js.Array(InProgress, Stopped, Stopping, Succeeded, Superseded, Failed)
  }

  /** Summary information about a pipeline execution.
    */
  @js.native
  trait PipelineExecutionSummary extends js.Object {
    var lastUpdateTime: js.UndefOr[Timestamp]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
    var sourceRevisions: js.UndefOr[SourceRevisionList]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[PipelineExecutionStatus]
    var stopTrigger: js.UndefOr[StopExecutionTrigger]
    var trigger: js.UndefOr[ExecutionTrigger]
  }

  object PipelineExecutionSummary {
    @inline
    def apply(
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined,
        sourceRevisions: js.UndefOr[SourceRevisionList] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[PipelineExecutionStatus] = js.undefined,
        stopTrigger: js.UndefOr[StopExecutionTrigger] = js.undefined,
        trigger: js.UndefOr[ExecutionTrigger] = js.undefined
    ): PipelineExecutionSummary = {
      val __obj = js.Dynamic.literal()
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      pipelineExecutionId.foreach(__v => __obj.updateDynamic("pipelineExecutionId")(__v.asInstanceOf[js.Any]))
      sourceRevisions.foreach(__v => __obj.updateDynamic("sourceRevisions")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      stopTrigger.foreach(__v => __obj.updateDynamic("stopTrigger")(__v.asInstanceOf[js.Any]))
      trigger.foreach(__v => __obj.updateDynamic("trigger")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineExecutionSummary]
    }
  }

  /** Information about a pipeline.
    */
  @js.native
  trait PipelineMetadata extends js.Object {
    var created: js.UndefOr[Timestamp]
    var pipelineArn: js.UndefOr[PipelineArn]
    var updated: js.UndefOr[Timestamp]
  }

  object PipelineMetadata {
    @inline
    def apply(
        created: js.UndefOr[Timestamp] = js.undefined,
        pipelineArn: js.UndefOr[PipelineArn] = js.undefined,
        updated: js.UndefOr[Timestamp] = js.undefined
    ): PipelineMetadata = {
      val __obj = js.Dynamic.literal()
      created.foreach(__v => __obj.updateDynamic("created")(__v.asInstanceOf[js.Any]))
      pipelineArn.foreach(__v => __obj.updateDynamic("pipelineArn")(__v.asInstanceOf[js.Any]))
      updated.foreach(__v => __obj.updateDynamic("updated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineMetadata]
    }
  }

  /** Returns a summary of a pipeline.
    */
  @js.native
  trait PipelineSummary extends js.Object {
    var created: js.UndefOr[Timestamp]
    var name: js.UndefOr[PipelineName]
    var updated: js.UndefOr[Timestamp]
    var version: js.UndefOr[PipelineVersion]
  }

  object PipelineSummary {
    @inline
    def apply(
        created: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[PipelineName] = js.undefined,
        updated: js.UndefOr[Timestamp] = js.undefined,
        version: js.UndefOr[PipelineVersion] = js.undefined
    ): PipelineSummary = {
      val __obj = js.Dynamic.literal()
      created.foreach(__v => __obj.updateDynamic("created")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      updated.foreach(__v => __obj.updateDynamic("updated")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineSummary]
    }
  }

  /** Represents the input of a <code>PollForJobs</code> action.
    */
  @js.native
  trait PollForJobsInput extends js.Object {
    var actionTypeId: ActionTypeId
    var maxBatchSize: js.UndefOr[MaxBatchSize]
    var queryParam: js.UndefOr[QueryParamMap]
  }

  object PollForJobsInput {
    @inline
    def apply(
        actionTypeId: ActionTypeId,
        maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined,
        queryParam: js.UndefOr[QueryParamMap] = js.undefined
    ): PollForJobsInput = {
      val __obj = js.Dynamic.literal(
        "actionTypeId" -> actionTypeId.asInstanceOf[js.Any]
      )

      maxBatchSize.foreach(__v => __obj.updateDynamic("maxBatchSize")(__v.asInstanceOf[js.Any]))
      queryParam.foreach(__v => __obj.updateDynamic("queryParam")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PollForJobsInput]
    }
  }

  /** Represents the output of a <code>PollForJobs</code> action.
    */
  @js.native
  trait PollForJobsOutput extends js.Object {
    var jobs: js.UndefOr[JobList]
  }

  object PollForJobsOutput {
    @inline
    def apply(
        jobs: js.UndefOr[JobList] = js.undefined
    ): PollForJobsOutput = {
      val __obj = js.Dynamic.literal()
      jobs.foreach(__v => __obj.updateDynamic("jobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PollForJobsOutput]
    }
  }

  /** Represents the input of a <code>PollForThirdPartyJobs</code> action.
    */
  @js.native
  trait PollForThirdPartyJobsInput extends js.Object {
    var actionTypeId: ActionTypeId
    var maxBatchSize: js.UndefOr[MaxBatchSize]
  }

  object PollForThirdPartyJobsInput {
    @inline
    def apply(
        actionTypeId: ActionTypeId,
        maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined
    ): PollForThirdPartyJobsInput = {
      val __obj = js.Dynamic.literal(
        "actionTypeId" -> actionTypeId.asInstanceOf[js.Any]
      )

      maxBatchSize.foreach(__v => __obj.updateDynamic("maxBatchSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PollForThirdPartyJobsInput]
    }
  }

  /** Represents the output of a <code>PollForThirdPartyJobs</code> action.
    */
  @js.native
  trait PollForThirdPartyJobsOutput extends js.Object {
    var jobs: js.UndefOr[ThirdPartyJobList]
  }

  object PollForThirdPartyJobsOutput {
    @inline
    def apply(
        jobs: js.UndefOr[ThirdPartyJobList] = js.undefined
    ): PollForThirdPartyJobsOutput = {
      val __obj = js.Dynamic.literal()
      jobs.foreach(__v => __obj.updateDynamic("jobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PollForThirdPartyJobsOutput]
    }
  }

  /** Represents the input of a <code>PutActionRevision</code> action.
    */
  @js.native
  trait PutActionRevisionInput extends js.Object {
    var actionName: ActionName
    var actionRevision: ActionRevision
    var pipelineName: PipelineName
    var stageName: StageName
  }

  object PutActionRevisionInput {
    @inline
    def apply(
        actionName: ActionName,
        actionRevision: ActionRevision,
        pipelineName: PipelineName,
        stageName: StageName
    ): PutActionRevisionInput = {
      val __obj = js.Dynamic.literal(
        "actionName" -> actionName.asInstanceOf[js.Any],
        "actionRevision" -> actionRevision.asInstanceOf[js.Any],
        "pipelineName" -> pipelineName.asInstanceOf[js.Any],
        "stageName" -> stageName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutActionRevisionInput]
    }
  }

  /** Represents the output of a <code>PutActionRevision</code> action.
    */
  @js.native
  trait PutActionRevisionOutput extends js.Object {
    var newRevision: js.UndefOr[Boolean]
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  object PutActionRevisionOutput {
    @inline
    def apply(
        newRevision: js.UndefOr[Boolean] = js.undefined,
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
    ): PutActionRevisionOutput = {
      val __obj = js.Dynamic.literal()
      newRevision.foreach(__v => __obj.updateDynamic("newRevision")(__v.asInstanceOf[js.Any]))
      pipelineExecutionId.foreach(__v => __obj.updateDynamic("pipelineExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutActionRevisionOutput]
    }
  }

  /** Represents the input of a <code>PutApprovalResult</code> action.
    */
  @js.native
  trait PutApprovalResultInput extends js.Object {
    var actionName: ActionName
    var pipelineName: PipelineName
    var result: ApprovalResult
    var stageName: StageName
    var token: ApprovalToken
  }

  object PutApprovalResultInput {
    @inline
    def apply(
        actionName: ActionName,
        pipelineName: PipelineName,
        result: ApprovalResult,
        stageName: StageName,
        token: ApprovalToken
    ): PutApprovalResultInput = {
      val __obj = js.Dynamic.literal(
        "actionName" -> actionName.asInstanceOf[js.Any],
        "pipelineName" -> pipelineName.asInstanceOf[js.Any],
        "result" -> result.asInstanceOf[js.Any],
        "stageName" -> stageName.asInstanceOf[js.Any],
        "token" -> token.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutApprovalResultInput]
    }
  }

  /** Represents the output of a <code>PutApprovalResult</code> action.
    */
  @js.native
  trait PutApprovalResultOutput extends js.Object {
    var approvedAt: js.UndefOr[Timestamp]
  }

  object PutApprovalResultOutput {
    @inline
    def apply(
        approvedAt: js.UndefOr[Timestamp] = js.undefined
    ): PutApprovalResultOutput = {
      val __obj = js.Dynamic.literal()
      approvedAt.foreach(__v => __obj.updateDynamic("approvedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutApprovalResultOutput]
    }
  }

  /** Represents the input of a <code>PutJobFailureResult</code> action.
    */
  @js.native
  trait PutJobFailureResultInput extends js.Object {
    var failureDetails: FailureDetails
    var jobId: JobId
  }

  object PutJobFailureResultInput {
    @inline
    def apply(
        failureDetails: FailureDetails,
        jobId: JobId
    ): PutJobFailureResultInput = {
      val __obj = js.Dynamic.literal(
        "failureDetails" -> failureDetails.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutJobFailureResultInput]
    }
  }

  /** Represents the input of a <code>PutJobSuccessResult</code> action.
    */
  @js.native
  trait PutJobSuccessResultInput extends js.Object {
    var jobId: JobId
    var continuationToken: js.UndefOr[ContinuationToken]
    var currentRevision: js.UndefOr[CurrentRevision]
    var executionDetails: js.UndefOr[ExecutionDetails]
    var outputVariables: js.UndefOr[OutputVariablesMap]
  }

  object PutJobSuccessResultInput {
    @inline
    def apply(
        jobId: JobId,
        continuationToken: js.UndefOr[ContinuationToken] = js.undefined,
        currentRevision: js.UndefOr[CurrentRevision] = js.undefined,
        executionDetails: js.UndefOr[ExecutionDetails] = js.undefined,
        outputVariables: js.UndefOr[OutputVariablesMap] = js.undefined
    ): PutJobSuccessResultInput = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      continuationToken.foreach(__v => __obj.updateDynamic("continuationToken")(__v.asInstanceOf[js.Any]))
      currentRevision.foreach(__v => __obj.updateDynamic("currentRevision")(__v.asInstanceOf[js.Any]))
      executionDetails.foreach(__v => __obj.updateDynamic("executionDetails")(__v.asInstanceOf[js.Any]))
      outputVariables.foreach(__v => __obj.updateDynamic("outputVariables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutJobSuccessResultInput]
    }
  }

  /** Represents the input of a <code>PutThirdPartyJobFailureResult</code> action.
    */
  @js.native
  trait PutThirdPartyJobFailureResultInput extends js.Object {
    var clientToken: ClientToken
    var failureDetails: FailureDetails
    var jobId: ThirdPartyJobId
  }

  object PutThirdPartyJobFailureResultInput {
    @inline
    def apply(
        clientToken: ClientToken,
        failureDetails: FailureDetails,
        jobId: ThirdPartyJobId
    ): PutThirdPartyJobFailureResultInput = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "failureDetails" -> failureDetails.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutThirdPartyJobFailureResultInput]
    }
  }

  /** Represents the input of a <code>PutThirdPartyJobSuccessResult</code> action.
    */
  @js.native
  trait PutThirdPartyJobSuccessResultInput extends js.Object {
    var clientToken: ClientToken
    var jobId: ThirdPartyJobId
    var continuationToken: js.UndefOr[ContinuationToken]
    var currentRevision: js.UndefOr[CurrentRevision]
    var executionDetails: js.UndefOr[ExecutionDetails]
  }

  object PutThirdPartyJobSuccessResultInput {
    @inline
    def apply(
        clientToken: ClientToken,
        jobId: ThirdPartyJobId,
        continuationToken: js.UndefOr[ContinuationToken] = js.undefined,
        currentRevision: js.UndefOr[CurrentRevision] = js.undefined,
        executionDetails: js.UndefOr[ExecutionDetails] = js.undefined
    ): PutThirdPartyJobSuccessResultInput = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      continuationToken.foreach(__v => __obj.updateDynamic("continuationToken")(__v.asInstanceOf[js.Any]))
      currentRevision.foreach(__v => __obj.updateDynamic("currentRevision")(__v.asInstanceOf[js.Any]))
      executionDetails.foreach(__v => __obj.updateDynamic("executionDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutThirdPartyJobSuccessResultInput]
    }
  }

  @js.native
  trait PutWebhookInput extends js.Object {
    var webhook: WebhookDefinition
    var tags: js.UndefOr[TagList]
  }

  object PutWebhookInput {
    @inline
    def apply(
        webhook: WebhookDefinition,
        tags: js.UndefOr[TagList] = js.undefined
    ): PutWebhookInput = {
      val __obj = js.Dynamic.literal(
        "webhook" -> webhook.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutWebhookInput]
    }
  }

  @js.native
  trait PutWebhookOutput extends js.Object {
    var webhook: js.UndefOr[ListWebhookItem]
  }

  object PutWebhookOutput {
    @inline
    def apply(
        webhook: js.UndefOr[ListWebhookItem] = js.undefined
    ): PutWebhookOutput = {
      val __obj = js.Dynamic.literal()
      webhook.foreach(__v => __obj.updateDynamic("webhook")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutWebhookOutput]
    }
  }

  @js.native
  trait RegisterWebhookWithThirdPartyInput extends js.Object {
    var webhookName: js.UndefOr[WebhookName]
  }

  object RegisterWebhookWithThirdPartyInput {
    @inline
    def apply(
        webhookName: js.UndefOr[WebhookName] = js.undefined
    ): RegisterWebhookWithThirdPartyInput = {
      val __obj = js.Dynamic.literal()
      webhookName.foreach(__v => __obj.updateDynamic("webhookName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterWebhookWithThirdPartyInput]
    }
  }

  @js.native
  trait RegisterWebhookWithThirdPartyOutput extends js.Object

  object RegisterWebhookWithThirdPartyOutput {
    @inline
    def apply(): RegisterWebhookWithThirdPartyOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterWebhookWithThirdPartyOutput]
    }
  }

  /** Represents the input of a <code>RetryStageExecution</code> action.
    */
  @js.native
  trait RetryStageExecutionInput extends js.Object {
    var pipelineExecutionId: PipelineExecutionId
    var pipelineName: PipelineName
    var retryMode: StageRetryMode
    var stageName: StageName
  }

  object RetryStageExecutionInput {
    @inline
    def apply(
        pipelineExecutionId: PipelineExecutionId,
        pipelineName: PipelineName,
        retryMode: StageRetryMode,
        stageName: StageName
    ): RetryStageExecutionInput = {
      val __obj = js.Dynamic.literal(
        "pipelineExecutionId" -> pipelineExecutionId.asInstanceOf[js.Any],
        "pipelineName" -> pipelineName.asInstanceOf[js.Any],
        "retryMode" -> retryMode.asInstanceOf[js.Any],
        "stageName" -> stageName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RetryStageExecutionInput]
    }
  }

  /** Represents the output of a <code>RetryStageExecution</code> action.
    */
  @js.native
  trait RetryStageExecutionOutput extends js.Object {
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  object RetryStageExecutionOutput {
    @inline
    def apply(
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
    ): RetryStageExecutionOutput = {
      val __obj = js.Dynamic.literal()
      pipelineExecutionId.foreach(__v => __obj.updateDynamic("pipelineExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetryStageExecutionOutput]
    }
  }

  /** The location of the S3 bucket that contains a revision.
    */
  @js.native
  trait S3ArtifactLocation extends js.Object {
    var bucketName: S3BucketName
    var objectKey: S3ObjectKey
  }

  object S3ArtifactLocation {
    @inline
    def apply(
        bucketName: S3BucketName,
        objectKey: S3ObjectKey
    ): S3ArtifactLocation = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "objectKey" -> objectKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3ArtifactLocation]
    }
  }

  /** The Amazon S3 artifact location for an action's artifacts.
    */
  @js.native
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[S3Bucket]
    var key: js.UndefOr[S3Key]
  }

  object S3Location {
    @inline
    def apply(
        bucket: js.UndefOr[S3Bucket] = js.undefined,
        key: js.UndefOr[S3Key] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /** Information about the version (or revision) of a source artifact that initiated a pipeline execution.
    */
  @js.native
  trait SourceRevision extends js.Object {
    var actionName: ActionName
    var revisionId: js.UndefOr[Revision]
    var revisionSummary: js.UndefOr[RevisionSummary]
    var revisionUrl: js.UndefOr[Url]
  }

  object SourceRevision {
    @inline
    def apply(
        actionName: ActionName,
        revisionId: js.UndefOr[Revision] = js.undefined,
        revisionSummary: js.UndefOr[RevisionSummary] = js.undefined,
        revisionUrl: js.UndefOr[Url] = js.undefined
    ): SourceRevision = {
      val __obj = js.Dynamic.literal(
        "actionName" -> actionName.asInstanceOf[js.Any]
      )

      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      revisionSummary.foreach(__v => __obj.updateDynamic("revisionSummary")(__v.asInstanceOf[js.Any]))
      revisionUrl.foreach(__v => __obj.updateDynamic("revisionUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceRevision]
    }
  }

  /** Represents information about a stage to a job worker.
    */
  @js.native
  trait StageContext extends js.Object {
    var name: js.UndefOr[StageName]
  }

  object StageContext {
    @inline
    def apply(
        name: js.UndefOr[StageName] = js.undefined
    ): StageContext = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StageContext]
    }
  }

  /** Represents information about a stage and its definition.
    */
  @js.native
  trait StageDeclaration extends js.Object {
    var actions: StageActionDeclarationList
    var name: StageName
    var blockers: js.UndefOr[StageBlockerDeclarationList]
  }

  object StageDeclaration {
    @inline
    def apply(
        actions: StageActionDeclarationList,
        name: StageName,
        blockers: js.UndefOr[StageBlockerDeclarationList] = js.undefined
    ): StageDeclaration = {
      val __obj = js.Dynamic.literal(
        "actions" -> actions.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      blockers.foreach(__v => __obj.updateDynamic("blockers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StageDeclaration]
    }
  }

  /** Represents information about the run of a stage.
    */
  @js.native
  trait StageExecution extends js.Object {
    var pipelineExecutionId: PipelineExecutionId
    var status: StageExecutionStatus
  }

  object StageExecution {
    @inline
    def apply(
        pipelineExecutionId: PipelineExecutionId,
        status: StageExecutionStatus
    ): StageExecution = {
      val __obj = js.Dynamic.literal(
        "pipelineExecutionId" -> pipelineExecutionId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StageExecution]
    }
  }

  @js.native
  sealed trait StageExecutionStatus extends js.Any
  object StageExecutionStatus {
    val InProgress = "InProgress".asInstanceOf[StageExecutionStatus]
    val Failed = "Failed".asInstanceOf[StageExecutionStatus]
    val Stopped = "Stopped".asInstanceOf[StageExecutionStatus]
    val Stopping = "Stopping".asInstanceOf[StageExecutionStatus]
    val Succeeded = "Succeeded".asInstanceOf[StageExecutionStatus]

    @inline def values = js.Array(InProgress, Failed, Stopped, Stopping, Succeeded)
  }

  @js.native
  sealed trait StageRetryMode extends js.Any
  object StageRetryMode {
    val FAILED_ACTIONS = "FAILED_ACTIONS".asInstanceOf[StageRetryMode]

    @inline def values = js.Array(FAILED_ACTIONS)
  }

  /** Represents information about the state of the stage.
    */
  @js.native
  trait StageState extends js.Object {
    var actionStates: js.UndefOr[ActionStateList]
    var inboundTransitionState: js.UndefOr[TransitionState]
    var latestExecution: js.UndefOr[StageExecution]
    var stageName: js.UndefOr[StageName]
  }

  object StageState {
    @inline
    def apply(
        actionStates: js.UndefOr[ActionStateList] = js.undefined,
        inboundTransitionState: js.UndefOr[TransitionState] = js.undefined,
        latestExecution: js.UndefOr[StageExecution] = js.undefined,
        stageName: js.UndefOr[StageName] = js.undefined
    ): StageState = {
      val __obj = js.Dynamic.literal()
      actionStates.foreach(__v => __obj.updateDynamic("actionStates")(__v.asInstanceOf[js.Any]))
      inboundTransitionState.foreach(__v => __obj.updateDynamic("inboundTransitionState")(__v.asInstanceOf[js.Any]))
      latestExecution.foreach(__v => __obj.updateDynamic("latestExecution")(__v.asInstanceOf[js.Any]))
      stageName.foreach(__v => __obj.updateDynamic("stageName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StageState]
    }
  }

  @js.native
  sealed trait StageTransitionType extends js.Any
  object StageTransitionType {
    val Inbound = "Inbound".asInstanceOf[StageTransitionType]
    val Outbound = "Outbound".asInstanceOf[StageTransitionType]

    @inline def values = js.Array(Inbound, Outbound)
  }

  /** Represents the input of a <code>StartPipelineExecution</code> action.
    */
  @js.native
  trait StartPipelineExecutionInput extends js.Object {
    var name: PipelineName
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object StartPipelineExecutionInput {
    @inline
    def apply(
        name: PipelineName,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): StartPipelineExecutionInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPipelineExecutionInput]
    }
  }

  /** Represents the output of a <code>StartPipelineExecution</code> action.
    */
  @js.native
  trait StartPipelineExecutionOutput extends js.Object {
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  object StartPipelineExecutionOutput {
    @inline
    def apply(
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
    ): StartPipelineExecutionOutput = {
      val __obj = js.Dynamic.literal()
      pipelineExecutionId.foreach(__v => __obj.updateDynamic("pipelineExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPipelineExecutionOutput]
    }
  }

  /** The interaction that stopped a pipeline execution.
    */
  @js.native
  trait StopExecutionTrigger extends js.Object {
    var reason: js.UndefOr[StopPipelineExecutionReason]
  }

  object StopExecutionTrigger {
    @inline
    def apply(
        reason: js.UndefOr[StopPipelineExecutionReason] = js.undefined
    ): StopExecutionTrigger = {
      val __obj = js.Dynamic.literal()
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopExecutionTrigger]
    }
  }

  @js.native
  trait StopPipelineExecutionInput extends js.Object {
    var pipelineExecutionId: PipelineExecutionId
    var pipelineName: PipelineName
    var abandon: js.UndefOr[Boolean]
    var reason: js.UndefOr[StopPipelineExecutionReason]
  }

  object StopPipelineExecutionInput {
    @inline
    def apply(
        pipelineExecutionId: PipelineExecutionId,
        pipelineName: PipelineName,
        abandon: js.UndefOr[Boolean] = js.undefined,
        reason: js.UndefOr[StopPipelineExecutionReason] = js.undefined
    ): StopPipelineExecutionInput = {
      val __obj = js.Dynamic.literal(
        "pipelineExecutionId" -> pipelineExecutionId.asInstanceOf[js.Any],
        "pipelineName" -> pipelineName.asInstanceOf[js.Any]
      )

      abandon.foreach(__v => __obj.updateDynamic("abandon")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopPipelineExecutionInput]
    }
  }

  @js.native
  trait StopPipelineExecutionOutput extends js.Object {
    var pipelineExecutionId: js.UndefOr[PipelineExecutionId]
  }

  object StopPipelineExecutionOutput {
    @inline
    def apply(
        pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
    ): StopPipelineExecutionOutput = {
      val __obj = js.Dynamic.literal()
      pipelineExecutionId.foreach(__v => __obj.updateDynamic("pipelineExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopPipelineExecutionOutput]
    }
  }

  /** A tag is a key-value pair that is used to manage the resource.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    @inline
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  object TagResourceInput {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  /** A response to a <code>PollForThirdPartyJobs</code> request returned by AWS CodePipeline when there is a job to be worked on by a partner action.
    */
  @js.native
  trait ThirdPartyJob extends js.Object {
    var clientId: js.UndefOr[ClientId]
    var jobId: js.UndefOr[JobId]
  }

  object ThirdPartyJob {
    @inline
    def apply(
        clientId: js.UndefOr[ClientId] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined
    ): ThirdPartyJob = {
      val __obj = js.Dynamic.literal()
      clientId.foreach(__v => __obj.updateDynamic("clientId")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThirdPartyJob]
    }
  }

  /** Represents information about the job data for a partner action.
    */
  @js.native
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

  object ThirdPartyJobData {
    @inline
    def apply(
        actionConfiguration: js.UndefOr[ActionConfiguration] = js.undefined,
        actionTypeId: js.UndefOr[ActionTypeId] = js.undefined,
        artifactCredentials: js.UndefOr[AWSSessionCredentials] = js.undefined,
        continuationToken: js.UndefOr[ContinuationToken] = js.undefined,
        encryptionKey: js.UndefOr[EncryptionKey] = js.undefined,
        inputArtifacts: js.UndefOr[ArtifactList] = js.undefined,
        outputArtifacts: js.UndefOr[ArtifactList] = js.undefined,
        pipelineContext: js.UndefOr[PipelineContext] = js.undefined
    ): ThirdPartyJobData = {
      val __obj = js.Dynamic.literal()
      actionConfiguration.foreach(__v => __obj.updateDynamic("actionConfiguration")(__v.asInstanceOf[js.Any]))
      actionTypeId.foreach(__v => __obj.updateDynamic("actionTypeId")(__v.asInstanceOf[js.Any]))
      artifactCredentials.foreach(__v => __obj.updateDynamic("artifactCredentials")(__v.asInstanceOf[js.Any]))
      continuationToken.foreach(__v => __obj.updateDynamic("continuationToken")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      inputArtifacts.foreach(__v => __obj.updateDynamic("inputArtifacts")(__v.asInstanceOf[js.Any]))
      outputArtifacts.foreach(__v => __obj.updateDynamic("outputArtifacts")(__v.asInstanceOf[js.Any]))
      pipelineContext.foreach(__v => __obj.updateDynamic("pipelineContext")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThirdPartyJobData]
    }
  }

  /** The details of a job sent in response to a <code>GetThirdPartyJobDetails</code> request.
    */
  @js.native
  trait ThirdPartyJobDetails extends js.Object {
    var data: js.UndefOr[ThirdPartyJobData]
    var id: js.UndefOr[ThirdPartyJobId]
    var nonce: js.UndefOr[Nonce]
  }

  object ThirdPartyJobDetails {
    @inline
    def apply(
        data: js.UndefOr[ThirdPartyJobData] = js.undefined,
        id: js.UndefOr[ThirdPartyJobId] = js.undefined,
        nonce: js.UndefOr[Nonce] = js.undefined
    ): ThirdPartyJobDetails = {
      val __obj = js.Dynamic.literal()
      data.foreach(__v => __obj.updateDynamic("data")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      nonce.foreach(__v => __obj.updateDynamic("nonce")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThirdPartyJobDetails]
    }
  }

  /** Represents information about the state of transitions between one stage and another stage.
    */
  @js.native
  trait TransitionState extends js.Object {
    var disabledReason: js.UndefOr[DisabledReason]
    var enabled: js.UndefOr[Enabled]
    var lastChangedAt: js.UndefOr[LastChangedAt]
    var lastChangedBy: js.UndefOr[LastChangedBy]
  }

  object TransitionState {
    @inline
    def apply(
        disabledReason: js.UndefOr[DisabledReason] = js.undefined,
        enabled: js.UndefOr[Enabled] = js.undefined,
        lastChangedAt: js.UndefOr[LastChangedAt] = js.undefined,
        lastChangedBy: js.UndefOr[LastChangedBy] = js.undefined
    ): TransitionState = {
      val __obj = js.Dynamic.literal()
      disabledReason.foreach(__v => __obj.updateDynamic("disabledReason")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      lastChangedAt.foreach(__v => __obj.updateDynamic("lastChangedAt")(__v.asInstanceOf[js.Any]))
      lastChangedBy.foreach(__v => __obj.updateDynamic("lastChangedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransitionState]
    }
  }

  @js.native
  sealed trait TriggerType extends js.Any
  object TriggerType {
    val CreatePipeline = "CreatePipeline".asInstanceOf[TriggerType]
    val StartPipelineExecution = "StartPipelineExecution".asInstanceOf[TriggerType]
    val PollForSourceChanges = "PollForSourceChanges".asInstanceOf[TriggerType]
    val Webhook = "Webhook".asInstanceOf[TriggerType]
    val CloudWatchEvent = "CloudWatchEvent".asInstanceOf[TriggerType]
    val PutActionRevision = "PutActionRevision".asInstanceOf[TriggerType]

    @inline def values = js.Array(CreatePipeline, StartPipelineExecution, PollForSourceChanges, Webhook, CloudWatchEvent, PutActionRevision)
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  /** Represents the input of an <code>UpdatePipeline</code> action.
    */
  @js.native
  trait UpdatePipelineInput extends js.Object {
    var pipeline: PipelineDeclaration
  }

  object UpdatePipelineInput {
    @inline
    def apply(
        pipeline: PipelineDeclaration
    ): UpdatePipelineInput = {
      val __obj = js.Dynamic.literal(
        "pipeline" -> pipeline.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePipelineInput]
    }
  }

  /** Represents the output of an <code>UpdatePipeline</code> action.
    */
  @js.native
  trait UpdatePipelineOutput extends js.Object {
    var pipeline: js.UndefOr[PipelineDeclaration]
  }

  object UpdatePipelineOutput {
    @inline
    def apply(
        pipeline: js.UndefOr[PipelineDeclaration] = js.undefined
    ): UpdatePipelineOutput = {
      val __obj = js.Dynamic.literal()
      pipeline.foreach(__v => __obj.updateDynamic("pipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePipelineOutput]
    }
  }

  /** The authentication applied to incoming webhook trigger requests.
    */
  @js.native
  trait WebhookAuthConfiguration extends js.Object {
    var AllowedIPRange: js.UndefOr[WebhookAuthConfigurationAllowedIPRange]
    var SecretToken: js.UndefOr[WebhookAuthConfigurationSecretToken]
  }

  object WebhookAuthConfiguration {
    @inline
    def apply(
        AllowedIPRange: js.UndefOr[WebhookAuthConfigurationAllowedIPRange] = js.undefined,
        SecretToken: js.UndefOr[WebhookAuthConfigurationSecretToken] = js.undefined
    ): WebhookAuthConfiguration = {
      val __obj = js.Dynamic.literal()
      AllowedIPRange.foreach(__v => __obj.updateDynamic("AllowedIPRange")(__v.asInstanceOf[js.Any]))
      SecretToken.foreach(__v => __obj.updateDynamic("SecretToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebhookAuthConfiguration]
    }
  }

  @js.native
  sealed trait WebhookAuthenticationType extends js.Any
  object WebhookAuthenticationType {
    val GITHUB_HMAC = "GITHUB_HMAC".asInstanceOf[WebhookAuthenticationType]
    val IP = "IP".asInstanceOf[WebhookAuthenticationType]
    val UNAUTHENTICATED = "UNAUTHENTICATED".asInstanceOf[WebhookAuthenticationType]

    @inline def values = js.Array(GITHUB_HMAC, IP, UNAUTHENTICATED)
  }

  /** Represents information about a webhook and its definition.
    */
  @js.native
  trait WebhookDefinition extends js.Object {
    var authentication: WebhookAuthenticationType
    var authenticationConfiguration: WebhookAuthConfiguration
    var filters: WebhookFilters
    var name: WebhookName
    var targetAction: ActionName
    var targetPipeline: PipelineName
  }

  object WebhookDefinition {
    @inline
    def apply(
        authentication: WebhookAuthenticationType,
        authenticationConfiguration: WebhookAuthConfiguration,
        filters: WebhookFilters,
        name: WebhookName,
        targetAction: ActionName,
        targetPipeline: PipelineName
    ): WebhookDefinition = {
      val __obj = js.Dynamic.literal(
        "authentication" -> authentication.asInstanceOf[js.Any],
        "authenticationConfiguration" -> authenticationConfiguration.asInstanceOf[js.Any],
        "filters" -> filters.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "targetAction" -> targetAction.asInstanceOf[js.Any],
        "targetPipeline" -> targetPipeline.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WebhookDefinition]
    }
  }

  /** The event criteria that specify when a webhook notification is sent to your URL.
    */
  @js.native
  trait WebhookFilterRule extends js.Object {
    var jsonPath: JsonPath
    var matchEquals: js.UndefOr[MatchEquals]
  }

  object WebhookFilterRule {
    @inline
    def apply(
        jsonPath: JsonPath,
        matchEquals: js.UndefOr[MatchEquals] = js.undefined
    ): WebhookFilterRule = {
      val __obj = js.Dynamic.literal(
        "jsonPath" -> jsonPath.asInstanceOf[js.Any]
      )

      matchEquals.foreach(__v => __obj.updateDynamic("matchEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebhookFilterRule]
    }
  }
}
