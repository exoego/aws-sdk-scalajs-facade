package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object kinesisvideomedia {
  type ContentType = String
  type ContinuationToken = String
  type ErrorMessage = String
  type FragmentNumberString = String
  type Payload = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ResourceARN = String
  type StartSelectorType = String
  type StreamName = String
  type Timestamp = js.Date
}

package kinesisvideomedia {
  @js.native
  @JSImport("aws-sdk", "KinesisVideoMedia")
  class KinesisVideoMedia() extends js.Object {
    def this(config: AWSConfig) = this()

    def getMedia(params: GetMediaInput): Request[GetMediaOutput] = js.native
  }

  /**
   * Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client calls. Try making the call later.
   */
  @js.native
  trait ClientLimitExceededExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client connections.
   */
  @js.native
  trait ConnectionLimitExceededExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  @js.native
  trait GetMediaInput extends js.Object {
    var StartSelector: StartSelector
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  object GetMediaInput {
    def apply(
      StartSelector: StartSelector,
      StreamARN: js.UndefOr[ResourceARN] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined): GetMediaInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartSelector" -> StartSelector.asInstanceOf[js.Any],
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMediaInput]
    }
  }

  @js.native
  trait GetMediaOutput extends js.Object {
    var ContentType: js.UndefOr[ContentType]
    var Payload: js.UndefOr[Payload]
  }

  object GetMediaOutput {
    def apply(
      ContentType: js.UndefOr[ContentType] = js.undefined,
      Payload: js.UndefOr[Payload] = js.undefined): GetMediaOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "Payload" -> Payload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMediaOutput]
    }
  }

  /**
   * The value for this input parameter is invalid.
   */
  @js.native
  trait InvalidArgumentExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * Status Code: 400, Caller used wrong endpoint to write data to a stream. On receiving such an exception, the user must call <code>GetDataEndpoint</code> with <code>AccessMode</code> set to "READ" and use the endpoint Kinesis Video returns in the next <code>GetMedia</code> call.
   */
  @js.native
  trait InvalidEndpointExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * Status Code: 403, The caller is not authorized to perform an operation on the given stream, or the token has expired.
   */
  @js.native
  trait NotAuthorizedExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * Status Code: 404, The stream with the given name does not exist.
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * Identifies the chunk on the Kinesis video stream where you want the <code>GetMedia</code> API to start returning media data. You have the following options to identify the starting chunk:
   * * Choose the latest (or oldest) chunk.
   *  * Identify a specific chunk. You can identify a specific chunk either by providing a fragment number or time stamp (server or producer).
   *  * Each chunk's metadata includes a continuation token as a Matroska (MKV) tag (<code>AWS_KINESISVIDEO_CONTINUATION_TOKEN</code>). If your previous <code>GetMedia</code> request terminated, you can use this tag value in your next <code>GetMedia</code> request. The API then starts returning chunks starting where the last API ended.
   */
  @js.native
  trait StartSelector extends js.Object {
    var StartSelectorType: StartSelectorType
    var AfterFragmentNumber: js.UndefOr[FragmentNumberString]
    var ContinuationToken: js.UndefOr[ContinuationToken]
    var StartTimestamp: js.UndefOr[Timestamp]
  }

  object StartSelector {
    def apply(
      StartSelectorType: StartSelectorType,
      AfterFragmentNumber: js.UndefOr[FragmentNumberString] = js.undefined,
      ContinuationToken: js.UndefOr[ContinuationToken] = js.undefined,
      StartTimestamp: js.UndefOr[Timestamp] = js.undefined): StartSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartSelectorType" -> StartSelectorType.asInstanceOf[js.Any],
        "AfterFragmentNumber" -> AfterFragmentNumber.map { x => x.asInstanceOf[js.Any] },
        "ContinuationToken" -> ContinuationToken.map { x => x.asInstanceOf[js.Any] },
        "StartTimestamp" -> StartTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSelector]
    }
  }

  object StartSelectorTypeEnum {
    val FRAGMENT_NUMBER = "FRAGMENT_NUMBER"
    val SERVER_TIMESTAMP = "SERVER_TIMESTAMP"
    val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP"
    val NOW = "NOW"
    val EARLIEST = "EARLIEST"
    val CONTINUATION_TOKEN = "CONTINUATION_TOKEN"

    val values = IndexedSeq(FRAGMENT_NUMBER, SERVER_TIMESTAMP, PRODUCER_TIMESTAMP, NOW, EARLIEST, CONTINUATION_TOKEN)
  }
}
