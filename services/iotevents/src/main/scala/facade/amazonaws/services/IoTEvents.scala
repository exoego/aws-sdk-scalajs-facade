package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object iotevents {
  type AcknowledgeFlowEnabled = Boolean
  type Actions = js.Array[Action]
  type AlarmActions = js.Array[AlarmAction]
  type AlarmModelArn = String
  type AlarmModelDescription = String
  type AlarmModelName = String
  type AlarmModelSummaries = js.Array[AlarmModelSummary]
  type AlarmModelVersion = String
  type AlarmModelVersionSummaries = js.Array[AlarmModelVersionSummary]
  type AmazonResourceName = String
  type AnalysisId = String
  type AnalysisMessage = String
  type AnalysisResultLocationPath = String
  type AnalysisResultLocations = js.Array[AnalysisResultLocation]
  type AnalysisResults = js.Array[AnalysisResult]
  type AnalysisType = String
  type AssetId = String
  type AssetModelId = String
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
  type DisabledOnInitialization = Boolean
  type DynamoKeyField = String
  type DynamoKeyType = String
  type DynamoKeyValue = String
  type DynamoOperation = String
  type DynamoTableName = String
  type EmailConfigurations = js.Array[EmailConfiguration]
  type EmailSubject = String
  type EventName = String
  type Events = js.Array[Event]
  type FirehoseSeparator = String
  type FromEmail = String
  type IdentityStoreId = String
  type InputArn = String
  type InputDescription = String
  type InputName = String
  type InputProperty = String
  type InputSummaries = js.Array[InputSummary]
  type KeyValue = String
  type LoggingEnabled = Boolean
  type MQTTTopic = String
  type MaxAnalysisResults = Int
  type MaxResults = Int
  type NextToken = String
  type NotificationActions = js.Array[NotificationAction]
  type NotificationAdditionalMessage = String
  type QueueUrl = String
  type RecipientDetails = js.Array[RecipientDetail]
  type ResourceName = String
  type RoutedResources = js.Array[RoutedResource]
  type SMSConfigurations = js.Array[SMSConfiguration]
  type SMSSenderId = String
  type SSOReferenceId = String
  type Seconds = Int
  type Severity = Int
  type StateName = String
  type States = js.Array[State]
  type StatusMessage = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type Threshold = String
  type TimerName = String
  type Timestamp = js.Date
  type TransitionEvents = js.Array[TransitionEvent]
  type UseBase64 = Boolean
  type VariableName = String
  type VariableValue = String

  final class IoTEventsOps(private val service: IoTEvents) extends AnyVal {

    @inline def createAlarmModelFuture(params: CreateAlarmModelRequest): Future[CreateAlarmModelResponse] = service.createAlarmModel(params).promise().toFuture
    @inline def createDetectorModelFuture(params: CreateDetectorModelRequest): Future[CreateDetectorModelResponse] = service.createDetectorModel(params).promise().toFuture
    @inline def createInputFuture(params: CreateInputRequest): Future[CreateInputResponse] = service.createInput(params).promise().toFuture
    @inline def deleteAlarmModelFuture(params: DeleteAlarmModelRequest): Future[DeleteAlarmModelResponse] = service.deleteAlarmModel(params).promise().toFuture
    @inline def deleteDetectorModelFuture(params: DeleteDetectorModelRequest): Future[DeleteDetectorModelResponse] = service.deleteDetectorModel(params).promise().toFuture
    @inline def deleteInputFuture(params: DeleteInputRequest): Future[DeleteInputResponse] = service.deleteInput(params).promise().toFuture
    @inline def describeAlarmModelFuture(params: DescribeAlarmModelRequest): Future[DescribeAlarmModelResponse] = service.describeAlarmModel(params).promise().toFuture
    @inline def describeDetectorModelAnalysisFuture(params: DescribeDetectorModelAnalysisRequest): Future[DescribeDetectorModelAnalysisResponse] = service.describeDetectorModelAnalysis(params).promise().toFuture
    @inline def describeDetectorModelFuture(params: DescribeDetectorModelRequest): Future[DescribeDetectorModelResponse] = service.describeDetectorModel(params).promise().toFuture
    @inline def describeInputFuture(params: DescribeInputRequest): Future[DescribeInputResponse] = service.describeInput(params).promise().toFuture
    @inline def describeLoggingOptionsFuture(params: DescribeLoggingOptionsRequest): Future[DescribeLoggingOptionsResponse] = service.describeLoggingOptions(params).promise().toFuture
    @inline def getDetectorModelAnalysisResultsFuture(params: GetDetectorModelAnalysisResultsRequest): Future[GetDetectorModelAnalysisResultsResponse] = service.getDetectorModelAnalysisResults(params).promise().toFuture
    @inline def listAlarmModelVersionsFuture(params: ListAlarmModelVersionsRequest): Future[ListAlarmModelVersionsResponse] = service.listAlarmModelVersions(params).promise().toFuture
    @inline def listAlarmModelsFuture(params: ListAlarmModelsRequest): Future[ListAlarmModelsResponse] = service.listAlarmModels(params).promise().toFuture
    @inline def listDetectorModelVersionsFuture(params: ListDetectorModelVersionsRequest): Future[ListDetectorModelVersionsResponse] = service.listDetectorModelVersions(params).promise().toFuture
    @inline def listDetectorModelsFuture(params: ListDetectorModelsRequest): Future[ListDetectorModelsResponse] = service.listDetectorModels(params).promise().toFuture
    @inline def listInputRoutingsFuture(params: ListInputRoutingsRequest): Future[ListInputRoutingsResponse] = service.listInputRoutings(params).promise().toFuture
    @inline def listInputsFuture(params: ListInputsRequest): Future[ListInputsResponse] = service.listInputs(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putLoggingOptionsFuture(params: PutLoggingOptionsRequest): Future[js.Object] = service.putLoggingOptions(params).promise().toFuture
    @inline def startDetectorModelAnalysisFuture(params: StartDetectorModelAnalysisRequest): Future[StartDetectorModelAnalysisResponse] = service.startDetectorModelAnalysis(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAlarmModelFuture(params: UpdateAlarmModelRequest): Future[UpdateAlarmModelResponse] = service.updateAlarmModel(params).promise().toFuture
    @inline def updateDetectorModelFuture(params: UpdateDetectorModelRequest): Future[UpdateDetectorModelResponse] = service.updateDetectorModel(params).promise().toFuture
    @inline def updateInputFuture(params: UpdateInputRequest): Future[UpdateInputResponse] = service.updateInput(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/iotevents", JSImport.Namespace, "AWS.IoTEvents")
  class IoTEvents() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAlarmModel(params: CreateAlarmModelRequest): Request[CreateAlarmModelResponse] = js.native
    def createDetectorModel(params: CreateDetectorModelRequest): Request[CreateDetectorModelResponse] = js.native
    def createInput(params: CreateInputRequest): Request[CreateInputResponse] = js.native
    def deleteAlarmModel(params: DeleteAlarmModelRequest): Request[DeleteAlarmModelResponse] = js.native
    def deleteDetectorModel(params: DeleteDetectorModelRequest): Request[DeleteDetectorModelResponse] = js.native
    def deleteInput(params: DeleteInputRequest): Request[DeleteInputResponse] = js.native
    def describeAlarmModel(params: DescribeAlarmModelRequest): Request[DescribeAlarmModelResponse] = js.native
    def describeDetectorModel(params: DescribeDetectorModelRequest): Request[DescribeDetectorModelResponse] = js.native
    def describeDetectorModelAnalysis(params: DescribeDetectorModelAnalysisRequest): Request[DescribeDetectorModelAnalysisResponse] = js.native
    def describeInput(params: DescribeInputRequest): Request[DescribeInputResponse] = js.native
    def describeLoggingOptions(params: DescribeLoggingOptionsRequest): Request[DescribeLoggingOptionsResponse] = js.native
    def getDetectorModelAnalysisResults(params: GetDetectorModelAnalysisResultsRequest): Request[GetDetectorModelAnalysisResultsResponse] = js.native
    def listAlarmModelVersions(params: ListAlarmModelVersionsRequest): Request[ListAlarmModelVersionsResponse] = js.native
    def listAlarmModels(params: ListAlarmModelsRequest): Request[ListAlarmModelsResponse] = js.native
    def listDetectorModelVersions(params: ListDetectorModelVersionsRequest): Request[ListDetectorModelVersionsResponse] = js.native
    def listDetectorModels(params: ListDetectorModelsRequest): Request[ListDetectorModelsResponse] = js.native
    def listInputRoutings(params: ListInputRoutingsRequest): Request[ListInputRoutingsResponse] = js.native
    def listInputs(params: ListInputsRequest): Request[ListInputsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putLoggingOptions(params: PutLoggingOptionsRequest): Request[js.Object] = js.native
    def startDetectorModelAnalysis(params: StartDetectorModelAnalysisRequest): Request[StartDetectorModelAnalysisResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAlarmModel(params: UpdateAlarmModelRequest): Request[UpdateAlarmModelResponse] = js.native
    def updateDetectorModel(params: UpdateDetectorModelRequest): Request[UpdateDetectorModelResponse] = js.native
    def updateInput(params: UpdateInputRequest): Request[UpdateInputResponse] = js.native
  }
  object IoTEvents {
    @inline implicit def toOps(service: IoTEvents): IoTEventsOps = {
      new IoTEventsOps(service)
    }
  }

  /** Specifies whether to get notified for alarm state changes.
    */
  @js.native
  trait AcknowledgeFlow extends js.Object {
    var enabled: AcknowledgeFlowEnabled
  }

  object AcknowledgeFlow {
    @inline
    def apply(
        enabled: AcknowledgeFlowEnabled
    ): AcknowledgeFlow = {
      val __obj = js.Dynamic.literal(
        "enabled" -> enabled.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcknowledgeFlow]
    }
  }

  /** An action to be performed when the <code>condition</code> is TRUE.
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

  /** Specifies one of the following actions to receive notifications when the alarm state changes.
    */
  @js.native
  trait AlarmAction extends js.Object {
    var dynamoDB: js.UndefOr[DynamoDBAction]
    var dynamoDBv2: js.UndefOr[DynamoDBv2Action]
    var firehose: js.UndefOr[FirehoseAction]
    var iotEvents: js.UndefOr[IotEventsAction]
    var iotSiteWise: js.UndefOr[IotSiteWiseAction]
    var iotTopicPublish: js.UndefOr[IotTopicPublishAction]
    var lambda: js.UndefOr[LambdaAction]
    var sns: js.UndefOr[SNSTopicPublishAction]
    var sqs: js.UndefOr[SqsAction]
  }

  object AlarmAction {
    @inline
    def apply(
        dynamoDB: js.UndefOr[DynamoDBAction] = js.undefined,
        dynamoDBv2: js.UndefOr[DynamoDBv2Action] = js.undefined,
        firehose: js.UndefOr[FirehoseAction] = js.undefined,
        iotEvents: js.UndefOr[IotEventsAction] = js.undefined,
        iotSiteWise: js.UndefOr[IotSiteWiseAction] = js.undefined,
        iotTopicPublish: js.UndefOr[IotTopicPublishAction] = js.undefined,
        lambda: js.UndefOr[LambdaAction] = js.undefined,
        sns: js.UndefOr[SNSTopicPublishAction] = js.undefined,
        sqs: js.UndefOr[SqsAction] = js.undefined
    ): AlarmAction = {
      val __obj = js.Dynamic.literal()
      dynamoDB.foreach(__v => __obj.updateDynamic("dynamoDB")(__v.asInstanceOf[js.Any]))
      dynamoDBv2.foreach(__v => __obj.updateDynamic("dynamoDBv2")(__v.asInstanceOf[js.Any]))
      firehose.foreach(__v => __obj.updateDynamic("firehose")(__v.asInstanceOf[js.Any]))
      iotEvents.foreach(__v => __obj.updateDynamic("iotEvents")(__v.asInstanceOf[js.Any]))
      iotSiteWise.foreach(__v => __obj.updateDynamic("iotSiteWise")(__v.asInstanceOf[js.Any]))
      iotTopicPublish.foreach(__v => __obj.updateDynamic("iotTopicPublish")(__v.asInstanceOf[js.Any]))
      lambda.foreach(__v => __obj.updateDynamic("lambda")(__v.asInstanceOf[js.Any]))
      sns.foreach(__v => __obj.updateDynamic("sns")(__v.asInstanceOf[js.Any]))
      sqs.foreach(__v => __obj.updateDynamic("sqs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlarmAction]
    }
  }

  /** Contains the configuration information of alarm state changes.
    */
  @js.native
  trait AlarmCapabilities extends js.Object {
    var acknowledgeFlow: js.UndefOr[AcknowledgeFlow]
    var initializationConfiguration: js.UndefOr[InitializationConfiguration]
  }

  object AlarmCapabilities {
    @inline
    def apply(
        acknowledgeFlow: js.UndefOr[AcknowledgeFlow] = js.undefined,
        initializationConfiguration: js.UndefOr[InitializationConfiguration] = js.undefined
    ): AlarmCapabilities = {
      val __obj = js.Dynamic.literal()
      acknowledgeFlow.foreach(__v => __obj.updateDynamic("acknowledgeFlow")(__v.asInstanceOf[js.Any]))
      initializationConfiguration.foreach(__v => __obj.updateDynamic("initializationConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlarmCapabilities]
    }
  }

  /** Contains information about one or more alarm actions.
    */
  @js.native
  trait AlarmEventActions extends js.Object {
    var alarmActions: js.UndefOr[AlarmActions]
  }

  object AlarmEventActions {
    @inline
    def apply(
        alarmActions: js.UndefOr[AlarmActions] = js.undefined
    ): AlarmEventActions = {
      val __obj = js.Dynamic.literal()
      alarmActions.foreach(__v => __obj.updateDynamic("alarmActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlarmEventActions]
    }
  }

  /** Contains a summary of an alarm model.
    */
  @js.native
  trait AlarmModelSummary extends js.Object {
    var alarmModelDescription: js.UndefOr[AlarmModelDescription]
    var alarmModelName: js.UndefOr[AlarmModelName]
    var creationTime: js.UndefOr[Timestamp]
  }

  object AlarmModelSummary {
    @inline
    def apply(
        alarmModelDescription: js.UndefOr[AlarmModelDescription] = js.undefined,
        alarmModelName: js.UndefOr[AlarmModelName] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined
    ): AlarmModelSummary = {
      val __obj = js.Dynamic.literal()
      alarmModelDescription.foreach(__v => __obj.updateDynamic("alarmModelDescription")(__v.asInstanceOf[js.Any]))
      alarmModelName.foreach(__v => __obj.updateDynamic("alarmModelName")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlarmModelSummary]
    }
  }

  /** Contains a summary of an alarm model version.
    */
  @js.native
  trait AlarmModelVersionSummary extends js.Object {
    var alarmModelArn: js.UndefOr[AlarmModelArn]
    var alarmModelName: js.UndefOr[AlarmModelName]
    var alarmModelVersion: js.UndefOr[AlarmModelVersion]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[AmazonResourceName]
    var status: js.UndefOr[AlarmModelVersionStatus]
    var statusMessage: js.UndefOr[StatusMessage]
  }

  object AlarmModelVersionSummary {
    @inline
    def apply(
        alarmModelArn: js.UndefOr[AlarmModelArn] = js.undefined,
        alarmModelName: js.UndefOr[AlarmModelName] = js.undefined,
        alarmModelVersion: js.UndefOr[AlarmModelVersion] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        roleArn: js.UndefOr[AmazonResourceName] = js.undefined,
        status: js.UndefOr[AlarmModelVersionStatus] = js.undefined,
        statusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): AlarmModelVersionSummary = {
      val __obj = js.Dynamic.literal()
      alarmModelArn.foreach(__v => __obj.updateDynamic("alarmModelArn")(__v.asInstanceOf[js.Any]))
      alarmModelName.foreach(__v => __obj.updateDynamic("alarmModelName")(__v.asInstanceOf[js.Any]))
      alarmModelVersion.foreach(__v => __obj.updateDynamic("alarmModelVersion")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlarmModelVersionSummary]
    }
  }

  /** Contains information about one or more notification actions.
    */
  @js.native
  trait AlarmNotification extends js.Object {
    var notificationActions: js.UndefOr[NotificationActions]
  }

  object AlarmNotification {
    @inline
    def apply(
        notificationActions: js.UndefOr[NotificationActions] = js.undefined
    ): AlarmNotification = {
      val __obj = js.Dynamic.literal()
      notificationActions.foreach(__v => __obj.updateDynamic("notificationActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlarmNotification]
    }
  }

  /** Defines when your alarm is invoked.
    */
  @js.native
  trait AlarmRule extends js.Object {
    var simpleRule: js.UndefOr[SimpleRule]
  }

  object AlarmRule {
    @inline
    def apply(
        simpleRule: js.UndefOr[SimpleRule] = js.undefined
    ): AlarmRule = {
      val __obj = js.Dynamic.literal()
      simpleRule.foreach(__v => __obj.updateDynamic("simpleRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlarmRule]
    }
  }

  /** Contains the result of the analysis.
    */
  @js.native
  trait AnalysisResult extends js.Object {
    var level: js.UndefOr[AnalysisResultLevel]
    var locations: js.UndefOr[AnalysisResultLocations]
    var message: js.UndefOr[AnalysisMessage]
    var `type`: js.UndefOr[AnalysisType]
  }

  object AnalysisResult {
    @inline
    def apply(
        level: js.UndefOr[AnalysisResultLevel] = js.undefined,
        locations: js.UndefOr[AnalysisResultLocations] = js.undefined,
        message: js.UndefOr[AnalysisMessage] = js.undefined,
        `type`: js.UndefOr[AnalysisType] = js.undefined
    ): AnalysisResult = {
      val __obj = js.Dynamic.literal()
      level.foreach(__v => __obj.updateDynamic("level")(__v.asInstanceOf[js.Any]))
      locations.foreach(__v => __obj.updateDynamic("locations")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalysisResult]
    }
  }

  /** Contains information that you can use to locate the field in your detector model that the analysis result references.
    */
  @js.native
  trait AnalysisResultLocation extends js.Object {
    var path: js.UndefOr[AnalysisResultLocationPath]
  }

  object AnalysisResultLocation {
    @inline
    def apply(
        path: js.UndefOr[AnalysisResultLocationPath] = js.undefined
    ): AnalysisResultLocation = {
      val __obj = js.Dynamic.literal()
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalysisResultLocation]
    }
  }

  /** A structure that contains timestamp information. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_TimeInNanos.html|TimeInNanos]] in the <i>AWS IoT SiteWise API Reference</i>. You must use expressions for all parameters in <code>AssetPropertyTimestamp</code>. The expressions accept literals, operators, functions, references, and substitution templates. <p class="title"> ```Examples``` </p>* For literal values, the expressions must contain single quotes. For example, the value for the <code>timeInSeconds</code> parameter can be <code>'1586400675'</code>. * For references, you must specify either variables or input values. For example, the value for the <code>offsetInNanos</code> parameter can be <code>variable.time</code>. * For a substitution template, you must use <code>{}</code>, and the template must be in single quotes. A substitution template can also contain a combination of literals, operators, functions, references, and
    * substitution templates. In the following example, the value for the <code>timeInSeconds</code> parameter uses a substitution template. <code>'{input.TemperatureInput.sensorData.timestamp / 1000}'</code> For more information, see [[https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html|Expressions]] in the <i>AWS IoT Events Developer Guide</i>.
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

  /** A structure that contains value information. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetPropertyValue.html|AssetPropertyValue]] in the <i>AWS IoT SiteWise API Reference</i>. You must use expressions for all parameters in <code>AssetPropertyValue</code>. The expressions accept literals, operators, functions, references, and substitution templates. <p class="title"> ```Examples``` </p>* For literal values, the expressions must contain single quotes. For example, the value for the <code>quality</code> parameter can be <code>'GOOD'</code>. * For references, you must specify either variables or input values. For example, the value for the <code>quality</code> parameter can be <code>input.TemperatureInput.sensorData.quality</code>. For more information, see [[https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html|Expressions]] in the <i>AWS IoT Events Developer Guide</i>.
    */
  @js.native
  trait AssetPropertyValue extends js.Object {
    var quality: js.UndefOr[AssetPropertyQuality]
    var timestamp: js.UndefOr[AssetPropertyTimestamp]
    var value: js.UndefOr[AssetPropertyVariant]
  }

  object AssetPropertyValue {
    @inline
    def apply(
        quality: js.UndefOr[AssetPropertyQuality] = js.undefined,
        timestamp: js.UndefOr[AssetPropertyTimestamp] = js.undefined,
        value: js.UndefOr[AssetPropertyVariant] = js.undefined
    ): AssetPropertyValue = {
      val __obj = js.Dynamic.literal()
      quality.foreach(__v => __obj.updateDynamic("quality")(__v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.updateDynamic("timestamp")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetPropertyValue]
    }
  }

  /** A structure that contains an asset property value. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_Variant.html|Variant]] in the <i>AWS IoT SiteWise API Reference</i>. You must use expressions for all parameters in <code>AssetPropertyVariant</code>. The expressions accept literals, operators, functions, references, and substitution templates. <p class="title"> ```Examples``` </p>* For literal values, the expressions must contain single quotes. For example, the value for the <code>integerValue</code> parameter can be <code>'100'</code>. * For references, you must specify either variables or parameters. For example, the value for the <code>booleanValue</code> parameter can be <code>variable.offline</code>. * For a substitution template, you must use <code>{}</code>, and the template must be in single quotes. A substitution template can also contain a combination of literals, operators, functions, references, and substitution templates.
    * In the following example, the value for the <code>doubleValue</code> parameter uses a substitution template. <code>'{input.TemperatureInput.sensorData.temperature * 6 / 5 + 32}'</code> For more information, see [[https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html|Expressions]] in the <i>AWS IoT Events Developer Guide</i>. You must specify one of the following value types, depending on the <code>dataType</code> of the specified asset property. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetProperty.html|AssetProperty]] in the <i>AWS IoT SiteWise API Reference</i>.
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

  /** The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent to the AWS IoT Events system using <code>BatchPutMessage</code>. Each such message contains a JSON payload. Those attributes (and their paired values) specified here are available for use in the <code>condition</code> expressions used by detectors.
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

  /** Information needed to clear the timer.
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
  trait CreateAlarmModelRequest extends js.Object {
    var alarmModelName: AlarmModelName
    var alarmRule: AlarmRule
    var roleArn: AmazonResourceName
    var alarmCapabilities: js.UndefOr[AlarmCapabilities]
    var alarmEventActions: js.UndefOr[AlarmEventActions]
    var alarmModelDescription: js.UndefOr[AlarmModelDescription]
    var alarmNotification: js.UndefOr[AlarmNotification]
    var key: js.UndefOr[AttributeJsonPath]
    var severity: js.UndefOr[Severity]
    var tags: js.UndefOr[Tags]
  }

  object CreateAlarmModelRequest {
    @inline
    def apply(
        alarmModelName: AlarmModelName,
        alarmRule: AlarmRule,
        roleArn: AmazonResourceName,
        alarmCapabilities: js.UndefOr[AlarmCapabilities] = js.undefined,
        alarmEventActions: js.UndefOr[AlarmEventActions] = js.undefined,
        alarmModelDescription: js.UndefOr[AlarmModelDescription] = js.undefined,
        alarmNotification: js.UndefOr[AlarmNotification] = js.undefined,
        key: js.UndefOr[AttributeJsonPath] = js.undefined,
        severity: js.UndefOr[Severity] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateAlarmModelRequest = {
      val __obj = js.Dynamic.literal(
        "alarmModelName" -> alarmModelName.asInstanceOf[js.Any],
        "alarmRule" -> alarmRule.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      alarmCapabilities.foreach(__v => __obj.updateDynamic("alarmCapabilities")(__v.asInstanceOf[js.Any]))
      alarmEventActions.foreach(__v => __obj.updateDynamic("alarmEventActions")(__v.asInstanceOf[js.Any]))
      alarmModelDescription.foreach(__v => __obj.updateDynamic("alarmModelDescription")(__v.asInstanceOf[js.Any]))
      alarmNotification.foreach(__v => __obj.updateDynamic("alarmNotification")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      severity.foreach(__v => __obj.updateDynamic("severity")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAlarmModelRequest]
    }
  }

  @js.native
  trait CreateAlarmModelResponse extends js.Object {
    var alarmModelArn: js.UndefOr[AlarmModelArn]
    var alarmModelVersion: js.UndefOr[AlarmModelVersion]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[AlarmModelVersionStatus]
  }

  object CreateAlarmModelResponse {
    @inline
    def apply(
        alarmModelArn: js.UndefOr[AlarmModelArn] = js.undefined,
        alarmModelVersion: js.UndefOr[AlarmModelVersion] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[AlarmModelVersionStatus] = js.undefined
    ): CreateAlarmModelResponse = {
      val __obj = js.Dynamic.literal()
      alarmModelArn.foreach(__v => __obj.updateDynamic("alarmModelArn")(__v.asInstanceOf[js.Any]))
      alarmModelVersion.foreach(__v => __obj.updateDynamic("alarmModelVersion")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAlarmModelResponse]
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
  trait DeleteAlarmModelRequest extends js.Object {
    var alarmModelName: AlarmModelName
  }

  object DeleteAlarmModelRequest {
    @inline
    def apply(
        alarmModelName: AlarmModelName
    ): DeleteAlarmModelRequest = {
      val __obj = js.Dynamic.literal(
        "alarmModelName" -> alarmModelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAlarmModelRequest]
    }
  }

  @js.native
  trait DeleteAlarmModelResponse extends js.Object

  object DeleteAlarmModelResponse {
    @inline
    def apply(): DeleteAlarmModelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAlarmModelResponse]
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
  trait DeleteDetectorModelResponse extends js.Object

  object DeleteDetectorModelResponse {
    @inline
    def apply(): DeleteDetectorModelResponse = {
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
  trait DeleteInputResponse extends js.Object

  object DeleteInputResponse {
    @inline
    def apply(): DeleteInputResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteInputResponse]
    }
  }

  @js.native
  trait DescribeAlarmModelRequest extends js.Object {
    var alarmModelName: AlarmModelName
    var alarmModelVersion: js.UndefOr[AlarmModelVersion]
  }

  object DescribeAlarmModelRequest {
    @inline
    def apply(
        alarmModelName: AlarmModelName,
        alarmModelVersion: js.UndefOr[AlarmModelVersion] = js.undefined
    ): DescribeAlarmModelRequest = {
      val __obj = js.Dynamic.literal(
        "alarmModelName" -> alarmModelName.asInstanceOf[js.Any]
      )

      alarmModelVersion.foreach(__v => __obj.updateDynamic("alarmModelVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlarmModelRequest]
    }
  }

  @js.native
  trait DescribeAlarmModelResponse extends js.Object {
    var alarmCapabilities: js.UndefOr[AlarmCapabilities]
    var alarmEventActions: js.UndefOr[AlarmEventActions]
    var alarmModelArn: js.UndefOr[AlarmModelArn]
    var alarmModelDescription: js.UndefOr[AlarmModelDescription]
    var alarmModelName: js.UndefOr[AlarmModelName]
    var alarmModelVersion: js.UndefOr[AlarmModelVersion]
    var alarmNotification: js.UndefOr[AlarmNotification]
    var alarmRule: js.UndefOr[AlarmRule]
    var creationTime: js.UndefOr[Timestamp]
    var key: js.UndefOr[AttributeJsonPath]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[AmazonResourceName]
    var severity: js.UndefOr[Severity]
    var status: js.UndefOr[AlarmModelVersionStatus]
    var statusMessage: js.UndefOr[StatusMessage]
  }

  object DescribeAlarmModelResponse {
    @inline
    def apply(
        alarmCapabilities: js.UndefOr[AlarmCapabilities] = js.undefined,
        alarmEventActions: js.UndefOr[AlarmEventActions] = js.undefined,
        alarmModelArn: js.UndefOr[AlarmModelArn] = js.undefined,
        alarmModelDescription: js.UndefOr[AlarmModelDescription] = js.undefined,
        alarmModelName: js.UndefOr[AlarmModelName] = js.undefined,
        alarmModelVersion: js.UndefOr[AlarmModelVersion] = js.undefined,
        alarmNotification: js.UndefOr[AlarmNotification] = js.undefined,
        alarmRule: js.UndefOr[AlarmRule] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        key: js.UndefOr[AttributeJsonPath] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        roleArn: js.UndefOr[AmazonResourceName] = js.undefined,
        severity: js.UndefOr[Severity] = js.undefined,
        status: js.UndefOr[AlarmModelVersionStatus] = js.undefined,
        statusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): DescribeAlarmModelResponse = {
      val __obj = js.Dynamic.literal()
      alarmCapabilities.foreach(__v => __obj.updateDynamic("alarmCapabilities")(__v.asInstanceOf[js.Any]))
      alarmEventActions.foreach(__v => __obj.updateDynamic("alarmEventActions")(__v.asInstanceOf[js.Any]))
      alarmModelArn.foreach(__v => __obj.updateDynamic("alarmModelArn")(__v.asInstanceOf[js.Any]))
      alarmModelDescription.foreach(__v => __obj.updateDynamic("alarmModelDescription")(__v.asInstanceOf[js.Any]))
      alarmModelName.foreach(__v => __obj.updateDynamic("alarmModelName")(__v.asInstanceOf[js.Any]))
      alarmModelVersion.foreach(__v => __obj.updateDynamic("alarmModelVersion")(__v.asInstanceOf[js.Any]))
      alarmNotification.foreach(__v => __obj.updateDynamic("alarmNotification")(__v.asInstanceOf[js.Any]))
      alarmRule.foreach(__v => __obj.updateDynamic("alarmRule")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      severity.foreach(__v => __obj.updateDynamic("severity")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlarmModelResponse]
    }
  }

  @js.native
  trait DescribeDetectorModelAnalysisRequest extends js.Object {
    var analysisId: AnalysisId
  }

  object DescribeDetectorModelAnalysisRequest {
    @inline
    def apply(
        analysisId: AnalysisId
    ): DescribeDetectorModelAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "analysisId" -> analysisId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDetectorModelAnalysisRequest]
    }
  }

  @js.native
  trait DescribeDetectorModelAnalysisResponse extends js.Object {
    var status: js.UndefOr[AnalysisStatus]
  }

  object DescribeDetectorModelAnalysisResponse {
    @inline
    def apply(
        status: js.UndefOr[AnalysisStatus] = js.undefined
    ): DescribeDetectorModelAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectorModelAnalysisResponse]
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
  trait DescribeLoggingOptionsRequest extends js.Object

  object DescribeLoggingOptionsRequest {
    @inline
    def apply(): DescribeLoggingOptionsRequest = {
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

  /** The detector model and the specific detectors (instances) for which the logging level is given.
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

  /** Information about the detector model.
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

  /** Information about how the detector model is configured.
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

  /** Information that defines how a detector operates.
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

  /** Information about the detector model.
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

  /** Information about the detector model version.
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

  /** Defines an action to write to the Amazon DynamoDB table that you created. The standard action payload contains all the information about the detector model instance and the event that triggered the action. You can customize the [[https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html|payload]]. One column of the DynamoDB table receives all attribute-value pairs in the payload that you specify. You must use expressions for all parameters in <code>DynamoDBAction</code>. The expressions accept literals, operators, functions, references, and substitution templates. <p class="title"> ```Examples``` </p>* For literal values, the expressions must contain single quotes. For example, the value for the <code>hashKeyType</code> parameter can be <code>'STRING'</code>. * For references, you must specify either variables or input values. For example, the value for the <code>hashKeyField</code> parameter can be <code>input.GreenhouseInput.name</code>. * For a substitution
    * template, you must use <code>{}</code>, and the template must be in single quotes. A substitution template can also contain a combination of literals, operators, functions, references, and substitution templates. In the following example, the value for the <code>hashKeyValue</code> parameter uses a substitution template. <code>'{input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'</code> * For a string concatenation, you must use <code>+</code>. A string concatenation can also contain a combination of literals, operators, functions, references, and substitution templates. In the following example, the value for the <code>tableName</code> parameter uses a string concatenation. <code>'GreenhouseTemperatureTable ' + input.GreenhouseInput.date</code> For more information, see [[https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html|Expressions]] in the <i>AWS IoT Events Developer Guide</i>. If the defined payload type is a string,
    * <code>DynamoDBAction</code> writes non-JSON data to the DynamoDB table as binary data. The DynamoDB console displays the data as Base64-encoded text. The value for the <code>payloadField</code> parameter is <code>&lt;payload-field&gt;_raw</code>.
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

  /** Defines an action to write to the Amazon DynamoDB table that you created. The default action payload contains all the information about the detector model instance and the event that triggered the action. You can customize the [[https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html|payload]]. A separate column of the DynamoDB table receives one attribute-value pair in the payload that you specify. You must use expressions for all parameters in <code>DynamoDBv2Action</code>. The expressions accept literals, operators, functions, references, and substitution templates. <p class="title"> ```Examples``` </p>* For literal values, the expressions must contain single quotes. For example, the value for the <code>tableName</code> parameter can be <code>'GreenhouseTemperatureTable'</code>. * For references, you must specify either variables or input values. For example, the value for the <code>tableName</code> parameter can be <code>variable.ddbtableName</code>. * For
    * a substitution template, you must use <code>{}</code>, and the template must be in single quotes. A substitution template can also contain a combination of literals, operators, functions, references, and substitution templates. In the following example, the value for the <code>contentExpression</code> parameter in <code>Payload</code> uses a substitution template. <code>'{"sensorID": "{input.GreenhouseInput.sensor_id}", "temperature": "{input.GreenhouseInput.temperature * 9 / 5 + 32}"}'</code> * For a string concatenation, you must use <code>+</code>. A string concatenation can also contain a combination of literals, operators, functions, references, and substitution templates. In the following example, the value for the <code>tableName</code> parameter uses a string concatenation. <code>'GreenhouseTemperatureTable ' + input.GreenhouseInput.date</code> For more information, see [[https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html|Expressions]]
    * in the <i>AWS IoT Events Developer Guide</i>. The value for the <code>type</code> parameter in <code>Payload</code> must be <code>JSON</code>.
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

  /** Contains the configuration information of email notifications.
    */
  @js.native
  trait EmailConfiguration extends js.Object {
    var from: FromEmail
    var recipients: EmailRecipients
    var content: js.UndefOr[EmailContent]
  }

  object EmailConfiguration {
    @inline
    def apply(
        from: FromEmail,
        recipients: EmailRecipients,
        content: js.UndefOr[EmailContent] = js.undefined
    ): EmailConfiguration = {
      val __obj = js.Dynamic.literal(
        "from" -> from.asInstanceOf[js.Any],
        "recipients" -> recipients.asInstanceOf[js.Any]
      )

      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailConfiguration]
    }
  }

  /** Contains the subject and message of an email.
    */
  @js.native
  trait EmailContent extends js.Object {
    var additionalMessage: js.UndefOr[NotificationAdditionalMessage]
    var subject: js.UndefOr[EmailSubject]
  }

  object EmailContent {
    @inline
    def apply(
        additionalMessage: js.UndefOr[NotificationAdditionalMessage] = js.undefined,
        subject: js.UndefOr[EmailSubject] = js.undefined
    ): EmailContent = {
      val __obj = js.Dynamic.literal()
      additionalMessage.foreach(__v => __obj.updateDynamic("additionalMessage")(__v.asInstanceOf[js.Any]))
      subject.foreach(__v => __obj.updateDynamic("subject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailContent]
    }
  }

  /** Contains the information of one or more recipients who receive the emails. <important> You must [[https://docs.aws.amazon.com/singlesignon/latest/userguide/addusers.html|add the users that receive emails to your AWS SSO store]]. </important>
    */
  @js.native
  trait EmailRecipients extends js.Object {
    var to: js.UndefOr[RecipientDetails]
  }

  object EmailRecipients {
    @inline
    def apply(
        to: js.UndefOr[RecipientDetails] = js.undefined
    ): EmailRecipients = {
      val __obj = js.Dynamic.literal()
      to.foreach(__v => __obj.updateDynamic("to")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailRecipients]
    }
  }

  /** Specifies the <code>actions</code> to be performed when the <code>condition</code> evaluates to TRUE.
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

  /** Sends information about the detector model instance and the event that triggered the action to an Amazon Kinesis Data Firehose delivery stream.
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

  @js.native
  trait GetDetectorModelAnalysisResultsRequest extends js.Object {
    var analysisId: AnalysisId
    var maxResults: js.UndefOr[MaxAnalysisResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetDetectorModelAnalysisResultsRequest {
    @inline
    def apply(
        analysisId: AnalysisId,
        maxResults: js.UndefOr[MaxAnalysisResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetDetectorModelAnalysisResultsRequest = {
      val __obj = js.Dynamic.literal(
        "analysisId" -> analysisId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDetectorModelAnalysisResultsRequest]
    }
  }

  @js.native
  trait GetDetectorModelAnalysisResultsResponse extends js.Object {
    var analysisResults: js.UndefOr[AnalysisResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetDetectorModelAnalysisResultsResponse {
    @inline
    def apply(
        analysisResults: js.UndefOr[AnalysisResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetDetectorModelAnalysisResultsResponse = {
      val __obj = js.Dynamic.literal()
      analysisResults.foreach(__v => __obj.updateDynamic("analysisResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDetectorModelAnalysisResultsResponse]
    }
  }

  /** Specifies the default alarm state. The configuration applies to all alarms that were created based on this alarm model.
    */
  @js.native
  trait InitializationConfiguration extends js.Object {
    var disabledOnInitialization: DisabledOnInitialization
  }

  object InitializationConfiguration {
    @inline
    def apply(
        disabledOnInitialization: DisabledOnInitialization
    ): InitializationConfiguration = {
      val __obj = js.Dynamic.literal(
        "disabledOnInitialization" -> disabledOnInitialization.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InitializationConfiguration]
    }
  }

  /** Information about the input.
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

  /** Information about the configuration of an input.
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

  /** The definition of the input.
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

  /** The identifer of the input.
    */
  @js.native
  trait InputIdentifier extends js.Object {
    var iotEventsInputIdentifier: js.UndefOr[IotEventsInputIdentifier]
    var iotSiteWiseInputIdentifier: js.UndefOr[IotSiteWiseInputIdentifier]
  }

  object InputIdentifier {
    @inline
    def apply(
        iotEventsInputIdentifier: js.UndefOr[IotEventsInputIdentifier] = js.undefined,
        iotSiteWiseInputIdentifier: js.UndefOr[IotSiteWiseInputIdentifier] = js.undefined
    ): InputIdentifier = {
      val __obj = js.Dynamic.literal()
      iotEventsInputIdentifier.foreach(__v => __obj.updateDynamic("iotEventsInputIdentifier")(__v.asInstanceOf[js.Any]))
      iotSiteWiseInputIdentifier.foreach(__v => __obj.updateDynamic("iotSiteWiseInputIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputIdentifier]
    }
  }

  /** Information about the input.
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

  /** Sends an AWS IoT Events input, passing in information about the detector model instance and the event that triggered the action.
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

  /** The identifier of the input routed to AWS IoT Events.
    */
  @js.native
  trait IotEventsInputIdentifier extends js.Object {
    var inputName: InputName
  }

  object IotEventsInputIdentifier {
    @inline
    def apply(
        inputName: InputName
    ): IotEventsInputIdentifier = {
      val __obj = js.Dynamic.literal(
        "inputName" -> inputName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IotEventsInputIdentifier]
    }
  }

  /** Sends information about the detector model instance and the event that triggered the action to a specified asset property in AWS IoT SiteWise. You must use expressions for all parameters in <code>IotSiteWiseAction</code>. The expressions accept literals, operators, functions, references, and substitutions templates. <p class="title"> ```Examples``` </p>* For literal values, the expressions must contain single quotes. For example, the value for the <code>propertyAlias</code> parameter can be <code>'/company/windfarm/3/turbine/7/temperature'</code>. * For references, you must specify either variables or input values. For example, the value for the <code>assetId</code> parameter can be <code>input.TurbineInput.assetId1</code>. * For a substitution template, you must use <code>{}</code>, and the template must be in single quotes. A substitution template can also contain a combination of literals, operators, functions, references, and substitution templates. In the following example,
    * the value for the <code>propertyAlias</code> parameter uses a substitution template. <code>'company/windfarm/{input.TemperatureInput.sensorData.windfarmID}/turbine/ {input.TemperatureInput.sensorData.turbineID}/temperature'</code> You must specify either <code>propertyAlias</code> or both <code>assetId</code> and <code>propertyId</code> to identify the target asset property in AWS IoT SiteWise. For more information, see [[https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html|Expressions]] in the <i>AWS IoT Events Developer Guide</i>.
    */
  @js.native
  trait IotSiteWiseAction extends js.Object {
    var assetId: js.UndefOr[AssetId]
    var entryId: js.UndefOr[AssetPropertyEntryId]
    var propertyAlias: js.UndefOr[AssetPropertyAlias]
    var propertyId: js.UndefOr[AssetPropertyId]
    var propertyValue: js.UndefOr[AssetPropertyValue]
  }

  object IotSiteWiseAction {
    @inline
    def apply(
        assetId: js.UndefOr[AssetId] = js.undefined,
        entryId: js.UndefOr[AssetPropertyEntryId] = js.undefined,
        propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined,
        propertyId: js.UndefOr[AssetPropertyId] = js.undefined,
        propertyValue: js.UndefOr[AssetPropertyValue] = js.undefined
    ): IotSiteWiseAction = {
      val __obj = js.Dynamic.literal()
      assetId.foreach(__v => __obj.updateDynamic("assetId")(__v.asInstanceOf[js.Any]))
      entryId.foreach(__v => __obj.updateDynamic("entryId")(__v.asInstanceOf[js.Any]))
      propertyAlias.foreach(__v => __obj.updateDynamic("propertyAlias")(__v.asInstanceOf[js.Any]))
      propertyId.foreach(__v => __obj.updateDynamic("propertyId")(__v.asInstanceOf[js.Any]))
      propertyValue.foreach(__v => __obj.updateDynamic("propertyValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IotSiteWiseAction]
    }
  }

  /** The asset model property identifer of the input routed from AWS IoT SiteWise.
    */
  @js.native
  trait IotSiteWiseAssetModelPropertyIdentifier extends js.Object {
    var assetModelId: AssetModelId
    var propertyId: AssetPropertyId
  }

  object IotSiteWiseAssetModelPropertyIdentifier {
    @inline
    def apply(
        assetModelId: AssetModelId,
        propertyId: AssetPropertyId
    ): IotSiteWiseAssetModelPropertyIdentifier = {
      val __obj = js.Dynamic.literal(
        "assetModelId" -> assetModelId.asInstanceOf[js.Any],
        "propertyId" -> propertyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IotSiteWiseAssetModelPropertyIdentifier]
    }
  }

  /** The identifer of the input routed from AWS IoT SiteWise.
    */
  @js.native
  trait IotSiteWiseInputIdentifier extends js.Object {
    var iotSiteWiseAssetModelPropertyIdentifier: js.UndefOr[IotSiteWiseAssetModelPropertyIdentifier]
  }

  object IotSiteWiseInputIdentifier {
    @inline
    def apply(
        iotSiteWiseAssetModelPropertyIdentifier: js.UndefOr[IotSiteWiseAssetModelPropertyIdentifier] = js.undefined
    ): IotSiteWiseInputIdentifier = {
      val __obj = js.Dynamic.literal()
      iotSiteWiseAssetModelPropertyIdentifier.foreach(__v => __obj.updateDynamic("iotSiteWiseAssetModelPropertyIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IotSiteWiseInputIdentifier]
    }
  }

  /** Information required to publish the MQTT message through the AWS IoT message broker.
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

  /** Calls a Lambda function, passing in information about the detector model instance and the event that triggered the action.
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
  trait ListAlarmModelVersionsRequest extends js.Object {
    var alarmModelName: AlarmModelName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAlarmModelVersionsRequest {
    @inline
    def apply(
        alarmModelName: AlarmModelName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAlarmModelVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "alarmModelName" -> alarmModelName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlarmModelVersionsRequest]
    }
  }

  @js.native
  trait ListAlarmModelVersionsResponse extends js.Object {
    var alarmModelVersionSummaries: js.UndefOr[AlarmModelVersionSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAlarmModelVersionsResponse {
    @inline
    def apply(
        alarmModelVersionSummaries: js.UndefOr[AlarmModelVersionSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAlarmModelVersionsResponse = {
      val __obj = js.Dynamic.literal()
      alarmModelVersionSummaries.foreach(__v => __obj.updateDynamic("alarmModelVersionSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlarmModelVersionsResponse]
    }
  }

  @js.native
  trait ListAlarmModelsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAlarmModelsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAlarmModelsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlarmModelsRequest]
    }
  }

  @js.native
  trait ListAlarmModelsResponse extends js.Object {
    var alarmModelSummaries: js.UndefOr[AlarmModelSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAlarmModelsResponse {
    @inline
    def apply(
        alarmModelSummaries: js.UndefOr[AlarmModelSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAlarmModelsResponse = {
      val __obj = js.Dynamic.literal()
      alarmModelSummaries.foreach(__v => __obj.updateDynamic("alarmModelSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlarmModelsResponse]
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
  trait ListInputRoutingsRequest extends js.Object {
    var inputIdentifier: InputIdentifier
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListInputRoutingsRequest {
    @inline
    def apply(
        inputIdentifier: InputIdentifier,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInputRoutingsRequest = {
      val __obj = js.Dynamic.literal(
        "inputIdentifier" -> inputIdentifier.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInputRoutingsRequest]
    }
  }

  @js.native
  trait ListInputRoutingsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var routedResources: js.UndefOr[RoutedResources]
  }

  object ListInputRoutingsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        routedResources: js.UndefOr[RoutedResources] = js.undefined
    ): ListInputRoutingsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      routedResources.foreach(__v => __obj.updateDynamic("routedResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInputRoutingsResponse]
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

  /** The values of the AWS IoT Events logging options.
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

  /** Contains the notification settings of an alarm model. The settings apply to all alarms that were created based on this alarm model.
    */
  @js.native
  trait NotificationAction extends js.Object {
    var action: NotificationTargetActions
    var emailConfigurations: js.UndefOr[EmailConfigurations]
    var smsConfigurations: js.UndefOr[SMSConfigurations]
  }

  object NotificationAction {
    @inline
    def apply(
        action: NotificationTargetActions,
        emailConfigurations: js.UndefOr[EmailConfigurations] = js.undefined,
        smsConfigurations: js.UndefOr[SMSConfigurations] = js.undefined
    ): NotificationAction = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any]
      )

      emailConfigurations.foreach(__v => __obj.updateDynamic("emailConfigurations")(__v.asInstanceOf[js.Any]))
      smsConfigurations.foreach(__v => __obj.updateDynamic("smsConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationAction]
    }
  }

  /** Specifies an AWS Lambda function to manage alarm notifications. You can create one or use the [[https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html|AWS Lambda function provided by AWS IoT Events]].
    */
  @js.native
  trait NotificationTargetActions extends js.Object {
    var lambdaAction: js.UndefOr[LambdaAction]
  }

  object NotificationTargetActions {
    @inline
    def apply(
        lambdaAction: js.UndefOr[LambdaAction] = js.undefined
    ): NotificationTargetActions = {
      val __obj = js.Dynamic.literal()
      lambdaAction.foreach(__v => __obj.updateDynamic("lambdaAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationTargetActions]
    }
  }

  /** When entering this state, perform these <code>actions</code> if the <code>condition</code> is TRUE.
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

  /** When exiting this state, perform these <code>actions</code> if the specified <code>condition</code> is <code>TRUE</code>.
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

  /** Specifies the actions performed when the <code>condition</code> evaluates to TRUE.
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

  /** Information needed to configure the payload. By default, AWS IoT Events generates a standard payload in JSON for any action. This action payload contains all attribute-value pairs that have the information about the detector model instance and the event triggered the action. To configure the action payload, you can use <code>contentExpression</code>.
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

  /** The information that identifies the recipient.
    */
  @js.native
  trait RecipientDetail extends js.Object {
    var ssoIdentity: js.UndefOr[SSOIdentity]
  }

  object RecipientDetail {
    @inline
    def apply(
        ssoIdentity: js.UndefOr[SSOIdentity] = js.undefined
    ): RecipientDetail = {
      val __obj = js.Dynamic.literal()
      ssoIdentity.foreach(__v => __obj.updateDynamic("ssoIdentity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecipientDetail]
    }
  }

  /** Information required to reset the timer. The timer is reset to the previously evaluated result of the duration. The duration expression isn't reevaluated when you reset the timer.
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

  /** Contains information about the routed resource.
    */
  @js.native
  trait RoutedResource extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[ResourceName]
  }

  object RoutedResource {
    @inline
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined
    ): RoutedResource = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoutedResource]
    }
  }

  /** Contains the configuration information of SMS notifications.
    */
  @js.native
  trait SMSConfiguration extends js.Object {
    var recipients: RecipientDetails
    var additionalMessage: js.UndefOr[NotificationAdditionalMessage]
    var senderId: js.UndefOr[SMSSenderId]
  }

  object SMSConfiguration {
    @inline
    def apply(
        recipients: RecipientDetails,
        additionalMessage: js.UndefOr[NotificationAdditionalMessage] = js.undefined,
        senderId: js.UndefOr[SMSSenderId] = js.undefined
    ): SMSConfiguration = {
      val __obj = js.Dynamic.literal(
        "recipients" -> recipients.asInstanceOf[js.Any]
      )

      additionalMessage.foreach(__v => __obj.updateDynamic("additionalMessage")(__v.asInstanceOf[js.Any]))
      senderId.foreach(__v => __obj.updateDynamic("senderId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SMSConfiguration]
    }
  }

  /** Information required to publish the Amazon SNS message.
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

  /** Contains information about your identity source in AWS Single Sign-On. For more information, see the [[https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html|AWS Single Sign-On User Guide]].
    */
  @js.native
  trait SSOIdentity extends js.Object {
    var identityStoreId: IdentityStoreId
    var userId: js.UndefOr[SSOReferenceId]
  }

  object SSOIdentity {
    @inline
    def apply(
        identityStoreId: IdentityStoreId,
        userId: js.UndefOr[SSOReferenceId] = js.undefined
    ): SSOIdentity = {
      val __obj = js.Dynamic.literal(
        "identityStoreId" -> identityStoreId.asInstanceOf[js.Any]
      )

      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SSOIdentity]
    }
  }

  /** Information needed to set the timer.
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

  /** Information about the variable and its new value.
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

  /** A rule that compares an input property value to a threshold value with a comparison operator.
    */
  @js.native
  trait SimpleRule extends js.Object {
    var comparisonOperator: ComparisonOperator
    var inputProperty: InputProperty
    var threshold: Threshold
  }

  object SimpleRule {
    @inline
    def apply(
        comparisonOperator: ComparisonOperator,
        inputProperty: InputProperty,
        threshold: Threshold
    ): SimpleRule = {
      val __obj = js.Dynamic.literal(
        "comparisonOperator" -> comparisonOperator.asInstanceOf[js.Any],
        "inputProperty" -> inputProperty.asInstanceOf[js.Any],
        "threshold" -> threshold.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SimpleRule]
    }
  }

  /** Sends information about the detector model instance and the event that triggered the action to an Amazon SQS queue.
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

  @js.native
  trait StartDetectorModelAnalysisRequest extends js.Object {
    var detectorModelDefinition: DetectorModelDefinition
  }

  object StartDetectorModelAnalysisRequest {
    @inline
    def apply(
        detectorModelDefinition: DetectorModelDefinition
    ): StartDetectorModelAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "detectorModelDefinition" -> detectorModelDefinition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartDetectorModelAnalysisRequest]
    }
  }

  @js.native
  trait StartDetectorModelAnalysisResponse extends js.Object {
    var analysisId: js.UndefOr[AnalysisId]
  }

  object StartDetectorModelAnalysisResponse {
    @inline
    def apply(
        analysisId: js.UndefOr[AnalysisId] = js.undefined
    ): StartDetectorModelAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      analysisId.foreach(__v => __obj.updateDynamic("analysisId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDetectorModelAnalysisResponse]
    }
  }

  /** Information that defines a state of a detector.
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

  /** Metadata that can be used to manage the resource.
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
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** Specifies the actions performed and the next state entered when a <code>condition</code> evaluates to TRUE.
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
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateAlarmModelRequest extends js.Object {
    var alarmModelName: AlarmModelName
    var alarmRule: AlarmRule
    var roleArn: AmazonResourceName
    var alarmCapabilities: js.UndefOr[AlarmCapabilities]
    var alarmEventActions: js.UndefOr[AlarmEventActions]
    var alarmModelDescription: js.UndefOr[AlarmModelDescription]
    var alarmNotification: js.UndefOr[AlarmNotification]
    var severity: js.UndefOr[Severity]
  }

  object UpdateAlarmModelRequest {
    @inline
    def apply(
        alarmModelName: AlarmModelName,
        alarmRule: AlarmRule,
        roleArn: AmazonResourceName,
        alarmCapabilities: js.UndefOr[AlarmCapabilities] = js.undefined,
        alarmEventActions: js.UndefOr[AlarmEventActions] = js.undefined,
        alarmModelDescription: js.UndefOr[AlarmModelDescription] = js.undefined,
        alarmNotification: js.UndefOr[AlarmNotification] = js.undefined,
        severity: js.UndefOr[Severity] = js.undefined
    ): UpdateAlarmModelRequest = {
      val __obj = js.Dynamic.literal(
        "alarmModelName" -> alarmModelName.asInstanceOf[js.Any],
        "alarmRule" -> alarmRule.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      alarmCapabilities.foreach(__v => __obj.updateDynamic("alarmCapabilities")(__v.asInstanceOf[js.Any]))
      alarmEventActions.foreach(__v => __obj.updateDynamic("alarmEventActions")(__v.asInstanceOf[js.Any]))
      alarmModelDescription.foreach(__v => __obj.updateDynamic("alarmModelDescription")(__v.asInstanceOf[js.Any]))
      alarmNotification.foreach(__v => __obj.updateDynamic("alarmNotification")(__v.asInstanceOf[js.Any]))
      severity.foreach(__v => __obj.updateDynamic("severity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAlarmModelRequest]
    }
  }

  @js.native
  trait UpdateAlarmModelResponse extends js.Object {
    var alarmModelArn: js.UndefOr[AlarmModelArn]
    var alarmModelVersion: js.UndefOr[AlarmModelVersion]
    var creationTime: js.UndefOr[Timestamp]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[AlarmModelVersionStatus]
  }

  object UpdateAlarmModelResponse {
    @inline
    def apply(
        alarmModelArn: js.UndefOr[AlarmModelArn] = js.undefined,
        alarmModelVersion: js.UndefOr[AlarmModelVersion] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[AlarmModelVersionStatus] = js.undefined
    ): UpdateAlarmModelResponse = {
      val __obj = js.Dynamic.literal()
      alarmModelArn.foreach(__v => __obj.updateDynamic("alarmModelArn")(__v.asInstanceOf[js.Any]))
      alarmModelVersion.foreach(__v => __obj.updateDynamic("alarmModelVersion")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAlarmModelResponse]
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
