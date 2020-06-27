package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object rdsdataservice {
  type Arn                 = String
  type ArrayOfArray        = js.Array[ArrayValue]
  type ArrayValueList      = js.Array[Value]
  type Blob                = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BooleanArray        = js.Array[BoxedBoolean]
  type BoxedBoolean        = Boolean
  type BoxedDouble         = Double
  type BoxedFloat          = Float
  type BoxedInteger        = Int
  type BoxedLong           = Double
  type DbName              = String
  type DoubleArray         = js.Array[BoxedDouble]
  type FieldList           = js.Array[Field]
  type Id                  = String
  type LongArray           = js.Array[BoxedLong]
  type Metadata            = js.Array[ColumnMetadata]
  type ParameterName       = String
  type Records             = js.Array[Record]
  type RecordsUpdated      = Double
  type Row                 = js.Array[Value]
  type SqlParameterSets    = js.Array[SqlParametersList]
  type SqlParametersList   = js.Array[SqlParameter]
  type SqlRecords          = js.Array[FieldList]
  type SqlStatement        = String
  type SqlStatementResults = js.Array[SqlStatementResult]
  type StringArray         = js.Array[String]
  type TransactionStatus   = String
  type UpdateResults       = js.Array[UpdateResult]

  implicit final class RDSDataServiceOps(private val service: RDSDataService) extends AnyVal {

    @inline def batchExecuteStatementFuture(
        params: BatchExecuteStatementRequest
    ): Future[BatchExecuteStatementResponse] = service.batchExecuteStatement(params).promise().toFuture
    @inline def beginTransactionFuture(params: BeginTransactionRequest): Future[BeginTransactionResponse] =
      service.beginTransaction(params).promise().toFuture
    @inline def commitTransactionFuture(params: CommitTransactionRequest): Future[CommitTransactionResponse] =
      service.commitTransaction(params).promise().toFuture
    @inline def executeStatementFuture(params: ExecuteStatementRequest): Future[ExecuteStatementResponse] =
      service.executeStatement(params).promise().toFuture
    @inline def rollbackTransactionFuture(params: RollbackTransactionRequest): Future[RollbackTransactionResponse] =
      service.rollbackTransaction(params).promise().toFuture
  }
}

package rdsdataservice {
  @js.native
  @JSImport("aws-sdk", "RDSDataService")
  class RDSDataService() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchExecuteStatement(params: BatchExecuteStatementRequest): Request[BatchExecuteStatementResponse] = js.native
    def beginTransaction(params: BeginTransactionRequest): Request[BeginTransactionResponse]                = js.native
    def commitTransaction(params: CommitTransactionRequest): Request[CommitTransactionResponse]             = js.native
    def executeStatement(params: ExecuteStatementRequest): Request[ExecuteStatementResponse]                = js.native
    def rollbackTransaction(params: RollbackTransactionRequest): Request[RollbackTransactionResponse]       = js.native
    @deprecated("The ExecuteSql API is deprecated, please use the ExecuteStatement API.", "forever") def executeSql(
        params: ExecuteSqlRequest
    ): Request[ExecuteSqlResponse] = js.native
  }

  /**
    * Contains an array.
    */
  @js.native
  @Factory
  trait ArrayValue extends js.Object {
    var arrayValues: js.UndefOr[ArrayOfArray]
    var booleanValues: js.UndefOr[BooleanArray]
    var doubleValues: js.UndefOr[DoubleArray]
    var longValues: js.UndefOr[LongArray]
    var stringValues: js.UndefOr[StringArray]
  }

  /**
    * The request parameters represent the input of a SQL statement over an array of data.
    */
  @js.native
  @Factory
  trait BatchExecuteStatementRequest extends js.Object {
    var resourceArn: Arn
    var secretArn: Arn
    var sql: SqlStatement
    var database: js.UndefOr[DbName]
    var parameterSets: js.UndefOr[SqlParameterSets]
    var schema: js.UndefOr[DbName]
    var transactionId: js.UndefOr[Id]
  }

  /**
    * The response elements represent the output of a SQL statement over an array of data.
    */
  @js.native
  @Factory
  trait BatchExecuteStatementResponse extends js.Object {
    var updateResults: js.UndefOr[UpdateResults]
  }

  /**
    * The request parameters represent the input of a request to start a SQL transaction.
    */
  @js.native
  @Factory
  trait BeginTransactionRequest extends js.Object {
    var resourceArn: Arn
    var secretArn: Arn
    var database: js.UndefOr[DbName]
    var schema: js.UndefOr[DbName]
  }

  /**
    * The response elements represent the output of a request to start a SQL transaction.
    */
  @js.native
  @Factory
  trait BeginTransactionResponse extends js.Object {
    var transactionId: js.UndefOr[Id]
  }

  /**
    * Contains the metadata for a column.
    */
  @js.native
  @Factory
  trait ColumnMetadata extends js.Object {
    var arrayBaseColumnType: js.UndefOr[Int]
    var isAutoIncrement: js.UndefOr[Boolean]
    var isCaseSensitive: js.UndefOr[Boolean]
    var isCurrency: js.UndefOr[Boolean]
    var isSigned: js.UndefOr[Boolean]
    var label: js.UndefOr[String]
    var name: js.UndefOr[String]
    var nullable: js.UndefOr[Int]
    var precision: js.UndefOr[Int]
    var scale: js.UndefOr[Int]
    var schemaName: js.UndefOr[String]
    var tableName: js.UndefOr[String]
    var `type`: js.UndefOr[Int]
    var typeName: js.UndefOr[String]
  }

  /**
    * The request parameters represent the input of a commit transaction request.
    */
  @js.native
  @Factory
  trait CommitTransactionRequest extends js.Object {
    var resourceArn: Arn
    var secretArn: Arn
    var transactionId: Id
  }

  /**
    * The response elements represent the output of a commit transaction request.
    */
  @js.native
  @Factory
  trait CommitTransactionResponse extends js.Object {
    var transactionStatus: js.UndefOr[TransactionStatus]
  }

  @js.native
  sealed trait DecimalReturnType extends js.Any
  object DecimalReturnType extends js.Object {
    val DOUBLE_OR_LONG = "DOUBLE_OR_LONG".asInstanceOf[DecimalReturnType]
    val STRING         = "STRING".asInstanceOf[DecimalReturnType]

    val values = js.Object.freeze(js.Array(DOUBLE_OR_LONG, STRING))
  }

  /**
    * The request parameters represent the input of a request to run one or more SQL statements.
    */
  @js.native
  @Factory
  trait ExecuteSqlRequest extends js.Object {
    var awsSecretStoreArn: Arn
    var dbClusterOrInstanceArn: Arn
    var sqlStatements: SqlStatement
    var database: js.UndefOr[DbName]
    var schema: js.UndefOr[DbName]
  }

  /**
    * The response elements represent the output of a request to run one or more SQL statements.
    */
  @js.native
  @Factory
  trait ExecuteSqlResponse extends js.Object {
    var sqlStatementResults: js.UndefOr[SqlStatementResults]
  }

  /**
    * The request parameters represent the input of a request to run a SQL statement against a database.
    */
  @js.native
  @Factory
  trait ExecuteStatementRequest extends js.Object {
    var resourceArn: Arn
    var secretArn: Arn
    var sql: SqlStatement
    var continueAfterTimeout: js.UndefOr[Boolean]
    var database: js.UndefOr[DbName]
    var includeResultMetadata: js.UndefOr[Boolean]
    var parameters: js.UndefOr[SqlParametersList]
    var resultSetOptions: js.UndefOr[ResultSetOptions]
    var schema: js.UndefOr[DbName]
    var transactionId: js.UndefOr[Id]
  }

  /**
    * The response elements represent the output of a request to run a SQL statement against a database.
    */
  @js.native
  @Factory
  trait ExecuteStatementResponse extends js.Object {
    var columnMetadata: js.UndefOr[Metadata]
    var generatedFields: js.UndefOr[FieldList]
    var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated]
    var records: js.UndefOr[SqlRecords]
  }

  /**
    * Contains a value.
    */
  @js.native
  @Factory
  trait Field extends js.Object {
    var arrayValue: js.UndefOr[ArrayValue]
    var blobValue: js.UndefOr[Blob]
    var booleanValue: js.UndefOr[BoxedBoolean]
    var doubleValue: js.UndefOr[BoxedDouble]
    var isNull: js.UndefOr[BoxedBoolean]
    var longValue: js.UndefOr[BoxedLong]
    var stringValue: js.UndefOr[String]
  }

  /**
    * A record returned by a call.
    */
  @js.native
  @Factory
  trait Record extends js.Object {
    var values: js.UndefOr[Row]
  }

  /**
    * The result set returned by a SQL statement.
    */
  @js.native
  @Factory
  trait ResultFrame extends js.Object {
    var records: js.UndefOr[Records]
    var resultSetMetadata: js.UndefOr[ResultSetMetadata]
  }

  /**
    * The metadata of the result set returned by a SQL statement.
    */
  @js.native
  @Factory
  trait ResultSetMetadata extends js.Object {
    var columnCount: js.UndefOr[Double]
    var columnMetadata: js.UndefOr[Metadata]
  }

  /**
    * Options that control how the result set is returned.
    */
  @js.native
  @Factory
  trait ResultSetOptions extends js.Object {
    var decimalReturnType: js.UndefOr[DecimalReturnType]
  }

  /**
    * The request parameters represent the input of a request to perform a rollback of a transaction.
    */
  @js.native
  @Factory
  trait RollbackTransactionRequest extends js.Object {
    var resourceArn: Arn
    var secretArn: Arn
    var transactionId: Id
  }

  /**
    * The response elements represent the output of a request to perform a rollback of a transaction.
    */
  @js.native
  @Factory
  trait RollbackTransactionResponse extends js.Object {
    var transactionStatus: js.UndefOr[TransactionStatus]
  }

  /**
    * A parameter used in a SQL statement.
    */
  @js.native
  @Factory
  trait SqlParameter extends js.Object {
    var name: js.UndefOr[ParameterName]
    var typeHint: js.UndefOr[TypeHint]
    var value: js.UndefOr[Field]
  }

  /**
    * The result of a SQL statement.
    *  {{{ &lt;important&gt; &lt;p&gt;This data type is deprecated.&lt;/p&gt; &lt;/important&gt; }}}
    */
  @js.native
  @Factory
  trait SqlStatementResult extends js.Object {
    var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated]
    var resultFrame: js.UndefOr[ResultFrame]
  }

  /**
    * A structure value returned by a call.
    */
  @js.native
  @Factory
  trait StructValue extends js.Object {
    var attributes: js.UndefOr[ArrayValueList]
  }

  @js.native
  sealed trait TypeHint extends js.Any
  object TypeHint extends js.Object {
    val DATE      = "DATE".asInstanceOf[TypeHint]
    val DECIMAL   = "DECIMAL".asInstanceOf[TypeHint]
    val TIME      = "TIME".asInstanceOf[TypeHint]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[TypeHint]

    val values = js.Object.freeze(js.Array(DATE, DECIMAL, TIME, TIMESTAMP))
  }

  /**
    * The response elements represent the results of an update.
    */
  @js.native
  @Factory
  trait UpdateResult extends js.Object {
    var generatedFields: js.UndefOr[FieldList]
  }

  /**
    * Contains the value of a column.
    *  {{{ &lt;important&gt; &lt;p&gt;This data type is deprecated.&lt;/p&gt; &lt;/important&gt; }}}
    */
  @js.native
  @Factory
  trait Value extends js.Object {
    var arrayValues: js.UndefOr[ArrayValueList]
    var bigIntValue: js.UndefOr[BoxedLong]
    var bitValue: js.UndefOr[BoxedBoolean]
    var blobValue: js.UndefOr[Blob]
    var doubleValue: js.UndefOr[BoxedDouble]
    var intValue: js.UndefOr[BoxedInteger]
    var isNull: js.UndefOr[BoxedBoolean]
    var realValue: js.UndefOr[BoxedFloat]
    var stringValue: js.UndefOr[String]
    var structValue: js.UndefOr[StructValue]
  }
}
