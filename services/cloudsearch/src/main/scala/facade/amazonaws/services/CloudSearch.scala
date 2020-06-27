package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cloudsearch {
  type APIVersion               = String
  type ARN                      = String
  type AnalysisSchemeStatusList = js.Array[AnalysisSchemeStatus]
  type DomainId                 = String
  type DomainName               = String
  type DomainNameList           = js.Array[DomainName]
  type DomainNameMap            = js.Dictionary[APIVersion]
  type DomainStatusList         = js.Array[DomainStatus]
  type DynamicFieldName         = String
  type DynamicFieldNameList     = js.Array[DynamicFieldName]
  type ExpressionStatusList     = js.Array[ExpressionStatus]
  type ExpressionValue          = String
  type FieldName                = String
  type FieldNameCommaList       = String
  type FieldNameList            = js.Array[FieldName]
  type FieldValue               = String
  type IndexFieldStatusList     = js.Array[IndexFieldStatus]
  type InstanceCount            = Int
  type MaximumPartitionCount    = Int
  type MaximumReplicationCount  = Int
  type MultiAZ                  = Boolean
  type PartitionCount           = Int
  type PolicyDocument           = String
  type SearchInstanceType       = String
  type ServiceUrl               = String
  type StandardName             = String
  type StandardNameList         = js.Array[StandardName]
  type SuggesterStatusList      = js.Array[SuggesterStatus]
  type UIntValue                = Int
  type UpdateTimestamp          = js.Date
  type Word                     = String

  implicit final class CloudSearchOps(private val service: CloudSearch) extends AnyVal {

    @inline def buildSuggestersFuture(params: BuildSuggestersRequest): Future[BuildSuggestersResponse] =
      service.buildSuggesters(params).promise().toFuture
    @inline def createDomainFuture(params: CreateDomainRequest): Future[CreateDomainResponse] =
      service.createDomain(params).promise().toFuture
    @inline def defineAnalysisSchemeFuture(params: DefineAnalysisSchemeRequest): Future[DefineAnalysisSchemeResponse] =
      service.defineAnalysisScheme(params).promise().toFuture
    @inline def defineExpressionFuture(params: DefineExpressionRequest): Future[DefineExpressionResponse] =
      service.defineExpression(params).promise().toFuture
    @inline def defineIndexFieldFuture(params: DefineIndexFieldRequest): Future[DefineIndexFieldResponse] =
      service.defineIndexField(params).promise().toFuture
    @inline def defineSuggesterFuture(params: DefineSuggesterRequest): Future[DefineSuggesterResponse] =
      service.defineSuggester(params).promise().toFuture
    @inline def deleteAnalysisSchemeFuture(params: DeleteAnalysisSchemeRequest): Future[DeleteAnalysisSchemeResponse] =
      service.deleteAnalysisScheme(params).promise().toFuture
    @inline def deleteDomainFuture(params: DeleteDomainRequest): Future[DeleteDomainResponse] =
      service.deleteDomain(params).promise().toFuture
    @inline def deleteExpressionFuture(params: DeleteExpressionRequest): Future[DeleteExpressionResponse] =
      service.deleteExpression(params).promise().toFuture
    @inline def deleteIndexFieldFuture(params: DeleteIndexFieldRequest): Future[DeleteIndexFieldResponse] =
      service.deleteIndexField(params).promise().toFuture
    @inline def deleteSuggesterFuture(params: DeleteSuggesterRequest): Future[DeleteSuggesterResponse] =
      service.deleteSuggester(params).promise().toFuture
    @inline def describeAnalysisSchemesFuture(
        params: DescribeAnalysisSchemesRequest
    ): Future[DescribeAnalysisSchemesResponse] = service.describeAnalysisSchemes(params).promise().toFuture
    @inline def describeAvailabilityOptionsFuture(
        params: DescribeAvailabilityOptionsRequest
    ): Future[DescribeAvailabilityOptionsResponse] = service.describeAvailabilityOptions(params).promise().toFuture
    @inline def describeDomainEndpointOptionsFuture(
        params: DescribeDomainEndpointOptionsRequest
    ): Future[DescribeDomainEndpointOptionsResponse] = service.describeDomainEndpointOptions(params).promise().toFuture
    @inline def describeDomainsFuture(params: DescribeDomainsRequest): Future[DescribeDomainsResponse] =
      service.describeDomains(params).promise().toFuture
    @inline def describeExpressionsFuture(params: DescribeExpressionsRequest): Future[DescribeExpressionsResponse] =
      service.describeExpressions(params).promise().toFuture
    @inline def describeIndexFieldsFuture(params: DescribeIndexFieldsRequest): Future[DescribeIndexFieldsResponse] =
      service.describeIndexFields(params).promise().toFuture
    @inline def describeScalingParametersFuture(
        params: DescribeScalingParametersRequest
    ): Future[DescribeScalingParametersResponse] = service.describeScalingParameters(params).promise().toFuture
    @inline def describeServiceAccessPoliciesFuture(
        params: DescribeServiceAccessPoliciesRequest
    ): Future[DescribeServiceAccessPoliciesResponse] = service.describeServiceAccessPolicies(params).promise().toFuture
    @inline def describeSuggestersFuture(params: DescribeSuggestersRequest): Future[DescribeSuggestersResponse] =
      service.describeSuggesters(params).promise().toFuture
    @inline def indexDocumentsFuture(params: IndexDocumentsRequest): Future[IndexDocumentsResponse] =
      service.indexDocuments(params).promise().toFuture
    @inline def listDomainNamesFuture(): Future[ListDomainNamesResponse] = service.listDomainNames().promise().toFuture
    @inline def updateAvailabilityOptionsFuture(
        params: UpdateAvailabilityOptionsRequest
    ): Future[UpdateAvailabilityOptionsResponse] = service.updateAvailabilityOptions(params).promise().toFuture
    @inline def updateDomainEndpointOptionsFuture(
        params: UpdateDomainEndpointOptionsRequest
    ): Future[UpdateDomainEndpointOptionsResponse] = service.updateDomainEndpointOptions(params).promise().toFuture
    @inline def updateScalingParametersFuture(
        params: UpdateScalingParametersRequest
    ): Future[UpdateScalingParametersResponse] = service.updateScalingParameters(params).promise().toFuture
    @inline def updateServiceAccessPoliciesFuture(
        params: UpdateServiceAccessPoliciesRequest
    ): Future[UpdateServiceAccessPoliciesResponse] = service.updateServiceAccessPolicies(params).promise().toFuture
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
    ): Request[DescribeAvailabilityOptionsResponse] = js.native
    def describeDomainEndpointOptions(
        params: DescribeDomainEndpointOptionsRequest
    ): Request[DescribeDomainEndpointOptionsResponse]                                                 = js.native
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
    def updateDomainEndpointOptions(
        params: UpdateDomainEndpointOptionsRequest
    ): Request[UpdateDomainEndpointOptionsResponse] = js.native
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
  @Factory
  trait AccessPoliciesStatus extends js.Object {
    var Options: PolicyDocument
    var Status: OptionStatus
  }

  @js.native
  sealed trait AlgorithmicStemming extends js.Any
  object AlgorithmicStemming extends js.Object {
    val none    = "none".asInstanceOf[AlgorithmicStemming]
    val minimal = "minimal".asInstanceOf[AlgorithmicStemming]
    val light   = "light".asInstanceOf[AlgorithmicStemming]
    val full    = "full".asInstanceOf[AlgorithmicStemming]

    val values = js.Object.freeze(js.Array(none, minimal, light, full))
  }

  /**
    * Synonyms, stopwords, and stemming options for an analysis scheme. Includes tokenization dictionary for Japanese.
    */
  @js.native
  @Factory
  trait AnalysisOptions extends js.Object {
    var AlgorithmicStemming: js.UndefOr[AlgorithmicStemming]
    var JapaneseTokenizationDictionary: js.UndefOr[String]
    var StemmingDictionary: js.UndefOr[String]
    var Stopwords: js.UndefOr[String]
    var Synonyms: js.UndefOr[String]
  }

  /**
    * Configuration information for an analysis scheme. Each analysis scheme has a unique name and specifies the language of the text to be processed. The following options can be configured for an analysis scheme: <code>Synonyms</code>, <code>Stopwords</code>, <code>StemmingDictionary</code>, <code>JapaneseTokenizationDictionary</code> and <code>AlgorithmicStemming</code>.
    */
  @js.native
  @Factory
  trait AnalysisScheme extends js.Object {
    var AnalysisSchemeLanguage: AnalysisSchemeLanguage
    var AnalysisSchemeName: StandardName
    var AnalysisOptions: js.UndefOr[AnalysisOptions]
  }

  /**
    * An <a href="http://tools.ietf.org/html/rfc4646" target="_blank">IETF RFC 4646</a> language code or <code>mul</code> for multiple languages.
    */
  @js.native
  sealed trait AnalysisSchemeLanguage extends js.Any
  object AnalysisSchemeLanguage extends js.Object {
    val ar        = "ar".asInstanceOf[AnalysisSchemeLanguage]
    val bg        = "bg".asInstanceOf[AnalysisSchemeLanguage]
    val ca        = "ca".asInstanceOf[AnalysisSchemeLanguage]
    val cs        = "cs".asInstanceOf[AnalysisSchemeLanguage]
    val da        = "da".asInstanceOf[AnalysisSchemeLanguage]
    val de        = "de".asInstanceOf[AnalysisSchemeLanguage]
    val el        = "el".asInstanceOf[AnalysisSchemeLanguage]
    val en        = "en".asInstanceOf[AnalysisSchemeLanguage]
    val es        = "es".asInstanceOf[AnalysisSchemeLanguage]
    val eu        = "eu".asInstanceOf[AnalysisSchemeLanguage]
    val fa        = "fa".asInstanceOf[AnalysisSchemeLanguage]
    val fi        = "fi".asInstanceOf[AnalysisSchemeLanguage]
    val fr        = "fr".asInstanceOf[AnalysisSchemeLanguage]
    val ga        = "ga".asInstanceOf[AnalysisSchemeLanguage]
    val gl        = "gl".asInstanceOf[AnalysisSchemeLanguage]
    val he        = "he".asInstanceOf[AnalysisSchemeLanguage]
    val hi        = "hi".asInstanceOf[AnalysisSchemeLanguage]
    val hu        = "hu".asInstanceOf[AnalysisSchemeLanguage]
    val hy        = "hy".asInstanceOf[AnalysisSchemeLanguage]
    val id        = "id".asInstanceOf[AnalysisSchemeLanguage]
    val it        = "it".asInstanceOf[AnalysisSchemeLanguage]
    val ja        = "ja".asInstanceOf[AnalysisSchemeLanguage]
    val ko        = "ko".asInstanceOf[AnalysisSchemeLanguage]
    val lv        = "lv".asInstanceOf[AnalysisSchemeLanguage]
    val mul       = "mul".asInstanceOf[AnalysisSchemeLanguage]
    val nl        = "nl".asInstanceOf[AnalysisSchemeLanguage]
    val no        = "no".asInstanceOf[AnalysisSchemeLanguage]
    val pt        = "pt".asInstanceOf[AnalysisSchemeLanguage]
    val ro        = "ro".asInstanceOf[AnalysisSchemeLanguage]
    val ru        = "ru".asInstanceOf[AnalysisSchemeLanguage]
    val sv        = "sv".asInstanceOf[AnalysisSchemeLanguage]
    val th        = "th".asInstanceOf[AnalysisSchemeLanguage]
    val tr        = "tr".asInstanceOf[AnalysisSchemeLanguage]
    val `zh-Hans` = "zh-Hans".asInstanceOf[AnalysisSchemeLanguage]
    val `zh-Hant` = "zh-Hant".asInstanceOf[AnalysisSchemeLanguage]

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
  @Factory
  trait AnalysisSchemeStatus extends js.Object {
    var Options: AnalysisScheme
    var Status: OptionStatus
  }

  /**
    * The status and configuration of the domain's availability options.
    */
  @js.native
  @Factory
  trait AvailabilityOptionsStatus extends js.Object {
    var Options: MultiAZ
    var Status: OptionStatus
  }

  /**
    * Container for the parameters to the <code><a>BuildSuggester</a></code> operation. Specifies the name of the domain you want to update.
    */
  @js.native
  @Factory
  trait BuildSuggestersRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The result of a <code>BuildSuggester</code> request. Contains a list of the fields used for suggestions.
    */
  @js.native
  @Factory
  trait BuildSuggestersResponse extends js.Object {
    var FieldNames: js.UndefOr[FieldNameList]
  }

  /**
    * Container for the parameters to the <code><a>CreateDomain</a></code> operation. Specifies a name for the new search domain.
    */
  @js.native
  @Factory
  trait CreateDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The result of a <code>CreateDomainRequest</code>. Contains the status of a newly created domain.
    */
  @js.native
  @Factory
  trait CreateDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[DomainStatus]
  }

  /**
    * Options for a field that contains an array of dates. Present if <code>IndexFieldType</code> specifies the field is of type <code>date-array</code>. All options are enabled by default.
    */
  @js.native
  @Factory
  trait DateArrayOptions extends js.Object {
    var DefaultValue: js.UndefOr[FieldValue]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SourceFields: js.UndefOr[FieldNameCommaList]
  }

  /**
    * Options for a date field. Dates and times are specified in UTC (Coordinated Universal Time) according to IETF RFC3339: yyyy-mm-ddT00:00:00Z. Present if <code>IndexFieldType</code> specifies the field is of type <code>date</code>. All options are enabled by default.
    */
  @js.native
  @Factory
  trait DateOptions extends js.Object {
    var DefaultValue: js.UndefOr[FieldValue]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SortEnabled: js.UndefOr[Boolean]
    var SourceField: js.UndefOr[FieldName]
  }

  /**
    * Container for the parameters to the <code><a>DefineAnalysisScheme</a></code> operation. Specifies the name of the domain you want to update and the analysis scheme configuration.
    */
  @js.native
  @Factory
  trait DefineAnalysisSchemeRequest extends js.Object {
    var AnalysisScheme: AnalysisScheme
    var DomainName: DomainName
  }

  /**
    * The result of a <code><a>DefineAnalysisScheme</a></code> request. Contains the status of the newly-configured analysis scheme.
    */
  @js.native
  @Factory
  trait DefineAnalysisSchemeResponse extends js.Object {
    var AnalysisScheme: AnalysisSchemeStatus
  }

  /**
    * Container for the parameters to the <code><a>DefineExpression</a></code> operation. Specifies the name of the domain you want to update and the expression you want to configure.
    */
  @js.native
  @Factory
  trait DefineExpressionRequest extends js.Object {
    var DomainName: DomainName
    var Expression: Expression
  }

  /**
    * The result of a <code>DefineExpression</code> request. Contains the status of the newly-configured expression.
    */
  @js.native
  @Factory
  trait DefineExpressionResponse extends js.Object {
    var Expression: ExpressionStatus
  }

  /**
    * Container for the parameters to the <code><a>DefineIndexField</a></code> operation. Specifies the name of the domain you want to update and the index field configuration.
    */
  @js.native
  @Factory
  trait DefineIndexFieldRequest extends js.Object {
    var DomainName: DomainName
    var IndexField: IndexField
  }

  /**
    * The result of a <code><a>DefineIndexField</a></code> request. Contains the status of the newly-configured index field.
    */
  @js.native
  @Factory
  trait DefineIndexFieldResponse extends js.Object {
    var IndexField: IndexFieldStatus
  }

  /**
    * Container for the parameters to the <code><a>DefineSuggester</a></code> operation. Specifies the name of the domain you want to update and the suggester configuration.
    */
  @js.native
  @Factory
  trait DefineSuggesterRequest extends js.Object {
    var DomainName: DomainName
    var Suggester: Suggester
  }

  /**
    * The result of a <code>DefineSuggester</code> request. Contains the status of the newly-configured suggester.
    */
  @js.native
  @Factory
  trait DefineSuggesterResponse extends js.Object {
    var Suggester: SuggesterStatus
  }

  /**
    * Container for the parameters to the <code><a>DeleteAnalysisScheme</a></code> operation. Specifies the name of the domain you want to update and the analysis scheme you want to delete.
    */
  @js.native
  @Factory
  trait DeleteAnalysisSchemeRequest extends js.Object {
    var AnalysisSchemeName: StandardName
    var DomainName: DomainName
  }

  /**
    * The result of a <code>DeleteAnalysisScheme</code> request. Contains the status of the deleted analysis scheme.
    */
  @js.native
  @Factory
  trait DeleteAnalysisSchemeResponse extends js.Object {
    var AnalysisScheme: AnalysisSchemeStatus
  }

  /**
    * Container for the parameters to the <code><a>DeleteDomain</a></code> operation. Specifies the name of the domain you want to delete.
    */
  @js.native
  @Factory
  trait DeleteDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The result of a <code>DeleteDomain</code> request. Contains the status of a newly deleted domain, or no status if the domain has already been completely deleted.
    */
  @js.native
  @Factory
  trait DeleteDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[DomainStatus]
  }

  /**
    * Container for the parameters to the <code><a>DeleteExpression</a></code> operation. Specifies the name of the domain you want to update and the name of the expression you want to delete.
    */
  @js.native
  @Factory
  trait DeleteExpressionRequest extends js.Object {
    var DomainName: DomainName
    var ExpressionName: StandardName
  }

  /**
    * The result of a <code><a>DeleteExpression</a></code> request. Specifies the expression being deleted.
    */
  @js.native
  @Factory
  trait DeleteExpressionResponse extends js.Object {
    var Expression: ExpressionStatus
  }

  /**
    * Container for the parameters to the <code><a>DeleteIndexField</a></code> operation. Specifies the name of the domain you want to update and the name of the index field you want to delete.
    */
  @js.native
  @Factory
  trait DeleteIndexFieldRequest extends js.Object {
    var DomainName: DomainName
    var IndexFieldName: DynamicFieldName
  }

  /**
    * The result of a <code><a>DeleteIndexField</a></code> request.
    */
  @js.native
  @Factory
  trait DeleteIndexFieldResponse extends js.Object {
    var IndexField: IndexFieldStatus
  }

  /**
    * Container for the parameters to the <code><a>DeleteSuggester</a></code> operation. Specifies the name of the domain you want to update and name of the suggester you want to delete.
    */
  @js.native
  @Factory
  trait DeleteSuggesterRequest extends js.Object {
    var DomainName: DomainName
    var SuggesterName: StandardName
  }

  /**
    * The result of a <code>DeleteSuggester</code> request. Contains the status of the deleted suggester.
    */
  @js.native
  @Factory
  trait DeleteSuggesterResponse extends js.Object {
    var Suggester: SuggesterStatus
  }

  /**
    * Container for the parameters to the <code><a>DescribeAnalysisSchemes</a></code> operation. Specifies the name of the domain you want to describe. To limit the response to particular analysis schemes, specify the names of the analysis schemes you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  @Factory
  trait DescribeAnalysisSchemesRequest extends js.Object {
    var DomainName: DomainName
    var AnalysisSchemeNames: js.UndefOr[StandardNameList]
    var Deployed: js.UndefOr[Boolean]
  }

  /**
    * The result of a <code>DescribeAnalysisSchemes</code> request. Contains the analysis schemes configured for the domain specified in the request.
    */
  @js.native
  @Factory
  trait DescribeAnalysisSchemesResponse extends js.Object {
    var AnalysisSchemes: AnalysisSchemeStatusList
  }

  /**
    * Container for the parameters to the <code><a>DescribeAvailabilityOptions</a></code> operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to <code>true</code>.
    */
  @js.native
  @Factory
  trait DescribeAvailabilityOptionsRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
  }

  /**
    * The result of a <code>DescribeAvailabilityOptions</code> request. Indicates whether or not the Multi-AZ option is enabled for the domain specified in the request.
    */
  @js.native
  @Factory
  trait DescribeAvailabilityOptionsResponse extends js.Object {
    var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus]
  }

  /**
    * Container for the parameters to the <code><a>DescribeDomainEndpointOptions</a></code> operation. Specify the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to <code>true</code>.
    */
  @js.native
  @Factory
  trait DescribeDomainEndpointOptionsRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
  }

  /**
    * The result of a <code>DescribeDomainEndpointOptions</code> request. Contains the status and configuration of a search domain's endpoint options.
    */
  @js.native
  @Factory
  trait DescribeDomainEndpointOptionsResponse extends js.Object {
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus]
  }

  /**
    * Container for the parameters to the <code><a>DescribeDomains</a></code> operation. By default shows the status of all domains. To restrict the response to particular domains, specify the names of the domains you want to describe.
    */
  @js.native
  @Factory
  trait DescribeDomainsRequest extends js.Object {
    var DomainNames: js.UndefOr[DomainNameList]
  }

  /**
    * The result of a <code>DescribeDomains</code> request. Contains the status of the domains specified in the request or all domains owned by the account.
    */
  @js.native
  @Factory
  trait DescribeDomainsResponse extends js.Object {
    var DomainStatusList: DomainStatusList
  }

  /**
    * Container for the parameters to the <code><a>DescribeDomains</a></code> operation. Specifies the name of the domain you want to describe. To restrict the response to particular expressions, specify the names of the expressions you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  @Factory
  trait DescribeExpressionsRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
    var ExpressionNames: js.UndefOr[StandardNameList]
  }

  /**
    * The result of a <code>DescribeExpressions</code> request. Contains the expressions configured for the domain specified in the request.
    */
  @js.native
  @Factory
  trait DescribeExpressionsResponse extends js.Object {
    var Expressions: ExpressionStatusList
  }

  /**
    * Container for the parameters to the <code><a>DescribeIndexFields</a></code> operation. Specifies the name of the domain you want to describe. To restrict the response to particular index fields, specify the names of the index fields you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  @Factory
  trait DescribeIndexFieldsRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
    var FieldNames: js.UndefOr[DynamicFieldNameList]
  }

  /**
    * The result of a <code>DescribeIndexFields</code> request. Contains the index fields configured for the domain specified in the request.
    */
  @js.native
  @Factory
  trait DescribeIndexFieldsResponse extends js.Object {
    var IndexFields: IndexFieldStatusList
  }

  /**
    * Container for the parameters to the <code><a>DescribeScalingParameters</a></code> operation. Specifies the name of the domain you want to describe.
    */
  @js.native
  @Factory
  trait DescribeScalingParametersRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The result of a <code>DescribeScalingParameters</code> request. Contains the scaling parameters configured for the domain specified in the request.
    */
  @js.native
  @Factory
  trait DescribeScalingParametersResponse extends js.Object {
    var ScalingParameters: ScalingParametersStatus
  }

  /**
    * Container for the parameters to the <code><a>DescribeServiceAccessPolicies</a></code> operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  @Factory
  trait DescribeServiceAccessPoliciesRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
  }

  /**
    * The result of a <code>DescribeServiceAccessPolicies</code> request.
    */
  @js.native
  @Factory
  trait DescribeServiceAccessPoliciesResponse extends js.Object {
    var AccessPolicies: AccessPoliciesStatus
  }

  /**
    * Container for the parameters to the <code><a>DescribeSuggester</a></code> operation. Specifies the name of the domain you want to describe. To restrict the response to particular suggesters, specify the names of the suggesters you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  @Factory
  trait DescribeSuggestersRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
    var SuggesterNames: js.UndefOr[StandardNameList]
  }

  /**
    * The result of a <code>DescribeSuggesters</code> request.
    */
  @js.native
  @Factory
  trait DescribeSuggestersResponse extends js.Object {
    var Suggesters: SuggesterStatusList
  }

  /**
    * Options for a search suggester.
    */
  @js.native
  @Factory
  trait DocumentSuggesterOptions extends js.Object {
    var SourceField: FieldName
    var FuzzyMatching: js.UndefOr[SuggesterFuzzyMatching]
    var SortExpression: js.UndefOr[String]
  }

  /**
    * The domain's endpoint options.
    */
  @js.native
  @Factory
  trait DomainEndpointOptions extends js.Object {
    var EnforceHTTPS: js.UndefOr[Boolean]
    var TLSSecurityPolicy: js.UndefOr[TLSSecurityPolicy]
  }

  /**
    * The configuration and status of the domain's endpoint options.
    */
  @js.native
  @Factory
  trait DomainEndpointOptionsStatus extends js.Object {
    var Options: DomainEndpointOptions
    var Status: OptionStatus
  }

  /**
    * The current status of the search domain.
    */
  @js.native
  @Factory
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

  /**
    * Options for a field that contains an array of double-precision 64-bit floating point values. Present if <code>IndexFieldType</code> specifies the field is of type <code>double-array</code>. All options are enabled by default.
    */
  @js.native
  @Factory
  trait DoubleArrayOptions extends js.Object {
    var DefaultValue: js.UndefOr[Double]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SourceFields: js.UndefOr[FieldNameCommaList]
  }

  /**
    * Options for a double-precision 64-bit floating point field. Present if <code>IndexFieldType</code> specifies the field is of type <code>double</code>. All options are enabled by default.
    */
  @js.native
  @Factory
  trait DoubleOptions extends js.Object {
    var DefaultValue: js.UndefOr[Double]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SortEnabled: js.UndefOr[Boolean]
    var SourceField: js.UndefOr[FieldName]
  }

  /**
    * A named expression that can be evaluated at search time. Can be used to sort the search results, define other expressions, or return computed information in the search results.
    */
  @js.native
  @Factory
  trait Expression extends js.Object {
    var ExpressionName: StandardName
    var ExpressionValue: ExpressionValue
  }

  /**
    * The value of an <code>Expression</code> and its current status.
    */
  @js.native
  @Factory
  trait ExpressionStatus extends js.Object {
    var Options: Expression
    var Status: OptionStatus
  }

  /**
    * Container for the parameters to the <code><a>IndexDocuments</a></code> operation. Specifies the name of the domain you want to re-index.
    */
  @js.native
  @Factory
  trait IndexDocumentsRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The result of an <code>IndexDocuments</code> request. Contains the status of the indexing operation, including the fields being indexed.
    */
  @js.native
  @Factory
  trait IndexDocumentsResponse extends js.Object {
    var FieldNames: js.UndefOr[FieldNameList]
  }

  /**
    * Configuration information for a field in the index, including its name, type, and options. The supported options depend on the <code><a>IndexFieldType</a></code>.
    */
  @js.native
  @Factory
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

  /**
    * The value of an <code>IndexField</code> and its current status.
    */
  @js.native
  @Factory
  trait IndexFieldStatus extends js.Object {
    var Options: IndexField
    var Status: OptionStatus
  }

  /**
    * The type of field. The valid options for a field depend on the field type. For more information about the supported field types, see <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html" target="_blank">Configuring Index Fields</a> in the <i>Amazon CloudSearch Developer Guide</i>.
    */
  @js.native
  sealed trait IndexFieldType extends js.Any
  object IndexFieldType extends js.Object {
    val int             = "int".asInstanceOf[IndexFieldType]
    val double          = "double".asInstanceOf[IndexFieldType]
    val literal         = "literal".asInstanceOf[IndexFieldType]
    val text            = "text".asInstanceOf[IndexFieldType]
    val date            = "date".asInstanceOf[IndexFieldType]
    val latlon          = "latlon".asInstanceOf[IndexFieldType]
    val `int-array`     = "int-array".asInstanceOf[IndexFieldType]
    val `double-array`  = "double-array".asInstanceOf[IndexFieldType]
    val `literal-array` = "literal-array".asInstanceOf[IndexFieldType]
    val `text-array`    = "text-array".asInstanceOf[IndexFieldType]
    val `date-array`    = "date-array".asInstanceOf[IndexFieldType]

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
  @Factory
  trait IntArrayOptions extends js.Object {
    var DefaultValue: js.UndefOr[Double]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SourceFields: js.UndefOr[FieldNameCommaList]
  }

  /**
    * Options for a 64-bit signed integer field. Present if <code>IndexFieldType</code> specifies the field is of type <code>int</code>. All options are enabled by default.
    */
  @js.native
  @Factory
  trait IntOptions extends js.Object {
    var DefaultValue: js.UndefOr[Double]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SortEnabled: js.UndefOr[Boolean]
    var SourceField: js.UndefOr[FieldName]
  }

  /**
    * Options for a latlon field. A latlon field contains a location stored as a latitude and longitude value pair. Present if <code>IndexFieldType</code> specifies the field is of type <code>latlon</code>. All options are enabled by default.
    */
  @js.native
  @Factory
  trait LatLonOptions extends js.Object {
    var DefaultValue: js.UndefOr[FieldValue]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SortEnabled: js.UndefOr[Boolean]
    var SourceField: js.UndefOr[FieldName]
  }

  @js.native
  @Factory
  trait Limits extends js.Object {
    var MaximumPartitionCount: MaximumPartitionCount
    var MaximumReplicationCount: MaximumReplicationCount
  }

  /**
    * The result of a <code>ListDomainNames</code> request. Contains a list of the domains owned by an account.
    */
  @js.native
  @Factory
  trait ListDomainNamesResponse extends js.Object {
    var DomainNames: js.UndefOr[DomainNameMap]
  }

  /**
    * Options for a field that contains an array of literal strings. Present if <code>IndexFieldType</code> specifies the field is of type <code>literal-array</code>. All options are enabled by default.
    */
  @js.native
  @Factory
  trait LiteralArrayOptions extends js.Object {
    var DefaultValue: js.UndefOr[FieldValue]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SourceFields: js.UndefOr[FieldNameCommaList]
  }

  /**
    * Options for literal field. Present if <code>IndexFieldType</code> specifies the field is of type <code>literal</code>. All options are enabled by default.
    */
  @js.native
  @Factory
  trait LiteralOptions extends js.Object {
    var DefaultValue: js.UndefOr[FieldValue]
    var FacetEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SearchEnabled: js.UndefOr[Boolean]
    var SortEnabled: js.UndefOr[Boolean]
    var SourceField: js.UndefOr[FieldName]
  }

  /**
    * The state of processing a change to an option. One of:
    * * RequiresIndexDocuments: The option's latest value will not be deployed until <a>IndexDocuments</a> has been called and indexing is complete.
    *  * Processing: The option's latest value is in the process of being activated.
    *  * Active: The option's latest value is fully deployed.
    *  * FailedToValidate: The option value is not compatible with the domain's data and cannot be used to index the data. You must either modify the option value or update or remove the incompatible documents.
    */
  @js.native
  sealed trait OptionState extends js.Any
  object OptionState extends js.Object {
    val RequiresIndexDocuments = "RequiresIndexDocuments".asInstanceOf[OptionState]
    val Processing             = "Processing".asInstanceOf[OptionState]
    val Active                 = "Active".asInstanceOf[OptionState]
    val FailedToValidate       = "FailedToValidate".asInstanceOf[OptionState]

    val values = js.Object.freeze(js.Array(RequiresIndexDocuments, Processing, Active, FailedToValidate))
  }

  /**
    * The status of domain configuration option.
    */
  @js.native
  @Factory
  trait OptionStatus extends js.Object {
    var CreationDate: UpdateTimestamp
    var State: OptionState
    var UpdateDate: UpdateTimestamp
    var PendingDeletion: js.UndefOr[Boolean]
    var UpdateVersion: js.UndefOr[UIntValue]
  }

  /**
    * The instance type (such as <code>search.m1.small</code>) on which an index partition is hosted.
    */
  @js.native
  sealed trait PartitionInstanceType extends js.Any
  object PartitionInstanceType extends js.Object {
    val `search.m1.small`   = "search.m1.small".asInstanceOf[PartitionInstanceType]
    val `search.m1.large`   = "search.m1.large".asInstanceOf[PartitionInstanceType]
    val `search.m2.xlarge`  = "search.m2.xlarge".asInstanceOf[PartitionInstanceType]
    val `search.m2.2xlarge` = "search.m2.2xlarge".asInstanceOf[PartitionInstanceType]
    val `search.m3.medium`  = "search.m3.medium".asInstanceOf[PartitionInstanceType]
    val `search.m3.large`   = "search.m3.large".asInstanceOf[PartitionInstanceType]
    val `search.m3.xlarge`  = "search.m3.xlarge".asInstanceOf[PartitionInstanceType]
    val `search.m3.2xlarge` = "search.m3.2xlarge".asInstanceOf[PartitionInstanceType]

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
    * The desired instance type and desired number of replicas of each index partition.
    */
  @js.native
  @Factory
  trait ScalingParameters extends js.Object {
    var DesiredInstanceType: js.UndefOr[PartitionInstanceType]
    var DesiredPartitionCount: js.UndefOr[UIntValue]
    var DesiredReplicationCount: js.UndefOr[UIntValue]
  }

  /**
    * The status and configuration of a search domain's scaling parameters.
    */
  @js.native
  @Factory
  trait ScalingParametersStatus extends js.Object {
    var Options: ScalingParameters
    var Status: OptionStatus
  }

  /**
    * The endpoint to which service requests can be submitted.
    */
  @js.native
  @Factory
  trait ServiceEndpoint extends js.Object {
    var Endpoint: js.UndefOr[ServiceUrl]
  }

  /**
    * Configuration information for a search suggester. Each suggester has a unique name and specifies the text field you want to use for suggestions. The following options can be configured for a suggester: <code>FuzzyMatching</code>, <code>SortExpression</code>.
    */
  @js.native
  @Factory
  trait Suggester extends js.Object {
    var DocumentSuggesterOptions: DocumentSuggesterOptions
    var SuggesterName: StandardName
  }

  @js.native
  sealed trait SuggesterFuzzyMatching extends js.Any
  object SuggesterFuzzyMatching extends js.Object {
    val none = "none".asInstanceOf[SuggesterFuzzyMatching]
    val low  = "low".asInstanceOf[SuggesterFuzzyMatching]
    val high = "high".asInstanceOf[SuggesterFuzzyMatching]

    val values = js.Object.freeze(js.Array(none, low, high))
  }

  /**
    * The value of a <code>Suggester</code> and its current status.
    */
  @js.native
  @Factory
  trait SuggesterStatus extends js.Object {
    var Options: Suggester
    var Status: OptionStatus
  }

  /**
    * The minimum required TLS version.
    */
  @js.native
  sealed trait TLSSecurityPolicy extends js.Any
  object TLSSecurityPolicy extends js.Object {
    val `Policy-Min-TLS-1-0-2019-07` = "Policy-Min-TLS-1-0-2019-07".asInstanceOf[TLSSecurityPolicy]
    val `Policy-Min-TLS-1-2-2019-07` = "Policy-Min-TLS-1-2-2019-07".asInstanceOf[TLSSecurityPolicy]

    val values = js.Object.freeze(js.Array(`Policy-Min-TLS-1-0-2019-07`, `Policy-Min-TLS-1-2-2019-07`))
  }

  /**
    * Options for a field that contains an array of text strings. Present if <code>IndexFieldType</code> specifies the field is of type <code>text-array</code>. A <code>text-array</code> field is always searchable. All options are enabled by default.
    */
  @js.native
  @Factory
  trait TextArrayOptions extends js.Object {
    var AnalysisScheme: js.UndefOr[Word]
    var DefaultValue: js.UndefOr[FieldValue]
    var HighlightEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SourceFields: js.UndefOr[FieldNameCommaList]
  }

  /**
    * Options for text field. Present if <code>IndexFieldType</code> specifies the field is of type <code>text</code>. A <code>text</code> field is always searchable. All options are enabled by default.
    */
  @js.native
  @Factory
  trait TextOptions extends js.Object {
    var AnalysisScheme: js.UndefOr[Word]
    var DefaultValue: js.UndefOr[FieldValue]
    var HighlightEnabled: js.UndefOr[Boolean]
    var ReturnEnabled: js.UndefOr[Boolean]
    var SortEnabled: js.UndefOr[Boolean]
    var SourceField: js.UndefOr[FieldName]
  }

  /**
    * Container for the parameters to the <code><a>UpdateAvailabilityOptions</a></code> operation. Specifies the name of the domain you want to update and the Multi-AZ availability option.
    */
  @js.native
  @Factory
  trait UpdateAvailabilityOptionsRequest extends js.Object {
    var DomainName: DomainName
    var MultiAZ: Boolean
  }

  /**
    * The result of a <code>UpdateAvailabilityOptions</code> request. Contains the status of the domain's availability options.
    */
  @js.native
  @Factory
  trait UpdateAvailabilityOptionsResponse extends js.Object {
    var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus]
  }

  /**
    * Container for the parameters to the <code><a>UpdateDomainEndpointOptions</a></code> operation. Specifies the name of the domain you want to update and the domain endpoint options.
    */
  @js.native
  @Factory
  trait UpdateDomainEndpointOptionsRequest extends js.Object {
    var DomainEndpointOptions: DomainEndpointOptions
    var DomainName: DomainName
  }

  /**
    * The result of a <code>UpdateDomainEndpointOptions</code> request. Contains the configuration and status of the domain's endpoint options.
    */
  @js.native
  @Factory
  trait UpdateDomainEndpointOptionsResponse extends js.Object {
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus]
  }

  /**
    * Container for the parameters to the <code><a>UpdateScalingParameters</a></code> operation. Specifies the name of the domain you want to update and the scaling parameters you want to configure.
    */
  @js.native
  @Factory
  trait UpdateScalingParametersRequest extends js.Object {
    var DomainName: DomainName
    var ScalingParameters: ScalingParameters
  }

  /**
    * The result of a <code>UpdateScalingParameters</code> request. Contains the status of the newly-configured scaling parameters.
    */
  @js.native
  @Factory
  trait UpdateScalingParametersResponse extends js.Object {
    var ScalingParameters: ScalingParametersStatus
  }

  /**
    * Container for the parameters to the <code><a>UpdateServiceAccessPolicies</a></code> operation. Specifies the name of the domain you want to update and the access rules you want to configure.
    */
  @js.native
  @Factory
  trait UpdateServiceAccessPoliciesRequest extends js.Object {
    var AccessPolicies: PolicyDocument
    var DomainName: DomainName
  }

  /**
    * The result of an <code>UpdateServiceAccessPolicies</code> request. Contains the new access policies.
    */
  @js.native
  @Factory
  trait UpdateServiceAccessPoliciesResponse extends js.Object {
    var AccessPolicies: AccessPoliciesStatus
  }
}
