package facade.amazonaws.services.lexruntime

import scalajs._

type ConfirmationStatus = "None" | "Confirmed" | "Denied"
object ConfirmationStatus {
  val None: "None" = "None"
  val Confirmed: "Confirmed" = "Confirmed"
  val Denied: "Denied" = "Denied"

  @inline def values = js.Array[ConfirmationStatus](None, Confirmed, Denied)
}

type ContentType = "application/vnd.amazonaws.card.generic"
object ContentType {
  val `application/vnd.amazonaws.card.generic`: "application/vnd.amazonaws.card.generic" = "application/vnd.amazonaws.card.generic"

  @inline def values = js.Array[ContentType](`application/vnd.amazonaws.card.generic`)
}

type DialogActionType = "ElicitIntent" | "ConfirmIntent" | "ElicitSlot" | "Close" | "Delegate"
object DialogActionType {
  val ElicitIntent: "ElicitIntent" = "ElicitIntent"
  val ConfirmIntent: "ConfirmIntent" = "ConfirmIntent"
  val ElicitSlot: "ElicitSlot" = "ElicitSlot"
  val Close: "Close" = "Close"
  val Delegate: "Delegate" = "Delegate"

  @inline def values = js.Array[DialogActionType](ElicitIntent, ConfirmIntent, ElicitSlot, Close, Delegate)
}

type DialogState = "ElicitIntent" | "ConfirmIntent" | "ElicitSlot" | "Fulfilled" | "ReadyForFulfillment" | "Failed"
object DialogState {
  val ElicitIntent: "ElicitIntent" = "ElicitIntent"
  val ConfirmIntent: "ConfirmIntent" = "ConfirmIntent"
  val ElicitSlot: "ElicitSlot" = "ElicitSlot"
  val Fulfilled: "Fulfilled" = "Fulfilled"
  val ReadyForFulfillment: "ReadyForFulfillment" = "ReadyForFulfillment"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[DialogState](ElicitIntent, ConfirmIntent, ElicitSlot, Fulfilled, ReadyForFulfillment, Failed)
}

type FulfillmentState = "Fulfilled" | "Failed" | "ReadyForFulfillment"
object FulfillmentState {
  val Fulfilled: "Fulfilled" = "Fulfilled"
  val Failed: "Failed" = "Failed"
  val ReadyForFulfillment: "ReadyForFulfillment" = "ReadyForFulfillment"

  @inline def values = js.Array[FulfillmentState](Fulfilled, Failed, ReadyForFulfillment)
}

type MessageFormatType = "PlainText" | "CustomPayload" | "SSML" | "Composite"
object MessageFormatType {
  val PlainText: "PlainText" = "PlainText"
  val CustomPayload: "CustomPayload" = "CustomPayload"
  val SSML: "SSML" = "SSML"
  val Composite: "Composite" = "Composite"

  @inline def values = js.Array[MessageFormatType](PlainText, CustomPayload, SSML, Composite)
}
