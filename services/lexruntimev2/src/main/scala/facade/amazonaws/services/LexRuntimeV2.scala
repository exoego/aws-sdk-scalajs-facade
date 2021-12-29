package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object lexruntimev2 {
  type ActiveContextName = String
  type ActiveContextParametersMap = js.Dictionary[Text]
  type ActiveContextTimeToLiveInSeconds = Int
  type ActiveContextTurnsToLive = Int
  type ActiveContextsList = js.Array[ActiveContext]
  type AttachmentTitle = String
  type AttachmentUrl = String
  type BlobStream = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BotAliasIdentifier = String
  type BotIdentifier = String
  type ButtonText = String
  type ButtonValue = String
  type ButtonsList = js.Array[Button]
  type Interpretations = js.Array[Interpretation]
  type LocaleId = String
  type Messages = js.Array[Message]
  type NonEmptyString = String
  type ParameterName = String
  type SensitiveNonEmptyString = String
  type SessionId = String
  type Slots = js.Dictionary[Slot]
  type StringList = js.Array[NonEmptyString]
  type StringMap = js.Dictionary[String]
  type Text = String

  final class LexRuntimeV2Ops(private val service: LexRuntimeV2) extends AnyVal {

    @inline def deleteSessionFuture(params: DeleteSessionRequest): Future[DeleteSessionResponse] = service.deleteSession(params).promise().toFuture
    @inline def getSessionFuture(params: GetSessionRequest): Future[GetSessionResponse] = service.getSession(params).promise().toFuture
    @inline def putSessionFuture(params: PutSessionRequest): Future[PutSessionResponse] = service.putSession(params).promise().toFuture
    @inline def recognizeTextFuture(params: RecognizeTextRequest): Future[RecognizeTextResponse] = service.recognizeText(params).promise().toFuture
    @inline def recognizeUtteranceFuture(params: RecognizeUtteranceRequest): Future[RecognizeUtteranceResponse] = service.recognizeUtterance(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/lexruntimev2", JSImport.Namespace, "AWS.LexRuntimeV2")
  class LexRuntimeV2() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteSession(params: DeleteSessionRequest): Request[DeleteSessionResponse] = js.native
    def getSession(params: GetSessionRequest): Request[GetSessionResponse] = js.native
    def putSession(params: PutSessionRequest): Request[PutSessionResponse] = js.native
    def recognizeText(params: RecognizeTextRequest): Request[RecognizeTextResponse] = js.native
    def recognizeUtterance(params: RecognizeUtteranceRequest): Request[RecognizeUtteranceResponse] = js.native
  }
  object LexRuntimeV2 {
    @inline implicit def toOps(service: LexRuntimeV2): LexRuntimeV2Ops = {
      new LexRuntimeV2Ops(service)
    }
  }

  /** Contains information about the contexts that a user is using in a session. You can configure Amazon Lex to set a context when an intent is fulfilled, or you can set a context using the , , or operations. Use a context to indicate to Amazon Lex intents that should be used as follow-up intents. For example, if the active context is <code>order-fulfilled</code>, only intents that have <code>order-fulfilled</code> configured as a trigger are considered for follow up.
    */
  @js.native
  trait ActiveContext extends js.Object {
    var name: ActiveContextName
    var timeToLive: ActiveContextTimeToLive
    var contextAttributes: js.UndefOr[ActiveContextParametersMap]
  }

  object ActiveContext {
    @inline
    def apply(
        name: ActiveContextName,
        timeToLive: ActiveContextTimeToLive,
        contextAttributes: js.UndefOr[ActiveContextParametersMap] = js.undefined
    ): ActiveContext = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "timeToLive" -> timeToLive.asInstanceOf[js.Any]
      )

      contextAttributes.foreach(__v => __obj.updateDynamic("contextAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActiveContext]
    }
  }

  /** The time that a context is active. You can specify the time to live in seconds or in conversation turns.
    */
  @js.native
  trait ActiveContextTimeToLive extends js.Object {
    var timeToLiveInSeconds: ActiveContextTimeToLiveInSeconds
    var turnsToLive: ActiveContextTurnsToLive
  }

  object ActiveContextTimeToLive {
    @inline
    def apply(
        timeToLiveInSeconds: ActiveContextTimeToLiveInSeconds,
        turnsToLive: ActiveContextTurnsToLive
    ): ActiveContextTimeToLive = {
      val __obj = js.Dynamic.literal(
        "timeToLiveInSeconds" -> timeToLiveInSeconds.asInstanceOf[js.Any],
        "turnsToLive" -> turnsToLive.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActiveContextTimeToLive]
    }
  }

  /** A button that appears on a response card show to the user.
    */
  @js.native
  trait Button extends js.Object {
    var text: ButtonText
    var value: ButtonValue
  }

  object Button {
    @inline
    def apply(
        text: ButtonText,
        value: ButtonValue
    ): Button = {
      val __obj = js.Dynamic.literal(
        "text" -> text.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Button]
    }
  }

  /** Provides a score that indicates the confidence that Amazon Lex has that an intent is the one that satisfies the user's intent.
    */
  @js.native
  trait ConfidenceScore extends js.Object {
    var score: js.UndefOr[Double]
  }

  object ConfidenceScore {
    @inline
    def apply(
        score: js.UndefOr[Double] = js.undefined
    ): ConfidenceScore = {
      val __obj = js.Dynamic.literal()
      score.foreach(__v => __obj.updateDynamic("score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfidenceScore]
    }
  }

  @js.native
  trait DeleteSessionRequest extends js.Object {
    var botAliasId: BotAliasIdentifier
    var botId: BotIdentifier
    var localeId: LocaleId
    var sessionId: SessionId
  }

  object DeleteSessionRequest {
    @inline
    def apply(
        botAliasId: BotAliasIdentifier,
        botId: BotIdentifier,
        localeId: LocaleId,
        sessionId: SessionId
    ): DeleteSessionRequest = {
      val __obj = js.Dynamic.literal(
        "botAliasId" -> botAliasId.asInstanceOf[js.Any],
        "botId" -> botId.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "sessionId" -> sessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSessionRequest]
    }
  }

  @js.native
  trait DeleteSessionResponse extends js.Object {
    var botAliasId: js.UndefOr[BotAliasIdentifier]
    var botId: js.UndefOr[BotIdentifier]
    var localeId: js.UndefOr[LocaleId]
    var sessionId: js.UndefOr[SessionId]
  }

  object DeleteSessionResponse {
    @inline
    def apply(
        botAliasId: js.UndefOr[BotAliasIdentifier] = js.undefined,
        botId: js.UndefOr[BotIdentifier] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        sessionId: js.UndefOr[SessionId] = js.undefined
    ): DeleteSessionResponse = {
      val __obj = js.Dynamic.literal()
      botAliasId.foreach(__v => __obj.updateDynamic("botAliasId")(__v.asInstanceOf[js.Any]))
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSessionResponse]
    }
  }

  /** The next action that Amazon Lex should take.
    */
  @js.native
  trait DialogAction extends js.Object {
    var `type`: DialogActionType
    var slotToElicit: js.UndefOr[NonEmptyString]
  }

  object DialogAction {
    @inline
    def apply(
        `type`: DialogActionType,
        slotToElicit: js.UndefOr[NonEmptyString] = js.undefined
    ): DialogAction = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      slotToElicit.foreach(__v => __obj.updateDynamic("slotToElicit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DialogAction]
    }
  }

  @js.native
  trait GetSessionRequest extends js.Object {
    var botAliasId: BotAliasIdentifier
    var botId: BotIdentifier
    var localeId: LocaleId
    var sessionId: SessionId
  }

  object GetSessionRequest {
    @inline
    def apply(
        botAliasId: BotAliasIdentifier,
        botId: BotIdentifier,
        localeId: LocaleId,
        sessionId: SessionId
    ): GetSessionRequest = {
      val __obj = js.Dynamic.literal(
        "botAliasId" -> botAliasId.asInstanceOf[js.Any],
        "botId" -> botId.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "sessionId" -> sessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSessionRequest]
    }
  }

  @js.native
  trait GetSessionResponse extends js.Object {
    var interpretations: js.UndefOr[Interpretations]
    var messages: js.UndefOr[Messages]
    var sessionId: js.UndefOr[NonEmptyString]
    var sessionState: js.UndefOr[SessionState]
  }

  object GetSessionResponse {
    @inline
    def apply(
        interpretations: js.UndefOr[Interpretations] = js.undefined,
        messages: js.UndefOr[Messages] = js.undefined,
        sessionId: js.UndefOr[NonEmptyString] = js.undefined,
        sessionState: js.UndefOr[SessionState] = js.undefined
    ): GetSessionResponse = {
      val __obj = js.Dynamic.literal()
      interpretations.foreach(__v => __obj.updateDynamic("interpretations")(__v.asInstanceOf[js.Any]))
      messages.foreach(__v => __obj.updateDynamic("messages")(__v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      sessionState.foreach(__v => __obj.updateDynamic("sessionState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSessionResponse]
    }
  }

  /** A card that is shown to the user by a messaging platform. You define the contents of the card, the card is displayed by the platform. When you use a response card, the response from the user is constrained to the text associated with a button on the card.
    */
  @js.native
  trait ImageResponseCard extends js.Object {
    var title: AttachmentTitle
    var buttons: js.UndefOr[ButtonsList]
    var imageUrl: js.UndefOr[AttachmentUrl]
    var subtitle: js.UndefOr[AttachmentTitle]
  }

  object ImageResponseCard {
    @inline
    def apply(
        title: AttachmentTitle,
        buttons: js.UndefOr[ButtonsList] = js.undefined,
        imageUrl: js.UndefOr[AttachmentUrl] = js.undefined,
        subtitle: js.UndefOr[AttachmentTitle] = js.undefined
    ): ImageResponseCard = {
      val __obj = js.Dynamic.literal(
        "title" -> title.asInstanceOf[js.Any]
      )

      buttons.foreach(__v => __obj.updateDynamic("buttons")(__v.asInstanceOf[js.Any]))
      imageUrl.foreach(__v => __obj.updateDynamic("imageUrl")(__v.asInstanceOf[js.Any]))
      subtitle.foreach(__v => __obj.updateDynamic("subtitle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageResponseCard]
    }
  }

  /** The current intent that Amazon Lex is attempting to fulfill.
    */
  @js.native
  trait Intent extends js.Object {
    var name: NonEmptyString
    var confirmationState: js.UndefOr[ConfirmationState]
    var slots: js.UndefOr[Slots]
    var state: js.UndefOr[IntentState]
  }

  object Intent {
    @inline
    def apply(
        name: NonEmptyString,
        confirmationState: js.UndefOr[ConfirmationState] = js.undefined,
        slots: js.UndefOr[Slots] = js.undefined,
        state: js.UndefOr[IntentState] = js.undefined
    ): Intent = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      confirmationState.foreach(__v => __obj.updateDynamic("confirmationState")(__v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.updateDynamic("slots")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Intent]
    }
  }

  /** An intent that Amazon Lex determined might satisfy the user's utterance. The intents are ordered by the confidence score.
    */
  @js.native
  trait Interpretation extends js.Object {
    var intent: js.UndefOr[Intent]
    var nluConfidence: js.UndefOr[ConfidenceScore]
    var sentimentResponse: js.UndefOr[SentimentResponse]
  }

  object Interpretation {
    @inline
    def apply(
        intent: js.UndefOr[Intent] = js.undefined,
        nluConfidence: js.UndefOr[ConfidenceScore] = js.undefined,
        sentimentResponse: js.UndefOr[SentimentResponse] = js.undefined
    ): Interpretation = {
      val __obj = js.Dynamic.literal()
      intent.foreach(__v => __obj.updateDynamic("intent")(__v.asInstanceOf[js.Any]))
      nluConfidence.foreach(__v => __obj.updateDynamic("nluConfidence")(__v.asInstanceOf[js.Any]))
      sentimentResponse.foreach(__v => __obj.updateDynamic("sentimentResponse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Interpretation]
    }
  }

  /** Container for text that is returned to the customer..
    */
  @js.native
  trait Message extends js.Object {
    var content: js.UndefOr[Text]
    var contentType: js.UndefOr[MessageContentType]
    var imageResponseCard: js.UndefOr[ImageResponseCard]
  }

  object Message {
    @inline
    def apply(
        content: js.UndefOr[Text] = js.undefined,
        contentType: js.UndefOr[MessageContentType] = js.undefined,
        imageResponseCard: js.UndefOr[ImageResponseCard] = js.undefined
    ): Message = {
      val __obj = js.Dynamic.literal()
      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      contentType.foreach(__v => __obj.updateDynamic("contentType")(__v.asInstanceOf[js.Any]))
      imageResponseCard.foreach(__v => __obj.updateDynamic("imageResponseCard")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Message]
    }
  }

  @js.native
  trait PutSessionRequest extends js.Object {
    var botAliasId: BotAliasIdentifier
    var botId: BotIdentifier
    var localeId: LocaleId
    var sessionId: SessionId
    var sessionState: SessionState
    var messages: js.UndefOr[Messages]
    var requestAttributes: js.UndefOr[StringMap]
    var responseContentType: js.UndefOr[NonEmptyString]
  }

  object PutSessionRequest {
    @inline
    def apply(
        botAliasId: BotAliasIdentifier,
        botId: BotIdentifier,
        localeId: LocaleId,
        sessionId: SessionId,
        sessionState: SessionState,
        messages: js.UndefOr[Messages] = js.undefined,
        requestAttributes: js.UndefOr[StringMap] = js.undefined,
        responseContentType: js.UndefOr[NonEmptyString] = js.undefined
    ): PutSessionRequest = {
      val __obj = js.Dynamic.literal(
        "botAliasId" -> botAliasId.asInstanceOf[js.Any],
        "botId" -> botId.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "sessionId" -> sessionId.asInstanceOf[js.Any],
        "sessionState" -> sessionState.asInstanceOf[js.Any]
      )

      messages.foreach(__v => __obj.updateDynamic("messages")(__v.asInstanceOf[js.Any]))
      requestAttributes.foreach(__v => __obj.updateDynamic("requestAttributes")(__v.asInstanceOf[js.Any]))
      responseContentType.foreach(__v => __obj.updateDynamic("responseContentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSessionRequest]
    }
  }

  @js.native
  trait PutSessionResponse extends js.Object {
    var audioStream: js.UndefOr[BlobStream]
    var contentType: js.UndefOr[NonEmptyString]
    var messages: js.UndefOr[NonEmptyString]
    var requestAttributes: js.UndefOr[NonEmptyString]
    var sessionId: js.UndefOr[SessionId]
    var sessionState: js.UndefOr[NonEmptyString]
  }

  object PutSessionResponse {
    @inline
    def apply(
        audioStream: js.UndefOr[BlobStream] = js.undefined,
        contentType: js.UndefOr[NonEmptyString] = js.undefined,
        messages: js.UndefOr[NonEmptyString] = js.undefined,
        requestAttributes: js.UndefOr[NonEmptyString] = js.undefined,
        sessionId: js.UndefOr[SessionId] = js.undefined,
        sessionState: js.UndefOr[NonEmptyString] = js.undefined
    ): PutSessionResponse = {
      val __obj = js.Dynamic.literal()
      audioStream.foreach(__v => __obj.updateDynamic("audioStream")(__v.asInstanceOf[js.Any]))
      contentType.foreach(__v => __obj.updateDynamic("contentType")(__v.asInstanceOf[js.Any]))
      messages.foreach(__v => __obj.updateDynamic("messages")(__v.asInstanceOf[js.Any]))
      requestAttributes.foreach(__v => __obj.updateDynamic("requestAttributes")(__v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      sessionState.foreach(__v => __obj.updateDynamic("sessionState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSessionResponse]
    }
  }

  @js.native
  trait RecognizeTextRequest extends js.Object {
    var botAliasId: BotAliasIdentifier
    var botId: BotIdentifier
    var localeId: LocaleId
    var sessionId: SessionId
    var text: Text
    var requestAttributes: js.UndefOr[StringMap]
    var sessionState: js.UndefOr[SessionState]
  }

  object RecognizeTextRequest {
    @inline
    def apply(
        botAliasId: BotAliasIdentifier,
        botId: BotIdentifier,
        localeId: LocaleId,
        sessionId: SessionId,
        text: Text,
        requestAttributes: js.UndefOr[StringMap] = js.undefined,
        sessionState: js.UndefOr[SessionState] = js.undefined
    ): RecognizeTextRequest = {
      val __obj = js.Dynamic.literal(
        "botAliasId" -> botAliasId.asInstanceOf[js.Any],
        "botId" -> botId.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "sessionId" -> sessionId.asInstanceOf[js.Any],
        "text" -> text.asInstanceOf[js.Any]
      )

      requestAttributes.foreach(__v => __obj.updateDynamic("requestAttributes")(__v.asInstanceOf[js.Any]))
      sessionState.foreach(__v => __obj.updateDynamic("sessionState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecognizeTextRequest]
    }
  }

  @js.native
  trait RecognizeTextResponse extends js.Object {
    var interpretations: js.UndefOr[Interpretations]
    var messages: js.UndefOr[Messages]
    var requestAttributes: js.UndefOr[StringMap]
    var sessionId: js.UndefOr[SessionId]
    var sessionState: js.UndefOr[SessionState]
  }

  object RecognizeTextResponse {
    @inline
    def apply(
        interpretations: js.UndefOr[Interpretations] = js.undefined,
        messages: js.UndefOr[Messages] = js.undefined,
        requestAttributes: js.UndefOr[StringMap] = js.undefined,
        sessionId: js.UndefOr[SessionId] = js.undefined,
        sessionState: js.UndefOr[SessionState] = js.undefined
    ): RecognizeTextResponse = {
      val __obj = js.Dynamic.literal()
      interpretations.foreach(__v => __obj.updateDynamic("interpretations")(__v.asInstanceOf[js.Any]))
      messages.foreach(__v => __obj.updateDynamic("messages")(__v.asInstanceOf[js.Any]))
      requestAttributes.foreach(__v => __obj.updateDynamic("requestAttributes")(__v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      sessionState.foreach(__v => __obj.updateDynamic("sessionState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecognizeTextResponse]
    }
  }

  @js.native
  trait RecognizeUtteranceRequest extends js.Object {
    var botAliasId: BotAliasIdentifier
    var botId: BotIdentifier
    var localeId: LocaleId
    var requestContentType: NonEmptyString
    var sessionId: SessionId
    var inputStream: js.UndefOr[BlobStream]
    var requestAttributes: js.UndefOr[SensitiveNonEmptyString]
    var responseContentType: js.UndefOr[NonEmptyString]
    var sessionState: js.UndefOr[SensitiveNonEmptyString]
  }

  object RecognizeUtteranceRequest {
    @inline
    def apply(
        botAliasId: BotAliasIdentifier,
        botId: BotIdentifier,
        localeId: LocaleId,
        requestContentType: NonEmptyString,
        sessionId: SessionId,
        inputStream: js.UndefOr[BlobStream] = js.undefined,
        requestAttributes: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        responseContentType: js.UndefOr[NonEmptyString] = js.undefined,
        sessionState: js.UndefOr[SensitiveNonEmptyString] = js.undefined
    ): RecognizeUtteranceRequest = {
      val __obj = js.Dynamic.literal(
        "botAliasId" -> botAliasId.asInstanceOf[js.Any],
        "botId" -> botId.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "requestContentType" -> requestContentType.asInstanceOf[js.Any],
        "sessionId" -> sessionId.asInstanceOf[js.Any]
      )

      inputStream.foreach(__v => __obj.updateDynamic("inputStream")(__v.asInstanceOf[js.Any]))
      requestAttributes.foreach(__v => __obj.updateDynamic("requestAttributes")(__v.asInstanceOf[js.Any]))
      responseContentType.foreach(__v => __obj.updateDynamic("responseContentType")(__v.asInstanceOf[js.Any]))
      sessionState.foreach(__v => __obj.updateDynamic("sessionState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecognizeUtteranceRequest]
    }
  }

  @js.native
  trait RecognizeUtteranceResponse extends js.Object {
    var audioStream: js.UndefOr[BlobStream]
    var contentType: js.UndefOr[NonEmptyString]
    var inputMode: js.UndefOr[NonEmptyString]
    var inputTranscript: js.UndefOr[NonEmptyString]
    var interpretations: js.UndefOr[NonEmptyString]
    var messages: js.UndefOr[NonEmptyString]
    var requestAttributes: js.UndefOr[NonEmptyString]
    var sessionId: js.UndefOr[SessionId]
    var sessionState: js.UndefOr[NonEmptyString]
  }

  object RecognizeUtteranceResponse {
    @inline
    def apply(
        audioStream: js.UndefOr[BlobStream] = js.undefined,
        contentType: js.UndefOr[NonEmptyString] = js.undefined,
        inputMode: js.UndefOr[NonEmptyString] = js.undefined,
        inputTranscript: js.UndefOr[NonEmptyString] = js.undefined,
        interpretations: js.UndefOr[NonEmptyString] = js.undefined,
        messages: js.UndefOr[NonEmptyString] = js.undefined,
        requestAttributes: js.UndefOr[NonEmptyString] = js.undefined,
        sessionId: js.UndefOr[SessionId] = js.undefined,
        sessionState: js.UndefOr[NonEmptyString] = js.undefined
    ): RecognizeUtteranceResponse = {
      val __obj = js.Dynamic.literal()
      audioStream.foreach(__v => __obj.updateDynamic("audioStream")(__v.asInstanceOf[js.Any]))
      contentType.foreach(__v => __obj.updateDynamic("contentType")(__v.asInstanceOf[js.Any]))
      inputMode.foreach(__v => __obj.updateDynamic("inputMode")(__v.asInstanceOf[js.Any]))
      inputTranscript.foreach(__v => __obj.updateDynamic("inputTranscript")(__v.asInstanceOf[js.Any]))
      interpretations.foreach(__v => __obj.updateDynamic("interpretations")(__v.asInstanceOf[js.Any]))
      messages.foreach(__v => __obj.updateDynamic("messages")(__v.asInstanceOf[js.Any]))
      requestAttributes.foreach(__v => __obj.updateDynamic("requestAttributes")(__v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      sessionState.foreach(__v => __obj.updateDynamic("sessionState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecognizeUtteranceResponse]
    }
  }

  /** Provides information about the sentiment expressed in a user's response in a conversation. Sentiments are determined using Amazon Comprehend. Sentiments are only returned if they are enabled for the bot. For more information, see [[https://docs.aws.amazon.com/comprehend/latest/dg/how-sentiment.html| Determine Sentiment]] in the <i>Amazon Comprehend developer guide</i>.
    */
  @js.native
  trait SentimentResponse extends js.Object {
    var sentiment: js.UndefOr[SentimentType]
    var sentimentScore: js.UndefOr[SentimentScore]
  }

  object SentimentResponse {
    @inline
    def apply(
        sentiment: js.UndefOr[SentimentType] = js.undefined,
        sentimentScore: js.UndefOr[SentimentScore] = js.undefined
    ): SentimentResponse = {
      val __obj = js.Dynamic.literal()
      sentiment.foreach(__v => __obj.updateDynamic("sentiment")(__v.asInstanceOf[js.Any]))
      sentimentScore.foreach(__v => __obj.updateDynamic("sentimentScore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SentimentResponse]
    }
  }

  /** The individual sentiment responses for the utterance.
    */
  @js.native
  trait SentimentScore extends js.Object {
    var mixed: js.UndefOr[Double]
    var negative: js.UndefOr[Double]
    var neutral: js.UndefOr[Double]
    var positive: js.UndefOr[Double]
  }

  object SentimentScore {
    @inline
    def apply(
        mixed: js.UndefOr[Double] = js.undefined,
        negative: js.UndefOr[Double] = js.undefined,
        neutral: js.UndefOr[Double] = js.undefined,
        positive: js.UndefOr[Double] = js.undefined
    ): SentimentScore = {
      val __obj = js.Dynamic.literal()
      mixed.foreach(__v => __obj.updateDynamic("mixed")(__v.asInstanceOf[js.Any]))
      negative.foreach(__v => __obj.updateDynamic("negative")(__v.asInstanceOf[js.Any]))
      neutral.foreach(__v => __obj.updateDynamic("neutral")(__v.asInstanceOf[js.Any]))
      positive.foreach(__v => __obj.updateDynamic("positive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SentimentScore]
    }
  }

  /** The state of the user's session with Amazon Lex.
    */
  @js.native
  trait SessionState extends js.Object {
    var activeContexts: js.UndefOr[ActiveContextsList]
    var dialogAction: js.UndefOr[DialogAction]
    var intent: js.UndefOr[Intent]
    var originatingRequestId: js.UndefOr[NonEmptyString]
    var sessionAttributes: js.UndefOr[StringMap]
  }

  object SessionState {
    @inline
    def apply(
        activeContexts: js.UndefOr[ActiveContextsList] = js.undefined,
        dialogAction: js.UndefOr[DialogAction] = js.undefined,
        intent: js.UndefOr[Intent] = js.undefined,
        originatingRequestId: js.UndefOr[NonEmptyString] = js.undefined,
        sessionAttributes: js.UndefOr[StringMap] = js.undefined
    ): SessionState = {
      val __obj = js.Dynamic.literal()
      activeContexts.foreach(__v => __obj.updateDynamic("activeContexts")(__v.asInstanceOf[js.Any]))
      dialogAction.foreach(__v => __obj.updateDynamic("dialogAction")(__v.asInstanceOf[js.Any]))
      intent.foreach(__v => __obj.updateDynamic("intent")(__v.asInstanceOf[js.Any]))
      originatingRequestId.foreach(__v => __obj.updateDynamic("originatingRequestId")(__v.asInstanceOf[js.Any]))
      sessionAttributes.foreach(__v => __obj.updateDynamic("sessionAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionState]
    }
  }

  /** A value that Amazon Lex uses to fulfill an intent.
    */
  @js.native
  trait Slot extends js.Object {
    var value: js.UndefOr[Value]
  }

  object Slot {
    @inline
    def apply(
        value: js.UndefOr[Value] = js.undefined
    ): Slot = {
      val __obj = js.Dynamic.literal()
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Slot]
    }
  }

  /** The value of a slot.
    */
  @js.native
  trait Value extends js.Object {
    var interpretedValue: NonEmptyString
    var originalValue: js.UndefOr[NonEmptyString]
    var resolvedValues: js.UndefOr[StringList]
  }

  object Value {
    @inline
    def apply(
        interpretedValue: NonEmptyString,
        originalValue: js.UndefOr[NonEmptyString] = js.undefined,
        resolvedValues: js.UndefOr[StringList] = js.undefined
    ): Value = {
      val __obj = js.Dynamic.literal(
        "interpretedValue" -> interpretedValue.asInstanceOf[js.Any]
      )

      originalValue.foreach(__v => __obj.updateDynamic("originalValue")(__v.asInstanceOf[js.Any]))
      resolvedValues.foreach(__v => __obj.updateDynamic("resolvedValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Value]
    }
  }
}
