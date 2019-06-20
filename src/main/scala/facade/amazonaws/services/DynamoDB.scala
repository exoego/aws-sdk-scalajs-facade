package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object dynamodb {
  type AttributeAction                  = String
  type AttributeDefinitions             = js.Array[AttributeDefinition]
  type AttributeMap                     = js.Dictionary[AttributeValue]
  type AttributeName                    = String
  type AttributeNameList                = js.Array[AttributeName]
  type AttributeUpdates                 = js.Dictionary[AttributeValueUpdate]
  type AttributeValueList               = js.Array[AttributeValue]
  type AutoScalingPolicyDescriptionList = js.Array[AutoScalingPolicyDescription]
  type AutoScalingPolicyName            = String
  type AutoScalingRoleArn               = String
  type Backfilling                      = Boolean
  type BackupArn                        = String
  type BackupCreationDateTime           = js.Date
  type BackupName                       = String
  type BackupSizeBytes                  = Double
  type BackupStatus                     = String
  type BackupSummaries                  = js.Array[BackupSummary]
  type BackupType                       = String
  type BackupTypeFilter                 = String
  type BackupsInputLimit                = Int
  type BatchGetRequestMap               = js.Dictionary[KeysAndAttributes]
  type BatchGetResponseMap              = js.Dictionary[ItemList]
  type BatchWriteItemRequestMap         = js.Dictionary[WriteRequests]
  type BillingMode                      = String
  type BinaryAttributeValue =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BinarySetAttributeValue                            = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue                              = Boolean
  type BooleanObject                                      = Boolean
  type ClientRequestToken                                 = String
  type ComparisonOperator                                 = String
  type ConditionExpression                                = String
  type ConditionalOperator                                = String
  type ConsistentRead                                     = Boolean
  type ConsumedCapacityMultiple                           = js.Array[ConsumedCapacity]
  type ConsumedCapacityUnits                              = Double
  type ContinuousBackupsStatus                            = String
  type Date                                               = js.Date
  type Endpoints                                          = js.Array[Endpoint]
  type ExpectedAttributeMap                               = js.Dictionary[ExpectedAttributeValue]
  type ExpressionAttributeNameMap                         = js.Dictionary[AttributeName]
  type ExpressionAttributeNameVariable                    = String
  type ExpressionAttributeValueMap                        = js.Dictionary[AttributeValue]
  type ExpressionAttributeValueVariable                   = String
  type FilterConditionMap                                 = js.Dictionary[Condition]
  type GlobalSecondaryIndexDescriptionList                = js.Array[GlobalSecondaryIndexDescription]
  type GlobalSecondaryIndexList                           = js.Array[GlobalSecondaryIndex]
  type GlobalSecondaryIndexUpdateList                     = js.Array[GlobalSecondaryIndexUpdate]
  type GlobalSecondaryIndexes                             = js.Array[GlobalSecondaryIndexInfo]
  type GlobalTableArnString                               = String
  type GlobalTableGlobalSecondaryIndexSettingsUpdateList  = js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  type GlobalTableList                                    = js.Array[GlobalTable]
  type GlobalTableStatus                                  = String
  type IndexName                                          = String
  type IndexStatus                                        = String
  type IntegerObject                                      = Int
  type ItemCollectionKeyAttributeMap                      = js.Dictionary[AttributeValue]
  type ItemCollectionMetricsMultiple                      = js.Array[ItemCollectionMetrics]
  type ItemCollectionMetricsPerTable                      = js.Dictionary[ItemCollectionMetricsMultiple]
  type ItemCollectionSizeEstimateBound                    = Double
  type ItemCollectionSizeEstimateRange                    = js.Array[ItemCollectionSizeEstimateBound]
  type ItemCount                                          = Double
  type ItemList                                           = js.Array[AttributeMap]
  type ItemResponseList                                   = js.Array[ItemResponse]
  type KMSMasterKeyArn                                    = String
  type KMSMasterKeyId                                     = String
  type Key                                                = js.Dictionary[AttributeValue]
  type KeyConditions                                      = js.Dictionary[Condition]
  type KeyExpression                                      = String
  type KeyList                                            = js.Array[Key]
  type KeySchema                                          = js.Array[KeySchemaElement]
  type KeySchemaAttributeName                             = String
  type KeyType                                            = String
  type ListAttributeValue                                 = js.Array[AttributeValue]
  type ListTablesInputLimit                               = Int
  type LocalSecondaryIndexDescriptionList                 = js.Array[LocalSecondaryIndexDescription]
  type LocalSecondaryIndexList                            = js.Array[LocalSecondaryIndex]
  type LocalSecondaryIndexes                              = js.Array[LocalSecondaryIndexInfo]
  type MapAttributeValue                                  = js.Dictionary[AttributeValue]
  type NextTokenString                                    = String
  type NonKeyAttributeName                                = String
  type NonKeyAttributeNameList                            = js.Array[NonKeyAttributeName]
  type NonNegativeLongObject                              = Double
  type NullAttributeValue                                 = Boolean
  type NumberAttributeValue                               = String
  type NumberSetAttributeValue                            = js.Array[NumberAttributeValue]
  type PointInTimeRecoveryStatus                          = String
  type PositiveIntegerObject                              = Int
  type PositiveLongObject                                 = Double
  type ProjectionExpression                               = String
  type ProjectionType                                     = String
  type PutItemInputAttributeMap                           = js.Dictionary[AttributeValue]
  type RegionName                                         = String
  type ReplicaDescriptionList                             = js.Array[ReplicaDescription]
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[ReplicaGlobalSecondaryIndexSettingsDescription]
  type ReplicaGlobalSecondaryIndexSettingsUpdateList      = js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate]
  type ReplicaList                                        = js.Array[Replica]
  type ReplicaSettingsDescriptionList                     = js.Array[ReplicaSettingsDescription]
  type ReplicaSettingsUpdateList                          = js.Array[ReplicaSettingsUpdate]
  type ReplicaStatus                                      = String
  type ReplicaUpdateList                                  = js.Array[ReplicaUpdate]
  type ResourceArnString                                  = String
  type RestoreInProgress                                  = Boolean
  type ReturnConsumedCapacity                             = String
  type ReturnItemCollectionMetrics                        = String
  type ReturnValue                                        = String
  type ReturnValuesOnConditionCheckFailure                = String
  type SSEEnabled                                         = Boolean
  type SSEStatus                                          = String
  type SSEType                                            = String
  type ScalarAttributeType                                = String
  type ScanSegment                                        = Int
  type ScanTotalSegments                                  = Int
  type SecondaryIndexesCapacityMap                        = js.Dictionary[Capacity]
  type Select                                             = String
  type StreamArn                                          = String
  type StreamEnabled                                      = Boolean
  type StreamViewType                                     = String
  type StringAttributeValue                               = String
  type StringSetAttributeValue                            = js.Array[StringAttributeValue]
  type TableArn                                           = String
  type TableCreationDateTime                              = js.Date
  type TableId                                            = String
  type TableName                                          = String
  type TableNameList                                      = js.Array[TableName]
  type TableStatus                                        = String
  type TagKeyList                                         = js.Array[TagKeyString]
  type TagKeyString                                       = String
  type TagList                                            = js.Array[Tag]
  type TagValueString                                     = String
  type TimeRangeLowerBound                                = js.Date
  type TimeRangeUpperBound                                = js.Date
  type TimeToLiveAttributeName                            = String
  type TimeToLiveEnabled                                  = Boolean
  type TimeToLiveStatus                                   = String
  type TransactGetItemList                                = js.Array[TransactGetItem]
  type TransactWriteItemList                              = js.Array[TransactWriteItem]
  type UpdateExpression                                   = String
  type WriteRequests                                      = js.Array[WriteRequest]
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
    def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse]   = js.native
    def describeGlobalTable(params: DescribeGlobalTableInput): Request[DescribeGlobalTableOutput] = js.native
    def describeGlobalTableSettings(
        params: DescribeGlobalTableSettingsInput
    ): Request[DescribeGlobalTableSettingsOutput]                                                          = js.native
    def describeLimits(params: DescribeLimitsInput): Request[DescribeLimitsOutput]                         = js.native
    def describeTable(params: DescribeTableInput): Request[DescribeTableOutput]                            = js.native
    def describeTimeToLive(params: DescribeTimeToLiveInput): Request[DescribeTimeToLiveOutput]             = js.native
    def getItem(params: GetItemInput): Request[GetItemOutput]                                              = js.native
    def listBackups(params: ListBackupsInput): Request[ListBackupsOutput]                                  = js.native
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
    def updateGlobalTable(params: UpdateGlobalTableInput): Request[UpdateGlobalTableOutput] = js.native
    def updateGlobalTableSettings(params: UpdateGlobalTableSettingsInput): Request[UpdateGlobalTableSettingsOutput] =
      js.native
    def updateItem(params: UpdateItemInput): Request[UpdateItemOutput]                   = js.native
    def updateTable(params: UpdateTableInput): Request[UpdateTableOutput]                = js.native
    def updateTimeToLive(params: UpdateTimeToLiveInput): Request[UpdateTimeToLiveOutput] = js.native
  }

  object AttributeActionEnum {
    val ADD    = "ADD"
    val PUT    = "PUT"
    val DELETE = "DELETE"

    val values = IndexedSeq(ADD, PUT, DELETE)
  }

  /**
    * Represents an attribute for describing the key schema for the table and indexes.
    */
  @js.native
  trait AttributeDefinition extends js.Object {
    var AttributeName: KeySchemaAttributeName
    var AttributeType: ScalarAttributeType
  }

  object AttributeDefinition {
    def apply(AttributeName: KeySchemaAttributeName, AttributeType: ScalarAttributeType): AttributeDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "AttributeType" -> AttributeType.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeDefinition]
    }
  }

  /**
    * Represents the data for an attribute.
    *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.
    *  For more information, see [[http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes|Data Types]] in the <i>Amazon DynamoDB Developer Guide</i>.
    */
  @js.native
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
    def apply(B: js.UndefOr[BinaryAttributeValue] = js.undefined,
              BOOL: js.UndefOr[BooleanAttributeValue] = js.undefined,
              BS: js.UndefOr[BinarySetAttributeValue] = js.undefined,
              L: js.UndefOr[ListAttributeValue] = js.undefined,
              M: js.UndefOr[MapAttributeValue] = js.undefined,
              N: js.UndefOr[NumberAttributeValue] = js.undefined,
              NS: js.UndefOr[NumberSetAttributeValue] = js.undefined,
              NULL: js.UndefOr[NullAttributeValue] = js.undefined,
              S: js.UndefOr[StringAttributeValue] = js.undefined,
              SS: js.UndefOr[StringSetAttributeValue] = js.undefined): AttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "B" -> B.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BOOL" -> BOOL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BS" -> BS.map { x =>
          x.asInstanceOf[js.Any]
        },
        "L" -> L.map { x =>
          x.asInstanceOf[js.Any]
        },
        "M" -> M.map { x =>
          x.asInstanceOf[js.Any]
        },
        "N" -> N.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NS" -> NS.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NULL" -> NULL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S" -> S.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SS" -> SS.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValue]
    }
    def S(value: StringAttributeValue): AttributeValue = js.Dynamic.literal("S" -> value).asInstanceOf[AttributeValue]
    def NFromInt(value: Int): AttributeValue           = js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
    def NFromLong(value: Long): AttributeValue         = js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
    def NFromDouble(value: Double): AttributeValue =
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
  trait AttributeValueUpdate extends js.Object {
    var Action: js.UndefOr[AttributeAction]
    var Value: js.UndefOr[AttributeValue]
  }

  object AttributeValueUpdate {
    def apply(Action: js.UndefOr[AttributeAction] = js.undefined,
              Value: js.UndefOr[AttributeValue] = js.undefined): AttributeValueUpdate = {
      val _fields = IndexedSeq[(String, js.Any)]("Action" -> Action.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValueUpdate]
    }
  }

  /**
    * Represents the properties of the scaling policy.
    */
  @js.native
  trait AutoScalingPolicyDescription extends js.Object {
    var PolicyName: js.UndefOr[AutoScalingPolicyName]
    var TargetTrackingScalingPolicyConfiguration: js.UndefOr[
      AutoScalingTargetTrackingScalingPolicyConfigurationDescription
    ]
  }

  object AutoScalingPolicyDescription {
    def apply(PolicyName: js.UndefOr[AutoScalingPolicyName] = js.undefined,
              TargetTrackingScalingPolicyConfiguration: js.UndefOr[
                AutoScalingTargetTrackingScalingPolicyConfigurationDescription
              ] = js.undefined): AutoScalingPolicyDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetTrackingScalingPolicyConfiguration" -> TargetTrackingScalingPolicyConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingPolicyDescription]
    }
  }

  /**
    * Represents the autoscaling policy to be modified.
    */
  @js.native
  trait AutoScalingPolicyUpdate extends js.Object {
    var TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    var PolicyName: js.UndefOr[AutoScalingPolicyName]
  }

  object AutoScalingPolicyUpdate {
    def apply(TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate,
              PolicyName: js.UndefOr[AutoScalingPolicyName] = js.undefined): AutoScalingPolicyUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetTrackingScalingPolicyConfiguration" -> TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingPolicyUpdate]
    }
  }

  /**
    * Represents the autoscaling settings for a global table or global secondary index.
    */
  @js.native
  trait AutoScalingSettingsDescription extends js.Object {
    var AutoScalingDisabled: js.UndefOr[BooleanObject]
    var AutoScalingRoleArn: js.UndefOr[String]
    var MaximumUnits: js.UndefOr[PositiveLongObject]
    var MinimumUnits: js.UndefOr[PositiveLongObject]
    var ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList]
  }

  object AutoScalingSettingsDescription {
    def apply(
        AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined,
        AutoScalingRoleArn: js.UndefOr[String] = js.undefined,
        MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined,
        MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined,
        ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList] = js.undefined
    ): AutoScalingSettingsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingDisabled" -> AutoScalingDisabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoScalingRoleArn" -> AutoScalingRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumUnits" -> MaximumUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinimumUnits" -> MinimumUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalingPolicies" -> ScalingPolicies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingSettingsDescription]
    }
  }

  /**
    * Represents the autoscaling settings to be modified for a global table or global secondary index.
    */
  @js.native
  trait AutoScalingSettingsUpdate extends js.Object {
    var AutoScalingDisabled: js.UndefOr[BooleanObject]
    var AutoScalingRoleArn: js.UndefOr[AutoScalingRoleArn]
    var MaximumUnits: js.UndefOr[PositiveLongObject]
    var MinimumUnits: js.UndefOr[PositiveLongObject]
    var ScalingPolicyUpdate: js.UndefOr[AutoScalingPolicyUpdate]
  }

  object AutoScalingSettingsUpdate {
    def apply(AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined,
              AutoScalingRoleArn: js.UndefOr[AutoScalingRoleArn] = js.undefined,
              MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined,
              MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined,
              ScalingPolicyUpdate: js.UndefOr[AutoScalingPolicyUpdate] = js.undefined): AutoScalingSettingsUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingDisabled" -> AutoScalingDisabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoScalingRoleArn" -> AutoScalingRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumUnits" -> MaximumUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinimumUnits" -> MinimumUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalingPolicyUpdate" -> ScalingPolicyUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingSettingsUpdate]
    }
  }

  /**
    * Represents the properties of a target tracking scaling policy.
    */
  @js.native
  trait AutoScalingTargetTrackingScalingPolicyConfigurationDescription extends js.Object {
    var TargetValue: Double
    var DisableScaleIn: js.UndefOr[BooleanObject]
    var ScaleInCooldown: js.UndefOr[IntegerObject]
    var ScaleOutCooldown: js.UndefOr[IntegerObject]
  }

  object AutoScalingTargetTrackingScalingPolicyConfigurationDescription {
    def apply(
        TargetValue: Double,
        DisableScaleIn: js.UndefOr[BooleanObject] = js.undefined,
        ScaleInCooldown: js.UndefOr[IntegerObject] = js.undefined,
        ScaleOutCooldown: js.UndefOr[IntegerObject] = js.undefined
    ): AutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetValue" -> TargetValue.asInstanceOf[js.Any],
        "DisableScaleIn" -> DisableScaleIn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScaleInCooldown" -> ScaleInCooldown.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScaleOutCooldown" -> ScaleOutCooldown.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[AutoScalingTargetTrackingScalingPolicyConfigurationDescription]
    }
  }

  /**
    * Represents the settings of a target tracking scaling policy that will be modified.
    */
  @js.native
  trait AutoScalingTargetTrackingScalingPolicyConfigurationUpdate extends js.Object {
    var TargetValue: Double
    var DisableScaleIn: js.UndefOr[BooleanObject]
    var ScaleInCooldown: js.UndefOr[IntegerObject]
    var ScaleOutCooldown: js.UndefOr[IntegerObject]
  }

  object AutoScalingTargetTrackingScalingPolicyConfigurationUpdate {
    def apply(
        TargetValue: Double,
        DisableScaleIn: js.UndefOr[BooleanObject] = js.undefined,
        ScaleInCooldown: js.UndefOr[IntegerObject] = js.undefined,
        ScaleOutCooldown: js.UndefOr[IntegerObject] = js.undefined
    ): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetValue" -> TargetValue.asInstanceOf[js.Any],
        "DisableScaleIn" -> DisableScaleIn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScaleInCooldown" -> ScaleInCooldown.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScaleOutCooldown" -> ScaleOutCooldown.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate]
    }
  }

  /**
    * Contains the description of the backup created for the table.
    */
  @js.native
  trait BackupDescription extends js.Object {
    var BackupDetails: js.UndefOr[BackupDetails]
    var SourceTableDetails: js.UndefOr[SourceTableDetails]
    var SourceTableFeatureDetails: js.UndefOr[SourceTableFeatureDetails]
  }

  object BackupDescription {
    def apply(BackupDetails: js.UndefOr[BackupDetails] = js.undefined,
              SourceTableDetails: js.UndefOr[SourceTableDetails] = js.undefined,
              SourceTableFeatureDetails: js.UndefOr[SourceTableFeatureDetails] = js.undefined): BackupDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupDetails" -> BackupDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceTableDetails" -> SourceTableDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceTableFeatureDetails" -> SourceTableFeatureDetails.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BackupDescription]
    }
  }

  /**
    * Contains the details of the backup created for the table.
    */
  @js.native
  trait BackupDetails extends js.Object {
    var BackupArn: BackupArn
    var BackupCreationDateTime: BackupCreationDateTime
    var BackupName: BackupName
    var BackupStatus: BackupStatus
    var BackupType: BackupType
    var BackupExpiryDateTime: js.UndefOr[Date]
    var BackupSizeBytes: js.UndefOr[BackupSizeBytes]
  }

  object BackupDetails {
    def apply(BackupArn: BackupArn,
              BackupCreationDateTime: BackupCreationDateTime,
              BackupName: BackupName,
              BackupStatus: BackupStatus,
              BackupType: BackupType,
              BackupExpiryDateTime: js.UndefOr[Date] = js.undefined,
              BackupSizeBytes: js.UndefOr[BackupSizeBytes] = js.undefined): BackupDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupArn"              -> BackupArn.asInstanceOf[js.Any],
        "BackupCreationDateTime" -> BackupCreationDateTime.asInstanceOf[js.Any],
        "BackupName"             -> BackupName.asInstanceOf[js.Any],
        "BackupStatus"           -> BackupStatus.asInstanceOf[js.Any],
        "BackupType"             -> BackupType.asInstanceOf[js.Any],
        "BackupExpiryDateTime" -> BackupExpiryDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupSizeBytes" -> BackupSizeBytes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BackupDetails]
    }
  }

  object BackupStatusEnum {
    val CREATING  = "CREATING"
    val DELETED   = "DELETED"
    val AVAILABLE = "AVAILABLE"

    val values = IndexedSeq(CREATING, DELETED, AVAILABLE)
  }

  /**
    * Contains details for the backup.
    */
  @js.native
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

  object BackupSummary {
    def apply(BackupArn: js.UndefOr[BackupArn] = js.undefined,
              BackupCreationDateTime: js.UndefOr[BackupCreationDateTime] = js.undefined,
              BackupExpiryDateTime: js.UndefOr[Date] = js.undefined,
              BackupName: js.UndefOr[BackupName] = js.undefined,
              BackupSizeBytes: js.UndefOr[BackupSizeBytes] = js.undefined,
              BackupStatus: js.UndefOr[BackupStatus] = js.undefined,
              BackupType: js.UndefOr[BackupType] = js.undefined,
              TableArn: js.UndefOr[TableArn] = js.undefined,
              TableId: js.UndefOr[TableId] = js.undefined,
              TableName: js.UndefOr[TableName] = js.undefined): BackupSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupArn" -> BackupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupCreationDateTime" -> BackupCreationDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupExpiryDateTime" -> BackupExpiryDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupName" -> BackupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupSizeBytes" -> BackupSizeBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupStatus" -> BackupStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackupType" -> BackupType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableArn" -> TableArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableId" -> TableId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableName" -> TableName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BackupSummary]
    }
  }

  object BackupTypeEnum {
    val USER   = "USER"
    val SYSTEM = "SYSTEM"

    val values = IndexedSeq(USER, SYSTEM)
  }

  object BackupTypeFilterEnum {
    val USER   = "USER"
    val SYSTEM = "SYSTEM"
    val ALL    = "ALL"

    val values = IndexedSeq(USER, SYSTEM, ALL)
  }

  /**
    * Represents the input of a <code>BatchGetItem</code> operation.
    */
  @js.native
  trait BatchGetItemInput extends js.Object {
    var RequestItems: BatchGetRequestMap
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
  }

  object BatchGetItemInput {
    def apply(RequestItems: BatchGetRequestMap,
              ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined): BatchGetItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequestItems" -> RequestItems.asInstanceOf[js.Any],
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetItemInput]
    }
  }

  /**
    * Represents the output of a <code>BatchGetItem</code> operation.
    */
  @js.native
  trait BatchGetItemOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple]
    var Responses: js.UndefOr[BatchGetResponseMap]
    var UnprocessedKeys: js.UndefOr[BatchGetRequestMap]
  }

  object BatchGetItemOutput {
    def apply(ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined,
              Responses: js.UndefOr[BatchGetResponseMap] = js.undefined,
              UnprocessedKeys: js.UndefOr[BatchGetRequestMap] = js.undefined): BatchGetItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumedCapacity" -> ConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Responses" -> Responses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UnprocessedKeys" -> UnprocessedKeys.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetItemOutput]
    }
  }

  /**
    * Represents the input of a <code>BatchWriteItem</code> operation.
    */
  @js.native
  trait BatchWriteItemInput extends js.Object {
    var RequestItems: BatchWriteItemRequestMap
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics]
  }

  object BatchWriteItemInput {
    def apply(
        RequestItems: BatchWriteItemRequestMap,
        ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
        ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined
    ): BatchWriteItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequestItems" -> RequestItems.asInstanceOf[js.Any],
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteItemInput]
    }
  }

  /**
    * Represents the output of a <code>BatchWriteItem</code> operation.
    */
  @js.native
  trait BatchWriteItemOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable]
    var UnprocessedItems: js.UndefOr[BatchWriteItemRequestMap]
  }

  object BatchWriteItemOutput {
    def apply(ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined,
              ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.undefined,
              UnprocessedItems: js.UndefOr[BatchWriteItemRequestMap] = js.undefined): BatchWriteItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumedCapacity" -> ConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ItemCollectionMetrics" -> ItemCollectionMetrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UnprocessedItems" -> UnprocessedItems.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteItemOutput]
    }
  }

  object BillingModeEnum {
    val PROVISIONED     = "PROVISIONED"
    val PAY_PER_REQUEST = "PAY_PER_REQUEST"

    val values = IndexedSeq(PROVISIONED, PAY_PER_REQUEST)
  }

  /**
    * Contains the details for the read/write capacity mode.
    */
  @js.native
  trait BillingModeSummary extends js.Object {
    var BillingMode: js.UndefOr[BillingMode]
    var LastUpdateToPayPerRequestDateTime: js.UndefOr[Date]
  }

  object BillingModeSummary {
    def apply(BillingMode: js.UndefOr[BillingMode] = js.undefined,
              LastUpdateToPayPerRequestDateTime: js.UndefOr[Date] = js.undefined): BillingModeSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BillingMode" -> BillingMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdateToPayPerRequestDateTime" -> LastUpdateToPayPerRequestDateTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BillingModeSummary]
    }
  }

  /**
    * Represents the amount of provisioned throughput capacity consumed on a table or an index.
    */
  @js.native
  trait Capacity extends js.Object {
    var CapacityUnits: js.UndefOr[ConsumedCapacityUnits]
    var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits]
    var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits]
  }

  object Capacity {
    def apply(CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined,
              ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined,
              WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined): Capacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityUnits" -> CapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadCapacityUnits" -> ReadCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WriteCapacityUnits" -> WriteCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Capacity]
    }
  }

  object ComparisonOperatorEnum {
    val EQ           = "EQ"
    val NE           = "NE"
    val IN           = "IN"
    val LE           = "LE"
    val LT           = "LT"
    val GE           = "GE"
    val GT           = "GT"
    val BETWEEN      = "BETWEEN"
    val NOT_NULL     = "NOT_NULL"
    val NULL         = "NULL"
    val CONTAINS     = "CONTAINS"
    val NOT_CONTAINS = "NOT_CONTAINS"
    val BEGINS_WITH  = "BEGINS_WITH"

    val values = IndexedSeq(EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH)
  }

  /**
    * Represents the selection criteria for a <code>Query</code> or <code>Scan</code> operation:
    * * For a <code>Query</code> operation, <code>Condition</code> is used for specifying the <code>KeyConditions</code> to use when querying a table or an index. For <code>KeyConditions</code>, only the following comparison operators are supported:
    *  <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
    *  <code>Condition</code> is also used in a <code>QueryFilter</code>, which evaluates the query results and returns only the desired values.
    *  * For a <code>Scan</code> operation, <code>Condition</code> is used in a <code>ScanFilter</code>, which evaluates the scan results and returns only the desired values.
    */
  @js.native
  trait Condition extends js.Object {
    var ComparisonOperator: ComparisonOperator
    var AttributeValueList: js.UndefOr[AttributeValueList]
  }

  object Condition {
    def apply(ComparisonOperator: ComparisonOperator,
              AttributeValueList: js.UndefOr[AttributeValueList] = js.undefined): Condition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "AttributeValueList" -> AttributeValueList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Condition]
    }
  }

  /**
    * Represents a request to perform a check that an item exists or to check the condition of specific attributes of the item..
    */
  @js.native
  trait ConditionCheck extends js.Object {
    var ConditionExpression: ConditionExpression
    var Key: Key
    var TableName: TableName
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure]
  }

  object ConditionCheck {
    def apply(
        ConditionExpression: ConditionExpression,
        Key: Key,
        TableName: TableName,
        ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
        ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
        ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
    ): ConditionCheck = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConditionExpression" -> ConditionExpression.asInstanceOf[js.Any],
        "Key"                 -> Key.asInstanceOf[js.Any],
        "TableName"           -> TableName.asInstanceOf[js.Any],
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnValuesOnConditionCheckFailure" -> ReturnValuesOnConditionCheckFailure.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConditionCheck]
    }
  }

  object ConditionalOperatorEnum {
    val AND = "AND"
    val OR  = "OR"

    val values = IndexedSeq(AND, OR)
  }

  /**
    * The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the request asked for it. For more information, see [[http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html|Provisioned Throughput]] in the <i>Amazon DynamoDB Developer Guide</i>.
    */
  @js.native
  trait ConsumedCapacity extends js.Object {
    var CapacityUnits: js.UndefOr[ConsumedCapacityUnits]
    var GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap]
    var LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap]
    var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits]
    var Table: js.UndefOr[Capacity]
    var TableName: js.UndefOr[TableName]
    var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits]
  }

  object ConsumedCapacity {
    def apply(CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined,
              GlobalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined,
              LocalSecondaryIndexes: js.UndefOr[SecondaryIndexesCapacityMap] = js.undefined,
              ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined,
              Table: js.UndefOr[Capacity] = js.undefined,
              TableName: js.UndefOr[TableName] = js.undefined,
              WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined): ConsumedCapacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CapacityUnits" -> CapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalSecondaryIndexes" -> GlobalSecondaryIndexes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocalSecondaryIndexes" -> LocalSecondaryIndexes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadCapacityUnits" -> ReadCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Table" -> Table.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableName" -> TableName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WriteCapacityUnits" -> WriteCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConsumedCapacity]
    }
  }

  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  @js.native
  trait ContinuousBackupsDescription extends js.Object {
    var ContinuousBackupsStatus: ContinuousBackupsStatus
    var PointInTimeRecoveryDescription: js.UndefOr[PointInTimeRecoveryDescription]
  }

  object ContinuousBackupsDescription {
    def apply(
        ContinuousBackupsStatus: ContinuousBackupsStatus,
        PointInTimeRecoveryDescription: js.UndefOr[PointInTimeRecoveryDescription] = js.undefined
    ): ContinuousBackupsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContinuousBackupsStatus" -> ContinuousBackupsStatus.asInstanceOf[js.Any],
        "PointInTimeRecoveryDescription" -> PointInTimeRecoveryDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinuousBackupsDescription]
    }
  }

  object ContinuousBackupsStatusEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  @js.native
  trait CreateBackupInput extends js.Object {
    var BackupName: BackupName
    var TableName: TableName
  }

  object CreateBackupInput {
    def apply(BackupName: BackupName, TableName: TableName): CreateBackupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupName" -> BackupName.asInstanceOf[js.Any],
        "TableName"  -> TableName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBackupInput]
    }
  }

  @js.native
  trait CreateBackupOutput extends js.Object {
    var BackupDetails: js.UndefOr[BackupDetails]
  }

  object CreateBackupOutput {
    def apply(BackupDetails: js.UndefOr[BackupDetails] = js.undefined): CreateBackupOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("BackupDetails" -> BackupDetails.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBackupOutput]
    }
  }

  /**
    * Represents a new global secondary index to be added to an existing table.
    */
  @js.native
  trait CreateGlobalSecondaryIndexAction extends js.Object {
    var IndexName: IndexName
    var KeySchema: KeySchema
    var Projection: Projection
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
  }

  object CreateGlobalSecondaryIndexAction {
    def apply(
        IndexName: IndexName,
        KeySchema: KeySchema,
        Projection: Projection,
        ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined
    ): CreateGlobalSecondaryIndexAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName"  -> IndexName.asInstanceOf[js.Any],
        "KeySchema"  -> KeySchema.asInstanceOf[js.Any],
        "Projection" -> Projection.asInstanceOf[js.Any],
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGlobalSecondaryIndexAction]
    }
  }

  @js.native
  trait CreateGlobalTableInput extends js.Object {
    var GlobalTableName: TableName
    var ReplicationGroup: ReplicaList
  }

  object CreateGlobalTableInput {
    def apply(GlobalTableName: TableName, ReplicationGroup: ReplicaList): CreateGlobalTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableName"  -> GlobalTableName.asInstanceOf[js.Any],
        "ReplicationGroup" -> ReplicationGroup.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGlobalTableInput]
    }
  }

  @js.native
  trait CreateGlobalTableOutput extends js.Object {
    var GlobalTableDescription: js.UndefOr[GlobalTableDescription]
  }

  object CreateGlobalTableOutput {
    def apply(GlobalTableDescription: js.UndefOr[GlobalTableDescription] = js.undefined): CreateGlobalTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalTableDescription" -> GlobalTableDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGlobalTableOutput]
    }
  }

  /**
    * Represents a replica to be added.
    */
  @js.native
  trait CreateReplicaAction extends js.Object {
    var RegionName: RegionName
  }

  object CreateReplicaAction {
    def apply(RegionName: RegionName): CreateReplicaAction = {
      val _fields = IndexedSeq[(String, js.Any)]("RegionName" -> RegionName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicaAction]
    }
  }

  /**
    * Represents the input of a <code>CreateTable</code> operation.
    */
  @js.native
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
  }

  object CreateTableInput {
    def apply(AttributeDefinitions: AttributeDefinitions,
              KeySchema: KeySchema,
              TableName: TableName,
              BillingMode: js.UndefOr[BillingMode] = js.undefined,
              GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexList] = js.undefined,
              LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexList] = js.undefined,
              ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined,
              SSESpecification: js.UndefOr[SSESpecification] = js.undefined,
              StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined): CreateTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeDefinitions" -> AttributeDefinitions.asInstanceOf[js.Any],
        "KeySchema"            -> KeySchema.asInstanceOf[js.Any],
        "TableName"            -> TableName.asInstanceOf[js.Any],
        "BillingMode" -> BillingMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalSecondaryIndexes" -> GlobalSecondaryIndexes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocalSecondaryIndexes" -> LocalSecondaryIndexes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SSESpecification" -> SSESpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamSpecification" -> StreamSpecification.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTableInput]
    }
  }

  /**
    * Represents the output of a <code>CreateTable</code> operation.
    */
  @js.native
  trait CreateTableOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  object CreateTableOutput {
    def apply(TableDescription: js.UndefOr[TableDescription] = js.undefined): CreateTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("TableDescription" -> TableDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTableOutput]
    }
  }

  /**
    * Represents a request to perform a <code>DeleteItem</code> operation.
    */
  @js.native
  trait Delete extends js.Object {
    var Key: Key
    var TableName: TableName
    var ConditionExpression: js.UndefOr[ConditionExpression]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure]
  }

  object Delete {
    def apply(
        Key: Key,
        TableName: TableName,
        ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined,
        ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
        ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
        ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
    ): Delete = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key"       -> Key.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "ConditionExpression" -> ConditionExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnValuesOnConditionCheckFailure" -> ReturnValuesOnConditionCheckFailure.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Delete]
    }
  }

  @js.native
  trait DeleteBackupInput extends js.Object {
    var BackupArn: BackupArn
  }

  object DeleteBackupInput {
    def apply(BackupArn: BackupArn): DeleteBackupInput = {
      val _fields = IndexedSeq[(String, js.Any)]("BackupArn" -> BackupArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBackupInput]
    }
  }

  @js.native
  trait DeleteBackupOutput extends js.Object {
    var BackupDescription: js.UndefOr[BackupDescription]
  }

  object DeleteBackupOutput {
    def apply(BackupDescription: js.UndefOr[BackupDescription] = js.undefined): DeleteBackupOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("BackupDescription" -> BackupDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBackupOutput]
    }
  }

  /**
    * Represents a global secondary index to be deleted from an existing table.
    */
  @js.native
  trait DeleteGlobalSecondaryIndexAction extends js.Object {
    var IndexName: IndexName
  }

  object DeleteGlobalSecondaryIndexAction {
    def apply(IndexName: IndexName): DeleteGlobalSecondaryIndexAction = {
      val _fields = IndexedSeq[(String, js.Any)]("IndexName" -> IndexName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGlobalSecondaryIndexAction]
    }
  }

  /**
    * Represents the input of a <code>DeleteItem</code> operation.
    */
  @js.native
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

  object DeleteItemInput {
    def apply(Key: Key,
              TableName: TableName,
              ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined,
              ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined,
              Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined,
              ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
              ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
              ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
              ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined,
              ReturnValues: js.UndefOr[ReturnValue] = js.undefined): DeleteItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key"       -> Key.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "ConditionExpression" -> ConditionExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConditionalOperator" -> ConditionalOperator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Expected" -> Expected.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnValues" -> ReturnValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteItemInput]
    }
  }

  /**
    * Represents the output of a <code>DeleteItem</code> operation.
    */
  @js.native
  trait DeleteItemOutput extends js.Object {
    var Attributes: js.UndefOr[AttributeMap]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics]
  }

  object DeleteItemOutput {
    def apply(Attributes: js.UndefOr[AttributeMap] = js.undefined,
              ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
              ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics] = js.undefined): DeleteItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConsumedCapacity" -> ConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ItemCollectionMetrics" -> ItemCollectionMetrics.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteItemOutput]
    }
  }

  /**
    * Represents a replica to be removed.
    */
  @js.native
  trait DeleteReplicaAction extends js.Object {
    var RegionName: RegionName
  }

  object DeleteReplicaAction {
    def apply(RegionName: RegionName): DeleteReplicaAction = {
      val _fields = IndexedSeq[(String, js.Any)]("RegionName" -> RegionName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicaAction]
    }
  }

  /**
    * Represents a request to perform a <code>DeleteItem</code> operation on an item.
    */
  @js.native
  trait DeleteRequest extends js.Object {
    var Key: Key
  }

  object DeleteRequest {
    def apply(Key: Key): DeleteRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Key" -> Key.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRequest]
    }
  }

  /**
    * Represents the input of a <code>DeleteTable</code> operation.
    */
  @js.native
  trait DeleteTableInput extends js.Object {
    var TableName: TableName
  }

  object DeleteTableInput {
    def apply(TableName: TableName): DeleteTableInput = {
      val _fields = IndexedSeq[(String, js.Any)]("TableName" -> TableName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTableInput]
    }
  }

  /**
    * Represents the output of a <code>DeleteTable</code> operation.
    */
  @js.native
  trait DeleteTableOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  object DeleteTableOutput {
    def apply(TableDescription: js.UndefOr[TableDescription] = js.undefined): DeleteTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("TableDescription" -> TableDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTableOutput]
    }
  }

  @js.native
  trait DescribeBackupInput extends js.Object {
    var BackupArn: BackupArn
  }

  object DescribeBackupInput {
    def apply(BackupArn: BackupArn): DescribeBackupInput = {
      val _fields = IndexedSeq[(String, js.Any)]("BackupArn" -> BackupArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBackupInput]
    }
  }

  @js.native
  trait DescribeBackupOutput extends js.Object {
    var BackupDescription: js.UndefOr[BackupDescription]
  }

  object DescribeBackupOutput {
    def apply(BackupDescription: js.UndefOr[BackupDescription] = js.undefined): DescribeBackupOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("BackupDescription" -> BackupDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBackupOutput]
    }
  }

  @js.native
  trait DescribeContinuousBackupsInput extends js.Object {
    var TableName: TableName
  }

  object DescribeContinuousBackupsInput {
    def apply(TableName: TableName): DescribeContinuousBackupsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("TableName" -> TableName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeContinuousBackupsInput]
    }
  }

  @js.native
  trait DescribeContinuousBackupsOutput extends js.Object {
    var ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription]
  }

  object DescribeContinuousBackupsOutput {
    def apply(
        ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription] = js.undefined
    ): DescribeContinuousBackupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("ContinuousBackupsDescription" -> ContinuousBackupsDescription.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeContinuousBackupsOutput]
    }
  }

  @js.native
  trait DescribeEndpointsRequest extends js.Object {}

  object DescribeEndpointsRequest {
    def apply(): DescribeEndpointsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointsRequest]
    }
  }

  @js.native
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: Endpoints
  }

  object DescribeEndpointsResponse {
    def apply(Endpoints: Endpoints): DescribeEndpointsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Endpoints" -> Endpoints.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointsResponse]
    }
  }

  @js.native
  trait DescribeGlobalTableInput extends js.Object {
    var GlobalTableName: TableName
  }

  object DescribeGlobalTableInput {
    def apply(GlobalTableName: TableName): DescribeGlobalTableInput = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalTableName" -> GlobalTableName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGlobalTableInput]
    }
  }

  @js.native
  trait DescribeGlobalTableOutput extends js.Object {
    var GlobalTableDescription: js.UndefOr[GlobalTableDescription]
  }

  object DescribeGlobalTableOutput {
    def apply(GlobalTableDescription: js.UndefOr[GlobalTableDescription] = js.undefined): DescribeGlobalTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalTableDescription" -> GlobalTableDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGlobalTableOutput]
    }
  }

  @js.native
  trait DescribeGlobalTableSettingsInput extends js.Object {
    var GlobalTableName: TableName
  }

  object DescribeGlobalTableSettingsInput {
    def apply(GlobalTableName: TableName): DescribeGlobalTableSettingsInput = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalTableName" -> GlobalTableName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

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
        ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.undefined
    ): DescribeGlobalTableSettingsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalTableName" -> GlobalTableName.map { x =>
        x.asInstanceOf[js.Any]
      }, "ReplicaSettings" -> ReplicaSettings.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGlobalTableSettingsOutput]
    }
  }

  /**
    * Represents the input of a <code>DescribeLimits</code> operation. Has no content.
    */
  @js.native
  trait DescribeLimitsInput extends js.Object {}

  object DescribeLimitsInput {
    def apply(): DescribeLimitsInput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLimitsInput]
    }
  }

  /**
    * Represents the output of a <code>DescribeLimits</code> operation.
    */
  @js.native
  trait DescribeLimitsOutput extends js.Object {
    var AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject]
    var TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  object DescribeLimitsOutput {
    def apply(AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
              AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
              TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
              TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined): DescribeLimitsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountMaxReadCapacityUnits" -> AccountMaxReadCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AccountMaxWriteCapacityUnits" -> AccountMaxWriteCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableMaxReadCapacityUnits" -> TableMaxReadCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableMaxWriteCapacityUnits" -> TableMaxWriteCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLimitsOutput]
    }
  }

  /**
    * Represents the input of a <code>DescribeTable</code> operation.
    */
  @js.native
  trait DescribeTableInput extends js.Object {
    var TableName: TableName
  }

  object DescribeTableInput {
    def apply(TableName: TableName): DescribeTableInput = {
      val _fields = IndexedSeq[(String, js.Any)]("TableName" -> TableName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTableInput]
    }
  }

  /**
    * Represents the output of a <code>DescribeTable</code> operation.
    */
  @js.native
  trait DescribeTableOutput extends js.Object {
    var Table: js.UndefOr[TableDescription]
  }

  object DescribeTableOutput {
    def apply(Table: js.UndefOr[TableDescription] = js.undefined): DescribeTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("Table" -> Table.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTableOutput]
    }
  }

  @js.native
  trait DescribeTimeToLiveInput extends js.Object {
    var TableName: TableName
  }

  object DescribeTimeToLiveInput {
    def apply(TableName: TableName): DescribeTimeToLiveInput = {
      val _fields = IndexedSeq[(String, js.Any)]("TableName" -> TableName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTimeToLiveInput]
    }
  }

  @js.native
  trait DescribeTimeToLiveOutput extends js.Object {
    var TimeToLiveDescription: js.UndefOr[TimeToLiveDescription]
  }

  object DescribeTimeToLiveOutput {
    def apply(TimeToLiveDescription: js.UndefOr[TimeToLiveDescription] = js.undefined): DescribeTimeToLiveOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("TimeToLiveDescription" -> TimeToLiveDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTimeToLiveOutput]
    }
  }

  @js.native
  trait Endpoint extends js.Object {
    var Address: String
    var CachePeriodInMinutes: Double
  }

  object Endpoint {
    def apply(Address: String, CachePeriodInMinutes: Double): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address"              -> Address.asInstanceOf[js.Any],
        "CachePeriodInMinutes" -> CachePeriodInMinutes.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
    }
  }

  /**
    * Represents a condition to be compared with an attribute value. This condition can be used with <code>DeleteItem</code>, <code>PutItem</code> or <code>UpdateItem</code> operations; if the comparison evaluates to true, the operation succeeds; if not, the operation fails. You can use <code>ExpectedAttributeValue</code> in one of two different ways:
    * * Use <code>AttributeValueList</code> to specify one or more values to compare against an attribute. Use <code>ComparisonOperator</code> to specify how you want to perform the comparison. If the comparison evaluates to true, then the conditional operation succeeds.
    *  * Use <code>Value</code> to specify a value that DynamoDB will compare against an attribute. If the values match, then <code>ExpectedAttributeValue</code> evaluates to true and the conditional operation succeeds. Optionally, you can also set <code>Exists</code> to false, indicating that you <i>do not</i> expect to find the attribute value in the table. In this case, the conditional operation succeeds only if the comparison evaluates to false.
    * <code>Value</code> and <code>Exists</code> are incompatible with <code>AttributeValueList</code> and <code>ComparisonOperator</code>. Note that if you use both sets of parameters at once, DynamoDB will return a <code>ValidationException</code> exception.
    */
  @js.native
  trait ExpectedAttributeValue extends js.Object {
    var AttributeValueList: js.UndefOr[AttributeValueList]
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var Exists: js.UndefOr[BooleanObject]
    var Value: js.UndefOr[AttributeValue]
  }

  object ExpectedAttributeValue {
    def apply(AttributeValueList: js.UndefOr[AttributeValueList] = js.undefined,
              ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
              Exists: js.UndefOr[BooleanObject] = js.undefined,
              Value: js.UndefOr[AttributeValue] = js.undefined): ExpectedAttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeValueList" -> AttributeValueList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ComparisonOperator" -> ComparisonOperator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Exists" -> Exists.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExpectedAttributeValue]
    }
  }

  /**
    * Specifies an item and related attribute values to retrieve in a <code>TransactGetItem</code> object.
    */
  @js.native
  trait Get extends js.Object {
    var Key: Key
    var TableName: TableName
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ProjectionExpression: js.UndefOr[ProjectionExpression]
  }

  object Get {
    def apply(Key: Key,
              TableName: TableName,
              ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
              ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined): Get = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key"       -> Key.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProjectionExpression" -> ProjectionExpression.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Get]
    }
  }

  /**
    * Represents the input of a <code>GetItem</code> operation.
    */
  @js.native
  trait GetItemInput extends js.Object {
    var Key: Key
    var TableName: TableName
    var AttributesToGet: js.UndefOr[AttributeNameList]
    var ConsistentRead: js.UndefOr[ConsistentRead]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ProjectionExpression: js.UndefOr[ProjectionExpression]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
  }

  object GetItemInput {
    def apply(Key: Key,
              TableName: TableName,
              AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined,
              ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined,
              ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
              ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined,
              ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined): GetItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key"       -> Key.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "AttributesToGet" -> AttributesToGet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConsistentRead" -> ConsistentRead.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProjectionExpression" -> ProjectionExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetItemInput]
    }
  }

  /**
    * Represents the output of a <code>GetItem</code> operation.
    */
  @js.native
  trait GetItemOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var Item: js.UndefOr[AttributeMap]
  }

  object GetItemOutput {
    def apply(ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
              Item: js.UndefOr[AttributeMap] = js.undefined): GetItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("ConsumedCapacity" -> ConsumedCapacity.map { x =>
        x.asInstanceOf[js.Any]
      }, "Item" -> Item.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetItemOutput]
    }
  }

  /**
    * Represents the properties of a global secondary index.
    */
  @js.native
  trait GlobalSecondaryIndex extends js.Object {
    var IndexName: IndexName
    var KeySchema: KeySchema
    var Projection: Projection
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
  }

  object GlobalSecondaryIndex {
    def apply(IndexName: IndexName,
              KeySchema: KeySchema,
              Projection: Projection,
              ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined): GlobalSecondaryIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName"  -> IndexName.asInstanceOf[js.Any],
        "KeySchema"  -> KeySchema.asInstanceOf[js.Any],
        "Projection" -> Projection.asInstanceOf[js.Any],
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSecondaryIndex]
    }
  }

  /**
    * Represents the properties of a global secondary index.
    */
  @js.native
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

  object GlobalSecondaryIndexDescription {
    def apply(
        Backfilling: js.UndefOr[Backfilling] = js.undefined,
        IndexArn: js.UndefOr[String] = js.undefined,
        IndexName: js.UndefOr[IndexName] = js.undefined,
        IndexSizeBytes: js.UndefOr[Double] = js.undefined,
        IndexStatus: js.UndefOr[IndexStatus] = js.undefined,
        ItemCount: js.UndefOr[Double] = js.undefined,
        KeySchema: js.UndefOr[KeySchema] = js.undefined,
        Projection: js.UndefOr[Projection] = js.undefined,
        ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined
    ): GlobalSecondaryIndexDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Backfilling" -> Backfilling.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IndexArn" -> IndexArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IndexName" -> IndexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IndexSizeBytes" -> IndexSizeBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IndexStatus" -> IndexStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ItemCount" -> ItemCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeySchema" -> KeySchema.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Projection" -> Projection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSecondaryIndexDescription]
    }
  }

  /**
    * Represents the properties of a global secondary index for the table when the backup was created.
    */
  @js.native
  trait GlobalSecondaryIndexInfo extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var KeySchema: js.UndefOr[KeySchema]
    var Projection: js.UndefOr[Projection]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
  }

  object GlobalSecondaryIndexInfo {
    def apply(IndexName: js.UndefOr[IndexName] = js.undefined,
              KeySchema: js.UndefOr[KeySchema] = js.undefined,
              Projection: js.UndefOr[Projection] = js.undefined,
              ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined): GlobalSecondaryIndexInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeySchema" -> KeySchema.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Projection" -> Projection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSecondaryIndexInfo]
    }
  }

  /**
    * Represents one of the following:
    * * A new global secondary index to be added to an existing table.
    *  * New provisioned throughput parameters for an existing global secondary index.
    *  * An existing global secondary index to be removed from an existing table.
    */
  @js.native
  trait GlobalSecondaryIndexUpdate extends js.Object {
    var Create: js.UndefOr[CreateGlobalSecondaryIndexAction]
    var Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction]
    var Update: js.UndefOr[UpdateGlobalSecondaryIndexAction]
  }

  object GlobalSecondaryIndexUpdate {
    def apply(Create: js.UndefOr[CreateGlobalSecondaryIndexAction] = js.undefined,
              Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction] = js.undefined,
              Update: js.UndefOr[UpdateGlobalSecondaryIndexAction] = js.undefined): GlobalSecondaryIndexUpdate = {
      val _fields = IndexedSeq[(String, js.Any)]("Create" -> Create.map { x =>
        x.asInstanceOf[js.Any]
      }, "Delete" -> Delete.map { x =>
        x.asInstanceOf[js.Any]
      }, "Update" -> Update.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalSecondaryIndexUpdate]
    }
  }

  /**
    * Represents the properties of a global table.
    */
  @js.native
  trait GlobalTable extends js.Object {
    var GlobalTableName: js.UndefOr[TableName]
    var ReplicationGroup: js.UndefOr[ReplicaList]
  }

  object GlobalTable {
    def apply(GlobalTableName: js.UndefOr[TableName] = js.undefined,
              ReplicationGroup: js.UndefOr[ReplicaList] = js.undefined): GlobalTable = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalTableName" -> GlobalTableName.map { x =>
        x.asInstanceOf[js.Any]
      }, "ReplicationGroup" -> ReplicationGroup.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalTable]
    }
  }

  /**
    * Contains details about the global table.
    */
  @js.native
  trait GlobalTableDescription extends js.Object {
    var CreationDateTime: js.UndefOr[Date]
    var GlobalTableArn: js.UndefOr[GlobalTableArnString]
    var GlobalTableName: js.UndefOr[TableName]
    var GlobalTableStatus: js.UndefOr[GlobalTableStatus]
    var ReplicationGroup: js.UndefOr[ReplicaDescriptionList]
  }

  object GlobalTableDescription {
    def apply(CreationDateTime: js.UndefOr[Date] = js.undefined,
              GlobalTableArn: js.UndefOr[GlobalTableArnString] = js.undefined,
              GlobalTableName: js.UndefOr[TableName] = js.undefined,
              GlobalTableStatus: js.UndefOr[GlobalTableStatus] = js.undefined,
              ReplicationGroup: js.UndefOr[ReplicaDescriptionList] = js.undefined): GlobalTableDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDateTime" -> CreationDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalTableArn" -> GlobalTableArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalTableName" -> GlobalTableName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalTableStatus" -> GlobalTableStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReplicationGroup" -> ReplicationGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalTableDescription]
    }
  }

  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  @js.native
  trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends js.Object {
    var IndexName: IndexName
    var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate]
    var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  object GlobalTableGlobalSecondaryIndexSettingsUpdate {
    def apply(
        IndexName: IndexName,
        ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined,
        ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    ): GlobalTableGlobalSecondaryIndexSettingsUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "ProvisionedWriteCapacityAutoScalingSettingsUpdate" -> ProvisionedWriteCapacityAutoScalingSettingsUpdate.map {
          x =>
            x.asInstanceOf[js.Any]
        },
        "ProvisionedWriteCapacityUnits" -> ProvisionedWriteCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[GlobalTableGlobalSecondaryIndexSettingsUpdate]
    }
  }

  object GlobalTableStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE   = "ACTIVE"
    val DELETING = "DELETING"
    val UPDATING = "UPDATING"

    val values = IndexedSeq(CREATING, ACTIVE, DELETING, UPDATING)
  }

  object IndexStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val ACTIVE   = "ACTIVE"

    val values = IndexedSeq(CREATING, UPDATING, DELETING, ACTIVE)
  }

  /**
    * Information about item collections, if any, that were affected by the operation. <code>ItemCollectionMetrics</code> is only returned if the request asked for it. If the table does not have any local secondary indexes, this information is not returned in the response.
    */
  @js.native
  trait ItemCollectionMetrics extends js.Object {
    var ItemCollectionKey: js.UndefOr[ItemCollectionKeyAttributeMap]
    var SizeEstimateRangeGB: js.UndefOr[ItemCollectionSizeEstimateRange]
  }

  object ItemCollectionMetrics {
    def apply(
        ItemCollectionKey: js.UndefOr[ItemCollectionKeyAttributeMap] = js.undefined,
        SizeEstimateRangeGB: js.UndefOr[ItemCollectionSizeEstimateRange] = js.undefined
    ): ItemCollectionMetrics = {
      val _fields = IndexedSeq[(String, js.Any)]("ItemCollectionKey" -> ItemCollectionKey.map { x =>
        x.asInstanceOf[js.Any]
      }, "SizeEstimateRangeGB" -> SizeEstimateRangeGB.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ItemCollectionMetrics]
    }
  }

  /**
    * Details for the requested item.
    */
  @js.native
  trait ItemResponse extends js.Object {
    var Item: js.UndefOr[AttributeMap]
  }

  object ItemResponse {
    def apply(Item: js.UndefOr[AttributeMap] = js.undefined): ItemResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Item" -> Item.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ItemResponse]
    }
  }

  /**
    * Represents <i>a single element</i> of a key schema. A key schema specifies the attributes that make up the primary key of a table, or the key attributes of an index.
    *  A <code>KeySchemaElement</code> represents exactly one attribute of the primary key. For example, a simple primary key would be represented by one <code>KeySchemaElement</code> (for the partition key). A composite primary key would require one <code>KeySchemaElement</code> for the partition key, and another <code>KeySchemaElement</code> for the sort key.
    *  A <code>KeySchemaElement</code> must be a scalar, top-level attribute (not a nested attribute). The data type must be one of String, Number, or Binary. The attribute cannot be nested within a List or a Map.
    */
  @js.native
  trait KeySchemaElement extends js.Object {
    var AttributeName: KeySchemaAttributeName
    var KeyType: KeyType
  }

  object KeySchemaElement {
    def apply(AttributeName: KeySchemaAttributeName, KeyType: KeyType): KeySchemaElement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "KeyType"       -> KeyType.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeySchemaElement]
    }
  }

  object KeyTypeEnum {
    val HASH  = "HASH"
    val RANGE = "RANGE"

    val values = IndexedSeq(HASH, RANGE)
  }

  /**
    * Represents a set of primary keys and, for each key, the attributes to retrieve from the table.
    *  For each primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary key, you only need to provide the partition key. For a composite primary key, you must provide <i>both</i> the partition key and the sort key.
    */
  @js.native
  trait KeysAndAttributes extends js.Object {
    var Keys: KeyList
    var AttributesToGet: js.UndefOr[AttributeNameList]
    var ConsistentRead: js.UndefOr[ConsistentRead]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ProjectionExpression: js.UndefOr[ProjectionExpression]
  }

  object KeysAndAttributes {
    def apply(Keys: KeyList,
              AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined,
              ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined,
              ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
              ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined): KeysAndAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Keys" -> Keys.asInstanceOf[js.Any],
        "AttributesToGet" -> AttributesToGet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConsistentRead" -> ConsistentRead.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProjectionExpression" -> ProjectionExpression.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeysAndAttributes]
    }
  }

  @js.native
  trait ListBackupsInput extends js.Object {
    var BackupType: js.UndefOr[BackupTypeFilter]
    var ExclusiveStartBackupArn: js.UndefOr[BackupArn]
    var Limit: js.UndefOr[BackupsInputLimit]
    var TableName: js.UndefOr[TableName]
    var TimeRangeLowerBound: js.UndefOr[TimeRangeLowerBound]
    var TimeRangeUpperBound: js.UndefOr[TimeRangeUpperBound]
  }

  object ListBackupsInput {
    def apply(BackupType: js.UndefOr[BackupTypeFilter] = js.undefined,
              ExclusiveStartBackupArn: js.UndefOr[BackupArn] = js.undefined,
              Limit: js.UndefOr[BackupsInputLimit] = js.undefined,
              TableName: js.UndefOr[TableName] = js.undefined,
              TimeRangeLowerBound: js.UndefOr[TimeRangeLowerBound] = js.undefined,
              TimeRangeUpperBound: js.UndefOr[TimeRangeUpperBound] = js.undefined): ListBackupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupType" -> BackupType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExclusiveStartBackupArn" -> ExclusiveStartBackupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableName" -> TableName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeRangeLowerBound" -> TimeRangeLowerBound.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeRangeUpperBound" -> TimeRangeUpperBound.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBackupsInput]
    }
  }

  @js.native
  trait ListBackupsOutput extends js.Object {
    var BackupSummaries: js.UndefOr[BackupSummaries]
    var LastEvaluatedBackupArn: js.UndefOr[BackupArn]
  }

  object ListBackupsOutput {
    def apply(BackupSummaries: js.UndefOr[BackupSummaries] = js.undefined,
              LastEvaluatedBackupArn: js.UndefOr[BackupArn] = js.undefined): ListBackupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("BackupSummaries" -> BackupSummaries.map { x =>
        x.asInstanceOf[js.Any]
      }, "LastEvaluatedBackupArn" -> LastEvaluatedBackupArn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(ExclusiveStartGlobalTableName: js.UndefOr[TableName] = js.undefined,
              Limit: js.UndefOr[PositiveIntegerObject] = js.undefined,
              RegionName: js.UndefOr[RegionName] = js.undefined): ListGlobalTablesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExclusiveStartGlobalTableName" -> ExclusiveStartGlobalTableName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RegionName" -> RegionName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGlobalTablesInput]
    }
  }

  @js.native
  trait ListGlobalTablesOutput extends js.Object {
    var GlobalTables: js.UndefOr[GlobalTableList]
    var LastEvaluatedGlobalTableName: js.UndefOr[TableName]
  }

  object ListGlobalTablesOutput {
    def apply(GlobalTables: js.UndefOr[GlobalTableList] = js.undefined,
              LastEvaluatedGlobalTableName: js.UndefOr[TableName] = js.undefined): ListGlobalTablesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTables" -> GlobalTables.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastEvaluatedGlobalTableName" -> LastEvaluatedGlobalTableName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGlobalTablesOutput]
    }
  }

  /**
    * Represents the input of a <code>ListTables</code> operation.
    */
  @js.native
  trait ListTablesInput extends js.Object {
    var ExclusiveStartTableName: js.UndefOr[TableName]
    var Limit: js.UndefOr[ListTablesInputLimit]
  }

  object ListTablesInput {
    def apply(ExclusiveStartTableName: js.UndefOr[TableName] = js.undefined,
              Limit: js.UndefOr[ListTablesInputLimit] = js.undefined): ListTablesInput = {
      val _fields = IndexedSeq[(String, js.Any)]("ExclusiveStartTableName" -> ExclusiveStartTableName.map { x =>
        x.asInstanceOf[js.Any]
      }, "Limit" -> Limit.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTablesInput]
    }
  }

  /**
    * Represents the output of a <code>ListTables</code> operation.
    */
  @js.native
  trait ListTablesOutput extends js.Object {
    var LastEvaluatedTableName: js.UndefOr[TableName]
    var TableNames: js.UndefOr[TableNameList]
  }

  object ListTablesOutput {
    def apply(LastEvaluatedTableName: js.UndefOr[TableName] = js.undefined,
              TableNames: js.UndefOr[TableNameList] = js.undefined): ListTablesOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("LastEvaluatedTableName" -> LastEvaluatedTableName.map { x =>
        x.asInstanceOf[js.Any]
      }, "TableNames" -> TableNames.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTablesOutput]
    }
  }

  @js.native
  trait ListTagsOfResourceInput extends js.Object {
    var ResourceArn: ResourceArnString
    var NextToken: js.UndefOr[NextTokenString]
  }

  object ListTagsOfResourceInput {
    def apply(ResourceArn: ResourceArnString,
              NextToken: js.UndefOr[NextTokenString] = js.undefined): ListTagsOfResourceInput = {
      val _fields =
        IndexedSeq[(String, js.Any)]("ResourceArn" -> ResourceArn.asInstanceOf[js.Any], "NextToken" -> NextToken.map {
          x =>
            x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsOfResourceInput]
    }
  }

  @js.native
  trait ListTagsOfResourceOutput extends js.Object {
    var NextToken: js.UndefOr[NextTokenString]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsOfResourceOutput {
    def apply(NextToken: js.UndefOr[NextTokenString] = js.undefined,
              Tags: js.UndefOr[TagList] = js.undefined): ListTagsOfResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Tags" -> Tags.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsOfResourceOutput]
    }
  }

  /**
    * Represents the properties of a local secondary index.
    */
  @js.native
  trait LocalSecondaryIndex extends js.Object {
    var IndexName: IndexName
    var KeySchema: KeySchema
    var Projection: Projection
  }

  object LocalSecondaryIndex {
    def apply(IndexName: IndexName, KeySchema: KeySchema, Projection: Projection): LocalSecondaryIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName"  -> IndexName.asInstanceOf[js.Any],
        "KeySchema"  -> KeySchema.asInstanceOf[js.Any],
        "Projection" -> Projection.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocalSecondaryIndex]
    }
  }

  /**
    * Represents the properties of a local secondary index.
    */
  @js.native
  trait LocalSecondaryIndexDescription extends js.Object {
    var IndexArn: js.UndefOr[String]
    var IndexName: js.UndefOr[IndexName]
    var IndexSizeBytes: js.UndefOr[Double]
    var ItemCount: js.UndefOr[Double]
    var KeySchema: js.UndefOr[KeySchema]
    var Projection: js.UndefOr[Projection]
  }

  object LocalSecondaryIndexDescription {
    def apply(IndexArn: js.UndefOr[String] = js.undefined,
              IndexName: js.UndefOr[IndexName] = js.undefined,
              IndexSizeBytes: js.UndefOr[Double] = js.undefined,
              ItemCount: js.UndefOr[Double] = js.undefined,
              KeySchema: js.UndefOr[KeySchema] = js.undefined,
              Projection: js.UndefOr[Projection] = js.undefined): LocalSecondaryIndexDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexArn" -> IndexArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IndexName" -> IndexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IndexSizeBytes" -> IndexSizeBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ItemCount" -> ItemCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeySchema" -> KeySchema.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Projection" -> Projection.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocalSecondaryIndexDescription]
    }
  }

  /**
    * Represents the properties of a local secondary index for the table when the backup was created.
    */
  @js.native
  trait LocalSecondaryIndexInfo extends js.Object {
    var IndexName: js.UndefOr[IndexName]
    var KeySchema: js.UndefOr[KeySchema]
    var Projection: js.UndefOr[Projection]
  }

  object LocalSecondaryIndexInfo {
    def apply(IndexName: js.UndefOr[IndexName] = js.undefined,
              KeySchema: js.UndefOr[KeySchema] = js.undefined,
              Projection: js.UndefOr[Projection] = js.undefined): LocalSecondaryIndexInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeySchema" -> KeySchema.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Projection" -> Projection.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocalSecondaryIndexInfo]
    }
  }

  /**
    * The description of the point in time settings applied to the table.
    */
  @js.native
  trait PointInTimeRecoveryDescription extends js.Object {
    var EarliestRestorableDateTime: js.UndefOr[Date]
    var LatestRestorableDateTime: js.UndefOr[Date]
    var PointInTimeRecoveryStatus: js.UndefOr[PointInTimeRecoveryStatus]
  }

  object PointInTimeRecoveryDescription {
    def apply(
        EarliestRestorableDateTime: js.UndefOr[Date] = js.undefined,
        LatestRestorableDateTime: js.UndefOr[Date] = js.undefined,
        PointInTimeRecoveryStatus: js.UndefOr[PointInTimeRecoveryStatus] = js.undefined
    ): PointInTimeRecoveryDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EarliestRestorableDateTime" -> EarliestRestorableDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestRestorableDateTime" -> LatestRestorableDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PointInTimeRecoveryStatus" -> PointInTimeRecoveryStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PointInTimeRecoveryDescription]
    }
  }

  /**
    * Represents the settings used to enable point in time recovery.
    */
  @js.native
  trait PointInTimeRecoverySpecification extends js.Object {
    var PointInTimeRecoveryEnabled: BooleanObject
  }

  object PointInTimeRecoverySpecification {
    def apply(PointInTimeRecoveryEnabled: BooleanObject): PointInTimeRecoverySpecification = {
      val _fields =
        IndexedSeq[(String, js.Any)]("PointInTimeRecoveryEnabled" -> PointInTimeRecoveryEnabled.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PointInTimeRecoverySpecification]
    }
  }

  object PointInTimeRecoveryStatusEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
    * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  @js.native
  trait Projection extends js.Object {
    var NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList]
    var ProjectionType: js.UndefOr[ProjectionType]
  }

  object Projection {
    def apply(NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList] = js.undefined,
              ProjectionType: js.UndefOr[ProjectionType] = js.undefined): Projection = {
      val _fields = IndexedSeq[(String, js.Any)]("NonKeyAttributes" -> NonKeyAttributes.map { x =>
        x.asInstanceOf[js.Any]
      }, "ProjectionType" -> ProjectionType.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Projection]
    }
  }

  object ProjectionTypeEnum {
    val ALL       = "ALL"
    val KEYS_ONLY = "KEYS_ONLY"
    val INCLUDE   = "INCLUDE"

    val values = IndexedSeq(ALL, KEYS_ONLY, INCLUDE)
  }

  /**
    * Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the <code>UpdateTable</code> operation.
    *  For current minimum and maximum provisioned throughput values, see [[http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html|Limits]] in the <i>Amazon DynamoDB Developer Guide</i>.
    */
  @js.native
  trait ProvisionedThroughput extends js.Object {
    var ReadCapacityUnits: PositiveLongObject
    var WriteCapacityUnits: PositiveLongObject
  }

  object ProvisionedThroughput {
    def apply(ReadCapacityUnits: PositiveLongObject, WriteCapacityUnits: PositiveLongObject): ProvisionedThroughput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReadCapacityUnits"  -> ReadCapacityUnits.asInstanceOf[js.Any],
        "WriteCapacityUnits" -> WriteCapacityUnits.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedThroughput]
    }
  }

  /**
    * Represents the provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.
    */
  @js.native
  trait ProvisionedThroughputDescription extends js.Object {
    var LastDecreaseDateTime: js.UndefOr[Date]
    var LastIncreaseDateTime: js.UndefOr[Date]
    var NumberOfDecreasesToday: js.UndefOr[PositiveLongObject]
    var ReadCapacityUnits: js.UndefOr[NonNegativeLongObject]
    var WriteCapacityUnits: js.UndefOr[NonNegativeLongObject]
  }

  object ProvisionedThroughputDescription {
    def apply(
        LastDecreaseDateTime: js.UndefOr[Date] = js.undefined,
        LastIncreaseDateTime: js.UndefOr[Date] = js.undefined,
        NumberOfDecreasesToday: js.UndefOr[PositiveLongObject] = js.undefined,
        ReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined,
        WriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
    ): ProvisionedThroughputDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastDecreaseDateTime" -> LastDecreaseDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastIncreaseDateTime" -> LastIncreaseDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfDecreasesToday" -> NumberOfDecreasesToday.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadCapacityUnits" -> ReadCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WriteCapacityUnits" -> WriteCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedThroughputDescription]
    }
  }

  /**
    * Represents a request to perform a <code>PutItem</code> operation.
    */
  @js.native
  trait Put extends js.Object {
    var Item: PutItemInputAttributeMap
    var TableName: TableName
    var ConditionExpression: js.UndefOr[ConditionExpression]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure]
  }

  object Put {
    def apply(
        Item: PutItemInputAttributeMap,
        TableName: TableName,
        ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined,
        ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
        ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
        ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
    ): Put = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Item"      -> Item.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "ConditionExpression" -> ConditionExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnValuesOnConditionCheckFailure" -> ReturnValuesOnConditionCheckFailure.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Put]
    }
  }

  /**
    * Represents the input of a <code>PutItem</code> operation.
    */
  @js.native
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

  object PutItemInput {
    def apply(Item: PutItemInputAttributeMap,
              TableName: TableName,
              ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined,
              ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined,
              Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined,
              ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
              ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
              ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
              ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined,
              ReturnValues: js.UndefOr[ReturnValue] = js.undefined): PutItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Item"      -> Item.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "ConditionExpression" -> ConditionExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConditionalOperator" -> ConditionalOperator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Expected" -> Expected.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnValues" -> ReturnValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutItemInput]
    }
  }

  /**
    * Represents the output of a <code>PutItem</code> operation.
    */
  @js.native
  trait PutItemOutput extends js.Object {
    var Attributes: js.UndefOr[AttributeMap]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics]
  }

  object PutItemOutput {
    def apply(Attributes: js.UndefOr[AttributeMap] = js.undefined,
              ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
              ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics] = js.undefined): PutItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConsumedCapacity" -> ConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ItemCollectionMetrics" -> ItemCollectionMetrics.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutItemOutput]
    }
  }

  /**
    * Represents a request to perform a <code>PutItem</code> operation on an item.
    */
  @js.native
  trait PutRequest extends js.Object {
    var Item: PutItemInputAttributeMap
  }

  object PutRequest {
    def apply(Item: PutItemInputAttributeMap): PutRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Item" -> Item.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRequest]
    }
  }

  /**
    * Represents the input of a <code>Query</code> operation.
    */
  @js.native
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

  object QueryInput {
    def apply(TableName: TableName,
              AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined,
              ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined,
              ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined,
              ExclusiveStartKey: js.UndefOr[Key] = js.undefined,
              ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
              ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
              FilterExpression: js.UndefOr[ConditionExpression] = js.undefined,
              IndexName: js.UndefOr[IndexName] = js.undefined,
              KeyConditionExpression: js.UndefOr[KeyExpression] = js.undefined,
              KeyConditions: js.UndefOr[KeyConditions] = js.undefined,
              Limit: js.UndefOr[PositiveIntegerObject] = js.undefined,
              ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined,
              QueryFilter: js.UndefOr[FilterConditionMap] = js.undefined,
              ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
              ScanIndexForward: js.UndefOr[BooleanObject] = js.undefined,
              Select: js.UndefOr[Select] = js.undefined): QueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableName" -> TableName.asInstanceOf[js.Any],
        "AttributesToGet" -> AttributesToGet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConditionalOperator" -> ConditionalOperator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConsistentRead" -> ConsistentRead.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExclusiveStartKey" -> ExclusiveStartKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilterExpression" -> FilterExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IndexName" -> IndexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeyConditionExpression" -> KeyConditionExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeyConditions" -> KeyConditions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProjectionExpression" -> ProjectionExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QueryFilter" -> QueryFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScanIndexForward" -> ScanIndexForward.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Select" -> Select.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryInput]
    }
  }

  /**
    * Represents the output of a <code>Query</code> operation.
    */
  @js.native
  trait QueryOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var Count: js.UndefOr[Int]
    var Items: js.UndefOr[ItemList]
    var LastEvaluatedKey: js.UndefOr[Key]
    var ScannedCount: js.UndefOr[Int]
  }

  object QueryOutput {
    def apply(ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
              Count: js.UndefOr[Int] = js.undefined,
              Items: js.UndefOr[ItemList] = js.undefined,
              LastEvaluatedKey: js.UndefOr[Key] = js.undefined,
              ScannedCount: js.UndefOr[Int] = js.undefined): QueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumedCapacity" -> ConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Count" -> Count.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Items" -> Items.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastEvaluatedKey" -> LastEvaluatedKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScannedCount" -> ScannedCount.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryOutput]
    }
  }

  /**
    * Represents the properties of a replica.
    */
  @js.native
  trait Replica extends js.Object {
    var RegionName: js.UndefOr[RegionName]
  }

  object Replica {
    def apply(RegionName: js.UndefOr[RegionName] = js.undefined): Replica = {
      val _fields = IndexedSeq[(String, js.Any)]("RegionName" -> RegionName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Replica]
    }
  }

  /**
    * Contains the details of the replica.
    */
  @js.native
  trait ReplicaDescription extends js.Object {
    var RegionName: js.UndefOr[RegionName]
  }

  object ReplicaDescription {
    def apply(RegionName: js.UndefOr[RegionName] = js.undefined): ReplicaDescription = {
      val _fields = IndexedSeq[(String, js.Any)]("RegionName" -> RegionName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicaDescription]
    }
  }

  /**
    * Represents the properties of a global secondary index.
    */
  @js.native
  trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
    var IndexName: IndexName
    var IndexStatus: js.UndefOr[IndexStatus]
    var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject]
    var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription]
    var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  object ReplicaGlobalSecondaryIndexSettingsDescription {
    def apply(
        IndexName: IndexName,
        IndexStatus: js.UndefOr[IndexStatus] = js.undefined,
        ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined,
        ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
        ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined,
        ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    ): ReplicaGlobalSecondaryIndexSettingsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "IndexStatus" -> IndexStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProvisionedReadCapacityAutoScalingSettings" -> ProvisionedReadCapacityAutoScalingSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProvisionedReadCapacityUnits" -> ProvisionedReadCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProvisionedWriteCapacityAutoScalingSettings" -> ProvisionedWriteCapacityAutoScalingSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProvisionedWriteCapacityUnits" -> ProvisionedWriteCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[ReplicaGlobalSecondaryIndexSettingsDescription]
    }
  }

  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  @js.native
  trait ReplicaGlobalSecondaryIndexSettingsUpdate extends js.Object {
    var IndexName: IndexName
    var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate]
    var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  object ReplicaGlobalSecondaryIndexSettingsUpdate {
    def apply(
        IndexName: IndexName,
        ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined,
        ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    ): ReplicaGlobalSecondaryIndexSettingsUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "ProvisionedReadCapacityAutoScalingSettingsUpdate" -> ProvisionedReadCapacityAutoScalingSettingsUpdate.map {
          x =>
            x.asInstanceOf[js.Any]
        },
        "ProvisionedReadCapacityUnits" -> ProvisionedReadCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicaGlobalSecondaryIndexSettingsUpdate]
    }
  }

  /**
    * Represents the properties of a replica.
    */
  @js.native
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

  object ReplicaSettingsDescription {
    def apply(
        RegionName: RegionName,
        ReplicaBillingModeSummary: js.UndefOr[BillingModeSummary] = js.undefined,
        ReplicaGlobalSecondaryIndexSettings: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsDescriptionList] =
          js.undefined,
        ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined,
        ReplicaProvisionedReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined,
        ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined,
        ReplicaProvisionedWriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined,
        ReplicaStatus: js.UndefOr[ReplicaStatus] = js.undefined
    ): ReplicaSettingsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegionName" -> RegionName.asInstanceOf[js.Any],
        "ReplicaBillingModeSummary" -> ReplicaBillingModeSummary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReplicaGlobalSecondaryIndexSettings" -> ReplicaGlobalSecondaryIndexSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReplicaProvisionedReadCapacityAutoScalingSettings" -> ReplicaProvisionedReadCapacityAutoScalingSettings.map {
          x =>
            x.asInstanceOf[js.Any]
        },
        "ReplicaProvisionedReadCapacityUnits" -> ReplicaProvisionedReadCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReplicaProvisionedWriteCapacityAutoScalingSettings" -> ReplicaProvisionedWriteCapacityAutoScalingSettings.map {
          x =>
            x.asInstanceOf[js.Any]
        },
        "ReplicaProvisionedWriteCapacityUnits" -> ReplicaProvisionedWriteCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReplicaStatus" -> ReplicaStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicaSettingsDescription]
    }
  }

  /**
    * Represents the settings for a global table in a region that will be modified.
    */
  @js.native
  trait ReplicaSettingsUpdate extends js.Object {
    var RegionName: RegionName
    var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsUpdateList]
    var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate]
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject]
  }

  object ReplicaSettingsUpdate {
    def apply(
        RegionName: RegionName,
        ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsUpdateList] =
          js.undefined,
        ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined,
        ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
    ): ReplicaSettingsUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegionName" -> RegionName.asInstanceOf[js.Any],
        "ReplicaGlobalSecondaryIndexSettingsUpdate" -> ReplicaGlobalSecondaryIndexSettingsUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate" -> ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate
          .map { x =>
            x.asInstanceOf[js.Any]
          },
        "ReplicaProvisionedReadCapacityUnits" -> ReplicaProvisionedReadCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicaSettingsUpdate]
    }
  }

  object ReplicaStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val ACTIVE   = "ACTIVE"

    val values = IndexedSeq(CREATING, UPDATING, DELETING, ACTIVE)
  }

  /**
    * Represents one of the following:
    * * A new replica to be added to an existing global table.
    *  * New parameters for an existing replica.
    *  * An existing replica to be removed from an existing global table.
    */
  @js.native
  trait ReplicaUpdate extends js.Object {
    var Create: js.UndefOr[CreateReplicaAction]
    var Delete: js.UndefOr[DeleteReplicaAction]
  }

  object ReplicaUpdate {
    def apply(Create: js.UndefOr[CreateReplicaAction] = js.undefined,
              Delete: js.UndefOr[DeleteReplicaAction] = js.undefined): ReplicaUpdate = {
      val _fields = IndexedSeq[(String, js.Any)]("Create" -> Create.map { x =>
        x.asInstanceOf[js.Any]
      }, "Delete" -> Delete.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicaUpdate]
    }
  }

  /**
    * Contains details for the restore.
    */
  @js.native
  trait RestoreSummary extends js.Object {
    var RestoreDateTime: Date
    var RestoreInProgress: RestoreInProgress
    var SourceBackupArn: js.UndefOr[BackupArn]
    var SourceTableArn: js.UndefOr[TableArn]
  }

  object RestoreSummary {
    def apply(RestoreDateTime: Date,
              RestoreInProgress: RestoreInProgress,
              SourceBackupArn: js.UndefOr[BackupArn] = js.undefined,
              SourceTableArn: js.UndefOr[TableArn] = js.undefined): RestoreSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RestoreDateTime"   -> RestoreDateTime.asInstanceOf[js.Any],
        "RestoreInProgress" -> RestoreInProgress.asInstanceOf[js.Any],
        "SourceBackupArn" -> SourceBackupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceTableArn" -> SourceTableArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreSummary]
    }
  }

  @js.native
  trait RestoreTableFromBackupInput extends js.Object {
    var BackupArn: BackupArn
    var TargetTableName: TableName
  }

  object RestoreTableFromBackupInput {
    def apply(BackupArn: BackupArn, TargetTableName: TableName): RestoreTableFromBackupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupArn"       -> BackupArn.asInstanceOf[js.Any],
        "TargetTableName" -> TargetTableName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreTableFromBackupInput]
    }
  }

  @js.native
  trait RestoreTableFromBackupOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  object RestoreTableFromBackupOutput {
    def apply(TableDescription: js.UndefOr[TableDescription] = js.undefined): RestoreTableFromBackupOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("TableDescription" -> TableDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreTableFromBackupOutput]
    }
  }

  @js.native
  trait RestoreTableToPointInTimeInput extends js.Object {
    var SourceTableName: TableName
    var TargetTableName: TableName
    var RestoreDateTime: js.UndefOr[Date]
    var UseLatestRestorableTime: js.UndefOr[BooleanObject]
  }

  object RestoreTableToPointInTimeInput {
    def apply(SourceTableName: TableName,
              TargetTableName: TableName,
              RestoreDateTime: js.UndefOr[Date] = js.undefined,
              UseLatestRestorableTime: js.UndefOr[BooleanObject] = js.undefined): RestoreTableToPointInTimeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceTableName" -> SourceTableName.asInstanceOf[js.Any],
        "TargetTableName" -> TargetTableName.asInstanceOf[js.Any],
        "RestoreDateTime" -> RestoreDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseLatestRestorableTime" -> UseLatestRestorableTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreTableToPointInTimeInput]
    }
  }

  @js.native
  trait RestoreTableToPointInTimeOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  object RestoreTableToPointInTimeOutput {
    def apply(TableDescription: js.UndefOr[TableDescription] = js.undefined): RestoreTableToPointInTimeOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("TableDescription" -> TableDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreTableToPointInTimeOutput]
    }
  }

  /**
    * Determines the level of detail about provisioned throughput consumption that is returned in the response:
    * * <code>INDEXES</code> - The response includes the aggregate <code>ConsumedCapacity</code> for the operation, together with <code>ConsumedCapacity</code> for each table and secondary index that was accessed.
    *  Note that some operations, such as <code>GetItem</code> and <code>BatchGetItem</code>, do not access any indexes at all. In these cases, specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code> information for table(s).
    *  * <code>TOTAL</code> - The response includes only the aggregate <code>ConsumedCapacity</code> for the operation.
    *  * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the response.
    */
  object ReturnConsumedCapacityEnum {
    val INDEXES = "INDEXES"
    val TOTAL   = "TOTAL"
    val NONE    = "NONE"

    val values = IndexedSeq(INDEXES, TOTAL, NONE)
  }

  object ReturnItemCollectionMetricsEnum {
    val SIZE = "SIZE"
    val NONE = "NONE"

    val values = IndexedSeq(SIZE, NONE)
  }

  object ReturnValueEnum {
    val NONE        = "NONE"
    val ALL_OLD     = "ALL_OLD"
    val UPDATED_OLD = "UPDATED_OLD"
    val ALL_NEW     = "ALL_NEW"
    val UPDATED_NEW = "UPDATED_NEW"

    val values = IndexedSeq(NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW)
  }

  object ReturnValuesOnConditionCheckFailureEnum {
    val ALL_OLD = "ALL_OLD"
    val NONE    = "NONE"

    val values = IndexedSeq(ALL_OLD, NONE)
  }

  /**
    * The description of the server-side encryption status on the specified table.
    */
  @js.native
  trait SSEDescription extends js.Object {
    var KMSMasterKeyArn: js.UndefOr[KMSMasterKeyArn]
    var SSEType: js.UndefOr[SSEType]
    var Status: js.UndefOr[SSEStatus]
  }

  object SSEDescription {
    def apply(KMSMasterKeyArn: js.UndefOr[KMSMasterKeyArn] = js.undefined,
              SSEType: js.UndefOr[SSEType] = js.undefined,
              Status: js.UndefOr[SSEStatus] = js.undefined): SSEDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KMSMasterKeyArn" -> KMSMasterKeyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SSEType" -> SSEType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSEDescription]
    }
  }

  /**
    * Represents the settings used to enable server-side encryption.
    */
  @js.native
  trait SSESpecification extends js.Object {
    var Enabled: js.UndefOr[SSEEnabled]
    var KMSMasterKeyId: js.UndefOr[KMSMasterKeyId]
    var SSEType: js.UndefOr[SSEType]
  }

  object SSESpecification {
    def apply(Enabled: js.UndefOr[SSEEnabled] = js.undefined,
              KMSMasterKeyId: js.UndefOr[KMSMasterKeyId] = js.undefined,
              SSEType: js.UndefOr[SSEType] = js.undefined): SSESpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KMSMasterKeyId" -> KMSMasterKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SSEType" -> SSEType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSESpecification]
    }
  }

  object SSEStatusEnum {
    val ENABLING  = "ENABLING"
    val ENABLED   = "ENABLED"
    val DISABLING = "DISABLING"
    val DISABLED  = "DISABLED"
    val UPDATING  = "UPDATING"

    val values = IndexedSeq(ENABLING, ENABLED, DISABLING, DISABLED, UPDATING)
  }

  object SSETypeEnum {
    val AES256 = "AES256"
    val KMS    = "KMS"

    val values = IndexedSeq(AES256, KMS)
  }

  object ScalarAttributeTypeEnum {
    val S = "S"
    val N = "N"
    val B = "B"

    val values = IndexedSeq(S, N, B)
  }

  /**
    * Represents the input of a <code>Scan</code> operation.
    */
  @js.native
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

  object ScanInput {
    def apply(TableName: TableName,
              AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined,
              ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined,
              ConsistentRead: js.UndefOr[ConsistentRead] = js.undefined,
              ExclusiveStartKey: js.UndefOr[Key] = js.undefined,
              ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
              ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
              FilterExpression: js.UndefOr[ConditionExpression] = js.undefined,
              IndexName: js.UndefOr[IndexName] = js.undefined,
              Limit: js.UndefOr[PositiveIntegerObject] = js.undefined,
              ProjectionExpression: js.UndefOr[ProjectionExpression] = js.undefined,
              ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
              ScanFilter: js.UndefOr[FilterConditionMap] = js.undefined,
              Segment: js.UndefOr[ScanSegment] = js.undefined,
              Select: js.UndefOr[Select] = js.undefined,
              TotalSegments: js.UndefOr[ScanTotalSegments] = js.undefined): ScanInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableName" -> TableName.asInstanceOf[js.Any],
        "AttributesToGet" -> AttributesToGet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConditionalOperator" -> ConditionalOperator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConsistentRead" -> ConsistentRead.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExclusiveStartKey" -> ExclusiveStartKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilterExpression" -> FilterExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IndexName" -> IndexName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProjectionExpression" -> ProjectionExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScanFilter" -> ScanFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Segment" -> Segment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Select" -> Select.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalSegments" -> TotalSegments.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScanInput]
    }
  }

  /**
    * Represents the output of a <code>Scan</code> operation.
    */
  @js.native
  trait ScanOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var Count: js.UndefOr[Int]
    var Items: js.UndefOr[ItemList]
    var LastEvaluatedKey: js.UndefOr[Key]
    var ScannedCount: js.UndefOr[Int]
  }

  object ScanOutput {
    def apply(ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
              Count: js.UndefOr[Int] = js.undefined,
              Items: js.UndefOr[ItemList] = js.undefined,
              LastEvaluatedKey: js.UndefOr[Key] = js.undefined,
              ScannedCount: js.UndefOr[Int] = js.undefined): ScanOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumedCapacity" -> ConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Count" -> Count.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Items" -> Items.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastEvaluatedKey" -> LastEvaluatedKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScannedCount" -> ScannedCount.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScanOutput]
    }
  }

  object SelectEnum {
    val ALL_ATTRIBUTES           = "ALL_ATTRIBUTES"
    val ALL_PROJECTED_ATTRIBUTES = "ALL_PROJECTED_ATTRIBUTES"
    val SPECIFIC_ATTRIBUTES      = "SPECIFIC_ATTRIBUTES"
    val COUNT                    = "COUNT"

    val values = IndexedSeq(ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT)
  }

  /**
    * Contains the details of the table when the backup was created.
    */
  @js.native
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

  object SourceTableDetails {
    def apply(KeySchema: KeySchema,
              ProvisionedThroughput: ProvisionedThroughput,
              TableCreationDateTime: TableCreationDateTime,
              TableId: TableId,
              TableName: TableName,
              BillingMode: js.UndefOr[BillingMode] = js.undefined,
              ItemCount: js.UndefOr[ItemCount] = js.undefined,
              TableArn: js.UndefOr[TableArn] = js.undefined,
              TableSizeBytes: js.UndefOr[Double] = js.undefined): SourceTableDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeySchema"             -> KeySchema.asInstanceOf[js.Any],
        "ProvisionedThroughput" -> ProvisionedThroughput.asInstanceOf[js.Any],
        "TableCreationDateTime" -> TableCreationDateTime.asInstanceOf[js.Any],
        "TableId"               -> TableId.asInstanceOf[js.Any],
        "TableName"             -> TableName.asInstanceOf[js.Any],
        "BillingMode" -> BillingMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ItemCount" -> ItemCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableArn" -> TableArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableSizeBytes" -> TableSizeBytes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceTableDetails]
    }
  }

  /**
    * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.
    */
  @js.native
  trait SourceTableFeatureDetails extends js.Object {
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexes]
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexes]
    var SSEDescription: js.UndefOr[SSEDescription]
    var StreamDescription: js.UndefOr[StreamSpecification]
    var TimeToLiveDescription: js.UndefOr[TimeToLiveDescription]
  }

  object SourceTableFeatureDetails {
    def apply(GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexes] = js.undefined,
              LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexes] = js.undefined,
              SSEDescription: js.UndefOr[SSEDescription] = js.undefined,
              StreamDescription: js.UndefOr[StreamSpecification] = js.undefined,
              TimeToLiveDescription: js.UndefOr[TimeToLiveDescription] = js.undefined): SourceTableFeatureDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalSecondaryIndexes" -> GlobalSecondaryIndexes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocalSecondaryIndexes" -> LocalSecondaryIndexes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SSEDescription" -> SSEDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamDescription" -> StreamDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeToLiveDescription" -> TimeToLiveDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceTableFeatureDetails]
    }
  }

  /**
    * Represents the DynamoDB Streams configuration for a table in DynamoDB.
    */
  @js.native
  trait StreamSpecification extends js.Object {
    var StreamEnabled: js.UndefOr[StreamEnabled]
    var StreamViewType: js.UndefOr[StreamViewType]
  }

  object StreamSpecification {
    def apply(StreamEnabled: js.UndefOr[StreamEnabled] = js.undefined,
              StreamViewType: js.UndefOr[StreamViewType] = js.undefined): StreamSpecification = {
      val _fields = IndexedSeq[(String, js.Any)]("StreamEnabled" -> StreamEnabled.map { x =>
        x.asInstanceOf[js.Any]
      }, "StreamViewType" -> StreamViewType.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamSpecification]
    }
  }

  object StreamViewTypeEnum {
    val NEW_IMAGE          = "NEW_IMAGE"
    val OLD_IMAGE          = "OLD_IMAGE"
    val NEW_AND_OLD_IMAGES = "NEW_AND_OLD_IMAGES"
    val KEYS_ONLY          = "KEYS_ONLY"

    val values = IndexedSeq(NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY)
  }

  /**
    * Represents the properties of a table.
    */
  @js.native
  trait TableDescription extends js.Object {
    var AttributeDefinitions: js.UndefOr[AttributeDefinitions]
    var BillingModeSummary: js.UndefOr[BillingModeSummary]
    var CreationDateTime: js.UndefOr[Date]
    var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexDescriptionList]
    var ItemCount: js.UndefOr[Double]
    var KeySchema: js.UndefOr[KeySchema]
    var LatestStreamArn: js.UndefOr[StreamArn]
    var LatestStreamLabel: js.UndefOr[String]
    var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexDescriptionList]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription]
    var RestoreSummary: js.UndefOr[RestoreSummary]
    var SSEDescription: js.UndefOr[SSEDescription]
    var StreamSpecification: js.UndefOr[StreamSpecification]
    var TableArn: js.UndefOr[String]
    var TableId: js.UndefOr[TableId]
    var TableName: js.UndefOr[TableName]
    var TableSizeBytes: js.UndefOr[Double]
    var TableStatus: js.UndefOr[TableStatus]
  }

  object TableDescription {
    def apply(AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined,
              BillingModeSummary: js.UndefOr[BillingModeSummary] = js.undefined,
              CreationDateTime: js.UndefOr[Date] = js.undefined,
              GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexDescriptionList] = js.undefined,
              ItemCount: js.UndefOr[Double] = js.undefined,
              KeySchema: js.UndefOr[KeySchema] = js.undefined,
              LatestStreamArn: js.UndefOr[StreamArn] = js.undefined,
              LatestStreamLabel: js.UndefOr[String] = js.undefined,
              LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexDescriptionList] = js.undefined,
              ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined,
              RestoreSummary: js.UndefOr[RestoreSummary] = js.undefined,
              SSEDescription: js.UndefOr[SSEDescription] = js.undefined,
              StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined,
              TableArn: js.UndefOr[String] = js.undefined,
              TableId: js.UndefOr[TableId] = js.undefined,
              TableName: js.UndefOr[TableName] = js.undefined,
              TableSizeBytes: js.UndefOr[Double] = js.undefined,
              TableStatus: js.UndefOr[TableStatus] = js.undefined): TableDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeDefinitions" -> AttributeDefinitions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BillingModeSummary" -> BillingModeSummary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDateTime" -> CreationDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalSecondaryIndexes" -> GlobalSecondaryIndexes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ItemCount" -> ItemCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeySchema" -> KeySchema.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestStreamArn" -> LatestStreamArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestStreamLabel" -> LatestStreamLabel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocalSecondaryIndexes" -> LocalSecondaryIndexes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestoreSummary" -> RestoreSummary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SSEDescription" -> SSEDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamSpecification" -> StreamSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableArn" -> TableArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableId" -> TableId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableName" -> TableName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableSizeBytes" -> TableSizeBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableStatus" -> TableStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TableDescription]
    }
  }

  object TableStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val ACTIVE   = "ACTIVE"

    val values = IndexedSeq(CREATING, UPDATING, DELETING, ACTIVE)
  }

  /**
    * Describes a tag. A tag is a key-value pair. You can add up to 50 tags to a single DynamoDB table.
    *  AWS-assigned tag names and values are automatically assigned the aws: prefix, which the user cannot assign. AWS-assigned tag names do not count towards the tag limit of 50. User-assigned tag names have the prefix user: in the Cost Allocation Report. You cannot backdate the application of a tag.
    *  For an overview on tagging DynamoDB resources, see [[http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html|Tagging for DynamoDB]] in the <i>Amazon DynamoDB Developer Guide</i>.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKeyString
    var Value: TagValueString
  }

  object Tag {
    def apply(Key: TagKeyString, Value: TagValueString): Tag = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Key" -> Key.asInstanceOf[js.Any], "Value" -> Value.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceArn: ResourceArnString
    var Tags: TagList
  }

  object TagResourceInput {
    def apply(ResourceArn: ResourceArnString, Tags: TagList): TagResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceInput]
    }
  }

  /**
    * The description of the Time to Live (TTL) status on the specified table.
    */
  @js.native
  trait TimeToLiveDescription extends js.Object {
    var AttributeName: js.UndefOr[TimeToLiveAttributeName]
    var TimeToLiveStatus: js.UndefOr[TimeToLiveStatus]
  }

  object TimeToLiveDescription {
    def apply(AttributeName: js.UndefOr[TimeToLiveAttributeName] = js.undefined,
              TimeToLiveStatus: js.UndefOr[TimeToLiveStatus] = js.undefined): TimeToLiveDescription = {
      val _fields = IndexedSeq[(String, js.Any)]("AttributeName" -> AttributeName.map { x =>
        x.asInstanceOf[js.Any]
      }, "TimeToLiveStatus" -> TimeToLiveStatus.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeToLiveDescription]
    }
  }

  /**
    * Represents the settings used to enable or disable Time to Live for the specified table.
    */
  @js.native
  trait TimeToLiveSpecification extends js.Object {
    var AttributeName: TimeToLiveAttributeName
    var Enabled: TimeToLiveEnabled
  }

  object TimeToLiveSpecification {
    def apply(AttributeName: TimeToLiveAttributeName, Enabled: TimeToLiveEnabled): TimeToLiveSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "Enabled"       -> Enabled.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeToLiveSpecification]
    }
  }

  object TimeToLiveStatusEnum {
    val ENABLING  = "ENABLING"
    val DISABLING = "DISABLING"
    val ENABLED   = "ENABLED"
    val DISABLED  = "DISABLED"

    val values = IndexedSeq(ENABLING, DISABLING, ENABLED, DISABLED)
  }

  /**
    * Specifies an item to be retrieved as part of the transaction.
    */
  @js.native
  trait TransactGetItem extends js.Object {
    var Get: Get
  }

  object TransactGetItem {
    def apply(Get: Get): TransactGetItem = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Get" -> Get.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransactGetItem]
    }
  }

  @js.native
  trait TransactGetItemsInput extends js.Object {
    var TransactItems: TransactGetItemList
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
  }

  object TransactGetItemsInput {
    def apply(TransactItems: TransactGetItemList,
              ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined): TransactGetItemsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransactItems" -> TransactItems.asInstanceOf[js.Any],
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransactGetItemsInput]
    }
  }

  @js.native
  trait TransactGetItemsOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple]
    var Responses: js.UndefOr[ItemResponseList]
  }

  object TransactGetItemsOutput {
    def apply(ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined,
              Responses: js.UndefOr[ItemResponseList] = js.undefined): TransactGetItemsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("ConsumedCapacity" -> ConsumedCapacity.map { x =>
        x.asInstanceOf[js.Any]
      }, "Responses" -> Responses.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransactGetItemsOutput]
    }
  }

  /**
    * A list of requests that can perform update, put, delete, or check operations on multiple items in one or more tables atomically.
    */
  @js.native
  trait TransactWriteItem extends js.Object {
    var ConditionCheck: js.UndefOr[ConditionCheck]
    var Delete: js.UndefOr[Delete]
    var Put: js.UndefOr[Put]
    var Update: js.UndefOr[Update]
  }

  object TransactWriteItem {
    def apply(ConditionCheck: js.UndefOr[ConditionCheck] = js.undefined,
              Delete: js.UndefOr[Delete] = js.undefined,
              Put: js.UndefOr[Put] = js.undefined,
              Update: js.UndefOr[Update] = js.undefined): TransactWriteItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConditionCheck" -> ConditionCheck.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Delete" -> Delete.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Put" -> Put.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Update" -> Update.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransactWriteItem]
    }
  }

  @js.native
  trait TransactWriteItemsInput extends js.Object {
    var TransactItems: TransactWriteItemList
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity]
    var ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics]
  }

  object TransactWriteItemsInput {
    def apply(
        TransactItems: TransactWriteItemList,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
        ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined
    ): TransactWriteItemsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TransactItems" -> TransactItems.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransactWriteItemsInput]
    }
  }

  @js.native
  trait TransactWriteItemsOutput extends js.Object {
    var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable]
  }

  object TransactWriteItemsOutput {
    def apply(
        ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.undefined,
        ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.undefined
    ): TransactWriteItemsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("ConsumedCapacity" -> ConsumedCapacity.map { x =>
        x.asInstanceOf[js.Any]
      }, "ItemCollectionMetrics" -> ItemCollectionMetrics.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TransactWriteItemsOutput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceArn: ResourceArnString
    var TagKeys: TagKeyList
  }

  object UntagResourceInput {
    def apply(ResourceArn: ResourceArnString, TagKeys: TagKeyList): UntagResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceInput]
    }
  }

  /**
    * Represents a request to perform an <code>UpdateItem</code> operation.
    */
  @js.native
  trait Update extends js.Object {
    var Key: Key
    var TableName: TableName
    var UpdateExpression: UpdateExpression
    var ConditionExpression: js.UndefOr[ConditionExpression]
    var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap]
    var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap]
    var ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure]
  }

  object Update {
    def apply(
        Key: Key,
        TableName: TableName,
        UpdateExpression: UpdateExpression,
        ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined,
        ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
        ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
        ReturnValuesOnConditionCheckFailure: js.UndefOr[ReturnValuesOnConditionCheckFailure] = js.undefined
    ): Update = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key"              -> Key.asInstanceOf[js.Any],
        "TableName"        -> TableName.asInstanceOf[js.Any],
        "UpdateExpression" -> UpdateExpression.asInstanceOf[js.Any],
        "ConditionExpression" -> ConditionExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnValuesOnConditionCheckFailure" -> ReturnValuesOnConditionCheckFailure.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Update]
    }
  }

  @js.native
  trait UpdateContinuousBackupsInput extends js.Object {
    var PointInTimeRecoverySpecification: PointInTimeRecoverySpecification
    var TableName: TableName
  }

  object UpdateContinuousBackupsInput {
    def apply(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification,
              TableName: TableName): UpdateContinuousBackupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PointInTimeRecoverySpecification" -> PointInTimeRecoverySpecification.asInstanceOf[js.Any],
        "TableName"                        -> TableName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContinuousBackupsInput]
    }
  }

  @js.native
  trait UpdateContinuousBackupsOutput extends js.Object {
    var ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription]
  }

  object UpdateContinuousBackupsOutput {
    def apply(
        ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription] = js.undefined
    ): UpdateContinuousBackupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("ContinuousBackupsDescription" -> ContinuousBackupsDescription.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContinuousBackupsOutput]
    }
  }

  /**
    * Represents the new provisioned throughput settings to be applied to a global secondary index.
    */
  @js.native
  trait UpdateGlobalSecondaryIndexAction extends js.Object {
    var IndexName: IndexName
    var ProvisionedThroughput: ProvisionedThroughput
  }

  object UpdateGlobalSecondaryIndexAction {
    def apply(IndexName: IndexName, ProvisionedThroughput: ProvisionedThroughput): UpdateGlobalSecondaryIndexAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexName"             -> IndexName.asInstanceOf[js.Any],
        "ProvisionedThroughput" -> ProvisionedThroughput.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGlobalSecondaryIndexAction]
    }
  }

  @js.native
  trait UpdateGlobalTableInput extends js.Object {
    var GlobalTableName: TableName
    var ReplicaUpdates: ReplicaUpdateList
  }

  object UpdateGlobalTableInput {
    def apply(GlobalTableName: TableName, ReplicaUpdates: ReplicaUpdateList): UpdateGlobalTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableName" -> GlobalTableName.asInstanceOf[js.Any],
        "ReplicaUpdates"  -> ReplicaUpdates.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGlobalTableInput]
    }
  }

  @js.native
  trait UpdateGlobalTableOutput extends js.Object {
    var GlobalTableDescription: js.UndefOr[GlobalTableDescription]
  }

  object UpdateGlobalTableOutput {
    def apply(GlobalTableDescription: js.UndefOr[GlobalTableDescription] = js.undefined): UpdateGlobalTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalTableDescription" -> GlobalTableDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGlobalTableOutput]
    }
  }

  @js.native
  trait UpdateGlobalTableSettingsInput extends js.Object {
    var GlobalTableName: TableName
    var GlobalTableBillingMode: js.UndefOr[BillingMode]
    var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList]
    var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate]
    var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject]
    var ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList]
  }

  object UpdateGlobalTableSettingsInput {
    def apply(
        GlobalTableName: TableName,
        GlobalTableBillingMode: js.UndefOr[BillingMode] = js.undefined,
        GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList] =
          js.undefined,
        GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] =
          js.undefined,
        GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
        ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList] = js.undefined
    ): UpdateGlobalTableSettingsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GlobalTableName" -> GlobalTableName.asInstanceOf[js.Any],
        "GlobalTableBillingMode" -> GlobalTableBillingMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalTableGlobalSecondaryIndexSettingsUpdate" -> GlobalTableGlobalSecondaryIndexSettingsUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate" -> GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate
          .map { x =>
            x.asInstanceOf[js.Any]
          },
        "GlobalTableProvisionedWriteCapacityUnits" -> GlobalTableProvisionedWriteCapacityUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReplicaSettingsUpdate" -> ReplicaSettingsUpdate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.undefined
    ): UpdateGlobalTableSettingsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("GlobalTableName" -> GlobalTableName.map { x =>
        x.asInstanceOf[js.Any]
      }, "ReplicaSettings" -> ReplicaSettings.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGlobalTableSettingsOutput]
    }
  }

  /**
    * Represents the input of an <code>UpdateItem</code> operation.
    */
  @js.native
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

  object UpdateItemInput {
    def apply(Key: Key,
              TableName: TableName,
              AttributeUpdates: js.UndefOr[AttributeUpdates] = js.undefined,
              ConditionExpression: js.UndefOr[ConditionExpression] = js.undefined,
              ConditionalOperator: js.UndefOr[ConditionalOperator] = js.undefined,
              Expected: js.UndefOr[ExpectedAttributeMap] = js.undefined,
              ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined,
              ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined,
              ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined,
              ReturnItemCollectionMetrics: js.UndefOr[ReturnItemCollectionMetrics] = js.undefined,
              ReturnValues: js.UndefOr[ReturnValue] = js.undefined,
              UpdateExpression: js.UndefOr[UpdateExpression] = js.undefined): UpdateItemInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key"       -> Key.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "AttributeUpdates" -> AttributeUpdates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConditionExpression" -> ConditionExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConditionalOperator" -> ConditionalOperator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Expected" -> Expected.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeNames" -> ExpressionAttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpressionAttributeValues" -> ExpressionAttributeValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnConsumedCapacity" -> ReturnConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnItemCollectionMetrics" -> ReturnItemCollectionMetrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnValues" -> ReturnValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateExpression" -> UpdateExpression.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateItemInput]
    }
  }

  /**
    * Represents the output of an <code>UpdateItem</code> operation.
    */
  @js.native
  trait UpdateItemOutput extends js.Object {
    var Attributes: js.UndefOr[AttributeMap]
    var ConsumedCapacity: js.UndefOr[ConsumedCapacity]
    var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics]
  }

  object UpdateItemOutput {
    def apply(Attributes: js.UndefOr[AttributeMap] = js.undefined,
              ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined,
              ItemCollectionMetrics: js.UndefOr[ItemCollectionMetrics] = js.undefined): UpdateItemOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConsumedCapacity" -> ConsumedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ItemCollectionMetrics" -> ItemCollectionMetrics.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateItemOutput]
    }
  }

  /**
    * Represents the input of an <code>UpdateTable</code> operation.
    */
  @js.native
  trait UpdateTableInput extends js.Object {
    var TableName: TableName
    var AttributeDefinitions: js.UndefOr[AttributeDefinitions]
    var BillingMode: js.UndefOr[BillingMode]
    var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexUpdateList]
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughput]
    var SSESpecification: js.UndefOr[SSESpecification]
    var StreamSpecification: js.UndefOr[StreamSpecification]
  }

  object UpdateTableInput {
    def apply(TableName: TableName,
              AttributeDefinitions: js.UndefOr[AttributeDefinitions] = js.undefined,
              BillingMode: js.UndefOr[BillingMode] = js.undefined,
              GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexUpdateList] = js.undefined,
              ProvisionedThroughput: js.UndefOr[ProvisionedThroughput] = js.undefined,
              SSESpecification: js.UndefOr[SSESpecification] = js.undefined,
              StreamSpecification: js.UndefOr[StreamSpecification] = js.undefined): UpdateTableInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableName" -> TableName.asInstanceOf[js.Any],
        "AttributeDefinitions" -> AttributeDefinitions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BillingMode" -> BillingMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalSecondaryIndexUpdates" -> GlobalSecondaryIndexUpdates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProvisionedThroughput" -> ProvisionedThroughput.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SSESpecification" -> SSESpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamSpecification" -> StreamSpecification.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTableInput]
    }
  }

  /**
    * Represents the output of an <code>UpdateTable</code> operation.
    */
  @js.native
  trait UpdateTableOutput extends js.Object {
    var TableDescription: js.UndefOr[TableDescription]
  }

  object UpdateTableOutput {
    def apply(TableDescription: js.UndefOr[TableDescription] = js.undefined): UpdateTableOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("TableDescription" -> TableDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTableOutput]
    }
  }

  /**
    * Represents the input of an <code>UpdateTimeToLive</code> operation.
    */
  @js.native
  trait UpdateTimeToLiveInput extends js.Object {
    var TableName: TableName
    var TimeToLiveSpecification: TimeToLiveSpecification
  }

  object UpdateTimeToLiveInput {
    def apply(TableName: TableName, TimeToLiveSpecification: TimeToLiveSpecification): UpdateTimeToLiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TableName"               -> TableName.asInstanceOf[js.Any],
        "TimeToLiveSpecification" -> TimeToLiveSpecification.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTimeToLiveInput]
    }
  }

  @js.native
  trait UpdateTimeToLiveOutput extends js.Object {
    var TimeToLiveSpecification: js.UndefOr[TimeToLiveSpecification]
  }

  object UpdateTimeToLiveOutput {
    def apply(TimeToLiveSpecification: js.UndefOr[TimeToLiveSpecification] = js.undefined): UpdateTimeToLiveOutput = {
      val _fields = IndexedSeq[(String, js.Any)]("TimeToLiveSpecification" -> TimeToLiveSpecification.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTimeToLiveOutput]
    }
  }

  /**
    * Represents an operation to perform - either <code>DeleteItem</code> or <code>PutItem</code>. You can only request one of these operations, not both, in a single <code>WriteRequest</code>. If you do need to perform both of these operations, you will need to provide two separate <code>WriteRequest</code> objects.
    */
  @js.native
  trait WriteRequest extends js.Object {
    var DeleteRequest: js.UndefOr[DeleteRequest]
    var PutRequest: js.UndefOr[PutRequest]
  }

  object WriteRequest {
    def apply(DeleteRequest: js.UndefOr[DeleteRequest] = js.undefined,
              PutRequest: js.UndefOr[PutRequest] = js.undefined): WriteRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("DeleteRequest" -> DeleteRequest.map { x =>
        x.asInstanceOf[js.Any]
      }, "PutRequest" -> PutRequest.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WriteRequest]
    }
  }
}
