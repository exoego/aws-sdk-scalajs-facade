package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object route53domains {
  type AccountId = String
  type AddressLine = String
  type BillingRecords = js.Array[BillingRecord]
  type City = String
  type ContactName = String
  type ContactNumber = String
  type CurrentExpiryYear = Int
  type DNSSec = String
  type DomainAuthCode = String
  type DomainName = String
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
  type ZipCode = String

  implicit final class Route53DomainsOps(private val service: Route53Domains) extends AnyVal {

    @inline def acceptDomainTransferFromAnotherAwsAccountFuture(params: AcceptDomainTransferFromAnotherAwsAccountRequest): Future[AcceptDomainTransferFromAnotherAwsAccountResponse] = service.acceptDomainTransferFromAnotherAwsAccount(params).promise().toFuture
    @inline def cancelDomainTransferToAnotherAwsAccountFuture(params: CancelDomainTransferToAnotherAwsAccountRequest): Future[CancelDomainTransferToAnotherAwsAccountResponse] = service.cancelDomainTransferToAnotherAwsAccount(params).promise().toFuture
    @inline def checkDomainAvailabilityFuture(params: CheckDomainAvailabilityRequest): Future[CheckDomainAvailabilityResponse] = service.checkDomainAvailability(params).promise().toFuture
    @inline def checkDomainTransferabilityFuture(params: CheckDomainTransferabilityRequest): Future[CheckDomainTransferabilityResponse] = service.checkDomainTransferability(params).promise().toFuture
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
}

package route53domains {
  @js.native
  @JSImport("aws-sdk/clients/route53domains", JSImport.Namespace, "AWS.Route53Domains")
  class Route53Domains() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptDomainTransferFromAnotherAwsAccount(params: AcceptDomainTransferFromAnotherAwsAccountRequest): Request[AcceptDomainTransferFromAnotherAwsAccountResponse] = js.native
    def cancelDomainTransferToAnotherAwsAccount(params: CancelDomainTransferToAnotherAwsAccountRequest): Request[CancelDomainTransferToAnotherAwsAccountResponse] = js.native
    def checkDomainAvailability(params: CheckDomainAvailabilityRequest): Request[CheckDomainAvailabilityResponse] = js.native
    def checkDomainTransferability(params: CheckDomainTransferabilityRequest): Request[CheckDomainTransferabilityResponse] = js.native
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
  sealed trait ContactType extends js.Any
  object ContactType {
    val PERSON = "PERSON".asInstanceOf[ContactType]
    val COMPANY = "COMPANY".asInstanceOf[ContactType]
    val ASSOCIATION = "ASSOCIATION".asInstanceOf[ContactType]
    val PUBLIC_BODY = "PUBLIC_BODY".asInstanceOf[ContactType]
    val RESELLER = "RESELLER".asInstanceOf[ContactType]

    @inline def values = js.Array(PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY, RESELLER)
  }

  @js.native
  sealed trait CountryCode extends js.Any
  object CountryCode {
    val AD = "AD".asInstanceOf[CountryCode]
    val AE = "AE".asInstanceOf[CountryCode]
    val AF = "AF".asInstanceOf[CountryCode]
    val AG = "AG".asInstanceOf[CountryCode]
    val AI = "AI".asInstanceOf[CountryCode]
    val AL = "AL".asInstanceOf[CountryCode]
    val AM = "AM".asInstanceOf[CountryCode]
    val AN = "AN".asInstanceOf[CountryCode]
    val AO = "AO".asInstanceOf[CountryCode]
    val AQ = "AQ".asInstanceOf[CountryCode]
    val AR = "AR".asInstanceOf[CountryCode]
    val AS = "AS".asInstanceOf[CountryCode]
    val AT = "AT".asInstanceOf[CountryCode]
    val AU = "AU".asInstanceOf[CountryCode]
    val AW = "AW".asInstanceOf[CountryCode]
    val AZ = "AZ".asInstanceOf[CountryCode]
    val BA = "BA".asInstanceOf[CountryCode]
    val BB = "BB".asInstanceOf[CountryCode]
    val BD = "BD".asInstanceOf[CountryCode]
    val BE = "BE".asInstanceOf[CountryCode]
    val BF = "BF".asInstanceOf[CountryCode]
    val BG = "BG".asInstanceOf[CountryCode]
    val BH = "BH".asInstanceOf[CountryCode]
    val BI = "BI".asInstanceOf[CountryCode]
    val BJ = "BJ".asInstanceOf[CountryCode]
    val BL = "BL".asInstanceOf[CountryCode]
    val BM = "BM".asInstanceOf[CountryCode]
    val BN = "BN".asInstanceOf[CountryCode]
    val BO = "BO".asInstanceOf[CountryCode]
    val BR = "BR".asInstanceOf[CountryCode]
    val BS = "BS".asInstanceOf[CountryCode]
    val BT = "BT".asInstanceOf[CountryCode]
    val BW = "BW".asInstanceOf[CountryCode]
    val BY = "BY".asInstanceOf[CountryCode]
    val BZ = "BZ".asInstanceOf[CountryCode]
    val CA = "CA".asInstanceOf[CountryCode]
    val CC = "CC".asInstanceOf[CountryCode]
    val CD = "CD".asInstanceOf[CountryCode]
    val CF = "CF".asInstanceOf[CountryCode]
    val CG = "CG".asInstanceOf[CountryCode]
    val CH = "CH".asInstanceOf[CountryCode]
    val CI = "CI".asInstanceOf[CountryCode]
    val CK = "CK".asInstanceOf[CountryCode]
    val CL = "CL".asInstanceOf[CountryCode]
    val CM = "CM".asInstanceOf[CountryCode]
    val CN = "CN".asInstanceOf[CountryCode]
    val CO = "CO".asInstanceOf[CountryCode]
    val CR = "CR".asInstanceOf[CountryCode]
    val CU = "CU".asInstanceOf[CountryCode]
    val CV = "CV".asInstanceOf[CountryCode]
    val CX = "CX".asInstanceOf[CountryCode]
    val CY = "CY".asInstanceOf[CountryCode]
    val CZ = "CZ".asInstanceOf[CountryCode]
    val DE = "DE".asInstanceOf[CountryCode]
    val DJ = "DJ".asInstanceOf[CountryCode]
    val DK = "DK".asInstanceOf[CountryCode]
    val DM = "DM".asInstanceOf[CountryCode]
    val DO = "DO".asInstanceOf[CountryCode]
    val DZ = "DZ".asInstanceOf[CountryCode]
    val EC = "EC".asInstanceOf[CountryCode]
    val EE = "EE".asInstanceOf[CountryCode]
    val EG = "EG".asInstanceOf[CountryCode]
    val ER = "ER".asInstanceOf[CountryCode]
    val ES = "ES".asInstanceOf[CountryCode]
    val ET = "ET".asInstanceOf[CountryCode]
    val FI = "FI".asInstanceOf[CountryCode]
    val FJ = "FJ".asInstanceOf[CountryCode]
    val FK = "FK".asInstanceOf[CountryCode]
    val FM = "FM".asInstanceOf[CountryCode]
    val FO = "FO".asInstanceOf[CountryCode]
    val FR = "FR".asInstanceOf[CountryCode]
    val GA = "GA".asInstanceOf[CountryCode]
    val GB = "GB".asInstanceOf[CountryCode]
    val GD = "GD".asInstanceOf[CountryCode]
    val GE = "GE".asInstanceOf[CountryCode]
    val GH = "GH".asInstanceOf[CountryCode]
    val GI = "GI".asInstanceOf[CountryCode]
    val GL = "GL".asInstanceOf[CountryCode]
    val GM = "GM".asInstanceOf[CountryCode]
    val GN = "GN".asInstanceOf[CountryCode]
    val GQ = "GQ".asInstanceOf[CountryCode]
    val GR = "GR".asInstanceOf[CountryCode]
    val GT = "GT".asInstanceOf[CountryCode]
    val GU = "GU".asInstanceOf[CountryCode]
    val GW = "GW".asInstanceOf[CountryCode]
    val GY = "GY".asInstanceOf[CountryCode]
    val HK = "HK".asInstanceOf[CountryCode]
    val HN = "HN".asInstanceOf[CountryCode]
    val HR = "HR".asInstanceOf[CountryCode]
    val HT = "HT".asInstanceOf[CountryCode]
    val HU = "HU".asInstanceOf[CountryCode]
    val ID = "ID".asInstanceOf[CountryCode]
    val IE = "IE".asInstanceOf[CountryCode]
    val IL = "IL".asInstanceOf[CountryCode]
    val IM = "IM".asInstanceOf[CountryCode]
    val IN = "IN".asInstanceOf[CountryCode]
    val IQ = "IQ".asInstanceOf[CountryCode]
    val IR = "IR".asInstanceOf[CountryCode]
    val IS = "IS".asInstanceOf[CountryCode]
    val IT = "IT".asInstanceOf[CountryCode]
    val JM = "JM".asInstanceOf[CountryCode]
    val JO = "JO".asInstanceOf[CountryCode]
    val JP = "JP".asInstanceOf[CountryCode]
    val KE = "KE".asInstanceOf[CountryCode]
    val KG = "KG".asInstanceOf[CountryCode]
    val KH = "KH".asInstanceOf[CountryCode]
    val KI = "KI".asInstanceOf[CountryCode]
    val KM = "KM".asInstanceOf[CountryCode]
    val KN = "KN".asInstanceOf[CountryCode]
    val KP = "KP".asInstanceOf[CountryCode]
    val KR = "KR".asInstanceOf[CountryCode]
    val KW = "KW".asInstanceOf[CountryCode]
    val KY = "KY".asInstanceOf[CountryCode]
    val KZ = "KZ".asInstanceOf[CountryCode]
    val LA = "LA".asInstanceOf[CountryCode]
    val LB = "LB".asInstanceOf[CountryCode]
    val LC = "LC".asInstanceOf[CountryCode]
    val LI = "LI".asInstanceOf[CountryCode]
    val LK = "LK".asInstanceOf[CountryCode]
    val LR = "LR".asInstanceOf[CountryCode]
    val LS = "LS".asInstanceOf[CountryCode]
    val LT = "LT".asInstanceOf[CountryCode]
    val LU = "LU".asInstanceOf[CountryCode]
    val LV = "LV".asInstanceOf[CountryCode]
    val LY = "LY".asInstanceOf[CountryCode]
    val MA = "MA".asInstanceOf[CountryCode]
    val MC = "MC".asInstanceOf[CountryCode]
    val MD = "MD".asInstanceOf[CountryCode]
    val ME = "ME".asInstanceOf[CountryCode]
    val MF = "MF".asInstanceOf[CountryCode]
    val MG = "MG".asInstanceOf[CountryCode]
    val MH = "MH".asInstanceOf[CountryCode]
    val MK = "MK".asInstanceOf[CountryCode]
    val ML = "ML".asInstanceOf[CountryCode]
    val MM = "MM".asInstanceOf[CountryCode]
    val MN = "MN".asInstanceOf[CountryCode]
    val MO = "MO".asInstanceOf[CountryCode]
    val MP = "MP".asInstanceOf[CountryCode]
    val MR = "MR".asInstanceOf[CountryCode]
    val MS = "MS".asInstanceOf[CountryCode]
    val MT = "MT".asInstanceOf[CountryCode]
    val MU = "MU".asInstanceOf[CountryCode]
    val MV = "MV".asInstanceOf[CountryCode]
    val MW = "MW".asInstanceOf[CountryCode]
    val MX = "MX".asInstanceOf[CountryCode]
    val MY = "MY".asInstanceOf[CountryCode]
    val MZ = "MZ".asInstanceOf[CountryCode]
    val NA = "NA".asInstanceOf[CountryCode]
    val NC = "NC".asInstanceOf[CountryCode]
    val NE = "NE".asInstanceOf[CountryCode]
    val NG = "NG".asInstanceOf[CountryCode]
    val NI = "NI".asInstanceOf[CountryCode]
    val NL = "NL".asInstanceOf[CountryCode]
    val NO = "NO".asInstanceOf[CountryCode]
    val NP = "NP".asInstanceOf[CountryCode]
    val NR = "NR".asInstanceOf[CountryCode]
    val NU = "NU".asInstanceOf[CountryCode]
    val NZ = "NZ".asInstanceOf[CountryCode]
    val OM = "OM".asInstanceOf[CountryCode]
    val PA = "PA".asInstanceOf[CountryCode]
    val PE = "PE".asInstanceOf[CountryCode]
    val PF = "PF".asInstanceOf[CountryCode]
    val PG = "PG".asInstanceOf[CountryCode]
    val PH = "PH".asInstanceOf[CountryCode]
    val PK = "PK".asInstanceOf[CountryCode]
    val PL = "PL".asInstanceOf[CountryCode]
    val PM = "PM".asInstanceOf[CountryCode]
    val PN = "PN".asInstanceOf[CountryCode]
    val PR = "PR".asInstanceOf[CountryCode]
    val PT = "PT".asInstanceOf[CountryCode]
    val PW = "PW".asInstanceOf[CountryCode]
    val PY = "PY".asInstanceOf[CountryCode]
    val QA = "QA".asInstanceOf[CountryCode]
    val RO = "RO".asInstanceOf[CountryCode]
    val RS = "RS".asInstanceOf[CountryCode]
    val RU = "RU".asInstanceOf[CountryCode]
    val RW = "RW".asInstanceOf[CountryCode]
    val SA = "SA".asInstanceOf[CountryCode]
    val SB = "SB".asInstanceOf[CountryCode]
    val SC = "SC".asInstanceOf[CountryCode]
    val SD = "SD".asInstanceOf[CountryCode]
    val SE = "SE".asInstanceOf[CountryCode]
    val SG = "SG".asInstanceOf[CountryCode]
    val SH = "SH".asInstanceOf[CountryCode]
    val SI = "SI".asInstanceOf[CountryCode]
    val SK = "SK".asInstanceOf[CountryCode]
    val SL = "SL".asInstanceOf[CountryCode]
    val SM = "SM".asInstanceOf[CountryCode]
    val SN = "SN".asInstanceOf[CountryCode]
    val SO = "SO".asInstanceOf[CountryCode]
    val SR = "SR".asInstanceOf[CountryCode]
    val ST = "ST".asInstanceOf[CountryCode]
    val SV = "SV".asInstanceOf[CountryCode]
    val SY = "SY".asInstanceOf[CountryCode]
    val SZ = "SZ".asInstanceOf[CountryCode]
    val TC = "TC".asInstanceOf[CountryCode]
    val TD = "TD".asInstanceOf[CountryCode]
    val TG = "TG".asInstanceOf[CountryCode]
    val TH = "TH".asInstanceOf[CountryCode]
    val TJ = "TJ".asInstanceOf[CountryCode]
    val TK = "TK".asInstanceOf[CountryCode]
    val TL = "TL".asInstanceOf[CountryCode]
    val TM = "TM".asInstanceOf[CountryCode]
    val TN = "TN".asInstanceOf[CountryCode]
    val TO = "TO".asInstanceOf[CountryCode]
    val TR = "TR".asInstanceOf[CountryCode]
    val TT = "TT".asInstanceOf[CountryCode]
    val TV = "TV".asInstanceOf[CountryCode]
    val TW = "TW".asInstanceOf[CountryCode]
    val TZ = "TZ".asInstanceOf[CountryCode]
    val UA = "UA".asInstanceOf[CountryCode]
    val UG = "UG".asInstanceOf[CountryCode]
    val US = "US".asInstanceOf[CountryCode]
    val UY = "UY".asInstanceOf[CountryCode]
    val UZ = "UZ".asInstanceOf[CountryCode]
    val VA = "VA".asInstanceOf[CountryCode]
    val VC = "VC".asInstanceOf[CountryCode]
    val VE = "VE".asInstanceOf[CountryCode]
    val VG = "VG".asInstanceOf[CountryCode]
    val VI = "VI".asInstanceOf[CountryCode]
    val VN = "VN".asInstanceOf[CountryCode]
    val VU = "VU".asInstanceOf[CountryCode]
    val WF = "WF".asInstanceOf[CountryCode]
    val WS = "WS".asInstanceOf[CountryCode]
    val YE = "YE".asInstanceOf[CountryCode]
    val YT = "YT".asInstanceOf[CountryCode]
    val ZA = "ZA".asInstanceOf[CountryCode]
    val ZM = "ZM".asInstanceOf[CountryCode]
    val ZW = "ZW".asInstanceOf[CountryCode]

    @inline def values = js.Array(
      AD,
      AE,
      AF,
      AG,
      AI,
      AL,
      AM,
      AN,
      AO,
      AQ,
      AR,
      AS,
      AT,
      AU,
      AW,
      AZ,
      BA,
      BB,
      BD,
      BE,
      BF,
      BG,
      BH,
      BI,
      BJ,
      BL,
      BM,
      BN,
      BO,
      BR,
      BS,
      BT,
      BW,
      BY,
      BZ,
      CA,
      CC,
      CD,
      CF,
      CG,
      CH,
      CI,
      CK,
      CL,
      CM,
      CN,
      CO,
      CR,
      CU,
      CV,
      CX,
      CY,
      CZ,
      DE,
      DJ,
      DK,
      DM,
      DO,
      DZ,
      EC,
      EE,
      EG,
      ER,
      ES,
      ET,
      FI,
      FJ,
      FK,
      FM,
      FO,
      FR,
      GA,
      GB,
      GD,
      GE,
      GH,
      GI,
      GL,
      GM,
      GN,
      GQ,
      GR,
      GT,
      GU,
      GW,
      GY,
      HK,
      HN,
      HR,
      HT,
      HU,
      ID,
      IE,
      IL,
      IM,
      IN,
      IQ,
      IR,
      IS,
      IT,
      JM,
      JO,
      JP,
      KE,
      KG,
      KH,
      KI,
      KM,
      KN,
      KP,
      KR,
      KW,
      KY,
      KZ,
      LA,
      LB,
      LC,
      LI,
      LK,
      LR,
      LS,
      LT,
      LU,
      LV,
      LY,
      MA,
      MC,
      MD,
      ME,
      MF,
      MG,
      MH,
      MK,
      ML,
      MM,
      MN,
      MO,
      MP,
      MR,
      MS,
      MT,
      MU,
      MV,
      MW,
      MX,
      MY,
      MZ,
      NA,
      NC,
      NE,
      NG,
      NI,
      NL,
      NO,
      NP,
      NR,
      NU,
      NZ,
      OM,
      PA,
      PE,
      PF,
      PG,
      PH,
      PK,
      PL,
      PM,
      PN,
      PR,
      PT,
      PW,
      PY,
      QA,
      RO,
      RS,
      RU,
      RW,
      SA,
      SB,
      SC,
      SD,
      SE,
      SG,
      SH,
      SI,
      SK,
      SL,
      SM,
      SN,
      SO,
      SR,
      ST,
      SV,
      SY,
      SZ,
      TC,
      TD,
      TG,
      TH,
      TJ,
      TK,
      TL,
      TM,
      TN,
      TO,
      TR,
      TT,
      TV,
      TW,
      TZ,
      UA,
      UG,
      US,
      UY,
      UZ,
      VA,
      VC,
      VE,
      VG,
      VI,
      VN,
      VU,
      WF,
      WS,
      YE,
      YT,
      ZA,
      ZM,
      ZW
    )
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

  @js.native
  sealed trait DomainAvailability extends js.Any
  object DomainAvailability {
    val AVAILABLE = "AVAILABLE".asInstanceOf[DomainAvailability]
    val AVAILABLE_RESERVED = "AVAILABLE_RESERVED".asInstanceOf[DomainAvailability]
    val AVAILABLE_PREORDER = "AVAILABLE_PREORDER".asInstanceOf[DomainAvailability]
    val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[DomainAvailability]
    val UNAVAILABLE_PREMIUM = "UNAVAILABLE_PREMIUM".asInstanceOf[DomainAvailability]
    val UNAVAILABLE_RESTRICTED = "UNAVAILABLE_RESTRICTED".asInstanceOf[DomainAvailability]
    val RESERVED = "RESERVED".asInstanceOf[DomainAvailability]
    val DONT_KNOW = "DONT_KNOW".asInstanceOf[DomainAvailability]

    @inline def values = js.Array(AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER, UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED, DONT_KNOW)
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

  @js.native
  sealed trait ExtraParamName extends js.Any
  object ExtraParamName {
    val DUNS_NUMBER = "DUNS_NUMBER".asInstanceOf[ExtraParamName]
    val BRAND_NUMBER = "BRAND_NUMBER".asInstanceOf[ExtraParamName]
    val BIRTH_DEPARTMENT = "BIRTH_DEPARTMENT".asInstanceOf[ExtraParamName]
    val BIRTH_DATE_IN_YYYY_MM_DD = "BIRTH_DATE_IN_YYYY_MM_DD".asInstanceOf[ExtraParamName]
    val BIRTH_COUNTRY = "BIRTH_COUNTRY".asInstanceOf[ExtraParamName]
    val BIRTH_CITY = "BIRTH_CITY".asInstanceOf[ExtraParamName]
    val DOCUMENT_NUMBER = "DOCUMENT_NUMBER".asInstanceOf[ExtraParamName]
    val AU_ID_NUMBER = "AU_ID_NUMBER".asInstanceOf[ExtraParamName]
    val AU_ID_TYPE = "AU_ID_TYPE".asInstanceOf[ExtraParamName]
    val CA_LEGAL_TYPE = "CA_LEGAL_TYPE".asInstanceOf[ExtraParamName]
    val CA_BUSINESS_ENTITY_TYPE = "CA_BUSINESS_ENTITY_TYPE".asInstanceOf[ExtraParamName]
    val CA_LEGAL_REPRESENTATIVE = "CA_LEGAL_REPRESENTATIVE".asInstanceOf[ExtraParamName]
    val CA_LEGAL_REPRESENTATIVE_CAPACITY = "CA_LEGAL_REPRESENTATIVE_CAPACITY".asInstanceOf[ExtraParamName]
    val ES_IDENTIFICATION = "ES_IDENTIFICATION".asInstanceOf[ExtraParamName]
    val ES_IDENTIFICATION_TYPE = "ES_IDENTIFICATION_TYPE".asInstanceOf[ExtraParamName]
    val ES_LEGAL_FORM = "ES_LEGAL_FORM".asInstanceOf[ExtraParamName]
    val FI_BUSINESS_NUMBER = "FI_BUSINESS_NUMBER".asInstanceOf[ExtraParamName]
    val FI_ID_NUMBER = "FI_ID_NUMBER".asInstanceOf[ExtraParamName]
    val FI_NATIONALITY = "FI_NATIONALITY".asInstanceOf[ExtraParamName]
    val FI_ORGANIZATION_TYPE = "FI_ORGANIZATION_TYPE".asInstanceOf[ExtraParamName]
    val IT_NATIONALITY = "IT_NATIONALITY".asInstanceOf[ExtraParamName]
    val IT_PIN = "IT_PIN".asInstanceOf[ExtraParamName]
    val IT_REGISTRANT_ENTITY_TYPE = "IT_REGISTRANT_ENTITY_TYPE".asInstanceOf[ExtraParamName]
    val RU_PASSPORT_DATA = "RU_PASSPORT_DATA".asInstanceOf[ExtraParamName]
    val SE_ID_NUMBER = "SE_ID_NUMBER".asInstanceOf[ExtraParamName]
    val SG_ID_NUMBER = "SG_ID_NUMBER".asInstanceOf[ExtraParamName]
    val VAT_NUMBER = "VAT_NUMBER".asInstanceOf[ExtraParamName]
    val UK_CONTACT_TYPE = "UK_CONTACT_TYPE".asInstanceOf[ExtraParamName]
    val UK_COMPANY_NUMBER = "UK_COMPANY_NUMBER".asInstanceOf[ExtraParamName]

    @inline def values = js.Array(
      DUNS_NUMBER,
      BRAND_NUMBER,
      BIRTH_DEPARTMENT,
      BIRTH_DATE_IN_YYYY_MM_DD,
      BIRTH_COUNTRY,
      BIRTH_CITY,
      DOCUMENT_NUMBER,
      AU_ID_NUMBER,
      AU_ID_TYPE,
      CA_LEGAL_TYPE,
      CA_BUSINESS_ENTITY_TYPE,
      CA_LEGAL_REPRESENTATIVE,
      CA_LEGAL_REPRESENTATIVE_CAPACITY,
      ES_IDENTIFICATION,
      ES_IDENTIFICATION_TYPE,
      ES_LEGAL_FORM,
      FI_BUSINESS_NUMBER,
      FI_ID_NUMBER,
      FI_NATIONALITY,
      FI_ORGANIZATION_TYPE,
      IT_NATIONALITY,
      IT_PIN,
      IT_REGISTRANT_ENTITY_TYPE,
      RU_PASSPORT_DATA,
      SE_ID_NUMBER,
      SG_ID_NUMBER,
      VAT_NUMBER,
      UK_CONTACT_TYPE,
      UK_COMPANY_NUMBER
    )
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
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListDomainsRequest {
    @inline
    def apply(
        Marker: js.UndefOr[PageMarker] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListDomainsRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
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

  @js.native
  sealed trait OperationStatus extends js.Any
  object OperationStatus {
    val SUBMITTED = "SUBMITTED".asInstanceOf[OperationStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[OperationStatus]
    val ERROR = "ERROR".asInstanceOf[OperationStatus]
    val SUCCESSFUL = "SUCCESSFUL".asInstanceOf[OperationStatus]
    val FAILED = "FAILED".asInstanceOf[OperationStatus]

    @inline def values = js.Array(SUBMITTED, IN_PROGRESS, ERROR, SUCCESSFUL, FAILED)
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

  @js.native
  sealed trait OperationType extends js.Any
  object OperationType {
    val REGISTER_DOMAIN = "REGISTER_DOMAIN".asInstanceOf[OperationType]
    val DELETE_DOMAIN = "DELETE_DOMAIN".asInstanceOf[OperationType]
    val TRANSFER_IN_DOMAIN = "TRANSFER_IN_DOMAIN".asInstanceOf[OperationType]
    val UPDATE_DOMAIN_CONTACT = "UPDATE_DOMAIN_CONTACT".asInstanceOf[OperationType]
    val UPDATE_NAMESERVER = "UPDATE_NAMESERVER".asInstanceOf[OperationType]
    val CHANGE_PRIVACY_PROTECTION = "CHANGE_PRIVACY_PROTECTION".asInstanceOf[OperationType]
    val DOMAIN_LOCK = "DOMAIN_LOCK".asInstanceOf[OperationType]
    val ENABLE_AUTORENEW = "ENABLE_AUTORENEW".asInstanceOf[OperationType]
    val DISABLE_AUTORENEW = "DISABLE_AUTORENEW".asInstanceOf[OperationType]
    val ADD_DNSSEC = "ADD_DNSSEC".asInstanceOf[OperationType]
    val REMOVE_DNSSEC = "REMOVE_DNSSEC".asInstanceOf[OperationType]
    val EXPIRE_DOMAIN = "EXPIRE_DOMAIN".asInstanceOf[OperationType]
    val TRANSFER_OUT_DOMAIN = "TRANSFER_OUT_DOMAIN".asInstanceOf[OperationType]
    val CHANGE_DOMAIN_OWNER = "CHANGE_DOMAIN_OWNER".asInstanceOf[OperationType]
    val RENEW_DOMAIN = "RENEW_DOMAIN".asInstanceOf[OperationType]
    val PUSH_DOMAIN = "PUSH_DOMAIN".asInstanceOf[OperationType]
    val INTERNAL_TRANSFER_OUT_DOMAIN = "INTERNAL_TRANSFER_OUT_DOMAIN".asInstanceOf[OperationType]
    val INTERNAL_TRANSFER_IN_DOMAIN = "INTERNAL_TRANSFER_IN_DOMAIN".asInstanceOf[OperationType]

    @inline def values = js.Array(
      REGISTER_DOMAIN,
      DELETE_DOMAIN,
      TRANSFER_IN_DOMAIN,
      UPDATE_DOMAIN_CONTACT,
      UPDATE_NAMESERVER,
      CHANGE_PRIVACY_PROTECTION,
      DOMAIN_LOCK,
      ENABLE_AUTORENEW,
      DISABLE_AUTORENEW,
      ADD_DNSSEC,
      REMOVE_DNSSEC,
      EXPIRE_DOMAIN,
      TRANSFER_OUT_DOMAIN,
      CHANGE_DOMAIN_OWNER,
      RENEW_DOMAIN,
      PUSH_DOMAIN,
      INTERNAL_TRANSFER_OUT_DOMAIN,
      INTERNAL_TRANSFER_IN_DOMAIN
    )
  }

  @js.native
  sealed trait ReachabilityStatus extends js.Any
  object ReachabilityStatus {
    val PENDING = "PENDING".asInstanceOf[ReachabilityStatus]
    val DONE = "DONE".asInstanceOf[ReachabilityStatus]
    val EXPIRED = "EXPIRED".asInstanceOf[ReachabilityStatus]

    @inline def values = js.Array(PENDING, DONE, EXPIRED)
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

  /** Whether the domain name can be transferred to Route 53.
    *
    * '''Note:'''You can transfer only domains that have a value of <code>TRANSFERABLE</code> for <code>Transferable</code>.
    * Valid values:
    * <dl> <dt>TRANSFERABLE</dt> <dd> The domain name can be transferred to Route 53.
    * </dd> <dt>UNTRANSFERRABLE</dt> <dd> The domain name can't be transferred to Route 53.
    * </dd> <dt>DONT_KNOW</dt> <dd> Reserved for future use.
    * </dd> </dl>
    */
  @js.native
  sealed trait Transferable extends js.Any
  object Transferable {
    val TRANSFERABLE = "TRANSFERABLE".asInstanceOf[Transferable]
    val UNTRANSFERABLE = "UNTRANSFERABLE".asInstanceOf[Transferable]
    val DONT_KNOW = "DONT_KNOW".asInstanceOf[Transferable]

    @inline def values = js.Array(TRANSFERABLE, UNTRANSFERABLE, DONT_KNOW)
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

  /** Replaces the current set of name servers for the domain with the specified set of name servers. If you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted zone for the domain.
    * If successful, this operation returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email.
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
