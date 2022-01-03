package facade.amazonaws.services.ssmcontacts

import scalajs.js

type AcceptCodeValidation = "IGNORE" | "ENFORCE"
object AcceptCodeValidation {
  inline val IGNORE: "IGNORE" = "IGNORE"
  inline val ENFORCE: "ENFORCE" = "ENFORCE"

  inline def values: js.Array[AcceptCodeValidation] = js.Array(IGNORE, ENFORCE)
}

type AcceptType = "DELIVERED" | "READ"
object AcceptType {
  inline val DELIVERED: "DELIVERED" = "DELIVERED"
  inline val READ: "READ" = "READ"

  inline def values: js.Array[AcceptType] = js.Array(DELIVERED, READ)
}

type ActivationStatus = "ACTIVATED" | "NOT_ACTIVATED"
object ActivationStatus {
  inline val ACTIVATED: "ACTIVATED" = "ACTIVATED"
  inline val NOT_ACTIVATED: "NOT_ACTIVATED" = "NOT_ACTIVATED"

  inline def values: js.Array[ActivationStatus] = js.Array(ACTIVATED, NOT_ACTIVATED)
}

type ChannelType = "SMS" | "VOICE" | "EMAIL"
object ChannelType {
  inline val SMS: "SMS" = "SMS"
  inline val VOICE: "VOICE" = "VOICE"
  inline val EMAIL: "EMAIL" = "EMAIL"

  inline def values: js.Array[ChannelType] = js.Array(SMS, VOICE, EMAIL)
}

type ContactType = "PERSONAL" | "ESCALATION"
object ContactType {
  inline val PERSONAL: "PERSONAL" = "PERSONAL"
  inline val ESCALATION: "ESCALATION" = "ESCALATION"

  inline def values: js.Array[ContactType] = js.Array(PERSONAL, ESCALATION)
}

type ReceiptType = "DELIVERED" | "ERROR" | "READ" | "SENT" | "STOP"
object ReceiptType {
  inline val DELIVERED: "DELIVERED" = "DELIVERED"
  inline val ERROR: "ERROR" = "ERROR"
  inline val READ: "READ" = "READ"
  inline val SENT: "SENT" = "SENT"
  inline val STOP: "STOP" = "STOP"

  inline def values: js.Array[ReceiptType] = js.Array(DELIVERED, ERROR, READ, SENT, STOP)
}
