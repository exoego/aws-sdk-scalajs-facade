package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object dynamodb {
  type AttributeAction = String
  type AttributeDefinitions = js.Array[AttributeDefinition]
  type AttributeMap = js.Dictionary[AttributeValue]
  type AttributeName = String
  type AttributeNameList = js.Array[AttributeName]
  type AttributeUpdates = js.Dictionary[AttributeValueUpdate]
  type AttributeValueList = js.Array[AttributeValue]
  type Backfilling = Boolean
  type BatchGetRequestMap = js.Dictionary[KeysAndAttributes]
  type BatchGetResponseMap = js.Dictionary[ItemList]
  type BatchWriteItemRequestMap = js.Dictionary[WriteRequests]
  type BinaryAttributeValue = js.Array[Byte]
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue = Boolean
  type BooleanObject = Boolean
  type ComparisonOperator = String
  type ConditionExpression = String
  type ConditionalOperator = String
  type ConsistentRead = Boolean
  type ConsumedCapacityMultiple = js.Array[ConsumedCapacity]
  type ConsumedCapacityUnits = Double
  type Date = js.Date
  type ErrorMessage = String
  type ExpectedAttributeMap = js.Dictionary[ExpectedAttributeValue]
  type ExpressionAttributeNameMap = js.Dictionary[AttributeName]
  type ExpressionAttributeNameVariable = String
  type ExpressionAttributeValueMap = js.Dictionary[AttributeValue]
  type ExpressionAttributeValueVariable = String
  type FilterConditionMap = js.Dictionary[Condition]
  type GlobalSecondaryIndexDescriptionList = js.Array[GlobalSecondaryIndexDescription]
  type GlobalSecondaryIndexList = js.Array[GlobalSecondaryIndex]
  type GlobalSecondaryIndexUpdateList = js.Array[GlobalSecondaryIndexUpdate]
  type IndexName = String
  type IndexStatus = String
  type ItemCollectionKeyAttributeMap = js.Dictionary[AttributeValue]
  type ItemCollectionMetricsMultiple = js.Array[ItemCollectionMetrics]
  type ItemCollectionMetricsPerTable = js.Dictionary[ItemCollectionMetricsMultiple]
  type ItemCollectionSizeEstimateBound = Double
  type ItemCollectionSizeEstimateRange = js.Array[ItemCollectionSizeEstimateBound]
  type ItemList = js.Array[AttributeMap]
  type Key = js.Dictionary[AttributeValue]
  type KeyConditions = js.Dictionary[Condition]
  type KeyExpression = String
  type KeyList = js.Array[Key]
  type KeySchema = js.Array[KeySchemaElement]
  type KeySchemaAttributeName = String
  type KeyType = String
  type ListAttributeValue = js.Array[AttributeValue]
  type ListTablesInputLimit = Integer
  type LocalSecondaryIndexDescriptionList = js.Array[LocalSecondaryIndexDescription]
  type LocalSecondaryIndexList = js.Array[LocalSecondaryIndex]
  type MapAttributeValue = js.Dictionary[AttributeValue]
  type NonKeyAttributeName = String
  type NonKeyAttributeNameList = js.Array[NonKeyAttributeName]
  type NullAttributeValue = Boolean
  type NumberAttributeValue = String
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  type PositiveIntegerObject = Integer
  type PositiveLongObject = Long
  type ProjectionExpression = String
  type ProjectionType = String
  type PutItemInputAttributeMap = js.Dictionary[AttributeValue]
  type ReturnConsumedCapacity = String
  type ReturnItemCollectionMetrics = String
  type ReturnValue = String
  type ScalarAttributeType = String
  type ScanSegment = Integer
  type ScanTotalSegments = Integer
  type SecondaryIndexesCapacityMap = js.Dictionary[Capacity]
  type Select = String
  type StreamArn = String
  type StreamEnabled = Boolean
  type StreamViewType = String
  type StringAttributeValue = String
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  type TableName = String
  type TableNameList = js.Array[TableName]
  type TableStatus = String
  type UpdateExpression = String
  type WriteRequests = js.Array[WriteRequest]
}

package dynamodb {
  @js.native
  trait Dynamodb extends js.Object {
    def batchGetItem(params: BatchGetItemInput, callback: Callback[BatchGetItemOutput]): Unit = js.native
    def batchGetItem(params: BatchGetItemInput): Request[BatchGetItemOutput] = js.native
    def batchWriteItem(params: BatchWriteItemInput, callback: Callback[BatchWriteItemOutput]): Unit = js.native
    def batchWriteItem(params: BatchWriteItemInput): Request[BatchWriteItemOutput] = js.native
    def createTable(params: CreateTableInput, callback: Callback[CreateTableOutput]): Unit = js.native
    def createTable(params: CreateTableInput): Request[CreateTableOutput] = js.native
    def deleteItem(params: DeleteItemInput, callback: Callback[DeleteItemOutput]): Unit = js.native
    def deleteItem(params: DeleteItemInput): Request[DeleteItemOutput] = js.native
    def deleteTable(params: DeleteTableInput, callback: Callback[DeleteTableOutput]): Unit = js.native
    def deleteTable(params: DeleteTableInput): Request[DeleteTableOutput] = js.native
    def describeLimits(params: DescribeLimitsInput, callback: Callback[DescribeLimitsOutput]): Unit = js.native
    def describeLimits(params: DescribeLimitsInput): Request[DescribeLimitsOutput] = js.native
    def describeTable(params: DescribeTableInput, callback: Callback[DescribeTableOutput]): Unit = js.native
    def describeTable(params: DescribeTableInput): Request[DescribeTableOutput] = js.native
    def getItem(params: GetItemInput, callback: Callback[GetItemOutput]): Unit = js.native
    def getItem(params: GetItemInput): Request[GetItemOutput] = js.native
    def listTables(params: ListTablesInput, callback: Callback[ListTablesOutput]): Unit = js.native
    def listTables(params: ListTablesInput): Request[ListTablesOutput] = js.native
    def putItem(params: PutItemInput, callback: Callback[PutItemOutput]): Unit = js.native
    def putItem(params: PutItemInput): Request[PutItemOutput] = js.native
    def query(params: QueryInput, callback: Callback[QueryOutput]): Unit = js.native
    def query(params: QueryInput): Request[QueryOutput] = js.native
    def scan(params: ScanInput, callback: Callback[ScanOutput]): Unit = js.native
    def scan(params: ScanInput): Request[ScanOutput] = js.native
    def updateItem(params: UpdateItemInput, callback: Callback[UpdateItemOutput]): Unit = js.native
    def updateItem(params: UpdateItemInput): Request[UpdateItemOutput] = js.native
    def updateTable(params: UpdateTableInput, callback: Callback[UpdateTableOutput]): Unit = js.native
    def updateTable(params: UpdateTableInput): Request[UpdateTableOutput] = js.native
  }


  object AttributeActionEnum {
    val ADD = "ADD"
    val PUT = "PUT"
    val DELETE = "DELETE"

    val values = IndexedSeq(ADD, PUT, DELETE)
  }

  /**
   * <p>Represents an attribute for describing the key schema for the table and indexes.</p>
   */
  @js.native
  trait AttributeDefinition extends js.Object {
    var AttributeName: KeySchemaAttributeName
    var AttributeType: ScalarAttributeType
  }

  object AttributeDefinition {
    def apply(
      AttributeName: js.UndefOr[KeySchemaAttributeName] = js.undefined,
      AttributeType: js.UndefOr[ScalarAttributeType] = js.undefined
    ): AttributeDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttributeName" -> AttributeName.map { x => x: js.Any }),
        ("AttributeType" -> AttributeType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeDefinition]
    }
  }

  /**
   * <p>Represents the data for an attribute. You can set one, and only one, of the elements.</p> <p>Each attribute in an item is a name-value pair. An attribute can be single-valued or multi-valued set. For example, a book item can have title and authors attributes. Each book has one title but can have many authors. The multi-valued attribute is a set; duplicate values are not allowed.</p>
   */
  @js.native
  trait AttributeValue extends js.Object {
    var NS: NumberSetAttributeValue
    var N: NumberAttributeValue
    var M: MapAttributeValue
    var NULL: NullAttributeValue
    var L: ListAttributeValue
    var BS: BinarySetAttributeValue
    var B: BinaryAttributeValue
    var SS: StringSetAttributeValue
    var BOOL: BooleanAttributeValue
    var S: StringAttributeValue
  }

  object AttributeValue {
    def apply(
      NS: js.UndefOr[NumberSetAttributeValue] = js.undefined,
      N: js.UndefOr[NumberAttributeValue] = js.undefined,
      M: js.UndefOr[MapAttributeValue] = js.undefined,
      NULL: js.UndefOr[NullAttributeValue] = js.undefined,
      L: js.UndefOr[ListAttributeValue] = js.undefined,
      BS: js.UndefOr[BinarySetAttributeValue] = js.undefined,
      B: js.UndefOr[BinaryAttributeValue] = js.undefined,
      SS: js.UndefOr[StringSetAttributeValue] = js.undefined,
      BOOL: js.UndefOr[BooleanAttributeValue] = js.undefined,
      S: js.UndefOr[StringAttributeValue] = js.undefined
    ): AttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NS" -> NS.map { x => x: js.Any }),
        ("N" -> N.map { x => x: js.Any }),
        ("M" -> M.map { x => x: js.Any }),
        ("NULL" -> NULL.map { x => x: js.Any }),
        ("L" -> L.map { x => x: js.Any }),
        ("BS" -> BS.map { x => x: js.Any }),
        ("B" -> B.map { x => x: js.Any }),
        ("SS" -> SS.map { x => x: js.Any }),
        ("BOOL" -> BOOL.map { x => x: js.Any }),
        ("S" -> S.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValue]
    }
  }

  /**
   * <p>For the <i>UpdateItem</i> operation, represents the attributes to be modified, the action to perform on each, and the new value for each.</p> <note> <p>You cannot use <i>UpdateItem</i> to update any primary key attributes. Instead, you will need to delete the item, and then use <i>PutItem</i> to create a new item with new attributes.</p> </note> <p>Attribute values cannot be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests with empty values will be rejected with a <i>ValidationException</i> exception.</p>
   */
  @js.native
  trait AttributeValueUpdate extends js.Object {
    var Value: AttributeValue
    var Action: AttributeAction
  }

  object AttributeValueUpdate {
    def apply(
      Value: js.UndefOr[AttributeValue] = js.undefined,
      Action: js.UndefOr[AttributeAction] = js.undefined
    ): AttributeValueUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Value" -> Value.map { x => x: js.Any }),
        ("Action" -> Action.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValueUpdate]
    }
  }

  /**
   * <p>Represents the input of a <i>BatchGetItem</i> operation.</p>
   */
  @js.native
  trait BatchGetItemInput extends js.Object {
    var RequestItems: BatchGetRequestMap
    var ReturnConsumedCapacity: ReturnConsumedCapacity
  }

  object BatchGetItemInput {
    def apply(
      RequestItems: js.UndefOr[BatchGetRequestMap] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
    ): BatchGetItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RequestItems" -> RequestItems.map { x => x: js.Any }),
        ("ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetItemInput]
    }
  }

  /**
   * <p>Represents the output of a <i>BatchGetItem</i> operation.</p>
   */
  @js.native
  trait BatchGetItemOutput extends js.Object {
    var Responses: BatchGetResponseMap
    var UnprocessedKeys: BatchGetRequestMap
    var ConsumedCapacity: ConsumedCapacityMultiple
  }

  object BatchGetItemOutput {
    def apply(
      Responses: js.UndefOr[BatchGetResponseMap] = js.undefined,
      UnprocessedKeys: js.UndefOr[BatchGetRequestMap] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
    ): BatchGetItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Responses" -> Responses.map { x => x: js.Any }),
        ("UnprocessedKeys" -> UnprocessedKeys.map { x => x: js.Any }),
        ("ConsumedCapacity" -> ConsumedCapacity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetItemOutput]
    }
  }

  /**
   * <p>Represents the input of a <i>BatchWriteItem</i> operation.</p>
   */
  @js.native
  trait BatchWriteItemInput extends js.Object {
    var RequestItems: BatchWriteItemRequestMap
    var ReturnConsumedCapacity: ReturnConsumedCapacity
    var ReturnItemCollectionMetrics: ReturnItemCollectionMetrics
  }

  object BatchWriteItemInput {
    def apply(
      RequestItems: js.UndefOr[BatchWriteItemRequestMap] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
      ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined
    ): BatchWriteItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RequestItems" -> RequestItems.map { x => x: js.Any }),
        ("ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x: js.Any }),
        ("ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteItemInput]
    }
  }

  /**
   * <p>Represents the output of a <i>BatchWriteItem</i> operation.</p>
   */
  @js.native
  trait BatchWriteItemOutput extends js.Object {
    var UnprocessedItems: BatchWriteItemRequestMap
    var ItemCollectionMetrics: ItemCollectionMetricsPerTable
    var ConsumedCapacity: ConsumedCapacityMultiple
  }

  object BatchWriteItemOutput {
    def apply(
      UnprocessedItems: js.UndefOr[BatchWriteItemRequestMap] = js.undefined,
      ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined
    ): BatchWriteItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UnprocessedItems" -> UnprocessedItems.map { x => x: js.Any }),
        ("ItemCollectionMetrics" -> ItemCollectionMetrics.map { x => x: js.Any }),
        ("ConsumedCapacity" -> ConsumedCapacity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteItemOutput]
    }
  }

  /**
   * <p>Represents the amount of provisioned throughput capacity consumed on a table or an index.</p>
   */
  @js.native
  trait Capacity extends js.Object {
    var CapacityUnits: ConsumedCapacityUnits
  }

  object Capacity {
    def apply(
      CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
    ): Capacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CapacityUnits" -> CapacityUnits.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Capacity]
    }
  }


  object ComparisonOperatorEnum {
    val EQ = "EQ"
    val NE = "NE"
    val IN = "IN"
    val LE = "LE"
    val LT = "LT"
    val GE = "GE"
    val GT = "GT"
    val BETWEEN = "BETWEEN"
    val `NOT_NULL` = "NOT_NULL"
    val NULL = "NULL"
    val CONTAINS = "CONTAINS"
    val `NOT_CONTAINS` = "NOT_CONTAINS"
    val `BEGINS_WITH` = "BEGINS_WITH"

    val values = IndexedSeq(EQ, NE, IN, LE, LT, GE, GT, BETWEEN, `NOT_NULL`, NULL, CONTAINS, `NOT_CONTAINS`, `BEGINS_WITH`)
  }

  /**
   * <p>Represents the selection criteria for a <i>Query</i> or <i>Scan</i> operation:</p> <ul> <li> <p>For a <i>Query</i> operation, <i>Condition</i> is used for specifying the <i>KeyConditions</i> to use when querying a table or an index. For <i>KeyConditions</i>, only the following comparison operators are supported:</p> <p> <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code> </p> <p> <i>Condition</i> is also used in a <i>QueryFilter</i>, which evaluates the query results and returns only the desired values.</p> </li> <li> <p>For a <i>Scan</i> operation, <i>Condition</i> is used in a <i>ScanFilter</i>, which evaluates the scan results and returns only the desired values.</p> </li> </ul>
   */
  @js.native
  trait Condition extends js.Object {
    var AttributeValueList: AttributeValueList
    var ComparisonOperator: ComparisonOperator
  }

  object Condition {
    def apply(
      AttributeValueList: js.UndefOr[AttributeValueList] = js.undefined,
      ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined
    ): Condition = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttributeValueList" -> AttributeValueList.map { x => x: js.Any }),
        ("ComparisonOperator" -> ComparisonOperator.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Condition]
    }
  }

  /**
   * <p>A condition specified in the operation could not be evaluated.</p>
   */
  @js.native
  trait ConditionalCheckFailedExceptionException extends js.Object {
    var message: ErrorMessage
  }


  object ConditionalOperatorEnum {
    val AND = "AND"
    val OR = "OR"

    val values = IndexedSeq(AND, OR)
  }

  /**
   * <p>The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <i>ConsumedCapacity</i> is only returned if the request asked for it. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
   */
  @js.native
  trait ConsumedCapacity extends js.Object {
    var LocalSecondaryIndexes: SecondaryIndexesCapacityMap
    var CapacityUnits: ConsumedCapacityUnits
    var GlobalSecondaryIndexes: SecondaryIndexesCapacityMap
    var Table: Capacity
    var TableName: TableName
  }

  object ConsumedCapacity {
    def apply(
      LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined,
      CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined,
      GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined,
      Table: js.UndefOr[Capacity] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined
    ): ConsumedCapacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LocalSecondaryIndexes" -> LocalSecondaryIndexes.map { x => x: js.Any }),
        ("CapacityUnits" -> CapacityUnits.map { x => x: js.Any }),
        ("GlobalSecondaryIndexes" -> GlobalSecondaryIndexes.map { x => x: js.Any }),
        ("Table" -> Table.map { x => x: js.Any }),
        ("TableName" -> TableName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConsumedCapacity]
    }
  }

  /**
   * <p>Represents a new global secondary index to be added to an existing table.</p>
   */
  @js.native
  trait CreateGlobalSecondaryIndexAction extends js.Object {
    var IndexName: IndexName
    var KeySchema: KeySchema
    var Projection: Projection
    var ProvisionedThroughput: ProvisionedThroughput
  }

  object CreateGlobalSecondaryIndexAction {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      Projection: js.UndefOr[Projection] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined
    ): CreateGlobalSecondaryIndexAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IndexName" -> IndexName.map { x => x: js.Any }),
        ("KeySchema" -> KeySchema.map { x => x: js.Any }),
        ("Projection" -> Projection.map { x => x: js.Any }),
        ("ProvisionedThroughput" -> ProvisionedThroughput.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGlobalSecondaryIndexAction]
    }
  }

  /**
   * <p>Represents the input of a <i>CreateTable</i> operation.</p>
   */
  @js.native
  trait CreateTableInput extends js.Object {
    var StreamSpecification: StreamSpecification
    var LocalSecondaryIndexes: LocalSecondaryIndexList
    var ProvisionedThroughput: ProvisionedThroughput
    var AttributeDefinitions: AttributeDefinitions
    var GlobalSecondaryIndexes: GlobalSecondaryIndexList
    var KeySchema: KeySchema
    var TableName: TableName
  }

  object CreateTableInput {
    def apply(
      StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined,
      LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexList] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined,
      AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined,
      GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexList] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined
    ): CreateTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamSpecification" -> StreamSpecification.map { x => x: js.Any }),
        ("LocalSecondaryIndexes" -> LocalSecondaryIndexes.map { x => x: js.Any }),
        ("ProvisionedThroughput" -> ProvisionedThroughput.map { x => x: js.Any }),
        ("AttributeDefinitions" -> AttributeDefinitions.map { x => x: js.Any }),
        ("GlobalSecondaryIndexes" -> GlobalSecondaryIndexes.map { x => x: js.Any }),
        ("KeySchema" -> KeySchema.map { x => x: js.Any }),
        ("TableName" -> TableName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTableInput]
    }
  }

  /**
   * <p>Represents the output of a <i>CreateTable</i> operation.</p>
   */
  @js.native
  trait CreateTableOutput extends js.Object {
    var TableDescription: TableDescription
  }

  object CreateTableOutput {
    def apply(
      TableDescription: js.UndefOr[TableDescription] = js.undefined
    ): CreateTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TableDescription" -> TableDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTableOutput]
    }
  }

  /**
   * <p>Represents a global secondary index to be deleted from an existing table.</p>
   */
  @js.native
  trait DeleteGlobalSecondaryIndexAction extends js.Object {
    var IndexName: IndexName
  }

  object DeleteGlobalSecondaryIndexAction {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined
    ): DeleteGlobalSecondaryIndexAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IndexName" -> IndexName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGlobalSecondaryIndexAction]
    }
  }

  /**
   * <p>Represents the input of a <i>DeleteItem</i> operation.</p>
   */
  @js.native
  trait DeleteItemInput extends js.Object {
    var ConditionalOperator: ConditionalOperator
    var Expected: ExpectedAttributeMap
    var ExpressionAttributeValues: ExpressionAttributeValueMap
    var ReturnItemCollectionMetrics: ReturnItemCollectionMetrics
    var ReturnValues: ReturnValue
    var ConditionExpression: ConditionExpression
    var ReturnConsumedCapacity: ReturnConsumedCapacity
    var ExpressionAttributeNames: ExpressionAttributeNameMap
    var TableName: TableName
    var Key: Key
  }

  object DeleteItemInput {
    def apply(
      ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined,
      Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined,
      ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
      ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined,
      ReturnValues: js.UndefOr[ReturnValue] = js.undefined,
      ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined,
      Key: js.UndefOr[Key] = js.undefined
    ): DeleteItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConditionalOperator" -> ConditionalOperator.map { x => x: js.Any }),
        ("Expected" -> Expected.map { x => x: js.Any }),
        ("ExpressionAttributeValues" -> ExpressionAttributeValues.map { x => x: js.Any }),
        ("ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x => x: js.Any }),
        ("ReturnValues" -> ReturnValues.map { x => x: js.Any }),
        ("ConditionExpression" -> ConditionExpression.map { x => x: js.Any }),
        ("ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x: js.Any }),
        ("ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x: js.Any }),
        ("TableName" -> TableName.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteItemInput]
    }
  }

  /**
   * <p>Represents the output of a <i>DeleteItem</i> operation.</p>
   */
  @js.native
  trait DeleteItemOutput extends js.Object {
    var Attributes: AttributeMap
    var ConsumedCapacity: ConsumedCapacity
    var ItemCollectionMetrics: ItemCollectionMetrics
  }

  object DeleteItemOutput {
    def apply(
      Attributes: js.UndefOr[AttributeMap] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
      ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics] = js.undefined
    ): DeleteItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("ConsumedCapacity" -> ConsumedCapacity.map { x => x: js.Any }),
        ("ItemCollectionMetrics" -> ItemCollectionMetrics.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteItemOutput]
    }
  }

  /**
   * <p>Represents a request to perform a <i>DeleteItem</i> operation on an item.</p>
   */
  @js.native
  trait DeleteRequest extends js.Object {
    var Key: Key
  }

  object DeleteRequest {
    def apply(
      Key: js.UndefOr[Key] = js.undefined
    ): DeleteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRequest]
    }
  }

  /**
   * <p>Represents the input of a <i>DeleteTable</i> operation.</p>
   */
  @js.native
  trait DeleteTableInput extends js.Object {
    var TableName: TableName
  }

  object DeleteTableInput {
    def apply(
      TableName: js.UndefOr[TableName] = js.undefined
    ): DeleteTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TableName" -> TableName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTableInput]
    }
  }

  /**
   * <p>Represents the output of a <i>DeleteTable</i> operation.</p>
   */
  @js.native
  trait DeleteTableOutput extends js.Object {
    var TableDescription: TableDescription
  }

  object DeleteTableOutput {
    def apply(
      TableDescription: js.UndefOr[TableDescription] = js.undefined
    ): DeleteTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TableDescription" -> TableDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTableOutput]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeLimits</i> operation. Has no content.</p>
   */
  @js.native
  trait DescribeLimitsInput extends js.Object {

  }

  object DescribeLimitsInput {
    def apply(

    ): DescribeLimitsInput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLimitsInput]
    }
  }

  /**
   * <p>Represents the output of a <i>DescribeLimits</i> operation.</p>
   */
  @js.native
  trait DescribeLimitsOutput extends js.Object {
    var AccountMaxReadCapacityUnits: PositiveLongObject
    var AccountMaxWriteCapacityUnits: PositiveLongObject
    var TableMaxReadCapacityUnits: PositiveLongObject
    var TableMaxWriteCapacityUnits: PositiveLongObject
  }

  object DescribeLimitsOutput {
    def apply(
      AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    ): DescribeLimitsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccountMaxReadCapacityUnits" -> AccountMaxReadCapacityUnits.map { x => x: js.Any }),
        ("AccountMaxWriteCapacityUnits" -> AccountMaxWriteCapacityUnits.map { x => x: js.Any }),
        ("TableMaxReadCapacityUnits" -> TableMaxReadCapacityUnits.map { x => x: js.Any }),
        ("TableMaxWriteCapacityUnits" -> TableMaxWriteCapacityUnits.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLimitsOutput]
    }
  }

  /**
   * <p>Represents the input of a <i>DescribeTable</i> operation.</p>
   */
  @js.native
  trait DescribeTableInput extends js.Object {
    var TableName: TableName
  }

  object DescribeTableInput {
    def apply(
      TableName: js.UndefOr[TableName] = js.undefined
    ): DescribeTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TableName" -> TableName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTableInput]
    }
  }

  /**
   * <p>Represents the output of a <i>DescribeTable</i> operation.</p>
   */
  @js.native
  trait DescribeTableOutput extends js.Object {
    var Table: TableDescription
  }

  object DescribeTableOutput {
    def apply(
      Table: js.UndefOr[TableDescription] = js.undefined
    ): DescribeTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Table" -> Table.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTableOutput]
    }
  }

  /**
   * <p>Represents a condition to be compared with an attribute value. This condition can be used with <i>DeleteItem</i>, <i>PutItem</i> or <i>UpdateItem</i> operations; if the comparison evaluates to true, the operation succeeds; if not, the operation fails. You can use <i>ExpectedAttributeValue</i> in one of two different ways:</p> <ul> <li> <p>Use <i>AttributeValueList</i> to specify one or more values to compare against an attribute. Use <i>ComparisonOperator</i> to specify how you want to perform the comparison. If the comparison evaluates to true, then the conditional operation succeeds.</p> </li> <li> <p>Use <i>Value</i> to specify a value that DynamoDB will compare against an attribute. If the values match, then <i>ExpectedAttributeValue</i> evaluates to true and the conditional operation succeeds. Optionally, you can also set <i>Exists</i> to false, indicating that you <i>do not</i> expect to find the attribute value in the table. In this case, the conditional operation succeeds only if the comparison evaluates to false.</p> </li> </ul> <p> <i>Value</i> and <i>Exists</i> are incompatible with <i>AttributeValueList</i> and <i>ComparisonOperator</i>. Note that if you use both sets of parameters at once, DynamoDB will return a <i>ValidationException</i> exception.</p>
   */
  @js.native
  trait ExpectedAttributeValue extends js.Object {
    var Value: AttributeValue
    var Exists: BooleanObject
    var ComparisonOperator: ComparisonOperator
    var AttributeValueList: AttributeValueList
  }

  object ExpectedAttributeValue {
    def apply(
      Value: js.UndefOr[AttributeValue] = js.undefined,
      Exists: js.UndefOr[BooleanObject] = js.undefined,
      ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
      AttributeValueList: js.UndefOr[AttributeValueList] = js.undefined
    ): ExpectedAttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Value" -> Value.map { x => x: js.Any }),
        ("Exists" -> Exists.map { x => x: js.Any }),
        ("ComparisonOperator" -> ComparisonOperator.map { x => x: js.Any }),
        ("AttributeValueList" -> AttributeValueList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExpectedAttributeValue]
    }
  }

  /**
   * <p>Represents the input of a <i>GetItem</i> operation.</p>
   */
  @js.native
  trait GetItemInput extends js.Object {
    var AttributesToGet: AttributeNameList
    var ReturnConsumedCapacity: ReturnConsumedCapacity
    var ExpressionAttributeNames: ExpressionAttributeNameMap
    var ConsistentRead: ConsistentRead
    var ProjectionExpression: ProjectionExpression
    var TableName: TableName
    var Key: Key
  }

  object GetItemInput {
    def apply(
      AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
      ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined,
      ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined,
      Key: js.UndefOr[Key] = js.undefined
    ): GetItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttributesToGet" -> AttributesToGet.map { x => x: js.Any }),
        ("ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x: js.Any }),
        ("ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x: js.Any }),
        ("ConsistentRead" -> ConsistentRead.map { x => x: js.Any }),
        ("ProjectionExpression" -> ProjectionExpression.map { x => x: js.Any }),
        ("TableName" -> TableName.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetItemInput]
    }
  }

  /**
   * <p>Represents the output of a <i>GetItem</i> operation.</p>
   */
  @js.native
  trait GetItemOutput extends js.Object {
    var Item: AttributeMap
    var ConsumedCapacity: ConsumedCapacity
  }

  object GetItemOutput {
    def apply(
      Item: js.UndefOr[AttributeMap] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined
    ): GetItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Item" -> Item.map { x => x: js.Any }),
        ("ConsumedCapacity" -> ConsumedCapacity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetItemOutput]
    }
  }

  /**
   * <p>Represents the properties of a global secondary index.</p>
   */
  @js.native
  trait GlobalSecondaryIndex extends js.Object {
    var IndexName: IndexName
    var KeySchema: KeySchema
    var Projection: Projection
    var ProvisionedThroughput: ProvisionedThroughput
  }

  object GlobalSecondaryIndex {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      Projection: js.UndefOr[Projection] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined
    ): GlobalSecondaryIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IndexName" -> IndexName.map { x => x: js.Any }),
        ("KeySchema" -> KeySchema.map { x => x: js.Any }),
        ("Projection" -> Projection.map { x => x: js.Any }),
        ("ProvisionedThroughput" -> ProvisionedThroughput.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSecondaryIndex]
    }
  }

  /**
   * <p>Represents the properties of a global secondary index.</p>
   */
  @js.native
  trait GlobalSecondaryIndexDescription extends js.Object {
    var Backfilling: Backfilling
    var ProvisionedThroughput: ProvisionedThroughputDescription
    var IndexArn: String
    var ItemCount: Long
    var IndexSizeBytes: Long
    var KeySchema: KeySchema
    var IndexStatus: IndexStatus
    var IndexName: IndexName
    var Projection: Projection
  }

  object GlobalSecondaryIndexDescription {
    def apply(
      Backfilling: js.UndefOr[Backfilling] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined,
      IndexArn: js.UndefOr[String] = js.undefined,
      ItemCount: js.UndefOr[Long] = js.undefined,
      IndexSizeBytes: js.UndefOr[Long] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      IndexStatus: js.UndefOr[IndexStatus] = js.undefined,
      IndexName: js.UndefOr[IndexName] = js.undefined,
      Projection: js.UndefOr[Projection] = js.undefined
    ): GlobalSecondaryIndexDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Backfilling" -> Backfilling.map { x => x: js.Any }),
        ("ProvisionedThroughput" -> ProvisionedThroughput.map { x => x: js.Any }),
        ("IndexArn" -> IndexArn.map { x => x: js.Any }),
        ("ItemCount" -> ItemCount.map { x => x: js.Any }),
        ("IndexSizeBytes" -> IndexSizeBytes.map { x => x: js.Any }),
        ("KeySchema" -> KeySchema.map { x => x: js.Any }),
        ("IndexStatus" -> IndexStatus.map { x => x: js.Any }),
        ("IndexName" -> IndexName.map { x => x: js.Any }),
        ("Projection" -> Projection.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSecondaryIndexDescription]
    }
  }

  /**
   * <p>Represents one of the following:</p> <ul> <li> <p>A new global secondary index to be added to an existing table.</p> </li> <li> <p>New provisioned throughput parameters for an existing global secondary index.</p> </li> <li> <p>An existing global secondary index to be removed from an existing table.</p> </li> </ul>
   */
  @js.native
  trait GlobalSecondaryIndexUpdate extends js.Object {
    var Update: UpdateGlobalSecondaryIndexAction
    var Create: CreateGlobalSecondaryIndexAction
    var Delete: DeleteGlobalSecondaryIndexAction
  }

  object GlobalSecondaryIndexUpdate {
    def apply(
      Update: js.UndefOr[UpdateGlobalSecondaryIndexAction] = js.undefined,
      Create: js.UndefOr[CreateGlobalSecondaryIndexAction] = js.undefined,
      Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction] = js.undefined
    ): GlobalSecondaryIndexUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Update" -> Update.map { x => x: js.Any }),
        ("Create" -> Create.map { x => x: js.Any }),
        ("Delete" -> Delete.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSecondaryIndexUpdate]
    }
  }


  object IndexStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val ACTIVE = "ACTIVE"

    val values = IndexedSeq(CREATING, UPDATING, DELETING, ACTIVE)
  }

  /**
   * <p>An error occurred on the server side.</p>
   */
  @js.native
  trait InternalServerErrorException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Information about item collections, if any, that were affected by the operation. <i>ItemCollectionMetrics</i> is only returned if the request asked for it. If the table does not have any local secondary indexes, this information is not returned in the response.</p>
   */
  @js.native
  trait ItemCollectionMetrics extends js.Object {
    var ItemCollectionKey: ItemCollectionKeyAttributeMap
    var SizeEstimateRangeGB: ItemCollectionSizeEstimateRange
  }

  object ItemCollectionMetrics {
    def apply(
      ItemCollectionKey: js.UndefOr[ItemCollectionKeyAttributeMap] = js.undefined,
      SizeEstimateRangeGB: js.UndefOr[ItemCollectionSizeEstimateRange] = js.undefined
    ): ItemCollectionMetrics = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ItemCollectionKey" -> ItemCollectionKey.map { x => x: js.Any }),
        ("SizeEstimateRangeGB" -> SizeEstimateRangeGB.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ItemCollectionMetrics]
    }
  }

  /**
   * <p>An item collection is too large. This exception is only returned for tables that have one or more local secondary indexes.</p>
   */
  @js.native
  trait ItemCollectionSizeLimitExceededExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Represents <i>a single element</i> of a key schema. A key schema specifies the attributes that make up the primary key of a table, or the key attributes of an index.</p> <p>A <i>KeySchemaElement</i> represents exactly one attribute of the primary key. For example, a simple primary key would be represented by one <i>KeySchemaElement</i> (for the partition key). A composite primary key would require one <i>KeySchemaElement</i> for the partition key, and another <i>KeySchemaElement</i> for the sort key.</p> <p>A <i>KeySchemaElement</i> must be a scalar, top-level attribute (not a nested attribute). The data type must be one of String, Number, or Binary. The attribute cannot be nested within a List or a Map.</p>
   */
  @js.native
  trait KeySchemaElement extends js.Object {
    var AttributeName: KeySchemaAttributeName
    var KeyType: KeyType
  }

  object KeySchemaElement {
    def apply(
      AttributeName: js.UndefOr[KeySchemaAttributeName] = js.undefined,
      KeyType: js.UndefOr[KeyType] = js.undefined
    ): KeySchemaElement = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttributeName" -> AttributeName.map { x => x: js.Any }),
        ("KeyType" -> KeyType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeySchemaElement]
    }
  }


  object KeyTypeEnum {
    val HASH = "HASH"
    val RANGE = "RANGE"

    val values = IndexedSeq(HASH, RANGE)
  }

  /**
   * <p>Represents a set of primary keys and, for each key, the attributes to retrieve from the table.</p> <p>For each primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary key, you only need to provide the partition key. For a composite primary key, you must provide <i>both</i> the partition key and the sort key.</p>
   */
  @js.native
  trait KeysAndAttributes extends js.Object {
    var Keys: KeyList
    var AttributesToGet: AttributeNameList
    var ExpressionAttributeNames: ExpressionAttributeNameMap
    var ConsistentRead: ConsistentRead
    var ProjectionExpression: ProjectionExpression
  }

  object KeysAndAttributes {
    def apply(
      Keys: js.UndefOr[KeyList] = js.undefined,
      AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
      ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined,
      ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined
    ): KeysAndAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Keys" -> Keys.map { x => x: js.Any }),
        ("AttributesToGet" -> AttributesToGet.map { x => x: js.Any }),
        ("ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x: js.Any }),
        ("ConsistentRead" -> ConsistentRead.map { x => x: js.Any }),
        ("ProjectionExpression" -> ProjectionExpression.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeysAndAttributes]
    }
  }

  /**
   * <p>The number of concurrent table requests (cumulative number of tables in the <code>CREATING</code>, <code>DELETING</code> or <code>UPDATING</code> state) exceeds the maximum allowed of 10.</p> <p>Also, for tables with secondary indexes, only one of those tables can be in the <code>CREATING</code> state at any point in time. Do not attempt to create more than one such table simultaneously.</p> <p>The total limit of tables in the <code>ACTIVE</code> state is 250.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Represents the input of a <i>ListTables</i> operation.</p>
   */
  @js.native
  trait ListTablesInput extends js.Object {
    var ExclusiveStartTableName: TableName
    var Limit: ListTablesInputLimit
  }

  object ListTablesInput {
    def apply(
      ExclusiveStartTableName: js.UndefOr[TableName] = js.undefined,
      Limit: js.UndefOr[ListTablesInputLimit] = js.undefined
    ): ListTablesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExclusiveStartTableName" -> ExclusiveStartTableName.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTablesInput]
    }
  }

  /**
   * <p>Represents the output of a <i>ListTables</i> operation.</p>
   */
  @js.native
  trait ListTablesOutput extends js.Object {
    var TableNames: TableNameList
    var LastEvaluatedTableName: TableName
  }

  object ListTablesOutput {
    def apply(
      TableNames: js.UndefOr[TableNameList] = js.undefined,
      LastEvaluatedTableName: js.UndefOr[TableName] = js.undefined
    ): ListTablesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TableNames" -> TableNames.map { x => x: js.Any }),
        ("LastEvaluatedTableName" -> LastEvaluatedTableName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTablesOutput]
    }
  }

  /**
   * <p>Represents the properties of a local secondary index.</p>
   */
  @js.native
  trait LocalSecondaryIndex extends js.Object {
    var IndexName: IndexName
    var KeySchema: KeySchema
    var Projection: Projection
  }

  object LocalSecondaryIndex {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      Projection: js.UndefOr[Projection] = js.undefined
    ): LocalSecondaryIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IndexName" -> IndexName.map { x => x: js.Any }),
        ("KeySchema" -> KeySchema.map { x => x: js.Any }),
        ("Projection" -> Projection.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocalSecondaryIndex]
    }
  }

  /**
   * <p>Represents the properties of a local secondary index.</p>
   */
  @js.native
  trait LocalSecondaryIndexDescription extends js.Object {
    var IndexArn: String
    var ItemCount: Long
    var IndexSizeBytes: Long
    var KeySchema: KeySchema
    var IndexName: IndexName
    var Projection: Projection
  }

  object LocalSecondaryIndexDescription {
    def apply(
      IndexArn: js.UndefOr[String] = js.undefined,
      ItemCount: js.UndefOr[Long] = js.undefined,
      IndexSizeBytes: js.UndefOr[Long] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      IndexName: js.UndefOr[IndexName] = js.undefined,
      Projection: js.UndefOr[Projection] = js.undefined
    ): LocalSecondaryIndexDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IndexArn" -> IndexArn.map { x => x: js.Any }),
        ("ItemCount" -> ItemCount.map { x => x: js.Any }),
        ("IndexSizeBytes" -> IndexSizeBytes.map { x => x: js.Any }),
        ("KeySchema" -> KeySchema.map { x => x: js.Any }),
        ("IndexName" -> IndexName.map { x => x: js.Any }),
        ("Projection" -> Projection.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocalSecondaryIndexDescription]
    }
  }

  /**
   * <p>Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.</p>
   */
  @js.native
  trait Projection extends js.Object {
    var ProjectionType: ProjectionType
    var NonKeyAttributes: NonKeyAttributeNameList
  }

  object Projection {
    def apply(
      ProjectionType: js.UndefOr[ProjectionType] = js.undefined,
      NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList] = js.undefined
    ): Projection = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ProjectionType" -> ProjectionType.map { x => x: js.Any }),
        ("NonKeyAttributes" -> NonKeyAttributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Projection]
    }
  }


  object ProjectionTypeEnum {
    val ALL = "ALL"
    val `KEYS_ONLY` = "KEYS_ONLY"
    val INCLUDE = "INCLUDE"

    val values = IndexedSeq(ALL, `KEYS_ONLY`, INCLUDE)
  }

  /**
   * <p>Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the <i>UpdateTable</i> operation.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
   */
  @js.native
  trait ProvisionedThroughput extends js.Object {
    var ReadCapacityUnits: PositiveLongObject
    var WriteCapacityUnits: PositiveLongObject
  }

  object ProvisionedThroughput {
    def apply(
      ReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      WriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    ): ProvisionedThroughput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReadCapacityUnits" -> ReadCapacityUnits.map { x => x: js.Any }),
        ("WriteCapacityUnits" -> WriteCapacityUnits.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedThroughput]
    }
  }

  /**
   * <p>Represents the provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.</p>
   */
  @js.native
  trait ProvisionedThroughputDescription extends js.Object {
    var LastIncreaseDateTime: Date
    var ReadCapacityUnits: PositiveLongObject
    var WriteCapacityUnits: PositiveLongObject
    var LastDecreaseDateTime: Date
    var NumberOfDecreasesToday: PositiveLongObject
  }

  object ProvisionedThroughputDescription {
    def apply(
      LastIncreaseDateTime: js.UndefOr[Date] = js.undefined,
      ReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      WriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      LastDecreaseDateTime: js.UndefOr[Date] = js.undefined,
      NumberOfDecreasesToday: js.UndefOr[PositiveLongObject] = js.undefined
    ): ProvisionedThroughputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastIncreaseDateTime" -> LastIncreaseDateTime.map { x => x: js.Any }),
        ("ReadCapacityUnits" -> ReadCapacityUnits.map { x => x: js.Any }),
        ("WriteCapacityUnits" -> WriteCapacityUnits.map { x => x: js.Any }),
        ("LastDecreaseDateTime" -> LastDecreaseDateTime.map { x => x: js.Any }),
        ("NumberOfDecreasesToday" -> NumberOfDecreasesToday.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedThroughputDescription]
    }
  }

  /**
   * <p>Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of requests and use exponential backoff. For more information, go to <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries">Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
   */
  @js.native
  trait ProvisionedThroughputExceededExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Represents the input of a <i>PutItem</i> operation.</p>
   */
  @js.native
  trait PutItemInput extends js.Object {
    var ConditionalOperator: ConditionalOperator
    var Expected: ExpectedAttributeMap
    var ExpressionAttributeValues: ExpressionAttributeValueMap
    var ReturnItemCollectionMetrics: ReturnItemCollectionMetrics
    var ReturnValues: ReturnValue
    var Item: PutItemInputAttributeMap
    var ConditionExpression: ConditionExpression
    var ReturnConsumedCapacity: ReturnConsumedCapacity
    var ExpressionAttributeNames: ExpressionAttributeNameMap
    var TableName: TableName
  }

  object PutItemInput {
    def apply(
      ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined,
      Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined,
      ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
      ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined,
      ReturnValues: js.UndefOr[ReturnValue] = js.undefined,
      Item: js.UndefOr[PutItemInputAttributeMap] = js.undefined,
      ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined
    ): PutItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConditionalOperator" -> ConditionalOperator.map { x => x: js.Any }),
        ("Expected" -> Expected.map { x => x: js.Any }),
        ("ExpressionAttributeValues" -> ExpressionAttributeValues.map { x => x: js.Any }),
        ("ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x => x: js.Any }),
        ("ReturnValues" -> ReturnValues.map { x => x: js.Any }),
        ("Item" -> Item.map { x => x: js.Any }),
        ("ConditionExpression" -> ConditionExpression.map { x => x: js.Any }),
        ("ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x: js.Any }),
        ("ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x: js.Any }),
        ("TableName" -> TableName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutItemInput]
    }
  }

  /**
   * <p>Represents the output of a <i>PutItem</i> operation.</p>
   */
  @js.native
  trait PutItemOutput extends js.Object {
    var Attributes: AttributeMap
    var ConsumedCapacity: ConsumedCapacity
    var ItemCollectionMetrics: ItemCollectionMetrics
  }

  object PutItemOutput {
    def apply(
      Attributes: js.UndefOr[AttributeMap] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
      ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics] = js.undefined
    ): PutItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("ConsumedCapacity" -> ConsumedCapacity.map { x => x: js.Any }),
        ("ItemCollectionMetrics" -> ItemCollectionMetrics.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutItemOutput]
    }
  }

  /**
   * <p>Represents a request to perform a <i>PutItem</i> operation on an item.</p>
   */
  @js.native
  trait PutRequest extends js.Object {
    var Item: PutItemInputAttributeMap
  }

  object PutRequest {
    def apply(
      Item: js.UndefOr[PutItemInputAttributeMap] = js.undefined
    ): PutRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Item" -> Item.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRequest]
    }
  }

  /**
   * <p>Represents the input of a <i>Query</i> operation.</p>
   */
  @js.native
  trait QueryInput extends js.Object {
    var ExclusiveStartKey: Key
    var ConditionalOperator: ConditionalOperator
    var ExpressionAttributeValues: ExpressionAttributeValueMap
    var QueryFilter: FilterConditionMap
    var KeyConditionExpression: KeyExpression
    var KeyConditions: KeyConditions
    var Limit: PositiveIntegerObject
    var FilterExpression: ConditionExpression
    var AttributesToGet: AttributeNameList
    var ScanIndexForward: BooleanObject
    var Select: Select
    var ReturnConsumedCapacity: ReturnConsumedCapacity
    var ExpressionAttributeNames: ExpressionAttributeNameMap
    var ConsistentRead: ConsistentRead
    var ProjectionExpression: ProjectionExpression
    var TableName: TableName
    var IndexName: IndexName
  }

  object QueryInput {
    def apply(
      ExclusiveStartKey: js.UndefOr[Key] = js.undefined,
      ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined,
      ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
      QueryFilter: js.UndefOr[FilterConditionMap] = js.undefined,
      KeyConditionExpression: js.UndefOr[KeyExpression] = js.undefined,
      KeyConditions: js.UndefOr[KeyConditions] = js.undefined,
      Limit: js.UndefOr[PositiveIntegerObject] = js.undefined,
      FilterExpression: js.UndefOr[ConditionExpression] = js.undefined,
      AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined,
      ScanIndexForward: js.UndefOr[BooleanObject] = js.undefined,
      Select: js.UndefOr[Select] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
      ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined,
      ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined,
      IndexName: js.UndefOr[IndexName] = js.undefined
    ): QueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExclusiveStartKey" -> ExclusiveStartKey.map { x => x: js.Any }),
        ("ConditionalOperator" -> ConditionalOperator.map { x => x: js.Any }),
        ("ExpressionAttributeValues" -> ExpressionAttributeValues.map { x => x: js.Any }),
        ("QueryFilter" -> QueryFilter.map { x => x: js.Any }),
        ("KeyConditionExpression" -> KeyConditionExpression.map { x => x: js.Any }),
        ("KeyConditions" -> KeyConditions.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("FilterExpression" -> FilterExpression.map { x => x: js.Any }),
        ("AttributesToGet" -> AttributesToGet.map { x => x: js.Any }),
        ("ScanIndexForward" -> ScanIndexForward.map { x => x: js.Any }),
        ("Select" -> Select.map { x => x: js.Any }),
        ("ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x: js.Any }),
        ("ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x: js.Any }),
        ("ConsistentRead" -> ConsistentRead.map { x => x: js.Any }),
        ("ProjectionExpression" -> ProjectionExpression.map { x => x: js.Any }),
        ("TableName" -> TableName.map { x => x: js.Any }),
        ("IndexName" -> IndexName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryInput]
    }
  }

  /**
   * <p>Represents the output of a <i>Query</i> operation.</p>
   */
  @js.native
  trait QueryOutput extends js.Object {
    var LastEvaluatedKey: Key
    var ConsumedCapacity: ConsumedCapacity
    var Count: Integer
    var ScannedCount: Integer
    var Items: ItemList
  }

  object QueryOutput {
    def apply(
      LastEvaluatedKey: js.UndefOr[Key] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
      Count: js.UndefOr[Integer] = js.undefined,
      ScannedCount: js.UndefOr[Integer] = js.undefined,
      Items: js.UndefOr[ItemList] = js.undefined
    ): QueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastEvaluatedKey" -> LastEvaluatedKey.map { x => x: js.Any }),
        ("ConsumedCapacity" -> ConsumedCapacity.map { x => x: js.Any }),
        ("Count" -> Count.map { x => x: js.Any }),
        ("ScannedCount" -> ScannedCount.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryOutput]
    }
  }

  /**
   * <p>The operation conflicts with the resource's availability. For example, you attempted to recreate an existing table, or tried to delete a table currently in the <code>CREATING</code> state.</p>
   */
  @js.native
  trait ResourceInUseExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The operation tried to access a nonexistent table or index. The resource might not be specified correctly, or its status might not be <code>ACTIVE</code>.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Determines the level of detail about provisioned throughput consumption that is returned in the response:</p> <ul> <li> <p> <i>INDEXES</i> - The response includes the aggregate <i>ConsumedCapacity</i> for the operation, together with <i>ConsumedCapacity</i> for each table and secondary index that was accessed.</p> <p>Note that some operations, such as <i>GetItem</i> and <i>BatchGetItem</i>, do not access any indexes at all. In these cases, specifying <i>INDEXES</i> will only return <i>ConsumedCapacity</i> information for table(s).</p> </li> <li> <p> <i>TOTAL</i> - The response includes only the aggregate <i>ConsumedCapacity</i> for the operation.</p> </li> <li> <p> <i>NONE</i> - No <i>ConsumedCapacity</i> details are included in the response.</p> </li> </ul>
   */
  object ReturnConsumedCapacityEnum {
    val INDEXES = "INDEXES"
    val TOTAL = "TOTAL"
    val NONE = "NONE"

    val values = IndexedSeq(INDEXES, TOTAL, NONE)
  }


  object ReturnItemCollectionMetricsEnum {
    val SIZE = "SIZE"
    val NONE = "NONE"

    val values = IndexedSeq(SIZE, NONE)
  }


  object ReturnValueEnum {
    val NONE = "NONE"
    val `ALL_OLD` = "ALL_OLD"
    val `UPDATED_OLD` = "UPDATED_OLD"
    val `ALL_NEW` = "ALL_NEW"
    val `UPDATED_NEW` = "UPDATED_NEW"

    val values = IndexedSeq(NONE, `ALL_OLD`, `UPDATED_OLD`, `ALL_NEW`, `UPDATED_NEW`)
  }


  object ScalarAttributeTypeEnum {
    val S = "S"
    val N = "N"
    val B = "B"

    val values = IndexedSeq(S, N, B)
  }

  /**
   * <p>Represents the input of a <i>Scan</i> operation.</p>
   */
  @js.native
  trait ScanInput extends js.Object {
    var ExclusiveStartKey: Key
    var ConditionalOperator: ConditionalOperator
    var ExpressionAttributeValues: ExpressionAttributeValueMap
    var Limit: PositiveIntegerObject
    var FilterExpression: ConditionExpression
    var Segment: ScanSegment
    var AttributesToGet: AttributeNameList
    var TotalSegments: ScanTotalSegments
    var Select: Select
    var ReturnConsumedCapacity: ReturnConsumedCapacity
    var ExpressionAttributeNames: ExpressionAttributeNameMap
    var ConsistentRead: ConsistentRead
    var ProjectionExpression: ProjectionExpression
    var TableName: TableName
    var IndexName: IndexName
    var ScanFilter: FilterConditionMap
  }

  object ScanInput {
    def apply(
      ExclusiveStartKey: js.UndefOr[Key] = js.undefined,
      ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined,
      ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
      Limit: js.UndefOr[PositiveIntegerObject] = js.undefined,
      FilterExpression: js.UndefOr[ConditionExpression] = js.undefined,
      Segment: js.UndefOr[ScanSegment] = js.undefined,
      AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined,
      TotalSegments: js.UndefOr[ScanTotalSegments] = js.undefined,
      Select: js.UndefOr[Select] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
      ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined,
      ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined,
      IndexName: js.UndefOr[IndexName] = js.undefined,
      ScanFilter: js.UndefOr[FilterConditionMap] = js.undefined
    ): ScanInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExclusiveStartKey" -> ExclusiveStartKey.map { x => x: js.Any }),
        ("ConditionalOperator" -> ConditionalOperator.map { x => x: js.Any }),
        ("ExpressionAttributeValues" -> ExpressionAttributeValues.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("FilterExpression" -> FilterExpression.map { x => x: js.Any }),
        ("Segment" -> Segment.map { x => x: js.Any }),
        ("AttributesToGet" -> AttributesToGet.map { x => x: js.Any }),
        ("TotalSegments" -> TotalSegments.map { x => x: js.Any }),
        ("Select" -> Select.map { x => x: js.Any }),
        ("ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x: js.Any }),
        ("ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x: js.Any }),
        ("ConsistentRead" -> ConsistentRead.map { x => x: js.Any }),
        ("ProjectionExpression" -> ProjectionExpression.map { x => x: js.Any }),
        ("TableName" -> TableName.map { x => x: js.Any }),
        ("IndexName" -> IndexName.map { x => x: js.Any }),
        ("ScanFilter" -> ScanFilter.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScanInput]
    }
  }

  /**
   * <p>Represents the output of a <i>Scan</i> operation.</p>
   */
  @js.native
  trait ScanOutput extends js.Object {
    var LastEvaluatedKey: Key
    var ConsumedCapacity: ConsumedCapacity
    var Count: Integer
    var ScannedCount: Integer
    var Items: ItemList
  }

  object ScanOutput {
    def apply(
      LastEvaluatedKey: js.UndefOr[Key] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
      Count: js.UndefOr[Integer] = js.undefined,
      ScannedCount: js.UndefOr[Integer] = js.undefined,
      Items: js.UndefOr[ItemList] = js.undefined
    ): ScanOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastEvaluatedKey" -> LastEvaluatedKey.map { x => x: js.Any }),
        ("ConsumedCapacity" -> ConsumedCapacity.map { x => x: js.Any }),
        ("Count" -> Count.map { x => x: js.Any }),
        ("ScannedCount" -> ScannedCount.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScanOutput]
    }
  }


  object SelectEnum {
    val `ALL_ATTRIBUTES` = "ALL_ATTRIBUTES"
    val `ALL_PROJECTED_ATTRIBUTES` = "ALL_PROJECTED_ATTRIBUTES"
    val `SPECIFIC_ATTRIBUTES` = "SPECIFIC_ATTRIBUTES"
    val COUNT = "COUNT"

    val values = IndexedSeq(`ALL_ATTRIBUTES`, `ALL_PROJECTED_ATTRIBUTES`, `SPECIFIC_ATTRIBUTES`, COUNT)
  }

  /**
   * <p>Represents the DynamoDB Streams configuration for a table in DynamoDB.</p>
   */
  @js.native
  trait StreamSpecification extends js.Object {
    var StreamEnabled: StreamEnabled
    var StreamViewType: StreamViewType
  }

  object StreamSpecification {
    def apply(
      StreamEnabled: js.UndefOr[StreamEnabled] = js.undefined,
      StreamViewType: js.UndefOr[StreamViewType] = js.undefined
    ): StreamSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamEnabled" -> StreamEnabled.map { x => x: js.Any }),
        ("StreamViewType" -> StreamViewType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamSpecification]
    }
  }


  object StreamViewTypeEnum {
    val `NEW_IMAGE` = "NEW_IMAGE"
    val `OLD_IMAGE` = "OLD_IMAGE"
    val `NEW_AND_OLD_IMAGES` = "NEW_AND_OLD_IMAGES"
    val `KEYS_ONLY` = "KEYS_ONLY"

    val values = IndexedSeq(`NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`, `KEYS_ONLY`)
  }

  /**
   * <p>Represents the properties of a table.</p>
   */
  @js.native
  trait TableDescription extends js.Object {
    var StreamSpecification: StreamSpecification
    var LocalSecondaryIndexes: LocalSecondaryIndexDescriptionList
    var TableStatus: TableStatus
    var ProvisionedThroughput: ProvisionedThroughputDescription
    var LatestStreamLabel: String
    var AttributeDefinitions: AttributeDefinitions
    var TableArn: String
    var GlobalSecondaryIndexes: GlobalSecondaryIndexDescriptionList
    var CreationDateTime: Date
    var ItemCount: Long
    var LatestStreamArn: StreamArn
    var TableSizeBytes: Long
    var KeySchema: KeySchema
    var TableName: TableName
  }

  object TableDescription {
    def apply(
      StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined,
      LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexDescriptionList] = js.undefined,
      TableStatus: js.UndefOr[TableStatus] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined,
      LatestStreamLabel: js.UndefOr[String] = js.undefined,
      AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined,
      TableArn: js.UndefOr[String] = js.undefined,
      GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexDescriptionList] = js.undefined,
      CreationDateTime: js.UndefOr[Date] = js.undefined,
      ItemCount: js.UndefOr[Long] = js.undefined,
      LatestStreamArn: js.UndefOr[StreamArn] = js.undefined,
      TableSizeBytes: js.UndefOr[Long] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined
    ): TableDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamSpecification" -> StreamSpecification.map { x => x: js.Any }),
        ("LocalSecondaryIndexes" -> LocalSecondaryIndexes.map { x => x: js.Any }),
        ("TableStatus" -> TableStatus.map { x => x: js.Any }),
        ("ProvisionedThroughput" -> ProvisionedThroughput.map { x => x: js.Any }),
        ("LatestStreamLabel" -> LatestStreamLabel.map { x => x: js.Any }),
        ("AttributeDefinitions" -> AttributeDefinitions.map { x => x: js.Any }),
        ("TableArn" -> TableArn.map { x => x: js.Any }),
        ("GlobalSecondaryIndexes" -> GlobalSecondaryIndexes.map { x => x: js.Any }),
        ("CreationDateTime" -> CreationDateTime.map { x => x: js.Any }),
        ("ItemCount" -> ItemCount.map { x => x: js.Any }),
        ("LatestStreamArn" -> LatestStreamArn.map { x => x: js.Any }),
        ("TableSizeBytes" -> TableSizeBytes.map { x => x: js.Any }),
        ("KeySchema" -> KeySchema.map { x => x: js.Any }),
        ("TableName" -> TableName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TableDescription]
    }
  }


  object TableStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val ACTIVE = "ACTIVE"

    val values = IndexedSeq(CREATING, UPDATING, DELETING, ACTIVE)
  }

  /**
   * <p>Represents the new provisioned throughput settings to be applied to a global secondary index.</p>
   */
  @js.native
  trait UpdateGlobalSecondaryIndexAction extends js.Object {
    var IndexName: IndexName
    var ProvisionedThroughput: ProvisionedThroughput
  }

  object UpdateGlobalSecondaryIndexAction {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined
    ): UpdateGlobalSecondaryIndexAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IndexName" -> IndexName.map { x => x: js.Any }),
        ("ProvisionedThroughput" -> ProvisionedThroughput.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGlobalSecondaryIndexAction]
    }
  }

  /**
   * <p>Represents the input of an <i>UpdateItem</i> operation.</p>
   */
  @js.native
  trait UpdateItemInput extends js.Object {
    var ConditionalOperator: ConditionalOperator
    var UpdateExpression: UpdateExpression
    var Expected: ExpectedAttributeMap
    var ExpressionAttributeValues: ExpressionAttributeValueMap
    var ReturnItemCollectionMetrics: ReturnItemCollectionMetrics
    var ReturnValues: ReturnValue
    var AttributeUpdates: AttributeUpdates
    var ConditionExpression: ConditionExpression
    var ReturnConsumedCapacity: ReturnConsumedCapacity
    var ExpressionAttributeNames: ExpressionAttributeNameMap
    var TableName: TableName
    var Key: Key
  }

  object UpdateItemInput {
    def apply(
      ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined,
      UpdateExpression: js.UndefOr[UpdateExpression] = js.undefined,
      Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined,
      ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
      ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined,
      ReturnValues: js.UndefOr[ReturnValue] = js.undefined,
      AttributeUpdates: js.UndefOr[AttributeUpdates] = js.undefined,
      ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined,
      Key: js.UndefOr[Key] = js.undefined
    ): UpdateItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConditionalOperator" -> ConditionalOperator.map { x => x: js.Any }),
        ("UpdateExpression" -> UpdateExpression.map { x => x: js.Any }),
        ("Expected" -> Expected.map { x => x: js.Any }),
        ("ExpressionAttributeValues" -> ExpressionAttributeValues.map { x => x: js.Any }),
        ("ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x => x: js.Any }),
        ("ReturnValues" -> ReturnValues.map { x => x: js.Any }),
        ("AttributeUpdates" -> AttributeUpdates.map { x => x: js.Any }),
        ("ConditionExpression" -> ConditionExpression.map { x => x: js.Any }),
        ("ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x: js.Any }),
        ("ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x: js.Any }),
        ("TableName" -> TableName.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateItemInput]
    }
  }

  /**
   * <p>Represents the output of an <i>UpdateItem</i> operation.</p>
   */
  @js.native
  trait UpdateItemOutput extends js.Object {
    var Attributes: AttributeMap
    var ConsumedCapacity: ConsumedCapacity
    var ItemCollectionMetrics: ItemCollectionMetrics
  }

  object UpdateItemOutput {
    def apply(
      Attributes: js.UndefOr[AttributeMap] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
      ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics] = js.undefined
    ): UpdateItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("ConsumedCapacity" -> ConsumedCapacity.map { x => x: js.Any }),
        ("ItemCollectionMetrics" -> ItemCollectionMetrics.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateItemOutput]
    }
  }

  /**
   * <p>Represents the input of an <i>UpdateTable</i> operation.</p>
   */
  @js.native
  trait UpdateTableInput extends js.Object {
    var StreamSpecification: StreamSpecification
    var GlobalSecondaryIndexUpdates: GlobalSecondaryIndexUpdateList
    var ProvisionedThroughput: ProvisionedThroughput
    var AttributeDefinitions: AttributeDefinitions
    var TableName: TableName
  }

  object UpdateTableInput {
    def apply(
      StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined,
      GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexUpdateList] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined,
      AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined
    ): UpdateTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StreamSpecification" -> StreamSpecification.map { x => x: js.Any }),
        ("GlobalSecondaryIndexUpdates" -> GlobalSecondaryIndexUpdates.map { x => x: js.Any }),
        ("ProvisionedThroughput" -> ProvisionedThroughput.map { x => x: js.Any }),
        ("AttributeDefinitions" -> AttributeDefinitions.map { x => x: js.Any }),
        ("TableName" -> TableName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTableInput]
    }
  }

  /**
   * <p>Represents the output of an <i>UpdateTable</i> operation.</p>
   */
  @js.native
  trait UpdateTableOutput extends js.Object {
    var TableDescription: TableDescription
  }

  object UpdateTableOutput {
    def apply(
      TableDescription: js.UndefOr[TableDescription] = js.undefined
    ): UpdateTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TableDescription" -> TableDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTableOutput]
    }
  }

  /**
   * <p>Represents an operation to perform - either <i>DeleteItem</i> or <i>PutItem</i>. You can only request one of these operations, not both, in a single <i>WriteRequest</i>. If you do need to perform both of these operations, you will need to provide two separate <i>WriteRequest</i> objects.</p>
   */
  @js.native
  trait WriteRequest extends js.Object {
    var PutRequest: PutRequest
    var DeleteRequest: DeleteRequest
  }

  object WriteRequest {
    def apply(
      PutRequest: js.UndefOr[PutRequest] = js.undefined,
      DeleteRequest: js.UndefOr[DeleteRequest] = js.undefined
    ): WriteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PutRequest" -> PutRequest.map { x => x: js.Any }),
        ("DeleteRequest" -> DeleteRequest.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WriteRequest]
    }
  }
}
