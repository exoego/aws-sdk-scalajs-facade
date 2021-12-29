package facade.amazonaws.services.route53domains

import scalajs._
import scala.scalajs.js.|

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
sealed trait OperationStatus extends js.Any
object OperationStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[OperationStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[OperationStatus]
  val ERROR = "ERROR".asInstanceOf[OperationStatus]
  val SUCCESSFUL = "SUCCESSFUL".asInstanceOf[OperationStatus]
  val FAILED = "FAILED".asInstanceOf[OperationStatus]

  @inline def values = js.Array(SUBMITTED, IN_PROGRESS, ERROR, SUCCESSFUL, FAILED)
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

/** Whether the domain name can be transferred to Route 53.
  *
  * '''Note:'''You can transfer only domains that have a value of <code>TRANSFERABLE</code> for <code>Transferable</code>. Valid values: <dl> <dt>TRANSFERABLE</dt> <dd> The domain name can be transferred to Route 53. </dd> <dt>UNTRANSFERRABLE</dt> <dd> The domain name can't be transferred to Route 53. </dd> <dt>DONT_KNOW</dt> <dd> Reserved for future use. </dd> </dl>
  */
@js.native
sealed trait Transferable extends js.Any
object Transferable {
  val TRANSFERABLE = "TRANSFERABLE".asInstanceOf[Transferable]
  val UNTRANSFERABLE = "UNTRANSFERABLE".asInstanceOf[Transferable]
  val DONT_KNOW = "DONT_KNOW".asInstanceOf[Transferable]

  @inline def values = js.Array(TRANSFERABLE, UNTRANSFERABLE, DONT_KNOW)
}
