package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object lexruntime {
  type Accept                       = String
  type AttributesString             = String
  type BlobStream                   = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BotAlias                     = String
  type BotName                      = String
  type ButtonTextStringWithLength   = String
  type ButtonValueStringWithLength  = String
  type HttpContentType              = String
  type IntentName                   = String
  type IntentSummaryCheckpointLabel = String
  type IntentSummaryList            = js.Array[IntentSummary]
  type SentimentLabel               = String
  type SentimentScore               = String
  type StringMap                    = js.Dictionary[String]
  type StringUrlWithLength          = String
  type StringWithLength             = String
  type Text                         = String
  type UserId                       = String
  type genericAttachmentList        = js.Array[GenericAttachment]
  type listOfButtons                = js.Array[Button]

  implicit final class LexRuntimeOps(private val service: LexRuntime) extends AnyVal {

    @inline def deleteSessionFuture(params: DeleteSessionRequest): Future[DeleteSessionResponse] =
      service.deleteSession(params).promise().toFuture
    @inline def getSessionFuture(params: GetSessionRequest): Future[GetSessionResponse] =
      service.getSession(params).promise().toFuture
    @inline def postContentFuture(params: PostContentRequest): Future[PostContentResponse] =
      service.postContent(params).promise().toFuture
    @inline def postTextFuture(params: PostTextRequest): Future[PostTextResponse] =
      service.postText(params).promise().toFuture
    @inline def putSessionFuture(params: PutSessionRequest): Future[PutSessionResponse] =
      service.putSession(params).promise().toFuture
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
  @Factory
  trait Button extends js.Object {
    var text: ButtonTextStringWithLength
    var value: ButtonValueStringWithLength
  }

  @js.native
  sealed trait ConfirmationStatus extends js.Any
  object ConfirmationStatus extends js.Object {
    val None      = "None".asInstanceOf[ConfirmationStatus]
    val Confirmed = "Confirmed".asInstanceOf[ConfirmationStatus]
    val Denied    = "Denied".asInstanceOf[ConfirmationStatus]

    val values = js.Object.freeze(js.Array(None, Confirmed, Denied))
  }

  @js.native
  sealed trait ContentType extends js.Any
  object ContentType extends js.Object {
    val `application/vnd.amazonaws.card.generic` = "application/vnd.amazonaws.card.generic".asInstanceOf[ContentType]

    val values = js.Object.freeze(js.Array(`application/vnd.amazonaws.card.generic`))
  }

  @js.native
  @Factory
  trait DeleteSessionRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var userId: UserId
  }

  @js.native
  @Factory
  trait DeleteSessionResponse extends js.Object {
    var botAlias: js.UndefOr[BotAlias]
    var botName: js.UndefOr[BotName]
    var sessionId: js.UndefOr[String]
    var userId: js.UndefOr[UserId]
  }

  /**
    * Describes the next action that the bot should take in its interaction with the user and provides information about the context in which the action takes place. Use the <code>DialogAction</code> data type to set the interaction to a specific state, or to return the interaction to a previous state.
    */
  @js.native
  @Factory
  trait DialogAction extends js.Object {
    var `type`: DialogActionType
    var fulfillmentState: js.UndefOr[FulfillmentState]
    var intentName: js.UndefOr[IntentName]
    var message: js.UndefOr[Text]
    var messageFormat: js.UndefOr[MessageFormatType]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[StringMap]
  }

  @js.native
  sealed trait DialogActionType extends js.Any
  object DialogActionType extends js.Object {
    val ElicitIntent  = "ElicitIntent".asInstanceOf[DialogActionType]
    val ConfirmIntent = "ConfirmIntent".asInstanceOf[DialogActionType]
    val ElicitSlot    = "ElicitSlot".asInstanceOf[DialogActionType]
    val Close         = "Close".asInstanceOf[DialogActionType]
    val Delegate      = "Delegate".asInstanceOf[DialogActionType]

    val values = js.Object.freeze(js.Array(ElicitIntent, ConfirmIntent, ElicitSlot, Close, Delegate))
  }

  @js.native
  sealed trait DialogState extends js.Any
  object DialogState extends js.Object {
    val ElicitIntent        = "ElicitIntent".asInstanceOf[DialogState]
    val ConfirmIntent       = "ConfirmIntent".asInstanceOf[DialogState]
    val ElicitSlot          = "ElicitSlot".asInstanceOf[DialogState]
    val Fulfilled           = "Fulfilled".asInstanceOf[DialogState]
    val ReadyForFulfillment = "ReadyForFulfillment".asInstanceOf[DialogState]
    val Failed              = "Failed".asInstanceOf[DialogState]

    val values =
      js.Object.freeze(js.Array(ElicitIntent, ConfirmIntent, ElicitSlot, Fulfilled, ReadyForFulfillment, Failed))
  }

  @js.native
  sealed trait FulfillmentState extends js.Any
  object FulfillmentState extends js.Object {
    val Fulfilled           = "Fulfilled".asInstanceOf[FulfillmentState]
    val Failed              = "Failed".asInstanceOf[FulfillmentState]
    val ReadyForFulfillment = "ReadyForFulfillment".asInstanceOf[FulfillmentState]

    val values = js.Object.freeze(js.Array(Fulfilled, Failed, ReadyForFulfillment))
  }

  /**
    * Represents an option rendered to the user when a prompt is shown. It could be an image, a button, a link, or text.
    */
  @js.native
  @Factory
  trait GenericAttachment extends js.Object {
    var attachmentLinkUrl: js.UndefOr[StringUrlWithLength]
    var buttons: js.UndefOr[listOfButtons]
    var imageUrl: js.UndefOr[StringUrlWithLength]
    var subTitle: js.UndefOr[StringWithLength]
    var title: js.UndefOr[StringWithLength]
  }

  @js.native
  @Factory
  trait GetSessionRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var userId: UserId
    var checkpointLabelFilter: js.UndefOr[IntentSummaryCheckpointLabel]
  }

  @js.native
  @Factory
  trait GetSessionResponse extends js.Object {
    var dialogAction: js.UndefOr[DialogAction]
    var recentIntentSummaryView: js.UndefOr[IntentSummaryList]
    var sessionAttributes: js.UndefOr[StringMap]
    var sessionId: js.UndefOr[String]
  }

  /**
    * Provides information about the state of an intent. You can use this information to get the current state of an intent so that you can process the intent, or so that you can return the intent to its previous state.
    */
  @js.native
  @Factory
  trait IntentSummary extends js.Object {
    var dialogActionType: DialogActionType
    var checkpointLabel: js.UndefOr[IntentSummaryCheckpointLabel]
    var confirmationStatus: js.UndefOr[ConfirmationStatus]
    var fulfillmentState: js.UndefOr[FulfillmentState]
    var intentName: js.UndefOr[IntentName]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[StringMap]
  }

  @js.native
  sealed trait MessageFormatType extends js.Any
  object MessageFormatType extends js.Object {
    val PlainText     = "PlainText".asInstanceOf[MessageFormatType]
    val CustomPayload = "CustomPayload".asInstanceOf[MessageFormatType]
    val SSML          = "SSML".asInstanceOf[MessageFormatType]
    val Composite     = "Composite".asInstanceOf[MessageFormatType]

    val values = js.Object.freeze(js.Array(PlainText, CustomPayload, SSML, Composite))
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait PostContentResponse extends js.Object {
    var audioStream: js.UndefOr[BlobStream]
    var contentType: js.UndefOr[HttpContentType]
    var dialogState: js.UndefOr[DialogState]
    var inputTranscript: js.UndefOr[String]
    var intentName: js.UndefOr[IntentName]
    var message: js.UndefOr[Text]
    var messageFormat: js.UndefOr[MessageFormatType]
    var sentimentResponse: js.UndefOr[String]
    var sessionAttributes: js.UndefOr[String]
    var sessionId: js.UndefOr[String]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PostTextRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var inputText: Text
    var userId: UserId
    var requestAttributes: js.UndefOr[StringMap]
    var sessionAttributes: js.UndefOr[StringMap]
  }

  @js.native
  @Factory
  trait PostTextResponse extends js.Object {
    var dialogState: js.UndefOr[DialogState]
    var intentName: js.UndefOr[IntentName]
    var message: js.UndefOr[Text]
    var messageFormat: js.UndefOr[MessageFormatType]
    var responseCard: js.UndefOr[ResponseCard]
    var sentimentResponse: js.UndefOr[SentimentResponse]
    var sessionAttributes: js.UndefOr[StringMap]
    var sessionId: js.UndefOr[String]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[StringMap]
  }

  @js.native
  @Factory
  trait PutSessionRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var userId: UserId
    var accept: js.UndefOr[Accept]
    var dialogAction: js.UndefOr[DialogAction]
    var recentIntentSummaryView: js.UndefOr[IntentSummaryList]
    var sessionAttributes: js.UndefOr[StringMap]
  }

  @js.native
  @Factory
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

  /**
    * If you configure a response card when creating your bots, Amazon Lex substitutes the session attributes and slot values that are available, and then returns it. The response card can also come from a Lambda function ( <code>dialogCodeHook</code> and <code>fulfillmentActivity</code> on an intent).
    */
  @js.native
  @Factory
  trait ResponseCard extends js.Object {
    var contentType: js.UndefOr[ContentType]
    var genericAttachments: js.UndefOr[genericAttachmentList]
    var version: js.UndefOr[String]
  }

  /**
    * The sentiment expressed in an utterance.
    *  When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field structure contains the result of the analysis.
    */
  @js.native
  @Factory
  trait SentimentResponse extends js.Object {
    var sentimentLabel: js.UndefOr[SentimentLabel]
    var sentimentScore: js.UndefOr[SentimentScore]
  }
}
