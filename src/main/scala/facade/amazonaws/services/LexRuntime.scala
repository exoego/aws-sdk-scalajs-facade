package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
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
  type ContentType                 = String
  type DialogState                 = String
  type ErrorMessage                = String
  type HttpContentType             = String
  type IntentName                  = String
  type MessageFormatType           = String
  type StringMap                   = js.Dictionary[String]
  type StringUrlWithLength         = String
  type StringWithLength            = String
  type Text                        = String
  type UserId                      = String
  type genericAttachmentList       = js.Array[GenericAttachment]
  type listOfButtons               = js.Array[Button]
}

package lexruntime {
  @js.native
  @JSImport("aws-sdk", "LexRuntime")
  class LexRuntime() extends js.Object {
    def this(config: AWSConfig) = this()

    def postContent(params: PostContentRequest): Request[PostContentResponse] = js.native
    def postText(params: PostTextRequest): Request[PostTextResponse]          = js.native
  }

  /**
    * Either the Amazon Lex bot is still building, or one of the dependent services (Amazon Polly, AWS Lambda) failed with an internal service error.
    */
  @js.native
  trait BadGatewayExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
    * Request validation failed, there is no usable message in the context, or the bot build failed, is still in progress, or contains unbuilt changes.
    */
  @js.native
  trait BadRequestExceptionException extends js.Object {
    val message: String
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
      val _fields = IndexedSeq[(String, js.Any)](
        "text"  -> text.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Button]
    }
  }

  /**
    * Two clients are using the same AWS account, Amazon Lex bot, and user ID.
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
    * One of the dependencies, such as AWS Lambda or Amazon Polly, threw an exception. For example,
    * * If Amazon Lex does not have sufficient permissions to call a Lambda function.
    *  * If a Lambda function takes longer than 30 seconds to execute.
    *  * If a fulfillment Lambda function returns a <code>Delegate</code> dialog action without removing any slot values.
    */
  @js.native
  trait DependencyFailedExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object DialogStateEnum {
    val ElicitIntent        = "ElicitIntent"
    val ConfirmIntent       = "ConfirmIntent"
    val ElicitSlot          = "ElicitSlot"
    val Fulfilled           = "Fulfilled"
    val ReadyForFulfillment = "ReadyForFulfillment"
    val Failed              = "Failed"

    val values = IndexedSeq(ElicitIntent, ConfirmIntent, ElicitSlot, Fulfilled, ReadyForFulfillment, Failed)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "attachmentLinkUrl" -> attachmentLinkUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "buttons" -> buttons.map { x =>
          x.asInstanceOf[js.Any]
        },
        "imageUrl" -> imageUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "subTitle" -> subTitle.map { x =>
          x.asInstanceOf[js.Any]
        },
        "title" -> title.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenericAttachment]
    }
  }

  /**
    * Internal service error. Retry the call.
    */
  @js.native
  trait InternalFailureExceptionException extends js.Object {
    val message: String
  }

  /**
    * Exceeded a limit.
    */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val retryAfterSeconds: String
    val message: String
  }

  /**
    * This exception is not used.
    */
  @js.native
  trait LoopDetectedExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object MessageFormatTypeEnum {
    val PlainText     = "PlainText"
    val CustomPayload = "CustomPayload"
    val SSML          = "SSML"
    val Composite     = "Composite"

    val values = IndexedSeq(PlainText, CustomPayload, SSML, Composite)
  }

  /**
    * The accept header in the request does not have a valid value.
    */
  @js.native
  trait NotAcceptableExceptionException extends js.Object {
    val message: String
  }

  /**
    * The resource (such as the Amazon Lex bot or an alias) that is referred to is not found.
    */
  @js.native
  trait NotFoundExceptionException extends js.Object {
    val message: String
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
      val _fields = IndexedSeq[(String, js.Any)](
        "botAlias"    -> botAlias.asInstanceOf[js.Any],
        "botName"     -> botName.asInstanceOf[js.Any],
        "contentType" -> contentType.asInstanceOf[js.Any],
        "inputStream" -> inputStream.asInstanceOf[js.Any],
        "userId"      -> userId.asInstanceOf[js.Any],
        "accept" -> accept.map { x =>
          x.asInstanceOf[js.Any]
        },
        "requestAttributes" -> requestAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sessionAttributes" -> sessionAttributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostContentRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "audioStream" -> audioStream.map { x =>
          x.asInstanceOf[js.Any]
        },
        "contentType" -> contentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "dialogState" -> dialogState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "inputTranscript" -> inputTranscript.map { x =>
          x.asInstanceOf[js.Any]
        },
        "intentName" -> intentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "message" -> message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "messageFormat" -> messageFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sessionAttributes" -> sessionAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "slotToElicit" -> slotToElicit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "slots" -> slots.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostContentResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "botAlias"  -> botAlias.asInstanceOf[js.Any],
        "botName"   -> botName.asInstanceOf[js.Any],
        "inputText" -> inputText.asInstanceOf[js.Any],
        "userId"    -> userId.asInstanceOf[js.Any],
        "requestAttributes" -> requestAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sessionAttributes" -> sessionAttributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostTextRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "dialogState" -> dialogState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "intentName" -> intentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "message" -> message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "messageFormat" -> messageFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "responseCard" -> responseCard.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sessionAttributes" -> sessionAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "slotToElicit" -> slotToElicit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "slots" -> slots.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostTextResponse]
    }
  }

  /**
    * The input speech is too long.
    */
  @js.native
  trait RequestTimeoutExceptionException extends js.Object {
    val message: String
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
      val _fields = IndexedSeq[(String, js.Any)](
        "contentType" -> contentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "genericAttachments" -> genericAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResponseCard]
    }
  }

  /**
    * The Content-Type header (<code>PostContent</code> API) has an invalid value.
    */
  @js.native
  trait UnsupportedMediaTypeExceptionException extends js.Object {
    val message: String
  }
}
