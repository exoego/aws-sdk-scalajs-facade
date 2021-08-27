package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object rdsdataservice {
  type Arn = String
  type ArrayOfArray = js.Array[ArrayValue]
  type ArrayValueList = js.Array[Value]
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BooleanArray = js.Array[BoxedBoolean]
  type BoxedBoolean = Boolean
  type BoxedDouble = Double
  type BoxedFloat = Float
  type BoxedInteger = Int
  type BoxedLong = Double
  type DbName = String
  type DoubleArray = js.Array[BoxedDouble]
  type FieldList = js.Array[Field]
  type Id = String
  type LongArray = js.Array[BoxedLong]
  type Metadata = js.Array[ColumnMetadata]
  type ParameterName = String
  type Records = js.Array[Record]
  type RecordsUpdated = Double
  type Row = js.Array[Value]
  type SqlParameterSets = js.Array[SqlParametersList]
  type SqlParametersList = js.Array[SqlParameter]
  type SqlRecords = js.Array[FieldList]
  type SqlStatement = String
  type SqlStatementResults = js.Array[SqlStatementResult]
  type StringArray = js.Array[String]
  type TransactionStatus = String
  type UpdateResults = js.Array[UpdateResult]

  implicit final class RDSDataServiceOps(private val service: RDSDataService) extends AnyVal {

    @inline def batchExecuteStatementFuture(params: BatchExecuteStatementRequest): Future[BatchExecuteStatementResponse] = service.batchExecuteStatement(params).promise().toFuture
    @inline def beginTransactionFuture(params: BeginTransactionRequest): Future[BeginTransactionResponse] = service.beginTransaction(params).promise().toFuture
    @inline def commitTransactionFuture(params: CommitTransactionRequest): Future[CommitTransactionResponse] = service.commitTransaction(params).promise().toFuture
    @inline def executeStatementFuture(params: ExecuteStatementRequest): Future[ExecuteStatementResponse] = service.executeStatement(params).promise().toFuture
    @inline def rollbackTransactionFuture(params: RollbackTransactionRequest): Future[RollbackTransactionResponse] = service.rollbackTransaction(params).promise().toFuture

  }
}

package rdsdataservice {
  @js.native
  @JSImport("aws-sdk/clients/rdsdataservice", JSImport.Namespace, "AWS.RDSDataService")
  class RDSDataService() extends js.Object {
    def this(config: AWSConfig) = this()

    @deprecated("The ExecuteSql API is deprecated, please use the ExecuteStatement API.", "forever") def executeSql(params: ExecuteSqlRequest): Request[ExecuteSqlResponse] = js.native
    def batchExecuteStatement(params: BatchExecuteStatementRequest): Request[BatchExecuteStatementResponse] = js.native
    def beginTransaction(params: BeginTransactionRequest): Request[BeginTransactionResponse] = js.native
    def commitTransaction(params: CommitTransactionRequest): Request[CommitTransactionResponse] = js.native
    def executeStatement(params: ExecuteStatementRequest): Request[ExecuteStatementResponse] = js.native
    def rollbackTransaction(params: RollbackTransactionRequest): Request[RollbackTransactionResponse] = js.native
  }

  /** Contains an array.
    */
  @js.native
  trait ArrayValue extends js.Object {
    var arrayValues: js.UndefOr[ArrayOfArray]
    var booleanValues: js.UndefOr[BooleanArray]
    var doubleValues: js.UndefOr[DoubleArray]
    var longValues: js.UndefOr[LongArray]
    var stringValues: js.UndefOr[StringArray]
  }

  object ArrayValue {
    @inline
    def apply(
        arrayValues: js.UndefOr[ArrayOfArray] = js.undefined,
        booleanValues: js.UndefOr[BooleanArray] = js.undefined,
        doubleValues: js.UndefOr[DoubleArray] = js.undefined,
        longValues: js.UndefOr[LongArray] = js.undefined,
        stringValues: js.UndefOr[StringArray] = js.undefined
    ): ArrayValue = {
      val __obj = js.Dynamic.literal()
      arrayValues.foreach(__v => __obj.updateDynamic("arrayValues")(__v.asInstanceOf[js.Any]))
      booleanValues.foreach(__v => __obj.updateDynamic("booleanValues")(__v.asInstanceOf[js.Any]))
      doubleValues.foreach(__v => __obj.updateDynamic("doubleValues")(__v.asInstanceOf[js.Any]))
      longValues.foreach(__v => __obj.updateDynamic("longValues")(__v.asInstanceOf[js.Any]))
      stringValues.foreach(__v => __obj.updateDynamic("stringValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArrayValue]
    }
  }

  /** The request parameters represent the input of a SQL statement over an array of data.
    */
  @js.native
  trait BatchExecuteStatementRequest extends js.Object {
    var resourceArn: Arn
    var secretArn: Arn
    var sql: SqlStatement
    var database: js.UndefOr[DbName]
    var parameterSets: js.UndefOr[SqlParameterSets]
    var schema: js.UndefOr[DbName]
    var transactionId: js.UndefOr[Id]
  }

  object BatchExecuteStatementRequest {
    @inline
    def apply(
        resourceArn: Arn,
        secretArn: Arn,
        sql: SqlStatement,
        database: js.UndefOr[DbName] = js.undefined,
        parameterSets: js.UndefOr[SqlParameterSets] = js.undefined,
        schema: js.UndefOr[DbName] = js.undefined,
        transactionId: js.UndefOr[Id] = js.undefined
    ): BatchExecuteStatementRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "secretArn" -> secretArn.asInstanceOf[js.Any],
        "sql" -> sql.asInstanceOf[js.Any]
      )

      database.foreach(__v => __obj.updateDynamic("database")(__v.asInstanceOf[js.Any]))
      parameterSets.foreach(__v => __obj.updateDynamic("parameterSets")(__v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      transactionId.foreach(__v => __obj.updateDynamic("transactionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchExecuteStatementRequest]
    }
  }

  /** The response elements represent the output of a SQL statement over an array of data.
    */
  @js.native
  trait BatchExecuteStatementResponse extends js.Object {
    var updateResults: js.UndefOr[UpdateResults]
  }

  object BatchExecuteStatementResponse {
    @inline
    def apply(
        updateResults: js.UndefOr[UpdateResults] = js.undefined
    ): BatchExecuteStatementResponse = {
      val __obj = js.Dynamic.literal()
      updateResults.foreach(__v => __obj.updateDynamic("updateResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchExecuteStatementResponse]
    }
  }

  /** The request parameters represent the input of a request to start a SQL transaction.
    */
  @js.native
  trait BeginTransactionRequest extends js.Object {
    var resourceArn: Arn
    var secretArn: Arn
    var database: js.UndefOr[DbName]
    var schema: js.UndefOr[DbName]
  }

  object BeginTransactionRequest {
    @inline
    def apply(
        resourceArn: Arn,
        secretArn: Arn,
        database: js.UndefOr[DbName] = js.undefined,
        schema: js.UndefOr[DbName] = js.undefined
    ): BeginTransactionRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "secretArn" -> secretArn.asInstanceOf[js.Any]
      )

      database.foreach(__v => __obj.updateDynamic("database")(__v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BeginTransactionRequest]
    }
  }

  /** The response elements represent the output of a request to start a SQL transaction.
    */
  @js.native
  trait BeginTransactionResponse extends js.Object {
    var transactionId: js.UndefOr[Id]
  }

  object BeginTransactionResponse {
    @inline
    def apply(
        transactionId: js.UndefOr[Id] = js.undefined
    ): BeginTransactionResponse = {
      val __obj = js.Dynamic.literal()
      transactionId.foreach(__v => __obj.updateDynamic("transactionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BeginTransactionResponse]
    }
  }

  /** Contains the metadata for a column.
    */
  @js.native
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

  object ColumnMetadata {
    @inline
    def apply(
        arrayBaseColumnType: js.UndefOr[Int] = js.undefined,
        isAutoIncrement: js.UndefOr[Boolean] = js.undefined,
        isCaseSensitive: js.UndefOr[Boolean] = js.undefined,
        isCurrency: js.UndefOr[Boolean] = js.undefined,
        isSigned: js.UndefOr[Boolean] = js.undefined,
        label: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        nullable: js.UndefOr[Int] = js.undefined,
        precision: js.UndefOr[Int] = js.undefined,
        scale: js.UndefOr[Int] = js.undefined,
        schemaName: js.UndefOr[String] = js.undefined,
        tableName: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[Int] = js.undefined,
        typeName: js.UndefOr[String] = js.undefined
    ): ColumnMetadata = {
      val __obj = js.Dynamic.literal()
      arrayBaseColumnType.foreach(__v => __obj.updateDynamic("arrayBaseColumnType")(__v.asInstanceOf[js.Any]))
      isAutoIncrement.foreach(__v => __obj.updateDynamic("isAutoIncrement")(__v.asInstanceOf[js.Any]))
      isCaseSensitive.foreach(__v => __obj.updateDynamic("isCaseSensitive")(__v.asInstanceOf[js.Any]))
      isCurrency.foreach(__v => __obj.updateDynamic("isCurrency")(__v.asInstanceOf[js.Any]))
      isSigned.foreach(__v => __obj.updateDynamic("isSigned")(__v.asInstanceOf[js.Any]))
      label.foreach(__v => __obj.updateDynamic("label")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nullable.foreach(__v => __obj.updateDynamic("nullable")(__v.asInstanceOf[js.Any]))
      precision.foreach(__v => __obj.updateDynamic("precision")(__v.asInstanceOf[js.Any]))
      scale.foreach(__v => __obj.updateDynamic("scale")(__v.asInstanceOf[js.Any]))
      schemaName.foreach(__v => __obj.updateDynamic("schemaName")(__v.asInstanceOf[js.Any]))
      tableName.foreach(__v => __obj.updateDynamic("tableName")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      typeName.foreach(__v => __obj.updateDynamic("typeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnMetadata]
    }
  }

  /** The request parameters represent the input of a commit transaction request.
    */
  @js.native
  trait CommitTransactionRequest extends js.Object {
    var resourceArn: Arn
    var secretArn: Arn
    var transactionId: Id
  }

  object CommitTransactionRequest {
    @inline
    def apply(
        resourceArn: Arn,
        secretArn: Arn,
        transactionId: Id
    ): CommitTransactionRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "secretArn" -> secretArn.asInstanceOf[js.Any],
        "transactionId" -> transactionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CommitTransactionRequest]
    }
  }

  /** The response elements represent the output of a commit transaction request.
    */
  @js.native
  trait CommitTransactionResponse extends js.Object {
    var transactionStatus: js.UndefOr[TransactionStatus]
  }

  object CommitTransactionResponse {
    @inline
    def apply(
        transactionStatus: js.UndefOr[TransactionStatus] = js.undefined
    ): CommitTransactionResponse = {
      val __obj = js.Dynamic.literal()
      transactionStatus.foreach(__v => __obj.updateDynamic("transactionStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommitTransactionResponse]
    }
  }

  @js.native
  sealed trait DecimalReturnType extends js.Any
  object DecimalReturnType {
    val STRING = "STRING".asInstanceOf[DecimalReturnType]
    val DOUBLE_OR_LONG = "DOUBLE_OR_LONG".asInstanceOf[DecimalReturnType]

    @inline def values = js.Array(STRING, DOUBLE_OR_LONG)
  }

  /** The request parameters represent the input of a request to run one or more SQL statements.
    */
  @js.native
  trait ExecuteSqlRequest extends js.Object {
    var awsSecretStoreArn: Arn
    var dbClusterOrInstanceArn: Arn
    var sqlStatements: SqlStatement
    var database: js.UndefOr[DbName]
    var schema: js.UndefOr[DbName]
  }

  object ExecuteSqlRequest {
    @inline
    def apply(
        awsSecretStoreArn: Arn,
        dbClusterOrInstanceArn: Arn,
        sqlStatements: SqlStatement,
        database: js.UndefOr[DbName] = js.undefined,
        schema: js.UndefOr[DbName] = js.undefined
    ): ExecuteSqlRequest = {
      val __obj = js.Dynamic.literal(
        "awsSecretStoreArn" -> awsSecretStoreArn.asInstanceOf[js.Any],
        "dbClusterOrInstanceArn" -> dbClusterOrInstanceArn.asInstanceOf[js.Any],
        "sqlStatements" -> sqlStatements.asInstanceOf[js.Any]
      )

      database.foreach(__v => __obj.updateDynamic("database")(__v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteSqlRequest]
    }
  }

  /** The response elements represent the output of a request to run one or more SQL statements.
    */
  @js.native
  trait ExecuteSqlResponse extends js.Object {
    var sqlStatementResults: js.UndefOr[SqlStatementResults]
  }

  object ExecuteSqlResponse {
    @inline
    def apply(
        sqlStatementResults: js.UndefOr[SqlStatementResults] = js.undefined
    ): ExecuteSqlResponse = {
      val __obj = js.Dynamic.literal()
      sqlStatementResults.foreach(__v => __obj.updateDynamic("sqlStatementResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteSqlResponse]
    }
  }

  /** The request parameters represent the input of a request to run a SQL statement against a database.
    */
  @js.native
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

  object ExecuteStatementRequest {
    @inline
    def apply(
        resourceArn: Arn,
        secretArn: Arn,
        sql: SqlStatement,
        continueAfterTimeout: js.UndefOr[Boolean] = js.undefined,
        database: js.UndefOr[DbName] = js.undefined,
        includeResultMetadata: js.UndefOr[Boolean] = js.undefined,
        parameters: js.UndefOr[SqlParametersList] = js.undefined,
        resultSetOptions: js.UndefOr[ResultSetOptions] = js.undefined,
        schema: js.UndefOr[DbName] = js.undefined,
        transactionId: js.UndefOr[Id] = js.undefined
    ): ExecuteStatementRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "secretArn" -> secretArn.asInstanceOf[js.Any],
        "sql" -> sql.asInstanceOf[js.Any]
      )

      continueAfterTimeout.foreach(__v => __obj.updateDynamic("continueAfterTimeout")(__v.asInstanceOf[js.Any]))
      database.foreach(__v => __obj.updateDynamic("database")(__v.asInstanceOf[js.Any]))
      includeResultMetadata.foreach(__v => __obj.updateDynamic("includeResultMetadata")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      resultSetOptions.foreach(__v => __obj.updateDynamic("resultSetOptions")(__v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      transactionId.foreach(__v => __obj.updateDynamic("transactionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteStatementRequest]
    }
  }

  /** The response elements represent the output of a request to run a SQL statement against a database.
    */
  @js.native
  trait ExecuteStatementResponse extends js.Object {
    var columnMetadata: js.UndefOr[Metadata]
    var generatedFields: js.UndefOr[FieldList]
    var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated]
    var records: js.UndefOr[SqlRecords]
  }

  object ExecuteStatementResponse {
    @inline
    def apply(
        columnMetadata: js.UndefOr[Metadata] = js.undefined,
        generatedFields: js.UndefOr[FieldList] = js.undefined,
        numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.undefined,
        records: js.UndefOr[SqlRecords] = js.undefined
    ): ExecuteStatementResponse = {
      val __obj = js.Dynamic.literal()
      columnMetadata.foreach(__v => __obj.updateDynamic("columnMetadata")(__v.asInstanceOf[js.Any]))
      generatedFields.foreach(__v => __obj.updateDynamic("generatedFields")(__v.asInstanceOf[js.Any]))
      numberOfRecordsUpdated.foreach(__v => __obj.updateDynamic("numberOfRecordsUpdated")(__v.asInstanceOf[js.Any]))
      records.foreach(__v => __obj.updateDynamic("records")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteStatementResponse]
    }
  }

  /** Contains a value.
    */
  @js.native
  trait Field extends js.Object {
    var arrayValue: js.UndefOr[ArrayValue]
    var blobValue: js.UndefOr[Blob]
    var booleanValue: js.UndefOr[BoxedBoolean]
    var doubleValue: js.UndefOr[BoxedDouble]
    var isNull: js.UndefOr[BoxedBoolean]
    var longValue: js.UndefOr[BoxedLong]
    var stringValue: js.UndefOr[String]
  }

  object Field {
    @inline
    def apply(
        arrayValue: js.UndefOr[ArrayValue] = js.undefined,
        blobValue: js.UndefOr[Blob] = js.undefined,
        booleanValue: js.UndefOr[BoxedBoolean] = js.undefined,
        doubleValue: js.UndefOr[BoxedDouble] = js.undefined,
        isNull: js.UndefOr[BoxedBoolean] = js.undefined,
        longValue: js.UndefOr[BoxedLong] = js.undefined,
        stringValue: js.UndefOr[String] = js.undefined
    ): Field = {
      val __obj = js.Dynamic.literal()
      arrayValue.foreach(__v => __obj.updateDynamic("arrayValue")(__v.asInstanceOf[js.Any]))
      blobValue.foreach(__v => __obj.updateDynamic("blobValue")(__v.asInstanceOf[js.Any]))
      booleanValue.foreach(__v => __obj.updateDynamic("booleanValue")(__v.asInstanceOf[js.Any]))
      doubleValue.foreach(__v => __obj.updateDynamic("doubleValue")(__v.asInstanceOf[js.Any]))
      isNull.foreach(__v => __obj.updateDynamic("isNull")(__v.asInstanceOf[js.Any]))
      longValue.foreach(__v => __obj.updateDynamic("longValue")(__v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.updateDynamic("stringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Field]
    }
  }

  /** A record returned by a call.
    */
  @js.native
  trait Record extends js.Object {
    var values: js.UndefOr[Row]
  }

  object Record {
    @inline
    def apply(
        values: js.UndefOr[Row] = js.undefined
    ): Record = {
      val __obj = js.Dynamic.literal()
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Record]
    }
  }

  /** The result set returned by a SQL statement.
    */
  @js.native
  trait ResultFrame extends js.Object {
    var records: js.UndefOr[Records]
    var resultSetMetadata: js.UndefOr[ResultSetMetadata]
  }

  object ResultFrame {
    @inline
    def apply(
        records: js.UndefOr[Records] = js.undefined,
        resultSetMetadata: js.UndefOr[ResultSetMetadata] = js.undefined
    ): ResultFrame = {
      val __obj = js.Dynamic.literal()
      records.foreach(__v => __obj.updateDynamic("records")(__v.asInstanceOf[js.Any]))
      resultSetMetadata.foreach(__v => __obj.updateDynamic("resultSetMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultFrame]
    }
  }

  /** The metadata of the result set returned by a SQL statement.
    */
  @js.native
  trait ResultSetMetadata extends js.Object {
    var columnCount: js.UndefOr[Double]
    var columnMetadata: js.UndefOr[Metadata]
  }

  object ResultSetMetadata {
    @inline
    def apply(
        columnCount: js.UndefOr[Double] = js.undefined,
        columnMetadata: js.UndefOr[Metadata] = js.undefined
    ): ResultSetMetadata = {
      val __obj = js.Dynamic.literal()
      columnCount.foreach(__v => __obj.updateDynamic("columnCount")(__v.asInstanceOf[js.Any]))
      columnMetadata.foreach(__v => __obj.updateDynamic("columnMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultSetMetadata]
    }
  }

  /** Options that control how the result set is returned.
    */
  @js.native
  trait ResultSetOptions extends js.Object {
    var decimalReturnType: js.UndefOr[DecimalReturnType]
  }

  object ResultSetOptions {
    @inline
    def apply(
        decimalReturnType: js.UndefOr[DecimalReturnType] = js.undefined
    ): ResultSetOptions = {
      val __obj = js.Dynamic.literal()
      decimalReturnType.foreach(__v => __obj.updateDynamic("decimalReturnType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultSetOptions]
    }
  }

  /** The request parameters represent the input of a request to perform a rollback of a transaction.
    */
  @js.native
  trait RollbackTransactionRequest extends js.Object {
    var resourceArn: Arn
    var secretArn: Arn
    var transactionId: Id
  }

  object RollbackTransactionRequest {
    @inline
    def apply(
        resourceArn: Arn,
        secretArn: Arn,
        transactionId: Id
    ): RollbackTransactionRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "secretArn" -> secretArn.asInstanceOf[js.Any],
        "transactionId" -> transactionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RollbackTransactionRequest]
    }
  }

  /** The response elements represent the output of a request to perform a rollback of a transaction.
    */
  @js.native
  trait RollbackTransactionResponse extends js.Object {
    var transactionStatus: js.UndefOr[TransactionStatus]
  }

  object RollbackTransactionResponse {
    @inline
    def apply(
        transactionStatus: js.UndefOr[TransactionStatus] = js.undefined
    ): RollbackTransactionResponse = {
      val __obj = js.Dynamic.literal()
      transactionStatus.foreach(__v => __obj.updateDynamic("transactionStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RollbackTransactionResponse]
    }
  }

  /** A parameter used in a SQL statement.
    */
  @js.native
  trait SqlParameter extends js.Object {
    var name: js.UndefOr[ParameterName]
    var typeHint: js.UndefOr[TypeHint]
    var value: js.UndefOr[Field]
  }

  object SqlParameter {
    @inline
    def apply(
        name: js.UndefOr[ParameterName] = js.undefined,
        typeHint: js.UndefOr[TypeHint] = js.undefined,
        value: js.UndefOr[Field] = js.undefined
    ): SqlParameter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      typeHint.foreach(__v => __obj.updateDynamic("typeHint")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqlParameter]
    }
  }

  /** The result of a SQL statement. {{{&lt;important&gt; &lt;p&gt;This data type is deprecated.&lt;/p&gt; &lt;/important&gt;}}}
    */
  @js.native
  trait SqlStatementResult extends js.Object {
    var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated]
    var resultFrame: js.UndefOr[ResultFrame]
  }

  object SqlStatementResult {
    @inline
    def apply(
        numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.undefined,
        resultFrame: js.UndefOr[ResultFrame] = js.undefined
    ): SqlStatementResult = {
      val __obj = js.Dynamic.literal()
      numberOfRecordsUpdated.foreach(__v => __obj.updateDynamic("numberOfRecordsUpdated")(__v.asInstanceOf[js.Any]))
      resultFrame.foreach(__v => __obj.updateDynamic("resultFrame")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqlStatementResult]
    }
  }

  /** A structure value returned by a call.
    */
  @js.native
  trait StructValue extends js.Object {
    var attributes: js.UndefOr[ArrayValueList]
  }

  object StructValue {
    @inline
    def apply(
        attributes: js.UndefOr[ArrayValueList] = js.undefined
    ): StructValue = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StructValue]
    }
  }

  @js.native
  sealed trait TypeHint extends js.Any
  object TypeHint {
    val JSON = "JSON".asInstanceOf[TypeHint]
    val UUID = "UUID".asInstanceOf[TypeHint]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[TypeHint]
    val DATE = "DATE".asInstanceOf[TypeHint]
    val TIME = "TIME".asInstanceOf[TypeHint]
    val DECIMAL = "DECIMAL".asInstanceOf[TypeHint]

    @inline def values = js.Array(JSON, UUID, TIMESTAMP, DATE, TIME, DECIMAL)
  }

  /** The response elements represent the results of an update.
    */
  @js.native
  trait UpdateResult extends js.Object {
    var generatedFields: js.UndefOr[FieldList]
  }

  object UpdateResult {
    @inline
    def apply(
        generatedFields: js.UndefOr[FieldList] = js.undefined
    ): UpdateResult = {
      val __obj = js.Dynamic.literal()
      generatedFields.foreach(__v => __obj.updateDynamic("generatedFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResult]
    }
  }

  /** Contains the value of a column. {{{&lt;important&gt; &lt;p&gt;This data type is deprecated.&lt;/p&gt; &lt;/important&gt;}}}
    */
  @js.native
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

  object Value {
    @inline
    def apply(
        arrayValues: js.UndefOr[ArrayValueList] = js.undefined,
        bigIntValue: js.UndefOr[BoxedLong] = js.undefined,
        bitValue: js.UndefOr[BoxedBoolean] = js.undefined,
        blobValue: js.UndefOr[Blob] = js.undefined,
        doubleValue: js.UndefOr[BoxedDouble] = js.undefined,
        intValue: js.UndefOr[BoxedInteger] = js.undefined,
        isNull: js.UndefOr[BoxedBoolean] = js.undefined,
        realValue: js.UndefOr[BoxedFloat] = js.undefined,
        stringValue: js.UndefOr[String] = js.undefined,
        structValue: js.UndefOr[StructValue] = js.undefined
    ): Value = {
      val __obj = js.Dynamic.literal()
      arrayValues.foreach(__v => __obj.updateDynamic("arrayValues")(__v.asInstanceOf[js.Any]))
      bigIntValue.foreach(__v => __obj.updateDynamic("bigIntValue")(__v.asInstanceOf[js.Any]))
      bitValue.foreach(__v => __obj.updateDynamic("bitValue")(__v.asInstanceOf[js.Any]))
      blobValue.foreach(__v => __obj.updateDynamic("blobValue")(__v.asInstanceOf[js.Any]))
      doubleValue.foreach(__v => __obj.updateDynamic("doubleValue")(__v.asInstanceOf[js.Any]))
      intValue.foreach(__v => __obj.updateDynamic("intValue")(__v.asInstanceOf[js.Any]))
      isNull.foreach(__v => __obj.updateDynamic("isNull")(__v.asInstanceOf[js.Any]))
      realValue.foreach(__v => __obj.updateDynamic("realValue")(__v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.updateDynamic("stringValue")(__v.asInstanceOf[js.Any]))
      structValue.foreach(__v => __obj.updateDynamic("structValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Value]
    }
  }
}
