package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object iotevents {
  type Actions                       = js.Array[Action]
  type AmazonResourceName            = String
  type AttributeJsonPath             = String
  type Attributes                    = js.Array[Attribute]
  type Condition                     = String
  type DeliveryStreamName            = String
  type DetectorDebugOptions          = js.Array[DetectorDebugOption]
  type DetectorModelArn              = String
  type DetectorModelDescription      = String
  type DetectorModelName             = String
  type DetectorModelSummaries        = js.Array[DetectorModelSummary]
  type DetectorModelVersion          = String
  type DetectorModelVersionStatus    = String
  type DetectorModelVersionSummaries = js.Array[DetectorModelVersionSummary]
  type EventName                     = String
  type Events                        = js.Array[Event]
  type FirehoseSeparator             = String
  type InputArn                      = String
  type InputDescription              = String
  type InputName                     = String
  type InputStatus                   = String
  type InputSummaries                = js.Array[InputSummary]
  type KeyValue                      = String
  type LoggingEnabled                = Boolean
  type LoggingLevel                  = String
  type MQTTTopic                     = String
  type MaxResults                    = Int
  type NextToken                     = String
  type QueueUrl                      = String
  type Seconds                       = Int
  type StateName                     = String
  type States                        = js.Array[State]
  type TagKey                        = String
  type TagKeys                       = js.Array[TagKey]
  type TagValue                      = String
  type Tags                          = js.Array[Tag]
  type TimerName                     = String
  type Timestamp                     = js.Date
  type TransitionEvents              = js.Array[TransitionEvent]
  type UseBase64                     = Boolean
  type VariableName                  = String
  type VariableValue                 = String

  implicit final class IoTEventsOps(private val service: IoTEvents) extends AnyVal {

    def createDetectorModelFuture(params: CreateDetectorModelRequest): Future[CreateDetectorModelResponse] =
      service.createDetectorModel(params).promise.toFuture
    def createInputFuture(params: CreateInputRequest): Future[CreateInputResponse] =
      service.createInput(params).promise.toFuture
    def deleteDetectorModelFuture(params: DeleteDetectorModelRequest): Future[DeleteDetectorModelResponse] =
      service.deleteDetectorModel(params).promise.toFuture
    def deleteInputFuture(params: DeleteInputRequest): Future[DeleteInputResponse] =
      service.deleteInput(params).promise.toFuture
    def describeDetectorModelFuture(params: DescribeDetectorModelRequest): Future[DescribeDetectorModelResponse] =
      service.describeDetectorModel(params).promise.toFuture
    def describeInputFuture(params: DescribeInputRequest): Future[DescribeInputResponse] =
      service.describeInput(params).promise.toFuture
    def describeLoggingOptionsFuture(params: DescribeLoggingOptionsRequest): Future[DescribeLoggingOptionsResponse] =
      service.describeLoggingOptions(params).promise.toFuture
    def listDetectorModelVersionsFuture(
        params: ListDetectorModelVersionsRequest
    ): Future[ListDetectorModelVersionsResponse] = service.listDetectorModelVersions(params).promise.toFuture
    def listDetectorModelsFuture(params: ListDetectorModelsRequest): Future[ListDetectorModelsResponse] =
      service.listDetectorModels(params).promise.toFuture
    def listInputsFuture(params: ListInputsRequest): Future[ListInputsResponse] =
      service.listInputs(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def putLoggingOptionsFuture(params: PutLoggingOptionsRequest): Future[js.Object] =
      service.putLoggingOptions(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateDetectorModelFuture(params: UpdateDetectorModelRequest): Future[UpdateDetectorModelResponse] =
      service.updateDetectorModel(params).promise.toFuture
    def updateInputFuture(params: UpdateInputRequest): Future[UpdateInputResponse] =
      service.updateInput(params).promise.toFuture
  }
}

package iotevents {
  @js.native
  @JSImport("aws-sdk", "IoTEvents")
  class IoTEvents() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDetectorModel(params: CreateDetectorModelRequest): Request[CreateDetectorModelResponse]       = js.native
    def createInput(params: CreateInputRequest): Request[CreateInputResponse]                               = js.native
    def deleteDetectorModel(params: DeleteDetectorModelRequest): Request[DeleteDetectorModelResponse]       = js.native
    def deleteInput(params: DeleteInputRequest): Request[DeleteInputResponse]                               = js.native
    def describeDetectorModel(params: DescribeDetectorModelRequest): Request[DescribeDetectorModelResponse] = js.native
    def describeInput(params: DescribeInputRequest): Request[DescribeInputResponse]                         = js.native
    def describeLoggingOptions(params: DescribeLoggingOptionsRequest): Request[DescribeLoggingOptionsResponse] =
      js.native
    def listDetectorModelVersions(
        params: ListDetectorModelVersionsRequest
    ): Request[ListDetectorModelVersionsResponse]                                                     = js.native
    def listDetectorModels(params: ListDetectorModelsRequest): Request[ListDetectorModelsResponse]    = js.native
    def listInputs(params: ListInputsRequest): Request[ListInputsResponse]                            = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putLoggingOptions(params: PutLoggingOptionsRequest): Request[js.Object]                       = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateDetectorModel(params: UpdateDetectorModelRequest): Request[UpdateDetectorModelResponse] = js.native
    def updateInput(params: UpdateInputRequest): Request[UpdateInputResponse]                         = js.native
  }

  /**
    * An action to be performed when the <code>"condition"</code> is TRUE.
    */
  @js.native
  trait Action extends js.Object {
    var clearTimer: js.UndefOr[ClearTimerAction]
    var firehose: js.UndefOr[FirehoseAction]
    var iotEvents: js.UndefOr[IotEventsAction]
    var iotTopicPublish: js.UndefOr[IotTopicPublishAction]
    var lambda: js.UndefOr[LambdaAction]
    var resetTimer: js.UndefOr[ResetTimerAction]
    var setTimer: js.UndefOr[SetTimerAction]
    var setVariable: js.UndefOr[SetVariableAction]
    var sns: js.UndefOr[SNSTopicPublishAction]
    var sqs: js.UndefOr[SqsAction]
  }

  object Action {
    def apply(
        clearTimer: js.UndefOr[ClearTimerAction] = js.undefined,
        firehose: js.UndefOr[FirehoseAction] = js.undefined,
        iotEvents: js.UndefOr[IotEventsAction] = js.undefined,
        iotTopicPublish: js.UndefOr[IotTopicPublishAction] = js.undefined,
        lambda: js.UndefOr[LambdaAction] = js.undefined,
        resetTimer: js.UndefOr[ResetTimerAction] = js.undefined,
        setTimer: js.UndefOr[SetTimerAction] = js.undefined,
        setVariable: js.UndefOr[SetVariableAction] = js.undefined,
        sns: js.UndefOr[SNSTopicPublishAction] = js.undefined,
        sqs: js.UndefOr[SqsAction] = js.undefined
    ): Action = {
      val __obj = js.Dictionary.empty[js.Any]
      clearTimer.foreach(__v => __obj.update("clearTimer", __v.asInstanceOf[js.Any]))
      firehose.foreach(__v => __obj.update("firehose", __v.asInstanceOf[js.Any]))
      iotEvents.foreach(__v => __obj.update("iotEvents", __v.asInstanceOf[js.Any]))
      iotTopicPublish.foreach(__v => __obj.update("iotTopicPublish", __v.asInstanceOf[js.Any]))
      lambda.foreach(__v => __obj.update("lambda", __v.asInstanceOf[js.Any]))
      resetTimer.foreach(__v => __obj.update("resetTimer", __v.asInstanceOf[js.Any]))
      setTimer.foreach(__v => __obj.update("setTimer", __v.asInstanceOf[js.Any]))
      setVariable.foreach(__v => __obj.update("setVariable", __v.asInstanceOf[js.Any]))
      sns.foreach(__v => __obj.update("sns", __v.asInstanceOf[js.Any]))
      sqs.foreach(__v => __obj.update("sqs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  /**
    * The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains a JSON payload, and those attributes (and their paired values) specified here are available for use in the <code>condition</code> expressions used by detectors.
    */
  @js.native
  trait Attribute extends js.Object {
    var jsonPath: AttributeJsonPath
  }

  object Attribute {
    def apply(
        jsonPath: AttributeJsonPath
    ): Attribute = {
      val __obj = js.Dictionary[js.Any](
        "jsonPath" -> jsonPath.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Attribute]
    }
  }

  /**
    * Information needed to clear the timer.
    */
  @js.native
  trait ClearTimerAction extends js.Object {
    var timerName: TimerName
  }

  object ClearTimerAction {
    def apply(
        timerName: TimerName
    ): ClearTimerAction = {
      val __obj = js.Dictionary[js.Any](
        "timerName" -> timerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ClearTimerAction]
    }
  }

  @js.native
  trait CreateDetectorModelRequest extends js.Object {
    var detectorModelDefinition: DetectorModelDefinition
    var detectorModelName: DetectorModelName
    var roleArn: AmazonResourceName
    var detectorModelDescription: js.UndefOr[DetectorModelDescription]
    var key: js.UndefOr[AttributeJsonPath]
    var tags: js.UndefOr[Tags]
  }

  object CreateDetectorModelRequest {
    def apply(
        detectorModelDefinition: DetectorModelDefinition,
        detectorModelName: DetectorModelName,
        roleArn: AmazonResourceName,
        detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined,
        key: js.UndefOr[AttributeJsonPath] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateDetectorModelRequest = {
      val __obj = js.Dictionary[js.Any](
        "detectorModelDefinition" -> detectorModelDefinition.asInstanceOf[js.Any],
        "detectorModelName"       -> detectorModelName.asInstanceOf[js.Any],
        "roleArn"                 -> roleArn.asInstanceOf[js.Any]
      )

      detectorModelDescription.foreach(__v => __obj.update("detectorModelDescription", __v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.update("key", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDetectorModelRequest]
    }
  }

  @js.native
  trait CreateDetectorModelResponse extends js.Object {
    var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration]
  }

  object CreateDetectorModelResponse {
    def apply(
        detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.undefined
    ): CreateDetectorModelResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      detectorModelConfiguration.foreach(__v => __obj.update("detectorModelConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDetectorModelResponse]
    }
  }

  @js.native
  trait CreateInputRequest extends js.Object {
    var inputDefinition: InputDefinition
    var inputName: InputName
    var inputDescription: js.UndefOr[InputDescription]
    var tags: js.UndefOr[Tags]
  }

  object CreateInputRequest {
    def apply(
        inputDefinition: InputDefinition,
        inputName: InputName,
        inputDescription: js.UndefOr[InputDescription] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateInputRequest = {
      val __obj = js.Dictionary[js.Any](
        "inputDefinition" -> inputDefinition.asInstanceOf[js.Any],
        "inputName"       -> inputName.asInstanceOf[js.Any]
      )

      inputDescription.foreach(__v => __obj.update("inputDescription", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInputRequest]
    }
  }

  @js.native
  trait CreateInputResponse extends js.Object {
    var inputConfiguration: js.UndefOr[InputConfiguration]
  }

  object CreateInputResponse {
    def apply(
        inputConfiguration: js.UndefOr[InputConfiguration] = js.undefined
    ): CreateInputResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      inputConfiguration.foreach(__v => __obj.update("inputConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInputResponse]
    }
  }

  @js.native
  trait DeleteDetectorModelRequest extends js.Object {
    var detectorModelName: DetectorModelName
  }

  object DeleteDetectorModelRequest {
    def apply(
        detectorModelName: DetectorModelName
    ): DeleteDetectorModelRequest = {
      val __obj = js.Dictionary[js.Any](
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDetectorModelRequest]
    }
  }

  @js.native
  trait DeleteDetectorModelResponse extends js.Object {}

  object DeleteDetectorModelResponse {
    def apply(
        ): DeleteDetectorModelResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteDetectorModelResponse]
    }
  }

  @js.native
  trait DeleteInputRequest extends js.Object {
    var inputName: InputName
  }

  object DeleteInputRequest {
    def apply(
        inputName: InputName
    ): DeleteInputRequest = {
      val __obj = js.Dictionary[js.Any](
        "inputName" -> inputName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInputRequest]
    }
  }

  @js.native
  trait DeleteInputResponse extends js.Object {}

  object DeleteInputResponse {
    def apply(
        ): DeleteInputResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteInputResponse]
    }
  }

  @js.native
  trait DescribeDetectorModelRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var detectorModelVersion: js.UndefOr[DetectorModelVersion]
  }

  object DescribeDetectorModelRequest {
    def apply(
        detectorModelName: DetectorModelName,
        detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined
    ): DescribeDetectorModelRequest = {
      val __obj = js.Dictionary[js.Any](
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any]
      )

      detectorModelVersion.foreach(__v => __obj.update("detectorModelVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectorModelRequest]
    }
  }

  @js.native
  trait DescribeDetectorModelResponse extends js.Object {
    var detectorModel: js.UndefOr[DetectorModel]
  }

  object DescribeDetectorModelResponse {
    def apply(
        detectorModel: js.UndefOr[DetectorModel] = js.undefined
    ): DescribeDetectorModelResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      detectorModel.foreach(__v => __obj.update("detectorModel", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectorModelResponse]
    }
  }

  @js.native
  trait DescribeInputRequest extends js.Object {
    var inputName: InputName
  }

  object DescribeInputRequest {
    def apply(
        inputName: InputName
    ): DescribeInputRequest = {
      val __obj = js.Dictionary[js.Any](
        "inputName" -> inputName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeInputRequest]
    }
  }

  @js.native
  trait DescribeInputResponse extends js.Object {
    var input: js.UndefOr[Input]
  }

  object DescribeInputResponse {
    def apply(
        input: js.UndefOr[Input] = js.undefined
    ): DescribeInputResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      input.foreach(__v => __obj.update("input", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInputResponse]
    }
  }

  @js.native
  trait DescribeLoggingOptionsRequest extends js.Object {}

  object DescribeLoggingOptionsRequest {
    def apply(
        ): DescribeLoggingOptionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DescribeLoggingOptionsRequest]
    }
  }

  @js.native
  trait DescribeLoggingOptionsResponse extends js.Object {
    var loggingOptions: js.UndefOr[LoggingOptions]
  }

  object DescribeLoggingOptionsResponse {
    def apply(
        loggingOptions: js.UndefOr[LoggingOptions] = js.undefined
    ): DescribeLoggingOptionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      loggingOptions.foreach(__v => __obj.update("loggingOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoggingOptionsResponse]
    }
  }

  /**
    * The detector model and the specific detectors (instances) for which the logging level is given.
    */
  @js.native
  trait DetectorDebugOption extends js.Object {
    var detectorModelName: DetectorModelName
    var keyValue: js.UndefOr[KeyValue]
  }

  object DetectorDebugOption {
    def apply(
        detectorModelName: DetectorModelName,
        keyValue: js.UndefOr[KeyValue] = js.undefined
    ): DetectorDebugOption = {
      val __obj = js.Dictionary[js.Any](
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.update("keyValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectorDebugOption]
    }
  }

  /**
    * Information about the detector model.
    */
  @js.native
  trait DetectorModel extends js.Object {
    var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration]
    var detectorModelDefinition: js.UndefOr[DetectorModelDefinition]
  }

  object DetectorModel {
    def apply(
        detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.undefined,
        detectorModelDefinition: js.UndefOr[DetectorModelDefinition] = js.undefined
    ): DetectorModel = {
      val __obj = js.Dictionary.empty[js.Any]
      detectorModelConfiguration.foreach(__v => __obj.update("detectorModelConfiguration", __v.asInstanceOf[js.Any]))
      detectorModelDefinition.foreach(__v => __obj.update("detectorModelDefinition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectorModel]
    }
  }

  /**
    * Information about how the detector model is configured.
    */
  @js.native
  trait DetectorModelConfiguration extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var detectorModelArn: js.UndefOr[DetectorModelArn]
    var detectorModelDescription: js.UndefOr[DetectorModelDescription]
    var detectorModelName: js.UndefOr[DetectorModelName]
    var detectorModelVersion: js.UndefOr[DetectorModelVersion]
    var key: js.UndefOr[AttributeJsonPath]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[AmazonResourceName]
    var status: js.UndefOr[DetectorModelVersionStatus]
  }

  object DetectorModelConfiguration {
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        detectorModelArn: js.UndefOr[DetectorModelArn] = js.undefined,
        detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined,
        detectorModelName: js.UndefOr[DetectorModelName] = js.undefined,
        detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined,
        key: js.UndefOr[AttributeJsonPath] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        roleArn: js.UndefOr[AmazonResourceName] = js.undefined,
        status: js.UndefOr[DetectorModelVersionStatus] = js.undefined
    ): DetectorModelConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      detectorModelArn.foreach(__v => __obj.update("detectorModelArn", __v.asInstanceOf[js.Any]))
      detectorModelDescription.foreach(__v => __obj.update("detectorModelDescription", __v.asInstanceOf[js.Any]))
      detectorModelName.foreach(__v => __obj.update("detectorModelName", __v.asInstanceOf[js.Any]))
      detectorModelVersion.foreach(__v => __obj.update("detectorModelVersion", __v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.update("key", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.update("roleArn", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectorModelConfiguration]
    }
  }

  /**
    * Information that defines how a detector operates.
    */
  @js.native
  trait DetectorModelDefinition extends js.Object {
    var initialStateName: StateName
    var states: States
  }

  object DetectorModelDefinition {
    def apply(
        initialStateName: StateName,
        states: States
    ): DetectorModelDefinition = {
      val __obj = js.Dictionary[js.Any](
        "initialStateName" -> initialStateName.asInstanceOf[js.Any],
        "states"           -> states.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectorModelDefinition]
    }
  }

  /**
    * Information about the detector model.
    */
  @js.native
  trait DetectorModelSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var detectorModelDescription: js.UndefOr[DetectorModelDescription]
    var detectorModelName: js.UndefOr[DetectorModelName]
  }

  object DetectorModelSummary {
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined,
        detectorModelName: js.UndefOr[DetectorModelName] = js.undefined
    ): DetectorModelSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      detectorModelDescription.foreach(__v => __obj.update("detectorModelDescription", __v.asInstanceOf[js.Any]))
      detectorModelName.foreach(__v => __obj.update("detectorModelName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectorModelSummary]
    }
  }

  object DetectorModelVersionStatusEnum {
    val ACTIVE     = "ACTIVE"
    val ACTIVATING = "ACTIVATING"
    val INACTIVE   = "INACTIVE"
    val DEPRECATED = "DEPRECATED"
    val DRAFT      = "DRAFT"
    val PAUSED     = "PAUSED"
    val FAILED     = "FAILED"

    val values = js.Object.freeze(js.Array(ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT, PAUSED, FAILED))
  }

  /**
    * Information about the detector model version.
    */
  @js.native
  trait DetectorModelVersionSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var detectorModelArn: js.UndefOr[DetectorModelArn]
    var detectorModelName: js.UndefOr[DetectorModelName]
    var detectorModelVersion: js.UndefOr[DetectorModelVersion]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[AmazonResourceName]
    var status: js.UndefOr[DetectorModelVersionStatus]
  }

  object DetectorModelVersionSummary {
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        detectorModelArn: js.UndefOr[DetectorModelArn] = js.undefined,
        detectorModelName: js.UndefOr[DetectorModelName] = js.undefined,
        detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        roleArn: js.UndefOr[AmazonResourceName] = js.undefined,
        status: js.UndefOr[DetectorModelVersionStatus] = js.undefined
    ): DetectorModelVersionSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      detectorModelArn.foreach(__v => __obj.update("detectorModelArn", __v.asInstanceOf[js.Any]))
      detectorModelName.foreach(__v => __obj.update("detectorModelName", __v.asInstanceOf[js.Any]))
      detectorModelVersion.foreach(__v => __obj.update("detectorModelVersion", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.update("roleArn", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectorModelVersionSummary]
    }
  }

  /**
    * Specifies the <code>"actions"</code> to be performed when the <code>"condition"</code> evaluates to TRUE.
    */
  @js.native
  trait Event extends js.Object {
    var eventName: EventName
    var actions: js.UndefOr[Actions]
    var condition: js.UndefOr[Condition]
  }

  object Event {
    def apply(
        eventName: EventName,
        actions: js.UndefOr[Actions] = js.undefined,
        condition: js.UndefOr[Condition] = js.undefined
    ): Event = {
      val __obj = js.Dictionary[js.Any](
        "eventName" -> eventName.asInstanceOf[js.Any]
      )

      actions.foreach(__v => __obj.update("actions", __v.asInstanceOf[js.Any]))
      condition.foreach(__v => __obj.update("condition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /**
    * Sends information about the detector model instance and the event which triggered the action to a Kinesis Data Firehose stream.
    */
  @js.native
  trait FirehoseAction extends js.Object {
    var deliveryStreamName: DeliveryStreamName
    var separator: js.UndefOr[FirehoseSeparator]
  }

  object FirehoseAction {
    def apply(
        deliveryStreamName: DeliveryStreamName,
        separator: js.UndefOr[FirehoseSeparator] = js.undefined
    ): FirehoseAction = {
      val __obj = js.Dictionary[js.Any](
        "deliveryStreamName" -> deliveryStreamName.asInstanceOf[js.Any]
      )

      separator.foreach(__v => __obj.update("separator", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirehoseAction]
    }
  }

  /**
    * Information about the input.
    */
  @js.native
  trait Input extends js.Object {
    var inputConfiguration: js.UndefOr[InputConfiguration]
    var inputDefinition: js.UndefOr[InputDefinition]
  }

  object Input {
    def apply(
        inputConfiguration: js.UndefOr[InputConfiguration] = js.undefined,
        inputDefinition: js.UndefOr[InputDefinition] = js.undefined
    ): Input = {
      val __obj = js.Dictionary.empty[js.Any]
      inputConfiguration.foreach(__v => __obj.update("inputConfiguration", __v.asInstanceOf[js.Any]))
      inputDefinition.foreach(__v => __obj.update("inputDefinition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Input]
    }
  }

  /**
    * Information about the configuration of an input.
    */
  @js.native
  trait InputConfiguration extends js.Object {
    var creationTime: Timestamp
    var inputArn: InputArn
    var inputName: InputName
    var lastUpdateTime: Timestamp
    var status: InputStatus
    var inputDescription: js.UndefOr[InputDescription]
  }

  object InputConfiguration {
    def apply(
        creationTime: Timestamp,
        inputArn: InputArn,
        inputName: InputName,
        lastUpdateTime: Timestamp,
        status: InputStatus,
        inputDescription: js.UndefOr[InputDescription] = js.undefined
    ): InputConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "creationTime"   -> creationTime.asInstanceOf[js.Any],
        "inputArn"       -> inputArn.asInstanceOf[js.Any],
        "inputName"      -> inputName.asInstanceOf[js.Any],
        "lastUpdateTime" -> lastUpdateTime.asInstanceOf[js.Any],
        "status"         -> status.asInstanceOf[js.Any]
      )

      inputDescription.foreach(__v => __obj.update("inputDescription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputConfiguration]
    }
  }

  /**
    * The definition of the input.
    */
  @js.native
  trait InputDefinition extends js.Object {
    var attributes: Attributes
  }

  object InputDefinition {
    def apply(
        attributes: Attributes
    ): InputDefinition = {
      val __obj = js.Dictionary[js.Any](
        "attributes" -> attributes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InputDefinition]
    }
  }

  object InputStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val ACTIVE   = "ACTIVE"
    val DELETING = "DELETING"

    val values = js.Object.freeze(js.Array(CREATING, UPDATING, ACTIVE, DELETING))
  }

  /**
    * Information about the input.
    */
  @js.native
  trait InputSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var inputArn: js.UndefOr[InputArn]
    var inputDescription: js.UndefOr[InputDescription]
    var inputName: js.UndefOr[InputName]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[InputStatus]
  }

  object InputSummary {
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        inputArn: js.UndefOr[InputArn] = js.undefined,
        inputDescription: js.UndefOr[InputDescription] = js.undefined,
        inputName: js.UndefOr[InputName] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[InputStatus] = js.undefined
    ): InputSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      inputArn.foreach(__v => __obj.update("inputArn", __v.asInstanceOf[js.Any]))
      inputDescription.foreach(__v => __obj.update("inputDescription", __v.asInstanceOf[js.Any]))
      inputName.foreach(__v => __obj.update("inputName", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputSummary]
    }
  }

  /**
    * Sends an IoT Events input, passing in information about the detector model instance and the event which triggered the action.
    */
  @js.native
  trait IotEventsAction extends js.Object {
    var inputName: InputName
  }

  object IotEventsAction {
    def apply(
        inputName: InputName
    ): IotEventsAction = {
      val __obj = js.Dictionary[js.Any](
        "inputName" -> inputName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[IotEventsAction]
    }
  }

  /**
    * Information required to publish the MQTT message via the AWS IoT message broker.
    */
  @js.native
  trait IotTopicPublishAction extends js.Object {
    var mqttTopic: MQTTTopic
  }

  object IotTopicPublishAction {
    def apply(
        mqttTopic: MQTTTopic
    ): IotTopicPublishAction = {
      val __obj = js.Dictionary[js.Any](
        "mqttTopic" -> mqttTopic.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[IotTopicPublishAction]
    }
  }

  /**
    * Calls a Lambda function, passing in information about the detector model instance and the event which triggered the action.
    */
  @js.native
  trait LambdaAction extends js.Object {
    var functionArn: AmazonResourceName
  }

  object LambdaAction {
    def apply(
        functionArn: AmazonResourceName
    ): LambdaAction = {
      val __obj = js.Dictionary[js.Any](
        "functionArn" -> functionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LambdaAction]
    }
  }

  @js.native
  trait ListDetectorModelVersionsRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDetectorModelVersionsRequest {
    def apply(
        detectorModelName: DetectorModelName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectorModelVersionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorModelVersionsRequest]
    }
  }

  @js.native
  trait ListDetectorModelVersionsResponse extends js.Object {
    var detectorModelVersionSummaries: js.UndefOr[DetectorModelVersionSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDetectorModelVersionsResponse {
    def apply(
        detectorModelVersionSummaries: js.UndefOr[DetectorModelVersionSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectorModelVersionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      detectorModelVersionSummaries.foreach(
        __v => __obj.update("detectorModelVersionSummaries", __v.asInstanceOf[js.Any])
      )
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorModelVersionsResponse]
    }
  }

  @js.native
  trait ListDetectorModelsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDetectorModelsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectorModelsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorModelsRequest]
    }
  }

  @js.native
  trait ListDetectorModelsResponse extends js.Object {
    var detectorModelSummaries: js.UndefOr[DetectorModelSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDetectorModelsResponse {
    def apply(
        detectorModelSummaries: js.UndefOr[DetectorModelSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectorModelsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      detectorModelSummaries.foreach(__v => __obj.update("detectorModelSummaries", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorModelsResponse]
    }
  }

  @js.native
  trait ListInputsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListInputsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInputsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInputsRequest]
    }
  }

  @js.native
  trait ListInputsResponse extends js.Object {
    var inputSummaries: js.UndefOr[InputSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListInputsResponse {
    def apply(
        inputSummaries: js.UndefOr[InputSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInputsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      inputSummaries.foreach(__v => __obj.update("inputSummaries", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInputsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    def apply(
        resourceArn: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    def apply(
        tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object LoggingLevelEnum {
    val ERROR = "ERROR"
    val INFO  = "INFO"
    val DEBUG = "DEBUG"

    val values = js.Object.freeze(js.Array(ERROR, INFO, DEBUG))
  }

  /**
    * The values of the AWS IoT Events logging options.
    */
  @js.native
  trait LoggingOptions extends js.Object {
    var enabled: LoggingEnabled
    var level: LoggingLevel
    var roleArn: AmazonResourceName
    var detectorDebugOptions: js.UndefOr[DetectorDebugOptions]
  }

  object LoggingOptions {
    def apply(
        enabled: LoggingEnabled,
        level: LoggingLevel,
        roleArn: AmazonResourceName,
        detectorDebugOptions: js.UndefOr[DetectorDebugOptions] = js.undefined
    ): LoggingOptions = {
      val __obj = js.Dictionary[js.Any](
        "enabled" -> enabled.asInstanceOf[js.Any],
        "level"   -> level.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      detectorDebugOptions.foreach(__v => __obj.update("detectorDebugOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingOptions]
    }
  }

  /**
    * When entering this state, perform these <code>actions</code> if the <code>condition</code> is TRUE.
    */
  @js.native
  trait OnEnterLifecycle extends js.Object {
    var events: js.UndefOr[Events]
  }

  object OnEnterLifecycle {
    def apply(
        events: js.UndefOr[Events] = js.undefined
    ): OnEnterLifecycle = {
      val __obj = js.Dictionary.empty[js.Any]
      events.foreach(__v => __obj.update("events", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnEnterLifecycle]
    }
  }

  /**
    * When exiting this state, perform these <code>"actions"</code> if the specified <code>"condition"</code> is TRUE.
    */
  @js.native
  trait OnExitLifecycle extends js.Object {
    var events: js.UndefOr[Events]
  }

  object OnExitLifecycle {
    def apply(
        events: js.UndefOr[Events] = js.undefined
    ): OnExitLifecycle = {
      val __obj = js.Dictionary.empty[js.Any]
      events.foreach(__v => __obj.update("events", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnExitLifecycle]
    }
  }

  /**
    * Specifies the actions performed when the <code>"condition"</code> evaluates to TRUE.
    */
  @js.native
  trait OnInputLifecycle extends js.Object {
    var events: js.UndefOr[Events]
    var transitionEvents: js.UndefOr[TransitionEvents]
  }

  object OnInputLifecycle {
    def apply(
        events: js.UndefOr[Events] = js.undefined,
        transitionEvents: js.UndefOr[TransitionEvents] = js.undefined
    ): OnInputLifecycle = {
      val __obj = js.Dictionary.empty[js.Any]
      events.foreach(__v => __obj.update("events", __v.asInstanceOf[js.Any]))
      transitionEvents.foreach(__v => __obj.update("transitionEvents", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnInputLifecycle]
    }
  }

  @js.native
  trait PutLoggingOptionsRequest extends js.Object {
    var loggingOptions: LoggingOptions
  }

  object PutLoggingOptionsRequest {
    def apply(
        loggingOptions: LoggingOptions
    ): PutLoggingOptionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "loggingOptions" -> loggingOptions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutLoggingOptionsRequest]
    }
  }

  /**
    * Information needed to reset the timer.
    */
  @js.native
  trait ResetTimerAction extends js.Object {
    var timerName: TimerName
  }

  object ResetTimerAction {
    def apply(
        timerName: TimerName
    ): ResetTimerAction = {
      val __obj = js.Dictionary[js.Any](
        "timerName" -> timerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResetTimerAction]
    }
  }

  /**
    * Information required to publish the Amazon SNS message.
    */
  @js.native
  trait SNSTopicPublishAction extends js.Object {
    var targetArn: AmazonResourceName
  }

  object SNSTopicPublishAction {
    def apply(
        targetArn: AmazonResourceName
    ): SNSTopicPublishAction = {
      val __obj = js.Dictionary[js.Any](
        "targetArn" -> targetArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SNSTopicPublishAction]
    }
  }

  /**
    * Information needed to set the timer.
    */
  @js.native
  trait SetTimerAction extends js.Object {
    var seconds: Seconds
    var timerName: TimerName
  }

  object SetTimerAction {
    def apply(
        seconds: Seconds,
        timerName: TimerName
    ): SetTimerAction = {
      val __obj = js.Dictionary[js.Any](
        "seconds"   -> seconds.asInstanceOf[js.Any],
        "timerName" -> timerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetTimerAction]
    }
  }

  /**
    * Information about the variable and its new value.
    */
  @js.native
  trait SetVariableAction extends js.Object {
    var value: VariableValue
    var variableName: VariableName
  }

  object SetVariableAction {
    def apply(
        value: VariableValue,
        variableName: VariableName
    ): SetVariableAction = {
      val __obj = js.Dictionary[js.Any](
        "value"        -> value.asInstanceOf[js.Any],
        "variableName" -> variableName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetVariableAction]
    }
  }

  /**
    * Sends information about the detector model instance and the event which triggered the action to an AWS SQS queue.
    */
  @js.native
  trait SqsAction extends js.Object {
    var queueUrl: QueueUrl
    var useBase64: js.UndefOr[UseBase64]
  }

  object SqsAction {
    def apply(
        queueUrl: QueueUrl,
        useBase64: js.UndefOr[UseBase64] = js.undefined
    ): SqsAction = {
      val __obj = js.Dictionary[js.Any](
        "queueUrl" -> queueUrl.asInstanceOf[js.Any]
      )

      useBase64.foreach(__v => __obj.update("useBase64", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqsAction]
    }
  }

  /**
    * Information that defines a state of a detector.
    */
  @js.native
  trait State extends js.Object {
    var stateName: StateName
    var onEnter: js.UndefOr[OnEnterLifecycle]
    var onExit: js.UndefOr[OnExitLifecycle]
    var onInput: js.UndefOr[OnInputLifecycle]
  }

  object State {
    def apply(
        stateName: StateName,
        onEnter: js.UndefOr[OnEnterLifecycle] = js.undefined,
        onExit: js.UndefOr[OnExitLifecycle] = js.undefined,
        onInput: js.UndefOr[OnInputLifecycle] = js.undefined
    ): State = {
      val __obj = js.Dictionary[js.Any](
        "stateName" -> stateName.asInstanceOf[js.Any]
      )

      onEnter.foreach(__v => __obj.update("onEnter", __v.asInstanceOf[js.Any]))
      onExit.foreach(__v => __obj.update("onExit", __v.asInstanceOf[js.Any]))
      onInput.foreach(__v => __obj.update("onInput", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[State]
    }
  }

  /**
    * Metadata that can be used to manage the resource.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "key"   -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tags: Tags
  }

  object TagResourceRequest {
    def apply(
        resourceArn: AmazonResourceName,
        tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Specifies the actions performed and the next state entered when a <code>"condition"</code> evaluates to TRUE.
    */
  @js.native
  trait TransitionEvent extends js.Object {
    var condition: Condition
    var eventName: EventName
    var nextState: StateName
    var actions: js.UndefOr[Actions]
  }

  object TransitionEvent {
    def apply(
        condition: Condition,
        eventName: EventName,
        nextState: StateName,
        actions: js.UndefOr[Actions] = js.undefined
    ): TransitionEvent = {
      val __obj = js.Dictionary[js.Any](
        "condition" -> condition.asInstanceOf[js.Any],
        "eventName" -> eventName.asInstanceOf[js.Any],
        "nextState" -> nextState.asInstanceOf[js.Any]
      )

      actions.foreach(__v => __obj.update("actions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransitionEvent]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    def apply(
        resourceArn: AmazonResourceName,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDetectorModelRequest extends js.Object {
    var detectorModelDefinition: DetectorModelDefinition
    var detectorModelName: DetectorModelName
    var roleArn: AmazonResourceName
    var detectorModelDescription: js.UndefOr[DetectorModelDescription]
  }

  object UpdateDetectorModelRequest {
    def apply(
        detectorModelDefinition: DetectorModelDefinition,
        detectorModelName: DetectorModelName,
        roleArn: AmazonResourceName,
        detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined
    ): UpdateDetectorModelRequest = {
      val __obj = js.Dictionary[js.Any](
        "detectorModelDefinition" -> detectorModelDefinition.asInstanceOf[js.Any],
        "detectorModelName"       -> detectorModelName.asInstanceOf[js.Any],
        "roleArn"                 -> roleArn.asInstanceOf[js.Any]
      )

      detectorModelDescription.foreach(__v => __obj.update("detectorModelDescription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDetectorModelRequest]
    }
  }

  @js.native
  trait UpdateDetectorModelResponse extends js.Object {
    var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration]
  }

  object UpdateDetectorModelResponse {
    def apply(
        detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.undefined
    ): UpdateDetectorModelResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      detectorModelConfiguration.foreach(__v => __obj.update("detectorModelConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDetectorModelResponse]
    }
  }

  @js.native
  trait UpdateInputRequest extends js.Object {
    var inputDefinition: InputDefinition
    var inputName: InputName
    var inputDescription: js.UndefOr[InputDescription]
  }

  object UpdateInputRequest {
    def apply(
        inputDefinition: InputDefinition,
        inputName: InputName,
        inputDescription: js.UndefOr[InputDescription] = js.undefined
    ): UpdateInputRequest = {
      val __obj = js.Dictionary[js.Any](
        "inputDefinition" -> inputDefinition.asInstanceOf[js.Any],
        "inputName"       -> inputName.asInstanceOf[js.Any]
      )

      inputDescription.foreach(__v => __obj.update("inputDescription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInputRequest]
    }
  }

  @js.native
  trait UpdateInputResponse extends js.Object {
    var inputConfiguration: js.UndefOr[InputConfiguration]
  }

  object UpdateInputResponse {
    def apply(
        inputConfiguration: js.UndefOr[InputConfiguration] = js.undefined
    ): UpdateInputResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      inputConfiguration.foreach(__v => __obj.update("inputConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInputResponse]
    }
  }
}
