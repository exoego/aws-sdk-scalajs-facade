package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object route53domains {
  type AddressLine = String
  type BillingRecords = js.Array[BillingRecord]
  type City = String
  type ContactName = String
  type ContactNumber = String
  type ContactType = String
  type CountryCode = String
  type CurrentExpiryYear = Integer
  type DNSSec = String
  type DomainAuthCode = String
  type DomainAvailability = String
  type DomainName = String
  type DomainStatus = String
  type DomainStatusList = js.Array[DomainStatus]
  type DomainSuggestionsList = js.Array[DomainSuggestion]
  type DomainSummaryList = js.Array[DomainSummary]
  type DurationInYears = Integer
  type Email = String
  type ErrorMessage = String
  type ExtraParamList = js.Array[ExtraParam]
  type ExtraParamName = String
  type ExtraParamValue = String
  type FIAuthKey = String
  type GlueIp = String
  type GlueIpList = js.Array[GlueIp]
  type HostName = String
  type InvoiceId = String
  type LangCode = String
  type NameserverList = js.Array[Nameserver]
  type OperationId = String
  type OperationStatus = String
  type OperationSummaryList = js.Array[OperationSummary]
  type OperationType = String
  type PageMarker = String
  type PageMaxItems = Integer
  type Price = Double
  type ReachabilityStatus = String
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
}

package route53domains {
  @js.native
  trait Route53domains extends js.Object {
    def checkDomainAvailability(params: CheckDomainAvailabilityRequest, callback: Callback[CheckDomainAvailabilityResponse]): Unit = js.native
    def checkDomainAvailability(params: CheckDomainAvailabilityRequest): Request[CheckDomainAvailabilityResponse] = js.native
    def deleteTagsForDomain(params: DeleteTagsForDomainRequest, callback: Callback[DeleteTagsForDomainResponse]): Unit = js.native
    def deleteTagsForDomain(params: DeleteTagsForDomainRequest): Request[DeleteTagsForDomainResponse] = js.native
    def disableDomainAutoRenew(params: DisableDomainAutoRenewRequest, callback: Callback[DisableDomainAutoRenewResponse]): Unit = js.native
    def disableDomainAutoRenew(params: DisableDomainAutoRenewRequest): Request[DisableDomainAutoRenewResponse] = js.native
    def disableDomainTransferLock(params: DisableDomainTransferLockRequest, callback: Callback[DisableDomainTransferLockResponse]): Unit = js.native
    def disableDomainTransferLock(params: DisableDomainTransferLockRequest): Request[DisableDomainTransferLockResponse] = js.native
    def enableDomainAutoRenew(params: EnableDomainAutoRenewRequest, callback: Callback[EnableDomainAutoRenewResponse]): Unit = js.native
    def enableDomainAutoRenew(params: EnableDomainAutoRenewRequest): Request[EnableDomainAutoRenewResponse] = js.native
    def enableDomainTransferLock(params: EnableDomainTransferLockRequest, callback: Callback[EnableDomainTransferLockResponse]): Unit = js.native
    def enableDomainTransferLock(params: EnableDomainTransferLockRequest): Request[EnableDomainTransferLockResponse] = js.native
    def getContactReachabilityStatus(params: GetContactReachabilityStatusRequest, callback: Callback[GetContactReachabilityStatusResponse]): Unit = js.native
    def getContactReachabilityStatus(params: GetContactReachabilityStatusRequest): Request[GetContactReachabilityStatusResponse] = js.native
    def getDomainDetail(params: GetDomainDetailRequest, callback: Callback[GetDomainDetailResponse]): Unit = js.native
    def getDomainDetail(params: GetDomainDetailRequest): Request[GetDomainDetailResponse] = js.native
    def getDomainSuggestions(params: GetDomainSuggestionsRequest, callback: Callback[GetDomainSuggestionsResponse]): Unit = js.native
    def getDomainSuggestions(params: GetDomainSuggestionsRequest): Request[GetDomainSuggestionsResponse] = js.native
    def getOperationDetail(params: GetOperationDetailRequest, callback: Callback[GetOperationDetailResponse]): Unit = js.native
    def getOperationDetail(params: GetOperationDetailRequest): Request[GetOperationDetailResponse] = js.native
    def listDomains(params: ListDomainsRequest, callback: Callback[ListDomainsResponse]): Unit = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse] = js.native
    def listOperations(params: ListOperationsRequest, callback: Callback[ListOperationsResponse]): Unit = js.native
    def listOperations(params: ListOperationsRequest): Request[ListOperationsResponse] = js.native
    def listTagsForDomain(params: ListTagsForDomainRequest, callback: Callback[ListTagsForDomainResponse]): Unit = js.native
    def listTagsForDomain(params: ListTagsForDomainRequest): Request[ListTagsForDomainResponse] = js.native
    def registerDomain(params: RegisterDomainRequest, callback: Callback[RegisterDomainResponse]): Unit = js.native
    def registerDomain(params: RegisterDomainRequest): Request[RegisterDomainResponse] = js.native
    def renewDomain(params: RenewDomainRequest, callback: Callback[RenewDomainResponse]): Unit = js.native
    def renewDomain(params: RenewDomainRequest): Request[RenewDomainResponse] = js.native
    def resendContactReachabilityEmail(params: ResendContactReachabilityEmailRequest, callback: Callback[ResendContactReachabilityEmailResponse]): Unit = js.native
    def resendContactReachabilityEmail(params: ResendContactReachabilityEmailRequest): Request[ResendContactReachabilityEmailResponse] = js.native
    def retrieveDomainAuthCode(params: RetrieveDomainAuthCodeRequest, callback: Callback[RetrieveDomainAuthCodeResponse]): Unit = js.native
    def retrieveDomainAuthCode(params: RetrieveDomainAuthCodeRequest): Request[RetrieveDomainAuthCodeResponse] = js.native
    def transferDomain(params: TransferDomainRequest, callback: Callback[TransferDomainResponse]): Unit = js.native
    def transferDomain(params: TransferDomainRequest): Request[TransferDomainResponse] = js.native
    def updateDomainContact(params: UpdateDomainContactRequest, callback: Callback[UpdateDomainContactResponse]): Unit = js.native
    def updateDomainContact(params: UpdateDomainContactRequest): Request[UpdateDomainContactResponse] = js.native
    def updateDomainContactPrivacy(params: UpdateDomainContactPrivacyRequest, callback: Callback[UpdateDomainContactPrivacyResponse]): Unit = js.native
    def updateDomainContactPrivacy(params: UpdateDomainContactPrivacyRequest): Request[UpdateDomainContactPrivacyResponse] = js.native
    def updateDomainNameservers(params: UpdateDomainNameserversRequest, callback: Callback[UpdateDomainNameserversResponse]): Unit = js.native
    def updateDomainNameservers(params: UpdateDomainNameserversRequest): Request[UpdateDomainNameserversResponse] = js.native
    def updateTagsForDomain(params: UpdateTagsForDomainRequest, callback: Callback[UpdateTagsForDomainResponse]): Unit = js.native
    def updateTagsForDomain(params: UpdateTagsForDomainRequest): Request[UpdateTagsForDomainResponse] = js.native
    def viewBilling(params: ViewBillingRequest, callback: Callback[ViewBillingResponse]): Unit = js.native
    def viewBilling(params: ViewBillingRequest): Request[ViewBillingResponse] = js.native
  }

  @js.native
  trait BillingRecord extends js.Object {
    var Price: Price
    var Operation: OperationType
    var DomainName: DomainName
    var InvoiceId: InvoiceId
    var BillDate: Timestamp
  }

  object BillingRecord {
    def apply(
      Price: js.UndefOr[Price] = js.undefined,
      Operation: js.UndefOr[OperationType] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      InvoiceId: js.UndefOr[InvoiceId] = js.undefined,
      BillDate: js.UndefOr[Timestamp] = js.undefined
    ): BillingRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Price" -> Price.map { x => x: js.Any }),
        ("Operation" -> Operation.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("InvoiceId" -> InvoiceId.map { x => x: js.Any }),
        ("BillDate" -> BillDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BillingRecord]
    }
  }

  /**
   * <p>The CheckDomainAvailability request contains the following elements.</p>
   */
  @js.native
  trait CheckDomainAvailabilityRequest extends js.Object {
    var DomainName: DomainName
    var IdnLangCode: LangCode
  }

  object CheckDomainAvailabilityRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      IdnLangCode: js.UndefOr[LangCode] = js.undefined
    ): CheckDomainAvailabilityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("IdnLangCode" -> IdnLangCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckDomainAvailabilityRequest]
    }
  }

  /**
   * <p>The CheckDomainAvailability response includes the following elements.</p>
   */
  @js.native
  trait CheckDomainAvailabilityResponse extends js.Object {
    var Availability: DomainAvailability
  }

  object CheckDomainAvailabilityResponse {
    def apply(
      Availability: js.UndefOr[DomainAvailability] = js.undefined
    ): CheckDomainAvailabilityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Availability" -> Availability.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckDomainAvailabilityResponse]
    }
  }

  /**
   * <p>ContactDetail includes the following elements.</p>
   */
  @js.native
  trait ContactDetail extends js.Object {
    var LastName: ContactName
    var CountryCode: CountryCode
    var OrganizationName: ContactName
    var AddressLine1: AddressLine
    var FirstName: ContactName
    var Fax: ContactNumber
    var PhoneNumber: ContactNumber
    var Email: Email
    var City: City
    var AddressLine2: AddressLine
    var ZipCode: ZipCode
    var State: State
    var ContactType: ContactType
    var ExtraParams: ExtraParamList
  }

  object ContactDetail {
    def apply(
      LastName: js.UndefOr[ContactName] = js.undefined,
      CountryCode: js.UndefOr[CountryCode] = js.undefined,
      OrganizationName: js.UndefOr[ContactName] = js.undefined,
      AddressLine1: js.UndefOr[AddressLine] = js.undefined,
      FirstName: js.UndefOr[ContactName] = js.undefined,
      Fax: js.UndefOr[ContactNumber] = js.undefined,
      PhoneNumber: js.UndefOr[ContactNumber] = js.undefined,
      Email: js.UndefOr[Email] = js.undefined,
      City: js.UndefOr[City] = js.undefined,
      AddressLine2: js.UndefOr[AddressLine] = js.undefined,
      ZipCode: js.UndefOr[ZipCode] = js.undefined,
      State: js.UndefOr[State] = js.undefined,
      ContactType: js.UndefOr[ContactType] = js.undefined,
      ExtraParams: js.UndefOr[ExtraParamList] = js.undefined
    ): ContactDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastName" -> LastName.map { x => x: js.Any }),
        ("CountryCode" -> CountryCode.map { x => x: js.Any }),
        ("OrganizationName" -> OrganizationName.map { x => x: js.Any }),
        ("AddressLine1" -> AddressLine1.map { x => x: js.Any }),
        ("FirstName" -> FirstName.map { x => x: js.Any }),
        ("Fax" -> Fax.map { x => x: js.Any }),
        ("PhoneNumber" -> PhoneNumber.map { x => x: js.Any }),
        ("Email" -> Email.map { x => x: js.Any }),
        ("City" -> City.map { x => x: js.Any }),
        ("AddressLine2" -> AddressLine2.map { x => x: js.Any }),
        ("ZipCode" -> ZipCode.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("ContactType" -> ContactType.map { x => x: js.Any }),
        ("ExtraParams" -> ExtraParams.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContactDetail]
    }
  }


  object ContactTypeEnum {
    val PERSON = "PERSON"
    val COMPANY = "COMPANY"
    val ASSOCIATION = "ASSOCIATION"
    val `PUBLIC_BODY` = "PUBLIC_BODY"
    val RESELLER = "RESELLER"

    val values = IndexedSeq(PERSON, COMPANY, ASSOCIATION, `PUBLIC_BODY`, RESELLER)
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

    val values = IndexedSeq(AD, AE, AF, AG, AI, AL, AM, AN, AO, AQ, AR, AS, AT, AU, AW, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BR, BS, BT, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR, CU, CV, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GH, GI, GL, GM, GN, GQ, GR, GT, GU, GW, GY, HK, HN, HR, HT, HU, ID, IE, IL, IM, IN, IQ, IR, IS, IT, JM, JO, JP, KE, KG, KH, KI, KM, KN, KP, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NG, NI, NL, NO, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PT, PW, PY, QA, RO, RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SK, SL, SM, SN, SO, SR, ST, SV, SY, SZ, TC, TD, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ, UA, UG, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM, ZW)
  }

  /**
   * <p>The DeleteTagsForDomainRequest includes the following elements.</p>
   */
  @js.native
  trait DeleteTagsForDomainRequest extends js.Object {
    var DomainName: DomainName
    var TagsToDelete: TagKeyList
  }

  object DeleteTagsForDomainRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      TagsToDelete: js.UndefOr[TagKeyList] = js.undefined
    ): DeleteTagsForDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("TagsToDelete" -> TagsToDelete.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsForDomainRequest]
    }
  }

  @js.native
  trait DeleteTagsForDomainResponse extends js.Object {

  }

  object DeleteTagsForDomainResponse {
    def apply(

    ): DeleteTagsForDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsForDomainResponse]
    }
  }

  @js.native
  trait DisableDomainAutoRenewRequest extends js.Object {
    var DomainName: DomainName
  }

  object DisableDomainAutoRenewRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined
    ): DisableDomainAutoRenewRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableDomainAutoRenewRequest]
    }
  }

  @js.native
  trait DisableDomainAutoRenewResponse extends js.Object {

  }

  object DisableDomainAutoRenewResponse {
    def apply(

    ): DisableDomainAutoRenewResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableDomainAutoRenewResponse]
    }
  }

  /**
   * <p>The DisableDomainTransferLock request includes the following element.</p>
   */
  @js.native
  trait DisableDomainTransferLockRequest extends js.Object {
    var DomainName: DomainName
  }

  object DisableDomainTransferLockRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined
    ): DisableDomainTransferLockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableDomainTransferLockRequest]
    }
  }

  /**
   * <p>The DisableDomainTransferLock response includes the following element.</p>
   */
  @js.native
  trait DisableDomainTransferLockResponse extends js.Object {
    var OperationId: OperationId
  }

  object DisableDomainTransferLockResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined
    ): DisableDomainTransferLockResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OperationId" -> OperationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableDomainTransferLockResponse]
    }
  }


  object DomainAvailabilityEnum {
    val AVAILABLE = "AVAILABLE"
    val `AVAILABLE_RESERVED` = "AVAILABLE_RESERVED"
    val `AVAILABLE_PREORDER` = "AVAILABLE_PREORDER"
    val UNAVAILABLE = "UNAVAILABLE"
    val `UNAVAILABLE_PREMIUM` = "UNAVAILABLE_PREMIUM"
    val `UNAVAILABLE_RESTRICTED` = "UNAVAILABLE_RESTRICTED"
    val RESERVED = "RESERVED"
    val `DONT_KNOW` = "DONT_KNOW"

    val values = IndexedSeq(AVAILABLE, `AVAILABLE_RESERVED`, `AVAILABLE_PREORDER`, UNAVAILABLE, `UNAVAILABLE_PREMIUM`, `UNAVAILABLE_RESTRICTED`, RESERVED, `DONT_KNOW`)
  }

  /**
   * <p>The number of domains has exceeded the allowed threshold for the account.</p>
   */
  @js.native
  trait DomainLimitExceededException extends js.Object {
    var message: ErrorMessage
  }

  @js.native
  trait DomainSuggestion extends js.Object {
    var DomainName: DomainName
    var Availability: String
  }

  object DomainSuggestion {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      Availability: js.UndefOr[String] = js.undefined
    ): DomainSuggestion = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("Availability" -> Availability.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainSuggestion]
    }
  }

  @js.native
  trait DomainSummary extends js.Object {
    var DomainName: DomainName
    var AutoRenew: Boolean
    var TransferLock: Boolean
    var Expiry: Timestamp
  }

  object DomainSummary {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      AutoRenew: js.UndefOr[Boolean] = js.undefined,
      TransferLock: js.UndefOr[Boolean] = js.undefined,
      Expiry: js.UndefOr[Timestamp] = js.undefined
    ): DomainSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("AutoRenew" -> AutoRenew.map { x => x: js.Any }),
        ("TransferLock" -> TransferLock.map { x => x: js.Any }),
        ("Expiry" -> Expiry.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainSummary]
    }
  }

  /**
   * <p>The request is already in progress for the domain.</p>
   */
  @js.native
  trait DuplicateRequestException extends js.Object {
    var message: ErrorMessage
  }

  @js.native
  trait EnableDomainAutoRenewRequest extends js.Object {
    var DomainName: DomainName
  }

  object EnableDomainAutoRenewRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined
    ): EnableDomainAutoRenewRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableDomainAutoRenewRequest]
    }
  }

  @js.native
  trait EnableDomainAutoRenewResponse extends js.Object {

  }

  object EnableDomainAutoRenewResponse {
    def apply(

    ): EnableDomainAutoRenewResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableDomainAutoRenewResponse]
    }
  }

  /**
   * <p>The EnableDomainTransferLock request includes the following element.</p>
   */
  @js.native
  trait EnableDomainTransferLockRequest extends js.Object {
    var DomainName: DomainName
  }

  object EnableDomainTransferLockRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined
    ): EnableDomainTransferLockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableDomainTransferLockRequest]
    }
  }

  /**
   * <p>The EnableDomainTransferLock response includes the following elements.</p>
   */
  @js.native
  trait EnableDomainTransferLockResponse extends js.Object {
    var OperationId: OperationId
  }

  object EnableDomainTransferLockResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined
    ): EnableDomainTransferLockResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OperationId" -> OperationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableDomainTransferLockResponse]
    }
  }

  /**
   * <p>ExtraParam includes the following elements.</p>
   */
  @js.native
  trait ExtraParam extends js.Object {
    var Name: ExtraParamName
    var Value: ExtraParamValue
  }

  object ExtraParam {
    def apply(
      Name: js.UndefOr[ExtraParamName] = js.undefined,
      Value: js.UndefOr[ExtraParamValue] = js.undefined
    ): ExtraParam = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExtraParam]
    }
  }


  object ExtraParamNameEnum {
    val `DUNS_NUMBER` = "DUNS_NUMBER"
    val `BRAND_NUMBER` = "BRAND_NUMBER"
    val `BIRTH_DEPARTMENT` = "BIRTH_DEPARTMENT"
    val `BIRTH_DATE_IN_YYYY_MM_DD` = "BIRTH_DATE_IN_YYYY_MM_DD"
    val `BIRTH_COUNTRY` = "BIRTH_COUNTRY"
    val `BIRTH_CITY` = "BIRTH_CITY"
    val `DOCUMENT_NUMBER` = "DOCUMENT_NUMBER"
    val `AU_ID_NUMBER` = "AU_ID_NUMBER"
    val `AU_ID_TYPE` = "AU_ID_TYPE"
    val `CA_LEGAL_TYPE` = "CA_LEGAL_TYPE"
    val `CA_BUSINESS_ENTITY_TYPE` = "CA_BUSINESS_ENTITY_TYPE"
    val `ES_IDENTIFICATION` = "ES_IDENTIFICATION"
    val `ES_IDENTIFICATION_TYPE` = "ES_IDENTIFICATION_TYPE"
    val `ES_LEGAL_FORM` = "ES_LEGAL_FORM"
    val `FI_BUSINESS_NUMBER` = "FI_BUSINESS_NUMBER"
    val `FI_ID_NUMBER` = "FI_ID_NUMBER"
    val `IT_PIN` = "IT_PIN"
    val `RU_PASSPORT_DATA` = "RU_PASSPORT_DATA"
    val `SE_ID_NUMBER` = "SE_ID_NUMBER"
    val `SG_ID_NUMBER` = "SG_ID_NUMBER"
    val `VAT_NUMBER` = "VAT_NUMBER"

    val values = IndexedSeq(`DUNS_NUMBER`, `BRAND_NUMBER`, `BIRTH_DEPARTMENT`, `BIRTH_DATE_IN_YYYY_MM_DD`, `BIRTH_COUNTRY`, `BIRTH_CITY`, `DOCUMENT_NUMBER`, `AU_ID_NUMBER`, `AU_ID_TYPE`, `CA_LEGAL_TYPE`, `CA_BUSINESS_ENTITY_TYPE`, `ES_IDENTIFICATION`, `ES_IDENTIFICATION_TYPE`, `ES_LEGAL_FORM`, `FI_BUSINESS_NUMBER`, `FI_ID_NUMBER`, `IT_PIN`, `RU_PASSPORT_DATA`, `SE_ID_NUMBER`, `SG_ID_NUMBER`, `VAT_NUMBER`)
  }

  @js.native
  trait GetContactReachabilityStatusRequest extends js.Object {
    var domainName: DomainName
  }

  object GetContactReachabilityStatusRequest {
    def apply(
      domainName: js.UndefOr[DomainName] = js.undefined
    ): GetContactReachabilityStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domainName" -> domainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContactReachabilityStatusRequest]
    }
  }

  @js.native
  trait GetContactReachabilityStatusResponse extends js.Object {
    var domainName: DomainName
    var status: ReachabilityStatus
  }

  object GetContactReachabilityStatusResponse {
    def apply(
      domainName: js.UndefOr[DomainName] = js.undefined,
      status: js.UndefOr[ReachabilityStatus] = js.undefined
    ): GetContactReachabilityStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domainName" -> domainName.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContactReachabilityStatusResponse]
    }
  }

  /**
   * <p>The GetDomainDetail request includes the following element.</p>
   */
  @js.native
  trait GetDomainDetailRequest extends js.Object {
    var DomainName: DomainName
  }

  object GetDomainDetailRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined
    ): GetDomainDetailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainDetailRequest]
    }
  }

  /**
   * <p>The GetDomainDetail response includes the following elements.</p>
   */
  @js.native
  trait GetDomainDetailResponse extends js.Object {
    var CreationDate: Timestamp
    var RegistrarName: RegistrarName
    var TechPrivacy: Boolean
    var TechContact: ContactDetail
    var Reseller: Reseller
    var RegistrantPrivacy: Boolean
    var DnsSec: DNSSec
    var StatusList: DomainStatusList
    var RegistrantContact: ContactDetail
    var ExpirationDate: Timestamp
    var RegistryDomainId: RegistryDomainId
    var Nameservers: NameserverList
    var DomainName: DomainName
    var AbuseContactPhone: ContactNumber
    var AbuseContactEmail: Email
    var UpdatedDate: Timestamp
    var AutoRenew: Boolean
    var WhoIsServer: RegistrarWhoIsServer
    var AdminPrivacy: Boolean
    var AdminContact: ContactDetail
    var RegistrarUrl: RegistrarUrl
  }

  object GetDomainDetailResponse {
    def apply(
      CreationDate: js.UndefOr[Timestamp] = js.undefined,
      RegistrarName: js.UndefOr[RegistrarName] = js.undefined,
      TechPrivacy: js.UndefOr[Boolean] = js.undefined,
      TechContact: js.UndefOr[ContactDetail] = js.undefined,
      Reseller: js.UndefOr[Reseller] = js.undefined,
      RegistrantPrivacy: js.UndefOr[Boolean] = js.undefined,
      DnsSec: js.UndefOr[DNSSec] = js.undefined,
      StatusList: js.UndefOr[DomainStatusList] = js.undefined,
      RegistrantContact: js.UndefOr[ContactDetail] = js.undefined,
      ExpirationDate: js.UndefOr[Timestamp] = js.undefined,
      RegistryDomainId: js.UndefOr[RegistryDomainId] = js.undefined,
      Nameservers: js.UndefOr[NameserverList] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      AbuseContactPhone: js.UndefOr[ContactNumber] = js.undefined,
      AbuseContactEmail: js.UndefOr[Email] = js.undefined,
      UpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      AutoRenew: js.UndefOr[Boolean] = js.undefined,
      WhoIsServer: js.UndefOr[RegistrarWhoIsServer] = js.undefined,
      AdminPrivacy: js.UndefOr[Boolean] = js.undefined,
      AdminContact: js.UndefOr[ContactDetail] = js.undefined,
      RegistrarUrl: js.UndefOr[RegistrarUrl] = js.undefined
    ): GetDomainDetailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDate" -> CreationDate.map { x => x: js.Any }),
        ("RegistrarName" -> RegistrarName.map { x => x: js.Any }),
        ("TechPrivacy" -> TechPrivacy.map { x => x: js.Any }),
        ("TechContact" -> TechContact.map { x => x: js.Any }),
        ("Reseller" -> Reseller.map { x => x: js.Any }),
        ("RegistrantPrivacy" -> RegistrantPrivacy.map { x => x: js.Any }),
        ("DnsSec" -> DnsSec.map { x => x: js.Any }),
        ("StatusList" -> StatusList.map { x => x: js.Any }),
        ("RegistrantContact" -> RegistrantContact.map { x => x: js.Any }),
        ("ExpirationDate" -> ExpirationDate.map { x => x: js.Any }),
        ("RegistryDomainId" -> RegistryDomainId.map { x => x: js.Any }),
        ("Nameservers" -> Nameservers.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("AbuseContactPhone" -> AbuseContactPhone.map { x => x: js.Any }),
        ("AbuseContactEmail" -> AbuseContactEmail.map { x => x: js.Any }),
        ("UpdatedDate" -> UpdatedDate.map { x => x: js.Any }),
        ("AutoRenew" -> AutoRenew.map { x => x: js.Any }),
        ("WhoIsServer" -> WhoIsServer.map { x => x: js.Any }),
        ("AdminPrivacy" -> AdminPrivacy.map { x => x: js.Any }),
        ("AdminContact" -> AdminContact.map { x => x: js.Any }),
        ("RegistrarUrl" -> RegistrarUrl.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainDetailResponse]
    }
  }

  @js.native
  trait GetDomainSuggestionsRequest extends js.Object {
    var DomainName: DomainName
    var SuggestionCount: Integer
    var OnlyAvailable: Boolean
  }

  object GetDomainSuggestionsRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      SuggestionCount: js.UndefOr[Integer] = js.undefined,
      OnlyAvailable: js.UndefOr[Boolean] = js.undefined
    ): GetDomainSuggestionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("SuggestionCount" -> SuggestionCount.map { x => x: js.Any }),
        ("OnlyAvailable" -> OnlyAvailable.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainSuggestionsRequest]
    }
  }

  @js.native
  trait GetDomainSuggestionsResponse extends js.Object {
    var SuggestionsList: DomainSuggestionsList
  }

  object GetDomainSuggestionsResponse {
    def apply(
      SuggestionsList: js.UndefOr[DomainSuggestionsList] = js.undefined
    ): GetDomainSuggestionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SuggestionsList" -> SuggestionsList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainSuggestionsResponse]
    }
  }

  /**
   * <p>The GetOperationDetail request includes the following element.</p>
   */
  @js.native
  trait GetOperationDetailRequest extends js.Object {
    var OperationId: OperationId
  }

  object GetOperationDetailRequest {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined
    ): GetOperationDetailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OperationId" -> OperationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationDetailRequest]
    }
  }

  /**
   * <p>The GetOperationDetail response includes the following elements.</p>
   */
  @js.native
  trait GetOperationDetailResponse extends js.Object {
    var SubmittedDate: Timestamp
    var DomainName: DomainName
    var OperationId: OperationId
    var Message: ErrorMessage
    var Status: OperationStatus
    var Type: OperationType
  }

  object GetOperationDetailResponse {
    def apply(
      SubmittedDate: js.UndefOr[Timestamp] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      OperationId: js.UndefOr[OperationId] = js.undefined,
      Message: js.UndefOr[ErrorMessage] = js.undefined,
      Status: js.UndefOr[OperationStatus] = js.undefined,
      Type: js.UndefOr[OperationType] = js.undefined
    ): GetOperationDetailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubmittedDate" -> SubmittedDate.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("OperationId" -> OperationId.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationDetailResponse]
    }
  }

  /**
   * <p>The requested item is not acceptable. For example, for an OperationId it may refer to the ID of an operation that is already completed. For a domain name, it may not be a valid domain name or belong to the requester account.</p>
   */
  @js.native
  trait InvalidInputException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The ListDomains request includes the following elements.</p>
   */
  @js.native
  trait ListDomainsRequest extends js.Object {
    var Marker: PageMarker
    var MaxItems: PageMaxItems
  }

  object ListDomainsRequest {
    def apply(
      Marker: js.UndefOr[PageMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListDomainsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainsRequest]
    }
  }

  /**
   * <p>The ListDomains response includes the following elements.</p>
   */
  @js.native
  trait ListDomainsResponse extends js.Object {
    var Domains: DomainSummaryList
    var NextPageMarker: PageMarker
  }

  object ListDomainsResponse {
    def apply(
      Domains: js.UndefOr[DomainSummaryList] = js.undefined,
      NextPageMarker: js.UndefOr[PageMarker] = js.undefined
    ): ListDomainsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Domains" -> Domains.map { x => x: js.Any }),
        ("NextPageMarker" -> NextPageMarker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainsResponse]
    }
  }

  /**
   * <p>The ListOperations request includes the following elements.</p>
   */
  @js.native
  trait ListOperationsRequest extends js.Object {
    var Marker: PageMarker
    var MaxItems: PageMaxItems
  }

  object ListOperationsRequest {
    def apply(
      Marker: js.UndefOr[PageMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListOperationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOperationsRequest]
    }
  }

  /**
   * <p>The ListOperations response includes the following elements.</p>
   */
  @js.native
  trait ListOperationsResponse extends js.Object {
    var Operations: OperationSummaryList
    var NextPageMarker: PageMarker
  }

  object ListOperationsResponse {
    def apply(
      Operations: js.UndefOr[OperationSummaryList] = js.undefined,
      NextPageMarker: js.UndefOr[PageMarker] = js.undefined
    ): ListOperationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Operations" -> Operations.map { x => x: js.Any }),
        ("NextPageMarker" -> NextPageMarker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOperationsResponse]
    }
  }

  /**
   * <p>The ListTagsForDomainRequest includes the following elements.</p>
   */
  @js.native
  trait ListTagsForDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object ListTagsForDomainRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined
    ): ListTagsForDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForDomainRequest]
    }
  }

  /**
   * <p>The ListTagsForDomain response includes the following elements.</p>
   */
  @js.native
  trait ListTagsForDomainResponse extends js.Object {
    var TagList: TagList
  }

  object ListTagsForDomainResponse {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined
    ): ListTagsForDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TagList" -> TagList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForDomainResponse]
    }
  }

  /**
   * <p>Nameserver includes the following elements.</p>
   */
  @js.native
  trait Nameserver extends js.Object {
    var Name: HostName
    var GlueIps: GlueIpList
  }

  object Nameserver {
    def apply(
      Name: js.UndefOr[HostName] = js.undefined,
      GlueIps: js.UndefOr[GlueIpList] = js.undefined
    ): Nameserver = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("GlueIps" -> GlueIps.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Nameserver]
    }
  }

  /**
   * <p>The number of operations or jobs running exceeded the allowed threshold for the account.</p>
   */
  @js.native
  trait OperationLimitExceededException extends js.Object {
    var message: ErrorMessage
  }


  object OperationStatusEnum {
    val SUBMITTED = "SUBMITTED"
    val `IN_PROGRESS` = "IN_PROGRESS"
    val ERROR = "ERROR"
    val SUCCESSFUL = "SUCCESSFUL"
    val FAILED = "FAILED"

    val values = IndexedSeq(SUBMITTED, `IN_PROGRESS`, ERROR, SUCCESSFUL, FAILED)
  }

  /**
   * <p>OperationSummary includes the following elements.</p>
   */
  @js.native
  trait OperationSummary extends js.Object {
    var OperationId: OperationId
    var Status: OperationStatus
    var Type: OperationType
    var SubmittedDate: Timestamp
  }

  object OperationSummary {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined,
      Status: js.UndefOr[OperationStatus] = js.undefined,
      Type: js.UndefOr[OperationType] = js.undefined,
      SubmittedDate: js.UndefOr[Timestamp] = js.undefined
    ): OperationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OperationId" -> OperationId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any }),
        ("SubmittedDate" -> SubmittedDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OperationSummary]
    }
  }


  object OperationTypeEnum {
    val `REGISTER_DOMAIN` = "REGISTER_DOMAIN"
    val `DELETE_DOMAIN` = "DELETE_DOMAIN"
    val `TRANSFER_IN_DOMAIN` = "TRANSFER_IN_DOMAIN"
    val `UPDATE_DOMAIN_CONTACT` = "UPDATE_DOMAIN_CONTACT"
    val `UPDATE_NAMESERVER` = "UPDATE_NAMESERVER"
    val `CHANGE_PRIVACY_PROTECTION` = "CHANGE_PRIVACY_PROTECTION"
    val `DOMAIN_LOCK` = "DOMAIN_LOCK"

    val values = IndexedSeq(`REGISTER_DOMAIN`, `DELETE_DOMAIN`, `TRANSFER_IN_DOMAIN`, `UPDATE_DOMAIN_CONTACT`, `UPDATE_NAMESERVER`, `CHANGE_PRIVACY_PROTECTION`, `DOMAIN_LOCK`)
  }


  object ReachabilityStatusEnum {
    val PENDING = "PENDING"
    val DONE = "DONE"
    val EXPIRED = "EXPIRED"

    val values = IndexedSeq(PENDING, DONE, EXPIRED)
  }

  /**
   * <p>The RegisterDomain request includes the following elements.</p>
   */
  @js.native
  trait RegisterDomainRequest extends js.Object {
    var TechContact: ContactDetail
    var PrivacyProtectTechContact: Boolean
    var PrivacyProtectRegistrantContact: Boolean
    var RegistrantContact: ContactDetail
    var IdnLangCode: LangCode
    var DomainName: DomainName
    var DurationInYears: DurationInYears
    var AutoRenew: Boolean
    var PrivacyProtectAdminContact: Boolean
    var AdminContact: ContactDetail
  }

  object RegisterDomainRequest {
    def apply(
      TechContact: js.UndefOr[ContactDetail] = js.undefined,
      PrivacyProtectTechContact: js.UndefOr[Boolean] = js.undefined,
      PrivacyProtectRegistrantContact: js.UndefOr[Boolean] = js.undefined,
      RegistrantContact: js.UndefOr[ContactDetail] = js.undefined,
      IdnLangCode: js.UndefOr[LangCode] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      DurationInYears: js.UndefOr[DurationInYears] = js.undefined,
      AutoRenew: js.UndefOr[Boolean] = js.undefined,
      PrivacyProtectAdminContact: js.UndefOr[Boolean] = js.undefined,
      AdminContact: js.UndefOr[ContactDetail] = js.undefined
    ): RegisterDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TechContact" -> TechContact.map { x => x: js.Any }),
        ("PrivacyProtectTechContact" -> PrivacyProtectTechContact.map { x => x: js.Any }),
        ("PrivacyProtectRegistrantContact" -> PrivacyProtectRegistrantContact.map { x => x: js.Any }),
        ("RegistrantContact" -> RegistrantContact.map { x => x: js.Any }),
        ("IdnLangCode" -> IdnLangCode.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("DurationInYears" -> DurationInYears.map { x => x: js.Any }),
        ("AutoRenew" -> AutoRenew.map { x => x: js.Any }),
        ("PrivacyProtectAdminContact" -> PrivacyProtectAdminContact.map { x => x: js.Any }),
        ("AdminContact" -> AdminContact.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterDomainRequest]
    }
  }

  /**
   * <p>The RegisterDomain response includes the following element.</p>
   */
  @js.native
  trait RegisterDomainResponse extends js.Object {
    var OperationId: OperationId
  }

  object RegisterDomainResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined
    ): RegisterDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OperationId" -> OperationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterDomainResponse]
    }
  }

  /**
   * <p>A <code>RenewDomain</code> request includes the number of years that you want to renew for and the current expiration year.</p>
   */
  @js.native
  trait RenewDomainRequest extends js.Object {
    var DomainName: DomainName
    var DurationInYears: DurationInYears
    var CurrentExpiryYear: CurrentExpiryYear
  }

  object RenewDomainRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      DurationInYears: js.UndefOr[DurationInYears] = js.undefined,
      CurrentExpiryYear: js.UndefOr[CurrentExpiryYear] = js.undefined
    ): RenewDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("DurationInYears" -> DurationInYears.map { x => x: js.Any }),
        ("CurrentExpiryYear" -> CurrentExpiryYear.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenewDomainRequest]
    }
  }

  @js.native
  trait RenewDomainResponse extends js.Object {
    var OperationId: OperationId
  }

  object RenewDomainResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined
    ): RenewDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OperationId" -> OperationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenewDomainResponse]
    }
  }

  @js.native
  trait ResendContactReachabilityEmailRequest extends js.Object {
    var domainName: DomainName
  }

  object ResendContactReachabilityEmailRequest {
    def apply(
      domainName: js.UndefOr[DomainName] = js.undefined
    ): ResendContactReachabilityEmailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domainName" -> domainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResendContactReachabilityEmailRequest]
    }
  }

  @js.native
  trait ResendContactReachabilityEmailResponse extends js.Object {
    var domainName: DomainName
    var emailAddress: Email
    var isAlreadyVerified: Boolean
  }

  object ResendContactReachabilityEmailResponse {
    def apply(
      domainName: js.UndefOr[DomainName] = js.undefined,
      emailAddress: js.UndefOr[Email] = js.undefined,
      isAlreadyVerified: js.UndefOr[Boolean] = js.undefined
    ): ResendContactReachabilityEmailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domainName" -> domainName.map { x => x: js.Any }),
        ("emailAddress" -> emailAddress.map { x => x: js.Any }),
        ("isAlreadyVerified" -> isAlreadyVerified.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResendContactReachabilityEmailResponse]
    }
  }

  /**
   * <p>The RetrieveDomainAuthCode request includes the following element.</p>
   */
  @js.native
  trait RetrieveDomainAuthCodeRequest extends js.Object {
    var DomainName: DomainName
  }

  object RetrieveDomainAuthCodeRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined
    ): RetrieveDomainAuthCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveDomainAuthCodeRequest]
    }
  }

  /**
   * <p>The RetrieveDomainAuthCode response includes the following element.</p>
   */
  @js.native
  trait RetrieveDomainAuthCodeResponse extends js.Object {
    var AuthCode: DomainAuthCode
  }

  object RetrieveDomainAuthCodeResponse {
    def apply(
      AuthCode: js.UndefOr[DomainAuthCode] = js.undefined
    ): RetrieveDomainAuthCodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AuthCode" -> AuthCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveDomainAuthCodeResponse]
    }
  }

  /**
   * <p>The top-level domain does not support this operation.</p>
   */
  @js.native
  trait TLDRulesViolationException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Each tag includes the following elements.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>The TransferDomain request includes the following elements.</p>
   */
  @js.native
  trait TransferDomainRequest extends js.Object {
    var TechContact: ContactDetail
    var PrivacyProtectTechContact: Boolean
    var PrivacyProtectRegistrantContact: Boolean
    var AuthCode: DomainAuthCode
    var RegistrantContact: ContactDetail
    var IdnLangCode: LangCode
    var Nameservers: NameserverList
    var DomainName: DomainName
    var DurationInYears: DurationInYears
    var AutoRenew: Boolean
    var PrivacyProtectAdminContact: Boolean
    var AdminContact: ContactDetail
  }

  object TransferDomainRequest {
    def apply(
      TechContact: js.UndefOr[ContactDetail] = js.undefined,
      PrivacyProtectTechContact: js.UndefOr[Boolean] = js.undefined,
      PrivacyProtectRegistrantContact: js.UndefOr[Boolean] = js.undefined,
      AuthCode: js.UndefOr[DomainAuthCode] = js.undefined,
      RegistrantContact: js.UndefOr[ContactDetail] = js.undefined,
      IdnLangCode: js.UndefOr[LangCode] = js.undefined,
      Nameservers: js.UndefOr[NameserverList] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      DurationInYears: js.UndefOr[DurationInYears] = js.undefined,
      AutoRenew: js.UndefOr[Boolean] = js.undefined,
      PrivacyProtectAdminContact: js.UndefOr[Boolean] = js.undefined,
      AdminContact: js.UndefOr[ContactDetail] = js.undefined
    ): TransferDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TechContact" -> TechContact.map { x => x: js.Any }),
        ("PrivacyProtectTechContact" -> PrivacyProtectTechContact.map { x => x: js.Any }),
        ("PrivacyProtectRegistrantContact" -> PrivacyProtectRegistrantContact.map { x => x: js.Any }),
        ("AuthCode" -> AuthCode.map { x => x: js.Any }),
        ("RegistrantContact" -> RegistrantContact.map { x => x: js.Any }),
        ("IdnLangCode" -> IdnLangCode.map { x => x: js.Any }),
        ("Nameservers" -> Nameservers.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("DurationInYears" -> DurationInYears.map { x => x: js.Any }),
        ("AutoRenew" -> AutoRenew.map { x => x: js.Any }),
        ("PrivacyProtectAdminContact" -> PrivacyProtectAdminContact.map { x => x: js.Any }),
        ("AdminContact" -> AdminContact.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransferDomainRequest]
    }
  }

  /**
   * <p>The TranserDomain response includes the following element.</p>
   */
  @js.native
  trait TransferDomainResponse extends js.Object {
    var OperationId: OperationId
  }

  object TransferDomainResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined
    ): TransferDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OperationId" -> OperationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransferDomainResponse]
    }
  }

  /**
   * <p>Amazon Route 53 does not support this top-level domain.</p>
   */
  @js.native
  trait UnsupportedTLDException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The UpdateDomainContactPrivacy request includes the following elements.</p>
   */
  @js.native
  trait UpdateDomainContactPrivacyRequest extends js.Object {
    var DomainName: DomainName
    var AdminPrivacy: Boolean
    var RegistrantPrivacy: Boolean
    var TechPrivacy: Boolean
  }

  object UpdateDomainContactPrivacyRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      AdminPrivacy: js.UndefOr[Boolean] = js.undefined,
      RegistrantPrivacy: js.UndefOr[Boolean] = js.undefined,
      TechPrivacy: js.UndefOr[Boolean] = js.undefined
    ): UpdateDomainContactPrivacyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("AdminPrivacy" -> AdminPrivacy.map { x => x: js.Any }),
        ("RegistrantPrivacy" -> RegistrantPrivacy.map { x => x: js.Any }),
        ("TechPrivacy" -> TechPrivacy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainContactPrivacyRequest]
    }
  }

  /**
   * <p>The UpdateDomainContactPrivacy response includes the following element.</p>
   */
  @js.native
  trait UpdateDomainContactPrivacyResponse extends js.Object {
    var OperationId: OperationId
  }

  object UpdateDomainContactPrivacyResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined
    ): UpdateDomainContactPrivacyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OperationId" -> OperationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainContactPrivacyResponse]
    }
  }

  /**
   * <p>The UpdateDomainContact request includes the following elements.</p>
   */
  @js.native
  trait UpdateDomainContactRequest extends js.Object {
    var DomainName: DomainName
    var AdminContact: ContactDetail
    var RegistrantContact: ContactDetail
    var TechContact: ContactDetail
  }

  object UpdateDomainContactRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      AdminContact: js.UndefOr[ContactDetail] = js.undefined,
      RegistrantContact: js.UndefOr[ContactDetail] = js.undefined,
      TechContact: js.UndefOr[ContactDetail] = js.undefined
    ): UpdateDomainContactRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("AdminContact" -> AdminContact.map { x => x: js.Any }),
        ("RegistrantContact" -> RegistrantContact.map { x => x: js.Any }),
        ("TechContact" -> TechContact.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainContactRequest]
    }
  }

  /**
   * <p>The UpdateDomainContact response includes the following element.</p>
   */
  @js.native
  trait UpdateDomainContactResponse extends js.Object {
    var OperationId: OperationId
  }

  object UpdateDomainContactResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined
    ): UpdateDomainContactResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OperationId" -> OperationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainContactResponse]
    }
  }

  /**
   * <p>The UpdateDomainNameserver request includes the following elements.</p>
   */
  @js.native
  trait UpdateDomainNameserversRequest extends js.Object {
    var DomainName: DomainName
    var FIAuthKey: FIAuthKey
    var Nameservers: NameserverList
  }

  object UpdateDomainNameserversRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      FIAuthKey: js.UndefOr[FIAuthKey] = js.undefined,
      Nameservers: js.UndefOr[NameserverList] = js.undefined
    ): UpdateDomainNameserversRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("FIAuthKey" -> FIAuthKey.map { x => x: js.Any }),
        ("Nameservers" -> Nameservers.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainNameserversRequest]
    }
  }

  /**
   * <p>The UpdateDomainNameservers response includes the following element.</p>
   */
  @js.native
  trait UpdateDomainNameserversResponse extends js.Object {
    var OperationId: OperationId
  }

  object UpdateDomainNameserversResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined
    ): UpdateDomainNameserversResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OperationId" -> OperationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainNameserversResponse]
    }
  }

  /**
   * <p>The UpdateTagsForDomainRequest includes the following elements.</p>
   */
  @js.native
  trait UpdateTagsForDomainRequest extends js.Object {
    var DomainName: DomainName
    var TagsToUpdate: TagList
  }

  object UpdateTagsForDomainRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      TagsToUpdate: js.UndefOr[TagList] = js.undefined
    ): UpdateTagsForDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("TagsToUpdate" -> TagsToUpdate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTagsForDomainRequest]
    }
  }

  @js.native
  trait UpdateTagsForDomainResponse extends js.Object {

  }

  object UpdateTagsForDomainResponse {
    def apply(

    ): UpdateTagsForDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTagsForDomainResponse]
    }
  }

  /**
   * <p>The ViewBilling request includes the following elements.</p>
   */
  @js.native
  trait ViewBillingRequest extends js.Object {
    var Start: Timestamp
    var End: Timestamp
    var Marker: PageMarker
    var MaxItems: PageMaxItems
  }

  object ViewBillingRequest {
    def apply(
      Start: js.UndefOr[Timestamp] = js.undefined,
      End: js.UndefOr[Timestamp] = js.undefined,
      Marker: js.UndefOr[PageMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ViewBillingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Start" -> Start.map { x => x: js.Any }),
        ("End" -> End.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ViewBillingRequest]
    }
  }

  /**
   * <p>The ViewBilling response includes the following elements.</p>
   */
  @js.native
  trait ViewBillingResponse extends js.Object {
    var NextPageMarker: PageMarker
    var BillingRecords: BillingRecords
  }

  object ViewBillingResponse {
    def apply(
      NextPageMarker: js.UndefOr[PageMarker] = js.undefined,
      BillingRecords: js.UndefOr[BillingRecords] = js.undefined
    ): ViewBillingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextPageMarker" -> NextPageMarker.map { x => x: js.Any }),
        ("BillingRecords" -> BillingRecords.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ViewBillingResponse]
    }
  }
}
