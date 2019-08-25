package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object rdsdataservice {
  type Arn                 = String
  type ArrayValues         = js.Array[Value]
  type Blob                = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ColumnMetadataList  = js.Array[ColumnMetadata]
  type DbName              = String
  type Records             = js.Array[Record]
  type Row                 = js.Array[Value]
  type SqlStatement        = String
  type SqlStatementResults = js.Array[SqlStatementResult]

  implicit final class RDSDataServiceOps(val service: RDSDataService) extends AnyVal {

    def executeSqlFuture(params: ExecuteSqlRequest): Future[ExecuteSqlResponse] =
      service.executeSql(params).promise.toFuture
  }
}

package rdsdataservice {
  @js.native
  @JSImport("aws-sdk", "RDSDataService")
  class RDSDataService() extends js.Object {
    def this(config: AWSConfig) = this()

    def executeSql(params: ExecuteSqlRequest): Request[ExecuteSqlResponse] = js.native
  }

  /**
    * Column Metadata
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
    * Execute SQL Request
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
    * Execute SQL response
    */
  @js.native
  trait ExecuteSqlResponse extends js.Object {
    var sqlStatementResults: SqlStatementResults
  }

  object ExecuteSqlResponse {
    def apply(
        sqlStatementResults: SqlStatementResults
    ): ExecuteSqlResponse = {
      val __obj = js.Dictionary[js.Any](
        "sqlStatementResults" -> sqlStatementResults.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExecuteSqlResponse]
    }
  }

  /**
    * Row or Record
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
    * Result Frame
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
    * List of columns and their types.
    */
  @js.native
  trait ResultSetMetadata extends js.Object {
    var columnCount: js.UndefOr[Double]
    var columnMetadata: js.UndefOr[ColumnMetadataList]
  }

  object ResultSetMetadata {
    def apply(
        columnCount: js.UndefOr[Double] = js.undefined,
        columnMetadata: js.UndefOr[ColumnMetadataList] = js.undefined
    ): ResultSetMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      columnCount.foreach(__v => __obj.update("columnCount", __v.asInstanceOf[js.Any]))
      columnMetadata.foreach(__v => __obj.update("columnMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultSetMetadata]
    }
  }

  /**
    * SQL statement execution result
    */
  @js.native
  trait SqlStatementResult extends js.Object {
    var numberOfRecordsUpdated: js.UndefOr[Double]
    var resultFrame: js.UndefOr[ResultFrame]
  }

  object SqlStatementResult {
    def apply(
        numberOfRecordsUpdated: js.UndefOr[Double] = js.undefined,
        resultFrame: js.UndefOr[ResultFrame] = js.undefined
    ): SqlStatementResult = {
      val __obj = js.Dictionary.empty[js.Any]
      numberOfRecordsUpdated.foreach(__v => __obj.update("numberOfRecordsUpdated", __v.asInstanceOf[js.Any]))
      resultFrame.foreach(__v => __obj.update("resultFrame", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqlStatementResult]
    }
  }

  /**
    * User Defined Type
    */
  @js.native
  trait StructValue extends js.Object {
    var attributes: js.UndefOr[ArrayValues]
  }

  object StructValue {
    def apply(
        attributes: js.UndefOr[ArrayValues] = js.undefined
    ): StructValue = {
      val __obj = js.Dictionary.empty[js.Any]
      attributes.foreach(__v => __obj.update("attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StructValue]
    }
  }

  /**
    * Column value
    */
  @js.native
  trait Value extends js.Object {
    var arrayValues: js.UndefOr[ArrayValues]
    var bigIntValue: js.UndefOr[Double]
    var bitValue: js.UndefOr[Boolean]
    var blobValue: js.UndefOr[Blob]
    var doubleValue: js.UndefOr[Double]
    var intValue: js.UndefOr[Int]
    var isNull: js.UndefOr[Boolean]
    var realValue: js.UndefOr[Float]
    var stringValue: js.UndefOr[String]
    var structValue: js.UndefOr[StructValue]
  }

  object Value {
    def apply(
        arrayValues: js.UndefOr[ArrayValues] = js.undefined,
        bigIntValue: js.UndefOr[Double] = js.undefined,
        bitValue: js.UndefOr[Boolean] = js.undefined,
        blobValue: js.UndefOr[Blob] = js.undefined,
        doubleValue: js.UndefOr[Double] = js.undefined,
        intValue: js.UndefOr[Int] = js.undefined,
        isNull: js.UndefOr[Boolean] = js.undefined,
        realValue: js.UndefOr[Float] = js.undefined,
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
