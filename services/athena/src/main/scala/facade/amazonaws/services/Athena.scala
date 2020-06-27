package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object athena {
  type AmazonResourceName              = String
  type BoxedBoolean                    = Boolean
  type BytesScannedCutoffValue         = Double
  type ColumnInfoList                  = js.Array[ColumnInfo]
  type DatabaseString                  = String
  type Date                            = js.Date
  type DescriptionString               = String
  type ErrorCode                       = String
  type ErrorMessage                    = String
  type IdempotencyToken                = String
  type MaxNamedQueriesCount            = Int
  type MaxQueryExecutionsCount         = Int
  type MaxQueryResults                 = Int
  type MaxTagsCount                    = Int
  type MaxWorkGroupsCount              = Int
  type NameString                      = String
  type NamedQueryId                    = String
  type NamedQueryIdList                = js.Array[NamedQueryId]
  type NamedQueryList                  = js.Array[NamedQuery]
  type QueryExecutionId                = String
  type QueryExecutionIdList            = js.Array[QueryExecutionId]
  type QueryExecutionList              = js.Array[QueryExecution]
  type QueryString                     = String
  type RowList                         = js.Array[Row]
  type TagKey                          = String
  type TagKeyList                      = js.Array[TagKey]
  type TagList                         = js.Array[Tag]
  type TagValue                        = String
  type Token                           = String
  type UnprocessedNamedQueryIdList     = js.Array[UnprocessedNamedQueryId]
  type UnprocessedQueryExecutionIdList = js.Array[UnprocessedQueryExecutionId]
  type WorkGroupDescriptionString      = String
  type WorkGroupName                   = String
  type WorkGroupsList                  = js.Array[WorkGroupSummary]
  type datumList                       = js.Array[Datum]
  type datumString                     = String

  implicit final class AthenaOps(private val service: Athena) extends AnyVal {

    @inline def batchGetNamedQueryFuture(params: BatchGetNamedQueryInput): Future[BatchGetNamedQueryOutput] =
      service.batchGetNamedQuery(params).promise().toFuture
    @inline def batchGetQueryExecutionFuture(
        params: BatchGetQueryExecutionInput
    ): Future[BatchGetQueryExecutionOutput] = service.batchGetQueryExecution(params).promise().toFuture
    @inline def createNamedQueryFuture(params: CreateNamedQueryInput): Future[CreateNamedQueryOutput] =
      service.createNamedQuery(params).promise().toFuture
    @inline def createWorkGroupFuture(params: CreateWorkGroupInput): Future[CreateWorkGroupOutput] =
      service.createWorkGroup(params).promise().toFuture
    @inline def deleteNamedQueryFuture(params: DeleteNamedQueryInput): Future[DeleteNamedQueryOutput] =
      service.deleteNamedQuery(params).promise().toFuture
    @inline def deleteWorkGroupFuture(params: DeleteWorkGroupInput): Future[DeleteWorkGroupOutput] =
      service.deleteWorkGroup(params).promise().toFuture
    @inline def getNamedQueryFuture(params: GetNamedQueryInput): Future[GetNamedQueryOutput] =
      service.getNamedQuery(params).promise().toFuture
    @inline def getQueryExecutionFuture(params: GetQueryExecutionInput): Future[GetQueryExecutionOutput] =
      service.getQueryExecution(params).promise().toFuture
    @inline def getQueryResultsFuture(params: GetQueryResultsInput): Future[GetQueryResultsOutput] =
      service.getQueryResults(params).promise().toFuture
    @inline def getWorkGroupFuture(params: GetWorkGroupInput): Future[GetWorkGroupOutput] =
      service.getWorkGroup(params).promise().toFuture
    @inline def listNamedQueriesFuture(params: ListNamedQueriesInput): Future[ListNamedQueriesOutput] =
      service.listNamedQueries(params).promise().toFuture
    @inline def listQueryExecutionsFuture(params: ListQueryExecutionsInput): Future[ListQueryExecutionsOutput] =
      service.listQueryExecutions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listWorkGroupsFuture(params: ListWorkGroupsInput): Future[ListWorkGroupsOutput] =
      service.listWorkGroups(params).promise().toFuture
    @inline def startQueryExecutionFuture(params: StartQueryExecutionInput): Future[StartQueryExecutionOutput] =
      service.startQueryExecution(params).promise().toFuture
    @inline def stopQueryExecutionFuture(params: StopQueryExecutionInput): Future[StopQueryExecutionOutput] =
      service.stopQueryExecution(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise().toFuture
    @inline def updateWorkGroupFuture(params: UpdateWorkGroupInput): Future[UpdateWorkGroupOutput] =
      service.updateWorkGroup(params).promise().toFuture
  }
}

package athena {
  @js.native
  @JSImport("aws-sdk", "Athena")
  class Athena() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetNamedQuery(params: BatchGetNamedQueryInput): Request[BatchGetNamedQueryOutput]             = js.native
    def batchGetQueryExecution(params: BatchGetQueryExecutionInput): Request[BatchGetQueryExecutionOutput] = js.native
    def createNamedQuery(params: CreateNamedQueryInput): Request[CreateNamedQueryOutput]                   = js.native
    def createWorkGroup(params: CreateWorkGroupInput): Request[CreateWorkGroupOutput]                      = js.native
    def deleteNamedQuery(params: DeleteNamedQueryInput): Request[DeleteNamedQueryOutput]                   = js.native
    def deleteWorkGroup(params: DeleteWorkGroupInput): Request[DeleteWorkGroupOutput]                      = js.native
    def getNamedQuery(params: GetNamedQueryInput): Request[GetNamedQueryOutput]                            = js.native
    def getQueryExecution(params: GetQueryExecutionInput): Request[GetQueryExecutionOutput]                = js.native
    def getQueryResults(params: GetQueryResultsInput): Request[GetQueryResultsOutput]                      = js.native
    def getWorkGroup(params: GetWorkGroupInput): Request[GetWorkGroupOutput]                               = js.native
    def listNamedQueries(params: ListNamedQueriesInput): Request[ListNamedQueriesOutput]                   = js.native
    def listQueryExecutions(params: ListQueryExecutionsInput): Request[ListQueryExecutionsOutput]          = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput]          = js.native
    def listWorkGroups(params: ListWorkGroupsInput): Request[ListWorkGroupsOutput]                         = js.native
    def startQueryExecution(params: StartQueryExecutionInput): Request[StartQueryExecutionOutput]          = js.native
    def stopQueryExecution(params: StopQueryExecutionInput): Request[StopQueryExecutionOutput]             = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput]                                  = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput]                            = js.native
    def updateWorkGroup(params: UpdateWorkGroupInput): Request[UpdateWorkGroupOutput]                      = js.native
  }

  @js.native
  @Factory
  trait BatchGetNamedQueryInput extends js.Object {
    var NamedQueryIds: NamedQueryIdList
  }

  @js.native
  @Factory
  trait BatchGetNamedQueryOutput extends js.Object {
    var NamedQueries: js.UndefOr[NamedQueryList]
    var UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList]
  }

  @js.native
  @Factory
  trait BatchGetQueryExecutionInput extends js.Object {
    var QueryExecutionIds: QueryExecutionIdList
  }

  @js.native
  @Factory
  trait BatchGetQueryExecutionOutput extends js.Object {
    var QueryExecutions: js.UndefOr[QueryExecutionList]
    var UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList]
  }

  /**
    * Information about the columns in a query execution result.
    */
  @js.native
  @Factory
  trait ColumnInfo extends js.Object {
    var Name: String
    var Type: String
    var CaseSensitive: js.UndefOr[Boolean]
    var CatalogName: js.UndefOr[String]
    var Label: js.UndefOr[String]
    var Nullable: js.UndefOr[ColumnNullable]
    var Precision: js.UndefOr[Int]
    var Scale: js.UndefOr[Int]
    var SchemaName: js.UndefOr[String]
    var TableName: js.UndefOr[String]
  }

  @js.native
  sealed trait ColumnNullable extends js.Any
  object ColumnNullable extends js.Object {
    val NOT_NULL = "NOT_NULL".asInstanceOf[ColumnNullable]
    val NULLABLE = "NULLABLE".asInstanceOf[ColumnNullable]
    val UNKNOWN  = "UNKNOWN".asInstanceOf[ColumnNullable]

    val values = js.Object.freeze(js.Array(NOT_NULL, NULLABLE, UNKNOWN))
  }

  @js.native
  @Factory
  trait CreateNamedQueryInput extends js.Object {
    var Database: DatabaseString
    var Name: NameString
    var QueryString: QueryString
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var Description: js.UndefOr[DescriptionString]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  @js.native
  @Factory
  trait CreateNamedQueryOutput extends js.Object {
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  @js.native
  @Factory
  trait CreateWorkGroupInput extends js.Object {
    var Name: WorkGroupName
    var Configuration: js.UndefOr[WorkGroupConfiguration]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateWorkGroupOutput extends js.Object {}

  /**
    * A piece of data (a field in the table).
    */
  @js.native
  @Factory
  trait Datum extends js.Object {
    var VarCharValue: js.UndefOr[datumString]
  }

  @js.native
  @Factory
  trait DeleteNamedQueryInput extends js.Object {
    var NamedQueryId: NamedQueryId
  }

  @js.native
  @Factory
  trait DeleteNamedQueryOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
    var RecursiveDeleteOption: js.UndefOr[BoxedBoolean]
  }

  @js.native
  @Factory
  trait DeleteWorkGroupOutput extends js.Object {}

  /**
    * If query results are encrypted in Amazon S3, indicates the encryption option used (for example, <code>SSE-KMS</code> or <code>CSE-KMS</code>) and key information.
    */
  @js.native
  @Factory
  trait EncryptionConfiguration extends js.Object {
    var EncryptionOption: EncryptionOption
    var KmsKey: js.UndefOr[String]
  }

  @js.native
  sealed trait EncryptionOption extends js.Any
  object EncryptionOption extends js.Object {
    val SSE_S3  = "SSE_S3".asInstanceOf[EncryptionOption]
    val SSE_KMS = "SSE_KMS".asInstanceOf[EncryptionOption]
    val CSE_KMS = "CSE_KMS".asInstanceOf[EncryptionOption]

    val values = js.Object.freeze(js.Array(SSE_S3, SSE_KMS, CSE_KMS))
  }

  @js.native
  @Factory
  trait GetNamedQueryInput extends js.Object {
    var NamedQueryId: NamedQueryId
  }

  @js.native
  @Factory
  trait GetNamedQueryOutput extends js.Object {
    var NamedQuery: js.UndefOr[NamedQuery]
  }

  @js.native
  @Factory
  trait GetQueryExecutionInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
  }

  @js.native
  @Factory
  trait GetQueryExecutionOutput extends js.Object {
    var QueryExecution: js.UndefOr[QueryExecution]
  }

  @js.native
  @Factory
  trait GetQueryResultsInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
    var MaxResults: js.UndefOr[MaxQueryResults]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetQueryResultsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var ResultSet: js.UndefOr[ResultSet]
    var UpdateCount: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait GetWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
  }

  @js.native
  @Factory
  trait GetWorkGroupOutput extends js.Object {
    var WorkGroup: js.UndefOr[WorkGroup]
  }

  @js.native
  @Factory
  trait ListNamedQueriesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxNamedQueriesCount]
    var NextToken: js.UndefOr[Token]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  @js.native
  @Factory
  trait ListNamedQueriesOutput extends js.Object {
    var NamedQueryIds: js.UndefOr[NamedQueryIdList]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListQueryExecutionsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxQueryExecutionsCount]
    var NextToken: js.UndefOr[Token]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  @js.native
  @Factory
  trait ListQueryExecutionsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var QueryExecutionIds: js.UndefOr[QueryExecutionIdList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var MaxResults: js.UndefOr[MaxTagsCount]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListTagsForResourceOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListWorkGroupsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxWorkGroupsCount]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListWorkGroupsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var WorkGroups: js.UndefOr[WorkGroupsList]
  }

  /**
    * A query, where <code>QueryString</code> is the list of SQL query statements that comprise the query.
    */
  @js.native
  @Factory
  trait NamedQuery extends js.Object {
    var Database: DatabaseString
    var Name: NameString
    var QueryString: QueryString
    var Description: js.UndefOr[DescriptionString]
    var NamedQueryId: js.UndefOr[NamedQueryId]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  /**
    * Information about a single instance of a query execution.
    */
  @js.native
  @Factory
  trait QueryExecution extends js.Object {
    var Query: js.UndefOr[QueryString]
    var QueryExecutionContext: js.UndefOr[QueryExecutionContext]
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
    var StatementType: js.UndefOr[StatementType]
    var Statistics: js.UndefOr[QueryExecutionStatistics]
    var Status: js.UndefOr[QueryExecutionStatus]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  /**
    * The database in which the query execution occurs.
    */
  @js.native
  @Factory
  trait QueryExecutionContext extends js.Object {
    var Database: js.UndefOr[DatabaseString]
  }

  @js.native
  sealed trait QueryExecutionState extends js.Any
  object QueryExecutionState extends js.Object {
    val QUEUED    = "QUEUED".asInstanceOf[QueryExecutionState]
    val RUNNING   = "RUNNING".asInstanceOf[QueryExecutionState]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[QueryExecutionState]
    val FAILED    = "FAILED".asInstanceOf[QueryExecutionState]
    val CANCELLED = "CANCELLED".asInstanceOf[QueryExecutionState]

    val values = js.Object.freeze(js.Array(QUEUED, RUNNING, SUCCEEDED, FAILED, CANCELLED))
  }

  /**
    * The amount of data scanned during the query execution and the amount of time that it took to execute, and the type of statement that was run.
    */
  @js.native
  @Factory
  trait QueryExecutionStatistics extends js.Object {
    var DataManifestLocation: js.UndefOr[String]
    var DataScannedInBytes: js.UndefOr[Double]
    var EngineExecutionTimeInMillis: js.UndefOr[Double]
    var QueryPlanningTimeInMillis: js.UndefOr[Double]
    var QueryQueueTimeInMillis: js.UndefOr[Double]
    var ServiceProcessingTimeInMillis: js.UndefOr[Double]
    var TotalExecutionTimeInMillis: js.UndefOr[Double]
  }

  /**
    * The completion date, current state, submission time, and state change reason (if applicable) for the query execution.
    */
  @js.native
  @Factory
  trait QueryExecutionStatus extends js.Object {
    var CompletionDateTime: js.UndefOr[Date]
    var State: js.UndefOr[QueryExecutionState]
    var StateChangeReason: js.UndefOr[String]
    var SubmissionDateTime: js.UndefOr[Date]
  }

  /**
    * The location in Amazon S3 where query results are stored and the encryption option, if any, used for query results. These are known as "client-side settings". If workgroup settings override client-side settings, then the query uses the workgroup settings.
    */
  @js.native
  @Factory
  trait ResultConfiguration extends js.Object {
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var OutputLocation: js.UndefOr[String]
  }

  /**
    * The information about the updates in the query results, such as output location and encryption configuration for the query results.
    */
  @js.native
  @Factory
  trait ResultConfigurationUpdates extends js.Object {
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var OutputLocation: js.UndefOr[String]
    var RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean]
    var RemoveOutputLocation: js.UndefOr[BoxedBoolean]
  }

  /**
    * The metadata and rows that comprise a query result set. The metadata describes the column structure and data types.
    */
  @js.native
  @Factory
  trait ResultSet extends js.Object {
    var ResultSetMetadata: js.UndefOr[ResultSetMetadata]
    var Rows: js.UndefOr[RowList]
  }

  /**
    * The metadata that describes the column structure and data types of a table of query results.
    */
  @js.native
  @Factory
  trait ResultSetMetadata extends js.Object {
    var ColumnInfo: js.UndefOr[ColumnInfoList]
  }

  /**
    * The rows that comprise a query result table.
    */
  @js.native
  @Factory
  trait Row extends js.Object {
    var Data: js.UndefOr[datumList]
  }

  @js.native
  @Factory
  trait StartQueryExecutionInput extends js.Object {
    var QueryString: QueryString
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var QueryExecutionContext: js.UndefOr[QueryExecutionContext]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  @js.native
  @Factory
  trait StartQueryExecutionOutput extends js.Object {
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
  }

  @js.native
  sealed trait StatementType extends js.Any
  object StatementType extends js.Object {
    val DDL     = "DDL".asInstanceOf[StatementType]
    val DML     = "DML".asInstanceOf[StatementType]
    val UTILITY = "UTILITY".asInstanceOf[StatementType]

    val values = js.Object.freeze(js.Array(DDL, DML, UTILITY))
  }

  @js.native
  @Factory
  trait StopQueryExecutionInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
  }

  @js.native
  @Factory
  trait StopQueryExecutionOutput extends js.Object {}

  /**
    * A tag that you can add to a resource. A tag is a label that you assign to an AWS Athena resource (a workgroup). Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize workgroups in Athena, for example, by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and filter workgroups in your account. The maximum tag key length is 128 Unicode characters in UTF-8. The maximum tag value length is 256 Unicode characters in UTF-8. You can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys must be unique per resource.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceOutput extends js.Object {}

  /**
    * Information about a named query ID that could not be processed.
    */
  @js.native
  @Factory
  trait UnprocessedNamedQueryId extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  /**
    * Describes a query execution that failed to process.
    */
  @js.native
  @Factory
  trait UnprocessedQueryExecutionId extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
  }

  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceOutput extends js.Object {}

  @js.native
  @Factory
  trait UpdateWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
    var ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var State: js.UndefOr[WorkGroupState]
  }

  @js.native
  @Factory
  trait UpdateWorkGroupOutput extends js.Object {}

  /**
    * A workgroup, which contains a name, description, creation time, state, and other configuration, listed under Configuration. Each workgroup enables you to isolate queries for you or your group of users from other queries in the same account, to configure the query results location and the encryption configuration (known as workgroup settings), to enable sending query metrics to Amazon CloudWatch, and to establish per-query data usage control limits for all queries in a workgroup. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See [[WorkGroupConfiguration.EnforceWorkGroupConfiguration]].
    */
  @js.native
  @Factory
  trait WorkGroup extends js.Object {
    var Name: WorkGroupName
    var Configuration: js.UndefOr[WorkGroupConfiguration]
    var CreationTime: js.UndefOr[Date]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var State: js.UndefOr[WorkGroupState]
  }

  /**
    * The configuration of the workgroup, which includes the location in Amazon S3 where query results are stored, the encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup and whether workgroup settings override query settings, and the data usage limits for the amount of data scanned per query or per workgroup. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See EnforceWorkGroupConfiguration.
    */
  @js.native
  @Factory
  trait WorkGroupConfiguration extends js.Object {
    var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue]
    var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean]
    var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean]
    var RequesterPaysEnabled: js.UndefOr[BoxedBoolean]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
  }

  /**
    * The configuration information that will be updated for this workgroup, which includes the location in Amazon S3 where query results are stored, the encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup, whether the workgroup settings override the client-side settings, and the data usage limit for the amount of bytes scanned per query, if it is specified.
    */
  @js.native
  @Factory
  trait WorkGroupConfigurationUpdates extends js.Object {
    var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue]
    var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean]
    var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean]
    var RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean]
    var RequesterPaysEnabled: js.UndefOr[BoxedBoolean]
    var ResultConfigurationUpdates: js.UndefOr[ResultConfigurationUpdates]
  }

  @js.native
  sealed trait WorkGroupState extends js.Any
  object WorkGroupState extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[WorkGroupState]
    val DISABLED = "DISABLED".asInstanceOf[WorkGroupState]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * The summary information for the workgroup, which includes its name, state, description, and the date and time it was created.
    */
  @js.native
  @Factory
  trait WorkGroupSummary extends js.Object {
    var CreationTime: js.UndefOr[Date]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var Name: js.UndefOr[WorkGroupName]
    var State: js.UndefOr[WorkGroupState]
  }
}
