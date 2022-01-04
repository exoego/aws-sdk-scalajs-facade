package facade.amazonaws.services.lexruntimev2

import scalajs.js

type ConfirmationState = "Confirmed" | "Denied" | "None"
object ConfirmationState {
  inline val Confirmed: "Confirmed" = "Confirmed"
  inline val Denied: "Denied" = "Denied"
  inline val None: "None" = "None"

  inline def values: js.Array[ConfirmationState] = js.Array(Confirmed, Denied, None)
}

type DialogActionType = "Close" | "ConfirmIntent" | "Delegate" | "ElicitIntent" | "ElicitSlot" | "None"
object DialogActionType {
  inline val Close: "Close" = "Close"
  inline val ConfirmIntent: "ConfirmIntent" = "ConfirmIntent"
  inline val Delegate: "Delegate" = "Delegate"
  inline val ElicitIntent: "ElicitIntent" = "ElicitIntent"
  inline val ElicitSlot: "ElicitSlot" = "ElicitSlot"
  inline val None: "None" = "None"

  inline def values: js.Array[DialogActionType] = js.Array(Close, ConfirmIntent, Delegate, ElicitIntent, ElicitSlot, None)
}

type IntentState = "Failed" | "Fulfilled" | "InProgress" | "ReadyForFulfillment" | "Waiting" | "FulfillmentInProgress"
object IntentState {
  inline val Failed: "Failed" = "Failed"
  inline val Fulfilled: "Fulfilled" = "Fulfilled"
  inline val InProgress: "InProgress" = "InProgress"
  inline val ReadyForFulfillment: "ReadyForFulfillment" = "ReadyForFulfillment"
  inline val Waiting: "Waiting" = "Waiting"
  inline val FulfillmentInProgress: "FulfillmentInProgress" = "FulfillmentInProgress"

  inline def values: js.Array[IntentState] = js.Array(Failed, Fulfilled, InProgress, ReadyForFulfillment, Waiting, FulfillmentInProgress)
}

type MessageContentType = "CustomPayload" | "ImageResponseCard" | "PlainText" | "SSML"
object MessageContentType {
  inline val CustomPayload: "CustomPayload" = "CustomPayload"
  inline val ImageResponseCard: "ImageResponseCard" = "ImageResponseCard"
  inline val PlainText: "PlainText" = "PlainText"
  inline val SSML: "SSML" = "SSML"

  inline def values: js.Array[MessageContentType] = js.Array(CustomPayload, ImageResponseCard, PlainText, SSML)
}

type SentimentType = "MIXED" | "NEGATIVE" | "NEUTRAL" | "POSITIVE"
object SentimentType {
  inline val MIXED: "MIXED" = "MIXED"
  inline val NEGATIVE: "NEGATIVE" = "NEGATIVE"
  inline val NEUTRAL: "NEUTRAL" = "NEUTRAL"
  inline val POSITIVE: "POSITIVE" = "POSITIVE"

  inline def values: js.Array[SentimentType] = js.Array(MIXED, NEGATIVE, NEUTRAL, POSITIVE)
}

type Shape = "Scalar" | "List"
object Shape {
  inline val Scalar: "Scalar" = "Scalar"
  inline val List: "List" = "List"

  inline def values: js.Array[Shape] = js.Array(Scalar, List)
}

type StyleType = "Default" | "SpellByLetter" | "SpellByWord"
object StyleType {
  inline val Default: "Default" = "Default"
  inline val SpellByLetter: "SpellByLetter" = "SpellByLetter"
  inline val SpellByWord: "SpellByWord" = "SpellByWord"

  inline def values: js.Array[StyleType] = js.Array(Default, SpellByLetter, SpellByWord)
}
