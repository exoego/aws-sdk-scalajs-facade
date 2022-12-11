package facade.amazonaws.services.wafv2

import scalajs.js

type ActionValue = "ALLOW" | "BLOCK" | "COUNT" | "CAPTCHA" | "CHALLENGE" | "EXCLUDED_AS_COUNT"
object ActionValue {
  inline val ALLOW: "ALLOW" = "ALLOW"
  inline val BLOCK: "BLOCK" = "BLOCK"
  inline val COUNT: "COUNT" = "COUNT"
  inline val CAPTCHA: "CAPTCHA" = "CAPTCHA"
  inline val CHALLENGE: "CHALLENGE" = "CHALLENGE"
  inline val EXCLUDED_AS_COUNT: "EXCLUDED_AS_COUNT" = "EXCLUDED_AS_COUNT"

  inline def values: js.Array[ActionValue] = js.Array(ALLOW, BLOCK, COUNT, CAPTCHA, CHALLENGE, EXCLUDED_AS_COUNT)
}

type BodyParsingFallbackBehavior = "MATCH" | "NO_MATCH" | "EVALUATE_AS_STRING"
object BodyParsingFallbackBehavior {
  inline val MATCH: "MATCH" = "MATCH"
  inline val NO_MATCH: "NO_MATCH" = "NO_MATCH"
  inline val EVALUATE_AS_STRING: "EVALUATE_AS_STRING" = "EVALUATE_AS_STRING"

  inline def values: js.Array[BodyParsingFallbackBehavior] = js.Array(MATCH, NO_MATCH, EVALUATE_AS_STRING)
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

type CountryCode =
  "AF" | "AX" | "AL" | "DZ" | "AS" | "AD" | "AO" | "AI" | "AQ" | "AG" | "AR" | "AM" | "AW" | "AU" | "AT" | "AZ" | "BS" | "BH" | "BD" | "BB" | "BY" | "BE" | "BZ" | "BJ" | "BM" | "BT" | "BO" | "BQ" | "BA" | "BW" | "BV" | "BR" | "IO" | "BN" | "BG" | "BF" | "BI" | "KH" | "CM" | "CA" | "CV" | "KY" | "CF" | "TD" | "CL" | "CN" | "CX" | "CC" | "CO" | "KM" | "CG" | "CD" | "CK" | "CR" | "CI" | "HR" | "CU" | "CW" | "CY" | "CZ" | "DK" | "DJ" | "DM" | "DO" | "EC" | "EG" | "SV" | "GQ" | "ER" | "EE" | "ET" | "FK" | "FO" | "FJ" | "FI" | "FR" | "GF" | "PF" | "TF" | "GA" | "GM" | "GE" | "DE" | "GH" | "GI" | "GR" | "GL" | "GD" | "GP" | "GU" | "GT" | "GG" | "GN" | "GW" | "GY" | "HT" | "HM" | "VA" | "HN" | "HK" | "HU" | "IS" | "IN" | "ID" | "IR" | "IQ" | "IE" | "IM" | "IL" | "IT" | "JM" | "JP" | "JE" | "JO" | "KZ" | "KE" | "KI" | "KP" | "KR" | "KW" | "KG" | "LA" | "LV" | "LB" | "LS" | "LR" | "LY" | "LI" | "LT" | "LU" | "MO" | "MK" | "MG" | "MW" | "MY" | "MV" | "ML" | "MT" | "MH" | "MQ" | "MR" | "MU" | "YT" | "MX" | "FM" | "MD" | "MC" | "MN" | "ME" | "MS" | "MA" | "MZ" | "MM" | "NA" | "NR" | "NP" | "NL" | "NC" | "NZ" | "NI" | "NE" | "NG" | "NU" | "NF" | "MP" | "NO" | "OM" | "PK" | "PW" | "PS" | "PA" | "PG" | "PY" | "PE" | "PH" | "PN" | "PL" | "PT" | "PR" | "QA" | "RE" | "RO" | "RU" | "RW" | "BL" | "SH" | "KN" | "LC" | "MF" | "PM" | "VC" | "WS" | "SM" | "ST" | "SA" | "SN" | "RS" | "SC" | "SL" | "SG" | "SX" | "SK" | "SI" | "SB" | "SO" | "ZA" | "GS" | "SS" | "ES" | "LK" | "SD" | "SR" | "SJ" | "SZ" | "SE" | "CH" | "SY" | "TW" | "TJ" | "TZ" | "TH" | "TL" | "TG" | "TK" | "TO" | "TT" | "TN" | "TR" | "TM" | "TC" | "TV" | "UG" | "UA" | "AE" | "GB" | "US" | "UM" | "UY" | "UZ" | "VU" | "VE" | "VN" | "VG" | "VI" | "WF" | "EH" | "YE" | "ZM" | "ZW" | "XK"
object CountryCode {
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
  inline val XK: "XK" = "XK"

  inline def values: js.Array[CountryCode] = js.Array(
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
    ZW,
    XK
  )
}

type FailureReason = "TOKEN_MISSING" | "TOKEN_EXPIRED" | "TOKEN_INVALID" | "TOKEN_DOMAIN_MISMATCH"
object FailureReason {
  inline val TOKEN_MISSING: "TOKEN_MISSING" = "TOKEN_MISSING"
  inline val TOKEN_EXPIRED: "TOKEN_EXPIRED" = "TOKEN_EXPIRED"
  inline val TOKEN_INVALID: "TOKEN_INVALID" = "TOKEN_INVALID"
  inline val TOKEN_DOMAIN_MISMATCH: "TOKEN_DOMAIN_MISMATCH" = "TOKEN_DOMAIN_MISMATCH"

  inline def values: js.Array[FailureReason] = js.Array(TOKEN_MISSING, TOKEN_EXPIRED, TOKEN_INVALID, TOKEN_DOMAIN_MISMATCH)
}

type FallbackBehavior = "MATCH" | "NO_MATCH"
object FallbackBehavior {
  inline val MATCH: "MATCH" = "MATCH"
  inline val NO_MATCH: "NO_MATCH" = "NO_MATCH"

  inline def values: js.Array[FallbackBehavior] = js.Array(MATCH, NO_MATCH)
}

type FilterBehavior = "KEEP" | "DROP"
object FilterBehavior {
  inline val KEEP: "KEEP" = "KEEP"
  inline val DROP: "DROP" = "DROP"

  inline def values: js.Array[FilterBehavior] = js.Array(KEEP, DROP)
}

type FilterRequirement = "MEETS_ALL" | "MEETS_ANY"
object FilterRequirement {
  inline val MEETS_ALL: "MEETS_ALL" = "MEETS_ALL"
  inline val MEETS_ANY: "MEETS_ANY" = "MEETS_ANY"

  inline def values: js.Array[FilterRequirement] = js.Array(MEETS_ALL, MEETS_ANY)
}

type ForwardedIPPosition = "FIRST" | "LAST" | "ANY"
object ForwardedIPPosition {
  inline val FIRST: "FIRST" = "FIRST"
  inline val LAST: "LAST" = "LAST"
  inline val ANY: "ANY" = "ANY"

  inline def values: js.Array[ForwardedIPPosition] = js.Array(FIRST, LAST, ANY)
}

type IPAddressVersion = "IPV4" | "IPV6"
object IPAddressVersion {
  inline val IPV4: "IPV4" = "IPV4"
  inline val IPV6: "IPV6" = "IPV6"

  inline def values: js.Array[IPAddressVersion] = js.Array(IPV4, IPV6)
}

type InspectionLevel = "COMMON" | "TARGETED"
object InspectionLevel {
  inline val COMMON: "COMMON" = "COMMON"
  inline val TARGETED: "TARGETED" = "TARGETED"

  inline def values: js.Array[InspectionLevel] = js.Array(COMMON, TARGETED)
}

type JsonMatchScope = "ALL" | "KEY" | "VALUE"
object JsonMatchScope {
  inline val ALL: "ALL" = "ALL"
  inline val KEY: "KEY" = "KEY"
  inline val VALUE: "VALUE" = "VALUE"

  inline def values: js.Array[JsonMatchScope] = js.Array(ALL, KEY, VALUE)
}

type LabelMatchScope = "LABEL" | "NAMESPACE"
object LabelMatchScope {
  inline val LABEL: "LABEL" = "LABEL"
  inline val NAMESPACE: "NAMESPACE" = "NAMESPACE"

  inline def values: js.Array[LabelMatchScope] = js.Array(LABEL, NAMESPACE)
}

type MapMatchScope = "ALL" | "KEY" | "VALUE"
object MapMatchScope {
  inline val ALL: "ALL" = "ALL"
  inline val KEY: "KEY" = "KEY"
  inline val VALUE: "VALUE" = "VALUE"

  inline def values: js.Array[MapMatchScope] = js.Array(ALL, KEY, VALUE)
}

type OversizeHandling = "CONTINUE" | "MATCH" | "NO_MATCH"
object OversizeHandling {
  inline val CONTINUE: "CONTINUE" = "CONTINUE"
  inline val MATCH: "MATCH" = "MATCH"
  inline val NO_MATCH: "NO_MATCH" = "NO_MATCH"

  inline def values: js.Array[OversizeHandling] = js.Array(CONTINUE, MATCH, NO_MATCH)
}

type PayloadType = "JSON" | "FORM_ENCODED"
object PayloadType {
  inline val JSON: "JSON" = "JSON"
  inline val FORM_ENCODED: "FORM_ENCODED" = "FORM_ENCODED"

  inline def values: js.Array[PayloadType] = js.Array(JSON, FORM_ENCODED)
}

type Platform = "IOS" | "ANDROID"
object Platform {
  inline val IOS: "IOS" = "IOS"
  inline val ANDROID: "ANDROID" = "ANDROID"

  inline def values: js.Array[Platform] = js.Array(IOS, ANDROID)
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

type RateBasedStatementAggregateKeyType = "IP" | "FORWARDED_IP"
object RateBasedStatementAggregateKeyType {
  inline val IP: "IP" = "IP"
  inline val FORWARDED_IP: "FORWARDED_IP" = "FORWARDED_IP"

  inline def values: js.Array[RateBasedStatementAggregateKeyType] = js.Array(IP, FORWARDED_IP)
}

type ResourceType = "APPLICATION_LOAD_BALANCER" | "API_GATEWAY" | "APPSYNC" | "COGNITO_USER_POOL"
object ResourceType {
  inline val APPLICATION_LOAD_BALANCER: "APPLICATION_LOAD_BALANCER" = "APPLICATION_LOAD_BALANCER"
  inline val API_GATEWAY: "API_GATEWAY" = "API_GATEWAY"
  inline val APPSYNC: "APPSYNC" = "APPSYNC"
  inline val COGNITO_USER_POOL: "COGNITO_USER_POOL" = "COGNITO_USER_POOL"

  inline def values: js.Array[ResourceType] = js.Array(APPLICATION_LOAD_BALANCER, API_GATEWAY, APPSYNC, COGNITO_USER_POOL)
}

type ResponseContentType = "TEXT_PLAIN" | "TEXT_HTML" | "APPLICATION_JSON"
object ResponseContentType {
  inline val TEXT_PLAIN: "TEXT_PLAIN" = "TEXT_PLAIN"
  inline val TEXT_HTML: "TEXT_HTML" = "TEXT_HTML"
  inline val APPLICATION_JSON: "APPLICATION_JSON" = "APPLICATION_JSON"

  inline def values: js.Array[ResponseContentType] = js.Array(TEXT_PLAIN, TEXT_HTML, APPLICATION_JSON)
}

type Scope = "CLOUDFRONT" | "REGIONAL"
object Scope {
  inline val CLOUDFRONT: "CLOUDFRONT" = "CLOUDFRONT"
  inline val REGIONAL: "REGIONAL" = "REGIONAL"

  inline def values: js.Array[Scope] = js.Array(CLOUDFRONT, REGIONAL)
}

type SensitivityLevel = "LOW" | "HIGH"
object SensitivityLevel {
  inline val LOW: "LOW" = "LOW"
  inline val HIGH: "HIGH" = "HIGH"

  inline def values: js.Array[SensitivityLevel] = js.Array(LOW, HIGH)
}

type TextTransformationType = "NONE" | "COMPRESS_WHITE_SPACE" | "HTML_ENTITY_DECODE" | "LOWERCASE" | "CMD_LINE" | "URL_DECODE" | "BASE64_DECODE" | "HEX_DECODE" | "MD5" | "REPLACE_COMMENTS" | "ESCAPE_SEQ_DECODE" | "SQL_HEX_DECODE" | "CSS_DECODE" | "JS_DECODE" | "NORMALIZE_PATH" | "NORMALIZE_PATH_WIN" | "REMOVE_NULLS" | "REPLACE_NULLS" | "BASE64_DECODE_EXT" | "URL_DECODE_UNI" | "UTF8_TO_UNICODE"
object TextTransformationType {
  inline val NONE: "NONE" = "NONE"
  inline val COMPRESS_WHITE_SPACE: "COMPRESS_WHITE_SPACE" = "COMPRESS_WHITE_SPACE"
  inline val HTML_ENTITY_DECODE: "HTML_ENTITY_DECODE" = "HTML_ENTITY_DECODE"
  inline val LOWERCASE: "LOWERCASE" = "LOWERCASE"
  inline val CMD_LINE: "CMD_LINE" = "CMD_LINE"
  inline val URL_DECODE: "URL_DECODE" = "URL_DECODE"
  inline val BASE64_DECODE: "BASE64_DECODE" = "BASE64_DECODE"
  inline val HEX_DECODE: "HEX_DECODE" = "HEX_DECODE"
  inline val MD5: "MD5" = "MD5"
  inline val REPLACE_COMMENTS: "REPLACE_COMMENTS" = "REPLACE_COMMENTS"
  inline val ESCAPE_SEQ_DECODE: "ESCAPE_SEQ_DECODE" = "ESCAPE_SEQ_DECODE"
  inline val SQL_HEX_DECODE: "SQL_HEX_DECODE" = "SQL_HEX_DECODE"
  inline val CSS_DECODE: "CSS_DECODE" = "CSS_DECODE"
  inline val JS_DECODE: "JS_DECODE" = "JS_DECODE"
  inline val NORMALIZE_PATH: "NORMALIZE_PATH" = "NORMALIZE_PATH"
  inline val NORMALIZE_PATH_WIN: "NORMALIZE_PATH_WIN" = "NORMALIZE_PATH_WIN"
  inline val REMOVE_NULLS: "REMOVE_NULLS" = "REMOVE_NULLS"
  inline val REPLACE_NULLS: "REPLACE_NULLS" = "REPLACE_NULLS"
  inline val BASE64_DECODE_EXT: "BASE64_DECODE_EXT" = "BASE64_DECODE_EXT"
  inline val URL_DECODE_UNI: "URL_DECODE_UNI" = "URL_DECODE_UNI"
  inline val UTF8_TO_UNICODE: "UTF8_TO_UNICODE" = "UTF8_TO_UNICODE"

  inline def values: js.Array[TextTransformationType] = js.Array(
    NONE,
    COMPRESS_WHITE_SPACE,
    HTML_ENTITY_DECODE,
    LOWERCASE,
    CMD_LINE,
    URL_DECODE,
    BASE64_DECODE,
    HEX_DECODE,
    MD5,
    REPLACE_COMMENTS,
    ESCAPE_SEQ_DECODE,
    SQL_HEX_DECODE,
    CSS_DECODE,
    JS_DECODE,
    NORMALIZE_PATH,
    NORMALIZE_PATH_WIN,
    REMOVE_NULLS,
    REPLACE_NULLS,
    BASE64_DECODE_EXT,
    URL_DECODE_UNI,
    UTF8_TO_UNICODE
  )
}
