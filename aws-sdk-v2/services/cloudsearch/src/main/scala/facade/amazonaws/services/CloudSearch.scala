package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object cloudsearch {
  type APIVersion = String
  type ARN = String
  type AnalysisSchemeStatusList = js.Array[AnalysisSchemeStatus]
  type DomainId = String
  type DomainName = String
  type DomainNameList = js.Array[DomainName]
  type DomainNameMap = js.Dictionary[APIVersion]
  type DomainStatusList = js.Array[DomainStatus]
  type DynamicFieldName = String
  type DynamicFieldNameList = js.Array[DynamicFieldName]
  type ExpressionStatusList = js.Array[ExpressionStatus]
  type ExpressionValue = String
  type FieldName = String
  type FieldNameCommaList = String
  type FieldNameList = js.Array[FieldName]
  type FieldValue = String
  type IndexFieldStatusList = js.Array[IndexFieldStatus]
  type InstanceCount = Int
  type MaximumPartitionCount = Int
  type MaximumReplicationCount = Int
  type MultiAZ = Boolean
  type PartitionCount = Int
  type PolicyDocument = String
  type SearchInstanceType = String
  type ServiceUrl = String
  type StandardName = String
  type StandardNameList = js.Array[StandardName]
  type SuggesterStatusList = js.Array[SuggesterStatus]
  type UIntValue = Int
  type UpdateTimestamp = js.Date
  type Word = String

  final class CloudSearchOps(private val service: CloudSearch) extends AnyVal {

    @inline def buildSuggestersFuture(params: BuildSuggestersRequest): Future[BuildSuggestersResponse] = service.buildSuggesters(params).promise().toFuture
    @inline def createDomainFuture(params: CreateDomainRequest): Future[CreateDomainResponse] = service.createDomain(params).promise().toFuture
    @inline def defineAnalysisSchemeFuture(params: DefineAnalysisSchemeRequest): Future[DefineAnalysisSchemeResponse] = service.defineAnalysisScheme(params).promise().toFuture
    @inline def defineExpressionFuture(params: DefineExpressionRequest): Future[DefineExpressionResponse] = service.defineExpression(params).promise().toFuture
    @inline def defineIndexFieldFuture(params: DefineIndexFieldRequest): Future[DefineIndexFieldResponse] = service.defineIndexField(params).promise().toFuture
    @inline def defineSuggesterFuture(params: DefineSuggesterRequest): Future[DefineSuggesterResponse] = service.defineSuggester(params).promise().toFuture
    @inline def deleteAnalysisSchemeFuture(params: DeleteAnalysisSchemeRequest): Future[DeleteAnalysisSchemeResponse] = service.deleteAnalysisScheme(params).promise().toFuture
    @inline def deleteDomainFuture(params: DeleteDomainRequest): Future[DeleteDomainResponse] = service.deleteDomain(params).promise().toFuture
    @inline def deleteExpressionFuture(params: DeleteExpressionRequest): Future[DeleteExpressionResponse] = service.deleteExpression(params).promise().toFuture
    @inline def deleteIndexFieldFuture(params: DeleteIndexFieldRequest): Future[DeleteIndexFieldResponse] = service.deleteIndexField(params).promise().toFuture
    @inline def deleteSuggesterFuture(params: DeleteSuggesterRequest): Future[DeleteSuggesterResponse] = service.deleteSuggester(params).promise().toFuture
    @inline def describeAnalysisSchemesFuture(params: DescribeAnalysisSchemesRequest): Future[DescribeAnalysisSchemesResponse] = service.describeAnalysisSchemes(params).promise().toFuture
    @inline def describeAvailabilityOptionsFuture(params: DescribeAvailabilityOptionsRequest): Future[DescribeAvailabilityOptionsResponse] = service.describeAvailabilityOptions(params).promise().toFuture
    @inline def describeDomainEndpointOptionsFuture(params: DescribeDomainEndpointOptionsRequest): Future[DescribeDomainEndpointOptionsResponse] = service.describeDomainEndpointOptions(params).promise().toFuture
    @inline def describeDomainsFuture(params: DescribeDomainsRequest): Future[DescribeDomainsResponse] = service.describeDomains(params).promise().toFuture
    @inline def describeExpressionsFuture(params: DescribeExpressionsRequest): Future[DescribeExpressionsResponse] = service.describeExpressions(params).promise().toFuture
    @inline def describeIndexFieldsFuture(params: DescribeIndexFieldsRequest): Future[DescribeIndexFieldsResponse] = service.describeIndexFields(params).promise().toFuture
    @inline def describeScalingParametersFuture(params: DescribeScalingParametersRequest): Future[DescribeScalingParametersResponse] = service.describeScalingParameters(params).promise().toFuture
    @inline def describeServiceAccessPoliciesFuture(params: DescribeServiceAccessPoliciesRequest): Future[DescribeServiceAccessPoliciesResponse] = service.describeServiceAccessPolicies(params).promise().toFuture
    @inline def describeSuggestersFuture(params: DescribeSuggestersRequest): Future[DescribeSuggestersResponse] = service.describeSuggesters(params).promise().toFuture
    @inline def indexDocumentsFuture(params: IndexDocumentsRequest): Future[IndexDocumentsResponse] = service.indexDocuments(params).promise().toFuture
    @inline def listDomainNamesFuture(): Future[ListDomainNamesResponse] = service.listDomainNames().promise().toFuture
    @inline def updateAvailabilityOptionsFuture(params: UpdateAvailabilityOptionsRequest): Future[UpdateAvailabilityOptionsResponse] = service.updateAvailabilityOptions(params).promise().toFuture
    @inline def updateDomainEndpointOptionsFuture(params: UpdateDomainEndpointOptionsRequest): Future[UpdateDomainEndpointOptionsResponse] = service.updateDomainEndpointOptions(params).promise().toFuture
    @inline def updateScalingParametersFuture(params: UpdateScalingParametersRequest): Future[UpdateScalingParametersResponse] = service.updateScalingParameters(params).promise().toFuture
    @inline def updateServiceAccessPoliciesFuture(params: UpdateServiceAccessPoliciesRequest): Future[UpdateServiceAccessPoliciesResponse] = service.updateServiceAccessPolicies(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/cloudsearch", JSImport.Namespace, "AWS.CloudSearch")
  class CloudSearch() extends js.Object {
    def this(config: AWSConfig) = this()

    def buildSuggesters(params: BuildSuggestersRequest): Request[BuildSuggestersResponse] = js.native
    def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse] = js.native
    def defineAnalysisScheme(params: DefineAnalysisSchemeRequest): Request[DefineAnalysisSchemeResponse] = js.native
    def defineExpression(params: DefineExpressionRequest): Request[DefineExpressionResponse] = js.native
    def defineIndexField(params: DefineIndexFieldRequest): Request[DefineIndexFieldResponse] = js.native
    def defineSuggester(params: DefineSuggesterRequest): Request[DefineSuggesterResponse] = js.native
    def deleteAnalysisScheme(params: DeleteAnalysisSchemeRequest): Request[DeleteAnalysisSchemeResponse] = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResponse] = js.native
    def deleteExpression(params: DeleteExpressionRequest): Request[DeleteExpressionResponse] = js.native
    def deleteIndexField(params: DeleteIndexFieldRequest): Request[DeleteIndexFieldResponse] = js.native
    def deleteSuggester(params: DeleteSuggesterRequest): Request[DeleteSuggesterResponse] = js.native
    def describeAnalysisSchemes(params: DescribeAnalysisSchemesRequest): Request[DescribeAnalysisSchemesResponse] = js.native
    def describeAvailabilityOptions(params: DescribeAvailabilityOptionsRequest): Request[DescribeAvailabilityOptionsResponse] = js.native
    def describeDomainEndpointOptions(params: DescribeDomainEndpointOptionsRequest): Request[DescribeDomainEndpointOptionsResponse] = js.native
    def describeDomains(params: DescribeDomainsRequest): Request[DescribeDomainsResponse] = js.native
    def describeExpressions(params: DescribeExpressionsRequest): Request[DescribeExpressionsResponse] = js.native
    def describeIndexFields(params: DescribeIndexFieldsRequest): Request[DescribeIndexFieldsResponse] = js.native
    def describeScalingParameters(params: DescribeScalingParametersRequest): Request[DescribeScalingParametersResponse] = js.native
    def describeServiceAccessPolicies(params: DescribeServiceAccessPoliciesRequest): Request[DescribeServiceAccessPoliciesResponse] = js.native
    def describeSuggesters(params: DescribeSuggestersRequest): Request[DescribeSuggestersResponse] = js.native
    def indexDocuments(params: IndexDocumentsRequest): Request[IndexDocumentsResponse] = js.native
    def listDomainNames(): Request[ListDomainNamesResponse] = js.native
    def updateAvailabilityOptions(params: UpdateAvailabilityOptionsRequest): Request[UpdateAvailabilityOptionsResponse] = js.native
    def updateDomainEndpointOptions(params: UpdateDomainEndpointOptionsRequest): Request[UpdateDomainEndpointOptionsResponse] = js.native
    def updateScalingParameters(params: UpdateScalingParametersRequest): Request[UpdateScalingParametersResponse] = js.native
    def updateServiceAccessPolicies(params: UpdateServiceAccessPoliciesRequest): Request[UpdateServiceAccessPoliciesResponse] = js.native
  }
  object CloudSearch {
    @inline implicit def toOps(service: CloudSearch): CloudSearchOps = {
      new CloudSearchOps(service)
    }
  }

  /** The configured access rules for the domain's document and search endpoints, and the current status of those rules.
    */
  @js.native
  trait AccessPoliciesStatus extends js.Object {
    var Options: PolicyDocument
    var Status: OptionStatus
  }

  object AccessPoliciesStatus {
    @inline
    def apply(
        Options: PolicyDocument,
        Status: OptionStatus
    ): AccessPoliciesStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccessPoliciesStatus]
    }
  }

  /** Synonyms, stopwords, and stemming options for an analysis scheme. Includes tokenization dictionary for Japanese.
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
    @inline
    def apply(
        AlgorithmicStemming: js.UndefOr[AlgorithmicStemming] = js.undefined,
        JapaneseTokenizationDictionary: js.UndefOr[String] = js.undefined,
        StemmingDictionary: js.UndefOr[String] = js.undefined,
        Stopwords: js.UndefOr[String] = js.undefined,
        Synonyms: js.UndefOr[String] = js.undefined
    ): AnalysisOptions = {
      val __obj = js.Dynamic.literal()
      AlgorithmicStemming.foreach(__v => __obj.updateDynamic("AlgorithmicStemming")(__v.asInstanceOf[js.Any]))
      JapaneseTokenizationDictionary.foreach(__v => __obj.updateDynamic("JapaneseTokenizationDictionary")(__v.asInstanceOf[js.Any]))
      StemmingDictionary.foreach(__v => __obj.updateDynamic("StemmingDictionary")(__v.asInstanceOf[js.Any]))
      Stopwords.foreach(__v => __obj.updateDynamic("Stopwords")(__v.asInstanceOf[js.Any]))
      Synonyms.foreach(__v => __obj.updateDynamic("Synonyms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalysisOptions]
    }
  }

  /** Configuration information for an analysis scheme. Each analysis scheme has a unique name and specifies the language of the text to be processed. The following options can be configured for an analysis scheme: <code>Synonyms</code>, <code>Stopwords</code>, <code>StemmingDictionary</code>, <code>JapaneseTokenizationDictionary</code> and <code>AlgorithmicStemming</code>.
    */
  @js.native
  trait AnalysisScheme extends js.Object {
    var AnalysisSchemeLanguage: AnalysisSchemeLanguage
    var AnalysisSchemeName: StandardName
    var AnalysisOptions: js.UndefOr[AnalysisOptions]
  }

  object AnalysisScheme {
    @inline
    def apply(
        AnalysisSchemeLanguage: AnalysisSchemeLanguage,
        AnalysisSchemeName: StandardName,
        AnalysisOptions: js.UndefOr[AnalysisOptions] = js.undefined
    ): AnalysisScheme = {
      val __obj = js.Dynamic.literal(
        "AnalysisSchemeLanguage" -> AnalysisSchemeLanguage.asInstanceOf[js.Any],
        "AnalysisSchemeName" -> AnalysisSchemeName.asInstanceOf[js.Any]
      )

      AnalysisOptions.foreach(__v => __obj.updateDynamic("AnalysisOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalysisScheme]
    }
  }

  /** The status and configuration of an <code>AnalysisScheme</code>.
    */
  @js.native
  trait AnalysisSchemeStatus extends js.Object {
    var Options: AnalysisScheme
    var Status: OptionStatus
  }

  object AnalysisSchemeStatus {
    @inline
    def apply(
        Options: AnalysisScheme,
        Status: OptionStatus
    ): AnalysisSchemeStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnalysisSchemeStatus]
    }
  }

  /** The status and configuration of the domain's availability options.
    */
  @js.native
  trait AvailabilityOptionsStatus extends js.Object {
    var Options: MultiAZ
    var Status: OptionStatus
  }

  object AvailabilityOptionsStatus {
    @inline
    def apply(
        Options: MultiAZ,
        Status: OptionStatus
    ): AvailabilityOptionsStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AvailabilityOptionsStatus]
    }
  }

  /** Container for the parameters to the <code><a>BuildSuggester</a></code> operation. Specifies the name of the domain you want to update.
    */
  @js.native
  trait BuildSuggestersRequest extends js.Object {
    var DomainName: DomainName
  }

  object BuildSuggestersRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): BuildSuggestersRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BuildSuggestersRequest]
    }
  }

  /** The result of a <code>BuildSuggester</code> request. Contains a list of the fields used for suggestions.
    */
  @js.native
  trait BuildSuggestersResponse extends js.Object {
    var FieldNames: js.UndefOr[FieldNameList]
  }

  object BuildSuggestersResponse {
    @inline
    def apply(
        FieldNames: js.UndefOr[FieldNameList] = js.undefined
    ): BuildSuggestersResponse = {
      val __obj = js.Dynamic.literal()
      FieldNames.foreach(__v => __obj.updateDynamic("FieldNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildSuggestersResponse]
    }
  }

  /** Container for the parameters to the <code><a>CreateDomain</a></code> operation. Specifies a name for the new search domain.
    */
  @js.native
  trait CreateDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object CreateDomainRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): CreateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDomainRequest]
    }
  }

  /** The result of a <code>CreateDomainRequest</code>. Contains the status of a newly created domain.
    */
  @js.native
  trait CreateDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[DomainStatus]
  }

  object CreateDomainResponse {
    @inline
    def apply(
        DomainStatus: js.UndefOr[DomainStatus] = js.undefined
    ): CreateDomainResponse = {
      val __obj = js.Dynamic.literal()
      DomainStatus.foreach(__v => __obj.updateDynamic("DomainStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainResponse]
    }
  }

  /** Options for a field that contains an array of dates. Present if <code>IndexFieldType</code> specifies the field is of type <code>date-array</code>. All options are enabled by default.
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
    @inline
    def apply(
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
    ): DateArrayOptions = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.updateDynamic("FacetEnabled")(__v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.updateDynamic("ReturnEnabled")(__v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.updateDynamic("SearchEnabled")(__v.asInstanceOf[js.Any]))
      SourceFields.foreach(__v => __obj.updateDynamic("SourceFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateArrayOptions]
    }
  }

  /** Options for a date field. Dates and times are specified in UTC (Coordinated Universal Time) according to IETF RFC3339: yyyy-mm-ddT00:00:00Z. Present if <code>IndexFieldType</code> specifies the field is of type <code>date</code>. All options are enabled by default.
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
    @inline
    def apply(
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SortEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceField: js.UndefOr[FieldName] = js.undefined
    ): DateOptions = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.updateDynamic("FacetEnabled")(__v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.updateDynamic("ReturnEnabled")(__v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.updateDynamic("SearchEnabled")(__v.asInstanceOf[js.Any]))
      SortEnabled.foreach(__v => __obj.updateDynamic("SortEnabled")(__v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.updateDynamic("SourceField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateOptions]
    }
  }

  /** Container for the parameters to the <code><a>DefineAnalysisScheme</a></code> operation. Specifies the name of the domain you want to update and the analysis scheme configuration.
    */
  @js.native
  trait DefineAnalysisSchemeRequest extends js.Object {
    var AnalysisScheme: AnalysisScheme
    var DomainName: DomainName
  }

  object DefineAnalysisSchemeRequest {
    @inline
    def apply(
        AnalysisScheme: AnalysisScheme,
        DomainName: DomainName
    ): DefineAnalysisSchemeRequest = {
      val __obj = js.Dynamic.literal(
        "AnalysisScheme" -> AnalysisScheme.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefineAnalysisSchemeRequest]
    }
  }

  /** The result of a <code><a>DefineAnalysisScheme</a></code> request. Contains the status of the newly-configured analysis scheme.
    */
  @js.native
  trait DefineAnalysisSchemeResponse extends js.Object {
    var AnalysisScheme: AnalysisSchemeStatus
  }

  object DefineAnalysisSchemeResponse {
    @inline
    def apply(
        AnalysisScheme: AnalysisSchemeStatus
    ): DefineAnalysisSchemeResponse = {
      val __obj = js.Dynamic.literal(
        "AnalysisScheme" -> AnalysisScheme.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefineAnalysisSchemeResponse]
    }
  }

  /** Container for the parameters to the <code><a>DefineExpression</a></code> operation. Specifies the name of the domain you want to update and the expression you want to configure.
    */
  @js.native
  trait DefineExpressionRequest extends js.Object {
    var DomainName: DomainName
    var Expression: Expression
  }

  object DefineExpressionRequest {
    @inline
    def apply(
        DomainName: DomainName,
        Expression: Expression
    ): DefineExpressionRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Expression" -> Expression.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefineExpressionRequest]
    }
  }

  /** The result of a <code>DefineExpression</code> request. Contains the status of the newly-configured expression.
    */
  @js.native
  trait DefineExpressionResponse extends js.Object {
    var Expression: ExpressionStatus
  }

  object DefineExpressionResponse {
    @inline
    def apply(
        Expression: ExpressionStatus
    ): DefineExpressionResponse = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefineExpressionResponse]
    }
  }

  /** Container for the parameters to the <code><a>DefineIndexField</a></code> operation. Specifies the name of the domain you want to update and the index field configuration.
    */
  @js.native
  trait DefineIndexFieldRequest extends js.Object {
    var DomainName: DomainName
    var IndexField: IndexField
  }

  object DefineIndexFieldRequest {
    @inline
    def apply(
        DomainName: DomainName,
        IndexField: IndexField
    ): DefineIndexFieldRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "IndexField" -> IndexField.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefineIndexFieldRequest]
    }
  }

  /** The result of a <code><a>DefineIndexField</a></code> request. Contains the status of the newly-configured index field.
    */
  @js.native
  trait DefineIndexFieldResponse extends js.Object {
    var IndexField: IndexFieldStatus
  }

  object DefineIndexFieldResponse {
    @inline
    def apply(
        IndexField: IndexFieldStatus
    ): DefineIndexFieldResponse = {
      val __obj = js.Dynamic.literal(
        "IndexField" -> IndexField.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefineIndexFieldResponse]
    }
  }

  /** Container for the parameters to the <code><a>DefineSuggester</a></code> operation. Specifies the name of the domain you want to update and the suggester configuration.
    */
  @js.native
  trait DefineSuggesterRequest extends js.Object {
    var DomainName: DomainName
    var Suggester: Suggester
  }

  object DefineSuggesterRequest {
    @inline
    def apply(
        DomainName: DomainName,
        Suggester: Suggester
    ): DefineSuggesterRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Suggester" -> Suggester.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefineSuggesterRequest]
    }
  }

  /** The result of a <code>DefineSuggester</code> request. Contains the status of the newly-configured suggester.
    */
  @js.native
  trait DefineSuggesterResponse extends js.Object {
    var Suggester: SuggesterStatus
  }

  object DefineSuggesterResponse {
    @inline
    def apply(
        Suggester: SuggesterStatus
    ): DefineSuggesterResponse = {
      val __obj = js.Dynamic.literal(
        "Suggester" -> Suggester.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefineSuggesterResponse]
    }
  }

  /** Container for the parameters to the <code><a>DeleteAnalysisScheme</a></code> operation. Specifies the name of the domain you want to update and the analysis scheme you want to delete.
    */
  @js.native
  trait DeleteAnalysisSchemeRequest extends js.Object {
    var AnalysisSchemeName: StandardName
    var DomainName: DomainName
  }

  object DeleteAnalysisSchemeRequest {
    @inline
    def apply(
        AnalysisSchemeName: StandardName,
        DomainName: DomainName
    ): DeleteAnalysisSchemeRequest = {
      val __obj = js.Dynamic.literal(
        "AnalysisSchemeName" -> AnalysisSchemeName.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAnalysisSchemeRequest]
    }
  }

  /** The result of a <code>DeleteAnalysisScheme</code> request. Contains the status of the deleted analysis scheme.
    */
  @js.native
  trait DeleteAnalysisSchemeResponse extends js.Object {
    var AnalysisScheme: AnalysisSchemeStatus
  }

  object DeleteAnalysisSchemeResponse {
    @inline
    def apply(
        AnalysisScheme: AnalysisSchemeStatus
    ): DeleteAnalysisSchemeResponse = {
      val __obj = js.Dynamic.literal(
        "AnalysisScheme" -> AnalysisScheme.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAnalysisSchemeResponse]
    }
  }

  /** Container for the parameters to the <code><a>DeleteDomain</a></code> operation. Specifies the name of the domain you want to delete.
    */
  @js.native
  trait DeleteDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object DeleteDomainRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): DeleteDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDomainRequest]
    }
  }

  /** The result of a <code>DeleteDomain</code> request. Contains the status of a newly deleted domain, or no status if the domain has already been completely deleted.
    */
  @js.native
  trait DeleteDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[DomainStatus]
  }

  object DeleteDomainResponse {
    @inline
    def apply(
        DomainStatus: js.UndefOr[DomainStatus] = js.undefined
    ): DeleteDomainResponse = {
      val __obj = js.Dynamic.literal()
      DomainStatus.foreach(__v => __obj.updateDynamic("DomainStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDomainResponse]
    }
  }

  /** Container for the parameters to the <code><a>DeleteExpression</a></code> operation. Specifies the name of the domain you want to update and the name of the expression you want to delete.
    */
  @js.native
  trait DeleteExpressionRequest extends js.Object {
    var DomainName: DomainName
    var ExpressionName: StandardName
  }

  object DeleteExpressionRequest {
    @inline
    def apply(
        DomainName: DomainName,
        ExpressionName: StandardName
    ): DeleteExpressionRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ExpressionName" -> ExpressionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteExpressionRequest]
    }
  }

  /** The result of a <code><a>DeleteExpression</a></code> request. Specifies the expression being deleted.
    */
  @js.native
  trait DeleteExpressionResponse extends js.Object {
    var Expression: ExpressionStatus
  }

  object DeleteExpressionResponse {
    @inline
    def apply(
        Expression: ExpressionStatus
    ): DeleteExpressionResponse = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteExpressionResponse]
    }
  }

  /** Container for the parameters to the <code><a>DeleteIndexField</a></code> operation. Specifies the name of the domain you want to update and the name of the index field you want to delete.
    */
  @js.native
  trait DeleteIndexFieldRequest extends js.Object {
    var DomainName: DomainName
    var IndexFieldName: DynamicFieldName
  }

  object DeleteIndexFieldRequest {
    @inline
    def apply(
        DomainName: DomainName,
        IndexFieldName: DynamicFieldName
    ): DeleteIndexFieldRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "IndexFieldName" -> IndexFieldName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIndexFieldRequest]
    }
  }

  /** The result of a <code><a>DeleteIndexField</a></code> request.
    */
  @js.native
  trait DeleteIndexFieldResponse extends js.Object {
    var IndexField: IndexFieldStatus
  }

  object DeleteIndexFieldResponse {
    @inline
    def apply(
        IndexField: IndexFieldStatus
    ): DeleteIndexFieldResponse = {
      val __obj = js.Dynamic.literal(
        "IndexField" -> IndexField.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIndexFieldResponse]
    }
  }

  /** Container for the parameters to the <code><a>DeleteSuggester</a></code> operation. Specifies the name of the domain you want to update and name of the suggester you want to delete.
    */
  @js.native
  trait DeleteSuggesterRequest extends js.Object {
    var DomainName: DomainName
    var SuggesterName: StandardName
  }

  object DeleteSuggesterRequest {
    @inline
    def apply(
        DomainName: DomainName,
        SuggesterName: StandardName
    ): DeleteSuggesterRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "SuggesterName" -> SuggesterName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSuggesterRequest]
    }
  }

  /** The result of a <code>DeleteSuggester</code> request. Contains the status of the deleted suggester.
    */
  @js.native
  trait DeleteSuggesterResponse extends js.Object {
    var Suggester: SuggesterStatus
  }

  object DeleteSuggesterResponse {
    @inline
    def apply(
        Suggester: SuggesterStatus
    ): DeleteSuggesterResponse = {
      val __obj = js.Dynamic.literal(
        "Suggester" -> Suggester.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSuggesterResponse]
    }
  }

  /** Container for the parameters to the <code><a>DescribeAnalysisSchemes</a></code> operation. Specifies the name of the domain you want to describe. To limit the response to particular analysis schemes, specify the names of the analysis schemes you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  trait DescribeAnalysisSchemesRequest extends js.Object {
    var DomainName: DomainName
    var AnalysisSchemeNames: js.UndefOr[StandardNameList]
    var Deployed: js.UndefOr[Boolean]
  }

  object DescribeAnalysisSchemesRequest {
    @inline
    def apply(
        DomainName: DomainName,
        AnalysisSchemeNames: js.UndefOr[StandardNameList] = js.undefined,
        Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeAnalysisSchemesRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AnalysisSchemeNames.foreach(__v => __obj.updateDynamic("AnalysisSchemeNames")(__v.asInstanceOf[js.Any]))
      Deployed.foreach(__v => __obj.updateDynamic("Deployed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAnalysisSchemesRequest]
    }
  }

  /** The result of a <code>DescribeAnalysisSchemes</code> request. Contains the analysis schemes configured for the domain specified in the request.
    */
  @js.native
  trait DescribeAnalysisSchemesResponse extends js.Object {
    var AnalysisSchemes: AnalysisSchemeStatusList
  }

  object DescribeAnalysisSchemesResponse {
    @inline
    def apply(
        AnalysisSchemes: AnalysisSchemeStatusList
    ): DescribeAnalysisSchemesResponse = {
      val __obj = js.Dynamic.literal(
        "AnalysisSchemes" -> AnalysisSchemes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAnalysisSchemesResponse]
    }
  }

  /** Container for the parameters to the <code><a>DescribeAvailabilityOptions</a></code> operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to <code>true</code>.
    */
  @js.native
  trait DescribeAvailabilityOptionsRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
  }

  object DescribeAvailabilityOptionsRequest {
    @inline
    def apply(
        DomainName: DomainName,
        Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeAvailabilityOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      Deployed.foreach(__v => __obj.updateDynamic("Deployed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAvailabilityOptionsRequest]
    }
  }

  /** The result of a <code>DescribeAvailabilityOptions</code> request. Indicates whether or not the Multi-AZ option is enabled for the domain specified in the request.
    */
  @js.native
  trait DescribeAvailabilityOptionsResponse extends js.Object {
    var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus]
  }

  object DescribeAvailabilityOptionsResponse {
    @inline
    def apply(
        AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.undefined
    ): DescribeAvailabilityOptionsResponse = {
      val __obj = js.Dynamic.literal()
      AvailabilityOptions.foreach(__v => __obj.updateDynamic("AvailabilityOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAvailabilityOptionsResponse]
    }
  }

  /** Container for the parameters to the <code><a>DescribeDomainEndpointOptions</a></code> operation. Specify the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the Deployed option to <code>true</code>.
    */
  @js.native
  trait DescribeDomainEndpointOptionsRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
  }

  object DescribeDomainEndpointOptionsRequest {
    @inline
    def apply(
        DomainName: DomainName,
        Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeDomainEndpointOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      Deployed.foreach(__v => __obj.updateDynamic("Deployed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainEndpointOptionsRequest]
    }
  }

  /** The result of a <code>DescribeDomainEndpointOptions</code> request. Contains the status and configuration of a search domain's endpoint options.
    */
  @js.native
  trait DescribeDomainEndpointOptionsResponse extends js.Object {
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus]
  }

  object DescribeDomainEndpointOptionsResponse {
    @inline
    def apply(
        DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.undefined
    ): DescribeDomainEndpointOptionsResponse = {
      val __obj = js.Dynamic.literal()
      DomainEndpointOptions.foreach(__v => __obj.updateDynamic("DomainEndpointOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainEndpointOptionsResponse]
    }
  }

  /** Container for the parameters to the <code><a>DescribeDomains</a></code> operation. By default shows the status of all domains. To restrict the response to particular domains, specify the names of the domains you want to describe.
    */
  @js.native
  trait DescribeDomainsRequest extends js.Object {
    var DomainNames: js.UndefOr[DomainNameList]
  }

  object DescribeDomainsRequest {
    @inline
    def apply(
        DomainNames: js.UndefOr[DomainNameList] = js.undefined
    ): DescribeDomainsRequest = {
      val __obj = js.Dynamic.literal()
      DomainNames.foreach(__v => __obj.updateDynamic("DomainNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainsRequest]
    }
  }

  /** The result of a <code>DescribeDomains</code> request. Contains the status of the domains specified in the request or all domains owned by the account.
    */
  @js.native
  trait DescribeDomainsResponse extends js.Object {
    var DomainStatusList: DomainStatusList
  }

  object DescribeDomainsResponse {
    @inline
    def apply(
        DomainStatusList: DomainStatusList
    ): DescribeDomainsResponse = {
      val __obj = js.Dynamic.literal(
        "DomainStatusList" -> DomainStatusList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDomainsResponse]
    }
  }

  /** Container for the parameters to the <code><a>DescribeDomains</a></code> operation. Specifies the name of the domain you want to describe. To restrict the response to particular expressions, specify the names of the expressions you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  trait DescribeExpressionsRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
    var ExpressionNames: js.UndefOr[StandardNameList]
  }

  object DescribeExpressionsRequest {
    @inline
    def apply(
        DomainName: DomainName,
        Deployed: js.UndefOr[Boolean] = js.undefined,
        ExpressionNames: js.UndefOr[StandardNameList] = js.undefined
    ): DescribeExpressionsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      Deployed.foreach(__v => __obj.updateDynamic("Deployed")(__v.asInstanceOf[js.Any]))
      ExpressionNames.foreach(__v => __obj.updateDynamic("ExpressionNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExpressionsRequest]
    }
  }

  /** The result of a <code>DescribeExpressions</code> request. Contains the expressions configured for the domain specified in the request.
    */
  @js.native
  trait DescribeExpressionsResponse extends js.Object {
    var Expressions: ExpressionStatusList
  }

  object DescribeExpressionsResponse {
    @inline
    def apply(
        Expressions: ExpressionStatusList
    ): DescribeExpressionsResponse = {
      val __obj = js.Dynamic.literal(
        "Expressions" -> Expressions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeExpressionsResponse]
    }
  }

  /** Container for the parameters to the <code><a>DescribeIndexFields</a></code> operation. Specifies the name of the domain you want to describe. To restrict the response to particular index fields, specify the names of the index fields you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  trait DescribeIndexFieldsRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
    var FieldNames: js.UndefOr[DynamicFieldNameList]
  }

  object DescribeIndexFieldsRequest {
    @inline
    def apply(
        DomainName: DomainName,
        Deployed: js.UndefOr[Boolean] = js.undefined,
        FieldNames: js.UndefOr[DynamicFieldNameList] = js.undefined
    ): DescribeIndexFieldsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      Deployed.foreach(__v => __obj.updateDynamic("Deployed")(__v.asInstanceOf[js.Any]))
      FieldNames.foreach(__v => __obj.updateDynamic("FieldNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIndexFieldsRequest]
    }
  }

  /** The result of a <code>DescribeIndexFields</code> request. Contains the index fields configured for the domain specified in the request.
    */
  @js.native
  trait DescribeIndexFieldsResponse extends js.Object {
    var IndexFields: IndexFieldStatusList
  }

  object DescribeIndexFieldsResponse {
    @inline
    def apply(
        IndexFields: IndexFieldStatusList
    ): DescribeIndexFieldsResponse = {
      val __obj = js.Dynamic.literal(
        "IndexFields" -> IndexFields.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeIndexFieldsResponse]
    }
  }

  /** Container for the parameters to the <code><a>DescribeScalingParameters</a></code> operation. Specifies the name of the domain you want to describe.
    */
  @js.native
  trait DescribeScalingParametersRequest extends js.Object {
    var DomainName: DomainName
  }

  object DescribeScalingParametersRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): DescribeScalingParametersRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeScalingParametersRequest]
    }
  }

  /** The result of a <code>DescribeScalingParameters</code> request. Contains the scaling parameters configured for the domain specified in the request.
    */
  @js.native
  trait DescribeScalingParametersResponse extends js.Object {
    var ScalingParameters: ScalingParametersStatus
  }

  object DescribeScalingParametersResponse {
    @inline
    def apply(
        ScalingParameters: ScalingParametersStatus
    ): DescribeScalingParametersResponse = {
      val __obj = js.Dynamic.literal(
        "ScalingParameters" -> ScalingParameters.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeScalingParametersResponse]
    }
  }

  /** Container for the parameters to the <code><a>DescribeServiceAccessPolicies</a></code> operation. Specifies the name of the domain you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  trait DescribeServiceAccessPoliciesRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
  }

  object DescribeServiceAccessPoliciesRequest {
    @inline
    def apply(
        DomainName: DomainName,
        Deployed: js.UndefOr[Boolean] = js.undefined
    ): DescribeServiceAccessPoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      Deployed.foreach(__v => __obj.updateDynamic("Deployed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceAccessPoliciesRequest]
    }
  }

  /** The result of a <code>DescribeServiceAccessPolicies</code> request.
    */
  @js.native
  trait DescribeServiceAccessPoliciesResponse extends js.Object {
    var AccessPolicies: AccessPoliciesStatus
  }

  object DescribeServiceAccessPoliciesResponse {
    @inline
    def apply(
        AccessPolicies: AccessPoliciesStatus
    ): DescribeServiceAccessPoliciesResponse = {
      val __obj = js.Dynamic.literal(
        "AccessPolicies" -> AccessPolicies.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeServiceAccessPoliciesResponse]
    }
  }

  /** Container for the parameters to the <code><a>DescribeSuggester</a></code> operation. Specifies the name of the domain you want to describe. To restrict the response to particular suggesters, specify the names of the suggesters you want to describe. To show the active configuration and exclude any pending changes, set the <code>Deployed</code> option to <code>true</code>.
    */
  @js.native
  trait DescribeSuggestersRequest extends js.Object {
    var DomainName: DomainName
    var Deployed: js.UndefOr[Boolean]
    var SuggesterNames: js.UndefOr[StandardNameList]
  }

  object DescribeSuggestersRequest {
    @inline
    def apply(
        DomainName: DomainName,
        Deployed: js.UndefOr[Boolean] = js.undefined,
        SuggesterNames: js.UndefOr[StandardNameList] = js.undefined
    ): DescribeSuggestersRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      Deployed.foreach(__v => __obj.updateDynamic("Deployed")(__v.asInstanceOf[js.Any]))
      SuggesterNames.foreach(__v => __obj.updateDynamic("SuggesterNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSuggestersRequest]
    }
  }

  /** The result of a <code>DescribeSuggesters</code> request.
    */
  @js.native
  trait DescribeSuggestersResponse extends js.Object {
    var Suggesters: SuggesterStatusList
  }

  object DescribeSuggestersResponse {
    @inline
    def apply(
        Suggesters: SuggesterStatusList
    ): DescribeSuggestersResponse = {
      val __obj = js.Dynamic.literal(
        "Suggesters" -> Suggesters.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSuggestersResponse]
    }
  }

  /** Options for a search suggester.
    */
  @js.native
  trait DocumentSuggesterOptions extends js.Object {
    var SourceField: FieldName
    var FuzzyMatching: js.UndefOr[SuggesterFuzzyMatching]
    var SortExpression: js.UndefOr[String]
  }

  object DocumentSuggesterOptions {
    @inline
    def apply(
        SourceField: FieldName,
        FuzzyMatching: js.UndefOr[SuggesterFuzzyMatching] = js.undefined,
        SortExpression: js.UndefOr[String] = js.undefined
    ): DocumentSuggesterOptions = {
      val __obj = js.Dynamic.literal(
        "SourceField" -> SourceField.asInstanceOf[js.Any]
      )

      FuzzyMatching.foreach(__v => __obj.updateDynamic("FuzzyMatching")(__v.asInstanceOf[js.Any]))
      SortExpression.foreach(__v => __obj.updateDynamic("SortExpression")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentSuggesterOptions]
    }
  }

  /** The domain's endpoint options.
    */
  @js.native
  trait DomainEndpointOptions extends js.Object {
    var EnforceHTTPS: js.UndefOr[Boolean]
    var TLSSecurityPolicy: js.UndefOr[TLSSecurityPolicy]
  }

  object DomainEndpointOptions {
    @inline
    def apply(
        EnforceHTTPS: js.UndefOr[Boolean] = js.undefined,
        TLSSecurityPolicy: js.UndefOr[TLSSecurityPolicy] = js.undefined
    ): DomainEndpointOptions = {
      val __obj = js.Dynamic.literal()
      EnforceHTTPS.foreach(__v => __obj.updateDynamic("EnforceHTTPS")(__v.asInstanceOf[js.Any]))
      TLSSecurityPolicy.foreach(__v => __obj.updateDynamic("TLSSecurityPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainEndpointOptions]
    }
  }

  /** The configuration and status of the domain's endpoint options.
    */
  @js.native
  trait DomainEndpointOptionsStatus extends js.Object {
    var Options: DomainEndpointOptions
    var Status: OptionStatus
  }

  object DomainEndpointOptionsStatus {
    @inline
    def apply(
        Options: DomainEndpointOptions,
        Status: OptionStatus
    ): DomainEndpointOptionsStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DomainEndpointOptionsStatus]
    }
  }

  /** The current status of the search domain.
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "RequiresIndexDocuments" -> RequiresIndexDocuments.asInstanceOf[js.Any]
      )

      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Deleted.foreach(__v => __obj.updateDynamic("Deleted")(__v.asInstanceOf[js.Any]))
      DocService.foreach(__v => __obj.updateDynamic("DocService")(__v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.updateDynamic("Limits")(__v.asInstanceOf[js.Any]))
      Processing.foreach(__v => __obj.updateDynamic("Processing")(__v.asInstanceOf[js.Any]))
      SearchInstanceCount.foreach(__v => __obj.updateDynamic("SearchInstanceCount")(__v.asInstanceOf[js.Any]))
      SearchInstanceType.foreach(__v => __obj.updateDynamic("SearchInstanceType")(__v.asInstanceOf[js.Any]))
      SearchPartitionCount.foreach(__v => __obj.updateDynamic("SearchPartitionCount")(__v.asInstanceOf[js.Any]))
      SearchService.foreach(__v => __obj.updateDynamic("SearchService")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainStatus]
    }
  }

  /** Options for a field that contains an array of double-precision 64-bit floating point values. Present if <code>IndexFieldType</code> specifies the field is of type <code>double-array</code>. All options are enabled by default.
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
    @inline
    def apply(
        DefaultValue: js.UndefOr[Double] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
    ): DoubleArrayOptions = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.updateDynamic("FacetEnabled")(__v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.updateDynamic("ReturnEnabled")(__v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.updateDynamic("SearchEnabled")(__v.asInstanceOf[js.Any]))
      SourceFields.foreach(__v => __obj.updateDynamic("SourceFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DoubleArrayOptions]
    }
  }

  /** Options for a double-precision 64-bit floating point field. Present if <code>IndexFieldType</code> specifies the field is of type <code>double</code>. All options are enabled by default.
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
    @inline
    def apply(
        DefaultValue: js.UndefOr[Double] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SortEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceField: js.UndefOr[FieldName] = js.undefined
    ): DoubleOptions = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.updateDynamic("FacetEnabled")(__v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.updateDynamic("ReturnEnabled")(__v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.updateDynamic("SearchEnabled")(__v.asInstanceOf[js.Any]))
      SortEnabled.foreach(__v => __obj.updateDynamic("SortEnabled")(__v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.updateDynamic("SourceField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DoubleOptions]
    }
  }

  /** A named expression that can be evaluated at search time. Can be used to sort the search results, define other expressions, or return computed information in the search results.
    */
  @js.native
  trait Expression extends js.Object {
    var ExpressionName: StandardName
    var ExpressionValue: ExpressionValue
  }

  object Expression {
    @inline
    def apply(
        ExpressionName: StandardName,
        ExpressionValue: ExpressionValue
    ): Expression = {
      val __obj = js.Dynamic.literal(
        "ExpressionName" -> ExpressionName.asInstanceOf[js.Any],
        "ExpressionValue" -> ExpressionValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Expression]
    }
  }

  /** The value of an <code>Expression</code> and its current status.
    */
  @js.native
  trait ExpressionStatus extends js.Object {
    var Options: Expression
    var Status: OptionStatus
  }

  object ExpressionStatus {
    @inline
    def apply(
        Options: Expression,
        Status: OptionStatus
    ): ExpressionStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExpressionStatus]
    }
  }

  /** Container for the parameters to the <code><a>IndexDocuments</a></code> operation. Specifies the name of the domain you want to re-index.
    */
  @js.native
  trait IndexDocumentsRequest extends js.Object {
    var DomainName: DomainName
  }

  object IndexDocumentsRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): IndexDocumentsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IndexDocumentsRequest]
    }
  }

  /** The result of an <code>IndexDocuments</code> request. Contains the status of the indexing operation, including the fields being indexed.
    */
  @js.native
  trait IndexDocumentsResponse extends js.Object {
    var FieldNames: js.UndefOr[FieldNameList]
  }

  object IndexDocumentsResponse {
    @inline
    def apply(
        FieldNames: js.UndefOr[FieldNameList] = js.undefined
    ): IndexDocumentsResponse = {
      val __obj = js.Dynamic.literal()
      FieldNames.foreach(__v => __obj.updateDynamic("FieldNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IndexDocumentsResponse]
    }
  }

  /** Configuration information for a field in the index, including its name, type, and options. The supported options depend on the <code><a>IndexFieldType</a></code>.
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "IndexFieldName" -> IndexFieldName.asInstanceOf[js.Any],
        "IndexFieldType" -> IndexFieldType.asInstanceOf[js.Any]
      )

      DateArrayOptions.foreach(__v => __obj.updateDynamic("DateArrayOptions")(__v.asInstanceOf[js.Any]))
      DateOptions.foreach(__v => __obj.updateDynamic("DateOptions")(__v.asInstanceOf[js.Any]))
      DoubleArrayOptions.foreach(__v => __obj.updateDynamic("DoubleArrayOptions")(__v.asInstanceOf[js.Any]))
      DoubleOptions.foreach(__v => __obj.updateDynamic("DoubleOptions")(__v.asInstanceOf[js.Any]))
      IntArrayOptions.foreach(__v => __obj.updateDynamic("IntArrayOptions")(__v.asInstanceOf[js.Any]))
      IntOptions.foreach(__v => __obj.updateDynamic("IntOptions")(__v.asInstanceOf[js.Any]))
      LatLonOptions.foreach(__v => __obj.updateDynamic("LatLonOptions")(__v.asInstanceOf[js.Any]))
      LiteralArrayOptions.foreach(__v => __obj.updateDynamic("LiteralArrayOptions")(__v.asInstanceOf[js.Any]))
      LiteralOptions.foreach(__v => __obj.updateDynamic("LiteralOptions")(__v.asInstanceOf[js.Any]))
      TextArrayOptions.foreach(__v => __obj.updateDynamic("TextArrayOptions")(__v.asInstanceOf[js.Any]))
      TextOptions.foreach(__v => __obj.updateDynamic("TextOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IndexField]
    }
  }

  /** The value of an <code>IndexField</code> and its current status.
    */
  @js.native
  trait IndexFieldStatus extends js.Object {
    var Options: IndexField
    var Status: OptionStatus
  }

  object IndexFieldStatus {
    @inline
    def apply(
        Options: IndexField,
        Status: OptionStatus
    ): IndexFieldStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IndexFieldStatus]
    }
  }

  /** Options for a field that contains an array of 64-bit signed integers. Present if <code>IndexFieldType</code> specifies the field is of type <code>int-array</code>. All options are enabled by default.
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
    @inline
    def apply(
        DefaultValue: js.UndefOr[Double] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
    ): IntArrayOptions = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.updateDynamic("FacetEnabled")(__v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.updateDynamic("ReturnEnabled")(__v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.updateDynamic("SearchEnabled")(__v.asInstanceOf[js.Any]))
      SourceFields.foreach(__v => __obj.updateDynamic("SourceFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntArrayOptions]
    }
  }

  /** Options for a 64-bit signed integer field. Present if <code>IndexFieldType</code> specifies the field is of type <code>int</code>. All options are enabled by default.
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
    @inline
    def apply(
        DefaultValue: js.UndefOr[Double] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SortEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceField: js.UndefOr[FieldName] = js.undefined
    ): IntOptions = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.updateDynamic("FacetEnabled")(__v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.updateDynamic("ReturnEnabled")(__v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.updateDynamic("SearchEnabled")(__v.asInstanceOf[js.Any]))
      SortEnabled.foreach(__v => __obj.updateDynamic("SortEnabled")(__v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.updateDynamic("SourceField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntOptions]
    }
  }

  /** Options for a latlon field. A latlon field contains a location stored as a latitude and longitude value pair. Present if <code>IndexFieldType</code> specifies the field is of type <code>latlon</code>. All options are enabled by default.
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
    @inline
    def apply(
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SortEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceField: js.UndefOr[FieldName] = js.undefined
    ): LatLonOptions = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.updateDynamic("FacetEnabled")(__v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.updateDynamic("ReturnEnabled")(__v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.updateDynamic("SearchEnabled")(__v.asInstanceOf[js.Any]))
      SortEnabled.foreach(__v => __obj.updateDynamic("SortEnabled")(__v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.updateDynamic("SourceField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LatLonOptions]
    }
  }

  @js.native
  trait Limits extends js.Object {
    var MaximumPartitionCount: MaximumPartitionCount
    var MaximumReplicationCount: MaximumReplicationCount
  }

  object Limits {
    @inline
    def apply(
        MaximumPartitionCount: MaximumPartitionCount,
        MaximumReplicationCount: MaximumReplicationCount
    ): Limits = {
      val __obj = js.Dynamic.literal(
        "MaximumPartitionCount" -> MaximumPartitionCount.asInstanceOf[js.Any],
        "MaximumReplicationCount" -> MaximumReplicationCount.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Limits]
    }
  }

  /** The result of a <code>ListDomainNames</code> request. Contains a list of the domains owned by an account.
    */
  @js.native
  trait ListDomainNamesResponse extends js.Object {
    var DomainNames: js.UndefOr[DomainNameMap]
  }

  object ListDomainNamesResponse {
    @inline
    def apply(
        DomainNames: js.UndefOr[DomainNameMap] = js.undefined
    ): ListDomainNamesResponse = {
      val __obj = js.Dynamic.literal()
      DomainNames.foreach(__v => __obj.updateDynamic("DomainNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainNamesResponse]
    }
  }

  /** Options for a field that contains an array of literal strings. Present if <code>IndexFieldType</code> specifies the field is of type <code>literal-array</code>. All options are enabled by default.
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
    @inline
    def apply(
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
    ): LiteralArrayOptions = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.updateDynamic("FacetEnabled")(__v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.updateDynamic("ReturnEnabled")(__v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.updateDynamic("SearchEnabled")(__v.asInstanceOf[js.Any]))
      SourceFields.foreach(__v => __obj.updateDynamic("SourceFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LiteralArrayOptions]
    }
  }

  /** Options for literal field. Present if <code>IndexFieldType</code> specifies the field is of type <code>literal</code>. All options are enabled by default.
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
    @inline
    def apply(
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        FacetEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SearchEnabled: js.UndefOr[Boolean] = js.undefined,
        SortEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceField: js.UndefOr[FieldName] = js.undefined
    ): LiteralOptions = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      FacetEnabled.foreach(__v => __obj.updateDynamic("FacetEnabled")(__v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.updateDynamic("ReturnEnabled")(__v.asInstanceOf[js.Any]))
      SearchEnabled.foreach(__v => __obj.updateDynamic("SearchEnabled")(__v.asInstanceOf[js.Any]))
      SortEnabled.foreach(__v => __obj.updateDynamic("SortEnabled")(__v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.updateDynamic("SourceField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LiteralOptions]
    }
  }

  /** The status of domain configuration option.
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
    @inline
    def apply(
        CreationDate: UpdateTimestamp,
        State: OptionState,
        UpdateDate: UpdateTimestamp,
        PendingDeletion: js.UndefOr[Boolean] = js.undefined,
        UpdateVersion: js.UndefOr[UIntValue] = js.undefined
    ): OptionStatus = {
      val __obj = js.Dynamic.literal(
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any],
        "UpdateDate" -> UpdateDate.asInstanceOf[js.Any]
      )

      PendingDeletion.foreach(__v => __obj.updateDynamic("PendingDeletion")(__v.asInstanceOf[js.Any]))
      UpdateVersion.foreach(__v => __obj.updateDynamic("UpdateVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionStatus]
    }
  }

  /** The desired instance type and desired number of replicas of each index partition.
    */
  @js.native
  trait ScalingParameters extends js.Object {
    var DesiredInstanceType: js.UndefOr[PartitionInstanceType]
    var DesiredPartitionCount: js.UndefOr[UIntValue]
    var DesiredReplicationCount: js.UndefOr[UIntValue]
  }

  object ScalingParameters {
    @inline
    def apply(
        DesiredInstanceType: js.UndefOr[PartitionInstanceType] = js.undefined,
        DesiredPartitionCount: js.UndefOr[UIntValue] = js.undefined,
        DesiredReplicationCount: js.UndefOr[UIntValue] = js.undefined
    ): ScalingParameters = {
      val __obj = js.Dynamic.literal()
      DesiredInstanceType.foreach(__v => __obj.updateDynamic("DesiredInstanceType")(__v.asInstanceOf[js.Any]))
      DesiredPartitionCount.foreach(__v => __obj.updateDynamic("DesiredPartitionCount")(__v.asInstanceOf[js.Any]))
      DesiredReplicationCount.foreach(__v => __obj.updateDynamic("DesiredReplicationCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingParameters]
    }
  }

  /** The status and configuration of a search domain's scaling parameters.
    */
  @js.native
  trait ScalingParametersStatus extends js.Object {
    var Options: ScalingParameters
    var Status: OptionStatus
  }

  object ScalingParametersStatus {
    @inline
    def apply(
        Options: ScalingParameters,
        Status: OptionStatus
    ): ScalingParametersStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScalingParametersStatus]
    }
  }

  /** The endpoint to which service requests can be submitted.
    */
  @js.native
  trait ServiceEndpoint extends js.Object {
    var Endpoint: js.UndefOr[ServiceUrl]
  }

  object ServiceEndpoint {
    @inline
    def apply(
        Endpoint: js.UndefOr[ServiceUrl] = js.undefined
    ): ServiceEndpoint = {
      val __obj = js.Dynamic.literal()
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceEndpoint]
    }
  }

  /** Configuration information for a search suggester. Each suggester has a unique name and specifies the text field you want to use for suggestions. The following options can be configured for a suggester: <code>FuzzyMatching</code>, <code>SortExpression</code>.
    */
  @js.native
  trait Suggester extends js.Object {
    var DocumentSuggesterOptions: DocumentSuggesterOptions
    var SuggesterName: StandardName
  }

  object Suggester {
    @inline
    def apply(
        DocumentSuggesterOptions: DocumentSuggesterOptions,
        SuggesterName: StandardName
    ): Suggester = {
      val __obj = js.Dynamic.literal(
        "DocumentSuggesterOptions" -> DocumentSuggesterOptions.asInstanceOf[js.Any],
        "SuggesterName" -> SuggesterName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Suggester]
    }
  }

  /** The value of a <code>Suggester</code> and its current status.
    */
  @js.native
  trait SuggesterStatus extends js.Object {
    var Options: Suggester
    var Status: OptionStatus
  }

  object SuggesterStatus {
    @inline
    def apply(
        Options: Suggester,
        Status: OptionStatus
    ): SuggesterStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SuggesterStatus]
    }
  }

  /** Options for a field that contains an array of text strings. Present if <code>IndexFieldType</code> specifies the field is of type <code>text-array</code>. A <code>text-array</code> field is always searchable. All options are enabled by default.
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
    @inline
    def apply(
        AnalysisScheme: js.UndefOr[Word] = js.undefined,
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        HighlightEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
    ): TextArrayOptions = {
      val __obj = js.Dynamic.literal()
      AnalysisScheme.foreach(__v => __obj.updateDynamic("AnalysisScheme")(__v.asInstanceOf[js.Any]))
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      HighlightEnabled.foreach(__v => __obj.updateDynamic("HighlightEnabled")(__v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.updateDynamic("ReturnEnabled")(__v.asInstanceOf[js.Any]))
      SourceFields.foreach(__v => __obj.updateDynamic("SourceFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextArrayOptions]
    }
  }

  /** Options for text field. Present if <code>IndexFieldType</code> specifies the field is of type <code>text</code>. A <code>text</code> field is always searchable. All options are enabled by default.
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
    @inline
    def apply(
        AnalysisScheme: js.UndefOr[Word] = js.undefined,
        DefaultValue: js.UndefOr[FieldValue] = js.undefined,
        HighlightEnabled: js.UndefOr[Boolean] = js.undefined,
        ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
        SortEnabled: js.UndefOr[Boolean] = js.undefined,
        SourceField: js.UndefOr[FieldName] = js.undefined
    ): TextOptions = {
      val __obj = js.Dynamic.literal()
      AnalysisScheme.foreach(__v => __obj.updateDynamic("AnalysisScheme")(__v.asInstanceOf[js.Any]))
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      HighlightEnabled.foreach(__v => __obj.updateDynamic("HighlightEnabled")(__v.asInstanceOf[js.Any]))
      ReturnEnabled.foreach(__v => __obj.updateDynamic("ReturnEnabled")(__v.asInstanceOf[js.Any]))
      SortEnabled.foreach(__v => __obj.updateDynamic("SortEnabled")(__v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.updateDynamic("SourceField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextOptions]
    }
  }

  /** Container for the parameters to the <code><a>UpdateAvailabilityOptions</a></code> operation. Specifies the name of the domain you want to update and the Multi-AZ availability option.
    */
  @js.native
  trait UpdateAvailabilityOptionsRequest extends js.Object {
    var DomainName: DomainName
    var MultiAZ: Boolean
  }

  object UpdateAvailabilityOptionsRequest {
    @inline
    def apply(
        DomainName: DomainName,
        MultiAZ: Boolean
    ): UpdateAvailabilityOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "MultiAZ" -> MultiAZ.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAvailabilityOptionsRequest]
    }
  }

  /** The result of a <code>UpdateAvailabilityOptions</code> request. Contains the status of the domain's availability options.
    */
  @js.native
  trait UpdateAvailabilityOptionsResponse extends js.Object {
    var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus]
  }

  object UpdateAvailabilityOptionsResponse {
    @inline
    def apply(
        AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.undefined
    ): UpdateAvailabilityOptionsResponse = {
      val __obj = js.Dynamic.literal()
      AvailabilityOptions.foreach(__v => __obj.updateDynamic("AvailabilityOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAvailabilityOptionsResponse]
    }
  }

  /** Container for the parameters to the <code><a>UpdateDomainEndpointOptions</a></code> operation. Specifies the name of the domain you want to update and the domain endpoint options.
    */
  @js.native
  trait UpdateDomainEndpointOptionsRequest extends js.Object {
    var DomainEndpointOptions: DomainEndpointOptions
    var DomainName: DomainName
  }

  object UpdateDomainEndpointOptionsRequest {
    @inline
    def apply(
        DomainEndpointOptions: DomainEndpointOptions,
        DomainName: DomainName
    ): UpdateDomainEndpointOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainEndpointOptions" -> DomainEndpointOptions.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDomainEndpointOptionsRequest]
    }
  }

  /** The result of a <code>UpdateDomainEndpointOptions</code> request. Contains the configuration and status of the domain's endpoint options.
    */
  @js.native
  trait UpdateDomainEndpointOptionsResponse extends js.Object {
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus]
  }

  object UpdateDomainEndpointOptionsResponse {
    @inline
    def apply(
        DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.undefined
    ): UpdateDomainEndpointOptionsResponse = {
      val __obj = js.Dynamic.literal()
      DomainEndpointOptions.foreach(__v => __obj.updateDynamic("DomainEndpointOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainEndpointOptionsResponse]
    }
  }

  /** Container for the parameters to the <code><a>UpdateScalingParameters</a></code> operation. Specifies the name of the domain you want to update and the scaling parameters you want to configure.
    */
  @js.native
  trait UpdateScalingParametersRequest extends js.Object {
    var DomainName: DomainName
    var ScalingParameters: ScalingParameters
  }

  object UpdateScalingParametersRequest {
    @inline
    def apply(
        DomainName: DomainName,
        ScalingParameters: ScalingParameters
    ): UpdateScalingParametersRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ScalingParameters" -> ScalingParameters.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateScalingParametersRequest]
    }
  }

  /** The result of a <code>UpdateScalingParameters</code> request. Contains the status of the newly-configured scaling parameters.
    */
  @js.native
  trait UpdateScalingParametersResponse extends js.Object {
    var ScalingParameters: ScalingParametersStatus
  }

  object UpdateScalingParametersResponse {
    @inline
    def apply(
        ScalingParameters: ScalingParametersStatus
    ): UpdateScalingParametersResponse = {
      val __obj = js.Dynamic.literal(
        "ScalingParameters" -> ScalingParameters.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateScalingParametersResponse]
    }
  }

  /** Container for the parameters to the <code><a>UpdateServiceAccessPolicies</a></code> operation. Specifies the name of the domain you want to update and the access rules you want to configure.
    */
  @js.native
  trait UpdateServiceAccessPoliciesRequest extends js.Object {
    var AccessPolicies: PolicyDocument
    var DomainName: DomainName
  }

  object UpdateServiceAccessPoliciesRequest {
    @inline
    def apply(
        AccessPolicies: PolicyDocument,
        DomainName: DomainName
    ): UpdateServiceAccessPoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "AccessPolicies" -> AccessPolicies.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateServiceAccessPoliciesRequest]
    }
  }

  /** The result of an <code>UpdateServiceAccessPolicies</code> request. Contains the new access policies.
    */
  @js.native
  trait UpdateServiceAccessPoliciesResponse extends js.Object {
    var AccessPolicies: AccessPoliciesStatus
  }

  object UpdateServiceAccessPoliciesResponse {
    @inline
    def apply(
        AccessPolicies: AccessPoliciesStatus
    ): UpdateServiceAccessPoliciesResponse = {
      val __obj = js.Dynamic.literal(
        "AccessPolicies" -> AccessPolicies.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateServiceAccessPoliciesResponse]
    }
  }
}
