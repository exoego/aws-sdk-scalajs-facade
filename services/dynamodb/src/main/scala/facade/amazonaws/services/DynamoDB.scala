package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object dynamodb {
  type ArchivalReason                                    = String
  type AttributeDefinitions                              = js.Array[AttributeDefinition]
  type AttributeMap                                      = js.Dictionary[AttributeValue]
  type AttributeName                                     = String
  type AttributeNameList                                 = js.Array[AttributeName]
  type AttributeUpdates                                  = js.Dictionary[AttributeValueUpdate]
  type AttributeValueList                                = js.Array[AttributeValue]
  type AutoScalingPolicyDescriptionList                  = js.Array[AutoScalingPolicyDescription]
  type AutoScalingPolicyName                             = String
  type AutoScalingRoleArn                                = String
  type Backfilling                                       = Boolean
  type BackupArn                                         = String
  type BackupCreationDateTime                            = js.Date
  type BackupName                                        = String
  type BackupSizeBytes                                   = Double
  type BackupSummaries                                   = js.Array[BackupSummary]
  type BackupsInputLimit                                 = Int
  type BatchGetRequestMap                                = js.Dictionary[KeysAndAttributes]
  type BatchGetResponseMap                               = js.Dictionary[ItemList]
  type BatchWriteItemRequestMap                          = js.Dictionary[WriteRequests]
  type BinaryAttributeValue                              = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BinarySetAttributeValue                           = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue                             = Boolean
  type BooleanObject                                     = Boolean
  type ClientRequestToken                                = String
  type ConditionExpression                               = String
  type ConsistentRead                                    = Boolean
  type ConsumedCapacityMultiple                          = js.Array[ConsumedCapacity]
  type ConsumedCapacityUnits                             = Double
  type ContributorInsightsRule                           = String
  type ContributorInsightsRuleList                       = js.Array[ContributorInsightsRule]
  type ContributorInsightsSummaries                      = js.Array[ContributorInsightsSummary]
  type Date                                              = js.Date
  type Endpoints                                         = js.Array[Endpoint]
  type ExceptionDescription                              = String
  type ExceptionName                                     = String
  type ExpectedAttributeMap                              = js.Dictionary[ExpectedAttributeValue]
  type ExpressionAttributeNameMap                        = js.Dictionary[AttributeName]
  type ExpressionAttributeNameVariable                   = String
  type ExpressionAttributeValueMap                       = js.Dictionary[AttributeValue]
  type ExpressionAttributeValueVariable                  = String
  type FilterConditionMap                                = js.Dictionary[Condition]
  type GlobalSecondaryIndexAutoScalingUpdateList         = js.Array[GlobalSecondaryIndexAutoScalingUpdate]
  type GlobalSecondaryIndexDescriptionList               = js.Array[GlobalSecondaryIndexDescription]
  type GlobalSecondaryIndexList                          = js.Array[GlobalSecondaryIndex]
  type GlobalSecondaryIndexUpdateList                    = js.Array[GlobalSecondaryIndexUpdate]
  type GlobalSecondaryIndexes                            = js.Array[GlobalSecondaryIndexInfo]
  type GlobalTableArnString                              = String
  type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  type GlobalTableList                                   = js.Array[GlobalTable]
  type IndexName                                         = String
  type IntegerObject                                     = Int
  type ItemCollectionKeyAttributeMap                     = js.Dictionary[AttributeValue]
  type ItemCollectionMetricsMultiple                     = js.Array[ItemCollectionMetrics]
  type ItemCollectionMetricsPerTable                     = js.Dictionary[ItemCollectionMetricsMultiple]
  type ItemCollectionSizeEstimateBound                   = Double
  type ItemCollectionSizeEstimateRange                   = js.Array[ItemCollectionSizeEstimateBound]
  type ItemCount                                         = Double
  type ItemList                                          = js.Array[AttributeMap]
  type ItemResponseList                                  = js.Array[ItemResponse]
  type KMSMasterKeyArn                                   = String
  type KMSMasterKeyId                                    = String
  type Key                                               = js.Dictionary[AttributeValue]
  type KeyConditions                                     = js.Dictionary[Condition]
  type KeyExpression                                     = String
  type KeyList                                           = js.Array[Key]
  type KeySchema                                         = js.Array[KeySchemaElement]
  type KeySchemaAttributeName                            = String
  type LastUpdateDateTime                                = js.Date
  type ListAttributeValue                                = js.Array[AttributeValue]
  type ListContributorInsightsLimit                      = Int
  type ListTablesInputLimit                              = Int
  type LocalSecondaryIndexDescriptionList                = js.Array[LocalSecondaryIndexDescription]
  type LocalSecondaryIndexList                           = js.Array[LocalSecondaryIndex]
  type LocalSecondaryIndexes                             = js.Array[LocalSecondaryIndexInfo]
  type MapAttributeValue                                 = js.Dictionary[AttributeValue]
  type NextTokenString                                   = String
  type NonKeyAttributeName                               = String
  type NonKeyAttributeNameList                           = js.Array[NonKeyAttributeName]
  type NonNegativeLongObject                             = Double
  type NullAttributeValue                                = Boolean
  type NumberAttributeValue                              = String
  type NumberSetAttributeValue                           = js.Array[NumberAttributeValue]
  type PositiveIntegerObject                             = Int
  type PositiveLongObject                                = Double
  type ProjectionExpression                              = String
  type PutItemInputAttributeMap                          = js.Dictionary[AttributeValue]
  type RegionName                                        = String
  type ReplicaAutoScalingDescriptionList                 = js.Array[ReplicaAutoScalingDescription]
  type ReplicaAutoScalingUpdateList                      = js.Array[ReplicaAutoScalingUpdate]
  type ReplicaDescriptionList                            = js.Array[ReplicaDescription]
  type ReplicaGlobalSecondaryIndexAutoScalingDescriptionList =
    js.Array[ReplicaGlobalSecondaryIndexAutoScalingDescription]
  type ReplicaGlobalSecondaryIndexAutoScalingUpdateList   = js.Array[ReplicaGlobalSecondaryIndexAutoScalingUpdate]
  type ReplicaGlobalSecondaryIndexDescriptionList         = js.Array[ReplicaGlobalSecondaryIndexDescription]
  type ReplicaGlobalSecondaryIndexList                    = js.Array[ReplicaGlobalSecondaryIndex]
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[ReplicaGlobalSecondaryIndexSettingsDescription]
  type ReplicaGlobalSecondaryIndexSettingsUpdateList      = js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate]
  type ReplicaList                                        = js.Array[Replica]
  type ReplicaSettingsDescriptionList                     = js.Array[ReplicaSettingsDescription]
  type ReplicaSettingsUpdateList                          = js.Array[ReplicaSettingsUpdate]
  type ReplicaStatusDescription                           = String
  type ReplicaStatusPercentProgress                       = String
  type ReplicaUpdateList                                  = js.Array[ReplicaUpdate]
  type ReplicationGroupUpdateList                         = js.Array[ReplicationGroupUpdate]
  type ResourceArnString                                  = String
  type RestoreInProgress                                  = Boolean
  type SSEEnabled                                         = Boolean
  type ScanSegment                                        = Int
  type ScanTotalSegments                                  = Int
  type SecondaryIndexesCapacityMap                        = js.Dictionary[Capacity]
  type StreamArn                                          = String
  type StreamEnabled                                      = Boolean
  type StringAttributeValue                               = String
  type StringSetAttributeValue                            = js.Array[StringAttributeValue]
  type TableArn                                           = String
  type TableCreationDateTime                              = js.Date
  type TableId                                            = String
  type TableName                                          = String
  type TableNameList                                      = js.Array[TableName]
  type TagKeyList                                         = js.Array[TagKeyString]
  type TagKeyString                                       = String
  type TagList                                            = js.Array[Tag]
  type TagValueString                                     = String
  type TimeRangeLowerBound                                = js.Date
  type TimeRangeUpperBound                                = js.Date
  type TimeToLiveAttributeName                            = String
  type TimeToLiveEnabled                                  = Boolean
  type TransactGetItemList                                = js.Array[TransactGetItem]
  type TransactWriteItemList                              = js.Array[TransactWriteItem]
  type UpdateExpression                                   = String
  type WriteRequests                                      = js.Array[WriteRequest]

  implicit final class DynamoDBOps(private val service: DynamoDB) extends AnyVal {

    @inline def batchGetItemFuture(params: BatchGetItemInput): Future[BatchGetItemOutput] =
      service.batchGetItem(params).promise().toFuture
    @inline def batchWriteItemFuture(params: BatchWriteItemInput): Future[BatchWriteItemOutput] =
      service.batchWriteItem(params).promise().toFuture
    @inline def createBackupFuture(params: CreateBackupInput): Future[CreateBackupOutput] =
      service.createBackup(params).promise().toFuture
    @inline def createGlobalTableFuture(params: CreateGlobalTableInput): Future[CreateGlobalTableOutput] =
      service.createGlobalTable(params).promise().toFuture
    @inline def createTableFuture(params: CreateTableInput): Future[CreateTableOutput] =
      service.createTable(params).promise().toFuture
    @inline def deleteBackupFuture(params: DeleteBackupInput): Future[DeleteBackupOutput] =
      service.deleteBackup(params).promise().toFuture
    @inline def deleteItemFuture(params: DeleteItemInput): Future[DeleteItemOutput] =
      service.deleteItem(params).promise().toFuture
    @inline def deleteTableFuture(params: DeleteTableInput): Future[DeleteTableOutput] =
      service.deleteTable(params).promise().toFuture
    @inline def describeBackupFuture(params: DescribeBackupInput): Future[DescribeBackupOutput] =
      service.describeBackup(params).promise().toFuture
    @inline def describeContinuousBackupsFuture(
        params: DescribeContinuousBackupsInput
    ): Future[DescribeContinuousBackupsOutput] = service.describeContinuousBackups(params).promise().toFuture
    @inline def describeContributorInsightsFuture(
        params: DescribeContributorInsightsInput
    ): Future[DescribeContributorInsightsOutput] = service.describeContributorInsights(params).promise().toFuture
    @inline def describeEndpointsFuture(params: DescribeEndpointsRequest): Future[DescribeEndpointsResponse] =
      service.describeEndpoints(params).promise().toFuture
    @inline def describeGlobalTableFuture(params: DescribeGlobalTableInput): Future[DescribeGlobalTableOutput] =
      service.describeGlobalTable(params).promise().toFuture
    @inline def describeGlobalTableSettingsFuture(
        params: DescribeGlobalTableSettingsInput
    ): Future[DescribeGlobalTableSettingsOutput] = service.describeGlobalTableSettings(params).promise().toFuture
    @inline def describeLimitsFuture(params: DescribeLimitsInput): Future[DescribeLimitsOutput] =
      service.describeLimits(params).promise().toFuture
    @inline def describeTableFuture(params: DescribeTableInput): Future[DescribeTableOutput] =
      service.describeTable(params).promise().toFuture
    @inline def describeTableReplicaAutoScalingFuture(
        params: DescribeTableReplicaAutoScalingInput
    ): Future[DescribeTableReplicaAutoScalingOutput] =
      service.describeTableReplicaAutoScaling(params).promise().toFuture
    @inline def describeTimeToLiveFuture(params: DescribeTimeToLiveInput): Future[DescribeTimeToLiveOutput] =
      service.describeTimeToLive(params).promise().toFuture
    @inline def getItemFuture(params: GetItemInput): Future[GetItemOutput] = service.getItem(params).promise().toFuture
    @inline def listBackupsFuture(params: ListBackupsInput): Future[ListBackupsOutput] =
      service.listBackups(params).promise().toFuture
    @inline def listContributorInsightsFuture(
        params: ListContributorInsightsInput
    ): Future[ListContributorInsightsOutput] = service.listContributorInsights(params).promise().toFuture
    @inline def listGlobalTablesFuture(params: ListGlobalTablesInput): Future[ListGlobalTablesOutput] =
      service.listGlobalTables(params).promise().toFuture
    @inline def listTablesFuture(params: ListTablesInput): Future[ListTablesOutput] =
      service.listTables(params).promise().toFuture
    @inline def listTagsOfResourceFuture(params: ListTagsOfResourceInput): Future[ListTagsOfResourceOutput] =
      service.listTagsOfResource(params).promise().toFuture
    @inline def putItemFuture(params: PutItemInput): Future[PutItemOutput] = service.putItem(params).promise().toFuture
    @inline def queryFuture(params: QueryInput): Future[QueryOutput]       = service.query(params).promise().toFuture
    @inline def restoreTableFromBackupFuture(
        params: RestoreTableFromBackupInput
    ): Future[RestoreTableFromBackupOutput] = service.restoreTableFromBackup(params).promise().toFuture
    @inline def restoreTableToPointInTimeFuture(
        params: RestoreTableToPointInTimeInput
    ): Future[RestoreTableToPointInTimeOutput]                    = service.restoreTableToPointInTime(params).promise().toFuture
    @inline def scanFuture(params: ScanInput): Future[ScanOutput] = service.scan(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def transactGetItemsFuture(params: TransactGetItemsInput): Future[TransactGetItemsOutput] =
      service.transactGetItems(params).promise().toFuture
    @inline def transactWriteItemsFuture(params: TransactWriteItemsInput): Future[TransactWriteItemsOutput] =
      service.transactWriteItems(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateContinuousBackupsFuture(
        params: UpdateContinuousBackupsInput
    ): Future[UpdateContinuousBackupsOutput] = service.updateContinuousBackups(params).promise().toFuture
    @inline def updateContributorInsightsFuture(
        params: UpdateContributorInsightsInput
    ): Future[UpdateContributorInsightsOutput] = service.updateContributorInsights(params).promise().toFuture
    @inline def updateGlobalTableFuture(params: UpdateGlobalTableInput): Future[UpdateGlobalTableOutput] =
      service.updateGlobalTable(params).promise().toFuture
    @inline def updateGlobalTableSettingsFuture(
        params: UpdateGlobalTableSettingsInput
    ): Future[UpdateGlobalTableSettingsOutput] = service.updateGlobalTableSettings(params).promise().toFuture
    @inline def updateItemFuture(params: UpdateItemInput): Future[UpdateItemOutput] =
      service.updateItem(params).promise().toFuture
    @inline def updateTableFuture(params: UpdateTableInput): Future[UpdateTableOutput] =
      service.updateTable(params).promise().toFuture
    @inline def updateTableReplicaAutoScalingFuture(
        params: UpdateTableReplicaAutoScalingInput
    ): Future[UpdateTableReplicaAutoScalingOutput] = service.updateTableReplicaAutoScaling(params).promise().toFuture
    @inline def updateTimeToLiveFuture(params: UpdateTimeToLiveInput): Future[UpdateTimeToLiveOutput] =
      service.updateTimeToLive(params).promise().toFuture
  }
}

package dynamodb {
  @js.native
  @JSImport("aws-sdk", "DynamoDB")
  class DynamoDB() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetItem(params: BatchGetItemInput): Request[BatchGetItemOutput]                = js.native
    def batchWriteItem(params: BatchWriteItemInput): Request[BatchWriteItemOutput]          = js.native
    def createBackup(params: CreateBackupInput): Request[CreateBackupOutput]                = js.native
    def createGlobalTable(params: CreateGlobalTableInput): Request[CreateGlobalTableOutput] = js.native
    def createTable(params: CreateTableInput): Request[CreateTableOutput]                   = js.native
    def deleteBackup(params: DeleteBackupInput): Request[DeleteBackupOutput]                = js.native
    def deleteItem(params: DeleteItemInput): Request[DeleteItemOutput]                      = js.native
    def deleteTable(params: DeleteTableInput): Request[DeleteTableOutput]                   = js.native
    def describeBackup(params: DescribeBackupInput): Request[DescribeBackupOutput]          = js.native
    def describeContinuousBackups(params: DescribeContinuousBackupsInput): Request[DescribeContinuousBackupsOutput] =
      js.native
    def describeContributorInsights(
        params: DescribeContributorInsightsInput
    ): Request[DescribeContributorInsightsOutput]                                                 = js.native
    def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse]   = js.native
    def describeGlobalTable(params: DescribeGlobalTableInput): Request[DescribeGlobalTableOutput] = js.native
    def describeGlobalTableSettings(
        params: DescribeGlobalTableSettingsInput
    ): Request[DescribeGlobalTableSettingsOutput]                                  = js.native
    def describeLimits(params: DescribeLimitsInput): Request[DescribeLimitsOutput] = js.native
    def describeTable(params: DescribeTableInput): Request[DescribeTableOutput]    = js.native
    def describeTableReplicaAutoScaling(
        params: DescribeTableReplicaAutoScalingInput
    ): Request[DescribeTableReplicaAutoScalingOutput]                                          = js.native
    def describeTimeToLive(params: DescribeTimeToLiveInput): Request[DescribeTimeToLiveOutput] = js.native
    def getItem(params: GetItemInput): Request[GetItemOutput]                                  = js.native
    def listBackups(params: ListBackupsInput): Request[ListBackupsOutput]                      = js.native
    def listContributorInsights(params: ListContributorInsightsInput): Request[ListContributorInsightsOutput] =
      js.native
    def listGlobalTables(params: ListGlobalTablesInput): Request[ListGlobalTablesOutput]                   = js.native
    def listTables(params: ListTablesInput): Request[ListTablesOutput]                                     = js.native
    def listTagsOfResource(params: ListTagsOfResourceInput): Request[ListTagsOfResourceOutput]             = js.native
    def putItem(params: PutItemInput): Request[PutItemOutput]                                              = js.native
    def query(params: QueryInput): Request[QueryOutput]                                                    = js.native
    def restoreTableFromBackup(params: RestoreTableFromBackupInput): Request[RestoreTableFromBackupOutput] = js.native
    def restoreTableToPointInTime(params: RestoreTableToPointInTimeInput): Request[RestoreTableToPointInTimeOutput] =
      js.native
    def scan(params: ScanInput): Request[ScanOutput]                                           = js.native
    def tagResource(params: TagResourceInput): Request[js.Object]                              = js.native
    def transactGetItems(params: TransactGetItemsInput): Request[TransactGetItemsOutput]       = js.native
    def transactWriteItems(params: TransactWriteItemsInput): Request[TransactWriteItemsOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[js.Object]                          = js.native
    def updateContinuousBackups(params: UpdateContinuousBackupsInput): Request[UpdateContinuousBackupsOutput] =
      js.native
    def updateContributorInsights(params: UpdateContributorInsightsInput): Request[UpdateContributorInsightsOutput] =
      js.native
    def updateGlobalTable(params: UpdateGlobalTableInput): Request[UpdateGlobalTableOutput] = js.native
    def updateGlobalTableSettings(params: UpdateGlobalTableSettingsInput): Request[UpdateGlobalTableSettingsOutput] =
      js.native
    def updateItem(params: UpdateItemInput): Request[UpdateItemOutput]    = js.native
    def updateTable(params: UpdateTableInput): Request[UpdateTableOutput] = js.native
    def updateTableReplicaAutoScaling(
        params: UpdateTableReplicaAutoScalingInput
    ): Request[UpdateTableReplicaAutoScalingOutput]                                      = js.native
    def updateTimeToLive(params: UpdateTimeToLiveInput): Request[UpdateTimeToLiveOutput] = js.native
  }

  /**
    * Contains details of a table archival operation.
    */
  @js.native
  @Factory
  trait ArchivalSummary extends js.Object {
    var ArchivalBackupArn: js.UndefOr[BackupArn]
    var ArchivalDateTime: js.UndefOr[Date]
    var ArchivalReason: js.UndefOr[ArchivalReason]
  }

  @js.native
  sealed trait AttributeAction extends js.Any
  object AttributeAction extends js.Object {
    val ADD    = "ADD".asInstanceOf[AttributeAction]
    val PUT    = "PUT".asInstanceOf[AttributeAction]
    val DELETE = "DELETE".asInstanceOf[AttributeAction]

    val values = js.Object.freeze(js.Array(ADD, PUT, DELETE))
  }

  /**
    * Represents an attribute for describing the key schema for the table and indexes.
    */
  @js.native
  @Factory
  trait AttributeDefinition extends js.Object {
    var AttributeName: KeySchemaAttributeName
    var AttributeType: ScalarAttributeType
  }

  /**
    * Represents the data for an attribute.
    *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.
    *  For more information, see [[https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes|Data Types]] in the <i>Amazon DynamoDB Developer Guide</i>.
    */
  @js.native
  @Factory
  trait AttributeValue extends js.Object {
    var B: js.UndefOr[BinaryAttributeValue]
    var BOOL: js.UndefOr[BooleanAttributeValue]
    var BS: js.UndefOr[BinarySetAttributeValue]
    var L: js.UndefOr[ListAttributeValue]
    var M: js.UndefOr[MapAttributeValue]
    var N: js.UndefOr[NumberAttributeValue]
    var NS: js.UndefOr[NumberSetAttributeValue]
    var NULL: js.UndefOr[NullAttributeValue]
    var S: js.UndefOr[StringAttributeValue]
    var SS: js.UndefOr[StringSetAttributeValue]
  }
  object AttributeValue {
    def S(value: StringAttributeValue): AttributeValue = js.Dynamic.literal("S" -> value).asInstanceOf[AttributeValue]
    def NFromInt(value: Int): AttributeValue           = js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
    def NFromLong(value: Long): AttributeValue         = js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
    def NFromDouble(value: Double): AttributeValue =
      js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
    def NFromBigInt(value: BigInt): AttributeValue =
      js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
    def NFromBigDecimal(value: BigDecimal): AttributeValue =
      js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
    def BOOL(value: BooleanAttributeValue): AttributeValue =
      js.Dynamic.literal("BOOL" -> value).asInstanceOf[AttributeValue]
    def M(value: js.UndefOr[MapAttributeValue]): AttributeValue =
      if (value.isEmpty) AttributeValue.NULL(true) else js.Dynamic.literal("M" -> value).asInstanceOf[AttributeValue]
    def M(value: Option[MapAttributeValue]): AttributeValue =
      if (value.isEmpty) AttributeValue.NULL(true)
      else js.Dynamic.literal("M" -> value.get).asInstanceOf[AttributeValue]
    def MFromMap[T](value: Map[String, T])(implicit valueType: AttributeValueMapper[T]): AttributeValue =
      AttributeValueMapper.AttributeValueTypeMapT[T].apply(value)
    def L(value: ListAttributeValue): AttributeValue = js.Dynamic.literal("L" -> value).asInstanceOf[AttributeValue]
    def LFromSeq[T](value: Seq[T])(implicit valueType: AttributeValueMapper[T]): AttributeValue =
      AttributeValueMapper.AttributeValueTypeSeqT[T].apply(value)
    def NULL(value: NullAttributeValue): AttributeValue =
      js.Dynamic.literal("NULL" -> value).asInstanceOf[AttributeValue]
    def B(value: BinaryAttributeValue): AttributeValue =
      js.Dynamic.literal("B" -> value.asInstanceOf[js.Any]).asInstanceOf[AttributeValue]
    def NS(value: StringAttributeValue): AttributeValue = js.Dynamic.literal("NS" -> value).asInstanceOf[AttributeValue]
    def BS(value: BinarySetAttributeValue): AttributeValue =
      js.Dynamic.literal("BS" -> value).asInstanceOf[AttributeValue]
    def SS(value: StringSetAttributeValue): AttributeValue =
      js.Dynamic.literal("SS" -> value).asInstanceOf[AttributeValue]

    def OptionAsValueOrNull[T](opt: Option[T])(implicit valueType: AttributeValueMapper[T]): AttributeValue = {
      opt match {
        case None    => NULL(true)
        case Some(s) => valueType(s)
      }
    }
    def OptionAsList[T](opt: Option[T])(implicit valueType: AttributeValueMapper[T]): AttributeValue = {
      opt match {
        case None    => js.Dynamic.literal("L" -> js.Array()).asInstanceOf[AttributeValue]
        case Some(s) => js.Dynamic.literal("L" -> js.Array(valueType(s))).asInstanceOf[AttributeValue]
      }
    }

  }

  /**
    * For the <code>UpdateItem</code> operation, represents the attributes to be modified, the action to perform on each, and the new value for each.
    *
    * '''Note:'''You cannot use <code>UpdateItem</code> to update any primary key attributes. Instead, you will need to delete the item, and then use <code>PutItem</code> to create a new item with new attributes.
    * Attribute values cannot be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests with empty values will be rejected with a <code>ValidationException</code> exception.
    */
  @js.native
  @Factory
  trait AttributeValueUpdate extends js.Object {
    var Action: js.UndefOr[AttributeAction]
    var Value: js.UndefOr[AttributeValue]
  }

  /**
    * Represents the properties of the scaling policy.
    */
  @js.native
  @Factory
  trait AutoScalingPolicyDescription extends js.Object {
    var PolicyName: js.UndefOr[AutoScalingPolicyName]
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[
      AutoScalingTargetTrackingScalingPolicyConfigurationDescription
    ]
  }

  /**
    * Represents the auto scaling policy to be modified.
    */
  @js.native
  @Factory
  trait AutoScalingPolicyUpdate extends js.Object {
    var TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    var PolicyName: js.UndefOr[AutoScalingPolicyName]
  }

  /**
    * Represents the auto scaling settings for a global table or global secondary index.
    */
  @js.native
  @Factory
  trait AutoScalingSettingsDescription extends js.Object {
    var AutoScalingDisabled: js.UndefOr[BooleanObject]
    var AutoScalingRoleArn: js.UndefOr[String]
    var MaximumUnits: js.UndefOr[PositiveLongObject]
    var MinimumUnits: js.UndefOr[PositiveLongObject]
    var ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList]
  }

  /**
    * Represents the auto scaling settings to be modified for a global table or global secondary index.
    */
  @js.native
  @Factory
  trait AutoScalingSettingsUpdate extends js.Object {
    var AutoScalingDisabled: js.UndefOr[BooleanObject]
    var AutoScalingRoleArn: js.UndefOr[AutoScalingRoleArn]
    var MaximumUnits: js.UndefOr[PositiveLongObject]
    var MinimumUnits: js.UndefOr[PositiveLongObject]
    var ScalingPolicyUpdate: js.UndefOr[AutoScalingPolicyUpdate]
  }

  /**
    * Represents the properties of a target tracking scaling policy.
    */
  @js.native
  @Factory
  trait AutoScalingTargetTrackingScalingPolicyConfigurationDescription extends js.Object {
    var TargetValue: Double
    var DisableScaleIn: js.UndefOr[BooleanObject]
    var ScaleInCooldown: js.UndefOr[IntegerObject]
    var ScaleOutCooldown: js.UndefOr[IntegerObject]
  }

  /**
    * Represents the settings of a target tracking scaling policy that will be modified.
    */
  @js.native
  @Factory
  trait AutoScalingTargetTrackingScalingPolicyConfigurationUpdate extends js.Object {
    var TargetValue: Double
    var DisableScaleIn: js.UndefOr[BooleanObject]
    var ScaleInCooldown: js.UndefOr[IntegerObject]
    var ScaleOutCooldown: js.UndefOr[IntegerObject]
  }

  /**
    * Contains the description of the backup created for the table.
    */
  @js.native
  @Factory
  trait BackupDescription extends js.Object {
    var BackupDetails: js.UndefOr[BackupDetails]
    var SourceTableDetails: js.UndefOr[SourceTableDetails]
    var SourceTableFeatureDetails: js.UndefOr[SourceTableFeatureDetails]
  }

  /**
    * Contains the details of the backup created for the table.
    */
  @js.native
  @Factory
  trait BackupDetails extends js.Object {
    var BackupArn: BackupArn
    var BackupCreationDateTime: BackupCreationDateTime
    var BackupName: BackupName
    var BackupStatus: BackupStatus
    var BackupType: BackupType
    var BackupExpiryDateTime: js.UndefOr[Date]
    var BackupSizeBytes: js.UndefOr[BackupSizeBytes]
  }

  @js.native
  sealed trait BackupStatus extends js.Any
  object BackupStatus extends js.Object {
    val CREATING  = "CREATING".asInstanceOf[BackupStatus]
    val DELETED   = "DELETED".asInstanceOf[BackupStatus]
    val AVAILABLE = "AVAILABLE".asInstanceOf[BackupStatus]

    val values = js.Object.freeze(js.Array(CREATING, DELETED, AVAILABLE))
  }

  /**
    * Contains details for the backup.
    */
  @js.native
  @Factory
  trait BackupSummary extends js.Object {
    var BackupArn: js.UndefOr[BackupArn]
    var BackupCreationDateTime: js.UndefOr[BackupCreationDateTime]
    var BackupExpiryDateTime: js.UndefOr[Date]
    var BackupName: js.UndefOr[BackupName]
    var BackupSizeBytes: js.UndefOr[BackupSizeBytes]
    var BackupStatus: js.UndefOr[BackupStatus]
    var BackupType: js.UndefOr[BackupType]
    var TableArn: js.UndefOr[TableArn]
    var TableId: js.UndefOr[TableId]
    var TableName: js.UndefOr[TableName]
  }

  @js.native
  sealed trait BackupType extends js.Any
  object BackupType extends js.Object {
    val USER       = "USER".asInstanceOf[BackupType]
    val SYSTEM     = "SYSTEM".asInstanceOf[BackupType]
    val AWS_BACKUP = "AWS_BACKUP".asInstanceOf[BackupType]

    val values = js.Object.freeze(js.Array(USER, SYSTEM, AWS_BACKUP))
  }

  @js.native
  sealed trait BackupTypeFilter extends js.Any
  object BackupTypeFilter extends js.Object {
    val USER       = "USER".asInstanceOf[BackupTypeFilter]
    val SYSTEM     = "SYSTEM".asInstanceOf[BackupTypeFilter]
    val AWS_BACKUP = "AWS_BACKUP".asInstanceOf[BackupTypeFilter]
    val ALL        = "ALL".asInstanceOf[BackupTypeFilter]

    val values = js.Object.freeze(js.Array(USER, SYSTEM, AWS_BACKUP, ALL))
  }

  /**
    * Represents the input of a <code>BatchGetItem</code> operation.
    */
  @js.native
  @Factory
  trait BatchGetItemInput extends js.Object {
    var RequestItems: BatchGetRequestMap
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
  }

  /**
    * Represents the output of a <code>BatchGetItem</code> operation.
    */
  @js.native
  @Factory
  trait BatchGetItemOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple]
    var Responses: js.UndefOr[BatchGetResponseMap]
    var UnprocessedKeys: js.UndefOr[BatchGetRequestMap]
  }

  /**
    * Represents the input of a <code>BatchWriteItem</code> operation.
    */
  @js.native
  @Factory
  trait BatchWriteItemInput extends js.Object {
    var RequestItems: BatchWriteItemRequestMap
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics]
  }

  /**
    * Represents the output of a <code>BatchWriteItem</code> operation.
    */
  @js.native
  @Factory
  trait BatchWriteItemOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable]
    var UnprocessedItems: js.UndefOr[BatchWriteItemRequestMap]
  }

  @js.native
  sealed trait BillingMode extends js.Any
  object BillingMode extends js.Object {
    val PROVISIONED     = "PROVISIONED".asInstanceOf[BillingMode]
    val PAY_PER_REQUEST = "PAY_PER_REQUEST".asInstanceOf[BillingMode]

    val values = js.Object.freeze(js.Array(PROVISIONED, PAY_PER_REQUEST))
  }

  /**
    * Contains the details for the read/write capacity mode.
    */
  @js.native
  @Factory
  trait BillingModeSummary extends js.Object {
    var BillingMode: js.UndefOr[BillingMode]
    var LastUpdateToPayPerRequestDateTime: js.UndefOr[Date]
  }

  /**
    * Represents the amount of provisioned throughput capacity consumed on a table or an index.
    */
  @js.native
  @Factory
  trait Capacity extends js.Object {
    var CapacityUnits: js.UndefOr[ConsumedCapacityUnits]
    var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits]
    var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits]
  }

  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator extends js.Object {
    val EQ           = "EQ".asInstanceOf[ComparisonOperator]
    val NE           = "NE".asInstanceOf[ComparisonOperator]
    val IN           = "IN".asInstanceOf[ComparisonOperator]
    val LE           = "LE".asInstanceOf[ComparisonOperator]
    val LT           = "LT".asInstanceOf[ComparisonOperator]
    val GE           = "GE".asInstanceOf[ComparisonOperator]
    val GT           = "GT".asInstanceOf[ComparisonOperator]
    val BETWEEN      = "BETWEEN".asInstanceOf[ComparisonOperator]
    val NOT_NULL     = "NOT_NULL".asInstanceOf[ComparisonOperator]
    val NULL         = "NULL".asInstanceOf[ComparisonOperator]
    val CONTAINS     = "CONTAINS".asInstanceOf[ComparisonOperator]
    val NOT_CONTAINS = "NOT_CONTAINS".asInstanceOf[ComparisonOperator]
    val BEGINS_WITH  = "BEGINS_WITH".asInstanceOf[ComparisonOperator]

    val values = js.Object.freeze(
      js.Array(EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH)
    )
  }

  /**
    * Represents the selection criteria for a <code>Query</code> or <code>Scan</code> operation:
    * * For a <code>Query</code> operation, <code>Condition</code> is used for specifying the <code>KeyConditions</code> to use when querying a table or an index. For <code>KeyConditions</code>, only the following comparison operators are supported:
    *  <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
    *  <code>Condition</code> is also used in a <code>QueryFilter</code>, which evaluates the query results and returns only the desired values.
    *  * For a <code>Scan</code> operation, <code>Condition</code> is used in a <code>ScanFilter</code>, which evaluates the scan results and returns only the desired values.
    */
  @js.native
  @Factory
  trait Condition extends js.Object {
    var ComparisonOperator: ComparisonOperator
    var AttributeValueList: js.UndefOr[AttributeValueList]
  }

  /**
    * Represents a request to perform a check that an item exists or to check the condition of specific attributes of the item.
    */
  @js.native
  @Factory
  trait ConditionCheck extends js.Object {
    var ConditionExpression: ConditionExpression
    var Key: Key
    var TableName: TableName
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure]
  }

  @js.native
  sealed trait ConditionalOperator extends js.Any
  object ConditionalOperator extends js.Object {
    val AND = "AND".asInstanceOf[ConditionalOperator]
    val OR  = "OR".asInstanceOf[ConditionalOperator]

    val values = js.Object.freeze(js.Array(AND, OR))
  }

  /**
    * The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the request asked for it. For more information, see [[https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html|Provisioned Throughput]] in the <i>Amazon DynamoDB Developer Guide</i>.
    */
  @js.native
  @Factory
  trait ConsumedCapacity extends js.Object {
    var CapacityUnits: js.UndefOr[ConsumedCapacityUnits]
    var GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap]
    var LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap]
    var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits]
    var Table: js.UndefOr[Capacity]
    var TableName: js.UndefOr[TableName]
    var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits]
  }

  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  @js.native
  @Factory
  trait ContinuousBackupsDescription extends js.Object {
    var ContinuousBackupsStatus: ContinuousBackupsStatus
    var PointInTimeRecoveryDescription: js.UndefOr[PointInTimeRecoveryDescription]
  }

  @js.native
  sealed trait ContinuousBackupsStatus extends js.Any
  object ContinuousBackupsStatus extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[ContinuousBackupsStatus]
    val DISABLED = "DISABLED".asInstanceOf[ContinuousBackupsStatus]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  sealed trait ContributorInsightsAction extends js.Any
  object ContributorInsightsAction extends js.Object {
    val ENABLE  = "ENABLE".asInstanceOf[ContributorInsightsAction]
    val DISABLE = "DISABLE".asInstanceOf[ContributorInsightsAction]

    val values = js.Object.freeze(js.Array(ENABLE, DISABLE))
  }

  @js.native
  sealed trait ContributorInsightsStatus extends js.Any
  object ContributorInsightsStatus extends js.Object {
    val ENABLING  = "ENABLING".asInstanceOf[ContributorInsightsStatus]
    val ENABLED   = "ENABLED".asInstanceOf[ContributorInsightsStatus]
    val DISABLING = "DISABLING".asInstanceOf[ContributorInsightsStatus]
    val DISABLED  = "DISABLED".asInstanceOf[ContributorInsightsStatus]
    val FAILED    = "FAILED".asInstanceOf[ContributorInsightsStatus]

    val values = js.Object.freeze(js.Array(ENABLING, ENABLED, DISABLING, DISABLED, FAILED))
  }

  /**
    * Represents a Contributor Insights summary entry..
    */
  @js.native
  @Factory
  trait ContributorInsightsSummary extends js.Object {
    var ContributorInsightsStatus: js.UndefOr[ContributorInsightsStatus]
    var IndexName: js.UndefOr[IndexName]
    var TableName: js.UndefOr[TableName]
  }

  @js.native
  @Factory
  trait CreateBackupInput extends js.Object {
    var BackupName: BackupName
    var TableName: TableName
  }

  @js.native
  @Factory
  trait CreateBackupOutput extends js.Object {
    var BackupDetails: js.UndefOr[BackupDetails]
  }

  /**
    * Represents a new global secondary index to be added to an existing table.
    */
  @js.native
  @Factory
  trait CreateGlobalSecondaryIndexAction extends js.Object {
    var IndexName: IndexName
    var KeySchema: KeySchema
    var Projection: Projection
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
  }

  @js.native
  @Factory
  trait CreateGlobalTableInput extends js.Object {
    var GlobalTableName: TableName
    var ReplicationGroup: ReplicaList
  }

  @js.native
  @Factory
  trait CreateGlobalTableOutput extends js.Object {
    var GlobalTableDescription: js.UndefOr[GlobalTableDescription]
  }

  /**
    * Represents a replica to be added.
    */
  @js.native
  @Factory
  trait CreateReplicaAction extends js.Object {
    var RegionName: RegionName
  }

  /**
    * Represents a replica to be created.
    */
  @js.native
  @Factory
  trait CreateReplicationGroupMemberAction extends js.Object {
    var RegionName: RegionName
    var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexList]
    var KMSMasterKeyId: js.UndefOr[KMSMasterKeyId]
    var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughputOverride]
  }

  /**
    * Represents the input of a <code>CreateTable</code> operation.
    */
  @js.native
  @Factory
  trait CreateTableInput extends js.Object {
    var AttributeDefinitions: AttributeDefinitions
    var KeySchema: KeySchema
    var TableName: TableName
    var BillingMode: js.UndefOr[BillingMode]
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexList]
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexList]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
    var SSESpecification: js.UndefOr[SSESpecification]
    var StreamSpecification: js.UndefOr[StreamSpecification]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Represents the output of a <code>CreateTable</code> operation.
    */
  @js.native
  @Factory
  trait CreateTableOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  /**
    * Represents a request to perform a <code>DeleteItem</code> operation.
    */
  @js.native
  @Factory
  trait Delete extends js.Object {
    var Key: Key
    var TableName: TableName
    var ConditionExpression: js.UndefOr[ConditionExpression]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure]
  }

  @js.native
  @Factory
  trait DeleteBackupInput extends js.Object {
    var BackupArn: BackupArn
  }

  @js.native
  @Factory
  trait DeleteBackupOutput extends js.Object {
    var BackupDescription: js.UndefOr[BackupDescription]
  }

  /**
    * Represents a global secondary index to be deleted from an existing table.
    */
  @js.native
  @Factory
  trait DeleteGlobalSecondaryIndexAction extends js.Object {
    var IndexName: IndexName
  }

  /**
    * Represents the input of a <code>DeleteItem</code> operation.
    */
  @js.native
  @Factory
  trait DeleteItemInput extends js.Object {
    var Key: Key
    var TableName: TableName
    var ConditionExpression: js.UndefOr[ConditionExpression]
    var ConditionalOperator: js.UndefOr[ConditionalOperator]
    var Expected: js.UndefOr[ExpectedAttributeMap]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics]
    var ReturnValues: js.UndefOr[ReturnValue]
  }

  /**
    * Represents the output of a <code>DeleteItem</code> operation.
    */
  @js.native
  @Factory
  trait DeleteItemOutput extends js.Object {
    var Attributes: js.UndefOr[AttributeMap]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics]
  }

  /**
    * Represents a replica to be removed.
    */
  @js.native
  @Factory
  trait DeleteReplicaAction extends js.Object {
    var RegionName: RegionName
  }

  /**
    * Represents a replica to be deleted.
    */
  @js.native
  @Factory
  trait DeleteReplicationGroupMemberAction extends js.Object {
    var RegionName: RegionName
  }

  /**
    * Represents a request to perform a <code>DeleteItem</code> operation on an item.
    */
  @js.native
  @Factory
  trait DeleteRequest extends js.Object {
    var Key: Key
  }

  /**
    * Represents the input of a <code>DeleteTable</code> operation.
    */
  @js.native
  @Factory
  trait DeleteTableInput extends js.Object {
    var TableName: TableName
  }

  /**
    * Represents the output of a <code>DeleteTable</code> operation.
    */
  @js.native
  @Factory
  trait DeleteTableOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  @js.native
  @Factory
  trait DescribeBackupInput extends js.Object {
    var BackupArn: BackupArn
  }

  @js.native
  @Factory
  trait DescribeBackupOutput extends js.Object {
    var BackupDescription: js.UndefOr[BackupDescription]
  }

  @js.native
  @Factory
  trait DescribeContinuousBackupsInput extends js.Object {
    var TableName: TableName
  }

  @js.native
  @Factory
  trait DescribeContinuousBackupsOutput extends js.Object {
    var ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription]
  }

  @js.native
  @Factory
  trait DescribeContributorInsightsInput extends js.Object {
    var TableName: TableName
    var IndexName: js.UndefOr[IndexName]
  }

  @js.native
  @Factory
  trait DescribeContributorInsightsOutput extends js.Object {
    var ContributorInsightsRuleList: js.UndefOr[ContributorInsightsRuleList]
    var ContributorInsightsStatus: js.UndefOr[ContributorInsightsStatus]
    var FailureException: js.UndefOr[FailureException]
    var IndexName: js.UndefOr[IndexName]
    var LastUpdateDateTime: js.UndefOr[LastUpdateDateTime]
    var TableName: js.UndefOr[TableName]
  }

  @js.native
  @Factory
  trait DescribeEndpointsRequest extends js.Object {}

  @js.native
  @Factory
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: Endpoints
  }

  @js.native
  @Factory
  trait DescribeGlobalTableInput extends js.Object {
    var GlobalTableName: TableName
  }

  @js.native
  @Factory
  trait DescribeGlobalTableOutput extends js.Object {
    var GlobalTableDescription: js.UndefOr[GlobalTableDescription]
  }

  @js.native
  @Factory
  trait DescribeGlobalTableSettingsInput extends js.Object {
    var GlobalTableName: TableName
  }

  @js.native
  @Factory
  trait DescribeGlobalTableSettingsOutput extends js.Object {
    var GlobalTableName: js.UndefOr[TableName]
    var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList]
  }

  /**
    * Represents the input of a <code>DescribeLimits</code> operation. Has no content.
    */
  @js.native
  @Factory
  trait DescribeLimitsInput extends js.Object {}

  /**
    * Represents the output of a <code>DescribeLimits</code> operation.
    */
  @js.native
  @Factory
  trait DescribeLimitsOutput extends js.Object {
    var AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject]
    var TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  /**
    * Represents the input of a <code>DescribeTable</code> operation.
    */
  @js.native
  @Factory
  trait DescribeTableInput extends js.Object {
    var TableName: TableName
  }

  /**
    * Represents the output of a <code>DescribeTable</code> operation.
    */
  @js.native
  @Factory
  trait DescribeTableOutput extends js.Object {
    var Table: js.UndefOr[TableDescription]
  }

  @js.native
  @Factory
  trait DescribeTableReplicaAutoScalingInput extends js.Object {
    var TableName: TableName
  }

  @js.native
  @Factory
  trait DescribeTableReplicaAutoScalingOutput extends js.Object {
    var TableAutoScalingDescription: js.UndefOr[TableAutoScalingDescription]
  }

  @js.native
  @Factory
  trait DescribeTimeToLiveInput extends js.Object {
    var TableName: TableName
  }

  @js.native
  @Factory
  trait DescribeTimeToLiveOutput extends js.Object {
    var TimeToLiveDescription: js.UndefOr[TimeToLiveDescription]
  }

  /**
    * An endpoint information details.
    */
  @js.native
  @Factory
  trait Endpoint extends js.Object {
    var Address: String
    var CachePeriodInMinutes: Double
  }

  /**
    * Represents a condition to be compared with an attribute value. This condition can be used with <code>DeleteItem</code>, <code>PutItem</code>, or <code>UpdateItem</code> operations; if the comparison evaluates to true, the operation succeeds; if not, the operation fails. You can use <code>ExpectedAttributeValue</code> in one of two different ways:
    * * Use <code>AttributeValueList</code> to specify one or more values to compare against an attribute. Use <code>ComparisonOperator</code> to specify how you want to perform the comparison. If the comparison evaluates to true, then the conditional operation succeeds.
    *  * Use <code>Value</code> to specify a value that DynamoDB will compare against an attribute. If the values match, then <code>ExpectedAttributeValue</code> evaluates to true and the conditional operation succeeds. Optionally, you can also set <code>Exists</code> to false, indicating that you <i>do not</i> expect to find the attribute value in the table. In this case, the conditional operation succeeds only if the comparison evaluates to false.
    * <code>Value</code> and <code>Exists</code> are incompatible with <code>AttributeValueList</code> and <code>ComparisonOperator</code>. Note that if you use both sets of parameters at once, DynamoDB will return a <code>ValidationException</code> exception.
    */
  @js.native
  @Factory
  trait ExpectedAttributeValue extends js.Object {
    var AttributeValueList: js.UndefOr[AttributeValueList]
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var Exists: js.UndefOr[BooleanObject]
    var Value: js.UndefOr[AttributeValue]
  }

  /**
    * Represents a failure a contributor insights operation.
    */
  @js.native
  @Factory
  trait FailureException extends js.Object {
    var ExceptionDescription: js.UndefOr[ExceptionDescription]
    var ExceptionName: js.UndefOr[ExceptionName]
  }

  /**
    * Specifies an item and related attribute values to retrieve in a <code>TransactGetItem</code> object.
    */
  @js.native
  @Factory
  trait Get extends js.Object {
    var Key: Key
    var TableName: TableName
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ProjectionExpression: js.UndefOr[ProjectionExpression]
  }

  /**
    * Represents the input of a <code>GetItem</code> operation.
    */
  @js.native
  @Factory
  trait GetItemInput extends js.Object {
    var Key: Key
    var TableName: TableName
    var AttributesToGet: js.UndefOr[AttributeNameList]
    var ConsistentRead: js.UndefOr[ConsistentRead]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ProjectionExpression: js.UndefOr[ProjectionExpression]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
  }

  /**
    * Represents the output of a <code>GetItem</code> operation.
    */
  @js.native
  @Factory
  trait GetItemOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var Item: js.UndefOr[AttributeMap]
  }

  /**
    * Represents the properties of a global secondary index.
    */
  @js.native
  @Factory
  trait GlobalSecondaryIndex extends js.Object {
    var IndexName: IndexName
    var KeySchema: KeySchema
    var Projection: Projection
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
  }

  /**
    * Represents the auto scaling settings of a global secondary index for a global table that will be modified.
    */
  @js.native
  @Factory
  trait GlobalSecondaryIndexAutoScalingUpdate extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate]
  }

  /**
    * Represents the properties of a global secondary index.
    */
  @js.native
  @Factory
  trait GlobalSecondaryIndexDescription extends js.Object {
    var Backfilling: js.UndefOr[Backfilling]
    var IndexArn: js.UndefOr[String]
    var IndexName: js.UndefOr[IndexName]
    var IndexSizeBytes: js.UndefOr[Double]
    var IndexStatus: js.UndefOr[IndexStatus]
    var ItemCount: js.UndefOr[Double]
    var KeySchema: js.UndefOr[KeySchema]
    var Projection: js.UndefOr[Projection]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription]
  }

  /**
    * Represents the properties of a global secondary index for the table when the backup was created.
    */
  @js.native
  @Factory
  trait GlobalSecondaryIndexInfo extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var KeySchema: js.UndefOr[KeySchema]
    var Projection: js.UndefOr[Projection]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
  }

  /**
    * Represents one of the following:
    * * A new global secondary index to be added to an existing table.
    *  * New provisioned throughput parameters for an existing global secondary index.
    *  * An existing global secondary index to be removed from an existing table.
    */
  @js.native
  @Factory
  trait GlobalSecondaryIndexUpdate extends js.Object {
    var Create: js.UndefOr[CreateGlobalSecondaryIndexAction]
    var Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction]
    var Update: js.UndefOr[UpdateGlobalSecondaryIndexAction]
  }

  /**
    * Represents the properties of a global table.
    */
  @js.native
  @Factory
  trait GlobalTable extends js.Object {
    var GlobalTableName: js.UndefOr[TableName]
    var ReplicationGroup: js.UndefOr[ReplicaList]
  }

  /**
    * Contains details about the global table.
    */
  @js.native
  @Factory
  trait GlobalTableDescription extends js.Object {
    var CreationDateTime: js.UndefOr[Date]
    var GlobalTableArn: js.UndefOr[GlobalTableArnString]
    var GlobalTableName: js.UndefOr[TableName]
    var GlobalTableStatus: js.UndefOr[GlobalTableStatus]
    var ReplicationGroup: js.UndefOr[ReplicaDescriptionList]
  }

  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  @js.native
  @Factory
  trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends js.Object {
    var IndexName: IndexName
    var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate]
    var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  @js.native
  sealed trait GlobalTableStatus extends js.Any
  object GlobalTableStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[GlobalTableStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[GlobalTableStatus]
    val DELETING = "DELETING".asInstanceOf[GlobalTableStatus]
    val UPDATING = "UPDATING".asInstanceOf[GlobalTableStatus]

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING, UPDATING))
  }

  @js.native
  sealed trait IndexStatus extends js.Any
  object IndexStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[IndexStatus]
    val UPDATING = "UPDATING".asInstanceOf[IndexStatus]
    val DELETING = "DELETING".asInstanceOf[IndexStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[IndexStatus]

    val values = js.Object.freeze(js.Array(CREATING, UPDATING, DELETING, ACTIVE))
  }

  /**
    * Information about item collections, if any, that were affected by the operation. <code>ItemCollectionMetrics</code> is only returned if the request asked for it. If the table does not have any local secondary indexes, this information is not returned in the response.
    */
  @js.native
  @Factory
  trait ItemCollectionMetrics extends js.Object {
    var ItemCollectionKey: js.UndefOr[ItemCollectionKeyAttributeMap]
    var SizeEstimateRangeGB: js.UndefOr[ItemCollectionSizeEstimateRange]
  }

  /**
    * Details for the requested item.
    */
  @js.native
  @Factory
  trait ItemResponse extends js.Object {
    var Item: js.UndefOr[AttributeMap]
  }

  /**
    * Represents <i>a single element</i> of a key schema. A key schema specifies the attributes that make up the primary key of a table, or the key attributes of an index.
    *  A <code>KeySchemaElement</code> represents exactly one attribute of the primary key. For example, a simple primary key would be represented by one <code>KeySchemaElement</code> (for the partition key). A composite primary key would require one <code>KeySchemaElement</code> for the partition key, and another <code>KeySchemaElement</code> for the sort key.
    *  A <code>KeySchemaElement</code> must be a scalar, top-level attribute (not a nested attribute). The data type must be one of String, Number, or Binary. The attribute cannot be nested within a List or a Map.
    */
  @js.native
  @Factory
  trait KeySchemaElement extends js.Object {
    var AttributeName: KeySchemaAttributeName
    var KeyType: KeyType
  }

  @js.native
  sealed trait KeyType extends js.Any
  object KeyType extends js.Object {
    val HASH  = "HASH".asInstanceOf[KeyType]
    val RANGE = "RANGE".asInstanceOf[KeyType]

    val values = js.Object.freeze(js.Array(HASH, RANGE))
  }

  /**
    * Represents a set of primary keys and, for each key, the attributes to retrieve from the table.
    *  For each primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary key, you only need to provide the partition key. For a composite primary key, you must provide <i>both</i> the partition key and the sort key.
    */
  @js.native
  @Factory
  trait KeysAndAttributes extends js.Object {
    var Keys: KeyList
    var AttributesToGet: js.UndefOr[AttributeNameList]
    var ConsistentRead: js.UndefOr[ConsistentRead]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ProjectionExpression: js.UndefOr[ProjectionExpression]
  }

  @js.native
  @Factory
  trait ListBackupsInput extends js.Object {
    var BackupType: js.UndefOr[BackupTypeFilter]
    var ExclusiveStartBackupArn: js.UndefOr[BackupArn]
    var Limit: js.UndefOr[BackupsInputLimit]
    var TableName: js.UndefOr[TableName]
    var TimeRangeLowerBound: js.UndefOr[TimeRangeLowerBound]
    var TimeRangeUpperBound: js.UndefOr[TimeRangeUpperBound]
  }

  @js.native
  @Factory
  trait ListBackupsOutput extends js.Object {
    var BackupSummaries: js.UndefOr[BackupSummaries]
    var LastEvaluatedBackupArn: js.UndefOr[BackupArn]
  }

  @js.native
  @Factory
  trait ListContributorInsightsInput extends js.Object {
    var MaxResults: js.UndefOr[ListContributorInsightsLimit]
    var NextToken: js.UndefOr[NextTokenString]
    var TableName: js.UndefOr[TableName]
  }

  @js.native
  @Factory
  trait ListContributorInsightsOutput extends js.Object {
    var ContributorInsightsSummaries: js.UndefOr[ContributorInsightsSummaries]
    var NextToken: js.UndefOr[NextTokenString]
  }

  @js.native
  @Factory
  trait ListGlobalTablesInput extends js.Object {
    var ExclusiveStartGlobalTableName: js.UndefOr[TableName]
    var Limit: js.UndefOr[PositiveIntegerObject]
    var RegionName: js.UndefOr[RegionName]
  }

  @js.native
  @Factory
  trait ListGlobalTablesOutput extends js.Object {
    var GlobalTables: js.UndefOr[GlobalTableList]
    var LastEvaluatedGlobalTableName: js.UndefOr[TableName]
  }

  /**
    * Represents the input of a <code>ListTables</code> operation.
    */
  @js.native
  @Factory
  trait ListTablesInput extends js.Object {
    var ExclusiveStartTableName: js.UndefOr[TableName]
    var Limit: js.UndefOr[ListTablesInputLimit]
  }

  /**
    * Represents the output of a <code>ListTables</code> operation.
    */
  @js.native
  @Factory
  trait ListTablesOutput extends js.Object {
    var LastEvaluatedTableName: js.UndefOr[TableName]
    var TableNames: js.UndefOr[TableNameList]
  }

  @js.native
  @Factory
  trait ListTagsOfResourceInput extends js.Object {
    var ResourceArn: ResourceArnString
    var NextToken: js.UndefOr[NextTokenString]
  }

  @js.native
  @Factory
  trait ListTagsOfResourceOutput extends js.Object {
    var NextToken: js.UndefOr[NextTokenString]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Represents the properties of a local secondary index.
    */
  @js.native
  @Factory
  trait LocalSecondaryIndex extends js.Object {
    var IndexName: IndexName
    var KeySchema: KeySchema
    var Projection: Projection
  }

  /**
    * Represents the properties of a local secondary index.
    */
  @js.native
  @Factory
  trait LocalSecondaryIndexDescription extends js.Object {
    var IndexArn: js.UndefOr[String]
    var IndexName: js.UndefOr[IndexName]
    var IndexSizeBytes: js.UndefOr[Double]
    var ItemCount: js.UndefOr[Double]
    var KeySchema: js.UndefOr[KeySchema]
    var Projection: js.UndefOr[Projection]
  }

  /**
    * Represents the properties of a local secondary index for the table when the backup was created.
    */
  @js.native
  @Factory
  trait LocalSecondaryIndexInfo extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var KeySchema: js.UndefOr[KeySchema]
    var Projection: js.UndefOr[Projection]
  }

  /**
    * The description of the point in time settings applied to the table.
    */
  @js.native
  @Factory
  trait PointInTimeRecoveryDescription extends js.Object {
    var EarliestRestorableDateTime: js.UndefOr[Date]
    var LatestRestorableDateTime: js.UndefOr[Date]
    var PointInTimeRecoveryStatus: js.UndefOr[PointInTimeRecoveryStatus]
  }

  /**
    * Represents the settings used to enable point in time recovery.
    */
  @js.native
  @Factory
  trait PointInTimeRecoverySpecification extends js.Object {
    var PointInTimeRecoveryEnabled: BooleanObject
  }

  @js.native
  sealed trait PointInTimeRecoveryStatus extends js.Any
  object PointInTimeRecoveryStatus extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[PointInTimeRecoveryStatus]
    val DISABLED = "DISABLED".asInstanceOf[PointInTimeRecoveryStatus]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  @js.native
  @Factory
  trait Projection extends js.Object {
    var NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList]
    var ProjectionType: js.UndefOr[ProjectionType]
  }

  @js.native
  sealed trait ProjectionType extends js.Any
  object ProjectionType extends js.Object {
    val ALL       = "ALL".asInstanceOf[ProjectionType]
    val KEYS_ONLY = "KEYS_ONLY".asInstanceOf[ProjectionType]
    val INCLUDE   = "INCLUDE".asInstanceOf[ProjectionType]

    val values = js.Object.freeze(js.Array(ALL, KEYS_ONLY, INCLUDE))
  }

  /**
    * Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the <code>UpdateTable</code> operation.
    *  For current minimum and maximum provisioned throughput values, see [[https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html|Limits]] in the <i>Amazon DynamoDB Developer Guide</i>.
    */
  @js.native
  @Factory
  trait ProvisionedThroughput extends js.Object {
    var ReadCapacityUnits: PositiveLongObject
    var WriteCapacityUnits: PositiveLongObject
  }

  /**
    * Represents the provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.
    */
  @js.native
  @Factory
  trait ProvisionedThroughputDescription extends js.Object {
    var LastDecreaseDateTime: js.UndefOr[Date]
    var LastIncreaseDateTime: js.UndefOr[Date]
    var NumberOfDecreasesToday: js.UndefOr[PositiveLongObject]
    var ReadCapacityUnits: js.UndefOr[NonNegativeLongObject]
    var WriteCapacityUnits: js.UndefOr[NonNegativeLongObject]
  }

  /**
    * Replica-specific provisioned throughput settings. If not specified, uses the source table's provisioned throughput settings.
    */
  @js.native
  @Factory
  trait ProvisionedThroughputOverride extends js.Object {
    var ReadCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  /**
    * Represents a request to perform a <code>PutItem</code> operation.
    */
  @js.native
  @Factory
  trait Put extends js.Object {
    var Item: PutItemInputAttributeMap
    var TableName: TableName
    var ConditionExpression: js.UndefOr[ConditionExpression]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure]
  }

  /**
    * Represents the input of a <code>PutItem</code> operation.
    */
  @js.native
  @Factory
  trait PutItemInput extends js.Object {
    var Item: PutItemInputAttributeMap
    var TableName: TableName
    var ConditionExpression: js.UndefOr[ConditionExpression]
    var ConditionalOperator: js.UndefOr[ConditionalOperator]
    var Expected: js.UndefOr[ExpectedAttributeMap]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics]
    var ReturnValues: js.UndefOr[ReturnValue]
  }

  /**
    * Represents the output of a <code>PutItem</code> operation.
    */
  @js.native
  @Factory
  trait PutItemOutput extends js.Object {
    var Attributes: js.UndefOr[AttributeMap]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics]
  }

  /**
    * Represents a request to perform a <code>PutItem</code> operation on an item.
    */
  @js.native
  @Factory
  trait PutRequest extends js.Object {
    var Item: PutItemInputAttributeMap
  }

  /**
    * Represents the input of a <code>Query</code> operation.
    */
  @js.native
  @Factory
  trait QueryInput extends js.Object {
    var TableName: TableName
    var AttributesToGet: js.UndefOr[AttributeNameList]
    var ConditionalOperator: js.UndefOr[ConditionalOperator]
    var ConsistentRead: js.UndefOr[ConsistentRead]
    var ExclusiveStartKey: js.UndefOr[Key]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var FilterExpression: js.UndefOr[ConditionExpression]
    var IndexName: js.UndefOr[IndexName]
    var KeyConditionExpression: js.UndefOr[KeyExpression]
    var KeyConditions: js.UndefOr[KeyConditions]
    var Limit: js.UndefOr[PositiveIntegerObject]
    var ProjectionExpression: js.UndefOr[ProjectionExpression]
    var QueryFilter: js.UndefOr[FilterConditionMap]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ScanIndexForward: js.UndefOr[BooleanObject]
    var Select: js.UndefOr[Select]
  }

  /**
    * Represents the output of a <code>Query</code> operation.
    */
  @js.native
  @Factory
  trait QueryOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var Count: js.UndefOr[Int]
    var Items: js.UndefOr[ItemList]
    var LastEvaluatedKey: js.UndefOr[Key]
    var ScannedCount: js.UndefOr[Int]
  }

  /**
    * Represents the properties of a replica.
    */
  @js.native
  @Factory
  trait Replica extends js.Object {
    var RegionName: js.UndefOr[RegionName]
  }

  /**
    * Represents the auto scaling settings of the replica.
    */
  @js.native
  @Factory
  trait ReplicaAutoScalingDescription extends js.Object {
    var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingDescriptionList]
    var RegionName: js.UndefOr[RegionName]
    var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ReplicaStatus: js.UndefOr[ReplicaStatus]
  }

  /**
    * Represents the auto scaling settings of a replica that will be modified.
    */
  @js.native
  @Factory
  trait ReplicaAutoScalingUpdate extends js.Object {
    var RegionName: RegionName
    var ReplicaGlobalSecondaryIndexUpdates: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingUpdateList]
    var ReplicaProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate]
  }

  /**
    * Contains the details of the replica.
    */
  @js.native
  @Factory
  trait ReplicaDescription extends js.Object {
    var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexDescriptionList]
    var KMSMasterKeyId: js.UndefOr[KMSMasterKeyId]
    var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughputOverride]
    var RegionName: js.UndefOr[RegionName]
    var ReplicaStatus: js.UndefOr[ReplicaStatus]
    var ReplicaStatusDescription: js.UndefOr[ReplicaStatusDescription]
    var ReplicaStatusPercentProgress: js.UndefOr[ReplicaStatusPercentProgress]
  }

  /**
    * Represents the properties of a replica global secondary index.
    */
  @js.native
  @Factory
  trait ReplicaGlobalSecondaryIndex extends js.Object {
    var IndexName: IndexName
    var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughputOverride]
  }

  /**
    * Represents the auto scaling configuration for a replica global secondary index.
    */
  @js.native
  @Factory
  trait ReplicaGlobalSecondaryIndexAutoScalingDescription extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var IndexStatus: js.UndefOr[IndexStatus]
    var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
  }

  /**
    * Represents the auto scaling settings of a global secondary index for a replica that will be modified.
    */
  @js.native
  @Factory
  trait ReplicaGlobalSecondaryIndexAutoScalingUpdate extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var ProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate]
  }

  /**
    * Represents the properties of a replica global secondary index.
    */
  @js.native
  @Factory
  trait ReplicaGlobalSecondaryIndexDescription extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughputOverride]
  }

  /**
    * Represents the properties of a global secondary index.
    */
  @js.native
  @Factory
  trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
    var IndexName: IndexName
    var IndexStatus: js.UndefOr[IndexStatus]
    var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  @js.native
  @Factory
  trait ReplicaGlobalSecondaryIndexSettingsUpdate extends js.Object {
    var IndexName: IndexName
    var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate]
    var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  /**
    * Represents the properties of a replica.
    */
  @js.native
  @Factory
  trait ReplicaSettingsDescription extends js.Object {
    var RegionName: RegionName
    var ReplicaBillingModeSummary: js.UndefOr[BillingModeSummary]
    var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsDescriptionList]
    var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[NonNegativeLongObject]
    var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[NonNegativeLongObject]
    var ReplicaStatus: js.UndefOr[ReplicaStatus]
  }

  /**
    * Represents the settings for a global table in a Region that will be modified.
    */
  @js.native
  @Factory
  trait ReplicaSettingsUpdate extends js.Object {
    var RegionName: RegionName
    var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsUpdateList]
    var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate]
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  @js.native
  sealed trait ReplicaStatus extends js.Any
  object ReplicaStatus extends js.Object {
    val CREATING        = "CREATING".asInstanceOf[ReplicaStatus]
    val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[ReplicaStatus]
    val UPDATING        = "UPDATING".asInstanceOf[ReplicaStatus]
    val DELETING        = "DELETING".asInstanceOf[ReplicaStatus]
    val ACTIVE          = "ACTIVE".asInstanceOf[ReplicaStatus]

    val values = js.Object.freeze(js.Array(CREATING, CREATION_FAILED, UPDATING, DELETING, ACTIVE))
  }

  /**
    * Represents one of the following:
    * * A new replica to be added to an existing global table.
    *  * New parameters for an existing replica.
    *  * An existing replica to be removed from an existing global table.
    */
  @js.native
  @Factory
  trait ReplicaUpdate extends js.Object {
    var Create: js.UndefOr[CreateReplicaAction]
    var Delete: js.UndefOr[DeleteReplicaAction]
  }

  /**
    * Represents one of the following:
    * * A new replica to be added to an existing regional table or global table. This request invokes the <code>CreateTableReplica</code> action in the destination Region.
    *  * New parameters for an existing replica. This request invokes the <code>UpdateTable</code> action in the destination Region.
    *  * An existing replica to be deleted. The request invokes the <code>DeleteTableReplica</code> action in the destination Region, deleting the replica and all if its items in the destination Region.
    */
  @js.native
  @Factory
  trait ReplicationGroupUpdate extends js.Object {
    var Create: js.UndefOr[CreateReplicationGroupMemberAction]
    var Delete: js.UndefOr[DeleteReplicationGroupMemberAction]
    var Update: js.UndefOr[UpdateReplicationGroupMemberAction]
  }

  /**
    * Contains details for the restore.
    */
  @js.native
  @Factory
  trait RestoreSummary extends js.Object {
    var RestoreDateTime: Date
    var RestoreInProgress: RestoreInProgress
    var SourceBackupArn: js.UndefOr[BackupArn]
    var SourceTableArn: js.UndefOr[TableArn]
  }

  @js.native
  @Factory
  trait RestoreTableFromBackupInput extends js.Object {
    var BackupArn: BackupArn
    var TargetTableName: TableName
    var BillingModeOverride: js.UndefOr[BillingMode]
    var GlobalSecondaryIndexOverride: js.UndefOr[GlobalSecondaryIndexList]
    var LocalSecondaryIndexOverride: js.UndefOr[LocalSecondaryIndexList]
    var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughput]
    var SSESpecificationOverride: js.UndefOr[SSESpecification]
  }

  @js.native
  @Factory
  trait RestoreTableFromBackupOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  @js.native
  @Factory
  trait RestoreTableToPointInTimeInput extends js.Object {
    var TargetTableName: TableName
    var BillingModeOverride: js.UndefOr[BillingMode]
    var GlobalSecondaryIndexOverride: js.UndefOr[GlobalSecondaryIndexList]
    var LocalSecondaryIndexOverride: js.UndefOr[LocalSecondaryIndexList]
    var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughput]
    var RestoreDateTime: js.UndefOr[Date]
    var SSESpecificationOverride: js.UndefOr[SSESpecification]
    var SourceTableArn: js.UndefOr[TableArn]
    var SourceTableName: js.UndefOr[TableName]
    var UseLatestRestorableTime: js.UndefOr[BooleanObject]
  }

  @js.native
  @Factory
  trait RestoreTableToPointInTimeOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  /**
    * Determines the level of detail about provisioned throughput consumption that is returned in the response:
    * * <code>INDEXES</code> - The response includes the aggregate <code>ConsumedCapacity</code> for the operation, together with <code>ConsumedCapacity</code> for each table and secondary index that was accessed.
    *  Note that some operations, such as <code>GetItem</code> and <code>BatchGetItem</code>, do not access any indexes at all. In these cases, specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code> information for table(s).
    *  * <code>TOTAL</code> - The response includes only the aggregate <code>ConsumedCapacity</code> for the operation.
    *  * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the response.
    */
  @js.native
  sealed trait ReturnConsumedCapacity extends js.Any
  object ReturnConsumedCapacity extends js.Object {
    val INDEXES = "INDEXES".asInstanceOf[ReturnConsumedCapacity]
    val TOTAL   = "TOTAL".asInstanceOf[ReturnConsumedCapacity]
    val NONE    = "NONE".asInstanceOf[ReturnConsumedCapacity]

    val values = js.Object.freeze(js.Array(INDEXES, TOTAL, NONE))
  }

  @js.native
  sealed trait ReturnItemCollectionMetrics extends js.Any
  object ReturnItemCollectionMetrics extends js.Object {
    val SIZE = "SIZE".asInstanceOf[ReturnItemCollectionMetrics]
    val NONE = "NONE".asInstanceOf[ReturnItemCollectionMetrics]

    val values = js.Object.freeze(js.Array(SIZE, NONE))
  }

  @js.native
  sealed trait ReturnValue extends js.Any
  object ReturnValue extends js.Object {
    val NONE        = "NONE".asInstanceOf[ReturnValue]
    val ALL_OLD     = "ALL_OLD".asInstanceOf[ReturnValue]
    val UPDATED_OLD = "UPDATED_OLD".asInstanceOf[ReturnValue]
    val ALL_NEW     = "ALL_NEW".asInstanceOf[ReturnValue]
    val UPDATED_NEW = "UPDATED_NEW".asInstanceOf[ReturnValue]

    val values = js.Object.freeze(js.Array(NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW))
  }

  @js.native
  sealed trait ReturnValuesOnConditionCheckFailure extends js.Any
  object ReturnValuesOnConditionCheckFailure extends js.Object {
    val ALL_OLD = "ALL_OLD".asInstanceOf[ReturnValuesOnConditionCheckFailure]
    val NONE    = "NONE".asInstanceOf[ReturnValuesOnConditionCheckFailure]

    val values = js.Object.freeze(js.Array(ALL_OLD, NONE))
  }

  /**
    * The description of the server-side encryption status on the specified table.
    */
  @js.native
  @Factory
  trait SSEDescription extends js.Object {
    var InaccessibleEncryptionDateTime: js.UndefOr[Date]
    var KMSMasterKeyArn: js.UndefOr[KMSMasterKeyArn]
    var SSEType: js.UndefOr[SSEType]
    var Status: js.UndefOr[SSEStatus]
  }

  /**
    * Represents the settings used to enable server-side encryption.
    */
  @js.native
  @Factory
  trait SSESpecification extends js.Object {
    var Enabled: js.UndefOr[SSEEnabled]
    var KMSMasterKeyId: js.UndefOr[KMSMasterKeyId]
    var SSEType: js.UndefOr[SSEType]
  }

  @js.native
  sealed trait SSEStatus extends js.Any
  object SSEStatus extends js.Object {
    val ENABLING  = "ENABLING".asInstanceOf[SSEStatus]
    val ENABLED   = "ENABLED".asInstanceOf[SSEStatus]
    val DISABLING = "DISABLING".asInstanceOf[SSEStatus]
    val DISABLED  = "DISABLED".asInstanceOf[SSEStatus]
    val UPDATING  = "UPDATING".asInstanceOf[SSEStatus]

    val values = js.Object.freeze(js.Array(ENABLING, ENABLED, DISABLING, DISABLED, UPDATING))
  }

  @js.native
  sealed trait SSEType extends js.Any
  object SSEType extends js.Object {
    val AES256 = "AES256".asInstanceOf[SSEType]
    val KMS    = "KMS".asInstanceOf[SSEType]

    val values = js.Object.freeze(js.Array(AES256, KMS))
  }

  @js.native
  sealed trait ScalarAttributeType extends js.Any
  object ScalarAttributeType extends js.Object {
    val S = "S".asInstanceOf[ScalarAttributeType]
    val N = "N".asInstanceOf[ScalarAttributeType]
    val B = "B".asInstanceOf[ScalarAttributeType]

    val values = js.Object.freeze(js.Array(S, N, B))
  }

  /**
    * Represents the input of a <code>Scan</code> operation.
    */
  @js.native
  @Factory
  trait ScanInput extends js.Object {
    var TableName: TableName
    var AttributesToGet: js.UndefOr[AttributeNameList]
    var ConditionalOperator: js.UndefOr[ConditionalOperator]
    var ConsistentRead: js.UndefOr[ConsistentRead]
    var ExclusiveStartKey: js.UndefOr[Key]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var FilterExpression: js.UndefOr[ConditionExpression]
    var IndexName: js.UndefOr[IndexName]
    var Limit: js.UndefOr[PositiveIntegerObject]
    var ProjectionExpression: js.UndefOr[ProjectionExpression]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ScanFilter: js.UndefOr[FilterConditionMap]
    var Segment: js.UndefOr[ScanSegment]
    var Select: js.UndefOr[Select]
    var TotalSegments: js.UndefOr[ScanTotalSegments]
  }

  /**
    * Represents the output of a <code>Scan</code> operation.
    */
  @js.native
  @Factory
  trait ScanOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var Count: js.UndefOr[Int]
    var Items: js.UndefOr[ItemList]
    var LastEvaluatedKey: js.UndefOr[Key]
    var ScannedCount: js.UndefOr[Int]
  }

  @js.native
  sealed trait Select extends js.Any
  object Select extends js.Object {
    val ALL_ATTRIBUTES           = "ALL_ATTRIBUTES".asInstanceOf[Select]
    val ALL_PROJECTED_ATTRIBUTES = "ALL_PROJECTED_ATTRIBUTES".asInstanceOf[Select]
    val SPECIFIC_ATTRIBUTES      = "SPECIFIC_ATTRIBUTES".asInstanceOf[Select]
    val COUNT                    = "COUNT".asInstanceOf[Select]

    val values = js.Object.freeze(js.Array(ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT))
  }

  /**
    * Contains the details of the table when the backup was created.
    */
  @js.native
  @Factory
  trait SourceTableDetails extends js.Object {
    var KeySchema: KeySchema
    var ProvisionedThroughput: ProvisionedThroughput
    var TableCreationDateTime: TableCreationDateTime
    var TableId: TableId
    var TableName: TableName
    var BillingMode: js.UndefOr[BillingMode]
    var ItemCount: js.UndefOr[ItemCount]
    var TableArn: js.UndefOr[TableArn]
    var TableSizeBytes: js.UndefOr[Double]
  }

  /**
    * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.
    */
  @js.native
  @Factory
  trait SourceTableFeatureDetails extends js.Object {
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexes]
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexes]
    var SSEDescription: js.UndefOr[SSEDescription]
    var StreamDescription: js.UndefOr[StreamSpecification]
    var TimeToLiveDescription: js.UndefOr[TimeToLiveDescription]
  }

  /**
    * Represents the DynamoDB Streams configuration for a table in DynamoDB.
    */
  @js.native
  @Factory
  trait StreamSpecification extends js.Object {
    var StreamEnabled: StreamEnabled
    var StreamViewType: js.UndefOr[StreamViewType]
  }

  @js.native
  sealed trait StreamViewType extends js.Any
  object StreamViewType extends js.Object {
    val NEW_IMAGE          = "NEW_IMAGE".asInstanceOf[StreamViewType]
    val OLD_IMAGE          = "OLD_IMAGE".asInstanceOf[StreamViewType]
    val NEW_AND_OLD_IMAGES = "NEW_AND_OLD_IMAGES".asInstanceOf[StreamViewType]
    val KEYS_ONLY          = "KEYS_ONLY".asInstanceOf[StreamViewType]

    val values = js.Object.freeze(js.Array(NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY))
  }

  /**
    * Represents the auto scaling configuration for a global table.
    */
  @js.native
  @Factory
  trait TableAutoScalingDescription extends js.Object {
    var Replicas: js.UndefOr[ReplicaAutoScalingDescriptionList]
    var TableName: js.UndefOr[TableName]
    var TableStatus: js.UndefOr[TableStatus]
  }

  /**
    * Represents the properties of a table.
    */
  @js.native
  @Factory
  trait TableDescription extends js.Object {
    var ArchivalSummary: js.UndefOr[ArchivalSummary]
    var AttributeDefinitions: js.UndefOr[AttributeDefinitions]
    var BillingModeSummary: js.UndefOr[BillingModeSummary]
    var CreationDateTime: js.UndefOr[Date]
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexDescriptionList]
    var GlobalTableVersion: js.UndefOr[String]
    var ItemCount: js.UndefOr[Double]
    var KeySchema: js.UndefOr[KeySchema]
    var LatestStreamArn: js.UndefOr[StreamArn]
    var LatestStreamLabel: js.UndefOr[String]
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexDescriptionList]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription]
    var Replicas: js.UndefOr[ReplicaDescriptionList]
    var RestoreSummary: js.UndefOr[RestoreSummary]
    var SSEDescription: js.UndefOr[SSEDescription]
    var StreamSpecification: js.UndefOr[StreamSpecification]
    var TableArn: js.UndefOr[String]
    var TableId: js.UndefOr[TableId]
    var TableName: js.UndefOr[TableName]
    var TableSizeBytes: js.UndefOr[Double]
    var TableStatus: js.UndefOr[TableStatus]
  }

  @js.native
  sealed trait TableStatus extends js.Any
  object TableStatus extends js.Object {
    val CREATING                            = "CREATING".asInstanceOf[TableStatus]
    val UPDATING                            = "UPDATING".asInstanceOf[TableStatus]
    val DELETING                            = "DELETING".asInstanceOf[TableStatus]
    val ACTIVE                              = "ACTIVE".asInstanceOf[TableStatus]
    val INACCESSIBLE_ENCRYPTION_CREDENTIALS = "INACCESSIBLE_ENCRYPTION_CREDENTIALS".asInstanceOf[TableStatus]
    val ARCHIVING                           = "ARCHIVING".asInstanceOf[TableStatus]
    val ARCHIVED                            = "ARCHIVED".asInstanceOf[TableStatus]

    val values = js.Object.freeze(
      js.Array(CREATING, UPDATING, DELETING, ACTIVE, INACCESSIBLE_ENCRYPTION_CREDENTIALS, ARCHIVING, ARCHIVED)
    )
  }

  /**
    * Describes a tag. A tag is a key-value pair. You can add up to 50 tags to a single DynamoDB table.
    *  AWS-assigned tag names and values are automatically assigned the <code>aws:</code> prefix, which the user cannot assign. AWS-assigned tag names do not count towards the tag limit of 50. User-assigned tag names have the prefix <code>user:</code> in the Cost Allocation Report. You cannot backdate the application of a tag.
    *  For an overview on tagging DynamoDB resources, see [[https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html|Tagging for DynamoDB]] in the <i>Amazon DynamoDB Developer Guide</i>.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKeyString
    var Value: TagValueString
  }

  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var ResourceArn: ResourceArnString
    var Tags: TagList
  }

  /**
    * The description of the Time to Live (TTL) status on the specified table.
    */
  @js.native
  @Factory
  trait TimeToLiveDescription extends js.Object {
    var AttributeName: js.UndefOr[TimeToLiveAttributeName]
    var TimeToLiveStatus: js.UndefOr[TimeToLiveStatus]
  }

  /**
    * Represents the settings used to enable or disable Time to Live (TTL) for the specified table.
    */
  @js.native
  @Factory
  trait TimeToLiveSpecification extends js.Object {
    var AttributeName: TimeToLiveAttributeName
    var Enabled: TimeToLiveEnabled
  }

  @js.native
  sealed trait TimeToLiveStatus extends js.Any
  object TimeToLiveStatus extends js.Object {
    val ENABLING  = "ENABLING".asInstanceOf[TimeToLiveStatus]
    val DISABLING = "DISABLING".asInstanceOf[TimeToLiveStatus]
    val ENABLED   = "ENABLED".asInstanceOf[TimeToLiveStatus]
    val DISABLED  = "DISABLED".asInstanceOf[TimeToLiveStatus]

    val values = js.Object.freeze(js.Array(ENABLING, DISABLING, ENABLED, DISABLED))
  }

  /**
    * Specifies an item to be retrieved as part of the transaction.
    */
  @js.native
  @Factory
  trait TransactGetItem extends js.Object {
    var Get: Get
  }

  @js.native
  @Factory
  trait TransactGetItemsInput extends js.Object {
    var TransactItems: TransactGetItemList
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
  }

  @js.native
  @Factory
  trait TransactGetItemsOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple]
    var Responses: js.UndefOr[ItemResponseList]
  }

  /**
    * A list of requests that can perform update, put, delete, or check operations on multiple items in one or more tables atomically.
    */
  @js.native
  @Factory
  trait TransactWriteItem extends js.Object {
    var ConditionCheck: js.UndefOr[ConditionCheck]
    var Delete: js.UndefOr[Delete]
    var Put: js.UndefOr[Put]
    var Update: js.UndefOr[Update]
  }

  @js.native
  @Factory
  trait TransactWriteItemsInput extends js.Object {
    var TransactItems: TransactWriteItemList
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics]
  }

  @js.native
  @Factory
  trait TransactWriteItemsOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable]
  }

  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var ResourceArn: ResourceArnString
    var TagKeys: TagKeyList
  }

  /**
    * Represents a request to perform an <code>UpdateItem</code> operation.
    */
  @js.native
  @Factory
  trait Update extends js.Object {
    var Key: Key
    var TableName: TableName
    var UpdateExpression: UpdateExpression
    var ConditionExpression: js.UndefOr[ConditionExpression]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure]
  }

  @js.native
  @Factory
  trait UpdateContinuousBackupsInput extends js.Object {
    var PointInTimeRecoverySpecification: PointInTimeRecoverySpecification
    var TableName: TableName
  }

  @js.native
  @Factory
  trait UpdateContinuousBackupsOutput extends js.Object {
    var ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription]
  }

  @js.native
  @Factory
  trait UpdateContributorInsightsInput extends js.Object {
    var ContributorInsightsAction: ContributorInsightsAction
    var TableName: TableName
    var IndexName: js.UndefOr[IndexName]
  }

  @js.native
  @Factory
  trait UpdateContributorInsightsOutput extends js.Object {
    var ContributorInsightsStatus: js.UndefOr[ContributorInsightsStatus]
    var IndexName: js.UndefOr[IndexName]
    var TableName: js.UndefOr[TableName]
  }

  /**
    * Represents the new provisioned throughput settings to be applied to a global secondary index.
    */
  @js.native
  @Factory
  trait UpdateGlobalSecondaryIndexAction extends js.Object {
    var IndexName: IndexName
    var ProvisionedThroughput: ProvisionedThroughput
  }

  @js.native
  @Factory
  trait UpdateGlobalTableInput extends js.Object {
    var GlobalTableName: TableName
    var ReplicaUpdates: ReplicaUpdateList
  }

  @js.native
  @Factory
  trait UpdateGlobalTableOutput extends js.Object {
    var GlobalTableDescription: js.UndefOr[GlobalTableDescription]
  }

  @js.native
  @Factory
  trait UpdateGlobalTableSettingsInput extends js.Object {
    var GlobalTableName: TableName
    var GlobalTableBillingMode: js.UndefOr[BillingMode]
    var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList]
    var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate]
    var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject]
    var ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList]
  }

  @js.native
  @Factory
  trait UpdateGlobalTableSettingsOutput extends js.Object {
    var GlobalTableName: js.UndefOr[TableName]
    var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList]
  }

  /**
    * Represents the input of an <code>UpdateItem</code> operation.
    */
  @js.native
  @Factory
  trait UpdateItemInput extends js.Object {
    var Key: Key
    var TableName: TableName
    var AttributeUpdates: js.UndefOr[AttributeUpdates]
    var ConditionExpression: js.UndefOr[ConditionExpression]
    var ConditionalOperator: js.UndefOr[ConditionalOperator]
    var Expected: js.UndefOr[ExpectedAttributeMap]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics]
    var ReturnValues: js.UndefOr[ReturnValue]
    var UpdateExpression: js.UndefOr[UpdateExpression]
  }

  /**
    * Represents the output of an <code>UpdateItem</code> operation.
    */
  @js.native
  @Factory
  trait UpdateItemOutput extends js.Object {
    var Attributes: js.UndefOr[AttributeMap]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics]
  }

  /**
    * Represents a replica to be modified.
    */
  @js.native
  @Factory
  trait UpdateReplicationGroupMemberAction extends js.Object {
    var RegionName: RegionName
    var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexList]
    var KMSMasterKeyId: js.UndefOr[KMSMasterKeyId]
    var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughputOverride]
  }

  /**
    * Represents the input of an <code>UpdateTable</code> operation.
    */
  @js.native
  @Factory
  trait UpdateTableInput extends js.Object {
    var TableName: TableName
    var AttributeDefinitions: js.UndefOr[AttributeDefinitions]
    var BillingMode: js.UndefOr[BillingMode]
    var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexUpdateList]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
    var ReplicaUpdates: js.UndefOr[ReplicationGroupUpdateList]
    var SSESpecification: js.UndefOr[SSESpecification]
    var StreamSpecification: js.UndefOr[StreamSpecification]
  }

  /**
    * Represents the output of an <code>UpdateTable</code> operation.
    */
  @js.native
  @Factory
  trait UpdateTableOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  @js.native
  @Factory
  trait UpdateTableReplicaAutoScalingInput extends js.Object {
    var TableName: TableName
    var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexAutoScalingUpdateList]
    var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate]
    var ReplicaUpdates: js.UndefOr[ReplicaAutoScalingUpdateList]
  }

  @js.native
  @Factory
  trait UpdateTableReplicaAutoScalingOutput extends js.Object {
    var TableAutoScalingDescription: js.UndefOr[TableAutoScalingDescription]
  }

  /**
    * Represents the input of an <code>UpdateTimeToLive</code> operation.
    */
  @js.native
  @Factory
  trait UpdateTimeToLiveInput extends js.Object {
    var TableName: TableName
    var TimeToLiveSpecification: TimeToLiveSpecification
  }

  @js.native
  @Factory
  trait UpdateTimeToLiveOutput extends js.Object {
    var TimeToLiveSpecification: js.UndefOr[TimeToLiveSpecification]
  }

  /**
    * Represents an operation to perform - either <code>DeleteItem</code> or <code>PutItem</code>. You can only request one of these operations, not both, in a single <code>WriteRequest</code>. If you do need to perform both of these operations, you need to provide two separate <code>WriteRequest</code> objects.
    */
  @js.native
  @Factory
  trait WriteRequest extends js.Object {
    var DeleteRequest: js.UndefOr[DeleteRequest]
    var PutRequest: js.UndefOr[PutRequest]
  }
}
