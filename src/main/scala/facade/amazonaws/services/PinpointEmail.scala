package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object pinpointemail {
  type AmazonResourceName = String
  type BehaviorOnMxFailure = String
  type Charset = String
  type CloudWatchDimensionConfigurations = js.Array[CloudWatchDimensionConfiguration]
  type ConfigurationSetName = String
  type ConfigurationSetNameList = js.Array[ConfigurationSetName]
  type CustomRedirectDomain = String
  type DedicatedIpList = js.Array[DedicatedIp]
  type DefaultDimensionValue = String
  type DimensionName = String
  type DimensionValueSource = String
  type DkimStatus = String
  type DnsToken = String
  type DnsTokenList = js.Array[DnsToken]
  type EmailAddress = String
  type EmailAddressList = js.Array[EmailAddress]
  type Enabled = Boolean
  type EventDestinationName = String
  type EventDestinations = js.Array[EventDestination]
  type EventType = String
  type EventTypes = js.Array[EventType]
  type GeneralEnforcementStatus = String
  type Identity = String
  type IdentityInfoList = js.Array[IdentityInfo]
  type IdentityType = String
  type Ip = String
  type LastFreshStart = js.Date
  type ListOfDedicatedIpPools = js.Array[PoolName]
  type MailFromDomainName = String
  type MailFromDomainStatus = String
  type Max24HourSend = Double
  type MaxItems = Int
  type MaxSendRate = Double
  type MessageData = String
  type MessageTagList = js.Array[MessageTag]
  type MessageTagName = String
  type MessageTagValue = String
  type NextToken = String
  type OutboundMessageId = String
  type Percentage100Wrapper = Int
  type PoolName = String
  type RawMessageData = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type SendingPoolName = String
  type SentLast24Hours = Double
  type WarmupStatus = String
}

package pinpointemail {
  @js.native
  @JSImport("aws-sdk", "PinpointEmail")
  class PinpointEmail(config: AWSConfig) extends js.Object {
    def createConfigurationSet(params: CreateConfigurationSetRequest): Request[CreateConfigurationSetResponse] = js.native
    def createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest): Request[CreateConfigurationSetEventDestinationResponse] = js.native
    def createDedicatedIpPool(params: CreateDedicatedIpPoolRequest): Request[CreateDedicatedIpPoolResponse] = js.native
    def createEmailIdentity(params: CreateEmailIdentityRequest): Request[CreateEmailIdentityResponse] = js.native
    def deleteConfigurationSet(params: DeleteConfigurationSetRequest): Request[DeleteConfigurationSetResponse] = js.native
    def deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest): Request[DeleteConfigurationSetEventDestinationResponse] = js.native
    def deleteDedicatedIpPool(params: DeleteDedicatedIpPoolRequest): Request[DeleteDedicatedIpPoolResponse] = js.native
    def deleteEmailIdentity(params: DeleteEmailIdentityRequest): Request[DeleteEmailIdentityResponse] = js.native
    def getAccount(params: GetAccountRequest): Request[GetAccountResponse] = js.native
    def getConfigurationSet(params: GetConfigurationSetRequest): Request[GetConfigurationSetResponse] = js.native
    def getConfigurationSetEventDestinations(params: GetConfigurationSetEventDestinationsRequest): Request[GetConfigurationSetEventDestinationsResponse] = js.native
    def getDedicatedIp(params: GetDedicatedIpRequest): Request[GetDedicatedIpResponse] = js.native
    def getDedicatedIps(params: GetDedicatedIpsRequest): Request[GetDedicatedIpsResponse] = js.native
    def getEmailIdentity(params: GetEmailIdentityRequest): Request[GetEmailIdentityResponse] = js.native
    def listConfigurationSets(params: ListConfigurationSetsRequest): Request[ListConfigurationSetsResponse] = js.native
    def listDedicatedIpPools(params: ListDedicatedIpPoolsRequest): Request[ListDedicatedIpPoolsResponse] = js.native
    def listEmailIdentities(params: ListEmailIdentitiesRequest): Request[ListEmailIdentitiesResponse] = js.native
    def putAccountDedicatedIpWarmupAttributes(params: PutAccountDedicatedIpWarmupAttributesRequest): Request[PutAccountDedicatedIpWarmupAttributesResponse] = js.native
    def putAccountSendingAttributes(params: PutAccountSendingAttributesRequest): Request[PutAccountSendingAttributesResponse] = js.native
    def putConfigurationSetDeliveryOptions(params: PutConfigurationSetDeliveryOptionsRequest): Request[PutConfigurationSetDeliveryOptionsResponse] = js.native
    def putConfigurationSetReputationOptions(params: PutConfigurationSetReputationOptionsRequest): Request[PutConfigurationSetReputationOptionsResponse] = js.native
    def putConfigurationSetSendingOptions(params: PutConfigurationSetSendingOptionsRequest): Request[PutConfigurationSetSendingOptionsResponse] = js.native
    def putConfigurationSetTrackingOptions(params: PutConfigurationSetTrackingOptionsRequest): Request[PutConfigurationSetTrackingOptionsResponse] = js.native
    def putDedicatedIpInPool(params: PutDedicatedIpInPoolRequest): Request[PutDedicatedIpInPoolResponse] = js.native
    def putDedicatedIpWarmupAttributes(params: PutDedicatedIpWarmupAttributesRequest): Request[PutDedicatedIpWarmupAttributesResponse] = js.native
    def putEmailIdentityDkimAttributes(params: PutEmailIdentityDkimAttributesRequest): Request[PutEmailIdentityDkimAttributesResponse] = js.native
    def putEmailIdentityFeedbackAttributes(params: PutEmailIdentityFeedbackAttributesRequest): Request[PutEmailIdentityFeedbackAttributesResponse] = js.native
    def putEmailIdentityMailFromAttributes(params: PutEmailIdentityMailFromAttributesRequest): Request[PutEmailIdentityMailFromAttributesResponse] = js.native
    def sendEmail(params: SendEmailRequest): Request[SendEmailResponse] = js.native
    def updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest): Request[UpdateConfigurationSetEventDestinationResponse] = js.native
  }

  /**
   * <p>The action that you want Amazon Pinpoint to take if it can't read the required MX record for a custom MAIL FROM domain. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i> as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.</p> <p>These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.</p>
   */
  object BehaviorOnMxFailureEnum {
    val USE_DEFAULT_VALUE = "USE_DEFAULT_VALUE"
    val REJECT_MESSAGE = "REJECT_MESSAGE"

    val values = IndexedSeq(USE_DEFAULT_VALUE, REJECT_MESSAGE)
  }

  /**
   * <p>Represents the body of the email message.</p>
   */
  @js.native
  trait Body extends js.Object {
    var Html: js.UndefOr[Content]
    var Text: js.UndefOr[Content]
  }

  object Body {
    def apply(
      Html: js.UndefOr[Content] = js.undefined,
      Text: js.UndefOr[Content] = js.undefined): Body = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Html" -> Html.map { x => x.asInstanceOf[js.Any] },
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Body]
    }
  }

  /**
   * <p>An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.</p>
   */
  @js.native
  trait CloudWatchDestination extends js.Object {
    var DimensionConfigurations: CloudWatchDimensionConfigurations
  }

  object CloudWatchDestination {
    def apply(
      DimensionConfigurations: CloudWatchDimensionConfigurations): CloudWatchDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DimensionConfigurations" -> DimensionConfigurations.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchDestination]
    }
  }

  /**
   * <p>An object that defines the dimension configuration to use when you send Amazon Pinpoint email events to Amazon CloudWatch.</p>
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
      DimensionValueSource: DimensionValueSource): CloudWatchDimensionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultDimensionValue" -> DefaultDimensionValue.asInstanceOf[js.Any],
        "DimensionName" -> DimensionName.asInstanceOf[js.Any],
        "DimensionValueSource" -> DimensionValueSource.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchDimensionConfiguration]
    }
  }

  /**
   * <p>An object that represents the content of the email, and optionally a character set specification.</p>
   */
  @js.native
  trait Content extends js.Object {
    var Data: MessageData
    var Charset: js.UndefOr[Charset]
  }

  object Content {
    def apply(
      Data: MessageData,
      Charset: js.UndefOr[Charset] = js.undefined): Content = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.asInstanceOf[js.Any],
        "Charset" -> Charset.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Content]
    }
  }

  /**
   * <p>A request to add an event destination to a configuration set.</p>
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
      EventDestinationName: EventDestinationName): CreateConfigurationSetEventDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestination" -> EventDestination.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetEventDestinationRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
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
   * <p>A request to create a configuration set.</p>
   */
  @js.native
  trait CreateConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var DeliveryOptions: js.UndefOr[DeliveryOptions]
    var ReputationOptions: js.UndefOr[ReputationOptions]
    var SendingOptions: js.UndefOr[SendingOptions]
    var TrackingOptions: js.UndefOr[TrackingOptions]
  }

  object CreateConfigurationSetRequest {
    def apply(
      ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
      DeliveryOptions: js.UndefOr[DeliveryOptions] = js.undefined,
      ReputationOptions: js.UndefOr[ReputationOptions] = js.undefined,
      SendingOptions: js.UndefOr[SendingOptions] = js.undefined,
      TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined): CreateConfigurationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "DeliveryOptions" -> DeliveryOptions.map { x => x.asInstanceOf[js.Any] },
        "ReputationOptions" -> ReputationOptions.map { x => x.asInstanceOf[js.Any] },
        "SendingOptions" -> SendingOptions.map { x => x.asInstanceOf[js.Any] },
        "TrackingOptions" -> TrackingOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
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
   * <p>A request to create a new dedicated IP pool.</p>
   */
  @js.native
  trait CreateDedicatedIpPoolRequest extends js.Object {
    var PoolName: PoolName
  }

  object CreateDedicatedIpPoolRequest {
    def apply(
      PoolName: PoolName): CreateDedicatedIpPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PoolName" -> PoolName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDedicatedIpPoolRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait CreateDedicatedIpPoolResponse extends js.Object {

  }

  object CreateDedicatedIpPoolResponse {
    def apply(): CreateDedicatedIpPoolResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDedicatedIpPoolResponse]
    }
  }

  /**
   * <p>A request to begin the verification process for an email identity (an email address or domain).</p>
   */
  @js.native
  trait CreateEmailIdentityRequest extends js.Object {
    var EmailIdentity: Identity
  }

  object CreateEmailIdentityRequest {
    def apply(
      EmailIdentity: Identity): CreateEmailIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEmailIdentityRequest]
    }
  }

  /**
   * <p>If the email identity is a domain, this object contains tokens that you can use to create a set of CNAME records. To sucessfully verify your domain, you have to add these records to the DNS configuration for your domain.</p> <p>If the email identity is an email address, this object is empty. </p>
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
      VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined): CreateEmailIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DkimAttributes" -> DkimAttributes.map { x => x.asInstanceOf[js.Any] },
        "IdentityType" -> IdentityType.map { x => x.asInstanceOf[js.Any] },
        "VerifiedForSendingStatus" -> VerifiedForSendingStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEmailIdentityResponse]
    }
  }

  /**
   * <p>Contains information about a dedicated IP address that is associated with your Amazon Pinpoint account.</p> <p/>
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
      PoolName: js.UndefOr[PoolName] = js.undefined): DedicatedIp = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ip" -> Ip.asInstanceOf[js.Any],
        "WarmupPercentage" -> WarmupPercentage.asInstanceOf[js.Any],
        "WarmupStatus" -> WarmupStatus.asInstanceOf[js.Any],
        "PoolName" -> PoolName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DedicatedIp]
    }
  }

  /**
   * <p>A request to delete an event destination from a configuration set.</p>
   */
  @js.native
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var EventDestinationName: EventDestinationName
  }

  object DeleteConfigurationSetEventDestinationRequest {
    def apply(
      ConfigurationSetName: ConfigurationSetName,
      EventDestinationName: EventDestinationName): DeleteConfigurationSetEventDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
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
   * <p>A request to delete a configuration set.</p>
   */
  @js.native
  trait DeleteConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  object DeleteConfigurationSetRequest {
    def apply(
      ConfigurationSetName: ConfigurationSetName): DeleteConfigurationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
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
   * <p>A request to delete a dedicated IP pool.</p>
   */
  @js.native
  trait DeleteDedicatedIpPoolRequest extends js.Object {
    var PoolName: PoolName
  }

  object DeleteDedicatedIpPoolRequest {
    def apply(
      PoolName: PoolName): DeleteDedicatedIpPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PoolName" -> PoolName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDedicatedIpPoolRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait DeleteDedicatedIpPoolResponse extends js.Object {

  }

  object DeleteDedicatedIpPoolResponse {
    def apply(): DeleteDedicatedIpPoolResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDedicatedIpPoolResponse]
    }
  }

  /**
   * <p>A request to delete an existing email identity. When you delete an identity, you lose the ability to use Amazon Pinpoint to send email from that identity. You can restore your ability to send email by completing the verification process for the identity again.</p>
   */
  @js.native
  trait DeleteEmailIdentityRequest extends js.Object {
    var EmailIdentity: Identity
  }

  object DeleteEmailIdentityRequest {
    def apply(
      EmailIdentity: Identity): DeleteEmailIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEmailIdentityRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait DeleteEmailIdentityResponse extends js.Object {

  }

  object DeleteEmailIdentityResponse {
    def apply(): DeleteEmailIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEmailIdentityResponse]
    }
  }

  /**
   * <p>Used to associate a configuration set with a dedicated IP pool.</p>
   */
  @js.native
  trait DeliveryOptions extends js.Object {
    var SendingPoolName: js.UndefOr[PoolName]
  }

  object DeliveryOptions {
    def apply(
      SendingPoolName: js.UndefOr[PoolName] = js.undefined): DeliveryOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SendingPoolName" -> SendingPoolName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliveryOptions]
    }
  }

  /**
   * <p>An object that describes the recipients for an email.</p>
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
      ToAddresses: js.UndefOr[EmailAddressList] = js.undefined): Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BccAddresses" -> BccAddresses.map { x => x.asInstanceOf[js.Any] },
        "CcAddresses" -> CcAddresses.map { x => x.asInstanceOf[js.Any] },
        "ToAddresses" -> ToAddresses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }

  /**
   * <p>The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you want Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint to use your own email headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link tags, choose <code>linkTags</code>.</p>
   */
  object DimensionValueSourceEnum {
    val MESSAGE_TAG = "MESSAGE_TAG"
    val EMAIL_HEADER = "EMAIL_HEADER"
    val LINK_TAG = "LINK_TAG"

    val values = IndexedSeq(MESSAGE_TAG, EMAIL_HEADER, LINK_TAG)
  }

  /**
   * <p>An object that contains information about the DKIM configuration for an email identity.</p>
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
      Tokens: js.UndefOr[DnsTokenList] = js.undefined): DkimAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SigningEnabled" -> SigningEnabled.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Tokens" -> Tokens.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DkimAttributes]
    }
  }

  /**
   * <p>The DKIM authentication status of the identity. The status can be one of the following:</p> <ul> <li> <p> <code>PENDING</code> ? The DKIM verification process was initiated, and Amazon Pinpoint is still waiting for the required CNAME records to appear in the DNS configuration for the domain.</p> </li> <li> <p> <code>SUCCESS</code> ? The DKIM authentication process completed successfully.</p> </li> <li> <p> <code>FAILED</code> ? The DKIM authentication process failed. This can happen when Amazon Pinpoint fails to find the required CNAME records in the DNS configuration of the domain.</p> </li> <li> <p> <code>TEMPORARY_FAILURE</code> ? A temporary issue is preventing Amazon Pinpoint from determining the DKIM authentication status of the domain.</p> </li> <li> <p> <code>NOT_STARTED</code> ? The DKIM verification process hasn't been initiated for the domain.</p> </li> </ul>
   */
  object DkimStatusEnum {
    val PENDING = "PENDING"
    val SUCCESS = "SUCCESS"
    val FAILED = "FAILED"
    val TEMPORARY_FAILURE = "TEMPORARY_FAILURE"
    val NOT_STARTED = "NOT_STARTED"

    val values = IndexedSeq(PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE, NOT_STARTED)
  }

  /**
   * <p>An object that defines the entire content of the email, including the message headers and the body content. You can create a simple email message, in which you specify the subject and the text and HTML versions of the message body. You can also create raw messages, in which you specify a complete MIME-formatted message. Raw messages can include attachments and custom headers.</p>
   */
  @js.native
  trait EmailContent extends js.Object {
    var Raw: js.UndefOr[RawMessage]
    var Simple: js.UndefOr[Message]
  }

  object EmailContent {
    def apply(
      Raw: js.UndefOr[RawMessage] = js.undefined,
      Simple: js.UndefOr[Message] = js.undefined): EmailContent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Raw" -> Raw.map { x => x.asInstanceOf[js.Any] },
        "Simple" -> Simple.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmailContent]
    }
  }

  /**
   * <p>In Amazon Pinpoint, <i>events</i> include message sends, deliveries, opens, clicks, bounces, and complaints. <i>Event destinations</i> are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.</p>
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
      SnsDestination: js.UndefOr[SnsDestination] = js.undefined): EventDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MatchingEventTypes" -> MatchingEventTypes.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "CloudWatchDestination" -> CloudWatchDestination.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseDestination" -> KinesisFirehoseDestination.map { x => x.asInstanceOf[js.Any] },
        "PinpointDestination" -> PinpointDestination.map { x => x.asInstanceOf[js.Any] },
        "SnsDestination" -> SnsDestination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDestination]
    }
  }

  /**
   * <p>An object that defines the event destination. Specifically, it defines which services receive events from emails sent using the configuration set that the event destination is associated with. Also defines the types of events that are sent to the event destination.</p>
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
      SnsDestination: js.UndefOr[SnsDestination] = js.undefined): EventDestinationDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchDestination" -> CloudWatchDestination.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "KinesisFirehoseDestination" -> KinesisFirehoseDestination.map { x => x.asInstanceOf[js.Any] },
        "MatchingEventTypes" -> MatchingEventTypes.map { x => x.asInstanceOf[js.Any] },
        "PinpointDestination" -> PinpointDestination.map { x => x.asInstanceOf[js.Any] },
        "SnsDestination" -> SnsDestination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDestinationDefinition]
    }
  }

  /**
   * <p>An email sending event type. For example, email sends, opens, and bounces are all email events.</p>
   */
  object EventTypeEnum {
    val SEND = "SEND"
    val REJECT = "REJECT"
    val BOUNCE = "BOUNCE"
    val COMPLAINT = "COMPLAINT"
    val DELIVERY = "DELIVERY"
    val OPEN = "OPEN"
    val CLICK = "CLICK"
    val RENDERING_FAILURE = "RENDERING_FAILURE"

    val values = IndexedSeq(SEND, REJECT, BOUNCE, COMPLAINT, DELIVERY, OPEN, CLICK, RENDERING_FAILURE)
  }

  /**
   * <p>A request to obtain information about the email-sending capabilities of your Amazon Pinpoint account.</p>
   */
  @js.native
  trait GetAccountRequest extends js.Object {

  }

  object GetAccountRequest {
    def apply(): GetAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountRequest]
    }
  }

  /**
   * <p>A list of details about the email-sending capabilities of your Amazon Pinpoint account in the current AWS Region.</p>
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
      SendingEnabled: js.UndefOr[Enabled] = js.undefined): GetAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedIpAutoWarmupEnabled" -> DedicatedIpAutoWarmupEnabled.map { x => x.asInstanceOf[js.Any] },
        "EnforcementStatus" -> EnforcementStatus.map { x => x.asInstanceOf[js.Any] },
        "ProductionAccessEnabled" -> ProductionAccessEnabled.map { x => x.asInstanceOf[js.Any] },
        "SendQuota" -> SendQuota.map { x => x.asInstanceOf[js.Any] },
        "SendingEnabled" -> SendingEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountResponse]
    }
  }

  /**
   * <p>A request to obtain information about the event destinations for a configuration set.</p>
   */
  @js.native
  trait GetConfigurationSetEventDestinationsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  object GetConfigurationSetEventDestinationsRequest {
    def apply(
      ConfigurationSetName: ConfigurationSetName): GetConfigurationSetEventDestinationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConfigurationSetEventDestinationsRequest]
    }
  }

  /**
   * <p>Information about an event destination for a configuration set.</p>
   */
  @js.native
  trait GetConfigurationSetEventDestinationsResponse extends js.Object {
    var EventDestinations: js.UndefOr[EventDestinations]
  }

  object GetConfigurationSetEventDestinationsResponse {
    def apply(
      EventDestinations: js.UndefOr[EventDestinations] = js.undefined): GetConfigurationSetEventDestinationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventDestinations" -> EventDestinations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConfigurationSetEventDestinationsResponse]
    }
  }

  /**
   * <p>A request to obtain information about a configuration set.</p>
   */
  @js.native
  trait GetConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
  }

  object GetConfigurationSetRequest {
    def apply(
      ConfigurationSetName: ConfigurationSetName): GetConfigurationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConfigurationSetRequest]
    }
  }

  /**
   * <p>Information about a configuration set.</p>
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
      TrackingOptions: js.UndefOr[TrackingOptions] = js.undefined): GetConfigurationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "DeliveryOptions" -> DeliveryOptions.map { x => x.asInstanceOf[js.Any] },
        "ReputationOptions" -> ReputationOptions.map { x => x.asInstanceOf[js.Any] },
        "SendingOptions" -> SendingOptions.map { x => x.asInstanceOf[js.Any] },
        "TrackingOptions" -> TrackingOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConfigurationSetResponse]
    }
  }

  /**
   * <p>A request to obtain more information about a dedicated IP address.</p>
   */
  @js.native
  trait GetDedicatedIpRequest extends js.Object {
    var Ip: Ip
  }

  object GetDedicatedIpRequest {
    def apply(
      Ip: Ip): GetDedicatedIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ip" -> Ip.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDedicatedIpRequest]
    }
  }

  /**
   * <p>Information about a dedicated IP address.</p>
   */
  @js.native
  trait GetDedicatedIpResponse extends js.Object {
    var DedicatedIp: js.UndefOr[DedicatedIp]
  }

  object GetDedicatedIpResponse {
    def apply(
      DedicatedIp: js.UndefOr[DedicatedIp] = js.undefined): GetDedicatedIpResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedIp" -> DedicatedIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDedicatedIpResponse]
    }
  }

  /**
   * <p>A request to obtain more information about dedicated IP pools.</p>
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
      PoolName: js.UndefOr[PoolName] = js.undefined): GetDedicatedIpsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PoolName" -> PoolName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDedicatedIpsRequest]
    }
  }

  /**
   * <p>Information about the dedicated IP addresses that are associated with your Amazon Pinpoint account.</p>
   */
  @js.native
  trait GetDedicatedIpsResponse extends js.Object {
    var DedicatedIps: js.UndefOr[DedicatedIpList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetDedicatedIpsResponse {
    def apply(
      DedicatedIps: js.UndefOr[DedicatedIpList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetDedicatedIpsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedIps" -> DedicatedIps.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDedicatedIpsResponse]
    }
  }

  /**
   * <p>A request to return details about an email identity.</p>
   */
  @js.native
  trait GetEmailIdentityRequest extends js.Object {
    var EmailIdentity: Identity
  }

  object GetEmailIdentityRequest {
    def apply(
      EmailIdentity: Identity): GetEmailIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEmailIdentityRequest]
    }
  }

  /**
   * <p>Details about an email identity.</p>
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
      VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined): GetEmailIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DkimAttributes" -> DkimAttributes.map { x => x.asInstanceOf[js.Any] },
        "FeedbackForwardingStatus" -> FeedbackForwardingStatus.map { x => x.asInstanceOf[js.Any] },
        "IdentityType" -> IdentityType.map { x => x.asInstanceOf[js.Any] },
        "MailFromAttributes" -> MailFromAttributes.map { x => x.asInstanceOf[js.Any] },
        "VerifiedForSendingStatus" -> VerifiedForSendingStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEmailIdentityResponse]
    }
  }

  /**
   * <p>Information about an email identity.</p>
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
      SendingEnabled: js.UndefOr[Enabled] = js.undefined): IdentityInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityName" -> IdentityName.map { x => x.asInstanceOf[js.Any] },
        "IdentityType" -> IdentityType.map { x => x.asInstanceOf[js.Any] },
        "SendingEnabled" -> SendingEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityInfo]
    }
  }

  /**
   * <p>The email identity type. The identity type can be one of the following:</p> <ul> <li> <p> <code>EMAIL_ADDRESS</code> ? The identity is an email address.</p> </li> <li> <p> <code>DOMAIN</code> ? The identity is a domain.</p> </li> </ul>
   */
  object IdentityTypeEnum {
    val EMAIL_ADDRESS = "EMAIL_ADDRESS"
    val DOMAIN = "DOMAIN"
    val MANAGED_DOMAIN = "MANAGED_DOMAIN"

    val values = IndexedSeq(EMAIL_ADDRESS, DOMAIN, MANAGED_DOMAIN)
  }

  /**
   * <p>An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.</p>
   */
  @js.native
  trait KinesisFirehoseDestination extends js.Object {
    var DeliveryStreamArn: AmazonResourceName
    var IamRoleArn: AmazonResourceName
  }

  object KinesisFirehoseDestination {
    def apply(
      DeliveryStreamArn: AmazonResourceName,
      IamRoleArn: AmazonResourceName): KinesisFirehoseDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamArn" -> DeliveryStreamArn.asInstanceOf[js.Any],
        "IamRoleArn" -> IamRoleArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseDestination]
    }
  }

  /**
   * <p>A request to obtain a list of configuration sets for your Amazon Pinpoint account in the current AWS Region.</p>
   */
  @js.native
  trait ListConfigurationSetsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListConfigurationSetsRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      PageSize: js.UndefOr[MaxItems] = js.undefined): ListConfigurationSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationSetsRequest]
    }
  }

  /**
   * <p>A list of configuration sets in your Amazon Pinpoint account in the current AWS Region.</p>
   */
  @js.native
  trait ListConfigurationSetsResponse extends js.Object {
    var ConfigurationSets: js.UndefOr[ConfigurationSetNameList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConfigurationSetsResponse {
    def apply(
      ConfigurationSets: js.UndefOr[ConfigurationSetNameList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListConfigurationSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSets" -> ConfigurationSets.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationSetsResponse]
    }
  }

  /**
   * <p>A request to obtain a list of dedicated IP pools.</p>
   */
  @js.native
  trait ListDedicatedIpPoolsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListDedicatedIpPoolsRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      PageSize: js.UndefOr[MaxItems] = js.undefined): ListDedicatedIpPoolsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDedicatedIpPoolsRequest]
    }
  }

  /**
   * <p>A list of dedicated IP pools.</p>
   */
  @js.native
  trait ListDedicatedIpPoolsResponse extends js.Object {
    var DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDedicatedIpPoolsResponse {
    def apply(
      DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListDedicatedIpPoolsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedIpPools" -> DedicatedIpPools.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDedicatedIpPoolsResponse]
    }
  }

  /**
   * <p>A request to list all of the email identities associated with your Amazon Pinpoint account. This list includes identities that you've already verified, identities that are unverified, and identities that were verified in the past, but are no longer verified.</p>
   */
  @js.native
  trait ListEmailIdentitiesRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PageSize: js.UndefOr[MaxItems]
  }

  object ListEmailIdentitiesRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      PageSize: js.UndefOr[MaxItems] = js.undefined): ListEmailIdentitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEmailIdentitiesRequest]
    }
  }

  /**
   * <p>A list of all of the identities that you've attempted to verify for use with Amazon Pinpoint, regardless of whether or not those identities were successfully verified.</p>
   */
  @js.native
  trait ListEmailIdentitiesResponse extends js.Object {
    var EmailIdentities: js.UndefOr[IdentityInfoList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEmailIdentitiesResponse {
    def apply(
      EmailIdentities: js.UndefOr[IdentityInfoList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListEmailIdentitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentities" -> EmailIdentities.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEmailIdentitiesResponse]
    }
  }

  /**
   * <p>A list of attributes that are associated with a MAIL FROM domain.</p>
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
      MailFromDomainStatus: MailFromDomainStatus): MailFromAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BehaviorOnMxFailure" -> BehaviorOnMxFailure.asInstanceOf[js.Any],
        "MailFromDomain" -> MailFromDomain.asInstanceOf[js.Any],
        "MailFromDomainStatus" -> MailFromDomainStatus.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MailFromAttributes]
    }
  }

  /**
   * <p>The status of the MAIL FROM domain. This status can have the following values:</p> <ul> <li> <p> <code>PENDING</code> ? Amazon Pinpoint hasn't started searching for the MX record yet.</p> </li> <li> <p> <code>SUCCESS</code> ? Amazon Pinpoint detected the required MX record for the MAIL FROM domain.</p> </li> <li> <p> <code>FAILED</code> ? Amazon Pinpoint can't find the required MX record, or the record no longer exists.</p> </li> <li> <p> <code>TEMPORARY_FAILURE</code> ? A temporary issue occurred, which prevented Amazon Pinpoint from determining the status of the MAIL FROM domain.</p> </li> </ul>
   */
  object MailFromDomainStatusEnum {
    val PENDING = "PENDING"
    val SUCCESS = "SUCCESS"
    val FAILED = "FAILED"
    val TEMPORARY_FAILURE = "TEMPORARY_FAILURE"

    val values = IndexedSeq(PENDING, SUCCESS, FAILED, TEMPORARY_FAILURE)
  }

  /**
   * <p>Represents the email message that you're sending. The <code>Message</code> object consists of a subject line and a message body.</p>
   */
  @js.native
  trait Message extends js.Object {
    var Body: Body
    var Subject: Content
  }

  object Message {
    def apply(
      Body: Body,
      Subject: Content): Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Body" -> Body.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Message]
    }
  }

  /**
   * <p>Contains the name and value of a tag that you apply to an email. You can use message tags when you publish email sending events. </p>
   */
  @js.native
  trait MessageTag extends js.Object {
    var Name: MessageTagName
    var Value: MessageTagValue
  }

  object MessageTag {
    def apply(
      Name: MessageTagName,
      Value: MessageTagValue): MessageTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageTag]
    }
  }

  /**
   * <p>An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your campaigns.</p>
   */
  @js.native
  trait PinpointDestination extends js.Object {
    var ApplicationArn: js.UndefOr[AmazonResourceName]
  }

  object PinpointDestination {
    def apply(
      ApplicationArn: js.UndefOr[AmazonResourceName] = js.undefined): PinpointDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationArn" -> ApplicationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PinpointDestination]
    }
  }

  /**
   * <p>A request to enable or disable the automatic IP address warm-up feature.</p>
   */
  @js.native
  trait PutAccountDedicatedIpWarmupAttributesRequest extends js.Object {
    var AutoWarmupEnabled: js.UndefOr[Enabled]
  }

  object PutAccountDedicatedIpWarmupAttributesRequest {
    def apply(
      AutoWarmupEnabled: js.UndefOr[Enabled] = js.undefined): PutAccountDedicatedIpWarmupAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoWarmupEnabled" -> AutoWarmupEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAccountDedicatedIpWarmupAttributesRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait PutAccountDedicatedIpWarmupAttributesResponse extends js.Object {

  }

  object PutAccountDedicatedIpWarmupAttributesResponse {
    def apply(): PutAccountDedicatedIpWarmupAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAccountDedicatedIpWarmupAttributesResponse]
    }
  }

  /**
   * <p>A request to change the ability of your account to send email.</p>
   */
  @js.native
  trait PutAccountSendingAttributesRequest extends js.Object {
    var SendingEnabled: js.UndefOr[Enabled]
  }

  object PutAccountSendingAttributesRequest {
    def apply(
      SendingEnabled: js.UndefOr[Enabled] = js.undefined): PutAccountSendingAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SendingEnabled" -> SendingEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAccountSendingAttributesRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait PutAccountSendingAttributesResponse extends js.Object {

  }

  object PutAccountSendingAttributesResponse {
    def apply(): PutAccountSendingAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAccountSendingAttributesResponse]
    }
  }

  /**
   * <p>A request to associate a configuration set with a dedicated IP pool.</p>
   */
  @js.native
  trait PutConfigurationSetDeliveryOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var SendingPoolName: js.UndefOr[SendingPoolName]
  }

  object PutConfigurationSetDeliveryOptionsRequest {
    def apply(
      ConfigurationSetName: ConfigurationSetName,
      SendingPoolName: js.UndefOr[SendingPoolName] = js.undefined): PutConfigurationSetDeliveryOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "SendingPoolName" -> SendingPoolName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationSetDeliveryOptionsRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait PutConfigurationSetDeliveryOptionsResponse extends js.Object {

  }

  object PutConfigurationSetDeliveryOptionsResponse {
    def apply(): PutConfigurationSetDeliveryOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationSetDeliveryOptionsResponse]
    }
  }

  /**
   * <p>A request to enable or disable tracking of reputation metrics for a configuration set.</p>
   */
  @js.native
  trait PutConfigurationSetReputationOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var ReputationMetricsEnabled: js.UndefOr[Enabled]
  }

  object PutConfigurationSetReputationOptionsRequest {
    def apply(
      ConfigurationSetName: ConfigurationSetName,
      ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined): PutConfigurationSetReputationOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "ReputationMetricsEnabled" -> ReputationMetricsEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationSetReputationOptionsRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait PutConfigurationSetReputationOptionsResponse extends js.Object {

  }

  object PutConfigurationSetReputationOptionsResponse {
    def apply(): PutConfigurationSetReputationOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationSetReputationOptionsResponse]
    }
  }

  /**
   * <p>A request to enable or disable the ability of Amazon Pinpoint to send emails that use a specific configuration set.</p>
   */
  @js.native
  trait PutConfigurationSetSendingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var SendingEnabled: js.UndefOr[Enabled]
  }

  object PutConfigurationSetSendingOptionsRequest {
    def apply(
      ConfigurationSetName: ConfigurationSetName,
      SendingEnabled: js.UndefOr[Enabled] = js.undefined): PutConfigurationSetSendingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "SendingEnabled" -> SendingEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationSetSendingOptionsRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait PutConfigurationSetSendingOptionsResponse extends js.Object {

  }

  object PutConfigurationSetSendingOptionsResponse {
    def apply(): PutConfigurationSetSendingOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationSetSendingOptionsResponse]
    }
  }

  /**
   * <p>A request to add a custom domain for tracking open and click events to a configuration set.</p>
   */
  @js.native
  trait PutConfigurationSetTrackingOptionsRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var CustomRedirectDomain: js.UndefOr[CustomRedirectDomain]
  }

  object PutConfigurationSetTrackingOptionsRequest {
    def apply(
      ConfigurationSetName: ConfigurationSetName,
      CustomRedirectDomain: js.UndefOr[CustomRedirectDomain] = js.undefined): PutConfigurationSetTrackingOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "CustomRedirectDomain" -> CustomRedirectDomain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationSetTrackingOptionsRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait PutConfigurationSetTrackingOptionsResponse extends js.Object {

  }

  object PutConfigurationSetTrackingOptionsResponse {
    def apply(): PutConfigurationSetTrackingOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationSetTrackingOptionsResponse]
    }
  }

  /**
   * <p>A request to move a dedicated IP address to a dedicated IP pool.</p>
   */
  @js.native
  trait PutDedicatedIpInPoolRequest extends js.Object {
    var DestinationPoolName: PoolName
    var Ip: Ip
  }

  object PutDedicatedIpInPoolRequest {
    def apply(
      DestinationPoolName: PoolName,
      Ip: Ip): PutDedicatedIpInPoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationPoolName" -> DestinationPoolName.asInstanceOf[js.Any],
        "Ip" -> Ip.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDedicatedIpInPoolRequest]
    }
  }

  @js.native
  trait PutDedicatedIpInPoolResponse extends js.Object {

  }

  object PutDedicatedIpInPoolResponse {
    def apply(): PutDedicatedIpInPoolResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDedicatedIpInPoolResponse]
    }
  }

  /**
   * <p>A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you want to resume the warm-up process for an existing IP address.</p>
   */
  @js.native
  trait PutDedicatedIpWarmupAttributesRequest extends js.Object {
    var Ip: Ip
    var WarmupPercentage: Percentage100Wrapper
  }

  object PutDedicatedIpWarmupAttributesRequest {
    def apply(
      Ip: Ip,
      WarmupPercentage: Percentage100Wrapper): PutDedicatedIpWarmupAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ip" -> Ip.asInstanceOf[js.Any],
        "WarmupPercentage" -> WarmupPercentage.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDedicatedIpWarmupAttributesRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait PutDedicatedIpWarmupAttributesResponse extends js.Object {

  }

  object PutDedicatedIpWarmupAttributesResponse {
    def apply(): PutDedicatedIpWarmupAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDedicatedIpWarmupAttributesResponse]
    }
  }

  /**
   * <p>A request to enable or disable DKIM signing of email that you send from an email identity.</p>
   */
  @js.native
  trait PutEmailIdentityDkimAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var SigningEnabled: js.UndefOr[Enabled]
  }

  object PutEmailIdentityDkimAttributesRequest {
    def apply(
      EmailIdentity: Identity,
      SigningEnabled: js.UndefOr[Enabled] = js.undefined): PutEmailIdentityDkimAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any],
        "SigningEnabled" -> SigningEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEmailIdentityDkimAttributesRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait PutEmailIdentityDkimAttributesResponse extends js.Object {

  }

  object PutEmailIdentityDkimAttributesResponse {
    def apply(): PutEmailIdentityDkimAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEmailIdentityDkimAttributesResponse]
    }
  }

  /**
   * <p>A request to set the attributes that control how bounce and complaint events are processed.</p>
   */
  @js.native
  trait PutEmailIdentityFeedbackAttributesRequest extends js.Object {
    var EmailIdentity: Identity
    var EmailForwardingEnabled: js.UndefOr[Enabled]
  }

  object PutEmailIdentityFeedbackAttributesRequest {
    def apply(
      EmailIdentity: Identity,
      EmailForwardingEnabled: js.UndefOr[Enabled] = js.undefined): PutEmailIdentityFeedbackAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any],
        "EmailForwardingEnabled" -> EmailForwardingEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEmailIdentityFeedbackAttributesRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait PutEmailIdentityFeedbackAttributesResponse extends js.Object {

  }

  object PutEmailIdentityFeedbackAttributesResponse {
    def apply(): PutEmailIdentityFeedbackAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEmailIdentityFeedbackAttributesResponse]
    }
  }

  /**
   * <p>A request to configure the custom MAIL FROM domain for a verified identity.</p>
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
      MailFromDomain: js.UndefOr[MailFromDomainName] = js.undefined): PutEmailIdentityMailFromAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailIdentity" -> EmailIdentity.asInstanceOf[js.Any],
        "BehaviorOnMxFailure" -> BehaviorOnMxFailure.map { x => x.asInstanceOf[js.Any] },
        "MailFromDomain" -> MailFromDomain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEmailIdentityMailFromAttributesRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
   */
  @js.native
  trait PutEmailIdentityMailFromAttributesResponse extends js.Object {

  }

  object PutEmailIdentityMailFromAttributesResponse {
    def apply(): PutEmailIdentityMailFromAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEmailIdentityMailFromAttributesResponse]
    }
  }

  /**
   * <p>The raw email message.</p>
   */
  @js.native
  trait RawMessage extends js.Object {
    var Data: RawMessageData
  }

  object RawMessage {
    def apply(
      Data: RawMessageData): RawMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RawMessage]
    }
  }

  /**
   * <p>Enable or disable collection of reputation metrics for emails that you send using this configuration set in the current AWS Region. </p>
   */
  @js.native
  trait ReputationOptions extends js.Object {
    var LastFreshStart: js.UndefOr[LastFreshStart]
    var ReputationMetricsEnabled: js.UndefOr[Enabled]
  }

  object ReputationOptions {
    def apply(
      LastFreshStart: js.UndefOr[LastFreshStart] = js.undefined,
      ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined): ReputationOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastFreshStart" -> LastFreshStart.map { x => x.asInstanceOf[js.Any] },
        "ReputationMetricsEnabled" -> ReputationMetricsEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReputationOptions]
    }
  }

  /**
   * <p>A request to send an email message.</p>
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
      ReplyToAddresses: js.UndefOr[EmailAddressList] = js.undefined): SendEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.asInstanceOf[js.Any],
        "Destination" -> Destination.asInstanceOf[js.Any],
        "ConfigurationSetName" -> ConfigurationSetName.map { x => x.asInstanceOf[js.Any] },
        "EmailTags" -> EmailTags.map { x => x.asInstanceOf[js.Any] },
        "FeedbackForwardingEmailAddress" -> FeedbackForwardingEmailAddress.map { x => x.asInstanceOf[js.Any] },
        "FromEmailAddress" -> FromEmailAddress.map { x => x.asInstanceOf[js.Any] },
        "ReplyToAddresses" -> ReplyToAddresses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendEmailRequest]
    }
  }

  /**
   * <p>A unique message ID that you receive when Amazon Pinpoint accepts an email for sending.</p>
   */
  @js.native
  trait SendEmailResponse extends js.Object {
    var MessageId: js.UndefOr[OutboundMessageId]
  }

  object SendEmailResponse {
    def apply(
      MessageId: js.UndefOr[OutboundMessageId] = js.undefined): SendEmailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageId" -> MessageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendEmailResponse]
    }
  }

  /**
   * <p>An object that contains information about the per-day and per-second sending limits for your Amazon Pinpoint account in the current AWS Region.</p>
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
      SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined): SendQuota = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Max24HourSend" -> Max24HourSend.map { x => x.asInstanceOf[js.Any] },
        "MaxSendRate" -> MaxSendRate.map { x => x.asInstanceOf[js.Any] },
        "SentLast24Hours" -> SentLast24Hours.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendQuota]
    }
  }

  /**
   * <p>Used to enable or disable email sending for messages that use this configuration set in the current AWS Region.</p>
   */
  @js.native
  trait SendingOptions extends js.Object {
    var SendingEnabled: js.UndefOr[Enabled]
  }

  object SendingOptions {
    def apply(
      SendingEnabled: js.UndefOr[Enabled] = js.undefined): SendingOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SendingEnabled" -> SendingEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendingOptions]
    }
  }

  /**
   * <p>An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.</p>
   */
  @js.native
  trait SnsDestination extends js.Object {
    var TopicArn: AmazonResourceName
  }

  object SnsDestination {
    def apply(
      TopicArn: AmazonResourceName): SnsDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnsDestination]
    }
  }

  /**
   * <p>An object that defines the tracking options for a configuration set. When you use Amazon Pinpoint to send an email, it contains an invisible image that's used to track when recipients open your email. If your email contains links, those links are changed slightly in order to track when recipients click them.</p> <p>These images and links include references to a domain operated by AWS. You can optionally configure Amazon Pinpoint to use a domain that you operate for these images and links.</p>
   */
  @js.native
  trait TrackingOptions extends js.Object {
    var CustomRedirectDomain: CustomRedirectDomain
  }

  object TrackingOptions {
    def apply(
      CustomRedirectDomain: CustomRedirectDomain): TrackingOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomRedirectDomain" -> CustomRedirectDomain.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrackingOptions]
    }
  }

  /**
   * <p>A request to change the settings for an event destination for a configuration set.</p>
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
      EventDestinationName: EventDestinationName): UpdateConfigurationSetEventDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestination" -> EventDestination.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
    }
  }

  /**
   * <p>An HTTP 200 response if the request succeeds, or an error message if the request fails.</p>
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
   * <p>The warmup status of a dedicated IP.</p>
   */
  object WarmupStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val DONE = "DONE"

    val values = IndexedSeq(IN_PROGRESS, DONE)
  }
}
