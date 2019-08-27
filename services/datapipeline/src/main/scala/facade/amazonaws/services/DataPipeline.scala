package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object datapipeline {
  type OperatorType            = String
  type ParameterAttributeList  = js.Array[ParameterAttribute]
  type ParameterObjectList     = js.Array[ParameterObject]
  type ParameterValueList      = js.Array[ParameterValue]
  type PipelineDescriptionList = js.Array[PipelineDescription]
  type PipelineObjectList      = js.Array[PipelineObject]
  type PipelineObjectMap       = js.Dictionary[PipelineObject]
  type SelectorList            = js.Array[Selector]
  type TaskStatus              = String
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

  implicit final class DataPipelineOps(val service: DataPipeline) extends AnyVal {

    def activatePipelineFuture(params: ActivatePipelineInput): Future[ActivatePipelineOutput] =
      service.activatePipeline(params).promise.toFuture
    def addTagsFuture(params: AddTagsInput): Future[AddTagsOutput] = service.addTags(params).promise.toFuture
    def createPipelineFuture(params: CreatePipelineInput): Future[CreatePipelineOutput] =
      service.createPipeline(params).promise.toFuture
    def deactivatePipelineFuture(params: DeactivatePipelineInput): Future[DeactivatePipelineOutput] =
      service.deactivatePipeline(params).promise.toFuture
    def deletePipelineFuture(params: DeletePipelineInput): Future[js.Object] =
      service.deletePipeline(params).promise.toFuture
    def describeObjectsFuture(params: DescribeObjectsInput): Future[DescribeObjectsOutput] =
      service.describeObjects(params).promise.toFuture
    def describePipelinesFuture(params: DescribePipelinesInput): Future[DescribePipelinesOutput] =
      service.describePipelines(params).promise.toFuture
    def evaluateExpressionFuture(params: EvaluateExpressionInput): Future[EvaluateExpressionOutput] =
      service.evaluateExpression(params).promise.toFuture
    def getPipelineDefinitionFuture(params: GetPipelineDefinitionInput): Future[GetPipelineDefinitionOutput] =
      service.getPipelineDefinition(params).promise.toFuture
    def listPipelinesFuture(params: ListPipelinesInput): Future[ListPipelinesOutput] =
      service.listPipelines(params).promise.toFuture
    def pollForTaskFuture(params: PollForTaskInput): Future[PollForTaskOutput] =
      service.pollForTask(params).promise.toFuture
    def putPipelineDefinitionFuture(params: PutPipelineDefinitionInput): Future[PutPipelineDefinitionOutput] =
      service.putPipelineDefinition(params).promise.toFuture
    def queryObjectsFuture(params: QueryObjectsInput): Future[QueryObjectsOutput] =
      service.queryObjects(params).promise.toFuture
    def removeTagsFuture(params: RemoveTagsInput): Future[RemoveTagsOutput] =
      service.removeTags(params).promise.toFuture
    def reportTaskProgressFuture(params: ReportTaskProgressInput): Future[ReportTaskProgressOutput] =
      service.reportTaskProgress(params).promise.toFuture
    def reportTaskRunnerHeartbeatFuture(
        params: ReportTaskRunnerHeartbeatInput
    ): Future[ReportTaskRunnerHeartbeatOutput]                     = service.reportTaskRunnerHeartbeat(params).promise.toFuture
    def setStatusFuture(params: SetStatusInput): Future[js.Object] = service.setStatus(params).promise.toFuture
    def setTaskStatusFuture(params: SetTaskStatusInput): Future[SetTaskStatusOutput] =
      service.setTaskStatus(params).promise.toFuture
    def validatePipelineDefinitionFuture(
        params: ValidatePipelineDefinitionInput
    ): Future[ValidatePipelineDefinitionOutput] = service.validatePipelineDefinition(params).promise.toFuture
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
  trait ActivatePipelineInput extends js.Object {
    var pipelineId: id
    var parameterValues: js.UndefOr[ParameterValueList]
    var startTimestamp: js.UndefOr[timestamp]
  }

  object ActivatePipelineInput {
    def apply(
        pipelineId: id,
        parameterValues: js.UndefOr[ParameterValueList] = js.undefined,
        startTimestamp: js.UndefOr[timestamp] = js.undefined
    ): ActivatePipelineInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any]
      )

      parameterValues.foreach(__v => __obj.update("parameterValues", __v.asInstanceOf[js.Any]))
      startTimestamp.foreach(__v => __obj.update("startTimestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivatePipelineInput]
    }
  }

  /**
    * Contains the output of ActivatePipeline.
    */
  @js.native
  trait ActivatePipelineOutput extends js.Object {}

  object ActivatePipelineOutput {
    def apply(
        ): ActivatePipelineOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ActivatePipelineOutput]
    }
  }

  /**
    * Contains the parameters for AddTags.
    */
  @js.native
  trait AddTagsInput extends js.Object {
    var pipelineId: id
    var tags: tagList
  }

  object AddTagsInput {
    def apply(
        pipelineId: id,
        tags: tagList
    ): AddTagsInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "tags"       -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsInput]
    }
  }

  /**
    * Contains the output of AddTags.
    */
  @js.native
  trait AddTagsOutput extends js.Object {}

  object AddTagsOutput {
    def apply(
        ): AddTagsOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AddTagsOutput]
    }
  }

  /**
    * Contains the parameters for CreatePipeline.
    */
  @js.native
  trait CreatePipelineInput extends js.Object {
    var name: id
    var uniqueId: id
    var description: js.UndefOr[String]
    var tags: js.UndefOr[tagList]
  }

  object CreatePipelineInput {
    def apply(
        name: id,
        uniqueId: id,
        description: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): CreatePipelineInput = {
      val __obj = js.Dictionary[js.Any](
        "name"     -> name.asInstanceOf[js.Any],
        "uniqueId" -> uniqueId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePipelineInput]
    }
  }

  /**
    * Contains the output of CreatePipeline.
    */
  @js.native
  trait CreatePipelineOutput extends js.Object {
    var pipelineId: id
  }

  object CreatePipelineOutput {
    def apply(
        pipelineId: id
    ): CreatePipelineOutput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreatePipelineOutput]
    }
  }

  /**
    * Contains the parameters for DeactivatePipeline.
    */
  @js.native
  trait DeactivatePipelineInput extends js.Object {
    var pipelineId: id
    var cancelActive: js.UndefOr[cancelActive]
  }

  object DeactivatePipelineInput {
    def apply(
        pipelineId: id,
        cancelActive: js.UndefOr[cancelActive] = js.undefined
    ): DeactivatePipelineInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any]
      )

      cancelActive.foreach(__v => __obj.update("cancelActive", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeactivatePipelineInput]
    }
  }

  /**
    * Contains the output of DeactivatePipeline.
    */
  @js.native
  trait DeactivatePipelineOutput extends js.Object {}

  object DeactivatePipelineOutput {
    def apply(
        ): DeactivatePipelineOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeactivatePipelineOutput]
    }
  }

  /**
    * Contains the parameters for DeletePipeline.
    */
  @js.native
  trait DeletePipelineInput extends js.Object {
    var pipelineId: id
  }

  object DeletePipelineInput {
    def apply(
        pipelineId: id
    ): DeletePipelineInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePipelineInput]
    }
  }

  /**
    * Contains the parameters for DescribeObjects.
    */
  @js.native
  trait DescribeObjectsInput extends js.Object {
    var objectIds: idList
    var pipelineId: id
    var evaluateExpressions: js.UndefOr[Boolean]
    var marker: js.UndefOr[String]
  }

  object DescribeObjectsInput {
    def apply(
        objectIds: idList,
        pipelineId: id,
        evaluateExpressions: js.UndefOr[Boolean] = js.undefined,
        marker: js.UndefOr[String] = js.undefined
    ): DescribeObjectsInput = {
      val __obj = js.Dictionary[js.Any](
        "objectIds"  -> objectIds.asInstanceOf[js.Any],
        "pipelineId" -> pipelineId.asInstanceOf[js.Any]
      )

      evaluateExpressions.foreach(__v => __obj.update("evaluateExpressions", __v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.update("marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeObjectsInput]
    }
  }

  /**
    * Contains the output of DescribeObjects.
    */
  @js.native
  trait DescribeObjectsOutput extends js.Object {
    var pipelineObjects: PipelineObjectList
    var hasMoreResults: js.UndefOr[Boolean]
    var marker: js.UndefOr[String]
  }

  object DescribeObjectsOutput {
    def apply(
        pipelineObjects: PipelineObjectList,
        hasMoreResults: js.UndefOr[Boolean] = js.undefined,
        marker: js.UndefOr[String] = js.undefined
    ): DescribeObjectsOutput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineObjects" -> pipelineObjects.asInstanceOf[js.Any]
      )

      hasMoreResults.foreach(__v => __obj.update("hasMoreResults", __v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.update("marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeObjectsOutput]
    }
  }

  /**
    * Contains the parameters for DescribePipelines.
    */
  @js.native
  trait DescribePipelinesInput extends js.Object {
    var pipelineIds: idList
  }

  object DescribePipelinesInput {
    def apply(
        pipelineIds: idList
    ): DescribePipelinesInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineIds" -> pipelineIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePipelinesInput]
    }
  }

  /**
    * Contains the output of DescribePipelines.
    */
  @js.native
  trait DescribePipelinesOutput extends js.Object {
    var pipelineDescriptionList: PipelineDescriptionList
  }

  object DescribePipelinesOutput {
    def apply(
        pipelineDescriptionList: PipelineDescriptionList
    ): DescribePipelinesOutput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineDescriptionList" -> pipelineDescriptionList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePipelinesOutput]
    }
  }

  /**
    * Contains the parameters for EvaluateExpression.
    */
  @js.native
  trait EvaluateExpressionInput extends js.Object {
    var expression: longString
    var objectId: id
    var pipelineId: id
  }

  object EvaluateExpressionInput {
    def apply(
        expression: longString,
        objectId: id,
        pipelineId: id
    ): EvaluateExpressionInput = {
      val __obj = js.Dictionary[js.Any](
        "expression" -> expression.asInstanceOf[js.Any],
        "objectId"   -> objectId.asInstanceOf[js.Any],
        "pipelineId" -> pipelineId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EvaluateExpressionInput]
    }
  }

  /**
    * Contains the output of EvaluateExpression.
    */
  @js.native
  trait EvaluateExpressionOutput extends js.Object {
    var evaluatedExpression: longString
  }

  object EvaluateExpressionOutput {
    def apply(
        evaluatedExpression: longString
    ): EvaluateExpressionOutput = {
      val __obj = js.Dictionary[js.Any](
        "evaluatedExpression" -> evaluatedExpression.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EvaluateExpressionOutput]
    }
  }

  /**
    * A key-value pair that describes a property of a pipeline object. The value is specified as either a string value (<code>StringValue</code>) or a reference to another object (<code>RefValue</code>) but not as both.
    */
  @js.native
  trait Field extends js.Object {
    var key: fieldNameString
    var refValue: js.UndefOr[fieldNameString]
    var stringValue: js.UndefOr[fieldStringValue]
  }

  object Field {
    def apply(
        key: fieldNameString,
        refValue: js.UndefOr[fieldNameString] = js.undefined,
        stringValue: js.UndefOr[fieldStringValue] = js.undefined
    ): Field = {
      val __obj = js.Dictionary[js.Any](
        "key" -> key.asInstanceOf[js.Any]
      )

      refValue.foreach(__v => __obj.update("refValue", __v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.update("stringValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Field]
    }
  }

  /**
    * Contains the parameters for GetPipelineDefinition.
    */
  @js.native
  trait GetPipelineDefinitionInput extends js.Object {
    var pipelineId: id
    var version: js.UndefOr[String]
  }

  object GetPipelineDefinitionInput {
    def apply(
        pipelineId: id,
        version: js.UndefOr[String] = js.undefined
    ): GetPipelineDefinitionInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any]
      )

      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPipelineDefinitionInput]
    }
  }

  /**
    * Contains the output of GetPipelineDefinition.
    */
  @js.native
  trait GetPipelineDefinitionOutput extends js.Object {
    var parameterObjects: js.UndefOr[ParameterObjectList]
    var parameterValues: js.UndefOr[ParameterValueList]
    var pipelineObjects: js.UndefOr[PipelineObjectList]
  }

  object GetPipelineDefinitionOutput {
    def apply(
        parameterObjects: js.UndefOr[ParameterObjectList] = js.undefined,
        parameterValues: js.UndefOr[ParameterValueList] = js.undefined,
        pipelineObjects: js.UndefOr[PipelineObjectList] = js.undefined
    ): GetPipelineDefinitionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      parameterObjects.foreach(__v => __obj.update("parameterObjects", __v.asInstanceOf[js.Any]))
      parameterValues.foreach(__v => __obj.update("parameterValues", __v.asInstanceOf[js.Any]))
      pipelineObjects.foreach(__v => __obj.update("pipelineObjects", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPipelineDefinitionOutput]
    }
  }

  /**
    * <p>Identity information for the EC2 instance that is hosting the task runner. You can get this value by calling a metadata URI from the EC2 instance. For more information, see [[http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html|Instance Metadata]] in the <i>Amazon Elastic Compute Cloud User Guide.</i> Passing in this value proves that your task runner is running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges are applied to your pipeline.
    * </p>
    */
  @js.native
  trait InstanceIdentity extends js.Object {
    var document: js.UndefOr[String]
    var signature: js.UndefOr[String]
  }

  object InstanceIdentity {
    def apply(
        document: js.UndefOr[String] = js.undefined,
        signature: js.UndefOr[String] = js.undefined
    ): InstanceIdentity = {
      val __obj = js.Dictionary.empty[js.Any]
      document.foreach(__v => __obj.update("document", __v.asInstanceOf[js.Any]))
      signature.foreach(__v => __obj.update("signature", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceIdentity]
    }
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
  trait ListPipelinesInput extends js.Object {
    var marker: js.UndefOr[String]
  }

  object ListPipelinesInput {
    def apply(
        marker: js.UndefOr[String] = js.undefined
    ): ListPipelinesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      marker.foreach(__v => __obj.update("marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesInput]
    }
  }

  /**
    * Contains the output of ListPipelines.
    */
  @js.native
  trait ListPipelinesOutput extends js.Object {
    var pipelineIdList: pipelineList
    var hasMoreResults: js.UndefOr[Boolean]
    var marker: js.UndefOr[String]
  }

  object ListPipelinesOutput {
    def apply(
        pipelineIdList: pipelineList,
        hasMoreResults: js.UndefOr[Boolean] = js.undefined,
        marker: js.UndefOr[String] = js.undefined
    ): ListPipelinesOutput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineIdList" -> pipelineIdList.asInstanceOf[js.Any]
      )

      hasMoreResults.foreach(__v => __obj.update("hasMoreResults", __v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.update("marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPipelinesOutput]
    }
  }

  /**
    * Contains a logical operation for comparing the value of a field with a specified value.
    */
  @js.native
  trait Operator extends js.Object {
    var `type`: js.UndefOr[OperatorType]
    var values: js.UndefOr[stringList]
  }

  object Operator {
    def apply(
        `type`: js.UndefOr[OperatorType] = js.undefined,
        values: js.UndefOr[stringList] = js.undefined
    ): Operator = {
      val __obj = js.Dictionary.empty[js.Any]
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.update("values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Operator]
    }
  }

  object OperatorTypeEnum {
    val EQ      = "EQ"
    val REF_EQ  = "REF_EQ"
    val LE      = "LE"
    val GE      = "GE"
    val BETWEEN = "BETWEEN"

    val values = js.Object.freeze(js.Array(EQ, REF_EQ, LE, GE, BETWEEN))
  }

  /**
    * The attributes allowed or specified with a parameter object.
    */
  @js.native
  trait ParameterAttribute extends js.Object {
    var key: attributeNameString
    var stringValue: attributeValueString
  }

  object ParameterAttribute {
    def apply(
        key: attributeNameString,
        stringValue: attributeValueString
    ): ParameterAttribute = {
      val __obj = js.Dictionary[js.Any](
        "key"         -> key.asInstanceOf[js.Any],
        "stringValue" -> stringValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ParameterAttribute]
    }
  }

  /**
    * Contains information about a parameter object.
    */
  @js.native
  trait ParameterObject extends js.Object {
    var attributes: ParameterAttributeList
    var id: fieldNameString
  }

  object ParameterObject {
    def apply(
        attributes: ParameterAttributeList,
        id: fieldNameString
    ): ParameterObject = {
      val __obj = js.Dictionary[js.Any](
        "attributes" -> attributes.asInstanceOf[js.Any],
        "id"         -> id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ParameterObject]
    }
  }

  /**
    * A value or list of parameter values.
    */
  @js.native
  trait ParameterValue extends js.Object {
    var id: fieldNameString
    var stringValue: fieldStringValue
  }

  object ParameterValue {
    def apply(
        id: fieldNameString,
        stringValue: fieldStringValue
    ): ParameterValue = {
      val __obj = js.Dictionary[js.Any](
        "id"          -> id.asInstanceOf[js.Any],
        "stringValue" -> stringValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ParameterValue]
    }
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
  trait PipelineDescription extends js.Object {
    var fields: fieldList
    var name: id
    var pipelineId: id
    var description: js.UndefOr[String]
    var tags: js.UndefOr[tagList]
  }

  object PipelineDescription {
    def apply(
        fields: fieldList,
        name: id,
        pipelineId: id,
        description: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): PipelineDescription = {
      val __obj = js.Dictionary[js.Any](
        "fields"     -> fields.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any],
        "pipelineId" -> pipelineId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineDescription]
    }
  }

  /**
    * Contains the name and identifier of a pipeline.
    */
  @js.native
  trait PipelineIdName extends js.Object {
    var id: js.UndefOr[id]
    var name: js.UndefOr[id]
  }

  object PipelineIdName {
    def apply(
        id: js.UndefOr[id] = js.undefined,
        name: js.UndefOr[id] = js.undefined
    ): PipelineIdName = {
      val __obj = js.Dictionary.empty[js.Any]
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineIdName]
    }
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
  trait PipelineObject extends js.Object {
    var fields: fieldList
    var id: id
    var name: id
  }

  object PipelineObject {
    def apply(
        fields: fieldList,
        id: id,
        name: id
    ): PipelineObject = {
      val __obj = js.Dictionary[js.Any](
        "fields" -> fields.asInstanceOf[js.Any],
        "id"     -> id.asInstanceOf[js.Any],
        "name"   -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PipelineObject]
    }
  }

  /**
    * Contains the parameters for PollForTask.
    */
  @js.native
  trait PollForTaskInput extends js.Object {
    var workerGroup: String
    var hostname: js.UndefOr[id]
    var instanceIdentity: js.UndefOr[InstanceIdentity]
  }

  object PollForTaskInput {
    def apply(
        workerGroup: String,
        hostname: js.UndefOr[id] = js.undefined,
        instanceIdentity: js.UndefOr[InstanceIdentity] = js.undefined
    ): PollForTaskInput = {
      val __obj = js.Dictionary[js.Any](
        "workerGroup" -> workerGroup.asInstanceOf[js.Any]
      )

      hostname.foreach(__v => __obj.update("hostname", __v.asInstanceOf[js.Any]))
      instanceIdentity.foreach(__v => __obj.update("instanceIdentity", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PollForTaskInput]
    }
  }

  /**
    * Contains the output of PollForTask.
    */
  @js.native
  trait PollForTaskOutput extends js.Object {
    var taskObject: js.UndefOr[TaskObject]
  }

  object PollForTaskOutput {
    def apply(
        taskObject: js.UndefOr[TaskObject] = js.undefined
    ): PollForTaskOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      taskObject.foreach(__v => __obj.update("taskObject", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PollForTaskOutput]
    }
  }

  /**
    * Contains the parameters for PutPipelineDefinition.
    */
  @js.native
  trait PutPipelineDefinitionInput extends js.Object {
    var pipelineId: id
    var pipelineObjects: PipelineObjectList
    var parameterObjects: js.UndefOr[ParameterObjectList]
    var parameterValues: js.UndefOr[ParameterValueList]
  }

  object PutPipelineDefinitionInput {
    def apply(
        pipelineId: id,
        pipelineObjects: PipelineObjectList,
        parameterObjects: js.UndefOr[ParameterObjectList] = js.undefined,
        parameterValues: js.UndefOr[ParameterValueList] = js.undefined
    ): PutPipelineDefinitionInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineId"      -> pipelineId.asInstanceOf[js.Any],
        "pipelineObjects" -> pipelineObjects.asInstanceOf[js.Any]
      )

      parameterObjects.foreach(__v => __obj.update("parameterObjects", __v.asInstanceOf[js.Any]))
      parameterValues.foreach(__v => __obj.update("parameterValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPipelineDefinitionInput]
    }
  }

  /**
    * Contains the output of PutPipelineDefinition.
    */
  @js.native
  trait PutPipelineDefinitionOutput extends js.Object {
    var errored: Boolean
    var validationErrors: js.UndefOr[ValidationErrors]
    var validationWarnings: js.UndefOr[ValidationWarnings]
  }

  object PutPipelineDefinitionOutput {
    def apply(
        errored: Boolean,
        validationErrors: js.UndefOr[ValidationErrors] = js.undefined,
        validationWarnings: js.UndefOr[ValidationWarnings] = js.undefined
    ): PutPipelineDefinitionOutput = {
      val __obj = js.Dictionary[js.Any](
        "errored" -> errored.asInstanceOf[js.Any]
      )

      validationErrors.foreach(__v => __obj.update("validationErrors", __v.asInstanceOf[js.Any]))
      validationWarnings.foreach(__v => __obj.update("validationWarnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPipelineDefinitionOutput]
    }
  }

  /**
    * Defines the query to run against an object.
    */
  @js.native
  trait Query extends js.Object {
    var selectors: js.UndefOr[SelectorList]
  }

  object Query {
    def apply(
        selectors: js.UndefOr[SelectorList] = js.undefined
    ): Query = {
      val __obj = js.Dictionary.empty[js.Any]
      selectors.foreach(__v => __obj.update("selectors", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Query]
    }
  }

  /**
    * Contains the parameters for QueryObjects.
    */
  @js.native
  trait QueryObjectsInput extends js.Object {
    var pipelineId: id
    var sphere: String
    var limit: js.UndefOr[Int]
    var marker: js.UndefOr[String]
    var query: js.UndefOr[Query]
  }

  object QueryObjectsInput {
    def apply(
        pipelineId: id,
        sphere: String,
        limit: js.UndefOr[Int] = js.undefined,
        marker: js.UndefOr[String] = js.undefined,
        query: js.UndefOr[Query] = js.undefined
    ): QueryObjectsInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "sphere"     -> sphere.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.update("marker", __v.asInstanceOf[js.Any]))
      query.foreach(__v => __obj.update("query", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryObjectsInput]
    }
  }

  /**
    * Contains the output of QueryObjects.
    */
  @js.native
  trait QueryObjectsOutput extends js.Object {
    var hasMoreResults: js.UndefOr[Boolean]
    var ids: js.UndefOr[idList]
    var marker: js.UndefOr[String]
  }

  object QueryObjectsOutput {
    def apply(
        hasMoreResults: js.UndefOr[Boolean] = js.undefined,
        ids: js.UndefOr[idList] = js.undefined,
        marker: js.UndefOr[String] = js.undefined
    ): QueryObjectsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      hasMoreResults.foreach(__v => __obj.update("hasMoreResults", __v.asInstanceOf[js.Any]))
      ids.foreach(__v => __obj.update("ids", __v.asInstanceOf[js.Any]))
      marker.foreach(__v => __obj.update("marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryObjectsOutput]
    }
  }

  /**
    * Contains the parameters for RemoveTags.
    */
  @js.native
  trait RemoveTagsInput extends js.Object {
    var pipelineId: id
    var tagKeys: stringList
  }

  object RemoveTagsInput {
    def apply(
        pipelineId: id,
        tagKeys: stringList
    ): RemoveTagsInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "tagKeys"    -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsInput]
    }
  }

  /**
    * Contains the output of RemoveTags.
    */
  @js.native
  trait RemoveTagsOutput extends js.Object {}

  object RemoveTagsOutput {
    def apply(
        ): RemoveTagsOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[RemoveTagsOutput]
    }
  }

  /**
    * Contains the parameters for ReportTaskProgress.
    */
  @js.native
  trait ReportTaskProgressInput extends js.Object {
    var taskId: taskId
    var fields: js.UndefOr[fieldList]
  }

  object ReportTaskProgressInput {
    def apply(
        taskId: taskId,
        fields: js.UndefOr[fieldList] = js.undefined
    ): ReportTaskProgressInput = {
      val __obj = js.Dictionary[js.Any](
        "taskId" -> taskId.asInstanceOf[js.Any]
      )

      fields.foreach(__v => __obj.update("fields", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReportTaskProgressInput]
    }
  }

  /**
    * Contains the output of ReportTaskProgress.
    */
  @js.native
  trait ReportTaskProgressOutput extends js.Object {
    var canceled: Boolean
  }

  object ReportTaskProgressOutput {
    def apply(
        canceled: Boolean
    ): ReportTaskProgressOutput = {
      val __obj = js.Dictionary[js.Any](
        "canceled" -> canceled.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReportTaskProgressOutput]
    }
  }

  /**
    * Contains the parameters for ReportTaskRunnerHeartbeat.
    */
  @js.native
  trait ReportTaskRunnerHeartbeatInput extends js.Object {
    var taskrunnerId: id
    var hostname: js.UndefOr[id]
    var workerGroup: js.UndefOr[String]
  }

  object ReportTaskRunnerHeartbeatInput {
    def apply(
        taskrunnerId: id,
        hostname: js.UndefOr[id] = js.undefined,
        workerGroup: js.UndefOr[String] = js.undefined
    ): ReportTaskRunnerHeartbeatInput = {
      val __obj = js.Dictionary[js.Any](
        "taskrunnerId" -> taskrunnerId.asInstanceOf[js.Any]
      )

      hostname.foreach(__v => __obj.update("hostname", __v.asInstanceOf[js.Any]))
      workerGroup.foreach(__v => __obj.update("workerGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReportTaskRunnerHeartbeatInput]
    }
  }

  /**
    * Contains the output of ReportTaskRunnerHeartbeat.
    */
  @js.native
  trait ReportTaskRunnerHeartbeatOutput extends js.Object {
    var terminate: Boolean
  }

  object ReportTaskRunnerHeartbeatOutput {
    def apply(
        terminate: Boolean
    ): ReportTaskRunnerHeartbeatOutput = {
      val __obj = js.Dictionary[js.Any](
        "terminate" -> terminate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReportTaskRunnerHeartbeatOutput]
    }
  }

  /**
    * A comparision that is used to determine whether a query should return this object.
    */
  @js.native
  trait Selector extends js.Object {
    var fieldName: js.UndefOr[String]
    var operator: js.UndefOr[Operator]
  }

  object Selector {
    def apply(
        fieldName: js.UndefOr[String] = js.undefined,
        operator: js.UndefOr[Operator] = js.undefined
    ): Selector = {
      val __obj = js.Dictionary.empty[js.Any]
      fieldName.foreach(__v => __obj.update("fieldName", __v.asInstanceOf[js.Any]))
      operator.foreach(__v => __obj.update("operator", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Selector]
    }
  }

  /**
    * Contains the parameters for SetStatus.
    */
  @js.native
  trait SetStatusInput extends js.Object {
    var objectIds: idList
    var pipelineId: id
    var status: String
  }

  object SetStatusInput {
    def apply(
        objectIds: idList,
        pipelineId: id,
        status: String
    ): SetStatusInput = {
      val __obj = js.Dictionary[js.Any](
        "objectIds"  -> objectIds.asInstanceOf[js.Any],
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "status"     -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetStatusInput]
    }
  }

  /**
    * Contains the parameters for SetTaskStatus.
    */
  @js.native
  trait SetTaskStatusInput extends js.Object {
    var taskId: taskId
    var taskStatus: TaskStatus
    var errorId: js.UndefOr[String]
    var errorMessage: js.UndefOr[errorMessage]
    var errorStackTrace: js.UndefOr[String]
  }

  object SetTaskStatusInput {
    def apply(
        taskId: taskId,
        taskStatus: TaskStatus,
        errorId: js.UndefOr[String] = js.undefined,
        errorMessage: js.UndefOr[errorMessage] = js.undefined,
        errorStackTrace: js.UndefOr[String] = js.undefined
    ): SetTaskStatusInput = {
      val __obj = js.Dictionary[js.Any](
        "taskId"     -> taskId.asInstanceOf[js.Any],
        "taskStatus" -> taskStatus.asInstanceOf[js.Any]
      )

      errorId.foreach(__v => __obj.update("errorId", __v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.update("errorMessage", __v.asInstanceOf[js.Any]))
      errorStackTrace.foreach(__v => __obj.update("errorStackTrace", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetTaskStatusInput]
    }
  }

  /**
    * Contains the output of SetTaskStatus.
    */
  @js.native
  trait SetTaskStatusOutput extends js.Object {}

  object SetTaskStatusOutput {
    def apply(
        ): SetTaskStatusOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[SetTaskStatusOutput]
    }
  }

  /**
    * Tags are key/value pairs defined by a user and associated with a pipeline to control access. AWS Data Pipeline allows you to associate ten tags per pipeline. For more information, see [[http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html|Controlling User Access to Pipelines]] in the <i>AWS Data Pipeline Developer Guide</i>.
    */
  @js.native
  trait Tag extends js.Object {
    var key: tagKey
    var value: tagValue
  }

  object Tag {
    def apply(
        key: tagKey,
        value: tagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "key"   -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
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
  trait TaskObject extends js.Object {
    var attemptId: js.UndefOr[id]
    var objects: js.UndefOr[PipelineObjectMap]
    var pipelineId: js.UndefOr[id]
    var taskId: js.UndefOr[taskId]
  }

  object TaskObject {
    def apply(
        attemptId: js.UndefOr[id] = js.undefined,
        objects: js.UndefOr[PipelineObjectMap] = js.undefined,
        pipelineId: js.UndefOr[id] = js.undefined,
        taskId: js.UndefOr[taskId] = js.undefined
    ): TaskObject = {
      val __obj = js.Dictionary.empty[js.Any]
      attemptId.foreach(__v => __obj.update("attemptId", __v.asInstanceOf[js.Any]))
      objects.foreach(__v => __obj.update("objects", __v.asInstanceOf[js.Any]))
      pipelineId.foreach(__v => __obj.update("pipelineId", __v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.update("taskId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskObject]
    }
  }

  object TaskStatusEnum {
    val FINISHED = "FINISHED"
    val FAILED   = "FAILED"
    val FALSE    = "FALSE"

    val values = js.Object.freeze(js.Array(FINISHED, FAILED, FALSE))
  }

  /**
    * Contains the parameters for ValidatePipelineDefinition.
    */
  @js.native
  trait ValidatePipelineDefinitionInput extends js.Object {
    var pipelineId: id
    var pipelineObjects: PipelineObjectList
    var parameterObjects: js.UndefOr[ParameterObjectList]
    var parameterValues: js.UndefOr[ParameterValueList]
  }

  object ValidatePipelineDefinitionInput {
    def apply(
        pipelineId: id,
        pipelineObjects: PipelineObjectList,
        parameterObjects: js.UndefOr[ParameterObjectList] = js.undefined,
        parameterValues: js.UndefOr[ParameterValueList] = js.undefined
    ): ValidatePipelineDefinitionInput = {
      val __obj = js.Dictionary[js.Any](
        "pipelineId"      -> pipelineId.asInstanceOf[js.Any],
        "pipelineObjects" -> pipelineObjects.asInstanceOf[js.Any]
      )

      parameterObjects.foreach(__v => __obj.update("parameterObjects", __v.asInstanceOf[js.Any]))
      parameterValues.foreach(__v => __obj.update("parameterValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidatePipelineDefinitionInput]
    }
  }

  /**
    * Contains the output of ValidatePipelineDefinition.
    */
  @js.native
  trait ValidatePipelineDefinitionOutput extends js.Object {
    var errored: Boolean
    var validationErrors: js.UndefOr[ValidationErrors]
    var validationWarnings: js.UndefOr[ValidationWarnings]
  }

  object ValidatePipelineDefinitionOutput {
    def apply(
        errored: Boolean,
        validationErrors: js.UndefOr[ValidationErrors] = js.undefined,
        validationWarnings: js.UndefOr[ValidationWarnings] = js.undefined
    ): ValidatePipelineDefinitionOutput = {
      val __obj = js.Dictionary[js.Any](
        "errored" -> errored.asInstanceOf[js.Any]
      )

      validationErrors.foreach(__v => __obj.update("validationErrors", __v.asInstanceOf[js.Any]))
      validationWarnings.foreach(__v => __obj.update("validationWarnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidatePipelineDefinitionOutput]
    }
  }

  /**
    * Defines a validation error. Validation errors prevent pipeline activation. The set of validation errors that can be returned are defined by AWS Data Pipeline.
    */
  @js.native
  trait ValidationError extends js.Object {
    var errors: js.UndefOr[validationMessages]
    var id: js.UndefOr[id]
  }

  object ValidationError {
    def apply(
        errors: js.UndefOr[validationMessages] = js.undefined,
        id: js.UndefOr[id] = js.undefined
    ): ValidationError = {
      val __obj = js.Dictionary.empty[js.Any]
      errors.foreach(__v => __obj.update("errors", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidationError]
    }
  }

  /**
    * Defines a validation warning. Validation warnings do not prevent pipeline activation. The set of validation warnings that can be returned are defined by AWS Data Pipeline.
    */
  @js.native
  trait ValidationWarning extends js.Object {
    var id: js.UndefOr[id]
    var warnings: js.UndefOr[validationMessages]
  }

  object ValidationWarning {
    def apply(
        id: js.UndefOr[id] = js.undefined,
        warnings: js.UndefOr[validationMessages] = js.undefined
    ): ValidationWarning = {
      val __obj = js.Dictionary.empty[js.Any]
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      warnings.foreach(__v => __obj.update("warnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidationWarning]
    }
  }
}
