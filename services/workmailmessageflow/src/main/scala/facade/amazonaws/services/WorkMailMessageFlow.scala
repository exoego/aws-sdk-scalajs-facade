package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object workmailmessageflow {
  type messageContentBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type messageIdType = String

  implicit final class WorkMailMessageFlowOps(private val service: WorkMailMessageFlow) extends AnyVal {

    @inline def getRawMessageContentFuture(params: GetRawMessageContentRequest): Future[GetRawMessageContentResponse] =
      service.getRawMessageContent(params).promise().toFuture
  }
}

package workmailmessageflow {
  @js.native
  @JSImport("aws-sdk", "WorkMailMessageFlow", "AWS.WorkMailMessageFlow")
  class WorkMailMessageFlow() extends js.Object {
    def this(config: AWSConfig) = this()

    def getRawMessageContent(params: GetRawMessageContentRequest): Request[GetRawMessageContentResponse] = js.native
  }

  @js.native
  trait GetRawMessageContentRequest extends js.Object {
    var messageId: messageIdType
  }

  object GetRawMessageContentRequest {
    @inline
    def apply(
        messageId: messageIdType
    ): GetRawMessageContentRequest = {
      val __obj = js.Dynamic.literal(
        "messageId" -> messageId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRawMessageContentRequest]
    }
  }

  @js.native
  trait GetRawMessageContentResponse extends js.Object {
    var messageContent: messageContentBlob
  }

  object GetRawMessageContentResponse {
    @inline
    def apply(
        messageContent: messageContentBlob
    ): GetRawMessageContentResponse = {
      val __obj = js.Dynamic.literal(
        "messageContent" -> messageContent.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRawMessageContentResponse]
    }
  }
}
