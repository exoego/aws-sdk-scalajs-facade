package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object datapipeline {
  type ParameterAttributeList  = js.Array[ParameterAttribute]
  type ParameterObjectList     = js.Array[ParameterObject]
  type ParameterValueList      = js.Array[ParameterValue]
  type PipelineDescriptionList = js.Array[PipelineDescription]
  type PipelineObjectList      = js.Array[PipelineObject]
  type PipelineObjectMap       = js.Dictionary[PipelineObject]
  type SelectorList            = js.Array[Selector]
  type ValidationErrors        = js.Array[ValidationError]
  type ValidationWarnings      = js.Array[ValidationWarning]
  type attributeNameString     = String
  type attributeValueString    = String
  type cancelActive            = Boolean
  type errorMessage            = String
  type fieldList               = js.Array[Field]
  type fieldNameString         = String
  type fieldStringValue        = String
  type id                      = String
  type idList                  = js.Array[id]
  type longString              = String
  type pipelineList            = js.Array[PipelineIdName]
  type stringList              = js.Array[String]
  type tagKey                  = String
  type tagList                 = js.Array[Tag]
  type tagValue                = String
  type taskId                  = String
  type timestamp               = js.Date
  type validationMessage       = String
  type validationMessages      = js.Array[validationMessage]

  implicit final class DataPipelineOps(private val service: DataPipeline) extends AnyVal {

    @inline def activatePipelineFuture(params: ActivatePipelineInput): Future[ActivatePipelineOutput] =
      service.activatePipeline(params).promise().toFuture
    @inline def addTagsFuture(params: AddTagsInput): Future[AddTagsOutput] = service.addTags(params).promise().toFuture
    @inline def createPipelineFuture(params: CreatePipelineInput): Future[CreatePipelineOutput] =
      service.createPipeline(params).promise().toFuture
    @inline def deactivatePipelineFuture(params: DeactivatePipelineInput): Future[DeactivatePipelineOutput] =
      service.deactivatePipeline(params).promise().toFuture
    @inline def deletePipelineFuture(params: DeletePipelineInput): Future[js.Object] =
      service.deletePipeline(params).promise().toFuture
    @inline def describeObjectsFuture(params: DescribeObjectsInput): Future[DescribeObjectsOutput] =
      service.describeObjects(params).promise().toFuture
    @inline def describePipelinesFuture(params: DescribePipelinesInput): Future[DescribePipelinesOutput] =
      service.describePipelines(params).promise().toFuture
    @inline def evaluateExpressionFuture(params: EvaluateExpressionInput): Future[EvaluateExpressionOutput] =
      service.evaluateExpression(params).promise().toFuture
    @inline def getPipelineDefinitionFuture(params: GetPipelineDefinitionInput): Future[GetPipelineDefinitionOutput] =
      service.getPipelineDefinition(params).promise().toFuture
    @inline def listPipelinesFuture(params: ListPipelinesInput): Future[ListPipelinesOutput] =
      service.listPipelines(params).promise().toFuture
    @inline def pollForTaskFuture(params: PollForTaskInput): Future[PollForTaskOutput] =
      service.pollForTask(params).promise().toFuture
    @inline def putPipelineDefinitionFuture(params: PutPipelineDefinitionInput): Future[PutPipelineDefinitionOutput] =
      service.putPipelineDefinition(params).promise().toFuture
    @inline def queryObjectsFuture(params: QueryObjectsInput): Future[QueryObjectsOutput] =
      service.queryObjects(params).promise().toFuture
    @inline def removeTagsFuture(params: RemoveTagsInput): Future[RemoveTagsOutput] =
      service.removeTags(params).promise().toFuture
    @inline def reportTaskProgressFuture(params: ReportTaskProgressInput): Future[ReportTaskProgressOutput] =
      service.reportTaskProgress(params).promise().toFuture
    @inline def reportTaskRunnerHeartbeatFuture(
        params: ReportTaskRunnerHeartbeatInput
    ): Future[ReportTaskRunnerHeartbeatOutput] = service.reportTaskRunnerHeartbeat(params).promise().toFuture
    @inline def setStatusFuture(params: SetStatusInput): Future[js.Object] =
      service.setStatus(params).promise().toFuture
    @inline def setTaskStatusFuture(params: SetTaskStatusInput): Future[SetTaskStatusOutput] =
      service.setTaskStatus(params).promise().toFuture
    @inline def validatePipelineDefinitionFuture(
        params: ValidatePipelineDefinitionInput
    ): Future[ValidatePipelineDefinitionOutput] = service.validatePipelineDefinition(params).promise().toFuture
  }
}

package datapipeline {
  @js.native
  @JSImport("aws-sdk", "DataPipeline")
  class DataPipeline() extends js.Object {
    def this(config: AWSConfig) = this()

    def activatePipeline(params: ActivatePipelineInput): Request[ActivatePipelineOutput]                = js.native
    def addTags(params: AddTagsInput): Request[AddTagsOutput]                                           = js.native
    def createPipeline(params: CreatePipelineInput): Request[CreatePipelineOutput]                      = js.native
    def deactivatePipeline(params: DeactivatePipelineInput): Request[DeactivatePipelineOutput]          = js.native
    def deletePipeline(params: DeletePipelineInput): Request[js.Object]                                 = js.native
    def describeObjects(params: DescribeObjectsInput): Request[DescribeObjectsOutput]                   = js.native
    def describePipelines(params: DescribePipelinesInput): Request[DescribePipelinesOutput]             = js.native
    def evaluateExpression(params: EvaluateExpressionInput): Request[EvaluateExpressionOutput]          = js.native
    def getPipelineDefinition(params: GetPipelineDefinitionInput): Request[GetPipelineDefinitionOutput] = js.native
    def listPipelines(params: ListPipelinesInput): Request[ListPipelinesOutput]                         = js.native
    def pollForTask(params: PollForTaskInput): Request[PollForTaskOutput]                               = js.native
    def putPipelineDefinition(params: PutPipelineDefinitionInput): Request[PutPipelineDefinitionOutput] = js.native
    def queryObjects(params: QueryObjectsInput): Request[QueryObjectsOutput]                            = js.native
    def removeTags(params: RemoveTagsInput): Request[RemoveTagsOutput]                                  = js.native
    def reportTaskProgress(params: ReportTaskProgressInput): Request[ReportTaskProgressOutput]          = js.native
    def reportTaskRunnerHeartbeat(params: ReportTaskRunnerHeartbeatInput): Request[ReportTaskRunnerHeartbeatOutput] =
      js.native
    def setStatus(params: SetStatusInput): Request[js.Object]                   = js.native
    def setTaskStatus(params: SetTaskStatusInput): Request[SetTaskStatusOutput] = js.native
    def validatePipelineDefinition(params: ValidatePipelineDefinitionInput): Request[ValidatePipelineDefinitionOutput] =
      js.native
  }

  /**
    * Contains the parameters for ActivatePipeline.
    */
  @js.native
  @Factory
  trait ActivatePipelineInput extends js.Object {
    var pipelineId: id
    var parameterValues: js.UndefOr[ParameterValueList]
    var startTimestamp: js.UndefOr[timestamp]
  }

  /**
    * Contains the output of ActivatePipeline.
    */
  @js.native
  @Factory
  trait ActivatePipelineOutput extends js.Object {}

  /**
    * Contains the parameters for AddTags.
    */
  @js.native
  @Factory
  trait AddTagsInput extends js.Object {
    var pipelineId: id
    var tags: tagList
  }

  /**
    * Contains the output of AddTags.
    */
  @js.native
  @Factory
  trait AddTagsOutput extends js.Object {}

  /**
    * Contains the parameters for CreatePipeline.
    */
  @js.native
  @Factory
  trait CreatePipelineInput extends js.Object {
    var name: id
    var uniqueId: id
    var description: js.UndefOr[String]
    var tags: js.UndefOr[tagList]
  }

  /**
    * Contains the output of CreatePipeline.
    */
  @js.native
  @Factory
  trait CreatePipelineOutput extends js.Object {
    var pipelineId: id
  }

  /**
    * Contains the parameters for DeactivatePipeline.
    */
  @js.native
  @Factory
  trait DeactivatePipelineInput extends js.Object {
    var pipelineId: id
    var cancelActive: js.UndefOr[cancelActive]
  }

  /**
    * Contains the output of DeactivatePipeline.
    */
  @js.native
  @Factory
  trait DeactivatePipelineOutput extends js.Object {}

  /**
    * Contains the parameters for DeletePipeline.
    */
  @js.native
  @Factory
  trait DeletePipelineInput extends js.Object {
    var pipelineId: id
  }

  /**
    * Contains the parameters for DescribeObjects.
    */
  @js.native
  @Factory
  trait DescribeObjectsInput extends js.Object {
    var objectIds: idList
    var pipelineId: id
    var evaluateExpressions: js.UndefOr[Boolean]
    var marker: js.UndefOr[String]
  }

  /**
    * Contains the output of DescribeObjects.
    */
  @js.native
  @Factory
  trait DescribeObjectsOutput extends js.Object {
    var pipelineObjects: PipelineObjectList
    var hasMoreResults: js.UndefOr[Boolean]
    var marker: js.UndefOr[String]
  }

  /**
    * Contains the parameters for DescribePipelines.
    */
  @js.native
  @Factory
  trait DescribePipelinesInput extends js.Object {
    var pipelineIds: idList
  }

  /**
    * Contains the output of DescribePipelines.
    */
  @js.native
  @Factory
  trait DescribePipelinesOutput extends js.Object {
    var pipelineDescriptionList: PipelineDescriptionList
  }

  /**
    * Contains the parameters for EvaluateExpression.
    */
  @js.native
  @Factory
  trait EvaluateExpressionInput extends js.Object {
    var expression: longString
    var objectId: id
    var pipelineId: id
  }

  /**
    * Contains the output of EvaluateExpression.
    */
  @js.native
  @Factory
  trait EvaluateExpressionOutput extends js.Object {
    var evaluatedExpression: longString
  }

  /**
    * A key-value pair that describes a property of a pipeline object. The value is specified as either a string value (<code>StringValue</code>) or a reference to another object (<code>RefValue</code>) but not as both.
    */
  @js.native
  @Factory
  trait Field extends js.Object {
    var key: fieldNameString
    var refValue: js.UndefOr[fieldNameString]
    var stringValue: js.UndefOr[fieldStringValue]
  }

  /**
    * Contains the parameters for GetPipelineDefinition.
    */
  @js.native
  @Factory
  trait GetPipelineDefinitionInput extends js.Object {
    var pipelineId: id
    var version: js.UndefOr[String]
  }

  /**
    * Contains the output of GetPipelineDefinition.
    */
  @js.native
  @Factory
  trait GetPipelineDefinitionOutput extends js.Object {
    var parameterObjects: js.UndefOr[ParameterObjectList]
    var parameterValues: js.UndefOr[ParameterValueList]
    var pipelineObjects: js.UndefOr[PipelineObjectList]
  }

  /**
    * <p>Identity information for the EC2 instance that is hosting the task runner. You can get this value by calling a metadata URI from the EC2 instance. For more information, see [[http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html|Instance Metadata]] in the <i>Amazon Elastic Compute Cloud User Guide.</i> Passing in this value proves that your task runner is running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges are applied to your pipeline.
    * </p>
    */
  @js.native
  @Factory
  trait InstanceIdentity extends js.Object {
    var document: js.UndefOr[String]
    var signature: js.UndefOr[String]
  }

  /**
    * An internal service error occurred.
    */
  @js.native
  trait InternalServiceErrorException extends js.Object {
    val message: errorMessage
  }

  /**
    * The request was not valid. Verify that your request was properly formatted, that the signature was generated with the correct credentials, and that you haven't exceeded any of the service limits for your account.
    */
  @js.native
  trait InvalidRequestExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
    * Contains the parameters for ListPipelines.
    */
  @js.native
  @Factory
  trait ListPipelinesInput extends js.Object {
    var marker: js.UndefOr[String]
  }

  /**
    * Contains the output of ListPipelines.
    */
  @js.native
  @Factory
  trait ListPipelinesOutput extends js.Object {
    var pipelineIdList: pipelineList
    var hasMoreResults: js.UndefOr[Boolean]
    var marker: js.UndefOr[String]
  }

  /**
    * Contains a logical operation for comparing the value of a field with a specified value.
    */
  @js.native
  @Factory
  trait Operator extends js.Object {
    var `type`: js.UndefOr[OperatorType]
    var values: js.UndefOr[stringList]
  }

  @js.native
  sealed trait OperatorType extends js.Any
  object OperatorType extends js.Object {
    val EQ      = "EQ".asInstanceOf[OperatorType]
    val REF_EQ  = "REF_EQ".asInstanceOf[OperatorType]
    val LE      = "LE".asInstanceOf[OperatorType]
    val GE      = "GE".asInstanceOf[OperatorType]
    val BETWEEN = "BETWEEN".asInstanceOf[OperatorType]

    val values = js.Object.freeze(js.Array(EQ, REF_EQ, LE, GE, BETWEEN))
  }

  /**
    * The attributes allowed or specified with a parameter object.
    */
  @js.native
  @Factory
  trait ParameterAttribute extends js.Object {
    var key: attributeNameString
    var stringValue: attributeValueString
  }

  /**
    * Contains information about a parameter object.
    */
  @js.native
  @Factory
  trait ParameterObject extends js.Object {
    var attributes: ParameterAttributeList
    var id: fieldNameString
  }

  /**
    * A value or list of parameter values.
    */
  @js.native
  @Factory
  trait ParameterValue extends js.Object {
    var id: fieldNameString
    var stringValue: fieldStringValue
  }

  /**
    * The specified pipeline has been deleted.
    */
  @js.native
  trait PipelineDeletedExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
    * Contains pipeline metadata.
    */
  @js.native
  @Factory
  trait PipelineDescription extends js.Object {
    var fields: fieldList
    var name: id
    var pipelineId: id
    var description: js.UndefOr[String]
    var tags: js.UndefOr[tagList]
  }

  /**
    * Contains the name and identifier of a pipeline.
    */
  @js.native
  @Factory
  trait PipelineIdName extends js.Object {
    var id: js.UndefOr[id]
    var name: js.UndefOr[id]
  }

  /**
    * The specified pipeline was not found. Verify that you used the correct user and account identifiers.
    */
  @js.native
  trait PipelineNotFoundExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
    * Contains information about a pipeline object. This can be a logical, physical, or physical attempt pipeline object. The complete set of components of a pipeline defines the pipeline.
    */
  @js.native
  @Factory
  trait PipelineObject extends js.Object {
    var fields: fieldList
    var id: id
    var name: id
  }

  /**
    * Contains the parameters for PollForTask.
    */
  @js.native
  @Factory
  trait PollForTaskInput extends js.Object {
    var workerGroup: String
    var hostname: js.UndefOr[id]
    var instanceIdentity: js.UndefOr[InstanceIdentity]
  }

  /**
    * Contains the output of PollForTask.
    */
  @js.native
  @Factory
  trait PollForTaskOutput extends js.Object {
    var taskObject: js.UndefOr[TaskObject]
  }

  /**
    * Contains the parameters for PutPipelineDefinition.
    */
  @js.native
  @Factory
  trait PutPipelineDefinitionInput extends js.Object {
    var pipelineId: id
    var pipelineObjects: PipelineObjectList
    var parameterObjects: js.UndefOr[ParameterObjectList]
    var parameterValues: js.UndefOr[ParameterValueList]
  }

  /**
    * Contains the output of PutPipelineDefinition.
    */
  @js.native
  @Factory
  trait PutPipelineDefinitionOutput extends js.Object {
    var errored: Boolean
    var validationErrors: js.UndefOr[ValidationErrors]
    var validationWarnings: js.UndefOr[ValidationWarnings]
  }

  /**
    * Defines the query to run against an object.
    */
  @js.native
  @Factory
  trait Query extends js.Object {
    var selectors: js.UndefOr[SelectorList]
  }

  /**
    * Contains the parameters for QueryObjects.
    */
  @js.native
  @Factory
  trait QueryObjectsInput extends js.Object {
    var pipelineId: id
    var sphere: String
    var limit: js.UndefOr[Int]
    var marker: js.UndefOr[String]
    var query: js.UndefOr[Query]
  }

  /**
    * Contains the output of QueryObjects.
    */
  @js.native
  @Factory
  trait QueryObjectsOutput extends js.Object {
    var hasMoreResults: js.UndefOr[Boolean]
    var ids: js.UndefOr[idList]
    var marker: js.UndefOr[String]
  }

  /**
    * Contains the parameters for RemoveTags.
    */
  @js.native
  @Factory
  trait RemoveTagsInput extends js.Object {
    var pipelineId: id
    var tagKeys: stringList
  }

  /**
    * Contains the output of RemoveTags.
    */
  @js.native
  @Factory
  trait RemoveTagsOutput extends js.Object {}

  /**
    * Contains the parameters for ReportTaskProgress.
    */
  @js.native
  @Factory
  trait ReportTaskProgressInput extends js.Object {
    var taskId: taskId
    var fields: js.UndefOr[fieldList]
  }

  /**
    * Contains the output of ReportTaskProgress.
    */
  @js.native
  @Factory
  trait ReportTaskProgressOutput extends js.Object {
    var canceled: Boolean
  }

  /**
    * Contains the parameters for ReportTaskRunnerHeartbeat.
    */
  @js.native
  @Factory
  trait ReportTaskRunnerHeartbeatInput extends js.Object {
    var taskrunnerId: id
    var hostname: js.UndefOr[id]
    var workerGroup: js.UndefOr[String]
  }

  /**
    * Contains the output of ReportTaskRunnerHeartbeat.
    */
  @js.native
  @Factory
  trait ReportTaskRunnerHeartbeatOutput extends js.Object {
    var terminate: Boolean
  }

  /**
    * A comparision that is used to determine whether a query should return this object.
    */
  @js.native
  @Factory
  trait Selector extends js.Object {
    var fieldName: js.UndefOr[String]
    var operator: js.UndefOr[Operator]
  }

  /**
    * Contains the parameters for SetStatus.
    */
  @js.native
  @Factory
  trait SetStatusInput extends js.Object {
    var objectIds: idList
    var pipelineId: id
    var status: String
  }

  /**
    * Contains the parameters for SetTaskStatus.
    */
  @js.native
  @Factory
  trait SetTaskStatusInput extends js.Object {
    var taskId: taskId
    var taskStatus: TaskStatus
    var errorId: js.UndefOr[String]
    var errorMessage: js.UndefOr[errorMessage]
    var errorStackTrace: js.UndefOr[String]
  }

  /**
    * Contains the output of SetTaskStatus.
    */
  @js.native
  @Factory
  trait SetTaskStatusOutput extends js.Object {}

  /**
    * Tags are key/value pairs defined by a user and associated with a pipeline to control access. AWS Data Pipeline allows you to associate ten tags per pipeline. For more information, see [[http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html|Controlling User Access to Pipelines]] in the <i>AWS Data Pipeline Developer Guide</i>.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: tagKey
    var value: tagValue
  }

  /**
    * The specified task was not found.
    */
  @js.native
  trait TaskNotFoundExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
    * Contains information about a pipeline task that is assigned to a task runner.
    */
  @js.native
  @Factory
  trait TaskObject extends js.Object {
    var attemptId: js.UndefOr[id]
    var objects: js.UndefOr[PipelineObjectMap]
    var pipelineId: js.UndefOr[id]
    var taskId: js.UndefOr[taskId]
  }

  @js.native
  sealed trait TaskStatus extends js.Any
  object TaskStatus extends js.Object {
    val FINISHED = "FINISHED".asInstanceOf[TaskStatus]
    val FAILED   = "FAILED".asInstanceOf[TaskStatus]
    val FALSE    = "FALSE".asInstanceOf[TaskStatus]

    val values = js.Object.freeze(js.Array(FINISHED, FAILED, FALSE))
  }

  /**
    * Contains the parameters for ValidatePipelineDefinition.
    */
  @js.native
  @Factory
  trait ValidatePipelineDefinitionInput extends js.Object {
    var pipelineId: id
    var pipelineObjects: PipelineObjectList
    var parameterObjects: js.UndefOr[ParameterObjectList]
    var parameterValues: js.UndefOr[ParameterValueList]
  }

  /**
    * Contains the output of ValidatePipelineDefinition.
    */
  @js.native
  @Factory
  trait ValidatePipelineDefinitionOutput extends js.Object {
    var errored: Boolean
    var validationErrors: js.UndefOr[ValidationErrors]
    var validationWarnings: js.UndefOr[ValidationWarnings]
  }

  /**
    * Defines a validation error. Validation errors prevent pipeline activation. The set of validation errors that can be returned are defined by AWS Data Pipeline.
    */
  @js.native
  @Factory
  trait ValidationError extends js.Object {
    var errors: js.UndefOr[validationMessages]
    var id: js.UndefOr[id]
  }

  /**
    * Defines a validation warning. Validation warnings do not prevent pipeline activation. The set of validation warnings that can be returned are defined by AWS Data Pipeline.
    */
  @js.native
  @Factory
  trait ValidationWarning extends js.Object {
    var id: js.UndefOr[id]
    var warnings: js.UndefOr[validationMessages]
  }
}
