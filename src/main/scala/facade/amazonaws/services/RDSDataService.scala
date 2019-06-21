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
      val _fields = IndexedSeq[(String, js.Any)](
        "arrayBaseColumnType" -> arrayBaseColumnType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isAutoIncrement" -> isAutoIncrement.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isCaseSensitive" -> isCaseSensitive.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isCurrency" -> isCurrency.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isSigned" -> isSigned.map { x =>
          x.asInstanceOf[js.Any]
        },
        "label" -> label.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nullable" -> nullable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "precision" -> precision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "scale" -> scale.map { x =>
          x.asInstanceOf[js.Any]
        },
        "schemaName" -> schemaName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tableName" -> tableName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "`type`" -> `type`.map { x =>
          x.asInstanceOf[js.Any]
        },
        "typeName" -> typeName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ColumnMetadata]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "awsSecretStoreArn"      -> awsSecretStoreArn.asInstanceOf[js.Any],
        "dbClusterOrInstanceArn" -> dbClusterOrInstanceArn.asInstanceOf[js.Any],
        "sqlStatements"          -> sqlStatements.asInstanceOf[js.Any],
        "database" -> database.map { x =>
          x.asInstanceOf[js.Any]
        },
        "schema" -> schema.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecuteSqlRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "sqlStatementResults" -> sqlStatementResults.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecuteSqlResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "values" -> values.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Record]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "records" -> records.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resultSetMetadata" -> resultSetMetadata.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultFrame]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "columnCount" -> columnCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "columnMetadata" -> columnMetadata.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultSetMetadata]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "numberOfRecordsUpdated" -> numberOfRecordsUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resultFrame" -> resultFrame.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SqlStatementResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StructValue]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arrayValues" -> arrayValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "bigIntValue" -> bigIntValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "bitValue" -> bitValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "blobValue" -> blobValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "doubleValue" -> doubleValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "intValue" -> intValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isNull" -> isNull.map { x =>
          x.asInstanceOf[js.Any]
        },
        "realValue" -> realValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stringValue" -> stringValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "structValue" -> structValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Value]
    }
  }
}
