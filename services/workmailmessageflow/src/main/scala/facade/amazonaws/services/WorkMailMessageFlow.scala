package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object workmailmessageflow {
  type messageContentBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type messageIdType      = String

  implicit final class WorkMailMessageFlowOps(private val service: WorkMailMessageFlow) extends AnyVal {

    @inline def getRawMessageContentFuture(params: GetRawMessageContentRequest): Future[GetRawMessageContentResponse] =
      service.getRawMessageContent(params).promise().toFuture
  }
}

package workmailmessageflow {
  @js.native
  @JSImport("aws-sdk", "WorkMailMessageFlow")
  class WorkMailMessageFlow() extends js.Object {
    def this(config: AWSConfig) = this()

    def getRawMessageContent(params: GetRawMessageContentRequest): Request[GetRawMessageContentResponse] = js.native
  }

  @js.native
  @Factory
  trait GetRawMessageContentRequest extends js.Object {
    var messageId: messageIdType
  }

  @js.native
  @Factory
  trait GetRawMessageContentResponse extends js.Object {
    var messageContent: messageContentBlob
  }
}
