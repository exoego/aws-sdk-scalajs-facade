package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object ses {
  type Address = String
  type AddressList = js.Array[Address]
  type AmazonResourceName = String
  type ArrivalDate = js.Date
  type BehaviorOnMXFailure = String
  type BounceMessage = String
  type BounceSmtpReplyCode = String
  type BounceStatusCode = String
  type BounceType = String
  type BouncedRecipientInfoList = js.Array[BouncedRecipientInfo]
  type BulkEmailDestinationList = js.Array[BulkEmailDestination]
  type BulkEmailDestinationStatusList = js.Array[BulkEmailDestinationStatus]
  type BulkEmailStatus = String
  type Charset = String
  type Cidr = String
  type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]
  type ConfigurationSetAttribute = String
  type ConfigurationSetAttributeList = js.Array[ConfigurationSetAttribute]
  type ConfigurationSetName = String
  type ConfigurationSets = js.Array[ConfigurationSet]
  type Counter = Double
  type CustomMailFromStatus = String
  type CustomRedirectDomain = String
  type CustomVerificationEmailTemplates = js.Array[CustomVerificationEmailTemplate]
  type DefaultDimensionValue = String
  type DiagnosticCode = String
  type DimensionName = String
  type DimensionValueSource = String
  type DkimAttributes = js.Dictionary[IdentityDkimAttributes]
  type Domain = String
  type DsnAction = String
  type DsnStatus = String
  type Enabled = Boolean
  type Error = String
  type EventDestinationName = String
  type EventDestinations = js.Array[EventDestination]
  type EventType = String
  type EventTypes = js.Array[EventType]
  type Explanation = String
  type ExtensionFieldList = js.Array[ExtensionField]
  type ExtensionFieldName = String
  type ExtensionFieldValue = String
  type FailureRedirectionURL = String
  type FromAddress = String
  type HeaderName = String
  type HeaderValue = String
  type HtmlPart = String
  type Identity = String
  type IdentityList = js.Array[Identity]
  type IdentityType = String
  type InvocationType = String
  type LastAttemptDate = js.Date
  type LastFreshStart = js.Date
  type MailFromDomainAttributes = js.Dictionary[IdentityMailFromDomainAttributes]
  type MailFromDomainName = String
  type Max24HourSend = Double
  type MaxItems = Int
  type MaxResults = Int
  type MaxSendRate = Double
  type MessageData = String
  type MessageId = String
  type MessageTagList = js.Array[MessageTag]
  type MessageTagName = String
  type MessageTagValue = String
  type NextToken = String
  type NotificationAttributes = js.Dictionary[IdentityNotificationAttributes]
  type NotificationTopic = String
  type NotificationType = String
  type Policy = String
  type PolicyMap = js.Dictionary[Policy]
  type PolicyName = String
  type PolicyNameList = js.Array[PolicyName]
  type RawMessageData = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ReceiptActionsList = js.Array[ReceiptAction]
  type ReceiptFilterList = js.Array[ReceiptFilter]
  type ReceiptFilterName = String
  type ReceiptFilterPolicy = String
  type ReceiptRuleName = String
  type ReceiptRuleNamesList = js.Array[ReceiptRuleName]
  type ReceiptRuleSetName = String
  type ReceiptRuleSetsLists = js.Array[ReceiptRuleSetMetadata]
  type ReceiptRulesList = js.Array[ReceiptRule]
  type Recipient = String
  type RecipientsList = js.Array[Recipient]
  type RemoteMta = String
  type RenderedTemplate = String
  type ReportingMta = String
  type S3BucketName = String
  type S3KeyPrefix = String
  type SNSActionEncoding = String
  type SendDataPointList = js.Array[SendDataPoint]
  type SentLast24Hours = Double
  type StopScope = String
  type Subject = String
  type SubjectPart = String
  type SuccessRedirectionURL = String
  type TemplateContent = String
  type TemplateData = String
  type TemplateMetadataList = js.Array[TemplateMetadata]
  type TemplateName = String
  type TextPart = String
  type Timestamp = js.Date
  type TlsPolicy = String
  type VerificationAttributes = js.Dictionary[IdentityVerificationAttributes]
  type VerificationStatus = String
  type VerificationToken = String
  type VerificationTokenList = js.Array[VerificationToken]
}

package ses {
  @js.native
  @JSImport("aws-sdk", "SES")
  class SES(config: AWSConfig) extends js.Object {
    def cloneReceiptRuleSet(params: CloneReceiptRuleSetRequest): Request[CloneReceiptRuleSetResponse] = js.native
    def createConfigurationSet(params: CreateConfigurationSetRequest): Request[CreateConfigurationSetResponse] = js.native
    def createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest): Request[CreateConfigurationSetEventDestinationResponse] = js.native
    def createConfigurationSetTrackingOptions(params: CreateConfigurationSetTrackingOptionsRequest): Request[CreateConfigurationSetTrackingOptionsResponse] = js.native
    def createCustomVerificationEmailTemplate(params: CreateCustomVerificationEmailTemplateRequest): Request[js.Object] = js.native
    def createReceiptFilter(params: CreateReceiptFilterRequest): Request[CreateReceiptFilterResponse] = js.native
    def createReceiptRule(params: CreateReceiptRuleRequest): Request[CreateReceiptRuleResponse] = js.native
    def createReceiptRuleSet(params: CreateReceiptRuleSetRequest): Request[CreateReceiptRuleSetResponse] = js.native
    def createTemplate(params: CreateTemplateRequest): Request[CreateTemplateResponse] = js.native
    def deleteConfigurationSet(params: DeleteConfigurationSetRequest): Request[DeleteConfigurationSetResponse] = js.native
    def deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest): Request[DeleteConfigurationSetEventDestinationResponse] = js.native
    def deleteConfigurationSetTrackingOptions(params: DeleteConfigurationSetTrackingOptionsRequest): Request[DeleteConfigurationSetTrackingOptionsResponse] = js.native
    def deleteCustomVerificationEmailTemplate(params: DeleteCustomVerificationEmailTemplateRequest): Request[js.Object] = js.native
    def deleteIdentity(params: DeleteIdentityRequest): Request[DeleteIdentityResponse] = js.native
    def deleteIdentityPolicy(params: DeleteIdentityPolicyRequest): Request[DeleteIdentityPolicyResponse] = js.native
    def deleteReceiptFilter(params: DeleteReceiptFilterRequest): Request[DeleteReceiptFilterResponse] = js.native
    def deleteReceiptRule(params: DeleteReceiptRuleRequest): Request[DeleteReceiptRuleResponse] = js.native
    def deleteReceiptRuleSet(params: DeleteReceiptRuleSetRequest): Request[DeleteReceiptRuleSetResponse] = js.native
    def deleteTemplate(params: DeleteTemplateRequest): Request[DeleteTemplateResponse] = js.native
    def deleteVerifiedEmailAddress(params: DeleteVerifiedEmailAddressRequest): Request[js.Object] = js.native
    def describeActiveReceiptRuleSet(params: DescribeActiveReceiptRuleSetRequest): Request[DescribeActiveReceiptRuleSetResponse] = js.native
    def describeConfigurationSet(params: DescribeConfigurationSetRequest): Request[DescribeConfigurationSetResponse] = js.native
    def describeReceiptRule(params: DescribeReceiptRuleRequest): Request[DescribeReceiptRuleResponse] = js.native
    def describeReceiptRuleSet(params: DescribeReceiptRuleSetRequest): Request[DescribeReceiptRuleSetResponse] = js.native
    def getAccountSendingEnabled(): Request[GetAccountSendingEnabledResponse] = js.native
    def getCustomVerificationEmailTemplate(params: GetCustomVerificationEmailTemplateRequest): Request[GetCustomVerificationEmailTemplateResponse] = js.native
    def getIdentityDkimAttributes(params: GetIdentityDkimAttributesRequest): Request[GetIdentityDkimAttributesResponse] = js.native
    def getIdentityMailFromDomainAttributes(params: GetIdentityMailFromDomainAttributesRequest): Request[GetIdentityMailFromDomainAttributesResponse] = js.native
    def getIdentityNotificationAttributes(params: GetIdentityNotificationAttributesRequest): Request[GetIdentityNotificationAttributesResponse] = js.native
    def getIdentityPolicies(params: GetIdentityPoliciesRequest): Request[GetIdentityPoliciesResponse] = js.native
    def getIdentityVerificationAttributes(params: GetIdentityVerificationAttributesRequest): Request[GetIdentityVerificationAttributesResponse] = js.native
    def getSendQuota(): Request[GetSendQuotaResponse] = js.native
    def getSendStatistics(): Request[GetSendStatisticsResponse] = js.native
    def getTemplate(params: GetTemplateRequest): Request[GetTemplateResponse] = js.native
    def listConfigurationSets(params: ListConfigurationSetsRequest): Request[ListConfigurationSetsResponse] = js.native
    def listCustomVerificationEmailTemplates(params: ListCustomVerificationEmailTemplatesRequest): Request[ListCustomVerificationEmailTemplatesResponse] = js.native
    def listIdentities(params: ListIdentitiesRequest): Request[ListIdentitiesResponse] = js.native
    def listIdentityPolicies(params: ListIdentityPoliciesRequest): Request[ListIdentityPoliciesResponse] = js.native
    def listReceiptFilters(params: ListReceiptFiltersRequest): Request[ListReceiptFiltersResponse] = js.native
    def listReceiptRuleSets(params: ListReceiptRuleSetsRequest): Request[ListReceiptRuleSetsResponse] = js.native
    def listTemplates(params: ListTemplatesRequest): Request[ListTemplatesResponse] = js.native
    def listVerifiedEmailAddresses(): Request[ListVerifiedEmailAddressesResponse] = js.native
    def putIdentityPolicy(params: PutIdentityPolicyRequest): Request[PutIdentityPolicyResponse] = js.native
    def reorderReceiptRuleSet(params: ReorderReceiptRuleSetRequest): Request[ReorderReceiptRuleSetResponse] = js.native
    def sendBounce(params: SendBounceRequest): Request[SendBounceResponse] = js.native
    def sendBulkTemplatedEmail(params: SendBulkTemplatedEmailRequest): Request[SendBulkTemplatedEmailResponse] = js.native
    def sendCustomVerificationEmail(params: SendCustomVerificationEmailRequest): Request[SendCustomVerificationEmailResponse] = js.native
    def sendEmail(params: SendEmailRequest): Request[SendEmailResponse] = js.native
    def sendRawEmail(params: SendRawEmailRequest): Request[SendRawEmailResponse] = js.native
    def sendTemplatedEmail(params: SendTemplatedEmailRequest): Request[SendTemplatedEmailResponse] = js.native
    def setActiveReceiptRuleSet(params: SetActiveReceiptRuleSetRequest): Request[SetActiveReceiptRuleSetResponse] = js.native
    def setIdentityDkimEnabled(params: SetIdentityDkimEnabledRequest): Request[SetIdentityDkimEnabledResponse] = js.native
    def setIdentityFeedbackForwardingEnabled(params: SetIdentityFeedbackForwardingEnabledRequest): Request[SetIdentityFeedbackForwardingEnabledResponse] = js.native
    def setIdentityHeadersInNotificationsEnabled(params: SetIdentityHeadersInNotificationsEnabledRequest): Request[SetIdentityHeadersInNotificationsEnabledResponse] = js.native
    def setIdentityMailFromDomain(params: SetIdentityMailFromDomainRequest): Request[SetIdentityMailFromDomainResponse] = js.native
    def setIdentityNotificationTopic(params: SetIdentityNotificationTopicRequest): Request[SetIdentityNotificationTopicResponse] = js.native
    def setReceiptRulePosition(params: SetReceiptRulePositionRequest): Request[SetReceiptRulePositionResponse] = js.native
    def testRenderTemplate(params: TestRenderTemplateRequest): Request[TestRenderTemplateResponse] = js.native
    def updateAccountSendingEnabled(params: UpdateAccountSendingEnabledRequest): Request[js.Object] = js.native
    def updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest): Request[UpdateConfigurationSetEventDestinationResponse] = js.native
    def updateConfigurationSetReputationMetricsEnabled(params: UpdateConfigurationSetReputationMetricsEnabledRequest): Request[js.Object] = js.native
    def updateConfigurationSetSendingEnabled(params: UpdateConfigurationSetSendingEnabledRequest): Request[js.Object] = js.native
    def updateConfigurationSetTrackingOptions(params: UpdateConfigurationSetTrackingOptionsRequest): Request[UpdateConfigurationSetTrackingOptionsResponse] = js.native
    def updateCustomVerificationEmailTemplate(params: UpdateCustomVerificationEmailTemplateRequest): Request[js.Object] = js.native
    def updateReceiptRule(params: UpdateReceiptRuleRequest): Request[UpdateReceiptRuleResponse] = js.native
    def updateTemplate(params: UpdateTemplateRequest): Request[UpdateTemplateResponse] = js.native
    def verifyDomainDkim(params: VerifyDomainDkimRequest): Request[VerifyDomainDkimResponse] = js.native
    def verifyDomainIdentity(params: VerifyDomainIdentityRequest): Request[VerifyDomainIdentityResponse] = js.native
    def verifyEmailAddress(params: VerifyEmailAddressRequest): Request[js.Object] = js.native
    def verifyEmailIdentity(params: VerifyEmailIdentityRequest): Request[VerifyEmailIdentityResponse] = js.native
  }

  /**
   * <p>When included in a receipt rule, this action adds a header to the received email.</p> <p>For information about adding a header using a receipt rule, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-add-header.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait AddHeaderAction extends js.Object {
    var HeaderName: js.UndefOr[HeaderName]
    var HeaderValue: js.UndefOr[HeaderValue]
  }

  object AddHeaderAction {
    def apply(
      HeaderName: js.UndefOr[HeaderName] = js.undefined,
      HeaderValue: js.UndefOr[HeaderValue] = js.undefined): AddHeaderAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HeaderName" -> HeaderName.map { x => x.asInstanceOf[js.Any] },
        "HeaderValue" -> HeaderValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddHeaderAction]
    }
  }

  object BehaviorOnMXFailureEnum {
    val UseDefaultValue = "UseDefaultValue"
    val RejectMessage = "RejectMessage"

    val values = IndexedSeq(UseDefaultValue, RejectMessage)
  }

  /**
   * <p>Represents the body of the message. You can specify text, HTML, or both. If you use both, then the message should display correctly in the widest variety of email clients.</p>
   */
  @js.native
  trait Body extends js.Object {
    var Text: js.UndefOr[Content]
    var Html: js.UndefOr[Content]
  }

  object Body {
    def apply(
      Text: js.UndefOr[Content] = js.undefined,
      Html: js.UndefOr[Content] = js.undefined): Body = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "Html" -> Html.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Body]
    }
  }

  /**
   * <p>When included in a receipt rule, this action rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).</p> <p>For information about sending a bounce message in response to a received email, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-bounce.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait BounceAction extends js.Object {
    var SmtpReplyCode: js.UndefOr[BounceSmtpReplyCode]
    var Sender: js.UndefOr[Address]
    var StatusCode: js.UndefOr[BounceStatusCode]
    var Message: js.UndefOr[BounceMessage]
    var TopicArn: js.UndefOr[AmazonResourceName]
  }

  object BounceAction {
    def apply(
      SmtpReplyCode: js.UndefOr[BounceSmtpReplyCode] = js.undefined,
      Sender: js.UndefOr[Address] = js.undefined,
      StatusCode: js.UndefOr[BounceStatusCode] = js.undefined,
      Message: js.UndefOr[BounceMessage] = js.undefined,
      TopicArn: js.UndefOr[AmazonResourceName] = js.undefined): BounceAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SmtpReplyCode" -> SmtpReplyCode.map { x => x.asInstanceOf[js.Any] },
        "Sender" -> Sender.map { x => x.asInstanceOf[js.Any] },
        "StatusCode" -> StatusCode.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "TopicArn" -> TopicArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BounceAction]
    }
  }

  object BounceTypeEnum {
    val DoesNotExist = "DoesNotExist"
    val MessageTooLarge = "MessageTooLarge"
    val ExceededQuota = "ExceededQuota"
    val ContentRejected = "ContentRejected"
    val Undefined = "Undefined"
    val TemporaryFailure = "TemporaryFailure"

    val values = IndexedSeq(DoesNotExist, MessageTooLarge, ExceededQuota, ContentRejected, Undefined, TemporaryFailure)
  }

  /**
   * <p>Recipient-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.</p> <p>For information about receiving email through Amazon SES, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait BouncedRecipientInfo extends js.Object {
    var Recipient: js.UndefOr[Address]
    var RecipientArn: js.UndefOr[AmazonResourceName]
    var BounceType: js.UndefOr[BounceType]
    var RecipientDsnFields: js.UndefOr[RecipientDsnFields]
  }

  object BouncedRecipientInfo {
    def apply(
      Recipient: js.UndefOr[Address] = js.undefined,
      RecipientArn: js.UndefOr[AmazonResourceName] = js.undefined,
      BounceType: js.UndefOr[BounceType] = js.undefined,
      RecipientDsnFields: js.UndefOr[RecipientDsnFields] = js.undefined): BouncedRecipientInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Recipient" -> Recipient.map { x => x.asInstanceOf[js.Any] },
        "RecipientArn" -> RecipientArn.map { x => x.asInstanceOf[js.Any] },
        "BounceType" -> BounceType.map { x => x.asInstanceOf[js.Any] },
        "RecipientDsnFields" -> RecipientDsnFields.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BouncedRecipientInfo]
    }
  }

  /**
   * <p>An array that contains one or more Destinations, as well as the tags and replacement data associated with each of those Destinations.</p>
   */
  @js.native
  trait BulkEmailDestination extends js.Object {
    var Destination: js.UndefOr[Destination]
    var ReplacementTags: js.UndefOr[MessageTagList]
    var ReplacementTemplateData: js.UndefOr[TemplateData]
  }

  object BulkEmailDestination {
    def apply(
      Destination: js.UndefOr[Destination] = js.undefined,
      ReplacementTags: js.UndefOr[MessageTagList] = js.undefined,
      ReplacementTemplateData: js.UndefOr[TemplateData] = js.undefined): BulkEmailDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "ReplacementTags" -> ReplacementTags.map { x => x.asInstanceOf[js.Any] },
        "ReplacementTemplateData" -> ReplacementTemplateData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BulkEmailDestination]
    }
  }

  /**
   * <p>An object that contains the response from the <code>SendBulkTemplatedEmail</code> operation.</p>
   */
  @js.native
  trait BulkEmailDestinationStatus extends js.Object {
    var Status: js.UndefOr[BulkEmailStatus]
    var Error: js.UndefOr[Error]
    var MessageId: js.UndefOr[MessageId]
  }

  object BulkEmailDestinationStatus {
    def apply(
      Status: js.UndefOr[BulkEmailStatus] = js.undefined,
      Error: js.UndefOr[Error] = js.undefined,
      MessageId: js.UndefOr[MessageId] = js.undefined): BulkEmailDestinationStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Error" -> Error.map { x => x.asInstanceOf[js.Any] },
        "MessageId" -> MessageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BulkEmailDestinationStatus]
    }
  }

  object BulkEmailStatusEnum {
    val Success = "Success"
    val MessageRejected = "MessageRejected"
    val MailFromDomainNotVerified = "MailFromDomainNotVerified"
    val ConfigurationSetDoesNotExist = "ConfigurationSetDoesNotExist"
    val TemplateDoesNotExist = "TemplateDoesNotExist"
    val AccountSuspended = "AccountSuspended"
    val AccountThrottled = "AccountThrottled"
    val AccountDailyQuotaExceeded = "AccountDailyQuotaExceeded"
    val InvalidSendingPoolName = "InvalidSendingPoolName"
    val AccountSendingPaused = "AccountSendingPaused"
    val ConfigurationSetSendingPaused = "ConfigurationSetSendingPaused"
    val InvalidParameterValue = "InvalidParameterValue"
    val TransientFailure = "TransientFailure"
    val Failed = "Failed"

    val values = IndexedSeq(Success, MessageRejected, MailFromDomainNotVerified, ConfigurationSetDoesNotExist, TemplateDoesNotExist, AccountSuspended, AccountThrottled, AccountDailyQuotaExceeded, InvalidSendingPoolName, AccountSendingPaused, ConfigurationSetSendingPaused, InvalidParameterValue, TransientFailure, Failed)
  }

  /**
   * <p>Represents a request to create a receipt rule set by cloning an existing one. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CloneReceiptRuleSetRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
    var OriginalRuleSetName: js.UndefOr[ReceiptRuleSetName]
  }

  object CloneReceiptRuleSetRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      OriginalRuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined): CloneReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] },
        "OriginalRuleSetName" -> OriginalRuleSetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloneReceiptRuleSetRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait CloneReceiptRuleSetResponse extends js.Object {

  }

  object CloneReceiptRuleSetResponse {
    def apply(): CloneReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloneReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Contains information associated with an Amazon CloudWatch event destination to which email sending events are published.</p> <p>Event destinations, such as Amazon CloudWatch, are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CloudWatchDestination extends js.Object {
    var DimensionConfigurations: js.UndefOr[CloudWatchDimensionConfigurations]
  }

  object CloudWatchDestination {
    def apply(
      DimensionConfigurations: js.UndefOr[CloudWatchDimensionConfigurations] = js.undefined): CloudWatchDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DimensionConfigurations" -> DimensionConfigurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchDestination]
    }
  }

  /**
   * <p>Contains the dimension configuration to use when you publish email sending events to Amazon CloudWatch.</p> <p>For information about publishing email sending events to Amazon CloudWatch, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CloudWatchDimensionConfiguration extends js.Object {
    var DimensionName: js.UndefOr[DimensionName]
    var DimensionValueSource: js.UndefOr[DimensionValueSource]
    var DefaultDimensionValue: js.UndefOr[DefaultDimensionValue]
  }

  object CloudWatchDimensionConfiguration {
    def apply(
      DimensionName: js.UndefOr[DimensionName] = js.undefined,
      DimensionValueSource: js.UndefOr[DimensionValueSource] = js.undefined,
      DefaultDimensionValue: js.UndefOr[DefaultDimensionValue] = js.undefined): CloudWatchDimensionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DimensionName" -> DimensionName.map { x => x.asInstanceOf[js.Any] },
        "DimensionValueSource" -> DimensionValueSource.map { x => x.asInstanceOf[js.Any] },
        "DefaultDimensionValue" -> DefaultDimensionValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchDimensionConfiguration]
    }
  }

  /**
   * <p>The name of the configuration set.</p> <p>Configuration sets let you create groups of rules that you can apply to the emails you send using Amazon SES. For more information about using configuration sets, see <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/using-configuration-sets.html">Using Amazon SES Configuration Sets</a> in the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ConfigurationSet extends js.Object {
    var Name: js.UndefOr[ConfigurationSetName]
  }

  object ConfigurationSet {
    def apply(
      Name: js.UndefOr[ConfigurationSetName] = js.undefined): ConfigurationSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationSet]
    }
  }

  object ConfigurationSetAttributeEnum {
    val eventDestinations = "eventDestinations"
    val trackingOptions = "trackingOptions"
    val reputationOptions = "reputationOptions"

    val values = IndexedSeq(eventDestinations, trackingOptions, reputationOptions)
  }

  /**
   * <p>Represents textual data, plus an optional character set specification.</p> <p>By default, the text must be 7-bit ASCII, due to the constraints of the SMTP protocol. If the text must contain any other characters, then you must also specify a character set. Examples include UTF-8, ISO-8859-1, and Shift_JIS.</p>
   */
  @js.native
  trait Content extends js.Object {
    var Data: js.UndefOr[MessageData]
    var Charset: js.UndefOr[Charset]
  }

  object Content {
    def apply(
      Data: js.UndefOr[MessageData] = js.undefined,
      Charset: js.UndefOr[Charset] = js.undefined): Content = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.map { x => x.asInstanceOf[js.Any] },
        "Charset" -> Charset.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Content]
    }
  }

  /**
   * <p>Represents a request to create a configuration set event destination. A configuration set event destination, which can be either Amazon CloudWatch or Amazon Kinesis Firehose, describes an AWS service in which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CreateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var EventDestination: js.UndefOr[EventDestination]
  }

  object CreateConfigurationSetEventDestinationRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      EventDestination: js.UndefOr[EventDestination] = js.undefined): CreateConfigurationSetEventDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "EventDestination" -> EventDestination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetEventDestinationRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait CreateConfigurationSetEventDestinationResponse extends js.Object {

  }

  object CreateConfigurationSetEventDestinationResponse {
    def apply(): CreateConfigurationSetEventDestinationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetEventDestinationResponse]
    }
  }

  /**
   * <p>Represents a request to create a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CreateConfigurationSetRequest extends js.Object {
    var ConfigurationSet: js.UndefOr[ConfigurationSet]
  }

  object CreateConfigurationSetRequest {
    def apply(
      ConfigurationSet: js.UndefOr[ConfigurationSet] = js.undefined): CreateConfigurationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSet" -> ConfigurationSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait CreateConfigurationSetResponse extends js.Object {

  }

  object CreateConfigurationSetResponse {
    def apply(): CreateConfigurationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetResponse]
    }
  }

  /**
   * <p>Represents a request to create an open and click tracking option object in a configuration set. </p>
   */
  @js.native
  trait CreateConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var TrackingOptions: js.UndefOr[TrackingOptions]
  }

  object CreateConfigurationSetTrackingOptionsRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined): CreateConfigurationSetTrackingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "TrackingOptions" -> TrackingOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetTrackingOptionsRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait CreateConfigurationSetTrackingOptionsResponse extends js.Object {

  }

  object CreateConfigurationSetTrackingOptionsResponse {
    def apply(): CreateConfigurationSetTrackingOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetTrackingOptionsResponse]
    }
  }

  /**
   * <p>Represents a request to create a custom verification email template.</p>
   */
  @js.native
  trait CreateCustomVerificationEmailTemplateRequest extends js.Object {
    var TemplateSubject: js.UndefOr[Subject]
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL]
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL]
    var TemplateContent: js.UndefOr[TemplateContent]
    var FromEmailAddress: js.UndefOr[FromAddress]
    var TemplateName: js.UndefOr[TemplateName]
  }

  object CreateCustomVerificationEmailTemplateRequest {
    def apply(
      TemplateSubject: js.UndefOr[Subject] = js.undefined,
      SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined,
      FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined,
      TemplateContent: js.UndefOr[TemplateContent] = js.undefined,
      FromEmailAddress: js.UndefOr[FromAddress] = js.undefined,
      TemplateName: js.UndefOr[TemplateName] = js.undefined): CreateCustomVerificationEmailTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TemplateSubject" -> TemplateSubject.map { x => x.asInstanceOf[js.Any] },
        "SuccessRedirectionURL" -> SuccessRedirectionURL.map { x => x.asInstanceOf[js.Any] },
        "FailureRedirectionURL" -> FailureRedirectionURL.map { x => x.asInstanceOf[js.Any] },
        "TemplateContent" -> TemplateContent.map { x => x.asInstanceOf[js.Any] },
        "FromEmailAddress" -> FromEmailAddress.map { x => x.asInstanceOf[js.Any] },
        "TemplateName" -> TemplateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCustomVerificationEmailTemplateRequest]
    }
  }

  /**
   * <p>Represents a request to create a new IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CreateReceiptFilterRequest extends js.Object {
    var Filter: js.UndefOr[ReceiptFilter]
  }

  object CreateReceiptFilterRequest {
    def apply(
      Filter: js.UndefOr[ReceiptFilter] = js.undefined): CreateReceiptFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReceiptFilterRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait CreateReceiptFilterResponse extends js.Object {

  }

  object CreateReceiptFilterResponse {
    def apply(): CreateReceiptFilterResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReceiptFilterResponse]
    }
  }

  /**
   * <p>Represents a request to create a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CreateReceiptRuleRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
    var After: js.UndefOr[ReceiptRuleName]
    var Rule: js.UndefOr[ReceiptRule]
  }

  object CreateReceiptRuleRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      After: js.UndefOr[ReceiptRuleName] = js.undefined,
      Rule: js.UndefOr[ReceiptRule] = js.undefined): CreateReceiptRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] },
        "After" -> After.map { x => x.asInstanceOf[js.Any] },
        "Rule" -> Rule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReceiptRuleRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait CreateReceiptRuleResponse extends js.Object {

  }

  object CreateReceiptRuleResponse {
    def apply(): CreateReceiptRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReceiptRuleResponse]
    }
  }

  /**
   * <p>Represents a request to create an empty receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CreateReceiptRuleSetRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
  }

  object CreateReceiptRuleSetRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined): CreateReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReceiptRuleSetRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait CreateReceiptRuleSetResponse extends js.Object {

  }

  object CreateReceiptRuleSetResponse {
    def apply(): CreateReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Represents a request to create an email template. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CreateTemplateRequest extends js.Object {
    var Template: js.UndefOr[Template]
  }

  object CreateTemplateRequest {
    def apply(
      Template: js.UndefOr[Template] = js.undefined): CreateTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Template" -> Template.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTemplateRequest]
    }
  }

  @js.native
  trait CreateTemplateResponse extends js.Object {

  }

  object CreateTemplateResponse {
    def apply(): CreateTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTemplateResponse]
    }
  }

  object CustomMailFromStatusEnum {
    val Pending = "Pending"
    val Success = "Success"
    val Failed = "Failed"
    val TemporaryFailure = "TemporaryFailure"

    val values = IndexedSeq(Pending, Success, Failed, TemporaryFailure)
  }

  /**
   * <p>Contains information about a custom verification email template.</p>
   */
  @js.native
  trait CustomVerificationEmailTemplate extends js.Object {
    var TemplateSubject: js.UndefOr[Subject]
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL]
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL]
    var FromEmailAddress: js.UndefOr[FromAddress]
    var TemplateName: js.UndefOr[TemplateName]
  }

  object CustomVerificationEmailTemplate {
    def apply(
      TemplateSubject: js.UndefOr[Subject] = js.undefined,
      SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined,
      FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined,
      FromEmailAddress: js.UndefOr[FromAddress] = js.undefined,
      TemplateName: js.UndefOr[TemplateName] = js.undefined): CustomVerificationEmailTemplate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TemplateSubject" -> TemplateSubject.map { x => x.asInstanceOf[js.Any] },
        "SuccessRedirectionURL" -> SuccessRedirectionURL.map { x => x.asInstanceOf[js.Any] },
        "FailureRedirectionURL" -> FailureRedirectionURL.map { x => x.asInstanceOf[js.Any] },
        "FromEmailAddress" -> FromEmailAddress.map { x => x.asInstanceOf[js.Any] },
        "TemplateName" -> TemplateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomVerificationEmailTemplate]
    }
  }

  /**
   * <p>Represents a request to delete a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var EventDestinationName: js.UndefOr[EventDestinationName]
  }

  object DeleteConfigurationSetEventDestinationRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      EventDestinationName: js.UndefOr[EventDestinationName] = js.undefined): DeleteConfigurationSetEventDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "EventDestinationName" -> EventDestinationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait DeleteConfigurationSetEventDestinationResponse extends js.Object {

  }

  object DeleteConfigurationSetEventDestinationResponse {
    def apply(): DeleteConfigurationSetEventDestinationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetEventDestinationResponse]
    }
  }

  /**
   * <p>Represents a request to delete a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
  }

  object DeleteConfigurationSetRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined): DeleteConfigurationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait DeleteConfigurationSetResponse extends js.Object {

  }

  object DeleteConfigurationSetResponse {
    def apply(): DeleteConfigurationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetResponse]
    }
  }

  /**
   * <p>Represents a request to delete open and click tracking options in a configuration set. </p>
   */
  @js.native
  trait DeleteConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
  }

  object DeleteConfigurationSetTrackingOptionsRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined): DeleteConfigurationSetTrackingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetTrackingOptionsRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait DeleteConfigurationSetTrackingOptionsResponse extends js.Object {

  }

  object DeleteConfigurationSetTrackingOptionsResponse {
    def apply(): DeleteConfigurationSetTrackingOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetTrackingOptionsResponse]
    }
  }

  /**
   * <p>Represents a request to delete an existing custom verification email template.</p>
   */
  @js.native
  trait DeleteCustomVerificationEmailTemplateRequest extends js.Object {
    var TemplateName: js.UndefOr[TemplateName]
  }

  object DeleteCustomVerificationEmailTemplateRequest {
    def apply(
      TemplateName: js.UndefOr[TemplateName] = js.undefined): DeleteCustomVerificationEmailTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TemplateName" -> TemplateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCustomVerificationEmailTemplateRequest]
    }
  }

  /**
   * <p>Represents a request to delete a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteIdentityPolicyRequest extends js.Object {
    var Identity: js.UndefOr[Identity]
    var PolicyName: js.UndefOr[PolicyName]
  }

  object DeleteIdentityPolicyRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined): DeleteIdentityPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identity" -> Identity.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIdentityPolicyRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait DeleteIdentityPolicyResponse extends js.Object {

  }

  object DeleteIdentityPolicyResponse {
    def apply(): DeleteIdentityPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIdentityPolicyResponse]
    }
  }

  /**
   * <p>Represents a request to delete one of your Amazon SES identities (an email address or domain).</p>
   */
  @js.native
  trait DeleteIdentityRequest extends js.Object {
    var Identity: js.UndefOr[Identity]
  }

  object DeleteIdentityRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined): DeleteIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identity" -> Identity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIdentityRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait DeleteIdentityResponse extends js.Object {

  }

  object DeleteIdentityResponse {
    def apply(): DeleteIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIdentityResponse]
    }
  }

  /**
   * <p>Represents a request to delete an IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteReceiptFilterRequest extends js.Object {
    var FilterName: js.UndefOr[ReceiptFilterName]
  }

  object DeleteReceiptFilterRequest {
    def apply(
      FilterName: js.UndefOr[ReceiptFilterName] = js.undefined): DeleteReceiptFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FilterName" -> FilterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReceiptFilterRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait DeleteReceiptFilterResponse extends js.Object {

  }

  object DeleteReceiptFilterResponse {
    def apply(): DeleteReceiptFilterResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReceiptFilterResponse]
    }
  }

  /**
   * <p>Represents a request to delete a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteReceiptRuleRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
    var RuleName: js.UndefOr[ReceiptRuleName]
  }

  object DeleteReceiptRuleRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      RuleName: js.UndefOr[ReceiptRuleName] = js.undefined): DeleteReceiptRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] },
        "RuleName" -> RuleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReceiptRuleRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait DeleteReceiptRuleResponse extends js.Object {

  }

  object DeleteReceiptRuleResponse {
    def apply(): DeleteReceiptRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReceiptRuleResponse]
    }
  }

  /**
   * <p>Represents a request to delete a receipt rule set and all of the receipt rules it contains. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteReceiptRuleSetRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
  }

  object DeleteReceiptRuleSetRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined): DeleteReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReceiptRuleSetRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait DeleteReceiptRuleSetResponse extends js.Object {

  }

  object DeleteReceiptRuleSetResponse {
    def apply(): DeleteReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Represents a request to delete an email template. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteTemplateRequest extends js.Object {
    var TemplateName: js.UndefOr[TemplateName]
  }

  object DeleteTemplateRequest {
    def apply(
      TemplateName: js.UndefOr[TemplateName] = js.undefined): DeleteTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TemplateName" -> TemplateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTemplateRequest]
    }
  }

  @js.native
  trait DeleteTemplateResponse extends js.Object {

  }

  object DeleteTemplateResponse {
    def apply(): DeleteTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTemplateResponse]
    }
  }

  /**
   * <p>Represents a request to delete an email address from the list of email addresses you have attempted to verify under your AWS account.</p>
   */
  @js.native
  trait DeleteVerifiedEmailAddressRequest extends js.Object {
    var EmailAddress: js.UndefOr[Address]
  }

  object DeleteVerifiedEmailAddressRequest {
    def apply(
      EmailAddress: js.UndefOr[Address] = js.undefined): DeleteVerifiedEmailAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailAddress" -> EmailAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVerifiedEmailAddressRequest]
    }
  }

  /**
   * <p>Represents a request to return the metadata and receipt rules for the receipt rule set that is currently active. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DescribeActiveReceiptRuleSetRequest extends js.Object {

  }

  object DescribeActiveReceiptRuleSetRequest {
    def apply(): DescribeActiveReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActiveReceiptRuleSetRequest]
    }
  }

  /**
   * <p>Represents the metadata and receipt rules for the receipt rule set that is currently active.</p>
   */
  @js.native
  trait DescribeActiveReceiptRuleSetResponse extends js.Object {
    var Metadata: js.UndefOr[ReceiptRuleSetMetadata]
    var Rules: js.UndefOr[ReceiptRulesList]
  }

  object DescribeActiveReceiptRuleSetResponse {
    def apply(
      Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.undefined,
      Rules: js.UndefOr[ReceiptRulesList] = js.undefined): DescribeActiveReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] },
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActiveReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Represents a request to return the details of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DescribeConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var ConfigurationSetAttributeNames: js.UndefOr[ConfigurationSetAttributeList]
  }

  object DescribeConfigurationSetRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      ConfigurationSetAttributeNames: js.UndefOr[ConfigurationSetAttributeList] = js.undefined): DescribeConfigurationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationSetAttributeNames" -> ConfigurationSetAttributeNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationSetRequest]
    }
  }

  /**
   * <p>Represents the details of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DescribeConfigurationSetResponse extends js.Object {
    var ConfigurationSet: js.UndefOr[ConfigurationSet]
    var EventDestinations: js.UndefOr[EventDestinations]
    var TrackingOptions: js.UndefOr[TrackingOptions]
    var ReputationOptions: js.UndefOr[ReputationOptions]
  }

  object DescribeConfigurationSetResponse {
    def apply(
      ConfigurationSet: js.UndefOr[ConfigurationSet] = js.undefined,
      EventDestinations: js.UndefOr[EventDestinations] = js.undefined,
      TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined,
      ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined): DescribeConfigurationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSet" -> ConfigurationSet.map { x => x.asInstanceOf[js.Any] },
        "EventDestinations" -> EventDestinations.map { x => x.asInstanceOf[js.Any] },
        "TrackingOptions" -> TrackingOptions.map { x => x.asInstanceOf[js.Any] },
        "ReputationOptions" -> ReputationOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationSetResponse]
    }
  }

  /**
   * <p>Represents a request to return the details of a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DescribeReceiptRuleRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
    var RuleName: js.UndefOr[ReceiptRuleName]
  }

  object DescribeReceiptRuleRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      RuleName: js.UndefOr[ReceiptRuleName] = js.undefined): DescribeReceiptRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] },
        "RuleName" -> RuleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReceiptRuleRequest]
    }
  }

  /**
   * <p>Represents the details of a receipt rule.</p>
   */
  @js.native
  trait DescribeReceiptRuleResponse extends js.Object {
    var Rule: js.UndefOr[ReceiptRule]
  }

  object DescribeReceiptRuleResponse {
    def apply(
      Rule: js.UndefOr[ReceiptRule] = js.undefined): DescribeReceiptRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rule" -> Rule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReceiptRuleResponse]
    }
  }

  /**
   * <p>Represents a request to return the details of a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DescribeReceiptRuleSetRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
  }

  object DescribeReceiptRuleSetRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined): DescribeReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReceiptRuleSetRequest]
    }
  }

  /**
   * <p>Represents the details of the specified receipt rule set.</p>
   */
  @js.native
  trait DescribeReceiptRuleSetResponse extends js.Object {
    var Metadata: js.UndefOr[ReceiptRuleSetMetadata]
    var Rules: js.UndefOr[ReceiptRulesList]
  }

  object DescribeReceiptRuleSetResponse {
    def apply(
      Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.undefined,
      Rules: js.UndefOr[ReceiptRulesList] = js.undefined): DescribeReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] },
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Represents the destination of the message, consisting of To:, CC:, and BCC: fields.</p> <note> <p>Amazon SES does not support the SMTPUTF8 extension, as described in <a href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a destination email address (the part of the email address that precedes the @ sign) may only contain <a href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.</p> </note>
   */
  @js.native
  trait Destination extends js.Object {
    var ToAddresses: js.UndefOr[AddressList]
    var CcAddresses: js.UndefOr[AddressList]
    var BccAddresses: js.UndefOr[AddressList]
  }

  object Destination {
    def apply(
      ToAddresses: js.UndefOr[AddressList] = js.undefined,
      CcAddresses: js.UndefOr[AddressList] = js.undefined,
      BccAddresses: js.UndefOr[AddressList] = js.undefined): Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ToAddresses" -> ToAddresses.map { x => x.asInstanceOf[js.Any] },
        "CcAddresses" -> CcAddresses.map { x => x.asInstanceOf[js.Any] },
        "BccAddresses" -> BccAddresses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }

  object DimensionValueSourceEnum {
    val messageTag = "messageTag"
    val emailHeader = "emailHeader"
    val linkTag = "linkTag"

    val values = IndexedSeq(messageTag, emailHeader, linkTag)
  }

  object DsnActionEnum {
    val failed = "failed"
    val delayed = "delayed"
    val delivered = "delivered"
    val relayed = "relayed"
    val expanded = "expanded"

    val values = IndexedSeq(failed, delayed, delivered, relayed, expanded)
  }

  /**
   * <p>Contains information about the event destination that the specified email sending events will be published to.</p> <note> <p>When you create or update an event destination, you must provide one, and only one, destination. The destination can be Amazon CloudWatch, Amazon Kinesis Firehose or Amazon Simple Notification Service (Amazon SNS).</p> </note> <p>Event destinations are associated with configuration sets, which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS). For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait EventDestination extends js.Object {
    var Name: js.UndefOr[EventDestinationName]
    var SNSDestination: js.UndefOr[SNSDestination]
    var Enabled: js.UndefOr[Enabled]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var CloudWatchDestination: js.UndefOr[CloudWatchDestination]
    var MatchingEventTypes: js.UndefOr[EventTypes]
  }

  object EventDestination {
    def apply(
      Name: js.UndefOr[EventDestinationName] = js.undefined,
      SNSDestination: js.UndefOr[SNSDestination] = js.undefined,
      Enabled: js.UndefOr[Enabled] = js.undefined,
      KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
      CloudWatchDestination: js.UndefOr[CloudWatchDestination] = js.undefined,
      MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined): EventDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SNSDestination" -> SNSDestination.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseDestination" -> KinesisFirehoseDestination.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchDestination" -> CloudWatchDestination.map { x => x.asInstanceOf[js.Any] },
        "MatchingEventTypes" -> MatchingEventTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDestination]
    }
  }

  object EventTypeEnum {
    val send = "send"
    val reject = "reject"
    val bounce = "bounce"
    val complaint = "complaint"
    val delivery = "delivery"
    val open = "open"
    val click = "click"
    val renderingFailure = "renderingFailure"

    val values = IndexedSeq(send, reject, bounce, complaint, delivery, open, click, renderingFailure)
  }

  /**
   * <p>Additional X-headers to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.</p> <p>For information about receiving email through Amazon SES, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ExtensionField extends js.Object {
    var Name: js.UndefOr[ExtensionFieldName]
    var Value: js.UndefOr[ExtensionFieldValue]
  }

  object ExtensionField {
    def apply(
      Name: js.UndefOr[ExtensionFieldName] = js.undefined,
      Value: js.UndefOr[ExtensionFieldValue] = js.undefined): ExtensionField = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExtensionField]
    }
  }

  /**
   * <p>Represents a request to return the email sending status for your Amazon SES account in the current AWS Region.</p>
   */
  @js.native
  trait GetAccountSendingEnabledResponse extends js.Object {
    var Enabled: js.UndefOr[Enabled]
  }

  object GetAccountSendingEnabledResponse {
    def apply(
      Enabled: js.UndefOr[Enabled] = js.undefined): GetAccountSendingEnabledResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSendingEnabledResponse]
    }
  }

  /**
   * <p>Represents a request to retrieve an existing custom verification email template.</p>
   */
  @js.native
  trait GetCustomVerificationEmailTemplateRequest extends js.Object {
    var TemplateName: js.UndefOr[TemplateName]
  }

  object GetCustomVerificationEmailTemplateRequest {
    def apply(
      TemplateName: js.UndefOr[TemplateName] = js.undefined): GetCustomVerificationEmailTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TemplateName" -> TemplateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCustomVerificationEmailTemplateRequest]
    }
  }

  /**
   * <p>The content of the custom verification email template.</p>
   */
  @js.native
  trait GetCustomVerificationEmailTemplateResponse extends js.Object {
    var TemplateSubject: js.UndefOr[Subject]
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL]
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL]
    var TemplateContent: js.UndefOr[TemplateContent]
    var FromEmailAddress: js.UndefOr[FromAddress]
    var TemplateName: js.UndefOr[TemplateName]
  }

  object GetCustomVerificationEmailTemplateResponse {
    def apply(
      TemplateSubject: js.UndefOr[Subject] = js.undefined,
      SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined,
      FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined,
      TemplateContent: js.UndefOr[TemplateContent] = js.undefined,
      FromEmailAddress: js.UndefOr[FromAddress] = js.undefined,
      TemplateName: js.UndefOr[TemplateName] = js.undefined): GetCustomVerificationEmailTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TemplateSubject" -> TemplateSubject.map { x => x.asInstanceOf[js.Any] },
        "SuccessRedirectionURL" -> SuccessRedirectionURL.map { x => x.asInstanceOf[js.Any] },
        "FailureRedirectionURL" -> FailureRedirectionURL.map { x => x.asInstanceOf[js.Any] },
        "TemplateContent" -> TemplateContent.map { x => x.asInstanceOf[js.Any] },
        "FromEmailAddress" -> FromEmailAddress.map { x => x.asInstanceOf[js.Any] },
        "TemplateName" -> TemplateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCustomVerificationEmailTemplateResponse]
    }
  }

  /**
   * <p>Represents a request for the status of Amazon SES Easy DKIM signing for an identity. For domain identities, this request also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES successfully verified that these tokens were published. For more information about Easy DKIM, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait GetIdentityDkimAttributesRequest extends js.Object {
    var Identities: js.UndefOr[IdentityList]
  }

  object GetIdentityDkimAttributesRequest {
    def apply(
      Identities: js.UndefOr[IdentityList] = js.undefined): GetIdentityDkimAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identities" -> Identities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityDkimAttributesRequest]
    }
  }

  /**
   * <p>Represents the status of Amazon SES Easy DKIM signing for an identity. For domain identities, this response also contains the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES successfully verified that these tokens were published.</p>
   */
  @js.native
  trait GetIdentityDkimAttributesResponse extends js.Object {
    var DkimAttributes: js.UndefOr[DkimAttributes]
  }

  object GetIdentityDkimAttributesResponse {
    def apply(
      DkimAttributes: js.UndefOr[DkimAttributes] = js.undefined): GetIdentityDkimAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DkimAttributes" -> DkimAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityDkimAttributesResponse]
    }
  }

  /**
   * <p>Represents a request to return the Amazon SES custom MAIL FROM attributes for a list of identities. For information about using a custom MAIL FROM domain, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait GetIdentityMailFromDomainAttributesRequest extends js.Object {
    var Identities: js.UndefOr[IdentityList]
  }

  object GetIdentityMailFromDomainAttributesRequest {
    def apply(
      Identities: js.UndefOr[IdentityList] = js.undefined): GetIdentityMailFromDomainAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identities" -> Identities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityMailFromDomainAttributesRequest]
    }
  }

  /**
   * <p>Represents the custom MAIL FROM attributes for a list of identities.</p>
   */
  @js.native
  trait GetIdentityMailFromDomainAttributesResponse extends js.Object {
    var MailFromDomainAttributes: js.UndefOr[MailFromDomainAttributes]
  }

  object GetIdentityMailFromDomainAttributesResponse {
    def apply(
      MailFromDomainAttributes: js.UndefOr[MailFromDomainAttributes] = js.undefined): GetIdentityMailFromDomainAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MailFromDomainAttributes" -> MailFromDomainAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityMailFromDomainAttributesResponse]
    }
  }

  /**
   * <p>Represents a request to return the notification attributes for a list of identities you verified with Amazon SES. For information about Amazon SES notifications, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait GetIdentityNotificationAttributesRequest extends js.Object {
    var Identities: js.UndefOr[IdentityList]
  }

  object GetIdentityNotificationAttributesRequest {
    def apply(
      Identities: js.UndefOr[IdentityList] = js.undefined): GetIdentityNotificationAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identities" -> Identities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityNotificationAttributesRequest]
    }
  }

  /**
   * <p>Represents the notification attributes for a list of identities.</p>
   */
  @js.native
  trait GetIdentityNotificationAttributesResponse extends js.Object {
    var NotificationAttributes: js.UndefOr[NotificationAttributes]
  }

  object GetIdentityNotificationAttributesResponse {
    def apply(
      NotificationAttributes: js.UndefOr[NotificationAttributes] = js.undefined): GetIdentityNotificationAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotificationAttributes" -> NotificationAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityNotificationAttributesResponse]
    }
  }

  /**
   * <p>Represents a request to return the requested sending authorization policies for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait GetIdentityPoliciesRequest extends js.Object {
    var Identity: js.UndefOr[Identity]
    var PolicyNames: js.UndefOr[PolicyNameList]
  }

  object GetIdentityPoliciesRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      PolicyNames: js.UndefOr[PolicyNameList] = js.undefined): GetIdentityPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identity" -> Identity.map { x => x.asInstanceOf[js.Any] },
        "PolicyNames" -> PolicyNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityPoliciesRequest]
    }
  }

  /**
   * <p>Represents the requested sending authorization policies.</p>
   */
  @js.native
  trait GetIdentityPoliciesResponse extends js.Object {
    var Policies: js.UndefOr[PolicyMap]
  }

  object GetIdentityPoliciesResponse {
    def apply(
      Policies: js.UndefOr[PolicyMap] = js.undefined): GetIdentityPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policies" -> Policies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityPoliciesResponse]
    }
  }

  /**
   * <p>Represents a request to return the Amazon SES verification status of a list of identities. For domain identities, this request also returns the verification token. For information about verifying identities with Amazon SES, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait GetIdentityVerificationAttributesRequest extends js.Object {
    var Identities: js.UndefOr[IdentityList]
  }

  object GetIdentityVerificationAttributesRequest {
    def apply(
      Identities: js.UndefOr[IdentityList] = js.undefined): GetIdentityVerificationAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identities" -> Identities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityVerificationAttributesRequest]
    }
  }

  /**
   * <p>The Amazon SES verification status of a list of identities. For domain identities, this response also contains the verification token.</p>
   */
  @js.native
  trait GetIdentityVerificationAttributesResponse extends js.Object {
    var VerificationAttributes: js.UndefOr[VerificationAttributes]
  }

  object GetIdentityVerificationAttributesResponse {
    def apply(
      VerificationAttributes: js.UndefOr[VerificationAttributes] = js.undefined): GetIdentityVerificationAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VerificationAttributes" -> VerificationAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityVerificationAttributesResponse]
    }
  }

  /**
   * <p>Represents your Amazon SES daily sending quota, maximum send rate, and the number of emails you have sent in the last 24 hours.</p>
   */
  @js.native
  trait GetSendQuotaResponse extends js.Object {
    var Max24HourSend: js.UndefOr[Max24HourSend]
    var MaxSendRate: js.UndefOr[MaxSendRate]
    var SentLast24Hours: js.UndefOr[SentLast24Hours]
  }

  object GetSendQuotaResponse {
    def apply(
      Max24HourSend: js.UndefOr[Max24HourSend] = js.undefined,
      MaxSendRate: js.UndefOr[MaxSendRate] = js.undefined,
      SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined): GetSendQuotaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Max24HourSend" -> Max24HourSend.map { x => x.asInstanceOf[js.Any] },
        "MaxSendRate" -> MaxSendRate.map { x => x.asInstanceOf[js.Any] },
        "SentLast24Hours" -> SentLast24Hours.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSendQuotaResponse]
    }
  }

  /**
   * <p>Represents a list of data points. This list contains aggregated data from the previous two weeks of your sending activity with Amazon SES.</p>
   */
  @js.native
  trait GetSendStatisticsResponse extends js.Object {
    var SendDataPoints: js.UndefOr[SendDataPointList]
  }

  object GetSendStatisticsResponse {
    def apply(
      SendDataPoints: js.UndefOr[SendDataPointList] = js.undefined): GetSendStatisticsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SendDataPoints" -> SendDataPoints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSendStatisticsResponse]
    }
  }

  @js.native
  trait GetTemplateRequest extends js.Object {
    var TemplateName: js.UndefOr[TemplateName]
  }

  object GetTemplateRequest {
    def apply(
      TemplateName: js.UndefOr[TemplateName] = js.undefined): GetTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TemplateName" -> TemplateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTemplateRequest]
    }
  }

  @js.native
  trait GetTemplateResponse extends js.Object {
    var Template: js.UndefOr[Template]
  }

  object GetTemplateResponse {
    def apply(
      Template: js.UndefOr[Template] = js.undefined): GetTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Template" -> Template.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTemplateResponse]
    }
  }

  /**
   * <p>Represents the DKIM attributes of a verified email address or a domain.</p>
   */
  @js.native
  trait IdentityDkimAttributes extends js.Object {
    var DkimEnabled: js.UndefOr[Enabled]
    var DkimVerificationStatus: js.UndefOr[VerificationStatus]
    var DkimTokens: js.UndefOr[VerificationTokenList]
  }

  object IdentityDkimAttributes {
    def apply(
      DkimEnabled: js.UndefOr[Enabled] = js.undefined,
      DkimVerificationStatus: js.UndefOr[VerificationStatus] = js.undefined,
      DkimTokens: js.UndefOr[VerificationTokenList] = js.undefined): IdentityDkimAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DkimEnabled" -> DkimEnabled.map { x => x.asInstanceOf[js.Any] },
        "DkimVerificationStatus" -> DkimVerificationStatus.map { x => x.asInstanceOf[js.Any] },
        "DkimTokens" -> DkimTokens.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityDkimAttributes]
    }
  }

  /**
   * <p>Represents the custom MAIL FROM domain attributes of a verified identity (email address or domain).</p>
   */
  @js.native
  trait IdentityMailFromDomainAttributes extends js.Object {
    var MailFromDomain: js.UndefOr[MailFromDomainName]
    var MailFromDomainStatus: js.UndefOr[CustomMailFromStatus]
    var BehaviorOnMXFailure: js.UndefOr[BehaviorOnMXFailure]
  }

  object IdentityMailFromDomainAttributes {
    def apply(
      MailFromDomain: js.UndefOr[MailFromDomainName] = js.undefined,
      MailFromDomainStatus: js.UndefOr[CustomMailFromStatus] = js.undefined,
      BehaviorOnMXFailure: js.UndefOr[BehaviorOnMXFailure] = js.undefined): IdentityMailFromDomainAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MailFromDomain" -> MailFromDomain.map { x => x.asInstanceOf[js.Any] },
        "MailFromDomainStatus" -> MailFromDomainStatus.map { x => x.asInstanceOf[js.Any] },
        "BehaviorOnMXFailure" -> BehaviorOnMXFailure.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityMailFromDomainAttributes]
    }
  }

  /**
   * <p>Represents the notification attributes of an identity, including whether an identity has Amazon Simple Notification Service (Amazon SNS) topics set for bounce, complaint, and/or delivery notifications, and whether feedback forwarding is enabled for bounce and complaint notifications.</p>
   */
  @js.native
  trait IdentityNotificationAttributes extends js.Object {
    var DeliveryTopic: js.UndefOr[NotificationTopic]
    var BounceTopic: js.UndefOr[NotificationTopic]
    var HeadersInComplaintNotificationsEnabled: js.UndefOr[Enabled]
    var ForwardingEnabled: js.UndefOr[Enabled]
    var HeadersInDeliveryNotificationsEnabled: js.UndefOr[Enabled]
    var ComplaintTopic: js.UndefOr[NotificationTopic]
    var HeadersInBounceNotificationsEnabled: js.UndefOr[Enabled]
  }

  object IdentityNotificationAttributes {
    def apply(
      DeliveryTopic: js.UndefOr[NotificationTopic] = js.undefined,
      BounceTopic: js.UndefOr[NotificationTopic] = js.undefined,
      HeadersInComplaintNotificationsEnabled: js.UndefOr[Enabled] = js.undefined,
      ForwardingEnabled: js.UndefOr[Enabled] = js.undefined,
      HeadersInDeliveryNotificationsEnabled: js.UndefOr[Enabled] = js.undefined,
      ComplaintTopic: js.UndefOr[NotificationTopic] = js.undefined,
      HeadersInBounceNotificationsEnabled: js.UndefOr[Enabled] = js.undefined): IdentityNotificationAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryTopic" -> DeliveryTopic.map { x => x.asInstanceOf[js.Any] },
        "BounceTopic" -> BounceTopic.map { x => x.asInstanceOf[js.Any] },
        "HeadersInComplaintNotificationsEnabled" -> HeadersInComplaintNotificationsEnabled.map { x => x.asInstanceOf[js.Any] },
        "ForwardingEnabled" -> ForwardingEnabled.map { x => x.asInstanceOf[js.Any] },
        "HeadersInDeliveryNotificationsEnabled" -> HeadersInDeliveryNotificationsEnabled.map { x => x.asInstanceOf[js.Any] },
        "ComplaintTopic" -> ComplaintTopic.map { x => x.asInstanceOf[js.Any] },
        "HeadersInBounceNotificationsEnabled" -> HeadersInBounceNotificationsEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityNotificationAttributes]
    }
  }

  object IdentityTypeEnum {
    val EmailAddress = "EmailAddress"
    val Domain = "Domain"

    val values = IndexedSeq(EmailAddress, Domain)
  }

  /**
   * <p>Represents the verification attributes of a single identity.</p>
   */
  @js.native
  trait IdentityVerificationAttributes extends js.Object {
    var VerificationStatus: js.UndefOr[VerificationStatus]
    var VerificationToken: js.UndefOr[VerificationToken]
  }

  object IdentityVerificationAttributes {
    def apply(
      VerificationStatus: js.UndefOr[VerificationStatus] = js.undefined,
      VerificationToken: js.UndefOr[VerificationToken] = js.undefined): IdentityVerificationAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VerificationStatus" -> VerificationStatus.map { x => x.asInstanceOf[js.Any] },
        "VerificationToken" -> VerificationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityVerificationAttributes]
    }
  }

  object InvocationTypeEnum {
    val Event = "Event"
    val RequestResponse = "RequestResponse"

    val values = IndexedSeq(Event, RequestResponse)
  }

  /**
   * <p>Contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose event destination.</p> <p>Event destinations, such as Amazon Kinesis Firehose, are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait KinesisFirehoseDestination extends js.Object {
    var IAMRoleARN: js.UndefOr[AmazonResourceName]
    var DeliveryStreamARN: js.UndefOr[AmazonResourceName]
  }

  object KinesisFirehoseDestination {
    def apply(
      IAMRoleARN: js.UndefOr[AmazonResourceName] = js.undefined,
      DeliveryStreamARN: js.UndefOr[AmazonResourceName] = js.undefined): KinesisFirehoseDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IAMRoleARN" -> IAMRoleARN.map { x => x.asInstanceOf[js.Any] },
        "DeliveryStreamARN" -> DeliveryStreamARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseDestination]
    }
  }

  /**
   * <p>When included in a receipt rule, this action calls an AWS Lambda function and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).</p> <p>To enable Amazon SES to call your AWS Lambda function or to publish to an Amazon SNS topic of another account, Amazon SES must have permission to access those resources. For information about giving permissions, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES Developer Guide</a>.</p> <p>For information about using AWS Lambda actions in receipt rules, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-lambda.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait LambdaAction extends js.Object {
    var TopicArn: js.UndefOr[AmazonResourceName]
    var FunctionArn: js.UndefOr[AmazonResourceName]
    var InvocationType: js.UndefOr[InvocationType]
  }

  object LambdaAction {
    def apply(
      TopicArn: js.UndefOr[AmazonResourceName] = js.undefined,
      FunctionArn: js.UndefOr[AmazonResourceName] = js.undefined,
      InvocationType: js.UndefOr[InvocationType] = js.undefined): LambdaAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.map { x => x.asInstanceOf[js.Any] },
        "FunctionArn" -> FunctionArn.map { x => x.asInstanceOf[js.Any] },
        "InvocationType" -> InvocationType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaAction]
    }
  }

  /**
   * <p>Represents a request to list the configuration sets associated with your AWS account. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ListConfigurationSetsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxItems: js.UndefOr[MaxItems]
  }

  object ListConfigurationSetsRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxItems: js.UndefOr[MaxItems] = js.undefined): ListConfigurationSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationSetsRequest]
    }
  }

  /**
   * <p>A list of configuration sets associated with your AWS account. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ListConfigurationSetsResponse extends js.Object {
    var ConfigurationSets: js.UndefOr[ConfigurationSets]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConfigurationSetsResponse {
    def apply(
      ConfigurationSets: js.UndefOr[ConfigurationSets] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListConfigurationSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSets" -> ConfigurationSets.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationSetsResponse]
    }
  }

  /**
   * <p>Represents a request to list the existing custom verification email templates for your account.</p> <p>For more information about custom verification email templates, see <a href="ses/latest/DeveloperGuide/custom-verification-emails.html">Using Custom Verification Email Templates</a> in the <i>Amazon SES Developer Guide</i>.</p>
   */
  @js.native
  trait ListCustomVerificationEmailTemplatesRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListCustomVerificationEmailTemplatesRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListCustomVerificationEmailTemplatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCustomVerificationEmailTemplatesRequest]
    }
  }

  /**
   * <p>A paginated list of custom verification email templates.</p>
   */
  @js.native
  trait ListCustomVerificationEmailTemplatesResponse extends js.Object {
    var CustomVerificationEmailTemplates: js.UndefOr[CustomVerificationEmailTemplates]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCustomVerificationEmailTemplatesResponse {
    def apply(
      CustomVerificationEmailTemplates: js.UndefOr[CustomVerificationEmailTemplates] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCustomVerificationEmailTemplatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomVerificationEmailTemplates" -> CustomVerificationEmailTemplates.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCustomVerificationEmailTemplatesResponse]
    }
  }

  /**
   * <p>Represents a request to return a list of all identities (email addresses and domains) that you have attempted to verify under your AWS account, regardless of verification status.</p>
   */
  @js.native
  trait ListIdentitiesRequest extends js.Object {
    var IdentityType: js.UndefOr[IdentityType]
    var NextToken: js.UndefOr[NextToken]
    var MaxItems: js.UndefOr[MaxItems]
  }

  object ListIdentitiesRequest {
    def apply(
      IdentityType: js.UndefOr[IdentityType] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxItems: js.UndefOr[MaxItems] = js.undefined): ListIdentitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityType" -> IdentityType.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentitiesRequest]
    }
  }

  /**
   * <p>A list of all identities that you have attempted to verify under your AWS account, regardless of verification status.</p>
   */
  @js.native
  trait ListIdentitiesResponse extends js.Object {
    var Identities: js.UndefOr[IdentityList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIdentitiesResponse {
    def apply(
      Identities: js.UndefOr[IdentityList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListIdentitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identities" -> Identities.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentitiesResponse]
    }
  }

  /**
   * <p>Represents a request to return a list of sending authorization policies that are attached to an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ListIdentityPoliciesRequest extends js.Object {
    var Identity: js.UndefOr[Identity]
  }

  object ListIdentityPoliciesRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined): ListIdentityPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identity" -> Identity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityPoliciesRequest]
    }
  }

  /**
   * <p>A list of names of sending authorization policies that apply to an identity.</p>
   */
  @js.native
  trait ListIdentityPoliciesResponse extends js.Object {
    var PolicyNames: js.UndefOr[PolicyNameList]
  }

  object ListIdentityPoliciesResponse {
    def apply(
      PolicyNames: js.UndefOr[PolicyNameList] = js.undefined): ListIdentityPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyNames" -> PolicyNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityPoliciesResponse]
    }
  }

  /**
   * <p>Represents a request to list the IP address filters that exist under your AWS account. You use IP address filters when you receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ListReceiptFiltersRequest extends js.Object {

  }

  object ListReceiptFiltersRequest {
    def apply(): ListReceiptFiltersRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReceiptFiltersRequest]
    }
  }

  /**
   * <p>A list of IP address filters that exist under your AWS account.</p>
   */
  @js.native
  trait ListReceiptFiltersResponse extends js.Object {
    var Filters: js.UndefOr[ReceiptFilterList]
  }

  object ListReceiptFiltersResponse {
    def apply(
      Filters: js.UndefOr[ReceiptFilterList] = js.undefined): ListReceiptFiltersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReceiptFiltersResponse]
    }
  }

  /**
   * <p>Represents a request to list the receipt rule sets that exist under your AWS account. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ListReceiptRuleSetsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  object ListReceiptRuleSetsRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined): ListReceiptRuleSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReceiptRuleSetsRequest]
    }
  }

  /**
   * <p>A list of receipt rule sets that exist under your AWS account.</p>
   */
  @js.native
  trait ListReceiptRuleSetsResponse extends js.Object {
    var RuleSets: js.UndefOr[ReceiptRuleSetsLists]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListReceiptRuleSetsResponse {
    def apply(
      RuleSets: js.UndefOr[ReceiptRuleSetsLists] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListReceiptRuleSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSets" -> RuleSets.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReceiptRuleSetsResponse]
    }
  }

  @js.native
  trait ListTemplatesRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxItems: js.UndefOr[MaxItems]
  }

  object ListTemplatesRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxItems: js.UndefOr[MaxItems] = js.undefined): ListTemplatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTemplatesRequest]
    }
  }

  @js.native
  trait ListTemplatesResponse extends js.Object {
    var TemplatesMetadata: js.UndefOr[TemplateMetadataList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTemplatesResponse {
    def apply(
      TemplatesMetadata: js.UndefOr[TemplateMetadataList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTemplatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TemplatesMetadata" -> TemplatesMetadata.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTemplatesResponse]
    }
  }

  /**
   * <p>A list of email addresses that you have verified with Amazon SES under your AWS account.</p>
   */
  @js.native
  trait ListVerifiedEmailAddressesResponse extends js.Object {
    var VerifiedEmailAddresses: js.UndefOr[AddressList]
  }

  object ListVerifiedEmailAddressesResponse {
    def apply(
      VerifiedEmailAddresses: js.UndefOr[AddressList] = js.undefined): ListVerifiedEmailAddressesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VerifiedEmailAddresses" -> VerifiedEmailAddresses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVerifiedEmailAddressesResponse]
    }
  }

  /**
   * <p>Represents the message to be sent, composed of a subject and a body.</p>
   */
  @js.native
  trait Message extends js.Object {
    var Subject: js.UndefOr[Content]
    var Body: js.UndefOr[Body]
  }

  object Message {
    def apply(
      Subject: js.UndefOr[Content] = js.undefined,
      Body: js.UndefOr[Body] = js.undefined): Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subject" -> Subject.map { x => x.asInstanceOf[js.Any] },
        "Body" -> Body.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Message]
    }
  }

  /**
   * <p>Message-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.</p> <p>For information about receiving email through Amazon SES, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait MessageDsn extends js.Object {
    var ReportingMta: js.UndefOr[ReportingMta]
    var ArrivalDate: js.UndefOr[ArrivalDate]
    var ExtensionFields: js.UndefOr[ExtensionFieldList]
  }

  object MessageDsn {
    def apply(
      ReportingMta: js.UndefOr[ReportingMta] = js.undefined,
      ArrivalDate: js.UndefOr[ArrivalDate] = js.undefined,
      ExtensionFields: js.UndefOr[ExtensionFieldList] = js.undefined): MessageDsn = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReportingMta" -> ReportingMta.map { x => x.asInstanceOf[js.Any] },
        "ArrivalDate" -> ArrivalDate.map { x => x.asInstanceOf[js.Any] },
        "ExtensionFields" -> ExtensionFields.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageDsn]
    }
  }

  /**
   * <p>Contains the name and value of a tag that you can provide to <code>SendEmail</code> or <code>SendRawEmail</code> to apply to an email.</p> <p>Message tags, which you use with configuration sets, enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait MessageTag extends js.Object {
    var Name: js.UndefOr[MessageTagName]
    var Value: js.UndefOr[MessageTagValue]
  }

  object MessageTag {
    def apply(
      Name: js.UndefOr[MessageTagName] = js.undefined,
      Value: js.UndefOr[MessageTagValue] = js.undefined): MessageTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageTag]
    }
  }

  object NotificationTypeEnum {
    val Bounce = "Bounce"
    val Complaint = "Complaint"
    val Delivery = "Delivery"

    val values = IndexedSeq(Bounce, Complaint, Delivery)
  }

  /**
   * <p>Represents a request to add or update a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait PutIdentityPolicyRequest extends js.Object {
    var Identity: js.UndefOr[Identity]
    var PolicyName: js.UndefOr[PolicyName]
    var Policy: js.UndefOr[Policy]
  }

  object PutIdentityPolicyRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined,
      Policy: js.UndefOr[Policy] = js.undefined): PutIdentityPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identity" -> Identity.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutIdentityPolicyRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait PutIdentityPolicyResponse extends js.Object {

  }

  object PutIdentityPolicyResponse {
    def apply(): PutIdentityPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutIdentityPolicyResponse]
    }
  }

  /**
   * <p>Represents the raw data of the message.</p>
   */
  @js.native
  trait RawMessage extends js.Object {
    var Data: js.UndefOr[RawMessageData]
  }

  object RawMessage {
    def apply(
      Data: js.UndefOr[RawMessageData] = js.undefined): RawMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RawMessage]
    }
  }

  /**
   * <p>An action that Amazon SES can take when it receives an email on behalf of one or more email addresses or domains that you own. An instance of this data type can represent only one action.</p> <p>For information about setting up receipt rules, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ReceiptAction extends js.Object {
    var StopAction: js.UndefOr[StopAction]
    var S3Action: js.UndefOr[S3Action]
    var AddHeaderAction: js.UndefOr[AddHeaderAction]
    var WorkmailAction: js.UndefOr[WorkmailAction]
    var SNSAction: js.UndefOr[SNSAction]
    var LambdaAction: js.UndefOr[LambdaAction]
    var BounceAction: js.UndefOr[BounceAction]
  }

  object ReceiptAction {
    def apply(
      StopAction: js.UndefOr[StopAction] = js.undefined,
      S3Action: js.UndefOr[S3Action] = js.undefined,
      AddHeaderAction: js.UndefOr[AddHeaderAction] = js.undefined,
      WorkmailAction: js.UndefOr[WorkmailAction] = js.undefined,
      SNSAction: js.UndefOr[SNSAction] = js.undefined,
      LambdaAction: js.UndefOr[LambdaAction] = js.undefined,
      BounceAction: js.UndefOr[BounceAction] = js.undefined): ReceiptAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StopAction" -> StopAction.map { x => x.asInstanceOf[js.Any] },
        "S3Action" -> S3Action.map { x => x.asInstanceOf[js.Any] },
        "AddHeaderAction" -> AddHeaderAction.map { x => x.asInstanceOf[js.Any] },
        "WorkmailAction" -> WorkmailAction.map { x => x.asInstanceOf[js.Any] },
        "SNSAction" -> SNSAction.map { x => x.asInstanceOf[js.Any] },
        "LambdaAction" -> LambdaAction.map { x => x.asInstanceOf[js.Any] },
        "BounceAction" -> BounceAction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiptAction]
    }
  }

  /**
   * <p>A receipt IP address filter enables you to specify whether to accept or reject mail originating from an IP address or range of IP addresses.</p> <p>For information about setting up IP address filters, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ReceiptFilter extends js.Object {
    var Name: js.UndefOr[ReceiptFilterName]
    var IpFilter: js.UndefOr[ReceiptIpFilter]
  }

  object ReceiptFilter {
    def apply(
      Name: js.UndefOr[ReceiptFilterName] = js.undefined,
      IpFilter: js.UndefOr[ReceiptIpFilter] = js.undefined): ReceiptFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "IpFilter" -> IpFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiptFilter]
    }
  }

  object ReceiptFilterPolicyEnum {
    val Block = "Block"
    val Allow = "Allow"

    val values = IndexedSeq(Block, Allow)
  }

  /**
   * <p>A receipt IP address filter enables you to specify whether to accept or reject mail originating from an IP address or range of IP addresses.</p> <p>For information about setting up IP address filters, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ReceiptIpFilter extends js.Object {
    var Policy: js.UndefOr[ReceiptFilterPolicy]
    var Cidr: js.UndefOr[Cidr]
  }

  object ReceiptIpFilter {
    def apply(
      Policy: js.UndefOr[ReceiptFilterPolicy] = js.undefined,
      Cidr: js.UndefOr[Cidr] = js.undefined): ReceiptIpFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] },
        "Cidr" -> Cidr.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiptIpFilter]
    }
  }

  /**
   * <p>Receipt rules enable you to specify which actions Amazon SES should take when it receives mail on behalf of one or more email addresses or domains that you own.</p> <p>Each receipt rule defines a set of email addresses or domains that it applies to. If the email addresses or domains match at least one recipient address of the message, Amazon SES executes all of the receipt rule's actions on the message.</p> <p>For information about setting up receipt rules, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ReceiptRule extends js.Object {
    var Name: js.UndefOr[ReceiptRuleName]
    var Enabled: js.UndefOr[Enabled]
    var ScanEnabled: js.UndefOr[Enabled]
    var Recipients: js.UndefOr[RecipientsList]
    var TlsPolicy: js.UndefOr[TlsPolicy]
    var Actions: js.UndefOr[ReceiptActionsList]
  }

  object ReceiptRule {
    def apply(
      Name: js.UndefOr[ReceiptRuleName] = js.undefined,
      Enabled: js.UndefOr[Enabled] = js.undefined,
      ScanEnabled: js.UndefOr[Enabled] = js.undefined,
      Recipients: js.UndefOr[RecipientsList] = js.undefined,
      TlsPolicy: js.UndefOr[TlsPolicy] = js.undefined,
      Actions: js.UndefOr[ReceiptActionsList] = js.undefined): ReceiptRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "ScanEnabled" -> ScanEnabled.map { x => x.asInstanceOf[js.Any] },
        "Recipients" -> Recipients.map { x => x.asInstanceOf[js.Any] },
        "TlsPolicy" -> TlsPolicy.map { x => x.asInstanceOf[js.Any] },
        "Actions" -> Actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiptRule]
    }
  }

  /**
   * <p>Information about a receipt rule set.</p> <p>A receipt rule set is a collection of rules that specify what Amazon SES should do with mail it receives on behalf of your account's verified domains.</p> <p>For information about setting up receipt rule sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ReceiptRuleSetMetadata extends js.Object {
    var Name: js.UndefOr[ReceiptRuleSetName]
    var CreatedTimestamp: js.UndefOr[Timestamp]
  }

  object ReceiptRuleSetMetadata {
    def apply(
      Name: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined): ReceiptRuleSetMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "CreatedTimestamp" -> CreatedTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiptRuleSetMetadata]
    }
  }

  /**
   * <p>Recipient-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.</p> <p>For information about receiving email through Amazon SES, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait RecipientDsnFields extends js.Object {
    var RemoteMta: js.UndefOr[RemoteMta]
    var DiagnosticCode: js.UndefOr[DiagnosticCode]
    var FinalRecipient: js.UndefOr[Address]
    var LastAttemptDate: js.UndefOr[LastAttemptDate]
    var ExtensionFields: js.UndefOr[ExtensionFieldList]
    var Action: js.UndefOr[DsnAction]
    var Status: js.UndefOr[DsnStatus]
  }

  object RecipientDsnFields {
    def apply(
      RemoteMta: js.UndefOr[RemoteMta] = js.undefined,
      DiagnosticCode: js.UndefOr[DiagnosticCode] = js.undefined,
      FinalRecipient: js.UndefOr[Address] = js.undefined,
      LastAttemptDate: js.UndefOr[LastAttemptDate] = js.undefined,
      ExtensionFields: js.UndefOr[ExtensionFieldList] = js.undefined,
      Action: js.UndefOr[DsnAction] = js.undefined,
      Status: js.UndefOr[DsnStatus] = js.undefined): RecipientDsnFields = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RemoteMta" -> RemoteMta.map { x => x.asInstanceOf[js.Any] },
        "DiagnosticCode" -> DiagnosticCode.map { x => x.asInstanceOf[js.Any] },
        "FinalRecipient" -> FinalRecipient.map { x => x.asInstanceOf[js.Any] },
        "LastAttemptDate" -> LastAttemptDate.map { x => x.asInstanceOf[js.Any] },
        "ExtensionFields" -> ExtensionFields.map { x => x.asInstanceOf[js.Any] },
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecipientDsnFields]
    }
  }

  /**
   * <p>Represents a request to reorder the receipt rules within a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ReorderReceiptRuleSetRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
    var RuleNames: js.UndefOr[ReceiptRuleNamesList]
  }

  object ReorderReceiptRuleSetRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      RuleNames: js.UndefOr[ReceiptRuleNamesList] = js.undefined): ReorderReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] },
        "RuleNames" -> RuleNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReorderReceiptRuleSetRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait ReorderReceiptRuleSetResponse extends js.Object {

  }

  object ReorderReceiptRuleSetResponse {
    def apply(): ReorderReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReorderReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Contains information about the reputation settings for a configuration set.</p>
   */
  @js.native
  trait ReputationOptions extends js.Object {
    var SendingEnabled: js.UndefOr[Enabled]
    var ReputationMetricsEnabled: js.UndefOr[Enabled]
    var LastFreshStart: js.UndefOr[LastFreshStart]
  }

  object ReputationOptions {
    def apply(
      SendingEnabled: js.UndefOr[Enabled] = js.undefined,
      ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined,
      LastFreshStart: js.UndefOr[LastFreshStart] = js.undefined): ReputationOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SendingEnabled" -> SendingEnabled.map { x => x.asInstanceOf[js.Any] },
        "ReputationMetricsEnabled" -> ReputationMetricsEnabled.map { x => x.asInstanceOf[js.Any] },
        "LastFreshStart" -> LastFreshStart.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReputationOptions]
    }
  }

  /**
   * <p>When included in a receipt rule, this action saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).</p> <p>To enable Amazon SES to write emails to your Amazon S3 bucket, use an AWS KMS key to encrypt your emails, or publish to an Amazon SNS topic of another account, Amazon SES must have permission to access those resources. For information about giving permissions, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES Developer Guide</a>.</p> <note> <p>When you save your emails to an Amazon S3 bucket, the maximum email size (including headers) is 30 MB. Emails larger than that will bounce.</p> </note> <p>For information about specifying Amazon S3 actions in receipt rules, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-s3.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait S3Action extends js.Object {
    var TopicArn: js.UndefOr[AmazonResourceName]
    var BucketName: js.UndefOr[S3BucketName]
    var ObjectKeyPrefix: js.UndefOr[S3KeyPrefix]
    var KmsKeyArn: js.UndefOr[AmazonResourceName]
  }

  object S3Action {
    def apply(
      TopicArn: js.UndefOr[AmazonResourceName] = js.undefined,
      BucketName: js.UndefOr[S3BucketName] = js.undefined,
      ObjectKeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      KmsKeyArn: js.UndefOr[AmazonResourceName] = js.undefined): S3Action = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.map { x => x.asInstanceOf[js.Any] },
        "BucketName" -> BucketName.map { x => x.asInstanceOf[js.Any] },
        "ObjectKeyPrefix" -> ObjectKeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyArn" -> KmsKeyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Action]
    }
  }

  /**
   * <p>When included in a receipt rule, this action publishes a notification to Amazon Simple Notification Service (Amazon SNS). This action includes a complete copy of the email content in the Amazon SNS notifications. Amazon SNS notifications for all other actions simply provide information about the email. They do not include the email content itself.</p> <p>If you own the Amazon SNS topic, you don't need to do anything to give Amazon SES permission to publish emails to it. However, if you don't own the Amazon SNS topic, you need to attach a policy to the topic to give Amazon SES permissions to access it. For information about giving permissions, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES Developer Guide</a>.</p> <important> <p>You can only publish emails that are 150 KB or less (including the header) to Amazon SNS. Larger emails will bounce. If you anticipate emails larger than 150 KB, use the S3 action instead.</p> </important> <p>For information about using a receipt rule to publish an Amazon SNS notification, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-sns.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SNSAction extends js.Object {
    var TopicArn: js.UndefOr[AmazonResourceName]
    var Encoding: js.UndefOr[SNSActionEncoding]
  }

  object SNSAction {
    def apply(
      TopicArn: js.UndefOr[AmazonResourceName] = js.undefined,
      Encoding: js.UndefOr[SNSActionEncoding] = js.undefined): SNSAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.map { x => x.asInstanceOf[js.Any] },
        "Encoding" -> Encoding.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SNSAction]
    }
  }

  object SNSActionEncodingEnum {
    val `UTF-8` = "UTF-8"
    val Base64 = "Base64"

    val values = IndexedSeq(`UTF-8`, Base64)
  }

  /**
   * <p>Contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event destination.</p> <p>Event destinations, such as Amazon SNS, are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SNSDestination extends js.Object {
    var TopicARN: js.UndefOr[AmazonResourceName]
  }

  object SNSDestination {
    def apply(
      TopicARN: js.UndefOr[AmazonResourceName] = js.undefined): SNSDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicARN" -> TopicARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SNSDestination]
    }
  }

  /**
   * <p>Represents a request to send a bounce message to the sender of an email you received through Amazon SES.</p>
   */
  @js.native
  trait SendBounceRequest extends js.Object {
    var MessageDsn: js.UndefOr[MessageDsn]
    var BounceSender: js.UndefOr[Address]
    var BouncedRecipientInfoList: js.UndefOr[BouncedRecipientInfoList]
    var OriginalMessageId: js.UndefOr[MessageId]
    var BounceSenderArn: js.UndefOr[AmazonResourceName]
    var Explanation: js.UndefOr[Explanation]
  }

  object SendBounceRequest {
    def apply(
      MessageDsn: js.UndefOr[MessageDsn] = js.undefined,
      BounceSender: js.UndefOr[Address] = js.undefined,
      BouncedRecipientInfoList: js.UndefOr[BouncedRecipientInfoList] = js.undefined,
      OriginalMessageId: js.UndefOr[MessageId] = js.undefined,
      BounceSenderArn: js.UndefOr[AmazonResourceName] = js.undefined,
      Explanation: js.UndefOr[Explanation] = js.undefined): SendBounceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageDsn" -> MessageDsn.map { x => x.asInstanceOf[js.Any] },
        "BounceSender" -> BounceSender.map { x => x.asInstanceOf[js.Any] },
        "BouncedRecipientInfoList" -> BouncedRecipientInfoList.map { x => x.asInstanceOf[js.Any] },
        "OriginalMessageId" -> OriginalMessageId.map { x => x.asInstanceOf[js.Any] },
        "BounceSenderArn" -> BounceSenderArn.map { x => x.asInstanceOf[js.Any] },
        "Explanation" -> Explanation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendBounceRequest]
    }
  }

  /**
   * <p>Represents a unique message ID.</p>
   */
  @js.native
  trait SendBounceResponse extends js.Object {
    var MessageId: js.UndefOr[MessageId]
  }

  object SendBounceResponse {
    def apply(
      MessageId: js.UndefOr[MessageId] = js.undefined): SendBounceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageId" -> MessageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendBounceResponse]
    }
  }

  /**
   * <p>Represents a request to send a templated email to multiple destinations using Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SendBulkTemplatedEmailRequest extends js.Object {
    var DefaultTemplateData: js.UndefOr[TemplateData]
    var ReplyToAddresses: js.UndefOr[AddressList]
    var Destinations: js.UndefOr[BulkEmailDestinationList]
    var ReturnPathArn: js.UndefOr[AmazonResourceName]
    var Source: js.UndefOr[Address]
    var Template: js.UndefOr[TemplateName]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var TemplateArn: js.UndefOr[AmazonResourceName]
    var SourceArn: js.UndefOr[AmazonResourceName]
    var DefaultTags: js.UndefOr[MessageTagList]
    var ReturnPath: js.UndefOr[Address]
  }

  object SendBulkTemplatedEmailRequest {
    def apply(
      DefaultTemplateData: js.UndefOr[TemplateData] = js.undefined,
      ReplyToAddresses: js.UndefOr[AddressList] = js.undefined,
      Destinations: js.UndefOr[BulkEmailDestinationList] = js.undefined,
      ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined,
      Source: js.UndefOr[Address] = js.undefined,
      Template: js.UndefOr[TemplateName] = js.undefined,
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      TemplateArn: js.UndefOr[AmazonResourceName] = js.undefined,
      SourceArn: js.UndefOr[AmazonResourceName] = js.undefined,
      DefaultTags: js.UndefOr[MessageTagList] = js.undefined,
      ReturnPath: js.UndefOr[Address] = js.undefined): SendBulkTemplatedEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultTemplateData" -> DefaultTemplateData.map { x => x.asInstanceOf[js.Any] },
        "ReplyToAddresses" -> ReplyToAddresses.map { x => x.asInstanceOf[js.Any] },
        "Destinations" -> Destinations.map { x => x.asInstanceOf[js.Any] },
        "ReturnPathArn" -> ReturnPathArn.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "Template" -> Template.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "TemplateArn" -> TemplateArn.map { x => x.asInstanceOf[js.Any] },
        "SourceArn" -> SourceArn.map { x => x.asInstanceOf[js.Any] },
        "DefaultTags" -> DefaultTags.map { x => x.asInstanceOf[js.Any] },
        "ReturnPath" -> ReturnPath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendBulkTemplatedEmailRequest]
    }
  }

  @js.native
  trait SendBulkTemplatedEmailResponse extends js.Object {
    var Status: js.UndefOr[BulkEmailDestinationStatusList]
  }

  object SendBulkTemplatedEmailResponse {
    def apply(
      Status: js.UndefOr[BulkEmailDestinationStatusList] = js.undefined): SendBulkTemplatedEmailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendBulkTemplatedEmailResponse]
    }
  }

  /**
   * <p>Represents a request to send a custom verification email to a specified recipient.</p>
   */
  @js.native
  trait SendCustomVerificationEmailRequest extends js.Object {
    var EmailAddress: js.UndefOr[Address]
    var TemplateName: js.UndefOr[TemplateName]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
  }

  object SendCustomVerificationEmailRequest {
    def apply(
      EmailAddress: js.UndefOr[Address] = js.undefined,
      TemplateName: js.UndefOr[TemplateName] = js.undefined,
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined): SendCustomVerificationEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailAddress" -> EmailAddress.map { x => x.asInstanceOf[js.Any] },
        "TemplateName" -> TemplateName.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendCustomVerificationEmailRequest]
    }
  }

  /**
   * <p>The response received when attempting to send the custom verification email.</p>
   */
  @js.native
  trait SendCustomVerificationEmailResponse extends js.Object {
    var MessageId: js.UndefOr[MessageId]
  }

  object SendCustomVerificationEmailResponse {
    def apply(
      MessageId: js.UndefOr[MessageId] = js.undefined): SendCustomVerificationEmailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageId" -> MessageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendCustomVerificationEmailResponse]
    }
  }

  /**
   * <p>Represents sending statistics data. Each <code>SendDataPoint</code> contains statistics for a 15-minute period of sending activity. </p>
   */
  @js.native
  trait SendDataPoint extends js.Object {
    var Rejects: js.UndefOr[Counter]
    var Bounces: js.UndefOr[Counter]
    var Complaints: js.UndefOr[Counter]
    var Timestamp: js.UndefOr[Timestamp]
    var DeliveryAttempts: js.UndefOr[Counter]
  }

  object SendDataPoint {
    def apply(
      Rejects: js.UndefOr[Counter] = js.undefined,
      Bounces: js.UndefOr[Counter] = js.undefined,
      Complaints: js.UndefOr[Counter] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      DeliveryAttempts: js.UndefOr[Counter] = js.undefined): SendDataPoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rejects" -> Rejects.map { x => x.asInstanceOf[js.Any] },
        "Bounces" -> Bounces.map { x => x.asInstanceOf[js.Any] },
        "Complaints" -> Complaints.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "DeliveryAttempts" -> DeliveryAttempts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendDataPoint]
    }
  }

  /**
   * <p>Represents a request to send a single formatted email using Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SendEmailRequest extends js.Object {
    var ReplyToAddresses: js.UndefOr[AddressList]
    var ReturnPathArn: js.UndefOr[AmazonResourceName]
    var Source: js.UndefOr[Address]
    var Tags: js.UndefOr[MessageTagList]
    var Message: js.UndefOr[Message]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var SourceArn: js.UndefOr[AmazonResourceName]
    var Destination: js.UndefOr[Destination]
    var ReturnPath: js.UndefOr[Address]
  }

  object SendEmailRequest {
    def apply(
      ReplyToAddresses: js.UndefOr[AddressList] = js.undefined,
      ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined,
      Source: js.UndefOr[Address] = js.undefined,
      Tags: js.UndefOr[MessageTagList] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      SourceArn: js.UndefOr[AmazonResourceName] = js.undefined,
      Destination: js.UndefOr[Destination] = js.undefined,
      ReturnPath: js.UndefOr[Address] = js.undefined): SendEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplyToAddresses" -> ReplyToAddresses.map { x => x.asInstanceOf[js.Any] },
        "ReturnPathArn" -> ReturnPathArn.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "SourceArn" -> SourceArn.map { x => x.asInstanceOf[js.Any] },
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "ReturnPath" -> ReturnPath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendEmailRequest]
    }
  }

  /**
   * <p>Represents a unique message ID.</p>
   */
  @js.native
  trait SendEmailResponse extends js.Object {
    var MessageId: js.UndefOr[MessageId]
  }

  object SendEmailResponse {
    def apply(
      MessageId: js.UndefOr[MessageId] = js.undefined): SendEmailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageId" -> MessageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendEmailResponse]
    }
  }

  /**
   * <p>Represents a request to send a single raw email using Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SendRawEmailRequest extends js.Object {
    var FromArn: js.UndefOr[AmazonResourceName]
    var Destinations: js.UndefOr[AddressList]
    var ReturnPathArn: js.UndefOr[AmazonResourceName]
    var RawMessage: js.UndefOr[RawMessage]
    var Source: js.UndefOr[Address]
    var Tags: js.UndefOr[MessageTagList]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var SourceArn: js.UndefOr[AmazonResourceName]
  }

  object SendRawEmailRequest {
    def apply(
      FromArn: js.UndefOr[AmazonResourceName] = js.undefined,
      Destinations: js.UndefOr[AddressList] = js.undefined,
      ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined,
      RawMessage: js.UndefOr[RawMessage] = js.undefined,
      Source: js.UndefOr[Address] = js.undefined,
      Tags: js.UndefOr[MessageTagList] = js.undefined,
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      SourceArn: js.UndefOr[AmazonResourceName] = js.undefined): SendRawEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FromArn" -> FromArn.map { x => x.asInstanceOf[js.Any] },
        "Destinations" -> Destinations.map { x => x.asInstanceOf[js.Any] },
        "ReturnPathArn" -> ReturnPathArn.map { x => x.asInstanceOf[js.Any] },
        "RawMessage" -> RawMessage.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "SourceArn" -> SourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendRawEmailRequest]
    }
  }

  /**
   * <p>Represents a unique message ID.</p>
   */
  @js.native
  trait SendRawEmailResponse extends js.Object {
    var MessageId: js.UndefOr[MessageId]
  }

  object SendRawEmailResponse {
    def apply(
      MessageId: js.UndefOr[MessageId] = js.undefined): SendRawEmailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageId" -> MessageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendRawEmailResponse]
    }
  }

  /**
   * <p>Represents a request to send a templated email using Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SendTemplatedEmailRequest extends js.Object {
    var ReplyToAddresses: js.UndefOr[AddressList]
    var ReturnPathArn: js.UndefOr[AmazonResourceName]
    var Source: js.UndefOr[Address]
    var Tags: js.UndefOr[MessageTagList]
    var Template: js.UndefOr[TemplateName]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var TemplateArn: js.UndefOr[AmazonResourceName]
    var SourceArn: js.UndefOr[AmazonResourceName]
    var Destination: js.UndefOr[Destination]
    var TemplateData: js.UndefOr[TemplateData]
    var ReturnPath: js.UndefOr[Address]
  }

  object SendTemplatedEmailRequest {
    def apply(
      ReplyToAddresses: js.UndefOr[AddressList] = js.undefined,
      ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined,
      Source: js.UndefOr[Address] = js.undefined,
      Tags: js.UndefOr[MessageTagList] = js.undefined,
      Template: js.UndefOr[TemplateName] = js.undefined,
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      TemplateArn: js.UndefOr[AmazonResourceName] = js.undefined,
      SourceArn: js.UndefOr[AmazonResourceName] = js.undefined,
      Destination: js.UndefOr[Destination] = js.undefined,
      TemplateData: js.UndefOr[TemplateData] = js.undefined,
      ReturnPath: js.UndefOr[Address] = js.undefined): SendTemplatedEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplyToAddresses" -> ReplyToAddresses.map { x => x.asInstanceOf[js.Any] },
        "ReturnPathArn" -> ReturnPathArn.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "Template" -> Template.map { x => x.asInstanceOf[js.Any] },
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "TemplateArn" -> TemplateArn.map { x => x.asInstanceOf[js.Any] },
        "SourceArn" -> SourceArn.map { x => x.asInstanceOf[js.Any] },
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "TemplateData" -> TemplateData.map { x => x.asInstanceOf[js.Any] },
        "ReturnPath" -> ReturnPath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTemplatedEmailRequest]
    }
  }

  @js.native
  trait SendTemplatedEmailResponse extends js.Object {
    var MessageId: js.UndefOr[MessageId]
  }

  object SendTemplatedEmailResponse {
    def apply(
      MessageId: js.UndefOr[MessageId] = js.undefined): SendTemplatedEmailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageId" -> MessageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTemplatedEmailResponse]
    }
  }

  /**
   * <p>Represents a request to set a receipt rule set as the active receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetActiveReceiptRuleSetRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
  }

  object SetActiveReceiptRuleSetRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined): SetActiveReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetActiveReceiptRuleSetRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait SetActiveReceiptRuleSetResponse extends js.Object {

  }

  object SetActiveReceiptRuleSetResponse {
    def apply(): SetActiveReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetActiveReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Represents a request to enable or disable Amazon SES Easy DKIM signing for an identity. For more information about setting up Easy DKIM, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetIdentityDkimEnabledRequest extends js.Object {
    var Identity: js.UndefOr[Identity]
    var DkimEnabled: js.UndefOr[Enabled]
  }

  object SetIdentityDkimEnabledRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      DkimEnabled: js.UndefOr[Enabled] = js.undefined): SetIdentityDkimEnabledRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identity" -> Identity.map { x => x.asInstanceOf[js.Any] },
        "DkimEnabled" -> DkimEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityDkimEnabledRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait SetIdentityDkimEnabledResponse extends js.Object {

  }

  object SetIdentityDkimEnabledResponse {
    def apply(): SetIdentityDkimEnabledResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityDkimEnabledResponse]
    }
  }

  /**
   * <p>Represents a request to enable or disable whether Amazon SES forwards you bounce and complaint notifications through email. For information about email feedback forwarding, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-email.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetIdentityFeedbackForwardingEnabledRequest extends js.Object {
    var Identity: js.UndefOr[Identity]
    var ForwardingEnabled: js.UndefOr[Enabled]
  }

  object SetIdentityFeedbackForwardingEnabledRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      ForwardingEnabled: js.UndefOr[Enabled] = js.undefined): SetIdentityFeedbackForwardingEnabledRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identity" -> Identity.map { x => x.asInstanceOf[js.Any] },
        "ForwardingEnabled" -> ForwardingEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityFeedbackForwardingEnabledRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait SetIdentityFeedbackForwardingEnabledResponse extends js.Object {

  }

  object SetIdentityFeedbackForwardingEnabledResponse {
    def apply(): SetIdentityFeedbackForwardingEnabledResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityFeedbackForwardingEnabledResponse]
    }
  }

  /**
   * <p>Represents a request to set whether Amazon SES includes the original email headers in the Amazon SNS notifications of a specified type. For information about notifications, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetIdentityHeadersInNotificationsEnabledRequest extends js.Object {
    var Identity: js.UndefOr[Identity]
    var NotificationType: js.UndefOr[NotificationType]
    var Enabled: js.UndefOr[Enabled]
  }

  object SetIdentityHeadersInNotificationsEnabledRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      NotificationType: js.UndefOr[NotificationType] = js.undefined,
      Enabled: js.UndefOr[Enabled] = js.undefined): SetIdentityHeadersInNotificationsEnabledRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identity" -> Identity.map { x => x.asInstanceOf[js.Any] },
        "NotificationType" -> NotificationType.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityHeadersInNotificationsEnabledRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait SetIdentityHeadersInNotificationsEnabledResponse extends js.Object {

  }

  object SetIdentityHeadersInNotificationsEnabledResponse {
    def apply(): SetIdentityHeadersInNotificationsEnabledResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityHeadersInNotificationsEnabledResponse]
    }
  }

  /**
   * <p>Represents a request to enable or disable the Amazon SES custom MAIL FROM domain setup for a verified identity. For information about using a custom MAIL FROM domain, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetIdentityMailFromDomainRequest extends js.Object {
    var Identity: js.UndefOr[Identity]
    var MailFromDomain: js.UndefOr[MailFromDomainName]
    var BehaviorOnMXFailure: js.UndefOr[BehaviorOnMXFailure]
  }

  object SetIdentityMailFromDomainRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      MailFromDomain: js.UndefOr[MailFromDomainName] = js.undefined,
      BehaviorOnMXFailure: js.UndefOr[BehaviorOnMXFailure] = js.undefined): SetIdentityMailFromDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identity" -> Identity.map { x => x.asInstanceOf[js.Any] },
        "MailFromDomain" -> MailFromDomain.map { x => x.asInstanceOf[js.Any] },
        "BehaviorOnMXFailure" -> BehaviorOnMXFailure.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityMailFromDomainRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait SetIdentityMailFromDomainResponse extends js.Object {

  }

  object SetIdentityMailFromDomainResponse {
    def apply(): SetIdentityMailFromDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityMailFromDomainResponse]
    }
  }

  /**
   * <p>Represents a request to specify the Amazon SNS topic to which Amazon SES will publish bounce, complaint, or delivery notifications for emails sent with that identity as the Source. For information about Amazon SES notifications, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetIdentityNotificationTopicRequest extends js.Object {
    var Identity: js.UndefOr[Identity]
    var NotificationType: js.UndefOr[NotificationType]
    var SnsTopic: js.UndefOr[NotificationTopic]
  }

  object SetIdentityNotificationTopicRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      NotificationType: js.UndefOr[NotificationType] = js.undefined,
      SnsTopic: js.UndefOr[NotificationTopic] = js.undefined): SetIdentityNotificationTopicRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identity" -> Identity.map { x => x.asInstanceOf[js.Any] },
        "NotificationType" -> NotificationType.map { x => x.asInstanceOf[js.Any] },
        "SnsTopic" -> SnsTopic.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityNotificationTopicRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait SetIdentityNotificationTopicResponse extends js.Object {

  }

  object SetIdentityNotificationTopicResponse {
    def apply(): SetIdentityNotificationTopicResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityNotificationTopicResponse]
    }
  }

  /**
   * <p>Represents a request to set the position of a receipt rule in a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetReceiptRulePositionRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
    var RuleName: js.UndefOr[ReceiptRuleName]
    var After: js.UndefOr[ReceiptRuleName]
  }

  object SetReceiptRulePositionRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      RuleName: js.UndefOr[ReceiptRuleName] = js.undefined,
      After: js.UndefOr[ReceiptRuleName] = js.undefined): SetReceiptRulePositionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] },
        "RuleName" -> RuleName.map { x => x.asInstanceOf[js.Any] },
        "After" -> After.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetReceiptRulePositionRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait SetReceiptRulePositionResponse extends js.Object {

  }

  object SetReceiptRulePositionResponse {
    def apply(): SetReceiptRulePositionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetReceiptRulePositionResponse]
    }
  }

  /**
   * <p>When included in a receipt rule, this action terminates the evaluation of the receipt rule set and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).</p> <p>For information about setting a stop action in a receipt rule, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-stop.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait StopAction extends js.Object {
    var Scope: js.UndefOr[StopScope]
    var TopicArn: js.UndefOr[AmazonResourceName]
  }

  object StopAction {
    def apply(
      Scope: js.UndefOr[StopScope] = js.undefined,
      TopicArn: js.UndefOr[AmazonResourceName] = js.undefined): StopAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] },
        "TopicArn" -> TopicArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopAction]
    }
  }

  object StopScopeEnum {
    val RuleSet = "RuleSet"

    val values = IndexedSeq(RuleSet)
  }

  /**
   * <p>The content of the email, composed of a subject line, an HTML part, and a text-only part.</p>
   */
  @js.native
  trait Template extends js.Object {
    var TemplateName: js.UndefOr[TemplateName]
    var SubjectPart: js.UndefOr[SubjectPart]
    var TextPart: js.UndefOr[TextPart]
    var HtmlPart: js.UndefOr[HtmlPart]
  }

  object Template {
    def apply(
      TemplateName: js.UndefOr[TemplateName] = js.undefined,
      SubjectPart: js.UndefOr[SubjectPart] = js.undefined,
      TextPart: js.UndefOr[TextPart] = js.undefined,
      HtmlPart: js.UndefOr[HtmlPart] = js.undefined): Template = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TemplateName" -> TemplateName.map { x => x.asInstanceOf[js.Any] },
        "SubjectPart" -> SubjectPart.map { x => x.asInstanceOf[js.Any] },
        "TextPart" -> TextPart.map { x => x.asInstanceOf[js.Any] },
        "HtmlPart" -> HtmlPart.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Template]
    }
  }

  /**
   * <p>Contains information about an email template.</p>
   */
  @js.native
  trait TemplateMetadata extends js.Object {
    var Name: js.UndefOr[TemplateName]
    var CreatedTimestamp: js.UndefOr[Timestamp]
  }

  object TemplateMetadata {
    def apply(
      Name: js.UndefOr[TemplateName] = js.undefined,
      CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined): TemplateMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "CreatedTimestamp" -> CreatedTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TemplateMetadata]
    }
  }

  @js.native
  trait TestRenderTemplateRequest extends js.Object {
    var TemplateName: js.UndefOr[TemplateName]
    var TemplateData: js.UndefOr[TemplateData]
  }

  object TestRenderTemplateRequest {
    def apply(
      TemplateName: js.UndefOr[TemplateName] = js.undefined,
      TemplateData: js.UndefOr[TemplateData] = js.undefined): TestRenderTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TemplateName" -> TemplateName.map { x => x.asInstanceOf[js.Any] },
        "TemplateData" -> TemplateData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestRenderTemplateRequest]
    }
  }

  @js.native
  trait TestRenderTemplateResponse extends js.Object {
    var RenderedTemplate: js.UndefOr[RenderedTemplate]
  }

  object TestRenderTemplateResponse {
    def apply(
      RenderedTemplate: js.UndefOr[RenderedTemplate] = js.undefined): TestRenderTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RenderedTemplate" -> RenderedTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestRenderTemplateResponse]
    }
  }

  object TlsPolicyEnum {
    val Require = "Require"
    val Optional = "Optional"

    val values = IndexedSeq(Require, Optional)
  }

  /**
   * <p>A domain that is used to redirect email recipients to an Amazon SES-operated domain. This domain captures open and click events generated by Amazon SES emails.</p> <p>For more information, see <a href="ses/latest/DeveloperGuide/configure-custom-open-click-domains.html">Configuring Custom Domains to Handle Open and Click Tracking</a> in the <i>Amazon SES Developer Guide</i>.</p>
   */
  @js.native
  trait TrackingOptions extends js.Object {
    var CustomRedirectDomain: js.UndefOr[CustomRedirectDomain]
  }

  object TrackingOptions {
    def apply(
      CustomRedirectDomain: js.UndefOr[CustomRedirectDomain] = js.undefined): TrackingOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomRedirectDomain" -> CustomRedirectDomain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrackingOptions]
    }
  }

  /**
   * <p>Represents a request to enable or disable the email sending capabilities for your entire Amazon SES account.</p>
   */
  @js.native
  trait UpdateAccountSendingEnabledRequest extends js.Object {
    var Enabled: js.UndefOr[Enabled]
  }

  object UpdateAccountSendingEnabledRequest {
    def apply(
      Enabled: js.UndefOr[Enabled] = js.undefined): UpdateAccountSendingEnabledRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountSendingEnabledRequest]
    }
  }

  /**
   * <p>Represents a request to update the event destination of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var EventDestination: js.UndefOr[EventDestination]
  }

  object UpdateConfigurationSetEventDestinationRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      EventDestination: js.UndefOr[EventDestination] = js.undefined): UpdateConfigurationSetEventDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "EventDestination" -> EventDestination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait UpdateConfigurationSetEventDestinationResponse extends js.Object {

  }

  object UpdateConfigurationSetEventDestinationResponse {
    def apply(): UpdateConfigurationSetEventDestinationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConfigurationSetEventDestinationResponse]
    }
  }

  /**
   * <p>Represents a request to modify the reputation metric publishing settings for a configuration set.</p>
   */
  @js.native
  trait UpdateConfigurationSetReputationMetricsEnabledRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var Enabled: js.UndefOr[Enabled]
  }

  object UpdateConfigurationSetReputationMetricsEnabledRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      Enabled: js.UndefOr[Enabled] = js.undefined): UpdateConfigurationSetReputationMetricsEnabledRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConfigurationSetReputationMetricsEnabledRequest]
    }
  }

  /**
   * <p>Represents a request to enable or disable the email sending capabilities for a specific configuration set.</p>
   */
  @js.native
  trait UpdateConfigurationSetSendingEnabledRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var Enabled: js.UndefOr[Enabled]
  }

  object UpdateConfigurationSetSendingEnabledRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      Enabled: js.UndefOr[Enabled] = js.undefined): UpdateConfigurationSetSendingEnabledRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConfigurationSetSendingEnabledRequest]
    }
  }

  /**
   * <p>Represents a request to update the tracking options for a configuration set. </p>
   */
  @js.native
  trait UpdateConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var TrackingOptions: js.UndefOr[TrackingOptions]
  }

  object UpdateConfigurationSetTrackingOptionsRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined): UpdateConfigurationSetTrackingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "TrackingOptions" -> TrackingOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConfigurationSetTrackingOptionsRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait UpdateConfigurationSetTrackingOptionsResponse extends js.Object {

  }

  object UpdateConfigurationSetTrackingOptionsResponse {
    def apply(): UpdateConfigurationSetTrackingOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConfigurationSetTrackingOptionsResponse]
    }
  }

  /**
   * <p>Represents a request to update an existing custom verification email template.</p>
   */
  @js.native
  trait UpdateCustomVerificationEmailTemplateRequest extends js.Object {
    var TemplateSubject: js.UndefOr[Subject]
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL]
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL]
    var TemplateContent: js.UndefOr[TemplateContent]
    var FromEmailAddress: js.UndefOr[FromAddress]
    var TemplateName: js.UndefOr[TemplateName]
  }

  object UpdateCustomVerificationEmailTemplateRequest {
    def apply(
      TemplateSubject: js.UndefOr[Subject] = js.undefined,
      SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined,
      FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined,
      TemplateContent: js.UndefOr[TemplateContent] = js.undefined,
      FromEmailAddress: js.UndefOr[FromAddress] = js.undefined,
      TemplateName: js.UndefOr[TemplateName] = js.undefined): UpdateCustomVerificationEmailTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TemplateSubject" -> TemplateSubject.map { x => x.asInstanceOf[js.Any] },
        "SuccessRedirectionURL" -> SuccessRedirectionURL.map { x => x.asInstanceOf[js.Any] },
        "FailureRedirectionURL" -> FailureRedirectionURL.map { x => x.asInstanceOf[js.Any] },
        "TemplateContent" -> TemplateContent.map { x => x.asInstanceOf[js.Any] },
        "FromEmailAddress" -> FromEmailAddress.map { x => x.asInstanceOf[js.Any] },
        "TemplateName" -> TemplateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCustomVerificationEmailTemplateRequest]
    }
  }

  /**
   * <p>Represents a request to update a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait UpdateReceiptRuleRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
    var Rule: js.UndefOr[ReceiptRule]
  }

  object UpdateReceiptRuleRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      Rule: js.UndefOr[ReceiptRule] = js.undefined): UpdateReceiptRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetName" -> RuleSetName.map { x => x.asInstanceOf[js.Any] },
        "Rule" -> Rule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateReceiptRuleRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait UpdateReceiptRuleResponse extends js.Object {

  }

  object UpdateReceiptRuleResponse {
    def apply(): UpdateReceiptRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateReceiptRuleResponse]
    }
  }

  @js.native
  trait UpdateTemplateRequest extends js.Object {
    var Template: js.UndefOr[Template]
  }

  object UpdateTemplateRequest {
    def apply(
      Template: js.UndefOr[Template] = js.undefined): UpdateTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Template" -> Template.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTemplateRequest]
    }
  }

  @js.native
  trait UpdateTemplateResponse extends js.Object {

  }

  object UpdateTemplateResponse {
    def apply(): UpdateTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTemplateResponse]
    }
  }

  object VerificationStatusEnum {
    val Pending = "Pending"
    val Success = "Success"
    val Failed = "Failed"
    val TemporaryFailure = "TemporaryFailure"
    val NotStarted = "NotStarted"

    val values = IndexedSeq(Pending, Success, Failed, TemporaryFailure, NotStarted)
  }

  /**
   * <p>Represents a request to generate the CNAME records needed to set up Easy DKIM with Amazon SES. For more information about setting up Easy DKIM, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait VerifyDomainDkimRequest extends js.Object {
    var Domain: js.UndefOr[Domain]
  }

  object VerifyDomainDkimRequest {
    def apply(
      Domain: js.UndefOr[Domain] = js.undefined): VerifyDomainDkimRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyDomainDkimRequest]
    }
  }

  /**
   * <p>Returns CNAME records that you must publish to the DNS server of your domain to set up Easy DKIM with Amazon SES.</p>
   */
  @js.native
  trait VerifyDomainDkimResponse extends js.Object {
    var DkimTokens: js.UndefOr[VerificationTokenList]
  }

  object VerifyDomainDkimResponse {
    def apply(
      DkimTokens: js.UndefOr[VerificationTokenList] = js.undefined): VerifyDomainDkimResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DkimTokens" -> DkimTokens.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyDomainDkimResponse]
    }
  }

  /**
   * <p>Represents a request to begin Amazon SES domain verification and to generate the TXT records that you must publish to the DNS server of your domain to complete the verification. For information about domain verification, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait VerifyDomainIdentityRequest extends js.Object {
    var Domain: js.UndefOr[Domain]
  }

  object VerifyDomainIdentityRequest {
    def apply(
      Domain: js.UndefOr[Domain] = js.undefined): VerifyDomainIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain" -> Domain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyDomainIdentityRequest]
    }
  }

  /**
   * <p>Returns a TXT record that you must publish to the DNS server of your domain to complete domain verification with Amazon SES.</p>
   */
  @js.native
  trait VerifyDomainIdentityResponse extends js.Object {
    var VerificationToken: js.UndefOr[VerificationToken]
  }

  object VerifyDomainIdentityResponse {
    def apply(
      VerificationToken: js.UndefOr[VerificationToken] = js.undefined): VerifyDomainIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VerificationToken" -> VerificationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyDomainIdentityResponse]
    }
  }

  /**
   * <p>Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait VerifyEmailAddressRequest extends js.Object {
    var EmailAddress: js.UndefOr[Address]
  }

  object VerifyEmailAddressRequest {
    def apply(
      EmailAddress: js.UndefOr[Address] = js.undefined): VerifyEmailAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailAddress" -> EmailAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyEmailAddressRequest]
    }
  }

  /**
   * <p>Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait VerifyEmailIdentityRequest extends js.Object {
    var EmailAddress: js.UndefOr[Address]
  }

  object VerifyEmailIdentityRequest {
    def apply(
      EmailAddress: js.UndefOr[Address] = js.undefined): VerifyEmailIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailAddress" -> EmailAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyEmailIdentityRequest]
    }
  }

  /**
   * <p>An empty element returned on a successful request.</p>
   */
  @js.native
  trait VerifyEmailIdentityResponse extends js.Object {

  }

  object VerifyEmailIdentityResponse {
    def apply(): VerifyEmailIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyEmailIdentityResponse]
    }
  }

  /**
   * <p>When included in a receipt rule, this action calls Amazon WorkMail and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS). You will typically not use this action directly because Amazon WorkMail adds the rule automatically during its setup procedure.</p> <p>For information using a receipt rule to call Amazon WorkMail, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-workmail.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait WorkmailAction extends js.Object {
    var TopicArn: js.UndefOr[AmazonResourceName]
    var OrganizationArn: js.UndefOr[AmazonResourceName]
  }

  object WorkmailAction {
    def apply(
      TopicArn: js.UndefOr[AmazonResourceName] = js.undefined,
      OrganizationArn: js.UndefOr[AmazonResourceName] = js.undefined): WorkmailAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.map { x => x.asInstanceOf[js.Any] },
        "OrganizationArn" -> OrganizationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkmailAction]
    }
  }
}
