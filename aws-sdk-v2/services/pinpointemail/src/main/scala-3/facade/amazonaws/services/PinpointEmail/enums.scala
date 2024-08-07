package facade.amazonaws.services.pinpointemail

import scalajs.js

/** The action that you want Amazon Pinpoint to take if it can't read the required MX record for a custom MAIL FROM domain. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i> as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email. These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
  */
type BehaviorOnMxFailure = "USE_DEFAULT_VALUE" | "REJECT_MESSAGE"
object BehaviorOnMxFailure {
  inline val USE_DEFAULT_VALUE: "USE_DEFAULT_VALUE" = "USE_DEFAULT_VALUE"
  inline val REJECT_MESSAGE: "REJECT_MESSAGE" = "REJECT_MESSAGE"

  inline def values: js.Array[BehaviorOnMxFailure] = js.Array(USE_DEFAULT_VALUE, REJECT_MESSAGE)
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

/** The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you want Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint to use your own email headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link tags, choose <code>linkTags</code>.
  */
type DimensionValueSource = "MESSAGE_TAG" | "EMAIL_HEADER" | "LINK_TAG"
object DimensionValueSource {
  inline val MESSAGE_TAG: "MESSAGE_TAG" = "MESSAGE_TAG"
  inline val EMAIL_HEADER: "EMAIL_HEADER" = "EMAIL_HEADER"
  inline val LINK_TAG: "LINK_TAG" = "LINK_TAG"

  inline def values: js.Array[DimensionValueSource] = js.Array(MESSAGE_TAG, EMAIL_HEADER, LINK_TAG)
}

/** The DKIM authentication status of the identity. The status can be one of the following: * <code>PENDING</code> – The DKIM verification process was initiated, and Amazon Pinpoint is still waiting for the required CNAME records to appear in the DNS configuration for the domain. * <code>SUCCESS</code> – The DKIM authentication process completed successfully. * <code>FAILED</code> – The DKIM authentication process failed. This can happen when Amazon Pinpoint fails to find the required CNAME records in the DNS configuration of the domain. * <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon Pinpoint from determining the DKIM authentication status of the domain. * <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
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
type EventType = "SEND" | "REJECT" | "BOUNCE" | "COMPLAINT" | "DELIVERY" | "OPEN" | "CLICK" | "RENDERING_FAILURE"
object EventType {
  inline val SEND: "SEND" = "SEND"
  inline val REJECT: "REJECT" = "REJECT"
  inline val BOUNCE: "BOUNCE" = "BOUNCE"
  inline val COMPLAINT: "COMPLAINT" = "COMPLAINT"
  inline val DELIVERY: "DELIVERY" = "DELIVERY"
  inline val OPEN: "OPEN" = "OPEN"
  inline val CLICK: "CLICK" = "CLICK"
  inline val RENDERING_FAILURE: "RENDERING_FAILURE" = "RENDERING_FAILURE"

  inline def values: js.Array[EventType] = js.Array(SEND, REJECT, BOUNCE, COMPLAINT, DELIVERY, OPEN, CLICK, RENDERING_FAILURE)
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

/** The status of the MAIL FROM domain. This status can have the following values: * <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet. * <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain. * <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists. * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the status of the MAIL FROM domain.
  */
type MailFromDomainStatus = "PENDING" | "SUCCESS" | "FAILED" | "TEMPORARY_FAILURE"
object MailFromDomainStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TEMPORARY_FAILURE: "TEMPORARY_FAILURE" = "TEMPORARY_FAILURE"

  inline def values: js.Array[MailFromDomainStatus] = js.Array(PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE)
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
