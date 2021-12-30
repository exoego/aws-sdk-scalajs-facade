package facade.amazonaws.services.ses

import scalajs.js

@js.native
sealed trait BehaviorOnMXFailure extends js.Any
object BehaviorOnMXFailure {
  val UseDefaultValue = "UseDefaultValue".asInstanceOf[BehaviorOnMXFailure]
  val RejectMessage = "RejectMessage".asInstanceOf[BehaviorOnMXFailure]

  @inline def values: js.Array[BehaviorOnMXFailure] = js.Array(UseDefaultValue, RejectMessage)
}

@js.native
sealed trait BounceType extends js.Any
object BounceType {
  val DoesNotExist = "DoesNotExist".asInstanceOf[BounceType]
  val MessageTooLarge = "MessageTooLarge".asInstanceOf[BounceType]
  val ExceededQuota = "ExceededQuota".asInstanceOf[BounceType]
  val ContentRejected = "ContentRejected".asInstanceOf[BounceType]
  val Undefined = "Undefined".asInstanceOf[BounceType]
  val TemporaryFailure = "TemporaryFailure".asInstanceOf[BounceType]

  @inline def values: js.Array[BounceType] = js.Array(DoesNotExist, MessageTooLarge, ExceededQuota, ContentRejected, Undefined, TemporaryFailure)
}

@js.native
sealed trait BulkEmailStatus extends js.Any
object BulkEmailStatus {
  val Success = "Success".asInstanceOf[BulkEmailStatus]
  val MessageRejected = "MessageRejected".asInstanceOf[BulkEmailStatus]
  val MailFromDomainNotVerified = "MailFromDomainNotVerified".asInstanceOf[BulkEmailStatus]
  val ConfigurationSetDoesNotExist = "ConfigurationSetDoesNotExist".asInstanceOf[BulkEmailStatus]
  val TemplateDoesNotExist = "TemplateDoesNotExist".asInstanceOf[BulkEmailStatus]
  val AccountSuspended = "AccountSuspended".asInstanceOf[BulkEmailStatus]
  val AccountThrottled = "AccountThrottled".asInstanceOf[BulkEmailStatus]
  val AccountDailyQuotaExceeded = "AccountDailyQuotaExceeded".asInstanceOf[BulkEmailStatus]
  val InvalidSendingPoolName = "InvalidSendingPoolName".asInstanceOf[BulkEmailStatus]
  val AccountSendingPaused = "AccountSendingPaused".asInstanceOf[BulkEmailStatus]
  val ConfigurationSetSendingPaused = "ConfigurationSetSendingPaused".asInstanceOf[BulkEmailStatus]
  val InvalidParameterValue = "InvalidParameterValue".asInstanceOf[BulkEmailStatus]
  val TransientFailure = "TransientFailure".asInstanceOf[BulkEmailStatus]
  val Failed = "Failed".asInstanceOf[BulkEmailStatus]

  @inline def values: js.Array[BulkEmailStatus] = js.Array(
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

@js.native
sealed trait ConfigurationSetAttribute extends js.Any
object ConfigurationSetAttribute {
  val eventDestinations = "eventDestinations".asInstanceOf[ConfigurationSetAttribute]
  val trackingOptions = "trackingOptions".asInstanceOf[ConfigurationSetAttribute]
  val deliveryOptions = "deliveryOptions".asInstanceOf[ConfigurationSetAttribute]
  val reputationOptions = "reputationOptions".asInstanceOf[ConfigurationSetAttribute]

  @inline def values: js.Array[ConfigurationSetAttribute] = js.Array(eventDestinations, trackingOptions, deliveryOptions, reputationOptions)
}

@js.native
sealed trait CustomMailFromStatus extends js.Any
object CustomMailFromStatus {
  val Pending = "Pending".asInstanceOf[CustomMailFromStatus]
  val Success = "Success".asInstanceOf[CustomMailFromStatus]
  val Failed = "Failed".asInstanceOf[CustomMailFromStatus]
  val TemporaryFailure = "TemporaryFailure".asInstanceOf[CustomMailFromStatus]

  @inline def values: js.Array[CustomMailFromStatus] = js.Array(Pending, Success, Failed, TemporaryFailure)
}

@js.native
sealed trait DimensionValueSource extends js.Any
object DimensionValueSource {
  val messageTag = "messageTag".asInstanceOf[DimensionValueSource]
  val emailHeader = "emailHeader".asInstanceOf[DimensionValueSource]
  val linkTag = "linkTag".asInstanceOf[DimensionValueSource]

  @inline def values: js.Array[DimensionValueSource] = js.Array(messageTag, emailHeader, linkTag)
}

@js.native
sealed trait DsnAction extends js.Any
object DsnAction {
  val failed = "failed".asInstanceOf[DsnAction]
  val delayed = "delayed".asInstanceOf[DsnAction]
  val delivered = "delivered".asInstanceOf[DsnAction]
  val relayed = "relayed".asInstanceOf[DsnAction]
  val expanded = "expanded".asInstanceOf[DsnAction]

  @inline def values: js.Array[DsnAction] = js.Array(failed, delayed, delivered, relayed, expanded)
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val send = "send".asInstanceOf[EventType]
  val reject = "reject".asInstanceOf[EventType]
  val bounce = "bounce".asInstanceOf[EventType]
  val complaint = "complaint".asInstanceOf[EventType]
  val delivery = "delivery".asInstanceOf[EventType]
  val open = "open".asInstanceOf[EventType]
  val click = "click".asInstanceOf[EventType]
  val renderingFailure = "renderingFailure".asInstanceOf[EventType]

  @inline def values: js.Array[EventType] = js.Array(send, reject, bounce, complaint, delivery, open, click, renderingFailure)
}

@js.native
sealed trait IdentityType extends js.Any
object IdentityType {
  val EmailAddress = "EmailAddress".asInstanceOf[IdentityType]
  val Domain = "Domain".asInstanceOf[IdentityType]

  @inline def values: js.Array[IdentityType] = js.Array(EmailAddress, Domain)
}

@js.native
sealed trait InvocationType extends js.Any
object InvocationType {
  val Event = "Event".asInstanceOf[InvocationType]
  val RequestResponse = "RequestResponse".asInstanceOf[InvocationType]

  @inline def values: js.Array[InvocationType] = js.Array(Event, RequestResponse)
}

@js.native
sealed trait NotificationType extends js.Any
object NotificationType {
  val Bounce = "Bounce".asInstanceOf[NotificationType]
  val Complaint = "Complaint".asInstanceOf[NotificationType]
  val Delivery = "Delivery".asInstanceOf[NotificationType]

  @inline def values: js.Array[NotificationType] = js.Array(Bounce, Complaint, Delivery)
}

@js.native
sealed trait ReceiptFilterPolicy extends js.Any
object ReceiptFilterPolicy {
  val Block = "Block".asInstanceOf[ReceiptFilterPolicy]
  val Allow = "Allow".asInstanceOf[ReceiptFilterPolicy]

  @inline def values: js.Array[ReceiptFilterPolicy] = js.Array(Block, Allow)
}

@js.native
sealed trait SNSActionEncoding extends js.Any
object SNSActionEncoding {
  val `UTF-8` = "UTF-8".asInstanceOf[SNSActionEncoding]
  val Base64 = "Base64".asInstanceOf[SNSActionEncoding]

  @inline def values: js.Array[SNSActionEncoding] = js.Array(`UTF-8`, Base64)
}

@js.native
sealed trait StopScope extends js.Any
object StopScope {
  val RuleSet = "RuleSet".asInstanceOf[StopScope]

  @inline def values: js.Array[StopScope] = js.Array(RuleSet)
}

@js.native
sealed trait TlsPolicy extends js.Any
object TlsPolicy {
  val Require = "Require".asInstanceOf[TlsPolicy]
  val Optional = "Optional".asInstanceOf[TlsPolicy]

  @inline def values: js.Array[TlsPolicy] = js.Array(Require, Optional)
}

@js.native
sealed trait VerificationStatus extends js.Any
object VerificationStatus {
  val Pending = "Pending".asInstanceOf[VerificationStatus]
  val Success = "Success".asInstanceOf[VerificationStatus]
  val Failed = "Failed".asInstanceOf[VerificationStatus]
  val TemporaryFailure = "TemporaryFailure".asInstanceOf[VerificationStatus]
  val NotStarted = "NotStarted".asInstanceOf[VerificationStatus]

  @inline def values: js.Array[VerificationStatus] = js.Array(Pending, Success, Failed, TemporaryFailure, NotStarted)
}
