package facade.amazonaws.services.ses

import scalajs._

type BehaviorOnMXFailure = "UseDefaultValue" | "RejectMessage"
object BehaviorOnMXFailure {
  val UseDefaultValue: "UseDefaultValue" = "UseDefaultValue"
  val RejectMessage: "RejectMessage" = "RejectMessage"

  @inline def values = js.Array[BehaviorOnMXFailure](UseDefaultValue, RejectMessage)
}

type BounceType = "DoesNotExist" | "MessageTooLarge" | "ExceededQuota" | "ContentRejected" | "Undefined" | "TemporaryFailure"
object BounceType {
  val DoesNotExist: "DoesNotExist" = "DoesNotExist"
  val MessageTooLarge: "MessageTooLarge" = "MessageTooLarge"
  val ExceededQuota: "ExceededQuota" = "ExceededQuota"
  val ContentRejected: "ContentRejected" = "ContentRejected"
  val Undefined: "Undefined" = "Undefined"
  val TemporaryFailure: "TemporaryFailure" = "TemporaryFailure"

  @inline def values = js.Array[BounceType](DoesNotExist, MessageTooLarge, ExceededQuota, ContentRejected, Undefined, TemporaryFailure)
}

type BulkEmailStatus = "Success" | "MessageRejected" | "MailFromDomainNotVerified" | "ConfigurationSetDoesNotExist" | "TemplateDoesNotExist" | "AccountSuspended" | "AccountThrottled" | "AccountDailyQuotaExceeded" | "InvalidSendingPoolName" | "AccountSendingPaused" | "ConfigurationSetSendingPaused" | "InvalidParameterValue" | "TransientFailure" | "Failed"
object BulkEmailStatus {
  val Success: "Success" = "Success"
  val MessageRejected: "MessageRejected" = "MessageRejected"
  val MailFromDomainNotVerified: "MailFromDomainNotVerified" = "MailFromDomainNotVerified"
  val ConfigurationSetDoesNotExist: "ConfigurationSetDoesNotExist" = "ConfigurationSetDoesNotExist"
  val TemplateDoesNotExist: "TemplateDoesNotExist" = "TemplateDoesNotExist"
  val AccountSuspended: "AccountSuspended" = "AccountSuspended"
  val AccountThrottled: "AccountThrottled" = "AccountThrottled"
  val AccountDailyQuotaExceeded: "AccountDailyQuotaExceeded" = "AccountDailyQuotaExceeded"
  val InvalidSendingPoolName: "InvalidSendingPoolName" = "InvalidSendingPoolName"
  val AccountSendingPaused: "AccountSendingPaused" = "AccountSendingPaused"
  val ConfigurationSetSendingPaused: "ConfigurationSetSendingPaused" = "ConfigurationSetSendingPaused"
  val InvalidParameterValue: "InvalidParameterValue" = "InvalidParameterValue"
  val TransientFailure: "TransientFailure" = "TransientFailure"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[BulkEmailStatus](
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
  val eventDestinations: "eventDestinations" = "eventDestinations"
  val trackingOptions: "trackingOptions" = "trackingOptions"
  val deliveryOptions: "deliveryOptions" = "deliveryOptions"
  val reputationOptions: "reputationOptions" = "reputationOptions"

  @inline def values = js.Array[ConfigurationSetAttribute](eventDestinations, trackingOptions, deliveryOptions, reputationOptions)
}

type CustomMailFromStatus = "Pending" | "Success" | "Failed" | "TemporaryFailure"
object CustomMailFromStatus {
  val Pending: "Pending" = "Pending"
  val Success: "Success" = "Success"
  val Failed: "Failed" = "Failed"
  val TemporaryFailure: "TemporaryFailure" = "TemporaryFailure"

  @inline def values = js.Array[CustomMailFromStatus](Pending, Success, Failed, TemporaryFailure)
}

type DimensionValueSource = "messageTag" | "emailHeader" | "linkTag"
object DimensionValueSource {
  val messageTag: "messageTag" = "messageTag"
  val emailHeader: "emailHeader" = "emailHeader"
  val linkTag: "linkTag" = "linkTag"

  @inline def values = js.Array[DimensionValueSource](messageTag, emailHeader, linkTag)
}

type DsnAction = "failed" | "delayed" | "delivered" | "relayed" | "expanded"
object DsnAction {
  val failed: "failed" = "failed"
  val delayed: "delayed" = "delayed"
  val delivered: "delivered" = "delivered"
  val relayed: "relayed" = "relayed"
  val expanded: "expanded" = "expanded"

  @inline def values = js.Array[DsnAction](failed, delayed, delivered, relayed, expanded)
}

type EventType = "send" | "reject" | "bounce" | "complaint" | "delivery" | "open" | "click" | "renderingFailure"
object EventType {
  val send: "send" = "send"
  val reject: "reject" = "reject"
  val bounce: "bounce" = "bounce"
  val complaint: "complaint" = "complaint"
  val delivery: "delivery" = "delivery"
  val open: "open" = "open"
  val click: "click" = "click"
  val renderingFailure: "renderingFailure" = "renderingFailure"

  @inline def values = js.Array[EventType](send, reject, bounce, complaint, delivery, open, click, renderingFailure)
}

type IdentityType = "EmailAddress" | "Domain"
object IdentityType {
  val EmailAddress: "EmailAddress" = "EmailAddress"
  val Domain: "Domain" = "Domain"

  @inline def values = js.Array[IdentityType](EmailAddress, Domain)
}

type InvocationType = "Event" | "RequestResponse"
object InvocationType {
  val Event: "Event" = "Event"
  val RequestResponse: "RequestResponse" = "RequestResponse"

  @inline def values = js.Array[InvocationType](Event, RequestResponse)
}

type NotificationType = "Bounce" | "Complaint" | "Delivery"
object NotificationType {
  val Bounce: "Bounce" = "Bounce"
  val Complaint: "Complaint" = "Complaint"
  val Delivery: "Delivery" = "Delivery"

  @inline def values = js.Array[NotificationType](Bounce, Complaint, Delivery)
}

type ReceiptFilterPolicy = "Block" | "Allow"
object ReceiptFilterPolicy {
  val Block: "Block" = "Block"
  val Allow: "Allow" = "Allow"

  @inline def values = js.Array[ReceiptFilterPolicy](Block, Allow)
}

type SNSActionEncoding = "UTF-8" | "Base64"
object SNSActionEncoding {
  val `UTF-8`: "UTF-8" = "UTF-8"
  val Base64: "Base64" = "Base64"

  @inline def values = js.Array[SNSActionEncoding](`UTF-8`, Base64)
}

type StopScope = "RuleSet"
object StopScope {
  val RuleSet: "RuleSet" = "RuleSet"

  @inline def values = js.Array[StopScope](RuleSet)
}

type TlsPolicy = "Require" | "Optional"
object TlsPolicy {
  val Require: "Require" = "Require"
  val Optional: "Optional" = "Optional"

  @inline def values = js.Array[TlsPolicy](Require, Optional)
}

type VerificationStatus = "Pending" | "Success" | "Failed" | "TemporaryFailure" | "NotStarted"
object VerificationStatus {
  val Pending: "Pending" = "Pending"
  val Success: "Success" = "Success"
  val Failed: "Failed" = "Failed"
  val TemporaryFailure: "TemporaryFailure" = "TemporaryFailure"
  val NotStarted: "NotStarted" = "NotStarted"

  @inline def values = js.Array[VerificationStatus](Pending, Success, Failed, TemporaryFailure, NotStarted)
}
