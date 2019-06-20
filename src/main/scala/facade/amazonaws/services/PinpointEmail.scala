package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object pinpointemail {
  type AmazonResourceName                = String
  type BehaviorOnMxFailure               = String
  type BlacklistEntries                  = js.Array[BlacklistEntry]
  type BlacklistItemName                 = String
  type BlacklistItemNames                = js.Array[BlacklistItemName]
  type BlacklistReport                   = js.Dictionary[BlacklistEntries]
  type BlacklistingDescription           = String
  type Charset                           = String
  type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]
  type ConfigurationSetName              = String
  type ConfigurationSetNameList          = js.Array[ConfigurationSetName]
  type CustomRedirectDomain              = String
  type DailyVolumes                      = js.Array[DailyVolume]
  type DedicatedIpList                   = js.Array[DedicatedIp]
  type DefaultDimensionValue             = String
  type DeliverabilityTestReports         = js.Array[DeliverabilityTestReport]
  type DeliverabilityTestStatus          = String
  type DeliverabilityTestSubject         = String
  type DimensionName                     = String
  type DimensionValueSource              = String
  type DkimStatus                        = String
  type DnsToken                          = String
  type DnsTokenList                      = js.Array[DnsToken]
  type DomainIspPlacements               = js.Array[DomainIspPlacement]
  type EmailAddress                      = String
  type EmailAddressList                  = js.Array[EmailAddress]
  type Enabled                           = Boolean
  type EventDestinationName              = String
  type EventDestinations                 = js.Array[EventDestination]
  type EventType                         = String
  type EventTypes                        = js.Array[EventType]
  type GeneralEnforcementStatus          = String
  type Identity                          = String
  type IdentityInfoList                  = js.Array[IdentityInfo]
  type IdentityType                      = String
  type Ip                                = String
  type IspName                           = String
  type IspPlacements                     = js.Array[IspPlacement]
  type LastFreshStart                    = js.Date
  type ListOfDedicatedIpPools            = js.Array[PoolName]
  type MailFromDomainName                = String
  type MailFromDomainStatus              = String
  type Max24HourSend                     = Double
  type MaxItems                          = Int
  type MaxSendRate                       = Double
  type MessageContent                    = String
  type MessageData                       = String
  type MessageTagList                    = js.Array[MessageTag]
  type MessageTagName                    = String
  type MessageTagValue                   = String
  type NextToken                         = String
  type OutboundMessageId                 = String
  type Percentage                        = Double
  type Percentage100Wrapper              = Int
  type PoolName                          = String
  type RawMessageData =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type RblName         = String
  type ReportId        = String
  type ReportName      = String
  type SendingPoolName = String
  type SentLast24Hours = Double
  type TagKey          = String
  type TagKeyList      = js.Array[TagKey]
  type TagList         = js.Array[Tag]
  type TagValue        = String
  type Timestamp       = js.Date
  type Volume          = Double
  type WarmupStatus    = String
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
    def getDomainStatisticsReport(
        params: GetDomainStatisticsReportRequest
    ): Request[GetDomainStatisticsReportResponse]                                                           = js.native
    def getEmailIdentity(params: GetEmailIdentityRequest): Request[GetEmailIdentityResponse]                = js.native
    def listConfigurationSets(params: ListConfigurationSetsRequest): Request[ListConfigurationSetsResponse] = js.native
    def listDedicatedIpPools(params: ListDedicatedIpPoolsRequest): Request[ListDedicatedIpPoolsResponse]    = js.native
    def listDeliverabilityTestReports(
        params: ListDeliverabilityTestReportsRequest
    ): Request[ListDeliverabilityTestReportsResponse]                                                 = js.native
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
  object BehaviorOnMxFailureEnum {
    val USE_DEFAULT_VALUE = "USE_DEFAULT_VALUE"
    val REJECT_MESSAGE    = "REJECT_MESSAGE"

    val values = IndexedSeq(USE_DEFAULT_VALUE, REJECT_MESSAGE)
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
    def apply(
        Description: js.UndefOr[BlacklistingDescription] = js.undefined,
        ListingTime: js.UndefOr[Timestamp] = js.undefined,
        RblName: js.UndefOr[RblName] = js.undefined
    ): BlacklistEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListingTime" -> ListingTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RblName" -> RblName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlacklistEntry]
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
    def apply(
        Html: js.UndefOr[Content] = js.undefined,
        Text: js.UndefOr[Content] = js.undefined
    ): Body = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Html" -> Html.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Text" -> Text.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Body]
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
    def apply(
        DimensionConfigurations: CloudWatchDimensionConfigurations
    ): CloudWatchDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DimensionConfigurations" -> DimensionConfigurations.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchDestination]
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
    def apply(
        DefaultDimensionValue: DefaultDimensionValue,
        DimensionName: DimensionName,
        DimensionValueSource: DimensionValueSource
    ): CloudWatchDimensionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultDimensionValue" -> DefaultDimensionValue.asInstanceOf[js.Any],
        "DimensionName"         -> DimensionName.asInstanceOf[js.Any],
        "DimensionValueSource"  -> DimensionValueSource.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchDimensionConfiguration]
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
    def apply(
        Data: MessageData,
        Charset: js.UndefOr[Charset] = js.undefined
    ): Content = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.asInstanceOf[js.Any],
        "Charset" -> Charset.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Content]
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
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        EventDestination: EventDestinationDefinition,
        EventDestinationName: EventDestinationName
    ): CreateConfigurationSetEventDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestination"     -> EventDestination.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[CreateConfigurationSetEventDestinationRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait CreateConfigurationSetEventDestinationResponse extends js.Object {}

  object CreateConfigurationSetEventDestinationResponse {
    def apply(
        ): CreateConfigurationSetEventDestinationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[CreateConfigurationSetEventDestinationResponse]
    }
  }

  /**
    * A request to create a configuration set.
    */
  @js.native
  trait CreateConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var DeliveryOptions: js.UndefOr[DeliveryOptions]
    var ReputationOptions: js.UndefOr[ReputationOptions]
    var SendingOptions: js.UndefOr[SendingOptions]
    var Tags: js.UndefOr[TagList]
    var TrackingOptions: js.UndefOr[TrackingOptions]
  }

  object CreateConfigurationSetRequest {
    def apply(
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined,
        ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined,
        SendingOptions: js.UndefOr[SendingOptions] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined
    ): CreateConfigurationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeliveryOptions" -> DeliveryOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReputationOptions" -> ReputationOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SendingOptions" -> SendingOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrackingOptions" -> TrackingOptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait CreateConfigurationSetResponse extends js.Object {}

  object CreateConfigurationSetResponse {
    def apply(
        ): CreateConfigurationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetResponse]
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
    def apply(
        PoolName: PoolName,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDedicatedIpPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PoolName" -> PoolName.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDedicatedIpPoolRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait CreateDedicatedIpPoolResponse extends js.Object {}

  object CreateDedicatedIpPoolResponse {
    def apply(
        ): CreateDedicatedIpPoolResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDedicatedIpPoolResponse]
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
    def apply(
        Content: EmailContent,
        FromEmailAddress: EmailAddress,
        ReportName: js.UndefOr[ReportName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDeliverabilityTestReportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content"          -> Content.asInstanceOf[js.Any],
        "FromEmailAddress" -> FromEmailAddress.asInstanceOf[js.Any],
        "ReportName" -> ReportName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeliverabilityTestReportRequest]
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
    def apply(
        DeliverabilityTestStatus: DeliverabilityTestStatus,
        ReportId: ReportId
    ): CreateDeliverabilityTestReportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliverabilityTestStatus" -> DeliverabilityTestStatus.asInstanceOf[js.Any],
        "ReportId"                 -> ReportId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeliverabilityTestReportResponse]
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
    def apply(
        EmailIdentity: Identity,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateEmailIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEmailIdentityRequest]
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
    def apply(
        DkimAttributes: js.UndefOr[DkimAttributes] = js.undefined,
        IdentityType: js.UndefOr[IdentityType] = js.undefined,
        VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined
    ): CreateEmailIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DkimAttributes" -> DkimAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IdentityType" -> IdentityType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VerifiedForSendingStatus" -> VerifiedForSendingStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEmailIdentityResponse]
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
    def apply(
        DomainIspPlacements: js.UndefOr[DomainIspPlacements] = js.undefined,
        StartDate: js.UndefOr[Timestamp] = js.undefined,
        VolumeStatistics: js.UndefOr[VolumeStatistics] = js.undefined
    ): DailyVolume = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainIspPlacements" -> DomainIspPlacements.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartDate" -> StartDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeStatistics" -> VolumeStatistics.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DailyVolume]
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
    def apply(
        Ip: Ip,
        WarmupPercentage: Percentage100Wrapper,
        WarmupStatus: WarmupStatus,
        PoolName: js.UndefOr[PoolName] = js.undefined
    ): DedicatedIp = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ip"               -> Ip.asInstanceOf[js.Any],
        "WarmupPercentage" -> WarmupPercentage.asInstanceOf[js.Any],
        "WarmupStatus"     -> WarmupStatus.asInstanceOf[js.Any],
        "PoolName" -> PoolName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DedicatedIp]
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
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        EventDestinationName: EventDestinationName
    ): DeleteConfigurationSetEventDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteConfigurationSetEventDestinationResponse extends js.Object {}

  object DeleteConfigurationSetEventDestinationResponse {
    def apply(
        ): DeleteConfigurationSetEventDestinationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DeleteConfigurationSetEventDestinationResponse]
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
    def apply(
        ConfigurationSetName: ConfigurationSetName
    ): DeleteConfigurationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteConfigurationSetResponse extends js.Object {}

  object DeleteConfigurationSetResponse {
    def apply(
        ): DeleteConfigurationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetResponse]
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
    def apply(
        PoolName: PoolName
    ): DeleteDedicatedIpPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PoolName" -> PoolName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDedicatedIpPoolRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteDedicatedIpPoolResponse extends js.Object {}

  object DeleteDedicatedIpPoolResponse {
    def apply(
        ): DeleteDedicatedIpPoolResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDedicatedIpPoolResponse]
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
    def apply(
        EmailIdentity: Identity
    ): DeleteEmailIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEmailIdentityRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait DeleteEmailIdentityResponse extends js.Object {}

  object DeleteEmailIdentityResponse {
    def apply(
        ): DeleteEmailIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEmailIdentityResponse]
    }
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
    def apply(
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        DeliverabilityTestStatus: js.UndefOr[DeliverabilityTestStatus] = js.undefined,
        FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        ReportId: js.UndefOr[ReportId] = js.undefined,
        ReportName: js.UndefOr[ReportName] = js.undefined,
        Subject: js.UndefOr[DeliverabilityTestSubject] = js.undefined
    ): DeliverabilityTestReport = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateDate" -> CreateDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeliverabilityTestStatus" -> DeliverabilityTestStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FromEmailAddress" -> FromEmailAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReportId" -> ReportId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReportName" -> ReportName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Subject" -> Subject.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliverabilityTestReport]
    }
  }

  /**
    * The status of a predictive inbox placement test. If the status is <code>IN_PROGRESS</code>, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is <code>COMPLETE</code>, then the test is finished, and you can use the <code>GetDeliverabilityTestReport</code> operation to view the results of the test.
    */
  object DeliverabilityTestStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETED   = "COMPLETED"

    val values = IndexedSeq(IN_PROGRESS, COMPLETED)
  }

  /**
    * Used to associate a configuration set with a dedicated IP pool.
    */
  @js.native
  trait DeliveryOptions extends js.Object {
    var SendingPoolName: js.UndefOr[PoolName]
  }

  object DeliveryOptions {
    def apply(
        SendingPoolName: js.UndefOr[PoolName] = js.undefined
    ): DeliveryOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SendingPoolName" -> SendingPoolName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliveryOptions]
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
    def apply(
        BccAddresses: js.UndefOr[EmailAddressList] = js.undefined,
        CcAddresses: js.UndefOr[EmailAddressList] = js.undefined,
        ToAddresses: js.UndefOr[EmailAddressList] = js.undefined
    ): Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BccAddresses" -> BccAddresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CcAddresses" -> CcAddresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ToAddresses" -> ToAddresses.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }

  /**
    * The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you want Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint to use your own email headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link tags, choose <code>linkTags</code>.
    */
  object DimensionValueSourceEnum {
    val MESSAGE_TAG  = "MESSAGE_TAG"
    val EMAIL_HEADER = "EMAIL_HEADER"
    val LINK_TAG     = "LINK_TAG"

    val values = IndexedSeq(MESSAGE_TAG, EMAIL_HEADER, LINK_TAG)
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
    def apply(
        SigningEnabled: js.UndefOr[Enabled] = js.undefined,
        Status: js.UndefOr[DkimStatus] = js.undefined,
        Tokens: js.UndefOr[DnsTokenList] = js.undefined
    ): DkimAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SigningEnabled" -> SigningEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tokens" -> Tokens.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DkimAttributes]
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
  object DkimStatusEnum {
    val PENDING           = "PENDING"
    val SUCCESS           = "SUCCESS"
    val FAILED            = "FAILED"
    val TEMPORARY_FAILURE = "TEMPORARY_FAILURE"
    val NOT_STARTED       = "NOT_STARTED"

    val values = IndexedSeq(PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE, NOT_STARTED)
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
    def apply(
        InboxPercentage: js.UndefOr[Percentage] = js.undefined,
        InboxRawCount: js.UndefOr[Volume] = js.undefined,
        IspName: js.UndefOr[IspName] = js.undefined,
        SpamPercentage: js.UndefOr[Percentage] = js.undefined,
        SpamRawCount: js.UndefOr[Volume] = js.undefined
    ): DomainIspPlacement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InboxPercentage" -> InboxPercentage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InboxRawCount" -> InboxRawCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IspName" -> IspName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SpamPercentage" -> SpamPercentage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SpamRawCount" -> SpamRawCount.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainIspPlacement]
    }
  }

  /**
    * An object that defines the entire content of the email, including the message headers and the body content. You can create a simple email message, in which you specify the subject and the text and HTML versions of the message body. You can also create raw messages, in which you specify a complete MIME-formatted message. Raw messages can include attachments and custom headers.
    */
  @js.native
  trait EmailContent extends js.Object {
    var Raw: js.UndefOr[RawMessage]
    var Simple: js.UndefOr[Message]
  }

  object EmailContent {
    def apply(
        Raw: js.UndefOr[RawMessage] = js.undefined,
        Simple: js.UndefOr[Message] = js.undefined
    ): EmailContent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Raw" -> Raw.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Simple" -> Simple.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmailContent]
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
    def apply(
        MatchingEventTypes: EventTypes,
        Name: EventDestinationName,
        CloudWatchDestination: js.UndefOr[CloudWatchDestination] = js.undefined,
        Enabled: js.UndefOr[Enabled] = js.undefined,
        KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
        PinpointDestination: js.UndefOr[PinpointDestination] = js.undefined,
        SnsDestination: js.UndefOr[SnsDestination] = js.undefined
    ): EventDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MatchingEventTypes" -> MatchingEventTypes.asInstanceOf[js.Any],
        "Name"               -> Name.asInstanceOf[js.Any],
        "CloudWatchDestination" -> CloudWatchDestination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisFirehoseDestination" -> KinesisFirehoseDestination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PinpointDestination" -> PinpointDestination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsDestination" -> SnsDestination.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDestination]
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
    def apply(
        CloudWatchDestination: js.UndefOr[CloudWatchDestination] = js.undefined,
        Enabled: js.UndefOr[Enabled] = js.undefined,
        KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
        MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined,
        PinpointDestination: js.UndefOr[PinpointDestination] = js.undefined,
        SnsDestination: js.UndefOr[SnsDestination] = js.undefined
    ): EventDestinationDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchDestination" -> CloudWatchDestination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisFirehoseDestination" -> KinesisFirehoseDestination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MatchingEventTypes" -> MatchingEventTypes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PinpointDestination" -> PinpointDestination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsDestination" -> SnsDestination.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDestinationDefinition]
    }
  }

  /**
    * An email sending event type. For example, email sends, opens, and bounces are all email events.
    */
  object EventTypeEnum {
    val SEND              = "SEND"
    val REJECT            = "REJECT"
    val BOUNCE            = "BOUNCE"
    val COMPLAINT         = "COMPLAINT"
    val DELIVERY          = "DELIVERY"
    val OPEN              = "OPEN"
    val CLICK             = "CLICK"
    val RENDERING_FAILURE = "RENDERING_FAILURE"

    val values = IndexedSeq(SEND, REJECT, BOUNCE, COMPLAINT, DELIVERY, OPEN, CLICK, RENDERING_FAILURE)
  }

  /**
    * A request to obtain information about the email-sending capabilities of your Amazon Pinpoint account.
    */
  @js.native
  trait GetAccountRequest extends js.Object {}

  object GetAccountRequest {
    def apply(
        ): GetAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountRequest]
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
    def apply(
        DedicatedIpAutoWarmupEnabled: js.UndefOr[Enabled] = js.undefined,
        EnforcementStatus: js.UndefOr[GeneralEnforcementStatus] = js.undefined,
        ProductionAccessEnabled: js.UndefOr[Enabled] = js.undefined,
        SendQuota: js.UndefOr[SendQuota] = js.undefined,
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): GetAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedIpAutoWarmupEnabled" -> DedicatedIpAutoWarmupEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnforcementStatus" -> EnforcementStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProductionAccessEnabled" -> ProductionAccessEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SendQuota" -> SendQuota.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SendingEnabled" -> SendingEnabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountResponse]
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
    def apply(
        BlacklistItemNames: BlacklistItemNames
    ): GetBlacklistReportsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BlacklistItemNames" -> BlacklistItemNames.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBlacklistReportsRequest]
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
    def apply(
        BlacklistReport: BlacklistReport
    ): GetBlacklistReportsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BlacklistReport" -> BlacklistReport.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBlacklistReportsResponse]
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
    def apply(
        ConfigurationSetName: ConfigurationSetName
    ): GetConfigurationSetEventDestinationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[GetConfigurationSetEventDestinationsRequest]
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
    def apply(
        EventDestinations: js.UndefOr[EventDestinations] = js.undefined
    ): GetConfigurationSetEventDestinationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventDestinations" -> EventDestinations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[GetConfigurationSetEventDestinationsResponse]
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
    def apply(
        ConfigurationSetName: ConfigurationSetName
    ): GetConfigurationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConfigurationSetRequest]
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
    var TrackingOptions: js.UndefOr[TrackingOptions]
  }

  object GetConfigurationSetResponse {
    def apply(
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined,
        ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined,
        SendingOptions: js.UndefOr[SendingOptions] = js.undefined,
        TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined
    ): GetConfigurationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeliveryOptions" -> DeliveryOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReputationOptions" -> ReputationOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SendingOptions" -> SendingOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrackingOptions" -> TrackingOptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConfigurationSetResponse]
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
    def apply(
        Ip: Ip
    ): GetDedicatedIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ip" -> Ip.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDedicatedIpRequest]
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
    def apply(
        DedicatedIp: js.UndefOr[DedicatedIp] = js.undefined
    ): GetDedicatedIpResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedIp" -> DedicatedIp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDedicatedIpResponse]
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined,
        PoolName: js.UndefOr[PoolName] = js.undefined
    ): GetDedicatedIpsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PoolName" -> PoolName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDedicatedIpsRequest]
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
    def apply(
        DedicatedIps: js.UndefOr[DedicatedIpList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetDedicatedIpsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedIps" -> DedicatedIps.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDedicatedIpsResponse]
    }
  }

  /**
    * A request to retrieve the status of the Deliverability dashboard for your account. When the Deliverability dashboard is enabled, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests.
    *  When you use the Deliverability dashboard, you pay a monthly charge of USD1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the current calendar month.
    */
  @js.native
  trait GetDeliverabilityDashboardOptionsRequest extends js.Object {}

  object GetDeliverabilityDashboardOptionsRequest {
    def apply(
        ): GetDeliverabilityDashboardOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeliverabilityDashboardOptionsRequest]
    }
  }

  /**
    * An object that shows the status of the Deliverability dashboard for your Amazon Pinpoint account.
    */
  @js.native
  trait GetDeliverabilityDashboardOptionsResponse extends js.Object {
    var DashboardEnabled: Enabled
  }

  object GetDeliverabilityDashboardOptionsResponse {
    def apply(
        DashboardEnabled: Enabled
    ): GetDeliverabilityDashboardOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DashboardEnabled" -> DashboardEnabled.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeliverabilityDashboardOptionsResponse]
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
    def apply(
        ReportId: ReportId
    ): GetDeliverabilityTestReportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReportId" -> ReportId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeliverabilityTestReportRequest]
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
  }

  object GetDeliverabilityTestReportResponse {
    def apply(
        DeliverabilityTestReport: DeliverabilityTestReport,
        IspPlacements: IspPlacements,
        OverallPlacement: PlacementStatistics,
        Message: js.UndefOr[MessageContent] = js.undefined
    ): GetDeliverabilityTestReportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliverabilityTestReport" -> DeliverabilityTestReport.asInstanceOf[js.Any],
        "IspPlacements"            -> IspPlacements.asInstanceOf[js.Any],
        "OverallPlacement"         -> OverallPlacement.asInstanceOf[js.Any],
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeliverabilityTestReportResponse]
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
    def apply(
        Domain: Identity,
        EndDate: Timestamp,
        StartDate: Timestamp
    ): GetDomainStatisticsReportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain"    -> Domain.asInstanceOf[js.Any],
        "EndDate"   -> EndDate.asInstanceOf[js.Any],
        "StartDate" -> StartDate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainStatisticsReportRequest]
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
    def apply(
        DailyVolumes: DailyVolumes,
        OverallVolume: OverallVolume
    ): GetDomainStatisticsReportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DailyVolumes"  -> DailyVolumes.asInstanceOf[js.Any],
        "OverallVolume" -> OverallVolume.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainStatisticsReportResponse]
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
    def apply(
        EmailIdentity: Identity
    ): GetEmailIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEmailIdentityRequest]
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
    var VerifiedForSendingStatus: js.UndefOr[Enabled]
  }

  object GetEmailIdentityResponse {
    def apply(
        DkimAttributes: js.UndefOr[DkimAttributes] = js.undefined,
        FeedbackForwardingStatus: js.UndefOr[Enabled] = js.undefined,
        IdentityType: js.UndefOr[IdentityType] = js.undefined,
        MailFromAttributes: js.UndefOr[MailFromAttributes] = js.undefined,
        VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined
    ): GetEmailIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DkimAttributes" -> DkimAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FeedbackForwardingStatus" -> FeedbackForwardingStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IdentityType" -> IdentityType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MailFromAttributes" -> MailFromAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VerifiedForSendingStatus" -> VerifiedForSendingStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEmailIdentityResponse]
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
    def apply(
        IdentityName: js.UndefOr[Identity] = js.undefined,
        IdentityType: js.UndefOr[IdentityType] = js.undefined,
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): IdentityInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityName" -> IdentityName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IdentityType" -> IdentityType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SendingEnabled" -> SendingEnabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityInfo]
    }
  }

  /**
    * The email identity type. The identity type can be one of the following:
    * * <code>EMAIL_ADDRESS</code> – The identity is an email address.
    *  * <code>DOMAIN</code> – The identity is a domain.
    */
  object IdentityTypeEnum {
    val EMAIL_ADDRESS  = "EMAIL_ADDRESS"
    val DOMAIN         = "DOMAIN"
    val MANAGED_DOMAIN = "MANAGED_DOMAIN"

    val values = IndexedSeq(EMAIL_ADDRESS, DOMAIN, MANAGED_DOMAIN)
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
    def apply(
        IspName: js.UndefOr[IspName] = js.undefined,
        PlacementStatistics: js.UndefOr[PlacementStatistics] = js.undefined
    ): IspPlacement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IspName" -> IspName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlacementStatistics" -> PlacementStatistics.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IspPlacement]
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
    def apply(
        DeliveryStreamArn: AmazonResourceName,
        IamRoleArn: AmazonResourceName
    ): KinesisFirehoseDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamArn" -> DeliveryStreamArn.asInstanceOf[js.Any],
        "IamRoleArn"        -> IamRoleArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseDestination]
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListConfigurationSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationSetsRequest]
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
    def apply(
        ConfigurationSets: js.UndefOr[ConfigurationSetNameList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConfigurationSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSets" -> ConfigurationSets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationSetsResponse]
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListDedicatedIpPoolsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDedicatedIpPoolsRequest]
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
    def apply(
        DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDedicatedIpPoolsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedIpPools" -> DedicatedIpPools.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDedicatedIpPoolsResponse]
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListDeliverabilityTestReportsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeliverabilityTestReportsRequest]
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
    def apply(
        DeliverabilityTestReports: DeliverabilityTestReports,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeliverabilityTestReportsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliverabilityTestReports" -> DeliverabilityTestReports.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeliverabilityTestReportsResponse]
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PageSize: js.UndefOr[MaxItems] = js.undefined
    ): ListEmailIdentitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEmailIdentitiesRequest]
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
    def apply(
        EmailIdentities: js.UndefOr[IdentityInfoList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEmailIdentitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentities" -> EmailIdentities.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEmailIdentitiesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceArn: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: TagList
  }

  object ListTagsForResourceResponse {
    def apply(
        Tags: TagList
    ): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
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
    def apply(
        BehaviorOnMxFailure: BehaviorOnMxFailure,
        MailFromDomain: MailFromDomainName,
        MailFromDomainStatus: MailFromDomainStatus
    ): MailFromAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BehaviorOnMxFailure"  -> BehaviorOnMxFailure.asInstanceOf[js.Any],
        "MailFromDomain"       -> MailFromDomain.asInstanceOf[js.Any],
        "MailFromDomainStatus" -> MailFromDomainStatus.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MailFromAttributes]
    }
  }

  /**
    * The status of the MAIL FROM domain. This status can have the following values:
    * * <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet.
    *  * <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.
    *  * <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists.
    *  * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the status of the MAIL FROM domain.
    */
  object MailFromDomainStatusEnum {
    val PENDING           = "PENDING"
    val SUCCESS           = "SUCCESS"
    val FAILED            = "FAILED"
    val TEMPORARY_FAILURE = "TEMPORARY_FAILURE"

    val values = IndexedSeq(PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE)
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
    def apply(
        Body: Body,
        Subject: Content
    ): Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Body"    -> Body.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Message]
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
    def apply(
        Name: MessageTagName,
        Value: MessageTagValue
    ): MessageTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageTag]
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
    def apply(
        DomainIspPlacements: js.UndefOr[DomainIspPlacements] = js.undefined,
        ReadRatePercent: js.UndefOr[Percentage] = js.undefined,
        VolumeStatistics: js.UndefOr[VolumeStatistics] = js.undefined
    ): OverallVolume = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainIspPlacements" -> DomainIspPlacements.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadRatePercent" -> ReadRatePercent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeStatistics" -> VolumeStatistics.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OverallVolume]
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
    def apply(
        ApplicationArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): PinpointDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationArn" -> ApplicationArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PinpointDestination]
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
    def apply(
        DkimPercentage: js.UndefOr[Percentage] = js.undefined,
        InboxPercentage: js.UndefOr[Percentage] = js.undefined,
        MissingPercentage: js.UndefOr[Percentage] = js.undefined,
        SpamPercentage: js.UndefOr[Percentage] = js.undefined,
        SpfPercentage: js.UndefOr[Percentage] = js.undefined
    ): PlacementStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DkimPercentage" -> DkimPercentage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InboxPercentage" -> InboxPercentage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MissingPercentage" -> MissingPercentage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SpamPercentage" -> SpamPercentage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SpfPercentage" -> SpfPercentage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementStatistics]
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
    def apply(
        AutoWarmupEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutAccountDedicatedIpWarmupAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoWarmupEnabled" -> AutoWarmupEnabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[PutAccountDedicatedIpWarmupAttributesRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutAccountDedicatedIpWarmupAttributesResponse extends js.Object {}

  object PutAccountDedicatedIpWarmupAttributesResponse {
    def apply(
        ): PutAccountDedicatedIpWarmupAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[PutAccountDedicatedIpWarmupAttributesResponse]
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
    def apply(
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutAccountSendingAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SendingEnabled" -> SendingEnabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAccountSendingAttributesRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutAccountSendingAttributesResponse extends js.Object {}

  object PutAccountSendingAttributesResponse {
    def apply(
        ): PutAccountSendingAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAccountSendingAttributesResponse]
    }
  }

  /**
    * A request to associate a configuration set with a dedicated IP pool.
    */
  @js.native
  trait PutConfigurationSetDeliveryOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var SendingPoolName: js.UndefOr[SendingPoolName]
  }

  object PutConfigurationSetDeliveryOptionsRequest {
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        SendingPoolName: js.UndefOr[SendingPoolName] = js.undefined
    ): PutConfigurationSetDeliveryOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "SendingPoolName" -> SendingPoolName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationSetDeliveryOptionsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[PutConfigurationSetDeliveryOptionsResponse]
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
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutConfigurationSetReputationOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "ReputationMetricsEnabled" -> ReputationMetricsEnabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[PutConfigurationSetReputationOptionsRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetReputationOptionsResponse extends js.Object {}

  object PutConfigurationSetReputationOptionsResponse {
    def apply(
        ): PutConfigurationSetReputationOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[PutConfigurationSetReputationOptionsResponse]
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
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutConfigurationSetSendingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "SendingEnabled" -> SendingEnabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationSetSendingOptionsRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetSendingOptionsResponse extends js.Object {}

  object PutConfigurationSetSendingOptionsResponse {
    def apply(
        ): PutConfigurationSetSendingOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationSetSendingOptionsResponse]
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
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        CustomRedirectDomain: js.UndefOr[CustomRedirectDomain] = js.undefined
    ): PutConfigurationSetTrackingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "CustomRedirectDomain" -> CustomRedirectDomain.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationSetTrackingOptionsRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutConfigurationSetTrackingOptionsResponse extends js.Object {}

  object PutConfigurationSetTrackingOptionsResponse {
    def apply(
        ): PutConfigurationSetTrackingOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[PutConfigurationSetTrackingOptionsResponse]
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
    def apply(
        DestinationPoolName: PoolName,
        Ip: Ip
    ): PutDedicatedIpInPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationPoolName" -> DestinationPoolName.asInstanceOf[js.Any],
        "Ip"                  -> Ip.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDedicatedIpInPoolRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutDedicatedIpInPoolResponse extends js.Object {}

  object PutDedicatedIpInPoolResponse {
    def apply(
        ): PutDedicatedIpInPoolResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDedicatedIpInPoolResponse]
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
    def apply(
        Ip: Ip,
        WarmupPercentage: Percentage100Wrapper
    ): PutDedicatedIpWarmupAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ip"               -> Ip.asInstanceOf[js.Any],
        "WarmupPercentage" -> WarmupPercentage.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDedicatedIpWarmupAttributesRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutDedicatedIpWarmupAttributesResponse extends js.Object {}

  object PutDedicatedIpWarmupAttributesResponse {
    def apply(
        ): PutDedicatedIpWarmupAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDedicatedIpWarmupAttributesResponse]
    }
  }

  /**
    * A request to enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests.
    *  When you use the Deliverability dashboard, you pay a monthly charge of USD1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, we prorate the monthly charge based on how many days have elapsed in the current calendar month.
    */
  @js.native
  trait PutDeliverabilityDashboardOptionRequest extends js.Object {
    var DashboardEnabled: Enabled
  }

  object PutDeliverabilityDashboardOptionRequest {
    def apply(
        DashboardEnabled: Enabled
    ): PutDeliverabilityDashboardOptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DashboardEnabled" -> DashboardEnabled.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDeliverabilityDashboardOptionRequest]
    }
  }

  /**
    * A response that indicates whether the Deliverability dashboard is enabled for your Amazon Pinpoint account.
    */
  @js.native
  trait PutDeliverabilityDashboardOptionResponse extends js.Object {}

  object PutDeliverabilityDashboardOptionResponse {
    def apply(
        ): PutDeliverabilityDashboardOptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDeliverabilityDashboardOptionResponse]
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
    def apply(
        EmailIdentity: Identity,
        SigningEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutEmailIdentityDkimAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any],
        "SigningEnabled" -> SigningEnabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEmailIdentityDkimAttributesRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutEmailIdentityDkimAttributesResponse extends js.Object {}

  object PutEmailIdentityDkimAttributesResponse {
    def apply(
        ): PutEmailIdentityDkimAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEmailIdentityDkimAttributesResponse]
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
    def apply(
        EmailIdentity: Identity,
        EmailForwardingEnabled: js.UndefOr[Enabled] = js.undefined
    ): PutEmailIdentityFeedbackAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any],
        "EmailForwardingEnabled" -> EmailForwardingEnabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEmailIdentityFeedbackAttributesRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutEmailIdentityFeedbackAttributesResponse extends js.Object {}

  object PutEmailIdentityFeedbackAttributesResponse {
    def apply(
        ): PutEmailIdentityFeedbackAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[PutEmailIdentityFeedbackAttributesResponse]
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
    def apply(
        EmailIdentity: Identity,
        BehaviorOnMxFailure: js.UndefOr[BehaviorOnMxFailure] = js.undefined,
        MailFromDomain: js.UndefOr[MailFromDomainName] = js.undefined
    ): PutEmailIdentityMailFromAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any],
        "BehaviorOnMxFailure" -> BehaviorOnMxFailure.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MailFromDomain" -> MailFromDomain.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEmailIdentityMailFromAttributesRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait PutEmailIdentityMailFromAttributesResponse extends js.Object {}

  object PutEmailIdentityMailFromAttributesResponse {
    def apply(
        ): PutEmailIdentityMailFromAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[PutEmailIdentityMailFromAttributesResponse]
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
    def apply(
        Data: RawMessageData
    ): RawMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RawMessage]
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
    def apply(
        LastFreshStart: js.UndefOr[LastFreshStart] = js.undefined,
        ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
    ): ReputationOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastFreshStart" -> LastFreshStart.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReputationMetricsEnabled" -> ReputationMetricsEnabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReputationOptions]
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
    def apply(
        Content: EmailContent,
        Destination: Destination,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        EmailTags: js.UndefOr[MessageTagList] = js.undefined,
        FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        ReplyToAddresses: js.UndefOr[EmailAddressList] = js.undefined
    ): SendEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content"     -> Content.asInstanceOf[js.Any],
        "Destination" -> Destination.asInstanceOf[js.Any],
        "ConfigurationSetName" -> ConfigurationSetName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmailTags" -> EmailTags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FeedbackForwardingEmailAddress" -> FeedbackForwardingEmailAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FromEmailAddress" -> FromEmailAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReplyToAddresses" -> ReplyToAddresses.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendEmailRequest]
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
    def apply(
        MessageId: js.UndefOr[OutboundMessageId] = js.undefined
    ): SendEmailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageId" -> MessageId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendEmailResponse]
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
    def apply(
        Max24HourSend: js.UndefOr[Max24HourSend] = js.undefined,
        MaxSendRate: js.UndefOr[MaxSendRate] = js.undefined,
        SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined
    ): SendQuota = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Max24HourSend" -> Max24HourSend.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxSendRate" -> MaxSendRate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SentLast24Hours" -> SentLast24Hours.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendQuota]
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
    def apply(
        SendingEnabled: js.UndefOr[Enabled] = js.undefined
    ): SendingOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SendingEnabled" -> SendingEnabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendingOptions]
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
    def apply(
        TopicArn: AmazonResourceName
    ): SnsDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnsDestination]
    }
  }

  /**
    * An object that defines the tags that are associated with a resource. A <i>tag</i> is a label that you optionally define and associate with a resource in Amazon Pinpoint. Tags can help you categorize and manage resources in different ways, such as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags.
    *  Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A tag key is a general label that acts as a category for a more specific tag value. A tag value acts as a descriptor within a tag key. For example, if you have two versions of an Amazon Pinpoint project, one for internal testing and another for external use, you might assign a <code>Stack</code> tag key to both projects. The value of the <code>Stack</code> tag key might be <code>Test</code> for one project and <code>Production</code> for the other project.
    *  A tag key can contain as many as 128 characters. A tag value can contain as many as 256 characters. The characters can be Unicode letters, digits, white space, or one of the following symbols: _ . : / = + -. The following additional restrictions apply to tags:
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
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
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
    def apply(
        CustomRedirectDomain: CustomRedirectDomain
    ): TrackingOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomRedirectDomain" -> CustomRedirectDomain.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrackingOptions]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        ResourceArn: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
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
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        EventDestination: EventDestinationDefinition,
        EventDestinationName: EventDestinationName
    ): UpdateConfigurationSetEventDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestination"     -> EventDestination.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
    }
  }

  /**
    * An HTTP 200 response if the request succeeds, or an error message if the request fails.
    */
  @js.native
  trait UpdateConfigurationSetEventDestinationResponse extends js.Object {}

  object UpdateConfigurationSetEventDestinationResponse {
    def apply(
        ): UpdateConfigurationSetEventDestinationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[UpdateConfigurationSetEventDestinationResponse]
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
    def apply(
        InboxRawCount: js.UndefOr[Volume] = js.undefined,
        ProjectedInbox: js.UndefOr[Volume] = js.undefined,
        ProjectedSpam: js.UndefOr[Volume] = js.undefined,
        SpamRawCount: js.UndefOr[Volume] = js.undefined
    ): VolumeStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InboxRawCount" -> InboxRawCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProjectedInbox" -> ProjectedInbox.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProjectedSpam" -> ProjectedSpam.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SpamRawCount" -> SpamRawCount.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeStatistics]
    }
  }

  /**
    * The warmup status of a dedicated IP.
    */
  object WarmupStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val DONE        = "DONE"

    val values = IndexedSeq(IN_PROGRESS, DONE)
  }
}
