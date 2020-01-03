package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object route53domains {
  type AddressLine           = String
  type BillingRecords        = js.Array[BillingRecord]
  type City                  = String
  type ContactName           = String
  type ContactNumber         = String
  type ContactType           = String
  type CountryCode           = String
  type CurrentExpiryYear     = Int
  type DNSSec                = String
  type DomainAuthCode        = String
  type DomainAvailability    = String
  type DomainName            = String
  type DomainStatus          = String
  type DomainStatusList      = js.Array[DomainStatus]
  type DomainSuggestionsList = js.Array[DomainSuggestion]
  type DomainSummaryList     = js.Array[DomainSummary]
  type DurationInYears       = Int
  type Email                 = String
  type ErrorMessage          = String
  type ExtraParamList        = js.Array[ExtraParam]
  type ExtraParamName        = String
  type ExtraParamValue       = String
  type FIAuthKey             = String
  type GlueIp                = String
  type GlueIpList            = js.Array[GlueIp]
  type HostName              = String
  type InvoiceId             = String
  type LangCode              = String
  type NameserverList        = js.Array[Nameserver]
  type OperationId           = String
  type OperationStatus       = String
  type OperationSummaryList  = js.Array[OperationSummary]
  type OperationType         = String
  type PageMarker            = String
  type PageMaxItems          = Int
  type Price                 = Double
  type ReachabilityStatus    = String
  type RegistrarName         = String
  type RegistrarUrl          = String
  type RegistrarWhoIsServer  = String
  type RegistryDomainId      = String
  type Reseller              = String
  type State                 = String
  type TagKey                = String
  type TagKeyList            = js.Array[TagKey]
  type TagList               = js.Array[Tag]
  type TagValue              = String
  type Timestamp             = js.Date
  type Transferable          = String
  type ZipCode               = String

  implicit final class Route53DomainsOps(private val service: Route53Domains) extends AnyVal {

    @inline def checkDomainAvailabilityFuture(
        params: CheckDomainAvailabilityRequest
    ): Future[CheckDomainAvailabilityResponse] = service.checkDomainAvailability(params).promise.toFuture
    @inline def checkDomainTransferabilityFuture(
        params: CheckDomainTransferabilityRequest
    ): Future[CheckDomainTransferabilityResponse] = service.checkDomainTransferability(params).promise.toFuture
    @inline def deleteTagsForDomainFuture(params: DeleteTagsForDomainRequest): Future[DeleteTagsForDomainResponse] =
      service.deleteTagsForDomain(params).promise.toFuture
    @inline def disableDomainAutoRenewFuture(
        params: DisableDomainAutoRenewRequest
    ): Future[DisableDomainAutoRenewResponse] = service.disableDomainAutoRenew(params).promise.toFuture
    @inline def disableDomainTransferLockFuture(
        params: DisableDomainTransferLockRequest
    ): Future[DisableDomainTransferLockResponse] = service.disableDomainTransferLock(params).promise.toFuture
    @inline def enableDomainAutoRenewFuture(
        params: EnableDomainAutoRenewRequest
    ): Future[EnableDomainAutoRenewResponse] = service.enableDomainAutoRenew(params).promise.toFuture
    @inline def enableDomainTransferLockFuture(
        params: EnableDomainTransferLockRequest
    ): Future[EnableDomainTransferLockResponse] = service.enableDomainTransferLock(params).promise.toFuture
    @inline def getContactReachabilityStatusFuture(
        params: GetContactReachabilityStatusRequest
    ): Future[GetContactReachabilityStatusResponse] = service.getContactReachabilityStatus(params).promise.toFuture
    @inline def getDomainDetailFuture(params: GetDomainDetailRequest): Future[GetDomainDetailResponse] =
      service.getDomainDetail(params).promise.toFuture
    @inline def getDomainSuggestionsFuture(params: GetDomainSuggestionsRequest): Future[GetDomainSuggestionsResponse] =
      service.getDomainSuggestions(params).promise.toFuture
    @inline def getOperationDetailFuture(params: GetOperationDetailRequest): Future[GetOperationDetailResponse] =
      service.getOperationDetail(params).promise.toFuture
    @inline def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResponse] =
      service.listDomains(params).promise.toFuture
    @inline def listOperationsFuture(params: ListOperationsRequest): Future[ListOperationsResponse] =
      service.listOperations(params).promise.toFuture
    @inline def listTagsForDomainFuture(params: ListTagsForDomainRequest): Future[ListTagsForDomainResponse] =
      service.listTagsForDomain(params).promise.toFuture
    @inline def registerDomainFuture(params: RegisterDomainRequest): Future[RegisterDomainResponse] =
      service.registerDomain(params).promise.toFuture
    @inline def renewDomainFuture(params: RenewDomainRequest): Future[RenewDomainResponse] =
      service.renewDomain(params).promise.toFuture
    @inline def resendContactReachabilityEmailFuture(
        params: ResendContactReachabilityEmailRequest
    ): Future[ResendContactReachabilityEmailResponse] = service.resendContactReachabilityEmail(params).promise.toFuture
    @inline def retrieveDomainAuthCodeFuture(
        params: RetrieveDomainAuthCodeRequest
    ): Future[RetrieveDomainAuthCodeResponse] = service.retrieveDomainAuthCode(params).promise.toFuture
    @inline def transferDomainFuture(params: TransferDomainRequest): Future[TransferDomainResponse] =
      service.transferDomain(params).promise.toFuture
    @inline def updateDomainContactFuture(params: UpdateDomainContactRequest): Future[UpdateDomainContactResponse] =
      service.updateDomainContact(params).promise.toFuture
    @inline def updateDomainContactPrivacyFuture(
        params: UpdateDomainContactPrivacyRequest
    ): Future[UpdateDomainContactPrivacyResponse] = service.updateDomainContactPrivacy(params).promise.toFuture
    @inline def updateDomainNameserversFuture(
        params: UpdateDomainNameserversRequest
    ): Future[UpdateDomainNameserversResponse] = service.updateDomainNameservers(params).promise.toFuture
    @inline def updateTagsForDomainFuture(params: UpdateTagsForDomainRequest): Future[UpdateTagsForDomainResponse] =
      service.updateTagsForDomain(params).promise.toFuture
    @inline def viewBillingFuture(params: ViewBillingRequest): Future[ViewBillingResponse] =
      service.viewBilling(params).promise.toFuture
  }
}

package route53domains {
  @js.native
  @JSImport("aws-sdk", "Route53Domains")
  class Route53Domains() extends js.Object {
    def this(config: AWSConfig) = this()

    def checkDomainAvailability(params: CheckDomainAvailabilityRequest): Request[CheckDomainAvailabilityResponse] =
      js.native
    def checkDomainTransferability(
        params: CheckDomainTransferabilityRequest
    ): Request[CheckDomainTransferabilityResponse]                                                    = js.native
    def deleteTagsForDomain(params: DeleteTagsForDomainRequest): Request[DeleteTagsForDomainResponse] = js.native
    def disableDomainAutoRenew(params: DisableDomainAutoRenewRequest): Request[DisableDomainAutoRenewResponse] =
      js.native
    def disableDomainTransferLock(
        params: DisableDomainTransferLockRequest
    ): Request[DisableDomainTransferLockResponse]                                                           = js.native
    def enableDomainAutoRenew(params: EnableDomainAutoRenewRequest): Request[EnableDomainAutoRenewResponse] = js.native
    def enableDomainTransferLock(params: EnableDomainTransferLockRequest): Request[EnableDomainTransferLockResponse] =
      js.native
    def getContactReachabilityStatus(
        params: GetContactReachabilityStatusRequest
    ): Request[GetContactReachabilityStatusResponse]                                                     = js.native
    def getDomainDetail(params: GetDomainDetailRequest): Request[GetDomainDetailResponse]                = js.native
    def getDomainSuggestions(params: GetDomainSuggestionsRequest): Request[GetDomainSuggestionsResponse] = js.native
    def getOperationDetail(params: GetOperationDetailRequest): Request[GetOperationDetailResponse]       = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse]                            = js.native
    def listOperations(params: ListOperationsRequest): Request[ListOperationsResponse]                   = js.native
    def listTagsForDomain(params: ListTagsForDomainRequest): Request[ListTagsForDomainResponse]          = js.native
    def registerDomain(params: RegisterDomainRequest): Request[RegisterDomainResponse]                   = js.native
    def renewDomain(params: RenewDomainRequest): Request[RenewDomainResponse]                            = js.native
    def resendContactReachabilityEmail(
        params: ResendContactReachabilityEmailRequest
    ): Request[ResendContactReachabilityEmailResponse] = js.native
    def retrieveDomainAuthCode(params: RetrieveDomainAuthCodeRequest): Request[RetrieveDomainAuthCodeResponse] =
      js.native
    def transferDomain(params: TransferDomainRequest): Request[TransferDomainResponse]                = js.native
    def updateDomainContact(params: UpdateDomainContactRequest): Request[UpdateDomainContactResponse] = js.native
    def updateDomainContactPrivacy(
        params: UpdateDomainContactPrivacyRequest
    ): Request[UpdateDomainContactPrivacyResponse] = js.native
    def updateDomainNameservers(params: UpdateDomainNameserversRequest): Request[UpdateDomainNameserversResponse] =
      js.native
    def updateTagsForDomain(params: UpdateTagsForDomainRequest): Request[UpdateTagsForDomainResponse] = js.native
    def viewBilling(params: ViewBillingRequest): Request[ViewBillingResponse]                         = js.native
  }

  /**
    * Information for one billing record.
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

  /**
    * The CheckDomainAvailability request contains the following elements.
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

  /**
    * The CheckDomainAvailability response includes the following elements.
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

  /**
    * The CheckDomainTransferability request contains the following elements.
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

  /**
    * The CheckDomainTransferability response includes the following elements.
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

  /**
    * ContactDetail includes the following elements.
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

  object ContactTypeEnum {
    val PERSON      = "PERSON"
    val COMPANY     = "COMPANY"
    val ASSOCIATION = "ASSOCIATION"
    val PUBLIC_BODY = "PUBLIC_BODY"
    val RESELLER    = "RESELLER"

    val values = js.Object.freeze(js.Array(PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY, RESELLER))
  }

  object CountryCodeEnum {
    val AD = "AD"
    val AE = "AE"
    val AF = "AF"
    val AG = "AG"
    val AI = "AI"
    val AL = "AL"
    val AM = "AM"
    val AN = "AN"
    val AO = "AO"
    val AQ = "AQ"
    val AR = "AR"
    val AS = "AS"
    val AT = "AT"
    val AU = "AU"
    val AW = "AW"
    val AZ = "AZ"
    val BA = "BA"
    val BB = "BB"
    val BD = "BD"
    val BE = "BE"
    val BF = "BF"
    val BG = "BG"
    val BH = "BH"
    val BI = "BI"
    val BJ = "BJ"
    val BL = "BL"
    val BM = "BM"
    val BN = "BN"
    val BO = "BO"
    val BR = "BR"
    val BS = "BS"
    val BT = "BT"
    val BW = "BW"
    val BY = "BY"
    val BZ = "BZ"
    val CA = "CA"
    val CC = "CC"
    val CD = "CD"
    val CF = "CF"
    val CG = "CG"
    val CH = "CH"
    val CI = "CI"
    val CK = "CK"
    val CL = "CL"
    val CM = "CM"
    val CN = "CN"
    val CO = "CO"
    val CR = "CR"
    val CU = "CU"
    val CV = "CV"
    val CX = "CX"
    val CY = "CY"
    val CZ = "CZ"
    val DE = "DE"
    val DJ = "DJ"
    val DK = "DK"
    val DM = "DM"
    val DO = "DO"
    val DZ = "DZ"
    val EC = "EC"
    val EE = "EE"
    val EG = "EG"
    val ER = "ER"
    val ES = "ES"
    val ET = "ET"
    val FI = "FI"
    val FJ = "FJ"
    val FK = "FK"
    val FM = "FM"
    val FO = "FO"
    val FR = "FR"
    val GA = "GA"
    val GB = "GB"
    val GD = "GD"
    val GE = "GE"
    val GH = "GH"
    val GI = "GI"
    val GL = "GL"
    val GM = "GM"
    val GN = "GN"
    val GQ = "GQ"
    val GR = "GR"
    val GT = "GT"
    val GU = "GU"
    val GW = "GW"
    val GY = "GY"
    val HK = "HK"
    val HN = "HN"
    val HR = "HR"
    val HT = "HT"
    val HU = "HU"
    val ID = "ID"
    val IE = "IE"
    val IL = "IL"
    val IM = "IM"
    val IN = "IN"
    val IQ = "IQ"
    val IR = "IR"
    val IS = "IS"
    val IT = "IT"
    val JM = "JM"
    val JO = "JO"
    val JP = "JP"
    val KE = "KE"
    val KG = "KG"
    val KH = "KH"
    val KI = "KI"
    val KM = "KM"
    val KN = "KN"
    val KP = "KP"
    val KR = "KR"
    val KW = "KW"
    val KY = "KY"
    val KZ = "KZ"
    val LA = "LA"
    val LB = "LB"
    val LC = "LC"
    val LI = "LI"
    val LK = "LK"
    val LR = "LR"
    val LS = "LS"
    val LT = "LT"
    val LU = "LU"
    val LV = "LV"
    val LY = "LY"
    val MA = "MA"
    val MC = "MC"
    val MD = "MD"
    val ME = "ME"
    val MF = "MF"
    val MG = "MG"
    val MH = "MH"
    val MK = "MK"
    val ML = "ML"
    val MM = "MM"
    val MN = "MN"
    val MO = "MO"
    val MP = "MP"
    val MR = "MR"
    val MS = "MS"
    val MT = "MT"
    val MU = "MU"
    val MV = "MV"
    val MW = "MW"
    val MX = "MX"
    val MY = "MY"
    val MZ = "MZ"
    val NA = "NA"
    val NC = "NC"
    val NE = "NE"
    val NG = "NG"
    val NI = "NI"
    val NL = "NL"
    val NO = "NO"
    val NP = "NP"
    val NR = "NR"
    val NU = "NU"
    val NZ = "NZ"
    val OM = "OM"
    val PA = "PA"
    val PE = "PE"
    val PF = "PF"
    val PG = "PG"
    val PH = "PH"
    val PK = "PK"
    val PL = "PL"
    val PM = "PM"
    val PN = "PN"
    val PR = "PR"
    val PT = "PT"
    val PW = "PW"
    val PY = "PY"
    val QA = "QA"
    val RO = "RO"
    val RS = "RS"
    val RU = "RU"
    val RW = "RW"
    val SA = "SA"
    val SB = "SB"
    val SC = "SC"
    val SD = "SD"
    val SE = "SE"
    val SG = "SG"
    val SH = "SH"
    val SI = "SI"
    val SK = "SK"
    val SL = "SL"
    val SM = "SM"
    val SN = "SN"
    val SO = "SO"
    val SR = "SR"
    val ST = "ST"
    val SV = "SV"
    val SY = "SY"
    val SZ = "SZ"
    val TC = "TC"
    val TD = "TD"
    val TG = "TG"
    val TH = "TH"
    val TJ = "TJ"
    val TK = "TK"
    val TL = "TL"
    val TM = "TM"
    val TN = "TN"
    val TO = "TO"
    val TR = "TR"
    val TT = "TT"
    val TV = "TV"
    val TW = "TW"
    val TZ = "TZ"
    val UA = "UA"
    val UG = "UG"
    val US = "US"
    val UY = "UY"
    val UZ = "UZ"
    val VA = "VA"
    val VC = "VC"
    val VE = "VE"
    val VG = "VG"
    val VI = "VI"
    val VN = "VN"
    val VU = "VU"
    val WF = "WF"
    val WS = "WS"
    val YE = "YE"
    val YT = "YT"
    val ZA = "ZA"
    val ZM = "ZM"
    val ZW = "ZW"

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * The DeleteTagsForDomainRequest includes the following elements.
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
        "DomainName"   -> DomainName.asInstanceOf[js.Any],
        "TagsToDelete" -> TagsToDelete.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTagsForDomainRequest]
    }
  }

  @js.native
  trait DeleteTagsForDomainResponse extends js.Object {}

  object DeleteTagsForDomainResponse {
    @inline
    def apply(
        ): DeleteTagsForDomainResponse = {
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
  trait DisableDomainAutoRenewResponse extends js.Object {}

  object DisableDomainAutoRenewResponse {
    @inline
    def apply(
        ): DisableDomainAutoRenewResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisableDomainAutoRenewResponse]
    }
  }

  /**
    * The DisableDomainTransferLock request includes the following element.
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

  /**
    * The DisableDomainTransferLock response includes the following element.
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

  object DomainAvailabilityEnum {
    val AVAILABLE              = "AVAILABLE"
    val AVAILABLE_RESERVED     = "AVAILABLE_RESERVED"
    val AVAILABLE_PREORDER     = "AVAILABLE_PREORDER"
    val UNAVAILABLE            = "UNAVAILABLE"
    val UNAVAILABLE_PREMIUM    = "UNAVAILABLE_PREMIUM"
    val UNAVAILABLE_RESTRICTED = "UNAVAILABLE_RESTRICTED"
    val RESERVED               = "RESERVED"
    val DONT_KNOW              = "DONT_KNOW"

    val values = js.Object.freeze(
      js.Array(
        AVAILABLE,
        AVAILABLE_RESERVED,
        AVAILABLE_PREORDER,
        UNAVAILABLE,
        UNAVAILABLE_PREMIUM,
        UNAVAILABLE_RESTRICTED,
        RESERVED,
        DONT_KNOW
      )
    )
  }

  /**
    * The number of domains has exceeded the allowed threshold for the account.
    */
  @js.native
  trait DomainLimitExceededException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Information about one suggested domain name.
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

  /**
    * Summary information about one domain.
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

  /**
    * A complex type that contains information about whether the specified domain can be transferred to Amazon Route 53.
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

  /**
    * The request is already in progress for the domain.
    */
  @js.native
  trait DuplicateRequestException extends js.Object {
    val message: ErrorMessage
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
  trait EnableDomainAutoRenewResponse extends js.Object {}

  object EnableDomainAutoRenewResponse {
    @inline
    def apply(
        ): EnableDomainAutoRenewResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[EnableDomainAutoRenewResponse]
    }
  }

  /**
    * A request to set the transfer lock for the specified domain.
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

  /**
    * The EnableDomainTransferLock response includes the following elements.
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

  /**
    * ExtraParam includes the following elements.
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
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExtraParam]
    }
  }

  object ExtraParamNameEnum {
    val DUNS_NUMBER               = "DUNS_NUMBER"
    val BRAND_NUMBER              = "BRAND_NUMBER"
    val BIRTH_DEPARTMENT          = "BIRTH_DEPARTMENT"
    val BIRTH_DATE_IN_YYYY_MM_DD  = "BIRTH_DATE_IN_YYYY_MM_DD"
    val BIRTH_COUNTRY             = "BIRTH_COUNTRY"
    val BIRTH_CITY                = "BIRTH_CITY"
    val DOCUMENT_NUMBER           = "DOCUMENT_NUMBER"
    val AU_ID_NUMBER              = "AU_ID_NUMBER"
    val AU_ID_TYPE                = "AU_ID_TYPE"
    val CA_LEGAL_TYPE             = "CA_LEGAL_TYPE"
    val CA_BUSINESS_ENTITY_TYPE   = "CA_BUSINESS_ENTITY_TYPE"
    val ES_IDENTIFICATION         = "ES_IDENTIFICATION"
    val ES_IDENTIFICATION_TYPE    = "ES_IDENTIFICATION_TYPE"
    val ES_LEGAL_FORM             = "ES_LEGAL_FORM"
    val FI_BUSINESS_NUMBER        = "FI_BUSINESS_NUMBER"
    val FI_ID_NUMBER              = "FI_ID_NUMBER"
    val FI_NATIONALITY            = "FI_NATIONALITY"
    val FI_ORGANIZATION_TYPE      = "FI_ORGANIZATION_TYPE"
    val IT_PIN                    = "IT_PIN"
    val IT_REGISTRANT_ENTITY_TYPE = "IT_REGISTRANT_ENTITY_TYPE"
    val RU_PASSPORT_DATA          = "RU_PASSPORT_DATA"
    val SE_ID_NUMBER              = "SE_ID_NUMBER"
    val SG_ID_NUMBER              = "SG_ID_NUMBER"
    val VAT_NUMBER                = "VAT_NUMBER"
    val UK_CONTACT_TYPE           = "UK_CONTACT_TYPE"
    val UK_COMPANY_NUMBER         = "UK_COMPANY_NUMBER"

    val values = js.Object.freeze(
      js.Array(
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
        ES_IDENTIFICATION,
        ES_IDENTIFICATION_TYPE,
        ES_LEGAL_FORM,
        FI_BUSINESS_NUMBER,
        FI_ID_NUMBER,
        FI_NATIONALITY,
        FI_ORGANIZATION_TYPE,
        IT_PIN,
        IT_REGISTRANT_ENTITY_TYPE,
        RU_PASSPORT_DATA,
        SE_ID_NUMBER,
        SG_ID_NUMBER,
        VAT_NUMBER,
        UK_CONTACT_TYPE,
        UK_COMPANY_NUMBER
      )
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

  /**
    * The GetDomainDetail request includes the following element.
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

  /**
    * The GetDomainDetail response includes the following elements.
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
        "AdminContact"      -> AdminContact.asInstanceOf[js.Any],
        "DomainName"        -> DomainName.asInstanceOf[js.Any],
        "Nameservers"       -> Nameservers.asInstanceOf[js.Any],
        "RegistrantContact" -> RegistrantContact.asInstanceOf[js.Any],
        "TechContact"       -> TechContact.asInstanceOf[js.Any]
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
        "DomainName"      -> DomainName.asInstanceOf[js.Any],
        "OnlyAvailable"   -> OnlyAvailable.asInstanceOf[js.Any],
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

  /**
    * The <a>GetOperationDetail</a> request includes the following element.
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

  /**
    * The GetOperationDetail response includes the following elements.
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

  /**
    * The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account.
    */
  @js.native
  trait InvalidInputException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The ListDomains request includes the following elements.
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

  /**
    * The ListDomains response includes the following elements.
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

  /**
    * The ListOperations request includes the following elements.
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

  /**
    * The ListOperations response includes the following elements.
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

  /**
    * The ListTagsForDomainRequest includes the following elements.
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

  /**
    * The ListTagsForDomain response includes the following elements.
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

  /**
    * Nameserver includes the following elements.
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

  /**
    * The number of operations or jobs running exceeded the allowed threshold for the account.
    */
  @js.native
  trait OperationLimitExceededException extends js.Object {
    val message: ErrorMessage
  }

  object OperationStatusEnum {
    val SUBMITTED   = "SUBMITTED"
    val IN_PROGRESS = "IN_PROGRESS"
    val ERROR       = "ERROR"
    val SUCCESSFUL  = "SUCCESSFUL"
    val FAILED      = "FAILED"

    val values = js.Object.freeze(js.Array(SUBMITTED, IN_PROGRESS, ERROR, SUCCESSFUL, FAILED))
  }

  /**
    * OperationSummary includes the following elements.
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
        "OperationId"   -> OperationId.asInstanceOf[js.Any],
        "Status"        -> Status.asInstanceOf[js.Any],
        "SubmittedDate" -> SubmittedDate.asInstanceOf[js.Any],
        "Type"          -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OperationSummary]
    }
  }

  object OperationTypeEnum {
    val REGISTER_DOMAIN           = "REGISTER_DOMAIN"
    val DELETE_DOMAIN             = "DELETE_DOMAIN"
    val TRANSFER_IN_DOMAIN        = "TRANSFER_IN_DOMAIN"
    val UPDATE_DOMAIN_CONTACT     = "UPDATE_DOMAIN_CONTACT"
    val UPDATE_NAMESERVER         = "UPDATE_NAMESERVER"
    val CHANGE_PRIVACY_PROTECTION = "CHANGE_PRIVACY_PROTECTION"
    val DOMAIN_LOCK               = "DOMAIN_LOCK"
    val ENABLE_AUTORENEW          = "ENABLE_AUTORENEW"
    val DISABLE_AUTORENEW         = "DISABLE_AUTORENEW"
    val ADD_DNSSEC                = "ADD_DNSSEC"
    val REMOVE_DNSSEC             = "REMOVE_DNSSEC"
    val EXPIRE_DOMAIN             = "EXPIRE_DOMAIN"
    val TRANSFER_OUT_DOMAIN       = "TRANSFER_OUT_DOMAIN"
    val CHANGE_DOMAIN_OWNER       = "CHANGE_DOMAIN_OWNER"
    val RENEW_DOMAIN              = "RENEW_DOMAIN"
    val PUSH_DOMAIN               = "PUSH_DOMAIN"

    val values = js.Object.freeze(
      js.Array(
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
        PUSH_DOMAIN
      )
    )
  }

  object ReachabilityStatusEnum {
    val PENDING = "PENDING"
    val DONE    = "DONE"
    val EXPIRED = "EXPIRED"

    val values = js.Object.freeze(js.Array(PENDING, DONE, EXPIRED))
  }

  /**
    * The RegisterDomain request includes the following elements.
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
        "AdminContact"      -> AdminContact.asInstanceOf[js.Any],
        "DomainName"        -> DomainName.asInstanceOf[js.Any],
        "DurationInYears"   -> DurationInYears.asInstanceOf[js.Any],
        "RegistrantContact" -> RegistrantContact.asInstanceOf[js.Any],
        "TechContact"       -> TechContact.asInstanceOf[js.Any]
      )

      AutoRenew.foreach(__v => __obj.updateDynamic("AutoRenew")(__v.asInstanceOf[js.Any]))
      IdnLangCode.foreach(__v => __obj.updateDynamic("IdnLangCode")(__v.asInstanceOf[js.Any]))
      PrivacyProtectAdminContact.foreach(__v =>
        __obj.updateDynamic("PrivacyProtectAdminContact")(__v.asInstanceOf[js.Any])
      )
      PrivacyProtectRegistrantContact.foreach(__v =>
        __obj.updateDynamic("PrivacyProtectRegistrantContact")(__v.asInstanceOf[js.Any])
      )
      PrivacyProtectTechContact.foreach(__v =>
        __obj.updateDynamic("PrivacyProtectTechContact")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[RegisterDomainRequest]
    }
  }

  /**
    * The RegisterDomain response includes the following element.
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

  /**
    * A <code>RenewDomain</code> request includes the number of years that you want to renew for and the current expiration year.
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
        "DomainName"        -> DomainName.asInstanceOf[js.Any]
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

  /**
    * A request for the authorization code for the specified domain. To transfer a domain to another registrar, you provide this value to the new registrar.
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

  /**
    * The RetrieveDomainAuthCode response includes the following element.
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

  /**
    * The top-level domain does not support this operation.
    */
  @js.native
  trait TLDRulesViolationException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Each tag includes the following elements.
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

  /**
    * The TransferDomain request includes the following elements.
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
        "AdminContact"      -> AdminContact.asInstanceOf[js.Any],
        "DomainName"        -> DomainName.asInstanceOf[js.Any],
        "DurationInYears"   -> DurationInYears.asInstanceOf[js.Any],
        "RegistrantContact" -> RegistrantContact.asInstanceOf[js.Any],
        "TechContact"       -> TechContact.asInstanceOf[js.Any]
      )

      AuthCode.foreach(__v => __obj.updateDynamic("AuthCode")(__v.asInstanceOf[js.Any]))
      AutoRenew.foreach(__v => __obj.updateDynamic("AutoRenew")(__v.asInstanceOf[js.Any]))
      IdnLangCode.foreach(__v => __obj.updateDynamic("IdnLangCode")(__v.asInstanceOf[js.Any]))
      Nameservers.foreach(__v => __obj.updateDynamic("Nameservers")(__v.asInstanceOf[js.Any]))
      PrivacyProtectAdminContact.foreach(__v =>
        __obj.updateDynamic("PrivacyProtectAdminContact")(__v.asInstanceOf[js.Any])
      )
      PrivacyProtectRegistrantContact.foreach(__v =>
        __obj.updateDynamic("PrivacyProtectRegistrantContact")(__v.asInstanceOf[js.Any])
      )
      PrivacyProtectTechContact.foreach(__v =>
        __obj.updateDynamic("PrivacyProtectTechContact")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[TransferDomainRequest]
    }
  }

  /**
    * The TranserDomain response includes the following element.
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

  /**
    * Whether the domain name can be transferred to Amazon Route 53.
    *
    * '''Note:'''You can transfer only domains that have a value of <code>TRANSFERABLE</code> for <code>Transferable</code>.
    * Valid values:
    *  <dl> <dt>TRANSFERABLE</dt> <dd> The domain name can be transferred to Amazon Route 53.
    *  </dd> <dt>UNTRANSFERRABLE</dt> <dd> The domain name can't be transferred to Amazon Route 53.
    *  </dd> <dt>DONT_KNOW</dt> <dd> Reserved for future use.
    *  </dd> </dl>
    */
  object TransferableEnum {
    val TRANSFERABLE   = "TRANSFERABLE"
    val UNTRANSFERABLE = "UNTRANSFERABLE"
    val DONT_KNOW      = "DONT_KNOW"

    val values = js.Object.freeze(js.Array(TRANSFERABLE, UNTRANSFERABLE, DONT_KNOW))
  }

  /**
    * Amazon Route 53 does not support this top-level domain (TLD).
    */
  @js.native
  trait UnsupportedTLDException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The UpdateDomainContactPrivacy request includes the following elements.
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

  /**
    * The UpdateDomainContactPrivacy response includes the following element.
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

  /**
    * The UpdateDomainContact request includes the following elements.
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

  /**
    * The UpdateDomainContact response includes the following element.
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

  /**
    * Replaces the current set of name servers for the domain with the specified set of name servers. If you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted zone for the domain.
    *  If successful, this operation returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email.
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
        "DomainName"  -> DomainName.asInstanceOf[js.Any],
        "Nameservers" -> Nameservers.asInstanceOf[js.Any]
      )

      FIAuthKey.foreach(__v => __obj.updateDynamic("FIAuthKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainNameserversRequest]
    }
  }

  /**
    * The UpdateDomainNameservers response includes the following element.
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

  /**
    * The UpdateTagsForDomainRequest includes the following elements.
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
  trait UpdateTagsForDomainResponse extends js.Object {}

  object UpdateTagsForDomainResponse {
    @inline
    def apply(
        ): UpdateTagsForDomainResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateTagsForDomainResponse]
    }
  }

  /**
    * The ViewBilling request includes the following elements.
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

  /**
    * The ViewBilling response includes the following elements.
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
