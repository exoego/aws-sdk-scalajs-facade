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
  class Athena() extends js.Object {
    def this(config: AWSConfig) = this()

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
    var NamedQueryIds: NamedQueryIdList
  }

  object BatchGetNamedQueryInput {
    def apply(
      NamedQueryIds: NamedQueryIdList): BatchGetNamedQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryIds" -> NamedQueryIds.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var QueryExecutionIds: QueryExecutionIdList
  }

  object BatchGetQueryExecutionInput {
    def apply(
      QueryExecutionIds: QueryExecutionIdList): BatchGetQueryExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionIds" -> QueryExecutionIds.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * Information about the columns in a query execution result.
   */
  @js.native
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

  object ColumnInfo {
    def apply(
      Name: String,
      Type: String,
      CaseSensitive: js.UndefOr[Boolean] = js.undefined,
      CatalogName: js.UndefOr[String] = js.undefined,
      Label: js.UndefOr[String] = js.undefined,
      Nullable: js.UndefOr[ColumnNullable] = js.undefined,
      Precision: js.UndefOr[Int] = js.undefined,
      Scale: js.UndefOr[Int] = js.undefined,
      SchemaName: js.UndefOr[String] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined): ColumnInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "CaseSensitive" -> CaseSensitive.map { x => x.asInstanceOf[js.Any] },
        "CatalogName" -> CatalogName.map { x => x.asInstanceOf[js.Any] },
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] },
        "Nullable" -> Nullable.map { x => x.asInstanceOf[js.Any] },
        "Precision" -> Precision.map { x => x.asInstanceOf[js.Any] },
        "Scale" -> Scale.map { x => x.asInstanceOf[js.Any] },
        "SchemaName" -> SchemaName.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Database: DatabaseString
    var Name: NameString
    var QueryString: QueryString
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var Description: js.UndefOr[DescriptionString]
  }

  object CreateNamedQueryInput {
    def apply(
      Database: DatabaseString,
      Name: NameString,
      QueryString: QueryString,
      ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
      Description: js.UndefOr[DescriptionString] = js.undefined): CreateNamedQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Database" -> Database.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * A piece of data (a field in the table).
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
    var NamedQueryId: NamedQueryId
  }

  object DeleteNamedQueryInput {
    def apply(
      NamedQueryId: NamedQueryId): DeleteNamedQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryId" -> NamedQueryId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * If query results are encrypted in Amazon S3, indicates the encryption option used (for example, <code>SSE-KMS</code> or <code>CSE-KMS</code>) and key information.
   */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var EncryptionOption: EncryptionOption
    var KmsKey: js.UndefOr[String]
  }

  object EncryptionConfiguration {
    def apply(
      EncryptionOption: EncryptionOption,
      KmsKey: js.UndefOr[String] = js.undefined): EncryptionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionOption" -> EncryptionOption.asInstanceOf[js.Any],
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
    var NamedQueryId: NamedQueryId
  }

  object GetNamedQueryInput {
    def apply(
      NamedQueryId: NamedQueryId): GetNamedQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryId" -> NamedQueryId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var QueryExecutionId: QueryExecutionId
  }

  object GetQueryExecutionInput {
    def apply(
      QueryExecutionId: QueryExecutionId): GetQueryExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var QueryExecutionId: QueryExecutionId
    var MaxResults: js.UndefOr[MaxQueryResults]
    var NextToken: js.UndefOr[Token]
  }

  object GetQueryResultsInput {
    def apply(
      QueryExecutionId: QueryExecutionId,
      MaxResults: js.UndefOr[MaxQueryResults] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined): GetQueryResultsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryResultsInput]
    }
  }

  @js.native
  trait GetQueryResultsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var ResultSet: js.UndefOr[ResultSet]
    var UpdateCount: js.UndefOr[Double]
  }

  object GetQueryResultsOutput {
    def apply(
      NextToken: js.UndefOr[Token] = js.undefined,
      ResultSet: js.UndefOr[ResultSet] = js.undefined,
      UpdateCount: js.UndefOr[Double] = js.undefined): GetQueryResultsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ResultSet" -> ResultSet.map { x => x.asInstanceOf[js.Any] },
        "UpdateCount" -> UpdateCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryResultsOutput]
    }
  }

  @js.native
  trait ListNamedQueriesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxNamedQueriesCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListNamedQueriesInput {
    def apply(
      MaxResults: js.UndefOr[MaxNamedQueriesCount] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined): ListNamedQueriesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var MaxResults: js.UndefOr[MaxQueryExecutionsCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListQueryExecutionsInput {
    def apply(
      MaxResults: js.UndefOr[MaxQueryExecutionsCount] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined): ListQueryExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueryExecutionsInput]
    }
  }

  @js.native
  trait ListQueryExecutionsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var QueryExecutionIds: js.UndefOr[QueryExecutionIdList]
  }

  object ListQueryExecutionsOutput {
    def apply(
      NextToken: js.UndefOr[Token] = js.undefined,
      QueryExecutionIds: js.UndefOr[QueryExecutionIdList] = js.undefined): ListQueryExecutionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "QueryExecutionIds" -> QueryExecutionIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueryExecutionsOutput]
    }
  }

  /**
   * A query, where <code>QueryString</code> is the SQL query statements that comprise the query.
   */
  @js.native
  trait NamedQuery extends js.Object {
    var Database: DatabaseString
    var Name: NameString
    var QueryString: QueryString
    var Description: js.UndefOr[DescriptionString]
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  object NamedQuery {
    def apply(
      Database: DatabaseString,
      Name: NameString,
      QueryString: QueryString,
      Description: js.UndefOr[DescriptionString] = js.undefined,
      NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined): NamedQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Database" -> Database.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "NamedQueryId" -> NamedQueryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NamedQuery]
    }
  }

  /**
   * Information about a single instance of a query execution.
   */
  @js.native
  trait QueryExecution extends js.Object {
    var Query: js.UndefOr[QueryString]
    var QueryExecutionContext: js.UndefOr[QueryExecutionContext]
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
    var StatementType: js.UndefOr[StatementType]
    var Statistics: js.UndefOr[QueryExecutionStatistics]
    var Status: js.UndefOr[QueryExecutionStatus]
  }

  object QueryExecution {
    def apply(
      Query: js.UndefOr[QueryString] = js.undefined,
      QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined,
      QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined,
      ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined,
      StatementType: js.UndefOr[StatementType] = js.undefined,
      Statistics: js.UndefOr[QueryExecutionStatistics] = js.undefined,
      Status: js.UndefOr[QueryExecutionStatus] = js.undefined): QueryExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Query" -> Query.map { x => x.asInstanceOf[js.Any] },
        "QueryExecutionContext" -> QueryExecutionContext.map { x => x.asInstanceOf[js.Any] },
        "QueryExecutionId" -> QueryExecutionId.map { x => x.asInstanceOf[js.Any] },
        "ResultConfiguration" -> ResultConfiguration.map { x => x.asInstanceOf[js.Any] },
        "StatementType" -> StatementType.map { x => x.asInstanceOf[js.Any] },
        "Statistics" -> Statistics.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryExecution]
    }
  }

  /**
   * The database in which the query execution occurs.
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
   * The amount of data scanned during the query execution and the amount of time that it took to execute, and the type of statement that was run.
   */
  @js.native
  trait QueryExecutionStatistics extends js.Object {
    var DataScannedInBytes: js.UndefOr[Double]
    var EngineExecutionTimeInMillis: js.UndefOr[Double]
  }

  object QueryExecutionStatistics {
    def apply(
      DataScannedInBytes: js.UndefOr[Double] = js.undefined,
      EngineExecutionTimeInMillis: js.UndefOr[Double] = js.undefined): QueryExecutionStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataScannedInBytes" -> DataScannedInBytes.map { x => x.asInstanceOf[js.Any] },
        "EngineExecutionTimeInMillis" -> EngineExecutionTimeInMillis.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryExecutionStatistics]
    }
  }

  /**
   * The completion date, current state, submission time, and state change reason (if applicable) for the query execution.
   */
  @js.native
  trait QueryExecutionStatus extends js.Object {
    var CompletionDateTime: js.UndefOr[Date]
    var State: js.UndefOr[QueryExecutionState]
    var StateChangeReason: js.UndefOr[String]
    var SubmissionDateTime: js.UndefOr[Date]
  }

  object QueryExecutionStatus {
    def apply(
      CompletionDateTime: js.UndefOr[Date] = js.undefined,
      State: js.UndefOr[QueryExecutionState] = js.undefined,
      StateChangeReason: js.UndefOr[String] = js.undefined,
      SubmissionDateTime: js.UndefOr[Date] = js.undefined): QueryExecutionStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompletionDateTime" -> CompletionDateTime.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "StateChangeReason" -> StateChangeReason.map { x => x.asInstanceOf[js.Any] },
        "SubmissionDateTime" -> SubmissionDateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryExecutionStatus]
    }
  }

  /**
   * The location in Amazon S3 where query results are stored and the encryption option, if any, used for query results.
   */
  @js.native
  trait ResultConfiguration extends js.Object {
    var OutputLocation: String
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
  }

  object ResultConfiguration {
    def apply(
      OutputLocation: String,
      EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined): ResultConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputLocation" -> OutputLocation.asInstanceOf[js.Any],
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultConfiguration]
    }
  }

  /**
   * The metadata and rows that comprise a query result set. The metadata describes the column structure and data types.
   */
  @js.native
  trait ResultSet extends js.Object {
    var ResultSetMetadata: js.UndefOr[ResultSetMetadata]
    var Rows: js.UndefOr[RowList]
  }

  object ResultSet {
    def apply(
      ResultSetMetadata: js.UndefOr[ResultSetMetadata] = js.undefined,
      Rows: js.UndefOr[RowList] = js.undefined): ResultSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResultSetMetadata" -> ResultSetMetadata.map { x => x.asInstanceOf[js.Any] },
        "Rows" -> Rows.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultSet]
    }
  }

  /**
   * The metadata that describes the column structure and data types of a table of query results.
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
   * The rows that comprise a query result table.
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
    var QueryString: QueryString
    var ResultConfiguration: ResultConfiguration
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var QueryExecutionContext: js.UndefOr[QueryExecutionContext]
  }

  object StartQueryExecutionInput {
    def apply(
      QueryString: QueryString,
      ResultConfiguration: ResultConfiguration,
      ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
      QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined): StartQueryExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryString" -> QueryString.asInstanceOf[js.Any],
        "ResultConfiguration" -> ResultConfiguration.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "QueryExecutionContext" -> QueryExecutionContext.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var QueryExecutionId: QueryExecutionId
  }

  object StopQueryExecutionInput {
    def apply(
      QueryExecutionId: QueryExecutionId): StopQueryExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * Information about a named query ID that could not be processed.
   */
  @js.native
  trait UnprocessedNamedQueryId extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  object UnprocessedNamedQueryId {
    def apply(
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
      NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined): UnprocessedNamedQueryId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "NamedQueryId" -> NamedQueryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnprocessedNamedQueryId]
    }
  }

  /**
   * Describes a query execution that failed to process.
   */
  @js.native
  trait UnprocessedQueryExecutionId extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
  }

  object UnprocessedQueryExecutionId {
    def apply(
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
      QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined): UnprocessedQueryExecutionId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "QueryExecutionId" -> QueryExecutionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnprocessedQueryExecutionId]
    }
  }
}
