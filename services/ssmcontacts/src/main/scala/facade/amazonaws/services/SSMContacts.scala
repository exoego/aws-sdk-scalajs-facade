package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object ssmcontacts {
  type AcceptCode = String
  type ActivationCode = String
  type AmazonResourceName = String
  type ChannelName = String
  type ContactAlias = String
  type ContactChannelList = js.Array[ContactChannel]
  type ContactName = String
  type ContactsList = js.Array[Contact]
  type Content = String
  type DateTime = js.Date
  type DeferActivation = Boolean
  type EngagementsList = js.Array[Engagement]
  type IdempotencyToken = String
  type IncidentId = String
  type IsEssential = Boolean
  type MaxResults = Int
  type PagesList = js.Array[Page]
  type PaginationToken = String
  type Policy = String
  type PublicContent = String
  type PublicSubject = String
  type ReceiptInfo = String
  type ReceiptsList = js.Array[Receipt]
  type RetryIntervalInMinutes = Int
  type Sender = String
  type SimpleAddress = String
  type SsmContactsArn = String
  type StageDurationInMins = Int
  type StagesList = js.Array[Stage]
  type StopReason = String
  type Subject = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type TagsList = js.Array[Tag]
  type TargetsList = js.Array[Target]

  final class SSMContactsOps(private val service: SSMContacts) extends AnyVal {

    @inline def acceptPageFuture(params: AcceptPageRequest): Future[AcceptPageResult] = service.acceptPage(params).promise().toFuture
    @inline def activateContactChannelFuture(params: ActivateContactChannelRequest): Future[ActivateContactChannelResult] = service.activateContactChannel(params).promise().toFuture
    @inline def createContactChannelFuture(params: CreateContactChannelRequest): Future[CreateContactChannelResult] = service.createContactChannel(params).promise().toFuture
    @inline def createContactFuture(params: CreateContactRequest): Future[CreateContactResult] = service.createContact(params).promise().toFuture
    @inline def deactivateContactChannelFuture(params: DeactivateContactChannelRequest): Future[DeactivateContactChannelResult] = service.deactivateContactChannel(params).promise().toFuture
    @inline def deleteContactChannelFuture(params: DeleteContactChannelRequest): Future[DeleteContactChannelResult] = service.deleteContactChannel(params).promise().toFuture
    @inline def deleteContactFuture(params: DeleteContactRequest): Future[DeleteContactResult] = service.deleteContact(params).promise().toFuture
    @inline def describeEngagementFuture(params: DescribeEngagementRequest): Future[DescribeEngagementResult] = service.describeEngagement(params).promise().toFuture
    @inline def describePageFuture(params: DescribePageRequest): Future[DescribePageResult] = service.describePage(params).promise().toFuture
    @inline def getContactChannelFuture(params: GetContactChannelRequest): Future[GetContactChannelResult] = service.getContactChannel(params).promise().toFuture
    @inline def getContactFuture(params: GetContactRequest): Future[GetContactResult] = service.getContact(params).promise().toFuture
    @inline def getContactPolicyFuture(params: GetContactPolicyRequest): Future[GetContactPolicyResult] = service.getContactPolicy(params).promise().toFuture
    @inline def listContactChannelsFuture(params: ListContactChannelsRequest): Future[ListContactChannelsResult] = service.listContactChannels(params).promise().toFuture
    @inline def listContactsFuture(params: ListContactsRequest): Future[ListContactsResult] = service.listContacts(params).promise().toFuture
    @inline def listEngagementsFuture(params: ListEngagementsRequest): Future[ListEngagementsResult] = service.listEngagements(params).promise().toFuture
    @inline def listPageReceiptsFuture(params: ListPageReceiptsRequest): Future[ListPageReceiptsResult] = service.listPageReceipts(params).promise().toFuture
    @inline def listPagesByContactFuture(params: ListPagesByContactRequest): Future[ListPagesByContactResult] = service.listPagesByContact(params).promise().toFuture
    @inline def listPagesByEngagementFuture(params: ListPagesByEngagementRequest): Future[ListPagesByEngagementResult] = service.listPagesByEngagement(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] = service.listTagsForResource(params).promise().toFuture
    @inline def putContactPolicyFuture(params: PutContactPolicyRequest): Future[PutContactPolicyResult] = service.putContactPolicy(params).promise().toFuture
    @inline def sendActivationCodeFuture(params: SendActivationCodeRequest): Future[SendActivationCodeResult] = service.sendActivationCode(params).promise().toFuture
    @inline def startEngagementFuture(params: StartEngagementRequest): Future[StartEngagementResult] = service.startEngagement(params).promise().toFuture
    @inline def stopEngagementFuture(params: StopEngagementRequest): Future[StopEngagementResult] = service.stopEngagement(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResult] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResult] = service.untagResource(params).promise().toFuture
    @inline def updateContactChannelFuture(params: UpdateContactChannelRequest): Future[UpdateContactChannelResult] = service.updateContactChannel(params).promise().toFuture
    @inline def updateContactFuture(params: UpdateContactRequest): Future[UpdateContactResult] = service.updateContact(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ssmcontacts", JSImport.Namespace, "AWS.SSMContacts")
  class SSMContacts() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptPage(params: AcceptPageRequest): Request[AcceptPageResult] = js.native
    def activateContactChannel(params: ActivateContactChannelRequest): Request[ActivateContactChannelResult] = js.native
    def createContact(params: CreateContactRequest): Request[CreateContactResult] = js.native
    def createContactChannel(params: CreateContactChannelRequest): Request[CreateContactChannelResult] = js.native
    def deactivateContactChannel(params: DeactivateContactChannelRequest): Request[DeactivateContactChannelResult] = js.native
    def deleteContact(params: DeleteContactRequest): Request[DeleteContactResult] = js.native
    def deleteContactChannel(params: DeleteContactChannelRequest): Request[DeleteContactChannelResult] = js.native
    def describeEngagement(params: DescribeEngagementRequest): Request[DescribeEngagementResult] = js.native
    def describePage(params: DescribePageRequest): Request[DescribePageResult] = js.native
    def getContact(params: GetContactRequest): Request[GetContactResult] = js.native
    def getContactChannel(params: GetContactChannelRequest): Request[GetContactChannelResult] = js.native
    def getContactPolicy(params: GetContactPolicyRequest): Request[GetContactPolicyResult] = js.native
    def listContactChannels(params: ListContactChannelsRequest): Request[ListContactChannelsResult] = js.native
    def listContacts(params: ListContactsRequest): Request[ListContactsResult] = js.native
    def listEngagements(params: ListEngagementsRequest): Request[ListEngagementsResult] = js.native
    def listPageReceipts(params: ListPageReceiptsRequest): Request[ListPageReceiptsResult] = js.native
    def listPagesByContact(params: ListPagesByContactRequest): Request[ListPagesByContactResult] = js.native
    def listPagesByEngagement(params: ListPagesByEngagementRequest): Request[ListPagesByEngagementResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def putContactPolicy(params: PutContactPolicyRequest): Request[PutContactPolicyResult] = js.native
    def sendActivationCode(params: SendActivationCodeRequest): Request[SendActivationCodeResult] = js.native
    def startEngagement(params: StartEngagementRequest): Request[StartEngagementResult] = js.native
    def stopEngagement(params: StopEngagementRequest): Request[StopEngagementResult] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResult] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResult] = js.native
    def updateContact(params: UpdateContactRequest): Request[UpdateContactResult] = js.native
    def updateContactChannel(params: UpdateContactChannelRequest): Request[UpdateContactChannelResult] = js.native
  }
  object SSMContacts {
    @inline implicit def toOps(service: SSMContacts): SSMContactsOps = {
      new SSMContactsOps(service)
    }
  }

  @js.native
  trait AcceptPageRequest extends js.Object {
    var AcceptCode: AcceptCode
    var AcceptType: AcceptType
    var PageId: SsmContactsArn
    var AcceptCodeValidation: js.UndefOr[AcceptCodeValidation]
    var ContactChannelId: js.UndefOr[SsmContactsArn]
    var Note: js.UndefOr[ReceiptInfo]
  }

  object AcceptPageRequest {
    @inline
    def apply(
        AcceptCode: AcceptCode,
        AcceptType: AcceptType,
        PageId: SsmContactsArn,
        AcceptCodeValidation: js.UndefOr[AcceptCodeValidation] = js.undefined,
        ContactChannelId: js.UndefOr[SsmContactsArn] = js.undefined,
        Note: js.UndefOr[ReceiptInfo] = js.undefined
    ): AcceptPageRequest = {
      val __obj = js.Dynamic.literal(
        "AcceptCode" -> AcceptCode.asInstanceOf[js.Any],
        "AcceptType" -> AcceptType.asInstanceOf[js.Any],
        "PageId" -> PageId.asInstanceOf[js.Any]
      )

      AcceptCodeValidation.foreach(__v => __obj.updateDynamic("AcceptCodeValidation")(__v.asInstanceOf[js.Any]))
      ContactChannelId.foreach(__v => __obj.updateDynamic("ContactChannelId")(__v.asInstanceOf[js.Any]))
      Note.foreach(__v => __obj.updateDynamic("Note")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptPageRequest]
    }
  }

  @js.native
  trait AcceptPageResult extends js.Object

  object AcceptPageResult {
    @inline
    def apply(): AcceptPageResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptPageResult]
    }
  }

  @js.native
  trait ActivateContactChannelRequest extends js.Object {
    var ActivationCode: ActivationCode
    var ContactChannelId: SsmContactsArn
  }

  object ActivateContactChannelRequest {
    @inline
    def apply(
        ActivationCode: ActivationCode,
        ContactChannelId: SsmContactsArn
    ): ActivateContactChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ActivationCode" -> ActivationCode.asInstanceOf[js.Any],
        "ContactChannelId" -> ContactChannelId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActivateContactChannelRequest]
    }
  }

  @js.native
  trait ActivateContactChannelResult extends js.Object

  object ActivateContactChannelResult {
    @inline
    def apply(): ActivateContactChannelResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivateContactChannelResult]
    }
  }

  /** Information about the contact channel that Incident Manager uses to engage the contact.
    */
  @js.native
  trait ChannelTargetInfo extends js.Object {
    var ContactChannelId: SsmContactsArn
    var RetryIntervalInMinutes: js.UndefOr[RetryIntervalInMinutes]
  }

  object ChannelTargetInfo {
    @inline
    def apply(
        ContactChannelId: SsmContactsArn,
        RetryIntervalInMinutes: js.UndefOr[RetryIntervalInMinutes] = js.undefined
    ): ChannelTargetInfo = {
      val __obj = js.Dynamic.literal(
        "ContactChannelId" -> ContactChannelId.asInstanceOf[js.Any]
      )

      RetryIntervalInMinutes.foreach(__v => __obj.updateDynamic("RetryIntervalInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelTargetInfo]
    }
  }

  /** A personal contact or escalation plan that Incident Manager engages during an incident.
    */
  @js.native
  trait Contact extends js.Object {
    var Alias: ContactAlias
    var ContactArn: SsmContactsArn
    var Type: ContactType
    var DisplayName: js.UndefOr[ContactName]
  }

  object Contact {
    @inline
    def apply(
        Alias: ContactAlias,
        ContactArn: SsmContactsArn,
        Type: ContactType,
        DisplayName: js.UndefOr[ContactName] = js.undefined
    ): Contact = {
      val __obj = js.Dynamic.literal(
        "Alias" -> Alias.asInstanceOf[js.Any],
        "ContactArn" -> ContactArn.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Contact]
    }
  }

  /** The method that Incident Manager uses to engage a contact.
    */
  @js.native
  trait ContactChannel extends js.Object {
    var ActivationStatus: ActivationStatus
    var ContactArn: SsmContactsArn
    var ContactChannelArn: SsmContactsArn
    var DeliveryAddress: ContactChannelAddress
    var Name: ChannelName
    var Type: js.UndefOr[ChannelType]
  }

  object ContactChannel {
    @inline
    def apply(
        ActivationStatus: ActivationStatus,
        ContactArn: SsmContactsArn,
        ContactChannelArn: SsmContactsArn,
        DeliveryAddress: ContactChannelAddress,
        Name: ChannelName,
        Type: js.UndefOr[ChannelType] = js.undefined
    ): ContactChannel = {
      val __obj = js.Dynamic.literal(
        "ActivationStatus" -> ActivationStatus.asInstanceOf[js.Any],
        "ContactArn" -> ContactArn.asInstanceOf[js.Any],
        "ContactChannelArn" -> ContactChannelArn.asInstanceOf[js.Any],
        "DeliveryAddress" -> DeliveryAddress.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactChannel]
    }
  }

  /** The details that Incident Manager uses when trying to engage the contact channel.
    */
  @js.native
  trait ContactChannelAddress extends js.Object {
    var SimpleAddress: js.UndefOr[SimpleAddress]
  }

  object ContactChannelAddress {
    @inline
    def apply(
        SimpleAddress: js.UndefOr[SimpleAddress] = js.undefined
    ): ContactChannelAddress = {
      val __obj = js.Dynamic.literal()
      SimpleAddress.foreach(__v => __obj.updateDynamic("SimpleAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactChannelAddress]
    }
  }

  /** The contact that Incident Manager is engaging during an incident.
    */
  @js.native
  trait ContactTargetInfo extends js.Object {
    var IsEssential: IsEssential
    var ContactId: js.UndefOr[SsmContactsArn]
  }

  object ContactTargetInfo {
    @inline
    def apply(
        IsEssential: IsEssential,
        ContactId: js.UndefOr[SsmContactsArn] = js.undefined
    ): ContactTargetInfo = {
      val __obj = js.Dynamic.literal(
        "IsEssential" -> IsEssential.asInstanceOf[js.Any]
      )

      ContactId.foreach(__v => __obj.updateDynamic("ContactId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactTargetInfo]
    }
  }

  @js.native
  trait CreateContactChannelRequest extends js.Object {
    var ContactId: SsmContactsArn
    var DeliveryAddress: ContactChannelAddress
    var Name: ChannelName
    var Type: ChannelType
    var DeferActivation: js.UndefOr[DeferActivation]
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
  }

  object CreateContactChannelRequest {
    @inline
    def apply(
        ContactId: SsmContactsArn,
        DeliveryAddress: ContactChannelAddress,
        Name: ChannelName,
        Type: ChannelType,
        DeferActivation: js.UndefOr[DeferActivation] = js.undefined,
        IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): CreateContactChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "DeliveryAddress" -> DeliveryAddress.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DeferActivation.foreach(__v => __obj.updateDynamic("DeferActivation")(__v.asInstanceOf[js.Any]))
      IdempotencyToken.foreach(__v => __obj.updateDynamic("IdempotencyToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContactChannelRequest]
    }
  }

  @js.native
  trait CreateContactChannelResult extends js.Object {
    var ContactChannelArn: SsmContactsArn
  }

  object CreateContactChannelResult {
    @inline
    def apply(
        ContactChannelArn: SsmContactsArn
    ): CreateContactChannelResult = {
      val __obj = js.Dynamic.literal(
        "ContactChannelArn" -> ContactChannelArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateContactChannelResult]
    }
  }

  @js.native
  trait CreateContactRequest extends js.Object {
    var Alias: ContactAlias
    var Plan: Plan
    var Type: ContactType
    var DisplayName: js.UndefOr[ContactName]
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var Tags: js.UndefOr[TagsList]
  }

  object CreateContactRequest {
    @inline
    def apply(
        Alias: ContactAlias,
        Plan: Plan,
        Type: ContactType,
        DisplayName: js.UndefOr[ContactName] = js.undefined,
        IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
        Tags: js.UndefOr[TagsList] = js.undefined
    ): CreateContactRequest = {
      val __obj = js.Dynamic.literal(
        "Alias" -> Alias.asInstanceOf[js.Any],
        "Plan" -> Plan.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      IdempotencyToken.foreach(__v => __obj.updateDynamic("IdempotencyToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContactRequest]
    }
  }

  @js.native
  trait CreateContactResult extends js.Object {
    var ContactArn: SsmContactsArn
  }

  object CreateContactResult {
    @inline
    def apply(
        ContactArn: SsmContactsArn
    ): CreateContactResult = {
      val __obj = js.Dynamic.literal(
        "ContactArn" -> ContactArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateContactResult]
    }
  }

  @js.native
  trait DeactivateContactChannelRequest extends js.Object {
    var ContactChannelId: SsmContactsArn
  }

  object DeactivateContactChannelRequest {
    @inline
    def apply(
        ContactChannelId: SsmContactsArn
    ): DeactivateContactChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ContactChannelId" -> ContactChannelId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeactivateContactChannelRequest]
    }
  }

  @js.native
  trait DeactivateContactChannelResult extends js.Object

  object DeactivateContactChannelResult {
    @inline
    def apply(): DeactivateContactChannelResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeactivateContactChannelResult]
    }
  }

  @js.native
  trait DeleteContactChannelRequest extends js.Object {
    var ContactChannelId: SsmContactsArn
  }

  object DeleteContactChannelRequest {
    @inline
    def apply(
        ContactChannelId: SsmContactsArn
    ): DeleteContactChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ContactChannelId" -> ContactChannelId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteContactChannelRequest]
    }
  }

  @js.native
  trait DeleteContactChannelResult extends js.Object

  object DeleteContactChannelResult {
    @inline
    def apply(): DeleteContactChannelResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteContactChannelResult]
    }
  }

  @js.native
  trait DeleteContactRequest extends js.Object {
    var ContactId: SsmContactsArn
  }

  object DeleteContactRequest {
    @inline
    def apply(
        ContactId: SsmContactsArn
    ): DeleteContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteContactRequest]
    }
  }

  @js.native
  trait DeleteContactResult extends js.Object

  object DeleteContactResult {
    @inline
    def apply(): DeleteContactResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteContactResult]
    }
  }

  @js.native
  trait DescribeEngagementRequest extends js.Object {
    var EngagementId: SsmContactsArn
  }

  object DescribeEngagementRequest {
    @inline
    def apply(
        EngagementId: SsmContactsArn
    ): DescribeEngagementRequest = {
      val __obj = js.Dynamic.literal(
        "EngagementId" -> EngagementId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEngagementRequest]
    }
  }

  @js.native
  trait DescribeEngagementResult extends js.Object {
    var ContactArn: SsmContactsArn
    var Content: Content
    var EngagementArn: SsmContactsArn
    var Sender: Sender
    var Subject: Subject
    var IncidentId: js.UndefOr[IncidentId]
    var PublicContent: js.UndefOr[PublicContent]
    var PublicSubject: js.UndefOr[PublicSubject]
    var StartTime: js.UndefOr[DateTime]
    var StopTime: js.UndefOr[DateTime]
  }

  object DescribeEngagementResult {
    @inline
    def apply(
        ContactArn: SsmContactsArn,
        Content: Content,
        EngagementArn: SsmContactsArn,
        Sender: Sender,
        Subject: Subject,
        IncidentId: js.UndefOr[IncidentId] = js.undefined,
        PublicContent: js.UndefOr[PublicContent] = js.undefined,
        PublicSubject: js.UndefOr[PublicSubject] = js.undefined,
        StartTime: js.UndefOr[DateTime] = js.undefined,
        StopTime: js.UndefOr[DateTime] = js.undefined
    ): DescribeEngagementResult = {
      val __obj = js.Dynamic.literal(
        "ContactArn" -> ContactArn.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "EngagementArn" -> EngagementArn.asInstanceOf[js.Any],
        "Sender" -> Sender.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any]
      )

      IncidentId.foreach(__v => __obj.updateDynamic("IncidentId")(__v.asInstanceOf[js.Any]))
      PublicContent.foreach(__v => __obj.updateDynamic("PublicContent")(__v.asInstanceOf[js.Any]))
      PublicSubject.foreach(__v => __obj.updateDynamic("PublicSubject")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      StopTime.foreach(__v => __obj.updateDynamic("StopTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEngagementResult]
    }
  }

  @js.native
  trait DescribePageRequest extends js.Object {
    var PageId: SsmContactsArn
  }

  object DescribePageRequest {
    @inline
    def apply(
        PageId: SsmContactsArn
    ): DescribePageRequest = {
      val __obj = js.Dynamic.literal(
        "PageId" -> PageId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePageRequest]
    }
  }

  @js.native
  trait DescribePageResult extends js.Object {
    var ContactArn: SsmContactsArn
    var Content: Content
    var EngagementArn: SsmContactsArn
    var PageArn: SsmContactsArn
    var Sender: Sender
    var Subject: Subject
    var DeliveryTime: js.UndefOr[DateTime]
    var IncidentId: js.UndefOr[IncidentId]
    var PublicContent: js.UndefOr[PublicContent]
    var PublicSubject: js.UndefOr[PublicSubject]
    var ReadTime: js.UndefOr[DateTime]
    var SentTime: js.UndefOr[DateTime]
  }

  object DescribePageResult {
    @inline
    def apply(
        ContactArn: SsmContactsArn,
        Content: Content,
        EngagementArn: SsmContactsArn,
        PageArn: SsmContactsArn,
        Sender: Sender,
        Subject: Subject,
        DeliveryTime: js.UndefOr[DateTime] = js.undefined,
        IncidentId: js.UndefOr[IncidentId] = js.undefined,
        PublicContent: js.UndefOr[PublicContent] = js.undefined,
        PublicSubject: js.UndefOr[PublicSubject] = js.undefined,
        ReadTime: js.UndefOr[DateTime] = js.undefined,
        SentTime: js.UndefOr[DateTime] = js.undefined
    ): DescribePageResult = {
      val __obj = js.Dynamic.literal(
        "ContactArn" -> ContactArn.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "EngagementArn" -> EngagementArn.asInstanceOf[js.Any],
        "PageArn" -> PageArn.asInstanceOf[js.Any],
        "Sender" -> Sender.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any]
      )

      DeliveryTime.foreach(__v => __obj.updateDynamic("DeliveryTime")(__v.asInstanceOf[js.Any]))
      IncidentId.foreach(__v => __obj.updateDynamic("IncidentId")(__v.asInstanceOf[js.Any]))
      PublicContent.foreach(__v => __obj.updateDynamic("PublicContent")(__v.asInstanceOf[js.Any]))
      PublicSubject.foreach(__v => __obj.updateDynamic("PublicSubject")(__v.asInstanceOf[js.Any]))
      ReadTime.foreach(__v => __obj.updateDynamic("ReadTime")(__v.asInstanceOf[js.Any]))
      SentTime.foreach(__v => __obj.updateDynamic("SentTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePageResult]
    }
  }

  /** Incident Manager reaching out to a contact or escalation plan to engage contact during an incident.
    */
  @js.native
  trait Engagement extends js.Object {
    var ContactArn: SsmContactsArn
    var EngagementArn: SsmContactsArn
    var Sender: Sender
    var IncidentId: js.UndefOr[IncidentId]
    var StartTime: js.UndefOr[DateTime]
    var StopTime: js.UndefOr[DateTime]
  }

  object Engagement {
    @inline
    def apply(
        ContactArn: SsmContactsArn,
        EngagementArn: SsmContactsArn,
        Sender: Sender,
        IncidentId: js.UndefOr[IncidentId] = js.undefined,
        StartTime: js.UndefOr[DateTime] = js.undefined,
        StopTime: js.UndefOr[DateTime] = js.undefined
    ): Engagement = {
      val __obj = js.Dynamic.literal(
        "ContactArn" -> ContactArn.asInstanceOf[js.Any],
        "EngagementArn" -> EngagementArn.asInstanceOf[js.Any],
        "Sender" -> Sender.asInstanceOf[js.Any]
      )

      IncidentId.foreach(__v => __obj.updateDynamic("IncidentId")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      StopTime.foreach(__v => __obj.updateDynamic("StopTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Engagement]
    }
  }

  @js.native
  trait GetContactChannelRequest extends js.Object {
    var ContactChannelId: SsmContactsArn
  }

  object GetContactChannelRequest {
    @inline
    def apply(
        ContactChannelId: SsmContactsArn
    ): GetContactChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ContactChannelId" -> ContactChannelId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetContactChannelRequest]
    }
  }

  @js.native
  trait GetContactChannelResult extends js.Object {
    var ContactArn: SsmContactsArn
    var ContactChannelArn: SsmContactsArn
    var DeliveryAddress: ContactChannelAddress
    var Name: ChannelName
    var Type: ChannelType
    var ActivationStatus: js.UndefOr[ActivationStatus]
  }

  object GetContactChannelResult {
    @inline
    def apply(
        ContactArn: SsmContactsArn,
        ContactChannelArn: SsmContactsArn,
        DeliveryAddress: ContactChannelAddress,
        Name: ChannelName,
        Type: ChannelType,
        ActivationStatus: js.UndefOr[ActivationStatus] = js.undefined
    ): GetContactChannelResult = {
      val __obj = js.Dynamic.literal(
        "ContactArn" -> ContactArn.asInstanceOf[js.Any],
        "ContactChannelArn" -> ContactChannelArn.asInstanceOf[js.Any],
        "DeliveryAddress" -> DeliveryAddress.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      ActivationStatus.foreach(__v => __obj.updateDynamic("ActivationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactChannelResult]
    }
  }

  @js.native
  trait GetContactPolicyRequest extends js.Object {
    var ContactArn: SsmContactsArn
  }

  object GetContactPolicyRequest {
    @inline
    def apply(
        ContactArn: SsmContactsArn
    ): GetContactPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ContactArn" -> ContactArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetContactPolicyRequest]
    }
  }

  @js.native
  trait GetContactPolicyResult extends js.Object {
    var ContactArn: js.UndefOr[SsmContactsArn]
    var Policy: js.UndefOr[Policy]
  }

  object GetContactPolicyResult {
    @inline
    def apply(
        ContactArn: js.UndefOr[SsmContactsArn] = js.undefined,
        Policy: js.UndefOr[Policy] = js.undefined
    ): GetContactPolicyResult = {
      val __obj = js.Dynamic.literal()
      ContactArn.foreach(__v => __obj.updateDynamic("ContactArn")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactPolicyResult]
    }
  }

  @js.native
  trait GetContactRequest extends js.Object {
    var ContactId: SsmContactsArn
  }

  object GetContactRequest {
    @inline
    def apply(
        ContactId: SsmContactsArn
    ): GetContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetContactRequest]
    }
  }

  @js.native
  trait GetContactResult extends js.Object {
    var Alias: ContactAlias
    var ContactArn: SsmContactsArn
    var Plan: Plan
    var Type: ContactType
    var DisplayName: js.UndefOr[ContactName]
  }

  object GetContactResult {
    @inline
    def apply(
        Alias: ContactAlias,
        ContactArn: SsmContactsArn,
        Plan: Plan,
        Type: ContactType,
        DisplayName: js.UndefOr[ContactName] = js.undefined
    ): GetContactResult = {
      val __obj = js.Dynamic.literal(
        "Alias" -> Alias.asInstanceOf[js.Any],
        "ContactArn" -> ContactArn.asInstanceOf[js.Any],
        "Plan" -> Plan.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactResult]
    }
  }

  @js.native
  trait ListContactChannelsRequest extends js.Object {
    var ContactId: SsmContactsArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListContactChannelsRequest {
    @inline
    def apply(
        ContactId: SsmContactsArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListContactChannelsRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactChannelsRequest]
    }
  }

  @js.native
  trait ListContactChannelsResult extends js.Object {
    var ContactChannels: ContactChannelList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListContactChannelsResult {
    @inline
    def apply(
        ContactChannels: ContactChannelList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListContactChannelsResult = {
      val __obj = js.Dynamic.literal(
        "ContactChannels" -> ContactChannels.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactChannelsResult]
    }
  }

  @js.native
  trait ListContactsRequest extends js.Object {
    var AliasPrefix: js.UndefOr[ContactAlias]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var Type: js.UndefOr[ContactType]
  }

  object ListContactsRequest {
    @inline
    def apply(
        AliasPrefix: js.UndefOr[ContactAlias] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Type: js.UndefOr[ContactType] = js.undefined
    ): ListContactsRequest = {
      val __obj = js.Dynamic.literal()
      AliasPrefix.foreach(__v => __obj.updateDynamic("AliasPrefix")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactsRequest]
    }
  }

  @js.native
  trait ListContactsResult extends js.Object {
    var Contacts: js.UndefOr[ContactsList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListContactsResult {
    @inline
    def apply(
        Contacts: js.UndefOr[ContactsList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListContactsResult = {
      val __obj = js.Dynamic.literal()
      Contacts.foreach(__v => __obj.updateDynamic("Contacts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactsResult]
    }
  }

  @js.native
  trait ListEngagementsRequest extends js.Object {
    var IncidentId: js.UndefOr[IncidentId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var TimeRangeValue: js.UndefOr[TimeRange]
  }

  object ListEngagementsRequest {
    @inline
    def apply(
        IncidentId: js.UndefOr[IncidentId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        TimeRangeValue: js.UndefOr[TimeRange] = js.undefined
    ): ListEngagementsRequest = {
      val __obj = js.Dynamic.literal()
      IncidentId.foreach(__v => __obj.updateDynamic("IncidentId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TimeRangeValue.foreach(__v => __obj.updateDynamic("TimeRangeValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEngagementsRequest]
    }
  }

  @js.native
  trait ListEngagementsResult extends js.Object {
    var Engagements: EngagementsList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListEngagementsResult {
    @inline
    def apply(
        Engagements: EngagementsList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListEngagementsResult = {
      val __obj = js.Dynamic.literal(
        "Engagements" -> Engagements.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEngagementsResult]
    }
  }

  @js.native
  trait ListPageReceiptsRequest extends js.Object {
    var PageId: SsmContactsArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListPageReceiptsRequest {
    @inline
    def apply(
        PageId: SsmContactsArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPageReceiptsRequest = {
      val __obj = js.Dynamic.literal(
        "PageId" -> PageId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPageReceiptsRequest]
    }
  }

  @js.native
  trait ListPageReceiptsResult extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Receipts: js.UndefOr[ReceiptsList]
  }

  object ListPageReceiptsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Receipts: js.UndefOr[ReceiptsList] = js.undefined
    ): ListPageReceiptsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Receipts.foreach(__v => __obj.updateDynamic("Receipts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPageReceiptsResult]
    }
  }

  @js.native
  trait ListPagesByContactRequest extends js.Object {
    var ContactId: SsmContactsArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListPagesByContactRequest {
    @inline
    def apply(
        ContactId: SsmContactsArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPagesByContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPagesByContactRequest]
    }
  }

  @js.native
  trait ListPagesByContactResult extends js.Object {
    var Pages: PagesList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListPagesByContactResult {
    @inline
    def apply(
        Pages: PagesList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPagesByContactResult = {
      val __obj = js.Dynamic.literal(
        "Pages" -> Pages.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPagesByContactResult]
    }
  }

  @js.native
  trait ListPagesByEngagementRequest extends js.Object {
    var EngagementId: SsmContactsArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListPagesByEngagementRequest {
    @inline
    def apply(
        EngagementId: SsmContactsArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPagesByEngagementRequest = {
      val __obj = js.Dynamic.literal(
        "EngagementId" -> EngagementId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPagesByEngagementRequest]
    }
  }

  @js.native
  trait ListPagesByEngagementResult extends js.Object {
    var Pages: PagesList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListPagesByEngagementResult {
    @inline
    def apply(
        Pages: PagesList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPagesByEngagementResult = {
      val __obj = js.Dynamic.literal(
        "Pages" -> Pages.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPagesByEngagementResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var Tags: js.UndefOr[TagsList]
  }

  object ListTagsForResourceResult {
    @inline
    def apply(
        Tags: js.UndefOr[TagsList] = js.undefined
    ): ListTagsForResourceResult = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResult]
    }
  }

  /** Incident Manager engaging a contact's contact channel.
    */
  @js.native
  trait Page extends js.Object {
    var ContactArn: SsmContactsArn
    var EngagementArn: SsmContactsArn
    var PageArn: SsmContactsArn
    var Sender: Sender
    var DeliveryTime: js.UndefOr[DateTime]
    var IncidentId: js.UndefOr[IncidentId]
    var ReadTime: js.UndefOr[DateTime]
    var SentTime: js.UndefOr[DateTime]
  }

  object Page {
    @inline
    def apply(
        ContactArn: SsmContactsArn,
        EngagementArn: SsmContactsArn,
        PageArn: SsmContactsArn,
        Sender: Sender,
        DeliveryTime: js.UndefOr[DateTime] = js.undefined,
        IncidentId: js.UndefOr[IncidentId] = js.undefined,
        ReadTime: js.UndefOr[DateTime] = js.undefined,
        SentTime: js.UndefOr[DateTime] = js.undefined
    ): Page = {
      val __obj = js.Dynamic.literal(
        "ContactArn" -> ContactArn.asInstanceOf[js.Any],
        "EngagementArn" -> EngagementArn.asInstanceOf[js.Any],
        "PageArn" -> PageArn.asInstanceOf[js.Any],
        "Sender" -> Sender.asInstanceOf[js.Any]
      )

      DeliveryTime.foreach(__v => __obj.updateDynamic("DeliveryTime")(__v.asInstanceOf[js.Any]))
      IncidentId.foreach(__v => __obj.updateDynamic("IncidentId")(__v.asInstanceOf[js.Any]))
      ReadTime.foreach(__v => __obj.updateDynamic("ReadTime")(__v.asInstanceOf[js.Any]))
      SentTime.foreach(__v => __obj.updateDynamic("SentTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Page]
    }
  }

  /** The stages that an escalation plan or engagement plan engages contacts and contact methods in.
    */
  @js.native
  trait Plan extends js.Object {
    var Stages: StagesList
  }

  object Plan {
    @inline
    def apply(
        Stages: StagesList
    ): Plan = {
      val __obj = js.Dynamic.literal(
        "Stages" -> Stages.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Plan]
    }
  }

  @js.native
  trait PutContactPolicyRequest extends js.Object {
    var ContactArn: SsmContactsArn
    var Policy: Policy
  }

  object PutContactPolicyRequest {
    @inline
    def apply(
        ContactArn: SsmContactsArn,
        Policy: Policy
    ): PutContactPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ContactArn" -> ContactArn.asInstanceOf[js.Any],
        "Policy" -> Policy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutContactPolicyRequest]
    }
  }

  @js.native
  trait PutContactPolicyResult extends js.Object

  object PutContactPolicyResult {
    @inline
    def apply(): PutContactPolicyResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutContactPolicyResult]
    }
  }

  /** Records events during an engagement.
    */
  @js.native
  trait Receipt extends js.Object {
    var ReceiptTime: DateTime
    var ReceiptType: ReceiptType
    var ContactChannelArn: js.UndefOr[SsmContactsArn]
    var ReceiptInfo: js.UndefOr[ReceiptInfo]
  }

  object Receipt {
    @inline
    def apply(
        ReceiptTime: DateTime,
        ReceiptType: ReceiptType,
        ContactChannelArn: js.UndefOr[SsmContactsArn] = js.undefined,
        ReceiptInfo: js.UndefOr[ReceiptInfo] = js.undefined
    ): Receipt = {
      val __obj = js.Dynamic.literal(
        "ReceiptTime" -> ReceiptTime.asInstanceOf[js.Any],
        "ReceiptType" -> ReceiptType.asInstanceOf[js.Any]
      )

      ContactChannelArn.foreach(__v => __obj.updateDynamic("ContactChannelArn")(__v.asInstanceOf[js.Any]))
      ReceiptInfo.foreach(__v => __obj.updateDynamic("ReceiptInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Receipt]
    }
  }

  @js.native
  trait SendActivationCodeRequest extends js.Object {
    var ContactChannelId: SsmContactsArn
  }

  object SendActivationCodeRequest {
    @inline
    def apply(
        ContactChannelId: SsmContactsArn
    ): SendActivationCodeRequest = {
      val __obj = js.Dynamic.literal(
        "ContactChannelId" -> ContactChannelId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SendActivationCodeRequest]
    }
  }

  @js.native
  trait SendActivationCodeResult extends js.Object

  object SendActivationCodeResult {
    @inline
    def apply(): SendActivationCodeResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendActivationCodeResult]
    }
  }

  /** A set amount of time that an escalation plan or engagement plan engages the specified contacts or contact methods.
    */
  @js.native
  trait Stage extends js.Object {
    var DurationInMinutes: StageDurationInMins
    var Targets: TargetsList
  }

  object Stage {
    @inline
    def apply(
        DurationInMinutes: StageDurationInMins,
        Targets: TargetsList
    ): Stage = {
      val __obj = js.Dynamic.literal(
        "DurationInMinutes" -> DurationInMinutes.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Stage]
    }
  }

  @js.native
  trait StartEngagementRequest extends js.Object {
    var ContactId: SsmContactsArn
    var Content: Content
    var Sender: Sender
    var Subject: Subject
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var IncidentId: js.UndefOr[IncidentId]
    var PublicContent: js.UndefOr[PublicContent]
    var PublicSubject: js.UndefOr[PublicSubject]
  }

  object StartEngagementRequest {
    @inline
    def apply(
        ContactId: SsmContactsArn,
        Content: Content,
        Sender: Sender,
        Subject: Subject,
        IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
        IncidentId: js.UndefOr[IncidentId] = js.undefined,
        PublicContent: js.UndefOr[PublicContent] = js.undefined,
        PublicSubject: js.UndefOr[PublicSubject] = js.undefined
    ): StartEngagementRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "Sender" -> Sender.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any]
      )

      IdempotencyToken.foreach(__v => __obj.updateDynamic("IdempotencyToken")(__v.asInstanceOf[js.Any]))
      IncidentId.foreach(__v => __obj.updateDynamic("IncidentId")(__v.asInstanceOf[js.Any]))
      PublicContent.foreach(__v => __obj.updateDynamic("PublicContent")(__v.asInstanceOf[js.Any]))
      PublicSubject.foreach(__v => __obj.updateDynamic("PublicSubject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartEngagementRequest]
    }
  }

  @js.native
  trait StartEngagementResult extends js.Object {
    var EngagementArn: SsmContactsArn
  }

  object StartEngagementResult {
    @inline
    def apply(
        EngagementArn: SsmContactsArn
    ): StartEngagementResult = {
      val __obj = js.Dynamic.literal(
        "EngagementArn" -> EngagementArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartEngagementResult]
    }
  }

  @js.native
  trait StopEngagementRequest extends js.Object {
    var EngagementId: SsmContactsArn
    var Reason: js.UndefOr[StopReason]
  }

  object StopEngagementRequest {
    @inline
    def apply(
        EngagementId: SsmContactsArn,
        Reason: js.UndefOr[StopReason] = js.undefined
    ): StopEngagementRequest = {
      val __obj = js.Dynamic.literal(
        "EngagementId" -> EngagementId.asInstanceOf[js.Any]
      )

      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopEngagementRequest]
    }
  }

  @js.native
  trait StopEngagementResult extends js.Object

  object StopEngagementResult {
    @inline
    def apply(): StopEngagementResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopEngagementResult]
    }
  }

  /** A container of a key-value name pair.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagsList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagsList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResult extends js.Object

  object TagResourceResult {
    @inline
    def apply(): TagResourceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResult]
    }
  }

  /** The contact or contact channel that's being engaged.
    */
  @js.native
  trait Target extends js.Object {
    var ChannelTargetInfo: js.UndefOr[ChannelTargetInfo]
    var ContactTargetInfo: js.UndefOr[ContactTargetInfo]
  }

  object Target {
    @inline
    def apply(
        ChannelTargetInfo: js.UndefOr[ChannelTargetInfo] = js.undefined,
        ContactTargetInfo: js.UndefOr[ContactTargetInfo] = js.undefined
    ): Target = {
      val __obj = js.Dynamic.literal()
      ChannelTargetInfo.foreach(__v => __obj.updateDynamic("ChannelTargetInfo")(__v.asInstanceOf[js.Any]))
      ContactTargetInfo.foreach(__v => __obj.updateDynamic("ContactTargetInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Target]
    }
  }

  /** A range of between two set times
    */
  @js.native
  trait TimeRange extends js.Object {
    var EndTime: js.UndefOr[DateTime]
    var StartTime: js.UndefOr[DateTime]
  }

  object TimeRange {
    @inline
    def apply(
        EndTime: js.UndefOr[DateTime] = js.undefined,
        StartTime: js.UndefOr[DateTime] = js.undefined
    ): TimeRange = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeRange]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResult extends js.Object

  object UntagResourceResult {
    @inline
    def apply(): UntagResourceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResult]
    }
  }

  @js.native
  trait UpdateContactChannelRequest extends js.Object {
    var ContactChannelId: SsmContactsArn
    var DeliveryAddress: js.UndefOr[ContactChannelAddress]
    var Name: js.UndefOr[ChannelName]
  }

  object UpdateContactChannelRequest {
    @inline
    def apply(
        ContactChannelId: SsmContactsArn,
        DeliveryAddress: js.UndefOr[ContactChannelAddress] = js.undefined,
        Name: js.UndefOr[ChannelName] = js.undefined
    ): UpdateContactChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ContactChannelId" -> ContactChannelId.asInstanceOf[js.Any]
      )

      DeliveryAddress.foreach(__v => __obj.updateDynamic("DeliveryAddress")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContactChannelRequest]
    }
  }

  @js.native
  trait UpdateContactChannelResult extends js.Object

  object UpdateContactChannelResult {
    @inline
    def apply(): UpdateContactChannelResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContactChannelResult]
    }
  }

  @js.native
  trait UpdateContactRequest extends js.Object {
    var ContactId: SsmContactsArn
    var DisplayName: js.UndefOr[ContactName]
    var Plan: js.UndefOr[Plan]
  }

  object UpdateContactRequest {
    @inline
    def apply(
        ContactId: SsmContactsArn,
        DisplayName: js.UndefOr[ContactName] = js.undefined,
        Plan: js.UndefOr[Plan] = js.undefined
    ): UpdateContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Plan.foreach(__v => __obj.updateDynamic("Plan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContactRequest]
    }
  }

  @js.native
  trait UpdateContactResult extends js.Object

  object UpdateContactResult {
    @inline
    def apply(): UpdateContactResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateContactResult]
    }
  }
}
