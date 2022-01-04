package facade.amazonaws.services.waf

import scalajs.js

@js.native
sealed trait ChangeAction extends js.Any
object ChangeAction {
  val INSERT = "INSERT".asInstanceOf[ChangeAction]
  val DELETE = "DELETE".asInstanceOf[ChangeAction]

  @inline def values: js.Array[ChangeAction] = js.Array(INSERT, DELETE)
}

@js.native
sealed trait ChangeTokenStatus extends js.Any
object ChangeTokenStatus {
  val PROVISIONED = "PROVISIONED".asInstanceOf[ChangeTokenStatus]
  val PENDING = "PENDING".asInstanceOf[ChangeTokenStatus]
  val INSYNC = "INSYNC".asInstanceOf[ChangeTokenStatus]

  @inline def values: js.Array[ChangeTokenStatus] = js.Array(PROVISIONED, PENDING, INSYNC)
}

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val EQ = "EQ".asInstanceOf[ComparisonOperator]
  val NE = "NE".asInstanceOf[ComparisonOperator]
  val LE = "LE".asInstanceOf[ComparisonOperator]
  val LT = "LT".asInstanceOf[ComparisonOperator]
  val GE = "GE".asInstanceOf[ComparisonOperator]
  val GT = "GT".asInstanceOf[ComparisonOperator]

  @inline def values: js.Array[ComparisonOperator] = js.Array(EQ, NE, LE, LT, GE, GT)
}

@js.native
sealed trait GeoMatchConstraintType extends js.Any
object GeoMatchConstraintType {
  val Country = "Country".asInstanceOf[GeoMatchConstraintType]

  @inline def values: js.Array[GeoMatchConstraintType] = js.Array(Country)
}

@js.native
sealed trait GeoMatchConstraintValue extends js.Any
object GeoMatchConstraintValue {
  val AF = "AF".asInstanceOf[GeoMatchConstraintValue]
  val AX = "AX".asInstanceOf[GeoMatchConstraintValue]
  val AL = "AL".asInstanceOf[GeoMatchConstraintValue]
  val DZ = "DZ".asInstanceOf[GeoMatchConstraintValue]
  val AS = "AS".asInstanceOf[GeoMatchConstraintValue]
  val AD = "AD".asInstanceOf[GeoMatchConstraintValue]
  val AO = "AO".asInstanceOf[GeoMatchConstraintValue]
  val AI = "AI".asInstanceOf[GeoMatchConstraintValue]
  val AQ = "AQ".asInstanceOf[GeoMatchConstraintValue]
  val AG = "AG".asInstanceOf[GeoMatchConstraintValue]
  val AR = "AR".asInstanceOf[GeoMatchConstraintValue]
  val AM = "AM".asInstanceOf[GeoMatchConstraintValue]
  val AW = "AW".asInstanceOf[GeoMatchConstraintValue]
  val AU = "AU".asInstanceOf[GeoMatchConstraintValue]
  val AT = "AT".asInstanceOf[GeoMatchConstraintValue]
  val AZ = "AZ".asInstanceOf[GeoMatchConstraintValue]
  val BS = "BS".asInstanceOf[GeoMatchConstraintValue]
  val BH = "BH".asInstanceOf[GeoMatchConstraintValue]
  val BD = "BD".asInstanceOf[GeoMatchConstraintValue]
  val BB = "BB".asInstanceOf[GeoMatchConstraintValue]
  val BY = "BY".asInstanceOf[GeoMatchConstraintValue]
  val BE = "BE".asInstanceOf[GeoMatchConstraintValue]
  val BZ = "BZ".asInstanceOf[GeoMatchConstraintValue]
  val BJ = "BJ".asInstanceOf[GeoMatchConstraintValue]
  val BM = "BM".asInstanceOf[GeoMatchConstraintValue]
  val BT = "BT".asInstanceOf[GeoMatchConstraintValue]
  val BO = "BO".asInstanceOf[GeoMatchConstraintValue]
  val BQ = "BQ".asInstanceOf[GeoMatchConstraintValue]
  val BA = "BA".asInstanceOf[GeoMatchConstraintValue]
  val BW = "BW".asInstanceOf[GeoMatchConstraintValue]
  val BV = "BV".asInstanceOf[GeoMatchConstraintValue]
  val BR = "BR".asInstanceOf[GeoMatchConstraintValue]
  val IO = "IO".asInstanceOf[GeoMatchConstraintValue]
  val BN = "BN".asInstanceOf[GeoMatchConstraintValue]
  val BG = "BG".asInstanceOf[GeoMatchConstraintValue]
  val BF = "BF".asInstanceOf[GeoMatchConstraintValue]
  val BI = "BI".asInstanceOf[GeoMatchConstraintValue]
  val KH = "KH".asInstanceOf[GeoMatchConstraintValue]
  val CM = "CM".asInstanceOf[GeoMatchConstraintValue]
  val CA = "CA".asInstanceOf[GeoMatchConstraintValue]
  val CV = "CV".asInstanceOf[GeoMatchConstraintValue]
  val KY = "KY".asInstanceOf[GeoMatchConstraintValue]
  val CF = "CF".asInstanceOf[GeoMatchConstraintValue]
  val TD = "TD".asInstanceOf[GeoMatchConstraintValue]
  val CL = "CL".asInstanceOf[GeoMatchConstraintValue]
  val CN = "CN".asInstanceOf[GeoMatchConstraintValue]
  val CX = "CX".asInstanceOf[GeoMatchConstraintValue]
  val CC = "CC".asInstanceOf[GeoMatchConstraintValue]
  val CO = "CO".asInstanceOf[GeoMatchConstraintValue]
  val KM = "KM".asInstanceOf[GeoMatchConstraintValue]
  val CG = "CG".asInstanceOf[GeoMatchConstraintValue]
  val CD = "CD".asInstanceOf[GeoMatchConstraintValue]
  val CK = "CK".asInstanceOf[GeoMatchConstraintValue]
  val CR = "CR".asInstanceOf[GeoMatchConstraintValue]
  val CI = "CI".asInstanceOf[GeoMatchConstraintValue]
  val HR = "HR".asInstanceOf[GeoMatchConstraintValue]
  val CU = "CU".asInstanceOf[GeoMatchConstraintValue]
  val CW = "CW".asInstanceOf[GeoMatchConstraintValue]
  val CY = "CY".asInstanceOf[GeoMatchConstraintValue]
  val CZ = "CZ".asInstanceOf[GeoMatchConstraintValue]
  val DK = "DK".asInstanceOf[GeoMatchConstraintValue]
  val DJ = "DJ".asInstanceOf[GeoMatchConstraintValue]
  val DM = "DM".asInstanceOf[GeoMatchConstraintValue]
  val DO = "DO".asInstanceOf[GeoMatchConstraintValue]
  val EC = "EC".asInstanceOf[GeoMatchConstraintValue]
  val EG = "EG".asInstanceOf[GeoMatchConstraintValue]
  val SV = "SV".asInstanceOf[GeoMatchConstraintValue]
  val GQ = "GQ".asInstanceOf[GeoMatchConstraintValue]
  val ER = "ER".asInstanceOf[GeoMatchConstraintValue]
  val EE = "EE".asInstanceOf[GeoMatchConstraintValue]
  val ET = "ET".asInstanceOf[GeoMatchConstraintValue]
  val FK = "FK".asInstanceOf[GeoMatchConstraintValue]
  val FO = "FO".asInstanceOf[GeoMatchConstraintValue]
  val FJ = "FJ".asInstanceOf[GeoMatchConstraintValue]
  val FI = "FI".asInstanceOf[GeoMatchConstraintValue]
  val FR = "FR".asInstanceOf[GeoMatchConstraintValue]
  val GF = "GF".asInstanceOf[GeoMatchConstraintValue]
  val PF = "PF".asInstanceOf[GeoMatchConstraintValue]
  val TF = "TF".asInstanceOf[GeoMatchConstraintValue]
  val GA = "GA".asInstanceOf[GeoMatchConstraintValue]
  val GM = "GM".asInstanceOf[GeoMatchConstraintValue]
  val GE = "GE".asInstanceOf[GeoMatchConstraintValue]
  val DE = "DE".asInstanceOf[GeoMatchConstraintValue]
  val GH = "GH".asInstanceOf[GeoMatchConstraintValue]
  val GI = "GI".asInstanceOf[GeoMatchConstraintValue]
  val GR = "GR".asInstanceOf[GeoMatchConstraintValue]
  val GL = "GL".asInstanceOf[GeoMatchConstraintValue]
  val GD = "GD".asInstanceOf[GeoMatchConstraintValue]
  val GP = "GP".asInstanceOf[GeoMatchConstraintValue]
  val GU = "GU".asInstanceOf[GeoMatchConstraintValue]
  val GT = "GT".asInstanceOf[GeoMatchConstraintValue]
  val GG = "GG".asInstanceOf[GeoMatchConstraintValue]
  val GN = "GN".asInstanceOf[GeoMatchConstraintValue]
  val GW = "GW".asInstanceOf[GeoMatchConstraintValue]
  val GY = "GY".asInstanceOf[GeoMatchConstraintValue]
  val HT = "HT".asInstanceOf[GeoMatchConstraintValue]
  val HM = "HM".asInstanceOf[GeoMatchConstraintValue]
  val VA = "VA".asInstanceOf[GeoMatchConstraintValue]
  val HN = "HN".asInstanceOf[GeoMatchConstraintValue]
  val HK = "HK".asInstanceOf[GeoMatchConstraintValue]
  val HU = "HU".asInstanceOf[GeoMatchConstraintValue]
  val IS = "IS".asInstanceOf[GeoMatchConstraintValue]
  val IN = "IN".asInstanceOf[GeoMatchConstraintValue]
  val ID = "ID".asInstanceOf[GeoMatchConstraintValue]
  val IR = "IR".asInstanceOf[GeoMatchConstraintValue]
  val IQ = "IQ".asInstanceOf[GeoMatchConstraintValue]
  val IE = "IE".asInstanceOf[GeoMatchConstraintValue]
  val IM = "IM".asInstanceOf[GeoMatchConstraintValue]
  val IL = "IL".asInstanceOf[GeoMatchConstraintValue]
  val IT = "IT".asInstanceOf[GeoMatchConstraintValue]
  val JM = "JM".asInstanceOf[GeoMatchConstraintValue]
  val JP = "JP".asInstanceOf[GeoMatchConstraintValue]
  val JE = "JE".asInstanceOf[GeoMatchConstraintValue]
  val JO = "JO".asInstanceOf[GeoMatchConstraintValue]
  val KZ = "KZ".asInstanceOf[GeoMatchConstraintValue]
  val KE = "KE".asInstanceOf[GeoMatchConstraintValue]
  val KI = "KI".asInstanceOf[GeoMatchConstraintValue]
  val KP = "KP".asInstanceOf[GeoMatchConstraintValue]
  val KR = "KR".asInstanceOf[GeoMatchConstraintValue]
  val KW = "KW".asInstanceOf[GeoMatchConstraintValue]
  val KG = "KG".asInstanceOf[GeoMatchConstraintValue]
  val LA = "LA".asInstanceOf[GeoMatchConstraintValue]
  val LV = "LV".asInstanceOf[GeoMatchConstraintValue]
  val LB = "LB".asInstanceOf[GeoMatchConstraintValue]
  val LS = "LS".asInstanceOf[GeoMatchConstraintValue]
  val LR = "LR".asInstanceOf[GeoMatchConstraintValue]
  val LY = "LY".asInstanceOf[GeoMatchConstraintValue]
  val LI = "LI".asInstanceOf[GeoMatchConstraintValue]
  val LT = "LT".asInstanceOf[GeoMatchConstraintValue]
  val LU = "LU".asInstanceOf[GeoMatchConstraintValue]
  val MO = "MO".asInstanceOf[GeoMatchConstraintValue]
  val MK = "MK".asInstanceOf[GeoMatchConstraintValue]
  val MG = "MG".asInstanceOf[GeoMatchConstraintValue]
  val MW = "MW".asInstanceOf[GeoMatchConstraintValue]
  val MY = "MY".asInstanceOf[GeoMatchConstraintValue]
  val MV = "MV".asInstanceOf[GeoMatchConstraintValue]
  val ML = "ML".asInstanceOf[GeoMatchConstraintValue]
  val MT = "MT".asInstanceOf[GeoMatchConstraintValue]
  val MH = "MH".asInstanceOf[GeoMatchConstraintValue]
  val MQ = "MQ".asInstanceOf[GeoMatchConstraintValue]
  val MR = "MR".asInstanceOf[GeoMatchConstraintValue]
  val MU = "MU".asInstanceOf[GeoMatchConstraintValue]
  val YT = "YT".asInstanceOf[GeoMatchConstraintValue]
  val MX = "MX".asInstanceOf[GeoMatchConstraintValue]
  val FM = "FM".asInstanceOf[GeoMatchConstraintValue]
  val MD = "MD".asInstanceOf[GeoMatchConstraintValue]
  val MC = "MC".asInstanceOf[GeoMatchConstraintValue]
  val MN = "MN".asInstanceOf[GeoMatchConstraintValue]
  val ME = "ME".asInstanceOf[GeoMatchConstraintValue]
  val MS = "MS".asInstanceOf[GeoMatchConstraintValue]
  val MA = "MA".asInstanceOf[GeoMatchConstraintValue]
  val MZ = "MZ".asInstanceOf[GeoMatchConstraintValue]
  val MM = "MM".asInstanceOf[GeoMatchConstraintValue]
  val NA = "NA".asInstanceOf[GeoMatchConstraintValue]
  val NR = "NR".asInstanceOf[GeoMatchConstraintValue]
  val NP = "NP".asInstanceOf[GeoMatchConstraintValue]
  val NL = "NL".asInstanceOf[GeoMatchConstraintValue]
  val NC = "NC".asInstanceOf[GeoMatchConstraintValue]
  val NZ = "NZ".asInstanceOf[GeoMatchConstraintValue]
  val NI = "NI".asInstanceOf[GeoMatchConstraintValue]
  val NE = "NE".asInstanceOf[GeoMatchConstraintValue]
  val NG = "NG".asInstanceOf[GeoMatchConstraintValue]
  val NU = "NU".asInstanceOf[GeoMatchConstraintValue]
  val NF = "NF".asInstanceOf[GeoMatchConstraintValue]
  val MP = "MP".asInstanceOf[GeoMatchConstraintValue]
  val NO = "NO".asInstanceOf[GeoMatchConstraintValue]
  val OM = "OM".asInstanceOf[GeoMatchConstraintValue]
  val PK = "PK".asInstanceOf[GeoMatchConstraintValue]
  val PW = "PW".asInstanceOf[GeoMatchConstraintValue]
  val PS = "PS".asInstanceOf[GeoMatchConstraintValue]
  val PA = "PA".asInstanceOf[GeoMatchConstraintValue]
  val PG = "PG".asInstanceOf[GeoMatchConstraintValue]
  val PY = "PY".asInstanceOf[GeoMatchConstraintValue]
  val PE = "PE".asInstanceOf[GeoMatchConstraintValue]
  val PH = "PH".asInstanceOf[GeoMatchConstraintValue]
  val PN = "PN".asInstanceOf[GeoMatchConstraintValue]
  val PL = "PL".asInstanceOf[GeoMatchConstraintValue]
  val PT = "PT".asInstanceOf[GeoMatchConstraintValue]
  val PR = "PR".asInstanceOf[GeoMatchConstraintValue]
  val QA = "QA".asInstanceOf[GeoMatchConstraintValue]
  val RE = "RE".asInstanceOf[GeoMatchConstraintValue]
  val RO = "RO".asInstanceOf[GeoMatchConstraintValue]
  val RU = "RU".asInstanceOf[GeoMatchConstraintValue]
  val RW = "RW".asInstanceOf[GeoMatchConstraintValue]
  val BL = "BL".asInstanceOf[GeoMatchConstraintValue]
  val SH = "SH".asInstanceOf[GeoMatchConstraintValue]
  val KN = "KN".asInstanceOf[GeoMatchConstraintValue]
  val LC = "LC".asInstanceOf[GeoMatchConstraintValue]
  val MF = "MF".asInstanceOf[GeoMatchConstraintValue]
  val PM = "PM".asInstanceOf[GeoMatchConstraintValue]
  val VC = "VC".asInstanceOf[GeoMatchConstraintValue]
  val WS = "WS".asInstanceOf[GeoMatchConstraintValue]
  val SM = "SM".asInstanceOf[GeoMatchConstraintValue]
  val ST = "ST".asInstanceOf[GeoMatchConstraintValue]
  val SA = "SA".asInstanceOf[GeoMatchConstraintValue]
  val SN = "SN".asInstanceOf[GeoMatchConstraintValue]
  val RS = "RS".asInstanceOf[GeoMatchConstraintValue]
  val SC = "SC".asInstanceOf[GeoMatchConstraintValue]
  val SL = "SL".asInstanceOf[GeoMatchConstraintValue]
  val SG = "SG".asInstanceOf[GeoMatchConstraintValue]
  val SX = "SX".asInstanceOf[GeoMatchConstraintValue]
  val SK = "SK".asInstanceOf[GeoMatchConstraintValue]
  val SI = "SI".asInstanceOf[GeoMatchConstraintValue]
  val SB = "SB".asInstanceOf[GeoMatchConstraintValue]
  val SO = "SO".asInstanceOf[GeoMatchConstraintValue]
  val ZA = "ZA".asInstanceOf[GeoMatchConstraintValue]
  val GS = "GS".asInstanceOf[GeoMatchConstraintValue]
  val SS = "SS".asInstanceOf[GeoMatchConstraintValue]
  val ES = "ES".asInstanceOf[GeoMatchConstraintValue]
  val LK = "LK".asInstanceOf[GeoMatchConstraintValue]
  val SD = "SD".asInstanceOf[GeoMatchConstraintValue]
  val SR = "SR".asInstanceOf[GeoMatchConstraintValue]
  val SJ = "SJ".asInstanceOf[GeoMatchConstraintValue]
  val SZ = "SZ".asInstanceOf[GeoMatchConstraintValue]
  val SE = "SE".asInstanceOf[GeoMatchConstraintValue]
  val CH = "CH".asInstanceOf[GeoMatchConstraintValue]
  val SY = "SY".asInstanceOf[GeoMatchConstraintValue]
  val TW = "TW".asInstanceOf[GeoMatchConstraintValue]
  val TJ = "TJ".asInstanceOf[GeoMatchConstraintValue]
  val TZ = "TZ".asInstanceOf[GeoMatchConstraintValue]
  val TH = "TH".asInstanceOf[GeoMatchConstraintValue]
  val TL = "TL".asInstanceOf[GeoMatchConstraintValue]
  val TG = "TG".asInstanceOf[GeoMatchConstraintValue]
  val TK = "TK".asInstanceOf[GeoMatchConstraintValue]
  val TO = "TO".asInstanceOf[GeoMatchConstraintValue]
  val TT = "TT".asInstanceOf[GeoMatchConstraintValue]
  val TN = "TN".asInstanceOf[GeoMatchConstraintValue]
  val TR = "TR".asInstanceOf[GeoMatchConstraintValue]
  val TM = "TM".asInstanceOf[GeoMatchConstraintValue]
  val TC = "TC".asInstanceOf[GeoMatchConstraintValue]
  val TV = "TV".asInstanceOf[GeoMatchConstraintValue]
  val UG = "UG".asInstanceOf[GeoMatchConstraintValue]
  val UA = "UA".asInstanceOf[GeoMatchConstraintValue]
  val AE = "AE".asInstanceOf[GeoMatchConstraintValue]
  val GB = "GB".asInstanceOf[GeoMatchConstraintValue]
  val US = "US".asInstanceOf[GeoMatchConstraintValue]
  val UM = "UM".asInstanceOf[GeoMatchConstraintValue]
  val UY = "UY".asInstanceOf[GeoMatchConstraintValue]
  val UZ = "UZ".asInstanceOf[GeoMatchConstraintValue]
  val VU = "VU".asInstanceOf[GeoMatchConstraintValue]
  val VE = "VE".asInstanceOf[GeoMatchConstraintValue]
  val VN = "VN".asInstanceOf[GeoMatchConstraintValue]
  val VG = "VG".asInstanceOf[GeoMatchConstraintValue]
  val VI = "VI".asInstanceOf[GeoMatchConstraintValue]
  val WF = "WF".asInstanceOf[GeoMatchConstraintValue]
  val EH = "EH".asInstanceOf[GeoMatchConstraintValue]
  val YE = "YE".asInstanceOf[GeoMatchConstraintValue]
  val ZM = "ZM".asInstanceOf[GeoMatchConstraintValue]
  val ZW = "ZW".asInstanceOf[GeoMatchConstraintValue]

  @inline def values: js.Array[GeoMatchConstraintValue] = js.Array(
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

@js.native
sealed trait IPSetDescriptorType extends js.Any
object IPSetDescriptorType {
  val IPV4 = "IPV4".asInstanceOf[IPSetDescriptorType]
  val IPV6 = "IPV6".asInstanceOf[IPSetDescriptorType]

  @inline def values: js.Array[IPSetDescriptorType] = js.Array(IPV4, IPV6)
}

@js.native
sealed trait MatchFieldType extends js.Any
object MatchFieldType {
  val URI = "URI".asInstanceOf[MatchFieldType]
  val QUERY_STRING = "QUERY_STRING".asInstanceOf[MatchFieldType]
  val HEADER = "HEADER".asInstanceOf[MatchFieldType]
  val METHOD = "METHOD".asInstanceOf[MatchFieldType]
  val BODY = "BODY".asInstanceOf[MatchFieldType]
  val SINGLE_QUERY_ARG = "SINGLE_QUERY_ARG".asInstanceOf[MatchFieldType]
  val ALL_QUERY_ARGS = "ALL_QUERY_ARGS".asInstanceOf[MatchFieldType]

  @inline def values: js.Array[MatchFieldType] = js.Array(URI, QUERY_STRING, HEADER, METHOD, BODY, SINGLE_QUERY_ARG, ALL_QUERY_ARGS)
}

@js.native
sealed trait PositionalConstraint extends js.Any
object PositionalConstraint {
  val EXACTLY = "EXACTLY".asInstanceOf[PositionalConstraint]
  val STARTS_WITH = "STARTS_WITH".asInstanceOf[PositionalConstraint]
  val ENDS_WITH = "ENDS_WITH".asInstanceOf[PositionalConstraint]
  val CONTAINS = "CONTAINS".asInstanceOf[PositionalConstraint]
  val CONTAINS_WORD = "CONTAINS_WORD".asInstanceOf[PositionalConstraint]

  @inline def values: js.Array[PositionalConstraint] = js.Array(EXACTLY, STARTS_WITH, ENDS_WITH, CONTAINS, CONTAINS_WORD)
}

@js.native
sealed trait PredicateType extends js.Any
object PredicateType {
  val IPMatch = "IPMatch".asInstanceOf[PredicateType]
  val ByteMatch = "ByteMatch".asInstanceOf[PredicateType]
  val SqlInjectionMatch = "SqlInjectionMatch".asInstanceOf[PredicateType]
  val GeoMatch = "GeoMatch".asInstanceOf[PredicateType]
  val SizeConstraint = "SizeConstraint".asInstanceOf[PredicateType]
  val XssMatch = "XssMatch".asInstanceOf[PredicateType]
  val RegexMatch = "RegexMatch".asInstanceOf[PredicateType]

  @inline def values: js.Array[PredicateType] = js.Array(IPMatch, ByteMatch, SqlInjectionMatch, GeoMatch, SizeConstraint, XssMatch, RegexMatch)
}

@js.native
sealed trait RateKey extends js.Any
object RateKey {
  val IP = "IP".asInstanceOf[RateKey]

  @inline def values: js.Array[RateKey] = js.Array(IP)
}

@js.native
sealed trait TextTransformation extends js.Any
object TextTransformation {
  val NONE = "NONE".asInstanceOf[TextTransformation]
  val COMPRESS_WHITE_SPACE = "COMPRESS_WHITE_SPACE".asInstanceOf[TextTransformation]
  val HTML_ENTITY_DECODE = "HTML_ENTITY_DECODE".asInstanceOf[TextTransformation]
  val LOWERCASE = "LOWERCASE".asInstanceOf[TextTransformation]
  val CMD_LINE = "CMD_LINE".asInstanceOf[TextTransformation]
  val URL_DECODE = "URL_DECODE".asInstanceOf[TextTransformation]

  @inline def values: js.Array[TextTransformation] = js.Array(NONE, COMPRESS_WHITE_SPACE, HTML_ENTITY_DECODE, LOWERCASE, CMD_LINE, URL_DECODE)
}

@js.native
sealed trait WafActionType extends js.Any
object WafActionType {
  val BLOCK = "BLOCK".asInstanceOf[WafActionType]
  val ALLOW = "ALLOW".asInstanceOf[WafActionType]
  val COUNT = "COUNT".asInstanceOf[WafActionType]

  @inline def values: js.Array[WafActionType] = js.Array(BLOCK, ALLOW, COUNT)
}

@js.native
sealed trait WafOverrideActionType extends js.Any
object WafOverrideActionType {
  val NONE = "NONE".asInstanceOf[WafOverrideActionType]
  val COUNT = "COUNT".asInstanceOf[WafOverrideActionType]

  @inline def values: js.Array[WafOverrideActionType] = js.Array(NONE, COUNT)
}

@js.native
sealed trait WafRuleType extends js.Any
object WafRuleType {
  val REGULAR = "REGULAR".asInstanceOf[WafRuleType]
  val RATE_BASED = "RATE_BASED".asInstanceOf[WafRuleType]
  val GROUP = "GROUP".asInstanceOf[WafRuleType]

  @inline def values: js.Array[WafRuleType] = js.Array(REGULAR, RATE_BASED, GROUP)
}
