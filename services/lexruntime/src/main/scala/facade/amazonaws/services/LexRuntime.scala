package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object lexruntime {
  type Accept           = String
  type AttributesString = String
  type BlobStream =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BotAlias                    = String
  type BotName                     = String
  type ButtonTextStringWithLength  = String
  type ButtonValueStringWithLength = String
  type ConfirmationStatus          = String
  type ContentType                 = String
  type DialogActionType            = String
  type DialogState                 = String
  type FulfillmentState            = String
  type HttpContentType             = String
  type IntentName                  = String
  type IntentSummaryList           = js.Array[IntentSummary]
  type MessageFormatType           = String
  type StringMap                   = js.Dictionary[String]
  type StringUrlWithLength         = String
  type StringWithLength            = String
  type Text                        = String
  type UserId                      = String
  type genericAttachmentList       = js.Array[GenericAttachment]
  type listOfButtons               = js.Array[Button]

  implicit final class LexRuntimeOps(private val service: LexRuntime) extends AnyVal {

    def deleteSessionFuture(params: DeleteSessionRequest): Future[DeleteSessionResponse] =
      service.deleteSession(params).promise.toFuture
    def getSessionFuture(params: GetSessionRequest): Future[GetSessionResponse] =
      service.getSession(params).promise.toFuture
    def postContentFuture(params: PostContentRequest): Future[PostContentResponse] =
      service.postContent(params).promise.toFuture
    def postTextFuture(params: PostTextRequest): Future[PostTextResponse] = service.postText(params).promise.toFuture
    def putSessionFuture(params: PutSessionRequest): Future[PutSessionResponse] =
      service.putSession(params).promise.toFuture
  }
}

package lexruntime {
  @js.native
  @JSImport("aws-sdk", "LexRuntime")
  class LexRuntime() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteSession(params: DeleteSessionRequest): Request[DeleteSessionResponse] = js.native
    def getSession(params: GetSessionRequest): Request[GetSessionResponse]          = js.native
    def postContent(params: PostContentRequest): Request[PostContentResponse]       = js.native
    def postText(params: PostTextRequest): Request[PostTextResponse]                = js.native
    def putSession(params: PutSessionRequest): Request[PutSessionResponse]          = js.native
  }

  /**
    * Represents an option to be shown on the client platform (Facebook, Slack, etc.)
    */
  @js.native
  trait Button extends js.Object {
    var text: ButtonTextStringWithLength
    var value: ButtonValueStringWithLength
  }

  object Button {
    def apply(
        text: ButtonTextStringWithLength,
        value: ButtonValueStringWithLength
    ): Button = {
      val __obj = js.Dictionary[js.Any](
        "text"  -> text.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Button]
    }
  }

  object ConfirmationStatusEnum {
    val None      = "None"
    val Confirmed = "Confirmed"
    val Denied    = "Denied"

    val values = js.Object.freeze(js.Array(None, Confirmed, Denied))
  }

  object ContentTypeEnum {
    val `application/vnd.amazonaws.card.generic` = "application/vnd.amazonaws.card.generic"

    val values = js.Object.freeze(js.Array(`application/vnd.amazonaws.card.generic`))
  }

  @js.native
  trait DeleteSessionRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var userId: UserId
  }

  object DeleteSessionRequest {
    def apply(
        botAlias: BotAlias,
        botName: BotName,
        userId: UserId
    ): DeleteSessionRequest = {
      val __obj = js.Dictionary[js.Any](
        "botAlias" -> botAlias.asInstanceOf[js.Any],
        "botName"  -> botName.asInstanceOf[js.Any],
        "userId"   -> userId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSessionRequest]
    }
  }

  @js.native
  trait DeleteSessionResponse extends js.Object {
    var botAlias: js.UndefOr[BotAlias]
    var botName: js.UndefOr[BotName]
    var sessionId: js.UndefOr[String]
    var userId: js.UndefOr[UserId]
  }

  object DeleteSessionResponse {
    def apply(
        botAlias: js.UndefOr[BotAlias] = js.undefined,
        botName: js.UndefOr[BotName] = js.undefined,
        sessionId: js.UndefOr[String] = js.undefined,
        userId: js.UndefOr[UserId] = js.undefined
    ): DeleteSessionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      botAlias.foreach(__v => __obj.update("botAlias", __v.asInstanceOf[js.Any]))
      botName.foreach(__v => __obj.update("botName", __v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.update("sessionId", __v.asInstanceOf[js.Any]))
      userId.foreach(__v => __obj.update("userId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSessionResponse]
    }
  }

  /**
    * Describes the next action that the bot should take in its interaction with the user and provides information about the context in which the action takes place. Use the <code>DialogAction</code> data type to set the interaction to a specific state, or to return the interaction to a previous state.
    */
  @js.native
  trait DialogAction extends js.Object {
    var `type`: DialogActionType
    var fulfillmentState: js.UndefOr[FulfillmentState]
    var intentName: js.UndefOr[IntentName]
    var message: js.UndefOr[Text]
    var messageFormat: js.UndefOr[MessageFormatType]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[StringMap]
  }

  object DialogAction {
    def apply(
        `type`: DialogActionType,
        fulfillmentState: js.UndefOr[FulfillmentState] = js.undefined,
        intentName: js.UndefOr[IntentName] = js.undefined,
        message: js.UndefOr[Text] = js.undefined,
        messageFormat: js.UndefOr[MessageFormatType] = js.undefined,
        slotToElicit: js.UndefOr[String] = js.undefined,
        slots: js.UndefOr[StringMap] = js.undefined
    ): DialogAction = {
      val __obj = js.Dictionary[js.Any](
        "type" -> `type`.asInstanceOf[js.Any]
      )

      fulfillmentState.foreach(__v => __obj.update("fulfillmentState", __v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.update("intentName", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      messageFormat.foreach(__v => __obj.update("messageFormat", __v.asInstanceOf[js.Any]))
      slotToElicit.foreach(__v => __obj.update("slotToElicit", __v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.update("slots", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DialogAction]
    }
  }

  object DialogActionTypeEnum {
    val ElicitIntent  = "ElicitIntent"
    val ConfirmIntent = "ConfirmIntent"
    val ElicitSlot    = "ElicitSlot"
    val Close         = "Close"
    val Delegate      = "Delegate"

    val values = js.Object.freeze(js.Array(ElicitIntent, ConfirmIntent, ElicitSlot, Close, Delegate))
  }

  object DialogStateEnum {
    val ElicitIntent        = "ElicitIntent"
    val ConfirmIntent       = "ConfirmIntent"
    val ElicitSlot          = "ElicitSlot"
    val Fulfilled           = "Fulfilled"
    val ReadyForFulfillment = "ReadyForFulfillment"
    val Failed              = "Failed"

    val values =
      js.Object.freeze(js.Array(ElicitIntent, ConfirmIntent, ElicitSlot, Fulfilled, ReadyForFulfillment, Failed))
  }

  object FulfillmentStateEnum {
    val Fulfilled           = "Fulfilled"
    val Failed              = "Failed"
    val ReadyForFulfillment = "ReadyForFulfillment"

    val values = js.Object.freeze(js.Array(Fulfilled, Failed, ReadyForFulfillment))
  }

  /**
    * Represents an option rendered to the user when a prompt is shown. It could be an image, a button, a link, or text.
    */
  @js.native
  trait GenericAttachment extends js.Object {
    var attachmentLinkUrl: js.UndefOr[StringUrlWithLength]
    var buttons: js.UndefOr[listOfButtons]
    var imageUrl: js.UndefOr[StringUrlWithLength]
    var subTitle: js.UndefOr[StringWithLength]
    var title: js.UndefOr[StringWithLength]
  }

  object GenericAttachment {
    def apply(
        attachmentLinkUrl: js.UndefOr[StringUrlWithLength] = js.undefined,
        buttons: js.UndefOr[listOfButtons] = js.undefined,
        imageUrl: js.UndefOr[StringUrlWithLength] = js.undefined,
        subTitle: js.UndefOr[StringWithLength] = js.undefined,
        title: js.UndefOr[StringWithLength] = js.undefined
    ): GenericAttachment = {
      val __obj = js.Dictionary.empty[js.Any]
      attachmentLinkUrl.foreach(__v => __obj.update("attachmentLinkUrl", __v.asInstanceOf[js.Any]))
      buttons.foreach(__v => __obj.update("buttons", __v.asInstanceOf[js.Any]))
      imageUrl.foreach(__v => __obj.update("imageUrl", __v.asInstanceOf[js.Any]))
      subTitle.foreach(__v => __obj.update("subTitle", __v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.update("title", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenericAttachment]
    }
  }

  @js.native
  trait GetSessionRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var userId: UserId
  }

  object GetSessionRequest {
    def apply(
        botAlias: BotAlias,
        botName: BotName,
        userId: UserId
    ): GetSessionRequest = {
      val __obj = js.Dictionary[js.Any](
        "botAlias" -> botAlias.asInstanceOf[js.Any],
        "botName"  -> botName.asInstanceOf[js.Any],
        "userId"   -> userId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSessionRequest]
    }
  }

  @js.native
  trait GetSessionResponse extends js.Object {
    var dialogAction: js.UndefOr[DialogAction]
    var recentIntentSummaryView: js.UndefOr[IntentSummaryList]
    var sessionAttributes: js.UndefOr[StringMap]
    var sessionId: js.UndefOr[String]
  }

  object GetSessionResponse {
    def apply(
        dialogAction: js.UndefOr[DialogAction] = js.undefined,
        recentIntentSummaryView: js.UndefOr[IntentSummaryList] = js.undefined,
        sessionAttributes: js.UndefOr[StringMap] = js.undefined,
        sessionId: js.UndefOr[String] = js.undefined
    ): GetSessionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      dialogAction.foreach(__v => __obj.update("dialogAction", __v.asInstanceOf[js.Any]))
      recentIntentSummaryView.foreach(__v => __obj.update("recentIntentSummaryView", __v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.update("sessionAttributes", __v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.update("sessionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSessionResponse]
    }
  }

  /**
    * Provides information about the state of an intent. You can use this information to get the current state of an intent so that you can process the intent, or so that you can return the intent to its previous state.
    */
  @js.native
  trait IntentSummary extends js.Object {
    var dialogActionType: DialogActionType
    var confirmationStatus: js.UndefOr[ConfirmationStatus]
    var fulfillmentState: js.UndefOr[FulfillmentState]
    var intentName: js.UndefOr[IntentName]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[StringMap]
  }

  object IntentSummary {
    def apply(
        dialogActionType: DialogActionType,
        confirmationStatus: js.UndefOr[ConfirmationStatus] = js.undefined,
        fulfillmentState: js.UndefOr[FulfillmentState] = js.undefined,
        intentName: js.UndefOr[IntentName] = js.undefined,
        slotToElicit: js.UndefOr[String] = js.undefined,
        slots: js.UndefOr[StringMap] = js.undefined
    ): IntentSummary = {
      val __obj = js.Dictionary[js.Any](
        "dialogActionType" -> dialogActionType.asInstanceOf[js.Any]
      )

      confirmationStatus.foreach(__v => __obj.update("confirmationStatus", __v.asInstanceOf[js.Any]))
      fulfillmentState.foreach(__v => __obj.update("fulfillmentState", __v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.update("intentName", __v.asInstanceOf[js.Any]))
      slotToElicit.foreach(__v => __obj.update("slotToElicit", __v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.update("slots", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntentSummary]
    }
  }

  object MessageFormatTypeEnum {
    val PlainText     = "PlainText"
    val CustomPayload = "CustomPayload"
    val SSML          = "SSML"
    val Composite     = "Composite"

    val values = js.Object.freeze(js.Array(PlainText, CustomPayload, SSML, Composite))
  }

  @js.native
  trait PostContentRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var contentType: HttpContentType
    var inputStream: BlobStream
    var userId: UserId
    var accept: js.UndefOr[Accept]
    var requestAttributes: js.UndefOr[AttributesString]
    var sessionAttributes: js.UndefOr[AttributesString]
  }

  object PostContentRequest {
    def apply(
        botAlias: BotAlias,
        botName: BotName,
        contentType: HttpContentType,
        inputStream: BlobStream,
        userId: UserId,
        accept: js.UndefOr[Accept] = js.undefined,
        requestAttributes: js.UndefOr[AttributesString] = js.undefined,
        sessionAttributes: js.UndefOr[AttributesString] = js.undefined
    ): PostContentRequest = {
      val __obj = js.Dictionary[js.Any](
        "botAlias"    -> botAlias.asInstanceOf[js.Any],
        "botName"     -> botName.asInstanceOf[js.Any],
        "contentType" -> contentType.asInstanceOf[js.Any],
        "inputStream" -> inputStream.asInstanceOf[js.Any],
        "userId"      -> userId.asInstanceOf[js.Any]
      )

      accept.foreach(__v => __obj.update("accept", __v.asInstanceOf[js.Any]))
      requestAttributes.foreach(__v => __obj.update("requestAttributes", __v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.update("sessionAttributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostContentRequest]
    }
  }

  @js.native
  trait PostContentResponse extends js.Object {
    var audioStream: js.UndefOr[BlobStream]
    var contentType: js.UndefOr[HttpContentType]
    var dialogState: js.UndefOr[DialogState]
    var inputTranscript: js.UndefOr[String]
    var intentName: js.UndefOr[IntentName]
    var message: js.UndefOr[Text]
    var messageFormat: js.UndefOr[MessageFormatType]
    var sessionAttributes: js.UndefOr[String]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[String]
  }

  object PostContentResponse {
    def apply(
        audioStream: js.UndefOr[BlobStream] = js.undefined,
        contentType: js.UndefOr[HttpContentType] = js.undefined,
        dialogState: js.UndefOr[DialogState] = js.undefined,
        inputTranscript: js.UndefOr[String] = js.undefined,
        intentName: js.UndefOr[IntentName] = js.undefined,
        message: js.UndefOr[Text] = js.undefined,
        messageFormat: js.UndefOr[MessageFormatType] = js.undefined,
        sessionAttributes: js.UndefOr[String] = js.undefined,
        slotToElicit: js.UndefOr[String] = js.undefined,
        slots: js.UndefOr[String] = js.undefined
    ): PostContentResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      audioStream.foreach(__v => __obj.update("audioStream", __v.asInstanceOf[js.Any]))
      contentType.foreach(__v => __obj.update("contentType", __v.asInstanceOf[js.Any]))
      dialogState.foreach(__v => __obj.update("dialogState", __v.asInstanceOf[js.Any]))
      inputTranscript.foreach(__v => __obj.update("inputTranscript", __v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.update("intentName", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      messageFormat.foreach(__v => __obj.update("messageFormat", __v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.update("sessionAttributes", __v.asInstanceOf[js.Any]))
      slotToElicit.foreach(__v => __obj.update("slotToElicit", __v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.update("slots", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostContentResponse]
    }
  }

  @js.native
  trait PostTextRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var inputText: Text
    var userId: UserId
    var requestAttributes: js.UndefOr[StringMap]
    var sessionAttributes: js.UndefOr[StringMap]
  }

  object PostTextRequest {
    def apply(
        botAlias: BotAlias,
        botName: BotName,
        inputText: Text,
        userId: UserId,
        requestAttributes: js.UndefOr[StringMap] = js.undefined,
        sessionAttributes: js.UndefOr[StringMap] = js.undefined
    ): PostTextRequest = {
      val __obj = js.Dictionary[js.Any](
        "botAlias"  -> botAlias.asInstanceOf[js.Any],
        "botName"   -> botName.asInstanceOf[js.Any],
        "inputText" -> inputText.asInstanceOf[js.Any],
        "userId"    -> userId.asInstanceOf[js.Any]
      )

      requestAttributes.foreach(__v => __obj.update("requestAttributes", __v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.update("sessionAttributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostTextRequest]
    }
  }

  @js.native
  trait PostTextResponse extends js.Object {
    var dialogState: js.UndefOr[DialogState]
    var intentName: js.UndefOr[IntentName]
    var message: js.UndefOr[Text]
    var messageFormat: js.UndefOr[MessageFormatType]
    var responseCard: js.UndefOr[ResponseCard]
    var sessionAttributes: js.UndefOr[StringMap]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[StringMap]
  }

  object PostTextResponse {
    def apply(
        dialogState: js.UndefOr[DialogState] = js.undefined,
        intentName: js.UndefOr[IntentName] = js.undefined,
        message: js.UndefOr[Text] = js.undefined,
        messageFormat: js.UndefOr[MessageFormatType] = js.undefined,
        responseCard: js.UndefOr[ResponseCard] = js.undefined,
        sessionAttributes: js.UndefOr[StringMap] = js.undefined,
        slotToElicit: js.UndefOr[String] = js.undefined,
        slots: js.UndefOr[StringMap] = js.undefined
    ): PostTextResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      dialogState.foreach(__v => __obj.update("dialogState", __v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.update("intentName", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      messageFormat.foreach(__v => __obj.update("messageFormat", __v.asInstanceOf[js.Any]))
      responseCard.foreach(__v => __obj.update("responseCard", __v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.update("sessionAttributes", __v.asInstanceOf[js.Any]))
      slotToElicit.foreach(__v => __obj.update("slotToElicit", __v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.update("slots", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostTextResponse]
    }
  }

  @js.native
  trait PutSessionRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var userId: UserId
    var accept: js.UndefOr[Accept]
    var dialogAction: js.UndefOr[DialogAction]
    var sessionAttributes: js.UndefOr[StringMap]
  }

  object PutSessionRequest {
    def apply(
        botAlias: BotAlias,
        botName: BotName,
        userId: UserId,
        accept: js.UndefOr[Accept] = js.undefined,
        dialogAction: js.UndefOr[DialogAction] = js.undefined,
        sessionAttributes: js.UndefOr[StringMap] = js.undefined
    ): PutSessionRequest = {
      val __obj = js.Dictionary[js.Any](
        "botAlias" -> botAlias.asInstanceOf[js.Any],
        "botName"  -> botName.asInstanceOf[js.Any],
        "userId"   -> userId.asInstanceOf[js.Any]
      )

      accept.foreach(__v => __obj.update("accept", __v.asInstanceOf[js.Any]))
      dialogAction.foreach(__v => __obj.update("dialogAction", __v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.update("sessionAttributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSessionRequest]
    }
  }

  @js.native
  trait PutSessionResponse extends js.Object {
    var audioStream: js.UndefOr[BlobStream]
    var contentType: js.UndefOr[HttpContentType]
    var dialogState: js.UndefOr[DialogState]
    var intentName: js.UndefOr[IntentName]
    var message: js.UndefOr[Text]
    var messageFormat: js.UndefOr[MessageFormatType]
    var sessionAttributes: js.UndefOr[String]
    var sessionId: js.UndefOr[String]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[String]
  }

  object PutSessionResponse {
    def apply(
        audioStream: js.UndefOr[BlobStream] = js.undefined,
        contentType: js.UndefOr[HttpContentType] = js.undefined,
        dialogState: js.UndefOr[DialogState] = js.undefined,
        intentName: js.UndefOr[IntentName] = js.undefined,
        message: js.UndefOr[Text] = js.undefined,
        messageFormat: js.UndefOr[MessageFormatType] = js.undefined,
        sessionAttributes: js.UndefOr[String] = js.undefined,
        sessionId: js.UndefOr[String] = js.undefined,
        slotToElicit: js.UndefOr[String] = js.undefined,
        slots: js.UndefOr[String] = js.undefined
    ): PutSessionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      audioStream.foreach(__v => __obj.update("audioStream", __v.asInstanceOf[js.Any]))
      contentType.foreach(__v => __obj.update("contentType", __v.asInstanceOf[js.Any]))
      dialogState.foreach(__v => __obj.update("dialogState", __v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.update("intentName", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      messageFormat.foreach(__v => __obj.update("messageFormat", __v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.update("sessionAttributes", __v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.update("sessionId", __v.asInstanceOf[js.Any]))
      slotToElicit.foreach(__v => __obj.update("slotToElicit", __v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.update("slots", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSessionResponse]
    }
  }

  /**
    * If you configure a response card when creating your bots, Amazon Lex substitutes the session attributes and slot values that are available, and then returns it. The response card can also come from a Lambda function ( <code>dialogCodeHook</code> and <code>fulfillmentActivity</code> on an intent).
    */
  @js.native
  trait ResponseCard extends js.Object {
    var contentType: js.UndefOr[ContentType]
    var genericAttachments: js.UndefOr[genericAttachmentList]
    var version: js.UndefOr[String]
  }

  object ResponseCard {
    def apply(
        contentType: js.UndefOr[ContentType] = js.undefined,
        genericAttachments: js.UndefOr[genericAttachmentList] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): ResponseCard = {
      val __obj = js.Dictionary.empty[js.Any]
      contentType.foreach(__v => __obj.update("contentType", __v.asInstanceOf[js.Any]))
      genericAttachments.foreach(__v => __obj.update("genericAttachments", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseCard]
    }
  }
}
