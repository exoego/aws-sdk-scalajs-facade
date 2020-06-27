package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  type DetectorModelVersionSummaries = js.Array[DetectorModelVersionSummary]
  type EventName                     = String
  type Events                        = js.Array[Event]
  type FirehoseSeparator             = String
  type InputArn                      = String
  type InputDescription              = String
  type InputName                     = String
  type InputSummaries                = js.Array[InputSummary]
  type KeyValue                      = String
  type LoggingEnabled                = Boolean
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

    @inline def createDetectorModelFuture(params: CreateDetectorModelRequest): Future[CreateDetectorModelResponse] =
      service.createDetectorModel(params).promise().toFuture
    @inline def createInputFuture(params: CreateInputRequest): Future[CreateInputResponse] =
      service.createInput(params).promise().toFuture
    @inline def deleteDetectorModelFuture(params: DeleteDetectorModelRequest): Future[DeleteDetectorModelResponse] =
      service.deleteDetectorModel(params).promise().toFuture
    @inline def deleteInputFuture(params: DeleteInputRequest): Future[DeleteInputResponse] =
      service.deleteInput(params).promise().toFuture
    @inline def describeDetectorModelFuture(
        params: DescribeDetectorModelRequest
    ): Future[DescribeDetectorModelResponse] = service.describeDetectorModel(params).promise().toFuture
    @inline def describeInputFuture(params: DescribeInputRequest): Future[DescribeInputResponse] =
      service.describeInput(params).promise().toFuture
    @inline def describeLoggingOptionsFuture(
        params: DescribeLoggingOptionsRequest
    ): Future[DescribeLoggingOptionsResponse] = service.describeLoggingOptions(params).promise().toFuture
    @inline def listDetectorModelVersionsFuture(
        params: ListDetectorModelVersionsRequest
    ): Future[ListDetectorModelVersionsResponse] = service.listDetectorModelVersions(params).promise().toFuture
    @inline def listDetectorModelsFuture(params: ListDetectorModelsRequest): Future[ListDetectorModelsResponse] =
      service.listDetectorModels(params).promise().toFuture
    @inline def listInputsFuture(params: ListInputsRequest): Future[ListInputsResponse] =
      service.listInputs(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putLoggingOptionsFuture(params: PutLoggingOptionsRequest): Future[js.Object] =
      service.putLoggingOptions(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateDetectorModelFuture(params: UpdateDetectorModelRequest): Future[UpdateDetectorModelResponse] =
      service.updateDetectorModel(params).promise().toFuture
    @inline def updateInputFuture(params: UpdateInputRequest): Future[UpdateInputResponse] =
      service.updateInput(params).promise().toFuture
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
  @Factory
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

  /**
    * The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains a JSON payload, and those attributes (and their paired values) specified here are available for use in the <code>condition</code> expressions used by detectors.
    */
  @js.native
  @Factory
  trait Attribute extends js.Object {
    var jsonPath: AttributeJsonPath
  }

  /**
    * Information needed to clear the timer.
    */
  @js.native
  @Factory
  trait ClearTimerAction extends js.Object {
    var timerName: TimerName
  }

  @js.native
  @Factory
  trait CreateDetectorModelRequest extends js.Object {
    var detectorModelDefinition: DetectorModelDefinition
    var detectorModelName: DetectorModelName
    var roleArn: AmazonResourceName
    var detectorModelDescription: js.UndefOr[DetectorModelDescription]
    var evaluationMethod: js.UndefOr[EvaluationMethod]
    var key: js.UndefOr[AttributeJsonPath]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateDetectorModelResponse extends js.Object {
    var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration]
  }

  @js.native
  @Factory
  trait CreateInputRequest extends js.Object {
    var inputDefinition: InputDefinition
    var inputName: InputName
    var inputDescription: js.UndefOr[InputDescription]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateInputResponse extends js.Object {
    var inputConfiguration: js.UndefOr[InputConfiguration]
  }

  @js.native
  @Factory
  trait DeleteDetectorModelRequest extends js.Object {
    var detectorModelName: DetectorModelName
  }

  @js.native
  @Factory
  trait DeleteDetectorModelResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteInputRequest extends js.Object {
    var inputName: InputName
  }

  @js.native
  @Factory
  trait DeleteInputResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeDetectorModelRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var detectorModelVersion: js.UndefOr[DetectorModelVersion]
  }

  @js.native
  @Factory
  trait DescribeDetectorModelResponse extends js.Object {
    var detectorModel: js.UndefOr[DetectorModel]
  }

  @js.native
  @Factory
  trait DescribeInputRequest extends js.Object {
    var inputName: InputName
  }

  @js.native
  @Factory
  trait DescribeInputResponse extends js.Object {
    var input: js.UndefOr[Input]
  }

  @js.native
  @Factory
  trait DescribeLoggingOptionsRequest extends js.Object {}

  @js.native
  @Factory
  trait DescribeLoggingOptionsResponse extends js.Object {
    var loggingOptions: js.UndefOr[LoggingOptions]
  }

  /**
    * The detector model and the specific detectors (instances) for which the logging level is given.
    */
  @js.native
  @Factory
  trait DetectorDebugOption extends js.Object {
    var detectorModelName: DetectorModelName
    var keyValue: js.UndefOr[KeyValue]
  }

  /**
    * Information about the detector model.
    */
  @js.native
  @Factory
  trait DetectorModel extends js.Object {
    var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration]
    var detectorModelDefinition: js.UndefOr[DetectorModelDefinition]
  }

  /**
    * Information about how the detector model is configured.
    */
  @js.native
  @Factory
  trait DetectorModelConfiguration extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var detectorModelArn: js.UndefOr[DetectorModelArn]
    var detectorModelDescription: js.UndefOr[DetectorModelDescription]
    var detectorModelName: js.UndefOr[DetectorModelName]
    var detectorModelVersion: js.UndefOr[DetectorModelVersion]
    var evaluationMethod: js.UndefOr[EvaluationMethod]
    var key: js.UndefOr[AttributeJsonPath]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[AmazonResourceName]
    var status: js.UndefOr[DetectorModelVersionStatus]
  }

  /**
    * Information that defines how a detector operates.
    */
  @js.native
  @Factory
  trait DetectorModelDefinition extends js.Object {
    var initialStateName: StateName
    var states: States
  }

  /**
    * Information about the detector model.
    */
  @js.native
  @Factory
  trait DetectorModelSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var detectorModelDescription: js.UndefOr[DetectorModelDescription]
    var detectorModelName: js.UndefOr[DetectorModelName]
  }

  @js.native
  sealed trait DetectorModelVersionStatus extends js.Any
  object DetectorModelVersionStatus extends js.Object {
    val ACTIVE     = "ACTIVE".asInstanceOf[DetectorModelVersionStatus]
    val ACTIVATING = "ACTIVATING".asInstanceOf[DetectorModelVersionStatus]
    val INACTIVE   = "INACTIVE".asInstanceOf[DetectorModelVersionStatus]
    val DEPRECATED = "DEPRECATED".asInstanceOf[DetectorModelVersionStatus]
    val DRAFT      = "DRAFT".asInstanceOf[DetectorModelVersionStatus]
    val PAUSED     = "PAUSED".asInstanceOf[DetectorModelVersionStatus]
    val FAILED     = "FAILED".asInstanceOf[DetectorModelVersionStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT, PAUSED, FAILED))
  }

  /**
    * Information about the detector model version.
    */
  @js.native
  @Factory
  trait DetectorModelVersionSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var detectorModelArn: js.UndefOr[DetectorModelArn]
    var detectorModelName: js.UndefOr[DetectorModelName]
    var detectorModelVersion: js.UndefOr[DetectorModelVersion]
    var evaluationMethod: js.UndefOr[EvaluationMethod]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[AmazonResourceName]
    var status: js.UndefOr[DetectorModelVersionStatus]
  }

  @js.native
  sealed trait EvaluationMethod extends js.Any
  object EvaluationMethod extends js.Object {
    val BATCH  = "BATCH".asInstanceOf[EvaluationMethod]
    val SERIAL = "SERIAL".asInstanceOf[EvaluationMethod]

    val values = js.Object.freeze(js.Array(BATCH, SERIAL))
  }

  /**
    * Specifies the <code>"actions"</code> to be performed when the <code>"condition"</code> evaluates to TRUE.
    */
  @js.native
  @Factory
  trait Event extends js.Object {
    var eventName: EventName
    var actions: js.UndefOr[Actions]
    var condition: js.UndefOr[Condition]
  }

  /**
    * Sends information about the detector model instance and the event that triggered the action to a Kinesis Data Firehose delivery stream.
    */
  @js.native
  @Factory
  trait FirehoseAction extends js.Object {
    var deliveryStreamName: DeliveryStreamName
    var separator: js.UndefOr[FirehoseSeparator]
  }

  /**
    * Information about the input.
    */
  @js.native
  @Factory
  trait Input extends js.Object {
    var inputConfiguration: js.UndefOr[InputConfiguration]
    var inputDefinition: js.UndefOr[InputDefinition]
  }

  /**
    * Information about the configuration of an input.
    */
  @js.native
  @Factory
  trait InputConfiguration extends js.Object {
    var creationTime: Timestamp
    var inputArn: InputArn
    var inputName: InputName
    var lastUpdateTime: Timestamp
    var status: InputStatus
    var inputDescription: js.UndefOr[InputDescription]
  }

  /**
    * The definition of the input.
    */
  @js.native
  @Factory
  trait InputDefinition extends js.Object {
    var attributes: Attributes
  }

  @js.native
  sealed trait InputStatus extends js.Any
  object InputStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[InputStatus]
    val UPDATING = "UPDATING".asInstanceOf[InputStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[InputStatus]
    val DELETING = "DELETING".asInstanceOf[InputStatus]

    val values = js.Object.freeze(js.Array(CREATING, UPDATING, ACTIVE, DELETING))
  }

  /**
    * Information about the input.
    */
  @js.native
  @Factory
  trait InputSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var inputArn: js.UndefOr[InputArn]
    var inputDescription: js.UndefOr[InputDescription]
    var inputName: js.UndefOr[InputName]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[InputStatus]
  }

  /**
    * Sends an AWS IoT Events input, passing in information about the detector model instance and the event that triggered the action.
    */
  @js.native
  @Factory
  trait IotEventsAction extends js.Object {
    var inputName: InputName
  }

  /**
    * Information required to publish the MQTT message via the AWS IoT message broker.
    */
  @js.native
  @Factory
  trait IotTopicPublishAction extends js.Object {
    var mqttTopic: MQTTTopic
  }

  /**
    * Calls a Lambda function, passing in information about the detector model instance and the event that triggered the action.
    */
  @js.native
  @Factory
  trait LambdaAction extends js.Object {
    var functionArn: AmazonResourceName
  }

  @js.native
  @Factory
  trait ListDetectorModelVersionsRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDetectorModelVersionsResponse extends js.Object {
    var detectorModelVersionSummaries: js.UndefOr[DetectorModelVersionSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDetectorModelsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDetectorModelsResponse extends js.Object {
    var detectorModelSummaries: js.UndefOr[DetectorModelSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListInputsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListInputsResponse extends js.Object {
    var inputSummaries: js.UndefOr[InputSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  @js.native
  sealed trait LoggingLevel extends js.Any
  object LoggingLevel extends js.Object {
    val ERROR = "ERROR".asInstanceOf[LoggingLevel]
    val INFO  = "INFO".asInstanceOf[LoggingLevel]
    val DEBUG = "DEBUG".asInstanceOf[LoggingLevel]

    val values = js.Object.freeze(js.Array(ERROR, INFO, DEBUG))
  }

  /**
    * The values of the AWS IoT Events logging options.
    */
  @js.native
  @Factory
  trait LoggingOptions extends js.Object {
    var enabled: LoggingEnabled
    var level: LoggingLevel
    var roleArn: AmazonResourceName
    var detectorDebugOptions: js.UndefOr[DetectorDebugOptions]
  }

  /**
    * When entering this state, perform these <code>actions</code> if the <code>condition</code> is TRUE.
    */
  @js.native
  @Factory
  trait OnEnterLifecycle extends js.Object {
    var events: js.UndefOr[Events]
  }

  /**
    * When exiting this state, perform these <code>"actions"</code> if the specified <code>"condition"</code> is TRUE.
    */
  @js.native
  @Factory
  trait OnExitLifecycle extends js.Object {
    var events: js.UndefOr[Events]
  }

  /**
    * Specifies the actions performed when the <code>"condition"</code> evaluates to TRUE.
    */
  @js.native
  @Factory
  trait OnInputLifecycle extends js.Object {
    var events: js.UndefOr[Events]
    var transitionEvents: js.UndefOr[TransitionEvents]
  }

  @js.native
  @Factory
  trait PutLoggingOptionsRequest extends js.Object {
    var loggingOptions: LoggingOptions
  }

  /**
    * Information needed to reset the timer.
    */
  @js.native
  @Factory
  trait ResetTimerAction extends js.Object {
    var timerName: TimerName
  }

  /**
    * Information required to publish the Amazon SNS message.
    */
  @js.native
  @Factory
  trait SNSTopicPublishAction extends js.Object {
    var targetArn: AmazonResourceName
  }

  /**
    * Information needed to set the timer.
    */
  @js.native
  @Factory
  trait SetTimerAction extends js.Object {
    var seconds: Seconds
    var timerName: TimerName
  }

  /**
    * Information about the variable and its new value.
    */
  @js.native
  @Factory
  trait SetVariableAction extends js.Object {
    var value: VariableValue
    var variableName: VariableName
  }

  /**
    * Sends information about the detector model instance and the event that triggered the action to an Amazon SQS queue.
    */
  @js.native
  @Factory
  trait SqsAction extends js.Object {
    var queueUrl: QueueUrl
    var useBase64: js.UndefOr[UseBase64]
  }

  /**
    * Information that defines a state of a detector.
    */
  @js.native
  @Factory
  trait State extends js.Object {
    var stateName: StateName
    var onEnter: js.UndefOr[OnEnterLifecycle]
    var onExit: js.UndefOr[OnExitLifecycle]
    var onInput: js.UndefOr[OnInputLifecycle]
  }

  /**
    * Metadata that can be used to manage the resource.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tags: Tags
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Specifies the actions performed and the next state entered when a <code>"condition"</code> evaluates to TRUE.
    */
  @js.native
  @Factory
  trait TransitionEvent extends js.Object {
    var condition: Condition
    var eventName: EventName
    var nextState: StateName
    var actions: js.UndefOr[Actions]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tagKeys: TagKeys
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateDetectorModelRequest extends js.Object {
    var detectorModelDefinition: DetectorModelDefinition
    var detectorModelName: DetectorModelName
    var roleArn: AmazonResourceName
    var detectorModelDescription: js.UndefOr[DetectorModelDescription]
    var evaluationMethod: js.UndefOr[EvaluationMethod]
  }

  @js.native
  @Factory
  trait UpdateDetectorModelResponse extends js.Object {
    var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration]
  }

  @js.native
  @Factory
  trait UpdateInputRequest extends js.Object {
    var inputDefinition: InputDefinition
    var inputName: InputName
    var inputDescription: js.UndefOr[InputDescription]
  }

  @js.native
  @Factory
  trait UpdateInputResponse extends js.Object {
    var inputConfiguration: js.UndefOr[InputConfiguration]
  }
}
