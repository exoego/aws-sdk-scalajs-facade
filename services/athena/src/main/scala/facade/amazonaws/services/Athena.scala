package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object athena {
  type AmazonResourceName              = String
  type BoxedBoolean                    = Boolean
  type BytesScannedCutoffValue         = Double
  type ColumnInfoList                  = js.Array[ColumnInfo]
  type ColumnNullable                  = String
  type DatabaseString                  = String
  type Date                            = js.Date
  type DescriptionString               = String
  type EncryptionOption                = String
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
  type QueryExecutionState             = String
  type QueryString                     = String
  type RowList                         = js.Array[Row]
  type StatementType                   = String
  type TagKey                          = String
  type TagKeyList                      = js.Array[TagKey]
  type TagList                         = js.Array[Tag]
  type TagValue                        = String
  type Token                           = String
  type UnprocessedNamedQueryIdList     = js.Array[UnprocessedNamedQueryId]
  type UnprocessedQueryExecutionIdList = js.Array[UnprocessedQueryExecutionId]
  type WorkGroupDescriptionString      = String
  type WorkGroupName                   = String
  type WorkGroupState                  = String
  type WorkGroupsList                  = js.Array[WorkGroupSummary]
  type datumList                       = js.Array[Datum]
  type datumString                     = String

  implicit final class AthenaOps(val service: Athena) extends AnyVal {

    def batchGetNamedQueryFuture(params: BatchGetNamedQueryInput): Future[BatchGetNamedQueryOutput] =
      service.batchGetNamedQuery(params).promise.toFuture
    def batchGetQueryExecutionFuture(params: BatchGetQueryExecutionInput): Future[BatchGetQueryExecutionOutput] =
      service.batchGetQueryExecution(params).promise.toFuture
    def createNamedQueryFuture(params: CreateNamedQueryInput): Future[CreateNamedQueryOutput] =
      service.createNamedQuery(params).promise.toFuture
    def createWorkGroupFuture(params: CreateWorkGroupInput): Future[CreateWorkGroupOutput] =
      service.createWorkGroup(params).promise.toFuture
    def deleteNamedQueryFuture(params: DeleteNamedQueryInput): Future[DeleteNamedQueryOutput] =
      service.deleteNamedQuery(params).promise.toFuture
    def deleteWorkGroupFuture(params: DeleteWorkGroupInput): Future[DeleteWorkGroupOutput] =
      service.deleteWorkGroup(params).promise.toFuture
    def getNamedQueryFuture(params: GetNamedQueryInput): Future[GetNamedQueryOutput] =
      service.getNamedQuery(params).promise.toFuture
    def getQueryExecutionFuture(params: GetQueryExecutionInput): Future[GetQueryExecutionOutput] =
      service.getQueryExecution(params).promise.toFuture
    def getQueryResultsFuture(params: GetQueryResultsInput): Future[GetQueryResultsOutput] =
      service.getQueryResults(params).promise.toFuture
    def getWorkGroupFuture(params: GetWorkGroupInput): Future[GetWorkGroupOutput] =
      service.getWorkGroup(params).promise.toFuture
    def listNamedQueriesFuture(params: ListNamedQueriesInput): Future[ListNamedQueriesOutput] =
      service.listNamedQueries(params).promise.toFuture
    def listQueryExecutionsFuture(params: ListQueryExecutionsInput): Future[ListQueryExecutionsOutput] =
      service.listQueryExecutions(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise.toFuture
    def listWorkGroupsFuture(params: ListWorkGroupsInput): Future[ListWorkGroupsOutput] =
      service.listWorkGroups(params).promise.toFuture
    def startQueryExecutionFuture(params: StartQueryExecutionInput): Future[StartQueryExecutionOutput] =
      service.startQueryExecution(params).promise.toFuture
    def stopQueryExecutionFuture(params: StopQueryExecutionInput): Future[StopQueryExecutionOutput] =
      service.stopQueryExecution(params).promise.toFuture
    def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise.toFuture
    def updateWorkGroupFuture(params: UpdateWorkGroupInput): Future[UpdateWorkGroupOutput] =
      service.updateWorkGroup(params).promise.toFuture
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
  trait BatchGetNamedQueryInput extends js.Object {
    var NamedQueryIds: NamedQueryIdList
  }

  object BatchGetNamedQueryInput {
    def apply(
        NamedQueryIds: NamedQueryIdList
    ): BatchGetNamedQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryIds" -> NamedQueryIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList] = js.undefined
    ): BatchGetNamedQueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueries" -> NamedQueries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UnprocessedNamedQueryIds" -> UnprocessedNamedQueryIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetNamedQueryOutput]
    }
  }

  @js.native
  trait BatchGetQueryExecutionInput extends js.Object {
    var QueryExecutionIds: QueryExecutionIdList
  }

  object BatchGetQueryExecutionInput {
    def apply(
        QueryExecutionIds: QueryExecutionIdList
    ): BatchGetQueryExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionIds" -> QueryExecutionIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList] = js.undefined
    ): BatchGetQueryExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutions" -> QueryExecutions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UnprocessedQueryExecutionIds" -> UnprocessedQueryExecutionIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        TableName: js.UndefOr[String] = js.undefined
    ): ColumnInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "CaseSensitive" -> CaseSensitive.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CatalogName" -> CatalogName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Label" -> Label.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Nullable" -> Nullable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Precision" -> Precision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scale" -> Scale.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaName" -> SchemaName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableName" -> TableName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ColumnInfo]
    }
  }

  object ColumnNullableEnum {
    val NOT_NULL = "NOT_NULL"
    val NULLABLE = "NULLABLE"
    val UNKNOWN  = "UNKNOWN"

    val values = IndexedSeq(NOT_NULL, NULLABLE, UNKNOWN)
  }

  @js.native
  trait CreateNamedQueryInput extends js.Object {
    var Database: DatabaseString
    var Name: NameString
    var QueryString: QueryString
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var Description: js.UndefOr[DescriptionString]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object CreateNamedQueryInput {
    def apply(
        Database: DatabaseString,
        Name: NameString,
        QueryString: QueryString,
        ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): CreateNamedQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Database"    -> Database.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkGroup" -> WorkGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNamedQueryInput]
    }
  }

  @js.native
  trait CreateNamedQueryOutput extends js.Object {
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  object CreateNamedQueryOutput {
    def apply(
        NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
    ): CreateNamedQueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryId" -> NamedQueryId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNamedQueryOutput]
    }
  }

  @js.native
  trait CreateWorkGroupInput extends js.Object {
    var Name: WorkGroupName
    var Configuration: js.UndefOr[WorkGroupConfiguration]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var Tags: js.UndefOr[TagList]
  }

  object CreateWorkGroupInput {
    def apply(
        Name: WorkGroupName,
        Configuration: js.UndefOr[WorkGroupConfiguration] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateWorkGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Configuration" -> Configuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWorkGroupInput]
    }
  }

  @js.native
  trait CreateWorkGroupOutput extends js.Object {}

  object CreateWorkGroupOutput {
    def apply(
        ): CreateWorkGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWorkGroupOutput]
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
        VarCharValue: js.UndefOr[datumString] = js.undefined
    ): Datum = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VarCharValue" -> VarCharValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Datum]
    }
  }

  @js.native
  trait DeleteNamedQueryInput extends js.Object {
    var NamedQueryId: NamedQueryId
  }

  object DeleteNamedQueryInput {
    def apply(
        NamedQueryId: NamedQueryId
    ): DeleteNamedQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryId" -> NamedQueryId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNamedQueryInput]
    }
  }

  @js.native
  trait DeleteNamedQueryOutput extends js.Object {}

  object DeleteNamedQueryOutput {
    def apply(
        ): DeleteNamedQueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNamedQueryOutput]
    }
  }

  @js.native
  trait DeleteWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
    var RecursiveDeleteOption: js.UndefOr[BoxedBoolean]
  }

  object DeleteWorkGroupInput {
    def apply(
        WorkGroup: WorkGroupName,
        RecursiveDeleteOption: js.UndefOr[BoxedBoolean] = js.undefined
    ): DeleteWorkGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any],
        "RecursiveDeleteOption" -> RecursiveDeleteOption.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWorkGroupInput]
    }
  }

  @js.native
  trait DeleteWorkGroupOutput extends js.Object {}

  object DeleteWorkGroupOutput {
    def apply(
        ): DeleteWorkGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWorkGroupOutput]
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
        KmsKey: js.UndefOr[String] = js.undefined
    ): EncryptionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionOption" -> EncryptionOption.asInstanceOf[js.Any],
        "KmsKey" -> KmsKey.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionConfiguration]
    }
  }

  object EncryptionOptionEnum {
    val SSE_S3  = "SSE_S3"
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
        NamedQueryId: NamedQueryId
    ): GetNamedQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryId" -> NamedQueryId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetNamedQueryInput]
    }
  }

  @js.native
  trait GetNamedQueryOutput extends js.Object {
    var NamedQuery: js.UndefOr[NamedQuery]
  }

  object GetNamedQueryOutput {
    def apply(
        NamedQuery: js.UndefOr[NamedQuery] = js.undefined
    ): GetNamedQueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQuery" -> NamedQuery.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetNamedQueryOutput]
    }
  }

  @js.native
  trait GetQueryExecutionInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
  }

  object GetQueryExecutionInput {
    def apply(
        QueryExecutionId: QueryExecutionId
    ): GetQueryExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryExecutionInput]
    }
  }

  @js.native
  trait GetQueryExecutionOutput extends js.Object {
    var QueryExecution: js.UndefOr[QueryExecution]
  }

  object GetQueryExecutionOutput {
    def apply(
        QueryExecution: js.UndefOr[QueryExecution] = js.undefined
    ): GetQueryExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecution" -> QueryExecution.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetQueryResultsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        UpdateCount: js.UndefOr[Double] = js.undefined
    ): GetQueryResultsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResultSet" -> ResultSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateCount" -> UpdateCount.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryResultsOutput]
    }
  }

  @js.native
  trait GetWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
  }

  object GetWorkGroupInput {
    def apply(
        WorkGroup: WorkGroupName
    ): GetWorkGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetWorkGroupInput]
    }
  }

  @js.native
  trait GetWorkGroupOutput extends js.Object {
    var WorkGroup: js.UndefOr[WorkGroup]
  }

  object GetWorkGroupOutput {
    def apply(
        WorkGroup: js.UndefOr[WorkGroup] = js.undefined
    ): GetWorkGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkGroup" -> WorkGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetWorkGroupOutput]
    }
  }

  @js.native
  trait ListNamedQueriesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxNamedQueriesCount]
    var NextToken: js.UndefOr[Token]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object ListNamedQueriesInput {
    def apply(
        MaxResults: js.UndefOr[MaxNamedQueriesCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): ListNamedQueriesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkGroup" -> WorkGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListNamedQueriesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamedQueryIds" -> NamedQueryIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNamedQueriesOutput]
    }
  }

  @js.native
  trait ListQueryExecutionsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxQueryExecutionsCount]
    var NextToken: js.UndefOr[Token]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object ListQueryExecutionsInput {
    def apply(
        MaxResults: js.UndefOr[MaxQueryExecutionsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): ListQueryExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkGroup" -> WorkGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        QueryExecutionIds: js.UndefOr[QueryExecutionIdList] = js.undefined
    ): ListQueryExecutionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QueryExecutionIds" -> QueryExecutionIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueryExecutionsOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var MaxResults: js.UndefOr[MaxTagsCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListTagsForResourceInput {
    def apply(
        ResourceARN: AmazonResourceName,
        MaxResults: js.UndefOr[MaxTagsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListTagsForResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceOutput]
    }
  }

  @js.native
  trait ListWorkGroupsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxWorkGroupsCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListWorkGroupsInput {
    def apply(
        MaxResults: js.UndefOr[MaxWorkGroupsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListWorkGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWorkGroupsInput]
    }
  }

  @js.native
  trait ListWorkGroupsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var WorkGroups: js.UndefOr[WorkGroupsList]
  }

  object ListWorkGroupsOutput {
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        WorkGroups: js.UndefOr[WorkGroupsList] = js.undefined
    ): ListWorkGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkGroups" -> WorkGroups.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWorkGroupsOutput]
    }
  }

  /**
    * A query, where <code>QueryString</code> is the list of SQL query statements that comprise the query.
    */
  @js.native
  trait NamedQuery extends js.Object {
    var Database: DatabaseString
    var Name: NameString
    var QueryString: QueryString
    var Description: js.UndefOr[DescriptionString]
    var NamedQueryId: js.UndefOr[NamedQueryId]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object NamedQuery {
    def apply(
        Database: DatabaseString,
        Name: NameString,
        QueryString: QueryString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): NamedQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Database"    -> Database.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NamedQueryId" -> NamedQueryId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkGroup" -> WorkGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object QueryExecution {
    def apply(
        Query: js.UndefOr[QueryString] = js.undefined,
        QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined,
        QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined,
        ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined,
        StatementType: js.UndefOr[StatementType] = js.undefined,
        Statistics: js.UndefOr[QueryExecutionStatistics] = js.undefined,
        Status: js.UndefOr[QueryExecutionStatus] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): QueryExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Query" -> Query.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QueryExecutionContext" -> QueryExecutionContext.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QueryExecutionId" -> QueryExecutionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResultConfiguration" -> ResultConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatementType" -> StatementType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Statistics" -> Statistics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkGroup" -> WorkGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        Database: js.UndefOr[DatabaseString] = js.undefined
    ): QueryExecutionContext = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Database" -> Database.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryExecutionContext]
    }
  }

  object QueryExecutionStateEnum {
    val QUEUED    = "QUEUED"
    val RUNNING   = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED    = "FAILED"
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
        EngineExecutionTimeInMillis: js.UndefOr[Double] = js.undefined
    ): QueryExecutionStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataScannedInBytes" -> DataScannedInBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineExecutionTimeInMillis" -> EngineExecutionTimeInMillis.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        SubmissionDateTime: js.UndefOr[Date] = js.undefined
    ): QueryExecutionStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompletionDateTime" -> CompletionDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StateChangeReason" -> StateChangeReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubmissionDateTime" -> SubmissionDateTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryExecutionStatus]
    }
  }

  /**
    * The location in Amazon S3 where query results are stored and the encryption option, if any, used for query results. These are known as "client-side settings". If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup.
    */
  @js.native
  trait ResultConfiguration extends js.Object {
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var OutputLocation: js.UndefOr[String]
  }

  object ResultConfiguration {
    def apply(
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        OutputLocation: js.UndefOr[String] = js.undefined
    ): ResultConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputLocation" -> OutputLocation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultConfiguration]
    }
  }

  /**
    * The information about the updates in the query results, such as output location and encryption configuration for the query results.
    */
  @js.native
  trait ResultConfigurationUpdates extends js.Object {
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var OutputLocation: js.UndefOr[String]
    var RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean]
    var RemoveOutputLocation: js.UndefOr[BoxedBoolean]
  }

  object ResultConfigurationUpdates {
    def apply(
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        OutputLocation: js.UndefOr[String] = js.undefined,
        RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        RemoveOutputLocation: js.UndefOr[BoxedBoolean] = js.undefined
    ): ResultConfigurationUpdates = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputLocation" -> OutputLocation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemoveEncryptionConfiguration" -> RemoveEncryptionConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemoveOutputLocation" -> RemoveOutputLocation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultConfigurationUpdates]
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
        Rows: js.UndefOr[RowList] = js.undefined
    ): ResultSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResultSetMetadata" -> ResultSetMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Rows" -> Rows.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        ColumnInfo: js.UndefOr[ColumnInfoList] = js.undefined
    ): ResultSetMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ColumnInfo" -> ColumnInfo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        Data: js.UndefOr[datumList] = js.undefined
    ): Row = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Row]
    }
  }

  @js.native
  trait StartQueryExecutionInput extends js.Object {
    var QueryString: QueryString
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var QueryExecutionContext: js.UndefOr[QueryExecutionContext]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object StartQueryExecutionInput {
    def apply(
        QueryString: QueryString,
        ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
        QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined,
        ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): StartQueryExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryString" -> QueryString.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QueryExecutionContext" -> QueryExecutionContext.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResultConfiguration" -> ResultConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkGroup" -> WorkGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartQueryExecutionInput]
    }
  }

  @js.native
  trait StartQueryExecutionOutput extends js.Object {
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
  }

  object StartQueryExecutionOutput {
    def apply(
        QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
    ): StartQueryExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionId" -> QueryExecutionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartQueryExecutionOutput]
    }
  }

  object StatementTypeEnum {
    val DDL     = "DDL"
    val DML     = "DML"
    val UTILITY = "UTILITY"

    val values = IndexedSeq(DDL, DML, UTILITY)
  }

  @js.native
  trait StopQueryExecutionInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
  }

  object StopQueryExecutionInput {
    def apply(
        QueryExecutionId: QueryExecutionId
    ): StopQueryExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopQueryExecutionInput]
    }
  }

  @js.native
  trait StopQueryExecutionOutput extends js.Object {}

  object StopQueryExecutionOutput {
    def apply(
        ): StopQueryExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopQueryExecutionOutput]
    }
  }

  /**
    * A tag that you can add to a resource. A tag is a label that you assign to an AWS Athena resource (a workgroup). Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize workgroups in Athena, for example, by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and filter workgroups in your account. The maximum tag key length is 128 Unicode characters in UTF-8. The maximum tag value length is 256 Unicode characters in UTF-8. You can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys must be unique per resource.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceInput {
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object {}

  object TagResourceOutput {
    def apply(
        ): TagResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceOutput]
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
        NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
    ): UnprocessedNamedQueryId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NamedQueryId" -> NamedQueryId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
    ): UnprocessedQueryExecutionId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QueryExecutionId" -> QueryExecutionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnprocessedQueryExecutionId]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceInput {
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object {}

  object UntagResourceOutput {
    def apply(
        ): UntagResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceOutput]
    }
  }

  @js.native
  trait UpdateWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
    var ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var State: js.UndefOr[WorkGroupState]
  }

  object UpdateWorkGroupInput {
    def apply(
        WorkGroup: WorkGroupName,
        ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        State: js.UndefOr[WorkGroupState] = js.undefined
    ): UpdateWorkGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any],
        "ConfigurationUpdates" -> ConfigurationUpdates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateWorkGroupInput]
    }
  }

  @js.native
  trait UpdateWorkGroupOutput extends js.Object {}

  object UpdateWorkGroupOutput {
    def apply(
        ): UpdateWorkGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateWorkGroupOutput]
    }
  }

  /**
    * A workgroup, which contains a name, description, creation time, state, and other configuration, listed under Configuration. Each workgroup enables you to isolate queries for you or your group of users from other queries in the same account, to configure the query results location and the encryption configuration (known as workgroup settings), to enable sending query metrics to Amazon CloudWatch, and to establish per-query data usage control limits for all queries in a workgroup. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See [[WorkGroupConfiguration.EnforceWorkGroupConfiguration]].
    */
  @js.native
  trait WorkGroup extends js.Object {
    var Name: WorkGroupName
    var Configuration: js.UndefOr[WorkGroupConfiguration]
    var CreationTime: js.UndefOr[Date]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var State: js.UndefOr[WorkGroupState]
  }

  object WorkGroup {
    def apply(
        Name: WorkGroupName,
        Configuration: js.UndefOr[WorkGroupConfiguration] = js.undefined,
        CreationTime: js.UndefOr[Date] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        State: js.UndefOr[WorkGroupState] = js.undefined
    ): WorkGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Configuration" -> Configuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkGroup]
    }
  }

  /**
    * The configuration of the workgroup, which includes the location in Amazon S3 where query results are stored, the encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup and whether workgroup settings override query settings, and the data usage limit for the amount of data scanned per query, if it is specified. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See EnforceWorkGroupConfiguration.
    */
  @js.native
  trait WorkGroupConfiguration extends js.Object {
    var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue]
    var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean]
    var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
  }

  object WorkGroupConfiguration {
    def apply(
        BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined,
        EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined
    ): WorkGroupConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BytesScannedCutoffPerQuery" -> BytesScannedCutoffPerQuery.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnforceWorkGroupConfiguration" -> EnforceWorkGroupConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublishCloudWatchMetricsEnabled" -> PublishCloudWatchMetricsEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResultConfiguration" -> ResultConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkGroupConfiguration]
    }
  }

  /**
    * The configuration information that will be updated for this workgroup, which includes the location in Amazon S3 where query results are stored, the encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup, whether the workgroup settings override the client-side settings, and the data usage limit for the amount of bytes scanned per query, if it is specified.
    */
  @js.native
  trait WorkGroupConfigurationUpdates extends js.Object {
    var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue]
    var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean]
    var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean]
    var RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean]
    var ResultConfigurationUpdates: js.UndefOr[ResultConfigurationUpdates]
  }

  object WorkGroupConfigurationUpdates {
    def apply(
        BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined,
        EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean] = js.undefined,
        ResultConfigurationUpdates: js.UndefOr[ResultConfigurationUpdates] = js.undefined
    ): WorkGroupConfigurationUpdates = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BytesScannedCutoffPerQuery" -> BytesScannedCutoffPerQuery.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnforceWorkGroupConfiguration" -> EnforceWorkGroupConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublishCloudWatchMetricsEnabled" -> PublishCloudWatchMetricsEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemoveBytesScannedCutoffPerQuery" -> RemoveBytesScannedCutoffPerQuery.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResultConfigurationUpdates" -> ResultConfigurationUpdates.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkGroupConfigurationUpdates]
    }
  }

  object WorkGroupStateEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
    * The summary information for the workgroup, which includes its name, state, description, and the date and time it was created.
    */
  @js.native
  trait WorkGroupSummary extends js.Object {
    var CreationTime: js.UndefOr[Date]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var Name: js.UndefOr[WorkGroupName]
    var State: js.UndefOr[WorkGroupState]
  }

  object WorkGroupSummary {
    def apply(
        CreationTime: js.UndefOr[Date] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        Name: js.UndefOr[WorkGroupName] = js.undefined,
        State: js.UndefOr[WorkGroupState] = js.undefined
    ): WorkGroupSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkGroupSummary]
    }
  }
}
