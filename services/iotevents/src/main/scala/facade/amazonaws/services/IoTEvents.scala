package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object iotevents {
  type Actions = js.Array[Action]
  type AmazonResourceName = String
  type AssetId = String
  type AssetPropertyAlias = String
  type AssetPropertyBooleanValue = String
  type AssetPropertyDoubleValue = String
  type AssetPropertyEntryId = String
  type AssetPropertyId = String
  type AssetPropertyIntegerValue = String
  type AssetPropertyOffsetInNanos = String
  type AssetPropertyQuality = String
  type AssetPropertyStringValue = String
  type AssetPropertyTimeInSeconds = String
  type AttributeJsonPath = String
  type Attributes = js.Array[Attribute]
  type Condition = String
  type ContentExpression = String
  type DeliveryStreamName = String
  type DetectorDebugOptions = js.Array[DetectorDebugOption]
  type DetectorModelArn = String
  type DetectorModelDescription = String
  type DetectorModelName = String
  type DetectorModelSummaries = js.Array[DetectorModelSummary]
  type DetectorModelVersion = String
  type DetectorModelVersionSummaries = js.Array[DetectorModelVersionSummary]
  type DynamoKeyField = String
  type DynamoKeyType = String
  type DynamoKeyValue = String
  type DynamoOperation = String
  type DynamoTableName = String
  type EventName = String
  type Events = js.Array[Event]
  type FirehoseSeparator = String
  type InputArn = String
  type InputDescription = String
  type InputName = String
  type InputSummaries = js.Array[InputSummary]
  type KeyValue = String
  type LoggingEnabled = Boolean
  type MQTTTopic = String
  type MaxResults = Int
  type NextToken = String
  type QueueUrl = String
  type Seconds = Int
  type StateName = String
  type States = js.Array[State]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TimerName = String
  type Timestamp = js.Date
  type TransitionEvents = js.Array[TransitionEvent]
  type UseBase64 = Boolean
  type VariableName = String
  type VariableValue = String

  implicit final class IoTEventsOps(private val service: IoTEvents) extends AnyVal {

    @inline def createDetectorModelFuture(params: CreateDetectorModelRequest): Future[CreateDetectorModelResponse] = service.createDetectorModel(params).promise().toFuture
    @inline def createInputFuture(params: CreateInputRequest): Future[CreateInputResponse] = service.createInput(params).promise().toFuture
    @inline def deleteDetectorModelFuture(params: DeleteDetectorModelRequest): Future[DeleteDetectorModelResponse] = service.deleteDetectorModel(params).promise().toFuture
    @inline def deleteInputFuture(params: DeleteInputRequest): Future[DeleteInputResponse] = service.deleteInput(params).promise().toFuture
    @inline def describeDetectorModelFuture(params: DescribeDetectorModelRequest): Future[DescribeDetectorModelResponse] = service.describeDetectorModel(params).promise().toFuture
    @inline def describeInputFuture(params: DescribeInputRequest): Future[DescribeInputResponse] = service.describeInput(params).promise().toFuture
    @inline def describeLoggingOptionsFuture(params: DescribeLoggingOptionsRequest): Future[DescribeLoggingOptionsResponse] = service.describeLoggingOptions(params).promise().toFuture
    @inline def listDetectorModelVersionsFuture(params: ListDetectorModelVersionsRequest): Future[ListDetectorModelVersionsResponse] = service.listDetectorModelVersions(params).promise().toFuture
    @inline def listDetectorModelsFuture(params: ListDetectorModelsRequest): Future[ListDetectorModelsResponse] = service.listDetectorModels(params).promise().toFuture
    @inline def listInputsFuture(params: ListInputsRequest): Future[ListInputsResponse] = service.listInputs(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putLoggingOptionsFuture(params: PutLoggingOptionsRequest): Future[js.Object] = service.putLoggingOptions(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDetectorModelFuture(params: UpdateDetectorModelRequest): Future[UpdateDetectorModelResponse] = service.updateDetectorModel(params).promise().toFuture
    @inline def updateInputFuture(params: UpdateInputRequest): Future[UpdateInputResponse] = service.updateInput(params).promise().toFuture

  }
}

package iotevents {
  @js.native
  @JSImport("aws-sdk", "IoTEvents", "AWS.IoTEvents")
  class IoTEvents() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDetectorModel(params: CreateDetectorModelRequest): Request[CreateDetectorModelResponse] = js.native
    def createInput(params: CreateInputRequest): Request[CreateInputResponse] = js.native
    def deleteDetectorModel(params: DeleteDetectorModelRequest): Request[DeleteDetectorModelResponse] = js.native
    def deleteInput(params: DeleteInputRequest): Request[DeleteInputResponse] = js.native
    def describeDetectorModel(params: DescribeDetectorModelRequest): Request[DescribeDetectorModelResponse] = js.native
    def describeInput(params: DescribeInputRequest): Request[DescribeInputResponse] = js.native
    def describeLoggingOptions(params: DescribeLoggingOptionsRequest): Request[DescribeLoggingOptionsResponse] = js.native
    def listDetectorModelVersions(params: ListDetectorModelVersionsRequest): Request[ListDetectorModelVersionsResponse] = js.native
    def listDetectorModels(params: ListDetectorModelsRequest): Request[ListDetectorModelsResponse] = js.native
    def listInputs(params: ListInputsRequest): Request[ListInputsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putLoggingOptions(params: PutLoggingOptionsRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDetectorModel(params: UpdateDetectorModelRequest): Request[UpdateDetectorModelResponse] = js.native
    def updateInput(params: UpdateInputRequest): Request[UpdateInputResponse] = js.native
  }

  /**
    * An action to be performed when the <code>condition</code> is TRUE.
    */
  @js.native
  trait Action extends js.Object {
    var clearTimer: js.UndefOr[ClearTimerAction]
    var dynamoDB: js.UndefOr[DynamoDBAction]
    var dynamoDBv2: js.UndefOr[DynamoDBv2Action]
    var firehose: js.UndefOr[FirehoseAction]
    var iotEvents: js.UndefOr[IotEventsAction]
    var iotSiteWise: js.UndefOr[IotSiteWiseAction]
    var iotTopicPublish: js.UndefOr[IotTopicPublishAction]
    var lambda: js.UndefOr[LambdaAction]
    var resetTimer: js.UndefOr[ResetTimerAction]
    var setTimer: js.UndefOr[SetTimerAction]
    var setVariable: js.UndefOr[SetVariableAction]
    var sns: js.UndefOr[SNSTopicPublishAction]
    var sqs: js.UndefOr[SqsAction]
  }

  object Action {
    @inline
    def apply(
        clearTimer: js.UndefOr[ClearTimerAction] = js.undefined,
        dynamoDB: js.UndefOr[DynamoDBAction] = js.undefined,
        dynamoDBv2: js.UndefOr[DynamoDBv2Action] = js.undefined,
        firehose: js.UndefOr[FirehoseAction] = js.undefined,
        iotEvents: js.UndefOr[IotEventsAction] = js.undefined,
        iotSiteWise: js.UndefOr[IotSiteWiseAction] = js.undefined,
        iotTopicPublish: js.UndefOr[IotTopicPublishAction] = js.undefined,
        lambda: js.UndefOr[LambdaAction] = js.undefined,
        resetTimer: js.UndefOr[ResetTimerAction] = js.undefined,
        setTimer: js.UndefOr[SetTimerAction] = js.undefined,
        setVariable: js.UndefOr[SetVariableAction] = js.undefined,
        sns: js.UndefOr[SNSTopicPublishAction] = js.undefined,
        sqs: js.UndefOr[SqsAction] = js.undefined
    ): Action = {
      val __obj = js.Dynamic.literal()
      clearTimer.foreach(__v => __obj.updateDynamic("clearTimer")(__v.asInstanceOf[js.Any]))
      dynamoDB.foreach(__v => __obj.updateDynamic("dynamoDB")(__v.asInstanceOf[js.Any]))
      dynamoDBv2.foreach(__v => __obj.updateDynamic("dynamoDBv2")(__v.asInstanceOf[js.Any]))
      firehose.foreach(__v => __obj.updateDynamic("firehose")(__v.asInstanceOf[js.Any]))
      iotEvents.foreach(__v => __obj.updateDynamic("iotEvents")(__v.asInstanceOf[js.Any]))
      iotSiteWise.foreach(__v => __obj.updateDynamic("iotSiteWise")(__v.asInstanceOf[js.Any]))
      iotTopicPublish.foreach(__v => __obj.updateDynamic("iotTopicPublish")(__v.asInstanceOf[js.Any]))
      lambda.foreach(__v => __obj.updateDynamic("lambda")(__v.asInstanceOf[js.Any]))
      resetTimer.foreach(__v => __obj.updateDynamic("resetTimer")(__v.asInstanceOf[js.Any]))
      setTimer.foreach(__v => __obj.updateDynamic("setTimer")(__v.asInstanceOf[js.Any]))
      setVariable.foreach(__v => __obj.updateDynamic("setVariable")(__v.asInstanceOf[js.Any]))
      sns.foreach(__v => __obj.updateDynamic("sns")(__v.asInstanceOf[js.Any]))
      sqs.foreach(__v => __obj.updateDynamic("sqs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  /**
    * A structure that contains timestamp information. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_TimeInNanos.html|TimeInNanos]] in the <i>AWS IoT SiteWise API Reference</i>.
    *  For parameters that are string data type, you can specify the following options:
    * * Use a string. For example, the <code>timeInSeconds</code> value can be <code>'1586400675'</code>.
    *  * Use an expression. For example, the <code>timeInSeconds</code> value can be <code>'{input.TemperatureInput.sensorData.timestamp/1000}'</code>.
    *  For more information, see [[https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html|Expressions]] in the <i>AWS IoT Events Developer Guide</i>.
    */
  @js.native
  trait AssetPropertyTimestamp extends js.Object {
    var timeInSeconds: AssetPropertyTimeInSeconds
    var offsetInNanos: js.UndefOr[AssetPropertyOffsetInNanos]
  }

  object AssetPropertyTimestamp {
    @inline
    def apply(
        timeInSeconds: AssetPropertyTimeInSeconds,
        offsetInNanos: js.UndefOr[AssetPropertyOffsetInNanos] = js.undefined
    ): AssetPropertyTimestamp = {
      val __obj = js.Dynamic.literal(
        "timeInSeconds" -> timeInSeconds.asInstanceOf[js.Any]
      )

      offsetInNanos.foreach(__v => __obj.updateDynamic("offsetInNanos")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetPropertyTimestamp]
    }
  }

  /**
    * A structure that contains value information. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetPropertyValue.html|AssetPropertyValue]] in the <i>AWS IoT SiteWise API Reference</i>.
    *  For parameters that are string data type, you can specify the following options:
    * * Use a string. For example, the <code>quality</code> value can be <code>'GOOD'</code>.
    *  * Use an expression. For example, the <code>quality</code> value can be <code>input.TemperatureInput.sensorData.quality</code> .
    *  For more information, see [[https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html|Expressions]] in the <i>AWS IoT Events Developer Guide</i>.
    */
  @js.native
  trait AssetPropertyValue extends js.Object {
    var value: AssetPropertyVariant
    var quality: js.UndefOr[AssetPropertyQuality]
    var timestamp: js.UndefOr[AssetPropertyTimestamp]
  }

  object AssetPropertyValue {
    @inline
    def apply(
        value: AssetPropertyVariant,
        quality: js.UndefOr[AssetPropertyQuality] = js.undefined,
        timestamp: js.UndefOr[AssetPropertyTimestamp] = js.undefined
    ): AssetPropertyValue = {
      val __obj = js.Dynamic.literal(
        "value" -> value.asInstanceOf[js.Any]
      )

      quality.foreach(__v => __obj.updateDynamic("quality")(__v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.updateDynamic("timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetPropertyValue]
    }
  }

  /**
    * A structure that contains an asset property value. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_Variant.html|Variant]] in the <i>AWS IoT SiteWise API Reference</i>.
    *  <important> You must specify one of the following value types, depending on the <code>dataType</code> of the specified asset property. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetProperty.html|AssetProperty]] in the <i>AWS IoT SiteWise API Reference</i>.
    *  </important> For parameters that are string data type, you can specify the following options:
    * * Use a string. For example, the <code>doubleValue</code> value can be <code>'47.9'</code>.
    *  * Use an expression. For example, the <code>doubleValue</code> value can be <code>input.TemperatureInput.sensorData.temperature</code>.
    *  For more information, see [[https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html|Expressions]] in the <i>AWS IoT Events Developer Guide</i>.
    */
  @js.native
  trait AssetPropertyVariant extends js.Object {
    var booleanValue: js.UndefOr[AssetPropertyBooleanValue]
    var doubleValue: js.UndefOr[AssetPropertyDoubleValue]
    var integerValue: js.UndefOr[AssetPropertyIntegerValue]
    var stringValue: js.UndefOr[AssetPropertyStringValue]
  }

  object AssetPropertyVariant {
    @inline
    def apply(
        booleanValue: js.UndefOr[AssetPropertyBooleanValue] = js.undefined,
        doubleValue: js.UndefOr[AssetPropertyDoubleValue] = js.undefined,
        integerValue: js.UndefOr[AssetPropertyIntegerValue] = js.undefined,
        stringValue: js.UndefOr[AssetPropertyStringValue] = js.undefined
    ): AssetPropertyVariant = {
      val __obj = js.Dynamic.literal()
      booleanValue.foreach(__v => __obj.updateDynamic("booleanValue")(__v.asInstanceOf[js.Any]))
      doubleValue.foreach(__v => __obj.updateDynamic("doubleValue")(__v.asInstanceOf[js.Any]))
      integerValue.foreach(__v => __obj.updateDynamic("integerValue")(__v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.updateDynamic("stringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetPropertyVariant]
    }
  }

  /**
    * The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains a JSON payload. Those attributes (and their paired values) specified here are available for use in the <code>condition</code> expressions used by detectors.
    */
  @js.native
  trait Attribute extends js.Object {
    var jsonPath: AttributeJsonPath
  }

  object Attribute {
    @inline
    def apply(
        jsonPath: AttributeJsonPath
    ): Attribute = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        timerName: TimerName
    ): ClearTimerAction = {
      val __obj = js.Dynamic.literal(
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
    var evaluationMethod: js.UndefOr[EvaluationMethod]
    var key: js.UndefOr[AttributeJsonPath]
    var tags: js.UndefOr[Tags]
  }

  object CreateDetectorModelRequest {
    @inline
    def apply(
        detectorModelDefinition: DetectorModelDefinition,
        detectorModelName: DetectorModelName,
        roleArn: AmazonResourceName,
        detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined,
        evaluationMethod: js.UndefOr[EvaluationMethod] = js.undefined,
        key: js.UndefOr[AttributeJsonPath] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateDetectorModelRequest = {
      val __obj = js.Dynamic.literal(
        "detectorModelDefinition" -> detectorModelDefinition.asInstanceOf[js.Any],
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      detectorModelDescription.foreach(__v => __obj.updateDynamic("detectorModelDescription")(__v.asInstanceOf[js.Any]))
      evaluationMethod.foreach(__v => __obj.updateDynamic("evaluationMethod")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDetectorModelRequest]
    }
  }

  @js.native
  trait CreateDetectorModelResponse extends js.Object {
    var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration]
  }

  object CreateDetectorModelResponse {
    @inline
    def apply(
        detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.undefined
    ): CreateDetectorModelResponse = {
      val __obj = js.Dynamic.literal()
      detectorModelConfiguration.foreach(__v => __obj.updateDynamic("detectorModelConfiguration")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        inputDefinition: InputDefinition,
        inputName: InputName,
        inputDescription: js.UndefOr[InputDescription] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateInputRequest = {
      val __obj = js.Dynamic.literal(
        "inputDefinition" -> inputDefinition.asInstanceOf[js.Any],
        "inputName" -> inputName.asInstanceOf[js.Any]
      )

      inputDescription.foreach(__v => __obj.updateDynamic("inputDescription")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInputRequest]
    }
  }

  @js.native
  trait CreateInputResponse extends js.Object {
    var inputConfiguration: js.UndefOr[InputConfiguration]
  }

  object CreateInputResponse {
    @inline
    def apply(
        inputConfiguration: js.UndefOr[InputConfiguration] = js.undefined
    ): CreateInputResponse = {
      val __obj = js.Dynamic.literal()
      inputConfiguration.foreach(__v => __obj.updateDynamic("inputConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInputResponse]
    }
  }

  @js.native
  trait DeleteDetectorModelRequest extends js.Object {
    var detectorModelName: DetectorModelName
  }

  object DeleteDetectorModelRequest {
    @inline
    def apply(
        detectorModelName: DetectorModelName
    ): DeleteDetectorModelRequest = {
      val __obj = js.Dynamic.literal(
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDetectorModelRequest]
    }
  }

  @js.native
  trait DeleteDetectorModelResponse extends js.Object {}

  object DeleteDetectorModelResponse {
    @inline
    def apply(
    ): DeleteDetectorModelResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteDetectorModelResponse]
    }
  }

  @js.native
  trait DeleteInputRequest extends js.Object {
    var inputName: InputName
  }

  object DeleteInputRequest {
    @inline
    def apply(
        inputName: InputName
    ): DeleteInputRequest = {
      val __obj = js.Dynamic.literal(
        "inputName" -> inputName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInputRequest]
    }
  }

  @js.native
  trait DeleteInputResponse extends js.Object {}

  object DeleteInputResponse {
    @inline
    def apply(
    ): DeleteInputResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteInputResponse]
    }
  }

  @js.native
  trait DescribeDetectorModelRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var detectorModelVersion: js.UndefOr[DetectorModelVersion]
  }

  object DescribeDetectorModelRequest {
    @inline
    def apply(
        detectorModelName: DetectorModelName,
        detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined
    ): DescribeDetectorModelRequest = {
      val __obj = js.Dynamic.literal(
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any]
      )

      detectorModelVersion.foreach(__v => __obj.updateDynamic("detectorModelVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectorModelRequest]
    }
  }

  @js.native
  trait DescribeDetectorModelResponse extends js.Object {
    var detectorModel: js.UndefOr[DetectorModel]
  }

  object DescribeDetectorModelResponse {
    @inline
    def apply(
        detectorModel: js.UndefOr[DetectorModel] = js.undefined
    ): DescribeDetectorModelResponse = {
      val __obj = js.Dynamic.literal()
      detectorModel.foreach(__v => __obj.updateDynamic("detectorModel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectorModelResponse]
    }
  }

  @js.native
  trait DescribeInputRequest extends js.Object {
    var inputName: InputName
  }

  object DescribeInputRequest {
    @inline
    def apply(
        inputName: InputName
    ): DescribeInputRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        input: js.UndefOr[Input] = js.undefined
    ): DescribeInputResponse = {
      val __obj = js.Dynamic.literal()
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInputResponse]
    }
  }

  @js.native
  trait DescribeLoggingOptionsRequest extends js.Object {}

  object DescribeLoggingOptionsRequest {
    @inline
    def apply(
    ): DescribeLoggingOptionsRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DescribeLoggingOptionsRequest]
    }
  }

  @js.native
  trait DescribeLoggingOptionsResponse extends js.Object {
    var loggingOptions: js.UndefOr[LoggingOptions]
  }

  object DescribeLoggingOptionsResponse {
    @inline
    def apply(
        loggingOptions: js.UndefOr[LoggingOptions] = js.undefined
    ): DescribeLoggingOptionsResponse = {
      val __obj = js.Dynamic.literal()
      loggingOptions.foreach(__v => __obj.updateDynamic("loggingOptions")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        detectorModelName: DetectorModelName,
        keyValue: js.UndefOr[KeyValue] = js.undefined
    ): DetectorDebugOption = {
      val __obj = js.Dynamic.literal(
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.undefined,
        detectorModelDefinition: js.UndefOr[DetectorModelDefinition] = js.undefined
    ): DetectorModel = {
      val __obj = js.Dynamic.literal()
      detectorModelConfiguration.foreach(__v => __obj.updateDynamic("detectorModelConfiguration")(__v.asInstanceOf[js.Any]))
      detectorModelDefinition.foreach(__v => __obj.updateDynamic("detectorModelDefinition")(__v.asInstanceOf[js.Any]))
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
    var evaluationMethod: js.UndefOr[EvaluationMethod]
    var key: js.UndefOr[AttributeJsonPath]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[AmazonResourceName]
    var status: js.UndefOr[DetectorModelVersionStatus]
  }

  object DetectorModelConfiguration {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        detectorModelArn: js.UndefOr[DetectorModelArn] = js.undefined,
        detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined,
        detectorModelName: js.UndefOr[DetectorModelName] = js.undefined,
        detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined,
        evaluationMethod: js.UndefOr[EvaluationMethod] = js.undefined,
        key: js.UndefOr[AttributeJsonPath] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        roleArn: js.UndefOr[AmazonResourceName] = js.undefined,
        status: js.UndefOr[DetectorModelVersionStatus] = js.undefined
    ): DetectorModelConfiguration = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      detectorModelArn.foreach(__v => __obj.updateDynamic("detectorModelArn")(__v.asInstanceOf[js.Any]))
      detectorModelDescription.foreach(__v => __obj.updateDynamic("detectorModelDescription")(__v.asInstanceOf[js.Any]))
      detectorModelName.foreach(__v => __obj.updateDynamic("detectorModelName")(__v.asInstanceOf[js.Any]))
      detectorModelVersion.foreach(__v => __obj.updateDynamic("detectorModelVersion")(__v.asInstanceOf[js.Any]))
      evaluationMethod.foreach(__v => __obj.updateDynamic("evaluationMethod")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        initialStateName: StateName,
        states: States
    ): DetectorModelDefinition = {
      val __obj = js.Dynamic.literal(
        "initialStateName" -> initialStateName.asInstanceOf[js.Any],
        "states" -> states.asInstanceOf[js.Any]
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
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined,
        detectorModelName: js.UndefOr[DetectorModelName] = js.undefined
    ): DetectorModelSummary = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      detectorModelDescription.foreach(__v => __obj.updateDynamic("detectorModelDescription")(__v.asInstanceOf[js.Any]))
      detectorModelName.foreach(__v => __obj.updateDynamic("detectorModelName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectorModelSummary]
    }
  }

  @js.native
  sealed trait DetectorModelVersionStatus extends js.Any
  object DetectorModelVersionStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[DetectorModelVersionStatus]
    val ACTIVATING = "ACTIVATING".asInstanceOf[DetectorModelVersionStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[DetectorModelVersionStatus]
    val DEPRECATED = "DEPRECATED".asInstanceOf[DetectorModelVersionStatus]
    val DRAFT = "DRAFT".asInstanceOf[DetectorModelVersionStatus]
    val PAUSED = "PAUSED".asInstanceOf[DetectorModelVersionStatus]
    val FAILED = "FAILED".asInstanceOf[DetectorModelVersionStatus]

    @inline def values = js.Array(ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT, PAUSED, FAILED)
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
    var evaluationMethod: js.UndefOr[EvaluationMethod]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[AmazonResourceName]
    var status: js.UndefOr[DetectorModelVersionStatus]
  }

  object DetectorModelVersionSummary {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        detectorModelArn: js.UndefOr[DetectorModelArn] = js.undefined,
        detectorModelName: js.UndefOr[DetectorModelName] = js.undefined,
        detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined,
        evaluationMethod: js.UndefOr[EvaluationMethod] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        roleArn: js.UndefOr[AmazonResourceName] = js.undefined,
        status: js.UndefOr[DetectorModelVersionStatus] = js.undefined
    ): DetectorModelVersionSummary = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      detectorModelArn.foreach(__v => __obj.updateDynamic("detectorModelArn")(__v.asInstanceOf[js.Any]))
      detectorModelName.foreach(__v => __obj.updateDynamic("detectorModelName")(__v.asInstanceOf[js.Any]))
      detectorModelVersion.foreach(__v => __obj.updateDynamic("detectorModelVersion")(__v.asInstanceOf[js.Any]))
      evaluationMethod.foreach(__v => __obj.updateDynamic("evaluationMethod")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectorModelVersionSummary]
    }
  }

  /**
    * Defines an action to write to the Amazon DynamoDB table that you created. The standard action payload contains all attribute-value pairs that have the information about the detector model instance and the event that triggered the action. You can also customize the [[https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html|payload]]. One column of the DynamoDB table receives all attribute-value pairs in the payload that you specify.
    *  The <code>tableName</code> and <code>hashKeyField</code> values must match the table name and the partition key of the DynamoDB table.
    *
    * '''Note:'''If the DynamoDB table also has a sort key, you must specify <code>rangeKeyField</code>. The <code>rangeKeyField</code> value must match the sort key.
    * <p/> The <code>hashKeyValue</code> and <code>rangeKeyValue</code> use substitution templates. These templates provide data at runtime. The syntax is <code>{sql-expression}</code>.
    *  You can use expressions for parameters that are string data type. For more information, see [[https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html|Expressions]] in the <i>AWS IoT Events Developer Guide</i>.
    *
    * '''Note:'''If the defined payload type is a string, <code>DynamoDBAction</code> writes non-JSON data to the DynamoDB table as binary data. The DynamoDB console displays the data as Base64-encoded text. The <code>payloadField</code> is <code>&lt;payload-field&gt;_raw</code>.
    */
  @js.native
  trait DynamoDBAction extends js.Object {
    var hashKeyField: DynamoKeyField
    var hashKeyValue: DynamoKeyValue
    var tableName: DynamoTableName
    var hashKeyType: js.UndefOr[DynamoKeyType]
    var operation: js.UndefOr[DynamoOperation]
    var payload: js.UndefOr[Payload]
    var payloadField: js.UndefOr[DynamoKeyField]
    var rangeKeyField: js.UndefOr[DynamoKeyField]
    var rangeKeyType: js.UndefOr[DynamoKeyType]
    var rangeKeyValue: js.UndefOr[DynamoKeyValue]
  }

  object DynamoDBAction {
    @inline
    def apply(
        hashKeyField: DynamoKeyField,
        hashKeyValue: DynamoKeyValue,
        tableName: DynamoTableName,
        hashKeyType: js.UndefOr[DynamoKeyType] = js.undefined,
        operation: js.UndefOr[DynamoOperation] = js.undefined,
        payload: js.UndefOr[Payload] = js.undefined,
        payloadField: js.UndefOr[DynamoKeyField] = js.undefined,
        rangeKeyField: js.UndefOr[DynamoKeyField] = js.undefined,
        rangeKeyType: js.UndefOr[DynamoKeyType] = js.undefined,
        rangeKeyValue: js.UndefOr[DynamoKeyValue] = js.undefined
    ): DynamoDBAction = {
      val __obj = js.Dynamic.literal(
        "hashKeyField" -> hashKeyField.asInstanceOf[js.Any],
        "hashKeyValue" -> hashKeyValue.asInstanceOf[js.Any],
        "tableName" -> tableName.asInstanceOf[js.Any]
      )

      hashKeyType.foreach(__v => __obj.updateDynamic("hashKeyType")(__v.asInstanceOf[js.Any]))
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      payloadField.foreach(__v => __obj.updateDynamic("payloadField")(__v.asInstanceOf[js.Any]))
      rangeKeyField.foreach(__v => __obj.updateDynamic("rangeKeyField")(__v.asInstanceOf[js.Any]))
      rangeKeyType.foreach(__v => __obj.updateDynamic("rangeKeyType")(__v.asInstanceOf[js.Any]))
      rangeKeyValue.foreach(__v => __obj.updateDynamic("rangeKeyValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DynamoDBAction]
    }
  }

  /**
    * Defines an action to write to the Amazon DynamoDB table that you created. The default action payload contains all attribute-value pairs that have the information about the detector model instance and the event that triggered the action. You can also customize the [[https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html|payload]]. A separate column of the DynamoDB table receives one attribute-value pair in the payload that you specify.
    *  <important> The <code>type</code> value for <code>Payload</code> must be <code>JSON</code>.
    *  </important> You can use expressions for parameters that are strings. For more information, see [[https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html|Expressions]] in the <i>AWS IoT Events Developer Guide</i>.
    */
  @js.native
  trait DynamoDBv2Action extends js.Object {
    var tableName: DynamoTableName
    var payload: js.UndefOr[Payload]
  }

  object DynamoDBv2Action {
    @inline
    def apply(
        tableName: DynamoTableName,
        payload: js.UndefOr[Payload] = js.undefined
    ): DynamoDBv2Action = {
      val __obj = js.Dynamic.literal(
        "tableName" -> tableName.asInstanceOf[js.Any]
      )

      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DynamoDBv2Action]
    }
  }

  @js.native
  sealed trait EvaluationMethod extends js.Any
  object EvaluationMethod {
    val BATCH = "BATCH".asInstanceOf[EvaluationMethod]
    val SERIAL = "SERIAL".asInstanceOf[EvaluationMethod]

    @inline def values = js.Array(BATCH, SERIAL)
  }

  /**
    * Specifies the <code>actions</code> to be performed when the <code>condition</code> evaluates to TRUE.
    */
  @js.native
  trait Event extends js.Object {
    var eventName: EventName
    var actions: js.UndefOr[Actions]
    var condition: js.UndefOr[Condition]
  }

  object Event {
    @inline
    def apply(
        eventName: EventName,
        actions: js.UndefOr[Actions] = js.undefined,
        condition: js.UndefOr[Condition] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal(
        "eventName" -> eventName.asInstanceOf[js.Any]
      )

      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      condition.foreach(__v => __obj.updateDynamic("condition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /**
    * Sends information about the detector model instance and the event that triggered the action to an Amazon Kinesis Data Firehose delivery stream.
    */
  @js.native
  trait FirehoseAction extends js.Object {
    var deliveryStreamName: DeliveryStreamName
    var payload: js.UndefOr[Payload]
    var separator: js.UndefOr[FirehoseSeparator]
  }

  object FirehoseAction {
    @inline
    def apply(
        deliveryStreamName: DeliveryStreamName,
        payload: js.UndefOr[Payload] = js.undefined,
        separator: js.UndefOr[FirehoseSeparator] = js.undefined
    ): FirehoseAction = {
      val __obj = js.Dynamic.literal(
        "deliveryStreamName" -> deliveryStreamName.asInstanceOf[js.Any]
      )

      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      separator.foreach(__v => __obj.updateDynamic("separator")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        inputConfiguration: js.UndefOr[InputConfiguration] = js.undefined,
        inputDefinition: js.UndefOr[InputDefinition] = js.undefined
    ): Input = {
      val __obj = js.Dynamic.literal()
      inputConfiguration.foreach(__v => __obj.updateDynamic("inputConfiguration")(__v.asInstanceOf[js.Any]))
      inputDefinition.foreach(__v => __obj.updateDynamic("inputDefinition")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        creationTime: Timestamp,
        inputArn: InputArn,
        inputName: InputName,
        lastUpdateTime: Timestamp,
        status: InputStatus,
        inputDescription: js.UndefOr[InputDescription] = js.undefined
    ): InputConfiguration = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "inputArn" -> inputArn.asInstanceOf[js.Any],
        "inputName" -> inputName.asInstanceOf[js.Any],
        "lastUpdateTime" -> lastUpdateTime.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      inputDescription.foreach(__v => __obj.updateDynamic("inputDescription")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        attributes: Attributes
    ): InputDefinition = {
      val __obj = js.Dynamic.literal(
        "attributes" -> attributes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InputDefinition]
    }
  }

  @js.native
  sealed trait InputStatus extends js.Any
  object InputStatus {
    val CREATING = "CREATING".asInstanceOf[InputStatus]
    val UPDATING = "UPDATING".asInstanceOf[InputStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[InputStatus]
    val DELETING = "DELETING".asInstanceOf[InputStatus]

    @inline def values = js.Array(CREATING, UPDATING, ACTIVE, DELETING)
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
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        inputArn: js.UndefOr[InputArn] = js.undefined,
        inputDescription: js.UndefOr[InputDescription] = js.undefined,
        inputName: js.UndefOr[InputName] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[InputStatus] = js.undefined
    ): InputSummary = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      inputArn.foreach(__v => __obj.updateDynamic("inputArn")(__v.asInstanceOf[js.Any]))
      inputDescription.foreach(__v => __obj.updateDynamic("inputDescription")(__v.asInstanceOf[js.Any]))
      inputName.foreach(__v => __obj.updateDynamic("inputName")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputSummary]
    }
  }

  /**
    * Sends an AWS IoT Events input, passing in information about the detector model instance and the event that triggered the action.
    */
  @js.native
  trait IotEventsAction extends js.Object {
    var inputName: InputName
    var payload: js.UndefOr[Payload]
  }

  object IotEventsAction {
    @inline
    def apply(
        inputName: InputName,
        payload: js.UndefOr[Payload] = js.undefined
    ): IotEventsAction = {
      val __obj = js.Dynamic.literal(
        "inputName" -> inputName.asInstanceOf[js.Any]
      )

      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IotEventsAction]
    }
  }

  /**
    * Sends information about the detector model instance and the event that triggered the action to a specified asset property in AWS IoT SiteWise.
    *  <important> You must specify either <code>propertyAlias</code> or both <code>assetId</code> and <code>propertyId</code> to identify the target asset property in AWS IoT SiteWise.
    *  </important> For parameters that are string data type, you can specify the following options:
    * * Use a string. For example, the <code>propertyAlias</code> value can be <code>'/company/windfarm/3/turbine/7/temperature'</code>.
    *  * Use an expression. For example, the <code>propertyAlias</code> value can be <code>'company/windfarm/{input.TemperatureInput.sensorData.windfarmID}/turbine/{input.TemperatureInput.sensorData.turbineID}/temperature'</code>.
    *  For more information, see [[https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html|Expressions]] in the <i>AWS IoT Events Developer Guide</i>.
    */
  @js.native
  trait IotSiteWiseAction extends js.Object {
    var propertyValue: AssetPropertyValue
    var assetId: js.UndefOr[AssetId]
    var entryId: js.UndefOr[AssetPropertyEntryId]
    var propertyAlias: js.UndefOr[AssetPropertyAlias]
    var propertyId: js.UndefOr[AssetPropertyId]
  }

  object IotSiteWiseAction {
    @inline
    def apply(
        propertyValue: AssetPropertyValue,
        assetId: js.UndefOr[AssetId] = js.undefined,
        entryId: js.UndefOr[AssetPropertyEntryId] = js.undefined,
        propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined,
        propertyId: js.UndefOr[AssetPropertyId] = js.undefined
    ): IotSiteWiseAction = {
      val __obj = js.Dynamic.literal(
        "propertyValue" -> propertyValue.asInstanceOf[js.Any]
      )

      assetId.foreach(__v => __obj.updateDynamic("assetId")(__v.asInstanceOf[js.Any]))
      entryId.foreach(__v => __obj.updateDynamic("entryId")(__v.asInstanceOf[js.Any]))
      propertyAlias.foreach(__v => __obj.updateDynamic("propertyAlias")(__v.asInstanceOf[js.Any]))
      propertyId.foreach(__v => __obj.updateDynamic("propertyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IotSiteWiseAction]
    }
  }

  /**
    * Information required to publish the MQTT message through the AWS IoT message broker.
    */
  @js.native
  trait IotTopicPublishAction extends js.Object {
    var mqttTopic: MQTTTopic
    var payload: js.UndefOr[Payload]
  }

  object IotTopicPublishAction {
    @inline
    def apply(
        mqttTopic: MQTTTopic,
        payload: js.UndefOr[Payload] = js.undefined
    ): IotTopicPublishAction = {
      val __obj = js.Dynamic.literal(
        "mqttTopic" -> mqttTopic.asInstanceOf[js.Any]
      )

      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IotTopicPublishAction]
    }
  }

  /**
    * Calls a Lambda function, passing in information about the detector model instance and the event that triggered the action.
    */
  @js.native
  trait LambdaAction extends js.Object {
    var functionArn: AmazonResourceName
    var payload: js.UndefOr[Payload]
  }

  object LambdaAction {
    @inline
    def apply(
        functionArn: AmazonResourceName,
        payload: js.UndefOr[Payload] = js.undefined
    ): LambdaAction = {
      val __obj = js.Dynamic.literal(
        "functionArn" -> functionArn.asInstanceOf[js.Any]
      )

      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        detectorModelName: DetectorModelName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectorModelVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorModelVersionsRequest]
    }
  }

  @js.native
  trait ListDetectorModelVersionsResponse extends js.Object {
    var detectorModelVersionSummaries: js.UndefOr[DetectorModelVersionSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDetectorModelVersionsResponse {
    @inline
    def apply(
        detectorModelVersionSummaries: js.UndefOr[DetectorModelVersionSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectorModelVersionsResponse = {
      val __obj = js.Dynamic.literal()
      detectorModelVersionSummaries.foreach(__v => __obj.updateDynamic("detectorModelVersionSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorModelVersionsResponse]
    }
  }

  @js.native
  trait ListDetectorModelsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDetectorModelsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectorModelsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorModelsRequest]
    }
  }

  @js.native
  trait ListDetectorModelsResponse extends js.Object {
    var detectorModelSummaries: js.UndefOr[DetectorModelSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDetectorModelsResponse {
    @inline
    def apply(
        detectorModelSummaries: js.UndefOr[DetectorModelSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectorModelsResponse = {
      val __obj = js.Dynamic.literal()
      detectorModelSummaries.foreach(__v => __obj.updateDynamic("detectorModelSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorModelsResponse]
    }
  }

  @js.native
  trait ListInputsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListInputsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInputsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInputsRequest]
    }
  }

  @js.native
  trait ListInputsResponse extends js.Object {
    var inputSummaries: js.UndefOr[InputSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListInputsResponse {
    @inline
    def apply(
        inputSummaries: js.UndefOr[InputSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInputsResponse = {
      val __obj = js.Dynamic.literal()
      inputSummaries.foreach(__v => __obj.updateDynamic("inputSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInputsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  sealed trait LoggingLevel extends js.Any
  object LoggingLevel {
    val ERROR = "ERROR".asInstanceOf[LoggingLevel]
    val INFO = "INFO".asInstanceOf[LoggingLevel]
    val DEBUG = "DEBUG".asInstanceOf[LoggingLevel]

    @inline def values = js.Array(ERROR, INFO, DEBUG)
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
    @inline
    def apply(
        enabled: LoggingEnabled,
        level: LoggingLevel,
        roleArn: AmazonResourceName,
        detectorDebugOptions: js.UndefOr[DetectorDebugOptions] = js.undefined
    ): LoggingOptions = {
      val __obj = js.Dynamic.literal(
        "enabled" -> enabled.asInstanceOf[js.Any],
        "level" -> level.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      detectorDebugOptions.foreach(__v => __obj.updateDynamic("detectorDebugOptions")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        events: js.UndefOr[Events] = js.undefined
    ): OnEnterLifecycle = {
      val __obj = js.Dynamic.literal()
      events.foreach(__v => __obj.updateDynamic("events")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnEnterLifecycle]
    }
  }

  /**
    * When exiting this state, perform these <code>actions</code> if the specified <code>condition</code> is <code>TRUE</code>.
    */
  @js.native
  trait OnExitLifecycle extends js.Object {
    var events: js.UndefOr[Events]
  }

  object OnExitLifecycle {
    @inline
    def apply(
        events: js.UndefOr[Events] = js.undefined
    ): OnExitLifecycle = {
      val __obj = js.Dynamic.literal()
      events.foreach(__v => __obj.updateDynamic("events")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnExitLifecycle]
    }
  }

  /**
    * Specifies the actions performed when the <code>condition</code> evaluates to TRUE.
    */
  @js.native
  trait OnInputLifecycle extends js.Object {
    var events: js.UndefOr[Events]
    var transitionEvents: js.UndefOr[TransitionEvents]
  }

  object OnInputLifecycle {
    @inline
    def apply(
        events: js.UndefOr[Events] = js.undefined,
        transitionEvents: js.UndefOr[TransitionEvents] = js.undefined
    ): OnInputLifecycle = {
      val __obj = js.Dynamic.literal()
      events.foreach(__v => __obj.updateDynamic("events")(__v.asInstanceOf[js.Any]))
      transitionEvents.foreach(__v => __obj.updateDynamic("transitionEvents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnInputLifecycle]
    }
  }

  /**
    * Information needed to configure the payload.
    *  By default, AWS IoT Events generates a standard payload in JSON for any action. This action payload contains all attribute-value pairs that have the information about the detector model instance and the event triggered the action. To configure the action payload, you can use <code>contentExpression</code>.
    */
  @js.native
  trait Payload extends js.Object {
    var contentExpression: ContentExpression
    var `type`: PayloadType
  }

  object Payload {
    @inline
    def apply(
        contentExpression: ContentExpression,
        `type`: PayloadType
    ): Payload = {
      val __obj = js.Dynamic.literal(
        "contentExpression" -> contentExpression.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Payload]
    }
  }

  @js.native
  sealed trait PayloadType extends js.Any
  object PayloadType {
    val STRING = "STRING".asInstanceOf[PayloadType]
    val JSON = "JSON".asInstanceOf[PayloadType]

    @inline def values = js.Array(STRING, JSON)
  }

  @js.native
  trait PutLoggingOptionsRequest extends js.Object {
    var loggingOptions: LoggingOptions
  }

  object PutLoggingOptionsRequest {
    @inline
    def apply(
        loggingOptions: LoggingOptions
    ): PutLoggingOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "loggingOptions" -> loggingOptions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutLoggingOptionsRequest]
    }
  }

  /**
    * Information required to reset the timer. The timer is reset to the previously evaluated result of the duration. The duration expression isn't reevaluated when you reset the timer.
    */
  @js.native
  trait ResetTimerAction extends js.Object {
    var timerName: TimerName
  }

  object ResetTimerAction {
    @inline
    def apply(
        timerName: TimerName
    ): ResetTimerAction = {
      val __obj = js.Dynamic.literal(
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
    var payload: js.UndefOr[Payload]
  }

  object SNSTopicPublishAction {
    @inline
    def apply(
        targetArn: AmazonResourceName,
        payload: js.UndefOr[Payload] = js.undefined
    ): SNSTopicPublishAction = {
      val __obj = js.Dynamic.literal(
        "targetArn" -> targetArn.asInstanceOf[js.Any]
      )

      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SNSTopicPublishAction]
    }
  }

  /**
    * Information needed to set the timer.
    */
  @js.native
  trait SetTimerAction extends js.Object {
    var timerName: TimerName
    var durationExpression: js.UndefOr[VariableValue]
    var seconds: js.UndefOr[Seconds]
  }

  object SetTimerAction {
    @inline
    def apply(
        timerName: TimerName,
        durationExpression: js.UndefOr[VariableValue] = js.undefined,
        seconds: js.UndefOr[Seconds] = js.undefined
    ): SetTimerAction = {
      val __obj = js.Dynamic.literal(
        "timerName" -> timerName.asInstanceOf[js.Any]
      )

      durationExpression.foreach(__v => __obj.updateDynamic("durationExpression")(__v.asInstanceOf[js.Any]))
      seconds.foreach(__v => __obj.updateDynamic("seconds")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        value: VariableValue,
        variableName: VariableName
    ): SetVariableAction = {
      val __obj = js.Dynamic.literal(
        "value" -> value.asInstanceOf[js.Any],
        "variableName" -> variableName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetVariableAction]
    }
  }

  /**
    * Sends information about the detector model instance and the event that triggered the action to an Amazon SQS queue.
    */
  @js.native
  trait SqsAction extends js.Object {
    var queueUrl: QueueUrl
    var payload: js.UndefOr[Payload]
    var useBase64: js.UndefOr[UseBase64]
  }

  object SqsAction {
    @inline
    def apply(
        queueUrl: QueueUrl,
        payload: js.UndefOr[Payload] = js.undefined,
        useBase64: js.UndefOr[UseBase64] = js.undefined
    ): SqsAction = {
      val __obj = js.Dynamic.literal(
        "queueUrl" -> queueUrl.asInstanceOf[js.Any]
      )

      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      useBase64.foreach(__v => __obj.updateDynamic("useBase64")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        stateName: StateName,
        onEnter: js.UndefOr[OnEnterLifecycle] = js.undefined,
        onExit: js.UndefOr[OnExitLifecycle] = js.undefined,
        onInput: js.UndefOr[OnInputLifecycle] = js.undefined
    ): State = {
      val __obj = js.Dynamic.literal(
        "stateName" -> stateName.asInstanceOf[js.Any]
      )

      onEnter.foreach(__v => __obj.updateDynamic("onEnter")(__v.asInstanceOf[js.Any]))
      onExit.foreach(__v => __obj.updateDynamic("onExit")(__v.asInstanceOf[js.Any]))
      onInput.foreach(__v => __obj.updateDynamic("onInput")(__v.asInstanceOf[js.Any]))
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
  trait TagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName,
        tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Specifies the actions performed and the next state entered when a <code>condition</code> evaluates to TRUE.
    */
  @js.native
  trait TransitionEvent extends js.Object {
    var condition: Condition
    var eventName: EventName
    var nextState: StateName
    var actions: js.UndefOr[Actions]
  }

  object TransitionEvent {
    @inline
    def apply(
        condition: Condition,
        eventName: EventName,
        nextState: StateName,
        actions: js.UndefOr[Actions] = js.undefined
    ): TransitionEvent = {
      val __obj = js.Dynamic.literal(
        "condition" -> condition.asInstanceOf[js.Any],
        "eventName" -> eventName.asInstanceOf[js.Any],
        "nextState" -> nextState.asInstanceOf[js.Any]
      )

      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransitionEvent]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDetectorModelRequest extends js.Object {
    var detectorModelDefinition: DetectorModelDefinition
    var detectorModelName: DetectorModelName
    var roleArn: AmazonResourceName
    var detectorModelDescription: js.UndefOr[DetectorModelDescription]
    var evaluationMethod: js.UndefOr[EvaluationMethod]
  }

  object UpdateDetectorModelRequest {
    @inline
    def apply(
        detectorModelDefinition: DetectorModelDefinition,
        detectorModelName: DetectorModelName,
        roleArn: AmazonResourceName,
        detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined,
        evaluationMethod: js.UndefOr[EvaluationMethod] = js.undefined
    ): UpdateDetectorModelRequest = {
      val __obj = js.Dynamic.literal(
        "detectorModelDefinition" -> detectorModelDefinition.asInstanceOf[js.Any],
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      detectorModelDescription.foreach(__v => __obj.updateDynamic("detectorModelDescription")(__v.asInstanceOf[js.Any]))
      evaluationMethod.foreach(__v => __obj.updateDynamic("evaluationMethod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDetectorModelRequest]
    }
  }

  @js.native
  trait UpdateDetectorModelResponse extends js.Object {
    var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration]
  }

  object UpdateDetectorModelResponse {
    @inline
    def apply(
        detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.undefined
    ): UpdateDetectorModelResponse = {
      val __obj = js.Dynamic.literal()
      detectorModelConfiguration.foreach(__v => __obj.updateDynamic("detectorModelConfiguration")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        inputDefinition: InputDefinition,
        inputName: InputName,
        inputDescription: js.UndefOr[InputDescription] = js.undefined
    ): UpdateInputRequest = {
      val __obj = js.Dynamic.literal(
        "inputDefinition" -> inputDefinition.asInstanceOf[js.Any],
        "inputName" -> inputName.asInstanceOf[js.Any]
      )

      inputDescription.foreach(__v => __obj.updateDynamic("inputDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInputRequest]
    }
  }

  @js.native
  trait UpdateInputResponse extends js.Object {
    var inputConfiguration: js.UndefOr[InputConfiguration]
  }

  object UpdateInputResponse {
    @inline
    def apply(
        inputConfiguration: js.UndefOr[InputConfiguration] = js.undefined
    ): UpdateInputResponse = {
      val __obj = js.Dynamic.literal()
      inputConfiguration.foreach(__v => __obj.updateDynamic("inputConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInputResponse]
    }
  }
}
