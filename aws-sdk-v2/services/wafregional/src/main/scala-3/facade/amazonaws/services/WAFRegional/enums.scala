package facade.amazonaws.services.wafregional

import scalajs.js

type ChangeAction = "INSERT" | "DELETE"
object ChangeAction {
  inline val INSERT: "INSERT" = "INSERT"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[ChangeAction] = js.Array(INSERT, DELETE)
}

type ChangeTokenStatus = "PROVISIONED" | "PENDING" | "INSYNC"
object ChangeTokenStatus {
  inline val PROVISIONED: "PROVISIONED" = "PROVISIONED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val INSYNC: "INSYNC" = "INSYNC"

  inline def values: js.Array[ChangeTokenStatus] = js.Array(PROVISIONED, PENDING, INSYNC)
}

type ComparisonOperator = "EQ" | "NE" | "LE" | "LT" | "GE" | "GT"
object ComparisonOperator {
  inline val EQ: "EQ" = "EQ"
  inline val NE: "NE" = "NE"
  inline val LE: "LE" = "LE"
  inline val LT: "LT" = "LT"
  inline val GE: "GE" = "GE"
  inline val GT: "GT" = "GT"

  inline def values: js.Array[ComparisonOperator] = js.Array(EQ, NE, LE, LT, GE, GT)
}

type GeoMatchConstraintType = "Country"
object GeoMatchConstraintType {
  inline val Country: "Country" = "Country"

  inline def values: js.Array[GeoMatchConstraintType] = js.Array(Country)
}

type GeoMatchConstraintValue =
  "AF" | "AX" | "AL" | "DZ" | "AS" | "AD" | "AO" | "AI" | "AQ" | "AG" | "AR" | "AM" | "AW" | "AU" | "AT" | "AZ" | "BS" | "BH" | "BD" | "BB" | "BY" | "BE" | "BZ" | "BJ" | "BM" | "BT" | "BO" | "BQ" | "BA" | "BW" | "BV" | "BR" | "IO" | "BN" | "BG" | "BF" | "BI" | "KH" | "CM" | "CA" | "CV" | "KY" | "CF" | "TD" | "CL" | "CN" | "CX" | "CC" | "CO" | "KM" | "CG" | "CD" | "CK" | "CR" | "CI" | "HR" | "CU" | "CW" | "CY" | "CZ" | "DK" | "DJ" | "DM" | "DO" | "EC" | "EG" | "SV" | "GQ" | "ER" | "EE" | "ET" | "FK" | "FO" | "FJ" | "FI" | "FR" | "GF" | "PF" | "TF" | "GA" | "GM" | "GE" | "DE" | "GH" | "GI" | "GR" | "GL" | "GD" | "GP" | "GU" | "GT" | "GG" | "GN" | "GW" | "GY" | "HT" | "HM" | "VA" | "HN" | "HK" | "HU" | "IS" | "IN" | "ID" | "IR" | "IQ" | "IE" | "IM" | "IL" | "IT" | "JM" | "JP" | "JE" | "JO" | "KZ" | "KE" | "KI" | "KP" | "KR" | "KW" | "KG" | "LA" | "LV" | "LB" | "LS" | "LR" | "LY" | "LI" | "LT" | "LU" | "MO" | "MK" | "MG" | "MW" | "MY" | "MV" | "ML" | "MT" | "MH" | "MQ" | "MR" | "MU" | "YT" | "MX" | "FM" | "MD" | "MC" | "MN" | "ME" | "MS" | "MA" | "MZ" | "MM" | "NA" | "NR" | "NP" | "NL" | "NC" | "NZ" | "NI" | "NE" | "NG" | "NU" | "NF" | "MP" | "NO" | "OM" | "PK" | "PW" | "PS" | "PA" | "PG" | "PY" | "PE" | "PH" | "PN" | "PL" | "PT" | "PR" | "QA" | "RE" | "RO" | "RU" | "RW" | "BL" | "SH" | "KN" | "LC" | "MF" | "PM" | "VC" | "WS" | "SM" | "ST" | "SA" | "SN" | "RS" | "SC" | "SL" | "SG" | "SX" | "SK" | "SI" | "SB" | "SO" | "ZA" | "GS" | "SS" | "ES" | "LK" | "SD" | "SR" | "SJ" | "SZ" | "SE" | "CH" | "SY" | "TW" | "TJ" | "TZ" | "TH" | "TL" | "TG" | "TK" | "TO" | "TT" | "TN" | "TR" | "TM" | "TC" | "TV" | "UG" | "UA" | "AE" | "GB" | "US" | "UM" | "UY" | "UZ" | "VU" | "VE" | "VN" | "VG" | "VI" | "WF" | "EH" | "YE" | "ZM" | "ZW"
object GeoMatchConstraintValue {
  inline val AF: "AF" = "AF"
  inline val AX: "AX" = "AX"
  inline val AL: "AL" = "AL"
  inline val DZ: "DZ" = "DZ"
  inline val AS: "AS" = "AS"
  inline val AD: "AD" = "AD"
  inline val AO: "AO" = "AO"
  inline val AI: "AI" = "AI"
  inline val AQ: "AQ" = "AQ"
  inline val AG: "AG" = "AG"
  inline val AR: "AR" = "AR"
  inline val AM: "AM" = "AM"
  inline val AW: "AW" = "AW"
  inline val AU: "AU" = "AU"
  inline val AT: "AT" = "AT"
  inline val AZ: "AZ" = "AZ"
  inline val BS: "BS" = "BS"
  inline val BH: "BH" = "BH"
  inline val BD: "BD" = "BD"
  inline val BB: "BB" = "BB"
  inline val BY: "BY" = "BY"
  inline val BE: "BE" = "BE"
  inline val BZ: "BZ" = "BZ"
  inline val BJ: "BJ" = "BJ"
  inline val BM: "BM" = "BM"
  inline val BT: "BT" = "BT"
  inline val BO: "BO" = "BO"
  inline val BQ: "BQ" = "BQ"
  inline val BA: "BA" = "BA"
  inline val BW: "BW" = "BW"
  inline val BV: "BV" = "BV"
  inline val BR: "BR" = "BR"
  inline val IO: "IO" = "IO"
  inline val BN: "BN" = "BN"
  inline val BG: "BG" = "BG"
  inline val BF: "BF" = "BF"
  inline val BI: "BI" = "BI"
  inline val KH: "KH" = "KH"
  inline val CM: "CM" = "CM"
  inline val CA: "CA" = "CA"
  inline val CV: "CV" = "CV"
  inline val KY: "KY" = "KY"
  inline val CF: "CF" = "CF"
  inline val TD: "TD" = "TD"
  inline val CL: "CL" = "CL"
  inline val CN: "CN" = "CN"
  inline val CX: "CX" = "CX"
  inline val CC: "CC" = "CC"
  inline val CO: "CO" = "CO"
  inline val KM: "KM" = "KM"
  inline val CG: "CG" = "CG"
  inline val CD: "CD" = "CD"
  inline val CK: "CK" = "CK"
  inline val CR: "CR" = "CR"
  inline val CI: "CI" = "CI"
  inline val HR: "HR" = "HR"
  inline val CU: "CU" = "CU"
  inline val CW: "CW" = "CW"
  inline val CY: "CY" = "CY"
  inline val CZ: "CZ" = "CZ"
  inline val DK: "DK" = "DK"
  inline val DJ: "DJ" = "DJ"
  inline val DM: "DM" = "DM"
  inline val DO: "DO" = "DO"
  inline val EC: "EC" = "EC"
  inline val EG: "EG" = "EG"
  inline val SV: "SV" = "SV"
  inline val GQ: "GQ" = "GQ"
  inline val ER: "ER" = "ER"
  inline val EE: "EE" = "EE"
  inline val ET: "ET" = "ET"
  inline val FK: "FK" = "FK"
  inline val FO: "FO" = "FO"
  inline val FJ: "FJ" = "FJ"
  inline val FI: "FI" = "FI"
  inline val FR: "FR" = "FR"
  inline val GF: "GF" = "GF"
  inline val PF: "PF" = "PF"
  inline val TF: "TF" = "TF"
  inline val GA: "GA" = "GA"
  inline val GM: "GM" = "GM"
  inline val GE: "GE" = "GE"
  inline val DE: "DE" = "DE"
  inline val GH: "GH" = "GH"
  inline val GI: "GI" = "GI"
  inline val GR: "GR" = "GR"
  inline val GL: "GL" = "GL"
  inline val GD: "GD" = "GD"
  inline val GP: "GP" = "GP"
  inline val GU: "GU" = "GU"
  inline val GT: "GT" = "GT"
  inline val GG: "GG" = "GG"
  inline val GN: "GN" = "GN"
  inline val GW: "GW" = "GW"
  inline val GY: "GY" = "GY"
  inline val HT: "HT" = "HT"
  inline val HM: "HM" = "HM"
  inline val VA: "VA" = "VA"
  inline val HN: "HN" = "HN"
  inline val HK: "HK" = "HK"
  inline val HU: "HU" = "HU"
  inline val IS: "IS" = "IS"
  inline val IN: "IN" = "IN"
  inline val ID: "ID" = "ID"
  inline val IR: "IR" = "IR"
  inline val IQ: "IQ" = "IQ"
  inline val IE: "IE" = "IE"
  inline val IM: "IM" = "IM"
  inline val IL: "IL" = "IL"
  inline val IT: "IT" = "IT"
  inline val JM: "JM" = "JM"
  inline val JP: "JP" = "JP"
  inline val JE: "JE" = "JE"
  inline val JO: "JO" = "JO"
  inline val KZ: "KZ" = "KZ"
  inline val KE: "KE" = "KE"
  inline val KI: "KI" = "KI"
  inline val KP: "KP" = "KP"
  inline val KR: "KR" = "KR"
  inline val KW: "KW" = "KW"
  inline val KG: "KG" = "KG"
  inline val LA: "LA" = "LA"
  inline val LV: "LV" = "LV"
  inline val LB: "LB" = "LB"
  inline val LS: "LS" = "LS"
  inline val LR: "LR" = "LR"
  inline val LY: "LY" = "LY"
  inline val LI: "LI" = "LI"
  inline val LT: "LT" = "LT"
  inline val LU: "LU" = "LU"
  inline val MO: "MO" = "MO"
  inline val MK: "MK" = "MK"
  inline val MG: "MG" = "MG"
  inline val MW: "MW" = "MW"
  inline val MY: "MY" = "MY"
  inline val MV: "MV" = "MV"
  inline val ML: "ML" = "ML"
  inline val MT: "MT" = "MT"
  inline val MH: "MH" = "MH"
  inline val MQ: "MQ" = "MQ"
  inline val MR: "MR" = "MR"
  inline val MU: "MU" = "MU"
  inline val YT: "YT" = "YT"
  inline val MX: "MX" = "MX"
  inline val FM: "FM" = "FM"
  inline val MD: "MD" = "MD"
  inline val MC: "MC" = "MC"
  inline val MN: "MN" = "MN"
  inline val ME: "ME" = "ME"
  inline val MS: "MS" = "MS"
  inline val MA: "MA" = "MA"
  inline val MZ: "MZ" = "MZ"
  inline val MM: "MM" = "MM"
  inline val NA: "NA" = "NA"
  inline val NR: "NR" = "NR"
  inline val NP: "NP" = "NP"
  inline val NL: "NL" = "NL"
  inline val NC: "NC" = "NC"
  inline val NZ: "NZ" = "NZ"
  inline val NI: "NI" = "NI"
  inline val NE: "NE" = "NE"
  inline val NG: "NG" = "NG"
  inline val NU: "NU" = "NU"
  inline val NF: "NF" = "NF"
  inline val MP: "MP" = "MP"
  inline val NO: "NO" = "NO"
  inline val OM: "OM" = "OM"
  inline val PK: "PK" = "PK"
  inline val PW: "PW" = "PW"
  inline val PS: "PS" = "PS"
  inline val PA: "PA" = "PA"
  inline val PG: "PG" = "PG"
  inline val PY: "PY" = "PY"
  inline val PE: "PE" = "PE"
  inline val PH: "PH" = "PH"
  inline val PN: "PN" = "PN"
  inline val PL: "PL" = "PL"
  inline val PT: "PT" = "PT"
  inline val PR: "PR" = "PR"
  inline val QA: "QA" = "QA"
  inline val RE: "RE" = "RE"
  inline val RO: "RO" = "RO"
  inline val RU: "RU" = "RU"
  inline val RW: "RW" = "RW"
  inline val BL: "BL" = "BL"
  inline val SH: "SH" = "SH"
  inline val KN: "KN" = "KN"
  inline val LC: "LC" = "LC"
  inline val MF: "MF" = "MF"
  inline val PM: "PM" = "PM"
  inline val VC: "VC" = "VC"
  inline val WS: "WS" = "WS"
  inline val SM: "SM" = "SM"
  inline val ST: "ST" = "ST"
  inline val SA: "SA" = "SA"
  inline val SN: "SN" = "SN"
  inline val RS: "RS" = "RS"
  inline val SC: "SC" = "SC"
  inline val SL: "SL" = "SL"
  inline val SG: "SG" = "SG"
  inline val SX: "SX" = "SX"
  inline val SK: "SK" = "SK"
  inline val SI: "SI" = "SI"
  inline val SB: "SB" = "SB"
  inline val SO: "SO" = "SO"
  inline val ZA: "ZA" = "ZA"
  inline val GS: "GS" = "GS"
  inline val SS: "SS" = "SS"
  inline val ES: "ES" = "ES"
  inline val LK: "LK" = "LK"
  inline val SD: "SD" = "SD"
  inline val SR: "SR" = "SR"
  inline val SJ: "SJ" = "SJ"
  inline val SZ: "SZ" = "SZ"
  inline val SE: "SE" = "SE"
  inline val CH: "CH" = "CH"
  inline val SY: "SY" = "SY"
  inline val TW: "TW" = "TW"
  inline val TJ: "TJ" = "TJ"
  inline val TZ: "TZ" = "TZ"
  inline val TH: "TH" = "TH"
  inline val TL: "TL" = "TL"
  inline val TG: "TG" = "TG"
  inline val TK: "TK" = "TK"
  inline val TO: "TO" = "TO"
  inline val TT: "TT" = "TT"
  inline val TN: "TN" = "TN"
  inline val TR: "TR" = "TR"
  inline val TM: "TM" = "TM"
  inline val TC: "TC" = "TC"
  inline val TV: "TV" = "TV"
  inline val UG: "UG" = "UG"
  inline val UA: "UA" = "UA"
  inline val AE: "AE" = "AE"
  inline val GB: "GB" = "GB"
  inline val US: "US" = "US"
  inline val UM: "UM" = "UM"
  inline val UY: "UY" = "UY"
  inline val UZ: "UZ" = "UZ"
  inline val VU: "VU" = "VU"
  inline val VE: "VE" = "VE"
  inline val VN: "VN" = "VN"
  inline val VG: "VG" = "VG"
  inline val VI: "VI" = "VI"
  inline val WF: "WF" = "WF"
  inline val EH: "EH" = "EH"
  inline val YE: "YE" = "YE"
  inline val ZM: "ZM" = "ZM"
  inline val ZW: "ZW" = "ZW"

  inline def values: js.Array[GeoMatchConstraintValue] = js.Array(
    AF,
    AX,
    AL,
    DZ,
    AS,
    AD,
    AO,
    AI,
    AQ,
    AG,
    AR,
    AM,
    AW,
    AU,
    AT,
    AZ,
    BS,
    BH,
    BD,
    BB,
    BY,
    BE,
    BZ,
    BJ,
    BM,
    BT,
    BO,
    BQ,
    BA,
    BW,
    BV,
    BR,
    IO,
    BN,
    BG,
    BF,
    BI,
    KH,
    CM,
    CA,
    CV,
    KY,
    CF,
    TD,
    CL,
    CN,
    CX,
    CC,
    CO,
    KM,
    CG,
    CD,
    CK,
    CR,
    CI,
    HR,
    CU,
    CW,
    CY,
    CZ,
    DK,
    DJ,
    DM,
    DO,
    EC,
    EG,
    SV,
    GQ,
    ER,
    EE,
    ET,
    FK,
    FO,
    FJ,
    FI,
    FR,
    GF,
    PF,
    TF,
    GA,
    GM,
    GE,
    DE,
    GH,
    GI,
    GR,
    GL,
    GD,
    GP,
    GU,
    GT,
    GG,
    GN,
    GW,
    GY,
    HT,
    HM,
    VA,
    HN,
    HK,
    HU,
    IS,
    IN,
    ID,
    IR,
    IQ,
    IE,
    IM,
    IL,
    IT,
    JM,
    JP,
    JE,
    JO,
    KZ,
    KE,
    KI,
    KP,
    KR,
    KW,
    KG,
    LA,
    LV,
    LB,
    LS,
    LR,
    LY,
    LI,
    LT,
    LU,
    MO,
    MK,
    MG,
    MW,
    MY,
    MV,
    ML,
    MT,
    MH,
    MQ,
    MR,
    MU,
    YT,
    MX,
    FM,
    MD,
    MC,
    MN,
    ME,
    MS,
    MA,
    MZ,
    MM,
    NA,
    NR,
    NP,
    NL,
    NC,
    NZ,
    NI,
    NE,
    NG,
    NU,
    NF,
    MP,
    NO,
    OM,
    PK,
    PW,
    PS,
    PA,
    PG,
    PY,
    PE,
    PH,
    PN,
    PL,
    PT,
    PR,
    QA,
    RE,
    RO,
    RU,
    RW,
    BL,
    SH,
    KN,
    LC,
    MF,
    PM,
    VC,
    WS,
    SM,
    ST,
    SA,
    SN,
    RS,
    SC,
    SL,
    SG,
    SX,
    SK,
    SI,
    SB,
    SO,
    ZA,
    GS,
    SS,
    ES,
    LK,
    SD,
    SR,
    SJ,
    SZ,
    SE,
    CH,
    SY,
    TW,
    TJ,
    TZ,
    TH,
    TL,
    TG,
    TK,
    TO,
    TT,
    TN,
    TR,
    TM,
    TC,
    TV,
    UG,
    UA,
    AE,
    GB,
    US,
    UM,
    UY,
    UZ,
    VU,
    VE,
    VN,
    VG,
    VI,
    WF,
    EH,
    YE,
    ZM,
    ZW
  )
}

type IPSetDescriptorType = "IPV4" | "IPV6"
object IPSetDescriptorType {
  inline val IPV4: "IPV4" = "IPV4"
  inline val IPV6: "IPV6" = "IPV6"

  inline def values: js.Array[IPSetDescriptorType] = js.Array(IPV4, IPV6)
}

type MatchFieldType = "URI" | "QUERY_STRING" | "HEADER" | "METHOD" | "BODY" | "SINGLE_QUERY_ARG" | "ALL_QUERY_ARGS"
object MatchFieldType {
  inline val URI: "URI" = "URI"
  inline val QUERY_STRING: "QUERY_STRING" = "QUERY_STRING"
  inline val HEADER: "HEADER" = "HEADER"
  inline val METHOD: "METHOD" = "METHOD"
  inline val BODY: "BODY" = "BODY"
  inline val SINGLE_QUERY_ARG: "SINGLE_QUERY_ARG" = "SINGLE_QUERY_ARG"
  inline val ALL_QUERY_ARGS: "ALL_QUERY_ARGS" = "ALL_QUERY_ARGS"

  inline def values: js.Array[MatchFieldType] = js.Array(URI, QUERY_STRING, HEADER, METHOD, BODY, SINGLE_QUERY_ARG, ALL_QUERY_ARGS)
}

type PositionalConstraint = "EXACTLY" | "STARTS_WITH" | "ENDS_WITH" | "CONTAINS" | "CONTAINS_WORD"
object PositionalConstraint {
  inline val EXACTLY: "EXACTLY" = "EXACTLY"
  inline val STARTS_WITH: "STARTS_WITH" = "STARTS_WITH"
  inline val ENDS_WITH: "ENDS_WITH" = "ENDS_WITH"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"
  inline val CONTAINS_WORD: "CONTAINS_WORD" = "CONTAINS_WORD"

  inline def values: js.Array[PositionalConstraint] = js.Array(EXACTLY, STARTS_WITH, ENDS_WITH, CONTAINS, CONTAINS_WORD)
}

type PredicateType = "IPMatch" | "ByteMatch" | "SqlInjectionMatch" | "GeoMatch" | "SizeConstraint" | "XssMatch" | "RegexMatch"
object PredicateType {
  inline val IPMatch: "IPMatch" = "IPMatch"
  inline val ByteMatch: "ByteMatch" = "ByteMatch"
  inline val SqlInjectionMatch: "SqlInjectionMatch" = "SqlInjectionMatch"
  inline val GeoMatch: "GeoMatch" = "GeoMatch"
  inline val SizeConstraint: "SizeConstraint" = "SizeConstraint"
  inline val XssMatch: "XssMatch" = "XssMatch"
  inline val RegexMatch: "RegexMatch" = "RegexMatch"

  inline def values: js.Array[PredicateType] = js.Array(IPMatch, ByteMatch, SqlInjectionMatch, GeoMatch, SizeConstraint, XssMatch, RegexMatch)
}

type RateKey = "IP"
object RateKey {
  inline val IP: "IP" = "IP"

  inline def values: js.Array[RateKey] = js.Array(IP)
}

type ResourceType = "APPLICATION_LOAD_BALANCER" | "API_GATEWAY"
object ResourceType {
  inline val APPLICATION_LOAD_BALANCER: "APPLICATION_LOAD_BALANCER" = "APPLICATION_LOAD_BALANCER"
  inline val API_GATEWAY: "API_GATEWAY" = "API_GATEWAY"

  inline def values: js.Array[ResourceType] = js.Array(APPLICATION_LOAD_BALANCER, API_GATEWAY)
}

type TextTransformation = "NONE" | "COMPRESS_WHITE_SPACE" | "HTML_ENTITY_DECODE" | "LOWERCASE" | "CMD_LINE" | "URL_DECODE"
object TextTransformation {
  inline val NONE: "NONE" = "NONE"
  inline val COMPRESS_WHITE_SPACE: "COMPRESS_WHITE_SPACE" = "COMPRESS_WHITE_SPACE"
  inline val HTML_ENTITY_DECODE: "HTML_ENTITY_DECODE" = "HTML_ENTITY_DECODE"
  inline val LOWERCASE: "LOWERCASE" = "LOWERCASE"
  inline val CMD_LINE: "CMD_LINE" = "CMD_LINE"
  inline val URL_DECODE: "URL_DECODE" = "URL_DECODE"

  inline def values: js.Array[TextTransformation] = js.Array(NONE, COMPRESS_WHITE_SPACE, HTML_ENTITY_DECODE, LOWERCASE, CMD_LINE, URL_DECODE)
}

type WafActionType = "BLOCK" | "ALLOW" | "COUNT"
object WafActionType {
  inline val BLOCK: "BLOCK" = "BLOCK"
  inline val ALLOW: "ALLOW" = "ALLOW"
  inline val COUNT: "COUNT" = "COUNT"

  inline def values: js.Array[WafActionType] = js.Array(BLOCK, ALLOW, COUNT)
}

type WafOverrideActionType = "NONE" | "COUNT"
object WafOverrideActionType {
  inline val NONE: "NONE" = "NONE"
  inline val COUNT: "COUNT" = "COUNT"

  inline def values: js.Array[WafOverrideActionType] = js.Array(NONE, COUNT)
}

type WafRuleType = "REGULAR" | "RATE_BASED" | "GROUP"
object WafRuleType {
  inline val REGULAR: "REGULAR" = "REGULAR"
  inline val RATE_BASED: "RATE_BASED" = "RATE_BASED"
  inline val GROUP: "GROUP" = "GROUP"

  inline def values: js.Array[WafRuleType] = js.Array(REGULAR, RATE_BASED, GROUP)
}
