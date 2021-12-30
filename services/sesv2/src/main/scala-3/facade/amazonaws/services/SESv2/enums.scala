package facade.amazonaws.services.sesv2

import scalajs.js

/** The action that you want to take if the required MX record can't be found when you send an email. When you set this value to <code>UseDefaultValue</code>, the mail is sent using <i>amazonses.com</i> as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>, the Amazon SES API v2 returns a <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email. These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
  */
type BehaviorOnMxFailure = "USE_DEFAULT_VALUE" | "REJECT_MESSAGE"
object BehaviorOnMxFailure {
  inline val USE_DEFAULT_VALUE: "USE_DEFAULT_VALUE" = "USE_DEFAULT_VALUE"
  inline val REJECT_MESSAGE: "REJECT_MESSAGE" = "REJECT_MESSAGE"

  inline def values: js.Array[BehaviorOnMxFailure] = js.Array(USE_DEFAULT_VALUE, REJECT_MESSAGE)
}

type BulkEmailStatus = "SUCCESS" | "MESSAGE_REJECTED" | "MAIL_FROM_DOMAIN_NOT_VERIFIED" | "CONFIGURATION_SET_NOT_FOUND" | "TEMPLATE_NOT_FOUND" | "ACCOUNT_SUSPENDED" | "ACCOUNT_THROTTLED" | "ACCOUNT_DAILY_QUOTA_EXCEEDED" | "INVALID_SENDING_POOL_NAME" | "ACCOUNT_SENDING_PAUSED" | "CONFIGURATION_SET_SENDING_PAUSED" | "INVALID_PARAMETER" | "TRANSIENT_FAILURE" | "FAILED"
object BulkEmailStatus {
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val MESSAGE_REJECTED: "MESSAGE_REJECTED" = "MESSAGE_REJECTED"
  inline val MAIL_FROM_DOMAIN_NOT_VERIFIED: "MAIL_FROM_DOMAIN_NOT_VERIFIED" = "MAIL_FROM_DOMAIN_NOT_VERIFIED"
  inline val CONFIGURATION_SET_NOT_FOUND: "CONFIGURATION_SET_NOT_FOUND" = "CONFIGURATION_SET_NOT_FOUND"
  inline val TEMPLATE_NOT_FOUND: "TEMPLATE_NOT_FOUND" = "TEMPLATE_NOT_FOUND"
  inline val ACCOUNT_SUSPENDED: "ACCOUNT_SUSPENDED" = "ACCOUNT_SUSPENDED"
  inline val ACCOUNT_THROTTLED: "ACCOUNT_THROTTLED" = "ACCOUNT_THROTTLED"
  inline val ACCOUNT_DAILY_QUOTA_EXCEEDED: "ACCOUNT_DAILY_QUOTA_EXCEEDED" = "ACCOUNT_DAILY_QUOTA_EXCEEDED"
  inline val INVALID_SENDING_POOL_NAME: "INVALID_SENDING_POOL_NAME" = "INVALID_SENDING_POOL_NAME"
  inline val ACCOUNT_SENDING_PAUSED: "ACCOUNT_SENDING_PAUSED" = "ACCOUNT_SENDING_PAUSED"
  inline val CONFIGURATION_SET_SENDING_PAUSED: "CONFIGURATION_SET_SENDING_PAUSED" = "CONFIGURATION_SET_SENDING_PAUSED"
  inline val INVALID_PARAMETER: "INVALID_PARAMETER" = "INVALID_PARAMETER"
  inline val TRANSIENT_FAILURE: "TRANSIENT_FAILURE" = "TRANSIENT_FAILURE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[BulkEmailStatus] = js.Array(
    SUCCESS,
    MESSAGE_REJECTED,
    MAIL_FROM_DOMAIN_NOT_VERIFIED,
    CONFIGURATION_SET_NOT_FOUND,
    TEMPLATE_NOT_FOUND,
    ACCOUNT_SUSPENDED,
    ACCOUNT_THROTTLED,
    ACCOUNT_DAILY_QUOTA_EXCEEDED,
    INVALID_SENDING_POOL_NAME,
    ACCOUNT_SENDING_PAUSED,
    CONFIGURATION_SET_SENDING_PAUSED,
    INVALID_PARAMETER,
    TRANSIENT_FAILURE,
    FAILED
  )
}

type ContactLanguage = "EN" | "JA"
object ContactLanguage {
  inline val EN: "EN" = "EN"
  inline val JA: "JA" = "JA"

  inline def values: js.Array[ContactLanguage] = js.Array(EN, JA)
}

type ContactListImportAction = "DELETE" | "PUT"
object ContactListImportAction {
  inline val DELETE: "DELETE" = "DELETE"
  inline val PUT: "PUT" = "PUT"

  inline def values: js.Array[ContactListImportAction] = js.Array(DELETE, PUT)
}

/** The data format of the import job's data source.
  */
type DataFormat = "CSV" | "JSON"
object DataFormat {
  inline val CSV: "CSV" = "CSV"
  inline val JSON: "JSON" = "JSON"

  inline def values: js.Array[DataFormat] = js.Array(CSV, JSON)
}

/** The current status of your Deliverability dashboard subscription. If this value is <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current calendar month.
  */
type DeliverabilityDashboardAccountStatus = "ACTIVE" | "PENDING_EXPIRATION" | "DISABLED"
object DeliverabilityDashboardAccountStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val PENDING_EXPIRATION: "PENDING_EXPIRATION" = "PENDING_EXPIRATION"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[DeliverabilityDashboardAccountStatus] = js.Array(ACTIVE, PENDING_EXPIRATION, DISABLED)
}

/** The status of a predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is <code>COMPLETE</code>, then the test is finished, and you can use the <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
  */
type DeliverabilityTestStatus = "IN_PROGRESS" | "COMPLETED"
object DeliverabilityTestStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[DeliverabilityTestStatus] = js.Array(IN_PROGRESS, COMPLETED)
}

/** The location where the Amazon SES API v2 finds the value of a dimension to publish to Amazon CloudWatch. If you want to use the message tags that you specify using an <code>X-SES-MESSAGE-TAGS</code> header or a parameter to the <code>SendEmail</code> or <code>SendRawEmail</code> API, choose <code>messageTag</code>. If you want to use your own email headers, choose <code>emailHeader</code>. If you want to use link tags, choose <code>linkTags</code>.
  */
type DimensionValueSource = "MESSAGE_TAG" | "EMAIL_HEADER" | "LINK_TAG"
object DimensionValueSource {
  inline val MESSAGE_TAG: "MESSAGE_TAG" = "MESSAGE_TAG"
  inline val EMAIL_HEADER: "EMAIL_HEADER" = "EMAIL_HEADER"
  inline val LINK_TAG: "LINK_TAG" = "LINK_TAG"

  inline def values: js.Array[DimensionValueSource] = js.Array(MESSAGE_TAG, EMAIL_HEADER, LINK_TAG)
}

type DkimSigningAttributesOrigin = "AWS_SES" | "EXTERNAL"
object DkimSigningAttributesOrigin {
  inline val AWS_SES: "AWS_SES" = "AWS_SES"
  inline val EXTERNAL: "EXTERNAL" = "EXTERNAL"

  inline def values: js.Array[DkimSigningAttributesOrigin] = js.Array(AWS_SES, EXTERNAL)
}

/** The DKIM authentication status of the identity. The status can be one of the following: * <code>PENDING</code> – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM records in the DNS configuration for the domain. * <code>SUCCESS</code> – The verification process completed successfully. * <code>FAILED</code> – The verification process failed. This typically occurs when Amazon SES fails to find the DKIM records in the DNS configuration of the domain. * <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon SES from determining the DKIM authentication status of the domain. * <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
  */
type DkimStatus = "PENDING" | "SUCCESS" | "FAILED" | "TEMPORARY_FAILURE" | "NOT_STARTED"
object DkimStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TEMPORARY_FAILURE: "TEMPORARY_FAILURE" = "TEMPORARY_FAILURE"
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"

  inline def values: js.Array[DkimStatus] = js.Array(PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE, NOT_STARTED)
}

/** An email sending event type. For example, email sends, opens, and bounces are all email events.
  */
type EventType = "SEND" | "REJECT" | "BOUNCE" | "COMPLAINT" | "DELIVERY" | "OPEN" | "CLICK" | "RENDERING_FAILURE" | "DELIVERY_DELAY" | "SUBSCRIPTION"
object EventType {
  inline val SEND: "SEND" = "SEND"
  inline val REJECT: "REJECT" = "REJECT"
  inline val BOUNCE: "BOUNCE" = "BOUNCE"
  inline val COMPLAINT: "COMPLAINT" = "COMPLAINT"
  inline val DELIVERY: "DELIVERY" = "DELIVERY"
  inline val OPEN: "OPEN" = "OPEN"
  inline val CLICK: "CLICK" = "CLICK"
  inline val RENDERING_FAILURE: "RENDERING_FAILURE" = "RENDERING_FAILURE"
  inline val DELIVERY_DELAY: "DELIVERY_DELAY" = "DELIVERY_DELAY"
  inline val SUBSCRIPTION: "SUBSCRIPTION" = "SUBSCRIPTION"

  inline def values: js.Array[EventType] = js.Array(SEND, REJECT, BOUNCE, COMPLAINT, DELIVERY, OPEN, CLICK, RENDERING_FAILURE, DELIVERY_DELAY, SUBSCRIPTION)
}

/** The email identity type. The identity type can be one of the following: * <code>EMAIL_ADDRESS</code> – The identity is an email address. * <code>DOMAIN</code> – The identity is a domain.
  */
type IdentityType = "EMAIL_ADDRESS" | "DOMAIN" | "MANAGED_DOMAIN"
object IdentityType {
  inline val EMAIL_ADDRESS: "EMAIL_ADDRESS" = "EMAIL_ADDRESS"
  inline val DOMAIN: "DOMAIN" = "DOMAIN"
  inline val MANAGED_DOMAIN: "MANAGED_DOMAIN" = "MANAGED_DOMAIN"

  inline def values: js.Array[IdentityType] = js.Array(EMAIL_ADDRESS, DOMAIN, MANAGED_DOMAIN)
}

/** The destination of the import job, which can be used to list import jobs that have a certain <code>ImportDestinationType</code>.
  */
type ImportDestinationType = "SUPPRESSION_LIST" | "CONTACT_LIST"
object ImportDestinationType {
  inline val SUPPRESSION_LIST: "SUPPRESSION_LIST" = "SUPPRESSION_LIST"
  inline val CONTACT_LIST: "CONTACT_LIST" = "CONTACT_LIST"

  inline def values: js.Array[ImportDestinationType] = js.Array(SUPPRESSION_LIST, CONTACT_LIST)
}

/** The status of the import job.
  */
type JobStatus = "CREATED" | "PROCESSING" | "COMPLETED" | "FAILED"
object JobStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[JobStatus] = js.Array(CREATED, PROCESSING, COMPLETED, FAILED)
}

/** The status of the MAIL FROM domain. This status can have the following values: * <code>PENDING</code> – Amazon SES hasn't started searching for the MX record yet. * <code>SUCCESS</code> – Amazon SES detected the required MX record for the MAIL FROM domain. * <code>FAILED</code> – Amazon SES can't find the required MX record, or the record no longer exists. * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon SES from determining the status of the MAIL FROM domain.
  */
type MailFromDomainStatus = "PENDING" | "SUCCESS" | "FAILED" | "TEMPORARY_FAILURE"
object MailFromDomainStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TEMPORARY_FAILURE: "TEMPORARY_FAILURE" = "TEMPORARY_FAILURE"

  inline def values: js.Array[MailFromDomainStatus] = js.Array(PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE)
}

type MailType = "MARKETING" | "TRANSACTIONAL"
object MailType {
  inline val MARKETING: "MARKETING" = "MARKETING"
  inline val TRANSACTIONAL: "TRANSACTIONAL" = "TRANSACTIONAL"

  inline def values: js.Array[MailType] = js.Array(MARKETING, TRANSACTIONAL)
}

type ReviewStatus = "PENDING" | "FAILED" | "GRANTED" | "DENIED"
object ReviewStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val GRANTED: "GRANTED" = "GRANTED"
  inline val DENIED: "DENIED" = "DENIED"

  inline def values: js.Array[ReviewStatus] = js.Array(PENDING, FAILED, GRANTED, DENIED)
}

type SubscriptionStatus = "OPT_IN" | "OPT_OUT"
object SubscriptionStatus {
  inline val OPT_IN: "OPT_IN" = "OPT_IN"
  inline val OPT_OUT: "OPT_OUT" = "OPT_OUT"

  inline def values: js.Array[SubscriptionStatus] = js.Array(OPT_IN, OPT_OUT)
}

/** The type of action that you want to perform on the address. Acceptable values: * PUT: add the addresses to the suppression list. * DELETE: remove the address from the suppression list.
  */
type SuppressionListImportAction = "DELETE" | "PUT"
object SuppressionListImportAction {
  inline val DELETE: "DELETE" = "DELETE"
  inline val PUT: "PUT" = "PUT"

  inline def values: js.Array[SuppressionListImportAction] = js.Array(DELETE, PUT)
}

/** The reason that the address was added to the suppression list for your account. The value can be one of the following: * <code>COMPLAINT</code> – Amazon SES added an email address to the suppression list for your account because a message sent to that address results in a complaint. * <code>BOUNCE</code> – Amazon SES added an email address to the suppression list for your account because a message sent to that address results in a hard bounce.
  */
type SuppressionListReason = "BOUNCE" | "COMPLAINT"
object SuppressionListReason {
  inline val BOUNCE: "BOUNCE" = "BOUNCE"
  inline val COMPLAINT: "COMPLAINT" = "COMPLAINT"

  inline def values: js.Array[SuppressionListReason] = js.Array(BOUNCE, COMPLAINT)
}

/** Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
  */
type TlsPolicy = "REQUIRE" | "OPTIONAL"
object TlsPolicy {
  inline val REQUIRE: "REQUIRE" = "REQUIRE"
  inline val OPTIONAL: "OPTIONAL" = "OPTIONAL"

  inline def values: js.Array[TlsPolicy] = js.Array(REQUIRE, OPTIONAL)
}

/** The warmup status of a dedicated IP.
  */
type WarmupStatus = "IN_PROGRESS" | "DONE"
object WarmupStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val DONE: "DONE" = "DONE"

  inline def values: js.Array[WarmupStatus] = js.Array(IN_PROGRESS, DONE)
}
