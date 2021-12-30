package facade.amazonaws.services.ses

import scalajs.js

type BehaviorOnMXFailure = "UseDefaultValue" | "RejectMessage"
object BehaviorOnMXFailure {
  inline val UseDefaultValue: "UseDefaultValue" = "UseDefaultValue"
  inline val RejectMessage: "RejectMessage" = "RejectMessage"

  inline def values: js.Array[BehaviorOnMXFailure] = js.Array(UseDefaultValue, RejectMessage)
}

type BounceType = "DoesNotExist" | "MessageTooLarge" | "ExceededQuota" | "ContentRejected" | "Undefined" | "TemporaryFailure"
object BounceType {
  inline val DoesNotExist: "DoesNotExist" = "DoesNotExist"
  inline val MessageTooLarge: "MessageTooLarge" = "MessageTooLarge"
  inline val ExceededQuota: "ExceededQuota" = "ExceededQuota"
  inline val ContentRejected: "ContentRejected" = "ContentRejected"
  inline val Undefined: "Undefined" = "Undefined"
  inline val TemporaryFailure: "TemporaryFailure" = "TemporaryFailure"

  inline def values: js.Array[BounceType] = js.Array(DoesNotExist, MessageTooLarge, ExceededQuota, ContentRejected, Undefined, TemporaryFailure)
}

type BulkEmailStatus = "Success" | "MessageRejected" | "MailFromDomainNotVerified" | "ConfigurationSetDoesNotExist" | "TemplateDoesNotExist" | "AccountSuspended" | "AccountThrottled" | "AccountDailyQuotaExceeded" | "InvalidSendingPoolName" | "AccountSendingPaused" | "ConfigurationSetSendingPaused" | "InvalidParameterValue" | "TransientFailure" | "Failed"
object BulkEmailStatus {
  inline val Success: "Success" = "Success"
  inline val MessageRejected: "MessageRejected" = "MessageRejected"
  inline val MailFromDomainNotVerified: "MailFromDomainNotVerified" = "MailFromDomainNotVerified"
  inline val ConfigurationSetDoesNotExist: "ConfigurationSetDoesNotExist" = "ConfigurationSetDoesNotExist"
  inline val TemplateDoesNotExist: "TemplateDoesNotExist" = "TemplateDoesNotExist"
  inline val AccountSuspended: "AccountSuspended" = "AccountSuspended"
  inline val AccountThrottled: "AccountThrottled" = "AccountThrottled"
  inline val AccountDailyQuotaExceeded: "AccountDailyQuotaExceeded" = "AccountDailyQuotaExceeded"
  inline val InvalidSendingPoolName: "InvalidSendingPoolName" = "InvalidSendingPoolName"
  inline val AccountSendingPaused: "AccountSendingPaused" = "AccountSendingPaused"
  inline val ConfigurationSetSendingPaused: "ConfigurationSetSendingPaused" = "ConfigurationSetSendingPaused"
  inline val InvalidParameterValue: "InvalidParameterValue" = "InvalidParameterValue"
  inline val TransientFailure: "TransientFailure" = "TransientFailure"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[BulkEmailStatus] = js.Array(
    Success,
    MessageRejected,
    MailFromDomainNotVerified,
    ConfigurationSetDoesNotExist,
    TemplateDoesNotExist,
    AccountSuspended,
    AccountThrottled,
    AccountDailyQuotaExceeded,
    InvalidSendingPoolName,
    AccountSendingPaused,
    ConfigurationSetSendingPaused,
    InvalidParameterValue,
    TransientFailure,
    Failed
  )
}

type ConfigurationSetAttribute = "eventDestinations" | "trackingOptions" | "deliveryOptions" | "reputationOptions"
object ConfigurationSetAttribute {
  inline val eventDestinations: "eventDestinations" = "eventDestinations"
  inline val trackingOptions: "trackingOptions" = "trackingOptions"
  inline val deliveryOptions: "deliveryOptions" = "deliveryOptions"
  inline val reputationOptions: "reputationOptions" = "reputationOptions"

  inline def values: js.Array[ConfigurationSetAttribute] = js.Array(eventDestinations, trackingOptions, deliveryOptions, reputationOptions)
}

type CustomMailFromStatus = "Pending" | "Success" | "Failed" | "TemporaryFailure"
object CustomMailFromStatus {
  inline val Pending: "Pending" = "Pending"
  inline val Success: "Success" = "Success"
  inline val Failed: "Failed" = "Failed"
  inline val TemporaryFailure: "TemporaryFailure" = "TemporaryFailure"

  inline def values: js.Array[CustomMailFromStatus] = js.Array(Pending, Success, Failed, TemporaryFailure)
}

type DimensionValueSource = "messageTag" | "emailHeader" | "linkTag"
object DimensionValueSource {
  inline val messageTag: "messageTag" = "messageTag"
  inline val emailHeader: "emailHeader" = "emailHeader"
  inline val linkTag: "linkTag" = "linkTag"

  inline def values: js.Array[DimensionValueSource] = js.Array(messageTag, emailHeader, linkTag)
}

type DsnAction = "failed" | "delayed" | "delivered" | "relayed" | "expanded"
object DsnAction {
  inline val failed: "failed" = "failed"
  inline val delayed: "delayed" = "delayed"
  inline val delivered: "delivered" = "delivered"
  inline val relayed: "relayed" = "relayed"
  inline val expanded: "expanded" = "expanded"

  inline def values: js.Array[DsnAction] = js.Array(failed, delayed, delivered, relayed, expanded)
}

type EventType = "send" | "reject" | "bounce" | "complaint" | "delivery" | "open" | "click" | "renderingFailure"
object EventType {
  inline val send: "send" = "send"
  inline val reject: "reject" = "reject"
  inline val bounce: "bounce" = "bounce"
  inline val complaint: "complaint" = "complaint"
  inline val delivery: "delivery" = "delivery"
  inline val open: "open" = "open"
  inline val click: "click" = "click"
  inline val renderingFailure: "renderingFailure" = "renderingFailure"

  inline def values: js.Array[EventType] = js.Array(send, reject, bounce, complaint, delivery, open, click, renderingFailure)
}

type IdentityType = "EmailAddress" | "Domain"
object IdentityType {
  inline val EmailAddress: "EmailAddress" = "EmailAddress"
  inline val Domain: "Domain" = "Domain"

  inline def values: js.Array[IdentityType] = js.Array(EmailAddress, Domain)
}

type InvocationType = "Event" | "RequestResponse"
object InvocationType {
  inline val Event: "Event" = "Event"
  inline val RequestResponse: "RequestResponse" = "RequestResponse"

  inline def values: js.Array[InvocationType] = js.Array(Event, RequestResponse)
}

type NotificationType = "Bounce" | "Complaint" | "Delivery"
object NotificationType {
  inline val Bounce: "Bounce" = "Bounce"
  inline val Complaint: "Complaint" = "Complaint"
  inline val Delivery: "Delivery" = "Delivery"

  inline def values: js.Array[NotificationType] = js.Array(Bounce, Complaint, Delivery)
}

type ReceiptFilterPolicy = "Block" | "Allow"
object ReceiptFilterPolicy {
  inline val Block: "Block" = "Block"
  inline val Allow: "Allow" = "Allow"

  inline def values: js.Array[ReceiptFilterPolicy] = js.Array(Block, Allow)
}

type SNSActionEncoding = "UTF-8" | "Base64"
object SNSActionEncoding {
  inline val `UTF-8`: "UTF-8" = "UTF-8"
  inline val Base64: "Base64" = "Base64"

  inline def values: js.Array[SNSActionEncoding] = js.Array(`UTF-8`, Base64)
}

type StopScope = "RuleSet"
object StopScope {
  inline val RuleSet: "RuleSet" = "RuleSet"

  inline def values: js.Array[StopScope] = js.Array(RuleSet)
}

type TlsPolicy = "Require" | "Optional"
object TlsPolicy {
  inline val Require: "Require" = "Require"
  inline val Optional: "Optional" = "Optional"

  inline def values: js.Array[TlsPolicy] = js.Array(Require, Optional)
}

type VerificationStatus = "Pending" | "Success" | "Failed" | "TemporaryFailure" | "NotStarted"
object VerificationStatus {
  inline val Pending: "Pending" = "Pending"
  inline val Success: "Success" = "Success"
  inline val Failed: "Failed" = "Failed"
  inline val TemporaryFailure: "TemporaryFailure" = "TemporaryFailure"
  inline val NotStarted: "NotStarted" = "NotStarted"

  inline def values: js.Array[VerificationStatus] = js.Array(Pending, Success, Failed, TemporaryFailure, NotStarted)
}
