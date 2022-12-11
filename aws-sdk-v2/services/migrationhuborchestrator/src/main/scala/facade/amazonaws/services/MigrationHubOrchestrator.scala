package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object migrationhuborchestrator {
  type ApplicationConfigurationName = String
  type CreateMigrationWorkflowRequestApplicationConfigurationIdString = String
  type CreateMigrationWorkflowRequestDescriptionString = String
  type CreateMigrationWorkflowRequestNameString = String
  type CreateMigrationWorkflowRequestTemplateIdString = String
  type GetWorkflowStepResponseOutputsList = js.Array[WorkflowStepOutput]
  type IPAddress = String
  type MaxResults = Int
  type MigrationWorkflowDescription = String
  type MigrationWorkflowId = String
  type MigrationWorkflowName = String
  type MigrationWorkflowSummaryList = js.Array[MigrationWorkflowSummary]
  type NextToken = String
  type PluginId = String
  type PluginSummaries = js.Array[PluginSummary]
  type PluginVersion = String
  type ResourceArn = String
  type S3Bucket = String
  type S3Key = String
  type StepDescription = String
  type StepGroupDescription = String
  type StepGroupId = String
  type StepGroupName = String
  type StepId = String
  type StepInputParameters = js.Dictionary[StepInput]
  type StepInputParametersKey = String
  type StepName = String
  type StepOutputList = js.Array[StepOutput]
  type StringList = js.Array[StringListMember]
  type StringListMember = String
  type StringMap = js.Dictionary[StringMapValue]
  type StringMapKey = String
  type StringMapValue = String
  type StringValue = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TemplateId = String
  type TemplateInputList = js.Array[TemplateInput]
  type TemplateInputName = String
  type TemplateName = String
  type TemplateStepGroupSummaryList = js.Array[TemplateStepGroupSummary]
  type TemplateStepSummaryList = js.Array[TemplateStepSummary]
  type TemplateSummaryList = js.Array[TemplateSummary]
  type Timestamp = js.Date
  type ToolsList = js.Array[Tool]
  type UpdateMigrationWorkflowRequestDescriptionString = String
  type UpdateMigrationWorkflowRequestNameString = String
  type WorkflowStepGroupsSummaryList = js.Array[WorkflowStepGroupSummary]
  type WorkflowStepOutputList = js.Array[WorkflowStepOutput]
  type WorkflowStepOutputName = String
  type WorkflowStepsSummaryList = js.Array[WorkflowStepSummary]

  final class MigrationHubOrchestratorOps(private val service: MigrationHubOrchestrator) extends AnyVal {

    @inline def createWorkflowFuture(params: CreateMigrationWorkflowRequest): Future[CreateMigrationWorkflowResponse] = service.createWorkflow(params).promise().toFuture
    @inline def createWorkflowStepFuture(params: CreateWorkflowStepRequest): Future[CreateWorkflowStepResponse] = service.createWorkflowStep(params).promise().toFuture
    @inline def createWorkflowStepGroupFuture(params: CreateWorkflowStepGroupRequest): Future[CreateWorkflowStepGroupResponse] = service.createWorkflowStepGroup(params).promise().toFuture
    @inline def deleteWorkflowFuture(params: DeleteMigrationWorkflowRequest): Future[DeleteMigrationWorkflowResponse] = service.deleteWorkflow(params).promise().toFuture
    @inline def deleteWorkflowStepFuture(params: DeleteWorkflowStepRequest): Future[DeleteWorkflowStepResponse] = service.deleteWorkflowStep(params).promise().toFuture
    @inline def deleteWorkflowStepGroupFuture(params: DeleteWorkflowStepGroupRequest): Future[DeleteWorkflowStepGroupResponse] = service.deleteWorkflowStepGroup(params).promise().toFuture
    @inline def getTemplateFuture(params: GetMigrationWorkflowTemplateRequest): Future[GetMigrationWorkflowTemplateResponse] = service.getTemplate(params).promise().toFuture
    @inline def getTemplateStepFuture(params: GetTemplateStepRequest): Future[GetTemplateStepResponse] = service.getTemplateStep(params).promise().toFuture
    @inline def getTemplateStepGroupFuture(params: GetTemplateStepGroupRequest): Future[GetTemplateStepGroupResponse] = service.getTemplateStepGroup(params).promise().toFuture
    @inline def getWorkflowFuture(params: GetMigrationWorkflowRequest): Future[GetMigrationWorkflowResponse] = service.getWorkflow(params).promise().toFuture
    @inline def getWorkflowStepFuture(params: GetWorkflowStepRequest): Future[GetWorkflowStepResponse] = service.getWorkflowStep(params).promise().toFuture
    @inline def getWorkflowStepGroupFuture(params: GetWorkflowStepGroupRequest): Future[GetWorkflowStepGroupResponse] = service.getWorkflowStepGroup(params).promise().toFuture
    @inline def listPluginsFuture(params: ListPluginsRequest): Future[ListPluginsResponse] = service.listPlugins(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTemplateStepGroupsFuture(params: ListTemplateStepGroupsRequest): Future[ListTemplateStepGroupsResponse] = service.listTemplateStepGroups(params).promise().toFuture
    @inline def listTemplateStepsFuture(params: ListTemplateStepsRequest): Future[ListTemplateStepsResponse] = service.listTemplateSteps(params).promise().toFuture
    @inline def listTemplatesFuture(params: ListMigrationWorkflowTemplatesRequest): Future[ListMigrationWorkflowTemplatesResponse] = service.listTemplates(params).promise().toFuture
    @inline def listWorkflowStepGroupsFuture(params: ListWorkflowStepGroupsRequest): Future[ListWorkflowStepGroupsResponse] = service.listWorkflowStepGroups(params).promise().toFuture
    @inline def listWorkflowStepsFuture(params: ListWorkflowStepsRequest): Future[ListWorkflowStepsResponse] = service.listWorkflowSteps(params).promise().toFuture
    @inline def listWorkflowsFuture(params: ListMigrationWorkflowsRequest): Future[ListMigrationWorkflowsResponse] = service.listWorkflows(params).promise().toFuture
    @inline def retryWorkflowStepFuture(params: RetryWorkflowStepRequest): Future[RetryWorkflowStepResponse] = service.retryWorkflowStep(params).promise().toFuture
    @inline def startWorkflowFuture(params: StartMigrationWorkflowRequest): Future[StartMigrationWorkflowResponse] = service.startWorkflow(params).promise().toFuture
    @inline def stopWorkflowFuture(params: StopMigrationWorkflowRequest): Future[StopMigrationWorkflowResponse] = service.stopWorkflow(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateWorkflowFuture(params: UpdateMigrationWorkflowRequest): Future[UpdateMigrationWorkflowResponse] = service.updateWorkflow(params).promise().toFuture
    @inline def updateWorkflowStepFuture(params: UpdateWorkflowStepRequest): Future[UpdateWorkflowStepResponse] = service.updateWorkflowStep(params).promise().toFuture
    @inline def updateWorkflowStepGroupFuture(params: UpdateWorkflowStepGroupRequest): Future[UpdateWorkflowStepGroupResponse] = service.updateWorkflowStepGroup(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/migrationhuborchestrator", JSImport.Namespace, "AWS.MigrationHubOrchestrator")
  class MigrationHubOrchestrator() extends js.Object {
    def this(config: AWSConfig) = this()

    def createWorkflow(params: CreateMigrationWorkflowRequest): Request[CreateMigrationWorkflowResponse] = js.native
    def createWorkflowStep(params: CreateWorkflowStepRequest): Request[CreateWorkflowStepResponse] = js.native
    def createWorkflowStepGroup(params: CreateWorkflowStepGroupRequest): Request[CreateWorkflowStepGroupResponse] = js.native
    def deleteWorkflow(params: DeleteMigrationWorkflowRequest): Request[DeleteMigrationWorkflowResponse] = js.native
    def deleteWorkflowStep(params: DeleteWorkflowStepRequest): Request[DeleteWorkflowStepResponse] = js.native
    def deleteWorkflowStepGroup(params: DeleteWorkflowStepGroupRequest): Request[DeleteWorkflowStepGroupResponse] = js.native
    def getTemplate(params: GetMigrationWorkflowTemplateRequest): Request[GetMigrationWorkflowTemplateResponse] = js.native
    def getTemplateStep(params: GetTemplateStepRequest): Request[GetTemplateStepResponse] = js.native
    def getTemplateStepGroup(params: GetTemplateStepGroupRequest): Request[GetTemplateStepGroupResponse] = js.native
    def getWorkflow(params: GetMigrationWorkflowRequest): Request[GetMigrationWorkflowResponse] = js.native
    def getWorkflowStep(params: GetWorkflowStepRequest): Request[GetWorkflowStepResponse] = js.native
    def getWorkflowStepGroup(params: GetWorkflowStepGroupRequest): Request[GetWorkflowStepGroupResponse] = js.native
    def listPlugins(params: ListPluginsRequest): Request[ListPluginsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTemplateStepGroups(params: ListTemplateStepGroupsRequest): Request[ListTemplateStepGroupsResponse] = js.native
    def listTemplateSteps(params: ListTemplateStepsRequest): Request[ListTemplateStepsResponse] = js.native
    def listTemplates(params: ListMigrationWorkflowTemplatesRequest): Request[ListMigrationWorkflowTemplatesResponse] = js.native
    def listWorkflowStepGroups(params: ListWorkflowStepGroupsRequest): Request[ListWorkflowStepGroupsResponse] = js.native
    def listWorkflowSteps(params: ListWorkflowStepsRequest): Request[ListWorkflowStepsResponse] = js.native
    def listWorkflows(params: ListMigrationWorkflowsRequest): Request[ListMigrationWorkflowsResponse] = js.native
    def retryWorkflowStep(params: RetryWorkflowStepRequest): Request[RetryWorkflowStepResponse] = js.native
    def startWorkflow(params: StartMigrationWorkflowRequest): Request[StartMigrationWorkflowResponse] = js.native
    def stopWorkflow(params: StopMigrationWorkflowRequest): Request[StopMigrationWorkflowResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateWorkflow(params: UpdateMigrationWorkflowRequest): Request[UpdateMigrationWorkflowResponse] = js.native
    def updateWorkflowStep(params: UpdateWorkflowStepRequest): Request[UpdateWorkflowStepResponse] = js.native
    def updateWorkflowStepGroup(params: UpdateWorkflowStepGroupRequest): Request[UpdateWorkflowStepGroupResponse] = js.native
  }
  object MigrationHubOrchestrator {
    @inline implicit def toOps(service: MigrationHubOrchestrator): MigrationHubOrchestratorOps = {
      new MigrationHubOrchestratorOps(service)
    }
  }

  @js.native
  trait CreateMigrationWorkflowRequest extends js.Object {
    var applicationConfigurationId: CreateMigrationWorkflowRequestApplicationConfigurationIdString
    var inputParameters: StepInputParameters
    var name: CreateMigrationWorkflowRequestNameString
    var templateId: CreateMigrationWorkflowRequestTemplateIdString
    var description: js.UndefOr[CreateMigrationWorkflowRequestDescriptionString]
    var stepTargets: js.UndefOr[StringList]
    var tags: js.UndefOr[StringMap]
  }

  object CreateMigrationWorkflowRequest {
    @inline
    def apply(
        applicationConfigurationId: CreateMigrationWorkflowRequestApplicationConfigurationIdString,
        inputParameters: StepInputParameters,
        name: CreateMigrationWorkflowRequestNameString,
        templateId: CreateMigrationWorkflowRequestTemplateIdString,
        description: js.UndefOr[CreateMigrationWorkflowRequestDescriptionString] = js.undefined,
        stepTargets: js.UndefOr[StringList] = js.undefined,
        tags: js.UndefOr[StringMap] = js.undefined
    ): CreateMigrationWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "applicationConfigurationId" -> applicationConfigurationId.asInstanceOf[js.Any],
        "inputParameters" -> inputParameters.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      stepTargets.foreach(__v => __obj.updateDynamic("stepTargets")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMigrationWorkflowRequest]
    }
  }

  @js.native
  trait CreateMigrationWorkflowResponse extends js.Object {
    var adsApplicationConfigurationId: js.UndefOr[String]
    var arn: js.UndefOr[String]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var id: js.UndefOr[MigrationWorkflowId]
    var name: js.UndefOr[String]
    var status: js.UndefOr[MigrationWorkflowStatusEnum]
    var stepTargets: js.UndefOr[StringList]
    var tags: js.UndefOr[StringMap]
    var templateId: js.UndefOr[String]
    var workflowInputs: js.UndefOr[StepInputParameters]
  }

  object CreateMigrationWorkflowResponse {
    @inline
    def apply(
        adsApplicationConfigurationId: js.UndefOr[String] = js.undefined,
        arn: js.UndefOr[String] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[MigrationWorkflowId] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined,
        stepTargets: js.UndefOr[StringList] = js.undefined,
        tags: js.UndefOr[StringMap] = js.undefined,
        templateId: js.UndefOr[String] = js.undefined,
        workflowInputs: js.UndefOr[StepInputParameters] = js.undefined
    ): CreateMigrationWorkflowResponse = {
      val __obj = js.Dynamic.literal()
      adsApplicationConfigurationId.foreach(__v => __obj.updateDynamic("adsApplicationConfigurationId")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      stepTargets.foreach(__v => __obj.updateDynamic("stepTargets")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      templateId.foreach(__v => __obj.updateDynamic("templateId")(__v.asInstanceOf[js.Any]))
      workflowInputs.foreach(__v => __obj.updateDynamic("workflowInputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMigrationWorkflowResponse]
    }
  }

  @js.native
  trait CreateWorkflowStepGroupRequest extends js.Object {
    var name: StepGroupName
    var workflowId: MigrationWorkflowId
    var description: js.UndefOr[StepGroupDescription]
    var next: js.UndefOr[StringList]
    var previous: js.UndefOr[StringList]
  }

  object CreateWorkflowStepGroupRequest {
    @inline
    def apply(
        name: StepGroupName,
        workflowId: MigrationWorkflowId,
        description: js.UndefOr[StepGroupDescription] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined
    ): CreateWorkflowStepGroupRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkflowStepGroupRequest]
    }
  }

  @js.native
  trait CreateWorkflowStepGroupResponse extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var next: js.UndefOr[StringList]
    var previous: js.UndefOr[StringList]
    var tools: js.UndefOr[ToolsList]
    var workflowId: js.UndefOr[String]
  }

  object CreateWorkflowStepGroupResponse {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined,
        tools: js.UndefOr[ToolsList] = js.undefined,
        workflowId: js.UndefOr[String] = js.undefined
    ): CreateWorkflowStepGroupResponse = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      tools.foreach(__v => __obj.updateDynamic("tools")(__v.asInstanceOf[js.Any]))
      workflowId.foreach(__v => __obj.updateDynamic("workflowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkflowStepGroupResponse]
    }
  }

  @js.native
  trait CreateWorkflowStepRequest extends js.Object {
    var name: MigrationWorkflowName
    var stepActionType: StepActionType
    var stepGroupId: StepGroupId
    var workflowId: MigrationWorkflowId
    var description: js.UndefOr[MigrationWorkflowDescription]
    var next: js.UndefOr[StringList]
    var outputs: js.UndefOr[WorkflowStepOutputList]
    var previous: js.UndefOr[StringList]
    var stepTarget: js.UndefOr[StringList]
    var workflowStepAutomationConfiguration: js.UndefOr[WorkflowStepAutomationConfiguration]
  }

  object CreateWorkflowStepRequest {
    @inline
    def apply(
        name: MigrationWorkflowName,
        stepActionType: StepActionType,
        stepGroupId: StepGroupId,
        workflowId: MigrationWorkflowId,
        description: js.UndefOr[MigrationWorkflowDescription] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        outputs: js.UndefOr[WorkflowStepOutputList] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined,
        stepTarget: js.UndefOr[StringList] = js.undefined,
        workflowStepAutomationConfiguration: js.UndefOr[WorkflowStepAutomationConfiguration] = js.undefined
    ): CreateWorkflowStepRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "stepActionType" -> stepActionType.asInstanceOf[js.Any],
        "stepGroupId" -> stepGroupId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      outputs.foreach(__v => __obj.updateDynamic("outputs")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      stepTarget.foreach(__v => __obj.updateDynamic("stepTarget")(__v.asInstanceOf[js.Any]))
      workflowStepAutomationConfiguration.foreach(__v => __obj.updateDynamic("workflowStepAutomationConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkflowStepRequest]
    }
  }

  @js.native
  trait CreateWorkflowStepResponse extends js.Object {
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var stepGroupId: js.UndefOr[String]
    var workflowId: js.UndefOr[String]
  }

  object CreateWorkflowStepResponse {
    @inline
    def apply(
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        stepGroupId: js.UndefOr[String] = js.undefined,
        workflowId: js.UndefOr[String] = js.undefined
    ): CreateWorkflowStepResponse = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      stepGroupId.foreach(__v => __obj.updateDynamic("stepGroupId")(__v.asInstanceOf[js.Any]))
      workflowId.foreach(__v => __obj.updateDynamic("workflowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkflowStepResponse]
    }
  }

  @js.native
  trait DeleteMigrationWorkflowRequest extends js.Object {
    var id: MigrationWorkflowId
  }

  object DeleteMigrationWorkflowRequest {
    @inline
    def apply(
        id: MigrationWorkflowId
    ): DeleteMigrationWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMigrationWorkflowRequest]
    }
  }

  @js.native
  trait DeleteMigrationWorkflowResponse extends js.Object {
    var arn: js.UndefOr[String]
    var id: js.UndefOr[MigrationWorkflowId]
    var status: js.UndefOr[MigrationWorkflowStatusEnum]
  }

  object DeleteMigrationWorkflowResponse {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[MigrationWorkflowId] = js.undefined,
        status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined
    ): DeleteMigrationWorkflowResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMigrationWorkflowResponse]
    }
  }

  @js.native
  trait DeleteWorkflowStepGroupRequest extends js.Object {
    var id: StepGroupId
    var workflowId: MigrationWorkflowId
  }

  object DeleteWorkflowStepGroupRequest {
    @inline
    def apply(
        id: StepGroupId,
        workflowId: MigrationWorkflowId
    ): DeleteWorkflowStepGroupRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkflowStepGroupRequest]
    }
  }

  @js.native
  trait DeleteWorkflowStepGroupResponse extends js.Object

  object DeleteWorkflowStepGroupResponse {
    @inline
    def apply(): DeleteWorkflowStepGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWorkflowStepGroupResponse]
    }
  }

  @js.native
  trait DeleteWorkflowStepRequest extends js.Object {
    var id: StepId
    var stepGroupId: StepGroupId
    var workflowId: MigrationWorkflowId
  }

  object DeleteWorkflowStepRequest {
    @inline
    def apply(
        id: StepId,
        stepGroupId: StepGroupId,
        workflowId: MigrationWorkflowId
    ): DeleteWorkflowStepRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "stepGroupId" -> stepGroupId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkflowStepRequest]
    }
  }

  @js.native
  trait DeleteWorkflowStepResponse extends js.Object

  object DeleteWorkflowStepResponse {
    @inline
    def apply(): DeleteWorkflowStepResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWorkflowStepResponse]
    }
  }

  @js.native
  trait GetMigrationWorkflowRequest extends js.Object {
    var id: MigrationWorkflowId
  }

  object GetMigrationWorkflowRequest {
    @inline
    def apply(
        id: MigrationWorkflowId
    ): GetMigrationWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMigrationWorkflowRequest]
    }
  }

  @js.native
  trait GetMigrationWorkflowResponse extends js.Object {
    var adsApplicationConfigurationId: js.UndefOr[String]
    var adsApplicationName: js.UndefOr[String]
    var arn: js.UndefOr[String]
    var completedSteps: js.UndefOr[Int]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var endTime: js.UndefOr[Timestamp]
    var id: js.UndefOr[MigrationWorkflowId]
    var lastModifiedTime: js.UndefOr[Timestamp]
    var lastStartTime: js.UndefOr[Timestamp]
    var lastStopTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[String]
    var status: js.UndefOr[MigrationWorkflowStatusEnum]
    var statusMessage: js.UndefOr[String]
    var tags: js.UndefOr[StringMap]
    var templateId: js.UndefOr[String]
    var tools: js.UndefOr[ToolsList]
    var totalSteps: js.UndefOr[Int]
    var workflowBucket: js.UndefOr[String]
    var workflowInputs: js.UndefOr[StepInputParameters]
  }

  object GetMigrationWorkflowResponse {
    @inline
    def apply(
        adsApplicationConfigurationId: js.UndefOr[String] = js.undefined,
        adsApplicationName: js.UndefOr[String] = js.undefined,
        arn: js.UndefOr[String] = js.undefined,
        completedSteps: js.UndefOr[Int] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[MigrationWorkflowId] = js.undefined,
        lastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        lastStartTime: js.UndefOr[Timestamp] = js.undefined,
        lastStopTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[StringMap] = js.undefined,
        templateId: js.UndefOr[String] = js.undefined,
        tools: js.UndefOr[ToolsList] = js.undefined,
        totalSteps: js.UndefOr[Int] = js.undefined,
        workflowBucket: js.UndefOr[String] = js.undefined,
        workflowInputs: js.UndefOr[StepInputParameters] = js.undefined
    ): GetMigrationWorkflowResponse = {
      val __obj = js.Dynamic.literal()
      adsApplicationConfigurationId.foreach(__v => __obj.updateDynamic("adsApplicationConfigurationId")(__v.asInstanceOf[js.Any]))
      adsApplicationName.foreach(__v => __obj.updateDynamic("adsApplicationName")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      completedSteps.foreach(__v => __obj.updateDynamic("completedSteps")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      lastStartTime.foreach(__v => __obj.updateDynamic("lastStartTime")(__v.asInstanceOf[js.Any]))
      lastStopTime.foreach(__v => __obj.updateDynamic("lastStopTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      templateId.foreach(__v => __obj.updateDynamic("templateId")(__v.asInstanceOf[js.Any]))
      tools.foreach(__v => __obj.updateDynamic("tools")(__v.asInstanceOf[js.Any]))
      totalSteps.foreach(__v => __obj.updateDynamic("totalSteps")(__v.asInstanceOf[js.Any]))
      workflowBucket.foreach(__v => __obj.updateDynamic("workflowBucket")(__v.asInstanceOf[js.Any]))
      workflowInputs.foreach(__v => __obj.updateDynamic("workflowInputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMigrationWorkflowResponse]
    }
  }

  @js.native
  trait GetMigrationWorkflowTemplateRequest extends js.Object {
    var id: TemplateId
  }

  object GetMigrationWorkflowTemplateRequest {
    @inline
    def apply(
        id: TemplateId
    ): GetMigrationWorkflowTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMigrationWorkflowTemplateRequest]
    }
  }

  @js.native
  trait GetMigrationWorkflowTemplateResponse extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var inputs: js.UndefOr[TemplateInputList]
    var name: js.UndefOr[String]
    var status: js.UndefOr[TemplateStatus]
    var tools: js.UndefOr[ToolsList]
  }

  object GetMigrationWorkflowTemplateResponse {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        inputs: js.UndefOr[TemplateInputList] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[TemplateStatus] = js.undefined,
        tools: js.UndefOr[ToolsList] = js.undefined
    ): GetMigrationWorkflowTemplateResponse = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      inputs.foreach(__v => __obj.updateDynamic("inputs")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tools.foreach(__v => __obj.updateDynamic("tools")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMigrationWorkflowTemplateResponse]
    }
  }

  @js.native
  trait GetTemplateStepGroupRequest extends js.Object {
    var id: StepGroupId
    var templateId: TemplateId
  }

  object GetTemplateStepGroupRequest {
    @inline
    def apply(
        id: StepGroupId,
        templateId: TemplateId
    ): GetTemplateStepGroupRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTemplateStepGroupRequest]
    }
  }

  @js.native
  trait GetTemplateStepGroupResponse extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var lastModifiedTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[String]
    var next: js.UndefOr[StringList]
    var previous: js.UndefOr[StringList]
    var status: js.UndefOr[StepGroupStatus]
    var templateId: js.UndefOr[String]
    var tools: js.UndefOr[ToolsList]
  }

  object GetTemplateStepGroupResponse {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        lastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined,
        status: js.UndefOr[StepGroupStatus] = js.undefined,
        templateId: js.UndefOr[String] = js.undefined,
        tools: js.UndefOr[ToolsList] = js.undefined
    ): GetTemplateStepGroupResponse = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      templateId.foreach(__v => __obj.updateDynamic("templateId")(__v.asInstanceOf[js.Any]))
      tools.foreach(__v => __obj.updateDynamic("tools")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTemplateStepGroupResponse]
    }
  }

  @js.native
  trait GetTemplateStepRequest extends js.Object {
    var id: StepId
    var stepGroupId: StepGroupId
    var templateId: TemplateId
  }

  object GetTemplateStepRequest {
    @inline
    def apply(
        id: StepId,
        stepGroupId: StepGroupId,
        templateId: TemplateId
    ): GetTemplateStepRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "stepGroupId" -> stepGroupId.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTemplateStepRequest]
    }
  }

  @js.native
  trait GetTemplateStepResponse extends js.Object {
    var creationTime: js.UndefOr[String]
    var description: js.UndefOr[String]
    var id: js.UndefOr[StepId]
    var name: js.UndefOr[String]
    var next: js.UndefOr[StringList]
    var outputs: js.UndefOr[StepOutputList]
    var previous: js.UndefOr[StringList]
    var stepActionType: js.UndefOr[StepActionType]
    var stepAutomationConfiguration: js.UndefOr[StepAutomationConfiguration]
    var stepGroupId: js.UndefOr[StepGroupId]
    var templateId: js.UndefOr[TemplateId]
  }

  object GetTemplateStepResponse {
    @inline
    def apply(
        creationTime: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[StepId] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        outputs: js.UndefOr[StepOutputList] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined,
        stepActionType: js.UndefOr[StepActionType] = js.undefined,
        stepAutomationConfiguration: js.UndefOr[StepAutomationConfiguration] = js.undefined,
        stepGroupId: js.UndefOr[StepGroupId] = js.undefined,
        templateId: js.UndefOr[TemplateId] = js.undefined
    ): GetTemplateStepResponse = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      outputs.foreach(__v => __obj.updateDynamic("outputs")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      stepActionType.foreach(__v => __obj.updateDynamic("stepActionType")(__v.asInstanceOf[js.Any]))
      stepAutomationConfiguration.foreach(__v => __obj.updateDynamic("stepAutomationConfiguration")(__v.asInstanceOf[js.Any]))
      stepGroupId.foreach(__v => __obj.updateDynamic("stepGroupId")(__v.asInstanceOf[js.Any]))
      templateId.foreach(__v => __obj.updateDynamic("templateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTemplateStepResponse]
    }
  }

  @js.native
  trait GetWorkflowStepGroupRequest extends js.Object {
    var id: StepGroupId
    var workflowId: MigrationWorkflowId
  }

  object GetWorkflowStepGroupRequest {
    @inline
    def apply(
        id: StepGroupId,
        workflowId: MigrationWorkflowId
    ): GetWorkflowStepGroupRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWorkflowStepGroupRequest]
    }
  }

  @js.native
  trait GetWorkflowStepGroupResponse extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var endTime: js.UndefOr[Timestamp]
    var id: js.UndefOr[StepGroupId]
    var lastModifiedTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[String]
    var next: js.UndefOr[StringList]
    var owner: js.UndefOr[Owner]
    var previous: js.UndefOr[StringList]
    var status: js.UndefOr[StepGroupStatus]
    var tools: js.UndefOr[ToolsList]
    var workflowId: js.UndefOr[String]
  }

  object GetWorkflowStepGroupResponse {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[StepGroupId] = js.undefined,
        lastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        owner: js.UndefOr[Owner] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined,
        status: js.UndefOr[StepGroupStatus] = js.undefined,
        tools: js.UndefOr[ToolsList] = js.undefined,
        workflowId: js.UndefOr[String] = js.undefined
    ): GetWorkflowStepGroupResponse = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tools.foreach(__v => __obj.updateDynamic("tools")(__v.asInstanceOf[js.Any]))
      workflowId.foreach(__v => __obj.updateDynamic("workflowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkflowStepGroupResponse]
    }
  }

  @js.native
  trait GetWorkflowStepRequest extends js.Object {
    var id: StepId
    var stepGroupId: StepGroupId
    var workflowId: MigrationWorkflowId
  }

  object GetWorkflowStepRequest {
    @inline
    def apply(
        id: StepId,
        stepGroupId: StepGroupId,
        workflowId: MigrationWorkflowId
    ): GetWorkflowStepRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "stepGroupId" -> stepGroupId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWorkflowStepRequest]
    }
  }

  @js.native
  trait GetWorkflowStepResponse extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var endTime: js.UndefOr[Timestamp]
    var lastStartTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[String]
    var next: js.UndefOr[StringList]
    var noOfSrvCompleted: js.UndefOr[Int]
    var noOfSrvFailed: js.UndefOr[Int]
    var outputs: js.UndefOr[GetWorkflowStepResponseOutputsList]
    var owner: js.UndefOr[Owner]
    var previous: js.UndefOr[StringList]
    var scriptOutputLocation: js.UndefOr[String]
    var status: js.UndefOr[StepStatus]
    var statusMessage: js.UndefOr[String]
    var stepActionType: js.UndefOr[StepActionType]
    var stepGroupId: js.UndefOr[String]
    var stepId: js.UndefOr[String]
    var stepTarget: js.UndefOr[StringList]
    var totalNoOfSrv: js.UndefOr[Int]
    var workflowId: js.UndefOr[String]
    var workflowStepAutomationConfiguration: js.UndefOr[WorkflowStepAutomationConfiguration]
  }

  object GetWorkflowStepResponse {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        lastStartTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        noOfSrvCompleted: js.UndefOr[Int] = js.undefined,
        noOfSrvFailed: js.UndefOr[Int] = js.undefined,
        outputs: js.UndefOr[GetWorkflowStepResponseOutputsList] = js.undefined,
        owner: js.UndefOr[Owner] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined,
        scriptOutputLocation: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[StepStatus] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        stepActionType: js.UndefOr[StepActionType] = js.undefined,
        stepGroupId: js.UndefOr[String] = js.undefined,
        stepId: js.UndefOr[String] = js.undefined,
        stepTarget: js.UndefOr[StringList] = js.undefined,
        totalNoOfSrv: js.UndefOr[Int] = js.undefined,
        workflowId: js.UndefOr[String] = js.undefined,
        workflowStepAutomationConfiguration: js.UndefOr[WorkflowStepAutomationConfiguration] = js.undefined
    ): GetWorkflowStepResponse = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      lastStartTime.foreach(__v => __obj.updateDynamic("lastStartTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      noOfSrvCompleted.foreach(__v => __obj.updateDynamic("noOfSrvCompleted")(__v.asInstanceOf[js.Any]))
      noOfSrvFailed.foreach(__v => __obj.updateDynamic("noOfSrvFailed")(__v.asInstanceOf[js.Any]))
      outputs.foreach(__v => __obj.updateDynamic("outputs")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      scriptOutputLocation.foreach(__v => __obj.updateDynamic("scriptOutputLocation")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      stepActionType.foreach(__v => __obj.updateDynamic("stepActionType")(__v.asInstanceOf[js.Any]))
      stepGroupId.foreach(__v => __obj.updateDynamic("stepGroupId")(__v.asInstanceOf[js.Any]))
      stepId.foreach(__v => __obj.updateDynamic("stepId")(__v.asInstanceOf[js.Any]))
      stepTarget.foreach(__v => __obj.updateDynamic("stepTarget")(__v.asInstanceOf[js.Any]))
      totalNoOfSrv.foreach(__v => __obj.updateDynamic("totalNoOfSrv")(__v.asInstanceOf[js.Any]))
      workflowId.foreach(__v => __obj.updateDynamic("workflowId")(__v.asInstanceOf[js.Any]))
      workflowStepAutomationConfiguration.foreach(__v => __obj.updateDynamic("workflowStepAutomationConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkflowStepResponse]
    }
  }

  @js.native
  trait ListMigrationWorkflowTemplatesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var name: js.UndefOr[TemplateName]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListMigrationWorkflowTemplatesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        name: js.UndefOr[TemplateName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMigrationWorkflowTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMigrationWorkflowTemplatesRequest]
    }
  }

  @js.native
  trait ListMigrationWorkflowTemplatesResponse extends js.Object {
    var templateSummary: TemplateSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListMigrationWorkflowTemplatesResponse {
    @inline
    def apply(
        templateSummary: TemplateSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMigrationWorkflowTemplatesResponse = {
      val __obj = js.Dynamic.literal(
        "templateSummary" -> templateSummary.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMigrationWorkflowTemplatesResponse]
    }
  }

  @js.native
  trait ListMigrationWorkflowsRequest extends js.Object {
    var adsApplicationConfigurationName: js.UndefOr[ApplicationConfigurationName]
    var maxResults: js.UndefOr[MaxResults]
    var name: js.UndefOr[String]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[MigrationWorkflowStatusEnum]
    var templateId: js.UndefOr[TemplateId]
  }

  object ListMigrationWorkflowsRequest {
    @inline
    def apply(
        adsApplicationConfigurationName: js.UndefOr[ApplicationConfigurationName] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined,
        templateId: js.UndefOr[TemplateId] = js.undefined
    ): ListMigrationWorkflowsRequest = {
      val __obj = js.Dynamic.literal()
      adsApplicationConfigurationName.foreach(__v => __obj.updateDynamic("adsApplicationConfigurationName")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      templateId.foreach(__v => __obj.updateDynamic("templateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMigrationWorkflowsRequest]
    }
  }

  @js.native
  trait ListMigrationWorkflowsResponse extends js.Object {
    var migrationWorkflowSummary: MigrationWorkflowSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListMigrationWorkflowsResponse {
    @inline
    def apply(
        migrationWorkflowSummary: MigrationWorkflowSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMigrationWorkflowsResponse = {
      val __obj = js.Dynamic.literal(
        "migrationWorkflowSummary" -> migrationWorkflowSummary.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMigrationWorkflowsResponse]
    }
  }

  @js.native
  trait ListPluginsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPluginsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPluginsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPluginsRequest]
    }
  }

  @js.native
  trait ListPluginsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var plugins: js.UndefOr[PluginSummaries]
  }

  object ListPluginsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        plugins: js.UndefOr[PluginSummaries] = js.undefined
    ): ListPluginsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      plugins.foreach(__v => __obj.updateDynamic("plugins")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPluginsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn
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
  trait ListTemplateStepGroupsRequest extends js.Object {
    var templateId: TemplateId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTemplateStepGroupsRequest {
    @inline
    def apply(
        templateId: TemplateId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTemplateStepGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "templateId" -> templateId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplateStepGroupsRequest]
    }
  }

  @js.native
  trait ListTemplateStepGroupsResponse extends js.Object {
    var templateStepGroupSummary: TemplateStepGroupSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTemplateStepGroupsResponse {
    @inline
    def apply(
        templateStepGroupSummary: TemplateStepGroupSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTemplateStepGroupsResponse = {
      val __obj = js.Dynamic.literal(
        "templateStepGroupSummary" -> templateStepGroupSummary.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplateStepGroupsResponse]
    }
  }

  @js.native
  trait ListTemplateStepsRequest extends js.Object {
    var stepGroupId: StepGroupId
    var templateId: TemplateId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTemplateStepsRequest {
    @inline
    def apply(
        stepGroupId: StepGroupId,
        templateId: TemplateId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTemplateStepsRequest = {
      val __obj = js.Dynamic.literal(
        "stepGroupId" -> stepGroupId.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplateStepsRequest]
    }
  }

  @js.native
  trait ListTemplateStepsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var templateStepSummaryList: js.UndefOr[TemplateStepSummaryList]
  }

  object ListTemplateStepsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        templateStepSummaryList: js.UndefOr[TemplateStepSummaryList] = js.undefined
    ): ListTemplateStepsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      templateStepSummaryList.foreach(__v => __obj.updateDynamic("templateStepSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplateStepsResponse]
    }
  }

  @js.native
  trait ListWorkflowStepGroupsRequest extends js.Object {
    var workflowId: MigrationWorkflowId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListWorkflowStepGroupsRequest {
    @inline
    def apply(
        workflowId: MigrationWorkflowId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWorkflowStepGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkflowStepGroupsRequest]
    }
  }

  @js.native
  trait ListWorkflowStepGroupsResponse extends js.Object {
    var workflowStepGroupsSummary: WorkflowStepGroupsSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListWorkflowStepGroupsResponse {
    @inline
    def apply(
        workflowStepGroupsSummary: WorkflowStepGroupsSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWorkflowStepGroupsResponse = {
      val __obj = js.Dynamic.literal(
        "workflowStepGroupsSummary" -> workflowStepGroupsSummary.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkflowStepGroupsResponse]
    }
  }

  @js.native
  trait ListWorkflowStepsRequest extends js.Object {
    var stepGroupId: StepGroupId
    var workflowId: MigrationWorkflowId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListWorkflowStepsRequest {
    @inline
    def apply(
        stepGroupId: StepGroupId,
        workflowId: MigrationWorkflowId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWorkflowStepsRequest = {
      val __obj = js.Dynamic.literal(
        "stepGroupId" -> stepGroupId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkflowStepsRequest]
    }
  }

  @js.native
  trait ListWorkflowStepsResponse extends js.Object {
    var workflowStepsSummary: WorkflowStepsSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListWorkflowStepsResponse {
    @inline
    def apply(
        workflowStepsSummary: WorkflowStepsSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWorkflowStepsResponse = {
      val __obj = js.Dynamic.literal(
        "workflowStepsSummary" -> workflowStepsSummary.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkflowStepsResponse]
    }
  }

  /** The summary of a migration workflow.
    */
  @js.native
  trait MigrationWorkflowSummary extends js.Object {
    var adsApplicationConfigurationName: js.UndefOr[String]
    var completedSteps: js.UndefOr[Int]
    var creationTime: js.UndefOr[Timestamp]
    var endTime: js.UndefOr[Timestamp]
    var id: js.UndefOr[MigrationWorkflowId]
    var name: js.UndefOr[String]
    var status: js.UndefOr[MigrationWorkflowStatusEnum]
    var statusMessage: js.UndefOr[String]
    var templateId: js.UndefOr[String]
    var totalSteps: js.UndefOr[Int]
  }

  object MigrationWorkflowSummary {
    @inline
    def apply(
        adsApplicationConfigurationName: js.UndefOr[String] = js.undefined,
        completedSteps: js.UndefOr[Int] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[MigrationWorkflowId] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        templateId: js.UndefOr[String] = js.undefined,
        totalSteps: js.UndefOr[Int] = js.undefined
    ): MigrationWorkflowSummary = {
      val __obj = js.Dynamic.literal()
      adsApplicationConfigurationName.foreach(__v => __obj.updateDynamic("adsApplicationConfigurationName")(__v.asInstanceOf[js.Any]))
      completedSteps.foreach(__v => __obj.updateDynamic("completedSteps")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      templateId.foreach(__v => __obj.updateDynamic("templateId")(__v.asInstanceOf[js.Any]))
      totalSteps.foreach(__v => __obj.updateDynamic("totalSteps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MigrationWorkflowSummary]
    }
  }

  /** Command to be run on a particular operating system.
    */
  @js.native
  trait PlatformCommand extends js.Object {
    var linux: js.UndefOr[String]
    var windows: js.UndefOr[String]
  }

  object PlatformCommand {
    @inline
    def apply(
        linux: js.UndefOr[String] = js.undefined,
        windows: js.UndefOr[String] = js.undefined
    ): PlatformCommand = {
      val __obj = js.Dynamic.literal()
      linux.foreach(__v => __obj.updateDynamic("linux")(__v.asInstanceOf[js.Any]))
      windows.foreach(__v => __obj.updateDynamic("windows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlatformCommand]
    }
  }

  /** The script location for a particular operating system.
    */
  @js.native
  trait PlatformScriptKey extends js.Object {
    var linux: js.UndefOr[S3Key]
    var windows: js.UndefOr[S3Key]
  }

  object PlatformScriptKey {
    @inline
    def apply(
        linux: js.UndefOr[S3Key] = js.undefined,
        windows: js.UndefOr[S3Key] = js.undefined
    ): PlatformScriptKey = {
      val __obj = js.Dynamic.literal()
      linux.foreach(__v => __obj.updateDynamic("linux")(__v.asInstanceOf[js.Any]))
      windows.foreach(__v => __obj.updateDynamic("windows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlatformScriptKey]
    }
  }

  /** The summary of the Migration Hub Orchestrator plugin.
    */
  @js.native
  trait PluginSummary extends js.Object {
    var hostname: js.UndefOr[String]
    var ipAddress: js.UndefOr[IPAddress]
    var pluginId: js.UndefOr[PluginId]
    var registeredTime: js.UndefOr[String]
    var status: js.UndefOr[PluginHealth]
    var version: js.UndefOr[PluginVersion]
  }

  object PluginSummary {
    @inline
    def apply(
        hostname: js.UndefOr[String] = js.undefined,
        ipAddress: js.UndefOr[IPAddress] = js.undefined,
        pluginId: js.UndefOr[PluginId] = js.undefined,
        registeredTime: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[PluginHealth] = js.undefined,
        version: js.UndefOr[PluginVersion] = js.undefined
    ): PluginSummary = {
      val __obj = js.Dynamic.literal()
      hostname.foreach(__v => __obj.updateDynamic("hostname")(__v.asInstanceOf[js.Any]))
      ipAddress.foreach(__v => __obj.updateDynamic("ipAddress")(__v.asInstanceOf[js.Any]))
      pluginId.foreach(__v => __obj.updateDynamic("pluginId")(__v.asInstanceOf[js.Any]))
      registeredTime.foreach(__v => __obj.updateDynamic("registeredTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PluginSummary]
    }
  }

  @js.native
  trait RetryWorkflowStepRequest extends js.Object {
    var id: StepId
    var stepGroupId: StepGroupId
    var workflowId: MigrationWorkflowId
  }

  object RetryWorkflowStepRequest {
    @inline
    def apply(
        id: StepId,
        stepGroupId: StepGroupId,
        workflowId: MigrationWorkflowId
    ): RetryWorkflowStepRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "stepGroupId" -> stepGroupId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RetryWorkflowStepRequest]
    }
  }

  @js.native
  trait RetryWorkflowStepResponse extends js.Object {
    var id: js.UndefOr[String]
    var status: js.UndefOr[StepStatus]
    var stepGroupId: js.UndefOr[String]
    var workflowId: js.UndefOr[String]
  }

  object RetryWorkflowStepResponse {
    @inline
    def apply(
        id: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[StepStatus] = js.undefined,
        stepGroupId: js.UndefOr[String] = js.undefined,
        workflowId: js.UndefOr[String] = js.undefined
    ): RetryWorkflowStepResponse = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      stepGroupId.foreach(__v => __obj.updateDynamic("stepGroupId")(__v.asInstanceOf[js.Any]))
      workflowId.foreach(__v => __obj.updateDynamic("workflowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetryWorkflowStepResponse]
    }
  }

  @js.native
  trait StartMigrationWorkflowRequest extends js.Object {
    var id: MigrationWorkflowId
  }

  object StartMigrationWorkflowRequest {
    @inline
    def apply(
        id: MigrationWorkflowId
    ): StartMigrationWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartMigrationWorkflowRequest]
    }
  }

  @js.native
  trait StartMigrationWorkflowResponse extends js.Object {
    var arn: js.UndefOr[String]
    var id: js.UndefOr[MigrationWorkflowId]
    var lastStartTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[MigrationWorkflowStatusEnum]
    var statusMessage: js.UndefOr[String]
  }

  object StartMigrationWorkflowResponse {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[MigrationWorkflowId] = js.undefined,
        lastStartTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined
    ): StartMigrationWorkflowResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastStartTime.foreach(__v => __obj.updateDynamic("lastStartTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMigrationWorkflowResponse]
    }
  }

  /** The custom script to run tests on source or target environments.
    */
  @js.native
  trait StepAutomationConfiguration extends js.Object {
    var command: js.UndefOr[PlatformCommand]
    var runEnvironment: js.UndefOr[RunEnvironment]
    var scriptLocationS3Bucket: js.UndefOr[String]
    var scriptLocationS3Key: js.UndefOr[PlatformScriptKey]
    var targetType: js.UndefOr[TargetType]
  }

  object StepAutomationConfiguration {
    @inline
    def apply(
        command: js.UndefOr[PlatformCommand] = js.undefined,
        runEnvironment: js.UndefOr[RunEnvironment] = js.undefined,
        scriptLocationS3Bucket: js.UndefOr[String] = js.undefined,
        scriptLocationS3Key: js.UndefOr[PlatformScriptKey] = js.undefined,
        targetType: js.UndefOr[TargetType] = js.undefined
    ): StepAutomationConfiguration = {
      val __obj = js.Dynamic.literal()
      command.foreach(__v => __obj.updateDynamic("command")(__v.asInstanceOf[js.Any]))
      runEnvironment.foreach(__v => __obj.updateDynamic("runEnvironment")(__v.asInstanceOf[js.Any]))
      scriptLocationS3Bucket.foreach(__v => __obj.updateDynamic("scriptLocationS3Bucket")(__v.asInstanceOf[js.Any]))
      scriptLocationS3Key.foreach(__v => __obj.updateDynamic("scriptLocationS3Key")(__v.asInstanceOf[js.Any]))
      targetType.foreach(__v => __obj.updateDynamic("targetType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepAutomationConfiguration]
    }
  }

  /** A map of key value pairs that is generated when you create a migration workflow. The key value pairs will differ based on your selection of the template.
    */
  @js.native
  trait StepInput extends js.Object {
    var integerValue: js.UndefOr[Int]
    var listOfStringsValue: js.UndefOr[StringList]
    var mapOfStringValue: js.UndefOr[StringMap]
    var stringValue: js.UndefOr[StringValue]
  }

  object StepInput {
    @inline
    def apply(
        integerValue: js.UndefOr[Int] = js.undefined,
        listOfStringsValue: js.UndefOr[StringList] = js.undefined,
        mapOfStringValue: js.UndefOr[StringMap] = js.undefined,
        stringValue: js.UndefOr[StringValue] = js.undefined
    ): StepInput = {
      val __obj = js.Dynamic.literal()
      integerValue.foreach(__v => __obj.updateDynamic("integerValue")(__v.asInstanceOf[js.Any]))
      listOfStringsValue.foreach(__v => __obj.updateDynamic("listOfStringsValue")(__v.asInstanceOf[js.Any]))
      mapOfStringValue.foreach(__v => __obj.updateDynamic("mapOfStringValue")(__v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.updateDynamic("stringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepInput]
    }
  }

  /** The output of the step.
    */
  @js.native
  trait StepOutput extends js.Object {
    var dataType: js.UndefOr[DataType]
    var name: js.UndefOr[String]
    var required: js.UndefOr[Boolean]
  }

  object StepOutput {
    @inline
    def apply(
        dataType: js.UndefOr[DataType] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        required: js.UndefOr[Boolean] = js.undefined
    ): StepOutput = {
      val __obj = js.Dynamic.literal()
      dataType.foreach(__v => __obj.updateDynamic("dataType")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      required.foreach(__v => __obj.updateDynamic("required")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StepOutput]
    }
  }

  @js.native
  trait StopMigrationWorkflowRequest extends js.Object {
    var id: MigrationWorkflowId
  }

  object StopMigrationWorkflowRequest {
    @inline
    def apply(
        id: MigrationWorkflowId
    ): StopMigrationWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopMigrationWorkflowRequest]
    }
  }

  @js.native
  trait StopMigrationWorkflowResponse extends js.Object {
    var arn: js.UndefOr[String]
    var id: js.UndefOr[MigrationWorkflowId]
    var lastStopTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[MigrationWorkflowStatusEnum]
    var statusMessage: js.UndefOr[String]
  }

  object StopMigrationWorkflowResponse {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[MigrationWorkflowId] = js.undefined,
        lastStopTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined
    ): StopMigrationWorkflowResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastStopTime.foreach(__v => __obj.updateDynamic("lastStopTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopMigrationWorkflowResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tags: TagMap
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

  /** The input parameters of a template.
    */
  @js.native
  trait TemplateInput extends js.Object {
    var dataType: js.UndefOr[DataType]
    var inputName: js.UndefOr[TemplateInputName]
    var required: js.UndefOr[Boolean]
  }

  object TemplateInput {
    @inline
    def apply(
        dataType: js.UndefOr[DataType] = js.undefined,
        inputName: js.UndefOr[TemplateInputName] = js.undefined,
        required: js.UndefOr[Boolean] = js.undefined
    ): TemplateInput = {
      val __obj = js.Dynamic.literal()
      dataType.foreach(__v => __obj.updateDynamic("dataType")(__v.asInstanceOf[js.Any]))
      inputName.foreach(__v => __obj.updateDynamic("inputName")(__v.asInstanceOf[js.Any]))
      required.foreach(__v => __obj.updateDynamic("required")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateInput]
    }
  }

  /** The summary of the step group in the template.
    */
  @js.native
  trait TemplateStepGroupSummary extends js.Object {
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var next: js.UndefOr[StringList]
    var previous: js.UndefOr[StringList]
  }

  object TemplateStepGroupSummary {
    @inline
    def apply(
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined
    ): TemplateStepGroupSummary = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateStepGroupSummary]
    }
  }

  /** The summary of the step.
    */
  @js.native
  trait TemplateStepSummary extends js.Object {
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var next: js.UndefOr[StringList]
    var owner: js.UndefOr[Owner]
    var previous: js.UndefOr[StringList]
    var stepActionType: js.UndefOr[StepActionType]
    var stepGroupId: js.UndefOr[String]
    var targetType: js.UndefOr[TargetType]
    var templateId: js.UndefOr[String]
  }

  object TemplateStepSummary {
    @inline
    def apply(
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        owner: js.UndefOr[Owner] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined,
        stepActionType: js.UndefOr[StepActionType] = js.undefined,
        stepGroupId: js.UndefOr[String] = js.undefined,
        targetType: js.UndefOr[TargetType] = js.undefined,
        templateId: js.UndefOr[String] = js.undefined
    ): TemplateStepSummary = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      stepActionType.foreach(__v => __obj.updateDynamic("stepActionType")(__v.asInstanceOf[js.Any]))
      stepGroupId.foreach(__v => __obj.updateDynamic("stepGroupId")(__v.asInstanceOf[js.Any]))
      targetType.foreach(__v => __obj.updateDynamic("targetType")(__v.asInstanceOf[js.Any]))
      templateId.foreach(__v => __obj.updateDynamic("templateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateStepSummary]
    }
  }

  /** The summary of the template.
    */
  @js.native
  trait TemplateSummary extends js.Object {
    var arn: js.UndefOr[String]
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  object TemplateSummary {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): TemplateSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateSummary]
    }
  }

  /** List of AWS services utilized in a migration workflow.
    */
  @js.native
  trait Tool extends js.Object {
    var name: js.UndefOr[String]
    var url: js.UndefOr[String]
  }

  object Tool {
    @inline
    def apply(
        name: js.UndefOr[String] = js.undefined,
        url: js.UndefOr[String] = js.undefined
    ): Tool = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      url.foreach(__v => __obj.updateDynamic("url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tool]
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
  trait UpdateMigrationWorkflowRequest extends js.Object {
    var id: MigrationWorkflowId
    var description: js.UndefOr[UpdateMigrationWorkflowRequestDescriptionString]
    var inputParameters: js.UndefOr[StepInputParameters]
    var name: js.UndefOr[UpdateMigrationWorkflowRequestNameString]
    var stepTargets: js.UndefOr[StringList]
  }

  object UpdateMigrationWorkflowRequest {
    @inline
    def apply(
        id: MigrationWorkflowId,
        description: js.UndefOr[UpdateMigrationWorkflowRequestDescriptionString] = js.undefined,
        inputParameters: js.UndefOr[StepInputParameters] = js.undefined,
        name: js.UndefOr[UpdateMigrationWorkflowRequestNameString] = js.undefined,
        stepTargets: js.UndefOr[StringList] = js.undefined
    ): UpdateMigrationWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      inputParameters.foreach(__v => __obj.updateDynamic("inputParameters")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      stepTargets.foreach(__v => __obj.updateDynamic("stepTargets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMigrationWorkflowRequest]
    }
  }

  @js.native
  trait UpdateMigrationWorkflowResponse extends js.Object {
    var adsApplicationConfigurationId: js.UndefOr[String]
    var arn: js.UndefOr[String]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var id: js.UndefOr[MigrationWorkflowId]
    var lastModifiedTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[String]
    var status: js.UndefOr[MigrationWorkflowStatusEnum]
    var stepTargets: js.UndefOr[StringList]
    var tags: js.UndefOr[StringMap]
    var templateId: js.UndefOr[String]
    var workflowInputs: js.UndefOr[StepInputParameters]
  }

  object UpdateMigrationWorkflowResponse {
    @inline
    def apply(
        adsApplicationConfigurationId: js.UndefOr[String] = js.undefined,
        arn: js.UndefOr[String] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[MigrationWorkflowId] = js.undefined,
        lastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined,
        stepTargets: js.UndefOr[StringList] = js.undefined,
        tags: js.UndefOr[StringMap] = js.undefined,
        templateId: js.UndefOr[String] = js.undefined,
        workflowInputs: js.UndefOr[StepInputParameters] = js.undefined
    ): UpdateMigrationWorkflowResponse = {
      val __obj = js.Dynamic.literal()
      adsApplicationConfigurationId.foreach(__v => __obj.updateDynamic("adsApplicationConfigurationId")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      stepTargets.foreach(__v => __obj.updateDynamic("stepTargets")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      templateId.foreach(__v => __obj.updateDynamic("templateId")(__v.asInstanceOf[js.Any]))
      workflowInputs.foreach(__v => __obj.updateDynamic("workflowInputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMigrationWorkflowResponse]
    }
  }

  @js.native
  trait UpdateWorkflowStepGroupRequest extends js.Object {
    var id: StepGroupId
    var workflowId: MigrationWorkflowId
    var description: js.UndefOr[StepGroupDescription]
    var name: js.UndefOr[StepGroupName]
    var next: js.UndefOr[StringList]
    var previous: js.UndefOr[StringList]
  }

  object UpdateWorkflowStepGroupRequest {
    @inline
    def apply(
        id: StepGroupId,
        workflowId: MigrationWorkflowId,
        description: js.UndefOr[StepGroupDescription] = js.undefined,
        name: js.UndefOr[StepGroupName] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined
    ): UpdateWorkflowStepGroupRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkflowStepGroupRequest]
    }
  }

  @js.native
  trait UpdateWorkflowStepGroupResponse extends js.Object {
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var lastModifiedTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[String]
    var next: js.UndefOr[StringList]
    var previous: js.UndefOr[StringList]
    var tools: js.UndefOr[ToolsList]
    var workflowId: js.UndefOr[String]
  }

  object UpdateWorkflowStepGroupResponse {
    @inline
    def apply(
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        lastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined,
        tools: js.UndefOr[ToolsList] = js.undefined,
        workflowId: js.UndefOr[String] = js.undefined
    ): UpdateWorkflowStepGroupResponse = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      tools.foreach(__v => __obj.updateDynamic("tools")(__v.asInstanceOf[js.Any]))
      workflowId.foreach(__v => __obj.updateDynamic("workflowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkflowStepGroupResponse]
    }
  }

  @js.native
  trait UpdateWorkflowStepRequest extends js.Object {
    var id: StepId
    var stepGroupId: StepGroupId
    var workflowId: MigrationWorkflowId
    var description: js.UndefOr[StepDescription]
    var name: js.UndefOr[StepName]
    var next: js.UndefOr[StringList]
    var outputs: js.UndefOr[WorkflowStepOutputList]
    var previous: js.UndefOr[StringList]
    var status: js.UndefOr[StepStatus]
    var stepActionType: js.UndefOr[StepActionType]
    var stepTarget: js.UndefOr[StringList]
    var workflowStepAutomationConfiguration: js.UndefOr[WorkflowStepAutomationConfiguration]
  }

  object UpdateWorkflowStepRequest {
    @inline
    def apply(
        id: StepId,
        stepGroupId: StepGroupId,
        workflowId: MigrationWorkflowId,
        description: js.UndefOr[StepDescription] = js.undefined,
        name: js.UndefOr[StepName] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        outputs: js.UndefOr[WorkflowStepOutputList] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined,
        status: js.UndefOr[StepStatus] = js.undefined,
        stepActionType: js.UndefOr[StepActionType] = js.undefined,
        stepTarget: js.UndefOr[StringList] = js.undefined,
        workflowStepAutomationConfiguration: js.UndefOr[WorkflowStepAutomationConfiguration] = js.undefined
    ): UpdateWorkflowStepRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "stepGroupId" -> stepGroupId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      outputs.foreach(__v => __obj.updateDynamic("outputs")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      stepActionType.foreach(__v => __obj.updateDynamic("stepActionType")(__v.asInstanceOf[js.Any]))
      stepTarget.foreach(__v => __obj.updateDynamic("stepTarget")(__v.asInstanceOf[js.Any]))
      workflowStepAutomationConfiguration.foreach(__v => __obj.updateDynamic("workflowStepAutomationConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkflowStepRequest]
    }
  }

  @js.native
  trait UpdateWorkflowStepResponse extends js.Object {
    var id: js.UndefOr[StepId]
    var name: js.UndefOr[String]
    var stepGroupId: js.UndefOr[String]
    var workflowId: js.UndefOr[String]
  }

  object UpdateWorkflowStepResponse {
    @inline
    def apply(
        id: js.UndefOr[StepId] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        stepGroupId: js.UndefOr[String] = js.undefined,
        workflowId: js.UndefOr[String] = js.undefined
    ): UpdateWorkflowStepResponse = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      stepGroupId.foreach(__v => __obj.updateDynamic("stepGroupId")(__v.asInstanceOf[js.Any]))
      workflowId.foreach(__v => __obj.updateDynamic("workflowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkflowStepResponse]
    }
  }

  /** The custom script to run tests on source or target environments.
    */
  @js.native
  trait WorkflowStepAutomationConfiguration extends js.Object {
    var command: js.UndefOr[PlatformCommand]
    var runEnvironment: js.UndefOr[RunEnvironment]
    var scriptLocationS3Bucket: js.UndefOr[S3Bucket]
    var scriptLocationS3Key: js.UndefOr[PlatformScriptKey]
    var targetType: js.UndefOr[TargetType]
  }

  object WorkflowStepAutomationConfiguration {
    @inline
    def apply(
        command: js.UndefOr[PlatformCommand] = js.undefined,
        runEnvironment: js.UndefOr[RunEnvironment] = js.undefined,
        scriptLocationS3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        scriptLocationS3Key: js.UndefOr[PlatformScriptKey] = js.undefined,
        targetType: js.UndefOr[TargetType] = js.undefined
    ): WorkflowStepAutomationConfiguration = {
      val __obj = js.Dynamic.literal()
      command.foreach(__v => __obj.updateDynamic("command")(__v.asInstanceOf[js.Any]))
      runEnvironment.foreach(__v => __obj.updateDynamic("runEnvironment")(__v.asInstanceOf[js.Any]))
      scriptLocationS3Bucket.foreach(__v => __obj.updateDynamic("scriptLocationS3Bucket")(__v.asInstanceOf[js.Any]))
      scriptLocationS3Key.foreach(__v => __obj.updateDynamic("scriptLocationS3Key")(__v.asInstanceOf[js.Any]))
      targetType.foreach(__v => __obj.updateDynamic("targetType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowStepAutomationConfiguration]
    }
  }

  /** The summary of a step group in a workflow.
    */
  @js.native
  trait WorkflowStepGroupSummary extends js.Object {
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var next: js.UndefOr[StringList]
    var owner: js.UndefOr[Owner]
    var previous: js.UndefOr[StringList]
    var status: js.UndefOr[StepGroupStatus]
  }

  object WorkflowStepGroupSummary {
    @inline
    def apply(
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        owner: js.UndefOr[Owner] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined,
        status: js.UndefOr[StepGroupStatus] = js.undefined
    ): WorkflowStepGroupSummary = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowStepGroupSummary]
    }
  }

  /** The output of a step.
    */
  @js.native
  trait WorkflowStepOutput extends js.Object {
    var dataType: js.UndefOr[DataType]
    var name: js.UndefOr[WorkflowStepOutputName]
    var required: js.UndefOr[Boolean]
    var value: js.UndefOr[WorkflowStepOutputUnion]
  }

  object WorkflowStepOutput {
    @inline
    def apply(
        dataType: js.UndefOr[DataType] = js.undefined,
        name: js.UndefOr[WorkflowStepOutputName] = js.undefined,
        required: js.UndefOr[Boolean] = js.undefined,
        value: js.UndefOr[WorkflowStepOutputUnion] = js.undefined
    ): WorkflowStepOutput = {
      val __obj = js.Dynamic.literal()
      dataType.foreach(__v => __obj.updateDynamic("dataType")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      required.foreach(__v => __obj.updateDynamic("required")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowStepOutput]
    }
  }

  /** A structure to hold multiple values of an output.
    */
  @js.native
  trait WorkflowStepOutputUnion extends js.Object {
    var integerValue: js.UndefOr[Int]
    var listOfStringValue: js.UndefOr[StringList]
    var stringValue: js.UndefOr[StringValue]
  }

  object WorkflowStepOutputUnion {
    @inline
    def apply(
        integerValue: js.UndefOr[Int] = js.undefined,
        listOfStringValue: js.UndefOr[StringList] = js.undefined,
        stringValue: js.UndefOr[StringValue] = js.undefined
    ): WorkflowStepOutputUnion = {
      val __obj = js.Dynamic.literal()
      integerValue.foreach(__v => __obj.updateDynamic("integerValue")(__v.asInstanceOf[js.Any]))
      listOfStringValue.foreach(__v => __obj.updateDynamic("listOfStringValue")(__v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.updateDynamic("stringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowStepOutputUnion]
    }
  }

  /** The summary of the step in a migration workflow.
    */
  @js.native
  trait WorkflowStepSummary extends js.Object {
    var description: js.UndefOr[String]
    var name: js.UndefOr[String]
    var next: js.UndefOr[StringList]
    var noOfSrvCompleted: js.UndefOr[Int]
    var noOfSrvFailed: js.UndefOr[Int]
    var owner: js.UndefOr[Owner]
    var previous: js.UndefOr[StringList]
    var scriptLocation: js.UndefOr[String]
    var status: js.UndefOr[StepStatus]
    var statusMessage: js.UndefOr[String]
    var stepActionType: js.UndefOr[StepActionType]
    var stepId: js.UndefOr[String]
    var totalNoOfSrv: js.UndefOr[Int]
  }

  object WorkflowStepSummary {
    @inline
    def apply(
        description: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        next: js.UndefOr[StringList] = js.undefined,
        noOfSrvCompleted: js.UndefOr[Int] = js.undefined,
        noOfSrvFailed: js.UndefOr[Int] = js.undefined,
        owner: js.UndefOr[Owner] = js.undefined,
        previous: js.UndefOr[StringList] = js.undefined,
        scriptLocation: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[StepStatus] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        stepActionType: js.UndefOr[StepActionType] = js.undefined,
        stepId: js.UndefOr[String] = js.undefined,
        totalNoOfSrv: js.UndefOr[Int] = js.undefined
    ): WorkflowStepSummary = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      next.foreach(__v => __obj.updateDynamic("next")(__v.asInstanceOf[js.Any]))
      noOfSrvCompleted.foreach(__v => __obj.updateDynamic("noOfSrvCompleted")(__v.asInstanceOf[js.Any]))
      noOfSrvFailed.foreach(__v => __obj.updateDynamic("noOfSrvFailed")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      previous.foreach(__v => __obj.updateDynamic("previous")(__v.asInstanceOf[js.Any]))
      scriptLocation.foreach(__v => __obj.updateDynamic("scriptLocation")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      stepActionType.foreach(__v => __obj.updateDynamic("stepActionType")(__v.asInstanceOf[js.Any]))
      stepId.foreach(__v => __obj.updateDynamic("stepId")(__v.asInstanceOf[js.Any]))
      totalNoOfSrv.foreach(__v => __obj.updateDynamic("totalNoOfSrv")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowStepSummary]
    }
  }
}
