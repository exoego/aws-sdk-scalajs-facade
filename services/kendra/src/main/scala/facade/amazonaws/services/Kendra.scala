package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object kendra {
  type AdditionalResultAttributeList = js.Array[AdditionalResultAttribute]
  type AmazonResourceName = String
  type AttributeFilterList = js.Array[AttributeFilter]
  type BatchDeleteDocumentResponseFailedDocuments = js.Array[BatchDeleteDocumentResponseFailedDocument]
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
  type DataSourceDateFieldFormat = String
  type DataSourceFieldName = String
  type DataSourceId = String
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
  type DocumentAttributeKey = String
  type DocumentAttributeKeyList = js.Array[DocumentAttributeKey]
  type DocumentAttributeList = js.Array[DocumentAttribute]
  type DocumentAttributeStringListValue = js.Array[String]
  type DocumentAttributeStringValue = String
  type DocumentAttributeValueCountPairList = js.Array[DocumentAttributeValueCountPair]
  type DocumentId = String
  type DocumentIdList = js.Array[DocumentId]
  type DocumentList = js.Array[Document]
  type DocumentMetadataBoolean = Boolean
  type DocumentMetadataConfigurationList = js.Array[DocumentMetadataConfiguration]
  type DocumentMetadataConfigurationName = String
  type Duration = String
  type ErrorMessage = String
  type FacetList = js.Array[Facet]
  type FacetResultList = js.Array[FacetResult]
  type FaqId = String
  type FaqName = String
  type FaqSummaryItems = js.Array[FaqSummary]
  type GroupAttributeField = String
  type HighlightList = js.Array[Highlight]
  type Importance = Int
  type IndexConfigurationSummaryList = js.Array[IndexConfigurationSummary]
  type IndexFieldName = String
  type IndexId = String
  type IndexName = String
  type IndexedQuestionAnswersCount = Int
  type IndexedTextBytes = Double
  type IndexedTextDocumentsCount = Int
  type Issuer = String
  type KmsKeyId = String
  type MaxResultsIntegerForListDataSourceSyncJobsRequest = Int
  type MaxResultsIntegerForListDataSourcesRequest = Int
  type MaxResultsIntegerForListFaqsRequest = Int
  type MaxResultsIntegerForListIndicesRequest = Int
  type MetricValue = String
  type NextToken = String
  type OneDriveUser = String
  type OneDriveUserList = js.Array[OneDriveUser]
  type PrincipalList = js.Array[Principal]
  type PrincipalName = String
  type QueryCapacityUnit = Int
  type QueryId = String
  type QueryResultItemList = js.Array[QueryResultItem]
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
  type ServiceNowHostUrl = String
  type SharePointUrlList = js.Array[Url]
  type StorageCapacityUnit = Int
  type SubnetId = String
  type SubnetIdList = js.Array[SubnetId]
  type TableName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TenantDomain = String
  type Timestamp = js.Date
  type Title = String
  type Token = String
  type Url = String
  type UserNameAttributeField = String
  type UserTokenConfigurationList = js.Array[UserTokenConfiguration]
  type ValueImportanceMap = js.Dictionary[Importance]
  type ValueImportanceMapKey = String
  type VpcSecurityGroupId = String

  implicit final class KendraOps(private val service: Kendra) extends AnyVal {

    @inline def batchDeleteDocumentFuture(params: BatchDeleteDocumentRequest): Future[BatchDeleteDocumentResponse] = service.batchDeleteDocument(params).promise().toFuture
    @inline def batchPutDocumentFuture(params: BatchPutDocumentRequest): Future[BatchPutDocumentResponse] = service.batchPutDocument(params).promise().toFuture
    @inline def createDataSourceFuture(params: CreateDataSourceRequest): Future[CreateDataSourceResponse] = service.createDataSource(params).promise().toFuture
    @inline def createFaqFuture(params: CreateFaqRequest): Future[CreateFaqResponse] = service.createFaq(params).promise().toFuture
    @inline def createIndexFuture(params: CreateIndexRequest): Future[CreateIndexResponse] = service.createIndex(params).promise().toFuture
    @inline def deleteDataSourceFuture(params: DeleteDataSourceRequest): Future[js.Object] = service.deleteDataSource(params).promise().toFuture
    @inline def deleteFaqFuture(params: DeleteFaqRequest): Future[js.Object] = service.deleteFaq(params).promise().toFuture
    @inline def deleteIndexFuture(params: DeleteIndexRequest): Future[js.Object] = service.deleteIndex(params).promise().toFuture
    @inline def describeDataSourceFuture(params: DescribeDataSourceRequest): Future[DescribeDataSourceResponse] = service.describeDataSource(params).promise().toFuture
    @inline def describeFaqFuture(params: DescribeFaqRequest): Future[DescribeFaqResponse] = service.describeFaq(params).promise().toFuture
    @inline def describeIndexFuture(params: DescribeIndexRequest): Future[DescribeIndexResponse] = service.describeIndex(params).promise().toFuture
    @inline def listDataSourceSyncJobsFuture(params: ListDataSourceSyncJobsRequest): Future[ListDataSourceSyncJobsResponse] = service.listDataSourceSyncJobs(params).promise().toFuture
    @inline def listDataSourcesFuture(params: ListDataSourcesRequest): Future[ListDataSourcesResponse] = service.listDataSources(params).promise().toFuture
    @inline def listFaqsFuture(params: ListFaqsRequest): Future[ListFaqsResponse] = service.listFaqs(params).promise().toFuture
    @inline def listIndicesFuture(params: ListIndicesRequest): Future[ListIndicesResponse] = service.listIndices(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def queryFuture(params: QueryRequest): Future[QueryResult] = service.query(params).promise().toFuture
    @inline def startDataSourceSyncJobFuture(params: StartDataSourceSyncJobRequest): Future[StartDataSourceSyncJobResponse] = service.startDataSourceSyncJob(params).promise().toFuture
    @inline def stopDataSourceSyncJobFuture(params: StopDataSourceSyncJobRequest): Future[js.Object] = service.stopDataSourceSyncJob(params).promise().toFuture
    @inline def submitFeedbackFuture(params: SubmitFeedbackRequest): Future[js.Object] = service.submitFeedback(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDataSourceFuture(params: UpdateDataSourceRequest): Future[js.Object] = service.updateDataSource(params).promise().toFuture
    @inline def updateIndexFuture(params: UpdateIndexRequest): Future[js.Object] = service.updateIndex(params).promise().toFuture

  }
}

package kendra {
  @js.native
  @JSImport("aws-sdk/clients/kendra", JSImport.Namespace, "AWS.Kendra")
  class Kendra() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchDeleteDocument(params: BatchDeleteDocumentRequest): Request[BatchDeleteDocumentResponse] = js.native
    def batchPutDocument(params: BatchPutDocumentRequest): Request[BatchPutDocumentResponse] = js.native
    def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse] = js.native
    def createFaq(params: CreateFaqRequest): Request[CreateFaqResponse] = js.native
    def createIndex(params: CreateIndexRequest): Request[CreateIndexResponse] = js.native
    def deleteDataSource(params: DeleteDataSourceRequest): Request[js.Object] = js.native
    def deleteFaq(params: DeleteFaqRequest): Request[js.Object] = js.native
    def deleteIndex(params: DeleteIndexRequest): Request[js.Object] = js.native
    def describeDataSource(params: DescribeDataSourceRequest): Request[DescribeDataSourceResponse] = js.native
    def describeFaq(params: DescribeFaqRequest): Request[DescribeFaqResponse] = js.native
    def describeIndex(params: DescribeIndexRequest): Request[DescribeIndexResponse] = js.native
    def listDataSourceSyncJobs(params: ListDataSourceSyncJobsRequest): Request[ListDataSourceSyncJobsResponse] = js.native
    def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse] = js.native
    def listFaqs(params: ListFaqsRequest): Request[ListFaqsResponse] = js.native
    def listIndices(params: ListIndicesRequest): Request[ListIndicesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def query(params: QueryRequest): Request[QueryResult] = js.native
    def startDataSourceSyncJob(params: StartDataSourceSyncJobRequest): Request[StartDataSourceSyncJobResponse] = js.native
    def stopDataSourceSyncJob(params: StopDataSourceSyncJobRequest): Request[js.Object] = js.native
    def submitFeedback(params: SubmitFeedbackRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDataSource(params: UpdateDataSourceRequest): Request[js.Object] = js.native
    def updateIndex(params: UpdateIndexRequest): Request[js.Object] = js.native
  }

  /** Access Control List files for the documents in a data source.
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
  sealed trait AdditionalResultAttributeValueType extends js.Any
  object AdditionalResultAttributeValueType {
    val TEXT_WITH_HIGHLIGHTS_VALUE = "TEXT_WITH_HIGHLIGHTS_VALUE".asInstanceOf[AdditionalResultAttributeValueType]

    @inline def values = js.Array(TEXT_WITH_HIGHLIGHTS_VALUE)
  }

  /** Provides filtering the query results based on document attributes.
    * When you use the <code>AndAllFilters</code> or <code>OrAllFilters</code>, filters you can use 2 layers under the first attribute filter. For example, you can use:
    * <code>&lt;AndAllFilters&gt;</code>
    * <ol> * <code> &lt;OrAllFilters&gt;</code>
    * * <code> &lt;EqualTo&gt;</code>
    * </ol> If you use more than 2 layers, you receive a <code>ValidationException</code> exception with the message "<code>AttributeFilter</code> cannot have a depth of more than 2."
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

  /** Provides information about documents that could not be removed from an index by the <a>BatchDeleteDocument</a> operation.
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
  trait BatchPutDocumentRequest extends js.Object {
    var Documents: DocumentList
    var IndexId: IndexId
    var RoleArn: js.UndefOr[RoleArn]
  }

  object BatchPutDocumentRequest {
    @inline
    def apply(
        Documents: DocumentList,
        IndexId: IndexId,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): BatchPutDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "Documents" -> Documents.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

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

  /** Specifies capacity units configured for your index. You can add and remove capacity units to tune an index to your requirements.
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

  /** Gathers information about when a particular result was clicked by a user. Your application uses the <a>SubmitFeedback</a> operation to provide click information.
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

  @js.native
  sealed trait ConfluenceAttachmentFieldName extends js.Any
  object ConfluenceAttachmentFieldName {
    val AUTHOR = "AUTHOR".asInstanceOf[ConfluenceAttachmentFieldName]
    val CONTENT_TYPE = "CONTENT_TYPE".asInstanceOf[ConfluenceAttachmentFieldName]
    val CREATED_DATE = "CREATED_DATE".asInstanceOf[ConfluenceAttachmentFieldName]
    val DISPLAY_URL = "DISPLAY_URL".asInstanceOf[ConfluenceAttachmentFieldName]
    val FILE_SIZE = "FILE_SIZE".asInstanceOf[ConfluenceAttachmentFieldName]
    val ITEM_TYPE = "ITEM_TYPE".asInstanceOf[ConfluenceAttachmentFieldName]
    val PARENT_ID = "PARENT_ID".asInstanceOf[ConfluenceAttachmentFieldName]
    val SPACE_KEY = "SPACE_KEY".asInstanceOf[ConfluenceAttachmentFieldName]
    val SPACE_NAME = "SPACE_NAME".asInstanceOf[ConfluenceAttachmentFieldName]
    val URL = "URL".asInstanceOf[ConfluenceAttachmentFieldName]
    val VERSION = "VERSION".asInstanceOf[ConfluenceAttachmentFieldName]

    @inline def values = js.Array(AUTHOR, CONTENT_TYPE, CREATED_DATE, DISPLAY_URL, FILE_SIZE, ITEM_TYPE, PARENT_ID, SPACE_KEY, SPACE_NAME, URL, VERSION)
  }

  /** Defines the mapping between a field in the Confluence data source to a Amazon Kendra index field.
    * You must first create the index field using the operation.
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

  /** Specifies the blog settings for the Confluence data source. Blogs are always indexed unless filtered from the index by the <code>ExclusionPatterns</code> or <code>InclusionPatterns</code> fields in the data type.
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

  @js.native
  sealed trait ConfluenceBlogFieldName extends js.Any
  object ConfluenceBlogFieldName {
    val AUTHOR = "AUTHOR".asInstanceOf[ConfluenceBlogFieldName]
    val DISPLAY_URL = "DISPLAY_URL".asInstanceOf[ConfluenceBlogFieldName]
    val ITEM_TYPE = "ITEM_TYPE".asInstanceOf[ConfluenceBlogFieldName]
    val LABELS = "LABELS".asInstanceOf[ConfluenceBlogFieldName]
    val PUBLISH_DATE = "PUBLISH_DATE".asInstanceOf[ConfluenceBlogFieldName]
    val SPACE_KEY = "SPACE_KEY".asInstanceOf[ConfluenceBlogFieldName]
    val SPACE_NAME = "SPACE_NAME".asInstanceOf[ConfluenceBlogFieldName]
    val URL = "URL".asInstanceOf[ConfluenceBlogFieldName]
    val VERSION = "VERSION".asInstanceOf[ConfluenceBlogFieldName]

    @inline def values = js.Array(AUTHOR, DISPLAY_URL, ITEM_TYPE, LABELS, PUBLISH_DATE, SPACE_KEY, SPACE_NAME, URL, VERSION)
  }

  /** Defines the mapping between a blog field in the Confluence data source to a Amazon Kendra index field.
    * You must first create the index field using the operation.
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

  @js.native
  sealed trait ConfluencePageFieldName extends js.Any
  object ConfluencePageFieldName {
    val AUTHOR = "AUTHOR".asInstanceOf[ConfluencePageFieldName]
    val CONTENT_STATUS = "CONTENT_STATUS".asInstanceOf[ConfluencePageFieldName]
    val CREATED_DATE = "CREATED_DATE".asInstanceOf[ConfluencePageFieldName]
    val DISPLAY_URL = "DISPLAY_URL".asInstanceOf[ConfluencePageFieldName]
    val ITEM_TYPE = "ITEM_TYPE".asInstanceOf[ConfluencePageFieldName]
    val LABELS = "LABELS".asInstanceOf[ConfluencePageFieldName]
    val MODIFIED_DATE = "MODIFIED_DATE".asInstanceOf[ConfluencePageFieldName]
    val PARENT_ID = "PARENT_ID".asInstanceOf[ConfluencePageFieldName]
    val SPACE_KEY = "SPACE_KEY".asInstanceOf[ConfluencePageFieldName]
    val SPACE_NAME = "SPACE_NAME".asInstanceOf[ConfluencePageFieldName]
    val URL = "URL".asInstanceOf[ConfluencePageFieldName]
    val VERSION = "VERSION".asInstanceOf[ConfluencePageFieldName]

    @inline def values = js.Array(AUTHOR, CONTENT_STATUS, CREATED_DATE, DISPLAY_URL, ITEM_TYPE, LABELS, MODIFIED_DATE, PARENT_ID, SPACE_KEY, SPACE_NAME, URL, VERSION)
  }

  /** Defines the mapping between a field in the Confluence data source to a Amazon Kendra index field.
    * You must first create the index field using the operation.
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

  @js.native
  sealed trait ConfluenceSpaceFieldName extends js.Any
  object ConfluenceSpaceFieldName {
    val DISPLAY_URL = "DISPLAY_URL".asInstanceOf[ConfluenceSpaceFieldName]
    val ITEM_TYPE = "ITEM_TYPE".asInstanceOf[ConfluenceSpaceFieldName]
    val SPACE_KEY = "SPACE_KEY".asInstanceOf[ConfluenceSpaceFieldName]
    val URL = "URL".asInstanceOf[ConfluenceSpaceFieldName]

    @inline def values = js.Array(DISPLAY_URL, ITEM_TYPE, SPACE_KEY, URL)
  }

  /** Defines the mapping between a field in the Confluence data source to a Amazon Kendra index field.
    * You must first create the index field using the operation.
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

  @js.native
  sealed trait ConfluenceVersion extends js.Any
  object ConfluenceVersion {
    val CLOUD = "CLOUD".asInstanceOf[ConfluenceVersion]
    val SERVER = "SERVER".asInstanceOf[ConfluenceVersion]

    @inline def values = js.Array(CLOUD, SERVER)
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

  @js.native
  sealed trait ContentType extends js.Any
  object ContentType {
    val PDF = "PDF".asInstanceOf[ContentType]
    val HTML = "HTML".asInstanceOf[ContentType]
    val MS_WORD = "MS_WORD".asInstanceOf[ContentType]
    val PLAIN_TEXT = "PLAIN_TEXT".asInstanceOf[ContentType]
    val PPT = "PPT".asInstanceOf[ContentType]

    @inline def values = js.Array(PDF, HTML, MS_WORD, PLAIN_TEXT, PPT)
  }

  @js.native
  trait CreateDataSourceRequest extends js.Object {
    var IndexId: IndexId
    var Name: DataSourceName
    var Type: DataSourceType
    var ClientToken: js.UndefOr[ClientTokenName]
    var Configuration: js.UndefOr[DataSourceConfiguration]
    var Description: js.UndefOr[Description]
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
        Description: js.UndefOr[Description] = js.undefined,
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
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
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
  trait CreateFaqRequest extends js.Object {
    var IndexId: IndexId
    var Name: FaqName
    var RoleArn: RoleArn
    var S3Path: S3Path
    var ClientToken: js.UndefOr[ClientTokenName]
    var Description: js.UndefOr[Description]
    var FileFormat: js.UndefOr[FaqFileFormat]
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

  /** Configuration information for a Amazon Kendra data source.
    */
  @js.native
  trait DataSourceConfiguration extends js.Object {
    var ConfluenceConfiguration: js.UndefOr[ConfluenceConfiguration]
    var DatabaseConfiguration: js.UndefOr[DatabaseConfiguration]
    var OneDriveConfiguration: js.UndefOr[OneDriveConfiguration]
    var S3Configuration: js.UndefOr[S3DataSourceConfiguration]
    var SalesforceConfiguration: js.UndefOr[SalesforceConfiguration]
    var ServiceNowConfiguration: js.UndefOr[ServiceNowConfiguration]
    var SharePointConfiguration: js.UndefOr[SharePointConfiguration]
  }

  object DataSourceConfiguration {
    @inline
    def apply(
        ConfluenceConfiguration: js.UndefOr[ConfluenceConfiguration] = js.undefined,
        DatabaseConfiguration: js.UndefOr[DatabaseConfiguration] = js.undefined,
        OneDriveConfiguration: js.UndefOr[OneDriveConfiguration] = js.undefined,
        S3Configuration: js.UndefOr[S3DataSourceConfiguration] = js.undefined,
        SalesforceConfiguration: js.UndefOr[SalesforceConfiguration] = js.undefined,
        ServiceNowConfiguration: js.UndefOr[ServiceNowConfiguration] = js.undefined,
        SharePointConfiguration: js.UndefOr[SharePointConfiguration] = js.undefined
    ): DataSourceConfiguration = {
      val __obj = js.Dynamic.literal()
      ConfluenceConfiguration.foreach(__v => __obj.updateDynamic("ConfluenceConfiguration")(__v.asInstanceOf[js.Any]))
      DatabaseConfiguration.foreach(__v => __obj.updateDynamic("DatabaseConfiguration")(__v.asInstanceOf[js.Any]))
      OneDriveConfiguration.foreach(__v => __obj.updateDynamic("OneDriveConfiguration")(__v.asInstanceOf[js.Any]))
      S3Configuration.foreach(__v => __obj.updateDynamic("S3Configuration")(__v.asInstanceOf[js.Any]))
      SalesforceConfiguration.foreach(__v => __obj.updateDynamic("SalesforceConfiguration")(__v.asInstanceOf[js.Any]))
      ServiceNowConfiguration.foreach(__v => __obj.updateDynamic("ServiceNowConfiguration")(__v.asInstanceOf[js.Any]))
      SharePointConfiguration.foreach(__v => __obj.updateDynamic("SharePointConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceConfiguration]
    }
  }

  @js.native
  sealed trait DataSourceStatus extends js.Any
  object DataSourceStatus {
    val CREATING = "CREATING".asInstanceOf[DataSourceStatus]
    val DELETING = "DELETING".asInstanceOf[DataSourceStatus]
    val FAILED = "FAILED".asInstanceOf[DataSourceStatus]
    val UPDATING = "UPDATING".asInstanceOf[DataSourceStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[DataSourceStatus]

    @inline def values = js.Array(CREATING, DELETING, FAILED, UPDATING, ACTIVE)
  }

  /** Summary information for a Amazon Kendra data source. Returned in a call to .
    */
  @js.native
  trait DataSourceSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Id: js.UndefOr[DataSourceId]
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
        Name: js.UndefOr[DataSourceName] = js.undefined,
        Status: js.UndefOr[DataSourceStatus] = js.undefined,
        Type: js.UndefOr[DataSourceType] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): DataSourceSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
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
    var DataSourceSyncJobId: DataSourceSyncJobId
  }

  object DataSourceSyncJobMetricTarget {
    @inline
    def apply(
        DataSourceId: DataSourceId,
        DataSourceSyncJobId: DataSourceSyncJobId
    ): DataSourceSyncJobMetricTarget = {
      val __obj = js.Dynamic.literal(
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any],
        "DataSourceSyncJobId" -> DataSourceSyncJobId.asInstanceOf[js.Any]
      )
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

  @js.native
  sealed trait DataSourceSyncJobStatus extends js.Any
  object DataSourceSyncJobStatus {
    val FAILED = "FAILED".asInstanceOf[DataSourceSyncJobStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[DataSourceSyncJobStatus]
    val SYNCING = "SYNCING".asInstanceOf[DataSourceSyncJobStatus]
    val INCOMPLETE = "INCOMPLETE".asInstanceOf[DataSourceSyncJobStatus]
    val STOPPING = "STOPPING".asInstanceOf[DataSourceSyncJobStatus]
    val ABORTED = "ABORTED".asInstanceOf[DataSourceSyncJobStatus]
    val SYNCING_INDEXING = "SYNCING_INDEXING".asInstanceOf[DataSourceSyncJobStatus]

    @inline def values = js.Array(FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING, ABORTED, SYNCING_INDEXING)
  }

  /** Maps a column or attribute in the data source to an index field. You must first create the fields in the index using the <a>UpdateIndex</a> operation.
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

  @js.native
  sealed trait DataSourceType extends js.Any
  object DataSourceType {
    val S3 = "S3".asInstanceOf[DataSourceType]
    val SHAREPOINT = "SHAREPOINT".asInstanceOf[DataSourceType]
    val DATABASE = "DATABASE".asInstanceOf[DataSourceType]
    val SALESFORCE = "SALESFORCE".asInstanceOf[DataSourceType]
    val ONEDRIVE = "ONEDRIVE".asInstanceOf[DataSourceType]
    val SERVICENOW = "SERVICENOW".asInstanceOf[DataSourceType]
    val CUSTOM = "CUSTOM".asInstanceOf[DataSourceType]
    val CONFLUENCE = "CONFLUENCE".asInstanceOf[DataSourceType]

    @inline def values = js.Array(S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE, SERVICENOW, CUSTOM, CONFLUENCE)
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
  sealed trait DatabaseEngineType extends js.Any
  object DatabaseEngineType {
    val RDS_AURORA_MYSQL = "RDS_AURORA_MYSQL".asInstanceOf[DatabaseEngineType]
    val RDS_AURORA_POSTGRESQL = "RDS_AURORA_POSTGRESQL".asInstanceOf[DatabaseEngineType]
    val RDS_MYSQL = "RDS_MYSQL".asInstanceOf[DatabaseEngineType]
    val RDS_POSTGRESQL = "RDS_POSTGRESQL".asInstanceOf[DatabaseEngineType]

    @inline def values = js.Array(RDS_AURORA_MYSQL, RDS_AURORA_POSTGRESQL, RDS_MYSQL, RDS_POSTGRESQL)
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
    var Description: js.UndefOr[Description]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var Id: js.UndefOr[DataSourceId]
    var IndexId: js.UndefOr[IndexId]
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
        Description: js.UndefOr[Description] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        Id: js.UndefOr[DataSourceId] = js.undefined,
        IndexId: js.UndefOr[IndexId] = js.undefined,
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
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IndexId.foreach(__v => __obj.updateDynamic("IndexId")(__v.asInstanceOf[js.Any]))
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
      UserTokenConfigurations.foreach(__v => __obj.updateDynamic("UserTokenConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIndexResponse]
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

  @js.native
  sealed trait DocumentAttributeValueType extends js.Any
  object DocumentAttributeValueType {
    val STRING_VALUE = "STRING_VALUE".asInstanceOf[DocumentAttributeValueType]
    val STRING_LIST_VALUE = "STRING_LIST_VALUE".asInstanceOf[DocumentAttributeValueType]
    val LONG_VALUE = "LONG_VALUE".asInstanceOf[DocumentAttributeValueType]
    val DATE_VALUE = "DATE_VALUE".asInstanceOf[DocumentAttributeValueType]

    @inline def values = js.Array(STRING_VALUE, STRING_LIST_VALUE, LONG_VALUE, DATE_VALUE)
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

  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode {
    val InternalError = "InternalError".asInstanceOf[ErrorCode]
    val InvalidRequest = "InvalidRequest".asInstanceOf[ErrorCode]

    @inline def values = js.Array(InternalError, InvalidRequest)
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

  @js.native
  sealed trait FaqFileFormat extends js.Any
  object FaqFileFormat {
    val CSV = "CSV".asInstanceOf[FaqFileFormat]
    val CSV_WITH_HEADER = "CSV_WITH_HEADER".asInstanceOf[FaqFileFormat]
    val JSON = "JSON".asInstanceOf[FaqFileFormat]

    @inline def values = js.Array(CSV, CSV_WITH_HEADER, JSON)
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

  @js.native
  sealed trait FaqStatus extends js.Any
  object FaqStatus {
    val CREATING = "CREATING".asInstanceOf[FaqStatus]
    val UPDATING = "UPDATING".asInstanceOf[FaqStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[FaqStatus]
    val DELETING = "DELETING".asInstanceOf[FaqStatus]
    val FAILED = "FAILED".asInstanceOf[FaqStatus]

    @inline def values = js.Array(CREATING, UPDATING, ACTIVE, DELETING, FAILED)
  }

  /** Provides information about a frequently asked questions and answer contained in an index.
    */
  @js.native
  trait FaqSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var FileFormat: js.UndefOr[FaqFileFormat]
    var Id: js.UndefOr[FaqId]
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
        Name: js.UndefOr[FaqName] = js.undefined,
        Status: js.UndefOr[FaqStatus] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): FaqSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      FileFormat.foreach(__v => __obj.updateDynamic("FileFormat")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaqSummary]
    }
  }

  /** Provides information that you can use to highlight a search result so that your users can quickly identify terms in the response.
    */
  @js.native
  trait Highlight extends js.Object {
    var BeginOffset: Int
    var EndOffset: Int
    var TopAnswer: js.UndefOr[Boolean]
  }

  object Highlight {
    @inline
    def apply(
        BeginOffset: Int,
        EndOffset: Int,
        TopAnswer: js.UndefOr[Boolean] = js.undefined
    ): Highlight = {
      val __obj = js.Dynamic.literal(
        "BeginOffset" -> BeginOffset.asInstanceOf[js.Any],
        "EndOffset" -> EndOffset.asInstanceOf[js.Any]
      )

      TopAnswer.foreach(__v => __obj.updateDynamic("TopAnswer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Highlight]
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

  @js.native
  sealed trait IndexEdition extends js.Any
  object IndexEdition {
    val DEVELOPER_EDITION = "DEVELOPER_EDITION".asInstanceOf[IndexEdition]
    val ENTERPRISE_EDITION = "ENTERPRISE_EDITION".asInstanceOf[IndexEdition]

    @inline def values = js.Array(DEVELOPER_EDITION, ENTERPRISE_EDITION)
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

  @js.native
  sealed trait IndexStatus extends js.Any
  object IndexStatus {
    val CREATING = "CREATING".asInstanceOf[IndexStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[IndexStatus]
    val DELETING = "DELETING".asInstanceOf[IndexStatus]
    val FAILED = "FAILED".asInstanceOf[IndexStatus]
    val UPDATING = "UPDATING".asInstanceOf[IndexStatus]
    val SYSTEM_UPDATING = "SYSTEM_UPDATING".asInstanceOf[IndexStatus]

    @inline def values = js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING, SYSTEM_UPDATING)
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
  sealed trait KeyLocation extends js.Any
  object KeyLocation {
    val URL = "URL".asInstanceOf[KeyLocation]
    val SECRET_MANAGER = "SECRET_MANAGER".asInstanceOf[KeyLocation]

    @inline def values = js.Array(URL, SECRET_MANAGER)
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

  @js.native
  sealed trait Order extends js.Any
  object Order {
    val ASCENDING = "ASCENDING".asInstanceOf[Order]
    val DESCENDING = "DESCENDING".asInstanceOf[Order]

    @inline def values = js.Array(ASCENDING, DESCENDING)
  }

  /** Provides user and group information for document access filtering.
    */
  @js.native
  trait Principal extends js.Object {
    var Access: ReadAccessType
    var Name: PrincipalName
    var Type: PrincipalType
  }

  object Principal {
    @inline
    def apply(
        Access: ReadAccessType,
        Name: PrincipalName,
        Type: PrincipalType
    ): Principal = {
      val __obj = js.Dynamic.literal(
        "Access" -> Access.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Principal]
    }
  }

  @js.native
  sealed trait PrincipalType extends js.Any
  object PrincipalType {
    val USER = "USER".asInstanceOf[PrincipalType]
    val GROUP = "GROUP".asInstanceOf[PrincipalType]

    @inline def values = js.Array(USER, GROUP)
  }

  @js.native
  sealed trait QueryIdentifiersEnclosingOption extends js.Any
  object QueryIdentifiersEnclosingOption {
    val DOUBLE_QUOTES = "DOUBLE_QUOTES".asInstanceOf[QueryIdentifiersEnclosingOption]
    val NONE = "NONE".asInstanceOf[QueryIdentifiersEnclosingOption]

    @inline def values = js.Array(DOUBLE_QUOTES, NONE)
  }

  @js.native
  trait QueryRequest extends js.Object {
    var IndexId: IndexId
    var QueryText: QueryText
    var AttributeFilter: js.UndefOr[AttributeFilter]
    var Facets: js.UndefOr[FacetList]
    var PageNumber: js.UndefOr[Int]
    var PageSize: js.UndefOr[Int]
    var QueryResultTypeFilter: js.UndefOr[QueryResultType]
    var RequestedDocumentAttributes: js.UndefOr[DocumentAttributeKeyList]
    var SortingConfiguration: js.UndefOr[SortingConfiguration]
    var UserContext: js.UndefOr[UserContext]
  }

  object QueryRequest {
    @inline
    def apply(
        IndexId: IndexId,
        QueryText: QueryText,
        AttributeFilter: js.UndefOr[AttributeFilter] = js.undefined,
        Facets: js.UndefOr[FacetList] = js.undefined,
        PageNumber: js.UndefOr[Int] = js.undefined,
        PageSize: js.UndefOr[Int] = js.undefined,
        QueryResultTypeFilter: js.UndefOr[QueryResultType] = js.undefined,
        RequestedDocumentAttributes: js.UndefOr[DocumentAttributeKeyList] = js.undefined,
        SortingConfiguration: js.UndefOr[SortingConfiguration] = js.undefined,
        UserContext: js.UndefOr[UserContext] = js.undefined
    ): QueryRequest = {
      val __obj = js.Dynamic.literal(
        "IndexId" -> IndexId.asInstanceOf[js.Any],
        "QueryText" -> QueryText.asInstanceOf[js.Any]
      )

      AttributeFilter.foreach(__v => __obj.updateDynamic("AttributeFilter")(__v.asInstanceOf[js.Any]))
      Facets.foreach(__v => __obj.updateDynamic("Facets")(__v.asInstanceOf[js.Any]))
      PageNumber.foreach(__v => __obj.updateDynamic("PageNumber")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      QueryResultTypeFilter.foreach(__v => __obj.updateDynamic("QueryResultTypeFilter")(__v.asInstanceOf[js.Any]))
      RequestedDocumentAttributes.foreach(__v => __obj.updateDynamic("RequestedDocumentAttributes")(__v.asInstanceOf[js.Any]))
      SortingConfiguration.foreach(__v => __obj.updateDynamic("SortingConfiguration")(__v.asInstanceOf[js.Any]))
      UserContext.foreach(__v => __obj.updateDynamic("UserContext")(__v.asInstanceOf[js.Any]))
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

  /** A single query result.
    * A query result contains information about a document returned by the query. This includes the original location of the document, a list of attributes assigned to the document, and relevant text from the document that satisfies the query.
    */
  @js.native
  trait QueryResultItem extends js.Object {
    var AdditionalAttributes: js.UndefOr[AdditionalResultAttributeList]
    var DocumentAttributes: js.UndefOr[DocumentAttributeList]
    var DocumentExcerpt: js.UndefOr[TextWithHighlights]
    var DocumentId: js.UndefOr[DocumentId]
    var DocumentTitle: js.UndefOr[TextWithHighlights]
    var DocumentURI: js.UndefOr[Url]
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
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ScoreAttributes.foreach(__v => __obj.updateDynamic("ScoreAttributes")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryResultItem]
    }
  }

  @js.native
  sealed trait QueryResultType extends js.Any
  object QueryResultType {
    val DOCUMENT = "DOCUMENT".asInstanceOf[QueryResultType]
    val QUESTION_ANSWER = "QUESTION_ANSWER".asInstanceOf[QueryResultType]
    val ANSWER = "ANSWER".asInstanceOf[QueryResultType]

    @inline def values = js.Array(DOCUMENT, QUESTION_ANSWER, ANSWER)
  }

  @js.native
  sealed trait ReadAccessType extends js.Any
  object ReadAccessType {
    val ALLOW = "ALLOW".asInstanceOf[ReadAccessType]
    val DENY = "DENY".asInstanceOf[ReadAccessType]

    @inline def values = js.Array(ALLOW, DENY)
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

  /** Provides feedback on how relevant a document is to a search. Your application uses the <a>SubmitFeedback</a> operation to provide relevance information.
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

  @js.native
  sealed trait RelevanceType extends js.Any
  object RelevanceType {
    val RELEVANT = "RELEVANT".asInstanceOf[RelevanceType]
    val NOT_RELEVANT = "NOT_RELEVANT".asInstanceOf[RelevanceType]

    @inline def values = js.Array(RELEVANT, NOT_RELEVANT)
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

  @js.native
  sealed trait SalesforceChatterFeedIncludeFilterType extends js.Any
  object SalesforceChatterFeedIncludeFilterType {
    val ACTIVE_USER = "ACTIVE_USER".asInstanceOf[SalesforceChatterFeedIncludeFilterType]
    val STANDARD_USER = "STANDARD_USER".asInstanceOf[SalesforceChatterFeedIncludeFilterType]

    @inline def values = js.Array(ACTIVE_USER, STANDARD_USER)
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

  /** Specifies configuration information for the knowlege article types that Amazon Kendra indexes. Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge articles, or the custom fields of custom knowledge articles, but not both
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

  @js.native
  sealed trait SalesforceKnowledgeArticleState extends js.Any
  object SalesforceKnowledgeArticleState {
    val DRAFT = "DRAFT".asInstanceOf[SalesforceKnowledgeArticleState]
    val PUBLISHED = "PUBLISHED".asInstanceOf[SalesforceKnowledgeArticleState]
    val ARCHIVED = "ARCHIVED".asInstanceOf[SalesforceKnowledgeArticleState]

    @inline def values = js.Array(DRAFT, PUBLISHED, ARCHIVED)
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

  /** Specifies confguration information for indexing a single standard object.
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

  @js.native
  sealed trait SalesforceStandardObjectName extends js.Any
  object SalesforceStandardObjectName {
    val ACCOUNT = "ACCOUNT".asInstanceOf[SalesforceStandardObjectName]
    val CAMPAIGN = "CAMPAIGN".asInstanceOf[SalesforceStandardObjectName]
    val CASE = "CASE".asInstanceOf[SalesforceStandardObjectName]
    val CONTACT = "CONTACT".asInstanceOf[SalesforceStandardObjectName]
    val CONTRACT = "CONTRACT".asInstanceOf[SalesforceStandardObjectName]
    val DOCUMENT = "DOCUMENT".asInstanceOf[SalesforceStandardObjectName]
    val GROUP = "GROUP".asInstanceOf[SalesforceStandardObjectName]
    val IDEA = "IDEA".asInstanceOf[SalesforceStandardObjectName]
    val LEAD = "LEAD".asInstanceOf[SalesforceStandardObjectName]
    val OPPORTUNITY = "OPPORTUNITY".asInstanceOf[SalesforceStandardObjectName]
    val PARTNER = "PARTNER".asInstanceOf[SalesforceStandardObjectName]
    val PRICEBOOK = "PRICEBOOK".asInstanceOf[SalesforceStandardObjectName]
    val PRODUCT = "PRODUCT".asInstanceOf[SalesforceStandardObjectName]
    val PROFILE = "PROFILE".asInstanceOf[SalesforceStandardObjectName]
    val SOLUTION = "SOLUTION".asInstanceOf[SalesforceStandardObjectName]
    val TASK = "TASK".asInstanceOf[SalesforceStandardObjectName]
    val USER = "USER".asInstanceOf[SalesforceStandardObjectName]

    @inline def values = js.Array(ACCOUNT, CAMPAIGN, CASE, CONTACT, CONTRACT, DOCUMENT, GROUP, IDEA, LEAD, OPPORTUNITY, PARTNER, PRICEBOOK, PRODUCT, PROFILE, SOLUTION, TASK, USER)
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

  /** Enumeration for query score confidence.
    */
  @js.native
  sealed trait ScoreConfidence extends js.Any
  object ScoreConfidence {
    val VERY_HIGH = "VERY_HIGH".asInstanceOf[ScoreConfidence]
    val HIGH = "HIGH".asInstanceOf[ScoreConfidence]
    val MEDIUM = "MEDIUM".asInstanceOf[ScoreConfidence]
    val LOW = "LOW".asInstanceOf[ScoreConfidence]

    @inline def values = js.Array(VERY_HIGH, HIGH, MEDIUM, LOW)
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

  /** Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support asymmetric CMKs.
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

  @js.native
  sealed trait ServiceNowBuildVersionType extends js.Any
  object ServiceNowBuildVersionType {
    val LONDON = "LONDON".asInstanceOf[ServiceNowBuildVersionType]
    val OTHERS = "OTHERS".asInstanceOf[ServiceNowBuildVersionType]

    @inline def values = js.Array(LONDON, OTHERS)
  }

  /** Provides configuration information required to connect to a ServiceNow data source.
    */
  @js.native
  trait ServiceNowConfiguration extends js.Object {
    var HostUrl: ServiceNowHostUrl
    var SecretArn: SecretArn
    var ServiceNowBuildVersion: ServiceNowBuildVersionType
    var KnowledgeArticleConfiguration: js.UndefOr[ServiceNowKnowledgeArticleConfiguration]
    var ServiceCatalogConfiguration: js.UndefOr[ServiceNowServiceCatalogConfiguration]
  }

  object ServiceNowConfiguration {
    @inline
    def apply(
        HostUrl: ServiceNowHostUrl,
        SecretArn: SecretArn,
        ServiceNowBuildVersion: ServiceNowBuildVersionType,
        KnowledgeArticleConfiguration: js.UndefOr[ServiceNowKnowledgeArticleConfiguration] = js.undefined,
        ServiceCatalogConfiguration: js.UndefOr[ServiceNowServiceCatalogConfiguration] = js.undefined
    ): ServiceNowConfiguration = {
      val __obj = js.Dynamic.literal(
        "HostUrl" -> HostUrl.asInstanceOf[js.Any],
        "SecretArn" -> SecretArn.asInstanceOf[js.Any],
        "ServiceNowBuildVersion" -> ServiceNowBuildVersion.asInstanceOf[js.Any]
      )

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
        IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
    ): ServiceNowKnowledgeArticleConfiguration = {
      val __obj = js.Dynamic.literal(
        "DocumentDataFieldName" -> DocumentDataFieldName.asInstanceOf[js.Any]
      )

      CrawlAttachments.foreach(__v => __obj.updateDynamic("CrawlAttachments")(__v.asInstanceOf[js.Any]))
      DocumentTitleFieldName.foreach(__v => __obj.updateDynamic("DocumentTitleFieldName")(__v.asInstanceOf[js.Any]))
      ExcludeAttachmentFilePatterns.foreach(__v => __obj.updateDynamic("ExcludeAttachmentFilePatterns")(__v.asInstanceOf[js.Any]))
      FieldMappings.foreach(__v => __obj.updateDynamic("FieldMappings")(__v.asInstanceOf[js.Any]))
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
      UseChangeLog.foreach(__v => __obj.updateDynamic("UseChangeLog")(__v.asInstanceOf[js.Any]))
      VpcConfiguration.foreach(__v => __obj.updateDynamic("VpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SharePointConfiguration]
    }
  }

  @js.native
  sealed trait SharePointVersion extends js.Any
  object SharePointVersion {
    val SHAREPOINT_ONLINE = "SHAREPOINT_ONLINE".asInstanceOf[SharePointVersion]

    @inline def values = js.Array(SHAREPOINT_ONLINE)
  }

  @js.native
  sealed trait SortOrder extends js.Any
  object SortOrder {
    val DESC = "DESC".asInstanceOf[SortOrder]
    val ASC = "ASC".asInstanceOf[SortOrder]

    @inline def values = js.Array(DESC, ASC)
  }

  /** Specifies the document attribute to use to sort the response to a Amazon Kendra query. You can specify a single attribute for sorting. The attribute must have the <code>Sortable</code> flag set to <code>true</code>, otherwise Amazon Kendra returns an exception.
    * You can sort attributes of the following types.
    * * Date value
    * * Long value
    * * String value
    * You can't sort attributes of the following type.
    * * String list value
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
    var Description: js.UndefOr[Description]
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
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[DataSourceName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        Schedule: js.UndefOr[ScanSchedule] = js.undefined
    ): UpdateDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IndexId" -> IndexId.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSourceRequest]
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
      UserTokenConfigurations.foreach(__v => __obj.updateDynamic("UserTokenConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIndexRequest]
    }
  }

  /** Provides information about the user context for a Amazon Kendra index.
    */
  @js.native
  trait UserContext extends js.Object {
    var Token: js.UndefOr[Token]
  }

  object UserContext {
    @inline
    def apply(
        Token: js.UndefOr[Token] = js.undefined
    ): UserContext = {
      val __obj = js.Dynamic.literal()
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserContext]
    }
  }

  @js.native
  sealed trait UserContextPolicy extends js.Any
  object UserContextPolicy {
    val ATTRIBUTE_FILTER = "ATTRIBUTE_FILTER".asInstanceOf[UserContextPolicy]
    val USER_TOKEN = "USER_TOKEN".asInstanceOf[UserContextPolicy]

    @inline def values = js.Array(ATTRIBUTE_FILTER, USER_TOKEN)
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
}
