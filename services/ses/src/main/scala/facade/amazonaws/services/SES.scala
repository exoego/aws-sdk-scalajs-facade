package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object ses {
  type Address                           = String
  type AddressList                       = js.Array[Address]
  type AmazonResourceName                = String
  type ArrivalDate                       = js.Date
  type BehaviorOnMXFailure               = String
  type BounceMessage                     = String
  type BounceSmtpReplyCode               = String
  type BounceStatusCode                  = String
  type BounceType                        = String
  type BouncedRecipientInfoList          = js.Array[BouncedRecipientInfo]
  type BulkEmailDestinationList          = js.Array[BulkEmailDestination]
  type BulkEmailDestinationStatusList    = js.Array[BulkEmailDestinationStatus]
  type BulkEmailStatus                   = String
  type Charset                           = String
  type Cidr                              = String
  type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]
  type ConfigurationSetAttribute         = String
  type ConfigurationSetAttributeList     = js.Array[ConfigurationSetAttribute]
  type ConfigurationSetName              = String
  type ConfigurationSets                 = js.Array[ConfigurationSet]
  type Counter                           = Double
  type CustomMailFromStatus              = String
  type CustomRedirectDomain              = String
  type CustomVerificationEmailTemplates  = js.Array[CustomVerificationEmailTemplate]
  type DefaultDimensionValue             = String
  type DiagnosticCode                    = String
  type DimensionName                     = String
  type DimensionValueSource              = String
  type DkimAttributes                    = js.Dictionary[IdentityDkimAttributes]
  type Domain                            = String
  type DsnAction                         = String
  type DsnStatus                         = String
  type Enabled                           = Boolean
  type Error                             = String
  type EventDestinationName              = String
  type EventDestinations                 = js.Array[EventDestination]
  type EventType                         = String
  type EventTypes                        = js.Array[EventType]
  type Explanation                       = String
  type ExtensionFieldList                = js.Array[ExtensionField]
  type ExtensionFieldName                = String
  type ExtensionFieldValue               = String
  type FailureRedirectionURL             = String
  type FromAddress                       = String
  type HeaderName                        = String
  type HeaderValue                       = String
  type HtmlPart                          = String
  type Identity                          = String
  type IdentityList                      = js.Array[Identity]
  type IdentityType                      = String
  type InvocationType                    = String
  type LastAttemptDate                   = js.Date
  type LastFreshStart                    = js.Date
  type MailFromDomainAttributes          = js.Dictionary[IdentityMailFromDomainAttributes]
  type MailFromDomainName                = String
  type Max24HourSend                     = Double
  type MaxItems                          = Int
  type MaxResults                        = Int
  type MaxSendRate                       = Double
  type MessageData                       = String
  type MessageId                         = String
  type MessageTagList                    = js.Array[MessageTag]
  type MessageTagName                    = String
  type MessageTagValue                   = String
  type NextToken                         = String
  type NotificationAttributes            = js.Dictionary[IdentityNotificationAttributes]
  type NotificationTopic                 = String
  type NotificationType                  = String
  type Policy                            = String
  type PolicyMap                         = js.Dictionary[Policy]
  type PolicyName                        = String
  type PolicyNameList                    = js.Array[PolicyName]
  type RawMessageData =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ReceiptActionsList     = js.Array[ReceiptAction]
  type ReceiptFilterList      = js.Array[ReceiptFilter]
  type ReceiptFilterName      = String
  type ReceiptFilterPolicy    = String
  type ReceiptRuleName        = String
  type ReceiptRuleNamesList   = js.Array[ReceiptRuleName]
  type ReceiptRuleSetName     = String
  type ReceiptRuleSetsLists   = js.Array[ReceiptRuleSetMetadata]
  type ReceiptRulesList       = js.Array[ReceiptRule]
  type Recipient              = String
  type RecipientsList         = js.Array[Recipient]
  type RemoteMta              = String
  type RenderedTemplate       = String
  type ReportingMta           = String
  type S3BucketName           = String
  type S3KeyPrefix            = String
  type SNSActionEncoding      = String
  type SendDataPointList      = js.Array[SendDataPoint]
  type SentLast24Hours        = Double
  type StopScope              = String
  type Subject                = String
  type SubjectPart            = String
  type SuccessRedirectionURL  = String
  type TemplateContent        = String
  type TemplateData           = String
  type TemplateMetadataList   = js.Array[TemplateMetadata]
  type TemplateName           = String
  type TextPart               = String
  type Timestamp              = js.Date
  type TlsPolicy              = String
  type VerificationAttributes = js.Dictionary[IdentityVerificationAttributes]
  type VerificationStatus     = String
  type VerificationToken      = String
  type VerificationTokenList  = js.Array[VerificationToken]

  implicit final class SESOps(val service: SES) extends AnyVal {

    def cloneReceiptRuleSetFuture(params: CloneReceiptRuleSetRequest): Future[CloneReceiptRuleSetResponse] =
      service.cloneReceiptRuleSet(params).promise.toFuture
    def createConfigurationSetEventDestinationFuture(
        params: CreateConfigurationSetEventDestinationRequest
    ): Future[CreateConfigurationSetEventDestinationResponse] =
      service.createConfigurationSetEventDestination(params).promise.toFuture
    def createConfigurationSetFuture(params: CreateConfigurationSetRequest): Future[CreateConfigurationSetResponse] =
      service.createConfigurationSet(params).promise.toFuture
    def createConfigurationSetTrackingOptionsFuture(
        params: CreateConfigurationSetTrackingOptionsRequest
    ): Future[CreateConfigurationSetTrackingOptionsResponse] =
      service.createConfigurationSetTrackingOptions(params).promise.toFuture
    def createCustomVerificationEmailTemplateFuture(
        params: CreateCustomVerificationEmailTemplateRequest
    ): Future[js.Object] = service.createCustomVerificationEmailTemplate(params).promise.toFuture
    def createReceiptFilterFuture(params: CreateReceiptFilterRequest): Future[CreateReceiptFilterResponse] =
      service.createReceiptFilter(params).promise.toFuture
    def createReceiptRuleFuture(params: CreateReceiptRuleRequest): Future[CreateReceiptRuleResponse] =
      service.createReceiptRule(params).promise.toFuture
    def createReceiptRuleSetFuture(params: CreateReceiptRuleSetRequest): Future[CreateReceiptRuleSetResponse] =
      service.createReceiptRuleSet(params).promise.toFuture
    def createTemplateFuture(params: CreateTemplateRequest): Future[CreateTemplateResponse] =
      service.createTemplate(params).promise.toFuture
    def deleteConfigurationSetEventDestinationFuture(
        params: DeleteConfigurationSetEventDestinationRequest
    ): Future[DeleteConfigurationSetEventDestinationResponse] =
      service.deleteConfigurationSetEventDestination(params).promise.toFuture
    def deleteConfigurationSetFuture(params: DeleteConfigurationSetRequest): Future[DeleteConfigurationSetResponse] =
      service.deleteConfigurationSet(params).promise.toFuture
    def deleteConfigurationSetTrackingOptionsFuture(
        params: DeleteConfigurationSetTrackingOptionsRequest
    ): Future[DeleteConfigurationSetTrackingOptionsResponse] =
      service.deleteConfigurationSetTrackingOptions(params).promise.toFuture
    def deleteCustomVerificationEmailTemplateFuture(
        params: DeleteCustomVerificationEmailTemplateRequest
    ): Future[js.Object] = service.deleteCustomVerificationEmailTemplate(params).promise.toFuture
    def deleteIdentityFuture(params: DeleteIdentityRequest): Future[DeleteIdentityResponse] =
      service.deleteIdentity(params).promise.toFuture
    def deleteIdentityPolicyFuture(params: DeleteIdentityPolicyRequest): Future[DeleteIdentityPolicyResponse] =
      service.deleteIdentityPolicy(params).promise.toFuture
    def deleteReceiptFilterFuture(params: DeleteReceiptFilterRequest): Future[DeleteReceiptFilterResponse] =
      service.deleteReceiptFilter(params).promise.toFuture
    def deleteReceiptRuleFuture(params: DeleteReceiptRuleRequest): Future[DeleteReceiptRuleResponse] =
      service.deleteReceiptRule(params).promise.toFuture
    def deleteReceiptRuleSetFuture(params: DeleteReceiptRuleSetRequest): Future[DeleteReceiptRuleSetResponse] =
      service.deleteReceiptRuleSet(params).promise.toFuture
    def deleteTemplateFuture(params: DeleteTemplateRequest): Future[DeleteTemplateResponse] =
      service.deleteTemplate(params).promise.toFuture
    def deleteVerifiedEmailAddressFuture(params: DeleteVerifiedEmailAddressRequest): Future[js.Object] =
      service.deleteVerifiedEmailAddress(params).promise.toFuture
    def describeActiveReceiptRuleSetFuture(
        params: DescribeActiveReceiptRuleSetRequest
    ): Future[DescribeActiveReceiptRuleSetResponse] = service.describeActiveReceiptRuleSet(params).promise.toFuture
    def describeConfigurationSetFuture(
        params: DescribeConfigurationSetRequest
    ): Future[DescribeConfigurationSetResponse] = service.describeConfigurationSet(params).promise.toFuture
    def describeReceiptRuleFuture(params: DescribeReceiptRuleRequest): Future[DescribeReceiptRuleResponse] =
      service.describeReceiptRule(params).promise.toFuture
    def describeReceiptRuleSetFuture(params: DescribeReceiptRuleSetRequest): Future[DescribeReceiptRuleSetResponse] =
      service.describeReceiptRuleSet(params).promise.toFuture
    def getAccountSendingEnabledFuture(): Future[GetAccountSendingEnabledResponse] =
      service.getAccountSendingEnabled().promise.toFuture
    def getCustomVerificationEmailTemplateFuture(
        params: GetCustomVerificationEmailTemplateRequest
    ): Future[GetCustomVerificationEmailTemplateResponse] =
      service.getCustomVerificationEmailTemplate(params).promise.toFuture
    def getIdentityDkimAttributesFuture(
        params: GetIdentityDkimAttributesRequest
    ): Future[GetIdentityDkimAttributesResponse] = service.getIdentityDkimAttributes(params).promise.toFuture
    def getIdentityMailFromDomainAttributesFuture(
        params: GetIdentityMailFromDomainAttributesRequest
    ): Future[GetIdentityMailFromDomainAttributesResponse] =
      service.getIdentityMailFromDomainAttributes(params).promise.toFuture
    def getIdentityNotificationAttributesFuture(
        params: GetIdentityNotificationAttributesRequest
    ): Future[GetIdentityNotificationAttributesResponse] =
      service.getIdentityNotificationAttributes(params).promise.toFuture
    def getIdentityPoliciesFuture(params: GetIdentityPoliciesRequest): Future[GetIdentityPoliciesResponse] =
      service.getIdentityPolicies(params).promise.toFuture
    def getIdentityVerificationAttributesFuture(
        params: GetIdentityVerificationAttributesRequest
    ): Future[GetIdentityVerificationAttributesResponse] =
      service.getIdentityVerificationAttributes(params).promise.toFuture
    def getSendQuotaFuture(): Future[GetSendQuotaResponse]           = service.getSendQuota().promise.toFuture
    def getSendStatisticsFuture(): Future[GetSendStatisticsResponse] = service.getSendStatistics().promise.toFuture
    def getTemplateFuture(params: GetTemplateRequest): Future[GetTemplateResponse] =
      service.getTemplate(params).promise.toFuture
    def listConfigurationSetsFuture(params: ListConfigurationSetsRequest): Future[ListConfigurationSetsResponse] =
      service.listConfigurationSets(params).promise.toFuture
    def listCustomVerificationEmailTemplatesFuture(
        params: ListCustomVerificationEmailTemplatesRequest
    ): Future[ListCustomVerificationEmailTemplatesResponse] =
      service.listCustomVerificationEmailTemplates(params).promise.toFuture
    def listIdentitiesFuture(params: ListIdentitiesRequest): Future[ListIdentitiesResponse] =
      service.listIdentities(params).promise.toFuture
    def listIdentityPoliciesFuture(params: ListIdentityPoliciesRequest): Future[ListIdentityPoliciesResponse] =
      service.listIdentityPolicies(params).promise.toFuture
    def listReceiptFiltersFuture(params: ListReceiptFiltersRequest): Future[ListReceiptFiltersResponse] =
      service.listReceiptFilters(params).promise.toFuture
    def listReceiptRuleSetsFuture(params: ListReceiptRuleSetsRequest): Future[ListReceiptRuleSetsResponse] =
      service.listReceiptRuleSets(params).promise.toFuture
    def listTemplatesFuture(params: ListTemplatesRequest): Future[ListTemplatesResponse] =
      service.listTemplates(params).promise.toFuture
    def listVerifiedEmailAddressesFuture(): Future[ListVerifiedEmailAddressesResponse] =
      service.listVerifiedEmailAddresses().promise.toFuture
    def putConfigurationSetDeliveryOptionsFuture(
        params: PutConfigurationSetDeliveryOptionsRequest
    ): Future[PutConfigurationSetDeliveryOptionsResponse] =
      service.putConfigurationSetDeliveryOptions(params).promise.toFuture
    def putIdentityPolicyFuture(params: PutIdentityPolicyRequest): Future[PutIdentityPolicyResponse] =
      service.putIdentityPolicy(params).promise.toFuture
    def reorderReceiptRuleSetFuture(params: ReorderReceiptRuleSetRequest): Future[ReorderReceiptRuleSetResponse] =
      service.reorderReceiptRuleSet(params).promise.toFuture
    def sendBounceFuture(params: SendBounceRequest): Future[SendBounceResponse] =
      service.sendBounce(params).promise.toFuture
    def sendBulkTemplatedEmailFuture(params: SendBulkTemplatedEmailRequest): Future[SendBulkTemplatedEmailResponse] =
      service.sendBulkTemplatedEmail(params).promise.toFuture
    def sendCustomVerificationEmailFuture(
        params: SendCustomVerificationEmailRequest
    ): Future[SendCustomVerificationEmailResponse] = service.sendCustomVerificationEmail(params).promise.toFuture
    def sendEmailFuture(params: SendEmailRequest): Future[SendEmailResponse] =
      service.sendEmail(params).promise.toFuture
    def sendRawEmailFuture(params: SendRawEmailRequest): Future[SendRawEmailResponse] =
      service.sendRawEmail(params).promise.toFuture
    def sendTemplatedEmailFuture(params: SendTemplatedEmailRequest): Future[SendTemplatedEmailResponse] =
      service.sendTemplatedEmail(params).promise.toFuture
    def setActiveReceiptRuleSetFuture(params: SetActiveReceiptRuleSetRequest): Future[SetActiveReceiptRuleSetResponse] =
      service.setActiveReceiptRuleSet(params).promise.toFuture
    def setIdentityDkimEnabledFuture(params: SetIdentityDkimEnabledRequest): Future[SetIdentityDkimEnabledResponse] =
      service.setIdentityDkimEnabled(params).promise.toFuture
    def setIdentityFeedbackForwardingEnabledFuture(
        params: SetIdentityFeedbackForwardingEnabledRequest
    ): Future[SetIdentityFeedbackForwardingEnabledResponse] =
      service.setIdentityFeedbackForwardingEnabled(params).promise.toFuture
    def setIdentityHeadersInNotificationsEnabledFuture(
        params: SetIdentityHeadersInNotificationsEnabledRequest
    ): Future[SetIdentityHeadersInNotificationsEnabledResponse] =
      service.setIdentityHeadersInNotificationsEnabled(params).promise.toFuture
    def setIdentityMailFromDomainFuture(
        params: SetIdentityMailFromDomainRequest
    ): Future[SetIdentityMailFromDomainResponse] = service.setIdentityMailFromDomain(params).promise.toFuture
    def setIdentityNotificationTopicFuture(
        params: SetIdentityNotificationTopicRequest
    ): Future[SetIdentityNotificationTopicResponse] = service.setIdentityNotificationTopic(params).promise.toFuture
    def setReceiptRulePositionFuture(params: SetReceiptRulePositionRequest): Future[SetReceiptRulePositionResponse] =
      service.setReceiptRulePosition(params).promise.toFuture
    def testRenderTemplateFuture(params: TestRenderTemplateRequest): Future[TestRenderTemplateResponse] =
      service.testRenderTemplate(params).promise.toFuture
    def updateAccountSendingEnabledFuture(params: UpdateAccountSendingEnabledRequest): Future[js.Object] =
      service.updateAccountSendingEnabled(params).promise.toFuture
    def updateConfigurationSetEventDestinationFuture(
        params: UpdateConfigurationSetEventDestinationRequest
    ): Future[UpdateConfigurationSetEventDestinationResponse] =
      service.updateConfigurationSetEventDestination(params).promise.toFuture
    def updateConfigurationSetReputationMetricsEnabledFuture(
        params: UpdateConfigurationSetReputationMetricsEnabledRequest
    ): Future[js.Object] = service.updateConfigurationSetReputationMetricsEnabled(params).promise.toFuture
    def updateConfigurationSetSendingEnabledFuture(
        params: UpdateConfigurationSetSendingEnabledRequest
    ): Future[js.Object] = service.updateConfigurationSetSendingEnabled(params).promise.toFuture
    def updateConfigurationSetTrackingOptionsFuture(
        params: UpdateConfigurationSetTrackingOptionsRequest
    ): Future[UpdateConfigurationSetTrackingOptionsResponse] =
      service.updateConfigurationSetTrackingOptions(params).promise.toFuture
    def updateCustomVerificationEmailTemplateFuture(
        params: UpdateCustomVerificationEmailTemplateRequest
    ): Future[js.Object] = service.updateCustomVerificationEmailTemplate(params).promise.toFuture
    def updateReceiptRuleFuture(params: UpdateReceiptRuleRequest): Future[UpdateReceiptRuleResponse] =
      service.updateReceiptRule(params).promise.toFuture
    def updateTemplateFuture(params: UpdateTemplateRequest): Future[UpdateTemplateResponse] =
      service.updateTemplate(params).promise.toFuture
    def verifyDomainDkimFuture(params: VerifyDomainDkimRequest): Future[VerifyDomainDkimResponse] =
      service.verifyDomainDkim(params).promise.toFuture
    def verifyDomainIdentityFuture(params: VerifyDomainIdentityRequest): Future[VerifyDomainIdentityResponse] =
      service.verifyDomainIdentity(params).promise.toFuture
    def verifyEmailAddressFuture(params: VerifyEmailAddressRequest): Future[js.Object] =
      service.verifyEmailAddress(params).promise.toFuture
    def verifyEmailIdentityFuture(params: VerifyEmailIdentityRequest): Future[VerifyEmailIdentityResponse] =
      service.verifyEmailIdentity(params).promise.toFuture
  }
}

package ses {
  @js.native
  @JSImport("aws-sdk", "SES")
  class SES() extends js.Object {
    def this(config: AWSConfig) = this()

    def cloneReceiptRuleSet(params: CloneReceiptRuleSetRequest): Request[CloneReceiptRuleSetResponse] = js.native
    def createConfigurationSet(params: CreateConfigurationSetRequest): Request[CreateConfigurationSetResponse] =
      js.native
    def createConfigurationSetEventDestination(
        params: CreateConfigurationSetEventDestinationRequest
    ): Request[CreateConfigurationSetEventDestinationResponse] = js.native
    def createConfigurationSetTrackingOptions(
        params: CreateConfigurationSetTrackingOptionsRequest
    ): Request[CreateConfigurationSetTrackingOptionsResponse] = js.native
    def createCustomVerificationEmailTemplate(
        params: CreateCustomVerificationEmailTemplateRequest
    ): Request[js.Object]                                                                                = js.native
    def createReceiptFilter(params: CreateReceiptFilterRequest): Request[CreateReceiptFilterResponse]    = js.native
    def createReceiptRule(params: CreateReceiptRuleRequest): Request[CreateReceiptRuleResponse]          = js.native
    def createReceiptRuleSet(params: CreateReceiptRuleSetRequest): Request[CreateReceiptRuleSetResponse] = js.native
    def createTemplate(params: CreateTemplateRequest): Request[CreateTemplateResponse]                   = js.native
    def deleteConfigurationSet(params: DeleteConfigurationSetRequest): Request[DeleteConfigurationSetResponse] =
      js.native
    def deleteConfigurationSetEventDestination(
        params: DeleteConfigurationSetEventDestinationRequest
    ): Request[DeleteConfigurationSetEventDestinationResponse] = js.native
    def deleteConfigurationSetTrackingOptions(
        params: DeleteConfigurationSetTrackingOptionsRequest
    ): Request[DeleteConfigurationSetTrackingOptionsResponse] = js.native
    def deleteCustomVerificationEmailTemplate(
        params: DeleteCustomVerificationEmailTemplateRequest
    ): Request[js.Object]                                                                                = js.native
    def deleteIdentity(params: DeleteIdentityRequest): Request[DeleteIdentityResponse]                   = js.native
    def deleteIdentityPolicy(params: DeleteIdentityPolicyRequest): Request[DeleteIdentityPolicyResponse] = js.native
    def deleteReceiptFilter(params: DeleteReceiptFilterRequest): Request[DeleteReceiptFilterResponse]    = js.native
    def deleteReceiptRule(params: DeleteReceiptRuleRequest): Request[DeleteReceiptRuleResponse]          = js.native
    def deleteReceiptRuleSet(params: DeleteReceiptRuleSetRequest): Request[DeleteReceiptRuleSetResponse] = js.native
    def deleteTemplate(params: DeleteTemplateRequest): Request[DeleteTemplateResponse]                   = js.native
    def deleteVerifiedEmailAddress(params: DeleteVerifiedEmailAddressRequest): Request[js.Object]        = js.native
    def describeActiveReceiptRuleSet(
        params: DescribeActiveReceiptRuleSetRequest
    ): Request[DescribeActiveReceiptRuleSetResponse] = js.native
    def describeConfigurationSet(params: DescribeConfigurationSetRequest): Request[DescribeConfigurationSetResponse] =
      js.native
    def describeReceiptRule(params: DescribeReceiptRuleRequest): Request[DescribeReceiptRuleResponse] = js.native
    def describeReceiptRuleSet(params: DescribeReceiptRuleSetRequest): Request[DescribeReceiptRuleSetResponse] =
      js.native
    def getAccountSendingEnabled(): Request[GetAccountSendingEnabledResponse] = js.native
    def getCustomVerificationEmailTemplate(
        params: GetCustomVerificationEmailTemplateRequest
    ): Request[GetCustomVerificationEmailTemplateResponse] = js.native
    def getIdentityDkimAttributes(
        params: GetIdentityDkimAttributesRequest
    ): Request[GetIdentityDkimAttributesResponse] = js.native
    def getIdentityMailFromDomainAttributes(
        params: GetIdentityMailFromDomainAttributesRequest
    ): Request[GetIdentityMailFromDomainAttributesResponse] = js.native
    def getIdentityNotificationAttributes(
        params: GetIdentityNotificationAttributesRequest
    ): Request[GetIdentityNotificationAttributesResponse]                                             = js.native
    def getIdentityPolicies(params: GetIdentityPoliciesRequest): Request[GetIdentityPoliciesResponse] = js.native
    def getIdentityVerificationAttributes(
        params: GetIdentityVerificationAttributesRequest
    ): Request[GetIdentityVerificationAttributesResponse]                                                   = js.native
    def getSendQuota(): Request[GetSendQuotaResponse]                                                       = js.native
    def getSendStatistics(): Request[GetSendStatisticsResponse]                                             = js.native
    def getTemplate(params: GetTemplateRequest): Request[GetTemplateResponse]                               = js.native
    def listConfigurationSets(params: ListConfigurationSetsRequest): Request[ListConfigurationSetsResponse] = js.native
    def listCustomVerificationEmailTemplates(
        params: ListCustomVerificationEmailTemplatesRequest
    ): Request[ListCustomVerificationEmailTemplatesResponse]                                             = js.native
    def listIdentities(params: ListIdentitiesRequest): Request[ListIdentitiesResponse]                   = js.native
    def listIdentityPolicies(params: ListIdentityPoliciesRequest): Request[ListIdentityPoliciesResponse] = js.native
    def listReceiptFilters(params: ListReceiptFiltersRequest): Request[ListReceiptFiltersResponse]       = js.native
    def listReceiptRuleSets(params: ListReceiptRuleSetsRequest): Request[ListReceiptRuleSetsResponse]    = js.native
    def listTemplates(params: ListTemplatesRequest): Request[ListTemplatesResponse]                      = js.native
    def listVerifiedEmailAddresses(): Request[ListVerifiedEmailAddressesResponse]                        = js.native
    def putConfigurationSetDeliveryOptions(
        params: PutConfigurationSetDeliveryOptionsRequest
    ): Request[PutConfigurationSetDeliveryOptionsResponse]                                                  = js.native
    def putIdentityPolicy(params: PutIdentityPolicyRequest): Request[PutIdentityPolicyResponse]             = js.native
    def reorderReceiptRuleSet(params: ReorderReceiptRuleSetRequest): Request[ReorderReceiptRuleSetResponse] = js.native
    def sendBounce(params: SendBounceRequest): Request[SendBounceResponse]                                  = js.native
    def sendBulkTemplatedEmail(params: SendBulkTemplatedEmailRequest): Request[SendBulkTemplatedEmailResponse] =
      js.native
    def sendCustomVerificationEmail(
        params: SendCustomVerificationEmailRequest
    ): Request[SendCustomVerificationEmailResponse]                                                = js.native
    def sendEmail(params: SendEmailRequest): Request[SendEmailResponse]                            = js.native
    def sendRawEmail(params: SendRawEmailRequest): Request[SendRawEmailResponse]                   = js.native
    def sendTemplatedEmail(params: SendTemplatedEmailRequest): Request[SendTemplatedEmailResponse] = js.native
    def setActiveReceiptRuleSet(params: SetActiveReceiptRuleSetRequest): Request[SetActiveReceiptRuleSetResponse] =
      js.native
    def setIdentityDkimEnabled(params: SetIdentityDkimEnabledRequest): Request[SetIdentityDkimEnabledResponse] =
      js.native
    def setIdentityFeedbackForwardingEnabled(
        params: SetIdentityFeedbackForwardingEnabledRequest
    ): Request[SetIdentityFeedbackForwardingEnabledResponse] = js.native
    def setIdentityHeadersInNotificationsEnabled(
        params: SetIdentityHeadersInNotificationsEnabledRequest
    ): Request[SetIdentityHeadersInNotificationsEnabledResponse] = js.native
    def setIdentityMailFromDomain(
        params: SetIdentityMailFromDomainRequest
    ): Request[SetIdentityMailFromDomainResponse] = js.native
    def setIdentityNotificationTopic(
        params: SetIdentityNotificationTopicRequest
    ): Request[SetIdentityNotificationTopicResponse] = js.native
    def setReceiptRulePosition(params: SetReceiptRulePositionRequest): Request[SetReceiptRulePositionResponse] =
      js.native
    def testRenderTemplate(params: TestRenderTemplateRequest): Request[TestRenderTemplateResponse]  = js.native
    def updateAccountSendingEnabled(params: UpdateAccountSendingEnabledRequest): Request[js.Object] = js.native
    def updateConfigurationSetEventDestination(
        params: UpdateConfigurationSetEventDestinationRequest
    ): Request[UpdateConfigurationSetEventDestinationResponse] = js.native
    def updateConfigurationSetReputationMetricsEnabled(
        params: UpdateConfigurationSetReputationMetricsEnabledRequest
    ): Request[js.Object] = js.native
    def updateConfigurationSetSendingEnabled(params: UpdateConfigurationSetSendingEnabledRequest): Request[js.Object] =
      js.native
    def updateConfigurationSetTrackingOptions(
        params: UpdateConfigurationSetTrackingOptionsRequest
    ): Request[UpdateConfigurationSetTrackingOptionsResponse] = js.native
    def updateCustomVerificationEmailTemplate(
        params: UpdateCustomVerificationEmailTemplateRequest
    ): Request[js.Object]                                                                                = js.native
    def updateReceiptRule(params: UpdateReceiptRuleRequest): Request[UpdateReceiptRuleResponse]          = js.native
    def updateTemplate(params: UpdateTemplateRequest): Request[UpdateTemplateResponse]                   = js.native
    def verifyDomainDkim(params: VerifyDomainDkimRequest): Request[VerifyDomainDkimResponse]             = js.native
    def verifyDomainIdentity(params: VerifyDomainIdentityRequest): Request[VerifyDomainIdentityResponse] = js.native
    def verifyEmailAddress(params: VerifyEmailAddressRequest): Request[js.Object]                        = js.native
    def verifyEmailIdentity(params: VerifyEmailIdentityRequest): Request[VerifyEmailIdentityResponse]    = js.native
  }

  /**
    * When included in a receipt rule, this action adds a header to the received email.
    *  For information about adding a header using a receipt rule, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-add-header.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait AddHeaderAction extends js.Object {
    var HeaderName: HeaderName
    var HeaderValue: HeaderValue
  }

  object AddHeaderAction {
    def apply(
        HeaderName: HeaderName,
        HeaderValue: HeaderValue
    ): AddHeaderAction = {
      val __obj = js.Dictionary[js.Any](
        "HeaderName"  -> HeaderName.asInstanceOf[js.Any],
        "HeaderValue" -> HeaderValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddHeaderAction]
    }
  }

  object BehaviorOnMXFailureEnum {
    val UseDefaultValue = "UseDefaultValue"
    val RejectMessage   = "RejectMessage"

    val values = IndexedSeq(UseDefaultValue, RejectMessage)
  }

  /**
    * Represents the body of the message. You can specify text, HTML, or both. If you use both, then the message should display correctly in the widest variety of email clients.
    */
  @js.native
  trait Body extends js.Object {
    var Html: js.UndefOr[Content]
    var Text: js.UndefOr[Content]
  }

  object Body {
    def apply(
        Html: js.UndefOr[Content] = js.undefined,
        Text: js.UndefOr[Content] = js.undefined
    ): Body = {
      val __obj = js.Dictionary.empty[js.Any]
      Html.foreach(__v => __obj.update("Html", __v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.update("Text", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Body]
    }
  }

  /**
    * When included in a receipt rule, this action rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    *  For information about sending a bounce message in response to a received email, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-bounce.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait BounceAction extends js.Object {
    var Message: BounceMessage
    var Sender: Address
    var SmtpReplyCode: BounceSmtpReplyCode
    var StatusCode: js.UndefOr[BounceStatusCode]
    var TopicArn: js.UndefOr[AmazonResourceName]
  }

  object BounceAction {
    def apply(
        Message: BounceMessage,
        Sender: Address,
        SmtpReplyCode: BounceSmtpReplyCode,
        StatusCode: js.UndefOr[BounceStatusCode] = js.undefined,
        TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): BounceAction = {
      val __obj = js.Dictionary[js.Any](
        "Message"       -> Message.asInstanceOf[js.Any],
        "Sender"        -> Sender.asInstanceOf[js.Any],
        "SmtpReplyCode" -> SmtpReplyCode.asInstanceOf[js.Any]
      )

      StatusCode.foreach(__v => __obj.update("StatusCode", __v.asInstanceOf[js.Any]))
      TopicArn.foreach(__v => __obj.update("TopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BounceAction]
    }
  }

  object BounceTypeEnum {
    val DoesNotExist     = "DoesNotExist"
    val MessageTooLarge  = "MessageTooLarge"
    val ExceededQuota    = "ExceededQuota"
    val ContentRejected  = "ContentRejected"
    val Undefined        = "Undefined"
    val TemporaryFailure = "TemporaryFailure"

    val values = IndexedSeq(DoesNotExist, MessageTooLarge, ExceededQuota, ContentRejected, Undefined, TemporaryFailure)
  }

  /**
    * Recipient-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.
    *  For information about receiving email through Amazon SES, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait BouncedRecipientInfo extends js.Object {
    var Recipient: Address
    var BounceType: js.UndefOr[BounceType]
    var RecipientArn: js.UndefOr[AmazonResourceName]
    var RecipientDsnFields: js.UndefOr[RecipientDsnFields]
  }

  object BouncedRecipientInfo {
    def apply(
        Recipient: Address,
        BounceType: js.UndefOr[BounceType] = js.undefined,
        RecipientArn: js.UndefOr[AmazonResourceName] = js.undefined,
        RecipientDsnFields: js.UndefOr[RecipientDsnFields] = js.undefined
    ): BouncedRecipientInfo = {
      val __obj = js.Dictionary[js.Any](
        "Recipient" -> Recipient.asInstanceOf[js.Any]
      )

      BounceType.foreach(__v => __obj.update("BounceType", __v.asInstanceOf[js.Any]))
      RecipientArn.foreach(__v => __obj.update("RecipientArn", __v.asInstanceOf[js.Any]))
      RecipientDsnFields.foreach(__v => __obj.update("RecipientDsnFields", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BouncedRecipientInfo]
    }
  }

  /**
    * An array that contains one or more Destinations, as well as the tags and replacement data associated with each of those Destinations.
    */
  @js.native
  trait BulkEmailDestination extends js.Object {
    var Destination: Destination
    var ReplacementTags: js.UndefOr[MessageTagList]
    var ReplacementTemplateData: js.UndefOr[TemplateData]
  }

  object BulkEmailDestination {
    def apply(
        Destination: Destination,
        ReplacementTags: js.UndefOr[MessageTagList] = js.undefined,
        ReplacementTemplateData: js.UndefOr[TemplateData] = js.undefined
    ): BulkEmailDestination = {
      val __obj = js.Dictionary[js.Any](
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      ReplacementTags.foreach(__v => __obj.update("ReplacementTags", __v.asInstanceOf[js.Any]))
      ReplacementTemplateData.foreach(__v => __obj.update("ReplacementTemplateData", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BulkEmailDestination]
    }
  }

  /**
    * An object that contains the response from the <code>SendBulkTemplatedEmail</code> operation.
    */
  @js.native
  trait BulkEmailDestinationStatus extends js.Object {
    var Error: js.UndefOr[Error]
    var MessageId: js.UndefOr[MessageId]
    var Status: js.UndefOr[BulkEmailStatus]
  }

  object BulkEmailDestinationStatus {
    def apply(
        Error: js.UndefOr[Error] = js.undefined,
        MessageId: js.UndefOr[MessageId] = js.undefined,
        Status: js.UndefOr[BulkEmailStatus] = js.undefined
    ): BulkEmailDestinationStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      Error.foreach(__v => __obj.update("Error", __v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.update("MessageId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BulkEmailDestinationStatus]
    }
  }

  object BulkEmailStatusEnum {
    val Success                       = "Success"
    val MessageRejected               = "MessageRejected"
    val MailFromDomainNotVerified     = "MailFromDomainNotVerified"
    val ConfigurationSetDoesNotExist  = "ConfigurationSetDoesNotExist"
    val TemplateDoesNotExist          = "TemplateDoesNotExist"
    val AccountSuspended              = "AccountSuspended"
    val AccountThrottled              = "AccountThrottled"
    val AccountDailyQuotaExceeded     = "AccountDailyQuotaExceeded"
    val InvalidSendingPoolName        = "InvalidSendingPoolName"
    val AccountSendingPaused          = "AccountSendingPaused"
    val ConfigurationSetSendingPaused = "ConfigurationSetSendingPaused"
    val InvalidParameterValue         = "InvalidParameterValue"
    val TransientFailure              = "TransientFailure"
    val Failed                        = "Failed"

    val values = IndexedSeq(
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

  /**
    * Represents a request to create a receipt rule set by cloning an existing one. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait CloneReceiptRuleSetRequest extends js.Object {
    var OriginalRuleSetName: ReceiptRuleSetName
    var RuleSetName: ReceiptRuleSetName
  }

  object CloneReceiptRuleSetRequest {
    def apply(
        OriginalRuleSetName: ReceiptRuleSetName,
        RuleSetName: ReceiptRuleSetName
    ): CloneReceiptRuleSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "OriginalRuleSetName" -> OriginalRuleSetName.asInstanceOf[js.Any],
        "RuleSetName"         -> RuleSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CloneReceiptRuleSetRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait CloneReceiptRuleSetResponse extends js.Object {}

  object CloneReceiptRuleSetResponse {
    def apply(
        ): CloneReceiptRuleSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CloneReceiptRuleSetResponse]
    }
  }

  /**
    * Contains information associated with an Amazon CloudWatch event destination to which email sending events are published.
    *  Event destinations, such as Amazon CloudWatch, are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait CloudWatchDestination extends js.Object {
    var DimensionConfigurations: CloudWatchDimensionConfigurations
  }

  object CloudWatchDestination {
    def apply(
        DimensionConfigurations: CloudWatchDimensionConfigurations
    ): CloudWatchDestination = {
      val __obj = js.Dictionary[js.Any](
        "DimensionConfigurations" -> DimensionConfigurations.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CloudWatchDestination]
    }
  }

  /**
    * Contains the dimension configuration to use when you publish email sending events to Amazon CloudWatch.
    *  For information about publishing email sending events to Amazon CloudWatch, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait CloudWatchDimensionConfiguration extends js.Object {
    var DefaultDimensionValue: DefaultDimensionValue
    var DimensionName: DimensionName
    var DimensionValueSource: DimensionValueSource
  }

  object CloudWatchDimensionConfiguration {
    def apply(
        DefaultDimensionValue: DefaultDimensionValue,
        DimensionName: DimensionName,
        DimensionValueSource: DimensionValueSource
    ): CloudWatchDimensionConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "DefaultDimensionValue" -> DefaultDimensionValue.asInstanceOf[js.Any],
        "DimensionName"         -> DimensionName.asInstanceOf[js.Any],
        "DimensionValueSource"  -> DimensionValueSource.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CloudWatchDimensionConfiguration]
    }
  }

  /**
    * The name of the configuration set.
    *  Configuration sets let you create groups of rules that you can apply to the emails you send using Amazon SES. For more information about using configuration sets, see [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/using-configuration-sets.html|Using Amazon SES Configuration Sets]] in the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/|Amazon SES Developer Guide]].
    */
  @js.native
  trait ConfigurationSet extends js.Object {
    var Name: ConfigurationSetName
  }

  object ConfigurationSet {
    def apply(
        Name: ConfigurationSetName
    ): ConfigurationSet = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ConfigurationSet]
    }
  }

  object ConfigurationSetAttributeEnum {
    val eventDestinations = "eventDestinations"
    val trackingOptions   = "trackingOptions"
    val deliveryOptions   = "deliveryOptions"
    val reputationOptions = "reputationOptions"

    val values = IndexedSeq(eventDestinations, trackingOptions, deliveryOptions, reputationOptions)
  }

  /**
    * Represents textual data, plus an optional character set specification.
    *  By default, the text must be 7-bit ASCII, due to the constraints of the SMTP protocol. If the text must contain any other characters, then you must also specify a character set. Examples include UTF-8, ISO-8859-1, and Shift_JIS.
    */
  @js.native
  trait Content extends js.Object {
    var Data: MessageData
    var Charset: js.UndefOr[Charset]
  }

  object Content {
    def apply(
        Data: MessageData,
        Charset: js.UndefOr[Charset] = js.undefined
    ): Content = {
      val __obj = js.Dictionary[js.Any](
        "Data" -> Data.asInstanceOf[js.Any]
      )

      Charset.foreach(__v => __obj.update("Charset", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Content]
    }
  }

  /**
    * Represents a request to create a configuration set event destination. A configuration set event destination, which can be either Amazon CloudWatch or Amazon Kinesis Firehose, describes an AWS service in which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait CreateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestination: EventDestination
  }

  object CreateConfigurationSetEventDestinationRequest {
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        EventDestination: EventDestination
    ): CreateConfigurationSetEventDestinationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestination"     -> EventDestination.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait CreateConfigurationSetEventDestinationResponse extends js.Object {}

  object CreateConfigurationSetEventDestinationResponse {
    def apply(
        ): CreateConfigurationSetEventDestinationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateConfigurationSetEventDestinationResponse]
    }
  }

  /**
    * Represents a request to create a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait CreateConfigurationSetRequest extends js.Object {
    var ConfigurationSet: ConfigurationSet
  }

  object CreateConfigurationSetRequest {
    def apply(
        ConfigurationSet: ConfigurationSet
    ): CreateConfigurationSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSet" -> ConfigurationSet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateConfigurationSetRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait CreateConfigurationSetResponse extends js.Object {}

  object CreateConfigurationSetResponse {
    def apply(
        ): CreateConfigurationSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateConfigurationSetResponse]
    }
  }

  /**
    * Represents a request to create an open and click tracking option object in a configuration set.
    */
  @js.native
  trait CreateConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var TrackingOptions: TrackingOptions
  }

  object CreateConfigurationSetTrackingOptionsRequest {
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        TrackingOptions: TrackingOptions
    ): CreateConfigurationSetTrackingOptionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "TrackingOptions"      -> TrackingOptions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateConfigurationSetTrackingOptionsRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait CreateConfigurationSetTrackingOptionsResponse extends js.Object {}

  object CreateConfigurationSetTrackingOptionsResponse {
    def apply(
        ): CreateConfigurationSetTrackingOptionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateConfigurationSetTrackingOptionsResponse]
    }
  }

  /**
    * Represents a request to create a custom verification email template.
    */
  @js.native
  trait CreateCustomVerificationEmailTemplateRequest extends js.Object {
    var FailureRedirectionURL: FailureRedirectionURL
    var FromEmailAddress: FromAddress
    var SuccessRedirectionURL: SuccessRedirectionURL
    var TemplateContent: TemplateContent
    var TemplateName: TemplateName
    var TemplateSubject: Subject
  }

  object CreateCustomVerificationEmailTemplateRequest {
    def apply(
        FailureRedirectionURL: FailureRedirectionURL,
        FromEmailAddress: FromAddress,
        SuccessRedirectionURL: SuccessRedirectionURL,
        TemplateContent: TemplateContent,
        TemplateName: TemplateName,
        TemplateSubject: Subject
    ): CreateCustomVerificationEmailTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "FailureRedirectionURL" -> FailureRedirectionURL.asInstanceOf[js.Any],
        "FromEmailAddress"      -> FromEmailAddress.asInstanceOf[js.Any],
        "SuccessRedirectionURL" -> SuccessRedirectionURL.asInstanceOf[js.Any],
        "TemplateContent"       -> TemplateContent.asInstanceOf[js.Any],
        "TemplateName"          -> TemplateName.asInstanceOf[js.Any],
        "TemplateSubject"       -> TemplateSubject.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCustomVerificationEmailTemplateRequest]
    }
  }

  /**
    * Represents a request to create a new IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait CreateReceiptFilterRequest extends js.Object {
    var Filter: ReceiptFilter
  }

  object CreateReceiptFilterRequest {
    def apply(
        Filter: ReceiptFilter
    ): CreateReceiptFilterRequest = {
      val __obj = js.Dictionary[js.Any](
        "Filter" -> Filter.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateReceiptFilterRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait CreateReceiptFilterResponse extends js.Object {}

  object CreateReceiptFilterResponse {
    def apply(
        ): CreateReceiptFilterResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateReceiptFilterResponse]
    }
  }

  /**
    * Represents a request to create a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait CreateReceiptRuleRequest extends js.Object {
    var Rule: ReceiptRule
    var RuleSetName: ReceiptRuleSetName
    var After: js.UndefOr[ReceiptRuleName]
  }

  object CreateReceiptRuleRequest {
    def apply(
        Rule: ReceiptRule,
        RuleSetName: ReceiptRuleSetName,
        After: js.UndefOr[ReceiptRuleName] = js.undefined
    ): CreateReceiptRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Rule"        -> Rule.asInstanceOf[js.Any],
        "RuleSetName" -> RuleSetName.asInstanceOf[js.Any]
      )

      After.foreach(__v => __obj.update("After", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReceiptRuleRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait CreateReceiptRuleResponse extends js.Object {}

  object CreateReceiptRuleResponse {
    def apply(
        ): CreateReceiptRuleResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateReceiptRuleResponse]
    }
  }

  /**
    * Represents a request to create an empty receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait CreateReceiptRuleSetRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
  }

  object CreateReceiptRuleSetRequest {
    def apply(
        RuleSetName: ReceiptRuleSetName
    ): CreateReceiptRuleSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "RuleSetName" -> RuleSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateReceiptRuleSetRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait CreateReceiptRuleSetResponse extends js.Object {}

  object CreateReceiptRuleSetResponse {
    def apply(
        ): CreateReceiptRuleSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateReceiptRuleSetResponse]
    }
  }

  /**
    * Represents a request to create an email template. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait CreateTemplateRequest extends js.Object {
    var Template: Template
  }

  object CreateTemplateRequest {
    def apply(
        Template: Template
    ): CreateTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "Template" -> Template.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTemplateRequest]
    }
  }

  @js.native
  trait CreateTemplateResponse extends js.Object {}

  object CreateTemplateResponse {
    def apply(
        ): CreateTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateTemplateResponse]
    }
  }

  object CustomMailFromStatusEnum {
    val Pending          = "Pending"
    val Success          = "Success"
    val Failed           = "Failed"
    val TemporaryFailure = "TemporaryFailure"

    val values = IndexedSeq(Pending, Success, Failed, TemporaryFailure)
  }

  /**
    * Contains information about a custom verification email template.
    */
  @js.native
  trait CustomVerificationEmailTemplate extends js.Object {
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL]
    var FromEmailAddress: js.UndefOr[FromAddress]
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL]
    var TemplateName: js.UndefOr[TemplateName]
    var TemplateSubject: js.UndefOr[Subject]
  }

  object CustomVerificationEmailTemplate {
    def apply(
        FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined,
        FromEmailAddress: js.UndefOr[FromAddress] = js.undefined,
        SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined,
        TemplateName: js.UndefOr[TemplateName] = js.undefined,
        TemplateSubject: js.UndefOr[Subject] = js.undefined
    ): CustomVerificationEmailTemplate = {
      val __obj = js.Dictionary.empty[js.Any]
      FailureRedirectionURL.foreach(__v => __obj.update("FailureRedirectionURL", __v.asInstanceOf[js.Any]))
      FromEmailAddress.foreach(__v => __obj.update("FromEmailAddress", __v.asInstanceOf[js.Any]))
      SuccessRedirectionURL.foreach(__v => __obj.update("SuccessRedirectionURL", __v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.update("TemplateName", __v.asInstanceOf[js.Any]))
      TemplateSubject.foreach(__v => __obj.update("TemplateSubject", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomVerificationEmailTemplate]
    }
  }

  /**
    * Represents a request to delete a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestinationName: EventDestinationName
  }

  object DeleteConfigurationSetEventDestinationRequest {
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        EventDestinationName: EventDestinationName
    ): DeleteConfigurationSetEventDestinationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait DeleteConfigurationSetEventDestinationResponse extends js.Object {}

  object DeleteConfigurationSetEventDestinationResponse {
    def apply(
        ): DeleteConfigurationSetEventDestinationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteConfigurationSetEventDestinationResponse]
    }
  }

  /**
    * Represents a request to delete a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DeleteConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  object DeleteConfigurationSetRequest {
    def apply(
        ConfigurationSetName: ConfigurationSetName
    ): DeleteConfigurationSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigurationSetRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait DeleteConfigurationSetResponse extends js.Object {}

  object DeleteConfigurationSetResponse {
    def apply(
        ): DeleteConfigurationSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteConfigurationSetResponse]
    }
  }

  /**
    * Represents a request to delete open and click tracking options in a configuration set.
    */
  @js.native
  trait DeleteConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  object DeleteConfigurationSetTrackingOptionsRequest {
    def apply(
        ConfigurationSetName: ConfigurationSetName
    ): DeleteConfigurationSetTrackingOptionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigurationSetTrackingOptionsRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait DeleteConfigurationSetTrackingOptionsResponse extends js.Object {}

  object DeleteConfigurationSetTrackingOptionsResponse {
    def apply(
        ): DeleteConfigurationSetTrackingOptionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteConfigurationSetTrackingOptionsResponse]
    }
  }

  /**
    * Represents a request to delete an existing custom verification email template.
    */
  @js.native
  trait DeleteCustomVerificationEmailTemplateRequest extends js.Object {
    var TemplateName: TemplateName
  }

  object DeleteCustomVerificationEmailTemplateRequest {
    def apply(
        TemplateName: TemplateName
    ): DeleteCustomVerificationEmailTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCustomVerificationEmailTemplateRequest]
    }
  }

  /**
    * Represents a request to delete a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DeleteIdentityPolicyRequest extends js.Object {
    var Identity: Identity
    var PolicyName: PolicyName
  }

  object DeleteIdentityPolicyRequest {
    def apply(
        Identity: Identity,
        PolicyName: PolicyName
    ): DeleteIdentityPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "Identity"   -> Identity.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIdentityPolicyRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait DeleteIdentityPolicyResponse extends js.Object {}

  object DeleteIdentityPolicyResponse {
    def apply(
        ): DeleteIdentityPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteIdentityPolicyResponse]
    }
  }

  /**
    * Represents a request to delete one of your Amazon SES identities (an email address or domain).
    */
  @js.native
  trait DeleteIdentityRequest extends js.Object {
    var Identity: Identity
  }

  object DeleteIdentityRequest {
    def apply(
        Identity: Identity
    ): DeleteIdentityRequest = {
      val __obj = js.Dictionary[js.Any](
        "Identity" -> Identity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIdentityRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait DeleteIdentityResponse extends js.Object {}

  object DeleteIdentityResponse {
    def apply(
        ): DeleteIdentityResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteIdentityResponse]
    }
  }

  /**
    * Represents a request to delete an IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DeleteReceiptFilterRequest extends js.Object {
    var FilterName: ReceiptFilterName
  }

  object DeleteReceiptFilterRequest {
    def apply(
        FilterName: ReceiptFilterName
    ): DeleteReceiptFilterRequest = {
      val __obj = js.Dictionary[js.Any](
        "FilterName" -> FilterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteReceiptFilterRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait DeleteReceiptFilterResponse extends js.Object {}

  object DeleteReceiptFilterResponse {
    def apply(
        ): DeleteReceiptFilterResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteReceiptFilterResponse]
    }
  }

  /**
    * Represents a request to delete a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DeleteReceiptRuleRequest extends js.Object {
    var RuleName: ReceiptRuleName
    var RuleSetName: ReceiptRuleSetName
  }

  object DeleteReceiptRuleRequest {
    def apply(
        RuleName: ReceiptRuleName,
        RuleSetName: ReceiptRuleSetName
    ): DeleteReceiptRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "RuleName"    -> RuleName.asInstanceOf[js.Any],
        "RuleSetName" -> RuleSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteReceiptRuleRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait DeleteReceiptRuleResponse extends js.Object {}

  object DeleteReceiptRuleResponse {
    def apply(
        ): DeleteReceiptRuleResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteReceiptRuleResponse]
    }
  }

  /**
    * Represents a request to delete a receipt rule set and all of the receipt rules it contains. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DeleteReceiptRuleSetRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
  }

  object DeleteReceiptRuleSetRequest {
    def apply(
        RuleSetName: ReceiptRuleSetName
    ): DeleteReceiptRuleSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "RuleSetName" -> RuleSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteReceiptRuleSetRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait DeleteReceiptRuleSetResponse extends js.Object {}

  object DeleteReceiptRuleSetResponse {
    def apply(
        ): DeleteReceiptRuleSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteReceiptRuleSetResponse]
    }
  }

  /**
    * Represents a request to delete an email template. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DeleteTemplateRequest extends js.Object {
    var TemplateName: TemplateName
  }

  object DeleteTemplateRequest {
    def apply(
        TemplateName: TemplateName
    ): DeleteTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTemplateRequest]
    }
  }

  @js.native
  trait DeleteTemplateResponse extends js.Object {}

  object DeleteTemplateResponse {
    def apply(
        ): DeleteTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteTemplateResponse]
    }
  }

  /**
    * Represents a request to delete an email address from the list of email addresses you have attempted to verify under your AWS account.
    */
  @js.native
  trait DeleteVerifiedEmailAddressRequest extends js.Object {
    var EmailAddress: Address
  }

  object DeleteVerifiedEmailAddressRequest {
    def apply(
        EmailAddress: Address
    ): DeleteVerifiedEmailAddressRequest = {
      val __obj = js.Dictionary[js.Any](
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVerifiedEmailAddressRequest]
    }
  }

  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
    */
  @js.native
  trait DeliveryOptions extends js.Object {
    var TlsPolicy: js.UndefOr[TlsPolicy]
  }

  object DeliveryOptions {
    def apply(
        TlsPolicy: js.UndefOr[TlsPolicy] = js.undefined
    ): DeliveryOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      TlsPolicy.foreach(__v => __obj.update("TlsPolicy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeliveryOptions]
    }
  }

  /**
    * Represents a request to return the metadata and receipt rules for the receipt rule set that is currently active. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DescribeActiveReceiptRuleSetRequest extends js.Object {}

  object DescribeActiveReceiptRuleSetRequest {
    def apply(
        ): DescribeActiveReceiptRuleSetRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DescribeActiveReceiptRuleSetRequest]
    }
  }

  /**
    * Represents the metadata and receipt rules for the receipt rule set that is currently active.
    */
  @js.native
  trait DescribeActiveReceiptRuleSetResponse extends js.Object {
    var Metadata: js.UndefOr[ReceiptRuleSetMetadata]
    var Rules: js.UndefOr[ReceiptRulesList]
  }

  object DescribeActiveReceiptRuleSetResponse {
    def apply(
        Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.undefined,
        Rules: js.UndefOr[ReceiptRulesList] = js.undefined
    ): DescribeActiveReceiptRuleSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Metadata.foreach(__v => __obj.update("Metadata", __v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.update("Rules", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeActiveReceiptRuleSetResponse]
    }
  }

  /**
    * Represents a request to return the details of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DescribeConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var ConfigurationSetAttributeNames: js.UndefOr[ConfigurationSetAttributeList]
  }

  object DescribeConfigurationSetRequest {
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        ConfigurationSetAttributeNames: js.UndefOr[ConfigurationSetAttributeList] = js.undefined
    ): DescribeConfigurationSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      ConfigurationSetAttributeNames.foreach(
        __v => __obj.update("ConfigurationSetAttributeNames", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeConfigurationSetRequest]
    }
  }

  /**
    * Represents the details of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DescribeConfigurationSetResponse extends js.Object {
    var ConfigurationSet: js.UndefOr[ConfigurationSet]
    var DeliveryOptions: js.UndefOr[DeliveryOptions]
    var EventDestinations: js.UndefOr[EventDestinations]
    var ReputationOptions: js.UndefOr[ReputationOptions]
    var TrackingOptions: js.UndefOr[TrackingOptions]
  }

  object DescribeConfigurationSetResponse {
    def apply(
        ConfigurationSet: js.UndefOr[ConfigurationSet] = js.undefined,
        DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined,
        EventDestinations: js.UndefOr[EventDestinations] = js.undefined,
        ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined,
        TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined
    ): DescribeConfigurationSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationSet.foreach(__v => __obj.update("ConfigurationSet", __v.asInstanceOf[js.Any]))
      DeliveryOptions.foreach(__v => __obj.update("DeliveryOptions", __v.asInstanceOf[js.Any]))
      EventDestinations.foreach(__v => __obj.update("EventDestinations", __v.asInstanceOf[js.Any]))
      ReputationOptions.foreach(__v => __obj.update("ReputationOptions", __v.asInstanceOf[js.Any]))
      TrackingOptions.foreach(__v => __obj.update("TrackingOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationSetResponse]
    }
  }

  /**
    * Represents a request to return the details of a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DescribeReceiptRuleRequest extends js.Object {
    var RuleName: ReceiptRuleName
    var RuleSetName: ReceiptRuleSetName
  }

  object DescribeReceiptRuleRequest {
    def apply(
        RuleName: ReceiptRuleName,
        RuleSetName: ReceiptRuleSetName
    ): DescribeReceiptRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "RuleName"    -> RuleName.asInstanceOf[js.Any],
        "RuleSetName" -> RuleSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeReceiptRuleRequest]
    }
  }

  /**
    * Represents the details of a receipt rule.
    */
  @js.native
  trait DescribeReceiptRuleResponse extends js.Object {
    var Rule: js.UndefOr[ReceiptRule]
  }

  object DescribeReceiptRuleResponse {
    def apply(
        Rule: js.UndefOr[ReceiptRule] = js.undefined
    ): DescribeReceiptRuleResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Rule.foreach(__v => __obj.update("Rule", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReceiptRuleResponse]
    }
  }

  /**
    * Represents a request to return the details of a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait DescribeReceiptRuleSetRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
  }

  object DescribeReceiptRuleSetRequest {
    def apply(
        RuleSetName: ReceiptRuleSetName
    ): DescribeReceiptRuleSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "RuleSetName" -> RuleSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeReceiptRuleSetRequest]
    }
  }

  /**
    * Represents the details of the specified receipt rule set.
    */
  @js.native
  trait DescribeReceiptRuleSetResponse extends js.Object {
    var Metadata: js.UndefOr[ReceiptRuleSetMetadata]
    var Rules: js.UndefOr[ReceiptRulesList]
  }

  object DescribeReceiptRuleSetResponse {
    def apply(
        Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.undefined,
        Rules: js.UndefOr[ReceiptRulesList] = js.undefined
    ): DescribeReceiptRuleSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Metadata.foreach(__v => __obj.update("Metadata", __v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.update("Rules", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReceiptRuleSetResponse]
    }
  }

  /**
    * Represents the destination of the message, consisting of To:, CC:, and BCC: fields.
    *
    * '''Note:'''Amazon SES does not support the SMTPUTF8 extension, as described in [[https://tools.ietf.org/html/rfc6531|RFC6531]]. For this reason, the <i>local part</i> of a destination email address (the part of the email address that precedes the @ sign) may only contain [[https://en.wikipedia.org/wiki/Email_address#Local-part|7-bit ASCII characters]]. If the <i>domain part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in [[https://tools.ietf.org/html/rfc3492.html|RFC3492]].
    */
  @js.native
  trait Destination extends js.Object {
    var BccAddresses: js.UndefOr[AddressList]
    var CcAddresses: js.UndefOr[AddressList]
    var ToAddresses: js.UndefOr[AddressList]
  }

  object Destination {
    def apply(
        BccAddresses: js.UndefOr[AddressList] = js.undefined,
        CcAddresses: js.UndefOr[AddressList] = js.undefined,
        ToAddresses: js.UndefOr[AddressList] = js.undefined
    ): Destination = {
      val __obj = js.Dictionary.empty[js.Any]
      BccAddresses.foreach(__v => __obj.update("BccAddresses", __v.asInstanceOf[js.Any]))
      CcAddresses.foreach(__v => __obj.update("CcAddresses", __v.asInstanceOf[js.Any]))
      ToAddresses.foreach(__v => __obj.update("ToAddresses", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Destination]
    }
  }

  object DimensionValueSourceEnum {
    val messageTag  = "messageTag"
    val emailHeader = "emailHeader"
    val linkTag     = "linkTag"

    val values = IndexedSeq(messageTag, emailHeader, linkTag)
  }

  object DsnActionEnum {
    val failed    = "failed"
    val delayed   = "delayed"
    val delivered = "delivered"
    val relayed   = "relayed"
    val expanded  = "expanded"

    val values = IndexedSeq(failed, delayed, delivered, relayed, expanded)
  }

  /**
    * Contains information about the event destination that the specified email sending events will be published to.
    *
    * '''Note:'''When you create or update an event destination, you must provide one, and only one, destination. The destination can be Amazon CloudWatch, Amazon Kinesis Firehose or Amazon Simple Notification Service (Amazon SNS).
    * Event destinations are associated with configuration sets, which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS). For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait EventDestination extends js.Object {
    var MatchingEventTypes: EventTypes
    var Name: EventDestinationName
    var CloudWatchDestination: js.UndefOr[CloudWatchDestination]
    var Enabled: js.UndefOr[Enabled]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var SNSDestination: js.UndefOr[SNSDestination]
  }

  object EventDestination {
    def apply(
        MatchingEventTypes: EventTypes,
        Name: EventDestinationName,
        CloudWatchDestination: js.UndefOr[CloudWatchDestination] = js.undefined,
        Enabled: js.UndefOr[Enabled] = js.undefined,
        KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
        SNSDestination: js.UndefOr[SNSDestination] = js.undefined
    ): EventDestination = {
      val __obj = js.Dictionary[js.Any](
        "MatchingEventTypes" -> MatchingEventTypes.asInstanceOf[js.Any],
        "Name"               -> Name.asInstanceOf[js.Any]
      )

      CloudWatchDestination.foreach(__v => __obj.update("CloudWatchDestination", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      KinesisFirehoseDestination.foreach(__v => __obj.update("KinesisFirehoseDestination", __v.asInstanceOf[js.Any]))
      SNSDestination.foreach(__v => __obj.update("SNSDestination", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDestination]
    }
  }

  object EventTypeEnum {
    val send             = "send"
    val reject           = "reject"
    val bounce           = "bounce"
    val complaint        = "complaint"
    val delivery         = "delivery"
    val open             = "open"
    val click            = "click"
    val renderingFailure = "renderingFailure"

    val values = IndexedSeq(send, reject, bounce, complaint, delivery, open, click, renderingFailure)
  }

  /**
    * Additional X-headers to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.
    *  For information about receiving email through Amazon SES, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ExtensionField extends js.Object {
    var Name: ExtensionFieldName
    var Value: ExtensionFieldValue
  }

  object ExtensionField {
    def apply(
        Name: ExtensionFieldName,
        Value: ExtensionFieldValue
    ): ExtensionField = {
      val __obj = js.Dictionary[js.Any](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExtensionField]
    }
  }

  /**
    * Represents a request to return the email sending status for your Amazon SES account in the current AWS Region.
    */
  @js.native
  trait GetAccountSendingEnabledResponse extends js.Object {
    var Enabled: js.UndefOr[Enabled]
  }

  object GetAccountSendingEnabledResponse {
    def apply(
        Enabled: js.UndefOr[Enabled] = js.undefined
    ): GetAccountSendingEnabledResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountSendingEnabledResponse]
    }
  }

  /**
    * Represents a request to retrieve an existing custom verification email template.
    */
  @js.native
  trait GetCustomVerificationEmailTemplateRequest extends js.Object {
    var TemplateName: TemplateName
  }

  object GetCustomVerificationEmailTemplateRequest {
    def apply(
        TemplateName: TemplateName
    ): GetCustomVerificationEmailTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCustomVerificationEmailTemplateRequest]
    }
  }

  /**
    * The content of the custom verification email template.
    */
  @js.native
  trait GetCustomVerificationEmailTemplateResponse extends js.Object {
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL]
    var FromEmailAddress: js.UndefOr[FromAddress]
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL]
    var TemplateContent: js.UndefOr[TemplateContent]
    var TemplateName: js.UndefOr[TemplateName]
    var TemplateSubject: js.UndefOr[Subject]
  }

  object GetCustomVerificationEmailTemplateResponse {
    def apply(
        FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined,
        FromEmailAddress: js.UndefOr[FromAddress] = js.undefined,
        SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined,
        TemplateContent: js.UndefOr[TemplateContent] = js.undefined,
        TemplateName: js.UndefOr[TemplateName] = js.undefined,
        TemplateSubject: js.UndefOr[Subject] = js.undefined
    ): GetCustomVerificationEmailTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FailureRedirectionURL.foreach(__v => __obj.update("FailureRedirectionURL", __v.asInstanceOf[js.Any]))
      FromEmailAddress.foreach(__v => __obj.update("FromEmailAddress", __v.asInstanceOf[js.Any]))
      SuccessRedirectionURL.foreach(__v => __obj.update("SuccessRedirectionURL", __v.asInstanceOf[js.Any]))
      TemplateContent.foreach(__v => __obj.update("TemplateContent", __v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.update("TemplateName", __v.asInstanceOf[js.Any]))
      TemplateSubject.foreach(__v => __obj.update("TemplateSubject", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCustomVerificationEmailTemplateResponse]
    }
  }

  /**
    * Represents a request for the status of Amazon SES Easy DKIM signing for an identity. For domain identities, this request also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES successfully verified that these tokens were published. For more information about Easy DKIM, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait GetIdentityDkimAttributesRequest extends js.Object {
    var Identities: IdentityList
  }

  object GetIdentityDkimAttributesRequest {
    def apply(
        Identities: IdentityList
    ): GetIdentityDkimAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "Identities" -> Identities.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIdentityDkimAttributesRequest]
    }
  }

  /**
    * Represents the status of Amazon SES Easy DKIM signing for an identity. For domain identities, this response also contains the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES successfully verified that these tokens were published.
    */
  @js.native
  trait GetIdentityDkimAttributesResponse extends js.Object {
    var DkimAttributes: DkimAttributes
  }

  object GetIdentityDkimAttributesResponse {
    def apply(
        DkimAttributes: DkimAttributes
    ): GetIdentityDkimAttributesResponse = {
      val __obj = js.Dictionary[js.Any](
        "DkimAttributes" -> DkimAttributes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIdentityDkimAttributesResponse]
    }
  }

  /**
    * Represents a request to return the Amazon SES custom MAIL FROM attributes for a list of identities. For information about using a custom MAIL FROM domain, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait GetIdentityMailFromDomainAttributesRequest extends js.Object {
    var Identities: IdentityList
  }

  object GetIdentityMailFromDomainAttributesRequest {
    def apply(
        Identities: IdentityList
    ): GetIdentityMailFromDomainAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "Identities" -> Identities.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIdentityMailFromDomainAttributesRequest]
    }
  }

  /**
    * Represents the custom MAIL FROM attributes for a list of identities.
    */
  @js.native
  trait GetIdentityMailFromDomainAttributesResponse extends js.Object {
    var MailFromDomainAttributes: MailFromDomainAttributes
  }

  object GetIdentityMailFromDomainAttributesResponse {
    def apply(
        MailFromDomainAttributes: MailFromDomainAttributes
    ): GetIdentityMailFromDomainAttributesResponse = {
      val __obj = js.Dictionary[js.Any](
        "MailFromDomainAttributes" -> MailFromDomainAttributes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIdentityMailFromDomainAttributesResponse]
    }
  }

  /**
    * Represents a request to return the notification attributes for a list of identities you verified with Amazon SES. For information about Amazon SES notifications, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait GetIdentityNotificationAttributesRequest extends js.Object {
    var Identities: IdentityList
  }

  object GetIdentityNotificationAttributesRequest {
    def apply(
        Identities: IdentityList
    ): GetIdentityNotificationAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "Identities" -> Identities.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIdentityNotificationAttributesRequest]
    }
  }

  /**
    * Represents the notification attributes for a list of identities.
    */
  @js.native
  trait GetIdentityNotificationAttributesResponse extends js.Object {
    var NotificationAttributes: NotificationAttributes
  }

  object GetIdentityNotificationAttributesResponse {
    def apply(
        NotificationAttributes: NotificationAttributes
    ): GetIdentityNotificationAttributesResponse = {
      val __obj = js.Dictionary[js.Any](
        "NotificationAttributes" -> NotificationAttributes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIdentityNotificationAttributesResponse]
    }
  }

  /**
    * Represents a request to return the requested sending authorization policies for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait GetIdentityPoliciesRequest extends js.Object {
    var Identity: Identity
    var PolicyNames: PolicyNameList
  }

  object GetIdentityPoliciesRequest {
    def apply(
        Identity: Identity,
        PolicyNames: PolicyNameList
    ): GetIdentityPoliciesRequest = {
      val __obj = js.Dictionary[js.Any](
        "Identity"    -> Identity.asInstanceOf[js.Any],
        "PolicyNames" -> PolicyNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIdentityPoliciesRequest]
    }
  }

  /**
    * Represents the requested sending authorization policies.
    */
  @js.native
  trait GetIdentityPoliciesResponse extends js.Object {
    var Policies: PolicyMap
  }

  object GetIdentityPoliciesResponse {
    def apply(
        Policies: PolicyMap
    ): GetIdentityPoliciesResponse = {
      val __obj = js.Dictionary[js.Any](
        "Policies" -> Policies.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIdentityPoliciesResponse]
    }
  }

  /**
    * Represents a request to return the Amazon SES verification status of a list of identities. For domain identities, this request also returns the verification token. For information about verifying identities with Amazon SES, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait GetIdentityVerificationAttributesRequest extends js.Object {
    var Identities: IdentityList
  }

  object GetIdentityVerificationAttributesRequest {
    def apply(
        Identities: IdentityList
    ): GetIdentityVerificationAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "Identities" -> Identities.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIdentityVerificationAttributesRequest]
    }
  }

  /**
    * The Amazon SES verification status of a list of identities. For domain identities, this response also contains the verification token.
    */
  @js.native
  trait GetIdentityVerificationAttributesResponse extends js.Object {
    var VerificationAttributes: VerificationAttributes
  }

  object GetIdentityVerificationAttributesResponse {
    def apply(
        VerificationAttributes: VerificationAttributes
    ): GetIdentityVerificationAttributesResponse = {
      val __obj = js.Dictionary[js.Any](
        "VerificationAttributes" -> VerificationAttributes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIdentityVerificationAttributesResponse]
    }
  }

  /**
    * Represents your Amazon SES daily sending quota, maximum send rate, and the number of emails you have sent in the last 24 hours.
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
        SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined
    ): GetSendQuotaResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Max24HourSend.foreach(__v => __obj.update("Max24HourSend", __v.asInstanceOf[js.Any]))
      MaxSendRate.foreach(__v => __obj.update("MaxSendRate", __v.asInstanceOf[js.Any]))
      SentLast24Hours.foreach(__v => __obj.update("SentLast24Hours", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSendQuotaResponse]
    }
  }

  /**
    * Represents a list of data points. This list contains aggregated data from the previous two weeks of your sending activity with Amazon SES.
    */
  @js.native
  trait GetSendStatisticsResponse extends js.Object {
    var SendDataPoints: js.UndefOr[SendDataPointList]
  }

  object GetSendStatisticsResponse {
    def apply(
        SendDataPoints: js.UndefOr[SendDataPointList] = js.undefined
    ): GetSendStatisticsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SendDataPoints.foreach(__v => __obj.update("SendDataPoints", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSendStatisticsResponse]
    }
  }

  @js.native
  trait GetTemplateRequest extends js.Object {
    var TemplateName: TemplateName
  }

  object GetTemplateRequest {
    def apply(
        TemplateName: TemplateName
    ): GetTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTemplateRequest]
    }
  }

  @js.native
  trait GetTemplateResponse extends js.Object {
    var Template: js.UndefOr[Template]
  }

  object GetTemplateResponse {
    def apply(
        Template: js.UndefOr[Template] = js.undefined
    ): GetTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Template.foreach(__v => __obj.update("Template", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTemplateResponse]
    }
  }

  /**
    * Represents the DKIM attributes of a verified email address or a domain.
    */
  @js.native
  trait IdentityDkimAttributes extends js.Object {
    var DkimEnabled: Enabled
    var DkimVerificationStatus: VerificationStatus
    var DkimTokens: js.UndefOr[VerificationTokenList]
  }

  object IdentityDkimAttributes {
    def apply(
        DkimEnabled: Enabled,
        DkimVerificationStatus: VerificationStatus,
        DkimTokens: js.UndefOr[VerificationTokenList] = js.undefined
    ): IdentityDkimAttributes = {
      val __obj = js.Dictionary[js.Any](
        "DkimEnabled"            -> DkimEnabled.asInstanceOf[js.Any],
        "DkimVerificationStatus" -> DkimVerificationStatus.asInstanceOf[js.Any]
      )

      DkimTokens.foreach(__v => __obj.update("DkimTokens", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityDkimAttributes]
    }
  }

  /**
    * Represents the custom MAIL FROM domain attributes of a verified identity (email address or domain).
    */
  @js.native
  trait IdentityMailFromDomainAttributes extends js.Object {
    var BehaviorOnMXFailure: BehaviorOnMXFailure
    var MailFromDomain: MailFromDomainName
    var MailFromDomainStatus: CustomMailFromStatus
  }

  object IdentityMailFromDomainAttributes {
    def apply(
        BehaviorOnMXFailure: BehaviorOnMXFailure,
        MailFromDomain: MailFromDomainName,
        MailFromDomainStatus: CustomMailFromStatus
    ): IdentityMailFromDomainAttributes = {
      val __obj = js.Dictionary[js.Any](
        "BehaviorOnMXFailure"  -> BehaviorOnMXFailure.asInstanceOf[js.Any],
        "MailFromDomain"       -> MailFromDomain.asInstanceOf[js.Any],
        "MailFromDomainStatus" -> MailFromDomainStatus.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[IdentityMailFromDomainAttributes]
    }
  }

  /**
    * Represents the notification attributes of an identity, including whether an identity has Amazon Simple Notification Service (Amazon SNS) topics set for bounce, complaint, and/or delivery notifications, and whether feedback forwarding is enabled for bounce and complaint notifications.
    */
  @js.native
  trait IdentityNotificationAttributes extends js.Object {
    var BounceTopic: NotificationTopic
    var ComplaintTopic: NotificationTopic
    var DeliveryTopic: NotificationTopic
    var ForwardingEnabled: Enabled
    var HeadersInBounceNotificationsEnabled: js.UndefOr[Enabled]
    var HeadersInComplaintNotificationsEnabled: js.UndefOr[Enabled]
    var HeadersInDeliveryNotificationsEnabled: js.UndefOr[Enabled]
  }

  object IdentityNotificationAttributes {
    def apply(
        BounceTopic: NotificationTopic,
        ComplaintTopic: NotificationTopic,
        DeliveryTopic: NotificationTopic,
        ForwardingEnabled: Enabled,
        HeadersInBounceNotificationsEnabled: js.UndefOr[Enabled] = js.undefined,
        HeadersInComplaintNotificationsEnabled: js.UndefOr[Enabled] = js.undefined,
        HeadersInDeliveryNotificationsEnabled: js.UndefOr[Enabled] = js.undefined
    ): IdentityNotificationAttributes = {
      val __obj = js.Dictionary[js.Any](
        "BounceTopic"       -> BounceTopic.asInstanceOf[js.Any],
        "ComplaintTopic"    -> ComplaintTopic.asInstanceOf[js.Any],
        "DeliveryTopic"     -> DeliveryTopic.asInstanceOf[js.Any],
        "ForwardingEnabled" -> ForwardingEnabled.asInstanceOf[js.Any]
      )

      HeadersInBounceNotificationsEnabled.foreach(
        __v => __obj.update("HeadersInBounceNotificationsEnabled", __v.asInstanceOf[js.Any])
      )
      HeadersInComplaintNotificationsEnabled.foreach(
        __v => __obj.update("HeadersInComplaintNotificationsEnabled", __v.asInstanceOf[js.Any])
      )
      HeadersInDeliveryNotificationsEnabled.foreach(
        __v => __obj.update("HeadersInDeliveryNotificationsEnabled", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[IdentityNotificationAttributes]
    }
  }

  object IdentityTypeEnum {
    val EmailAddress = "EmailAddress"
    val Domain       = "Domain"

    val values = IndexedSeq(EmailAddress, Domain)
  }

  /**
    * Represents the verification attributes of a single identity.
    */
  @js.native
  trait IdentityVerificationAttributes extends js.Object {
    var VerificationStatus: VerificationStatus
    var VerificationToken: js.UndefOr[VerificationToken]
  }

  object IdentityVerificationAttributes {
    def apply(
        VerificationStatus: VerificationStatus,
        VerificationToken: js.UndefOr[VerificationToken] = js.undefined
    ): IdentityVerificationAttributes = {
      val __obj = js.Dictionary[js.Any](
        "VerificationStatus" -> VerificationStatus.asInstanceOf[js.Any]
      )

      VerificationToken.foreach(__v => __obj.update("VerificationToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityVerificationAttributes]
    }
  }

  object InvocationTypeEnum {
    val Event           = "Event"
    val RequestResponse = "RequestResponse"

    val values = IndexedSeq(Event, RequestResponse)
  }

  /**
    * Contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose event destination.
    *  Event destinations, such as Amazon Kinesis Firehose, are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait KinesisFirehoseDestination extends js.Object {
    var DeliveryStreamARN: AmazonResourceName
    var IAMRoleARN: AmazonResourceName
  }

  object KinesisFirehoseDestination {
    def apply(
        DeliveryStreamARN: AmazonResourceName,
        IAMRoleARN: AmazonResourceName
    ): KinesisFirehoseDestination = {
      val __obj = js.Dictionary[js.Any](
        "DeliveryStreamARN" -> DeliveryStreamARN.asInstanceOf[js.Any],
        "IAMRoleARN"        -> IAMRoleARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KinesisFirehoseDestination]
    }
  }

  /**
    * When included in a receipt rule, this action calls an AWS Lambda function and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    *  To enable Amazon SES to call your AWS Lambda function or to publish to an Amazon SNS topic of another account, Amazon SES must have permission to access those resources. For information about giving permissions, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html|Amazon SES Developer Guide]].
    *  For information about using AWS Lambda actions in receipt rules, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-lambda.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait LambdaAction extends js.Object {
    var FunctionArn: AmazonResourceName
    var InvocationType: js.UndefOr[InvocationType]
    var TopicArn: js.UndefOr[AmazonResourceName]
  }

  object LambdaAction {
    def apply(
        FunctionArn: AmazonResourceName,
        InvocationType: js.UndefOr[InvocationType] = js.undefined,
        TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): LambdaAction = {
      val __obj = js.Dictionary[js.Any](
        "FunctionArn" -> FunctionArn.asInstanceOf[js.Any]
      )

      InvocationType.foreach(__v => __obj.update("InvocationType", __v.asInstanceOf[js.Any]))
      TopicArn.foreach(__v => __obj.update("TopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaAction]
    }
  }

  /**
    * Represents a request to list the configuration sets associated with your AWS account. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ListConfigurationSetsRequest extends js.Object {
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConfigurationSetsRequest {
    def apply(
        MaxItems: js.UndefOr[MaxItems] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConfigurationSetsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationSetsRequest]
    }
  }

  /**
    * A list of configuration sets associated with your AWS account. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ListConfigurationSetsResponse extends js.Object {
    var ConfigurationSets: js.UndefOr[ConfigurationSets]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConfigurationSetsResponse {
    def apply(
        ConfigurationSets: js.UndefOr[ConfigurationSets] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConfigurationSetsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationSets.foreach(__v => __obj.update("ConfigurationSets", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationSetsResponse]
    }
  }

  /**
    * Represents a request to list the existing custom verification email templates for your account.
    *  For more information about custom verification email templates, see [[ses/latest/DeveloperGuide/custom-verification-emails.html|Using Custom Verification Email Templates]] in the <i>Amazon SES Developer Guide</i>.
    */
  @js.native
  trait ListCustomVerificationEmailTemplatesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCustomVerificationEmailTemplatesRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCustomVerificationEmailTemplatesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomVerificationEmailTemplatesRequest]
    }
  }

  /**
    * A paginated list of custom verification email templates.
    */
  @js.native
  trait ListCustomVerificationEmailTemplatesResponse extends js.Object {
    var CustomVerificationEmailTemplates: js.UndefOr[CustomVerificationEmailTemplates]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCustomVerificationEmailTemplatesResponse {
    def apply(
        CustomVerificationEmailTemplates: js.UndefOr[CustomVerificationEmailTemplates] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCustomVerificationEmailTemplatesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CustomVerificationEmailTemplates.foreach(
        __v => __obj.update("CustomVerificationEmailTemplates", __v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomVerificationEmailTemplatesResponse]
    }
  }

  /**
    * Represents a request to return a list of all identities (email addresses and domains) that you have attempted to verify under your AWS account, regardless of verification status.
    */
  @js.native
  trait ListIdentitiesRequest extends js.Object {
    var IdentityType: js.UndefOr[IdentityType]
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIdentitiesRequest {
    def apply(
        IdentityType: js.UndefOr[IdentityType] = js.undefined,
        MaxItems: js.UndefOr[MaxItems] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIdentitiesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      IdentityType.foreach(__v => __obj.update("IdentityType", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentitiesRequest]
    }
  }

  /**
    * A list of all identities that you have attempted to verify under your AWS account, regardless of verification status.
    */
  @js.native
  trait ListIdentitiesResponse extends js.Object {
    var Identities: IdentityList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIdentitiesResponse {
    def apply(
        Identities: IdentityList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIdentitiesResponse = {
      val __obj = js.Dictionary[js.Any](
        "Identities" -> Identities.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentitiesResponse]
    }
  }

  /**
    * Represents a request to return a list of sending authorization policies that are attached to an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ListIdentityPoliciesRequest extends js.Object {
    var Identity: Identity
  }

  object ListIdentityPoliciesRequest {
    def apply(
        Identity: Identity
    ): ListIdentityPoliciesRequest = {
      val __obj = js.Dictionary[js.Any](
        "Identity" -> Identity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListIdentityPoliciesRequest]
    }
  }

  /**
    * A list of names of sending authorization policies that apply to an identity.
    */
  @js.native
  trait ListIdentityPoliciesResponse extends js.Object {
    var PolicyNames: PolicyNameList
  }

  object ListIdentityPoliciesResponse {
    def apply(
        PolicyNames: PolicyNameList
    ): ListIdentityPoliciesResponse = {
      val __obj = js.Dictionary[js.Any](
        "PolicyNames" -> PolicyNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListIdentityPoliciesResponse]
    }
  }

  /**
    * Represents a request to list the IP address filters that exist under your AWS account. You use IP address filters when you receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ListReceiptFiltersRequest extends js.Object {}

  object ListReceiptFiltersRequest {
    def apply(
        ): ListReceiptFiltersRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ListReceiptFiltersRequest]
    }
  }

  /**
    * A list of IP address filters that exist under your AWS account.
    */
  @js.native
  trait ListReceiptFiltersResponse extends js.Object {
    var Filters: js.UndefOr[ReceiptFilterList]
  }

  object ListReceiptFiltersResponse {
    def apply(
        Filters: js.UndefOr[ReceiptFilterList] = js.undefined
    ): ListReceiptFiltersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReceiptFiltersResponse]
    }
  }

  /**
    * Represents a request to list the receipt rule sets that exist under your AWS account. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ListReceiptRuleSetsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  object ListReceiptRuleSetsRequest {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReceiptRuleSetsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReceiptRuleSetsRequest]
    }
  }

  /**
    * A list of receipt rule sets that exist under your AWS account.
    */
  @js.native
  trait ListReceiptRuleSetsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RuleSets: js.UndefOr[ReceiptRuleSetsLists]
  }

  object ListReceiptRuleSetsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RuleSets: js.UndefOr[ReceiptRuleSetsLists] = js.undefined
    ): ListReceiptRuleSetsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      RuleSets.foreach(__v => __obj.update("RuleSets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReceiptRuleSetsResponse]
    }
  }

  @js.native
  trait ListTemplatesRequest extends js.Object {
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTemplatesRequest {
    def apply(
        MaxItems: js.UndefOr[MaxItems] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTemplatesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplatesRequest]
    }
  }

  @js.native
  trait ListTemplatesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TemplatesMetadata: js.UndefOr[TemplateMetadataList]
  }

  object ListTemplatesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TemplatesMetadata: js.UndefOr[TemplateMetadataList] = js.undefined
    ): ListTemplatesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      TemplatesMetadata.foreach(__v => __obj.update("TemplatesMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplatesResponse]
    }
  }

  /**
    * A list of email addresses that you have verified with Amazon SES under your AWS account.
    */
  @js.native
  trait ListVerifiedEmailAddressesResponse extends js.Object {
    var VerifiedEmailAddresses: js.UndefOr[AddressList]
  }

  object ListVerifiedEmailAddressesResponse {
    def apply(
        VerifiedEmailAddresses: js.UndefOr[AddressList] = js.undefined
    ): ListVerifiedEmailAddressesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      VerifiedEmailAddresses.foreach(__v => __obj.update("VerifiedEmailAddresses", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVerifiedEmailAddressesResponse]
    }
  }

  /**
    * Represents the message to be sent, composed of a subject and a body.
    */
  @js.native
  trait Message extends js.Object {
    var Body: Body
    var Subject: Content
  }

  object Message {
    def apply(
        Body: Body,
        Subject: Content
    ): Message = {
      val __obj = js.Dictionary[js.Any](
        "Body"    -> Body.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Message]
    }
  }

  /**
    * Message-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.
    *  For information about receiving email through Amazon SES, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait MessageDsn extends js.Object {
    var ReportingMta: ReportingMta
    var ArrivalDate: js.UndefOr[ArrivalDate]
    var ExtensionFields: js.UndefOr[ExtensionFieldList]
  }

  object MessageDsn {
    def apply(
        ReportingMta: ReportingMta,
        ArrivalDate: js.UndefOr[ArrivalDate] = js.undefined,
        ExtensionFields: js.UndefOr[ExtensionFieldList] = js.undefined
    ): MessageDsn = {
      val __obj = js.Dictionary[js.Any](
        "ReportingMta" -> ReportingMta.asInstanceOf[js.Any]
      )

      ArrivalDate.foreach(__v => __obj.update("ArrivalDate", __v.asInstanceOf[js.Any]))
      ExtensionFields.foreach(__v => __obj.update("ExtensionFields", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageDsn]
    }
  }

  /**
    * Contains the name and value of a tag that you can provide to <code>SendEmail</code> or <code>SendRawEmail</code> to apply to an email.
    *  Message tags, which you use with configuration sets, enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait MessageTag extends js.Object {
    var Name: MessageTagName
    var Value: MessageTagValue
  }

  object MessageTag {
    def apply(
        Name: MessageTagName,
        Value: MessageTagValue
    ): MessageTag = {
      val __obj = js.Dictionary[js.Any](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MessageTag]
    }
  }

  object NotificationTypeEnum {
    val Bounce    = "Bounce"
    val Complaint = "Complaint"
    val Delivery  = "Delivery"

    val values = IndexedSeq(Bounce, Complaint, Delivery)
  }

  /**
    * A request to modify the delivery options for a configuration set.
    */
  @js.native
  trait PutConfigurationSetDeliveryOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var DeliveryOptions: js.UndefOr[DeliveryOptions]
  }

  object PutConfigurationSetDeliveryOptionsRequest {
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined
    ): PutConfigurationSetDeliveryOptionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      DeliveryOptions.foreach(__v => __obj.update("DeliveryOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationSetDeliveryOptionsRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetDeliveryOptionsResponse extends js.Object {}

  object PutConfigurationSetDeliveryOptionsResponse {
    def apply(
        ): PutConfigurationSetDeliveryOptionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[PutConfigurationSetDeliveryOptionsResponse]
    }
  }

  /**
    * Represents a request to add or update a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait PutIdentityPolicyRequest extends js.Object {
    var Identity: Identity
    var Policy: Policy
    var PolicyName: PolicyName
  }

  object PutIdentityPolicyRequest {
    def apply(
        Identity: Identity,
        Policy: Policy,
        PolicyName: PolicyName
    ): PutIdentityPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "Identity"   -> Identity.asInstanceOf[js.Any],
        "Policy"     -> Policy.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutIdentityPolicyRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait PutIdentityPolicyResponse extends js.Object {}

  object PutIdentityPolicyResponse {
    def apply(
        ): PutIdentityPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[PutIdentityPolicyResponse]
    }
  }

  /**
    * Represents the raw data of the message.
    */
  @js.native
  trait RawMessage extends js.Object {
    var Data: RawMessageData
  }

  object RawMessage {
    def apply(
        Data: RawMessageData
    ): RawMessage = {
      val __obj = js.Dictionary[js.Any](
        "Data" -> Data.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RawMessage]
    }
  }

  /**
    * An action that Amazon SES can take when it receives an email on behalf of one or more email addresses or domains that you own. An instance of this data type can represent only one action.
    *  For information about setting up receipt rules, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ReceiptAction extends js.Object {
    var AddHeaderAction: js.UndefOr[AddHeaderAction]
    var BounceAction: js.UndefOr[BounceAction]
    var LambdaAction: js.UndefOr[LambdaAction]
    var S3Action: js.UndefOr[S3Action]
    var SNSAction: js.UndefOr[SNSAction]
    var StopAction: js.UndefOr[StopAction]
    var WorkmailAction: js.UndefOr[WorkmailAction]
  }

  object ReceiptAction {
    def apply(
        AddHeaderAction: js.UndefOr[AddHeaderAction] = js.undefined,
        BounceAction: js.UndefOr[BounceAction] = js.undefined,
        LambdaAction: js.UndefOr[LambdaAction] = js.undefined,
        S3Action: js.UndefOr[S3Action] = js.undefined,
        SNSAction: js.UndefOr[SNSAction] = js.undefined,
        StopAction: js.UndefOr[StopAction] = js.undefined,
        WorkmailAction: js.UndefOr[WorkmailAction] = js.undefined
    ): ReceiptAction = {
      val __obj = js.Dictionary.empty[js.Any]
      AddHeaderAction.foreach(__v => __obj.update("AddHeaderAction", __v.asInstanceOf[js.Any]))
      BounceAction.foreach(__v => __obj.update("BounceAction", __v.asInstanceOf[js.Any]))
      LambdaAction.foreach(__v => __obj.update("LambdaAction", __v.asInstanceOf[js.Any]))
      S3Action.foreach(__v => __obj.update("S3Action", __v.asInstanceOf[js.Any]))
      SNSAction.foreach(__v => __obj.update("SNSAction", __v.asInstanceOf[js.Any]))
      StopAction.foreach(__v => __obj.update("StopAction", __v.asInstanceOf[js.Any]))
      WorkmailAction.foreach(__v => __obj.update("WorkmailAction", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReceiptAction]
    }
  }

  /**
    * A receipt IP address filter enables you to specify whether to accept or reject mail originating from an IP address or range of IP addresses.
    *  For information about setting up IP address filters, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ReceiptFilter extends js.Object {
    var IpFilter: ReceiptIpFilter
    var Name: ReceiptFilterName
  }

  object ReceiptFilter {
    def apply(
        IpFilter: ReceiptIpFilter,
        Name: ReceiptFilterName
    ): ReceiptFilter = {
      val __obj = js.Dictionary[js.Any](
        "IpFilter" -> IpFilter.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReceiptFilter]
    }
  }

  object ReceiptFilterPolicyEnum {
    val Block = "Block"
    val Allow = "Allow"

    val values = IndexedSeq(Block, Allow)
  }

  /**
    * A receipt IP address filter enables you to specify whether to accept or reject mail originating from an IP address or range of IP addresses.
    *  For information about setting up IP address filters, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ReceiptIpFilter extends js.Object {
    var Cidr: Cidr
    var Policy: ReceiptFilterPolicy
  }

  object ReceiptIpFilter {
    def apply(
        Cidr: Cidr,
        Policy: ReceiptFilterPolicy
    ): ReceiptIpFilter = {
      val __obj = js.Dictionary[js.Any](
        "Cidr"   -> Cidr.asInstanceOf[js.Any],
        "Policy" -> Policy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReceiptIpFilter]
    }
  }

  /**
    * Receipt rules enable you to specify which actions Amazon SES should take when it receives mail on behalf of one or more email addresses or domains that you own.
    *  Each receipt rule defines a set of email addresses or domains that it applies to. If the email addresses or domains match at least one recipient address of the message, Amazon SES executes all of the receipt rule's actions on the message.
    *  For information about setting up receipt rules, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ReceiptRule extends js.Object {
    var Name: ReceiptRuleName
    var Actions: js.UndefOr[ReceiptActionsList]
    var Enabled: js.UndefOr[Enabled]
    var Recipients: js.UndefOr[RecipientsList]
    var ScanEnabled: js.UndefOr[Enabled]
    var TlsPolicy: js.UndefOr[TlsPolicy]
  }

  object ReceiptRule {
    def apply(
        Name: ReceiptRuleName,
        Actions: js.UndefOr[ReceiptActionsList] = js.undefined,
        Enabled: js.UndefOr[Enabled] = js.undefined,
        Recipients: js.UndefOr[RecipientsList] = js.undefined,
        ScanEnabled: js.UndefOr[Enabled] = js.undefined,
        TlsPolicy: js.UndefOr[TlsPolicy] = js.undefined
    ): ReceiptRule = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.update("Actions", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      Recipients.foreach(__v => __obj.update("Recipients", __v.asInstanceOf[js.Any]))
      ScanEnabled.foreach(__v => __obj.update("ScanEnabled", __v.asInstanceOf[js.Any]))
      TlsPolicy.foreach(__v => __obj.update("TlsPolicy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReceiptRule]
    }
  }

  /**
    * Information about a receipt rule set.
    *  A receipt rule set is a collection of rules that specify what Amazon SES should do with mail it receives on behalf of your account's verified domains.
    *  For information about setting up receipt rule sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ReceiptRuleSetMetadata extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ReceiptRuleSetName]
  }

  object ReceiptRuleSetMetadata {
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ReceiptRuleSetName] = js.undefined
    ): ReceiptRuleSetMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedTimestamp.foreach(__v => __obj.update("CreatedTimestamp", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReceiptRuleSetMetadata]
    }
  }

  /**
    * Recipient-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.
    *  For information about receiving email through Amazon SES, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait RecipientDsnFields extends js.Object {
    var Action: DsnAction
    var Status: DsnStatus
    var DiagnosticCode: js.UndefOr[DiagnosticCode]
    var ExtensionFields: js.UndefOr[ExtensionFieldList]
    var FinalRecipient: js.UndefOr[Address]
    var LastAttemptDate: js.UndefOr[LastAttemptDate]
    var RemoteMta: js.UndefOr[RemoteMta]
  }

  object RecipientDsnFields {
    def apply(
        Action: DsnAction,
        Status: DsnStatus,
        DiagnosticCode: js.UndefOr[DiagnosticCode] = js.undefined,
        ExtensionFields: js.UndefOr[ExtensionFieldList] = js.undefined,
        FinalRecipient: js.UndefOr[Address] = js.undefined,
        LastAttemptDate: js.UndefOr[LastAttemptDate] = js.undefined,
        RemoteMta: js.UndefOr[RemoteMta] = js.undefined
    ): RecipientDsnFields = {
      val __obj = js.Dictionary[js.Any](
        "Action" -> Action.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      DiagnosticCode.foreach(__v => __obj.update("DiagnosticCode", __v.asInstanceOf[js.Any]))
      ExtensionFields.foreach(__v => __obj.update("ExtensionFields", __v.asInstanceOf[js.Any]))
      FinalRecipient.foreach(__v => __obj.update("FinalRecipient", __v.asInstanceOf[js.Any]))
      LastAttemptDate.foreach(__v => __obj.update("LastAttemptDate", __v.asInstanceOf[js.Any]))
      RemoteMta.foreach(__v => __obj.update("RemoteMta", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecipientDsnFields]
    }
  }

  /**
    * Represents a request to reorder the receipt rules within a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait ReorderReceiptRuleSetRequest extends js.Object {
    var RuleNames: ReceiptRuleNamesList
    var RuleSetName: ReceiptRuleSetName
  }

  object ReorderReceiptRuleSetRequest {
    def apply(
        RuleNames: ReceiptRuleNamesList,
        RuleSetName: ReceiptRuleSetName
    ): ReorderReceiptRuleSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "RuleNames"   -> RuleNames.asInstanceOf[js.Any],
        "RuleSetName" -> RuleSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReorderReceiptRuleSetRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait ReorderReceiptRuleSetResponse extends js.Object {}

  object ReorderReceiptRuleSetResponse {
    def apply(
        ): ReorderReceiptRuleSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ReorderReceiptRuleSetResponse]
    }
  }

  /**
    * Contains information about the reputation settings for a configuration set.
    */
  @js.native
  trait ReputationOptions extends js.Object {
    var LastFreshStart: js.UndefOr[LastFreshStart]
    var ReputationMetricsEnabled: js.UndefOr[Enabled]
    var SendingEnabled: js.UndefOr[Enabled]
  }

  object ReputationOptions {
    def apply(
        LastFreshStart: js.UndefOr[LastFreshStart] = js.undefined,
        ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined,
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): ReputationOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      LastFreshStart.foreach(__v => __obj.update("LastFreshStart", __v.asInstanceOf[js.Any]))
      ReputationMetricsEnabled.foreach(__v => __obj.update("ReputationMetricsEnabled", __v.asInstanceOf[js.Any]))
      SendingEnabled.foreach(__v => __obj.update("SendingEnabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReputationOptions]
    }
  }

  /**
    * When included in a receipt rule, this action saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    *  To enable Amazon SES to write emails to your Amazon S3 bucket, use an AWS KMS key to encrypt your emails, or publish to an Amazon SNS topic of another account, Amazon SES must have permission to access those resources. For information about giving permissions, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html|Amazon SES Developer Guide]].
    *
    * '''Note:'''When you save your emails to an Amazon S3 bucket, the maximum email size (including headers) is 30 MB. Emails larger than that will bounce.
    * For information about specifying Amazon S3 actions in receipt rules, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-s3.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait S3Action extends js.Object {
    var BucketName: S3BucketName
    var KmsKeyArn: js.UndefOr[AmazonResourceName]
    var ObjectKeyPrefix: js.UndefOr[S3KeyPrefix]
    var TopicArn: js.UndefOr[AmazonResourceName]
  }

  object S3Action {
    def apply(
        BucketName: S3BucketName,
        KmsKeyArn: js.UndefOr[AmazonResourceName] = js.undefined,
        ObjectKeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
        TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): S3Action = {
      val __obj = js.Dictionary[js.Any](
        "BucketName" -> BucketName.asInstanceOf[js.Any]
      )

      KmsKeyArn.foreach(__v => __obj.update("KmsKeyArn", __v.asInstanceOf[js.Any]))
      ObjectKeyPrefix.foreach(__v => __obj.update("ObjectKeyPrefix", __v.asInstanceOf[js.Any]))
      TopicArn.foreach(__v => __obj.update("TopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Action]
    }
  }

  /**
    * When included in a receipt rule, this action publishes a notification to Amazon Simple Notification Service (Amazon SNS). This action includes a complete copy of the email content in the Amazon SNS notifications. Amazon SNS notifications for all other actions simply provide information about the email. They do not include the email content itself.
    *  If you own the Amazon SNS topic, you don't need to do anything to give Amazon SES permission to publish emails to it. However, if you don't own the Amazon SNS topic, you need to attach a policy to the topic to give Amazon SES permissions to access it. For information about giving permissions, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html|Amazon SES Developer Guide]].
    *  <important> You can only publish emails that are 150 KB or less (including the header) to Amazon SNS. Larger emails will bounce. If you anticipate emails larger than 150 KB, use the S3 action instead.
    *  </important> For information about using a receipt rule to publish an Amazon SNS notification, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-sns.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SNSAction extends js.Object {
    var TopicArn: AmazonResourceName
    var Encoding: js.UndefOr[SNSActionEncoding]
  }

  object SNSAction {
    def apply(
        TopicArn: AmazonResourceName,
        Encoding: js.UndefOr[SNSActionEncoding] = js.undefined
    ): SNSAction = {
      val __obj = js.Dictionary[js.Any](
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      Encoding.foreach(__v => __obj.update("Encoding", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SNSAction]
    }
  }

  object SNSActionEncodingEnum {
    val `UTF-8` = "UTF-8"
    val Base64  = "Base64"

    val values = IndexedSeq(`UTF-8`, Base64)
  }

  /**
    * Contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event destination.
    *  Event destinations, such as Amazon SNS, are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SNSDestination extends js.Object {
    var TopicARN: AmazonResourceName
  }

  object SNSDestination {
    def apply(
        TopicARN: AmazonResourceName
    ): SNSDestination = {
      val __obj = js.Dictionary[js.Any](
        "TopicARN" -> TopicARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SNSDestination]
    }
  }

  /**
    * Represents a request to send a bounce message to the sender of an email you received through Amazon SES.
    */
  @js.native
  trait SendBounceRequest extends js.Object {
    var BounceSender: Address
    var BouncedRecipientInfoList: BouncedRecipientInfoList
    var OriginalMessageId: MessageId
    var BounceSenderArn: js.UndefOr[AmazonResourceName]
    var Explanation: js.UndefOr[Explanation]
    var MessageDsn: js.UndefOr[MessageDsn]
  }

  object SendBounceRequest {
    def apply(
        BounceSender: Address,
        BouncedRecipientInfoList: BouncedRecipientInfoList,
        OriginalMessageId: MessageId,
        BounceSenderArn: js.UndefOr[AmazonResourceName] = js.undefined,
        Explanation: js.UndefOr[Explanation] = js.undefined,
        MessageDsn: js.UndefOr[MessageDsn] = js.undefined
    ): SendBounceRequest = {
      val __obj = js.Dictionary[js.Any](
        "BounceSender"             -> BounceSender.asInstanceOf[js.Any],
        "BouncedRecipientInfoList" -> BouncedRecipientInfoList.asInstanceOf[js.Any],
        "OriginalMessageId"        -> OriginalMessageId.asInstanceOf[js.Any]
      )

      BounceSenderArn.foreach(__v => __obj.update("BounceSenderArn", __v.asInstanceOf[js.Any]))
      Explanation.foreach(__v => __obj.update("Explanation", __v.asInstanceOf[js.Any]))
      MessageDsn.foreach(__v => __obj.update("MessageDsn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendBounceRequest]
    }
  }

  /**
    * Represents a unique message ID.
    */
  @js.native
  trait SendBounceResponse extends js.Object {
    var MessageId: js.UndefOr[MessageId]
  }

  object SendBounceResponse {
    def apply(
        MessageId: js.UndefOr[MessageId] = js.undefined
    ): SendBounceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      MessageId.foreach(__v => __obj.update("MessageId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendBounceResponse]
    }
  }

  /**
    * Represents a request to send a templated email to multiple destinations using Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SendBulkTemplatedEmailRequest extends js.Object {
    var Destinations: BulkEmailDestinationList
    var Source: Address
    var Template: TemplateName
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var DefaultTags: js.UndefOr[MessageTagList]
    var DefaultTemplateData: js.UndefOr[TemplateData]
    var ReplyToAddresses: js.UndefOr[AddressList]
    var ReturnPath: js.UndefOr[Address]
    var ReturnPathArn: js.UndefOr[AmazonResourceName]
    var SourceArn: js.UndefOr[AmazonResourceName]
    var TemplateArn: js.UndefOr[AmazonResourceName]
  }

  object SendBulkTemplatedEmailRequest {
    def apply(
        Destinations: BulkEmailDestinationList,
        Source: Address,
        Template: TemplateName,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        DefaultTags: js.UndefOr[MessageTagList] = js.undefined,
        DefaultTemplateData: js.UndefOr[TemplateData] = js.undefined,
        ReplyToAddresses: js.UndefOr[AddressList] = js.undefined,
        ReturnPath: js.UndefOr[Address] = js.undefined,
        ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined,
        SourceArn: js.UndefOr[AmazonResourceName] = js.undefined,
        TemplateArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): SendBulkTemplatedEmailRequest = {
      val __obj = js.Dictionary[js.Any](
        "Destinations" -> Destinations.asInstanceOf[js.Any],
        "Source"       -> Source.asInstanceOf[js.Any],
        "Template"     -> Template.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.update("ConfigurationSetName", __v.asInstanceOf[js.Any]))
      DefaultTags.foreach(__v => __obj.update("DefaultTags", __v.asInstanceOf[js.Any]))
      DefaultTemplateData.foreach(__v => __obj.update("DefaultTemplateData", __v.asInstanceOf[js.Any]))
      ReplyToAddresses.foreach(__v => __obj.update("ReplyToAddresses", __v.asInstanceOf[js.Any]))
      ReturnPath.foreach(__v => __obj.update("ReturnPath", __v.asInstanceOf[js.Any]))
      ReturnPathArn.foreach(__v => __obj.update("ReturnPathArn", __v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.update("SourceArn", __v.asInstanceOf[js.Any]))
      TemplateArn.foreach(__v => __obj.update("TemplateArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendBulkTemplatedEmailRequest]
    }
  }

  @js.native
  trait SendBulkTemplatedEmailResponse extends js.Object {
    var Status: BulkEmailDestinationStatusList
  }

  object SendBulkTemplatedEmailResponse {
    def apply(
        Status: BulkEmailDestinationStatusList
    ): SendBulkTemplatedEmailResponse = {
      val __obj = js.Dictionary[js.Any](
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendBulkTemplatedEmailResponse]
    }
  }

  /**
    * Represents a request to send a custom verification email to a specified recipient.
    */
  @js.native
  trait SendCustomVerificationEmailRequest extends js.Object {
    var EmailAddress: Address
    var TemplateName: TemplateName
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
  }

  object SendCustomVerificationEmailRequest {
    def apply(
        EmailAddress: Address,
        TemplateName: TemplateName,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
    ): SendCustomVerificationEmailRequest = {
      val __obj = js.Dictionary[js.Any](
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.update("ConfigurationSetName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendCustomVerificationEmailRequest]
    }
  }

  /**
    * The response received when attempting to send the custom verification email.
    */
  @js.native
  trait SendCustomVerificationEmailResponse extends js.Object {
    var MessageId: js.UndefOr[MessageId]
  }

  object SendCustomVerificationEmailResponse {
    def apply(
        MessageId: js.UndefOr[MessageId] = js.undefined
    ): SendCustomVerificationEmailResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      MessageId.foreach(__v => __obj.update("MessageId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendCustomVerificationEmailResponse]
    }
  }

  /**
    * Represents sending statistics data. Each <code>SendDataPoint</code> contains statistics for a 15-minute period of sending activity.
    */
  @js.native
  trait SendDataPoint extends js.Object {
    var Bounces: js.UndefOr[Counter]
    var Complaints: js.UndefOr[Counter]
    var DeliveryAttempts: js.UndefOr[Counter]
    var Rejects: js.UndefOr[Counter]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object SendDataPoint {
    def apply(
        Bounces: js.UndefOr[Counter] = js.undefined,
        Complaints: js.UndefOr[Counter] = js.undefined,
        DeliveryAttempts: js.UndefOr[Counter] = js.undefined,
        Rejects: js.UndefOr[Counter] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): SendDataPoint = {
      val __obj = js.Dictionary.empty[js.Any]
      Bounces.foreach(__v => __obj.update("Bounces", __v.asInstanceOf[js.Any]))
      Complaints.foreach(__v => __obj.update("Complaints", __v.asInstanceOf[js.Any]))
      DeliveryAttempts.foreach(__v => __obj.update("DeliveryAttempts", __v.asInstanceOf[js.Any]))
      Rejects.foreach(__v => __obj.update("Rejects", __v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.update("Timestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendDataPoint]
    }
  }

  /**
    * Represents a request to send a single formatted email using Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SendEmailRequest extends js.Object {
    var Destination: Destination
    var Message: Message
    var Source: Address
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var ReplyToAddresses: js.UndefOr[AddressList]
    var ReturnPath: js.UndefOr[Address]
    var ReturnPathArn: js.UndefOr[AmazonResourceName]
    var SourceArn: js.UndefOr[AmazonResourceName]
    var Tags: js.UndefOr[MessageTagList]
  }

  object SendEmailRequest {
    def apply(
        Destination: Destination,
        Message: Message,
        Source: Address,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        ReplyToAddresses: js.UndefOr[AddressList] = js.undefined,
        ReturnPath: js.UndefOr[Address] = js.undefined,
        ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined,
        SourceArn: js.UndefOr[AmazonResourceName] = js.undefined,
        Tags: js.UndefOr[MessageTagList] = js.undefined
    ): SendEmailRequest = {
      val __obj = js.Dictionary[js.Any](
        "Destination" -> Destination.asInstanceOf[js.Any],
        "Message"     -> Message.asInstanceOf[js.Any],
        "Source"      -> Source.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.update("ConfigurationSetName", __v.asInstanceOf[js.Any]))
      ReplyToAddresses.foreach(__v => __obj.update("ReplyToAddresses", __v.asInstanceOf[js.Any]))
      ReturnPath.foreach(__v => __obj.update("ReturnPath", __v.asInstanceOf[js.Any]))
      ReturnPathArn.foreach(__v => __obj.update("ReturnPathArn", __v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.update("SourceArn", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendEmailRequest]
    }
  }

  /**
    * Represents a unique message ID.
    */
  @js.native
  trait SendEmailResponse extends js.Object {
    var MessageId: MessageId
  }

  object SendEmailResponse {
    def apply(
        MessageId: MessageId
    ): SendEmailResponse = {
      val __obj = js.Dictionary[js.Any](
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendEmailResponse]
    }
  }

  /**
    * Represents a request to send a single raw email using Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SendRawEmailRequest extends js.Object {
    var RawMessage: RawMessage
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var Destinations: js.UndefOr[AddressList]
    var FromArn: js.UndefOr[AmazonResourceName]
    var ReturnPathArn: js.UndefOr[AmazonResourceName]
    var Source: js.UndefOr[Address]
    var SourceArn: js.UndefOr[AmazonResourceName]
    var Tags: js.UndefOr[MessageTagList]
  }

  object SendRawEmailRequest {
    def apply(
        RawMessage: RawMessage,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        Destinations: js.UndefOr[AddressList] = js.undefined,
        FromArn: js.UndefOr[AmazonResourceName] = js.undefined,
        ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined,
        Source: js.UndefOr[Address] = js.undefined,
        SourceArn: js.UndefOr[AmazonResourceName] = js.undefined,
        Tags: js.UndefOr[MessageTagList] = js.undefined
    ): SendRawEmailRequest = {
      val __obj = js.Dictionary[js.Any](
        "RawMessage" -> RawMessage.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.update("ConfigurationSetName", __v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.update("Destinations", __v.asInstanceOf[js.Any]))
      FromArn.foreach(__v => __obj.update("FromArn", __v.asInstanceOf[js.Any]))
      ReturnPathArn.foreach(__v => __obj.update("ReturnPathArn", __v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.update("Source", __v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.update("SourceArn", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendRawEmailRequest]
    }
  }

  /**
    * Represents a unique message ID.
    */
  @js.native
  trait SendRawEmailResponse extends js.Object {
    var MessageId: MessageId
  }

  object SendRawEmailResponse {
    def apply(
        MessageId: MessageId
    ): SendRawEmailResponse = {
      val __obj = js.Dictionary[js.Any](
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendRawEmailResponse]
    }
  }

  /**
    * Represents a request to send a templated email using Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SendTemplatedEmailRequest extends js.Object {
    var Destination: Destination
    var Source: Address
    var Template: TemplateName
    var TemplateData: TemplateData
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var ReplyToAddresses: js.UndefOr[AddressList]
    var ReturnPath: js.UndefOr[Address]
    var ReturnPathArn: js.UndefOr[AmazonResourceName]
    var SourceArn: js.UndefOr[AmazonResourceName]
    var Tags: js.UndefOr[MessageTagList]
    var TemplateArn: js.UndefOr[AmazonResourceName]
  }

  object SendTemplatedEmailRequest {
    def apply(
        Destination: Destination,
        Source: Address,
        Template: TemplateName,
        TemplateData: TemplateData,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        ReplyToAddresses: js.UndefOr[AddressList] = js.undefined,
        ReturnPath: js.UndefOr[Address] = js.undefined,
        ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined,
        SourceArn: js.UndefOr[AmazonResourceName] = js.undefined,
        Tags: js.UndefOr[MessageTagList] = js.undefined,
        TemplateArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): SendTemplatedEmailRequest = {
      val __obj = js.Dictionary[js.Any](
        "Destination"  -> Destination.asInstanceOf[js.Any],
        "Source"       -> Source.asInstanceOf[js.Any],
        "Template"     -> Template.asInstanceOf[js.Any],
        "TemplateData" -> TemplateData.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.update("ConfigurationSetName", __v.asInstanceOf[js.Any]))
      ReplyToAddresses.foreach(__v => __obj.update("ReplyToAddresses", __v.asInstanceOf[js.Any]))
      ReturnPath.foreach(__v => __obj.update("ReturnPath", __v.asInstanceOf[js.Any]))
      ReturnPathArn.foreach(__v => __obj.update("ReturnPathArn", __v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.update("SourceArn", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TemplateArn.foreach(__v => __obj.update("TemplateArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendTemplatedEmailRequest]
    }
  }

  @js.native
  trait SendTemplatedEmailResponse extends js.Object {
    var MessageId: MessageId
  }

  object SendTemplatedEmailResponse {
    def apply(
        MessageId: MessageId
    ): SendTemplatedEmailResponse = {
      val __obj = js.Dictionary[js.Any](
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendTemplatedEmailResponse]
    }
  }

  /**
    * Represents a request to set a receipt rule set as the active receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SetActiveReceiptRuleSetRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
  }

  object SetActiveReceiptRuleSetRequest {
    def apply(
        RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined
    ): SetActiveReceiptRuleSetRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      RuleSetName.foreach(__v => __obj.update("RuleSetName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetActiveReceiptRuleSetRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait SetActiveReceiptRuleSetResponse extends js.Object {}

  object SetActiveReceiptRuleSetResponse {
    def apply(
        ): SetActiveReceiptRuleSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[SetActiveReceiptRuleSetResponse]
    }
  }

  /**
    * Represents a request to enable or disable Amazon SES Easy DKIM signing for an identity. For more information about setting up Easy DKIM, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SetIdentityDkimEnabledRequest extends js.Object {
    var DkimEnabled: Enabled
    var Identity: Identity
  }

  object SetIdentityDkimEnabledRequest {
    def apply(
        DkimEnabled: Enabled,
        Identity: Identity
    ): SetIdentityDkimEnabledRequest = {
      val __obj = js.Dictionary[js.Any](
        "DkimEnabled" -> DkimEnabled.asInstanceOf[js.Any],
        "Identity"    -> Identity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetIdentityDkimEnabledRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait SetIdentityDkimEnabledResponse extends js.Object {}

  object SetIdentityDkimEnabledResponse {
    def apply(
        ): SetIdentityDkimEnabledResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[SetIdentityDkimEnabledResponse]
    }
  }

  /**
    * Represents a request to enable or disable whether Amazon SES forwards you bounce and complaint notifications through email. For information about email feedback forwarding, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-email.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SetIdentityFeedbackForwardingEnabledRequest extends js.Object {
    var ForwardingEnabled: Enabled
    var Identity: Identity
  }

  object SetIdentityFeedbackForwardingEnabledRequest {
    def apply(
        ForwardingEnabled: Enabled,
        Identity: Identity
    ): SetIdentityFeedbackForwardingEnabledRequest = {
      val __obj = js.Dictionary[js.Any](
        "ForwardingEnabled" -> ForwardingEnabled.asInstanceOf[js.Any],
        "Identity"          -> Identity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetIdentityFeedbackForwardingEnabledRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait SetIdentityFeedbackForwardingEnabledResponse extends js.Object {}

  object SetIdentityFeedbackForwardingEnabledResponse {
    def apply(
        ): SetIdentityFeedbackForwardingEnabledResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[SetIdentityFeedbackForwardingEnabledResponse]
    }
  }

  /**
    * Represents a request to set whether Amazon SES includes the original email headers in the Amazon SNS notifications of a specified type. For information about notifications, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SetIdentityHeadersInNotificationsEnabledRequest extends js.Object {
    var Enabled: Enabled
    var Identity: Identity
    var NotificationType: NotificationType
  }

  object SetIdentityHeadersInNotificationsEnabledRequest {
    def apply(
        Enabled: Enabled,
        Identity: Identity,
        NotificationType: NotificationType
    ): SetIdentityHeadersInNotificationsEnabledRequest = {
      val __obj = js.Dictionary[js.Any](
        "Enabled"          -> Enabled.asInstanceOf[js.Any],
        "Identity"         -> Identity.asInstanceOf[js.Any],
        "NotificationType" -> NotificationType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetIdentityHeadersInNotificationsEnabledRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait SetIdentityHeadersInNotificationsEnabledResponse extends js.Object {}

  object SetIdentityHeadersInNotificationsEnabledResponse {
    def apply(
        ): SetIdentityHeadersInNotificationsEnabledResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[SetIdentityHeadersInNotificationsEnabledResponse]
    }
  }

  /**
    * Represents a request to enable or disable the Amazon SES custom MAIL FROM domain setup for a verified identity. For information about using a custom MAIL FROM domain, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SetIdentityMailFromDomainRequest extends js.Object {
    var Identity: Identity
    var BehaviorOnMXFailure: js.UndefOr[BehaviorOnMXFailure]
    var MailFromDomain: js.UndefOr[MailFromDomainName]
  }

  object SetIdentityMailFromDomainRequest {
    def apply(
        Identity: Identity,
        BehaviorOnMXFailure: js.UndefOr[BehaviorOnMXFailure] = js.undefined,
        MailFromDomain: js.UndefOr[MailFromDomainName] = js.undefined
    ): SetIdentityMailFromDomainRequest = {
      val __obj = js.Dictionary[js.Any](
        "Identity" -> Identity.asInstanceOf[js.Any]
      )

      BehaviorOnMXFailure.foreach(__v => __obj.update("BehaviorOnMXFailure", __v.asInstanceOf[js.Any]))
      MailFromDomain.foreach(__v => __obj.update("MailFromDomain", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetIdentityMailFromDomainRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait SetIdentityMailFromDomainResponse extends js.Object {}

  object SetIdentityMailFromDomainResponse {
    def apply(
        ): SetIdentityMailFromDomainResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[SetIdentityMailFromDomainResponse]
    }
  }

  /**
    * Represents a request to specify the Amazon SNS topic to which Amazon SES will publish bounce, complaint, or delivery notifications for emails sent with that identity as the Source. For information about Amazon SES notifications, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SetIdentityNotificationTopicRequest extends js.Object {
    var Identity: Identity
    var NotificationType: NotificationType
    var SnsTopic: js.UndefOr[NotificationTopic]
  }

  object SetIdentityNotificationTopicRequest {
    def apply(
        Identity: Identity,
        NotificationType: NotificationType,
        SnsTopic: js.UndefOr[NotificationTopic] = js.undefined
    ): SetIdentityNotificationTopicRequest = {
      val __obj = js.Dictionary[js.Any](
        "Identity"         -> Identity.asInstanceOf[js.Any],
        "NotificationType" -> NotificationType.asInstanceOf[js.Any]
      )

      SnsTopic.foreach(__v => __obj.update("SnsTopic", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetIdentityNotificationTopicRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait SetIdentityNotificationTopicResponse extends js.Object {}

  object SetIdentityNotificationTopicResponse {
    def apply(
        ): SetIdentityNotificationTopicResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[SetIdentityNotificationTopicResponse]
    }
  }

  /**
    * Represents a request to set the position of a receipt rule in a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait SetReceiptRulePositionRequest extends js.Object {
    var RuleName: ReceiptRuleName
    var RuleSetName: ReceiptRuleSetName
    var After: js.UndefOr[ReceiptRuleName]
  }

  object SetReceiptRulePositionRequest {
    def apply(
        RuleName: ReceiptRuleName,
        RuleSetName: ReceiptRuleSetName,
        After: js.UndefOr[ReceiptRuleName] = js.undefined
    ): SetReceiptRulePositionRequest = {
      val __obj = js.Dictionary[js.Any](
        "RuleName"    -> RuleName.asInstanceOf[js.Any],
        "RuleSetName" -> RuleSetName.asInstanceOf[js.Any]
      )

      After.foreach(__v => __obj.update("After", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetReceiptRulePositionRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait SetReceiptRulePositionResponse extends js.Object {}

  object SetReceiptRulePositionResponse {
    def apply(
        ): SetReceiptRulePositionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[SetReceiptRulePositionResponse]
    }
  }

  /**
    * When included in a receipt rule, this action terminates the evaluation of the receipt rule set and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    *  For information about setting a stop action in a receipt rule, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-stop.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait StopAction extends js.Object {
    var Scope: StopScope
    var TopicArn: js.UndefOr[AmazonResourceName]
  }

  object StopAction {
    def apply(
        Scope: StopScope,
        TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): StopAction = {
      val __obj = js.Dictionary[js.Any](
        "Scope" -> Scope.asInstanceOf[js.Any]
      )

      TopicArn.foreach(__v => __obj.update("TopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopAction]
    }
  }

  object StopScopeEnum {
    val RuleSet = "RuleSet"

    val values = IndexedSeq(RuleSet)
  }

  /**
    * The content of the email, composed of a subject line, an HTML part, and a text-only part.
    */
  @js.native
  trait Template extends js.Object {
    var TemplateName: TemplateName
    var HtmlPart: js.UndefOr[HtmlPart]
    var SubjectPart: js.UndefOr[SubjectPart]
    var TextPart: js.UndefOr[TextPart]
  }

  object Template {
    def apply(
        TemplateName: TemplateName,
        HtmlPart: js.UndefOr[HtmlPart] = js.undefined,
        SubjectPart: js.UndefOr[SubjectPart] = js.undefined,
        TextPart: js.UndefOr[TextPart] = js.undefined
    ): Template = {
      val __obj = js.Dictionary[js.Any](
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      HtmlPart.foreach(__v => __obj.update("HtmlPart", __v.asInstanceOf[js.Any]))
      SubjectPart.foreach(__v => __obj.update("SubjectPart", __v.asInstanceOf[js.Any]))
      TextPart.foreach(__v => __obj.update("TextPart", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Template]
    }
  }

  /**
    * Contains information about an email template.
    */
  @js.native
  trait TemplateMetadata extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var Name: js.UndefOr[TemplateName]
  }

  object TemplateMetadata {
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[TemplateName] = js.undefined
    ): TemplateMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedTimestamp.foreach(__v => __obj.update("CreatedTimestamp", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateMetadata]
    }
  }

  @js.native
  trait TestRenderTemplateRequest extends js.Object {
    var TemplateData: TemplateData
    var TemplateName: TemplateName
  }

  object TestRenderTemplateRequest {
    def apply(
        TemplateData: TemplateData,
        TemplateName: TemplateName
    ): TestRenderTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "TemplateData" -> TemplateData.asInstanceOf[js.Any],
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TestRenderTemplateRequest]
    }
  }

  @js.native
  trait TestRenderTemplateResponse extends js.Object {
    var RenderedTemplate: js.UndefOr[RenderedTemplate]
  }

  object TestRenderTemplateResponse {
    def apply(
        RenderedTemplate: js.UndefOr[RenderedTemplate] = js.undefined
    ): TestRenderTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      RenderedTemplate.foreach(__v => __obj.update("RenderedTemplate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestRenderTemplateResponse]
    }
  }

  object TlsPolicyEnum {
    val Require  = "Require"
    val Optional = "Optional"

    val values = IndexedSeq(Require, Optional)
  }

  /**
    * A domain that is used to redirect email recipients to an Amazon SES-operated domain. This domain captures open and click events generated by Amazon SES emails.
    *  For more information, see [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html|Configuring Custom Domains to Handle Open and Click Tracking]] in the <i>Amazon SES Developer Guide</i>.
    */
  @js.native
  trait TrackingOptions extends js.Object {
    var CustomRedirectDomain: js.UndefOr[CustomRedirectDomain]
  }

  object TrackingOptions {
    def apply(
        CustomRedirectDomain: js.UndefOr[CustomRedirectDomain] = js.undefined
    ): TrackingOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      CustomRedirectDomain.foreach(__v => __obj.update("CustomRedirectDomain", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrackingOptions]
    }
  }

  /**
    * Represents a request to enable or disable the email sending capabilities for your entire Amazon SES account.
    */
  @js.native
  trait UpdateAccountSendingEnabledRequest extends js.Object {
    var Enabled: js.UndefOr[Enabled]
  }

  object UpdateAccountSendingEnabledRequest {
    def apply(
        Enabled: js.UndefOr[Enabled] = js.undefined
    ): UpdateAccountSendingEnabledRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountSendingEnabledRequest]
    }
  }

  /**
    * Represents a request to update the event destination of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestination: EventDestination
  }

  object UpdateConfigurationSetEventDestinationRequest {
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        EventDestination: EventDestination
    ): UpdateConfigurationSetEventDestinationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestination"     -> EventDestination.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait UpdateConfigurationSetEventDestinationResponse extends js.Object {}

  object UpdateConfigurationSetEventDestinationResponse {
    def apply(
        ): UpdateConfigurationSetEventDestinationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateConfigurationSetEventDestinationResponse]
    }
  }

  /**
    * Represents a request to modify the reputation metric publishing settings for a configuration set.
    */
  @js.native
  trait UpdateConfigurationSetReputationMetricsEnabledRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var Enabled: Enabled
  }

  object UpdateConfigurationSetReputationMetricsEnabledRequest {
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        Enabled: Enabled
    ): UpdateConfigurationSetReputationMetricsEnabledRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "Enabled"              -> Enabled.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateConfigurationSetReputationMetricsEnabledRequest]
    }
  }

  /**
    * Represents a request to enable or disable the email sending capabilities for a specific configuration set.
    */
  @js.native
  trait UpdateConfigurationSetSendingEnabledRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var Enabled: Enabled
  }

  object UpdateConfigurationSetSendingEnabledRequest {
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        Enabled: Enabled
    ): UpdateConfigurationSetSendingEnabledRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "Enabled"              -> Enabled.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateConfigurationSetSendingEnabledRequest]
    }
  }

  /**
    * Represents a request to update the tracking options for a configuration set.
    */
  @js.native
  trait UpdateConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var TrackingOptions: TrackingOptions
  }

  object UpdateConfigurationSetTrackingOptionsRequest {
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        TrackingOptions: TrackingOptions
    ): UpdateConfigurationSetTrackingOptionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "TrackingOptions"      -> TrackingOptions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateConfigurationSetTrackingOptionsRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait UpdateConfigurationSetTrackingOptionsResponse extends js.Object {}

  object UpdateConfigurationSetTrackingOptionsResponse {
    def apply(
        ): UpdateConfigurationSetTrackingOptionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateConfigurationSetTrackingOptionsResponse]
    }
  }

  /**
    * Represents a request to update an existing custom verification email template.
    */
  @js.native
  trait UpdateCustomVerificationEmailTemplateRequest extends js.Object {
    var TemplateName: TemplateName
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL]
    var FromEmailAddress: js.UndefOr[FromAddress]
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL]
    var TemplateContent: js.UndefOr[TemplateContent]
    var TemplateSubject: js.UndefOr[Subject]
  }

  object UpdateCustomVerificationEmailTemplateRequest {
    def apply(
        TemplateName: TemplateName,
        FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined,
        FromEmailAddress: js.UndefOr[FromAddress] = js.undefined,
        SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined,
        TemplateContent: js.UndefOr[TemplateContent] = js.undefined,
        TemplateSubject: js.UndefOr[Subject] = js.undefined
    ): UpdateCustomVerificationEmailTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "TemplateName" -> TemplateName.asInstanceOf[js.Any]
      )

      FailureRedirectionURL.foreach(__v => __obj.update("FailureRedirectionURL", __v.asInstanceOf[js.Any]))
      FromEmailAddress.foreach(__v => __obj.update("FromEmailAddress", __v.asInstanceOf[js.Any]))
      SuccessRedirectionURL.foreach(__v => __obj.update("SuccessRedirectionURL", __v.asInstanceOf[js.Any]))
      TemplateContent.foreach(__v => __obj.update("TemplateContent", __v.asInstanceOf[js.Any]))
      TemplateSubject.foreach(__v => __obj.update("TemplateSubject", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCustomVerificationEmailTemplateRequest]
    }
  }

  /**
    * Represents a request to update a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait UpdateReceiptRuleRequest extends js.Object {
    var Rule: ReceiptRule
    var RuleSetName: ReceiptRuleSetName
  }

  object UpdateReceiptRuleRequest {
    def apply(
        Rule: ReceiptRule,
        RuleSetName: ReceiptRuleSetName
    ): UpdateReceiptRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "Rule"        -> Rule.asInstanceOf[js.Any],
        "RuleSetName" -> RuleSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateReceiptRuleRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait UpdateReceiptRuleResponse extends js.Object {}

  object UpdateReceiptRuleResponse {
    def apply(
        ): UpdateReceiptRuleResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateReceiptRuleResponse]
    }
  }

  @js.native
  trait UpdateTemplateRequest extends js.Object {
    var Template: Template
  }

  object UpdateTemplateRequest {
    def apply(
        Template: Template
    ): UpdateTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "Template" -> Template.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateTemplateRequest]
    }
  }

  @js.native
  trait UpdateTemplateResponse extends js.Object {}

  object UpdateTemplateResponse {
    def apply(
        ): UpdateTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateTemplateResponse]
    }
  }

  object VerificationStatusEnum {
    val Pending          = "Pending"
    val Success          = "Success"
    val Failed           = "Failed"
    val TemporaryFailure = "TemporaryFailure"
    val NotStarted       = "NotStarted"

    val values = IndexedSeq(Pending, Success, Failed, TemporaryFailure, NotStarted)
  }

  /**
    * Represents a request to generate the CNAME records needed to set up Easy DKIM with Amazon SES. For more information about setting up Easy DKIM, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait VerifyDomainDkimRequest extends js.Object {
    var Domain: Domain
  }

  object VerifyDomainDkimRequest {
    def apply(
        Domain: Domain
    ): VerifyDomainDkimRequest = {
      val __obj = js.Dictionary[js.Any](
        "Domain" -> Domain.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VerifyDomainDkimRequest]
    }
  }

  /**
    * Returns CNAME records that you must publish to the DNS server of your domain to set up Easy DKIM with Amazon SES.
    */
  @js.native
  trait VerifyDomainDkimResponse extends js.Object {
    var DkimTokens: VerificationTokenList
  }

  object VerifyDomainDkimResponse {
    def apply(
        DkimTokens: VerificationTokenList
    ): VerifyDomainDkimResponse = {
      val __obj = js.Dictionary[js.Any](
        "DkimTokens" -> DkimTokens.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VerifyDomainDkimResponse]
    }
  }

  /**
    * Represents a request to begin Amazon SES domain verification and to generate the TXT records that you must publish to the DNS server of your domain to complete the verification. For information about domain verification, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait VerifyDomainIdentityRequest extends js.Object {
    var Domain: Domain
  }

  object VerifyDomainIdentityRequest {
    def apply(
        Domain: Domain
    ): VerifyDomainIdentityRequest = {
      val __obj = js.Dictionary[js.Any](
        "Domain" -> Domain.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VerifyDomainIdentityRequest]
    }
  }

  /**
    * Returns a TXT record that you must publish to the DNS server of your domain to complete domain verification with Amazon SES.
    */
  @js.native
  trait VerifyDomainIdentityResponse extends js.Object {
    var VerificationToken: VerificationToken
  }

  object VerifyDomainIdentityResponse {
    def apply(
        VerificationToken: VerificationToken
    ): VerifyDomainIdentityResponse = {
      val __obj = js.Dictionary[js.Any](
        "VerificationToken" -> VerificationToken.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VerifyDomainIdentityResponse]
    }
  }

  /**
    * Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait VerifyEmailAddressRequest extends js.Object {
    var EmailAddress: Address
  }

  object VerifyEmailAddressRequest {
    def apply(
        EmailAddress: Address
    ): VerifyEmailAddressRequest = {
      val __obj = js.Dictionary[js.Any](
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VerifyEmailAddressRequest]
    }
  }

  /**
    * Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait VerifyEmailIdentityRequest extends js.Object {
    var EmailAddress: Address
  }

  object VerifyEmailIdentityRequest {
    def apply(
        EmailAddress: Address
    ): VerifyEmailIdentityRequest = {
      val __obj = js.Dictionary[js.Any](
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VerifyEmailIdentityRequest]
    }
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  trait VerifyEmailIdentityResponse extends js.Object {}

  object VerifyEmailIdentityResponse {
    def apply(
        ): VerifyEmailIdentityResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[VerifyEmailIdentityResponse]
    }
  }

  /**
    * When included in a receipt rule, this action calls Amazon WorkMail and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS). You will typically not use this action directly because Amazon WorkMail adds the rule automatically during its setup procedure.
    *  For information using a receipt rule to call Amazon WorkMail, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-workmail.html|Amazon SES Developer Guide]].
    */
  @js.native
  trait WorkmailAction extends js.Object {
    var OrganizationArn: AmazonResourceName
    var TopicArn: js.UndefOr[AmazonResourceName]
  }

  object WorkmailAction {
    def apply(
        OrganizationArn: AmazonResourceName,
        TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): WorkmailAction = {
      val __obj = js.Dictionary[js.Any](
        "OrganizationArn" -> OrganizationArn.asInstanceOf[js.Any]
      )

      TopicArn.foreach(__v => __obj.update("TopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkmailAction]
    }
  }
}
