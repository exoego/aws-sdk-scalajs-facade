package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object athena {
  type ColumnInfoList = js.Array[ColumnInfo]
  type ColumnNullable = String
  type DatabaseString = String
  type Date = js.Date
  type DescriptionString = String
  type EncryptionOption = String
  type ErrorCode = String
  type ErrorMessage = String
  type IdempotencyToken = String
  type MaxNamedQueriesCount = Int
  type MaxQueryExecutionsCount = Int
  type MaxQueryResults = Int
  type NameString = String
  type NamedQueryId = String
  type NamedQueryIdList = js.Array[NamedQueryId]
  type NamedQueryList = js.Array[NamedQuery]
  type QueryExecutionId = String
  type QueryExecutionIdList = js.Array[QueryExecutionId]
  type QueryExecutionList = js.Array[QueryExecution]
  type QueryExecutionState = String
  type QueryString = String
  type RowList = js.Array[Row]
  type StatementType = String
  type Token = String
  type UnprocessedNamedQueryIdList = js.Array[UnprocessedNamedQueryId]
  type UnprocessedQueryExecutionIdList = js.Array[UnprocessedQueryExecutionId]
  type datumList = js.Array[Datum]
  type datumString = String
}

package athena {
  @js.native
  @JSImport("aws-sdk", "Athena")
  class Athena(config: AWSConfig) extends js.Object {
    def batchGetNamedQuery(params: BatchGetNamedQueryInput): Request[BatchGetNamedQueryOutput] = js.native
    def batchGetQueryExecution(params: BatchGetQueryExecutionInput): Request[BatchGetQueryExecutionOutput] = js.native
    def createNamedQuery(params: CreateNamedQueryInput): Request[CreateNamedQueryOutput] = js.native
    def deleteNamedQuery(params: DeleteNamedQueryInput): Request[DeleteNamedQueryOutput] = js.native
    def getNamedQuery(params: GetNamedQueryInput): Request[GetNamedQueryOutput] = js.native
    def getQueryExecution(params: GetQueryExecutionInput): Request[GetQueryExecutionOutput] = js.native
    def getQueryResults(params: GetQueryResultsInput): Request[GetQueryResultsOutput] = js.native
    def listNamedQueries(params: ListNamedQueriesInput): Request[ListNamedQueriesOutput] = js.native
    def listQueryExecutions(params: ListQueryExecutionsInput): Request[ListQueryExecutionsOutput] = js.native
    def startQueryExecution(params: StartQueryExecutionInput): Request[StartQueryExecutionOutput] = js.native
    def stopQueryExecution(params: StopQueryExecutionInput): Request[StopQueryExecutionOutput] = js.native
  }

  @js.native
  trait BatchGetNamedQueryInput extends js.Object {
    var NamedQueryIds: js.UndefOr[NamedQueryIdList]
  }

  object BatchGetNamedQueryInput {
    def apply(
      NamedQueryIds: js.UndefOr[NamedQueryIdList] = js.undefined): BatchGetNamedQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryIds" -> NamedQueryIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetNamedQueryInput]
    }
  }

  @js.native
  trait BatchGetNamedQueryOutput extends js.Object {
    var NamedQueries: js.UndefOr[NamedQueryList]
    var UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList]
  }

  object BatchGetNamedQueryOutput {
    def apply(
      NamedQueries: js.UndefOr[NamedQueryList] = js.undefined,
      UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList] = js.undefined): BatchGetNamedQueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueries" -> NamedQueries.map { x => x.asInstanceOf[js.Any] },
        "UnprocessedNamedQueryIds" -> UnprocessedNamedQueryIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetNamedQueryOutput]
    }
  }

  @js.native
  trait BatchGetQueryExecutionInput extends js.Object {
    var QueryExecutionIds: js.UndefOr[QueryExecutionIdList]
  }

  object BatchGetQueryExecutionInput {
    def apply(
      QueryExecutionIds: js.UndefOr[QueryExecutionIdList] = js.undefined): BatchGetQueryExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionIds" -> QueryExecutionIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetQueryExecutionInput]
    }
  }

  @js.native
  trait BatchGetQueryExecutionOutput extends js.Object {
    var QueryExecutions: js.UndefOr[QueryExecutionList]
    var UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList]
  }

  object BatchGetQueryExecutionOutput {
    def apply(
      QueryExecutions: js.UndefOr[QueryExecutionList] = js.undefined,
      UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList] = js.undefined): BatchGetQueryExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutions" -> QueryExecutions.map { x => x.asInstanceOf[js.Any] },
        "UnprocessedQueryExecutionIds" -> UnprocessedQueryExecutionIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetQueryExecutionOutput]
    }
  }

  /**
   * <p>Information about the columns in a query execution result.</p>
   */
  @js.native
  trait ColumnInfo extends js.Object {
    var Name: js.UndefOr[String]
    var Nullable: js.UndefOr[ColumnNullable]
    var Scale: js.UndefOr[Int]
    var Precision: js.UndefOr[Int]
    var Label: js.UndefOr[String]
    var SchemaName: js.UndefOr[String]
    var CaseSensitive: js.UndefOr[Boolean]
    var CatalogName: js.UndefOr[String]
    var TableName: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object ColumnInfo {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Nullable: js.UndefOr[ColumnNullable] = js.undefined,
      Scale: js.UndefOr[Int] = js.undefined,
      Precision: js.UndefOr[Int] = js.undefined,
      Label: js.UndefOr[String] = js.undefined,
      SchemaName: js.UndefOr[String] = js.undefined,
      CaseSensitive: js.UndefOr[Boolean] = js.undefined,
      CatalogName: js.UndefOr[String] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined): ColumnInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Nullable" -> Nullable.map { x => x.asInstanceOf[js.Any] },
        "Scale" -> Scale.map { x => x.asInstanceOf[js.Any] },
        "Precision" -> Precision.map { x => x.asInstanceOf[js.Any] },
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] },
        "SchemaName" -> SchemaName.map { x => x.asInstanceOf[js.Any] },
        "CaseSensitive" -> CaseSensitive.map { x => x.asInstanceOf[js.Any] },
        "CatalogName" -> CatalogName.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ColumnInfo]
    }
  }

  object ColumnNullableEnum {
    val NOT_NULL = "NOT_NULL"
    val NULLABLE = "NULLABLE"
    val UNKNOWN = "UNKNOWN"

    val values = IndexedSeq(NOT_NULL, NULLABLE, UNKNOWN)
  }

  @js.native
  trait CreateNamedQueryInput extends js.Object {
    var Name: js.UndefOr[NameString]
    var QueryString: js.UndefOr[QueryString]
    var Database: js.UndefOr[DatabaseString]
    var Description: js.UndefOr[DescriptionString]
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
  }

  object CreateNamedQueryInput {
    def apply(
      Name: js.UndefOr[NameString] = js.undefined,
      QueryString: js.UndefOr[QueryString] = js.undefined,
      Database: js.UndefOr[DatabaseString] = js.undefined,
      Description: js.UndefOr[DescriptionString] = js.undefined,
      ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined): CreateNamedQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "QueryString" -> QueryString.map { x => x.asInstanceOf[js.Any] },
        "Database" -> Database.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNamedQueryInput]
    }
  }

  @js.native
  trait CreateNamedQueryOutput extends js.Object {
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  object CreateNamedQueryOutput {
    def apply(
      NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined): CreateNamedQueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryId" -> NamedQueryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNamedQueryOutput]
    }
  }

  /**
   * <p>A piece of data (a field in the table).</p>
   */
  @js.native
  trait Datum extends js.Object {
    var VarCharValue: js.UndefOr[datumString]
  }

  object Datum {
    def apply(
      VarCharValue: js.UndefOr[datumString] = js.undefined): Datum = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VarCharValue" -> VarCharValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Datum]
    }
  }

  @js.native
  trait DeleteNamedQueryInput extends js.Object {
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  object DeleteNamedQueryInput {
    def apply(
      NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined): DeleteNamedQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryId" -> NamedQueryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNamedQueryInput]
    }
  }

  @js.native
  trait DeleteNamedQueryOutput extends js.Object {

  }

  object DeleteNamedQueryOutput {
    def apply(): DeleteNamedQueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNamedQueryOutput]
    }
  }

  /**
   * <p>If query results are encrypted in Amazon S3, indicates the encryption option used (for example, <code>SSE-KMS</code> or <code>CSE-KMS</code>) and key information.</p>
   */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var EncryptionOption: js.UndefOr[EncryptionOption]
    var KmsKey: js.UndefOr[String]
  }

  object EncryptionConfiguration {
    def apply(
      EncryptionOption: js.UndefOr[EncryptionOption] = js.undefined,
      KmsKey: js.UndefOr[String] = js.undefined): EncryptionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionOption" -> EncryptionOption.map { x => x.asInstanceOf[js.Any] },
        "KmsKey" -> KmsKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionConfiguration]
    }
  }

  object EncryptionOptionEnum {
    val SSE_S3 = "SSE_S3"
    val SSE_KMS = "SSE_KMS"
    val CSE_KMS = "CSE_KMS"

    val values = IndexedSeq(SSE_S3, SSE_KMS, CSE_KMS)
  }

  @js.native
  trait GetNamedQueryInput extends js.Object {
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  object GetNamedQueryInput {
    def apply(
      NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined): GetNamedQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryId" -> NamedQueryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetNamedQueryInput]
    }
  }

  @js.native
  trait GetNamedQueryOutput extends js.Object {
    var NamedQuery: js.UndefOr[NamedQuery]
  }

  object GetNamedQueryOutput {
    def apply(
      NamedQuery: js.UndefOr[NamedQuery] = js.undefined): GetNamedQueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQuery" -> NamedQuery.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetNamedQueryOutput]
    }
  }

  @js.native
  trait GetQueryExecutionInput extends js.Object {
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
  }

  object GetQueryExecutionInput {
    def apply(
      QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined): GetQueryExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionId" -> QueryExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryExecutionInput]
    }
  }

  @js.native
  trait GetQueryExecutionOutput extends js.Object {
    var QueryExecution: js.UndefOr[QueryExecution]
  }

  object GetQueryExecutionOutput {
    def apply(
      QueryExecution: js.UndefOr[QueryExecution] = js.undefined): GetQueryExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecution" -> QueryExecution.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryExecutionOutput]
    }
  }

  @js.native
  trait GetQueryResultsInput extends js.Object {
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
    var NextToken: js.UndefOr[Token]
    var MaxResults: js.UndefOr[MaxQueryResults]
  }

  object GetQueryResultsInput {
    def apply(
      QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined,
      MaxResults: js.UndefOr[MaxQueryResults] = js.undefined): GetQueryResultsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionId" -> QueryExecutionId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryResultsInput]
    }
  }

  @js.native
  trait GetQueryResultsOutput extends js.Object {
    var UpdateCount: js.UndefOr[Double]
    var ResultSet: js.UndefOr[ResultSet]
    var NextToken: js.UndefOr[Token]
  }

  object GetQueryResultsOutput {
    def apply(
      UpdateCount: js.UndefOr[Double] = js.undefined,
      ResultSet: js.UndefOr[ResultSet] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined): GetQueryResultsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UpdateCount" -> UpdateCount.map { x => x.asInstanceOf[js.Any] },
        "ResultSet" -> ResultSet.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryResultsOutput]
    }
  }

  @js.native
  trait ListNamedQueriesInput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var MaxResults: js.UndefOr[MaxNamedQueriesCount]
  }

  object ListNamedQueriesInput {
    def apply(
      NextToken: js.UndefOr[Token] = js.undefined,
      MaxResults: js.UndefOr[MaxNamedQueriesCount] = js.undefined): ListNamedQueriesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNamedQueriesInput]
    }
  }

  @js.native
  trait ListNamedQueriesOutput extends js.Object {
    var NamedQueryIds: js.UndefOr[NamedQueryIdList]
    var NextToken: js.UndefOr[Token]
  }

  object ListNamedQueriesOutput {
    def apply(
      NamedQueryIds: js.UndefOr[NamedQueryIdList] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined): ListNamedQueriesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryIds" -> NamedQueryIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNamedQueriesOutput]
    }
  }

  @js.native
  trait ListQueryExecutionsInput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var MaxResults: js.UndefOr[MaxQueryExecutionsCount]
  }

  object ListQueryExecutionsInput {
    def apply(
      NextToken: js.UndefOr[Token] = js.undefined,
      MaxResults: js.UndefOr[MaxQueryExecutionsCount] = js.undefined): ListQueryExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueryExecutionsInput]
    }
  }

  @js.native
  trait ListQueryExecutionsOutput extends js.Object {
    var QueryExecutionIds: js.UndefOr[QueryExecutionIdList]
    var NextToken: js.UndefOr[Token]
  }

  object ListQueryExecutionsOutput {
    def apply(
      QueryExecutionIds: js.UndefOr[QueryExecutionIdList] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined): ListQueryExecutionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionIds" -> QueryExecutionIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueryExecutionsOutput]
    }
  }

  /**
   * <p>A query, where <code>QueryString</code> is the SQL query statements that comprise the query.</p>
   */
  @js.native
  trait NamedQuery extends js.Object {
    var Name: js.UndefOr[NameString]
    var QueryString: js.UndefOr[QueryString]
    var NamedQueryId: js.UndefOr[NamedQueryId]
    var Database: js.UndefOr[DatabaseString]
    var Description: js.UndefOr[DescriptionString]
  }

  object NamedQuery {
    def apply(
      Name: js.UndefOr[NameString] = js.undefined,
      QueryString: js.UndefOr[QueryString] = js.undefined,
      NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined,
      Database: js.UndefOr[DatabaseString] = js.undefined,
      Description: js.UndefOr[DescriptionString] = js.undefined): NamedQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "QueryString" -> QueryString.map { x => x.asInstanceOf[js.Any] },
        "NamedQueryId" -> NamedQueryId.map { x => x.asInstanceOf[js.Any] },
        "Database" -> Database.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NamedQuery]
    }
  }

  /**
   * <p>Information about a single instance of a query execution.</p>
   */
  @js.native
  trait QueryExecution extends js.Object {
    var Statistics: js.UndefOr[QueryExecutionStatistics]
    var Query: js.UndefOr[QueryString]
    var QueryExecutionContext: js.UndefOr[QueryExecutionContext]
    var StatementType: js.UndefOr[StatementType]
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
    var Status: js.UndefOr[QueryExecutionStatus]
  }

  object QueryExecution {
    def apply(
      Statistics: js.UndefOr[QueryExecutionStatistics] = js.undefined,
      Query: js.UndefOr[QueryString] = js.undefined,
      QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined,
      StatementType: js.UndefOr[StatementType] = js.undefined,
      QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined,
      ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined,
      Status: js.UndefOr[QueryExecutionStatus] = js.undefined): QueryExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Statistics" -> Statistics.map { x => x.asInstanceOf[js.Any] },
        "Query" -> Query.map { x => x.asInstanceOf[js.Any] },
        "QueryExecutionContext" -> QueryExecutionContext.map { x => x.asInstanceOf[js.Any] },
        "StatementType" -> StatementType.map { x => x.asInstanceOf[js.Any] },
        "QueryExecutionId" -> QueryExecutionId.map { x => x.asInstanceOf[js.Any] },
        "ResultConfiguration" -> ResultConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryExecution]
    }
  }

  /**
   * <p>The database in which the query execution occurs.</p>
   */
  @js.native
  trait QueryExecutionContext extends js.Object {
    var Database: js.UndefOr[DatabaseString]
  }

  object QueryExecutionContext {
    def apply(
      Database: js.UndefOr[DatabaseString] = js.undefined): QueryExecutionContext = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Database" -> Database.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryExecutionContext]
    }
  }

  object QueryExecutionStateEnum {
    val QUEUED = "QUEUED"
    val RUNNING = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"
    val CANCELLED = "CANCELLED"

    val values = IndexedSeq(QUEUED, RUNNING, SUCCEEDED, FAILED, CANCELLED)
  }

  /**
   * <p>The amount of data scanned during the query execution and the amount of time that it took to execute, and the type of statement that was run.</p>
   */
  @js.native
  trait QueryExecutionStatistics extends js.Object {
    var EngineExecutionTimeInMillis: js.UndefOr[Double]
    var DataScannedInBytes: js.UndefOr[Double]
  }

  object QueryExecutionStatistics {
    def apply(
      EngineExecutionTimeInMillis: js.UndefOr[Double] = js.undefined,
      DataScannedInBytes: js.UndefOr[Double] = js.undefined): QueryExecutionStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EngineExecutionTimeInMillis" -> EngineExecutionTimeInMillis.map { x => x.asInstanceOf[js.Any] },
        "DataScannedInBytes" -> DataScannedInBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryExecutionStatistics]
    }
  }

  /**
   * <p>The completion date, current state, submission time, and state change reason (if applicable) for the query execution.</p>
   */
  @js.native
  trait QueryExecutionStatus extends js.Object {
    var State: js.UndefOr[QueryExecutionState]
    var StateChangeReason: js.UndefOr[String]
    var SubmissionDateTime: js.UndefOr[Date]
    var CompletionDateTime: js.UndefOr[Date]
  }

  object QueryExecutionStatus {
    def apply(
      State: js.UndefOr[QueryExecutionState] = js.undefined,
      StateChangeReason: js.UndefOr[String] = js.undefined,
      SubmissionDateTime: js.UndefOr[Date] = js.undefined,
      CompletionDateTime: js.UndefOr[Date] = js.undefined): QueryExecutionStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "StateChangeReason" -> StateChangeReason.map { x => x.asInstanceOf[js.Any] },
        "SubmissionDateTime" -> SubmissionDateTime.map { x => x.asInstanceOf[js.Any] },
        "CompletionDateTime" -> CompletionDateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryExecutionStatus]
    }
  }

  /**
   * <p>The location in Amazon S3 where query results are stored and the encryption option, if any, used for query results.</p>
   */
  @js.native
  trait ResultConfiguration extends js.Object {
    var OutputLocation: js.UndefOr[String]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
  }

  object ResultConfiguration {
    def apply(
      OutputLocation: js.UndefOr[String] = js.undefined,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined): ResultConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputLocation" -> OutputLocation.map { x => x.asInstanceOf[js.Any] },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultConfiguration]
    }
  }

  /**
   * <p>The metadata and rows that comprise a query result set. The metadata describes the column structure and data types.</p>
   */
  @js.native
  trait ResultSet extends js.Object {
    var Rows: js.UndefOr[RowList]
    var ResultSetMetadata: js.UndefOr[ResultSetMetadata]
  }

  object ResultSet {
    def apply(
      Rows: js.UndefOr[RowList] = js.undefined,
      ResultSetMetadata: js.UndefOr[ResultSetMetadata] = js.undefined): ResultSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rows" -> Rows.map { x => x.asInstanceOf[js.Any] },
        "ResultSetMetadata" -> ResultSetMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultSet]
    }
  }

  /**
   * <p>The metadata that describes the column structure and data types of a table of query results. </p>
   */
  @js.native
  trait ResultSetMetadata extends js.Object {
    var ColumnInfo: js.UndefOr[ColumnInfoList]
  }

  object ResultSetMetadata {
    def apply(
      ColumnInfo: js.UndefOr[ColumnInfoList] = js.undefined): ResultSetMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ColumnInfo" -> ColumnInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultSetMetadata]
    }
  }

  /**
   * <p>The rows that comprise a query result table.</p>
   */
  @js.native
  trait Row extends js.Object {
    var Data: js.UndefOr[datumList]
  }

  object Row {
    def apply(
      Data: js.UndefOr[datumList] = js.undefined): Row = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Row]
    }
  }

  @js.native
  trait StartQueryExecutionInput extends js.Object {
    var QueryString: js.UndefOr[QueryString]
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var QueryExecutionContext: js.UndefOr[QueryExecutionContext]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
  }

  object StartQueryExecutionInput {
    def apply(
      QueryString: js.UndefOr[QueryString] = js.undefined,
      ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
      QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined,
      ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined): StartQueryExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryString" -> QueryString.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "QueryExecutionContext" -> QueryExecutionContext.map { x => x.asInstanceOf[js.Any] },
        "ResultConfiguration" -> ResultConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartQueryExecutionInput]
    }
  }

  @js.native
  trait StartQueryExecutionOutput extends js.Object {
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
  }

  object StartQueryExecutionOutput {
    def apply(
      QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined): StartQueryExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionId" -> QueryExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartQueryExecutionOutput]
    }
  }

  object StatementTypeEnum {
    val DDL = "DDL"
    val DML = "DML"
    val UTILITY = "UTILITY"

    val values = IndexedSeq(DDL, DML, UTILITY)
  }

  @js.native
  trait StopQueryExecutionInput extends js.Object {
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
  }

  object StopQueryExecutionInput {
    def apply(
      QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined): StopQueryExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionId" -> QueryExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopQueryExecutionInput]
    }
  }

  @js.native
  trait StopQueryExecutionOutput extends js.Object {

  }

  object StopQueryExecutionOutput {
    def apply(): StopQueryExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopQueryExecutionOutput]
    }
  }

  /**
   * <p>Information about a named query ID that could not be processed.</p>
   */
  @js.native
  trait UnprocessedNamedQueryId extends js.Object {
    var NamedQueryId: js.UndefOr[NamedQueryId]
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  object UnprocessedNamedQueryId {
    def apply(
      NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined,
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined): UnprocessedNamedQueryId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryId" -> NamedQueryId.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnprocessedNamedQueryId]
    }
  }

  /**
   * <p>Describes a query execution that failed to process.</p>
   */
  @js.native
  trait UnprocessedQueryExecutionId extends js.Object {
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  object UnprocessedQueryExecutionId {
    def apply(
      QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined,
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined): UnprocessedQueryExecutionId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionId" -> QueryExecutionId.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnprocessedQueryExecutionId]
    }
  }
}
