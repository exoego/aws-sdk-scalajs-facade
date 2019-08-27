package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object ioteventsdata {
  type BatchPutMessageErrorEntries     = js.Array[BatchPutMessageErrorEntry]
  type BatchUpdateDetectorErrorEntries = js.Array[BatchUpdateDetectorErrorEntry]
  type DetectorModelName               = String
  type DetectorModelVersion            = String
  type DetectorSummaries               = js.Array[DetectorSummary]
  type ErrorCode                       = String
  type ErrorMessage                    = String
  type InputName                       = String
  type KeyValue                        = String
  type MaxResults                      = Int
  type MessageId                       = String
  type Messages                        = js.Array[Message]
  type NextToken                       = String
  type Payload =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Seconds                = Int
  type StateName              = String
  type TimerDefinitions       = js.Array[TimerDefinition]
  type TimerName              = String
  type Timers                 = js.Array[Timer]
  type Timestamp              = js.Date
  type UpdateDetectorRequests = js.Array[UpdateDetectorRequest]
  type VariableDefinitions    = js.Array[VariableDefinition]
  type VariableName           = String
  type VariableValue          = String
  type Variables              = js.Array[Variable]

  implicit final class IoTEventsDataOps(val service: IoTEventsData) extends AnyVal {

    def batchPutMessageFuture(params: BatchPutMessageRequest): Future[BatchPutMessageResponse] =
      service.batchPutMessage(params).promise.toFuture
    def batchUpdateDetectorFuture(params: BatchUpdateDetectorRequest): Future[BatchUpdateDetectorResponse] =
      service.batchUpdateDetector(params).promise.toFuture
    def describeDetectorFuture(params: DescribeDetectorRequest): Future[DescribeDetectorResponse] =
      service.describeDetector(params).promise.toFuture
    def listDetectorsFuture(params: ListDetectorsRequest): Future[ListDetectorsResponse] =
      service.listDetectors(params).promise.toFuture
  }
}

package ioteventsdata {
  @js.native
  @JSImport("aws-sdk", "IoTEventsData")
  class IoTEventsData() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchPutMessage(params: BatchPutMessageRequest): Request[BatchPutMessageResponse]             = js.native
    def batchUpdateDetector(params: BatchUpdateDetectorRequest): Request[BatchUpdateDetectorResponse] = js.native
    def describeDetector(params: DescribeDetectorRequest): Request[DescribeDetectorResponse]          = js.native
    def listDetectors(params: ListDetectorsRequest): Request[ListDetectorsResponse]                   = js.native
  }

  /**
    * Contains information about the errors encountered.
    */
  @js.native
  trait BatchPutMessageErrorEntry extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var messageId: js.UndefOr[MessageId]
  }

  object BatchPutMessageErrorEntry {
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        messageId: js.UndefOr[MessageId] = js.undefined
    ): BatchPutMessageErrorEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      errorCode.foreach(__v => __obj.update("errorCode", __v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.update("errorMessage", __v.asInstanceOf[js.Any]))
      messageId.foreach(__v => __obj.update("messageId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPutMessageErrorEntry]
    }
  }

  @js.native
  trait BatchPutMessageRequest extends js.Object {
    var messages: Messages
  }

  object BatchPutMessageRequest {
    def apply(
        messages: Messages
    ): BatchPutMessageRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        BatchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries] = js.undefined
    ): BatchPutMessageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      BatchPutMessageErrorEntries.foreach(__v => __obj.update("BatchPutMessageErrorEntries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPutMessageResponse]
    }
  }

  /**
    * Information about the error that occured when attempting to update a detector.
    */
  @js.native
  trait BatchUpdateDetectorErrorEntry extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var messageId: js.UndefOr[MessageId]
  }

  object BatchUpdateDetectorErrorEntry {
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        messageId: js.UndefOr[MessageId] = js.undefined
    ): BatchUpdateDetectorErrorEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      errorCode.foreach(__v => __obj.update("errorCode", __v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.update("errorMessage", __v.asInstanceOf[js.Any]))
      messageId.foreach(__v => __obj.update("messageId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateDetectorErrorEntry]
    }
  }

  @js.native
  trait BatchUpdateDetectorRequest extends js.Object {
    var detectors: UpdateDetectorRequests
  }

  object BatchUpdateDetectorRequest {
    def apply(
        detectors: UpdateDetectorRequests
    ): BatchUpdateDetectorRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        batchUpdateDetectorErrorEntries: js.UndefOr[BatchUpdateDetectorErrorEntries] = js.undefined
    ): BatchUpdateDetectorResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      batchUpdateDetectorErrorEntries.foreach(
        __v => __obj.update("batchUpdateDetectorErrorEntries", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[BatchUpdateDetectorResponse]
    }
  }

  @js.native
  trait DescribeDetectorRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var keyValue: js.UndefOr[KeyValue]
  }

  object DescribeDetectorRequest {
    def apply(
        detectorModelName: DetectorModelName,
        keyValue: js.UndefOr[KeyValue] = js.undefined
    ): DescribeDetectorRequest = {
      val __obj = js.Dictionary[js.Any](
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.update("keyValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectorRequest]
    }
  }

  @js.native
  trait DescribeDetectorResponse extends js.Object {
    var detector: js.UndefOr[Detector]
  }

  object DescribeDetectorResponse {
    def apply(
        detector: js.UndefOr[Detector] = js.undefined
    ): DescribeDetectorResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      detector.foreach(__v => __obj.update("detector", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectorResponse]
    }
  }

  /**
    * Information about the detector (instance).
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
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        detectorModelName: js.UndefOr[DetectorModelName] = js.undefined,
        detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined,
        keyValue: js.UndefOr[KeyValue] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        state: js.UndefOr[DetectorState] = js.undefined
    ): Detector = {
      val __obj = js.Dictionary.empty[js.Any]
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      detectorModelName.foreach(__v => __obj.update("detectorModelName", __v.asInstanceOf[js.Any]))
      detectorModelVersion.foreach(__v => __obj.update("detectorModelVersion", __v.asInstanceOf[js.Any]))
      keyValue.foreach(__v => __obj.update("keyValue", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.update("state", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Detector]
    }
  }

  /**
    * Information about the current state of the detector instance.
    */
  @js.native
  trait DetectorState extends js.Object {
    var stateName: StateName
    var timers: Timers
    var variables: Variables
  }

  object DetectorState {
    def apply(
        stateName: StateName,
        timers: Timers,
        variables: Variables
    ): DetectorState = {
      val __obj = js.Dictionary[js.Any](
        "stateName" -> stateName.asInstanceOf[js.Any],
        "timers"    -> timers.asInstanceOf[js.Any],
        "variables" -> variables.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectorState]
    }
  }

  /**
    * The new state, variable values, and timer settings of the detector (instance).
    */
  @js.native
  trait DetectorStateDefinition extends js.Object {
    var stateName: StateName
    var timers: TimerDefinitions
    var variables: VariableDefinitions
  }

  object DetectorStateDefinition {
    def apply(
        stateName: StateName,
        timers: TimerDefinitions,
        variables: VariableDefinitions
    ): DetectorStateDefinition = {
      val __obj = js.Dictionary[js.Any](
        "stateName" -> stateName.asInstanceOf[js.Any],
        "timers"    -> timers.asInstanceOf[js.Any],
        "variables" -> variables.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectorStateDefinition]
    }
  }

  /**
    * Information about the detector state.
    */
  @js.native
  trait DetectorStateSummary extends js.Object {
    var stateName: js.UndefOr[StateName]
  }

  object DetectorStateSummary {
    def apply(
        stateName: js.UndefOr[StateName] = js.undefined
    ): DetectorStateSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      stateName.foreach(__v => __obj.update("stateName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectorStateSummary]
    }
  }

  /**
    * Information about the detector (instance).
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
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        detectorModelName: js.UndefOr[DetectorModelName] = js.undefined,
        detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined,
        keyValue: js.UndefOr[KeyValue] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        state: js.UndefOr[DetectorStateSummary] = js.undefined
    ): DetectorSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      creationTime.foreach(__v => __obj.update("creationTime", __v.asInstanceOf[js.Any]))
      detectorModelName.foreach(__v => __obj.update("detectorModelName", __v.asInstanceOf[js.Any]))
      detectorModelVersion.foreach(__v => __obj.update("detectorModelVersion", __v.asInstanceOf[js.Any]))
      keyValue.foreach(__v => __obj.update("keyValue", __v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.update("lastUpdateTime", __v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.update("state", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectorSummary]
    }
  }

  object ErrorCodeEnum {
    val ResourceNotFoundException   = "ResourceNotFoundException"
    val InvalidRequestException     = "InvalidRequestException"
    val InternalFailureException    = "InternalFailureException"
    val ServiceUnavailableException = "ServiceUnavailableException"
    val ThrottlingException         = "ThrottlingException"

    val values = js.Object.freeze(
      js.Array(
        ResourceNotFoundException,
        InvalidRequestException,
        InternalFailureException,
        ServiceUnavailableException,
        ThrottlingException
      )
    )
  }

  @js.native
  trait ListDetectorsRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var stateName: js.UndefOr[StateName]
  }

  object ListDetectorsRequest {
    def apply(
        detectorModelName: DetectorModelName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        stateName: js.UndefOr[StateName] = js.undefined
    ): ListDetectorsRequest = {
      val __obj = js.Dictionary[js.Any](
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      stateName.foreach(__v => __obj.update("stateName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorsRequest]
    }
  }

  @js.native
  trait ListDetectorsResponse extends js.Object {
    var detectorSummaries: js.UndefOr[DetectorSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDetectorsResponse {
    def apply(
        detectorSummaries: js.UndefOr[DetectorSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectorsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      detectorSummaries.foreach(__v => __obj.update("detectorSummaries", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorsResponse]
    }
  }

  /**
    * Information about a message.
    */
  @js.native
  trait Message extends js.Object {
    var inputName: InputName
    var messageId: MessageId
    var payload: Payload
  }

  object Message {
    def apply(
        inputName: InputName,
        messageId: MessageId,
        payload: Payload
    ): Message = {
      val __obj = js.Dictionary[js.Any](
        "inputName" -> inputName.asInstanceOf[js.Any],
        "messageId" -> messageId.asInstanceOf[js.Any],
        "payload"   -> payload.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Message]
    }
  }

  /**
    * The current state of a timer.
    */
  @js.native
  trait Timer extends js.Object {
    var name: TimerName
    var timestamp: Timestamp
  }

  object Timer {
    def apply(
        name: TimerName,
        timestamp: Timestamp
    ): Timer = {
      val __obj = js.Dictionary[js.Any](
        "name"      -> name.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Timer]
    }
  }

  /**
    * The new setting of a timer.
    */
  @js.native
  trait TimerDefinition extends js.Object {
    var name: TimerName
    var seconds: Seconds
  }

  object TimerDefinition {
    def apply(
        name: TimerName,
        seconds: Seconds
    ): TimerDefinition = {
      val __obj = js.Dictionary[js.Any](
        "name"    -> name.asInstanceOf[js.Any],
        "seconds" -> seconds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TimerDefinition]
    }
  }

  /**
    * Information used to update the detector (instance).
    */
  @js.native
  trait UpdateDetectorRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var messageId: MessageId
    var state: DetectorStateDefinition
    var keyValue: js.UndefOr[KeyValue]
  }

  object UpdateDetectorRequest {
    def apply(
        detectorModelName: DetectorModelName,
        messageId: MessageId,
        state: DetectorStateDefinition,
        keyValue: js.UndefOr[KeyValue] = js.undefined
    ): UpdateDetectorRequest = {
      val __obj = js.Dictionary[js.Any](
        "detectorModelName" -> detectorModelName.asInstanceOf[js.Any],
        "messageId"         -> messageId.asInstanceOf[js.Any],
        "state"             -> state.asInstanceOf[js.Any]
      )

      keyValue.foreach(__v => __obj.update("keyValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDetectorRequest]
    }
  }

  /**
    * The current state of the variable.
    */
  @js.native
  trait Variable extends js.Object {
    var name: VariableName
    var value: VariableValue
  }

  object Variable {
    def apply(
        name: VariableName,
        value: VariableValue
    ): Variable = {
      val __obj = js.Dictionary[js.Any](
        "name"  -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Variable]
    }
  }

  /**
    * The new value of the variable.
    */
  @js.native
  trait VariableDefinition extends js.Object {
    var name: VariableName
    var value: VariableValue
  }

  object VariableDefinition {
    def apply(
        name: VariableName,
        value: VariableValue
    ): VariableDefinition = {
      val __obj = js.Dictionary[js.Any](
        "name"  -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VariableDefinition]
    }
  }
}
