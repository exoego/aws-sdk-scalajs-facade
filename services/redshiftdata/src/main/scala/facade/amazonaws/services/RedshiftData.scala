package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object redshiftdata {
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BoxedBoolean = Boolean
  type BoxedDouble = Double
  type BoxedLong = Double
  type ColumnList = js.Array[ColumnMetadata]
  type ColumnMetadataList = js.Array[ColumnMetadata]
  type DatabaseList = js.Array[String]
  type FieldList = js.Array[Field]
  type ListStatementsLimit = Int
  type Location = String
  type PageSize = Int
  type SchemaList = js.Array[String]
  type SecretArn = String
  type SqlRecords = js.Array[FieldList]
  type StatementList = js.Array[StatementData]
  type StatementNameString = String
  type StatementString = String
  type TableList = js.Array[TableMember]
  type Timestamp = js.Date
  type UUID = String

  implicit final class RedshiftDataOps(private val service: RedshiftData) extends AnyVal {

    @inline def cancelStatementFuture(params: CancelStatementRequest): Future[CancelStatementResponse] = service.cancelStatement(params).promise().toFuture
    @inline def describeStatementFuture(params: DescribeStatementRequest): Future[DescribeStatementResponse] = service.describeStatement(params).promise().toFuture
    @inline def describeTableFuture(params: DescribeTableRequest): Future[DescribeTableResponse] = service.describeTable(params).promise().toFuture
    @inline def executeStatementFuture(params: ExecuteStatementInput): Future[ExecuteStatementOutput] = service.executeStatement(params).promise().toFuture
    @inline def getStatementResultFuture(params: GetStatementResultRequest): Future[GetStatementResultResponse] = service.getStatementResult(params).promise().toFuture
    @inline def listDatabasesFuture(params: ListDatabasesRequest): Future[ListDatabasesResponse] = service.listDatabases(params).promise().toFuture
    @inline def listSchemasFuture(params: ListSchemasRequest): Future[ListSchemasResponse] = service.listSchemas(params).promise().toFuture
    @inline def listStatementsFuture(params: ListStatementsRequest): Future[ListStatementsResponse] = service.listStatements(params).promise().toFuture
    @inline def listTablesFuture(params: ListTablesRequest): Future[ListTablesResponse] = service.listTables(params).promise().toFuture

  }
}

package redshiftdata {
  @js.native
  @JSImport("aws-sdk/clients/redshiftdata", JSImport.Namespace, "AWS.RedshiftData")
  class RedshiftData() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelStatement(params: CancelStatementRequest): Request[CancelStatementResponse] = js.native
    def describeStatement(params: DescribeStatementRequest): Request[DescribeStatementResponse] = js.native
    def describeTable(params: DescribeTableRequest): Request[DescribeTableResponse] = js.native
    def executeStatement(params: ExecuteStatementInput): Request[ExecuteStatementOutput] = js.native
    def getStatementResult(params: GetStatementResultRequest): Request[GetStatementResultResponse] = js.native
    def listDatabases(params: ListDatabasesRequest): Request[ListDatabasesResponse] = js.native
    def listSchemas(params: ListSchemasRequest): Request[ListSchemasResponse] = js.native
    def listStatements(params: ListStatementsRequest): Request[ListStatementsResponse] = js.native
    def listTables(params: ListTablesRequest): Request[ListTablesResponse] = js.native
  }

  @js.native
  trait CancelStatementRequest extends js.Object {
    var Id: UUID
  }

  object CancelStatementRequest {
    @inline
    def apply(
        Id: UUID
    ): CancelStatementRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelStatementRequest]
    }
  }

  @js.native
  trait CancelStatementResponse extends js.Object {
    var Status: js.UndefOr[Boolean]
  }

  object CancelStatementResponse {
    @inline
    def apply(
        Status: js.UndefOr[Boolean] = js.undefined
    ): CancelStatementResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelStatementResponse]
    }
  }

  /** The properties (metadata) of a column.
    */
  @js.native
  trait ColumnMetadata extends js.Object {
    var columnDefault: js.UndefOr[String]
    var isCaseSensitive: js.UndefOr[Boolean]
    var isCurrency: js.UndefOr[Boolean]
    var isSigned: js.UndefOr[Boolean]
    var label: js.UndefOr[String]
    var length: js.UndefOr[Int]
    var name: js.UndefOr[String]
    var nullable: js.UndefOr[Int]
    var precision: js.UndefOr[Int]
    var scale: js.UndefOr[Int]
    var schemaName: js.UndefOr[String]
    var tableName: js.UndefOr[String]
    var typeName: js.UndefOr[String]
  }

  object ColumnMetadata {
    @inline
    def apply(
        columnDefault: js.UndefOr[String] = js.undefined,
        isCaseSensitive: js.UndefOr[Boolean] = js.undefined,
        isCurrency: js.UndefOr[Boolean] = js.undefined,
        isSigned: js.UndefOr[Boolean] = js.undefined,
        label: js.UndefOr[String] = js.undefined,
        length: js.UndefOr[Int] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        nullable: js.UndefOr[Int] = js.undefined,
        precision: js.UndefOr[Int] = js.undefined,
        scale: js.UndefOr[Int] = js.undefined,
        schemaName: js.UndefOr[String] = js.undefined,
        tableName: js.UndefOr[String] = js.undefined,
        typeName: js.UndefOr[String] = js.undefined
    ): ColumnMetadata = {
      val __obj = js.Dynamic.literal()
      columnDefault.foreach(__v => __obj.updateDynamic("columnDefault")(__v.asInstanceOf[js.Any]))
      isCaseSensitive.foreach(__v => __obj.updateDynamic("isCaseSensitive")(__v.asInstanceOf[js.Any]))
      isCurrency.foreach(__v => __obj.updateDynamic("isCurrency")(__v.asInstanceOf[js.Any]))
      isSigned.foreach(__v => __obj.updateDynamic("isSigned")(__v.asInstanceOf[js.Any]))
      label.foreach(__v => __obj.updateDynamic("label")(__v.asInstanceOf[js.Any]))
      length.foreach(__v => __obj.updateDynamic("length")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nullable.foreach(__v => __obj.updateDynamic("nullable")(__v.asInstanceOf[js.Any]))
      precision.foreach(__v => __obj.updateDynamic("precision")(__v.asInstanceOf[js.Any]))
      scale.foreach(__v => __obj.updateDynamic("scale")(__v.asInstanceOf[js.Any]))
      schemaName.foreach(__v => __obj.updateDynamic("schemaName")(__v.asInstanceOf[js.Any]))
      tableName.foreach(__v => __obj.updateDynamic("tableName")(__v.asInstanceOf[js.Any]))
      typeName.foreach(__v => __obj.updateDynamic("typeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnMetadata]
    }
  }

  @js.native
  trait DescribeStatementRequest extends js.Object {
    var Id: UUID
  }

  object DescribeStatementRequest {
    @inline
    def apply(
        Id: UUID
    ): DescribeStatementRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeStatementRequest]
    }
  }

  @js.native
  trait DescribeStatementResponse extends js.Object {
    var Id: UUID
    var ClusterIdentifier: js.UndefOr[String]
    var CreatedAt: js.UndefOr[Timestamp]
    var Database: js.UndefOr[String]
    var DbUser: js.UndefOr[String]
    var Duration: js.UndefOr[Double]
    var Error: js.UndefOr[String]
    var HasResultSet: js.UndefOr[Boolean]
    var QueryString: js.UndefOr[StatementString]
    var RedshiftPid: js.UndefOr[Double]
    var RedshiftQueryId: js.UndefOr[Double]
    var ResultRows: js.UndefOr[Double]
    var ResultSize: js.UndefOr[Double]
    var SecretArn: js.UndefOr[SecretArn]
    var Status: js.UndefOr[StatusString]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object DescribeStatementResponse {
    @inline
    def apply(
        Id: UUID,
        ClusterIdentifier: js.UndefOr[String] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Database: js.UndefOr[String] = js.undefined,
        DbUser: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Double] = js.undefined,
        Error: js.UndefOr[String] = js.undefined,
        HasResultSet: js.UndefOr[Boolean] = js.undefined,
        QueryString: js.UndefOr[StatementString] = js.undefined,
        RedshiftPid: js.UndefOr[Double] = js.undefined,
        RedshiftQueryId: js.UndefOr[Double] = js.undefined,
        ResultRows: js.UndefOr[Double] = js.undefined,
        ResultSize: js.UndefOr[Double] = js.undefined,
        SecretArn: js.UndefOr[SecretArn] = js.undefined,
        Status: js.UndefOr[StatusString] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): DescribeStatementResponse = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      DbUser.foreach(__v => __obj.updateDynamic("DbUser")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      HasResultSet.foreach(__v => __obj.updateDynamic("HasResultSet")(__v.asInstanceOf[js.Any]))
      QueryString.foreach(__v => __obj.updateDynamic("QueryString")(__v.asInstanceOf[js.Any]))
      RedshiftPid.foreach(__v => __obj.updateDynamic("RedshiftPid")(__v.asInstanceOf[js.Any]))
      RedshiftQueryId.foreach(__v => __obj.updateDynamic("RedshiftQueryId")(__v.asInstanceOf[js.Any]))
      ResultRows.foreach(__v => __obj.updateDynamic("ResultRows")(__v.asInstanceOf[js.Any]))
      ResultSize.foreach(__v => __obj.updateDynamic("ResultSize")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStatementResponse]
    }
  }

  @js.native
  trait DescribeTableRequest extends js.Object {
    var ClusterIdentifier: Location
    var Database: String
    var ConnectedDatabase: js.UndefOr[String]
    var DbUser: js.UndefOr[String]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[String]
    var Schema: js.UndefOr[String]
    var SecretArn: js.UndefOr[SecretArn]
    var Table: js.UndefOr[String]
  }

  object DescribeTableRequest {
    @inline
    def apply(
        ClusterIdentifier: Location,
        Database: String,
        ConnectedDatabase: js.UndefOr[String] = js.undefined,
        DbUser: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Schema: js.UndefOr[String] = js.undefined,
        SecretArn: js.UndefOr[SecretArn] = js.undefined,
        Table: js.UndefOr[String] = js.undefined
    ): DescribeTableRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "Database" -> Database.asInstanceOf[js.Any]
      )

      ConnectedDatabase.foreach(__v => __obj.updateDynamic("ConnectedDatabase")(__v.asInstanceOf[js.Any]))
      DbUser.foreach(__v => __obj.updateDynamic("DbUser")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      Table.foreach(__v => __obj.updateDynamic("Table")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTableRequest]
    }
  }

  @js.native
  trait DescribeTableResponse extends js.Object {
    var ColumnList: js.UndefOr[ColumnList]
    var NextToken: js.UndefOr[String]
    var TableName: js.UndefOr[String]
  }

  object DescribeTableResponse {
    @inline
    def apply(
        ColumnList: js.UndefOr[ColumnList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        TableName: js.UndefOr[String] = js.undefined
    ): DescribeTableResponse = {
      val __obj = js.Dynamic.literal()
      ColumnList.foreach(__v => __obj.updateDynamic("ColumnList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTableResponse]
    }
  }

  @js.native
  trait ExecuteStatementInput extends js.Object {
    var ClusterIdentifier: Location
    var Sql: StatementString
    var Database: js.UndefOr[String]
    var DbUser: js.UndefOr[String]
    var SecretArn: js.UndefOr[SecretArn]
    var StatementName: js.UndefOr[StatementNameString]
    var WithEvent: js.UndefOr[Boolean]
  }

  object ExecuteStatementInput {
    @inline
    def apply(
        ClusterIdentifier: Location,
        Sql: StatementString,
        Database: js.UndefOr[String] = js.undefined,
        DbUser: js.UndefOr[String] = js.undefined,
        SecretArn: js.UndefOr[SecretArn] = js.undefined,
        StatementName: js.UndefOr[StatementNameString] = js.undefined,
        WithEvent: js.UndefOr[Boolean] = js.undefined
    ): ExecuteStatementInput = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "Sql" -> Sql.asInstanceOf[js.Any]
      )

      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      DbUser.foreach(__v => __obj.updateDynamic("DbUser")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      StatementName.foreach(__v => __obj.updateDynamic("StatementName")(__v.asInstanceOf[js.Any]))
      WithEvent.foreach(__v => __obj.updateDynamic("WithEvent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteStatementInput]
    }
  }

  @js.native
  trait ExecuteStatementOutput extends js.Object {
    var ClusterIdentifier: js.UndefOr[Location]
    var CreatedAt: js.UndefOr[Timestamp]
    var Database: js.UndefOr[String]
    var DbUser: js.UndefOr[String]
    var Id: js.UndefOr[UUID]
    var SecretArn: js.UndefOr[SecretArn]
  }

  object ExecuteStatementOutput {
    @inline
    def apply(
        ClusterIdentifier: js.UndefOr[Location] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Database: js.UndefOr[String] = js.undefined,
        DbUser: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[UUID] = js.undefined,
        SecretArn: js.UndefOr[SecretArn] = js.undefined
    ): ExecuteStatementOutput = {
      val __obj = js.Dynamic.literal()
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      DbUser.foreach(__v => __obj.updateDynamic("DbUser")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteStatementOutput]
    }
  }

  /** A data value in a column.
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
    @inline
    def apply(
        blobValue: js.UndefOr[Blob] = js.undefined,
        booleanValue: js.UndefOr[BoxedBoolean] = js.undefined,
        doubleValue: js.UndefOr[BoxedDouble] = js.undefined,
        isNull: js.UndefOr[BoxedBoolean] = js.undefined,
        longValue: js.UndefOr[BoxedLong] = js.undefined,
        stringValue: js.UndefOr[String] = js.undefined
    ): Field = {
      val __obj = js.Dynamic.literal()
      blobValue.foreach(__v => __obj.updateDynamic("blobValue")(__v.asInstanceOf[js.Any]))
      booleanValue.foreach(__v => __obj.updateDynamic("booleanValue")(__v.asInstanceOf[js.Any]))
      doubleValue.foreach(__v => __obj.updateDynamic("doubleValue")(__v.asInstanceOf[js.Any]))
      isNull.foreach(__v => __obj.updateDynamic("isNull")(__v.asInstanceOf[js.Any]))
      longValue.foreach(__v => __obj.updateDynamic("longValue")(__v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.updateDynamic("stringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Field]
    }
  }

  @js.native
  trait GetStatementResultRequest extends js.Object {
    var Id: UUID
    var NextToken: js.UndefOr[String]
  }

  object GetStatementResultRequest {
    @inline
    def apply(
        Id: UUID,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetStatementResultRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStatementResultRequest]
    }
  }

  @js.native
  trait GetStatementResultResponse extends js.Object {
    var Records: SqlRecords
    var ColumnMetadata: js.UndefOr[ColumnMetadataList]
    var NextToken: js.UndefOr[String]
    var TotalNumRows: js.UndefOr[Double]
  }

  object GetStatementResultResponse {
    @inline
    def apply(
        Records: SqlRecords,
        ColumnMetadata: js.UndefOr[ColumnMetadataList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        TotalNumRows: js.UndefOr[Double] = js.undefined
    ): GetStatementResultResponse = {
      val __obj = js.Dynamic.literal(
        "Records" -> Records.asInstanceOf[js.Any]
      )

      ColumnMetadata.foreach(__v => __obj.updateDynamic("ColumnMetadata")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TotalNumRows.foreach(__v => __obj.updateDynamic("TotalNumRows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStatementResultResponse]
    }
  }

  @js.native
  trait ListDatabasesRequest extends js.Object {
    var ClusterIdentifier: Location
    var Database: js.UndefOr[String]
    var DbUser: js.UndefOr[String]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[String]
    var SecretArn: js.UndefOr[SecretArn]
  }

  object ListDatabasesRequest {
    @inline
    def apply(
        ClusterIdentifier: Location,
        Database: js.UndefOr[String] = js.undefined,
        DbUser: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SecretArn: js.UndefOr[SecretArn] = js.undefined
    ): ListDatabasesRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any]
      )

      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      DbUser.foreach(__v => __obj.updateDynamic("DbUser")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatabasesRequest]
    }
  }

  @js.native
  trait ListDatabasesResponse extends js.Object {
    var Databases: js.UndefOr[DatabaseList]
    var NextToken: js.UndefOr[String]
  }

  object ListDatabasesResponse {
    @inline
    def apply(
        Databases: js.UndefOr[DatabaseList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDatabasesResponse = {
      val __obj = js.Dynamic.literal()
      Databases.foreach(__v => __obj.updateDynamic("Databases")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatabasesResponse]
    }
  }

  @js.native
  trait ListSchemasRequest extends js.Object {
    var ClusterIdentifier: Location
    var Database: String
    var ConnectedDatabase: js.UndefOr[String]
    var DbUser: js.UndefOr[String]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[String]
    var SchemaPattern: js.UndefOr[String]
    var SecretArn: js.UndefOr[SecretArn]
  }

  object ListSchemasRequest {
    @inline
    def apply(
        ClusterIdentifier: Location,
        Database: String,
        ConnectedDatabase: js.UndefOr[String] = js.undefined,
        DbUser: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SchemaPattern: js.UndefOr[String] = js.undefined,
        SecretArn: js.UndefOr[SecretArn] = js.undefined
    ): ListSchemasRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "Database" -> Database.asInstanceOf[js.Any]
      )

      ConnectedDatabase.foreach(__v => __obj.updateDynamic("ConnectedDatabase")(__v.asInstanceOf[js.Any]))
      DbUser.foreach(__v => __obj.updateDynamic("DbUser")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaPattern.foreach(__v => __obj.updateDynamic("SchemaPattern")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemasRequest]
    }
  }

  @js.native
  trait ListSchemasResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Schemas: js.UndefOr[SchemaList]
  }

  object ListSchemasResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Schemas: js.UndefOr[SchemaList] = js.undefined
    ): ListSchemasResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Schemas.foreach(__v => __obj.updateDynamic("Schemas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemasResponse]
    }
  }

  @js.native
  trait ListStatementsRequest extends js.Object {
    var MaxResults: js.UndefOr[ListStatementsLimit]
    var NextToken: js.UndefOr[String]
    var RoleLevel: js.UndefOr[Boolean]
    var StatementName: js.UndefOr[StatementNameString]
    var Status: js.UndefOr[StatusString]
  }

  object ListStatementsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListStatementsLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RoleLevel: js.UndefOr[Boolean] = js.undefined,
        StatementName: js.UndefOr[StatementNameString] = js.undefined,
        Status: js.UndefOr[StatusString] = js.undefined
    ): ListStatementsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RoleLevel.foreach(__v => __obj.updateDynamic("RoleLevel")(__v.asInstanceOf[js.Any]))
      StatementName.foreach(__v => __obj.updateDynamic("StatementName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStatementsRequest]
    }
  }

  @js.native
  trait ListStatementsResponse extends js.Object {
    var Statements: StatementList
    var NextToken: js.UndefOr[String]
  }

  object ListStatementsResponse {
    @inline
    def apply(
        Statements: StatementList,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListStatementsResponse = {
      val __obj = js.Dynamic.literal(
        "Statements" -> Statements.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStatementsResponse]
    }
  }

  @js.native
  trait ListTablesRequest extends js.Object {
    var ClusterIdentifier: Location
    var Database: String
    var ConnectedDatabase: js.UndefOr[String]
    var DbUser: js.UndefOr[String]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[String]
    var SchemaPattern: js.UndefOr[String]
    var SecretArn: js.UndefOr[SecretArn]
    var TablePattern: js.UndefOr[String]
  }

  object ListTablesRequest {
    @inline
    def apply(
        ClusterIdentifier: Location,
        Database: String,
        ConnectedDatabase: js.UndefOr[String] = js.undefined,
        DbUser: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SchemaPattern: js.UndefOr[String] = js.undefined,
        SecretArn: js.UndefOr[SecretArn] = js.undefined,
        TablePattern: js.UndefOr[String] = js.undefined
    ): ListTablesRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "Database" -> Database.asInstanceOf[js.Any]
      )

      ConnectedDatabase.foreach(__v => __obj.updateDynamic("ConnectedDatabase")(__v.asInstanceOf[js.Any]))
      DbUser.foreach(__v => __obj.updateDynamic("DbUser")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaPattern.foreach(__v => __obj.updateDynamic("SchemaPattern")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      TablePattern.foreach(__v => __obj.updateDynamic("TablePattern")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTablesRequest]
    }
  }

  @js.native
  trait ListTablesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Tables: js.UndefOr[TableList]
  }

  object ListTablesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Tables: js.UndefOr[TableList] = js.undefined
    ): ListTablesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tables.foreach(__v => __obj.updateDynamic("Tables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTablesResponse]
    }
  }

  /** The SQL statement to run.
    */
  @js.native
  trait StatementData extends js.Object {
    var Id: UUID
    var CreatedAt: js.UndefOr[Timestamp]
    var QueryString: js.UndefOr[StatementString]
    var SecretArn: js.UndefOr[SecretArn]
    var StatementName: js.UndefOr[StatementNameString]
    var Status: js.UndefOr[StatusString]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object StatementData {
    @inline
    def apply(
        Id: UUID,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        QueryString: js.UndefOr[StatementString] = js.undefined,
        SecretArn: js.UndefOr[SecretArn] = js.undefined,
        StatementName: js.UndefOr[StatementNameString] = js.undefined,
        Status: js.UndefOr[StatusString] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): StatementData = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      QueryString.foreach(__v => __obj.updateDynamic("QueryString")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      StatementName.foreach(__v => __obj.updateDynamic("StatementName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatementData]
    }
  }

  @js.native
  sealed trait StatusString extends js.Any
  object StatusString {
    val SUBMITTED = "SUBMITTED".asInstanceOf[StatusString]
    val PICKED = "PICKED".asInstanceOf[StatusString]
    val STARTED = "STARTED".asInstanceOf[StatusString]
    val FINISHED = "FINISHED".asInstanceOf[StatusString]
    val ABORTED = "ABORTED".asInstanceOf[StatusString]
    val FAILED = "FAILED".asInstanceOf[StatusString]
    val ALL = "ALL".asInstanceOf[StatusString]

    @inline def values = js.Array(SUBMITTED, PICKED, STARTED, FINISHED, ABORTED, FAILED, ALL)
  }

  /** The properties of a table.
    */
  @js.native
  trait TableMember extends js.Object {
    var name: js.UndefOr[String]
    var schema: js.UndefOr[String]
    var `type`: js.UndefOr[String]
  }

  object TableMember {
    @inline
    def apply(
        name: js.UndefOr[String] = js.undefined,
        schema: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined
    ): TableMember = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableMember]
    }
  }
}
