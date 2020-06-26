package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
  trait BlacklistEntry extends js.Object {
    var Description: js.UndefOr[BlacklistingDescription]
    var ListingTime: js.UndefOr[Timestamp]
    var RblName: js.UndefOr[RblName]
  }

  object BlacklistEntry {
    @inline
    def apply(
        Description: js.UndefOr[BlacklistingDescription] = js.undefined,
        ListingTime: js.UndefOr[Timestamp] = js.undefined,
        RblName: js.UndefOr[RblName] = js.undefined
    ): BlacklistEntry = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ListingTime.foreach(__v => __obj.updateDynamic("ListingTime")(__v.asInstanceOf[js.Any]))
      RblName.foreach(__v => __obj.updateDynamic("RblName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlacklistEntry]
    }
  }

  /**
    * Represents the body of the email message.
    */
  @js.native
  trait Body extends js.Object {
    var Html: js.UndefOr[Content]
    var Text: js.UndefOr[Content]
  }

  object Body {
    @inline
    def apply(
        Html: js.UndefOr[Content] = js.undefined,
        Text: js.UndefOr[Content] = js.undefined
    ): Body = {
      val __obj = js.Dynamic.literal()
      Html.foreach(__v => __obj.updateDynamic("Html")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Body]
    }
  }

  /**
    * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
    */
  @js.native
  trait CloudWatchDestination extends js.Object {
    var DimensionConfigurations: CloudWatchDimensionConfigurations
  }

  object CloudWatchDestination {
    @inline
    def apply(
        DimensionConfigurations: CloudWatchDimensionConfigurations
    ): CloudWatchDestination = {
      val __obj = js.Dynamic.literal(
        "DimensionConfigurations" -> DimensionConfigurations.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CloudWatchDestination]
    }
  }

  /**
    * An object that defines the dimension configuration to use when you send Amazon Pinpoint email events to Amazon CloudWatch.
    */
  @js.native
  trait CloudWatchDimensionConfiguration extends js.Object {
    var DefaultDimensionValue: DefaultDimensionValue
    var DimensionName: DimensionName
    var DimensionValueSource: DimensionValueSource
  }

  object CloudWatchDimensionConfiguration {
    @inline
    def apply(
        DefaultDimensionValue: DefaultDimensionValue,
        DimensionName: DimensionName,
        DimensionValueSource: DimensionValueSource
    ): CloudWatchDimensionConfiguration = {
      val __obj = js.Dynamic.literal(
        "DefaultDimensionValue" -> DefaultDimensionValue.asInstanceOf[js.Any],
        "DimensionName"         -> DimensionName.asInstanceOf[js.Any],
        "DimensionValueSource"  -> DimensionValueSource.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CloudWatchDimensionConfiguration]
    }
  }

  /**
    * An object that represents the content of the email, and optionally a character set specification.
    */
  @js.native
  trait Content extends js.Object {
    var Data: MessageData
    var Charset: js.UndefOr[Charset]
  }

  object Content {
    @inline
    def apply(
        Data: MessageData,
        Charset: js.UndefOr[Charset] = js.undefined
    ): Content = {
      val __obj = js.Dynamic.literal(
        "Data" -> Data.asInstanceOf[js.Any]
      )

      Charset.foreach(__v => __obj.updateDynamic("Charset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Content]
    }
  }

  /**
    * A request to add an event destination to a configuration set.
    */
  @js.native
  trait CreateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestination: EventDestinationDefinition
    var EventDestinationName: EventDestinationName
  }

  object CreateConfigurationSetEventDestinationRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        EventDestination: EventDestinationDefinition,
        EventDestinationName: EventDestinationName
    ): CreateConfigurationSetEventDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestination"     -> EventDestination.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait CreateConfigurationSetEventDestinationResponse extends js.Object {}

  object CreateConfigurationSetEventDestinationResponse {
    @inline
    def apply(
    ): CreateConfigurationSetEventDestinationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateConfigurationSetEventDestinationResponse]
    }
  }

  /**
    * A request to create a configuration set.
    */
  @js.native
  trait CreateConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var DeliveryOptions: js.UndefOr[DeliveryOptions]
    var ReputationOptions: js.UndefOr[ReputationOptions]
    var SendingOptions: js.UndefOr[SendingOptions]
    var Tags: js.UndefOr[TagList]
    var TrackingOptions: js.UndefOr[TrackingOptions]
  }

  object CreateConfigurationSetRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined,
        ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined,
        SendingOptions: js.UndefOr[SendingOptions] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined
    ): CreateConfigurationSetRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      DeliveryOptions.foreach(__v => __obj.updateDynamic("DeliveryOptions")(__v.asInstanceOf[js.Any]))
      ReputationOptions.foreach(__v => __obj.updateDynamic("ReputationOptions")(__v.asInstanceOf[js.Any]))
      SendingOptions.foreach(__v => __obj.updateDynamic("SendingOptions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrackingOptions.foreach(__v => __obj.updateDynamic("TrackingOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationSetRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait CreateConfigurationSetResponse extends js.Object {}

  object CreateConfigurationSetResponse {
    @inline
    def apply(
    ): CreateConfigurationSetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateConfigurationSetResponse]
    }
  }

  /**
    * A request to create a new dedicated IP pool.
    */
  @js.native
  trait CreateDedicatedIpPoolRequest extends js.Object {
    var PoolName: PoolName
    var Tags: js.UndefOr[TagList]
  }

  object CreateDedicatedIpPoolRequest {
    @inline
    def apply(
        PoolName: PoolName,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDedicatedIpPoolRequest = {
      val __obj = js.Dynamic.literal(
        "PoolName" -> PoolName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDedicatedIpPoolRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait CreateDedicatedIpPoolResponse extends js.Object {}

  object CreateDedicatedIpPoolResponse {
    @inline
    def apply(
    ): CreateDedicatedIpPoolResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateDedicatedIpPoolResponse]
    }
  }

  /**
    * A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
    */
  @js.native
  trait CreateDeliverabilityTestReportRequest extends js.Object {
    var Content: EmailContent
    var FromEmailAddress: EmailAddress
    var ReportName: js.UndefOr[ReportName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDeliverabilityTestReportRequest {
    @inline
    def apply(
        Content: EmailContent,
        FromEmailAddress: EmailAddress,
        ReportName: js.UndefOr[ReportName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDeliverabilityTestReportRequest = {
      val __obj = js.Dynamic.literal(
        "Content"          -> Content.asInstanceOf[js.Any],
        "FromEmailAddress" -> FromEmailAddress.asInstanceOf[js.Any]
      )

      ReportName.foreach(__v => __obj.updateDynamic("ReportName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeliverabilityTestReportRequest]
    }
  }

  /**
    * Information about the predictive inbox placement test that you created.
    */
  @js.native
  trait CreateDeliverabilityTestReportResponse extends js.Object {
    var DeliverabilityTestStatus: DeliverabilityTestStatus
    var ReportId: ReportId
  }

  object CreateDeliverabilityTestReportResponse {
    @inline
    def apply(
        DeliverabilityTestStatus: DeliverabilityTestStatus,
        ReportId: ReportId
    ): CreateDeliverabilityTestReportResponse = {
      val __obj = js.Dynamic.literal(
        "DeliverabilityTestStatus" -> DeliverabilityTestStatus.asInstanceOf[js.Any],
        "ReportId"                 -> ReportId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDeliverabilityTestReportResponse]
    }
  }

  /**
    * A request to begin the verification process for an email identity (an email address or domain).
    */
  @js.native
  trait CreateEmailIdentityRequest extends js.Object {
    var EmailIdentity: Identity
    var Tags: js.UndefOr[TagList]
  }

  object CreateEmailIdentityRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateEmailIdentityRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEmailIdentityRequest]
    }
  }

  /**
    * If the email identity is a domain, this object contains tokens that you can use to create a set of CNAME records. To sucessfully verify your domain, you have to add these records to the DNS configuration for your domain.
    *  If the email identity is an email address, this object is empty.
    */
  @js.native
  trait CreateEmailIdentityResponse extends js.Object {
    var DkimAttributes: js.UndefOr[DkimAttributes]
    var IdentityType: js.UndefOr[IdentityType]
    var VerifiedForSendingStatus: js.UndefOr[Enabled]
  }

  object CreateEmailIdentityResponse {
    @inline
    def apply(
        DkimAttributes: js.UndefOr[DkimAttributes] = js.undefined,
        IdentityType: js.UndefOr[IdentityType] = js.undefined,
        VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined
    ): CreateEmailIdentityResponse = {
      val __obj = js.Dynamic.literal()
      DkimAttributes.foreach(__v => __obj.updateDynamic("DkimAttributes")(__v.asInstanceOf[js.Any]))
      IdentityType.foreach(__v => __obj.updateDynamic("IdentityType")(__v.asInstanceOf[js.Any]))
      VerifiedForSendingStatus.foreach(__v => __obj.updateDynamic("VerifiedForSendingStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEmailIdentityResponse]
    }
  }

  /**
    * An object that contains information about the volume of email sent on each day of the analysis period.
    */
  @js.native
  trait DailyVolume extends js.Object {
    var DomainIspPlacements: js.UndefOr[DomainIspPlacements]
    var StartDate: js.UndefOr[Timestamp]
    var VolumeStatistics: js.UndefOr[VolumeStatistics]
  }

  object DailyVolume {
    @inline
    def apply(
        DomainIspPlacements: js.UndefOr[DomainIspPlacements] = js.undefined,
        StartDate: js.UndefOr[Timestamp] = js.undefined,
        VolumeStatistics: js.UndefOr[VolumeStatistics] = js.undefined
    ): DailyVolume = {
      val __obj = js.Dynamic.literal()
      DomainIspPlacements.foreach(__v => __obj.updateDynamic("DomainIspPlacements")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      VolumeStatistics.foreach(__v => __obj.updateDynamic("VolumeStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DailyVolume]
    }
  }

  /**
    * Contains information about a dedicated IP address that is associated with your Amazon Pinpoint account.
    *  <p/>
    */
  @js.native
  trait DedicatedIp extends js.Object {
    var Ip: Ip
    var WarmupPercentage: Percentage100Wrapper
    var WarmupStatus: WarmupStatus
    var PoolName: js.UndefOr[PoolName]
  }

  object DedicatedIp {
    @inline
    def apply(
        Ip: Ip,
        WarmupPercentage: Percentage100Wrapper,
        WarmupStatus: WarmupStatus,
        PoolName: js.UndefOr[PoolName] = js.undefined
    ): DedicatedIp = {
      val __obj = js.Dynamic.literal(
        "Ip"               -> Ip.asInstanceOf[js.Any],
        "WarmupPercentage" -> WarmupPercentage.asInstanceOf[js.Any],
        "WarmupStatus"     -> WarmupStatus.asInstanceOf[js.Any]
      )

      PoolName.foreach(__v => __obj.updateDynamic("PoolName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DedicatedIp]
    }
  }

  /**
    * A request to delete an event destination from a configuration set.
    */
  @js.native
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestinationName: EventDestinationName
  }

  object DeleteConfigurationSetEventDestinationRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        EventDestinationName: EventDestinationName
    ): DeleteConfigurationSetEventDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteConfigurationSetEventDestinationResponse extends js.Object {}

  object DeleteConfigurationSetEventDestinationResponse {
    @inline
    def apply(
    ): DeleteConfigurationSetEventDestinationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteConfigurationSetEventDestinationResponse]
    }
  }

  /**
    * A request to delete a configuration set.
    */
  @js.native
  trait DeleteConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  object DeleteConfigurationSetRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName
    ): DeleteConfigurationSetRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigurationSetRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteConfigurationSetResponse extends js.Object {}

  object DeleteConfigurationSetResponse {
    @inline
    def apply(
    ): DeleteConfigurationSetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteConfigurationSetResponse]
    }
  }

  /**
    * A request to delete a dedicated IP pool.
    */
  @js.native
  trait DeleteDedicatedIpPoolRequest extends js.Object {
    var PoolName: PoolName
  }

  object DeleteDedicatedIpPoolRequest {
    @inline
    def apply(
        PoolName: PoolName
    ): DeleteDedicatedIpPoolRequest = {
      val __obj = js.Dynamic.literal(
        "PoolName" -> PoolName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDedicatedIpPoolRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteDedicatedIpPoolResponse extends js.Object {}

  object DeleteDedicatedIpPoolResponse {
    @inline
    def apply(
    ): DeleteDedicatedIpPoolResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteDedicatedIpPoolResponse]
    }
  }

  /**
    * A request to delete an existing email identity. When you delete an identity, you lose the ability to use Amazon Pinpoint to send email from that identity. You can restore your ability to send email by completing the verification process for the identity again.
    */
  @js.native
  trait DeleteEmailIdentityRequest extends js.Object {
    var EmailIdentity: Identity
  }

  object DeleteEmailIdentityRequest {
    @inline
    def apply(
        EmailIdentity: Identity
    ): DeleteEmailIdentityRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEmailIdentityRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteEmailIdentityResponse extends js.Object {}

  object DeleteEmailIdentityResponse {
    @inline
    def apply(
    ): DeleteEmailIdentityResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteEmailIdentityResponse]
    }
  }

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
  trait DeliverabilityTestReport extends js.Object {
    var CreateDate: js.UndefOr[Timestamp]
    var DeliverabilityTestStatus: js.UndefOr[DeliverabilityTestStatus]
    var FromEmailAddress: js.UndefOr[EmailAddress]
    var ReportId: js.UndefOr[ReportId]
    var ReportName: js.UndefOr[ReportName]
    var Subject: js.UndefOr[DeliverabilityTestSubject]
  }

  object DeliverabilityTestReport {
    @inline
    def apply(
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        DeliverabilityTestStatus: js.UndefOr[DeliverabilityTestStatus] = js.undefined,
        FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        ReportId: js.UndefOr[ReportId] = js.undefined,
        ReportName: js.UndefOr[ReportName] = js.undefined,
        Subject: js.UndefOr[DeliverabilityTestSubject] = js.undefined
    ): DeliverabilityTestReport = {
      val __obj = js.Dynamic.literal()
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      DeliverabilityTestStatus.foreach(__v => __obj.updateDynamic("DeliverabilityTestStatus")(__v.asInstanceOf[js.Any]))
      FromEmailAddress.foreach(__v => __obj.updateDynamic("FromEmailAddress")(__v.asInstanceOf[js.Any]))
      ReportId.foreach(__v => __obj.updateDynamic("ReportId")(__v.asInstanceOf[js.Any]))
      ReportName.foreach(__v => __obj.updateDynamic("ReportName")(__v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.updateDynamic("Subject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeliverabilityTestReport]
    }
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
  trait DeliveryOptions extends js.Object {
    var SendingPoolName: js.UndefOr[PoolName]
    var TlsPolicy: js.UndefOr[TlsPolicy]
  }

  object DeliveryOptions {
    @inline
    def apply(
        SendingPoolName: js.UndefOr[PoolName] = js.undefined,
        TlsPolicy: js.UndefOr[TlsPolicy] = js.undefined
    ): DeliveryOptions = {
      val __obj = js.Dynamic.literal()
      SendingPoolName.foreach(__v => __obj.updateDynamic("SendingPoolName")(__v.asInstanceOf[js.Any]))
      TlsPolicy.foreach(__v => __obj.updateDynamic("TlsPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeliveryOptions]
    }
  }

  /**
    * An object that describes the recipients for an email.
    */
  @js.native
  trait Destination extends js.Object {
    var BccAddresses: js.UndefOr[EmailAddressList]
    var CcAddresses: js.UndefOr[EmailAddressList]
    var ToAddresses: js.UndefOr[EmailAddressList]
  }

  object Destination {
    @inline
    def apply(
        BccAddresses: js.UndefOr[EmailAddressList] = js.undefined,
        CcAddresses: js.UndefOr[EmailAddressList] = js.undefined,
        ToAddresses: js.UndefOr[EmailAddressList] = js.undefined
    ): Destination = {
      val __obj = js.Dynamic.literal()
      BccAddresses.foreach(__v => __obj.updateDynamic("BccAddresses")(__v.asInstanceOf[js.Any]))
      CcAddresses.foreach(__v => __obj.updateDynamic("CcAddresses")(__v.asInstanceOf[js.Any]))
      ToAddresses.foreach(__v => __obj.updateDynamic("ToAddresses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Destination]
    }
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
  trait DkimAttributes extends js.Object {
    var SigningEnabled: js.UndefOr[Enabled]
    var Status: js.UndefOr[DkimStatus]
    var Tokens: js.UndefOr[DnsTokenList]
  }

  object DkimAttributes {
    @inline
    def apply(
        SigningEnabled: js.UndefOr[Enabled] = js.undefined,
        Status: js.UndefOr[DkimStatus] = js.undefined,
        Tokens: js.UndefOr[DnsTokenList] = js.undefined
    ): DkimAttributes = {
      val __obj = js.Dynamic.literal()
      SigningEnabled.foreach(__v => __obj.updateDynamic("SigningEnabled")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tokens.foreach(__v => __obj.updateDynamic("Tokens")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DkimAttributes]
    }
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

  object DomainDeliverabilityCampaign {
    @inline
    def apply(
        CampaignId: js.UndefOr[CampaignId] = js.undefined,
        DeleteRate: js.UndefOr[Percentage] = js.undefined,
        Esps: js.UndefOr[Esps] = js.undefined,
        FirstSeenDateTime: js.UndefOr[Timestamp] = js.undefined,
        FromAddress: js.UndefOr[Identity] = js.undefined,
        ImageUrl: js.UndefOr[ImageUrl] = js.undefined,
        InboxCount: js.UndefOr[Volume] = js.undefined,
        LastSeenDateTime: js.UndefOr[Timestamp] = js.undefined,
        ProjectedVolume: js.UndefOr[Volume] = js.undefined,
        ReadDeleteRate: js.UndefOr[Percentage] = js.undefined,
        ReadRate: js.UndefOr[Percentage] = js.undefined,
        SendingIps: js.UndefOr[IpList] = js.undefined,
        SpamCount: js.UndefOr[Volume] = js.undefined,
        Subject: js.UndefOr[Subject] = js.undefined
    ): DomainDeliverabilityCampaign = {
      val __obj = js.Dynamic.literal()
      CampaignId.foreach(__v => __obj.updateDynamic("CampaignId")(__v.asInstanceOf[js.Any]))
      DeleteRate.foreach(__v => __obj.updateDynamic("DeleteRate")(__v.asInstanceOf[js.Any]))
      Esps.foreach(__v => __obj.updateDynamic("Esps")(__v.asInstanceOf[js.Any]))
      FirstSeenDateTime.foreach(__v => __obj.updateDynamic("FirstSeenDateTime")(__v.asInstanceOf[js.Any]))
      FromAddress.foreach(__v => __obj.updateDynamic("FromAddress")(__v.asInstanceOf[js.Any]))
      ImageUrl.foreach(__v => __obj.updateDynamic("ImageUrl")(__v.asInstanceOf[js.Any]))
      InboxCount.foreach(__v => __obj.updateDynamic("InboxCount")(__v.asInstanceOf[js.Any]))
      LastSeenDateTime.foreach(__v => __obj.updateDynamic("LastSeenDateTime")(__v.asInstanceOf[js.Any]))
      ProjectedVolume.foreach(__v => __obj.updateDynamic("ProjectedVolume")(__v.asInstanceOf[js.Any]))
      ReadDeleteRate.foreach(__v => __obj.updateDynamic("ReadDeleteRate")(__v.asInstanceOf[js.Any]))
      ReadRate.foreach(__v => __obj.updateDynamic("ReadRate")(__v.asInstanceOf[js.Any]))
      SendingIps.foreach(__v => __obj.updateDynamic("SendingIps")(__v.asInstanceOf[js.Any]))
      SpamCount.foreach(__v => __obj.updateDynamic("SpamCount")(__v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.updateDynamic("Subject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainDeliverabilityCampaign]
    }
  }

  /**
    * An object that contains information about the Deliverability dashboard subscription for a verified domain that you use to send email and currently has an active Deliverability dashboard subscription. If a Deliverability dashboard subscription is active for a domain, you gain access to reputation, inbox placement, and other metrics for the domain.
    */
  @js.native
  trait DomainDeliverabilityTrackingOption extends js.Object {
    var Domain: js.UndefOr[Domain]
    var InboxPlacementTrackingOption: js.UndefOr[InboxPlacementTrackingOption]
    var SubscriptionStartDate: js.UndefOr[Timestamp]
  }

  object DomainDeliverabilityTrackingOption {
    @inline
    def apply(
        Domain: js.UndefOr[Domain] = js.undefined,
        InboxPlacementTrackingOption: js.UndefOr[InboxPlacementTrackingOption] = js.undefined,
        SubscriptionStartDate: js.UndefOr[Timestamp] = js.undefined
    ): DomainDeliverabilityTrackingOption = {
      val __obj = js.Dynamic.literal()
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      InboxPlacementTrackingOption.foreach(__v =>
        __obj.updateDynamic("InboxPlacementTrackingOption")(__v.asInstanceOf[js.Any])
      )
      SubscriptionStartDate.foreach(__v => __obj.updateDynamic("SubscriptionStartDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainDeliverabilityTrackingOption]
    }
  }

  /**
    * An object that contains inbox placement data for email sent from one of your email domains to a specific email provider.
    */
  @js.native
  trait DomainIspPlacement extends js.Object {
    var InboxPercentage: js.UndefOr[Percentage]
    var InboxRawCount: js.UndefOr[Volume]
    var IspName: js.UndefOr[IspName]
    var SpamPercentage: js.UndefOr[Percentage]
    var SpamRawCount: js.UndefOr[Volume]
  }

  object DomainIspPlacement {
    @inline
    def apply(
        InboxPercentage: js.UndefOr[Percentage] = js.undefined,
        InboxRawCount: js.UndefOr[Volume] = js.undefined,
        IspName: js.UndefOr[IspName] = js.undefined,
        SpamPercentage: js.UndefOr[Percentage] = js.undefined,
        SpamRawCount: js.UndefOr[Volume] = js.undefined
    ): DomainIspPlacement = {
      val __obj = js.Dynamic.literal()
      InboxPercentage.foreach(__v => __obj.updateDynamic("InboxPercentage")(__v.asInstanceOf[js.Any]))
      InboxRawCount.foreach(__v => __obj.updateDynamic("InboxRawCount")(__v.asInstanceOf[js.Any]))
      IspName.foreach(__v => __obj.updateDynamic("IspName")(__v.asInstanceOf[js.Any]))
      SpamPercentage.foreach(__v => __obj.updateDynamic("SpamPercentage")(__v.asInstanceOf[js.Any]))
      SpamRawCount.foreach(__v => __obj.updateDynamic("SpamRawCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainIspPlacement]
    }
  }

  /**
    * An object that defines the entire content of the email, including the message headers and the body content. You can create a simple email message, in which you specify the subject and the text and HTML versions of the message body. You can also create raw messages, in which you specify a complete MIME-formatted message. Raw messages can include attachments and custom headers.
    */
  @js.native
  trait EmailContent extends js.Object {
    var Raw: js.UndefOr[RawMessage]
    var Simple: js.UndefOr[Message]
    var Template: js.UndefOr[Template]
  }

  object EmailContent {
    @inline
    def apply(
        Raw: js.UndefOr[RawMessage] = js.undefined,
        Simple: js.UndefOr[Message] = js.undefined,
        Template: js.UndefOr[Template] = js.undefined
    ): EmailContent = {
      val __obj = js.Dynamic.literal()
      Raw.foreach(__v => __obj.updateDynamic("Raw")(__v.asInstanceOf[js.Any]))
      Simple.foreach(__v => __obj.updateDynamic("Simple")(__v.asInstanceOf[js.Any]))
      Template.foreach(__v => __obj.updateDynamic("Template")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailContent]
    }
  }

  /**
    * In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event destinations</i> are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
    */
  @js.native
  trait EventDestination extends js.Object {
    var MatchingEventTypes: EventTypes
    var Name: EventDestinationName
    var CloudWatchDestination: js.UndefOr[CloudWatchDestination]
    var Enabled: js.UndefOr[Enabled]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var PinpointDestination: js.UndefOr[PinpointDestination]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  object EventDestination {
    @inline
    def apply(
        MatchingEventTypes: EventTypes,
        Name: EventDestinationName,
        CloudWatchDestination: js.UndefOr[CloudWatchDestination] = js.undefined,
        Enabled: js.UndefOr[Enabled] = js.undefined,
        KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
        PinpointDestination: js.UndefOr[PinpointDestination] = js.undefined,
        SnsDestination: js.UndefOr[SnsDestination] = js.undefined
    ): EventDestination = {
      val __obj = js.Dynamic.literal(
        "MatchingEventTypes" -> MatchingEventTypes.asInstanceOf[js.Any],
        "Name"               -> Name.asInstanceOf[js.Any]
      )

      CloudWatchDestination.foreach(__v => __obj.updateDynamic("CloudWatchDestination")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseDestination.foreach(__v =>
        __obj.updateDynamic("KinesisFirehoseDestination")(__v.asInstanceOf[js.Any])
      )
      PinpointDestination.foreach(__v => __obj.updateDynamic("PinpointDestination")(__v.asInstanceOf[js.Any]))
      SnsDestination.foreach(__v => __obj.updateDynamic("SnsDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDestination]
    }
  }

  /**
    * An object that defines the event destination. Specifically, it defines which services receive events from emails sent using the configuration set that the event destination is associated with. Also defines the types of events that are sent to the event destination.
    */
  @js.native
  trait EventDestinationDefinition extends js.Object {
    var CloudWatchDestination: js.UndefOr[CloudWatchDestination]
    var Enabled: js.UndefOr[Enabled]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var MatchingEventTypes: js.UndefOr[EventTypes]
    var PinpointDestination: js.UndefOr[PinpointDestination]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  object EventDestinationDefinition {
    @inline
    def apply(
        CloudWatchDestination: js.UndefOr[CloudWatchDestination] = js.undefined,
        Enabled: js.UndefOr[Enabled] = js.undefined,
        KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
        MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined,
        PinpointDestination: js.UndefOr[PinpointDestination] = js.undefined,
        SnsDestination: js.UndefOr[SnsDestination] = js.undefined
    ): EventDestinationDefinition = {
      val __obj = js.Dynamic.literal()
      CloudWatchDestination.foreach(__v => __obj.updateDynamic("CloudWatchDestination")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseDestination.foreach(__v =>
        __obj.updateDynamic("KinesisFirehoseDestination")(__v.asInstanceOf[js.Any])
      )
      MatchingEventTypes.foreach(__v => __obj.updateDynamic("MatchingEventTypes")(__v.asInstanceOf[js.Any]))
      PinpointDestination.foreach(__v => __obj.updateDynamic("PinpointDestination")(__v.asInstanceOf[js.Any]))
      SnsDestination.foreach(__v => __obj.updateDynamic("SnsDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDestinationDefinition]
    }
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
  trait GetAccountRequest extends js.Object {}

  object GetAccountRequest {
    @inline
    def apply(
    ): GetAccountRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetAccountRequest]
    }
  }

  /**
    * A list of details about the email-sending capabilities of your Amazon Pinpoint account in the current AWS Region.
    */
  @js.native
  trait GetAccountResponse extends js.Object {
    var DedicatedIpAutoWarmupEnabled: js.UndefOr[Enabled]
    var EnforcementStatus: js.UndefOr[GeneralEnforcementStatus]
    var ProductionAccessEnabled: js.UndefOr[Enabled]
    var SendQuota: js.UndefOr[SendQuota]
    var SendingEnabled: js.UndefOr[Enabled]
  }

  object GetAccountResponse {
    @inline
    def apply(
        DedicatedIpAutoWarmupEnabled: js.UndefOr[Enabled] = js.undefined,
        EnforcementStatus: js.UndefOr[GeneralEnforcementStatus] = js.undefined,
        ProductionAccessEnabled: js.UndefOr[Enabled] = js.undefined,
        SendQuota: js.UndefOr[SendQuota] = js.undefined,
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): GetAccountResponse = {
      val __obj = js.Dynamic.literal()
      DedicatedIpAutoWarmupEnabled.foreach(__v =>
        __obj.updateDynamic("DedicatedIpAutoWarmupEnabled")(__v.asInstanceOf[js.Any])
      )
      EnforcementStatus.foreach(__v => __obj.updateDynamic("EnforcementStatus")(__v.asInstanceOf[js.Any]))
      ProductionAccessEnabled.foreach(__v => __obj.updateDynamic("ProductionAccessEnabled")(__v.asInstanceOf[js.Any]))
      SendQuota.foreach(__v => __obj.updateDynamic("SendQuota")(__v.asInstanceOf[js.Any]))
      SendingEnabled.foreach(__v => __obj.updateDynamic("SendingEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountResponse]
    }
  }

  /**
    * A request to retrieve a list of the blacklists that your dedicated IP addresses appear on.
    */
  @js.native
  trait GetBlacklistReportsRequest extends js.Object {
    var BlacklistItemNames: BlacklistItemNames
  }

  object GetBlacklistReportsRequest {
    @inline
    def apply(
        BlacklistItemNames: BlacklistItemNames
    ): GetBlacklistReportsRequest = {
      val __obj = js.Dynamic.literal(
        "BlacklistItemNames" -> BlacklistItemNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBlacklistReportsRequest]
    }
  }

  /**
    * An object that contains information about blacklist events.
    */
  @js.native
  trait GetBlacklistReportsResponse extends js.Object {
    var BlacklistReport: BlacklistReport
  }

  object GetBlacklistReportsResponse {
    @inline
    def apply(
        BlacklistReport: BlacklistReport
    ): GetBlacklistReportsResponse = {
      val __obj = js.Dynamic.literal(
        "BlacklistReport" -> BlacklistReport.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBlacklistReportsResponse]
    }
  }

  /**
    * A request to obtain information about the event destinations for a configuration set.
    */
  @js.native
  trait GetConfigurationSetEventDestinationsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  object GetConfigurationSetEventDestinationsRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName
    ): GetConfigurationSetEventDestinationsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetConfigurationSetEventDestinationsRequest]
    }
  }

  /**
    * Information about an event destination for a configuration set.
    */
  @js.native
  trait GetConfigurationSetEventDestinationsResponse extends js.Object {
    var EventDestinations: js.UndefOr[EventDestinations]
  }

  object GetConfigurationSetEventDestinationsResponse {
    @inline
    def apply(
        EventDestinations: js.UndefOr[EventDestinations] = js.undefined
    ): GetConfigurationSetEventDestinationsResponse = {
      val __obj = js.Dynamic.literal()
      EventDestinations.foreach(__v => __obj.updateDynamic("EventDestinations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConfigurationSetEventDestinationsResponse]
    }
  }

  /**
    * A request to obtain information about a configuration set.
    */
  @js.native
  trait GetConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  object GetConfigurationSetRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName
    ): GetConfigurationSetRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetConfigurationSetRequest]
    }
  }

  /**
    * Information about a configuration set.
    */
  @js.native
  trait GetConfigurationSetResponse extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var DeliveryOptions: js.UndefOr[DeliveryOptions]
    var ReputationOptions: js.UndefOr[ReputationOptions]
    var SendingOptions: js.UndefOr[SendingOptions]
    var Tags: js.UndefOr[TagList]
    var TrackingOptions: js.UndefOr[TrackingOptions]
  }

  object GetConfigurationSetResponse {
    @inline
    def apply(
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined,
        ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined,
        SendingOptions: js.UndefOr[SendingOptions] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined
    ): GetConfigurationSetResponse = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      DeliveryOptions.foreach(__v => __obj.updateDynamic("DeliveryOptions")(__v.asInstanceOf[js.Any]))
      ReputationOptions.foreach(__v => __obj.updateDynamic("ReputationOptions")(__v.asInstanceOf[js.Any]))
      SendingOptions.foreach(__v => __obj.updateDynamic("SendingOptions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrackingOptions.foreach(__v => __obj.updateDynamic("TrackingOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConfigurationSetResponse]
    }
  }

  /**
    * A request to obtain more information about a dedicated IP address.
    */
  @js.native
  trait GetDedicatedIpRequest extends js.Object {
    var Ip: Ip
  }

  object GetDedicatedIpRequest {
    @inline
    def apply(
        Ip: Ip
    ): GetDedicatedIpRequest = {
      val __obj = js.Dynamic.literal(
        "Ip" -> Ip.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDedicatedIpRequest]
    }
  }

  /**
    * Information about a dedicated IP address.
    */
  @js.native
  trait GetDedicatedIpResponse extends js.Object {
    var DedicatedIp: js.UndefOr[DedicatedIp]
  }

  object GetDedicatedIpResponse {
    @inline
    def apply(
        DedicatedIp: js.UndefOr[DedicatedIp] = js.undefined
    ): GetDedicatedIpResponse = {
      val __obj = js.Dynamic.literal()
      DedicatedIp.foreach(__v => __obj.updateDynamic("DedicatedIp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDedicatedIpResponse]
    }
  }

  /**
    * A request to obtain more information about dedicated IP pools.
    */
  @js.native
  trait GetDedicatedIpsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
    var PoolName: js.UndefOr[PoolName]
  }

  object GetDedicatedIpsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined,
        PoolName: js.UndefOr[PoolName] = js.undefined
    ): GetDedicatedIpsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PoolName.foreach(__v => __obj.updateDynamic("PoolName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDedicatedIpsRequest]
    }
  }

  /**
    * Information about the dedicated IP addresses that are associated with your Amazon Pinpoint account.
    */
  @js.native
  trait GetDedicatedIpsResponse extends js.Object {
    var DedicatedIps: js.UndefOr[DedicatedIpList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetDedicatedIpsResponse {
    @inline
    def apply(
        DedicatedIps: js.UndefOr[DedicatedIpList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetDedicatedIpsResponse = {
      val __obj = js.Dynamic.literal()
      DedicatedIps.foreach(__v => __obj.updateDynamic("DedicatedIps")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDedicatedIpsResponse]
    }
  }

  /**
    * Retrieve information about the status of the Deliverability dashboard for your Amazon Pinpoint account. When the Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests.
    *  When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability dashboard subscription, see [[http://aws.amazon.com/pinpoint/pricing/|Amazon Pinpoint Pricing]].
    */
  @js.native
  trait GetDeliverabilityDashboardOptionsRequest extends js.Object {}

  object GetDeliverabilityDashboardOptionsRequest {
    @inline
    def apply(
    ): GetDeliverabilityDashboardOptionsRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetDeliverabilityDashboardOptionsRequest]
    }
  }

  /**
    * An object that shows the status of the Deliverability dashboard for your Amazon Pinpoint account.
    */
  @js.native
  trait GetDeliverabilityDashboardOptionsResponse extends js.Object {
    var DashboardEnabled: Enabled
    var AccountStatus: js.UndefOr[DeliverabilityDashboardAccountStatus]
    var ActiveSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions]
    var PendingExpirationSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions]
    var SubscriptionExpiryDate: js.UndefOr[Timestamp]
  }

  object GetDeliverabilityDashboardOptionsResponse {
    @inline
    def apply(
        DashboardEnabled: Enabled,
        AccountStatus: js.UndefOr[DeliverabilityDashboardAccountStatus] = js.undefined,
        ActiveSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.undefined,
        PendingExpirationSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.undefined,
        SubscriptionExpiryDate: js.UndefOr[Timestamp] = js.undefined
    ): GetDeliverabilityDashboardOptionsResponse = {
      val __obj = js.Dynamic.literal(
        "DashboardEnabled" -> DashboardEnabled.asInstanceOf[js.Any]
      )

      AccountStatus.foreach(__v => __obj.updateDynamic("AccountStatus")(__v.asInstanceOf[js.Any]))
      ActiveSubscribedDomains.foreach(__v => __obj.updateDynamic("ActiveSubscribedDomains")(__v.asInstanceOf[js.Any]))
      PendingExpirationSubscribedDomains.foreach(__v =>
        __obj.updateDynamic("PendingExpirationSubscribedDomains")(__v.asInstanceOf[js.Any])
      )
      SubscriptionExpiryDate.foreach(__v => __obj.updateDynamic("SubscriptionExpiryDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeliverabilityDashboardOptionsResponse]
    }
  }

  /**
    * A request to retrieve the results of a predictive inbox placement test.
    */
  @js.native
  trait GetDeliverabilityTestReportRequest extends js.Object {
    var ReportId: ReportId
  }

  object GetDeliverabilityTestReportRequest {
    @inline
    def apply(
        ReportId: ReportId
    ): GetDeliverabilityTestReportRequest = {
      val __obj = js.Dynamic.literal(
        "ReportId" -> ReportId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDeliverabilityTestReportRequest]
    }
  }

  /**
    * The results of the predictive inbox placement test.
    */
  @js.native
  trait GetDeliverabilityTestReportResponse extends js.Object {
    var DeliverabilityTestReport: DeliverabilityTestReport
    var IspPlacements: IspPlacements
    var OverallPlacement: PlacementStatistics
    var Message: js.UndefOr[MessageContent]
    var Tags: js.UndefOr[TagList]
  }

  object GetDeliverabilityTestReportResponse {
    @inline
    def apply(
        DeliverabilityTestReport: DeliverabilityTestReport,
        IspPlacements: IspPlacements,
        OverallPlacement: PlacementStatistics,
        Message: js.UndefOr[MessageContent] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): GetDeliverabilityTestReportResponse = {
      val __obj = js.Dynamic.literal(
        "DeliverabilityTestReport" -> DeliverabilityTestReport.asInstanceOf[js.Any],
        "IspPlacements"            -> IspPlacements.asInstanceOf[js.Any],
        "OverallPlacement"         -> OverallPlacement.asInstanceOf[js.Any]
      )

      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeliverabilityTestReportResponse]
    }
  }

  /**
    * Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for (<code>PutDeliverabilityDashboardOption</code> operation).
    */
  @js.native
  trait GetDomainDeliverabilityCampaignRequest extends js.Object {
    var CampaignId: CampaignId
  }

  object GetDomainDeliverabilityCampaignRequest {
    @inline
    def apply(
        CampaignId: CampaignId
    ): GetDomainDeliverabilityCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "CampaignId" -> CampaignId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDomainDeliverabilityCampaignRequest]
    }
  }

  /**
    * An object that contains all the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for (<code>PutDeliverabilityDashboardOption</code> operation).
    */
  @js.native
  trait GetDomainDeliverabilityCampaignResponse extends js.Object {
    var DomainDeliverabilityCampaign: DomainDeliverabilityCampaign
  }

  object GetDomainDeliverabilityCampaignResponse {
    @inline
    def apply(
        DomainDeliverabilityCampaign: DomainDeliverabilityCampaign
    ): GetDomainDeliverabilityCampaignResponse = {
      val __obj = js.Dynamic.literal(
        "DomainDeliverabilityCampaign" -> DomainDeliverabilityCampaign.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDomainDeliverabilityCampaignResponse]
    }
  }

  /**
    * A request to obtain deliverability metrics for a domain.
    */
  @js.native
  trait GetDomainStatisticsReportRequest extends js.Object {
    var Domain: Identity
    var EndDate: Timestamp
    var StartDate: Timestamp
  }

  object GetDomainStatisticsReportRequest {
    @inline
    def apply(
        Domain: Identity,
        EndDate: Timestamp,
        StartDate: Timestamp
    ): GetDomainStatisticsReportRequest = {
      val __obj = js.Dynamic.literal(
        "Domain"    -> Domain.asInstanceOf[js.Any],
        "EndDate"   -> EndDate.asInstanceOf[js.Any],
        "StartDate" -> StartDate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDomainStatisticsReportRequest]
    }
  }

  /**
    * An object that includes statistics that are related to the domain that you specified.
    */
  @js.native
  trait GetDomainStatisticsReportResponse extends js.Object {
    var DailyVolumes: DailyVolumes
    var OverallVolume: OverallVolume
  }

  object GetDomainStatisticsReportResponse {
    @inline
    def apply(
        DailyVolumes: DailyVolumes,
        OverallVolume: OverallVolume
    ): GetDomainStatisticsReportResponse = {
      val __obj = js.Dynamic.literal(
        "DailyVolumes"  -> DailyVolumes.asInstanceOf[js.Any],
        "OverallVolume" -> OverallVolume.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDomainStatisticsReportResponse]
    }
  }

  /**
    * A request to return details about an email identity.
    */
  @js.native
  trait GetEmailIdentityRequest extends js.Object {
    var EmailIdentity: Identity
  }

  object GetEmailIdentityRequest {
    @inline
    def apply(
        EmailIdentity: Identity
    ): GetEmailIdentityRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEmailIdentityRequest]
    }
  }

  /**
    * Details about an email identity.
    */
  @js.native
  trait GetEmailIdentityResponse extends js.Object {
    var DkimAttributes: js.UndefOr[DkimAttributes]
    var FeedbackForwardingStatus: js.UndefOr[Enabled]
    var IdentityType: js.UndefOr[IdentityType]
    var MailFromAttributes: js.UndefOr[MailFromAttributes]
    var Tags: js.UndefOr[TagList]
    var VerifiedForSendingStatus: js.UndefOr[Enabled]
  }

  object GetEmailIdentityResponse {
    @inline
    def apply(
        DkimAttributes: js.UndefOr[DkimAttributes] = js.undefined,
        FeedbackForwardingStatus: js.UndefOr[Enabled] = js.undefined,
        IdentityType: js.UndefOr[IdentityType] = js.undefined,
        MailFromAttributes: js.UndefOr[MailFromAttributes] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined
    ): GetEmailIdentityResponse = {
      val __obj = js.Dynamic.literal()
      DkimAttributes.foreach(__v => __obj.updateDynamic("DkimAttributes")(__v.asInstanceOf[js.Any]))
      FeedbackForwardingStatus.foreach(__v => __obj.updateDynamic("FeedbackForwardingStatus")(__v.asInstanceOf[js.Any]))
      IdentityType.foreach(__v => __obj.updateDynamic("IdentityType")(__v.asInstanceOf[js.Any]))
      MailFromAttributes.foreach(__v => __obj.updateDynamic("MailFromAttributes")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VerifiedForSendingStatus.foreach(__v => __obj.updateDynamic("VerifiedForSendingStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEmailIdentityResponse]
    }
  }

  /**
    * Information about an email identity.
    */
  @js.native
  trait IdentityInfo extends js.Object {
    var IdentityName: js.UndefOr[Identity]
    var IdentityType: js.UndefOr[IdentityType]
    var SendingEnabled: js.UndefOr[Enabled]
  }

  object IdentityInfo {
    @inline
    def apply(
        IdentityName: js.UndefOr[Identity] = js.undefined,
        IdentityType: js.UndefOr[IdentityType] = js.undefined,
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): IdentityInfo = {
      val __obj = js.Dynamic.literal()
      IdentityName.foreach(__v => __obj.updateDynamic("IdentityName")(__v.asInstanceOf[js.Any]))
      IdentityType.foreach(__v => __obj.updateDynamic("IdentityType")(__v.asInstanceOf[js.Any]))
      SendingEnabled.foreach(__v => __obj.updateDynamic("SendingEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityInfo]
    }
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
  trait InboxPlacementTrackingOption extends js.Object {
    var Global: js.UndefOr[Enabled]
    var TrackedIsps: js.UndefOr[IspNameList]
  }

  object InboxPlacementTrackingOption {
    @inline
    def apply(
        Global: js.UndefOr[Enabled] = js.undefined,
        TrackedIsps: js.UndefOr[IspNameList] = js.undefined
    ): InboxPlacementTrackingOption = {
      val __obj = js.Dynamic.literal()
      Global.foreach(__v => __obj.updateDynamic("Global")(__v.asInstanceOf[js.Any]))
      TrackedIsps.foreach(__v => __obj.updateDynamic("TrackedIsps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InboxPlacementTrackingOption]
    }
  }

  /**
    * An object that describes how email sent during the predictive inbox placement test was handled by a certain email provider.
    */
  @js.native
  trait IspPlacement extends js.Object {
    var IspName: js.UndefOr[IspName]
    var PlacementStatistics: js.UndefOr[PlacementStatistics]
  }

  object IspPlacement {
    @inline
    def apply(
        IspName: js.UndefOr[IspName] = js.undefined,
        PlacementStatistics: js.UndefOr[PlacementStatistics] = js.undefined
    ): IspPlacement = {
      val __obj = js.Dynamic.literal()
      IspName.foreach(__v => __obj.updateDynamic("IspName")(__v.asInstanceOf[js.Any]))
      PlacementStatistics.foreach(__v => __obj.updateDynamic("PlacementStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IspPlacement]
    }
  }

  /**
    * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
    */
  @js.native
  trait KinesisFirehoseDestination extends js.Object {
    var DeliveryStreamArn: AmazonResourceName
    var IamRoleArn: AmazonResourceName
  }

  object KinesisFirehoseDestination {
    @inline
    def apply(
        DeliveryStreamArn: AmazonResourceName,
        IamRoleArn: AmazonResourceName
    ): KinesisFirehoseDestination = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamArn" -> DeliveryStreamArn.asInstanceOf[js.Any],
        "IamRoleArn"        -> IamRoleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[KinesisFirehoseDestination]
    }
  }

  /**
    * A request to obtain a list of configuration sets for your Amazon Pinpoint account in the current AWS Region.
    */
  @js.native
  trait ListConfigurationSetsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListConfigurationSetsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListConfigurationSetsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationSetsRequest]
    }
  }

  /**
    * A list of configuration sets in your Amazon Pinpoint account in the current AWS Region.
    */
  @js.native
  trait ListConfigurationSetsResponse extends js.Object {
    var ConfigurationSets: js.UndefOr[ConfigurationSetNameList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConfigurationSetsResponse {
    @inline
    def apply(
        ConfigurationSets: js.UndefOr[ConfigurationSetNameList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConfigurationSetsResponse = {
      val __obj = js.Dynamic.literal()
      ConfigurationSets.foreach(__v => __obj.updateDynamic("ConfigurationSets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationSetsResponse]
    }
  }

  /**
    * A request to obtain a list of dedicated IP pools.
    */
  @js.native
  trait ListDedicatedIpPoolsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListDedicatedIpPoolsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListDedicatedIpPoolsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDedicatedIpPoolsRequest]
    }
  }

  /**
    * A list of dedicated IP pools.
    */
  @js.native
  trait ListDedicatedIpPoolsResponse extends js.Object {
    var DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDedicatedIpPoolsResponse {
    @inline
    def apply(
        DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDedicatedIpPoolsResponse = {
      val __obj = js.Dynamic.literal()
      DedicatedIpPools.foreach(__v => __obj.updateDynamic("DedicatedIpPools")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDedicatedIpPoolsResponse]
    }
  }

  /**
    * A request to list all of the predictive inbox placement tests that you've performed.
    */
  @js.native
  trait ListDeliverabilityTestReportsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListDeliverabilityTestReportsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListDeliverabilityTestReportsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeliverabilityTestReportsRequest]
    }
  }

  /**
    * A list of the predictive inbox placement test reports that are available for your account, regardless of whether or not those tests are complete.
    */
  @js.native
  trait ListDeliverabilityTestReportsResponse extends js.Object {
    var DeliverabilityTestReports: DeliverabilityTestReports
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDeliverabilityTestReportsResponse {
    @inline
    def apply(
        DeliverabilityTestReports: DeliverabilityTestReports,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeliverabilityTestReportsResponse = {
      val __obj = js.Dynamic.literal(
        "DeliverabilityTestReports" -> DeliverabilityTestReports.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeliverabilityTestReportsResponse]
    }
  }

  /**
    * Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified time range. This data is available for a domain only if you enabled the Deliverability dashboard (<code>PutDeliverabilityDashboardOption</code> operation) for the domain.
    */
  @js.native
  trait ListDomainDeliverabilityCampaignsRequest extends js.Object {
    var EndDate: Timestamp
    var StartDate: Timestamp
    var SubscribedDomain: Domain
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListDomainDeliverabilityCampaignsRequest {
    @inline
    def apply(
        EndDate: Timestamp,
        StartDate: Timestamp,
        SubscribedDomain: Domain,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListDomainDeliverabilityCampaignsRequest = {
      val __obj = js.Dynamic.literal(
        "EndDate"          -> EndDate.asInstanceOf[js.Any],
        "StartDate"        -> StartDate.asInstanceOf[js.Any],
        "SubscribedDomain" -> SubscribedDomain.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainDeliverabilityCampaignsRequest]
    }
  }

  /**
    * An array of objects that provide deliverability data for all the campaigns that used a specific domain to send email during a specified time range. This data is available for a domain only if you enabled the Deliverability dashboard (<code>PutDeliverabilityDashboardOption</code> operation) for the domain.
    */
  @js.native
  trait ListDomainDeliverabilityCampaignsResponse extends js.Object {
    var DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDomainDeliverabilityCampaignsResponse {
    @inline
    def apply(
        DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainDeliverabilityCampaignsResponse = {
      val __obj = js.Dynamic.literal(
        "DomainDeliverabilityCampaigns" -> DomainDeliverabilityCampaigns.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainDeliverabilityCampaignsResponse]
    }
  }

  /**
    * A request to list all of the email identities associated with your Amazon Pinpoint account. This list includes identities that you've already verified, identities that are unverified, and identities that were verified in the past, but are no longer verified.
    */
  @js.native
  trait ListEmailIdentitiesRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListEmailIdentitiesRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListEmailIdentitiesRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEmailIdentitiesRequest]
    }
  }

  /**
    * A list of all of the identities that you've attempted to verify for use with Amazon Pinpoint, regardless of whether or not those identities were successfully verified.
    */
  @js.native
  trait ListEmailIdentitiesResponse extends js.Object {
    var EmailIdentities: js.UndefOr[IdentityInfoList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEmailIdentitiesResponse {
    @inline
    def apply(
        EmailIdentities: js.UndefOr[IdentityInfoList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEmailIdentitiesResponse = {
      val __obj = js.Dynamic.literal()
      EmailIdentities.foreach(__v => __obj.updateDynamic("EmailIdentities")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEmailIdentitiesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: TagList
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: TagList
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * A list of attributes that are associated with a MAIL FROM domain.
    */
  @js.native
  trait MailFromAttributes extends js.Object {
    var BehaviorOnMxFailure: BehaviorOnMxFailure
    var MailFromDomain: MailFromDomainName
    var MailFromDomainStatus: MailFromDomainStatus
  }

  object MailFromAttributes {
    @inline
    def apply(
        BehaviorOnMxFailure: BehaviorOnMxFailure,
        MailFromDomain: MailFromDomainName,
        MailFromDomainStatus: MailFromDomainStatus
    ): MailFromAttributes = {
      val __obj = js.Dynamic.literal(
        "BehaviorOnMxFailure"  -> BehaviorOnMxFailure.asInstanceOf[js.Any],
        "MailFromDomain"       -> MailFromDomain.asInstanceOf[js.Any],
        "MailFromDomainStatus" -> MailFromDomainStatus.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MailFromAttributes]
    }
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
  trait Message extends js.Object {
    var Body: Body
    var Subject: Content
  }

  object Message {
    @inline
    def apply(
        Body: Body,
        Subject: Content
    ): Message = {
      val __obj = js.Dynamic.literal(
        "Body"    -> Body.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Message]
    }
  }

  /**
    * Contains the name and value of a tag that you apply to an email. You can use message tags when you publish email sending events.
    */
  @js.native
  trait MessageTag extends js.Object {
    var Name: MessageTagName
    var Value: MessageTagValue
  }

  object MessageTag {
    @inline
    def apply(
        Name: MessageTagName,
        Value: MessageTagValue
    ): MessageTag = {
      val __obj = js.Dynamic.literal(
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MessageTag]
    }
  }

  /**
    * An object that contains information about email that was sent from the selected domain.
    */
  @js.native
  trait OverallVolume extends js.Object {
    var DomainIspPlacements: js.UndefOr[DomainIspPlacements]
    var ReadRatePercent: js.UndefOr[Percentage]
    var VolumeStatistics: js.UndefOr[VolumeStatistics]
  }

  object OverallVolume {
    @inline
    def apply(
        DomainIspPlacements: js.UndefOr[DomainIspPlacements] = js.undefined,
        ReadRatePercent: js.UndefOr[Percentage] = js.undefined,
        VolumeStatistics: js.UndefOr[VolumeStatistics] = js.undefined
    ): OverallVolume = {
      val __obj = js.Dynamic.literal()
      DomainIspPlacements.foreach(__v => __obj.updateDynamic("DomainIspPlacements")(__v.asInstanceOf[js.Any]))
      ReadRatePercent.foreach(__v => __obj.updateDynamic("ReadRatePercent")(__v.asInstanceOf[js.Any]))
      VolumeStatistics.foreach(__v => __obj.updateDynamic("VolumeStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OverallVolume]
    }
  }

  /**
    * An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your campaigns.
    */
  @js.native
  trait PinpointDestination extends js.Object {
    var ApplicationArn: js.UndefOr[AmazonResourceName]
  }

  object PinpointDestination {
    @inline
    def apply(
        ApplicationArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): PinpointDestination = {
      val __obj = js.Dynamic.literal()
      ApplicationArn.foreach(__v => __obj.updateDynamic("ApplicationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PinpointDestination]
    }
  }

  /**
    * An object that contains inbox placement data for an email provider.
    */
  @js.native
  trait PlacementStatistics extends js.Object {
    var DkimPercentage: js.UndefOr[Percentage]
    var InboxPercentage: js.UndefOr[Percentage]
    var MissingPercentage: js.UndefOr[Percentage]
    var SpamPercentage: js.UndefOr[Percentage]
    var SpfPercentage: js.UndefOr[Percentage]
  }

  object PlacementStatistics {
    @inline
    def apply(
        DkimPercentage: js.UndefOr[Percentage] = js.undefined,
        InboxPercentage: js.UndefOr[Percentage] = js.undefined,
        MissingPercentage: js.UndefOr[Percentage] = js.undefined,
        SpamPercentage: js.UndefOr[Percentage] = js.undefined,
        SpfPercentage: js.UndefOr[Percentage] = js.undefined
    ): PlacementStatistics = {
      val __obj = js.Dynamic.literal()
      DkimPercentage.foreach(__v => __obj.updateDynamic("DkimPercentage")(__v.asInstanceOf[js.Any]))
      InboxPercentage.foreach(__v => __obj.updateDynamic("InboxPercentage")(__v.asInstanceOf[js.Any]))
      MissingPercentage.foreach(__v => __obj.updateDynamic("MissingPercentage")(__v.asInstanceOf[js.Any]))
      SpamPercentage.foreach(__v => __obj.updateDynamic("SpamPercentage")(__v.asInstanceOf[js.Any]))
      SpfPercentage.foreach(__v => __obj.updateDynamic("SpfPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlacementStatistics]
    }
  }

  /**
    * A request to enable or disable the automatic IP address warm-up feature.
    */
  @js.native
  trait PutAccountDedicatedIpWarmupAttributesRequest extends js.Object {
    var AutoWarmupEnabled: js.UndefOr[Enabled]
  }

  object PutAccountDedicatedIpWarmupAttributesRequest {
    @inline
    def apply(
        AutoWarmupEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutAccountDedicatedIpWarmupAttributesRequest = {
      val __obj = js.Dynamic.literal()
      AutoWarmupEnabled.foreach(__v => __obj.updateDynamic("AutoWarmupEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAccountDedicatedIpWarmupAttributesRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutAccountDedicatedIpWarmupAttributesResponse extends js.Object {}

  object PutAccountDedicatedIpWarmupAttributesResponse {
    @inline
    def apply(
    ): PutAccountDedicatedIpWarmupAttributesResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutAccountDedicatedIpWarmupAttributesResponse]
    }
  }

  /**
    * A request to change the ability of your account to send email.
    */
  @js.native
  trait PutAccountSendingAttributesRequest extends js.Object {
    var SendingEnabled: js.UndefOr[Enabled]
  }

  object PutAccountSendingAttributesRequest {
    @inline
    def apply(
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutAccountSendingAttributesRequest = {
      val __obj = js.Dynamic.literal()
      SendingEnabled.foreach(__v => __obj.updateDynamic("SendingEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAccountSendingAttributesRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutAccountSendingAttributesResponse extends js.Object {}

  object PutAccountSendingAttributesResponse {
    @inline
    def apply(
    ): PutAccountSendingAttributesResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutAccountSendingAttributesResponse]
    }
  }

  /**
    * A request to associate a configuration set with a dedicated IP pool.
    */
  @js.native
  trait PutConfigurationSetDeliveryOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var SendingPoolName: js.UndefOr[SendingPoolName]
    var TlsPolicy: js.UndefOr[TlsPolicy]
  }

  object PutConfigurationSetDeliveryOptionsRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        SendingPoolName: js.UndefOr[SendingPoolName] = js.undefined,
        TlsPolicy: js.UndefOr[TlsPolicy] = js.undefined
    ): PutConfigurationSetDeliveryOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      SendingPoolName.foreach(__v => __obj.updateDynamic("SendingPoolName")(__v.asInstanceOf[js.Any]))
      TlsPolicy.foreach(__v => __obj.updateDynamic("TlsPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationSetDeliveryOptionsRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetDeliveryOptionsResponse extends js.Object {}

  object PutConfigurationSetDeliveryOptionsResponse {
    @inline
    def apply(
    ): PutConfigurationSetDeliveryOptionsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutConfigurationSetDeliveryOptionsResponse]
    }
  }

  /**
    * A request to enable or disable tracking of reputation metrics for a configuration set.
    */
  @js.native
  trait PutConfigurationSetReputationOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var ReputationMetricsEnabled: js.UndefOr[Enabled]
  }

  object PutConfigurationSetReputationOptionsRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutConfigurationSetReputationOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      ReputationMetricsEnabled.foreach(__v => __obj.updateDynamic("ReputationMetricsEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationSetReputationOptionsRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetReputationOptionsResponse extends js.Object {}

  object PutConfigurationSetReputationOptionsResponse {
    @inline
    def apply(
    ): PutConfigurationSetReputationOptionsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutConfigurationSetReputationOptionsResponse]
    }
  }

  /**
    * A request to enable or disable the ability of Amazon Pinpoint to send emails that use a specific configuration set.
    */
  @js.native
  trait PutConfigurationSetSendingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var SendingEnabled: js.UndefOr[Enabled]
  }

  object PutConfigurationSetSendingOptionsRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutConfigurationSetSendingOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      SendingEnabled.foreach(__v => __obj.updateDynamic("SendingEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationSetSendingOptionsRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetSendingOptionsResponse extends js.Object {}

  object PutConfigurationSetSendingOptionsResponse {
    @inline
    def apply(
    ): PutConfigurationSetSendingOptionsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutConfigurationSetSendingOptionsResponse]
    }
  }

  /**
    * A request to add a custom domain for tracking open and click events to a configuration set.
    */
  @js.native
  trait PutConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var CustomRedirectDomain: js.UndefOr[CustomRedirectDomain]
  }

  object PutConfigurationSetTrackingOptionsRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        CustomRedirectDomain: js.UndefOr[CustomRedirectDomain] = js.undefined
    ): PutConfigurationSetTrackingOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      CustomRedirectDomain.foreach(__v => __obj.updateDynamic("CustomRedirectDomain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutConfigurationSetTrackingOptionsRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetTrackingOptionsResponse extends js.Object {}

  object PutConfigurationSetTrackingOptionsResponse {
    @inline
    def apply(
    ): PutConfigurationSetTrackingOptionsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutConfigurationSetTrackingOptionsResponse]
    }
  }

  /**
    * A request to move a dedicated IP address to a dedicated IP pool.
    */
  @js.native
  trait PutDedicatedIpInPoolRequest extends js.Object {
    var DestinationPoolName: PoolName
    var Ip: Ip
  }

  object PutDedicatedIpInPoolRequest {
    @inline
    def apply(
        DestinationPoolName: PoolName,
        Ip: Ip
    ): PutDedicatedIpInPoolRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationPoolName" -> DestinationPoolName.asInstanceOf[js.Any],
        "Ip"                  -> Ip.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutDedicatedIpInPoolRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutDedicatedIpInPoolResponse extends js.Object {}

  object PutDedicatedIpInPoolResponse {
    @inline
    def apply(
    ): PutDedicatedIpInPoolResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutDedicatedIpInPoolResponse]
    }
  }

  /**
    * A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you want to resume the warm-up process for an existing IP address.
    */
  @js.native
  trait PutDedicatedIpWarmupAttributesRequest extends js.Object {
    var Ip: Ip
    var WarmupPercentage: Percentage100Wrapper
  }

  object PutDedicatedIpWarmupAttributesRequest {
    @inline
    def apply(
        Ip: Ip,
        WarmupPercentage: Percentage100Wrapper
    ): PutDedicatedIpWarmupAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "Ip"               -> Ip.asInstanceOf[js.Any],
        "WarmupPercentage" -> WarmupPercentage.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutDedicatedIpWarmupAttributesRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutDedicatedIpWarmupAttributesResponse extends js.Object {}

  object PutDedicatedIpWarmupAttributesResponse {
    @inline
    def apply(
    ): PutDedicatedIpWarmupAttributesResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutDedicatedIpWarmupAttributesResponse]
    }
  }

  /**
    * Enable or disable the Deliverability dashboard for your Amazon Pinpoint account. When you enable the Deliverability dashboard, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests.
    *  When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability dashboard subscription, see [[http://aws.amazon.com/pinpoint/pricing/|Amazon Pinpoint Pricing]].
    */
  @js.native
  trait PutDeliverabilityDashboardOptionRequest extends js.Object {
    var DashboardEnabled: Enabled
    var SubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions]
  }

  object PutDeliverabilityDashboardOptionRequest {
    @inline
    def apply(
        DashboardEnabled: Enabled,
        SubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.undefined
    ): PutDeliverabilityDashboardOptionRequest = {
      val __obj = js.Dynamic.literal(
        "DashboardEnabled" -> DashboardEnabled.asInstanceOf[js.Any]
      )

      SubscribedDomains.foreach(__v => __obj.updateDynamic("SubscribedDomains")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDeliverabilityDashboardOptionRequest]
    }
  }

  /**
    * A response that indicates whether the Deliverability dashboard is enabled for your Amazon Pinpoint account.
    */
  @js.native
  trait PutDeliverabilityDashboardOptionResponse extends js.Object {}

  object PutDeliverabilityDashboardOptionResponse {
    @inline
    def apply(
    ): PutDeliverabilityDashboardOptionResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutDeliverabilityDashboardOptionResponse]
    }
  }

  /**
    * A request to enable or disable DKIM signing of email that you send from an email identity.
    */
  @js.native
  trait PutEmailIdentityDkimAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var SigningEnabled: js.UndefOr[Enabled]
  }

  object PutEmailIdentityDkimAttributesRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        SigningEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutEmailIdentityDkimAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )

      SigningEnabled.foreach(__v => __obj.updateDynamic("SigningEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEmailIdentityDkimAttributesRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutEmailIdentityDkimAttributesResponse extends js.Object {}

  object PutEmailIdentityDkimAttributesResponse {
    @inline
    def apply(
    ): PutEmailIdentityDkimAttributesResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutEmailIdentityDkimAttributesResponse]
    }
  }

  /**
    * A request to set the attributes that control how bounce and complaint events are processed.
    */
  @js.native
  trait PutEmailIdentityFeedbackAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var EmailForwardingEnabled: js.UndefOr[Enabled]
  }

  object PutEmailIdentityFeedbackAttributesRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        EmailForwardingEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutEmailIdentityFeedbackAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )

      EmailForwardingEnabled.foreach(__v => __obj.updateDynamic("EmailForwardingEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEmailIdentityFeedbackAttributesRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutEmailIdentityFeedbackAttributesResponse extends js.Object {}

  object PutEmailIdentityFeedbackAttributesResponse {
    @inline
    def apply(
    ): PutEmailIdentityFeedbackAttributesResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutEmailIdentityFeedbackAttributesResponse]
    }
  }

  /**
    * A request to configure the custom MAIL FROM domain for a verified identity.
    */
  @js.native
  trait PutEmailIdentityMailFromAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var BehaviorOnMxFailure: js.UndefOr[BehaviorOnMxFailure]
    var MailFromDomain: js.UndefOr[MailFromDomainName]
  }

  object PutEmailIdentityMailFromAttributesRequest {
    @inline
    def apply(
        EmailIdentity: Identity,
        BehaviorOnMxFailure: js.UndefOr[BehaviorOnMxFailure] = js.undefined,
        MailFromDomain: js.UndefOr[MailFromDomainName] = js.undefined
    ): PutEmailIdentityMailFromAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      )

      BehaviorOnMxFailure.foreach(__v => __obj.updateDynamic("BehaviorOnMxFailure")(__v.asInstanceOf[js.Any]))
      MailFromDomain.foreach(__v => __obj.updateDynamic("MailFromDomain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEmailIdentityMailFromAttributesRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutEmailIdentityMailFromAttributesResponse extends js.Object {}

  object PutEmailIdentityMailFromAttributesResponse {
    @inline
    def apply(
    ): PutEmailIdentityMailFromAttributesResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutEmailIdentityMailFromAttributesResponse]
    }
  }

  /**
    * The raw email message.
    */
  @js.native
  trait RawMessage extends js.Object {
    var Data: RawMessageData
  }

  object RawMessage {
    @inline
    def apply(
        Data: RawMessageData
    ): RawMessage = {
      val __obj = js.Dynamic.literal(
        "Data" -> Data.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RawMessage]
    }
  }

  /**
    * Enable or disable collection of reputation metrics for emails that you send using this configuration set in the current AWS Region.
    */
  @js.native
  trait ReputationOptions extends js.Object {
    var LastFreshStart: js.UndefOr[LastFreshStart]
    var ReputationMetricsEnabled: js.UndefOr[Enabled]
  }

  object ReputationOptions {
    @inline
    def apply(
        LastFreshStart: js.UndefOr[LastFreshStart] = js.undefined,
        ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
    ): ReputationOptions = {
      val __obj = js.Dynamic.literal()
      LastFreshStart.foreach(__v => __obj.updateDynamic("LastFreshStart")(__v.asInstanceOf[js.Any]))
      ReputationMetricsEnabled.foreach(__v => __obj.updateDynamic("ReputationMetricsEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReputationOptions]
    }
  }

  /**
    * A request to send an email message.
    */
  @js.native
  trait SendEmailRequest extends js.Object {
    var Content: EmailContent
    var Destination: Destination
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var EmailTags: js.UndefOr[MessageTagList]
    var FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress]
    var FromEmailAddress: js.UndefOr[EmailAddress]
    var ReplyToAddresses: js.UndefOr[EmailAddressList]
  }

  object SendEmailRequest {
    @inline
    def apply(
        Content: EmailContent,
        Destination: Destination,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        EmailTags: js.UndefOr[MessageTagList] = js.undefined,
        FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        ReplyToAddresses: js.UndefOr[EmailAddressList] = js.undefined
    ): SendEmailRequest = {
      val __obj = js.Dynamic.literal(
        "Content"     -> Content.asInstanceOf[js.Any],
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      EmailTags.foreach(__v => __obj.updateDynamic("EmailTags")(__v.asInstanceOf[js.Any]))
      FeedbackForwardingEmailAddress.foreach(__v =>
        __obj.updateDynamic("FeedbackForwardingEmailAddress")(__v.asInstanceOf[js.Any])
      )
      FromEmailAddress.foreach(__v => __obj.updateDynamic("FromEmailAddress")(__v.asInstanceOf[js.Any]))
      ReplyToAddresses.foreach(__v => __obj.updateDynamic("ReplyToAddresses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendEmailRequest]
    }
  }

  /**
    * A unique message ID that you receive when Amazon Pinpoint accepts an email for sending.
    */
  @js.native
  trait SendEmailResponse extends js.Object {
    var MessageId: js.UndefOr[OutboundMessageId]
  }

  object SendEmailResponse {
    @inline
    def apply(
        MessageId: js.UndefOr[OutboundMessageId] = js.undefined
    ): SendEmailResponse = {
      val __obj = js.Dynamic.literal()
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendEmailResponse]
    }
  }

  /**
    * An object that contains information about the per-day and per-second sending limits for your Amazon Pinpoint account in the current AWS Region.
    */
  @js.native
  trait SendQuota extends js.Object {
    var Max24HourSend: js.UndefOr[Max24HourSend]
    var MaxSendRate: js.UndefOr[MaxSendRate]
    var SentLast24Hours: js.UndefOr[SentLast24Hours]
  }

  object SendQuota {
    @inline
    def apply(
        Max24HourSend: js.UndefOr[Max24HourSend] = js.undefined,
        MaxSendRate: js.UndefOr[MaxSendRate] = js.undefined,
        SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined
    ): SendQuota = {
      val __obj = js.Dynamic.literal()
      Max24HourSend.foreach(__v => __obj.updateDynamic("Max24HourSend")(__v.asInstanceOf[js.Any]))
      MaxSendRate.foreach(__v => __obj.updateDynamic("MaxSendRate")(__v.asInstanceOf[js.Any]))
      SentLast24Hours.foreach(__v => __obj.updateDynamic("SentLast24Hours")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendQuota]
    }
  }

  /**
    * Used to enable or disable email sending for messages that use this configuration set in the current AWS Region.
    */
  @js.native
  trait SendingOptions extends js.Object {
    var SendingEnabled: js.UndefOr[Enabled]
  }

  object SendingOptions {
    @inline
    def apply(
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): SendingOptions = {
      val __obj = js.Dynamic.literal()
      SendingEnabled.foreach(__v => __obj.updateDynamic("SendingEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendingOptions]
    }
  }

  /**
    * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.
    */
  @js.native
  trait SnsDestination extends js.Object {
    var TopicArn: AmazonResourceName
  }

  object SnsDestination {
    @inline
    def apply(
        TopicArn: AmazonResourceName
    ): SnsDestination = {
      val __obj = js.Dynamic.literal(
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SnsDestination]
    }
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
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait Template extends js.Object {
    var TemplateArn: js.UndefOr[TemplateArn]
    var TemplateData: js.UndefOr[TemplateData]
  }

  object Template {
    @inline
    def apply(
        TemplateArn: js.UndefOr[TemplateArn] = js.undefined,
        TemplateData: js.UndefOr[TemplateData] = js.undefined
    ): Template = {
      val __obj = js.Dynamic.literal()
      TemplateArn.foreach(__v => __obj.updateDynamic("TemplateArn")(__v.asInstanceOf[js.Any]))
      TemplateData.foreach(__v => __obj.updateDynamic("TemplateData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Template]
    }
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
  trait TrackingOptions extends js.Object {
    var CustomRedirectDomain: CustomRedirectDomain
  }

  object TrackingOptions {
    @inline
    def apply(
        CustomRedirectDomain: CustomRedirectDomain
    ): TrackingOptions = {
      val __obj = js.Dynamic.literal(
        "CustomRedirectDomain" -> CustomRedirectDomain.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TrackingOptions]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /**
    * A request to change the settings for an event destination for a configuration set.
    */
  @js.native
  trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestination: EventDestinationDefinition
    var EventDestinationName: EventDestinationName
  }

  object UpdateConfigurationSetEventDestinationRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        EventDestination: EventDestinationDefinition,
        EventDestinationName: EventDestinationName
    ): UpdateConfigurationSetEventDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestination"     -> EventDestination.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait UpdateConfigurationSetEventDestinationResponse extends js.Object {}

  object UpdateConfigurationSetEventDestinationResponse {
    @inline
    def apply(
    ): UpdateConfigurationSetEventDestinationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateConfigurationSetEventDestinationResponse]
    }
  }

  /**
    * An object that contains information about the amount of email that was delivered to recipients.
    */
  @js.native
  trait VolumeStatistics extends js.Object {
    var InboxRawCount: js.UndefOr[Volume]
    var ProjectedInbox: js.UndefOr[Volume]
    var ProjectedSpam: js.UndefOr[Volume]
    var SpamRawCount: js.UndefOr[Volume]
  }

  object VolumeStatistics {
    @inline
    def apply(
        InboxRawCount: js.UndefOr[Volume] = js.undefined,
        ProjectedInbox: js.UndefOr[Volume] = js.undefined,
        ProjectedSpam: js.UndefOr[Volume] = js.undefined,
        SpamRawCount: js.UndefOr[Volume] = js.undefined
    ): VolumeStatistics = {
      val __obj = js.Dynamic.literal()
      InboxRawCount.foreach(__v => __obj.updateDynamic("InboxRawCount")(__v.asInstanceOf[js.Any]))
      ProjectedInbox.foreach(__v => __obj.updateDynamic("ProjectedInbox")(__v.asInstanceOf[js.Any]))
      ProjectedSpam.foreach(__v => __obj.updateDynamic("ProjectedSpam")(__v.asInstanceOf[js.Any]))
      SpamRawCount.foreach(__v => __obj.updateDynamic("SpamRawCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeStatistics]
    }
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
