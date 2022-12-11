package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object ioteventsdata {
  type AcknowledgeAlarmActionRequests = js.Array[AcknowledgeAlarmActionRequest]
  type AlarmModelName = String
  type AlarmModelVersion = String
  type AlarmSummaries = js.Array[AlarmSummary]
  type BatchAlarmActionErrorEntries = js.Array[BatchAlarmActionErrorEntry]
  type BatchDeleteDetectorErrorEntries = js.Array[BatchDeleteDetectorErrorEntry]
  type BatchPutMessageErrorEntries = js.Array[BatchPutMessageErrorEntry]
  type BatchUpdateDetectorErrorEntries = js.Array[BatchUpdateDetectorErrorEntry]
  type DeleteDetectorRequests = js.Array[DeleteDetectorRequest]
  type DetectorModelName = String
  type DetectorModelVersion = String
  type DetectorSummaries = js.Array[DetectorSummary]
  type DisableAlarmActionRequests = js.Array[DisableAlarmActionRequest]
  type EnableAlarmActionRequests = js.Array[EnableAlarmActionRequest]
  type EphemeralInputName = String
  type EpochMilliTimestamp = Double
  type ErrorMessage = String
  type InputPropertyValue = String
  type KeyValue = String
  type MaxResults = Int
  type MessageId = String
  type Messages = js.Array[Message]
  type NextToken = String
  type Note = String
  type Payload = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type RequestId = String
  type ResetAlarmActionRequests = js.Array[ResetAlarmActionRequest]
  type Seconds = Int
  type Severity = Int
  type SnoozeAlarmActionRequests = js.Array[SnoozeAlarmActionRequest]
  type SnoozeDuration = Int
  type StateName = String
  type ThresholdValue = String
  type TimerDefinitions = js.Array[TimerDefinition]
  type TimerName = String
  type Timers = js.Array[Timer]
  type Timestamp = js.Date
  type UpdateDetectorRequests = js.Array[UpdateDetectorRequest]
  type VariableDefinitions = js.Array[VariableDefinition]
  type VariableName = String
  type VariableValue = String
  type Variables = js.Array[Variable]

  final class IoTEventsDataOps(private val service: IoTEventsData) extends AnyVal {

    @inline def batchAcknowledgeAlarmFuture(params: BatchAcknowledgeAlarmRequest): Future[BatchAcknowledgeAlarmResponse] = service.batchAcknowledgeAlarm(params).promise().toFuture
    @inline def batchDeleteDetectorFuture(params: BatchDeleteDetectorRequest): Future[BatchDeleteDetectorResponse] = service.batchDeleteDetector(params).promise().toFuture
    @inline def batchDisableAlarmFuture(params: BatchDisableAlarmRequest): Future[BatchDisableAlarmResponse] = service.batchDisableAlarm(params).promise().toFuture
    @inline def batchEnableAlarmFuture(params: BatchEnableAlarmRequest): Future[BatchEnableAlarmResponse] = service.batchEnableAlarm(params).promise().toFuture
    @inline def batchPutMessageFuture(params: BatchPutMessageRequest): Future[BatchPutMessageResponse] = service.batchPutMessage(params).promise().toFuture
    @inline def batchResetAlarmFuture(params: BatchResetAlarmRequest): Future[BatchResetAlarmResponse] = service.batchResetAlarm(params).promise().toFuture
    @inline def batchSnoozeAlarmFuture(params: BatchSnoozeAlarmRequest): Future[BatchSnoozeAlarmResponse] = service.batchSnoozeAlarm(params).promise().toFuture
    @inline def batchUpdateDetectorFuture(params: BatchUpdateDetectorRequest): Future[BatchUpdateDetectorResponse] = service.batchUpdateDetector(params).promise().toFuture
    @inline def describeAlarmFuture(params: DescribeAlarmRequest): Future[DescribeAlarmResponse] = service.describeAlarm(params).promise().toFuture
    @inline def describeDetectorFuture(params: DescribeDetectorRequest): Future[DescribeDetectorResponse] = service.describeDetector(params).promise().toFuture
    @inline def listAlarmsFuture(params: ListAlarmsRequest): Future[ListAlarmsResponse] = service.listAlarms(params).promise().toFuture
    @inline def listDetectorsFuture(params: ListDetectorsRequest): Future[ListDetectorsResponse] = service.listDetectors(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ioteventsdata", JSImport.Namespace, "AWS.IoTEventsData")
  class IoTEventsData() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchAcknowledgeAlarm(params: BatchAcknowledgeAlarmRequest): Request[BatchAcknowledgeAlarmResponse] = js.native
    def batchDeleteDetector(params: BatchDeleteDetectorRequest): Request[BatchDeleteDetectorResponse] = js.native
    def batchDisableAlarm(params: BatchDisableAlarmRequest): Request[BatchDisableAlarmResponse] = js.native
    def batchEnableAlarm(params: BatchEnableAlarmRequest): Request[BatchEnableAlarmResponse] = js.native
    def batchPutMessage(params: BatchPutMessageRequest): Request[BatchPutMessageResponse] = js.native
    def batchResetAlarm(params: BatchResetAlarmRequest): Request[BatchResetAlarmResponse] = js.native
    def batchSnoozeAlarm(params: BatchSnoozeAlarmRequest): Request[BatchSnoozeAlarmResponse] = js.native
    def batchUpdateDetector(params: BatchUpdateDetectorRequest): Request[BatchUpdateDetectorResponse] = js.native
    def describeAlarm(params: DescribeAlarmRequest): Request[DescribeAlarmResponse] = js.native
    def describeDetector(params: DescribeDetectorRequest): Request[DescribeDetectorResponse] = js.native
    def listAlarms(params: ListAlarmsRequest): Request[ListAlarmsResponse] = js.native
    def listDetectors(params: ListDetectorsRequest): Request[ListDetectorsResponse] = js.native
  }
  object IoTEventsData {
    @inline implicit def toOps(service: IoTEventsData): IoTEventsDataOps = {
      new IoTEventsDataOps(service)
    }
  }

  /** Contains the configuration information of an acknowledge action.
    */
  @js.native
  trait AcknowledgeActionConfiguration extends js.Object {
    var note: js.UndefOr[Note]
  }

  object AcknowledgeActionConfiguration {
    @inline
    def apply(
        note: js.UndefOr[Note] = js.undefined
    ): AcknowledgeActionConfiguration = {
      val __obj = js.Dynamic.literal()
      note.foreach(__v => __obj.updateDynamic("note")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcknowledgeActionConfiguration]
    }
  }

  /** Information needed to acknowledge the alarm.
    */
  @js.native
  trait AcknowledgeAlarmActionRequest extends js.Object {
    var alarmModelName: AlarmModelName
    var requestId: RequestId
    var keyValue: js.UndefOr[KeyValue]
    var note: js.UndefOr[Note]
  }

  object AcknowledgeAlarmActionRequest {
    @inline
    def apply(
        alarmModelName: AlarmModelName,
        requestId: RequestId,
        keyValue: js.UndefOr[KeyValue] = js.undefined,
        note: js.UndefOr[Note] = js.undefined
    ): AcknowledgeAlarmActionRequest = {
      val __obj = js.Dynamic.literal(
        "alarmModelName" -> alarmModelName.asInstanceOf[js.Any],
        "requestId" -> requestId.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      note.foreach(__v => __obj.updateDynamic("note")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcknowledgeAlarmActionRequest]
    }
  }

  /** Contains information about an alarm.
    */
  @js.native
  trait Alarm extends js.Object {
    var alarmModelName: js.UndefOr[AlarmModelName]
    var alarmModelVersion: js.UndefOr[AlarmModelVersion]
    var alarmState: js.UndefOr[AlarmState]
    var creationTime: js.UndefOr[Timestamp]
    var keyValue: js.UndefOr[KeyValue]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var severity: js.UndefOr[Severity]
  }

  object Alarm {
    @inline
    def apply(
        alarmModelName: js.UndefOr[AlarmModelName] = js.undefined,
        alarmModelVersion: js.UndefOr[AlarmModelVersion] = js.undefined,
        alarmState: js.UndefOr[AlarmState] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        keyValue: js.UndefOr[KeyValue] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        severity: js.UndefOr[Severity] = js.undefined
    ): Alarm = {
      val __obj = js.Dynamic.literal()
      alarmModelName.foreach(__v => __obj.updateDynamic("alarmModelName")(__v.asInstanceOf[js.Any]))
      alarmModelVersion.foreach(__v => __obj.updateDynamic("alarmModelVersion")(__v.asInstanceOf[js.Any]))
      alarmState.foreach(__v => __obj.updateDynamic("alarmState")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      severity.foreach(__v => __obj.updateDynamic("severity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Alarm]
    }
  }

  /** Contains information about the current state of the alarm.
    */
  @js.native
  trait AlarmState extends js.Object {
    var customerAction: js.UndefOr[CustomerAction]
    var ruleEvaluation: js.UndefOr[RuleEvaluation]
    var stateName: js.UndefOr[AlarmStateName]
    var systemEvent: js.UndefOr[SystemEvent]
  }

  object AlarmState {
    @inline
    def apply(
        customerAction: js.UndefOr[CustomerAction] = js.undefined,
        ruleEvaluation: js.UndefOr[RuleEvaluation] = js.undefined,
        stateName: js.UndefOr[AlarmStateName] = js.undefined,
        systemEvent: js.UndefOr[SystemEvent] = js.undefined
    ): AlarmState = {
      val __obj = js.Dynamic.literal()
      customerAction.foreach(__v => __obj.updateDynamic("customerAction")(__v.asInstanceOf[js.Any]))
      ruleEvaluation.foreach(__v => __obj.updateDynamic("ruleEvaluation")(__v.asInstanceOf[js.Any]))
      stateName.foreach(__v => __obj.updateDynamic("stateName")(__v.asInstanceOf[js.Any]))
      systemEvent.foreach(__v => __obj.updateDynamic("systemEvent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlarmState]
    }
  }

  /** Contains a summary of an alarm.
    */
  @js.native
  trait AlarmSummary extends js.Object {
    var alarmModelName: js.UndefOr[AlarmModelName]
    var alarmModelVersion: js.UndefOr[AlarmModelVersion]
    var creationTime: js.UndefOr[Timestamp]
    var keyValue: js.UndefOr[KeyValue]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var stateName: js.UndefOr[AlarmStateName]
  }

  object AlarmSummary {
    @inline
    def apply(
        alarmModelName: js.UndefOr[AlarmModelName] = js.undefined,
        alarmModelVersion: js.UndefOr[AlarmModelVersion] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        keyValue: js.UndefOr[KeyValue] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        stateName: js.UndefOr[AlarmStateName] = js.undefined
    ): AlarmSummary = {
      val __obj = js.Dynamic.literal()
      alarmModelName.foreach(__v => __obj.updateDynamic("alarmModelName")(__v.asInstanceOf[js.Any]))
      alarmModelVersion.foreach(__v => __obj.updateDynamic("alarmModelVersion")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      stateName.foreach(__v => __obj.updateDynamic("stateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlarmSummary]
    }
  }

  @js.native
  trait BatchAcknowledgeAlarmRequest extends js.Object {
    var acknowledgeActionRequests: AcknowledgeAlarmActionRequests
  }

  object BatchAcknowledgeAlarmRequest {
    @inline
    def apply(
        acknowledgeActionRequests: AcknowledgeAlarmActionRequests
    ): BatchAcknowledgeAlarmRequest = {
      val __obj = js.Dynamic.literal(
        "acknowledgeActionRequests" -> acknowledgeActionRequests.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchAcknowledgeAlarmRequest]
    }
  }

  @js.native
  trait BatchAcknowledgeAlarmResponse extends js.Object {
    var errorEntries: js.UndefOr[BatchAlarmActionErrorEntries]
  }

  object BatchAcknowledgeAlarmResponse {
    @inline
    def apply(
        errorEntries: js.UndefOr[BatchAlarmActionErrorEntries] = js.undefined
    ): BatchAcknowledgeAlarmResponse = {
      val __obj = js.Dynamic.literal()
      errorEntries.foreach(__v => __obj.updateDynamic("errorEntries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAcknowledgeAlarmResponse]
    }
  }

  /** Contains error messages associated with one of the following requests: * [[https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchAcknowledgeAlarm.html|BatchAcknowledgeAlarm]] * [[https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchDisableAlarm.html|BatchDisableAlarm]] * [[https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchEnableAlarm.html|BatchEnableAlarm]] * [[https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchResetAlarm.html|BatchResetAlarm]] * [[https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchSnoozeAlarm.html|BatchSnoozeAlarm]]
    */
  @js.native
  trait BatchAlarmActionErrorEntry extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var requestId: js.UndefOr[RequestId]
  }

  object BatchAlarmActionErrorEntry {
    @inline
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        requestId: js.UndefOr[RequestId] = js.undefined
    ): BatchAlarmActionErrorEntry = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAlarmActionErrorEntry]
    }
  }

  /** Contains error messages associated with the deletion request.
    */
  @js.native
  trait BatchDeleteDetectorErrorEntry extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var messageId: js.UndefOr[MessageId]
  }

  object BatchDeleteDetectorErrorEntry {
    @inline
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        messageId: js.UndefOr[MessageId] = js.undefined
    ): BatchDeleteDetectorErrorEntry = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      messageId.foreach(__v => __obj.updateDynamic("messageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteDetectorErrorEntry]
    }
  }

  @js.native
  trait BatchDeleteDetectorRequest extends js.Object {
    var detectors: DeleteDetectorRequests
  }

  object BatchDeleteDetectorRequest {
    @inline
    def apply(
        detectors: DeleteDetectorRequests
    ): BatchDeleteDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "detectors" -> detectors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeleteDetectorRequest]
    }
  }

  @js.native
  trait BatchDeleteDetectorResponse extends js.Object {
    var batchDeleteDetectorErrorEntries: js.UndefOr[BatchDeleteDetectorErrorEntries]
  }

  object BatchDeleteDetectorResponse {
    @inline
    def apply(
        batchDeleteDetectorErrorEntries: js.UndefOr[BatchDeleteDetectorErrorEntries] = js.undefined
    ): BatchDeleteDetectorResponse = {
      val __obj = js.Dynamic.literal()
      batchDeleteDetectorErrorEntries.foreach(__v => __obj.updateDynamic("batchDeleteDetectorErrorEntries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteDetectorResponse]
    }
  }

  @js.native
  trait BatchDisableAlarmRequest extends js.Object {
    var disableActionRequests: DisableAlarmActionRequests
  }

  object BatchDisableAlarmRequest {
    @inline
    def apply(
        disableActionRequests: DisableAlarmActionRequests
    ): BatchDisableAlarmRequest = {
      val __obj = js.Dynamic.literal(
        "disableActionRequests" -> disableActionRequests.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDisableAlarmRequest]
    }
  }

  @js.native
  trait BatchDisableAlarmResponse extends js.Object {
    var errorEntries: js.UndefOr[BatchAlarmActionErrorEntries]
  }

  object BatchDisableAlarmResponse {
    @inline
    def apply(
        errorEntries: js.UndefOr[BatchAlarmActionErrorEntries] = js.undefined
    ): BatchDisableAlarmResponse = {
      val __obj = js.Dynamic.literal()
      errorEntries.foreach(__v => __obj.updateDynamic("errorEntries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisableAlarmResponse]
    }
  }

  @js.native
  trait BatchEnableAlarmRequest extends js.Object {
    var enableActionRequests: EnableAlarmActionRequests
  }

  object BatchEnableAlarmRequest {
    @inline
    def apply(
        enableActionRequests: EnableAlarmActionRequests
    ): BatchEnableAlarmRequest = {
      val __obj = js.Dynamic.literal(
        "enableActionRequests" -> enableActionRequests.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchEnableAlarmRequest]
    }
  }

  @js.native
  trait BatchEnableAlarmResponse extends js.Object {
    var errorEntries: js.UndefOr[BatchAlarmActionErrorEntries]
  }

  object BatchEnableAlarmResponse {
    @inline
    def apply(
        errorEntries: js.UndefOr[BatchAlarmActionErrorEntries] = js.undefined
    ): BatchEnableAlarmResponse = {
      val __obj = js.Dynamic.literal()
      errorEntries.foreach(__v => __obj.updateDynamic("errorEntries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchEnableAlarmResponse]
    }
  }

  /** Contains information about the errors encountered.
    */
  @js.native
  trait BatchPutMessageErrorEntry extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var messageId: js.UndefOr[MessageId]
  }

  object BatchPutMessageErrorEntry {
    @inline
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        messageId: js.UndefOr[MessageId] = js.undefined
    ): BatchPutMessageErrorEntry = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      messageId.foreach(__v => __obj.updateDynamic("messageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPutMessageErrorEntry]
    }
  }

  @js.native
  trait BatchPutMessageRequest extends js.Object {
    var messages: Messages
  }

  object BatchPutMessageRequest {
    @inline
    def apply(
        messages: Messages
    ): BatchPutMessageRequest = {
      val __obj = js.Dynamic.literal(
        "messages" -> messages.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutMessageRequest]
    }
  }

  @js.native
  trait BatchPutMessageResponse extends js.Object {
    var BatchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries]
  }

  object BatchPutMessageResponse {
    @inline
    def apply(
        BatchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries] = js.undefined
    ): BatchPutMessageResponse = {
      val __obj = js.Dynamic.literal()
      BatchPutMessageErrorEntries.foreach(__v => __obj.updateDynamic("BatchPutMessageErrorEntries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPutMessageResponse]
    }
  }

  @js.native
  trait BatchResetAlarmRequest extends js.Object {
    var resetActionRequests: ResetAlarmActionRequests
  }

  object BatchResetAlarmRequest {
    @inline
    def apply(
        resetActionRequests: ResetAlarmActionRequests
    ): BatchResetAlarmRequest = {
      val __obj = js.Dynamic.literal(
        "resetActionRequests" -> resetActionRequests.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchResetAlarmRequest]
    }
  }

  @js.native
  trait BatchResetAlarmResponse extends js.Object {
    var errorEntries: js.UndefOr[BatchAlarmActionErrorEntries]
  }

  object BatchResetAlarmResponse {
    @inline
    def apply(
        errorEntries: js.UndefOr[BatchAlarmActionErrorEntries] = js.undefined
    ): BatchResetAlarmResponse = {
      val __obj = js.Dynamic.literal()
      errorEntries.foreach(__v => __obj.updateDynamic("errorEntries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchResetAlarmResponse]
    }
  }

  @js.native
  trait BatchSnoozeAlarmRequest extends js.Object {
    var snoozeActionRequests: SnoozeAlarmActionRequests
  }

  object BatchSnoozeAlarmRequest {
    @inline
    def apply(
        snoozeActionRequests: SnoozeAlarmActionRequests
    ): BatchSnoozeAlarmRequest = {
      val __obj = js.Dynamic.literal(
        "snoozeActionRequests" -> snoozeActionRequests.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchSnoozeAlarmRequest]
    }
  }

  @js.native
  trait BatchSnoozeAlarmResponse extends js.Object {
    var errorEntries: js.UndefOr[BatchAlarmActionErrorEntries]
  }

  object BatchSnoozeAlarmResponse {
    @inline
    def apply(
        errorEntries: js.UndefOr[BatchAlarmActionErrorEntries] = js.undefined
    ): BatchSnoozeAlarmResponse = {
      val __obj = js.Dynamic.literal()
      errorEntries.foreach(__v => __obj.updateDynamic("errorEntries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchSnoozeAlarmResponse]
    }
  }

  /** Information about the error that occurred when attempting to update a detector.
    */
  @js.native
  trait BatchUpdateDetectorErrorEntry extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var messageId: js.UndefOr[MessageId]
  }

  object BatchUpdateDetectorErrorEntry {
    @inline
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        messageId: js.UndefOr[MessageId] = js.undefined
    ): BatchUpdateDetectorErrorEntry = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      messageId.foreach(__v => __obj.updateDynamic("messageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateDetectorErrorEntry]
    }
  }

  @js.native
  trait BatchUpdateDetectorRequest extends js.Object {
    var detectors: UpdateDetectorRequests
  }

  object BatchUpdateDetectorRequest {
    @inline
    def apply(
        detectors: UpdateDetectorRequests
    ): BatchUpdateDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "detectors" -> detectors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUpdateDetectorRequest]
    }
  }

  @js.native
  trait BatchUpdateDetectorResponse extends js.Object {
    var batchUpdateDetectorErrorEntries: js.UndefOr[BatchUpdateDetectorErrorEntries]
  }

  object BatchUpdateDetectorResponse {
    @inline
    def apply(
        batchUpdateDetectorErrorEntries: js.UndefOr[BatchUpdateDetectorErrorEntries] = js.undefined
    ): BatchUpdateDetectorResponse = {
      val __obj = js.Dynamic.literal()
      batchUpdateDetectorErrorEntries.foreach(__v => __obj.updateDynamic("batchUpdateDetectorErrorEntries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateDetectorResponse]
    }
  }

  /** Contains information about the action that you can take to respond to the alarm.
    */
  @js.native
  trait CustomerAction extends js.Object {
    var acknowledgeActionConfiguration: js.UndefOr[AcknowledgeActionConfiguration]
    var actionName: js.UndefOr[CustomerActionName]
    var disableActionConfiguration: js.UndefOr[DisableActionConfiguration]
    var enableActionConfiguration: js.UndefOr[EnableActionConfiguration]
    var resetActionConfiguration: js.UndefOr[ResetActionConfiguration]
    var snoozeActionConfiguration: js.UndefOr[SnoozeActionConfiguration]
  }

  object CustomerAction {
    @inline
    def apply(
        acknowledgeActionConfiguration: js.UndefOr[AcknowledgeActionConfiguration] = js.undefined,
        actionName: js.UndefOr[CustomerActionName] = js.undefined,
        disableActionConfiguration: js.UndefOr[DisableActionConfiguration] = js.undefined,
        enableActionConfiguration: js.UndefOr[EnableActionConfiguration] = js.undefined,
        resetActionConfiguration: js.UndefOr[ResetActionConfiguration] = js.undefined,
        snoozeActionConfiguration: js.UndefOr[SnoozeActionConfiguration] = js.undefined
    ): CustomerAction = {
      val __obj = js.Dynamic.literal()
      acknowledgeActionConfiguration.foreach(__v => __obj.updateDynamic("acknowledgeActionConfiguration")(__v.asInstanceOf[js.Any]))
      actionName.foreach(__v => __obj.updateDynamic("actionName")(__v.asInstanceOf[js.Any]))
      disableActionConfiguration.foreach(__v => __obj.updateDynamic("disableActionConfiguration")(__v.asInstanceOf[js.Any]))
      enableActionConfiguration.foreach(__v => __obj.updateDynamic("enableActionConfiguration")(__v.asInstanceOf[js.Any]))
      resetActionConfiguration.foreach(__v => __obj.updateDynamic("resetActionConfiguration")(__v.asInstanceOf[js.Any]))
      snoozeActionConfiguration.foreach(__v => __obj.updateDynamic("snoozeActionConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomerAction]
    }
  }

  /** Information used to delete the detector model.
    */
  @js.native
  trait DeleteDetectorRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var messageId: MessageId
    var keyValue: js.UndefOr[KeyValue]
  }

  object DeleteDetectorRequest {
    @inline
    def apply(
        detectorModelName: DetectorModelName,
        messageId: MessageId,
        keyValue: js.UndefOr[KeyValue] = js.undefined
    ): DeleteDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any],
        "messageId" -> messageId.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDetectorRequest]
    }
  }

  @js.native
  trait DescribeAlarmRequest extends js.Object {
    var alarmModelName: AlarmModelName
    var keyValue: js.UndefOr[KeyValue]
  }

  object DescribeAlarmRequest {
    @inline
    def apply(
        alarmModelName: AlarmModelName,
        keyValue: js.UndefOr[KeyValue] = js.undefined
    ): DescribeAlarmRequest = {
      val __obj = js.Dynamic.literal(
        "alarmModelName" -> alarmModelName.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlarmRequest]
    }
  }

  @js.native
  trait DescribeAlarmResponse extends js.Object {
    var alarm: js.UndefOr[Alarm]
  }

  object DescribeAlarmResponse {
    @inline
    def apply(
        alarm: js.UndefOr[Alarm] = js.undefined
    ): DescribeAlarmResponse = {
      val __obj = js.Dynamic.literal()
      alarm.foreach(__v => __obj.updateDynamic("alarm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlarmResponse]
    }
  }

  @js.native
  trait DescribeDetectorRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var keyValue: js.UndefOr[KeyValue]
  }

  object DescribeDetectorRequest {
    @inline
    def apply(
        detectorModelName: DetectorModelName,
        keyValue: js.UndefOr[KeyValue] = js.undefined
    ): DescribeDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectorRequest]
    }
  }

  @js.native
  trait DescribeDetectorResponse extends js.Object {
    var detector: js.UndefOr[Detector]
  }

  object DescribeDetectorResponse {
    @inline
    def apply(
        detector: js.UndefOr[Detector] = js.undefined
    ): DescribeDetectorResponse = {
      val __obj = js.Dynamic.literal()
      detector.foreach(__v => __obj.updateDynamic("detector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectorResponse]
    }
  }

  /** Information about the detector (instance).
    */
  @js.native
  trait Detector extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var detectorModelName: js.UndefOr[DetectorModelName]
    var detectorModelVersion: js.UndefOr[DetectorModelVersion]
    var keyValue: js.UndefOr[KeyValue]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var state: js.UndefOr[DetectorState]
  }

  object Detector {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        detectorModelName: js.UndefOr[DetectorModelName] = js.undefined,
        detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined,
        keyValue: js.UndefOr[KeyValue] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        state: js.UndefOr[DetectorState] = js.undefined
    ): Detector = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      detectorModelName.foreach(__v => __obj.updateDynamic("detectorModelName")(__v.asInstanceOf[js.Any]))
      detectorModelVersion.foreach(__v => __obj.updateDynamic("detectorModelVersion")(__v.asInstanceOf[js.Any]))
      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Detector]
    }
  }

  /** Information about the current state of the detector instance.
    */
  @js.native
  trait DetectorState extends js.Object {
    var stateName: StateName
    var timers: Timers
    var variables: Variables
  }

  object DetectorState {
    @inline
    def apply(
        stateName: StateName,
        timers: Timers,
        variables: Variables
    ): DetectorState = {
      val __obj = js.Dynamic.literal(
        "stateName" -> stateName.asInstanceOf[js.Any],
        "timers" -> timers.asInstanceOf[js.Any],
        "variables" -> variables.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetectorState]
    }
  }

  /** The new state, variable values, and timer settings of the detector (instance).
    */
  @js.native
  trait DetectorStateDefinition extends js.Object {
    var stateName: StateName
    var timers: TimerDefinitions
    var variables: VariableDefinitions
  }

  object DetectorStateDefinition {
    @inline
    def apply(
        stateName: StateName,
        timers: TimerDefinitions,
        variables: VariableDefinitions
    ): DetectorStateDefinition = {
      val __obj = js.Dynamic.literal(
        "stateName" -> stateName.asInstanceOf[js.Any],
        "timers" -> timers.asInstanceOf[js.Any],
        "variables" -> variables.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetectorStateDefinition]
    }
  }

  /** Information about the detector state.
    */
  @js.native
  trait DetectorStateSummary extends js.Object {
    var stateName: js.UndefOr[StateName]
  }

  object DetectorStateSummary {
    @inline
    def apply(
        stateName: js.UndefOr[StateName] = js.undefined
    ): DetectorStateSummary = {
      val __obj = js.Dynamic.literal()
      stateName.foreach(__v => __obj.updateDynamic("stateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectorStateSummary]
    }
  }

  /** Information about the detector (instance).
    */
  @js.native
  trait DetectorSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var detectorModelName: js.UndefOr[DetectorModelName]
    var detectorModelVersion: js.UndefOr[DetectorModelVersion]
    var keyValue: js.UndefOr[KeyValue]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var state: js.UndefOr[DetectorStateSummary]
  }

  object DetectorSummary {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        detectorModelName: js.UndefOr[DetectorModelName] = js.undefined,
        detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined,
        keyValue: js.UndefOr[KeyValue] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        state: js.UndefOr[DetectorStateSummary] = js.undefined
    ): DetectorSummary = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      detectorModelName.foreach(__v => __obj.updateDynamic("detectorModelName")(__v.asInstanceOf[js.Any]))
      detectorModelVersion.foreach(__v => __obj.updateDynamic("detectorModelVersion")(__v.asInstanceOf[js.Any]))
      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectorSummary]
    }
  }

  /** Contains the configuration information of a disable action.
    */
  @js.native
  trait DisableActionConfiguration extends js.Object {
    var note: js.UndefOr[Note]
  }

  object DisableActionConfiguration {
    @inline
    def apply(
        note: js.UndefOr[Note] = js.undefined
    ): DisableActionConfiguration = {
      val __obj = js.Dynamic.literal()
      note.foreach(__v => __obj.updateDynamic("note")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableActionConfiguration]
    }
  }

  /** Information used to disable the alarm.
    */
  @js.native
  trait DisableAlarmActionRequest extends js.Object {
    var alarmModelName: AlarmModelName
    var requestId: RequestId
    var keyValue: js.UndefOr[KeyValue]
    var note: js.UndefOr[Note]
  }

  object DisableAlarmActionRequest {
    @inline
    def apply(
        alarmModelName: AlarmModelName,
        requestId: RequestId,
        keyValue: js.UndefOr[KeyValue] = js.undefined,
        note: js.UndefOr[Note] = js.undefined
    ): DisableAlarmActionRequest = {
      val __obj = js.Dynamic.literal(
        "alarmModelName" -> alarmModelName.asInstanceOf[js.Any],
        "requestId" -> requestId.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      note.foreach(__v => __obj.updateDynamic("note")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableAlarmActionRequest]
    }
  }

  /** Contains the configuration information of an enable action.
    */
  @js.native
  trait EnableActionConfiguration extends js.Object {
    var note: js.UndefOr[Note]
  }

  object EnableActionConfiguration {
    @inline
    def apply(
        note: js.UndefOr[Note] = js.undefined
    ): EnableActionConfiguration = {
      val __obj = js.Dynamic.literal()
      note.foreach(__v => __obj.updateDynamic("note")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableActionConfiguration]
    }
  }

  /** Information needed to enable the alarm.
    */
  @js.native
  trait EnableAlarmActionRequest extends js.Object {
    var alarmModelName: AlarmModelName
    var requestId: RequestId
    var keyValue: js.UndefOr[KeyValue]
    var note: js.UndefOr[Note]
  }

  object EnableAlarmActionRequest {
    @inline
    def apply(
        alarmModelName: AlarmModelName,
        requestId: RequestId,
        keyValue: js.UndefOr[KeyValue] = js.undefined,
        note: js.UndefOr[Note] = js.undefined
    ): EnableAlarmActionRequest = {
      val __obj = js.Dynamic.literal(
        "alarmModelName" -> alarmModelName.asInstanceOf[js.Any],
        "requestId" -> requestId.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      note.foreach(__v => __obj.updateDynamic("note")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableAlarmActionRequest]
    }
  }

  @js.native
  trait ListAlarmsRequest extends js.Object {
    var alarmModelName: AlarmModelName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAlarmsRequest {
    @inline
    def apply(
        alarmModelName: AlarmModelName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAlarmsRequest = {
      val __obj = js.Dynamic.literal(
        "alarmModelName" -> alarmModelName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlarmsRequest]
    }
  }

  @js.native
  trait ListAlarmsResponse extends js.Object {
    var alarmSummaries: js.UndefOr[AlarmSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAlarmsResponse {
    @inline
    def apply(
        alarmSummaries: js.UndefOr[AlarmSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAlarmsResponse = {
      val __obj = js.Dynamic.literal()
      alarmSummaries.foreach(__v => __obj.updateDynamic("alarmSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlarmsResponse]
    }
  }

  @js.native
  trait ListDetectorsRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var stateName: js.UndefOr[StateName]
  }

  object ListDetectorsRequest {
    @inline
    def apply(
        detectorModelName: DetectorModelName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        stateName: js.UndefOr[StateName] = js.undefined
    ): ListDetectorsRequest = {
      val __obj = js.Dynamic.literal(
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      stateName.foreach(__v => __obj.updateDynamic("stateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorsRequest]
    }
  }

  @js.native
  trait ListDetectorsResponse extends js.Object {
    var detectorSummaries: js.UndefOr[DetectorSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDetectorsResponse {
    @inline
    def apply(
        detectorSummaries: js.UndefOr[DetectorSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectorsResponse = {
      val __obj = js.Dynamic.literal()
      detectorSummaries.foreach(__v => __obj.updateDynamic("detectorSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorsResponse]
    }
  }

  /** Information about a message.
    */
  @js.native
  trait Message extends js.Object {
    var inputName: EphemeralInputName
    var messageId: MessageId
    var payload: Payload
    var timestamp: js.UndefOr[TimestampValue]
  }

  object Message {
    @inline
    def apply(
        inputName: EphemeralInputName,
        messageId: MessageId,
        payload: Payload,
        timestamp: js.UndefOr[TimestampValue] = js.undefined
    ): Message = {
      val __obj = js.Dynamic.literal(
        "inputName" -> inputName.asInstanceOf[js.Any],
        "messageId" -> messageId.asInstanceOf[js.Any],
        "payload" -> payload.asInstanceOf[js.Any]
      )

      timestamp.foreach(__v => __obj.updateDynamic("timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Message]
    }
  }

  /** Contains the configuration information of a reset action.
    */
  @js.native
  trait ResetActionConfiguration extends js.Object {
    var note: js.UndefOr[Note]
  }

  object ResetActionConfiguration {
    @inline
    def apply(
        note: js.UndefOr[Note] = js.undefined
    ): ResetActionConfiguration = {
      val __obj = js.Dynamic.literal()
      note.foreach(__v => __obj.updateDynamic("note")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetActionConfiguration]
    }
  }

  /** Information needed to reset the alarm.
    */
  @js.native
  trait ResetAlarmActionRequest extends js.Object {
    var alarmModelName: AlarmModelName
    var requestId: RequestId
    var keyValue: js.UndefOr[KeyValue]
    var note: js.UndefOr[Note]
  }

  object ResetAlarmActionRequest {
    @inline
    def apply(
        alarmModelName: AlarmModelName,
        requestId: RequestId,
        keyValue: js.UndefOr[KeyValue] = js.undefined,
        note: js.UndefOr[Note] = js.undefined
    ): ResetAlarmActionRequest = {
      val __obj = js.Dynamic.literal(
        "alarmModelName" -> alarmModelName.asInstanceOf[js.Any],
        "requestId" -> requestId.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      note.foreach(__v => __obj.updateDynamic("note")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetAlarmActionRequest]
    }
  }

  /** Information needed to evaluate data.
    */
  @js.native
  trait RuleEvaluation extends js.Object {
    var simpleRuleEvaluation: js.UndefOr[SimpleRuleEvaluation]
  }

  object RuleEvaluation {
    @inline
    def apply(
        simpleRuleEvaluation: js.UndefOr[SimpleRuleEvaluation] = js.undefined
    ): RuleEvaluation = {
      val __obj = js.Dynamic.literal()
      simpleRuleEvaluation.foreach(__v => __obj.updateDynamic("simpleRuleEvaluation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleEvaluation]
    }
  }

  /** Information needed to compare two values with a comparison operator.
    */
  @js.native
  trait SimpleRuleEvaluation extends js.Object {
    var inputPropertyValue: js.UndefOr[InputPropertyValue]
    var operator: js.UndefOr[ComparisonOperator]
    var thresholdValue: js.UndefOr[ThresholdValue]
  }

  object SimpleRuleEvaluation {
    @inline
    def apply(
        inputPropertyValue: js.UndefOr[InputPropertyValue] = js.undefined,
        operator: js.UndefOr[ComparisonOperator] = js.undefined,
        thresholdValue: js.UndefOr[ThresholdValue] = js.undefined
    ): SimpleRuleEvaluation = {
      val __obj = js.Dynamic.literal()
      inputPropertyValue.foreach(__v => __obj.updateDynamic("inputPropertyValue")(__v.asInstanceOf[js.Any]))
      operator.foreach(__v => __obj.updateDynamic("operator")(__v.asInstanceOf[js.Any]))
      thresholdValue.foreach(__v => __obj.updateDynamic("thresholdValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimpleRuleEvaluation]
    }
  }

  /** Contains the configuration information of a snooze action.
    */
  @js.native
  trait SnoozeActionConfiguration extends js.Object {
    var note: js.UndefOr[Note]
    var snoozeDuration: js.UndefOr[SnoozeDuration]
  }

  object SnoozeActionConfiguration {
    @inline
    def apply(
        note: js.UndefOr[Note] = js.undefined,
        snoozeDuration: js.UndefOr[SnoozeDuration] = js.undefined
    ): SnoozeActionConfiguration = {
      val __obj = js.Dynamic.literal()
      note.foreach(__v => __obj.updateDynamic("note")(__v.asInstanceOf[js.Any]))
      snoozeDuration.foreach(__v => __obj.updateDynamic("snoozeDuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnoozeActionConfiguration]
    }
  }

  /** Information needed to snooze the alarm.
    */
  @js.native
  trait SnoozeAlarmActionRequest extends js.Object {
    var alarmModelName: AlarmModelName
    var requestId: RequestId
    var snoozeDuration: SnoozeDuration
    var keyValue: js.UndefOr[KeyValue]
    var note: js.UndefOr[Note]
  }

  object SnoozeAlarmActionRequest {
    @inline
    def apply(
        alarmModelName: AlarmModelName,
        requestId: RequestId,
        snoozeDuration: SnoozeDuration,
        keyValue: js.UndefOr[KeyValue] = js.undefined,
        note: js.UndefOr[Note] = js.undefined
    ): SnoozeAlarmActionRequest = {
      val __obj = js.Dynamic.literal(
        "alarmModelName" -> alarmModelName.asInstanceOf[js.Any],
        "requestId" -> requestId.asInstanceOf[js.Any],
        "snoozeDuration" -> snoozeDuration.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      note.foreach(__v => __obj.updateDynamic("note")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnoozeAlarmActionRequest]
    }
  }

  /** Contains the configuration information of alarm state changes.
    */
  @js.native
  trait StateChangeConfiguration extends js.Object {
    var triggerType: js.UndefOr[TriggerType]
  }

  object StateChangeConfiguration {
    @inline
    def apply(
        triggerType: js.UndefOr[TriggerType] = js.undefined
    ): StateChangeConfiguration = {
      val __obj = js.Dynamic.literal()
      triggerType.foreach(__v => __obj.updateDynamic("triggerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StateChangeConfiguration]
    }
  }

  /** Contains information about alarm state changes.
    */
  @js.native
  trait SystemEvent extends js.Object {
    var eventType: js.UndefOr[EventType]
    var stateChangeConfiguration: js.UndefOr[StateChangeConfiguration]
  }

  object SystemEvent {
    @inline
    def apply(
        eventType: js.UndefOr[EventType] = js.undefined,
        stateChangeConfiguration: js.UndefOr[StateChangeConfiguration] = js.undefined
    ): SystemEvent = {
      val __obj = js.Dynamic.literal()
      eventType.foreach(__v => __obj.updateDynamic("eventType")(__v.asInstanceOf[js.Any]))
      stateChangeConfiguration.foreach(__v => __obj.updateDynamic("stateChangeConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemEvent]
    }
  }

  /** The current state of a timer.
    */
  @js.native
  trait Timer extends js.Object {
    var name: TimerName
    var timestamp: Timestamp
  }

  object Timer {
    @inline
    def apply(
        name: TimerName,
        timestamp: Timestamp
    ): Timer = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Timer]
    }
  }

  /** The new setting of a timer.
    */
  @js.native
  trait TimerDefinition extends js.Object {
    var name: TimerName
    var seconds: Seconds
  }

  object TimerDefinition {
    @inline
    def apply(
        name: TimerName,
        seconds: Seconds
    ): TimerDefinition = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "seconds" -> seconds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimerDefinition]
    }
  }

  /** Contains information about a timestamp.
    */
  @js.native
  trait TimestampValue extends js.Object {
    var timeInMillis: js.UndefOr[EpochMilliTimestamp]
  }

  object TimestampValue {
    @inline
    def apply(
        timeInMillis: js.UndefOr[EpochMilliTimestamp] = js.undefined
    ): TimestampValue = {
      val __obj = js.Dynamic.literal()
      timeInMillis.foreach(__v => __obj.updateDynamic("timeInMillis")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimestampValue]
    }
  }

  /** Information used to update the detector (instance).
    */
  @js.native
  trait UpdateDetectorRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var messageId: MessageId
    var state: DetectorStateDefinition
    var keyValue: js.UndefOr[KeyValue]
  }

  object UpdateDetectorRequest {
    @inline
    def apply(
        detectorModelName: DetectorModelName,
        messageId: MessageId,
        state: DetectorStateDefinition,
        keyValue: js.UndefOr[KeyValue] = js.undefined
    ): UpdateDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any],
        "messageId" -> messageId.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.updateDynamic("keyValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDetectorRequest]
    }
  }

  /** The current state of the variable.
    */
  @js.native
  trait Variable extends js.Object {
    var name: VariableName
    var value: VariableValue
  }

  object Variable {
    @inline
    def apply(
        name: VariableName,
        value: VariableValue
    ): Variable = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Variable]
    }
  }

  /** The new value of the variable.
    */
  @js.native
  trait VariableDefinition extends js.Object {
    var name: VariableName
    var value: VariableValue
  }

  object VariableDefinition {
    @inline
    def apply(
        name: VariableName,
        value: VariableValue
    ): VariableDefinition = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VariableDefinition]
    }
  }
}
