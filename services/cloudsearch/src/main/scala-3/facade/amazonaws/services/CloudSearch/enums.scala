package facade.amazonaws.services.cloudsearch

import scalajs._

type AlgorithmicStemming = "none" | "minimal" | "light" | "full"
object AlgorithmicStemming {
  val none: "none" = "none"
  val minimal: "minimal" = "minimal"
  val light: "light" = "light"
  val full: "full" = "full"

  @inline def values = js.Array[AlgorithmicStemming](none, minimal, light, full)
}

/** An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF RFC 4646</a> language code or <code>mul</code> for multiple languages.
  */
type AnalysisSchemeLanguage = "ar" | "bg" | "ca" | "cs" | "da" | "de" | "el" | "en" | "es" | "eu" | "fa" | "fi" | "fr" | "ga" | "gl" | "he" | "hi" | "hu" | "hy" | "id" | "it" | "ja" | "ko" | "lv" | "mul" | "nl" | "no" | "pt" | "ro" | "ru" | "sv" | "th" | "tr" | "zh-Hans" | "zh-Hant"
object AnalysisSchemeLanguage {
  val ar: "ar" = "ar"
  val bg: "bg" = "bg"
  val ca: "ca" = "ca"
  val cs: "cs" = "cs"
  val da: "da" = "da"
  val de: "de" = "de"
  val el: "el" = "el"
  val en: "en" = "en"
  val es: "es" = "es"
  val eu: "eu" = "eu"
  val fa: "fa" = "fa"
  val fi: "fi" = "fi"
  val fr: "fr" = "fr"
  val ga: "ga" = "ga"
  val gl: "gl" = "gl"
  val he: "he" = "he"
  val hi: "hi" = "hi"
  val hu: "hu" = "hu"
  val hy: "hy" = "hy"
  val id: "id" = "id"
  val it: "it" = "it"
  val ja: "ja" = "ja"
  val ko: "ko" = "ko"
  val lv: "lv" = "lv"
  val mul: "mul" = "mul"
  val nl: "nl" = "nl"
  val no: "no" = "no"
  val pt: "pt" = "pt"
  val ro: "ro" = "ro"
  val ru: "ru" = "ru"
  val sv: "sv" = "sv"
  val th: "th" = "th"
  val tr: "tr" = "tr"
  val `zh-Hans`: "zh-Hans" = "zh-Hans"
  val `zh-Hant`: "zh-Hant" = "zh-Hant"

  @inline def values = js.Array[AnalysisSchemeLanguage](ar, bg, ca, cs, da, de, el, en, es, eu, fa, fi, fr, ga, gl, he, hi, hu, hy, id, it, ja, ko, lv, mul, nl, no, pt, ro, ru, sv, th, tr, `zh-Hans`, `zh-Hant`)
}

/** The type of field. The valid options for a field depend on the field type. For more information about the supported field types, see <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html" target="_blank">Configuring Index Fields</a> in the <i>Amazon CloudSearch Developer Guide</i>.
  */
type IndexFieldType = "int" | "double" | "literal" | "text" | "date" | "latlon" | "int-array" | "double-array" | "literal-array" | "text-array" | "date-array"
object IndexFieldType {
  val int: "int" = "int"
  val double: "double" = "double"
  val literal: "literal" = "literal"
  val text: "text" = "text"
  val date: "date" = "date"
  val latlon: "latlon" = "latlon"
  val `int-array`: "int-array" = "int-array"
  val `double-array`: "double-array" = "double-array"
  val `literal-array`: "literal-array" = "literal-array"
  val `text-array`: "text-array" = "text-array"
  val `date-array`: "date-array" = "date-array"

  @inline def values = js.Array[IndexFieldType](int, double, literal, text, date, latlon, `int-array`, `double-array`, `literal-array`, `text-array`, `date-array`)
}

/** The state of processing a change to an option. One of: * RequiresIndexDocuments: The option's latest value will not be deployed until <a>IndexDocuments</a> has been called and indexing is complete. * Processing: The option's latest value is in the process of being activated. * Active: The option's latest value is fully deployed. * FailedToValidate: The option value is not compatible with the domain's data and cannot be used to index the data. You must either modify the option value or update or remove the incompatible documents.
  */
type OptionState = "RequiresIndexDocuments" | "Processing" | "Active" | "FailedToValidate"
object OptionState {
  val RequiresIndexDocuments: "RequiresIndexDocuments" = "RequiresIndexDocuments"
  val Processing: "Processing" = "Processing"
  val Active: "Active" = "Active"
  val FailedToValidate: "FailedToValidate" = "FailedToValidate"

  @inline def values = js.Array[OptionState](RequiresIndexDocuments, Processing, Active, FailedToValidate)
}

/** The instance type (such as <code>search.m1.small</code>) on which an index partition is hosted.
  */
type PartitionInstanceType = "search.m1.small" | "search.m1.large" | "search.m2.xlarge" | "search.m2.2xlarge" | "search.m3.medium" | "search.m3.large" | "search.m3.xlarge" | "search.m3.2xlarge" | "search.small" | "search.medium" | "search.large" | "search.xlarge" | "search.2xlarge"
object PartitionInstanceType {
  val `search.m1.small`: "search.m1.small" = "search.m1.small"
  val `search.m1.large`: "search.m1.large" = "search.m1.large"
  val `search.m2.xlarge`: "search.m2.xlarge" = "search.m2.xlarge"
  val `search.m2.2xlarge`: "search.m2.2xlarge" = "search.m2.2xlarge"
  val `search.m3.medium`: "search.m3.medium" = "search.m3.medium"
  val `search.m3.large`: "search.m3.large" = "search.m3.large"
  val `search.m3.xlarge`: "search.m3.xlarge" = "search.m3.xlarge"
  val `search.m3.2xlarge`: "search.m3.2xlarge" = "search.m3.2xlarge"
  val `search.small`: "search.small" = "search.small"
  val `search.medium`: "search.medium" = "search.medium"
  val `search.large`: "search.large" = "search.large"
  val `search.xlarge`: "search.xlarge" = "search.xlarge"
  val `search.2xlarge`: "search.2xlarge" = "search.2xlarge"

  @inline def values = js.Array[PartitionInstanceType](
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

type SuggesterFuzzyMatching = "none" | "low" | "high"
object SuggesterFuzzyMatching {
  val none: "none" = "none"
  val low: "low" = "low"
  val high: "high" = "high"

  @inline def values = js.Array[SuggesterFuzzyMatching](none, low, high)
}

/** The minimum required TLS version.
  */
type TLSSecurityPolicy = "Policy-Min-TLS-1-0-2019-07" | "Policy-Min-TLS-1-2-2019-07"
object TLSSecurityPolicy {
  val `Policy-Min-TLS-1-0-2019-07`: "Policy-Min-TLS-1-0-2019-07" = "Policy-Min-TLS-1-0-2019-07"
  val `Policy-Min-TLS-1-2-2019-07`: "Policy-Min-TLS-1-2-2019-07" = "Policy-Min-TLS-1-2-2019-07"

  @inline def values = js.Array[TLSSecurityPolicy](`Policy-Min-TLS-1-0-2019-07`, `Policy-Min-TLS-1-2-2019-07`)
}
