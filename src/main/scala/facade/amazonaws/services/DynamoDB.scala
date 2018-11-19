package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object dynamodb {
  type AttributeAction = String
  type AttributeDefinitions = js.Array[AttributeDefinition]
  type AttributeMap = js.Dictionary[AttributeValue]
  type AttributeName = String
  type AttributeNameList = js.Array[AttributeName]
  type AttributeUpdates = js.Dictionary[AttributeValueUpdate]
  type AttributeValueList = js.Array[AttributeValue]
  type AutoScalingPolicyDescriptionList = js.Array[AutoScalingPolicyDescription]
  type AutoScalingPolicyName = String
  type AutoScalingRoleArn = String
  type Backfilling = Boolean
  type BackupArn = String
  type BackupCreationDateTime = js.Date
  type BackupName = String
  type BackupSizeBytes = Double
  type BackupStatus = String
  type BackupSummaries = js.Array[BackupSummary]
  type BackupType = String
  type BackupTypeFilter = String
  type BackupsInputLimit = Int
  type BatchGetRequestMap = js.Dictionary[KeysAndAttributes]
  type BatchGetResponseMap = js.Dictionary[ItemList]
  type BatchWriteItemRequestMap = js.Dictionary[WriteRequests]
  type BinaryAttributeValue = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue = Boolean
  type BooleanObject = Boolean
  type ComparisonOperator = String
  type ConditionExpression = String
  type ConditionalOperator = String
  type ConsistentRead = Boolean
  type ConsumedCapacityMultiple = js.Array[ConsumedCapacity]
  type ConsumedCapacityUnits = Double
  type ContinuousBackupsStatus = String
  type Date = js.Date
  type Endpoints = js.Array[Endpoint]
  type ExpectedAttributeMap = js.Dictionary[ExpectedAttributeValue]
  type ExpressionAttributeNameMap = js.Dictionary[AttributeName]
  type ExpressionAttributeNameVariable = String
  type ExpressionAttributeValueMap = js.Dictionary[AttributeValue]
  type ExpressionAttributeValueVariable = String
  type FilterConditionMap = js.Dictionary[Condition]
  type GlobalSecondaryIndexDescriptionList = js.Array[GlobalSecondaryIndexDescription]
  type GlobalSecondaryIndexList = js.Array[GlobalSecondaryIndex]
  type GlobalSecondaryIndexUpdateList = js.Array[GlobalSecondaryIndexUpdate]
  type GlobalSecondaryIndexes = js.Array[GlobalSecondaryIndexInfo]
  type GlobalTableArnString = String
  type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  type GlobalTableList = js.Array[GlobalTable]
  type GlobalTableStatus = String
  type IndexName = String
  type IndexStatus = String
  type IntegerObject = Int
  type ItemCollectionKeyAttributeMap = js.Dictionary[AttributeValue]
  type ItemCollectionMetricsMultiple = js.Array[ItemCollectionMetrics]
  type ItemCollectionMetricsPerTable = js.Dictionary[ItemCollectionMetricsMultiple]
  type ItemCollectionSizeEstimateBound = Double
  type ItemCollectionSizeEstimateRange = js.Array[ItemCollectionSizeEstimateBound]
  type ItemCount = Double
  type ItemList = js.Array[AttributeMap]
  type KMSMasterKeyArn = String
  type KMSMasterKeyId = String
  type Key = js.Dictionary[AttributeValue]
  type KeyConditions = js.Dictionary[Condition]
  type KeyExpression = String
  type KeyList = js.Array[Key]
  type KeySchema = js.Array[KeySchemaElement]
  type KeySchemaAttributeName = String
  type KeyType = String
  type ListAttributeValue = js.Array[AttributeValue]
  type ListTablesInputLimit = Int
  type LocalSecondaryIndexDescriptionList = js.Array[LocalSecondaryIndexDescription]
  type LocalSecondaryIndexList = js.Array[LocalSecondaryIndex]
  type LocalSecondaryIndexes = js.Array[LocalSecondaryIndexInfo]
  type MapAttributeValue = js.Dictionary[AttributeValue]
  type NextTokenString = String
  type NonKeyAttributeName = String
  type NonKeyAttributeNameList = js.Array[NonKeyAttributeName]
  type NullAttributeValue = Boolean
  type NumberAttributeValue = String
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  type PointInTimeRecoveryStatus = String
  type PositiveIntegerObject = Int
  type PositiveLongObject = Double
  type ProjectionExpression = String
  type ProjectionType = String
  type PutItemInputAttributeMap = js.Dictionary[AttributeValue]
  type RegionName = String
  type ReplicaDescriptionList = js.Array[ReplicaDescription]
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[ReplicaGlobalSecondaryIndexSettingsDescription]
  type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate]
  type ReplicaList = js.Array[Replica]
  type ReplicaSettingsDescriptionList = js.Array[ReplicaSettingsDescription]
  type ReplicaSettingsUpdateList = js.Array[ReplicaSettingsUpdate]
  type ReplicaStatus = String
  type ReplicaUpdateList = js.Array[ReplicaUpdate]
  type ResourceArnString = String
  type RestoreInProgress = Boolean
  type ReturnConsumedCapacity = String
  type ReturnItemCollectionMetrics = String
  type ReturnValue = String
  type SSEEnabled = Boolean
  type SSEStatus = String
  type SSEType = String
  type ScalarAttributeType = String
  type ScanSegment = Int
  type ScanTotalSegments = Int
  type SecondaryIndexesCapacityMap = js.Dictionary[Capacity]
  type Select = String
  type StreamArn = String
  type StreamEnabled = Boolean
  type StreamViewType = String
  type StringAttributeValue = String
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  type TableArn = String
  type TableCreationDateTime = js.Date
  type TableId = String
  type TableName = String
  type TableNameList = js.Array[TableName]
  type TableStatus = String
  type TagKeyList = js.Array[TagKeyString]
  type TagKeyString = String
  type TagList = js.Array[Tag]
  type TagValueString = String
  type TimeRangeLowerBound = js.Date
  type TimeRangeUpperBound = js.Date
  type TimeToLiveAttributeName = String
  type TimeToLiveEnabled = Boolean
  type TimeToLiveStatus = String
  type UpdateExpression = String
  type WriteRequests = js.Array[WriteRequest]
}

package dynamodb {
  @js.native
  @JSImport("aws-sdk", "DynamoDB")
  class DynamoDB(config: AWSConfig) extends js.Object {
    def batchGetItem(params: BatchGetItemInput): Request[BatchGetItemOutput] = js.native
    def batchWriteItem(params: BatchWriteItemInput): Request[BatchWriteItemOutput] = js.native
    def createBackup(params: CreateBackupInput): Request[CreateBackupOutput] = js.native
    def createGlobalTable(params: CreateGlobalTableInput): Request[CreateGlobalTableOutput] = js.native
    def createTable(params: CreateTableInput): Request[CreateTableOutput] = js.native
    def deleteBackup(params: DeleteBackupInput): Request[DeleteBackupOutput] = js.native
    def deleteItem(params: DeleteItemInput): Request[DeleteItemOutput] = js.native
    def deleteTable(params: DeleteTableInput): Request[DeleteTableOutput] = js.native
    def describeBackup(params: DescribeBackupInput): Request[DescribeBackupOutput] = js.native
    def describeContinuousBackups(params: DescribeContinuousBackupsInput): Request[DescribeContinuousBackupsOutput] = js.native
    def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse] = js.native
    def describeGlobalTable(params: DescribeGlobalTableInput): Request[DescribeGlobalTableOutput] = js.native
    def describeGlobalTableSettings(params: DescribeGlobalTableSettingsInput): Request[DescribeGlobalTableSettingsOutput] = js.native
    def describeLimits(params: DescribeLimitsInput): Request[DescribeLimitsOutput] = js.native
    def describeTable(params: DescribeTableInput): Request[DescribeTableOutput] = js.native
    def describeTimeToLive(params: DescribeTimeToLiveInput): Request[DescribeTimeToLiveOutput] = js.native
    def getItem(params: GetItemInput): Request[GetItemOutput] = js.native
    def listBackups(params: ListBackupsInput): Request[ListBackupsOutput] = js.native
    def listGlobalTables(params: ListGlobalTablesInput): Request[ListGlobalTablesOutput] = js.native
    def listTables(params: ListTablesInput): Request[ListTablesOutput] = js.native
    def listTagsOfResource(params: ListTagsOfResourceInput): Request[ListTagsOfResourceOutput] = js.native
    def putItem(params: PutItemInput): Request[PutItemOutput] = js.native
    def query(params: QueryInput): Request[QueryOutput] = js.native
    def restoreTableFromBackup(params: RestoreTableFromBackupInput): Request[RestoreTableFromBackupOutput] = js.native
    def restoreTableToPointInTime(params: RestoreTableToPointInTimeInput): Request[RestoreTableToPointInTimeOutput] = js.native
    def scan(params: ScanInput): Request[ScanOutput] = js.native
    def tagResource(params: TagResourceInput): Request[js.Object] = js.native
    def untagResource(params: UntagResourceInput): Request[js.Object] = js.native
    def updateContinuousBackups(params: UpdateContinuousBackupsInput): Request[UpdateContinuousBackupsOutput] = js.native
    def updateGlobalTable(params: UpdateGlobalTableInput): Request[UpdateGlobalTableOutput] = js.native
    def updateGlobalTableSettings(params: UpdateGlobalTableSettingsInput): Request[UpdateGlobalTableSettingsOutput] = js.native
    def updateItem(params: UpdateItemInput): Request[UpdateItemOutput] = js.native
    def updateTable(params: UpdateTableInput): Request[UpdateTableOutput] = js.native
    def updateTimeToLive(params: UpdateTimeToLiveInput): Request[UpdateTimeToLiveOutput] = js.native
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
    var AttributeName: js.UndefOr[KeySchemaAttributeName]
    var AttributeType: js.UndefOr[ScalarAttributeType]
  }

  object AttributeDefinition {
    def apply(
      AttributeName: js.UndefOr[KeySchemaAttributeName] = js.undefined,
      AttributeType: js.UndefOr[ScalarAttributeType] = js.undefined): AttributeDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "AttributeType" -> AttributeType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeDefinition]
    }
  }

  /**
   * <p>Represents the data for an attribute.</p> <p>Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes">Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
   */
  @js.native
  trait AttributeValue extends js.Object {
    var NS: js.UndefOr[NumberSetAttributeValue]
    var N: js.UndefOr[NumberAttributeValue]
    var M: js.UndefOr[MapAttributeValue]
    var NULL: js.UndefOr[NullAttributeValue]
    var L: js.UndefOr[ListAttributeValue]
    var BS: js.UndefOr[BinarySetAttributeValue]
    var B: js.UndefOr[BinaryAttributeValue]
    var SS: js.UndefOr[StringSetAttributeValue]
    var BOOL: js.UndefOr[BooleanAttributeValue]
    var S: js.UndefOr[StringAttributeValue]
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
      S: js.UndefOr[StringAttributeValue] = js.undefined): AttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NS" -> NS.map { x => x.asInstanceOf[js.Any] },
        "N" -> N.map { x => x.asInstanceOf[js.Any] },
        "M" -> M.map { x => x.asInstanceOf[js.Any] },
        "NULL" -> NULL.map { x => x.asInstanceOf[js.Any] },
        "L" -> L.map { x => x.asInstanceOf[js.Any] },
        "BS" -> BS.map { x => x.asInstanceOf[js.Any] },
        "B" -> B.map { x => x.asInstanceOf[js.Any] },
        "SS" -> SS.map { x => x.asInstanceOf[js.Any] },
        "BOOL" -> BOOL.map { x => x.asInstanceOf[js.Any] },
        "S" -> S.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValue]
    }
    def S(value: StringAttributeValue): AttributeValue = js.Dynamic.literal("S" -> value).asInstanceOf[AttributeValue]
    def NFromInt(value: Int): AttributeValue = js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
    def NFromLong(value: Long): AttributeValue = js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
    def NFromDouble(value: Double): AttributeValue = js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
    def BOOL(value: BooleanAttributeValue): AttributeValue = js.Dynamic.literal("BOOL" -> value).asInstanceOf[AttributeValue]
    def M(value: js.UndefOr[MapAttributeValue]): AttributeValue = if (value.isEmpty) AttributeValue.NULL(true) else js.Dynamic.literal("M" -> value).asInstanceOf[AttributeValue]
    def M(value: Option[MapAttributeValue]): AttributeValue = if (value.isEmpty) AttributeValue.NULL(true) else js.Dynamic.literal("M" -> value.get).asInstanceOf[AttributeValue]
    def MFromMap[T](value: Map[String, T])(implicit valueType: AttributeValueMapper[T]): AttributeValue = AttributeValueMapper.AttributeValueTypeMapT[T].apply(value)
    def L(value: ListAttributeValue): AttributeValue = js.Dynamic.literal("L" -> value).asInstanceOf[AttributeValue]
    def LFromSeq[T](value: Seq[T])(implicit valueType: AttributeValueMapper[T]): AttributeValue = AttributeValueMapper.AttributeValueTypeSeqT[T].apply(value)
    def NULL(value: NullAttributeValue): AttributeValue = js.Dynamic.literal("NULL" -> value).asInstanceOf[AttributeValue]
    def B(value: BinaryAttributeValue): AttributeValue = js.Dynamic.literal("B" -> value.asInstanceOf[js.Any]).asInstanceOf[AttributeValue]
    def NS(value: StringAttributeValue): AttributeValue = js.Dynamic.literal("NS" -> value).asInstanceOf[AttributeValue]
    def BS(value: BinarySetAttributeValue): AttributeValue = js.Dynamic.literal("BS" -> value).asInstanceOf[AttributeValue]
    def SS(value: StringSetAttributeValue): AttributeValue = js.Dynamic.literal("SS" -> value).asInstanceOf[AttributeValue]

    def OptionAsValueOrNull[T](opt: Option[T])(implicit valueType: AttributeValueMapper[T]): AttributeValue = {
      opt match {
        case None => NULL(true)
        case Some(s) => valueType(s)
      }
    }
    def OptionAsList[T](opt: Option[T])(implicit valueType: AttributeValueMapper[T]): AttributeValue = {
      opt match {
        case None => js.Dynamic.literal("L" -> js.Array()).asInstanceOf[AttributeValue]
        case Some(s) => js.Dynamic.literal("L" -> js.Array(valueType(s))).asInstanceOf[AttributeValue]
      }
    }
  }

  /**
   * <p>For the <code>UpdateItem</code> operation, represents the attributes to be modified, the action to perform on each, and the new value for each.</p> <note> <p>You cannot use <code>UpdateItem</code> to update any primary key attributes. Instead, you will need to delete the item, and then use <code>PutItem</code> to create a new item with new attributes.</p> </note> <p>Attribute values cannot be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests with empty values will be rejected with a <code>ValidationException</code> exception.</p>
   */
  @js.native
  trait AttributeValueUpdate extends js.Object {
    var Value: js.UndefOr[AttributeValue]
    var Action: js.UndefOr[AttributeAction]
  }

  object AttributeValueUpdate {
    def apply(
      Value: js.UndefOr[AttributeValue] = js.undefined,
      Action: js.UndefOr[AttributeAction] = js.undefined): AttributeValueUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValueUpdate]
    }
  }

  /**
   * <p>Represents the properties of the scaling policy.</p>
   */
  @js.native
  trait AutoScalingPolicyDescription extends js.Object {
    var PolicyName: js.UndefOr[AutoScalingPolicyName]
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationDescription]
  }

  object AutoScalingPolicyDescription {
    def apply(
      PolicyName: js.UndefOr[AutoScalingPolicyName] = js.undefined,
      TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationDescription] = js.undefined): AutoScalingPolicyDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "TargetTrackingScalingPolicyConfiguration" -> TargetTrackingScalingPolicyConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingPolicyDescription]
    }
  }

  /**
   * <p>Represents the autoscaling policy to be modified.</p>
   */
  @js.native
  trait AutoScalingPolicyUpdate extends js.Object {
    var PolicyName: js.UndefOr[AutoScalingPolicyName]
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate]
  }

  object AutoScalingPolicyUpdate {
    def apply(
      PolicyName: js.UndefOr[AutoScalingPolicyName] = js.undefined,
      TargetTrackingScalingPolicyConfiguration: js.UndefOr[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate] = js.undefined): AutoScalingPolicyUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "TargetTrackingScalingPolicyConfiguration" -> TargetTrackingScalingPolicyConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingPolicyUpdate]
    }
  }

  /**
   * <p>Represents the autoscaling settings for a global table or global secondary index.</p>
   */
  @js.native
  trait AutoScalingSettingsDescription extends js.Object {
    var MaximumUnits: js.UndefOr[PositiveLongObject]
    var AutoScalingDisabled: js.UndefOr[BooleanObject]
    var AutoScalingRoleArn: js.UndefOr[String]
    var ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList]
    var MinimumUnits: js.UndefOr[PositiveLongObject]
  }

  object AutoScalingSettingsDescription {
    def apply(
      MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined,
      AutoScalingRoleArn: js.UndefOr[String] = js.undefined,
      ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList] = js.undefined,
      MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined): AutoScalingSettingsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaximumUnits" -> MaximumUnits.map { x => x.asInstanceOf[js.Any] },
        "AutoScalingDisabled" -> AutoScalingDisabled.map { x => x.asInstanceOf[js.Any] },
        "AutoScalingRoleArn" -> AutoScalingRoleArn.map { x => x.asInstanceOf[js.Any] },
        "ScalingPolicies" -> ScalingPolicies.map { x => x.asInstanceOf[js.Any] },
        "MinimumUnits" -> MinimumUnits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingSettingsDescription]
    }
  }

  /**
   * <p>Represents the autoscaling settings to be modified for a global table or global secondary index.</p>
   */
  @js.native
  trait AutoScalingSettingsUpdate extends js.Object {
    var MaximumUnits: js.UndefOr[PositiveLongObject]
    var AutoScalingDisabled: js.UndefOr[BooleanObject]
    var AutoScalingRoleArn: js.UndefOr[AutoScalingRoleArn]
    var ScalingPolicyUpdate: js.UndefOr[AutoScalingPolicyUpdate]
    var MinimumUnits: js.UndefOr[PositiveLongObject]
  }

  object AutoScalingSettingsUpdate {
    def apply(
      MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined,
      AutoScalingRoleArn: js.UndefOr[AutoScalingRoleArn] = js.undefined,
      ScalingPolicyUpdate: js.UndefOr[AutoScalingPolicyUpdate] = js.undefined,
      MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined): AutoScalingSettingsUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaximumUnits" -> MaximumUnits.map { x => x.asInstanceOf[js.Any] },
        "AutoScalingDisabled" -> AutoScalingDisabled.map { x => x.asInstanceOf[js.Any] },
        "AutoScalingRoleArn" -> AutoScalingRoleArn.map { x => x.asInstanceOf[js.Any] },
        "ScalingPolicyUpdate" -> ScalingPolicyUpdate.map { x => x.asInstanceOf[js.Any] },
        "MinimumUnits" -> MinimumUnits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingSettingsUpdate]
    }
  }

  /**
   * <p>Represents the properties of a target tracking scaling policy.</p>
   */
  @js.native
  trait AutoScalingTargetTrackingScalingPolicyConfigurationDescription extends js.Object {
    var DisableScaleIn: js.UndefOr[BooleanObject]
    var ScaleInCooldown: js.UndefOr[IntegerObject]
    var ScaleOutCooldown: js.UndefOr[IntegerObject]
    var TargetValue: js.UndefOr[Double]
  }

  object AutoScalingTargetTrackingScalingPolicyConfigurationDescription {
    def apply(
      DisableScaleIn: js.UndefOr[BooleanObject] = js.undefined,
      ScaleInCooldown: js.UndefOr[IntegerObject] = js.undefined,
      ScaleOutCooldown: js.UndefOr[IntegerObject] = js.undefined,
      TargetValue: js.UndefOr[Double] = js.undefined): AutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisableScaleIn" -> DisableScaleIn.map { x => x.asInstanceOf[js.Any] },
        "ScaleInCooldown" -> ScaleInCooldown.map { x => x.asInstanceOf[js.Any] },
        "ScaleOutCooldown" -> ScaleOutCooldown.map { x => x.asInstanceOf[js.Any] },
        "TargetValue" -> TargetValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingTargetTrackingScalingPolicyConfigurationDescription]
    }
  }

  /**
   * <p>Represents the settings of a target tracking scaling policy that will be modified.</p>
   */
  @js.native
  trait AutoScalingTargetTrackingScalingPolicyConfigurationUpdate extends js.Object {
    var DisableScaleIn: js.UndefOr[BooleanObject]
    var ScaleInCooldown: js.UndefOr[IntegerObject]
    var ScaleOutCooldown: js.UndefOr[IntegerObject]
    var TargetValue: js.UndefOr[Double]
  }

  object AutoScalingTargetTrackingScalingPolicyConfigurationUpdate {
    def apply(
      DisableScaleIn: js.UndefOr[BooleanObject] = js.undefined,
      ScaleInCooldown: js.UndefOr[IntegerObject] = js.undefined,
      ScaleOutCooldown: js.UndefOr[IntegerObject] = js.undefined,
      TargetValue: js.UndefOr[Double] = js.undefined): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisableScaleIn" -> DisableScaleIn.map { x => x.asInstanceOf[js.Any] },
        "ScaleInCooldown" -> ScaleInCooldown.map { x => x.asInstanceOf[js.Any] },
        "ScaleOutCooldown" -> ScaleOutCooldown.map { x => x.asInstanceOf[js.Any] },
        "TargetValue" -> TargetValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate]
    }
  }

  /**
   * <p>Contains the description of the backup created for the table.</p>
   */
  @js.native
  trait BackupDescription extends js.Object {
    var BackupDetails: js.UndefOr[BackupDetails]
    var SourceTableDetails: js.UndefOr[SourceTableDetails]
    var SourceTableFeatureDetails: js.UndefOr[SourceTableFeatureDetails]
  }

  object BackupDescription {
    def apply(
      BackupDetails: js.UndefOr[BackupDetails] = js.undefined,
      SourceTableDetails: js.UndefOr[SourceTableDetails] = js.undefined,
      SourceTableFeatureDetails: js.UndefOr[SourceTableFeatureDetails] = js.undefined): BackupDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupDetails" -> BackupDetails.map { x => x.asInstanceOf[js.Any] },
        "SourceTableDetails" -> SourceTableDetails.map { x => x.asInstanceOf[js.Any] },
        "SourceTableFeatureDetails" -> SourceTableFeatureDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BackupDescription]
    }
  }

  /**
   * <p>Contains the details of the backup created for the table.</p>
   */
  @js.native
  trait BackupDetails extends js.Object {
    var BackupName: js.UndefOr[BackupName]
    var BackupExpiryDateTime: js.UndefOr[Date]
    var BackupCreationDateTime: js.UndefOr[BackupCreationDateTime]
    var BackupSizeBytes: js.UndefOr[BackupSizeBytes]
    var BackupType: js.UndefOr[BackupType]
    var BackupStatus: js.UndefOr[BackupStatus]
    var BackupArn: js.UndefOr[BackupArn]
  }

  object BackupDetails {
    def apply(
      BackupName: js.UndefOr[BackupName] = js.undefined,
      BackupExpiryDateTime: js.UndefOr[Date] = js.undefined,
      BackupCreationDateTime: js.UndefOr[BackupCreationDateTime] = js.undefined,
      BackupSizeBytes: js.UndefOr[BackupSizeBytes] = js.undefined,
      BackupType: js.UndefOr[BackupType] = js.undefined,
      BackupStatus: js.UndefOr[BackupStatus] = js.undefined,
      BackupArn: js.UndefOr[BackupArn] = js.undefined): BackupDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupName" -> BackupName.map { x => x.asInstanceOf[js.Any] },
        "BackupExpiryDateTime" -> BackupExpiryDateTime.map { x => x.asInstanceOf[js.Any] },
        "BackupCreationDateTime" -> BackupCreationDateTime.map { x => x.asInstanceOf[js.Any] },
        "BackupSizeBytes" -> BackupSizeBytes.map { x => x.asInstanceOf[js.Any] },
        "BackupType" -> BackupType.map { x => x.asInstanceOf[js.Any] },
        "BackupStatus" -> BackupStatus.map { x => x.asInstanceOf[js.Any] },
        "BackupArn" -> BackupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BackupDetails]
    }
  }

  object BackupStatusEnum {
    val CREATING = "CREATING"
    val DELETED = "DELETED"
    val AVAILABLE = "AVAILABLE"

    val values = IndexedSeq(CREATING, DELETED, AVAILABLE)
  }

  /**
   * <p>Contains details for the backup.</p>
   */
  @js.native
  trait BackupSummary extends js.Object {
    var TableId: js.UndefOr[TableId]
    var TableArn: js.UndefOr[TableArn]
    var BackupName: js.UndefOr[BackupName]
    var BackupExpiryDateTime: js.UndefOr[Date]
    var BackupCreationDateTime: js.UndefOr[BackupCreationDateTime]
    var BackupSizeBytes: js.UndefOr[BackupSizeBytes]
    var BackupType: js.UndefOr[BackupType]
    var BackupStatus: js.UndefOr[BackupStatus]
    var BackupArn: js.UndefOr[BackupArn]
    var TableName: js.UndefOr[TableName]
  }

  object BackupSummary {
    def apply(
      TableId: js.UndefOr[TableId] = js.undefined,
      TableArn: js.UndefOr[TableArn] = js.undefined,
      BackupName: js.UndefOr[BackupName] = js.undefined,
      BackupExpiryDateTime: js.UndefOr[Date] = js.undefined,
      BackupCreationDateTime: js.UndefOr[BackupCreationDateTime] = js.undefined,
      BackupSizeBytes: js.UndefOr[BackupSizeBytes] = js.undefined,
      BackupType: js.UndefOr[BackupType] = js.undefined,
      BackupStatus: js.UndefOr[BackupStatus] = js.undefined,
      BackupArn: js.UndefOr[BackupArn] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined): BackupSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableId" -> TableId.map { x => x.asInstanceOf[js.Any] },
        "TableArn" -> TableArn.map { x => x.asInstanceOf[js.Any] },
        "BackupName" -> BackupName.map { x => x.asInstanceOf[js.Any] },
        "BackupExpiryDateTime" -> BackupExpiryDateTime.map { x => x.asInstanceOf[js.Any] },
        "BackupCreationDateTime" -> BackupCreationDateTime.map { x => x.asInstanceOf[js.Any] },
        "BackupSizeBytes" -> BackupSizeBytes.map { x => x.asInstanceOf[js.Any] },
        "BackupType" -> BackupType.map { x => x.asInstanceOf[js.Any] },
        "BackupStatus" -> BackupStatus.map { x => x.asInstanceOf[js.Any] },
        "BackupArn" -> BackupArn.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BackupSummary]
    }
  }

  object BackupTypeEnum {
    val USER = "USER"
    val SYSTEM = "SYSTEM"

    val values = IndexedSeq(USER, SYSTEM)
  }

  object BackupTypeFilterEnum {
    val USER = "USER"
    val SYSTEM = "SYSTEM"
    val ALL = "ALL"

    val values = IndexedSeq(USER, SYSTEM, ALL)
  }

  /**
   * <p>Represents the input of a <code>BatchGetItem</code> operation.</p>
   */
  @js.native
  trait BatchGetItemInput extends js.Object {
    var RequestItems: js.UndefOr[BatchGetRequestMap]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
  }

  object BatchGetItemInput {
    def apply(
      RequestItems: js.UndefOr[BatchGetRequestMap] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined): BatchGetItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequestItems" -> RequestItems.map { x => x.asInstanceOf[js.Any] },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetItemInput]
    }
  }

  /**
   * <p>Represents the output of a <code>BatchGetItem</code> operation.</p>
   */
  @js.native
  trait BatchGetItemOutput extends js.Object {
    var Responses: js.UndefOr[BatchGetResponseMap]
    var UnprocessedKeys: js.UndefOr[BatchGetRequestMap]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple]
  }

  object BatchGetItemOutput {
    def apply(
      Responses: js.UndefOr[BatchGetResponseMap] = js.undefined,
      UnprocessedKeys: js.UndefOr[BatchGetRequestMap] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined): BatchGetItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Responses" -> Responses.map { x => x.asInstanceOf[js.Any] },
        "UnprocessedKeys" -> UnprocessedKeys.map { x => x.asInstanceOf[js.Any] },
        "ConsumedCapacity" -> ConsumedCapacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetItemOutput]
    }
  }

  /**
   * <p>Represents the input of a <code>BatchWriteItem</code> operation.</p>
   */
  @js.native
  trait BatchWriteItemInput extends js.Object {
    var RequestItems: js.UndefOr[BatchWriteItemRequestMap]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics]
  }

  object BatchWriteItemInput {
    def apply(
      RequestItems: js.UndefOr[BatchWriteItemRequestMap] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
      ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined): BatchWriteItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequestItems" -> RequestItems.map { x => x.asInstanceOf[js.Any] },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x.asInstanceOf[js.Any] },
        "ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteItemInput]
    }
  }

  /**
   * <p>Represents the output of a <code>BatchWriteItem</code> operation.</p>
   */
  @js.native
  trait BatchWriteItemOutput extends js.Object {
    var UnprocessedItems: js.UndefOr[BatchWriteItemRequestMap]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple]
  }

  object BatchWriteItemOutput {
    def apply(
      UnprocessedItems: js.UndefOr[BatchWriteItemRequestMap] = js.undefined,
      ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined): BatchWriteItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UnprocessedItems" -> UnprocessedItems.map { x => x.asInstanceOf[js.Any] },
        "ItemCollectionMetrics" -> ItemCollectionMetrics.map { x => x.asInstanceOf[js.Any] },
        "ConsumedCapacity" -> ConsumedCapacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteItemOutput]
    }
  }

  /**
   * <p>Represents the amount of provisioned throughput capacity consumed on a table or an index.</p>
   */
  @js.native
  trait Capacity extends js.Object {
    var CapacityUnits: js.UndefOr[ConsumedCapacityUnits]
  }

  object Capacity {
    def apply(
      CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined): Capacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityUnits" -> CapacityUnits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    val NOT_NULL = "NOT_NULL"
    val NULL = "NULL"
    val CONTAINS = "CONTAINS"
    val NOT_CONTAINS = "NOT_CONTAINS"
    val BEGINS_WITH = "BEGINS_WITH"

    val values = IndexedSeq(EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH)
  }

  /**
   * <p>Represents the selection criteria for a <code>Query</code> or <code>Scan</code> operation:</p> <ul> <li> <p>For a <code>Query</code> operation, <code>Condition</code> is used for specifying the <code>KeyConditions</code> to use when querying a table or an index. For <code>KeyConditions</code>, only the following comparison operators are supported:</p> <p> <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code> </p> <p> <code>Condition</code> is also used in a <code>QueryFilter</code>, which evaluates the query results and returns only the desired values.</p> </li> <li> <p>For a <code>Scan</code> operation, <code>Condition</code> is used in a <code>ScanFilter</code>, which evaluates the scan results and returns only the desired values.</p> </li> </ul>
   */
  @js.native
  trait Condition extends js.Object {
    var AttributeValueList: js.UndefOr[AttributeValueList]
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
  }

  object Condition {
    def apply(
      AttributeValueList: js.UndefOr[AttributeValueList] = js.undefined,
      ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined): Condition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeValueList" -> AttributeValueList.map { x => x.asInstanceOf[js.Any] },
        "ComparisonOperator" -> ComparisonOperator.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Condition]
    }
  }

  object ConditionalOperatorEnum {
    val AND = "AND"
    val OR = "OR"

    val values = IndexedSeq(AND, OR)
  }

  /**
   * <p>The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the request asked for it. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
   */
  @js.native
  trait ConsumedCapacity extends js.Object {
    var LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap]
    var CapacityUnits: js.UndefOr[ConsumedCapacityUnits]
    var GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap]
    var Table: js.UndefOr[Capacity]
    var TableName: js.UndefOr[TableName]
  }

  object ConsumedCapacity {
    def apply(
      LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined,
      CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined,
      GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined,
      Table: js.UndefOr[Capacity] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined): ConsumedCapacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocalSecondaryIndexes" -> LocalSecondaryIndexes.map { x => x.asInstanceOf[js.Any] },
        "CapacityUnits" -> CapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "GlobalSecondaryIndexes" -> GlobalSecondaryIndexes.map { x => x.asInstanceOf[js.Any] },
        "Table" -> Table.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConsumedCapacity]
    }
  }

  /**
   * <p>Represents the continuous backups and point in time recovery settings on the table.</p>
   */
  @js.native
  trait ContinuousBackupsDescription extends js.Object {
    var ContinuousBackupsStatus: js.UndefOr[ContinuousBackupsStatus]
    var PointInTimeRecoveryDescription: js.UndefOr[PointInTimeRecoveryDescription]
  }

  object ContinuousBackupsDescription {
    def apply(
      ContinuousBackupsStatus: js.UndefOr[ContinuousBackupsStatus] = js.undefined,
      PointInTimeRecoveryDescription: js.UndefOr[PointInTimeRecoveryDescription] = js.undefined): ContinuousBackupsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContinuousBackupsStatus" -> ContinuousBackupsStatus.map { x => x.asInstanceOf[js.Any] },
        "PointInTimeRecoveryDescription" -> PointInTimeRecoveryDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinuousBackupsDescription]
    }
  }

  object ContinuousBackupsStatusEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  @js.native
  trait CreateBackupInput extends js.Object {
    var TableName: js.UndefOr[TableName]
    var BackupName: js.UndefOr[BackupName]
  }

  object CreateBackupInput {
    def apply(
      TableName: js.UndefOr[TableName] = js.undefined,
      BackupName: js.UndefOr[BackupName] = js.undefined): CreateBackupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "BackupName" -> BackupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBackupInput]
    }
  }

  @js.native
  trait CreateBackupOutput extends js.Object {
    var BackupDetails: js.UndefOr[BackupDetails]
  }

  object CreateBackupOutput {
    def apply(
      BackupDetails: js.UndefOr[BackupDetails] = js.undefined): CreateBackupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupDetails" -> BackupDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBackupOutput]
    }
  }

  /**
   * <p>Represents a new global secondary index to be added to an existing table.</p>
   */
  @js.native
  trait CreateGlobalSecondaryIndexAction extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var KeySchema: js.UndefOr[KeySchema]
    var Projection: js.UndefOr[Projection]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
  }

  object CreateGlobalSecondaryIndexAction {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      Projection: js.UndefOr[Projection] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined): CreateGlobalSecondaryIndexAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "KeySchema" -> KeySchema.map { x => x.asInstanceOf[js.Any] },
        "Projection" -> Projection.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGlobalSecondaryIndexAction]
    }
  }

  @js.native
  trait CreateGlobalTableInput extends js.Object {
    var GlobalTableName: js.UndefOr[TableName]
    var ReplicationGroup: js.UndefOr[ReplicaList]
  }

  object CreateGlobalTableInput {
    def apply(
      GlobalTableName: js.UndefOr[TableName] = js.undefined,
      ReplicationGroup: js.UndefOr[ReplicaList] = js.undefined): CreateGlobalTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableName" -> GlobalTableName.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroup" -> ReplicationGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGlobalTableInput]
    }
  }

  @js.native
  trait CreateGlobalTableOutput extends js.Object {
    var GlobalTableDescription: js.UndefOr[GlobalTableDescription]
  }

  object CreateGlobalTableOutput {
    def apply(
      GlobalTableDescription: js.UndefOr[GlobalTableDescription] = js.undefined): CreateGlobalTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableDescription" -> GlobalTableDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGlobalTableOutput]
    }
  }

  /**
   * <p>Represents a replica to be added.</p>
   */
  @js.native
  trait CreateReplicaAction extends js.Object {
    var RegionName: js.UndefOr[RegionName]
  }

  object CreateReplicaAction {
    def apply(
      RegionName: js.UndefOr[RegionName] = js.undefined): CreateReplicaAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegionName" -> RegionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicaAction]
    }
  }

  /**
   * <p>Represents the input of a <code>CreateTable</code> operation.</p>
   */
  @js.native
  trait CreateTableInput extends js.Object {
    var StreamSpecification: js.UndefOr[StreamSpecification]
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexList]
    var SSESpecification: js.UndefOr[SSESpecification]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
    var AttributeDefinitions: js.UndefOr[AttributeDefinitions]
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexList]
    var KeySchema: js.UndefOr[KeySchema]
    var TableName: js.UndefOr[TableName]
  }

  object CreateTableInput {
    def apply(
      StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined,
      LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexList] = js.undefined,
      SSESpecification: js.UndefOr[SSESpecification] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined,
      AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined,
      GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexList] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined): CreateTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamSpecification" -> StreamSpecification.map { x => x.asInstanceOf[js.Any] },
        "LocalSecondaryIndexes" -> LocalSecondaryIndexes.map { x => x.asInstanceOf[js.Any] },
        "SSESpecification" -> SSESpecification.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x => x.asInstanceOf[js.Any] },
        "AttributeDefinitions" -> AttributeDefinitions.map { x => x.asInstanceOf[js.Any] },
        "GlobalSecondaryIndexes" -> GlobalSecondaryIndexes.map { x => x.asInstanceOf[js.Any] },
        "KeySchema" -> KeySchema.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTableInput]
    }
  }

  /**
   * <p>Represents the output of a <code>CreateTable</code> operation.</p>
   */
  @js.native
  trait CreateTableOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  object CreateTableOutput {
    def apply(
      TableDescription: js.UndefOr[TableDescription] = js.undefined): CreateTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableDescription" -> TableDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTableOutput]
    }
  }

  @js.native
  trait DeleteBackupInput extends js.Object {
    var BackupArn: js.UndefOr[BackupArn]
  }

  object DeleteBackupInput {
    def apply(
      BackupArn: js.UndefOr[BackupArn] = js.undefined): DeleteBackupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupArn" -> BackupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBackupInput]
    }
  }

  @js.native
  trait DeleteBackupOutput extends js.Object {
    var BackupDescription: js.UndefOr[BackupDescription]
  }

  object DeleteBackupOutput {
    def apply(
      BackupDescription: js.UndefOr[BackupDescription] = js.undefined): DeleteBackupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupDescription" -> BackupDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBackupOutput]
    }
  }

  /**
   * <p>Represents a global secondary index to be deleted from an existing table.</p>
   */
  @js.native
  trait DeleteGlobalSecondaryIndexAction extends js.Object {
    var IndexName: js.UndefOr[IndexName]
  }

  object DeleteGlobalSecondaryIndexAction {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined): DeleteGlobalSecondaryIndexAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGlobalSecondaryIndexAction]
    }
  }

  /**
   * <p>Represents the input of a <code>DeleteItem</code> operation.</p>
   */
  @js.native
  trait DeleteItemInput extends js.Object {
    var ConditionalOperator: js.UndefOr[ConditionalOperator]
    var Expected: js.UndefOr[ExpectedAttributeMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics]
    var ReturnValues: js.UndefOr[ReturnValue]
    var ConditionExpression: js.UndefOr[ConditionExpression]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var TableName: js.UndefOr[TableName]
    var Key: js.UndefOr[Key]
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
      Key: js.UndefOr[Key] = js.undefined): DeleteItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConditionalOperator" -> ConditionalOperator.map { x => x.asInstanceOf[js.Any] },
        "Expected" -> Expected.map { x => x.asInstanceOf[js.Any] },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x => x.asInstanceOf[js.Any] },
        "ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x => x.asInstanceOf[js.Any] },
        "ReturnValues" -> ReturnValues.map { x => x.asInstanceOf[js.Any] },
        "ConditionExpression" -> ConditionExpression.map { x => x.asInstanceOf[js.Any] },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x.asInstanceOf[js.Any] },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteItemInput]
    }
  }

  /**
   * <p>Represents the output of a <code>DeleteItem</code> operation.</p>
   */
  @js.native
  trait DeleteItemOutput extends js.Object {
    var Attributes: js.UndefOr[AttributeMap]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics]
  }

  object DeleteItemOutput {
    def apply(
      Attributes: js.UndefOr[AttributeMap] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
      ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics] = js.undefined): DeleteItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "ConsumedCapacity" -> ConsumedCapacity.map { x => x.asInstanceOf[js.Any] },
        "ItemCollectionMetrics" -> ItemCollectionMetrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteItemOutput]
    }
  }

  /**
   * <p>Represents a replica to be removed.</p>
   */
  @js.native
  trait DeleteReplicaAction extends js.Object {
    var RegionName: js.UndefOr[RegionName]
  }

  object DeleteReplicaAction {
    def apply(
      RegionName: js.UndefOr[RegionName] = js.undefined): DeleteReplicaAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegionName" -> RegionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicaAction]
    }
  }

  /**
   * <p>Represents a request to perform a <code>DeleteItem</code> operation on an item.</p>
   */
  @js.native
  trait DeleteRequest extends js.Object {
    var Key: js.UndefOr[Key]
  }

  object DeleteRequest {
    def apply(
      Key: js.UndefOr[Key] = js.undefined): DeleteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRequest]
    }
  }

  /**
   * <p>Represents the input of a <code>DeleteTable</code> operation.</p>
   */
  @js.native
  trait DeleteTableInput extends js.Object {
    var TableName: js.UndefOr[TableName]
  }

  object DeleteTableInput {
    def apply(
      TableName: js.UndefOr[TableName] = js.undefined): DeleteTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTableInput]
    }
  }

  /**
   * <p>Represents the output of a <code>DeleteTable</code> operation.</p>
   */
  @js.native
  trait DeleteTableOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  object DeleteTableOutput {
    def apply(
      TableDescription: js.UndefOr[TableDescription] = js.undefined): DeleteTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableDescription" -> TableDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTableOutput]
    }
  }

  @js.native
  trait DescribeBackupInput extends js.Object {
    var BackupArn: js.UndefOr[BackupArn]
  }

  object DescribeBackupInput {
    def apply(
      BackupArn: js.UndefOr[BackupArn] = js.undefined): DescribeBackupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupArn" -> BackupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBackupInput]
    }
  }

  @js.native
  trait DescribeBackupOutput extends js.Object {
    var BackupDescription: js.UndefOr[BackupDescription]
  }

  object DescribeBackupOutput {
    def apply(
      BackupDescription: js.UndefOr[BackupDescription] = js.undefined): DescribeBackupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupDescription" -> BackupDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBackupOutput]
    }
  }

  @js.native
  trait DescribeContinuousBackupsInput extends js.Object {
    var TableName: js.UndefOr[TableName]
  }

  object DescribeContinuousBackupsInput {
    def apply(
      TableName: js.UndefOr[TableName] = js.undefined): DescribeContinuousBackupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeContinuousBackupsInput]
    }
  }

  @js.native
  trait DescribeContinuousBackupsOutput extends js.Object {
    var ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription]
  }

  object DescribeContinuousBackupsOutput {
    def apply(
      ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription] = js.undefined): DescribeContinuousBackupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContinuousBackupsDescription" -> ContinuousBackupsDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeContinuousBackupsOutput]
    }
  }

  @js.native
  trait DescribeEndpointsRequest extends js.Object {

  }

  object DescribeEndpointsRequest {
    def apply(): DescribeEndpointsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointsRequest]
    }
  }

  @js.native
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: js.UndefOr[Endpoints]
  }

  object DescribeEndpointsResponse {
    def apply(
      Endpoints: js.UndefOr[Endpoints] = js.undefined): DescribeEndpointsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoints" -> Endpoints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointsResponse]
    }
  }

  @js.native
  trait DescribeGlobalTableInput extends js.Object {
    var GlobalTableName: js.UndefOr[TableName]
  }

  object DescribeGlobalTableInput {
    def apply(
      GlobalTableName: js.UndefOr[TableName] = js.undefined): DescribeGlobalTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableName" -> GlobalTableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGlobalTableInput]
    }
  }

  @js.native
  trait DescribeGlobalTableOutput extends js.Object {
    var GlobalTableDescription: js.UndefOr[GlobalTableDescription]
  }

  object DescribeGlobalTableOutput {
    def apply(
      GlobalTableDescription: js.UndefOr[GlobalTableDescription] = js.undefined): DescribeGlobalTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableDescription" -> GlobalTableDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGlobalTableOutput]
    }
  }

  @js.native
  trait DescribeGlobalTableSettingsInput extends js.Object {
    var GlobalTableName: js.UndefOr[TableName]
  }

  object DescribeGlobalTableSettingsInput {
    def apply(
      GlobalTableName: js.UndefOr[TableName] = js.undefined): DescribeGlobalTableSettingsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableName" -> GlobalTableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGlobalTableSettingsInput]
    }
  }

  @js.native
  trait DescribeGlobalTableSettingsOutput extends js.Object {
    var GlobalTableName: js.UndefOr[TableName]
    var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList]
  }

  object DescribeGlobalTableSettingsOutput {
    def apply(
      GlobalTableName: js.UndefOr[TableName] = js.undefined,
      ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.undefined): DescribeGlobalTableSettingsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableName" -> GlobalTableName.map { x => x.asInstanceOf[js.Any] },
        "ReplicaSettings" -> ReplicaSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGlobalTableSettingsOutput]
    }
  }

  /**
   * <p>Represents the input of a <code>DescribeLimits</code> operation. Has no content.</p>
   */
  @js.native
  trait DescribeLimitsInput extends js.Object {

  }

  object DescribeLimitsInput {
    def apply(): DescribeLimitsInput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLimitsInput]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeLimits</code> operation.</p>
   */
  @js.native
  trait DescribeLimitsOutput extends js.Object {
    var AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject]
    var TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  object DescribeLimitsOutput {
    def apply(
      AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined): DescribeLimitsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountMaxReadCapacityUnits" -> AccountMaxReadCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "AccountMaxWriteCapacityUnits" -> AccountMaxWriteCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "TableMaxReadCapacityUnits" -> TableMaxReadCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "TableMaxWriteCapacityUnits" -> TableMaxWriteCapacityUnits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLimitsOutput]
    }
  }

  /**
   * <p>Represents the input of a <code>DescribeTable</code> operation.</p>
   */
  @js.native
  trait DescribeTableInput extends js.Object {
    var TableName: js.UndefOr[TableName]
  }

  object DescribeTableInput {
    def apply(
      TableName: js.UndefOr[TableName] = js.undefined): DescribeTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTableInput]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeTable</code> operation.</p>
   */
  @js.native
  trait DescribeTableOutput extends js.Object {
    var Table: js.UndefOr[TableDescription]
  }

  object DescribeTableOutput {
    def apply(
      Table: js.UndefOr[TableDescription] = js.undefined): DescribeTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Table" -> Table.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTableOutput]
    }
  }

  @js.native
  trait DescribeTimeToLiveInput extends js.Object {
    var TableName: js.UndefOr[TableName]
  }

  object DescribeTimeToLiveInput {
    def apply(
      TableName: js.UndefOr[TableName] = js.undefined): DescribeTimeToLiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTimeToLiveInput]
    }
  }

  @js.native
  trait DescribeTimeToLiveOutput extends js.Object {
    var TimeToLiveDescription: js.UndefOr[TimeToLiveDescription]
  }

  object DescribeTimeToLiveOutput {
    def apply(
      TimeToLiveDescription: js.UndefOr[TimeToLiveDescription] = js.undefined): DescribeTimeToLiveOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimeToLiveDescription" -> TimeToLiveDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTimeToLiveOutput]
    }
  }

  @js.native
  trait Endpoint extends js.Object {
    var Address: js.UndefOr[String]
    var CachePeriodInMinutes: js.UndefOr[Double]
  }

  object Endpoint {
    def apply(
      Address: js.UndefOr[String] = js.undefined,
      CachePeriodInMinutes: js.UndefOr[Double] = js.undefined): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x => x.asInstanceOf[js.Any] },
        "CachePeriodInMinutes" -> CachePeriodInMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
    }
  }

  /**
   * <p>Represents a condition to be compared with an attribute value. This condition can be used with <code>DeleteItem</code>, <code>PutItem</code> or <code>UpdateItem</code> operations; if the comparison evaluates to true, the operation succeeds; if not, the operation fails. You can use <code>ExpectedAttributeValue</code> in one of two different ways:</p> <ul> <li> <p>Use <code>AttributeValueList</code> to specify one or more values to compare against an attribute. Use <code>ComparisonOperator</code> to specify how you want to perform the comparison. If the comparison evaluates to true, then the conditional operation succeeds.</p> </li> <li> <p>Use <code>Value</code> to specify a value that DynamoDB will compare against an attribute. If the values match, then <code>ExpectedAttributeValue</code> evaluates to true and the conditional operation succeeds. Optionally, you can also set <code>Exists</code> to false, indicating that you <i>do not</i> expect to find the attribute value in the table. In this case, the conditional operation succeeds only if the comparison evaluates to false.</p> </li> </ul> <p> <code>Value</code> and <code>Exists</code> are incompatible with <code>AttributeValueList</code> and <code>ComparisonOperator</code>. Note that if you use both sets of parameters at once, DynamoDB will return a <code>ValidationException</code> exception.</p>
   */
  @js.native
  trait ExpectedAttributeValue extends js.Object {
    var Value: js.UndefOr[AttributeValue]
    var Exists: js.UndefOr[BooleanObject]
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var AttributeValueList: js.UndefOr[AttributeValueList]
  }

  object ExpectedAttributeValue {
    def apply(
      Value: js.UndefOr[AttributeValue] = js.undefined,
      Exists: js.UndefOr[BooleanObject] = js.undefined,
      ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
      AttributeValueList: js.UndefOr[AttributeValueList] = js.undefined): ExpectedAttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Exists" -> Exists.map { x => x.asInstanceOf[js.Any] },
        "ComparisonOperator" -> ComparisonOperator.map { x => x.asInstanceOf[js.Any] },
        "AttributeValueList" -> AttributeValueList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExpectedAttributeValue]
    }
  }

  /**
   * <p>Represents the input of a <code>GetItem</code> operation.</p>
   */
  @js.native
  trait GetItemInput extends js.Object {
    var AttributesToGet: js.UndefOr[AttributeNameList]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ConsistentRead: js.UndefOr[ConsistentRead]
    var ProjectionExpression: js.UndefOr[ProjectionExpression]
    var TableName: js.UndefOr[TableName]
    var Key: js.UndefOr[Key]
  }

  object GetItemInput {
    def apply(
      AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined,
      ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
      ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined,
      ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined,
      Key: js.UndefOr[Key] = js.undefined): GetItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributesToGet" -> AttributesToGet.map { x => x.asInstanceOf[js.Any] },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x.asInstanceOf[js.Any] },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x.asInstanceOf[js.Any] },
        "ConsistentRead" -> ConsistentRead.map { x => x.asInstanceOf[js.Any] },
        "ProjectionExpression" -> ProjectionExpression.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetItemInput]
    }
  }

  /**
   * <p>Represents the output of a <code>GetItem</code> operation.</p>
   */
  @js.native
  trait GetItemOutput extends js.Object {
    var Item: js.UndefOr[AttributeMap]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
  }

  object GetItemOutput {
    def apply(
      Item: js.UndefOr[AttributeMap] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined): GetItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Item" -> Item.map { x => x.asInstanceOf[js.Any] },
        "ConsumedCapacity" -> ConsumedCapacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetItemOutput]
    }
  }

  /**
   * <p>Represents the properties of a global secondary index.</p>
   */
  @js.native
  trait GlobalSecondaryIndex extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var KeySchema: js.UndefOr[KeySchema]
    var Projection: js.UndefOr[Projection]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
  }

  object GlobalSecondaryIndex {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      Projection: js.UndefOr[Projection] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined): GlobalSecondaryIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "KeySchema" -> KeySchema.map { x => x.asInstanceOf[js.Any] },
        "Projection" -> Projection.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSecondaryIndex]
    }
  }

  /**
   * <p>Represents the properties of a global secondary index.</p>
   */
  @js.native
  trait GlobalSecondaryIndexDescription extends js.Object {
    var Backfilling: js.UndefOr[Backfilling]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription]
    var IndexArn: js.UndefOr[String]
    var ItemCount: js.UndefOr[Double]
    var IndexSizeBytes: js.UndefOr[Double]
    var KeySchema: js.UndefOr[KeySchema]
    var IndexStatus: js.UndefOr[IndexStatus]
    var IndexName: js.UndefOr[IndexName]
    var Projection: js.UndefOr[Projection]
  }

  object GlobalSecondaryIndexDescription {
    def apply(
      Backfilling: js.UndefOr[Backfilling] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined,
      IndexArn: js.UndefOr[String] = js.undefined,
      ItemCount: js.UndefOr[Double] = js.undefined,
      IndexSizeBytes: js.UndefOr[Double] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      IndexStatus: js.UndefOr[IndexStatus] = js.undefined,
      IndexName: js.UndefOr[IndexName] = js.undefined,
      Projection: js.UndefOr[Projection] = js.undefined): GlobalSecondaryIndexDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Backfilling" -> Backfilling.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x => x.asInstanceOf[js.Any] },
        "IndexArn" -> IndexArn.map { x => x.asInstanceOf[js.Any] },
        "ItemCount" -> ItemCount.map { x => x.asInstanceOf[js.Any] },
        "IndexSizeBytes" -> IndexSizeBytes.map { x => x.asInstanceOf[js.Any] },
        "KeySchema" -> KeySchema.map { x => x.asInstanceOf[js.Any] },
        "IndexStatus" -> IndexStatus.map { x => x.asInstanceOf[js.Any] },
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "Projection" -> Projection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSecondaryIndexDescription]
    }
  }

  /**
   * <p>Represents the properties of a global secondary index for the table when the backup was created.</p>
   */
  @js.native
  trait GlobalSecondaryIndexInfo extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var KeySchema: js.UndefOr[KeySchema]
    var Projection: js.UndefOr[Projection]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
  }

  object GlobalSecondaryIndexInfo {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      Projection: js.UndefOr[Projection] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined): GlobalSecondaryIndexInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "KeySchema" -> KeySchema.map { x => x.asInstanceOf[js.Any] },
        "Projection" -> Projection.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSecondaryIndexInfo]
    }
  }

  /**
   * <p>Represents one of the following:</p> <ul> <li> <p>A new global secondary index to be added to an existing table.</p> </li> <li> <p>New provisioned throughput parameters for an existing global secondary index.</p> </li> <li> <p>An existing global secondary index to be removed from an existing table.</p> </li> </ul>
   */
  @js.native
  trait GlobalSecondaryIndexUpdate extends js.Object {
    var Update: js.UndefOr[UpdateGlobalSecondaryIndexAction]
    var Create: js.UndefOr[CreateGlobalSecondaryIndexAction]
    var Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction]
  }

  object GlobalSecondaryIndexUpdate {
    def apply(
      Update: js.UndefOr[UpdateGlobalSecondaryIndexAction] = js.undefined,
      Create: js.UndefOr[CreateGlobalSecondaryIndexAction] = js.undefined,
      Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction] = js.undefined): GlobalSecondaryIndexUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Update" -> Update.map { x => x.asInstanceOf[js.Any] },
        "Create" -> Create.map { x => x.asInstanceOf[js.Any] },
        "Delete" -> Delete.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSecondaryIndexUpdate]
    }
  }

  /**
   * <p>Represents the properties of a global table.</p>
   */
  @js.native
  trait GlobalTable extends js.Object {
    var GlobalTableName: js.UndefOr[TableName]
    var ReplicationGroup: js.UndefOr[ReplicaList]
  }

  object GlobalTable {
    def apply(
      GlobalTableName: js.UndefOr[TableName] = js.undefined,
      ReplicationGroup: js.UndefOr[ReplicaList] = js.undefined): GlobalTable = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableName" -> GlobalTableName.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroup" -> ReplicationGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalTable]
    }
  }

  /**
   * <p>Contains details about the global table.</p>
   */
  @js.native
  trait GlobalTableDescription extends js.Object {
    var GlobalTableArn: js.UndefOr[GlobalTableArnString]
    var GlobalTableName: js.UndefOr[TableName]
    var ReplicationGroup: js.UndefOr[ReplicaDescriptionList]
    var CreationDateTime: js.UndefOr[Date]
    var GlobalTableStatus: js.UndefOr[GlobalTableStatus]
  }

  object GlobalTableDescription {
    def apply(
      GlobalTableArn: js.UndefOr[GlobalTableArnString] = js.undefined,
      GlobalTableName: js.UndefOr[TableName] = js.undefined,
      ReplicationGroup: js.UndefOr[ReplicaDescriptionList] = js.undefined,
      CreationDateTime: js.UndefOr[Date] = js.undefined,
      GlobalTableStatus: js.UndefOr[GlobalTableStatus] = js.undefined): GlobalTableDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableArn" -> GlobalTableArn.map { x => x.asInstanceOf[js.Any] },
        "GlobalTableName" -> GlobalTableName.map { x => x.asInstanceOf[js.Any] },
        "ReplicationGroup" -> ReplicationGroup.map { x => x.asInstanceOf[js.Any] },
        "CreationDateTime" -> CreationDateTime.map { x => x.asInstanceOf[js.Any] },
        "GlobalTableStatus" -> GlobalTableStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalTableDescription]
    }
  }

  /**
   * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
   */
  @js.native
  trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject]
    var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate]
  }

  object GlobalTableGlobalSecondaryIndexSettingsUpdate {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined,
      ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined): GlobalTableGlobalSecondaryIndexSettingsUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedWriteCapacityUnits" -> ProvisionedWriteCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedWriteCapacityAutoScalingSettingsUpdate" -> ProvisionedWriteCapacityAutoScalingSettingsUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalTableGlobalSecondaryIndexSettingsUpdate]
    }
  }

  object GlobalTableStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE = "ACTIVE"
    val DELETING = "DELETING"
    val UPDATING = "UPDATING"

    val values = IndexedSeq(CREATING, ACTIVE, DELETING, UPDATING)
  }

  object IndexStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val ACTIVE = "ACTIVE"

    val values = IndexedSeq(CREATING, UPDATING, DELETING, ACTIVE)
  }

  /**
   * <p>Information about item collections, if any, that were affected by the operation. <code>ItemCollectionMetrics</code> is only returned if the request asked for it. If the table does not have any local secondary indexes, this information is not returned in the response.</p>
   */
  @js.native
  trait ItemCollectionMetrics extends js.Object {
    var ItemCollectionKey: js.UndefOr[ItemCollectionKeyAttributeMap]
    var SizeEstimateRangeGB: js.UndefOr[ItemCollectionSizeEstimateRange]
  }

  object ItemCollectionMetrics {
    def apply(
      ItemCollectionKey: js.UndefOr[ItemCollectionKeyAttributeMap] = js.undefined,
      SizeEstimateRangeGB: js.UndefOr[ItemCollectionSizeEstimateRange] = js.undefined): ItemCollectionMetrics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ItemCollectionKey" -> ItemCollectionKey.map { x => x.asInstanceOf[js.Any] },
        "SizeEstimateRangeGB" -> SizeEstimateRangeGB.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ItemCollectionMetrics]
    }
  }

  /**
   * <p>Represents <i>a single element</i> of a key schema. A key schema specifies the attributes that make up the primary key of a table, or the key attributes of an index.</p> <p>A <code>KeySchemaElement</code> represents exactly one attribute of the primary key. For example, a simple primary key would be represented by one <code>KeySchemaElement</code> (for the partition key). A composite primary key would require one <code>KeySchemaElement</code> for the partition key, and another <code>KeySchemaElement</code> for the sort key.</p> <p>A <code>KeySchemaElement</code> must be a scalar, top-level attribute (not a nested attribute). The data type must be one of String, Number, or Binary. The attribute cannot be nested within a List or a Map.</p>
   */
  @js.native
  trait KeySchemaElement extends js.Object {
    var AttributeName: js.UndefOr[KeySchemaAttributeName]
    var KeyType: js.UndefOr[KeyType]
  }

  object KeySchemaElement {
    def apply(
      AttributeName: js.UndefOr[KeySchemaAttributeName] = js.undefined,
      KeyType: js.UndefOr[KeyType] = js.undefined): KeySchemaElement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "KeyType" -> KeyType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Keys: js.UndefOr[KeyList]
    var AttributesToGet: js.UndefOr[AttributeNameList]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ConsistentRead: js.UndefOr[ConsistentRead]
    var ProjectionExpression: js.UndefOr[ProjectionExpression]
  }

  object KeysAndAttributes {
    def apply(
      Keys: js.UndefOr[KeyList] = js.undefined,
      AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined,
      ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
      ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined,
      ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined): KeysAndAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Keys" -> Keys.map { x => x.asInstanceOf[js.Any] },
        "AttributesToGet" -> AttributesToGet.map { x => x.asInstanceOf[js.Any] },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x.asInstanceOf[js.Any] },
        "ConsistentRead" -> ConsistentRead.map { x => x.asInstanceOf[js.Any] },
        "ProjectionExpression" -> ProjectionExpression.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeysAndAttributes]
    }
  }

  @js.native
  trait ListBackupsInput extends js.Object {
    var TimeRangeUpperBound: js.UndefOr[TimeRangeUpperBound]
    var ExclusiveStartBackupArn: js.UndefOr[BackupArn]
    var Limit: js.UndefOr[BackupsInputLimit]
    var TimeRangeLowerBound: js.UndefOr[TimeRangeLowerBound]
    var BackupType: js.UndefOr[BackupTypeFilter]
    var TableName: js.UndefOr[TableName]
  }

  object ListBackupsInput {
    def apply(
      TimeRangeUpperBound: js.UndefOr[TimeRangeUpperBound] = js.undefined,
      ExclusiveStartBackupArn: js.UndefOr[BackupArn] = js.undefined,
      Limit: js.UndefOr[BackupsInputLimit] = js.undefined,
      TimeRangeLowerBound: js.UndefOr[TimeRangeLowerBound] = js.undefined,
      BackupType: js.UndefOr[BackupTypeFilter] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined): ListBackupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimeRangeUpperBound" -> TimeRangeUpperBound.map { x => x.asInstanceOf[js.Any] },
        "ExclusiveStartBackupArn" -> ExclusiveStartBackupArn.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "TimeRangeLowerBound" -> TimeRangeLowerBound.map { x => x.asInstanceOf[js.Any] },
        "BackupType" -> BackupType.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBackupsInput]
    }
  }

  @js.native
  trait ListBackupsOutput extends js.Object {
    var BackupSummaries: js.UndefOr[BackupSummaries]
    var LastEvaluatedBackupArn: js.UndefOr[BackupArn]
  }

  object ListBackupsOutput {
    def apply(
      BackupSummaries: js.UndefOr[BackupSummaries] = js.undefined,
      LastEvaluatedBackupArn: js.UndefOr[BackupArn] = js.undefined): ListBackupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupSummaries" -> BackupSummaries.map { x => x.asInstanceOf[js.Any] },
        "LastEvaluatedBackupArn" -> LastEvaluatedBackupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBackupsOutput]
    }
  }

  @js.native
  trait ListGlobalTablesInput extends js.Object {
    var ExclusiveStartGlobalTableName: js.UndefOr[TableName]
    var Limit: js.UndefOr[PositiveIntegerObject]
    var RegionName: js.UndefOr[RegionName]
  }

  object ListGlobalTablesInput {
    def apply(
      ExclusiveStartGlobalTableName: js.UndefOr[TableName] = js.undefined,
      Limit: js.UndefOr[PositiveIntegerObject] = js.undefined,
      RegionName: js.UndefOr[RegionName] = js.undefined): ListGlobalTablesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExclusiveStartGlobalTableName" -> ExclusiveStartGlobalTableName.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "RegionName" -> RegionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGlobalTablesInput]
    }
  }

  @js.native
  trait ListGlobalTablesOutput extends js.Object {
    var GlobalTables: js.UndefOr[GlobalTableList]
    var LastEvaluatedGlobalTableName: js.UndefOr[TableName]
  }

  object ListGlobalTablesOutput {
    def apply(
      GlobalTables: js.UndefOr[GlobalTableList] = js.undefined,
      LastEvaluatedGlobalTableName: js.UndefOr[TableName] = js.undefined): ListGlobalTablesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTables" -> GlobalTables.map { x => x.asInstanceOf[js.Any] },
        "LastEvaluatedGlobalTableName" -> LastEvaluatedGlobalTableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGlobalTablesOutput]
    }
  }

  /**
   * <p>Represents the input of a <code>ListTables</code> operation.</p>
   */
  @js.native
  trait ListTablesInput extends js.Object {
    var ExclusiveStartTableName: js.UndefOr[TableName]
    var Limit: js.UndefOr[ListTablesInputLimit]
  }

  object ListTablesInput {
    def apply(
      ExclusiveStartTableName: js.UndefOr[TableName] = js.undefined,
      Limit: js.UndefOr[ListTablesInputLimit] = js.undefined): ListTablesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExclusiveStartTableName" -> ExclusiveStartTableName.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTablesInput]
    }
  }

  /**
   * <p>Represents the output of a <code>ListTables</code> operation.</p>
   */
  @js.native
  trait ListTablesOutput extends js.Object {
    var TableNames: js.UndefOr[TableNameList]
    var LastEvaluatedTableName: js.UndefOr[TableName]
  }

  object ListTablesOutput {
    def apply(
      TableNames: js.UndefOr[TableNameList] = js.undefined,
      LastEvaluatedTableName: js.UndefOr[TableName] = js.undefined): ListTablesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableNames" -> TableNames.map { x => x.asInstanceOf[js.Any] },
        "LastEvaluatedTableName" -> LastEvaluatedTableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTablesOutput]
    }
  }

  @js.native
  trait ListTagsOfResourceInput extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArnString]
    var NextToken: js.UndefOr[NextTokenString]
  }

  object ListTagsOfResourceInput {
    def apply(
      ResourceArn: js.UndefOr[ResourceArnString] = js.undefined,
      NextToken: js.UndefOr[NextTokenString] = js.undefined): ListTagsOfResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsOfResourceInput]
    }
  }

  @js.native
  trait ListTagsOfResourceOutput extends js.Object {
    var Tags: js.UndefOr[TagList]
    var NextToken: js.UndefOr[NextTokenString]
  }

  object ListTagsOfResourceOutput {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined,
      NextToken: js.UndefOr[NextTokenString] = js.undefined): ListTagsOfResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsOfResourceOutput]
    }
  }

  /**
   * <p>Represents the properties of a local secondary index.</p>
   */
  @js.native
  trait LocalSecondaryIndex extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var KeySchema: js.UndefOr[KeySchema]
    var Projection: js.UndefOr[Projection]
  }

  object LocalSecondaryIndex {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      Projection: js.UndefOr[Projection] = js.undefined): LocalSecondaryIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "KeySchema" -> KeySchema.map { x => x.asInstanceOf[js.Any] },
        "Projection" -> Projection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocalSecondaryIndex]
    }
  }

  /**
   * <p>Represents the properties of a local secondary index.</p>
   */
  @js.native
  trait LocalSecondaryIndexDescription extends js.Object {
    var IndexArn: js.UndefOr[String]
    var ItemCount: js.UndefOr[Double]
    var IndexSizeBytes: js.UndefOr[Double]
    var KeySchema: js.UndefOr[KeySchema]
    var IndexName: js.UndefOr[IndexName]
    var Projection: js.UndefOr[Projection]
  }

  object LocalSecondaryIndexDescription {
    def apply(
      IndexArn: js.UndefOr[String] = js.undefined,
      ItemCount: js.UndefOr[Double] = js.undefined,
      IndexSizeBytes: js.UndefOr[Double] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      IndexName: js.UndefOr[IndexName] = js.undefined,
      Projection: js.UndefOr[Projection] = js.undefined): LocalSecondaryIndexDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexArn" -> IndexArn.map { x => x.asInstanceOf[js.Any] },
        "ItemCount" -> ItemCount.map { x => x.asInstanceOf[js.Any] },
        "IndexSizeBytes" -> IndexSizeBytes.map { x => x.asInstanceOf[js.Any] },
        "KeySchema" -> KeySchema.map { x => x.asInstanceOf[js.Any] },
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "Projection" -> Projection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocalSecondaryIndexDescription]
    }
  }

  /**
   * <p>Represents the properties of a local secondary index for the table when the backup was created.</p>
   */
  @js.native
  trait LocalSecondaryIndexInfo extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var KeySchema: js.UndefOr[KeySchema]
    var Projection: js.UndefOr[Projection]
  }

  object LocalSecondaryIndexInfo {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      Projection: js.UndefOr[Projection] = js.undefined): LocalSecondaryIndexInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "KeySchema" -> KeySchema.map { x => x.asInstanceOf[js.Any] },
        "Projection" -> Projection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocalSecondaryIndexInfo]
    }
  }

  /**
   * <p>The description of the point in time settings applied to the table.</p>
   */
  @js.native
  trait PointInTimeRecoveryDescription extends js.Object {
    var PointInTimeRecoveryStatus: js.UndefOr[PointInTimeRecoveryStatus]
    var EarliestRestorableDateTime: js.UndefOr[Date]
    var LatestRestorableDateTime: js.UndefOr[Date]
  }

  object PointInTimeRecoveryDescription {
    def apply(
      PointInTimeRecoveryStatus: js.UndefOr[PointInTimeRecoveryStatus] = js.undefined,
      EarliestRestorableDateTime: js.UndefOr[Date] = js.undefined,
      LatestRestorableDateTime: js.UndefOr[Date] = js.undefined): PointInTimeRecoveryDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PointInTimeRecoveryStatus" -> PointInTimeRecoveryStatus.map { x => x.asInstanceOf[js.Any] },
        "EarliestRestorableDateTime" -> EarliestRestorableDateTime.map { x => x.asInstanceOf[js.Any] },
        "LatestRestorableDateTime" -> LatestRestorableDateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PointInTimeRecoveryDescription]
    }
  }

  /**
   * <p>Represents the settings used to enable point in time recovery.</p>
   */
  @js.native
  trait PointInTimeRecoverySpecification extends js.Object {
    var PointInTimeRecoveryEnabled: js.UndefOr[BooleanObject]
  }

  object PointInTimeRecoverySpecification {
    def apply(
      PointInTimeRecoveryEnabled: js.UndefOr[BooleanObject] = js.undefined): PointInTimeRecoverySpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PointInTimeRecoveryEnabled" -> PointInTimeRecoveryEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PointInTimeRecoverySpecification]
    }
  }

  object PointInTimeRecoveryStatusEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * <p>Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.</p>
   */
  @js.native
  trait Projection extends js.Object {
    var ProjectionType: js.UndefOr[ProjectionType]
    var NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList]
  }

  object Projection {
    def apply(
      ProjectionType: js.UndefOr[ProjectionType] = js.undefined,
      NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList] = js.undefined): Projection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProjectionType" -> ProjectionType.map { x => x.asInstanceOf[js.Any] },
        "NonKeyAttributes" -> NonKeyAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Projection]
    }
  }

  object ProjectionTypeEnum {
    val ALL = "ALL"
    val KEYS_ONLY = "KEYS_ONLY"
    val INCLUDE = "INCLUDE"

    val values = IndexedSeq(ALL, KEYS_ONLY, INCLUDE)
  }

  /**
   * <p>Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the <code>UpdateTable</code> operation.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
   */
  @js.native
  trait ProvisionedThroughput extends js.Object {
    var ReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var WriteCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  object ProvisionedThroughput {
    def apply(
      ReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      WriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined): ProvisionedThroughput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReadCapacityUnits" -> ReadCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "WriteCapacityUnits" -> WriteCapacityUnits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedThroughput]
    }
  }

  /**
   * <p>Represents the provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.</p>
   */
  @js.native
  trait ProvisionedThroughputDescription extends js.Object {
    var LastIncreaseDateTime: js.UndefOr[Date]
    var ReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var WriteCapacityUnits: js.UndefOr[PositiveLongObject]
    var LastDecreaseDateTime: js.UndefOr[Date]
    var NumberOfDecreasesToday: js.UndefOr[PositiveLongObject]
  }

  object ProvisionedThroughputDescription {
    def apply(
      LastIncreaseDateTime: js.UndefOr[Date] = js.undefined,
      ReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      WriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      LastDecreaseDateTime: js.UndefOr[Date] = js.undefined,
      NumberOfDecreasesToday: js.UndefOr[PositiveLongObject] = js.undefined): ProvisionedThroughputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastIncreaseDateTime" -> LastIncreaseDateTime.map { x => x.asInstanceOf[js.Any] },
        "ReadCapacityUnits" -> ReadCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "WriteCapacityUnits" -> WriteCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "LastDecreaseDateTime" -> LastDecreaseDateTime.map { x => x.asInstanceOf[js.Any] },
        "NumberOfDecreasesToday" -> NumberOfDecreasesToday.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedThroughputDescription]
    }
  }

  /**
   * <p>Represents the input of a <code>PutItem</code> operation.</p>
   */
  @js.native
  trait PutItemInput extends js.Object {
    var ConditionalOperator: js.UndefOr[ConditionalOperator]
    var Expected: js.UndefOr[ExpectedAttributeMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics]
    var ReturnValues: js.UndefOr[ReturnValue]
    var Item: js.UndefOr[PutItemInputAttributeMap]
    var ConditionExpression: js.UndefOr[ConditionExpression]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var TableName: js.UndefOr[TableName]
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
      TableName: js.UndefOr[TableName] = js.undefined): PutItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConditionalOperator" -> ConditionalOperator.map { x => x.asInstanceOf[js.Any] },
        "Expected" -> Expected.map { x => x.asInstanceOf[js.Any] },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x => x.asInstanceOf[js.Any] },
        "ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x => x.asInstanceOf[js.Any] },
        "ReturnValues" -> ReturnValues.map { x => x.asInstanceOf[js.Any] },
        "Item" -> Item.map { x => x.asInstanceOf[js.Any] },
        "ConditionExpression" -> ConditionExpression.map { x => x.asInstanceOf[js.Any] },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x.asInstanceOf[js.Any] },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutItemInput]
    }
  }

  /**
   * <p>Represents the output of a <code>PutItem</code> operation.</p>
   */
  @js.native
  trait PutItemOutput extends js.Object {
    var Attributes: js.UndefOr[AttributeMap]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics]
  }

  object PutItemOutput {
    def apply(
      Attributes: js.UndefOr[AttributeMap] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
      ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics] = js.undefined): PutItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "ConsumedCapacity" -> ConsumedCapacity.map { x => x.asInstanceOf[js.Any] },
        "ItemCollectionMetrics" -> ItemCollectionMetrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutItemOutput]
    }
  }

  /**
   * <p>Represents a request to perform a <code>PutItem</code> operation on an item.</p>
   */
  @js.native
  trait PutRequest extends js.Object {
    var Item: js.UndefOr[PutItemInputAttributeMap]
  }

  object PutRequest {
    def apply(
      Item: js.UndefOr[PutItemInputAttributeMap] = js.undefined): PutRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Item" -> Item.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRequest]
    }
  }

  /**
   * <p>Represents the input of a <code>Query</code> operation.</p>
   */
  @js.native
  trait QueryInput extends js.Object {
    var ExclusiveStartKey: js.UndefOr[Key]
    var ConditionalOperator: js.UndefOr[ConditionalOperator]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var QueryFilter: js.UndefOr[FilterConditionMap]
    var KeyConditionExpression: js.UndefOr[KeyExpression]
    var KeyConditions: js.UndefOr[KeyConditions]
    var Limit: js.UndefOr[PositiveIntegerObject]
    var FilterExpression: js.UndefOr[ConditionExpression]
    var AttributesToGet: js.UndefOr[AttributeNameList]
    var ScanIndexForward: js.UndefOr[BooleanObject]
    var Select: js.UndefOr[Select]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ConsistentRead: js.UndefOr[ConsistentRead]
    var ProjectionExpression: js.UndefOr[ProjectionExpression]
    var TableName: js.UndefOr[TableName]
    var IndexName: js.UndefOr[IndexName]
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
      IndexName: js.UndefOr[IndexName] = js.undefined): QueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExclusiveStartKey" -> ExclusiveStartKey.map { x => x.asInstanceOf[js.Any] },
        "ConditionalOperator" -> ConditionalOperator.map { x => x.asInstanceOf[js.Any] },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x => x.asInstanceOf[js.Any] },
        "QueryFilter" -> QueryFilter.map { x => x.asInstanceOf[js.Any] },
        "KeyConditionExpression" -> KeyConditionExpression.map { x => x.asInstanceOf[js.Any] },
        "KeyConditions" -> KeyConditions.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "FilterExpression" -> FilterExpression.map { x => x.asInstanceOf[js.Any] },
        "AttributesToGet" -> AttributesToGet.map { x => x.asInstanceOf[js.Any] },
        "ScanIndexForward" -> ScanIndexForward.map { x => x.asInstanceOf[js.Any] },
        "Select" -> Select.map { x => x.asInstanceOf[js.Any] },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x.asInstanceOf[js.Any] },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x.asInstanceOf[js.Any] },
        "ConsistentRead" -> ConsistentRead.map { x => x.asInstanceOf[js.Any] },
        "ProjectionExpression" -> ProjectionExpression.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryInput]
    }
  }

  /**
   * <p>Represents the output of a <code>Query</code> operation.</p>
   */
  @js.native
  trait QueryOutput extends js.Object {
    var LastEvaluatedKey: js.UndefOr[Key]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var Count: js.UndefOr[Int]
    var ScannedCount: js.UndefOr[Int]
    var Items: js.UndefOr[ItemList]
  }

  object QueryOutput {
    def apply(
      LastEvaluatedKey: js.UndefOr[Key] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
      Count: js.UndefOr[Int] = js.undefined,
      ScannedCount: js.UndefOr[Int] = js.undefined,
      Items: js.UndefOr[ItemList] = js.undefined): QueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastEvaluatedKey" -> LastEvaluatedKey.map { x => x.asInstanceOf[js.Any] },
        "ConsumedCapacity" -> ConsumedCapacity.map { x => x.asInstanceOf[js.Any] },
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] },
        "ScannedCount" -> ScannedCount.map { x => x.asInstanceOf[js.Any] },
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryOutput]
    }
  }

  /**
   * <p>Represents the properties of a replica.</p>
   */
  @js.native
  trait Replica extends js.Object {
    var RegionName: js.UndefOr[RegionName]
  }

  object Replica {
    def apply(
      RegionName: js.UndefOr[RegionName] = js.undefined): Replica = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegionName" -> RegionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Replica]
    }
  }

  /**
   * <p>Contains the details of the replica.</p>
   */
  @js.native
  trait ReplicaDescription extends js.Object {
    var RegionName: js.UndefOr[RegionName]
  }

  object ReplicaDescription {
    def apply(
      RegionName: js.UndefOr[RegionName] = js.undefined): ReplicaDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegionName" -> RegionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicaDescription]
    }
  }

  /**
   * <p>Represents the properties of a global secondary index.</p>
   */
  @js.native
  trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
    var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject]
    var IndexStatus: js.UndefOr[IndexStatus]
    var IndexName: js.UndefOr[IndexName]
  }

  object ReplicaGlobalSecondaryIndexSettingsDescription {
    def apply(
      ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined,
      ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined,
      ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      IndexStatus: js.UndefOr[IndexStatus] = js.undefined,
      IndexName: js.UndefOr[IndexName] = js.undefined): ReplicaGlobalSecondaryIndexSettingsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProvisionedReadCapacityAutoScalingSettings" -> ProvisionedReadCapacityAutoScalingSettings.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedReadCapacityUnits" -> ProvisionedReadCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedWriteCapacityAutoScalingSettings" -> ProvisionedWriteCapacityAutoScalingSettings.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedWriteCapacityUnits" -> ProvisionedWriteCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "IndexStatus" -> IndexStatus.map { x => x.asInstanceOf[js.Any] },
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicaGlobalSecondaryIndexSettingsDescription]
    }
  }

  /**
   * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
   */
  @js.native
  trait ReplicaGlobalSecondaryIndexSettingsUpdate extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate]
  }

  object ReplicaGlobalSecondaryIndexSettingsUpdate {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined,
      ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined): ReplicaGlobalSecondaryIndexSettingsUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedReadCapacityUnits" -> ProvisionedReadCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedReadCapacityAutoScalingSettingsUpdate" -> ProvisionedReadCapacityAutoScalingSettingsUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicaGlobalSecondaryIndexSettingsUpdate]
    }
  }

  /**
   * <p>Represents the properties of a replica.</p>
   */
  @js.native
  trait ReplicaSettingsDescription extends js.Object {
    var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject]
    var RegionName: js.UndefOr[RegionName]
    var ReplicaStatus: js.UndefOr[ReplicaStatus]
    var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsDescriptionList]
  }

  object ReplicaSettingsDescription {
    def apply(
      ReplicaProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      RegionName: js.UndefOr[RegionName] = js.undefined,
      ReplicaStatus: js.UndefOr[ReplicaStatus] = js.undefined,
      ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined,
      ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined,
      ReplicaGlobalSecondaryIndexSettings: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsDescriptionList] = js.undefined): ReplicaSettingsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicaProvisionedWriteCapacityUnits" -> ReplicaProvisionedWriteCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "RegionName" -> RegionName.map { x => x.asInstanceOf[js.Any] },
        "ReplicaStatus" -> ReplicaStatus.map { x => x.asInstanceOf[js.Any] },
        "ReplicaProvisionedWriteCapacityAutoScalingSettings" -> ReplicaProvisionedWriteCapacityAutoScalingSettings.map { x => x.asInstanceOf[js.Any] },
        "ReplicaProvisionedReadCapacityUnits" -> ReplicaProvisionedReadCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "ReplicaProvisionedReadCapacityAutoScalingSettings" -> ReplicaProvisionedReadCapacityAutoScalingSettings.map { x => x.asInstanceOf[js.Any] },
        "ReplicaGlobalSecondaryIndexSettings" -> ReplicaGlobalSecondaryIndexSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicaSettingsDescription]
    }
  }

  /**
   * <p>Represents the settings for a global table in a region that will be modified.</p>
   */
  @js.native
  trait ReplicaSettingsUpdate extends js.Object {
    var RegionName: js.UndefOr[RegionName]
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate]
    var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsUpdateList]
  }

  object ReplicaSettingsUpdate {
    def apply(
      RegionName: js.UndefOr[RegionName] = js.undefined,
      ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined,
      ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsUpdateList] = js.undefined): ReplicaSettingsUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegionName" -> RegionName.map { x => x.asInstanceOf[js.Any] },
        "ReplicaProvisionedReadCapacityUnits" -> ReplicaProvisionedReadCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate" -> ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate.map { x => x.asInstanceOf[js.Any] },
        "ReplicaGlobalSecondaryIndexSettingsUpdate" -> ReplicaGlobalSecondaryIndexSettingsUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicaSettingsUpdate]
    }
  }

  object ReplicaStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val ACTIVE = "ACTIVE"

    val values = IndexedSeq(CREATING, UPDATING, DELETING, ACTIVE)
  }

  /**
   * <p>Represents one of the following:</p> <ul> <li> <p>A new replica to be added to an existing global table.</p> </li> <li> <p>New parameters for an existing replica.</p> </li> <li> <p>An existing replica to be removed from an existing global table.</p> </li> </ul>
   */
  @js.native
  trait ReplicaUpdate extends js.Object {
    var Create: js.UndefOr[CreateReplicaAction]
    var Delete: js.UndefOr[DeleteReplicaAction]
  }

  object ReplicaUpdate {
    def apply(
      Create: js.UndefOr[CreateReplicaAction] = js.undefined,
      Delete: js.UndefOr[DeleteReplicaAction] = js.undefined): ReplicaUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Create" -> Create.map { x => x.asInstanceOf[js.Any] },
        "Delete" -> Delete.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicaUpdate]
    }
  }

  /**
   * <p>Contains details for the restore.</p>
   */
  @js.native
  trait RestoreSummary extends js.Object {
    var SourceBackupArn: js.UndefOr[BackupArn]
    var SourceTableArn: js.UndefOr[TableArn]
    var RestoreDateTime: js.UndefOr[Date]
    var RestoreInProgress: js.UndefOr[RestoreInProgress]
  }

  object RestoreSummary {
    def apply(
      SourceBackupArn: js.UndefOr[BackupArn] = js.undefined,
      SourceTableArn: js.UndefOr[TableArn] = js.undefined,
      RestoreDateTime: js.UndefOr[Date] = js.undefined,
      RestoreInProgress: js.UndefOr[RestoreInProgress] = js.undefined): RestoreSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceBackupArn" -> SourceBackupArn.map { x => x.asInstanceOf[js.Any] },
        "SourceTableArn" -> SourceTableArn.map { x => x.asInstanceOf[js.Any] },
        "RestoreDateTime" -> RestoreDateTime.map { x => x.asInstanceOf[js.Any] },
        "RestoreInProgress" -> RestoreInProgress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreSummary]
    }
  }

  @js.native
  trait RestoreTableFromBackupInput extends js.Object {
    var TargetTableName: js.UndefOr[TableName]
    var BackupArn: js.UndefOr[BackupArn]
  }

  object RestoreTableFromBackupInput {
    def apply(
      TargetTableName: js.UndefOr[TableName] = js.undefined,
      BackupArn: js.UndefOr[BackupArn] = js.undefined): RestoreTableFromBackupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetTableName" -> TargetTableName.map { x => x.asInstanceOf[js.Any] },
        "BackupArn" -> BackupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreTableFromBackupInput]
    }
  }

  @js.native
  trait RestoreTableFromBackupOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  object RestoreTableFromBackupOutput {
    def apply(
      TableDescription: js.UndefOr[TableDescription] = js.undefined): RestoreTableFromBackupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableDescription" -> TableDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreTableFromBackupOutput]
    }
  }

  @js.native
  trait RestoreTableToPointInTimeInput extends js.Object {
    var SourceTableName: js.UndefOr[TableName]
    var TargetTableName: js.UndefOr[TableName]
    var UseLatestRestorableTime: js.UndefOr[BooleanObject]
    var RestoreDateTime: js.UndefOr[Date]
  }

  object RestoreTableToPointInTimeInput {
    def apply(
      SourceTableName: js.UndefOr[TableName] = js.undefined,
      TargetTableName: js.UndefOr[TableName] = js.undefined,
      UseLatestRestorableTime: js.UndefOr[BooleanObject] = js.undefined,
      RestoreDateTime: js.UndefOr[Date] = js.undefined): RestoreTableToPointInTimeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceTableName" -> SourceTableName.map { x => x.asInstanceOf[js.Any] },
        "TargetTableName" -> TargetTableName.map { x => x.asInstanceOf[js.Any] },
        "UseLatestRestorableTime" -> UseLatestRestorableTime.map { x => x.asInstanceOf[js.Any] },
        "RestoreDateTime" -> RestoreDateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreTableToPointInTimeInput]
    }
  }

  @js.native
  trait RestoreTableToPointInTimeOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  object RestoreTableToPointInTimeOutput {
    def apply(
      TableDescription: js.UndefOr[TableDescription] = js.undefined): RestoreTableToPointInTimeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableDescription" -> TableDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreTableToPointInTimeOutput]
    }
  }

  /**
   * <p>Determines the level of detail about provisioned throughput consumption that is returned in the response:</p> <ul> <li> <p> <code>INDEXES</code> - The response includes the aggregate <code>ConsumedCapacity</code> for the operation, together with <code>ConsumedCapacity</code> for each table and secondary index that was accessed.</p> <p>Note that some operations, such as <code>GetItem</code> and <code>BatchGetItem</code>, do not access any indexes at all. In these cases, specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code> information for table(s).</p> </li> <li> <p> <code>TOTAL</code> - The response includes only the aggregate <code>ConsumedCapacity</code> for the operation.</p> </li> <li> <p> <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the response.</p> </li> </ul>
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
    val ALL_OLD = "ALL_OLD"
    val UPDATED_OLD = "UPDATED_OLD"
    val ALL_NEW = "ALL_NEW"
    val UPDATED_NEW = "UPDATED_NEW"

    val values = IndexedSeq(NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW)
  }

  /**
   * <p>The description of the server-side encryption status on the specified table.</p>
   */
  @js.native
  trait SSEDescription extends js.Object {
    var Status: js.UndefOr[SSEStatus]
    var SSEType: js.UndefOr[SSEType]
    var KMSMasterKeyArn: js.UndefOr[KMSMasterKeyArn]
  }

  object SSEDescription {
    def apply(
      Status: js.UndefOr[SSEStatus] = js.undefined,
      SSEType: js.UndefOr[SSEType] = js.undefined,
      KMSMasterKeyArn: js.UndefOr[KMSMasterKeyArn] = js.undefined): SSEDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "SSEType" -> SSEType.map { x => x.asInstanceOf[js.Any] },
        "KMSMasterKeyArn" -> KMSMasterKeyArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSEDescription]
    }
  }

  /**
   * <p>Represents the settings used to enable server-side encryption.</p>
   */
  @js.native
  trait SSESpecification extends js.Object {
    var Enabled: js.UndefOr[SSEEnabled]
    var SSEType: js.UndefOr[SSEType]
    var KMSMasterKeyId: js.UndefOr[KMSMasterKeyId]
  }

  object SSESpecification {
    def apply(
      Enabled: js.UndefOr[SSEEnabled] = js.undefined,
      SSEType: js.UndefOr[SSEType] = js.undefined,
      KMSMasterKeyId: js.UndefOr[KMSMasterKeyId] = js.undefined): SSESpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "SSEType" -> SSEType.map { x => x.asInstanceOf[js.Any] },
        "KMSMasterKeyId" -> KMSMasterKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSESpecification]
    }
  }

  object SSEStatusEnum {
    val ENABLING = "ENABLING"
    val ENABLED = "ENABLED"
    val DISABLING = "DISABLING"
    val DISABLED = "DISABLED"
    val UPDATING = "UPDATING"

    val values = IndexedSeq(ENABLING, ENABLED, DISABLING, DISABLED, UPDATING)
  }

  object SSETypeEnum {
    val AES256 = "AES256"
    val KMS = "KMS"

    val values = IndexedSeq(AES256, KMS)
  }

  object ScalarAttributeTypeEnum {
    val S = "S"
    val N = "N"
    val B = "B"

    val values = IndexedSeq(S, N, B)
  }

  /**
   * <p>Represents the input of a <code>Scan</code> operation.</p>
   */
  @js.native
  trait ScanInput extends js.Object {
    var ExclusiveStartKey: js.UndefOr[Key]
    var ConditionalOperator: js.UndefOr[ConditionalOperator]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var Limit: js.UndefOr[PositiveIntegerObject]
    var FilterExpression: js.UndefOr[ConditionExpression]
    var Segment: js.UndefOr[ScanSegment]
    var AttributesToGet: js.UndefOr[AttributeNameList]
    var TotalSegments: js.UndefOr[ScanTotalSegments]
    var Select: js.UndefOr[Select]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ConsistentRead: js.UndefOr[ConsistentRead]
    var ProjectionExpression: js.UndefOr[ProjectionExpression]
    var TableName: js.UndefOr[TableName]
    var IndexName: js.UndefOr[IndexName]
    var ScanFilter: js.UndefOr[FilterConditionMap]
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
      ScanFilter: js.UndefOr[FilterConditionMap] = js.undefined): ScanInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExclusiveStartKey" -> ExclusiveStartKey.map { x => x.asInstanceOf[js.Any] },
        "ConditionalOperator" -> ConditionalOperator.map { x => x.asInstanceOf[js.Any] },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "FilterExpression" -> FilterExpression.map { x => x.asInstanceOf[js.Any] },
        "Segment" -> Segment.map { x => x.asInstanceOf[js.Any] },
        "AttributesToGet" -> AttributesToGet.map { x => x.asInstanceOf[js.Any] },
        "TotalSegments" -> TotalSegments.map { x => x.asInstanceOf[js.Any] },
        "Select" -> Select.map { x => x.asInstanceOf[js.Any] },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x.asInstanceOf[js.Any] },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x.asInstanceOf[js.Any] },
        "ConsistentRead" -> ConsistentRead.map { x => x.asInstanceOf[js.Any] },
        "ProjectionExpression" -> ProjectionExpression.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "ScanFilter" -> ScanFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScanInput]
    }
  }

  /**
   * <p>Represents the output of a <code>Scan</code> operation.</p>
   */
  @js.native
  trait ScanOutput extends js.Object {
    var LastEvaluatedKey: js.UndefOr[Key]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var Count: js.UndefOr[Int]
    var ScannedCount: js.UndefOr[Int]
    var Items: js.UndefOr[ItemList]
  }

  object ScanOutput {
    def apply(
      LastEvaluatedKey: js.UndefOr[Key] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
      Count: js.UndefOr[Int] = js.undefined,
      ScannedCount: js.UndefOr[Int] = js.undefined,
      Items: js.UndefOr[ItemList] = js.undefined): ScanOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastEvaluatedKey" -> LastEvaluatedKey.map { x => x.asInstanceOf[js.Any] },
        "ConsumedCapacity" -> ConsumedCapacity.map { x => x.asInstanceOf[js.Any] },
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] },
        "ScannedCount" -> ScannedCount.map { x => x.asInstanceOf[js.Any] },
        "Items" -> Items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScanOutput]
    }
  }

  object SelectEnum {
    val ALL_ATTRIBUTES = "ALL_ATTRIBUTES"
    val ALL_PROJECTED_ATTRIBUTES = "ALL_PROJECTED_ATTRIBUTES"
    val SPECIFIC_ATTRIBUTES = "SPECIFIC_ATTRIBUTES"
    val COUNT = "COUNT"

    val values = IndexedSeq(ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT)
  }

  /**
   * <p>Contains the details of the table when the backup was created. </p>
   */
  @js.native
  trait SourceTableDetails extends js.Object {
    var TableId: js.UndefOr[TableId]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
    var TableCreationDateTime: js.UndefOr[TableCreationDateTime]
    var TableArn: js.UndefOr[TableArn]
    var ItemCount: js.UndefOr[ItemCount]
    var TableSizeBytes: js.UndefOr[Double]
    var KeySchema: js.UndefOr[KeySchema]
    var TableName: js.UndefOr[TableName]
  }

  object SourceTableDetails {
    def apply(
      TableId: js.UndefOr[TableId] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined,
      TableCreationDateTime: js.UndefOr[TableCreationDateTime] = js.undefined,
      TableArn: js.UndefOr[TableArn] = js.undefined,
      ItemCount: js.UndefOr[ItemCount] = js.undefined,
      TableSizeBytes: js.UndefOr[Double] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined): SourceTableDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableId" -> TableId.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x => x.asInstanceOf[js.Any] },
        "TableCreationDateTime" -> TableCreationDateTime.map { x => x.asInstanceOf[js.Any] },
        "TableArn" -> TableArn.map { x => x.asInstanceOf[js.Any] },
        "ItemCount" -> ItemCount.map { x => x.asInstanceOf[js.Any] },
        "TableSizeBytes" -> TableSizeBytes.map { x => x.asInstanceOf[js.Any] },
        "KeySchema" -> KeySchema.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceTableDetails]
    }
  }

  /**
   * <p>Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL. </p>
   */
  @js.native
  trait SourceTableFeatureDetails extends js.Object {
    var StreamDescription: js.UndefOr[StreamSpecification]
    var TimeToLiveDescription: js.UndefOr[TimeToLiveDescription]
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexes]
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexes]
    var SSEDescription: js.UndefOr[SSEDescription]
  }

  object SourceTableFeatureDetails {
    def apply(
      StreamDescription: js.UndefOr[StreamSpecification] = js.undefined,
      TimeToLiveDescription: js.UndefOr[TimeToLiveDescription] = js.undefined,
      LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexes] = js.undefined,
      GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexes] = js.undefined,
      SSEDescription: js.UndefOr[SSEDescription] = js.undefined): SourceTableFeatureDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamDescription" -> StreamDescription.map { x => x.asInstanceOf[js.Any] },
        "TimeToLiveDescription" -> TimeToLiveDescription.map { x => x.asInstanceOf[js.Any] },
        "LocalSecondaryIndexes" -> LocalSecondaryIndexes.map { x => x.asInstanceOf[js.Any] },
        "GlobalSecondaryIndexes" -> GlobalSecondaryIndexes.map { x => x.asInstanceOf[js.Any] },
        "SSEDescription" -> SSEDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceTableFeatureDetails]
    }
  }

  /**
   * <p>Represents the DynamoDB Streams configuration for a table in DynamoDB.</p>
   */
  @js.native
  trait StreamSpecification extends js.Object {
    var StreamEnabled: js.UndefOr[StreamEnabled]
    var StreamViewType: js.UndefOr[StreamViewType]
  }

  object StreamSpecification {
    def apply(
      StreamEnabled: js.UndefOr[StreamEnabled] = js.undefined,
      StreamViewType: js.UndefOr[StreamViewType] = js.undefined): StreamSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamEnabled" -> StreamEnabled.map { x => x.asInstanceOf[js.Any] },
        "StreamViewType" -> StreamViewType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamSpecification]
    }
  }

  object StreamViewTypeEnum {
    val NEW_IMAGE = "NEW_IMAGE"
    val OLD_IMAGE = "OLD_IMAGE"
    val NEW_AND_OLD_IMAGES = "NEW_AND_OLD_IMAGES"
    val KEYS_ONLY = "KEYS_ONLY"

    val values = IndexedSeq(NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY)
  }

  /**
   * <p>Represents the properties of a table.</p>
   */
  @js.native
  trait TableDescription extends js.Object {
    var TableId: js.UndefOr[TableId]
    var StreamSpecification: js.UndefOr[StreamSpecification]
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexDescriptionList]
    var TableStatus: js.UndefOr[TableStatus]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription]
    var LatestStreamLabel: js.UndefOr[String]
    var AttributeDefinitions: js.UndefOr[AttributeDefinitions]
    var TableArn: js.UndefOr[String]
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexDescriptionList]
    var CreationDateTime: js.UndefOr[Date]
    var ItemCount: js.UndefOr[Double]
    var LatestStreamArn: js.UndefOr[StreamArn]
    var RestoreSummary: js.UndefOr[RestoreSummary]
    var TableSizeBytes: js.UndefOr[Double]
    var KeySchema: js.UndefOr[KeySchema]
    var SSEDescription: js.UndefOr[SSEDescription]
    var TableName: js.UndefOr[TableName]
  }

  object TableDescription {
    def apply(
      TableId: js.UndefOr[TableId] = js.undefined,
      StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined,
      LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexDescriptionList] = js.undefined,
      TableStatus: js.UndefOr[TableStatus] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined,
      LatestStreamLabel: js.UndefOr[String] = js.undefined,
      AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined,
      TableArn: js.UndefOr[String] = js.undefined,
      GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexDescriptionList] = js.undefined,
      CreationDateTime: js.UndefOr[Date] = js.undefined,
      ItemCount: js.UndefOr[Double] = js.undefined,
      LatestStreamArn: js.UndefOr[StreamArn] = js.undefined,
      RestoreSummary: js.UndefOr[RestoreSummary] = js.undefined,
      TableSizeBytes: js.UndefOr[Double] = js.undefined,
      KeySchema: js.UndefOr[KeySchema] = js.undefined,
      SSEDescription: js.UndefOr[SSEDescription] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined): TableDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableId" -> TableId.map { x => x.asInstanceOf[js.Any] },
        "StreamSpecification" -> StreamSpecification.map { x => x.asInstanceOf[js.Any] },
        "LocalSecondaryIndexes" -> LocalSecondaryIndexes.map { x => x.asInstanceOf[js.Any] },
        "TableStatus" -> TableStatus.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x => x.asInstanceOf[js.Any] },
        "LatestStreamLabel" -> LatestStreamLabel.map { x => x.asInstanceOf[js.Any] },
        "AttributeDefinitions" -> AttributeDefinitions.map { x => x.asInstanceOf[js.Any] },
        "TableArn" -> TableArn.map { x => x.asInstanceOf[js.Any] },
        "GlobalSecondaryIndexes" -> GlobalSecondaryIndexes.map { x => x.asInstanceOf[js.Any] },
        "CreationDateTime" -> CreationDateTime.map { x => x.asInstanceOf[js.Any] },
        "ItemCount" -> ItemCount.map { x => x.asInstanceOf[js.Any] },
        "LatestStreamArn" -> LatestStreamArn.map { x => x.asInstanceOf[js.Any] },
        "RestoreSummary" -> RestoreSummary.map { x => x.asInstanceOf[js.Any] },
        "TableSizeBytes" -> TableSizeBytes.map { x => x.asInstanceOf[js.Any] },
        "KeySchema" -> KeySchema.map { x => x.asInstanceOf[js.Any] },
        "SSEDescription" -> SSEDescription.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Describes a tag. A tag is a key-value pair. You can add up to 50 tags to a single DynamoDB table. </p> <p> AWS-assigned tag names and values are automatically assigned the aws: prefix, which the user cannot assign. AWS-assigned tag names do not count towards the tag limit of 50. User-assigned tag names have the prefix user: in the Cost Allocation Report. You cannot backdate the application of a tag. </p> <p>For an overview on tagging DynamoDB resources, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging for DynamoDB</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKeyString]
    var Value: js.UndefOr[TagValueString]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKeyString] = js.undefined,
      Value: js.UndefOr[TagValueString] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArnString]
    var Tags: js.UndefOr[TagList]
  }

  object TagResourceInput {
    def apply(
      ResourceArn: js.UndefOr[ResourceArnString] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): TagResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceInput]
    }
  }

  /**
   * <p>The description of the Time to Live (TTL) status on the specified table. </p>
   */
  @js.native
  trait TimeToLiveDescription extends js.Object {
    var TimeToLiveStatus: js.UndefOr[TimeToLiveStatus]
    var AttributeName: js.UndefOr[TimeToLiveAttributeName]
  }

  object TimeToLiveDescription {
    def apply(
      TimeToLiveStatus: js.UndefOr[TimeToLiveStatus] = js.undefined,
      AttributeName: js.UndefOr[TimeToLiveAttributeName] = js.undefined): TimeToLiveDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimeToLiveStatus" -> TimeToLiveStatus.map { x => x.asInstanceOf[js.Any] },
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeToLiveDescription]
    }
  }

  /**
   * <p>Represents the settings used to enable or disable Time to Live for the specified table.</p>
   */
  @js.native
  trait TimeToLiveSpecification extends js.Object {
    var Enabled: js.UndefOr[TimeToLiveEnabled]
    var AttributeName: js.UndefOr[TimeToLiveAttributeName]
  }

  object TimeToLiveSpecification {
    def apply(
      Enabled: js.UndefOr[TimeToLiveEnabled] = js.undefined,
      AttributeName: js.UndefOr[TimeToLiveAttributeName] = js.undefined): TimeToLiveSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeToLiveSpecification]
    }
  }

  object TimeToLiveStatusEnum {
    val ENABLING = "ENABLING"
    val DISABLING = "DISABLING"
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLING, DISABLING, ENABLED, DISABLED)
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArnString]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object UntagResourceInput {
    def apply(
      ResourceArn: js.UndefOr[ResourceArnString] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): UntagResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UpdateContinuousBackupsInput extends js.Object {
    var TableName: js.UndefOr[TableName]
    var PointInTimeRecoverySpecification: js.UndefOr[PointInTimeRecoverySpecification]
  }

  object UpdateContinuousBackupsInput {
    def apply(
      TableName: js.UndefOr[TableName] = js.undefined,
      PointInTimeRecoverySpecification: js.UndefOr[PointInTimeRecoverySpecification] = js.undefined): UpdateContinuousBackupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "PointInTimeRecoverySpecification" -> PointInTimeRecoverySpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContinuousBackupsInput]
    }
  }

  @js.native
  trait UpdateContinuousBackupsOutput extends js.Object {
    var ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription]
  }

  object UpdateContinuousBackupsOutput {
    def apply(
      ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription] = js.undefined): UpdateContinuousBackupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContinuousBackupsDescription" -> ContinuousBackupsDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContinuousBackupsOutput]
    }
  }

  /**
   * <p>Represents the new provisioned throughput settings to be applied to a global secondary index.</p>
   */
  @js.native
  trait UpdateGlobalSecondaryIndexAction extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
  }

  object UpdateGlobalSecondaryIndexAction {
    def apply(
      IndexName: js.UndefOr[IndexName] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined): UpdateGlobalSecondaryIndexAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGlobalSecondaryIndexAction]
    }
  }

  @js.native
  trait UpdateGlobalTableInput extends js.Object {
    var GlobalTableName: js.UndefOr[TableName]
    var ReplicaUpdates: js.UndefOr[ReplicaUpdateList]
  }

  object UpdateGlobalTableInput {
    def apply(
      GlobalTableName: js.UndefOr[TableName] = js.undefined,
      ReplicaUpdates: js.UndefOr[ReplicaUpdateList] = js.undefined): UpdateGlobalTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableName" -> GlobalTableName.map { x => x.asInstanceOf[js.Any] },
        "ReplicaUpdates" -> ReplicaUpdates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGlobalTableInput]
    }
  }

  @js.native
  trait UpdateGlobalTableOutput extends js.Object {
    var GlobalTableDescription: js.UndefOr[GlobalTableDescription]
  }

  object UpdateGlobalTableOutput {
    def apply(
      GlobalTableDescription: js.UndefOr[GlobalTableDescription] = js.undefined): UpdateGlobalTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableDescription" -> GlobalTableDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGlobalTableOutput]
    }
  }

  @js.native
  trait UpdateGlobalTableSettingsInput extends js.Object {
    var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject]
    var ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList]
    var GlobalTableName: js.UndefOr[TableName]
    var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList]
    var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate]
  }

  object UpdateGlobalTableSettingsInput {
    def apply(
      GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
      ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList] = js.undefined,
      GlobalTableName: js.UndefOr[TableName] = js.undefined,
      GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList] = js.undefined,
      GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined): UpdateGlobalTableSettingsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableProvisionedWriteCapacityUnits" -> GlobalTableProvisionedWriteCapacityUnits.map { x => x.asInstanceOf[js.Any] },
        "ReplicaSettingsUpdate" -> ReplicaSettingsUpdate.map { x => x.asInstanceOf[js.Any] },
        "GlobalTableName" -> GlobalTableName.map { x => x.asInstanceOf[js.Any] },
        "GlobalTableGlobalSecondaryIndexSettingsUpdate" -> GlobalTableGlobalSecondaryIndexSettingsUpdate.map { x => x.asInstanceOf[js.Any] },
        "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate" -> GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGlobalTableSettingsInput]
    }
  }

  @js.native
  trait UpdateGlobalTableSettingsOutput extends js.Object {
    var GlobalTableName: js.UndefOr[TableName]
    var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList]
  }

  object UpdateGlobalTableSettingsOutput {
    def apply(
      GlobalTableName: js.UndefOr[TableName] = js.undefined,
      ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.undefined): UpdateGlobalTableSettingsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableName" -> GlobalTableName.map { x => x.asInstanceOf[js.Any] },
        "ReplicaSettings" -> ReplicaSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGlobalTableSettingsOutput]
    }
  }

  /**
   * <p>Represents the input of an <code>UpdateItem</code> operation.</p>
   */
  @js.native
  trait UpdateItemInput extends js.Object {
    var ConditionalOperator: js.UndefOr[ConditionalOperator]
    var UpdateExpression: js.UndefOr[UpdateExpression]
    var Expected: js.UndefOr[ExpectedAttributeMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics]
    var ReturnValues: js.UndefOr[ReturnValue]
    var AttributeUpdates: js.UndefOr[AttributeUpdates]
    var ConditionExpression: js.UndefOr[ConditionExpression]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var TableName: js.UndefOr[TableName]
    var Key: js.UndefOr[Key]
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
      Key: js.UndefOr[Key] = js.undefined): UpdateItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConditionalOperator" -> ConditionalOperator.map { x => x.asInstanceOf[js.Any] },
        "UpdateExpression" -> UpdateExpression.map { x => x.asInstanceOf[js.Any] },
        "Expected" -> Expected.map { x => x.asInstanceOf[js.Any] },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x => x.asInstanceOf[js.Any] },
        "ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x => x.asInstanceOf[js.Any] },
        "ReturnValues" -> ReturnValues.map { x => x.asInstanceOf[js.Any] },
        "AttributeUpdates" -> AttributeUpdates.map { x => x.asInstanceOf[js.Any] },
        "ConditionExpression" -> ConditionExpression.map { x => x.asInstanceOf[js.Any] },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x => x.asInstanceOf[js.Any] },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateItemInput]
    }
  }

  /**
   * <p>Represents the output of an <code>UpdateItem</code> operation.</p>
   */
  @js.native
  trait UpdateItemOutput extends js.Object {
    var Attributes: js.UndefOr[AttributeMap]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics]
  }

  object UpdateItemOutput {
    def apply(
      Attributes: js.UndefOr[AttributeMap] = js.undefined,
      ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
      ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics] = js.undefined): UpdateItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "ConsumedCapacity" -> ConsumedCapacity.map { x => x.asInstanceOf[js.Any] },
        "ItemCollectionMetrics" -> ItemCollectionMetrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateItemOutput]
    }
  }

  /**
   * <p>Represents the input of an <code>UpdateTable</code> operation.</p>
   */
  @js.native
  trait UpdateTableInput extends js.Object {
    var StreamSpecification: js.UndefOr[StreamSpecification]
    var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexUpdateList]
    var SSESpecification: js.UndefOr[SSESpecification]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
    var AttributeDefinitions: js.UndefOr[AttributeDefinitions]
    var TableName: js.UndefOr[TableName]
  }

  object UpdateTableInput {
    def apply(
      StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined,
      GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexUpdateList] = js.undefined,
      SSESpecification: js.UndefOr[SSESpecification] = js.undefined,
      ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined,
      AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined,
      TableName: js.UndefOr[TableName] = js.undefined): UpdateTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamSpecification" -> StreamSpecification.map { x => x.asInstanceOf[js.Any] },
        "GlobalSecondaryIndexUpdates" -> GlobalSecondaryIndexUpdates.map { x => x.asInstanceOf[js.Any] },
        "SSESpecification" -> SSESpecification.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x => x.asInstanceOf[js.Any] },
        "AttributeDefinitions" -> AttributeDefinitions.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTableInput]
    }
  }

  /**
   * <p>Represents the output of an <code>UpdateTable</code> operation.</p>
   */
  @js.native
  trait UpdateTableOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  object UpdateTableOutput {
    def apply(
      TableDescription: js.UndefOr[TableDescription] = js.undefined): UpdateTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableDescription" -> TableDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTableOutput]
    }
  }

  /**
   * <p>Represents the input of an <code>UpdateTimeToLive</code> operation.</p>
   */
  @js.native
  trait UpdateTimeToLiveInput extends js.Object {
    var TableName: js.UndefOr[TableName]
    var TimeToLiveSpecification: js.UndefOr[TimeToLiveSpecification]
  }

  object UpdateTimeToLiveInput {
    def apply(
      TableName: js.UndefOr[TableName] = js.undefined,
      TimeToLiveSpecification: js.UndefOr[TimeToLiveSpecification] = js.undefined): UpdateTimeToLiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] },
        "TimeToLiveSpecification" -> TimeToLiveSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTimeToLiveInput]
    }
  }

  @js.native
  trait UpdateTimeToLiveOutput extends js.Object {
    var TimeToLiveSpecification: js.UndefOr[TimeToLiveSpecification]
  }

  object UpdateTimeToLiveOutput {
    def apply(
      TimeToLiveSpecification: js.UndefOr[TimeToLiveSpecification] = js.undefined): UpdateTimeToLiveOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimeToLiveSpecification" -> TimeToLiveSpecification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTimeToLiveOutput]
    }
  }

  /**
   * <p>Represents an operation to perform - either <code>DeleteItem</code> or <code>PutItem</code>. You can only request one of these operations, not both, in a single <code>WriteRequest</code>. If you do need to perform both of these operations, you will need to provide two separate <code>WriteRequest</code> objects.</p>
   */
  @js.native
  trait WriteRequest extends js.Object {
    var PutRequest: js.UndefOr[PutRequest]
    var DeleteRequest: js.UndefOr[DeleteRequest]
  }

  object WriteRequest {
    def apply(
      PutRequest: js.UndefOr[PutRequest] = js.undefined,
      DeleteRequest: js.UndefOr[DeleteRequest] = js.undefined): WriteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PutRequest" -> PutRequest.map { x => x.asInstanceOf[js.Any] },
        "DeleteRequest" -> DeleteRequest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WriteRequest]
    }
  }
}
