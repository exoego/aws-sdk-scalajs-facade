package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object cloudsearch {
  type APIVersion = String
  type ARN = String
  type AlgorithmicStemming = String
  type AnalysisSchemeLanguage = String
  type AnalysisSchemeStatusList = js.Array[AnalysisSchemeStatus]
  type DomainId = String
  type DomainName = String
  type DomainNameList = js.Array[DomainName]
  type DomainNameMap = js.Dictionary[APIVersion]
  type DomainStatusList = js.Array[DomainStatus]
  type DynamicFieldName = String
  type DynamicFieldNameList = js.Array[DynamicFieldName]
  type ErrorCode = String
  type ErrorMessage = String
  type ExpressionStatusList = js.Array[ExpressionStatus]
  type ExpressionValue = String
  type FieldName = String
  type FieldNameCommaList = String
  type FieldNameList = js.Array[FieldName]
  type FieldValue = String
  type IndexFieldStatusList = js.Array[IndexFieldStatus]
  type IndexFieldType = String
  type InstanceCount = Integer
  type MaximumPartitionCount = Integer
  type MaximumReplicationCount = Integer
  type MultiAZ = Boolean
  type OptionState = String
  type PartitionCount = Integer
  type PartitionInstanceType = String
  type PolicyDocument = String
  type SearchInstanceType = String
  type ServiceUrl = String
  type StandardName = String
  type StandardNameList = js.Array[StandardName]
  type SuggesterFuzzyMatching = String
  type SuggesterStatusList = js.Array[SuggesterStatus]
  type UIntValue = Integer
  type UpdateTimestamp = js.Date
  type Word = String
}

package cloudsearch {
  @js.native
  trait Cloudsearch extends js.Object {
    def buildSuggesters(params: BuildSuggestersRequest, callback: Callback[BuildSuggestersResponse]): Unit = js.native
    def buildSuggesters(params: BuildSuggestersRequest): Request[BuildSuggestersResponse] = js.native
    def createDomain(params: CreateDomainRequest, callback: Callback[CreateDomainResponse]): Unit = js.native
    def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse] = js.native
    def defineAnalysisScheme(params: DefineAnalysisSchemeRequest, callback: Callback[DefineAnalysisSchemeResponse]): Unit = js.native
    def defineAnalysisScheme(params: DefineAnalysisSchemeRequest): Request[DefineAnalysisSchemeResponse] = js.native
    def defineExpression(params: DefineExpressionRequest, callback: Callback[DefineExpressionResponse]): Unit = js.native
    def defineExpression(params: DefineExpressionRequest): Request[DefineExpressionResponse] = js.native
    def defineIndexField(params: DefineIndexFieldRequest, callback: Callback[DefineIndexFieldResponse]): Unit = js.native
    def defineIndexField(params: DefineIndexFieldRequest): Request[DefineIndexFieldResponse] = js.native
    def defineSuggester(params: DefineSuggesterRequest, callback: Callback[DefineSuggesterResponse]): Unit = js.native
    def defineSuggester(params: DefineSuggesterRequest): Request[DefineSuggesterResponse] = js.native
    def deleteAnalysisScheme(params: DeleteAnalysisSchemeRequest, callback: Callback[DeleteAnalysisSchemeResponse]): Unit = js.native
    def deleteAnalysisScheme(params: DeleteAnalysisSchemeRequest): Request[DeleteAnalysisSchemeResponse] = js.native
    def deleteDomain(params: DeleteDomainRequest, callback: Callback[DeleteDomainResponse]): Unit = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResponse] = js.native
    def deleteExpression(params: DeleteExpressionRequest, callback: Callback[DeleteExpressionResponse]): Unit = js.native
    def deleteExpression(params: DeleteExpressionRequest): Request[DeleteExpressionResponse] = js.native
    def deleteIndexField(params: DeleteIndexFieldRequest, callback: Callback[DeleteIndexFieldResponse]): Unit = js.native
    def deleteIndexField(params: DeleteIndexFieldRequest): Request[DeleteIndexFieldResponse] = js.native
    def deleteSuggester(params: DeleteSuggesterRequest, callback: Callback[DeleteSuggesterResponse]): Unit = js.native
    def deleteSuggester(params: DeleteSuggesterRequest): Request[DeleteSuggesterResponse] = js.native
    def describeAnalysisSchemes(params: DescribeAnalysisSchemesRequest, callback: Callback[DescribeAnalysisSchemesResponse]): Unit = js.native
    def describeAnalysisSchemes(params: DescribeAnalysisSchemesRequest): Request[DescribeAnalysisSchemesResponse] = js.native
    def describeAvailabilityOptions(params: DescribeAvailabilityOptionsRequest, callback: Callback[DescribeAvailabilityOptionsResponse]): Unit = js.native
    def describeAvailabilityOptions(params: DescribeAvailabilityOptionsRequest): Request[DescribeAvailabilityOptionsResponse] = js.native
    def describeDomains(params: DescribeDomainsRequest, callback: Callback[DescribeDomainsResponse]): Unit = js.native
    def describeDomains(params: DescribeDomainsRequest): Request[DescribeDomainsResponse] = js.native
    def describeExpressions(params: DescribeExpressionsRequest, callback: Callback[DescribeExpressionsResponse]): Unit = js.native
    def describeExpressions(params: DescribeExpressionsRequest): Request[DescribeExpressionsResponse] = js.native
    def describeIndexFields(params: DescribeIndexFieldsRequest, callback: Callback[DescribeIndexFieldsResponse]): Unit = js.native
    def describeIndexFields(params: DescribeIndexFieldsRequest): Request[DescribeIndexFieldsResponse] = js.native
    def describeScalingParameters(params: DescribeScalingParametersRequest, callback: Callback[DescribeScalingParametersResponse]): Unit = js.native
    def describeScalingParameters(params: DescribeScalingParametersRequest): Request[DescribeScalingParametersResponse] = js.native
    def describeServiceAccessPolicies(params: DescribeServiceAccessPoliciesRequest, callback: Callback[DescribeServiceAccessPoliciesResponse]): Unit = js.native
    def describeServiceAccessPolicies(params: DescribeServiceAccessPoliciesRequest): Request[DescribeServiceAccessPoliciesResponse] = js.native
    def describeSuggesters(params: DescribeSuggestersRequest, callback: Callback[DescribeSuggestersResponse]): Unit = js.native
    def describeSuggesters(params: DescribeSuggestersRequest): Request[DescribeSuggestersResponse] = js.native
    def indexDocuments(params: IndexDocumentsRequest, callback: Callback[IndexDocumentsResponse]): Unit = js.native
    def indexDocuments(params: IndexDocumentsRequest): Request[IndexDocumentsResponse] = js.native
    def listDomainNames(callback: Callback[ListDomainNamesResponse]): Unit = js.native
    def listDomainNames(): Request[ListDomainNamesResponse] = js.native
    def updateAvailabilityOptions(params: UpdateAvailabilityOptionsRequest, callback: Callback[UpdateAvailabilityOptionsResponse]): Unit = js.native
    def updateAvailabilityOptions(params: UpdateAvailabilityOptionsRequest): Request[UpdateAvailabilityOptionsResponse] = js.native
    def updateScalingParameters(params: UpdateScalingParametersRequest, callback: Callback[UpdateScalingParametersResponse]): Unit = js.native
    def updateScalingParameters(params: UpdateScalingParametersRequest): Request[UpdateScalingParametersResponse] = js.native
    def updateServiceAccessPolicies(params: UpdateServiceAccessPoliciesRequest, callback: Callback[UpdateServiceAccessPoliciesResponse]): Unit = js.native
    def updateServiceAccessPolicies(params: UpdateServiceAccessPoliciesRequest): Request[UpdateServiceAccessPoliciesResponse] = js.native
  }

  /**
   * <p>The configured access rules for the domain's document and search endpoints, and the current status of those rules.</p>
   */
  @js.native
  trait AccessPoliciesStatus extends js.Object {
    var Options: PolicyDocument
    var Status: OptionStatus
  }

  object AccessPoliciesStatus {
    def apply(
      Options: js.UndefOr[PolicyDocument] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined
    ): AccessPoliciesStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Options" -> Options.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessPoliciesStatus]
    }
  }


  object AlgorithmicStemmingEnum {
    val none = "none"
    val minimal = "minimal"
    val light = "light"
    val full = "full"

    val values = IndexedSeq(none, minimal, light, full)
  }

  /**
   * <p>Synonyms, stopwords, and stemming options for an analysis scheme. Includes tokenization dictionary for Japanese.</p>
   */
  @js.native
  trait AnalysisOptions extends js.Object {
    var Stopwords: String
    var StemmingDictionary: String
    var JapaneseTokenizationDictionary: String
    var AlgorithmicStemming: AlgorithmicStemming
    var Synonyms: String
  }

  object AnalysisOptions {
    def apply(
      Stopwords: js.UndefOr[String] = js.undefined,
      StemmingDictionary: js.UndefOr[String] = js.undefined,
      JapaneseTokenizationDictionary: js.UndefOr[String] = js.undefined,
      AlgorithmicStemming: js.UndefOr[AlgorithmicStemming] = js.undefined,
      Synonyms: js.UndefOr[String] = js.undefined
    ): AnalysisOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Stopwords" -> Stopwords.map { x => x: js.Any }),
        ("StemmingDictionary" -> StemmingDictionary.map { x => x: js.Any }),
        ("JapaneseTokenizationDictionary" -> JapaneseTokenizationDictionary.map { x => x: js.Any }),
        ("AlgorithmicStemming" -> AlgorithmicStemming.map { x => x: js.Any }),
        ("Synonyms" -> Synonyms.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnalysisOptions]
    }
  }

  /**
   * <p>Configuration information for an analysis scheme. Each analysis scheme has a unique name and specifies the language of the text to be processed. The following options can be configured for an analysis scheme: <code>Synonyms</code>, <code>Stopwords</code>, <code>StemmingDictionary</code>, <code>JapaneseTokenizationDictionary</code> and <code>AlgorithmicStemming</code>.</p>
   */
  @js.native
  trait AnalysisScheme extends js.Object {
    var AnalysisSchemeName: StandardName
    var AnalysisSchemeLanguage: AnalysisSchemeLanguage
    var AnalysisOptions: AnalysisOptions
  }

  object AnalysisScheme {
    def apply(
      AnalysisSchemeName: js.UndefOr[StandardName] = js.undefined,
      AnalysisSchemeLanguage: js.UndefOr[AnalysisSchemeLanguage] = js.undefined,
      AnalysisOptions: js.UndefOr[AnalysisOptions] = js.undefined
    ): AnalysisScheme = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AnalysisSchemeName" -> AnalysisSchemeName.map { x => x: js.Any }),
        ("AnalysisSchemeLanguage" -> AnalysisSchemeLanguage.map { x => x: js.Any }),
        ("AnalysisOptions" -> AnalysisOptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnalysisScheme]
    }
  }

  /**
   * <p>An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF RFC 4646</a> language code or <code>mul</code> for multiple languages.</p>
   */
  object AnalysisSchemeLanguageEnum {
    val ar = "ar"
    val bg = "bg"
    val ca = "ca"
    val cs = "cs"
    val da = "da"
    val de = "de"
    val el = "el"
    val en = "en"
    val es = "es"
    val eu = "eu"
    val fa = "fa"
    val fi = "fi"
    val fr = "fr"
    val ga = "ga"
    val gl = "gl"
    val he = "he"
    val hi = "hi"
    val hu = "hu"
    val hy = "hy"
    val id = "id"
    val it = "it"
    val ja = "ja"
    val ko = "ko"
    val lv = "lv"
    val mul = "mul"
    val nl = "nl"
    val no = "no"
    val pt = "pt"
    val ro = "ro"
    val ru = "ru"
    val sv = "sv"
    val th = "th"
    val tr = "tr"
    val `zh-Hans` = "zh-Hans"
    val `zh-Hant` = "zh-Hant"

    val values = IndexedSeq(ar, bg, ca, cs, da, de, el, en, es, eu, fa, fi, fr, ga, gl, he, hi, hu, hy, id, it, ja, ko, lv, mul, nl, no, pt, ro, ru, sv, th, tr, `zh-Hans`, `zh-Hant`)
  }

  /**
   * <p>The status and configuration of an <code>AnalysisScheme</code>.</p>
   */
  @js.native
  trait AnalysisSchemeStatus extends js.Object {
    var Options: AnalysisScheme
    var Status: OptionStatus
  }

  object AnalysisSchemeStatus {
    def apply(
      Options: js.UndefOr[AnalysisScheme] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined
    ): AnalysisSchemeStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Options" -> Options.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnalysisSchemeStatus]
    }
  }

  /**
   * <p>The status and configuration of the domain's availability options.</p>
   */
  @js.native
  trait AvailabilityOptionsStatus extends js.Object {
    var Options: MultiAZ
    var Status: OptionStatus
  }

  object AvailabilityOptionsStatus {
    def apply(
      Options: js.UndefOr[MultiAZ] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined
    ): AvailabilityOptionsStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Options" -> Options.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityOptionsStatus]
    }
  }

  /**
   * <p>An error occurred while processing the request.</p>
   */
  @js.native
  trait BaseExceptionException extends js.Object {
    var Code: ErrorCode
    var Message: ErrorMessage
  }

  /**
   * <p>Container for the parameters to the <code><a>BuildSuggester</a></code> operation. Specifies the name of the domain you want to update.</p>
   */
  @js.native
  trait BuildSuggestersRequest extends js.Object {
    var DomainName: DomainName
  }

  object BuildSuggestersRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined
    ): BuildSuggestersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BuildSuggestersRequest]
    }
  }

  /**
   * <p>The result of a <code>BuildSuggester</code> request. Contains a list of the fields used for suggestions.</p>
   */
  @js.native
  trait BuildSuggestersResponse extends js.Object {
    var FieldNames: FieldNameList
  }

  object BuildSuggestersResponse {
    def apply(
      FieldNames: js.UndefOr[FieldNameList] = js.undefined
    ): BuildSuggestersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FieldNames" -> FieldNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BuildSuggestersResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>CreateDomain</a></code> operation. Specifies a name for the new search domain.</p>
   */
  @js.native
  trait CreateDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object CreateDomainRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined
    ): CreateDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainRequest]
    }
  }

  /**
   * <p>The result of a <code>CreateDomainRequest</code>. Contains the status of a newly created domain.</p>
   */
  @js.native
  trait CreateDomainResponse extends js.Object {
    var DomainStatus: DomainStatus
  }

  object CreateDomainResponse {
    def apply(
      DomainStatus: js.UndefOr[DomainStatus] = js.undefined
    ): CreateDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainStatus" -> DomainStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainResponse]
    }
  }

  /**
   * <p>Options for a field that contains an array of dates. Present if <code>IndexFieldType</code> specifies the field is of type <code>date-array</code>. All options are enabled by default.</p>
   */
  @js.native
  trait DateArrayOptions extends js.Object {
    var SearchEnabled: Boolean
    var FacetEnabled: Boolean
    var DefaultValue: FieldValue
    var SourceFields: FieldNameCommaList
    var ReturnEnabled: Boolean
  }

  object DateArrayOptions {
    def apply(
      SearchEnabled: js.UndefOr[Boolean] = js.undefined,
      FacetEnabled: js.UndefOr[Boolean] = js.undefined,
      DefaultValue: js.UndefOr[FieldValue] = js.undefined,
      SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined,
      ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    ): DateArrayOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SearchEnabled" -> SearchEnabled.map { x => x: js.Any }),
        ("FacetEnabled" -> FacetEnabled.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("SourceFields" -> SourceFields.map { x => x: js.Any }),
        ("ReturnEnabled" -> ReturnEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DateArrayOptions]
    }
  }

  /**
   * <p>Options for a date field. Dates and times are specified in UTC (Coordinated Universal Time) according to IETF RFC3339: yyyy-mm-ddT00:00:00Z. Present if <code>IndexFieldType</code> specifies the field is of type <code>date</code>. All options are enabled by default.</p>
   */
  @js.native
  trait DateOptions extends js.Object {
    var SearchEnabled: Boolean
    var SourceField: FieldName
    var FacetEnabled: Boolean
    var SortEnabled: Boolean
    var DefaultValue: FieldValue
    var ReturnEnabled: Boolean
  }

  object DateOptions {
    def apply(
      SearchEnabled: js.UndefOr[Boolean] = js.undefined,
      SourceField: js.UndefOr[FieldName] = js.undefined,
      FacetEnabled: js.UndefOr[Boolean] = js.undefined,
      SortEnabled: js.UndefOr[Boolean] = js.undefined,
      DefaultValue: js.UndefOr[FieldValue] = js.undefined,
      ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    ): DateOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SearchEnabled" -> SearchEnabled.map { x => x: js.Any }),
        ("SourceField" -> SourceField.map { x => x: js.Any }),
        ("FacetEnabled" -> FacetEnabled.map { x => x: js.Any }),
        ("SortEnabled" -> SortEnabled.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("ReturnEnabled" -> ReturnEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DateOptions]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DefineAnalysisScheme</a></code> operation. Specifies the name of the domain you want to update and the analysis scheme configuration.</p>
   */
  @js.native
  trait DefineAnalysisSchemeRequest extends js.Object {
    var DomainName: DomainName
    var AnalysisScheme: AnalysisScheme
  }

  object DefineAnalysisSchemeRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      AnalysisScheme: js.UndefOr[AnalysisScheme] = js.undefined
    ): DefineAnalysisSchemeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("AnalysisScheme" -> AnalysisScheme.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefineAnalysisSchemeRequest]
    }
  }

  /**
   * <p>The result of a <code><a>DefineAnalysisScheme</a></code> request. Contains the status of the newly-configured analysis scheme.</p>
   */
  @js.native
  trait DefineAnalysisSchemeResponse extends js.Object {
    var AnalysisScheme: AnalysisSchemeStatus
  }

  object DefineAnalysisSchemeResponse {
    def apply(
      AnalysisScheme: js.UndefOr[AnalysisSchemeStatus] = js.undefined
    ): DefineAnalysisSchemeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AnalysisScheme" -> AnalysisScheme.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefineAnalysisSchemeResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DefineExpression</a></code> operation. Specifies the name of the domain you want to update and the expression you want to configure.</p>
   */
  @js.native
  trait DefineExpressionRequest extends js.Object {
    var DomainName: DomainName
    var Expression: Expression
  }

  object DefineExpressionRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      Expression: js.UndefOr[Expression] = js.undefined
    ): DefineExpressionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("Expression" -> Expression.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefineExpressionRequest]
    }
  }

  /**
   * <p>The result of a <code>DefineExpression</code> request. Contains the status of the newly-configured expression.</p>
   */
  @js.native
  trait DefineExpressionResponse extends js.Object {
    var Expression: ExpressionStatus
  }

  object DefineExpressionResponse {
    def apply(
      Expression: js.UndefOr[ExpressionStatus] = js.undefined
    ): DefineExpressionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Expression" -> Expression.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefineExpressionResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DefineIndexField</a></code> operation. Specifies the name of the domain you want to update and the index field configuration.</p>
   */
  @js.native
  trait DefineIndexFieldRequest extends js.Object {
    var DomainName: DomainName
    var IndexField: IndexField
  }

  object DefineIndexFieldRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      IndexField: js.UndefOr[IndexField] = js.undefined
    ): DefineIndexFieldRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("IndexField" -> IndexField.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefineIndexFieldRequest]
    }
  }

  /**
   * <p>The result of a <code><a>DefineIndexField</a></code> request. Contains the status of the newly-configured index field.</p>
   */
  @js.native
  trait DefineIndexFieldResponse extends js.Object {
    var IndexField: IndexFieldStatus
  }

  object DefineIndexFieldResponse {
    def apply(
      IndexField: js.UndefOr[IndexFieldStatus] = js.undefined
    ): DefineIndexFieldResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IndexField" -> IndexField.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefineIndexFieldResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DefineSuggester</a></code> operation. Specifies the name of the domain you want to update and the suggester configuration.</p>
   */
  @js.native
  trait DefineSuggesterRequest extends js.Object {
    var DomainName: DomainName
    var Suggester: Suggester
  }

  object DefineSuggesterRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      Suggester: js.UndefOr[Suggester] = js.undefined
    ): DefineSuggesterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("Suggester" -> Suggester.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefineSuggesterRequest]
    }
  }

  /**
   * <p>The result of a <code>DefineSuggester</code> request. Contains the status of the newly-configured suggester.</p>
   */
  @js.native
  trait DefineSuggesterResponse extends js.Object {
    var Suggester: SuggesterStatus
  }

  object DefineSuggesterResponse {
    def apply(
      Suggester: js.UndefOr[SuggesterStatus] = js.undefined
    ): DefineSuggesterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Suggester" -> Suggester.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefineSuggesterResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DeleteAnalysisScheme</a></code> operation. Specifies the name of the domain you want to update and the analysis scheme you want to delete. </p>
   */
  @js.native
  trait DeleteAnalysisSchemeRequest extends js.Object {
    var DomainName: DomainName
    var AnalysisSchemeName: StandardName
  }

  object DeleteAnalysisSchemeRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      AnalysisSchemeName: js.UndefOr[StandardName] = js.undefined
    ): DeleteAnalysisSchemeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("AnalysisSchemeName" -> AnalysisSchemeName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAnalysisSchemeRequest]
    }
  }

  /**
   * <p>The result of a <code>DeleteAnalysisScheme</code> request. Contains the status of the deleted analysis scheme.</p>
   */
  @js.native
  trait DeleteAnalysisSchemeResponse extends js.Object {
    var AnalysisScheme: AnalysisSchemeStatus
  }

  object DeleteAnalysisSchemeResponse {
    def apply(
      AnalysisScheme: js.UndefOr[AnalysisSchemeStatus] = js.undefined
    ): DeleteAnalysisSchemeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AnalysisScheme" -> AnalysisScheme.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAnalysisSchemeResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DeleteDomain</a></code> operation. Specifies the name of the domain you want to delete.</p>
   */
  @js.native
  trait DeleteDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object DeleteDomainRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined
    ): DeleteDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainRequest]
    }
  }

  /**
   * <p>The result of a <code>DeleteDomain</code> request. Contains the status of a newly deleted domain, or no status if the domain has already been completely deleted.</p>
   */
  @js.native
  trait DeleteDomainResponse extends js.Object {
    var DomainStatus: DomainStatus
  }

  object DeleteDomainResponse {
    def apply(
      DomainStatus: js.UndefOr[DomainStatus] = js.undefined
    ): DeleteDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainStatus" -> DomainStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DeleteExpression</a></code> operation. Specifies the name of the domain you want to update and the name of the expression you want to delete.</p>
   */
  @js.native
  trait DeleteExpressionRequest extends js.Object {
    var DomainName: DomainName
    var ExpressionName: StandardName
  }

  object DeleteExpressionRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      ExpressionName: js.UndefOr[StandardName] = js.undefined
    ): DeleteExpressionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("ExpressionName" -> ExpressionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteExpressionRequest]
    }
  }

  /**
   * <p>The result of a <code><a>DeleteExpression</a></code> request. Specifies the expression being deleted.</p>
   */
  @js.native
  trait DeleteExpressionResponse extends js.Object {
    var Expression: ExpressionStatus
  }

  object DeleteExpressionResponse {
    def apply(
      Expression: js.UndefOr[ExpressionStatus] = js.undefined
    ): DeleteExpressionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Expression" -> Expression.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteExpressionResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DeleteIndexField</a></code> operation. Specifies the name of the domain you want to update and the name of the index field you want to delete.</p>
   */
  @js.native
  trait DeleteIndexFieldRequest extends js.Object {
    var DomainName: DomainName
    var IndexFieldName: DynamicFieldName
  }

  object DeleteIndexFieldRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      IndexFieldName: js.UndefOr[DynamicFieldName] = js.undefined
    ): DeleteIndexFieldRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("IndexFieldName" -> IndexFieldName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIndexFieldRequest]
    }
  }

  /**
   * <p>The result of a <code><a>DeleteIndexField</a></code> request.</p>
   */
  @js.native
  trait DeleteIndexFieldResponse extends js.Object {
    var IndexField: IndexFieldStatus
  }

  object DeleteIndexFieldResponse {
    def apply(
      IndexField: js.UndefOr[IndexFieldStatus] = js.undefined
    ): DeleteIndexFieldResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IndexField" -> IndexField.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIndexFieldResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DeleteSuggester</a></code> operation. Specifies the name of the domain you want to update and name of the suggester you want to delete.</p>
   */
  @js.native
  trait DeleteSuggesterRequest extends js.Object {
    var DomainName: DomainName
    var SuggesterName: StandardName
  }

  object DeleteSuggesterRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      SuggesterName: js.UndefOr[StandardName] = js.undefined
    ): DeleteSuggesterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("SuggesterName" -> SuggesterName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSuggesterRequest]
    }
  }

  /**
   * <p>The result of a <code>DeleteSuggester</code> request. Contains the status of the deleted suggester.</p>
   */
  @js.native
  trait DeleteSuggesterResponse extends js.Object {
    var Suggester: SuggesterStatus
  }

  object DeleteSuggesterResponse {
    def apply(
      Suggester: js.UndefOr[SuggesterStatus] = js.undefined
    ): DeleteSuggesterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Suggester" -> Suggester.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSuggesterResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DescribeAnalysisSchemes</a></code> operation. Specifies the name of the domain you want to describe. To limit the response to particular analysis schemes, specify the names of the analysis schemes you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>. </p>
   */
  @js.native
  trait DescribeAnalysisSchemesRequest extends js.Object {
    var DomainName: DomainName
    var AnalysisSchemeNames: StandardNameList
    var Deployed: Boolean
  }

  object DescribeAnalysisSchemesRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      AnalysisSchemeNames: js.UndefOr[StandardNameList] = js.undefined,
      Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeAnalysisSchemesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("AnalysisSchemeNames" -> AnalysisSchemeNames.map { x => x: js.Any }),
        ("Deployed" -> Deployed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAnalysisSchemesRequest]
    }
  }

  /**
   * <p>The result of a <code>DescribeAnalysisSchemes</code> request. Contains the analysis schemes configured for the domain specified in the request.</p>
   */
  @js.native
  trait DescribeAnalysisSchemesResponse extends js.Object {
    var AnalysisSchemes: AnalysisSchemeStatusList
  }

  object DescribeAnalysisSchemesResponse {
    def apply(
      AnalysisSchemes: js.UndefOr[AnalysisSchemeStatusList] = js.undefined
    ): DescribeAnalysisSchemesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AnalysisSchemes" -> AnalysisSchemes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAnalysisSchemesResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DescribeAvailabilityOptions</a></code> operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to <code>true</code>.</p>
   */
  @js.native
  trait DescribeAvailabilityOptionsRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: Boolean
  }

  object DescribeAvailabilityOptionsRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeAvailabilityOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("Deployed" -> Deployed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAvailabilityOptionsRequest]
    }
  }

  /**
   * <p>The result of a <code>DescribeAvailabilityOptions</code> request. Indicates whether or not the Multi-AZ option is enabled for the domain specified in the request. </p>
   */
  @js.native
  trait DescribeAvailabilityOptionsResponse extends js.Object {
    var AvailabilityOptions: AvailabilityOptionsStatus
  }

  object DescribeAvailabilityOptionsResponse {
    def apply(
      AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.undefined
    ): DescribeAvailabilityOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AvailabilityOptions" -> AvailabilityOptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAvailabilityOptionsResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DescribeDomains</a></code> operation. By default shows the status of all domains. To restrict the response to particular domains, specify the names of the domains you want to describe.</p>
   */
  @js.native
  trait DescribeDomainsRequest extends js.Object {
    var DomainNames: DomainNameList
  }

  object DescribeDomainsRequest {
    def apply(
      DomainNames: js.UndefOr[DomainNameList] = js.undefined
    ): DescribeDomainsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainNames" -> DomainNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDomainsRequest]
    }
  }

  /**
   * <p>The result of a <code>DescribeDomains</code> request. Contains the status of the domains specified in the request or all domains owned by the account.</p>
   */
  @js.native
  trait DescribeDomainsResponse extends js.Object {
    var DomainStatusList: DomainStatusList
  }

  object DescribeDomainsResponse {
    def apply(
      DomainStatusList: js.UndefOr[DomainStatusList] = js.undefined
    ): DescribeDomainsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainStatusList" -> DomainStatusList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDomainsResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DescribeDomains</a></code> operation. Specifies the name of the domain you want to describe. To restrict the response to particular expressions, specify the names of the expressions you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.</p>
   */
  @js.native
  trait DescribeExpressionsRequest extends js.Object {
    var DomainName: DomainName
    var ExpressionNames: StandardNameList
    var Deployed: Boolean
  }

  object DescribeExpressionsRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      ExpressionNames: js.UndefOr[StandardNameList] = js.undefined,
      Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeExpressionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("ExpressionNames" -> ExpressionNames.map { x => x: js.Any }),
        ("Deployed" -> Deployed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExpressionsRequest]
    }
  }

  /**
   * <p>The result of a <code>DescribeExpressions</code> request. Contains the expressions configured for the domain specified in the request.</p>
   */
  @js.native
  trait DescribeExpressionsResponse extends js.Object {
    var Expressions: ExpressionStatusList
  }

  object DescribeExpressionsResponse {
    def apply(
      Expressions: js.UndefOr[ExpressionStatusList] = js.undefined
    ): DescribeExpressionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Expressions" -> Expressions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExpressionsResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DescribeIndexFields</a></code> operation. Specifies the name of the domain you want to describe. To restrict the response to particular index fields, specify the names of the index fields you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.</p>
   */
  @js.native
  trait DescribeIndexFieldsRequest extends js.Object {
    var DomainName: DomainName
    var FieldNames: DynamicFieldNameList
    var Deployed: Boolean
  }

  object DescribeIndexFieldsRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      FieldNames: js.UndefOr[DynamicFieldNameList] = js.undefined,
      Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeIndexFieldsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("FieldNames" -> FieldNames.map { x => x: js.Any }),
        ("Deployed" -> Deployed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIndexFieldsRequest]
    }
  }

  /**
   * <p>The result of a <code>DescribeIndexFields</code> request. Contains the index fields configured for the domain specified in the request.</p>
   */
  @js.native
  trait DescribeIndexFieldsResponse extends js.Object {
    var IndexFields: IndexFieldStatusList
  }

  object DescribeIndexFieldsResponse {
    def apply(
      IndexFields: js.UndefOr[IndexFieldStatusList] = js.undefined
    ): DescribeIndexFieldsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IndexFields" -> IndexFields.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIndexFieldsResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DescribeScalingParameters</a></code> operation. Specifies the name of the domain you want to describe. </p>
   */
  @js.native
  trait DescribeScalingParametersRequest extends js.Object {
    var DomainName: DomainName
  }

  object DescribeScalingParametersRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined
    ): DescribeScalingParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingParametersRequest]
    }
  }

  /**
   * <p>The result of a <code>DescribeScalingParameters</code> request. Contains the scaling parameters configured for the domain specified in the request.</p>
   */
  @js.native
  trait DescribeScalingParametersResponse extends js.Object {
    var ScalingParameters: ScalingParametersStatus
  }

  object DescribeScalingParametersResponse {
    def apply(
      ScalingParameters: js.UndefOr[ScalingParametersStatus] = js.undefined
    ): DescribeScalingParametersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ScalingParameters" -> ScalingParameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingParametersResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DescribeServiceAccessPolicies</a></code> operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.</p>
   */
  @js.native
  trait DescribeServiceAccessPoliciesRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: Boolean
  }

  object DescribeServiceAccessPoliciesRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeServiceAccessPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("Deployed" -> Deployed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServiceAccessPoliciesRequest]
    }
  }

  /**
   * <p>The result of a <code>DescribeServiceAccessPolicies</code> request.</p>
   */
  @js.native
  trait DescribeServiceAccessPoliciesResponse extends js.Object {
    var AccessPolicies: AccessPoliciesStatus
  }

  object DescribeServiceAccessPoliciesResponse {
    def apply(
      AccessPolicies: js.UndefOr[AccessPoliciesStatus] = js.undefined
    ): DescribeServiceAccessPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccessPolicies" -> AccessPolicies.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServiceAccessPoliciesResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DescribeSuggester</a></code> operation. Specifies the name of the domain you want to describe. To restrict the response to particular suggesters, specify the names of the suggesters you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.</p>
   */
  @js.native
  trait DescribeSuggestersRequest extends js.Object {
    var DomainName: DomainName
    var SuggesterNames: StandardNameList
    var Deployed: Boolean
  }

  object DescribeSuggestersRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      SuggesterNames: js.UndefOr[StandardNameList] = js.undefined,
      Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeSuggestersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("SuggesterNames" -> SuggesterNames.map { x => x: js.Any }),
        ("Deployed" -> Deployed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSuggestersRequest]
    }
  }

  /**
   * <p>The result of a <code>DescribeSuggesters</code> request.</p>
   */
  @js.native
  trait DescribeSuggestersResponse extends js.Object {
    var Suggesters: SuggesterStatusList
  }

  object DescribeSuggestersResponse {
    def apply(
      Suggesters: js.UndefOr[SuggesterStatusList] = js.undefined
    ): DescribeSuggestersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Suggesters" -> Suggesters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSuggestersResponse]
    }
  }

  /**
   * <p>The request was rejected because it attempted an operation which is not enabled.</p>
   */
  @js.native
  trait DisabledOperationExceptionException extends js.Object {

  }

  /**
   * <p>Options for a search suggester.</p>
   */
  @js.native
  trait DocumentSuggesterOptions extends js.Object {
    var SourceField: FieldName
    var FuzzyMatching: SuggesterFuzzyMatching
    var SortExpression: String
  }

  object DocumentSuggesterOptions {
    def apply(
      SourceField: js.UndefOr[FieldName] = js.undefined,
      FuzzyMatching: js.UndefOr[SuggesterFuzzyMatching] = js.undefined,
      SortExpression: js.UndefOr[String] = js.undefined
    ): DocumentSuggesterOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceField" -> SourceField.map { x => x: js.Any }),
        ("FuzzyMatching" -> FuzzyMatching.map { x => x: js.Any }),
        ("SortExpression" -> SortExpression.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentSuggesterOptions]
    }
  }

  /**
   * <p>The current status of the search domain.</p>
   */
  @js.native
  trait DomainStatus extends js.Object {
    var ARN: ARN
    var Created: Boolean
    var Deleted: Boolean
    var DocService: ServiceEndpoint
    var SearchInstanceType: SearchInstanceType
    var Processing: Boolean
    var SearchInstanceCount: InstanceCount
    var DomainId: DomainId
    var DomainName: DomainName
    var SearchPartitionCount: PartitionCount
    var SearchService: ServiceEndpoint
    var RequiresIndexDocuments: Boolean
    var Limits: Limits
  }

  object DomainStatus {
    def apply(
      ARN: js.UndefOr[ARN] = js.undefined,
      Created: js.UndefOr[Boolean] = js.undefined,
      Deleted: js.UndefOr[Boolean] = js.undefined,
      DocService: js.UndefOr[ServiceEndpoint] = js.undefined,
      SearchInstanceType: js.UndefOr[SearchInstanceType] = js.undefined,
      Processing: js.UndefOr[Boolean] = js.undefined,
      SearchInstanceCount: js.UndefOr[InstanceCount] = js.undefined,
      DomainId: js.UndefOr[DomainId] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      SearchPartitionCount: js.UndefOr[PartitionCount] = js.undefined,
      SearchService: js.UndefOr[ServiceEndpoint] = js.undefined,
      RequiresIndexDocuments: js.UndefOr[Boolean] = js.undefined,
      Limits: js.UndefOr[Limits] = js.undefined
    ): DomainStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ARN" -> ARN.map { x => x: js.Any }),
        ("Created" -> Created.map { x => x: js.Any }),
        ("Deleted" -> Deleted.map { x => x: js.Any }),
        ("DocService" -> DocService.map { x => x: js.Any }),
        ("SearchInstanceType" -> SearchInstanceType.map { x => x: js.Any }),
        ("Processing" -> Processing.map { x => x: js.Any }),
        ("SearchInstanceCount" -> SearchInstanceCount.map { x => x: js.Any }),
        ("DomainId" -> DomainId.map { x => x: js.Any }),
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("SearchPartitionCount" -> SearchPartitionCount.map { x => x: js.Any }),
        ("SearchService" -> SearchService.map { x => x: js.Any }),
        ("RequiresIndexDocuments" -> RequiresIndexDocuments.map { x => x: js.Any }),
        ("Limits" -> Limits.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainStatus]
    }
  }

  /**
   * <p>Options for a field that contains an array of double-precision 64-bit floating point values. Present if <code>IndexFieldType</code> specifies the field is of type <code>double-array</code>. All options are enabled by default.</p>
   */
  @js.native
  trait DoubleArrayOptions extends js.Object {
    var SearchEnabled: Boolean
    var FacetEnabled: Boolean
    var DefaultValue: Double
    var SourceFields: FieldNameCommaList
    var ReturnEnabled: Boolean
  }

  object DoubleArrayOptions {
    def apply(
      SearchEnabled: js.UndefOr[Boolean] = js.undefined,
      FacetEnabled: js.UndefOr[Boolean] = js.undefined,
      DefaultValue: js.UndefOr[Double] = js.undefined,
      SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined,
      ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    ): DoubleArrayOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SearchEnabled" -> SearchEnabled.map { x => x: js.Any }),
        ("FacetEnabled" -> FacetEnabled.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("SourceFields" -> SourceFields.map { x => x: js.Any }),
        ("ReturnEnabled" -> ReturnEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DoubleArrayOptions]
    }
  }

  /**
   * <p>Options for a double-precision 64-bit floating point field. Present if <code>IndexFieldType</code> specifies the field is of type <code>double</code>. All options are enabled by default.</p>
   */
  @js.native
  trait DoubleOptions extends js.Object {
    var SearchEnabled: Boolean
    var SourceField: FieldName
    var FacetEnabled: Boolean
    var SortEnabled: Boolean
    var DefaultValue: Double
    var ReturnEnabled: Boolean
  }

  object DoubleOptions {
    def apply(
      SearchEnabled: js.UndefOr[Boolean] = js.undefined,
      SourceField: js.UndefOr[FieldName] = js.undefined,
      FacetEnabled: js.UndefOr[Boolean] = js.undefined,
      SortEnabled: js.UndefOr[Boolean] = js.undefined,
      DefaultValue: js.UndefOr[Double] = js.undefined,
      ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    ): DoubleOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SearchEnabled" -> SearchEnabled.map { x => x: js.Any }),
        ("SourceField" -> SourceField.map { x => x: js.Any }),
        ("FacetEnabled" -> FacetEnabled.map { x => x: js.Any }),
        ("SortEnabled" -> SortEnabled.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("ReturnEnabled" -> ReturnEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DoubleOptions]
    }
  }

  /**
   * <p>A named expression that can be evaluated at search time. Can be used to sort the search results, define other expressions, or return computed information in the search results. </p>
   */
  @js.native
  trait Expression extends js.Object {
    var ExpressionName: StandardName
    var ExpressionValue: ExpressionValue
  }

  object Expression {
    def apply(
      ExpressionName: js.UndefOr[StandardName] = js.undefined,
      ExpressionValue: js.UndefOr[ExpressionValue] = js.undefined
    ): Expression = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExpressionName" -> ExpressionName.map { x => x: js.Any }),
        ("ExpressionValue" -> ExpressionValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Expression]
    }
  }

  /**
   * <p>The value of an <code>Expression</code> and its current status.</p>
   */
  @js.native
  trait ExpressionStatus extends js.Object {
    var Options: Expression
    var Status: OptionStatus
  }

  object ExpressionStatus {
    def apply(
      Options: js.UndefOr[Expression] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined
    ): ExpressionStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Options" -> Options.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExpressionStatus]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>IndexDocuments</a></code> operation. Specifies the name of the domain you want to re-index.</p>
   */
  @js.native
  trait IndexDocumentsRequest extends js.Object {
    var DomainName: DomainName
  }

  object IndexDocumentsRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined
    ): IndexDocumentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IndexDocumentsRequest]
    }
  }

  /**
   * <p>The result of an <code>IndexDocuments</code> request. Contains the status of the indexing operation, including the fields being indexed.</p>
   */
  @js.native
  trait IndexDocumentsResponse extends js.Object {
    var FieldNames: FieldNameList
  }

  object IndexDocumentsResponse {
    def apply(
      FieldNames: js.UndefOr[FieldNameList] = js.undefined
    ): IndexDocumentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FieldNames" -> FieldNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IndexDocumentsResponse]
    }
  }

  /**
   * <p>Configuration information for a field in the index, including its name, type, and options. The supported options depend on the <code><a>IndexFieldType</a></code>.</p>
   */
  @js.native
  trait IndexField extends js.Object {
    var IntOptions: IntOptions
    var IndexFieldType: IndexFieldType
    var TextOptions: TextOptions
    var LiteralArrayOptions: LiteralArrayOptions
    var DoubleOptions: DoubleOptions
    var DateArrayOptions: DateArrayOptions
    var IntArrayOptions: IntArrayOptions
    var LatLonOptions: LatLonOptions
    var DoubleArrayOptions: DoubleArrayOptions
    var IndexFieldName: DynamicFieldName
    var LiteralOptions: LiteralOptions
    var TextArrayOptions: TextArrayOptions
    var DateOptions: DateOptions
  }

  object IndexField {
    def apply(
      IntOptions: js.UndefOr[IntOptions] = js.undefined,
      IndexFieldType: js.UndefOr[IndexFieldType] = js.undefined,
      TextOptions: js.UndefOr[TextOptions] = js.undefined,
      LiteralArrayOptions: js.UndefOr[LiteralArrayOptions] = js.undefined,
      DoubleOptions: js.UndefOr[DoubleOptions] = js.undefined,
      DateArrayOptions: js.UndefOr[DateArrayOptions] = js.undefined,
      IntArrayOptions: js.UndefOr[IntArrayOptions] = js.undefined,
      LatLonOptions: js.UndefOr[LatLonOptions] = js.undefined,
      DoubleArrayOptions: js.UndefOr[DoubleArrayOptions] = js.undefined,
      IndexFieldName: js.UndefOr[DynamicFieldName] = js.undefined,
      LiteralOptions: js.UndefOr[LiteralOptions] = js.undefined,
      TextArrayOptions: js.UndefOr[TextArrayOptions] = js.undefined,
      DateOptions: js.UndefOr[DateOptions] = js.undefined
    ): IndexField = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IntOptions" -> IntOptions.map { x => x: js.Any }),
        ("IndexFieldType" -> IndexFieldType.map { x => x: js.Any }),
        ("TextOptions" -> TextOptions.map { x => x: js.Any }),
        ("LiteralArrayOptions" -> LiteralArrayOptions.map { x => x: js.Any }),
        ("DoubleOptions" -> DoubleOptions.map { x => x: js.Any }),
        ("DateArrayOptions" -> DateArrayOptions.map { x => x: js.Any }),
        ("IntArrayOptions" -> IntArrayOptions.map { x => x: js.Any }),
        ("LatLonOptions" -> LatLonOptions.map { x => x: js.Any }),
        ("DoubleArrayOptions" -> DoubleArrayOptions.map { x => x: js.Any }),
        ("IndexFieldName" -> IndexFieldName.map { x => x: js.Any }),
        ("LiteralOptions" -> LiteralOptions.map { x => x: js.Any }),
        ("TextArrayOptions" -> TextArrayOptions.map { x => x: js.Any }),
        ("DateOptions" -> DateOptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IndexField]
    }
  }

  /**
   * <p>The value of an <code>IndexField</code> and its current status.</p>
   */
  @js.native
  trait IndexFieldStatus extends js.Object {
    var Options: IndexField
    var Status: OptionStatus
  }

  object IndexFieldStatus {
    def apply(
      Options: js.UndefOr[IndexField] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined
    ): IndexFieldStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Options" -> Options.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IndexFieldStatus]
    }
  }

  /**
   * <p>The type of field. The valid options for a field depend on the field type. For more information about the supported field types, see <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html" target="_blank">Configuring Index Fields</a> in the <i>Amazon CloudSearch Developer Guide</i>.</p>
   */
  object IndexFieldTypeEnum {
    val int = "int"
    val double = "double"
    val literal = "literal"
    val text = "text"
    val date = "date"
    val latlon = "latlon"
    val `int-array` = "int-array"
    val `double-array` = "double-array"
    val `literal-array` = "literal-array"
    val `text-array` = "text-array"
    val `date-array` = "date-array"

    val values = IndexedSeq(int, double, literal, text, date, latlon, `int-array`, `double-array`, `literal-array`, `text-array`, `date-array`)
  }

  /**
   * <p>Options for a field that contains an array of 64-bit signed integers. Present if <code>IndexFieldType</code> specifies the field is of type <code>int-array</code>. All options are enabled by default.</p>
   */
  @js.native
  trait IntArrayOptions extends js.Object {
    var SearchEnabled: Boolean
    var FacetEnabled: Boolean
    var DefaultValue: Long
    var SourceFields: FieldNameCommaList
    var ReturnEnabled: Boolean
  }

  object IntArrayOptions {
    def apply(
      SearchEnabled: js.UndefOr[Boolean] = js.undefined,
      FacetEnabled: js.UndefOr[Boolean] = js.undefined,
      DefaultValue: js.UndefOr[Long] = js.undefined,
      SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined,
      ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    ): IntArrayOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SearchEnabled" -> SearchEnabled.map { x => x: js.Any }),
        ("FacetEnabled" -> FacetEnabled.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("SourceFields" -> SourceFields.map { x => x: js.Any }),
        ("ReturnEnabled" -> ReturnEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IntArrayOptions]
    }
  }

  /**
   * <p>Options for a 64-bit signed integer field. Present if <code>IndexFieldType</code> specifies the field is of type <code>int</code>. All options are enabled by default.</p>
   */
  @js.native
  trait IntOptions extends js.Object {
    var SearchEnabled: Boolean
    var SourceField: FieldName
    var FacetEnabled: Boolean
    var SortEnabled: Boolean
    var DefaultValue: Long
    var ReturnEnabled: Boolean
  }

  object IntOptions {
    def apply(
      SearchEnabled: js.UndefOr[Boolean] = js.undefined,
      SourceField: js.UndefOr[FieldName] = js.undefined,
      FacetEnabled: js.UndefOr[Boolean] = js.undefined,
      SortEnabled: js.UndefOr[Boolean] = js.undefined,
      DefaultValue: js.UndefOr[Long] = js.undefined,
      ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    ): IntOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SearchEnabled" -> SearchEnabled.map { x => x: js.Any }),
        ("SourceField" -> SourceField.map { x => x: js.Any }),
        ("FacetEnabled" -> FacetEnabled.map { x => x: js.Any }),
        ("SortEnabled" -> SortEnabled.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("ReturnEnabled" -> ReturnEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IntOptions]
    }
  }

  /**
   * <p>An internal error occurred while processing the request. If this problem persists, report an issue from the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.</p>
   */
  @js.native
  trait InternalExceptionException extends js.Object {

  }

  /**
   * <p>The request was rejected because it specified an invalid type definition.</p>
   */
  @js.native
  trait InvalidTypeExceptionException extends js.Object {

  }

  /**
   * <p>Options for a latlon field. A latlon field contains a location stored as a latitude and longitude value pair. Present if <code>IndexFieldType</code> specifies the field is of type <code>latlon</code>. All options are enabled by default.</p>
   */
  @js.native
  trait LatLonOptions extends js.Object {
    var SearchEnabled: Boolean
    var SourceField: FieldName
    var FacetEnabled: Boolean
    var SortEnabled: Boolean
    var DefaultValue: FieldValue
    var ReturnEnabled: Boolean
  }

  object LatLonOptions {
    def apply(
      SearchEnabled: js.UndefOr[Boolean] = js.undefined,
      SourceField: js.UndefOr[FieldName] = js.undefined,
      FacetEnabled: js.UndefOr[Boolean] = js.undefined,
      SortEnabled: js.UndefOr[Boolean] = js.undefined,
      DefaultValue: js.UndefOr[FieldValue] = js.undefined,
      ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    ): LatLonOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SearchEnabled" -> SearchEnabled.map { x => x: js.Any }),
        ("SourceField" -> SourceField.map { x => x: js.Any }),
        ("FacetEnabled" -> FacetEnabled.map { x => x: js.Any }),
        ("SortEnabled" -> SortEnabled.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("ReturnEnabled" -> ReturnEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LatLonOptions]
    }
  }

  /**
   * <p>The request was rejected because a resource limit has already been met.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {

  }

  @js.native
  trait Limits extends js.Object {
    var MaximumReplicationCount: MaximumReplicationCount
    var MaximumPartitionCount: MaximumPartitionCount
  }

  object Limits {
    def apply(
      MaximumReplicationCount: js.UndefOr[MaximumReplicationCount] = js.undefined,
      MaximumPartitionCount: js.UndefOr[MaximumPartitionCount] = js.undefined
    ): Limits = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaximumReplicationCount" -> MaximumReplicationCount.map { x => x: js.Any }),
        ("MaximumPartitionCount" -> MaximumPartitionCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Limits]
    }
  }

  /**
   * <p>The result of a <code>ListDomainNames</code> request. Contains a list of the domains owned by an account.</p>
   */
  @js.native
  trait ListDomainNamesResponse extends js.Object {
    var DomainNames: DomainNameMap
  }

  object ListDomainNamesResponse {
    def apply(
      DomainNames: js.UndefOr[DomainNameMap] = js.undefined
    ): ListDomainNamesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainNames" -> DomainNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainNamesResponse]
    }
  }

  /**
   * <p>Options for a field that contains an array of literal strings. Present if <code>IndexFieldType</code> specifies the field is of type <code>literal-array</code>. All options are enabled by default.</p>
   */
  @js.native
  trait LiteralArrayOptions extends js.Object {
    var SearchEnabled: Boolean
    var FacetEnabled: Boolean
    var DefaultValue: FieldValue
    var SourceFields: FieldNameCommaList
    var ReturnEnabled: Boolean
  }

  object LiteralArrayOptions {
    def apply(
      SearchEnabled: js.UndefOr[Boolean] = js.undefined,
      FacetEnabled: js.UndefOr[Boolean] = js.undefined,
      DefaultValue: js.UndefOr[FieldValue] = js.undefined,
      SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined,
      ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    ): LiteralArrayOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SearchEnabled" -> SearchEnabled.map { x => x: js.Any }),
        ("FacetEnabled" -> FacetEnabled.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("SourceFields" -> SourceFields.map { x => x: js.Any }),
        ("ReturnEnabled" -> ReturnEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LiteralArrayOptions]
    }
  }

  /**
   * <p>Options for literal field. Present if <code>IndexFieldType</code> specifies the field is of type <code>literal</code>. All options are enabled by default.</p>
   */
  @js.native
  trait LiteralOptions extends js.Object {
    var SearchEnabled: Boolean
    var SourceField: FieldName
    var FacetEnabled: Boolean
    var SortEnabled: Boolean
    var DefaultValue: FieldValue
    var ReturnEnabled: Boolean
  }

  object LiteralOptions {
    def apply(
      SearchEnabled: js.UndefOr[Boolean] = js.undefined,
      SourceField: js.UndefOr[FieldName] = js.undefined,
      FacetEnabled: js.UndefOr[Boolean] = js.undefined,
      SortEnabled: js.UndefOr[Boolean] = js.undefined,
      DefaultValue: js.UndefOr[FieldValue] = js.undefined,
      ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    ): LiteralOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SearchEnabled" -> SearchEnabled.map { x => x: js.Any }),
        ("SourceField" -> SourceField.map { x => x: js.Any }),
        ("FacetEnabled" -> FacetEnabled.map { x => x: js.Any }),
        ("SortEnabled" -> SortEnabled.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("ReturnEnabled" -> ReturnEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LiteralOptions]
    }
  }

  /**
   * <p>The state of processing a change to an option. One of:</p> <ul> <li>RequiresIndexDocuments: The option's latest value will not be deployed until <a>IndexDocuments</a> has been called and indexing is complete.</li> <li>Processing: The option's latest value is in the process of being activated.</li> <li>Active: The option's latest value is fully deployed. </li> <li>FailedToValidate: The option value is not compatible with the domain's data and cannot be used to index the data. You must either modify the option value or update or remove the incompatible documents.</li> </ul>
   */
  object OptionStateEnum {
    val RequiresIndexDocuments = "RequiresIndexDocuments"
    val Processing = "Processing"
    val Active = "Active"
    val FailedToValidate = "FailedToValidate"

    val values = IndexedSeq(RequiresIndexDocuments, Processing, Active, FailedToValidate)
  }

  /**
   * <p>The status of domain configuration option.</p>
   */
  @js.native
  trait OptionStatus extends js.Object {
    var CreationDate: UpdateTimestamp
    var UpdateDate: UpdateTimestamp
    var UpdateVersion: UIntValue
    var State: OptionState
    var PendingDeletion: Boolean
  }

  object OptionStatus {
    def apply(
      CreationDate: js.UndefOr[UpdateTimestamp] = js.undefined,
      UpdateDate: js.UndefOr[UpdateTimestamp] = js.undefined,
      UpdateVersion: js.UndefOr[UIntValue] = js.undefined,
      State: js.UndefOr[OptionState] = js.undefined,
      PendingDeletion: js.UndefOr[Boolean] = js.undefined
    ): OptionStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDate" -> CreationDate.map { x => x: js.Any }),
        ("UpdateDate" -> UpdateDate.map { x => x: js.Any }),
        ("UpdateVersion" -> UpdateVersion.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("PendingDeletion" -> PendingDeletion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionStatus]
    }
  }

  /**
   * <p>The instance type (such as <code>search.m1.small</code>) on which an index partition is hosted.</p>
   */
  object PartitionInstanceTypeEnum {
    val `search.m1.small` = "search.m1.small"
    val `search.m1.large` = "search.m1.large"
    val `search.m2.xlarge` = "search.m2.xlarge"
    val `search.m2.2xlarge` = "search.m2.2xlarge"
    val `search.m3.medium` = "search.m3.medium"
    val `search.m3.large` = "search.m3.large"
    val `search.m3.xlarge` = "search.m3.xlarge"
    val `search.m3.2xlarge` = "search.m3.2xlarge"

    val values = IndexedSeq(`search.m1.small`, `search.m1.large`, `search.m2.xlarge`, `search.m2.2xlarge`, `search.m3.medium`, `search.m3.large`, `search.m3.xlarge`, `search.m3.2xlarge`)
  }

  /**
   * <p>The request was rejected because it attempted to reference a resource that does not exist.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>The desired instance type and desired number of replicas of each index partition.</p>
   */
  @js.native
  trait ScalingParameters extends js.Object {
    var DesiredInstanceType: PartitionInstanceType
    var DesiredReplicationCount: UIntValue
    var DesiredPartitionCount: UIntValue
  }

  object ScalingParameters {
    def apply(
      DesiredInstanceType: js.UndefOr[PartitionInstanceType] = js.undefined,
      DesiredReplicationCount: js.UndefOr[UIntValue] = js.undefined,
      DesiredPartitionCount: js.UndefOr[UIntValue] = js.undefined
    ): ScalingParameters = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DesiredInstanceType" -> DesiredInstanceType.map { x => x: js.Any }),
        ("DesiredReplicationCount" -> DesiredReplicationCount.map { x => x: js.Any }),
        ("DesiredPartitionCount" -> DesiredPartitionCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingParameters]
    }
  }

  /**
   * <p>The status and configuration of a search domain's scaling parameters. </p>
   */
  @js.native
  trait ScalingParametersStatus extends js.Object {
    var Options: ScalingParameters
    var Status: OptionStatus
  }

  object ScalingParametersStatus {
    def apply(
      Options: js.UndefOr[ScalingParameters] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined
    ): ScalingParametersStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Options" -> Options.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingParametersStatus]
    }
  }

  /**
   * <p>The endpoint to which service requests can be submitted.</p>
   */
  @js.native
  trait ServiceEndpoint extends js.Object {
    var Endpoint: ServiceUrl
  }

  object ServiceEndpoint {
    def apply(
      Endpoint: js.UndefOr[ServiceUrl] = js.undefined
    ): ServiceEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Endpoint" -> Endpoint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceEndpoint]
    }
  }

  /**
   * <p>Configuration information for a search suggester. Each suggester has a unique name and specifies the text field you want to use for suggestions. The following options can be configured for a suggester: <code>FuzzyMatching</code>, <code>SortExpression</code>. </p>
   */
  @js.native
  trait Suggester extends js.Object {
    var SuggesterName: StandardName
    var DocumentSuggesterOptions: DocumentSuggesterOptions
  }

  object Suggester {
    def apply(
      SuggesterName: js.UndefOr[StandardName] = js.undefined,
      DocumentSuggesterOptions: js.UndefOr[DocumentSuggesterOptions] = js.undefined
    ): Suggester = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SuggesterName" -> SuggesterName.map { x => x: js.Any }),
        ("DocumentSuggesterOptions" -> DocumentSuggesterOptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Suggester]
    }
  }


  object SuggesterFuzzyMatchingEnum {
    val none = "none"
    val low = "low"
    val high = "high"

    val values = IndexedSeq(none, low, high)
  }

  /**
   * <p>The value of a <code>Suggester</code> and its current status.</p>
   */
  @js.native
  trait SuggesterStatus extends js.Object {
    var Options: Suggester
    var Status: OptionStatus
  }

  object SuggesterStatus {
    def apply(
      Options: js.UndefOr[Suggester] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined
    ): SuggesterStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Options" -> Options.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuggesterStatus]
    }
  }

  /**
   * <p>Options for a field that contains an array of text strings. Present if <code>IndexFieldType</code> specifies the field is of type <code>text-array</code>. A <code>text-array</code> field is always searchable. All options are enabled by default.</p>
   */
  @js.native
  trait TextArrayOptions extends js.Object {
    var HighlightEnabled: Boolean
    var AnalysisScheme: Word
    var DefaultValue: FieldValue
    var SourceFields: FieldNameCommaList
    var ReturnEnabled: Boolean
  }

  object TextArrayOptions {
    def apply(
      HighlightEnabled: js.UndefOr[Boolean] = js.undefined,
      AnalysisScheme: js.UndefOr[Word] = js.undefined,
      DefaultValue: js.UndefOr[FieldValue] = js.undefined,
      SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined,
      ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    ): TextArrayOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HighlightEnabled" -> HighlightEnabled.map { x => x: js.Any }),
        ("AnalysisScheme" -> AnalysisScheme.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("SourceFields" -> SourceFields.map { x => x: js.Any }),
        ("ReturnEnabled" -> ReturnEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TextArrayOptions]
    }
  }

  /**
   * <p>Options for text field. Present if <code>IndexFieldType</code> specifies the field is of type <code>text</code>. A <code>text</code> field is always searchable. All options are enabled by default.</p>
   */
  @js.native
  trait TextOptions extends js.Object {
    var HighlightEnabled: Boolean
    var AnalysisScheme: Word
    var SourceField: FieldName
    var SortEnabled: Boolean
    var DefaultValue: FieldValue
    var ReturnEnabled: Boolean
  }

  object TextOptions {
    def apply(
      HighlightEnabled: js.UndefOr[Boolean] = js.undefined,
      AnalysisScheme: js.UndefOr[Word] = js.undefined,
      SourceField: js.UndefOr[FieldName] = js.undefined,
      SortEnabled: js.UndefOr[Boolean] = js.undefined,
      DefaultValue: js.UndefOr[FieldValue] = js.undefined,
      ReturnEnabled: js.UndefOr[Boolean] = js.undefined
    ): TextOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HighlightEnabled" -> HighlightEnabled.map { x => x: js.Any }),
        ("AnalysisScheme" -> AnalysisScheme.map { x => x: js.Any }),
        ("SourceField" -> SourceField.map { x => x: js.Any }),
        ("SortEnabled" -> SortEnabled.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("ReturnEnabled" -> ReturnEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TextOptions]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>UpdateAvailabilityOptions</a></code> operation. Specifies the name of the domain you want to update and the Multi-AZ availability option.</p>
   */
  @js.native
  trait UpdateAvailabilityOptionsRequest extends js.Object {
    var DomainName: DomainName
    var MultiAZ: Boolean
  }

  object UpdateAvailabilityOptionsRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      MultiAZ: js.UndefOr[Boolean] = js.undefined
    ): UpdateAvailabilityOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("MultiAZ" -> MultiAZ.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAvailabilityOptionsRequest]
    }
  }

  /**
   * <p>The result of a <code>UpdateAvailabilityOptions</code> request. Contains the status of the domain's availability options. </p>
   */
  @js.native
  trait UpdateAvailabilityOptionsResponse extends js.Object {
    var AvailabilityOptions: AvailabilityOptionsStatus
  }

  object UpdateAvailabilityOptionsResponse {
    def apply(
      AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.undefined
    ): UpdateAvailabilityOptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AvailabilityOptions" -> AvailabilityOptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAvailabilityOptionsResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>UpdateScalingParameters</a></code> operation. Specifies the name of the domain you want to update and the scaling parameters you want to configure.</p>
   */
  @js.native
  trait UpdateScalingParametersRequest extends js.Object {
    var DomainName: DomainName
    var ScalingParameters: ScalingParameters
  }

  object UpdateScalingParametersRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      ScalingParameters: js.UndefOr[ScalingParameters] = js.undefined
    ): UpdateScalingParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("ScalingParameters" -> ScalingParameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateScalingParametersRequest]
    }
  }

  /**
   * <p>The result of a <code>UpdateScalingParameters</code> request. Contains the status of the newly-configured scaling parameters.</p>
   */
  @js.native
  trait UpdateScalingParametersResponse extends js.Object {
    var ScalingParameters: ScalingParametersStatus
  }

  object UpdateScalingParametersResponse {
    def apply(
      ScalingParameters: js.UndefOr[ScalingParametersStatus] = js.undefined
    ): UpdateScalingParametersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ScalingParameters" -> ScalingParameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateScalingParametersResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>UpdateServiceAccessPolicies</a></code> operation. Specifies the name of the domain you want to update and the access rules you want to configure.</p>
   */
  @js.native
  trait UpdateServiceAccessPoliciesRequest extends js.Object {
    var DomainName: DomainName
    var AccessPolicies: PolicyDocument
  }

  object UpdateServiceAccessPoliciesRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined
    ): UpdateServiceAccessPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("AccessPolicies" -> AccessPolicies.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceAccessPoliciesRequest]
    }
  }

  /**
   * <p>The result of an <code>UpdateServiceAccessPolicies</code> request. Contains the new access policies.</p>
   */
  @js.native
  trait UpdateServiceAccessPoliciesResponse extends js.Object {
    var AccessPolicies: AccessPoliciesStatus
  }

  object UpdateServiceAccessPoliciesResponse {
    def apply(
      AccessPolicies: js.UndefOr[AccessPoliciesStatus] = js.undefined
    ): UpdateServiceAccessPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccessPolicies" -> AccessPolicies.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceAccessPoliciesResponse]
    }
  }
}
