package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object lexruntime {
  type Accept = String
  type ActiveContextName = String
  type ActiveContextParametersMap = js.Dictionary[Text]
  type ActiveContextTimeToLiveInSeconds = Int
  type ActiveContextTurnsToLive = Int
  type ActiveContextsList = js.Array[ActiveContext]
  type ActiveContextsString = String
  type AttributesString = String
  type BlobStream = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BotAlias = String
  type BotName = String
  type BotVersion = String
  type ButtonTextStringWithLength = String
  type ButtonValueStringWithLength = String
  type HttpContentType = String
  type IntentList = js.Array[PredictedIntent]
  type IntentName = String
  type IntentSummaryCheckpointLabel = String
  type IntentSummaryList = js.Array[IntentSummary]
  type ParameterName = String
  type SensitiveString = String
  type SensitiveStringUnbounded = String
  type SentimentLabel = String
  type SentimentScore = String
  type StringMap = js.Dictionary[String]
  type StringUrlWithLength = String
  type StringWithLength = String
  type Text = String
  type UserId = String
  type genericAttachmentList = js.Array[GenericAttachment]
  type listOfButtons = js.Array[Button]

  implicit final class LexRuntimeOps(private val service: LexRuntime) extends AnyVal {

    @inline def deleteSessionFuture(params: DeleteSessionRequest): Future[DeleteSessionResponse] = service.deleteSession(params).promise().toFuture
    @inline def getSessionFuture(params: GetSessionRequest): Future[GetSessionResponse] = service.getSession(params).promise().toFuture
    @inline def postContentFuture(params: PostContentRequest): Future[PostContentResponse] = service.postContent(params).promise().toFuture
    @inline def postTextFuture(params: PostTextRequest): Future[PostTextResponse] = service.postText(params).promise().toFuture
    @inline def putSessionFuture(params: PutSessionRequest): Future[PutSessionResponse] = service.putSession(params).promise().toFuture

  }
}

package lexruntime {
  @js.native
  @JSImport("aws-sdk/clients/lexruntime", JSImport.Namespace, "AWS.LexRuntime")
  class LexRuntime() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteSession(params: DeleteSessionRequest): Request[DeleteSessionResponse] = js.native
    def getSession(params: GetSessionRequest): Request[GetSessionResponse] = js.native
    def postContent(params: PostContentRequest): Request[PostContentResponse] = js.native
    def postText(params: PostTextRequest): Request[PostTextResponse] = js.native
    def putSession(params: PutSessionRequest): Request[PutSessionResponse] = js.native
  }

  /** A context is a variable that contains information about the current state of the conversation between a user and Amazon Lex. Context can be set automatically by Amazon Lex when an intent is fulfilled, or it can be set at runtime using the <code>PutContent</code>, <code>PutText</code>, or <code>PutSession</code> operation.
    */
  @js.native
  trait ActiveContext extends js.Object {
    var name: ActiveContextName
    var parameters: ActiveContextParametersMap
    var timeToLive: ActiveContextTimeToLive
  }

  object ActiveContext {
    @inline
    def apply(
        name: ActiveContextName,
        parameters: ActiveContextParametersMap,
        timeToLive: ActiveContextTimeToLive
    ): ActiveContext = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "parameters" -> parameters.asInstanceOf[js.Any],
        "timeToLive" -> timeToLive.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActiveContext]
    }
  }

  /** The length of time or number of turns that a context remains active.
    */
  @js.native
  trait ActiveContextTimeToLive extends js.Object {
    var timeToLiveInSeconds: js.UndefOr[ActiveContextTimeToLiveInSeconds]
    var turnsToLive: js.UndefOr[ActiveContextTurnsToLive]
  }

  object ActiveContextTimeToLive {
    @inline
    def apply(
        timeToLiveInSeconds: js.UndefOr[ActiveContextTimeToLiveInSeconds] = js.undefined,
        turnsToLive: js.UndefOr[ActiveContextTurnsToLive] = js.undefined
    ): ActiveContextTimeToLive = {
      val __obj = js.Dynamic.literal()
      timeToLiveInSeconds.foreach(__v => __obj.updateDynamic("timeToLiveInSeconds")(__v.asInstanceOf[js.Any]))
      turnsToLive.foreach(__v => __obj.updateDynamic("turnsToLive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActiveContextTimeToLive]
    }
  }

  /** Represents an option to be shown on the client platform (Facebook, Slack, etc.)
    */
  @js.native
  trait Button extends js.Object {
    var text: ButtonTextStringWithLength
    var value: ButtonValueStringWithLength
  }

  object Button {
    @inline
    def apply(
        text: ButtonTextStringWithLength,
        value: ButtonValueStringWithLength
    ): Button = {
      val __obj = js.Dynamic.literal(
        "text" -> text.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Button]
    }
  }

  @js.native
  sealed trait ConfirmationStatus extends js.Any
  object ConfirmationStatus {
    val None = "None".asInstanceOf[ConfirmationStatus]
    val Confirmed = "Confirmed".asInstanceOf[ConfirmationStatus]
    val Denied = "Denied".asInstanceOf[ConfirmationStatus]

    @inline def values = js.Array(None, Confirmed, Denied)
  }

  @js.native
  sealed trait ContentType extends js.Any
  object ContentType {
    val `application/vnd.amazonaws.card.generic` = "application/vnd.amazonaws.card.generic".asInstanceOf[ContentType]

    @inline def values = js.Array(`application/vnd.amazonaws.card.generic`)
  }

  @js.native
  trait DeleteSessionRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var userId: UserId
  }

  object DeleteSessionRequest {
    @inline
    def apply(
        botAlias: BotAlias,
        botName: BotName,
        userId: UserId
    ): DeleteSessionRequest = {
      val __obj = js.Dynamic.literal(
        "botAlias" -> botAlias.asInstanceOf[js.Any],
        "botName" -> botName.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
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
    @inline
    def apply(
        botAlias: js.UndefOr[BotAlias] = js.undefined,
        botName: js.UndefOr[BotName] = js.undefined,
        sessionId: js.UndefOr[String] = js.undefined,
        userId: js.UndefOr[UserId] = js.undefined
    ): DeleteSessionResponse = {
      val __obj = js.Dynamic.literal()
      botAlias.foreach(__v => __obj.updateDynamic("botAlias")(__v.asInstanceOf[js.Any]))
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSessionResponse]
    }
  }

  /** Describes the next action that the bot should take in its interaction with the user and provides information about the context in which the action takes place. Use the <code>DialogAction</code> data type to set the interaction to a specific state, or to return the interaction to a previous state.
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
    @inline
    def apply(
        `type`: DialogActionType,
        fulfillmentState: js.UndefOr[FulfillmentState] = js.undefined,
        intentName: js.UndefOr[IntentName] = js.undefined,
        message: js.UndefOr[Text] = js.undefined,
        messageFormat: js.UndefOr[MessageFormatType] = js.undefined,
        slotToElicit: js.UndefOr[String] = js.undefined,
        slots: js.UndefOr[StringMap] = js.undefined
    ): DialogAction = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      fulfillmentState.foreach(__v => __obj.updateDynamic("fulfillmentState")(__v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.updateDynamic("intentName")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      messageFormat.foreach(__v => __obj.updateDynamic("messageFormat")(__v.asInstanceOf[js.Any]))
      slotToElicit.foreach(__v => __obj.updateDynamic("slotToElicit")(__v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.updateDynamic("slots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DialogAction]
    }
  }

  @js.native
  sealed trait DialogActionType extends js.Any
  object DialogActionType {
    val ElicitIntent = "ElicitIntent".asInstanceOf[DialogActionType]
    val ConfirmIntent = "ConfirmIntent".asInstanceOf[DialogActionType]
    val ElicitSlot = "ElicitSlot".asInstanceOf[DialogActionType]
    val Close = "Close".asInstanceOf[DialogActionType]
    val Delegate = "Delegate".asInstanceOf[DialogActionType]

    @inline def values = js.Array(ElicitIntent, ConfirmIntent, ElicitSlot, Close, Delegate)
  }

  @js.native
  sealed trait DialogState extends js.Any
  object DialogState {
    val ElicitIntent = "ElicitIntent".asInstanceOf[DialogState]
    val ConfirmIntent = "ConfirmIntent".asInstanceOf[DialogState]
    val ElicitSlot = "ElicitSlot".asInstanceOf[DialogState]
    val Fulfilled = "Fulfilled".asInstanceOf[DialogState]
    val ReadyForFulfillment = "ReadyForFulfillment".asInstanceOf[DialogState]
    val Failed = "Failed".asInstanceOf[DialogState]

    @inline def values = js.Array(ElicitIntent, ConfirmIntent, ElicitSlot, Fulfilled, ReadyForFulfillment, Failed)
  }

  @js.native
  sealed trait FulfillmentState extends js.Any
  object FulfillmentState {
    val Fulfilled = "Fulfilled".asInstanceOf[FulfillmentState]
    val Failed = "Failed".asInstanceOf[FulfillmentState]
    val ReadyForFulfillment = "ReadyForFulfillment".asInstanceOf[FulfillmentState]

    @inline def values = js.Array(Fulfilled, Failed, ReadyForFulfillment)
  }

  /** Represents an option rendered to the user when a prompt is shown. It could be an image, a button, a link, or text.
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
    @inline
    def apply(
        attachmentLinkUrl: js.UndefOr[StringUrlWithLength] = js.undefined,
        buttons: js.UndefOr[listOfButtons] = js.undefined,
        imageUrl: js.UndefOr[StringUrlWithLength] = js.undefined,
        subTitle: js.UndefOr[StringWithLength] = js.undefined,
        title: js.UndefOr[StringWithLength] = js.undefined
    ): GenericAttachment = {
      val __obj = js.Dynamic.literal()
      attachmentLinkUrl.foreach(__v => __obj.updateDynamic("attachmentLinkUrl")(__v.asInstanceOf[js.Any]))
      buttons.foreach(__v => __obj.updateDynamic("buttons")(__v.asInstanceOf[js.Any]))
      imageUrl.foreach(__v => __obj.updateDynamic("imageUrl")(__v.asInstanceOf[js.Any]))
      subTitle.foreach(__v => __obj.updateDynamic("subTitle")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenericAttachment]
    }
  }

  @js.native
  trait GetSessionRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var userId: UserId
    var checkpointLabelFilter: js.UndefOr[IntentSummaryCheckpointLabel]
  }

  object GetSessionRequest {
    @inline
    def apply(
        botAlias: BotAlias,
        botName: BotName,
        userId: UserId,
        checkpointLabelFilter: js.UndefOr[IntentSummaryCheckpointLabel] = js.undefined
    ): GetSessionRequest = {
      val __obj = js.Dynamic.literal(
        "botAlias" -> botAlias.asInstanceOf[js.Any],
        "botName" -> botName.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )

      checkpointLabelFilter.foreach(__v => __obj.updateDynamic("checkpointLabelFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSessionRequest]
    }
  }

  @js.native
  trait GetSessionResponse extends js.Object {
    var activeContexts: js.UndefOr[ActiveContextsList]
    var dialogAction: js.UndefOr[DialogAction]
    var recentIntentSummaryView: js.UndefOr[IntentSummaryList]
    var sessionAttributes: js.UndefOr[StringMap]
    var sessionId: js.UndefOr[String]
  }

  object GetSessionResponse {
    @inline
    def apply(
        activeContexts: js.UndefOr[ActiveContextsList] = js.undefined,
        dialogAction: js.UndefOr[DialogAction] = js.undefined,
        recentIntentSummaryView: js.UndefOr[IntentSummaryList] = js.undefined,
        sessionAttributes: js.UndefOr[StringMap] = js.undefined,
        sessionId: js.UndefOr[String] = js.undefined
    ): GetSessionResponse = {
      val __obj = js.Dynamic.literal()
      activeContexts.foreach(__v => __obj.updateDynamic("activeContexts")(__v.asInstanceOf[js.Any]))
      dialogAction.foreach(__v => __obj.updateDynamic("dialogAction")(__v.asInstanceOf[js.Any]))
      recentIntentSummaryView.foreach(__v => __obj.updateDynamic("recentIntentSummaryView")(__v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.updateDynamic("sessionAttributes")(__v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSessionResponse]
    }
  }

  /** Provides a score that indicates the confidence that Amazon Lex has that an intent is the one that satisfies the user's intent.
    */
  @js.native
  trait IntentConfidence extends js.Object {
    var score: js.UndefOr[Double]
  }

  object IntentConfidence {
    @inline
    def apply(
        score: js.UndefOr[Double] = js.undefined
    ): IntentConfidence = {
      val __obj = js.Dynamic.literal()
      score.foreach(__v => __obj.updateDynamic("score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntentConfidence]
    }
  }

  /** Provides information about the state of an intent. You can use this information to get the current state of an intent so that you can process the intent, or so that you can return the intent to its previous state.
    */
  @js.native
  trait IntentSummary extends js.Object {
    var dialogActionType: DialogActionType
    var checkpointLabel: js.UndefOr[IntentSummaryCheckpointLabel]
    var confirmationStatus: js.UndefOr[ConfirmationStatus]
    var fulfillmentState: js.UndefOr[FulfillmentState]
    var intentName: js.UndefOr[IntentName]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[StringMap]
  }

  object IntentSummary {
    @inline
    def apply(
        dialogActionType: DialogActionType,
        checkpointLabel: js.UndefOr[IntentSummaryCheckpointLabel] = js.undefined,
        confirmationStatus: js.UndefOr[ConfirmationStatus] = js.undefined,
        fulfillmentState: js.UndefOr[FulfillmentState] = js.undefined,
        intentName: js.UndefOr[IntentName] = js.undefined,
        slotToElicit: js.UndefOr[String] = js.undefined,
        slots: js.UndefOr[StringMap] = js.undefined
    ): IntentSummary = {
      val __obj = js.Dynamic.literal(
        "dialogActionType" -> dialogActionType.asInstanceOf[js.Any]
      )

      checkpointLabel.foreach(__v => __obj.updateDynamic("checkpointLabel")(__v.asInstanceOf[js.Any]))
      confirmationStatus.foreach(__v => __obj.updateDynamic("confirmationStatus")(__v.asInstanceOf[js.Any]))
      fulfillmentState.foreach(__v => __obj.updateDynamic("fulfillmentState")(__v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.updateDynamic("intentName")(__v.asInstanceOf[js.Any]))
      slotToElicit.foreach(__v => __obj.updateDynamic("slotToElicit")(__v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.updateDynamic("slots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntentSummary]
    }
  }

  @js.native
  sealed trait MessageFormatType extends js.Any
  object MessageFormatType {
    val PlainText = "PlainText".asInstanceOf[MessageFormatType]
    val CustomPayload = "CustomPayload".asInstanceOf[MessageFormatType]
    val SSML = "SSML".asInstanceOf[MessageFormatType]
    val Composite = "Composite".asInstanceOf[MessageFormatType]

    @inline def values = js.Array(PlainText, CustomPayload, SSML, Composite)
  }

  @js.native
  trait PostContentRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var contentType: HttpContentType
    var inputStream: BlobStream
    var userId: UserId
    var accept: js.UndefOr[Accept]
    var activeContexts: js.UndefOr[ActiveContextsString]
    var requestAttributes: js.UndefOr[AttributesString]
    var sessionAttributes: js.UndefOr[AttributesString]
  }

  object PostContentRequest {
    @inline
    def apply(
        botAlias: BotAlias,
        botName: BotName,
        contentType: HttpContentType,
        inputStream: BlobStream,
        userId: UserId,
        accept: js.UndefOr[Accept] = js.undefined,
        activeContexts: js.UndefOr[ActiveContextsString] = js.undefined,
        requestAttributes: js.UndefOr[AttributesString] = js.undefined,
        sessionAttributes: js.UndefOr[AttributesString] = js.undefined
    ): PostContentRequest = {
      val __obj = js.Dynamic.literal(
        "botAlias" -> botAlias.asInstanceOf[js.Any],
        "botName" -> botName.asInstanceOf[js.Any],
        "contentType" -> contentType.asInstanceOf[js.Any],
        "inputStream" -> inputStream.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )

      accept.foreach(__v => __obj.updateDynamic("accept")(__v.asInstanceOf[js.Any]))
      activeContexts.foreach(__v => __obj.updateDynamic("activeContexts")(__v.asInstanceOf[js.Any]))
      requestAttributes.foreach(__v => __obj.updateDynamic("requestAttributes")(__v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.updateDynamic("sessionAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostContentRequest]
    }
  }

  @js.native
  trait PostContentResponse extends js.Object {
    var activeContexts: js.UndefOr[ActiveContextsString]
    var alternativeIntents: js.UndefOr[String]
    var audioStream: js.UndefOr[BlobStream]
    var botVersion: js.UndefOr[BotVersion]
    var contentType: js.UndefOr[HttpContentType]
    var dialogState: js.UndefOr[DialogState]
    var encodedInputTranscript: js.UndefOr[SensitiveStringUnbounded]
    var encodedMessage: js.UndefOr[SensitiveString]
    var inputTranscript: js.UndefOr[String]
    var intentName: js.UndefOr[IntentName]
    var message: js.UndefOr[Text]
    var messageFormat: js.UndefOr[MessageFormatType]
    var nluIntentConfidence: js.UndefOr[String]
    var sentimentResponse: js.UndefOr[String]
    var sessionAttributes: js.UndefOr[String]
    var sessionId: js.UndefOr[String]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[String]
  }

  object PostContentResponse {
    @inline
    def apply(
        activeContexts: js.UndefOr[ActiveContextsString] = js.undefined,
        alternativeIntents: js.UndefOr[String] = js.undefined,
        audioStream: js.UndefOr[BlobStream] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        contentType: js.UndefOr[HttpContentType] = js.undefined,
        dialogState: js.UndefOr[DialogState] = js.undefined,
        encodedInputTranscript: js.UndefOr[SensitiveStringUnbounded] = js.undefined,
        encodedMessage: js.UndefOr[SensitiveString] = js.undefined,
        inputTranscript: js.UndefOr[String] = js.undefined,
        intentName: js.UndefOr[IntentName] = js.undefined,
        message: js.UndefOr[Text] = js.undefined,
        messageFormat: js.UndefOr[MessageFormatType] = js.undefined,
        nluIntentConfidence: js.UndefOr[String] = js.undefined,
        sentimentResponse: js.UndefOr[String] = js.undefined,
        sessionAttributes: js.UndefOr[String] = js.undefined,
        sessionId: js.UndefOr[String] = js.undefined,
        slotToElicit: js.UndefOr[String] = js.undefined,
        slots: js.UndefOr[String] = js.undefined
    ): PostContentResponse = {
      val __obj = js.Dynamic.literal()
      activeContexts.foreach(__v => __obj.updateDynamic("activeContexts")(__v.asInstanceOf[js.Any]))
      alternativeIntents.foreach(__v => __obj.updateDynamic("alternativeIntents")(__v.asInstanceOf[js.Any]))
      audioStream.foreach(__v => __obj.updateDynamic("audioStream")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      contentType.foreach(__v => __obj.updateDynamic("contentType")(__v.asInstanceOf[js.Any]))
      dialogState.foreach(__v => __obj.updateDynamic("dialogState")(__v.asInstanceOf[js.Any]))
      encodedInputTranscript.foreach(__v => __obj.updateDynamic("encodedInputTranscript")(__v.asInstanceOf[js.Any]))
      encodedMessage.foreach(__v => __obj.updateDynamic("encodedMessage")(__v.asInstanceOf[js.Any]))
      inputTranscript.foreach(__v => __obj.updateDynamic("inputTranscript")(__v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.updateDynamic("intentName")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      messageFormat.foreach(__v => __obj.updateDynamic("messageFormat")(__v.asInstanceOf[js.Any]))
      nluIntentConfidence.foreach(__v => __obj.updateDynamic("nluIntentConfidence")(__v.asInstanceOf[js.Any]))
      sentimentResponse.foreach(__v => __obj.updateDynamic("sentimentResponse")(__v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.updateDynamic("sessionAttributes")(__v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      slotToElicit.foreach(__v => __obj.updateDynamic("slotToElicit")(__v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.updateDynamic("slots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostContentResponse]
    }
  }

  @js.native
  trait PostTextRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var inputText: Text
    var userId: UserId
    var activeContexts: js.UndefOr[ActiveContextsList]
    var requestAttributes: js.UndefOr[StringMap]
    var sessionAttributes: js.UndefOr[StringMap]
  }

  object PostTextRequest {
    @inline
    def apply(
        botAlias: BotAlias,
        botName: BotName,
        inputText: Text,
        userId: UserId,
        activeContexts: js.UndefOr[ActiveContextsList] = js.undefined,
        requestAttributes: js.UndefOr[StringMap] = js.undefined,
        sessionAttributes: js.UndefOr[StringMap] = js.undefined
    ): PostTextRequest = {
      val __obj = js.Dynamic.literal(
        "botAlias" -> botAlias.asInstanceOf[js.Any],
        "botName" -> botName.asInstanceOf[js.Any],
        "inputText" -> inputText.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )

      activeContexts.foreach(__v => __obj.updateDynamic("activeContexts")(__v.asInstanceOf[js.Any]))
      requestAttributes.foreach(__v => __obj.updateDynamic("requestAttributes")(__v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.updateDynamic("sessionAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostTextRequest]
    }
  }

  @js.native
  trait PostTextResponse extends js.Object {
    var activeContexts: js.UndefOr[ActiveContextsList]
    var alternativeIntents: js.UndefOr[IntentList]
    var botVersion: js.UndefOr[BotVersion]
    var dialogState: js.UndefOr[DialogState]
    var intentName: js.UndefOr[IntentName]
    var message: js.UndefOr[Text]
    var messageFormat: js.UndefOr[MessageFormatType]
    var nluIntentConfidence: js.UndefOr[IntentConfidence]
    var responseCard: js.UndefOr[ResponseCard]
    var sentimentResponse: js.UndefOr[SentimentResponse]
    var sessionAttributes: js.UndefOr[StringMap]
    var sessionId: js.UndefOr[String]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[StringMap]
  }

  object PostTextResponse {
    @inline
    def apply(
        activeContexts: js.UndefOr[ActiveContextsList] = js.undefined,
        alternativeIntents: js.UndefOr[IntentList] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        dialogState: js.UndefOr[DialogState] = js.undefined,
        intentName: js.UndefOr[IntentName] = js.undefined,
        message: js.UndefOr[Text] = js.undefined,
        messageFormat: js.UndefOr[MessageFormatType] = js.undefined,
        nluIntentConfidence: js.UndefOr[IntentConfidence] = js.undefined,
        responseCard: js.UndefOr[ResponseCard] = js.undefined,
        sentimentResponse: js.UndefOr[SentimentResponse] = js.undefined,
        sessionAttributes: js.UndefOr[StringMap] = js.undefined,
        sessionId: js.UndefOr[String] = js.undefined,
        slotToElicit: js.UndefOr[String] = js.undefined,
        slots: js.UndefOr[StringMap] = js.undefined
    ): PostTextResponse = {
      val __obj = js.Dynamic.literal()
      activeContexts.foreach(__v => __obj.updateDynamic("activeContexts")(__v.asInstanceOf[js.Any]))
      alternativeIntents.foreach(__v => __obj.updateDynamic("alternativeIntents")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      dialogState.foreach(__v => __obj.updateDynamic("dialogState")(__v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.updateDynamic("intentName")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      messageFormat.foreach(__v => __obj.updateDynamic("messageFormat")(__v.asInstanceOf[js.Any]))
      nluIntentConfidence.foreach(__v => __obj.updateDynamic("nluIntentConfidence")(__v.asInstanceOf[js.Any]))
      responseCard.foreach(__v => __obj.updateDynamic("responseCard")(__v.asInstanceOf[js.Any]))
      sentimentResponse.foreach(__v => __obj.updateDynamic("sentimentResponse")(__v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.updateDynamic("sessionAttributes")(__v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      slotToElicit.foreach(__v => __obj.updateDynamic("slotToElicit")(__v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.updateDynamic("slots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostTextResponse]
    }
  }

  /** An intent that Amazon Lex suggests satisfies the user's intent. Includes the name of the intent, the confidence that Amazon Lex has that the user's intent is satisfied, and the slots defined for the intent.
    */
  @js.native
  trait PredictedIntent extends js.Object {
    var intentName: js.UndefOr[IntentName]
    var nluIntentConfidence: js.UndefOr[IntentConfidence]
    var slots: js.UndefOr[StringMap]
  }

  object PredictedIntent {
    @inline
    def apply(
        intentName: js.UndefOr[IntentName] = js.undefined,
        nluIntentConfidence: js.UndefOr[IntentConfidence] = js.undefined,
        slots: js.UndefOr[StringMap] = js.undefined
    ): PredictedIntent = {
      val __obj = js.Dynamic.literal()
      intentName.foreach(__v => __obj.updateDynamic("intentName")(__v.asInstanceOf[js.Any]))
      nluIntentConfidence.foreach(__v => __obj.updateDynamic("nluIntentConfidence")(__v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.updateDynamic("slots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictedIntent]
    }
  }

  @js.native
  trait PutSessionRequest extends js.Object {
    var botAlias: BotAlias
    var botName: BotName
    var userId: UserId
    var accept: js.UndefOr[Accept]
    var activeContexts: js.UndefOr[ActiveContextsList]
    var dialogAction: js.UndefOr[DialogAction]
    var recentIntentSummaryView: js.UndefOr[IntentSummaryList]
    var sessionAttributes: js.UndefOr[StringMap]
  }

  object PutSessionRequest {
    @inline
    def apply(
        botAlias: BotAlias,
        botName: BotName,
        userId: UserId,
        accept: js.UndefOr[Accept] = js.undefined,
        activeContexts: js.UndefOr[ActiveContextsList] = js.undefined,
        dialogAction: js.UndefOr[DialogAction] = js.undefined,
        recentIntentSummaryView: js.UndefOr[IntentSummaryList] = js.undefined,
        sessionAttributes: js.UndefOr[StringMap] = js.undefined
    ): PutSessionRequest = {
      val __obj = js.Dynamic.literal(
        "botAlias" -> botAlias.asInstanceOf[js.Any],
        "botName" -> botName.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )

      accept.foreach(__v => __obj.updateDynamic("accept")(__v.asInstanceOf[js.Any]))
      activeContexts.foreach(__v => __obj.updateDynamic("activeContexts")(__v.asInstanceOf[js.Any]))
      dialogAction.foreach(__v => __obj.updateDynamic("dialogAction")(__v.asInstanceOf[js.Any]))
      recentIntentSummaryView.foreach(__v => __obj.updateDynamic("recentIntentSummaryView")(__v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.updateDynamic("sessionAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSessionRequest]
    }
  }

  @js.native
  trait PutSessionResponse extends js.Object {
    var activeContexts: js.UndefOr[ActiveContextsString]
    var audioStream: js.UndefOr[BlobStream]
    var contentType: js.UndefOr[HttpContentType]
    var dialogState: js.UndefOr[DialogState]
    var encodedMessage: js.UndefOr[SensitiveString]
    var intentName: js.UndefOr[IntentName]
    var message: js.UndefOr[Text]
    var messageFormat: js.UndefOr[MessageFormatType]
    var sessionAttributes: js.UndefOr[String]
    var sessionId: js.UndefOr[String]
    var slotToElicit: js.UndefOr[String]
    var slots: js.UndefOr[String]
  }

  object PutSessionResponse {
    @inline
    def apply(
        activeContexts: js.UndefOr[ActiveContextsString] = js.undefined,
        audioStream: js.UndefOr[BlobStream] = js.undefined,
        contentType: js.UndefOr[HttpContentType] = js.undefined,
        dialogState: js.UndefOr[DialogState] = js.undefined,
        encodedMessage: js.UndefOr[SensitiveString] = js.undefined,
        intentName: js.UndefOr[IntentName] = js.undefined,
        message: js.UndefOr[Text] = js.undefined,
        messageFormat: js.UndefOr[MessageFormatType] = js.undefined,
        sessionAttributes: js.UndefOr[String] = js.undefined,
        sessionId: js.UndefOr[String] = js.undefined,
        slotToElicit: js.UndefOr[String] = js.undefined,
        slots: js.UndefOr[String] = js.undefined
    ): PutSessionResponse = {
      val __obj = js.Dynamic.literal()
      activeContexts.foreach(__v => __obj.updateDynamic("activeContexts")(__v.asInstanceOf[js.Any]))
      audioStream.foreach(__v => __obj.updateDynamic("audioStream")(__v.asInstanceOf[js.Any]))
      contentType.foreach(__v => __obj.updateDynamic("contentType")(__v.asInstanceOf[js.Any]))
      dialogState.foreach(__v => __obj.updateDynamic("dialogState")(__v.asInstanceOf[js.Any]))
      encodedMessage.foreach(__v => __obj.updateDynamic("encodedMessage")(__v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.updateDynamic("intentName")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      messageFormat.foreach(__v => __obj.updateDynamic("messageFormat")(__v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.updateDynamic("sessionAttributes")(__v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      slotToElicit.foreach(__v => __obj.updateDynamic("slotToElicit")(__v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.updateDynamic("slots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSessionResponse]
    }
  }

  /** If you configure a response card when creating your bots, Amazon Lex substitutes the session attributes and slot values that are available, and then returns it. The response card can also come from a Lambda function ( <code>dialogCodeHook</code> and <code>fulfillmentActivity</code> on an intent).
    */
  @js.native
  trait ResponseCard extends js.Object {
    var contentType: js.UndefOr[ContentType]
    var genericAttachments: js.UndefOr[genericAttachmentList]
    var version: js.UndefOr[String]
  }

  object ResponseCard {
    @inline
    def apply(
        contentType: js.UndefOr[ContentType] = js.undefined,
        genericAttachments: js.UndefOr[genericAttachmentList] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): ResponseCard = {
      val __obj = js.Dynamic.literal()
      contentType.foreach(__v => __obj.updateDynamic("contentType")(__v.asInstanceOf[js.Any]))
      genericAttachments.foreach(__v => __obj.updateDynamic("genericAttachments")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseCard]
    }
  }

  /** The sentiment expressed in an utterance.
    * When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field structure contains the result of the analysis.
    */
  @js.native
  trait SentimentResponse extends js.Object {
    var sentimentLabel: js.UndefOr[SentimentLabel]
    var sentimentScore: js.UndefOr[SentimentScore]
  }

  object SentimentResponse {
    @inline
    def apply(
        sentimentLabel: js.UndefOr[SentimentLabel] = js.undefined,
        sentimentScore: js.UndefOr[SentimentScore] = js.undefined
    ): SentimentResponse = {
      val __obj = js.Dynamic.literal()
      sentimentLabel.foreach(__v => __obj.updateDynamic("sentimentLabel")(__v.asInstanceOf[js.Any]))
      sentimentScore.foreach(__v => __obj.updateDynamic("sentimentScore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SentimentResponse]
    }
  }
}
