package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
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
  type boolean                 = Boolean
  type cancelActive            = Boolean
  type errorMessage            = String
  type fieldList               = js.Array[Field]
  type fieldNameString         = String
  type fieldStringValue        = String
  type id                      = String
  type idList                  = js.Array[id]
  type longString              = String
  type pipelineList            = js.Array[PipelineIdName]
  type string                  = String
  type stringList              = js.Array[string]
  type tagKey                  = String
  type tagList                 = js.Array[Tag]
  type tagValue                = String
  type taskId                  = String
  type timestamp               = js.Date
  type validationMessage       = String
  type validationMessages      = js.Array[validationMessage]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "parameterValues" -> parameterValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startTimestamp" -> startTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivatePipelineInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivatePipelineOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "tags"       -> tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsOutput]
    }
  }

  /**
    * Contains the parameters for CreatePipeline.
    */
  @js.native
  trait CreatePipelineInput extends js.Object {
    var name: id
    var uniqueId: id
    var description: js.UndefOr[string]
    var tags: js.UndefOr[tagList]
  }

  object CreatePipelineInput {
    def apply(
        name: id,
        uniqueId: id,
        description: js.UndefOr[string] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): CreatePipelineInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name"     -> name.asInstanceOf[js.Any],
        "uniqueId" -> uniqueId.asInstanceOf[js.Any],
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePipelineInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePipelineOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "cancelActive" -> cancelActive.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeactivatePipelineInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeactivatePipelineOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePipelineInput]
    }
  }

  /**
    * Contains the parameters for DescribeObjects.
    */
  @js.native
  trait DescribeObjectsInput extends js.Object {
    var objectIds: idList
    var pipelineId: id
    var evaluateExpressions: js.UndefOr[boolean]
    var marker: js.UndefOr[string]
  }

  object DescribeObjectsInput {
    def apply(
        objectIds: idList,
        pipelineId: id,
        evaluateExpressions: js.UndefOr[boolean] = js.undefined,
        marker: js.UndefOr[string] = js.undefined
    ): DescribeObjectsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "objectIds"  -> objectIds.asInstanceOf[js.Any],
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "evaluateExpressions" -> evaluateExpressions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeObjectsInput]
    }
  }

  /**
    * Contains the output of DescribeObjects.
    */
  @js.native
  trait DescribeObjectsOutput extends js.Object {
    var pipelineObjects: PipelineObjectList
    var hasMoreResults: js.UndefOr[boolean]
    var marker: js.UndefOr[string]
  }

  object DescribeObjectsOutput {
    def apply(
        pipelineObjects: PipelineObjectList,
        hasMoreResults: js.UndefOr[boolean] = js.undefined,
        marker: js.UndefOr[string] = js.undefined
    ): DescribeObjectsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineObjects" -> pipelineObjects.asInstanceOf[js.Any],
        "hasMoreResults" -> hasMoreResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeObjectsOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineIds" -> pipelineIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePipelinesInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineDescriptionList" -> pipelineDescriptionList.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePipelinesOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "expression" -> expression.asInstanceOf[js.Any],
        "objectId"   -> objectId.asInstanceOf[js.Any],
        "pipelineId" -> pipelineId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluateExpressionInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "evaluatedExpression" -> evaluatedExpression.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EvaluateExpressionOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.asInstanceOf[js.Any],
        "refValue" -> refValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stringValue" -> stringValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Field]
    }
  }

  /**
    * Contains the parameters for GetPipelineDefinition.
    */
  @js.native
  trait GetPipelineDefinitionInput extends js.Object {
    var pipelineId: id
    var version: js.UndefOr[string]
  }

  object GetPipelineDefinitionInput {
    def apply(
        pipelineId: id,
        version: js.UndefOr[string] = js.undefined
    ): GetPipelineDefinitionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPipelineDefinitionInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "parameterObjects" -> parameterObjects.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parameterValues" -> parameterValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pipelineObjects" -> pipelineObjects.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPipelineDefinitionOutput]
    }
  }

  /**
    * <p>Identity information for the EC2 instance that is hosting the task runner. You can get this value by calling a metadata URI from the EC2 instance. For more information, see [[http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html|Instance Metadata]] in the <i>Amazon Elastic Compute Cloud User Guide.</i> Passing in this value proves that your task runner is running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges are applied to your pipeline.
    * </p>
    */
  @js.native
  trait InstanceIdentity extends js.Object {
    var document: js.UndefOr[string]
    var signature: js.UndefOr[string]
  }

  object InstanceIdentity {
    def apply(
        document: js.UndefOr[string] = js.undefined,
        signature: js.UndefOr[string] = js.undefined
    ): InstanceIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "document" -> document.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signature" -> signature.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceIdentity]
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
    var marker: js.UndefOr[string]
  }

  object ListPipelinesInput {
    def apply(
        marker: js.UndefOr[string] = js.undefined
    ): ListPipelinesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPipelinesInput]
    }
  }

  /**
    * Contains the output of ListPipelines.
    */
  @js.native
  trait ListPipelinesOutput extends js.Object {
    var pipelineIdList: pipelineList
    var hasMoreResults: js.UndefOr[boolean]
    var marker: js.UndefOr[string]
  }

  object ListPipelinesOutput {
    def apply(
        pipelineIdList: pipelineList,
        hasMoreResults: js.UndefOr[boolean] = js.undefined,
        marker: js.UndefOr[string] = js.undefined
    ): ListPipelinesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineIdList" -> pipelineIdList.asInstanceOf[js.Any],
        "hasMoreResults" -> hasMoreResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPipelinesOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "`type`" -> `type`.map { x =>
          x.asInstanceOf[js.Any]
        },
        "values" -> values.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Operator]
    }
  }

  object OperatorTypeEnum {
    val EQ      = "EQ"
    val REF_EQ  = "REF_EQ"
    val LE      = "LE"
    val GE      = "GE"
    val BETWEEN = "BETWEEN"

    val values = IndexedSeq(EQ, REF_EQ, LE, GE, BETWEEN)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "key"         -> key.asInstanceOf[js.Any],
        "stringValue" -> stringValue.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterAttribute]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.asInstanceOf[js.Any],
        "id"         -> id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterObject]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "id"          -> id.asInstanceOf[js.Any],
        "stringValue" -> stringValue.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterValue]
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
    var description: js.UndefOr[string]
    var tags: js.UndefOr[tagList]
  }

  object PipelineDescription {
    def apply(
        fields: fieldList,
        name: id,
        pipelineId: id,
        description: js.UndefOr[string] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): PipelineDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fields"     -> fields.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any],
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PipelineDescription]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PipelineIdName]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "fields" -> fields.asInstanceOf[js.Any],
        "id"     -> id.asInstanceOf[js.Any],
        "name"   -> name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PipelineObject]
    }
  }

  /**
    * Contains the parameters for PollForTask.
    */
  @js.native
  trait PollForTaskInput extends js.Object {
    var workerGroup: string
    var hostname: js.UndefOr[id]
    var instanceIdentity: js.UndefOr[InstanceIdentity]
  }

  object PollForTaskInput {
    def apply(
        workerGroup: string,
        hostname: js.UndefOr[id] = js.undefined,
        instanceIdentity: js.UndefOr[InstanceIdentity] = js.undefined
    ): PollForTaskInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workerGroup" -> workerGroup.asInstanceOf[js.Any],
        "hostname" -> hostname.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceIdentity" -> instanceIdentity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PollForTaskInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "taskObject" -> taskObject.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PollForTaskOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineId"      -> pipelineId.asInstanceOf[js.Any],
        "pipelineObjects" -> pipelineObjects.asInstanceOf[js.Any],
        "parameterObjects" -> parameterObjects.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parameterValues" -> parameterValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutPipelineDefinitionInput]
    }
  }

  /**
    * Contains the output of PutPipelineDefinition.
    */
  @js.native
  trait PutPipelineDefinitionOutput extends js.Object {
    var errored: boolean
    var validationErrors: js.UndefOr[ValidationErrors]
    var validationWarnings: js.UndefOr[ValidationWarnings]
  }

  object PutPipelineDefinitionOutput {
    def apply(
        errored: boolean,
        validationErrors: js.UndefOr[ValidationErrors] = js.undefined,
        validationWarnings: js.UndefOr[ValidationWarnings] = js.undefined
    ): PutPipelineDefinitionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "errored" -> errored.asInstanceOf[js.Any],
        "validationErrors" -> validationErrors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "validationWarnings" -> validationWarnings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutPipelineDefinitionOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "selectors" -> selectors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Query]
    }
  }

  /**
    * Contains the parameters for QueryObjects.
    */
  @js.native
  trait QueryObjectsInput extends js.Object {
    var pipelineId: id
    var sphere: string
    var limit: js.UndefOr[Int]
    var marker: js.UndefOr[string]
    var query: js.UndefOr[Query]
  }

  object QueryObjectsInput {
    def apply(
        pipelineId: id,
        sphere: string,
        limit: js.UndefOr[Int] = js.undefined,
        marker: js.UndefOr[string] = js.undefined,
        query: js.UndefOr[Query] = js.undefined
    ): QueryObjectsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "sphere"     -> sphere.asInstanceOf[js.Any],
        "limit" -> limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "query" -> query.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryObjectsInput]
    }
  }

  /**
    * Contains the output of QueryObjects.
    */
  @js.native
  trait QueryObjectsOutput extends js.Object {
    var hasMoreResults: js.UndefOr[boolean]
    var ids: js.UndefOr[idList]
    var marker: js.UndefOr[string]
  }

  object QueryObjectsOutput {
    def apply(
        hasMoreResults: js.UndefOr[boolean] = js.undefined,
        ids: js.UndefOr[idList] = js.undefined,
        marker: js.UndefOr[string] = js.undefined
    ): QueryObjectsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "hasMoreResults" -> hasMoreResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ids" -> ids.map { x =>
          x.asInstanceOf[js.Any]
        },
        "marker" -> marker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryObjectsOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "tagKeys"    -> tagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.asInstanceOf[js.Any],
        "fields" -> fields.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReportTaskProgressInput]
    }
  }

  /**
    * Contains the output of ReportTaskProgress.
    */
  @js.native
  trait ReportTaskProgressOutput extends js.Object {
    var canceled: boolean
  }

  object ReportTaskProgressOutput {
    def apply(
        canceled: boolean
    ): ReportTaskProgressOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "canceled" -> canceled.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReportTaskProgressOutput]
    }
  }

  /**
    * Contains the parameters for ReportTaskRunnerHeartbeat.
    */
  @js.native
  trait ReportTaskRunnerHeartbeatInput extends js.Object {
    var taskrunnerId: id
    var hostname: js.UndefOr[id]
    var workerGroup: js.UndefOr[string]
  }

  object ReportTaskRunnerHeartbeatInput {
    def apply(
        taskrunnerId: id,
        hostname: js.UndefOr[id] = js.undefined,
        workerGroup: js.UndefOr[string] = js.undefined
    ): ReportTaskRunnerHeartbeatInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskrunnerId" -> taskrunnerId.asInstanceOf[js.Any],
        "hostname" -> hostname.map { x =>
          x.asInstanceOf[js.Any]
        },
        "workerGroup" -> workerGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReportTaskRunnerHeartbeatInput]
    }
  }

  /**
    * Contains the output of ReportTaskRunnerHeartbeat.
    */
  @js.native
  trait ReportTaskRunnerHeartbeatOutput extends js.Object {
    var terminate: boolean
  }

  object ReportTaskRunnerHeartbeatOutput {
    def apply(
        terminate: boolean
    ): ReportTaskRunnerHeartbeatOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "terminate" -> terminate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReportTaskRunnerHeartbeatOutput]
    }
  }

  /**
    * A comparision that is used to determine whether a query should return this object.
    */
  @js.native
  trait Selector extends js.Object {
    var fieldName: js.UndefOr[string]
    var operator: js.UndefOr[Operator]
  }

  object Selector {
    def apply(
        fieldName: js.UndefOr[string] = js.undefined,
        operator: js.UndefOr[Operator] = js.undefined
    ): Selector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fieldName" -> fieldName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "operator" -> operator.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Selector]
    }
  }

  /**
    * Contains the parameters for SetStatus.
    */
  @js.native
  trait SetStatusInput extends js.Object {
    var objectIds: idList
    var pipelineId: id
    var status: string
  }

  object SetStatusInput {
    def apply(
        objectIds: idList,
        pipelineId: id,
        status: string
    ): SetStatusInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "objectIds"  -> objectIds.asInstanceOf[js.Any],
        "pipelineId" -> pipelineId.asInstanceOf[js.Any],
        "status"     -> status.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetStatusInput]
    }
  }

  /**
    * Contains the parameters for SetTaskStatus.
    */
  @js.native
  trait SetTaskStatusInput extends js.Object {
    var taskId: taskId
    var taskStatus: TaskStatus
    var errorId: js.UndefOr[string]
    var errorMessage: js.UndefOr[errorMessage]
    var errorStackTrace: js.UndefOr[string]
  }

  object SetTaskStatusInput {
    def apply(
        taskId: taskId,
        taskStatus: TaskStatus,
        errorId: js.UndefOr[string] = js.undefined,
        errorMessage: js.UndefOr[errorMessage] = js.undefined,
        errorStackTrace: js.UndefOr[string] = js.undefined
    ): SetTaskStatusInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId"     -> taskId.asInstanceOf[js.Any],
        "taskStatus" -> taskStatus.asInstanceOf[js.Any],
        "errorId" -> errorId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorMessage" -> errorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorStackTrace" -> errorStackTrace.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetTaskStatusInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetTaskStatusOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "key"   -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "attemptId" -> attemptId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "objects" -> objects.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pipelineId" -> pipelineId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskId" -> taskId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskObject]
    }
  }

  object TaskStatusEnum {
    val FINISHED = "FINISHED"
    val FAILED   = "FAILED"
    val FALSE    = "FALSE"

    val values = IndexedSeq(FINISHED, FAILED, FALSE)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineId"      -> pipelineId.asInstanceOf[js.Any],
        "pipelineObjects" -> pipelineObjects.asInstanceOf[js.Any],
        "parameterObjects" -> parameterObjects.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parameterValues" -> parameterValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidatePipelineDefinitionInput]
    }
  }

  /**
    * Contains the output of ValidatePipelineDefinition.
    */
  @js.native
  trait ValidatePipelineDefinitionOutput extends js.Object {
    var errored: boolean
    var validationErrors: js.UndefOr[ValidationErrors]
    var validationWarnings: js.UndefOr[ValidationWarnings]
  }

  object ValidatePipelineDefinitionOutput {
    def apply(
        errored: boolean,
        validationErrors: js.UndefOr[ValidationErrors] = js.undefined,
        validationWarnings: js.UndefOr[ValidationWarnings] = js.undefined
    ): ValidatePipelineDefinitionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "errored" -> errored.asInstanceOf[js.Any],
        "validationErrors" -> validationErrors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "validationWarnings" -> validationWarnings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidatePipelineDefinitionOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "errors" -> errors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "id" -> id.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidationError]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "warnings" -> warnings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidationWarning]
    }
  }
}
