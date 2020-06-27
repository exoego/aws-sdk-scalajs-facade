package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object kendra {
  type AdditionalResultAttributeList                     = js.Array[AdditionalResultAttribute]
  type AttributeFilterList                               = js.Array[AttributeFilter]
  type BatchDeleteDocumentResponseFailedDocuments        = js.Array[BatchDeleteDocumentResponseFailedDocument]
  type BatchPutDocumentResponseFailedDocuments           = js.Array[BatchPutDocumentResponseFailedDocument]
  type Blob                                              = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ChangeDetectingColumns                            = js.Array[ColumnName]
  type ClickFeedbackList                                 = js.Array[ClickFeedback]
  type ColumnName                                        = String
  type DataSourceDateFieldFormat                         = String
  type DataSourceFieldName                               = String
  type DataSourceId                                      = String
  type DataSourceInclusionsExclusionsStrings             = js.Array[DataSourceInclusionsExclusionsStringsMember]
  type DataSourceInclusionsExclusionsStringsMember       = String
  type DataSourceName                                    = String
  type DataSourceSummaryList                             = js.Array[DataSourceSummary]
  type DataSourceSyncJobHistoryList                      = js.Array[DataSourceSyncJob]
  type DataSourceToIndexFieldMappingList                 = js.Array[DataSourceToIndexFieldMapping]
  type DatabaseHost                                      = String
  type DatabaseName                                      = String
  type DatabasePort                                      = Int
  type Description                                       = String
  type DocumentAttributeKey                              = String
  type DocumentAttributeKeyList                          = js.Array[DocumentAttributeKey]
  type DocumentAttributeList                             = js.Array[DocumentAttribute]
  type DocumentAttributeStringListValue                  = js.Array[String]
  type DocumentAttributeStringValue                      = String
  type DocumentAttributeValueCountPairList               = js.Array[DocumentAttributeValueCountPair]
  type DocumentId                                        = String
  type DocumentIdList                                    = js.Array[DocumentId]
  type DocumentList                                      = js.Array[Document]
  type DocumentMetadataBoolean                           = Boolean
  type DocumentMetadataConfigurationList                 = js.Array[DocumentMetadataConfiguration]
  type DocumentMetadataConfigurationName                 = String
  type Duration                                          = String
  type ErrorMessage                                      = String
  type FacetList                                         = js.Array[Facet]
  type FacetResultList                                   = js.Array[FacetResult]
  type FaqId                                             = String
  type FaqName                                           = String
  type FaqSummaryItems                                   = js.Array[FaqSummary]
  type HighlightList                                     = js.Array[Highlight]
  type Importance                                        = Int
  type IndexConfigurationSummaryList                     = js.Array[IndexConfigurationSummary]
  type IndexFieldName                                    = String
  type IndexId                                           = String
  type IndexName                                         = String
  type IndexedQuestionAnswersCount                       = Int
  type IndexedTextDocumentsCount                         = Int
  type KmsKeyId                                          = String
  type MaxResultsIntegerForListDataSourceSyncJobsRequest = Int
  type MaxResultsIntegerForListDataSourcesRequest        = Int
  type MaxResultsIntegerForListFaqsRequest               = Int
  type MaxResultsIntegerForListIndicesRequest            = Int
  type NextToken                                         = String
  type PrincipalList                                     = js.Array[Principal]
  type PrincipalName                                     = String
  type QueryId                                           = String
  type QueryResultItemList                               = js.Array[QueryResultItem]
  type QueryText                                         = String
  type RelevanceFeedbackList                             = js.Array[RelevanceFeedback]
  type ResultId                                          = String
  type RoleArn                                           = String
  type S3BucketName                                      = String
  type S3ObjectKey                                       = String
  type ScanSchedule                                      = String
  type SecretArn                                         = String
  type SecurityGroupIdList                               = js.Array[VpcSecurityGroupId]
  type SharePointUrlList                                 = js.Array[Url]
  type SubnetId                                          = String
  type SubnetIdList                                      = js.Array[SubnetId]
  type TableName                                         = String
  type Timestamp                                         = js.Date
  type Title                                             = String
  type Url                                               = String
  type ValueImportanceMap                                = js.Dictionary[Importance]
  type ValueImportanceMapKey                             = String
  type VpcSecurityGroupId                                = String

  implicit final class KendraOps(private val service: Kendra) extends AnyVal {

    @inline def batchDeleteDocumentFuture(params: BatchDeleteDocumentRequest): Future[BatchDeleteDocumentResponse] =
      service.batchDeleteDocument(params).promise().toFuture
    @inline def batchPutDocumentFuture(params: BatchPutDocumentRequest): Future[BatchPutDocumentResponse] =
      service.batchPutDocument(params).promise().toFuture
    @inline def createDataSourceFuture(params: CreateDataSourceRequest): Future[CreateDataSourceResponse] =
      service.createDataSource(params).promise().toFuture
    @inline def createFaqFuture(params: CreateFaqRequest): Future[CreateFaqResponse] =
      service.createFaq(params).promise().toFuture
    @inline def createIndexFuture(params: CreateIndexRequest): Future[CreateIndexResponse] =
      service.createIndex(params).promise().toFuture
    @inline def deleteFaqFuture(params: DeleteFaqRequest): Future[js.Object] =
      service.deleteFaq(params).promise().toFuture
    @inline def deleteIndexFuture(params: DeleteIndexRequest): Future[js.Object] =
      service.deleteIndex(params).promise().toFuture
    @inline def describeDataSourceFuture(params: DescribeDataSourceRequest): Future[DescribeDataSourceResponse] =
      service.describeDataSource(params).promise().toFuture
    @inline def describeFaqFuture(params: DescribeFaqRequest): Future[DescribeFaqResponse] =
      service.describeFaq(params).promise().toFuture
    @inline def describeIndexFuture(params: DescribeIndexRequest): Future[DescribeIndexResponse] =
      service.describeIndex(params).promise().toFuture
    @inline def listDataSourceSyncJobsFuture(
        params: ListDataSourceSyncJobsRequest
    ): Future[ListDataSourceSyncJobsResponse] = service.listDataSourceSyncJobs(params).promise().toFuture
    @inline def listDataSourcesFuture(params: ListDataSourcesRequest): Future[ListDataSourcesResponse] =
      service.listDataSources(params).promise().toFuture
    @inline def listFaqsFuture(params: ListFaqsRequest): Future[ListFaqsResponse] =
      service.listFaqs(params).promise().toFuture
    @inline def listIndicesFuture(params: ListIndicesRequest): Future[ListIndicesResponse] =
      service.listIndices(params).promise().toFuture
    @inline def queryFuture(params: QueryRequest): Future[QueryResult] = service.query(params).promise().toFuture
    @inline def startDataSourceSyncJobFuture(
        params: StartDataSourceSyncJobRequest
    ): Future[StartDataSourceSyncJobResponse] = service.startDataSourceSyncJob(params).promise().toFuture
    @inline def stopDataSourceSyncJobFuture(params: StopDataSourceSyncJobRequest): Future[js.Object] =
      service.stopDataSourceSyncJob(params).promise().toFuture
    @inline def submitFeedbackFuture(params: SubmitFeedbackRequest): Future[js.Object] =
      service.submitFeedback(params).promise().toFuture
    @inline def updateDataSourceFuture(params: UpdateDataSourceRequest): Future[js.Object] =
      service.updateDataSource(params).promise().toFuture
    @inline def updateIndexFuture(params: UpdateIndexRequest): Future[js.Object] =
      service.updateIndex(params).promise().toFuture
  }
}

package kendra {
  @js.native
  @JSImport("aws-sdk", "Kendra")
  class Kendra() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchDeleteDocument(params: BatchDeleteDocumentRequest): Request[BatchDeleteDocumentResponse] = js.native
    def batchPutDocument(params: BatchPutDocumentRequest): Request[BatchPutDocumentResponse]          = js.native
    def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse]          = js.native
    def createFaq(params: CreateFaqRequest): Request[CreateFaqResponse]                               = js.native
    def createIndex(params: CreateIndexRequest): Request[CreateIndexResponse]                         = js.native
    def deleteFaq(params: DeleteFaqRequest): Request[js.Object]                                       = js.native
    def deleteIndex(params: DeleteIndexRequest): Request[js.Object]                                   = js.native
    def describeDataSource(params: DescribeDataSourceRequest): Request[DescribeDataSourceResponse]    = js.native
    def describeFaq(params: DescribeFaqRequest): Request[DescribeFaqResponse]                         = js.native
    def describeIndex(params: DescribeIndexRequest): Request[DescribeIndexResponse]                   = js.native
    def listDataSourceSyncJobs(params: ListDataSourceSyncJobsRequest): Request[ListDataSourceSyncJobsResponse] =
      js.native
    def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse] = js.native
    def listFaqs(params: ListFaqsRequest): Request[ListFaqsResponse]                      = js.native
    def listIndices(params: ListIndicesRequest): Request[ListIndicesResponse]             = js.native
    def query(params: QueryRequest): Request[QueryResult]                                 = js.native
    def startDataSourceSyncJob(params: StartDataSourceSyncJobRequest): Request[StartDataSourceSyncJobResponse] =
      js.native
    def stopDataSourceSyncJob(params: StopDataSourceSyncJobRequest): Request[js.Object] = js.native
    def submitFeedback(params: SubmitFeedbackRequest): Request[js.Object]               = js.native
    def updateDataSource(params: UpdateDataSourceRequest): Request[js.Object]           = js.native
    def updateIndex(params: UpdateIndexRequest): Request[js.Object]                     = js.native
  }

  /**
    * Access Control List files for the documents in a data source.
    */
  @js.native
  @Factory
  trait AccessControlListConfiguration extends js.Object {
    var KeyPath: js.UndefOr[S3ObjectKey]
  }

  /**
    * Provides information about the column that should be used for filtering the query response by groups.
    */
  @js.native
  @Factory
  trait AclConfiguration extends js.Object {
    var AllowedGroupsColumnName: ColumnName
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AdditionalResultAttribute extends js.Object {
    var Key: String
    var Value: AdditionalResultAttributeValue
    var ValueType: AdditionalResultAttributeValueType
  }

  /**
    * An attribute returned with a document from a search.
    */
  @js.native
  @Factory
  trait AdditionalResultAttributeValue extends js.Object {
    var TextWithHighlightsValue: js.UndefOr[TextWithHighlights]
  }

  @js.native
  sealed trait AdditionalResultAttributeValueType extends js.Any
  object AdditionalResultAttributeValueType extends js.Object {
    val TEXT_WITH_HIGHLIGHTS_VALUE = "TEXT_WITH_HIGHLIGHTS_VALUE".asInstanceOf[AdditionalResultAttributeValueType]

    val values = js.Object.freeze(js.Array(TEXT_WITH_HIGHLIGHTS_VALUE))
  }

  /**
    * Provides filtering the query results based on document attributes.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait BatchDeleteDocumentRequest extends js.Object {
    var DocumentIdList: DocumentIdList
    var IndexId: IndexId
  }

  @js.native
  @Factory
  trait BatchDeleteDocumentResponse extends js.Object {
    var FailedDocuments: js.UndefOr[BatchDeleteDocumentResponseFailedDocuments]
  }

  /**
    * Provides information about documents that could not be removed from an index by the <a>BatchDeleteDocument</a> operation.
    */
  @js.native
  @Factory
  trait BatchDeleteDocumentResponseFailedDocument extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var Id: js.UndefOr[DocumentId]
  }

  @js.native
  @Factory
  trait BatchPutDocumentRequest extends js.Object {
    var Documents: DocumentList
    var IndexId: IndexId
    var RoleArn: js.UndefOr[RoleArn]
  }

  @js.native
  @Factory
  trait BatchPutDocumentResponse extends js.Object {
    var FailedDocuments: js.UndefOr[BatchPutDocumentResponseFailedDocuments]
  }

  /**
    * Provides information about a document that could not be indexed.
    */
  @js.native
  @Factory
  trait BatchPutDocumentResponseFailedDocument extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var Id: js.UndefOr[DocumentId]
  }

  /**
    * Gathers information about when a particular result was clicked by a user. Your application uses the <a>SubmitFeedback</a> operation to provide click information.
    */
  @js.native
  @Factory
  trait ClickFeedback extends js.Object {
    var ClickTime: Timestamp
    var ResultId: ResultId
  }

  /**
    * Provides information about how Amazon Kendra should use the columns of a database in an index.
    */
  @js.native
  @Factory
  trait ColumnConfiguration extends js.Object {
    var ChangeDetectingColumns: ChangeDetectingColumns
    var DocumentDataColumnName: ColumnName
    var DocumentIdColumnName: ColumnName
    var DocumentTitleColumnName: js.UndefOr[ColumnName]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
  }

  /**
    * Provides the information necessary to connect to a database.
    */
  @js.native
  @Factory
  trait ConnectionConfiguration extends js.Object {
    var DatabaseHost: DatabaseHost
    var DatabaseName: DatabaseName
    var DatabasePort: DatabasePort
    var SecretArn: SecretArn
    var TableName: TableName
  }

  @js.native
  sealed trait ContentType extends js.Any
  object ContentType extends js.Object {
    val PDF        = "PDF".asInstanceOf[ContentType]
    val HTML       = "HTML".asInstanceOf[ContentType]
    val MS_WORD    = "MS_WORD".asInstanceOf[ContentType]
    val PLAIN_TEXT = "PLAIN_TEXT".asInstanceOf[ContentType]
    val PPT        = "PPT".asInstanceOf[ContentType]

    val values = js.Object.freeze(js.Array(PDF, HTML, MS_WORD, PLAIN_TEXT, PPT))
  }

  @js.native
  @Factory
  trait CreateDataSourceRequest extends js.Object {
    var Configuration: DataSourceConfiguration
    var IndexId: IndexId
    var Name: DataSourceName
    var RoleArn: RoleArn
    var Type: DataSourceType
    var Description: js.UndefOr[Description]
    var Schedule: js.UndefOr[ScanSchedule]
  }

  @js.native
  @Factory
  trait CreateDataSourceResponse extends js.Object {
    var Id: DataSourceId
  }

  @js.native
  @Factory
  trait CreateFaqRequest extends js.Object {
    var IndexId: IndexId
    var Name: FaqName
    var RoleArn: RoleArn
    var S3Path: S3Path
    var Description: js.UndefOr[Description]
  }

  @js.native
  @Factory
  trait CreateFaqResponse extends js.Object {
    var Id: js.UndefOr[FaqId]
  }

  @js.native
  @Factory
  trait CreateIndexRequest extends js.Object {
    var Name: IndexName
    var RoleArn: RoleArn
    var Description: js.UndefOr[Description]
    var ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
  }

  @js.native
  @Factory
  trait CreateIndexResponse extends js.Object {
    var Id: js.UndefOr[IndexId]
  }

  /**
    * Configuration information for a Amazon Kendra data source.
    */
  @js.native
  @Factory
  trait DataSourceConfiguration extends js.Object {
    var DatabaseConfiguration: js.UndefOr[DatabaseConfiguration]
    var S3Configuration: js.UndefOr[S3DataSourceConfiguration]
    var SharePointConfiguration: js.UndefOr[SharePointConfiguration]
  }

  @js.native
  sealed trait DataSourceStatus extends js.Any
  object DataSourceStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[DataSourceStatus]
    val DELETING = "DELETING".asInstanceOf[DataSourceStatus]
    val FAILED   = "FAILED".asInstanceOf[DataSourceStatus]
    val UPDATING = "UPDATING".asInstanceOf[DataSourceStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[DataSourceStatus]

    val values = js.Object.freeze(js.Array(CREATING, DELETING, FAILED, UPDATING, ACTIVE))
  }

  /**
    * Summary information for a Amazon Kendra data source. Returned in a call to .
    */
  @js.native
  @Factory
  trait DataSourceSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Id: js.UndefOr[DataSourceId]
    var Name: js.UndefOr[DataSourceName]
    var Status: js.UndefOr[DataSourceStatus]
    var Type: js.UndefOr[DataSourceType]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  /**
    * Provides information about a synchronization job.
    */
  @js.native
  @Factory
  trait DataSourceSyncJob extends js.Object {
    var DataSourceErrorCode: js.UndefOr[String]
    var EndTime: js.UndefOr[Timestamp]
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var ExecutionId: js.UndefOr[String]
    var StartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[DataSourceSyncJobStatus]
  }

  @js.native
  sealed trait DataSourceSyncJobStatus extends js.Any
  object DataSourceSyncJobStatus extends js.Object {
    val FAILED     = "FAILED".asInstanceOf[DataSourceSyncJobStatus]
    val SUCCEEDED  = "SUCCEEDED".asInstanceOf[DataSourceSyncJobStatus]
    val SYNCING    = "SYNCING".asInstanceOf[DataSourceSyncJobStatus]
    val INCOMPLETE = "INCOMPLETE".asInstanceOf[DataSourceSyncJobStatus]
    val STOPPING   = "STOPPING".asInstanceOf[DataSourceSyncJobStatus]
    val ABORTED    = "ABORTED".asInstanceOf[DataSourceSyncJobStatus]

    val values = js.Object.freeze(js.Array(FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING, ABORTED))
  }

  /**
    * Maps a column or attribute in the data source to an index field. You must first create the fields in the index using the <a>UpdateIndex</a> operation.
    */
  @js.native
  @Factory
  trait DataSourceToIndexFieldMapping extends js.Object {
    var DataSourceFieldName: DataSourceFieldName
    var IndexFieldName: IndexFieldName
    var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat]
  }

  @js.native
  sealed trait DataSourceType extends js.Any
  object DataSourceType extends js.Object {
    val S3         = "S3".asInstanceOf[DataSourceType]
    val SHAREPOINT = "SHAREPOINT".asInstanceOf[DataSourceType]
    val DATABASE   = "DATABASE".asInstanceOf[DataSourceType]

    val values = js.Object.freeze(js.Array(S3, SHAREPOINT, DATABASE))
  }

  /**
    * Provides information for connecting to an Amazon VPC.
    */
  @js.native
  @Factory
  trait DataSourceVpcConfiguration extends js.Object {
    var SecurityGroupIds: SecurityGroupIdList
    var SubnetIds: SubnetIdList
  }

  /**
    * Provides the information necessary to connect a database to an index.
    */
  @js.native
  @Factory
  trait DatabaseConfiguration extends js.Object {
    var ColumnConfiguration: ColumnConfiguration
    var ConnectionConfiguration: ConnectionConfiguration
    var DatabaseEngineType: DatabaseEngineType
    var AclConfiguration: js.UndefOr[AclConfiguration]
    var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration]
  }

  @js.native
  sealed trait DatabaseEngineType extends js.Any
  object DatabaseEngineType extends js.Object {
    val RDS_AURORA_MYSQL      = "RDS_AURORA_MYSQL".asInstanceOf[DatabaseEngineType]
    val RDS_AURORA_POSTGRESQL = "RDS_AURORA_POSTGRESQL".asInstanceOf[DatabaseEngineType]
    val RDS_MYSQL             = "RDS_MYSQL".asInstanceOf[DatabaseEngineType]
    val RDS_POSTGRESQL        = "RDS_POSTGRESQL".asInstanceOf[DatabaseEngineType]

    val values = js.Object.freeze(js.Array(RDS_AURORA_MYSQL, RDS_AURORA_POSTGRESQL, RDS_MYSQL, RDS_POSTGRESQL))
  }

  @js.native
  @Factory
  trait DeleteFaqRequest extends js.Object {
    var Id: FaqId
    var IndexId: IndexId
  }

  @js.native
  @Factory
  trait DeleteIndexRequest extends js.Object {
    var Id: IndexId
  }

  @js.native
  @Factory
  trait DescribeDataSourceRequest extends js.Object {
    var Id: DataSourceId
    var IndexId: IndexId
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeFaqRequest extends js.Object {
    var Id: FaqId
    var IndexId: IndexId
  }

  @js.native
  @Factory
  trait DescribeFaqResponse extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var Id: js.UndefOr[FaqId]
    var IndexId: js.UndefOr[IndexId]
    var Name: js.UndefOr[FaqName]
    var RoleArn: js.UndefOr[RoleArn]
    var S3Path: js.UndefOr[S3Path]
    var Status: js.UndefOr[FaqStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait DescribeIndexRequest extends js.Object {
    var Id: IndexId
  }

  @js.native
  @Factory
  trait DescribeIndexResponse extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var DocumentMetadataConfigurations: js.UndefOr[DocumentMetadataConfigurationList]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var Id: js.UndefOr[IndexId]
    var IndexStatistics: js.UndefOr[IndexStatistics]
    var Name: js.UndefOr[IndexName]
    var RoleArn: js.UndefOr[RoleArn]
    var ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
    var Status: js.UndefOr[IndexStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  /**
    * A document in an index.
    */
  @js.native
  @Factory
  trait Document extends js.Object {
    var Id: DocumentId
    var AccessControlList: js.UndefOr[PrincipalList]
    var Attributes: js.UndefOr[DocumentAttributeList]
    var Blob: js.UndefOr[Blob]
    var ContentType: js.UndefOr[ContentType]
    var S3Path: js.UndefOr[S3Path]
    var Title: js.UndefOr[Title]
  }

  /**
    * A custom attribute value assigned to a document.
    */
  @js.native
  @Factory
  trait DocumentAttribute extends js.Object {
    var Key: DocumentAttributeKey
    var Value: DocumentAttributeValue
  }

  /**
    * The value of a custom document attribute. You can only provide one value for a custom attribute.
    */
  @js.native
  @Factory
  trait DocumentAttributeValue extends js.Object {
    var DateValue: js.UndefOr[Timestamp]
    var LongValue: js.UndefOr[Double]
    var StringListValue: js.UndefOr[DocumentAttributeStringListValue]
    var StringValue: js.UndefOr[DocumentAttributeStringValue]
  }

  /**
    * Provides the count of documents that match a particular attribute when doing a faceted search.
    */
  @js.native
  @Factory
  trait DocumentAttributeValueCountPair extends js.Object {
    var Count: js.UndefOr[Int]
    var DocumentAttributeValue: js.UndefOr[DocumentAttributeValue]
  }

  @js.native
  sealed trait DocumentAttributeValueType extends js.Any
  object DocumentAttributeValueType extends js.Object {
    val STRING_VALUE      = "STRING_VALUE".asInstanceOf[DocumentAttributeValueType]
    val STRING_LIST_VALUE = "STRING_LIST_VALUE".asInstanceOf[DocumentAttributeValueType]
    val LONG_VALUE        = "LONG_VALUE".asInstanceOf[DocumentAttributeValueType]
    val DATE_VALUE        = "DATE_VALUE".asInstanceOf[DocumentAttributeValueType]

    val values = js.Object.freeze(js.Array(STRING_VALUE, STRING_LIST_VALUE, LONG_VALUE, DATE_VALUE))
  }

  /**
    * Specifies the properties of a custom index field.
    */
  @js.native
  @Factory
  trait DocumentMetadataConfiguration extends js.Object {
    var Name: DocumentMetadataConfigurationName
    var Type: DocumentAttributeValueType
    var Relevance: js.UndefOr[Relevance]
    var Search: js.UndefOr[Search]
  }

  /**
    * Document metadata files that contain information such as the document access control information, source URI, document author, and custom attributes. Each metadata file contains metadata about a single document.
    */
  @js.native
  @Factory
  trait DocumentsMetadataConfiguration extends js.Object {
    var S3Prefix: js.UndefOr[S3ObjectKey]
  }

  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode extends js.Object {
    val InternalError  = "InternalError".asInstanceOf[ErrorCode]
    val InvalidRequest = "InvalidRequest".asInstanceOf[ErrorCode]

    val values = js.Object.freeze(js.Array(InternalError, InvalidRequest))
  }

  /**
    * Information a document attribute
    */
  @js.native
  @Factory
  trait Facet extends js.Object {
    var DocumentAttributeKey: js.UndefOr[DocumentAttributeKey]
  }

  /**
    * The facet values for the documents in the response.
    */
  @js.native
  @Factory
  trait FacetResult extends js.Object {
    var DocumentAttributeKey: js.UndefOr[DocumentAttributeKey]
    var DocumentAttributeValueCountPairs: js.UndefOr[DocumentAttributeValueCountPairList]
  }

  /**
    * Provides statistical information about the FAQ questions and answers contained in an index.
    */
  @js.native
  @Factory
  trait FaqStatistics extends js.Object {
    var IndexedQuestionAnswersCount: IndexedQuestionAnswersCount
  }

  @js.native
  sealed trait FaqStatus extends js.Any
  object FaqStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[FaqStatus]
    val UPDATING = "UPDATING".asInstanceOf[FaqStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[FaqStatus]
    val DELETING = "DELETING".asInstanceOf[FaqStatus]
    val FAILED   = "FAILED".asInstanceOf[FaqStatus]

    val values = js.Object.freeze(js.Array(CREATING, UPDATING, ACTIVE, DELETING, FAILED))
  }

  /**
    * Provides information about a frequently asked questions and answer contained in an index.
    */
  @js.native
  @Factory
  trait FaqSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Id: js.UndefOr[FaqId]
    var Name: js.UndefOr[FaqName]
    var Status: js.UndefOr[FaqStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  /**
    * Provides information that you can use to highlight a search result so that your users can quickly identify terms in the response.
    */
  @js.native
  @Factory
  trait Highlight extends js.Object {
    var BeginOffset: Int
    var EndOffset: Int
    var TopAnswer: js.UndefOr[Boolean]
  }

  /**
    * A summary of information about an index.
    */
  @js.native
  @Factory
  trait IndexConfigurationSummary extends js.Object {
    var CreatedAt: Timestamp
    var Status: IndexStatus
    var UpdatedAt: Timestamp
    var Id: js.UndefOr[IndexId]
    var Name: js.UndefOr[IndexName]
  }

  /**
    * Provides information about the number of documents and the number of questions and answers in an index.
    */
  @js.native
  @Factory
  trait IndexStatistics extends js.Object {
    var FaqStatistics: FaqStatistics
    var TextDocumentStatistics: TextDocumentStatistics
  }

  @js.native
  sealed trait IndexStatus extends js.Any
  object IndexStatus extends js.Object {
    val CREATING        = "CREATING".asInstanceOf[IndexStatus]
    val ACTIVE          = "ACTIVE".asInstanceOf[IndexStatus]
    val DELETING        = "DELETING".asInstanceOf[IndexStatus]
    val FAILED          = "FAILED".asInstanceOf[IndexStatus]
    val SYSTEM_UPDATING = "SYSTEM_UPDATING".asInstanceOf[IndexStatus]

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING, FAILED, SYSTEM_UPDATING))
  }

  @js.native
  @Factory
  trait ListDataSourceSyncJobsRequest extends js.Object {
    var Id: DataSourceId
    var IndexId: IndexId
    var MaxResults: js.UndefOr[MaxResultsIntegerForListDataSourceSyncJobsRequest]
    var NextToken: js.UndefOr[NextToken]
    var StartTimeFilter: js.UndefOr[TimeRange]
    var StatusFilter: js.UndefOr[DataSourceSyncJobStatus]
  }

  @js.native
  @Factory
  trait ListDataSourceSyncJobsResponse extends js.Object {
    var History: js.UndefOr[DataSourceSyncJobHistoryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDataSourcesRequest extends js.Object {
    var IndexId: IndexId
    var MaxResults: js.UndefOr[MaxResultsIntegerForListDataSourcesRequest]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDataSourcesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SummaryItems: js.UndefOr[DataSourceSummaryList]
  }

  @js.native
  @Factory
  trait ListFaqsRequest extends js.Object {
    var IndexId: IndexId
    var MaxResults: js.UndefOr[MaxResultsIntegerForListFaqsRequest]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListFaqsResponse extends js.Object {
    var FaqSummaryItems: js.UndefOr[FaqSummaryItems]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListIndicesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsIntegerForListIndicesRequest]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListIndicesResponse extends js.Object {
    var IndexConfigurationSummaryItems: js.UndefOr[IndexConfigurationSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  sealed trait Order extends js.Any
  object Order extends js.Object {
    val ASCENDING  = "ASCENDING".asInstanceOf[Order]
    val DESCENDING = "DESCENDING".asInstanceOf[Order]

    val values = js.Object.freeze(js.Array(ASCENDING, DESCENDING))
  }

  /**
    * Provides user and group information for document access filtering.
    */
  @js.native
  @Factory
  trait Principal extends js.Object {
    var Access: ReadAccessType
    var Name: PrincipalName
    var Type: PrincipalType
  }

  @js.native
  sealed trait PrincipalType extends js.Any
  object PrincipalType extends js.Object {
    val USER  = "USER".asInstanceOf[PrincipalType]
    val GROUP = "GROUP".asInstanceOf[PrincipalType]

    val values = js.Object.freeze(js.Array(USER, GROUP))
  }

  @js.native
  @Factory
  trait QueryRequest extends js.Object {
    var IndexId: IndexId
    var QueryText: QueryText
    var AttributeFilter: js.UndefOr[AttributeFilter]
    var Facets: js.UndefOr[FacetList]
    var PageNumber: js.UndefOr[Int]
    var PageSize: js.UndefOr[Int]
    var QueryResultTypeFilter: js.UndefOr[QueryResultType]
    var RequestedDocumentAttributes: js.UndefOr[DocumentAttributeKeyList]
  }

  @js.native
  @Factory
  trait QueryResult extends js.Object {
    var FacetResults: js.UndefOr[FacetResultList]
    var QueryId: js.UndefOr[QueryId]
    var ResultItems: js.UndefOr[QueryResultItemList]
    var TotalNumberOfResults: js.UndefOr[Int]
  }

  /**
    * A single query result.
    *  A query result contains information about a document returned by the query. This includes the original location of the document, a list of attributes assigned to the document, and relevant text from the document that satisfies the query.
    */
  @js.native
  @Factory
  trait QueryResultItem extends js.Object {
    var AdditionalAttributes: js.UndefOr[AdditionalResultAttributeList]
    var DocumentAttributes: js.UndefOr[DocumentAttributeList]
    var DocumentExcerpt: js.UndefOr[TextWithHighlights]
    var DocumentId: js.UndefOr[DocumentId]
    var DocumentTitle: js.UndefOr[TextWithHighlights]
    var DocumentURI: js.UndefOr[Url]
    var Id: js.UndefOr[ResultId]
    var Type: js.UndefOr[QueryResultType]
  }

  @js.native
  sealed trait QueryResultType extends js.Any
  object QueryResultType extends js.Object {
    val DOCUMENT        = "DOCUMENT".asInstanceOf[QueryResultType]
    val QUESTION_ANSWER = "QUESTION_ANSWER".asInstanceOf[QueryResultType]
    val ANSWER          = "ANSWER".asInstanceOf[QueryResultType]

    val values = js.Object.freeze(js.Array(DOCUMENT, QUESTION_ANSWER, ANSWER))
  }

  @js.native
  sealed trait ReadAccessType extends js.Any
  object ReadAccessType extends js.Object {
    val ALLOW = "ALLOW".asInstanceOf[ReadAccessType]
    val DENY  = "DENY".asInstanceOf[ReadAccessType]

    val values = js.Object.freeze(js.Array(ALLOW, DENY))
  }

  /**
    * Provides information for manually tuning the relevance of a field in a search. When a query includes terms that match the field, the results are given a boost in the response based on these tuning parameters.
    */
  @js.native
  @Factory
  trait Relevance extends js.Object {
    var Duration: js.UndefOr[Duration]
    var Freshness: js.UndefOr[DocumentMetadataBoolean]
    var Importance: js.UndefOr[Importance]
    var RankOrder: js.UndefOr[Order]
    var ValueImportanceMap: js.UndefOr[ValueImportanceMap]
  }

  /**
    * Provides feedback on how relevant a document is to a search. Your application uses the <a>SubmitFeedback</a> operation to provide relevance information.
    */
  @js.native
  @Factory
  trait RelevanceFeedback extends js.Object {
    var RelevanceValue: RelevanceType
    var ResultId: ResultId
  }

  @js.native
  sealed trait RelevanceType extends js.Any
  object RelevanceType extends js.Object {
    val RELEVANT     = "RELEVANT".asInstanceOf[RelevanceType]
    val NOT_RELEVANT = "NOT_RELEVANT".asInstanceOf[RelevanceType]

    val values = js.Object.freeze(js.Array(RELEVANT, NOT_RELEVANT))
  }

  /**
    * Provides configuration information for a data source to index documents in an Amazon S3 bucket.
    */
  @js.native
  @Factory
  trait S3DataSourceConfiguration extends js.Object {
    var BucketName: S3BucketName
    var AccessControlListConfiguration: js.UndefOr[AccessControlListConfiguration]
    var DocumentsMetadataConfiguration: js.UndefOr[DocumentsMetadataConfiguration]
    var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings]
    var InclusionPrefixes: js.UndefOr[DataSourceInclusionsExclusionsStrings]
  }

  /**
    * Information required to find a specific file in an Amazon S3 bucket.
    */
  @js.native
  @Factory
  trait S3Path extends js.Object {
    var Bucket: S3BucketName
    var Key: S3ObjectKey
  }

  /**
    * Provides information about how a custom index field is used during a search.
    */
  @js.native
  @Factory
  trait Search extends js.Object {
    var Displayable: js.UndefOr[Boolean]
    var Facetable: js.UndefOr[Boolean]
    var Searchable: js.UndefOr[Boolean]
  }

  /**
    * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support asymmetric CMKs.
    */
  @js.native
  @Factory
  trait ServerSideEncryptionConfiguration extends js.Object {
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * Provides configuration information for connecting to a Microsoft SharePoint data source.
    */
  @js.native
  @Factory
  trait SharePointConfiguration extends js.Object {
    var SecretArn: SecretArn
    var SharePointVersion: SharePointVersion
    var Urls: SharePointUrlList
    var CrawlAttachments: js.UndefOr[Boolean]
    var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName]
    var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList]
    var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration]
  }

  @js.native
  sealed trait SharePointVersion extends js.Any
  object SharePointVersion extends js.Object {
    val SHAREPOINT_ONLINE = "SHAREPOINT_ONLINE".asInstanceOf[SharePointVersion]

    val values = js.Object.freeze(js.Array(SHAREPOINT_ONLINE))
  }

  @js.native
  @Factory
  trait StartDataSourceSyncJobRequest extends js.Object {
    var Id: DataSourceId
    var IndexId: IndexId
  }

  @js.native
  @Factory
  trait StartDataSourceSyncJobResponse extends js.Object {
    var ExecutionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait StopDataSourceSyncJobRequest extends js.Object {
    var Id: DataSourceId
    var IndexId: IndexId
  }

  @js.native
  @Factory
  trait SubmitFeedbackRequest extends js.Object {
    var IndexId: IndexId
    var QueryId: QueryId
    var ClickFeedbackItems: js.UndefOr[ClickFeedbackList]
    var RelevanceFeedbackItems: js.UndefOr[RelevanceFeedbackList]
  }

  /**
    * Provides information about text documents indexed in an index.
    */
  @js.native
  @Factory
  trait TextDocumentStatistics extends js.Object {
    var IndexedTextDocumentsCount: IndexedTextDocumentsCount
  }

  /**
    * Provides text and information about where to highlight the text.
    */
  @js.native
  @Factory
  trait TextWithHighlights extends js.Object {
    var Highlights: js.UndefOr[HighlightList]
    var Text: js.UndefOr[String]
  }

  /**
    * Provides a range of time.
    */
  @js.native
  @Factory
  trait TimeRange extends js.Object {
    var EndTime: js.UndefOr[Timestamp]
    var StartTime: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait UpdateDataSourceRequest extends js.Object {
    var Id: DataSourceId
    var IndexId: IndexId
    var Configuration: js.UndefOr[DataSourceConfiguration]
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[DataSourceName]
    var RoleArn: js.UndefOr[RoleArn]
    var Schedule: js.UndefOr[ScanSchedule]
  }

  @js.native
  @Factory
  trait UpdateIndexRequest extends js.Object {
    var Id: IndexId
    var Description: js.UndefOr[Description]
    var DocumentMetadataConfigurationUpdates: js.UndefOr[DocumentMetadataConfigurationList]
    var Name: js.UndefOr[IndexName]
    var RoleArn: js.UndefOr[RoleArn]
  }
}
