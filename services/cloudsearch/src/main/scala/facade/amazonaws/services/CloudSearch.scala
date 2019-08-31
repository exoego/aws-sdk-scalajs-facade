package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudsearch {
  type APIVersion               = String
  type ARN                      = String
  type AlgorithmicStemming      = String
  type AnalysisSchemeLanguage   = String
  type AnalysisSchemeStatusList = js.Array[AnalysisSchemeStatus]
  type DomainId                 = String
  type DomainName               = String
  type DomainNameList           = js.Array[DomainName]
  type DomainNameMap            = js.Dictionary[APIVersion]
  type DomainStatusList         = js.Array[DomainStatus]
  type DynamicFieldName         = String
  type DynamicFieldNameList     = js.Array[DynamicFieldName]
  type ErrorCode                = String
  type ErrorMessage             = String
  type ExpressionStatusList     = js.Array[ExpressionStatus]
  type ExpressionValue          = String
  type FieldName                = String
  type FieldNameCommaList       = String
  type FieldNameList            = js.Array[FieldName]
  type FieldValue               = String
  type IndexFieldStatusList     = js.Array[IndexFieldStatus]
  type IndexFieldType           = String
  type InstanceCount            = Int
  type MaximumPartitionCount    = Int
  type MaximumReplicationCount  = Int
  type MultiAZ                  = Boolean
  type OptionState              = String
  type PartitionCount           = Int
  type PartitionInstanceType    = String
  type PolicyDocument           = String
  type SearchInstanceType       = String
  type ServiceUrl               = String
  type StandardName             = String
  type StandardNameList         = js.Array[StandardName]
  type SuggesterFuzzyMatching   = String
  type SuggesterStatusList      = js.Array[SuggesterStatus]
  type UIntValue                = Int
  type UpdateTimestamp          = js.Date
  type Word                     = String

  implicit final class CloudSearchOps(private val service: CloudSearch) extends AnyVal {

    def buildSuggestersFuture(params: BuildSuggestersRequest): Future[BuildSuggestersResponse] =
      service.buildSuggesters(params).promise.toFuture
    def createDomainFuture(params: CreateDomainRequest): Future[CreateDomainResponse] =
      service.createDomain(params).promise.toFuture
    def defineAnalysisSchemeFuture(params: DefineAnalysisSchemeRequest): Future[DefineAnalysisSchemeResponse] =
      service.defineAnalysisScheme(params).promise.toFuture
    def defineExpressionFuture(params: DefineExpressionRequest): Future[DefineExpressionResponse] =
      service.defineExpression(params).promise.toFuture
    def defineIndexFieldFuture(params: DefineIndexFieldRequest): Future[DefineIndexFieldResponse] =
      service.defineIndexField(params).promise.toFuture
    def defineSuggesterFuture(params: DefineSuggesterRequest): Future[DefineSuggesterResponse] =
      service.defineSuggester(params).promise.toFuture
    def deleteAnalysisSchemeFuture(params: DeleteAnalysisSchemeRequest): Future[DeleteAnalysisSchemeResponse] =
      service.deleteAnalysisScheme(params).promise.toFuture
    def deleteDomainFuture(params: DeleteDomainRequest): Future[DeleteDomainResponse] =
      service.deleteDomain(params).promise.toFuture
    def deleteExpressionFuture(params: DeleteExpressionRequest): Future[DeleteExpressionResponse] =
      service.deleteExpression(params).promise.toFuture
    def deleteIndexFieldFuture(params: DeleteIndexFieldRequest): Future[DeleteIndexFieldResponse] =
      service.deleteIndexField(params).promise.toFuture
    def deleteSuggesterFuture(params: DeleteSuggesterRequest): Future[DeleteSuggesterResponse] =
      service.deleteSuggester(params).promise.toFuture
    def describeAnalysisSchemesFuture(params: DescribeAnalysisSchemesRequest): Future[DescribeAnalysisSchemesResponse] =
      service.describeAnalysisSchemes(params).promise.toFuture
    def describeAvailabilityOptionsFuture(
        params: DescribeAvailabilityOptionsRequest
    ): Future[DescribeAvailabilityOptionsResponse] = service.describeAvailabilityOptions(params).promise.toFuture
    def describeDomainsFuture(params: DescribeDomainsRequest): Future[DescribeDomainsResponse] =
      service.describeDomains(params).promise.toFuture
    def describeExpressionsFuture(params: DescribeExpressionsRequest): Future[DescribeExpressionsResponse] =
      service.describeExpressions(params).promise.toFuture
    def describeIndexFieldsFuture(params: DescribeIndexFieldsRequest): Future[DescribeIndexFieldsResponse] =
      service.describeIndexFields(params).promise.toFuture
    def describeScalingParametersFuture(
        params: DescribeScalingParametersRequest
    ): Future[DescribeScalingParametersResponse] = service.describeScalingParameters(params).promise.toFuture
    def describeServiceAccessPoliciesFuture(
        params: DescribeServiceAccessPoliciesRequest
    ): Future[DescribeServiceAccessPoliciesResponse] = service.describeServiceAccessPolicies(params).promise.toFuture
    def describeSuggestersFuture(params: DescribeSuggestersRequest): Future[DescribeSuggestersResponse] =
      service.describeSuggesters(params).promise.toFuture
    def indexDocumentsFuture(params: IndexDocumentsRequest): Future[IndexDocumentsResponse] =
      service.indexDocuments(params).promise.toFuture
    def listDomainNamesFuture(): Future[ListDomainNamesResponse] = service.listDomainNames().promise.toFuture
    def updateAvailabilityOptionsFuture(
        params: UpdateAvailabilityOptionsRequest
    ): Future[UpdateAvailabilityOptionsResponse] = service.updateAvailabilityOptions(params).promise.toFuture
    def updateScalingParametersFuture(params: UpdateScalingParametersRequest): Future[UpdateScalingParametersResponse] =
      service.updateScalingParameters(params).promise.toFuture
    def updateServiceAccessPoliciesFuture(
        params: UpdateServiceAccessPoliciesRequest
    ): Future[UpdateServiceAccessPoliciesResponse] = service.updateServiceAccessPolicies(params).promise.toFuture
  }
}

package cloudsearch {
  @js.native
  @JSImport("aws-sdk", "CloudSearch")
  class CloudSearch() extends js.Object {
    def this(config: AWSConfig) = this()

    def buildSuggesters(params: BuildSuggestersRequest): Request[BuildSuggestersResponse]                = js.native
    def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse]                         = js.native
    def defineAnalysisScheme(params: DefineAnalysisSchemeRequest): Request[DefineAnalysisSchemeResponse] = js.native
    def defineExpression(params: DefineExpressionRequest): Request[DefineExpressionResponse]             = js.native
    def defineIndexField(params: DefineIndexFieldRequest): Request[DefineIndexFieldResponse]             = js.native
    def defineSuggester(params: DefineSuggesterRequest): Request[DefineSuggesterResponse]                = js.native
    def deleteAnalysisScheme(params: DeleteAnalysisSchemeRequest): Request[DeleteAnalysisSchemeResponse] = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResponse]                         = js.native
    def deleteExpression(params: DeleteExpressionRequest): Request[DeleteExpressionResponse]             = js.native
    def deleteIndexField(params: DeleteIndexFieldRequest): Request[DeleteIndexFieldResponse]             = js.native
    def deleteSuggester(params: DeleteSuggesterRequest): Request[DeleteSuggesterResponse]                = js.native
    def describeAnalysisSchemes(params: DescribeAnalysisSchemesRequest): Request[DescribeAnalysisSchemesResponse] =
      js.native
    def describeAvailabilityOptions(
        params: DescribeAvailabilityOptionsRequest
    ): Request[DescribeAvailabilityOptionsResponse]                                                   = js.native
    def describeDomains(params: DescribeDomainsRequest): Request[DescribeDomainsResponse]             = js.native
    def describeExpressions(params: DescribeExpressionsRequest): Request[DescribeExpressionsResponse] = js.native
    def describeIndexFields(params: DescribeIndexFieldsRequest): Request[DescribeIndexFieldsResponse] = js.native
    def describeScalingParameters(
        params: DescribeScalingParametersRequest
    ): Request[DescribeScalingParametersResponse] = js.native
    def describeServiceAccessPolicies(
        params: DescribeServiceAccessPoliciesRequest
    ): Request[DescribeServiceAccessPoliciesResponse]                                              = js.native
    def describeSuggesters(params: DescribeSuggestersRequest): Request[DescribeSuggestersResponse] = js.native
    def indexDocuments(params: IndexDocumentsRequest): Request[IndexDocumentsResponse]             = js.native
    def listDomainNames(): Request[ListDomainNamesResponse]                                        = js.native
    def updateAvailabilityOptions(
        params: UpdateAvailabilityOptionsRequest
    ): Request[UpdateAvailabilityOptionsResponse] = js.native
    def updateScalingParameters(params: UpdateScalingParametersRequest): Request[UpdateScalingParametersResponse] =
      js.native
    def updateServiceAccessPolicies(
        params: UpdateServiceAccessPoliciesRequest
    ): Request[UpdateServiceAccessPoliciesResponse] = js.native
  }

  /**
    * The configured access rules for the domain's document and search endpoints, and the current status of those rules.
    */
  @js.native
  trait AccessPoliciesStatus extends js.Object {
    var Options: PolicyDocument
    var Status: OptionStatus
  }

  object AccessPoliciesStatus {
    def apply(
        Options: PolicyDocument,
        Status: OptionStatus
    ): AccessPoliciesStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AccessPoliciesStatus]
    }
  }

  object AlgorithmicStemmingEnum {
    val none    = "none"
    val minimal = "minimal"
    val light   = "light"
    val full    = "full"

    val values = js.Object.freeze(js.Array(none, minimal, light, full))
  }

  /**
    * Synonyms, stopwords, and stemming options for an analysis scheme. Includes tokenization dictionary for Japanese.
    */
  @js.native
  trait AnalysisOptions extends js.Object {
    var AlgorithmicStemming: js.UndefOr[AlgorithmicStemming]
    var JapaneseTokenizationDictionary: js.UndefOr[String]
    var StemmingDictionary: js.UndefOr[String]
    var Stopwords: js.UndefOr[String]
    var Synonyms: js.UndefOr[String]
  }

  object AnalysisOptions {
    def apply(
        AlgorithmicStemming: js.UndefOr[AlgorithmicStemming] = js.undefined,
        JapaneseTokenizationDictionary: js.UndefOr[String] = js.undefined,
        StemmingDictionary: js.UndefOr[String] = js.undefined,
        Stopwords: js.UndefOr[String] = js.undefined,
        Synonyms: js.UndefOr[String] = js.undefined
    ): AnalysisOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      AlgorithmicStemming.foreach(__v => __obj.update("AlgorithmicStemming", __v.asInstanceOf[js.Any]))
      JapaneseTokenizationDictionary.foreach(
        __v => __obj.update("JapaneseTokenizationDictionary", __v.asInstanceOf[js.Any])
      )
      StemmingDictionary.foreach(__v => __obj.update("StemmingDictionary", __v.asInstanceOf[js.Any]))
      Stopwords.foreach(__v => __obj.update("Stopwords", __v.asInstanceOf[js.Any]))
      Synonyms.foreach(__v => __obj.update("Synonyms", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalysisOptions]
    }
  }

  /**
    * Configuration information for an analysis scheme. Each analysis scheme has a unique name and specifies the language of the text to be processed. The following options can be configured for an analysis scheme: <code>Synonyms</code>, <code>Stopwords</code>, <code>StemmingDictionary</code>, <code>JapaneseTokenizationDictionary</code> and <code>AlgorithmicStemming</code>.
    */
  @js.native
  trait AnalysisScheme extends js.Object {
    var AnalysisSchemeLanguage: AnalysisSchemeLanguage
    var AnalysisSchemeName: StandardName
    var AnalysisOptions: js.UndefOr[AnalysisOptions]
  }

  object AnalysisScheme {
    def apply(
        AnalysisSchemeLanguage: AnalysisSchemeLanguage,
        AnalysisSchemeName: StandardName,
        AnalysisOptions: js.UndefOr[AnalysisOptions] = js.undefined
    ): AnalysisScheme = {
      val __obj = js.Dictionary[js.Any](
        "AnalysisSchemeLanguage" -> AnalysisSchemeLanguage.asInstanceOf[js.Any],
        "AnalysisSchemeName"     -> AnalysisSchemeName.asInstanceOf[js.Any]
      )

      AnalysisOptions.foreach(__v => __obj.update("AnalysisOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalysisScheme]
    }
  }

  /**
    * An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF RFC 4646</a> language code or <code>mul</code> for multiple languages.
    */
  object AnalysisSchemeLanguageEnum {
    val ar        = "ar"
    val bg        = "bg"
    val ca        = "ca"
    val cs        = "cs"
    val da        = "da"
    val de        = "de"
    val el        = "el"
    val en        = "en"
    val es        = "es"
    val eu        = "eu"
    val fa        = "fa"
    val fi        = "fi"
    val fr        = "fr"
    val ga        = "ga"
    val gl        = "gl"
    val he        = "he"
    val hi        = "hi"
    val hu        = "hu"
    val hy        = "hy"
    val id        = "id"
    val it        = "it"
    val ja        = "ja"
    val ko        = "ko"
    val lv        = "lv"
    val mul       = "mul"
    val nl        = "nl"
    val no        = "no"
    val pt        = "pt"
    val ro        = "ro"
    val ru        = "ru"
    val sv        = "sv"
    val th        = "th"
    val tr        = "tr"
    val `zh-Hans` = "zh-Hans"
    val `zh-Hant` = "zh-Hant"

    val values = js.Object.freeze(
      js.Array(
        ar,
        bg,
        ca,
        cs,
        da,
        de,
        el,
        en,
        es,
        eu,
        fa,
        fi,
        fr,
        ga,
        gl,
        he,
        hi,
        hu,
        hy,
        id,
        it,
        ja,
        ko,
        lv,
        mul,
        nl,
        no,
        pt,
        ro,
        ru,
        sv,
        th,
        tr,
        `zh-Hans`,
        `zh-Hant`
      )
    )
  }

  /**
    * The status and configuration of an <code>AnalysisScheme</code>.
    */
  @js.native
  trait AnalysisSchemeStatus extends js.Object {
    var Options: AnalysisScheme
    var Status: OptionStatus
  }

  object AnalysisSchemeStatus {
    def apply(
        Options: AnalysisScheme,
        Status: OptionStatus
    ): AnalysisSchemeStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AnalysisSchemeStatus]
    }
  }

  /**
    * The status and configuration of the domain's availability options.
    */
  @js.native
  trait AvailabilityOptionsStatus extends js.Object {
    var Options: MultiAZ
    var Status: OptionStatus
  }

  object AvailabilityOptionsStatus {
    def apply(
        Options: MultiAZ,
        Status: OptionStatus
    ): AvailabilityOptionsStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AvailabilityOptionsStatus]
    }
  }

  /**
    * An error occurred while processing the request.
    */
  @js.native
  trait BaseExceptionException extends js.Object {
    val Code: ErrorCode
    val Message: ErrorMessage
  }

  /**
    * Container for the parameters to the <code><a>BuildSuggester</a></code> operation. Specifies the name of the domain you want to update.
    */
  @js.native
  trait BuildSuggestersRequest extends js.Object {
    var DomainName: DomainName
  }

  object BuildSuggestersRequest {
    def apply(
        DomainName: DomainName
    ): BuildSuggestersRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BuildSuggestersRequest]
    }
  }

  /**
    * The result of a <code>BuildSuggester</code> request. Contains a list of the fields used for suggestions.
    */
  @js.native
  trait BuildSuggestersResponse extends js.Object {
    var FieldNames: js.UndefOr[FieldNameList]
  }

  object BuildSuggestersResponse {
    def apply(
        FieldNames: js.UndefOr[FieldNameList] = js.undefined
    ): BuildSuggestersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FieldNames.foreach(__v => __obj.update("FieldNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildSuggestersResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>CreateDomain</a></code> operation. Specifies a name for the new search domain.
    */
  @js.native
  trait CreateDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object CreateDomainRequest {
    def apply(
        DomainName: DomainName
    ): CreateDomainRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDomainRequest]
    }
  }

  /**
    * The result of a <code>CreateDomainRequest</code>. Contains the status of a newly created domain.
    */
  @js.native
  trait CreateDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[DomainStatus]
  }

  object CreateDomainResponse {
    def apply(
        DomainStatus: js.UndefOr[DomainStatus] = js.undefined
    ): CreateDomainResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DomainStatus.foreach(__v => __obj.update("DomainStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainResponse]
    }
  }

  /**
    * Options for a field that contains an array of dates. Present if <code>IndexFieldType</code> specifies the field is of type <code>date-array</code>. All options are enabled by default.
    */
  @js.native
  trait DateArrayOptions extends js.Object {
    var DefaultValue: js.UndefOr[FieldValue]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SourceFields: js.UndefOr[FieldNameCommaList]
  }

  object DateArrayOptions {
    def apply(
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
    ): DateArrayOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.update("FacetEnabled", __v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.update("ReturnEnabled", __v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.update("SearchEnabled", __v.asInstanceOf[js.Any]))
      SourceFields.foreach(__v => __obj.update("SourceFields", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateArrayOptions]
    }
  }

  /**
    * Options for a date field. Dates and times are specified in UTC (Coordinated Universal Time) according to IETF RFC3339: yyyy-mm-ddT00:00:00Z. Present if <code>IndexFieldType</code> specifies the field is of type <code>date</code>. All options are enabled by default.
    */
  @js.native
  trait DateOptions extends js.Object {
    var DefaultValue: js.UndefOr[FieldValue]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SortEnabled: js.UndefOr[Boolean]
    var SourceField: js.UndefOr[FieldName]
  }

  object DateOptions {
    def apply(
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SortEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceField: js.UndefOr[FieldName] = js.undefined
    ): DateOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.update("FacetEnabled", __v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.update("ReturnEnabled", __v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.update("SearchEnabled", __v.asInstanceOf[js.Any]))
      SortEnabled.foreach(__v => __obj.update("SortEnabled", __v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.update("SourceField", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateOptions]
    }
  }

  /**
    * Container for the parameters to the <code><a>DefineAnalysisScheme</a></code> operation. Specifies the name of the domain you want to update and the analysis scheme configuration.
    */
  @js.native
  trait DefineAnalysisSchemeRequest extends js.Object {
    var AnalysisScheme: AnalysisScheme
    var DomainName: DomainName
  }

  object DefineAnalysisSchemeRequest {
    def apply(
        AnalysisScheme: AnalysisScheme,
        DomainName: DomainName
    ): DefineAnalysisSchemeRequest = {
      val __obj = js.Dictionary[js.Any](
        "AnalysisScheme" -> AnalysisScheme.asInstanceOf[js.Any],
        "DomainName"     -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DefineAnalysisSchemeRequest]
    }
  }

  /**
    * The result of a <code><a>DefineAnalysisScheme</a></code> request. Contains the status of the newly-configured analysis scheme.
    */
  @js.native
  trait DefineAnalysisSchemeResponse extends js.Object {
    var AnalysisScheme: AnalysisSchemeStatus
  }

  object DefineAnalysisSchemeResponse {
    def apply(
        AnalysisScheme: AnalysisSchemeStatus
    ): DefineAnalysisSchemeResponse = {
      val __obj = js.Dictionary[js.Any](
        "AnalysisScheme" -> AnalysisScheme.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DefineAnalysisSchemeResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DefineExpression</a></code> operation. Specifies the name of the domain you want to update and the expression you want to configure.
    */
  @js.native
  trait DefineExpressionRequest extends js.Object {
    var DomainName: DomainName
    var Expression: Expression
  }

  object DefineExpressionRequest {
    def apply(
        DomainName: DomainName,
        Expression: Expression
    ): DefineExpressionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Expression" -> Expression.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DefineExpressionRequest]
    }
  }

  /**
    * The result of a <code>DefineExpression</code> request. Contains the status of the newly-configured expression.
    */
  @js.native
  trait DefineExpressionResponse extends js.Object {
    var Expression: ExpressionStatus
  }

  object DefineExpressionResponse {
    def apply(
        Expression: ExpressionStatus
    ): DefineExpressionResponse = {
      val __obj = js.Dictionary[js.Any](
        "Expression" -> Expression.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DefineExpressionResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DefineIndexField</a></code> operation. Specifies the name of the domain you want to update and the index field configuration.
    */
  @js.native
  trait DefineIndexFieldRequest extends js.Object {
    var DomainName: DomainName
    var IndexField: IndexField
  }

  object DefineIndexFieldRequest {
    def apply(
        DomainName: DomainName,
        IndexField: IndexField
    ): DefineIndexFieldRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "IndexField" -> IndexField.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DefineIndexFieldRequest]
    }
  }

  /**
    * The result of a <code><a>DefineIndexField</a></code> request. Contains the status of the newly-configured index field.
    */
  @js.native
  trait DefineIndexFieldResponse extends js.Object {
    var IndexField: IndexFieldStatus
  }

  object DefineIndexFieldResponse {
    def apply(
        IndexField: IndexFieldStatus
    ): DefineIndexFieldResponse = {
      val __obj = js.Dictionary[js.Any](
        "IndexField" -> IndexField.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DefineIndexFieldResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DefineSuggester</a></code> operation. Specifies the name of the domain you want to update and the suggester configuration.
    */
  @js.native
  trait DefineSuggesterRequest extends js.Object {
    var DomainName: DomainName
    var Suggester: Suggester
  }

  object DefineSuggesterRequest {
    def apply(
        DomainName: DomainName,
        Suggester: Suggester
    ): DefineSuggesterRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Suggester"  -> Suggester.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DefineSuggesterRequest]
    }
  }

  /**
    * The result of a <code>DefineSuggester</code> request. Contains the status of the newly-configured suggester.
    */
  @js.native
  trait DefineSuggesterResponse extends js.Object {
    var Suggester: SuggesterStatus
  }

  object DefineSuggesterResponse {
    def apply(
        Suggester: SuggesterStatus
    ): DefineSuggesterResponse = {
      val __obj = js.Dictionary[js.Any](
        "Suggester" -> Suggester.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DefineSuggesterResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DeleteAnalysisScheme</a></code> operation. Specifies the name of the domain you want to update and the analysis scheme you want to delete.
    */
  @js.native
  trait DeleteAnalysisSchemeRequest extends js.Object {
    var AnalysisSchemeName: StandardName
    var DomainName: DomainName
  }

  object DeleteAnalysisSchemeRequest {
    def apply(
        AnalysisSchemeName: StandardName,
        DomainName: DomainName
    ): DeleteAnalysisSchemeRequest = {
      val __obj = js.Dictionary[js.Any](
        "AnalysisSchemeName" -> AnalysisSchemeName.asInstanceOf[js.Any],
        "DomainName"         -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAnalysisSchemeRequest]
    }
  }

  /**
    * The result of a <code>DeleteAnalysisScheme</code> request. Contains the status of the deleted analysis scheme.
    */
  @js.native
  trait DeleteAnalysisSchemeResponse extends js.Object {
    var AnalysisScheme: AnalysisSchemeStatus
  }

  object DeleteAnalysisSchemeResponse {
    def apply(
        AnalysisScheme: AnalysisSchemeStatus
    ): DeleteAnalysisSchemeResponse = {
      val __obj = js.Dictionary[js.Any](
        "AnalysisScheme" -> AnalysisScheme.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAnalysisSchemeResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DeleteDomain</a></code> operation. Specifies the name of the domain you want to delete.
    */
  @js.native
  trait DeleteDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object DeleteDomainRequest {
    def apply(
        DomainName: DomainName
    ): DeleteDomainRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDomainRequest]
    }
  }

  /**
    * The result of a <code>DeleteDomain</code> request. Contains the status of a newly deleted domain, or no status if the domain has already been completely deleted.
    */
  @js.native
  trait DeleteDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[DomainStatus]
  }

  object DeleteDomainResponse {
    def apply(
        DomainStatus: js.UndefOr[DomainStatus] = js.undefined
    ): DeleteDomainResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DomainStatus.foreach(__v => __obj.update("DomainStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDomainResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DeleteExpression</a></code> operation. Specifies the name of the domain you want to update and the name of the expression you want to delete.
    */
  @js.native
  trait DeleteExpressionRequest extends js.Object {
    var DomainName: DomainName
    var ExpressionName: StandardName
  }

  object DeleteExpressionRequest {
    def apply(
        DomainName: DomainName,
        ExpressionName: StandardName
    ): DeleteExpressionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName"     -> DomainName.asInstanceOf[js.Any],
        "ExpressionName" -> ExpressionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteExpressionRequest]
    }
  }

  /**
    * The result of a <code><a>DeleteExpression</a></code> request. Specifies the expression being deleted.
    */
  @js.native
  trait DeleteExpressionResponse extends js.Object {
    var Expression: ExpressionStatus
  }

  object DeleteExpressionResponse {
    def apply(
        Expression: ExpressionStatus
    ): DeleteExpressionResponse = {
      val __obj = js.Dictionary[js.Any](
        "Expression" -> Expression.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteExpressionResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DeleteIndexField</a></code> operation. Specifies the name of the domain you want to update and the name of the index field you want to delete.
    */
  @js.native
  trait DeleteIndexFieldRequest extends js.Object {
    var DomainName: DomainName
    var IndexFieldName: DynamicFieldName
  }

  object DeleteIndexFieldRequest {
    def apply(
        DomainName: DomainName,
        IndexFieldName: DynamicFieldName
    ): DeleteIndexFieldRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName"     -> DomainName.asInstanceOf[js.Any],
        "IndexFieldName" -> IndexFieldName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIndexFieldRequest]
    }
  }

  /**
    * The result of a <code><a>DeleteIndexField</a></code> request.
    */
  @js.native
  trait DeleteIndexFieldResponse extends js.Object {
    var IndexField: IndexFieldStatus
  }

  object DeleteIndexFieldResponse {
    def apply(
        IndexField: IndexFieldStatus
    ): DeleteIndexFieldResponse = {
      val __obj = js.Dictionary[js.Any](
        "IndexField" -> IndexField.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIndexFieldResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DeleteSuggester</a></code> operation. Specifies the name of the domain you want to update and name of the suggester you want to delete.
    */
  @js.native
  trait DeleteSuggesterRequest extends js.Object {
    var DomainName: DomainName
    var SuggesterName: StandardName
  }

  object DeleteSuggesterRequest {
    def apply(
        DomainName: DomainName,
        SuggesterName: StandardName
    ): DeleteSuggesterRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName"    -> DomainName.asInstanceOf[js.Any],
        "SuggesterName" -> SuggesterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSuggesterRequest]
    }
  }

  /**
    * The result of a <code>DeleteSuggester</code> request. Contains the status of the deleted suggester.
    */
  @js.native
  trait DeleteSuggesterResponse extends js.Object {
    var Suggester: SuggesterStatus
  }

  object DeleteSuggesterResponse {
    def apply(
        Suggester: SuggesterStatus
    ): DeleteSuggesterResponse = {
      val __obj = js.Dictionary[js.Any](
        "Suggester" -> Suggester.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSuggesterResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeAnalysisSchemes</a></code> operation. Specifies the name of the domain you want to describe. To limit the response to particular analysis schemes, specify the names of the analysis schemes you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  trait DescribeAnalysisSchemesRequest extends js.Object {
    var DomainName: DomainName
    var AnalysisSchemeNames: js.UndefOr[StandardNameList]
    var Deployed: js.UndefOr[Boolean]
  }

  object DescribeAnalysisSchemesRequest {
    def apply(
        DomainName: DomainName,
        AnalysisSchemeNames: js.UndefOr[StandardNameList] = js.undefined,
        Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeAnalysisSchemesRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AnalysisSchemeNames.foreach(__v => __obj.update("AnalysisSchemeNames", __v.asInstanceOf[js.Any]))
      Deployed.foreach(__v => __obj.update("Deployed", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAnalysisSchemesRequest]
    }
  }

  /**
    * The result of a <code>DescribeAnalysisSchemes</code> request. Contains the analysis schemes configured for the domain specified in the request.
    */
  @js.native
  trait DescribeAnalysisSchemesResponse extends js.Object {
    var AnalysisSchemes: AnalysisSchemeStatusList
  }

  object DescribeAnalysisSchemesResponse {
    def apply(
        AnalysisSchemes: AnalysisSchemeStatusList
    ): DescribeAnalysisSchemesResponse = {
      val __obj = js.Dictionary[js.Any](
        "AnalysisSchemes" -> AnalysisSchemes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAnalysisSchemesResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeAvailabilityOptions</a></code> operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to <code>true</code>.
    */
  @js.native
  trait DescribeAvailabilityOptionsRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
  }

  object DescribeAvailabilityOptionsRequest {
    def apply(
        DomainName: DomainName,
        Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeAvailabilityOptionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      Deployed.foreach(__v => __obj.update("Deployed", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAvailabilityOptionsRequest]
    }
  }

  /**
    * The result of a <code>DescribeAvailabilityOptions</code> request. Indicates whether or not the Multi-AZ option is enabled for the domain specified in the request.
    */
  @js.native
  trait DescribeAvailabilityOptionsResponse extends js.Object {
    var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus]
  }

  object DescribeAvailabilityOptionsResponse {
    def apply(
        AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.undefined
    ): DescribeAvailabilityOptionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityOptions.foreach(__v => __obj.update("AvailabilityOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAvailabilityOptionsResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeDomains</a></code> operation. By default shows the status of all domains. To restrict the response to particular domains, specify the names of the domains you want to describe.
    */
  @js.native
  trait DescribeDomainsRequest extends js.Object {
    var DomainNames: js.UndefOr[DomainNameList]
  }

  object DescribeDomainsRequest {
    def apply(
        DomainNames: js.UndefOr[DomainNameList] = js.undefined
    ): DescribeDomainsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DomainNames.foreach(__v => __obj.update("DomainNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainsRequest]
    }
  }

  /**
    * The result of a <code>DescribeDomains</code> request. Contains the status of the domains specified in the request or all domains owned by the account.
    */
  @js.native
  trait DescribeDomainsResponse extends js.Object {
    var DomainStatusList: DomainStatusList
  }

  object DescribeDomainsResponse {
    def apply(
        DomainStatusList: DomainStatusList
    ): DescribeDomainsResponse = {
      val __obj = js.Dictionary[js.Any](
        "DomainStatusList" -> DomainStatusList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDomainsResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeDomains</a></code> operation. Specifies the name of the domain you want to describe. To restrict the response to particular expressions, specify the names of the expressions you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  trait DescribeExpressionsRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
    var ExpressionNames: js.UndefOr[StandardNameList]
  }

  object DescribeExpressionsRequest {
    def apply(
        DomainName: DomainName,
        Deployed: js.UndefOr[Boolean] = js.undefined,
        ExpressionNames: js.UndefOr[StandardNameList] = js.undefined
    ): DescribeExpressionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      Deployed.foreach(__v => __obj.update("Deployed", __v.asInstanceOf[js.Any]))
      ExpressionNames.foreach(__v => __obj.update("ExpressionNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExpressionsRequest]
    }
  }

  /**
    * The result of a <code>DescribeExpressions</code> request. Contains the expressions configured for the domain specified in the request.
    */
  @js.native
  trait DescribeExpressionsResponse extends js.Object {
    var Expressions: ExpressionStatusList
  }

  object DescribeExpressionsResponse {
    def apply(
        Expressions: ExpressionStatusList
    ): DescribeExpressionsResponse = {
      val __obj = js.Dictionary[js.Any](
        "Expressions" -> Expressions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeExpressionsResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeIndexFields</a></code> operation. Specifies the name of the domain you want to describe. To restrict the response to particular index fields, specify the names of the index fields you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  trait DescribeIndexFieldsRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
    var FieldNames: js.UndefOr[DynamicFieldNameList]
  }

  object DescribeIndexFieldsRequest {
    def apply(
        DomainName: DomainName,
        Deployed: js.UndefOr[Boolean] = js.undefined,
        FieldNames: js.UndefOr[DynamicFieldNameList] = js.undefined
    ): DescribeIndexFieldsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      Deployed.foreach(__v => __obj.update("Deployed", __v.asInstanceOf[js.Any]))
      FieldNames.foreach(__v => __obj.update("FieldNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIndexFieldsRequest]
    }
  }

  /**
    * The result of a <code>DescribeIndexFields</code> request. Contains the index fields configured for the domain specified in the request.
    */
  @js.native
  trait DescribeIndexFieldsResponse extends js.Object {
    var IndexFields: IndexFieldStatusList
  }

  object DescribeIndexFieldsResponse {
    def apply(
        IndexFields: IndexFieldStatusList
    ): DescribeIndexFieldsResponse = {
      val __obj = js.Dictionary[js.Any](
        "IndexFields" -> IndexFields.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeIndexFieldsResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeScalingParameters</a></code> operation. Specifies the name of the domain you want to describe.
    */
  @js.native
  trait DescribeScalingParametersRequest extends js.Object {
    var DomainName: DomainName
  }

  object DescribeScalingParametersRequest {
    def apply(
        DomainName: DomainName
    ): DescribeScalingParametersRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeScalingParametersRequest]
    }
  }

  /**
    * The result of a <code>DescribeScalingParameters</code> request. Contains the scaling parameters configured for the domain specified in the request.
    */
  @js.native
  trait DescribeScalingParametersResponse extends js.Object {
    var ScalingParameters: ScalingParametersStatus
  }

  object DescribeScalingParametersResponse {
    def apply(
        ScalingParameters: ScalingParametersStatus
    ): DescribeScalingParametersResponse = {
      val __obj = js.Dictionary[js.Any](
        "ScalingParameters" -> ScalingParameters.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeScalingParametersResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeServiceAccessPolicies</a></code> operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  trait DescribeServiceAccessPoliciesRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
  }

  object DescribeServiceAccessPoliciesRequest {
    def apply(
        DomainName: DomainName,
        Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeServiceAccessPoliciesRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      Deployed.foreach(__v => __obj.update("Deployed", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceAccessPoliciesRequest]
    }
  }

  /**
    * The result of a <code>DescribeServiceAccessPolicies</code> request.
    */
  @js.native
  trait DescribeServiceAccessPoliciesResponse extends js.Object {
    var AccessPolicies: AccessPoliciesStatus
  }

  object DescribeServiceAccessPoliciesResponse {
    def apply(
        AccessPolicies: AccessPoliciesStatus
    ): DescribeServiceAccessPoliciesResponse = {
      val __obj = js.Dictionary[js.Any](
        "AccessPolicies" -> AccessPolicies.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeServiceAccessPoliciesResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeSuggester</a></code> operation. Specifies the name of the domain you want to describe. To restrict the response to particular suggesters, specify the names of the suggesters you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  trait DescribeSuggestersRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
    var SuggesterNames: js.UndefOr[StandardNameList]
  }

  object DescribeSuggestersRequest {
    def apply(
        DomainName: DomainName,
        Deployed: js.UndefOr[Boolean] = js.undefined,
        SuggesterNames: js.UndefOr[StandardNameList] = js.undefined
    ): DescribeSuggestersRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      Deployed.foreach(__v => __obj.update("Deployed", __v.asInstanceOf[js.Any]))
      SuggesterNames.foreach(__v => __obj.update("SuggesterNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSuggestersRequest]
    }
  }

  /**
    * The result of a <code>DescribeSuggesters</code> request.
    */
  @js.native
  trait DescribeSuggestersResponse extends js.Object {
    var Suggesters: SuggesterStatusList
  }

  object DescribeSuggestersResponse {
    def apply(
        Suggesters: SuggesterStatusList
    ): DescribeSuggestersResponse = {
      val __obj = js.Dictionary[js.Any](
        "Suggesters" -> Suggesters.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSuggestersResponse]
    }
  }

  /**
    * The request was rejected because it attempted an operation which is not enabled.
    */
  @js.native
  trait DisabledOperationExceptionException extends js.Object {}

  /**
    * Options for a search suggester.
    */
  @js.native
  trait DocumentSuggesterOptions extends js.Object {
    var SourceField: FieldName
    var FuzzyMatching: js.UndefOr[SuggesterFuzzyMatching]
    var SortExpression: js.UndefOr[String]
  }

  object DocumentSuggesterOptions {
    def apply(
        SourceField: FieldName,
        FuzzyMatching: js.UndefOr[SuggesterFuzzyMatching] = js.undefined,
        SortExpression: js.UndefOr[String] = js.undefined
    ): DocumentSuggesterOptions = {
      val __obj = js.Dictionary[js.Any](
        "SourceField" -> SourceField.asInstanceOf[js.Any]
      )

      FuzzyMatching.foreach(__v => __obj.update("FuzzyMatching", __v.asInstanceOf[js.Any]))
      SortExpression.foreach(__v => __obj.update("SortExpression", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentSuggesterOptions]
    }
  }

  /**
    * The current status of the search domain.
    */
  @js.native
  trait DomainStatus extends js.Object {
    var DomainId: DomainId
    var DomainName: DomainName
    var RequiresIndexDocuments: Boolean
    var ARN: js.UndefOr[ARN]
    var Created: js.UndefOr[Boolean]
    var Deleted: js.UndefOr[Boolean]
    var DocService: js.UndefOr[ServiceEndpoint]
    var Limits: js.UndefOr[Limits]
    var Processing: js.UndefOr[Boolean]
    var SearchInstanceCount: js.UndefOr[InstanceCount]
    var SearchInstanceType: js.UndefOr[SearchInstanceType]
    var SearchPartitionCount: js.UndefOr[PartitionCount]
    var SearchService: js.UndefOr[ServiceEndpoint]
  }

  object DomainStatus {
    def apply(
        DomainId: DomainId,
        DomainName: DomainName,
        RequiresIndexDocuments: Boolean,
        ARN: js.UndefOr[ARN] = js.undefined,
        Created: js.UndefOr[Boolean] = js.undefined,
        Deleted: js.UndefOr[Boolean] = js.undefined,
        DocService: js.UndefOr[ServiceEndpoint] = js.undefined,
        Limits: js.UndefOr[Limits] = js.undefined,
        Processing: js.UndefOr[Boolean] = js.undefined,
        SearchInstanceCount: js.UndefOr[InstanceCount] = js.undefined,
        SearchInstanceType: js.UndefOr[SearchInstanceType] = js.undefined,
        SearchPartitionCount: js.UndefOr[PartitionCount] = js.undefined,
        SearchService: js.UndefOr[ServiceEndpoint] = js.undefined
    ): DomainStatus = {
      val __obj = js.Dictionary[js.Any](
        "DomainId"               -> DomainId.asInstanceOf[js.Any],
        "DomainName"             -> DomainName.asInstanceOf[js.Any],
        "RequiresIndexDocuments" -> RequiresIndexDocuments.asInstanceOf[js.Any]
      )

      ARN.foreach(__v => __obj.update("ARN", __v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.update("Created", __v.asInstanceOf[js.Any]))
      Deleted.foreach(__v => __obj.update("Deleted", __v.asInstanceOf[js.Any]))
      DocService.foreach(__v => __obj.update("DocService", __v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.update("Limits", __v.asInstanceOf[js.Any]))
      Processing.foreach(__v => __obj.update("Processing", __v.asInstanceOf[js.Any]))
      SearchInstanceCount.foreach(__v => __obj.update("SearchInstanceCount", __v.asInstanceOf[js.Any]))
      SearchInstanceType.foreach(__v => __obj.update("SearchInstanceType", __v.asInstanceOf[js.Any]))
      SearchPartitionCount.foreach(__v => __obj.update("SearchPartitionCount", __v.asInstanceOf[js.Any]))
      SearchService.foreach(__v => __obj.update("SearchService", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainStatus]
    }
  }

  /**
    * Options for a field that contains an array of double-precision 64-bit floating point values. Present if <code>IndexFieldType</code> specifies the field is of type <code>double-array</code>. All options are enabled by default.
    */
  @js.native
  trait DoubleArrayOptions extends js.Object {
    var DefaultValue: js.UndefOr[Double]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SourceFields: js.UndefOr[FieldNameCommaList]
  }

  object DoubleArrayOptions {
    def apply(
        DefaultValue: js.UndefOr[Double] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
    ): DoubleArrayOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.update("FacetEnabled", __v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.update("ReturnEnabled", __v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.update("SearchEnabled", __v.asInstanceOf[js.Any]))
      SourceFields.foreach(__v => __obj.update("SourceFields", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DoubleArrayOptions]
    }
  }

  /**
    * Options for a double-precision 64-bit floating point field. Present if <code>IndexFieldType</code> specifies the field is of type <code>double</code>. All options are enabled by default.
    */
  @js.native
  trait DoubleOptions extends js.Object {
    var DefaultValue: js.UndefOr[Double]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SortEnabled: js.UndefOr[Boolean]
    var SourceField: js.UndefOr[FieldName]
  }

  object DoubleOptions {
    def apply(
        DefaultValue: js.UndefOr[Double] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SortEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceField: js.UndefOr[FieldName] = js.undefined
    ): DoubleOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.update("FacetEnabled", __v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.update("ReturnEnabled", __v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.update("SearchEnabled", __v.asInstanceOf[js.Any]))
      SortEnabled.foreach(__v => __obj.update("SortEnabled", __v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.update("SourceField", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DoubleOptions]
    }
  }

  /**
    * A named expression that can be evaluated at search time. Can be used to sort the search results, define other expressions, or return computed information in the search results.
    */
  @js.native
  trait Expression extends js.Object {
    var ExpressionName: StandardName
    var ExpressionValue: ExpressionValue
  }

  object Expression {
    def apply(
        ExpressionName: StandardName,
        ExpressionValue: ExpressionValue
    ): Expression = {
      val __obj = js.Dictionary[js.Any](
        "ExpressionName"  -> ExpressionName.asInstanceOf[js.Any],
        "ExpressionValue" -> ExpressionValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Expression]
    }
  }

  /**
    * The value of an <code>Expression</code> and its current status.
    */
  @js.native
  trait ExpressionStatus extends js.Object {
    var Options: Expression
    var Status: OptionStatus
  }

  object ExpressionStatus {
    def apply(
        Options: Expression,
        Status: OptionStatus
    ): ExpressionStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExpressionStatus]
    }
  }

  /**
    * Container for the parameters to the <code><a>IndexDocuments</a></code> operation. Specifies the name of the domain you want to re-index.
    */
  @js.native
  trait IndexDocumentsRequest extends js.Object {
    var DomainName: DomainName
  }

  object IndexDocumentsRequest {
    def apply(
        DomainName: DomainName
    ): IndexDocumentsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[IndexDocumentsRequest]
    }
  }

  /**
    * The result of an <code>IndexDocuments</code> request. Contains the status of the indexing operation, including the fields being indexed.
    */
  @js.native
  trait IndexDocumentsResponse extends js.Object {
    var FieldNames: js.UndefOr[FieldNameList]
  }

  object IndexDocumentsResponse {
    def apply(
        FieldNames: js.UndefOr[FieldNameList] = js.undefined
    ): IndexDocumentsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FieldNames.foreach(__v => __obj.update("FieldNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IndexDocumentsResponse]
    }
  }

  /**
    * Configuration information for a field in the index, including its name, type, and options. The supported options depend on the <code><a>IndexFieldType</a></code>.
    */
  @js.native
  trait IndexField extends js.Object {
    var IndexFieldName: DynamicFieldName
    var IndexFieldType: IndexFieldType
    var DateArrayOptions: js.UndefOr[DateArrayOptions]
    var DateOptions: js.UndefOr[DateOptions]
    var DoubleArrayOptions: js.UndefOr[DoubleArrayOptions]
    var DoubleOptions: js.UndefOr[DoubleOptions]
    var IntArrayOptions: js.UndefOr[IntArrayOptions]
    var IntOptions: js.UndefOr[IntOptions]
    var LatLonOptions: js.UndefOr[LatLonOptions]
    var LiteralArrayOptions: js.UndefOr[LiteralArrayOptions]
    var LiteralOptions: js.UndefOr[LiteralOptions]
    var TextArrayOptions: js.UndefOr[TextArrayOptions]
    var TextOptions: js.UndefOr[TextOptions]
  }

  object IndexField {
    def apply(
        IndexFieldName: DynamicFieldName,
        IndexFieldType: IndexFieldType,
        DateArrayOptions: js.UndefOr[DateArrayOptions] = js.undefined,
        DateOptions: js.UndefOr[DateOptions] = js.undefined,
        DoubleArrayOptions: js.UndefOr[DoubleArrayOptions] = js.undefined,
        DoubleOptions: js.UndefOr[DoubleOptions] = js.undefined,
        IntArrayOptions: js.UndefOr[IntArrayOptions] = js.undefined,
        IntOptions: js.UndefOr[IntOptions] = js.undefined,
        LatLonOptions: js.UndefOr[LatLonOptions] = js.undefined,
        LiteralArrayOptions: js.UndefOr[LiteralArrayOptions] = js.undefined,
        LiteralOptions: js.UndefOr[LiteralOptions] = js.undefined,
        TextArrayOptions: js.UndefOr[TextArrayOptions] = js.undefined,
        TextOptions: js.UndefOr[TextOptions] = js.undefined
    ): IndexField = {
      val __obj = js.Dictionary[js.Any](
        "IndexFieldName" -> IndexFieldName.asInstanceOf[js.Any],
        "IndexFieldType" -> IndexFieldType.asInstanceOf[js.Any]
      )

      DateArrayOptions.foreach(__v => __obj.update("DateArrayOptions", __v.asInstanceOf[js.Any]))
      DateOptions.foreach(__v => __obj.update("DateOptions", __v.asInstanceOf[js.Any]))
      DoubleArrayOptions.foreach(__v => __obj.update("DoubleArrayOptions", __v.asInstanceOf[js.Any]))
      DoubleOptions.foreach(__v => __obj.update("DoubleOptions", __v.asInstanceOf[js.Any]))
      IntArrayOptions.foreach(__v => __obj.update("IntArrayOptions", __v.asInstanceOf[js.Any]))
      IntOptions.foreach(__v => __obj.update("IntOptions", __v.asInstanceOf[js.Any]))
      LatLonOptions.foreach(__v => __obj.update("LatLonOptions", __v.asInstanceOf[js.Any]))
      LiteralArrayOptions.foreach(__v => __obj.update("LiteralArrayOptions", __v.asInstanceOf[js.Any]))
      LiteralOptions.foreach(__v => __obj.update("LiteralOptions", __v.asInstanceOf[js.Any]))
      TextArrayOptions.foreach(__v => __obj.update("TextArrayOptions", __v.asInstanceOf[js.Any]))
      TextOptions.foreach(__v => __obj.update("TextOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IndexField]
    }
  }

  /**
    * The value of an <code>IndexField</code> and its current status.
    */
  @js.native
  trait IndexFieldStatus extends js.Object {
    var Options: IndexField
    var Status: OptionStatus
  }

  object IndexFieldStatus {
    def apply(
        Options: IndexField,
        Status: OptionStatus
    ): IndexFieldStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[IndexFieldStatus]
    }
  }

  /**
    * The type of field. The valid options for a field depend on the field type. For more information about the supported field types, see <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html" target="_blank">Configuring Index Fields</a> in the <i>Amazon CloudSearch Developer Guide</i>.
    */
  object IndexFieldTypeEnum {
    val int             = "int"
    val double          = "double"
    val literal         = "literal"
    val text            = "text"
    val date            = "date"
    val latlon          = "latlon"
    val `int-array`     = "int-array"
    val `double-array`  = "double-array"
    val `literal-array` = "literal-array"
    val `text-array`    = "text-array"
    val `date-array`    = "date-array"

    val values = js.Object.freeze(
      js.Array(
        int,
        double,
        literal,
        text,
        date,
        latlon,
        `int-array`,
        `double-array`,
        `literal-array`,
        `text-array`,
        `date-array`
      )
    )
  }

  /**
    * Options for a field that contains an array of 64-bit signed integers. Present if <code>IndexFieldType</code> specifies the field is of type <code>int-array</code>. All options are enabled by default.
    */
  @js.native
  trait IntArrayOptions extends js.Object {
    var DefaultValue: js.UndefOr[Double]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SourceFields: js.UndefOr[FieldNameCommaList]
  }

  object IntArrayOptions {
    def apply(
        DefaultValue: js.UndefOr[Double] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
    ): IntArrayOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.update("FacetEnabled", __v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.update("ReturnEnabled", __v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.update("SearchEnabled", __v.asInstanceOf[js.Any]))
      SourceFields.foreach(__v => __obj.update("SourceFields", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntArrayOptions]
    }
  }

  /**
    * Options for a 64-bit signed integer field. Present if <code>IndexFieldType</code> specifies the field is of type <code>int</code>. All options are enabled by default.
    */
  @js.native
  trait IntOptions extends js.Object {
    var DefaultValue: js.UndefOr[Double]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SortEnabled: js.UndefOr[Boolean]
    var SourceField: js.UndefOr[FieldName]
  }

  object IntOptions {
    def apply(
        DefaultValue: js.UndefOr[Double] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SortEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceField: js.UndefOr[FieldName] = js.undefined
    ): IntOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.update("FacetEnabled", __v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.update("ReturnEnabled", __v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.update("SearchEnabled", __v.asInstanceOf[js.Any]))
      SortEnabled.foreach(__v => __obj.update("SortEnabled", __v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.update("SourceField", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntOptions]
    }
  }

  /**
    * An internal error occurred while processing the request. If this problem persists, report an issue from the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
    */
  @js.native
  trait InternalExceptionException extends js.Object {}

  /**
    * The request was rejected because it specified an invalid type definition.
    */
  @js.native
  trait InvalidTypeExceptionException extends js.Object {}

  /**
    * Options for a latlon field. A latlon field contains a location stored as a latitude and longitude value pair. Present if <code>IndexFieldType</code> specifies the field is of type <code>latlon</code>. All options are enabled by default.
    */
  @js.native
  trait LatLonOptions extends js.Object {
    var DefaultValue: js.UndefOr[FieldValue]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SortEnabled: js.UndefOr[Boolean]
    var SourceField: js.UndefOr[FieldName]
  }

  object LatLonOptions {
    def apply(
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SortEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceField: js.UndefOr[FieldName] = js.undefined
    ): LatLonOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.update("FacetEnabled", __v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.update("ReturnEnabled", __v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.update("SearchEnabled", __v.asInstanceOf[js.Any]))
      SortEnabled.foreach(__v => __obj.update("SortEnabled", __v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.update("SourceField", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LatLonOptions]
    }
  }

  /**
    * The request was rejected because a resource limit has already been met.
    */
  @js.native
  trait LimitExceededExceptionException extends js.Object {}

  @js.native
  trait Limits extends js.Object {
    var MaximumPartitionCount: MaximumPartitionCount
    var MaximumReplicationCount: MaximumReplicationCount
  }

  object Limits {
    def apply(
        MaximumPartitionCount: MaximumPartitionCount,
        MaximumReplicationCount: MaximumReplicationCount
    ): Limits = {
      val __obj = js.Dictionary[js.Any](
        "MaximumPartitionCount"   -> MaximumPartitionCount.asInstanceOf[js.Any],
        "MaximumReplicationCount" -> MaximumReplicationCount.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Limits]
    }
  }

  /**
    * The result of a <code>ListDomainNames</code> request. Contains a list of the domains owned by an account.
    */
  @js.native
  trait ListDomainNamesResponse extends js.Object {
    var DomainNames: js.UndefOr[DomainNameMap]
  }

  object ListDomainNamesResponse {
    def apply(
        DomainNames: js.UndefOr[DomainNameMap] = js.undefined
    ): ListDomainNamesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DomainNames.foreach(__v => __obj.update("DomainNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainNamesResponse]
    }
  }

  /**
    * Options for a field that contains an array of literal strings. Present if <code>IndexFieldType</code> specifies the field is of type <code>literal-array</code>. All options are enabled by default.
    */
  @js.native
  trait LiteralArrayOptions extends js.Object {
    var DefaultValue: js.UndefOr[FieldValue]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SourceFields: js.UndefOr[FieldNameCommaList]
  }

  object LiteralArrayOptions {
    def apply(
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
    ): LiteralArrayOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.update("FacetEnabled", __v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.update("ReturnEnabled", __v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.update("SearchEnabled", __v.asInstanceOf[js.Any]))
      SourceFields.foreach(__v => __obj.update("SourceFields", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LiteralArrayOptions]
    }
  }

  /**
    * Options for literal field. Present if <code>IndexFieldType</code> specifies the field is of type <code>literal</code>. All options are enabled by default.
    */
  @js.native
  trait LiteralOptions extends js.Object {
    var DefaultValue: js.UndefOr[FieldValue]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SortEnabled: js.UndefOr[Boolean]
    var SourceField: js.UndefOr[FieldName]
  }

  object LiteralOptions {
    def apply(
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SortEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceField: js.UndefOr[FieldName] = js.undefined
    ): LiteralOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.update("FacetEnabled", __v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.update("ReturnEnabled", __v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.update("SearchEnabled", __v.asInstanceOf[js.Any]))
      SortEnabled.foreach(__v => __obj.update("SortEnabled", __v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.update("SourceField", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LiteralOptions]
    }
  }

  /**
    * The state of processing a change to an option. One of:
    * * RequiresIndexDocuments: The option's latest value will not be deployed until <a>IndexDocuments</a> has been called and indexing is complete.
    *  * Processing: The option's latest value is in the process of being activated.
    *  * Active: The option's latest value is fully deployed.
    *  * FailedToValidate: The option value is not compatible with the domain's data and cannot be used to index the data. You must either modify the option value or update or remove the incompatible documents.
    */
  object OptionStateEnum {
    val RequiresIndexDocuments = "RequiresIndexDocuments"
    val Processing             = "Processing"
    val Active                 = "Active"
    val FailedToValidate       = "FailedToValidate"

    val values = js.Object.freeze(js.Array(RequiresIndexDocuments, Processing, Active, FailedToValidate))
  }

  /**
    * The status of domain configuration option.
    */
  @js.native
  trait OptionStatus extends js.Object {
    var CreationDate: UpdateTimestamp
    var State: OptionState
    var UpdateDate: UpdateTimestamp
    var PendingDeletion: js.UndefOr[Boolean]
    var UpdateVersion: js.UndefOr[UIntValue]
  }

  object OptionStatus {
    def apply(
        CreationDate: UpdateTimestamp,
        State: OptionState,
        UpdateDate: UpdateTimestamp,
        PendingDeletion: js.UndefOr[Boolean] = js.undefined,
        UpdateVersion: js.UndefOr[UIntValue] = js.undefined
    ): OptionStatus = {
      val __obj = js.Dictionary[js.Any](
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "State"        -> State.asInstanceOf[js.Any],
        "UpdateDate"   -> UpdateDate.asInstanceOf[js.Any]
      )

      PendingDeletion.foreach(__v => __obj.update("PendingDeletion", __v.asInstanceOf[js.Any]))
      UpdateVersion.foreach(__v => __obj.update("UpdateVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionStatus]
    }
  }

  /**
    * The instance type (such as <code>search.m1.small</code>) on which an index partition is hosted.
    */
  object PartitionInstanceTypeEnum {
    val `search.m1.small`   = "search.m1.small"
    val `search.m1.large`   = "search.m1.large"
    val `search.m2.xlarge`  = "search.m2.xlarge"
    val `search.m2.2xlarge` = "search.m2.2xlarge"
    val `search.m3.medium`  = "search.m3.medium"
    val `search.m3.large`   = "search.m3.large"
    val `search.m3.xlarge`  = "search.m3.xlarge"
    val `search.m3.2xlarge` = "search.m3.2xlarge"

    val values = js.Object.freeze(
      js.Array(
        `search.m1.small`,
        `search.m1.large`,
        `search.m2.xlarge`,
        `search.m2.2xlarge`,
        `search.m3.medium`,
        `search.m3.large`,
        `search.m3.xlarge`,
        `search.m3.2xlarge`
      )
    )
  }

  /**
    * The request was rejected because it attempted to reference a resource that does not exist.
    */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {}

  /**
    * The desired instance type and desired number of replicas of each index partition.
    */
  @js.native
  trait ScalingParameters extends js.Object {
    var DesiredInstanceType: js.UndefOr[PartitionInstanceType]
    var DesiredPartitionCount: js.UndefOr[UIntValue]
    var DesiredReplicationCount: js.UndefOr[UIntValue]
  }

  object ScalingParameters {
    def apply(
        DesiredInstanceType: js.UndefOr[PartitionInstanceType] = js.undefined,
        DesiredPartitionCount: js.UndefOr[UIntValue] = js.undefined,
        DesiredReplicationCount: js.UndefOr[UIntValue] = js.undefined
    ): ScalingParameters = {
      val __obj = js.Dictionary.empty[js.Any]
      DesiredInstanceType.foreach(__v => __obj.update("DesiredInstanceType", __v.asInstanceOf[js.Any]))
      DesiredPartitionCount.foreach(__v => __obj.update("DesiredPartitionCount", __v.asInstanceOf[js.Any]))
      DesiredReplicationCount.foreach(__v => __obj.update("DesiredReplicationCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingParameters]
    }
  }

  /**
    * The status and configuration of a search domain's scaling parameters.
    */
  @js.native
  trait ScalingParametersStatus extends js.Object {
    var Options: ScalingParameters
    var Status: OptionStatus
  }

  object ScalingParametersStatus {
    def apply(
        Options: ScalingParameters,
        Status: OptionStatus
    ): ScalingParametersStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ScalingParametersStatus]
    }
  }

  /**
    * The endpoint to which service requests can be submitted.
    */
  @js.native
  trait ServiceEndpoint extends js.Object {
    var Endpoint: js.UndefOr[ServiceUrl]
  }

  object ServiceEndpoint {
    def apply(
        Endpoint: js.UndefOr[ServiceUrl] = js.undefined
    ): ServiceEndpoint = {
      val __obj = js.Dictionary.empty[js.Any]
      Endpoint.foreach(__v => __obj.update("Endpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceEndpoint]
    }
  }

  /**
    * Configuration information for a search suggester. Each suggester has a unique name and specifies the text field you want to use for suggestions. The following options can be configured for a suggester: <code>FuzzyMatching</code>, <code>SortExpression</code>.
    */
  @js.native
  trait Suggester extends js.Object {
    var DocumentSuggesterOptions: DocumentSuggesterOptions
    var SuggesterName: StandardName
  }

  object Suggester {
    def apply(
        DocumentSuggesterOptions: DocumentSuggesterOptions,
        SuggesterName: StandardName
    ): Suggester = {
      val __obj = js.Dictionary[js.Any](
        "DocumentSuggesterOptions" -> DocumentSuggesterOptions.asInstanceOf[js.Any],
        "SuggesterName"            -> SuggesterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Suggester]
    }
  }

  object SuggesterFuzzyMatchingEnum {
    val none = "none"
    val low  = "low"
    val high = "high"

    val values = js.Object.freeze(js.Array(none, low, high))
  }

  /**
    * The value of a <code>Suggester</code> and its current status.
    */
  @js.native
  trait SuggesterStatus extends js.Object {
    var Options: Suggester
    var Status: OptionStatus
  }

  object SuggesterStatus {
    def apply(
        Options: Suggester,
        Status: OptionStatus
    ): SuggesterStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SuggesterStatus]
    }
  }

  /**
    * Options for a field that contains an array of text strings. Present if <code>IndexFieldType</code> specifies the field is of type <code>text-array</code>. A <code>text-array</code> field is always searchable. All options are enabled by default.
    */
  @js.native
  trait TextArrayOptions extends js.Object {
    var AnalysisScheme: js.UndefOr[Word]
    var DefaultValue: js.UndefOr[FieldValue]
    var HighlightEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SourceFields: js.UndefOr[FieldNameCommaList]
  }

  object TextArrayOptions {
    def apply(
        AnalysisScheme: js.UndefOr[Word] = js.undefined,
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        HighlightEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
    ): TextArrayOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      AnalysisScheme.foreach(__v => __obj.update("AnalysisScheme", __v.asInstanceOf[js.Any]))
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      HighlightEnabled.foreach(__v => __obj.update("HighlightEnabled", __v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.update("ReturnEnabled", __v.asInstanceOf[js.Any]))
      SourceFields.foreach(__v => __obj.update("SourceFields", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextArrayOptions]
    }
  }

  /**
    * Options for text field. Present if <code>IndexFieldType</code> specifies the field is of type <code>text</code>. A <code>text</code> field is always searchable. All options are enabled by default.
    */
  @js.native
  trait TextOptions extends js.Object {
    var AnalysisScheme: js.UndefOr[Word]
    var DefaultValue: js.UndefOr[FieldValue]
    var HighlightEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SortEnabled: js.UndefOr[Boolean]
    var SourceField: js.UndefOr[FieldName]
  }

  object TextOptions {
    def apply(
        AnalysisScheme: js.UndefOr[Word] = js.undefined,
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        HighlightEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SortEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceField: js.UndefOr[FieldName] = js.undefined
    ): TextOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      AnalysisScheme.foreach(__v => __obj.update("AnalysisScheme", __v.asInstanceOf[js.Any]))
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      HighlightEnabled.foreach(__v => __obj.update("HighlightEnabled", __v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.update("ReturnEnabled", __v.asInstanceOf[js.Any]))
      SortEnabled.foreach(__v => __obj.update("SortEnabled", __v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.update("SourceField", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextOptions]
    }
  }

  /**
    * Container for the parameters to the <code><a>UpdateAvailabilityOptions</a></code> operation. Specifies the name of the domain you want to update and the Multi-AZ availability option.
    */
  @js.native
  trait UpdateAvailabilityOptionsRequest extends js.Object {
    var DomainName: DomainName
    var MultiAZ: Boolean
  }

  object UpdateAvailabilityOptionsRequest {
    def apply(
        DomainName: DomainName,
        MultiAZ: Boolean
    ): UpdateAvailabilityOptionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "MultiAZ"    -> MultiAZ.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateAvailabilityOptionsRequest]
    }
  }

  /**
    * The result of a <code>UpdateAvailabilityOptions</code> request. Contains the status of the domain's availability options.
    */
  @js.native
  trait UpdateAvailabilityOptionsResponse extends js.Object {
    var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus]
  }

  object UpdateAvailabilityOptionsResponse {
    def apply(
        AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.undefined
    ): UpdateAvailabilityOptionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityOptions.foreach(__v => __obj.update("AvailabilityOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAvailabilityOptionsResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>UpdateScalingParameters</a></code> operation. Specifies the name of the domain you want to update and the scaling parameters you want to configure.
    */
  @js.native
  trait UpdateScalingParametersRequest extends js.Object {
    var DomainName: DomainName
    var ScalingParameters: ScalingParameters
  }

  object UpdateScalingParametersRequest {
    def apply(
        DomainName: DomainName,
        ScalingParameters: ScalingParameters
    ): UpdateScalingParametersRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName"        -> DomainName.asInstanceOf[js.Any],
        "ScalingParameters" -> ScalingParameters.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateScalingParametersRequest]
    }
  }

  /**
    * The result of a <code>UpdateScalingParameters</code> request. Contains the status of the newly-configured scaling parameters.
    */
  @js.native
  trait UpdateScalingParametersResponse extends js.Object {
    var ScalingParameters: ScalingParametersStatus
  }

  object UpdateScalingParametersResponse {
    def apply(
        ScalingParameters: ScalingParametersStatus
    ): UpdateScalingParametersResponse = {
      val __obj = js.Dictionary[js.Any](
        "ScalingParameters" -> ScalingParameters.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateScalingParametersResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>UpdateServiceAccessPolicies</a></code> operation. Specifies the name of the domain you want to update and the access rules you want to configure.
    */
  @js.native
  trait UpdateServiceAccessPoliciesRequest extends js.Object {
    var AccessPolicies: PolicyDocument
    var DomainName: DomainName
  }

  object UpdateServiceAccessPoliciesRequest {
    def apply(
        AccessPolicies: PolicyDocument,
        DomainName: DomainName
    ): UpdateServiceAccessPoliciesRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccessPolicies" -> AccessPolicies.asInstanceOf[js.Any],
        "DomainName"     -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateServiceAccessPoliciesRequest]
    }
  }

  /**
    * The result of an <code>UpdateServiceAccessPolicies</code> request. Contains the new access policies.
    */
  @js.native
  trait UpdateServiceAccessPoliciesResponse extends js.Object {
    var AccessPolicies: AccessPoliciesStatus
  }

  object UpdateServiceAccessPoliciesResponse {
    def apply(
        AccessPolicies: AccessPoliciesStatus
    ): UpdateServiceAccessPoliciesResponse = {
      val __obj = js.Dictionary[js.Any](
        "AccessPolicies" -> AccessPolicies.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateServiceAccessPoliciesResponse]
    }
  }
}
