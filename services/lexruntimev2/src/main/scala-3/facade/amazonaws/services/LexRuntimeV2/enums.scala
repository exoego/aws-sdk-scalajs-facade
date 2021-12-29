package facade.amazonaws.services.lexruntimev2

import scalajs._

type ConfirmationState = "Confirmed" | "Denied" | "None"
object ConfirmationState {
  val Confirmed: "Confirmed" = "Confirmed"
  val Denied: "Denied" = "Denied"
  val None: "None" = "None"

  @inline def values = js.Array[ConfirmationState](Confirmed, Denied, None)
}

type DialogActionType = "Close" | "ConfirmIntent" | "Delegate" | "ElicitIntent" | "ElicitSlot"
object DialogActionType {
  val Close: "Close" = "Close"
  val ConfirmIntent: "ConfirmIntent" = "ConfirmIntent"
  val Delegate: "Delegate" = "Delegate"
  val ElicitIntent: "ElicitIntent" = "ElicitIntent"
  val ElicitSlot: "ElicitSlot" = "ElicitSlot"

  @inline def values = js.Array[DialogActionType](Close, ConfirmIntent, Delegate, ElicitIntent, ElicitSlot)
}

type IntentState = "Failed" | "Fulfilled" | "InProgress" | "ReadyForFulfillment" | "Waiting"
object IntentState {
  val Failed: "Failed" = "Failed"
  val Fulfilled: "Fulfilled" = "Fulfilled"
  val InProgress: "InProgress" = "InProgress"
  val ReadyForFulfillment: "ReadyForFulfillment" = "ReadyForFulfillment"
  val Waiting: "Waiting" = "Waiting"

  @inline def values = js.Array[IntentState](Failed, Fulfilled, InProgress, ReadyForFulfillment, Waiting)
}

type MessageContentType = "CustomPayload" | "ImageResponseCard" | "PlainText" | "SSML"
object MessageContentType {
  val CustomPayload: "CustomPayload" = "CustomPayload"
  val ImageResponseCard: "ImageResponseCard" = "ImageResponseCard"
  val PlainText: "PlainText" = "PlainText"
  val SSML: "SSML" = "SSML"

  @inline def values = js.Array[MessageContentType](CustomPayload, ImageResponseCard, PlainText, SSML)
}

type SentimentType = "MIXED" | "NEGATIVE" | "NEUTRAL" | "POSITIVE"
object SentimentType {
  val MIXED: "MIXED" = "MIXED"
  val NEGATIVE: "NEGATIVE" = "NEGATIVE"
  val NEUTRAL: "NEUTRAL" = "NEUTRAL"
  val POSITIVE: "POSITIVE" = "POSITIVE"

  @inline def values = js.Array[SentimentType](MIXED, NEGATIVE, NEUTRAL, POSITIVE)
}
