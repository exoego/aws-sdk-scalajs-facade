package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object email {
  type Address = String
  type AddressList = js.Array[Address]
  type Charset = String
  type Counter = Long
  type DkimAttributes = js.Dictionary[IdentityDkimAttributes]
  type Domain = String
  type Enabled = Boolean
  type Identity = String
  type IdentityList = js.Array[Identity]
  type IdentityType = String
  type Max24HourSend = Double
  type MaxItems = Integer
  type MaxSendRate = Double
  type MessageData = String
  type MessageId = String
  type NextToken = String
  type NotificationAttributes = js.Dictionary[IdentityNotificationAttributes]
  type NotificationTopic = String
  type NotificationType = String
  type RawMessageData = js.Array[Byte]
  type SendDataPointList = js.Array[SendDataPoint]
  type SentLast24Hours = Double
  type Timestamp = js.Date
  type VerificationAttributes = js.Dictionary[IdentityVerificationAttributes]
  type VerificationStatus = String
  type VerificationToken = String
  type VerificationTokenList = js.Array[VerificationToken]
}

package email {
  @js.native
  trait Email extends js.Object {
    def deleteIdentity(params: DeleteIdentityRequest, callback: Callback[DeleteIdentityResponse]): Unit = js.native
    def deleteIdentity(params: DeleteIdentityRequest): Request[DeleteIdentityResponse] = js.native
    def deleteVerifiedEmailAddress(params: DeleteVerifiedEmailAddressRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteVerifiedEmailAddress(params: DeleteVerifiedEmailAddressRequest): Request[js.Object] = js.native
    def getIdentityDkimAttributes(params: GetIdentityDkimAttributesRequest, callback: Callback[GetIdentityDkimAttributesResponse]): Unit = js.native
    def getIdentityDkimAttributes(params: GetIdentityDkimAttributesRequest): Request[GetIdentityDkimAttributesResponse] = js.native
    def getIdentityNotificationAttributes(params: GetIdentityNotificationAttributesRequest, callback: Callback[GetIdentityNotificationAttributesResponse]): Unit = js.native
    def getIdentityNotificationAttributes(params: GetIdentityNotificationAttributesRequest): Request[GetIdentityNotificationAttributesResponse] = js.native
    def getIdentityVerificationAttributes(params: GetIdentityVerificationAttributesRequest, callback: Callback[GetIdentityVerificationAttributesResponse]): Unit = js.native
    def getIdentityVerificationAttributes(params: GetIdentityVerificationAttributesRequest): Request[GetIdentityVerificationAttributesResponse] = js.native
    def getSendQuota(callback: Callback[GetSendQuotaResponse]): Unit = js.native
    def getSendQuota(): Request[GetSendQuotaResponse] = js.native
    def getSendStatistics(callback: Callback[GetSendStatisticsResponse]): Unit = js.native
    def getSendStatistics(): Request[GetSendStatisticsResponse] = js.native
    def listIdentities(params: ListIdentitiesRequest, callback: Callback[ListIdentitiesResponse]): Unit = js.native
    def listIdentities(params: ListIdentitiesRequest): Request[ListIdentitiesResponse] = js.native
    def listVerifiedEmailAddresses(callback: Callback[ListVerifiedEmailAddressesResponse]): Unit = js.native
    def listVerifiedEmailAddresses(): Request[ListVerifiedEmailAddressesResponse] = js.native
    def sendEmail(params: SendEmailRequest, callback: Callback[SendEmailResponse]): Unit = js.native
    def sendEmail(params: SendEmailRequest): Request[SendEmailResponse] = js.native
    def sendRawEmail(params: SendRawEmailRequest, callback: Callback[SendRawEmailResponse]): Unit = js.native
    def sendRawEmail(params: SendRawEmailRequest): Request[SendRawEmailResponse] = js.native
    def setIdentityDkimEnabled(params: SetIdentityDkimEnabledRequest, callback: Callback[SetIdentityDkimEnabledResponse]): Unit = js.native
    def setIdentityDkimEnabled(params: SetIdentityDkimEnabledRequest): Request[SetIdentityDkimEnabledResponse] = js.native
    def setIdentityFeedbackForwardingEnabled(params: SetIdentityFeedbackForwardingEnabledRequest, callback: Callback[SetIdentityFeedbackForwardingEnabledResponse]): Unit = js.native
    def setIdentityFeedbackForwardingEnabled(params: SetIdentityFeedbackForwardingEnabledRequest): Request[SetIdentityFeedbackForwardingEnabledResponse] = js.native
    def setIdentityNotificationTopic(params: SetIdentityNotificationTopicRequest, callback: Callback[SetIdentityNotificationTopicResponse]): Unit = js.native
    def setIdentityNotificationTopic(params: SetIdentityNotificationTopicRequest): Request[SetIdentityNotificationTopicResponse] = js.native
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
   * <p>Represents the body of the message. You can specify text, HTML, or both. If you use both, then the message should display correctly in the widest variety of email clients. </p>
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
   * <p>Represents textual data, plus an optional character set specification.</p> <p>By default, the text must be 7-bit ASCII, due to the constraints of the SMTP protocol. If the text must contain any other characters, then you must also specify a character set. Examples include UTF-8, ISO-8859-1, and Shift_JIS. </p>
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
   * <p>Represents a request instructing the service to delete an identity from the list of identities for the AWS Account.</p>
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
   * <p>An empty element. Receiving this element indicates that the request completed successfully.</p>
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
   * <p>Represents a request instructing the service to delete an address from the list of verified email addresses.</p>
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

  /**
   * <p>Given a list of verified identities, describes their DKIM attributes. The DKIM attributes of an email address identity includes whether DKIM signing is individually enabled or disabled for that address. The DKIM attributes of a domain name identity includes whether DKIM signing is enabled, as well as the DNS records (tokens) that must remain published in the domain name's DNS.</p>
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
   * <p>Represents a list of all the DKIM attributes for the specified identity.</p>
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
   * <p>Describes whether an identity has Amazon Simple Notification Service (Amazon SNS) topics set for bounce, complaint, and/or delivery notifications, and specifies whether feedback forwarding is enabled for bounce and complaint notifications.</p>
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
   * <p>Represents a request instructing the service to provide the verification attributes for a list of identities.</p>
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
   * <p>Represents the verification attributes for a list of identities.</p>
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
   * <p>Represents the user's current activity limits returned from a successful <code>GetSendQuota</code> request. </p>
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
   * <p>Represents a list of <code>SendDataPoint</code> items returned from a successful <code>GetSendStatistics</code> request. This list contains aggregated data from the previous two weeks of sending activity. </p>
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
   * <p>Represents the notification attributes of an identity, including whether an identity has Amazon Simple Notification Service (Amazon SNS) topics set for bounce, complaint, and/or delivery notifications, and whether feedback forwarding is enabled for bounce and complaint notifications.</p>
   */
  @js.native
  trait IdentityNotificationAttributes extends js.Object {
    var BounceTopic: NotificationTopic
    var ComplaintTopic: NotificationTopic
    var DeliveryTopic: NotificationTopic
    var ForwardingEnabled: Enabled
  }

  object IdentityNotificationAttributes {
    def apply(
      BounceTopic: js.UndefOr[NotificationTopic] = js.undefined,
      ComplaintTopic: js.UndefOr[NotificationTopic] = js.undefined,
      DeliveryTopic: js.UndefOr[NotificationTopic] = js.undefined,
      ForwardingEnabled: js.UndefOr[Enabled] = js.undefined
    ): IdentityNotificationAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BounceTopic" -> BounceTopic.map { x => x: js.Any }),
        ("ComplaintTopic" -> ComplaintTopic.map { x => x: js.Any }),
        ("DeliveryTopic" -> DeliveryTopic.map { x => x: js.Any }),
        ("ForwardingEnabled" -> ForwardingEnabled.map { x => x: js.Any })
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
   * <p>Represents a request instructing the service to list all identities for the AWS Account.</p>
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
   * <p>Represents a list of all verified identities for the AWS Account.</p>
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
   * <p>Represents a list of all the email addresses verified for the current user.</p>
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
   * Indicates that the action failed, and the message could not be sent. Check the error stack for more information about what caused the error.
   */
  @js.native
  trait MessageRejectedException extends js.Object {

  }


  object NotificationTypeEnum {
    val Bounce = "Bounce"
    val Complaint = "Complaint"
    val Delivery = "Delivery"

    val values = IndexedSeq(Bounce, Complaint, Delivery)
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
   * <p>Represents a request instructing the service to send a single email message.</p> <p>This datatype can be used in application code to compose a message consisting of source, destination, message, reply-to, and return-path parts. This object can then be sent using the <code>SendEmail</code> action. </p>
   */
  @js.native
  trait SendEmailRequest extends js.Object {
    var ReplyToAddresses: AddressList
    var Source: Address
    var Message: Message
    var Destination: Destination
    var ReturnPath: Address
  }

  object SendEmailRequest {
    def apply(
      ReplyToAddresses: js.UndefOr[AddressList] = js.undefined,
      Source: js.UndefOr[Address] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      Destination: js.UndefOr[Destination] = js.undefined,
      ReturnPath: js.UndefOr[Address] = js.undefined
    ): SendEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReplyToAddresses" -> ReplyToAddresses.map { x => x: js.Any }),
        ("Source" -> Source.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("Destination" -> Destination.map { x => x: js.Any }),
        ("ReturnPath" -> ReturnPath.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendEmailRequest]
    }
  }

  /**
   * <p>Represents a unique message ID returned from a successful <code>SendEmail</code> request. </p>
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
   * <p>Represents a request instructing the service to send a raw email message.</p> <p>This datatype can be used in application code to compose a message consisting of source, destination, and raw message text. This object can then be sent using the <code>SendRawEmail</code> action. </p>
   */
  @js.native
  trait SendRawEmailRequest extends js.Object {
    var Source: Address
    var Destinations: AddressList
    var RawMessage: RawMessage
  }

  object SendRawEmailRequest {
    def apply(
      Source: js.UndefOr[Address] = js.undefined,
      Destinations: js.UndefOr[AddressList] = js.undefined,
      RawMessage: js.UndefOr[RawMessage] = js.undefined
    ): SendRawEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Source" -> Source.map { x => x: js.Any }),
        ("Destinations" -> Destinations.map { x => x: js.Any }),
        ("RawMessage" -> RawMessage.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendRawEmailRequest]
    }
  }

  /**
   * <p>Represents a unique message ID returned from a successful <code>SendRawEmail</code> request. </p>
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
   * <p>Represents a request instructing the service to enable or disable DKIM signing for an identity.</p>
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
   * <p>An empty element. Receiving this element indicates that the request completed successfully.</p>
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
   * <p>An empty element. Receiving this element indicates that the request completed successfully.</p>
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
   * <p>Represents a request to set or clear an identity's notification topic.</p>
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
   * <p>An empty element. Receiving this element indicates that the request completed successfully.</p>
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


  object VerificationStatusEnum {
    val Pending = "Pending"
    val Success = "Success"
    val Failed = "Failed"
    val TemporaryFailure = "TemporaryFailure"
    val NotStarted = "NotStarted"

    val values = IndexedSeq(Pending, Success, Failed, TemporaryFailure, NotStarted)
  }

  /**
   * <p>Represents a request instructing the service to begin DKIM verification for a domain.</p>
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
   * <p>Represents the DNS records that must be published in the domain name's DNS to complete DKIM setup.</p>
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
   * <p>Represents a request instructing the service to begin domain verification.</p>
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
   * <p>Represents a token used for domain ownership verification.</p>
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
   * <p>Represents a request instructing the service to begin email address verification.</p>
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
   * <p>Represents a request instructing the service to begin email address verification.</p>
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
   * <p>An empty element. Receiving this element indicates that the request completed successfully.</p>
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
}
