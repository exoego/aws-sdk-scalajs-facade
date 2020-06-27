package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object ioteventsdata {
  type BatchPutMessageErrorEntries     = js.Array[BatchPutMessageErrorEntry]
  type BatchUpdateDetectorErrorEntries = js.Array[BatchUpdateDetectorErrorEntry]
  type DetectorModelName               = String
  type DetectorModelVersion            = String
  type DetectorSummaries               = js.Array[DetectorSummary]
  type ErrorMessage                    = String
  type InputName                       = String
  type KeyValue                        = String
  type MaxResults                      = Int
  type MessageId                       = String
  type Messages                        = js.Array[Message]
  type NextToken                       = String
  type Payload                         = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Seconds                         = Int
  type StateName                       = String
  type TimerDefinitions                = js.Array[TimerDefinition]
  type TimerName                       = String
  type Timers                          = js.Array[Timer]
  type Timestamp                       = js.Date
  type UpdateDetectorRequests          = js.Array[UpdateDetectorRequest]
  type VariableDefinitions             = js.Array[VariableDefinition]
  type VariableName                    = String
  type VariableValue                   = String
  type Variables                       = js.Array[Variable]

  implicit final class IoTEventsDataOps(private val service: IoTEventsData) extends AnyVal {

    @inline def batchPutMessageFuture(params: BatchPutMessageRequest): Future[BatchPutMessageResponse] =
      service.batchPutMessage(params).promise().toFuture
    @inline def batchUpdateDetectorFuture(params: BatchUpdateDetectorRequest): Future[BatchUpdateDetectorResponse] =
      service.batchUpdateDetector(params).promise().toFuture
    @inline def describeDetectorFuture(params: DescribeDetectorRequest): Future[DescribeDetectorResponse] =
      service.describeDetector(params).promise().toFuture
    @inline def listDetectorsFuture(params: ListDetectorsRequest): Future[ListDetectorsResponse] =
      service.listDetectors(params).promise().toFuture
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
  @Factory
  trait BatchPutMessageErrorEntry extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var messageId: js.UndefOr[MessageId]
  }

  @js.native
  @Factory
  trait BatchPutMessageRequest extends js.Object {
    var messages: Messages
  }

  @js.native
  @Factory
  trait BatchPutMessageResponse extends js.Object {
    var BatchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries]
  }

  /**
    * Information about the error that occured when attempting to update a detector.
    */
  @js.native
  @Factory
  trait BatchUpdateDetectorErrorEntry extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var messageId: js.UndefOr[MessageId]
  }

  @js.native
  @Factory
  trait BatchUpdateDetectorRequest extends js.Object {
    var detectors: UpdateDetectorRequests
  }

  @js.native
  @Factory
  trait BatchUpdateDetectorResponse extends js.Object {
    var batchUpdateDetectorErrorEntries: js.UndefOr[BatchUpdateDetectorErrorEntries]
  }

  @js.native
  @Factory
  trait DescribeDetectorRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var keyValue: js.UndefOr[KeyValue]
  }

  @js.native
  @Factory
  trait DescribeDetectorResponse extends js.Object {
    var detector: js.UndefOr[Detector]
  }

  /**
    * Information about the detector (instance).
    */
  @js.native
  @Factory
  trait Detector extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var detectorModelName: js.UndefOr[DetectorModelName]
    var detectorModelVersion: js.UndefOr[DetectorModelVersion]
    var keyValue: js.UndefOr[KeyValue]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var state: js.UndefOr[DetectorState]
  }

  /**
    * Information about the current state of the detector instance.
    */
  @js.native
  @Factory
  trait DetectorState extends js.Object {
    var stateName: StateName
    var timers: Timers
    var variables: Variables
  }

  /**
    * The new state, variable values, and timer settings of the detector (instance).
    */
  @js.native
  @Factory
  trait DetectorStateDefinition extends js.Object {
    var stateName: StateName
    var timers: TimerDefinitions
    var variables: VariableDefinitions
  }

  /**
    * Information about the detector state.
    */
  @js.native
  @Factory
  trait DetectorStateSummary extends js.Object {
    var stateName: js.UndefOr[StateName]
  }

  /**
    * Information about the detector (instance).
    */
  @js.native
  @Factory
  trait DetectorSummary extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var detectorModelName: js.UndefOr[DetectorModelName]
    var detectorModelVersion: js.UndefOr[DetectorModelVersion]
    var keyValue: js.UndefOr[KeyValue]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var state: js.UndefOr[DetectorStateSummary]
  }

  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode extends js.Object {
    val ResourceNotFoundException   = "ResourceNotFoundException".asInstanceOf[ErrorCode]
    val InvalidRequestException     = "InvalidRequestException".asInstanceOf[ErrorCode]
    val InternalFailureException    = "InternalFailureException".asInstanceOf[ErrorCode]
    val ServiceUnavailableException = "ServiceUnavailableException".asInstanceOf[ErrorCode]
    val ThrottlingException         = "ThrottlingException".asInstanceOf[ErrorCode]

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
  @Factory
  trait ListDetectorsRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var stateName: js.UndefOr[StateName]
  }

  @js.native
  @Factory
  trait ListDetectorsResponse extends js.Object {
    var detectorSummaries: js.UndefOr[DetectorSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Information about a message.
    */
  @js.native
  @Factory
  trait Message extends js.Object {
    var inputName: InputName
    var messageId: MessageId
    var payload: Payload
  }

  /**
    * The current state of a timer.
    */
  @js.native
  @Factory
  trait Timer extends js.Object {
    var name: TimerName
    var timestamp: Timestamp
  }

  /**
    * The new setting of a timer.
    */
  @js.native
  @Factory
  trait TimerDefinition extends js.Object {
    var name: TimerName
    var seconds: Seconds
  }

  /**
    * Information used to update the detector (instance).
    */
  @js.native
  @Factory
  trait UpdateDetectorRequest extends js.Object {
    var detectorModelName: DetectorModelName
    var messageId: MessageId
    var state: DetectorStateDefinition
    var keyValue: js.UndefOr[KeyValue]
  }

  /**
    * The current state of the variable.
    */
  @js.native
  @Factory
  trait Variable extends js.Object {
    var name: VariableName
    var value: VariableValue
  }

  /**
    * The new value of the variable.
    */
  @js.native
  @Factory
  trait VariableDefinition extends js.Object {
    var name: VariableName
    var value: VariableValue
  }
}
