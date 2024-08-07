package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object route53domains {
  type AccountId = String
  type AddressLine = String
  type BillingRecords = js.Array[BillingRecord]
  type City = String
  type ContactName = String
  type ContactNumber = String
  type Currency = String
  type CurrentExpiryYear = Int
  type DNSSec = String
  type DomainAuthCode = String
  type DomainName = String
  type DomainPriceList = js.Array[DomainPrice]
  type DomainPriceName = String
  type DomainStatus = String
  type DomainStatusList = js.Array[DomainStatus]
  type DomainSuggestionsList = js.Array[DomainSuggestion]
  type DomainSummaryList = js.Array[DomainSummary]
  type DurationInYears = Int
  type Email = String
  type ErrorMessage = String
  type ExtraParamList = js.Array[ExtraParam]
  type ExtraParamValue = String
  type FIAuthKey = String
  type FilterConditions = js.Array[FilterCondition]
  type GlueIp = String
  type GlueIpList = js.Array[GlueIp]
  type HostName = String
  type InvoiceId = String
  type LangCode = String
  type NameserverList = js.Array[Nameserver]
  type OperationId = String
  type OperationSummaryList = js.Array[OperationSummary]
  type PageMarker = String
  type PageMaxItems = Int
  type Price = Double
  type RegistrarName = String
  type RegistrarUrl = String
  type RegistrarWhoIsServer = String
  type RegistryDomainId = String
  type Reseller = String
  type State = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type TldName = String
  type Value = String
  type Values = js.Array[Value]
  type ZipCode = String

  final class Route53DomainsOps(private val service: Route53Domains) extends AnyVal {

    @inline def acceptDomainTransferFromAnotherAwsAccountFuture(params: AcceptDomainTransferFromAnotherAwsAccountRequest): Future[AcceptDomainTransferFromAnotherAwsAccountResponse] = service.acceptDomainTransferFromAnotherAwsAccount(params).promise().toFuture
    @inline def cancelDomainTransferToAnotherAwsAccountFuture(params: CancelDomainTransferToAnotherAwsAccountRequest): Future[CancelDomainTransferToAnotherAwsAccountResponse] = service.cancelDomainTransferToAnotherAwsAccount(params).promise().toFuture
    @inline def checkDomainAvailabilityFuture(params: CheckDomainAvailabilityRequest): Future[CheckDomainAvailabilityResponse] = service.checkDomainAvailability(params).promise().toFuture
    @inline def checkDomainTransferabilityFuture(params: CheckDomainTransferabilityRequest): Future[CheckDomainTransferabilityResponse] = service.checkDomainTransferability(params).promise().toFuture
    @inline def deleteDomainFuture(params: DeleteDomainRequest): Future[DeleteDomainResponse] = service.deleteDomain(params).promise().toFuture
    @inline def deleteTagsForDomainFuture(params: DeleteTagsForDomainRequest): Future[DeleteTagsForDomainResponse] = service.deleteTagsForDomain(params).promise().toFuture
    @inline def disableDomainAutoRenewFuture(params: DisableDomainAutoRenewRequest): Future[DisableDomainAutoRenewResponse] = service.disableDomainAutoRenew(params).promise().toFuture
    @inline def disableDomainTransferLockFuture(params: DisableDomainTransferLockRequest): Future[DisableDomainTransferLockResponse] = service.disableDomainTransferLock(params).promise().toFuture
    @inline def enableDomainAutoRenewFuture(params: EnableDomainAutoRenewRequest): Future[EnableDomainAutoRenewResponse] = service.enableDomainAutoRenew(params).promise().toFuture
    @inline def enableDomainTransferLockFuture(params: EnableDomainTransferLockRequest): Future[EnableDomainTransferLockResponse] = service.enableDomainTransferLock(params).promise().toFuture
    @inline def getContactReachabilityStatusFuture(params: GetContactReachabilityStatusRequest): Future[GetContactReachabilityStatusResponse] = service.getContactReachabilityStatus(params).promise().toFuture
    @inline def getDomainDetailFuture(params: GetDomainDetailRequest): Future[GetDomainDetailResponse] = service.getDomainDetail(params).promise().toFuture
    @inline def getDomainSuggestionsFuture(params: GetDomainSuggestionsRequest): Future[GetDomainSuggestionsResponse] = service.getDomainSuggestions(params).promise().toFuture
    @inline def getOperationDetailFuture(params: GetOperationDetailRequest): Future[GetOperationDetailResponse] = service.getOperationDetail(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResponse] = service.listDomains(params).promise().toFuture
    @inline def listOperationsFuture(params: ListOperationsRequest): Future[ListOperationsResponse] = service.listOperations(params).promise().toFuture
    @inline def listPricesFuture(params: ListPricesRequest): Future[ListPricesResponse] = service.listPrices(params).promise().toFuture
    @inline def listTagsForDomainFuture(params: ListTagsForDomainRequest): Future[ListTagsForDomainResponse] = service.listTagsForDomain(params).promise().toFuture
    @inline def registerDomainFuture(params: RegisterDomainRequest): Future[RegisterDomainResponse] = service.registerDomain(params).promise().toFuture
    @inline def rejectDomainTransferFromAnotherAwsAccountFuture(params: RejectDomainTransferFromAnotherAwsAccountRequest): Future[RejectDomainTransferFromAnotherAwsAccountResponse] = service.rejectDomainTransferFromAnotherAwsAccount(params).promise().toFuture
    @inline def renewDomainFuture(params: RenewDomainRequest): Future[RenewDomainResponse] = service.renewDomain(params).promise().toFuture
    @inline def resendContactReachabilityEmailFuture(params: ResendContactReachabilityEmailRequest): Future[ResendContactReachabilityEmailResponse] = service.resendContactReachabilityEmail(params).promise().toFuture
    @inline def retrieveDomainAuthCodeFuture(params: RetrieveDomainAuthCodeRequest): Future[RetrieveDomainAuthCodeResponse] = service.retrieveDomainAuthCode(params).promise().toFuture
    @inline def transferDomainFuture(params: TransferDomainRequest): Future[TransferDomainResponse] = service.transferDomain(params).promise().toFuture
    @inline def transferDomainToAnotherAwsAccountFuture(params: TransferDomainToAnotherAwsAccountRequest): Future[TransferDomainToAnotherAwsAccountResponse] = service.transferDomainToAnotherAwsAccount(params).promise().toFuture
    @inline def updateDomainContactFuture(params: UpdateDomainContactRequest): Future[UpdateDomainContactResponse] = service.updateDomainContact(params).promise().toFuture
    @inline def updateDomainContactPrivacyFuture(params: UpdateDomainContactPrivacyRequest): Future[UpdateDomainContactPrivacyResponse] = service.updateDomainContactPrivacy(params).promise().toFuture
    @inline def updateDomainNameserversFuture(params: UpdateDomainNameserversRequest): Future[UpdateDomainNameserversResponse] = service.updateDomainNameservers(params).promise().toFuture
    @inline def updateTagsForDomainFuture(params: UpdateTagsForDomainRequest): Future[UpdateTagsForDomainResponse] = service.updateTagsForDomain(params).promise().toFuture
    @inline def viewBillingFuture(params: ViewBillingRequest): Future[ViewBillingResponse] = service.viewBilling(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/route53domains", JSImport.Namespace, "AWS.Route53Domains")
  class Route53Domains() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptDomainTransferFromAnotherAwsAccount(params: AcceptDomainTransferFromAnotherAwsAccountRequest): Request[AcceptDomainTransferFromAnotherAwsAccountResponse] = js.native
    def cancelDomainTransferToAnotherAwsAccount(params: CancelDomainTransferToAnotherAwsAccountRequest): Request[CancelDomainTransferToAnotherAwsAccountResponse] = js.native
    def checkDomainAvailability(params: CheckDomainAvailabilityRequest): Request[CheckDomainAvailabilityResponse] = js.native
    def checkDomainTransferability(params: CheckDomainTransferabilityRequest): Request[CheckDomainTransferabilityResponse] = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResponse] = js.native
    def deleteTagsForDomain(params: DeleteTagsForDomainRequest): Request[DeleteTagsForDomainResponse] = js.native
    def disableDomainAutoRenew(params: DisableDomainAutoRenewRequest): Request[DisableDomainAutoRenewResponse] = js.native
    def disableDomainTransferLock(params: DisableDomainTransferLockRequest): Request[DisableDomainTransferLockResponse] = js.native
    def enableDomainAutoRenew(params: EnableDomainAutoRenewRequest): Request[EnableDomainAutoRenewResponse] = js.native
    def enableDomainTransferLock(params: EnableDomainTransferLockRequest): Request[EnableDomainTransferLockResponse] = js.native
    def getContactReachabilityStatus(params: GetContactReachabilityStatusRequest): Request[GetContactReachabilityStatusResponse] = js.native
    def getDomainDetail(params: GetDomainDetailRequest): Request[GetDomainDetailResponse] = js.native
    def getDomainSuggestions(params: GetDomainSuggestionsRequest): Request[GetDomainSuggestionsResponse] = js.native
    def getOperationDetail(params: GetOperationDetailRequest): Request[GetOperationDetailResponse] = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse] = js.native
    def listOperations(params: ListOperationsRequest): Request[ListOperationsResponse] = js.native
    def listPrices(params: ListPricesRequest): Request[ListPricesResponse] = js.native
    def listTagsForDomain(params: ListTagsForDomainRequest): Request[ListTagsForDomainResponse] = js.native
    def registerDomain(params: RegisterDomainRequest): Request[RegisterDomainResponse] = js.native
    def rejectDomainTransferFromAnotherAwsAccount(params: RejectDomainTransferFromAnotherAwsAccountRequest): Request[RejectDomainTransferFromAnotherAwsAccountResponse] = js.native
    def renewDomain(params: RenewDomainRequest): Request[RenewDomainResponse] = js.native
    def resendContactReachabilityEmail(params: ResendContactReachabilityEmailRequest): Request[ResendContactReachabilityEmailResponse] = js.native
    def retrieveDomainAuthCode(params: RetrieveDomainAuthCodeRequest): Request[RetrieveDomainAuthCodeResponse] = js.native
    def transferDomain(params: TransferDomainRequest): Request[TransferDomainResponse] = js.native
    def transferDomainToAnotherAwsAccount(params: TransferDomainToAnotherAwsAccountRequest): Request[TransferDomainToAnotherAwsAccountResponse] = js.native
    def updateDomainContact(params: UpdateDomainContactRequest): Request[UpdateDomainContactResponse] = js.native
    def updateDomainContactPrivacy(params: UpdateDomainContactPrivacyRequest): Request[UpdateDomainContactPrivacyResponse] = js.native
    def updateDomainNameservers(params: UpdateDomainNameserversRequest): Request[UpdateDomainNameserversResponse] = js.native
    def updateTagsForDomain(params: UpdateTagsForDomainRequest): Request[UpdateTagsForDomainResponse] = js.native
    def viewBilling(params: ViewBillingRequest): Request[ViewBillingResponse] = js.native
  }
  object Route53Domains {
    @inline implicit def toOps(service: Route53Domains): Route53DomainsOps = {
      new Route53DomainsOps(service)
    }
  }

  /** The AcceptDomainTransferFromAnotherAwsAccount request includes the following elements.
    */
  @js.native
  trait AcceptDomainTransferFromAnotherAwsAccountRequest extends js.Object {
    var DomainName: DomainName
    var Password: String
  }

  object AcceptDomainTransferFromAnotherAwsAccountRequest {
    @inline
    def apply(
        DomainName: DomainName,
        Password: String
    ): AcceptDomainTransferFromAnotherAwsAccountRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcceptDomainTransferFromAnotherAwsAccountRequest]
    }
  }

  /** The AcceptDomainTransferFromAnotherAwsAccount response includes the following element.
    */
  @js.native
  trait AcceptDomainTransferFromAnotherAwsAccountResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object AcceptDomainTransferFromAnotherAwsAccountResponse {
    @inline
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): AcceptDomainTransferFromAnotherAwsAccountResponse = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptDomainTransferFromAnotherAwsAccountResponse]
    }
  }

  /** Information for one billing record.
    */
  @js.native
  trait BillingRecord extends js.Object {
    var BillDate: js.UndefOr[Timestamp]
    var DomainName: js.UndefOr[DomainName]
    var InvoiceId: js.UndefOr[InvoiceId]
    var Operation: js.UndefOr[OperationType]
    var Price: js.UndefOr[Price]
  }

  object BillingRecord {
    @inline
    def apply(
        BillDate: js.UndefOr[Timestamp] = js.undefined,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        InvoiceId: js.UndefOr[InvoiceId] = js.undefined,
        Operation: js.UndefOr[OperationType] = js.undefined,
        Price: js.UndefOr[Price] = js.undefined
    ): BillingRecord = {
      val __obj = js.Dynamic.literal()
      BillDate.foreach(__v => __obj.updateDynamic("BillDate")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      InvoiceId.foreach(__v => __obj.updateDynamic("InvoiceId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Price.foreach(__v => __obj.updateDynamic("Price")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BillingRecord]
    }
  }

  /** The CancelDomainTransferToAnotherAwsAccount request includes the following element.
    */
  @js.native
  trait CancelDomainTransferToAnotherAwsAccountRequest extends js.Object {
    var DomainName: DomainName
  }

  object CancelDomainTransferToAnotherAwsAccountRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): CancelDomainTransferToAnotherAwsAccountRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelDomainTransferToAnotherAwsAccountRequest]
    }
  }

  /** The <code>CancelDomainTransferToAnotherAwsAccount</code> response includes the following element.
    */
  @js.native
  trait CancelDomainTransferToAnotherAwsAccountResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object CancelDomainTransferToAnotherAwsAccountResponse {
    @inline
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): CancelDomainTransferToAnotherAwsAccountResponse = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelDomainTransferToAnotherAwsAccountResponse]
    }
  }

  /** The CheckDomainAvailability request contains the following elements.
    */
  @js.native
  trait CheckDomainAvailabilityRequest extends js.Object {
    var DomainName: DomainName
    var IdnLangCode: js.UndefOr[LangCode]
  }

  object CheckDomainAvailabilityRequest {
    @inline
    def apply(
        DomainName: DomainName,
        IdnLangCode: js.UndefOr[LangCode] = js.undefined
    ): CheckDomainAvailabilityRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      IdnLangCode.foreach(__v => __obj.updateDynamic("IdnLangCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckDomainAvailabilityRequest]
    }
  }

  /** The CheckDomainAvailability response includes the following elements.
    */
  @js.native
  trait CheckDomainAvailabilityResponse extends js.Object {
    var Availability: DomainAvailability
  }

  object CheckDomainAvailabilityResponse {
    @inline
    def apply(
        Availability: DomainAvailability
    ): CheckDomainAvailabilityResponse = {
      val __obj = js.Dynamic.literal(
        "Availability" -> Availability.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CheckDomainAvailabilityResponse]
    }
  }

  /** The CheckDomainTransferability request contains the following elements.
    */
  @js.native
  trait CheckDomainTransferabilityRequest extends js.Object {
    var DomainName: DomainName
    var AuthCode: js.UndefOr[DomainAuthCode]
  }

  object CheckDomainTransferabilityRequest {
    @inline
    def apply(
        DomainName: DomainName,
        AuthCode: js.UndefOr[DomainAuthCode] = js.undefined
    ): CheckDomainTransferabilityRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AuthCode.foreach(__v => __obj.updateDynamic("AuthCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckDomainTransferabilityRequest]
    }
  }

  /** The CheckDomainTransferability response includes the following elements.
    */
  @js.native
  trait CheckDomainTransferabilityResponse extends js.Object {
    var Transferability: DomainTransferability
  }

  object CheckDomainTransferabilityResponse {
    @inline
    def apply(
        Transferability: DomainTransferability
    ): CheckDomainTransferabilityResponse = {
      val __obj = js.Dynamic.literal(
        "Transferability" -> Transferability.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CheckDomainTransferabilityResponse]
    }
  }

  /** ContactDetail includes the following elements.
    */
  @js.native
  trait ContactDetail extends js.Object {
    var AddressLine1: js.UndefOr[AddressLine]
    var AddressLine2: js.UndefOr[AddressLine]
    var City: js.UndefOr[City]
    var ContactType: js.UndefOr[ContactType]
    var CountryCode: js.UndefOr[CountryCode]
    var Email: js.UndefOr[Email]
    var ExtraParams: js.UndefOr[ExtraParamList]
    var Fax: js.UndefOr[ContactNumber]
    var FirstName: js.UndefOr[ContactName]
    var LastName: js.UndefOr[ContactName]
    var OrganizationName: js.UndefOr[ContactName]
    var PhoneNumber: js.UndefOr[ContactNumber]
    var State: js.UndefOr[State]
    var ZipCode: js.UndefOr[ZipCode]
  }

  object ContactDetail {
    @inline
    def apply(
        AddressLine1: js.UndefOr[AddressLine] = js.undefined,
        AddressLine2: js.UndefOr[AddressLine] = js.undefined,
        City: js.UndefOr[City] = js.undefined,
        ContactType: js.UndefOr[ContactType] = js.undefined,
        CountryCode: js.UndefOr[CountryCode] = js.undefined,
        Email: js.UndefOr[Email] = js.undefined,
        ExtraParams: js.UndefOr[ExtraParamList] = js.undefined,
        Fax: js.UndefOr[ContactNumber] = js.undefined,
        FirstName: js.UndefOr[ContactName] = js.undefined,
        LastName: js.UndefOr[ContactName] = js.undefined,
        OrganizationName: js.UndefOr[ContactName] = js.undefined,
        PhoneNumber: js.UndefOr[ContactNumber] = js.undefined,
        State: js.UndefOr[State] = js.undefined,
        ZipCode: js.UndefOr[ZipCode] = js.undefined
    ): ContactDetail = {
      val __obj = js.Dynamic.literal()
      AddressLine1.foreach(__v => __obj.updateDynamic("AddressLine1")(__v.asInstanceOf[js.Any]))
      AddressLine2.foreach(__v => __obj.updateDynamic("AddressLine2")(__v.asInstanceOf[js.Any]))
      City.foreach(__v => __obj.updateDynamic("City")(__v.asInstanceOf[js.Any]))
      ContactType.foreach(__v => __obj.updateDynamic("ContactType")(__v.asInstanceOf[js.Any]))
      CountryCode.foreach(__v => __obj.updateDynamic("CountryCode")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      ExtraParams.foreach(__v => __obj.updateDynamic("ExtraParams")(__v.asInstanceOf[js.Any]))
      Fax.foreach(__v => __obj.updateDynamic("Fax")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      OrganizationName.foreach(__v => __obj.updateDynamic("OrganizationName")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      ZipCode.foreach(__v => __obj.updateDynamic("ZipCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactDetail]
    }
  }

  @js.native
  trait DeleteDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object DeleteDomainRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): DeleteDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDomainRequest]
    }
  }

  @js.native
  trait DeleteDomainResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object DeleteDomainResponse {
    @inline
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): DeleteDomainResponse = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDomainResponse]
    }
  }

  /** The DeleteTagsForDomainRequest includes the following elements.
    */
  @js.native
  trait DeleteTagsForDomainRequest extends js.Object {
    var DomainName: DomainName
    var TagsToDelete: TagKeyList
  }

  object DeleteTagsForDomainRequest {
    @inline
    def apply(
        DomainName: DomainName,
        TagsToDelete: TagKeyList
    ): DeleteTagsForDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "TagsToDelete" -> TagsToDelete.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTagsForDomainRequest]
    }
  }

  @js.native
  trait DeleteTagsForDomainResponse extends js.Object

  object DeleteTagsForDomainResponse {
    @inline
    def apply(): DeleteTagsForDomainResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTagsForDomainResponse]
    }
  }

  @js.native
  trait DisableDomainAutoRenewRequest extends js.Object {
    var DomainName: DomainName
  }

  object DisableDomainAutoRenewRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): DisableDomainAutoRenewRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableDomainAutoRenewRequest]
    }
  }

  @js.native
  trait DisableDomainAutoRenewResponse extends js.Object

  object DisableDomainAutoRenewResponse {
    @inline
    def apply(): DisableDomainAutoRenewResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableDomainAutoRenewResponse]
    }
  }

  /** The DisableDomainTransferLock request includes the following element.
    */
  @js.native
  trait DisableDomainTransferLockRequest extends js.Object {
    var DomainName: DomainName
  }

  object DisableDomainTransferLockRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): DisableDomainTransferLockRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableDomainTransferLockRequest]
    }
  }

  /** The DisableDomainTransferLock response includes the following element.
    */
  @js.native
  trait DisableDomainTransferLockResponse extends js.Object {
    var OperationId: OperationId
  }

  object DisableDomainTransferLockResponse {
    @inline
    def apply(
        OperationId: OperationId
    ): DisableDomainTransferLockResponse = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableDomainTransferLockResponse]
    }
  }

  /** Information about the domain price associated with a TLD.
    */
  @js.native
  trait DomainPrice extends js.Object {
    var ChangeOwnershipPrice: js.UndefOr[PriceWithCurrency]
    var Name: js.UndefOr[DomainPriceName]
    var RegistrationPrice: js.UndefOr[PriceWithCurrency]
    var RenewalPrice: js.UndefOr[PriceWithCurrency]
    var RestorationPrice: js.UndefOr[PriceWithCurrency]
    var TransferPrice: js.UndefOr[PriceWithCurrency]
  }

  object DomainPrice {
    @inline
    def apply(
        ChangeOwnershipPrice: js.UndefOr[PriceWithCurrency] = js.undefined,
        Name: js.UndefOr[DomainPriceName] = js.undefined,
        RegistrationPrice: js.UndefOr[PriceWithCurrency] = js.undefined,
        RenewalPrice: js.UndefOr[PriceWithCurrency] = js.undefined,
        RestorationPrice: js.UndefOr[PriceWithCurrency] = js.undefined,
        TransferPrice: js.UndefOr[PriceWithCurrency] = js.undefined
    ): DomainPrice = {
      val __obj = js.Dynamic.literal()
      ChangeOwnershipPrice.foreach(__v => __obj.updateDynamic("ChangeOwnershipPrice")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RegistrationPrice.foreach(__v => __obj.updateDynamic("RegistrationPrice")(__v.asInstanceOf[js.Any]))
      RenewalPrice.foreach(__v => __obj.updateDynamic("RenewalPrice")(__v.asInstanceOf[js.Any]))
      RestorationPrice.foreach(__v => __obj.updateDynamic("RestorationPrice")(__v.asInstanceOf[js.Any]))
      TransferPrice.foreach(__v => __obj.updateDynamic("TransferPrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainPrice]
    }
  }

  /** Information about one suggested domain name.
    */
  @js.native
  trait DomainSuggestion extends js.Object {
    var Availability: js.UndefOr[String]
    var DomainName: js.UndefOr[DomainName]
  }

  object DomainSuggestion {
    @inline
    def apply(
        Availability: js.UndefOr[String] = js.undefined,
        DomainName: js.UndefOr[DomainName] = js.undefined
    ): DomainSuggestion = {
      val __obj = js.Dynamic.literal()
      Availability.foreach(__v => __obj.updateDynamic("Availability")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainSuggestion]
    }
  }

  /** Summary information about one domain.
    */
  @js.native
  trait DomainSummary extends js.Object {
    var DomainName: DomainName
    var AutoRenew: js.UndefOr[Boolean]
    var Expiry: js.UndefOr[Timestamp]
    var TransferLock: js.UndefOr[Boolean]
  }

  object DomainSummary {
    @inline
    def apply(
        DomainName: DomainName,
        AutoRenew: js.UndefOr[Boolean] = js.undefined,
        Expiry: js.UndefOr[Timestamp] = js.undefined,
        TransferLock: js.UndefOr[Boolean] = js.undefined
    ): DomainSummary = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AutoRenew.foreach(__v => __obj.updateDynamic("AutoRenew")(__v.asInstanceOf[js.Any]))
      Expiry.foreach(__v => __obj.updateDynamic("Expiry")(__v.asInstanceOf[js.Any]))
      TransferLock.foreach(__v => __obj.updateDynamic("TransferLock")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainSummary]
    }
  }

  /** A complex type that contains information about whether the specified domain can be transferred to Route 53.
    */
  @js.native
  trait DomainTransferability extends js.Object {
    var Transferable: js.UndefOr[Transferable]
  }

  object DomainTransferability {
    @inline
    def apply(
        Transferable: js.UndefOr[Transferable] = js.undefined
    ): DomainTransferability = {
      val __obj = js.Dynamic.literal()
      Transferable.foreach(__v => __obj.updateDynamic("Transferable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainTransferability]
    }
  }

  @js.native
  trait EnableDomainAutoRenewRequest extends js.Object {
    var DomainName: DomainName
  }

  object EnableDomainAutoRenewRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): EnableDomainAutoRenewRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableDomainAutoRenewRequest]
    }
  }

  @js.native
  trait EnableDomainAutoRenewResponse extends js.Object

  object EnableDomainAutoRenewResponse {
    @inline
    def apply(): EnableDomainAutoRenewResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableDomainAutoRenewResponse]
    }
  }

  /** A request to set the transfer lock for the specified domain.
    */
  @js.native
  trait EnableDomainTransferLockRequest extends js.Object {
    var DomainName: DomainName
  }

  object EnableDomainTransferLockRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): EnableDomainTransferLockRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableDomainTransferLockRequest]
    }
  }

  /** The EnableDomainTransferLock response includes the following elements.
    */
  @js.native
  trait EnableDomainTransferLockResponse extends js.Object {
    var OperationId: OperationId
  }

  object EnableDomainTransferLockResponse {
    @inline
    def apply(
        OperationId: OperationId
    ): EnableDomainTransferLockResponse = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableDomainTransferLockResponse]
    }
  }

  /** ExtraParam includes the following elements.
    */
  @js.native
  trait ExtraParam extends js.Object {
    var Name: ExtraParamName
    var Value: ExtraParamValue
  }

  object ExtraParam {
    @inline
    def apply(
        Name: ExtraParamName,
        Value: ExtraParamValue
    ): ExtraParam = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExtraParam]
    }
  }

  /** Information for the filtering of a list of domains returned by [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains__ListDomains.html|ListDomains]].
    */
  @js.native
  trait FilterCondition extends js.Object {
    var Name: ListDomainsAttributeName
    var Operator: Operator
    var Values: Values
  }

  object FilterCondition {
    @inline
    def apply(
        Name: ListDomainsAttributeName,
        Operator: Operator,
        Values: Values
    ): FilterCondition = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Operator" -> Operator.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FilterCondition]
    }
  }

  @js.native
  trait GetContactReachabilityStatusRequest extends js.Object {
    var domainName: js.UndefOr[DomainName]
  }

  object GetContactReachabilityStatusRequest {
    @inline
    def apply(
        domainName: js.UndefOr[DomainName] = js.undefined
    ): GetContactReachabilityStatusRequest = {
      val __obj = js.Dynamic.literal()
      domainName.foreach(__v => __obj.updateDynamic("domainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactReachabilityStatusRequest]
    }
  }

  @js.native
  trait GetContactReachabilityStatusResponse extends js.Object {
    var domainName: js.UndefOr[DomainName]
    var status: js.UndefOr[ReachabilityStatus]
  }

  object GetContactReachabilityStatusResponse {
    @inline
    def apply(
        domainName: js.UndefOr[DomainName] = js.undefined,
        status: js.UndefOr[ReachabilityStatus] = js.undefined
    ): GetContactReachabilityStatusResponse = {
      val __obj = js.Dynamic.literal()
      domainName.foreach(__v => __obj.updateDynamic("domainName")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactReachabilityStatusResponse]
    }
  }

  /** The GetDomainDetail request includes the following element.
    */
  @js.native
  trait GetDomainDetailRequest extends js.Object {
    var DomainName: DomainName
  }

  object GetDomainDetailRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): GetDomainDetailRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDomainDetailRequest]
    }
  }

  /** The GetDomainDetail response includes the following elements.
    */
  @js.native
  trait GetDomainDetailResponse extends js.Object {
    var AdminContact: ContactDetail
    var DomainName: DomainName
    var Nameservers: NameserverList
    var RegistrantContact: ContactDetail
    var TechContact: ContactDetail
    var AbuseContactEmail: js.UndefOr[Email]
    var AbuseContactPhone: js.UndefOr[ContactNumber]
    var AdminPrivacy: js.UndefOr[Boolean]
    var AutoRenew: js.UndefOr[Boolean]
    var CreationDate: js.UndefOr[Timestamp]
    var DnsSec: js.UndefOr[DNSSec]
    var ExpirationDate: js.UndefOr[Timestamp]
    var RegistrantPrivacy: js.UndefOr[Boolean]
    var RegistrarName: js.UndefOr[RegistrarName]
    var RegistrarUrl: js.UndefOr[RegistrarUrl]
    var RegistryDomainId: js.UndefOr[RegistryDomainId]
    var Reseller: js.UndefOr[Reseller]
    var StatusList: js.UndefOr[DomainStatusList]
    var TechPrivacy: js.UndefOr[Boolean]
    var UpdatedDate: js.UndefOr[Timestamp]
    var WhoIsServer: js.UndefOr[RegistrarWhoIsServer]
  }

  object GetDomainDetailResponse {
    @inline
    def apply(
        AdminContact: ContactDetail,
        DomainName: DomainName,
        Nameservers: NameserverList,
        RegistrantContact: ContactDetail,
        TechContact: ContactDetail,
        AbuseContactEmail: js.UndefOr[Email] = js.undefined,
        AbuseContactPhone: js.UndefOr[ContactNumber] = js.undefined,
        AdminPrivacy: js.UndefOr[Boolean] = js.undefined,
        AutoRenew: js.UndefOr[Boolean] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        DnsSec: js.UndefOr[DNSSec] = js.undefined,
        ExpirationDate: js.UndefOr[Timestamp] = js.undefined,
        RegistrantPrivacy: js.UndefOr[Boolean] = js.undefined,
        RegistrarName: js.UndefOr[RegistrarName] = js.undefined,
        RegistrarUrl: js.UndefOr[RegistrarUrl] = js.undefined,
        RegistryDomainId: js.UndefOr[RegistryDomainId] = js.undefined,
        Reseller: js.UndefOr[Reseller] = js.undefined,
        StatusList: js.UndefOr[DomainStatusList] = js.undefined,
        TechPrivacy: js.UndefOr[Boolean] = js.undefined,
        UpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        WhoIsServer: js.UndefOr[RegistrarWhoIsServer] = js.undefined
    ): GetDomainDetailResponse = {
      val __obj = js.Dynamic.literal(
        "AdminContact" -> AdminContact.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Nameservers" -> Nameservers.asInstanceOf[js.Any],
        "RegistrantContact" -> RegistrantContact.asInstanceOf[js.Any],
        "TechContact" -> TechContact.asInstanceOf[js.Any]
      )

      AbuseContactEmail.foreach(__v => __obj.updateDynamic("AbuseContactEmail")(__v.asInstanceOf[js.Any]))
      AbuseContactPhone.foreach(__v => __obj.updateDynamic("AbuseContactPhone")(__v.asInstanceOf[js.Any]))
      AdminPrivacy.foreach(__v => __obj.updateDynamic("AdminPrivacy")(__v.asInstanceOf[js.Any]))
      AutoRenew.foreach(__v => __obj.updateDynamic("AutoRenew")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      DnsSec.foreach(__v => __obj.updateDynamic("DnsSec")(__v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.updateDynamic("ExpirationDate")(__v.asInstanceOf[js.Any]))
      RegistrantPrivacy.foreach(__v => __obj.updateDynamic("RegistrantPrivacy")(__v.asInstanceOf[js.Any]))
      RegistrarName.foreach(__v => __obj.updateDynamic("RegistrarName")(__v.asInstanceOf[js.Any]))
      RegistrarUrl.foreach(__v => __obj.updateDynamic("RegistrarUrl")(__v.asInstanceOf[js.Any]))
      RegistryDomainId.foreach(__v => __obj.updateDynamic("RegistryDomainId")(__v.asInstanceOf[js.Any]))
      Reseller.foreach(__v => __obj.updateDynamic("Reseller")(__v.asInstanceOf[js.Any]))
      StatusList.foreach(__v => __obj.updateDynamic("StatusList")(__v.asInstanceOf[js.Any]))
      TechPrivacy.foreach(__v => __obj.updateDynamic("TechPrivacy")(__v.asInstanceOf[js.Any]))
      UpdatedDate.foreach(__v => __obj.updateDynamic("UpdatedDate")(__v.asInstanceOf[js.Any]))
      WhoIsServer.foreach(__v => __obj.updateDynamic("WhoIsServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainDetailResponse]
    }
  }

  @js.native
  trait GetDomainSuggestionsRequest extends js.Object {
    var DomainName: DomainName
    var OnlyAvailable: Boolean
    var SuggestionCount: Int
  }

  object GetDomainSuggestionsRequest {
    @inline
    def apply(
        DomainName: DomainName,
        OnlyAvailable: Boolean,
        SuggestionCount: Int
    ): GetDomainSuggestionsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "OnlyAvailable" -> OnlyAvailable.asInstanceOf[js.Any],
        "SuggestionCount" -> SuggestionCount.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDomainSuggestionsRequest]
    }
  }

  @js.native
  trait GetDomainSuggestionsResponse extends js.Object {
    var SuggestionsList: js.UndefOr[DomainSuggestionsList]
  }

  object GetDomainSuggestionsResponse {
    @inline
    def apply(
        SuggestionsList: js.UndefOr[DomainSuggestionsList] = js.undefined
    ): GetDomainSuggestionsResponse = {
      val __obj = js.Dynamic.literal()
      SuggestionsList.foreach(__v => __obj.updateDynamic("SuggestionsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainSuggestionsResponse]
    }
  }

  /** The [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html|GetOperationDetail]] request includes the following element.
    */
  @js.native
  trait GetOperationDetailRequest extends js.Object {
    var OperationId: OperationId
  }

  object GetOperationDetailRequest {
    @inline
    def apply(
        OperationId: OperationId
    ): GetOperationDetailRequest = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetOperationDetailRequest]
    }
  }

  /** The GetOperationDetail response includes the following elements.
    */
  @js.native
  trait GetOperationDetailResponse extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var Message: js.UndefOr[ErrorMessage]
    var OperationId: js.UndefOr[OperationId]
    var Status: js.UndefOr[OperationStatus]
    var SubmittedDate: js.UndefOr[Timestamp]
    var Type: js.UndefOr[OperationType]
  }

  object GetOperationDetailResponse {
    @inline
    def apply(
        DomainName: js.UndefOr[DomainName] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        OperationId: js.UndefOr[OperationId] = js.undefined,
        Status: js.UndefOr[OperationStatus] = js.undefined,
        SubmittedDate: js.UndefOr[Timestamp] = js.undefined,
        Type: js.UndefOr[OperationType] = js.undefined
    ): GetOperationDetailResponse = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubmittedDate.foreach(__v => __obj.updateDynamic("SubmittedDate")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOperationDetailResponse]
    }
  }

  /** The ListDomains request includes the following elements.
    */
  @js.native
  trait ListDomainsRequest extends js.Object {
    var FilterConditions: js.UndefOr[FilterConditions]
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
    var SortCondition: js.UndefOr[SortCondition]
  }

  object ListDomainsRequest {
    @inline
    def apply(
        FilterConditions: js.UndefOr[FilterConditions] = js.undefined,
        Marker: js.UndefOr[PageMarker] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        SortCondition: js.UndefOr[SortCondition] = js.undefined
    ): ListDomainsRequest = {
      val __obj = js.Dynamic.literal()
      FilterConditions.foreach(__v => __obj.updateDynamic("FilterConditions")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      SortCondition.foreach(__v => __obj.updateDynamic("SortCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsRequest]
    }
  }

  /** The ListDomains response includes the following elements.
    */
  @js.native
  trait ListDomainsResponse extends js.Object {
    var Domains: DomainSummaryList
    var NextPageMarker: js.UndefOr[PageMarker]
  }

  object ListDomainsResponse {
    @inline
    def apply(
        Domains: DomainSummaryList,
        NextPageMarker: js.UndefOr[PageMarker] = js.undefined
    ): ListDomainsResponse = {
      val __obj = js.Dynamic.literal(
        "Domains" -> Domains.asInstanceOf[js.Any]
      )

      NextPageMarker.foreach(__v => __obj.updateDynamic("NextPageMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsResponse]
    }
  }

  /** The ListOperations request includes the following elements.
    */
  @js.native
  trait ListOperationsRequest extends js.Object {
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
    var SubmittedSince: js.UndefOr[Timestamp]
  }

  object ListOperationsRequest {
    @inline
    def apply(
        Marker: js.UndefOr[PageMarker] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        SubmittedSince: js.UndefOr[Timestamp] = js.undefined
    ): ListOperationsRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      SubmittedSince.foreach(__v => __obj.updateDynamic("SubmittedSince")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOperationsRequest]
    }
  }

  /** The ListOperations response includes the following elements.
    */
  @js.native
  trait ListOperationsResponse extends js.Object {
    var Operations: OperationSummaryList
    var NextPageMarker: js.UndefOr[PageMarker]
  }

  object ListOperationsResponse {
    @inline
    def apply(
        Operations: OperationSummaryList,
        NextPageMarker: js.UndefOr[PageMarker] = js.undefined
    ): ListOperationsResponse = {
      val __obj = js.Dynamic.literal(
        "Operations" -> Operations.asInstanceOf[js.Any]
      )

      NextPageMarker.foreach(__v => __obj.updateDynamic("NextPageMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOperationsResponse]
    }
  }

  @js.native
  trait ListPricesRequest extends js.Object {
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
    var Tld: js.UndefOr[TldName]
  }

  object ListPricesRequest {
    @inline
    def apply(
        Marker: js.UndefOr[PageMarker] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        Tld: js.UndefOr[TldName] = js.undefined
    ): ListPricesRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      Tld.foreach(__v => __obj.updateDynamic("Tld")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPricesRequest]
    }
  }

  @js.native
  trait ListPricesResponse extends js.Object {
    var Prices: DomainPriceList
    var NextPageMarker: js.UndefOr[PageMarker]
  }

  object ListPricesResponse {
    @inline
    def apply(
        Prices: DomainPriceList,
        NextPageMarker: js.UndefOr[PageMarker] = js.undefined
    ): ListPricesResponse = {
      val __obj = js.Dynamic.literal(
        "Prices" -> Prices.asInstanceOf[js.Any]
      )

      NextPageMarker.foreach(__v => __obj.updateDynamic("NextPageMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPricesResponse]
    }
  }

  /** The ListTagsForDomainRequest includes the following elements.
    */
  @js.native
  trait ListTagsForDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object ListTagsForDomainRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): ListTagsForDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForDomainRequest]
    }
  }

  /** The ListTagsForDomain response includes the following elements.
    */
  @js.native
  trait ListTagsForDomainResponse extends js.Object {
    var TagList: TagList
  }

  object ListTagsForDomainResponse {
    @inline
    def apply(
        TagList: TagList
    ): ListTagsForDomainResponse = {
      val __obj = js.Dynamic.literal(
        "TagList" -> TagList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForDomainResponse]
    }
  }

  /** Nameserver includes the following elements.
    */
  @js.native
  trait Nameserver extends js.Object {
    var Name: HostName
    var GlueIps: js.UndefOr[GlueIpList]
  }

  object Nameserver {
    @inline
    def apply(
        Name: HostName,
        GlueIps: js.UndefOr[GlueIpList] = js.undefined
    ): Nameserver = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      GlueIps.foreach(__v => __obj.updateDynamic("GlueIps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Nameserver]
    }
  }

  /** OperationSummary includes the following elements.
    */
  @js.native
  trait OperationSummary extends js.Object {
    var OperationId: OperationId
    var Status: OperationStatus
    var SubmittedDate: Timestamp
    var Type: OperationType
  }

  object OperationSummary {
    @inline
    def apply(
        OperationId: OperationId,
        Status: OperationStatus,
        SubmittedDate: Timestamp,
        Type: OperationType
    ): OperationSummary = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "SubmittedDate" -> SubmittedDate.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OperationSummary]
    }
  }

  /** Currency-specific price information.
    */
  @js.native
  trait PriceWithCurrency extends js.Object {
    var Currency: Currency
    var Price: Price
  }

  object PriceWithCurrency {
    @inline
    def apply(
        Currency: Currency,
        Price: Price
    ): PriceWithCurrency = {
      val __obj = js.Dynamic.literal(
        "Currency" -> Currency.asInstanceOf[js.Any],
        "Price" -> Price.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PriceWithCurrency]
    }
  }

  /** The RegisterDomain request includes the following elements.
    */
  @js.native
  trait RegisterDomainRequest extends js.Object {
    var AdminContact: ContactDetail
    var DomainName: DomainName
    var DurationInYears: DurationInYears
    var RegistrantContact: ContactDetail
    var TechContact: ContactDetail
    var AutoRenew: js.UndefOr[Boolean]
    var IdnLangCode: js.UndefOr[LangCode]
    var PrivacyProtectAdminContact: js.UndefOr[Boolean]
    var PrivacyProtectRegistrantContact: js.UndefOr[Boolean]
    var PrivacyProtectTechContact: js.UndefOr[Boolean]
  }

  object RegisterDomainRequest {
    @inline
    def apply(
        AdminContact: ContactDetail,
        DomainName: DomainName,
        DurationInYears: DurationInYears,
        RegistrantContact: ContactDetail,
        TechContact: ContactDetail,
        AutoRenew: js.UndefOr[Boolean] = js.undefined,
        IdnLangCode: js.UndefOr[LangCode] = js.undefined,
        PrivacyProtectAdminContact: js.UndefOr[Boolean] = js.undefined,
        PrivacyProtectRegistrantContact: js.UndefOr[Boolean] = js.undefined,
        PrivacyProtectTechContact: js.UndefOr[Boolean] = js.undefined
    ): RegisterDomainRequest = {
      val __obj = js.Dynamic.literal(
        "AdminContact" -> AdminContact.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "DurationInYears" -> DurationInYears.asInstanceOf[js.Any],
        "RegistrantContact" -> RegistrantContact.asInstanceOf[js.Any],
        "TechContact" -> TechContact.asInstanceOf[js.Any]
      )

      AutoRenew.foreach(__v => __obj.updateDynamic("AutoRenew")(__v.asInstanceOf[js.Any]))
      IdnLangCode.foreach(__v => __obj.updateDynamic("IdnLangCode")(__v.asInstanceOf[js.Any]))
      PrivacyProtectAdminContact.foreach(__v => __obj.updateDynamic("PrivacyProtectAdminContact")(__v.asInstanceOf[js.Any]))
      PrivacyProtectRegistrantContact.foreach(__v => __obj.updateDynamic("PrivacyProtectRegistrantContact")(__v.asInstanceOf[js.Any]))
      PrivacyProtectTechContact.foreach(__v => __obj.updateDynamic("PrivacyProtectTechContact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterDomainRequest]
    }
  }

  /** The RegisterDomain response includes the following element.
    */
  @js.native
  trait RegisterDomainResponse extends js.Object {
    var OperationId: OperationId
  }

  object RegisterDomainResponse {
    @inline
    def apply(
        OperationId: OperationId
    ): RegisterDomainResponse = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisterDomainResponse]
    }
  }

  /** The RejectDomainTransferFromAnotherAwsAccount request includes the following element.
    */
  @js.native
  trait RejectDomainTransferFromAnotherAwsAccountRequest extends js.Object {
    var DomainName: DomainName
  }

  object RejectDomainTransferFromAnotherAwsAccountRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): RejectDomainTransferFromAnotherAwsAccountRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RejectDomainTransferFromAnotherAwsAccountRequest]
    }
  }

  /** The RejectDomainTransferFromAnotherAwsAccount response includes the following element.
    */
  @js.native
  trait RejectDomainTransferFromAnotherAwsAccountResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object RejectDomainTransferFromAnotherAwsAccountResponse {
    @inline
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): RejectDomainTransferFromAnotherAwsAccountResponse = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RejectDomainTransferFromAnotherAwsAccountResponse]
    }
  }

  /** A <code>RenewDomain</code> request includes the number of years that you want to renew for and the current expiration year.
    */
  @js.native
  trait RenewDomainRequest extends js.Object {
    var CurrentExpiryYear: CurrentExpiryYear
    var DomainName: DomainName
    var DurationInYears: js.UndefOr[DurationInYears]
  }

  object RenewDomainRequest {
    @inline
    def apply(
        CurrentExpiryYear: CurrentExpiryYear,
        DomainName: DomainName,
        DurationInYears: js.UndefOr[DurationInYears] = js.undefined
    ): RenewDomainRequest = {
      val __obj = js.Dynamic.literal(
        "CurrentExpiryYear" -> CurrentExpiryYear.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      DurationInYears.foreach(__v => __obj.updateDynamic("DurationInYears")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RenewDomainRequest]
    }
  }

  @js.native
  trait RenewDomainResponse extends js.Object {
    var OperationId: OperationId
  }

  object RenewDomainResponse {
    @inline
    def apply(
        OperationId: OperationId
    ): RenewDomainResponse = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RenewDomainResponse]
    }
  }

  @js.native
  trait ResendContactReachabilityEmailRequest extends js.Object {
    var domainName: js.UndefOr[DomainName]
  }

  object ResendContactReachabilityEmailRequest {
    @inline
    def apply(
        domainName: js.UndefOr[DomainName] = js.undefined
    ): ResendContactReachabilityEmailRequest = {
      val __obj = js.Dynamic.literal()
      domainName.foreach(__v => __obj.updateDynamic("domainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResendContactReachabilityEmailRequest]
    }
  }

  @js.native
  trait ResendContactReachabilityEmailResponse extends js.Object {
    var domainName: js.UndefOr[DomainName]
    var emailAddress: js.UndefOr[Email]
    var isAlreadyVerified: js.UndefOr[Boolean]
  }

  object ResendContactReachabilityEmailResponse {
    @inline
    def apply(
        domainName: js.UndefOr[DomainName] = js.undefined,
        emailAddress: js.UndefOr[Email] = js.undefined,
        isAlreadyVerified: js.UndefOr[Boolean] = js.undefined
    ): ResendContactReachabilityEmailResponse = {
      val __obj = js.Dynamic.literal()
      domainName.foreach(__v => __obj.updateDynamic("domainName")(__v.asInstanceOf[js.Any]))
      emailAddress.foreach(__v => __obj.updateDynamic("emailAddress")(__v.asInstanceOf[js.Any]))
      isAlreadyVerified.foreach(__v => __obj.updateDynamic("isAlreadyVerified")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResendContactReachabilityEmailResponse]
    }
  }

  /** A request for the authorization code for the specified domain. To transfer a domain to another registrar, you provide this value to the new registrar.
    */
  @js.native
  trait RetrieveDomainAuthCodeRequest extends js.Object {
    var DomainName: DomainName
  }

  object RetrieveDomainAuthCodeRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): RetrieveDomainAuthCodeRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RetrieveDomainAuthCodeRequest]
    }
  }

  /** The RetrieveDomainAuthCode response includes the following element.
    */
  @js.native
  trait RetrieveDomainAuthCodeResponse extends js.Object {
    var AuthCode: DomainAuthCode
  }

  object RetrieveDomainAuthCodeResponse {
    @inline
    def apply(
        AuthCode: DomainAuthCode
    ): RetrieveDomainAuthCodeResponse = {
      val __obj = js.Dynamic.literal(
        "AuthCode" -> AuthCode.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RetrieveDomainAuthCodeResponse]
    }
  }

  /** Information for sorting a list of domains.
    */
  @js.native
  trait SortCondition extends js.Object {
    var Name: ListDomainsAttributeName
    var SortOrder: SortOrder
  }

  object SortCondition {
    @inline
    def apply(
        Name: ListDomainsAttributeName,
        SortOrder: SortOrder
    ): SortCondition = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SortOrder" -> SortOrder.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SortCondition]
    }
  }

  /** Each tag includes the following elements.
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

  /** The TransferDomain request includes the following elements.
    */
  @js.native
  trait TransferDomainRequest extends js.Object {
    var AdminContact: ContactDetail
    var DomainName: DomainName
    var DurationInYears: DurationInYears
    var RegistrantContact: ContactDetail
    var TechContact: ContactDetail
    var AuthCode: js.UndefOr[DomainAuthCode]
    var AutoRenew: js.UndefOr[Boolean]
    var IdnLangCode: js.UndefOr[LangCode]
    var Nameservers: js.UndefOr[NameserverList]
    var PrivacyProtectAdminContact: js.UndefOr[Boolean]
    var PrivacyProtectRegistrantContact: js.UndefOr[Boolean]
    var PrivacyProtectTechContact: js.UndefOr[Boolean]
  }

  object TransferDomainRequest {
    @inline
    def apply(
        AdminContact: ContactDetail,
        DomainName: DomainName,
        DurationInYears: DurationInYears,
        RegistrantContact: ContactDetail,
        TechContact: ContactDetail,
        AuthCode: js.UndefOr[DomainAuthCode] = js.undefined,
        AutoRenew: js.UndefOr[Boolean] = js.undefined,
        IdnLangCode: js.UndefOr[LangCode] = js.undefined,
        Nameservers: js.UndefOr[NameserverList] = js.undefined,
        PrivacyProtectAdminContact: js.UndefOr[Boolean] = js.undefined,
        PrivacyProtectRegistrantContact: js.UndefOr[Boolean] = js.undefined,
        PrivacyProtectTechContact: js.UndefOr[Boolean] = js.undefined
    ): TransferDomainRequest = {
      val __obj = js.Dynamic.literal(
        "AdminContact" -> AdminContact.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "DurationInYears" -> DurationInYears.asInstanceOf[js.Any],
        "RegistrantContact" -> RegistrantContact.asInstanceOf[js.Any],
        "TechContact" -> TechContact.asInstanceOf[js.Any]
      )

      AuthCode.foreach(__v => __obj.updateDynamic("AuthCode")(__v.asInstanceOf[js.Any]))
      AutoRenew.foreach(__v => __obj.updateDynamic("AutoRenew")(__v.asInstanceOf[js.Any]))
      IdnLangCode.foreach(__v => __obj.updateDynamic("IdnLangCode")(__v.asInstanceOf[js.Any]))
      Nameservers.foreach(__v => __obj.updateDynamic("Nameservers")(__v.asInstanceOf[js.Any]))
      PrivacyProtectAdminContact.foreach(__v => __obj.updateDynamic("PrivacyProtectAdminContact")(__v.asInstanceOf[js.Any]))
      PrivacyProtectRegistrantContact.foreach(__v => __obj.updateDynamic("PrivacyProtectRegistrantContact")(__v.asInstanceOf[js.Any]))
      PrivacyProtectTechContact.foreach(__v => __obj.updateDynamic("PrivacyProtectTechContact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransferDomainRequest]
    }
  }

  /** The TransferDomain response includes the following element.
    */
  @js.native
  trait TransferDomainResponse extends js.Object {
    var OperationId: OperationId
  }

  object TransferDomainResponse {
    @inline
    def apply(
        OperationId: OperationId
    ): TransferDomainResponse = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TransferDomainResponse]
    }
  }

  /** The TransferDomainToAnotherAwsAccount request includes the following elements.
    */
  @js.native
  trait TransferDomainToAnotherAwsAccountRequest extends js.Object {
    var AccountId: AccountId
    var DomainName: DomainName
  }

  object TransferDomainToAnotherAwsAccountRequest {
    @inline
    def apply(
        AccountId: AccountId,
        DomainName: DomainName
    ): TransferDomainToAnotherAwsAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TransferDomainToAnotherAwsAccountRequest]
    }
  }

  /** The <code>TransferDomainToAnotherAwsAccount</code> response includes the following elements.
    */
  @js.native
  trait TransferDomainToAnotherAwsAccountResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
    var Password: js.UndefOr[String]
  }

  object TransferDomainToAnotherAwsAccountResponse {
    @inline
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined,
        Password: js.UndefOr[String] = js.undefined
    ): TransferDomainToAnotherAwsAccountResponse = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransferDomainToAnotherAwsAccountResponse]
    }
  }

  /** The UpdateDomainContactPrivacy request includes the following elements.
    */
  @js.native
  trait UpdateDomainContactPrivacyRequest extends js.Object {
    var DomainName: DomainName
    var AdminPrivacy: js.UndefOr[Boolean]
    var RegistrantPrivacy: js.UndefOr[Boolean]
    var TechPrivacy: js.UndefOr[Boolean]
  }

  object UpdateDomainContactPrivacyRequest {
    @inline
    def apply(
        DomainName: DomainName,
        AdminPrivacy: js.UndefOr[Boolean] = js.undefined,
        RegistrantPrivacy: js.UndefOr[Boolean] = js.undefined,
        TechPrivacy: js.UndefOr[Boolean] = js.undefined
    ): UpdateDomainContactPrivacyRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AdminPrivacy.foreach(__v => __obj.updateDynamic("AdminPrivacy")(__v.asInstanceOf[js.Any]))
      RegistrantPrivacy.foreach(__v => __obj.updateDynamic("RegistrantPrivacy")(__v.asInstanceOf[js.Any]))
      TechPrivacy.foreach(__v => __obj.updateDynamic("TechPrivacy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainContactPrivacyRequest]
    }
  }

  /** The UpdateDomainContactPrivacy response includes the following element.
    */
  @js.native
  trait UpdateDomainContactPrivacyResponse extends js.Object {
    var OperationId: OperationId
  }

  object UpdateDomainContactPrivacyResponse {
    @inline
    def apply(
        OperationId: OperationId
    ): UpdateDomainContactPrivacyResponse = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDomainContactPrivacyResponse]
    }
  }

  /** The UpdateDomainContact request includes the following elements.
    */
  @js.native
  trait UpdateDomainContactRequest extends js.Object {
    var DomainName: DomainName
    var AdminContact: js.UndefOr[ContactDetail]
    var RegistrantContact: js.UndefOr[ContactDetail]
    var TechContact: js.UndefOr[ContactDetail]
  }

  object UpdateDomainContactRequest {
    @inline
    def apply(
        DomainName: DomainName,
        AdminContact: js.UndefOr[ContactDetail] = js.undefined,
        RegistrantContact: js.UndefOr[ContactDetail] = js.undefined,
        TechContact: js.UndefOr[ContactDetail] = js.undefined
    ): UpdateDomainContactRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AdminContact.foreach(__v => __obj.updateDynamic("AdminContact")(__v.asInstanceOf[js.Any]))
      RegistrantContact.foreach(__v => __obj.updateDynamic("RegistrantContact")(__v.asInstanceOf[js.Any]))
      TechContact.foreach(__v => __obj.updateDynamic("TechContact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainContactRequest]
    }
  }

  /** The UpdateDomainContact response includes the following element.
    */
  @js.native
  trait UpdateDomainContactResponse extends js.Object {
    var OperationId: OperationId
  }

  object UpdateDomainContactResponse {
    @inline
    def apply(
        OperationId: OperationId
    ): UpdateDomainContactResponse = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDomainContactResponse]
    }
  }

  /** Replaces the current set of name servers for the domain with the specified set of name servers. If you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted zone for the domain. If successful, this operation returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email.
    */
  @js.native
  trait UpdateDomainNameserversRequest extends js.Object {
    var DomainName: DomainName
    var Nameservers: NameserverList
    var FIAuthKey: js.UndefOr[FIAuthKey]
  }

  object UpdateDomainNameserversRequest {
    @inline
    def apply(
        DomainName: DomainName,
        Nameservers: NameserverList,
        FIAuthKey: js.UndefOr[FIAuthKey] = js.undefined
    ): UpdateDomainNameserversRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Nameservers" -> Nameservers.asInstanceOf[js.Any]
      )

      FIAuthKey.foreach(__v => __obj.updateDynamic("FIAuthKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainNameserversRequest]
    }
  }

  /** The UpdateDomainNameservers response includes the following element.
    */
  @js.native
  trait UpdateDomainNameserversResponse extends js.Object {
    var OperationId: OperationId
  }

  object UpdateDomainNameserversResponse {
    @inline
    def apply(
        OperationId: OperationId
    ): UpdateDomainNameserversResponse = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDomainNameserversResponse]
    }
  }

  /** The UpdateTagsForDomainRequest includes the following elements.
    */
  @js.native
  trait UpdateTagsForDomainRequest extends js.Object {
    var DomainName: DomainName
    var TagsToUpdate: js.UndefOr[TagList]
  }

  object UpdateTagsForDomainRequest {
    @inline
    def apply(
        DomainName: DomainName,
        TagsToUpdate: js.UndefOr[TagList] = js.undefined
    ): UpdateTagsForDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      TagsToUpdate.foreach(__v => __obj.updateDynamic("TagsToUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTagsForDomainRequest]
    }
  }

  @js.native
  trait UpdateTagsForDomainResponse extends js.Object

  object UpdateTagsForDomainResponse {
    @inline
    def apply(): UpdateTagsForDomainResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTagsForDomainResponse]
    }
  }

  /** The ViewBilling request includes the following elements.
    */
  @js.native
  trait ViewBillingRequest extends js.Object {
    var End: js.UndefOr[Timestamp]
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
    var Start: js.UndefOr[Timestamp]
  }

  object ViewBillingRequest {
    @inline
    def apply(
        End: js.UndefOr[Timestamp] = js.undefined,
        Marker: js.UndefOr[PageMarker] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        Start: js.UndefOr[Timestamp] = js.undefined
    ): ViewBillingRequest = {
      val __obj = js.Dynamic.literal()
      End.foreach(__v => __obj.updateDynamic("End")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.updateDynamic("Start")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ViewBillingRequest]
    }
  }

  /** The ViewBilling response includes the following elements.
    */
  @js.native
  trait ViewBillingResponse extends js.Object {
    var BillingRecords: js.UndefOr[BillingRecords]
    var NextPageMarker: js.UndefOr[PageMarker]
  }

  object ViewBillingResponse {
    @inline
    def apply(
        BillingRecords: js.UndefOr[BillingRecords] = js.undefined,
        NextPageMarker: js.UndefOr[PageMarker] = js.undefined
    ): ViewBillingResponse = {
      val __obj = js.Dynamic.literal()
      BillingRecords.foreach(__v => __obj.updateDynamic("BillingRecords")(__v.asInstanceOf[js.Any]))
      NextPageMarker.foreach(__v => __obj.updateDynamic("NextPageMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ViewBillingResponse]
    }
  }
}
