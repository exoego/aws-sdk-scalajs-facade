package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object pinpointemail {
  type AmazonResourceName                  = String
  type BlacklistEntries                    = js.Array[BlacklistEntry]
  type BlacklistItemName                   = String
  type BlacklistItemNames                  = js.Array[BlacklistItemName]
  type BlacklistReport                     = js.Dictionary[BlacklistEntries]
  type BlacklistingDescription             = String
  type CampaignId                          = String
  type Charset                             = String
  type CloudWatchDimensionConfigurations   = js.Array[CloudWatchDimensionConfiguration]
  type ConfigurationSetName                = String
  type ConfigurationSetNameList            = js.Array[ConfigurationSetName]
  type CustomRedirectDomain                = String
  type DailyVolumes                        = js.Array[DailyVolume]
  type DedicatedIpList                     = js.Array[DedicatedIp]
  type DefaultDimensionValue               = String
  type DeliverabilityTestReports           = js.Array[DeliverabilityTestReport]
  type DeliverabilityTestSubject           = String
  type DimensionName                       = String
  type DnsToken                            = String
  type DnsTokenList                        = js.Array[DnsToken]
  type Domain                              = String
  type DomainDeliverabilityCampaignList    = js.Array[DomainDeliverabilityCampaign]
  type DomainDeliverabilityTrackingOptions = js.Array[DomainDeliverabilityTrackingOption]
  type DomainIspPlacements                 = js.Array[DomainIspPlacement]
  type EmailAddress                        = String
  type EmailAddressList                    = js.Array[EmailAddress]
  type Enabled                             = Boolean
  type Esp                                 = String
  type Esps                                = js.Array[Esp]
  type EventDestinationName                = String
  type EventDestinations                   = js.Array[EventDestination]
  type EventTypes                          = js.Array[EventType]
  type GeneralEnforcementStatus            = String
  type Identity                            = String
  type IdentityInfoList                    = js.Array[IdentityInfo]
  type ImageUrl                            = String
  type Ip                                  = String
  type IpList                              = js.Array[Ip]
  type IspName                             = String
  type IspNameList                         = js.Array[IspName]
  type IspPlacements                       = js.Array[IspPlacement]
  type LastFreshStart                      = js.Date
  type ListOfDedicatedIpPools              = js.Array[PoolName]
  type MailFromDomainName                  = String
  type Max24HourSend                       = Double
  type MaxItems                            = Int
  type MaxSendRate                         = Double
  type MessageContent                      = String
  type MessageData                         = String
  type MessageTagList                      = js.Array[MessageTag]
  type MessageTagName                      = String
  type MessageTagValue                     = String
  type NextToken                           = String
  type OutboundMessageId                   = String
  type Percentage                          = Double
  type Percentage100Wrapper                = Int
  type PoolName                            = String
  type RawMessageData                      = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type RblName                             = String
  type ReportId                            = String
  type ReportName                          = String
  type SendingPoolName                     = String
  type SentLast24Hours                     = Double
  type Subject                             = String
  type TagKey                              = String
  type TagKeyList                          = js.Array[TagKey]
  type TagList                             = js.Array[Tag]
  type TagValue                            = String
  type TemplateArn                         = String
  type TemplateData                        = String
  type Timestamp                           = js.Date
  type Volume                              = Double

  implicit final class PinpointEmailOps(private val service: PinpointEmail) extends AnyVal {

    @inline def createConfigurationSetEventDestinationFuture(
        params: CreateConfigurationSetEventDestinationRequest
    ): Future[CreateConfigurationSetEventDestinationResponse] =
      service.createConfigurationSetEventDestination(params).promise().toFuture
    @inline def createConfigurationSetFuture(
        params: CreateConfigurationSetRequest
    ): Future[CreateConfigurationSetResponse] = service.createConfigurationSet(params).promise().toFuture
    @inline def createDedicatedIpPoolFuture(
        params: CreateDedicatedIpPoolRequest
    ): Future[CreateDedicatedIpPoolResponse] = service.createDedicatedIpPool(params).promise().toFuture
    @inline def createDeliverabilityTestReportFuture(
        params: CreateDeliverabilityTestReportRequest
    ): Future[CreateDeliverabilityTestReportResponse] =
      service.createDeliverabilityTestReport(params).promise().toFuture
    @inline def createEmailIdentityFuture(params: CreateEmailIdentityRequest): Future[CreateEmailIdentityResponse] =
      service.createEmailIdentity(params).promise().toFuture
    @inline def deleteConfigurationSetEventDestinationFuture(
        params: DeleteConfigurationSetEventDestinationRequest
    ): Future[DeleteConfigurationSetEventDestinationResponse] =
      service.deleteConfigurationSetEventDestination(params).promise().toFuture
    @inline def deleteConfigurationSetFuture(
        params: DeleteConfigurationSetRequest
    ): Future[DeleteConfigurationSetResponse] = service.deleteConfigurationSet(params).promise().toFuture
    @inline def deleteDedicatedIpPoolFuture(
        params: DeleteDedicatedIpPoolRequest
    ): Future[DeleteDedicatedIpPoolResponse] = service.deleteDedicatedIpPool(params).promise().toFuture
    @inline def deleteEmailIdentityFuture(params: DeleteEmailIdentityRequest): Future[DeleteEmailIdentityResponse] =
      service.deleteEmailIdentity(params).promise().toFuture
    @inline def getAccountFuture(params: GetAccountRequest): Future[GetAccountResponse] =
      service.getAccount(params).promise().toFuture
    @inline def getBlacklistReportsFuture(params: GetBlacklistReportsRequest): Future[GetBlacklistReportsResponse] =
      service.getBlacklistReports(params).promise().toFuture
    @inline def getConfigurationSetEventDestinationsFuture(
        params: GetConfigurationSetEventDestinationsRequest
    ): Future[GetConfigurationSetEventDestinationsResponse] =
      service.getConfigurationSetEventDestinations(params).promise().toFuture
    @inline def getConfigurationSetFuture(params: GetConfigurationSetRequest): Future[GetConfigurationSetResponse] =
      service.getConfigurationSet(params).promise().toFuture
    @inline def getDedicatedIpFuture(params: GetDedicatedIpRequest): Future[GetDedicatedIpResponse] =
      service.getDedicatedIp(params).promise().toFuture
    @inline def getDedicatedIpsFuture(params: GetDedicatedIpsRequest): Future[GetDedicatedIpsResponse] =
      service.getDedicatedIps(params).promise().toFuture
    @inline def getDeliverabilityDashboardOptionsFuture(
        params: GetDeliverabilityDashboardOptionsRequest
    ): Future[GetDeliverabilityDashboardOptionsResponse] =
      service.getDeliverabilityDashboardOptions(params).promise().toFuture
    @inline def getDeliverabilityTestReportFuture(
        params: GetDeliverabilityTestReportRequest
    ): Future[GetDeliverabilityTestReportResponse] = service.getDeliverabilityTestReport(params).promise().toFuture
    @inline def getDomainDeliverabilityCampaignFuture(
        params: GetDomainDeliverabilityCampaignRequest
    ): Future[GetDomainDeliverabilityCampaignResponse] =
      service.getDomainDeliverabilityCampaign(params).promise().toFuture
    @inline def getDomainStatisticsReportFuture(
        params: GetDomainStatisticsReportRequest
    ): Future[GetDomainStatisticsReportResponse] = service.getDomainStatisticsReport(params).promise().toFuture
    @inline def getEmailIdentityFuture(params: GetEmailIdentityRequest): Future[GetEmailIdentityResponse] =
      service.getEmailIdentity(params).promise().toFuture
    @inline def listConfigurationSetsFuture(
        params: ListConfigurationSetsRequest
    ): Future[ListConfigurationSetsResponse] = service.listConfigurationSets(params).promise().toFuture
    @inline def listDedicatedIpPoolsFuture(params: ListDedicatedIpPoolsRequest): Future[ListDedicatedIpPoolsResponse] =
      service.listDedicatedIpPools(params).promise().toFuture
    @inline def listDeliverabilityTestReportsFuture(
        params: ListDeliverabilityTestReportsRequest
    ): Future[ListDeliverabilityTestReportsResponse] = service.listDeliverabilityTestReports(params).promise().toFuture
    @inline def listDomainDeliverabilityCampaignsFuture(
        params: ListDomainDeliverabilityCampaignsRequest
    ): Future[ListDomainDeliverabilityCampaignsResponse] =
      service.listDomainDeliverabilityCampaigns(params).promise().toFuture
    @inline def listEmailIdentitiesFuture(params: ListEmailIdentitiesRequest): Future[ListEmailIdentitiesResponse] =
      service.listEmailIdentities(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putAccountDedicatedIpWarmupAttributesFuture(
        params: PutAccountDedicatedIpWarmupAttributesRequest
    ): Future[PutAccountDedicatedIpWarmupAttributesResponse] =
      service.putAccountDedicatedIpWarmupAttributes(params).promise().toFuture
    @inline def putAccountSendingAttributesFuture(
        params: PutAccountSendingAttributesRequest
    ): Future[PutAccountSendingAttributesResponse] = service.putAccountSendingAttributes(params).promise().toFuture
    @inline def putConfigurationSetDeliveryOptionsFuture(
        params: PutConfigurationSetDeliveryOptionsRequest
    ): Future[PutConfigurationSetDeliveryOptionsResponse] =
      service.putConfigurationSetDeliveryOptions(params).promise().toFuture
    @inline def putConfigurationSetReputationOptionsFuture(
        params: PutConfigurationSetReputationOptionsRequest
    ): Future[PutConfigurationSetReputationOptionsResponse] =
      service.putConfigurationSetReputationOptions(params).promise().toFuture
    @inline def putConfigurationSetSendingOptionsFuture(
        params: PutConfigurationSetSendingOptionsRequest
    ): Future[PutConfigurationSetSendingOptionsResponse] =
      service.putConfigurationSetSendingOptions(params).promise().toFuture
    @inline def putConfigurationSetTrackingOptionsFuture(
        params: PutConfigurationSetTrackingOptionsRequest
    ): Future[PutConfigurationSetTrackingOptionsResponse] =
      service.putConfigurationSetTrackingOptions(params).promise().toFuture
    @inline def putDedicatedIpInPoolFuture(params: PutDedicatedIpInPoolRequest): Future[PutDedicatedIpInPoolResponse] =
      service.putDedicatedIpInPool(params).promise().toFuture
    @inline def putDedicatedIpWarmupAttributesFuture(
        params: PutDedicatedIpWarmupAttributesRequest
    ): Future[PutDedicatedIpWarmupAttributesResponse] =
      service.putDedicatedIpWarmupAttributes(params).promise().toFuture
    @inline def putDeliverabilityDashboardOptionFuture(
        params: PutDeliverabilityDashboardOptionRequest
    ): Future[PutDeliverabilityDashboardOptionResponse] =
      service.putDeliverabilityDashboardOption(params).promise().toFuture
    @inline def putEmailIdentityDkimAttributesFuture(
        params: PutEmailIdentityDkimAttributesRequest
    ): Future[PutEmailIdentityDkimAttributesResponse] =
      service.putEmailIdentityDkimAttributes(params).promise().toFuture
    @inline def putEmailIdentityFeedbackAttributesFuture(
        params: PutEmailIdentityFeedbackAttributesRequest
    ): Future[PutEmailIdentityFeedbackAttributesResponse] =
      service.putEmailIdentityFeedbackAttributes(params).promise().toFuture
    @inline def putEmailIdentityMailFromAttributesFuture(
        params: PutEmailIdentityMailFromAttributesRequest
    ): Future[PutEmailIdentityMailFromAttributesResponse] =
      service.putEmailIdentityMailFromAttributes(params).promise().toFuture
    @inline def sendEmailFuture(params: SendEmailRequest): Future[SendEmailResponse] =
      service.sendEmail(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateConfigurationSetEventDestinationFuture(
        params: UpdateConfigurationSetEventDestinationRequest
    ): Future[UpdateConfigurationSetEventDestinationResponse] =
      service.updateConfigurationSetEventDestination(params).promise().toFuture
  }
}

package pinpointemail {
  @js.native
  @JSImport("aws-sdk", "PinpointEmail")
  class PinpointEmail() extends js.Object {
    def this(config: AWSConfig) = this()

    def createConfigurationSet(params: CreateConfigurationSetRequest): Request[CreateConfigurationSetResponse] =
      js.native
    def createConfigurationSetEventDestination(
        params: CreateConfigurationSetEventDestinationRequest
    ): Request[CreateConfigurationSetEventDestinationResponse]                                              = js.native
    def createDedicatedIpPool(params: CreateDedicatedIpPoolRequest): Request[CreateDedicatedIpPoolResponse] = js.native
    def createDeliverabilityTestReport(
        params: CreateDeliverabilityTestReportRequest
    ): Request[CreateDeliverabilityTestReportResponse]                                                = js.native
    def createEmailIdentity(params: CreateEmailIdentityRequest): Request[CreateEmailIdentityResponse] = js.native
    def deleteConfigurationSet(params: DeleteConfigurationSetRequest): Request[DeleteConfigurationSetResponse] =
      js.native
    def deleteConfigurationSetEventDestination(
        params: DeleteConfigurationSetEventDestinationRequest
    ): Request[DeleteConfigurationSetEventDestinationResponse]                                              = js.native
    def deleteDedicatedIpPool(params: DeleteDedicatedIpPoolRequest): Request[DeleteDedicatedIpPoolResponse] = js.native
    def deleteEmailIdentity(params: DeleteEmailIdentityRequest): Request[DeleteEmailIdentityResponse]       = js.native
    def getAccount(params: GetAccountRequest): Request[GetAccountResponse]                                  = js.native
    def getBlacklistReports(params: GetBlacklistReportsRequest): Request[GetBlacklistReportsResponse]       = js.native
    def getConfigurationSet(params: GetConfigurationSetRequest): Request[GetConfigurationSetResponse]       = js.native
    def getConfigurationSetEventDestinations(
        params: GetConfigurationSetEventDestinationsRequest
    ): Request[GetConfigurationSetEventDestinationsResponse]                              = js.native
    def getDedicatedIp(params: GetDedicatedIpRequest): Request[GetDedicatedIpResponse]    = js.native
    def getDedicatedIps(params: GetDedicatedIpsRequest): Request[GetDedicatedIpsResponse] = js.native
    def getDeliverabilityDashboardOptions(
        params: GetDeliverabilityDashboardOptionsRequest
    ): Request[GetDeliverabilityDashboardOptionsResponse] = js.native
    def getDeliverabilityTestReport(
        params: GetDeliverabilityTestReportRequest
    ): Request[GetDeliverabilityTestReportResponse] = js.native
    def getDomainDeliverabilityCampaign(
        params: GetDomainDeliverabilityCampaignRequest
    ): Request[GetDomainDeliverabilityCampaignResponse] = js.native
    def getDomainStatisticsReport(
        params: GetDomainStatisticsReportRequest
    ): Request[GetDomainStatisticsReportResponse]                                                           = js.native
    def getEmailIdentity(params: GetEmailIdentityRequest): Request[GetEmailIdentityResponse]                = js.native
    def listConfigurationSets(params: ListConfigurationSetsRequest): Request[ListConfigurationSetsResponse] = js.native
    def listDedicatedIpPools(params: ListDedicatedIpPoolsRequest): Request[ListDedicatedIpPoolsResponse]    = js.native
    def listDeliverabilityTestReports(
        params: ListDeliverabilityTestReportsRequest
    ): Request[ListDeliverabilityTestReportsResponse] = js.native
    def listDomainDeliverabilityCampaigns(
        params: ListDomainDeliverabilityCampaignsRequest
    ): Request[ListDomainDeliverabilityCampaignsResponse]                                             = js.native
    def listEmailIdentities(params: ListEmailIdentitiesRequest): Request[ListEmailIdentitiesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putAccountDedicatedIpWarmupAttributes(
        params: PutAccountDedicatedIpWarmupAttributesRequest
    ): Request[PutAccountDedicatedIpWarmupAttributesResponse] = js.native
    def putAccountSendingAttributes(
        params: PutAccountSendingAttributesRequest
    ): Request[PutAccountSendingAttributesResponse] = js.native
    def putConfigurationSetDeliveryOptions(
        params: PutConfigurationSetDeliveryOptionsRequest
    ): Request[PutConfigurationSetDeliveryOptionsResponse] = js.native
    def putConfigurationSetReputationOptions(
        params: PutConfigurationSetReputationOptionsRequest
    ): Request[PutConfigurationSetReputationOptionsResponse] = js.native
    def putConfigurationSetSendingOptions(
        params: PutConfigurationSetSendingOptionsRequest
    ): Request[PutConfigurationSetSendingOptionsResponse] = js.native
    def putConfigurationSetTrackingOptions(
        params: PutConfigurationSetTrackingOptionsRequest
    ): Request[PutConfigurationSetTrackingOptionsResponse]                                               = js.native
    def putDedicatedIpInPool(params: PutDedicatedIpInPoolRequest): Request[PutDedicatedIpInPoolResponse] = js.native
    def putDedicatedIpWarmupAttributes(
        params: PutDedicatedIpWarmupAttributesRequest
    ): Request[PutDedicatedIpWarmupAttributesResponse] = js.native
    def putDeliverabilityDashboardOption(
        params: PutDeliverabilityDashboardOptionRequest
    ): Request[PutDeliverabilityDashboardOptionResponse] = js.native
    def putEmailIdentityDkimAttributes(
        params: PutEmailIdentityDkimAttributesRequest
    ): Request[PutEmailIdentityDkimAttributesResponse] = js.native
    def putEmailIdentityFeedbackAttributes(
        params: PutEmailIdentityFeedbackAttributesRequest
    ): Request[PutEmailIdentityFeedbackAttributesResponse] = js.native
    def putEmailIdentityMailFromAttributes(
        params: PutEmailIdentityMailFromAttributesRequest
    ): Request[PutEmailIdentityMailFromAttributesResponse]                          = js.native
    def sendEmail(params: SendEmailRequest): Request[SendEmailResponse]             = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]       = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateConfigurationSetEventDestination(
        params: UpdateConfigurationSetEventDestinationRequest
    ): Request[UpdateConfigurationSetEventDestinationResponse] = js.native
  }

  /**
    * The action that you want Amazon Pinpoint to take if it can't read the required MX record for a custom MAIL FROM domain. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i> as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.
    *  These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
    */
  @js.native
  sealed trait BehaviorOnMxFailure extends js.Any
  object BehaviorOnMxFailure extends js.Object {
    val USE_DEFAULT_VALUE = "USE_DEFAULT_VALUE".asInstanceOf[BehaviorOnMxFailure]
    val REJECT_MESSAGE    = "REJECT_MESSAGE".asInstanceOf[BehaviorOnMxFailure]

    val values = js.Object.freeze(js.Array(USE_DEFAULT_VALUE, REJECT_MESSAGE))
  }

  /**
    * An object that contains information about a blacklisting event that impacts one of the dedicated IP addresses that is associated with your account.
    */
  @js.native
  @Factory
  trait BlacklistEntry extends js.Object {
    var Description: js.UndefOr[BlacklistingDescription]
    var ListingTime: js.UndefOr[Timestamp]
    var RblName: js.UndefOr[RblName]
  }

  /**
    * Represents the body of the email message.
    */
  @js.native
  @Factory
  trait Body extends js.Object {
    var Html: js.UndefOr[Content]
    var Text: js.UndefOr[Content]
  }

  /**
    * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
    */
  @js.native
  @Factory
  trait CloudWatchDestination extends js.Object {
    var DimensionConfigurations: CloudWatchDimensionConfigurations
  }

  /**
    * An object that defines the dimension configuration to use when you send Amazon Pinpoint email events to Amazon CloudWatch.
    */
  @js.native
  @Factory
  trait CloudWatchDimensionConfiguration extends js.Object {
    var DefaultDimensionValue: DefaultDimensionValue
    var DimensionName: DimensionName
    var DimensionValueSource: DimensionValueSource
  }

  /**
    * An object that represents the content of the email, and optionally a character set specification.
    */
  @js.native
  @Factory
  trait Content extends js.Object {
    var Data: MessageData
    var Charset: js.UndefOr[Charset]
  }

  /**
    * A request to add an event destination to a configuration set.
    */
  @js.native
  @Factory
  trait CreateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestination: EventDestinationDefinition
    var EventDestinationName: EventDestinationName
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait CreateConfigurationSetEventDestinationResponse extends js.Object {}

  /**
    * A request to create a configuration set.
    */
  @js.native
  @Factory
  trait CreateConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var DeliveryOptions: js.UndefOr[DeliveryOptions]
    var ReputationOptions: js.UndefOr[ReputationOptions]
    var SendingOptions: js.UndefOr[SendingOptions]
    var Tags: js.UndefOr[TagList]
    var TrackingOptions: js.UndefOr[TrackingOptions]
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait CreateConfigurationSetResponse extends js.Object {}

  /**
    * A request to create a new dedicated IP pool.
    */
  @js.native
  @Factory
  trait CreateDedicatedIpPoolRequest extends js.Object {
    var PoolName: PoolName
    var Tags: js.UndefOr[TagList]
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait CreateDedicatedIpPoolResponse extends js.Object {}

  /**
    * A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
    */
  @js.native
  @Factory
  trait CreateDeliverabilityTestReportRequest extends js.Object {
    var Content: EmailContent
    var FromEmailAddress: EmailAddress
    var ReportName: js.UndefOr[ReportName]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Information about the predictive inbox placement test that you created.
    */
  @js.native
  @Factory
  trait CreateDeliverabilityTestReportResponse extends js.Object {
    var DeliverabilityTestStatus: DeliverabilityTestStatus
    var ReportId: ReportId
  }

  /**
    * A request to begin the verification process for an email identity (an email address or domain).
    */
  @js.native
  @Factory
  trait CreateEmailIdentityRequest extends js.Object {
    var EmailIdentity: Identity
    var Tags: js.UndefOr[TagList]
  }

  /**
    * If the email identity is a domain, this object contains tokens that you can use to create a set of CNAME records. To sucessfully verify your domain, you have to add these records to the DNS configuration for your domain.
    *  If the email identity is an email address, this object is empty.
    */
  @js.native
  @Factory
  trait CreateEmailIdentityResponse extends js.Object {
    var DkimAttributes: js.UndefOr[DkimAttributes]
    var IdentityType: js.UndefOr[IdentityType]
    var VerifiedForSendingStatus: js.UndefOr[Enabled]
  }

  /**
    * An object that contains information about the volume of email sent on each day of the analysis period.
    */
  @js.native
  @Factory
  trait DailyVolume extends js.Object {
    var DomainIspPlacements: js.UndefOr[DomainIspPlacements]
    var StartDate: js.UndefOr[Timestamp]
    var VolumeStatistics: js.UndefOr[VolumeStatistics]
  }

  /**
    * Contains information about a dedicated IP address that is associated with your Amazon Pinpoint account.
    *  <p/>
    */
  @js.native
  @Factory
  trait DedicatedIp extends js.Object {
    var Ip: Ip
    var WarmupPercentage: Percentage100Wrapper
    var WarmupStatus: WarmupStatus
    var PoolName: js.UndefOr[PoolName]
  }

  /**
    * A request to delete an event destination from a configuration set.
    */
  @js.native
  @Factory
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestinationName: EventDestinationName
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait DeleteConfigurationSetEventDestinationResponse extends js.Object {}

  /**
    * A request to delete a configuration set.
    */
  @js.native
  @Factory
  trait DeleteConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait DeleteConfigurationSetResponse extends js.Object {}

  /**
    * A request to delete a dedicated IP pool.
    */
  @js.native
  @Factory
  trait DeleteDedicatedIpPoolRequest extends js.Object {
    var PoolName: PoolName
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait DeleteDedicatedIpPoolResponse extends js.Object {}

  /**
    * A request to delete an existing email identity. When you delete an identity, you lose the ability to use Amazon Pinpoint to send email from that identity. You can restore your ability to send email by completing the verification process for the identity again.
    */
  @js.native
  @Factory
  trait DeleteEmailIdentityRequest extends js.Object {
    var EmailIdentity: Identity
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait DeleteEmailIdentityResponse extends js.Object {}

  /**
    * The current status of your Deliverability dashboard subscription. If this value is <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current calendar month.
    */
  @js.native
  sealed trait DeliverabilityDashboardAccountStatus extends js.Any
  object DeliverabilityDashboardAccountStatus extends js.Object {
    val ACTIVE             = "ACTIVE".asInstanceOf[DeliverabilityDashboardAccountStatus]
    val PENDING_EXPIRATION = "PENDING_EXPIRATION".asInstanceOf[DeliverabilityDashboardAccountStatus]
    val DISABLED           = "DISABLED".asInstanceOf[DeliverabilityDashboardAccountStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, PENDING_EXPIRATION, DISABLED))
  }

  /**
    * An object that contains metadata related to a predictive inbox placement test.
    */
  @js.native
  @Factory
  trait DeliverabilityTestReport extends js.Object {
    var CreateDate: js.UndefOr[Timestamp]
    var DeliverabilityTestStatus: js.UndefOr[DeliverabilityTestStatus]
    var FromEmailAddress: js.UndefOr[EmailAddress]
    var ReportId: js.UndefOr[ReportId]
    var ReportName: js.UndefOr[ReportName]
    var Subject: js.UndefOr[DeliverabilityTestSubject]
  }

  /**
    * The status of a predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is <code>COMPLETE</code>, then the test is finished, and you can use the <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
    */
  @js.native
  sealed trait DeliverabilityTestStatus extends js.Any
  object DeliverabilityTestStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DeliverabilityTestStatus]
    val COMPLETED   = "COMPLETED".asInstanceOf[DeliverabilityTestStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETED))
  }

  /**
    * Used to associate a configuration set with a dedicated IP pool.
    */
  @js.native
  @Factory
  trait DeliveryOptions extends js.Object {
    var SendingPoolName: js.UndefOr[PoolName]
    var TlsPolicy: js.UndefOr[TlsPolicy]
  }

  /**
    * An object that describes the recipients for an email.
    */
  @js.native
  @Factory
  trait Destination extends js.Object {
    var BccAddresses: js.UndefOr[EmailAddressList]
    var CcAddresses: js.UndefOr[EmailAddressList]
    var ToAddresses: js.UndefOr[EmailAddressList]
  }

  /**
    * The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you want Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint to use your own email headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link tags, choose <code>linkTags</code>.
    */
  @js.native
  sealed trait DimensionValueSource extends js.Any
  object DimensionValueSource extends js.Object {
    val MESSAGE_TAG  = "MESSAGE_TAG".asInstanceOf[DimensionValueSource]
    val EMAIL_HEADER = "EMAIL_HEADER".asInstanceOf[DimensionValueSource]
    val LINK_TAG     = "LINK_TAG".asInstanceOf[DimensionValueSource]

    val values = js.Object.freeze(js.Array(MESSAGE_TAG, EMAIL_HEADER, LINK_TAG))
  }

  /**
    * An object that contains information about the DKIM configuration for an email identity.
    */
  @js.native
  @Factory
  trait DkimAttributes extends js.Object {
    var SigningEnabled: js.UndefOr[Enabled]
    var Status: js.UndefOr[DkimStatus]
    var Tokens: js.UndefOr[DnsTokenList]
  }

  /**
    * The DKIM authentication status of the identity. The status can be one of the following:
    * * <code>PENDING</code> – The DKIM verification process was initiated, and Amazon Pinpoint is still waiting for the required CNAME records to appear in the DNS configuration for the domain.
    *  * <code>SUCCESS</code> – The DKIM authentication process completed successfully.
    *  * <code>FAILED</code> – The DKIM authentication process failed. This can happen when Amazon Pinpoint fails to find the required CNAME records in the DNS configuration of the domain.
    *  * <code>TEMPORARY_FAILURE</code> – A temporary issue is preventing Amazon Pinpoint from determining the DKIM authentication status of the domain.
    *  * <code>NOT_STARTED</code> – The DKIM verification process hasn't been initiated for the domain.
    */
  @js.native
  sealed trait DkimStatus extends js.Any
  object DkimStatus extends js.Object {
    val PENDING           = "PENDING".asInstanceOf[DkimStatus]
    val SUCCESS           = "SUCCESS".asInstanceOf[DkimStatus]
    val FAILED            = "FAILED".asInstanceOf[DkimStatus]
    val TEMPORARY_FAILURE = "TEMPORARY_FAILURE".asInstanceOf[DkimStatus]
    val NOT_STARTED       = "NOT_STARTED".asInstanceOf[DkimStatus]

    val values = js.Object.freeze(js.Array(PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE, NOT_STARTED))
  }

  /**
    * An object that contains the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for (<code>PutDeliverabilityDashboardOption</code> operation).
    */
  @js.native
  @Factory
  trait DomainDeliverabilityCampaign extends js.Object {
    var CampaignId: js.UndefOr[CampaignId]
    var DeleteRate: js.UndefOr[Percentage]
    var Esps: js.UndefOr[Esps]
    var FirstSeenDateTime: js.UndefOr[Timestamp]
    var FromAddress: js.UndefOr[Identity]
    var ImageUrl: js.UndefOr[ImageUrl]
    var InboxCount: js.UndefOr[Volume]
    var LastSeenDateTime: js.UndefOr[Timestamp]
    var ProjectedVolume: js.UndefOr[Volume]
    var ReadDeleteRate: js.UndefOr[Percentage]
    var ReadRate: js.UndefOr[Percentage]
    var SendingIps: js.UndefOr[IpList]
    var SpamCount: js.UndefOr[Volume]
    var Subject: js.UndefOr[Subject]
  }

  /**
    * An object that contains information about the Deliverability dashboard subscription for a verified domain that you use to send email and currently has an active Deliverability dashboard subscription. If a Deliverability dashboard subscription is active for a domain, you gain access to reputation, inbox placement, and other metrics for the domain.
    */
  @js.native
  @Factory
  trait DomainDeliverabilityTrackingOption extends js.Object {
    var Domain: js.UndefOr[Domain]
    var InboxPlacementTrackingOption: js.UndefOr[InboxPlacementTrackingOption]
    var SubscriptionStartDate: js.UndefOr[Timestamp]
  }

  /**
    * An object that contains inbox placement data for email sent from one of your email domains to a specific email provider.
    */
  @js.native
  @Factory
  trait DomainIspPlacement extends js.Object {
    var InboxPercentage: js.UndefOr[Percentage]
    var InboxRawCount: js.UndefOr[Volume]
    var IspName: js.UndefOr[IspName]
    var SpamPercentage: js.UndefOr[Percentage]
    var SpamRawCount: js.UndefOr[Volume]
  }

  /**
    * An object that defines the entire content of the email, including the message headers and the body content. You can create a simple email message, in which you specify the subject and the text and HTML versions of the message body. You can also create raw messages, in which you specify a complete MIME-formatted message. Raw messages can include attachments and custom headers.
    */
  @js.native
  @Factory
  trait EmailContent extends js.Object {
    var Raw: js.UndefOr[RawMessage]
    var Simple: js.UndefOr[Message]
    var Template: js.UndefOr[Template]
  }

  /**
    * In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event destinations</i> are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
    */
  @js.native
  @Factory
  trait EventDestination extends js.Object {
    var MatchingEventTypes: EventTypes
    var Name: EventDestinationName
    var CloudWatchDestination: js.UndefOr[CloudWatchDestination]
    var Enabled: js.UndefOr[Enabled]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var PinpointDestination: js.UndefOr[PinpointDestination]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  /**
    * An object that defines the event destination. Specifically, it defines which services receive events from emails sent using the configuration set that the event destination is associated with. Also defines the types of events that are sent to the event destination.
    */
  @js.native
  @Factory
  trait EventDestinationDefinition extends js.Object {
    var CloudWatchDestination: js.UndefOr[CloudWatchDestination]
    var Enabled: js.UndefOr[Enabled]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var MatchingEventTypes: js.UndefOr[EventTypes]
    var PinpointDestination: js.UndefOr[PinpointDestination]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  /**
    * An email sending event type. For example, email sends, opens, and bounces are all email events.
    */
  @js.native
  sealed trait EventType extends js.Any
  object EventType extends js.Object {
    val SEND              = "SEND".asInstanceOf[EventType]
    val REJECT            = "REJECT".asInstanceOf[EventType]
    val BOUNCE            = "BOUNCE".asInstanceOf[EventType]
    val COMPLAINT         = "COMPLAINT".asInstanceOf[EventType]
    val DELIVERY          = "DELIVERY".asInstanceOf[EventType]
    val OPEN              = "OPEN".asInstanceOf[EventType]
    val CLICK             = "CLICK".asInstanceOf[EventType]
    val RENDERING_FAILURE = "RENDERING_FAILURE".asInstanceOf[EventType]

    val values = js.Object.freeze(js.Array(SEND, REJECT, BOUNCE, COMPLAINT, DELIVERY, OPEN, CLICK, RENDERING_FAILURE))
  }

  /**
    * A request to obtain information about the email-sending capabilities of your Amazon Pinpoint account.
    */
  @js.native
  @Factory
  trait GetAccountRequest extends js.Object {}

  /**
    * A list of details about the email-sending capabilities of your Amazon Pinpoint account in the current AWS Region.
    */
  @js.native
  @Factory
  trait GetAccountResponse extends js.Object {
    var DedicatedIpAutoWarmupEnabled: js.UndefOr[Enabled]
    var EnforcementStatus: js.UndefOr[GeneralEnforcementStatus]
    var ProductionAccessEnabled: js.UndefOr[Enabled]
    var SendQuota: js.UndefOr[SendQuota]
    var SendingEnabled: js.UndefOr[Enabled]
  }

  /**
    * A request to retrieve a list of the blacklists that your dedicated IP addresses appear on.
    */
  @js.native
  @Factory
  trait GetBlacklistReportsRequest extends js.Object {
    var BlacklistItemNames: BlacklistItemNames
  }

  /**
    * An object that contains information about blacklist events.
    */
  @js.native
  @Factory
  trait GetBlacklistReportsResponse extends js.Object {
    var BlacklistReport: BlacklistReport
  }

  /**
    * A request to obtain information about the event destinations for a configuration set.
    */
  @js.native
  @Factory
  trait GetConfigurationSetEventDestinationsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  /**
    * Information about an event destination for a configuration set.
    */
  @js.native
  @Factory
  trait GetConfigurationSetEventDestinationsResponse extends js.Object {
    var EventDestinations: js.UndefOr[EventDestinations]
  }

  /**
    * A request to obtain information about a configuration set.
    */
  @js.native
  @Factory
  trait GetConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  /**
    * Information about a configuration set.
    */
  @js.native
  @Factory
  trait GetConfigurationSetResponse extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var DeliveryOptions: js.UndefOr[DeliveryOptions]
    var ReputationOptions: js.UndefOr[ReputationOptions]
    var SendingOptions: js.UndefOr[SendingOptions]
    var Tags: js.UndefOr[TagList]
    var TrackingOptions: js.UndefOr[TrackingOptions]
  }

  /**
    * A request to obtain more information about a dedicated IP address.
    */
  @js.native
  @Factory
  trait GetDedicatedIpRequest extends js.Object {
    var Ip: Ip
  }

  /**
    * Information about a dedicated IP address.
    */
  @js.native
  @Factory
  trait GetDedicatedIpResponse extends js.Object {
    var DedicatedIp: js.UndefOr[DedicatedIp]
  }

  /**
    * A request to obtain more information about dedicated IP pools.
    */
  @js.native
  @Factory
  trait GetDedicatedIpsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
    var PoolName: js.UndefOr[PoolName]
  }

  /**
    * Information about the dedicated IP addresses that are associated with your Amazon Pinpoint account.
    */
  @js.native
  @Factory
  trait GetDedicatedIpsResponse extends js.Object {
    var DedicatedIps: js.UndefOr[DedicatedIpList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Retrieve information about the status of the Deliverability dashboard for your Amazon Pinpoint account. When the Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests.
    *  When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability dashboard subscription, see [[http://aws.amazon.com/pinpoint/pricing/|Amazon Pinpoint Pricing]].
    */
  @js.native
  @Factory
  trait GetDeliverabilityDashboardOptionsRequest extends js.Object {}

  /**
    * An object that shows the status of the Deliverability dashboard for your Amazon Pinpoint account.
    */
  @js.native
  @Factory
  trait GetDeliverabilityDashboardOptionsResponse extends js.Object {
    var DashboardEnabled: Enabled
    var AccountStatus: js.UndefOr[DeliverabilityDashboardAccountStatus]
    var ActiveSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions]
    var PendingExpirationSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions]
    var SubscriptionExpiryDate: js.UndefOr[Timestamp]
  }

  /**
    * A request to retrieve the results of a predictive inbox placement test.
    */
  @js.native
  @Factory
  trait GetDeliverabilityTestReportRequest extends js.Object {
    var ReportId: ReportId
  }

  /**
    * The results of the predictive inbox placement test.
    */
  @js.native
  @Factory
  trait GetDeliverabilityTestReportResponse extends js.Object {
    var DeliverabilityTestReport: DeliverabilityTestReport
    var IspPlacements: IspPlacements
    var OverallPlacement: PlacementStatistics
    var Message: js.UndefOr[MessageContent]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for (<code>PutDeliverabilityDashboardOption</code> operation).
    */
  @js.native
  @Factory
  trait GetDomainDeliverabilityCampaignRequest extends js.Object {
    var CampaignId: CampaignId
  }

  /**
    * An object that contains all the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for (<code>PutDeliverabilityDashboardOption</code> operation).
    */
  @js.native
  @Factory
  trait GetDomainDeliverabilityCampaignResponse extends js.Object {
    var DomainDeliverabilityCampaign: DomainDeliverabilityCampaign
  }

  /**
    * A request to obtain deliverability metrics for a domain.
    */
  @js.native
  @Factory
  trait GetDomainStatisticsReportRequest extends js.Object {
    var Domain: Identity
    var EndDate: Timestamp
    var StartDate: Timestamp
  }

  /**
    * An object that includes statistics that are related to the domain that you specified.
    */
  @js.native
  @Factory
  trait GetDomainStatisticsReportResponse extends js.Object {
    var DailyVolumes: DailyVolumes
    var OverallVolume: OverallVolume
  }

  /**
    * A request to return details about an email identity.
    */
  @js.native
  @Factory
  trait GetEmailIdentityRequest extends js.Object {
    var EmailIdentity: Identity
  }

  /**
    * Details about an email identity.
    */
  @js.native
  @Factory
  trait GetEmailIdentityResponse extends js.Object {
    var DkimAttributes: js.UndefOr[DkimAttributes]
    var FeedbackForwardingStatus: js.UndefOr[Enabled]
    var IdentityType: js.UndefOr[IdentityType]
    var MailFromAttributes: js.UndefOr[MailFromAttributes]
    var Tags: js.UndefOr[TagList]
    var VerifiedForSendingStatus: js.UndefOr[Enabled]
  }

  /**
    * Information about an email identity.
    */
  @js.native
  @Factory
  trait IdentityInfo extends js.Object {
    var IdentityName: js.UndefOr[Identity]
    var IdentityType: js.UndefOr[IdentityType]
    var SendingEnabled: js.UndefOr[Enabled]
  }

  /**
    * The email identity type. The identity type can be one of the following:
    * * <code>EMAIL_ADDRESS</code> – The identity is an email address.
    *  * <code>DOMAIN</code> – The identity is a domain.
    */
  @js.native
  sealed trait IdentityType extends js.Any
  object IdentityType extends js.Object {
    val EMAIL_ADDRESS  = "EMAIL_ADDRESS".asInstanceOf[IdentityType]
    val DOMAIN         = "DOMAIN".asInstanceOf[IdentityType]
    val MANAGED_DOMAIN = "MANAGED_DOMAIN".asInstanceOf[IdentityType]

    val values = js.Object.freeze(js.Array(EMAIL_ADDRESS, DOMAIN, MANAGED_DOMAIN))
  }

  /**
    * An object that contains information about the inbox placement data settings for a verified domain that’s associated with your AWS account. This data is available only if you enabled the Deliverability dashboard for the domain (<code>PutDeliverabilityDashboardOption</code> operation).
    */
  @js.native
  @Factory
  trait InboxPlacementTrackingOption extends js.Object {
    var Global: js.UndefOr[Enabled]
    var TrackedIsps: js.UndefOr[IspNameList]
  }

  /**
    * An object that describes how email sent during the predictive inbox placement test was handled by a certain email provider.
    */
  @js.native
  @Factory
  trait IspPlacement extends js.Object {
    var IspName: js.UndefOr[IspName]
    var PlacementStatistics: js.UndefOr[PlacementStatistics]
  }

  /**
    * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
    */
  @js.native
  @Factory
  trait KinesisFirehoseDestination extends js.Object {
    var DeliveryStreamArn: AmazonResourceName
    var IamRoleArn: AmazonResourceName
  }

  /**
    * A request to obtain a list of configuration sets for your Amazon Pinpoint account in the current AWS Region.
    */
  @js.native
  @Factory
  trait ListConfigurationSetsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  /**
    * A list of configuration sets in your Amazon Pinpoint account in the current AWS Region.
    */
  @js.native
  @Factory
  trait ListConfigurationSetsResponse extends js.Object {
    var ConfigurationSets: js.UndefOr[ConfigurationSetNameList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * A request to obtain a list of dedicated IP pools.
    */
  @js.native
  @Factory
  trait ListDedicatedIpPoolsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  /**
    * A list of dedicated IP pools.
    */
  @js.native
  @Factory
  trait ListDedicatedIpPoolsResponse extends js.Object {
    var DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * A request to list all of the predictive inbox placement tests that you've performed.
    */
  @js.native
  @Factory
  trait ListDeliverabilityTestReportsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  /**
    * A list of the predictive inbox placement test reports that are available for your account, regardless of whether or not those tests are complete.
    */
  @js.native
  @Factory
  trait ListDeliverabilityTestReportsResponse extends js.Object {
    var DeliverabilityTestReports: DeliverabilityTestReports
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified time range. This data is available for a domain only if you enabled the Deliverability dashboard (<code>PutDeliverabilityDashboardOption</code> operation) for the domain.
    */
  @js.native
  @Factory
  trait ListDomainDeliverabilityCampaignsRequest extends js.Object {
    var EndDate: Timestamp
    var StartDate: Timestamp
    var SubscribedDomain: Domain
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  /**
    * An array of objects that provide deliverability data for all the campaigns that used a specific domain to send email during a specified time range. This data is available for a domain only if you enabled the Deliverability dashboard (<code>PutDeliverabilityDashboardOption</code> operation) for the domain.
    */
  @js.native
  @Factory
  trait ListDomainDeliverabilityCampaignsResponse extends js.Object {
    var DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * A request to list all of the email identities associated with your Amazon Pinpoint account. This list includes identities that you've already verified, identities that are unverified, and identities that were verified in the past, but are no longer verified.
    */
  @js.native
  @Factory
  trait ListEmailIdentitiesRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  /**
    * A list of all of the identities that you've attempted to verify for use with Amazon Pinpoint, regardless of whether or not those identities were successfully verified.
    */
  @js.native
  @Factory
  trait ListEmailIdentitiesResponse extends js.Object {
    var EmailIdentities: js.UndefOr[IdentityInfoList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: TagList
  }

  /**
    * A list of attributes that are associated with a MAIL FROM domain.
    */
  @js.native
  @Factory
  trait MailFromAttributes extends js.Object {
    var BehaviorOnMxFailure: BehaviorOnMxFailure
    var MailFromDomain: MailFromDomainName
    var MailFromDomainStatus: MailFromDomainStatus
  }

  /**
    * The status of the MAIL FROM domain. This status can have the following values:
    * * <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet.
    *  * <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.
    *  * <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists.
    *  * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the status of the MAIL FROM domain.
    */
  @js.native
  sealed trait MailFromDomainStatus extends js.Any
  object MailFromDomainStatus extends js.Object {
    val PENDING           = "PENDING".asInstanceOf[MailFromDomainStatus]
    val SUCCESS           = "SUCCESS".asInstanceOf[MailFromDomainStatus]
    val FAILED            = "FAILED".asInstanceOf[MailFromDomainStatus]
    val TEMPORARY_FAILURE = "TEMPORARY_FAILURE".asInstanceOf[MailFromDomainStatus]

    val values = js.Object.freeze(js.Array(PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE))
  }

  /**
    * Represents the email message that you're sending. The <code>Message</code> object consists of a subject line and a message body.
    */
  @js.native
  @Factory
  trait Message extends js.Object {
    var Body: Body
    var Subject: Content
  }

  /**
    * Contains the name and value of a tag that you apply to an email. You can use message tags when you publish email sending events.
    */
  @js.native
  @Factory
  trait MessageTag extends js.Object {
    var Name: MessageTagName
    var Value: MessageTagValue
  }

  /**
    * An object that contains information about email that was sent from the selected domain.
    */
  @js.native
  @Factory
  trait OverallVolume extends js.Object {
    var DomainIspPlacements: js.UndefOr[DomainIspPlacements]
    var ReadRatePercent: js.UndefOr[Percentage]
    var VolumeStatistics: js.UndefOr[VolumeStatistics]
  }

  /**
    * An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your campaigns.
    */
  @js.native
  @Factory
  trait PinpointDestination extends js.Object {
    var ApplicationArn: js.UndefOr[AmazonResourceName]
  }

  /**
    * An object that contains inbox placement data for an email provider.
    */
  @js.native
  @Factory
  trait PlacementStatistics extends js.Object {
    var DkimPercentage: js.UndefOr[Percentage]
    var InboxPercentage: js.UndefOr[Percentage]
    var MissingPercentage: js.UndefOr[Percentage]
    var SpamPercentage: js.UndefOr[Percentage]
    var SpfPercentage: js.UndefOr[Percentage]
  }

  /**
    * A request to enable or disable the automatic IP address warm-up feature.
    */
  @js.native
  @Factory
  trait PutAccountDedicatedIpWarmupAttributesRequest extends js.Object {
    var AutoWarmupEnabled: js.UndefOr[Enabled]
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait PutAccountDedicatedIpWarmupAttributesResponse extends js.Object {}

  /**
    * A request to change the ability of your account to send email.
    */
  @js.native
  @Factory
  trait PutAccountSendingAttributesRequest extends js.Object {
    var SendingEnabled: js.UndefOr[Enabled]
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait PutAccountSendingAttributesResponse extends js.Object {}

  /**
    * A request to associate a configuration set with a dedicated IP pool.
    */
  @js.native
  @Factory
  trait PutConfigurationSetDeliveryOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var SendingPoolName: js.UndefOr[SendingPoolName]
    var TlsPolicy: js.UndefOr[TlsPolicy]
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait PutConfigurationSetDeliveryOptionsResponse extends js.Object {}

  /**
    * A request to enable or disable tracking of reputation metrics for a configuration set.
    */
  @js.native
  @Factory
  trait PutConfigurationSetReputationOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var ReputationMetricsEnabled: js.UndefOr[Enabled]
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait PutConfigurationSetReputationOptionsResponse extends js.Object {}

  /**
    * A request to enable or disable the ability of Amazon Pinpoint to send emails that use a specific configuration set.
    */
  @js.native
  @Factory
  trait PutConfigurationSetSendingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var SendingEnabled: js.UndefOr[Enabled]
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait PutConfigurationSetSendingOptionsResponse extends js.Object {}

  /**
    * A request to add a custom domain for tracking open and click events to a configuration set.
    */
  @js.native
  @Factory
  trait PutConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var CustomRedirectDomain: js.UndefOr[CustomRedirectDomain]
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait PutConfigurationSetTrackingOptionsResponse extends js.Object {}

  /**
    * A request to move a dedicated IP address to a dedicated IP pool.
    */
  @js.native
  @Factory
  trait PutDedicatedIpInPoolRequest extends js.Object {
    var DestinationPoolName: PoolName
    var Ip: Ip
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait PutDedicatedIpInPoolResponse extends js.Object {}

  /**
    * A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you want to resume the warm-up process for an existing IP address.
    */
  @js.native
  @Factory
  trait PutDedicatedIpWarmupAttributesRequest extends js.Object {
    var Ip: Ip
    var WarmupPercentage: Percentage100Wrapper
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait PutDedicatedIpWarmupAttributesResponse extends js.Object {}

  /**
    * Enable or disable the Deliverability dashboard for your Amazon Pinpoint account. When you enable the Deliverability dashboard, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests.
    *  When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability dashboard subscription, see [[http://aws.amazon.com/pinpoint/pricing/|Amazon Pinpoint Pricing]].
    */
  @js.native
  @Factory
  trait PutDeliverabilityDashboardOptionRequest extends js.Object {
    var DashboardEnabled: Enabled
    var SubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions]
  }

  /**
    * A response that indicates whether the Deliverability dashboard is enabled for your Amazon Pinpoint account.
    */
  @js.native
  @Factory
  trait PutDeliverabilityDashboardOptionResponse extends js.Object {}

  /**
    * A request to enable or disable DKIM signing of email that you send from an email identity.
    */
  @js.native
  @Factory
  trait PutEmailIdentityDkimAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var SigningEnabled: js.UndefOr[Enabled]
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait PutEmailIdentityDkimAttributesResponse extends js.Object {}

  /**
    * A request to set the attributes that control how bounce and complaint events are processed.
    */
  @js.native
  @Factory
  trait PutEmailIdentityFeedbackAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var EmailForwardingEnabled: js.UndefOr[Enabled]
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait PutEmailIdentityFeedbackAttributesResponse extends js.Object {}

  /**
    * A request to configure the custom MAIL FROM domain for a verified identity.
    */
  @js.native
  @Factory
  trait PutEmailIdentityMailFromAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var BehaviorOnMxFailure: js.UndefOr[BehaviorOnMxFailure]
    var MailFromDomain: js.UndefOr[MailFromDomainName]
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait PutEmailIdentityMailFromAttributesResponse extends js.Object {}

  /**
    * The raw email message.
    */
  @js.native
  @Factory
  trait RawMessage extends js.Object {
    var Data: RawMessageData
  }

  /**
    * Enable or disable collection of reputation metrics for emails that you send using this configuration set in the current AWS Region.
    */
  @js.native
  @Factory
  trait ReputationOptions extends js.Object {
    var LastFreshStart: js.UndefOr[LastFreshStart]
    var ReputationMetricsEnabled: js.UndefOr[Enabled]
  }

  /**
    * A request to send an email message.
    */
  @js.native
  @Factory
  trait SendEmailRequest extends js.Object {
    var Content: EmailContent
    var Destination: Destination
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var EmailTags: js.UndefOr[MessageTagList]
    var FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress]
    var FromEmailAddress: js.UndefOr[EmailAddress]
    var ReplyToAddresses: js.UndefOr[EmailAddressList]
  }

  /**
    * A unique message ID that you receive when Amazon Pinpoint accepts an email for sending.
    */
  @js.native
  @Factory
  trait SendEmailResponse extends js.Object {
    var MessageId: js.UndefOr[OutboundMessageId]
  }

  /**
    * An object that contains information about the per-day and per-second sending limits for your Amazon Pinpoint account in the current AWS Region.
    */
  @js.native
  @Factory
  trait SendQuota extends js.Object {
    var Max24HourSend: js.UndefOr[Max24HourSend]
    var MaxSendRate: js.UndefOr[MaxSendRate]
    var SentLast24Hours: js.UndefOr[SentLast24Hours]
  }

  /**
    * Used to enable or disable email sending for messages that use this configuration set in the current AWS Region.
    */
  @js.native
  @Factory
  trait SendingOptions extends js.Object {
    var SendingEnabled: js.UndefOr[Enabled]
  }

  /**
    * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.
    */
  @js.native
  @Factory
  trait SnsDestination extends js.Object {
    var TopicArn: AmazonResourceName
  }

  /**
    * An object that defines the tags that are associated with a resource. A <i>tag</i> is a label that you optionally define and associate with a resource in Amazon Pinpoint. Tags can help you categorize and manage resources in different ways, such as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags.
    *  Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A tag key is a general label that acts as a category for a more specific tag value. A tag value acts as a descriptor within a tag key. A tag key can contain as many as 128 characters. A tag value can contain as many as 256 characters. The characters can be Unicode letters, digits, white space, or one of the following symbols: _ . : / = + -. The following additional restrictions apply to tags:
    * * Tag keys and values are case sensitive.
    *  * For each associated resource, each tag key must be unique and it can have only one value.
    *  * The <code>aws:</code> prefix is reserved for use by AWS; you can’t use it in any tag keys or values that you define. In addition, you can't edit or remove tag keys or values that use this prefix. Tags that use this prefix don’t count against the limit of 50 tags per resource.
    *  * You can associate tags with public or shared resources, but the tags are available only for your AWS account, not any other accounts that share the resource. In addition, the tags are available only for resources that are located in the specified AWS Region for your AWS account.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait Template extends js.Object {
    var TemplateArn: js.UndefOr[TemplateArn]
    var TemplateData: js.UndefOr[TemplateData]
  }

  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
    */
  @js.native
  sealed trait TlsPolicy extends js.Any
  object TlsPolicy extends js.Object {
    val REQUIRE  = "REQUIRE".asInstanceOf[TlsPolicy]
    val OPTIONAL = "OPTIONAL".asInstanceOf[TlsPolicy]

    val values = js.Object.freeze(js.Array(REQUIRE, OPTIONAL))
  }

  /**
    * An object that defines the tracking options for a configuration set. When you use Amazon Pinpoint to send an email, it contains an invisible image that's used to track when recipients open your email. If your email contains links, those links are changed slightly in order to track when recipients click them.
    *  These images and links include references to a domain operated by AWS. You can optionally configure Amazon Pinpoint to use a domain that you operate for these images and links.
    */
  @js.native
  @Factory
  trait TrackingOptions extends js.Object {
    var CustomRedirectDomain: CustomRedirectDomain
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  /**
    * A request to change the settings for an event destination for a configuration set.
    */
  @js.native
  @Factory
  trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestination: EventDestinationDefinition
    var EventDestinationName: EventDestinationName
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  @Factory
  trait UpdateConfigurationSetEventDestinationResponse extends js.Object {}

  /**
    * An object that contains information about the amount of email that was delivered to recipients.
    */
  @js.native
  @Factory
  trait VolumeStatistics extends js.Object {
    var InboxRawCount: js.UndefOr[Volume]
    var ProjectedInbox: js.UndefOr[Volume]
    var ProjectedSpam: js.UndefOr[Volume]
    var SpamRawCount: js.UndefOr[Volume]
  }

  /**
    * The warmup status of a dedicated IP.
    */
  @js.native
  sealed trait WarmupStatus extends js.Any
  object WarmupStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[WarmupStatus]
    val DONE        = "DONE".asInstanceOf[WarmupStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, DONE))
  }
}
