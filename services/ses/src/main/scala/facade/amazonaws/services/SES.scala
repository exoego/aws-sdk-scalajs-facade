package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object ses {
  type Address                           = String
  type AddressList                       = js.Array[Address]
  type AmazonResourceName                = String
  type ArrivalDate                       = js.Date
  type BounceMessage                     = String
  type BounceSmtpReplyCode               = String
  type BounceStatusCode                  = String
  type BouncedRecipientInfoList          = js.Array[BouncedRecipientInfo]
  type BulkEmailDestinationList          = js.Array[BulkEmailDestination]
  type BulkEmailDestinationStatusList    = js.Array[BulkEmailDestinationStatus]
  type Charset                           = String
  type Cidr                              = String
  type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]
  type ConfigurationSetAttributeList     = js.Array[ConfigurationSetAttribute]
  type ConfigurationSetName              = String
  type ConfigurationSets                 = js.Array[ConfigurationSet]
  type Counter                           = Double
  type CustomRedirectDomain              = String
  type CustomVerificationEmailTemplates  = js.Array[CustomVerificationEmailTemplate]
  type DefaultDimensionValue             = String
  type DiagnosticCode                    = String
  type DimensionName                     = String
  type DkimAttributes                    = js.Dictionary[IdentityDkimAttributes]
  type Domain                            = String
  type DsnStatus                         = String
  type Enabled                           = Boolean
  type Error                             = String
  type EventDestinationName              = String
  type EventDestinations                 = js.Array[EventDestination]
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
  type Policy                            = String
  type PolicyMap                         = js.Dictionary[Policy]
  type PolicyName                        = String
  type PolicyNameList                    = js.Array[PolicyName]
  type RawMessageData                    = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ReceiptActionsList                = js.Array[ReceiptAction]
  type ReceiptFilterList                 = js.Array[ReceiptFilter]
  type ReceiptFilterName                 = String
  type ReceiptRuleName                   = String
  type ReceiptRuleNamesList              = js.Array[ReceiptRuleName]
  type ReceiptRuleSetName                = String
  type ReceiptRuleSetsLists              = js.Array[ReceiptRuleSetMetadata]
  type ReceiptRulesList                  = js.Array[ReceiptRule]
  type Recipient                         = String
  type RecipientsList                    = js.Array[Recipient]
  type RemoteMta                         = String
  type RenderedTemplate                  = String
  type ReportingMta                      = String
  type S3BucketName                      = String
  type S3KeyPrefix                       = String
  type SendDataPointList                 = js.Array[SendDataPoint]
  type SentLast24Hours                   = Double
  type Subject                           = String
  type SubjectPart                       = String
  type SuccessRedirectionURL             = String
  type TemplateContent                   = String
  type TemplateData                      = String
  type TemplateMetadataList              = js.Array[TemplateMetadata]
  type TemplateName                      = String
  type TextPart                          = String
  type Timestamp                         = js.Date
  type VerificationAttributes            = js.Dictionary[IdentityVerificationAttributes]
  type VerificationToken                 = String
  type VerificationTokenList             = js.Array[VerificationToken]

  implicit final class SESOps(private val service: SES) extends AnyVal {

    @inline def cloneReceiptRuleSetFuture(params: CloneReceiptRuleSetRequest): Future[CloneReceiptRuleSetResponse] =
      service.cloneReceiptRuleSet(params).promise().toFuture
    @inline def createConfigurationSetEventDestinationFuture(
        params: CreateConfigurationSetEventDestinationRequest
    ): Future[CreateConfigurationSetEventDestinationResponse] =
      service.createConfigurationSetEventDestination(params).promise().toFuture
    @inline def createConfigurationSetFuture(
        params: CreateConfigurationSetRequest
    ): Future[CreateConfigurationSetResponse] = service.createConfigurationSet(params).promise().toFuture
    @inline def createConfigurationSetTrackingOptionsFuture(
        params: CreateConfigurationSetTrackingOptionsRequest
    ): Future[CreateConfigurationSetTrackingOptionsResponse] =
      service.createConfigurationSetTrackingOptions(params).promise().toFuture
    @inline def createCustomVerificationEmailTemplateFuture(
        params: CreateCustomVerificationEmailTemplateRequest
    ): Future[js.Object] = service.createCustomVerificationEmailTemplate(params).promise().toFuture
    @inline def createReceiptFilterFuture(params: CreateReceiptFilterRequest): Future[CreateReceiptFilterResponse] =
      service.createReceiptFilter(params).promise().toFuture
    @inline def createReceiptRuleFuture(params: CreateReceiptRuleRequest): Future[CreateReceiptRuleResponse] =
      service.createReceiptRule(params).promise().toFuture
    @inline def createReceiptRuleSetFuture(params: CreateReceiptRuleSetRequest): Future[CreateReceiptRuleSetResponse] =
      service.createReceiptRuleSet(params).promise().toFuture
    @inline def createTemplateFuture(params: CreateTemplateRequest): Future[CreateTemplateResponse] =
      service.createTemplate(params).promise().toFuture
    @inline def deleteConfigurationSetEventDestinationFuture(
        params: DeleteConfigurationSetEventDestinationRequest
    ): Future[DeleteConfigurationSetEventDestinationResponse] =
      service.deleteConfigurationSetEventDestination(params).promise().toFuture
    @inline def deleteConfigurationSetFuture(
        params: DeleteConfigurationSetRequest
    ): Future[DeleteConfigurationSetResponse] = service.deleteConfigurationSet(params).promise().toFuture
    @inline def deleteConfigurationSetTrackingOptionsFuture(
        params: DeleteConfigurationSetTrackingOptionsRequest
    ): Future[DeleteConfigurationSetTrackingOptionsResponse] =
      service.deleteConfigurationSetTrackingOptions(params).promise().toFuture
    @inline def deleteCustomVerificationEmailTemplateFuture(
        params: DeleteCustomVerificationEmailTemplateRequest
    ): Future[js.Object] = service.deleteCustomVerificationEmailTemplate(params).promise().toFuture
    @inline def deleteIdentityFuture(params: DeleteIdentityRequest): Future[DeleteIdentityResponse] =
      service.deleteIdentity(params).promise().toFuture
    @inline def deleteIdentityPolicyFuture(params: DeleteIdentityPolicyRequest): Future[DeleteIdentityPolicyResponse] =
      service.deleteIdentityPolicy(params).promise().toFuture
    @inline def deleteReceiptFilterFuture(params: DeleteReceiptFilterRequest): Future[DeleteReceiptFilterResponse] =
      service.deleteReceiptFilter(params).promise().toFuture
    @inline def deleteReceiptRuleFuture(params: DeleteReceiptRuleRequest): Future[DeleteReceiptRuleResponse] =
      service.deleteReceiptRule(params).promise().toFuture
    @inline def deleteReceiptRuleSetFuture(params: DeleteReceiptRuleSetRequest): Future[DeleteReceiptRuleSetResponse] =
      service.deleteReceiptRuleSet(params).promise().toFuture
    @inline def deleteTemplateFuture(params: DeleteTemplateRequest): Future[DeleteTemplateResponse] =
      service.deleteTemplate(params).promise().toFuture
    @inline def deleteVerifiedEmailAddressFuture(params: DeleteVerifiedEmailAddressRequest): Future[js.Object] =
      service.deleteVerifiedEmailAddress(params).promise().toFuture
    @inline def describeActiveReceiptRuleSetFuture(
        params: DescribeActiveReceiptRuleSetRequest
    ): Future[DescribeActiveReceiptRuleSetResponse] = service.describeActiveReceiptRuleSet(params).promise().toFuture
    @inline def describeConfigurationSetFuture(
        params: DescribeConfigurationSetRequest
    ): Future[DescribeConfigurationSetResponse] = service.describeConfigurationSet(params).promise().toFuture
    @inline def describeReceiptRuleFuture(params: DescribeReceiptRuleRequest): Future[DescribeReceiptRuleResponse] =
      service.describeReceiptRule(params).promise().toFuture
    @inline def describeReceiptRuleSetFuture(
        params: DescribeReceiptRuleSetRequest
    ): Future[DescribeReceiptRuleSetResponse] = service.describeReceiptRuleSet(params).promise().toFuture
    @inline def getAccountSendingEnabledFuture(): Future[GetAccountSendingEnabledResponse] =
      service.getAccountSendingEnabled().promise().toFuture
    @inline def getCustomVerificationEmailTemplateFuture(
        params: GetCustomVerificationEmailTemplateRequest
    ): Future[GetCustomVerificationEmailTemplateResponse] =
      service.getCustomVerificationEmailTemplate(params).promise().toFuture
    @inline def getIdentityDkimAttributesFuture(
        params: GetIdentityDkimAttributesRequest
    ): Future[GetIdentityDkimAttributesResponse] = service.getIdentityDkimAttributes(params).promise().toFuture
    @inline def getIdentityMailFromDomainAttributesFuture(
        params: GetIdentityMailFromDomainAttributesRequest
    ): Future[GetIdentityMailFromDomainAttributesResponse] =
      service.getIdentityMailFromDomainAttributes(params).promise().toFuture
    @inline def getIdentityNotificationAttributesFuture(
        params: GetIdentityNotificationAttributesRequest
    ): Future[GetIdentityNotificationAttributesResponse] =
      service.getIdentityNotificationAttributes(params).promise().toFuture
    @inline def getIdentityPoliciesFuture(params: GetIdentityPoliciesRequest): Future[GetIdentityPoliciesResponse] =
      service.getIdentityPolicies(params).promise().toFuture
    @inline def getIdentityVerificationAttributesFuture(
        params: GetIdentityVerificationAttributesRequest
    ): Future[GetIdentityVerificationAttributesResponse] =
      service.getIdentityVerificationAttributes(params).promise().toFuture
    @inline def getSendQuotaFuture(): Future[GetSendQuotaResponse] = service.getSendQuota().promise().toFuture
    @inline def getSendStatisticsFuture(): Future[GetSendStatisticsResponse] =
      service.getSendStatistics().promise().toFuture
    @inline def getTemplateFuture(params: GetTemplateRequest): Future[GetTemplateResponse] =
      service.getTemplate(params).promise().toFuture
    @inline def listConfigurationSetsFuture(
        params: ListConfigurationSetsRequest
    ): Future[ListConfigurationSetsResponse] = service.listConfigurationSets(params).promise().toFuture
    @inline def listCustomVerificationEmailTemplatesFuture(
        params: ListCustomVerificationEmailTemplatesRequest
    ): Future[ListCustomVerificationEmailTemplatesResponse] =
      service.listCustomVerificationEmailTemplates(params).promise().toFuture
    @inline def listIdentitiesFuture(params: ListIdentitiesRequest): Future[ListIdentitiesResponse] =
      service.listIdentities(params).promise().toFuture
    @inline def listIdentityPoliciesFuture(params: ListIdentityPoliciesRequest): Future[ListIdentityPoliciesResponse] =
      service.listIdentityPolicies(params).promise().toFuture
    @inline def listReceiptFiltersFuture(params: ListReceiptFiltersRequest): Future[ListReceiptFiltersResponse] =
      service.listReceiptFilters(params).promise().toFuture
    @inline def listReceiptRuleSetsFuture(params: ListReceiptRuleSetsRequest): Future[ListReceiptRuleSetsResponse] =
      service.listReceiptRuleSets(params).promise().toFuture
    @inline def listTemplatesFuture(params: ListTemplatesRequest): Future[ListTemplatesResponse] =
      service.listTemplates(params).promise().toFuture
    @inline def listVerifiedEmailAddressesFuture(): Future[ListVerifiedEmailAddressesResponse] =
      service.listVerifiedEmailAddresses().promise().toFuture
    @inline def putConfigurationSetDeliveryOptionsFuture(
        params: PutConfigurationSetDeliveryOptionsRequest
    ): Future[PutConfigurationSetDeliveryOptionsResponse] =
      service.putConfigurationSetDeliveryOptions(params).promise().toFuture
    @inline def putIdentityPolicyFuture(params: PutIdentityPolicyRequest): Future[PutIdentityPolicyResponse] =
      service.putIdentityPolicy(params).promise().toFuture
    @inline def reorderReceiptRuleSetFuture(
        params: ReorderReceiptRuleSetRequest
    ): Future[ReorderReceiptRuleSetResponse] = service.reorderReceiptRuleSet(params).promise().toFuture
    @inline def sendBounceFuture(params: SendBounceRequest): Future[SendBounceResponse] =
      service.sendBounce(params).promise().toFuture
    @inline def sendBulkTemplatedEmailFuture(
        params: SendBulkTemplatedEmailRequest
    ): Future[SendBulkTemplatedEmailResponse] = service.sendBulkTemplatedEmail(params).promise().toFuture
    @inline def sendCustomVerificationEmailFuture(
        params: SendCustomVerificationEmailRequest
    ): Future[SendCustomVerificationEmailResponse] = service.sendCustomVerificationEmail(params).promise().toFuture
    @inline def sendEmailFuture(params: SendEmailRequest): Future[SendEmailResponse] =
      service.sendEmail(params).promise().toFuture
    @inline def sendRawEmailFuture(params: SendRawEmailRequest): Future[SendRawEmailResponse] =
      service.sendRawEmail(params).promise().toFuture
    @inline def sendTemplatedEmailFuture(params: SendTemplatedEmailRequest): Future[SendTemplatedEmailResponse] =
      service.sendTemplatedEmail(params).promise().toFuture
    @inline def setActiveReceiptRuleSetFuture(
        params: SetActiveReceiptRuleSetRequest
    ): Future[SetActiveReceiptRuleSetResponse] = service.setActiveReceiptRuleSet(params).promise().toFuture
    @inline def setIdentityDkimEnabledFuture(
        params: SetIdentityDkimEnabledRequest
    ): Future[SetIdentityDkimEnabledResponse] = service.setIdentityDkimEnabled(params).promise().toFuture
    @inline def setIdentityFeedbackForwardingEnabledFuture(
        params: SetIdentityFeedbackForwardingEnabledRequest
    ): Future[SetIdentityFeedbackForwardingEnabledResponse] =
      service.setIdentityFeedbackForwardingEnabled(params).promise().toFuture
    @inline def setIdentityHeadersInNotificationsEnabledFuture(
        params: SetIdentityHeadersInNotificationsEnabledRequest
    ): Future[SetIdentityHeadersInNotificationsEnabledResponse] =
      service.setIdentityHeadersInNotificationsEnabled(params).promise().toFuture
    @inline def setIdentityMailFromDomainFuture(
        params: SetIdentityMailFromDomainRequest
    ): Future[SetIdentityMailFromDomainResponse] = service.setIdentityMailFromDomain(params).promise().toFuture
    @inline def setIdentityNotificationTopicFuture(
        params: SetIdentityNotificationTopicRequest
    ): Future[SetIdentityNotificationTopicResponse] = service.setIdentityNotificationTopic(params).promise().toFuture
    @inline def setReceiptRulePositionFuture(
        params: SetReceiptRulePositionRequest
    ): Future[SetReceiptRulePositionResponse] = service.setReceiptRulePosition(params).promise().toFuture
    @inline def testRenderTemplateFuture(params: TestRenderTemplateRequest): Future[TestRenderTemplateResponse] =
      service.testRenderTemplate(params).promise().toFuture
    @inline def updateAccountSendingEnabledFuture(params: UpdateAccountSendingEnabledRequest): Future[js.Object] =
      service.updateAccountSendingEnabled(params).promise().toFuture
    @inline def updateConfigurationSetEventDestinationFuture(
        params: UpdateConfigurationSetEventDestinationRequest
    ): Future[UpdateConfigurationSetEventDestinationResponse] =
      service.updateConfigurationSetEventDestination(params).promise().toFuture
    @inline def updateConfigurationSetReputationMetricsEnabledFuture(
        params: UpdateConfigurationSetReputationMetricsEnabledRequest
    ): Future[js.Object] = service.updateConfigurationSetReputationMetricsEnabled(params).promise().toFuture
    @inline def updateConfigurationSetSendingEnabledFuture(
        params: UpdateConfigurationSetSendingEnabledRequest
    ): Future[js.Object] = service.updateConfigurationSetSendingEnabled(params).promise().toFuture
    @inline def updateConfigurationSetTrackingOptionsFuture(
        params: UpdateConfigurationSetTrackingOptionsRequest
    ): Future[UpdateConfigurationSetTrackingOptionsResponse] =
      service.updateConfigurationSetTrackingOptions(params).promise().toFuture
    @inline def updateCustomVerificationEmailTemplateFuture(
        params: UpdateCustomVerificationEmailTemplateRequest
    ): Future[js.Object] = service.updateCustomVerificationEmailTemplate(params).promise().toFuture
    @inline def updateReceiptRuleFuture(params: UpdateReceiptRuleRequest): Future[UpdateReceiptRuleResponse] =
      service.updateReceiptRule(params).promise().toFuture
    @inline def updateTemplateFuture(params: UpdateTemplateRequest): Future[UpdateTemplateResponse] =
      service.updateTemplate(params).promise().toFuture
    @inline def verifyDomainDkimFuture(params: VerifyDomainDkimRequest): Future[VerifyDomainDkimResponse] =
      service.verifyDomainDkim(params).promise().toFuture
    @inline def verifyDomainIdentityFuture(params: VerifyDomainIdentityRequest): Future[VerifyDomainIdentityResponse] =
      service.verifyDomainIdentity(params).promise().toFuture
    @inline def verifyEmailAddressFuture(params: VerifyEmailAddressRequest): Future[js.Object] =
      service.verifyEmailAddress(params).promise().toFuture
    @inline def verifyEmailIdentityFuture(params: VerifyEmailIdentityRequest): Future[VerifyEmailIdentityResponse] =
      service.verifyEmailIdentity(params).promise().toFuture
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
  @Factory
  trait AddHeaderAction extends js.Object {
    var HeaderName: HeaderName
    var HeaderValue: HeaderValue
  }

  @js.native
  sealed trait BehaviorOnMXFailure extends js.Any
  object BehaviorOnMXFailure extends js.Object {
    val UseDefaultValue = "UseDefaultValue".asInstanceOf[BehaviorOnMXFailure]
    val RejectMessage   = "RejectMessage".asInstanceOf[BehaviorOnMXFailure]

    val values = js.Object.freeze(js.Array(UseDefaultValue, RejectMessage))
  }

  /**
    * Represents the body of the message. You can specify text, HTML, or both. If you use both, then the message should display correctly in the widest variety of email clients.
    */
  @js.native
  @Factory
  trait Body extends js.Object {
    var Html: js.UndefOr[Content]
    var Text: js.UndefOr[Content]
  }

  /**
    * When included in a receipt rule, this action rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    *  For information about sending a bounce message in response to a received email, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-bounce.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait BounceAction extends js.Object {
    var Message: BounceMessage
    var Sender: Address
    var SmtpReplyCode: BounceSmtpReplyCode
    var StatusCode: js.UndefOr[BounceStatusCode]
    var TopicArn: js.UndefOr[AmazonResourceName]
  }

  @js.native
  sealed trait BounceType extends js.Any
  object BounceType extends js.Object {
    val DoesNotExist     = "DoesNotExist".asInstanceOf[BounceType]
    val MessageTooLarge  = "MessageTooLarge".asInstanceOf[BounceType]
    val ExceededQuota    = "ExceededQuota".asInstanceOf[BounceType]
    val ContentRejected  = "ContentRejected".asInstanceOf[BounceType]
    val Undefined        = "Undefined".asInstanceOf[BounceType]
    val TemporaryFailure = "TemporaryFailure".asInstanceOf[BounceType]

    val values = js.Object.freeze(
      js.Array(DoesNotExist, MessageTooLarge, ExceededQuota, ContentRejected, Undefined, TemporaryFailure)
    )
  }

  /**
    * Recipient-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.
    *  For information about receiving email through Amazon SES, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait BouncedRecipientInfo extends js.Object {
    var Recipient: Address
    var BounceType: js.UndefOr[BounceType]
    var RecipientArn: js.UndefOr[AmazonResourceName]
    var RecipientDsnFields: js.UndefOr[RecipientDsnFields]
  }

  /**
    * An array that contains one or more Destinations, as well as the tags and replacement data associated with each of those Destinations.
    */
  @js.native
  @Factory
  trait BulkEmailDestination extends js.Object {
    var Destination: Destination
    var ReplacementTags: js.UndefOr[MessageTagList]
    var ReplacementTemplateData: js.UndefOr[TemplateData]
  }

  /**
    * An object that contains the response from the <code>SendBulkTemplatedEmail</code> operation.
    */
  @js.native
  @Factory
  trait BulkEmailDestinationStatus extends js.Object {
    var Error: js.UndefOr[Error]
    var MessageId: js.UndefOr[MessageId]
    var Status: js.UndefOr[BulkEmailStatus]
  }

  @js.native
  sealed trait BulkEmailStatus extends js.Any
  object BulkEmailStatus extends js.Object {
    val Success                       = "Success".asInstanceOf[BulkEmailStatus]
    val MessageRejected               = "MessageRejected".asInstanceOf[BulkEmailStatus]
    val MailFromDomainNotVerified     = "MailFromDomainNotVerified".asInstanceOf[BulkEmailStatus]
    val ConfigurationSetDoesNotExist  = "ConfigurationSetDoesNotExist".asInstanceOf[BulkEmailStatus]
    val TemplateDoesNotExist          = "TemplateDoesNotExist".asInstanceOf[BulkEmailStatus]
    val AccountSuspended              = "AccountSuspended".asInstanceOf[BulkEmailStatus]
    val AccountThrottled              = "AccountThrottled".asInstanceOf[BulkEmailStatus]
    val AccountDailyQuotaExceeded     = "AccountDailyQuotaExceeded".asInstanceOf[BulkEmailStatus]
    val InvalidSendingPoolName        = "InvalidSendingPoolName".asInstanceOf[BulkEmailStatus]
    val AccountSendingPaused          = "AccountSendingPaused".asInstanceOf[BulkEmailStatus]
    val ConfigurationSetSendingPaused = "ConfigurationSetSendingPaused".asInstanceOf[BulkEmailStatus]
    val InvalidParameterValue         = "InvalidParameterValue".asInstanceOf[BulkEmailStatus]
    val TransientFailure              = "TransientFailure".asInstanceOf[BulkEmailStatus]
    val Failed                        = "Failed".asInstanceOf[BulkEmailStatus]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * Represents a request to create a receipt rule set by cloning an existing one. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait CloneReceiptRuleSetRequest extends js.Object {
    var OriginalRuleSetName: ReceiptRuleSetName
    var RuleSetName: ReceiptRuleSetName
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait CloneReceiptRuleSetResponse extends js.Object {}

  /**
    * Contains information associated with an Amazon CloudWatch event destination to which email sending events are published.
    *  Event destinations, such as Amazon CloudWatch, are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait CloudWatchDestination extends js.Object {
    var DimensionConfigurations: CloudWatchDimensionConfigurations
  }

  /**
    * Contains the dimension configuration to use when you publish email sending events to Amazon CloudWatch.
    *  For information about publishing email sending events to Amazon CloudWatch, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait CloudWatchDimensionConfiguration extends js.Object {
    var DefaultDimensionValue: DefaultDimensionValue
    var DimensionName: DimensionName
    var DimensionValueSource: DimensionValueSource
  }

  /**
    * The name of the configuration set.
    *  Configuration sets let you create groups of rules that you can apply to the emails you send using Amazon SES. For more information about using configuration sets, see [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/using-configuration-sets.html|Using Amazon SES Configuration Sets]] in the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ConfigurationSet extends js.Object {
    var Name: ConfigurationSetName
  }

  @js.native
  sealed trait ConfigurationSetAttribute extends js.Any
  object ConfigurationSetAttribute extends js.Object {
    val eventDestinations = "eventDestinations".asInstanceOf[ConfigurationSetAttribute]
    val trackingOptions   = "trackingOptions".asInstanceOf[ConfigurationSetAttribute]
    val deliveryOptions   = "deliveryOptions".asInstanceOf[ConfigurationSetAttribute]
    val reputationOptions = "reputationOptions".asInstanceOf[ConfigurationSetAttribute]

    val values = js.Object.freeze(js.Array(eventDestinations, trackingOptions, deliveryOptions, reputationOptions))
  }

  /**
    * Represents textual data, plus an optional character set specification.
    *  By default, the text must be 7-bit ASCII, due to the constraints of the SMTP protocol. If the text must contain any other characters, then you must also specify a character set. Examples include UTF-8, ISO-8859-1, and Shift_JIS.
    */
  @js.native
  @Factory
  trait Content extends js.Object {
    var Data: MessageData
    var Charset: js.UndefOr[Charset]
  }

  /**
    * Represents a request to create a configuration set event destination. A configuration set event destination, which can be either Amazon CloudWatch or Amazon Kinesis Firehose, describes an AWS service in which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait CreateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestination: EventDestination
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait CreateConfigurationSetEventDestinationResponse extends js.Object {}

  /**
    * Represents a request to create a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait CreateConfigurationSetRequest extends js.Object {
    var ConfigurationSet: ConfigurationSet
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait CreateConfigurationSetResponse extends js.Object {}

  /**
    * Represents a request to create an open and click tracking option object in a configuration set.
    */
  @js.native
  @Factory
  trait CreateConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var TrackingOptions: TrackingOptions
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait CreateConfigurationSetTrackingOptionsResponse extends js.Object {}

  /**
    * Represents a request to create a custom verification email template.
    */
  @js.native
  @Factory
  trait CreateCustomVerificationEmailTemplateRequest extends js.Object {
    var FailureRedirectionURL: FailureRedirectionURL
    var FromEmailAddress: FromAddress
    var SuccessRedirectionURL: SuccessRedirectionURL
    var TemplateContent: TemplateContent
    var TemplateName: TemplateName
    var TemplateSubject: Subject
  }

  /**
    * Represents a request to create a new IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait CreateReceiptFilterRequest extends js.Object {
    var Filter: ReceiptFilter
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait CreateReceiptFilterResponse extends js.Object {}

  /**
    * Represents a request to create a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait CreateReceiptRuleRequest extends js.Object {
    var Rule: ReceiptRule
    var RuleSetName: ReceiptRuleSetName
    var After: js.UndefOr[ReceiptRuleName]
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait CreateReceiptRuleResponse extends js.Object {}

  /**
    * Represents a request to create an empty receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait CreateReceiptRuleSetRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait CreateReceiptRuleSetResponse extends js.Object {}

  /**
    * Represents a request to create an email template. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait CreateTemplateRequest extends js.Object {
    var Template: Template
  }

  @js.native
  @Factory
  trait CreateTemplateResponse extends js.Object {}

  @js.native
  sealed trait CustomMailFromStatus extends js.Any
  object CustomMailFromStatus extends js.Object {
    val Pending          = "Pending".asInstanceOf[CustomMailFromStatus]
    val Success          = "Success".asInstanceOf[CustomMailFromStatus]
    val Failed           = "Failed".asInstanceOf[CustomMailFromStatus]
    val TemporaryFailure = "TemporaryFailure".asInstanceOf[CustomMailFromStatus]

    val values = js.Object.freeze(js.Array(Pending, Success, Failed, TemporaryFailure))
  }

  /**
    * Contains information about a custom verification email template.
    */
  @js.native
  @Factory
  trait CustomVerificationEmailTemplate extends js.Object {
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL]
    var FromEmailAddress: js.UndefOr[FromAddress]
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL]
    var TemplateName: js.UndefOr[TemplateName]
    var TemplateSubject: js.UndefOr[Subject]
  }

  /**
    * Represents a request to delete a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestinationName: EventDestinationName
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait DeleteConfigurationSetEventDestinationResponse extends js.Object {}

  /**
    * Represents a request to delete a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait DeleteConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait DeleteConfigurationSetResponse extends js.Object {}

  /**
    * Represents a request to delete open and click tracking options in a configuration set.
    */
  @js.native
  @Factory
  trait DeleteConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait DeleteConfigurationSetTrackingOptionsResponse extends js.Object {}

  /**
    * Represents a request to delete an existing custom verification email template.
    */
  @js.native
  @Factory
  trait DeleteCustomVerificationEmailTemplateRequest extends js.Object {
    var TemplateName: TemplateName
  }

  /**
    * Represents a request to delete a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait DeleteIdentityPolicyRequest extends js.Object {
    var Identity: Identity
    var PolicyName: PolicyName
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait DeleteIdentityPolicyResponse extends js.Object {}

  /**
    * Represents a request to delete one of your Amazon SES identities (an email address or domain).
    */
  @js.native
  @Factory
  trait DeleteIdentityRequest extends js.Object {
    var Identity: Identity
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait DeleteIdentityResponse extends js.Object {}

  /**
    * Represents a request to delete an IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait DeleteReceiptFilterRequest extends js.Object {
    var FilterName: ReceiptFilterName
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait DeleteReceiptFilterResponse extends js.Object {}

  /**
    * Represents a request to delete a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait DeleteReceiptRuleRequest extends js.Object {
    var RuleName: ReceiptRuleName
    var RuleSetName: ReceiptRuleSetName
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait DeleteReceiptRuleResponse extends js.Object {}

  /**
    * Represents a request to delete a receipt rule set and all of the receipt rules it contains. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait DeleteReceiptRuleSetRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait DeleteReceiptRuleSetResponse extends js.Object {}

  /**
    * Represents a request to delete an email template. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait DeleteTemplateRequest extends js.Object {
    var TemplateName: TemplateName
  }

  @js.native
  @Factory
  trait DeleteTemplateResponse extends js.Object {}

  /**
    * Represents a request to delete an email address from the list of email addresses you have attempted to verify under your AWS account.
    */
  @js.native
  @Factory
  trait DeleteVerifiedEmailAddressRequest extends js.Object {
    var EmailAddress: Address
  }

  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
    */
  @js.native
  @Factory
  trait DeliveryOptions extends js.Object {
    var TlsPolicy: js.UndefOr[TlsPolicy]
  }

  /**
    * Represents a request to return the metadata and receipt rules for the receipt rule set that is currently active. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait DescribeActiveReceiptRuleSetRequest extends js.Object {}

  /**
    * Represents the metadata and receipt rules for the receipt rule set that is currently active.
    */
  @js.native
  @Factory
  trait DescribeActiveReceiptRuleSetResponse extends js.Object {
    var Metadata: js.UndefOr[ReceiptRuleSetMetadata]
    var Rules: js.UndefOr[ReceiptRulesList]
  }

  /**
    * Represents a request to return the details of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait DescribeConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var ConfigurationSetAttributeNames: js.UndefOr[ConfigurationSetAttributeList]
  }

  /**
    * Represents the details of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait DescribeConfigurationSetResponse extends js.Object {
    var ConfigurationSet: js.UndefOr[ConfigurationSet]
    var DeliveryOptions: js.UndefOr[DeliveryOptions]
    var EventDestinations: js.UndefOr[EventDestinations]
    var ReputationOptions: js.UndefOr[ReputationOptions]
    var TrackingOptions: js.UndefOr[TrackingOptions]
  }

  /**
    * Represents a request to return the details of a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait DescribeReceiptRuleRequest extends js.Object {
    var RuleName: ReceiptRuleName
    var RuleSetName: ReceiptRuleSetName
  }

  /**
    * Represents the details of a receipt rule.
    */
  @js.native
  @Factory
  trait DescribeReceiptRuleResponse extends js.Object {
    var Rule: js.UndefOr[ReceiptRule]
  }

  /**
    * Represents a request to return the details of a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait DescribeReceiptRuleSetRequest extends js.Object {
    var RuleSetName: ReceiptRuleSetName
  }

  /**
    * Represents the details of the specified receipt rule set.
    */
  @js.native
  @Factory
  trait DescribeReceiptRuleSetResponse extends js.Object {
    var Metadata: js.UndefOr[ReceiptRuleSetMetadata]
    var Rules: js.UndefOr[ReceiptRulesList]
  }

  /**
    * Represents the destination of the message, consisting of To:, CC:, and BCC: fields.
    *
    * '''Note:'''Amazon SES does not support the SMTPUTF8 extension, as described in [[https://tools.ietf.org/html/rfc6531|RFC6531]]. For this reason, the <i>local part</i> of a destination email address (the part of the email address that precedes the @ sign) may only contain [[https://en.wikipedia.org/wiki/Email_address#Local-part|7-bit ASCII characters]]. If the <i>domain part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in [[https://tools.ietf.org/html/rfc3492.html|RFC3492]].
    */
  @js.native
  @Factory
  trait Destination extends js.Object {
    var BccAddresses: js.UndefOr[AddressList]
    var CcAddresses: js.UndefOr[AddressList]
    var ToAddresses: js.UndefOr[AddressList]
  }

  @js.native
  sealed trait DimensionValueSource extends js.Any
  object DimensionValueSource extends js.Object {
    val messageTag  = "messageTag".asInstanceOf[DimensionValueSource]
    val emailHeader = "emailHeader".asInstanceOf[DimensionValueSource]
    val linkTag     = "linkTag".asInstanceOf[DimensionValueSource]

    val values = js.Object.freeze(js.Array(messageTag, emailHeader, linkTag))
  }

  @js.native
  sealed trait DsnAction extends js.Any
  object DsnAction extends js.Object {
    val failed    = "failed".asInstanceOf[DsnAction]
    val delayed   = "delayed".asInstanceOf[DsnAction]
    val delivered = "delivered".asInstanceOf[DsnAction]
    val relayed   = "relayed".asInstanceOf[DsnAction]
    val expanded  = "expanded".asInstanceOf[DsnAction]

    val values = js.Object.freeze(js.Array(failed, delayed, delivered, relayed, expanded))
  }

  /**
    * Contains information about the event destination that the specified email sending events will be published to.
    *
    * '''Note:'''When you create or update an event destination, you must provide one, and only one, destination. The destination can be Amazon CloudWatch, Amazon Kinesis Firehose or Amazon Simple Notification Service (Amazon SNS).
    * Event destinations are associated with configuration sets, which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS). For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait EventDestination extends js.Object {
    var MatchingEventTypes: EventTypes
    var Name: EventDestinationName
    var CloudWatchDestination: js.UndefOr[CloudWatchDestination]
    var Enabled: js.UndefOr[Enabled]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var SNSDestination: js.UndefOr[SNSDestination]
  }

  @js.native
  sealed trait EventType extends js.Any
  object EventType extends js.Object {
    val send             = "send".asInstanceOf[EventType]
    val reject           = "reject".asInstanceOf[EventType]
    val bounce           = "bounce".asInstanceOf[EventType]
    val complaint        = "complaint".asInstanceOf[EventType]
    val delivery         = "delivery".asInstanceOf[EventType]
    val open             = "open".asInstanceOf[EventType]
    val click            = "click".asInstanceOf[EventType]
    val renderingFailure = "renderingFailure".asInstanceOf[EventType]

    val values = js.Object.freeze(js.Array(send, reject, bounce, complaint, delivery, open, click, renderingFailure))
  }

  /**
    * Additional X-headers to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.
    *  For information about receiving email through Amazon SES, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ExtensionField extends js.Object {
    var Name: ExtensionFieldName
    var Value: ExtensionFieldValue
  }

  /**
    * Represents a request to return the email sending status for your Amazon SES account in the current AWS Region.
    */
  @js.native
  @Factory
  trait GetAccountSendingEnabledResponse extends js.Object {
    var Enabled: js.UndefOr[Enabled]
  }

  /**
    * Represents a request to retrieve an existing custom verification email template.
    */
  @js.native
  @Factory
  trait GetCustomVerificationEmailTemplateRequest extends js.Object {
    var TemplateName: TemplateName
  }

  /**
    * The content of the custom verification email template.
    */
  @js.native
  @Factory
  trait GetCustomVerificationEmailTemplateResponse extends js.Object {
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL]
    var FromEmailAddress: js.UndefOr[FromAddress]
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL]
    var TemplateContent: js.UndefOr[TemplateContent]
    var TemplateName: js.UndefOr[TemplateName]
    var TemplateSubject: js.UndefOr[Subject]
  }

  /**
    * Represents a request for the status of Amazon SES Easy DKIM signing for an identity. For domain identities, this request also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES successfully verified that these tokens were published. For more information about Easy DKIM, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait GetIdentityDkimAttributesRequest extends js.Object {
    var Identities: IdentityList
  }

  /**
    * Represents the status of Amazon SES Easy DKIM signing for an identity. For domain identities, this response also contains the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES successfully verified that these tokens were published.
    */
  @js.native
  @Factory
  trait GetIdentityDkimAttributesResponse extends js.Object {
    var DkimAttributes: DkimAttributes
  }

  /**
    * Represents a request to return the Amazon SES custom MAIL FROM attributes for a list of identities. For information about using a custom MAIL FROM domain, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait GetIdentityMailFromDomainAttributesRequest extends js.Object {
    var Identities: IdentityList
  }

  /**
    * Represents the custom MAIL FROM attributes for a list of identities.
    */
  @js.native
  @Factory
  trait GetIdentityMailFromDomainAttributesResponse extends js.Object {
    var MailFromDomainAttributes: MailFromDomainAttributes
  }

  /**
    * Represents a request to return the notification attributes for a list of identities you verified with Amazon SES. For information about Amazon SES notifications, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait GetIdentityNotificationAttributesRequest extends js.Object {
    var Identities: IdentityList
  }

  /**
    * Represents the notification attributes for a list of identities.
    */
  @js.native
  @Factory
  trait GetIdentityNotificationAttributesResponse extends js.Object {
    var NotificationAttributes: NotificationAttributes
  }

  /**
    * Represents a request to return the requested sending authorization policies for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait GetIdentityPoliciesRequest extends js.Object {
    var Identity: Identity
    var PolicyNames: PolicyNameList
  }

  /**
    * Represents the requested sending authorization policies.
    */
  @js.native
  @Factory
  trait GetIdentityPoliciesResponse extends js.Object {
    var Policies: PolicyMap
  }

  /**
    * Represents a request to return the Amazon SES verification status of a list of identities. For domain identities, this request also returns the verification token. For information about verifying identities with Amazon SES, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait GetIdentityVerificationAttributesRequest extends js.Object {
    var Identities: IdentityList
  }

  /**
    * The Amazon SES verification status of a list of identities. For domain identities, this response also contains the verification token.
    */
  @js.native
  @Factory
  trait GetIdentityVerificationAttributesResponse extends js.Object {
    var VerificationAttributes: VerificationAttributes
  }

  /**
    * Represents your Amazon SES daily sending quota, maximum send rate, and the number of emails you have sent in the last 24 hours.
    */
  @js.native
  @Factory
  trait GetSendQuotaResponse extends js.Object {
    var Max24HourSend: js.UndefOr[Max24HourSend]
    var MaxSendRate: js.UndefOr[MaxSendRate]
    var SentLast24Hours: js.UndefOr[SentLast24Hours]
  }

  /**
    * Represents a list of data points. This list contains aggregated data from the previous two weeks of your sending activity with Amazon SES.
    */
  @js.native
  @Factory
  trait GetSendStatisticsResponse extends js.Object {
    var SendDataPoints: js.UndefOr[SendDataPointList]
  }

  @js.native
  @Factory
  trait GetTemplateRequest extends js.Object {
    var TemplateName: TemplateName
  }

  @js.native
  @Factory
  trait GetTemplateResponse extends js.Object {
    var Template: js.UndefOr[Template]
  }

  /**
    * Represents the DKIM attributes of a verified email address or a domain.
    */
  @js.native
  @Factory
  trait IdentityDkimAttributes extends js.Object {
    var DkimEnabled: Enabled
    var DkimVerificationStatus: VerificationStatus
    var DkimTokens: js.UndefOr[VerificationTokenList]
  }

  /**
    * Represents the custom MAIL FROM domain attributes of a verified identity (email address or domain).
    */
  @js.native
  @Factory
  trait IdentityMailFromDomainAttributes extends js.Object {
    var BehaviorOnMXFailure: BehaviorOnMXFailure
    var MailFromDomain: MailFromDomainName
    var MailFromDomainStatus: CustomMailFromStatus
  }

  /**
    * Represents the notification attributes of an identity, including whether an identity has Amazon Simple Notification Service (Amazon SNS) topics set for bounce, complaint, and/or delivery notifications, and whether feedback forwarding is enabled for bounce and complaint notifications.
    */
  @js.native
  @Factory
  trait IdentityNotificationAttributes extends js.Object {
    var BounceTopic: NotificationTopic
    var ComplaintTopic: NotificationTopic
    var DeliveryTopic: NotificationTopic
    var ForwardingEnabled: Enabled
    var HeadersInBounceNotificationsEnabled: js.UndefOr[Enabled]
    var HeadersInComplaintNotificationsEnabled: js.UndefOr[Enabled]
    var HeadersInDeliveryNotificationsEnabled: js.UndefOr[Enabled]
  }

  @js.native
  sealed trait IdentityType extends js.Any
  object IdentityType extends js.Object {
    val EmailAddress = "EmailAddress".asInstanceOf[IdentityType]
    val Domain       = "Domain".asInstanceOf[IdentityType]

    val values = js.Object.freeze(js.Array(EmailAddress, Domain))
  }

  /**
    * Represents the verification attributes of a single identity.
    */
  @js.native
  @Factory
  trait IdentityVerificationAttributes extends js.Object {
    var VerificationStatus: VerificationStatus
    var VerificationToken: js.UndefOr[VerificationToken]
  }

  @js.native
  sealed trait InvocationType extends js.Any
  object InvocationType extends js.Object {
    val Event           = "Event".asInstanceOf[InvocationType]
    val RequestResponse = "RequestResponse".asInstanceOf[InvocationType]

    val values = js.Object.freeze(js.Array(Event, RequestResponse))
  }

  /**
    * Contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose event destination.
    *  Event destinations, such as Amazon Kinesis Firehose, are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait KinesisFirehoseDestination extends js.Object {
    var DeliveryStreamARN: AmazonResourceName
    var IAMRoleARN: AmazonResourceName
  }

  /**
    * When included in a receipt rule, this action calls an AWS Lambda function and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    *  To enable Amazon SES to call your AWS Lambda function or to publish to an Amazon SNS topic of another account, Amazon SES must have permission to access those resources. For information about giving permissions, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html|Amazon SES Developer Guide]].
    *  For information about using AWS Lambda actions in receipt rules, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-lambda.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait LambdaAction extends js.Object {
    var FunctionArn: AmazonResourceName
    var InvocationType: js.UndefOr[InvocationType]
    var TopicArn: js.UndefOr[AmazonResourceName]
  }

  /**
    * Represents a request to list the configuration sets associated with your AWS account. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ListConfigurationSetsRequest extends js.Object {
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * A list of configuration sets associated with your AWS account. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ListConfigurationSetsResponse extends js.Object {
    var ConfigurationSets: js.UndefOr[ConfigurationSets]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents a request to list the existing custom verification email templates for your account.
    *  For more information about custom verification email templates, see [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html|Using Custom Verification Email Templates]] in the <i>Amazon SES Developer Guide</i>.
    */
  @js.native
  @Factory
  trait ListCustomVerificationEmailTemplatesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * A paginated list of custom verification email templates.
    */
  @js.native
  @Factory
  trait ListCustomVerificationEmailTemplatesResponse extends js.Object {
    var CustomVerificationEmailTemplates: js.UndefOr[CustomVerificationEmailTemplates]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents a request to return a list of all identities (email addresses and domains) that you have attempted to verify under your AWS account, regardless of verification status.
    */
  @js.native
  @Factory
  trait ListIdentitiesRequest extends js.Object {
    var IdentityType: js.UndefOr[IdentityType]
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * A list of all identities that you have attempted to verify under your AWS account, regardless of verification status.
    */
  @js.native
  @Factory
  trait ListIdentitiesResponse extends js.Object {
    var Identities: IdentityList
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents a request to return a list of sending authorization policies that are attached to an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ListIdentityPoliciesRequest extends js.Object {
    var Identity: Identity
  }

  /**
    * A list of names of sending authorization policies that apply to an identity.
    */
  @js.native
  @Factory
  trait ListIdentityPoliciesResponse extends js.Object {
    var PolicyNames: PolicyNameList
  }

  /**
    * Represents a request to list the IP address filters that exist under your AWS account. You use IP address filters when you receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ListReceiptFiltersRequest extends js.Object {}

  /**
    * A list of IP address filters that exist under your AWS account.
    */
  @js.native
  @Factory
  trait ListReceiptFiltersResponse extends js.Object {
    var Filters: js.UndefOr[ReceiptFilterList]
  }

  /**
    * Represents a request to list the receipt rule sets that exist under your AWS account. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ListReceiptRuleSetsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * A list of receipt rule sets that exist under your AWS account.
    */
  @js.native
  @Factory
  trait ListReceiptRuleSetsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RuleSets: js.UndefOr[ReceiptRuleSetsLists]
  }

  @js.native
  @Factory
  trait ListTemplatesRequest extends js.Object {
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTemplatesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TemplatesMetadata: js.UndefOr[TemplateMetadataList]
  }

  /**
    * A list of email addresses that you have verified with Amazon SES under your AWS account.
    */
  @js.native
  @Factory
  trait ListVerifiedEmailAddressesResponse extends js.Object {
    var VerifiedEmailAddresses: js.UndefOr[AddressList]
  }

  /**
    * Represents the message to be sent, composed of a subject and a body.
    */
  @js.native
  @Factory
  trait Message extends js.Object {
    var Body: Body
    var Subject: Content
  }

  /**
    * Message-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.
    *  For information about receiving email through Amazon SES, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait MessageDsn extends js.Object {
    var ReportingMta: ReportingMta
    var ArrivalDate: js.UndefOr[ArrivalDate]
    var ExtensionFields: js.UndefOr[ExtensionFieldList]
  }

  /**
    * Contains the name and value of a tag that you can provide to <code>SendEmail</code> or <code>SendRawEmail</code> to apply to an email.
    *  Message tags, which you use with configuration sets, enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait MessageTag extends js.Object {
    var Name: MessageTagName
    var Value: MessageTagValue
  }

  @js.native
  sealed trait NotificationType extends js.Any
  object NotificationType extends js.Object {
    val Bounce    = "Bounce".asInstanceOf[NotificationType]
    val Complaint = "Complaint".asInstanceOf[NotificationType]
    val Delivery  = "Delivery".asInstanceOf[NotificationType]

    val values = js.Object.freeze(js.Array(Bounce, Complaint, Delivery))
  }

  /**
    * A request to modify the delivery options for a configuration set.
    */
  @js.native
  @Factory
  trait PutConfigurationSetDeliveryOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var DeliveryOptions: js.UndefOr[DeliveryOptions]
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait PutConfigurationSetDeliveryOptionsResponse extends js.Object {}

  /**
    * Represents a request to add or update a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait PutIdentityPolicyRequest extends js.Object {
    var Identity: Identity
    var Policy: Policy
    var PolicyName: PolicyName
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait PutIdentityPolicyResponse extends js.Object {}

  /**
    * Represents the raw data of the message.
    */
  @js.native
  @Factory
  trait RawMessage extends js.Object {
    var Data: RawMessageData
  }

  /**
    * An action that Amazon SES can take when it receives an email on behalf of one or more email addresses or domains that you own. An instance of this data type can represent only one action.
    *  For information about setting up receipt rules, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ReceiptAction extends js.Object {
    var AddHeaderAction: js.UndefOr[AddHeaderAction]
    var BounceAction: js.UndefOr[BounceAction]
    var LambdaAction: js.UndefOr[LambdaAction]
    var S3Action: js.UndefOr[S3Action]
    var SNSAction: js.UndefOr[SNSAction]
    var StopAction: js.UndefOr[StopAction]
    var WorkmailAction: js.UndefOr[WorkmailAction]
  }

  /**
    * A receipt IP address filter enables you to specify whether to accept or reject mail originating from an IP address or range of IP addresses.
    *  For information about setting up IP address filters, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ReceiptFilter extends js.Object {
    var IpFilter: ReceiptIpFilter
    var Name: ReceiptFilterName
  }

  @js.native
  sealed trait ReceiptFilterPolicy extends js.Any
  object ReceiptFilterPolicy extends js.Object {
    val Block = "Block".asInstanceOf[ReceiptFilterPolicy]
    val Allow = "Allow".asInstanceOf[ReceiptFilterPolicy]

    val values = js.Object.freeze(js.Array(Block, Allow))
  }

  /**
    * A receipt IP address filter enables you to specify whether to accept or reject mail originating from an IP address or range of IP addresses.
    *  For information about setting up IP address filters, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ReceiptIpFilter extends js.Object {
    var Cidr: Cidr
    var Policy: ReceiptFilterPolicy
  }

  /**
    * Receipt rules enable you to specify which actions Amazon SES should take when it receives mail on behalf of one or more email addresses or domains that you own.
    *  Each receipt rule defines a set of email addresses or domains that it applies to. If the email addresses or domains match at least one recipient address of the message, Amazon SES executes all of the receipt rule's actions on the message.
    *  For information about setting up receipt rules, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ReceiptRule extends js.Object {
    var Name: ReceiptRuleName
    var Actions: js.UndefOr[ReceiptActionsList]
    var Enabled: js.UndefOr[Enabled]
    var Recipients: js.UndefOr[RecipientsList]
    var ScanEnabled: js.UndefOr[Enabled]
    var TlsPolicy: js.UndefOr[TlsPolicy]
  }

  /**
    * Information about a receipt rule set.
    *  A receipt rule set is a collection of rules that specify what Amazon SES should do with mail it receives on behalf of your account's verified domains.
    *  For information about setting up receipt rule sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ReceiptRuleSetMetadata extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ReceiptRuleSetName]
  }

  /**
    * Recipient-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES receives on your behalf bounces.
    *  For information about receiving email through Amazon SES, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait RecipientDsnFields extends js.Object {
    var Action: DsnAction
    var Status: DsnStatus
    var DiagnosticCode: js.UndefOr[DiagnosticCode]
    var ExtensionFields: js.UndefOr[ExtensionFieldList]
    var FinalRecipient: js.UndefOr[Address]
    var LastAttemptDate: js.UndefOr[LastAttemptDate]
    var RemoteMta: js.UndefOr[RemoteMta]
  }

  /**
    * Represents a request to reorder the receipt rules within a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait ReorderReceiptRuleSetRequest extends js.Object {
    var RuleNames: ReceiptRuleNamesList
    var RuleSetName: ReceiptRuleSetName
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait ReorderReceiptRuleSetResponse extends js.Object {}

  /**
    * Contains information about the reputation settings for a configuration set.
    */
  @js.native
  @Factory
  trait ReputationOptions extends js.Object {
    var LastFreshStart: js.UndefOr[LastFreshStart]
    var ReputationMetricsEnabled: js.UndefOr[Enabled]
    var SendingEnabled: js.UndefOr[Enabled]
  }

  /**
    * When included in a receipt rule, this action saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    *  To enable Amazon SES to write emails to your Amazon S3 bucket, use an AWS KMS key to encrypt your emails, or publish to an Amazon SNS topic of another account, Amazon SES must have permission to access those resources. For information about giving permissions, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html|Amazon SES Developer Guide]].
    *
    * '''Note:'''When you save your emails to an Amazon S3 bucket, the maximum email size (including headers) is 30 MB. Emails larger than that will bounce.
    * For information about specifying Amazon S3 actions in receipt rules, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-s3.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait S3Action extends js.Object {
    var BucketName: S3BucketName
    var KmsKeyArn: js.UndefOr[AmazonResourceName]
    var ObjectKeyPrefix: js.UndefOr[S3KeyPrefix]
    var TopicArn: js.UndefOr[AmazonResourceName]
  }

  /**
    * When included in a receipt rule, this action publishes a notification to Amazon Simple Notification Service (Amazon SNS). This action includes a complete copy of the email content in the Amazon SNS notifications. Amazon SNS notifications for all other actions simply provide information about the email. They do not include the email content itself.
    *  If you own the Amazon SNS topic, you don't need to do anything to give Amazon SES permission to publish emails to it. However, if you don't own the Amazon SNS topic, you need to attach a policy to the topic to give Amazon SES permissions to access it. For information about giving permissions, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html|Amazon SES Developer Guide]].
    *  <important> You can only publish emails that are 150 KB or less (including the header) to Amazon SNS. Larger emails will bounce. If you anticipate emails larger than 150 KB, use the S3 action instead.
    *  </important> For information about using a receipt rule to publish an Amazon SNS notification, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-sns.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait SNSAction extends js.Object {
    var TopicArn: AmazonResourceName
    var Encoding: js.UndefOr[SNSActionEncoding]
  }

  @js.native
  sealed trait SNSActionEncoding extends js.Any
  object SNSActionEncoding extends js.Object {
    val `UTF-8` = "UTF-8".asInstanceOf[SNSActionEncoding]
    val Base64  = "Base64".asInstanceOf[SNSActionEncoding]

    val values = js.Object.freeze(js.Array(`UTF-8`, Base64))
  }

  /**
    * Contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event destination.
    *  Event destinations, such as Amazon SNS, are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait SNSDestination extends js.Object {
    var TopicARN: AmazonResourceName
  }

  /**
    * Represents a request to send a bounce message to the sender of an email you received through Amazon SES.
    */
  @js.native
  @Factory
  trait SendBounceRequest extends js.Object {
    var BounceSender: Address
    var BouncedRecipientInfoList: BouncedRecipientInfoList
    var OriginalMessageId: MessageId
    var BounceSenderArn: js.UndefOr[AmazonResourceName]
    var Explanation: js.UndefOr[Explanation]
    var MessageDsn: js.UndefOr[MessageDsn]
  }

  /**
    * Represents a unique message ID.
    */
  @js.native
  @Factory
  trait SendBounceResponse extends js.Object {
    var MessageId: js.UndefOr[MessageId]
  }

  /**
    * Represents a request to send a templated email to multiple destinations using Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait SendBulkTemplatedEmailResponse extends js.Object {
    var Status: BulkEmailDestinationStatusList
  }

  /**
    * Represents a request to send a custom verification email to a specified recipient.
    */
  @js.native
  @Factory
  trait SendCustomVerificationEmailRequest extends js.Object {
    var EmailAddress: Address
    var TemplateName: TemplateName
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
  }

  /**
    * The response received when attempting to send the custom verification email.
    */
  @js.native
  @Factory
  trait SendCustomVerificationEmailResponse extends js.Object {
    var MessageId: js.UndefOr[MessageId]
  }

  /**
    * Represents sending statistics data. Each <code>SendDataPoint</code> contains statistics for a 15-minute period of sending activity.
    */
  @js.native
  @Factory
  trait SendDataPoint extends js.Object {
    var Bounces: js.UndefOr[Counter]
    var Complaints: js.UndefOr[Counter]
    var DeliveryAttempts: js.UndefOr[Counter]
    var Rejects: js.UndefOr[Counter]
    var Timestamp: js.UndefOr[Timestamp]
  }

  /**
    * Represents a request to send a single formatted email using Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
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

  /**
    * Represents a unique message ID.
    */
  @js.native
  @Factory
  trait SendEmailResponse extends js.Object {
    var MessageId: MessageId
  }

  /**
    * Represents a request to send a single raw email using Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
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

  /**
    * Represents a unique message ID.
    */
  @js.native
  @Factory
  trait SendRawEmailResponse extends js.Object {
    var MessageId: MessageId
  }

  /**
    * Represents a request to send a templated email using Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait SendTemplatedEmailResponse extends js.Object {
    var MessageId: MessageId
  }

  /**
    * Represents a request to set a receipt rule set as the active receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait SetActiveReceiptRuleSetRequest extends js.Object {
    var RuleSetName: js.UndefOr[ReceiptRuleSetName]
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait SetActiveReceiptRuleSetResponse extends js.Object {}

  /**
    * Represents a request to enable or disable Amazon SES Easy DKIM signing for an identity. For more information about setting up Easy DKIM, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait SetIdentityDkimEnabledRequest extends js.Object {
    var DkimEnabled: Enabled
    var Identity: Identity
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait SetIdentityDkimEnabledResponse extends js.Object {}

  /**
    * Represents a request to enable or disable whether Amazon SES forwards you bounce and complaint notifications through email. For information about email feedback forwarding, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-email.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait SetIdentityFeedbackForwardingEnabledRequest extends js.Object {
    var ForwardingEnabled: Enabled
    var Identity: Identity
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait SetIdentityFeedbackForwardingEnabledResponse extends js.Object {}

  /**
    * Represents a request to set whether Amazon SES includes the original email headers in the Amazon SNS notifications of a specified type. For information about notifications, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait SetIdentityHeadersInNotificationsEnabledRequest extends js.Object {
    var Enabled: Enabled
    var Identity: Identity
    var NotificationType: NotificationType
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait SetIdentityHeadersInNotificationsEnabledResponse extends js.Object {}

  /**
    * Represents a request to enable or disable the Amazon SES custom MAIL FROM domain setup for a verified identity. For information about using a custom MAIL FROM domain, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait SetIdentityMailFromDomainRequest extends js.Object {
    var Identity: Identity
    var BehaviorOnMXFailure: js.UndefOr[BehaviorOnMXFailure]
    var MailFromDomain: js.UndefOr[MailFromDomainName]
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait SetIdentityMailFromDomainResponse extends js.Object {}

  /**
    * Represents a request to specify the Amazon SNS topic to which Amazon SES will publish bounce, complaint, or delivery notifications for emails sent with that identity as the Source. For information about Amazon SES notifications, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait SetIdentityNotificationTopicRequest extends js.Object {
    var Identity: Identity
    var NotificationType: NotificationType
    var SnsTopic: js.UndefOr[NotificationTopic]
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait SetIdentityNotificationTopicResponse extends js.Object {}

  /**
    * Represents a request to set the position of a receipt rule in a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait SetReceiptRulePositionRequest extends js.Object {
    var RuleName: ReceiptRuleName
    var RuleSetName: ReceiptRuleSetName
    var After: js.UndefOr[ReceiptRuleName]
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait SetReceiptRulePositionResponse extends js.Object {}

  /**
    * When included in a receipt rule, this action terminates the evaluation of the receipt rule set and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    *  For information about setting a stop action in a receipt rule, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-stop.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait StopAction extends js.Object {
    var Scope: StopScope
    var TopicArn: js.UndefOr[AmazonResourceName]
  }

  @js.native
  sealed trait StopScope extends js.Any
  object StopScope extends js.Object {
    val RuleSet = "RuleSet".asInstanceOf[StopScope]

    val values = js.Object.freeze(js.Array(RuleSet))
  }

  /**
    * The content of the email, composed of a subject line, an HTML part, and a text-only part.
    */
  @js.native
  @Factory
  trait Template extends js.Object {
    var TemplateName: TemplateName
    var HtmlPart: js.UndefOr[HtmlPart]
    var SubjectPart: js.UndefOr[SubjectPart]
    var TextPart: js.UndefOr[TextPart]
  }

  /**
    * Contains information about an email template.
    */
  @js.native
  @Factory
  trait TemplateMetadata extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var Name: js.UndefOr[TemplateName]
  }

  @js.native
  @Factory
  trait TestRenderTemplateRequest extends js.Object {
    var TemplateData: TemplateData
    var TemplateName: TemplateName
  }

  @js.native
  @Factory
  trait TestRenderTemplateResponse extends js.Object {
    var RenderedTemplate: js.UndefOr[RenderedTemplate]
  }

  @js.native
  sealed trait TlsPolicy extends js.Any
  object TlsPolicy extends js.Object {
    val Require  = "Require".asInstanceOf[TlsPolicy]
    val Optional = "Optional".asInstanceOf[TlsPolicy]

    val values = js.Object.freeze(js.Array(Require, Optional))
  }

  /**
    * A domain that is used to redirect email recipients to an Amazon SES-operated domain. This domain captures open and click events generated by Amazon SES emails.
    *  For more information, see [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html|Configuring Custom Domains to Handle Open and Click Tracking]] in the <i>Amazon SES Developer Guide</i>.
    */
  @js.native
  @Factory
  trait TrackingOptions extends js.Object {
    var CustomRedirectDomain: js.UndefOr[CustomRedirectDomain]
  }

  /**
    * Represents a request to enable or disable the email sending capabilities for your entire Amazon SES account.
    */
  @js.native
  @Factory
  trait UpdateAccountSendingEnabledRequest extends js.Object {
    var Enabled: js.UndefOr[Enabled]
  }

  /**
    * Represents a request to update the event destination of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestination: EventDestination
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait UpdateConfigurationSetEventDestinationResponse extends js.Object {}

  /**
    * Represents a request to modify the reputation metric publishing settings for a configuration set.
    */
  @js.native
  @Factory
  trait UpdateConfigurationSetReputationMetricsEnabledRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var Enabled: Enabled
  }

  /**
    * Represents a request to enable or disable the email sending capabilities for a specific configuration set.
    */
  @js.native
  @Factory
  trait UpdateConfigurationSetSendingEnabledRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var Enabled: Enabled
  }

  /**
    * Represents a request to update the tracking options for a configuration set.
    */
  @js.native
  @Factory
  trait UpdateConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var TrackingOptions: TrackingOptions
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait UpdateConfigurationSetTrackingOptionsResponse extends js.Object {}

  /**
    * Represents a request to update an existing custom verification email template.
    */
  @js.native
  @Factory
  trait UpdateCustomVerificationEmailTemplateRequest extends js.Object {
    var TemplateName: TemplateName
    var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL]
    var FromEmailAddress: js.UndefOr[FromAddress]
    var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL]
    var TemplateContent: js.UndefOr[TemplateContent]
    var TemplateSubject: js.UndefOr[Subject]
  }

  /**
    * Represents a request to update a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait UpdateReceiptRuleRequest extends js.Object {
    var Rule: ReceiptRule
    var RuleSetName: ReceiptRuleSetName
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait UpdateReceiptRuleResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateTemplateRequest extends js.Object {
    var Template: Template
  }

  @js.native
  @Factory
  trait UpdateTemplateResponse extends js.Object {}

  @js.native
  sealed trait VerificationStatus extends js.Any
  object VerificationStatus extends js.Object {
    val Pending          = "Pending".asInstanceOf[VerificationStatus]
    val Success          = "Success".asInstanceOf[VerificationStatus]
    val Failed           = "Failed".asInstanceOf[VerificationStatus]
    val TemporaryFailure = "TemporaryFailure".asInstanceOf[VerificationStatus]
    val NotStarted       = "NotStarted".asInstanceOf[VerificationStatus]

    val values = js.Object.freeze(js.Array(Pending, Success, Failed, TemporaryFailure, NotStarted))
  }

  /**
    * Represents a request to generate the CNAME records needed to set up Easy DKIM with Amazon SES. For more information about setting up Easy DKIM, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait VerifyDomainDkimRequest extends js.Object {
    var Domain: Domain
  }

  /**
    * Returns CNAME records that you must publish to the DNS server of your domain to set up Easy DKIM with Amazon SES.
    */
  @js.native
  @Factory
  trait VerifyDomainDkimResponse extends js.Object {
    var DkimTokens: VerificationTokenList
  }

  /**
    * Represents a request to begin Amazon SES domain verification and to generate the TXT records that you must publish to the DNS server of your domain to complete the verification. For information about domain verification, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait VerifyDomainIdentityRequest extends js.Object {
    var Domain: Domain
  }

  /**
    * Returns a TXT record that you must publish to the DNS server of your domain to complete domain verification with Amazon SES.
    */
  @js.native
  @Factory
  trait VerifyDomainIdentityResponse extends js.Object {
    var VerificationToken: VerificationToken
  }

  /**
    * Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait VerifyEmailAddressRequest extends js.Object {
    var EmailAddress: Address
  }

  /**
    * Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait VerifyEmailIdentityRequest extends js.Object {
    var EmailAddress: Address
  }

  /**
    * An empty element returned on a successful request.
    */
  @js.native
  @Factory
  trait VerifyEmailIdentityResponse extends js.Object {}

  /**
    * When included in a receipt rule, this action calls Amazon WorkMail and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS). You will typically not use this action directly because Amazon WorkMail adds the rule automatically during its setup procedure.
    *  For information using a receipt rule to call Amazon WorkMail, see the [[https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-workmail.html|Amazon SES Developer Guide]].
    */
  @js.native
  @Factory
  trait WorkmailAction extends js.Object {
    var OrganizationArn: AmazonResourceName
    var TopicArn: js.UndefOr[AmazonResourceName]
  }
}
