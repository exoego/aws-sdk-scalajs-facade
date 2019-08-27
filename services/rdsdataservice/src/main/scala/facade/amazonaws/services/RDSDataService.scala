package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object rdsdataservice {
  type Arn                 = String
  type ArrayValueList      = js.Array[Value]
  type Blob                = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BoxedBoolean        = Boolean
  type BoxedDouble         = Double
  type BoxedFloat          = Float
  type BoxedInteger        = Int
  type BoxedLong           = Double
  type DbName              = String
  type FieldList           = js.Array[Field]
  type Id                  = String
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
  type TransactionStatus   = String
  type UpdateResults       = js.Array[UpdateResult]

  implicit final class RDSDataServiceOps(val service: RDSDataService) extends AnyVal {

    def batchExecuteStatementFuture(params: BatchExecuteStatementRequest): Future[BatchExecuteStatementResponse] =
      service.batchExecuteStatement(params).promise.toFuture
    def beginTransactionFuture(params: BeginTransactionRequest): Future[BeginTransactionResponse] =
      service.beginTransaction(params).promise.toFuture
    def commitTransactionFuture(params: CommitTransactionRequest): Future[CommitTransactionResponse] =
      service.commitTransaction(params).promise.toFuture
    def executeStatementFuture(params: ExecuteStatementRequest): Future[ExecuteStatementResponse] =
      service.executeStatement(params).promise.toFuture
    def rollbackTransactionFuture(params: RollbackTransactionRequest): Future[RollbackTransactionResponse] =
      service.rollbackTransaction(params).promise.toFuture
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
    @deprecated("Deprecated in AWS SDK", "forever") def executeSql(
        params: ExecuteSqlRequest
    ): Request[ExecuteSqlResponse] = js.native
  }

  /**
    * <p>The request parameters represent the input of a SQL statement over an array of
    *             data.</p>
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
    def apply(
        resourceArn: Arn,
        secretArn: Arn,
        sql: SqlStatement,
        database: js.UndefOr[DbName] = js.undefined,
        parameterSets: js.UndefOr[SqlParameterSets] = js.undefined,
        schema: js.UndefOr[DbName] = js.undefined,
        transactionId: js.UndefOr[Id] = js.undefined
    ): BatchExecuteStatementRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "secretArn"   -> secretArn.asInstanceOf[js.Any],
        "sql"         -> sql.asInstanceOf[js.Any]
      )

      database.foreach(__v => __obj.update("database", __v.asInstanceOf[js.Any]))
      parameterSets.foreach(__v => __obj.update("parameterSets", __v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.update("schema", __v.asInstanceOf[js.Any]))
      transactionId.foreach(__v => __obj.update("transactionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchExecuteStatementRequest]
    }
  }

  /**
    * <p>The response elements represent the output of a SQL statement over an array of
    *             data.</p>
    */
  @js.native
  trait BatchExecuteStatementResponse extends js.Object {
    var updateResults: js.UndefOr[UpdateResults]
  }

  object BatchExecuteStatementResponse {
    def apply(
        updateResults: js.UndefOr[UpdateResults] = js.undefined
    ): BatchExecuteStatementResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      updateResults.foreach(__v => __obj.update("updateResults", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchExecuteStatementResponse]
    }
  }

  /**
    * <p>The request parameters represent the input of a request to start a SQL
    *             transaction.</p>
    */
  @js.native
  trait BeginTransactionRequest extends js.Object {
    var resourceArn: Arn
    var secretArn: Arn
    var database: js.UndefOr[DbName]
    var schema: js.UndefOr[DbName]
  }

  object BeginTransactionRequest {
    def apply(
        resourceArn: Arn,
        secretArn: Arn,
        database: js.UndefOr[DbName] = js.undefined,
        schema: js.UndefOr[DbName] = js.undefined
    ): BeginTransactionRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "secretArn"   -> secretArn.asInstanceOf[js.Any]
      )

      database.foreach(__v => __obj.update("database", __v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.update("schema", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BeginTransactionRequest]
    }
  }

  /**
    * <p>The response elements represent the output of a request to start a SQL
    *             transaction.</p>
    */
  @js.native
  trait BeginTransactionResponse extends js.Object {
    var transactionId: js.UndefOr[Id]
  }

  object BeginTransactionResponse {
    def apply(
        transactionId: js.UndefOr[Id] = js.undefined
    ): BeginTransactionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      transactionId.foreach(__v => __obj.update("transactionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BeginTransactionResponse]
    }
  }

  /**
    * Contains the metadata for a column.
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
      val __obj = js.Dictionary.empty[js.Any]
      arrayBaseColumnType.foreach(__v => __obj.update("arrayBaseColumnType", __v.asInstanceOf[js.Any]))
      isAutoIncrement.foreach(__v => __obj.update("isAutoIncrement", __v.asInstanceOf[js.Any]))
      isCaseSensitive.foreach(__v => __obj.update("isCaseSensitive", __v.asInstanceOf[js.Any]))
      isCurrency.foreach(__v => __obj.update("isCurrency", __v.asInstanceOf[js.Any]))
      isSigned.foreach(__v => __obj.update("isSigned", __v.asInstanceOf[js.Any]))
      label.foreach(__v => __obj.update("label", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      nullable.foreach(__v => __obj.update("nullable", __v.asInstanceOf[js.Any]))
      precision.foreach(__v => __obj.update("precision", __v.asInstanceOf[js.Any]))
      scale.foreach(__v => __obj.update("scale", __v.asInstanceOf[js.Any]))
      schemaName.foreach(__v => __obj.update("schemaName", __v.asInstanceOf[js.Any]))
      tableName.foreach(__v => __obj.update("tableName", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      typeName.foreach(__v => __obj.update("typeName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnMetadata]
    }
  }

  /**
    * The request parameters represent the input of a commit transaction request.
    */
  @js.native
  trait CommitTransactionRequest extends js.Object {
    var resourceArn: Arn
    var secretArn: Arn
    var transactionId: Id
  }

  object CommitTransactionRequest {
    def apply(
        resourceArn: Arn,
        secretArn: Arn,
        transactionId: Id
    ): CommitTransactionRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn"   -> resourceArn.asInstanceOf[js.Any],
        "secretArn"     -> secretArn.asInstanceOf[js.Any],
        "transactionId" -> transactionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CommitTransactionRequest]
    }
  }

  /**
    * The response elements represent the output of a commit transaction request.
    */
  @js.native
  trait CommitTransactionResponse extends js.Object {
    var transactionStatus: js.UndefOr[TransactionStatus]
  }

  object CommitTransactionResponse {
    def apply(
        transactionStatus: js.UndefOr[TransactionStatus] = js.undefined
    ): CommitTransactionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      transactionStatus.foreach(__v => __obj.update("transactionStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommitTransactionResponse]
    }
  }

  /**
    * <p>The request parameters represent the input of a request to run one or more SQL
    *             statements.</p>
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
    def apply(
        awsSecretStoreArn: Arn,
        dbClusterOrInstanceArn: Arn,
        sqlStatements: SqlStatement,
        database: js.UndefOr[DbName] = js.undefined,
        schema: js.UndefOr[DbName] = js.undefined
    ): ExecuteSqlRequest = {
      val __obj = js.Dictionary[js.Any](
        "awsSecretStoreArn"      -> awsSecretStoreArn.asInstanceOf[js.Any],
        "dbClusterOrInstanceArn" -> dbClusterOrInstanceArn.asInstanceOf[js.Any],
        "sqlStatements"          -> sqlStatements.asInstanceOf[js.Any]
      )

      database.foreach(__v => __obj.update("database", __v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.update("schema", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteSqlRequest]
    }
  }

  /**
    * <p>The response elements represent the output of a request to run one or more SQL
    *             statements.</p>
    */
  @js.native
  trait ExecuteSqlResponse extends js.Object {
    var sqlStatementResults: js.UndefOr[SqlStatementResults]
  }

  object ExecuteSqlResponse {
    def apply(
        sqlStatementResults: js.UndefOr[SqlStatementResults] = js.undefined
    ): ExecuteSqlResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      sqlStatementResults.foreach(__v => __obj.update("sqlStatementResults", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteSqlResponse]
    }
  }

  /**
    * <p>The request parameters represent the input of a request to run a SQL statement against
    *             a database.</p>
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
    var schema: js.UndefOr[DbName]
    var transactionId: js.UndefOr[Id]
  }

  object ExecuteStatementRequest {
    def apply(
        resourceArn: Arn,
        secretArn: Arn,
        sql: SqlStatement,
        continueAfterTimeout: js.UndefOr[Boolean] = js.undefined,
        database: js.UndefOr[DbName] = js.undefined,
        includeResultMetadata: js.UndefOr[Boolean] = js.undefined,
        parameters: js.UndefOr[SqlParametersList] = js.undefined,
        schema: js.UndefOr[DbName] = js.undefined,
        transactionId: js.UndefOr[Id] = js.undefined
    ): ExecuteStatementRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "secretArn"   -> secretArn.asInstanceOf[js.Any],
        "sql"         -> sql.asInstanceOf[js.Any]
      )

      continueAfterTimeout.foreach(__v => __obj.update("continueAfterTimeout", __v.asInstanceOf[js.Any]))
      database.foreach(__v => __obj.update("database", __v.asInstanceOf[js.Any]))
      includeResultMetadata.foreach(__v => __obj.update("includeResultMetadata", __v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.update("parameters", __v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.update("schema", __v.asInstanceOf[js.Any]))
      transactionId.foreach(__v => __obj.update("transactionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteStatementRequest]
    }
  }

  /**
    * <p>The response elements represent the output of a request to run a SQL statement against
    *             a database.</p>
    */
  @js.native
  trait ExecuteStatementResponse extends js.Object {
    var columnMetadata: js.UndefOr[Metadata]
    var generatedFields: js.UndefOr[FieldList]
    var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated]
    var records: js.UndefOr[SqlRecords]
  }

  object ExecuteStatementResponse {
    def apply(
        columnMetadata: js.UndefOr[Metadata] = js.undefined,
        generatedFields: js.UndefOr[FieldList] = js.undefined,
        numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.undefined,
        records: js.UndefOr[SqlRecords] = js.undefined
    ): ExecuteStatementResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      columnMetadata.foreach(__v => __obj.update("columnMetadata", __v.asInstanceOf[js.Any]))
      generatedFields.foreach(__v => __obj.update("generatedFields", __v.asInstanceOf[js.Any]))
      numberOfRecordsUpdated.foreach(__v => __obj.update("numberOfRecordsUpdated", __v.asInstanceOf[js.Any]))
      records.foreach(__v => __obj.update("records", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteStatementResponse]
    }
  }

  /**
    * Contains a value.
    */
  @js.native
  trait Field extends js.Object {
    var blobValue: js.UndefOr[Blob]
    var booleanValue: js.UndefOr[BoxedBoolean]
    var doubleValue: js.UndefOr[BoxedDouble]
    var isNull: js.UndefOr[BoxedBoolean]
    var longValue: js.UndefOr[BoxedLong]
    var stringValue: js.UndefOr[String]
  }

  object Field {
    def apply(
        blobValue: js.UndefOr[Blob] = js.undefined,
        booleanValue: js.UndefOr[BoxedBoolean] = js.undefined,
        doubleValue: js.UndefOr[BoxedDouble] = js.undefined,
        isNull: js.UndefOr[BoxedBoolean] = js.undefined,
        longValue: js.UndefOr[BoxedLong] = js.undefined,
        stringValue: js.UndefOr[String] = js.undefined
    ): Field = {
      val __obj = js.Dictionary.empty[js.Any]
      blobValue.foreach(__v => __obj.update("blobValue", __v.asInstanceOf[js.Any]))
      booleanValue.foreach(__v => __obj.update("booleanValue", __v.asInstanceOf[js.Any]))
      doubleValue.foreach(__v => __obj.update("doubleValue", __v.asInstanceOf[js.Any]))
      isNull.foreach(__v => __obj.update("isNull", __v.asInstanceOf[js.Any]))
      longValue.foreach(__v => __obj.update("longValue", __v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.update("stringValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Field]
    }
  }

  /**
    * A record returned by a call.
    */
  @js.native
  trait Record extends js.Object {
    var values: js.UndefOr[Row]
  }

  object Record {
    def apply(
        values: js.UndefOr[Row] = js.undefined
    ): Record = {
      val __obj = js.Dictionary.empty[js.Any]
      values.foreach(__v => __obj.update("values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Record]
    }
  }

  /**
    * The result set returned by a SQL statement.
    */
  @js.native
  trait ResultFrame extends js.Object {
    var records: js.UndefOr[Records]
    var resultSetMetadata: js.UndefOr[ResultSetMetadata]
  }

  object ResultFrame {
    def apply(
        records: js.UndefOr[Records] = js.undefined,
        resultSetMetadata: js.UndefOr[ResultSetMetadata] = js.undefined
    ): ResultFrame = {
      val __obj = js.Dictionary.empty[js.Any]
      records.foreach(__v => __obj.update("records", __v.asInstanceOf[js.Any]))
      resultSetMetadata.foreach(__v => __obj.update("resultSetMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultFrame]
    }
  }

  /**
    * The metadata of the result set returned by a SQL statement.
    */
  @js.native
  trait ResultSetMetadata extends js.Object {
    var columnCount: js.UndefOr[Double]
    var columnMetadata: js.UndefOr[Metadata]
  }

  object ResultSetMetadata {
    def apply(
        columnCount: js.UndefOr[Double] = js.undefined,
        columnMetadata: js.UndefOr[Metadata] = js.undefined
    ): ResultSetMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      columnCount.foreach(__v => __obj.update("columnCount", __v.asInstanceOf[js.Any]))
      columnMetadata.foreach(__v => __obj.update("columnMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultSetMetadata]
    }
  }

  /**
    * <p>The request parameters represent the input of a request to perform a rollback of a
    *             transaction.</p>
    */
  @js.native
  trait RollbackTransactionRequest extends js.Object {
    var resourceArn: Arn
    var secretArn: Arn
    var transactionId: Id
  }

  object RollbackTransactionRequest {
    def apply(
        resourceArn: Arn,
        secretArn: Arn,
        transactionId: Id
    ): RollbackTransactionRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn"   -> resourceArn.asInstanceOf[js.Any],
        "secretArn"     -> secretArn.asInstanceOf[js.Any],
        "transactionId" -> transactionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RollbackTransactionRequest]
    }
  }

  /**
    * <p>The response elements represent the output of a request to perform a rollback of a
    *             transaction.</p>
    */
  @js.native
  trait RollbackTransactionResponse extends js.Object {
    var transactionStatus: js.UndefOr[TransactionStatus]
  }

  object RollbackTransactionResponse {
    def apply(
        transactionStatus: js.UndefOr[TransactionStatus] = js.undefined
    ): RollbackTransactionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      transactionStatus.foreach(__v => __obj.update("transactionStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RollbackTransactionResponse]
    }
  }

  /**
    * A parameter used in a SQL statement.
    */
  @js.native
  trait SqlParameter extends js.Object {
    var name: js.UndefOr[ParameterName]
    var value: js.UndefOr[Field]
  }

  object SqlParameter {
    def apply(
        name: js.UndefOr[ParameterName] = js.undefined,
        value: js.UndefOr[Field] = js.undefined
    ): SqlParameter = {
      val __obj = js.Dictionary.empty[js.Any]
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqlParameter]
    }
  }

  /**
    * The result of a SQL statement.
    */
  @js.native
  trait SqlStatementResult extends js.Object {
    var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated]
    var resultFrame: js.UndefOr[ResultFrame]
  }

  object SqlStatementResult {
    def apply(
        numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.undefined,
        resultFrame: js.UndefOr[ResultFrame] = js.undefined
    ): SqlStatementResult = {
      val __obj = js.Dictionary.empty[js.Any]
      numberOfRecordsUpdated.foreach(__v => __obj.update("numberOfRecordsUpdated", __v.asInstanceOf[js.Any]))
      resultFrame.foreach(__v => __obj.update("resultFrame", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqlStatementResult]
    }
  }

  /**
    * A structure value returned by a call.
    */
  @js.native
  trait StructValue extends js.Object {
    var attributes: js.UndefOr[ArrayValueList]
  }

  object StructValue {
    def apply(
        attributes: js.UndefOr[ArrayValueList] = js.undefined
    ): StructValue = {
      val __obj = js.Dictionary.empty[js.Any]
      attributes.foreach(__v => __obj.update("attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StructValue]
    }
  }

  /**
    * The response elements represent the results of an update.
    */
  @js.native
  trait UpdateResult extends js.Object {
    var generatedFields: js.UndefOr[FieldList]
  }

  object UpdateResult {
    def apply(
        generatedFields: js.UndefOr[FieldList] = js.undefined
    ): UpdateResult = {
      val __obj = js.Dictionary.empty[js.Any]
      generatedFields.foreach(__v => __obj.update("generatedFields", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResult]
    }
  }

  /**
    * Contains the value of a column.
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
      val __obj = js.Dictionary.empty[js.Any]
      arrayValues.foreach(__v => __obj.update("arrayValues", __v.asInstanceOf[js.Any]))
      bigIntValue.foreach(__v => __obj.update("bigIntValue", __v.asInstanceOf[js.Any]))
      bitValue.foreach(__v => __obj.update("bitValue", __v.asInstanceOf[js.Any]))
      blobValue.foreach(__v => __obj.update("blobValue", __v.asInstanceOf[js.Any]))
      doubleValue.foreach(__v => __obj.update("doubleValue", __v.asInstanceOf[js.Any]))
      intValue.foreach(__v => __obj.update("intValue", __v.asInstanceOf[js.Any]))
      isNull.foreach(__v => __obj.update("isNull", __v.asInstanceOf[js.Any]))
      realValue.foreach(__v => __obj.update("realValue", __v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.update("stringValue", __v.asInstanceOf[js.Any]))
      structValue.foreach(__v => __obj.update("structValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Value]
    }
  }
}
