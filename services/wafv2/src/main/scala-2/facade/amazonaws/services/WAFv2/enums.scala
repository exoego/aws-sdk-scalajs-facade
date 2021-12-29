package facade.amazonaws.services.wafv2

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ActionValue extends js.Any
object ActionValue {
  val ALLOW = "ALLOW".asInstanceOf[ActionValue]
  val BLOCK = "BLOCK".asInstanceOf[ActionValue]
  val COUNT = "COUNT".asInstanceOf[ActionValue]

  @inline def values = js.Array(ALLOW, BLOCK, COUNT)
}

@js.native
sealed trait BodyParsingFallbackBehavior extends js.Any
object BodyParsingFallbackBehavior {
  val MATCH = "MATCH".asInstanceOf[BodyParsingFallbackBehavior]
  val NO_MATCH = "NO_MATCH".asInstanceOf[BodyParsingFallbackBehavior]
  val EVALUATE_AS_STRING = "EVALUATE_AS_STRING".asInstanceOf[BodyParsingFallbackBehavior]

  @inline def values = js.Array(MATCH, NO_MATCH, EVALUATE_AS_STRING)
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

  @inline def values = js.Array(EQ, NE, LE, LT, GE, GT)
}

@js.native
sealed trait CountryCode extends js.Any
object CountryCode {
  val AF = "AF".asInstanceOf[CountryCode]
  val AX = "AX".asInstanceOf[CountryCode]
  val AL = "AL".asInstanceOf[CountryCode]
  val DZ = "DZ".asInstanceOf[CountryCode]
  val AS = "AS".asInstanceOf[CountryCode]
  val AD = "AD".asInstanceOf[CountryCode]
  val AO = "AO".asInstanceOf[CountryCode]
  val AI = "AI".asInstanceOf[CountryCode]
  val AQ = "AQ".asInstanceOf[CountryCode]
  val AG = "AG".asInstanceOf[CountryCode]
  val AR = "AR".asInstanceOf[CountryCode]
  val AM = "AM".asInstanceOf[CountryCode]
  val AW = "AW".asInstanceOf[CountryCode]
  val AU = "AU".asInstanceOf[CountryCode]
  val AT = "AT".asInstanceOf[CountryCode]
  val AZ = "AZ".asInstanceOf[CountryCode]
  val BS = "BS".asInstanceOf[CountryCode]
  val BH = "BH".asInstanceOf[CountryCode]
  val BD = "BD".asInstanceOf[CountryCode]
  val BB = "BB".asInstanceOf[CountryCode]
  val BY = "BY".asInstanceOf[CountryCode]
  val BE = "BE".asInstanceOf[CountryCode]
  val BZ = "BZ".asInstanceOf[CountryCode]
  val BJ = "BJ".asInstanceOf[CountryCode]
  val BM = "BM".asInstanceOf[CountryCode]
  val BT = "BT".asInstanceOf[CountryCode]
  val BO = "BO".asInstanceOf[CountryCode]
  val BQ = "BQ".asInstanceOf[CountryCode]
  val BA = "BA".asInstanceOf[CountryCode]
  val BW = "BW".asInstanceOf[CountryCode]
  val BV = "BV".asInstanceOf[CountryCode]
  val BR = "BR".asInstanceOf[CountryCode]
  val IO = "IO".asInstanceOf[CountryCode]
  val BN = "BN".asInstanceOf[CountryCode]
  val BG = "BG".asInstanceOf[CountryCode]
  val BF = "BF".asInstanceOf[CountryCode]
  val BI = "BI".asInstanceOf[CountryCode]
  val KH = "KH".asInstanceOf[CountryCode]
  val CM = "CM".asInstanceOf[CountryCode]
  val CA = "CA".asInstanceOf[CountryCode]
  val CV = "CV".asInstanceOf[CountryCode]
  val KY = "KY".asInstanceOf[CountryCode]
  val CF = "CF".asInstanceOf[CountryCode]
  val TD = "TD".asInstanceOf[CountryCode]
  val CL = "CL".asInstanceOf[CountryCode]
  val CN = "CN".asInstanceOf[CountryCode]
  val CX = "CX".asInstanceOf[CountryCode]
  val CC = "CC".asInstanceOf[CountryCode]
  val CO = "CO".asInstanceOf[CountryCode]
  val KM = "KM".asInstanceOf[CountryCode]
  val CG = "CG".asInstanceOf[CountryCode]
  val CD = "CD".asInstanceOf[CountryCode]
  val CK = "CK".asInstanceOf[CountryCode]
  val CR = "CR".asInstanceOf[CountryCode]
  val CI = "CI".asInstanceOf[CountryCode]
  val HR = "HR".asInstanceOf[CountryCode]
  val CU = "CU".asInstanceOf[CountryCode]
  val CW = "CW".asInstanceOf[CountryCode]
  val CY = "CY".asInstanceOf[CountryCode]
  val CZ = "CZ".asInstanceOf[CountryCode]
  val DK = "DK".asInstanceOf[CountryCode]
  val DJ = "DJ".asInstanceOf[CountryCode]
  val DM = "DM".asInstanceOf[CountryCode]
  val DO = "DO".asInstanceOf[CountryCode]
  val EC = "EC".asInstanceOf[CountryCode]
  val EG = "EG".asInstanceOf[CountryCode]
  val SV = "SV".asInstanceOf[CountryCode]
  val GQ = "GQ".asInstanceOf[CountryCode]
  val ER = "ER".asInstanceOf[CountryCode]
  val EE = "EE".asInstanceOf[CountryCode]
  val ET = "ET".asInstanceOf[CountryCode]
  val FK = "FK".asInstanceOf[CountryCode]
  val FO = "FO".asInstanceOf[CountryCode]
  val FJ = "FJ".asInstanceOf[CountryCode]
  val FI = "FI".asInstanceOf[CountryCode]
  val FR = "FR".asInstanceOf[CountryCode]
  val GF = "GF".asInstanceOf[CountryCode]
  val PF = "PF".asInstanceOf[CountryCode]
  val TF = "TF".asInstanceOf[CountryCode]
  val GA = "GA".asInstanceOf[CountryCode]
  val GM = "GM".asInstanceOf[CountryCode]
  val GE = "GE".asInstanceOf[CountryCode]
  val DE = "DE".asInstanceOf[CountryCode]
  val GH = "GH".asInstanceOf[CountryCode]
  val GI = "GI".asInstanceOf[CountryCode]
  val GR = "GR".asInstanceOf[CountryCode]
  val GL = "GL".asInstanceOf[CountryCode]
  val GD = "GD".asInstanceOf[CountryCode]
  val GP = "GP".asInstanceOf[CountryCode]
  val GU = "GU".asInstanceOf[CountryCode]
  val GT = "GT".asInstanceOf[CountryCode]
  val GG = "GG".asInstanceOf[CountryCode]
  val GN = "GN".asInstanceOf[CountryCode]
  val GW = "GW".asInstanceOf[CountryCode]
  val GY = "GY".asInstanceOf[CountryCode]
  val HT = "HT".asInstanceOf[CountryCode]
  val HM = "HM".asInstanceOf[CountryCode]
  val VA = "VA".asInstanceOf[CountryCode]
  val HN = "HN".asInstanceOf[CountryCode]
  val HK = "HK".asInstanceOf[CountryCode]
  val HU = "HU".asInstanceOf[CountryCode]
  val IS = "IS".asInstanceOf[CountryCode]
  val IN = "IN".asInstanceOf[CountryCode]
  val ID = "ID".asInstanceOf[CountryCode]
  val IR = "IR".asInstanceOf[CountryCode]
  val IQ = "IQ".asInstanceOf[CountryCode]
  val IE = "IE".asInstanceOf[CountryCode]
  val IM = "IM".asInstanceOf[CountryCode]
  val IL = "IL".asInstanceOf[CountryCode]
  val IT = "IT".asInstanceOf[CountryCode]
  val JM = "JM".asInstanceOf[CountryCode]
  val JP = "JP".asInstanceOf[CountryCode]
  val JE = "JE".asInstanceOf[CountryCode]
  val JO = "JO".asInstanceOf[CountryCode]
  val KZ = "KZ".asInstanceOf[CountryCode]
  val KE = "KE".asInstanceOf[CountryCode]
  val KI = "KI".asInstanceOf[CountryCode]
  val KP = "KP".asInstanceOf[CountryCode]
  val KR = "KR".asInstanceOf[CountryCode]
  val KW = "KW".asInstanceOf[CountryCode]
  val KG = "KG".asInstanceOf[CountryCode]
  val LA = "LA".asInstanceOf[CountryCode]
  val LV = "LV".asInstanceOf[CountryCode]
  val LB = "LB".asInstanceOf[CountryCode]
  val LS = "LS".asInstanceOf[CountryCode]
  val LR = "LR".asInstanceOf[CountryCode]
  val LY = "LY".asInstanceOf[CountryCode]
  val LI = "LI".asInstanceOf[CountryCode]
  val LT = "LT".asInstanceOf[CountryCode]
  val LU = "LU".asInstanceOf[CountryCode]
  val MO = "MO".asInstanceOf[CountryCode]
  val MK = "MK".asInstanceOf[CountryCode]
  val MG = "MG".asInstanceOf[CountryCode]
  val MW = "MW".asInstanceOf[CountryCode]
  val MY = "MY".asInstanceOf[CountryCode]
  val MV = "MV".asInstanceOf[CountryCode]
  val ML = "ML".asInstanceOf[CountryCode]
  val MT = "MT".asInstanceOf[CountryCode]
  val MH = "MH".asInstanceOf[CountryCode]
  val MQ = "MQ".asInstanceOf[CountryCode]
  val MR = "MR".asInstanceOf[CountryCode]
  val MU = "MU".asInstanceOf[CountryCode]
  val YT = "YT".asInstanceOf[CountryCode]
  val MX = "MX".asInstanceOf[CountryCode]
  val FM = "FM".asInstanceOf[CountryCode]
  val MD = "MD".asInstanceOf[CountryCode]
  val MC = "MC".asInstanceOf[CountryCode]
  val MN = "MN".asInstanceOf[CountryCode]
  val ME = "ME".asInstanceOf[CountryCode]
  val MS = "MS".asInstanceOf[CountryCode]
  val MA = "MA".asInstanceOf[CountryCode]
  val MZ = "MZ".asInstanceOf[CountryCode]
  val MM = "MM".asInstanceOf[CountryCode]
  val NA = "NA".asInstanceOf[CountryCode]
  val NR = "NR".asInstanceOf[CountryCode]
  val NP = "NP".asInstanceOf[CountryCode]
  val NL = "NL".asInstanceOf[CountryCode]
  val NC = "NC".asInstanceOf[CountryCode]
  val NZ = "NZ".asInstanceOf[CountryCode]
  val NI = "NI".asInstanceOf[CountryCode]
  val NE = "NE".asInstanceOf[CountryCode]
  val NG = "NG".asInstanceOf[CountryCode]
  val NU = "NU".asInstanceOf[CountryCode]
  val NF = "NF".asInstanceOf[CountryCode]
  val MP = "MP".asInstanceOf[CountryCode]
  val NO = "NO".asInstanceOf[CountryCode]
  val OM = "OM".asInstanceOf[CountryCode]
  val PK = "PK".asInstanceOf[CountryCode]
  val PW = "PW".asInstanceOf[CountryCode]
  val PS = "PS".asInstanceOf[CountryCode]
  val PA = "PA".asInstanceOf[CountryCode]
  val PG = "PG".asInstanceOf[CountryCode]
  val PY = "PY".asInstanceOf[CountryCode]
  val PE = "PE".asInstanceOf[CountryCode]
  val PH = "PH".asInstanceOf[CountryCode]
  val PN = "PN".asInstanceOf[CountryCode]
  val PL = "PL".asInstanceOf[CountryCode]
  val PT = "PT".asInstanceOf[CountryCode]
  val PR = "PR".asInstanceOf[CountryCode]
  val QA = "QA".asInstanceOf[CountryCode]
  val RE = "RE".asInstanceOf[CountryCode]
  val RO = "RO".asInstanceOf[CountryCode]
  val RU = "RU".asInstanceOf[CountryCode]
  val RW = "RW".asInstanceOf[CountryCode]
  val BL = "BL".asInstanceOf[CountryCode]
  val SH = "SH".asInstanceOf[CountryCode]
  val KN = "KN".asInstanceOf[CountryCode]
  val LC = "LC".asInstanceOf[CountryCode]
  val MF = "MF".asInstanceOf[CountryCode]
  val PM = "PM".asInstanceOf[CountryCode]
  val VC = "VC".asInstanceOf[CountryCode]
  val WS = "WS".asInstanceOf[CountryCode]
  val SM = "SM".asInstanceOf[CountryCode]
  val ST = "ST".asInstanceOf[CountryCode]
  val SA = "SA".asInstanceOf[CountryCode]
  val SN = "SN".asInstanceOf[CountryCode]
  val RS = "RS".asInstanceOf[CountryCode]
  val SC = "SC".asInstanceOf[CountryCode]
  val SL = "SL".asInstanceOf[CountryCode]
  val SG = "SG".asInstanceOf[CountryCode]
  val SX = "SX".asInstanceOf[CountryCode]
  val SK = "SK".asInstanceOf[CountryCode]
  val SI = "SI".asInstanceOf[CountryCode]
  val SB = "SB".asInstanceOf[CountryCode]
  val SO = "SO".asInstanceOf[CountryCode]
  val ZA = "ZA".asInstanceOf[CountryCode]
  val GS = "GS".asInstanceOf[CountryCode]
  val SS = "SS".asInstanceOf[CountryCode]
  val ES = "ES".asInstanceOf[CountryCode]
  val LK = "LK".asInstanceOf[CountryCode]
  val SD = "SD".asInstanceOf[CountryCode]
  val SR = "SR".asInstanceOf[CountryCode]
  val SJ = "SJ".asInstanceOf[CountryCode]
  val SZ = "SZ".asInstanceOf[CountryCode]
  val SE = "SE".asInstanceOf[CountryCode]
  val CH = "CH".asInstanceOf[CountryCode]
  val SY = "SY".asInstanceOf[CountryCode]
  val TW = "TW".asInstanceOf[CountryCode]
  val TJ = "TJ".asInstanceOf[CountryCode]
  val TZ = "TZ".asInstanceOf[CountryCode]
  val TH = "TH".asInstanceOf[CountryCode]
  val TL = "TL".asInstanceOf[CountryCode]
  val TG = "TG".asInstanceOf[CountryCode]
  val TK = "TK".asInstanceOf[CountryCode]
  val TO = "TO".asInstanceOf[CountryCode]
  val TT = "TT".asInstanceOf[CountryCode]
  val TN = "TN".asInstanceOf[CountryCode]
  val TR = "TR".asInstanceOf[CountryCode]
  val TM = "TM".asInstanceOf[CountryCode]
  val TC = "TC".asInstanceOf[CountryCode]
  val TV = "TV".asInstanceOf[CountryCode]
  val UG = "UG".asInstanceOf[CountryCode]
  val UA = "UA".asInstanceOf[CountryCode]
  val AE = "AE".asInstanceOf[CountryCode]
  val GB = "GB".asInstanceOf[CountryCode]
  val US = "US".asInstanceOf[CountryCode]
  val UM = "UM".asInstanceOf[CountryCode]
  val UY = "UY".asInstanceOf[CountryCode]
  val UZ = "UZ".asInstanceOf[CountryCode]
  val VU = "VU".asInstanceOf[CountryCode]
  val VE = "VE".asInstanceOf[CountryCode]
  val VN = "VN".asInstanceOf[CountryCode]
  val VG = "VG".asInstanceOf[CountryCode]
  val VI = "VI".asInstanceOf[CountryCode]
  val WF = "WF".asInstanceOf[CountryCode]
  val EH = "EH".asInstanceOf[CountryCode]
  val YE = "YE".asInstanceOf[CountryCode]
  val ZM = "ZM".asInstanceOf[CountryCode]
  val ZW = "ZW".asInstanceOf[CountryCode]

  @inline def values = js.Array(AF, AX, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW, AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BQ, BA, BW, BV, BR, IO, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM, CG, CD, CK, CR, CI, HR, CU, CW, CY, CZ, DK, DJ, DM, DO, EC, EG, SV, GQ, ER, EE, ET, FK, FO, FJ, FI, FR, GF, PF, TF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GP, GU, GT, GG, GN, GW, GY, HT, HM, VA, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT, JM, JP, JE, JO, KZ, KE, KI, KP, KR, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT, LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MQ, MR, MU, YT, MX, FM, MD, MC, MN, ME, MS, MA, MZ, MM, NA, NR, NP, NL, NC, NZ, NI, NE, NG, NU, NF, MP, NO, OM, PK, PW, PS, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, RE, RO, RU, RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX, SK, SI, SB, SO, ZA, GS, SS, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ, TH, TL, TG, TK, TO, TT, TN, TR, TM, TC, TV, UG, UA, AE, GB, US, UM, UY, UZ, VU, VE, VN, VG, VI, WF, EH, YE, ZM, ZW)
}

@js.native
sealed trait FallbackBehavior extends js.Any
object FallbackBehavior {
  val MATCH = "MATCH".asInstanceOf[FallbackBehavior]
  val NO_MATCH = "NO_MATCH".asInstanceOf[FallbackBehavior]

  @inline def values = js.Array(MATCH, NO_MATCH)
}

@js.native
sealed trait FilterBehavior extends js.Any
object FilterBehavior {
  val KEEP = "KEEP".asInstanceOf[FilterBehavior]
  val DROP = "DROP".asInstanceOf[FilterBehavior]

  @inline def values = js.Array(KEEP, DROP)
}

@js.native
sealed trait FilterRequirement extends js.Any
object FilterRequirement {
  val MEETS_ALL = "MEETS_ALL".asInstanceOf[FilterRequirement]
  val MEETS_ANY = "MEETS_ANY".asInstanceOf[FilterRequirement]

  @inline def values = js.Array(MEETS_ALL, MEETS_ANY)
}

@js.native
sealed trait ForwardedIPPosition extends js.Any
object ForwardedIPPosition {
  val FIRST = "FIRST".asInstanceOf[ForwardedIPPosition]
  val LAST = "LAST".asInstanceOf[ForwardedIPPosition]
  val ANY = "ANY".asInstanceOf[ForwardedIPPosition]

  @inline def values = js.Array(FIRST, LAST, ANY)
}

@js.native
sealed trait IPAddressVersion extends js.Any
object IPAddressVersion {
  val IPV4 = "IPV4".asInstanceOf[IPAddressVersion]
  val IPV6 = "IPV6".asInstanceOf[IPAddressVersion]

  @inline def values = js.Array(IPV4, IPV6)
}

@js.native
sealed trait JsonMatchScope extends js.Any
object JsonMatchScope {
  val ALL = "ALL".asInstanceOf[JsonMatchScope]
  val KEY = "KEY".asInstanceOf[JsonMatchScope]
  val VALUE = "VALUE".asInstanceOf[JsonMatchScope]

  @inline def values = js.Array(ALL, KEY, VALUE)
}

@js.native
sealed trait LabelMatchScope extends js.Any
object LabelMatchScope {
  val LABEL = "LABEL".asInstanceOf[LabelMatchScope]
  val NAMESPACE = "NAMESPACE".asInstanceOf[LabelMatchScope]

  @inline def values = js.Array(LABEL, NAMESPACE)
}

@js.native
sealed trait PositionalConstraint extends js.Any
object PositionalConstraint {
  val EXACTLY = "EXACTLY".asInstanceOf[PositionalConstraint]
  val STARTS_WITH = "STARTS_WITH".asInstanceOf[PositionalConstraint]
  val ENDS_WITH = "ENDS_WITH".asInstanceOf[PositionalConstraint]
  val CONTAINS = "CONTAINS".asInstanceOf[PositionalConstraint]
  val CONTAINS_WORD = "CONTAINS_WORD".asInstanceOf[PositionalConstraint]

  @inline def values = js.Array(EXACTLY, STARTS_WITH, ENDS_WITH, CONTAINS, CONTAINS_WORD)
}

@js.native
sealed trait RateBasedStatementAggregateKeyType extends js.Any
object RateBasedStatementAggregateKeyType {
  val IP = "IP".asInstanceOf[RateBasedStatementAggregateKeyType]
  val FORWARDED_IP = "FORWARDED_IP".asInstanceOf[RateBasedStatementAggregateKeyType]

  @inline def values = js.Array(IP, FORWARDED_IP)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val APPLICATION_LOAD_BALANCER = "APPLICATION_LOAD_BALANCER".asInstanceOf[ResourceType]
  val API_GATEWAY = "API_GATEWAY".asInstanceOf[ResourceType]
  val APPSYNC = "APPSYNC".asInstanceOf[ResourceType]

  @inline def values = js.Array(APPLICATION_LOAD_BALANCER, API_GATEWAY, APPSYNC)
}

@js.native
sealed trait ResponseContentType extends js.Any
object ResponseContentType {
  val TEXT_PLAIN = "TEXT_PLAIN".asInstanceOf[ResponseContentType]
  val TEXT_HTML = "TEXT_HTML".asInstanceOf[ResponseContentType]
  val APPLICATION_JSON = "APPLICATION_JSON".asInstanceOf[ResponseContentType]

  @inline def values = js.Array(TEXT_PLAIN, TEXT_HTML, APPLICATION_JSON)
}

@js.native
sealed trait Scope extends js.Any
object Scope {
  val CLOUDFRONT = "CLOUDFRONT".asInstanceOf[Scope]
  val REGIONAL = "REGIONAL".asInstanceOf[Scope]

  @inline def values = js.Array(CLOUDFRONT, REGIONAL)
}

@js.native
sealed trait TextTransformationType extends js.Any
object TextTransformationType {
  val NONE = "NONE".asInstanceOf[TextTransformationType]
  val COMPRESS_WHITE_SPACE = "COMPRESS_WHITE_SPACE".asInstanceOf[TextTransformationType]
  val HTML_ENTITY_DECODE = "HTML_ENTITY_DECODE".asInstanceOf[TextTransformationType]
  val LOWERCASE = "LOWERCASE".asInstanceOf[TextTransformationType]
  val CMD_LINE = "CMD_LINE".asInstanceOf[TextTransformationType]
  val URL_DECODE = "URL_DECODE".asInstanceOf[TextTransformationType]

  @inline def values = js.Array(NONE, COMPRESS_WHITE_SPACE, HTML_ENTITY_DECODE, LOWERCASE, CMD_LINE, URL_DECODE)
}

