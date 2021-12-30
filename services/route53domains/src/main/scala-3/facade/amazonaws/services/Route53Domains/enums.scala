package facade.amazonaws.services.route53domains

import scalajs.js

type ContactType = "PERSON" | "COMPANY" | "ASSOCIATION" | "PUBLIC_BODY" | "RESELLER"
object ContactType {
  inline val PERSON: "PERSON" = "PERSON"
  inline val COMPANY: "COMPANY" = "COMPANY"
  inline val ASSOCIATION: "ASSOCIATION" = "ASSOCIATION"
  inline val PUBLIC_BODY: "PUBLIC_BODY" = "PUBLIC_BODY"
  inline val RESELLER: "RESELLER" = "RESELLER"

  inline def values: js.Array[ContactType] = js.Array(PERSON, COMPANY, ASSOCIATION, PUBLIC_BODY, RESELLER)
}

type CountryCode = "AD" | "AE" | "AF" | "AG" | "AI" | "AL" | "AM" | "AN" | "AO" | "AQ" | "AR" | "AS" | "AT" | "AU" | "AW" | "AZ" | "BA" | "BB" | "BD" | "BE" | "BF" | "BG" | "BH" | "BI" | "BJ" | "BL" | "BM" | "BN" | "BO" | "BR" | "BS" | "BT" | "BW" | "BY" | "BZ" | "CA" | "CC" | "CD" | "CF" | "CG" | "CH" | "CI" | "CK" | "CL" | "CM" | "CN" | "CO" | "CR" | "CU" | "CV" | "CX" | "CY" | "CZ" | "DE" | "DJ" | "DK" | "DM" | "DO" | "DZ" | "EC" | "EE" | "EG" | "ER" | "ES" | "ET" | "FI" | "FJ" | "FK" | "FM" | "FO" | "FR" | "GA" | "GB" | "GD" | "GE" | "GH" | "GI" | "GL" | "GM" | "GN" | "GQ" | "GR" | "GT" | "GU" | "GW" | "GY" | "HK" | "HN" | "HR" | "HT" | "HU" | "ID" | "IE" | "IL" | "IM" | "IN" | "IQ" | "IR" | "IS" | "IT" | "JM" | "JO" | "JP" | "KE" | "KG" | "KH" | "KI" | "KM" | "KN" | "KP" | "KR" | "KW" | "KY" | "KZ" | "LA" | "LB" | "LC" | "LI" | "LK" | "LR" | "LS" | "LT" | "LU" | "LV" | "LY" | "MA" | "MC" | "MD" | "ME" | "MF" | "MG" | "MH" | "MK" | "ML" | "MM" | "MN" | "MO" | "MP" | "MR" | "MS" |
  "MT" | "MU" | "MV" | "MW" | "MX" | "MY" | "MZ" | "NA" | "NC" | "NE" | "NG" | "NI" | "NL" | "NO" | "NP" | "NR" | "NU" | "NZ" | "OM" | "PA" | "PE" | "PF" | "PG" | "PH" | "PK" | "PL" | "PM" | "PN" | "PR" | "PT" | "PW" | "PY" | "QA" | "RO" | "RS" | "RU" | "RW" | "SA" | "SB" | "SC" | "SD" | "SE" | "SG" | "SH" | "SI" | "SK" | "SL" | "SM" | "SN" | "SO" | "SR" | "ST" | "SV" | "SY" | "SZ" | "TC" | "TD" | "TG" | "TH" | "TJ" | "TK" | "TL" | "TM" | "TN" | "TO" | "TR" | "TT" | "TV" | "TW" | "TZ" | "UA" | "UG" | "US" | "UY" | "UZ" | "VA" | "VC" | "VE" | "VG" | "VI" | "VN" | "VU" | "WF" | "WS" | "YE" | "YT" | "ZA" | "ZM" | "ZW"
object CountryCode {
  inline val AD: "AD" = "AD"
  inline val AE: "AE" = "AE"
  inline val AF: "AF" = "AF"
  inline val AG: "AG" = "AG"
  inline val AI: "AI" = "AI"
  inline val AL: "AL" = "AL"
  inline val AM: "AM" = "AM"
  inline val AN: "AN" = "AN"
  inline val AO: "AO" = "AO"
  inline val AQ: "AQ" = "AQ"
  inline val AR: "AR" = "AR"
  inline val AS: "AS" = "AS"
  inline val AT: "AT" = "AT"
  inline val AU: "AU" = "AU"
  inline val AW: "AW" = "AW"
  inline val AZ: "AZ" = "AZ"
  inline val BA: "BA" = "BA"
  inline val BB: "BB" = "BB"
  inline val BD: "BD" = "BD"
  inline val BE: "BE" = "BE"
  inline val BF: "BF" = "BF"
  inline val BG: "BG" = "BG"
  inline val BH: "BH" = "BH"
  inline val BI: "BI" = "BI"
  inline val BJ: "BJ" = "BJ"
  inline val BL: "BL" = "BL"
  inline val BM: "BM" = "BM"
  inline val BN: "BN" = "BN"
  inline val BO: "BO" = "BO"
  inline val BR: "BR" = "BR"
  inline val BS: "BS" = "BS"
  inline val BT: "BT" = "BT"
  inline val BW: "BW" = "BW"
  inline val BY: "BY" = "BY"
  inline val BZ: "BZ" = "BZ"
  inline val CA: "CA" = "CA"
  inline val CC: "CC" = "CC"
  inline val CD: "CD" = "CD"
  inline val CF: "CF" = "CF"
  inline val CG: "CG" = "CG"
  inline val CH: "CH" = "CH"
  inline val CI: "CI" = "CI"
  inline val CK: "CK" = "CK"
  inline val CL: "CL" = "CL"
  inline val CM: "CM" = "CM"
  inline val CN: "CN" = "CN"
  inline val CO: "CO" = "CO"
  inline val CR: "CR" = "CR"
  inline val CU: "CU" = "CU"
  inline val CV: "CV" = "CV"
  inline val CX: "CX" = "CX"
  inline val CY: "CY" = "CY"
  inline val CZ: "CZ" = "CZ"
  inline val DE: "DE" = "DE"
  inline val DJ: "DJ" = "DJ"
  inline val DK: "DK" = "DK"
  inline val DM: "DM" = "DM"
  inline val DO: "DO" = "DO"
  inline val DZ: "DZ" = "DZ"
  inline val EC: "EC" = "EC"
  inline val EE: "EE" = "EE"
  inline val EG: "EG" = "EG"
  inline val ER: "ER" = "ER"
  inline val ES: "ES" = "ES"
  inline val ET: "ET" = "ET"
  inline val FI: "FI" = "FI"
  inline val FJ: "FJ" = "FJ"
  inline val FK: "FK" = "FK"
  inline val FM: "FM" = "FM"
  inline val FO: "FO" = "FO"
  inline val FR: "FR" = "FR"
  inline val GA: "GA" = "GA"
  inline val GB: "GB" = "GB"
  inline val GD: "GD" = "GD"
  inline val GE: "GE" = "GE"
  inline val GH: "GH" = "GH"
  inline val GI: "GI" = "GI"
  inline val GL: "GL" = "GL"
  inline val GM: "GM" = "GM"
  inline val GN: "GN" = "GN"
  inline val GQ: "GQ" = "GQ"
  inline val GR: "GR" = "GR"
  inline val GT: "GT" = "GT"
  inline val GU: "GU" = "GU"
  inline val GW: "GW" = "GW"
  inline val GY: "GY" = "GY"
  inline val HK: "HK" = "HK"
  inline val HN: "HN" = "HN"
  inline val HR: "HR" = "HR"
  inline val HT: "HT" = "HT"
  inline val HU: "HU" = "HU"
  inline val ID: "ID" = "ID"
  inline val IE: "IE" = "IE"
  inline val IL: "IL" = "IL"
  inline val IM: "IM" = "IM"
  inline val IN: "IN" = "IN"
  inline val IQ: "IQ" = "IQ"
  inline val IR: "IR" = "IR"
  inline val IS: "IS" = "IS"
  inline val IT: "IT" = "IT"
  inline val JM: "JM" = "JM"
  inline val JO: "JO" = "JO"
  inline val JP: "JP" = "JP"
  inline val KE: "KE" = "KE"
  inline val KG: "KG" = "KG"
  inline val KH: "KH" = "KH"
  inline val KI: "KI" = "KI"
  inline val KM: "KM" = "KM"
  inline val KN: "KN" = "KN"
  inline val KP: "KP" = "KP"
  inline val KR: "KR" = "KR"
  inline val KW: "KW" = "KW"
  inline val KY: "KY" = "KY"
  inline val KZ: "KZ" = "KZ"
  inline val LA: "LA" = "LA"
  inline val LB: "LB" = "LB"
  inline val LC: "LC" = "LC"
  inline val LI: "LI" = "LI"
  inline val LK: "LK" = "LK"
  inline val LR: "LR" = "LR"
  inline val LS: "LS" = "LS"
  inline val LT: "LT" = "LT"
  inline val LU: "LU" = "LU"
  inline val LV: "LV" = "LV"
  inline val LY: "LY" = "LY"
  inline val MA: "MA" = "MA"
  inline val MC: "MC" = "MC"
  inline val MD: "MD" = "MD"
  inline val ME: "ME" = "ME"
  inline val MF: "MF" = "MF"
  inline val MG: "MG" = "MG"
  inline val MH: "MH" = "MH"
  inline val MK: "MK" = "MK"
  inline val ML: "ML" = "ML"
  inline val MM: "MM" = "MM"
  inline val MN: "MN" = "MN"
  inline val MO: "MO" = "MO"
  inline val MP: "MP" = "MP"
  inline val MR: "MR" = "MR"
  inline val MS: "MS" = "MS"
  inline val MT: "MT" = "MT"
  inline val MU: "MU" = "MU"
  inline val MV: "MV" = "MV"
  inline val MW: "MW" = "MW"
  inline val MX: "MX" = "MX"
  inline val MY: "MY" = "MY"
  inline val MZ: "MZ" = "MZ"
  inline val NA: "NA" = "NA"
  inline val NC: "NC" = "NC"
  inline val NE: "NE" = "NE"
  inline val NG: "NG" = "NG"
  inline val NI: "NI" = "NI"
  inline val NL: "NL" = "NL"
  inline val NO: "NO" = "NO"
  inline val NP: "NP" = "NP"
  inline val NR: "NR" = "NR"
  inline val NU: "NU" = "NU"
  inline val NZ: "NZ" = "NZ"
  inline val OM: "OM" = "OM"
  inline val PA: "PA" = "PA"
  inline val PE: "PE" = "PE"
  inline val PF: "PF" = "PF"
  inline val PG: "PG" = "PG"
  inline val PH: "PH" = "PH"
  inline val PK: "PK" = "PK"
  inline val PL: "PL" = "PL"
  inline val PM: "PM" = "PM"
  inline val PN: "PN" = "PN"
  inline val PR: "PR" = "PR"
  inline val PT: "PT" = "PT"
  inline val PW: "PW" = "PW"
  inline val PY: "PY" = "PY"
  inline val QA: "QA" = "QA"
  inline val RO: "RO" = "RO"
  inline val RS: "RS" = "RS"
  inline val RU: "RU" = "RU"
  inline val RW: "RW" = "RW"
  inline val SA: "SA" = "SA"
  inline val SB: "SB" = "SB"
  inline val SC: "SC" = "SC"
  inline val SD: "SD" = "SD"
  inline val SE: "SE" = "SE"
  inline val SG: "SG" = "SG"
  inline val SH: "SH" = "SH"
  inline val SI: "SI" = "SI"
  inline val SK: "SK" = "SK"
  inline val SL: "SL" = "SL"
  inline val SM: "SM" = "SM"
  inline val SN: "SN" = "SN"
  inline val SO: "SO" = "SO"
  inline val SR: "SR" = "SR"
  inline val ST: "ST" = "ST"
  inline val SV: "SV" = "SV"
  inline val SY: "SY" = "SY"
  inline val SZ: "SZ" = "SZ"
  inline val TC: "TC" = "TC"
  inline val TD: "TD" = "TD"
  inline val TG: "TG" = "TG"
  inline val TH: "TH" = "TH"
  inline val TJ: "TJ" = "TJ"
  inline val TK: "TK" = "TK"
  inline val TL: "TL" = "TL"
  inline val TM: "TM" = "TM"
  inline val TN: "TN" = "TN"
  inline val TO: "TO" = "TO"
  inline val TR: "TR" = "TR"
  inline val TT: "TT" = "TT"
  inline val TV: "TV" = "TV"
  inline val TW: "TW" = "TW"
  inline val TZ: "TZ" = "TZ"
  inline val UA: "UA" = "UA"
  inline val UG: "UG" = "UG"
  inline val US: "US" = "US"
  inline val UY: "UY" = "UY"
  inline val UZ: "UZ" = "UZ"
  inline val VA: "VA" = "VA"
  inline val VC: "VC" = "VC"
  inline val VE: "VE" = "VE"
  inline val VG: "VG" = "VG"
  inline val VI: "VI" = "VI"
  inline val VN: "VN" = "VN"
  inline val VU: "VU" = "VU"
  inline val WF: "WF" = "WF"
  inline val WS: "WS" = "WS"
  inline val YE: "YE" = "YE"
  inline val YT: "YT" = "YT"
  inline val ZA: "ZA" = "ZA"
  inline val ZM: "ZM" = "ZM"
  inline val ZW: "ZW" = "ZW"

  inline def values: js.Array[CountryCode] = js.Array(
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
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val AVAILABLE_RESERVED: "AVAILABLE_RESERVED" = "AVAILABLE_RESERVED"
  inline val AVAILABLE_PREORDER: "AVAILABLE_PREORDER" = "AVAILABLE_PREORDER"
  inline val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"
  inline val UNAVAILABLE_PREMIUM: "UNAVAILABLE_PREMIUM" = "UNAVAILABLE_PREMIUM"
  inline val UNAVAILABLE_RESTRICTED: "UNAVAILABLE_RESTRICTED" = "UNAVAILABLE_RESTRICTED"
  inline val RESERVED: "RESERVED" = "RESERVED"
  inline val DONT_KNOW: "DONT_KNOW" = "DONT_KNOW"

  inline def values: js.Array[DomainAvailability] = js.Array(AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER, UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED, DONT_KNOW)
}

type ExtraParamName = "DUNS_NUMBER" | "BRAND_NUMBER" | "BIRTH_DEPARTMENT" | "BIRTH_DATE_IN_YYYY_MM_DD" | "BIRTH_COUNTRY" | "BIRTH_CITY" | "DOCUMENT_NUMBER" | "AU_ID_NUMBER" | "AU_ID_TYPE" | "CA_LEGAL_TYPE" | "CA_BUSINESS_ENTITY_TYPE" | "CA_LEGAL_REPRESENTATIVE" | "CA_LEGAL_REPRESENTATIVE_CAPACITY" | "ES_IDENTIFICATION" | "ES_IDENTIFICATION_TYPE" | "ES_LEGAL_FORM" | "FI_BUSINESS_NUMBER" | "FI_ID_NUMBER" | "FI_NATIONALITY" | "FI_ORGANIZATION_TYPE" | "IT_NATIONALITY" | "IT_PIN" | "IT_REGISTRANT_ENTITY_TYPE" | "RU_PASSPORT_DATA" | "SE_ID_NUMBER" | "SG_ID_NUMBER" | "VAT_NUMBER" | "UK_CONTACT_TYPE" | "UK_COMPANY_NUMBER"
object ExtraParamName {
  inline val DUNS_NUMBER: "DUNS_NUMBER" = "DUNS_NUMBER"
  inline val BRAND_NUMBER: "BRAND_NUMBER" = "BRAND_NUMBER"
  inline val BIRTH_DEPARTMENT: "BIRTH_DEPARTMENT" = "BIRTH_DEPARTMENT"
  inline val BIRTH_DATE_IN_YYYY_MM_DD: "BIRTH_DATE_IN_YYYY_MM_DD" = "BIRTH_DATE_IN_YYYY_MM_DD"
  inline val BIRTH_COUNTRY: "BIRTH_COUNTRY" = "BIRTH_COUNTRY"
  inline val BIRTH_CITY: "BIRTH_CITY" = "BIRTH_CITY"
  inline val DOCUMENT_NUMBER: "DOCUMENT_NUMBER" = "DOCUMENT_NUMBER"
  inline val AU_ID_NUMBER: "AU_ID_NUMBER" = "AU_ID_NUMBER"
  inline val AU_ID_TYPE: "AU_ID_TYPE" = "AU_ID_TYPE"
  inline val CA_LEGAL_TYPE: "CA_LEGAL_TYPE" = "CA_LEGAL_TYPE"
  inline val CA_BUSINESS_ENTITY_TYPE: "CA_BUSINESS_ENTITY_TYPE" = "CA_BUSINESS_ENTITY_TYPE"
  inline val CA_LEGAL_REPRESENTATIVE: "CA_LEGAL_REPRESENTATIVE" = "CA_LEGAL_REPRESENTATIVE"
  inline val CA_LEGAL_REPRESENTATIVE_CAPACITY: "CA_LEGAL_REPRESENTATIVE_CAPACITY" = "CA_LEGAL_REPRESENTATIVE_CAPACITY"
  inline val ES_IDENTIFICATION: "ES_IDENTIFICATION" = "ES_IDENTIFICATION"
  inline val ES_IDENTIFICATION_TYPE: "ES_IDENTIFICATION_TYPE" = "ES_IDENTIFICATION_TYPE"
  inline val ES_LEGAL_FORM: "ES_LEGAL_FORM" = "ES_LEGAL_FORM"
  inline val FI_BUSINESS_NUMBER: "FI_BUSINESS_NUMBER" = "FI_BUSINESS_NUMBER"
  inline val FI_ID_NUMBER: "FI_ID_NUMBER" = "FI_ID_NUMBER"
  inline val FI_NATIONALITY: "FI_NATIONALITY" = "FI_NATIONALITY"
  inline val FI_ORGANIZATION_TYPE: "FI_ORGANIZATION_TYPE" = "FI_ORGANIZATION_TYPE"
  inline val IT_NATIONALITY: "IT_NATIONALITY" = "IT_NATIONALITY"
  inline val IT_PIN: "IT_PIN" = "IT_PIN"
  inline val IT_REGISTRANT_ENTITY_TYPE: "IT_REGISTRANT_ENTITY_TYPE" = "IT_REGISTRANT_ENTITY_TYPE"
  inline val RU_PASSPORT_DATA: "RU_PASSPORT_DATA" = "RU_PASSPORT_DATA"
  inline val SE_ID_NUMBER: "SE_ID_NUMBER" = "SE_ID_NUMBER"
  inline val SG_ID_NUMBER: "SG_ID_NUMBER" = "SG_ID_NUMBER"
  inline val VAT_NUMBER: "VAT_NUMBER" = "VAT_NUMBER"
  inline val UK_CONTACT_TYPE: "UK_CONTACT_TYPE" = "UK_CONTACT_TYPE"
  inline val UK_COMPANY_NUMBER: "UK_COMPANY_NUMBER" = "UK_COMPANY_NUMBER"

  inline def values: js.Array[ExtraParamName] = js.Array(
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
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val ERROR: "ERROR" = "ERROR"
  inline val SUCCESSFUL: "SUCCESSFUL" = "SUCCESSFUL"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[OperationStatus] = js.Array(SUBMITTED, IN_PROGRESS, ERROR, SUCCESSFUL, FAILED)
}

type OperationType = "REGISTER_DOMAIN" | "DELETE_DOMAIN" | "TRANSFER_IN_DOMAIN" | "UPDATE_DOMAIN_CONTACT" | "UPDATE_NAMESERVER" | "CHANGE_PRIVACY_PROTECTION" | "DOMAIN_LOCK" | "ENABLE_AUTORENEW" | "DISABLE_AUTORENEW" | "ADD_DNSSEC" | "REMOVE_DNSSEC" | "EXPIRE_DOMAIN" | "TRANSFER_OUT_DOMAIN" | "CHANGE_DOMAIN_OWNER" | "RENEW_DOMAIN" | "PUSH_DOMAIN" | "INTERNAL_TRANSFER_OUT_DOMAIN" | "INTERNAL_TRANSFER_IN_DOMAIN"
object OperationType {
  inline val REGISTER_DOMAIN: "REGISTER_DOMAIN" = "REGISTER_DOMAIN"
  inline val DELETE_DOMAIN: "DELETE_DOMAIN" = "DELETE_DOMAIN"
  inline val TRANSFER_IN_DOMAIN: "TRANSFER_IN_DOMAIN" = "TRANSFER_IN_DOMAIN"
  inline val UPDATE_DOMAIN_CONTACT: "UPDATE_DOMAIN_CONTACT" = "UPDATE_DOMAIN_CONTACT"
  inline val UPDATE_NAMESERVER: "UPDATE_NAMESERVER" = "UPDATE_NAMESERVER"
  inline val CHANGE_PRIVACY_PROTECTION: "CHANGE_PRIVACY_PROTECTION" = "CHANGE_PRIVACY_PROTECTION"
  inline val DOMAIN_LOCK: "DOMAIN_LOCK" = "DOMAIN_LOCK"
  inline val ENABLE_AUTORENEW: "ENABLE_AUTORENEW" = "ENABLE_AUTORENEW"
  inline val DISABLE_AUTORENEW: "DISABLE_AUTORENEW" = "DISABLE_AUTORENEW"
  inline val ADD_DNSSEC: "ADD_DNSSEC" = "ADD_DNSSEC"
  inline val REMOVE_DNSSEC: "REMOVE_DNSSEC" = "REMOVE_DNSSEC"
  inline val EXPIRE_DOMAIN: "EXPIRE_DOMAIN" = "EXPIRE_DOMAIN"
  inline val TRANSFER_OUT_DOMAIN: "TRANSFER_OUT_DOMAIN" = "TRANSFER_OUT_DOMAIN"
  inline val CHANGE_DOMAIN_OWNER: "CHANGE_DOMAIN_OWNER" = "CHANGE_DOMAIN_OWNER"
  inline val RENEW_DOMAIN: "RENEW_DOMAIN" = "RENEW_DOMAIN"
  inline val PUSH_DOMAIN: "PUSH_DOMAIN" = "PUSH_DOMAIN"
  inline val INTERNAL_TRANSFER_OUT_DOMAIN: "INTERNAL_TRANSFER_OUT_DOMAIN" = "INTERNAL_TRANSFER_OUT_DOMAIN"
  inline val INTERNAL_TRANSFER_IN_DOMAIN: "INTERNAL_TRANSFER_IN_DOMAIN" = "INTERNAL_TRANSFER_IN_DOMAIN"

  inline def values: js.Array[OperationType] = js.Array(
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
  inline val PENDING: "PENDING" = "PENDING"
  inline val DONE: "DONE" = "DONE"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"

  inline def values: js.Array[ReachabilityStatus] = js.Array(PENDING, DONE, EXPIRED)
}

/** Whether the domain name can be transferred to Route 53.
  *
  * '''Note:'''You can transfer only domains that have a value of <code>TRANSFERABLE</code> for <code>Transferable</code>. Valid values: <dl> <dt>TRANSFERABLE</dt> <dd> The domain name can be transferred to Route 53. </dd> <dt>UNTRANSFERRABLE</dt> <dd> The domain name can't be transferred to Route 53. </dd> <dt>DONT_KNOW</dt> <dd> Reserved for future use. </dd> </dl>
  */
type Transferable = "TRANSFERABLE" | "UNTRANSFERABLE" | "DONT_KNOW"
object Transferable {
  inline val TRANSFERABLE: "TRANSFERABLE" = "TRANSFERABLE"
  inline val UNTRANSFERABLE: "UNTRANSFERABLE" = "UNTRANSFERABLE"
  inline val DONT_KNOW: "DONT_KNOW" = "DONT_KNOW"

  inline def values: js.Array[Transferable] = js.Array(TRANSFERABLE, UNTRANSFERABLE, DONT_KNOW)
}
