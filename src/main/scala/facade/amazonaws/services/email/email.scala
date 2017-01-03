package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object email {
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
  type Charset = String
  type Cidr = String
  type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]
  type ConfigurationSetAttribute = String
  type ConfigurationSetAttributeList = js.Array[ConfigurationSetAttribute]
  type ConfigurationSetName = String
  type ConfigurationSets = js.Array[ConfigurationSet]
  type Counter = Long
  type CustomMailFromStatus = String
  type DefaultDimensionValue = String
  type DiagnosticCode = String
  type DimensionName = String
  type DimensionValueSource = String
  type DkimAttributes = js.Dictionary[IdentityDkimAttributes]
  type Domain = String
  type DsnAction = String
  type DsnStatus = String
  type Enabled = Boolean
  type EventDestinationName = String
  type EventDestinations = js.Array[EventDestination]
  type EventType = String
  type EventTypes = js.Array[EventType]
  type Explanation = String
  type ExtensionFieldList = js.Array[ExtensionField]
  type ExtensionFieldName = String
  type ExtensionFieldValue = String
  type HeaderName = String
  type HeaderValue = String
  type Identity = String
  type IdentityList = js.Array[Identity]
  type IdentityType = String
  type InvocationType = String
  type LastAttemptDate = js.Date
  type MailFromDomainAttributes = js.Dictionary[IdentityMailFromDomainAttributes]
  type MailFromDomainName = String
  type Max24HourSend = Double
  type MaxItems = Integer
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
  type RawMessageData = js.Array[Byte]
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
  type ReportingMta = String
  type RuleOrRuleSetName = String
  type S3BucketName = String
  type S3KeyPrefix = String
  type SNSActionEncoding = String
  type SendDataPointList = js.Array[SendDataPoint]
  type SentLast24Hours = Double
  type StopScope = String
  type Timestamp = js.Date
  type TlsPolicy = String
  type VerificationAttributes = js.Dictionary[IdentityVerificationAttributes]
  type VerificationStatus = String
  type VerificationToken = String
  type VerificationTokenList = js.Array[VerificationToken]
}

package email {
  @js.native
  trait Email extends js.Object {
    def cloneReceiptRuleSet(params: CloneReceiptRuleSetRequest, callback: Callback[CloneReceiptRuleSetResponse]): Unit = js.native
    def cloneReceiptRuleSet(params: CloneReceiptRuleSetRequest): Request[CloneReceiptRuleSetResponse] = js.native
    def createConfigurationSet(params: CreateConfigurationSetRequest, callback: Callback[CreateConfigurationSetResponse]): Unit = js.native
    def createConfigurationSet(params: CreateConfigurationSetRequest): Request[CreateConfigurationSetResponse] = js.native
    def createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest, callback: Callback[CreateConfigurationSetEventDestinationResponse]): Unit = js.native
    def createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest): Request[CreateConfigurationSetEventDestinationResponse] = js.native
    def createReceiptFilter(params: CreateReceiptFilterRequest, callback: Callback[CreateReceiptFilterResponse]): Unit = js.native
    def createReceiptFilter(params: CreateReceiptFilterRequest): Request[CreateReceiptFilterResponse] = js.native
    def createReceiptRule(params: CreateReceiptRuleRequest, callback: Callback[CreateReceiptRuleResponse]): Unit = js.native
    def createReceiptRule(params: CreateReceiptRuleRequest): Request[CreateReceiptRuleResponse] = js.native
    def createReceiptRuleSet(params: CreateReceiptRuleSetRequest, callback: Callback[CreateReceiptRuleSetResponse]): Unit = js.native
    def createReceiptRuleSet(params: CreateReceiptRuleSetRequest): Request[CreateReceiptRuleSetResponse] = js.native
    def deleteConfigurationSet(params: DeleteConfigurationSetRequest, callback: Callback[DeleteConfigurationSetResponse]): Unit = js.native
    def deleteConfigurationSet(params: DeleteConfigurationSetRequest): Request[DeleteConfigurationSetResponse] = js.native
    def deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest, callback: Callback[DeleteConfigurationSetEventDestinationResponse]): Unit = js.native
    def deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest): Request[DeleteConfigurationSetEventDestinationResponse] = js.native
    def deleteIdentity(params: DeleteIdentityRequest, callback: Callback[DeleteIdentityResponse]): Unit = js.native
    def deleteIdentity(params: DeleteIdentityRequest): Request[DeleteIdentityResponse] = js.native
    def deleteIdentityPolicy(params: DeleteIdentityPolicyRequest, callback: Callback[DeleteIdentityPolicyResponse]): Unit = js.native
    def deleteIdentityPolicy(params: DeleteIdentityPolicyRequest): Request[DeleteIdentityPolicyResponse] = js.native
    def deleteReceiptFilter(params: DeleteReceiptFilterRequest, callback: Callback[DeleteReceiptFilterResponse]): Unit = js.native
    def deleteReceiptFilter(params: DeleteReceiptFilterRequest): Request[DeleteReceiptFilterResponse] = js.native
    def deleteReceiptRule(params: DeleteReceiptRuleRequest, callback: Callback[DeleteReceiptRuleResponse]): Unit = js.native
    def deleteReceiptRule(params: DeleteReceiptRuleRequest): Request[DeleteReceiptRuleResponse] = js.native
    def deleteReceiptRuleSet(params: DeleteReceiptRuleSetRequest, callback: Callback[DeleteReceiptRuleSetResponse]): Unit = js.native
    def deleteReceiptRuleSet(params: DeleteReceiptRuleSetRequest): Request[DeleteReceiptRuleSetResponse] = js.native
    def deleteVerifiedEmailAddress(params: DeleteVerifiedEmailAddressRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteVerifiedEmailAddress(params: DeleteVerifiedEmailAddressRequest): Request[js.Object] = js.native
    def describeActiveReceiptRuleSet(params: DescribeActiveReceiptRuleSetRequest, callback: Callback[DescribeActiveReceiptRuleSetResponse]): Unit = js.native
    def describeActiveReceiptRuleSet(params: DescribeActiveReceiptRuleSetRequest): Request[DescribeActiveReceiptRuleSetResponse] = js.native
    def describeConfigurationSet(params: DescribeConfigurationSetRequest, callback: Callback[DescribeConfigurationSetResponse]): Unit = js.native
    def describeConfigurationSet(params: DescribeConfigurationSetRequest): Request[DescribeConfigurationSetResponse] = js.native
    def describeReceiptRule(params: DescribeReceiptRuleRequest, callback: Callback[DescribeReceiptRuleResponse]): Unit = js.native
    def describeReceiptRule(params: DescribeReceiptRuleRequest): Request[DescribeReceiptRuleResponse] = js.native
    def describeReceiptRuleSet(params: DescribeReceiptRuleSetRequest, callback: Callback[DescribeReceiptRuleSetResponse]): Unit = js.native
    def describeReceiptRuleSet(params: DescribeReceiptRuleSetRequest): Request[DescribeReceiptRuleSetResponse] = js.native
    def getIdentityDkimAttributes(params: GetIdentityDkimAttributesRequest, callback: Callback[GetIdentityDkimAttributesResponse]): Unit = js.native
    def getIdentityDkimAttributes(params: GetIdentityDkimAttributesRequest): Request[GetIdentityDkimAttributesResponse] = js.native
    def getIdentityMailFromDomainAttributes(params: GetIdentityMailFromDomainAttributesRequest, callback: Callback[GetIdentityMailFromDomainAttributesResponse]): Unit = js.native
    def getIdentityMailFromDomainAttributes(params: GetIdentityMailFromDomainAttributesRequest): Request[GetIdentityMailFromDomainAttributesResponse] = js.native
    def getIdentityNotificationAttributes(params: GetIdentityNotificationAttributesRequest, callback: Callback[GetIdentityNotificationAttributesResponse]): Unit = js.native
    def getIdentityNotificationAttributes(params: GetIdentityNotificationAttributesRequest): Request[GetIdentityNotificationAttributesResponse] = js.native
    def getIdentityPolicies(params: GetIdentityPoliciesRequest, callback: Callback[GetIdentityPoliciesResponse]): Unit = js.native
    def getIdentityPolicies(params: GetIdentityPoliciesRequest): Request[GetIdentityPoliciesResponse] = js.native
    def getIdentityVerificationAttributes(params: GetIdentityVerificationAttributesRequest, callback: Callback[GetIdentityVerificationAttributesResponse]): Unit = js.native
    def getIdentityVerificationAttributes(params: GetIdentityVerificationAttributesRequest): Request[GetIdentityVerificationAttributesResponse] = js.native
    def getSendQuota(callback: Callback[GetSendQuotaResponse]): Unit = js.native
    def getSendQuota(): Request[GetSendQuotaResponse] = js.native
    def getSendStatistics(callback: Callback[GetSendStatisticsResponse]): Unit = js.native
    def getSendStatistics(): Request[GetSendStatisticsResponse] = js.native
    def listConfigurationSets(params: ListConfigurationSetsRequest, callback: Callback[ListConfigurationSetsResponse]): Unit = js.native
    def listConfigurationSets(params: ListConfigurationSetsRequest): Request[ListConfigurationSetsResponse] = js.native
    def listIdentities(params: ListIdentitiesRequest, callback: Callback[ListIdentitiesResponse]): Unit = js.native
    def listIdentities(params: ListIdentitiesRequest): Request[ListIdentitiesResponse] = js.native
    def listIdentityPolicies(params: ListIdentityPoliciesRequest, callback: Callback[ListIdentityPoliciesResponse]): Unit = js.native
    def listIdentityPolicies(params: ListIdentityPoliciesRequest): Request[ListIdentityPoliciesResponse] = js.native
    def listReceiptFilters(params: ListReceiptFiltersRequest, callback: Callback[ListReceiptFiltersResponse]): Unit = js.native
    def listReceiptFilters(params: ListReceiptFiltersRequest): Request[ListReceiptFiltersResponse] = js.native
    def listReceiptRuleSets(params: ListReceiptRuleSetsRequest, callback: Callback[ListReceiptRuleSetsResponse]): Unit = js.native
    def listReceiptRuleSets(params: ListReceiptRuleSetsRequest): Request[ListReceiptRuleSetsResponse] = js.native
    def listVerifiedEmailAddresses(callback: Callback[ListVerifiedEmailAddressesResponse]): Unit = js.native
    def listVerifiedEmailAddresses(): Request[ListVerifiedEmailAddressesResponse] = js.native
    def putIdentityPolicy(params: PutIdentityPolicyRequest, callback: Callback[PutIdentityPolicyResponse]): Unit = js.native
    def putIdentityPolicy(params: PutIdentityPolicyRequest): Request[PutIdentityPolicyResponse] = js.native
    def reorderReceiptRuleSet(params: ReorderReceiptRuleSetRequest, callback: Callback[ReorderReceiptRuleSetResponse]): Unit = js.native
    def reorderReceiptRuleSet(params: ReorderReceiptRuleSetRequest): Request[ReorderReceiptRuleSetResponse] = js.native
    def sendBounce(params: SendBounceRequest, callback: Callback[SendBounceResponse]): Unit = js.native
    def sendBounce(params: SendBounceRequest): Request[SendBounceResponse] = js.native
    def sendEmail(params: SendEmailRequest, callback: Callback[SendEmailResponse]): Unit = js.native
    def sendEmail(params: SendEmailRequest): Request[SendEmailResponse] = js.native
    def sendRawEmail(params: SendRawEmailRequest, callback: Callback[SendRawEmailResponse]): Unit = js.native
    def sendRawEmail(params: SendRawEmailRequest): Request[SendRawEmailResponse] = js.native
    def setActiveReceiptRuleSet(params: SetActiveReceiptRuleSetRequest, callback: Callback[SetActiveReceiptRuleSetResponse]): Unit = js.native
    def setActiveReceiptRuleSet(params: SetActiveReceiptRuleSetRequest): Request[SetActiveReceiptRuleSetResponse] = js.native
    def setIdentityDkimEnabled(params: SetIdentityDkimEnabledRequest, callback: Callback[SetIdentityDkimEnabledResponse]): Unit = js.native
    def setIdentityDkimEnabled(params: SetIdentityDkimEnabledRequest): Request[SetIdentityDkimEnabledResponse] = js.native
    def setIdentityFeedbackForwardingEnabled(params: SetIdentityFeedbackForwardingEnabledRequest, callback: Callback[SetIdentityFeedbackForwardingEnabledResponse]): Unit = js.native
    def setIdentityFeedbackForwardingEnabled(params: SetIdentityFeedbackForwardingEnabledRequest): Request[SetIdentityFeedbackForwardingEnabledResponse] = js.native
    def setIdentityHeadersInNotificationsEnabled(params: SetIdentityHeadersInNotificationsEnabledRequest, callback: Callback[SetIdentityHeadersInNotificationsEnabledResponse]): Unit = js.native
    def setIdentityHeadersInNotificationsEnabled(params: SetIdentityHeadersInNotificationsEnabledRequest): Request[SetIdentityHeadersInNotificationsEnabledResponse] = js.native
    def setIdentityMailFromDomain(params: SetIdentityMailFromDomainRequest, callback: Callback[SetIdentityMailFromDomainResponse]): Unit = js.native
    def setIdentityMailFromDomain(params: SetIdentityMailFromDomainRequest): Request[SetIdentityMailFromDomainResponse] = js.native
    def setIdentityNotificationTopic(params: SetIdentityNotificationTopicRequest, callback: Callback[SetIdentityNotificationTopicResponse]): Unit = js.native
    def setIdentityNotificationTopic(params: SetIdentityNotificationTopicRequest): Request[SetIdentityNotificationTopicResponse] = js.native
    def setReceiptRulePosition(params: SetReceiptRulePositionRequest, callback: Callback[SetReceiptRulePositionResponse]): Unit = js.native
    def setReceiptRulePosition(params: SetReceiptRulePositionRequest): Request[SetReceiptRulePositionResponse] = js.native
    def updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest, callback: Callback[UpdateConfigurationSetEventDestinationResponse]): Unit = js.native
    def updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest): Request[UpdateConfigurationSetEventDestinationResponse] = js.native
    def updateReceiptRule(params: UpdateReceiptRuleRequest, callback: Callback[UpdateReceiptRuleResponse]): Unit = js.native
    def updateReceiptRule(params: UpdateReceiptRuleRequest): Request[UpdateReceiptRuleResponse] = js.native
    def verifyDomainDkim(params: VerifyDomainDkimRequest, callback: Callback[VerifyDomainDkimResponse]): Unit = js.native
    def verifyDomainDkim(params: VerifyDomainDkimRequest): Request[VerifyDomainDkimResponse] = js.native
    def verifyDomainIdentity(params: VerifyDomainIdentityRequest, callback: Callback[VerifyDomainIdentityResponse]): Unit = js.native
    def verifyDomainIdentity(params: VerifyDomainIdentityRequest): Request[VerifyDomainIdentityResponse] = js.native
    def verifyEmailAddress(params: VerifyEmailAddressRequest, callback: Callback[js.Object]): Unit = js.native
    def verifyEmailAddress(params: VerifyEmailAddressRequest): Request[js.Object] = js.native
    def verifyEmailIdentity(params: VerifyEmailIdentityRequest, callback: Callback[VerifyEmailIdentityResponse]): Unit = js.native
    def verifyEmailIdentity(params: VerifyEmailIdentityRequest): Request[VerifyEmailIdentityResponse] = js.native
  }

  /**
   * <p>When included in a receipt rule, this action adds a header to the received email.</p> <p>For information about adding a header using a receipt rule, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-add-header.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait AddHeaderAction extends js.Object {
    var HeaderName: HeaderName
    var HeaderValue: HeaderValue
  }

  object AddHeaderAction {
    def apply(
      HeaderName: js.UndefOr[HeaderName] = js.undefined,
      HeaderValue: js.UndefOr[HeaderValue] = js.undefined
    ): AddHeaderAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HeaderName" -> HeaderName.map { x => x: js.Any }),
        ("HeaderValue" -> HeaderValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddHeaderAction]
    }
  }

  /**
   * <p>Indicates that a resource could not be created because of a naming conflict.</p>
   */
  @js.native
  trait AlreadyExistsExceptionException extends js.Object {
    var Name: RuleOrRuleSetName
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
    var Text: Content
    var Html: Content
  }

  object Body {
    def apply(
      Text: js.UndefOr[Content] = js.undefined,
      Html: js.UndefOr[Content] = js.undefined
    ): Body = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Text" -> Text.map { x => x: js.Any }),
        ("Html" -> Html.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Body]
    }
  }

  /**
   * <p>When included in a receipt rule, this action rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).</p> <p>For information about sending a bounce message in response to a received email, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-bounce.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait BounceAction extends js.Object {
    var SmtpReplyCode: BounceSmtpReplyCode
    var Sender: Address
    var StatusCode: BounceStatusCode
    var Message: BounceMessage
    var TopicArn: AmazonResourceName
  }

  object BounceAction {
    def apply(
      SmtpReplyCode: js.UndefOr[BounceSmtpReplyCode] = js.undefined,
      Sender: js.UndefOr[Address] = js.undefined,
      StatusCode: js.UndefOr[BounceStatusCode] = js.undefined,
      Message: js.UndefOr[BounceMessage] = js.undefined,
      TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): BounceAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SmtpReplyCode" -> SmtpReplyCode.map { x => x: js.Any }),
        ("Sender" -> Sender.map { x => x: js.Any }),
        ("StatusCode" -> StatusCode.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("TopicArn" -> TopicArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var Recipient: Address
    var RecipientArn: AmazonResourceName
    var BounceType: BounceType
    var RecipientDsnFields: RecipientDsnFields
  }

  object BouncedRecipientInfo {
    def apply(
      Recipient: js.UndefOr[Address] = js.undefined,
      RecipientArn: js.UndefOr[AmazonResourceName] = js.undefined,
      BounceType: js.UndefOr[BounceType] = js.undefined,
      RecipientDsnFields: js.UndefOr[RecipientDsnFields] = js.undefined
    ): BouncedRecipientInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Recipient" -> Recipient.map { x => x: js.Any }),
        ("RecipientArn" -> RecipientArn.map { x => x: js.Any }),
        ("BounceType" -> BounceType.map { x => x: js.Any }),
        ("RecipientDsnFields" -> RecipientDsnFields.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BouncedRecipientInfo]
    }
  }

  /**
   * <p>Indicates that the delete operation could not be completed.</p>
   */
  @js.native
  trait CannotDeleteExceptionException extends js.Object {
    var Name: RuleOrRuleSetName
  }

  /**
   * <p>Represents a request to create a receipt rule set by cloning an existing one. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CloneReceiptRuleSetRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
    var OriginalRuleSetName: ReceiptRuleSetName
  }

  object CloneReceiptRuleSetRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      OriginalRuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined
    ): CloneReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RuleSetName" -> RuleSetName.map { x => x: js.Any }),
        ("OriginalRuleSetName" -> OriginalRuleSetName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): CloneReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloneReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Contains information associated with an Amazon CloudWatch event destination to which email sending events are published.</p> <p>Event destinations, such as Amazon CloudWatch, are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CloudWatchDestination extends js.Object {
    var DimensionConfigurations: CloudWatchDimensionConfigurations
  }

  object CloudWatchDestination {
    def apply(
      DimensionConfigurations: js.UndefOr[CloudWatchDimensionConfigurations] = js.undefined
    ): CloudWatchDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DimensionConfigurations" -> DimensionConfigurations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchDestination]
    }
  }

  /**
   * <p>Contains the dimension configuration to use when you publish email sending events to Amazon CloudWatch.</p> <p>For information about publishing email sending events to Amazon CloudWatch, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CloudWatchDimensionConfiguration extends js.Object {
    var DimensionName: DimensionName
    var DimensionValueSource: DimensionValueSource
    var DefaultDimensionValue: DefaultDimensionValue
  }

  object CloudWatchDimensionConfiguration {
    def apply(
      DimensionName: js.UndefOr[DimensionName] = js.undefined,
      DimensionValueSource: js.UndefOr[DimensionValueSource] = js.undefined,
      DefaultDimensionValue: js.UndefOr[DefaultDimensionValue] = js.undefined
    ): CloudWatchDimensionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DimensionName" -> DimensionName.map { x => x: js.Any }),
        ("DimensionValueSource" -> DimensionValueSource.map { x => x: js.Any }),
        ("DefaultDimensionValue" -> DefaultDimensionValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchDimensionConfiguration]
    }
  }

  /**
   * <p>The name of the configuration set.</p> <p>Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ConfigurationSet extends js.Object {
    var Name: ConfigurationSetName
  }

  object ConfigurationSet {
    def apply(
      Name: js.UndefOr[ConfigurationSetName] = js.undefined
    ): ConfigurationSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationSet]
    }
  }

  /**
   * <p>Indicates that the configuration set could not be created because of a naming conflict.</p>
   */
  @js.native
  trait ConfigurationSetAlreadyExistsExceptionException extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }


  object ConfigurationSetAttributeEnum {
    val eventDestinations = "eventDestinations"

    val values = IndexedSeq(eventDestinations)
  }

  /**
   * <p>Indicates that the configuration set does not exist.</p>
   */
  @js.native
  trait ConfigurationSetDoesNotExistExceptionException extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  /**
   * <p>Represents textual data, plus an optional character set specification.</p> <p>By default, the text must be 7-bit ASCII, due to the constraints of the SMTP protocol. If the text must contain any other characters, then you must also specify a character set. Examples include UTF-8, ISO-8859-1, and Shift_JIS.</p>
   */
  @js.native
  trait Content extends js.Object {
    var Data: MessageData
    var Charset: Charset
  }

  object Content {
    def apply(
      Data: js.UndefOr[MessageData] = js.undefined,
      Charset: js.UndefOr[Charset] = js.undefined
    ): Content = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Data" -> Data.map { x => x: js.Any }),
        ("Charset" -> Charset.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Content]
    }
  }

  /**
   * <p>Represents a request to create a configuration set event destination. A configuration set event destination, which can be either Amazon CloudWatch or Amazon Kinesis Firehose, describes an AWS service in which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CreateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestination: EventDestination
  }

  object CreateConfigurationSetEventDestinationRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      EventDestination: js.UndefOr[EventDestination] = js.undefined
    ): CreateConfigurationSetEventDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationSetName" -> ConfigurationSetName.map { x => x: js.Any }),
        ("EventDestination" -> EventDestination.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): CreateConfigurationSetEventDestinationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetEventDestinationResponse]
    }
  }

  /**
   * <p>Represents a request to create a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CreateConfigurationSetRequest extends js.Object {
    var ConfigurationSet: ConfigurationSet
  }

  object CreateConfigurationSetRequest {
    def apply(
      ConfigurationSet: js.UndefOr[ConfigurationSet] = js.undefined
    ): CreateConfigurationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationSet" -> ConfigurationSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): CreateConfigurationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetResponse]
    }
  }

  /**
   * <p>Represents a request to create a new IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CreateReceiptFilterRequest extends js.Object {
    var Filter: ReceiptFilter
  }

  object CreateReceiptFilterRequest {
    def apply(
      Filter: js.UndefOr[ReceiptFilter] = js.undefined
    ): CreateReceiptFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Filter" -> Filter.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): CreateReceiptFilterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReceiptFilterResponse]
    }
  }

  /**
   * <p>Represents a request to create a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CreateReceiptRuleRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
    var After: ReceiptRuleName
    var Rule: ReceiptRule
  }

  object CreateReceiptRuleRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      After: js.UndefOr[ReceiptRuleName] = js.undefined,
      Rule: js.UndefOr[ReceiptRule] = js.undefined
    ): CreateReceiptRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RuleSetName" -> RuleSetName.map { x => x: js.Any }),
        ("After" -> After.map { x => x: js.Any }),
        ("Rule" -> Rule.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): CreateReceiptRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReceiptRuleResponse]
    }
  }

  /**
   * <p>Represents a request to create an empty receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait CreateReceiptRuleSetRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
  }

  object CreateReceiptRuleSetRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined
    ): CreateReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RuleSetName" -> RuleSetName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): CreateReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReceiptRuleSetResponse]
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
   * <p>Represents a request to delete a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestinationName: EventDestinationName
  }

  object DeleteConfigurationSetEventDestinationRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      EventDestinationName: js.UndefOr[EventDestinationName] = js.undefined
    ): DeleteConfigurationSetEventDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationSetName" -> ConfigurationSetName.map { x => x: js.Any }),
        ("EventDestinationName" -> EventDestinationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteConfigurationSetEventDestinationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetEventDestinationResponse]
    }
  }

  /**
   * <p>Represents a request to delete a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  object DeleteConfigurationSetRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
    ): DeleteConfigurationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationSetName" -> ConfigurationSetName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteConfigurationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetResponse]
    }
  }

  /**
   * <p>Represents a request to delete a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteIdentityPolicyRequest extends js.Object {
    var Identity: Identity
    var PolicyName: PolicyName
  }

  object DeleteIdentityPolicyRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined
    ): DeleteIdentityPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identity" -> Identity.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteIdentityPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIdentityPolicyResponse]
    }
  }

  /**
   * <p>Represents a request to delete one of your Amazon SES identities (an email address or domain).</p>
   */
  @js.native
  trait DeleteIdentityRequest extends js.Object {
    var Identity: Identity
  }

  object DeleteIdentityRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined
    ): DeleteIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identity" -> Identity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIdentityResponse]
    }
  }

  /**
   * <p>Represents a request to delete an IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteReceiptFilterRequest extends js.Object {
    var FilterName: ReceiptFilterName
  }

  object DeleteReceiptFilterRequest {
    def apply(
      FilterName: js.UndefOr[ReceiptFilterName] = js.undefined
    ): DeleteReceiptFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FilterName" -> FilterName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteReceiptFilterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReceiptFilterResponse]
    }
  }

  /**
   * <p>Represents a request to delete a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteReceiptRuleRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
    var RuleName: ReceiptRuleName
  }

  object DeleteReceiptRuleRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      RuleName: js.UndefOr[ReceiptRuleName] = js.undefined
    ): DeleteReceiptRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RuleSetName" -> RuleSetName.map { x => x: js.Any }),
        ("RuleName" -> RuleName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteReceiptRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReceiptRuleResponse]
    }
  }

  /**
   * <p>Represents a request to delete a receipt rule set and all of the receipt rules it contains. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DeleteReceiptRuleSetRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
  }

  object DeleteReceiptRuleSetRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined
    ): DeleteReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RuleSetName" -> RuleSetName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Represents a request to delete an email address from the list of email addresses you have attempted to verify under your AWS account.</p>
   */
  @js.native
  trait DeleteVerifiedEmailAddressRequest extends js.Object {
    var EmailAddress: Address
  }

  object DeleteVerifiedEmailAddressRequest {
    def apply(
      EmailAddress: js.UndefOr[Address] = js.undefined
    ): DeleteVerifiedEmailAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EmailAddress" -> EmailAddress.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DescribeActiveReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActiveReceiptRuleSetRequest]
    }
  }

  /**
   * <p>Represents the metadata and receipt rules for the receipt rule set that is currently active.</p>
   */
  @js.native
  trait DescribeActiveReceiptRuleSetResponse extends js.Object {
    var Metadata: ReceiptRuleSetMetadata
    var Rules: ReceiptRulesList
  }

  object DescribeActiveReceiptRuleSetResponse {
    def apply(
      Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.undefined,
      Rules: js.UndefOr[ReceiptRulesList] = js.undefined
    ): DescribeActiveReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Metadata" -> Metadata.map { x => x: js.Any }),
        ("Rules" -> Rules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActiveReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Represents a request to return the details of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DescribeConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var ConfigurationSetAttributeNames: ConfigurationSetAttributeList
  }

  object DescribeConfigurationSetRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      ConfigurationSetAttributeNames: js.UndefOr[ConfigurationSetAttributeList] = js.undefined
    ): DescribeConfigurationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationSetName" -> ConfigurationSetName.map { x => x: js.Any }),
        ("ConfigurationSetAttributeNames" -> ConfigurationSetAttributeNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationSetRequest]
    }
  }

  /**
   * <p>Represents the details of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DescribeConfigurationSetResponse extends js.Object {
    var ConfigurationSet: ConfigurationSet
    var EventDestinations: EventDestinations
  }

  object DescribeConfigurationSetResponse {
    def apply(
      ConfigurationSet: js.UndefOr[ConfigurationSet] = js.undefined,
      EventDestinations: js.UndefOr[EventDestinations] = js.undefined
    ): DescribeConfigurationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationSet" -> ConfigurationSet.map { x => x: js.Any }),
        ("EventDestinations" -> EventDestinations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationSetResponse]
    }
  }

  /**
   * <p>Represents a request to return the details of a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DescribeReceiptRuleRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
    var RuleName: ReceiptRuleName
  }

  object DescribeReceiptRuleRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      RuleName: js.UndefOr[ReceiptRuleName] = js.undefined
    ): DescribeReceiptRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RuleSetName" -> RuleSetName.map { x => x: js.Any }),
        ("RuleName" -> RuleName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReceiptRuleRequest]
    }
  }

  /**
   * <p>Represents the details of a receipt rule.</p>
   */
  @js.native
  trait DescribeReceiptRuleResponse extends js.Object {
    var Rule: ReceiptRule
  }

  object DescribeReceiptRuleResponse {
    def apply(
      Rule: js.UndefOr[ReceiptRule] = js.undefined
    ): DescribeReceiptRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Rule" -> Rule.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReceiptRuleResponse]
    }
  }

  /**
   * <p>Represents a request to return the details of a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait DescribeReceiptRuleSetRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
  }

  object DescribeReceiptRuleSetRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined
    ): DescribeReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RuleSetName" -> RuleSetName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReceiptRuleSetRequest]
    }
  }

  /**
   * <p>Represents the details of the specified receipt rule set.</p>
   */
  @js.native
  trait DescribeReceiptRuleSetResponse extends js.Object {
    var Metadata: ReceiptRuleSetMetadata
    var Rules: ReceiptRulesList
  }

  object DescribeReceiptRuleSetResponse {
    def apply(
      Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.undefined,
      Rules: js.UndefOr[ReceiptRulesList] = js.undefined
    ): DescribeReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Metadata" -> Metadata.map { x => x: js.Any }),
        ("Rules" -> Rules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Represents the destination of the message, consisting of To:, CC:, and BCC: fields.</p> <p> By default, the string must be 7-bit ASCII. If the text must contain any other characters, then you must use MIME encoded-word syntax (RFC 2047) instead of a literal string. MIME encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>. For more information, see <a href="http://tools.ietf.org/html/rfc2047">RFC 2047</a>. </p>
   */
  @js.native
  trait Destination extends js.Object {
    var ToAddresses: AddressList
    var CcAddresses: AddressList
    var BccAddresses: AddressList
  }

  object Destination {
    def apply(
      ToAddresses: js.UndefOr[AddressList] = js.undefined,
      CcAddresses: js.UndefOr[AddressList] = js.undefined,
      BccAddresses: js.UndefOr[AddressList] = js.undefined
    ): Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ToAddresses" -> ToAddresses.map { x => x: js.Any }),
        ("CcAddresses" -> CcAddresses.map { x => x: js.Any }),
        ("BccAddresses" -> BccAddresses.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }


  object DimensionValueSourceEnum {
    val messageTag = "messageTag"
    val emailHeader = "emailHeader"

    val values = IndexedSeq(messageTag, emailHeader)
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
   * <p>Contains information about the event destination to which the specified email sending events are published.</p> <note> <p>When you create or update an event destination, you must provide one, and only one, destination. The destination can be either Amazon CloudWatch or Amazon Kinesis Firehose.</p> </note> <p>Event destinations are associated with configuration sets, which enable you to publish email sending events to Amazon CloudWatch or Amazon Kinesis Firehose. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait EventDestination extends js.Object {
    var Name: EventDestinationName
    var Enabled: Enabled
    var KinesisFirehoseDestination: KinesisFirehoseDestination
    var CloudWatchDestination: CloudWatchDestination
    var MatchingEventTypes: EventTypes
  }

  object EventDestination {
    def apply(
      Name: js.UndefOr[EventDestinationName] = js.undefined,
      Enabled: js.UndefOr[Enabled] = js.undefined,
      KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
      CloudWatchDestination: js.UndefOr[CloudWatchDestination] = js.undefined,
      MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined
    ): EventDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("KinesisFirehoseDestination" -> KinesisFirehoseDestination.map { x => x: js.Any }),
        ("CloudWatchDestination" -> CloudWatchDestination.map { x => x: js.Any }),
        ("MatchingEventTypes" -> MatchingEventTypes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDestination]
    }
  }

  /**
   * <p>Indicates that the event destination could not be created because of a naming conflict.</p>
   */
  @js.native
  trait EventDestinationAlreadyExistsExceptionException extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestinationName: EventDestinationName
  }

  /**
   * <p>Indicates that the event destination does not exist.</p>
   */
  @js.native
  trait EventDestinationDoesNotExistExceptionException extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestinationName: EventDestinationName
  }


  object EventTypeEnum {
    val send = "send"
    val reject = "reject"
    val bounce = "bounce"
    val complaint = "complaint"
    val delivery = "delivery"

    val values = IndexedSeq(send, reject, bounce, complaint, delivery)
  }

  /**
   * <p>Additional X-headers to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.</p> <p>For information about receiving email through Amazon SES, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ExtensionField extends js.Object {
    var Name: ExtensionFieldName
    var Value: ExtensionFieldValue
  }

  object ExtensionField {
    def apply(
      Name: js.UndefOr[ExtensionFieldName] = js.undefined,
      Value: js.UndefOr[ExtensionFieldValue] = js.undefined
    ): ExtensionField = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExtensionField]
    }
  }

  /**
   * <p>Represents a request for the status of Amazon SES Easy DKIM signing for an identity. For domain identities, this request also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES successfully verified that these tokens were published. For more information about Easy DKIM, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait GetIdentityDkimAttributesRequest extends js.Object {
    var Identities: IdentityList
  }

  object GetIdentityDkimAttributesRequest {
    def apply(
      Identities: js.UndefOr[IdentityList] = js.undefined
    ): GetIdentityDkimAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identities" -> Identities.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityDkimAttributesRequest]
    }
  }

  /**
   * <p>Represents the status of Amazon SES Easy DKIM signing for an identity. For domain identities, this response also contains the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES successfully verified that these tokens were published.</p>
   */
  @js.native
  trait GetIdentityDkimAttributesResponse extends js.Object {
    var DkimAttributes: DkimAttributes
  }

  object GetIdentityDkimAttributesResponse {
    def apply(
      DkimAttributes: js.UndefOr[DkimAttributes] = js.undefined
    ): GetIdentityDkimAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DkimAttributes" -> DkimAttributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityDkimAttributesResponse]
    }
  }

  /**
   * <p>Represents a request to return the Amazon SES custom MAIL FROM attributes for a list of identities. For information about using a custom MAIL FROM domain, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait GetIdentityMailFromDomainAttributesRequest extends js.Object {
    var Identities: IdentityList
  }

  object GetIdentityMailFromDomainAttributesRequest {
    def apply(
      Identities: js.UndefOr[IdentityList] = js.undefined
    ): GetIdentityMailFromDomainAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identities" -> Identities.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityMailFromDomainAttributesRequest]
    }
  }

  /**
   * <p>Represents the custom MAIL FROM attributes for a list of identities.</p>
   */
  @js.native
  trait GetIdentityMailFromDomainAttributesResponse extends js.Object {
    var MailFromDomainAttributes: MailFromDomainAttributes
  }

  object GetIdentityMailFromDomainAttributesResponse {
    def apply(
      MailFromDomainAttributes: js.UndefOr[MailFromDomainAttributes] = js.undefined
    ): GetIdentityMailFromDomainAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MailFromDomainAttributes" -> MailFromDomainAttributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityMailFromDomainAttributesResponse]
    }
  }

  /**
   * <p>Represents a request to return the notification attributes for a list of identities you verified with Amazon SES. For information about Amazon SES notifications, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait GetIdentityNotificationAttributesRequest extends js.Object {
    var Identities: IdentityList
  }

  object GetIdentityNotificationAttributesRequest {
    def apply(
      Identities: js.UndefOr[IdentityList] = js.undefined
    ): GetIdentityNotificationAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identities" -> Identities.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityNotificationAttributesRequest]
    }
  }

  /**
   * <p>Represents the notification attributes for a list of identities.</p>
   */
  @js.native
  trait GetIdentityNotificationAttributesResponse extends js.Object {
    var NotificationAttributes: NotificationAttributes
  }

  object GetIdentityNotificationAttributesResponse {
    def apply(
      NotificationAttributes: js.UndefOr[NotificationAttributes] = js.undefined
    ): GetIdentityNotificationAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NotificationAttributes" -> NotificationAttributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityNotificationAttributesResponse]
    }
  }

  /**
   * <p>Represents a request to return the requested sending authorization policies for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait GetIdentityPoliciesRequest extends js.Object {
    var Identity: Identity
    var PolicyNames: PolicyNameList
  }

  object GetIdentityPoliciesRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      PolicyNames: js.UndefOr[PolicyNameList] = js.undefined
    ): GetIdentityPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identity" -> Identity.map { x => x: js.Any }),
        ("PolicyNames" -> PolicyNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityPoliciesRequest]
    }
  }

  /**
   * <p>Represents the requested sending authorization policies.</p>
   */
  @js.native
  trait GetIdentityPoliciesResponse extends js.Object {
    var Policies: PolicyMap
  }

  object GetIdentityPoliciesResponse {
    def apply(
      Policies: js.UndefOr[PolicyMap] = js.undefined
    ): GetIdentityPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Policies" -> Policies.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityPoliciesResponse]
    }
  }

  /**
   * <p>Represents a request to return the Amazon SES verification status of a list of identities. For domain identities, this request also returns the verification token. For information about verifying identities with Amazon SES, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait GetIdentityVerificationAttributesRequest extends js.Object {
    var Identities: IdentityList
  }

  object GetIdentityVerificationAttributesRequest {
    def apply(
      Identities: js.UndefOr[IdentityList] = js.undefined
    ): GetIdentityVerificationAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identities" -> Identities.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityVerificationAttributesRequest]
    }
  }

  /**
   * <p>The Amazon SES verification status of a list of identities. For domain identities, this response also contains the verification token.</p>
   */
  @js.native
  trait GetIdentityVerificationAttributesResponse extends js.Object {
    var VerificationAttributes: VerificationAttributes
  }

  object GetIdentityVerificationAttributesResponse {
    def apply(
      VerificationAttributes: js.UndefOr[VerificationAttributes] = js.undefined
    ): GetIdentityVerificationAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VerificationAttributes" -> VerificationAttributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityVerificationAttributesResponse]
    }
  }

  /**
   * <p>Represents your Amazon SES daily sending quota, maximum send rate, and the number of emails you have sent in the last 24 hours.</p>
   */
  @js.native
  trait GetSendQuotaResponse extends js.Object {
    var Max24HourSend: Max24HourSend
    var MaxSendRate: MaxSendRate
    var SentLast24Hours: SentLast24Hours
  }

  object GetSendQuotaResponse {
    def apply(
      Max24HourSend: js.UndefOr[Max24HourSend] = js.undefined,
      MaxSendRate: js.UndefOr[MaxSendRate] = js.undefined,
      SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined
    ): GetSendQuotaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Max24HourSend" -> Max24HourSend.map { x => x: js.Any }),
        ("MaxSendRate" -> MaxSendRate.map { x => x: js.Any }),
        ("SentLast24Hours" -> SentLast24Hours.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSendQuotaResponse]
    }
  }

  /**
   * <p>Represents a list of data points. This list contains aggregated data from the previous two weeks of your sending activity with Amazon SES.</p>
   */
  @js.native
  trait GetSendStatisticsResponse extends js.Object {
    var SendDataPoints: SendDataPointList
  }

  object GetSendStatisticsResponse {
    def apply(
      SendDataPoints: js.UndefOr[SendDataPointList] = js.undefined
    ): GetSendStatisticsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SendDataPoints" -> SendDataPoints.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSendStatisticsResponse]
    }
  }

  /**
   * <p>Represents the DKIM attributes of a verified email address or a domain.</p>
   */
  @js.native
  trait IdentityDkimAttributes extends js.Object {
    var DkimEnabled: Enabled
    var DkimVerificationStatus: VerificationStatus
    var DkimTokens: VerificationTokenList
  }

  object IdentityDkimAttributes {
    def apply(
      DkimEnabled: js.UndefOr[Enabled] = js.undefined,
      DkimVerificationStatus: js.UndefOr[VerificationStatus] = js.undefined,
      DkimTokens: js.UndefOr[VerificationTokenList] = js.undefined
    ): IdentityDkimAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DkimEnabled" -> DkimEnabled.map { x => x: js.Any }),
        ("DkimVerificationStatus" -> DkimVerificationStatus.map { x => x: js.Any }),
        ("DkimTokens" -> DkimTokens.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityDkimAttributes]
    }
  }

  /**
   * <p>Represents the custom MAIL FROM domain attributes of a verified identity (email address or domain).</p>
   */
  @js.native
  trait IdentityMailFromDomainAttributes extends js.Object {
    var MailFromDomain: MailFromDomainName
    var MailFromDomainStatus: CustomMailFromStatus
    var BehaviorOnMXFailure: BehaviorOnMXFailure
  }

  object IdentityMailFromDomainAttributes {
    def apply(
      MailFromDomain: js.UndefOr[MailFromDomainName] = js.undefined,
      MailFromDomainStatus: js.UndefOr[CustomMailFromStatus] = js.undefined,
      BehaviorOnMXFailure: js.UndefOr[BehaviorOnMXFailure] = js.undefined
    ): IdentityMailFromDomainAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MailFromDomain" -> MailFromDomain.map { x => x: js.Any }),
        ("MailFromDomainStatus" -> MailFromDomainStatus.map { x => x: js.Any }),
        ("BehaviorOnMXFailure" -> BehaviorOnMXFailure.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityMailFromDomainAttributes]
    }
  }

  /**
   * <p>Represents the notification attributes of an identity, including whether an identity has Amazon Simple Notification Service (Amazon SNS) topics set for bounce, complaint, and/or delivery notifications, and whether feedback forwarding is enabled for bounce and complaint notifications.</p>
   */
  @js.native
  trait IdentityNotificationAttributes extends js.Object {
    var DeliveryTopic: NotificationTopic
    var BounceTopic: NotificationTopic
    var HeadersInComplaintNotificationsEnabled: Enabled
    var ForwardingEnabled: Enabled
    var HeadersInDeliveryNotificationsEnabled: Enabled
    var ComplaintTopic: NotificationTopic
    var HeadersInBounceNotificationsEnabled: Enabled
  }

  object IdentityNotificationAttributes {
    def apply(
      DeliveryTopic: js.UndefOr[NotificationTopic] = js.undefined,
      BounceTopic: js.UndefOr[NotificationTopic] = js.undefined,
      HeadersInComplaintNotificationsEnabled: js.UndefOr[Enabled] = js.undefined,
      ForwardingEnabled: js.UndefOr[Enabled] = js.undefined,
      HeadersInDeliveryNotificationsEnabled: js.UndefOr[Enabled] = js.undefined,
      ComplaintTopic: js.UndefOr[NotificationTopic] = js.undefined,
      HeadersInBounceNotificationsEnabled: js.UndefOr[Enabled] = js.undefined
    ): IdentityNotificationAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryTopic" -> DeliveryTopic.map { x => x: js.Any }),
        ("BounceTopic" -> BounceTopic.map { x => x: js.Any }),
        ("HeadersInComplaintNotificationsEnabled" -> HeadersInComplaintNotificationsEnabled.map { x => x: js.Any }),
        ("ForwardingEnabled" -> ForwardingEnabled.map { x => x: js.Any }),
        ("HeadersInDeliveryNotificationsEnabled" -> HeadersInDeliveryNotificationsEnabled.map { x => x: js.Any }),
        ("ComplaintTopic" -> ComplaintTopic.map { x => x: js.Any }),
        ("HeadersInBounceNotificationsEnabled" -> HeadersInBounceNotificationsEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var VerificationStatus: VerificationStatus
    var VerificationToken: VerificationToken
  }

  object IdentityVerificationAttributes {
    def apply(
      VerificationStatus: js.UndefOr[VerificationStatus] = js.undefined,
      VerificationToken: js.UndefOr[VerificationToken] = js.undefined
    ): IdentityVerificationAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VerificationStatus" -> VerificationStatus.map { x => x: js.Any }),
        ("VerificationToken" -> VerificationToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityVerificationAttributes]
    }
  }

  /**
   * <p>Indicates that the Amazon CloudWatch destination is invalid. See the error message for details.</p>
   */
  @js.native
  trait InvalidCloudWatchDestinationExceptionException extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestinationName: EventDestinationName
  }

  /**
   * <p>Indicates that the configuration set is invalid. See the error message for details.</p>
   */
  @js.native
  trait InvalidConfigurationSetExceptionException extends js.Object {

  }

  /**
   * <p>Indicates that the Amazon Kinesis Firehose destination is invalid. See the error message for details.</p>
   */
  @js.native
  trait InvalidFirehoseDestinationExceptionException extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestinationName: EventDestinationName
  }

  /**
   * <p>Indicates that the provided AWS Lambda function is invalid, or that Amazon SES could not execute the provided function, possibly due to permissions issues. For information about giving permissions, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait InvalidLambdaFunctionExceptionException extends js.Object {
    var FunctionArn: AmazonResourceName
  }

  /**
   * <p>Indicates that the provided policy is invalid. Check the error stack for more information about what caused the error.</p>
   */
  @js.native
  trait InvalidPolicyExceptionException extends js.Object {

  }

  /**
   * <p>Indicates that the provided Amazon S3 bucket or AWS KMS encryption key is invalid, or that Amazon SES could not publish to the bucket, possibly due to permissions issues. For information about giving permissions, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait InvalidS3ConfigurationExceptionException extends js.Object {
    var Bucket: S3BucketName
  }

  /**
   * <p>Indicates that the provided Amazon SNS topic is invalid, or that Amazon SES could not publish to the topic, possibly due to permissions issues. For information about giving permissions, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait InvalidSnsTopicExceptionException extends js.Object {
    var Topic: AmazonResourceName
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
    var IAMRoleARN: AmazonResourceName
    var DeliveryStreamARN: AmazonResourceName
  }

  object KinesisFirehoseDestination {
    def apply(
      IAMRoleARN: js.UndefOr[AmazonResourceName] = js.undefined,
      DeliveryStreamARN: js.UndefOr[AmazonResourceName] = js.undefined
    ): KinesisFirehoseDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IAMRoleARN" -> IAMRoleARN.map { x => x: js.Any }),
        ("DeliveryStreamARN" -> DeliveryStreamARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseDestination]
    }
  }

  /**
   * <p>When included in a receipt rule, this action calls an AWS Lambda function and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).</p> <p>To enable Amazon SES to call your AWS Lambda function or to publish to an Amazon SNS topic of another account, Amazon SES must have permission to access those resources. For information about giving permissions, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES Developer Guide</a>.</p> <p>For information about using AWS Lambda actions in receipt rules, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-lambda.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait LambdaAction extends js.Object {
    var TopicArn: AmazonResourceName
    var FunctionArn: AmazonResourceName
    var InvocationType: InvocationType
  }

  object LambdaAction {
    def apply(
      TopicArn: js.UndefOr[AmazonResourceName] = js.undefined,
      FunctionArn: js.UndefOr[AmazonResourceName] = js.undefined,
      InvocationType: js.UndefOr[InvocationType] = js.undefined
    ): LambdaAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("FunctionArn" -> FunctionArn.map { x => x: js.Any }),
        ("InvocationType" -> InvocationType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaAction]
    }
  }

  /**
   * <p>Indicates that a resource could not be created because of service limits. For a list of Amazon SES limits, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/limits.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>Represents a request to list the configuration sets associated with your AWS account. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ListConfigurationSetsRequest extends js.Object {
    var NextToken: NextToken
    var MaxItems: MaxItems
  }

  object ListConfigurationSetsRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxItems: js.UndefOr[MaxItems] = js.undefined
    ): ListConfigurationSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationSetsRequest]
    }
  }

  /**
   * <p>A list of configuration sets associated with your AWS account. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ListConfigurationSetsResponse extends js.Object {
    var ConfigurationSets: ConfigurationSets
    var NextToken: NextToken
  }

  object ListConfigurationSetsResponse {
    def apply(
      ConfigurationSets: js.UndefOr[ConfigurationSets] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConfigurationSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationSets" -> ConfigurationSets.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationSetsResponse]
    }
  }

  /**
   * <p>Represents a request to return a list of all identities (email addresses and domains) that you have attempted to verify under your AWS account, regardless of verification status.</p>
   */
  @js.native
  trait ListIdentitiesRequest extends js.Object {
    var IdentityType: IdentityType
    var NextToken: NextToken
    var MaxItems: MaxItems
  }

  object ListIdentitiesRequest {
    def apply(
      IdentityType: js.UndefOr[IdentityType] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxItems: js.UndefOr[MaxItems] = js.undefined
    ): ListIdentitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityType" -> IdentityType.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentitiesRequest]
    }
  }

  /**
   * <p>A list of all identities that you have attempted to verify under your AWS account, regardless of verification status.</p>
   */
  @js.native
  trait ListIdentitiesResponse extends js.Object {
    var Identities: IdentityList
    var NextToken: NextToken
  }

  object ListIdentitiesResponse {
    def apply(
      Identities: js.UndefOr[IdentityList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIdentitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identities" -> Identities.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentitiesResponse]
    }
  }

  /**
   * <p>Represents a request to return a list of sending authorization policies that are attached to an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ListIdentityPoliciesRequest extends js.Object {
    var Identity: Identity
  }

  object ListIdentityPoliciesRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined
    ): ListIdentityPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identity" -> Identity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityPoliciesRequest]
    }
  }

  /**
   * <p>A list of names of sending authorization policies that apply to an identity.</p>
   */
  @js.native
  trait ListIdentityPoliciesResponse extends js.Object {
    var PolicyNames: PolicyNameList
  }

  object ListIdentityPoliciesResponse {
    def apply(
      PolicyNames: js.UndefOr[PolicyNameList] = js.undefined
    ): ListIdentityPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyNames" -> PolicyNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): ListReceiptFiltersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReceiptFiltersRequest]
    }
  }

  /**
   * <p>A list of IP address filters that exist under your AWS account.</p>
   */
  @js.native
  trait ListReceiptFiltersResponse extends js.Object {
    var Filters: ReceiptFilterList
  }

  object ListReceiptFiltersResponse {
    def apply(
      Filters: js.UndefOr[ReceiptFilterList] = js.undefined
    ): ListReceiptFiltersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReceiptFiltersResponse]
    }
  }

  /**
   * <p>Represents a request to list the receipt rule sets that exist under your AWS account. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ListReceiptRuleSetsRequest extends js.Object {
    var NextToken: NextToken
  }

  object ListReceiptRuleSetsRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReceiptRuleSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReceiptRuleSetsRequest]
    }
  }

  /**
   * <p>A list of receipt rule sets that exist under your AWS account.</p>
   */
  @js.native
  trait ListReceiptRuleSetsResponse extends js.Object {
    var RuleSets: ReceiptRuleSetsLists
    var NextToken: NextToken
  }

  object ListReceiptRuleSetsResponse {
    def apply(
      RuleSets: js.UndefOr[ReceiptRuleSetsLists] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReceiptRuleSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RuleSets" -> RuleSets.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReceiptRuleSetsResponse]
    }
  }

  /**
   * <p>A list of email addresses that you have verified with Amazon SES under your AWS account.</p>
   */
  @js.native
  trait ListVerifiedEmailAddressesResponse extends js.Object {
    var VerifiedEmailAddresses: AddressList
  }

  object ListVerifiedEmailAddressesResponse {
    def apply(
      VerifiedEmailAddresses: js.UndefOr[AddressList] = js.undefined
    ): ListVerifiedEmailAddressesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VerifiedEmailAddresses" -> VerifiedEmailAddresses.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVerifiedEmailAddressesResponse]
    }
  }

  /**
   * <p> Indicates that the message could not be sent because Amazon SES could not read the MX record required to use the specified MAIL FROM domain. For information about editing the custom MAIL FROM domain settings for an identity, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-edit.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait MailFromDomainNotVerifiedExceptionException extends js.Object {

  }

  /**
   * <p>Represents the message to be sent, composed of a subject and a body.</p>
   */
  @js.native
  trait Message extends js.Object {
    var Subject: Content
    var Body: Body
  }

  object Message {
    def apply(
      Subject: js.UndefOr[Content] = js.undefined,
      Body: js.UndefOr[Body] = js.undefined
    ): Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Subject" -> Subject.map { x => x: js.Any }),
        ("Body" -> Body.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Message]
    }
  }

  /**
   * <p>Message-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.</p> <p>For information about receiving email through Amazon SES, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait MessageDsn extends js.Object {
    var ReportingMta: ReportingMta
    var ArrivalDate: ArrivalDate
    var ExtensionFields: ExtensionFieldList
  }

  object MessageDsn {
    def apply(
      ReportingMta: js.UndefOr[ReportingMta] = js.undefined,
      ArrivalDate: js.UndefOr[ArrivalDate] = js.undefined,
      ExtensionFields: js.UndefOr[ExtensionFieldList] = js.undefined
    ): MessageDsn = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReportingMta" -> ReportingMta.map { x => x: js.Any }),
        ("ArrivalDate" -> ArrivalDate.map { x => x: js.Any }),
        ("ExtensionFields" -> ExtensionFields.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageDsn]
    }
  }

  /**
   * <p>Indicates that the action failed, and the message could not be sent. Check the error stack for more information about what caused the error.</p>
   */
  @js.native
  trait MessageRejectedException extends js.Object {

  }

  /**
   * <p>Contains the name and value of a tag that you can provide to <code>SendEmail</code> or <code>SendRawEmail</code> to apply to an email.</p> <p>Message tags, which you use with configuration sets, enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait MessageTag extends js.Object {
    var Name: MessageTagName
    var Value: MessageTagValue
  }

  object MessageTag {
    def apply(
      Name: js.UndefOr[MessageTagName] = js.undefined,
      Value: js.UndefOr[MessageTagValue] = js.undefined
    ): MessageTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var Identity: Identity
    var PolicyName: PolicyName
    var Policy: Policy
  }

  object PutIdentityPolicyRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined,
      Policy: js.UndefOr[Policy] = js.undefined
    ): PutIdentityPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identity" -> Identity.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("Policy" -> Policy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): PutIdentityPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutIdentityPolicyResponse]
    }
  }

  /**
   * <p>Represents the raw data of the message.</p>
   */
  @js.native
  trait RawMessage extends js.Object {
    var Data: RawMessageData
  }

  object RawMessage {
    def apply(
      Data: js.UndefOr[RawMessageData] = js.undefined
    ): RawMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Data" -> Data.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RawMessage]
    }
  }

  /**
   * <p>An action that Amazon SES can take when it receives an email on behalf of one or more email addresses or domains that you own. An instance of this data type can represent only one action.</p> <p>For information about setting up receipt rules, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ReceiptAction extends js.Object {
    var StopAction: StopAction
    var S3Action: S3Action
    var AddHeaderAction: AddHeaderAction
    var WorkmailAction: WorkmailAction
    var SNSAction: SNSAction
    var LambdaAction: LambdaAction
    var BounceAction: BounceAction
  }

  object ReceiptAction {
    def apply(
      StopAction: js.UndefOr[StopAction] = js.undefined,
      S3Action: js.UndefOr[S3Action] = js.undefined,
      AddHeaderAction: js.UndefOr[AddHeaderAction] = js.undefined,
      WorkmailAction: js.UndefOr[WorkmailAction] = js.undefined,
      SNSAction: js.UndefOr[SNSAction] = js.undefined,
      LambdaAction: js.UndefOr[LambdaAction] = js.undefined,
      BounceAction: js.UndefOr[BounceAction] = js.undefined
    ): ReceiptAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StopAction" -> StopAction.map { x => x: js.Any }),
        ("S3Action" -> S3Action.map { x => x: js.Any }),
        ("AddHeaderAction" -> AddHeaderAction.map { x => x: js.Any }),
        ("WorkmailAction" -> WorkmailAction.map { x => x: js.Any }),
        ("SNSAction" -> SNSAction.map { x => x: js.Any }),
        ("LambdaAction" -> LambdaAction.map { x => x: js.Any }),
        ("BounceAction" -> BounceAction.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiptAction]
    }
  }

  /**
   * <p>A receipt IP address filter enables you to specify whether to accept or reject mail originating from an IP address or range of IP addresses.</p> <p>For information about setting up IP address filters, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ReceiptFilter extends js.Object {
    var Name: ReceiptFilterName
    var IpFilter: ReceiptIpFilter
  }

  object ReceiptFilter {
    def apply(
      Name: js.UndefOr[ReceiptFilterName] = js.undefined,
      IpFilter: js.UndefOr[ReceiptIpFilter] = js.undefined
    ): ReceiptFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("IpFilter" -> IpFilter.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var Policy: ReceiptFilterPolicy
    var Cidr: Cidr
  }

  object ReceiptIpFilter {
    def apply(
      Policy: js.UndefOr[ReceiptFilterPolicy] = js.undefined,
      Cidr: js.UndefOr[Cidr] = js.undefined
    ): ReceiptIpFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Policy" -> Policy.map { x => x: js.Any }),
        ("Cidr" -> Cidr.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiptIpFilter]
    }
  }

  /**
   * <p>Receipt rules enable you to specify which actions Amazon SES should take when it receives mail on behalf of one or more email addresses or domains that you own.</p> <p>Each receipt rule defines a set of email addresses or domains to which it applies. If the email addresses or domains match at least one recipient address of the message, Amazon SES executes all of the receipt rule's actions on the message.</p> <p>For information about setting up receipt rules, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ReceiptRule extends js.Object {
    var Name: ReceiptRuleName
    var Enabled: Enabled
    var ScanEnabled: Enabled
    var Recipients: RecipientsList
    var TlsPolicy: TlsPolicy
    var Actions: ReceiptActionsList
  }

  object ReceiptRule {
    def apply(
      Name: js.UndefOr[ReceiptRuleName] = js.undefined,
      Enabled: js.UndefOr[Enabled] = js.undefined,
      ScanEnabled: js.UndefOr[Enabled] = js.undefined,
      Recipients: js.UndefOr[RecipientsList] = js.undefined,
      TlsPolicy: js.UndefOr[TlsPolicy] = js.undefined,
      Actions: js.UndefOr[ReceiptActionsList] = js.undefined
    ): ReceiptRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("ScanEnabled" -> ScanEnabled.map { x => x: js.Any }),
        ("Recipients" -> Recipients.map { x => x: js.Any }),
        ("TlsPolicy" -> TlsPolicy.map { x => x: js.Any }),
        ("Actions" -> Actions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiptRule]
    }
  }

  /**
   * <p>Information about a receipt rule set.</p> <p>A receipt rule set is a collection of rules that specify what Amazon SES should do with mail it receives on behalf of your account's verified domains.</p> <p>For information about setting up receipt rule sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ReceiptRuleSetMetadata extends js.Object {
    var Name: ReceiptRuleSetName
    var CreatedTimestamp: Timestamp
  }

  object ReceiptRuleSetMetadata {
    def apply(
      Name: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): ReceiptRuleSetMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("CreatedTimestamp" -> CreatedTimestamp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReceiptRuleSetMetadata]
    }
  }

  /**
   * <p>Recipient-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.</p> <p>For information about receiving email through Amazon SES, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait RecipientDsnFields extends js.Object {
    var RemoteMta: RemoteMta
    var DiagnosticCode: DiagnosticCode
    var FinalRecipient: Address
    var LastAttemptDate: LastAttemptDate
    var ExtensionFields: ExtensionFieldList
    var Action: DsnAction
    var Status: DsnStatus
  }

  object RecipientDsnFields {
    def apply(
      RemoteMta: js.UndefOr[RemoteMta] = js.undefined,
      DiagnosticCode: js.UndefOr[DiagnosticCode] = js.undefined,
      FinalRecipient: js.UndefOr[Address] = js.undefined,
      LastAttemptDate: js.UndefOr[LastAttemptDate] = js.undefined,
      ExtensionFields: js.UndefOr[ExtensionFieldList] = js.undefined,
      Action: js.UndefOr[DsnAction] = js.undefined,
      Status: js.UndefOr[DsnStatus] = js.undefined
    ): RecipientDsnFields = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RemoteMta" -> RemoteMta.map { x => x: js.Any }),
        ("DiagnosticCode" -> DiagnosticCode.map { x => x: js.Any }),
        ("FinalRecipient" -> FinalRecipient.map { x => x: js.Any }),
        ("LastAttemptDate" -> LastAttemptDate.map { x => x: js.Any }),
        ("ExtensionFields" -> ExtensionFields.map { x => x: js.Any }),
        ("Action" -> Action.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecipientDsnFields]
    }
  }

  /**
   * <p>Represents a request to reorder the receipt rules within a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait ReorderReceiptRuleSetRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
    var RuleNames: ReceiptRuleNamesList
  }

  object ReorderReceiptRuleSetRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      RuleNames: js.UndefOr[ReceiptRuleNamesList] = js.undefined
    ): ReorderReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RuleSetName" -> RuleSetName.map { x => x: js.Any }),
        ("RuleNames" -> RuleNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): ReorderReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReorderReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Indicates that the provided receipt rule does not exist.</p>
   */
  @js.native
  trait RuleDoesNotExistExceptionException extends js.Object {
    var Name: RuleOrRuleSetName
  }

  /**
   * <p>Indicates that the provided receipt rule set does not exist.</p>
   */
  @js.native
  trait RuleSetDoesNotExistExceptionException extends js.Object {
    var Name: RuleOrRuleSetName
  }

  /**
   * <p>When included in a receipt rule, this action saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).</p> <p>To enable Amazon SES to write emails to your Amazon S3 bucket, use an AWS KMS key to encrypt your emails, or publish to an Amazon SNS topic of another account, Amazon SES must have permission to access those resources. For information about giving permissions, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES Developer Guide</a>.</p> <note> <p>When you save your emails to an Amazon S3 bucket, the maximum email size (including headers) is 30 MB. Emails larger than that will bounce.</p> </note> <p>For information about specifying Amazon S3 actions in receipt rules, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-s3.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait S3Action extends js.Object {
    var TopicArn: AmazonResourceName
    var BucketName: S3BucketName
    var ObjectKeyPrefix: S3KeyPrefix
    var KmsKeyArn: AmazonResourceName
  }

  object S3Action {
    def apply(
      TopicArn: js.UndefOr[AmazonResourceName] = js.undefined,
      BucketName: js.UndefOr[S3BucketName] = js.undefined,
      ObjectKeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
      KmsKeyArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): S3Action = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("BucketName" -> BucketName.map { x => x: js.Any }),
        ("ObjectKeyPrefix" -> ObjectKeyPrefix.map { x => x: js.Any }),
        ("KmsKeyArn" -> KmsKeyArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Action]
    }
  }

  /**
   * <p>When included in a receipt rule, this action publishes a notification to Amazon Simple Notification Service (Amazon SNS). This action includes a complete copy of the email content in the Amazon SNS notifications. Amazon SNS notifications for all other actions simply provide information about the email. They do not include the email content itself.</p> <p>If you own the Amazon SNS topic, you don't need to do anything to give Amazon SES permission to publish emails to it. However, if you don't own the Amazon SNS topic, you need to attach a policy to the topic to give Amazon SES permissions to access it. For information about giving permissions, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES Developer Guide</a>.</p> <important> <p>You can only publish emails that are 150 KB or less (including the header) to Amazon SNS. Larger emails will bounce. If you anticipate emails larger than 150 KB, use the S3 action instead.</p> </important> <p>For information about using a receipt rule to publish an Amazon SNS notification, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-sns.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SNSAction extends js.Object {
    var TopicArn: AmazonResourceName
    var Encoding: SNSActionEncoding
  }

  object SNSAction {
    def apply(
      TopicArn: js.UndefOr[AmazonResourceName] = js.undefined,
      Encoding: js.UndefOr[SNSActionEncoding] = js.undefined
    ): SNSAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("Encoding" -> Encoding.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SNSAction]
    }
  }


  object SNSActionEncodingEnum {
    val `UTF-8` = "UTF-8"
    val Base64 = "Base64"

    val values = IndexedSeq(`UTF-8`, Base64)
  }

  /**
   * <p>Represents a request to send a bounce message to the sender of an email you received through Amazon SES.</p>
   */
  @js.native
  trait SendBounceRequest extends js.Object {
    var MessageDsn: MessageDsn
    var BounceSender: Address
    var BouncedRecipientInfoList: BouncedRecipientInfoList
    var OriginalMessageId: MessageId
    var BounceSenderArn: AmazonResourceName
    var Explanation: Explanation
  }

  object SendBounceRequest {
    def apply(
      MessageDsn: js.UndefOr[MessageDsn] = js.undefined,
      BounceSender: js.UndefOr[Address] = js.undefined,
      BouncedRecipientInfoList: js.UndefOr[BouncedRecipientInfoList] = js.undefined,
      OriginalMessageId: js.UndefOr[MessageId] = js.undefined,
      BounceSenderArn: js.UndefOr[AmazonResourceName] = js.undefined,
      Explanation: js.UndefOr[Explanation] = js.undefined
    ): SendBounceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MessageDsn" -> MessageDsn.map { x => x: js.Any }),
        ("BounceSender" -> BounceSender.map { x => x: js.Any }),
        ("BouncedRecipientInfoList" -> BouncedRecipientInfoList.map { x => x: js.Any }),
        ("OriginalMessageId" -> OriginalMessageId.map { x => x: js.Any }),
        ("BounceSenderArn" -> BounceSenderArn.map { x => x: js.Any }),
        ("Explanation" -> Explanation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendBounceRequest]
    }
  }

  /**
   * <p>Represents a unique message ID.</p>
   */
  @js.native
  trait SendBounceResponse extends js.Object {
    var MessageId: MessageId
  }

  object SendBounceResponse {
    def apply(
      MessageId: js.UndefOr[MessageId] = js.undefined
    ): SendBounceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MessageId" -> MessageId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendBounceResponse]
    }
  }

  /**
   * <p>Represents sending statistics data. Each <code>SendDataPoint</code> contains statistics for a 15-minute period of sending activity. </p>
   */
  @js.native
  trait SendDataPoint extends js.Object {
    var Rejects: Counter
    var Bounces: Counter
    var Complaints: Counter
    var Timestamp: Timestamp
    var DeliveryAttempts: Counter
  }

  object SendDataPoint {
    def apply(
      Rejects: js.UndefOr[Counter] = js.undefined,
      Bounces: js.UndefOr[Counter] = js.undefined,
      Complaints: js.UndefOr[Counter] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      DeliveryAttempts: js.UndefOr[Counter] = js.undefined
    ): SendDataPoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Rejects" -> Rejects.map { x => x: js.Any }),
        ("Bounces" -> Bounces.map { x => x: js.Any }),
        ("Complaints" -> Complaints.map { x => x: js.Any }),
        ("Timestamp" -> Timestamp.map { x => x: js.Any }),
        ("DeliveryAttempts" -> DeliveryAttempts.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendDataPoint]
    }
  }

  /**
   * <p>Represents a request to send a single formatted email using Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SendEmailRequest extends js.Object {
    var ReplyToAddresses: AddressList
    var ReturnPathArn: AmazonResourceName
    var Source: Address
    var Tags: MessageTagList
    var Message: Message
    var ConfigurationSetName: ConfigurationSetName
    var SourceArn: AmazonResourceName
    var Destination: Destination
    var ReturnPath: Address
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
      ReturnPath: js.UndefOr[Address] = js.undefined
    ): SendEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReplyToAddresses" -> ReplyToAddresses.map { x => x: js.Any }),
        ("ReturnPathArn" -> ReturnPathArn.map { x => x: js.Any }),
        ("Source" -> Source.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("ConfigurationSetName" -> ConfigurationSetName.map { x => x: js.Any }),
        ("SourceArn" -> SourceArn.map { x => x: js.Any }),
        ("Destination" -> Destination.map { x => x: js.Any }),
        ("ReturnPath" -> ReturnPath.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendEmailRequest]
    }
  }

  /**
   * <p>Represents a unique message ID.</p>
   */
  @js.native
  trait SendEmailResponse extends js.Object {
    var MessageId: MessageId
  }

  object SendEmailResponse {
    def apply(
      MessageId: js.UndefOr[MessageId] = js.undefined
    ): SendEmailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MessageId" -> MessageId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendEmailResponse]
    }
  }

  /**
   * <p>Represents a request to send a single raw email using Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SendRawEmailRequest extends js.Object {
    var FromArn: AmazonResourceName
    var Destinations: AddressList
    var ReturnPathArn: AmazonResourceName
    var RawMessage: RawMessage
    var Source: Address
    var Tags: MessageTagList
    var ConfigurationSetName: ConfigurationSetName
    var SourceArn: AmazonResourceName
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
      SourceArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): SendRawEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FromArn" -> FromArn.map { x => x: js.Any }),
        ("Destinations" -> Destinations.map { x => x: js.Any }),
        ("ReturnPathArn" -> ReturnPathArn.map { x => x: js.Any }),
        ("RawMessage" -> RawMessage.map { x => x: js.Any }),
        ("Source" -> Source.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("ConfigurationSetName" -> ConfigurationSetName.map { x => x: js.Any }),
        ("SourceArn" -> SourceArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendRawEmailRequest]
    }
  }

  /**
   * <p>Represents a unique message ID.</p>
   */
  @js.native
  trait SendRawEmailResponse extends js.Object {
    var MessageId: MessageId
  }

  object SendRawEmailResponse {
    def apply(
      MessageId: js.UndefOr[MessageId] = js.undefined
    ): SendRawEmailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MessageId" -> MessageId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendRawEmailResponse]
    }
  }

  /**
   * <p>Represents a request to set a receipt rule set as the active receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetActiveReceiptRuleSetRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
  }

  object SetActiveReceiptRuleSetRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined
    ): SetActiveReceiptRuleSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RuleSetName" -> RuleSetName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): SetActiveReceiptRuleSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetActiveReceiptRuleSetResponse]
    }
  }

  /**
   * <p>Represents a request to enable or disable Amazon SES Easy DKIM signing for an identity. For more information about setting up Easy DKIM, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetIdentityDkimEnabledRequest extends js.Object {
    var Identity: Identity
    var DkimEnabled: Enabled
  }

  object SetIdentityDkimEnabledRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      DkimEnabled: js.UndefOr[Enabled] = js.undefined
    ): SetIdentityDkimEnabledRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identity" -> Identity.map { x => x: js.Any }),
        ("DkimEnabled" -> DkimEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): SetIdentityDkimEnabledResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityDkimEnabledResponse]
    }
  }

  /**
   * <p>Represents a request to enable or disable whether Amazon SES forwards you bounce and complaint notifications through email. For information about email feedback forwarding, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-email.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetIdentityFeedbackForwardingEnabledRequest extends js.Object {
    var Identity: Identity
    var ForwardingEnabled: Enabled
  }

  object SetIdentityFeedbackForwardingEnabledRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      ForwardingEnabled: js.UndefOr[Enabled] = js.undefined
    ): SetIdentityFeedbackForwardingEnabledRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identity" -> Identity.map { x => x: js.Any }),
        ("ForwardingEnabled" -> ForwardingEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): SetIdentityFeedbackForwardingEnabledResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityFeedbackForwardingEnabledResponse]
    }
  }

  /**
   * <p>Represents a request to set whether Amazon SES includes the original email headers in the Amazon SNS notifications of a specified type. For information about notifications, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetIdentityHeadersInNotificationsEnabledRequest extends js.Object {
    var Identity: Identity
    var NotificationType: NotificationType
    var Enabled: Enabled
  }

  object SetIdentityHeadersInNotificationsEnabledRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      NotificationType: js.UndefOr[NotificationType] = js.undefined,
      Enabled: js.UndefOr[Enabled] = js.undefined
    ): SetIdentityHeadersInNotificationsEnabledRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identity" -> Identity.map { x => x: js.Any }),
        ("NotificationType" -> NotificationType.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): SetIdentityHeadersInNotificationsEnabledResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityHeadersInNotificationsEnabledResponse]
    }
  }

  /**
   * <p>Represents a request to enable or disable the Amazon SES custom MAIL FROM domain setup for a verified identity. For information about using a custom MAIL FROM domain, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetIdentityMailFromDomainRequest extends js.Object {
    var Identity: Identity
    var MailFromDomain: MailFromDomainName
    var BehaviorOnMXFailure: BehaviorOnMXFailure
  }

  object SetIdentityMailFromDomainRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      MailFromDomain: js.UndefOr[MailFromDomainName] = js.undefined,
      BehaviorOnMXFailure: js.UndefOr[BehaviorOnMXFailure] = js.undefined
    ): SetIdentityMailFromDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identity" -> Identity.map { x => x: js.Any }),
        ("MailFromDomain" -> MailFromDomain.map { x => x: js.Any }),
        ("BehaviorOnMXFailure" -> BehaviorOnMXFailure.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): SetIdentityMailFromDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityMailFromDomainResponse]
    }
  }

  /**
   * <p>Represents a request to specify the Amazon SNS topic to which Amazon SES will publish bounce, complaint, or delivery notifications for emails sent with that identity as the Source. For information about Amazon SES notifications, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetIdentityNotificationTopicRequest extends js.Object {
    var Identity: Identity
    var NotificationType: NotificationType
    var SnsTopic: NotificationTopic
  }

  object SetIdentityNotificationTopicRequest {
    def apply(
      Identity: js.UndefOr[Identity] = js.undefined,
      NotificationType: js.UndefOr[NotificationType] = js.undefined,
      SnsTopic: js.UndefOr[NotificationTopic] = js.undefined
    ): SetIdentityNotificationTopicRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Identity" -> Identity.map { x => x: js.Any }),
        ("NotificationType" -> NotificationType.map { x => x: js.Any }),
        ("SnsTopic" -> SnsTopic.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): SetIdentityNotificationTopicResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityNotificationTopicResponse]
    }
  }

  /**
   * <p>Represents a request to set the position of a receipt rule in a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait SetReceiptRulePositionRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
    var RuleName: ReceiptRuleName
    var After: ReceiptRuleName
  }

  object SetReceiptRulePositionRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      RuleName: js.UndefOr[ReceiptRuleName] = js.undefined,
      After: js.UndefOr[ReceiptRuleName] = js.undefined
    ): SetReceiptRulePositionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RuleSetName" -> RuleSetName.map { x => x: js.Any }),
        ("RuleName" -> RuleName.map { x => x: js.Any }),
        ("After" -> After.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): SetReceiptRulePositionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetReceiptRulePositionResponse]
    }
  }

  /**
   * <p>When included in a receipt rule, this action terminates the evaluation of the receipt rule set and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).</p> <p>For information about setting a stop action in a receipt rule, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-stop.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait StopAction extends js.Object {
    var Scope: StopScope
    var TopicArn: AmazonResourceName
  }

  object StopAction {
    def apply(
      Scope: js.UndefOr[StopScope] = js.undefined,
      TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): StopAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Scope" -> Scope.map { x => x: js.Any }),
        ("TopicArn" -> TopicArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopAction]
    }
  }


  object StopScopeEnum {
    val RuleSet = "RuleSet"

    val values = IndexedSeq(RuleSet)
  }


  object TlsPolicyEnum {
    val Require = "Require"
    val Optional = "Optional"

    val values = IndexedSeq(Require, Optional)
  }

  /**
   * <p>Represents a request to update the event destination of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestination: EventDestination
  }

  object UpdateConfigurationSetEventDestinationRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      EventDestination: js.UndefOr[EventDestination] = js.undefined
    ): UpdateConfigurationSetEventDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationSetName" -> ConfigurationSetName.map { x => x: js.Any }),
        ("EventDestination" -> EventDestination.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): UpdateConfigurationSetEventDestinationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConfigurationSetEventDestinationResponse]
    }
  }

  /**
   * <p>Represents a request to update a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait UpdateReceiptRuleRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
    var Rule: ReceiptRule
  }

  object UpdateReceiptRuleRequest {
    def apply(
      RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined,
      Rule: js.UndefOr[ReceiptRule] = js.undefined
    ): UpdateReceiptRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RuleSetName" -> RuleSetName.map { x => x: js.Any }),
        ("Rule" -> Rule.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): UpdateReceiptRuleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateReceiptRuleResponse]
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
    var Domain: Domain
  }

  object VerifyDomainDkimRequest {
    def apply(
      Domain: js.UndefOr[Domain] = js.undefined
    ): VerifyDomainDkimRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Domain" -> Domain.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyDomainDkimRequest]
    }
  }

  /**
   * <p>Returns CNAME records that you must publish to the DNS server of your domain to set up Easy DKIM with Amazon SES.</p>
   */
  @js.native
  trait VerifyDomainDkimResponse extends js.Object {
    var DkimTokens: VerificationTokenList
  }

  object VerifyDomainDkimResponse {
    def apply(
      DkimTokens: js.UndefOr[VerificationTokenList] = js.undefined
    ): VerifyDomainDkimResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DkimTokens" -> DkimTokens.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyDomainDkimResponse]
    }
  }

  /**
   * <p>Represents a request to begin Amazon SES domain verification and to generate the TXT records that you must publish to the DNS server of your domain to complete the verification. For information about domain verification, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait VerifyDomainIdentityRequest extends js.Object {
    var Domain: Domain
  }

  object VerifyDomainIdentityRequest {
    def apply(
      Domain: js.UndefOr[Domain] = js.undefined
    ): VerifyDomainIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Domain" -> Domain.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyDomainIdentityRequest]
    }
  }

  /**
   * <p>Returns a TXT record that you must publish to the DNS server of your domain to complete domain verification with Amazon SES.</p>
   */
  @js.native
  trait VerifyDomainIdentityResponse extends js.Object {
    var VerificationToken: VerificationToken
  }

  object VerifyDomainIdentityResponse {
    def apply(
      VerificationToken: js.UndefOr[VerificationToken] = js.undefined
    ): VerifyDomainIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VerificationToken" -> VerificationToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyDomainIdentityResponse]
    }
  }

  /**
   * <p>Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait VerifyEmailAddressRequest extends js.Object {
    var EmailAddress: Address
  }

  object VerifyEmailAddressRequest {
    def apply(
      EmailAddress: js.UndefOr[Address] = js.undefined
    ): VerifyEmailAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EmailAddress" -> EmailAddress.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyEmailAddressRequest]
    }
  }

  /**
   * <p>Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait VerifyEmailIdentityRequest extends js.Object {
    var EmailAddress: Address
  }

  object VerifyEmailIdentityRequest {
    def apply(
      EmailAddress: js.UndefOr[Address] = js.undefined
    ): VerifyEmailIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EmailAddress" -> EmailAddress.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): VerifyEmailIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VerifyEmailIdentityResponse]
    }
  }

  /**
   * <p>When included in a receipt rule, this action calls Amazon WorkMail and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS). You will typically not use this action directly because Amazon WorkMail adds the rule automatically during its setup procedure.</p> <p>For information using a receipt rule to call Amazon WorkMail, see the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-workmail.html">Amazon SES Developer Guide</a>.</p>
   */
  @js.native
  trait WorkmailAction extends js.Object {
    var TopicArn: AmazonResourceName
    var OrganizationArn: AmazonResourceName
  }

  object WorkmailAction {
    def apply(
      TopicArn: js.UndefOr[AmazonResourceName] = js.undefined,
      OrganizationArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): WorkmailAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("OrganizationArn" -> OrganizationArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkmailAction]
    }
  }
}
