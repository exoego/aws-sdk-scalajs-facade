package facade.amazonaws.services.ssmcontacts

import scalajs.js

@js.native
sealed trait AcceptCodeValidation extends js.Any
object AcceptCodeValidation {
  val IGNORE = "IGNORE".asInstanceOf[AcceptCodeValidation]
  val ENFORCE = "ENFORCE".asInstanceOf[AcceptCodeValidation]

  @inline def values: js.Array[AcceptCodeValidation] = js.Array(IGNORE, ENFORCE)
}

@js.native
sealed trait AcceptType extends js.Any
object AcceptType {
  val DELIVERED = "DELIVERED".asInstanceOf[AcceptType]
  val READ = "READ".asInstanceOf[AcceptType]

  @inline def values: js.Array[AcceptType] = js.Array(DELIVERED, READ)
}

@js.native
sealed trait ActivationStatus extends js.Any
object ActivationStatus {
  val ACTIVATED = "ACTIVATED".asInstanceOf[ActivationStatus]
  val NOT_ACTIVATED = "NOT_ACTIVATED".asInstanceOf[ActivationStatus]

  @inline def values: js.Array[ActivationStatus] = js.Array(ACTIVATED, NOT_ACTIVATED)
}

@js.native
sealed trait ChannelType extends js.Any
object ChannelType {
  val SMS = "SMS".asInstanceOf[ChannelType]
  val VOICE = "VOICE".asInstanceOf[ChannelType]
  val EMAIL = "EMAIL".asInstanceOf[ChannelType]

  @inline def values: js.Array[ChannelType] = js.Array(SMS, VOICE, EMAIL)
}

@js.native
sealed trait ContactType extends js.Any
object ContactType {
  val PERSONAL = "PERSONAL".asInstanceOf[ContactType]
  val ESCALATION = "ESCALATION".asInstanceOf[ContactType]

  @inline def values: js.Array[ContactType] = js.Array(PERSONAL, ESCALATION)
}

@js.native
sealed trait ReceiptType extends js.Any
object ReceiptType {
  val DELIVERED = "DELIVERED".asInstanceOf[ReceiptType]
  val ERROR = "ERROR".asInstanceOf[ReceiptType]
  val READ = "READ".asInstanceOf[ReceiptType]
  val SENT = "SENT".asInstanceOf[ReceiptType]
  val STOP = "STOP".asInstanceOf[ReceiptType]

  @inline def values: js.Array[ReceiptType] = js.Array(DELIVERED, ERROR, READ, SENT, STOP)
}
