package facade.amazonaws.services.route53domains

import scalajs._

type ContactType = "PERSON" | "COMPANY" | "ASSOCIATION" | "PUBLIC_BODY" | "RESELLER"
object ContactType {
  val PERSON: "PERSON" = "PERSON"
  val COMPANY: "COMPANY" = "COMPANY"
  val ASSOCIATION: "ASSOCIATION" = "ASSOCIATION"
  val PUBLIC_BODY: "PUBLIC_BODY" = "PUBLIC_BODY"
  val RESELLER: "RESELLER" = "RESELLER"

  @inline def values = js.Array[ContactType](PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY, RESELLER)
}

type CountryCode = "AD" | "AE" | "AF" | "AG" | "AI" | "AL" | "AM" | "AN" | "AO" | "AQ" | "AR" | "AS" | "AT" | "AU" | "AW" | "AZ" | "BA" | "BB" | "BD" | "BE" | "BF" | "BG" | "BH" | "BI" | "BJ" | "BL" | "BM" | "BN" | "BO" | "BR" | "BS" | "BT" | "BW" | "BY" | "BZ" | "CA" | "CC" | "CD" | "CF" | "CG" | "CH" | "CI" | "CK" | "CL" | "CM" | "CN" | "CO" | "CR" | "CU" | "CV" | "CX" | "CY" | "CZ" | "DE" | "DJ" | "DK" | "DM" | "DO" | "DZ" | "EC" | "EE" | "EG" | "ER" | "ES" | "ET" | "FI" | "FJ" | "FK" | "FM" | "FO" | "FR" | "GA" | "GB" | "GD" | "GE" | "GH" | "GI" | "GL" | "GM" | "GN" | "GQ" | "GR" | "GT" | "GU" | "GW" | "GY" | "HK" | "HN" | "HR" | "HT" | "HU" | "ID" | "IE" | "IL" | "IM" | "IN" | "IQ" | "IR" | "IS" | "IT" | "JM" | "JO" | "JP" | "KE" | "KG" | "KH" | "KI" | "KM" | "KN" | "KP" | "KR" | "KW" | "KY" | "KZ" | "LA" | "LB" | "LC" | "LI" | "LK" | "LR" | "LS" | "LT" | "LU" | "LV" | "LY" | "MA" | "MC" | "MD" | "ME" | "MF" | "MG" | "MH" | "MK" | "ML" | "MM" | "MN" | "MO" | "MP" | "MR" | "MS" |
  "MT" | "MU" | "MV" | "MW" | "MX" | "MY" | "MZ" | "NA" | "NC" | "NE" | "NG" | "NI" | "NL" | "NO" | "NP" | "NR" | "NU" | "NZ" | "OM" | "PA" | "PE" | "PF" | "PG" | "PH" | "PK" | "PL" | "PM" | "PN" | "PR" | "PT" | "PW" | "PY" | "QA" | "RO" | "RS" | "RU" | "RW" | "SA" | "SB" | "SC" | "SD" | "SE" | "SG" | "SH" | "SI" | "SK" | "SL" | "SM" | "SN" | "SO" | "SR" | "ST" | "SV" | "SY" | "SZ" | "TC" | "TD" | "TG" | "TH" | "TJ" | "TK" | "TL" | "TM" | "TN" | "TO" | "TR" | "TT" | "TV" | "TW" | "TZ" | "UA" | "UG" | "US" | "UY" | "UZ" | "VA" | "VC" | "VE" | "VG" | "VI" | "VN" | "VU" | "WF" | "WS" | "YE" | "YT" | "ZA" | "ZM" | "ZW"
object CountryCode {
  val AD: "AD" = "AD"
  val AE: "AE" = "AE"
  val AF: "AF" = "AF"
  val AG: "AG" = "AG"
  val AI: "AI" = "AI"
  val AL: "AL" = "AL"
  val AM: "AM" = "AM"
  val AN: "AN" = "AN"
  val AO: "AO" = "AO"
  val AQ: "AQ" = "AQ"
  val AR: "AR" = "AR"
  val AS: "AS" = "AS"
  val AT: "AT" = "AT"
  val AU: "AU" = "AU"
  val AW: "AW" = "AW"
  val AZ: "AZ" = "AZ"
  val BA: "BA" = "BA"
  val BB: "BB" = "BB"
  val BD: "BD" = "BD"
  val BE: "BE" = "BE"
  val BF: "BF" = "BF"
  val BG: "BG" = "BG"
  val BH: "BH" = "BH"
  val BI: "BI" = "BI"
  val BJ: "BJ" = "BJ"
  val BL: "BL" = "BL"
  val BM: "BM" = "BM"
  val BN: "BN" = "BN"
  val BO: "BO" = "BO"
  val BR: "BR" = "BR"
  val BS: "BS" = "BS"
  val BT: "BT" = "BT"
  val BW: "BW" = "BW"
  val BY: "BY" = "BY"
  val BZ: "BZ" = "BZ"
  val CA: "CA" = "CA"
  val CC: "CC" = "CC"
  val CD: "CD" = "CD"
  val CF: "CF" = "CF"
  val CG: "CG" = "CG"
  val CH: "CH" = "CH"
  val CI: "CI" = "CI"
  val CK: "CK" = "CK"
  val CL: "CL" = "CL"
  val CM: "CM" = "CM"
  val CN: "CN" = "CN"
  val CO: "CO" = "CO"
  val CR: "CR" = "CR"
  val CU: "CU" = "CU"
  val CV: "CV" = "CV"
  val CX: "CX" = "CX"
  val CY: "CY" = "CY"
  val CZ: "CZ" = "CZ"
  val DE: "DE" = "DE"
  val DJ: "DJ" = "DJ"
  val DK: "DK" = "DK"
  val DM: "DM" = "DM"
  val DO: "DO" = "DO"
  val DZ: "DZ" = "DZ"
  val EC: "EC" = "EC"
  val EE: "EE" = "EE"
  val EG: "EG" = "EG"
  val ER: "ER" = "ER"
  val ES: "ES" = "ES"
  val ET: "ET" = "ET"
  val FI: "FI" = "FI"
  val FJ: "FJ" = "FJ"
  val FK: "FK" = "FK"
  val FM: "FM" = "FM"
  val FO: "FO" = "FO"
  val FR: "FR" = "FR"
  val GA: "GA" = "GA"
  val GB: "GB" = "GB"
  val GD: "GD" = "GD"
  val GE: "GE" = "GE"
  val GH: "GH" = "GH"
  val GI: "GI" = "GI"
  val GL: "GL" = "GL"
  val GM: "GM" = "GM"
  val GN: "GN" = "GN"
  val GQ: "GQ" = "GQ"
  val GR: "GR" = "GR"
  val GT: "GT" = "GT"
  val GU: "GU" = "GU"
  val GW: "GW" = "GW"
  val GY: "GY" = "GY"
  val HK: "HK" = "HK"
  val HN: "HN" = "HN"
  val HR: "HR" = "HR"
  val HT: "HT" = "HT"
  val HU: "HU" = "HU"
  val ID: "ID" = "ID"
  val IE: "IE" = "IE"
  val IL: "IL" = "IL"
  val IM: "IM" = "IM"
  val IN: "IN" = "IN"
  val IQ: "IQ" = "IQ"
  val IR: "IR" = "IR"
  val IS: "IS" = "IS"
  val IT: "IT" = "IT"
  val JM: "JM" = "JM"
  val JO: "JO" = "JO"
  val JP: "JP" = "JP"
  val KE: "KE" = "KE"
  val KG: "KG" = "KG"
  val KH: "KH" = "KH"
  val KI: "KI" = "KI"
  val KM: "KM" = "KM"
  val KN: "KN" = "KN"
  val KP: "KP" = "KP"
  val KR: "KR" = "KR"
  val KW: "KW" = "KW"
  val KY: "KY" = "KY"
  val KZ: "KZ" = "KZ"
  val LA: "LA" = "LA"
  val LB: "LB" = "LB"
  val LC: "LC" = "LC"
  val LI: "LI" = "LI"
  val LK: "LK" = "LK"
  val LR: "LR" = "LR"
  val LS: "LS" = "LS"
  val LT: "LT" = "LT"
  val LU: "LU" = "LU"
  val LV: "LV" = "LV"
  val LY: "LY" = "LY"
  val MA: "MA" = "MA"
  val MC: "MC" = "MC"
  val MD: "MD" = "MD"
  val ME: "ME" = "ME"
  val MF: "MF" = "MF"
  val MG: "MG" = "MG"
  val MH: "MH" = "MH"
  val MK: "MK" = "MK"
  val ML: "ML" = "ML"
  val MM: "MM" = "MM"
  val MN: "MN" = "MN"
  val MO: "MO" = "MO"
  val MP: "MP" = "MP"
  val MR: "MR" = "MR"
  val MS: "MS" = "MS"
  val MT: "MT" = "MT"
  val MU: "MU" = "MU"
  val MV: "MV" = "MV"
  val MW: "MW" = "MW"
  val MX: "MX" = "MX"
  val MY: "MY" = "MY"
  val MZ: "MZ" = "MZ"
  val NA: "NA" = "NA"
  val NC: "NC" = "NC"
  val NE: "NE" = "NE"
  val NG: "NG" = "NG"
  val NI: "NI" = "NI"
  val NL: "NL" = "NL"
  val NO: "NO" = "NO"
  val NP: "NP" = "NP"
  val NR: "NR" = "NR"
  val NU: "NU" = "NU"
  val NZ: "NZ" = "NZ"
  val OM: "OM" = "OM"
  val PA: "PA" = "PA"
  val PE: "PE" = "PE"
  val PF: "PF" = "PF"
  val PG: "PG" = "PG"
  val PH: "PH" = "PH"
  val PK: "PK" = "PK"
  val PL: "PL" = "PL"
  val PM: "PM" = "PM"
  val PN: "PN" = "PN"
  val PR: "PR" = "PR"
  val PT: "PT" = "PT"
  val PW: "PW" = "PW"
  val PY: "PY" = "PY"
  val QA: "QA" = "QA"
  val RO: "RO" = "RO"
  val RS: "RS" = "RS"
  val RU: "RU" = "RU"
  val RW: "RW" = "RW"
  val SA: "SA" = "SA"
  val SB: "SB" = "SB"
  val SC: "SC" = "SC"
  val SD: "SD" = "SD"
  val SE: "SE" = "SE"
  val SG: "SG" = "SG"
  val SH: "SH" = "SH"
  val SI: "SI" = "SI"
  val SK: "SK" = "SK"
  val SL: "SL" = "SL"
  val SM: "SM" = "SM"
  val SN: "SN" = "SN"
  val SO: "SO" = "SO"
  val SR: "SR" = "SR"
  val ST: "ST" = "ST"
  val SV: "SV" = "SV"
  val SY: "SY" = "SY"
  val SZ: "SZ" = "SZ"
  val TC: "TC" = "TC"
  val TD: "TD" = "TD"
  val TG: "TG" = "TG"
  val TH: "TH" = "TH"
  val TJ: "TJ" = "TJ"
  val TK: "TK" = "TK"
  val TL: "TL" = "TL"
  val TM: "TM" = "TM"
  val TN: "TN" = "TN"
  val TO: "TO" = "TO"
  val TR: "TR" = "TR"
  val TT: "TT" = "TT"
  val TV: "TV" = "TV"
  val TW: "TW" = "TW"
  val TZ: "TZ" = "TZ"
  val UA: "UA" = "UA"
  val UG: "UG" = "UG"
  val US: "US" = "US"
  val UY: "UY" = "UY"
  val UZ: "UZ" = "UZ"
  val VA: "VA" = "VA"
  val VC: "VC" = "VC"
  val VE: "VE" = "VE"
  val VG: "VG" = "VG"
  val VI: "VI" = "VI"
  val VN: "VN" = "VN"
  val VU: "VU" = "VU"
  val WF: "WF" = "WF"
  val WS: "WS" = "WS"
  val YE: "YE" = "YE"
  val YT: "YT" = "YT"
  val ZA: "ZA" = "ZA"
  val ZM: "ZM" = "ZM"
  val ZW: "ZW" = "ZW"

  @inline def values = js.Array[CountryCode](
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

type DomainAvailability = "AVAILABLE" | "AVAILABLE_RESERVED" | "AVAILABLE_PREORDER" | "UNAVAILABLE" | "UNAVAILABLE_PREMIUM" | "UNAVAILABLE_RESTRICTED" | "RESERVED" | "DONT_KNOW"
object DomainAvailability {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val AVAILABLE_RESERVED: "AVAILABLE_RESERVED" = "AVAILABLE_RESERVED"
  val AVAILABLE_PREORDER: "AVAILABLE_PREORDER" = "AVAILABLE_PREORDER"
  val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"
  val UNAVAILABLE_PREMIUM: "UNAVAILABLE_PREMIUM" = "UNAVAILABLE_PREMIUM"
  val UNAVAILABLE_RESTRICTED: "UNAVAILABLE_RESTRICTED" = "UNAVAILABLE_RESTRICTED"
  val RESERVED: "RESERVED" = "RESERVED"
  val DONT_KNOW: "DONT_KNOW" = "DONT_KNOW"

  @inline def values = js.Array[DomainAvailability](AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER, UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED, DONT_KNOW)
}

type ExtraParamName = "DUNS_NUMBER" | "BRAND_NUMBER" | "BIRTH_DEPARTMENT" | "BIRTH_DATE_IN_YYYY_MM_DD" | "BIRTH_COUNTRY" | "BIRTH_CITY" | "DOCUMENT_NUMBER" | "AU_ID_NUMBER" | "AU_ID_TYPE" | "CA_LEGAL_TYPE" | "CA_BUSINESS_ENTITY_TYPE" | "CA_LEGAL_REPRESENTATIVE" | "CA_LEGAL_REPRESENTATIVE_CAPACITY" | "ES_IDENTIFICATION" | "ES_IDENTIFICATION_TYPE" | "ES_LEGAL_FORM" | "FI_BUSINESS_NUMBER" | "FI_ID_NUMBER" | "FI_NATIONALITY" | "FI_ORGANIZATION_TYPE" | "IT_NATIONALITY" | "IT_PIN" | "IT_REGISTRANT_ENTITY_TYPE" | "RU_PASSPORT_DATA" | "SE_ID_NUMBER" | "SG_ID_NUMBER" | "VAT_NUMBER" | "UK_CONTACT_TYPE" | "UK_COMPANY_NUMBER"
object ExtraParamName {
  val DUNS_NUMBER: "DUNS_NUMBER" = "DUNS_NUMBER"
  val BRAND_NUMBER: "BRAND_NUMBER" = "BRAND_NUMBER"
  val BIRTH_DEPARTMENT: "BIRTH_DEPARTMENT" = "BIRTH_DEPARTMENT"
  val BIRTH_DATE_IN_YYYY_MM_DD: "BIRTH_DATE_IN_YYYY_MM_DD" = "BIRTH_DATE_IN_YYYY_MM_DD"
  val BIRTH_COUNTRY: "BIRTH_COUNTRY" = "BIRTH_COUNTRY"
  val BIRTH_CITY: "BIRTH_CITY" = "BIRTH_CITY"
  val DOCUMENT_NUMBER: "DOCUMENT_NUMBER" = "DOCUMENT_NUMBER"
  val AU_ID_NUMBER: "AU_ID_NUMBER" = "AU_ID_NUMBER"
  val AU_ID_TYPE: "AU_ID_TYPE" = "AU_ID_TYPE"
  val CA_LEGAL_TYPE: "CA_LEGAL_TYPE" = "CA_LEGAL_TYPE"
  val CA_BUSINESS_ENTITY_TYPE: "CA_BUSINESS_ENTITY_TYPE" = "CA_BUSINESS_ENTITY_TYPE"
  val CA_LEGAL_REPRESENTATIVE: "CA_LEGAL_REPRESENTATIVE" = "CA_LEGAL_REPRESENTATIVE"
  val CA_LEGAL_REPRESENTATIVE_CAPACITY: "CA_LEGAL_REPRESENTATIVE_CAPACITY" = "CA_LEGAL_REPRESENTATIVE_CAPACITY"
  val ES_IDENTIFICATION: "ES_IDENTIFICATION" = "ES_IDENTIFICATION"
  val ES_IDENTIFICATION_TYPE: "ES_IDENTIFICATION_TYPE" = "ES_IDENTIFICATION_TYPE"
  val ES_LEGAL_FORM: "ES_LEGAL_FORM" = "ES_LEGAL_FORM"
  val FI_BUSINESS_NUMBER: "FI_BUSINESS_NUMBER" = "FI_BUSINESS_NUMBER"
  val FI_ID_NUMBER: "FI_ID_NUMBER" = "FI_ID_NUMBER"
  val FI_NATIONALITY: "FI_NATIONALITY" = "FI_NATIONALITY"
  val FI_ORGANIZATION_TYPE: "FI_ORGANIZATION_TYPE" = "FI_ORGANIZATION_TYPE"
  val IT_NATIONALITY: "IT_NATIONALITY" = "IT_NATIONALITY"
  val IT_PIN: "IT_PIN" = "IT_PIN"
  val IT_REGISTRANT_ENTITY_TYPE: "IT_REGISTRANT_ENTITY_TYPE" = "IT_REGISTRANT_ENTITY_TYPE"
  val RU_PASSPORT_DATA: "RU_PASSPORT_DATA" = "RU_PASSPORT_DATA"
  val SE_ID_NUMBER: "SE_ID_NUMBER" = "SE_ID_NUMBER"
  val SG_ID_NUMBER: "SG_ID_NUMBER" = "SG_ID_NUMBER"
  val VAT_NUMBER: "VAT_NUMBER" = "VAT_NUMBER"
  val UK_CONTACT_TYPE: "UK_CONTACT_TYPE" = "UK_CONTACT_TYPE"
  val UK_COMPANY_NUMBER: "UK_COMPANY_NUMBER" = "UK_COMPANY_NUMBER"

  @inline def values = js.Array[ExtraParamName](
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

type OperationStatus = "SUBMITTED" | "IN_PROGRESS" | "ERROR" | "SUCCESSFUL" | "FAILED"
object OperationStatus {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val ERROR: "ERROR" = "ERROR"
  val SUCCESSFUL: "SUCCESSFUL" = "SUCCESSFUL"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[OperationStatus](SUBMITTED, IN_PROGRESS, ERROR, SUCCESSFUL, FAILED)
}

type OperationType = "REGISTER_DOMAIN" | "DELETE_DOMAIN" | "TRANSFER_IN_DOMAIN" | "UPDATE_DOMAIN_CONTACT" | "UPDATE_NAMESERVER" | "CHANGE_PRIVACY_PROTECTION" | "DOMAIN_LOCK" | "ENABLE_AUTORENEW" | "DISABLE_AUTORENEW" | "ADD_DNSSEC" | "REMOVE_DNSSEC" | "EXPIRE_DOMAIN" | "TRANSFER_OUT_DOMAIN" | "CHANGE_DOMAIN_OWNER" | "RENEW_DOMAIN" | "PUSH_DOMAIN" | "INTERNAL_TRANSFER_OUT_DOMAIN" | "INTERNAL_TRANSFER_IN_DOMAIN"
object OperationType {
  val REGISTER_DOMAIN: "REGISTER_DOMAIN" = "REGISTER_DOMAIN"
  val DELETE_DOMAIN: "DELETE_DOMAIN" = "DELETE_DOMAIN"
  val TRANSFER_IN_DOMAIN: "TRANSFER_IN_DOMAIN" = "TRANSFER_IN_DOMAIN"
  val UPDATE_DOMAIN_CONTACT: "UPDATE_DOMAIN_CONTACT" = "UPDATE_DOMAIN_CONTACT"
  val UPDATE_NAMESERVER: "UPDATE_NAMESERVER" = "UPDATE_NAMESERVER"
  val CHANGE_PRIVACY_PROTECTION: "CHANGE_PRIVACY_PROTECTION" = "CHANGE_PRIVACY_PROTECTION"
  val DOMAIN_LOCK: "DOMAIN_LOCK" = "DOMAIN_LOCK"
  val ENABLE_AUTORENEW: "ENABLE_AUTORENEW" = "ENABLE_AUTORENEW"
  val DISABLE_AUTORENEW: "DISABLE_AUTORENEW" = "DISABLE_AUTORENEW"
  val ADD_DNSSEC: "ADD_DNSSEC" = "ADD_DNSSEC"
  val REMOVE_DNSSEC: "REMOVE_DNSSEC" = "REMOVE_DNSSEC"
  val EXPIRE_DOMAIN: "EXPIRE_DOMAIN" = "EXPIRE_DOMAIN"
  val TRANSFER_OUT_DOMAIN: "TRANSFER_OUT_DOMAIN" = "TRANSFER_OUT_DOMAIN"
  val CHANGE_DOMAIN_OWNER: "CHANGE_DOMAIN_OWNER" = "CHANGE_DOMAIN_OWNER"
  val RENEW_DOMAIN: "RENEW_DOMAIN" = "RENEW_DOMAIN"
  val PUSH_DOMAIN: "PUSH_DOMAIN" = "PUSH_DOMAIN"
  val INTERNAL_TRANSFER_OUT_DOMAIN: "INTERNAL_TRANSFER_OUT_DOMAIN" = "INTERNAL_TRANSFER_OUT_DOMAIN"
  val INTERNAL_TRANSFER_IN_DOMAIN: "INTERNAL_TRANSFER_IN_DOMAIN" = "INTERNAL_TRANSFER_IN_DOMAIN"

  @inline def values = js.Array[OperationType](
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

type ReachabilityStatus = "PENDING" | "DONE" | "EXPIRED"
object ReachabilityStatus {
  val PENDING: "PENDING" = "PENDING"
  val DONE: "DONE" = "DONE"
  val EXPIRED: "EXPIRED" = "EXPIRED"

  @inline def values = js.Array[ReachabilityStatus](PENDING, DONE, EXPIRED)
}

/** Whether the domain name can be transferred to Route 53.
  *
  * '''Note:'''You can transfer only domains that have a value of <code>TRANSFERABLE</code> for <code>Transferable</code>. Valid values: <dl> <dt>TRANSFERABLE</dt> <dd> The domain name can be transferred to Route 53. </dd> <dt>UNTRANSFERRABLE</dt> <dd> The domain name can't be transferred to Route 53. </dd> <dt>DONT_KNOW</dt> <dd> Reserved for future use. </dd> </dl>
  */
type Transferable = "TRANSFERABLE" | "UNTRANSFERABLE" | "DONT_KNOW"
object Transferable {
  val TRANSFERABLE: "TRANSFERABLE" = "TRANSFERABLE"
  val UNTRANSFERABLE: "UNTRANSFERABLE" = "UNTRANSFERABLE"
  val DONT_KNOW: "DONT_KNOW" = "DONT_KNOW"

  @inline def values = js.Array[Transferable](TRANSFERABLE, UNTRANSFERABLE, DONT_KNOW)
}
