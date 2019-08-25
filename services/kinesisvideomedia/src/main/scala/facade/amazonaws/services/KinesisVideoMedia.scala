package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object kinesisvideomedia {
  type ContentType          = String
  type ContinuationToken    = String
  type FragmentNumberString = String
  type Payload =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ResourceARN       = String
  type StartSelectorType = String
  type StreamName        = String
  type Timestamp         = js.Date

  implicit final class KinesisVideoMediaOps(val service: KinesisVideoMedia) extends AnyVal {

    def getMediaFuture(params: GetMediaInput): Future[GetMediaOutput] = service.getMedia(params).promise.toFuture
  }
}

package kinesisvideomedia {
  @js.native
  @JSImport("aws-sdk", "KinesisVideoMedia")
  class KinesisVideoMedia() extends js.Object {
    def this(config: AWSConfig) = this()

    def getMedia(params: GetMediaInput): Request[GetMediaOutput] = js.native
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
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): GetMediaInput = {
      val __obj = js.Dictionary[js.Any](
        "StartSelector" -> StartSelector.asInstanceOf[js.Any]
      )

      StreamARN.foreach(__v => __obj.update("StreamARN", __v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.update("StreamName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMediaInput]
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
        Payload: js.UndefOr[Payload] = js.undefined
    ): GetMediaOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ContentType.foreach(__v => __obj.update("ContentType", __v.asInstanceOf[js.Any]))
      Payload.foreach(__v => __obj.update("Payload", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMediaOutput]
    }
  }

  /**
    * Identifies the chunk on the Kinesis video stream where you want the <code>GetMedia</code> API to start returning media data. You have the following options to identify the starting chunk:
    * * Choose the latest (or oldest) chunk.
    *  * Identify a specific chunk. You can identify a specific chunk either by providing a fragment number or timestamp (server or producer).
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
        StartTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): StartSelector = {
      val __obj = js.Dictionary[js.Any](
        "StartSelectorType" -> StartSelectorType.asInstanceOf[js.Any]
      )

      AfterFragmentNumber.foreach(__v => __obj.update("AfterFragmentNumber", __v.asInstanceOf[js.Any]))
      ContinuationToken.foreach(__v => __obj.update("ContinuationToken", __v.asInstanceOf[js.Any]))
      StartTimestamp.foreach(__v => __obj.update("StartTimestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSelector]
    }
  }

  object StartSelectorTypeEnum {
    val FRAGMENT_NUMBER    = "FRAGMENT_NUMBER"
    val SERVER_TIMESTAMP   = "SERVER_TIMESTAMP"
    val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP"
    val NOW                = "NOW"
    val EARLIEST           = "EARLIEST"
    val CONTINUATION_TOKEN = "CONTINUATION_TOKEN"

    val values = IndexedSeq(FRAGMENT_NUMBER, SERVER_TIMESTAMP, PRODUCER_TIMESTAMP, NOW, EARLIEST, CONTINUATION_TOKEN)
  }
}
