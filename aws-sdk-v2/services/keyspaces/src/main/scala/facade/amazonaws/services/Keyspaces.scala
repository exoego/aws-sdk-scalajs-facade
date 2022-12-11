package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object keyspaces {
  type ARN = String
  type CapacityUnits = Double
  type ClusteringKeyList = js.Array[ClusteringKey]
  type ColumnDefinitionList = js.Array[ColumnDefinition]
  type DefaultTimeToLive = Int
  type GenericString = String
  type KeyspaceName = String
  type KeyspaceSummaryList = js.Array[KeyspaceSummary]
  type MaxResults = Int
  type NextToken = String
  type PartitionKeyList = js.Array[PartitionKey]
  type StaticColumnList = js.Array[StaticColumn]
  type TableName = String
  type TableSummaryList = js.Array[TableSummary]
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type kmsKeyARN = String

  final class KeyspacesOps(private val service: Keyspaces) extends AnyVal {

    @inline def createKeyspaceFuture(params: CreateKeyspaceRequest): Future[CreateKeyspaceResponse] = service.createKeyspace(params).promise().toFuture
    @inline def createTableFuture(params: CreateTableRequest): Future[CreateTableResponse] = service.createTable(params).promise().toFuture
    @inline def deleteKeyspaceFuture(params: DeleteKeyspaceRequest): Future[DeleteKeyspaceResponse] = service.deleteKeyspace(params).promise().toFuture
    @inline def deleteTableFuture(params: DeleteTableRequest): Future[DeleteTableResponse] = service.deleteTable(params).promise().toFuture
    @inline def getKeyspaceFuture(params: GetKeyspaceRequest): Future[GetKeyspaceResponse] = service.getKeyspace(params).promise().toFuture
    @inline def getTableFuture(params: GetTableRequest): Future[GetTableResponse] = service.getTable(params).promise().toFuture
    @inline def listKeyspacesFuture(params: ListKeyspacesRequest): Future[ListKeyspacesResponse] = service.listKeyspaces(params).promise().toFuture
    @inline def listTablesFuture(params: ListTablesRequest): Future[ListTablesResponse] = service.listTables(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def restoreTableFuture(params: RestoreTableRequest): Future[RestoreTableResponse] = service.restoreTable(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateTableFuture(params: UpdateTableRequest): Future[UpdateTableResponse] = service.updateTable(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/keyspaces", JSImport.Namespace, "AWS.Keyspaces")
  class Keyspaces() extends js.Object {
    def this(config: AWSConfig) = this()

    def createKeyspace(params: CreateKeyspaceRequest): Request[CreateKeyspaceResponse] = js.native
    def createTable(params: CreateTableRequest): Request[CreateTableResponse] = js.native
    def deleteKeyspace(params: DeleteKeyspaceRequest): Request[DeleteKeyspaceResponse] = js.native
    def deleteTable(params: DeleteTableRequest): Request[DeleteTableResponse] = js.native
    def getKeyspace(params: GetKeyspaceRequest): Request[GetKeyspaceResponse] = js.native
    def getTable(params: GetTableRequest): Request[GetTableResponse] = js.native
    def listKeyspaces(params: ListKeyspacesRequest): Request[ListKeyspacesResponse] = js.native
    def listTables(params: ListTablesRequest): Request[ListTablesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def restoreTable(params: RestoreTableRequest): Request[RestoreTableResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateTable(params: UpdateTableRequest): Request[UpdateTableResponse] = js.native
  }
  object Keyspaces {
    @inline implicit def toOps(service: Keyspaces): KeyspacesOps = {
      new KeyspacesOps(service)
    }
  }

  /** Amazon Keyspaces has two read/write capacity modes for processing reads and writes on your tables: • On-demand (default) • Provisioned The read/write capacity mode that you choose controls how you are charged for read and write throughput and how table throughput capacity is managed. For more information, see [[https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html|Read/write capacity modes]] in the <i>Amazon Keyspaces Developer Guide</i>.
    */
  @js.native
  trait CapacitySpecification extends js.Object {
    var throughputMode: ThroughputMode
    var readCapacityUnits: js.UndefOr[CapacityUnits]
    var writeCapacityUnits: js.UndefOr[CapacityUnits]
  }

  object CapacitySpecification {
    @inline
    def apply(
        throughputMode: ThroughputMode,
        readCapacityUnits: js.UndefOr[CapacityUnits] = js.undefined,
        writeCapacityUnits: js.UndefOr[CapacityUnits] = js.undefined
    ): CapacitySpecification = {
      val __obj = js.Dynamic.literal(
        "throughputMode" -> throughputMode.asInstanceOf[js.Any]
      )

      readCapacityUnits.foreach(__v => __obj.updateDynamic("readCapacityUnits")(__v.asInstanceOf[js.Any]))
      writeCapacityUnits.foreach(__v => __obj.updateDynamic("writeCapacityUnits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CapacitySpecification]
    }
  }

  /** The read/write throughput capacity mode for a table. The options are: • <code>throughputMode:PAY_PER_REQUEST</code> and • <code>throughputMode:PROVISIONED</code>. For more information, see [[https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html|Read/write capacity modes]] in the <i>Amazon Keyspaces Developer Guide</i>.
    */
  @js.native
  trait CapacitySpecificationSummary extends js.Object {
    var throughputMode: ThroughputMode
    var lastUpdateToPayPerRequestTimestamp: js.UndefOr[Timestamp]
    var readCapacityUnits: js.UndefOr[CapacityUnits]
    var writeCapacityUnits: js.UndefOr[CapacityUnits]
  }

  object CapacitySpecificationSummary {
    @inline
    def apply(
        throughputMode: ThroughputMode,
        lastUpdateToPayPerRequestTimestamp: js.UndefOr[Timestamp] = js.undefined,
        readCapacityUnits: js.UndefOr[CapacityUnits] = js.undefined,
        writeCapacityUnits: js.UndefOr[CapacityUnits] = js.undefined
    ): CapacitySpecificationSummary = {
      val __obj = js.Dynamic.literal(
        "throughputMode" -> throughputMode.asInstanceOf[js.Any]
      )

      lastUpdateToPayPerRequestTimestamp.foreach(__v => __obj.updateDynamic("lastUpdateToPayPerRequestTimestamp")(__v.asInstanceOf[js.Any]))
      readCapacityUnits.foreach(__v => __obj.updateDynamic("readCapacityUnits")(__v.asInstanceOf[js.Any]))
      writeCapacityUnits.foreach(__v => __obj.updateDynamic("writeCapacityUnits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CapacitySpecificationSummary]
    }
  }

  /** The optional clustering column portion of your primary key determines how the data is clustered and sorted within each partition.
    */
  @js.native
  trait ClusteringKey extends js.Object {
    var name: GenericString
    var orderBy: SortOrder
  }

  object ClusteringKey {
    @inline
    def apply(
        name: GenericString,
        orderBy: SortOrder
    ): ClusteringKey = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "orderBy" -> orderBy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ClusteringKey]
    }
  }

  /** The names and data types of regular columns.
    */
  @js.native
  trait ColumnDefinition extends js.Object {
    var name: GenericString
    var `type`: GenericString
  }

  object ColumnDefinition {
    @inline
    def apply(
        name: GenericString,
        `type`: GenericString
    ): ColumnDefinition = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ColumnDefinition]
    }
  }

  /** An optional comment that describes the table.
    */
  @js.native
  trait Comment extends js.Object {
    var message: String
  }

  object Comment {
    @inline
    def apply(
        message: String
    ): Comment = {
      val __obj = js.Dynamic.literal(
        "message" -> message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Comment]
    }
  }

  @js.native
  trait CreateKeyspaceRequest extends js.Object {
    var keyspaceName: KeyspaceName
    var tags: js.UndefOr[TagList]
  }

  object CreateKeyspaceRequest {
    @inline
    def apply(
        keyspaceName: KeyspaceName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateKeyspaceRequest = {
      val __obj = js.Dynamic.literal(
        "keyspaceName" -> keyspaceName.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateKeyspaceRequest]
    }
  }

  @js.native
  trait CreateKeyspaceResponse extends js.Object {
    var resourceArn: ARN
  }

  object CreateKeyspaceResponse {
    @inline
    def apply(
        resourceArn: ARN
    ): CreateKeyspaceResponse = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateKeyspaceResponse]
    }
  }

  @js.native
  trait CreateTableRequest extends js.Object {
    var keyspaceName: KeyspaceName
    var schemaDefinition: SchemaDefinition
    var tableName: TableName
    var capacitySpecification: js.UndefOr[CapacitySpecification]
    var comment: js.UndefOr[Comment]
    var defaultTimeToLive: js.UndefOr[DefaultTimeToLive]
    var encryptionSpecification: js.UndefOr[EncryptionSpecification]
    var pointInTimeRecovery: js.UndefOr[PointInTimeRecovery]
    var tags: js.UndefOr[TagList]
    var ttl: js.UndefOr[TimeToLive]
  }

  object CreateTableRequest {
    @inline
    def apply(
        keyspaceName: KeyspaceName,
        schemaDefinition: SchemaDefinition,
        tableName: TableName,
        capacitySpecification: js.UndefOr[CapacitySpecification] = js.undefined,
        comment: js.UndefOr[Comment] = js.undefined,
        defaultTimeToLive: js.UndefOr[DefaultTimeToLive] = js.undefined,
        encryptionSpecification: js.UndefOr[EncryptionSpecification] = js.undefined,
        pointInTimeRecovery: js.UndefOr[PointInTimeRecovery] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        ttl: js.UndefOr[TimeToLive] = js.undefined
    ): CreateTableRequest = {
      val __obj = js.Dynamic.literal(
        "keyspaceName" -> keyspaceName.asInstanceOf[js.Any],
        "schemaDefinition" -> schemaDefinition.asInstanceOf[js.Any],
        "tableName" -> tableName.asInstanceOf[js.Any]
      )

      capacitySpecification.foreach(__v => __obj.updateDynamic("capacitySpecification")(__v.asInstanceOf[js.Any]))
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      defaultTimeToLive.foreach(__v => __obj.updateDynamic("defaultTimeToLive")(__v.asInstanceOf[js.Any]))
      encryptionSpecification.foreach(__v => __obj.updateDynamic("encryptionSpecification")(__v.asInstanceOf[js.Any]))
      pointInTimeRecovery.foreach(__v => __obj.updateDynamic("pointInTimeRecovery")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      ttl.foreach(__v => __obj.updateDynamic("ttl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTableRequest]
    }
  }

  @js.native
  trait CreateTableResponse extends js.Object {
    var resourceArn: ARN
  }

  object CreateTableResponse {
    @inline
    def apply(
        resourceArn: ARN
    ): CreateTableResponse = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateTableResponse]
    }
  }

  @js.native
  trait DeleteKeyspaceRequest extends js.Object {
    var keyspaceName: KeyspaceName
  }

  object DeleteKeyspaceRequest {
    @inline
    def apply(
        keyspaceName: KeyspaceName
    ): DeleteKeyspaceRequest = {
      val __obj = js.Dynamic.literal(
        "keyspaceName" -> keyspaceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteKeyspaceRequest]
    }
  }

  @js.native
  trait DeleteKeyspaceResponse extends js.Object

  object DeleteKeyspaceResponse {
    @inline
    def apply(): DeleteKeyspaceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteKeyspaceResponse]
    }
  }

  @js.native
  trait DeleteTableRequest extends js.Object {
    var keyspaceName: KeyspaceName
    var tableName: TableName
  }

  object DeleteTableRequest {
    @inline
    def apply(
        keyspaceName: KeyspaceName,
        tableName: TableName
    ): DeleteTableRequest = {
      val __obj = js.Dynamic.literal(
        "keyspaceName" -> keyspaceName.asInstanceOf[js.Any],
        "tableName" -> tableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTableRequest]
    }
  }

  @js.native
  trait DeleteTableResponse extends js.Object

  object DeleteTableResponse {
    @inline
    def apply(): DeleteTableResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTableResponse]
    }
  }

  /** Amazon Keyspaces encrypts and decrypts the table data at rest transparently and integrates with Key Management Service for storing and managing the encryption key. You can choose one of the following KMS keys (KMS keys): • Amazon Web Services owned key - This is the default encryption type. The key is owned by Amazon Keyspaces (no additional charge). • Customer managed key - This key is stored in your account and is created, owned, and managed by you. You have full control over the customer managed key (KMS charges apply). For more information about encryption at rest in Amazon Keyspaces, see [[https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html|Encryption at rest]] in the <i>Amazon Keyspaces Developer Guide</i>. For more information about KMS, see [[https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html|KMS management service concepts]] in the <i>Key Management Service Developer Guide</i>.
    */
  @js.native
  trait EncryptionSpecification extends js.Object {
    var `type`: EncryptionType
    var kmsKeyIdentifier: js.UndefOr[kmsKeyARN]
  }

  object EncryptionSpecification {
    @inline
    def apply(
        `type`: EncryptionType,
        kmsKeyIdentifier: js.UndefOr[kmsKeyARN] = js.undefined
    ): EncryptionSpecification = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      kmsKeyIdentifier.foreach(__v => __obj.updateDynamic("kmsKeyIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionSpecification]
    }
  }

  @js.native
  trait GetKeyspaceRequest extends js.Object {
    var keyspaceName: KeyspaceName
  }

  object GetKeyspaceRequest {
    @inline
    def apply(
        keyspaceName: KeyspaceName
    ): GetKeyspaceRequest = {
      val __obj = js.Dynamic.literal(
        "keyspaceName" -> keyspaceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetKeyspaceRequest]
    }
  }

  @js.native
  trait GetKeyspaceResponse extends js.Object {
    var keyspaceName: KeyspaceName
    var resourceArn: ARN
  }

  object GetKeyspaceResponse {
    @inline
    def apply(
        keyspaceName: KeyspaceName,
        resourceArn: ARN
    ): GetKeyspaceResponse = {
      val __obj = js.Dynamic.literal(
        "keyspaceName" -> keyspaceName.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetKeyspaceResponse]
    }
  }

  @js.native
  trait GetTableRequest extends js.Object {
    var keyspaceName: KeyspaceName
    var tableName: TableName
  }

  object GetTableRequest {
    @inline
    def apply(
        keyspaceName: KeyspaceName,
        tableName: TableName
    ): GetTableRequest = {
      val __obj = js.Dynamic.literal(
        "keyspaceName" -> keyspaceName.asInstanceOf[js.Any],
        "tableName" -> tableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTableRequest]
    }
  }

  @js.native
  trait GetTableResponse extends js.Object {
    var keyspaceName: KeyspaceName
    var resourceArn: ARN
    var tableName: TableName
    var capacitySpecification: js.UndefOr[CapacitySpecificationSummary]
    var comment: js.UndefOr[Comment]
    var creationTimestamp: js.UndefOr[Timestamp]
    var defaultTimeToLive: js.UndefOr[DefaultTimeToLive]
    var encryptionSpecification: js.UndefOr[EncryptionSpecification]
    var pointInTimeRecovery: js.UndefOr[PointInTimeRecoverySummary]
    var schemaDefinition: js.UndefOr[SchemaDefinition]
    var status: js.UndefOr[TableStatus]
    var ttl: js.UndefOr[TimeToLive]
  }

  object GetTableResponse {
    @inline
    def apply(
        keyspaceName: KeyspaceName,
        resourceArn: ARN,
        tableName: TableName,
        capacitySpecification: js.UndefOr[CapacitySpecificationSummary] = js.undefined,
        comment: js.UndefOr[Comment] = js.undefined,
        creationTimestamp: js.UndefOr[Timestamp] = js.undefined,
        defaultTimeToLive: js.UndefOr[DefaultTimeToLive] = js.undefined,
        encryptionSpecification: js.UndefOr[EncryptionSpecification] = js.undefined,
        pointInTimeRecovery: js.UndefOr[PointInTimeRecoverySummary] = js.undefined,
        schemaDefinition: js.UndefOr[SchemaDefinition] = js.undefined,
        status: js.UndefOr[TableStatus] = js.undefined,
        ttl: js.UndefOr[TimeToLive] = js.undefined
    ): GetTableResponse = {
      val __obj = js.Dynamic.literal(
        "keyspaceName" -> keyspaceName.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tableName" -> tableName.asInstanceOf[js.Any]
      )

      capacitySpecification.foreach(__v => __obj.updateDynamic("capacitySpecification")(__v.asInstanceOf[js.Any]))
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      creationTimestamp.foreach(__v => __obj.updateDynamic("creationTimestamp")(__v.asInstanceOf[js.Any]))
      defaultTimeToLive.foreach(__v => __obj.updateDynamic("defaultTimeToLive")(__v.asInstanceOf[js.Any]))
      encryptionSpecification.foreach(__v => __obj.updateDynamic("encryptionSpecification")(__v.asInstanceOf[js.Any]))
      pointInTimeRecovery.foreach(__v => __obj.updateDynamic("pointInTimeRecovery")(__v.asInstanceOf[js.Any]))
      schemaDefinition.foreach(__v => __obj.updateDynamic("schemaDefinition")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      ttl.foreach(__v => __obj.updateDynamic("ttl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableResponse]
    }
  }

  /** Represents the properties of a keyspace.
    */
  @js.native
  trait KeyspaceSummary extends js.Object {
    var keyspaceName: KeyspaceName
    var resourceArn: ARN
  }

  object KeyspaceSummary {
    @inline
    def apply(
        keyspaceName: KeyspaceName,
        resourceArn: ARN
    ): KeyspaceSummary = {
      val __obj = js.Dynamic.literal(
        "keyspaceName" -> keyspaceName.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KeyspaceSummary]
    }
  }

  @js.native
  trait ListKeyspacesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListKeyspacesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListKeyspacesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKeyspacesRequest]
    }
  }

  @js.native
  trait ListKeyspacesResponse extends js.Object {
    var keyspaces: KeyspaceSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListKeyspacesResponse {
    @inline
    def apply(
        keyspaces: KeyspaceSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListKeyspacesResponse = {
      val __obj = js.Dynamic.literal(
        "keyspaces" -> keyspaces.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKeyspacesResponse]
    }
  }

  @js.native
  trait ListTablesRequest extends js.Object {
    var keyspaceName: KeyspaceName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTablesRequest {
    @inline
    def apply(
        keyspaceName: KeyspaceName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTablesRequest = {
      val __obj = js.Dynamic.literal(
        "keyspaceName" -> keyspaceName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTablesRequest]
    }
  }

  @js.native
  trait ListTablesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tables: js.UndefOr[TableSummaryList]
  }

  object ListTablesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tables: js.UndefOr[TableSummaryList] = js.undefined
    ): ListTablesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tables.foreach(__v => __obj.updateDynamic("tables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTablesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ARN
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** The partition key portion of the primary key is required and determines how Amazon Keyspaces stores the data. The partition key can be a single column, or it can be a compound value composed of two or more columns.
    */
  @js.native
  trait PartitionKey extends js.Object {
    var name: GenericString
  }

  object PartitionKey {
    @inline
    def apply(
        name: GenericString
    ): PartitionKey = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PartitionKey]
    }
  }

  /** Point-in-time recovery (PITR) helps protect your Amazon Keyspaces tables from accidental write or delete operations by providing you continuous backups of your table data. For more information, see [[https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html|Point-in-time recovery]] in the <i>Amazon Keyspaces Developer Guide</i>.
    */
  @js.native
  trait PointInTimeRecovery extends js.Object {
    var status: PointInTimeRecoveryStatus
  }

  object PointInTimeRecovery {
    @inline
    def apply(
        status: PointInTimeRecoveryStatus
    ): PointInTimeRecovery = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PointInTimeRecovery]
    }
  }

  /** The point-in-time recovery status of the specified table.
    */
  @js.native
  trait PointInTimeRecoverySummary extends js.Object {
    var status: PointInTimeRecoveryStatus
    var earliestRestorableTimestamp: js.UndefOr[Timestamp]
  }

  object PointInTimeRecoverySummary {
    @inline
    def apply(
        status: PointInTimeRecoveryStatus,
        earliestRestorableTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): PointInTimeRecoverySummary = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      earliestRestorableTimestamp.foreach(__v => __obj.updateDynamic("earliestRestorableTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PointInTimeRecoverySummary]
    }
  }

  @js.native
  trait RestoreTableRequest extends js.Object {
    var sourceKeyspaceName: KeyspaceName
    var sourceTableName: TableName
    var targetKeyspaceName: KeyspaceName
    var targetTableName: TableName
    var capacitySpecificationOverride: js.UndefOr[CapacitySpecification]
    var encryptionSpecificationOverride: js.UndefOr[EncryptionSpecification]
    var pointInTimeRecoveryOverride: js.UndefOr[PointInTimeRecovery]
    var restoreTimestamp: js.UndefOr[Timestamp]
    var tagsOverride: js.UndefOr[TagList]
  }

  object RestoreTableRequest {
    @inline
    def apply(
        sourceKeyspaceName: KeyspaceName,
        sourceTableName: TableName,
        targetKeyspaceName: KeyspaceName,
        targetTableName: TableName,
        capacitySpecificationOverride: js.UndefOr[CapacitySpecification] = js.undefined,
        encryptionSpecificationOverride: js.UndefOr[EncryptionSpecification] = js.undefined,
        pointInTimeRecoveryOverride: js.UndefOr[PointInTimeRecovery] = js.undefined,
        restoreTimestamp: js.UndefOr[Timestamp] = js.undefined,
        tagsOverride: js.UndefOr[TagList] = js.undefined
    ): RestoreTableRequest = {
      val __obj = js.Dynamic.literal(
        "sourceKeyspaceName" -> sourceKeyspaceName.asInstanceOf[js.Any],
        "sourceTableName" -> sourceTableName.asInstanceOf[js.Any],
        "targetKeyspaceName" -> targetKeyspaceName.asInstanceOf[js.Any],
        "targetTableName" -> targetTableName.asInstanceOf[js.Any]
      )

      capacitySpecificationOverride.foreach(__v => __obj.updateDynamic("capacitySpecificationOverride")(__v.asInstanceOf[js.Any]))
      encryptionSpecificationOverride.foreach(__v => __obj.updateDynamic("encryptionSpecificationOverride")(__v.asInstanceOf[js.Any]))
      pointInTimeRecoveryOverride.foreach(__v => __obj.updateDynamic("pointInTimeRecoveryOverride")(__v.asInstanceOf[js.Any]))
      restoreTimestamp.foreach(__v => __obj.updateDynamic("restoreTimestamp")(__v.asInstanceOf[js.Any]))
      tagsOverride.foreach(__v => __obj.updateDynamic("tagsOverride")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreTableRequest]
    }
  }

  @js.native
  trait RestoreTableResponse extends js.Object {
    var restoredTableARN: ARN
  }

  object RestoreTableResponse {
    @inline
    def apply(
        restoredTableARN: ARN
    ): RestoreTableResponse = {
      val __obj = js.Dynamic.literal(
        "restoredTableARN" -> restoredTableARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RestoreTableResponse]
    }
  }

  /** Describes the schema of the table.
    */
  @js.native
  trait SchemaDefinition extends js.Object {
    var allColumns: ColumnDefinitionList
    var partitionKeys: PartitionKeyList
    var clusteringKeys: js.UndefOr[ClusteringKeyList]
    var staticColumns: js.UndefOr[StaticColumnList]
  }

  object SchemaDefinition {
    @inline
    def apply(
        allColumns: ColumnDefinitionList,
        partitionKeys: PartitionKeyList,
        clusteringKeys: js.UndefOr[ClusteringKeyList] = js.undefined,
        staticColumns: js.UndefOr[StaticColumnList] = js.undefined
    ): SchemaDefinition = {
      val __obj = js.Dynamic.literal(
        "allColumns" -> allColumns.asInstanceOf[js.Any],
        "partitionKeys" -> partitionKeys.asInstanceOf[js.Any]
      )

      clusteringKeys.foreach(__v => __obj.updateDynamic("clusteringKeys")(__v.asInstanceOf[js.Any]))
      staticColumns.foreach(__v => __obj.updateDynamic("staticColumns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaDefinition]
    }
  }

  /** The static columns of the table. Static columns store values that are shared by all rows in the same partition.
    */
  @js.native
  trait StaticColumn extends js.Object {
    var name: GenericString
  }

  object StaticColumn {
    @inline
    def apply(
        name: GenericString
    ): StaticColumn = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StaticColumn]
    }
  }

  /** Returns the name of the specified table, the keyspace it is stored in, and the unique identifier in the format of an Amazon Resource Name (ARN).
    */
  @js.native
  trait TableSummary extends js.Object {
    var keyspaceName: KeyspaceName
    var resourceArn: ARN
    var tableName: TableName
  }

  object TableSummary {
    @inline
    def apply(
        keyspaceName: KeyspaceName,
        resourceArn: ARN,
        tableName: TableName
    ): TableSummary = {
      val __obj = js.Dynamic.literal(
        "keyspaceName" -> keyspaceName.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tableName" -> tableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TableSummary]
    }
  }

  /** Describes a tag. A tag is a key-value pair. You can add up to 50 tags to a single Amazon Keyspaces resource. Amazon Web Services-assigned tag names and values are automatically assigned the <code>aws:</code> prefix, which the user cannot assign. Amazon Web Services-assigned tag names do not count towards the tag limit of 50. User-assigned tag names have the prefix <code>user:</code> in the Cost Allocation Report. You cannot backdate the application of a tag. For more information, see [[https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html|Adding tags and labels to Amazon Keyspaces resources]] in the <i>Amazon Keyspaces Developer Guide</i>.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    @inline
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
        tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** Enable custom Time to Live (TTL) settings for rows and columns without setting a TTL default for the specified table. For more information, see [[https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_enabling|Enabling TTL on tables]] in the <i>Amazon Keyspaces Developer Guide</i>.
    */
  @js.native
  trait TimeToLive extends js.Object {
    var status: TimeToLiveStatus
  }

  object TimeToLive {
    @inline
    def apply(
        status: TimeToLiveStatus
    ): TimeToLive = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimeToLive]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tags: TagList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
        tags: TagList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateTableRequest extends js.Object {
    var keyspaceName: KeyspaceName
    var tableName: TableName
    var addColumns: js.UndefOr[ColumnDefinitionList]
    var capacitySpecification: js.UndefOr[CapacitySpecification]
    var defaultTimeToLive: js.UndefOr[DefaultTimeToLive]
    var encryptionSpecification: js.UndefOr[EncryptionSpecification]
    var pointInTimeRecovery: js.UndefOr[PointInTimeRecovery]
    var ttl: js.UndefOr[TimeToLive]
  }

  object UpdateTableRequest {
    @inline
    def apply(
        keyspaceName: KeyspaceName,
        tableName: TableName,
        addColumns: js.UndefOr[ColumnDefinitionList] = js.undefined,
        capacitySpecification: js.UndefOr[CapacitySpecification] = js.undefined,
        defaultTimeToLive: js.UndefOr[DefaultTimeToLive] = js.undefined,
        encryptionSpecification: js.UndefOr[EncryptionSpecification] = js.undefined,
        pointInTimeRecovery: js.UndefOr[PointInTimeRecovery] = js.undefined,
        ttl: js.UndefOr[TimeToLive] = js.undefined
    ): UpdateTableRequest = {
      val __obj = js.Dynamic.literal(
        "keyspaceName" -> keyspaceName.asInstanceOf[js.Any],
        "tableName" -> tableName.asInstanceOf[js.Any]
      )

      addColumns.foreach(__v => __obj.updateDynamic("addColumns")(__v.asInstanceOf[js.Any]))
      capacitySpecification.foreach(__v => __obj.updateDynamic("capacitySpecification")(__v.asInstanceOf[js.Any]))
      defaultTimeToLive.foreach(__v => __obj.updateDynamic("defaultTimeToLive")(__v.asInstanceOf[js.Any]))
      encryptionSpecification.foreach(__v => __obj.updateDynamic("encryptionSpecification")(__v.asInstanceOf[js.Any]))
      pointInTimeRecovery.foreach(__v => __obj.updateDynamic("pointInTimeRecovery")(__v.asInstanceOf[js.Any]))
      ttl.foreach(__v => __obj.updateDynamic("ttl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTableRequest]
    }
  }

  @js.native
  trait UpdateTableResponse extends js.Object {
    var resourceArn: ARN
  }

  object UpdateTableResponse {
    @inline
    def apply(
        resourceArn: ARN
    ): UpdateTableResponse = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateTableResponse]
    }
  }
}
