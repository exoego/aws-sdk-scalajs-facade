package facade.amazonaws.services.cloudsearch

import scalajs.js

@js.native
sealed trait AlgorithmicStemming extends js.Any
object AlgorithmicStemming {
  val none = "none".asInstanceOf[AlgorithmicStemming]
  val minimal = "minimal".asInstanceOf[AlgorithmicStemming]
  val light = "light".asInstanceOf[AlgorithmicStemming]
  val full = "full".asInstanceOf[AlgorithmicStemming]

  @inline def values: js.Array[AlgorithmicStemming] = js.Array(none, minimal, light, full)
}

/** An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF RFC 4646</a> language code or <code>mul</code> for multiple languages.
  */
@js.native
sealed trait AnalysisSchemeLanguage extends js.Any
object AnalysisSchemeLanguage {
  val ar = "ar".asInstanceOf[AnalysisSchemeLanguage]
  val bg = "bg".asInstanceOf[AnalysisSchemeLanguage]
  val ca = "ca".asInstanceOf[AnalysisSchemeLanguage]
  val cs = "cs".asInstanceOf[AnalysisSchemeLanguage]
  val da = "da".asInstanceOf[AnalysisSchemeLanguage]
  val de = "de".asInstanceOf[AnalysisSchemeLanguage]
  val el = "el".asInstanceOf[AnalysisSchemeLanguage]
  val en = "en".asInstanceOf[AnalysisSchemeLanguage]
  val es = "es".asInstanceOf[AnalysisSchemeLanguage]
  val eu = "eu".asInstanceOf[AnalysisSchemeLanguage]
  val fa = "fa".asInstanceOf[AnalysisSchemeLanguage]
  val fi = "fi".asInstanceOf[AnalysisSchemeLanguage]
  val fr = "fr".asInstanceOf[AnalysisSchemeLanguage]
  val ga = "ga".asInstanceOf[AnalysisSchemeLanguage]
  val gl = "gl".asInstanceOf[AnalysisSchemeLanguage]
  val he = "he".asInstanceOf[AnalysisSchemeLanguage]
  val hi = "hi".asInstanceOf[AnalysisSchemeLanguage]
  val hu = "hu".asInstanceOf[AnalysisSchemeLanguage]
  val hy = "hy".asInstanceOf[AnalysisSchemeLanguage]
  val id = "id".asInstanceOf[AnalysisSchemeLanguage]
  val it = "it".asInstanceOf[AnalysisSchemeLanguage]
  val ja = "ja".asInstanceOf[AnalysisSchemeLanguage]
  val ko = "ko".asInstanceOf[AnalysisSchemeLanguage]
  val lv = "lv".asInstanceOf[AnalysisSchemeLanguage]
  val mul = "mul".asInstanceOf[AnalysisSchemeLanguage]
  val nl = "nl".asInstanceOf[AnalysisSchemeLanguage]
  val no = "no".asInstanceOf[AnalysisSchemeLanguage]
  val pt = "pt".asInstanceOf[AnalysisSchemeLanguage]
  val ro = "ro".asInstanceOf[AnalysisSchemeLanguage]
  val ru = "ru".asInstanceOf[AnalysisSchemeLanguage]
  val sv = "sv".asInstanceOf[AnalysisSchemeLanguage]
  val th = "th".asInstanceOf[AnalysisSchemeLanguage]
  val tr = "tr".asInstanceOf[AnalysisSchemeLanguage]
  val `zh-Hans` = "zh-Hans".asInstanceOf[AnalysisSchemeLanguage]
  val `zh-Hant` = "zh-Hant".asInstanceOf[AnalysisSchemeLanguage]

  @inline def values: js.Array[AnalysisSchemeLanguage] = js.Array(ar, bg, ca, cs, da, de, el, en, es, eu, fa, fi, fr, ga, gl, he, hi, hu, hy, id, it, ja, ko, lv, mul, nl, no, pt, ro, ru, sv, th, tr, `zh-Hans`, `zh-Hant`)
}

/** The type of field. The valid options for a field depend on the field type. For more information about the supported field types, see <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html" target="_blank">Configuring Index Fields</a> in the <i>Amazon CloudSearch Developer Guide</i>.
  */
@js.native
sealed trait IndexFieldType extends js.Any
object IndexFieldType {
  val int = "int".asInstanceOf[IndexFieldType]
  val double = "double".asInstanceOf[IndexFieldType]
  val literal = "literal".asInstanceOf[IndexFieldType]
  val text = "text".asInstanceOf[IndexFieldType]
  val date = "date".asInstanceOf[IndexFieldType]
  val latlon = "latlon".asInstanceOf[IndexFieldType]
  val `int-array` = "int-array".asInstanceOf[IndexFieldType]
  val `double-array` = "double-array".asInstanceOf[IndexFieldType]
  val `literal-array` = "literal-array".asInstanceOf[IndexFieldType]
  val `text-array` = "text-array".asInstanceOf[IndexFieldType]
  val `date-array` = "date-array".asInstanceOf[IndexFieldType]

  @inline def values: js.Array[IndexFieldType] = js.Array(int, double, literal, text, date, latlon, `int-array`, `double-array`, `literal-array`, `text-array`, `date-array`)
}

/** The state of processing a change to an option. One of: * RequiresIndexDocuments: The option's latest value will not be deployed until <a>IndexDocuments</a> has been called and indexing is complete. * Processing: The option's latest value is in the process of being activated. * Active: The option's latest value is fully deployed. * FailedToValidate: The option value is not compatible with the domain's data and cannot be used to index the data. You must either modify the option value or update or remove the incompatible documents.
  */
@js.native
sealed trait OptionState extends js.Any
object OptionState {
  val RequiresIndexDocuments = "RequiresIndexDocuments".asInstanceOf[OptionState]
  val Processing = "Processing".asInstanceOf[OptionState]
  val Active = "Active".asInstanceOf[OptionState]
  val FailedToValidate = "FailedToValidate".asInstanceOf[OptionState]

  @inline def values: js.Array[OptionState] = js.Array(RequiresIndexDocuments, Processing, Active, FailedToValidate)
}

/** The instance type (such as <code>search.m1.small</code>) on which an index partition is hosted.
  */
@js.native
sealed trait PartitionInstanceType extends js.Any
object PartitionInstanceType {
  val `search.m1.small` = "search.m1.small".asInstanceOf[PartitionInstanceType]
  val `search.m1.large` = "search.m1.large".asInstanceOf[PartitionInstanceType]
  val `search.m2.xlarge` = "search.m2.xlarge".asInstanceOf[PartitionInstanceType]
  val `search.m2.2xlarge` = "search.m2.2xlarge".asInstanceOf[PartitionInstanceType]
  val `search.m3.medium` = "search.m3.medium".asInstanceOf[PartitionInstanceType]
  val `search.m3.large` = "search.m3.large".asInstanceOf[PartitionInstanceType]
  val `search.m3.xlarge` = "search.m3.xlarge".asInstanceOf[PartitionInstanceType]
  val `search.m3.2xlarge` = "search.m3.2xlarge".asInstanceOf[PartitionInstanceType]
  val `search.small` = "search.small".asInstanceOf[PartitionInstanceType]
  val `search.medium` = "search.medium".asInstanceOf[PartitionInstanceType]
  val `search.large` = "search.large".asInstanceOf[PartitionInstanceType]
  val `search.xlarge` = "search.xlarge".asInstanceOf[PartitionInstanceType]
  val `search.2xlarge` = "search.2xlarge".asInstanceOf[PartitionInstanceType]

  @inline def values: js.Array[PartitionInstanceType] = js.Array(
    `search.m1.small`,
    `search.m1.large`,
    `search.m2.xlarge`,
    `search.m2.2xlarge`,
    `search.m3.medium`,
    `search.m3.large`,
    `search.m3.xlarge`,
    `search.m3.2xlarge`,
    `search.small`,
    `search.medium`,
    `search.large`,
    `search.xlarge`,
    `search.2xlarge`
  )
}

@js.native
sealed trait SuggesterFuzzyMatching extends js.Any
object SuggesterFuzzyMatching {
  val none = "none".asInstanceOf[SuggesterFuzzyMatching]
  val low = "low".asInstanceOf[SuggesterFuzzyMatching]
  val high = "high".asInstanceOf[SuggesterFuzzyMatching]

  @inline def values: js.Array[SuggesterFuzzyMatching] = js.Array(none, low, high)
}

/** The minimum required TLS version.
  */
@js.native
sealed trait TLSSecurityPolicy extends js.Any
object TLSSecurityPolicy {
  val `Policy-Min-TLS-1-0-2019-07` = "Policy-Min-TLS-1-0-2019-07".asInstanceOf[TLSSecurityPolicy]
  val `Policy-Min-TLS-1-2-2019-07` = "Policy-Min-TLS-1-2-2019-07".asInstanceOf[TLSSecurityPolicy]

  @inline def values: js.Array[TLSSecurityPolicy] = js.Array(`Policy-Min-TLS-1-0-2019-07`, `Policy-Min-TLS-1-2-2019-07`)
}
