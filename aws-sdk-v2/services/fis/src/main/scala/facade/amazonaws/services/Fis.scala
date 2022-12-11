package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object fis {
  type ActionDescription = String
  type ActionId = String
  type ActionParameterDescription = String
  type ActionParameterMap = js.Dictionary[ActionParameter]
  type ActionParameterName = String
  type ActionParameterRequired = Boolean
  type ActionSummaryList = js.Array[ActionSummary]
  type ActionTargetMap = js.Dictionary[ActionTarget]
  type ActionTargetName = String
  type ClientToken = String
  type CloudWatchLogGroupArn = String
  type CreateExperimentTemplateActionInputMap = js.Dictionary[CreateExperimentTemplateActionInput]
  type CreateExperimentTemplateStopConditionInputList = js.Array[CreateExperimentTemplateStopConditionInput]
  type CreateExperimentTemplateTargetInputMap = js.Dictionary[CreateExperimentTemplateTargetInput]
  type CreationTime = js.Date
  type ExperimentActionDescription = String
  type ExperimentActionEndTime = js.Date
  type ExperimentActionMap = js.Dictionary[ExperimentAction]
  type ExperimentActionName = String
  type ExperimentActionParameter = String
  type ExperimentActionParameterMap = js.Dictionary[ExperimentActionParameter]
  type ExperimentActionParameterName = String
  type ExperimentActionStartAfter = String
  type ExperimentActionStartAfterList = js.Array[ExperimentActionStartAfter]
  type ExperimentActionStartTime = js.Date
  type ExperimentActionStatusReason = String
  type ExperimentActionTargetMap = js.Dictionary[ExperimentTargetName]
  type ExperimentActionTargetName = String
  type ExperimentEndTime = js.Date
  type ExperimentId = String
  type ExperimentStartTime = js.Date
  type ExperimentStatusReason = String
  type ExperimentStopConditionList = js.Array[ExperimentStopCondition]
  type ExperimentSummaryList = js.Array[ExperimentSummary]
  type ExperimentTargetFilterList = js.Array[ExperimentTargetFilter]
  type ExperimentTargetFilterPath = String
  type ExperimentTargetFilterValue = String
  type ExperimentTargetFilterValues = js.Array[ExperimentTargetFilterValue]
  type ExperimentTargetMap = js.Dictionary[ExperimentTarget]
  type ExperimentTargetName = String
  type ExperimentTargetParameterMap = js.Dictionary[ExperimentTargetParameterValue]
  type ExperimentTargetParameterName = String
  type ExperimentTargetParameterValue = String
  type ExperimentTargetSelectionMode = String
  type ExperimentTemplateActionDescription = String
  type ExperimentTemplateActionMap = js.Dictionary[ExperimentTemplateAction]
  type ExperimentTemplateActionName = String
  type ExperimentTemplateActionParameter = String
  type ExperimentTemplateActionParameterMap = js.Dictionary[ExperimentTemplateActionParameter]
  type ExperimentTemplateActionParameterName = String
  type ExperimentTemplateActionStartAfter = String
  type ExperimentTemplateActionStartAfterList = js.Array[ExperimentTemplateActionStartAfter]
  type ExperimentTemplateActionTargetMap = js.Dictionary[ExperimentTemplateTargetName]
  type ExperimentTemplateActionTargetName = String
  type ExperimentTemplateDescription = String
  type ExperimentTemplateId = String
  type ExperimentTemplateStopConditionList = js.Array[ExperimentTemplateStopCondition]
  type ExperimentTemplateSummaryList = js.Array[ExperimentTemplateSummary]
  type ExperimentTemplateTargetFilterInputList = js.Array[ExperimentTemplateTargetInputFilter]
  type ExperimentTemplateTargetFilterList = js.Array[ExperimentTemplateTargetFilter]
  type ExperimentTemplateTargetFilterPath = String
  type ExperimentTemplateTargetFilterValue = String
  type ExperimentTemplateTargetFilterValues = js.Array[ExperimentTemplateTargetFilterValue]
  type ExperimentTemplateTargetMap = js.Dictionary[ExperimentTemplateTarget]
  type ExperimentTemplateTargetName = String
  type ExperimentTemplateTargetParameterMap = js.Dictionary[ExperimentTemplateTargetParameterValue]
  type ExperimentTemplateTargetParameterName = String
  type ExperimentTemplateTargetParameterValue = String
  type ExperimentTemplateTargetSelectionMode = String
  type LastUpdateTime = js.Date
  type ListActionsMaxResults = Int
  type ListExperimentTemplatesMaxResults = Int
  type ListExperimentsMaxResults = Int
  type ListTargetResourceTypesMaxResults = Int
  type LogSchemaVersion = Int
  type NextToken = String
  type ResourceArn = String
  type ResourceArnList = js.Array[ResourceArn]
  type RoleArn = String
  type S3BucketName = String
  type S3ObjectKey = String
  type StopConditionSource = String
  type StopConditionValue = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TargetResourceTypeDescription = String
  type TargetResourceTypeId = String
  type TargetResourceTypeParameterDescription = String
  type TargetResourceTypeParameterMap = js.Dictionary[TargetResourceTypeParameter]
  type TargetResourceTypeParameterName = String
  type TargetResourceTypeParameterRequired = Boolean
  type TargetResourceTypeSummaryList = js.Array[TargetResourceTypeSummary]
  type UpdateExperimentTemplateActionInputMap = js.Dictionary[UpdateExperimentTemplateActionInputItem]
  type UpdateExperimentTemplateStopConditionInputList = js.Array[UpdateExperimentTemplateStopConditionInput]
  type UpdateExperimentTemplateTargetInputMap = js.Dictionary[UpdateExperimentTemplateTargetInput]

  final class FisOps(private val service: Fis) extends AnyVal {

    @inline def createExperimentTemplateFuture(params: CreateExperimentTemplateRequest): Future[CreateExperimentTemplateResponse] = service.createExperimentTemplate(params).promise().toFuture
    @inline def deleteExperimentTemplateFuture(params: DeleteExperimentTemplateRequest): Future[DeleteExperimentTemplateResponse] = service.deleteExperimentTemplate(params).promise().toFuture
    @inline def getActionFuture(params: GetActionRequest): Future[GetActionResponse] = service.getAction(params).promise().toFuture
    @inline def getExperimentFuture(params: GetExperimentRequest): Future[GetExperimentResponse] = service.getExperiment(params).promise().toFuture
    @inline def getExperimentTemplateFuture(params: GetExperimentTemplateRequest): Future[GetExperimentTemplateResponse] = service.getExperimentTemplate(params).promise().toFuture
    @inline def getTargetResourceTypeFuture(params: GetTargetResourceTypeRequest): Future[GetTargetResourceTypeResponse] = service.getTargetResourceType(params).promise().toFuture
    @inline def listActionsFuture(params: ListActionsRequest): Future[ListActionsResponse] = service.listActions(params).promise().toFuture
    @inline def listExperimentTemplatesFuture(params: ListExperimentTemplatesRequest): Future[ListExperimentTemplatesResponse] = service.listExperimentTemplates(params).promise().toFuture
    @inline def listExperimentsFuture(params: ListExperimentsRequest): Future[ListExperimentsResponse] = service.listExperiments(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTargetResourceTypesFuture(params: ListTargetResourceTypesRequest): Future[ListTargetResourceTypesResponse] = service.listTargetResourceTypes(params).promise().toFuture
    @inline def startExperimentFuture(params: StartExperimentRequest): Future[StartExperimentResponse] = service.startExperiment(params).promise().toFuture
    @inline def stopExperimentFuture(params: StopExperimentRequest): Future[StopExperimentResponse] = service.stopExperiment(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateExperimentTemplateFuture(params: UpdateExperimentTemplateRequest): Future[UpdateExperimentTemplateResponse] = service.updateExperimentTemplate(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/fis", JSImport.Namespace, "AWS.Fis")
  class Fis() extends js.Object {
    def this(config: AWSConfig) = this()

    def createExperimentTemplate(params: CreateExperimentTemplateRequest): Request[CreateExperimentTemplateResponse] = js.native
    def deleteExperimentTemplate(params: DeleteExperimentTemplateRequest): Request[DeleteExperimentTemplateResponse] = js.native
    def getAction(params: GetActionRequest): Request[GetActionResponse] = js.native
    def getExperiment(params: GetExperimentRequest): Request[GetExperimentResponse] = js.native
    def getExperimentTemplate(params: GetExperimentTemplateRequest): Request[GetExperimentTemplateResponse] = js.native
    def getTargetResourceType(params: GetTargetResourceTypeRequest): Request[GetTargetResourceTypeResponse] = js.native
    def listActions(params: ListActionsRequest): Request[ListActionsResponse] = js.native
    def listExperimentTemplates(params: ListExperimentTemplatesRequest): Request[ListExperimentTemplatesResponse] = js.native
    def listExperiments(params: ListExperimentsRequest): Request[ListExperimentsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTargetResourceTypes(params: ListTargetResourceTypesRequest): Request[ListTargetResourceTypesResponse] = js.native
    def startExperiment(params: StartExperimentRequest): Request[StartExperimentResponse] = js.native
    def stopExperiment(params: StopExperimentRequest): Request[StopExperimentResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateExperimentTemplate(params: UpdateExperimentTemplateRequest): Request[UpdateExperimentTemplateResponse] = js.native
  }
  object Fis {
    @inline implicit def toOps(service: Fis): FisOps = {
      new FisOps(service)
    }
  }

  /** Describes an action. For more information, see [[https://docs.aws.amazon.com/fis/latest/userguide/fis-actions-reference.html|FIS actions]] in the <i>Fault Injection Simulator User Guide</i>.
    */
  @js.native
  trait Action extends js.Object {
    var description: js.UndefOr[ActionDescription]
    var id: js.UndefOr[ActionId]
    var parameters: js.UndefOr[ActionParameterMap]
    var tags: js.UndefOr[TagMap]
    var targets: js.UndefOr[ActionTargetMap]
  }

  object Action {
    @inline
    def apply(
        description: js.UndefOr[ActionDescription] = js.undefined,
        id: js.UndefOr[ActionId] = js.undefined,
        parameters: js.UndefOr[ActionParameterMap] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        targets: js.UndefOr[ActionTargetMap] = js.undefined
    ): Action = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  /** Describes a parameter for an action.
    */
  @js.native
  trait ActionParameter extends js.Object {
    var description: js.UndefOr[ActionParameterDescription]
    var required: js.UndefOr[ActionParameterRequired]
  }

  object ActionParameter {
    @inline
    def apply(
        description: js.UndefOr[ActionParameterDescription] = js.undefined,
        required: js.UndefOr[ActionParameterRequired] = js.undefined
    ): ActionParameter = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      required.foreach(__v => __obj.updateDynamic("required")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionParameter]
    }
  }

  /** Provides a summary of an action.
    */
  @js.native
  trait ActionSummary extends js.Object {
    var description: js.UndefOr[ActionDescription]
    var id: js.UndefOr[ActionId]
    var tags: js.UndefOr[TagMap]
    var targets: js.UndefOr[ActionTargetMap]
  }

  object ActionSummary {
    @inline
    def apply(
        description: js.UndefOr[ActionDescription] = js.undefined,
        id: js.UndefOr[ActionId] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        targets: js.UndefOr[ActionTargetMap] = js.undefined
    ): ActionSummary = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionSummary]
    }
  }

  /** Describes a target for an action.
    */
  @js.native
  trait ActionTarget extends js.Object {
    var resourceType: js.UndefOr[TargetResourceTypeId]
  }

  object ActionTarget {
    @inline
    def apply(
        resourceType: js.UndefOr[TargetResourceTypeId] = js.undefined
    ): ActionTarget = {
      val __obj = js.Dynamic.literal()
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionTarget]
    }
  }

  /** Specifies an action for an experiment template. For more information, see [[https://docs.aws.amazon.com/fis/latest/userguide/actions.html|Actions]] in the <i>Fault Injection Simulator User Guide</i>.
    */
  @js.native
  trait CreateExperimentTemplateActionInput extends js.Object {
    var actionId: ActionId
    var description: js.UndefOr[ExperimentTemplateActionDescription]
    var parameters: js.UndefOr[ExperimentTemplateActionParameterMap]
    var startAfter: js.UndefOr[ExperimentTemplateActionStartAfterList]
    var targets: js.UndefOr[ExperimentTemplateActionTargetMap]
  }

  object CreateExperimentTemplateActionInput {
    @inline
    def apply(
        actionId: ActionId,
        description: js.UndefOr[ExperimentTemplateActionDescription] = js.undefined,
        parameters: js.UndefOr[ExperimentTemplateActionParameterMap] = js.undefined,
        startAfter: js.UndefOr[ExperimentTemplateActionStartAfterList] = js.undefined,
        targets: js.UndefOr[ExperimentTemplateActionTargetMap] = js.undefined
    ): CreateExperimentTemplateActionInput = {
      val __obj = js.Dynamic.literal(
        "actionId" -> actionId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      startAfter.foreach(__v => __obj.updateDynamic("startAfter")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExperimentTemplateActionInput]
    }
  }

  /** Specifies the configuration for experiment logging.
    */
  @js.native
  trait CreateExperimentTemplateLogConfigurationInput extends js.Object {
    var logSchemaVersion: LogSchemaVersion
    var cloudWatchLogsConfiguration: js.UndefOr[ExperimentTemplateCloudWatchLogsLogConfigurationInput]
    var s3Configuration: js.UndefOr[ExperimentTemplateS3LogConfigurationInput]
  }

  object CreateExperimentTemplateLogConfigurationInput {
    @inline
    def apply(
        logSchemaVersion: LogSchemaVersion,
        cloudWatchLogsConfiguration: js.UndefOr[ExperimentTemplateCloudWatchLogsLogConfigurationInput] = js.undefined,
        s3Configuration: js.UndefOr[ExperimentTemplateS3LogConfigurationInput] = js.undefined
    ): CreateExperimentTemplateLogConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "logSchemaVersion" -> logSchemaVersion.asInstanceOf[js.Any]
      )

      cloudWatchLogsConfiguration.foreach(__v => __obj.updateDynamic("cloudWatchLogsConfiguration")(__v.asInstanceOf[js.Any]))
      s3Configuration.foreach(__v => __obj.updateDynamic("s3Configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExperimentTemplateLogConfigurationInput]
    }
  }

  @js.native
  trait CreateExperimentTemplateRequest extends js.Object {
    var actions: CreateExperimentTemplateActionInputMap
    var clientToken: ClientToken
    var description: ExperimentTemplateDescription
    var roleArn: RoleArn
    var stopConditions: CreateExperimentTemplateStopConditionInputList
    var logConfiguration: js.UndefOr[CreateExperimentTemplateLogConfigurationInput]
    var tags: js.UndefOr[TagMap]
    var targets: js.UndefOr[CreateExperimentTemplateTargetInputMap]
  }

  object CreateExperimentTemplateRequest {
    @inline
    def apply(
        actions: CreateExperimentTemplateActionInputMap,
        clientToken: ClientToken,
        description: ExperimentTemplateDescription,
        roleArn: RoleArn,
        stopConditions: CreateExperimentTemplateStopConditionInputList,
        logConfiguration: js.UndefOr[CreateExperimentTemplateLogConfigurationInput] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        targets: js.UndefOr[CreateExperimentTemplateTargetInputMap] = js.undefined
    ): CreateExperimentTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "actions" -> actions.asInstanceOf[js.Any],
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "stopConditions" -> stopConditions.asInstanceOf[js.Any]
      )

      logConfiguration.foreach(__v => __obj.updateDynamic("logConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExperimentTemplateRequest]
    }
  }

  @js.native
  trait CreateExperimentTemplateResponse extends js.Object {
    var experimentTemplate: js.UndefOr[ExperimentTemplate]
  }

  object CreateExperimentTemplateResponse {
    @inline
    def apply(
        experimentTemplate: js.UndefOr[ExperimentTemplate] = js.undefined
    ): CreateExperimentTemplateResponse = {
      val __obj = js.Dynamic.literal()
      experimentTemplate.foreach(__v => __obj.updateDynamic("experimentTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExperimentTemplateResponse]
    }
  }

  /** Specifies a stop condition for an experiment template.
    */
  @js.native
  trait CreateExperimentTemplateStopConditionInput extends js.Object {
    var source: StopConditionSource
    var value: js.UndefOr[StopConditionValue]
  }

  object CreateExperimentTemplateStopConditionInput {
    @inline
    def apply(
        source: StopConditionSource,
        value: js.UndefOr[StopConditionValue] = js.undefined
    ): CreateExperimentTemplateStopConditionInput = {
      val __obj = js.Dynamic.literal(
        "source" -> source.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExperimentTemplateStopConditionInput]
    }
  }

  /** Specifies a target for an experiment. You must specify at least one Amazon Resource Name (ARN) or at least one resource tag. You cannot specify both ARNs and tags. For more information, see [[https://docs.aws.amazon.com/fis/latest/userguide/targets.html|Targets]] in the <i>Fault Injection Simulator User Guide</i>.
    */
  @js.native
  trait CreateExperimentTemplateTargetInput extends js.Object {
    var resourceType: TargetResourceTypeId
    var selectionMode: ExperimentTemplateTargetSelectionMode
    var filters: js.UndefOr[ExperimentTemplateTargetFilterInputList]
    var parameters: js.UndefOr[ExperimentTemplateTargetParameterMap]
    var resourceArns: js.UndefOr[ResourceArnList]
    var resourceTags: js.UndefOr[TagMap]
  }

  object CreateExperimentTemplateTargetInput {
    @inline
    def apply(
        resourceType: TargetResourceTypeId,
        selectionMode: ExperimentTemplateTargetSelectionMode,
        filters: js.UndefOr[ExperimentTemplateTargetFilterInputList] = js.undefined,
        parameters: js.UndefOr[ExperimentTemplateTargetParameterMap] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
        resourceTags: js.UndefOr[TagMap] = js.undefined
    ): CreateExperimentTemplateTargetInput = {
      val __obj = js.Dynamic.literal(
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "selectionMode" -> selectionMode.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      resourceArns.foreach(__v => __obj.updateDynamic("resourceArns")(__v.asInstanceOf[js.Any]))
      resourceTags.foreach(__v => __obj.updateDynamic("resourceTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExperimentTemplateTargetInput]
    }
  }

  @js.native
  trait DeleteExperimentTemplateRequest extends js.Object {
    var id: ExperimentTemplateId
  }

  object DeleteExperimentTemplateRequest {
    @inline
    def apply(
        id: ExperimentTemplateId
    ): DeleteExperimentTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteExperimentTemplateRequest]
    }
  }

  @js.native
  trait DeleteExperimentTemplateResponse extends js.Object {
    var experimentTemplate: js.UndefOr[ExperimentTemplate]
  }

  object DeleteExperimentTemplateResponse {
    @inline
    def apply(
        experimentTemplate: js.UndefOr[ExperimentTemplate] = js.undefined
    ): DeleteExperimentTemplateResponse = {
      val __obj = js.Dynamic.literal()
      experimentTemplate.foreach(__v => __obj.updateDynamic("experimentTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteExperimentTemplateResponse]
    }
  }

  /** Describes an experiment.
    */
  @js.native
  trait Experiment extends js.Object {
    var actions: js.UndefOr[ExperimentActionMap]
    var creationTime: js.UndefOr[CreationTime]
    var endTime: js.UndefOr[ExperimentEndTime]
    var experimentTemplateId: js.UndefOr[ExperimentTemplateId]
    var id: js.UndefOr[ExperimentId]
    var logConfiguration: js.UndefOr[ExperimentLogConfiguration]
    var roleArn: js.UndefOr[RoleArn]
    var startTime: js.UndefOr[ExperimentStartTime]
    var state: js.UndefOr[ExperimentState]
    var stopConditions: js.UndefOr[ExperimentStopConditionList]
    var tags: js.UndefOr[TagMap]
    var targets: js.UndefOr[ExperimentTargetMap]
  }

  object Experiment {
    @inline
    def apply(
        actions: js.UndefOr[ExperimentActionMap] = js.undefined,
        creationTime: js.UndefOr[CreationTime] = js.undefined,
        endTime: js.UndefOr[ExperimentEndTime] = js.undefined,
        experimentTemplateId: js.UndefOr[ExperimentTemplateId] = js.undefined,
        id: js.UndefOr[ExperimentId] = js.undefined,
        logConfiguration: js.UndefOr[ExperimentLogConfiguration] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        startTime: js.UndefOr[ExperimentStartTime] = js.undefined,
        state: js.UndefOr[ExperimentState] = js.undefined,
        stopConditions: js.UndefOr[ExperimentStopConditionList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        targets: js.UndefOr[ExperimentTargetMap] = js.undefined
    ): Experiment = {
      val __obj = js.Dynamic.literal()
      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      experimentTemplateId.foreach(__v => __obj.updateDynamic("experimentTemplateId")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      logConfiguration.foreach(__v => __obj.updateDynamic("logConfiguration")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      stopConditions.foreach(__v => __obj.updateDynamic("stopConditions")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Experiment]
    }
  }

  /** Describes the action for an experiment.
    */
  @js.native
  trait ExperimentAction extends js.Object {
    var actionId: js.UndefOr[ActionId]
    var description: js.UndefOr[ExperimentActionDescription]
    var endTime: js.UndefOr[ExperimentActionEndTime]
    var parameters: js.UndefOr[ExperimentActionParameterMap]
    var startAfter: js.UndefOr[ExperimentActionStartAfterList]
    var startTime: js.UndefOr[ExperimentActionStartTime]
    var state: js.UndefOr[ExperimentActionState]
    var targets: js.UndefOr[ExperimentActionTargetMap]
  }

  object ExperimentAction {
    @inline
    def apply(
        actionId: js.UndefOr[ActionId] = js.undefined,
        description: js.UndefOr[ExperimentActionDescription] = js.undefined,
        endTime: js.UndefOr[ExperimentActionEndTime] = js.undefined,
        parameters: js.UndefOr[ExperimentActionParameterMap] = js.undefined,
        startAfter: js.UndefOr[ExperimentActionStartAfterList] = js.undefined,
        startTime: js.UndefOr[ExperimentActionStartTime] = js.undefined,
        state: js.UndefOr[ExperimentActionState] = js.undefined,
        targets: js.UndefOr[ExperimentActionTargetMap] = js.undefined
    ): ExperimentAction = {
      val __obj = js.Dynamic.literal()
      actionId.foreach(__v => __obj.updateDynamic("actionId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      startAfter.foreach(__v => __obj.updateDynamic("startAfter")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentAction]
    }
  }

  /** Describes the state of an action.
    */
  @js.native
  trait ExperimentActionState extends js.Object {
    var reason: js.UndefOr[ExperimentActionStatusReason]
    var status: js.UndefOr[ExperimentActionStatus]
  }

  object ExperimentActionState {
    @inline
    def apply(
        reason: js.UndefOr[ExperimentActionStatusReason] = js.undefined,
        status: js.UndefOr[ExperimentActionStatus] = js.undefined
    ): ExperimentActionState = {
      val __obj = js.Dynamic.literal()
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentActionState]
    }
  }

  /** Describes the configuration for experiment logging to Amazon CloudWatch Logs.
    */
  @js.native
  trait ExperimentCloudWatchLogsLogConfiguration extends js.Object {
    var logGroupArn: js.UndefOr[CloudWatchLogGroupArn]
  }

  object ExperimentCloudWatchLogsLogConfiguration {
    @inline
    def apply(
        logGroupArn: js.UndefOr[CloudWatchLogGroupArn] = js.undefined
    ): ExperimentCloudWatchLogsLogConfiguration = {
      val __obj = js.Dynamic.literal()
      logGroupArn.foreach(__v => __obj.updateDynamic("logGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentCloudWatchLogsLogConfiguration]
    }
  }

  /** Describes the configuration for experiment logging.
    */
  @js.native
  trait ExperimentLogConfiguration extends js.Object {
    var cloudWatchLogsConfiguration: js.UndefOr[ExperimentCloudWatchLogsLogConfiguration]
    var logSchemaVersion: js.UndefOr[LogSchemaVersion]
    var s3Configuration: js.UndefOr[ExperimentS3LogConfiguration]
  }

  object ExperimentLogConfiguration {
    @inline
    def apply(
        cloudWatchLogsConfiguration: js.UndefOr[ExperimentCloudWatchLogsLogConfiguration] = js.undefined,
        logSchemaVersion: js.UndefOr[LogSchemaVersion] = js.undefined,
        s3Configuration: js.UndefOr[ExperimentS3LogConfiguration] = js.undefined
    ): ExperimentLogConfiguration = {
      val __obj = js.Dynamic.literal()
      cloudWatchLogsConfiguration.foreach(__v => __obj.updateDynamic("cloudWatchLogsConfiguration")(__v.asInstanceOf[js.Any]))
      logSchemaVersion.foreach(__v => __obj.updateDynamic("logSchemaVersion")(__v.asInstanceOf[js.Any]))
      s3Configuration.foreach(__v => __obj.updateDynamic("s3Configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentLogConfiguration]
    }
  }

  /** Describes the configuration for experiment logging to Amazon S3.
    */
  @js.native
  trait ExperimentS3LogConfiguration extends js.Object {
    var bucketName: js.UndefOr[S3BucketName]
    var prefix: js.UndefOr[S3ObjectKey]
  }

  object ExperimentS3LogConfiguration {
    @inline
    def apply(
        bucketName: js.UndefOr[S3BucketName] = js.undefined,
        prefix: js.UndefOr[S3ObjectKey] = js.undefined
    ): ExperimentS3LogConfiguration = {
      val __obj = js.Dynamic.literal()
      bucketName.foreach(__v => __obj.updateDynamic("bucketName")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentS3LogConfiguration]
    }
  }

  /** Describes the state of an experiment.
    */
  @js.native
  trait ExperimentState extends js.Object {
    var reason: js.UndefOr[ExperimentStatusReason]
    var status: js.UndefOr[ExperimentStatus]
  }

  object ExperimentState {
    @inline
    def apply(
        reason: js.UndefOr[ExperimentStatusReason] = js.undefined,
        status: js.UndefOr[ExperimentStatus] = js.undefined
    ): ExperimentState = {
      val __obj = js.Dynamic.literal()
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentState]
    }
  }

  /** Describes the stop condition for an experiment.
    */
  @js.native
  trait ExperimentStopCondition extends js.Object {
    var source: js.UndefOr[StopConditionSource]
    var value: js.UndefOr[StopConditionValue]
  }

  object ExperimentStopCondition {
    @inline
    def apply(
        source: js.UndefOr[StopConditionSource] = js.undefined,
        value: js.UndefOr[StopConditionValue] = js.undefined
    ): ExperimentStopCondition = {
      val __obj = js.Dynamic.literal()
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentStopCondition]
    }
  }

  /** Provides a summary of an experiment.
    */
  @js.native
  trait ExperimentSummary extends js.Object {
    var creationTime: js.UndefOr[CreationTime]
    var experimentTemplateId: js.UndefOr[ExperimentTemplateId]
    var id: js.UndefOr[ExperimentId]
    var state: js.UndefOr[ExperimentState]
    var tags: js.UndefOr[TagMap]
  }

  object ExperimentSummary {
    @inline
    def apply(
        creationTime: js.UndefOr[CreationTime] = js.undefined,
        experimentTemplateId: js.UndefOr[ExperimentTemplateId] = js.undefined,
        id: js.UndefOr[ExperimentId] = js.undefined,
        state: js.UndefOr[ExperimentState] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): ExperimentSummary = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      experimentTemplateId.foreach(__v => __obj.updateDynamic("experimentTemplateId")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentSummary]
    }
  }

  /** Describes a target for an experiment.
    */
  @js.native
  trait ExperimentTarget extends js.Object {
    var filters: js.UndefOr[ExperimentTargetFilterList]
    var parameters: js.UndefOr[ExperimentTargetParameterMap]
    var resourceArns: js.UndefOr[ResourceArnList]
    var resourceTags: js.UndefOr[TagMap]
    var resourceType: js.UndefOr[TargetResourceTypeId]
    var selectionMode: js.UndefOr[ExperimentTargetSelectionMode]
  }

  object ExperimentTarget {
    @inline
    def apply(
        filters: js.UndefOr[ExperimentTargetFilterList] = js.undefined,
        parameters: js.UndefOr[ExperimentTargetParameterMap] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
        resourceTags: js.UndefOr[TagMap] = js.undefined,
        resourceType: js.UndefOr[TargetResourceTypeId] = js.undefined,
        selectionMode: js.UndefOr[ExperimentTargetSelectionMode] = js.undefined
    ): ExperimentTarget = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      resourceArns.foreach(__v => __obj.updateDynamic("resourceArns")(__v.asInstanceOf[js.Any]))
      resourceTags.foreach(__v => __obj.updateDynamic("resourceTags")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      selectionMode.foreach(__v => __obj.updateDynamic("selectionMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentTarget]
    }
  }

  /** Describes a filter used for the target resources in an experiment.
    */
  @js.native
  trait ExperimentTargetFilter extends js.Object {
    var path: js.UndefOr[ExperimentTargetFilterPath]
    var values: js.UndefOr[ExperimentTargetFilterValues]
  }

  object ExperimentTargetFilter {
    @inline
    def apply(
        path: js.UndefOr[ExperimentTargetFilterPath] = js.undefined,
        values: js.UndefOr[ExperimentTargetFilterValues] = js.undefined
    ): ExperimentTargetFilter = {
      val __obj = js.Dynamic.literal()
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentTargetFilter]
    }
  }

  /** Describes an experiment template.
    */
  @js.native
  trait ExperimentTemplate extends js.Object {
    var actions: js.UndefOr[ExperimentTemplateActionMap]
    var creationTime: js.UndefOr[CreationTime]
    var description: js.UndefOr[ExperimentTemplateDescription]
    var id: js.UndefOr[ExperimentTemplateId]
    var lastUpdateTime: js.UndefOr[LastUpdateTime]
    var logConfiguration: js.UndefOr[ExperimentTemplateLogConfiguration]
    var roleArn: js.UndefOr[RoleArn]
    var stopConditions: js.UndefOr[ExperimentTemplateStopConditionList]
    var tags: js.UndefOr[TagMap]
    var targets: js.UndefOr[ExperimentTemplateTargetMap]
  }

  object ExperimentTemplate {
    @inline
    def apply(
        actions: js.UndefOr[ExperimentTemplateActionMap] = js.undefined,
        creationTime: js.UndefOr[CreationTime] = js.undefined,
        description: js.UndefOr[ExperimentTemplateDescription] = js.undefined,
        id: js.UndefOr[ExperimentTemplateId] = js.undefined,
        lastUpdateTime: js.UndefOr[LastUpdateTime] = js.undefined,
        logConfiguration: js.UndefOr[ExperimentTemplateLogConfiguration] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        stopConditions: js.UndefOr[ExperimentTemplateStopConditionList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        targets: js.UndefOr[ExperimentTemplateTargetMap] = js.undefined
    ): ExperimentTemplate = {
      val __obj = js.Dynamic.literal()
      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      logConfiguration.foreach(__v => __obj.updateDynamic("logConfiguration")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      stopConditions.foreach(__v => __obj.updateDynamic("stopConditions")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentTemplate]
    }
  }

  /** Describes an action for an experiment template.
    */
  @js.native
  trait ExperimentTemplateAction extends js.Object {
    var actionId: js.UndefOr[ActionId]
    var description: js.UndefOr[ExperimentTemplateActionDescription]
    var parameters: js.UndefOr[ExperimentTemplateActionParameterMap]
    var startAfter: js.UndefOr[ExperimentTemplateActionStartAfterList]
    var targets: js.UndefOr[ExperimentTemplateActionTargetMap]
  }

  object ExperimentTemplateAction {
    @inline
    def apply(
        actionId: js.UndefOr[ActionId] = js.undefined,
        description: js.UndefOr[ExperimentTemplateActionDescription] = js.undefined,
        parameters: js.UndefOr[ExperimentTemplateActionParameterMap] = js.undefined,
        startAfter: js.UndefOr[ExperimentTemplateActionStartAfterList] = js.undefined,
        targets: js.UndefOr[ExperimentTemplateActionTargetMap] = js.undefined
    ): ExperimentTemplateAction = {
      val __obj = js.Dynamic.literal()
      actionId.foreach(__v => __obj.updateDynamic("actionId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      startAfter.foreach(__v => __obj.updateDynamic("startAfter")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentTemplateAction]
    }
  }

  /** Describes the configuration for experiment logging to Amazon CloudWatch Logs.
    */
  @js.native
  trait ExperimentTemplateCloudWatchLogsLogConfiguration extends js.Object {
    var logGroupArn: js.UndefOr[CloudWatchLogGroupArn]
  }

  object ExperimentTemplateCloudWatchLogsLogConfiguration {
    @inline
    def apply(
        logGroupArn: js.UndefOr[CloudWatchLogGroupArn] = js.undefined
    ): ExperimentTemplateCloudWatchLogsLogConfiguration = {
      val __obj = js.Dynamic.literal()
      logGroupArn.foreach(__v => __obj.updateDynamic("logGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentTemplateCloudWatchLogsLogConfiguration]
    }
  }

  /** Specifies the configuration for experiment logging to Amazon CloudWatch Logs.
    */
  @js.native
  trait ExperimentTemplateCloudWatchLogsLogConfigurationInput extends js.Object {
    var logGroupArn: CloudWatchLogGroupArn
  }

  object ExperimentTemplateCloudWatchLogsLogConfigurationInput {
    @inline
    def apply(
        logGroupArn: CloudWatchLogGroupArn
    ): ExperimentTemplateCloudWatchLogsLogConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "logGroupArn" -> logGroupArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExperimentTemplateCloudWatchLogsLogConfigurationInput]
    }
  }

  /** Describes the configuration for experiment logging.
    */
  @js.native
  trait ExperimentTemplateLogConfiguration extends js.Object {
    var cloudWatchLogsConfiguration: js.UndefOr[ExperimentTemplateCloudWatchLogsLogConfiguration]
    var logSchemaVersion: js.UndefOr[LogSchemaVersion]
    var s3Configuration: js.UndefOr[ExperimentTemplateS3LogConfiguration]
  }

  object ExperimentTemplateLogConfiguration {
    @inline
    def apply(
        cloudWatchLogsConfiguration: js.UndefOr[ExperimentTemplateCloudWatchLogsLogConfiguration] = js.undefined,
        logSchemaVersion: js.UndefOr[LogSchemaVersion] = js.undefined,
        s3Configuration: js.UndefOr[ExperimentTemplateS3LogConfiguration] = js.undefined
    ): ExperimentTemplateLogConfiguration = {
      val __obj = js.Dynamic.literal()
      cloudWatchLogsConfiguration.foreach(__v => __obj.updateDynamic("cloudWatchLogsConfiguration")(__v.asInstanceOf[js.Any]))
      logSchemaVersion.foreach(__v => __obj.updateDynamic("logSchemaVersion")(__v.asInstanceOf[js.Any]))
      s3Configuration.foreach(__v => __obj.updateDynamic("s3Configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentTemplateLogConfiguration]
    }
  }

  /** Describes the configuration for experiment logging to Amazon S3.
    */
  @js.native
  trait ExperimentTemplateS3LogConfiguration extends js.Object {
    var bucketName: js.UndefOr[S3BucketName]
    var prefix: js.UndefOr[S3ObjectKey]
  }

  object ExperimentTemplateS3LogConfiguration {
    @inline
    def apply(
        bucketName: js.UndefOr[S3BucketName] = js.undefined,
        prefix: js.UndefOr[S3ObjectKey] = js.undefined
    ): ExperimentTemplateS3LogConfiguration = {
      val __obj = js.Dynamic.literal()
      bucketName.foreach(__v => __obj.updateDynamic("bucketName")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentTemplateS3LogConfiguration]
    }
  }

  /** Specifies the configuration for experiment logging to Amazon S3.
    */
  @js.native
  trait ExperimentTemplateS3LogConfigurationInput extends js.Object {
    var bucketName: S3BucketName
    var prefix: js.UndefOr[S3ObjectKey]
  }

  object ExperimentTemplateS3LogConfigurationInput {
    @inline
    def apply(
        bucketName: S3BucketName,
        prefix: js.UndefOr[S3ObjectKey] = js.undefined
    ): ExperimentTemplateS3LogConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any]
      )

      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentTemplateS3LogConfigurationInput]
    }
  }

  /** Describes a stop condition for an experiment template.
    */
  @js.native
  trait ExperimentTemplateStopCondition extends js.Object {
    var source: js.UndefOr[StopConditionSource]
    var value: js.UndefOr[StopConditionValue]
  }

  object ExperimentTemplateStopCondition {
    @inline
    def apply(
        source: js.UndefOr[StopConditionSource] = js.undefined,
        value: js.UndefOr[StopConditionValue] = js.undefined
    ): ExperimentTemplateStopCondition = {
      val __obj = js.Dynamic.literal()
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentTemplateStopCondition]
    }
  }

  /** Provides a summary of an experiment template.
    */
  @js.native
  trait ExperimentTemplateSummary extends js.Object {
    var creationTime: js.UndefOr[CreationTime]
    var description: js.UndefOr[ExperimentTemplateDescription]
    var id: js.UndefOr[ExperimentTemplateId]
    var lastUpdateTime: js.UndefOr[LastUpdateTime]
    var tags: js.UndefOr[TagMap]
  }

  object ExperimentTemplateSummary {
    @inline
    def apply(
        creationTime: js.UndefOr[CreationTime] = js.undefined,
        description: js.UndefOr[ExperimentTemplateDescription] = js.undefined,
        id: js.UndefOr[ExperimentTemplateId] = js.undefined,
        lastUpdateTime: js.UndefOr[LastUpdateTime] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): ExperimentTemplateSummary = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentTemplateSummary]
    }
  }

  /** Describes a target for an experiment template.
    */
  @js.native
  trait ExperimentTemplateTarget extends js.Object {
    var filters: js.UndefOr[ExperimentTemplateTargetFilterList]
    var parameters: js.UndefOr[ExperimentTemplateTargetParameterMap]
    var resourceArns: js.UndefOr[ResourceArnList]
    var resourceTags: js.UndefOr[TagMap]
    var resourceType: js.UndefOr[TargetResourceTypeId]
    var selectionMode: js.UndefOr[ExperimentTemplateTargetSelectionMode]
  }

  object ExperimentTemplateTarget {
    @inline
    def apply(
        filters: js.UndefOr[ExperimentTemplateTargetFilterList] = js.undefined,
        parameters: js.UndefOr[ExperimentTemplateTargetParameterMap] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
        resourceTags: js.UndefOr[TagMap] = js.undefined,
        resourceType: js.UndefOr[TargetResourceTypeId] = js.undefined,
        selectionMode: js.UndefOr[ExperimentTemplateTargetSelectionMode] = js.undefined
    ): ExperimentTemplateTarget = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      resourceArns.foreach(__v => __obj.updateDynamic("resourceArns")(__v.asInstanceOf[js.Any]))
      resourceTags.foreach(__v => __obj.updateDynamic("resourceTags")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      selectionMode.foreach(__v => __obj.updateDynamic("selectionMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentTemplateTarget]
    }
  }

  /** Describes a filter used for the target resources in an experiment template.
    */
  @js.native
  trait ExperimentTemplateTargetFilter extends js.Object {
    var path: js.UndefOr[ExperimentTemplateTargetFilterPath]
    var values: js.UndefOr[ExperimentTemplateTargetFilterValues]
  }

  object ExperimentTemplateTargetFilter {
    @inline
    def apply(
        path: js.UndefOr[ExperimentTemplateTargetFilterPath] = js.undefined,
        values: js.UndefOr[ExperimentTemplateTargetFilterValues] = js.undefined
    ): ExperimentTemplateTargetFilter = {
      val __obj = js.Dynamic.literal()
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperimentTemplateTargetFilter]
    }
  }

  /** Specifies a filter used for the target resource input in an experiment template. For more information, see [[https://docs.aws.amazon.com/fis/latest/userguide/targets.html#target-filters|Resource filters]] in the <i>Fault Injection Simulator User Guide</i>.
    */
  @js.native
  trait ExperimentTemplateTargetInputFilter extends js.Object {
    var path: ExperimentTemplateTargetFilterPath
    var values: ExperimentTemplateTargetFilterValues
  }

  object ExperimentTemplateTargetInputFilter {
    @inline
    def apply(
        path: ExperimentTemplateTargetFilterPath,
        values: ExperimentTemplateTargetFilterValues
    ): ExperimentTemplateTargetInputFilter = {
      val __obj = js.Dynamic.literal(
        "path" -> path.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExperimentTemplateTargetInputFilter]
    }
  }

  @js.native
  trait GetActionRequest extends js.Object {
    var id: ActionId
  }

  object GetActionRequest {
    @inline
    def apply(
        id: ActionId
    ): GetActionRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetActionRequest]
    }
  }

  @js.native
  trait GetActionResponse extends js.Object {
    var action: js.UndefOr[Action]
  }

  object GetActionResponse {
    @inline
    def apply(
        action: js.UndefOr[Action] = js.undefined
    ): GetActionResponse = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetActionResponse]
    }
  }

  @js.native
  trait GetExperimentRequest extends js.Object {
    var id: ExperimentId
  }

  object GetExperimentRequest {
    @inline
    def apply(
        id: ExperimentId
    ): GetExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetExperimentRequest]
    }
  }

  @js.native
  trait GetExperimentResponse extends js.Object {
    var experiment: js.UndefOr[Experiment]
  }

  object GetExperimentResponse {
    @inline
    def apply(
        experiment: js.UndefOr[Experiment] = js.undefined
    ): GetExperimentResponse = {
      val __obj = js.Dynamic.literal()
      experiment.foreach(__v => __obj.updateDynamic("experiment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExperimentResponse]
    }
  }

  @js.native
  trait GetExperimentTemplateRequest extends js.Object {
    var id: ExperimentTemplateId
  }

  object GetExperimentTemplateRequest {
    @inline
    def apply(
        id: ExperimentTemplateId
    ): GetExperimentTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetExperimentTemplateRequest]
    }
  }

  @js.native
  trait GetExperimentTemplateResponse extends js.Object {
    var experimentTemplate: js.UndefOr[ExperimentTemplate]
  }

  object GetExperimentTemplateResponse {
    @inline
    def apply(
        experimentTemplate: js.UndefOr[ExperimentTemplate] = js.undefined
    ): GetExperimentTemplateResponse = {
      val __obj = js.Dynamic.literal()
      experimentTemplate.foreach(__v => __obj.updateDynamic("experimentTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExperimentTemplateResponse]
    }
  }

  @js.native
  trait GetTargetResourceTypeRequest extends js.Object {
    var resourceType: TargetResourceTypeId
  }

  object GetTargetResourceTypeRequest {
    @inline
    def apply(
        resourceType: TargetResourceTypeId
    ): GetTargetResourceTypeRequest = {
      val __obj = js.Dynamic.literal(
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTargetResourceTypeRequest]
    }
  }

  @js.native
  trait GetTargetResourceTypeResponse extends js.Object {
    var targetResourceType: js.UndefOr[TargetResourceType]
  }

  object GetTargetResourceTypeResponse {
    @inline
    def apply(
        targetResourceType: js.UndefOr[TargetResourceType] = js.undefined
    ): GetTargetResourceTypeResponse = {
      val __obj = js.Dynamic.literal()
      targetResourceType.foreach(__v => __obj.updateDynamic("targetResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTargetResourceTypeResponse]
    }
  }

  @js.native
  trait ListActionsRequest extends js.Object {
    var maxResults: js.UndefOr[ListActionsMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListActionsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListActionsMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActionsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActionsRequest]
    }
  }

  @js.native
  trait ListActionsResponse extends js.Object {
    var actions: js.UndefOr[ActionSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListActionsResponse {
    @inline
    def apply(
        actions: js.UndefOr[ActionSummaryList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListActionsResponse = {
      val __obj = js.Dynamic.literal()
      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActionsResponse]
    }
  }

  @js.native
  trait ListExperimentTemplatesRequest extends js.Object {
    var maxResults: js.UndefOr[ListExperimentTemplatesMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListExperimentTemplatesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListExperimentTemplatesMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExperimentTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExperimentTemplatesRequest]
    }
  }

  @js.native
  trait ListExperimentTemplatesResponse extends js.Object {
    var experimentTemplates: js.UndefOr[ExperimentTemplateSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListExperimentTemplatesResponse {
    @inline
    def apply(
        experimentTemplates: js.UndefOr[ExperimentTemplateSummaryList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExperimentTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      experimentTemplates.foreach(__v => __obj.updateDynamic("experimentTemplates")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExperimentTemplatesResponse]
    }
  }

  @js.native
  trait ListExperimentsRequest extends js.Object {
    var maxResults: js.UndefOr[ListExperimentsMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListExperimentsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListExperimentsMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExperimentsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExperimentsRequest]
    }
  }

  @js.native
  trait ListExperimentsResponse extends js.Object {
    var experiments: js.UndefOr[ExperimentSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListExperimentsResponse {
    @inline
    def apply(
        experiments: js.UndefOr[ExperimentSummaryList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExperimentsResponse = {
      val __obj = js.Dynamic.literal()
      experiments.foreach(__v => __obj.updateDynamic("experiments")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExperimentsResponse]
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
  trait ListTargetResourceTypesRequest extends js.Object {
    var maxResults: js.UndefOr[ListTargetResourceTypesMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTargetResourceTypesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListTargetResourceTypesMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTargetResourceTypesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetResourceTypesRequest]
    }
  }

  @js.native
  trait ListTargetResourceTypesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var targetResourceTypes: js.UndefOr[TargetResourceTypeSummaryList]
  }

  object ListTargetResourceTypesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        targetResourceTypes: js.UndefOr[TargetResourceTypeSummaryList] = js.undefined
    ): ListTargetResourceTypesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      targetResourceTypes.foreach(__v => __obj.updateDynamic("targetResourceTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTargetResourceTypesResponse]
    }
  }

  @js.native
  trait StartExperimentRequest extends js.Object {
    var clientToken: ClientToken
    var experimentTemplateId: ExperimentTemplateId
    var tags: js.UndefOr[TagMap]
  }

  object StartExperimentRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        experimentTemplateId: ExperimentTemplateId,
        tags: js.UndefOr[TagMap] = js.undefined
    ): StartExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "experimentTemplateId" -> experimentTemplateId.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartExperimentRequest]
    }
  }

  @js.native
  trait StartExperimentResponse extends js.Object {
    var experiment: js.UndefOr[Experiment]
  }

  object StartExperimentResponse {
    @inline
    def apply(
        experiment: js.UndefOr[Experiment] = js.undefined
    ): StartExperimentResponse = {
      val __obj = js.Dynamic.literal()
      experiment.foreach(__v => __obj.updateDynamic("experiment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartExperimentResponse]
    }
  }

  @js.native
  trait StopExperimentRequest extends js.Object {
    var id: ExperimentId
  }

  object StopExperimentRequest {
    @inline
    def apply(
        id: ExperimentId
    ): StopExperimentRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopExperimentRequest]
    }
  }

  @js.native
  trait StopExperimentResponse extends js.Object {
    var experiment: js.UndefOr[Experiment]
  }

  object StopExperimentResponse {
    @inline
    def apply(
        experiment: js.UndefOr[Experiment] = js.undefined
    ): StopExperimentResponse = {
      val __obj = js.Dynamic.literal()
      experiment.foreach(__v => __obj.updateDynamic("experiment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopExperimentResponse]
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

  /** Describes a resource type.
    */
  @js.native
  trait TargetResourceType extends js.Object {
    var description: js.UndefOr[TargetResourceTypeDescription]
    var parameters: js.UndefOr[TargetResourceTypeParameterMap]
    var resourceType: js.UndefOr[TargetResourceTypeId]
  }

  object TargetResourceType {
    @inline
    def apply(
        description: js.UndefOr[TargetResourceTypeDescription] = js.undefined,
        parameters: js.UndefOr[TargetResourceTypeParameterMap] = js.undefined,
        resourceType: js.UndefOr[TargetResourceTypeId] = js.undefined
    ): TargetResourceType = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetResourceType]
    }
  }

  /** Describes the parameters for a resource type. Use parameters to determine which tasks are identified during target resolution.
    */
  @js.native
  trait TargetResourceTypeParameter extends js.Object {
    var description: js.UndefOr[TargetResourceTypeParameterDescription]
    var required: js.UndefOr[TargetResourceTypeParameterRequired]
  }

  object TargetResourceTypeParameter {
    @inline
    def apply(
        description: js.UndefOr[TargetResourceTypeParameterDescription] = js.undefined,
        required: js.UndefOr[TargetResourceTypeParameterRequired] = js.undefined
    ): TargetResourceTypeParameter = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      required.foreach(__v => __obj.updateDynamic("required")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetResourceTypeParameter]
    }
  }

  /** Describes a resource type.
    */
  @js.native
  trait TargetResourceTypeSummary extends js.Object {
    var description: js.UndefOr[TargetResourceTypeDescription]
    var resourceType: js.UndefOr[TargetResourceTypeId]
  }

  object TargetResourceTypeSummary {
    @inline
    def apply(
        description: js.UndefOr[TargetResourceTypeDescription] = js.undefined,
        resourceType: js.UndefOr[TargetResourceTypeId] = js.undefined
    ): TargetResourceTypeSummary = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetResourceTypeSummary]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: js.UndefOr[TagKeyList]
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tagKeys: js.UndefOr[TagKeyList] = js.undefined
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      tagKeys.foreach(__v => __obj.updateDynamic("tagKeys")(__v.asInstanceOf[js.Any]))
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

  /** Specifies an action for an experiment template.
    */
  @js.native
  trait UpdateExperimentTemplateActionInputItem extends js.Object {
    var actionId: js.UndefOr[ActionId]
    var description: js.UndefOr[ExperimentTemplateActionDescription]
    var parameters: js.UndefOr[ExperimentTemplateActionParameterMap]
    var startAfter: js.UndefOr[ExperimentTemplateActionStartAfterList]
    var targets: js.UndefOr[ExperimentTemplateActionTargetMap]
  }

  object UpdateExperimentTemplateActionInputItem {
    @inline
    def apply(
        actionId: js.UndefOr[ActionId] = js.undefined,
        description: js.UndefOr[ExperimentTemplateActionDescription] = js.undefined,
        parameters: js.UndefOr[ExperimentTemplateActionParameterMap] = js.undefined,
        startAfter: js.UndefOr[ExperimentTemplateActionStartAfterList] = js.undefined,
        targets: js.UndefOr[ExperimentTemplateActionTargetMap] = js.undefined
    ): UpdateExperimentTemplateActionInputItem = {
      val __obj = js.Dynamic.literal()
      actionId.foreach(__v => __obj.updateDynamic("actionId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      startAfter.foreach(__v => __obj.updateDynamic("startAfter")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateExperimentTemplateActionInputItem]
    }
  }

  /** Specifies the configuration for experiment logging.
    */
  @js.native
  trait UpdateExperimentTemplateLogConfigurationInput extends js.Object {
    var cloudWatchLogsConfiguration: js.UndefOr[ExperimentTemplateCloudWatchLogsLogConfigurationInput]
    var logSchemaVersion: js.UndefOr[LogSchemaVersion]
    var s3Configuration: js.UndefOr[ExperimentTemplateS3LogConfigurationInput]
  }

  object UpdateExperimentTemplateLogConfigurationInput {
    @inline
    def apply(
        cloudWatchLogsConfiguration: js.UndefOr[ExperimentTemplateCloudWatchLogsLogConfigurationInput] = js.undefined,
        logSchemaVersion: js.UndefOr[LogSchemaVersion] = js.undefined,
        s3Configuration: js.UndefOr[ExperimentTemplateS3LogConfigurationInput] = js.undefined
    ): UpdateExperimentTemplateLogConfigurationInput = {
      val __obj = js.Dynamic.literal()
      cloudWatchLogsConfiguration.foreach(__v => __obj.updateDynamic("cloudWatchLogsConfiguration")(__v.asInstanceOf[js.Any]))
      logSchemaVersion.foreach(__v => __obj.updateDynamic("logSchemaVersion")(__v.asInstanceOf[js.Any]))
      s3Configuration.foreach(__v => __obj.updateDynamic("s3Configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateExperimentTemplateLogConfigurationInput]
    }
  }

  @js.native
  trait UpdateExperimentTemplateRequest extends js.Object {
    var id: ExperimentTemplateId
    var actions: js.UndefOr[UpdateExperimentTemplateActionInputMap]
    var description: js.UndefOr[ExperimentTemplateDescription]
    var logConfiguration: js.UndefOr[UpdateExperimentTemplateLogConfigurationInput]
    var roleArn: js.UndefOr[RoleArn]
    var stopConditions: js.UndefOr[UpdateExperimentTemplateStopConditionInputList]
    var targets: js.UndefOr[UpdateExperimentTemplateTargetInputMap]
  }

  object UpdateExperimentTemplateRequest {
    @inline
    def apply(
        id: ExperimentTemplateId,
        actions: js.UndefOr[UpdateExperimentTemplateActionInputMap] = js.undefined,
        description: js.UndefOr[ExperimentTemplateDescription] = js.undefined,
        logConfiguration: js.UndefOr[UpdateExperimentTemplateLogConfigurationInput] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        stopConditions: js.UndefOr[UpdateExperimentTemplateStopConditionInputList] = js.undefined,
        targets: js.UndefOr[UpdateExperimentTemplateTargetInputMap] = js.undefined
    ): UpdateExperimentTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      logConfiguration.foreach(__v => __obj.updateDynamic("logConfiguration")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      stopConditions.foreach(__v => __obj.updateDynamic("stopConditions")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateExperimentTemplateRequest]
    }
  }

  @js.native
  trait UpdateExperimentTemplateResponse extends js.Object {
    var experimentTemplate: js.UndefOr[ExperimentTemplate]
  }

  object UpdateExperimentTemplateResponse {
    @inline
    def apply(
        experimentTemplate: js.UndefOr[ExperimentTemplate] = js.undefined
    ): UpdateExperimentTemplateResponse = {
      val __obj = js.Dynamic.literal()
      experimentTemplate.foreach(__v => __obj.updateDynamic("experimentTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateExperimentTemplateResponse]
    }
  }

  /** Specifies a stop condition for an experiment. You can define a stop condition as a CloudWatch alarm.
    */
  @js.native
  trait UpdateExperimentTemplateStopConditionInput extends js.Object {
    var source: StopConditionSource
    var value: js.UndefOr[StopConditionValue]
  }

  object UpdateExperimentTemplateStopConditionInput {
    @inline
    def apply(
        source: StopConditionSource,
        value: js.UndefOr[StopConditionValue] = js.undefined
    ): UpdateExperimentTemplateStopConditionInput = {
      val __obj = js.Dynamic.literal(
        "source" -> source.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateExperimentTemplateStopConditionInput]
    }
  }

  /** Specifies a target for an experiment. You must specify at least one Amazon Resource Name (ARN) or at least one resource tag. You cannot specify both.
    */
  @js.native
  trait UpdateExperimentTemplateTargetInput extends js.Object {
    var resourceType: TargetResourceTypeId
    var selectionMode: ExperimentTemplateTargetSelectionMode
    var filters: js.UndefOr[ExperimentTemplateTargetFilterInputList]
    var parameters: js.UndefOr[ExperimentTemplateTargetParameterMap]
    var resourceArns: js.UndefOr[ResourceArnList]
    var resourceTags: js.UndefOr[TagMap]
  }

  object UpdateExperimentTemplateTargetInput {
    @inline
    def apply(
        resourceType: TargetResourceTypeId,
        selectionMode: ExperimentTemplateTargetSelectionMode,
        filters: js.UndefOr[ExperimentTemplateTargetFilterInputList] = js.undefined,
        parameters: js.UndefOr[ExperimentTemplateTargetParameterMap] = js.undefined,
        resourceArns: js.UndefOr[ResourceArnList] = js.undefined,
        resourceTags: js.UndefOr[TagMap] = js.undefined
    ): UpdateExperimentTemplateTargetInput = {
      val __obj = js.Dynamic.literal(
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "selectionMode" -> selectionMode.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      resourceArns.foreach(__v => __obj.updateDynamic("resourceArns")(__v.asInstanceOf[js.Any]))
      resourceTags.foreach(__v => __obj.updateDynamic("resourceTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateExperimentTemplateTargetInput]
    }
  }
}
