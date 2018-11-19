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
   * <p>Represents the input for <code>AddTagsToStream</code>.</p>
   */
  @js.native
  trait AddTagsToStreamInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var Tags: js.UndefOr[TagMap]
  }

  object AddTagsToStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      Tags: js.UndefOr[TagMap] = js.undefined): AddTagsToStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToStreamInput]
    }
  }

  /**
   * <p>An object that represents the details of the consumer you registered.</p>
   */
  @js.native
  trait Consumer extends js.Object {
    var ConsumerName: js.UndefOr[ConsumerName]
    var ConsumerARN: js.UndefOr[ConsumerARN]
    var ConsumerStatus: js.UndefOr[ConsumerStatus]
    var ConsumerCreationTimestamp: js.UndefOr[Timestamp]
  }

  object Consumer {
    def apply(
      ConsumerName: js.UndefOr[ConsumerName] = js.undefined,
      ConsumerARN: js.UndefOr[ConsumerARN] = js.undefined,
      ConsumerStatus: js.UndefOr[ConsumerStatus] = js.undefined,
      ConsumerCreationTimestamp: js.UndefOr[Timestamp] = js.undefined): Consumer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumerName" -> ConsumerName.map { x => x.asInstanceOf[js.Any] },
        "ConsumerARN" -> ConsumerARN.map { x => x.asInstanceOf[js.Any] },
        "ConsumerStatus" -> ConsumerStatus.map { x => x.asInstanceOf[js.Any] },
        "ConsumerCreationTimestamp" -> ConsumerCreationTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Consumer]
    }
  }

  /**
   * <p>An object that represents the details of a registered consumer.</p>
   */
  @js.native
  trait ConsumerDescription extends js.Object {
    var StreamARN: js.UndefOr[StreamARN]
    var ConsumerCreationTimestamp: js.UndefOr[Timestamp]
    var ConsumerStatus: js.UndefOr[ConsumerStatus]
    var ConsumerName: js.UndefOr[ConsumerName]
    var ConsumerARN: js.UndefOr[ConsumerARN]
  }

  object ConsumerDescription {
    def apply(
      StreamARN: js.UndefOr[StreamARN] = js.undefined,
      ConsumerCreationTimestamp: js.UndefOr[Timestamp] = js.undefined,
      ConsumerStatus: js.UndefOr[ConsumerStatus] = js.undefined,
      ConsumerName: js.UndefOr[ConsumerName] = js.undefined,
      ConsumerARN: js.UndefOr[ConsumerARN] = js.undefined): ConsumerDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "ConsumerCreationTimestamp" -> ConsumerCreationTimestamp.map { x => x.asInstanceOf[js.Any] },
        "ConsumerStatus" -> ConsumerStatus.map { x => x.asInstanceOf[js.Any] },
        "ConsumerName" -> ConsumerName.map { x => x.asInstanceOf[js.Any] },
        "ConsumerARN" -> ConsumerARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input for <code>CreateStream</code>.</p>
   */
  @js.native
  trait CreateStreamInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var ShardCount: js.UndefOr[PositiveIntegerObject]
  }

  object CreateStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      ShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined): CreateStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "ShardCount" -> ShardCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStreamInput]
    }
  }

  /**
   * <p>Represents the input for <a>DecreaseStreamRetentionPeriod</a>.</p>
   */
  @js.native
  trait DecreaseStreamRetentionPeriodInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var RetentionPeriodHours: js.UndefOr[RetentionPeriodHours]
  }

  object DecreaseStreamRetentionPeriodInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      RetentionPeriodHours: js.UndefOr[RetentionPeriodHours] = js.undefined): DecreaseStreamRetentionPeriodInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "RetentionPeriodHours" -> RetentionPeriodHours.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecreaseStreamRetentionPeriodInput]
    }
  }

  /**
   * <p>Represents the input for <a>DeleteStream</a>.</p>
   */
  @js.native
  trait DeleteStreamInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var EnforceConsumerDeletion: js.UndefOr[BooleanObject]
  }

  object DeleteStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      EnforceConsumerDeletion: js.UndefOr[BooleanObject] = js.undefined): DeleteStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "EnforceConsumerDeletion" -> EnforceConsumerDeletion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStreamInput]
    }
  }

  @js.native
  trait DeregisterStreamConsumerInput extends js.Object {
    var StreamARN: js.UndefOr[StreamARN]
    var ConsumerName: js.UndefOr[ConsumerName]
    var ConsumerARN: js.UndefOr[ConsumerARN]
  }

  object DeregisterStreamConsumerInput {
    def apply(
      StreamARN: js.UndefOr[StreamARN] = js.undefined,
      ConsumerName: js.UndefOr[ConsumerName] = js.undefined,
      ConsumerARN: js.UndefOr[ConsumerARN] = js.undefined): DeregisterStreamConsumerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "ConsumerName" -> ConsumerName.map { x => x.asInstanceOf[js.Any] },
        "ConsumerARN" -> ConsumerARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ShardLimit: js.UndefOr[ShardCountObject]
    var OpenShardCount: js.UndefOr[ShardCountObject]
  }

  object DescribeLimitsOutput {
    def apply(
      ShardLimit: js.UndefOr[ShardCountObject] = js.undefined,
      OpenShardCount: js.UndefOr[ShardCountObject] = js.undefined): DescribeLimitsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardLimit" -> ShardLimit.map { x => x.asInstanceOf[js.Any] },
        "OpenShardCount" -> OpenShardCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLimitsOutput]
    }
  }

  @js.native
  trait DescribeStreamConsumerInput extends js.Object {
    var StreamARN: js.UndefOr[StreamARN]
    var ConsumerName: js.UndefOr[ConsumerName]
    var ConsumerARN: js.UndefOr[ConsumerARN]
  }

  object DescribeStreamConsumerInput {
    def apply(
      StreamARN: js.UndefOr[StreamARN] = js.undefined,
      ConsumerName: js.UndefOr[ConsumerName] = js.undefined,
      ConsumerARN: js.UndefOr[ConsumerARN] = js.undefined): DescribeStreamConsumerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "ConsumerName" -> ConsumerName.map { x => x.asInstanceOf[js.Any] },
        "ConsumerARN" -> ConsumerARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamConsumerInput]
    }
  }

  @js.native
  trait DescribeStreamConsumerOutput extends js.Object {
    var ConsumerDescription: js.UndefOr[ConsumerDescription]
  }

  object DescribeStreamConsumerOutput {
    def apply(
      ConsumerDescription: js.UndefOr[ConsumerDescription] = js.undefined): DescribeStreamConsumerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumerDescription" -> ConsumerDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamConsumerOutput]
    }
  }

  /**
   * <p>Represents the input for <code>DescribeStream</code>.</p>
   */
  @js.native
  trait DescribeStreamInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var Limit: js.UndefOr[DescribeStreamInputLimit]
    var ExclusiveStartShardId: js.UndefOr[ShardId]
  }

  object DescribeStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      Limit: js.UndefOr[DescribeStreamInputLimit] = js.undefined,
      ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined): DescribeStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "ExclusiveStartShardId" -> ExclusiveStartShardId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamInput]
    }
  }

  /**
   * <p>Represents the output for <code>DescribeStream</code>.</p>
   */
  @js.native
  trait DescribeStreamOutput extends js.Object {
    var StreamDescription: js.UndefOr[StreamDescription]
  }

  object DescribeStreamOutput {
    def apply(
      StreamDescription: js.UndefOr[StreamDescription] = js.undefined): DescribeStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamDescription" -> StreamDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamOutput]
    }
  }

  @js.native
  trait DescribeStreamSummaryInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
  }

  object DescribeStreamSummaryInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined): DescribeStreamSummaryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamSummaryInput]
    }
  }

  @js.native
  trait DescribeStreamSummaryOutput extends js.Object {
    var StreamDescriptionSummary: js.UndefOr[StreamDescriptionSummary]
  }

  object DescribeStreamSummaryOutput {
    def apply(
      StreamDescriptionSummary: js.UndefOr[StreamDescriptionSummary] = js.undefined): DescribeStreamSummaryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamDescriptionSummary" -> StreamDescriptionSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStreamSummaryOutput]
    }
  }

  /**
   * <p>Represents the input for <a>DisableEnhancedMonitoring</a>.</p>
   */
  @js.native
  trait DisableEnhancedMonitoringInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var ShardLevelMetrics: js.UndefOr[MetricsNameList]
  }

  object DisableEnhancedMonitoringInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      ShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined): DisableEnhancedMonitoringInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "ShardLevelMetrics" -> ShardLevelMetrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableEnhancedMonitoringInput]
    }
  }

  /**
   * <p>Represents the input for <a>EnableEnhancedMonitoring</a>.</p>
   */
  @js.native
  trait EnableEnhancedMonitoringInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var ShardLevelMetrics: js.UndefOr[MetricsNameList]
  }

  object EnableEnhancedMonitoringInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      ShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined): EnableEnhancedMonitoringInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "ShardLevelMetrics" -> ShardLevelMetrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableEnhancedMonitoringInput]
    }
  }

  object EncryptionTypeEnum {
    val NONE = "NONE"
    val KMS = "KMS"

    val values = IndexedSeq(NONE, KMS)
  }

  /**
   * <p>Represents enhanced metrics types.</p>
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
   * <p>Represents the output for <a>EnableEnhancedMonitoring</a> and <a>DisableEnhancedMonitoring</a>.</p>
   */
  @js.native
  trait EnhancedMonitoringOutput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var CurrentShardLevelMetrics: js.UndefOr[MetricsNameList]
    var DesiredShardLevelMetrics: js.UndefOr[MetricsNameList]
  }

  object EnhancedMonitoringOutput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      CurrentShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined,
      DesiredShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined): EnhancedMonitoringOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "CurrentShardLevelMetrics" -> CurrentShardLevelMetrics.map { x => x.asInstanceOf[js.Any] },
        "DesiredShardLevelMetrics" -> DesiredShardLevelMetrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnhancedMonitoringOutput]
    }
  }

  /**
   * <p>The provided iterator exceeds the maximum age allowed.</p>
   */
  @js.native
  trait ExpiredIteratorExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The pagination token passed to the operation is expired.</p>
   */
  @js.native
  trait ExpiredNextTokenExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Represents the input for <a>GetRecords</a>.</p>
   */
  @js.native
  trait GetRecordsInput extends js.Object {
    var ShardIterator: js.UndefOr[ShardIterator]
    var Limit: js.UndefOr[GetRecordsInputLimit]
  }

  object GetRecordsInput {
    def apply(
      ShardIterator: js.UndefOr[ShardIterator] = js.undefined,
      Limit: js.UndefOr[GetRecordsInputLimit] = js.undefined): GetRecordsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardIterator" -> ShardIterator.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRecordsInput]
    }
  }

  /**
   * <p>Represents the output for <a>GetRecords</a>.</p>
   */
  @js.native
  trait GetRecordsOutput extends js.Object {
    var Records: js.UndefOr[RecordList]
    var NextShardIterator: js.UndefOr[ShardIterator]
    var MillisBehindLatest: js.UndefOr[MillisBehindLatest]
  }

  object GetRecordsOutput {
    def apply(
      Records: js.UndefOr[RecordList] = js.undefined,
      NextShardIterator: js.UndefOr[ShardIterator] = js.undefined,
      MillisBehindLatest: js.UndefOr[MillisBehindLatest] = js.undefined): GetRecordsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Records" -> Records.map { x => x.asInstanceOf[js.Any] },
        "NextShardIterator" -> NextShardIterator.map { x => x.asInstanceOf[js.Any] },
        "MillisBehindLatest" -> MillisBehindLatest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRecordsOutput]
    }
  }

  /**
   * <p>Represents the input for <code>GetShardIterator</code>.</p>
   */
  @js.native
  trait GetShardIteratorInput extends js.Object {
    var Timestamp: js.UndefOr[Timestamp]
    var ShardId: js.UndefOr[ShardId]
    var StreamName: js.UndefOr[StreamName]
    var ShardIteratorType: js.UndefOr[ShardIteratorType]
    var StartingSequenceNumber: js.UndefOr[SequenceNumber]
  }

  object GetShardIteratorInput {
    def apply(
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      ShardId: js.UndefOr[ShardId] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      ShardIteratorType: js.UndefOr[ShardIteratorType] = js.undefined,
      StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined): GetShardIteratorInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "ShardId" -> ShardId.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "ShardIteratorType" -> ShardIteratorType.map { x => x.asInstanceOf[js.Any] },
        "StartingSequenceNumber" -> StartingSequenceNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetShardIteratorInput]
    }
  }

  /**
   * <p>Represents the output for <code>GetShardIterator</code>.</p>
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
   * <p>The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.</p>
   */
  @js.native
  trait HashKeyRange extends js.Object {
    var StartingHashKey: js.UndefOr[HashKey]
    var EndingHashKey: js.UndefOr[HashKey]
  }

  object HashKeyRange {
    def apply(
      StartingHashKey: js.UndefOr[HashKey] = js.undefined,
      EndingHashKey: js.UndefOr[HashKey] = js.undefined): HashKeyRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartingHashKey" -> StartingHashKey.map { x => x.asInstanceOf[js.Any] },
        "EndingHashKey" -> EndingHashKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HashKeyRange]
    }
  }

  /**
   * <p>Represents the input for <a>IncreaseStreamRetentionPeriod</a>.</p>
   */
  @js.native
  trait IncreaseStreamRetentionPeriodInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var RetentionPeriodHours: js.UndefOr[RetentionPeriodHours]
  }

  object IncreaseStreamRetentionPeriodInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      RetentionPeriodHours: js.UndefOr[RetentionPeriodHours] = js.undefined): IncreaseStreamRetentionPeriodInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "RetentionPeriodHours" -> RetentionPeriodHours.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IncreaseStreamRetentionPeriodInput]
    }
  }

  @js.native
  trait InternalFailureExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information, see the returned message.</p>
   */
  @js.native
  trait InvalidArgumentExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The ciphertext references a key that doesn't exist or that you don't have access to.</p>
   */
  @js.native
  trait KMSAccessDeniedExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The request was rejected because the specified customer master key (CMK) isn't enabled.</p>
   */
  @js.native
  trait KMSDisabledExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The request was rejected because the state of the specified resource isn't valid for this request. For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
   */
  @js.native
  trait KMSInvalidStateExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The request was rejected because the specified entity or resource can't be found.</p>
   */
  @js.native
  trait KMSNotFoundExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The AWS access key ID needs a subscription for the service.</p>
   */
  @js.native
  trait KMSOptInRequiredException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The request was denied due to request throttling. For more information about throttling, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html#requests-per-second">Limits</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
   */
  @js.native
  trait KMSThrottlingExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed. </p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait ListShardsInput extends js.Object {
    var MaxResults: js.UndefOr[ListShardsInputLimit]
    var ExclusiveStartShardId: js.UndefOr[ShardId]
    var StreamCreationTimestamp: js.UndefOr[Timestamp]
    var StreamName: js.UndefOr[StreamName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListShardsInput {
    def apply(
      MaxResults: js.UndefOr[ListShardsInputLimit] = js.undefined,
      ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined,
      StreamCreationTimestamp: js.UndefOr[Timestamp] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListShardsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ExclusiveStartShardId" -> ExclusiveStartShardId.map { x => x.asInstanceOf[js.Any] },
        "StreamCreationTimestamp" -> StreamCreationTimestamp.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListShardsInput]
    }
  }

  @js.native
  trait ListShardsOutput extends js.Object {
    var Shards: js.UndefOr[ShardList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListShardsOutput {
    def apply(
      Shards: js.UndefOr[ShardList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListShardsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Shards" -> Shards.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListShardsOutput]
    }
  }

  @js.native
  trait ListStreamConsumersInput extends js.Object {
    var StreamARN: js.UndefOr[StreamARN]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[ListStreamConsumersInputLimit]
    var StreamCreationTimestamp: js.UndefOr[Timestamp]
  }

  object ListStreamConsumersInput {
    def apply(
      StreamARN: js.UndefOr[StreamARN] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[ListStreamConsumersInputLimit] = js.undefined,
      StreamCreationTimestamp: js.UndefOr[Timestamp] = js.undefined): ListStreamConsumersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Represents the input for <code>ListStreams</code>.</p>
   */
  @js.native
  trait ListStreamsInput extends js.Object {
    var Limit: js.UndefOr[ListStreamsInputLimit]
    var ExclusiveStartStreamName: js.UndefOr[StreamName]
  }

  object ListStreamsInput {
    def apply(
      Limit: js.UndefOr[ListStreamsInputLimit] = js.undefined,
      ExclusiveStartStreamName: js.UndefOr[StreamName] = js.undefined): ListStreamsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "ExclusiveStartStreamName" -> ExclusiveStartStreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsInput]
    }
  }

  /**
   * <p>Represents the output for <code>ListStreams</code>.</p>
   */
  @js.native
  trait ListStreamsOutput extends js.Object {
    var StreamNames: js.UndefOr[StreamNameList]
    var HasMoreStreams: js.UndefOr[BooleanObject]
  }

  object ListStreamsOutput {
    def apply(
      StreamNames: js.UndefOr[StreamNameList] = js.undefined,
      HasMoreStreams: js.UndefOr[BooleanObject] = js.undefined): ListStreamsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamNames" -> StreamNames.map { x => x.asInstanceOf[js.Any] },
        "HasMoreStreams" -> HasMoreStreams.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStreamsOutput]
    }
  }

  /**
   * <p>Represents the input for <code>ListTagsForStream</code>.</p>
   */
  @js.native
  trait ListTagsForStreamInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var ExclusiveStartTagKey: js.UndefOr[TagKey]
    var Limit: js.UndefOr[ListTagsForStreamInputLimit]
  }

  object ListTagsForStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      ExclusiveStartTagKey: js.UndefOr[TagKey] = js.undefined,
      Limit: js.UndefOr[ListTagsForStreamInputLimit] = js.undefined): ListTagsForStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "ExclusiveStartTagKey" -> ExclusiveStartTagKey.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForStreamInput]
    }
  }

  /**
   * <p>Represents the output for <code>ListTagsForStream</code>.</p>
   */
  @js.native
  trait ListTagsForStreamOutput extends js.Object {
    var Tags: js.UndefOr[TagList]
    var HasMoreTags: js.UndefOr[BooleanObject]
  }

  object ListTagsForStreamOutput {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined,
      HasMoreTags: js.UndefOr[BooleanObject] = js.undefined): ListTagsForStreamOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "HasMoreTags" -> HasMoreTags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForStreamOutput]
    }
  }

  /**
   * <p>Represents the input for <code>MergeShards</code>.</p>
   */
  @js.native
  trait MergeShardsInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var ShardToMerge: js.UndefOr[ShardId]
    var AdjacentShardToMerge: js.UndefOr[ShardId]
  }

  object MergeShardsInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      ShardToMerge: js.UndefOr[ShardId] = js.undefined,
      AdjacentShardToMerge: js.UndefOr[ShardId] = js.undefined): MergeShardsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "ShardToMerge" -> ShardToMerge.map { x => x.asInstanceOf[js.Any] },
        "AdjacentShardToMerge" -> AdjacentShardToMerge.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>The request rate for the stream is too high, or the requested data is too large for the available throughput. Reduce the frequency or size of your requests. For more information, see <a href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>, and <a href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html">Error Retries and Exponential Backoff in AWS</a> in the <i>AWS General Reference</i>.</p>
   */
  @js.native
  trait ProvisionedThroughputExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Represents the input for <code>PutRecord</code>.</p>
   */
  @js.native
  trait PutRecordInput extends js.Object {
    var ExplicitHashKey: js.UndefOr[HashKey]
    var PartitionKey: js.UndefOr[PartitionKey]
    var SequenceNumberForOrdering: js.UndefOr[SequenceNumber]
    var StreamName: js.UndefOr[StreamName]
    var Data: js.UndefOr[Data]
  }

  object PutRecordInput {
    def apply(
      ExplicitHashKey: js.UndefOr[HashKey] = js.undefined,
      PartitionKey: js.UndefOr[PartitionKey] = js.undefined,
      SequenceNumberForOrdering: js.UndefOr[SequenceNumber] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      Data: js.UndefOr[Data] = js.undefined): PutRecordInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExplicitHashKey" -> ExplicitHashKey.map { x => x.asInstanceOf[js.Any] },
        "PartitionKey" -> PartitionKey.map { x => x.asInstanceOf[js.Any] },
        "SequenceNumberForOrdering" -> SequenceNumberForOrdering.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "Data" -> Data.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordInput]
    }
  }

  /**
   * <p>Represents the output for <code>PutRecord</code>.</p>
   */
  @js.native
  trait PutRecordOutput extends js.Object {
    var ShardId: js.UndefOr[ShardId]
    var SequenceNumber: js.UndefOr[SequenceNumber]
    var EncryptionType: js.UndefOr[EncryptionType]
  }

  object PutRecordOutput {
    def apply(
      ShardId: js.UndefOr[ShardId] = js.undefined,
      SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined): PutRecordOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShardId" -> ShardId.map { x => x.asInstanceOf[js.Any] },
        "SequenceNumber" -> SequenceNumber.map { x => x.asInstanceOf[js.Any] },
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordOutput]
    }
  }

  /**
   * <p>A <code>PutRecords</code> request.</p>
   */
  @js.native
  trait PutRecordsInput extends js.Object {
    var Records: js.UndefOr[PutRecordsRequestEntryList]
    var StreamName: js.UndefOr[StreamName]
  }

  object PutRecordsInput {
    def apply(
      Records: js.UndefOr[PutRecordsRequestEntryList] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined): PutRecordsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Records" -> Records.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordsInput]
    }
  }

  /**
   * <p> <code>PutRecords</code> results.</p>
   */
  @js.native
  trait PutRecordsOutput extends js.Object {
    var FailedRecordCount: js.UndefOr[PositiveIntegerObject]
    var Records: js.UndefOr[PutRecordsResultEntryList]
    var EncryptionType: js.UndefOr[EncryptionType]
  }

  object PutRecordsOutput {
    def apply(
      FailedRecordCount: js.UndefOr[PositiveIntegerObject] = js.undefined,
      Records: js.UndefOr[PutRecordsResultEntryList] = js.undefined,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined): PutRecordsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRecordCount" -> FailedRecordCount.map { x => x.asInstanceOf[js.Any] },
        "Records" -> Records.map { x => x.asInstanceOf[js.Any] },
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordsOutput]
    }
  }

  /**
   * <p>Represents the output for <code>PutRecords</code>.</p>
   */
  @js.native
  trait PutRecordsRequestEntry extends js.Object {
    var Data: js.UndefOr[Data]
    var ExplicitHashKey: js.UndefOr[HashKey]
    var PartitionKey: js.UndefOr[PartitionKey]
  }

  object PutRecordsRequestEntry {
    def apply(
      Data: js.UndefOr[Data] = js.undefined,
      ExplicitHashKey: js.UndefOr[HashKey] = js.undefined,
      PartitionKey: js.UndefOr[PartitionKey] = js.undefined): PutRecordsRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Data" -> Data.map { x => x.asInstanceOf[js.Any] },
        "ExplicitHashKey" -> ExplicitHashKey.map { x => x.asInstanceOf[js.Any] },
        "PartitionKey" -> PartitionKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordsRequestEntry]
    }
  }

  /**
   * <p>Represents the result of an individual record from a <code>PutRecords</code> request. A record that is successfully added to a stream includes <code>SequenceNumber</code> and <code>ShardId</code> in the result. A record that fails to be added to the stream includes <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.</p>
   */
  @js.native
  trait PutRecordsResultEntry extends js.Object {
    var SequenceNumber: js.UndefOr[SequenceNumber]
    var ShardId: js.UndefOr[ShardId]
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  object PutRecordsResultEntry {
    def apply(
      SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      ShardId: js.UndefOr[ShardId] = js.undefined,
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined): PutRecordsResultEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SequenceNumber" -> SequenceNumber.map { x => x.asInstanceOf[js.Any] },
        "ShardId" -> ShardId.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRecordsResultEntry]
    }
  }

  /**
   * <p>The unit of data of the Kinesis data stream, which is composed of a sequence number, a partition key, and a data blob.</p>
   */
  @js.native
  trait Record extends js.Object {
    var ApproximateArrivalTimestamp: js.UndefOr[Timestamp]
    var PartitionKey: js.UndefOr[PartitionKey]
    var SequenceNumber: js.UndefOr[SequenceNumber]
    var Data: js.UndefOr[Data]
    var EncryptionType: js.UndefOr[EncryptionType]
  }

  object Record {
    def apply(
      ApproximateArrivalTimestamp: js.UndefOr[Timestamp] = js.undefined,
      PartitionKey: js.UndefOr[PartitionKey] = js.undefined,
      SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      Data: js.UndefOr[Data] = js.undefined,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined): Record = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApproximateArrivalTimestamp" -> ApproximateArrivalTimestamp.map { x => x.asInstanceOf[js.Any] },
        "PartitionKey" -> PartitionKey.map { x => x.asInstanceOf[js.Any] },
        "SequenceNumber" -> SequenceNumber.map { x => x.asInstanceOf[js.Any] },
        "Data" -> Data.map { x => x.asInstanceOf[js.Any] },
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Record]
    }
  }

  @js.native
  trait RegisterStreamConsumerInput extends js.Object {
    var StreamARN: js.UndefOr[StreamARN]
    var ConsumerName: js.UndefOr[ConsumerName]
  }

  object RegisterStreamConsumerInput {
    def apply(
      StreamARN: js.UndefOr[StreamARN] = js.undefined,
      ConsumerName: js.UndefOr[ConsumerName] = js.undefined): RegisterStreamConsumerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "ConsumerName" -> ConsumerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterStreamConsumerInput]
    }
  }

  @js.native
  trait RegisterStreamConsumerOutput extends js.Object {
    var Consumer: js.UndefOr[Consumer]
  }

  object RegisterStreamConsumerOutput {
    def apply(
      Consumer: js.UndefOr[Consumer] = js.undefined): RegisterStreamConsumerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Consumer" -> Consumer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterStreamConsumerOutput]
    }
  }

  /**
   * <p>Represents the input for <code>RemoveTagsFromStream</code>.</p>
   */
  @js.native
  trait RemoveTagsFromStreamInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object RemoveTagsFromStreamInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): RemoveTagsFromStreamInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromStreamInput]
    }
  }

  /**
   * <p>The resource is not available for this operation. For successful operation, the resource must be in the <code>ACTIVE</code> state.</p>
   */
  @js.native
  trait ResourceInUseExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The requested resource could not be found. The stream might not be specified correctly.</p>
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
   * <p>The range of possible sequence numbers for the shard.</p>
   */
  @js.native
  trait SequenceNumberRange extends js.Object {
    var StartingSequenceNumber: js.UndefOr[SequenceNumber]
    var EndingSequenceNumber: js.UndefOr[SequenceNumber]
  }

  object SequenceNumberRange {
    def apply(
      StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined): SequenceNumberRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartingSequenceNumber" -> StartingSequenceNumber.map { x => x.asInstanceOf[js.Any] },
        "EndingSequenceNumber" -> EndingSequenceNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SequenceNumberRange]
    }
  }

  /**
   * <p>A uniquely identified group of data records in a Kinesis data stream.</p>
   */
  @js.native
  trait Shard extends js.Object {
    var ParentShardId: js.UndefOr[ShardId]
    var AdjacentParentShardId: js.UndefOr[ShardId]
    var HashKeyRange: js.UndefOr[HashKeyRange]
    var SequenceNumberRange: js.UndefOr[SequenceNumberRange]
    var ShardId: js.UndefOr[ShardId]
  }

  object Shard {
    def apply(
      ParentShardId: js.UndefOr[ShardId] = js.undefined,
      AdjacentParentShardId: js.UndefOr[ShardId] = js.undefined,
      HashKeyRange: js.UndefOr[HashKeyRange] = js.undefined,
      SequenceNumberRange: js.UndefOr[SequenceNumberRange] = js.undefined,
      ShardId: js.UndefOr[ShardId] = js.undefined): Shard = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentShardId" -> ParentShardId.map { x => x.asInstanceOf[js.Any] },
        "AdjacentParentShardId" -> AdjacentParentShardId.map { x => x.asInstanceOf[js.Any] },
        "HashKeyRange" -> HashKeyRange.map { x => x.asInstanceOf[js.Any] },
        "SequenceNumberRange" -> SequenceNumberRange.map { x => x.asInstanceOf[js.Any] },
        "ShardId" -> ShardId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents the input for <code>SplitShard</code>.</p>
   */
  @js.native
  trait SplitShardInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var ShardToSplit: js.UndefOr[ShardId]
    var NewStartingHashKey: js.UndefOr[HashKey]
  }

  object SplitShardInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      ShardToSplit: js.UndefOr[ShardId] = js.undefined,
      NewStartingHashKey: js.UndefOr[HashKey] = js.undefined): SplitShardInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "ShardToSplit" -> ShardToSplit.map { x => x.asInstanceOf[js.Any] },
        "NewStartingHashKey" -> NewStartingHashKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SplitShardInput]
    }
  }

  @js.native
  trait StartStreamEncryptionInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var EncryptionType: js.UndefOr[EncryptionType]
    var KeyId: js.UndefOr[KeyId]
  }

  object StartStreamEncryptionInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined,
      KeyId: js.UndefOr[KeyId] = js.undefined): StartStreamEncryptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartStreamEncryptionInput]
    }
  }

  @js.native
  trait StartingPosition extends js.Object {
    var Type: js.UndefOr[ShardIteratorType]
    var SequenceNumber: js.UndefOr[SequenceNumber]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object StartingPosition {
    def apply(
      Type: js.UndefOr[ShardIteratorType] = js.undefined,
      SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined): StartingPosition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "SequenceNumber" -> SequenceNumber.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartingPosition]
    }
  }

  @js.native
  trait StopStreamEncryptionInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var EncryptionType: js.UndefOr[EncryptionType]
    var KeyId: js.UndefOr[KeyId]
  }

  object StopStreamEncryptionInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined,
      KeyId: js.UndefOr[KeyId] = js.undefined): StopStreamEncryptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopStreamEncryptionInput]
    }
  }

  /**
   * <p>Represents the output for <a>DescribeStream</a>.</p>
   */
  @js.native
  trait StreamDescription extends js.Object {
    var StreamARN: js.UndefOr[StreamARN]
    var StreamCreationTimestamp: js.UndefOr[Timestamp]
    var RetentionPeriodHours: js.UndefOr[RetentionPeriodHours]
    var StreamStatus: js.UndefOr[StreamStatus]
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoringList]
    var KeyId: js.UndefOr[KeyId]
    var StreamName: js.UndefOr[StreamName]
    var HasMoreShards: js.UndefOr[BooleanObject]
    var Shards: js.UndefOr[ShardList]
    var EncryptionType: js.UndefOr[EncryptionType]
  }

  object StreamDescription {
    def apply(
      StreamARN: js.UndefOr[StreamARN] = js.undefined,
      StreamCreationTimestamp: js.UndefOr[Timestamp] = js.undefined,
      RetentionPeriodHours: js.UndefOr[RetentionPeriodHours] = js.undefined,
      StreamStatus: js.UndefOr[StreamStatus] = js.undefined,
      EnhancedMonitoring: js.UndefOr[EnhancedMonitoringList] = js.undefined,
      KeyId: js.UndefOr[KeyId] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      HasMoreShards: js.UndefOr[BooleanObject] = js.undefined,
      Shards: js.UndefOr[ShardList] = js.undefined,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined): StreamDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "StreamCreationTimestamp" -> StreamCreationTimestamp.map { x => x.asInstanceOf[js.Any] },
        "RetentionPeriodHours" -> RetentionPeriodHours.map { x => x.asInstanceOf[js.Any] },
        "StreamStatus" -> StreamStatus.map { x => x.asInstanceOf[js.Any] },
        "EnhancedMonitoring" -> EnhancedMonitoring.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "HasMoreShards" -> HasMoreShards.map { x => x.asInstanceOf[js.Any] },
        "Shards" -> Shards.map { x => x.asInstanceOf[js.Any] },
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StreamDescription]
    }
  }

  /**
   * <p>Represents the output for <a>DescribeStreamSummary</a> </p>
   */
  @js.native
  trait StreamDescriptionSummary extends js.Object {
    var StreamARN: js.UndefOr[StreamARN]
    var ConsumerCount: js.UndefOr[ConsumerCountObject]
    var StreamCreationTimestamp: js.UndefOr[Timestamp]
    var RetentionPeriodHours: js.UndefOr[PositiveIntegerObject]
    var StreamStatus: js.UndefOr[StreamStatus]
    var OpenShardCount: js.UndefOr[ShardCountObject]
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoringList]
    var KeyId: js.UndefOr[KeyId]
    var StreamName: js.UndefOr[StreamName]
    var EncryptionType: js.UndefOr[EncryptionType]
  }

  object StreamDescriptionSummary {
    def apply(
      StreamARN: js.UndefOr[StreamARN] = js.undefined,
      ConsumerCount: js.UndefOr[ConsumerCountObject] = js.undefined,
      StreamCreationTimestamp: js.UndefOr[Timestamp] = js.undefined,
      RetentionPeriodHours: js.UndefOr[PositiveIntegerObject] = js.undefined,
      StreamStatus: js.UndefOr[StreamStatus] = js.undefined,
      OpenShardCount: js.UndefOr[ShardCountObject] = js.undefined,
      EnhancedMonitoring: js.UndefOr[EnhancedMonitoringList] = js.undefined,
      KeyId: js.UndefOr[KeyId] = js.undefined,
      StreamName: js.UndefOr[StreamName] = js.undefined,
      EncryptionType: js.UndefOr[EncryptionType] = js.undefined): StreamDescriptionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamARN" -> StreamARN.map { x => x.asInstanceOf[js.Any] },
        "ConsumerCount" -> ConsumerCount.map { x => x.asInstanceOf[js.Any] },
        "StreamCreationTimestamp" -> StreamCreationTimestamp.map { x => x.asInstanceOf[js.Any] },
        "RetentionPeriodHours" -> RetentionPeriodHours.map { x => x.asInstanceOf[js.Any] },
        "StreamStatus" -> StreamStatus.map { x => x.asInstanceOf[js.Any] },
        "OpenShardCount" -> OpenShardCount.map { x => x.asInstanceOf[js.Any] },
        "EnhancedMonitoring" -> EnhancedMonitoring.map { x => x.asInstanceOf[js.Any] },
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "EncryptionType" -> EncryptionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer. </p>
   */
  @js.native
  trait SubscribeToShardEvent extends js.Object {
    var Records: js.UndefOr[RecordList]
    var ContinuationSequenceNumber: js.UndefOr[SequenceNumber]
    var MillisBehindLatest: js.UndefOr[MillisBehindLatest]
  }

  object SubscribeToShardEvent {
    def apply(
      Records: js.UndefOr[RecordList] = js.undefined,
      ContinuationSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined,
      MillisBehindLatest: js.UndefOr[MillisBehindLatest] = js.undefined): SubscribeToShardEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Records" -> Records.map { x => x.asInstanceOf[js.Any] },
        "ContinuationSequenceNumber" -> ContinuationSequenceNumber.map { x => x.asInstanceOf[js.Any] },
        "MillisBehindLatest" -> MillisBehindLatest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeToShardEvent]
    }
  }

  @js.native
  trait SubscribeToShardEventStream extends js.Object {
    var SubscribeToShardEvent: js.UndefOr[SubscribeToShardEvent]
  }

  object SubscribeToShardEventStream {
    def apply(
      SubscribeToShardEvent: js.UndefOr[SubscribeToShardEvent] = js.undefined): SubscribeToShardEventStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscribeToShardEvent" -> SubscribeToShardEvent.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeToShardEventStream]
    }
  }

  @js.native
  trait SubscribeToShardInput extends js.Object {
    var ConsumerARN: js.UndefOr[ConsumerARN]
    var ShardId: js.UndefOr[ShardId]
    var StartingPosition: js.UndefOr[StartingPosition]
  }

  object SubscribeToShardInput {
    def apply(
      ConsumerARN: js.UndefOr[ConsumerARN] = js.undefined,
      ShardId: js.UndefOr[ShardId] = js.undefined,
      StartingPosition: js.UndefOr[StartingPosition] = js.undefined): SubscribeToShardInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumerARN" -> ConsumerARN.map { x => x.asInstanceOf[js.Any] },
        "ShardId" -> ShardId.map { x => x.asInstanceOf[js.Any] },
        "StartingPosition" -> StartingPosition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeToShardInput]
    }
  }

  @js.native
  trait SubscribeToShardOutput extends js.Object {
    var EventStream: js.UndefOr[SubscribeToShardEventStream]
  }

  object SubscribeToShardOutput {
    def apply(
      EventStream: js.UndefOr[SubscribeToShardEventStream] = js.undefined): SubscribeToShardOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventStream" -> EventStream.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeToShardOutput]
    }
  }

  /**
   * <p>Metadata assigned to the stream, consisting of a key-value pair.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait UpdateShardCountInput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var TargetShardCount: js.UndefOr[PositiveIntegerObject]
    var ScalingType: js.UndefOr[ScalingType]
  }

  object UpdateShardCountInput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined,
      ScalingType: js.UndefOr[ScalingType] = js.undefined): UpdateShardCountInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "TargetShardCount" -> TargetShardCount.map { x => x.asInstanceOf[js.Any] },
        "ScalingType" -> ScalingType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateShardCountInput]
    }
  }

  @js.native
  trait UpdateShardCountOutput extends js.Object {
    var StreamName: js.UndefOr[StreamName]
    var CurrentShardCount: js.UndefOr[PositiveIntegerObject]
    var TargetShardCount: js.UndefOr[PositiveIntegerObject]
  }

  object UpdateShardCountOutput {
    def apply(
      StreamName: js.UndefOr[StreamName] = js.undefined,
      CurrentShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined,
      TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined): UpdateShardCountOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] },
        "CurrentShardCount" -> CurrentShardCount.map { x => x.asInstanceOf[js.Any] },
        "TargetShardCount" -> TargetShardCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateShardCountOutput]
    }
  }
}
