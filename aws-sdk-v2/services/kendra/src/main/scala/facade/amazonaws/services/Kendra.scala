package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object kendra {
  type AdditionalResultAttributeList = js.Array[AdditionalResultAttribute]
  type AmazonResourceName = String
  type AssociateEntitiesToExperienceFailedEntityList = js.Array[FailedEntity]
  type AssociateEntityList = js.Array[EntityConfiguration]
  type AttributeFilterList = js.Array[AttributeFilter]
  type BasicAuthenticationConfigurationList = js.Array[BasicAuthenticationConfiguration]
  type BatchDeleteDocumentResponseFailedDocuments = js.Array[BatchDeleteDocumentResponseFailedDocument]
  type BatchGetDocumentStatusResponseErrors = js.Array[BatchGetDocumentStatusResponseError]
  type BatchPutDocumentResponseFailedDocuments = js.Array[BatchPutDocumentResponseFailedDocument]
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ChangeDetectingColumns = js.Array[ColumnName]
  type ClaimRegex = String
  type ClickFeedbackList = js.Array[ClickFeedback]
  type ClientTokenName = String
  type ColumnName = String
  type ConfluenceAttachmentFieldMappingsList = js.Array[ConfluenceAttachmentToIndexFieldMapping]
  type ConfluenceBlogFieldMappingsList = js.Array[ConfluenceBlogToIndexFieldMapping]
  type ConfluencePageFieldMappingsList = js.Array[ConfluencePageToIndexFieldMapping]
  type ConfluenceSpaceFieldMappingsList = js.Array[ConfluenceSpaceToIndexFieldMapping]
  type ConfluenceSpaceIdentifier = String
  type ConfluenceSpaceList = js.Array[ConfluenceSpaceIdentifier]
  type CrawlDepth = Int
  type DataSourceDateFieldFormat = String
  type DataSourceFieldName = String
  type DataSourceGroups = js.Array[DataSourceGroup]
  type DataSourceId = String
  type DataSourceIdList = js.Array[DataSourceId]
  type DataSourceInclusionsExclusionsStrings = js.Array[DataSourceInclusionsExclusionsStringsMember]
  type DataSourceInclusionsExclusionsStringsMember = String
  type DataSourceName = String
  type DataSourceSummaryList = js.Array[DataSourceSummary]
  type DataSourceSyncJobHistoryList = js.Array[DataSourceSyncJob]
  type DataSourceSyncJobId = String
  type DataSourceToIndexFieldMappingList = js.Array[DataSourceToIndexFieldMapping]
  type DatabaseHost = String
  type DatabaseName = String
  type DatabasePort = Int
  type Description = String
  type DisassociateEntityList = js.Array[EntityConfiguration]
  type DocumentAttributeKey = String
  type DocumentAttributeKeyList = js.Array[DocumentAttributeKey]
  type DocumentAttributeList = js.Array[DocumentAttribute]
  type DocumentAttributeStringListValue = js.Array[String]
  type DocumentAttributeStringValue = String
  type DocumentAttributeValueCountPairList = js.Array[DocumentAttributeValueCountPair]
  type DocumentId = String
  type DocumentIdList = js.Array[DocumentId]
  type DocumentInfoList = js.Array[DocumentInfo]
  type DocumentList = js.Array[Document]
  type DocumentMetadataBoolean = Boolean
  type DocumentMetadataConfigurationList = js.Array[DocumentMetadataConfiguration]
  type DocumentMetadataConfigurationName = String
  type DocumentRelevanceOverrideConfigurationList = js.Array[DocumentRelevanceConfiguration]
  type DocumentStatusList = js.Array[Status]
  type Duration = String
  type Endpoint = String
  type EntityId = String
  type EntityIdsList = js.Array[EntityId]
  type EntityPersonaConfigurationList = js.Array[EntityPersonaConfiguration]
  type ErrorMessage = String
  type ExcludeMimeTypesList = js.Array[MimeType]
  type ExcludeSharedDrivesList = js.Array[SharedDriveId]
  type ExcludeUserAccountsList = js.Array[UserAccount]
  type ExperienceEndpoints = js.Array[ExperienceEndpoint]
  type ExperienceEntitiesSummaryList = js.Array[ExperienceEntitiesSummary]
  type ExperienceId = String
  type ExperienceName = String
  type ExperiencesSummaryList = js.Array[ExperiencesSummary]
  type FacetList = js.Array[Facet]
  type FacetResultList = js.Array[FacetResult]
  type FailedEntityList = js.Array[FailedEntity]
  type FailureReason = String
  type FaqId = String
  type FaqIdsList = js.Array[FaqId]
  type FaqName = String
  type FaqSummaryItems = js.Array[FaqSummary]
  type FeedbackToken = String
  type GroupAttributeField = String
  type GroupId = String
  type GroupOrderingIdSummaries = js.Array[GroupOrderingIdSummary]
  type Groups = js.Array[PrincipalName]
  type HierarchicalPrincipalList = js.Array[HierarchicalPrincipal]
  type HighlightList = js.Array[Highlight]
  type Host = String
  type IdentityAttributeName = String
  type Importance = Int
  type IndexConfigurationSummaryList = js.Array[IndexConfigurationSummary]
  type IndexFieldName = String
  type IndexId = String
  type IndexName = String
  type IndexedQuestionAnswersCount = Int
  type IndexedTextBytes = Double
  type IndexedTextDocumentsCount = Int
  type InlineCustomDocumentEnrichmentConfigurationList = js.Array[InlineCustomDocumentEnrichmentConfiguration]
  type Issuer = String
  type KmsKeyId = String
  type LambdaArn = String
  type LanguageCode = String
  type ListOfGroupSummaries = js.Array[GroupSummary]
  type MaxContentSizePerPageInMegaBytes = Float
  type MaxLinksPerPage = Int
  type MaxResultsIntegerForListDataSourceSyncJobsRequest = Int
  type MaxResultsIntegerForListDataSourcesRequest = Int
  type MaxResultsIntegerForListEntityPersonasRequest = Int
  type MaxResultsIntegerForListExperiencesRequest = Int
  type MaxResultsIntegerForListFaqsRequest = Int
  type MaxResultsIntegerForListIndicesRequest = Int
  type MaxResultsIntegerForListPrincipalsRequest = Int
  type MaxResultsIntegerForListQuerySuggestionsBlockLists = Int
  type MaxResultsIntegerForListThesauriRequest = Int
  type MaxUrlsPerMinuteCrawlRate = Int
  type MemberGroups = js.Array[MemberGroup]
  type MemberUsers = js.Array[MemberUser]
  type MetricValue = String
  type MimeType = String
  type MinimumNumberOfQueryingUsers = Int
  type MinimumQueryCount = Int
  type NameType = String
  type NextToken = String
  type ObjectBoolean = Boolean
  type OneDriveUser = String
  type OneDriveUserList = js.Array[OneDriveUser]
  type OrganizationId = String
  type PersonasSummaryList = js.Array[PersonasSummary]
  type Port = Int
  type PrincipalList = js.Array[Principal]
  type PrincipalName = String
  type PrincipalOrderingId = Double
  type QueryCapacityUnit = Int
  type QueryId = String
  type QueryResultItemList = js.Array[QueryResultItem]
  type QuerySuggestionsBlockListId = String
  type QuerySuggestionsBlockListName = String
  type QuerySuggestionsBlockListSummaryItems = js.Array[QuerySuggestionsBlockListSummary]
  type QuerySuggestionsId = String
  type QueryText = String
  type RelevanceFeedbackList = js.Array[RelevanceFeedback]
  type ResultId = String
  type RoleArn = String
  type S3BucketName = String
  type S3ObjectKey = String
  type SalesforceChatterFeedIncludeFilterTypes = js.Array[SalesforceChatterFeedIncludeFilterType]
  type SalesforceCustomKnowledgeArticleTypeConfigurationList = js.Array[SalesforceCustomKnowledgeArticleTypeConfiguration]
  type SalesforceCustomKnowledgeArticleTypeName = String
  type SalesforceKnowledgeArticleStateList = js.Array[SalesforceKnowledgeArticleState]
  type SalesforceStandardObjectConfigurationList = js.Array[SalesforceStandardObjectConfiguration]
  type ScanSchedule = String
  type SecretArn = String
  type SecurityGroupIdList = js.Array[VpcSecurityGroupId]
  type SeedUrl = String
  type SeedUrlList = js.Array[SeedUrl]
  type ServiceNowHostUrl = String
  type ServiceNowKnowledgeArticleFilterQuery = String
  type SharePointUrlList = js.Array[Url]
  type SharedDriveId = String
  type SiteMap = String
  type SiteMapsList = js.Array[SiteMap]
  type SnapshotsDataHeaderFields = js.Array[String]
  type SnapshotsDataRecord = js.Array[String]
  type SnapshotsDataRecords = js.Array[SnapshotsDataRecord]
  type StorageCapacityUnit = Int
  type SubnetId = String
  type SubnetIdList = js.Array[SubnetId]
  type SuggestionHighlightList = js.Array[SuggestionHighlight]
  type SuggestionList = js.Array[Suggestion]
  type SuggestionQueryText = String
  type TableName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TenantDomain = String
  type ThesaurusId = String
  type ThesaurusName = String
  type ThesaurusSummaryItems = js.Array[ThesaurusSummary]
  type Timestamp = js.Date
  type Title = String
  type Token = String
  type Url = String
  type UserAccount = String
  type UserId = String
  type UserNameAttributeField = String
  type UserTokenConfigurationList = js.Array[UserTokenConfiguration]
  type ValueImportanceMap = js.Dictionary[Importance]
  type ValueImportanceMapKey = String
  type VisitorId = String
  type VpcSecurityGroupId = String

  final class KendraOps(private val service: Kendra) extends AnyVal {

    @inline def associateEntitiesToExperienceFuture(params: AssociateEntitiesToExperienceRequest): Future[AssociateEntitiesToExperienceResponse] = service.associateEntitiesToExperience(params).promise().toFuture
    @inline def associatePersonasToEntitiesFuture(params: AssociatePersonasToEntitiesRequest): Future[AssociatePersonasToEntitiesResponse] = service.associatePersonasToEntities(params).promise().toFuture
    @inline def batchDeleteDocumentFuture(params: BatchDeleteDocumentRequest): Future[BatchDeleteDocumentResponse] = service.batchDeleteDocument(params).promise().toFuture
    @inline def batchGetDocumentStatusFuture(params: BatchGetDocumentStatusRequest): Future[BatchGetDocumentStatusResponse] = service.batchGetDocumentStatus(params).promise().toFuture
    @inline def batchPutDocumentFuture(params: BatchPutDocumentRequest): Future[BatchPutDocumentResponse] = service.batchPutDocument(params).promise().toFuture
    @inline def clearQuerySuggestionsFuture(params: ClearQuerySuggestionsRequest): Future[js.Object] = service.clearQuerySuggestions(params).promise().toFuture
    @inline def createDataSourceFuture(params: CreateDataSourceRequest): Future[CreateDataSourceResponse] = service.createDataSource(params).promise().toFuture
    @inline def createExperienceFuture(params: CreateExperienceRequest): Future[CreateExperienceResponse] = service.createExperience(params).promise().toFuture
    @inline def createFaqFuture(params: CreateFaqRequest): Future[CreateFaqResponse] = service.createFaq(params).promise().toFuture
    @inline def createIndexFuture(params: CreateIndexRequest): Future[CreateIndexResponse] = service.createIndex(params).promise().toFuture
    @inline def createQuerySuggestionsBlockListFuture(params: CreateQuerySuggestionsBlockListRequest): Future[CreateQuerySuggestionsBlockListResponse] = service.createQuerySuggestionsBlockList(params).promise().toFuture
    @inline def createThesaurusFuture(params: CreateThesaurusRequest): Future[CreateThesaurusResponse] = service.createThesaurus(params).promise().toFuture
    @inline def deleteDataSourceFuture(params: DeleteDataSourceRequest): Future[js.Object] = service.deleteDataSource(params).promise().toFuture
    @inline def deleteExperienceFuture(params: DeleteExperienceRequest): Future[DeleteExperienceResponse] = service.deleteExperience(params).promise().toFuture
    @inline def deleteFaqFuture(params: DeleteFaqRequest): Future[js.Object] = service.deleteFaq(params).promise().toFuture
    @inline def deleteIndexFuture(params: DeleteIndexRequest): Future[js.Object] = service.deleteIndex(params).promise().toFuture
    @inline def deletePrincipalMappingFuture(params: DeletePrincipalMappingRequest): Future[js.Object] = service.deletePrincipalMapping(params).promise().toFuture
    @inline def deleteQuerySuggestionsBlockListFuture(params: DeleteQuerySuggestionsBlockListRequest): Future[js.Object] = service.deleteQuerySuggestionsBlockList(params).promise().toFuture
    @inline def deleteThesaurusFuture(params: DeleteThesaurusRequest): Future[js.Object] = service.deleteThesaurus(params).promise().toFuture
    @inline def describeDataSourceFuture(params: DescribeDataSourceRequest): Future[DescribeDataSourceResponse] = service.describeDataSource(params).promise().toFuture
    @inline def describeExperienceFuture(params: DescribeExperienceRequest): Future[DescribeExperienceResponse] = service.describeExperience(params).promise().toFuture
    @inline def describeFaqFuture(params: DescribeFaqRequest): Future[DescribeFaqResponse] = service.describeFaq(params).promise().toFuture
    @inline def describeIndexFuture(params: DescribeIndexRequest): Future[DescribeIndexResponse] = service.describeIndex(params).promise().toFuture
    @inline def describePrincipalMappingFuture(params: DescribePrincipalMappingRequest): Future[DescribePrincipalMappingResponse] = service.describePrincipalMapping(params).promise().toFuture
    @inline def describeQuerySuggestionsBlockListFuture(params: DescribeQuerySuggestionsBlockListRequest): Future[DescribeQuerySuggestionsBlockListResponse] = service.describeQuerySuggestionsBlockList(params).promise().toFuture
    @inline def describeQuerySuggestionsConfigFuture(params: DescribeQuerySuggestionsConfigRequest): Future[DescribeQuerySuggestionsConfigResponse] = service.describeQuerySuggestionsConfig(params).promise().toFuture
    @inline def describeThesaurusFuture(params: DescribeThesaurusRequest): Future[DescribeThesaurusResponse] = service.describeThesaurus(params).promise().toFuture
    @inline def disassociateEntitiesFromExperienceFuture(params: DisassociateEntitiesFromExperienceRequest): Future[DisassociateEntitiesFromExperienceResponse] = service.disassociateEntitiesFromExperience(params).promise().toFuture
    @inline def disassociatePersonasFromEntitiesFuture(params: DisassociatePersonasFromEntitiesRequest): Future[DisassociatePersonasFromEntitiesResponse] = service.disassociatePersonasFromEntities(params).promise().toFuture
    @inline def getQuerySuggestionsFuture(params: GetQuerySuggestionsRequest): Future[GetQuerySuggestionsResponse] = service.getQuerySuggestions(params).promise().toFuture
    @inline def getSnapshotsFuture(params: GetSnapshotsRequest): Future[GetSnapshotsResponse] = service.getSnapshots(params).promise().toFuture
    @inline def listDataSourceSyncJobsFuture(params: ListDataSourceSyncJobsRequest): Future[ListDataSourceSyncJobsResponse] = service.listDataSourceSyncJobs(params).promise().toFuture
    @inline def listDataSourcesFuture(params: ListDataSourcesRequest): Future[ListDataSourcesResponse] = service.listDataSources(params).promise().toFuture
    @inline def listEntityPersonasFuture(params: ListEntityPersonasRequest): Future[ListEntityPersonasResponse] = service.listEntityPersonas(params).promise().toFuture
    @inline def listExperienceEntitiesFuture(params: ListExperienceEntitiesRequest): Future[ListExperienceEntitiesResponse] = service.listExperienceEntities(params).promise().toFuture
    @inline def listExperiencesFuture(params: ListExperiencesRequest): Future[ListExperiencesResponse] = service.listExperiences(params).promise().toFuture
    @inline def listFaqsFuture(params: ListFaqsRequest): Future[ListFaqsResponse] = service.listFaqs(params).promise().toFuture
    @inline def listGroupsOlderThanOrderingIdFuture(params: ListGroupsOlderThanOrderingIdRequest): Future[ListGroupsOlderThanOrderingIdResponse] = service.listGroupsOlderThanOrderingId(params).promise().toFuture
    @inline def listIndicesFuture(params: ListIndicesRequest): Future[ListIndicesResponse] = service.listIndices(params).promise().toFuture
    @inline def listQuerySuggestionsBlockListsFuture(params: ListQuerySuggestionsBlockListsRequest): Future[ListQuerySuggestionsBlockListsResponse] = service.listQuerySuggestionsBlockLists(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listThesauriFuture(params: ListThesauriRequest): Future[ListThesauriResponse] = service.listThesauri(params).promise().toFuture
    @inline def putPrincipalMappingFuture(params: PutPrincipalMappingRequest): Future[js.Object] = service.putPrincipalMapping(params).promise().toFuture
    @inline def queryFuture(params: QueryRequest): Future[QueryResult] = service.query(params).promise().toFuture
    @inline def startDataSourceSyncJobFuture(params: StartDataSourceSyncJobRequest): Future[StartDataSourceSyncJobResponse] = service.startDataSourceSyncJob(params).promise().toFuture
    @inline def stopDataSourceSyncJobFuture(params: StopDataSourceSyncJobRequest): Future[js.Object] = service.stopDataSourceSyncJob(params).promise().toFuture
    @inline def submitFeedbackFuture(params: SubmitFeedbackRequest): Future[js.Object] = service.submitFeedback(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDataSourceFuture(params: UpdateDataSourceRequest): Future[js.Object] = service.updateDataSource(params).promise().toFuture
    @inline def updateExperienceFuture(params: UpdateExperienceRequest): Future[js.Object] = service.updateExperience(params).promise().toFuture
    @inline def updateIndexFuture(params: UpdateIndexRequest): Future[js.Object] = service.updateIndex(params).promise().toFuture
    @inline def updateQuerySuggestionsBlockListFuture(params: UpdateQuerySuggestionsBlockListRequest): Future[js.Object] = service.updateQuerySuggestionsBlockList(params).promise().toFuture
    @inline def updateQuerySuggestionsConfigFuture(params: UpdateQuerySuggestionsConfigRequest): Future[js.Object] = service.updateQuerySuggestionsConfig(params).promise().toFuture
    @inline def updateThesaurusFuture(params: UpdateThesaurusRequest): Future[js.Object] = service.updateThesaurus(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/kendra", JSImport.Namespace, "AWS.Kendra")
  class Kendra() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateEntitiesToExperience(params: AssociateEntitiesToExperienceRequest): Request[AssociateEntitiesToExperienceResponse] = js.native
    def associatePersonasToEntities(params: AssociatePersonasToEntitiesRequest): Request[AssociatePersonasToEntitiesResponse] = js.native
    def batchDeleteDocument(params: BatchDeleteDocumentRequest): Request[BatchDeleteDocumentResponse] = js.native
    def batchGetDocumentStatus(params: BatchGetDocumentStatusRequest): Request[BatchGetDocumentStatusResponse] = js.native
    def batchPutDocument(params: BatchPutDocumentRequest): Request[BatchPutDocumentResponse] = js.native
    def clearQuerySuggestions(params: ClearQuerySuggestionsRequest): Request[js.Object] = js.native
    def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse] = js.native
    def createExperience(params: CreateExperienceRequest): Request[CreateExperienceResponse] = js.native
    def createFaq(params: CreateFaqRequest): Request[CreateFaqResponse] = js.native
    def createIndex(params: CreateIndexRequest): Request[CreateIndexResponse] = js.native
    def createQuerySuggestionsBlockList(params: CreateQuerySuggestionsBlockListRequest): Request[CreateQuerySuggestionsBlockListResponse] = js.native
    def createThesaurus(params: CreateThesaurusRequest): Request[CreateThesaurusResponse] = js.native
    def deleteDataSource(params: DeleteDataSourceRequest): Request[js.Object] = js.native
    def deleteExperience(params: DeleteExperienceRequest): Request[DeleteExperienceResponse] = js.native
    def deleteFaq(params: DeleteFaqRequest): Request[js.Object] = js.native
    def deleteIndex(params: DeleteIndexRequest): Request[js.Object] = js.native
    def deletePrincipalMapping(params: DeletePrincipalMappingRequest): Request[js.Object] = js.native
    def deleteQuerySuggestionsBlockList(params: DeleteQuerySuggestionsBlockListRequest): Request[js.Object] = js.native
    def deleteThesaurus(params: DeleteThesaurusRequest): Request[js.Object] = js.native
    def describeDataSource(params: DescribeDataSourceRequest): Request[DescribeDataSourceResponse] = js.native
    def describeExperience(params: DescribeExperienceRequest): Request[DescribeExperienceResponse] = js.native
    def describeFaq(params: DescribeFaqRequest): Request[DescribeFaqResponse] = js.native
    def describeIndex(params: DescribeIndexRequest): Request[DescribeIndexResponse] = js.native
    def describePrincipalMapping(params: DescribePrincipalMappingRequest): Request[DescribePrincipalMappingResponse] = js.native
    def describeQuerySuggestionsBlockList(params: DescribeQuerySuggestionsBlockListRequest): Request[DescribeQuerySuggestionsBlockListResponse] = js.native
    def describeQuerySuggestionsConfig(params: DescribeQuerySuggestionsConfigRequest): Request[DescribeQuerySuggestionsConfigResponse] = js.native
    def describeThesaurus(params: DescribeThesaurusRequest): Request[DescribeThesaurusResponse] = js.native
    def disassociateEntitiesFromExperience(params: DisassociateEntitiesFromExperienceRequest): Request[DisassociateEntitiesFromExperienceResponse] = js.native
    def disassociatePersonasFromEntities(params: DisassociatePersonasFromEntitiesRequest): Request[DisassociatePersonasFromEntitiesResponse] = js.native
    def getQuerySuggestions(params: GetQuerySuggestionsRequest): Request[GetQuerySuggestionsResponse] = js.native
    def getSnapshots(params: GetSnapshotsRequest): Request[GetSnapshotsResponse] = js.native
    def listDataSourceSyncJobs(params: ListDataSourceSyncJobsRequest): Request[ListDataSourceSyncJobsResponse] = js.native
    def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse] = js.native
    def listEntityPersonas(params: ListEntityPersonasRequest): Request[ListEntityPersonasResponse] = js.native
    def listExperienceEntities(params: ListExperienceEntitiesRequest): Request[ListExperienceEntitiesResponse] = js.native
    def listExperiences(params: ListExperiencesRequest): Request[ListExperiencesResponse] = js.native
    def listFaqs(params: ListFaqsRequest): Request[ListFaqsResponse] = js.native
    def listGroupsOlderThanOrderingId(params: ListGroupsOlderThanOrderingIdRequest): Request[ListGroupsOlderThanOrderingIdResponse] = js.native
    def listIndices(params: ListIndicesRequest): Request[ListIndicesResponse] = js.native
    def listQuerySuggestionsBlockLists(params: ListQuerySuggestionsBlockListsRequest): Request[ListQuerySuggestionsBlockListsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listThesauri(params: ListThesauriRequest): Request[ListThesauriResponse] = js.native
    def putPrincipalMapping(params: PutPrincipalMappingRequest): Request[js.Object] = js.native
    def query(params: QueryRequest): Request[QueryResult] = js.native
    def startDataSourceSyncJob(params: StartDataSourceSyncJobRequest): Request[StartDataSourceSyncJobResponse] = js.native
    def stopDataSourceSyncJob(params: StopDataSourceSyncJobRequest): Request[js.Object] = js.native
    def submitFeedback(params: SubmitFeedbackRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDataSource(params: UpdateDataSourceRequest): Request[js.Object] = js.native
    def updateExperience(params: UpdateExperienceRequest): Request[js.Object] = js.native
    def updateIndex(params: UpdateIndexRequest): Request[js.Object] = js.native
    def updateQuerySuggestionsBlockList(params: UpdateQuerySuggestionsBlockListRequest): Request[js.Object] = js.native
    def updateQuerySuggestionsConfig(params: UpdateQuerySuggestionsConfigRequest): Request[js.Object] = js.native
    def updateThesaurus(params: UpdateThesaurusRequest): Request[js.Object] = js.native
  }
  object Kendra {
    @inline implicit def toOps(service: Kendra): KendraOps = {
      new KendraOps(service)
    }
  }

  /** Access Control List files for the documents in a data source. For the format of the file, see [[https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html|Access control for S3 data sources]].
    */
  @js.native
  trait AccessControlListConfiguration extends js.Object {
    var KeyPath: js.UndefOr[S3ObjectKey]
  }

  object AccessControlListConfiguration {
    @inline
    def apply(
        KeyPath: js.UndefOr[S3ObjectKey] = js.undefined
    ): AccessControlListConfiguration = {
      val __obj = js.Dynamic.literal()
      KeyPath.foreach(__v => __obj.updateDynamic("KeyPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessControlListConfiguration]
    }
  }

  /** Provides information about the column that should be used for filtering the query response by groups.
    */
  @js.native
  trait AclConfiguration extends js.Object {
    var AllowedGroupsColumnName: ColumnName
  }

  object AclConfiguration {
    @inline
    def apply(
        AllowedGroupsColumnName: ColumnName
    ): AclConfiguration = {
      val __obj = js.Dynamic.literal(
        "AllowedGroupsColumnName" -> AllowedGroupsColumnName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AclConfiguration]
    }
  }

  /** An attribute returned from an index query.
    */
  @js.native
  trait AdditionalResultAttribute extends js.Object {
    var Key: String
    var Value: AdditionalResultAttributeValue
    var ValueType: AdditionalResultAttributeValueType
  }

  object AdditionalResultAttribute {
    @inline
    def apply(
        Key: String,
        Value: AdditionalResultAttributeValue,
        ValueType: AdditionalResultAttributeValueType
    ): AdditionalResultAttribute = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any],
        "ValueType" -> ValueType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdditionalResultAttribute]
    }
  }

  /** An attribute returned with a document from a search.
    */
  @js.native
  trait AdditionalResultAttributeValue extends js.Object {
    var TextWithHighlightsValue: js.UndefOr[TextWithHighlights]
  }

  object AdditionalResultAttributeValue {
    @inline
    def apply(
        TextWithHighlightsValue: js.UndefOr[TextWithHighlights] = js.undefined
    ): AdditionalResultAttributeValue = {
      val __obj = js.Dynamic.literal()
      TextWithHighlightsValue.foreach(__v => __obj.updateDynamic("TextWithHighlightsValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdditionalResultAttributeValue]
    }
  }

  @js.native
  trait AssociateEntitiesToExperienceRequest extends js.Object {
    var EntityList: AssociateEntityList
    var Id: ExperienceId
    var IndexId: IndexId
  }

  object AssociateEntitiesToExperienceRequest {
    @inline
    def apply(
        EntityList: AssociateEntityList,
        Id: ExperienceId,
        IndexId: IndexId
    ): AssociateEntitiesToExperienceRequest = {
      val __obj = js.Dynamic.literal(
        "EntityList" -> EntityList.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateEntitiesToExperienceRequest]
    }
  }

  @js.native
  trait AssociateEntitiesToExperienceResponse extends js.Object {
    var FailedEntityList: js.UndefOr[AssociateEntitiesToExperienceFailedEntityList]
  }

  object AssociateEntitiesToExperienceResponse {
    @inline
    def apply(
        FailedEntityList: js.UndefOr[AssociateEntitiesToExperienceFailedEntityList] = js.undefined
    ): AssociateEntitiesToExperienceResponse = {
      val __obj = js.Dynamic.literal()
      FailedEntityList.foreach(__v => __obj.updateDynamic("FailedEntityList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateEntitiesToExperienceResponse]
    }
  }

  @js.native
  trait AssociatePersonasToEntitiesRequest extends js.Object {
    var Id: ExperienceId
    var IndexId: IndexId
    var Personas: EntityPersonaConfigurationList
  }

  object AssociatePersonasToEntitiesRequest {
    @inline
    def apply(
        Id: ExperienceId,
        IndexId: IndexId,
        Personas: EntityPersonaConfigurationList
    ): AssociatePersonasToEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any],
        "Personas" -> Personas.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociatePersonasToEntitiesRequest]
    }
  }

  @js.native
  trait AssociatePersonasToEntitiesResponse extends js.Object {
    var FailedEntityList: js.UndefOr[FailedEntityList]
  }

  object AssociatePersonasToEntitiesResponse {
    @inline
    def apply(
        FailedEntityList: js.UndefOr[FailedEntityList] = js.undefined
    ): AssociatePersonasToEntitiesResponse = {
      val __obj = js.Dynamic.literal()
      FailedEntityList.foreach(__v => __obj.updateDynamic("FailedEntityList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePersonasToEntitiesResponse]
    }
  }

  /** Provides filtering the query results based on document attributes. When you use the <code>AndAllFilters</code> or <code>OrAllFilters</code>, filters you can use 2 layers under the first attribute filter. For example, you can use: <code>&lt;AndAllFilters&gt;</code> <ol> * <code> &lt;OrAllFilters&gt;</code> * <code> &lt;EqualsTo&gt;</code> </ol> If you use more than 2 layers, you receive a <code>ValidationException</code> exception with the message "<code>AttributeFilter</code> cannot have a depth of more than 2." If you use more than 10 attribute filters in a given list for <code>AndAllFilters</code> or <code>OrAllFilters</code>, you receive a <code>ValidationException</code> with the message "<code>AttributeFilter</code> cannot have a length of more than 10".
    */
  @js.native
  trait AttributeFilter extends js.Object {
    var AndAllFilters: js.UndefOr[AttributeFilterList]
    var ContainsAll: js.UndefOr[DocumentAttribute]
    var ContainsAny: js.UndefOr[DocumentAttribute]
    var EqualsTo: js.UndefOr[DocumentAttribute]
    var GreaterThan: js.UndefOr[DocumentAttribute]
    var GreaterThanOrEquals: js.UndefOr[DocumentAttribute]
    var LessThan: js.UndefOr[DocumentAttribute]
    var LessThanOrEquals: js.UndefOr[DocumentAttribute]
    var NotFilter: js.UndefOr[AttributeFilter]
    var OrAllFilters: js.UndefOr[AttributeFilterList]
  }

  object AttributeFilter {
    @inline
    def apply(
        AndAllFilters: js.UndefOr[AttributeFilterList] = js.undefined,
        ContainsAll: js.UndefOr[DocumentAttribute] = js.undefined,
        ContainsAny: js.UndefOr[DocumentAttribute] = js.undefined,
        EqualsTo: js.UndefOr[DocumentAttribute] = js.undefined,
        GreaterThan: js.UndefOr[DocumentAttribute] = js.undefined,
        GreaterThanOrEquals: js.UndefOr[DocumentAttribute] = js.undefined,
        LessThan: js.UndefOr[DocumentAttribute] = js.undefined,
        LessThanOrEquals: js.UndefOr[DocumentAttribute] = js.undefined,
        NotFilter: js.UndefOr[AttributeFilter] = js.undefined,
        OrAllFilters: js.UndefOr[AttributeFilterList] = js.undefined
    ): AttributeFilter = {
      val __obj = js.Dynamic.literal()
      AndAllFilters.foreach(__v => __obj.updateDynamic("AndAllFilters")(__v.asInstanceOf[js.Any]))
      ContainsAll.foreach(__v => __obj.updateDynamic("ContainsAll")(__v.asInstanceOf[js.Any]))
      ContainsAny.foreach(__v => __obj.updateDynamic("ContainsAny")(__v.asInstanceOf[js.Any]))
      EqualsTo.foreach(__v => __obj.updateDynamic("EqualsTo")(__v.asInstanceOf[js.Any]))
      GreaterThan.foreach(__v => __obj.updateDynamic("GreaterThan")(__v.asInstanceOf[js.Any]))
      GreaterThanOrEquals.foreach(__v => __obj.updateDynamic("GreaterThanOrEquals")(__v.asInstanceOf[js.Any]))
      LessThan.foreach(__v => __obj.updateDynamic("LessThan")(__v.asInstanceOf[js.Any]))
      LessThanOrEquals.foreach(__v => __obj.updateDynamic("LessThanOrEquals")(__v.asInstanceOf[js.Any]))
      NotFilter.foreach(__v => __obj.updateDynamic("NotFilter")(__v.asInstanceOf[js.Any]))
      OrAllFilters.foreach(__v => __obj.updateDynamic("OrAllFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributeFilter]
    }
  }

  /** Provides the configuration information to connect to websites that require user authentication.
    */
  @js.native
  trait AuthenticationConfiguration extends js.Object {
    var BasicAuthentication: js.UndefOr[BasicAuthenticationConfigurationList]
  }

  object AuthenticationConfiguration {
    @inline
    def apply(
        BasicAuthentication: js.UndefOr[BasicAuthenticationConfigurationList] = js.undefined
    ): AuthenticationConfiguration = {
      val __obj = js.Dynamic.literal()
      BasicAuthentication.foreach(__v => __obj.updateDynamic("BasicAuthentication")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthenticationConfiguration]
    }
  }

  /** Provides the configuration information to connect to websites that require basic user authentication.
    */
  @js.native
  trait BasicAuthenticationConfiguration extends js.Object {
    var Credentials: SecretArn
    var Host: Host
    var Port: Port
  }

  object BasicAuthenticationConfiguration {
    @inline
    def apply(
        Credentials: SecretArn,
        Host: Host,
        Port: Port
    ): BasicAuthenticationConfiguration = {
      val __obj = js.Dynamic.literal(
        "Credentials" -> Credentials.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BasicAuthenticationConfiguration]
    }
  }

  @js.native
  trait BatchDeleteDocumentRequest extends js.Object {
    var DocumentIdList: DocumentIdList
    var IndexId: IndexId
    var DataSourceSyncJobMetricTarget: js.UndefOr[DataSourceSyncJobMetricTarget]
  }

  object BatchDeleteDocumentRequest {
    @inline
    def apply(
        DocumentIdList: DocumentIdList,
        IndexId: IndexId,
        DataSourceSyncJobMetricTarget: js.UndefOr[DataSourceSyncJobMetricTarget] = js.undefined
    ): BatchDeleteDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentIdList" -> DocumentIdList.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      DataSourceSyncJobMetricTarget.foreach(__v => __obj.updateDynamic("DataSourceSyncJobMetricTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteDocumentRequest]
    }
  }

  @js.native
  trait BatchDeleteDocumentResponse extends js.Object {
    var FailedDocuments: js.UndefOr[BatchDeleteDocumentResponseFailedDocuments]
  }

  object BatchDeleteDocumentResponse {
    @inline
    def apply(
        FailedDocuments: js.UndefOr[BatchDeleteDocumentResponseFailedDocuments] = js.undefined
    ): BatchDeleteDocumentResponse = {
      val __obj = js.Dynamic.literal()
      FailedDocuments.foreach(__v => __obj.updateDynamic("FailedDocuments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteDocumentResponse]
    }
  }

  /** Provides information about documents that could not be removed from an index by the <code>BatchDeleteDocument</code> operation.
    */
  @js.native
  trait BatchDeleteDocumentResponseFailedDocument extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var Id: js.UndefOr[DocumentId]
  }

  object BatchDeleteDocumentResponseFailedDocument {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        Id: js.UndefOr[DocumentId] = js.undefined
    ): BatchDeleteDocumentResponseFailedDocument = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteDocumentResponseFailedDocument]
    }
  }

  @js.native
  trait BatchGetDocumentStatusRequest extends js.Object {
    var DocumentInfoList: DocumentInfoList
    var IndexId: IndexId
  }

  object BatchGetDocumentStatusRequest {
    @inline
    def apply(
        DocumentInfoList: DocumentInfoList,
        IndexId: IndexId
    ): BatchGetDocumentStatusRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentInfoList" -> DocumentInfoList.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetDocumentStatusRequest]
    }
  }

  @js.native
  trait BatchGetDocumentStatusResponse extends js.Object {
    var DocumentStatusList: js.UndefOr[DocumentStatusList]
    var Errors: js.UndefOr[BatchGetDocumentStatusResponseErrors]
  }

  object BatchGetDocumentStatusResponse {
    @inline
    def apply(
        DocumentStatusList: js.UndefOr[DocumentStatusList] = js.undefined,
        Errors: js.UndefOr[BatchGetDocumentStatusResponseErrors] = js.undefined
    ): BatchGetDocumentStatusResponse = {
      val __obj = js.Dynamic.literal()
      DocumentStatusList.foreach(__v => __obj.updateDynamic("DocumentStatusList")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetDocumentStatusResponse]
    }
  }

  /** Provides a response when the status of a document could not be retrieved.
    */
  @js.native
  trait BatchGetDocumentStatusResponseError extends js.Object {
    var DocumentId: js.UndefOr[DocumentId]
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  object BatchGetDocumentStatusResponseError {
    @inline
    def apply(
        DocumentId: js.UndefOr[DocumentId] = js.undefined,
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): BatchGetDocumentStatusResponseError = {
      val __obj = js.Dynamic.literal()
      DocumentId.foreach(__v => __obj.updateDynamic("DocumentId")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetDocumentStatusResponseError]
    }
  }

  @js.native
  trait BatchPutDocumentRequest extends js.Object {
    var Documents: DocumentList
    var IndexId: IndexId
    var CustomDocumentEnrichmentConfiguration: js.UndefOr[CustomDocumentEnrichmentConfiguration]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object BatchPutDocumentRequest {
    @inline
    def apply(
        Documents: DocumentList,
        IndexId: IndexId,
        CustomDocumentEnrichmentConfiguration: js.UndefOr[CustomDocumentEnrichmentConfiguration] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): BatchPutDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "Documents" -> Documents.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      CustomDocumentEnrichmentConfiguration.foreach(__v => __obj.updateDynamic("CustomDocumentEnrichmentConfiguration")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPutDocumentRequest]
    }
  }

  @js.native
  trait BatchPutDocumentResponse extends js.Object {
    var FailedDocuments: js.UndefOr[BatchPutDocumentResponseFailedDocuments]
  }

  object BatchPutDocumentResponse {
    @inline
    def apply(
        FailedDocuments: js.UndefOr[BatchPutDocumentResponseFailedDocuments] = js.undefined
    ): BatchPutDocumentResponse = {
      val __obj = js.Dynamic.literal()
      FailedDocuments.foreach(__v => __obj.updateDynamic("FailedDocuments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPutDocumentResponse]
    }
  }

  /** Provides information about a document that could not be indexed.
    */
  @js.native
  trait BatchPutDocumentResponseFailedDocument extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var Id: js.UndefOr[DocumentId]
  }

  object BatchPutDocumentResponseFailedDocument {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        Id: js.UndefOr[DocumentId] = js.undefined
    ): BatchPutDocumentResponseFailedDocument = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPutDocumentResponseFailedDocument]
    }
  }

  /** Specifies capacity units configured for your enterprise edition index. You can add and remove capacity units to tune an index to your requirements.
    */
  @js.native
  trait CapacityUnitsConfiguration extends js.Object {
    var QueryCapacityUnits: QueryCapacityUnit
    var StorageCapacityUnits: StorageCapacityUnit
  }

  object CapacityUnitsConfiguration {
    @inline
    def apply(
        QueryCapacityUnits: QueryCapacityUnit,
        StorageCapacityUnits: StorageCapacityUnit
    ): CapacityUnitsConfiguration = {
      val __obj = js.Dynamic.literal(
        "QueryCapacityUnits" -> QueryCapacityUnits.asInstanceOf[js.Any],
        "StorageCapacityUnits" -> StorageCapacityUnits.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CapacityUnitsConfiguration]
    }
  }

  @js.native
  trait ClearQuerySuggestionsRequest extends js.Object {
    var IndexId: IndexId
  }

  object ClearQuerySuggestionsRequest {
    @inline
    def apply(
        IndexId: IndexId
    ): ClearQuerySuggestionsRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ClearQuerySuggestionsRequest]
    }
  }

  /** Gathers information about when a particular result was clicked by a user. Your application uses the <code>SubmitFeedback</code> operation to provide click information.
    */
  @js.native
  trait ClickFeedback extends js.Object {
    var ClickTime: Timestamp
    var ResultId: ResultId
  }

  object ClickFeedback {
    @inline
    def apply(
        ClickTime: Timestamp,
        ResultId: ResultId
    ): ClickFeedback = {
      val __obj = js.Dynamic.literal(
        "ClickTime" -> ClickTime.asInstanceOf[js.Any],
        "ResultId" -> ResultId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ClickFeedback]
    }
  }

  /** Provides information about how Amazon Kendra should use the columns of a database in an index.
    */
  @js.native
  trait ColumnConfiguration extends js.Object {
    var ChangeDetectingColumns: ChangeDetectingColumns
    var DocumentDataColumnName: ColumnName
    var DocumentIdColumnName: ColumnName
    var DocumentTitleColumnName: js.UndefOr[ColumnName]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
  }

  object ColumnConfiguration {
    @inline
    def apply(
        ChangeDetectingColumns: ChangeDetectingColumns,
        DocumentDataColumnName: ColumnName,
        DocumentIdColumnName: ColumnName,
        DocumentTitleColumnName: js.UndefOr[ColumnName] = js.undefined,
        FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
    ): ColumnConfiguration = {
      val __obj = js.Dynamic.literal(
        "ChangeDetectingColumns" -> ChangeDetectingColumns.asInstanceOf[js.Any],
        "DocumentDataColumnName" -> DocumentDataColumnName.asInstanceOf[js.Any],
        "DocumentIdColumnName" -> DocumentIdColumnName.asInstanceOf[js.Any]
      )

      DocumentTitleColumnName.foreach(__v => __obj.updateDynamic("DocumentTitleColumnName")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnConfiguration]
    }
  }

  /** Specifies the attachment settings for the Confluence data source. Attachment settings are optional, if you don't specify settings attachments, Amazon Kendra won't index them.
    */
  @js.native
  trait ConfluenceAttachmentConfiguration extends js.Object {
    var AttachmentFieldMappings: js.UndefOr[ConfluenceAttachmentFieldMappingsList]
    var CrawlAttachments: js.UndefOr[Boolean]
  }

  object ConfluenceAttachmentConfiguration {
    @inline
    def apply(
        AttachmentFieldMappings: js.UndefOr[ConfluenceAttachmentFieldMappingsList] = js.undefined,
        CrawlAttachments: js.UndefOr[Boolean] = js.undefined
    ): ConfluenceAttachmentConfiguration = {
      val __obj = js.Dynamic.literal()
      AttachmentFieldMappings.foreach(__v => __obj.updateDynamic("AttachmentFieldMappings")(__v.asInstanceOf[js.Any]))
      CrawlAttachments.foreach(__v => __obj.updateDynamic("CrawlAttachments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfluenceAttachmentConfiguration]
    }
  }

  /** Defines the mapping between a field in the Confluence data source to a Amazon Kendra index field. You must first create the index field using the <code>UpdateIndex</code> operation.
    */
  @js.native
  trait ConfluenceAttachmentToIndexFieldMapping extends js.Object {
    var DataSourceFieldName: js.UndefOr[ConfluenceAttachmentFieldName]
    var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat]
    var IndexFieldName: js.UndefOr[IndexFieldName]
  }

  object ConfluenceAttachmentToIndexFieldMapping {
    @inline
    def apply(
        DataSourceFieldName: js.UndefOr[ConfluenceAttachmentFieldName] = js.undefined,
        DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat] = js.undefined,
        IndexFieldName: js.UndefOr[IndexFieldName] = js.undefined
    ): ConfluenceAttachmentToIndexFieldMapping = {
      val __obj = js.Dynamic.literal()
      DataSourceFieldName.foreach(__v => __obj.updateDynamic("DataSourceFieldName")(__v.asInstanceOf[js.Any]))
      DateFieldFormat.foreach(__v => __obj.updateDynamic("DateFieldFormat")(__v.asInstanceOf[js.Any]))
      IndexFieldName.foreach(__v => __obj.updateDynamic("IndexFieldName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfluenceAttachmentToIndexFieldMapping]
    }
  }

  /** Specifies the blog settings for the Confluence data source. Blogs are always indexed unless filtered from the index by the <code>ExclusionPatterns</code> or <code>InclusionPatterns</code> fields in the <code>ConfluenceConfiguration</code> type.
    */
  @js.native
  trait ConfluenceBlogConfiguration extends js.Object {
    var BlogFieldMappings: js.UndefOr[ConfluenceBlogFieldMappingsList]
  }

  object ConfluenceBlogConfiguration {
    @inline
    def apply(
        BlogFieldMappings: js.UndefOr[ConfluenceBlogFieldMappingsList] = js.undefined
    ): ConfluenceBlogConfiguration = {
      val __obj = js.Dynamic.literal()
      BlogFieldMappings.foreach(__v => __obj.updateDynamic("BlogFieldMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfluenceBlogConfiguration]
    }
  }

  /** Defines the mapping between a blog field in the Confluence data source to a Amazon Kendra index field. You must first create the index field using the <code>UpdateIndex</code> operation.
    */
  @js.native
  trait ConfluenceBlogToIndexFieldMapping extends js.Object {
    var DataSourceFieldName: js.UndefOr[ConfluenceBlogFieldName]
    var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat]
    var IndexFieldName: js.UndefOr[IndexFieldName]
  }

  object ConfluenceBlogToIndexFieldMapping {
    @inline
    def apply(
        DataSourceFieldName: js.UndefOr[ConfluenceBlogFieldName] = js.undefined,
        DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat] = js.undefined,
        IndexFieldName: js.UndefOr[IndexFieldName] = js.undefined
    ): ConfluenceBlogToIndexFieldMapping = {
      val __obj = js.Dynamic.literal()
      DataSourceFieldName.foreach(__v => __obj.updateDynamic("DataSourceFieldName")(__v.asInstanceOf[js.Any]))
      DateFieldFormat.foreach(__v => __obj.updateDynamic("DateFieldFormat")(__v.asInstanceOf[js.Any]))
      IndexFieldName.foreach(__v => __obj.updateDynamic("IndexFieldName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfluenceBlogToIndexFieldMapping]
    }
  }

  /** Provides configuration information for data sources that connect to Confluence.
    */
  @js.native
  trait ConfluenceConfiguration extends js.Object {
    var SecretArn: SecretArn
    var ServerUrl: Url
    var Version: ConfluenceVersion
    var AttachmentConfiguration: js.UndefOr[ConfluenceAttachmentConfiguration]
    var BlogConfiguration: js.UndefOr[ConfluenceBlogConfiguration]
    var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var PageConfiguration: js.UndefOr[ConfluencePageConfiguration]
    var SpaceConfiguration: js.UndefOr[ConfluenceSpaceConfiguration]
    var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration]
  }

  object ConfluenceConfiguration {
    @inline
    def apply(
        SecretArn: SecretArn,
        ServerUrl: Url,
        Version: ConfluenceVersion,
        AttachmentConfiguration: js.UndefOr[ConfluenceAttachmentConfiguration] = js.undefined,
        BlogConfiguration: js.UndefOr[ConfluenceBlogConfiguration] = js.undefined,
        ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        PageConfiguration: js.UndefOr[ConfluencePageConfiguration] = js.undefined,
        SpaceConfiguration: js.UndefOr[ConfluenceSpaceConfiguration] = js.undefined,
        VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
    ): ConfluenceConfiguration = {
      val __obj = js.Dynamic.literal(
        "SecretArn" -> SecretArn.asInstanceOf[js.Any],
        "ServerUrl" -> ServerUrl.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )

      AttachmentConfiguration.foreach(__v => __obj.updateDynamic("AttachmentConfiguration")(__v.asInstanceOf[js.Any]))
      BlogConfiguration.foreach(__v => __obj.updateDynamic("BlogConfiguration")(__v.asInstanceOf[js.Any]))
      ExclusionPatterns.foreach(__v => __obj.updateDynamic("ExclusionPatterns")(__v.asInstanceOf[js.Any]))
      InclusionPatterns.foreach(__v => __obj.updateDynamic("InclusionPatterns")(__v.asInstanceOf[js.Any]))
      PageConfiguration.foreach(__v => __obj.updateDynamic("PageConfiguration")(__v.asInstanceOf[js.Any]))
      SpaceConfiguration.foreach(__v => __obj.updateDynamic("SpaceConfiguration")(__v.asInstanceOf[js.Any]))
      VpcConfiguration.foreach(__v => __obj.updateDynamic("VpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfluenceConfiguration]
    }
  }

  /** Specifies the page settings for the Confluence data source.
    */
  @js.native
  trait ConfluencePageConfiguration extends js.Object {
    var PageFieldMappings: js.UndefOr[ConfluencePageFieldMappingsList]
  }

  object ConfluencePageConfiguration {
    @inline
    def apply(
        PageFieldMappings: js.UndefOr[ConfluencePageFieldMappingsList] = js.undefined
    ): ConfluencePageConfiguration = {
      val __obj = js.Dynamic.literal()
      PageFieldMappings.foreach(__v => __obj.updateDynamic("PageFieldMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfluencePageConfiguration]
    }
  }

  /** Defines the mapping between a field in the Confluence data source to a Amazon Kendra index field. You must first create the index field using the <code>UpdateIndex</code> operation.
    */
  @js.native
  trait ConfluencePageToIndexFieldMapping extends js.Object {
    var DataSourceFieldName: js.UndefOr[ConfluencePageFieldName]
    var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat]
    var IndexFieldName: js.UndefOr[IndexFieldName]
  }

  object ConfluencePageToIndexFieldMapping {
    @inline
    def apply(
        DataSourceFieldName: js.UndefOr[ConfluencePageFieldName] = js.undefined,
        DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat] = js.undefined,
        IndexFieldName: js.UndefOr[IndexFieldName] = js.undefined
    ): ConfluencePageToIndexFieldMapping = {
      val __obj = js.Dynamic.literal()
      DataSourceFieldName.foreach(__v => __obj.updateDynamic("DataSourceFieldName")(__v.asInstanceOf[js.Any]))
      DateFieldFormat.foreach(__v => __obj.updateDynamic("DateFieldFormat")(__v.asInstanceOf[js.Any]))
      IndexFieldName.foreach(__v => __obj.updateDynamic("IndexFieldName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfluencePageToIndexFieldMapping]
    }
  }

  /** Specifies the configuration for indexing Confluence spaces.
    */
  @js.native
  trait ConfluenceSpaceConfiguration extends js.Object {
    var CrawlArchivedSpaces: js.UndefOr[Boolean]
    var CrawlPersonalSpaces: js.UndefOr[Boolean]
    var ExcludeSpaces: js.UndefOr[ConfluenceSpaceList]
    var IncludeSpaces: js.UndefOr[ConfluenceSpaceList]
    var SpaceFieldMappings: js.UndefOr[ConfluenceSpaceFieldMappingsList]
  }

  object ConfluenceSpaceConfiguration {
    @inline
    def apply(
        CrawlArchivedSpaces: js.UndefOr[Boolean] = js.undefined,
        CrawlPersonalSpaces: js.UndefOr[Boolean] = js.undefined,
        ExcludeSpaces: js.UndefOr[ConfluenceSpaceList] = js.undefined,
        IncludeSpaces: js.UndefOr[ConfluenceSpaceList] = js.undefined,
        SpaceFieldMappings: js.UndefOr[ConfluenceSpaceFieldMappingsList] = js.undefined
    ): ConfluenceSpaceConfiguration = {
      val __obj = js.Dynamic.literal()
      CrawlArchivedSpaces.foreach(__v => __obj.updateDynamic("CrawlArchivedSpaces")(__v.asInstanceOf[js.Any]))
      CrawlPersonalSpaces.foreach(__v => __obj.updateDynamic("CrawlPersonalSpaces")(__v.asInstanceOf[js.Any]))
      ExcludeSpaces.foreach(__v => __obj.updateDynamic("ExcludeSpaces")(__v.asInstanceOf[js.Any]))
      IncludeSpaces.foreach(__v => __obj.updateDynamic("IncludeSpaces")(__v.asInstanceOf[js.Any]))
      SpaceFieldMappings.foreach(__v => __obj.updateDynamic("SpaceFieldMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfluenceSpaceConfiguration]
    }
  }

  /** Defines the mapping between a field in the Confluence data source to a Amazon Kendra index field. You must first create the index field using the <code>UpdateIndex</code> operation.
    */
  @js.native
  trait ConfluenceSpaceToIndexFieldMapping extends js.Object {
    var DataSourceFieldName: js.UndefOr[ConfluenceSpaceFieldName]
    var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat]
    var IndexFieldName: js.UndefOr[IndexFieldName]
  }

  object ConfluenceSpaceToIndexFieldMapping {
    @inline
    def apply(
        DataSourceFieldName: js.UndefOr[ConfluenceSpaceFieldName] = js.undefined,
        DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat] = js.undefined,
        IndexFieldName: js.UndefOr[IndexFieldName] = js.undefined
    ): ConfluenceSpaceToIndexFieldMapping = {
      val __obj = js.Dynamic.literal()
      DataSourceFieldName.foreach(__v => __obj.updateDynamic("DataSourceFieldName")(__v.asInstanceOf[js.Any]))
      DateFieldFormat.foreach(__v => __obj.updateDynamic("DateFieldFormat")(__v.asInstanceOf[js.Any]))
      IndexFieldName.foreach(__v => __obj.updateDynamic("IndexFieldName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfluenceSpaceToIndexFieldMapping]
    }
  }

  /** Provides the information necessary to connect to a database.
    */
  @js.native
  trait ConnectionConfiguration extends js.Object {
    var DatabaseHost: DatabaseHost
    var DatabaseName: DatabaseName
    var DatabasePort: DatabasePort
    var SecretArn: SecretArn
    var TableName: TableName
  }

  object ConnectionConfiguration {
    @inline
    def apply(
        DatabaseHost: DatabaseHost,
        DatabaseName: DatabaseName,
        DatabasePort: DatabasePort,
        SecretArn: SecretArn,
        TableName: TableName
    ): ConnectionConfiguration = {
      val __obj = js.Dynamic.literal(
        "DatabaseHost" -> DatabaseHost.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "DatabasePort" -> DatabasePort.asInstanceOf[js.Any],
        "SecretArn" -> SecretArn.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ConnectionConfiguration]
    }
  }

  /** Configuration information for your content sources, such as data sources, FAQs, and content indexed directly via [[https://docs.aws.amazon.com/kendra/latest/dg/API_BatchPutDocument.html|BatchPutDocument]].
    */
  @js.native
  trait ContentSourceConfiguration extends js.Object {
    var DataSourceIds: js.UndefOr[DataSourceIdList]
    var DirectPutContent: js.UndefOr[Boolean]
    var FaqIds: js.UndefOr[FaqIdsList]
  }

  object ContentSourceConfiguration {
    @inline
    def apply(
        DataSourceIds: js.UndefOr[DataSourceIdList] = js.undefined,
        DirectPutContent: js.UndefOr[Boolean] = js.undefined,
        FaqIds: js.UndefOr[FaqIdsList] = js.undefined
    ): ContentSourceConfiguration = {
      val __obj = js.Dynamic.literal()
      DataSourceIds.foreach(__v => __obj.updateDynamic("DataSourceIds")(__v.asInstanceOf[js.Any]))
      DirectPutContent.foreach(__v => __obj.updateDynamic("DirectPutContent")(__v.asInstanceOf[js.Any]))
      FaqIds.foreach(__v => __obj.updateDynamic("FaqIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContentSourceConfiguration]
    }
  }

  @js.native
  trait CreateDataSourceRequest extends js.Object {
    var IndexId: IndexId
    var Name: DataSourceName
    var Type: DataSourceType
    var ClientToken: js.UndefOr[ClientTokenName]
    var Configuration: js.UndefOr[DataSourceConfiguration]
    var CustomDocumentEnrichmentConfiguration: js.UndefOr[CustomDocumentEnrichmentConfiguration]
    var Description: js.UndefOr[Description]
    var LanguageCode: js.UndefOr[LanguageCode]
    var RoleArn: js.UndefOr[RoleArn]
    var Schedule: js.UndefOr[ScanSchedule]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDataSourceRequest {
    @inline
    def apply(
        IndexId: IndexId,
        Name: DataSourceName,
        Type: DataSourceType,
        ClientToken: js.UndefOr[ClientTokenName] = js.undefined,
        Configuration: js.UndefOr[DataSourceConfiguration] = js.undefined,
        CustomDocumentEnrichmentConfiguration: js.UndefOr[CustomDocumentEnrichmentConfiguration] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        Schedule: js.UndefOr[ScanSchedule] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CustomDocumentEnrichmentConfiguration.foreach(__v => __obj.updateDynamic("CustomDocumentEnrichmentConfiguration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSourceRequest]
    }
  }

  @js.native
  trait CreateDataSourceResponse extends js.Object {
    var Id: DataSourceId
  }

  object CreateDataSourceResponse {
    @inline
    def apply(
        Id: DataSourceId
    ): CreateDataSourceResponse = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDataSourceResponse]
    }
  }

  @js.native
  trait CreateExperienceRequest extends js.Object {
    var IndexId: IndexId
    var Name: ExperienceName
    var ClientToken: js.UndefOr[ClientTokenName]
    var Configuration: js.UndefOr[ExperienceConfiguration]
    var Description: js.UndefOr[Description]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object CreateExperienceRequest {
    @inline
    def apply(
        IndexId: IndexId,
        Name: ExperienceName,
        ClientToken: js.UndefOr[ClientTokenName] = js.undefined,
        Configuration: js.UndefOr[ExperienceConfiguration] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): CreateExperienceRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExperienceRequest]
    }
  }

  @js.native
  trait CreateExperienceResponse extends js.Object {
    var Id: ExperienceId
  }

  object CreateExperienceResponse {
    @inline
    def apply(
        Id: ExperienceId
    ): CreateExperienceResponse = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateExperienceResponse]
    }
  }

  @js.native
  trait CreateFaqRequest extends js.Object {
    var IndexId: IndexId
    var Name: FaqName
    var RoleArn: RoleArn
    var S3Path: S3Path
    var ClientToken: js.UndefOr[ClientTokenName]
    var Description: js.UndefOr[Description]
    var FileFormat: js.UndefOr[FaqFileFormat]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Tags: js.UndefOr[TagList]
  }

  object CreateFaqRequest {
    @inline
    def apply(
        IndexId: IndexId,
        Name: FaqName,
        RoleArn: RoleArn,
        S3Path: S3Path,
        ClientToken: js.UndefOr[ClientTokenName] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        FileFormat: js.UndefOr[FaqFileFormat] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateFaqRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "S3Path" -> S3Path.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FileFormat.foreach(__v => __obj.updateDynamic("FileFormat")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFaqRequest]
    }
  }

  @js.native
  trait CreateFaqResponse extends js.Object {
    var Id: js.UndefOr[FaqId]
  }

  object CreateFaqResponse {
    @inline
    def apply(
        Id: js.UndefOr[FaqId] = js.undefined
    ): CreateFaqResponse = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFaqResponse]
    }
  }

  @js.native
  trait CreateIndexRequest extends js.Object {
    var Name: IndexName
    var RoleArn: RoleArn
    var ClientToken: js.UndefOr[ClientTokenName]
    var Description: js.UndefOr[Description]
    var Edition: js.UndefOr[IndexEdition]
    var ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
    var Tags: js.UndefOr[TagList]
    var UserContextPolicy: js.UndefOr[UserContextPolicy]
    var UserGroupResolutionConfiguration: js.UndefOr[UserGroupResolutionConfiguration]
    var UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList]
  }

  object CreateIndexRequest {
    @inline
    def apply(
        Name: IndexName,
        RoleArn: RoleArn,
        ClientToken: js.UndefOr[ClientTokenName] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Edition: js.UndefOr[IndexEdition] = js.undefined,
        ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        UserContextPolicy: js.UndefOr[UserContextPolicy] = js.undefined,
        UserGroupResolutionConfiguration: js.UndefOr[UserGroupResolutionConfiguration] = js.undefined,
        UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList] = js.undefined
    ): CreateIndexRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Edition.foreach(__v => __obj.updateDynamic("Edition")(__v.asInstanceOf[js.Any]))
      ServerSideEncryptionConfiguration.foreach(__v => __obj.updateDynamic("ServerSideEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UserContextPolicy.foreach(__v => __obj.updateDynamic("UserContextPolicy")(__v.asInstanceOf[js.Any]))
      UserGroupResolutionConfiguration.foreach(__v => __obj.updateDynamic("UserGroupResolutionConfiguration")(__v.asInstanceOf[js.Any]))
      UserTokenConfigurations.foreach(__v => __obj.updateDynamic("UserTokenConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIndexRequest]
    }
  }

  @js.native
  trait CreateIndexResponse extends js.Object {
    var Id: js.UndefOr[IndexId]
  }

  object CreateIndexResponse {
    @inline
    def apply(
        Id: js.UndefOr[IndexId] = js.undefined
    ): CreateIndexResponse = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIndexResponse]
    }
  }

  @js.native
  trait CreateQuerySuggestionsBlockListRequest extends js.Object {
    var IndexId: IndexId
    var Name: QuerySuggestionsBlockListName
    var RoleArn: RoleArn
    var SourceS3Path: S3Path
    var ClientToken: js.UndefOr[ClientTokenName]
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagList]
  }

  object CreateQuerySuggestionsBlockListRequest {
    @inline
    def apply(
        IndexId: IndexId,
        Name: QuerySuggestionsBlockListName,
        RoleArn: RoleArn,
        SourceS3Path: S3Path,
        ClientToken: js.UndefOr[ClientTokenName] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateQuerySuggestionsBlockListRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SourceS3Path" -> SourceS3Path.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQuerySuggestionsBlockListRequest]
    }
  }

  @js.native
  trait CreateQuerySuggestionsBlockListResponse extends js.Object {
    var Id: js.UndefOr[QuerySuggestionsBlockListId]
  }

  object CreateQuerySuggestionsBlockListResponse {
    @inline
    def apply(
        Id: js.UndefOr[QuerySuggestionsBlockListId] = js.undefined
    ): CreateQuerySuggestionsBlockListResponse = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQuerySuggestionsBlockListResponse]
    }
  }

  @js.native
  trait CreateThesaurusRequest extends js.Object {
    var IndexId: IndexId
    var Name: ThesaurusName
    var RoleArn: RoleArn
    var SourceS3Path: S3Path
    var ClientToken: js.UndefOr[ClientTokenName]
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagList]
  }

  object CreateThesaurusRequest {
    @inline
    def apply(
        IndexId: IndexId,
        Name: ThesaurusName,
        RoleArn: RoleArn,
        SourceS3Path: S3Path,
        ClientToken: js.UndefOr[ClientTokenName] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateThesaurusRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SourceS3Path" -> SourceS3Path.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThesaurusRequest]
    }
  }

  @js.native
  trait CreateThesaurusResponse extends js.Object {
    var Id: js.UndefOr[ThesaurusId]
  }

  object CreateThesaurusResponse {
    @inline
    def apply(
        Id: js.UndefOr[ThesaurusId] = js.undefined
    ): CreateThesaurusResponse = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThesaurusResponse]
    }
  }

  /** Provides the configuration information for altering document metadata and content during the document ingestion process. For more information, see [[https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html|Customizing document metadata during the ingestion process]].
    */
  @js.native
  trait CustomDocumentEnrichmentConfiguration extends js.Object {
    var InlineConfigurations: js.UndefOr[InlineCustomDocumentEnrichmentConfigurationList]
    var PostExtractionHookConfiguration: js.UndefOr[HookConfiguration]
    var PreExtractionHookConfiguration: js.UndefOr[HookConfiguration]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object CustomDocumentEnrichmentConfiguration {
    @inline
    def apply(
        InlineConfigurations: js.UndefOr[InlineCustomDocumentEnrichmentConfigurationList] = js.undefined,
        PostExtractionHookConfiguration: js.UndefOr[HookConfiguration] = js.undefined,
        PreExtractionHookConfiguration: js.UndefOr[HookConfiguration] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): CustomDocumentEnrichmentConfiguration = {
      val __obj = js.Dynamic.literal()
      InlineConfigurations.foreach(__v => __obj.updateDynamic("InlineConfigurations")(__v.asInstanceOf[js.Any]))
      PostExtractionHookConfiguration.foreach(__v => __obj.updateDynamic("PostExtractionHookConfiguration")(__v.asInstanceOf[js.Any]))
      PreExtractionHookConfiguration.foreach(__v => __obj.updateDynamic("PreExtractionHookConfiguration")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomDocumentEnrichmentConfiguration]
    }
  }

  /** Configuration information for an Amazon Kendra data source.
    */
  @js.native
  trait DataSourceConfiguration extends js.Object {
    var ConfluenceConfiguration: js.UndefOr[ConfluenceConfiguration]
    var DatabaseConfiguration: js.UndefOr[DatabaseConfiguration]
    var GoogleDriveConfiguration: js.UndefOr[GoogleDriveConfiguration]
    var OneDriveConfiguration: js.UndefOr[OneDriveConfiguration]
    var S3Configuration: js.UndefOr[S3DataSourceConfiguration]
    var SalesforceConfiguration: js.UndefOr[SalesforceConfiguration]
    var ServiceNowConfiguration: js.UndefOr[ServiceNowConfiguration]
    var SharePointConfiguration: js.UndefOr[SharePointConfiguration]
    var WebCrawlerConfiguration: js.UndefOr[WebCrawlerConfiguration]
    var WorkDocsConfiguration: js.UndefOr[WorkDocsConfiguration]
  }

  object DataSourceConfiguration {
    @inline
    def apply(
        ConfluenceConfiguration: js.UndefOr[ConfluenceConfiguration] = js.undefined,
        DatabaseConfiguration: js.UndefOr[DatabaseConfiguration] = js.undefined,
        GoogleDriveConfiguration: js.UndefOr[GoogleDriveConfiguration] = js.undefined,
        OneDriveConfiguration: js.UndefOr[OneDriveConfiguration] = js.undefined,
        S3Configuration: js.UndefOr[S3DataSourceConfiguration] = js.undefined,
        SalesforceConfiguration: js.UndefOr[SalesforceConfiguration] = js.undefined,
        ServiceNowConfiguration: js.UndefOr[ServiceNowConfiguration] = js.undefined,
        SharePointConfiguration: js.UndefOr[SharePointConfiguration] = js.undefined,
        WebCrawlerConfiguration: js.UndefOr[WebCrawlerConfiguration] = js.undefined,
        WorkDocsConfiguration: js.UndefOr[WorkDocsConfiguration] = js.undefined
    ): DataSourceConfiguration = {
      val __obj = js.Dynamic.literal()
      ConfluenceConfiguration.foreach(__v => __obj.updateDynamic("ConfluenceConfiguration")(__v.asInstanceOf[js.Any]))
      DatabaseConfiguration.foreach(__v => __obj.updateDynamic("DatabaseConfiguration")(__v.asInstanceOf[js.Any]))
      GoogleDriveConfiguration.foreach(__v => __obj.updateDynamic("GoogleDriveConfiguration")(__v.asInstanceOf[js.Any]))
      OneDriveConfiguration.foreach(__v => __obj.updateDynamic("OneDriveConfiguration")(__v.asInstanceOf[js.Any]))
      S3Configuration.foreach(__v => __obj.updateDynamic("S3Configuration")(__v.asInstanceOf[js.Any]))
      SalesforceConfiguration.foreach(__v => __obj.updateDynamic("SalesforceConfiguration")(__v.asInstanceOf[js.Any]))
      ServiceNowConfiguration.foreach(__v => __obj.updateDynamic("ServiceNowConfiguration")(__v.asInstanceOf[js.Any]))
      SharePointConfiguration.foreach(__v => __obj.updateDynamic("SharePointConfiguration")(__v.asInstanceOf[js.Any]))
      WebCrawlerConfiguration.foreach(__v => __obj.updateDynamic("WebCrawlerConfiguration")(__v.asInstanceOf[js.Any]))
      WorkDocsConfiguration.foreach(__v => __obj.updateDynamic("WorkDocsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceConfiguration]
    }
  }

  /** Data source information for user context filtering.
    */
  @js.native
  trait DataSourceGroup extends js.Object {
    var DataSourceId: DataSourceId
    var GroupId: PrincipalName
  }

  object DataSourceGroup {
    @inline
    def apply(
        DataSourceId: DataSourceId,
        GroupId: PrincipalName
    ): DataSourceGroup = {
      val __obj = js.Dynamic.literal(
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any],
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataSourceGroup]
    }
  }

  /** Summary information for a Amazon Kendra data source. Returned in a call to the <code>DescribeDataSource</code> operation.
    */
  @js.native
  trait DataSourceSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Id: js.UndefOr[DataSourceId]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Name: js.UndefOr[DataSourceName]
    var Status: js.UndefOr[DataSourceStatus]
    var Type: js.UndefOr[DataSourceType]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object DataSourceSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[DataSourceId] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Name: js.UndefOr[DataSourceName] = js.undefined,
        Status: js.UndefOr[DataSourceStatus] = js.undefined,
        Type: js.UndefOr[DataSourceType] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): DataSourceSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceSummary]
    }
  }

  /** Provides information about a synchronization job.
    */
  @js.native
  trait DataSourceSyncJob extends js.Object {
    var DataSourceErrorCode: js.UndefOr[String]
    var EndTime: js.UndefOr[Timestamp]
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var ExecutionId: js.UndefOr[String]
    var Metrics: js.UndefOr[DataSourceSyncJobMetrics]
    var StartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[DataSourceSyncJobStatus]
  }

  object DataSourceSyncJob {
    @inline
    def apply(
        DataSourceErrorCode: js.UndefOr[String] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        ExecutionId: js.UndefOr[String] = js.undefined,
        Metrics: js.UndefOr[DataSourceSyncJobMetrics] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[DataSourceSyncJobStatus] = js.undefined
    ): DataSourceSyncJob = {
      val __obj = js.Dynamic.literal()
      DataSourceErrorCode.foreach(__v => __obj.updateDynamic("DataSourceErrorCode")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ExecutionId.foreach(__v => __obj.updateDynamic("ExecutionId")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceSyncJob]
    }
  }

  /** Maps a particular data source sync job to a particular data source.
    */
  @js.native
  trait DataSourceSyncJobMetricTarget extends js.Object {
    var DataSourceId: DataSourceId
    var DataSourceSyncJobId: js.UndefOr[DataSourceSyncJobId]
  }

  object DataSourceSyncJobMetricTarget {
    @inline
    def apply(
        DataSourceId: DataSourceId,
        DataSourceSyncJobId: js.UndefOr[DataSourceSyncJobId] = js.undefined
    ): DataSourceSyncJobMetricTarget = {
      val __obj = js.Dynamic.literal(
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any]
      )

      DataSourceSyncJobId.foreach(__v => __obj.updateDynamic("DataSourceSyncJobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceSyncJobMetricTarget]
    }
  }

  /** Maps a batch delete document request to a specific data source sync job. This is optional and should only be supplied when documents are deleted by a data source connector.
    */
  @js.native
  trait DataSourceSyncJobMetrics extends js.Object {
    var DocumentsAdded: js.UndefOr[MetricValue]
    var DocumentsDeleted: js.UndefOr[MetricValue]
    var DocumentsFailed: js.UndefOr[MetricValue]
    var DocumentsModified: js.UndefOr[MetricValue]
    var DocumentsScanned: js.UndefOr[MetricValue]
  }

  object DataSourceSyncJobMetrics {
    @inline
    def apply(
        DocumentsAdded: js.UndefOr[MetricValue] = js.undefined,
        DocumentsDeleted: js.UndefOr[MetricValue] = js.undefined,
        DocumentsFailed: js.UndefOr[MetricValue] = js.undefined,
        DocumentsModified: js.UndefOr[MetricValue] = js.undefined,
        DocumentsScanned: js.UndefOr[MetricValue] = js.undefined
    ): DataSourceSyncJobMetrics = {
      val __obj = js.Dynamic.literal()
      DocumentsAdded.foreach(__v => __obj.updateDynamic("DocumentsAdded")(__v.asInstanceOf[js.Any]))
      DocumentsDeleted.foreach(__v => __obj.updateDynamic("DocumentsDeleted")(__v.asInstanceOf[js.Any]))
      DocumentsFailed.foreach(__v => __obj.updateDynamic("DocumentsFailed")(__v.asInstanceOf[js.Any]))
      DocumentsModified.foreach(__v => __obj.updateDynamic("DocumentsModified")(__v.asInstanceOf[js.Any]))
      DocumentsScanned.foreach(__v => __obj.updateDynamic("DocumentsScanned")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceSyncJobMetrics]
    }
  }

  /** Maps a column or attribute in the data source to an index field. You must first create the fields in the index using the <code>UpdateIndex</code> operation.
    */
  @js.native
  trait DataSourceToIndexFieldMapping extends js.Object {
    var DataSourceFieldName: DataSourceFieldName
    var IndexFieldName: IndexFieldName
    var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat]
  }

  object DataSourceToIndexFieldMapping {
    @inline
    def apply(
        DataSourceFieldName: DataSourceFieldName,
        IndexFieldName: IndexFieldName,
        DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat] = js.undefined
    ): DataSourceToIndexFieldMapping = {
      val __obj = js.Dynamic.literal(
        "DataSourceFieldName" -> DataSourceFieldName.asInstanceOf[js.Any],
        "IndexFieldName" -> IndexFieldName.asInstanceOf[js.Any]
      )

      DateFieldFormat.foreach(__v => __obj.updateDynamic("DateFieldFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceToIndexFieldMapping]
    }
  }

  /** Provides information for connecting to an Amazon VPC.
    */
  @js.native
  trait DataSourceVpcConfiguration extends js.Object {
    var SecurityGroupIds: SecurityGroupIdList
    var SubnetIds: SubnetIdList
  }

  object DataSourceVpcConfiguration {
    @inline
    def apply(
        SecurityGroupIds: SecurityGroupIdList,
        SubnetIds: SubnetIdList
    ): DataSourceVpcConfiguration = {
      val __obj = js.Dynamic.literal(
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataSourceVpcConfiguration]
    }
  }

  /** Provides the information necessary to connect a database to an index.
    */
  @js.native
  trait DatabaseConfiguration extends js.Object {
    var ColumnConfiguration: ColumnConfiguration
    var ConnectionConfiguration: ConnectionConfiguration
    var DatabaseEngineType: DatabaseEngineType
    var AclConfiguration: js.UndefOr[AclConfiguration]
    var SqlConfiguration: js.UndefOr[SqlConfiguration]
    var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration]
  }

  object DatabaseConfiguration {
    @inline
    def apply(
        ColumnConfiguration: ColumnConfiguration,
        ConnectionConfiguration: ConnectionConfiguration,
        DatabaseEngineType: DatabaseEngineType,
        AclConfiguration: js.UndefOr[AclConfiguration] = js.undefined,
        SqlConfiguration: js.UndefOr[SqlConfiguration] = js.undefined,
        VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
    ): DatabaseConfiguration = {
      val __obj = js.Dynamic.literal(
        "ColumnConfiguration" -> ColumnConfiguration.asInstanceOf[js.Any],
        "ConnectionConfiguration" -> ConnectionConfiguration.asInstanceOf[js.Any],
        "DatabaseEngineType" -> DatabaseEngineType.asInstanceOf[js.Any]
      )

      AclConfiguration.foreach(__v => __obj.updateDynamic("AclConfiguration")(__v.asInstanceOf[js.Any]))
      SqlConfiguration.foreach(__v => __obj.updateDynamic("SqlConfiguration")(__v.asInstanceOf[js.Any]))
      VpcConfiguration.foreach(__v => __obj.updateDynamic("VpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatabaseConfiguration]
    }
  }

  @js.native
  trait DeleteDataSourceRequest extends js.Object {
    var Id: DataSourceId
    var IndexId: IndexId
  }

  object DeleteDataSourceRequest {
    @inline
    def apply(
        Id: DataSourceId,
        IndexId: IndexId
    ): DeleteDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDataSourceRequest]
    }
  }

  @js.native
  trait DeleteExperienceRequest extends js.Object {
    var Id: ExperienceId
    var IndexId: IndexId
  }

  object DeleteExperienceRequest {
    @inline
    def apply(
        Id: ExperienceId,
        IndexId: IndexId
    ): DeleteExperienceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteExperienceRequest]
    }
  }

  @js.native
  trait DeleteExperienceResponse extends js.Object

  object DeleteExperienceResponse {
    @inline
    def apply(): DeleteExperienceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteExperienceResponse]
    }
  }

  @js.native
  trait DeleteFaqRequest extends js.Object {
    var Id: FaqId
    var IndexId: IndexId
  }

  object DeleteFaqRequest {
    @inline
    def apply(
        Id: FaqId,
        IndexId: IndexId
    ): DeleteFaqRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFaqRequest]
    }
  }

  @js.native
  trait DeleteIndexRequest extends js.Object {
    var Id: IndexId
  }

  object DeleteIndexRequest {
    @inline
    def apply(
        Id: IndexId
    ): DeleteIndexRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIndexRequest]
    }
  }

  @js.native
  trait DeletePrincipalMappingRequest extends js.Object {
    var GroupId: GroupId
    var IndexId: IndexId
    var DataSourceId: js.UndefOr[DataSourceId]
    var OrderingId: js.UndefOr[PrincipalOrderingId]
  }

  object DeletePrincipalMappingRequest {
    @inline
    def apply(
        GroupId: GroupId,
        IndexId: IndexId,
        DataSourceId: js.UndefOr[DataSourceId] = js.undefined,
        OrderingId: js.UndefOr[PrincipalOrderingId] = js.undefined
    ): DeletePrincipalMappingRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      OrderingId.foreach(__v => __obj.updateDynamic("OrderingId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePrincipalMappingRequest]
    }
  }

  @js.native
  trait DeleteQuerySuggestionsBlockListRequest extends js.Object {
    var Id: QuerySuggestionsBlockListId
    var IndexId: IndexId
  }

  object DeleteQuerySuggestionsBlockListRequest {
    @inline
    def apply(
        Id: QuerySuggestionsBlockListId,
        IndexId: IndexId
    ): DeleteQuerySuggestionsBlockListRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteQuerySuggestionsBlockListRequest]
    }
  }

  @js.native
  trait DeleteThesaurusRequest extends js.Object {
    var Id: ThesaurusId
    var IndexId: IndexId
  }

  object DeleteThesaurusRequest {
    @inline
    def apply(
        Id: ThesaurusId,
        IndexId: IndexId
    ): DeleteThesaurusRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteThesaurusRequest]
    }
  }

  @js.native
  trait DescribeDataSourceRequest extends js.Object {
    var Id: DataSourceId
    var IndexId: IndexId
  }

  object DescribeDataSourceRequest {
    @inline
    def apply(
        Id: DataSourceId,
        IndexId: IndexId
    ): DescribeDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDataSourceRequest]
    }
  }

  @js.native
  trait DescribeDataSourceResponse extends js.Object {
    var Configuration: js.UndefOr[DataSourceConfiguration]
    var CreatedAt: js.UndefOr[Timestamp]
    var CustomDocumentEnrichmentConfiguration: js.UndefOr[CustomDocumentEnrichmentConfiguration]
    var Description: js.UndefOr[Description]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var Id: js.UndefOr[DataSourceId]
    var IndexId: js.UndefOr[IndexId]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Name: js.UndefOr[DataSourceName]
    var RoleArn: js.UndefOr[RoleArn]
    var Schedule: js.UndefOr[ScanSchedule]
    var Status: js.UndefOr[DataSourceStatus]
    var Type: js.UndefOr[DataSourceType]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object DescribeDataSourceResponse {
    @inline
    def apply(
        Configuration: js.UndefOr[DataSourceConfiguration] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        CustomDocumentEnrichmentConfiguration: js.UndefOr[CustomDocumentEnrichmentConfiguration] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        Id: js.UndefOr[DataSourceId] = js.undefined,
        IndexId: js.UndefOr[IndexId] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Name: js.UndefOr[DataSourceName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        Schedule: js.UndefOr[ScanSchedule] = js.undefined,
        Status: js.UndefOr[DataSourceStatus] = js.undefined,
        Type: js.UndefOr[DataSourceType] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): DescribeDataSourceResponse = {
      val __obj = js.Dynamic.literal()
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CustomDocumentEnrichmentConfiguration.foreach(__v => __obj.updateDynamic("CustomDocumentEnrichmentConfiguration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IndexId.foreach(__v => __obj.updateDynamic("IndexId")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataSourceResponse]
    }
  }

  @js.native
  trait DescribeExperienceRequest extends js.Object {
    var Id: ExperienceId
    var IndexId: IndexId
  }

  object DescribeExperienceRequest {
    @inline
    def apply(
        Id: ExperienceId,
        IndexId: IndexId
    ): DescribeExperienceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeExperienceRequest]
    }
  }

  @js.native
  trait DescribeExperienceResponse extends js.Object {
    var Configuration: js.UndefOr[ExperienceConfiguration]
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var Endpoints: js.UndefOr[ExperienceEndpoints]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var Id: js.UndefOr[ExperienceId]
    var IndexId: js.UndefOr[IndexId]
    var Name: js.UndefOr[ExperienceName]
    var RoleArn: js.UndefOr[RoleArn]
    var Status: js.UndefOr[ExperienceStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object DescribeExperienceResponse {
    @inline
    def apply(
        Configuration: js.UndefOr[ExperienceConfiguration] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Endpoints: js.UndefOr[ExperienceEndpoints] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        Id: js.UndefOr[ExperienceId] = js.undefined,
        IndexId: js.UndefOr[IndexId] = js.undefined,
        Name: js.UndefOr[ExperienceName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        Status: js.UndefOr[ExperienceStatus] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): DescribeExperienceResponse = {
      val __obj = js.Dynamic.literal()
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IndexId.foreach(__v => __obj.updateDynamic("IndexId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExperienceResponse]
    }
  }

  @js.native
  trait DescribeFaqRequest extends js.Object {
    var Id: FaqId
    var IndexId: IndexId
  }

  object DescribeFaqRequest {
    @inline
    def apply(
        Id: FaqId,
        IndexId: IndexId
    ): DescribeFaqRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFaqRequest]
    }
  }

  @js.native
  trait DescribeFaqResponse extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var FileFormat: js.UndefOr[FaqFileFormat]
    var Id: js.UndefOr[FaqId]
    var IndexId: js.UndefOr[IndexId]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Name: js.UndefOr[FaqName]
    var RoleArn: js.UndefOr[RoleArn]
    var S3Path: js.UndefOr[S3Path]
    var Status: js.UndefOr[FaqStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object DescribeFaqResponse {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        FileFormat: js.UndefOr[FaqFileFormat] = js.undefined,
        Id: js.UndefOr[FaqId] = js.undefined,
        IndexId: js.UndefOr[IndexId] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Name: js.UndefOr[FaqName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        S3Path: js.UndefOr[S3Path] = js.undefined,
        Status: js.UndefOr[FaqStatus] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): DescribeFaqResponse = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      FileFormat.foreach(__v => __obj.updateDynamic("FileFormat")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IndexId.foreach(__v => __obj.updateDynamic("IndexId")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      S3Path.foreach(__v => __obj.updateDynamic("S3Path")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFaqResponse]
    }
  }

  @js.native
  trait DescribeIndexRequest extends js.Object {
    var Id: IndexId
  }

  object DescribeIndexRequest {
    @inline
    def apply(
        Id: IndexId
    ): DescribeIndexRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeIndexRequest]
    }
  }

  @js.native
  trait DescribeIndexResponse extends js.Object {
    var CapacityUnits: js.UndefOr[CapacityUnitsConfiguration]
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var DocumentMetadataConfigurations: js.UndefOr[DocumentMetadataConfigurationList]
    var Edition: js.UndefOr[IndexEdition]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var Id: js.UndefOr[IndexId]
    var IndexStatistics: js.UndefOr[IndexStatistics]
    var Name: js.UndefOr[IndexName]
    var RoleArn: js.UndefOr[RoleArn]
    var ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
    var Status: js.UndefOr[IndexStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
    var UserContextPolicy: js.UndefOr[UserContextPolicy]
    var UserGroupResolutionConfiguration: js.UndefOr[UserGroupResolutionConfiguration]
    var UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList]
  }

  object DescribeIndexResponse {
    @inline
    def apply(
        CapacityUnits: js.UndefOr[CapacityUnitsConfiguration] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DocumentMetadataConfigurations: js.UndefOr[DocumentMetadataConfigurationList] = js.undefined,
        Edition: js.UndefOr[IndexEdition] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        Id: js.UndefOr[IndexId] = js.undefined,
        IndexStatistics: js.UndefOr[IndexStatistics] = js.undefined,
        Name: js.UndefOr[IndexName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined,
        Status: js.UndefOr[IndexStatus] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        UserContextPolicy: js.UndefOr[UserContextPolicy] = js.undefined,
        UserGroupResolutionConfiguration: js.UndefOr[UserGroupResolutionConfiguration] = js.undefined,
        UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList] = js.undefined
    ): DescribeIndexResponse = {
      val __obj = js.Dynamic.literal()
      CapacityUnits.foreach(__v => __obj.updateDynamic("CapacityUnits")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DocumentMetadataConfigurations.foreach(__v => __obj.updateDynamic("DocumentMetadataConfigurations")(__v.asInstanceOf[js.Any]))
      Edition.foreach(__v => __obj.updateDynamic("Edition")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IndexStatistics.foreach(__v => __obj.updateDynamic("IndexStatistics")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      ServerSideEncryptionConfiguration.foreach(__v => __obj.updateDynamic("ServerSideEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      UserContextPolicy.foreach(__v => __obj.updateDynamic("UserContextPolicy")(__v.asInstanceOf[js.Any]))
      UserGroupResolutionConfiguration.foreach(__v => __obj.updateDynamic("UserGroupResolutionConfiguration")(__v.asInstanceOf[js.Any]))
      UserTokenConfigurations.foreach(__v => __obj.updateDynamic("UserTokenConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIndexResponse]
    }
  }

  @js.native
  trait DescribePrincipalMappingRequest extends js.Object {
    var GroupId: GroupId
    var IndexId: IndexId
    var DataSourceId: js.UndefOr[DataSourceId]
  }

  object DescribePrincipalMappingRequest {
    @inline
    def apply(
        GroupId: GroupId,
        IndexId: IndexId,
        DataSourceId: js.UndefOr[DataSourceId] = js.undefined
    ): DescribePrincipalMappingRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePrincipalMappingRequest]
    }
  }

  @js.native
  trait DescribePrincipalMappingResponse extends js.Object {
    var DataSourceId: js.UndefOr[DataSourceId]
    var GroupId: js.UndefOr[GroupId]
    var GroupOrderingIdSummaries: js.UndefOr[GroupOrderingIdSummaries]
    var IndexId: js.UndefOr[IndexId]
  }

  object DescribePrincipalMappingResponse {
    @inline
    def apply(
        DataSourceId: js.UndefOr[DataSourceId] = js.undefined,
        GroupId: js.UndefOr[GroupId] = js.undefined,
        GroupOrderingIdSummaries: js.UndefOr[GroupOrderingIdSummaries] = js.undefined,
        IndexId: js.UndefOr[IndexId] = js.undefined
    ): DescribePrincipalMappingResponse = {
      val __obj = js.Dynamic.literal()
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      GroupOrderingIdSummaries.foreach(__v => __obj.updateDynamic("GroupOrderingIdSummaries")(__v.asInstanceOf[js.Any]))
      IndexId.foreach(__v => __obj.updateDynamic("IndexId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePrincipalMappingResponse]
    }
  }

  @js.native
  trait DescribeQuerySuggestionsBlockListRequest extends js.Object {
    var Id: QuerySuggestionsBlockListId
    var IndexId: IndexId
  }

  object DescribeQuerySuggestionsBlockListRequest {
    @inline
    def apply(
        Id: QuerySuggestionsBlockListId,
        IndexId: IndexId
    ): DescribeQuerySuggestionsBlockListRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeQuerySuggestionsBlockListRequest]
    }
  }

  @js.native
  trait DescribeQuerySuggestionsBlockListResponse extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var FileSizeBytes: js.UndefOr[Double]
    var Id: js.UndefOr[QuerySuggestionsBlockListId]
    var IndexId: js.UndefOr[IndexId]
    var ItemCount: js.UndefOr[Int]
    var Name: js.UndefOr[QuerySuggestionsBlockListName]
    var RoleArn: js.UndefOr[RoleArn]
    var SourceS3Path: js.UndefOr[S3Path]
    var Status: js.UndefOr[QuerySuggestionsBlockListStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object DescribeQuerySuggestionsBlockListResponse {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        FileSizeBytes: js.UndefOr[Double] = js.undefined,
        Id: js.UndefOr[QuerySuggestionsBlockListId] = js.undefined,
        IndexId: js.UndefOr[IndexId] = js.undefined,
        ItemCount: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[QuerySuggestionsBlockListName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        SourceS3Path: js.UndefOr[S3Path] = js.undefined,
        Status: js.UndefOr[QuerySuggestionsBlockListStatus] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): DescribeQuerySuggestionsBlockListResponse = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      FileSizeBytes.foreach(__v => __obj.updateDynamic("FileSizeBytes")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IndexId.foreach(__v => __obj.updateDynamic("IndexId")(__v.asInstanceOf[js.Any]))
      ItemCount.foreach(__v => __obj.updateDynamic("ItemCount")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SourceS3Path.foreach(__v => __obj.updateDynamic("SourceS3Path")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeQuerySuggestionsBlockListResponse]
    }
  }

  @js.native
  trait DescribeQuerySuggestionsConfigRequest extends js.Object {
    var IndexId: IndexId
  }

  object DescribeQuerySuggestionsConfigRequest {
    @inline
    def apply(
        IndexId: IndexId
    ): DescribeQuerySuggestionsConfigRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeQuerySuggestionsConfigRequest]
    }
  }

  @js.native
  trait DescribeQuerySuggestionsConfigResponse extends js.Object {
    var IncludeQueriesWithoutUserInformation: js.UndefOr[ObjectBoolean]
    var LastClearTime: js.UndefOr[Timestamp]
    var LastSuggestionsBuildTime: js.UndefOr[Timestamp]
    var MinimumNumberOfQueryingUsers: js.UndefOr[MinimumNumberOfQueryingUsers]
    var MinimumQueryCount: js.UndefOr[MinimumQueryCount]
    var Mode: js.UndefOr[Mode]
    var QueryLogLookBackWindowInDays: js.UndefOr[Int]
    var Status: js.UndefOr[QuerySuggestionsStatus]
    var TotalSuggestionsCount: js.UndefOr[Int]
  }

  object DescribeQuerySuggestionsConfigResponse {
    @inline
    def apply(
        IncludeQueriesWithoutUserInformation: js.UndefOr[ObjectBoolean] = js.undefined,
        LastClearTime: js.UndefOr[Timestamp] = js.undefined,
        LastSuggestionsBuildTime: js.UndefOr[Timestamp] = js.undefined,
        MinimumNumberOfQueryingUsers: js.UndefOr[MinimumNumberOfQueryingUsers] = js.undefined,
        MinimumQueryCount: js.UndefOr[MinimumQueryCount] = js.undefined,
        Mode: js.UndefOr[Mode] = js.undefined,
        QueryLogLookBackWindowInDays: js.UndefOr[Int] = js.undefined,
        Status: js.UndefOr[QuerySuggestionsStatus] = js.undefined,
        TotalSuggestionsCount: js.UndefOr[Int] = js.undefined
    ): DescribeQuerySuggestionsConfigResponse = {
      val __obj = js.Dynamic.literal()
      IncludeQueriesWithoutUserInformation.foreach(__v => __obj.updateDynamic("IncludeQueriesWithoutUserInformation")(__v.asInstanceOf[js.Any]))
      LastClearTime.foreach(__v => __obj.updateDynamic("LastClearTime")(__v.asInstanceOf[js.Any]))
      LastSuggestionsBuildTime.foreach(__v => __obj.updateDynamic("LastSuggestionsBuildTime")(__v.asInstanceOf[js.Any]))
      MinimumNumberOfQueryingUsers.foreach(__v => __obj.updateDynamic("MinimumNumberOfQueryingUsers")(__v.asInstanceOf[js.Any]))
      MinimumQueryCount.foreach(__v => __obj.updateDynamic("MinimumQueryCount")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      QueryLogLookBackWindowInDays.foreach(__v => __obj.updateDynamic("QueryLogLookBackWindowInDays")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TotalSuggestionsCount.foreach(__v => __obj.updateDynamic("TotalSuggestionsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeQuerySuggestionsConfigResponse]
    }
  }

  @js.native
  trait DescribeThesaurusRequest extends js.Object {
    var Id: ThesaurusId
    var IndexId: IndexId
  }

  object DescribeThesaurusRequest {
    @inline
    def apply(
        Id: ThesaurusId,
        IndexId: IndexId
    ): DescribeThesaurusRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeThesaurusRequest]
    }
  }

  @js.native
  trait DescribeThesaurusResponse extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var FileSizeBytes: js.UndefOr[Double]
    var Id: js.UndefOr[ThesaurusId]
    var IndexId: js.UndefOr[IndexId]
    var Name: js.UndefOr[ThesaurusName]
    var RoleArn: js.UndefOr[RoleArn]
    var SourceS3Path: js.UndefOr[S3Path]
    var Status: js.UndefOr[ThesaurusStatus]
    var SynonymRuleCount: js.UndefOr[Double]
    var TermCount: js.UndefOr[Double]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object DescribeThesaurusResponse {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        FileSizeBytes: js.UndefOr[Double] = js.undefined,
        Id: js.UndefOr[ThesaurusId] = js.undefined,
        IndexId: js.UndefOr[IndexId] = js.undefined,
        Name: js.UndefOr[ThesaurusName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        SourceS3Path: js.UndefOr[S3Path] = js.undefined,
        Status: js.UndefOr[ThesaurusStatus] = js.undefined,
        SynonymRuleCount: js.UndefOr[Double] = js.undefined,
        TermCount: js.UndefOr[Double] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): DescribeThesaurusResponse = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      FileSizeBytes.foreach(__v => __obj.updateDynamic("FileSizeBytes")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IndexId.foreach(__v => __obj.updateDynamic("IndexId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SourceS3Path.foreach(__v => __obj.updateDynamic("SourceS3Path")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SynonymRuleCount.foreach(__v => __obj.updateDynamic("SynonymRuleCount")(__v.asInstanceOf[js.Any]))
      TermCount.foreach(__v => __obj.updateDynamic("TermCount")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeThesaurusResponse]
    }
  }

  @js.native
  trait DisassociateEntitiesFromExperienceRequest extends js.Object {
    var EntityList: DisassociateEntityList
    var Id: ExperienceId
    var IndexId: IndexId
  }

  object DisassociateEntitiesFromExperienceRequest {
    @inline
    def apply(
        EntityList: DisassociateEntityList,
        Id: ExperienceId,
        IndexId: IndexId
    ): DisassociateEntitiesFromExperienceRequest = {
      val __obj = js.Dynamic.literal(
        "EntityList" -> EntityList.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateEntitiesFromExperienceRequest]
    }
  }

  @js.native
  trait DisassociateEntitiesFromExperienceResponse extends js.Object {
    var FailedEntityList: js.UndefOr[FailedEntityList]
  }

  object DisassociateEntitiesFromExperienceResponse {
    @inline
    def apply(
        FailedEntityList: js.UndefOr[FailedEntityList] = js.undefined
    ): DisassociateEntitiesFromExperienceResponse = {
      val __obj = js.Dynamic.literal()
      FailedEntityList.foreach(__v => __obj.updateDynamic("FailedEntityList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateEntitiesFromExperienceResponse]
    }
  }

  @js.native
  trait DisassociatePersonasFromEntitiesRequest extends js.Object {
    var EntityIds: EntityIdsList
    var Id: ExperienceId
    var IndexId: IndexId
  }

  object DisassociatePersonasFromEntitiesRequest {
    @inline
    def apply(
        EntityIds: EntityIdsList,
        Id: ExperienceId,
        IndexId: IndexId
    ): DisassociatePersonasFromEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "EntityIds" -> EntityIds.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociatePersonasFromEntitiesRequest]
    }
  }

  @js.native
  trait DisassociatePersonasFromEntitiesResponse extends js.Object {
    var FailedEntityList: js.UndefOr[FailedEntityList]
  }

  object DisassociatePersonasFromEntitiesResponse {
    @inline
    def apply(
        FailedEntityList: js.UndefOr[FailedEntityList] = js.undefined
    ): DisassociatePersonasFromEntitiesResponse = {
      val __obj = js.Dynamic.literal()
      FailedEntityList.foreach(__v => __obj.updateDynamic("FailedEntityList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociatePersonasFromEntitiesResponse]
    }
  }

  /** A document in an index.
    */
  @js.native
  trait Document extends js.Object {
    var Id: DocumentId
    var AccessControlList: js.UndefOr[PrincipalList]
    var Attributes: js.UndefOr[DocumentAttributeList]
    var Blob: js.UndefOr[Blob]
    var ContentType: js.UndefOr[ContentType]
    var HierarchicalAccessControlList: js.UndefOr[HierarchicalPrincipalList]
    var S3Path: js.UndefOr[S3Path]
    var Title: js.UndefOr[Title]
  }

  object Document {
    @inline
    def apply(
        Id: DocumentId,
        AccessControlList: js.UndefOr[PrincipalList] = js.undefined,
        Attributes: js.UndefOr[DocumentAttributeList] = js.undefined,
        Blob: js.UndefOr[Blob] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        HierarchicalAccessControlList: js.UndefOr[HierarchicalPrincipalList] = js.undefined,
        S3Path: js.UndefOr[S3Path] = js.undefined,
        Title: js.UndefOr[Title] = js.undefined
    ): Document = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AccessControlList.foreach(__v => __obj.updateDynamic("AccessControlList")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Blob.foreach(__v => __obj.updateDynamic("Blob")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      HierarchicalAccessControlList.foreach(__v => __obj.updateDynamic("HierarchicalAccessControlList")(__v.asInstanceOf[js.Any]))
      S3Path.foreach(__v => __obj.updateDynamic("S3Path")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Document]
    }
  }

  /** A custom attribute value assigned to a document.
    */
  @js.native
  trait DocumentAttribute extends js.Object {
    var Key: DocumentAttributeKey
    var Value: DocumentAttributeValue
  }

  object DocumentAttribute {
    @inline
    def apply(
        Key: DocumentAttributeKey,
        Value: DocumentAttributeValue
    ): DocumentAttribute = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DocumentAttribute]
    }
  }

  /** The condition used for the target document attribute or metadata field when ingesting documents into Amazon Kendra. You use this with [[https://docs.aws.amazon.com/kendra/latest/dg/API_DocumentAttributeTarget.html|DocumentAttributeTarget to apply the condition]]. For example, you can create the 'Department' target field and have it prefill department names associated with the documents based on information in the 'Source_URI' field. Set the condition that if the 'Source_URI' field contains 'financial' in its URI value, then prefill the target field 'Department' with the target value 'Finance' for the document. Amazon Kendra cannot create a target field if it has not already been created as an index field. After you create your index field, you can create a document metadata field using <code>DocumentAttributeTarget</code>. Amazon Kendra then will map your newly created metadata field to your index field.
    */
  @js.native
  trait DocumentAttributeCondition extends js.Object {
    var ConditionDocumentAttributeKey: DocumentAttributeKey
    var Operator: ConditionOperator
    var ConditionOnValue: js.UndefOr[DocumentAttributeValue]
  }

  object DocumentAttributeCondition {
    @inline
    def apply(
        ConditionDocumentAttributeKey: DocumentAttributeKey,
        Operator: ConditionOperator,
        ConditionOnValue: js.UndefOr[DocumentAttributeValue] = js.undefined
    ): DocumentAttributeCondition = {
      val __obj = js.Dynamic.literal(
        "ConditionDocumentAttributeKey" -> ConditionDocumentAttributeKey.asInstanceOf[js.Any],
        "Operator" -> Operator.asInstanceOf[js.Any]
      )

      ConditionOnValue.foreach(__v => __obj.updateDynamic("ConditionOnValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentAttributeCondition]
    }
  }

  /** The target document attribute or metadata field you want to alter when ingesting documents into Amazon Kendra. For example, you can delete customer identification numbers associated with the documents, stored in the document metadata field called 'Customer_ID'. You set the target key as 'Customer_ID' and the deletion flag to <code>TRUE</code>. This removes all customer ID values in the field 'Customer_ID'. This would scrub personally identifiable information from each document's metadata. Amazon Kendra cannot create a target field if it has not already been created as an index field. After you create your index field, you can create a document metadata field using <code>DocumentAttributeTarget</code>. Amazon Kendra then will map your newly created metadata field to your index field. You can also use this with [[https://docs.aws.amazon.com/kendra/latest/dg/API_DocumentAttributeCondition.html|DocumentAttributeCondition]].
    */
  @js.native
  trait DocumentAttributeTarget extends js.Object {
    var TargetDocumentAttributeKey: js.UndefOr[DocumentAttributeKey]
    var TargetDocumentAttributeValue: js.UndefOr[DocumentAttributeValue]
    var TargetDocumentAttributeValueDeletion: js.UndefOr[Boolean]
  }

  object DocumentAttributeTarget {
    @inline
    def apply(
        TargetDocumentAttributeKey: js.UndefOr[DocumentAttributeKey] = js.undefined,
        TargetDocumentAttributeValue: js.UndefOr[DocumentAttributeValue] = js.undefined,
        TargetDocumentAttributeValueDeletion: js.UndefOr[Boolean] = js.undefined
    ): DocumentAttributeTarget = {
      val __obj = js.Dynamic.literal()
      TargetDocumentAttributeKey.foreach(__v => __obj.updateDynamic("TargetDocumentAttributeKey")(__v.asInstanceOf[js.Any]))
      TargetDocumentAttributeValue.foreach(__v => __obj.updateDynamic("TargetDocumentAttributeValue")(__v.asInstanceOf[js.Any]))
      TargetDocumentAttributeValueDeletion.foreach(__v => __obj.updateDynamic("TargetDocumentAttributeValueDeletion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentAttributeTarget]
    }
  }

  /** The value of a custom document attribute. You can only provide one value for a custom attribute.
    */
  @js.native
  trait DocumentAttributeValue extends js.Object {
    var DateValue: js.UndefOr[Timestamp]
    var LongValue: js.UndefOr[Double]
    var StringListValue: js.UndefOr[DocumentAttributeStringListValue]
    var StringValue: js.UndefOr[DocumentAttributeStringValue]
  }

  object DocumentAttributeValue {
    @inline
    def apply(
        DateValue: js.UndefOr[Timestamp] = js.undefined,
        LongValue: js.UndefOr[Double] = js.undefined,
        StringListValue: js.UndefOr[DocumentAttributeStringListValue] = js.undefined,
        StringValue: js.UndefOr[DocumentAttributeStringValue] = js.undefined
    ): DocumentAttributeValue = {
      val __obj = js.Dynamic.literal()
      DateValue.foreach(__v => __obj.updateDynamic("DateValue")(__v.asInstanceOf[js.Any]))
      LongValue.foreach(__v => __obj.updateDynamic("LongValue")(__v.asInstanceOf[js.Any]))
      StringListValue.foreach(__v => __obj.updateDynamic("StringListValue")(__v.asInstanceOf[js.Any]))
      StringValue.foreach(__v => __obj.updateDynamic("StringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentAttributeValue]
    }
  }

  /** Provides the count of documents that match a particular attribute when doing a faceted search.
    */
  @js.native
  trait DocumentAttributeValueCountPair extends js.Object {
    var Count: js.UndefOr[Int]
    var DocumentAttributeValue: js.UndefOr[DocumentAttributeValue]
  }

  object DocumentAttributeValueCountPair {
    @inline
    def apply(
        Count: js.UndefOr[Int] = js.undefined,
        DocumentAttributeValue: js.UndefOr[DocumentAttributeValue] = js.undefined
    ): DocumentAttributeValueCountPair = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      DocumentAttributeValue.foreach(__v => __obj.updateDynamic("DocumentAttributeValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentAttributeValueCountPair]
    }
  }

  /** Identifies a document for which to retrieve status information
    */
  @js.native
  trait DocumentInfo extends js.Object {
    var DocumentId: DocumentId
    var Attributes: js.UndefOr[DocumentAttributeList]
  }

  object DocumentInfo {
    @inline
    def apply(
        DocumentId: DocumentId,
        Attributes: js.UndefOr[DocumentAttributeList] = js.undefined
    ): DocumentInfo = {
      val __obj = js.Dynamic.literal(
        "DocumentId" -> DocumentId.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentInfo]
    }
  }

  /** Specifies the properties of a custom index field.
    */
  @js.native
  trait DocumentMetadataConfiguration extends js.Object {
    var Name: DocumentMetadataConfigurationName
    var Type: DocumentAttributeValueType
    var Relevance: js.UndefOr[Relevance]
    var Search: js.UndefOr[Search]
  }

  object DocumentMetadataConfiguration {
    @inline
    def apply(
        Name: DocumentMetadataConfigurationName,
        Type: DocumentAttributeValueType,
        Relevance: js.UndefOr[Relevance] = js.undefined,
        Search: js.UndefOr[Search] = js.undefined
    ): DocumentMetadataConfiguration = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Relevance.foreach(__v => __obj.updateDynamic("Relevance")(__v.asInstanceOf[js.Any]))
      Search.foreach(__v => __obj.updateDynamic("Search")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentMetadataConfiguration]
    }
  }

  /** Overrides the document relevance properties of a custom index field.
    */
  @js.native
  trait DocumentRelevanceConfiguration extends js.Object {
    var Name: DocumentMetadataConfigurationName
    var Relevance: Relevance
  }

  object DocumentRelevanceConfiguration {
    @inline
    def apply(
        Name: DocumentMetadataConfigurationName,
        Relevance: Relevance
    ): DocumentRelevanceConfiguration = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Relevance" -> Relevance.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DocumentRelevanceConfiguration]
    }
  }

  /** Document metadata files that contain information such as the document access control information, source URI, document author, and custom attributes. Each metadata file contains metadata about a single document.
    */
  @js.native
  trait DocumentsMetadataConfiguration extends js.Object {
    var S3Prefix: js.UndefOr[S3ObjectKey]
  }

  object DocumentsMetadataConfiguration {
    @inline
    def apply(
        S3Prefix: js.UndefOr[S3ObjectKey] = js.undefined
    ): DocumentsMetadataConfiguration = {
      val __obj = js.Dynamic.literal()
      S3Prefix.foreach(__v => __obj.updateDynamic("S3Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentsMetadataConfiguration]
    }
  }

  /** Provides the configuration information of users or groups in your Amazon Web Services SSO identity source to grant access your Amazon Kendra experience.
    */
  @js.native
  trait EntityConfiguration extends js.Object {
    var EntityId: EntityId
    var EntityType: EntityType
  }

  object EntityConfiguration {
    @inline
    def apply(
        EntityId: EntityId,
        EntityType: EntityType
    ): EntityConfiguration = {
      val __obj = js.Dynamic.literal(
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "EntityType" -> EntityType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EntityConfiguration]
    }
  }

  /** Information about the user entity.
    */
  @js.native
  trait EntityDisplayData extends js.Object {
    var FirstName: js.UndefOr[NameType]
    var GroupName: js.UndefOr[NameType]
    var IdentifiedUserName: js.UndefOr[NameType]
    var LastName: js.UndefOr[NameType]
    var UserName: js.UndefOr[NameType]
  }

  object EntityDisplayData {
    @inline
    def apply(
        FirstName: js.UndefOr[NameType] = js.undefined,
        GroupName: js.UndefOr[NameType] = js.undefined,
        IdentifiedUserName: js.UndefOr[NameType] = js.undefined,
        LastName: js.UndefOr[NameType] = js.undefined,
        UserName: js.UndefOr[NameType] = js.undefined
    ): EntityDisplayData = {
      val __obj = js.Dynamic.literal()
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      IdentifiedUserName.foreach(__v => __obj.updateDynamic("IdentifiedUserName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityDisplayData]
    }
  }

  /** Provides the configuration information of users or groups in your Amazon Web Services SSO identity source for access to your Amazon Kendra experience. Specific permissions are defined for each user or group once they are granted access to your Amazon Kendra experience.
    */
  @js.native
  trait EntityPersonaConfiguration extends js.Object {
    var EntityId: EntityId
    var Persona: Persona
  }

  object EntityPersonaConfiguration {
    @inline
    def apply(
        EntityId: EntityId,
        Persona: Persona
    ): EntityPersonaConfiguration = {
      val __obj = js.Dynamic.literal(
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "Persona" -> Persona.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EntityPersonaConfiguration]
    }
  }

  /** Specifies the configuration information for your Amazon Kendra experience. This includes the data source IDs and/or FAQ IDs, and user or group information to grant access to your Amazon Kendra experience.
    */
  @js.native
  trait ExperienceConfiguration extends js.Object {
    var ContentSourceConfiguration: js.UndefOr[ContentSourceConfiguration]
    var UserIdentityConfiguration: js.UndefOr[UserIdentityConfiguration]
  }

  object ExperienceConfiguration {
    @inline
    def apply(
        ContentSourceConfiguration: js.UndefOr[ContentSourceConfiguration] = js.undefined,
        UserIdentityConfiguration: js.UndefOr[UserIdentityConfiguration] = js.undefined
    ): ExperienceConfiguration = {
      val __obj = js.Dynamic.literal()
      ContentSourceConfiguration.foreach(__v => __obj.updateDynamic("ContentSourceConfiguration")(__v.asInstanceOf[js.Any]))
      UserIdentityConfiguration.foreach(__v => __obj.updateDynamic("UserIdentityConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperienceConfiguration]
    }
  }

  /** Provides the configuration information of the endpoint for your Amazon Kendra experience.
    */
  @js.native
  trait ExperienceEndpoint extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
    var EndpointType: js.UndefOr[EndpointType]
  }

  object ExperienceEndpoint {
    @inline
    def apply(
        Endpoint: js.UndefOr[Endpoint] = js.undefined,
        EndpointType: js.UndefOr[EndpointType] = js.undefined
    ): ExperienceEndpoint = {
      val __obj = js.Dynamic.literal()
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperienceEndpoint]
    }
  }

  /** Summary information for users or groups in your Amazon Web Services SSO identity source with granted access to your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see [[https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html|Building a search experience with no code]].
    */
  @js.native
  trait ExperienceEntitiesSummary extends js.Object {
    var DisplayData: js.UndefOr[EntityDisplayData]
    var EntityId: js.UndefOr[EntityId]
    var EntityType: js.UndefOr[EntityType]
  }

  object ExperienceEntitiesSummary {
    @inline
    def apply(
        DisplayData: js.UndefOr[EntityDisplayData] = js.undefined,
        EntityId: js.UndefOr[EntityId] = js.undefined,
        EntityType: js.UndefOr[EntityType] = js.undefined
    ): ExperienceEntitiesSummary = {
      val __obj = js.Dynamic.literal()
      DisplayData.foreach(__v => __obj.updateDynamic("DisplayData")(__v.asInstanceOf[js.Any]))
      EntityId.foreach(__v => __obj.updateDynamic("EntityId")(__v.asInstanceOf[js.Any]))
      EntityType.foreach(__v => __obj.updateDynamic("EntityType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperienceEntitiesSummary]
    }
  }

  /** Summary information for your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see [[https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html|Building a search experience with no code]].
    */
  @js.native
  trait ExperiencesSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Endpoints: js.UndefOr[ExperienceEndpoints]
    var Id: js.UndefOr[ExperienceId]
    var Name: js.UndefOr[ExperienceName]
    var Status: js.UndefOr[ExperienceStatus]
  }

  object ExperiencesSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Endpoints: js.UndefOr[ExperienceEndpoints] = js.undefined,
        Id: js.UndefOr[ExperienceId] = js.undefined,
        Name: js.UndefOr[ExperienceName] = js.undefined,
        Status: js.UndefOr[ExperienceStatus] = js.undefined
    ): ExperiencesSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExperiencesSummary]
    }
  }

  /** Information about a document attribute
    */
  @js.native
  trait Facet extends js.Object {
    var DocumentAttributeKey: js.UndefOr[DocumentAttributeKey]
  }

  object Facet {
    @inline
    def apply(
        DocumentAttributeKey: js.UndefOr[DocumentAttributeKey] = js.undefined
    ): Facet = {
      val __obj = js.Dynamic.literal()
      DocumentAttributeKey.foreach(__v => __obj.updateDynamic("DocumentAttributeKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Facet]
    }
  }

  /** The facet values for the documents in the response.
    */
  @js.native
  trait FacetResult extends js.Object {
    var DocumentAttributeKey: js.UndefOr[DocumentAttributeKey]
    var DocumentAttributeValueCountPairs: js.UndefOr[DocumentAttributeValueCountPairList]
    var DocumentAttributeValueType: js.UndefOr[DocumentAttributeValueType]
  }

  object FacetResult {
    @inline
    def apply(
        DocumentAttributeKey: js.UndefOr[DocumentAttributeKey] = js.undefined,
        DocumentAttributeValueCountPairs: js.UndefOr[DocumentAttributeValueCountPairList] = js.undefined,
        DocumentAttributeValueType: js.UndefOr[DocumentAttributeValueType] = js.undefined
    ): FacetResult = {
      val __obj = js.Dynamic.literal()
      DocumentAttributeKey.foreach(__v => __obj.updateDynamic("DocumentAttributeKey")(__v.asInstanceOf[js.Any]))
      DocumentAttributeValueCountPairs.foreach(__v => __obj.updateDynamic("DocumentAttributeValueCountPairs")(__v.asInstanceOf[js.Any]))
      DocumentAttributeValueType.foreach(__v => __obj.updateDynamic("DocumentAttributeValueType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FacetResult]
    }
  }

  /** Information on the users or groups in your Amazon Web Services SSO identity source that failed to properly configure with your Amazon Kendra experience.
    */
  @js.native
  trait FailedEntity extends js.Object {
    var EntityId: js.UndefOr[EntityId]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  object FailedEntity {
    @inline
    def apply(
        EntityId: js.UndefOr[EntityId] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): FailedEntity = {
      val __obj = js.Dynamic.literal()
      EntityId.foreach(__v => __obj.updateDynamic("EntityId")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedEntity]
    }
  }

  /** Provides statistical information about the FAQ questions and answers contained in an index.
    */
  @js.native
  trait FaqStatistics extends js.Object {
    var IndexedQuestionAnswersCount: IndexedQuestionAnswersCount
  }

  object FaqStatistics {
    @inline
    def apply(
        IndexedQuestionAnswersCount: IndexedQuestionAnswersCount
    ): FaqStatistics = {
      val __obj = js.Dynamic.literal(
        "IndexedQuestionAnswersCount" -> IndexedQuestionAnswersCount.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FaqStatistics]
    }
  }

  /** Provides information about a frequently asked questions and answer contained in an index.
    */
  @js.native
  trait FaqSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var FileFormat: js.UndefOr[FaqFileFormat]
    var Id: js.UndefOr[FaqId]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Name: js.UndefOr[FaqName]
    var Status: js.UndefOr[FaqStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object FaqSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        FileFormat: js.UndefOr[FaqFileFormat] = js.undefined,
        Id: js.UndefOr[FaqId] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Name: js.UndefOr[FaqName] = js.undefined,
        Status: js.UndefOr[FaqStatus] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): FaqSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      FileFormat.foreach(__v => __obj.updateDynamic("FileFormat")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaqSummary]
    }
  }

  @js.native
  trait GetQuerySuggestionsRequest extends js.Object {
    var IndexId: IndexId
    var QueryText: SuggestionQueryText
    var MaxSuggestionsCount: js.UndefOr[Int]
  }

  object GetQuerySuggestionsRequest {
    @inline
    def apply(
        IndexId: IndexId,
        QueryText: SuggestionQueryText,
        MaxSuggestionsCount: js.UndefOr[Int] = js.undefined
    ): GetQuerySuggestionsRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any],
        "QueryText" -> QueryText.asInstanceOf[js.Any]
      )

      MaxSuggestionsCount.foreach(__v => __obj.updateDynamic("MaxSuggestionsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQuerySuggestionsRequest]
    }
  }

  @js.native
  trait GetQuerySuggestionsResponse extends js.Object {
    var QuerySuggestionsId: js.UndefOr[QuerySuggestionsId]
    var Suggestions: js.UndefOr[SuggestionList]
  }

  object GetQuerySuggestionsResponse {
    @inline
    def apply(
        QuerySuggestionsId: js.UndefOr[QuerySuggestionsId] = js.undefined,
        Suggestions: js.UndefOr[SuggestionList] = js.undefined
    ): GetQuerySuggestionsResponse = {
      val __obj = js.Dynamic.literal()
      QuerySuggestionsId.foreach(__v => __obj.updateDynamic("QuerySuggestionsId")(__v.asInstanceOf[js.Any]))
      Suggestions.foreach(__v => __obj.updateDynamic("Suggestions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQuerySuggestionsResponse]
    }
  }

  @js.native
  trait GetSnapshotsRequest extends js.Object {
    var IndexId: IndexId
    var Interval: Interval
    var MetricType: MetricType
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetSnapshotsRequest {
    @inline
    def apply(
        IndexId: IndexId,
        Interval: Interval,
        MetricType: MetricType,
        MaxResults: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetSnapshotsRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any],
        "Interval" -> Interval.asInstanceOf[js.Any],
        "MetricType" -> MetricType.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSnapshotsRequest]
    }
  }

  @js.native
  trait GetSnapshotsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SnapShotTimeFilter: js.UndefOr[TimeRange]
    var SnapshotsData: js.UndefOr[SnapshotsDataRecords]
    var SnapshotsDataHeader: js.UndefOr[SnapshotsDataHeaderFields]
  }

  object GetSnapshotsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SnapShotTimeFilter: js.UndefOr[TimeRange] = js.undefined,
        SnapshotsData: js.UndefOr[SnapshotsDataRecords] = js.undefined,
        SnapshotsDataHeader: js.UndefOr[SnapshotsDataHeaderFields] = js.undefined
    ): GetSnapshotsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SnapShotTimeFilter.foreach(__v => __obj.updateDynamic("SnapShotTimeFilter")(__v.asInstanceOf[js.Any]))
      SnapshotsData.foreach(__v => __obj.updateDynamic("SnapshotsData")(__v.asInstanceOf[js.Any]))
      SnapshotsDataHeader.foreach(__v => __obj.updateDynamic("SnapshotsDataHeader")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSnapshotsResponse]
    }
  }

  /** Provides configuration information for data sources that connect to Google Drive.
    */
  @js.native
  trait GoogleDriveConfiguration extends js.Object {
    var SecretArn: SecretArn
    var ExcludeMimeTypes: js.UndefOr[ExcludeMimeTypesList]
    var ExcludeSharedDrives: js.UndefOr[ExcludeSharedDrivesList]
    var ExcludeUserAccounts: js.UndefOr[ExcludeUserAccountsList]
    var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
    var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
  }

  object GoogleDriveConfiguration {
    @inline
    def apply(
        SecretArn: SecretArn,
        ExcludeMimeTypes: js.UndefOr[ExcludeMimeTypesList] = js.undefined,
        ExcludeSharedDrives: js.UndefOr[ExcludeSharedDrivesList] = js.undefined,
        ExcludeUserAccounts: js.UndefOr[ExcludeUserAccountsList] = js.undefined,
        ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined,
        InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
    ): GoogleDriveConfiguration = {
      val __obj = js.Dynamic.literal(
        "SecretArn" -> SecretArn.asInstanceOf[js.Any]
      )

      ExcludeMimeTypes.foreach(__v => __obj.updateDynamic("ExcludeMimeTypes")(__v.asInstanceOf[js.Any]))
      ExcludeSharedDrives.foreach(__v => __obj.updateDynamic("ExcludeSharedDrives")(__v.asInstanceOf[js.Any]))
      ExcludeUserAccounts.foreach(__v => __obj.updateDynamic("ExcludeUserAccounts")(__v.asInstanceOf[js.Any]))
      ExclusionPatterns.foreach(__v => __obj.updateDynamic("ExclusionPatterns")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
      InclusionPatterns.foreach(__v => __obj.updateDynamic("InclusionPatterns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GoogleDriveConfiguration]
    }
  }

  /** A list of users or sub groups that belong to a group. Users and groups are useful for filtering search results to different users based on their group's access to documents.
    */
  @js.native
  trait GroupMembers extends js.Object {
    var MemberGroups: js.UndefOr[MemberGroups]
    var MemberUsers: js.UndefOr[MemberUsers]
    var S3PathforGroupMembers: js.UndefOr[S3Path]
  }

  object GroupMembers {
    @inline
    def apply(
        MemberGroups: js.UndefOr[MemberGroups] = js.undefined,
        MemberUsers: js.UndefOr[MemberUsers] = js.undefined,
        S3PathforGroupMembers: js.UndefOr[S3Path] = js.undefined
    ): GroupMembers = {
      val __obj = js.Dynamic.literal()
      MemberGroups.foreach(__v => __obj.updateDynamic("MemberGroups")(__v.asInstanceOf[js.Any]))
      MemberUsers.foreach(__v => __obj.updateDynamic("MemberUsers")(__v.asInstanceOf[js.Any]))
      S3PathforGroupMembers.foreach(__v => __obj.updateDynamic("S3PathforGroupMembers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupMembers]
    }
  }

  /** Information on the processing of <code>PUT</code> and <code>DELETE</code> actions for mapping users to their groups.
    */
  @js.native
  trait GroupOrderingIdSummary extends js.Object {
    var FailureReason: js.UndefOr[FailureReason]
    var LastUpdatedAt: js.UndefOr[Timestamp]
    var OrderingId: js.UndefOr[PrincipalOrderingId]
    var ReceivedAt: js.UndefOr[Timestamp]
    var Status: js.UndefOr[PrincipalMappingStatus]
  }

  object GroupOrderingIdSummary {
    @inline
    def apply(
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        OrderingId: js.UndefOr[PrincipalOrderingId] = js.undefined,
        ReceivedAt: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[PrincipalMappingStatus] = js.undefined
    ): GroupOrderingIdSummary = {
      val __obj = js.Dynamic.literal()
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      OrderingId.foreach(__v => __obj.updateDynamic("OrderingId")(__v.asInstanceOf[js.Any]))
      ReceivedAt.foreach(__v => __obj.updateDynamic("ReceivedAt")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupOrderingIdSummary]
    }
  }

  /** Group summary information.
    */
  @js.native
  trait GroupSummary extends js.Object {
    var GroupId: js.UndefOr[GroupId]
    var OrderingId: js.UndefOr[PrincipalOrderingId]
  }

  object GroupSummary {
    @inline
    def apply(
        GroupId: js.UndefOr[GroupId] = js.undefined,
        OrderingId: js.UndefOr[PrincipalOrderingId] = js.undefined
    ): GroupSummary = {
      val __obj = js.Dynamic.literal()
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      OrderingId.foreach(__v => __obj.updateDynamic("OrderingId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupSummary]
    }
  }

  /** Information to define the hierarchy for which documents users should have access to.
    */
  @js.native
  trait HierarchicalPrincipal extends js.Object {
    var PrincipalList: PrincipalList
  }

  object HierarchicalPrincipal {
    @inline
    def apply(
        PrincipalList: PrincipalList
    ): HierarchicalPrincipal = {
      val __obj = js.Dynamic.literal(
        "PrincipalList" -> PrincipalList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HierarchicalPrincipal]
    }
  }

  /** Provides information that you can use to highlight a search result so that your users can quickly identify terms in the response.
    */
  @js.native
  trait Highlight extends js.Object {
    var BeginOffset: Int
    var EndOffset: Int
    var TopAnswer: js.UndefOr[Boolean]
    var Type: js.UndefOr[HighlightType]
  }

  object Highlight {
    @inline
    def apply(
        BeginOffset: Int,
        EndOffset: Int,
        TopAnswer: js.UndefOr[Boolean] = js.undefined,
        Type: js.UndefOr[HighlightType] = js.undefined
    ): Highlight = {
      val __obj = js.Dynamic.literal(
        "BeginOffset" -> BeginOffset.asInstanceOf[js.Any],
        "EndOffset" -> EndOffset.asInstanceOf[js.Any]
      )

      TopAnswer.foreach(__v => __obj.updateDynamic("TopAnswer")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Highlight]
    }
  }

  /** Provides the configuration information for invoking a Lambda function in Lambda to alter document metadata and content when ingesting documents into Amazon Kendra. You can configure your Lambda function using [[https://docs.aws.amazon.com/kendra/latest/dg/API_PreExtractionHookConfiguration.html|PreExtractionHookConfiguration]] if you want to apply advanced alterations on the original or raw documents. If you want to apply advanced alterations on the Amazon Kendra structured documents, you must configure your Lambda function using [[https://docs.aws.amazon.com/kendra/latest/dg/API_PostExtractionHookConfiguration.html|PostExtractionHookConfiguration]]. You can only invoke one Lambda function. However, this function can invoke other functions it requires. For more information, see [[https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html|Customizing document metadata during the ingestion process]].
    */
  @js.native
  trait HookConfiguration extends js.Object {
    var LambdaArn: LambdaArn
    var S3Bucket: S3BucketName
    var InvocationCondition: js.UndefOr[DocumentAttributeCondition]
  }

  object HookConfiguration {
    @inline
    def apply(
        LambdaArn: LambdaArn,
        S3Bucket: S3BucketName,
        InvocationCondition: js.UndefOr[DocumentAttributeCondition] = js.undefined
    ): HookConfiguration = {
      val __obj = js.Dynamic.literal(
        "LambdaArn" -> LambdaArn.asInstanceOf[js.Any],
        "S3Bucket" -> S3Bucket.asInstanceOf[js.Any]
      )

      InvocationCondition.foreach(__v => __obj.updateDynamic("InvocationCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HookConfiguration]
    }
  }

  /** A summary of information about an index.
    */
  @js.native
  trait IndexConfigurationSummary extends js.Object {
    var CreatedAt: Timestamp
    var Status: IndexStatus
    var UpdatedAt: Timestamp
    var Edition: js.UndefOr[IndexEdition]
    var Id: js.UndefOr[IndexId]
    var Name: js.UndefOr[IndexName]
  }

  object IndexConfigurationSummary {
    @inline
    def apply(
        CreatedAt: Timestamp,
        Status: IndexStatus,
        UpdatedAt: Timestamp,
        Edition: js.UndefOr[IndexEdition] = js.undefined,
        Id: js.UndefOr[IndexId] = js.undefined,
        Name: js.UndefOr[IndexName] = js.undefined
    ): IndexConfigurationSummary = {
      val __obj = js.Dynamic.literal(
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
      )

      Edition.foreach(__v => __obj.updateDynamic("Edition")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IndexConfigurationSummary]
    }
  }

  /** Provides information about the number of documents and the number of questions and answers in an index.
    */
  @js.native
  trait IndexStatistics extends js.Object {
    var FaqStatistics: FaqStatistics
    var TextDocumentStatistics: TextDocumentStatistics
  }

  object IndexStatistics {
    @inline
    def apply(
        FaqStatistics: FaqStatistics,
        TextDocumentStatistics: TextDocumentStatistics
    ): IndexStatistics = {
      val __obj = js.Dynamic.literal(
        "FaqStatistics" -> FaqStatistics.asInstanceOf[js.Any],
        "TextDocumentStatistics" -> TextDocumentStatistics.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IndexStatistics]
    }
  }

  /** Provides the configuration information for applying basic logic to alter document metadata and content when ingesting documents into Amazon Kendra. To apply advanced logic, to go beyond what you can do with basic logic, see [[https://docs.aws.amazon.com/kendra/latest/dg/API_HookConfiguration.html|HookConfiguration]]. For more information, see [[https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html|Customizing document metadata during the ingestion process]].
    */
  @js.native
  trait InlineCustomDocumentEnrichmentConfiguration extends js.Object {
    var Condition: js.UndefOr[DocumentAttributeCondition]
    var DocumentContentDeletion: js.UndefOr[Boolean]
    var Target: js.UndefOr[DocumentAttributeTarget]
  }

  object InlineCustomDocumentEnrichmentConfiguration {
    @inline
    def apply(
        Condition: js.UndefOr[DocumentAttributeCondition] = js.undefined,
        DocumentContentDeletion: js.UndefOr[Boolean] = js.undefined,
        Target: js.UndefOr[DocumentAttributeTarget] = js.undefined
    ): InlineCustomDocumentEnrichmentConfiguration = {
      val __obj = js.Dynamic.literal()
      Condition.foreach(__v => __obj.updateDynamic("Condition")(__v.asInstanceOf[js.Any]))
      DocumentContentDeletion.foreach(__v => __obj.updateDynamic("DocumentContentDeletion")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InlineCustomDocumentEnrichmentConfiguration]
    }
  }

  /** Configuration information for the JSON token type.
    */
  @js.native
  trait JsonTokenTypeConfiguration extends js.Object {
    var GroupAttributeField: String
    var UserNameAttributeField: String
  }

  object JsonTokenTypeConfiguration {
    @inline
    def apply(
        GroupAttributeField: String,
        UserNameAttributeField: String
    ): JsonTokenTypeConfiguration = {
      val __obj = js.Dynamic.literal(
        "GroupAttributeField" -> GroupAttributeField.asInstanceOf[js.Any],
        "UserNameAttributeField" -> UserNameAttributeField.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[JsonTokenTypeConfiguration]
    }
  }

  /** Configuration information for the JWT token type.
    */
  @js.native
  trait JwtTokenTypeConfiguration extends js.Object {
    var KeyLocation: KeyLocation
    var ClaimRegex: js.UndefOr[ClaimRegex]
    var GroupAttributeField: js.UndefOr[GroupAttributeField]
    var Issuer: js.UndefOr[Issuer]
    var SecretManagerArn: js.UndefOr[RoleArn]
    var URL: js.UndefOr[Url]
    var UserNameAttributeField: js.UndefOr[UserNameAttributeField]
  }

  object JwtTokenTypeConfiguration {
    @inline
    def apply(
        KeyLocation: KeyLocation,
        ClaimRegex: js.UndefOr[ClaimRegex] = js.undefined,
        GroupAttributeField: js.UndefOr[GroupAttributeField] = js.undefined,
        Issuer: js.UndefOr[Issuer] = js.undefined,
        SecretManagerArn: js.UndefOr[RoleArn] = js.undefined,
        URL: js.UndefOr[Url] = js.undefined,
        UserNameAttributeField: js.UndefOr[UserNameAttributeField] = js.undefined
    ): JwtTokenTypeConfiguration = {
      val __obj = js.Dynamic.literal(
        "KeyLocation" -> KeyLocation.asInstanceOf[js.Any]
      )

      ClaimRegex.foreach(__v => __obj.updateDynamic("ClaimRegex")(__v.asInstanceOf[js.Any]))
      GroupAttributeField.foreach(__v => __obj.updateDynamic("GroupAttributeField")(__v.asInstanceOf[js.Any]))
      Issuer.foreach(__v => __obj.updateDynamic("Issuer")(__v.asInstanceOf[js.Any]))
      SecretManagerArn.foreach(__v => __obj.updateDynamic("SecretManagerArn")(__v.asInstanceOf[js.Any]))
      URL.foreach(__v => __obj.updateDynamic("URL")(__v.asInstanceOf[js.Any]))
      UserNameAttributeField.foreach(__v => __obj.updateDynamic("UserNameAttributeField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JwtTokenTypeConfiguration]
    }
  }

  @js.native
  trait ListDataSourceSyncJobsRequest extends js.Object {
    var Id: DataSourceId
    var IndexId: IndexId
    var MaxResults: js.UndefOr[MaxResultsIntegerForListDataSourceSyncJobsRequest]
    var NextToken: js.UndefOr[NextToken]
    var StartTimeFilter: js.UndefOr[TimeRange]
    var StatusFilter: js.UndefOr[DataSourceSyncJobStatus]
  }

  object ListDataSourceSyncJobsRequest {
    @inline
    def apply(
        Id: DataSourceId,
        IndexId: IndexId,
        MaxResults: js.UndefOr[MaxResultsIntegerForListDataSourceSyncJobsRequest] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StartTimeFilter: js.UndefOr[TimeRange] = js.undefined,
        StatusFilter: js.UndefOr[DataSourceSyncJobStatus] = js.undefined
    ): ListDataSourceSyncJobsRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartTimeFilter.foreach(__v => __obj.updateDynamic("StartTimeFilter")(__v.asInstanceOf[js.Any]))
      StatusFilter.foreach(__v => __obj.updateDynamic("StatusFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSourceSyncJobsRequest]
    }
  }

  @js.native
  trait ListDataSourceSyncJobsResponse extends js.Object {
    var History: js.UndefOr[DataSourceSyncJobHistoryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDataSourceSyncJobsResponse {
    @inline
    def apply(
        History: js.UndefOr[DataSourceSyncJobHistoryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDataSourceSyncJobsResponse = {
      val __obj = js.Dynamic.literal()
      History.foreach(__v => __obj.updateDynamic("History")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSourceSyncJobsResponse]
    }
  }

  @js.native
  trait ListDataSourcesRequest extends js.Object {
    var IndexId: IndexId
    var MaxResults: js.UndefOr[MaxResultsIntegerForListDataSourcesRequest]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDataSourcesRequest {
    @inline
    def apply(
        IndexId: IndexId,
        MaxResults: js.UndefOr[MaxResultsIntegerForListDataSourcesRequest] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDataSourcesRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSourcesRequest]
    }
  }

  @js.native
  trait ListDataSourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SummaryItems: js.UndefOr[DataSourceSummaryList]
  }

  object ListDataSourcesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SummaryItems: js.UndefOr[DataSourceSummaryList] = js.undefined
    ): ListDataSourcesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SummaryItems.foreach(__v => __obj.updateDynamic("SummaryItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSourcesResponse]
    }
  }

  @js.native
  trait ListEntityPersonasRequest extends js.Object {
    var Id: ExperienceId
    var IndexId: IndexId
    var MaxResults: js.UndefOr[MaxResultsIntegerForListEntityPersonasRequest]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEntityPersonasRequest {
    @inline
    def apply(
        Id: ExperienceId,
        IndexId: IndexId,
        MaxResults: js.UndefOr[MaxResultsIntegerForListEntityPersonasRequest] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEntityPersonasRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntityPersonasRequest]
    }
  }

  @js.native
  trait ListEntityPersonasResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SummaryItems: js.UndefOr[PersonasSummaryList]
  }

  object ListEntityPersonasResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SummaryItems: js.UndefOr[PersonasSummaryList] = js.undefined
    ): ListEntityPersonasResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SummaryItems.foreach(__v => __obj.updateDynamic("SummaryItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntityPersonasResponse]
    }
  }

  @js.native
  trait ListExperienceEntitiesRequest extends js.Object {
    var Id: ExperienceId
    var IndexId: IndexId
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExperienceEntitiesRequest {
    @inline
    def apply(
        Id: ExperienceId,
        IndexId: IndexId,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExperienceEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExperienceEntitiesRequest]
    }
  }

  @js.native
  trait ListExperienceEntitiesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SummaryItems: js.UndefOr[ExperienceEntitiesSummaryList]
  }

  object ListExperienceEntitiesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SummaryItems: js.UndefOr[ExperienceEntitiesSummaryList] = js.undefined
    ): ListExperienceEntitiesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SummaryItems.foreach(__v => __obj.updateDynamic("SummaryItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExperienceEntitiesResponse]
    }
  }

  @js.native
  trait ListExperiencesRequest extends js.Object {
    var IndexId: IndexId
    var MaxResults: js.UndefOr[MaxResultsIntegerForListExperiencesRequest]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExperiencesRequest {
    @inline
    def apply(
        IndexId: IndexId,
        MaxResults: js.UndefOr[MaxResultsIntegerForListExperiencesRequest] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExperiencesRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExperiencesRequest]
    }
  }

  @js.native
  trait ListExperiencesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SummaryItems: js.UndefOr[ExperiencesSummaryList]
  }

  object ListExperiencesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SummaryItems: js.UndefOr[ExperiencesSummaryList] = js.undefined
    ): ListExperiencesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SummaryItems.foreach(__v => __obj.updateDynamic("SummaryItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExperiencesResponse]
    }
  }

  @js.native
  trait ListFaqsRequest extends js.Object {
    var IndexId: IndexId
    var MaxResults: js.UndefOr[MaxResultsIntegerForListFaqsRequest]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFaqsRequest {
    @inline
    def apply(
        IndexId: IndexId,
        MaxResults: js.UndefOr[MaxResultsIntegerForListFaqsRequest] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFaqsRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFaqsRequest]
    }
  }

  @js.native
  trait ListFaqsResponse extends js.Object {
    var FaqSummaryItems: js.UndefOr[FaqSummaryItems]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFaqsResponse {
    @inline
    def apply(
        FaqSummaryItems: js.UndefOr[FaqSummaryItems] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFaqsResponse = {
      val __obj = js.Dynamic.literal()
      FaqSummaryItems.foreach(__v => __obj.updateDynamic("FaqSummaryItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFaqsResponse]
    }
  }

  @js.native
  trait ListGroupsOlderThanOrderingIdRequest extends js.Object {
    var IndexId: IndexId
    var OrderingId: PrincipalOrderingId
    var DataSourceId: js.UndefOr[DataSourceId]
    var MaxResults: js.UndefOr[MaxResultsIntegerForListPrincipalsRequest]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsOlderThanOrderingIdRequest {
    @inline
    def apply(
        IndexId: IndexId,
        OrderingId: PrincipalOrderingId,
        DataSourceId: js.UndefOr[DataSourceId] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsIntegerForListPrincipalsRequest] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsOlderThanOrderingIdRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any],
        "OrderingId" -> OrderingId.asInstanceOf[js.Any]
      )

      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsOlderThanOrderingIdRequest]
    }
  }

  @js.native
  trait ListGroupsOlderThanOrderingIdResponse extends js.Object {
    var GroupsSummaries: js.UndefOr[ListOfGroupSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsOlderThanOrderingIdResponse {
    @inline
    def apply(
        GroupsSummaries: js.UndefOr[ListOfGroupSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsOlderThanOrderingIdResponse = {
      val __obj = js.Dynamic.literal()
      GroupsSummaries.foreach(__v => __obj.updateDynamic("GroupsSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsOlderThanOrderingIdResponse]
    }
  }

  @js.native
  trait ListIndicesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsIntegerForListIndicesRequest]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIndicesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResultsIntegerForListIndicesRequest] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIndicesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIndicesRequest]
    }
  }

  @js.native
  trait ListIndicesResponse extends js.Object {
    var IndexConfigurationSummaryItems: js.UndefOr[IndexConfigurationSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIndicesResponse {
    @inline
    def apply(
        IndexConfigurationSummaryItems: js.UndefOr[IndexConfigurationSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIndicesResponse = {
      val __obj = js.Dynamic.literal()
      IndexConfigurationSummaryItems.foreach(__v => __obj.updateDynamic("IndexConfigurationSummaryItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIndicesResponse]
    }
  }

  @js.native
  trait ListQuerySuggestionsBlockListsRequest extends js.Object {
    var IndexId: IndexId
    var MaxResults: js.UndefOr[MaxResultsIntegerForListQuerySuggestionsBlockLists]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListQuerySuggestionsBlockListsRequest {
    @inline
    def apply(
        IndexId: IndexId,
        MaxResults: js.UndefOr[MaxResultsIntegerForListQuerySuggestionsBlockLists] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListQuerySuggestionsBlockListsRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQuerySuggestionsBlockListsRequest]
    }
  }

  @js.native
  trait ListQuerySuggestionsBlockListsResponse extends js.Object {
    var BlockListSummaryItems: js.UndefOr[QuerySuggestionsBlockListSummaryItems]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListQuerySuggestionsBlockListsResponse {
    @inline
    def apply(
        BlockListSummaryItems: js.UndefOr[QuerySuggestionsBlockListSummaryItems] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListQuerySuggestionsBlockListsResponse = {
      val __obj = js.Dynamic.literal()
      BlockListSummaryItems.foreach(__v => __obj.updateDynamic("BlockListSummaryItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQuerySuggestionsBlockListsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListThesauriRequest extends js.Object {
    var IndexId: IndexId
    var MaxResults: js.UndefOr[MaxResultsIntegerForListThesauriRequest]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListThesauriRequest {
    @inline
    def apply(
        IndexId: IndexId,
        MaxResults: js.UndefOr[MaxResultsIntegerForListThesauriRequest] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListThesauriRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThesauriRequest]
    }
  }

  @js.native
  trait ListThesauriResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ThesaurusSummaryItems: js.UndefOr[ThesaurusSummaryItems]
  }

  object ListThesauriResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ThesaurusSummaryItems: js.UndefOr[ThesaurusSummaryItems] = js.undefined
    ): ListThesauriResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ThesaurusSummaryItems.foreach(__v => __obj.updateDynamic("ThesaurusSummaryItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThesauriResponse]
    }
  }

  /** The sub groups that belong to a group.
    */
  @js.native
  trait MemberGroup extends js.Object {
    var GroupId: GroupId
    var DataSourceId: js.UndefOr[DataSourceId]
  }

  object MemberGroup {
    @inline
    def apply(
        GroupId: GroupId,
        DataSourceId: js.UndefOr[DataSourceId] = js.undefined
    ): MemberGroup = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )

      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberGroup]
    }
  }

  /** The users that belong to a group.
    */
  @js.native
  trait MemberUser extends js.Object {
    var UserId: UserId
  }

  object MemberUser {
    @inline
    def apply(
        UserId: UserId
    ): MemberUser = {
      val __obj = js.Dynamic.literal(
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MemberUser]
    }
  }

  /** Provides configuration information for data sources that connect to OneDrive.
    */
  @js.native
  trait OneDriveConfiguration extends js.Object {
    var OneDriveUsers: OneDriveUsers
    var SecretArn: SecretArn
    var TenantDomain: TenantDomain
    var DisableLocalGroups: js.UndefOr[Boolean]
    var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
    var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
  }

  object OneDriveConfiguration {
    @inline
    def apply(
        OneDriveUsers: OneDriveUsers,
        SecretArn: SecretArn,
        TenantDomain: TenantDomain,
        DisableLocalGroups: js.UndefOr[Boolean] = js.undefined,
        ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined,
        InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
    ): OneDriveConfiguration = {
      val __obj = js.Dynamic.literal(
        "OneDriveUsers" -> OneDriveUsers.asInstanceOf[js.Any],
        "SecretArn" -> SecretArn.asInstanceOf[js.Any],
        "TenantDomain" -> TenantDomain.asInstanceOf[js.Any]
      )

      DisableLocalGroups.foreach(__v => __obj.updateDynamic("DisableLocalGroups")(__v.asInstanceOf[js.Any]))
      ExclusionPatterns.foreach(__v => __obj.updateDynamic("ExclusionPatterns")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
      InclusionPatterns.foreach(__v => __obj.updateDynamic("InclusionPatterns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OneDriveConfiguration]
    }
  }

  /** User accounts whose documents should be indexed.
    */
  @js.native
  trait OneDriveUsers extends js.Object {
    var OneDriveUserList: js.UndefOr[OneDriveUserList]
    var OneDriveUserS3Path: js.UndefOr[S3Path]
  }

  object OneDriveUsers {
    @inline
    def apply(
        OneDriveUserList: js.UndefOr[OneDriveUserList] = js.undefined,
        OneDriveUserS3Path: js.UndefOr[S3Path] = js.undefined
    ): OneDriveUsers = {
      val __obj = js.Dynamic.literal()
      OneDriveUserList.foreach(__v => __obj.updateDynamic("OneDriveUserList")(__v.asInstanceOf[js.Any]))
      OneDriveUserS3Path.foreach(__v => __obj.updateDynamic("OneDriveUserS3Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OneDriveUsers]
    }
  }

  /** Summary information for users or groups in your Amazon Web Services SSO identity source. This applies to users and groups with specific permissions that define their level of access to your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more information on creating a search application experience, see [[https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html|Building a search experience with no code]].
    */
  @js.native
  trait PersonasSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var EntityId: js.UndefOr[EntityId]
    var Persona: js.UndefOr[Persona]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object PersonasSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        EntityId: js.UndefOr[EntityId] = js.undefined,
        Persona: js.UndefOr[Persona] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): PersonasSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EntityId.foreach(__v => __obj.updateDynamic("EntityId")(__v.asInstanceOf[js.Any]))
      Persona.foreach(__v => __obj.updateDynamic("Persona")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PersonasSummary]
    }
  }

  /** Provides user and group information for document access filtering.
    */
  @js.native
  trait Principal extends js.Object {
    var Access: ReadAccessType
    var Name: PrincipalName
    var Type: PrincipalType
    var DataSourceId: js.UndefOr[DataSourceId]
  }

  object Principal {
    @inline
    def apply(
        Access: ReadAccessType,
        Name: PrincipalName,
        Type: PrincipalType,
        DataSourceId: js.UndefOr[DataSourceId] = js.undefined
    ): Principal = {
      val __obj = js.Dynamic.literal(
        "Access" -> Access.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Principal]
    }
  }

  /** Provides the configuration information for a web proxy to connect to website hosts.
    */
  @js.native
  trait ProxyConfiguration extends js.Object {
    var Host: Host
    var Port: Port
    var Credentials: js.UndefOr[SecretArn]
  }

  object ProxyConfiguration {
    @inline
    def apply(
        Host: Host,
        Port: Port,
        Credentials: js.UndefOr[SecretArn] = js.undefined
    ): ProxyConfiguration = {
      val __obj = js.Dynamic.literal(
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )

      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProxyConfiguration]
    }
  }

  @js.native
  trait PutPrincipalMappingRequest extends js.Object {
    var GroupId: GroupId
    var GroupMembers: GroupMembers
    var IndexId: IndexId
    var DataSourceId: js.UndefOr[DataSourceId]
    var OrderingId: js.UndefOr[PrincipalOrderingId]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object PutPrincipalMappingRequest {
    @inline
    def apply(
        GroupId: GroupId,
        GroupMembers: GroupMembers,
        IndexId: IndexId,
        DataSourceId: js.UndefOr[DataSourceId] = js.undefined,
        OrderingId: js.UndefOr[PrincipalOrderingId] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): PutPrincipalMappingRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "GroupMembers" -> GroupMembers.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      OrderingId.foreach(__v => __obj.updateDynamic("OrderingId")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPrincipalMappingRequest]
    }
  }

  @js.native
  trait QueryRequest extends js.Object {
    var IndexId: IndexId
    var QueryText: QueryText
    var AttributeFilter: js.UndefOr[AttributeFilter]
    var DocumentRelevanceOverrideConfigurations: js.UndefOr[DocumentRelevanceOverrideConfigurationList]
    var Facets: js.UndefOr[FacetList]
    var PageNumber: js.UndefOr[Int]
    var PageSize: js.UndefOr[Int]
    var QueryResultTypeFilter: js.UndefOr[QueryResultType]
    var RequestedDocumentAttributes: js.UndefOr[DocumentAttributeKeyList]
    var SortingConfiguration: js.UndefOr[SortingConfiguration]
    var UserContext: js.UndefOr[UserContext]
    var VisitorId: js.UndefOr[VisitorId]
  }

  object QueryRequest {
    @inline
    def apply(
        IndexId: IndexId,
        QueryText: QueryText,
        AttributeFilter: js.UndefOr[AttributeFilter] = js.undefined,
        DocumentRelevanceOverrideConfigurations: js.UndefOr[DocumentRelevanceOverrideConfigurationList] = js.undefined,
        Facets: js.UndefOr[FacetList] = js.undefined,
        PageNumber: js.UndefOr[Int] = js.undefined,
        PageSize: js.UndefOr[Int] = js.undefined,
        QueryResultTypeFilter: js.UndefOr[QueryResultType] = js.undefined,
        RequestedDocumentAttributes: js.UndefOr[DocumentAttributeKeyList] = js.undefined,
        SortingConfiguration: js.UndefOr[SortingConfiguration] = js.undefined,
        UserContext: js.UndefOr[UserContext] = js.undefined,
        VisitorId: js.UndefOr[VisitorId] = js.undefined
    ): QueryRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any],
        "QueryText" -> QueryText.asInstanceOf[js.Any]
      )

      AttributeFilter.foreach(__v => __obj.updateDynamic("AttributeFilter")(__v.asInstanceOf[js.Any]))
      DocumentRelevanceOverrideConfigurations.foreach(__v => __obj.updateDynamic("DocumentRelevanceOverrideConfigurations")(__v.asInstanceOf[js.Any]))
      Facets.foreach(__v => __obj.updateDynamic("Facets")(__v.asInstanceOf[js.Any]))
      PageNumber.foreach(__v => __obj.updateDynamic("PageNumber")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      QueryResultTypeFilter.foreach(__v => __obj.updateDynamic("QueryResultTypeFilter")(__v.asInstanceOf[js.Any]))
      RequestedDocumentAttributes.foreach(__v => __obj.updateDynamic("RequestedDocumentAttributes")(__v.asInstanceOf[js.Any]))
      SortingConfiguration.foreach(__v => __obj.updateDynamic("SortingConfiguration")(__v.asInstanceOf[js.Any]))
      UserContext.foreach(__v => __obj.updateDynamic("UserContext")(__v.asInstanceOf[js.Any]))
      VisitorId.foreach(__v => __obj.updateDynamic("VisitorId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryRequest]
    }
  }

  @js.native
  trait QueryResult extends js.Object {
    var FacetResults: js.UndefOr[FacetResultList]
    var QueryId: js.UndefOr[QueryId]
    var ResultItems: js.UndefOr[QueryResultItemList]
    var TotalNumberOfResults: js.UndefOr[Int]
  }

  object QueryResult {
    @inline
    def apply(
        FacetResults: js.UndefOr[FacetResultList] = js.undefined,
        QueryId: js.UndefOr[QueryId] = js.undefined,
        ResultItems: js.UndefOr[QueryResultItemList] = js.undefined,
        TotalNumberOfResults: js.UndefOr[Int] = js.undefined
    ): QueryResult = {
      val __obj = js.Dynamic.literal()
      FacetResults.foreach(__v => __obj.updateDynamic("FacetResults")(__v.asInstanceOf[js.Any]))
      QueryId.foreach(__v => __obj.updateDynamic("QueryId")(__v.asInstanceOf[js.Any]))
      ResultItems.foreach(__v => __obj.updateDynamic("ResultItems")(__v.asInstanceOf[js.Any]))
      TotalNumberOfResults.foreach(__v => __obj.updateDynamic("TotalNumberOfResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryResult]
    }
  }

  /** A single query result. A query result contains information about a document returned by the query. This includes the original location of the document, a list of attributes assigned to the document, and relevant text from the document that satisfies the query.
    */
  @js.native
  trait QueryResultItem extends js.Object {
    var AdditionalAttributes: js.UndefOr[AdditionalResultAttributeList]
    var DocumentAttributes: js.UndefOr[DocumentAttributeList]
    var DocumentExcerpt: js.UndefOr[TextWithHighlights]
    var DocumentId: js.UndefOr[DocumentId]
    var DocumentTitle: js.UndefOr[TextWithHighlights]
    var DocumentURI: js.UndefOr[Url]
    var FeedbackToken: js.UndefOr[FeedbackToken]
    var Id: js.UndefOr[ResultId]
    var ScoreAttributes: js.UndefOr[ScoreAttributes]
    var Type: js.UndefOr[QueryResultType]
  }

  object QueryResultItem {
    @inline
    def apply(
        AdditionalAttributes: js.UndefOr[AdditionalResultAttributeList] = js.undefined,
        DocumentAttributes: js.UndefOr[DocumentAttributeList] = js.undefined,
        DocumentExcerpt: js.UndefOr[TextWithHighlights] = js.undefined,
        DocumentId: js.UndefOr[DocumentId] = js.undefined,
        DocumentTitle: js.UndefOr[TextWithHighlights] = js.undefined,
        DocumentURI: js.UndefOr[Url] = js.undefined,
        FeedbackToken: js.UndefOr[FeedbackToken] = js.undefined,
        Id: js.UndefOr[ResultId] = js.undefined,
        ScoreAttributes: js.UndefOr[ScoreAttributes] = js.undefined,
        Type: js.UndefOr[QueryResultType] = js.undefined
    ): QueryResultItem = {
      val __obj = js.Dynamic.literal()
      AdditionalAttributes.foreach(__v => __obj.updateDynamic("AdditionalAttributes")(__v.asInstanceOf[js.Any]))
      DocumentAttributes.foreach(__v => __obj.updateDynamic("DocumentAttributes")(__v.asInstanceOf[js.Any]))
      DocumentExcerpt.foreach(__v => __obj.updateDynamic("DocumentExcerpt")(__v.asInstanceOf[js.Any]))
      DocumentId.foreach(__v => __obj.updateDynamic("DocumentId")(__v.asInstanceOf[js.Any]))
      DocumentTitle.foreach(__v => __obj.updateDynamic("DocumentTitle")(__v.asInstanceOf[js.Any]))
      DocumentURI.foreach(__v => __obj.updateDynamic("DocumentURI")(__v.asInstanceOf[js.Any]))
      FeedbackToken.foreach(__v => __obj.updateDynamic("FeedbackToken")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ScoreAttributes.foreach(__v => __obj.updateDynamic("ScoreAttributes")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryResultItem]
    }
  }

  /** Summary information on a query suggestions block list. This includes information on the block list ID, block list name, when the block list was created, when the block list was last updated, and the count of block words/phrases in the block list. For information on the current quota limits for block lists, see [[https://docs.aws.amazon.com/kendra/latest/dg/quotas.html|Quotas for Amazon Kendra]].
    */
  @js.native
  trait QuerySuggestionsBlockListSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Id: js.UndefOr[QuerySuggestionsBlockListId]
    var ItemCount: js.UndefOr[Int]
    var Name: js.UndefOr[QuerySuggestionsBlockListName]
    var Status: js.UndefOr[QuerySuggestionsBlockListStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object QuerySuggestionsBlockListSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[QuerySuggestionsBlockListId] = js.undefined,
        ItemCount: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[QuerySuggestionsBlockListName] = js.undefined,
        Status: js.UndefOr[QuerySuggestionsBlockListStatus] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): QuerySuggestionsBlockListSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ItemCount.foreach(__v => __obj.updateDynamic("ItemCount")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuerySuggestionsBlockListSummary]
    }
  }

  /** Provides information for manually tuning the relevance of a field in a search. When a query includes terms that match the field, the results are given a boost in the response based on these tuning parameters.
    */
  @js.native
  trait Relevance extends js.Object {
    var Duration: js.UndefOr[Duration]
    var Freshness: js.UndefOr[DocumentMetadataBoolean]
    var Importance: js.UndefOr[Importance]
    var RankOrder: js.UndefOr[Order]
    var ValueImportanceMap: js.UndefOr[ValueImportanceMap]
  }

  object Relevance {
    @inline
    def apply(
        Duration: js.UndefOr[Duration] = js.undefined,
        Freshness: js.UndefOr[DocumentMetadataBoolean] = js.undefined,
        Importance: js.UndefOr[Importance] = js.undefined,
        RankOrder: js.UndefOr[Order] = js.undefined,
        ValueImportanceMap: js.UndefOr[ValueImportanceMap] = js.undefined
    ): Relevance = {
      val __obj = js.Dynamic.literal()
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      Freshness.foreach(__v => __obj.updateDynamic("Freshness")(__v.asInstanceOf[js.Any]))
      Importance.foreach(__v => __obj.updateDynamic("Importance")(__v.asInstanceOf[js.Any]))
      RankOrder.foreach(__v => __obj.updateDynamic("RankOrder")(__v.asInstanceOf[js.Any]))
      ValueImportanceMap.foreach(__v => __obj.updateDynamic("ValueImportanceMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Relevance]
    }
  }

  /** Provides feedback on how relevant a document is to a search. Your application uses the <code>SubmitFeedback</code> operation to provide relevance information.
    */
  @js.native
  trait RelevanceFeedback extends js.Object {
    var RelevanceValue: RelevanceType
    var ResultId: ResultId
  }

  object RelevanceFeedback {
    @inline
    def apply(
        RelevanceValue: RelevanceType,
        ResultId: ResultId
    ): RelevanceFeedback = {
      val __obj = js.Dynamic.literal(
        "RelevanceValue" -> RelevanceValue.asInstanceOf[js.Any],
        "ResultId" -> ResultId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RelevanceFeedback]
    }
  }

  /** Provides configuration information for a data source to index documents in an Amazon S3 bucket.
    */
  @js.native
  trait S3DataSourceConfiguration extends js.Object {
    var BucketName: S3BucketName
    var AccessControlListConfiguration: js.UndefOr[AccessControlListConfiguration]
    var DocumentsMetadataConfiguration: js.UndefOr[DocumentsMetadataConfiguration]
    var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var InclusionPrefixes: js.UndefOr[DataSourceInclusionsExclusionsStrings]
  }

  object S3DataSourceConfiguration {
    @inline
    def apply(
        BucketName: S3BucketName,
        AccessControlListConfiguration: js.UndefOr[AccessControlListConfiguration] = js.undefined,
        DocumentsMetadataConfiguration: js.UndefOr[DocumentsMetadataConfiguration] = js.undefined,
        ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        InclusionPrefixes: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
    ): S3DataSourceConfiguration = {
      val __obj = js.Dynamic.literal(
        "BucketName" -> BucketName.asInstanceOf[js.Any]
      )

      AccessControlListConfiguration.foreach(__v => __obj.updateDynamic("AccessControlListConfiguration")(__v.asInstanceOf[js.Any]))
      DocumentsMetadataConfiguration.foreach(__v => __obj.updateDynamic("DocumentsMetadataConfiguration")(__v.asInstanceOf[js.Any]))
      ExclusionPatterns.foreach(__v => __obj.updateDynamic("ExclusionPatterns")(__v.asInstanceOf[js.Any]))
      InclusionPatterns.foreach(__v => __obj.updateDynamic("InclusionPatterns")(__v.asInstanceOf[js.Any]))
      InclusionPrefixes.foreach(__v => __obj.updateDynamic("InclusionPrefixes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DataSourceConfiguration]
    }
  }

  /** Information required to find a specific file in an Amazon S3 bucket.
    */
  @js.native
  trait S3Path extends js.Object {
    var Bucket: S3BucketName
    var Key: S3ObjectKey
  }

  object S3Path {
    @inline
    def apply(
        Bucket: S3BucketName,
        Key: S3ObjectKey
    ): S3Path = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key" -> Key.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Path]
    }
  }

  /** Defines configuration for syncing a Salesforce chatter feed. The contents of the object comes from the Salesforce FeedItem table.
    */
  @js.native
  trait SalesforceChatterFeedConfiguration extends js.Object {
    var DocumentDataFieldName: DataSourceFieldName
    var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
    var IncludeFilterTypes: js.UndefOr[SalesforceChatterFeedIncludeFilterTypes]
  }

  object SalesforceChatterFeedConfiguration {
    @inline
    def apply(
        DocumentDataFieldName: DataSourceFieldName,
        DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined,
        FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined,
        IncludeFilterTypes: js.UndefOr[SalesforceChatterFeedIncludeFilterTypes] = js.undefined
    ): SalesforceChatterFeedConfiguration = {
      val __obj = js.Dynamic.literal(
        "DocumentDataFieldName" -> DocumentDataFieldName.asInstanceOf[js.Any]
      )

      DocumentTitleFieldName.foreach(__v => __obj.updateDynamic("DocumentTitleFieldName")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
      IncludeFilterTypes.foreach(__v => __obj.updateDynamic("IncludeFilterTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceChatterFeedConfiguration]
    }
  }

  /** Provides configuration information for connecting to a Salesforce data source.
    */
  @js.native
  trait SalesforceConfiguration extends js.Object {
    var SecretArn: SecretArn
    var ServerUrl: Url
    var ChatterFeedConfiguration: js.UndefOr[SalesforceChatterFeedConfiguration]
    var CrawlAttachments: js.UndefOr[Boolean]
    var ExcludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var KnowledgeArticleConfiguration: js.UndefOr[SalesforceKnowledgeArticleConfiguration]
    var StandardObjectAttachmentConfiguration: js.UndefOr[SalesforceStandardObjectAttachmentConfiguration]
    var StandardObjectConfigurations: js.UndefOr[SalesforceStandardObjectConfigurationList]
  }

  object SalesforceConfiguration {
    @inline
    def apply(
        SecretArn: SecretArn,
        ServerUrl: Url,
        ChatterFeedConfiguration: js.UndefOr[SalesforceChatterFeedConfiguration] = js.undefined,
        CrawlAttachments: js.UndefOr[Boolean] = js.undefined,
        ExcludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        KnowledgeArticleConfiguration: js.UndefOr[SalesforceKnowledgeArticleConfiguration] = js.undefined,
        StandardObjectAttachmentConfiguration: js.UndefOr[SalesforceStandardObjectAttachmentConfiguration] = js.undefined,
        StandardObjectConfigurations: js.UndefOr[SalesforceStandardObjectConfigurationList] = js.undefined
    ): SalesforceConfiguration = {
      val __obj = js.Dynamic.literal(
        "SecretArn" -> SecretArn.asInstanceOf[js.Any],
        "ServerUrl" -> ServerUrl.asInstanceOf[js.Any]
      )

      ChatterFeedConfiguration.foreach(__v => __obj.updateDynamic("ChatterFeedConfiguration")(__v.asInstanceOf[js.Any]))
      CrawlAttachments.foreach(__v => __obj.updateDynamic("CrawlAttachments")(__v.asInstanceOf[js.Any]))
      ExcludeAttachmentFilePatterns.foreach(__v => __obj.updateDynamic("ExcludeAttachmentFilePatterns")(__v.asInstanceOf[js.Any]))
      IncludeAttachmentFilePatterns.foreach(__v => __obj.updateDynamic("IncludeAttachmentFilePatterns")(__v.asInstanceOf[js.Any]))
      KnowledgeArticleConfiguration.foreach(__v => __obj.updateDynamic("KnowledgeArticleConfiguration")(__v.asInstanceOf[js.Any]))
      StandardObjectAttachmentConfiguration.foreach(__v => __obj.updateDynamic("StandardObjectAttachmentConfiguration")(__v.asInstanceOf[js.Any]))
      StandardObjectConfigurations.foreach(__v => __obj.updateDynamic("StandardObjectConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceConfiguration]
    }
  }

  /** Provides configuration information for indexing Salesforce custom articles.
    */
  @js.native
  trait SalesforceCustomKnowledgeArticleTypeConfiguration extends js.Object {
    var DocumentDataFieldName: DataSourceFieldName
    var Name: SalesforceCustomKnowledgeArticleTypeName
    var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
  }

  object SalesforceCustomKnowledgeArticleTypeConfiguration {
    @inline
    def apply(
        DocumentDataFieldName: DataSourceFieldName,
        Name: SalesforceCustomKnowledgeArticleTypeName,
        DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined,
        FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
    ): SalesforceCustomKnowledgeArticleTypeConfiguration = {
      val __obj = js.Dynamic.literal(
        "DocumentDataFieldName" -> DocumentDataFieldName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DocumentTitleFieldName.foreach(__v => __obj.updateDynamic("DocumentTitleFieldName")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceCustomKnowledgeArticleTypeConfiguration]
    }
  }

  /** Specifies configuration information for the knowledge article types that Amazon Kendra indexes. Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge articles, or the custom fields of custom knowledge articles, but not both
    */
  @js.native
  trait SalesforceKnowledgeArticleConfiguration extends js.Object {
    var IncludedStates: SalesforceKnowledgeArticleStateList
    var CustomKnowledgeArticleTypeConfigurations: js.UndefOr[SalesforceCustomKnowledgeArticleTypeConfigurationList]
    var StandardKnowledgeArticleTypeConfiguration: js.UndefOr[SalesforceStandardKnowledgeArticleTypeConfiguration]
  }

  object SalesforceKnowledgeArticleConfiguration {
    @inline
    def apply(
        IncludedStates: SalesforceKnowledgeArticleStateList,
        CustomKnowledgeArticleTypeConfigurations: js.UndefOr[SalesforceCustomKnowledgeArticleTypeConfigurationList] = js.undefined,
        StandardKnowledgeArticleTypeConfiguration: js.UndefOr[SalesforceStandardKnowledgeArticleTypeConfiguration] = js.undefined
    ): SalesforceKnowledgeArticleConfiguration = {
      val __obj = js.Dynamic.literal(
        "IncludedStates" -> IncludedStates.asInstanceOf[js.Any]
      )

      CustomKnowledgeArticleTypeConfigurations.foreach(__v => __obj.updateDynamic("CustomKnowledgeArticleTypeConfigurations")(__v.asInstanceOf[js.Any]))
      StandardKnowledgeArticleTypeConfiguration.foreach(__v => __obj.updateDynamic("StandardKnowledgeArticleTypeConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceKnowledgeArticleConfiguration]
    }
  }

  /** Provides configuration information for standard Salesforce knowledge articles.
    */
  @js.native
  trait SalesforceStandardKnowledgeArticleTypeConfiguration extends js.Object {
    var DocumentDataFieldName: DataSourceFieldName
    var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
  }

  object SalesforceStandardKnowledgeArticleTypeConfiguration {
    @inline
    def apply(
        DocumentDataFieldName: DataSourceFieldName,
        DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined,
        FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
    ): SalesforceStandardKnowledgeArticleTypeConfiguration = {
      val __obj = js.Dynamic.literal(
        "DocumentDataFieldName" -> DocumentDataFieldName.asInstanceOf[js.Any]
      )

      DocumentTitleFieldName.foreach(__v => __obj.updateDynamic("DocumentTitleFieldName")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceStandardKnowledgeArticleTypeConfiguration]
    }
  }

  /** Provides configuration information for processing attachments to Salesforce standard objects.
    */
  @js.native
  trait SalesforceStandardObjectAttachmentConfiguration extends js.Object {
    var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
  }

  object SalesforceStandardObjectAttachmentConfiguration {
    @inline
    def apply(
        DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined,
        FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
    ): SalesforceStandardObjectAttachmentConfiguration = {
      val __obj = js.Dynamic.literal()
      DocumentTitleFieldName.foreach(__v => __obj.updateDynamic("DocumentTitleFieldName")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceStandardObjectAttachmentConfiguration]
    }
  }

  /** Specifies configuration information for indexing a single standard object.
    */
  @js.native
  trait SalesforceStandardObjectConfiguration extends js.Object {
    var DocumentDataFieldName: DataSourceFieldName
    var Name: SalesforceStandardObjectName
    var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
  }

  object SalesforceStandardObjectConfiguration {
    @inline
    def apply(
        DocumentDataFieldName: DataSourceFieldName,
        Name: SalesforceStandardObjectName,
        DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined,
        FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
    ): SalesforceStandardObjectConfiguration = {
      val __obj = js.Dynamic.literal(
        "DocumentDataFieldName" -> DocumentDataFieldName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DocumentTitleFieldName.foreach(__v => __obj.updateDynamic("DocumentTitleFieldName")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceStandardObjectConfiguration]
    }
  }

  /** Provides a relative ranking that indicates how confident Amazon Kendra is that the response matches the query.
    */
  @js.native
  trait ScoreAttributes extends js.Object {
    var ScoreConfidence: js.UndefOr[ScoreConfidence]
  }

  object ScoreAttributes {
    @inline
    def apply(
        ScoreConfidence: js.UndefOr[ScoreConfidence] = js.undefined
    ): ScoreAttributes = {
      val __obj = js.Dynamic.literal()
      ScoreConfidence.foreach(__v => __obj.updateDynamic("ScoreConfidence")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScoreAttributes]
    }
  }

  /** Provides information about how a custom index field is used during a search.
    */
  @js.native
  trait Search extends js.Object {
    var Displayable: js.UndefOr[Boolean]
    var Facetable: js.UndefOr[Boolean]
    var Searchable: js.UndefOr[Boolean]
    var Sortable: js.UndefOr[Boolean]
  }

  object Search {
    @inline
    def apply(
        Displayable: js.UndefOr[Boolean] = js.undefined,
        Facetable: js.UndefOr[Boolean] = js.undefined,
        Searchable: js.UndefOr[Boolean] = js.undefined,
        Sortable: js.UndefOr[Boolean] = js.undefined
    ): Search = {
      val __obj = js.Dynamic.literal()
      Displayable.foreach(__v => __obj.updateDynamic("Displayable")(__v.asInstanceOf[js.Any]))
      Facetable.foreach(__v => __obj.updateDynamic("Facetable")(__v.asInstanceOf[js.Any]))
      Searchable.foreach(__v => __obj.updateDynamic("Searchable")(__v.asInstanceOf[js.Any]))
      Sortable.foreach(__v => __obj.updateDynamic("Sortable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Search]
    }
  }

  /** Provides the configuration information of the seed or starting point URLs to crawl. <i>When selecting websites to index, you must adhere to the [[https://aws.amazon.com/aup/|Amazon Acceptable Use Policy]] and all other Amazon terms. Remember that you must only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have authorization to index.</i>
    */
  @js.native
  trait SeedUrlConfiguration extends js.Object {
    var SeedUrls: SeedUrlList
    var WebCrawlerMode: js.UndefOr[WebCrawlerMode]
  }

  object SeedUrlConfiguration {
    @inline
    def apply(
        SeedUrls: SeedUrlList,
        WebCrawlerMode: js.UndefOr[WebCrawlerMode] = js.undefined
    ): SeedUrlConfiguration = {
      val __obj = js.Dynamic.literal(
        "SeedUrls" -> SeedUrls.asInstanceOf[js.Any]
      )

      WebCrawlerMode.foreach(__v => __obj.updateDynamic("WebCrawlerMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SeedUrlConfiguration]
    }
  }

  /** Provides the identifier of the KMScustomer master key (CMK) used to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support asymmetric CMKs.
    */
  @js.native
  trait ServerSideEncryptionConfiguration extends js.Object {
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object ServerSideEncryptionConfiguration {
    @inline
    def apply(
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): ServerSideEncryptionConfiguration = {
      val __obj = js.Dynamic.literal()
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerSideEncryptionConfiguration]
    }
  }

  /** Provides configuration information required to connect to a ServiceNow data source.
    */
  @js.native
  trait ServiceNowConfiguration extends js.Object {
    var HostUrl: ServiceNowHostUrl
    var SecretArn: SecretArn
    var ServiceNowBuildVersion: ServiceNowBuildVersionType
    var AuthenticationType: js.UndefOr[ServiceNowAuthenticationType]
    var KnowledgeArticleConfiguration: js.UndefOr[ServiceNowKnowledgeArticleConfiguration]
    var ServiceCatalogConfiguration: js.UndefOr[ServiceNowServiceCatalogConfiguration]
  }

  object ServiceNowConfiguration {
    @inline
    def apply(
        HostUrl: ServiceNowHostUrl,
        SecretArn: SecretArn,
        ServiceNowBuildVersion: ServiceNowBuildVersionType,
        AuthenticationType: js.UndefOr[ServiceNowAuthenticationType] = js.undefined,
        KnowledgeArticleConfiguration: js.UndefOr[ServiceNowKnowledgeArticleConfiguration] = js.undefined,
        ServiceCatalogConfiguration: js.UndefOr[ServiceNowServiceCatalogConfiguration] = js.undefined
    ): ServiceNowConfiguration = {
      val __obj = js.Dynamic.literal(
        "HostUrl" -> HostUrl.asInstanceOf[js.Any],
        "SecretArn" -> SecretArn.asInstanceOf[js.Any],
        "ServiceNowBuildVersion" -> ServiceNowBuildVersion.asInstanceOf[js.Any]
      )

      AuthenticationType.foreach(__v => __obj.updateDynamic("AuthenticationType")(__v.asInstanceOf[js.Any]))
      KnowledgeArticleConfiguration.foreach(__v => __obj.updateDynamic("KnowledgeArticleConfiguration")(__v.asInstanceOf[js.Any]))
      ServiceCatalogConfiguration.foreach(__v => __obj.updateDynamic("ServiceCatalogConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceNowConfiguration]
    }
  }

  /** Provides configuration information for crawling knowledge articles in the ServiceNow site.
    */
  @js.native
  trait ServiceNowKnowledgeArticleConfiguration extends js.Object {
    var DocumentDataFieldName: DataSourceFieldName
    var CrawlAttachments: js.UndefOr[Boolean]
    var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName]
    var ExcludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
    var FilterQuery: js.UndefOr[ServiceNowKnowledgeArticleFilterQuery]
    var IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
  }

  object ServiceNowKnowledgeArticleConfiguration {
    @inline
    def apply(
        DocumentDataFieldName: DataSourceFieldName,
        CrawlAttachments: js.UndefOr[Boolean] = js.undefined,
        DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined,
        ExcludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined,
        FilterQuery: js.UndefOr[ServiceNowKnowledgeArticleFilterQuery] = js.undefined,
        IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
    ): ServiceNowKnowledgeArticleConfiguration = {
      val __obj = js.Dynamic.literal(
        "DocumentDataFieldName" -> DocumentDataFieldName.asInstanceOf[js.Any]
      )

      CrawlAttachments.foreach(__v => __obj.updateDynamic("CrawlAttachments")(__v.asInstanceOf[js.Any]))
      DocumentTitleFieldName.foreach(__v => __obj.updateDynamic("DocumentTitleFieldName")(__v.asInstanceOf[js.Any]))
      ExcludeAttachmentFilePatterns.foreach(__v => __obj.updateDynamic("ExcludeAttachmentFilePatterns")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
      FilterQuery.foreach(__v => __obj.updateDynamic("FilterQuery")(__v.asInstanceOf[js.Any]))
      IncludeAttachmentFilePatterns.foreach(__v => __obj.updateDynamic("IncludeAttachmentFilePatterns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceNowKnowledgeArticleConfiguration]
    }
  }

  /** Provides configuration information for crawling service catalog items in the ServiceNow site
    */
  @js.native
  trait ServiceNowServiceCatalogConfiguration extends js.Object {
    var DocumentDataFieldName: DataSourceFieldName
    var CrawlAttachments: js.UndefOr[Boolean]
    var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName]
    var ExcludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
    var IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
  }

  object ServiceNowServiceCatalogConfiguration {
    @inline
    def apply(
        DocumentDataFieldName: DataSourceFieldName,
        CrawlAttachments: js.UndefOr[Boolean] = js.undefined,
        DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined,
        ExcludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined,
        IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
    ): ServiceNowServiceCatalogConfiguration = {
      val __obj = js.Dynamic.literal(
        "DocumentDataFieldName" -> DocumentDataFieldName.asInstanceOf[js.Any]
      )

      CrawlAttachments.foreach(__v => __obj.updateDynamic("CrawlAttachments")(__v.asInstanceOf[js.Any]))
      DocumentTitleFieldName.foreach(__v => __obj.updateDynamic("DocumentTitleFieldName")(__v.asInstanceOf[js.Any]))
      ExcludeAttachmentFilePatterns.foreach(__v => __obj.updateDynamic("ExcludeAttachmentFilePatterns")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
      IncludeAttachmentFilePatterns.foreach(__v => __obj.updateDynamic("IncludeAttachmentFilePatterns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceNowServiceCatalogConfiguration]
    }
  }

  /** Provides configuration information for connecting to a Microsoft SharePoint data source.
    */
  @js.native
  trait SharePointConfiguration extends js.Object {
    var SecretArn: SecretArn
    var SharePointVersion: SharePointVersion
    var Urls: SharePointUrlList
    var CrawlAttachments: js.UndefOr[Boolean]
    var DisableLocalGroups: js.UndefOr[Boolean]
    var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName]
    var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
    var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var SslCertificateS3Path: js.UndefOr[S3Path]
    var UseChangeLog: js.UndefOr[Boolean]
    var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration]
  }

  object SharePointConfiguration {
    @inline
    def apply(
        SecretArn: SecretArn,
        SharePointVersion: SharePointVersion,
        Urls: SharePointUrlList,
        CrawlAttachments: js.UndefOr[Boolean] = js.undefined,
        DisableLocalGroups: js.UndefOr[Boolean] = js.undefined,
        DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined,
        ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined,
        InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        SslCertificateS3Path: js.UndefOr[S3Path] = js.undefined,
        UseChangeLog: js.UndefOr[Boolean] = js.undefined,
        VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
    ): SharePointConfiguration = {
      val __obj = js.Dynamic.literal(
        "SecretArn" -> SecretArn.asInstanceOf[js.Any],
        "SharePointVersion" -> SharePointVersion.asInstanceOf[js.Any],
        "Urls" -> Urls.asInstanceOf[js.Any]
      )

      CrawlAttachments.foreach(__v => __obj.updateDynamic("CrawlAttachments")(__v.asInstanceOf[js.Any]))
      DisableLocalGroups.foreach(__v => __obj.updateDynamic("DisableLocalGroups")(__v.asInstanceOf[js.Any]))
      DocumentTitleFieldName.foreach(__v => __obj.updateDynamic("DocumentTitleFieldName")(__v.asInstanceOf[js.Any]))
      ExclusionPatterns.foreach(__v => __obj.updateDynamic("ExclusionPatterns")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
      InclusionPatterns.foreach(__v => __obj.updateDynamic("InclusionPatterns")(__v.asInstanceOf[js.Any]))
      SslCertificateS3Path.foreach(__v => __obj.updateDynamic("SslCertificateS3Path")(__v.asInstanceOf[js.Any]))
      UseChangeLog.foreach(__v => __obj.updateDynamic("UseChangeLog")(__v.asInstanceOf[js.Any]))
      VpcConfiguration.foreach(__v => __obj.updateDynamic("VpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SharePointConfiguration]
    }
  }

  /** Provides the configuration information of the sitemap URLs to crawl. <i>When selecting websites to index, you must adhere to the [[https://aws.amazon.com/aup/|Amazon Acceptable Use Policy]] and all other Amazon terms. Remember that you must only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have authorization to index.</i>
    */
  @js.native
  trait SiteMapsConfiguration extends js.Object {
    var SiteMaps: SiteMapsList
  }

  object SiteMapsConfiguration {
    @inline
    def apply(
        SiteMaps: SiteMapsList
    ): SiteMapsConfiguration = {
      val __obj = js.Dynamic.literal(
        "SiteMaps" -> SiteMaps.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SiteMapsConfiguration]
    }
  }

  /** Specifies the document attribute to use to sort the response to a Amazon Kendra query. You can specify a single attribute for sorting. The attribute must have the <code>Sortable</code> flag set to <code>true</code>, otherwise Amazon Kendra returns an exception. You can sort attributes of the following types. * Date value * Long value * String value You can't sort attributes of the following type. * String list value
    */
  @js.native
  trait SortingConfiguration extends js.Object {
    var DocumentAttributeKey: DocumentAttributeKey
    var SortOrder: SortOrder
  }

  object SortingConfiguration {
    @inline
    def apply(
        DocumentAttributeKey: DocumentAttributeKey,
        SortOrder: SortOrder
    ): SortingConfiguration = {
      val __obj = js.Dynamic.literal(
        "DocumentAttributeKey" -> DocumentAttributeKey.asInstanceOf[js.Any],
        "SortOrder" -> SortOrder.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SortingConfiguration]
    }
  }

  /** Provides information that configures Amazon Kendra to use a SQL database.
    */
  @js.native
  trait SqlConfiguration extends js.Object {
    var QueryIdentifiersEnclosingOption: js.UndefOr[QueryIdentifiersEnclosingOption]
  }

  object SqlConfiguration {
    @inline
    def apply(
        QueryIdentifiersEnclosingOption: js.UndefOr[QueryIdentifiersEnclosingOption] = js.undefined
    ): SqlConfiguration = {
      val __obj = js.Dynamic.literal()
      QueryIdentifiersEnclosingOption.foreach(__v => __obj.updateDynamic("QueryIdentifiersEnclosingOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqlConfiguration]
    }
  }

  @js.native
  trait StartDataSourceSyncJobRequest extends js.Object {
    var Id: DataSourceId
    var IndexId: IndexId
  }

  object StartDataSourceSyncJobRequest {
    @inline
    def apply(
        Id: DataSourceId,
        IndexId: IndexId
    ): StartDataSourceSyncJobRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartDataSourceSyncJobRequest]
    }
  }

  @js.native
  trait StartDataSourceSyncJobResponse extends js.Object {
    var ExecutionId: js.UndefOr[String]
  }

  object StartDataSourceSyncJobResponse {
    @inline
    def apply(
        ExecutionId: js.UndefOr[String] = js.undefined
    ): StartDataSourceSyncJobResponse = {
      val __obj = js.Dynamic.literal()
      ExecutionId.foreach(__v => __obj.updateDynamic("ExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDataSourceSyncJobResponse]
    }
  }

  /** Provides information about the status of documents submitted for indexing.
    */
  @js.native
  trait Status extends js.Object {
    var DocumentId: js.UndefOr[DocumentId]
    var DocumentStatus: js.UndefOr[DocumentStatus]
    var FailureCode: js.UndefOr[String]
    var FailureReason: js.UndefOr[String]
  }

  object Status {
    @inline
    def apply(
        DocumentId: js.UndefOr[DocumentId] = js.undefined,
        DocumentStatus: js.UndefOr[DocumentStatus] = js.undefined,
        FailureCode: js.UndefOr[String] = js.undefined,
        FailureReason: js.UndefOr[String] = js.undefined
    ): Status = {
      val __obj = js.Dynamic.literal()
      DocumentId.foreach(__v => __obj.updateDynamic("DocumentId")(__v.asInstanceOf[js.Any]))
      DocumentStatus.foreach(__v => __obj.updateDynamic("DocumentStatus")(__v.asInstanceOf[js.Any]))
      FailureCode.foreach(__v => __obj.updateDynamic("FailureCode")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Status]
    }
  }

  @js.native
  trait StopDataSourceSyncJobRequest extends js.Object {
    var Id: DataSourceId
    var IndexId: IndexId
  }

  object StopDataSourceSyncJobRequest {
    @inline
    def apply(
        Id: DataSourceId,
        IndexId: IndexId
    ): StopDataSourceSyncJobRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopDataSourceSyncJobRequest]
    }
  }

  @js.native
  trait SubmitFeedbackRequest extends js.Object {
    var IndexId: IndexId
    var QueryId: QueryId
    var ClickFeedbackItems: js.UndefOr[ClickFeedbackList]
    var RelevanceFeedbackItems: js.UndefOr[RelevanceFeedbackList]
  }

  object SubmitFeedbackRequest {
    @inline
    def apply(
        IndexId: IndexId,
        QueryId: QueryId,
        ClickFeedbackItems: js.UndefOr[ClickFeedbackList] = js.undefined,
        RelevanceFeedbackItems: js.UndefOr[RelevanceFeedbackList] = js.undefined
    ): SubmitFeedbackRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any],
        "QueryId" -> QueryId.asInstanceOf[js.Any]
      )

      ClickFeedbackItems.foreach(__v => __obj.updateDynamic("ClickFeedbackItems")(__v.asInstanceOf[js.Any]))
      RelevanceFeedbackItems.foreach(__v => __obj.updateDynamic("RelevanceFeedbackItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubmitFeedbackRequest]
    }
  }

  /** A single query suggestion.
    */
  @js.native
  trait Suggestion extends js.Object {
    var Id: js.UndefOr[ResultId]
    var Value: js.UndefOr[SuggestionValue]
  }

  object Suggestion {
    @inline
    def apply(
        Id: js.UndefOr[ResultId] = js.undefined,
        Value: js.UndefOr[SuggestionValue] = js.undefined
    ): Suggestion = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Suggestion]
    }
  }

  /** The text highlights for a single query suggestion.
    */
  @js.native
  trait SuggestionHighlight extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
  }

  object SuggestionHighlight {
    @inline
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined
    ): SuggestionHighlight = {
      val __obj = js.Dynamic.literal()
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuggestionHighlight]
    }
  }

  /** Provides text and information about where to highlight the query suggestion text.
    */
  @js.native
  trait SuggestionTextWithHighlights extends js.Object {
    var Highlights: js.UndefOr[SuggestionHighlightList]
    var Text: js.UndefOr[String]
  }

  object SuggestionTextWithHighlights {
    @inline
    def apply(
        Highlights: js.UndefOr[SuggestionHighlightList] = js.undefined,
        Text: js.UndefOr[String] = js.undefined
    ): SuggestionTextWithHighlights = {
      val __obj = js.Dynamic.literal()
      Highlights.foreach(__v => __obj.updateDynamic("Highlights")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuggestionTextWithHighlights]
    }
  }

  /** The <code>SuggestionTextWithHighlights</code> structure information.
    */
  @js.native
  trait SuggestionValue extends js.Object {
    var Text: js.UndefOr[SuggestionTextWithHighlights]
  }

  object SuggestionValue {
    @inline
    def apply(
        Text: js.UndefOr[SuggestionTextWithHighlights] = js.undefined
    ): SuggestionValue = {
      val __obj = js.Dynamic.literal()
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuggestionValue]
    }
  }

  /** A list of key/value pairs that identify an index, FAQ, or data source. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + - @.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** Provides information about text documents indexed in an index.
    */
  @js.native
  trait TextDocumentStatistics extends js.Object {
    var IndexedTextBytes: IndexedTextBytes
    var IndexedTextDocumentsCount: IndexedTextDocumentsCount
  }

  object TextDocumentStatistics {
    @inline
    def apply(
        IndexedTextBytes: IndexedTextBytes,
        IndexedTextDocumentsCount: IndexedTextDocumentsCount
    ): TextDocumentStatistics = {
      val __obj = js.Dynamic.literal(
        "IndexedTextBytes" -> IndexedTextBytes.asInstanceOf[js.Any],
        "IndexedTextDocumentsCount" -> IndexedTextDocumentsCount.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TextDocumentStatistics]
    }
  }

  /** Provides text and information about where to highlight the text.
    */
  @js.native
  trait TextWithHighlights extends js.Object {
    var Highlights: js.UndefOr[HighlightList]
    var Text: js.UndefOr[String]
  }

  object TextWithHighlights {
    @inline
    def apply(
        Highlights: js.UndefOr[HighlightList] = js.undefined,
        Text: js.UndefOr[String] = js.undefined
    ): TextWithHighlights = {
      val __obj = js.Dynamic.literal()
      Highlights.foreach(__v => __obj.updateDynamic("Highlights")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextWithHighlights]
    }
  }

  /** An array of summary information for a thesaurus or multiple thesauri.
    */
  @js.native
  trait ThesaurusSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Id: js.UndefOr[ThesaurusId]
    var Name: js.UndefOr[ThesaurusName]
    var Status: js.UndefOr[ThesaurusStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object ThesaurusSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[ThesaurusId] = js.undefined,
        Name: js.UndefOr[ThesaurusName] = js.undefined,
        Status: js.UndefOr[ThesaurusStatus] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): ThesaurusSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThesaurusSummary]
    }
  }

  /** Provides a range of time.
    */
  @js.native
  trait TimeRange extends js.Object {
    var EndTime: js.UndefOr[Timestamp]
    var StartTime: js.UndefOr[Timestamp]
  }

  object TimeRange {
    @inline
    def apply(
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): TimeRange = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeRange]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDataSourceRequest extends js.Object {
    var Id: DataSourceId
    var IndexId: IndexId
    var Configuration: js.UndefOr[DataSourceConfiguration]
    var CustomDocumentEnrichmentConfiguration: js.UndefOr[CustomDocumentEnrichmentConfiguration]
    var Description: js.UndefOr[Description]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Name: js.UndefOr[DataSourceName]
    var RoleArn: js.UndefOr[RoleArn]
    var Schedule: js.UndefOr[ScanSchedule]
  }

  object UpdateDataSourceRequest {
    @inline
    def apply(
        Id: DataSourceId,
        IndexId: IndexId,
        Configuration: js.UndefOr[DataSourceConfiguration] = js.undefined,
        CustomDocumentEnrichmentConfiguration: js.UndefOr[CustomDocumentEnrichmentConfiguration] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Name: js.UndefOr[DataSourceName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        Schedule: js.UndefOr[ScanSchedule] = js.undefined
    ): UpdateDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CustomDocumentEnrichmentConfiguration.foreach(__v => __obj.updateDynamic("CustomDocumentEnrichmentConfiguration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSourceRequest]
    }
  }

  @js.native
  trait UpdateExperienceRequest extends js.Object {
    var Id: ExperienceId
    var IndexId: IndexId
    var Configuration: js.UndefOr[ExperienceConfiguration]
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[ExperienceName]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object UpdateExperienceRequest {
    @inline
    def apply(
        Id: ExperienceId,
        IndexId: IndexId,
        Configuration: js.UndefOr[ExperienceConfiguration] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[ExperienceName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateExperienceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateExperienceRequest]
    }
  }

  @js.native
  trait UpdateIndexRequest extends js.Object {
    var Id: IndexId
    var CapacityUnits: js.UndefOr[CapacityUnitsConfiguration]
    var Description: js.UndefOr[Description]
    var DocumentMetadataConfigurationUpdates: js.UndefOr[DocumentMetadataConfigurationList]
    var Name: js.UndefOr[IndexName]
    var RoleArn: js.UndefOr[RoleArn]
    var UserContextPolicy: js.UndefOr[UserContextPolicy]
    var UserGroupResolutionConfiguration: js.UndefOr[UserGroupResolutionConfiguration]
    var UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList]
  }

  object UpdateIndexRequest {
    @inline
    def apply(
        Id: IndexId,
        CapacityUnits: js.UndefOr[CapacityUnitsConfiguration] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DocumentMetadataConfigurationUpdates: js.UndefOr[DocumentMetadataConfigurationList] = js.undefined,
        Name: js.UndefOr[IndexName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        UserContextPolicy: js.UndefOr[UserContextPolicy] = js.undefined,
        UserGroupResolutionConfiguration: js.UndefOr[UserGroupResolutionConfiguration] = js.undefined,
        UserTokenConfigurations: js.UndefOr[UserTokenConfigurationList] = js.undefined
    ): UpdateIndexRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      CapacityUnits.foreach(__v => __obj.updateDynamic("CapacityUnits")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DocumentMetadataConfigurationUpdates.foreach(__v => __obj.updateDynamic("DocumentMetadataConfigurationUpdates")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      UserContextPolicy.foreach(__v => __obj.updateDynamic("UserContextPolicy")(__v.asInstanceOf[js.Any]))
      UserGroupResolutionConfiguration.foreach(__v => __obj.updateDynamic("UserGroupResolutionConfiguration")(__v.asInstanceOf[js.Any]))
      UserTokenConfigurations.foreach(__v => __obj.updateDynamic("UserTokenConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIndexRequest]
    }
  }

  @js.native
  trait UpdateQuerySuggestionsBlockListRequest extends js.Object {
    var Id: QuerySuggestionsBlockListId
    var IndexId: IndexId
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[QuerySuggestionsBlockListName]
    var RoleArn: js.UndefOr[RoleArn]
    var SourceS3Path: js.UndefOr[S3Path]
  }

  object UpdateQuerySuggestionsBlockListRequest {
    @inline
    def apply(
        Id: QuerySuggestionsBlockListId,
        IndexId: IndexId,
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[QuerySuggestionsBlockListName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        SourceS3Path: js.UndefOr[S3Path] = js.undefined
    ): UpdateQuerySuggestionsBlockListRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SourceS3Path.foreach(__v => __obj.updateDynamic("SourceS3Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateQuerySuggestionsBlockListRequest]
    }
  }

  @js.native
  trait UpdateQuerySuggestionsConfigRequest extends js.Object {
    var IndexId: IndexId
    var IncludeQueriesWithoutUserInformation: js.UndefOr[ObjectBoolean]
    var MinimumNumberOfQueryingUsers: js.UndefOr[MinimumNumberOfQueryingUsers]
    var MinimumQueryCount: js.UndefOr[MinimumQueryCount]
    var Mode: js.UndefOr[Mode]
    var QueryLogLookBackWindowInDays: js.UndefOr[Int]
  }

  object UpdateQuerySuggestionsConfigRequest {
    @inline
    def apply(
        IndexId: IndexId,
        IncludeQueriesWithoutUserInformation: js.UndefOr[ObjectBoolean] = js.undefined,
        MinimumNumberOfQueryingUsers: js.UndefOr[MinimumNumberOfQueryingUsers] = js.undefined,
        MinimumQueryCount: js.UndefOr[MinimumQueryCount] = js.undefined,
        Mode: js.UndefOr[Mode] = js.undefined,
        QueryLogLookBackWindowInDays: js.UndefOr[Int] = js.undefined
    ): UpdateQuerySuggestionsConfigRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      IncludeQueriesWithoutUserInformation.foreach(__v => __obj.updateDynamic("IncludeQueriesWithoutUserInformation")(__v.asInstanceOf[js.Any]))
      MinimumNumberOfQueryingUsers.foreach(__v => __obj.updateDynamic("MinimumNumberOfQueryingUsers")(__v.asInstanceOf[js.Any]))
      MinimumQueryCount.foreach(__v => __obj.updateDynamic("MinimumQueryCount")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      QueryLogLookBackWindowInDays.foreach(__v => __obj.updateDynamic("QueryLogLookBackWindowInDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateQuerySuggestionsConfigRequest]
    }
  }

  @js.native
  trait UpdateThesaurusRequest extends js.Object {
    var Id: ThesaurusId
    var IndexId: IndexId
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[ThesaurusName]
    var RoleArn: js.UndefOr[RoleArn]
    var SourceS3Path: js.UndefOr[S3Path]
  }

  object UpdateThesaurusRequest {
    @inline
    def apply(
        Id: ThesaurusId,
        IndexId: IndexId,
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[ThesaurusName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        SourceS3Path: js.UndefOr[S3Path] = js.undefined
    ): UpdateThesaurusRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SourceS3Path.foreach(__v => __obj.updateDynamic("SourceS3Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThesaurusRequest]
    }
  }

  /** Provides the configuration information of the URLs to crawl. You can only crawl websites that use the secure communication protocol, Hypertext Transfer Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the website is blocked from crawling. <i>When selecting websites to index, you must adhere to the [[https://aws.amazon.com/aup/|Amazon Acceptable Use Policy]] and all other Amazon terms. Remember that you must only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have authorization to index.</i>
    */
  @js.native
  trait Urls extends js.Object {
    var SeedUrlConfiguration: js.UndefOr[SeedUrlConfiguration]
    var SiteMapsConfiguration: js.UndefOr[SiteMapsConfiguration]
  }

  object Urls {
    @inline
    def apply(
        SeedUrlConfiguration: js.UndefOr[SeedUrlConfiguration] = js.undefined,
        SiteMapsConfiguration: js.UndefOr[SiteMapsConfiguration] = js.undefined
    ): Urls = {
      val __obj = js.Dynamic.literal()
      SeedUrlConfiguration.foreach(__v => __obj.updateDynamic("SeedUrlConfiguration")(__v.asInstanceOf[js.Any]))
      SiteMapsConfiguration.foreach(__v => __obj.updateDynamic("SiteMapsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Urls]
    }
  }

  /** Provides information about the user context for an Amazon Kendra index. This is used for filtering search results for different users based on their access to documents. You provide one of the following: * User token * User ID, the groups the user belongs to, and any data sources the groups can access. If you provide both, an exception is thrown.
    */
  @js.native
  trait UserContext extends js.Object {
    var DataSourceGroups: js.UndefOr[DataSourceGroups]
    var Groups: js.UndefOr[Groups]
    var Token: js.UndefOr[Token]
    var UserId: js.UndefOr[PrincipalName]
  }

  object UserContext {
    @inline
    def apply(
        DataSourceGroups: js.UndefOr[DataSourceGroups] = js.undefined,
        Groups: js.UndefOr[Groups] = js.undefined,
        Token: js.UndefOr[Token] = js.undefined,
        UserId: js.UndefOr[PrincipalName] = js.undefined
    ): UserContext = {
      val __obj = js.Dynamic.literal()
      DataSourceGroups.foreach(__v => __obj.updateDynamic("DataSourceGroups")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserContext]
    }
  }

  /** Provides the configuration information to fetch access levels of groups and users from an Amazon Web Services Single Sign On identity source. This is useful for setting up user context filtering, where Amazon Kendra filters search results for different users based on their group's access to documents. You can also map your users to their groups for user context filtering using the [[https://docs.aws.amazon.com/kendra/latest/dg/API_PutPrincipalMapping.html|PutPrincipalMapping operation]]. To set up an Amazon Web Services SSO identity source in the console to use with Amazon Kendra, see [[https://docs.aws.amazon.com/kendra/latest/dg/getting-started-aws-sso.html|Getting started with an Amazon Web Services SSO identity source]]. You must also grant the required permissions to use Amazon Web Services SSO with Amazon Kendra. For more information, see [[https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html#iam-roles-aws-sso|IAM roles for Amazon Web Services SSO]].
    */
  @js.native
  trait UserGroupResolutionConfiguration extends js.Object {
    var UserGroupResolutionMode: UserGroupResolutionMode
  }

  object UserGroupResolutionConfiguration {
    @inline
    def apply(
        UserGroupResolutionMode: UserGroupResolutionMode
    ): UserGroupResolutionConfiguration = {
      val __obj = js.Dynamic.literal(
        "UserGroupResolutionMode" -> UserGroupResolutionMode.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UserGroupResolutionConfiguration]
    }
  }

  /** Configuration information for the identifiers of your users.
    */
  @js.native
  trait UserIdentityConfiguration extends js.Object {
    var IdentityAttributeName: js.UndefOr[IdentityAttributeName]
  }

  object UserIdentityConfiguration {
    @inline
    def apply(
        IdentityAttributeName: js.UndefOr[IdentityAttributeName] = js.undefined
    ): UserIdentityConfiguration = {
      val __obj = js.Dynamic.literal()
      IdentityAttributeName.foreach(__v => __obj.updateDynamic("IdentityAttributeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserIdentityConfiguration]
    }
  }

  /** Provides configuration information for a token configuration.
    */
  @js.native
  trait UserTokenConfiguration extends js.Object {
    var JsonTokenTypeConfiguration: js.UndefOr[JsonTokenTypeConfiguration]
    var JwtTokenTypeConfiguration: js.UndefOr[JwtTokenTypeConfiguration]
  }

  object UserTokenConfiguration {
    @inline
    def apply(
        JsonTokenTypeConfiguration: js.UndefOr[JsonTokenTypeConfiguration] = js.undefined,
        JwtTokenTypeConfiguration: js.UndefOr[JwtTokenTypeConfiguration] = js.undefined
    ): UserTokenConfiguration = {
      val __obj = js.Dynamic.literal()
      JsonTokenTypeConfiguration.foreach(__v => __obj.updateDynamic("JsonTokenTypeConfiguration")(__v.asInstanceOf[js.Any]))
      JwtTokenTypeConfiguration.foreach(__v => __obj.updateDynamic("JwtTokenTypeConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserTokenConfiguration]
    }
  }

  /** Provides the configuration information required for Amazon Kendra Web Crawler.
    */
  @js.native
  trait WebCrawlerConfiguration extends js.Object {
    var Urls: Urls
    var AuthenticationConfiguration: js.UndefOr[AuthenticationConfiguration]
    var CrawlDepth: js.UndefOr[CrawlDepth]
    var MaxContentSizePerPageInMegaBytes: js.UndefOr[MaxContentSizePerPageInMegaBytes]
    var MaxLinksPerPage: js.UndefOr[MaxLinksPerPage]
    var MaxUrlsPerMinuteCrawlRate: js.UndefOr[MaxUrlsPerMinuteCrawlRate]
    var ProxyConfiguration: js.UndefOr[ProxyConfiguration]
    var UrlExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var UrlInclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
  }

  object WebCrawlerConfiguration {
    @inline
    def apply(
        Urls: Urls,
        AuthenticationConfiguration: js.UndefOr[AuthenticationConfiguration] = js.undefined,
        CrawlDepth: js.UndefOr[CrawlDepth] = js.undefined,
        MaxContentSizePerPageInMegaBytes: js.UndefOr[MaxContentSizePerPageInMegaBytes] = js.undefined,
        MaxLinksPerPage: js.UndefOr[MaxLinksPerPage] = js.undefined,
        MaxUrlsPerMinuteCrawlRate: js.UndefOr[MaxUrlsPerMinuteCrawlRate] = js.undefined,
        ProxyConfiguration: js.UndefOr[ProxyConfiguration] = js.undefined,
        UrlExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        UrlInclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
    ): WebCrawlerConfiguration = {
      val __obj = js.Dynamic.literal(
        "Urls" -> Urls.asInstanceOf[js.Any]
      )

      AuthenticationConfiguration.foreach(__v => __obj.updateDynamic("AuthenticationConfiguration")(__v.asInstanceOf[js.Any]))
      CrawlDepth.foreach(__v => __obj.updateDynamic("CrawlDepth")(__v.asInstanceOf[js.Any]))
      MaxContentSizePerPageInMegaBytes.foreach(__v => __obj.updateDynamic("MaxContentSizePerPageInMegaBytes")(__v.asInstanceOf[js.Any]))
      MaxLinksPerPage.foreach(__v => __obj.updateDynamic("MaxLinksPerPage")(__v.asInstanceOf[js.Any]))
      MaxUrlsPerMinuteCrawlRate.foreach(__v => __obj.updateDynamic("MaxUrlsPerMinuteCrawlRate")(__v.asInstanceOf[js.Any]))
      ProxyConfiguration.foreach(__v => __obj.updateDynamic("ProxyConfiguration")(__v.asInstanceOf[js.Any]))
      UrlExclusionPatterns.foreach(__v => __obj.updateDynamic("UrlExclusionPatterns")(__v.asInstanceOf[js.Any]))
      UrlInclusionPatterns.foreach(__v => __obj.updateDynamic("UrlInclusionPatterns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebCrawlerConfiguration]
    }
  }

  /** Provides the configuration information to connect to Amazon WorkDocs as your data source. Amazon WorkDocs connector is available in Oregon, North Virginia, Sydney, Singapore and Ireland regions.
    */
  @js.native
  trait WorkDocsConfiguration extends js.Object {
    var OrganizationId: OrganizationId
    var CrawlComments: js.UndefOr[Boolean]
    var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
    var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var UseChangeLog: js.UndefOr[Boolean]
  }

  object WorkDocsConfiguration {
    @inline
    def apply(
        OrganizationId: OrganizationId,
        CrawlComments: js.UndefOr[Boolean] = js.undefined,
        ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined,
        InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined,
        UseChangeLog: js.UndefOr[Boolean] = js.undefined
    ): WorkDocsConfiguration = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      CrawlComments.foreach(__v => __obj.updateDynamic("CrawlComments")(__v.asInstanceOf[js.Any]))
      ExclusionPatterns.foreach(__v => __obj.updateDynamic("ExclusionPatterns")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
      InclusionPatterns.foreach(__v => __obj.updateDynamic("InclusionPatterns")(__v.asInstanceOf[js.Any]))
      UseChangeLog.foreach(__v => __obj.updateDynamic("UseChangeLog")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkDocsConfiguration]
    }
  }
}
