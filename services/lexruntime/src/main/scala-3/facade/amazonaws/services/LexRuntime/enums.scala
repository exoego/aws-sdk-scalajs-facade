package facade.amazonaws.services.lexruntime

import scalajs._
import scala.scalajs.js.|

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

@js.native
sealed trait MessageFormatType extends js.Any
object MessageFormatType {
  val PlainText = "PlainText".asInstanceOf[MessageFormatType]
  val CustomPayload = "CustomPayload".asInstanceOf[MessageFormatType]
  val SSML = "SSML".asInstanceOf[MessageFormatType]
  val Composite = "Composite".asInstanceOf[MessageFormatType]

  @inline def values = js.Array(PlainText, CustomPayload, SSML, Composite)
}
