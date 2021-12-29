package facade.amazonaws.services.lexruntime

import scalajs._

type ConfirmationStatus = "None" | "Confirmed" | "Denied"
object ConfirmationStatus {
  inline val None: "None" = "None"
  inline val Confirmed: "Confirmed" = "Confirmed"
  inline val Denied: "Denied" = "Denied"

  inline def values: js.Array[ConfirmationStatus] = js.Array(None, Confirmed, Denied)
}

type ContentType = "application/vnd.amazonaws.card.generic"
object ContentType {
  inline val `application/vnd.amazonaws.card.generic`: "application/vnd.amazonaws.card.generic" = "application/vnd.amazonaws.card.generic"

  inline def values: js.Array[ContentType] = js.Array(`application/vnd.amazonaws.card.generic`)
}

type DialogActionType = "ElicitIntent" | "ConfirmIntent" | "ElicitSlot" | "Close" | "Delegate"
object DialogActionType {
  inline val ElicitIntent: "ElicitIntent" = "ElicitIntent"
  inline val ConfirmIntent: "ConfirmIntent" = "ConfirmIntent"
  inline val ElicitSlot: "ElicitSlot" = "ElicitSlot"
  inline val Close: "Close" = "Close"
  inline val Delegate: "Delegate" = "Delegate"

  inline def values: js.Array[DialogActionType] = js.Array(ElicitIntent, ConfirmIntent, ElicitSlot, Close, Delegate)
}

type DialogState = "ElicitIntent" | "ConfirmIntent" | "ElicitSlot" | "Fulfilled" | "ReadyForFulfillment" | "Failed"
object DialogState {
  inline val ElicitIntent: "ElicitIntent" = "ElicitIntent"
  inline val ConfirmIntent: "ConfirmIntent" = "ConfirmIntent"
  inline val ElicitSlot: "ElicitSlot" = "ElicitSlot"
  inline val Fulfilled: "Fulfilled" = "Fulfilled"
  inline val ReadyForFulfillment: "ReadyForFulfillment" = "ReadyForFulfillment"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[DialogState] = js.Array(ElicitIntent, ConfirmIntent, ElicitSlot, Fulfilled, ReadyForFulfillment, Failed)
}

type FulfillmentState = "Fulfilled" | "Failed" | "ReadyForFulfillment"
object FulfillmentState {
  inline val Fulfilled: "Fulfilled" = "Fulfilled"
  inline val Failed: "Failed" = "Failed"
  inline val ReadyForFulfillment: "ReadyForFulfillment" = "ReadyForFulfillment"

  inline def values: js.Array[FulfillmentState] = js.Array(Fulfilled, Failed, ReadyForFulfillment)
}

type MessageFormatType = "PlainText" | "CustomPayload" | "SSML" | "Composite"
object MessageFormatType {
  inline val PlainText: "PlainText" = "PlainText"
  inline val CustomPayload: "CustomPayload" = "CustomPayload"
  inline val SSML: "SSML" = "SSML"
  inline val Composite: "Composite" = "Composite"

  inline def values: js.Array[MessageFormatType] = js.Array(PlainText, CustomPayload, SSML, Composite)
}
