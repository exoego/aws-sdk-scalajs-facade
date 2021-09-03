package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object workmailmessageflow {
  type messageContentBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type messageIdType = String
  type s3BucketIdType = String
  type s3KeyIdType = String
  type s3VersionType = String

  implicit final class WorkMailMessageFlowOps(private val service: WorkMailMessageFlow) extends AnyVal {

    @inline def getRawMessageContentFuture(params: GetRawMessageContentRequest): Future[GetRawMessageContentResponse] = service.getRawMessageContent(params).promise().toFuture
    @inline def putRawMessageContentFuture(params: PutRawMessageContentRequest): Future[PutRawMessageContentResponse] = service.putRawMessageContent(params).promise().toFuture

  }
}

package workmailmessageflow {
  @js.native
  @JSImport("aws-sdk/clients/workmailmessageflow", JSImport.Namespace, "AWS.WorkMailMessageFlow")
  class WorkMailMessageFlow() extends js.Object {
    def this(config: AWSConfig) = this()

    def getRawMessageContent(params: GetRawMessageContentRequest): Request[GetRawMessageContentResponse] = js.native
    def putRawMessageContent(params: PutRawMessageContentRequest): Request[PutRawMessageContentResponse] = js.native
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

  @js.native
  trait PutRawMessageContentRequest extends js.Object {
    var content: RawMessageContent
    var messageId: messageIdType
  }

  object PutRawMessageContentRequest {
    @inline
    def apply(
        content: RawMessageContent,
        messageId: messageIdType
    ): PutRawMessageContentRequest = {
      val __obj = js.Dynamic.literal(
        "content" -> content.asInstanceOf[js.Any],
        "messageId" -> messageId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutRawMessageContentRequest]
    }
  }

  @js.native
  trait PutRawMessageContentResponse extends js.Object

  object PutRawMessageContentResponse {
    @inline
    def apply(): PutRawMessageContentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutRawMessageContentResponse]
    }
  }

  /** Provides the MIME content of the updated email message as an S3 object. All MIME content must meet the following criteria: * Each part of a multipart MIME message must be formatted properly. * Attachments must be of a content type that Amazon SES supports. For more information, see [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types-appendix.html|Unsupported Attachment Types]]. * If any of the MIME parts in a message contain content that is outside of the 7-bit ASCII character range, we recommend encoding that content. * Per [[https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6|RFC 5321]], the maximum length of each line of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters. * The message must contain all the required header fields. Check the returned error message for more information. * The value of immutable headers must remain unchanged. Check the returned error message for more information. * Certain unique headers can only appear once. Check
    * the returned error message for more information.
    */
  @js.native
  trait RawMessageContent extends js.Object {
    var s3Reference: S3Reference
  }

  object RawMessageContent {
    @inline
    def apply(
        s3Reference: S3Reference
    ): RawMessageContent = {
      val __obj = js.Dynamic.literal(
        "s3Reference" -> s3Reference.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RawMessageContent]
    }
  }

  /** Amazon S3 object representing the updated message content, in MIME format.
    *
    * '''Note:'''The region for the S3 bucket containing the S3 object must match the region used for WorkMail operations. Also, for WorkMail to process an S3 object, it must have permission to access that object. For more information, see [[https://docs.aws.amazon.com/workmail/latest/adminguide/update-with-lambda.html| Updating message content with AWS Lambda]].
    */
  @js.native
  trait S3Reference extends js.Object {
    var bucket: s3BucketIdType
    var key: s3KeyIdType
    var objectVersion: js.UndefOr[s3VersionType]
  }

  object S3Reference {
    @inline
    def apply(
        bucket: s3BucketIdType,
        key: s3KeyIdType,
        objectVersion: js.UndefOr[s3VersionType] = js.undefined
    ): S3Reference = {
      val __obj = js.Dynamic.literal(
        "bucket" -> bucket.asInstanceOf[js.Any],
        "key" -> key.asInstanceOf[js.Any]
      )

      objectVersion.foreach(__v => __obj.updateDynamic("objectVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Reference]
    }
  }
}
