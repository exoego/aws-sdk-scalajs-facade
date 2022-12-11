package facade.amazonaws.services.sesv2

import scalajs.js

/** The action to take if the required MX record can't be found when you send an email. When you set this value to <code>UseDefaultValue</code>, the mail is sent using <i>amazonses.com</i> as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>, the Amazon SES API v2 returns a <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email. These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
  */
@js.native
sealed trait BehaviorOnMxFailure extends js.Any
object BehaviorOnMxFailure {
  val USE_DEFAULT_VALUE = "USE_DEFAULT_VALUE".asInstanceOf[BehaviorOnMxFailure]
  val REJECT_MESSAGE = "REJECT_MESSAGE".asInstanceOf[BehaviorOnMxFailure]

  @inline def values: js.Array[BehaviorOnMxFailure] = js.Array(USE_DEFAULT_VALUE, REJECT_MESSAGE)
}

@js.native
sealed trait BulkEmailStatus extends js.Any
object BulkEmailStatus {
  val SUCCESS = "SUCCESS".asInstanceOf[BulkEmailStatus]
  val MESSAGE_REJECTED = "MESSAGE_REJECTED".asInstanceOf[BulkEmailStatus]
  val MAIL_FROM_DOMAIN_NOT_VERIFIED = "MAIL_FROM_DOMAIN_NOT_VERIFIED".asInstanceOf[BulkEmailStatus]
  val CONFIGURATION_SET_NOT_FOUND = "CONFIGURATION_SET_NOT_FOUND".asInstanceOf[BulkEmailStatus]
  val TEMPLATE_NOT_FOUND = "TEMPLATE_NOT_FOUND".asInstanceOf[BulkEmailStatus]
  val ACCOUNT_SUSPENDED = "ACCOUNT_SUSPENDED".asInstanceOf[BulkEmailStatus]
  val ACCOUNT_THROTTLED = "ACCOUNT_THROTTLED".asInstanceOf[BulkEmailStatus]
  val ACCOUNT_DAILY_QUOTA_EXCEEDED = "ACCOUNT_DAILY_QUOTA_EXCEEDED".asInstanceOf[BulkEmailStatus]
  val INVALID_SENDING_POOL_NAME = "INVALID_SENDING_POOL_NAME".asInstanceOf[BulkEmailStatus]
  val ACCOUNT_SENDING_PAUSED = "ACCOUNT_SENDING_PAUSED".asInstanceOf[BulkEmailStatus]
  val CONFIGURATION_SET_SENDING_PAUSED = "CONFIGURATION_SET_SENDING_PAUSED".asInstanceOf[BulkEmailStatus]
  val INVALID_PARAMETER = "INVALID_PARAMETER".asInstanceOf[BulkEmailStatus]
  val TRANSIENT_FAILURE = "TRANSIENT_FAILURE".asInstanceOf[BulkEmailStatus]
  val FAILED = "FAILED".asInstanceOf[BulkEmailStatus]

  @inline def values: js.Array[BulkEmailStatus] = js.Array(
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

@js.native
sealed trait ContactLanguage extends js.Any
object ContactLanguage {
  val EN = "EN".asInstanceOf[ContactLanguage]
  val JA = "JA".asInstanceOf[ContactLanguage]

  @inline def values: js.Array[ContactLanguage] = js.Array(EN, JA)
}

@js.native
sealed trait ContactListImportAction extends js.Any
object ContactListImportAction {
  val DELETE = "DELETE".asInstanceOf[ContactListImportAction]
  val PUT = "PUT".asInstanceOf[ContactListImportAction]

  @inline def values: js.Array[ContactListImportAction] = js.Array(DELETE, PUT)
}

/** The data format of the import job's data source.
  */
@js.native
sealed trait DataFormat extends js.Any
object DataFormat {
  val CSV = "CSV".asInstanceOf[DataFormat]
  val JSON = "JSON".asInstanceOf[DataFormat]

  @inline def values: js.Array[DataFormat] = js.Array(CSV, JSON)
}

/** The current status of your Deliverability dashboard subscription. If this value is <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current calendar month.
  */
@js.native
sealed trait DeliverabilityDashboardAccountStatus extends js.Any
object DeliverabilityDashboardAccountStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[DeliverabilityDashboardAccountStatus]
  val PENDING_EXPIRATION = "PENDING_EXPIRATION".asInstanceOf[DeliverabilityDashboardAccountStatus]
  val DISABLED = "DISABLED".asInstanceOf[DeliverabilityDashboardAccountStatus]

  @inline def values: js.Array[DeliverabilityDashboardAccountStatus] = js.Array(ACTIVE, PENDING_EXPIRATION, DISABLED)
}

/** The status of a predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is <code>COMPLETE</code>, then the test is finished, and you can use the <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
  */
@js.native
sealed trait DeliverabilityTestStatus extends js.Any
object DeliverabilityTestStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DeliverabilityTestStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[DeliverabilityTestStatus]

  @inline def values: js.Array[DeliverabilityTestStatus] = js.Array(IN_PROGRESS, COMPLETED)
}

/** The location where the Amazon SES API v2 finds the value of a dimension to publish to Amazon CloudWatch. To use the message tags that you specify using an <code>X-SES-MESSAGE-TAGS</code> header or a parameter to the <code>SendEmail</code> or <code>SendRawEmail</code> API, choose <code>messageTag</code>. To use your own email headers, choose <code>emailHeader</code>. To use link tags, choose <code>linkTags</code>.
  */
@js.native
sealed trait DimensionValueSource extends js.Any
object DimensionValueSource {
  val MESSAGE_TAG = "MESSAGE_TAG".asInstanceOf[DimensionValueSource]
  val EMAIL_HEADER = "EMAIL_HEADER".asInstanceOf[DimensionValueSource]
  val LINK_TAG = "LINK_TAG".asInstanceOf[DimensionValueSource]

  @inline def values: js.Array[DimensionValueSource] = js.Array(MESSAGE_TAG, EMAIL_HEADER, LINK_TAG)
}

@js.native
sealed trait DkimSigningAttributesOrigin extends js.Any
object DkimSigningAttributesOrigin {
  val AWS_SES = "AWS_SES".asInstanceOf[DkimSigningAttributesOrigin]
  val EXTERNAL = "EXTERNAL".asInstanceOf[DkimSigningAttributesOrigin]

  @inline def values: js.Array[DkimSigningAttributesOrigin] = js.Array(AWS_SES, EXTERNAL)
}

@js.native
sealed trait DkimSigningKeyLength extends js.Any
object DkimSigningKeyLength {
  val RSA_1024_BIT = "RSA_1024_BIT".asInstanceOf[DkimSigningKeyLength]
  val RSA_2048_BIT = "RSA_2048_BIT".asInstanceOf[DkimSigningKeyLength]

  @inline def values: js.Array[DkimSigningKeyLength] = js.Array(RSA_1024_BIT, RSA_2048_BIT)
}

/** The DKIM authentication status of the identity. The status can be one of the following: * <code>PENDING</code> – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM records in the DNS configuration for the domain. * <code>SUCCESS</code> – The verification process completed successfully. * <code>FAILED</code> – The verification process failed. This typically occurs when Amazon SES fails to find the DKIM records in the DNS configuration of the domain. * <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon SES from determining the DKIM authentication status of the domain. * <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
  */
@js.native
sealed trait DkimStatus extends js.Any
object DkimStatus {
  val PENDING = "PENDING".asInstanceOf[DkimStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[DkimStatus]
  val FAILED = "FAILED".asInstanceOf[DkimStatus]
  val TEMPORARY_FAILURE = "TEMPORARY_FAILURE".asInstanceOf[DkimStatus]
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[DkimStatus]

  @inline def values: js.Array[DkimStatus] = js.Array(PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE, NOT_STARTED)
}

/** An email sending event type. For example, email sends, opens, and bounces are all email events.
  */
@js.native
sealed trait EventType extends js.Any
object EventType {
  val SEND = "SEND".asInstanceOf[EventType]
  val REJECT = "REJECT".asInstanceOf[EventType]
  val BOUNCE = "BOUNCE".asInstanceOf[EventType]
  val COMPLAINT = "COMPLAINT".asInstanceOf[EventType]
  val DELIVERY = "DELIVERY".asInstanceOf[EventType]
  val OPEN = "OPEN".asInstanceOf[EventType]
  val CLICK = "CLICK".asInstanceOf[EventType]
  val RENDERING_FAILURE = "RENDERING_FAILURE".asInstanceOf[EventType]
  val DELIVERY_DELAY = "DELIVERY_DELAY".asInstanceOf[EventType]
  val SUBSCRIPTION = "SUBSCRIPTION".asInstanceOf[EventType]

  @inline def values: js.Array[EventType] = js.Array(SEND, REJECT, BOUNCE, COMPLAINT, DELIVERY, OPEN, CLICK, RENDERING_FAILURE, DELIVERY_DELAY, SUBSCRIPTION)
}

@js.native
sealed trait FeatureStatus extends js.Any
object FeatureStatus {
  val ENABLED = "ENABLED".asInstanceOf[FeatureStatus]
  val DISABLED = "DISABLED".asInstanceOf[FeatureStatus]

  @inline def values: js.Array[FeatureStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait IdentityType extends js.Any
object IdentityType {
  val EMAIL_ADDRESS = "EMAIL_ADDRESS".asInstanceOf[IdentityType]
  val DOMAIN = "DOMAIN".asInstanceOf[IdentityType]
  val MANAGED_DOMAIN = "MANAGED_DOMAIN".asInstanceOf[IdentityType]

  @inline def values: js.Array[IdentityType] = js.Array(EMAIL_ADDRESS, DOMAIN, MANAGED_DOMAIN)
}

/** The destination of the import job, which can be used to list import jobs that have a certain <code>ImportDestinationType</code>.
  */
@js.native
sealed trait ImportDestinationType extends js.Any
object ImportDestinationType {
  val SUPPRESSION_LIST = "SUPPRESSION_LIST".asInstanceOf[ImportDestinationType]
  val CONTACT_LIST = "CONTACT_LIST".asInstanceOf[ImportDestinationType]

  @inline def values: js.Array[ImportDestinationType] = js.Array(SUPPRESSION_LIST, CONTACT_LIST)
}

/** The status of the import job.
  */
@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val CREATED = "CREATED".asInstanceOf[JobStatus]
  val PROCESSING = "PROCESSING".asInstanceOf[JobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(CREATED, PROCESSING, COMPLETED, FAILED)
}

/** The <code>ListRecommendations</code> filter type. This can be one of the following: * <code>TYPE</code> – The recommendation type, with values like <code>DKIM</code>, <code>SPF</code> or <code>DMARC</code>. * <code>IMPACT</code> – The recommendation impact, with values like <code>HIGH</code> or <code>LOW</code>. * <code>STATUS</code> – The recommendation status, with values like <code>OPEN</code> or <code>FIXED</code>. * <code>RESOURCE_ARN</code> – The resource affected by the recommendation, with values like <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
  */
@js.native
sealed trait ListRecommendationsFilterKey extends js.Any
object ListRecommendationsFilterKey {
  val TYPE = "TYPE".asInstanceOf[ListRecommendationsFilterKey]
  val IMPACT = "IMPACT".asInstanceOf[ListRecommendationsFilterKey]
  val STATUS = "STATUS".asInstanceOf[ListRecommendationsFilterKey]
  val RESOURCE_ARN = "RESOURCE_ARN".asInstanceOf[ListRecommendationsFilterKey]

  @inline def values: js.Array[ListRecommendationsFilterKey] = js.Array(TYPE, IMPACT, STATUS, RESOURCE_ARN)
}

/** The status of the MAIL FROM domain. This status can have the following values: * <code>PENDING</code> – Amazon SES hasn't started searching for the MX record yet. * <code>SUCCESS</code> – Amazon SES detected the required MX record for the MAIL FROM domain. * <code>FAILED</code> – Amazon SES can't find the required MX record, or the record no longer exists. * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon SES from determining the status of the MAIL FROM domain.
  */
@js.native
sealed trait MailFromDomainStatus extends js.Any
object MailFromDomainStatus {
  val PENDING = "PENDING".asInstanceOf[MailFromDomainStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[MailFromDomainStatus]
  val FAILED = "FAILED".asInstanceOf[MailFromDomainStatus]
  val TEMPORARY_FAILURE = "TEMPORARY_FAILURE".asInstanceOf[MailFromDomainStatus]

  @inline def values: js.Array[MailFromDomainStatus] = js.Array(PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE)
}

@js.native
sealed trait MailType extends js.Any
object MailType {
  val MARKETING = "MARKETING".asInstanceOf[MailType]
  val TRANSACTIONAL = "TRANSACTIONAL".asInstanceOf[MailType]

  @inline def values: js.Array[MailType] = js.Array(MARKETING, TRANSACTIONAL)
}

@js.native
sealed trait Metric extends js.Any
object Metric {
  val SEND = "SEND".asInstanceOf[Metric]
  val COMPLAINT = "COMPLAINT".asInstanceOf[Metric]
  val PERMANENT_BOUNCE = "PERMANENT_BOUNCE".asInstanceOf[Metric]
  val TRANSIENT_BOUNCE = "TRANSIENT_BOUNCE".asInstanceOf[Metric]
  val OPEN = "OPEN".asInstanceOf[Metric]
  val CLICK = "CLICK".asInstanceOf[Metric]
  val DELIVERY = "DELIVERY".asInstanceOf[Metric]
  val DELIVERY_OPEN = "DELIVERY_OPEN".asInstanceOf[Metric]
  val DELIVERY_CLICK = "DELIVERY_CLICK".asInstanceOf[Metric]
  val DELIVERY_COMPLAINT = "DELIVERY_COMPLAINT".asInstanceOf[Metric]

  @inline def values: js.Array[Metric] = js.Array(SEND, COMPLAINT, PERMANENT_BOUNCE, TRANSIENT_BOUNCE, OPEN, CLICK, DELIVERY, DELIVERY_OPEN, DELIVERY_CLICK, DELIVERY_COMPLAINT)
}

/** The <code>BatchGetMetricDataQuery</code> dimension name. This can be one of the following: * <code>EMAIL_IDENTITY</code> – The email identity used when sending messages. * <code>CONFIGURATION_SET</code> – The configuration set used when sending messages (if one was used). * <code>ISP</code> – The recipient ISP (e.g. <code>Gmail</code>, <code>Yahoo</code>, etc.).
  */
@js.native
sealed trait MetricDimensionName extends js.Any
object MetricDimensionName {
  val EMAIL_IDENTITY = "EMAIL_IDENTITY".asInstanceOf[MetricDimensionName]
  val CONFIGURATION_SET = "CONFIGURATION_SET".asInstanceOf[MetricDimensionName]
  val ISP = "ISP".asInstanceOf[MetricDimensionName]

  @inline def values: js.Array[MetricDimensionName] = js.Array(EMAIL_IDENTITY, CONFIGURATION_SET, ISP)
}

@js.native
sealed trait MetricNamespace extends js.Any
object MetricNamespace {
  val VDM = "VDM".asInstanceOf[MetricNamespace]

  @inline def values: js.Array[MetricNamespace] = js.Array(VDM)
}

@js.native
sealed trait QueryErrorCode extends js.Any
object QueryErrorCode {
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[QueryErrorCode]
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[QueryErrorCode]

  @inline def values: js.Array[QueryErrorCode] = js.Array(INTERNAL_FAILURE, ACCESS_DENIED)
}

@js.native
sealed trait RecommendationImpact extends js.Any
object RecommendationImpact {
  val LOW = "LOW".asInstanceOf[RecommendationImpact]
  val HIGH = "HIGH".asInstanceOf[RecommendationImpact]

  @inline def values: js.Array[RecommendationImpact] = js.Array(LOW, HIGH)
}

@js.native
sealed trait RecommendationStatus extends js.Any
object RecommendationStatus {
  val OPEN = "OPEN".asInstanceOf[RecommendationStatus]
  val FIXED = "FIXED".asInstanceOf[RecommendationStatus]

  @inline def values: js.Array[RecommendationStatus] = js.Array(OPEN, FIXED)
}

@js.native
sealed trait RecommendationType extends js.Any
object RecommendationType {
  val DKIM = "DKIM".asInstanceOf[RecommendationType]
  val DMARC = "DMARC".asInstanceOf[RecommendationType]
  val SPF = "SPF".asInstanceOf[RecommendationType]

  @inline def values: js.Array[RecommendationType] = js.Array(DKIM, DMARC, SPF)
}

@js.native
sealed trait ReviewStatus extends js.Any
object ReviewStatus {
  val PENDING = "PENDING".asInstanceOf[ReviewStatus]
  val FAILED = "FAILED".asInstanceOf[ReviewStatus]
  val GRANTED = "GRANTED".asInstanceOf[ReviewStatus]
  val DENIED = "DENIED".asInstanceOf[ReviewStatus]

  @inline def values: js.Array[ReviewStatus] = js.Array(PENDING, FAILED, GRANTED, DENIED)
}

@js.native
sealed trait ScalingMode extends js.Any
object ScalingMode {
  val STANDARD = "STANDARD".asInstanceOf[ScalingMode]
  val MANAGED = "MANAGED".asInstanceOf[ScalingMode]

  @inline def values: js.Array[ScalingMode] = js.Array(STANDARD, MANAGED)
}

@js.native
sealed trait SubscriptionStatus extends js.Any
object SubscriptionStatus {
  val OPT_IN = "OPT_IN".asInstanceOf[SubscriptionStatus]
  val OPT_OUT = "OPT_OUT".asInstanceOf[SubscriptionStatus]

  @inline def values: js.Array[SubscriptionStatus] = js.Array(OPT_IN, OPT_OUT)
}

/** The type of action to perform on the address. The following are possible values: * PUT: add the addresses to the suppression list. * DELETE: remove the address from the suppression list.
  */
@js.native
sealed trait SuppressionListImportAction extends js.Any
object SuppressionListImportAction {
  val DELETE = "DELETE".asInstanceOf[SuppressionListImportAction]
  val PUT = "PUT".asInstanceOf[SuppressionListImportAction]

  @inline def values: js.Array[SuppressionListImportAction] = js.Array(DELETE, PUT)
}

/** The reason that the address was added to the suppression list for your account. The value can be one of the following: * <code>COMPLAINT</code> – Amazon SES added an email address to the suppression list for your account because a message sent to that address results in a complaint. * <code>BOUNCE</code> – Amazon SES added an email address to the suppression list for your account because a message sent to that address results in a hard bounce.
  */
@js.native
sealed trait SuppressionListReason extends js.Any
object SuppressionListReason {
  val BOUNCE = "BOUNCE".asInstanceOf[SuppressionListReason]
  val COMPLAINT = "COMPLAINT".asInstanceOf[SuppressionListReason]

  @inline def values: js.Array[SuppressionListReason] = js.Array(BOUNCE, COMPLAINT)
}

/** Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
  */
@js.native
sealed trait TlsPolicy extends js.Any
object TlsPolicy {
  val REQUIRE = "REQUIRE".asInstanceOf[TlsPolicy]
  val OPTIONAL = "OPTIONAL".asInstanceOf[TlsPolicy]

  @inline def values: js.Array[TlsPolicy] = js.Array(REQUIRE, OPTIONAL)
}

@js.native
sealed trait VerificationStatus extends js.Any
object VerificationStatus {
  val PENDING = "PENDING".asInstanceOf[VerificationStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[VerificationStatus]
  val FAILED = "FAILED".asInstanceOf[VerificationStatus]
  val TEMPORARY_FAILURE = "TEMPORARY_FAILURE".asInstanceOf[VerificationStatus]
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[VerificationStatus]

  @inline def values: js.Array[VerificationStatus] = js.Array(PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE, NOT_STARTED)
}

/** The warmup status of a dedicated IP.
  */
@js.native
sealed trait WarmupStatus extends js.Any
object WarmupStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[WarmupStatus]
  val DONE = "DONE".asInstanceOf[WarmupStatus]

  @inline def values: js.Array[WarmupStatus] = js.Array(IN_PROGRESS, DONE)
}
