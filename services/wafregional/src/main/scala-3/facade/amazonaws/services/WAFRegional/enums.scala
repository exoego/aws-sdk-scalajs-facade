package facade.amazonaws.services.wafregional

import scalajs._

type ChangeAction = "INSERT" | "DELETE"
object ChangeAction {
  val INSERT: "INSERT" = "INSERT"
  val DELETE: "DELETE" = "DELETE"

  @inline def values = js.Array[ChangeAction](INSERT, DELETE)
}

type ChangeTokenStatus = "PROVISIONED" | "PENDING" | "INSYNC"
object ChangeTokenStatus {
  val PROVISIONED: "PROVISIONED" = "PROVISIONED"
  val PENDING: "PENDING" = "PENDING"
  val INSYNC: "INSYNC" = "INSYNC"

  @inline def values = js.Array[ChangeTokenStatus](PROVISIONED, PENDING, INSYNC)
}

type ComparisonOperator = "EQ" | "NE" | "LE" | "LT" | "GE" | "GT"
object ComparisonOperator {
  val EQ: "EQ" = "EQ"
  val NE: "NE" = "NE"
  val LE: "LE" = "LE"
  val LT: "LT" = "LT"
  val GE: "GE" = "GE"
  val GT: "GT" = "GT"

  @inline def values = js.Array[ComparisonOperator](EQ, NE, LE, LT, GE, GT)
}

type GeoMatchConstraintType = "Country"
object GeoMatchConstraintType {
  val Country: "Country" = "Country"

  @inline def values = js.Array[GeoMatchConstraintType](Country)
}

type GeoMatchConstraintValue = "AF" | "AX" | "AL" | "DZ" | "AS" | "AD" | "AO" | "AI" | "AQ" | "AG" | "AR" | "AM" | "AW" | "AU" | "AT" | "AZ" | "BS" | "BH" | "BD" | "BB" | "BY" | "BE" | "BZ" | "BJ" | "BM" | "BT" | "BO" | "BQ" | "BA" | "BW" | "BV" | "BR" | "IO" | "BN" | "BG" | "BF" | "BI" | "KH" | "CM" | "CA" | "CV" | "KY" | "CF" | "TD" | "CL" | "CN" | "CX" | "CC" | "CO" | "KM" | "CG" | "CD" | "CK" | "CR" | "CI" | "HR" | "CU" | "CW" | "CY" | "CZ" | "DK" | "DJ" | "DM" | "DO" | "EC" | "EG" | "SV" | "GQ" | "ER" | "EE" | "ET" | "FK" | "FO" | "FJ" | "FI" | "FR" | "GF" | "PF" | "TF" | "GA" | "GM" | "GE" | "DE" | "GH" | "GI" | "GR" | "GL" | "GD" | "GP" | "GU" | "GT" | "GG" | "GN" | "GW" | "GY" | "HT" | "HM" | "VA" | "HN" | "HK" | "HU" | "IS" | "IN" | "ID" | "IR" | "IQ" | "IE" | "IM" | "IL" | "IT" | "JM" | "JP" | "JE" | "JO" | "KZ" | "KE" | "KI" | "KP" | "KR" | "KW" | "KG" | "LA" | "LV" | "LB" | "LS" | "LR" | "LY" | "LI" | "LT" | "LU" | "MO" | "MK" | "MG" | "MW" | "MY" | "MV" | "ML" | "MT" |
  "MH" | "MQ" | "MR" | "MU" | "YT" | "MX" | "FM" | "MD" | "MC" | "MN" | "ME" | "MS" | "MA" | "MZ" | "MM" | "NA" | "NR" | "NP" | "NL" | "NC" | "NZ" | "NI" | "NE" | "NG" | "NU" | "NF" | "MP" | "NO" | "OM" | "PK" | "PW" | "PS" | "PA" | "PG" | "PY" | "PE" | "PH" | "PN" | "PL" | "PT" | "PR" | "QA" | "RE" | "RO" | "RU" | "RW" | "BL" | "SH" | "KN" | "LC" | "MF" | "PM" | "VC" | "WS" | "SM" | "ST" | "SA" | "SN" | "RS" | "SC" | "SL" | "SG" | "SX" | "SK" | "SI" | "SB" | "SO" | "ZA" | "GS" | "SS" | "ES" | "LK" | "SD" | "SR" | "SJ" | "SZ" | "SE" | "CH" | "SY" | "TW" | "TJ" | "TZ" | "TH" | "TL" | "TG" | "TK" | "TO" | "TT" | "TN" | "TR" | "TM" | "TC" | "TV" | "UG" | "UA" | "AE" | "GB" | "US" | "UM" | "UY" | "UZ" | "VU" | "VE" | "VN" | "VG" | "VI" | "WF" | "EH" | "YE" | "ZM" | "ZW"
object GeoMatchConstraintValue {
  val AF: "AF" = "AF"
  val AX: "AX" = "AX"
  val AL: "AL" = "AL"
  val DZ: "DZ" = "DZ"
  val AS: "AS" = "AS"
  val AD: "AD" = "AD"
  val AO: "AO" = "AO"
  val AI: "AI" = "AI"
  val AQ: "AQ" = "AQ"
  val AG: "AG" = "AG"
  val AR: "AR" = "AR"
  val AM: "AM" = "AM"
  val AW: "AW" = "AW"
  val AU: "AU" = "AU"
  val AT: "AT" = "AT"
  val AZ: "AZ" = "AZ"
  val BS: "BS" = "BS"
  val BH: "BH" = "BH"
  val BD: "BD" = "BD"
  val BB: "BB" = "BB"
  val BY: "BY" = "BY"
  val BE: "BE" = "BE"
  val BZ: "BZ" = "BZ"
  val BJ: "BJ" = "BJ"
  val BM: "BM" = "BM"
  val BT: "BT" = "BT"
  val BO: "BO" = "BO"
  val BQ: "BQ" = "BQ"
  val BA: "BA" = "BA"
  val BW: "BW" = "BW"
  val BV: "BV" = "BV"
  val BR: "BR" = "BR"
  val IO: "IO" = "IO"
  val BN: "BN" = "BN"
  val BG: "BG" = "BG"
  val BF: "BF" = "BF"
  val BI: "BI" = "BI"
  val KH: "KH" = "KH"
  val CM: "CM" = "CM"
  val CA: "CA" = "CA"
  val CV: "CV" = "CV"
  val KY: "KY" = "KY"
  val CF: "CF" = "CF"
  val TD: "TD" = "TD"
  val CL: "CL" = "CL"
  val CN: "CN" = "CN"
  val CX: "CX" = "CX"
  val CC: "CC" = "CC"
  val CO: "CO" = "CO"
  val KM: "KM" = "KM"
  val CG: "CG" = "CG"
  val CD: "CD" = "CD"
  val CK: "CK" = "CK"
  val CR: "CR" = "CR"
  val CI: "CI" = "CI"
  val HR: "HR" = "HR"
  val CU: "CU" = "CU"
  val CW: "CW" = "CW"
  val CY: "CY" = "CY"
  val CZ: "CZ" = "CZ"
  val DK: "DK" = "DK"
  val DJ: "DJ" = "DJ"
  val DM: "DM" = "DM"
  val DO: "DO" = "DO"
  val EC: "EC" = "EC"
  val EG: "EG" = "EG"
  val SV: "SV" = "SV"
  val GQ: "GQ" = "GQ"
  val ER: "ER" = "ER"
  val EE: "EE" = "EE"
  val ET: "ET" = "ET"
  val FK: "FK" = "FK"
  val FO: "FO" = "FO"
  val FJ: "FJ" = "FJ"
  val FI: "FI" = "FI"
  val FR: "FR" = "FR"
  val GF: "GF" = "GF"
  val PF: "PF" = "PF"
  val TF: "TF" = "TF"
  val GA: "GA" = "GA"
  val GM: "GM" = "GM"
  val GE: "GE" = "GE"
  val DE: "DE" = "DE"
  val GH: "GH" = "GH"
  val GI: "GI" = "GI"
  val GR: "GR" = "GR"
  val GL: "GL" = "GL"
  val GD: "GD" = "GD"
  val GP: "GP" = "GP"
  val GU: "GU" = "GU"
  val GT: "GT" = "GT"
  val GG: "GG" = "GG"
  val GN: "GN" = "GN"
  val GW: "GW" = "GW"
  val GY: "GY" = "GY"
  val HT: "HT" = "HT"
  val HM: "HM" = "HM"
  val VA: "VA" = "VA"
  val HN: "HN" = "HN"
  val HK: "HK" = "HK"
  val HU: "HU" = "HU"
  val IS: "IS" = "IS"
  val IN: "IN" = "IN"
  val ID: "ID" = "ID"
  val IR: "IR" = "IR"
  val IQ: "IQ" = "IQ"
  val IE: "IE" = "IE"
  val IM: "IM" = "IM"
  val IL: "IL" = "IL"
  val IT: "IT" = "IT"
  val JM: "JM" = "JM"
  val JP: "JP" = "JP"
  val JE: "JE" = "JE"
  val JO: "JO" = "JO"
  val KZ: "KZ" = "KZ"
  val KE: "KE" = "KE"
  val KI: "KI" = "KI"
  val KP: "KP" = "KP"
  val KR: "KR" = "KR"
  val KW: "KW" = "KW"
  val KG: "KG" = "KG"
  val LA: "LA" = "LA"
  val LV: "LV" = "LV"
  val LB: "LB" = "LB"
  val LS: "LS" = "LS"
  val LR: "LR" = "LR"
  val LY: "LY" = "LY"
  val LI: "LI" = "LI"
  val LT: "LT" = "LT"
  val LU: "LU" = "LU"
  val MO: "MO" = "MO"
  val MK: "MK" = "MK"
  val MG: "MG" = "MG"
  val MW: "MW" = "MW"
  val MY: "MY" = "MY"
  val MV: "MV" = "MV"
  val ML: "ML" = "ML"
  val MT: "MT" = "MT"
  val MH: "MH" = "MH"
  val MQ: "MQ" = "MQ"
  val MR: "MR" = "MR"
  val MU: "MU" = "MU"
  val YT: "YT" = "YT"
  val MX: "MX" = "MX"
  val FM: "FM" = "FM"
  val MD: "MD" = "MD"
  val MC: "MC" = "MC"
  val MN: "MN" = "MN"
  val ME: "ME" = "ME"
  val MS: "MS" = "MS"
  val MA: "MA" = "MA"
  val MZ: "MZ" = "MZ"
  val MM: "MM" = "MM"
  val NA: "NA" = "NA"
  val NR: "NR" = "NR"
  val NP: "NP" = "NP"
  val NL: "NL" = "NL"
  val NC: "NC" = "NC"
  val NZ: "NZ" = "NZ"
  val NI: "NI" = "NI"
  val NE: "NE" = "NE"
  val NG: "NG" = "NG"
  val NU: "NU" = "NU"
  val NF: "NF" = "NF"
  val MP: "MP" = "MP"
  val NO: "NO" = "NO"
  val OM: "OM" = "OM"
  val PK: "PK" = "PK"
  val PW: "PW" = "PW"
  val PS: "PS" = "PS"
  val PA: "PA" = "PA"
  val PG: "PG" = "PG"
  val PY: "PY" = "PY"
  val PE: "PE" = "PE"
  val PH: "PH" = "PH"
  val PN: "PN" = "PN"
  val PL: "PL" = "PL"
  val PT: "PT" = "PT"
  val PR: "PR" = "PR"
  val QA: "QA" = "QA"
  val RE: "RE" = "RE"
  val RO: "RO" = "RO"
  val RU: "RU" = "RU"
  val RW: "RW" = "RW"
  val BL: "BL" = "BL"
  val SH: "SH" = "SH"
  val KN: "KN" = "KN"
  val LC: "LC" = "LC"
  val MF: "MF" = "MF"
  val PM: "PM" = "PM"
  val VC: "VC" = "VC"
  val WS: "WS" = "WS"
  val SM: "SM" = "SM"
  val ST: "ST" = "ST"
  val SA: "SA" = "SA"
  val SN: "SN" = "SN"
  val RS: "RS" = "RS"
  val SC: "SC" = "SC"
  val SL: "SL" = "SL"
  val SG: "SG" = "SG"
  val SX: "SX" = "SX"
  val SK: "SK" = "SK"
  val SI: "SI" = "SI"
  val SB: "SB" = "SB"
  val SO: "SO" = "SO"
  val ZA: "ZA" = "ZA"
  val GS: "GS" = "GS"
  val SS: "SS" = "SS"
  val ES: "ES" = "ES"
  val LK: "LK" = "LK"
  val SD: "SD" = "SD"
  val SR: "SR" = "SR"
  val SJ: "SJ" = "SJ"
  val SZ: "SZ" = "SZ"
  val SE: "SE" = "SE"
  val CH: "CH" = "CH"
  val SY: "SY" = "SY"
  val TW: "TW" = "TW"
  val TJ: "TJ" = "TJ"
  val TZ: "TZ" = "TZ"
  val TH: "TH" = "TH"
  val TL: "TL" = "TL"
  val TG: "TG" = "TG"
  val TK: "TK" = "TK"
  val TO: "TO" = "TO"
  val TT: "TT" = "TT"
  val TN: "TN" = "TN"
  val TR: "TR" = "TR"
  val TM: "TM" = "TM"
  val TC: "TC" = "TC"
  val TV: "TV" = "TV"
  val UG: "UG" = "UG"
  val UA: "UA" = "UA"
  val AE: "AE" = "AE"
  val GB: "GB" = "GB"
  val US: "US" = "US"
  val UM: "UM" = "UM"
  val UY: "UY" = "UY"
  val UZ: "UZ" = "UZ"
  val VU: "VU" = "VU"
  val VE: "VE" = "VE"
  val VN: "VN" = "VN"
  val VG: "VG" = "VG"
  val VI: "VI" = "VI"
  val WF: "WF" = "WF"
  val EH: "EH" = "EH"
  val YE: "YE" = "YE"
  val ZM: "ZM" = "ZM"
  val ZW: "ZW" = "ZW"

  @inline def values = js.Array[GeoMatchConstraintValue](
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
  val IPV4: "IPV4" = "IPV4"
  val IPV6: "IPV6" = "IPV6"

  @inline def values = js.Array[IPSetDescriptorType](IPV4, IPV6)
}

type MatchFieldType = "URI" | "QUERY_STRING" | "HEADER" | "METHOD" | "BODY" | "SINGLE_QUERY_ARG" | "ALL_QUERY_ARGS"
object MatchFieldType {
  val URI: "URI" = "URI"
  val QUERY_STRING: "QUERY_STRING" = "QUERY_STRING"
  val HEADER: "HEADER" = "HEADER"
  val METHOD: "METHOD" = "METHOD"
  val BODY: "BODY" = "BODY"
  val SINGLE_QUERY_ARG: "SINGLE_QUERY_ARG" = "SINGLE_QUERY_ARG"
  val ALL_QUERY_ARGS: "ALL_QUERY_ARGS" = "ALL_QUERY_ARGS"

  @inline def values = js.Array[MatchFieldType](URI, QUERY_STRING, HEADER, METHOD, BODY, SINGLE_QUERY_ARG, ALL_QUERY_ARGS)
}

type PositionalConstraint = "EXACTLY" | "STARTS_WITH" | "ENDS_WITH" | "CONTAINS" | "CONTAINS_WORD"
object PositionalConstraint {
  val EXACTLY: "EXACTLY" = "EXACTLY"
  val STARTS_WITH: "STARTS_WITH" = "STARTS_WITH"
  val ENDS_WITH: "ENDS_WITH" = "ENDS_WITH"
  val CONTAINS: "CONTAINS" = "CONTAINS"
  val CONTAINS_WORD: "CONTAINS_WORD" = "CONTAINS_WORD"

  @inline def values = js.Array[PositionalConstraint](EXACTLY, STARTS_WITH, ENDS_WITH, CONTAINS, CONTAINS_WORD)
}

type PredicateType = "IPMatch" | "ByteMatch" | "SqlInjectionMatch" | "GeoMatch" | "SizeConstraint" | "XssMatch" | "RegexMatch"
object PredicateType {
  val IPMatch: "IPMatch" = "IPMatch"
  val ByteMatch: "ByteMatch" = "ByteMatch"
  val SqlInjectionMatch: "SqlInjectionMatch" = "SqlInjectionMatch"
  val GeoMatch: "GeoMatch" = "GeoMatch"
  val SizeConstraint: "SizeConstraint" = "SizeConstraint"
  val XssMatch: "XssMatch" = "XssMatch"
  val RegexMatch: "RegexMatch" = "RegexMatch"

  @inline def values = js.Array[PredicateType](IPMatch, ByteMatch, SqlInjectionMatch, GeoMatch, SizeConstraint, XssMatch, RegexMatch)
}

type RateKey = "IP"
object RateKey {
  val IP: "IP" = "IP"

  @inline def values = js.Array[RateKey](IP)
}

type ResourceType = "APPLICATION_LOAD_BALANCER" | "API_GATEWAY"
object ResourceType {
  val APPLICATION_LOAD_BALANCER: "APPLICATION_LOAD_BALANCER" = "APPLICATION_LOAD_BALANCER"
  val API_GATEWAY: "API_GATEWAY" = "API_GATEWAY"

  @inline def values = js.Array[ResourceType](APPLICATION_LOAD_BALANCER, API_GATEWAY)
}

type TextTransformation = "NONE" | "COMPRESS_WHITE_SPACE" | "HTML_ENTITY_DECODE" | "LOWERCASE" | "CMD_LINE" | "URL_DECODE"
object TextTransformation {
  val NONE: "NONE" = "NONE"
  val COMPRESS_WHITE_SPACE: "COMPRESS_WHITE_SPACE" = "COMPRESS_WHITE_SPACE"
  val HTML_ENTITY_DECODE: "HTML_ENTITY_DECODE" = "HTML_ENTITY_DECODE"
  val LOWERCASE: "LOWERCASE" = "LOWERCASE"
  val CMD_LINE: "CMD_LINE" = "CMD_LINE"
  val URL_DECODE: "URL_DECODE" = "URL_DECODE"

  @inline def values = js.Array[TextTransformation](NONE, COMPRESS_WHITE_SPACE, HTML_ENTITY_DECODE, LOWERCASE, CMD_LINE, URL_DECODE)
}

type WafActionType = "BLOCK" | "ALLOW" | "COUNT"
object WafActionType {
  val BLOCK: "BLOCK" = "BLOCK"
  val ALLOW: "ALLOW" = "ALLOW"
  val COUNT: "COUNT" = "COUNT"

  @inline def values = js.Array[WafActionType](BLOCK, ALLOW, COUNT)
}

type WafOverrideActionType = "NONE" | "COUNT"
object WafOverrideActionType {
  val NONE: "NONE" = "NONE"
  val COUNT: "COUNT" = "COUNT"

  @inline def values = js.Array[WafOverrideActionType](NONE, COUNT)
}

type WafRuleType = "REGULAR" | "RATE_BASED" | "GROUP"
object WafRuleType {
  val REGULAR: "REGULAR" = "REGULAR"
  val RATE_BASED: "RATE_BASED" = "RATE_BASED"
  val GROUP: "GROUP" = "GROUP"

  @inline def values = js.Array[WafRuleType](REGULAR, RATE_BASED, GROUP)
}
