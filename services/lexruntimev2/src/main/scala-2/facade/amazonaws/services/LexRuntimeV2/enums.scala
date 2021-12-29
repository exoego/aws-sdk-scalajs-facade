package facade.amazonaws.services.lexruntimev2

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ConfirmationState extends js.Any
object ConfirmationState {
  val Confirmed = "Confirmed".asInstanceOf[ConfirmationState]
  val Denied = "Denied".asInstanceOf[ConfirmationState]
  val None = "None".asInstanceOf[ConfirmationState]

  @inline def values = js.Array(Confirmed, Denied, None)
}

@js.native
sealed trait DialogActionType extends js.Any
object DialogActionType {
  val Close = "Close".asInstanceOf[DialogActionType]
  val ConfirmIntent = "ConfirmIntent".asInstanceOf[DialogActionType]
  val Delegate = "Delegate".asInstanceOf[DialogActionType]
  val ElicitIntent = "ElicitIntent".asInstanceOf[DialogActionType]
  val ElicitSlot = "ElicitSlot".asInstanceOf[DialogActionType]

  @inline def values = js.Array(Close, ConfirmIntent, Delegate, ElicitIntent, ElicitSlot)
}

@js.native
sealed trait IntentState extends js.Any
object IntentState {
  val Failed = "Failed".asInstanceOf[IntentState]
  val Fulfilled = "Fulfilled".asInstanceOf[IntentState]
  val InProgress = "InProgress".asInstanceOf[IntentState]
  val ReadyForFulfillment = "ReadyForFulfillment".asInstanceOf[IntentState]
  val Waiting = "Waiting".asInstanceOf[IntentState]

  @inline def values = js.Array(Failed, Fulfilled, InProgress, ReadyForFulfillment, Waiting)
}

@js.native
sealed trait MessageContentType extends js.Any
object MessageContentType {
  val CustomPayload = "CustomPayload".asInstanceOf[MessageContentType]
  val ImageResponseCard = "ImageResponseCard".asInstanceOf[MessageContentType]
  val PlainText = "PlainText".asInstanceOf[MessageContentType]
  val SSML = "SSML".asInstanceOf[MessageContentType]

  @inline def values = js.Array(CustomPayload, ImageResponseCard, PlainText, SSML)
}

@js.native
sealed trait SentimentType extends js.Any
object SentimentType {
  val MIXED = "MIXED".asInstanceOf[SentimentType]
  val NEGATIVE = "NEGATIVE".asInstanceOf[SentimentType]
  val NEUTRAL = "NEUTRAL".asInstanceOf[SentimentType]
  val POSITIVE = "POSITIVE".asInstanceOf[SentimentType]

  @inline def values = js.Array(MIXED, NEGATIVE, NEUTRAL, POSITIVE)
}

