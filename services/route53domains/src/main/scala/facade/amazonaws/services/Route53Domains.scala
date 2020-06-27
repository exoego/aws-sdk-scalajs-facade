package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object route53domains {
  type AddressLine           = String
  type BillingRecords        = js.Array[BillingRecord]
  type City                  = String
  type ContactName           = String
  type ContactNumber         = String
  type CurrentExpiryYear     = Int
  type DNSSec                = String
  type DomainAuthCode        = String
  type DomainName            = String
  type DomainStatus          = String
  type DomainStatusList      = js.Array[DomainStatus]
  type DomainSuggestionsList = js.Array[DomainSuggestion]
  type DomainSummaryList     = js.Array[DomainSummary]
  type DurationInYears       = Int
  type Email                 = String
  type ErrorMessage          = String
  type ExtraParamList        = js.Array[ExtraParam]
  type ExtraParamValue       = String
  type FIAuthKey             = String
  type GlueIp                = String
  type GlueIpList            = js.Array[GlueIp]
  type HostName              = String
  type InvoiceId             = String
  type LangCode              = String
  type NameserverList        = js.Array[Nameserver]
  type OperationId           = String
  type OperationSummaryList  = js.Array[OperationSummary]
  type PageMarker            = String
  type PageMaxItems          = Int
  type Price                 = Double
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
  type ZipCode               = String

  implicit final class Route53DomainsOps(private val service: Route53Domains) extends AnyVal {

    @inline def checkDomainAvailabilityFuture(
        params: CheckDomainAvailabilityRequest
    ): Future[CheckDomainAvailabilityResponse] = service.checkDomainAvailability(params).promise().toFuture
    @inline def checkDomainTransferabilityFuture(
        params: CheckDomainTransferabilityRequest
    ): Future[CheckDomainTransferabilityResponse] = service.checkDomainTransferability(params).promise().toFuture
    @inline def deleteTagsForDomainFuture(params: DeleteTagsForDomainRequest): Future[DeleteTagsForDomainResponse] =
      service.deleteTagsForDomain(params).promise().toFuture
    @inline def disableDomainAutoRenewFuture(
        params: DisableDomainAutoRenewRequest
    ): Future[DisableDomainAutoRenewResponse] = service.disableDomainAutoRenew(params).promise().toFuture
    @inline def disableDomainTransferLockFuture(
        params: DisableDomainTransferLockRequest
    ): Future[DisableDomainTransferLockResponse] = service.disableDomainTransferLock(params).promise().toFuture
    @inline def enableDomainAutoRenewFuture(
        params: EnableDomainAutoRenewRequest
    ): Future[EnableDomainAutoRenewResponse] = service.enableDomainAutoRenew(params).promise().toFuture
    @inline def enableDomainTransferLockFuture(
        params: EnableDomainTransferLockRequest
    ): Future[EnableDomainTransferLockResponse] = service.enableDomainTransferLock(params).promise().toFuture
    @inline def getContactReachabilityStatusFuture(
        params: GetContactReachabilityStatusRequest
    ): Future[GetContactReachabilityStatusResponse] = service.getContactReachabilityStatus(params).promise().toFuture
    @inline def getDomainDetailFuture(params: GetDomainDetailRequest): Future[GetDomainDetailResponse] =
      service.getDomainDetail(params).promise().toFuture
    @inline def getDomainSuggestionsFuture(params: GetDomainSuggestionsRequest): Future[GetDomainSuggestionsResponse] =
      service.getDomainSuggestions(params).promise().toFuture
    @inline def getOperationDetailFuture(params: GetOperationDetailRequest): Future[GetOperationDetailResponse] =
      service.getOperationDetail(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResponse] =
      service.listDomains(params).promise().toFuture
    @inline def listOperationsFuture(params: ListOperationsRequest): Future[ListOperationsResponse] =
      service.listOperations(params).promise().toFuture
    @inline def listTagsForDomainFuture(params: ListTagsForDomainRequest): Future[ListTagsForDomainResponse] =
      service.listTagsForDomain(params).promise().toFuture
    @inline def registerDomainFuture(params: RegisterDomainRequest): Future[RegisterDomainResponse] =
      service.registerDomain(params).promise().toFuture
    @inline def renewDomainFuture(params: RenewDomainRequest): Future[RenewDomainResponse] =
      service.renewDomain(params).promise().toFuture
    @inline def resendContactReachabilityEmailFuture(
        params: ResendContactReachabilityEmailRequest
    ): Future[ResendContactReachabilityEmailResponse] =
      service.resendContactReachabilityEmail(params).promise().toFuture
    @inline def retrieveDomainAuthCodeFuture(
        params: RetrieveDomainAuthCodeRequest
    ): Future[RetrieveDomainAuthCodeResponse] = service.retrieveDomainAuthCode(params).promise().toFuture
    @inline def transferDomainFuture(params: TransferDomainRequest): Future[TransferDomainResponse] =
      service.transferDomain(params).promise().toFuture
    @inline def updateDomainContactFuture(params: UpdateDomainContactRequest): Future[UpdateDomainContactResponse] =
      service.updateDomainContact(params).promise().toFuture
    @inline def updateDomainContactPrivacyFuture(
        params: UpdateDomainContactPrivacyRequest
    ): Future[UpdateDomainContactPrivacyResponse] = service.updateDomainContactPrivacy(params).promise().toFuture
    @inline def updateDomainNameserversFuture(
        params: UpdateDomainNameserversRequest
    ): Future[UpdateDomainNameserversResponse] = service.updateDomainNameservers(params).promise().toFuture
    @inline def updateTagsForDomainFuture(params: UpdateTagsForDomainRequest): Future[UpdateTagsForDomainResponse] =
      service.updateTagsForDomain(params).promise().toFuture
    @inline def viewBillingFuture(params: ViewBillingRequest): Future[ViewBillingResponse] =
      service.viewBilling(params).promise().toFuture
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
  @Factory
  trait BillingRecord extends js.Object {
    var BillDate: js.UndefOr[Timestamp]
    var DomainName: js.UndefOr[DomainName]
    var InvoiceId: js.UndefOr[InvoiceId]
    var Operation: js.UndefOr[OperationType]
    var Price: js.UndefOr[Price]
  }

  /**
    * The CheckDomainAvailability request contains the following elements.
    */
  @js.native
  @Factory
  trait CheckDomainAvailabilityRequest extends js.Object {
    var DomainName: DomainName
    var IdnLangCode: js.UndefOr[LangCode]
  }

  /**
    * The CheckDomainAvailability response includes the following elements.
    */
  @js.native
  @Factory
  trait CheckDomainAvailabilityResponse extends js.Object {
    var Availability: DomainAvailability
  }

  /**
    * The CheckDomainTransferability request contains the following elements.
    */
  @js.native
  @Factory
  trait CheckDomainTransferabilityRequest extends js.Object {
    var DomainName: DomainName
    var AuthCode: js.UndefOr[DomainAuthCode]
  }

  /**
    * The CheckDomainTransferability response includes the following elements.
    */
  @js.native
  @Factory
  trait CheckDomainTransferabilityResponse extends js.Object {
    var Transferability: DomainTransferability
  }

  /**
    * ContactDetail includes the following elements.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ContactType extends js.Any
  object ContactType extends js.Object {
    val PERSON      = "PERSON".asInstanceOf[ContactType]
    val COMPANY     = "COMPANY".asInstanceOf[ContactType]
    val ASSOCIATION = "ASSOCIATION".asInstanceOf[ContactType]
    val PUBLIC_BODY = "PUBLIC_BODY".asInstanceOf[ContactType]
    val RESELLER    = "RESELLER".asInstanceOf[ContactType]

    val values = js.Object.freeze(js.Array(PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY, RESELLER))
  }

  @js.native
  sealed trait CountryCode extends js.Any
  object CountryCode extends js.Object {
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
  @Factory
  trait DeleteTagsForDomainRequest extends js.Object {
    var DomainName: DomainName
    var TagsToDelete: TagKeyList
  }

  @js.native
  @Factory
  trait DeleteTagsForDomainResponse extends js.Object {}

  @js.native
  @Factory
  trait DisableDomainAutoRenewRequest extends js.Object {
    var DomainName: DomainName
  }

  @js.native
  @Factory
  trait DisableDomainAutoRenewResponse extends js.Object {}

  /**
    * The DisableDomainTransferLock request includes the following element.
    */
  @js.native
  @Factory
  trait DisableDomainTransferLockRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The DisableDomainTransferLock response includes the following element.
    */
  @js.native
  @Factory
  trait DisableDomainTransferLockResponse extends js.Object {
    var OperationId: OperationId
  }

  @js.native
  sealed trait DomainAvailability extends js.Any
  object DomainAvailability extends js.Object {
    val AVAILABLE              = "AVAILABLE".asInstanceOf[DomainAvailability]
    val AVAILABLE_RESERVED     = "AVAILABLE_RESERVED".asInstanceOf[DomainAvailability]
    val AVAILABLE_PREORDER     = "AVAILABLE_PREORDER".asInstanceOf[DomainAvailability]
    val UNAVAILABLE            = "UNAVAILABLE".asInstanceOf[DomainAvailability]
    val UNAVAILABLE_PREMIUM    = "UNAVAILABLE_PREMIUM".asInstanceOf[DomainAvailability]
    val UNAVAILABLE_RESTRICTED = "UNAVAILABLE_RESTRICTED".asInstanceOf[DomainAvailability]
    val RESERVED               = "RESERVED".asInstanceOf[DomainAvailability]
    val DONT_KNOW              = "DONT_KNOW".asInstanceOf[DomainAvailability]

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
  @Factory
  trait DomainSuggestion extends js.Object {
    var Availability: js.UndefOr[String]
    var DomainName: js.UndefOr[DomainName]
  }

  /**
    * Summary information about one domain.
    */
  @js.native
  @Factory
  trait DomainSummary extends js.Object {
    var DomainName: DomainName
    var AutoRenew: js.UndefOr[Boolean]
    var Expiry: js.UndefOr[Timestamp]
    var TransferLock: js.UndefOr[Boolean]
  }

  /**
    * A complex type that contains information about whether the specified domain can be transferred to Amazon Route 53.
    */
  @js.native
  @Factory
  trait DomainTransferability extends js.Object {
    var Transferable: js.UndefOr[Transferable]
  }

  /**
    * The request is already in progress for the domain.
    */
  @js.native
  trait DuplicateRequestException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  @Factory
  trait EnableDomainAutoRenewRequest extends js.Object {
    var DomainName: DomainName
  }

  @js.native
  @Factory
  trait EnableDomainAutoRenewResponse extends js.Object {}

  /**
    * A request to set the transfer lock for the specified domain.
    */
  @js.native
  @Factory
  trait EnableDomainTransferLockRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The EnableDomainTransferLock response includes the following elements.
    */
  @js.native
  @Factory
  trait EnableDomainTransferLockResponse extends js.Object {
    var OperationId: OperationId
  }

  /**
    * ExtraParam includes the following elements.
    */
  @js.native
  @Factory
  trait ExtraParam extends js.Object {
    var Name: ExtraParamName
    var Value: ExtraParamValue
  }

  @js.native
  sealed trait ExtraParamName extends js.Any
  object ExtraParamName extends js.Object {
    val DUNS_NUMBER               = "DUNS_NUMBER".asInstanceOf[ExtraParamName]
    val BRAND_NUMBER              = "BRAND_NUMBER".asInstanceOf[ExtraParamName]
    val BIRTH_DEPARTMENT          = "BIRTH_DEPARTMENT".asInstanceOf[ExtraParamName]
    val BIRTH_DATE_IN_YYYY_MM_DD  = "BIRTH_DATE_IN_YYYY_MM_DD".asInstanceOf[ExtraParamName]
    val BIRTH_COUNTRY             = "BIRTH_COUNTRY".asInstanceOf[ExtraParamName]
    val BIRTH_CITY                = "BIRTH_CITY".asInstanceOf[ExtraParamName]
    val DOCUMENT_NUMBER           = "DOCUMENT_NUMBER".asInstanceOf[ExtraParamName]
    val AU_ID_NUMBER              = "AU_ID_NUMBER".asInstanceOf[ExtraParamName]
    val AU_ID_TYPE                = "AU_ID_TYPE".asInstanceOf[ExtraParamName]
    val CA_LEGAL_TYPE             = "CA_LEGAL_TYPE".asInstanceOf[ExtraParamName]
    val CA_BUSINESS_ENTITY_TYPE   = "CA_BUSINESS_ENTITY_TYPE".asInstanceOf[ExtraParamName]
    val ES_IDENTIFICATION         = "ES_IDENTIFICATION".asInstanceOf[ExtraParamName]
    val ES_IDENTIFICATION_TYPE    = "ES_IDENTIFICATION_TYPE".asInstanceOf[ExtraParamName]
    val ES_LEGAL_FORM             = "ES_LEGAL_FORM".asInstanceOf[ExtraParamName]
    val FI_BUSINESS_NUMBER        = "FI_BUSINESS_NUMBER".asInstanceOf[ExtraParamName]
    val FI_ID_NUMBER              = "FI_ID_NUMBER".asInstanceOf[ExtraParamName]
    val FI_NATIONALITY            = "FI_NATIONALITY".asInstanceOf[ExtraParamName]
    val FI_ORGANIZATION_TYPE      = "FI_ORGANIZATION_TYPE".asInstanceOf[ExtraParamName]
    val IT_PIN                    = "IT_PIN".asInstanceOf[ExtraParamName]
    val IT_REGISTRANT_ENTITY_TYPE = "IT_REGISTRANT_ENTITY_TYPE".asInstanceOf[ExtraParamName]
    val RU_PASSPORT_DATA          = "RU_PASSPORT_DATA".asInstanceOf[ExtraParamName]
    val SE_ID_NUMBER              = "SE_ID_NUMBER".asInstanceOf[ExtraParamName]
    val SG_ID_NUMBER              = "SG_ID_NUMBER".asInstanceOf[ExtraParamName]
    val VAT_NUMBER                = "VAT_NUMBER".asInstanceOf[ExtraParamName]
    val UK_CONTACT_TYPE           = "UK_CONTACT_TYPE".asInstanceOf[ExtraParamName]
    val UK_COMPANY_NUMBER         = "UK_COMPANY_NUMBER".asInstanceOf[ExtraParamName]

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
  @Factory
  trait GetContactReachabilityStatusRequest extends js.Object {
    var domainName: js.UndefOr[DomainName]
  }

  @js.native
  @Factory
  trait GetContactReachabilityStatusResponse extends js.Object {
    var domainName: js.UndefOr[DomainName]
    var status: js.UndefOr[ReachabilityStatus]
  }

  /**
    * The GetDomainDetail request includes the following element.
    */
  @js.native
  @Factory
  trait GetDomainDetailRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The GetDomainDetail response includes the following elements.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetDomainSuggestionsRequest extends js.Object {
    var DomainName: DomainName
    var OnlyAvailable: Boolean
    var SuggestionCount: Int
  }

  @js.native
  @Factory
  trait GetDomainSuggestionsResponse extends js.Object {
    var SuggestionsList: js.UndefOr[DomainSuggestionsList]
  }

  /**
    * The <a>GetOperationDetail</a> request includes the following element.
    */
  @js.native
  @Factory
  trait GetOperationDetailRequest extends js.Object {
    var OperationId: OperationId
  }

  /**
    * The GetOperationDetail response includes the following elements.
    */
  @js.native
  @Factory
  trait GetOperationDetailResponse extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var Message: js.UndefOr[ErrorMessage]
    var OperationId: js.UndefOr[OperationId]
    var Status: js.UndefOr[OperationStatus]
    var SubmittedDate: js.UndefOr[Timestamp]
    var Type: js.UndefOr[OperationType]
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
  @Factory
  trait ListDomainsRequest extends js.Object {
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  /**
    * The ListDomains response includes the following elements.
    */
  @js.native
  @Factory
  trait ListDomainsResponse extends js.Object {
    var Domains: DomainSummaryList
    var NextPageMarker: js.UndefOr[PageMarker]
  }

  /**
    * The ListOperations request includes the following elements.
    */
  @js.native
  @Factory
  trait ListOperationsRequest extends js.Object {
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
    var SubmittedSince: js.UndefOr[Timestamp]
  }

  /**
    * The ListOperations response includes the following elements.
    */
  @js.native
  @Factory
  trait ListOperationsResponse extends js.Object {
    var Operations: OperationSummaryList
    var NextPageMarker: js.UndefOr[PageMarker]
  }

  /**
    * The ListTagsForDomainRequest includes the following elements.
    */
  @js.native
  @Factory
  trait ListTagsForDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The ListTagsForDomain response includes the following elements.
    */
  @js.native
  @Factory
  trait ListTagsForDomainResponse extends js.Object {
    var TagList: TagList
  }

  /**
    * Nameserver includes the following elements.
    */
  @js.native
  @Factory
  trait Nameserver extends js.Object {
    var Name: HostName
    var GlueIps: js.UndefOr[GlueIpList]
  }

  /**
    * The number of operations or jobs running exceeded the allowed threshold for the account.
    */
  @js.native
  trait OperationLimitExceededException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  sealed trait OperationStatus extends js.Any
  object OperationStatus extends js.Object {
    val SUBMITTED   = "SUBMITTED".asInstanceOf[OperationStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[OperationStatus]
    val ERROR       = "ERROR".asInstanceOf[OperationStatus]
    val SUCCESSFUL  = "SUCCESSFUL".asInstanceOf[OperationStatus]
    val FAILED      = "FAILED".asInstanceOf[OperationStatus]

    val values = js.Object.freeze(js.Array(SUBMITTED, IN_PROGRESS, ERROR, SUCCESSFUL, FAILED))
  }

  /**
    * OperationSummary includes the following elements.
    */
  @js.native
  @Factory
  trait OperationSummary extends js.Object {
    var OperationId: OperationId
    var Status: OperationStatus
    var SubmittedDate: Timestamp
    var Type: OperationType
  }

  @js.native
  sealed trait OperationType extends js.Any
  object OperationType extends js.Object {
    val REGISTER_DOMAIN           = "REGISTER_DOMAIN".asInstanceOf[OperationType]
    val DELETE_DOMAIN             = "DELETE_DOMAIN".asInstanceOf[OperationType]
    val TRANSFER_IN_DOMAIN        = "TRANSFER_IN_DOMAIN".asInstanceOf[OperationType]
    val UPDATE_DOMAIN_CONTACT     = "UPDATE_DOMAIN_CONTACT".asInstanceOf[OperationType]
    val UPDATE_NAMESERVER         = "UPDATE_NAMESERVER".asInstanceOf[OperationType]
    val CHANGE_PRIVACY_PROTECTION = "CHANGE_PRIVACY_PROTECTION".asInstanceOf[OperationType]
    val DOMAIN_LOCK               = "DOMAIN_LOCK".asInstanceOf[OperationType]
    val ENABLE_AUTORENEW          = "ENABLE_AUTORENEW".asInstanceOf[OperationType]
    val DISABLE_AUTORENEW         = "DISABLE_AUTORENEW".asInstanceOf[OperationType]
    val ADD_DNSSEC                = "ADD_DNSSEC".asInstanceOf[OperationType]
    val REMOVE_DNSSEC             = "REMOVE_DNSSEC".asInstanceOf[OperationType]
    val EXPIRE_DOMAIN             = "EXPIRE_DOMAIN".asInstanceOf[OperationType]
    val TRANSFER_OUT_DOMAIN       = "TRANSFER_OUT_DOMAIN".asInstanceOf[OperationType]
    val CHANGE_DOMAIN_OWNER       = "CHANGE_DOMAIN_OWNER".asInstanceOf[OperationType]
    val RENEW_DOMAIN              = "RENEW_DOMAIN".asInstanceOf[OperationType]
    val PUSH_DOMAIN               = "PUSH_DOMAIN".asInstanceOf[OperationType]

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

  @js.native
  sealed trait ReachabilityStatus extends js.Any
  object ReachabilityStatus extends js.Object {
    val PENDING = "PENDING".asInstanceOf[ReachabilityStatus]
    val DONE    = "DONE".asInstanceOf[ReachabilityStatus]
    val EXPIRED = "EXPIRED".asInstanceOf[ReachabilityStatus]

    val values = js.Object.freeze(js.Array(PENDING, DONE, EXPIRED))
  }

  /**
    * The RegisterDomain request includes the following elements.
    */
  @js.native
  @Factory
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

  /**
    * The RegisterDomain response includes the following element.
    */
  @js.native
  @Factory
  trait RegisterDomainResponse extends js.Object {
    var OperationId: OperationId
  }

  /**
    * A <code>RenewDomain</code> request includes the number of years that you want to renew for and the current expiration year.
    */
  @js.native
  @Factory
  trait RenewDomainRequest extends js.Object {
    var CurrentExpiryYear: CurrentExpiryYear
    var DomainName: DomainName
    var DurationInYears: js.UndefOr[DurationInYears]
  }

  @js.native
  @Factory
  trait RenewDomainResponse extends js.Object {
    var OperationId: OperationId
  }

  @js.native
  @Factory
  trait ResendContactReachabilityEmailRequest extends js.Object {
    var domainName: js.UndefOr[DomainName]
  }

  @js.native
  @Factory
  trait ResendContactReachabilityEmailResponse extends js.Object {
    var domainName: js.UndefOr[DomainName]
    var emailAddress: js.UndefOr[Email]
    var isAlreadyVerified: js.UndefOr[Boolean]
  }

  /**
    * A request for the authorization code for the specified domain. To transfer a domain to another registrar, you provide this value to the new registrar.
    */
  @js.native
  @Factory
  trait RetrieveDomainAuthCodeRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The RetrieveDomainAuthCode response includes the following element.
    */
  @js.native
  @Factory
  trait RetrieveDomainAuthCodeResponse extends js.Object {
    var AuthCode: DomainAuthCode
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
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  /**
    * The TransferDomain request includes the following elements.
    */
  @js.native
  @Factory
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

  /**
    * The TranserDomain response includes the following element.
    */
  @js.native
  @Factory
  trait TransferDomainResponse extends js.Object {
    var OperationId: OperationId
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
  @js.native
  sealed trait Transferable extends js.Any
  object Transferable extends js.Object {
    val TRANSFERABLE   = "TRANSFERABLE".asInstanceOf[Transferable]
    val UNTRANSFERABLE = "UNTRANSFERABLE".asInstanceOf[Transferable]
    val DONT_KNOW      = "DONT_KNOW".asInstanceOf[Transferable]

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
  @Factory
  trait UpdateDomainContactPrivacyRequest extends js.Object {
    var DomainName: DomainName
    var AdminPrivacy: js.UndefOr[Boolean]
    var RegistrantPrivacy: js.UndefOr[Boolean]
    var TechPrivacy: js.UndefOr[Boolean]
  }

  /**
    * The UpdateDomainContactPrivacy response includes the following element.
    */
  @js.native
  @Factory
  trait UpdateDomainContactPrivacyResponse extends js.Object {
    var OperationId: OperationId
  }

  /**
    * The UpdateDomainContact request includes the following elements.
    */
  @js.native
  @Factory
  trait UpdateDomainContactRequest extends js.Object {
    var DomainName: DomainName
    var AdminContact: js.UndefOr[ContactDetail]
    var RegistrantContact: js.UndefOr[ContactDetail]
    var TechContact: js.UndefOr[ContactDetail]
  }

  /**
    * The UpdateDomainContact response includes the following element.
    */
  @js.native
  @Factory
  trait UpdateDomainContactResponse extends js.Object {
    var OperationId: OperationId
  }

  /**
    * Replaces the current set of name servers for the domain with the specified set of name servers. If you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted zone for the domain.
    *  If successful, this operation returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email.
    */
  @js.native
  @Factory
  trait UpdateDomainNameserversRequest extends js.Object {
    var DomainName: DomainName
    var Nameservers: NameserverList
    var FIAuthKey: js.UndefOr[FIAuthKey]
  }

  /**
    * The UpdateDomainNameservers response includes the following element.
    */
  @js.native
  @Factory
  trait UpdateDomainNameserversResponse extends js.Object {
    var OperationId: OperationId
  }

  /**
    * The UpdateTagsForDomainRequest includes the following elements.
    */
  @js.native
  @Factory
  trait UpdateTagsForDomainRequest extends js.Object {
    var DomainName: DomainName
    var TagsToUpdate: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait UpdateTagsForDomainResponse extends js.Object {}

  /**
    * The ViewBilling request includes the following elements.
    */
  @js.native
  @Factory
  trait ViewBillingRequest extends js.Object {
    var End: js.UndefOr[Timestamp]
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
    var Start: js.UndefOr[Timestamp]
  }

  /**
    * The ViewBilling response includes the following elements.
    */
  @js.native
  @Factory
  trait ViewBillingResponse extends js.Object {
    var BillingRecords: js.UndefOr[BillingRecords]
    var NextPageMarker: js.UndefOr[PageMarker]
  }
}
