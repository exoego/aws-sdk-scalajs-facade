package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object lexruntime {
  type Accept = String
  type AttributesString = String
  type BlobStream = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BotAlias = String
  type BotName = String
  type ButtonTextStringWithLength = String
  type ButtonValueStringWithLength = String
  type ContentType = String
  type DialogState = String
  type ErrorMessage = String
  type HttpContentType = String
  type IntentName = String
  type MessageFormatType = String
  type StringMap = js.Dictionary[String]
  type StringUrlWithLength = String
  type StringWithLength = String
  type Text = String
  type UserId = String
  type genericAttachmentList = js.Array[GenericAttachment]
  type listOfButtons = js.Array[Button]
}

package lexruntime {
  @js.native
  @JSImport("aws-sdk", "LexRuntime")
  class LexRuntime(config: AWSConfig) extends js.Object {
    def postContent(params: PostContentRequest): Request[PostContentResponse] = js.native
    def postText(params: PostTextRequest): Request[PostTextResponse] = js.native
  }

  /**
   * <p>Either the Amazon Lex bot is still building, or one of the dependent services (Amazon Polly, AWS Lambda) failed with an internal service error.</p>
   */
  @js.native
  trait BadGatewayExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p> Request validation failed, there is no usable message in the context, or the bot build failed, is still in progress, or contains unbuilt changes. </p>
   */
  @js.native
  trait BadRequestExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Represents an option to be shown on the client platform (Facebook, Slack, etc.)</p>
   */
  @js.native
  trait Button extends js.Object {
    var text: js.UndefOr[ButtonTextStringWithLength]
    var value: js.UndefOr[ButtonValueStringWithLength]
  }

  object Button {
    def apply(
      text: js.UndefOr[ButtonTextStringWithLength] = js.undefined,
      value: js.UndefOr[ButtonValueStringWithLength] = js.undefined): Button = {
      val _fields = IndexedSeq[(String, js.Any)](
        "text" -> text.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Button]
    }
  }

  /**
   * <p> Two clients are using the same AWS account, Amazon Lex bot, and user ID. </p>
   */
  @js.native
  trait ConflictExceptionException extends js.Object {
    val message: String
  }

  object ContentTypeEnum {
    val `application/vnd.amazonaws.card.generic` = "application/vnd.amazonaws.card.generic"

    val values = IndexedSeq(`application/vnd.amazonaws.card.generic`)
  }

  /**
   * <p> One of the dependencies, such as AWS Lambda or Amazon Polly, threw an exception. For example, </p> <ul> <li> <p>If Amazon Lex does not have sufficient permissions to call a Lambda function.</p> </li> <li> <p>If a Lambda function takes longer than 30 seconds to execute.</p> </li> <li> <p>If a fulfillment Lambda function returns a <code>Delegate</code> dialog action without removing any slot values.</p> </li> </ul>
   */
  @js.native
  trait DependencyFailedExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object DialogStateEnum {
    val ElicitIntent = "ElicitIntent"
    val ConfirmIntent = "ConfirmIntent"
    val ElicitSlot = "ElicitSlot"
    val Fulfilled = "Fulfilled"
    val ReadyForFulfillment = "ReadyForFulfillment"
    val Failed = "Failed"

    val values = IndexedSeq(ElicitIntent, ConfirmIntent, ElicitSlot, Fulfilled, ReadyForFulfillment, Failed)
  }

  /**
   * <p>Represents an option rendered to the user when a prompt is shown. It could be an image, a button, a link, or text. </p>
   */
  @js.native
  trait GenericAttachment extends js.Object {
    var buttons: js.UndefOr[listOfButtons]
    var subTitle: js.UndefOr[StringWithLength]
    var title: js.UndefOr[StringWithLength]
    var imageUrl: js.UndefOr[StringUrlWithLength]
    var attachmentLinkUrl: js.UndefOr[StringUrlWithLength]
  }

  object GenericAttachment {
    def apply(
      buttons: js.UndefOr[listOfButtons] = js.undefined,
      subTitle: js.UndefOr[StringWithLength] = js.undefined,
      title: js.UndefOr[StringWithLength] = js.undefined,
      imageUrl: js.UndefOr[StringUrlWithLength] = js.undefined,
      attachmentLinkUrl: js.UndefOr[StringUrlWithLength] = js.undefined): GenericAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "buttons" -> buttons.map { x => x.asInstanceOf[js.Any] },
        "subTitle" -> subTitle.map { x => x.asInstanceOf[js.Any] },
        "title" -> title.map { x => x.asInstanceOf[js.Any] },
        "imageUrl" -> imageUrl.map { x => x.asInstanceOf[js.Any] },
        "attachmentLinkUrl" -> attachmentLinkUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenericAttachment]
    }
  }

  /**
   * <p>Internal service error. Retry the call.</p>
   */
  @js.native
  trait InternalFailureExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Exceeded a limit.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val retryAfterSeconds: String
    val message: String
  }

  /**
   * <p>This exception is not used.</p>
   */
  @js.native
  trait LoopDetectedExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object MessageFormatTypeEnum {
    val PlainText = "PlainText"
    val CustomPayload = "CustomPayload"
    val SSML = "SSML"
    val Composite = "Composite"

    val values = IndexedSeq(PlainText, CustomPayload, SSML, Composite)
  }

  /**
   * <p>The accept header in the request does not have a valid value.</p>
   */
  @js.native
  trait NotAcceptableExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>The resource (such as the Amazon Lex bot or an alias) that is referred to is not found.</p>
   */
  @js.native
  trait NotFoundExceptionException extends js.Object {
    val message: String
  }

  @js.native
  trait PostContentRequest extends js.Object {
    var accept: js.UndefOr[Accept]
    var botName: js.UndefOr[BotName]
    var sessionAttributes: js.UndefOr[AttributesString]
    var contentType: js.UndefOr[HttpContentType]
    var botAlias: js.UndefOr[BotAlias]
    var userId: js.UndefOr[UserId]
    var inputStream: js.UndefOr[BlobStream]
    var requestAttributes: js.UndefOr[AttributesString]
  }

  object PostContentRequest {
    def apply(
      accept: js.UndefOr[Accept] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined,
      sessionAttributes: js.UndefOr[AttributesString] = js.undefined,
      contentType: js.UndefOr[HttpContentType] = js.undefined,
      botAlias: js.UndefOr[BotAlias] = js.undefined,
      userId: js.UndefOr[UserId] = js.undefined,
      inputStream: js.UndefOr[BlobStream] = js.undefined,
      requestAttributes: js.UndefOr[AttributesString] = js.undefined): PostContentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accept" -> accept.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "sessionAttributes" -> sessionAttributes.map { x => x.asInstanceOf[js.Any] },
        "contentType" -> contentType.map { x => x.asInstanceOf[js.Any] },
        "botAlias" -> botAlias.map { x => x.asInstanceOf[js.Any] },
        "userId" -> userId.map { x => x.asInstanceOf[js.Any] },
        "inputStream" -> inputStream.map { x => x.asInstanceOf[js.Any] },
        "requestAttributes" -> requestAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostContentRequest]
    }
  }

  @js.native
  trait PostContentResponse extends js.Object {
    var slotToElicit: js.UndefOr[String]
    var sessionAttributes: js.UndefOr[String]
    var dialogState: js.UndefOr[DialogState]
    var messageFormat: js.UndefOr[MessageFormatType]
    var audioStream: js.UndefOr[BlobStream]
    var intentName: js.UndefOr[IntentName]
    var contentType: js.UndefOr[HttpContentType]
    var slots: js.UndefOr[String]
    var message: js.UndefOr[Text]
    var inputTranscript: js.UndefOr[String]
  }

  object PostContentResponse {
    def apply(
      slotToElicit: js.UndefOr[String] = js.undefined,
      sessionAttributes: js.UndefOr[String] = js.undefined,
      dialogState: js.UndefOr[DialogState] = js.undefined,
      messageFormat: js.UndefOr[MessageFormatType] = js.undefined,
      audioStream: js.UndefOr[BlobStream] = js.undefined,
      intentName: js.UndefOr[IntentName] = js.undefined,
      contentType: js.UndefOr[HttpContentType] = js.undefined,
      slots: js.UndefOr[String] = js.undefined,
      message: js.UndefOr[Text] = js.undefined,
      inputTranscript: js.UndefOr[String] = js.undefined): PostContentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "slotToElicit" -> slotToElicit.map { x => x.asInstanceOf[js.Any] },
        "sessionAttributes" -> sessionAttributes.map { x => x.asInstanceOf[js.Any] },
        "dialogState" -> dialogState.map { x => x.asInstanceOf[js.Any] },
        "messageFormat" -> messageFormat.map { x => x.asInstanceOf[js.Any] },
        "audioStream" -> audioStream.map { x => x.asInstanceOf[js.Any] },
        "intentName" -> intentName.map { x => x.asInstanceOf[js.Any] },
        "contentType" -> contentType.map { x => x.asInstanceOf[js.Any] },
        "slots" -> slots.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "inputTranscript" -> inputTranscript.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostContentResponse]
    }
  }

  @js.native
  trait PostTextRequest extends js.Object {
    var inputText: js.UndefOr[Text]
    var botName: js.UndefOr[BotName]
    var sessionAttributes: js.UndefOr[StringMap]
    var botAlias: js.UndefOr[BotAlias]
    var userId: js.UndefOr[UserId]
    var requestAttributes: js.UndefOr[StringMap]
  }

  object PostTextRequest {
    def apply(
      inputText: js.UndefOr[Text] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined,
      sessionAttributes: js.UndefOr[StringMap] = js.undefined,
      botAlias: js.UndefOr[BotAlias] = js.undefined,
      userId: js.UndefOr[UserId] = js.undefined,
      requestAttributes: js.UndefOr[StringMap] = js.undefined): PostTextRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "inputText" -> inputText.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "sessionAttributes" -> sessionAttributes.map { x => x.asInstanceOf[js.Any] },
        "botAlias" -> botAlias.map { x => x.asInstanceOf[js.Any] },
        "userId" -> userId.map { x => x.asInstanceOf[js.Any] },
        "requestAttributes" -> requestAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostTextRequest]
    }
  }

  @js.native
  trait PostTextResponse extends js.Object {
    var slotToElicit: js.UndefOr[String]
    var responseCard: js.UndefOr[ResponseCard]
    var sessionAttributes: js.UndefOr[StringMap]
    var dialogState: js.UndefOr[DialogState]
    var messageFormat: js.UndefOr[MessageFormatType]
    var intentName: js.UndefOr[IntentName]
    var slots: js.UndefOr[StringMap]
    var message: js.UndefOr[Text]
  }

  object PostTextResponse {
    def apply(
      slotToElicit: js.UndefOr[String] = js.undefined,
      responseCard: js.UndefOr[ResponseCard] = js.undefined,
      sessionAttributes: js.UndefOr[StringMap] = js.undefined,
      dialogState: js.UndefOr[DialogState] = js.undefined,
      messageFormat: js.UndefOr[MessageFormatType] = js.undefined,
      intentName: js.UndefOr[IntentName] = js.undefined,
      slots: js.UndefOr[StringMap] = js.undefined,
      message: js.UndefOr[Text] = js.undefined): PostTextResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "slotToElicit" -> slotToElicit.map { x => x.asInstanceOf[js.Any] },
        "responseCard" -> responseCard.map { x => x.asInstanceOf[js.Any] },
        "sessionAttributes" -> sessionAttributes.map { x => x.asInstanceOf[js.Any] },
        "dialogState" -> dialogState.map { x => x.asInstanceOf[js.Any] },
        "messageFormat" -> messageFormat.map { x => x.asInstanceOf[js.Any] },
        "intentName" -> intentName.map { x => x.asInstanceOf[js.Any] },
        "slots" -> slots.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostTextResponse]
    }
  }

  /**
   * <p>The input speech is too long.</p>
   */
  @js.native
  trait RequestTimeoutExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>If you configure a response card when creating your bots, Amazon Lex substitutes the session attributes and slot values that are available, and then returns it. The response card can also come from a Lambda function ( <code>dialogCodeHook</code> and <code>fulfillmentActivity</code> on an intent).</p>
   */
  @js.native
  trait ResponseCard extends js.Object {
    var version: js.UndefOr[String]
    var contentType: js.UndefOr[ContentType]
    var genericAttachments: js.UndefOr[genericAttachmentList]
  }

  object ResponseCard {
    def apply(
      version: js.UndefOr[String] = js.undefined,
      contentType: js.UndefOr[ContentType] = js.undefined,
      genericAttachments: js.UndefOr[genericAttachmentList] = js.undefined): ResponseCard = {
      val _fields = IndexedSeq[(String, js.Any)](
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "contentType" -> contentType.map { x => x.asInstanceOf[js.Any] },
        "genericAttachments" -> genericAttachments.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResponseCard]
    }
  }

  /**
   * <p>The Content-Type header (<code>PostContent</code> API) has an invalid value. </p>
   */
  @js.native
  trait UnsupportedMediaTypeExceptionException extends js.Object {
    val message: String
  }
}
