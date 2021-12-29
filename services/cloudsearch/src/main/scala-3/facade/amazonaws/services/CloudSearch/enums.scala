package facade.amazonaws.services.cloudsearch

import scalajs._

type AlgorithmicStemming = "none" | "minimal" | "light" | "full"
object AlgorithmicStemming {
  inline val none: "none" = "none"
  inline val minimal: "minimal" = "minimal"
  inline val light: "light" = "light"
  inline val full: "full" = "full"

  inline def values: js.Array[AlgorithmicStemming] = js.Array(none, minimal, light, full)
}

/** An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF RFC 4646</a> language code or <code>mul</code> for multiple languages.
  */
type AnalysisSchemeLanguage = "ar" | "bg" | "ca" | "cs" | "da" | "de" | "el" | "en" | "es" | "eu" | "fa" | "fi" | "fr" | "ga" | "gl" | "he" | "hi" | "hu" | "hy" | "id" | "it" | "ja" | "ko" | "lv" | "mul" | "nl" | "no" | "pt" | "ro" | "ru" | "sv" | "th" | "tr" | "zh-Hans" | "zh-Hant"
object AnalysisSchemeLanguage {
  inline val ar: "ar" = "ar"
  inline val bg: "bg" = "bg"
  inline val ca: "ca" = "ca"
  inline val cs: "cs" = "cs"
  inline val da: "da" = "da"
  inline val de: "de" = "de"
  inline val el: "el" = "el"
  inline val en: "en" = "en"
  inline val es: "es" = "es"
  inline val eu: "eu" = "eu"
  inline val fa: "fa" = "fa"
  inline val fi: "fi" = "fi"
  inline val fr: "fr" = "fr"
  inline val ga: "ga" = "ga"
  inline val gl: "gl" = "gl"
  inline val he: "he" = "he"
  inline val hi: "hi" = "hi"
  inline val hu: "hu" = "hu"
  inline val hy: "hy" = "hy"
  inline val id: "id" = "id"
  inline val it: "it" = "it"
  inline val ja: "ja" = "ja"
  inline val ko: "ko" = "ko"
  inline val lv: "lv" = "lv"
  inline val mul: "mul" = "mul"
  inline val nl: "nl" = "nl"
  inline val no: "no" = "no"
  inline val pt: "pt" = "pt"
  inline val ro: "ro" = "ro"
  inline val ru: "ru" = "ru"
  inline val sv: "sv" = "sv"
  inline val th: "th" = "th"
  inline val tr: "tr" = "tr"
  inline val `zh-Hans`: "zh-Hans" = "zh-Hans"
  inline val `zh-Hant`: "zh-Hant" = "zh-Hant"

  inline def values: js.Array[AnalysisSchemeLanguage] = js.Array(ar, bg, ca, cs, da, de, el, en, es, eu, fa, fi, fr, ga, gl, he, hi, hu, hy, id, it, ja, ko, lv, mul, nl, no, pt, ro, ru, sv, th, tr, `zh-Hans`, `zh-Hant`)
}

/** The type of field. The valid options for a field depend on the field type. For more information about the supported field types, see <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html" target="_blank">Configuring Index Fields</a> in the <i>Amazon CloudSearch Developer Guide</i>.
  */
type IndexFieldType = "int" | "double" | "literal" | "text" | "date" | "latlon" | "int-array" | "double-array" | "literal-array" | "text-array" | "date-array"
object IndexFieldType {
  inline val int: "int" = "int"
  inline val double: "double" = "double"
  inline val literal: "literal" = "literal"
  inline val text: "text" = "text"
  inline val date: "date" = "date"
  inline val latlon: "latlon" = "latlon"
  inline val `int-array`: "int-array" = "int-array"
  inline val `double-array`: "double-array" = "double-array"
  inline val `literal-array`: "literal-array" = "literal-array"
  inline val `text-array`: "text-array" = "text-array"
  inline val `date-array`: "date-array" = "date-array"

  inline def values: js.Array[IndexFieldType] = js.Array(int, double, literal, text, date, latlon, `int-array`, `double-array`, `literal-array`, `text-array`, `date-array`)
}

/** The state of processing a change to an option. One of: * RequiresIndexDocuments: The option's latest value will not be deployed until <a>IndexDocuments</a> has been called and indexing is complete. * Processing: The option's latest value is in the process of being activated. * Active: The option's latest value is fully deployed. * FailedToValidate: The option value is not compatible with the domain's data and cannot be used to index the data. You must either modify the option value or update or remove the incompatible documents.
  */
type OptionState = "RequiresIndexDocuments" | "Processing" | "Active" | "FailedToValidate"
object OptionState {
  inline val RequiresIndexDocuments: "RequiresIndexDocuments" = "RequiresIndexDocuments"
  inline val Processing: "Processing" = "Processing"
  inline val Active: "Active" = "Active"
  inline val FailedToValidate: "FailedToValidate" = "FailedToValidate"

  inline def values: js.Array[OptionState] = js.Array(RequiresIndexDocuments, Processing, Active, FailedToValidate)
}

/** The instance type (such as <code>search.m1.small</code>) on which an index partition is hosted.
  */
type PartitionInstanceType = "search.m1.small" | "search.m1.large" | "search.m2.xlarge" | "search.m2.2xlarge" | "search.m3.medium" | "search.m3.large" | "search.m3.xlarge" | "search.m3.2xlarge" | "search.small" | "search.medium" | "search.large" | "search.xlarge" | "search.2xlarge"
object PartitionInstanceType {
  inline val `search.m1.small`: "search.m1.small" = "search.m1.small"
  inline val `search.m1.large`: "search.m1.large" = "search.m1.large"
  inline val `search.m2.xlarge`: "search.m2.xlarge" = "search.m2.xlarge"
  inline val `search.m2.2xlarge`: "search.m2.2xlarge" = "search.m2.2xlarge"
  inline val `search.m3.medium`: "search.m3.medium" = "search.m3.medium"
  inline val `search.m3.large`: "search.m3.large" = "search.m3.large"
  inline val `search.m3.xlarge`: "search.m3.xlarge" = "search.m3.xlarge"
  inline val `search.m3.2xlarge`: "search.m3.2xlarge" = "search.m3.2xlarge"
  inline val `search.small`: "search.small" = "search.small"
  inline val `search.medium`: "search.medium" = "search.medium"
  inline val `search.large`: "search.large" = "search.large"
  inline val `search.xlarge`: "search.xlarge" = "search.xlarge"
  inline val `search.2xlarge`: "search.2xlarge" = "search.2xlarge"

  inline def values: js.Array[PartitionInstanceType] = js.Array(
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
  inline val none: "none" = "none"
  inline val low: "low" = "low"
  inline val high: "high" = "high"

  inline def values: js.Array[SuggesterFuzzyMatching] = js.Array(none, low, high)
}

/** The minimum required TLS version.
  */
type TLSSecurityPolicy = "Policy-Min-TLS-1-0-2019-07" | "Policy-Min-TLS-1-2-2019-07"
object TLSSecurityPolicy {
  inline val `Policy-Min-TLS-1-0-2019-07`: "Policy-Min-TLS-1-0-2019-07" = "Policy-Min-TLS-1-0-2019-07"
  inline val `Policy-Min-TLS-1-2-2019-07`: "Policy-Min-TLS-1-2-2019-07" = "Policy-Min-TLS-1-2-2019-07"

  inline def values: js.Array[TLSSecurityPolicy] = js.Array(`Policy-Min-TLS-1-0-2019-07`, `Policy-Min-TLS-1-2-2019-07`)
}
