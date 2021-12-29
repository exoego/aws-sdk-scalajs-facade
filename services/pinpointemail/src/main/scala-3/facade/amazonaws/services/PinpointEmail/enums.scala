package facade.amazonaws.services.pinpointemail

import scalajs._

/** The action that you want Amazon Pinpoint to take if it can't read the required MX record for a custom MAIL FROM domain. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i> as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email. These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
  */
type BehaviorOnMxFailure = "USE_DEFAULT_VALUE" | "REJECT_MESSAGE"
object BehaviorOnMxFailure {
  val USE_DEFAULT_VALUE: "USE_DEFAULT_VALUE" = "USE_DEFAULT_VALUE"
  val REJECT_MESSAGE: "REJECT_MESSAGE" = "REJECT_MESSAGE"

  @inline def values = js.Array[BehaviorOnMxFailure](USE_DEFAULT_VALUE, REJECT_MESSAGE)
}

/** The current status of your Deliverability dashboard subscription. If this value is <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current calendar month.
  */
type DeliverabilityDashboardAccountStatus = "ACTIVE" | "PENDING_EXPIRATION" | "DISABLED"
object DeliverabilityDashboardAccountStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val PENDING_EXPIRATION: "PENDING_EXPIRATION" = "PENDING_EXPIRATION"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[DeliverabilityDashboardAccountStatus](ACTIVE, PENDING_EXPIRATION, DISABLED)
}

/** The status of a predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is <code>COMPLETE</code>, then the test is finished, and you can use the <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
  */
type DeliverabilityTestStatus = "IN_PROGRESS" | "COMPLETED"
object DeliverabilityTestStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"

  @inline def values = js.Array[DeliverabilityTestStatus](IN_PROGRESS, COMPLETED)
}

/** The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you want Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint to use your own email headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link tags, choose <code>linkTags</code>.
  */
type DimensionValueSource = "MESSAGE_TAG" | "EMAIL_HEADER" | "LINK_TAG"
object DimensionValueSource {
  val MESSAGE_TAG: "MESSAGE_TAG" = "MESSAGE_TAG"
  val EMAIL_HEADER: "EMAIL_HEADER" = "EMAIL_HEADER"
  val LINK_TAG: "LINK_TAG" = "LINK_TAG"

  @inline def values = js.Array[DimensionValueSource](MESSAGE_TAG, EMAIL_HEADER, LINK_TAG)
}

/** The DKIM authentication status of the identity. The status can be one of the following: * <code>PENDING</code> – The DKIM verification process was initiated, and Amazon Pinpoint is still waiting for the required CNAME records to appear in the DNS configuration for the domain. * <code>SUCCESS</code> – The DKIM authentication process completed successfully. * <code>FAILED</code> – The DKIM authentication process failed. This can happen when Amazon Pinpoint fails to find the required CNAME records in the DNS configuration of the domain. * <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon Pinpoint from determining the DKIM authentication status of the domain. * <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
  */
type DkimStatus = "PENDING" | "SUCCESS" | "FAILED" | "TEMPORARY_FAILURE" | "NOT_STARTED"
object DkimStatus {
  val PENDING: "PENDING" = "PENDING"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val FAILED: "FAILED" = "FAILED"
  val TEMPORARY_FAILURE: "TEMPORARY_FAILURE" = "TEMPORARY_FAILURE"
  val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"

  @inline def values = js.Array[DkimStatus](PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE, NOT_STARTED)
}

/** An email sending event type. For example, email sends, opens, and bounces are all email events.
  */
type EventType = "SEND" | "REJECT" | "BOUNCE" | "COMPLAINT" | "DELIVERY" | "OPEN" | "CLICK" | "RENDERING_FAILURE"
object EventType {
  val SEND: "SEND" = "SEND"
  val REJECT: "REJECT" = "REJECT"
  val BOUNCE: "BOUNCE" = "BOUNCE"
  val COMPLAINT: "COMPLAINT" = "COMPLAINT"
  val DELIVERY: "DELIVERY" = "DELIVERY"
  val OPEN: "OPEN" = "OPEN"
  val CLICK: "CLICK" = "CLICK"
  val RENDERING_FAILURE: "RENDERING_FAILURE" = "RENDERING_FAILURE"

  @inline def values = js.Array[EventType](SEND, REJECT, BOUNCE, COMPLAINT, DELIVERY, OPEN, CLICK, RENDERING_FAILURE)
}

/** The email identity type. The identity type can be one of the following: * <code>EMAIL_ADDRESS</code> – The identity is an email address. * <code>DOMAIN</code> – The identity is a domain.
  */
type IdentityType = "EMAIL_ADDRESS" | "DOMAIN" | "MANAGED_DOMAIN"
object IdentityType {
  val EMAIL_ADDRESS: "EMAIL_ADDRESS" = "EMAIL_ADDRESS"
  val DOMAIN: "DOMAIN" = "DOMAIN"
  val MANAGED_DOMAIN: "MANAGED_DOMAIN" = "MANAGED_DOMAIN"

  @inline def values = js.Array[IdentityType](EMAIL_ADDRESS, DOMAIN, MANAGED_DOMAIN)
}

/** The status of the MAIL FROM domain. This status can have the following values: * <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet. * <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain. * <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists. * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the status of the MAIL FROM domain.
  */
type MailFromDomainStatus = "PENDING" | "SUCCESS" | "FAILED" | "TEMPORARY_FAILURE"
object MailFromDomainStatus {
  val PENDING: "PENDING" = "PENDING"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val FAILED: "FAILED" = "FAILED"
  val TEMPORARY_FAILURE: "TEMPORARY_FAILURE" = "TEMPORARY_FAILURE"

  @inline def values = js.Array[MailFromDomainStatus](PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE)
}

/** Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
  */
type TlsPolicy = "REQUIRE" | "OPTIONAL"
object TlsPolicy {
  val REQUIRE: "REQUIRE" = "REQUIRE"
  val OPTIONAL: "OPTIONAL" = "OPTIONAL"

  @inline def values = js.Array[TlsPolicy](REQUIRE, OPTIONAL)
}

/** The warmup status of a dedicated IP.
  */
type WarmupStatus = "IN_PROGRESS" | "DONE"
object WarmupStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val DONE: "DONE" = "DONE"

  @inline def values = js.Array[WarmupStatus](IN_PROGRESS, DONE)
}
