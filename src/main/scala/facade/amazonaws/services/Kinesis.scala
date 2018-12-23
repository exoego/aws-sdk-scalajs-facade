package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object kinesis {
  type BooleanObject = Boolean
  type ConsumerARN = String
  type ConsumerCountObject = Int
  type ConsumerList = js.Array[Consumer]
  type ConsumerName = String
  type ConsumerStatus = String
  type Data = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DescribeStreamInputLimit = Int
  type EncryptionType = String
  type EnhancedMonitoringList = js.Array[EnhancedMetrics]
  type ErrorCode = String
  type ErrorMessage = String
  type GetRecordsInputLimit = Int
  type HashKey = String
  type KeyId = String
  type ListShardsInputLimit = Int
  type ListStreamConsumersInputLimit = Int
  type ListStreamsInputLimit = Int
  type ListTagsForStreamInputLimit = Int
  type MetricsName = String
  type MetricsNameList = js.Array[MetricsName]
  type MillisBehindLatest = Double
  type NextToken = String
  type PartitionKey = String
  type PositiveIntegerObject = Int
  type PutRecordsRequestEntryList = js.Array[PutRecordsRequestEntry]
  type PutRecordsResultEntryList = js.Array[PutRecordsResultEntry]
  type RecordList = js.Array[Record]
  type RetentionPeriodHours = Int
  type ScalingType = String
  type SequenceNumber = String
  type ShardCountObject = Int
  type ShardId = String
  type ShardIterator = String
  type ShardIteratorType = String
  type ShardList = js.Array[Shard]
  type StreamARN = String
  type StreamName = String
  type StreamNameList = js.Array[StreamName]
  type StreamStatus = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
}

package kinesis {
  @js.native
  @JSImport("aws-sdk", "Kinesis")
  class Kinesis(config: AWSConfig) extends js.Object {
    def addTagsToStream(params: AddTagsToStreamInput): Request[js.Object] = js.native
    def createStream(params: CreateStreamInput): Request[js.Object] = js.native
    def decreaseStreamRetentionPeriod(params: DecreaseStreamRetentionPeriodInput): Request[js.Object] = js.native
    def deleteStream(params: DeleteStreamInput): Request[js.Object] = js.native
    def deregisterStreamConsumer(params: DeregisterStreamConsumerInput): Request[js.Object] = js.native
    def describeLimits(params: DescribeLimitsInput): Request[DescribeLimitsOutput] = js.native
    def describeStream(params: DescribeStreamInput): Request[DescribeStreamOutput] = js.native
    def describeStreamConsumer(params: DescribeStreamConsumerInput): Request[DescribeStreamConsumerOutput] = js.native
    def describeStreamSummary(params: DescribeStreamSummaryInput): Request[DescribeStreamSummaryOutput] = js.native
    def disableEnhancedMonitoring(params: DisableEnhancedMonitoringInput): Request[EnhancedMonitoringOutput] = js.native
    def enableEnhancedMonitoring(params: EnableEnhancedMonitoringInput): Request[EnhancedMonitoringOutput] = js.native
    def getRecords(params: GetRecordsInput): Request[GetRecordsOutput] = js.native
    def getShardIterator(params: GetShardIteratorInput): Request[GetShardIteratorOutput] = js.native
    def increaseStreamRetentionPeriod(params: IncreaseStreamRetentionPeriodInput): Request[js.Object] = js.native
    def listShards(params: ListShardsInput): Request[ListShardsOutput] = js.native
    def listStreamConsumers(params: ListStreamConsumersInput): Request[ListStreamConsumersOutput] = js.native
    def listStreams(params: ListStreamsInput): Request[ListStreamsOutput] = js.native
    def listTagsForStream(params: ListTagsForStreamInput): Request[ListTagsForStreamOutput] = js.native
    def mergeShards(params: MergeShardsInput): Request[js.Object] = js.native
    def putRecord(params: PutRecordInput): Request[PutRecordOutput] = js.native
    def putRecords(params: PutRecordsInput): Request[PutRecordsOutput] = js.native
    def registerStreamConsumer(params: RegisterStreamConsumerInput): Request[RegisterStreamConsumerOutput] = js.native
    def removeTagsFromStream(params: RemoveTagsFromStreamInput): Request[js.Object] = js.native
    def splitShard(params: SplitShardInput): Request[js.Object] = js.native
    def startStreamEncryption(params: StartStreamEncryptionInput): Request[js.Object] = js.native
    def stopStreamEncryption(params: StopStreamEncryptionInput): Request[js.Object] = js.native
    def updateShardCount(params: UpdateShardCountInput): Request[UpdateShardCountOutput] = js.native
  }

  /**
   * Represents the input for <code>AddTagsToStream</code>.
   */
  @js.native
  trait AddTagsToStreamInput extends js.Object {
    var StreamName: StreamName
    var Tags: TagMap
  }

  object AddTagsToStreamInput {
    def apply(
      StreamName: StreamName,
      Tags: TagMap): AddTagsToStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToStreamInput]
    }
  }

  /**
   * An object that represents the details of the consumer you registered.
   */
  @js.native
  trait Consumer extends js.Object {
    var ConsumerARN: ConsumerARN
    var ConsumerCreationTimestamp: Timestamp
    var ConsumerName: ConsumerName
    var ConsumerStatus: ConsumerStatus
  }

  object Consumer {
    def apply(
      ConsumerARN: ConsumerARN,
      ConsumerCreationTimestamp: Timestamp,
      ConsumerName: ConsumerName,
      ConsumerStatus: ConsumerStatus): Consumer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumerARN" -> ConsumerARN.asInstanceOf[js.Any],
        "ConsumerCreationTimestamp" -> ConsumerCreationTimestamp.asInstanceOf[js.Any],
        "ConsumerName" -> ConsumerName.asInstanceOf[js.Any],
        "ConsumerStatus" -> ConsumerStatus.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Consumer]
    }
  }

  /**
   * An object that represents the details of a registered consumer.
   */
  @js.native
  trait ConsumerDescription extends js.Object {
    var ConsumerARN: ConsumerARN
    var ConsumerCreationTimestamp: Timestamp
    var ConsumerName: ConsumerName
    var ConsumerStatus: ConsumerStatus
    var StreamARN: StreamARN
  }

  object ConsumerDescription {
    def apply(
      ConsumerARN: ConsumerARN,
      ConsumerCreationTimestamp: Timestamp,
      ConsumerName: ConsumerName,
      ConsumerStatus: ConsumerStatus,
      StreamARN: StreamARN): ConsumerDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumerARN" -> ConsumerARN.asInstanceOf[js.Any],
        "ConsumerCreationTimestamp" -> ConsumerCreationTimestamp.asInstanceOf[js.Any],
        "ConsumerName" -> ConsumerName.asInstanceOf[js.Any],
        "ConsumerStatus" -> ConsumerStatus.asInstanceOf[js.Any],
        "StreamARN" -> StreamARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConsumerDescription]
    }
  }

  object ConsumerStatusEnum {
    val CREATING = "CREATING"
    val DELETING = "DELETING"
    val ACTIVE = "ACTIVE"

    val values = IndexedSeq(CREATING, DELETING, ACTIVE)
  }

  /**
   * Represents the input for <code>CreateStream</code>.
   */
  @js.native
  trait CreateStreamInput extends js.Object {
    var ShardCount: PositiveIntegerObject
    var StreamName: StreamName
  }

  object CreateStreamInput {
    def apply(
      ShardCount: PositiveIntegerObject,
      StreamName: StreamName): CreateStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardCount" -> ShardCount.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamInput]
    }
  }

  /**
   * Represents the input for '''DecreaseStreamRetentionPeriod'''.
   */
  @js.native
  trait DecreaseStreamRetentionPeriodInput extends js.Object {
    var RetentionPeriodHours: RetentionPeriodHours
    var StreamName: StreamName
  }

  object DecreaseStreamRetentionPeriodInput {
    def apply(
      RetentionPeriodHours: RetentionPeriodHours,
      StreamName: StreamName): DecreaseStreamRetentionPeriodInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RetentionPeriodHours" -> RetentionPeriodHours.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecreaseStreamRetentionPeriodInput]
    }
  }

  /**
   * Represents the input for '''DeleteStream'''.
   */
  @js.native
  trait DeleteStreamInput extends js.Object {
    var StreamName: StreamName
    var EnforceConsumerDeletion: js.UndefOr[BooleanObject]
  }

  object DeleteStreamInput {
    def apply(
      StreamName: StreamName,
      EnforceConsumerDeletion: js.UndefOr[BooleanObject] = js.undefined): DeleteStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "EnforceConsumerDeletion" -> EnforceConsumerDeletion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamInput]
    }
  }

  @js.native
  trait DeregisterStreamConsumerInput extends js.Object {
    var ConsumerARN: js.UndefOr[ConsumerARN]
    var ConsumerName: js.UndefOr[ConsumerName]
    var StreamARN: js.UndefOr[StreamARN]
  }

  object DeregisterStreamConsumerInput {
    def apply(
      ConsumerARN: js.UndefOr[ConsumerARN] = js.undefined,
      ConsumerName: js.UndefOr[ConsumerName] = js.undefined,
      StreamARN: js.UndefOr[StreamARN] = js.undefined): DeregisterStreamConsumerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumerARN" -> ConsumerARN.map { x => x.asInstanceOf[js.Any] },
        "ConsumerName" -> ConsumerName.map { x => x.asInstanceOf[js.Any] },
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterStreamConsumerInput]
    }
  }

  @js.native
  trait DescribeLimitsInput extends js.Object {

  }

  object DescribeLimitsInput {
    def apply(): DescribeLimitsInput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLimitsInput]
    }
  }

  @js.native
  trait DescribeLimitsOutput extends js.Object {
    var OpenShardCount: ShardCountObject
    var ShardLimit: ShardCountObject
  }

  object DescribeLimitsOutput {
    def apply(
      OpenShardCount: ShardCountObject,
      ShardLimit: ShardCountObject): DescribeLimitsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OpenShardCount" -> OpenShardCount.asInstanceOf[js.Any],
        "ShardLimit" -> ShardLimit.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLimitsOutput]
    }
  }

  @js.native
  trait DescribeStreamConsumerInput extends js.Object {
    var ConsumerARN: js.UndefOr[ConsumerARN]
    var ConsumerName: js.UndefOr[ConsumerName]
    var StreamARN: js.UndefOr[StreamARN]
  }

  object DescribeStreamConsumerInput {
    def apply(
      ConsumerARN: js.UndefOr[ConsumerARN] = js.undefined,
      ConsumerName: js.UndefOr[ConsumerName] = js.undefined,
      StreamARN: js.UndefOr[StreamARN] = js.undefined): DescribeStreamConsumerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumerARN" -> ConsumerARN.map { x => x.asInstanceOf[js.Any] },
        "ConsumerName" -> ConsumerName.map { x => x.asInstanceOf[js.Any] },
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamConsumerInput]
    }
  }

  @js.native
  trait DescribeStreamConsumerOutput extends js.Object {
    var ConsumerDescription: ConsumerDescription
  }

  object DescribeStreamConsumerOutput {
    def apply(
      ConsumerDescription: ConsumerDescription): DescribeStreamConsumerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumerDescription" -> ConsumerDescription.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamConsumerOutput]
    }
  }

  /**
   * Represents the input for <code>DescribeStream</code>.
   */
  @js.native
  trait DescribeStreamInput extends js.Object {
    var StreamName: StreamName
    var ExclusiveStartShardId: js.UndefOr[ShardId]
    var Limit: js.UndefOr[DescribeStreamInputLimit]
  }

  object DescribeStreamInput {
    def apply(
      StreamName: StreamName,
      ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined,
      Limit: js.UndefOr[DescribeStreamInputLimit] = js.undefined): DescribeStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "ExclusiveStartShardId" -> ExclusiveStartShardId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamInput]
    }
  }

  /**
   * Represents the output for <code>DescribeStream</code>.
   */
  @js.native
  trait DescribeStreamOutput extends js.Object {
    var StreamDescription: StreamDescription
  }

  object DescribeStreamOutput {
    def apply(
      StreamDescription: StreamDescription): DescribeStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamDescription" -> StreamDescription.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamOutput]
    }
  }

  @js.native
  trait DescribeStreamSummaryInput extends js.Object {
    var StreamName: StreamName
  }

  object DescribeStreamSummaryInput {
    def apply(
      StreamName: StreamName): DescribeStreamSummaryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamSummaryInput]
    }
  }

  @js.native
  trait DescribeStreamSummaryOutput extends js.Object {
    var StreamDescriptionSummary: StreamDescriptionSummary
  }

  object DescribeStreamSummaryOutput {
    def apply(
      StreamDescriptionSummary: StreamDescriptionSummary): DescribeStreamSummaryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamDescriptionSummary" -> StreamDescriptionSummary.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamSummaryOutput]
    }
  }

  /**
   * Represents the input for '''DisableEnhancedMonitoring'''.
   */
  @js.native
  trait DisableEnhancedMonitoringInput extends js.Object {
    var ShardLevelMetrics: MetricsNameList
    var StreamName: StreamName
  }

  object DisableEnhancedMonitoringInput {
    def apply(
      ShardLevelMetrics: MetricsNameList,
      StreamName: StreamName): DisableEnhancedMonitoringInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardLevelMetrics" -> ShardLevelMetrics.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableEnhancedMonitoringInput]
    }
  }

  /**
   * Represents the input for '''EnableEnhancedMonitoring'''.
   */
  @js.native
  trait EnableEnhancedMonitoringInput extends js.Object {
    var ShardLevelMetrics: MetricsNameList
    var StreamName: StreamName
  }

  object EnableEnhancedMonitoringInput {
    def apply(
      ShardLevelMetrics: MetricsNameList,
      StreamName: StreamName): EnableEnhancedMonitoringInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardLevelMetrics" -> ShardLevelMetrics.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableEnhancedMonitoringInput]
    }
  }

  object EncryptionTypeEnum {
    val NONE = "NONE"
    val KMS = "KMS"

    val values = IndexedSeq(NONE, KMS)
  }

  /**
   * Represents enhanced metrics types.
   */
  @js.native
  trait EnhancedMetrics extends js.Object {
    var ShardLevelMetrics: js.UndefOr[MetricsNameList]
  }

  object EnhancedMetrics {
    def apply(
      ShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined): EnhancedMetrics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardLevelMetrics" -> ShardLevelMetrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnhancedMetrics]
    }
  }

  /**
   * Represents the output for '''EnableEnhancedMonitoring''' and '''DisableEnhancedMonitoring'''.
   */
  @js.native
  trait EnhancedMonitoringOutput extends js.Object {
    var CurrentShardLevelMetrics: js.UndefOr[MetricsNameList]
    var DesiredShardLevelMetrics: js.UndefOr[MetricsNameList]
    var StreamName: js.UndefOr[StreamName]
  }

  object EnhancedMonitoringOutput {
    def apply(
      CurrentShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined,
      DesiredShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined): EnhancedMonitoringOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentShardLevelMetrics" -> CurrentShardLevelMetrics.map { x => x.asInstanceOf[js.Any] },
        "DesiredShardLevelMetrics" -> DesiredShardLevelMetrics.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnhancedMonitoringOutput]
    }
  }

  /**
   * The provided iterator exceeds the maximum age allowed.
   */
  @js.native
  trait ExpiredIteratorExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The pagination token passed to the operation is expired.
   */
  @js.native
  trait ExpiredNextTokenExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Represents the input for '''GetRecords'''.
   */
  @js.native
  trait GetRecordsInput extends js.Object {
    var ShardIterator: ShardIterator
    var Limit: js.UndefOr[GetRecordsInputLimit]
  }

  object GetRecordsInput {
    def apply(
      ShardIterator: ShardIterator,
      Limit: js.UndefOr[GetRecordsInputLimit] = js.undefined): GetRecordsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardIterator" -> ShardIterator.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRecordsInput]
    }
  }

  /**
   * Represents the output for '''GetRecords'''.
   */
  @js.native
  trait GetRecordsOutput extends js.Object {
    var Records: RecordList
    var MillisBehindLatest: js.UndefOr[MillisBehindLatest]
    var NextShardIterator: js.UndefOr[ShardIterator]
  }

  object GetRecordsOutput {
    def apply(
      Records: RecordList,
      MillisBehindLatest: js.UndefOr[MillisBehindLatest] = js.undefined,
      NextShardIterator: js.UndefOr[ShardIterator] = js.undefined): GetRecordsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Records" -> Records.asInstanceOf[js.Any],
        "MillisBehindLatest" -> MillisBehindLatest.map { x => x.asInstanceOf[js.Any] },
        "NextShardIterator" -> NextShardIterator.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRecordsOutput]
    }
  }

  /**
   * Represents the input for <code>GetShardIterator</code>.
   */
  @js.native
  trait GetShardIteratorInput extends js.Object {
    var ShardId: ShardId
    var ShardIteratorType: ShardIteratorType
    var StreamName: StreamName
    var StartingSequenceNumber: js.UndefOr[SequenceNumber]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object GetShardIteratorInput {
    def apply(
      ShardId: ShardId,
      ShardIteratorType: ShardIteratorType,
      StreamName: StreamName,
      StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined): GetShardIteratorInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardId" -> ShardId.asInstanceOf[js.Any],
        "ShardIteratorType" -> ShardIteratorType.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "StartingSequenceNumber" -> StartingSequenceNumber.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetShardIteratorInput]
    }
  }

  /**
   * Represents the output for <code>GetShardIterator</code>.
   */
  @js.native
  trait GetShardIteratorOutput extends js.Object {
    var ShardIterator: js.UndefOr[ShardIterator]
  }

  object GetShardIteratorOutput {
    def apply(
      ShardIterator: js.UndefOr[ShardIterator] = js.undefined): GetShardIteratorOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardIterator" -> ShardIterator.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetShardIteratorOutput]
    }
  }

  /**
   * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
   */
  @js.native
  trait HashKeyRange extends js.Object {
    var EndingHashKey: HashKey
    var StartingHashKey: HashKey
  }

  object HashKeyRange {
    def apply(
      EndingHashKey: HashKey,
      StartingHashKey: HashKey): HashKeyRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndingHashKey" -> EndingHashKey.asInstanceOf[js.Any],
        "StartingHashKey" -> StartingHashKey.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HashKeyRange]
    }
  }

  /**
   * Represents the input for '''IncreaseStreamRetentionPeriod'''.
   */
  @js.native
  trait IncreaseStreamRetentionPeriodInput extends js.Object {
    var RetentionPeriodHours: RetentionPeriodHours
    var StreamName: StreamName
  }

  object IncreaseStreamRetentionPeriodInput {
    def apply(
      RetentionPeriodHours: RetentionPeriodHours,
      StreamName: StreamName): IncreaseStreamRetentionPeriodInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RetentionPeriodHours" -> RetentionPeriodHours.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IncreaseStreamRetentionPeriodInput]
    }
  }

  @js.native
  trait InternalFailureExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information, see the returned message.
   */
  @js.native
  trait InvalidArgumentExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The ciphertext references a key that doesn't exist or that you don't have access to.
   */
  @js.native
  trait KMSAccessDeniedExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The request was rejected because the specified customer master key (CMK) isn't enabled.
   */
  @js.native
  trait KMSDisabledExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The request was rejected because the state of the specified resource isn't valid for this request. For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
   */
  @js.native
  trait KMSInvalidStateExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The request was rejected because the specified entity or resource can't be found.
   */
  @js.native
  trait KMSNotFoundExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The AWS access key ID needs a subscription for the service.
   */
  @js.native
  trait KMSOptInRequiredException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The request was denied due to request throttling. For more information about throttling, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html#requests-per-second">Limits</a> in the <i>AWS Key Management Service Developer Guide</i>.
   */
  @js.native
  trait KMSThrottlingExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed.
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait ListShardsInput extends js.Object {
    var ExclusiveStartShardId: js.UndefOr[ShardId]
    var MaxResults: js.UndefOr[ListShardsInputLimit]
    var NextToken: js.UndefOr[NextToken]
    var StreamCreationTimestamp: js.UndefOr[Timestamp]
    var StreamName: js.UndefOr[StreamName]
  }

  object ListShardsInput {
    def apply(
      ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined,
      MaxResults: js.UndefOr[ListShardsInputLimit] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StreamCreationTimestamp: js.UndefOr[Timestamp] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined): ListShardsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExclusiveStartShardId" -> ExclusiveStartShardId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StreamCreationTimestamp" -> StreamCreationTimestamp.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListShardsInput]
    }
  }

  @js.native
  trait ListShardsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Shards: js.UndefOr[ShardList]
  }

  object ListShardsOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Shards: js.UndefOr[ShardList] = js.undefined): ListShardsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Shards" -> Shards.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListShardsOutput]
    }
  }

  @js.native
  trait ListStreamConsumersInput extends js.Object {
    var StreamARN: StreamARN
    var MaxResults: js.UndefOr[ListStreamConsumersInputLimit]
    var NextToken: js.UndefOr[NextToken]
    var StreamCreationTimestamp: js.UndefOr[Timestamp]
  }

  object ListStreamConsumersInput {
    def apply(
      StreamARN: StreamARN,
      MaxResults: js.UndefOr[ListStreamConsumersInputLimit] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StreamCreationTimestamp: js.UndefOr[Timestamp] = js.undefined): ListStreamConsumersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StreamCreationTimestamp" -> StreamCreationTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamConsumersInput]
    }
  }

  @js.native
  trait ListStreamConsumersOutput extends js.Object {
    var Consumers: js.UndefOr[ConsumerList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListStreamConsumersOutput {
    def apply(
      Consumers: js.UndefOr[ConsumerList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListStreamConsumersOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Consumers" -> Consumers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamConsumersOutput]
    }
  }

  /**
   * Represents the input for <code>ListStreams</code>.
   */
  @js.native
  trait ListStreamsInput extends js.Object {
    var ExclusiveStartStreamName: js.UndefOr[StreamName]
    var Limit: js.UndefOr[ListStreamsInputLimit]
  }

  object ListStreamsInput {
    def apply(
      ExclusiveStartStreamName: js.UndefOr[StreamName] = js.undefined,
      Limit: js.UndefOr[ListStreamsInputLimit] = js.undefined): ListStreamsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExclusiveStartStreamName" -> ExclusiveStartStreamName.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsInput]
    }
  }

  /**
   * Represents the output for <code>ListStreams</code>.
   */
  @js.native
  trait ListStreamsOutput extends js.Object {
    var HasMoreStreams: BooleanObject
    var StreamNames: StreamNameList
  }

  object ListStreamsOutput {
    def apply(
      HasMoreStreams: BooleanObject,
      StreamNames: StreamNameList): ListStreamsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HasMoreStreams" -> HasMoreStreams.asInstanceOf[js.Any],
        "StreamNames" -> StreamNames.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsOutput]
    }
  }

  /**
   * Represents the input for <code>ListTagsForStream</code>.
   */
  @js.native
  trait ListTagsForStreamInput extends js.Object {
    var StreamName: StreamName
    var ExclusiveStartTagKey: js.UndefOr[TagKey]
    var Limit: js.UndefOr[ListTagsForStreamInputLimit]
  }

  object ListTagsForStreamInput {
    def apply(
      StreamName: StreamName,
      ExclusiveStartTagKey: js.UndefOr[TagKey] = js.undefined,
      Limit: js.UndefOr[ListTagsForStreamInputLimit] = js.undefined): ListTagsForStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "ExclusiveStartTagKey" -> ExclusiveStartTagKey.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForStreamInput]
    }
  }

  /**
   * Represents the output for <code>ListTagsForStream</code>.
   */
  @js.native
  trait ListTagsForStreamOutput extends js.Object {
    var HasMoreTags: BooleanObject
    var Tags: TagList
  }

  object ListTagsForStreamOutput {
    def apply(
      HasMoreTags: BooleanObject,
      Tags: TagList): ListTagsForStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HasMoreTags" -> HasMoreTags.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForStreamOutput]
    }
  }

  /**
   * Represents the input for <code>MergeShards</code>.
   */
  @js.native
  trait MergeShardsInput extends js.Object {
    var AdjacentShardToMerge: ShardId
    var ShardToMerge: ShardId
    var StreamName: StreamName
  }

  object MergeShardsInput {
    def apply(
      AdjacentShardToMerge: ShardId,
      ShardToMerge: ShardId,
      StreamName: StreamName): MergeShardsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdjacentShardToMerge" -> AdjacentShardToMerge.asInstanceOf[js.Any],
        "ShardToMerge" -> ShardToMerge.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MergeShardsInput]
    }
  }

  object MetricsNameEnum {
    val IncomingBytes = "IncomingBytes"
    val IncomingRecords = "IncomingRecords"
    val OutgoingBytes = "OutgoingBytes"
    val OutgoingRecords = "OutgoingRecords"
    val WriteProvisionedThroughputExceeded = "WriteProvisionedThroughputExceeded"
    val ReadProvisionedThroughputExceeded = "ReadProvisionedThroughputExceeded"
    val IteratorAgeMilliseconds = "IteratorAgeMilliseconds"
    val ALL = "ALL"

    val values = IndexedSeq(IncomingBytes, IncomingRecords, OutgoingBytes, OutgoingRecords, WriteProvisionedThroughputExceeded, ReadProvisionedThroughputExceeded, IteratorAgeMilliseconds, ALL)
  }

  /**
   * The request rate for the stream is too high, or the requested data is too large for the available throughput. Reduce the frequency or size of your requests. For more information, see <a href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>, and <a href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html">Error Retries and Exponential Backoff in AWS</a> in the <i>AWS General Reference</i>.
   */
  @js.native
  trait ProvisionedThroughputExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Represents the input for <code>PutRecord</code>.
   */
  @js.native
  trait PutRecordInput extends js.Object {
    var Data: Data
    var PartitionKey: PartitionKey
    var StreamName: StreamName
    var ExplicitHashKey: js.UndefOr[HashKey]
    var SequenceNumberForOrdering: js.UndefOr[SequenceNumber]
  }

  object PutRecordInput {
    def apply(
      Data: Data,
      PartitionKey: PartitionKey,
      StreamName: StreamName,
      ExplicitHashKey: js.UndefOr[HashKey] = js.undefined,
      SequenceNumberForOrdering: js.UndefOr[SequenceNumber] = js.undefined): PutRecordInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.asInstanceOf[js.Any],
        "PartitionKey" -> PartitionKey.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "ExplicitHashKey" -> ExplicitHashKey.map { x => x.asInstanceOf[js.Any] },
        "SequenceNumberForOrdering" -> SequenceNumberForOrdering.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordInput]
    }
  }

  /**
   * Represents the output for <code>PutRecord</code>.
   */
  @js.native
  trait PutRecordOutput extends js.Object {
    var SequenceNumber: SequenceNumber
    var ShardId: ShardId
    var EncryptionType: js.UndefOr[EncryptionType]
  }

  object PutRecordOutput {
    def apply(
      SequenceNumber: SequenceNumber,
      ShardId: ShardId,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined): PutRecordOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SequenceNumber" -> SequenceNumber.asInstanceOf[js.Any],
        "ShardId" -> ShardId.asInstanceOf[js.Any],
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordOutput]
    }
  }

  /**
   * A <code>PutRecords</code> request.
   */
  @js.native
  trait PutRecordsInput extends js.Object {
    var Records: PutRecordsRequestEntryList
    var StreamName: StreamName
  }

  object PutRecordsInput {
    def apply(
      Records: PutRecordsRequestEntryList,
      StreamName: StreamName): PutRecordsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Records" -> Records.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordsInput]
    }
  }

  /**
   * <code>PutRecords</code> results.
   */
  @js.native
  trait PutRecordsOutput extends js.Object {
    var Records: PutRecordsResultEntryList
    var EncryptionType: js.UndefOr[EncryptionType]
    var FailedRecordCount: js.UndefOr[PositiveIntegerObject]
  }

  object PutRecordsOutput {
    def apply(
      Records: PutRecordsResultEntryList,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined,
      FailedRecordCount: js.UndefOr[PositiveIntegerObject] = js.undefined): PutRecordsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Records" -> Records.asInstanceOf[js.Any],
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] },
        "FailedRecordCount" -> FailedRecordCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordsOutput]
    }
  }

  /**
   * Represents the output for <code>PutRecords</code>.
   */
  @js.native
  trait PutRecordsRequestEntry extends js.Object {
    var Data: Data
    var PartitionKey: PartitionKey
    var ExplicitHashKey: js.UndefOr[HashKey]
  }

  object PutRecordsRequestEntry {
    def apply(
      Data: Data,
      PartitionKey: PartitionKey,
      ExplicitHashKey: js.UndefOr[HashKey] = js.undefined): PutRecordsRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.asInstanceOf[js.Any],
        "PartitionKey" -> PartitionKey.asInstanceOf[js.Any],
        "ExplicitHashKey" -> ExplicitHashKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordsRequestEntry]
    }
  }

  /**
   * Represents the result of an individual record from a <code>PutRecords</code> request. A record that is successfully added to a stream includes <code>SequenceNumber</code> and <code>ShardId</code> in the result. A record that fails to be added to the stream includes <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
   */
  @js.native
  trait PutRecordsResultEntry extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var SequenceNumber: js.UndefOr[SequenceNumber]
    var ShardId: js.UndefOr[ShardId]
  }

  object PutRecordsResultEntry {
    def apply(
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
      SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      ShardId: js.UndefOr[ShardId] = js.undefined): PutRecordsResultEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "SequenceNumber" -> SequenceNumber.map { x => x.asInstanceOf[js.Any] },
        "ShardId" -> ShardId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordsResultEntry]
    }
  }

  /**
   * The unit of data of the Kinesis data stream, which is composed of a sequence number, a partition key, and a data blob.
   */
  @js.native
  trait Record extends js.Object {
    var Data: Data
    var PartitionKey: PartitionKey
    var SequenceNumber: SequenceNumber
    var ApproximateArrivalTimestamp: js.UndefOr[Timestamp]
    var EncryptionType: js.UndefOr[EncryptionType]
  }

  object Record {
    def apply(
      Data: Data,
      PartitionKey: PartitionKey,
      SequenceNumber: SequenceNumber,
      ApproximateArrivalTimestamp: js.UndefOr[Timestamp] = js.undefined,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined): Record = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.asInstanceOf[js.Any],
        "PartitionKey" -> PartitionKey.asInstanceOf[js.Any],
        "SequenceNumber" -> SequenceNumber.asInstanceOf[js.Any],
        "ApproximateArrivalTimestamp" -> ApproximateArrivalTimestamp.map { x => x.asInstanceOf[js.Any] },
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Record]
    }
  }

  @js.native
  trait RegisterStreamConsumerInput extends js.Object {
    var ConsumerName: ConsumerName
    var StreamARN: StreamARN
  }

  object RegisterStreamConsumerInput {
    def apply(
      ConsumerName: ConsumerName,
      StreamARN: StreamARN): RegisterStreamConsumerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumerName" -> ConsumerName.asInstanceOf[js.Any],
        "StreamARN" -> StreamARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterStreamConsumerInput]
    }
  }

  @js.native
  trait RegisterStreamConsumerOutput extends js.Object {
    var Consumer: Consumer
  }

  object RegisterStreamConsumerOutput {
    def apply(
      Consumer: Consumer): RegisterStreamConsumerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Consumer" -> Consumer.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterStreamConsumerOutput]
    }
  }

  /**
   * Represents the input for <code>RemoveTagsFromStream</code>.
   */
  @js.native
  trait RemoveTagsFromStreamInput extends js.Object {
    var StreamName: StreamName
    var TagKeys: TagKeyList
  }

  object RemoveTagsFromStreamInput {
    def apply(
      StreamName: StreamName,
      TagKeys: TagKeyList): RemoveTagsFromStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromStreamInput]
    }
  }

  /**
   * The resource is not available for this operation. For successful operation, the resource must be in the <code>ACTIVE</code> state.
   */
  @js.native
  trait ResourceInUseExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * The requested resource could not be found. The stream might not be specified correctly.
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: ErrorMessage
  }

  object ScalingTypeEnum {
    val UNIFORM_SCALING = "UNIFORM_SCALING"

    val values = IndexedSeq(UNIFORM_SCALING)
  }

  /**
   * The range of possible sequence numbers for the shard.
   */
  @js.native
  trait SequenceNumberRange extends js.Object {
    var StartingSequenceNumber: SequenceNumber
    var EndingSequenceNumber: js.UndefOr[SequenceNumber]
  }

  object SequenceNumberRange {
    def apply(
      StartingSequenceNumber: SequenceNumber,
      EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined): SequenceNumberRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartingSequenceNumber" -> StartingSequenceNumber.asInstanceOf[js.Any],
        "EndingSequenceNumber" -> EndingSequenceNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SequenceNumberRange]
    }
  }

  /**
   * A uniquely identified group of data records in a Kinesis data stream.
   */
  @js.native
  trait Shard extends js.Object {
    var HashKeyRange: HashKeyRange
    var SequenceNumberRange: SequenceNumberRange
    var ShardId: ShardId
    var AdjacentParentShardId: js.UndefOr[ShardId]
    var ParentShardId: js.UndefOr[ShardId]
  }

  object Shard {
    def apply(
      HashKeyRange: HashKeyRange,
      SequenceNumberRange: SequenceNumberRange,
      ShardId: ShardId,
      AdjacentParentShardId: js.UndefOr[ShardId] = js.undefined,
      ParentShardId: js.UndefOr[ShardId] = js.undefined): Shard = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HashKeyRange" -> HashKeyRange.asInstanceOf[js.Any],
        "SequenceNumberRange" -> SequenceNumberRange.asInstanceOf[js.Any],
        "ShardId" -> ShardId.asInstanceOf[js.Any],
        "AdjacentParentShardId" -> AdjacentParentShardId.map { x => x.asInstanceOf[js.Any] },
        "ParentShardId" -> ParentShardId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Shard]
    }
  }

  object ShardIteratorTypeEnum {
    val AT_SEQUENCE_NUMBER = "AT_SEQUENCE_NUMBER"
    val AFTER_SEQUENCE_NUMBER = "AFTER_SEQUENCE_NUMBER"
    val TRIM_HORIZON = "TRIM_HORIZON"
    val LATEST = "LATEST"
    val AT_TIMESTAMP = "AT_TIMESTAMP"

    val values = IndexedSeq(AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER, TRIM_HORIZON, LATEST, AT_TIMESTAMP)
  }

  /**
   * Represents the input for <code>SplitShard</code>.
   */
  @js.native
  trait SplitShardInput extends js.Object {
    var NewStartingHashKey: HashKey
    var ShardToSplit: ShardId
    var StreamName: StreamName
  }

  object SplitShardInput {
    def apply(
      NewStartingHashKey: HashKey,
      ShardToSplit: ShardId,
      StreamName: StreamName): SplitShardInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NewStartingHashKey" -> NewStartingHashKey.asInstanceOf[js.Any],
        "ShardToSplit" -> ShardToSplit.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SplitShardInput]
    }
  }

  @js.native
  trait StartStreamEncryptionInput extends js.Object {
    var EncryptionType: EncryptionType
    var KeyId: KeyId
    var StreamName: StreamName
  }

  object StartStreamEncryptionInput {
    def apply(
      EncryptionType: EncryptionType,
      KeyId: KeyId,
      StreamName: StreamName): StartStreamEncryptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionType" -> EncryptionType.asInstanceOf[js.Any],
        "KeyId" -> KeyId.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartStreamEncryptionInput]
    }
  }

  @js.native
  trait StartingPosition extends js.Object {
    var Type: ShardIteratorType
    var SequenceNumber: js.UndefOr[SequenceNumber]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object StartingPosition {
    def apply(
      Type: ShardIteratorType,
      SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined): StartingPosition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any],
        "SequenceNumber" -> SequenceNumber.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartingPosition]
    }
  }

  @js.native
  trait StopStreamEncryptionInput extends js.Object {
    var EncryptionType: EncryptionType
    var KeyId: KeyId
    var StreamName: StreamName
  }

  object StopStreamEncryptionInput {
    def apply(
      EncryptionType: EncryptionType,
      KeyId: KeyId,
      StreamName: StreamName): StopStreamEncryptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionType" -> EncryptionType.asInstanceOf[js.Any],
        "KeyId" -> KeyId.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopStreamEncryptionInput]
    }
  }

  /**
   * Represents the output for '''DescribeStream'''.
   */
  @js.native
  trait StreamDescription extends js.Object {
    var EnhancedMonitoring: EnhancedMonitoringList
    var HasMoreShards: BooleanObject
    var RetentionPeriodHours: RetentionPeriodHours
    var Shards: ShardList
    var StreamARN: StreamARN
    var StreamCreationTimestamp: Timestamp
    var StreamName: StreamName
    var StreamStatus: StreamStatus
    var EncryptionType: js.UndefOr[EncryptionType]
    var KeyId: js.UndefOr[KeyId]
  }

  object StreamDescription {
    def apply(
      EnhancedMonitoring: EnhancedMonitoringList,
      HasMoreShards: BooleanObject,
      RetentionPeriodHours: RetentionPeriodHours,
      Shards: ShardList,
      StreamARN: StreamARN,
      StreamCreationTimestamp: Timestamp,
      StreamName: StreamName,
      StreamStatus: StreamStatus,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined,
      KeyId: js.UndefOr[KeyId] = js.undefined): StreamDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnhancedMonitoring" -> EnhancedMonitoring.asInstanceOf[js.Any],
        "HasMoreShards" -> HasMoreShards.asInstanceOf[js.Any],
        "RetentionPeriodHours" -> RetentionPeriodHours.asInstanceOf[js.Any],
        "Shards" -> Shards.asInstanceOf[js.Any],
        "StreamARN" -> StreamARN.asInstanceOf[js.Any],
        "StreamCreationTimestamp" -> StreamCreationTimestamp.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "StreamStatus" -> StreamStatus.asInstanceOf[js.Any],
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamDescription]
    }
  }

  /**
   * Represents the output for '''DescribeStreamSummary'''
   */
  @js.native
  trait StreamDescriptionSummary extends js.Object {
    var EnhancedMonitoring: EnhancedMonitoringList
    var OpenShardCount: ShardCountObject
    var RetentionPeriodHours: PositiveIntegerObject
    var StreamARN: StreamARN
    var StreamCreationTimestamp: Timestamp
    var StreamName: StreamName
    var StreamStatus: StreamStatus
    var ConsumerCount: js.UndefOr[ConsumerCountObject]
    var EncryptionType: js.UndefOr[EncryptionType]
    var KeyId: js.UndefOr[KeyId]
  }

  object StreamDescriptionSummary {
    def apply(
      EnhancedMonitoring: EnhancedMonitoringList,
      OpenShardCount: ShardCountObject,
      RetentionPeriodHours: PositiveIntegerObject,
      StreamARN: StreamARN,
      StreamCreationTimestamp: Timestamp,
      StreamName: StreamName,
      StreamStatus: StreamStatus,
      ConsumerCount: js.UndefOr[ConsumerCountObject] = js.undefined,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined,
      KeyId: js.UndefOr[KeyId] = js.undefined): StreamDescriptionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnhancedMonitoring" -> EnhancedMonitoring.asInstanceOf[js.Any],
        "OpenShardCount" -> OpenShardCount.asInstanceOf[js.Any],
        "RetentionPeriodHours" -> RetentionPeriodHours.asInstanceOf[js.Any],
        "StreamARN" -> StreamARN.asInstanceOf[js.Any],
        "StreamCreationTimestamp" -> StreamCreationTimestamp.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "StreamStatus" -> StreamStatus.asInstanceOf[js.Any],
        "ConsumerCount" -> ConsumerCount.map { x => x.asInstanceOf[js.Any] },
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamDescriptionSummary]
    }
  }

  object StreamStatusEnum {
    val CREATING = "CREATING"
    val DELETING = "DELETING"
    val ACTIVE = "ACTIVE"
    val UPDATING = "UPDATING"

    val values = IndexedSeq(CREATING, DELETING, ACTIVE, UPDATING)
  }

  /**
   * After you call '''SubscribeToShard''', Kinesis Data Streams sends events of this type to your consumer.
   */
  @js.native
  trait SubscribeToShardEvent extends js.Object {
    var ContinuationSequenceNumber: SequenceNumber
    var MillisBehindLatest: MillisBehindLatest
    var Records: RecordList
  }

  object SubscribeToShardEvent {
    def apply(
      ContinuationSequenceNumber: SequenceNumber,
      MillisBehindLatest: MillisBehindLatest,
      Records: RecordList): SubscribeToShardEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContinuationSequenceNumber" -> ContinuationSequenceNumber.asInstanceOf[js.Any],
        "MillisBehindLatest" -> MillisBehindLatest.asInstanceOf[js.Any],
        "Records" -> Records.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeToShardEvent]
    }
  }

  @js.native
  trait SubscribeToShardEventStream extends js.Object {
    var SubscribeToShardEvent: SubscribeToShardEvent
  }

  object SubscribeToShardEventStream {
    def apply(
      SubscribeToShardEvent: SubscribeToShardEvent): SubscribeToShardEventStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscribeToShardEvent" -> SubscribeToShardEvent.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeToShardEventStream]
    }
  }

  @js.native
  trait SubscribeToShardInput extends js.Object {
    var ConsumerARN: ConsumerARN
    var ShardId: ShardId
    var StartingPosition: StartingPosition
  }

  object SubscribeToShardInput {
    def apply(
      ConsumerARN: ConsumerARN,
      ShardId: ShardId,
      StartingPosition: StartingPosition): SubscribeToShardInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumerARN" -> ConsumerARN.asInstanceOf[js.Any],
        "ShardId" -> ShardId.asInstanceOf[js.Any],
        "StartingPosition" -> StartingPosition.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeToShardInput]
    }
  }

  @js.native
  trait SubscribeToShardOutput extends js.Object {
    var EventStream: SubscribeToShardEventStream
  }

  object SubscribeToShardOutput {
    def apply(
      EventStream: SubscribeToShardEventStream): SubscribeToShardOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventStream" -> EventStream.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeToShardOutput]
    }
  }

  /**
   * Metadata assigned to the stream, consisting of a key-value pair.
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: TagKey,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait UpdateShardCountInput extends js.Object {
    var ScalingType: ScalingType
    var StreamName: StreamName
    var TargetShardCount: PositiveIntegerObject
  }

  object UpdateShardCountInput {
    def apply(
      ScalingType: ScalingType,
      StreamName: StreamName,
      TargetShardCount: PositiveIntegerObject): UpdateShardCountInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScalingType" -> ScalingType.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "TargetShardCount" -> TargetShardCount.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateShardCountInput]
    }
  }

  @js.native
  trait UpdateShardCountOutput extends js.Object {
    var CurrentShardCount: js.UndefOr[PositiveIntegerObject]
    var StreamName: js.UndefOr[StreamName]
    var TargetShardCount: js.UndefOr[PositiveIntegerObject]
  }

  object UpdateShardCountOutput {
    def apply(
      CurrentShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined): UpdateShardCountOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentShardCount" -> CurrentShardCount.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "TargetShardCount" -> TargetShardCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateShardCountOutput]
    }
  }
}
